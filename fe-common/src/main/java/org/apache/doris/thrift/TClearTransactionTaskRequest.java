/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TClearTransactionTaskRequest implements org.apache.thrift.TBase<TClearTransactionTaskRequest, TClearTransactionTaskRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TClearTransactionTaskRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TClearTransactionTaskRequest");

  private static final org.apache.thrift.protocol.TField TRANSACTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("transaction_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField PARTITION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_id", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TClearTransactionTaskRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TClearTransactionTaskRequestTupleSchemeFactory();

  public long transaction_id; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Long> partition_id; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRANSACTION_ID((short)1, "transaction_id"),
    PARTITION_ID((short)2, "partition_id");

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
        case 1: // TRANSACTION_ID
          return TRANSACTION_ID;
        case 2: // PARTITION_ID
          return PARTITION_ID;
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
  private static final int __TRANSACTION_ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TRANSACTION_ID, new org.apache.thrift.meta_data.FieldMetaData("transaction_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TTransactionId")));
    tmpMap.put(_Fields.PARTITION_ID, new org.apache.thrift.meta_data.FieldMetaData("partition_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64            , "TPartitionId"))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TClearTransactionTaskRequest.class, metaDataMap);
  }

  public TClearTransactionTaskRequest() {
  }

  public TClearTransactionTaskRequest(
    long transaction_id,
    java.util.List<java.lang.Long> partition_id)
  {
    this();
    this.transaction_id = transaction_id;
    setTransactionIdIsSet(true);
    this.partition_id = partition_id;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TClearTransactionTaskRequest(TClearTransactionTaskRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.transaction_id = other.transaction_id;
    if (other.isSetPartitionId()) {
      java.util.List<java.lang.Long> __this__partition_id = new java.util.ArrayList<java.lang.Long>(other.partition_id.size());
      for (java.lang.Long other_element : other.partition_id) {
        __this__partition_id.add(other_element);
      }
      this.partition_id = __this__partition_id;
    }
  }

  public TClearTransactionTaskRequest deepCopy() {
    return new TClearTransactionTaskRequest(this);
  }

  @Override
  public void clear() {
    setTransactionIdIsSet(false);
    this.transaction_id = 0;
    this.partition_id = null;
  }

  public long getTransactionId() {
    return this.transaction_id;
  }

  public TClearTransactionTaskRequest setTransactionId(long transaction_id) {
    this.transaction_id = transaction_id;
    setTransactionIdIsSet(true);
    return this;
  }

  public void unsetTransactionId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TRANSACTION_ID_ISSET_ID);
  }

  /** Returns true if field transaction_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTransactionId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TRANSACTION_ID_ISSET_ID);
  }

  public void setTransactionIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TRANSACTION_ID_ISSET_ID, value);
  }

  public int getPartitionIdSize() {
    return (this.partition_id == null) ? 0 : this.partition_id.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Long> getPartitionIdIterator() {
    return (this.partition_id == null) ? null : this.partition_id.iterator();
  }

  public void addToPartitionId(long elem) {
    if (this.partition_id == null) {
      this.partition_id = new java.util.ArrayList<java.lang.Long>();
    }
    this.partition_id.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Long> getPartitionId() {
    return this.partition_id;
  }

  public TClearTransactionTaskRequest setPartitionId(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Long> partition_id) {
    this.partition_id = partition_id;
    return this;
  }

  public void unsetPartitionId() {
    this.partition_id = null;
  }

  /** Returns true if field partition_id is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionId() {
    return this.partition_id != null;
  }

  public void setPartitionIdIsSet(boolean value) {
    if (!value) {
      this.partition_id = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TRANSACTION_ID:
      if (value == null) {
        unsetTransactionId();
      } else {
        setTransactionId((java.lang.Long)value);
      }
      break;

    case PARTITION_ID:
      if (value == null) {
        unsetPartitionId();
      } else {
        setPartitionId((java.util.List<java.lang.Long>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TRANSACTION_ID:
      return getTransactionId();

    case PARTITION_ID:
      return getPartitionId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TRANSACTION_ID:
      return isSetTransactionId();
    case PARTITION_ID:
      return isSetPartitionId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TClearTransactionTaskRequest)
      return this.equals((TClearTransactionTaskRequest)that);
    return false;
  }

  public boolean equals(TClearTransactionTaskRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_transaction_id = true;
    boolean that_present_transaction_id = true;
    if (this_present_transaction_id || that_present_transaction_id) {
      if (!(this_present_transaction_id && that_present_transaction_id))
        return false;
      if (this.transaction_id != that.transaction_id)
        return false;
    }

    boolean this_present_partition_id = true && this.isSetPartitionId();
    boolean that_present_partition_id = true && that.isSetPartitionId();
    if (this_present_partition_id || that_present_partition_id) {
      if (!(this_present_partition_id && that_present_partition_id))
        return false;
      if (!this.partition_id.equals(that.partition_id))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(transaction_id);

    hashCode = hashCode * 8191 + ((isSetPartitionId()) ? 131071 : 524287);
    if (isSetPartitionId())
      hashCode = hashCode * 8191 + partition_id.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TClearTransactionTaskRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTransactionId(), other.isSetTransactionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransactionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transaction_id, other.transaction_id);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TClearTransactionTaskRequest(");
    boolean first = true;

    sb.append("transaction_id:");
    sb.append(this.transaction_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("partition_id:");
    if (this.partition_id == null) {
      sb.append("null");
    } else {
      sb.append(this.partition_id);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'transaction_id' because it's a primitive and you chose the non-beans generator.
    if (partition_id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'partition_id' was not present! Struct: " + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TClearTransactionTaskRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TClearTransactionTaskRequestStandardScheme getScheme() {
      return new TClearTransactionTaskRequestStandardScheme();
    }
  }

  private static class TClearTransactionTaskRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TClearTransactionTaskRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TClearTransactionTaskRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TRANSACTION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.transaction_id = iprot.readI64();
              struct.setTransactionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARTITION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list202 = iprot.readListBegin();
                struct.partition_id = new java.util.ArrayList<java.lang.Long>(_list202.size);
                long _elem203;
                for (int _i204 = 0; _i204 < _list202.size; ++_i204)
                {
                  _elem203 = iprot.readI64();
                  struct.partition_id.add(_elem203);
                }
                iprot.readListEnd();
              }
              struct.setPartitionIdIsSet(true);
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
      if (!struct.isSetTransactionId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'transaction_id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TClearTransactionTaskRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TRANSACTION_ID_FIELD_DESC);
      oprot.writeI64(struct.transaction_id);
      oprot.writeFieldEnd();
      if (struct.partition_id != null) {
        oprot.writeFieldBegin(PARTITION_ID_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.partition_id.size()));
          for (long _iter205 : struct.partition_id)
          {
            oprot.writeI64(_iter205);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TClearTransactionTaskRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TClearTransactionTaskRequestTupleScheme getScheme() {
      return new TClearTransactionTaskRequestTupleScheme();
    }
  }

  private static class TClearTransactionTaskRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TClearTransactionTaskRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TClearTransactionTaskRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.transaction_id);
      {
        oprot.writeI32(struct.partition_id.size());
        for (long _iter206 : struct.partition_id)
        {
          oprot.writeI64(_iter206);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TClearTransactionTaskRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.transaction_id = iprot.readI64();
      struct.setTransactionIdIsSet(true);
      {
        org.apache.thrift.protocol.TList _list207 = iprot.readListBegin(org.apache.thrift.protocol.TType.I64);
        struct.partition_id = new java.util.ArrayList<java.lang.Long>(_list207.size);
        long _elem208;
        for (int _i209 = 0; _i209 < _list207.size; ++_i209)
        {
          _elem208 = iprot.readI64();
          struct.partition_id.add(_elem208);
        }
      }
      struct.setPartitionIdIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

