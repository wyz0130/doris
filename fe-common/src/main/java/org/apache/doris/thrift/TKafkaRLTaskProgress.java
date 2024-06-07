/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TKafkaRLTaskProgress implements org.apache.thrift.TBase<TKafkaRLTaskProgress, TKafkaRLTaskProgress._Fields>, java.io.Serializable, Cloneable, Comparable<TKafkaRLTaskProgress> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TKafkaRLTaskProgress");

  private static final org.apache.thrift.protocol.TField PARTITION_CMT_OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("partitionCmtOffset", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TKafkaRLTaskProgressStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TKafkaRLTaskProgressTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Integer,java.lang.Long> partitionCmtOffset; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARTITION_CMT_OFFSET((short)1, "partitionCmtOffset");

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
        case 1: // PARTITION_CMT_OFFSET
          return PARTITION_CMT_OFFSET;
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
    tmpMap.put(_Fields.PARTITION_CMT_OFFSET, new org.apache.thrift.meta_data.FieldMetaData("partitionCmtOffset", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TKafkaRLTaskProgress.class, metaDataMap);
  }

  public TKafkaRLTaskProgress() {
  }

  public TKafkaRLTaskProgress(
    java.util.Map<java.lang.Integer,java.lang.Long> partitionCmtOffset)
  {
    this();
    this.partitionCmtOffset = partitionCmtOffset;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TKafkaRLTaskProgress(TKafkaRLTaskProgress other) {
    if (other.isSetPartitionCmtOffset()) {
      java.util.Map<java.lang.Integer,java.lang.Long> __this__partitionCmtOffset = new java.util.HashMap<java.lang.Integer,java.lang.Long>(other.partitionCmtOffset);
      this.partitionCmtOffset = __this__partitionCmtOffset;
    }
  }

  public TKafkaRLTaskProgress deepCopy() {
    return new TKafkaRLTaskProgress(this);
  }

  @Override
  public void clear() {
    this.partitionCmtOffset = null;
  }

  public int getPartitionCmtOffsetSize() {
    return (this.partitionCmtOffset == null) ? 0 : this.partitionCmtOffset.size();
  }

  public void putToPartitionCmtOffset(int key, long val) {
    if (this.partitionCmtOffset == null) {
      this.partitionCmtOffset = new java.util.HashMap<java.lang.Integer,java.lang.Long>();
    }
    this.partitionCmtOffset.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.Integer,java.lang.Long> getPartitionCmtOffset() {
    return this.partitionCmtOffset;
  }

  public TKafkaRLTaskProgress setPartitionCmtOffset(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Integer,java.lang.Long> partitionCmtOffset) {
    this.partitionCmtOffset = partitionCmtOffset;
    return this;
  }

  public void unsetPartitionCmtOffset() {
    this.partitionCmtOffset = null;
  }

  /** Returns true if field partitionCmtOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionCmtOffset() {
    return this.partitionCmtOffset != null;
  }

  public void setPartitionCmtOffsetIsSet(boolean value) {
    if (!value) {
      this.partitionCmtOffset = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PARTITION_CMT_OFFSET:
      if (value == null) {
        unsetPartitionCmtOffset();
      } else {
        setPartitionCmtOffset((java.util.Map<java.lang.Integer,java.lang.Long>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTITION_CMT_OFFSET:
      return getPartitionCmtOffset();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PARTITION_CMT_OFFSET:
      return isSetPartitionCmtOffset();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TKafkaRLTaskProgress)
      return this.equals((TKafkaRLTaskProgress)that);
    return false;
  }

  public boolean equals(TKafkaRLTaskProgress that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_partitionCmtOffset = true && this.isSetPartitionCmtOffset();
    boolean that_present_partitionCmtOffset = true && that.isSetPartitionCmtOffset();
    if (this_present_partitionCmtOffset || that_present_partitionCmtOffset) {
      if (!(this_present_partitionCmtOffset && that_present_partitionCmtOffset))
        return false;
      if (!this.partitionCmtOffset.equals(that.partitionCmtOffset))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPartitionCmtOffset()) ? 131071 : 524287);
    if (isSetPartitionCmtOffset())
      hashCode = hashCode * 8191 + partitionCmtOffset.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TKafkaRLTaskProgress other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetPartitionCmtOffset(), other.isSetPartitionCmtOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionCmtOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitionCmtOffset, other.partitionCmtOffset);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TKafkaRLTaskProgress(");
    boolean first = true;

    sb.append("partitionCmtOffset:");
    if (this.partitionCmtOffset == null) {
      sb.append("null");
    } else {
      sb.append(this.partitionCmtOffset);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (partitionCmtOffset == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'partitionCmtOffset' was not present! Struct: " + toString());
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TKafkaRLTaskProgressStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TKafkaRLTaskProgressStandardScheme getScheme() {
      return new TKafkaRLTaskProgressStandardScheme();
    }
  }

  private static class TKafkaRLTaskProgressStandardScheme extends org.apache.thrift.scheme.StandardScheme<TKafkaRLTaskProgress> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TKafkaRLTaskProgress struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITION_CMT_OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map342 = iprot.readMapBegin();
                struct.partitionCmtOffset = new java.util.HashMap<java.lang.Integer,java.lang.Long>(2*_map342.size);
                int _key343;
                long _val344;
                for (int _i345 = 0; _i345 < _map342.size; ++_i345)
                {
                  _key343 = iprot.readI32();
                  _val344 = iprot.readI64();
                  struct.partitionCmtOffset.put(_key343, _val344);
                }
                iprot.readMapEnd();
              }
              struct.setPartitionCmtOffsetIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TKafkaRLTaskProgress struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.partitionCmtOffset != null) {
        oprot.writeFieldBegin(PARTITION_CMT_OFFSET_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.I64, struct.partitionCmtOffset.size()));
          for (java.util.Map.Entry<java.lang.Integer, java.lang.Long> _iter346 : struct.partitionCmtOffset.entrySet())
          {
            oprot.writeI32(_iter346.getKey());
            oprot.writeI64(_iter346.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TKafkaRLTaskProgressTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TKafkaRLTaskProgressTupleScheme getScheme() {
      return new TKafkaRLTaskProgressTupleScheme();
    }
  }

  private static class TKafkaRLTaskProgressTupleScheme extends org.apache.thrift.scheme.TupleScheme<TKafkaRLTaskProgress> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TKafkaRLTaskProgress struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.partitionCmtOffset.size());
        for (java.util.Map.Entry<java.lang.Integer, java.lang.Long> _iter347 : struct.partitionCmtOffset.entrySet())
        {
          oprot.writeI32(_iter347.getKey());
          oprot.writeI64(_iter347.getValue());
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TKafkaRLTaskProgress struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map348 = iprot.readMapBegin(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.I64); 
        struct.partitionCmtOffset = new java.util.HashMap<java.lang.Integer,java.lang.Long>(2*_map348.size);
        int _key349;
        long _val350;
        for (int _i351 = 0; _i351 < _map348.size; ++_i351)
        {
          _key349 = iprot.readI32();
          _val350 = iprot.readI64();
          struct.partitionCmtOffset.put(_key349, _val350);
        }
      }
      struct.setPartitionCmtOffsetIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
