/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TPartitionSortNode implements org.apache.thrift.TBase<TPartitionSortNode, TPartitionSortNode._Fields>, java.io.Serializable, Cloneable, Comparable<TPartitionSortNode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPartitionSortNode");

  private static final org.apache.thrift.protocol.TField PARTITION_EXPRS_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_exprs", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField SORT_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("sort_info", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField HAS_GLOBAL_LIMIT_FIELD_DESC = new org.apache.thrift.protocol.TField("has_global_limit", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField TOP_N_ALGORITHM_FIELD_DESC = new org.apache.thrift.protocol.TField("top_n_algorithm", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField PARTITION_INNER_LIMIT_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_inner_limit", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField PTOPN_PHASE_FIELD_DESC = new org.apache.thrift.protocol.TField("ptopn_phase", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TPartitionSortNodeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TPartitionSortNodeTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TExpr> partition_exprs; // optional
  public @org.apache.thrift.annotation.Nullable TSortInfo sort_info; // optional
  public boolean has_global_limit; // optional
  /**
   * 
   * @see TopNAlgorithm
   */
  public @org.apache.thrift.annotation.Nullable TopNAlgorithm top_n_algorithm; // optional
  public long partition_inner_limit; // optional
  /**
   * 
   * @see TPartTopNPhase
   */
  public @org.apache.thrift.annotation.Nullable TPartTopNPhase ptopn_phase; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARTITION_EXPRS((short)1, "partition_exprs"),
    SORT_INFO((short)2, "sort_info"),
    HAS_GLOBAL_LIMIT((short)3, "has_global_limit"),
    /**
     * 
     * @see TopNAlgorithm
     */
    TOP_N_ALGORITHM((short)4, "top_n_algorithm"),
    PARTITION_INNER_LIMIT((short)5, "partition_inner_limit"),
    /**
     * 
     * @see TPartTopNPhase
     */
    PTOPN_PHASE((short)6, "ptopn_phase");

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
        case 1: // PARTITION_EXPRS
          return PARTITION_EXPRS;
        case 2: // SORT_INFO
          return SORT_INFO;
        case 3: // HAS_GLOBAL_LIMIT
          return HAS_GLOBAL_LIMIT;
        case 4: // TOP_N_ALGORITHM
          return TOP_N_ALGORITHM;
        case 5: // PARTITION_INNER_LIMIT
          return PARTITION_INNER_LIMIT;
        case 6: // PTOPN_PHASE
          return PTOPN_PHASE;
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
  private static final int __HAS_GLOBAL_LIMIT_ISSET_ID = 0;
  private static final int __PARTITION_INNER_LIMIT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PARTITION_EXPRS,_Fields.SORT_INFO,_Fields.HAS_GLOBAL_LIMIT,_Fields.TOP_N_ALGORITHM,_Fields.PARTITION_INNER_LIMIT,_Fields.PTOPN_PHASE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARTITION_EXPRS, new org.apache.thrift.meta_data.FieldMetaData("partition_exprs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TExpr.class))));
    tmpMap.put(_Fields.SORT_INFO, new org.apache.thrift.meta_data.FieldMetaData("sort_info", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSortInfo.class)));
    tmpMap.put(_Fields.HAS_GLOBAL_LIMIT, new org.apache.thrift.meta_data.FieldMetaData("has_global_limit", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TOP_N_ALGORITHM, new org.apache.thrift.meta_data.FieldMetaData("top_n_algorithm", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TopNAlgorithm.class)));
    tmpMap.put(_Fields.PARTITION_INNER_LIMIT, new org.apache.thrift.meta_data.FieldMetaData("partition_inner_limit", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PTOPN_PHASE, new org.apache.thrift.meta_data.FieldMetaData("ptopn_phase", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TPartTopNPhase.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPartitionSortNode.class, metaDataMap);
  }

  public TPartitionSortNode() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPartitionSortNode(TPartitionSortNode other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPartitionExprs()) {
      java.util.List<org.apache.doris.thrift.TExpr> __this__partition_exprs = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(other.partition_exprs.size());
      for (org.apache.doris.thrift.TExpr other_element : other.partition_exprs) {
        __this__partition_exprs.add(new org.apache.doris.thrift.TExpr(other_element));
      }
      this.partition_exprs = __this__partition_exprs;
    }
    if (other.isSetSortInfo()) {
      this.sort_info = new TSortInfo(other.sort_info);
    }
    this.has_global_limit = other.has_global_limit;
    if (other.isSetTopNAlgorithm()) {
      this.top_n_algorithm = other.top_n_algorithm;
    }
    this.partition_inner_limit = other.partition_inner_limit;
    if (other.isSetPtopnPhase()) {
      this.ptopn_phase = other.ptopn_phase;
    }
  }

  public TPartitionSortNode deepCopy() {
    return new TPartitionSortNode(this);
  }

  @Override
  public void clear() {
    this.partition_exprs = null;
    this.sort_info = null;
    setHasGlobalLimitIsSet(false);
    this.has_global_limit = false;
    this.top_n_algorithm = null;
    setPartitionInnerLimitIsSet(false);
    this.partition_inner_limit = 0;
    this.ptopn_phase = null;
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

  public TPartitionSortNode setPartitionExprs(@org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TExpr> partition_exprs) {
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

  @org.apache.thrift.annotation.Nullable
  public TSortInfo getSortInfo() {
    return this.sort_info;
  }

  public TPartitionSortNode setSortInfo(@org.apache.thrift.annotation.Nullable TSortInfo sort_info) {
    this.sort_info = sort_info;
    return this;
  }

  public void unsetSortInfo() {
    this.sort_info = null;
  }

  /** Returns true if field sort_info is set (has been assigned a value) and false otherwise */
  public boolean isSetSortInfo() {
    return this.sort_info != null;
  }

  public void setSortInfoIsSet(boolean value) {
    if (!value) {
      this.sort_info = null;
    }
  }

  public boolean isHasGlobalLimit() {
    return this.has_global_limit;
  }

  public TPartitionSortNode setHasGlobalLimit(boolean has_global_limit) {
    this.has_global_limit = has_global_limit;
    setHasGlobalLimitIsSet(true);
    return this;
  }

  public void unsetHasGlobalLimit() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HAS_GLOBAL_LIMIT_ISSET_ID);
  }

  /** Returns true if field has_global_limit is set (has been assigned a value) and false otherwise */
  public boolean isSetHasGlobalLimit() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HAS_GLOBAL_LIMIT_ISSET_ID);
  }

  public void setHasGlobalLimitIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HAS_GLOBAL_LIMIT_ISSET_ID, value);
  }

  /**
   * 
   * @see TopNAlgorithm
   */
  @org.apache.thrift.annotation.Nullable
  public TopNAlgorithm getTopNAlgorithm() {
    return this.top_n_algorithm;
  }

  /**
   * 
   * @see TopNAlgorithm
   */
  public TPartitionSortNode setTopNAlgorithm(@org.apache.thrift.annotation.Nullable TopNAlgorithm top_n_algorithm) {
    this.top_n_algorithm = top_n_algorithm;
    return this;
  }

  public void unsetTopNAlgorithm() {
    this.top_n_algorithm = null;
  }

  /** Returns true if field top_n_algorithm is set (has been assigned a value) and false otherwise */
  public boolean isSetTopNAlgorithm() {
    return this.top_n_algorithm != null;
  }

  public void setTopNAlgorithmIsSet(boolean value) {
    if (!value) {
      this.top_n_algorithm = null;
    }
  }

  public long getPartitionInnerLimit() {
    return this.partition_inner_limit;
  }

  public TPartitionSortNode setPartitionInnerLimit(long partition_inner_limit) {
    this.partition_inner_limit = partition_inner_limit;
    setPartitionInnerLimitIsSet(true);
    return this;
  }

  public void unsetPartitionInnerLimit() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PARTITION_INNER_LIMIT_ISSET_ID);
  }

  /** Returns true if field partition_inner_limit is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionInnerLimit() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PARTITION_INNER_LIMIT_ISSET_ID);
  }

  public void setPartitionInnerLimitIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PARTITION_INNER_LIMIT_ISSET_ID, value);
  }

  /**
   * 
   * @see TPartTopNPhase
   */
  @org.apache.thrift.annotation.Nullable
  public TPartTopNPhase getPtopnPhase() {
    return this.ptopn_phase;
  }

  /**
   * 
   * @see TPartTopNPhase
   */
  public TPartitionSortNode setPtopnPhase(@org.apache.thrift.annotation.Nullable TPartTopNPhase ptopn_phase) {
    this.ptopn_phase = ptopn_phase;
    return this;
  }

  public void unsetPtopnPhase() {
    this.ptopn_phase = null;
  }

  /** Returns true if field ptopn_phase is set (has been assigned a value) and false otherwise */
  public boolean isSetPtopnPhase() {
    return this.ptopn_phase != null;
  }

  public void setPtopnPhaseIsSet(boolean value) {
    if (!value) {
      this.ptopn_phase = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PARTITION_EXPRS:
      if (value == null) {
        unsetPartitionExprs();
      } else {
        setPartitionExprs((java.util.List<org.apache.doris.thrift.TExpr>)value);
      }
      break;

    case SORT_INFO:
      if (value == null) {
        unsetSortInfo();
      } else {
        setSortInfo((TSortInfo)value);
      }
      break;

    case HAS_GLOBAL_LIMIT:
      if (value == null) {
        unsetHasGlobalLimit();
      } else {
        setHasGlobalLimit((java.lang.Boolean)value);
      }
      break;

    case TOP_N_ALGORITHM:
      if (value == null) {
        unsetTopNAlgorithm();
      } else {
        setTopNAlgorithm((TopNAlgorithm)value);
      }
      break;

    case PARTITION_INNER_LIMIT:
      if (value == null) {
        unsetPartitionInnerLimit();
      } else {
        setPartitionInnerLimit((java.lang.Long)value);
      }
      break;

    case PTOPN_PHASE:
      if (value == null) {
        unsetPtopnPhase();
      } else {
        setPtopnPhase((TPartTopNPhase)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTITION_EXPRS:
      return getPartitionExprs();

    case SORT_INFO:
      return getSortInfo();

    case HAS_GLOBAL_LIMIT:
      return isHasGlobalLimit();

    case TOP_N_ALGORITHM:
      return getTopNAlgorithm();

    case PARTITION_INNER_LIMIT:
      return getPartitionInnerLimit();

    case PTOPN_PHASE:
      return getPtopnPhase();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PARTITION_EXPRS:
      return isSetPartitionExprs();
    case SORT_INFO:
      return isSetSortInfo();
    case HAS_GLOBAL_LIMIT:
      return isSetHasGlobalLimit();
    case TOP_N_ALGORITHM:
      return isSetTopNAlgorithm();
    case PARTITION_INNER_LIMIT:
      return isSetPartitionInnerLimit();
    case PTOPN_PHASE:
      return isSetPtopnPhase();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TPartitionSortNode)
      return this.equals((TPartitionSortNode)that);
    return false;
  }

  public boolean equals(TPartitionSortNode that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_partition_exprs = true && this.isSetPartitionExprs();
    boolean that_present_partition_exprs = true && that.isSetPartitionExprs();
    if (this_present_partition_exprs || that_present_partition_exprs) {
      if (!(this_present_partition_exprs && that_present_partition_exprs))
        return false;
      if (!this.partition_exprs.equals(that.partition_exprs))
        return false;
    }

    boolean this_present_sort_info = true && this.isSetSortInfo();
    boolean that_present_sort_info = true && that.isSetSortInfo();
    if (this_present_sort_info || that_present_sort_info) {
      if (!(this_present_sort_info && that_present_sort_info))
        return false;
      if (!this.sort_info.equals(that.sort_info))
        return false;
    }

    boolean this_present_has_global_limit = true && this.isSetHasGlobalLimit();
    boolean that_present_has_global_limit = true && that.isSetHasGlobalLimit();
    if (this_present_has_global_limit || that_present_has_global_limit) {
      if (!(this_present_has_global_limit && that_present_has_global_limit))
        return false;
      if (this.has_global_limit != that.has_global_limit)
        return false;
    }

    boolean this_present_top_n_algorithm = true && this.isSetTopNAlgorithm();
    boolean that_present_top_n_algorithm = true && that.isSetTopNAlgorithm();
    if (this_present_top_n_algorithm || that_present_top_n_algorithm) {
      if (!(this_present_top_n_algorithm && that_present_top_n_algorithm))
        return false;
      if (!this.top_n_algorithm.equals(that.top_n_algorithm))
        return false;
    }

    boolean this_present_partition_inner_limit = true && this.isSetPartitionInnerLimit();
    boolean that_present_partition_inner_limit = true && that.isSetPartitionInnerLimit();
    if (this_present_partition_inner_limit || that_present_partition_inner_limit) {
      if (!(this_present_partition_inner_limit && that_present_partition_inner_limit))
        return false;
      if (this.partition_inner_limit != that.partition_inner_limit)
        return false;
    }

    boolean this_present_ptopn_phase = true && this.isSetPtopnPhase();
    boolean that_present_ptopn_phase = true && that.isSetPtopnPhase();
    if (this_present_ptopn_phase || that_present_ptopn_phase) {
      if (!(this_present_ptopn_phase && that_present_ptopn_phase))
        return false;
      if (!this.ptopn_phase.equals(that.ptopn_phase))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPartitionExprs()) ? 131071 : 524287);
    if (isSetPartitionExprs())
      hashCode = hashCode * 8191 + partition_exprs.hashCode();

    hashCode = hashCode * 8191 + ((isSetSortInfo()) ? 131071 : 524287);
    if (isSetSortInfo())
      hashCode = hashCode * 8191 + sort_info.hashCode();

    hashCode = hashCode * 8191 + ((isSetHasGlobalLimit()) ? 131071 : 524287);
    if (isSetHasGlobalLimit())
      hashCode = hashCode * 8191 + ((has_global_limit) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetTopNAlgorithm()) ? 131071 : 524287);
    if (isSetTopNAlgorithm())
      hashCode = hashCode * 8191 + top_n_algorithm.getValue();

    hashCode = hashCode * 8191 + ((isSetPartitionInnerLimit()) ? 131071 : 524287);
    if (isSetPartitionInnerLimit())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(partition_inner_limit);

    hashCode = hashCode * 8191 + ((isSetPtopnPhase()) ? 131071 : 524287);
    if (isSetPtopnPhase())
      hashCode = hashCode * 8191 + ptopn_phase.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TPartitionSortNode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.compare(isSetSortInfo(), other.isSetSortInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSortInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sort_info, other.sort_info);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetHasGlobalLimit(), other.isSetHasGlobalLimit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasGlobalLimit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.has_global_limit, other.has_global_limit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTopNAlgorithm(), other.isSetTopNAlgorithm());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopNAlgorithm()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.top_n_algorithm, other.top_n_algorithm);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPartitionInnerLimit(), other.isSetPartitionInnerLimit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionInnerLimit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition_inner_limit, other.partition_inner_limit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPtopnPhase(), other.isSetPtopnPhase());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPtopnPhase()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ptopn_phase, other.ptopn_phase);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TPartitionSortNode(");
    boolean first = true;

    if (isSetPartitionExprs()) {
      sb.append("partition_exprs:");
      if (this.partition_exprs == null) {
        sb.append("null");
      } else {
        sb.append(this.partition_exprs);
      }
      first = false;
    }
    if (isSetSortInfo()) {
      if (!first) sb.append(", ");
      sb.append("sort_info:");
      if (this.sort_info == null) {
        sb.append("null");
      } else {
        sb.append(this.sort_info);
      }
      first = false;
    }
    if (isSetHasGlobalLimit()) {
      if (!first) sb.append(", ");
      sb.append("has_global_limit:");
      sb.append(this.has_global_limit);
      first = false;
    }
    if (isSetTopNAlgorithm()) {
      if (!first) sb.append(", ");
      sb.append("top_n_algorithm:");
      if (this.top_n_algorithm == null) {
        sb.append("null");
      } else {
        sb.append(this.top_n_algorithm);
      }
      first = false;
    }
    if (isSetPartitionInnerLimit()) {
      if (!first) sb.append(", ");
      sb.append("partition_inner_limit:");
      sb.append(this.partition_inner_limit);
      first = false;
    }
    if (isSetPtopnPhase()) {
      if (!first) sb.append(", ");
      sb.append("ptopn_phase:");
      if (this.ptopn_phase == null) {
        sb.append("null");
      } else {
        sb.append(this.ptopn_phase);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (sort_info != null) {
      sort_info.validate();
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

  private static class TPartitionSortNodeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TPartitionSortNodeStandardScheme getScheme() {
      return new TPartitionSortNodeStandardScheme();
    }
  }

  private static class TPartitionSortNodeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TPartitionSortNode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TPartitionSortNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITION_EXPRS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list708 = iprot.readListBegin();
                struct.partition_exprs = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(_list708.size);
                @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _elem709;
                for (int _i710 = 0; _i710 < _list708.size; ++_i710)
                {
                  _elem709 = new org.apache.doris.thrift.TExpr();
                  _elem709.read(iprot);
                  struct.partition_exprs.add(_elem709);
                }
                iprot.readListEnd();
              }
              struct.setPartitionExprsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SORT_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.sort_info = new TSortInfo();
              struct.sort_info.read(iprot);
              struct.setSortInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HAS_GLOBAL_LIMIT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.has_global_limit = iprot.readBool();
              struct.setHasGlobalLimitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TOP_N_ALGORITHM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.top_n_algorithm = org.apache.doris.thrift.TopNAlgorithm.findByValue(iprot.readI32());
              struct.setTopNAlgorithmIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PARTITION_INNER_LIMIT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.partition_inner_limit = iprot.readI64();
              struct.setPartitionInnerLimitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PTOPN_PHASE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.ptopn_phase = org.apache.doris.thrift.TPartTopNPhase.findByValue(iprot.readI32());
              struct.setPtopnPhaseIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TPartitionSortNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.partition_exprs != null) {
        if (struct.isSetPartitionExprs()) {
          oprot.writeFieldBegin(PARTITION_EXPRS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.partition_exprs.size()));
            for (org.apache.doris.thrift.TExpr _iter711 : struct.partition_exprs)
            {
              _iter711.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.sort_info != null) {
        if (struct.isSetSortInfo()) {
          oprot.writeFieldBegin(SORT_INFO_FIELD_DESC);
          struct.sort_info.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetHasGlobalLimit()) {
        oprot.writeFieldBegin(HAS_GLOBAL_LIMIT_FIELD_DESC);
        oprot.writeBool(struct.has_global_limit);
        oprot.writeFieldEnd();
      }
      if (struct.top_n_algorithm != null) {
        if (struct.isSetTopNAlgorithm()) {
          oprot.writeFieldBegin(TOP_N_ALGORITHM_FIELD_DESC);
          oprot.writeI32(struct.top_n_algorithm.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetPartitionInnerLimit()) {
        oprot.writeFieldBegin(PARTITION_INNER_LIMIT_FIELD_DESC);
        oprot.writeI64(struct.partition_inner_limit);
        oprot.writeFieldEnd();
      }
      if (struct.ptopn_phase != null) {
        if (struct.isSetPtopnPhase()) {
          oprot.writeFieldBegin(PTOPN_PHASE_FIELD_DESC);
          oprot.writeI32(struct.ptopn_phase.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPartitionSortNodeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TPartitionSortNodeTupleScheme getScheme() {
      return new TPartitionSortNodeTupleScheme();
    }
  }

  private static class TPartitionSortNodeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TPartitionSortNode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPartitionSortNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPartitionExprs()) {
        optionals.set(0);
      }
      if (struct.isSetSortInfo()) {
        optionals.set(1);
      }
      if (struct.isSetHasGlobalLimit()) {
        optionals.set(2);
      }
      if (struct.isSetTopNAlgorithm()) {
        optionals.set(3);
      }
      if (struct.isSetPartitionInnerLimit()) {
        optionals.set(4);
      }
      if (struct.isSetPtopnPhase()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetPartitionExprs()) {
        {
          oprot.writeI32(struct.partition_exprs.size());
          for (org.apache.doris.thrift.TExpr _iter712 : struct.partition_exprs)
          {
            _iter712.write(oprot);
          }
        }
      }
      if (struct.isSetSortInfo()) {
        struct.sort_info.write(oprot);
      }
      if (struct.isSetHasGlobalLimit()) {
        oprot.writeBool(struct.has_global_limit);
      }
      if (struct.isSetTopNAlgorithm()) {
        oprot.writeI32(struct.top_n_algorithm.getValue());
      }
      if (struct.isSetPartitionInnerLimit()) {
        oprot.writeI64(struct.partition_inner_limit);
      }
      if (struct.isSetPtopnPhase()) {
        oprot.writeI32(struct.ptopn_phase.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPartitionSortNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list713 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.partition_exprs = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(_list713.size);
          @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _elem714;
          for (int _i715 = 0; _i715 < _list713.size; ++_i715)
          {
            _elem714 = new org.apache.doris.thrift.TExpr();
            _elem714.read(iprot);
            struct.partition_exprs.add(_elem714);
          }
        }
        struct.setPartitionExprsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sort_info = new TSortInfo();
        struct.sort_info.read(iprot);
        struct.setSortInfoIsSet(true);
      }
      if (incoming.get(2)) {
        struct.has_global_limit = iprot.readBool();
        struct.setHasGlobalLimitIsSet(true);
      }
      if (incoming.get(3)) {
        struct.top_n_algorithm = org.apache.doris.thrift.TopNAlgorithm.findByValue(iprot.readI32());
        struct.setTopNAlgorithmIsSet(true);
      }
      if (incoming.get(4)) {
        struct.partition_inner_limit = iprot.readI64();
        struct.setPartitionInnerLimitIsSet(true);
      }
      if (incoming.get(5)) {
        struct.ptopn_phase = org.apache.doris.thrift.TPartTopNPhase.findByValue(iprot.readI32());
        struct.setPtopnPhaseIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
