/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TReportWorkloadRuntimeStatusParams implements org.apache.thrift.TBase<TReportWorkloadRuntimeStatusParams, TReportWorkloadRuntimeStatusParams._Fields>, java.io.Serializable, Cloneable, Comparable<TReportWorkloadRuntimeStatusParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TReportWorkloadRuntimeStatusParams");

  private static final org.apache.thrift.protocol.TField BACKEND_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("backend_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField QUERY_STATISTICS_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("query_statistics_map", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TReportWorkloadRuntimeStatusParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TReportWorkloadRuntimeStatusParamsTupleSchemeFactory();

  public long backend_id; // optional
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,TQueryStatistics> query_statistics_map; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BACKEND_ID((short)1, "backend_id"),
    QUERY_STATISTICS_MAP((short)2, "query_statistics_map");

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
        case 1: // BACKEND_ID
          return BACKEND_ID;
        case 2: // QUERY_STATISTICS_MAP
          return QUERY_STATISTICS_MAP;
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
  private static final int __BACKEND_ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.BACKEND_ID,_Fields.QUERY_STATISTICS_MAP};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BACKEND_ID, new org.apache.thrift.meta_data.FieldMetaData("backend_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.QUERY_STATISTICS_MAP, new org.apache.thrift.meta_data.FieldMetaData("query_statistics_map", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TQueryStatistics.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TReportWorkloadRuntimeStatusParams.class, metaDataMap);
  }

  public TReportWorkloadRuntimeStatusParams() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TReportWorkloadRuntimeStatusParams(TReportWorkloadRuntimeStatusParams other) {
    __isset_bitfield = other.__isset_bitfield;
    this.backend_id = other.backend_id;
    if (other.isSetQueryStatisticsMap()) {
      java.util.Map<java.lang.String,TQueryStatistics> __this__query_statistics_map = new java.util.HashMap<java.lang.String,TQueryStatistics>(other.query_statistics_map.size());
      for (java.util.Map.Entry<java.lang.String, TQueryStatistics> other_element : other.query_statistics_map.entrySet()) {

        java.lang.String other_element_key = other_element.getKey();
        TQueryStatistics other_element_value = other_element.getValue();

        java.lang.String __this__query_statistics_map_copy_key = other_element_key;

        TQueryStatistics __this__query_statistics_map_copy_value = new TQueryStatistics(other_element_value);

        __this__query_statistics_map.put(__this__query_statistics_map_copy_key, __this__query_statistics_map_copy_value);
      }
      this.query_statistics_map = __this__query_statistics_map;
    }
  }

  public TReportWorkloadRuntimeStatusParams deepCopy() {
    return new TReportWorkloadRuntimeStatusParams(this);
  }

  @Override
  public void clear() {
    setBackendIdIsSet(false);
    this.backend_id = 0;
    this.query_statistics_map = null;
  }

  public long getBackendId() {
    return this.backend_id;
  }

  public TReportWorkloadRuntimeStatusParams setBackendId(long backend_id) {
    this.backend_id = backend_id;
    setBackendIdIsSet(true);
    return this;
  }

  public void unsetBackendId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BACKEND_ID_ISSET_ID);
  }

  /** Returns true if field backend_id is set (has been assigned a value) and false otherwise */
  public boolean isSetBackendId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BACKEND_ID_ISSET_ID);
  }

  public void setBackendIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BACKEND_ID_ISSET_ID, value);
  }

  public int getQueryStatisticsMapSize() {
    return (this.query_statistics_map == null) ? 0 : this.query_statistics_map.size();
  }

  public void putToQueryStatisticsMap(java.lang.String key, TQueryStatistics val) {
    if (this.query_statistics_map == null) {
      this.query_statistics_map = new java.util.HashMap<java.lang.String,TQueryStatistics>();
    }
    this.query_statistics_map.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,TQueryStatistics> getQueryStatisticsMap() {
    return this.query_statistics_map;
  }

  public TReportWorkloadRuntimeStatusParams setQueryStatisticsMap(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,TQueryStatistics> query_statistics_map) {
    this.query_statistics_map = query_statistics_map;
    return this;
  }

  public void unsetQueryStatisticsMap() {
    this.query_statistics_map = null;
  }

  /** Returns true if field query_statistics_map is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryStatisticsMap() {
    return this.query_statistics_map != null;
  }

  public void setQueryStatisticsMapIsSet(boolean value) {
    if (!value) {
      this.query_statistics_map = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case BACKEND_ID:
      if (value == null) {
        unsetBackendId();
      } else {
        setBackendId((java.lang.Long)value);
      }
      break;

    case QUERY_STATISTICS_MAP:
      if (value == null) {
        unsetQueryStatisticsMap();
      } else {
        setQueryStatisticsMap((java.util.Map<java.lang.String,TQueryStatistics>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case BACKEND_ID:
      return getBackendId();

    case QUERY_STATISTICS_MAP:
      return getQueryStatisticsMap();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case BACKEND_ID:
      return isSetBackendId();
    case QUERY_STATISTICS_MAP:
      return isSetQueryStatisticsMap();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TReportWorkloadRuntimeStatusParams)
      return this.equals((TReportWorkloadRuntimeStatusParams)that);
    return false;
  }

  public boolean equals(TReportWorkloadRuntimeStatusParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_backend_id = true && this.isSetBackendId();
    boolean that_present_backend_id = true && that.isSetBackendId();
    if (this_present_backend_id || that_present_backend_id) {
      if (!(this_present_backend_id && that_present_backend_id))
        return false;
      if (this.backend_id != that.backend_id)
        return false;
    }

    boolean this_present_query_statistics_map = true && this.isSetQueryStatisticsMap();
    boolean that_present_query_statistics_map = true && that.isSetQueryStatisticsMap();
    if (this_present_query_statistics_map || that_present_query_statistics_map) {
      if (!(this_present_query_statistics_map && that_present_query_statistics_map))
        return false;
      if (!this.query_statistics_map.equals(that.query_statistics_map))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetBackendId()) ? 131071 : 524287);
    if (isSetBackendId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(backend_id);

    hashCode = hashCode * 8191 + ((isSetQueryStatisticsMap()) ? 131071 : 524287);
    if (isSetQueryStatisticsMap())
      hashCode = hashCode * 8191 + query_statistics_map.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TReportWorkloadRuntimeStatusParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetBackendId(), other.isSetBackendId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBackendId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.backend_id, other.backend_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetQueryStatisticsMap(), other.isSetQueryStatisticsMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryStatisticsMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.query_statistics_map, other.query_statistics_map);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TReportWorkloadRuntimeStatusParams(");
    boolean first = true;

    if (isSetBackendId()) {
      sb.append("backend_id:");
      sb.append(this.backend_id);
      first = false;
    }
    if (isSetQueryStatisticsMap()) {
      if (!first) sb.append(", ");
      sb.append("query_statistics_map:");
      if (this.query_statistics_map == null) {
        sb.append("null");
      } else {
        sb.append(this.query_statistics_map);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class TReportWorkloadRuntimeStatusParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TReportWorkloadRuntimeStatusParamsStandardScheme getScheme() {
      return new TReportWorkloadRuntimeStatusParamsStandardScheme();
    }
  }

  private static class TReportWorkloadRuntimeStatusParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TReportWorkloadRuntimeStatusParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TReportWorkloadRuntimeStatusParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BACKEND_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.backend_id = iprot.readI64();
              struct.setBackendIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // QUERY_STATISTICS_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map172 = iprot.readMapBegin();
                struct.query_statistics_map = new java.util.HashMap<java.lang.String,TQueryStatistics>(2*_map172.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key173;
                @org.apache.thrift.annotation.Nullable TQueryStatistics _val174;
                for (int _i175 = 0; _i175 < _map172.size; ++_i175)
                {
                  _key173 = iprot.readString();
                  _val174 = new TQueryStatistics();
                  _val174.read(iprot);
                  struct.query_statistics_map.put(_key173, _val174);
                }
                iprot.readMapEnd();
              }
              struct.setQueryStatisticsMapIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TReportWorkloadRuntimeStatusParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetBackendId()) {
        oprot.writeFieldBegin(BACKEND_ID_FIELD_DESC);
        oprot.writeI64(struct.backend_id);
        oprot.writeFieldEnd();
      }
      if (struct.query_statistics_map != null) {
        if (struct.isSetQueryStatisticsMap()) {
          oprot.writeFieldBegin(QUERY_STATISTICS_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.query_statistics_map.size()));
            for (java.util.Map.Entry<java.lang.String, TQueryStatistics> _iter176 : struct.query_statistics_map.entrySet())
            {
              oprot.writeString(_iter176.getKey());
              _iter176.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TReportWorkloadRuntimeStatusParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TReportWorkloadRuntimeStatusParamsTupleScheme getScheme() {
      return new TReportWorkloadRuntimeStatusParamsTupleScheme();
    }
  }

  private static class TReportWorkloadRuntimeStatusParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TReportWorkloadRuntimeStatusParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TReportWorkloadRuntimeStatusParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetBackendId()) {
        optionals.set(0);
      }
      if (struct.isSetQueryStatisticsMap()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetBackendId()) {
        oprot.writeI64(struct.backend_id);
      }
      if (struct.isSetQueryStatisticsMap()) {
        {
          oprot.writeI32(struct.query_statistics_map.size());
          for (java.util.Map.Entry<java.lang.String, TQueryStatistics> _iter177 : struct.query_statistics_map.entrySet())
          {
            oprot.writeString(_iter177.getKey());
            _iter177.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TReportWorkloadRuntimeStatusParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.backend_id = iprot.readI64();
        struct.setBackendIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map178 = iprot.readMapBegin(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT); 
          struct.query_statistics_map = new java.util.HashMap<java.lang.String,TQueryStatistics>(2*_map178.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _key179;
          @org.apache.thrift.annotation.Nullable TQueryStatistics _val180;
          for (int _i181 = 0; _i181 < _map178.size; ++_i181)
          {
            _key179 = iprot.readString();
            _val180 = new TQueryStatistics();
            _val180.read(iprot);
            struct.query_statistics_map.put(_key179, _val180);
          }
        }
        struct.setQueryStatisticsMapIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

