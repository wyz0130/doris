/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TDataGenScanNode implements org.apache.thrift.TBase<TDataGenScanNode, TDataGenScanNode._Fields>, java.io.Serializable, Cloneable, Comparable<TDataGenScanNode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDataGenScanNode");

  private static final org.apache.thrift.protocol.TField TUPLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tuple_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField FUNC_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("func_name", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDataGenScanNodeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDataGenScanNodeTupleSchemeFactory();

  public int tuple_id; // optional
  /**
   * 
   * @see TDataGenFunctionName
   */
  public @org.apache.thrift.annotation.Nullable TDataGenFunctionName func_name; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TUPLE_ID((short)1, "tuple_id"),
    /**
     * 
     * @see TDataGenFunctionName
     */
    FUNC_NAME((short)2, "func_name");

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
        case 1: // TUPLE_ID
          return TUPLE_ID;
        case 2: // FUNC_NAME
          return FUNC_NAME;
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
  private static final int __TUPLE_ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TUPLE_ID,_Fields.FUNC_NAME};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TUPLE_ID, new org.apache.thrift.meta_data.FieldMetaData("tuple_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TTupleId")));
    tmpMap.put(_Fields.FUNC_NAME, new org.apache.thrift.meta_data.FieldMetaData("func_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDataGenFunctionName.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDataGenScanNode.class, metaDataMap);
  }

  public TDataGenScanNode() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDataGenScanNode(TDataGenScanNode other) {
    __isset_bitfield = other.__isset_bitfield;
    this.tuple_id = other.tuple_id;
    if (other.isSetFuncName()) {
      this.func_name = other.func_name;
    }
  }

  public TDataGenScanNode deepCopy() {
    return new TDataGenScanNode(this);
  }

  @Override
  public void clear() {
    setTupleIdIsSet(false);
    this.tuple_id = 0;
    this.func_name = null;
  }

  public int getTupleId() {
    return this.tuple_id;
  }

  public TDataGenScanNode setTupleId(int tuple_id) {
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

  /**
   * 
   * @see TDataGenFunctionName
   */
  @org.apache.thrift.annotation.Nullable
  public TDataGenFunctionName getFuncName() {
    return this.func_name;
  }

  /**
   * 
   * @see TDataGenFunctionName
   */
  public TDataGenScanNode setFuncName(@org.apache.thrift.annotation.Nullable TDataGenFunctionName func_name) {
    this.func_name = func_name;
    return this;
  }

  public void unsetFuncName() {
    this.func_name = null;
  }

  /** Returns true if field func_name is set (has been assigned a value) and false otherwise */
  public boolean isSetFuncName() {
    return this.func_name != null;
  }

  public void setFuncNameIsSet(boolean value) {
    if (!value) {
      this.func_name = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TUPLE_ID:
      if (value == null) {
        unsetTupleId();
      } else {
        setTupleId((java.lang.Integer)value);
      }
      break;

    case FUNC_NAME:
      if (value == null) {
        unsetFuncName();
      } else {
        setFuncName((TDataGenFunctionName)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TUPLE_ID:
      return getTupleId();

    case FUNC_NAME:
      return getFuncName();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TUPLE_ID:
      return isSetTupleId();
    case FUNC_NAME:
      return isSetFuncName();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TDataGenScanNode)
      return this.equals((TDataGenScanNode)that);
    return false;
  }

  public boolean equals(TDataGenScanNode that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tuple_id = true && this.isSetTupleId();
    boolean that_present_tuple_id = true && that.isSetTupleId();
    if (this_present_tuple_id || that_present_tuple_id) {
      if (!(this_present_tuple_id && that_present_tuple_id))
        return false;
      if (this.tuple_id != that.tuple_id)
        return false;
    }

    boolean this_present_func_name = true && this.isSetFuncName();
    boolean that_present_func_name = true && that.isSetFuncName();
    if (this_present_func_name || that_present_func_name) {
      if (!(this_present_func_name && that_present_func_name))
        return false;
      if (!this.func_name.equals(that.func_name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTupleId()) ? 131071 : 524287);
    if (isSetTupleId())
      hashCode = hashCode * 8191 + tuple_id;

    hashCode = hashCode * 8191 + ((isSetFuncName()) ? 131071 : 524287);
    if (isSetFuncName())
      hashCode = hashCode * 8191 + func_name.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TDataGenScanNode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.compare(isSetFuncName(), other.isSetFuncName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFuncName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.func_name, other.func_name);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDataGenScanNode(");
    boolean first = true;

    if (isSetTupleId()) {
      sb.append("tuple_id:");
      sb.append(this.tuple_id);
      first = false;
    }
    if (isSetFuncName()) {
      if (!first) sb.append(", ");
      sb.append("func_name:");
      if (this.func_name == null) {
        sb.append("null");
      } else {
        sb.append(this.func_name);
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

  private static class TDataGenScanNodeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDataGenScanNodeStandardScheme getScheme() {
      return new TDataGenScanNodeStandardScheme();
    }
  }

  private static class TDataGenScanNodeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDataGenScanNode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDataGenScanNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TUPLE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.tuple_id = iprot.readI32();
              struct.setTupleIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FUNC_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.func_name = org.apache.doris.thrift.TDataGenFunctionName.findByValue(iprot.readI32());
              struct.setFuncNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDataGenScanNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetTupleId()) {
        oprot.writeFieldBegin(TUPLE_ID_FIELD_DESC);
        oprot.writeI32(struct.tuple_id);
        oprot.writeFieldEnd();
      }
      if (struct.func_name != null) {
        if (struct.isSetFuncName()) {
          oprot.writeFieldBegin(FUNC_NAME_FIELD_DESC);
          oprot.writeI32(struct.func_name.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDataGenScanNodeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDataGenScanNodeTupleScheme getScheme() {
      return new TDataGenScanNodeTupleScheme();
    }
  }

  private static class TDataGenScanNodeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDataGenScanNode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDataGenScanNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTupleId()) {
        optionals.set(0);
      }
      if (struct.isSetFuncName()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTupleId()) {
        oprot.writeI32(struct.tuple_id);
      }
      if (struct.isSetFuncName()) {
        oprot.writeI32(struct.func_name.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDataGenScanNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.tuple_id = iprot.readI32();
        struct.setTupleIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.func_name = org.apache.doris.thrift.TDataGenFunctionName.findByValue(iprot.readI32());
        struct.setFuncNameIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
