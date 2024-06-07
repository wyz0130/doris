/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TJdbcTableSink implements org.apache.thrift.TBase<TJdbcTableSink, TJdbcTableSink._Fields>, java.io.Serializable, Cloneable, Comparable<TJdbcTableSink> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TJdbcTableSink");

  private static final org.apache.thrift.protocol.TField JDBC_TABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("jdbc_table", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USE_TRANSACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("use_transaction", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField TABLE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("table_type", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField INSERT_SQL_FIELD_DESC = new org.apache.thrift.protocol.TField("insert_sql", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TJdbcTableSinkStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TJdbcTableSinkTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TJdbcTable jdbc_table; // optional
  public boolean use_transaction; // optional
  /**
   * 
   * @see org.apache.doris.thrift.TOdbcTableType
   */
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TOdbcTableType table_type; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String insert_sql; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JDBC_TABLE((short)1, "jdbc_table"),
    USE_TRANSACTION((short)2, "use_transaction"),
    /**
     * 
     * @see org.apache.doris.thrift.TOdbcTableType
     */
    TABLE_TYPE((short)3, "table_type"),
    INSERT_SQL((short)4, "insert_sql");

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
        case 1: // JDBC_TABLE
          return JDBC_TABLE;
        case 2: // USE_TRANSACTION
          return USE_TRANSACTION;
        case 3: // TABLE_TYPE
          return TABLE_TYPE;
        case 4: // INSERT_SQL
          return INSERT_SQL;
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
  private static final int __USE_TRANSACTION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.JDBC_TABLE,_Fields.USE_TRANSACTION,_Fields.TABLE_TYPE,_Fields.INSERT_SQL};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JDBC_TABLE, new org.apache.thrift.meta_data.FieldMetaData("jdbc_table", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TJdbcTable.class)));
    tmpMap.put(_Fields.USE_TRANSACTION, new org.apache.thrift.meta_data.FieldMetaData("use_transaction", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TABLE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("table_type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.doris.thrift.TOdbcTableType.class)));
    tmpMap.put(_Fields.INSERT_SQL, new org.apache.thrift.meta_data.FieldMetaData("insert_sql", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TJdbcTableSink.class, metaDataMap);
  }

  public TJdbcTableSink() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TJdbcTableSink(TJdbcTableSink other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetJdbcTable()) {
      this.jdbc_table = new org.apache.doris.thrift.TJdbcTable(other.jdbc_table);
    }
    this.use_transaction = other.use_transaction;
    if (other.isSetTableType()) {
      this.table_type = other.table_type;
    }
    if (other.isSetInsertSql()) {
      this.insert_sql = other.insert_sql;
    }
  }

  public TJdbcTableSink deepCopy() {
    return new TJdbcTableSink(this);
  }

  @Override
  public void clear() {
    this.jdbc_table = null;
    setUseTransactionIsSet(false);
    this.use_transaction = false;
    this.table_type = null;
    this.insert_sql = null;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TJdbcTable getJdbcTable() {
    return this.jdbc_table;
  }

  public TJdbcTableSink setJdbcTable(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TJdbcTable jdbc_table) {
    this.jdbc_table = jdbc_table;
    return this;
  }

  public void unsetJdbcTable() {
    this.jdbc_table = null;
  }

  /** Returns true if field jdbc_table is set (has been assigned a value) and false otherwise */
  public boolean isSetJdbcTable() {
    return this.jdbc_table != null;
  }

  public void setJdbcTableIsSet(boolean value) {
    if (!value) {
      this.jdbc_table = null;
    }
  }

  public boolean isUseTransaction() {
    return this.use_transaction;
  }

  public TJdbcTableSink setUseTransaction(boolean use_transaction) {
    this.use_transaction = use_transaction;
    setUseTransactionIsSet(true);
    return this;
  }

  public void unsetUseTransaction() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USE_TRANSACTION_ISSET_ID);
  }

  /** Returns true if field use_transaction is set (has been assigned a value) and false otherwise */
  public boolean isSetUseTransaction() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USE_TRANSACTION_ISSET_ID);
  }

  public void setUseTransactionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USE_TRANSACTION_ISSET_ID, value);
  }

  /**
   * 
   * @see org.apache.doris.thrift.TOdbcTableType
   */
  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TOdbcTableType getTableType() {
    return this.table_type;
  }

  /**
   * 
   * @see org.apache.doris.thrift.TOdbcTableType
   */
  public TJdbcTableSink setTableType(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TOdbcTableType table_type) {
    this.table_type = table_type;
    return this;
  }

  public void unsetTableType() {
    this.table_type = null;
  }

  /** Returns true if field table_type is set (has been assigned a value) and false otherwise */
  public boolean isSetTableType() {
    return this.table_type != null;
  }

  public void setTableTypeIsSet(boolean value) {
    if (!value) {
      this.table_type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getInsertSql() {
    return this.insert_sql;
  }

  public TJdbcTableSink setInsertSql(@org.apache.thrift.annotation.Nullable java.lang.String insert_sql) {
    this.insert_sql = insert_sql;
    return this;
  }

  public void unsetInsertSql() {
    this.insert_sql = null;
  }

  /** Returns true if field insert_sql is set (has been assigned a value) and false otherwise */
  public boolean isSetInsertSql() {
    return this.insert_sql != null;
  }

  public void setInsertSqlIsSet(boolean value) {
    if (!value) {
      this.insert_sql = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case JDBC_TABLE:
      if (value == null) {
        unsetJdbcTable();
      } else {
        setJdbcTable((org.apache.doris.thrift.TJdbcTable)value);
      }
      break;

    case USE_TRANSACTION:
      if (value == null) {
        unsetUseTransaction();
      } else {
        setUseTransaction((java.lang.Boolean)value);
      }
      break;

    case TABLE_TYPE:
      if (value == null) {
        unsetTableType();
      } else {
        setTableType((org.apache.doris.thrift.TOdbcTableType)value);
      }
      break;

    case INSERT_SQL:
      if (value == null) {
        unsetInsertSql();
      } else {
        setInsertSql((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case JDBC_TABLE:
      return getJdbcTable();

    case USE_TRANSACTION:
      return isUseTransaction();

    case TABLE_TYPE:
      return getTableType();

    case INSERT_SQL:
      return getInsertSql();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case JDBC_TABLE:
      return isSetJdbcTable();
    case USE_TRANSACTION:
      return isSetUseTransaction();
    case TABLE_TYPE:
      return isSetTableType();
    case INSERT_SQL:
      return isSetInsertSql();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TJdbcTableSink)
      return this.equals((TJdbcTableSink)that);
    return false;
  }

  public boolean equals(TJdbcTableSink that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_jdbc_table = true && this.isSetJdbcTable();
    boolean that_present_jdbc_table = true && that.isSetJdbcTable();
    if (this_present_jdbc_table || that_present_jdbc_table) {
      if (!(this_present_jdbc_table && that_present_jdbc_table))
        return false;
      if (!this.jdbc_table.equals(that.jdbc_table))
        return false;
    }

    boolean this_present_use_transaction = true && this.isSetUseTransaction();
    boolean that_present_use_transaction = true && that.isSetUseTransaction();
    if (this_present_use_transaction || that_present_use_transaction) {
      if (!(this_present_use_transaction && that_present_use_transaction))
        return false;
      if (this.use_transaction != that.use_transaction)
        return false;
    }

    boolean this_present_table_type = true && this.isSetTableType();
    boolean that_present_table_type = true && that.isSetTableType();
    if (this_present_table_type || that_present_table_type) {
      if (!(this_present_table_type && that_present_table_type))
        return false;
      if (!this.table_type.equals(that.table_type))
        return false;
    }

    boolean this_present_insert_sql = true && this.isSetInsertSql();
    boolean that_present_insert_sql = true && that.isSetInsertSql();
    if (this_present_insert_sql || that_present_insert_sql) {
      if (!(this_present_insert_sql && that_present_insert_sql))
        return false;
      if (!this.insert_sql.equals(that.insert_sql))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetJdbcTable()) ? 131071 : 524287);
    if (isSetJdbcTable())
      hashCode = hashCode * 8191 + jdbc_table.hashCode();

    hashCode = hashCode * 8191 + ((isSetUseTransaction()) ? 131071 : 524287);
    if (isSetUseTransaction())
      hashCode = hashCode * 8191 + ((use_transaction) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetTableType()) ? 131071 : 524287);
    if (isSetTableType())
      hashCode = hashCode * 8191 + table_type.getValue();

    hashCode = hashCode * 8191 + ((isSetInsertSql()) ? 131071 : 524287);
    if (isSetInsertSql())
      hashCode = hashCode * 8191 + insert_sql.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TJdbcTableSink other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetJdbcTable(), other.isSetJdbcTable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJdbcTable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jdbc_table, other.jdbc_table);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetUseTransaction(), other.isSetUseTransaction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUseTransaction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.use_transaction, other.use_transaction);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTableType(), other.isSetTableType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_type, other.table_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetInsertSql(), other.isSetInsertSql());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInsertSql()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.insert_sql, other.insert_sql);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TJdbcTableSink(");
    boolean first = true;

    if (isSetJdbcTable()) {
      sb.append("jdbc_table:");
      if (this.jdbc_table == null) {
        sb.append("null");
      } else {
        sb.append(this.jdbc_table);
      }
      first = false;
    }
    if (isSetUseTransaction()) {
      if (!first) sb.append(", ");
      sb.append("use_transaction:");
      sb.append(this.use_transaction);
      first = false;
    }
    if (isSetTableType()) {
      if (!first) sb.append(", ");
      sb.append("table_type:");
      if (this.table_type == null) {
        sb.append("null");
      } else {
        sb.append(this.table_type);
      }
      first = false;
    }
    if (isSetInsertSql()) {
      if (!first) sb.append(", ");
      sb.append("insert_sql:");
      if (this.insert_sql == null) {
        sb.append("null");
      } else {
        sb.append(this.insert_sql);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (jdbc_table != null) {
      jdbc_table.validate();
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

  private static class TJdbcTableSinkStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TJdbcTableSinkStandardScheme getScheme() {
      return new TJdbcTableSinkStandardScheme();
    }
  }

  private static class TJdbcTableSinkStandardScheme extends org.apache.thrift.scheme.StandardScheme<TJdbcTableSink> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TJdbcTableSink struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JDBC_TABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.jdbc_table = new org.apache.doris.thrift.TJdbcTable();
              struct.jdbc_table.read(iprot);
              struct.setJdbcTableIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USE_TRANSACTION
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.use_transaction = iprot.readBool();
              struct.setUseTransactionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TABLE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.table_type = org.apache.doris.thrift.TOdbcTableType.findByValue(iprot.readI32());
              struct.setTableTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // INSERT_SQL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.insert_sql = iprot.readString();
              struct.setInsertSqlIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TJdbcTableSink struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jdbc_table != null) {
        if (struct.isSetJdbcTable()) {
          oprot.writeFieldBegin(JDBC_TABLE_FIELD_DESC);
          struct.jdbc_table.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetUseTransaction()) {
        oprot.writeFieldBegin(USE_TRANSACTION_FIELD_DESC);
        oprot.writeBool(struct.use_transaction);
        oprot.writeFieldEnd();
      }
      if (struct.table_type != null) {
        if (struct.isSetTableType()) {
          oprot.writeFieldBegin(TABLE_TYPE_FIELD_DESC);
          oprot.writeI32(struct.table_type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.insert_sql != null) {
        if (struct.isSetInsertSql()) {
          oprot.writeFieldBegin(INSERT_SQL_FIELD_DESC);
          oprot.writeString(struct.insert_sql);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TJdbcTableSinkTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TJdbcTableSinkTupleScheme getScheme() {
      return new TJdbcTableSinkTupleScheme();
    }
  }

  private static class TJdbcTableSinkTupleScheme extends org.apache.thrift.scheme.TupleScheme<TJdbcTableSink> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TJdbcTableSink struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetJdbcTable()) {
        optionals.set(0);
      }
      if (struct.isSetUseTransaction()) {
        optionals.set(1);
      }
      if (struct.isSetTableType()) {
        optionals.set(2);
      }
      if (struct.isSetInsertSql()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetJdbcTable()) {
        struct.jdbc_table.write(oprot);
      }
      if (struct.isSetUseTransaction()) {
        oprot.writeBool(struct.use_transaction);
      }
      if (struct.isSetTableType()) {
        oprot.writeI32(struct.table_type.getValue());
      }
      if (struct.isSetInsertSql()) {
        oprot.writeString(struct.insert_sql);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TJdbcTableSink struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.jdbc_table = new org.apache.doris.thrift.TJdbcTable();
        struct.jdbc_table.read(iprot);
        struct.setJdbcTableIsSet(true);
      }
      if (incoming.get(1)) {
        struct.use_transaction = iprot.readBool();
        struct.setUseTransactionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.table_type = org.apache.doris.thrift.TOdbcTableType.findByValue(iprot.readI32());
        struct.setTableTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.insert_sql = iprot.readString();
        struct.setInsertSqlIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

