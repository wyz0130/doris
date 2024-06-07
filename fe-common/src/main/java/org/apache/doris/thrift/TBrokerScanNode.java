/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TBrokerScanNode implements org.apache.thrift.TBase<TBrokerScanNode, TBrokerScanNode._Fields>, java.io.Serializable, Cloneable, Comparable<TBrokerScanNode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TBrokerScanNode");

  private static final org.apache.thrift.protocol.TField TUPLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tuple_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PARTITION_EXPRS_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_exprs", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField PARTITION_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_infos", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField PRE_FILTER_EXPRS_FIELD_DESC = new org.apache.thrift.protocol.TField("pre_filter_exprs", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TBrokerScanNodeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TBrokerScanNodeTupleSchemeFactory();

  public int tuple_id; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TExpr> partition_exprs; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TRangePartition> partition_infos; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TExpr> pre_filter_exprs; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TUPLE_ID((short)1, "tuple_id"),
    PARTITION_EXPRS((short)2, "partition_exprs"),
    PARTITION_INFOS((short)3, "partition_infos"),
    PRE_FILTER_EXPRS((short)4, "pre_filter_exprs");

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
        case 1: // TUPLE_ID
          return TUPLE_ID;
        case 2: // PARTITION_EXPRS
          return PARTITION_EXPRS;
        case 3: // PARTITION_INFOS
          return PARTITION_INFOS;
        case 4: // PRE_FILTER_EXPRS
          return PRE_FILTER_EXPRS;
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
  private static final int __TUPLE_ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PARTITION_EXPRS,_Fields.PARTITION_INFOS,_Fields.PRE_FILTER_EXPRS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TUPLE_ID, new org.apache.thrift.meta_data.FieldMetaData("tuple_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TTupleId")));
    tmpMap.put(_Fields.PARTITION_EXPRS, new org.apache.thrift.meta_data.FieldMetaData("partition_exprs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TExpr.class))));
    tmpMap.put(_Fields.PARTITION_INFOS, new org.apache.thrift.meta_data.FieldMetaData("partition_infos", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TRangePartition.class))));
    tmpMap.put(_Fields.PRE_FILTER_EXPRS, new org.apache.thrift.meta_data.FieldMetaData("pre_filter_exprs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TExpr.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TBrokerScanNode.class, metaDataMap);
  }

  public TBrokerScanNode() {
  }

  public TBrokerScanNode(
    int tuple_id)
  {
    this();
    this.tuple_id = tuple_id;
    setTupleIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TBrokerScanNode(TBrokerScanNode other) {
    __isset_bitfield = other.__isset_bitfield;
    this.tuple_id = other.tuple_id;
    if (other.isSetPartitionExprs()) {
      java.util.List<org.apache.doris.thrift.TExpr> __this__partition_exprs = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(other.partition_exprs.size());
      for (org.apache.doris.thrift.TExpr other_element : other.partition_exprs) {
        __this__partition_exprs.add(new org.apache.doris.thrift.TExpr(other_element));
      }
      this.partition_exprs = __this__partition_exprs;
    }
    if (other.isSetPartitionInfos()) {
      java.util.List<org.apache.doris.thrift.TRangePartition> __this__partition_infos = new java.util.ArrayList<org.apache.doris.thrift.TRangePartition>(other.partition_infos.size());
      for (org.apache.doris.thrift.TRangePartition other_element : other.partition_infos) {
        __this__partition_infos.add(new org.apache.doris.thrift.TRangePartition(other_element));
      }
      this.partition_infos = __this__partition_infos;
    }
    if (other.isSetPreFilterExprs()) {
      java.util.List<org.apache.doris.thrift.TExpr> __this__pre_filter_exprs = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(other.pre_filter_exprs.size());
      for (org.apache.doris.thrift.TExpr other_element : other.pre_filter_exprs) {
        __this__pre_filter_exprs.add(new org.apache.doris.thrift.TExpr(other_element));
      }
      this.pre_filter_exprs = __this__pre_filter_exprs;
    }
  }

  public TBrokerScanNode deepCopy() {
    return new TBrokerScanNode(this);
  }

  @Override
  public void clear() {
    setTupleIdIsSet(false);
    this.tuple_id = 0;
    this.partition_exprs = null;
    this.partition_infos = null;
    this.pre_filter_exprs = null;
  }

  public int getTupleId() {
    return this.tuple_id;
  }

  public TBrokerScanNode setTupleId(int tuple_id) {
    this.tuple_id = tuple_id;
    setTupleIdIsSet(true);
    return this;
  }

  public void unsetTupleId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TUPLE_ID_ISSET_ID);
  }

  /** Returns true if field tuple_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTupleId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TUPLE_ID_ISSET_ID);
  }

  public void setTupleIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TUPLE_ID_ISSET_ID, value);
  }

  public int getPartitionExprsSize() {
    return (this.partition_exprs == null) ? 0 : this.partition_exprs.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<org.apache.doris.thrift.TExpr> getPartitionExprsIterator() {
    return (this.partition_exprs == null) ? null : this.partition_exprs.iterator();
  }

  public void addToPartitionExprs(org.apache.doris.thrift.TExpr elem) {
    if (this.partition_exprs == null) {
      this.partition_exprs = new java.util.ArrayList<org.apache.doris.thrift.TExpr>();
    }
    this.partition_exprs.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<org.apache.doris.thrift.TExpr> getPartitionExprs() {
    return this.partition_exprs;
  }

  public TBrokerScanNode setPartitionExprs(@org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TExpr> partition_exprs) {
    this.partition_exprs = partition_exprs;
    return this;
  }

  public void unsetPartitionExprs() {
    this.partition_exprs = null;
  }

  /** Returns true if field partition_exprs is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionExprs() {
    return this.partition_exprs != null;
  }

  public void setPartitionExprsIsSet(boolean value) {
    if (!value) {
      this.partition_exprs = null;
    }
  }

  public int getPartitionInfosSize() {
    return (this.partition_infos == null) ? 0 : this.partition_infos.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<org.apache.doris.thrift.TRangePartition> getPartitionInfosIterator() {
    return (this.partition_infos == null) ? null : this.partition_infos.iterator();
  }

  public void addToPartitionInfos(org.apache.doris.thrift.TRangePartition elem) {
    if (this.partition_infos == null) {
      this.partition_infos = new java.util.ArrayList<org.apache.doris.thrift.TRangePartition>();
    }
    this.partition_infos.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<org.apache.doris.thrift.TRangePartition> getPartitionInfos() {
    return this.partition_infos;
  }

  public TBrokerScanNode setPartitionInfos(@org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TRangePartition> partition_infos) {
    this.partition_infos = partition_infos;
    return this;
  }

  public void unsetPartitionInfos() {
    this.partition_infos = null;
  }

  /** Returns true if field partition_infos is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionInfos() {
    return this.partition_infos != null;
  }

  public void setPartitionInfosIsSet(boolean value) {
    if (!value) {
      this.partition_infos = null;
    }
  }

  public int getPreFilterExprsSize() {
    return (this.pre_filter_exprs == null) ? 0 : this.pre_filter_exprs.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<org.apache.doris.thrift.TExpr> getPreFilterExprsIterator() {
    return (this.pre_filter_exprs == null) ? null : this.pre_filter_exprs.iterator();
  }

  public void addToPreFilterExprs(org.apache.doris.thrift.TExpr elem) {
    if (this.pre_filter_exprs == null) {
      this.pre_filter_exprs = new java.util.ArrayList<org.apache.doris.thrift.TExpr>();
    }
    this.pre_filter_exprs.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<org.apache.doris.thrift.TExpr> getPreFilterExprs() {
    return this.pre_filter_exprs;
  }

  public TBrokerScanNode setPreFilterExprs(@org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TExpr> pre_filter_exprs) {
    this.pre_filter_exprs = pre_filter_exprs;
    return this;
  }

  public void unsetPreFilterExprs() {
    this.pre_filter_exprs = null;
  }

  /** Returns true if field pre_filter_exprs is set (has been assigned a value) and false otherwise */
  public boolean isSetPreFilterExprs() {
    return this.pre_filter_exprs != null;
  }

  public void setPreFilterExprsIsSet(boolean value) {
    if (!value) {
      this.pre_filter_exprs = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TUPLE_ID:
      if (value == null) {
        unsetTupleId();
      } else {
        setTupleId((java.lang.Integer)value);
      }
      break;

    case PARTITION_EXPRS:
      if (value == null) {
        unsetPartitionExprs();
      } else {
        setPartitionExprs((java.util.List<org.apache.doris.thrift.TExpr>)value);
      }
      break;

    case PARTITION_INFOS:
      if (value == null) {
        unsetPartitionInfos();
      } else {
        setPartitionInfos((java.util.List<org.apache.doris.thrift.TRangePartition>)value);
      }
      break;

    case PRE_FILTER_EXPRS:
      if (value == null) {
        unsetPreFilterExprs();
      } else {
        setPreFilterExprs((java.util.List<org.apache.doris.thrift.TExpr>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TUPLE_ID:
      return getTupleId();

    case PARTITION_EXPRS:
      return getPartitionExprs();

    case PARTITION_INFOS:
      return getPartitionInfos();

    case PRE_FILTER_EXPRS:
      return getPreFilterExprs();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TUPLE_ID:
      return isSetTupleId();
    case PARTITION_EXPRS:
      return isSetPartitionExprs();
    case PARTITION_INFOS:
      return isSetPartitionInfos();
    case PRE_FILTER_EXPRS:
      return isSetPreFilterExprs();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TBrokerScanNode)
      return this.equals((TBrokerScanNode)that);
    return false;
  }

  public boolean equals(TBrokerScanNode that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tuple_id = true;
    boolean that_present_tuple_id = true;
    if (this_present_tuple_id || that_present_tuple_id) {
      if (!(this_present_tuple_id && that_present_tuple_id))
        return false;
      if (this.tuple_id != that.tuple_id)
        return false;
    }

    boolean this_present_partition_exprs = true && this.isSetPartitionExprs();
    boolean that_present_partition_exprs = true && that.isSetPartitionExprs();
    if (this_present_partition_exprs || that_present_partition_exprs) {
      if (!(this_present_partition_exprs && that_present_partition_exprs))
        return false;
      if (!this.partition_exprs.equals(that.partition_exprs))
        return false;
    }

    boolean this_present_partition_infos = true && this.isSetPartitionInfos();
    boolean that_present_partition_infos = true && that.isSetPartitionInfos();
    if (this_present_partition_infos || that_present_partition_infos) {
      if (!(this_present_partition_infos && that_present_partition_infos))
        return false;
      if (!this.partition_infos.equals(that.partition_infos))
        return false;
    }

    boolean this_present_pre_filter_exprs = true && this.isSetPreFilterExprs();
    boolean that_present_pre_filter_exprs = true && that.isSetPreFilterExprs();
    if (this_present_pre_filter_exprs || that_present_pre_filter_exprs) {
      if (!(this_present_pre_filter_exprs && that_present_pre_filter_exprs))
        return false;
      if (!this.pre_filter_exprs.equals(that.pre_filter_exprs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + tuple_id;

    hashCode = hashCode * 8191 + ((isSetPartitionExprs()) ? 131071 : 524287);
    if (isSetPartitionExprs())
      hashCode = hashCode * 8191 + partition_exprs.hashCode();

    hashCode = hashCode * 8191 + ((isSetPartitionInfos()) ? 131071 : 524287);
    if (isSetPartitionInfos())
      hashCode = hashCode * 8191 + partition_infos.hashCode();

    hashCode = hashCode * 8191 + ((isSetPreFilterExprs()) ? 131071 : 524287);
    if (isSetPreFilterExprs())
      hashCode = hashCode * 8191 + pre_filter_exprs.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TBrokerScanNode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTupleId(), other.isSetTupleId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTupleId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tuple_id, other.tuple_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPartitionExprs(), other.isSetPartitionExprs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionExprs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition_exprs, other.partition_exprs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPartitionInfos(), other.isSetPartitionInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition_infos, other.partition_infos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPreFilterExprs(), other.isSetPreFilterExprs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPreFilterExprs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pre_filter_exprs, other.pre_filter_exprs);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TBrokerScanNode(");
    boolean first = true;

    sb.append("tuple_id:");
    sb.append(this.tuple_id);
    first = false;
    if (isSetPartitionExprs()) {
      if (!first) sb.append(", ");
      sb.append("partition_exprs:");
      if (this.partition_exprs == null) {
        sb.append("null");
      } else {
        sb.append(this.partition_exprs);
      }
      first = false;
    }
    if (isSetPartitionInfos()) {
      if (!first) sb.append(", ");
      sb.append("partition_infos:");
      if (this.partition_infos == null) {
        sb.append("null");
      } else {
        sb.append(this.partition_infos);
      }
      first = false;
    }
    if (isSetPreFilterExprs()) {
      if (!first) sb.append(", ");
      sb.append("pre_filter_exprs:");
      if (this.pre_filter_exprs == null) {
        sb.append("null");
      } else {
        sb.append(this.pre_filter_exprs);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'tuple_id' because it's a primitive and you chose the non-beans generator.
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

  private static class TBrokerScanNodeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TBrokerScanNodeStandardScheme getScheme() {
      return new TBrokerScanNodeStandardScheme();
    }
  }

  private static class TBrokerScanNodeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TBrokerScanNode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TBrokerScanNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TUPLE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.tuple_id = iprot.readI32();
              struct.setTupleIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARTITION_EXPRS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list314 = iprot.readListBegin();
                struct.partition_exprs = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(_list314.size);
                @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _elem315;
                for (int _i316 = 0; _i316 < _list314.size; ++_i316)
                {
                  _elem315 = new org.apache.doris.thrift.TExpr();
                  _elem315.read(iprot);
                  struct.partition_exprs.add(_elem315);
                }
                iprot.readListEnd();
              }
              struct.setPartitionExprsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARTITION_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list317 = iprot.readListBegin();
                struct.partition_infos = new java.util.ArrayList<org.apache.doris.thrift.TRangePartition>(_list317.size);
                @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TRangePartition _elem318;
                for (int _i319 = 0; _i319 < _list317.size; ++_i319)
                {
                  _elem318 = new org.apache.doris.thrift.TRangePartition();
                  _elem318.read(iprot);
                  struct.partition_infos.add(_elem318);
                }
                iprot.readListEnd();
              }
              struct.setPartitionInfosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PRE_FILTER_EXPRS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list320 = iprot.readListBegin();
                struct.pre_filter_exprs = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(_list320.size);
                @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _elem321;
                for (int _i322 = 0; _i322 < _list320.size; ++_i322)
                {
                  _elem321 = new org.apache.doris.thrift.TExpr();
                  _elem321.read(iprot);
                  struct.pre_filter_exprs.add(_elem321);
                }
                iprot.readListEnd();
              }
              struct.setPreFilterExprsIsSet(true);
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
      if (!struct.isSetTupleId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'tuple_id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TBrokerScanNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TUPLE_ID_FIELD_DESC);
      oprot.writeI32(struct.tuple_id);
      oprot.writeFieldEnd();
      if (struct.partition_exprs != null) {
        if (struct.isSetPartitionExprs()) {
          oprot.writeFieldBegin(PARTITION_EXPRS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.partition_exprs.size()));
            for (org.apache.doris.thrift.TExpr _iter323 : struct.partition_exprs)
            {
              _iter323.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.partition_infos != null) {
        if (struct.isSetPartitionInfos()) {
          oprot.writeFieldBegin(PARTITION_INFOS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.partition_infos.size()));
            for (org.apache.doris.thrift.TRangePartition _iter324 : struct.partition_infos)
            {
              _iter324.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.pre_filter_exprs != null) {
        if (struct.isSetPreFilterExprs()) {
          oprot.writeFieldBegin(PRE_FILTER_EXPRS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.pre_filter_exprs.size()));
            for (org.apache.doris.thrift.TExpr _iter325 : struct.pre_filter_exprs)
            {
              _iter325.write(oprot);
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

  private static class TBrokerScanNodeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TBrokerScanNodeTupleScheme getScheme() {
      return new TBrokerScanNodeTupleScheme();
    }
  }

  private static class TBrokerScanNodeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TBrokerScanNode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TBrokerScanNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.tuple_id);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPartitionExprs()) {
        optionals.set(0);
      }
      if (struct.isSetPartitionInfos()) {
        optionals.set(1);
      }
      if (struct.isSetPreFilterExprs()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetPartitionExprs()) {
        {
          oprot.writeI32(struct.partition_exprs.size());
          for (org.apache.doris.thrift.TExpr _iter326 : struct.partition_exprs)
          {
            _iter326.write(oprot);
          }
        }
      }
      if (struct.isSetPartitionInfos()) {
        {
          oprot.writeI32(struct.partition_infos.size());
          for (org.apache.doris.thrift.TRangePartition _iter327 : struct.partition_infos)
          {
            _iter327.write(oprot);
          }
        }
      }
      if (struct.isSetPreFilterExprs()) {
        {
          oprot.writeI32(struct.pre_filter_exprs.size());
          for (org.apache.doris.thrift.TExpr _iter328 : struct.pre_filter_exprs)
          {
            _iter328.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TBrokerScanNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.tuple_id = iprot.readI32();
      struct.setTupleIdIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list329 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.partition_exprs = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(_list329.size);
          @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _elem330;
          for (int _i331 = 0; _i331 < _list329.size; ++_i331)
          {
            _elem330 = new org.apache.doris.thrift.TExpr();
            _elem330.read(iprot);
            struct.partition_exprs.add(_elem330);
          }
        }
        struct.setPartitionExprsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list332 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.partition_infos = new java.util.ArrayList<org.apache.doris.thrift.TRangePartition>(_list332.size);
          @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TRangePartition _elem333;
          for (int _i334 = 0; _i334 < _list332.size; ++_i334)
          {
            _elem333 = new org.apache.doris.thrift.TRangePartition();
            _elem333.read(iprot);
            struct.partition_infos.add(_elem333);
          }
        }
        struct.setPartitionInfosIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list335 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.pre_filter_exprs = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(_list335.size);
          @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _elem336;
          for (int _i337 = 0; _i337 < _list335.size; ++_i337)
          {
            _elem336 = new org.apache.doris.thrift.TExpr();
            _elem336.read(iprot);
            struct.pre_filter_exprs.add(_elem336);
          }
        }
        struct.setPreFilterExprsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

