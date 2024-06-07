/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TTxnCommitAttachment implements org.apache.thrift.TBase<TTxnCommitAttachment, TTxnCommitAttachment._Fields>, java.io.Serializable, Cloneable, Comparable<TTxnCommitAttachment> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTxnCommitAttachment");

  private static final org.apache.thrift.protocol.TField LOAD_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("loadType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField RL_TASK_TXN_COMMIT_ATTACHMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("rlTaskTxnCommitAttachment", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTxnCommitAttachmentStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTxnCommitAttachmentTupleSchemeFactory();

  /**
   * 
   * @see org.apache.doris.thrift.TLoadType
   */
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TLoadType loadType; // required
  public @org.apache.thrift.annotation.Nullable TRLTaskTxnCommitAttachment rlTaskTxnCommitAttachment; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see org.apache.doris.thrift.TLoadType
     */
    LOAD_TYPE((short)1, "loadType"),
    RL_TASK_TXN_COMMIT_ATTACHMENT((short)2, "rlTaskTxnCommitAttachment");

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
        case 1: // LOAD_TYPE
          return LOAD_TYPE;
        case 2: // RL_TASK_TXN_COMMIT_ATTACHMENT
          return RL_TASK_TXN_COMMIT_ATTACHMENT;
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
  private static final _Fields optionals[] = {_Fields.RL_TASK_TXN_COMMIT_ATTACHMENT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOAD_TYPE, new org.apache.thrift.meta_data.FieldMetaData("loadType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.doris.thrift.TLoadType.class)));
    tmpMap.put(_Fields.RL_TASK_TXN_COMMIT_ATTACHMENT, new org.apache.thrift.meta_data.FieldMetaData("rlTaskTxnCommitAttachment", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TRLTaskTxnCommitAttachment.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTxnCommitAttachment.class, metaDataMap);
  }

  public TTxnCommitAttachment() {
  }

  public TTxnCommitAttachment(
    org.apache.doris.thrift.TLoadType loadType)
  {
    this();
    this.loadType = loadType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTxnCommitAttachment(TTxnCommitAttachment other) {
    if (other.isSetLoadType()) {
      this.loadType = other.loadType;
    }
    if (other.isSetRlTaskTxnCommitAttachment()) {
      this.rlTaskTxnCommitAttachment = new TRLTaskTxnCommitAttachment(other.rlTaskTxnCommitAttachment);
    }
  }

  public TTxnCommitAttachment deepCopy() {
    return new TTxnCommitAttachment(this);
  }

  @Override
  public void clear() {
    this.loadType = null;
    this.rlTaskTxnCommitAttachment = null;
  }

  /**
   * 
   * @see org.apache.doris.thrift.TLoadType
   */
  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TLoadType getLoadType() {
    return this.loadType;
  }

  /**
   * 
   * @see org.apache.doris.thrift.TLoadType
   */
  public TTxnCommitAttachment setLoadType(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TLoadType loadType) {
    this.loadType = loadType;
    return this;
  }

  public void unsetLoadType() {
    this.loadType = null;
  }

  /** Returns true if field loadType is set (has been assigned a value) and false otherwise */
  public boolean isSetLoadType() {
    return this.loadType != null;
  }

  public void setLoadTypeIsSet(boolean value) {
    if (!value) {
      this.loadType = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TRLTaskTxnCommitAttachment getRlTaskTxnCommitAttachment() {
    return this.rlTaskTxnCommitAttachment;
  }

  public TTxnCommitAttachment setRlTaskTxnCommitAttachment(@org.apache.thrift.annotation.Nullable TRLTaskTxnCommitAttachment rlTaskTxnCommitAttachment) {
    this.rlTaskTxnCommitAttachment = rlTaskTxnCommitAttachment;
    return this;
  }

  public void unsetRlTaskTxnCommitAttachment() {
    this.rlTaskTxnCommitAttachment = null;
  }

  /** Returns true if field rlTaskTxnCommitAttachment is set (has been assigned a value) and false otherwise */
  public boolean isSetRlTaskTxnCommitAttachment() {
    return this.rlTaskTxnCommitAttachment != null;
  }

  public void setRlTaskTxnCommitAttachmentIsSet(boolean value) {
    if (!value) {
      this.rlTaskTxnCommitAttachment = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case LOAD_TYPE:
      if (value == null) {
        unsetLoadType();
      } else {
        setLoadType((org.apache.doris.thrift.TLoadType)value);
      }
      break;

    case RL_TASK_TXN_COMMIT_ATTACHMENT:
      if (value == null) {
        unsetRlTaskTxnCommitAttachment();
      } else {
        setRlTaskTxnCommitAttachment((TRLTaskTxnCommitAttachment)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case LOAD_TYPE:
      return getLoadType();

    case RL_TASK_TXN_COMMIT_ATTACHMENT:
      return getRlTaskTxnCommitAttachment();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case LOAD_TYPE:
      return isSetLoadType();
    case RL_TASK_TXN_COMMIT_ATTACHMENT:
      return isSetRlTaskTxnCommitAttachment();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TTxnCommitAttachment)
      return this.equals((TTxnCommitAttachment)that);
    return false;
  }

  public boolean equals(TTxnCommitAttachment that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_loadType = true && this.isSetLoadType();
    boolean that_present_loadType = true && that.isSetLoadType();
    if (this_present_loadType || that_present_loadType) {
      if (!(this_present_loadType && that_present_loadType))
        return false;
      if (!this.loadType.equals(that.loadType))
        return false;
    }

    boolean this_present_rlTaskTxnCommitAttachment = true && this.isSetRlTaskTxnCommitAttachment();
    boolean that_present_rlTaskTxnCommitAttachment = true && that.isSetRlTaskTxnCommitAttachment();
    if (this_present_rlTaskTxnCommitAttachment || that_present_rlTaskTxnCommitAttachment) {
      if (!(this_present_rlTaskTxnCommitAttachment && that_present_rlTaskTxnCommitAttachment))
        return false;
      if (!this.rlTaskTxnCommitAttachment.equals(that.rlTaskTxnCommitAttachment))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetLoadType()) ? 131071 : 524287);
    if (isSetLoadType())
      hashCode = hashCode * 8191 + loadType.getValue();

    hashCode = hashCode * 8191 + ((isSetRlTaskTxnCommitAttachment()) ? 131071 : 524287);
    if (isSetRlTaskTxnCommitAttachment())
      hashCode = hashCode * 8191 + rlTaskTxnCommitAttachment.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TTxnCommitAttachment other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetLoadType(), other.isSetLoadType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoadType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.loadType, other.loadType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRlTaskTxnCommitAttachment(), other.isSetRlTaskTxnCommitAttachment());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRlTaskTxnCommitAttachment()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rlTaskTxnCommitAttachment, other.rlTaskTxnCommitAttachment);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TTxnCommitAttachment(");
    boolean first = true;

    sb.append("loadType:");
    if (this.loadType == null) {
      sb.append("null");
    } else {
      sb.append(this.loadType);
    }
    first = false;
    if (isSetRlTaskTxnCommitAttachment()) {
      if (!first) sb.append(", ");
      sb.append("rlTaskTxnCommitAttachment:");
      if (this.rlTaskTxnCommitAttachment == null) {
        sb.append("null");
      } else {
        sb.append(this.rlTaskTxnCommitAttachment);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (loadType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'loadType' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (rlTaskTxnCommitAttachment != null) {
      rlTaskTxnCommitAttachment.validate();
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

  private static class TTxnCommitAttachmentStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTxnCommitAttachmentStandardScheme getScheme() {
      return new TTxnCommitAttachmentStandardScheme();
    }
  }

  private static class TTxnCommitAttachmentStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTxnCommitAttachment> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTxnCommitAttachment struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOAD_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.loadType = org.apache.doris.thrift.TLoadType.findByValue(iprot.readI32());
              struct.setLoadTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RL_TASK_TXN_COMMIT_ATTACHMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.rlTaskTxnCommitAttachment = new TRLTaskTxnCommitAttachment();
              struct.rlTaskTxnCommitAttachment.read(iprot);
              struct.setRlTaskTxnCommitAttachmentIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTxnCommitAttachment struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.loadType != null) {
        oprot.writeFieldBegin(LOAD_TYPE_FIELD_DESC);
        oprot.writeI32(struct.loadType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.rlTaskTxnCommitAttachment != null) {
        if (struct.isSetRlTaskTxnCommitAttachment()) {
          oprot.writeFieldBegin(RL_TASK_TXN_COMMIT_ATTACHMENT_FIELD_DESC);
          struct.rlTaskTxnCommitAttachment.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTxnCommitAttachmentTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTxnCommitAttachmentTupleScheme getScheme() {
      return new TTxnCommitAttachmentTupleScheme();
    }
  }

  private static class TTxnCommitAttachmentTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTxnCommitAttachment> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTxnCommitAttachment struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.loadType.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetRlTaskTxnCommitAttachment()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetRlTaskTxnCommitAttachment()) {
        struct.rlTaskTxnCommitAttachment.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTxnCommitAttachment struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.loadType = org.apache.doris.thrift.TLoadType.findByValue(iprot.readI32());
      struct.setLoadTypeIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.rlTaskTxnCommitAttachment = new TRLTaskTxnCommitAttachment();
        struct.rlTaskTxnCommitAttachment.read(iprot);
        struct.setRlTaskTxnCommitAttachmentIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

