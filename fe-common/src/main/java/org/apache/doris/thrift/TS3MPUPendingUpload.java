/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TS3MPUPendingUpload implements org.apache.thrift.TBase<TS3MPUPendingUpload, TS3MPUPendingUpload._Fields>, java.io.Serializable, Cloneable, Comparable<TS3MPUPendingUpload> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TS3MPUPendingUpload");

  private static final org.apache.thrift.protocol.TField BUCKET_FIELD_DESC = new org.apache.thrift.protocol.TField("bucket", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField UPLOAD_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("upload_id", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ETAGS_FIELD_DESC = new org.apache.thrift.protocol.TField("etags", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TS3MPUPendingUploadStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TS3MPUPendingUploadTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String bucket; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String key; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String upload_id; // optional
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Integer,java.lang.String> etags; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BUCKET((short)1, "bucket"),
    KEY((short)2, "key"),
    UPLOAD_ID((short)3, "upload_id"),
    ETAGS((short)4, "etags");

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
        case 1: // BUCKET
          return BUCKET;
        case 2: // KEY
          return KEY;
        case 3: // UPLOAD_ID
          return UPLOAD_ID;
        case 4: // ETAGS
          return ETAGS;
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
  private static final _Fields optionals[] = {_Fields.BUCKET,_Fields.KEY,_Fields.UPLOAD_ID,_Fields.ETAGS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BUCKET, new org.apache.thrift.meta_data.FieldMetaData("bucket", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.KEY, new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UPLOAD_ID, new org.apache.thrift.meta_data.FieldMetaData("upload_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ETAGS, new org.apache.thrift.meta_data.FieldMetaData("etags", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TS3MPUPendingUpload.class, metaDataMap);
  }

  public TS3MPUPendingUpload() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TS3MPUPendingUpload(TS3MPUPendingUpload other) {
    if (other.isSetBucket()) {
      this.bucket = other.bucket;
    }
    if (other.isSetKey()) {
      this.key = other.key;
    }
    if (other.isSetUploadId()) {
      this.upload_id = other.upload_id;
    }
    if (other.isSetEtags()) {
      java.util.Map<java.lang.Integer,java.lang.String> __this__etags = new java.util.HashMap<java.lang.Integer,java.lang.String>(other.etags);
      this.etags = __this__etags;
    }
  }

  public TS3MPUPendingUpload deepCopy() {
    return new TS3MPUPendingUpload(this);
  }

  @Override
  public void clear() {
    this.bucket = null;
    this.key = null;
    this.upload_id = null;
    this.etags = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getBucket() {
    return this.bucket;
  }

  public TS3MPUPendingUpload setBucket(@org.apache.thrift.annotation.Nullable java.lang.String bucket) {
    this.bucket = bucket;
    return this;
  }

  public void unsetBucket() {
    this.bucket = null;
  }

  /** Returns true if field bucket is set (has been assigned a value) and false otherwise */
  public boolean isSetBucket() {
    return this.bucket != null;
  }

  public void setBucketIsSet(boolean value) {
    if (!value) {
      this.bucket = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getKey() {
    return this.key;
  }

  public TS3MPUPendingUpload setKey(@org.apache.thrift.annotation.Nullable java.lang.String key) {
    this.key = key;
    return this;
  }

  public void unsetKey() {
    this.key = null;
  }

  /** Returns true if field key is set (has been assigned a value) and false otherwise */
  public boolean isSetKey() {
    return this.key != null;
  }

  public void setKeyIsSet(boolean value) {
    if (!value) {
      this.key = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getUploadId() {
    return this.upload_id;
  }

  public TS3MPUPendingUpload setUploadId(@org.apache.thrift.annotation.Nullable java.lang.String upload_id) {
    this.upload_id = upload_id;
    return this;
  }

  public void unsetUploadId() {
    this.upload_id = null;
  }

  /** Returns true if field upload_id is set (has been assigned a value) and false otherwise */
  public boolean isSetUploadId() {
    return this.upload_id != null;
  }

  public void setUploadIdIsSet(boolean value) {
    if (!value) {
      this.upload_id = null;
    }
  }

  public int getEtagsSize() {
    return (this.etags == null) ? 0 : this.etags.size();
  }

  public void putToEtags(int key, java.lang.String val) {
    if (this.etags == null) {
      this.etags = new java.util.HashMap<java.lang.Integer,java.lang.String>();
    }
    this.etags.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.Integer,java.lang.String> getEtags() {
    return this.etags;
  }

  public TS3MPUPendingUpload setEtags(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.Integer,java.lang.String> etags) {
    this.etags = etags;
    return this;
  }

  public void unsetEtags() {
    this.etags = null;
  }

  /** Returns true if field etags is set (has been assigned a value) and false otherwise */
  public boolean isSetEtags() {
    return this.etags != null;
  }

  public void setEtagsIsSet(boolean value) {
    if (!value) {
      this.etags = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case BUCKET:
      if (value == null) {
        unsetBucket();
      } else {
        setBucket((java.lang.String)value);
      }
      break;

    case KEY:
      if (value == null) {
        unsetKey();
      } else {
        setKey((java.lang.String)value);
      }
      break;

    case UPLOAD_ID:
      if (value == null) {
        unsetUploadId();
      } else {
        setUploadId((java.lang.String)value);
      }
      break;

    case ETAGS:
      if (value == null) {
        unsetEtags();
      } else {
        setEtags((java.util.Map<java.lang.Integer,java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case BUCKET:
      return getBucket();

    case KEY:
      return getKey();

    case UPLOAD_ID:
      return getUploadId();

    case ETAGS:
      return getEtags();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case BUCKET:
      return isSetBucket();
    case KEY:
      return isSetKey();
    case UPLOAD_ID:
      return isSetUploadId();
    case ETAGS:
      return isSetEtags();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TS3MPUPendingUpload)
      return this.equals((TS3MPUPendingUpload)that);
    return false;
  }

  public boolean equals(TS3MPUPendingUpload that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_bucket = true && this.isSetBucket();
    boolean that_present_bucket = true && that.isSetBucket();
    if (this_present_bucket || that_present_bucket) {
      if (!(this_present_bucket && that_present_bucket))
        return false;
      if (!this.bucket.equals(that.bucket))
        return false;
    }

    boolean this_present_key = true && this.isSetKey();
    boolean that_present_key = true && that.isSetKey();
    if (this_present_key || that_present_key) {
      if (!(this_present_key && that_present_key))
        return false;
      if (!this.key.equals(that.key))
        return false;
    }

    boolean this_present_upload_id = true && this.isSetUploadId();
    boolean that_present_upload_id = true && that.isSetUploadId();
    if (this_present_upload_id || that_present_upload_id) {
      if (!(this_present_upload_id && that_present_upload_id))
        return false;
      if (!this.upload_id.equals(that.upload_id))
        return false;
    }

    boolean this_present_etags = true && this.isSetEtags();
    boolean that_present_etags = true && that.isSetEtags();
    if (this_present_etags || that_present_etags) {
      if (!(this_present_etags && that_present_etags))
        return false;
      if (!this.etags.equals(that.etags))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetBucket()) ? 131071 : 524287);
    if (isSetBucket())
      hashCode = hashCode * 8191 + bucket.hashCode();

    hashCode = hashCode * 8191 + ((isSetKey()) ? 131071 : 524287);
    if (isSetKey())
      hashCode = hashCode * 8191 + key.hashCode();

    hashCode = hashCode * 8191 + ((isSetUploadId()) ? 131071 : 524287);
    if (isSetUploadId())
      hashCode = hashCode * 8191 + upload_id.hashCode();

    hashCode = hashCode * 8191 + ((isSetEtags()) ? 131071 : 524287);
    if (isSetEtags())
      hashCode = hashCode * 8191 + etags.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TS3MPUPendingUpload other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetBucket(), other.isSetBucket());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBucket()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bucket, other.bucket);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetKey(), other.isSetKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key, other.key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetUploadId(), other.isSetUploadId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUploadId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.upload_id, other.upload_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEtags(), other.isSetEtags());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEtags()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.etags, other.etags);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TS3MPUPendingUpload(");
    boolean first = true;

    if (isSetBucket()) {
      sb.append("bucket:");
      if (this.bucket == null) {
        sb.append("null");
      } else {
        sb.append(this.bucket);
      }
      first = false;
    }
    if (isSetKey()) {
      if (!first) sb.append(", ");
      sb.append("key:");
      if (this.key == null) {
        sb.append("null");
      } else {
        sb.append(this.key);
      }
      first = false;
    }
    if (isSetUploadId()) {
      if (!first) sb.append(", ");
      sb.append("upload_id:");
      if (this.upload_id == null) {
        sb.append("null");
      } else {
        sb.append(this.upload_id);
      }
      first = false;
    }
    if (isSetEtags()) {
      if (!first) sb.append(", ");
      sb.append("etags:");
      if (this.etags == null) {
        sb.append("null");
      } else {
        sb.append(this.etags);
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

  private static class TS3MPUPendingUploadStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TS3MPUPendingUploadStandardScheme getScheme() {
      return new TS3MPUPendingUploadStandardScheme();
    }
  }

  private static class TS3MPUPendingUploadStandardScheme extends org.apache.thrift.scheme.StandardScheme<TS3MPUPendingUpload> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TS3MPUPendingUpload struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BUCKET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.bucket = iprot.readString();
              struct.setBucketIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.key = iprot.readString();
              struct.setKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UPLOAD_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.upload_id = iprot.readString();
              struct.setUploadIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ETAGS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map176 = iprot.readMapBegin();
                struct.etags = new java.util.HashMap<java.lang.Integer,java.lang.String>(2*_map176.size);
                int _key177;
                @org.apache.thrift.annotation.Nullable java.lang.String _val178;
                for (int _i179 = 0; _i179 < _map176.size; ++_i179)
                {
                  _key177 = iprot.readI32();
                  _val178 = iprot.readString();
                  struct.etags.put(_key177, _val178);
                }
                iprot.readMapEnd();
              }
              struct.setEtagsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TS3MPUPendingUpload struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.bucket != null) {
        if (struct.isSetBucket()) {
          oprot.writeFieldBegin(BUCKET_FIELD_DESC);
          oprot.writeString(struct.bucket);
          oprot.writeFieldEnd();
        }
      }
      if (struct.key != null) {
        if (struct.isSetKey()) {
          oprot.writeFieldBegin(KEY_FIELD_DESC);
          oprot.writeString(struct.key);
          oprot.writeFieldEnd();
        }
      }
      if (struct.upload_id != null) {
        if (struct.isSetUploadId()) {
          oprot.writeFieldBegin(UPLOAD_ID_FIELD_DESC);
          oprot.writeString(struct.upload_id);
          oprot.writeFieldEnd();
        }
      }
      if (struct.etags != null) {
        if (struct.isSetEtags()) {
          oprot.writeFieldBegin(ETAGS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, struct.etags.size()));
            for (java.util.Map.Entry<java.lang.Integer, java.lang.String> _iter180 : struct.etags.entrySet())
            {
              oprot.writeI32(_iter180.getKey());
              oprot.writeString(_iter180.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TS3MPUPendingUploadTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TS3MPUPendingUploadTupleScheme getScheme() {
      return new TS3MPUPendingUploadTupleScheme();
    }
  }

  private static class TS3MPUPendingUploadTupleScheme extends org.apache.thrift.scheme.TupleScheme<TS3MPUPendingUpload> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TS3MPUPendingUpload struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetBucket()) {
        optionals.set(0);
      }
      if (struct.isSetKey()) {
        optionals.set(1);
      }
      if (struct.isSetUploadId()) {
        optionals.set(2);
      }
      if (struct.isSetEtags()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetBucket()) {
        oprot.writeString(struct.bucket);
      }
      if (struct.isSetKey()) {
        oprot.writeString(struct.key);
      }
      if (struct.isSetUploadId()) {
        oprot.writeString(struct.upload_id);
      }
      if (struct.isSetEtags()) {
        {
          oprot.writeI32(struct.etags.size());
          for (java.util.Map.Entry<java.lang.Integer, java.lang.String> _iter181 : struct.etags.entrySet())
          {
            oprot.writeI32(_iter181.getKey());
            oprot.writeString(_iter181.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TS3MPUPendingUpload struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.bucket = iprot.readString();
        struct.setBucketIsSet(true);
      }
      if (incoming.get(1)) {
        struct.key = iprot.readString();
        struct.setKeyIsSet(true);
      }
      if (incoming.get(2)) {
        struct.upload_id = iprot.readString();
        struct.setUploadIdIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TMap _map182 = iprot.readMapBegin(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING); 
          struct.etags = new java.util.HashMap<java.lang.Integer,java.lang.String>(2*_map182.size);
          int _key183;
          @org.apache.thrift.annotation.Nullable java.lang.String _val184;
          for (int _i185 = 0; _i185 < _map182.size; ++_i185)
          {
            _key183 = iprot.readI32();
            _val184 = iprot.readString();
            struct.etags.put(_key183, _val184);
          }
        }
        struct.setEtagsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
