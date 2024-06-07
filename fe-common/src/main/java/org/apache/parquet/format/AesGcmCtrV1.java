/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.parquet.format;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class AesGcmCtrV1 implements org.apache.thrift.TBase<AesGcmCtrV1, AesGcmCtrV1._Fields>, java.io.Serializable, Cloneable, Comparable<AesGcmCtrV1> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AesGcmCtrV1");

  private static final org.apache.thrift.protocol.TField AAD_PREFIX_FIELD_DESC = new org.apache.thrift.protocol.TField("aad_prefix", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField AAD_FILE_UNIQUE_FIELD_DESC = new org.apache.thrift.protocol.TField("aad_file_unique", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SUPPLY_AAD_PREFIX_FIELD_DESC = new org.apache.thrift.protocol.TField("supply_aad_prefix", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AesGcmCtrV1StandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AesGcmCtrV1TupleSchemeFactory();

  /**
   * AAD prefix *
   */
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer aad_prefix; // optional
  /**
   * Unique file identifier part of AAD suffix *
   */
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer aad_file_unique; // optional
  /**
   * In files encrypted with AAD prefix without storing it,
   * readers must supply the prefix *
   */
  public boolean supply_aad_prefix; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * AAD prefix *
     */
    AAD_PREFIX((short)1, "aad_prefix"),
    /**
     * Unique file identifier part of AAD suffix *
     */
    AAD_FILE_UNIQUE((short)2, "aad_file_unique"),
    /**
     * In files encrypted with AAD prefix without storing it,
     * readers must supply the prefix *
     */
    SUPPLY_AAD_PREFIX((short)3, "supply_aad_prefix");

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
        case 1: // AAD_PREFIX
          return AAD_PREFIX;
        case 2: // AAD_FILE_UNIQUE
          return AAD_FILE_UNIQUE;
        case 3: // SUPPLY_AAD_PREFIX
          return SUPPLY_AAD_PREFIX;
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
  private static final int __SUPPLY_AAD_PREFIX_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.AAD_PREFIX,_Fields.AAD_FILE_UNIQUE,_Fields.SUPPLY_AAD_PREFIX};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.AAD_PREFIX, new org.apache.thrift.meta_data.FieldMetaData("aad_prefix", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.AAD_FILE_UNIQUE, new org.apache.thrift.meta_data.FieldMetaData("aad_file_unique", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.SUPPLY_AAD_PREFIX, new org.apache.thrift.meta_data.FieldMetaData("supply_aad_prefix", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AesGcmCtrV1.class, metaDataMap);
  }

  public AesGcmCtrV1() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AesGcmCtrV1(AesGcmCtrV1 other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetAadPrefix()) {
      this.aad_prefix = org.apache.thrift.TBaseHelper.copyBinary(other.aad_prefix);
    }
    if (other.isSetAadFileUnique()) {
      this.aad_file_unique = org.apache.thrift.TBaseHelper.copyBinary(other.aad_file_unique);
    }
    this.supply_aad_prefix = other.supply_aad_prefix;
  }

  public AesGcmCtrV1 deepCopy() {
    return new AesGcmCtrV1(this);
  }

  @Override
  public void clear() {
    this.aad_prefix = null;
    this.aad_file_unique = null;
    setSupplyAadPrefixIsSet(false);
    this.supply_aad_prefix = false;
  }

  /**
   * AAD prefix *
   */
  public byte[] getAadPrefix() {
    setAadPrefix(org.apache.thrift.TBaseHelper.rightSize(aad_prefix));
    return aad_prefix == null ? null : aad_prefix.array();
  }

  public java.nio.ByteBuffer bufferForAadPrefix() {
    return org.apache.thrift.TBaseHelper.copyBinary(aad_prefix);
  }

  /**
   * AAD prefix *
   */
  public AesGcmCtrV1 setAadPrefix(byte[] aad_prefix) {
    this.aad_prefix = aad_prefix == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(aad_prefix.clone());
    return this;
  }

  public AesGcmCtrV1 setAadPrefix(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer aad_prefix) {
    this.aad_prefix = org.apache.thrift.TBaseHelper.copyBinary(aad_prefix);
    return this;
  }

  public void unsetAadPrefix() {
    this.aad_prefix = null;
  }

  /** Returns true if field aad_prefix is set (has been assigned a value) and false otherwise */
  public boolean isSetAadPrefix() {
    return this.aad_prefix != null;
  }

  public void setAadPrefixIsSet(boolean value) {
    if (!value) {
      this.aad_prefix = null;
    }
  }

  /**
   * Unique file identifier part of AAD suffix *
   */
  public byte[] getAadFileUnique() {
    setAadFileUnique(org.apache.thrift.TBaseHelper.rightSize(aad_file_unique));
    return aad_file_unique == null ? null : aad_file_unique.array();
  }

  public java.nio.ByteBuffer bufferForAadFileUnique() {
    return org.apache.thrift.TBaseHelper.copyBinary(aad_file_unique);
  }

  /**
   * Unique file identifier part of AAD suffix *
   */
  public AesGcmCtrV1 setAadFileUnique(byte[] aad_file_unique) {
    this.aad_file_unique = aad_file_unique == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(aad_file_unique.clone());
    return this;
  }

  public AesGcmCtrV1 setAadFileUnique(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer aad_file_unique) {
    this.aad_file_unique = org.apache.thrift.TBaseHelper.copyBinary(aad_file_unique);
    return this;
  }

  public void unsetAadFileUnique() {
    this.aad_file_unique = null;
  }

  /** Returns true if field aad_file_unique is set (has been assigned a value) and false otherwise */
  public boolean isSetAadFileUnique() {
    return this.aad_file_unique != null;
  }

  public void setAadFileUniqueIsSet(boolean value) {
    if (!value) {
      this.aad_file_unique = null;
    }
  }

  /**
   * In files encrypted with AAD prefix without storing it,
   * readers must supply the prefix *
   */
  public boolean isSupplyAadPrefix() {
    return this.supply_aad_prefix;
  }

  /**
   * In files encrypted with AAD prefix without storing it,
   * readers must supply the prefix *
   */
  public AesGcmCtrV1 setSupplyAadPrefix(boolean supply_aad_prefix) {
    this.supply_aad_prefix = supply_aad_prefix;
    setSupplyAadPrefixIsSet(true);
    return this;
  }

  public void unsetSupplyAadPrefix() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SUPPLY_AAD_PREFIX_ISSET_ID);
  }

  /** Returns true if field supply_aad_prefix is set (has been assigned a value) and false otherwise */
  public boolean isSetSupplyAadPrefix() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SUPPLY_AAD_PREFIX_ISSET_ID);
  }

  public void setSupplyAadPrefixIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SUPPLY_AAD_PREFIX_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case AAD_PREFIX:
      if (value == null) {
        unsetAadPrefix();
      } else {
        if (value instanceof byte[]) {
          setAadPrefix((byte[])value);
        } else {
          setAadPrefix((java.nio.ByteBuffer)value);
        }
      }
      break;

    case AAD_FILE_UNIQUE:
      if (value == null) {
        unsetAadFileUnique();
      } else {
        if (value instanceof byte[]) {
          setAadFileUnique((byte[])value);
        } else {
          setAadFileUnique((java.nio.ByteBuffer)value);
        }
      }
      break;

    case SUPPLY_AAD_PREFIX:
      if (value == null) {
        unsetSupplyAadPrefix();
      } else {
        setSupplyAadPrefix((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case AAD_PREFIX:
      return getAadPrefix();

    case AAD_FILE_UNIQUE:
      return getAadFileUnique();

    case SUPPLY_AAD_PREFIX:
      return isSupplyAadPrefix();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case AAD_PREFIX:
      return isSetAadPrefix();
    case AAD_FILE_UNIQUE:
      return isSetAadFileUnique();
    case SUPPLY_AAD_PREFIX:
      return isSetSupplyAadPrefix();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof AesGcmCtrV1)
      return this.equals((AesGcmCtrV1)that);
    return false;
  }

  public boolean equals(AesGcmCtrV1 that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_aad_prefix = true && this.isSetAadPrefix();
    boolean that_present_aad_prefix = true && that.isSetAadPrefix();
    if (this_present_aad_prefix || that_present_aad_prefix) {
      if (!(this_present_aad_prefix && that_present_aad_prefix))
        return false;
      if (!this.aad_prefix.equals(that.aad_prefix))
        return false;
    }

    boolean this_present_aad_file_unique = true && this.isSetAadFileUnique();
    boolean that_present_aad_file_unique = true && that.isSetAadFileUnique();
    if (this_present_aad_file_unique || that_present_aad_file_unique) {
      if (!(this_present_aad_file_unique && that_present_aad_file_unique))
        return false;
      if (!this.aad_file_unique.equals(that.aad_file_unique))
        return false;
    }

    boolean this_present_supply_aad_prefix = true && this.isSetSupplyAadPrefix();
    boolean that_present_supply_aad_prefix = true && that.isSetSupplyAadPrefix();
    if (this_present_supply_aad_prefix || that_present_supply_aad_prefix) {
      if (!(this_present_supply_aad_prefix && that_present_supply_aad_prefix))
        return false;
      if (this.supply_aad_prefix != that.supply_aad_prefix)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAadPrefix()) ? 131071 : 524287);
    if (isSetAadPrefix())
      hashCode = hashCode * 8191 + aad_prefix.hashCode();

    hashCode = hashCode * 8191 + ((isSetAadFileUnique()) ? 131071 : 524287);
    if (isSetAadFileUnique())
      hashCode = hashCode * 8191 + aad_file_unique.hashCode();

    hashCode = hashCode * 8191 + ((isSetSupplyAadPrefix()) ? 131071 : 524287);
    if (isSetSupplyAadPrefix())
      hashCode = hashCode * 8191 + ((supply_aad_prefix) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(AesGcmCtrV1 other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetAadPrefix(), other.isSetAadPrefix());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAadPrefix()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.aad_prefix, other.aad_prefix);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetAadFileUnique(), other.isSetAadFileUnique());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAadFileUnique()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.aad_file_unique, other.aad_file_unique);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSupplyAadPrefix(), other.isSetSupplyAadPrefix());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSupplyAadPrefix()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.supply_aad_prefix, other.supply_aad_prefix);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("AesGcmCtrV1(");
    boolean first = true;

    if (isSetAadPrefix()) {
      sb.append("aad_prefix:");
      if (this.aad_prefix == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.aad_prefix, sb);
      }
      first = false;
    }
    if (isSetAadFileUnique()) {
      if (!first) sb.append(", ");
      sb.append("aad_file_unique:");
      if (this.aad_file_unique == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.aad_file_unique, sb);
      }
      first = false;
    }
    if (isSetSupplyAadPrefix()) {
      if (!first) sb.append(", ");
      sb.append("supply_aad_prefix:");
      sb.append(this.supply_aad_prefix);
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

  private static class AesGcmCtrV1StandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AesGcmCtrV1StandardScheme getScheme() {
      return new AesGcmCtrV1StandardScheme();
    }
  }

  private static class AesGcmCtrV1StandardScheme extends org.apache.thrift.scheme.StandardScheme<AesGcmCtrV1> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AesGcmCtrV1 struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AAD_PREFIX
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.aad_prefix = iprot.readBinary();
              struct.setAadPrefixIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AAD_FILE_UNIQUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.aad_file_unique = iprot.readBinary();
              struct.setAadFileUniqueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SUPPLY_AAD_PREFIX
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.supply_aad_prefix = iprot.readBool();
              struct.setSupplyAadPrefixIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AesGcmCtrV1 struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.aad_prefix != null) {
        if (struct.isSetAadPrefix()) {
          oprot.writeFieldBegin(AAD_PREFIX_FIELD_DESC);
          oprot.writeBinary(struct.aad_prefix);
          oprot.writeFieldEnd();
        }
      }
      if (struct.aad_file_unique != null) {
        if (struct.isSetAadFileUnique()) {
          oprot.writeFieldBegin(AAD_FILE_UNIQUE_FIELD_DESC);
          oprot.writeBinary(struct.aad_file_unique);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetSupplyAadPrefix()) {
        oprot.writeFieldBegin(SUPPLY_AAD_PREFIX_FIELD_DESC);
        oprot.writeBool(struct.supply_aad_prefix);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AesGcmCtrV1TupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AesGcmCtrV1TupleScheme getScheme() {
      return new AesGcmCtrV1TupleScheme();
    }
  }

  private static class AesGcmCtrV1TupleScheme extends org.apache.thrift.scheme.TupleScheme<AesGcmCtrV1> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AesGcmCtrV1 struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAadPrefix()) {
        optionals.set(0);
      }
      if (struct.isSetAadFileUnique()) {
        optionals.set(1);
      }
      if (struct.isSetSupplyAadPrefix()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetAadPrefix()) {
        oprot.writeBinary(struct.aad_prefix);
      }
      if (struct.isSetAadFileUnique()) {
        oprot.writeBinary(struct.aad_file_unique);
      }
      if (struct.isSetSupplyAadPrefix()) {
        oprot.writeBool(struct.supply_aad_prefix);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AesGcmCtrV1 struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.aad_prefix = iprot.readBinary();
        struct.setAadPrefixIsSet(true);
      }
      if (incoming.get(1)) {
        struct.aad_file_unique = iprot.readBinary();
        struct.setAadFileUniqueIsSet(true);
      }
      if (incoming.get(2)) {
        struct.supply_aad_prefix = iprot.readBool();
        struct.setSupplyAadPrefixIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
