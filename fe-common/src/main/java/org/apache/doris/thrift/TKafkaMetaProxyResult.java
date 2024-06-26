/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TKafkaMetaProxyResult implements org.apache.thrift.TBase<TKafkaMetaProxyResult, TKafkaMetaProxyResult._Fields>, java.io.Serializable, Cloneable, Comparable<TKafkaMetaProxyResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TKafkaMetaProxyResult");

  private static final org.apache.thrift.protocol.TField PARTITION_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_ids", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TKafkaMetaProxyResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TKafkaMetaProxyResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> partition_ids; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARTITION_IDS((short)1, "partition_ids");

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
        case 1: // PARTITION_IDS
          return PARTITION_IDS;
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
  private static final _Fields optionals[] = {_Fields.PARTITION_IDS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARTITION_IDS, new org.apache.thrift.meta_data.FieldMetaData("partition_ids", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TKafkaMetaProxyResult.class, metaDataMap);
  }

  public TKafkaMetaProxyResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TKafkaMetaProxyResult(TKafkaMetaProxyResult other) {
    if (other.isSetPartitionIds()) {
      java.util.List<java.lang.Integer> __this__partition_ids = new java.util.ArrayList<java.lang.Integer>(other.partition_ids);
      this.partition_ids = __this__partition_ids;
    }
  }

  public TKafkaMetaProxyResult deepCopy() {
    return new TKafkaMetaProxyResult(this);
  }

  @Override
  public void clear() {
    this.partition_ids = null;
  }

  public int getPartitionIdsSize() {
    return (this.partition_ids == null) ? 0 : this.partition_ids.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Integer> getPartitionIdsIterator() {
    return (this.partition_ids == null) ? null : this.partition_ids.iterator();
  }

  public void addToPartitionIds(int elem) {
    if (this.partition_ids == null) {
      this.partition_ids = new java.util.ArrayList<java.lang.Integer>();
    }
    this.partition_ids.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Integer> getPartitionIds() {
    return this.partition_ids;
  }

  public TKafkaMetaProxyResult setPartitionIds(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> partition_ids) {
    this.partition_ids = partition_ids;
    return this;
  }

  public void unsetPartitionIds() {
    this.partition_ids = null;
  }

  /** Returns true if field partition_ids is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionIds() {
    return this.partition_ids != null;
  }

  public void setPartitionIdsIsSet(boolean value) {
    if (!value) {
      this.partition_ids = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PARTITION_IDS:
      if (value == null) {
        unsetPartitionIds();
      } else {
        setPartitionIds((java.util.List<java.lang.Integer>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTITION_IDS:
      return getPartitionIds();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PARTITION_IDS:
      return isSetPartitionIds();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TKafkaMetaProxyResult)
      return this.equals((TKafkaMetaProxyResult)that);
    return false;
  }

  public boolean equals(TKafkaMetaProxyResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_partition_ids = true && this.isSetPartitionIds();
    boolean that_present_partition_ids = true && that.isSetPartitionIds();
    if (this_present_partition_ids || that_present_partition_ids) {
      if (!(this_present_partition_ids && that_present_partition_ids))
        return false;
      if (!this.partition_ids.equals(that.partition_ids))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPartitionIds()) ? 131071 : 524287);
    if (isSetPartitionIds())
      hashCode = hashCode * 8191 + partition_ids.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TKafkaMetaProxyResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetPartitionIds(), other.isSetPartitionIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition_ids, other.partition_ids);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TKafkaMetaProxyResult(");
    boolean first = true;

    if (isSetPartitionIds()) {
      sb.append("partition_ids:");
      if (this.partition_ids == null) {
        sb.append("null");
      } else {
        sb.append(this.partition_ids);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TKafkaMetaProxyResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TKafkaMetaProxyResultStandardScheme getScheme() {
      return new TKafkaMetaProxyResultStandardScheme();
    }
  }

  private static class TKafkaMetaProxyResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TKafkaMetaProxyResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TKafkaMetaProxyResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITION_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list38 = iprot.readListBegin();
                struct.partition_ids = new java.util.ArrayList<java.lang.Integer>(_list38.size);
                int _elem39;
                for (int _i40 = 0; _i40 < _list38.size; ++_i40)
                {
                  _elem39 = iprot.readI32();
                  struct.partition_ids.add(_elem39);
                }
                iprot.readListEnd();
              }
              struct.setPartitionIdsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TKafkaMetaProxyResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.partition_ids != null) {
        if (struct.isSetPartitionIds()) {
          oprot.writeFieldBegin(PARTITION_IDS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.partition_ids.size()));
            for (int _iter41 : struct.partition_ids)
            {
              oprot.writeI32(_iter41);
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

  private static class TKafkaMetaProxyResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TKafkaMetaProxyResultTupleScheme getScheme() {
      return new TKafkaMetaProxyResultTupleScheme();
    }
  }

  private static class TKafkaMetaProxyResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TKafkaMetaProxyResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TKafkaMetaProxyResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPartitionIds()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetPartitionIds()) {
        {
          oprot.writeI32(struct.partition_ids.size());
          for (int _iter42 : struct.partition_ids)
          {
            oprot.writeI32(_iter42);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TKafkaMetaProxyResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list43 = iprot.readListBegin(org.apache.thrift.protocol.TType.I32);
          struct.partition_ids = new java.util.ArrayList<java.lang.Integer>(_list43.size);
          int _elem44;
          for (int _i45 = 0; _i45 < _list43.size; ++_i45)
          {
            _elem44 = iprot.readI32();
            struct.partition_ids.add(_elem44);
          }
        }
        struct.setPartitionIdsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

