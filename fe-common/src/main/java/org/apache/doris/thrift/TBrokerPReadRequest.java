/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TBrokerPReadRequest implements org.apache.thrift.TBase<TBrokerPReadRequest, TBrokerPReadRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TBrokerPReadRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TBrokerPReadRequest");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField FD_FIELD_DESC = new org.apache.thrift.protocol.TField("fd", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("offset", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField LENGTH_FIELD_DESC = new org.apache.thrift.protocol.TField("length", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TBrokerPReadRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TBrokerPReadRequestTupleSchemeFactory();

  /**
   * 
   * @see TBrokerVersion
   */
  public @org.apache.thrift.annotation.Nullable TBrokerVersion version; // required
  public @org.apache.thrift.annotation.Nullable TBrokerFD fd; // required
  public long offset; // required
  public long length; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TBrokerVersion
     */
    VERSION((short)1, "version"),
    FD((short)2, "fd"),
    OFFSET((short)3, "offset"),
    LENGTH((short)4, "length");

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
        case 4: // LENGTH
          return LENGTH;
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
  private static final int __LENGTH_ISSET_ID = 1;
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
    tmpMap.put(_Fields.LENGTH, new org.apache.thrift.meta_data.FieldMetaData("length", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TBrokerPReadRequest.class, metaDataMap);
  }

  public TBrokerPReadRequest() {
  }

  public TBrokerPReadRequest(
    TBrokerVersion version,
    TBrokerFD fd,
    long offset,
    long length)
  {
    this();
    this.version = version;
    this.fd = fd;
    this.offset = offset;
    setOffsetIsSet(true);
    this.length = length;
    setLengthIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TBrokerPReadRequest(TBrokerPReadRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetVersion()) {
      this.version = other.version;
    }
    if (other.isSetFd()) {
      this.fd = new TBrokerFD(other.fd);
    }
    this.offset = other.offset;
    this.length = other.length;
  }

  public TBrokerPReadRequest deepCopy() {
    return new TBrokerPReadRequest(this);
  }

  @Override
  public void clear() {
    this.version = null;
    this.fd = null;
    setOffsetIsSet(false);
    this.offset = 0;
    setLengthIsSet(false);
    this.length = 0;
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
  public TBrokerPReadRequest setVersion(@org.apache.thrift.annotation.Nullable TBrokerVersion version) {
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

  public TBrokerPReadRequest setFd(@org.apache.thrift.annotation.Nullable TBrokerFD fd) {
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

  public TBrokerPReadRequest setOffset(long offset) {
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

  public long getLength() {
    return this.length;
  }

  public TBrokerPReadRequest setLength(long length) {
    this.length = length;
    setLengthIsSet(true);
    return this;
  }

  public void unsetLength() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LENGTH_ISSET_ID);
  }

  /** Returns true if field length is set (has been assigned a value) and false otherwise */
  public boolean isSetLength() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LENGTH_ISSET_ID);
  }

  public void setLengthIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LENGTH_ISSET_ID, value);
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

    case LENGTH:
      if (value == null) {
        unsetLength();
      } else {
        setLength((java.lang.Long)value);
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

    case LENGTH:
      return getLength();

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
    case LENGTH:
      return isSetLength();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TBrokerPReadRequest)
      return this.equals((TBrokerPReadRequest)that);
    return false;
  }

  public boolean equals(TBrokerPReadRequest that) {
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

    boolean this_present_length = true;
    boolean that_present_length = true;
    if (this_present_length || that_present_length) {
      if (!(this_present_length && that_present_length))
        return false;
      if (this.length != that.length)
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

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(length);

    return hashCode;
  }

  @Override
  public int compareTo(TBrokerPReadRequest other) {
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
    lastComparison = java.lang.Boolean.compare(isSetLength(), other.isSetLength());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLength()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.length, other.length);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TBrokerPReadRequest(");
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
    sb.append("length:");
    sb.append(this.length);
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
    // alas, we cannot check 'length' because it's a primitive and you chose the non-beans generator.
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

  private static class TBrokerPReadRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TBrokerPReadRequestStandardScheme getScheme() {
      return new TBrokerPReadRequestStandardScheme();
    }
  }

  private static class TBrokerPReadRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TBrokerPReadRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TBrokerPReadRequest struct) throws org.apache.thrift.TException {
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
          case 4: // LENGTH
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.length = iprot.readI64();
              struct.setLengthIsSet(true);
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
      if (!struct.isSetLength()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'length' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TBrokerPReadRequest struct) throws org.apache.thrift.TException {
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
      oprot.writeFieldBegin(LENGTH_FIELD_DESC);
      oprot.writeI64(struct.length);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TBrokerPReadRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TBrokerPReadRequestTupleScheme getScheme() {
      return new TBrokerPReadRequestTupleScheme();
    }
  }

  private static class TBrokerPReadRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TBrokerPReadRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TBrokerPReadRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.version.getValue());
      struct.fd.write(oprot);
      oprot.writeI64(struct.offset);
      oprot.writeI64(struct.length);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TBrokerPReadRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.version = org.apache.doris.thrift.TBrokerVersion.findByValue(iprot.readI32());
      struct.setVersionIsSet(true);
      struct.fd = new TBrokerFD();
      struct.fd.read(iprot);
      struct.setFdIsSet(true);
      struct.offset = iprot.readI64();
      struct.setOffsetIsSet(true);
      struct.length = iprot.readI64();
      struct.setLengthIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
