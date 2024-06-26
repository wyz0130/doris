/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TGetMetaResult implements org.apache.thrift.TBase<TGetMetaResult, TGetMetaResult._Fields>, java.io.Serializable, Cloneable, Comparable<TGetMetaResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetMetaResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField DB_META_FIELD_DESC = new org.apache.thrift.protocol.TField("db_meta", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField MASTER_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("master_address", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TGetMetaResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TGetMetaResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status; // required
  public @org.apache.thrift.annotation.Nullable TGetMetaDBMeta db_meta; // optional
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TNetworkAddress master_address; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    DB_META((short)2, "db_meta"),
    MASTER_ADDRESS((short)3, "master_address");

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
        case 2: // DB_META
          return DB_META;
        case 3: // MASTER_ADDRESS
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
  private static final _Fields optionals[] = {_Fields.DB_META,_Fields.MASTER_ADDRESS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TStatus.class)));
    tmpMap.put(_Fields.DB_META, new org.apache.thrift.meta_data.FieldMetaData("db_meta", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TGetMetaDBMeta.class)));
    tmpMap.put(_Fields.MASTER_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("master_address", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TNetworkAddress.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetMetaResult.class, metaDataMap);
  }

  public TGetMetaResult() {
  }

  public TGetMetaResult(
    org.apache.doris.thrift.TStatus status)
  {
    this();
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetMetaResult(TGetMetaResult other) {
    if (other.isSetStatus()) {
      this.status = new org.apache.doris.thrift.TStatus(other.status);
    }
    if (other.isSetDbMeta()) {
      this.db_meta = new TGetMetaDBMeta(other.db_meta);
    }
    if (other.isSetMasterAddress()) {
      this.master_address = new org.apache.doris.thrift.TNetworkAddress(other.master_address);
    }
  }

  public TGetMetaResult deepCopy() {
    return new TGetMetaResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.db_meta = null;
    this.master_address = null;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TStatus getStatus() {
    return this.status;
  }

  public TGetMetaResult setStatus(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status) {
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
  public TGetMetaDBMeta getDbMeta() {
    return this.db_meta;
  }

  public TGetMetaResult setDbMeta(@org.apache.thrift.annotation.Nullable TGetMetaDBMeta db_meta) {
    this.db_meta = db_meta;
    return this;
  }

  public void unsetDbMeta() {
    this.db_meta = null;
  }

  /** Returns true if field db_meta is set (has been assigned a value) and false otherwise */
  public boolean isSetDbMeta() {
    return this.db_meta != null;
  }

  public void setDbMetaIsSet(boolean value) {
    if (!value) {
      this.db_meta = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TNetworkAddress getMasterAddress() {
    return this.master_address;
  }

  public TGetMetaResult setMasterAddress(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TNetworkAddress master_address) {
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

    case DB_META:
      if (value == null) {
        unsetDbMeta();
      } else {
        setDbMeta((TGetMetaDBMeta)value);
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

    case DB_META:
      return getDbMeta();

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
    case DB_META:
      return isSetDbMeta();
    case MASTER_ADDRESS:
      return isSetMasterAddress();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TGetMetaResult)
      return this.equals((TGetMetaResult)that);
    return false;
  }

  public boolean equals(TGetMetaResult that) {
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

    boolean this_present_db_meta = true && this.isSetDbMeta();
    boolean that_present_db_meta = true && that.isSetDbMeta();
    if (this_present_db_meta || that_present_db_meta) {
      if (!(this_present_db_meta && that_present_db_meta))
        return false;
      if (!this.db_meta.equals(that.db_meta))
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

    hashCode = hashCode * 8191 + ((isSetDbMeta()) ? 131071 : 524287);
    if (isSetDbMeta())
      hashCode = hashCode * 8191 + db_meta.hashCode();

    hashCode = hashCode * 8191 + ((isSetMasterAddress()) ? 131071 : 524287);
    if (isSetMasterAddress())
      hashCode = hashCode * 8191 + master_address.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TGetMetaResult other) {
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
    lastComparison = java.lang.Boolean.compare(isSetDbMeta(), other.isSetDbMeta());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbMeta()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.db_meta, other.db_meta);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TGetMetaResult(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (isSetDbMeta()) {
      if (!first) sb.append(", ");
      sb.append("db_meta:");
      if (this.db_meta == null) {
        sb.append("null");
      } else {
        sb.append(this.db_meta);
      }
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
    if (status == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (status != null) {
      status.validate();
    }
    if (db_meta != null) {
      db_meta.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TGetMetaResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetMetaResultStandardScheme getScheme() {
      return new TGetMetaResultStandardScheme();
    }
  }

  private static class TGetMetaResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TGetMetaResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetMetaResult struct) throws org.apache.thrift.TException {
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
          case 2: // DB_META
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.db_meta = new TGetMetaDBMeta();
              struct.db_meta.read(iprot);
              struct.setDbMetaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MASTER_ADDRESS
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetMetaResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.db_meta != null) {
        if (struct.isSetDbMeta()) {
          oprot.writeFieldBegin(DB_META_FIELD_DESC);
          struct.db_meta.write(oprot);
          oprot.writeFieldEnd();
        }
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

  private static class TGetMetaResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetMetaResultTupleScheme getScheme() {
      return new TGetMetaResultTupleScheme();
    }
  }

  private static class TGetMetaResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TGetMetaResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetMetaResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.status.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDbMeta()) {
        optionals.set(0);
      }
      if (struct.isSetMasterAddress()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetDbMeta()) {
        struct.db_meta.write(oprot);
      }
      if (struct.isSetMasterAddress()) {
        struct.master_address.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetMetaResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.status = new org.apache.doris.thrift.TStatus();
      struct.status.read(iprot);
      struct.setStatusIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.db_meta = new TGetMetaDBMeta();
        struct.db_meta.read(iprot);
        struct.setDbMetaIsSet(true);
      }
      if (incoming.get(1)) {
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

