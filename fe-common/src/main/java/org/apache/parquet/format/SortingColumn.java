/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.parquet.format;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * Wrapper struct to specify sort order
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class SortingColumn implements org.apache.thrift.TBase<SortingColumn, SortingColumn._Fields>, java.io.Serializable, Cloneable, Comparable<SortingColumn> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SortingColumn");

  private static final org.apache.thrift.protocol.TField COLUMN_IDX_FIELD_DESC = new org.apache.thrift.protocol.TField("column_idx", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField DESCENDING_FIELD_DESC = new org.apache.thrift.protocol.TField("descending", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField NULLS_FIRST_FIELD_DESC = new org.apache.thrift.protocol.TField("nulls_first", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SortingColumnStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SortingColumnTupleSchemeFactory();

  /**
   * The column index (in this row group) *
   */
  public int column_idx; // required
  /**
   * If true, indicates this column is sorted in descending order. *
   */
  public boolean descending; // required
  /**
   * If true, nulls will come before non-null values, otherwise,
   * nulls go at the end.
   */
  public boolean nulls_first; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * The column index (in this row group) *
     */
    COLUMN_IDX((short)1, "column_idx"),
    /**
     * If true, indicates this column is sorted in descending order. *
     */
    DESCENDING((short)2, "descending"),
    /**
     * If true, nulls will come before non-null values, otherwise,
     * nulls go at the end.
     */
    NULLS_FIRST((short)3, "nulls_first");

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
        case 1: // COLUMN_IDX
          return COLUMN_IDX;
        case 2: // DESCENDING
          return DESCENDING;
        case 3: // NULLS_FIRST
          return NULLS_FIRST;
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
  private static final int __COLUMN_IDX_ISSET_ID = 0;
  private static final int __DESCENDING_ISSET_ID = 1;
  private static final int __NULLS_FIRST_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COLUMN_IDX, new org.apache.thrift.meta_data.FieldMetaData("column_idx", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DESCENDING, new org.apache.thrift.meta_data.FieldMetaData("descending", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.NULLS_FIRST, new org.apache.thrift.meta_data.FieldMetaData("nulls_first", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SortingColumn.class, metaDataMap);
  }

  public SortingColumn() {
  }

  public SortingColumn(
    int column_idx,
    boolean descending,
    boolean nulls_first)
  {
    this();
    this.column_idx = column_idx;
    setColumnIdxIsSet(true);
    this.descending = descending;
    setDescendingIsSet(true);
    this.nulls_first = nulls_first;
    setNullsFirstIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SortingColumn(SortingColumn other) {
    __isset_bitfield = other.__isset_bitfield;
    this.column_idx = other.column_idx;
    this.descending = other.descending;
    this.nulls_first = other.nulls_first;
  }

  public SortingColumn deepCopy() {
    return new SortingColumn(this);
  }

  @Override
  public void clear() {
    setColumnIdxIsSet(false);
    this.column_idx = 0;
    setDescendingIsSet(false);
    this.descending = false;
    setNullsFirstIsSet(false);
    this.nulls_first = false;
  }

  /**
   * The column index (in this row group) *
   */
  public int getColumnIdx() {
    return this.column_idx;
  }

  /**
   * The column index (in this row group) *
   */
  public SortingColumn setColumnIdx(int column_idx) {
    this.column_idx = column_idx;
    setColumnIdxIsSet(true);
    return this;
  }

  public void unsetColumnIdx() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COLUMN_IDX_ISSET_ID);
  }

  /** Returns true if field column_idx is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnIdx() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COLUMN_IDX_ISSET_ID);
  }

  public void setColumnIdxIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COLUMN_IDX_ISSET_ID, value);
  }

  /**
   * If true, indicates this column is sorted in descending order. *
   */
  public boolean isDescending() {
    return this.descending;
  }

  /**
   * If true, indicates this column is sorted in descending order. *
   */
  public SortingColumn setDescending(boolean descending) {
    this.descending = descending;
    setDescendingIsSet(true);
    return this;
  }

  public void unsetDescending() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DESCENDING_ISSET_ID);
  }

  /** Returns true if field descending is set (has been assigned a value) and false otherwise */
  public boolean isSetDescending() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DESCENDING_ISSET_ID);
  }

  public void setDescendingIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DESCENDING_ISSET_ID, value);
  }

  /**
   * If true, nulls will come before non-null values, otherwise,
   * nulls go at the end.
   */
  public boolean isNullsFirst() {
    return this.nulls_first;
  }

  /**
   * If true, nulls will come before non-null values, otherwise,
   * nulls go at the end.
   */
  public SortingColumn setNullsFirst(boolean nulls_first) {
    this.nulls_first = nulls_first;
    setNullsFirstIsSet(true);
    return this;
  }

  public void unsetNullsFirst() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NULLS_FIRST_ISSET_ID);
  }

  /** Returns true if field nulls_first is set (has been assigned a value) and false otherwise */
  public boolean isSetNullsFirst() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NULLS_FIRST_ISSET_ID);
  }

  public void setNullsFirstIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NULLS_FIRST_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case COLUMN_IDX:
      if (value == null) {
        unsetColumnIdx();
      } else {
        setColumnIdx((java.lang.Integer)value);
      }
      break;

    case DESCENDING:
      if (value == null) {
        unsetDescending();
      } else {
        setDescending((java.lang.Boolean)value);
      }
      break;

    case NULLS_FIRST:
      if (value == null) {
        unsetNullsFirst();
      } else {
        setNullsFirst((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case COLUMN_IDX:
      return getColumnIdx();

    case DESCENDING:
      return isDescending();

    case NULLS_FIRST:
      return isNullsFirst();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case COLUMN_IDX:
      return isSetColumnIdx();
    case DESCENDING:
      return isSetDescending();
    case NULLS_FIRST:
      return isSetNullsFirst();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof SortingColumn)
      return this.equals((SortingColumn)that);
    return false;
  }

  public boolean equals(SortingColumn that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_column_idx = true;
    boolean that_present_column_idx = true;
    if (this_present_column_idx || that_present_column_idx) {
      if (!(this_present_column_idx && that_present_column_idx))
        return false;
      if (this.column_idx != that.column_idx)
        return false;
    }

    boolean this_present_descending = true;
    boolean that_present_descending = true;
    if (this_present_descending || that_present_descending) {
      if (!(this_present_descending && that_present_descending))
        return false;
      if (this.descending != that.descending)
        return false;
    }

    boolean this_present_nulls_first = true;
    boolean that_present_nulls_first = true;
    if (this_present_nulls_first || that_present_nulls_first) {
      if (!(this_present_nulls_first && that_present_nulls_first))
        return false;
      if (this.nulls_first != that.nulls_first)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + column_idx;

    hashCode = hashCode * 8191 + ((descending) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((nulls_first) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(SortingColumn other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetColumnIdx(), other.isSetColumnIdx());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnIdx()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.column_idx, other.column_idx);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDescending(), other.isSetDescending());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescending()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.descending, other.descending);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetNullsFirst(), other.isSetNullsFirst());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNullsFirst()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nulls_first, other.nulls_first);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SortingColumn(");
    boolean first = true;

    sb.append("column_idx:");
    sb.append(this.column_idx);
    first = false;
    if (!first) sb.append(", ");
    sb.append("descending:");
    sb.append(this.descending);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nulls_first:");
    sb.append(this.nulls_first);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'column_idx' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'descending' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'nulls_first' because it's a primitive and you chose the non-beans generator.
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

  private static class SortingColumnStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SortingColumnStandardScheme getScheme() {
      return new SortingColumnStandardScheme();
    }
  }

  private static class SortingColumnStandardScheme extends org.apache.thrift.scheme.StandardScheme<SortingColumn> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SortingColumn struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COLUMN_IDX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.column_idx = iprot.readI32();
              struct.setColumnIdxIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DESCENDING
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.descending = iprot.readBool();
              struct.setDescendingIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NULLS_FIRST
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.nulls_first = iprot.readBool();
              struct.setNullsFirstIsSet(true);
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
      if (!struct.isSetColumnIdx()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'column_idx' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetDescending()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'descending' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetNullsFirst()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'nulls_first' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SortingColumn struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(COLUMN_IDX_FIELD_DESC);
      oprot.writeI32(struct.column_idx);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DESCENDING_FIELD_DESC);
      oprot.writeBool(struct.descending);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NULLS_FIRST_FIELD_DESC);
      oprot.writeBool(struct.nulls_first);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SortingColumnTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SortingColumnTupleScheme getScheme() {
      return new SortingColumnTupleScheme();
    }
  }

  private static class SortingColumnTupleScheme extends org.apache.thrift.scheme.TupleScheme<SortingColumn> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SortingColumn struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.column_idx);
      oprot.writeBool(struct.descending);
      oprot.writeBool(struct.nulls_first);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SortingColumn struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.column_idx = iprot.readI32();
      struct.setColumnIdxIsSet(true);
      struct.descending = iprot.readBool();
      struct.setDescendingIsSet(true);
      struct.nulls_first = iprot.readBool();
      struct.setNullsFirstIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
