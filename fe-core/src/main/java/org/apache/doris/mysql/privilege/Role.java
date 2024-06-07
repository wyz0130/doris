// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.apache.doris.mysql.privilege;

import org.apache.doris.analysis.ResourcePattern;
import org.apache.doris.analysis.TablePattern;
import org.apache.doris.analysis.UserIdentity;
import org.apache.doris.analysis.WorkloadGroupPattern;
import org.apache.doris.catalog.Env;
import org.apache.doris.cluster.ClusterNamespace;
import org.apache.doris.common.AnalysisException;
import org.apache.doris.common.DdlException;
import org.apache.doris.common.FeMetaVersion;
import org.apache.doris.common.PatternMatcherException;
import org.apache.doris.common.io.Text;
import org.apache.doris.common.io.Writable;
import org.apache.doris.mysql.privilege.Auth.PrivLevel;
import org.apache.doris.persist.gson.GsonPostProcessable;
import org.apache.doris.persist.gson.GsonUtils;
import org.apache.doris.resource.workloadgroup.WorkloadGroupMgr;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.collections.CollectionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Role implements Writable, GsonPostProcessable {
    private static final Logger LOG = LogManager.getLogger(Role.class);

    // operator is responsible for operating cluster, such as add/drop node
    public static String OPERATOR_ROLE = "operator";
    // admin is like DBA, who has all privileges except for NODE privilege held by operator
    public static String ADMIN_ROLE = "admin";

    public static Role OPERATOR;
    public static Role ADMIN;

    static {
        try {
            // Global privileges do not distinguish Pattern, global admin and node privileges contain all privileges
            // and do not need repeated authorization.
            OPERATOR = new Role(OPERATOR_ROLE,
                    TablePattern.ALL, PrivBitSet.of(Privilege.NODE_PRIV, Privilege.ADMIN_PRIV));
            ADMIN = new Role(ADMIN_ROLE,
                    TablePattern.ALL, PrivBitSet.of(Privilege.ADMIN_PRIV));
        } catch (DdlException e) {
            LOG.warn("Initialize operator and admin role error.", e);
        }
    }

    @SerializedName(value = "roleName")
    private String roleName;

    @SerializedName(value = "comment")
    private String comment;
    // Will be persisted
    @SerializedName(value = "tblPatternToPrivs")
    private Map<TablePattern, PrivBitSet> tblPatternToPrivs = Maps.newConcurrentMap();
    @SerializedName(value = "resourcePatternToPrivs")
    private Map<ResourcePattern, PrivBitSet> resourcePatternToPrivs = Maps.newConcurrentMap();
    @SerializedName(value = "workloadGroupPatternToPrivs")
    private Map<WorkloadGroupPattern, PrivBitSet> workloadGroupPatternToPrivs = Maps.newConcurrentMap();
    @SerializedName(value = "colPrivMap")
    private Map<ColPrivilegeKey, Set<String>> colPrivMap = Maps.newHashMap();

    // Will not be persisted, generated by tblPatternToPrivs and resourcePatternToPrivs
    private GlobalPrivTable globalPrivTable = new GlobalPrivTable();
    private CatalogPrivTable catalogPrivTable = new CatalogPrivTable();
    private DbPrivTable dbPrivTable = new DbPrivTable();
    private TablePrivTable tablePrivTable = new TablePrivTable();
    private ResourcePrivTable resourcePrivTable = new ResourcePrivTable();
    private WorkloadGroupPrivTable workloadGroupPrivTable = new WorkloadGroupPrivTable();


    @Deprecated
    private Set<UserIdentity> users = Sets.newConcurrentHashSet();

    @Deprecated
    public Set<UserIdentity> getUsers() {
        return users;
    }

    private Role() {

    }

    public Role(String roleName) {
        this(roleName, "");
    }

    public Role(String roleName, String comment) {
        this.roleName = roleName;
        this.comment = comment;
    }

    public Role(String roleName, TablePattern tablePattern, PrivBitSet privs) throws DdlException {
        this.roleName = roleName;
        this.tblPatternToPrivs.put(tablePattern, privs);
        grantPrivs(tablePattern, privs.copy());
    }

    public Role(String roleName, TablePattern tablePattern, PrivBitSet privs,
            Map<ColPrivilegeKey, Set<String>> colPrivileges) throws DdlException {
        this.roleName = roleName;
        this.tblPatternToPrivs.put(tablePattern, privs);
        grantPrivs(tablePattern, privs.copy());
        grantCols(colPrivileges);
    }

    public Role(String roleName, ResourcePattern resourcePattern, PrivBitSet privs) throws DdlException {
        this.roleName = roleName;
        this.resourcePatternToPrivs.put(resourcePattern, privs);
        grantPrivs(resourcePattern, privs.copy());
    }

    public Role(String roleName, WorkloadGroupPattern workloadGroupPattern, PrivBitSet privs) throws DdlException {
        this.roleName = roleName;
        this.workloadGroupPatternToPrivs.put(workloadGroupPattern, privs);
        grantPrivs(workloadGroupPattern, privs.copy());
    }

    public Role(String roleName, List<TablePattern> tablePatterns, PrivBitSet tablePrivs,
            WorkloadGroupPattern workloadGroupPattern, PrivBitSet workloadGroupPrivs) {
        this.roleName = roleName;
        this.workloadGroupPatternToPrivs.put(workloadGroupPattern, workloadGroupPrivs);
        tablePatterns.forEach(tablePattern -> {
            // for init admin role,will not generate exception
            try {
                this.tblPatternToPrivs.put(tablePattern, tablePrivs);
                grantPrivs(tablePattern, tablePrivs.copy());
            } catch (DdlException e) {
                LOG.warn("grant table failed,", e);
            }
        });
        try {
            grantPrivs(workloadGroupPattern, workloadGroupPrivs.copy());
        } catch (DdlException e) {
            LOG.warn("grant workload group failed,", e);
        }
    }

    public static boolean isDefaultRoleName(String roleName) {
        return roleName.startsWith(RoleManager.DEFAULT_ROLE_PREFIX);
    }

    public String getRoleName() {
        return roleName;
    }

    public Map<TablePattern, PrivBitSet> getTblPatternToPrivs() {
        return tblPatternToPrivs;
    }

    public Map<ResourcePattern, PrivBitSet> getResourcePatternToPrivs() {
        return resourcePatternToPrivs;
    }

    public Map<WorkloadGroupPattern, PrivBitSet> getWorkloadGroupPatternToPrivs() {
        return workloadGroupPatternToPrivs;
    }

    // merge role not check role name.
    public void mergeNotCheck(Role other) throws DdlException {
        for (Map.Entry<TablePattern, PrivBitSet> entry : other.getTblPatternToPrivs().entrySet()) {
            if (tblPatternToPrivs.containsKey(entry.getKey())) {
                PrivBitSet existPrivs = tblPatternToPrivs.get(entry.getKey());
                existPrivs.or(entry.getValue());
            } else {
                tblPatternToPrivs.put(entry.getKey(), entry.getValue());
            }
            grantPrivs(entry.getKey(), entry.getValue().copy());
        }
        for (Map.Entry<ResourcePattern, PrivBitSet> entry : other.resourcePatternToPrivs.entrySet()) {
            if (resourcePatternToPrivs.containsKey(entry.getKey())) {
                PrivBitSet existPrivs = resourcePatternToPrivs.get(entry.getKey());
                existPrivs.or(entry.getValue());
            } else {
                resourcePatternToPrivs.put(entry.getKey(), entry.getValue());
            }
            grantPrivs(entry.getKey(), entry.getValue().copy());
        }
        for (Map.Entry<WorkloadGroupPattern, PrivBitSet> entry : other.workloadGroupPatternToPrivs.entrySet()) {
            if (workloadGroupPatternToPrivs.containsKey(entry.getKey())) {
                PrivBitSet existPrivs = workloadGroupPatternToPrivs.get(entry.getKey());
                existPrivs.or(entry.getValue());
            } else {
                workloadGroupPatternToPrivs.put(entry.getKey(), entry.getValue());
            }
            grantPrivs(entry.getKey(), entry.getValue().copy());
        }
        mergeColPrivMap(colPrivMap, other.colPrivMap);
    }

    public static void mergeColPrivMap(Map<ColPrivilegeKey, Set<String>> toColPrivMap,
            Map<ColPrivilegeKey, Set<String>> fromColPrivMap) {
        for (Entry<ColPrivilegeKey, Set<String>> entry : fromColPrivMap.entrySet()) {
            if (toColPrivMap.containsKey(entry.getKey())) {
                toColPrivMap.get(entry.getKey()).addAll(entry.getValue());
            } else {
                toColPrivMap.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void merge(Role other) throws DdlException {
        Preconditions.checkState(roleName.equalsIgnoreCase(other.getRoleName()));
        mergeNotCheck(other);
    }

    public boolean checkGlobalPriv(PrivPredicate wanted) {
        PrivBitSet savedPrivs = PrivBitSet.of();
        return checkGlobalInternal(wanted, savedPrivs);
    }

    public boolean checkCtlPriv(String ctl, PrivPredicate wanted) {
        PrivBitSet savedPrivs = PrivBitSet.of();
        if (checkGlobalInternal(wanted, savedPrivs)
                || checkCatalogInternal(ctl, wanted, savedPrivs)) {
            return true;
        }
        // if user has any privs of databases or tables in this catalog, and the wanted priv is SHOW, return true
        if (ctl != null && wanted == PrivPredicate.SHOW && checkAnyPrivWithinCatalog(ctl)) {
            return true;
        }
        if (LOG.isDebugEnabled()) {
            LOG.debug("failed to get wanted privs: {}, granted: {}", wanted, savedPrivs);
        }
        return false;
    }

    private boolean checkGlobalInternal(PrivPredicate wanted, PrivBitSet savedPrivs) {
        globalPrivTable.getPrivs(savedPrivs);
        if (Privilege.satisfy(savedPrivs, wanted)) {
            return true;
        }
        return false;
    }

    /*
     * User may not have privs on a catalog, but have privs of databases or tables in this catalog.
     * So we have to check if user has any privs of databases or tables in this catalog.
     * if so, the catalog should be visible to this user.
     */
    private boolean checkAnyPrivWithinCatalog(String ctl) {
        return dbPrivTable.hasPrivsOfCatalog(ctl)
                || tablePrivTable.hasPrivsOfCatalog(ctl)
                || checkAnyColPrivWithinCtl(ctl);

    }

    private boolean checkCatalogInternal(String ctl, PrivPredicate wanted, PrivBitSet savedPrivs) {
        catalogPrivTable.getPrivs(ctl, savedPrivs);
        if (Privilege.satisfy(savedPrivs, wanted)) {
            return true;
        }

        return false;
    }

    public boolean checkDbPriv(String ctl, String db, PrivPredicate wanted) {
        PrivBitSet savedPrivs = PrivBitSet.of();
        if (checkGlobalInternal(wanted, savedPrivs)
                || checkCatalogInternal(ctl, wanted, savedPrivs)
                || checkDbInternal(ctl, db, wanted, savedPrivs)) {
            return true;
        }

        // if user has any privs of table in this db, and the wanted priv is SHOW, return true
        if (ctl != null && db != null && wanted == PrivPredicate.SHOW && checkAnyPrivWithinDb(ctl, db)) {
            return true;
        }

        if (LOG.isDebugEnabled()) {
            LOG.debug("failed to get wanted privs: {}, granted: {}", wanted, savedPrivs);
        }
        return false;
    }

    /*
     * User may not have privs on a database, but have privs of tables in this database.
     * So we have to check if user has any privs of tables in this database.
     * if so, the database should be visible to this user.
     */
    private boolean checkAnyPrivWithinDb(String ctl, String db) {
        return tablePrivTable.hasPrivsOfDb(ctl, db) || checkAnyColPrivWithinDb(ctl, db);

    }

    private boolean checkAnyColPrivWithinCtl(String ctl) {
        ctl = ClusterNamespace.getNameFromFullName(ctl);
        for (ColPrivilegeKey colPrivilegeKey : colPrivMap.keySet()) {
            if (colPrivilegeKey.getCtl().equals(ctl)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkAnyColPrivWithinDb(String ctl, String db) {
        ctl = ClusterNamespace.getNameFromFullName(ctl);
        db = ClusterNamespace.getNameFromFullName(db);
        for (ColPrivilegeKey colPrivilegeKey : colPrivMap.keySet()) {
            if (colPrivilegeKey.getCtl().equals(ctl) && colPrivilegeKey.getDb().equals(db)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkAnyColPrivWithinTbl(String ctl, String db, String tbl) {
        ctl = ClusterNamespace.getNameFromFullName(ctl);
        db = ClusterNamespace.getNameFromFullName(db);
        tbl = ClusterNamespace.getNameFromFullName(tbl);
        for (ColPrivilegeKey colPrivilegeKey : colPrivMap.keySet()) {
            if (colPrivilegeKey.getCtl().equals(ctl) && colPrivilegeKey.getDb().equals(db) && colPrivilegeKey
                    .getTbl().equals(tbl)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDbInternal(String ctl, String db, PrivPredicate wanted,
            PrivBitSet savedPrivs) {
        dbPrivTable.getPrivs(ctl, db, savedPrivs);
        if (Privilege.satisfy(savedPrivs, wanted)) {
            return true;
        }
        return false;
    }

    public boolean checkTblPriv(String ctl, String db, String tbl, PrivPredicate wanted) {
        PrivBitSet savedPrivs = PrivBitSet.of();
        if (checkGlobalInternal(wanted, savedPrivs)
                || checkCatalogInternal(ctl, wanted, savedPrivs)
                || checkDbInternal(ctl, db, wanted, savedPrivs)
                || checkTblInternal(ctl, db, tbl, wanted, savedPrivs)) {
            return true;
        }

        // if user has any privs of col in this table, and the wanted priv is SHOW, return true
        if (ctl != null && db != null && tbl != null && wanted == PrivPredicate.SHOW && checkAnyColPrivWithinTbl(ctl,
                db, tbl)) {
            return true;
        }

        if (LOG.isDebugEnabled()) {
            LOG.debug("failed to get wanted privs: {}, granted: {}", wanted, savedPrivs);
        }
        return false;
    }

    public boolean checkColPriv(String ctl, String db, String tbl, String col, PrivPredicate wanted) {
        Optional<Privilege> colPrivilege = wanted.getColPrivilege();
        if (!colPrivilege.isPresent()) {
            throw new IllegalStateException("this privPredicate should not use checkColPriv:" + wanted);
        }
        return checkTblPriv(ctl, db, tbl, wanted) || onlyCheckColPriv(ctl, db, tbl, col, colPrivilege.get());
    }

    private boolean onlyCheckColPriv(String ctl, String db, String tbl, String col,
            Privilege colPrivilege) {
        ColPrivilegeKey colPrivilegeKey = new ColPrivilegeKey(colPrivilege, ctl, db, tbl);
        if (colPrivMap.containsKey(colPrivilegeKey)) {
            return colPrivMap.get(colPrivilegeKey).contains(col);
        }
        return false;
    }

    private boolean checkTblInternal(String ctl, String db, String tbl, PrivPredicate wanted, PrivBitSet savedPrivs) {
        tablePrivTable.getPrivs(ctl, db, tbl, savedPrivs);
        return Privilege.satisfy(savedPrivs, wanted);
    }

    public boolean checkResourcePriv(String resourceName, PrivPredicate wanted) {
        PrivBitSet savedPrivs = PrivBitSet.of();
        if (checkGlobalInternal(wanted, savedPrivs)
                || checkResourceInternal(resourceName, wanted, savedPrivs)) {
            return true;
        }

        if (LOG.isDebugEnabled()) {
            LOG.debug("failed to get wanted privs: {}, granted: {}", wanted, savedPrivs);
        }
        return false;
    }

    private boolean checkResourceInternal(String resourceName, PrivPredicate wanted, PrivBitSet savedPrivs) {
        resourcePrivTable.getPrivs(resourceName, savedPrivs);
        return Privilege.satisfy(savedPrivs, wanted);
    }

    public boolean checkWorkloadGroupPriv(String workloadGroupName, PrivPredicate wanted) {
        // For compatibility with older versions, it is not needed to check the privileges of the default group.
        if (WorkloadGroupMgr.DEFAULT_GROUP_NAME.equals(workloadGroupName)) {
            return true;
        }
        PrivBitSet savedPrivs = PrivBitSet.of();
        // usage priv not in global, but grant_priv may in global
        if (checkGlobalInternal(wanted, savedPrivs)
                || checkWorkloadGroupInternal(workloadGroupName, wanted, savedPrivs)) {
            return true;
        }

        if (LOG.isDebugEnabled()) {
            LOG.debug("failed to get wanted privs: {}, granted: {}", wanted, savedPrivs);
        }
        return false;
    }

    private boolean checkWorkloadGroupInternal(String workloadGroupName, PrivPredicate wanted, PrivBitSet savedPrivs) {
        workloadGroupPrivTable.getPrivs(workloadGroupName, savedPrivs);
        return Privilege.satisfy(savedPrivs, wanted);
    }

    public boolean checkHasPriv(PrivPredicate priv, PrivLevel[] levels) {
        for (PrivLevel privLevel : levels) {
            switch (privLevel) {
                case GLOBAL:
                    if (globalPrivTable.hasPriv(priv)) {
                        return true;
                    }
                    break;
                case DATABASE:
                    if (dbPrivTable.hasPriv(priv)) {
                        return true;
                    }
                    break;
                case TABLE:
                    if (tablePrivTable.hasPriv(priv)) {
                        return true;
                    }
                    break;
                default:
                    break;
            }
        }
        return false;
    }

    public GlobalPrivTable getGlobalPrivTable() {
        return globalPrivTable;
    }

    public CatalogPrivTable getCatalogPrivTable() {
        return catalogPrivTable;
    }

    public DbPrivTable getDbPrivTable() {
        return dbPrivTable;
    }

    public TablePrivTable getTablePrivTable() {
        return tablePrivTable;
    }

    public Map<ColPrivilegeKey, Set<String>> getColPrivMap() {
        return colPrivMap;
    }

    public ResourcePrivTable getResourcePrivTable() {
        return resourcePrivTable;
    }

    public WorkloadGroupPrivTable getWorkloadGroupPrivTable() {
        return workloadGroupPrivTable;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean checkCanEnterCluster(String clusterName) {
        if (checkGlobalPriv(PrivPredicate.ALL)) {
            return true;
        }

        if (dbPrivTable.hasClusterPriv(clusterName)) {
            return true;
        }

        if (tablePrivTable.hasClusterPriv(clusterName)) {
            return true;
        }
        return false;
    }


    private void grantPrivs(ResourcePattern resourcePattern, PrivBitSet privs) throws DdlException {
        if (privs.isEmpty()) {
            return;
        }
        grantResourcePrivs(resourcePattern.getResourceName(), privs);
    }

    private void grantPrivs(WorkloadGroupPattern workloadGroupPattern, PrivBitSet privs) throws DdlException {
        if (privs.isEmpty()) {
            return;
        }
        if (workloadGroupPattern.getPrivLevel().equals(PrivLevel.WORKLOAD_GROUP)) {
            grantWorkloadGroupPrivs(workloadGroupPattern.getworkloadGroupName(), privs);
        }
    }

    private void grantCols(Map<ColPrivilegeKey, Set<String>> colPrivileges) {
        if (Objects.isNull(colPrivileges)) {
            return;
        }
        for (Entry<ColPrivilegeKey, Set<String>> entry : colPrivileges.entrySet()) {
            if (colPrivMap.containsKey(entry.getKey())) {
                colPrivMap.get(entry.getKey()).addAll(entry.getValue());
            } else {
                colPrivMap.put(entry.getKey(), Sets.newHashSet(entry.getValue()));
            }
        }
    }

    private void grantPrivs(TablePattern tblPattern, PrivBitSet privs) throws DdlException {
        if (privs.isEmpty()) {
            return;
        }
        // grant privs to user
        switch (tblPattern.getPrivLevel()) {
            case GLOBAL:
                grantGlobalPrivs(privs);
                break;
            case CATALOG:
                grantCatalogPrivs(tblPattern.getQualifiedCtl(),
                        privs);
                break;
            case DATABASE:
                grantDbPrivs(tblPattern.getQualifiedCtl(),
                        tblPattern.getQualifiedDb(),
                        privs);
                break;
            case TABLE:
                grantTblPrivs(tblPattern.getQualifiedCtl(),
                        tblPattern.getQualifiedDb(),
                        tblPattern.getTbl(),
                        privs);
                break;
            default:
                Preconditions.checkNotNull(null, tblPattern.getPrivLevel());
        }

    }

    private GlobalPrivEntry grantGlobalPrivs(PrivBitSet privs) throws DdlException {
        GlobalPrivEntry entry = GlobalPrivEntry.create(privs);
        globalPrivTable.addEntry(entry, false, false);
        return entry;
    }

    private void grantResourcePrivs(String resourceName, PrivBitSet privs) throws DdlException {
        ResourcePrivEntry entry;
        try {
            entry = ResourcePrivEntry.create(resourceName, privs);
        } catch (AnalysisException | PatternMatcherException e) {
            throw new DdlException(e.getMessage());
        }
        resourcePrivTable.addEntry(entry, false, false);
    }

    private void grantCatalogPrivs(String ctl, PrivBitSet privs) throws DdlException {
        CatalogPrivEntry entry;
        try {
            entry = CatalogPrivEntry.create(ctl, privs);
        } catch (AnalysisException e) {
            throw new DdlException(e.getMessage());
        }
        catalogPrivTable.addEntry(entry, false, false);
    }

    private void grantDbPrivs(String ctl, String db,
            PrivBitSet privs) throws DdlException {
        DbPrivEntry entry;
        try {
            entry = DbPrivEntry.create(ctl, db, privs);
        } catch (AnalysisException e) {
            throw new DdlException(e.getMessage());
        }
        dbPrivTable.addEntry(entry, false, false);
    }

    private void grantTblPrivs(String ctl, String db, String tbl, PrivBitSet privs) throws DdlException {
        TablePrivEntry entry;
        try {
            entry = TablePrivEntry.create(ctl, db, tbl, privs);
        } catch (AnalysisException e) {
            throw new DdlException(e.getMessage());
        }
        tablePrivTable.addEntry(entry, false, false);
    }

    private void grantWorkloadGroupPrivs(String workloadGroupName, PrivBitSet privs) throws DdlException {
        WorkloadGroupPrivEntry entry;
        try {
            entry = WorkloadGroupPrivEntry.create(workloadGroupName, privs);
        } catch (AnalysisException | PatternMatcherException e) {
            throw new DdlException(e.getMessage());
        }
        workloadGroupPrivTable.addEntry(entry, false, false);
    }

    public void revokePrivs(TablePattern tblPattern, PrivBitSet privs, Map<ColPrivilegeKey, Set<String>> colPrivileges,
            boolean errOnNonExist)
            throws DdlException {
        if (!colPrivileges.isEmpty()) {
            revokeCols(colPrivileges);
        } else {
            PrivBitSet existingPriv = tblPatternToPrivs.get(tblPattern);
            if (existingPriv == null) {
                if (errOnNonExist) {
                    throw new DdlException(tblPattern + " does not exist in role " + roleName);
                }
                return;
            }
            existingPriv.remove(privs);
            if (existingPriv.isEmpty()) {
                tblPatternToPrivs.remove(tblPattern);
            }
            revokePrivs(tblPattern, privs);
        }
    }

    private void revokeCols(Map<ColPrivilegeKey, Set<String>> colPrivileges) {
        if (Objects.isNull(colPrivileges)) {
            return;
        }
        for (Entry<ColPrivilegeKey, Set<String>> entry : colPrivileges.entrySet()) {
            if (colPrivMap.containsKey(entry.getKey())) {
                colPrivMap.get(entry.getKey()).removeAll(entry.getValue());
                if (CollectionUtils.isEmpty(colPrivMap.get(entry.getKey()))) {
                    colPrivMap.remove(entry.getKey());
                    TablePattern tblPattern = new TablePattern(entry.getKey().getCtl(), entry.getKey().getDb(),
                            entry.getKey().getTbl());
                    PrivBitSet existingPriv = tblPatternToPrivs.get(tblPattern);
                    if (existingPriv != null && existingPriv.isEmpty()) {
                        tblPatternToPrivs.remove(tblPattern);
                    }
                }
            }
        }
    }

    public void revokePrivs(ResourcePattern resourcePattern, PrivBitSet privs, boolean errOnNonExist)
            throws DdlException {
        PrivBitSet existingPriv = resourcePatternToPrivs.get(resourcePattern);
        if (existingPriv == null) {
            if (errOnNonExist) {
                throw new DdlException(resourcePattern + " does not exist in role " + roleName);
            }
            return;
        }
        existingPriv.remove(privs);
        revokePrivs(resourcePattern, privs);
    }

    private void revokePrivs(ResourcePattern resourcePattern, PrivBitSet privs) throws DdlException {
        switch (resourcePattern.getPrivLevel()) { // CHECKSTYLE IGNORE THIS LINE: missing switch default
            case GLOBAL:
                revokeGlobalPrivs(privs);
                break;
            case RESOURCE:
                revokeResourcePrivs(resourcePattern.getResourceName(), privs);
                break;
        }
    }

    private void revokeResourcePrivs(String resourceName, PrivBitSet privs) throws DdlException {
        ResourcePrivEntry entry;
        try {
            entry = ResourcePrivEntry.create(resourceName, privs);
        } catch (AnalysisException | PatternMatcherException e) {
            throw new DdlException(e.getMessage());
        }
        resourcePrivTable.revoke(entry, false, true);
    }

    public void revokePrivs(WorkloadGroupPattern workloadGroupPattern, PrivBitSet privs, boolean errOnNonExist)
            throws DdlException {
        PrivBitSet existingPriv = workloadGroupPatternToPrivs.get(workloadGroupPattern);
        if (existingPriv == null) {
            if (errOnNonExist) {
                throw new DdlException(workloadGroupPattern + " does not exist in role " + roleName);
            }
            return;
        }
        existingPriv.remove(privs);
        revokePrivs(workloadGroupPattern, privs);
    }

    private void revokePrivs(WorkloadGroupPattern workloadGroupPattern, PrivBitSet privs) throws DdlException {
        if (workloadGroupPattern.getPrivLevel().equals(PrivLevel.WORKLOAD_GROUP)) {
            revokeWorkloadGroupPrivs(workloadGroupPattern.getworkloadGroupName(), privs);
        }
    }

    private void revokeWorkloadGroupPrivs(String workloadGroupName, PrivBitSet privs) throws DdlException {
        WorkloadGroupPrivEntry entry;
        try {
            entry = WorkloadGroupPrivEntry.create(workloadGroupName, privs);
        } catch (AnalysisException | PatternMatcherException e) {
            throw new DdlException(e.getMessage());
        }
        workloadGroupPrivTable.revoke(entry, false, true);
    }

    private void revokePrivs(TablePattern tblPattern, PrivBitSet privs) throws DdlException {
        switch (tblPattern.getPrivLevel()) {
            case GLOBAL:
                revokeGlobalPrivs(privs);
                break;
            case CATALOG:
                revokeCatalogPrivs(tblPattern.getQualifiedCtl(), privs);
                break;
            case DATABASE:
                revokeDbPrivs(tblPattern.getQualifiedCtl(),
                        tblPattern.getQualifiedDb(), privs);
                break;
            case TABLE:
                revokeTblPrivs(tblPattern.getQualifiedCtl(), tblPattern.getQualifiedDb(),
                        tblPattern.getTbl(), privs);
                break;
            default:
                Preconditions.checkNotNull(null, tblPattern.getPrivLevel());
        }

    }

    private void revokeGlobalPrivs(PrivBitSet privs)
            throws DdlException {
        GlobalPrivEntry entry = GlobalPrivEntry.create(privs);
        globalPrivTable.revoke(entry, false, false);
    }

    private void revokeCatalogPrivs(String ctl,
            PrivBitSet privs) throws DdlException {
        CatalogPrivEntry entry;
        try {
            entry = CatalogPrivEntry.create(
                    ctl, privs);
        } catch (AnalysisException e) {
            throw new DdlException(e.getMessage());
        }
        catalogPrivTable.revoke(entry, false, true);
    }

    private void revokeDbPrivs(String ctl, String db, PrivBitSet privs) throws DdlException {
        DbPrivEntry entry;
        try {
            entry = DbPrivEntry.create(ctl, db, privs);
        } catch (AnalysisException e) {
            throw new DdlException(e.getMessage());
        }

        dbPrivTable.revoke(entry, false, true);
    }

    private void revokeTblPrivs(String ctl, String db, String tbl,
            PrivBitSet privs) throws DdlException {
        TablePrivEntry entry;
        try {
            entry = TablePrivEntry.create(ctl, db, tbl, privs);
        } catch (AnalysisException e) {
            throw new DdlException(e.getMessage());
        }
        tablePrivTable.revoke(entry, false, true);
    }

    /**
     * eg:
     * Before, tblPatternToPrivs has 1 entry: ctl.*.* -> SELECT_PRIV, ADMIN_PRIV, ALTER_PRIV
     * After, tblPatternToPrivs has 2 entries:
     * *.*.* -> ADMIN_PRIV
     * ctl.*.* -> SELECT_PRIV, ALTER_PRIV
     */
    public void rectifyPrivs() {
        PrivBitSet modifiedGlobalPrivs = new PrivBitSet();
        for (Map.Entry<TablePattern, PrivBitSet> entry : tblPatternToPrivs.entrySet()) {
            TablePattern tblPattern = entry.getKey();
            PrivBitSet privs = entry.getValue();
            if (privs.containsPrivs(Privilege.ADMIN_PRIV, Privilege.NODE_PRIV, Privilege.USAGE_PRIV)
                    && tblPattern.getPrivLevel() != PrivLevel.GLOBAL) {
                if (LOG.isDebugEnabled()) {
                    LOG.debug("rectify privs {}: {} -> {}", roleName, tblPattern, privs);
                }
                PrivBitSet copiedPrivs = privs.copy();
                copiedPrivs.and(PrivBitSet.of(Privilege.ADMIN_PRIV, Privilege.NODE_PRIV, Privilege.USAGE_PRIV));
                modifiedGlobalPrivs.or(copiedPrivs);
                // remove these privs from non global table pattern's priv set
                privs.unset(Privilege.USAGE_PRIV.getIdx());
                privs.unset(Privilege.NODE_PRIV.getIdx());
                privs.unset(Privilege.ADMIN_PRIV.getIdx());
                if (LOG.isDebugEnabled()) {
                    LOG.debug("alter rectify privs {}: {} -> {}, modified global priv: {}",
                            roleName, tblPattern, privs, modifiedGlobalPrivs);
                }
            }
        }
        if (!modifiedGlobalPrivs.isEmpty()) {
            PrivBitSet privBitSet = tblPatternToPrivs.get(TablePattern.ALL);
            if (privBitSet == null) {
                tblPatternToPrivs.put(TablePattern.ALL, modifiedGlobalPrivs);
            } else {
                privBitSet.or(modifiedGlobalPrivs);
            }
        }

        // rebuild these priv tables
        rebuildPrivTables();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("role: ").append(roleName).append(", db table privs: ").append(tblPatternToPrivs);
        sb.append(", resource privs: ").append(resourcePatternToPrivs);
        sb.append(", workload group privs: ").append(workloadGroupPatternToPrivs);
        return sb.toString();
    }

    @Override
    public void write(DataOutput out) throws IOException {
        Text.writeString(out, GsonUtils.GSON.toJson(this));
    }

    public static Role read(DataInput in) throws IOException {
        if (Env.getCurrentEnvJournalVersion() < FeMetaVersion.VERSION_116) {
            Role role = new Role();
            try {
                role.readFields(in);
            } catch (DdlException e) {
                LOG.warn("grant failed,", e);
            }
            return role;
        } else {
            String json = Text.readString(in);
            Role r = GsonUtils.GSON.fromJson(json, Role.class);
            return r;
        }
    }

    // should be removed after version 3.0
    private void removeClusterPrefix() {
        roleName = ClusterNamespace.getNameFromFullName(roleName);
    }

    @Deprecated
    private void readFields(DataInput in) throws IOException, DdlException {
        roleName = Text.readString(in);
        int size = in.readInt();
        for (int i = 0; i < size; i++) {
            TablePattern tblPattern = TablePattern.read(in);
            PrivBitSet privs = PrivBitSet.read(in);
            tblPatternToPrivs.put(tblPattern, privs);
            grantPrivs(tblPattern, privs.copy());
        }
        size = in.readInt();
        for (int i = 0; i < size; i++) {
            ResourcePattern resourcePattern = ResourcePattern.read(in);
            PrivBitSet privs = PrivBitSet.read(in);
            resourcePatternToPrivs.put(resourcePattern, privs);
            grantPrivs(resourcePattern, privs.copy());
        }
        size = in.readInt();
        for (int i = 0; i < size; i++) {
            UserIdentity userIdentity = UserIdentity.read(in);
            users.add(userIdentity);
        }

    }

    @Override
    public void gsonPostProcess() {
        removeClusterPrefix();
        rebuildPrivTables();
    }

    private void rebuildPrivTables() {
        globalPrivTable = new GlobalPrivTable();
        catalogPrivTable = new CatalogPrivTable();
        dbPrivTable = new DbPrivTable();
        tablePrivTable = new TablePrivTable();
        resourcePrivTable = new ResourcePrivTable();
        workloadGroupPrivTable = new WorkloadGroupPrivTable();
        for (Entry<TablePattern, PrivBitSet> entry : tblPatternToPrivs.entrySet()) {
            try {
                grantPrivs(entry.getKey(), entry.getValue().copy());
            } catch (DdlException e) {
                LOG.warn("grant failed,", e);
            }
        }
        for (Entry<ResourcePattern, PrivBitSet> entry : resourcePatternToPrivs.entrySet()) {
            try {
                grantPrivs(entry.getKey(), entry.getValue().copy());
            } catch (DdlException e) {
                LOG.warn("grant failed,", e);
            }
        }
        for (Entry<WorkloadGroupPattern, PrivBitSet> entry : workloadGroupPatternToPrivs.entrySet()) {
            try {
                grantPrivs(entry.getKey(), entry.getValue().copy());
            } catch (DdlException e) {
                LOG.warn("grant failed,", e);
            }
        }
    }
}
