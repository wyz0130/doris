/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TSnapshotLoaderReportRequest implements org.apache.thrift.TBase<TSnapshotLoaderReportRequest, TSnapshotLoaderReportRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TSnapshotLoaderReportRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSnapshotLoaderReportRequest");

  private static final org.apache.thrift.protocol.TField JOB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("job_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField TASK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("task_id", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField TASK_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("task_type", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField FINISHED_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("finished_num", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField TOTAL_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("total_num", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TSnapshotLoaderReportRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TSnapshotLoaderReportRequestTupleSchemeFactory();

  public long job_id; // required
  public long task_id; // required
  /**
   * 
   * @see org.apache.doris.thrift.TTaskType
   */
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TTaskType task_type; // required
  public int finished_num; // optional
  public int total_num; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOB_ID((short)1, "job_id"),
    TASK_ID((short)2, "task_id"),
    /**
     * 
     * @see org.apache.doris.thrift.TTaskType
     */
    TASK_TYPE((short)3, "task_type"),
    FINISHED_NUM((short)4, "finished_num"),
    TOTAL_NUM((short)5, "total_num");

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
        case 1: // JOB_ID
          return JOB_ID;
        case 2: // TASK_ID
          return TASK_ID;
        case 3: // TASK_TYPE
          return TASK_TYPE;
        case 4: // FINISHED_NUM
          return FINISHED_NUM;
        case 5: // TOTAL_NUM
          return TOTAL_NUM;
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
  private static final int __JOB_ID_ISSET_ID = 0;
  private static final int __TASK_ID_ISSET_ID = 1;
  private static final int __FINISHED_NUM_ISSET_ID = 2;
  private static final int __TOTAL_NUM_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.FINISHED_NUM,_Fields.TOTAL_NUM};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB_ID, new org.apache.thrift.meta_data.FieldMetaData("job_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TASK_ID, new org.apache.thrift.meta_data.FieldMetaData("task_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TASK_TYPE, new org.apache.thrift.meta_data.FieldMetaData("task_type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.doris.thrift.TTaskType.class)));
    tmpMap.put(_Fields.FINISHED_NUM, new org.apache.thrift.meta_data.FieldMetaData("finished_num", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOTAL_NUM, new org.apache.thrift.meta_data.FieldMetaData("total_num", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSnapshotLoaderReportRequest.class, metaDataMap);
  }

  public TSnapshotLoaderReportRequest() {
  }

  public TSnapshotLoaderReportRequest(
    long job_id,
    long task_id,
    org.apache.doris.thrift.TTaskType task_type)
  {
    this();
    this.job_id = job_id;
    setJobIdIsSet(true);
    this.task_id = task_id;
    setTaskIdIsSet(true);
    this.task_type = task_type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSnapshotLoaderReportRequest(TSnapshotLoaderReportRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.job_id = other.job_id;
    this.task_id = other.task_id;
    if (other.isSetTaskType()) {
      this.task_type = other.task_type;
    }
    this.finished_num = other.finished_num;
    this.total_num = other.total_num;
  }

  public TSnapshotLoaderReportRequest deepCopy() {
    return new TSnapshotLoaderReportRequest(this);
  }

  @Override
  public void clear() {
    setJobIdIsSet(false);
    this.job_id = 0;
    setTaskIdIsSet(false);
    this.task_id = 0;
    this.task_type = null;
    setFinishedNumIsSet(false);
    this.finished_num = 0;
    setTotalNumIsSet(false);
    this.total_num = 0;
  }

  public long getJobId() {
    return this.job_id;
  }

  public TSnapshotLoaderReportRequest setJobId(long job_id) {
    this.job_id = job_id;
    setJobIdIsSet(true);
    return this;
  }

  public void unsetJobId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __JOB_ID_ISSET_ID);
  }

  /** Returns true if field job_id is set (has been assigned a value) and false otherwise */
  public boolean isSetJobId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __JOB_ID_ISSET_ID);
  }

  public void setJobIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __JOB_ID_ISSET_ID, value);
  }

  public long getTaskId() {
    return this.task_id;
  }

  public TSnapshotLoaderReportRequest setTaskId(long task_id) {
    this.task_id = task_id;
    setTaskIdIsSet(true);
    return this;
  }

  public void unsetTaskId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TASK_ID_ISSET_ID);
  }

  /** Returns true if field task_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TASK_ID_ISSET_ID);
  }

  public void setTaskIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TASK_ID_ISSET_ID, value);
  }

  /**
   * 
   * @see org.apache.doris.thrift.TTaskType
   */
  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TTaskType getTaskType() {
    return this.task_type;
  }

  /**
   * 
   * @see org.apache.doris.thrift.TTaskType
   */
  public TSnapshotLoaderReportRequest setTaskType(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TTaskType task_type) {
    this.task_type = task_type;
    return this;
  }

  public void unsetTaskType() {
    this.task_type = null;
  }

  /** Returns true if field task_type is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskType() {
    return this.task_type != null;
  }

  public void setTaskTypeIsSet(boolean value) {
    if (!value) {
      this.task_type = null;
    }
  }

  public int getFinishedNum() {
    return this.finished_num;
  }

  public TSnapshotLoaderReportRequest setFinishedNum(int finished_num) {
    this.finished_num = finished_num;
    setFinishedNumIsSet(true);
    return this;
  }

  public void unsetFinishedNum() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FINISHED_NUM_ISSET_ID);
  }

  /** Returns true if field finished_num is set (has been assigned a value) and false otherwise */
  public boolean isSetFinishedNum() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FINISHED_NUM_ISSET_ID);
  }

  public void setFinishedNumIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FINISHED_NUM_ISSET_ID, value);
  }

  public int getTotalNum() {
    return this.total_num;
  }

  public TSnapshotLoaderReportRequest setTotalNum(int total_num) {
    this.total_num = total_num;
    setTotalNumIsSet(true);
    return this;
  }

  public void unsetTotalNum() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOTAL_NUM_ISSET_ID);
  }

  /** Returns true if field total_num is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalNum() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOTAL_NUM_ISSET_ID);
  }

  public void setTotalNumIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOTAL_NUM_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case JOB_ID:
      if (value == null) {
        unsetJobId();
      } else {
        setJobId((java.lang.Long)value);
      }
      break;

    case TASK_ID:
      if (value == null) {
        unsetTaskId();
      } else {
        setTaskId((java.lang.Long)value);
      }
      break;

    case TASK_TYPE:
      if (value == null) {
        unsetTaskType();
      } else {
        setTaskType((org.apache.doris.thrift.TTaskType)value);
      }
      break;

    case FINISHED_NUM:
      if (value == null) {
        unsetFinishedNum();
      } else {
        setFinishedNum((java.lang.Integer)value);
      }
      break;

    case TOTAL_NUM:
      if (value == null) {
        unsetTotalNum();
      } else {
        setTotalNum((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_ID:
      return getJobId();

    case TASK_ID:
      return getTaskId();

    case TASK_TYPE:
      return getTaskType();

    case FINISHED_NUM:
      return getFinishedNum();

    case TOTAL_NUM:
      return getTotalNum();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case JOB_ID:
      return isSetJobId();
    case TASK_ID:
      return isSetTaskId();
    case TASK_TYPE:
      return isSetTaskType();
    case FINISHED_NUM:
      return isSetFinishedNum();
    case TOTAL_NUM:
      return isSetTotalNum();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TSnapshotLoaderReportRequest)
      return this.equals((TSnapshotLoaderReportRequest)that);
    return false;
  }

  public boolean equals(TSnapshotLoaderReportRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_job_id = true;
    boolean that_present_job_id = true;
    if (this_present_job_id || that_present_job_id) {
      if (!(this_present_job_id && that_present_job_id))
        return false;
      if (this.job_id != that.job_id)
        return false;
    }

    boolean this_present_task_id = true;
    boolean that_present_task_id = true;
    if (this_present_task_id || that_present_task_id) {
      if (!(this_present_task_id && that_present_task_id))
        return false;
      if (this.task_id != that.task_id)
        return false;
    }

    boolean this_present_task_type = true && this.isSetTaskType();
    boolean that_present_task_type = true && that.isSetTaskType();
    if (this_present_task_type || that_present_task_type) {
      if (!(this_present_task_type && that_present_task_type))
        return false;
      if (!this.task_type.equals(that.task_type))
        return false;
    }

    boolean this_present_finished_num = true && this.isSetFinishedNum();
    boolean that_present_finished_num = true && that.isSetFinishedNum();
    if (this_present_finished_num || that_present_finished_num) {
      if (!(this_present_finished_num && that_present_finished_num))
        return false;
      if (this.finished_num != that.finished_num)
        return false;
    }

    boolean this_present_total_num = true && this.isSetTotalNum();
    boolean that_present_total_num = true && that.isSetTotalNum();
    if (this_present_total_num || that_present_total_num) {
      if (!(this_present_total_num && that_present_total_num))
        return false;
      if (this.total_num != that.total_num)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(job_id);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(task_id);

    hashCode = hashCode * 8191 + ((isSetTaskType()) ? 131071 : 524287);
    if (isSetTaskType())
      hashCode = hashCode * 8191 + task_type.getValue();

    hashCode = hashCode * 8191 + ((isSetFinishedNum()) ? 131071 : 524287);
    if (isSetFinishedNum())
      hashCode = hashCode * 8191 + finished_num;

    hashCode = hashCode * 8191 + ((isSetTotalNum()) ? 131071 : 524287);
    if (isSetTotalNum())
      hashCode = hashCode * 8191 + total_num;

    return hashCode;
  }

  @Override
  public int compareTo(TSnapshotLoaderReportRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetJobId(), other.isSetJobId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.job_id, other.job_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTaskId(), other.isSetTaskId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.task_id, other.task_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTaskType(), other.isSetTaskType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.task_type, other.task_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetFinishedNum(), other.isSetFinishedNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFinishedNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.finished_num, other.finished_num);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTotalNum(), other.isSetTotalNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.total_num, other.total_num);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TSnapshotLoaderReportRequest(");
    boolean first = true;

    sb.append("job_id:");
    sb.append(this.job_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("task_id:");
    sb.append(this.task_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("task_type:");
    if (this.task_type == null) {
      sb.append("null");
    } else {
      sb.append(this.task_type);
    }
    first = false;
    if (isSetFinishedNum()) {
      if (!first) sb.append(", ");
      sb.append("finished_num:");
      sb.append(this.finished_num);
      first = false;
    }
    if (isSetTotalNum()) {
      if (!first) sb.append(", ");
      sb.append("total_num:");
      sb.append(this.total_num);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'job_id' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'task_id' because it's a primitive and you chose the non-beans generator.
    if (task_type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'task_type' was not present! Struct: " + toString());
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

  private static class TSnapshotLoaderReportRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TSnapshotLoaderReportRequestStandardScheme getScheme() {
      return new TSnapshotLoaderReportRequestStandardScheme();
    }
  }

  private static class TSnapshotLoaderReportRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TSnapshotLoaderReportRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSnapshotLoaderReportRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.job_id = iprot.readI64();
              struct.setJobIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TASK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.task_id = iprot.readI64();
              struct.setTaskIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TASK_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.task_type = org.apache.doris.thrift.TTaskType.findByValue(iprot.readI32());
              struct.setTaskTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FINISHED_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.finished_num = iprot.readI32();
              struct.setFinishedNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TOTAL_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.total_num = iprot.readI32();
              struct.setTotalNumIsSet(true);
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
      if (!struct.isSetJobId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'job_id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetTaskId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'task_id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSnapshotLoaderReportRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(JOB_ID_FIELD_DESC);
      oprot.writeI64(struct.job_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TASK_ID_FIELD_DESC);
      oprot.writeI64(struct.task_id);
      oprot.writeFieldEnd();
      if (struct.task_type != null) {
        oprot.writeFieldBegin(TASK_TYPE_FIELD_DESC);
        oprot.writeI32(struct.task_type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.isSetFinishedNum()) {
        oprot.writeFieldBegin(FINISHED_NUM_FIELD_DESC);
        oprot.writeI32(struct.finished_num);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTotalNum()) {
        oprot.writeFieldBegin(TOTAL_NUM_FIELD_DESC);
        oprot.writeI32(struct.total_num);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSnapshotLoaderReportRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TSnapshotLoaderReportRequestTupleScheme getScheme() {
      return new TSnapshotLoaderReportRequestTupleScheme();
    }
  }

  private static class TSnapshotLoaderReportRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TSnapshotLoaderReportRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSnapshotLoaderReportRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.job_id);
      oprot.writeI64(struct.task_id);
      oprot.writeI32(struct.task_type.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetFinishedNum()) {
        optionals.set(0);
      }
      if (struct.isSetTotalNum()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetFinishedNum()) {
        oprot.writeI32(struct.finished_num);
      }
      if (struct.isSetTotalNum()) {
        oprot.writeI32(struct.total_num);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSnapshotLoaderReportRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.job_id = iprot.readI64();
      struct.setJobIdIsSet(true);
      struct.task_id = iprot.readI64();
      struct.setTaskIdIsSet(true);
      struct.task_type = org.apache.doris.thrift.TTaskType.findByValue(iprot.readI32());
      struct.setTaskTypeIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.finished_num = iprot.readI32();
        struct.setFinishedNumIsSet(true);
      }
      if (incoming.get(1)) {
        struct.total_num = iprot.readI32();
        struct.setTotalNumIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
