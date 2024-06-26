/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TQueriesMetadataParams implements org.apache.thrift.TBase<TQueriesMetadataParams, TQueriesMetadataParams._Fields>, java.io.Serializable, Cloneable, Comparable<TQueriesMetadataParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TQueriesMetadataParams");

  private static final org.apache.thrift.protocol.TField CLUSTER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("cluster_name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RELAY_TO_OTHER_FE_FIELD_DESC = new org.apache.thrift.protocol.TField("relay_to_other_fe", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField MATERIALIZED_VIEWS_PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("materialized_views_params", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField JOBS_PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("jobs_params", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField TASKS_PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("tasks_params", org.apache.thrift.protocol.TType.STRUCT, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TQueriesMetadataParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TQueriesMetadataParamsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String cluster_name; // optional
  public boolean relay_to_other_fe; // optional
  public @org.apache.thrift.annotation.Nullable TMaterializedViewsMetadataParams materialized_views_params; // optional
  public @org.apache.thrift.annotation.Nullable TJobsMetadataParams jobs_params; // optional
  public @org.apache.thrift.annotation.Nullable TTasksMetadataParams tasks_params; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CLUSTER_NAME((short)1, "cluster_name"),
    RELAY_TO_OTHER_FE((short)2, "relay_to_other_fe"),
    MATERIALIZED_VIEWS_PARAMS((short)3, "materialized_views_params"),
    JOBS_PARAMS((short)4, "jobs_params"),
    TASKS_PARAMS((short)5, "tasks_params");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CLUSTER_NAME
          return CLUSTER_NAME;
        case 2: // RELAY_TO_OTHER_FE
          return RELAY_TO_OTHER_FE;
        case 3: // MATERIALIZED_VIEWS_PARAMS
          return MATERIALIZED_VIEWS_PARAMS;
        case 4: // JOBS_PARAMS
          return JOBS_PARAMS;
        case 5: // TASKS_PARAMS
          return TASKS_PARAMS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __RELAY_TO_OTHER_FE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CLUSTER_NAME,_Fields.RELAY_TO_OTHER_FE,_Fields.MATERIALIZED_VIEWS_PARAMS,_Fields.JOBS_PARAMS,_Fields.TASKS_PARAMS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLUSTER_NAME, new org.apache.thrift.meta_data.FieldMetaData("cluster_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RELAY_TO_OTHER_FE, new org.apache.thrift.meta_data.FieldMetaData("relay_to_other_fe", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.MATERIALIZED_VIEWS_PARAMS, new org.apache.thrift.meta_data.FieldMetaData("materialized_views_params", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TMaterializedViewsMetadataParams.class)));
    tmpMap.put(_Fields.JOBS_PARAMS, new org.apache.thrift.meta_data.FieldMetaData("jobs_params", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TJobsMetadataParams.class)));
    tmpMap.put(_Fields.TASKS_PARAMS, new org.apache.thrift.meta_data.FieldMetaData("tasks_params", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTasksMetadataParams.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TQueriesMetadataParams.class, metaDataMap);
  }

  public TQueriesMetadataParams() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TQueriesMetadataParams(TQueriesMetadataParams other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetClusterName()) {
      this.cluster_name = other.cluster_name;
    }
    this.relay_to_other_fe = other.relay_to_other_fe;
    if (other.isSetMaterializedViewsParams()) {
      this.materialized_views_params = new TMaterializedViewsMetadataParams(other.materialized_views_params);
    }
    if (other.isSetJobsParams()) {
      this.jobs_params = new TJobsMetadataParams(other.jobs_params);
    }
    if (other.isSetTasksParams()) {
      this.tasks_params = new TTasksMetadataParams(other.tasks_params);
    }
  }

  public TQueriesMetadataParams deepCopy() {
    return new TQueriesMetadataParams(this);
  }

  @Override
  public void clear() {
    this.cluster_name = null;
    setRelayToOtherFeIsSet(false);
    this.relay_to_other_fe = false;
    this.materialized_views_params = null;
    this.jobs_params = null;
    this.tasks_params = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getClusterName() {
    return this.cluster_name;
  }

  public TQueriesMetadataParams setClusterName(@org.apache.thrift.annotation.Nullable java.lang.String cluster_name) {
    this.cluster_name = cluster_name;
    return this;
  }

  public void unsetClusterName() {
    this.cluster_name = null;
  }

  /** Returns true if field cluster_name is set (has been assigned a value) and false otherwise */
  public boolean isSetClusterName() {
    return this.cluster_name != null;
  }

  public void setClusterNameIsSet(boolean value) {
    if (!value) {
      this.cluster_name = null;
    }
  }

  public boolean isRelayToOtherFe() {
    return this.relay_to_other_fe;
  }

  public TQueriesMetadataParams setRelayToOtherFe(boolean relay_to_other_fe) {
    this.relay_to_other_fe = relay_to_other_fe;
    setRelayToOtherFeIsSet(true);
    return this;
  }

  public void unsetRelayToOtherFe() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RELAY_TO_OTHER_FE_ISSET_ID);
  }

  /** Returns true if field relay_to_other_fe is set (has been assigned a value) and false otherwise */
  public boolean isSetRelayToOtherFe() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RELAY_TO_OTHER_FE_ISSET_ID);
  }

  public void setRelayToOtherFeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RELAY_TO_OTHER_FE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public TMaterializedViewsMetadataParams getMaterializedViewsParams() {
    return this.materialized_views_params;
  }

  public TQueriesMetadataParams setMaterializedViewsParams(@org.apache.thrift.annotation.Nullable TMaterializedViewsMetadataParams materialized_views_params) {
    this.materialized_views_params = materialized_views_params;
    return this;
  }

  public void unsetMaterializedViewsParams() {
    this.materialized_views_params = null;
  }

  /** Returns true if field materialized_views_params is set (has been assigned a value) and false otherwise */
  public boolean isSetMaterializedViewsParams() {
    return this.materialized_views_params != null;
  }

  public void setMaterializedViewsParamsIsSet(boolean value) {
    if (!value) {
      this.materialized_views_params = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TJobsMetadataParams getJobsParams() {
    return this.jobs_params;
  }

  public TQueriesMetadataParams setJobsParams(@org.apache.thrift.annotation.Nullable TJobsMetadataParams jobs_params) {
    this.jobs_params = jobs_params;
    return this;
  }

  public void unsetJobsParams() {
    this.jobs_params = null;
  }

  /** Returns true if field jobs_params is set (has been assigned a value) and false otherwise */
  public boolean isSetJobsParams() {
    return this.jobs_params != null;
  }

  public void setJobsParamsIsSet(boolean value) {
    if (!value) {
      this.jobs_params = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TTasksMetadataParams getTasksParams() {
    return this.tasks_params;
  }

  public TQueriesMetadataParams setTasksParams(@org.apache.thrift.annotation.Nullable TTasksMetadataParams tasks_params) {
    this.tasks_params = tasks_params;
    return this;
  }

  public void unsetTasksParams() {
    this.tasks_params = null;
  }

  /** Returns true if field tasks_params is set (has been assigned a value) and false otherwise */
  public boolean isSetTasksParams() {
    return this.tasks_params != null;
  }

  public void setTasksParamsIsSet(boolean value) {
    if (!value) {
      this.tasks_params = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CLUSTER_NAME:
      if (value == null) {
        unsetClusterName();
      } else {
        setClusterName((java.lang.String)value);
      }
      break;

    case RELAY_TO_OTHER_FE:
      if (value == null) {
        unsetRelayToOtherFe();
      } else {
        setRelayToOtherFe((java.lang.Boolean)value);
      }
      break;

    case MATERIALIZED_VIEWS_PARAMS:
      if (value == null) {
        unsetMaterializedViewsParams();
      } else {
        setMaterializedViewsParams((TMaterializedViewsMetadataParams)value);
      }
      break;

    case JOBS_PARAMS:
      if (value == null) {
        unsetJobsParams();
      } else {
        setJobsParams((TJobsMetadataParams)value);
      }
      break;

    case TASKS_PARAMS:
      if (value == null) {
        unsetTasksParams();
      } else {
        setTasksParams((TTasksMetadataParams)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CLUSTER_NAME:
      return getClusterName();

    case RELAY_TO_OTHER_FE:
      return isRelayToOtherFe();

    case MATERIALIZED_VIEWS_PARAMS:
      return getMaterializedViewsParams();

    case JOBS_PARAMS:
      return getJobsParams();

    case TASKS_PARAMS:
      return getTasksParams();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CLUSTER_NAME:
      return isSetClusterName();
    case RELAY_TO_OTHER_FE:
      return isSetRelayToOtherFe();
    case MATERIALIZED_VIEWS_PARAMS:
      return isSetMaterializedViewsParams();
    case JOBS_PARAMS:
      return isSetJobsParams();
    case TASKS_PARAMS:
      return isSetTasksParams();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TQueriesMetadataParams)
      return this.equals((TQueriesMetadataParams)that);
    return false;
  }

  public boolean equals(TQueriesMetadataParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_cluster_name = true && this.isSetClusterName();
    boolean that_present_cluster_name = true && that.isSetClusterName();
    if (this_present_cluster_name || that_present_cluster_name) {
      if (!(this_present_cluster_name && that_present_cluster_name))
        return false;
      if (!this.cluster_name.equals(that.cluster_name))
        return false;
    }

    boolean this_present_relay_to_other_fe = true && this.isSetRelayToOtherFe();
    boolean that_present_relay_to_other_fe = true && that.isSetRelayToOtherFe();
    if (this_present_relay_to_other_fe || that_present_relay_to_other_fe) {
      if (!(this_present_relay_to_other_fe && that_present_relay_to_other_fe))
        return false;
      if (this.relay_to_other_fe != that.relay_to_other_fe)
        return false;
    }

    boolean this_present_materialized_views_params = true && this.isSetMaterializedViewsParams();
    boolean that_present_materialized_views_params = true && that.isSetMaterializedViewsParams();
    if (this_present_materialized_views_params || that_present_materialized_views_params) {
      if (!(this_present_materialized_views_params && that_present_materialized_views_params))
        return false;
      if (!this.materialized_views_params.equals(that.materialized_views_params))
        return false;
    }

    boolean this_present_jobs_params = true && this.isSetJobsParams();
    boolean that_present_jobs_params = true && that.isSetJobsParams();
    if (this_present_jobs_params || that_present_jobs_params) {
      if (!(this_present_jobs_params && that_present_jobs_params))
        return false;
      if (!this.jobs_params.equals(that.jobs_params))
        return false;
    }

    boolean this_present_tasks_params = true && this.isSetTasksParams();
    boolean that_present_tasks_params = true && that.isSetTasksParams();
    if (this_present_tasks_params || that_present_tasks_params) {
      if (!(this_present_tasks_params && that_present_tasks_params))
        return false;
      if (!this.tasks_params.equals(that.tasks_params))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetClusterName()) ? 131071 : 524287);
    if (isSetClusterName())
      hashCode = hashCode * 8191 + cluster_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetRelayToOtherFe()) ? 131071 : 524287);
    if (isSetRelayToOtherFe())
      hashCode = hashCode * 8191 + ((relay_to_other_fe) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetMaterializedViewsParams()) ? 131071 : 524287);
    if (isSetMaterializedViewsParams())
      hashCode = hashCode * 8191 + materialized_views_params.hashCode();

    hashCode = hashCode * 8191 + ((isSetJobsParams()) ? 131071 : 524287);
    if (isSetJobsParams())
      hashCode = hashCode * 8191 + jobs_params.hashCode();

    hashCode = hashCode * 8191 + ((isSetTasksParams()) ? 131071 : 524287);
    if (isSetTasksParams())
      hashCode = hashCode * 8191 + tasks_params.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TQueriesMetadataParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetClusterName(), other.isSetClusterName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClusterName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cluster_name, other.cluster_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRelayToOtherFe(), other.isSetRelayToOtherFe());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRelayToOtherFe()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.relay_to_other_fe, other.relay_to_other_fe);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMaterializedViewsParams(), other.isSetMaterializedViewsParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaterializedViewsParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.materialized_views_params, other.materialized_views_params);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetJobsParams(), other.isSetJobsParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobsParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobs_params, other.jobs_params);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTasksParams(), other.isSetTasksParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTasksParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tasks_params, other.tasks_params);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TQueriesMetadataParams(");
    boolean first = true;

    if (isSetClusterName()) {
      sb.append("cluster_name:");
      if (this.cluster_name == null) {
        sb.append("null");
      } else {
        sb.append(this.cluster_name);
      }
      first = false;
    }
    if (isSetRelayToOtherFe()) {
      if (!first) sb.append(", ");
      sb.append("relay_to_other_fe:");
      sb.append(this.relay_to_other_fe);
      first = false;
    }
    if (isSetMaterializedViewsParams()) {
      if (!first) sb.append(", ");
      sb.append("materialized_views_params:");
      if (this.materialized_views_params == null) {
        sb.append("null");
      } else {
        sb.append(this.materialized_views_params);
      }
      first = false;
    }
    if (isSetJobsParams()) {
      if (!first) sb.append(", ");
      sb.append("jobs_params:");
      if (this.jobs_params == null) {
        sb.append("null");
      } else {
        sb.append(this.jobs_params);
      }
      first = false;
    }
    if (isSetTasksParams()) {
      if (!first) sb.append(", ");
      sb.append("tasks_params:");
      if (this.tasks_params == null) {
        sb.append("null");
      } else {
        sb.append(this.tasks_params);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (materialized_views_params != null) {
      materialized_views_params.validate();
    }
    if (jobs_params != null) {
      jobs_params.validate();
    }
    if (tasks_params != null) {
      tasks_params.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TQueriesMetadataParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TQueriesMetadataParamsStandardScheme getScheme() {
      return new TQueriesMetadataParamsStandardScheme();
    }
  }

  private static class TQueriesMetadataParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TQueriesMetadataParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TQueriesMetadataParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLUSTER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cluster_name = iprot.readString();
              struct.setClusterNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RELAY_TO_OTHER_FE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.relay_to_other_fe = iprot.readBool();
              struct.setRelayToOtherFeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MATERIALIZED_VIEWS_PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.materialized_views_params = new TMaterializedViewsMetadataParams();
              struct.materialized_views_params.read(iprot);
              struct.setMaterializedViewsParamsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // JOBS_PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.jobs_params = new TJobsMetadataParams();
              struct.jobs_params.read(iprot);
              struct.setJobsParamsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TASKS_PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.tasks_params = new TTasksMetadataParams();
              struct.tasks_params.read(iprot);
              struct.setTasksParamsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TQueriesMetadataParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cluster_name != null) {
        if (struct.isSetClusterName()) {
          oprot.writeFieldBegin(CLUSTER_NAME_FIELD_DESC);
          oprot.writeString(struct.cluster_name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetRelayToOtherFe()) {
        oprot.writeFieldBegin(RELAY_TO_OTHER_FE_FIELD_DESC);
        oprot.writeBool(struct.relay_to_other_fe);
        oprot.writeFieldEnd();
      }
      if (struct.materialized_views_params != null) {
        if (struct.isSetMaterializedViewsParams()) {
          oprot.writeFieldBegin(MATERIALIZED_VIEWS_PARAMS_FIELD_DESC);
          struct.materialized_views_params.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.jobs_params != null) {
        if (struct.isSetJobsParams()) {
          oprot.writeFieldBegin(JOBS_PARAMS_FIELD_DESC);
          struct.jobs_params.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.tasks_params != null) {
        if (struct.isSetTasksParams()) {
          oprot.writeFieldBegin(TASKS_PARAMS_FIELD_DESC);
          struct.tasks_params.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TQueriesMetadataParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TQueriesMetadataParamsTupleScheme getScheme() {
      return new TQueriesMetadataParamsTupleScheme();
    }
  }

  private static class TQueriesMetadataParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TQueriesMetadataParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TQueriesMetadataParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetClusterName()) {
        optionals.set(0);
      }
      if (struct.isSetRelayToOtherFe()) {
        optionals.set(1);
      }
      if (struct.isSetMaterializedViewsParams()) {
        optionals.set(2);
      }
      if (struct.isSetJobsParams()) {
        optionals.set(3);
      }
      if (struct.isSetTasksParams()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetClusterName()) {
        oprot.writeString(struct.cluster_name);
      }
      if (struct.isSetRelayToOtherFe()) {
        oprot.writeBool(struct.relay_to_other_fe);
      }
      if (struct.isSetMaterializedViewsParams()) {
        struct.materialized_views_params.write(oprot);
      }
      if (struct.isSetJobsParams()) {
        struct.jobs_params.write(oprot);
      }
      if (struct.isSetTasksParams()) {
        struct.tasks_params.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TQueriesMetadataParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.cluster_name = iprot.readString();
        struct.setClusterNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.relay_to_other_fe = iprot.readBool();
        struct.setRelayToOtherFeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.materialized_views_params = new TMaterializedViewsMetadataParams();
        struct.materialized_views_params.read(iprot);
        struct.setMaterializedViewsParamsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.jobs_params = new TJobsMetadataParams();
        struct.jobs_params.read(iprot);
        struct.setJobsParamsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.tasks_params = new TTasksMetadataParams();
        struct.tasks_params.read(iprot);
        struct.setTasksParamsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

