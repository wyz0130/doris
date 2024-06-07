/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TTransactionalHiveDesc implements org.apache.thrift.TBase<TTransactionalHiveDesc, TTransactionalHiveDesc._Fields>, java.io.Serializable, Cloneable, Comparable<TTransactionalHiveDesc> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTransactionalHiveDesc");

  private static final org.apache.thrift.protocol.TField PARTITION_FIELD_DESC = new org.apache.thrift.protocol.TField("partition", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DELETE_DELTAS_FIELD_DESC = new org.apache.thrift.protocol.TField("delete_deltas", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTransactionalHiveDescStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTransactionalHiveDescTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String partition; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<TTransactionalHiveDeleteDeltaDesc> delete_deltas; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARTITION((short)1, "partition"),
    DELETE_DELTAS((short)2, "delete_deltas");

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
        case 1: // PARTITION
          return PARTITION;
        case 2: // DELETE_DELTAS
          return DELETE_DELTAS;
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
  private static final _Fields optionals[] = {_Fields.PARTITION,_Fields.DELETE_DELTAS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARTITION, new org.apache.thrift.meta_data.FieldMetaData("partition", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DELETE_DELTAS, new org.apache.thrift.meta_data.FieldMetaData("delete_deltas", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTransactionalHiveDeleteDeltaDesc.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTransactionalHiveDesc.class, metaDataMap);
  }

  public TTransactionalHiveDesc() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTransactionalHiveDesc(TTransactionalHiveDesc other) {
    if (other.isSetPartition()) {
      this.partition = other.partition;
    }
    if (other.isSetDeleteDeltas()) {
      java.util.List<TTransactionalHiveDeleteDeltaDesc> __this__delete_deltas = new java.util.ArrayList<TTransactionalHiveDeleteDeltaDesc>(other.delete_deltas.size());
      for (TTransactionalHiveDeleteDeltaDesc other_element : other.delete_deltas) {
        __this__delete_deltas.add(new TTransactionalHiveDeleteDeltaDesc(other_element));
      }
      this.delete_deltas = __this__delete_deltas;
    }
  }

  public TTransactionalHiveDesc deepCopy() {
    return new TTransactionalHiveDesc(this);
  }

  @Override
  public void clear() {
    this.partition = null;
    this.delete_deltas = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPartition() {
    return this.partition;
  }

  public TTransactionalHiveDesc setPartition(@org.apache.thrift.annotation.Nullable java.lang.String partition) {
    this.partition = partition;
    return this;
  }

  public void unsetPartition() {
    this.partition = null;
  }

  /** Returns true if field partition is set (has been assigned a value) and false otherwise */
  public boolean isSetPartition() {
    return this.partition != null;
  }

  public void setPartitionIsSet(boolean value) {
    if (!value) {
      this.partition = null;
    }
  }

  public int getDeleteDeltasSize() {
    return (this.delete_deltas == null) ? 0 : this.delete_deltas.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TTransactionalHiveDeleteDeltaDesc> getDeleteDeltasIterator() {
    return (this.delete_deltas == null) ? null : this.delete_deltas.iterator();
  }

  public void addToDeleteDeltas(TTransactionalHiveDeleteDeltaDesc elem) {
    if (this.delete_deltas == null) {
      this.delete_deltas = new java.util.ArrayList<TTransactionalHiveDeleteDeltaDesc>();
    }
    this.delete_deltas.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TTransactionalHiveDeleteDeltaDesc> getDeleteDeltas() {
    return this.delete_deltas;
  }

  public TTransactionalHiveDesc setDeleteDeltas(@org.apache.thrift.annotation.Nullable java.util.List<TTransactionalHiveDeleteDeltaDesc> delete_deltas) {
    this.delete_deltas = delete_deltas;
    return this;
  }

  public void unsetDeleteDeltas() {
    this.delete_deltas = null;
  }

  /** Returns true if field delete_deltas is set (has been assigned a value) and false otherwise */
  public boolean isSetDeleteDeltas() {
    return this.delete_deltas != null;
  }

  public void setDeleteDeltasIsSet(boolean value) {
    if (!value) {
      this.delete_deltas = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PARTITION:
      if (value == null) {
        unsetPartition();
      } else {
        setPartition((java.lang.String)value);
      }
      break;

    case DELETE_DELTAS:
      if (value == null) {
        unsetDeleteDeltas();
      } else {
        setDeleteDeltas((java.util.List<TTransactionalHiveDeleteDeltaDesc>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTITION:
      return getPartition();

    case DELETE_DELTAS:
      return getDeleteDeltas();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PARTITION:
      return isSetPartition();
    case DELETE_DELTAS:
      return isSetDeleteDeltas();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TTransactionalHiveDesc)
      return this.equals((TTransactionalHiveDesc)that);
    return false;
  }

  public boolean equals(TTransactionalHiveDesc that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_partition = true && this.isSetPartition();
    boolean that_present_partition = true && that.isSetPartition();
    if (this_present_partition || that_present_partition) {
      if (!(this_present_partition && that_present_partition))
        return false;
      if (!this.partition.equals(that.partition))
        return false;
    }

    boolean this_present_delete_deltas = true && this.isSetDeleteDeltas();
    boolean that_present_delete_deltas = true && that.isSetDeleteDeltas();
    if (this_present_delete_deltas || that_present_delete_deltas) {
      if (!(this_present_delete_deltas && that_present_delete_deltas))
        return false;
      if (!this.delete_deltas.equals(that.delete_deltas))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPartition()) ? 131071 : 524287);
    if (isSetPartition())
      hashCode = hashCode * 8191 + partition.hashCode();

    hashCode = hashCode * 8191 + ((isSetDeleteDeltas()) ? 131071 : 524287);
    if (isSetDeleteDeltas())
      hashCode = hashCode * 8191 + delete_deltas.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TTransactionalHiveDesc other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetPartition(), other.isSetPartition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition, other.partition);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDeleteDeltas(), other.isSetDeleteDeltas());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeleteDeltas()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.delete_deltas, other.delete_deltas);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TTransactionalHiveDesc(");
    boolean first = true;

    if (isSetPartition()) {
      sb.append("partition:");
      if (this.partition == null) {
        sb.append("null");
      } else {
        sb.append(this.partition);
      }
      first = false;
    }
    if (isSetDeleteDeltas()) {
      if (!first) sb.append(", ");
      sb.append("delete_deltas:");
      if (this.delete_deltas == null) {
        sb.append("null");
      } else {
        sb.append(this.delete_deltas);
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

  private static class TTransactionalHiveDescStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTransactionalHiveDescStandardScheme getScheme() {
      return new TTransactionalHiveDescStandardScheme();
    }
  }

  private static class TTransactionalHiveDescStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTransactionalHiveDesc> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTransactionalHiveDesc struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.partition = iprot.readString();
              struct.setPartitionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DELETE_DELTAS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list168 = iprot.readListBegin();
                struct.delete_deltas = new java.util.ArrayList<TTransactionalHiveDeleteDeltaDesc>(_list168.size);
                @org.apache.thrift.annotation.Nullable TTransactionalHiveDeleteDeltaDesc _elem169;
                for (int _i170 = 0; _i170 < _list168.size; ++_i170)
                {
                  _elem169 = new TTransactionalHiveDeleteDeltaDesc();
                  _elem169.read(iprot);
                  struct.delete_deltas.add(_elem169);
                }
                iprot.readListEnd();
              }
              struct.setDeleteDeltasIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTransactionalHiveDesc struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.partition != null) {
        if (struct.isSetPartition()) {
          oprot.writeFieldBegin(PARTITION_FIELD_DESC);
          oprot.writeString(struct.partition);
          oprot.writeFieldEnd();
        }
      }
      if (struct.delete_deltas != null) {
        if (struct.isSetDeleteDeltas()) {
          oprot.writeFieldBegin(DELETE_DELTAS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.delete_deltas.size()));
            for (TTransactionalHiveDeleteDeltaDesc _iter171 : struct.delete_deltas)
            {
              _iter171.write(oprot);
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

  private static class TTransactionalHiveDescTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTransactionalHiveDescTupleScheme getScheme() {
      return new TTransactionalHiveDescTupleScheme();
    }
  }

  private static class TTransactionalHiveDescTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTransactionalHiveDesc> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTransactionalHiveDesc struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPartition()) {
        optionals.set(0);
      }
      if (struct.isSetDeleteDeltas()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetPartition()) {
        oprot.writeString(struct.partition);
      }
      if (struct.isSetDeleteDeltas()) {
        {
          oprot.writeI32(struct.delete_deltas.size());
          for (TTransactionalHiveDeleteDeltaDesc _iter172 : struct.delete_deltas)
          {
            _iter172.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTransactionalHiveDesc struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.partition = iprot.readString();
        struct.setPartitionIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list173 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.delete_deltas = new java.util.ArrayList<TTransactionalHiveDeleteDeltaDesc>(_list173.size);
          @org.apache.thrift.annotation.Nullable TTransactionalHiveDeleteDeltaDesc _elem174;
          for (int _i175 = 0; _i175 < _list173.size; ++_i175)
          {
            _elem174 = new TTransactionalHiveDeleteDeltaDesc();
            _elem174.read(iprot);
            struct.delete_deltas.add(_elem174);
          }
        }
        struct.setDeleteDeltasIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

