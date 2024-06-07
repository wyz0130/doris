/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TBucketingMode implements org.apache.thrift.TBase<TBucketingMode, TBucketingMode._Fields>, java.io.Serializable, Cloneable, Comparable<TBucketingMode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TBucketingMode");

  private static final org.apache.thrift.protocol.TField BUCKET_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("bucket_version", org.apache.thrift.protocol.TType.I32, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TBucketingModeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TBucketingModeTupleSchemeFactory();

  public int bucket_version; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BUCKET_VERSION((short)1, "bucket_version");

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
        case 1: // BUCKET_VERSION
          return BUCKET_VERSION;
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
  private static final int __BUCKET_VERSION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.BUCKET_VERSION};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BUCKET_VERSION, new org.apache.thrift.meta_data.FieldMetaData("bucket_version", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TBucketingMode.class, metaDataMap);
  }

  public TBucketingMode() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TBucketingMode(TBucketingMode other) {
    __isset_bitfield = other.__isset_bitfield;
    this.bucket_version = other.bucket_version;
  }

  public TBucketingMode deepCopy() {
    return new TBucketingMode(this);
  }

  @Override
  public void clear() {
    setBucketVersionIsSet(false);
    this.bucket_version = 0;
  }

  public int getBucketVersion() {
    return this.bucket_version;
  }

  public TBucketingMode setBucketVersion(int bucket_version) {
    this.bucket_version = bucket_version;
    setBucketVersionIsSet(true);
    return this;
  }

  public void unsetBucketVersion() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BUCKET_VERSION_ISSET_ID);
  }

  /** Returns true if field bucket_version is set (has been assigned a value) and false otherwise */
  public boolean isSetBucketVersion() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BUCKET_VERSION_ISSET_ID);
  }

  public void setBucketVersionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BUCKET_VERSION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case BUCKET_VERSION:
      if (value == null) {
        unsetBucketVersion();
      } else {
        setBucketVersion((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case BUCKET_VERSION:
      return getBucketVersion();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case BUCKET_VERSION:
      return isSetBucketVersion();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TBucketingMode)
      return this.equals((TBucketingMode)that);
    return false;
  }

  public boolean equals(TBucketingMode that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_bucket_version = true && this.isSetBucketVersion();
    boolean that_present_bucket_version = true && that.isSetBucketVersion();
    if (this_present_bucket_version || that_present_bucket_version) {
      if (!(this_present_bucket_version && that_present_bucket_version))
        return false;
      if (this.bucket_version != that.bucket_version)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetBucketVersion()) ? 131071 : 524287);
    if (isSetBucketVersion())
      hashCode = hashCode * 8191 + bucket_version;

    return hashCode;
  }

  @Override
  public int compareTo(TBucketingMode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetBucketVersion(), other.isSetBucketVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBucketVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bucket_version, other.bucket_version);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TBucketingMode(");
    boolean first = true;

    if (isSetBucketVersion()) {
      sb.append("bucket_version:");
      sb.append(this.bucket_version);
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

  private static class TBucketingModeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TBucketingModeStandardScheme getScheme() {
      return new TBucketingModeStandardScheme();
    }
  }

  private static class TBucketingModeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TBucketingMode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TBucketingMode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BUCKET_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.bucket_version = iprot.readI32();
              struct.setBucketVersionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TBucketingMode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetBucketVersion()) {
        oprot.writeFieldBegin(BUCKET_VERSION_FIELD_DESC);
        oprot.writeI32(struct.bucket_version);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TBucketingModeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TBucketingModeTupleScheme getScheme() {
      return new TBucketingModeTupleScheme();
    }
  }

  private static class TBucketingModeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TBucketingMode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TBucketingMode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetBucketVersion()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetBucketVersion()) {
        oprot.writeI32(struct.bucket_version);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TBucketingMode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.bucket_version = iprot.readI32();
        struct.setBucketVersionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

