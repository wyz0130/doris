/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TRuntimeFilterTargetParams implements org.apache.thrift.TBase<TRuntimeFilterTargetParams, TRuntimeFilterTargetParams._Fields>, java.io.Serializable, Cloneable, Comparable<TRuntimeFilterTargetParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TRuntimeFilterTargetParams");

  private static final org.apache.thrift.protocol.TField TARGET_FRAGMENT_INSTANCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("target_fragment_instance_id", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TARGET_FRAGMENT_INSTANCE_ADDR_FIELD_DESC = new org.apache.thrift.protocol.TField("target_fragment_instance_addr", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TRuntimeFilterTargetParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TRuntimeFilterTargetParamsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId target_fragment_instance_id; // required
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TNetworkAddress target_fragment_instance_addr; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TARGET_FRAGMENT_INSTANCE_ID((short)1, "target_fragment_instance_id"),
    TARGET_FRAGMENT_INSTANCE_ADDR((short)2, "target_fragment_instance_addr");

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
        case 1: // TARGET_FRAGMENT_INSTANCE_ID
          return TARGET_FRAGMENT_INSTANCE_ID;
        case 2: // TARGET_FRAGMENT_INSTANCE_ADDR
          return TARGET_FRAGMENT_INSTANCE_ADDR;
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
    tmpMap.put(_Fields.TARGET_FRAGMENT_INSTANCE_ID, new org.apache.thrift.meta_data.FieldMetaData("target_fragment_instance_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TUniqueId.class)));
    tmpMap.put(_Fields.TARGET_FRAGMENT_INSTANCE_ADDR, new org.apache.thrift.meta_data.FieldMetaData("target_fragment_instance_addr", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TNetworkAddress.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TRuntimeFilterTargetParams.class, metaDataMap);
  }

  public TRuntimeFilterTargetParams() {
  }

  public TRuntimeFilterTargetParams(
    org.apache.doris.thrift.TUniqueId target_fragment_instance_id,
    org.apache.doris.thrift.TNetworkAddress target_fragment_instance_addr)
  {
    this();
    this.target_fragment_instance_id = target_fragment_instance_id;
    this.target_fragment_instance_addr = target_fragment_instance_addr;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TRuntimeFilterTargetParams(TRuntimeFilterTargetParams other) {
    if (other.isSetTargetFragmentInstanceId()) {
      this.target_fragment_instance_id = new org.apache.doris.thrift.TUniqueId(other.target_fragment_instance_id);
    }
    if (other.isSetTargetFragmentInstanceAddr()) {
      this.target_fragment_instance_addr = new org.apache.doris.thrift.TNetworkAddress(other.target_fragment_instance_addr);
    }
  }

  public TRuntimeFilterTargetParams deepCopy() {
    return new TRuntimeFilterTargetParams(this);
  }

  @Override
  public void clear() {
    this.target_fragment_instance_id = null;
    this.target_fragment_instance_addr = null;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TUniqueId getTargetFragmentInstanceId() {
    return this.target_fragment_instance_id;
  }

  public TRuntimeFilterTargetParams setTargetFragmentInstanceId(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId target_fragment_instance_id) {
    this.target_fragment_instance_id = target_fragment_instance_id;
    return this;
  }

  public void unsetTargetFragmentInstanceId() {
    this.target_fragment_instance_id = null;
  }

  /** Returns true if field target_fragment_instance_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTargetFragmentInstanceId() {
    return this.target_fragment_instance_id != null;
  }

  public void setTargetFragmentInstanceIdIsSet(boolean value) {
    if (!value) {
      this.target_fragment_instance_id = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TNetworkAddress getTargetFragmentInstanceAddr() {
    return this.target_fragment_instance_addr;
  }

  public TRuntimeFilterTargetParams setTargetFragmentInstanceAddr(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TNetworkAddress target_fragment_instance_addr) {
    this.target_fragment_instance_addr = target_fragment_instance_addr;
    return this;
  }

  public void unsetTargetFragmentInstanceAddr() {
    this.target_fragment_instance_addr = null;
  }

  /** Returns true if field target_fragment_instance_addr is set (has been assigned a value) and false otherwise */
  public boolean isSetTargetFragmentInstanceAddr() {
    return this.target_fragment_instance_addr != null;
  }

  public void setTargetFragmentInstanceAddrIsSet(boolean value) {
    if (!value) {
      this.target_fragment_instance_addr = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TARGET_FRAGMENT_INSTANCE_ID:
      if (value == null) {
        unsetTargetFragmentInstanceId();
      } else {
        setTargetFragmentInstanceId((org.apache.doris.thrift.TUniqueId)value);
      }
      break;

    case TARGET_FRAGMENT_INSTANCE_ADDR:
      if (value == null) {
        unsetTargetFragmentInstanceAddr();
      } else {
        setTargetFragmentInstanceAddr((org.apache.doris.thrift.TNetworkAddress)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TARGET_FRAGMENT_INSTANCE_ID:
      return getTargetFragmentInstanceId();

    case TARGET_FRAGMENT_INSTANCE_ADDR:
      return getTargetFragmentInstanceAddr();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TARGET_FRAGMENT_INSTANCE_ID:
      return isSetTargetFragmentInstanceId();
    case TARGET_FRAGMENT_INSTANCE_ADDR:
      return isSetTargetFragmentInstanceAddr();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TRuntimeFilterTargetParams)
      return this.equals((TRuntimeFilterTargetParams)that);
    return false;
  }

  public boolean equals(TRuntimeFilterTargetParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_target_fragment_instance_id = true && this.isSetTargetFragmentInstanceId();
    boolean that_present_target_fragment_instance_id = true && that.isSetTargetFragmentInstanceId();
    if (this_present_target_fragment_instance_id || that_present_target_fragment_instance_id) {
      if (!(this_present_target_fragment_instance_id && that_present_target_fragment_instance_id))
        return false;
      if (!this.target_fragment_instance_id.equals(that.target_fragment_instance_id))
        return false;
    }

    boolean this_present_target_fragment_instance_addr = true && this.isSetTargetFragmentInstanceAddr();
    boolean that_present_target_fragment_instance_addr = true && that.isSetTargetFragmentInstanceAddr();
    if (this_present_target_fragment_instance_addr || that_present_target_fragment_instance_addr) {
      if (!(this_present_target_fragment_instance_addr && that_present_target_fragment_instance_addr))
        return false;
      if (!this.target_fragment_instance_addr.equals(that.target_fragment_instance_addr))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTargetFragmentInstanceId()) ? 131071 : 524287);
    if (isSetTargetFragmentInstanceId())
      hashCode = hashCode * 8191 + target_fragment_instance_id.hashCode();

    hashCode = hashCode * 8191 + ((isSetTargetFragmentInstanceAddr()) ? 131071 : 524287);
    if (isSetTargetFragmentInstanceAddr())
      hashCode = hashCode * 8191 + target_fragment_instance_addr.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TRuntimeFilterTargetParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTargetFragmentInstanceId(), other.isSetTargetFragmentInstanceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTargetFragmentInstanceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.target_fragment_instance_id, other.target_fragment_instance_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTargetFragmentInstanceAddr(), other.isSetTargetFragmentInstanceAddr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTargetFragmentInstanceAddr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.target_fragment_instance_addr, other.target_fragment_instance_addr);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TRuntimeFilterTargetParams(");
    boolean first = true;

    sb.append("target_fragment_instance_id:");
    if (this.target_fragment_instance_id == null) {
      sb.append("null");
    } else {
      sb.append(this.target_fragment_instance_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("target_fragment_instance_addr:");
    if (this.target_fragment_instance_addr == null) {
      sb.append("null");
    } else {
      sb.append(this.target_fragment_instance_addr);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (target_fragment_instance_id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'target_fragment_instance_id' was not present! Struct: " + toString());
    }
    if (target_fragment_instance_addr == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'target_fragment_instance_addr' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (target_fragment_instance_id != null) {
      target_fragment_instance_id.validate();
    }
    if (target_fragment_instance_addr != null) {
      target_fragment_instance_addr.validate();
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

  private static class TRuntimeFilterTargetParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRuntimeFilterTargetParamsStandardScheme getScheme() {
      return new TRuntimeFilterTargetParamsStandardScheme();
    }
  }

  private static class TRuntimeFilterTargetParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TRuntimeFilterTargetParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TRuntimeFilterTargetParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TARGET_FRAGMENT_INSTANCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.target_fragment_instance_id = new org.apache.doris.thrift.TUniqueId();
              struct.target_fragment_instance_id.read(iprot);
              struct.setTargetFragmentInstanceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TARGET_FRAGMENT_INSTANCE_ADDR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.target_fragment_instance_addr = new org.apache.doris.thrift.TNetworkAddress();
              struct.target_fragment_instance_addr.read(iprot);
              struct.setTargetFragmentInstanceAddrIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TRuntimeFilterTargetParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.target_fragment_instance_id != null) {
        oprot.writeFieldBegin(TARGET_FRAGMENT_INSTANCE_ID_FIELD_DESC);
        struct.target_fragment_instance_id.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.target_fragment_instance_addr != null) {
        oprot.writeFieldBegin(TARGET_FRAGMENT_INSTANCE_ADDR_FIELD_DESC);
        struct.target_fragment_instance_addr.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TRuntimeFilterTargetParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRuntimeFilterTargetParamsTupleScheme getScheme() {
      return new TRuntimeFilterTargetParamsTupleScheme();
    }
  }

  private static class TRuntimeFilterTargetParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TRuntimeFilterTargetParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TRuntimeFilterTargetParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.target_fragment_instance_id.write(oprot);
      struct.target_fragment_instance_addr.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TRuntimeFilterTargetParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.target_fragment_instance_id = new org.apache.doris.thrift.TUniqueId();
      struct.target_fragment_instance_id.read(iprot);
      struct.setTargetFragmentInstanceIdIsSet(true);
      struct.target_fragment_instance_addr = new org.apache.doris.thrift.TNetworkAddress();
      struct.target_fragment_instance_addr.read(iprot);
      struct.setTargetFragmentInstanceAddrIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
