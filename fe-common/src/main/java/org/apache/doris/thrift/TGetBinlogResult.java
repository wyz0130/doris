/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TGetBinlogResult implements org.apache.thrift.TBase<TGetBinlogResult, TGetBinlogResult._Fields>, java.io.Serializable, Cloneable, Comparable<TGetBinlogResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetBinlogResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField NEXT_COMMIT_SEQ_FIELD_DESC = new org.apache.thrift.protocol.TField("next_commit_seq", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField BINLOGS_FIELD_DESC = new org.apache.thrift.protocol.TField("binlogs", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField FE_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("fe_version", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField FE_META_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("fe_meta_version", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField MASTER_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("master_address", org.apache.thrift.protocol.TType.STRUCT, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TGetBinlogResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TGetBinlogResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status; // optional
  public long next_commit_seq; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<TBinlog> binlogs; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String fe_version; // optional
  public long fe_meta_version; // optional
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TNetworkAddress master_address; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    NEXT_COMMIT_SEQ((short)2, "next_commit_seq"),
    BINLOGS((short)3, "binlogs"),
    FE_VERSION((short)4, "fe_version"),
    FE_META_VERSION((short)5, "fe_meta_version"),
    MASTER_ADDRESS((short)6, "master_address");

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
        case 1: // STATUS
          return STATUS;
        case 2: // NEXT_COMMIT_SEQ
          return NEXT_COMMIT_SEQ;
        case 3: // BINLOGS
          return BINLOGS;
        case 4: // FE_VERSION
          return FE_VERSION;
        case 5: // FE_META_VERSION
          return FE_META_VERSION;
        case 6: // MASTER_ADDRESS
          return MASTER_ADDRESS;
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
  private static final int __NEXT_COMMIT_SEQ_ISSET_ID = 0;
  private static final int __FE_META_VERSION_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.STATUS,_Fields.NEXT_COMMIT_SEQ,_Fields.BINLOGS,_Fields.FE_VERSION,_Fields.FE_META_VERSION,_Fields.MASTER_ADDRESS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TStatus.class)));
    tmpMap.put(_Fields.NEXT_COMMIT_SEQ, new org.apache.thrift.meta_data.FieldMetaData("next_commit_seq", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.BINLOGS, new org.apache.thrift.meta_data.FieldMetaData("binlogs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TBinlog.class))));
    tmpMap.put(_Fields.FE_VERSION, new org.apache.thrift.meta_data.FieldMetaData("fe_version", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FE_META_VERSION, new org.apache.thrift.meta_data.FieldMetaData("fe_meta_version", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.MASTER_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("master_address", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TNetworkAddress.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetBinlogResult.class, metaDataMap);
  }

  public TGetBinlogResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetBinlogResult(TGetBinlogResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new org.apache.doris.thrift.TStatus(other.status);
    }
    this.next_commit_seq = other.next_commit_seq;
    if (other.isSetBinlogs()) {
      java.util.List<TBinlog> __this__binlogs = new java.util.ArrayList<TBinlog>(other.binlogs.size());
      for (TBinlog other_element : other.binlogs) {
        __this__binlogs.add(new TBinlog(other_element));
      }
      this.binlogs = __this__binlogs;
    }
    if (other.isSetFeVersion()) {
      this.fe_version = other.fe_version;
    }
    this.fe_meta_version = other.fe_meta_version;
    if (other.isSetMasterAddress()) {
      this.master_address = new org.apache.doris.thrift.TNetworkAddress(other.master_address);
    }
  }

  public TGetBinlogResult deepCopy() {
    return new TGetBinlogResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    setNextCommitSeqIsSet(false);
    this.next_commit_seq = 0;
    this.binlogs = null;
    this.fe_version = null;
    setFeMetaVersionIsSet(false);
    this.fe_meta_version = 0;
    this.master_address = null;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TStatus getStatus() {
    return this.status;
  }

  public TGetBinlogResult setStatus(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public long getNextCommitSeq() {
    return this.next_commit_seq;
  }

  public TGetBinlogResult setNextCommitSeq(long next_commit_seq) {
    this.next_commit_seq = next_commit_seq;
    setNextCommitSeqIsSet(true);
    return this;
  }

  public void unsetNextCommitSeq() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NEXT_COMMIT_SEQ_ISSET_ID);
  }

  /** Returns true if field next_commit_seq is set (has been assigned a value) and false otherwise */
  public boolean isSetNextCommitSeq() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NEXT_COMMIT_SEQ_ISSET_ID);
  }

  public void setNextCommitSeqIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NEXT_COMMIT_SEQ_ISSET_ID, value);
  }

  public int getBinlogsSize() {
    return (this.binlogs == null) ? 0 : this.binlogs.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TBinlog> getBinlogsIterator() {
    return (this.binlogs == null) ? null : this.binlogs.iterator();
  }

  public void addToBinlogs(TBinlog elem) {
    if (this.binlogs == null) {
      this.binlogs = new java.util.ArrayList<TBinlog>();
    }
    this.binlogs.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TBinlog> getBinlogs() {
    return this.binlogs;
  }

  public TGetBinlogResult setBinlogs(@org.apache.thrift.annotation.Nullable java.util.List<TBinlog> binlogs) {
    this.binlogs = binlogs;
    return this;
  }

  public void unsetBinlogs() {
    this.binlogs = null;
  }

  /** Returns true if field binlogs is set (has been assigned a value) and false otherwise */
  public boolean isSetBinlogs() {
    return this.binlogs != null;
  }

  public void setBinlogsIsSet(boolean value) {
    if (!value) {
      this.binlogs = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getFeVersion() {
    return this.fe_version;
  }

  public TGetBinlogResult setFeVersion(@org.apache.thrift.annotation.Nullable java.lang.String fe_version) {
    this.fe_version = fe_version;
    return this;
  }

  public void unsetFeVersion() {
    this.fe_version = null;
  }

  /** Returns true if field fe_version is set (has been assigned a value) and false otherwise */
  public boolean isSetFeVersion() {
    return this.fe_version != null;
  }

  public void setFeVersionIsSet(boolean value) {
    if (!value) {
      this.fe_version = null;
    }
  }

  public long getFeMetaVersion() {
    return this.fe_meta_version;
  }

  public TGetBinlogResult setFeMetaVersion(long fe_meta_version) {
    this.fe_meta_version = fe_meta_version;
    setFeMetaVersionIsSet(true);
    return this;
  }

  public void unsetFeMetaVersion() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FE_META_VERSION_ISSET_ID);
  }

  /** Returns true if field fe_meta_version is set (has been assigned a value) and false otherwise */
  public boolean isSetFeMetaVersion() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FE_META_VERSION_ISSET_ID);
  }

  public void setFeMetaVersionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FE_META_VERSION_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TNetworkAddress getMasterAddress() {
    return this.master_address;
  }

  public TGetBinlogResult setMasterAddress(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TNetworkAddress master_address) {
    this.master_address = master_address;
    return this;
  }

  public void unsetMasterAddress() {
    this.master_address = null;
  }

  /** Returns true if field master_address is set (has been assigned a value) and false otherwise */
  public boolean isSetMasterAddress() {
    return this.master_address != null;
  }

  public void setMasterAddressIsSet(boolean value) {
    if (!value) {
      this.master_address = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((org.apache.doris.thrift.TStatus)value);
      }
      break;

    case NEXT_COMMIT_SEQ:
      if (value == null) {
        unsetNextCommitSeq();
      } else {
        setNextCommitSeq((java.lang.Long)value);
      }
      break;

    case BINLOGS:
      if (value == null) {
        unsetBinlogs();
      } else {
        setBinlogs((java.util.List<TBinlog>)value);
      }
      break;

    case FE_VERSION:
      if (value == null) {
        unsetFeVersion();
      } else {
        setFeVersion((java.lang.String)value);
      }
      break;

    case FE_META_VERSION:
      if (value == null) {
        unsetFeMetaVersion();
      } else {
        setFeMetaVersion((java.lang.Long)value);
      }
      break;

    case MASTER_ADDRESS:
      if (value == null) {
        unsetMasterAddress();
      } else {
        setMasterAddress((org.apache.doris.thrift.TNetworkAddress)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case NEXT_COMMIT_SEQ:
      return getNextCommitSeq();

    case BINLOGS:
      return getBinlogs();

    case FE_VERSION:
      return getFeVersion();

    case FE_META_VERSION:
      return getFeMetaVersion();

    case MASTER_ADDRESS:
      return getMasterAddress();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case NEXT_COMMIT_SEQ:
      return isSetNextCommitSeq();
    case BINLOGS:
      return isSetBinlogs();
    case FE_VERSION:
      return isSetFeVersion();
    case FE_META_VERSION:
      return isSetFeMetaVersion();
    case MASTER_ADDRESS:
      return isSetMasterAddress();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TGetBinlogResult)
      return this.equals((TGetBinlogResult)that);
    return false;
  }

  public boolean equals(TGetBinlogResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_next_commit_seq = true && this.isSetNextCommitSeq();
    boolean that_present_next_commit_seq = true && that.isSetNextCommitSeq();
    if (this_present_next_commit_seq || that_present_next_commit_seq) {
      if (!(this_present_next_commit_seq && that_present_next_commit_seq))
        return false;
      if (this.next_commit_seq != that.next_commit_seq)
        return false;
    }

    boolean this_present_binlogs = true && this.isSetBinlogs();
    boolean that_present_binlogs = true && that.isSetBinlogs();
    if (this_present_binlogs || that_present_binlogs) {
      if (!(this_present_binlogs && that_present_binlogs))
        return false;
      if (!this.binlogs.equals(that.binlogs))
        return false;
    }

    boolean this_present_fe_version = true && this.isSetFeVersion();
    boolean that_present_fe_version = true && that.isSetFeVersion();
    if (this_present_fe_version || that_present_fe_version) {
      if (!(this_present_fe_version && that_present_fe_version))
        return false;
      if (!this.fe_version.equals(that.fe_version))
        return false;
    }

    boolean this_present_fe_meta_version = true && this.isSetFeMetaVersion();
    boolean that_present_fe_meta_version = true && that.isSetFeMetaVersion();
    if (this_present_fe_meta_version || that_present_fe_meta_version) {
      if (!(this_present_fe_meta_version && that_present_fe_meta_version))
        return false;
      if (this.fe_meta_version != that.fe_meta_version)
        return false;
    }

    boolean this_present_master_address = true && this.isSetMasterAddress();
    boolean that_present_master_address = true && that.isSetMasterAddress();
    if (this_present_master_address || that_present_master_address) {
      if (!(this_present_master_address && that_present_master_address))
        return false;
      if (!this.master_address.equals(that.master_address))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.hashCode();

    hashCode = hashCode * 8191 + ((isSetNextCommitSeq()) ? 131071 : 524287);
    if (isSetNextCommitSeq())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(next_commit_seq);

    hashCode = hashCode * 8191 + ((isSetBinlogs()) ? 131071 : 524287);
    if (isSetBinlogs())
      hashCode = hashCode * 8191 + binlogs.hashCode();

    hashCode = hashCode * 8191 + ((isSetFeVersion()) ? 131071 : 524287);
    if (isSetFeVersion())
      hashCode = hashCode * 8191 + fe_version.hashCode();

    hashCode = hashCode * 8191 + ((isSetFeMetaVersion()) ? 131071 : 524287);
    if (isSetFeMetaVersion())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(fe_meta_version);

    hashCode = hashCode * 8191 + ((isSetMasterAddress()) ? 131071 : 524287);
    if (isSetMasterAddress())
      hashCode = hashCode * 8191 + master_address.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TGetBinlogResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetStatus(), other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetNextCommitSeq(), other.isSetNextCommitSeq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNextCommitSeq()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.next_commit_seq, other.next_commit_seq);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBinlogs(), other.isSetBinlogs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBinlogs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.binlogs, other.binlogs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetFeVersion(), other.isSetFeVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFeVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fe_version, other.fe_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetFeMetaVersion(), other.isSetFeMetaVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFeMetaVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fe_meta_version, other.fe_meta_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMasterAddress(), other.isSetMasterAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMasterAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.master_address, other.master_address);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TGetBinlogResult(");
    boolean first = true;

    if (isSetStatus()) {
      sb.append("status:");
      if (this.status == null) {
        sb.append("null");
      } else {
        sb.append(this.status);
      }
      first = false;
    }
    if (isSetNextCommitSeq()) {
      if (!first) sb.append(", ");
      sb.append("next_commit_seq:");
      sb.append(this.next_commit_seq);
      first = false;
    }
    if (isSetBinlogs()) {
      if (!first) sb.append(", ");
      sb.append("binlogs:");
      if (this.binlogs == null) {
        sb.append("null");
      } else {
        sb.append(this.binlogs);
      }
      first = false;
    }
    if (isSetFeVersion()) {
      if (!first) sb.append(", ");
      sb.append("fe_version:");
      if (this.fe_version == null) {
        sb.append("null");
      } else {
        sb.append(this.fe_version);
      }
      first = false;
    }
    if (isSetFeMetaVersion()) {
      if (!first) sb.append(", ");
      sb.append("fe_meta_version:");
      sb.append(this.fe_meta_version);
      first = false;
    }
    if (isSetMasterAddress()) {
      if (!first) sb.append(", ");
      sb.append("master_address:");
      if (this.master_address == null) {
        sb.append("null");
      } else {
        sb.append(this.master_address);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (status != null) {
      status.validate();
    }
    if (master_address != null) {
      master_address.validate();
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

  private static class TGetBinlogResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetBinlogResultStandardScheme getScheme() {
      return new TGetBinlogResultStandardScheme();
    }
  }

  private static class TGetBinlogResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TGetBinlogResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetBinlogResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new org.apache.doris.thrift.TStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NEXT_COMMIT_SEQ
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.next_commit_seq = iprot.readI64();
              struct.setNextCommitSeqIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BINLOGS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list500 = iprot.readListBegin();
                struct.binlogs = new java.util.ArrayList<TBinlog>(_list500.size);
                @org.apache.thrift.annotation.Nullable TBinlog _elem501;
                for (int _i502 = 0; _i502 < _list500.size; ++_i502)
                {
                  _elem501 = new TBinlog();
                  _elem501.read(iprot);
                  struct.binlogs.add(_elem501);
                }
                iprot.readListEnd();
              }
              struct.setBinlogsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FE_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.fe_version = iprot.readString();
              struct.setFeVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // FE_META_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.fe_meta_version = iprot.readI64();
              struct.setFeMetaVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // MASTER_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.master_address = new org.apache.doris.thrift.TNetworkAddress();
              struct.master_address.read(iprot);
              struct.setMasterAddressIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetBinlogResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        if (struct.isSetStatus()) {
          oprot.writeFieldBegin(STATUS_FIELD_DESC);
          struct.status.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetNextCommitSeq()) {
        oprot.writeFieldBegin(NEXT_COMMIT_SEQ_FIELD_DESC);
        oprot.writeI64(struct.next_commit_seq);
        oprot.writeFieldEnd();
      }
      if (struct.binlogs != null) {
        if (struct.isSetBinlogs()) {
          oprot.writeFieldBegin(BINLOGS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.binlogs.size()));
            for (TBinlog _iter503 : struct.binlogs)
            {
              _iter503.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.fe_version != null) {
        if (struct.isSetFeVersion()) {
          oprot.writeFieldBegin(FE_VERSION_FIELD_DESC);
          oprot.writeString(struct.fe_version);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetFeMetaVersion()) {
        oprot.writeFieldBegin(FE_META_VERSION_FIELD_DESC);
        oprot.writeI64(struct.fe_meta_version);
        oprot.writeFieldEnd();
      }
      if (struct.master_address != null) {
        if (struct.isSetMasterAddress()) {
          oprot.writeFieldBegin(MASTER_ADDRESS_FIELD_DESC);
          struct.master_address.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetBinlogResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetBinlogResultTupleScheme getScheme() {
      return new TGetBinlogResultTupleScheme();
    }
  }

  private static class TGetBinlogResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TGetBinlogResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetBinlogResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetNextCommitSeq()) {
        optionals.set(1);
      }
      if (struct.isSetBinlogs()) {
        optionals.set(2);
      }
      if (struct.isSetFeVersion()) {
        optionals.set(3);
      }
      if (struct.isSetFeMetaVersion()) {
        optionals.set(4);
      }
      if (struct.isSetMasterAddress()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
      if (struct.isSetNextCommitSeq()) {
        oprot.writeI64(struct.next_commit_seq);
      }
      if (struct.isSetBinlogs()) {
        {
          oprot.writeI32(struct.binlogs.size());
          for (TBinlog _iter504 : struct.binlogs)
          {
            _iter504.write(oprot);
          }
        }
      }
      if (struct.isSetFeVersion()) {
        oprot.writeString(struct.fe_version);
      }
      if (struct.isSetFeMetaVersion()) {
        oprot.writeI64(struct.fe_meta_version);
      }
      if (struct.isSetMasterAddress()) {
        struct.master_address.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetBinlogResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.status = new org.apache.doris.thrift.TStatus();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.next_commit_seq = iprot.readI64();
        struct.setNextCommitSeqIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list505 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.binlogs = new java.util.ArrayList<TBinlog>(_list505.size);
          @org.apache.thrift.annotation.Nullable TBinlog _elem506;
          for (int _i507 = 0; _i507 < _list505.size; ++_i507)
          {
            _elem506 = new TBinlog();
            _elem506.read(iprot);
            struct.binlogs.add(_elem506);
          }
        }
        struct.setBinlogsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.fe_version = iprot.readString();
        struct.setFeVersionIsSet(true);
      }
      if (incoming.get(4)) {
        struct.fe_meta_version = iprot.readI64();
        struct.setFeMetaVersionIsSet(true);
      }
      if (incoming.get(5)) {
        struct.master_address = new org.apache.doris.thrift.TNetworkAddress();
        struct.master_address.read(iprot);
        struct.setMasterAddressIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

