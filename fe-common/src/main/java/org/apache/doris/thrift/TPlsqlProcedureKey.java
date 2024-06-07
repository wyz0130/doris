/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TPlsqlProcedureKey implements org.apache.thrift.TBase<TPlsqlProcedureKey, TPlsqlProcedureKey._Fields>, java.io.Serializable, Cloneable, Comparable<TPlsqlProcedureKey> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPlsqlProcedureKey");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CATALOG_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("catalogId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField DB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("dbId", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TPlsqlProcedureKeyStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TPlsqlProcedureKeyTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String name; // optional
  public long catalogId; // optional
  public long dbId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    CATALOG_ID((short)2, "catalogId"),
    DB_ID((short)3, "dbId");

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
        case 1: // NAME
          return NAME;
        case 2: // CATALOG_ID
          return CATALOG_ID;
        case 3: // DB_ID
          return DB_ID;
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
  private static final int __CATALOGID_ISSET_ID = 0;
  private static final int __DBID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NAME,_Fields.CATALOG_ID,_Fields.DB_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CATALOG_ID, new org.apache.thrift.meta_data.FieldMetaData("catalogId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DB_ID, new org.apache.thrift.meta_data.FieldMetaData("dbId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPlsqlProcedureKey.class, metaDataMap);
  }

  public TPlsqlProcedureKey() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPlsqlProcedureKey(TPlsqlProcedureKey other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.catalogId = other.catalogId;
    this.dbId = other.dbId;
  }

  public TPlsqlProcedureKey deepCopy() {
    return new TPlsqlProcedureKey(this);
  }

  @Override
  public void clear() {
    this.name = null;
    setCatalogIdIsSet(false);
    this.catalogId = 0;
    setDbIdIsSet(false);
    this.dbId = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public TPlsqlProcedureKey setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
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

  public long getCatalogId() {
    return this.catalogId;
  }

  public TPlsqlProcedureKey setCatalogId(long catalogId) {
    this.catalogId = catalogId;
    setCatalogIdIsSet(true);
    return this;
  }

  public void unsetCatalogId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CATALOGID_ISSET_ID);
  }

  /** Returns true if field catalogId is set (has been assigned a value) and false otherwise */
  public boolean isSetCatalogId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CATALOGID_ISSET_ID);
  }

  public void setCatalogIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CATALOGID_ISSET_ID, value);
  }

  public long getDbId() {
    return this.dbId;
  }

  public TPlsqlProcedureKey setDbId(long dbId) {
    this.dbId = dbId;
    setDbIdIsSet(true);
    return this;
  }

  public void unsetDbId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DBID_ISSET_ID);
  }

  /** Returns true if field dbId is set (has been assigned a value) and false otherwise */
  public boolean isSetDbId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DBID_ISSET_ID);
  }

  public void setDbIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DBID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case CATALOG_ID:
      if (value == null) {
        unsetCatalogId();
      } else {
        setCatalogId((java.lang.Long)value);
      }
      break;

    case DB_ID:
      if (value == null) {
        unsetDbId();
      } else {
        setDbId((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case CATALOG_ID:
      return getCatalogId();

    case DB_ID:
      return getDbId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case CATALOG_ID:
      return isSetCatalogId();
    case DB_ID:
      return isSetDbId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TPlsqlProcedureKey)
      return this.equals((TPlsqlProcedureKey)that);
    return false;
  }

  public boolean equals(TPlsqlProcedureKey that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_catalogId = true && this.isSetCatalogId();
    boolean that_present_catalogId = true && that.isSetCatalogId();
    if (this_present_catalogId || that_present_catalogId) {
      if (!(this_present_catalogId && that_present_catalogId))
        return false;
      if (this.catalogId != that.catalogId)
        return false;
    }

    boolean this_present_dbId = true && this.isSetDbId();
    boolean that_present_dbId = true && that.isSetDbId();
    if (this_present_dbId || that_present_dbId) {
      if (!(this_present_dbId && that_present_dbId))
        return false;
      if (this.dbId != that.dbId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetCatalogId()) ? 131071 : 524287);
    if (isSetCatalogId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(catalogId);

    hashCode = hashCode * 8191 + ((isSetDbId()) ? 131071 : 524287);
    if (isSetDbId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(dbId);

    return hashCode;
  }

  @Override
  public int compareTo(TPlsqlProcedureKey other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.compare(isSetCatalogId(), other.isSetCatalogId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatalogId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catalogId, other.catalogId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDbId(), other.isSetDbId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbId, other.dbId);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TPlsqlProcedureKey(");
    boolean first = true;

    if (isSetName()) {
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetCatalogId()) {
      if (!first) sb.append(", ");
      sb.append("catalogId:");
      sb.append(this.catalogId);
      first = false;
    }
    if (isSetDbId()) {
      if (!first) sb.append(", ");
      sb.append("dbId:");
      sb.append(this.dbId);
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

  private static class TPlsqlProcedureKeyStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TPlsqlProcedureKeyStandardScheme getScheme() {
      return new TPlsqlProcedureKeyStandardScheme();
    }
  }

  private static class TPlsqlProcedureKeyStandardScheme extends org.apache.thrift.scheme.StandardScheme<TPlsqlProcedureKey> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TPlsqlProcedureKey struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CATALOG_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.catalogId = iprot.readI64();
              struct.setCatalogIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DB_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.dbId = iprot.readI64();
              struct.setDbIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TPlsqlProcedureKey struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetCatalogId()) {
        oprot.writeFieldBegin(CATALOG_ID_FIELD_DESC);
        oprot.writeI64(struct.catalogId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDbId()) {
        oprot.writeFieldBegin(DB_ID_FIELD_DESC);
        oprot.writeI64(struct.dbId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPlsqlProcedureKeyTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TPlsqlProcedureKeyTupleScheme getScheme() {
      return new TPlsqlProcedureKeyTupleScheme();
    }
  }

  private static class TPlsqlProcedureKeyTupleScheme extends org.apache.thrift.scheme.TupleScheme<TPlsqlProcedureKey> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPlsqlProcedureKey struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetCatalogId()) {
        optionals.set(1);
      }
      if (struct.isSetDbId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetCatalogId()) {
        oprot.writeI64(struct.catalogId);
      }
      if (struct.isSetDbId()) {
        oprot.writeI64(struct.dbId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPlsqlProcedureKey struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.catalogId = iprot.readI64();
        struct.setCatalogIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.dbId = iprot.readI64();
        struct.setDbIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
