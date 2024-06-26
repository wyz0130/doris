/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class THiveLocationParams implements org.apache.thrift.TBase<THiveLocationParams, THiveLocationParams._Fields>, java.io.Serializable, Cloneable, Comparable<THiveLocationParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("THiveLocationParams");

  private static final org.apache.thrift.protocol.TField WRITE_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("write_path", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TARGET_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("target_path", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField FILE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("file_type", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField ORIGINAL_WRITE_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("original_write_path", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new THiveLocationParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new THiveLocationParamsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String write_path; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String target_path; // optional
  /**
   * 
   * @see org.apache.doris.thrift.TFileType
   */
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TFileType file_type; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String original_write_path; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    WRITE_PATH((short)1, "write_path"),
    TARGET_PATH((short)2, "target_path"),
    /**
     * 
     * @see org.apache.doris.thrift.TFileType
     */
    FILE_TYPE((short)3, "file_type"),
    ORIGINAL_WRITE_PATH((short)4, "original_write_path");

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
        case 1: // WRITE_PATH
          return WRITE_PATH;
        case 2: // TARGET_PATH
          return TARGET_PATH;
        case 3: // FILE_TYPE
          return FILE_TYPE;
        case 4: // ORIGINAL_WRITE_PATH
          return ORIGINAL_WRITE_PATH;
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
  private static final _Fields optionals[] = {_Fields.WRITE_PATH,_Fields.TARGET_PATH,_Fields.FILE_TYPE,_Fields.ORIGINAL_WRITE_PATH};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WRITE_PATH, new org.apache.thrift.meta_data.FieldMetaData("write_path", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TARGET_PATH, new org.apache.thrift.meta_data.FieldMetaData("target_path", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FILE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("file_type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.doris.thrift.TFileType.class)));
    tmpMap.put(_Fields.ORIGINAL_WRITE_PATH, new org.apache.thrift.meta_data.FieldMetaData("original_write_path", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(THiveLocationParams.class, metaDataMap);
  }

  public THiveLocationParams() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public THiveLocationParams(THiveLocationParams other) {
    if (other.isSetWritePath()) {
      this.write_path = other.write_path;
    }
    if (other.isSetTargetPath()) {
      this.target_path = other.target_path;
    }
    if (other.isSetFileType()) {
      this.file_type = other.file_type;
    }
    if (other.isSetOriginalWritePath()) {
      this.original_write_path = other.original_write_path;
    }
  }

  public THiveLocationParams deepCopy() {
    return new THiveLocationParams(this);
  }

  @Override
  public void clear() {
    this.write_path = null;
    this.target_path = null;
    this.file_type = null;
    this.original_write_path = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getWritePath() {
    return this.write_path;
  }

  public THiveLocationParams setWritePath(@org.apache.thrift.annotation.Nullable java.lang.String write_path) {
    this.write_path = write_path;
    return this;
  }

  public void unsetWritePath() {
    this.write_path = null;
  }

  /** Returns true if field write_path is set (has been assigned a value) and false otherwise */
  public boolean isSetWritePath() {
    return this.write_path != null;
  }

  public void setWritePathIsSet(boolean value) {
    if (!value) {
      this.write_path = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTargetPath() {
    return this.target_path;
  }

  public THiveLocationParams setTargetPath(@org.apache.thrift.annotation.Nullable java.lang.String target_path) {
    this.target_path = target_path;
    return this;
  }

  public void unsetTargetPath() {
    this.target_path = null;
  }

  /** Returns true if field target_path is set (has been assigned a value) and false otherwise */
  public boolean isSetTargetPath() {
    return this.target_path != null;
  }

  public void setTargetPathIsSet(boolean value) {
    if (!value) {
      this.target_path = null;
    }
  }

  /**
   * 
   * @see org.apache.doris.thrift.TFileType
   */
  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TFileType getFileType() {
    return this.file_type;
  }

  /**
   * 
   * @see org.apache.doris.thrift.TFileType
   */
  public THiveLocationParams setFileType(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TFileType file_type) {
    this.file_type = file_type;
    return this;
  }

  public void unsetFileType() {
    this.file_type = null;
  }

  /** Returns true if field file_type is set (has been assigned a value) and false otherwise */
  public boolean isSetFileType() {
    return this.file_type != null;
  }

  public void setFileTypeIsSet(boolean value) {
    if (!value) {
      this.file_type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getOriginalWritePath() {
    return this.original_write_path;
  }

  public THiveLocationParams setOriginalWritePath(@org.apache.thrift.annotation.Nullable java.lang.String original_write_path) {
    this.original_write_path = original_write_path;
    return this;
  }

  public void unsetOriginalWritePath() {
    this.original_write_path = null;
  }

  /** Returns true if field original_write_path is set (has been assigned a value) and false otherwise */
  public boolean isSetOriginalWritePath() {
    return this.original_write_path != null;
  }

  public void setOriginalWritePathIsSet(boolean value) {
    if (!value) {
      this.original_write_path = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case WRITE_PATH:
      if (value == null) {
        unsetWritePath();
      } else {
        setWritePath((java.lang.String)value);
      }
      break;

    case TARGET_PATH:
      if (value == null) {
        unsetTargetPath();
      } else {
        setTargetPath((java.lang.String)value);
      }
      break;

    case FILE_TYPE:
      if (value == null) {
        unsetFileType();
      } else {
        setFileType((org.apache.doris.thrift.TFileType)value);
      }
      break;

    case ORIGINAL_WRITE_PATH:
      if (value == null) {
        unsetOriginalWritePath();
      } else {
        setOriginalWritePath((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case WRITE_PATH:
      return getWritePath();

    case TARGET_PATH:
      return getTargetPath();

    case FILE_TYPE:
      return getFileType();

    case ORIGINAL_WRITE_PATH:
      return getOriginalWritePath();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case WRITE_PATH:
      return isSetWritePath();
    case TARGET_PATH:
      return isSetTargetPath();
    case FILE_TYPE:
      return isSetFileType();
    case ORIGINAL_WRITE_PATH:
      return isSetOriginalWritePath();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof THiveLocationParams)
      return this.equals((THiveLocationParams)that);
    return false;
  }

  public boolean equals(THiveLocationParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_write_path = true && this.isSetWritePath();
    boolean that_present_write_path = true && that.isSetWritePath();
    if (this_present_write_path || that_present_write_path) {
      if (!(this_present_write_path && that_present_write_path))
        return false;
      if (!this.write_path.equals(that.write_path))
        return false;
    }

    boolean this_present_target_path = true && this.isSetTargetPath();
    boolean that_present_target_path = true && that.isSetTargetPath();
    if (this_present_target_path || that_present_target_path) {
      if (!(this_present_target_path && that_present_target_path))
        return false;
      if (!this.target_path.equals(that.target_path))
        return false;
    }

    boolean this_present_file_type = true && this.isSetFileType();
    boolean that_present_file_type = true && that.isSetFileType();
    if (this_present_file_type || that_present_file_type) {
      if (!(this_present_file_type && that_present_file_type))
        return false;
      if (!this.file_type.equals(that.file_type))
        return false;
    }

    boolean this_present_original_write_path = true && this.isSetOriginalWritePath();
    boolean that_present_original_write_path = true && that.isSetOriginalWritePath();
    if (this_present_original_write_path || that_present_original_write_path) {
      if (!(this_present_original_write_path && that_present_original_write_path))
        return false;
      if (!this.original_write_path.equals(that.original_write_path))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetWritePath()) ? 131071 : 524287);
    if (isSetWritePath())
      hashCode = hashCode * 8191 + write_path.hashCode();

    hashCode = hashCode * 8191 + ((isSetTargetPath()) ? 131071 : 524287);
    if (isSetTargetPath())
      hashCode = hashCode * 8191 + target_path.hashCode();

    hashCode = hashCode * 8191 + ((isSetFileType()) ? 131071 : 524287);
    if (isSetFileType())
      hashCode = hashCode * 8191 + file_type.getValue();

    hashCode = hashCode * 8191 + ((isSetOriginalWritePath()) ? 131071 : 524287);
    if (isSetOriginalWritePath())
      hashCode = hashCode * 8191 + original_write_path.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(THiveLocationParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetWritePath(), other.isSetWritePath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWritePath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.write_path, other.write_path);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTargetPath(), other.isSetTargetPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTargetPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.target_path, other.target_path);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetFileType(), other.isSetFileType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFileType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.file_type, other.file_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetOriginalWritePath(), other.isSetOriginalWritePath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOriginalWritePath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.original_write_path, other.original_write_path);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("THiveLocationParams(");
    boolean first = true;

    if (isSetWritePath()) {
      sb.append("write_path:");
      if (this.write_path == null) {
        sb.append("null");
      } else {
        sb.append(this.write_path);
      }
      first = false;
    }
    if (isSetTargetPath()) {
      if (!first) sb.append(", ");
      sb.append("target_path:");
      if (this.target_path == null) {
        sb.append("null");
      } else {
        sb.append(this.target_path);
      }
      first = false;
    }
    if (isSetFileType()) {
      if (!first) sb.append(", ");
      sb.append("file_type:");
      if (this.file_type == null) {
        sb.append("null");
      } else {
        sb.append(this.file_type);
      }
      first = false;
    }
    if (isSetOriginalWritePath()) {
      if (!first) sb.append(", ");
      sb.append("original_write_path:");
      if (this.original_write_path == null) {
        sb.append("null");
      } else {
        sb.append(this.original_write_path);
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

  private static class THiveLocationParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public THiveLocationParamsStandardScheme getScheme() {
      return new THiveLocationParamsStandardScheme();
    }
  }

  private static class THiveLocationParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<THiveLocationParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, THiveLocationParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // WRITE_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.write_path = iprot.readString();
              struct.setWritePathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TARGET_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.target_path = iprot.readString();
              struct.setTargetPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FILE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.file_type = org.apache.doris.thrift.TFileType.findByValue(iprot.readI32());
              struct.setFileTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ORIGINAL_WRITE_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.original_write_path = iprot.readString();
              struct.setOriginalWritePathIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, THiveLocationParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.write_path != null) {
        if (struct.isSetWritePath()) {
          oprot.writeFieldBegin(WRITE_PATH_FIELD_DESC);
          oprot.writeString(struct.write_path);
          oprot.writeFieldEnd();
        }
      }
      if (struct.target_path != null) {
        if (struct.isSetTargetPath()) {
          oprot.writeFieldBegin(TARGET_PATH_FIELD_DESC);
          oprot.writeString(struct.target_path);
          oprot.writeFieldEnd();
        }
      }
      if (struct.file_type != null) {
        if (struct.isSetFileType()) {
          oprot.writeFieldBegin(FILE_TYPE_FIELD_DESC);
          oprot.writeI32(struct.file_type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.original_write_path != null) {
        if (struct.isSetOriginalWritePath()) {
          oprot.writeFieldBegin(ORIGINAL_WRITE_PATH_FIELD_DESC);
          oprot.writeString(struct.original_write_path);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class THiveLocationParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public THiveLocationParamsTupleScheme getScheme() {
      return new THiveLocationParamsTupleScheme();
    }
  }

  private static class THiveLocationParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<THiveLocationParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, THiveLocationParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetWritePath()) {
        optionals.set(0);
      }
      if (struct.isSetTargetPath()) {
        optionals.set(1);
      }
      if (struct.isSetFileType()) {
        optionals.set(2);
      }
      if (struct.isSetOriginalWritePath()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetWritePath()) {
        oprot.writeString(struct.write_path);
      }
      if (struct.isSetTargetPath()) {
        oprot.writeString(struct.target_path);
      }
      if (struct.isSetFileType()) {
        oprot.writeI32(struct.file_type.getValue());
      }
      if (struct.isSetOriginalWritePath()) {
        oprot.writeString(struct.original_write_path);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, THiveLocationParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.write_path = iprot.readString();
        struct.setWritePathIsSet(true);
      }
      if (incoming.get(1)) {
        struct.target_path = iprot.readString();
        struct.setTargetPathIsSet(true);
      }
      if (incoming.get(2)) {
        struct.file_type = org.apache.doris.thrift.TFileType.findByValue(iprot.readI32());
        struct.setFileTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.original_write_path = iprot.readString();
        struct.setOriginalWritePathIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

