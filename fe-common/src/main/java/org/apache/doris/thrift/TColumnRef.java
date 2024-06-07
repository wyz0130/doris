/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TColumnRef implements org.apache.thrift.TBase<TColumnRef, TColumnRef._Fields>, java.io.Serializable, Cloneable, Comparable<TColumnRef> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TColumnRef");

  private static final org.apache.thrift.protocol.TField COLUMN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("column_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMN_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("column_name", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TColumnRefStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TColumnRefTupleSchemeFactory();

  public int column_id; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String column_name; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COLUMN_ID((short)1, "column_id"),
    COLUMN_NAME((short)2, "column_name");

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
        case 1: // COLUMN_ID
          return COLUMN_ID;
        case 2: // COLUMN_NAME
          return COLUMN_NAME;
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
  private static final int __COLUMN_ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.COLUMN_ID,_Fields.COLUMN_NAME};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COLUMN_ID, new org.apache.thrift.meta_data.FieldMetaData("column_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TSlotId")));
    tmpMap.put(_Fields.COLUMN_NAME, new org.apache.thrift.meta_data.FieldMetaData("column_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TColumnRef.class, metaDataMap);
  }

  public TColumnRef() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TColumnRef(TColumnRef other) {
    __isset_bitfield = other.__isset_bitfield;
    this.column_id = other.column_id;
    if (other.isSetColumnName()) {
      this.column_name = other.column_name;
    }
  }

  public TColumnRef deepCopy() {
    return new TColumnRef(this);
  }

  @Override
  public void clear() {
    setColumnIdIsSet(false);
    this.column_id = 0;
    this.column_name = null;
  }

  public int getColumnId() {
    return this.column_id;
  }

  public TColumnRef setColumnId(int column_id) {
    this.column_id = column_id;
    setColumnIdIsSet(true);
    return this;
  }

  public void unsetColumnId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COLUMN_ID_ISSET_ID);
  }

  /** Returns true if field column_id is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COLUMN_ID_ISSET_ID);
  }

  public void setColumnIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COLUMN_ID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getColumnName() {
    return this.column_name;
  }

  public TColumnRef setColumnName(@org.apache.thrift.annotation.Nullable java.lang.String column_name) {
    this.column_name = column_name;
    return this;
  }

  public void unsetColumnName() {
    this.column_name = null;
  }

  /** Returns true if field column_name is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnName() {
    return this.column_name != null;
  }

  public void setColumnNameIsSet(boolean value) {
    if (!value) {
      this.column_name = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case COLUMN_ID:
      if (value == null) {
        unsetColumnId();
      } else {
        setColumnId((java.lang.Integer)value);
      }
      break;

    case COLUMN_NAME:
      if (value == null) {
        unsetColumnName();
      } else {
        setColumnName((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case COLUMN_ID:
      return getColumnId();

    case COLUMN_NAME:
      return getColumnName();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case COLUMN_ID:
      return isSetColumnId();
    case COLUMN_NAME:
      return isSetColumnName();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TColumnRef)
      return this.equals((TColumnRef)that);
    return false;
  }

  public boolean equals(TColumnRef that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_column_id = true && this.isSetColumnId();
    boolean that_present_column_id = true && that.isSetColumnId();
    if (this_present_column_id || that_present_column_id) {
      if (!(this_present_column_id && that_present_column_id))
        return false;
      if (this.column_id != that.column_id)
        return false;
    }

    boolean this_present_column_name = true && this.isSetColumnName();
    boolean that_present_column_name = true && that.isSetColumnName();
    if (this_present_column_name || that_present_column_name) {
      if (!(this_present_column_name && that_present_column_name))
        return false;
      if (!this.column_name.equals(that.column_name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetColumnId()) ? 131071 : 524287);
    if (isSetColumnId())
      hashCode = hashCode * 8191 + column_id;

    hashCode = hashCode * 8191 + ((isSetColumnName()) ? 131071 : 524287);
    if (isSetColumnName())
      hashCode = hashCode * 8191 + column_name.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TColumnRef other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetColumnId(), other.isSetColumnId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.column_id, other.column_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetColumnName(), other.isSetColumnName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.column_name, other.column_name);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TColumnRef(");
    boolean first = true;

    if (isSetColumnId()) {
      sb.append("column_id:");
      sb.append(this.column_id);
      first = false;
    }
    if (isSetColumnName()) {
      if (!first) sb.append(", ");
      sb.append("column_name:");
      if (this.column_name == null) {
        sb.append("null");
      } else {
        sb.append(this.column_name);
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

  private static class TColumnRefStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TColumnRefStandardScheme getScheme() {
      return new TColumnRefStandardScheme();
    }
  }

  private static class TColumnRefStandardScheme extends org.apache.thrift.scheme.StandardScheme<TColumnRef> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TColumnRef struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COLUMN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.column_id = iprot.readI32();
              struct.setColumnIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMN_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.column_name = iprot.readString();
              struct.setColumnNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TColumnRef struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetColumnId()) {
        oprot.writeFieldBegin(COLUMN_ID_FIELD_DESC);
        oprot.writeI32(struct.column_id);
        oprot.writeFieldEnd();
      }
      if (struct.column_name != null) {
        if (struct.isSetColumnName()) {
          oprot.writeFieldBegin(COLUMN_NAME_FIELD_DESC);
          oprot.writeString(struct.column_name);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TColumnRefTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TColumnRefTupleScheme getScheme() {
      return new TColumnRefTupleScheme();
    }
  }

  private static class TColumnRefTupleScheme extends org.apache.thrift.scheme.TupleScheme<TColumnRef> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TColumnRef struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetColumnId()) {
        optionals.set(0);
      }
      if (struct.isSetColumnName()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetColumnId()) {
        oprot.writeI32(struct.column_id);
      }
      if (struct.isSetColumnName()) {
        oprot.writeString(struct.column_name);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TColumnRef struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.column_id = iprot.readI32();
        struct.setColumnIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.column_name = iprot.readString();
        struct.setColumnNameIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
