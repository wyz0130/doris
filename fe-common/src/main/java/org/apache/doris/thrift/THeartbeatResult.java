/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class THeartbeatResult implements org.apache.thrift.TBase<THeartbeatResult, THeartbeatResult._Fields>, java.io.Serializable, Cloneable, Comparable<THeartbeatResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("THeartbeatResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField BACKEND_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("backend_info", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new THeartbeatResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new THeartbeatResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status; // required
  public @org.apache.thrift.annotation.Nullable TBackendInfo backend_info; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    BACKEND_INFO((short)2, "backend_info");

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
        case 2: // BACKEND_INFO
          return BACKEND_INFO;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TStatus.class)));
    tmpMap.put(_Fields.BACKEND_INFO, new org.apache.thrift.meta_data.FieldMetaData("backend_info", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TBackendInfo.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(THeartbeatResult.class, metaDataMap);
  }

  public THeartbeatResult() {
  }

  public THeartbeatResult(
    org.apache.doris.thrift.TStatus status,
    TBackendInfo backend_info)
  {
    this();
    this.status = status;
    this.backend_info = backend_info;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public THeartbeatResult(THeartbeatResult other) {
    if (other.isSetStatus()) {
      this.status = new org.apache.doris.thrift.TStatus(other.status);
    }
    if (other.isSetBackendInfo()) {
      this.backend_info = new TBackendInfo(other.backend_info);
    }
  }

  public THeartbeatResult deepCopy() {
    return new THeartbeatResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.backend_info = null;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TStatus getStatus() {
    return this.status;
  }

  public THeartbeatResult setStatus(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status) {
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

  @org.apache.thrift.annotation.Nullable
  public TBackendInfo getBackendInfo() {
    return this.backend_info;
  }

  public THeartbeatResult setBackendInfo(@org.apache.thrift.annotation.Nullable TBackendInfo backend_info) {
    this.backend_info = backend_info;
    return this;
  }

  public void unsetBackendInfo() {
    this.backend_info = null;
  }

  /** Returns true if field backend_info is set (has been assigned a value) and false otherwise */
  public boolean isSetBackendInfo() {
    return this.backend_info != null;
  }

  public void setBackendInfoIsSet(boolean value) {
    if (!value) {
      this.backend_info = null;
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

    case BACKEND_INFO:
      if (value == null) {
        unsetBackendInfo();
      } else {
        setBackendInfo((TBackendInfo)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case BACKEND_INFO:
      return getBackendInfo();

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
    case BACKEND_INFO:
      return isSetBackendInfo();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof THeartbeatResult)
      return this.equals((THeartbeatResult)that);
    return false;
  }

  public boolean equals(THeartbeatResult that) {
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

    boolean this_present_backend_info = true && this.isSetBackendInfo();
    boolean that_present_backend_info = true && that.isSetBackendInfo();
    if (this_present_backend_info || that_present_backend_info) {
      if (!(this_present_backend_info && that_present_backend_info))
        return false;
      if (!this.backend_info.equals(that.backend_info))
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

    hashCode = hashCode * 8191 + ((isSetBackendInfo()) ? 131071 : 524287);
    if (isSetBackendInfo())
      hashCode = hashCode * 8191 + backend_info.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(THeartbeatResult other) {
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
    lastComparison = java.lang.Boolean.compare(isSetBackendInfo(), other.isSetBackendInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBackendInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.backend_info, other.backend_info);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("THeartbeatResult(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("backend_info:");
    if (this.backend_info == null) {
      sb.append("null");
    } else {
      sb.append(this.backend_info);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (status == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' was not present! Struct: " + toString());
    }
    if (backend_info == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'backend_info' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (status != null) {
      status.validate();
    }
    if (backend_info != null) {
      backend_info.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class THeartbeatResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public THeartbeatResultStandardScheme getScheme() {
      return new THeartbeatResultStandardScheme();
    }
  }

  private static class THeartbeatResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<THeartbeatResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, THeartbeatResult struct) throws org.apache.thrift.TException {
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
          case 2: // BACKEND_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.backend_info = new TBackendInfo();
              struct.backend_info.read(iprot);
              struct.setBackendInfoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, THeartbeatResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.backend_info != null) {
        oprot.writeFieldBegin(BACKEND_INFO_FIELD_DESC);
        struct.backend_info.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class THeartbeatResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public THeartbeatResultTupleScheme getScheme() {
      return new THeartbeatResultTupleScheme();
    }
  }

  private static class THeartbeatResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<THeartbeatResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, THeartbeatResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.status.write(oprot);
      struct.backend_info.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, THeartbeatResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.status = new org.apache.doris.thrift.TStatus();
      struct.status.read(iprot);
      struct.setStatusIsSet(true);
      struct.backend_info = new TBackendInfo();
      struct.backend_info.read(iprot);
      struct.setBackendInfoIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

