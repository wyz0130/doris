/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TJobsMetadataParams implements org.apache.thrift.TBase<TJobsMetadataParams, TJobsMetadataParams._Fields>, java.io.Serializable, Cloneable, Comparable<TJobsMetadataParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TJobsMetadataParams");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CURRENT_USER_IDENT_FIELD_DESC = new org.apache.thrift.protocol.TField("current_user_ident", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TJobsMetadataParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TJobsMetadataParamsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String type; // optional
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUserIdentity current_user_ident; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TYPE((short)1, "type"),
    CURRENT_USER_IDENT((short)2, "current_user_ident");

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
        case 1: // TYPE
          return TYPE;
        case 2: // CURRENT_USER_IDENT
          return CURRENT_USER_IDENT;
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
  private static final _Fields optionals[] = {_Fields.TYPE,_Fields.CURRENT_USER_IDENT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CURRENT_USER_IDENT, new org.apache.thrift.meta_data.FieldMetaData("current_user_ident", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TUserIdentity.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TJobsMetadataParams.class, metaDataMap);
  }

  public TJobsMetadataParams() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TJobsMetadataParams(TJobsMetadataParams other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetCurrentUserIdent()) {
      this.current_user_ident = new org.apache.doris.thrift.TUserIdentity(other.current_user_ident);
    }
  }

  public TJobsMetadataParams deepCopy() {
    return new TJobsMetadataParams(this);
  }

  @Override
  public void clear() {
    this.type = null;
    this.current_user_ident = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getType() {
    return this.type;
  }

  public TJobsMetadataParams setType(@org.apache.thrift.annotation.Nullable java.lang.String type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TUserIdentity getCurrentUserIdent() {
    return this.current_user_ident;
  }

  public TJobsMetadataParams setCurrentUserIdent(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUserIdentity current_user_ident) {
    this.current_user_ident = current_user_ident;
    return this;
  }

  public void unsetCurrentUserIdent() {
    this.current_user_ident = null;
  }

  /** Returns true if field current_user_ident is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrentUserIdent() {
    return this.current_user_ident != null;
  }

  public void setCurrentUserIdentIsSet(boolean value) {
    if (!value) {
      this.current_user_ident = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((java.lang.String)value);
      }
      break;

    case CURRENT_USER_IDENT:
      if (value == null) {
        unsetCurrentUserIdent();
      } else {
        setCurrentUserIdent((org.apache.doris.thrift.TUserIdentity)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case CURRENT_USER_IDENT:
      return getCurrentUserIdent();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case CURRENT_USER_IDENT:
      return isSetCurrentUserIdent();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TJobsMetadataParams)
      return this.equals((TJobsMetadataParams)that);
    return false;
  }

  public boolean equals(TJobsMetadataParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_current_user_ident = true && this.isSetCurrentUserIdent();
    boolean that_present_current_user_ident = true && that.isSetCurrentUserIdent();
    if (this_present_current_user_ident || that_present_current_user_ident) {
      if (!(this_present_current_user_ident && that_present_current_user_ident))
        return false;
      if (!this.current_user_ident.equals(that.current_user_ident))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.hashCode();

    hashCode = hashCode * 8191 + ((isSetCurrentUserIdent()) ? 131071 : 524287);
    if (isSetCurrentUserIdent())
      hashCode = hashCode * 8191 + current_user_ident.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TJobsMetadataParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetType(), other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCurrentUserIdent(), other.isSetCurrentUserIdent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrentUserIdent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.current_user_ident, other.current_user_ident);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TJobsMetadataParams(");
    boolean first = true;

    if (isSetType()) {
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (isSetCurrentUserIdent()) {
      if (!first) sb.append(", ");
      sb.append("current_user_ident:");
      if (this.current_user_ident == null) {
        sb.append("null");
      } else {
        sb.append(this.current_user_ident);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (current_user_ident != null) {
      current_user_ident.validate();
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

  private static class TJobsMetadataParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TJobsMetadataParamsStandardScheme getScheme() {
      return new TJobsMetadataParamsStandardScheme();
    }
  }

  private static class TJobsMetadataParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TJobsMetadataParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TJobsMetadataParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.type = iprot.readString();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CURRENT_USER_IDENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.current_user_ident = new org.apache.doris.thrift.TUserIdentity();
              struct.current_user_ident.read(iprot);
              struct.setCurrentUserIdentIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TJobsMetadataParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeString(struct.type);
          oprot.writeFieldEnd();
        }
      }
      if (struct.current_user_ident != null) {
        if (struct.isSetCurrentUserIdent()) {
          oprot.writeFieldBegin(CURRENT_USER_IDENT_FIELD_DESC);
          struct.current_user_ident.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TJobsMetadataParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TJobsMetadataParamsTupleScheme getScheme() {
      return new TJobsMetadataParamsTupleScheme();
    }
  }

  private static class TJobsMetadataParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TJobsMetadataParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TJobsMetadataParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetCurrentUserIdent()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetType()) {
        oprot.writeString(struct.type);
      }
      if (struct.isSetCurrentUserIdent()) {
        struct.current_user_ident.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TJobsMetadataParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.type = iprot.readString();
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.current_user_ident = new org.apache.doris.thrift.TUserIdentity();
        struct.current_user_ident.read(iprot);
        struct.setCurrentUserIdentIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

