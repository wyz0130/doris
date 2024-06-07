/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TBrokerReadResponse implements org.apache.thrift.TBase<TBrokerReadResponse, TBrokerReadResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TBrokerReadResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TBrokerReadResponse");

  private static final org.apache.thrift.protocol.TField OP_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("opStatus", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TBrokerReadResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TBrokerReadResponseTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable TBrokerOperationStatus opStatus; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer data; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OP_STATUS((short)1, "opStatus"),
    DATA((short)2, "data");

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
        case 1: // OP_STATUS
          return OP_STATUS;
        case 2: // DATA
          return DATA;
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
  private static final _Fields optionals[] = {_Fields.DATA};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OP_STATUS, new org.apache.thrift.meta_data.FieldMetaData("opStatus", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TBrokerOperationStatus.class)));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TBrokerReadResponse.class, metaDataMap);
  }

  public TBrokerReadResponse() {
  }

  public TBrokerReadResponse(
    TBrokerOperationStatus opStatus)
  {
    this();
    this.opStatus = opStatus;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TBrokerReadResponse(TBrokerReadResponse other) {
    if (other.isSetOpStatus()) {
      this.opStatus = new TBrokerOperationStatus(other.opStatus);
    }
    if (other.isSetData()) {
      this.data = org.apache.thrift.TBaseHelper.copyBinary(other.data);
    }
  }

  public TBrokerReadResponse deepCopy() {
    return new TBrokerReadResponse(this);
  }

  @Override
  public void clear() {
    this.opStatus = null;
    this.data = null;
  }

  @org.apache.thrift.annotation.Nullable
  public TBrokerOperationStatus getOpStatus() {
    return this.opStatus;
  }

  public TBrokerReadResponse setOpStatus(@org.apache.thrift.annotation.Nullable TBrokerOperationStatus opStatus) {
    this.opStatus = opStatus;
    return this;
  }

  public void unsetOpStatus() {
    this.opStatus = null;
  }

  /** Returns true if field opStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetOpStatus() {
    return this.opStatus != null;
  }

  public void setOpStatusIsSet(boolean value) {
    if (!value) {
      this.opStatus = null;
    }
  }

  public byte[] getData() {
    setData(org.apache.thrift.TBaseHelper.rightSize(data));
    return data == null ? null : data.array();
  }

  public java.nio.ByteBuffer bufferForData() {
    return org.apache.thrift.TBaseHelper.copyBinary(data);
  }

  public TBrokerReadResponse setData(byte[] data) {
    this.data = data == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(data.clone());
    return this;
  }

  public TBrokerReadResponse setData(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer data) {
    this.data = org.apache.thrift.TBaseHelper.copyBinary(data);
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case OP_STATUS:
      if (value == null) {
        unsetOpStatus();
      } else {
        setOpStatus((TBrokerOperationStatus)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        if (value instanceof byte[]) {
          setData((byte[])value);
        } else {
          setData((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case OP_STATUS:
      return getOpStatus();

    case DATA:
      return getData();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case OP_STATUS:
      return isSetOpStatus();
    case DATA:
      return isSetData();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TBrokerReadResponse)
      return this.equals((TBrokerReadResponse)that);
    return false;
  }

  public boolean equals(TBrokerReadResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_opStatus = true && this.isSetOpStatus();
    boolean that_present_opStatus = true && that.isSetOpStatus();
    if (this_present_opStatus || that_present_opStatus) {
      if (!(this_present_opStatus && that_present_opStatus))
        return false;
      if (!this.opStatus.equals(that.opStatus))
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetOpStatus()) ? 131071 : 524287);
    if (isSetOpStatus())
      hashCode = hashCode * 8191 + opStatus.hashCode();

    hashCode = hashCode * 8191 + ((isSetData()) ? 131071 : 524287);
    if (isSetData())
      hashCode = hashCode * 8191 + data.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TBrokerReadResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetOpStatus(), other.isSetOpStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.opStatus, other.opStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetData(), other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, other.data);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TBrokerReadResponse(");
    boolean first = true;

    sb.append("opStatus:");
    if (this.opStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.opStatus);
    }
    first = false;
    if (isSetData()) {
      if (!first) sb.append(", ");
      sb.append("data:");
      if (this.data == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.data, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (opStatus == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'opStatus' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (opStatus != null) {
      opStatus.validate();
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

  private static class TBrokerReadResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TBrokerReadResponseStandardScheme getScheme() {
      return new TBrokerReadResponseStandardScheme();
    }
  }

  private static class TBrokerReadResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<TBrokerReadResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TBrokerReadResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OP_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.opStatus = new TBrokerOperationStatus();
              struct.opStatus.read(iprot);
              struct.setOpStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.data = iprot.readBinary();
              struct.setDataIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TBrokerReadResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.opStatus != null) {
        oprot.writeFieldBegin(OP_STATUS_FIELD_DESC);
        struct.opStatus.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.data != null) {
        if (struct.isSetData()) {
          oprot.writeFieldBegin(DATA_FIELD_DESC);
          oprot.writeBinary(struct.data);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TBrokerReadResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TBrokerReadResponseTupleScheme getScheme() {
      return new TBrokerReadResponseTupleScheme();
    }
  }

  private static class TBrokerReadResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<TBrokerReadResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TBrokerReadResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.opStatus.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetData()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetData()) {
        oprot.writeBinary(struct.data);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TBrokerReadResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.opStatus = new TBrokerOperationStatus();
      struct.opStatus.read(iprot);
      struct.setOpStatusIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.data = iprot.readBinary();
        struct.setDataIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
