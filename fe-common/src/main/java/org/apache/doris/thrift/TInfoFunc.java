/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TInfoFunc implements org.apache.thrift.TBase<TInfoFunc, TInfoFunc._Fields>, java.io.Serializable, Cloneable, Comparable<TInfoFunc> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TInfoFunc");

  private static final org.apache.thrift.protocol.TField INT_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("int_value", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField STR_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("str_value", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TInfoFuncStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TInfoFuncTupleSchemeFactory();

  public long int_value; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String str_value; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INT_VALUE((short)1, "int_value"),
    STR_VALUE((short)2, "str_value");

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
        case 1: // INT_VALUE
          return INT_VALUE;
        case 2: // STR_VALUE
          return STR_VALUE;
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
  private static final int __INT_VALUE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INT_VALUE, new org.apache.thrift.meta_data.FieldMetaData("int_value", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.STR_VALUE, new org.apache.thrift.meta_data.FieldMetaData("str_value", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TInfoFunc.class, metaDataMap);
  }

  public TInfoFunc() {
  }

  public TInfoFunc(
    long int_value,
    java.lang.String str_value)
  {
    this();
    this.int_value = int_value;
    setIntValueIsSet(true);
    this.str_value = str_value;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TInfoFunc(TInfoFunc other) {
    __isset_bitfield = other.__isset_bitfield;
    this.int_value = other.int_value;
    if (other.isSetStrValue()) {
      this.str_value = other.str_value;
    }
  }

  public TInfoFunc deepCopy() {
    return new TInfoFunc(this);
  }

  @Override
  public void clear() {
    setIntValueIsSet(false);
    this.int_value = 0;
    this.str_value = null;
  }

  public long getIntValue() {
    return this.int_value;
  }

  public TInfoFunc setIntValue(long int_value) {
    this.int_value = int_value;
    setIntValueIsSet(true);
    return this;
  }

  public void unsetIntValue() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INT_VALUE_ISSET_ID);
  }

  /** Returns true if field int_value is set (has been assigned a value) and false otherwise */
  public boolean isSetIntValue() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INT_VALUE_ISSET_ID);
  }

  public void setIntValueIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INT_VALUE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getStrValue() {
    return this.str_value;
  }

  public TInfoFunc setStrValue(@org.apache.thrift.annotation.Nullable java.lang.String str_value) {
    this.str_value = str_value;
    return this;
  }

  public void unsetStrValue() {
    this.str_value = null;
  }

  /** Returns true if field str_value is set (has been assigned a value) and false otherwise */
  public boolean isSetStrValue() {
    return this.str_value != null;
  }

  public void setStrValueIsSet(boolean value) {
    if (!value) {
      this.str_value = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case INT_VALUE:
      if (value == null) {
        unsetIntValue();
      } else {
        setIntValue((java.lang.Long)value);
      }
      break;

    case STR_VALUE:
      if (value == null) {
        unsetStrValue();
      } else {
        setStrValue((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case INT_VALUE:
      return getIntValue();

    case STR_VALUE:
      return getStrValue();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case INT_VALUE:
      return isSetIntValue();
    case STR_VALUE:
      return isSetStrValue();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TInfoFunc)
      return this.equals((TInfoFunc)that);
    return false;
  }

  public boolean equals(TInfoFunc that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_int_value = true;
    boolean that_present_int_value = true;
    if (this_present_int_value || that_present_int_value) {
      if (!(this_present_int_value && that_present_int_value))
        return false;
      if (this.int_value != that.int_value)
        return false;
    }

    boolean this_present_str_value = true && this.isSetStrValue();
    boolean that_present_str_value = true && that.isSetStrValue();
    if (this_present_str_value || that_present_str_value) {
      if (!(this_present_str_value && that_present_str_value))
        return false;
      if (!this.str_value.equals(that.str_value))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(int_value);

    hashCode = hashCode * 8191 + ((isSetStrValue()) ? 131071 : 524287);
    if (isSetStrValue())
      hashCode = hashCode * 8191 + str_value.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TInfoFunc other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetIntValue(), other.isSetIntValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIntValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.int_value, other.int_value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetStrValue(), other.isSetStrValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStrValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.str_value, other.str_value);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TInfoFunc(");
    boolean first = true;

    sb.append("int_value:");
    sb.append(this.int_value);
    first = false;
    if (!first) sb.append(", ");
    sb.append("str_value:");
    if (this.str_value == null) {
      sb.append("null");
    } else {
      sb.append(this.str_value);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'int_value' because it's a primitive and you chose the non-beans generator.
    if (str_value == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'str_value' was not present! Struct: " + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TInfoFuncStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TInfoFuncStandardScheme getScheme() {
      return new TInfoFuncStandardScheme();
    }
  }

  private static class TInfoFuncStandardScheme extends org.apache.thrift.scheme.StandardScheme<TInfoFunc> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TInfoFunc struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INT_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.int_value = iprot.readI64();
              struct.setIntValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STR_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.str_value = iprot.readString();
              struct.setStrValueIsSet(true);
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
      if (!struct.isSetIntValue()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'int_value' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TInfoFunc struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(INT_VALUE_FIELD_DESC);
      oprot.writeI64(struct.int_value);
      oprot.writeFieldEnd();
      if (struct.str_value != null) {
        oprot.writeFieldBegin(STR_VALUE_FIELD_DESC);
        oprot.writeString(struct.str_value);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TInfoFuncTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TInfoFuncTupleScheme getScheme() {
      return new TInfoFuncTupleScheme();
    }
  }

  private static class TInfoFuncTupleScheme extends org.apache.thrift.scheme.TupleScheme<TInfoFunc> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TInfoFunc struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.int_value);
      oprot.writeString(struct.str_value);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TInfoFunc struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.int_value = iprot.readI64();
      struct.setIntValueIsSet(true);
      struct.str_value = iprot.readString();
      struct.setStrValueIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

