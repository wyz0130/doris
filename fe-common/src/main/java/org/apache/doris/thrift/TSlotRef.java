/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TSlotRef implements org.apache.thrift.TBase<TSlotRef, TSlotRef._Fields>, java.io.Serializable, Cloneable, Comparable<TSlotRef> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSlotRef");

  private static final org.apache.thrift.protocol.TField SLOT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("slot_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TUPLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tuple_id", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField COL_UNIQUE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("col_unique_id", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TSlotRefStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TSlotRefTupleSchemeFactory();

  public int slot_id; // required
  public int tuple_id; // required
  public int col_unique_id; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SLOT_ID((short)1, "slot_id"),
    TUPLE_ID((short)2, "tuple_id"),
    COL_UNIQUE_ID((short)3, "col_unique_id");

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
        case 1: // SLOT_ID
          return SLOT_ID;
        case 2: // TUPLE_ID
          return TUPLE_ID;
        case 3: // COL_UNIQUE_ID
          return COL_UNIQUE_ID;
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
  private static final int __SLOT_ID_ISSET_ID = 0;
  private static final int __TUPLE_ID_ISSET_ID = 1;
  private static final int __COL_UNIQUE_ID_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.COL_UNIQUE_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SLOT_ID, new org.apache.thrift.meta_data.FieldMetaData("slot_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TSlotId")));
    tmpMap.put(_Fields.TUPLE_ID, new org.apache.thrift.meta_data.FieldMetaData("tuple_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TTupleId")));
    tmpMap.put(_Fields.COL_UNIQUE_ID, new org.apache.thrift.meta_data.FieldMetaData("col_unique_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSlotRef.class, metaDataMap);
  }

  public TSlotRef() {
  }

  public TSlotRef(
    int slot_id,
    int tuple_id)
  {
    this();
    this.slot_id = slot_id;
    setSlotIdIsSet(true);
    this.tuple_id = tuple_id;
    setTupleIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSlotRef(TSlotRef other) {
    __isset_bitfield = other.__isset_bitfield;
    this.slot_id = other.slot_id;
    this.tuple_id = other.tuple_id;
    this.col_unique_id = other.col_unique_id;
  }

  public TSlotRef deepCopy() {
    return new TSlotRef(this);
  }

  @Override
  public void clear() {
    setSlotIdIsSet(false);
    this.slot_id = 0;
    setTupleIdIsSet(false);
    this.tuple_id = 0;
    setColUniqueIdIsSet(false);
    this.col_unique_id = 0;
  }

  public int getSlotId() {
    return this.slot_id;
  }

  public TSlotRef setSlotId(int slot_id) {
    this.slot_id = slot_id;
    setSlotIdIsSet(true);
    return this;
  }

  public void unsetSlotId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SLOT_ID_ISSET_ID);
  }

  /** Returns true if field slot_id is set (has been assigned a value) and false otherwise */
  public boolean isSetSlotId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SLOT_ID_ISSET_ID);
  }

  public void setSlotIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SLOT_ID_ISSET_ID, value);
  }

  public int getTupleId() {
    return this.tuple_id;
  }

  public TSlotRef setTupleId(int tuple_id) {
    this.tuple_id = tuple_id;
    setTupleIdIsSet(true);
    return this;
  }

  public void unsetTupleId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TUPLE_ID_ISSET_ID);
  }

  /** Returns true if field tuple_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTupleId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TUPLE_ID_ISSET_ID);
  }

  public void setTupleIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TUPLE_ID_ISSET_ID, value);
  }

  public int getColUniqueId() {
    return this.col_unique_id;
  }

  public TSlotRef setColUniqueId(int col_unique_id) {
    this.col_unique_id = col_unique_id;
    setColUniqueIdIsSet(true);
    return this;
  }

  public void unsetColUniqueId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COL_UNIQUE_ID_ISSET_ID);
  }

  /** Returns true if field col_unique_id is set (has been assigned a value) and false otherwise */
  public boolean isSetColUniqueId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COL_UNIQUE_ID_ISSET_ID);
  }

  public void setColUniqueIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COL_UNIQUE_ID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SLOT_ID:
      if (value == null) {
        unsetSlotId();
      } else {
        setSlotId((java.lang.Integer)value);
      }
      break;

    case TUPLE_ID:
      if (value == null) {
        unsetTupleId();
      } else {
        setTupleId((java.lang.Integer)value);
      }
      break;

    case COL_UNIQUE_ID:
      if (value == null) {
        unsetColUniqueId();
      } else {
        setColUniqueId((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SLOT_ID:
      return getSlotId();

    case TUPLE_ID:
      return getTupleId();

    case COL_UNIQUE_ID:
      return getColUniqueId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SLOT_ID:
      return isSetSlotId();
    case TUPLE_ID:
      return isSetTupleId();
    case COL_UNIQUE_ID:
      return isSetColUniqueId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TSlotRef)
      return this.equals((TSlotRef)that);
    return false;
  }

  public boolean equals(TSlotRef that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_slot_id = true;
    boolean that_present_slot_id = true;
    if (this_present_slot_id || that_present_slot_id) {
      if (!(this_present_slot_id && that_present_slot_id))
        return false;
      if (this.slot_id != that.slot_id)
        return false;
    }

    boolean this_present_tuple_id = true;
    boolean that_present_tuple_id = true;
    if (this_present_tuple_id || that_present_tuple_id) {
      if (!(this_present_tuple_id && that_present_tuple_id))
        return false;
      if (this.tuple_id != that.tuple_id)
        return false;
    }

    boolean this_present_col_unique_id = true && this.isSetColUniqueId();
    boolean that_present_col_unique_id = true && that.isSetColUniqueId();
    if (this_present_col_unique_id || that_present_col_unique_id) {
      if (!(this_present_col_unique_id && that_present_col_unique_id))
        return false;
      if (this.col_unique_id != that.col_unique_id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + slot_id;

    hashCode = hashCode * 8191 + tuple_id;

    hashCode = hashCode * 8191 + ((isSetColUniqueId()) ? 131071 : 524287);
    if (isSetColUniqueId())
      hashCode = hashCode * 8191 + col_unique_id;

    return hashCode;
  }

  @Override
  public int compareTo(TSlotRef other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetSlotId(), other.isSetSlotId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSlotId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.slot_id, other.slot_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTupleId(), other.isSetTupleId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTupleId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tuple_id, other.tuple_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetColUniqueId(), other.isSetColUniqueId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColUniqueId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.col_unique_id, other.col_unique_id);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TSlotRef(");
    boolean first = true;

    sb.append("slot_id:");
    sb.append(this.slot_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("tuple_id:");
    sb.append(this.tuple_id);
    first = false;
    if (isSetColUniqueId()) {
      if (!first) sb.append(", ");
      sb.append("col_unique_id:");
      sb.append(this.col_unique_id);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'slot_id' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'tuple_id' because it's a primitive and you chose the non-beans generator.
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

  private static class TSlotRefStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TSlotRefStandardScheme getScheme() {
      return new TSlotRefStandardScheme();
    }
  }

  private static class TSlotRefStandardScheme extends org.apache.thrift.scheme.StandardScheme<TSlotRef> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSlotRef struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SLOT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.slot_id = iprot.readI32();
              struct.setSlotIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TUPLE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.tuple_id = iprot.readI32();
              struct.setTupleIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COL_UNIQUE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.col_unique_id = iprot.readI32();
              struct.setColUniqueIdIsSet(true);
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
      if (!struct.isSetSlotId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'slot_id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetTupleId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'tuple_id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSlotRef struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SLOT_ID_FIELD_DESC);
      oprot.writeI32(struct.slot_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TUPLE_ID_FIELD_DESC);
      oprot.writeI32(struct.tuple_id);
      oprot.writeFieldEnd();
      if (struct.isSetColUniqueId()) {
        oprot.writeFieldBegin(COL_UNIQUE_ID_FIELD_DESC);
        oprot.writeI32(struct.col_unique_id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSlotRefTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TSlotRefTupleScheme getScheme() {
      return new TSlotRefTupleScheme();
    }
  }

  private static class TSlotRefTupleScheme extends org.apache.thrift.scheme.TupleScheme<TSlotRef> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSlotRef struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.slot_id);
      oprot.writeI32(struct.tuple_id);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetColUniqueId()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetColUniqueId()) {
        oprot.writeI32(struct.col_unique_id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSlotRef struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.slot_id = iprot.readI32();
      struct.setSlotIdIsSet(true);
      struct.tuple_id = iprot.readI32();
      struct.setTupleIdIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.col_unique_id = iprot.readI32();
        struct.setColUniqueIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

