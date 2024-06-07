/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TDescribeTablesResult implements org.apache.thrift.TBase<TDescribeTablesResult, TDescribeTablesResult._Fields>, java.io.Serializable, Cloneable, Comparable<TDescribeTablesResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDescribeTablesResult");

  private static final org.apache.thrift.protocol.TField TABLES_OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("tables_offset", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDescribeTablesResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDescribeTablesResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> tables_offset; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<TColumnDef> columns; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLES_OFFSET((short)1, "tables_offset"),
    COLUMNS((short)2, "columns");

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
        case 1: // TABLES_OFFSET
          return TABLES_OFFSET;
        case 2: // COLUMNS
          return COLUMNS;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLES_OFFSET, new org.apache.thrift.meta_data.FieldMetaData("tables_offset", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TColumnDef.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDescribeTablesResult.class, metaDataMap);
  }

  public TDescribeTablesResult() {
  }

  public TDescribeTablesResult(
    java.util.List<java.lang.Integer> tables_offset,
    java.util.List<TColumnDef> columns)
  {
    this();
    this.tables_offset = tables_offset;
    this.columns = columns;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDescribeTablesResult(TDescribeTablesResult other) {
    if (other.isSetTablesOffset()) {
      java.util.List<java.lang.Integer> __this__tables_offset = new java.util.ArrayList<java.lang.Integer>(other.tables_offset);
      this.tables_offset = __this__tables_offset;
    }
    if (other.isSetColumns()) {
      java.util.List<TColumnDef> __this__columns = new java.util.ArrayList<TColumnDef>(other.columns.size());
      for (TColumnDef other_element : other.columns) {
        __this__columns.add(new TColumnDef(other_element));
      }
      this.columns = __this__columns;
    }
  }

  public TDescribeTablesResult deepCopy() {
    return new TDescribeTablesResult(this);
  }

  @Override
  public void clear() {
    this.tables_offset = null;
    this.columns = null;
  }

  public int getTablesOffsetSize() {
    return (this.tables_offset == null) ? 0 : this.tables_offset.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Integer> getTablesOffsetIterator() {
    return (this.tables_offset == null) ? null : this.tables_offset.iterator();
  }

  public void addToTablesOffset(int elem) {
    if (this.tables_offset == null) {
      this.tables_offset = new java.util.ArrayList<java.lang.Integer>();
    }
    this.tables_offset.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Integer> getTablesOffset() {
    return this.tables_offset;
  }

  public TDescribeTablesResult setTablesOffset(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> tables_offset) {
    this.tables_offset = tables_offset;
    return this;
  }

  public void unsetTablesOffset() {
    this.tables_offset = null;
  }

  /** Returns true if field tables_offset is set (has been assigned a value) and false otherwise */
  public boolean isSetTablesOffset() {
    return this.tables_offset != null;
  }

  public void setTablesOffsetIsSet(boolean value) {
    if (!value) {
      this.tables_offset = null;
    }
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TColumnDef> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(TColumnDef elem) {
    if (this.columns == null) {
      this.columns = new java.util.ArrayList<TColumnDef>();
    }
    this.columns.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TColumnDef> getColumns() {
    return this.columns;
  }

  public TDescribeTablesResult setColumns(@org.apache.thrift.annotation.Nullable java.util.List<TColumnDef> columns) {
    this.columns = columns;
    return this;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  /** Returns true if field columns is set (has been assigned a value) and false otherwise */
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TABLES_OFFSET:
      if (value == null) {
        unsetTablesOffset();
      } else {
        setTablesOffset((java.util.List<java.lang.Integer>)value);
      }
      break;

    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((java.util.List<TColumnDef>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLES_OFFSET:
      return getTablesOffset();

    case COLUMNS:
      return getColumns();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TABLES_OFFSET:
      return isSetTablesOffset();
    case COLUMNS:
      return isSetColumns();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TDescribeTablesResult)
      return this.equals((TDescribeTablesResult)that);
    return false;
  }

  public boolean equals(TDescribeTablesResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tables_offset = true && this.isSetTablesOffset();
    boolean that_present_tables_offset = true && that.isSetTablesOffset();
    if (this_present_tables_offset || that_present_tables_offset) {
      if (!(this_present_tables_offset && that_present_tables_offset))
        return false;
      if (!this.tables_offset.equals(that.tables_offset))
        return false;
    }

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTablesOffset()) ? 131071 : 524287);
    if (isSetTablesOffset())
      hashCode = hashCode * 8191 + tables_offset.hashCode();

    hashCode = hashCode * 8191 + ((isSetColumns()) ? 131071 : 524287);
    if (isSetColumns())
      hashCode = hashCode * 8191 + columns.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TDescribeTablesResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTablesOffset(), other.isSetTablesOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTablesOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tables_offset, other.tables_offset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetColumns(), other.isSetColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columns, other.columns);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDescribeTablesResult(");
    boolean first = true;

    sb.append("tables_offset:");
    if (this.tables_offset == null) {
      sb.append("null");
    } else {
      sb.append(this.tables_offset);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("columns:");
    if (this.columns == null) {
      sb.append("null");
    } else {
      sb.append(this.columns);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (tables_offset == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tables_offset' was not present! Struct: " + toString());
    }
    if (columns == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'columns' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TDescribeTablesResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDescribeTablesResultStandardScheme getScheme() {
      return new TDescribeTablesResultStandardScheme();
    }
  }

  private static class TDescribeTablesResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDescribeTablesResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDescribeTablesResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLES_OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.tables_offset = new java.util.ArrayList<java.lang.Integer>(_list24.size);
                int _elem25;
                for (int _i26 = 0; _i26 < _list24.size; ++_i26)
                {
                  _elem25 = iprot.readI32();
                  struct.tables_offset.add(_elem25);
                }
                iprot.readListEnd();
              }
              struct.setTablesOffsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list27 = iprot.readListBegin();
                struct.columns = new java.util.ArrayList<TColumnDef>(_list27.size);
                @org.apache.thrift.annotation.Nullable TColumnDef _elem28;
                for (int _i29 = 0; _i29 < _list27.size; ++_i29)
                {
                  _elem28 = new TColumnDef();
                  _elem28.read(iprot);
                  struct.columns.add(_elem28);
                }
                iprot.readListEnd();
              }
              struct.setColumnsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDescribeTablesResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tables_offset != null) {
        oprot.writeFieldBegin(TABLES_OFFSET_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.tables_offset.size()));
          for (int _iter30 : struct.tables_offset)
          {
            oprot.writeI32(_iter30);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.columns != null) {
        oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.columns.size()));
          for (TColumnDef _iter31 : struct.columns)
          {
            _iter31.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDescribeTablesResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDescribeTablesResultTupleScheme getScheme() {
      return new TDescribeTablesResultTupleScheme();
    }
  }

  private static class TDescribeTablesResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDescribeTablesResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDescribeTablesResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.tables_offset.size());
        for (int _iter32 : struct.tables_offset)
        {
          oprot.writeI32(_iter32);
        }
      }
      {
        oprot.writeI32(struct.columns.size());
        for (TColumnDef _iter33 : struct.columns)
        {
          _iter33.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDescribeTablesResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list34 = iprot.readListBegin(org.apache.thrift.protocol.TType.I32);
        struct.tables_offset = new java.util.ArrayList<java.lang.Integer>(_list34.size);
        int _elem35;
        for (int _i36 = 0; _i36 < _list34.size; ++_i36)
        {
          _elem35 = iprot.readI32();
          struct.tables_offset.add(_elem35);
        }
      }
      struct.setTablesOffsetIsSet(true);
      {
        org.apache.thrift.protocol.TList _list37 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.columns = new java.util.ArrayList<TColumnDef>(_list37.size);
        @org.apache.thrift.annotation.Nullable TColumnDef _elem38;
        for (int _i39 = 0; _i39 < _list37.size; ++_i39)
        {
          _elem38 = new TColumnDef();
          _elem38.read(iprot);
          struct.columns.add(_elem38);
        }
      }
      struct.setColumnsIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

