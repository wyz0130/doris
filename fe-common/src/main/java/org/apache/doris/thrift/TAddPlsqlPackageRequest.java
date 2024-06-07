/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TAddPlsqlPackageRequest implements org.apache.thrift.TBase<TAddPlsqlPackageRequest, TAddPlsqlPackageRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TAddPlsqlPackageRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAddPlsqlPackageRequest");

  private static final org.apache.thrift.protocol.TField PLSQL_PACKAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("plsqlPackage", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField IS_FORCE_FIELD_DESC = new org.apache.thrift.protocol.TField("isForce", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TAddPlsqlPackageRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TAddPlsqlPackageRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable TPlsqlPackage plsqlPackage; // optional
  public boolean isForce; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PLSQL_PACKAGE((short)1, "plsqlPackage"),
    IS_FORCE((short)2, "isForce");

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
        case 1: // PLSQL_PACKAGE
          return PLSQL_PACKAGE;
        case 2: // IS_FORCE
          return IS_FORCE;
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
  private static final int __ISFORCE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PLSQL_PACKAGE,_Fields.IS_FORCE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PLSQL_PACKAGE, new org.apache.thrift.meta_data.FieldMetaData("plsqlPackage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TPlsqlPackage.class)));
    tmpMap.put(_Fields.IS_FORCE, new org.apache.thrift.meta_data.FieldMetaData("isForce", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAddPlsqlPackageRequest.class, metaDataMap);
  }

  public TAddPlsqlPackageRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAddPlsqlPackageRequest(TAddPlsqlPackageRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPlsqlPackage()) {
      this.plsqlPackage = new TPlsqlPackage(other.plsqlPackage);
    }
    this.isForce = other.isForce;
  }

  public TAddPlsqlPackageRequest deepCopy() {
    return new TAddPlsqlPackageRequest(this);
  }

  @Override
  public void clear() {
    this.plsqlPackage = null;
    setIsForceIsSet(false);
    this.isForce = false;
  }

  @org.apache.thrift.annotation.Nullable
  public TPlsqlPackage getPlsqlPackage() {
    return this.plsqlPackage;
  }

  public TAddPlsqlPackageRequest setPlsqlPackage(@org.apache.thrift.annotation.Nullable TPlsqlPackage plsqlPackage) {
    this.plsqlPackage = plsqlPackage;
    return this;
  }

  public void unsetPlsqlPackage() {
    this.plsqlPackage = null;
  }

  /** Returns true if field plsqlPackage is set (has been assigned a value) and false otherwise */
  public boolean isSetPlsqlPackage() {
    return this.plsqlPackage != null;
  }

  public void setPlsqlPackageIsSet(boolean value) {
    if (!value) {
      this.plsqlPackage = null;
    }
  }

  public boolean isIsForce() {
    return this.isForce;
  }

  public TAddPlsqlPackageRequest setIsForce(boolean isForce) {
    this.isForce = isForce;
    setIsForceIsSet(true);
    return this;
  }

  public void unsetIsForce() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISFORCE_ISSET_ID);
  }

  /** Returns true if field isForce is set (has been assigned a value) and false otherwise */
  public boolean isSetIsForce() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISFORCE_ISSET_ID);
  }

  public void setIsForceIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISFORCE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PLSQL_PACKAGE:
      if (value == null) {
        unsetPlsqlPackage();
      } else {
        setPlsqlPackage((TPlsqlPackage)value);
      }
      break;

    case IS_FORCE:
      if (value == null) {
        unsetIsForce();
      } else {
        setIsForce((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PLSQL_PACKAGE:
      return getPlsqlPackage();

    case IS_FORCE:
      return isIsForce();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PLSQL_PACKAGE:
      return isSetPlsqlPackage();
    case IS_FORCE:
      return isSetIsForce();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TAddPlsqlPackageRequest)
      return this.equals((TAddPlsqlPackageRequest)that);
    return false;
  }

  public boolean equals(TAddPlsqlPackageRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_plsqlPackage = true && this.isSetPlsqlPackage();
    boolean that_present_plsqlPackage = true && that.isSetPlsqlPackage();
    if (this_present_plsqlPackage || that_present_plsqlPackage) {
      if (!(this_present_plsqlPackage && that_present_plsqlPackage))
        return false;
      if (!this.plsqlPackage.equals(that.plsqlPackage))
        return false;
    }

    boolean this_present_isForce = true && this.isSetIsForce();
    boolean that_present_isForce = true && that.isSetIsForce();
    if (this_present_isForce || that_present_isForce) {
      if (!(this_present_isForce && that_present_isForce))
        return false;
      if (this.isForce != that.isForce)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPlsqlPackage()) ? 131071 : 524287);
    if (isSetPlsqlPackage())
      hashCode = hashCode * 8191 + plsqlPackage.hashCode();

    hashCode = hashCode * 8191 + ((isSetIsForce()) ? 131071 : 524287);
    if (isSetIsForce())
      hashCode = hashCode * 8191 + ((isForce) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TAddPlsqlPackageRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetPlsqlPackage(), other.isSetPlsqlPackage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPlsqlPackage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.plsqlPackage, other.plsqlPackage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIsForce(), other.isSetIsForce());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsForce()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isForce, other.isForce);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TAddPlsqlPackageRequest(");
    boolean first = true;

    if (isSetPlsqlPackage()) {
      sb.append("plsqlPackage:");
      if (this.plsqlPackage == null) {
        sb.append("null");
      } else {
        sb.append(this.plsqlPackage);
      }
      first = false;
    }
    if (isSetIsForce()) {
      if (!first) sb.append(", ");
      sb.append("isForce:");
      sb.append(this.isForce);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (plsqlPackage != null) {
      plsqlPackage.validate();
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

  private static class TAddPlsqlPackageRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TAddPlsqlPackageRequestStandardScheme getScheme() {
      return new TAddPlsqlPackageRequestStandardScheme();
    }
  }

  private static class TAddPlsqlPackageRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TAddPlsqlPackageRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAddPlsqlPackageRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PLSQL_PACKAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.plsqlPackage = new TPlsqlPackage();
              struct.plsqlPackage.read(iprot);
              struct.setPlsqlPackageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IS_FORCE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isForce = iprot.readBool();
              struct.setIsForceIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAddPlsqlPackageRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.plsqlPackage != null) {
        if (struct.isSetPlsqlPackage()) {
          oprot.writeFieldBegin(PLSQL_PACKAGE_FIELD_DESC);
          struct.plsqlPackage.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetIsForce()) {
        oprot.writeFieldBegin(IS_FORCE_FIELD_DESC);
        oprot.writeBool(struct.isForce);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAddPlsqlPackageRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TAddPlsqlPackageRequestTupleScheme getScheme() {
      return new TAddPlsqlPackageRequestTupleScheme();
    }
  }

  private static class TAddPlsqlPackageRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TAddPlsqlPackageRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAddPlsqlPackageRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPlsqlPackage()) {
        optionals.set(0);
      }
      if (struct.isSetIsForce()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetPlsqlPackage()) {
        struct.plsqlPackage.write(oprot);
      }
      if (struct.isSetIsForce()) {
        oprot.writeBool(struct.isForce);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAddPlsqlPackageRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.plsqlPackage = new TPlsqlPackage();
        struct.plsqlPackage.read(iprot);
        struct.setPlsqlPackageIsSet(true);
      }
      if (incoming.get(1)) {
        struct.isForce = iprot.readBool();
        struct.setIsForceIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

