/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TJvmThreadInfo implements org.apache.thrift.TBase<TJvmThreadInfo, TJvmThreadInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TJvmThreadInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TJvmThreadInfo");

  private static final org.apache.thrift.protocol.TField SUMMARY_FIELD_DESC = new org.apache.thrift.protocol.TField("summary", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CPU_TIME_IN_NS_FIELD_DESC = new org.apache.thrift.protocol.TField("cpu_time_in_ns", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField USER_TIME_IN_NS_FIELD_DESC = new org.apache.thrift.protocol.TField("user_time_in_ns", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField BLOCKED_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("blocked_count", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField BLOCKED_TIME_IN_MS_FIELD_DESC = new org.apache.thrift.protocol.TField("blocked_time_in_ms", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField IS_IN_NATIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("is_in_native", org.apache.thrift.protocol.TType.BOOL, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TJvmThreadInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TJvmThreadInfoTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String summary; // required
  public long cpu_time_in_ns; // required
  public long user_time_in_ns; // required
  public long blocked_count; // required
  public long blocked_time_in_ms; // required
  public boolean is_in_native; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SUMMARY((short)1, "summary"),
    CPU_TIME_IN_NS((short)2, "cpu_time_in_ns"),
    USER_TIME_IN_NS((short)3, "user_time_in_ns"),
    BLOCKED_COUNT((short)4, "blocked_count"),
    BLOCKED_TIME_IN_MS((short)5, "blocked_time_in_ms"),
    IS_IN_NATIVE((short)6, "is_in_native");

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
        case 1: // SUMMARY
          return SUMMARY;
        case 2: // CPU_TIME_IN_NS
          return CPU_TIME_IN_NS;
        case 3: // USER_TIME_IN_NS
          return USER_TIME_IN_NS;
        case 4: // BLOCKED_COUNT
          return BLOCKED_COUNT;
        case 5: // BLOCKED_TIME_IN_MS
          return BLOCKED_TIME_IN_MS;
        case 6: // IS_IN_NATIVE
          return IS_IN_NATIVE;
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
  private static final int __CPU_TIME_IN_NS_ISSET_ID = 0;
  private static final int __USER_TIME_IN_NS_ISSET_ID = 1;
  private static final int __BLOCKED_COUNT_ISSET_ID = 2;
  private static final int __BLOCKED_TIME_IN_MS_ISSET_ID = 3;
  private static final int __IS_IN_NATIVE_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SUMMARY, new org.apache.thrift.meta_data.FieldMetaData("summary", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CPU_TIME_IN_NS, new org.apache.thrift.meta_data.FieldMetaData("cpu_time_in_ns", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.USER_TIME_IN_NS, new org.apache.thrift.meta_data.FieldMetaData("user_time_in_ns", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.BLOCKED_COUNT, new org.apache.thrift.meta_data.FieldMetaData("blocked_count", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.BLOCKED_TIME_IN_MS, new org.apache.thrift.meta_data.FieldMetaData("blocked_time_in_ms", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.IS_IN_NATIVE, new org.apache.thrift.meta_data.FieldMetaData("is_in_native", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TJvmThreadInfo.class, metaDataMap);
  }

  public TJvmThreadInfo() {
  }

  public TJvmThreadInfo(
    java.lang.String summary,
    long cpu_time_in_ns,
    long user_time_in_ns,
    long blocked_count,
    long blocked_time_in_ms,
    boolean is_in_native)
  {
    this();
    this.summary = summary;
    this.cpu_time_in_ns = cpu_time_in_ns;
    setCpuTimeInNsIsSet(true);
    this.user_time_in_ns = user_time_in_ns;
    setUserTimeInNsIsSet(true);
    this.blocked_count = blocked_count;
    setBlockedCountIsSet(true);
    this.blocked_time_in_ms = blocked_time_in_ms;
    setBlockedTimeInMsIsSet(true);
    this.is_in_native = is_in_native;
    setIsInNativeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TJvmThreadInfo(TJvmThreadInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSummary()) {
      this.summary = other.summary;
    }
    this.cpu_time_in_ns = other.cpu_time_in_ns;
    this.user_time_in_ns = other.user_time_in_ns;
    this.blocked_count = other.blocked_count;
    this.blocked_time_in_ms = other.blocked_time_in_ms;
    this.is_in_native = other.is_in_native;
  }

  public TJvmThreadInfo deepCopy() {
    return new TJvmThreadInfo(this);
  }

  @Override
  public void clear() {
    this.summary = null;
    setCpuTimeInNsIsSet(false);
    this.cpu_time_in_ns = 0;
    setUserTimeInNsIsSet(false);
    this.user_time_in_ns = 0;
    setBlockedCountIsSet(false);
    this.blocked_count = 0;
    setBlockedTimeInMsIsSet(false);
    this.blocked_time_in_ms = 0;
    setIsInNativeIsSet(false);
    this.is_in_native = false;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSummary() {
    return this.summary;
  }

  public TJvmThreadInfo setSummary(@org.apache.thrift.annotation.Nullable java.lang.String summary) {
    this.summary = summary;
    return this;
  }

  public void unsetSummary() {
    this.summary = null;
  }

  /** Returns true if field summary is set (has been assigned a value) and false otherwise */
  public boolean isSetSummary() {
    return this.summary != null;
  }

  public void setSummaryIsSet(boolean value) {
    if (!value) {
      this.summary = null;
    }
  }

  public long getCpuTimeInNs() {
    return this.cpu_time_in_ns;
  }

  public TJvmThreadInfo setCpuTimeInNs(long cpu_time_in_ns) {
    this.cpu_time_in_ns = cpu_time_in_ns;
    setCpuTimeInNsIsSet(true);
    return this;
  }

  public void unsetCpuTimeInNs() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CPU_TIME_IN_NS_ISSET_ID);
  }

  /** Returns true if field cpu_time_in_ns is set (has been assigned a value) and false otherwise */
  public boolean isSetCpuTimeInNs() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CPU_TIME_IN_NS_ISSET_ID);
  }

  public void setCpuTimeInNsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CPU_TIME_IN_NS_ISSET_ID, value);
  }

  public long getUserTimeInNs() {
    return this.user_time_in_ns;
  }

  public TJvmThreadInfo setUserTimeInNs(long user_time_in_ns) {
    this.user_time_in_ns = user_time_in_ns;
    setUserTimeInNsIsSet(true);
    return this;
  }

  public void unsetUserTimeInNs() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USER_TIME_IN_NS_ISSET_ID);
  }

  /** Returns true if field user_time_in_ns is set (has been assigned a value) and false otherwise */
  public boolean isSetUserTimeInNs() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USER_TIME_IN_NS_ISSET_ID);
  }

  public void setUserTimeInNsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USER_TIME_IN_NS_ISSET_ID, value);
  }

  public long getBlockedCount() {
    return this.blocked_count;
  }

  public TJvmThreadInfo setBlockedCount(long blocked_count) {
    this.blocked_count = blocked_count;
    setBlockedCountIsSet(true);
    return this;
  }

  public void unsetBlockedCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BLOCKED_COUNT_ISSET_ID);
  }

  /** Returns true if field blocked_count is set (has been assigned a value) and false otherwise */
  public boolean isSetBlockedCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BLOCKED_COUNT_ISSET_ID);
  }

  public void setBlockedCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BLOCKED_COUNT_ISSET_ID, value);
  }

  public long getBlockedTimeInMs() {
    return this.blocked_time_in_ms;
  }

  public TJvmThreadInfo setBlockedTimeInMs(long blocked_time_in_ms) {
    this.blocked_time_in_ms = blocked_time_in_ms;
    setBlockedTimeInMsIsSet(true);
    return this;
  }

  public void unsetBlockedTimeInMs() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BLOCKED_TIME_IN_MS_ISSET_ID);
  }

  /** Returns true if field blocked_time_in_ms is set (has been assigned a value) and false otherwise */
  public boolean isSetBlockedTimeInMs() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BLOCKED_TIME_IN_MS_ISSET_ID);
  }

  public void setBlockedTimeInMsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BLOCKED_TIME_IN_MS_ISSET_ID, value);
  }

  public boolean isIsInNative() {
    return this.is_in_native;
  }

  public TJvmThreadInfo setIsInNative(boolean is_in_native) {
    this.is_in_native = is_in_native;
    setIsInNativeIsSet(true);
    return this;
  }

  public void unsetIsInNative() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __IS_IN_NATIVE_ISSET_ID);
  }

  /** Returns true if field is_in_native is set (has been assigned a value) and false otherwise */
  public boolean isSetIsInNative() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __IS_IN_NATIVE_ISSET_ID);
  }

  public void setIsInNativeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __IS_IN_NATIVE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SUMMARY:
      if (value == null) {
        unsetSummary();
      } else {
        setSummary((java.lang.String)value);
      }
      break;

    case CPU_TIME_IN_NS:
      if (value == null) {
        unsetCpuTimeInNs();
      } else {
        setCpuTimeInNs((java.lang.Long)value);
      }
      break;

    case USER_TIME_IN_NS:
      if (value == null) {
        unsetUserTimeInNs();
      } else {
        setUserTimeInNs((java.lang.Long)value);
      }
      break;

    case BLOCKED_COUNT:
      if (value == null) {
        unsetBlockedCount();
      } else {
        setBlockedCount((java.lang.Long)value);
      }
      break;

    case BLOCKED_TIME_IN_MS:
      if (value == null) {
        unsetBlockedTimeInMs();
      } else {
        setBlockedTimeInMs((java.lang.Long)value);
      }
      break;

    case IS_IN_NATIVE:
      if (value == null) {
        unsetIsInNative();
      } else {
        setIsInNative((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SUMMARY:
      return getSummary();

    case CPU_TIME_IN_NS:
      return getCpuTimeInNs();

    case USER_TIME_IN_NS:
      return getUserTimeInNs();

    case BLOCKED_COUNT:
      return getBlockedCount();

    case BLOCKED_TIME_IN_MS:
      return getBlockedTimeInMs();

    case IS_IN_NATIVE:
      return isIsInNative();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SUMMARY:
      return isSetSummary();
    case CPU_TIME_IN_NS:
      return isSetCpuTimeInNs();
    case USER_TIME_IN_NS:
      return isSetUserTimeInNs();
    case BLOCKED_COUNT:
      return isSetBlockedCount();
    case BLOCKED_TIME_IN_MS:
      return isSetBlockedTimeInMs();
    case IS_IN_NATIVE:
      return isSetIsInNative();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TJvmThreadInfo)
      return this.equals((TJvmThreadInfo)that);
    return false;
  }

  public boolean equals(TJvmThreadInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_summary = true && this.isSetSummary();
    boolean that_present_summary = true && that.isSetSummary();
    if (this_present_summary || that_present_summary) {
      if (!(this_present_summary && that_present_summary))
        return false;
      if (!this.summary.equals(that.summary))
        return false;
    }

    boolean this_present_cpu_time_in_ns = true;
    boolean that_present_cpu_time_in_ns = true;
    if (this_present_cpu_time_in_ns || that_present_cpu_time_in_ns) {
      if (!(this_present_cpu_time_in_ns && that_present_cpu_time_in_ns))
        return false;
      if (this.cpu_time_in_ns != that.cpu_time_in_ns)
        return false;
    }

    boolean this_present_user_time_in_ns = true;
    boolean that_present_user_time_in_ns = true;
    if (this_present_user_time_in_ns || that_present_user_time_in_ns) {
      if (!(this_present_user_time_in_ns && that_present_user_time_in_ns))
        return false;
      if (this.user_time_in_ns != that.user_time_in_ns)
        return false;
    }

    boolean this_present_blocked_count = true;
    boolean that_present_blocked_count = true;
    if (this_present_blocked_count || that_present_blocked_count) {
      if (!(this_present_blocked_count && that_present_blocked_count))
        return false;
      if (this.blocked_count != that.blocked_count)
        return false;
    }

    boolean this_present_blocked_time_in_ms = true;
    boolean that_present_blocked_time_in_ms = true;
    if (this_present_blocked_time_in_ms || that_present_blocked_time_in_ms) {
      if (!(this_present_blocked_time_in_ms && that_present_blocked_time_in_ms))
        return false;
      if (this.blocked_time_in_ms != that.blocked_time_in_ms)
        return false;
    }

    boolean this_present_is_in_native = true;
    boolean that_present_is_in_native = true;
    if (this_present_is_in_native || that_present_is_in_native) {
      if (!(this_present_is_in_native && that_present_is_in_native))
        return false;
      if (this.is_in_native != that.is_in_native)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSummary()) ? 131071 : 524287);
    if (isSetSummary())
      hashCode = hashCode * 8191 + summary.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(cpu_time_in_ns);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(user_time_in_ns);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(blocked_count);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(blocked_time_in_ms);

    hashCode = hashCode * 8191 + ((is_in_native) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TJvmThreadInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetSummary(), other.isSetSummary());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSummary()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.summary, other.summary);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCpuTimeInNs(), other.isSetCpuTimeInNs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCpuTimeInNs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cpu_time_in_ns, other.cpu_time_in_ns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetUserTimeInNs(), other.isSetUserTimeInNs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserTimeInNs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user_time_in_ns, other.user_time_in_ns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBlockedCount(), other.isSetBlockedCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBlockedCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.blocked_count, other.blocked_count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBlockedTimeInMs(), other.isSetBlockedTimeInMs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBlockedTimeInMs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.blocked_time_in_ms, other.blocked_time_in_ms);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIsInNative(), other.isSetIsInNative());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsInNative()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_in_native, other.is_in_native);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TJvmThreadInfo(");
    boolean first = true;

    sb.append("summary:");
    if (this.summary == null) {
      sb.append("null");
    } else {
      sb.append(this.summary);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("cpu_time_in_ns:");
    sb.append(this.cpu_time_in_ns);
    first = false;
    if (!first) sb.append(", ");
    sb.append("user_time_in_ns:");
    sb.append(this.user_time_in_ns);
    first = false;
    if (!first) sb.append(", ");
    sb.append("blocked_count:");
    sb.append(this.blocked_count);
    first = false;
    if (!first) sb.append(", ");
    sb.append("blocked_time_in_ms:");
    sb.append(this.blocked_time_in_ms);
    first = false;
    if (!first) sb.append(", ");
    sb.append("is_in_native:");
    sb.append(this.is_in_native);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (summary == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'summary' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'cpu_time_in_ns' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'user_time_in_ns' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'blocked_count' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'blocked_time_in_ms' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'is_in_native' because it's a primitive and you chose the non-beans generator.
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

  private static class TJvmThreadInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TJvmThreadInfoStandardScheme getScheme() {
      return new TJvmThreadInfoStandardScheme();
    }
  }

  private static class TJvmThreadInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TJvmThreadInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TJvmThreadInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUMMARY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.summary = iprot.readString();
              struct.setSummaryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CPU_TIME_IN_NS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.cpu_time_in_ns = iprot.readI64();
              struct.setCpuTimeInNsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USER_TIME_IN_NS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.user_time_in_ns = iprot.readI64();
              struct.setUserTimeInNsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BLOCKED_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.blocked_count = iprot.readI64();
              struct.setBlockedCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // BLOCKED_TIME_IN_MS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.blocked_time_in_ms = iprot.readI64();
              struct.setBlockedTimeInMsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // IS_IN_NATIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_in_native = iprot.readBool();
              struct.setIsInNativeIsSet(true);
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
      if (!struct.isSetCpuTimeInNs()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'cpu_time_in_ns' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetUserTimeInNs()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'user_time_in_ns' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetBlockedCount()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'blocked_count' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetBlockedTimeInMs()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'blocked_time_in_ms' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetIsInNative()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'is_in_native' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TJvmThreadInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.summary != null) {
        oprot.writeFieldBegin(SUMMARY_FIELD_DESC);
        oprot.writeString(struct.summary);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CPU_TIME_IN_NS_FIELD_DESC);
      oprot.writeI64(struct.cpu_time_in_ns);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(USER_TIME_IN_NS_FIELD_DESC);
      oprot.writeI64(struct.user_time_in_ns);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BLOCKED_COUNT_FIELD_DESC);
      oprot.writeI64(struct.blocked_count);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BLOCKED_TIME_IN_MS_FIELD_DESC);
      oprot.writeI64(struct.blocked_time_in_ms);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_IN_NATIVE_FIELD_DESC);
      oprot.writeBool(struct.is_in_native);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TJvmThreadInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TJvmThreadInfoTupleScheme getScheme() {
      return new TJvmThreadInfoTupleScheme();
    }
  }

  private static class TJvmThreadInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TJvmThreadInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TJvmThreadInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.summary);
      oprot.writeI64(struct.cpu_time_in_ns);
      oprot.writeI64(struct.user_time_in_ns);
      oprot.writeI64(struct.blocked_count);
      oprot.writeI64(struct.blocked_time_in_ms);
      oprot.writeBool(struct.is_in_native);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TJvmThreadInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.summary = iprot.readString();
      struct.setSummaryIsSet(true);
      struct.cpu_time_in_ns = iprot.readI64();
      struct.setCpuTimeInNsIsSet(true);
      struct.user_time_in_ns = iprot.readI64();
      struct.setUserTimeInNsIsSet(true);
      struct.blocked_count = iprot.readI64();
      struct.setBlockedCountIsSet(true);
      struct.blocked_time_in_ms = iprot.readI64();
      struct.setBlockedTimeInMsIsSet(true);
      struct.is_in_native = iprot.readBool();
      struct.setIsInNativeIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

