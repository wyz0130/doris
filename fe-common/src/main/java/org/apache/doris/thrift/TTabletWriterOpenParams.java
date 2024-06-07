/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TTabletWriterOpenParams implements org.apache.thrift.TBase<TTabletWriterOpenParams, TTabletWriterOpenParams._Fields>, java.io.Serializable, Cloneable, Comparable<TTabletWriterOpenParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTabletWriterOpenParams");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField INDEX_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("index_id", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField TXN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("txn_id", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField SCHEMA_FIELD_DESC = new org.apache.thrift.protocol.TField("schema", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField TABLETS_FIELD_DESC = new org.apache.thrift.protocol.TField("tablets", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField NUM_SENDERS_FIELD_DESC = new org.apache.thrift.protocol.TField("num_senders", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTabletWriterOpenParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTabletWriterOpenParamsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId id; // required
  public long index_id; // required
  public long txn_id; // required
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TOlapTableSchemaParam schema; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<TTabletWithPartition> tablets; // required
  public int num_senders; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    INDEX_ID((short)2, "index_id"),
    TXN_ID((short)3, "txn_id"),
    SCHEMA((short)4, "schema"),
    TABLETS((short)5, "tablets"),
    NUM_SENDERS((short)6, "num_senders");

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
        case 2: // INDEX_ID
          return INDEX_ID;
        case 3: // TXN_ID
          return TXN_ID;
        case 4: // SCHEMA
          return SCHEMA;
        case 5: // TABLETS
          return TABLETS;
        case 6: // NUM_SENDERS
          return NUM_SENDERS;
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
  private static final int __INDEX_ID_ISSET_ID = 0;
  private static final int __TXN_ID_ISSET_ID = 1;
  private static final int __NUM_SENDERS_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TUniqueId.class)));
    tmpMap.put(_Fields.INDEX_ID, new org.apache.thrift.meta_data.FieldMetaData("index_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TXN_ID, new org.apache.thrift.meta_data.FieldMetaData("txn_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SCHEMA, new org.apache.thrift.meta_data.FieldMetaData("schema", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TOlapTableSchemaParam.class)));
    tmpMap.put(_Fields.TABLETS, new org.apache.thrift.meta_data.FieldMetaData("tablets", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTabletWithPartition.class))));
    tmpMap.put(_Fields.NUM_SENDERS, new org.apache.thrift.meta_data.FieldMetaData("num_senders", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTabletWriterOpenParams.class, metaDataMap);
  }

  public TTabletWriterOpenParams() {
  }

  public TTabletWriterOpenParams(
    org.apache.doris.thrift.TUniqueId id,
    long index_id,
    long txn_id,
    org.apache.doris.thrift.TOlapTableSchemaParam schema,
    java.util.List<TTabletWithPartition> tablets,
    int num_senders)
  {
    this();
    this.id = id;
    this.index_id = index_id;
    setIndexIdIsSet(true);
    this.txn_id = txn_id;
    setTxnIdIsSet(true);
    this.schema = schema;
    this.tablets = tablets;
    this.num_senders = num_senders;
    setNumSendersIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTabletWriterOpenParams(TTabletWriterOpenParams other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = new org.apache.doris.thrift.TUniqueId(other.id);
    }
    this.index_id = other.index_id;
    this.txn_id = other.txn_id;
    if (other.isSetSchema()) {
      this.schema = new org.apache.doris.thrift.TOlapTableSchemaParam(other.schema);
    }
    if (other.isSetTablets()) {
      java.util.List<TTabletWithPartition> __this__tablets = new java.util.ArrayList<TTabletWithPartition>(other.tablets.size());
      for (TTabletWithPartition other_element : other.tablets) {
        __this__tablets.add(new TTabletWithPartition(other_element));
      }
      this.tablets = __this__tablets;
    }
    this.num_senders = other.num_senders;
  }

  public TTabletWriterOpenParams deepCopy() {
    return new TTabletWriterOpenParams(this);
  }

  @Override
  public void clear() {
    this.id = null;
    setIndexIdIsSet(false);
    this.index_id = 0;
    setTxnIdIsSet(false);
    this.txn_id = 0;
    this.schema = null;
    this.tablets = null;
    setNumSendersIsSet(false);
    this.num_senders = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TUniqueId getId() {
    return this.id;
  }

  public TTabletWriterOpenParams setId(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public long getIndexId() {
    return this.index_id;
  }

  public TTabletWriterOpenParams setIndexId(long index_id) {
    this.index_id = index_id;
    setIndexIdIsSet(true);
    return this;
  }

  public void unsetIndexId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INDEX_ID_ISSET_ID);
  }

  /** Returns true if field index_id is set (has been assigned a value) and false otherwise */
  public boolean isSetIndexId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INDEX_ID_ISSET_ID);
  }

  public void setIndexIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INDEX_ID_ISSET_ID, value);
  }

  public long getTxnId() {
    return this.txn_id;
  }

  public TTabletWriterOpenParams setTxnId(long txn_id) {
    this.txn_id = txn_id;
    setTxnIdIsSet(true);
    return this;
  }

  public void unsetTxnId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TXN_ID_ISSET_ID);
  }

  /** Returns true if field txn_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTxnId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TXN_ID_ISSET_ID);
  }

  public void setTxnIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TXN_ID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TOlapTableSchemaParam getSchema() {
    return this.schema;
  }

  public TTabletWriterOpenParams setSchema(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TOlapTableSchemaParam schema) {
    this.schema = schema;
    return this;
  }

  public void unsetSchema() {
    this.schema = null;
  }

  /** Returns true if field schema is set (has been assigned a value) and false otherwise */
  public boolean isSetSchema() {
    return this.schema != null;
  }

  public void setSchemaIsSet(boolean value) {
    if (!value) {
      this.schema = null;
    }
  }

  public int getTabletsSize() {
    return (this.tablets == null) ? 0 : this.tablets.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TTabletWithPartition> getTabletsIterator() {
    return (this.tablets == null) ? null : this.tablets.iterator();
  }

  public void addToTablets(TTabletWithPartition elem) {
    if (this.tablets == null) {
      this.tablets = new java.util.ArrayList<TTabletWithPartition>();
    }
    this.tablets.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TTabletWithPartition> getTablets() {
    return this.tablets;
  }

  public TTabletWriterOpenParams setTablets(@org.apache.thrift.annotation.Nullable java.util.List<TTabletWithPartition> tablets) {
    this.tablets = tablets;
    return this;
  }

  public void unsetTablets() {
    this.tablets = null;
  }

  /** Returns true if field tablets is set (has been assigned a value) and false otherwise */
  public boolean isSetTablets() {
    return this.tablets != null;
  }

  public void setTabletsIsSet(boolean value) {
    if (!value) {
      this.tablets = null;
    }
  }

  public int getNumSenders() {
    return this.num_senders;
  }

  public TTabletWriterOpenParams setNumSenders(int num_senders) {
    this.num_senders = num_senders;
    setNumSendersIsSet(true);
    return this;
  }

  public void unsetNumSenders() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NUM_SENDERS_ISSET_ID);
  }

  /** Returns true if field num_senders is set (has been assigned a value) and false otherwise */
  public boolean isSetNumSenders() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NUM_SENDERS_ISSET_ID);
  }

  public void setNumSendersIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NUM_SENDERS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((org.apache.doris.thrift.TUniqueId)value);
      }
      break;

    case INDEX_ID:
      if (value == null) {
        unsetIndexId();
      } else {
        setIndexId((java.lang.Long)value);
      }
      break;

    case TXN_ID:
      if (value == null) {
        unsetTxnId();
      } else {
        setTxnId((java.lang.Long)value);
      }
      break;

    case SCHEMA:
      if (value == null) {
        unsetSchema();
      } else {
        setSchema((org.apache.doris.thrift.TOlapTableSchemaParam)value);
      }
      break;

    case TABLETS:
      if (value == null) {
        unsetTablets();
      } else {
        setTablets((java.util.List<TTabletWithPartition>)value);
      }
      break;

    case NUM_SENDERS:
      if (value == null) {
        unsetNumSenders();
      } else {
        setNumSenders((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case INDEX_ID:
      return getIndexId();

    case TXN_ID:
      return getTxnId();

    case SCHEMA:
      return getSchema();

    case TABLETS:
      return getTablets();

    case NUM_SENDERS:
      return getNumSenders();

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
    case INDEX_ID:
      return isSetIndexId();
    case TXN_ID:
      return isSetTxnId();
    case SCHEMA:
      return isSetSchema();
    case TABLETS:
      return isSetTablets();
    case NUM_SENDERS:
      return isSetNumSenders();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TTabletWriterOpenParams)
      return this.equals((TTabletWriterOpenParams)that);
    return false;
  }

  public boolean equals(TTabletWriterOpenParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_index_id = true;
    boolean that_present_index_id = true;
    if (this_present_index_id || that_present_index_id) {
      if (!(this_present_index_id && that_present_index_id))
        return false;
      if (this.index_id != that.index_id)
        return false;
    }

    boolean this_present_txn_id = true;
    boolean that_present_txn_id = true;
    if (this_present_txn_id || that_present_txn_id) {
      if (!(this_present_txn_id && that_present_txn_id))
        return false;
      if (this.txn_id != that.txn_id)
        return false;
    }

    boolean this_present_schema = true && this.isSetSchema();
    boolean that_present_schema = true && that.isSetSchema();
    if (this_present_schema || that_present_schema) {
      if (!(this_present_schema && that_present_schema))
        return false;
      if (!this.schema.equals(that.schema))
        return false;
    }

    boolean this_present_tablets = true && this.isSetTablets();
    boolean that_present_tablets = true && that.isSetTablets();
    if (this_present_tablets || that_present_tablets) {
      if (!(this_present_tablets && that_present_tablets))
        return false;
      if (!this.tablets.equals(that.tablets))
        return false;
    }

    boolean this_present_num_senders = true;
    boolean that_present_num_senders = true;
    if (this_present_num_senders || that_present_num_senders) {
      if (!(this_present_num_senders && that_present_num_senders))
        return false;
      if (this.num_senders != that.num_senders)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(index_id);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(txn_id);

    hashCode = hashCode * 8191 + ((isSetSchema()) ? 131071 : 524287);
    if (isSetSchema())
      hashCode = hashCode * 8191 + schema.hashCode();

    hashCode = hashCode * 8191 + ((isSetTablets()) ? 131071 : 524287);
    if (isSetTablets())
      hashCode = hashCode * 8191 + tablets.hashCode();

    hashCode = hashCode * 8191 + num_senders;

    return hashCode;
  }

  @Override
  public int compareTo(TTabletWriterOpenParams other) {
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
    lastComparison = java.lang.Boolean.compare(isSetIndexId(), other.isSetIndexId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndexId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.index_id, other.index_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTxnId(), other.isSetTxnId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxnId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txn_id, other.txn_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSchema(), other.isSetSchema());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchema()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.schema, other.schema);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTablets(), other.isSetTablets());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTablets()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tablets, other.tablets);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetNumSenders(), other.isSetNumSenders());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumSenders()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_senders, other.num_senders);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TTabletWriterOpenParams(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("index_id:");
    sb.append(this.index_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("txn_id:");
    sb.append(this.txn_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("schema:");
    if (this.schema == null) {
      sb.append("null");
    } else {
      sb.append(this.schema);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tablets:");
    if (this.tablets == null) {
      sb.append("null");
    } else {
      sb.append(this.tablets);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("num_senders:");
    sb.append(this.num_senders);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'index_id' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'txn_id' because it's a primitive and you chose the non-beans generator.
    if (schema == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'schema' was not present! Struct: " + toString());
    }
    if (tablets == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tablets' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'num_senders' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (id != null) {
      id.validate();
    }
    if (schema != null) {
      schema.validate();
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

  private static class TTabletWriterOpenParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTabletWriterOpenParamsStandardScheme getScheme() {
      return new TTabletWriterOpenParamsStandardScheme();
    }
  }

  private static class TTabletWriterOpenParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTabletWriterOpenParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTabletWriterOpenParams struct) throws org.apache.thrift.TException {
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
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.id = new org.apache.doris.thrift.TUniqueId();
              struct.id.read(iprot);
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INDEX_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.index_id = iprot.readI64();
              struct.setIndexIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TXN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.txn_id = iprot.readI64();
              struct.setTxnIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SCHEMA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.schema = new org.apache.doris.thrift.TOlapTableSchemaParam();
              struct.schema.read(iprot);
              struct.setSchemaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TABLETS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list220 = iprot.readListBegin();
                struct.tablets = new java.util.ArrayList<TTabletWithPartition>(_list220.size);
                @org.apache.thrift.annotation.Nullable TTabletWithPartition _elem221;
                for (int _i222 = 0; _i222 < _list220.size; ++_i222)
                {
                  _elem221 = new TTabletWithPartition();
                  _elem221.read(iprot);
                  struct.tablets.add(_elem221);
                }
                iprot.readListEnd();
              }
              struct.setTabletsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // NUM_SENDERS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.num_senders = iprot.readI32();
              struct.setNumSendersIsSet(true);
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
      if (!struct.isSetIndexId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'index_id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetTxnId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'txn_id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetNumSenders()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'num_senders' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTabletWriterOpenParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        struct.id.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(INDEX_ID_FIELD_DESC);
      oprot.writeI64(struct.index_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TXN_ID_FIELD_DESC);
      oprot.writeI64(struct.txn_id);
      oprot.writeFieldEnd();
      if (struct.schema != null) {
        oprot.writeFieldBegin(SCHEMA_FIELD_DESC);
        struct.schema.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.tablets != null) {
        oprot.writeFieldBegin(TABLETS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.tablets.size()));
          for (TTabletWithPartition _iter223 : struct.tablets)
          {
            _iter223.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(NUM_SENDERS_FIELD_DESC);
      oprot.writeI32(struct.num_senders);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTabletWriterOpenParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTabletWriterOpenParamsTupleScheme getScheme() {
      return new TTabletWriterOpenParamsTupleScheme();
    }
  }

  private static class TTabletWriterOpenParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTabletWriterOpenParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTabletWriterOpenParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.id.write(oprot);
      oprot.writeI64(struct.index_id);
      oprot.writeI64(struct.txn_id);
      struct.schema.write(oprot);
      {
        oprot.writeI32(struct.tablets.size());
        for (TTabletWithPartition _iter224 : struct.tablets)
        {
          _iter224.write(oprot);
        }
      }
      oprot.writeI32(struct.num_senders);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTabletWriterOpenParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.id = new org.apache.doris.thrift.TUniqueId();
      struct.id.read(iprot);
      struct.setIdIsSet(true);
      struct.index_id = iprot.readI64();
      struct.setIndexIdIsSet(true);
      struct.txn_id = iprot.readI64();
      struct.setTxnIdIsSet(true);
      struct.schema = new org.apache.doris.thrift.TOlapTableSchemaParam();
      struct.schema.read(iprot);
      struct.setSchemaIsSet(true);
      {
        org.apache.thrift.protocol.TList _list225 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.tablets = new java.util.ArrayList<TTabletWithPartition>(_list225.size);
        @org.apache.thrift.annotation.Nullable TTabletWithPartition _elem226;
        for (int _i227 = 0; _i227 < _list225.size; ++_i227)
        {
          _elem226 = new TTabletWithPartition();
          _elem226.read(iprot);
          struct.tablets.add(_elem226);
        }
      }
      struct.setTabletsIsSet(true);
      struct.num_senders = iprot.readI32();
      struct.setNumSendersIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

