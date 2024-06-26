/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TQueryPlanInfo implements org.apache.thrift.TBase<TQueryPlanInfo, TQueryPlanInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TQueryPlanInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TQueryPlanInfo");

  private static final org.apache.thrift.protocol.TField PLAN_FRAGMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("plan_fragment", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TABLET_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("tablet_info", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField DESC_TBL_FIELD_DESC = new org.apache.thrift.protocol.TField("desc_tbl", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField QUERY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("query_id", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TQueryPlanInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TQueryPlanInfoTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TPlanFragment plan_fragment; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Long,TTabletVersionInfo> tablet_info; // required
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TDescriptorTable desc_tbl; // required
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId query_id; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PLAN_FRAGMENT((short)1, "plan_fragment"),
    TABLET_INFO((short)2, "tablet_info"),
    DESC_TBL((short)3, "desc_tbl"),
    QUERY_ID((short)4, "query_id");

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
        case 1: // PLAN_FRAGMENT
          return PLAN_FRAGMENT;
        case 2: // TABLET_INFO
          return TABLET_INFO;
        case 3: // DESC_TBL
          return DESC_TBL;
        case 4: // QUERY_ID
          return QUERY_ID;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PLAN_FRAGMENT, new org.apache.thrift.meta_data.FieldMetaData("plan_fragment", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TPlanFragment.class)));
    tmpMap.put(_Fields.TABLET_INFO, new org.apache.thrift.meta_data.FieldMetaData("tablet_info", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTabletVersionInfo.class))));
    tmpMap.put(_Fields.DESC_TBL, new org.apache.thrift.meta_data.FieldMetaData("desc_tbl", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TDescriptorTable.class)));
    tmpMap.put(_Fields.QUERY_ID, new org.apache.thrift.meta_data.FieldMetaData("query_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TUniqueId.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TQueryPlanInfo.class, metaDataMap);
  }

  public TQueryPlanInfo() {
  }

  public TQueryPlanInfo(
    org.apache.doris.thrift.TPlanFragment plan_fragment,
    java.util.Map<java.lang.Long,TTabletVersionInfo> tablet_info,
    org.apache.doris.thrift.TDescriptorTable desc_tbl,
    org.apache.doris.thrift.TUniqueId query_id)
  {
    this();
    this.plan_fragment = plan_fragment;
    this.tablet_info = tablet_info;
    this.desc_tbl = desc_tbl;
    this.query_id = query_id;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TQueryPlanInfo(TQueryPlanInfo other) {
    if (other.isSetPlanFragment()) {
      this.plan_fragment = new org.apache.doris.thrift.TPlanFragment(other.plan_fragment);
    }
    if (other.isSetTabletInfo()) {
      java.util.Map<java.lang.Long,TTabletVersionInfo> __this__tablet_info = new java.util.HashMap<java.lang.Long,TTabletVersionInfo>(other.tablet_info.size());
      for (java.util.Map.Entry<java.lang.Long, TTabletVersionInfo> other_element : other.tablet_info.entrySet()) {

        java.lang.Long other_element_key = other_element.getKey();
        TTabletVersionInfo other_element_value = other_element.getValue();

        java.lang.Long __this__tablet_info_copy_key = other_element_key;

        TTabletVersionInfo __this__tablet_info_copy_value = new TTabletVersionInfo(other_element_value);

        __this__tablet_info.put(__this__tablet_info_copy_key, __this__tablet_info_copy_value);
      }
      this.tablet_info = __this__tablet_info;
    }
    if (other.isSetDescTbl()) {
      this.desc_tbl = new org.apache.doris.thrift.TDescriptorTable(other.desc_tbl);
    }
    if (other.isSetQueryId()) {
      this.query_id = new org.apache.doris.thrift.TUniqueId(other.query_id);
    }
  }

  public TQueryPlanInfo deepCopy() {
    return new TQueryPlanInfo(this);
  }

  @Override
  public void clear() {
    this.plan_fragment = null;
    this.tablet_info = null;
    this.desc_tbl = null;
    this.query_id = null;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TPlanFragment getPlanFragment() {
    return this.plan_fragment;
  }

  public TQueryPlanInfo setPlanFragment(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TPlanFragment plan_fragment) {
    this.plan_fragment = plan_fragment;
    return this;
  }

  public void unsetPlanFragment() {
    this.plan_fragment = null;
  }

  /** Returns true if field plan_fragment is set (has been assigned a value) and false otherwise */
  public boolean isSetPlanFragment() {
    return this.plan_fragment != null;
  }

  public void setPlanFragmentIsSet(boolean value) {
    if (!value) {
      this.plan_fragment = null;
    }
  }

  public int getTabletInfoSize() {
    return (this.tablet_info == null) ? 0 : this.tablet_info.size();
  }

  public void putToTabletInfo(long key, TTabletVersionInfo val) {
    if (this.tablet_info == null) {
      this.tablet_info = new java.util.HashMap<java.lang.Long,TTabletVersionInfo>();
    }
    this.tablet_info.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.Long,TTabletVersionInfo> getTabletInfo() {
    return this.tablet_info;
  }

  public TQueryPlanInfo setTabletInfo(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Long,TTabletVersionInfo> tablet_info) {
    this.tablet_info = tablet_info;
    return this;
  }

  public void unsetTabletInfo() {
    this.tablet_info = null;
  }

  /** Returns true if field tablet_info is set (has been assigned a value) and false otherwise */
  public boolean isSetTabletInfo() {
    return this.tablet_info != null;
  }

  public void setTabletInfoIsSet(boolean value) {
    if (!value) {
      this.tablet_info = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TDescriptorTable getDescTbl() {
    return this.desc_tbl;
  }

  public TQueryPlanInfo setDescTbl(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TDescriptorTable desc_tbl) {
    this.desc_tbl = desc_tbl;
    return this;
  }

  public void unsetDescTbl() {
    this.desc_tbl = null;
  }

  /** Returns true if field desc_tbl is set (has been assigned a value) and false otherwise */
  public boolean isSetDescTbl() {
    return this.desc_tbl != null;
  }

  public void setDescTblIsSet(boolean value) {
    if (!value) {
      this.desc_tbl = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TUniqueId getQueryId() {
    return this.query_id;
  }

  public TQueryPlanInfo setQueryId(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId query_id) {
    this.query_id = query_id;
    return this;
  }

  public void unsetQueryId() {
    this.query_id = null;
  }

  /** Returns true if field query_id is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryId() {
    return this.query_id != null;
  }

  public void setQueryIdIsSet(boolean value) {
    if (!value) {
      this.query_id = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PLAN_FRAGMENT:
      if (value == null) {
        unsetPlanFragment();
      } else {
        setPlanFragment((org.apache.doris.thrift.TPlanFragment)value);
      }
      break;

    case TABLET_INFO:
      if (value == null) {
        unsetTabletInfo();
      } else {
        setTabletInfo((java.util.Map<java.lang.Long,TTabletVersionInfo>)value);
      }
      break;

    case DESC_TBL:
      if (value == null) {
        unsetDescTbl();
      } else {
        setDescTbl((org.apache.doris.thrift.TDescriptorTable)value);
      }
      break;

    case QUERY_ID:
      if (value == null) {
        unsetQueryId();
      } else {
        setQueryId((org.apache.doris.thrift.TUniqueId)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PLAN_FRAGMENT:
      return getPlanFragment();

    case TABLET_INFO:
      return getTabletInfo();

    case DESC_TBL:
      return getDescTbl();

    case QUERY_ID:
      return getQueryId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PLAN_FRAGMENT:
      return isSetPlanFragment();
    case TABLET_INFO:
      return isSetTabletInfo();
    case DESC_TBL:
      return isSetDescTbl();
    case QUERY_ID:
      return isSetQueryId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TQueryPlanInfo)
      return this.equals((TQueryPlanInfo)that);
    return false;
  }

  public boolean equals(TQueryPlanInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_plan_fragment = true && this.isSetPlanFragment();
    boolean that_present_plan_fragment = true && that.isSetPlanFragment();
    if (this_present_plan_fragment || that_present_plan_fragment) {
      if (!(this_present_plan_fragment && that_present_plan_fragment))
        return false;
      if (!this.plan_fragment.equals(that.plan_fragment))
        return false;
    }

    boolean this_present_tablet_info = true && this.isSetTabletInfo();
    boolean that_present_tablet_info = true && that.isSetTabletInfo();
    if (this_present_tablet_info || that_present_tablet_info) {
      if (!(this_present_tablet_info && that_present_tablet_info))
        return false;
      if (!this.tablet_info.equals(that.tablet_info))
        return false;
    }

    boolean this_present_desc_tbl = true && this.isSetDescTbl();
    boolean that_present_desc_tbl = true && that.isSetDescTbl();
    if (this_present_desc_tbl || that_present_desc_tbl) {
      if (!(this_present_desc_tbl && that_present_desc_tbl))
        return false;
      if (!this.desc_tbl.equals(that.desc_tbl))
        return false;
    }

    boolean this_present_query_id = true && this.isSetQueryId();
    boolean that_present_query_id = true && that.isSetQueryId();
    if (this_present_query_id || that_present_query_id) {
      if (!(this_present_query_id && that_present_query_id))
        return false;
      if (!this.query_id.equals(that.query_id))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPlanFragment()) ? 131071 : 524287);
    if (isSetPlanFragment())
      hashCode = hashCode * 8191 + plan_fragment.hashCode();

    hashCode = hashCode * 8191 + ((isSetTabletInfo()) ? 131071 : 524287);
    if (isSetTabletInfo())
      hashCode = hashCode * 8191 + tablet_info.hashCode();

    hashCode = hashCode * 8191 + ((isSetDescTbl()) ? 131071 : 524287);
    if (isSetDescTbl())
      hashCode = hashCode * 8191 + desc_tbl.hashCode();

    hashCode = hashCode * 8191 + ((isSetQueryId()) ? 131071 : 524287);
    if (isSetQueryId())
      hashCode = hashCode * 8191 + query_id.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TQueryPlanInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetPlanFragment(), other.isSetPlanFragment());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPlanFragment()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.plan_fragment, other.plan_fragment);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTabletInfo(), other.isSetTabletInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTabletInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tablet_info, other.tablet_info);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDescTbl(), other.isSetDescTbl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescTbl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.desc_tbl, other.desc_tbl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetQueryId(), other.isSetQueryId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.query_id, other.query_id);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TQueryPlanInfo(");
    boolean first = true;

    sb.append("plan_fragment:");
    if (this.plan_fragment == null) {
      sb.append("null");
    } else {
      sb.append(this.plan_fragment);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tablet_info:");
    if (this.tablet_info == null) {
      sb.append("null");
    } else {
      sb.append(this.tablet_info);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("desc_tbl:");
    if (this.desc_tbl == null) {
      sb.append("null");
    } else {
      sb.append(this.desc_tbl);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("query_id:");
    if (this.query_id == null) {
      sb.append("null");
    } else {
      sb.append(this.query_id);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (plan_fragment == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'plan_fragment' was not present! Struct: " + toString());
    }
    if (tablet_info == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tablet_info' was not present! Struct: " + toString());
    }
    if (desc_tbl == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'desc_tbl' was not present! Struct: " + toString());
    }
    if (query_id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'query_id' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (plan_fragment != null) {
      plan_fragment.validate();
    }
    if (desc_tbl != null) {
      desc_tbl.validate();
    }
    if (query_id != null) {
      query_id.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TQueryPlanInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TQueryPlanInfoStandardScheme getScheme() {
      return new TQueryPlanInfoStandardScheme();
    }
  }

  private static class TQueryPlanInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TQueryPlanInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TQueryPlanInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PLAN_FRAGMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.plan_fragment = new org.apache.doris.thrift.TPlanFragment();
              struct.plan_fragment.read(iprot);
              struct.setPlanFragmentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TABLET_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.tablet_info = new java.util.HashMap<java.lang.Long,TTabletVersionInfo>(2*_map0.size);
                long _key1;
                @org.apache.thrift.annotation.Nullable TTabletVersionInfo _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readI64();
                  _val2 = new TTabletVersionInfo();
                  _val2.read(iprot);
                  struct.tablet_info.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setTabletInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DESC_TBL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.desc_tbl = new org.apache.doris.thrift.TDescriptorTable();
              struct.desc_tbl.read(iprot);
              struct.setDescTblIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // QUERY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.query_id = new org.apache.doris.thrift.TUniqueId();
              struct.query_id.read(iprot);
              struct.setQueryIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TQueryPlanInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.plan_fragment != null) {
        oprot.writeFieldBegin(PLAN_FRAGMENT_FIELD_DESC);
        struct.plan_fragment.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.tablet_info != null) {
        oprot.writeFieldBegin(TABLET_INFO_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I64, org.apache.thrift.protocol.TType.STRUCT, struct.tablet_info.size()));
          for (java.util.Map.Entry<java.lang.Long, TTabletVersionInfo> _iter4 : struct.tablet_info.entrySet())
          {
            oprot.writeI64(_iter4.getKey());
            _iter4.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.desc_tbl != null) {
        oprot.writeFieldBegin(DESC_TBL_FIELD_DESC);
        struct.desc_tbl.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.query_id != null) {
        oprot.writeFieldBegin(QUERY_ID_FIELD_DESC);
        struct.query_id.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TQueryPlanInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TQueryPlanInfoTupleScheme getScheme() {
      return new TQueryPlanInfoTupleScheme();
    }
  }

  private static class TQueryPlanInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TQueryPlanInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TQueryPlanInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.plan_fragment.write(oprot);
      {
        oprot.writeI32(struct.tablet_info.size());
        for (java.util.Map.Entry<java.lang.Long, TTabletVersionInfo> _iter5 : struct.tablet_info.entrySet())
        {
          oprot.writeI64(_iter5.getKey());
          _iter5.getValue().write(oprot);
        }
      }
      struct.desc_tbl.write(oprot);
      struct.query_id.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TQueryPlanInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.plan_fragment = new org.apache.doris.thrift.TPlanFragment();
      struct.plan_fragment.read(iprot);
      struct.setPlanFragmentIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map6 = iprot.readMapBegin(org.apache.thrift.protocol.TType.I64, org.apache.thrift.protocol.TType.STRUCT); 
        struct.tablet_info = new java.util.HashMap<java.lang.Long,TTabletVersionInfo>(2*_map6.size);
        long _key7;
        @org.apache.thrift.annotation.Nullable TTabletVersionInfo _val8;
        for (int _i9 = 0; _i9 < _map6.size; ++_i9)
        {
          _key7 = iprot.readI64();
          _val8 = new TTabletVersionInfo();
          _val8.read(iprot);
          struct.tablet_info.put(_key7, _val8);
        }
      }
      struct.setTabletInfoIsSet(true);
      struct.desc_tbl = new org.apache.doris.thrift.TDescriptorTable();
      struct.desc_tbl.read(iprot);
      struct.setDescTblIsSet(true);
      struct.query_id = new org.apache.doris.thrift.TUniqueId();
      struct.query_id.read(iprot);
      struct.setQueryIdIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

