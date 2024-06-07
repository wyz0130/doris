/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TCreatePartitionRequest implements org.apache.thrift.TBase<TCreatePartitionRequest, TCreatePartitionRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TCreatePartitionRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCreatePartitionRequest");

  private static final org.apache.thrift.protocol.TField TXN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("txn_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField DB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("db_id", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField TABLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("table_id", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField PARTITION_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("partitionValues", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TCreatePartitionRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TCreatePartitionRequestTupleSchemeFactory();

  public long txn_id; // optional
  public long db_id; // optional
  public long table_id; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<java.util.List<org.apache.doris.thrift.TNullableStringLiteral>> partitionValues; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TXN_ID((short)1, "txn_id"),
    DB_ID((short)2, "db_id"),
    TABLE_ID((short)3, "table_id"),
    PARTITION_VALUES((short)4, "partitionValues");

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
        case 1: // TXN_ID
          return TXN_ID;
        case 2: // DB_ID
          return DB_ID;
        case 3: // TABLE_ID
          return TABLE_ID;
        case 4: // PARTITION_VALUES
          return PARTITION_VALUES;
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
  private static final int __TXN_ID_ISSET_ID = 0;
  private static final int __DB_ID_ISSET_ID = 1;
  private static final int __TABLE_ID_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TXN_ID,_Fields.DB_ID,_Fields.TABLE_ID,_Fields.PARTITION_VALUES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TXN_ID, new org.apache.thrift.meta_data.FieldMetaData("txn_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DB_ID, new org.apache.thrift.meta_data.FieldMetaData("db_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TABLE_ID, new org.apache.thrift.meta_data.FieldMetaData("table_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PARTITION_VALUES, new org.apache.thrift.meta_data.FieldMetaData("partitionValues", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TNullableStringLiteral.class)))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCreatePartitionRequest.class, metaDataMap);
  }

  public TCreatePartitionRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCreatePartitionRequest(TCreatePartitionRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.txn_id = other.txn_id;
    this.db_id = other.db_id;
    this.table_id = other.table_id;
    if (other.isSetPartitionValues()) {
      java.util.List<java.util.List<org.apache.doris.thrift.TNullableStringLiteral>> __this__partitionValues = new java.util.ArrayList<java.util.List<org.apache.doris.thrift.TNullableStringLiteral>>(other.partitionValues.size());
      for (java.util.List<org.apache.doris.thrift.TNullableStringLiteral> other_element : other.partitionValues) {
        java.util.List<org.apache.doris.thrift.TNullableStringLiteral> __this__partitionValues_copy = new java.util.ArrayList<org.apache.doris.thrift.TNullableStringLiteral>(other_element.size());
        for (org.apache.doris.thrift.TNullableStringLiteral other_element_element : other_element) {
          __this__partitionValues_copy.add(new org.apache.doris.thrift.TNullableStringLiteral(other_element_element));
        }
        __this__partitionValues.add(__this__partitionValues_copy);
      }
      this.partitionValues = __this__partitionValues;
    }
  }

  public TCreatePartitionRequest deepCopy() {
    return new TCreatePartitionRequest(this);
  }

  @Override
  public void clear() {
    setTxnIdIsSet(false);
    this.txn_id = 0;
    setDbIdIsSet(false);
    this.db_id = 0;
    setTableIdIsSet(false);
    this.table_id = 0;
    this.partitionValues = null;
  }

  public long getTxnId() {
    return this.txn_id;
  }

  public TCreatePartitionRequest setTxnId(long txn_id) {
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

  public long getDbId() {
    return this.db_id;
  }

  public TCreatePartitionRequest setDbId(long db_id) {
    this.db_id = db_id;
    setDbIdIsSet(true);
    return this;
  }

  public void unsetDbId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DB_ID_ISSET_ID);
  }

  /** Returns true if field db_id is set (has been assigned a value) and false otherwise */
  public boolean isSetDbId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DB_ID_ISSET_ID);
  }

  public void setDbIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DB_ID_ISSET_ID, value);
  }

  public long getTableId() {
    return this.table_id;
  }

  public TCreatePartitionRequest setTableId(long table_id) {
    this.table_id = table_id;
    setTableIdIsSet(true);
    return this;
  }

  public void unsetTableId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TABLE_ID_ISSET_ID);
  }

  /** Returns true if field table_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTableId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TABLE_ID_ISSET_ID);
  }

  public void setTableIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TABLE_ID_ISSET_ID, value);
  }

  public int getPartitionValuesSize() {
    return (this.partitionValues == null) ? 0 : this.partitionValues.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.util.List<org.apache.doris.thrift.TNullableStringLiteral>> getPartitionValuesIterator() {
    return (this.partitionValues == null) ? null : this.partitionValues.iterator();
  }

  public void addToPartitionValues(java.util.List<org.apache.doris.thrift.TNullableStringLiteral> elem) {
    if (this.partitionValues == null) {
      this.partitionValues = new java.util.ArrayList<java.util.List<org.apache.doris.thrift.TNullableStringLiteral>>();
    }
    this.partitionValues.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.util.List<org.apache.doris.thrift.TNullableStringLiteral>> getPartitionValues() {
    return this.partitionValues;
  }

  public TCreatePartitionRequest setPartitionValues(@org.apache.thrift.annotation.Nullable java.util.List<java.util.List<org.apache.doris.thrift.TNullableStringLiteral>> partitionValues) {
    this.partitionValues = partitionValues;
    return this;
  }

  public void unsetPartitionValues() {
    this.partitionValues = null;
  }

  /** Returns true if field partitionValues is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionValues() {
    return this.partitionValues != null;
  }

  public void setPartitionValuesIsSet(boolean value) {
    if (!value) {
      this.partitionValues = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TXN_ID:
      if (value == null) {
        unsetTxnId();
      } else {
        setTxnId((java.lang.Long)value);
      }
      break;

    case DB_ID:
      if (value == null) {
        unsetDbId();
      } else {
        setDbId((java.lang.Long)value);
      }
      break;

    case TABLE_ID:
      if (value == null) {
        unsetTableId();
      } else {
        setTableId((java.lang.Long)value);
      }
      break;

    case PARTITION_VALUES:
      if (value == null) {
        unsetPartitionValues();
      } else {
        setPartitionValues((java.util.List<java.util.List<org.apache.doris.thrift.TNullableStringLiteral>>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TXN_ID:
      return getTxnId();

    case DB_ID:
      return getDbId();

    case TABLE_ID:
      return getTableId();

    case PARTITION_VALUES:
      return getPartitionValues();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TXN_ID:
      return isSetTxnId();
    case DB_ID:
      return isSetDbId();
    case TABLE_ID:
      return isSetTableId();
    case PARTITION_VALUES:
      return isSetPartitionValues();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TCreatePartitionRequest)
      return this.equals((TCreatePartitionRequest)that);
    return false;
  }

  public boolean equals(TCreatePartitionRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_txn_id = true && this.isSetTxnId();
    boolean that_present_txn_id = true && that.isSetTxnId();
    if (this_present_txn_id || that_present_txn_id) {
      if (!(this_present_txn_id && that_present_txn_id))
        return false;
      if (this.txn_id != that.txn_id)
        return false;
    }

    boolean this_present_db_id = true && this.isSetDbId();
    boolean that_present_db_id = true && that.isSetDbId();
    if (this_present_db_id || that_present_db_id) {
      if (!(this_present_db_id && that_present_db_id))
        return false;
      if (this.db_id != that.db_id)
        return false;
    }

    boolean this_present_table_id = true && this.isSetTableId();
    boolean that_present_table_id = true && that.isSetTableId();
    if (this_present_table_id || that_present_table_id) {
      if (!(this_present_table_id && that_present_table_id))
        return false;
      if (this.table_id != that.table_id)
        return false;
    }

    boolean this_present_partitionValues = true && this.isSetPartitionValues();
    boolean that_present_partitionValues = true && that.isSetPartitionValues();
    if (this_present_partitionValues || that_present_partitionValues) {
      if (!(this_present_partitionValues && that_present_partitionValues))
        return false;
      if (!this.partitionValues.equals(that.partitionValues))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTxnId()) ? 131071 : 524287);
    if (isSetTxnId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(txn_id);

    hashCode = hashCode * 8191 + ((isSetDbId()) ? 131071 : 524287);
    if (isSetDbId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(db_id);

    hashCode = hashCode * 8191 + ((isSetTableId()) ? 131071 : 524287);
    if (isSetTableId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(table_id);

    hashCode = hashCode * 8191 + ((isSetPartitionValues()) ? 131071 : 524287);
    if (isSetPartitionValues())
      hashCode = hashCode * 8191 + partitionValues.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TCreatePartitionRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.compare(isSetDbId(), other.isSetDbId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.db_id, other.db_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTableId(), other.isSetTableId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_id, other.table_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPartitionValues(), other.isSetPartitionValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitionValues, other.partitionValues);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TCreatePartitionRequest(");
    boolean first = true;

    if (isSetTxnId()) {
      sb.append("txn_id:");
      sb.append(this.txn_id);
      first = false;
    }
    if (isSetDbId()) {
      if (!first) sb.append(", ");
      sb.append("db_id:");
      sb.append(this.db_id);
      first = false;
    }
    if (isSetTableId()) {
      if (!first) sb.append(", ");
      sb.append("table_id:");
      sb.append(this.table_id);
      first = false;
    }
    if (isSetPartitionValues()) {
      if (!first) sb.append(", ");
      sb.append("partitionValues:");
      if (this.partitionValues == null) {
        sb.append("null");
      } else {
        sb.append(this.partitionValues);
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

  private static class TCreatePartitionRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCreatePartitionRequestStandardScheme getScheme() {
      return new TCreatePartitionRequestStandardScheme();
    }
  }

  private static class TCreatePartitionRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TCreatePartitionRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCreatePartitionRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TXN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.txn_id = iprot.readI64();
              struct.setTxnIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DB_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.db_id = iprot.readI64();
              struct.setDbIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TABLE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.table_id = iprot.readI64();
              struct.setTableIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PARTITION_VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list560 = iprot.readListBegin();
                struct.partitionValues = new java.util.ArrayList<java.util.List<org.apache.doris.thrift.TNullableStringLiteral>>(_list560.size);
                @org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TNullableStringLiteral> _elem561;
                for (int _i562 = 0; _i562 < _list560.size; ++_i562)
                {
                  {
                    org.apache.thrift.protocol.TList _list563 = iprot.readListBegin();
                    _elem561 = new java.util.ArrayList<org.apache.doris.thrift.TNullableStringLiteral>(_list563.size);
                    @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TNullableStringLiteral _elem564;
                    for (int _i565 = 0; _i565 < _list563.size; ++_i565)
                    {
                      _elem564 = new org.apache.doris.thrift.TNullableStringLiteral();
                      _elem564.read(iprot);
                      _elem561.add(_elem564);
                    }
                    iprot.readListEnd();
                  }
                  struct.partitionValues.add(_elem561);
                }
                iprot.readListEnd();
              }
              struct.setPartitionValuesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCreatePartitionRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetTxnId()) {
        oprot.writeFieldBegin(TXN_ID_FIELD_DESC);
        oprot.writeI64(struct.txn_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDbId()) {
        oprot.writeFieldBegin(DB_ID_FIELD_DESC);
        oprot.writeI64(struct.db_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTableId()) {
        oprot.writeFieldBegin(TABLE_ID_FIELD_DESC);
        oprot.writeI64(struct.table_id);
        oprot.writeFieldEnd();
      }
      if (struct.partitionValues != null) {
        if (struct.isSetPartitionValues()) {
          oprot.writeFieldBegin(PARTITION_VALUES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.partitionValues.size()));
            for (java.util.List<org.apache.doris.thrift.TNullableStringLiteral> _iter566 : struct.partitionValues)
            {
              {
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter566.size()));
                for (org.apache.doris.thrift.TNullableStringLiteral _iter567 : _iter566)
                {
                  _iter567.write(oprot);
                }
                oprot.writeListEnd();
              }
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

  private static class TCreatePartitionRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCreatePartitionRequestTupleScheme getScheme() {
      return new TCreatePartitionRequestTupleScheme();
    }
  }

  private static class TCreatePartitionRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TCreatePartitionRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCreatePartitionRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTxnId()) {
        optionals.set(0);
      }
      if (struct.isSetDbId()) {
        optionals.set(1);
      }
      if (struct.isSetTableId()) {
        optionals.set(2);
      }
      if (struct.isSetPartitionValues()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTxnId()) {
        oprot.writeI64(struct.txn_id);
      }
      if (struct.isSetDbId()) {
        oprot.writeI64(struct.db_id);
      }
      if (struct.isSetTableId()) {
        oprot.writeI64(struct.table_id);
      }
      if (struct.isSetPartitionValues()) {
        {
          oprot.writeI32(struct.partitionValues.size());
          for (java.util.List<org.apache.doris.thrift.TNullableStringLiteral> _iter568 : struct.partitionValues)
          {
            {
              oprot.writeI32(_iter568.size());
              for (org.apache.doris.thrift.TNullableStringLiteral _iter569 : _iter568)
              {
                _iter569.write(oprot);
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCreatePartitionRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.txn_id = iprot.readI64();
        struct.setTxnIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.db_id = iprot.readI64();
        struct.setDbIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.table_id = iprot.readI64();
        struct.setTableIdIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list570 = iprot.readListBegin(org.apache.thrift.protocol.TType.LIST);
          struct.partitionValues = new java.util.ArrayList<java.util.List<org.apache.doris.thrift.TNullableStringLiteral>>(_list570.size);
          @org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TNullableStringLiteral> _elem571;
          for (int _i572 = 0; _i572 < _list570.size; ++_i572)
          {
            {
              org.apache.thrift.protocol.TList _list573 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
              _elem571 = new java.util.ArrayList<org.apache.doris.thrift.TNullableStringLiteral>(_list573.size);
              @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TNullableStringLiteral _elem574;
              for (int _i575 = 0; _i575 < _list573.size; ++_i575)
              {
                _elem574 = new org.apache.doris.thrift.TNullableStringLiteral();
                _elem574.read(iprot);
                _elem571.add(_elem574);
              }
            }
            struct.partitionValues.add(_elem571);
          }
        }
        struct.setPartitionValuesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

