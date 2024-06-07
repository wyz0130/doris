/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TUnionNode implements org.apache.thrift.TBase<TUnionNode, TUnionNode._Fields>, java.io.Serializable, Cloneable, Comparable<TUnionNode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TUnionNode");

  private static final org.apache.thrift.protocol.TField TUPLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tuple_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField RESULT_EXPR_LISTS_FIELD_DESC = new org.apache.thrift.protocol.TField("result_expr_lists", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField CONST_EXPR_LISTS_FIELD_DESC = new org.apache.thrift.protocol.TField("const_expr_lists", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField FIRST_MATERIALIZED_CHILD_IDX_FIELD_DESC = new org.apache.thrift.protocol.TField("first_materialized_child_idx", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TUnionNodeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TUnionNodeTupleSchemeFactory();

  public int tuple_id; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.util.List<org.apache.doris.thrift.TExpr>> result_expr_lists; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.util.List<org.apache.doris.thrift.TExpr>> const_expr_lists; // required
  public long first_materialized_child_idx; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TUPLE_ID((short)1, "tuple_id"),
    RESULT_EXPR_LISTS((short)2, "result_expr_lists"),
    CONST_EXPR_LISTS((short)3, "const_expr_lists"),
    FIRST_MATERIALIZED_CHILD_IDX((short)4, "first_materialized_child_idx");

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
        case 2: // RESULT_EXPR_LISTS
          return RESULT_EXPR_LISTS;
        case 3: // CONST_EXPR_LISTS
          return CONST_EXPR_LISTS;
        case 4: // FIRST_MATERIALIZED_CHILD_IDX
          return FIRST_MATERIALIZED_CHILD_IDX;
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
  private static final int __FIRST_MATERIALIZED_CHILD_IDX_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TUPLE_ID, new org.apache.thrift.meta_data.FieldMetaData("tuple_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TTupleId")));
    tmpMap.put(_Fields.RESULT_EXPR_LISTS, new org.apache.thrift.meta_data.FieldMetaData("result_expr_lists", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TExpr.class)))));
    tmpMap.put(_Fields.CONST_EXPR_LISTS, new org.apache.thrift.meta_data.FieldMetaData("const_expr_lists", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TExpr.class)))));
    tmpMap.put(_Fields.FIRST_MATERIALIZED_CHILD_IDX, new org.apache.thrift.meta_data.FieldMetaData("first_materialized_child_idx", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TUnionNode.class, metaDataMap);
  }

  public TUnionNode() {
  }

  public TUnionNode(
    int tuple_id,
    java.util.List<java.util.List<org.apache.doris.thrift.TExpr>> result_expr_lists,
    java.util.List<java.util.List<org.apache.doris.thrift.TExpr>> const_expr_lists,
    long first_materialized_child_idx)
  {
    this();
    this.tuple_id = tuple_id;
    setTupleIdIsSet(true);
    this.result_expr_lists = result_expr_lists;
    this.const_expr_lists = const_expr_lists;
    this.first_materialized_child_idx = first_materialized_child_idx;
    setFirstMaterializedChildIdxIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TUnionNode(TUnionNode other) {
    __isset_bitfield = other.__isset_bitfield;
    this.tuple_id = other.tuple_id;
    if (other.isSetResultExprLists()) {
      java.util.List<java.util.List<org.apache.doris.thrift.TExpr>> __this__result_expr_lists = new java.util.ArrayList<java.util.List<org.apache.doris.thrift.TExpr>>(other.result_expr_lists.size());
      for (java.util.List<org.apache.doris.thrift.TExpr> other_element : other.result_expr_lists) {
        java.util.List<org.apache.doris.thrift.TExpr> __this__result_expr_lists_copy = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(other_element.size());
        for (org.apache.doris.thrift.TExpr other_element_element : other_element) {
          __this__result_expr_lists_copy.add(new org.apache.doris.thrift.TExpr(other_element_element));
        }
        __this__result_expr_lists.add(__this__result_expr_lists_copy);
      }
      this.result_expr_lists = __this__result_expr_lists;
    }
    if (other.isSetConstExprLists()) {
      java.util.List<java.util.List<org.apache.doris.thrift.TExpr>> __this__const_expr_lists = new java.util.ArrayList<java.util.List<org.apache.doris.thrift.TExpr>>(other.const_expr_lists.size());
      for (java.util.List<org.apache.doris.thrift.TExpr> other_element : other.const_expr_lists) {
        java.util.List<org.apache.doris.thrift.TExpr> __this__const_expr_lists_copy = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(other_element.size());
        for (org.apache.doris.thrift.TExpr other_element_element : other_element) {
          __this__const_expr_lists_copy.add(new org.apache.doris.thrift.TExpr(other_element_element));
        }
        __this__const_expr_lists.add(__this__const_expr_lists_copy);
      }
      this.const_expr_lists = __this__const_expr_lists;
    }
    this.first_materialized_child_idx = other.first_materialized_child_idx;
  }

  public TUnionNode deepCopy() {
    return new TUnionNode(this);
  }

  @Override
  public void clear() {
    setTupleIdIsSet(false);
    this.tuple_id = 0;
    this.result_expr_lists = null;
    this.const_expr_lists = null;
    setFirstMaterializedChildIdxIsSet(false);
    this.first_materialized_child_idx = 0;
  }

  public int getTupleId() {
    return this.tuple_id;
  }

  public TUnionNode setTupleId(int tuple_id) {
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

  public int getResultExprListsSize() {
    return (this.result_expr_lists == null) ? 0 : this.result_expr_lists.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.util.List<org.apache.doris.thrift.TExpr>> getResultExprListsIterator() {
    return (this.result_expr_lists == null) ? null : this.result_expr_lists.iterator();
  }

  public void addToResultExprLists(java.util.List<org.apache.doris.thrift.TExpr> elem) {
    if (this.result_expr_lists == null) {
      this.result_expr_lists = new java.util.ArrayList<java.util.List<org.apache.doris.thrift.TExpr>>();
    }
    this.result_expr_lists.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.util.List<org.apache.doris.thrift.TExpr>> getResultExprLists() {
    return this.result_expr_lists;
  }

  public TUnionNode setResultExprLists(@org.apache.thrift.annotation.Nullable java.util.List<java.util.List<org.apache.doris.thrift.TExpr>> result_expr_lists) {
    this.result_expr_lists = result_expr_lists;
    return this;
  }

  public void unsetResultExprLists() {
    this.result_expr_lists = null;
  }

  /** Returns true if field result_expr_lists is set (has been assigned a value) and false otherwise */
  public boolean isSetResultExprLists() {
    return this.result_expr_lists != null;
  }

  public void setResultExprListsIsSet(boolean value) {
    if (!value) {
      this.result_expr_lists = null;
    }
  }

  public int getConstExprListsSize() {
    return (this.const_expr_lists == null) ? 0 : this.const_expr_lists.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.util.List<org.apache.doris.thrift.TExpr>> getConstExprListsIterator() {
    return (this.const_expr_lists == null) ? null : this.const_expr_lists.iterator();
  }

  public void addToConstExprLists(java.util.List<org.apache.doris.thrift.TExpr> elem) {
    if (this.const_expr_lists == null) {
      this.const_expr_lists = new java.util.ArrayList<java.util.List<org.apache.doris.thrift.TExpr>>();
    }
    this.const_expr_lists.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.util.List<org.apache.doris.thrift.TExpr>> getConstExprLists() {
    return this.const_expr_lists;
  }

  public TUnionNode setConstExprLists(@org.apache.thrift.annotation.Nullable java.util.List<java.util.List<org.apache.doris.thrift.TExpr>> const_expr_lists) {
    this.const_expr_lists = const_expr_lists;
    return this;
  }

  public void unsetConstExprLists() {
    this.const_expr_lists = null;
  }

  /** Returns true if field const_expr_lists is set (has been assigned a value) and false otherwise */
  public boolean isSetConstExprLists() {
    return this.const_expr_lists != null;
  }

  public void setConstExprListsIsSet(boolean value) {
    if (!value) {
      this.const_expr_lists = null;
    }
  }

  public long getFirstMaterializedChildIdx() {
    return this.first_materialized_child_idx;
  }

  public TUnionNode setFirstMaterializedChildIdx(long first_materialized_child_idx) {
    this.first_materialized_child_idx = first_materialized_child_idx;
    setFirstMaterializedChildIdxIsSet(true);
    return this;
  }

  public void unsetFirstMaterializedChildIdx() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FIRST_MATERIALIZED_CHILD_IDX_ISSET_ID);
  }

  /** Returns true if field first_materialized_child_idx is set (has been assigned a value) and false otherwise */
  public boolean isSetFirstMaterializedChildIdx() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FIRST_MATERIALIZED_CHILD_IDX_ISSET_ID);
  }

  public void setFirstMaterializedChildIdxIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FIRST_MATERIALIZED_CHILD_IDX_ISSET_ID, value);
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

    case RESULT_EXPR_LISTS:
      if (value == null) {
        unsetResultExprLists();
      } else {
        setResultExprLists((java.util.List<java.util.List<org.apache.doris.thrift.TExpr>>)value);
      }
      break;

    case CONST_EXPR_LISTS:
      if (value == null) {
        unsetConstExprLists();
      } else {
        setConstExprLists((java.util.List<java.util.List<org.apache.doris.thrift.TExpr>>)value);
      }
      break;

    case FIRST_MATERIALIZED_CHILD_IDX:
      if (value == null) {
        unsetFirstMaterializedChildIdx();
      } else {
        setFirstMaterializedChildIdx((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TUPLE_ID:
      return getTupleId();

    case RESULT_EXPR_LISTS:
      return getResultExprLists();

    case CONST_EXPR_LISTS:
      return getConstExprLists();

    case FIRST_MATERIALIZED_CHILD_IDX:
      return getFirstMaterializedChildIdx();

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
    case RESULT_EXPR_LISTS:
      return isSetResultExprLists();
    case CONST_EXPR_LISTS:
      return isSetConstExprLists();
    case FIRST_MATERIALIZED_CHILD_IDX:
      return isSetFirstMaterializedChildIdx();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TUnionNode)
      return this.equals((TUnionNode)that);
    return false;
  }

  public boolean equals(TUnionNode that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tuple_id = true;
    boolean that_present_tuple_id = true;
    if (this_present_tuple_id || that_present_tuple_id) {
      if (!(this_present_tuple_id && that_present_tuple_id))
        return false;
      if (this.tuple_id != that.tuple_id)
        return false;
    }

    boolean this_present_result_expr_lists = true && this.isSetResultExprLists();
    boolean that_present_result_expr_lists = true && that.isSetResultExprLists();
    if (this_present_result_expr_lists || that_present_result_expr_lists) {
      if (!(this_present_result_expr_lists && that_present_result_expr_lists))
        return false;
      if (!this.result_expr_lists.equals(that.result_expr_lists))
        return false;
    }

    boolean this_present_const_expr_lists = true && this.isSetConstExprLists();
    boolean that_present_const_expr_lists = true && that.isSetConstExprLists();
    if (this_present_const_expr_lists || that_present_const_expr_lists) {
      if (!(this_present_const_expr_lists && that_present_const_expr_lists))
        return false;
      if (!this.const_expr_lists.equals(that.const_expr_lists))
        return false;
    }

    boolean this_present_first_materialized_child_idx = true;
    boolean that_present_first_materialized_child_idx = true;
    if (this_present_first_materialized_child_idx || that_present_first_materialized_child_idx) {
      if (!(this_present_first_materialized_child_idx && that_present_first_materialized_child_idx))
        return false;
      if (this.first_materialized_child_idx != that.first_materialized_child_idx)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + tuple_id;

    hashCode = hashCode * 8191 + ((isSetResultExprLists()) ? 131071 : 524287);
    if (isSetResultExprLists())
      hashCode = hashCode * 8191 + result_expr_lists.hashCode();

    hashCode = hashCode * 8191 + ((isSetConstExprLists()) ? 131071 : 524287);
    if (isSetConstExprLists())
      hashCode = hashCode * 8191 + const_expr_lists.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(first_materialized_child_idx);

    return hashCode;
  }

  @Override
  public int compareTo(TUnionNode other) {
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
    lastComparison = java.lang.Boolean.compare(isSetResultExprLists(), other.isSetResultExprLists());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResultExprLists()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.result_expr_lists, other.result_expr_lists);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetConstExprLists(), other.isSetConstExprLists());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConstExprLists()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.const_expr_lists, other.const_expr_lists);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetFirstMaterializedChildIdx(), other.isSetFirstMaterializedChildIdx());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFirstMaterializedChildIdx()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.first_materialized_child_idx, other.first_materialized_child_idx);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TUnionNode(");
    boolean first = true;

    sb.append("tuple_id:");
    sb.append(this.tuple_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("result_expr_lists:");
    if (this.result_expr_lists == null) {
      sb.append("null");
    } else {
      sb.append(this.result_expr_lists);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("const_expr_lists:");
    if (this.const_expr_lists == null) {
      sb.append("null");
    } else {
      sb.append(this.const_expr_lists);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("first_materialized_child_idx:");
    sb.append(this.first_materialized_child_idx);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'tuple_id' because it's a primitive and you chose the non-beans generator.
    if (result_expr_lists == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'result_expr_lists' was not present! Struct: " + toString());
    }
    if (const_expr_lists == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'const_expr_lists' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'first_materialized_child_idx' because it's a primitive and you chose the non-beans generator.
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

  private static class TUnionNodeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TUnionNodeStandardScheme getScheme() {
      return new TUnionNodeStandardScheme();
    }
  }

  private static class TUnionNodeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TUnionNode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TUnionNode struct) throws org.apache.thrift.TException {
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
          case 2: // RESULT_EXPR_LISTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list772 = iprot.readListBegin();
                struct.result_expr_lists = new java.util.ArrayList<java.util.List<org.apache.doris.thrift.TExpr>>(_list772.size);
                @org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TExpr> _elem773;
                for (int _i774 = 0; _i774 < _list772.size; ++_i774)
                {
                  {
                    org.apache.thrift.protocol.TList _list775 = iprot.readListBegin();
                    _elem773 = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(_list775.size);
                    @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _elem776;
                    for (int _i777 = 0; _i777 < _list775.size; ++_i777)
                    {
                      _elem776 = new org.apache.doris.thrift.TExpr();
                      _elem776.read(iprot);
                      _elem773.add(_elem776);
                    }
                    iprot.readListEnd();
                  }
                  struct.result_expr_lists.add(_elem773);
                }
                iprot.readListEnd();
              }
              struct.setResultExprListsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONST_EXPR_LISTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list778 = iprot.readListBegin();
                struct.const_expr_lists = new java.util.ArrayList<java.util.List<org.apache.doris.thrift.TExpr>>(_list778.size);
                @org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TExpr> _elem779;
                for (int _i780 = 0; _i780 < _list778.size; ++_i780)
                {
                  {
                    org.apache.thrift.protocol.TList _list781 = iprot.readListBegin();
                    _elem779 = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(_list781.size);
                    @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _elem782;
                    for (int _i783 = 0; _i783 < _list781.size; ++_i783)
                    {
                      _elem782 = new org.apache.doris.thrift.TExpr();
                      _elem782.read(iprot);
                      _elem779.add(_elem782);
                    }
                    iprot.readListEnd();
                  }
                  struct.const_expr_lists.add(_elem779);
                }
                iprot.readListEnd();
              }
              struct.setConstExprListsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FIRST_MATERIALIZED_CHILD_IDX
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.first_materialized_child_idx = iprot.readI64();
              struct.setFirstMaterializedChildIdxIsSet(true);
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
      if (!struct.isSetTupleId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'tuple_id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetFirstMaterializedChildIdx()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'first_materialized_child_idx' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TUnionNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TUPLE_ID_FIELD_DESC);
      oprot.writeI32(struct.tuple_id);
      oprot.writeFieldEnd();
      if (struct.result_expr_lists != null) {
        oprot.writeFieldBegin(RESULT_EXPR_LISTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.result_expr_lists.size()));
          for (java.util.List<org.apache.doris.thrift.TExpr> _iter784 : struct.result_expr_lists)
          {
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter784.size()));
              for (org.apache.doris.thrift.TExpr _iter785 : _iter784)
              {
                _iter785.write(oprot);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.const_expr_lists != null) {
        oprot.writeFieldBegin(CONST_EXPR_LISTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.const_expr_lists.size()));
          for (java.util.List<org.apache.doris.thrift.TExpr> _iter786 : struct.const_expr_lists)
          {
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter786.size()));
              for (org.apache.doris.thrift.TExpr _iter787 : _iter786)
              {
                _iter787.write(oprot);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(FIRST_MATERIALIZED_CHILD_IDX_FIELD_DESC);
      oprot.writeI64(struct.first_materialized_child_idx);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TUnionNodeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TUnionNodeTupleScheme getScheme() {
      return new TUnionNodeTupleScheme();
    }
  }

  private static class TUnionNodeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TUnionNode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TUnionNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.tuple_id);
      {
        oprot.writeI32(struct.result_expr_lists.size());
        for (java.util.List<org.apache.doris.thrift.TExpr> _iter788 : struct.result_expr_lists)
        {
          {
            oprot.writeI32(_iter788.size());
            for (org.apache.doris.thrift.TExpr _iter789 : _iter788)
            {
              _iter789.write(oprot);
            }
          }
        }
      }
      {
        oprot.writeI32(struct.const_expr_lists.size());
        for (java.util.List<org.apache.doris.thrift.TExpr> _iter790 : struct.const_expr_lists)
        {
          {
            oprot.writeI32(_iter790.size());
            for (org.apache.doris.thrift.TExpr _iter791 : _iter790)
            {
              _iter791.write(oprot);
            }
          }
        }
      }
      oprot.writeI64(struct.first_materialized_child_idx);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TUnionNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.tuple_id = iprot.readI32();
      struct.setTupleIdIsSet(true);
      {
        org.apache.thrift.protocol.TList _list792 = iprot.readListBegin(org.apache.thrift.protocol.TType.LIST);
        struct.result_expr_lists = new java.util.ArrayList<java.util.List<org.apache.doris.thrift.TExpr>>(_list792.size);
        @org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TExpr> _elem793;
        for (int _i794 = 0; _i794 < _list792.size; ++_i794)
        {
          {
            org.apache.thrift.protocol.TList _list795 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
            _elem793 = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(_list795.size);
            @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _elem796;
            for (int _i797 = 0; _i797 < _list795.size; ++_i797)
            {
              _elem796 = new org.apache.doris.thrift.TExpr();
              _elem796.read(iprot);
              _elem793.add(_elem796);
            }
          }
          struct.result_expr_lists.add(_elem793);
        }
      }
      struct.setResultExprListsIsSet(true);
      {
        org.apache.thrift.protocol.TList _list798 = iprot.readListBegin(org.apache.thrift.protocol.TType.LIST);
        struct.const_expr_lists = new java.util.ArrayList<java.util.List<org.apache.doris.thrift.TExpr>>(_list798.size);
        @org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TExpr> _elem799;
        for (int _i800 = 0; _i800 < _list798.size; ++_i800)
        {
          {
            org.apache.thrift.protocol.TList _list801 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
            _elem799 = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(_list801.size);
            @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _elem802;
            for (int _i803 = 0; _i803 < _list801.size; ++_i803)
            {
              _elem802 = new org.apache.doris.thrift.TExpr();
              _elem802.read(iprot);
              _elem799.add(_elem802);
            }
          }
          struct.const_expr_lists.add(_elem799);
        }
      }
      struct.setConstExprListsIsSet(true);
      struct.first_materialized_child_idx = iprot.readI64();
      struct.setFirstMaterializedChildIdxIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
