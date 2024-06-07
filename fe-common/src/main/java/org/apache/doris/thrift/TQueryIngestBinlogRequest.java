/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TQueryIngestBinlogRequest implements org.apache.thrift.TBase<TQueryIngestBinlogRequest, TQueryIngestBinlogRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TQueryIngestBinlogRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TQueryIngestBinlogRequest");

  private static final org.apache.thrift.protocol.TField TXN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("txn_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField PARTITION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_id", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField TABLET_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tablet_id", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField LOAD_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("load_id", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TQueryIngestBinlogRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TQueryIngestBinlogRequestTupleSchemeFactory();

  public long txn_id; // optional
  public long partition_id; // optional
  public long tablet_id; // optional
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId load_id; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TXN_ID((short)1, "txn_id"),
    PARTITION_ID((short)2, "partition_id"),
    TABLET_ID((short)3, "tablet_id"),
    LOAD_ID((short)4, "load_id");

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
        case 2: // PARTITION_ID
          return PARTITION_ID;
        case 3: // TABLET_ID
          return TABLET_ID;
        case 4: // LOAD_ID
          return LOAD_ID;
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
  private static final int __PARTITION_ID_ISSET_ID = 1;
  private static final int __TABLET_ID_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TXN_ID,_Fields.PARTITION_ID,_Fields.TABLET_ID,_Fields.LOAD_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TXN_ID, new org.apache.thrift.meta_data.FieldMetaData("txn_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PARTITION_ID, new org.apache.thrift.meta_data.FieldMetaData("partition_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TABLET_ID, new org.apache.thrift.meta_data.FieldMetaData("tablet_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LOAD_ID, new org.apache.thrift.meta_data.FieldMetaData("load_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TUniqueId.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TQueryIngestBinlogRequest.class, metaDataMap);
  }

  public TQueryIngestBinlogRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TQueryIngestBinlogRequest(TQueryIngestBinlogRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.txn_id = other.txn_id;
    this.partition_id = other.partition_id;
    this.tablet_id = other.tablet_id;
    if (other.isSetLoadId()) {
      this.load_id = new org.apache.doris.thrift.TUniqueId(other.load_id);
    }
  }

  public TQueryIngestBinlogRequest deepCopy() {
    return new TQueryIngestBinlogRequest(this);
  }

  @Override
  public void clear() {
    setTxnIdIsSet(false);
    this.txn_id = 0;
    setPartitionIdIsSet(false);
    this.partition_id = 0;
    setTabletIdIsSet(false);
    this.tablet_id = 0;
    this.load_id = null;
  }

  public long getTxnId() {
    return this.txn_id;
  }

  public TQueryIngestBinlogRequest setTxnId(long txn_id) {
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

  public long getPartitionId() {
    return this.partition_id;
  }

  public TQueryIngestBinlogRequest setPartitionId(long partition_id) {
    this.partition_id = partition_id;
    setPartitionIdIsSet(true);
    return this;
  }

  public void unsetPartitionId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PARTITION_ID_ISSET_ID);
  }

  /** Returns true if field partition_id is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PARTITION_ID_ISSET_ID);
  }

  public void setPartitionIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PARTITION_ID_ISSET_ID, value);
  }

  public long getTabletId() {
    return this.tablet_id;
  }

  public TQueryIngestBinlogRequest setTabletId(long tablet_id) {
    this.tablet_id = tablet_id;
    setTabletIdIsSet(true);
    return this;
  }

  public void unsetTabletId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TABLET_ID_ISSET_ID);
  }

  /** Returns true if field tablet_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTabletId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TABLET_ID_ISSET_ID);
  }

  public void setTabletIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TABLET_ID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TUniqueId getLoadId() {
    return this.load_id;
  }

  public TQueryIngestBinlogRequest setLoadId(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId load_id) {
    this.load_id = load_id;
    return this;
  }

  public void unsetLoadId() {
    this.load_id = null;
  }

  /** Returns true if field load_id is set (has been assigned a value) and false otherwise */
  public boolean isSetLoadId() {
    return this.load_id != null;
  }

  public void setLoadIdIsSet(boolean value) {
    if (!value) {
      this.load_id = null;
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

    case PARTITION_ID:
      if (value == null) {
        unsetPartitionId();
      } else {
        setPartitionId((java.lang.Long)value);
      }
      break;

    case TABLET_ID:
      if (value == null) {
        unsetTabletId();
      } else {
        setTabletId((java.lang.Long)value);
      }
      break;

    case LOAD_ID:
      if (value == null) {
        unsetLoadId();
      } else {
        setLoadId((org.apache.doris.thrift.TUniqueId)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TXN_ID:
      return getTxnId();

    case PARTITION_ID:
      return getPartitionId();

    case TABLET_ID:
      return getTabletId();

    case LOAD_ID:
      return getLoadId();

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
    case PARTITION_ID:
      return isSetPartitionId();
    case TABLET_ID:
      return isSetTabletId();
    case LOAD_ID:
      return isSetLoadId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TQueryIngestBinlogRequest)
      return this.equals((TQueryIngestBinlogRequest)that);
    return false;
  }

  public boolean equals(TQueryIngestBinlogRequest that) {
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

    boolean this_present_partition_id = true && this.isSetPartitionId();
    boolean that_present_partition_id = true && that.isSetPartitionId();
    if (this_present_partition_id || that_present_partition_id) {
      if (!(this_present_partition_id && that_present_partition_id))
        return false;
      if (this.partition_id != that.partition_id)
        return false;
    }

    boolean this_present_tablet_id = true && this.isSetTabletId();
    boolean that_present_tablet_id = true && that.isSetTabletId();
    if (this_present_tablet_id || that_present_tablet_id) {
      if (!(this_present_tablet_id && that_present_tablet_id))
        return false;
      if (this.tablet_id != that.tablet_id)
        return false;
    }

    boolean this_present_load_id = true && this.isSetLoadId();
    boolean that_present_load_id = true && that.isSetLoadId();
    if (this_present_load_id || that_present_load_id) {
      if (!(this_present_load_id && that_present_load_id))
        return false;
      if (!this.load_id.equals(that.load_id))
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

    hashCode = hashCode * 8191 + ((isSetPartitionId()) ? 131071 : 524287);
    if (isSetPartitionId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(partition_id);

    hashCode = hashCode * 8191 + ((isSetTabletId()) ? 131071 : 524287);
    if (isSetTabletId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(tablet_id);

    hashCode = hashCode * 8191 + ((isSetLoadId()) ? 131071 : 524287);
    if (isSetLoadId())
      hashCode = hashCode * 8191 + load_id.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TQueryIngestBinlogRequest other) {
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
    lastComparison = java.lang.Boolean.compare(isSetPartitionId(), other.isSetPartitionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition_id, other.partition_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTabletId(), other.isSetTabletId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTabletId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tablet_id, other.tablet_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetLoadId(), other.isSetLoadId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoadId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.load_id, other.load_id);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TQueryIngestBinlogRequest(");
    boolean first = true;

    if (isSetTxnId()) {
      sb.append("txn_id:");
      sb.append(this.txn_id);
      first = false;
    }
    if (isSetPartitionId()) {
      if (!first) sb.append(", ");
      sb.append("partition_id:");
      sb.append(this.partition_id);
      first = false;
    }
    if (isSetTabletId()) {
      if (!first) sb.append(", ");
      sb.append("tablet_id:");
      sb.append(this.tablet_id);
      first = false;
    }
    if (isSetLoadId()) {
      if (!first) sb.append(", ");
      sb.append("load_id:");
      if (this.load_id == null) {
        sb.append("null");
      } else {
        sb.append(this.load_id);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (load_id != null) {
      load_id.validate();
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

  private static class TQueryIngestBinlogRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TQueryIngestBinlogRequestStandardScheme getScheme() {
      return new TQueryIngestBinlogRequestStandardScheme();
    }
  }

  private static class TQueryIngestBinlogRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TQueryIngestBinlogRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TQueryIngestBinlogRequest struct) throws org.apache.thrift.TException {
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
          case 2: // PARTITION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.partition_id = iprot.readI64();
              struct.setPartitionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TABLET_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.tablet_id = iprot.readI64();
              struct.setTabletIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LOAD_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.load_id = new org.apache.doris.thrift.TUniqueId();
              struct.load_id.read(iprot);
              struct.setLoadIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TQueryIngestBinlogRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetTxnId()) {
        oprot.writeFieldBegin(TXN_ID_FIELD_DESC);
        oprot.writeI64(struct.txn_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPartitionId()) {
        oprot.writeFieldBegin(PARTITION_ID_FIELD_DESC);
        oprot.writeI64(struct.partition_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTabletId()) {
        oprot.writeFieldBegin(TABLET_ID_FIELD_DESC);
        oprot.writeI64(struct.tablet_id);
        oprot.writeFieldEnd();
      }
      if (struct.load_id != null) {
        if (struct.isSetLoadId()) {
          oprot.writeFieldBegin(LOAD_ID_FIELD_DESC);
          struct.load_id.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TQueryIngestBinlogRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TQueryIngestBinlogRequestTupleScheme getScheme() {
      return new TQueryIngestBinlogRequestTupleScheme();
    }
  }

  private static class TQueryIngestBinlogRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TQueryIngestBinlogRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TQueryIngestBinlogRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTxnId()) {
        optionals.set(0);
      }
      if (struct.isSetPartitionId()) {
        optionals.set(1);
      }
      if (struct.isSetTabletId()) {
        optionals.set(2);
      }
      if (struct.isSetLoadId()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTxnId()) {
        oprot.writeI64(struct.txn_id);
      }
      if (struct.isSetPartitionId()) {
        oprot.writeI64(struct.partition_id);
      }
      if (struct.isSetTabletId()) {
        oprot.writeI64(struct.tablet_id);
      }
      if (struct.isSetLoadId()) {
        struct.load_id.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TQueryIngestBinlogRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.txn_id = iprot.readI64();
        struct.setTxnIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.partition_id = iprot.readI64();
        struct.setPartitionIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.tablet_id = iprot.readI64();
        struct.setTabletIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.load_id = new org.apache.doris.thrift.TUniqueId();
        struct.load_id.read(iprot);
        struct.setLoadIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

