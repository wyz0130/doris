/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TGetMetaDB implements org.apache.thrift.TBase<TGetMetaDB, TGetMetaDB._Fields>, java.io.Serializable, Cloneable, Comparable<TGetMetaDB> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetMetaDB");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ONLY_TABLE_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("only_table_names", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField TABLES_FIELD_DESC = new org.apache.thrift.protocol.TField("tables", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TGetMetaDBStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TGetMetaDBTupleSchemeFactory();

  public long id; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String name; // optional
  public boolean only_table_names; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<TGetMetaTable> tables; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    NAME((short)2, "name"),
    ONLY_TABLE_NAMES((short)3, "only_table_names"),
    TABLES((short)4, "tables");

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
        case 1: // ID
          return ID;
        case 2: // NAME
          return NAME;
        case 3: // ONLY_TABLE_NAMES
          return ONLY_TABLE_NAMES;
        case 4: // TABLES
          return TABLES;
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
  private static final int __ID_ISSET_ID = 0;
  private static final int __ONLY_TABLE_NAMES_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.NAME,_Fields.ONLY_TABLE_NAMES,_Fields.TABLES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ONLY_TABLE_NAMES, new org.apache.thrift.meta_data.FieldMetaData("only_table_names", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TABLES, new org.apache.thrift.meta_data.FieldMetaData("tables", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TGetMetaTable.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetMetaDB.class, metaDataMap);
  }

  public TGetMetaDB() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetMetaDB(TGetMetaDB other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.only_table_names = other.only_table_names;
    if (other.isSetTables()) {
      java.util.List<TGetMetaTable> __this__tables = new java.util.ArrayList<TGetMetaTable>(other.tables.size());
      for (TGetMetaTable other_element : other.tables) {
        __this__tables.add(new TGetMetaTable(other_element));
      }
      this.tables = __this__tables;
    }
  }

  public TGetMetaDB deepCopy() {
    return new TGetMetaDB(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.name = null;
    setOnlyTableNamesIsSet(false);
    this.only_table_names = false;
    this.tables = null;
  }

  public long getId() {
    return this.id;
  }

  public TGetMetaDB setId(long id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public TGetMetaDB setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public boolean isOnlyTableNames() {
    return this.only_table_names;
  }

  public TGetMetaDB setOnlyTableNames(boolean only_table_names) {
    this.only_table_names = only_table_names;
    setOnlyTableNamesIsSet(true);
    return this;
  }

  public void unsetOnlyTableNames() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ONLY_TABLE_NAMES_ISSET_ID);
  }

  /** Returns true if field only_table_names is set (has been assigned a value) and false otherwise */
  public boolean isSetOnlyTableNames() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ONLY_TABLE_NAMES_ISSET_ID);
  }

  public void setOnlyTableNamesIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ONLY_TABLE_NAMES_ISSET_ID, value);
  }

  public int getTablesSize() {
    return (this.tables == null) ? 0 : this.tables.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TGetMetaTable> getTablesIterator() {
    return (this.tables == null) ? null : this.tables.iterator();
  }

  public void addToTables(TGetMetaTable elem) {
    if (this.tables == null) {
      this.tables = new java.util.ArrayList<TGetMetaTable>();
    }
    this.tables.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TGetMetaTable> getTables() {
    return this.tables;
  }

  public TGetMetaDB setTables(@org.apache.thrift.annotation.Nullable java.util.List<TGetMetaTable> tables) {
    this.tables = tables;
    return this;
  }

  public void unsetTables() {
    this.tables = null;
  }

  /** Returns true if field tables is set (has been assigned a value) and false otherwise */
  public boolean isSetTables() {
    return this.tables != null;
  }

  public void setTablesIsSet(boolean value) {
    if (!value) {
      this.tables = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Long)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case ONLY_TABLE_NAMES:
      if (value == null) {
        unsetOnlyTableNames();
      } else {
        setOnlyTableNames((java.lang.Boolean)value);
      }
      break;

    case TABLES:
      if (value == null) {
        unsetTables();
      } else {
        setTables((java.util.List<TGetMetaTable>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case NAME:
      return getName();

    case ONLY_TABLE_NAMES:
      return isOnlyTableNames();

    case TABLES:
      return getTables();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case NAME:
      return isSetName();
    case ONLY_TABLE_NAMES:
      return isSetOnlyTableNames();
    case TABLES:
      return isSetTables();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TGetMetaDB)
      return this.equals((TGetMetaDB)that);
    return false;
  }

  public boolean equals(TGetMetaDB that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_only_table_names = true && this.isSetOnlyTableNames();
    boolean that_present_only_table_names = true && that.isSetOnlyTableNames();
    if (this_present_only_table_names || that_present_only_table_names) {
      if (!(this_present_only_table_names && that_present_only_table_names))
        return false;
      if (this.only_table_names != that.only_table_names)
        return false;
    }

    boolean this_present_tables = true && this.isSetTables();
    boolean that_present_tables = true && that.isSetTables();
    if (this_present_tables || that_present_tables) {
      if (!(this_present_tables && that_present_tables))
        return false;
      if (!this.tables.equals(that.tables))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(id);

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetOnlyTableNames()) ? 131071 : 524287);
    if (isSetOnlyTableNames())
      hashCode = hashCode * 8191 + ((only_table_names) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetTables()) ? 131071 : 524287);
    if (isSetTables())
      hashCode = hashCode * 8191 + tables.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TGetMetaDB other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetId(), other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetName(), other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetOnlyTableNames(), other.isSetOnlyTableNames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOnlyTableNames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.only_table_names, other.only_table_names);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTables(), other.isSetTables());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTables()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tables, other.tables);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TGetMetaDB(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetName()) {
      if (!first) sb.append(", ");
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetOnlyTableNames()) {
      if (!first) sb.append(", ");
      sb.append("only_table_names:");
      sb.append(this.only_table_names);
      first = false;
    }
    if (isSetTables()) {
      if (!first) sb.append(", ");
      sb.append("tables:");
      if (this.tables == null) {
        sb.append("null");
      } else {
        sb.append(this.tables);
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

  private static class TGetMetaDBStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetMetaDBStandardScheme getScheme() {
      return new TGetMetaDBStandardScheme();
    }
  }

  private static class TGetMetaDBStandardScheme extends org.apache.thrift.scheme.StandardScheme<TGetMetaDB> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetMetaDB struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ONLY_TABLE_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.only_table_names = iprot.readBool();
              struct.setOnlyTableNamesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TABLES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list664 = iprot.readListBegin();
                struct.tables = new java.util.ArrayList<TGetMetaTable>(_list664.size);
                @org.apache.thrift.annotation.Nullable TGetMetaTable _elem665;
                for (int _i666 = 0; _i666 < _list664.size; ++_i666)
                {
                  _elem665 = new TGetMetaTable();
                  _elem665.read(iprot);
                  struct.tables.add(_elem665);
                }
                iprot.readListEnd();
              }
              struct.setTablesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetMetaDB struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI64(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetOnlyTableNames()) {
        oprot.writeFieldBegin(ONLY_TABLE_NAMES_FIELD_DESC);
        oprot.writeBool(struct.only_table_names);
        oprot.writeFieldEnd();
      }
      if (struct.tables != null) {
        if (struct.isSetTables()) {
          oprot.writeFieldBegin(TABLES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.tables.size()));
            for (TGetMetaTable _iter667 : struct.tables)
            {
              _iter667.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetMetaDBTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetMetaDBTupleScheme getScheme() {
      return new TGetMetaDBTupleScheme();
    }
  }

  private static class TGetMetaDBTupleScheme extends org.apache.thrift.scheme.TupleScheme<TGetMetaDB> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetMetaDB struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetOnlyTableNames()) {
        optionals.set(2);
      }
      if (struct.isSetTables()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetOnlyTableNames()) {
        oprot.writeBool(struct.only_table_names);
      }
      if (struct.isSetTables()) {
        {
          oprot.writeI32(struct.tables.size());
          for (TGetMetaTable _iter668 : struct.tables)
          {
            _iter668.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetMetaDB struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.only_table_names = iprot.readBool();
        struct.setOnlyTableNamesIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list669 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.tables = new java.util.ArrayList<TGetMetaTable>(_list669.size);
          @org.apache.thrift.annotation.Nullable TGetMetaTable _elem670;
          for (int _i671 = 0; _i671 < _list669.size; ++_i671)
          {
            _elem670 = new TGetMetaTable();
            _elem670.read(iprot);
            struct.tables.add(_elem670);
          }
        }
        struct.setTablesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
