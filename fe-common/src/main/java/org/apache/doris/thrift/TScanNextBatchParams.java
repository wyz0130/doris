/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TScanNextBatchParams implements org.apache.thrift.TBase<TScanNextBatchParams, TScanNextBatchParams._Fields>, java.io.Serializable, Cloneable, Comparable<TScanNextBatchParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TScanNextBatchParams");

  private static final org.apache.thrift.protocol.TField CONTEXT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("context_id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("offset", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TScanNextBatchParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TScanNextBatchParamsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String context_id; // optional
  public long offset; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CONTEXT_ID((short)1, "context_id"),
    OFFSET((short)2, "offset");

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
        case 1: // CONTEXT_ID
          return CONTEXT_ID;
        case 2: // OFFSET
          return OFFSET;
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
  private static final int __OFFSET_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CONTEXT_ID,_Fields.OFFSET};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONTEXT_ID, new org.apache.thrift.meta_data.FieldMetaData("context_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OFFSET, new org.apache.thrift.meta_data.FieldMetaData("offset", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TScanNextBatchParams.class, metaDataMap);
  }

  public TScanNextBatchParams() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TScanNextBatchParams(TScanNextBatchParams other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetContextId()) {
      this.context_id = other.context_id;
    }
    this.offset = other.offset;
  }

  public TScanNextBatchParams deepCopy() {
    return new TScanNextBatchParams(this);
  }

  @Override
  public void clear() {
    this.context_id = null;
    setOffsetIsSet(false);
    this.offset = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getContextId() {
    return this.context_id;
  }

  public TScanNextBatchParams setContextId(@org.apache.thrift.annotation.Nullable java.lang.String context_id) {
    this.context_id = context_id;
    return this;
  }

  public void unsetContextId() {
    this.context_id = null;
  }

  /** Returns true if field context_id is set (has been assigned a value) and false otherwise */
  public boolean isSetContextId() {
    return this.context_id != null;
  }

  public void setContextIdIsSet(boolean value) {
    if (!value) {
      this.context_id = null;
    }
  }

  public long getOffset() {
    return this.offset;
  }

  public TScanNextBatchParams setOffset(long offset) {
    this.offset = offset;
    setOffsetIsSet(true);
    return this;
  }

  public void unsetOffset() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __OFFSET_ISSET_ID);
  }

  /** Returns true if field offset is set (has been assigned a value) and false otherwise */
  public boolean isSetOffset() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __OFFSET_ISSET_ID);
  }

  public void setOffsetIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __OFFSET_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CONTEXT_ID:
      if (value == null) {
        unsetContextId();
      } else {
        setContextId((java.lang.String)value);
      }
      break;

    case OFFSET:
      if (value == null) {
        unsetOffset();
      } else {
        setOffset((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CONTEXT_ID:
      return getContextId();

    case OFFSET:
      return getOffset();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CONTEXT_ID:
      return isSetContextId();
    case OFFSET:
      return isSetOffset();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TScanNextBatchParams)
      return this.equals((TScanNextBatchParams)that);
    return false;
  }

  public boolean equals(TScanNextBatchParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_context_id = true && this.isSetContextId();
    boolean that_present_context_id = true && that.isSetContextId();
    if (this_present_context_id || that_present_context_id) {
      if (!(this_present_context_id && that_present_context_id))
        return false;
      if (!this.context_id.equals(that.context_id))
        return false;
    }

    boolean this_present_offset = true && this.isSetOffset();
    boolean that_present_offset = true && that.isSetOffset();
    if (this_present_offset || that_present_offset) {
      if (!(this_present_offset && that_present_offset))
        return false;
      if (this.offset != that.offset)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetContextId()) ? 131071 : 524287);
    if (isSetContextId())
      hashCode = hashCode * 8191 + context_id.hashCode();

    hashCode = hashCode * 8191 + ((isSetOffset()) ? 131071 : 524287);
    if (isSetOffset())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(offset);

    return hashCode;
  }

  @Override
  public int compareTo(TScanNextBatchParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetContextId(), other.isSetContextId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContextId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.context_id, other.context_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetOffset(), other.isSetOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.offset, other.offset);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TScanNextBatchParams(");
    boolean first = true;

    if (isSetContextId()) {
      sb.append("context_id:");
      if (this.context_id == null) {
        sb.append("null");
      } else {
        sb.append(this.context_id);
      }
      first = false;
    }
    if (isSetOffset()) {
      if (!first) sb.append(", ");
      sb.append("offset:");
      sb.append(this.offset);
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

  private static class TScanNextBatchParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TScanNextBatchParamsStandardScheme getScheme() {
      return new TScanNextBatchParamsStandardScheme();
    }
  }

  private static class TScanNextBatchParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TScanNextBatchParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TScanNextBatchParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONTEXT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.context_id = iprot.readString();
              struct.setContextIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.offset = iprot.readI64();
              struct.setOffsetIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TScanNextBatchParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.context_id != null) {
        if (struct.isSetContextId()) {
          oprot.writeFieldBegin(CONTEXT_ID_FIELD_DESC);
          oprot.writeString(struct.context_id);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetOffset()) {
        oprot.writeFieldBegin(OFFSET_FIELD_DESC);
        oprot.writeI64(struct.offset);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TScanNextBatchParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TScanNextBatchParamsTupleScheme getScheme() {
      return new TScanNextBatchParamsTupleScheme();
    }
  }

  private static class TScanNextBatchParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TScanNextBatchParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TScanNextBatchParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetContextId()) {
        optionals.set(0);
      }
      if (struct.isSetOffset()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetContextId()) {
        oprot.writeString(struct.context_id);
      }
      if (struct.isSetOffset()) {
        oprot.writeI64(struct.offset);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TScanNextBatchParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.context_id = iprot.readString();
        struct.setContextIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.offset = iprot.readI64();
        struct.setOffsetIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

