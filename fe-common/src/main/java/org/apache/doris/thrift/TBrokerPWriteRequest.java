/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TBrokerPWriteRequest implements org.apache.thrift.TBase<TBrokerPWriteRequest, TBrokerPWriteRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TBrokerPWriteRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TBrokerPWriteRequest");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField FD_FIELD_DESC = new org.apache.thrift.protocol.TField("fd", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("offset", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TBrokerPWriteRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TBrokerPWriteRequestTupleSchemeFactory();

  /**
   * 
   * @see TBrokerVersion
   */
  public @org.apache.thrift.annotation.Nullable TBrokerVersion version; // required
  public @org.apache.thrift.annotation.Nullable TBrokerFD fd; // required
  public long offset; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer data; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TBrokerVersion
     */
    VERSION((short)1, "version"),
    FD((short)2, "fd"),
    OFFSET((short)3, "offset"),
    DATA((short)4, "data");

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
        case 1: // VERSION
          return VERSION;
        case 2: // FD
          return FD;
        case 3: // OFFSET
          return OFFSET;
        case 4: // DATA
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
  private static final int __OFFSET_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TBrokerVersion.class)));
    tmpMap.put(_Fields.FD, new org.apache.thrift.meta_data.FieldMetaData("fd", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TBrokerFD.class)));
    tmpMap.put(_Fields.OFFSET, new org.apache.thrift.meta_data.FieldMetaData("offset", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TBrokerPWriteRequest.class, metaDataMap);
  }

  public TBrokerPWriteRequest() {
  }

  public TBrokerPWriteRequest(
    TBrokerVersion version,
    TBrokerFD fd,
    long offset,
    java.nio.ByteBuffer data)
  {
    this();
    this.version = version;
    this.fd = fd;
    this.offset = offset;
    setOffsetIsSet(true);
    this.data = org.apache.thrift.TBaseHelper.copyBinary(data);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TBrokerPWriteRequest(TBrokerPWriteRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetVersion()) {
      this.version = other.version;
    }
    if (other.isSetFd()) {
      this.fd = new TBrokerFD(other.fd);
    }
    this.offset = other.offset;
    if (other.isSetData()) {
      this.data = org.apache.thrift.TBaseHelper.copyBinary(other.data);
    }
  }

  public TBrokerPWriteRequest deepCopy() {
    return new TBrokerPWriteRequest(this);
  }

  @Override
  public void clear() {
    this.version = null;
    this.fd = null;
    setOffsetIsSet(false);
    this.offset = 0;
    this.data = null;
  }

  /**
   * 
   * @see TBrokerVersion
   */
  @org.apache.thrift.annotation.Nullable
  public TBrokerVersion getVersion() {
    return this.version;
  }

  /**
   * 
   * @see TBrokerVersion
   */
  public TBrokerPWriteRequest setVersion(@org.apache.thrift.annotation.Nullable TBrokerVersion version) {
    this.version = version;
    return this;
  }

  public void unsetVersion() {
    this.version = null;
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return this.version != null;
  }

  public void setVersionIsSet(boolean value) {
    if (!value) {
      this.version = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TBrokerFD getFd() {
    return this.fd;
  }

  public TBrokerPWriteRequest setFd(@org.apache.thrift.annotation.Nullable TBrokerFD fd) {
    this.fd = fd;
    return this;
  }

  public void unsetFd() {
    this.fd = null;
  }

  /** Returns true if field fd is set (has been assigned a value) and false otherwise */
  public boolean isSetFd() {
    return this.fd != null;
  }

  public void setFdIsSet(boolean value) {
    if (!value) {
      this.fd = null;
    }
  }

  public long getOffset() {
    return this.offset;
  }

  public TBrokerPWriteRequest setOffset(long offset) {
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

  public byte[] getData() {
    setData(org.apache.thrift.TBaseHelper.rightSize(data));
    return data == null ? null : data.array();
  }

  public java.nio.ByteBuffer bufferForData() {
    return org.apache.thrift.TBaseHelper.copyBinary(data);
  }

  public TBrokerPWriteRequest setData(byte[] data) {
    this.data = data == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(data.clone());
    return this;
  }

  public TBrokerPWriteRequest setData(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer data) {
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
    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((TBrokerVersion)value);
      }
      break;

    case FD:
      if (value == null) {
        unsetFd();
      } else {
        setFd((TBrokerFD)value);
      }
      break;

    case OFFSET:
      if (value == null) {
        unsetOffset();
      } else {
        setOffset((java.lang.Long)value);
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
    case VERSION:
      return getVersion();

    case FD:
      return getFd();

    case OFFSET:
      return getOffset();

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
    case VERSION:
      return isSetVersion();
    case FD:
      return isSetFd();
    case OFFSET:
      return isSetOffset();
    case DATA:
      return isSetData();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TBrokerPWriteRequest)
      return this.equals((TBrokerPWriteRequest)that);
    return false;
  }

  public boolean equals(TBrokerPWriteRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (!this.version.equals(that.version))
        return false;
    }

    boolean this_present_fd = true && this.isSetFd();
    boolean that_present_fd = true && that.isSetFd();
    if (this_present_fd || that_present_fd) {
      if (!(this_present_fd && that_present_fd))
        return false;
      if (!this.fd.equals(that.fd))
        return false;
    }

    boolean this_present_offset = true;
    boolean that_present_offset = true;
    if (this_present_offset || that_present_offset) {
      if (!(this_present_offset && that_present_offset))
        return false;
      if (this.offset != that.offset)
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

    hashCode = hashCode * 8191 + ((isSetVersion()) ? 131071 : 524287);
    if (isSetVersion())
      hashCode = hashCode * 8191 + version.getValue();

    hashCode = hashCode * 8191 + ((isSetFd()) ? 131071 : 524287);
    if (isSetFd())
      hashCode = hashCode * 8191 + fd.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(offset);

    hashCode = hashCode * 8191 + ((isSetData()) ? 131071 : 524287);
    if (isSetData())
      hashCode = hashCode * 8191 + data.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TBrokerPWriteRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetVersion(), other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetFd(), other.isSetFd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fd, other.fd);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TBrokerPWriteRequest(");
    boolean first = true;

    sb.append("version:");
    if (this.version == null) {
      sb.append("null");
    } else {
      sb.append(this.version);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fd:");
    if (this.fd == null) {
      sb.append("null");
    } else {
      sb.append(this.fd);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("offset:");
    sb.append(this.offset);
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.data, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (version == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'version' was not present! Struct: " + toString());
    }
    if (fd == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'fd' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'offset' because it's a primitive and you chose the non-beans generator.
    if (data == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'data' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (fd != null) {
      fd.validate();
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

  private static class TBrokerPWriteRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TBrokerPWriteRequestStandardScheme getScheme() {
      return new TBrokerPWriteRequestStandardScheme();
    }
  }

  private static class TBrokerPWriteRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TBrokerPWriteRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TBrokerPWriteRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.version = org.apache.doris.thrift.TBrokerVersion.findByValue(iprot.readI32());
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.fd = new TBrokerFD();
              struct.fd.read(iprot);
              struct.setFdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.offset = iprot.readI64();
              struct.setOffsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DATA
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
      if (!struct.isSetOffset()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'offset' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TBrokerPWriteRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.version != null) {
        oprot.writeFieldBegin(VERSION_FIELD_DESC);
        oprot.writeI32(struct.version.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.fd != null) {
        oprot.writeFieldBegin(FD_FIELD_DESC);
        struct.fd.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(OFFSET_FIELD_DESC);
      oprot.writeI64(struct.offset);
      oprot.writeFieldEnd();
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        oprot.writeBinary(struct.data);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TBrokerPWriteRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TBrokerPWriteRequestTupleScheme getScheme() {
      return new TBrokerPWriteRequestTupleScheme();
    }
  }

  private static class TBrokerPWriteRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TBrokerPWriteRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TBrokerPWriteRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.version.getValue());
      struct.fd.write(oprot);
      oprot.writeI64(struct.offset);
      oprot.writeBinary(struct.data);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TBrokerPWriteRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.version = org.apache.doris.thrift.TBrokerVersion.findByValue(iprot.readI32());
      struct.setVersionIsSet(true);
      struct.fd = new TBrokerFD();
      struct.fd.read(iprot);
      struct.setFdIsSet(true);
      struct.offset = iprot.readI64();
      struct.setOffsetIsSet(true);
      struct.data = iprot.readBinary();
      struct.setDataIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

