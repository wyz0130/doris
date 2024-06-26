/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TGetBackendMetaResult implements org.apache.thrift.TBase<TGetBackendMetaResult, TGetBackendMetaResult._Fields>, java.io.Serializable, Cloneable, Comparable<TGetBackendMetaResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetBackendMetaResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField BACKENDS_FIELD_DESC = new org.apache.thrift.protocol.TField("backends", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField MASTER_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("master_address", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TGetBackendMetaResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TGetBackendMetaResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TBackend> backends; // optional
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TNetworkAddress master_address; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    BACKENDS((short)2, "backends"),
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
        case 2: // BACKENDS
          return BACKENDS;
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
  private static final _Fields optionals[] = {_Fields.BACKENDS,_Fields.MASTER_ADDRESS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TStatus.class)));
    tmpMap.put(_Fields.BACKENDS, new org.apache.thrift.meta_data.FieldMetaData("backends", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TBackend.class))));
    tmpMap.put(_Fields.MASTER_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("master_address", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TNetworkAddress.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetBackendMetaResult.class, metaDataMap);
  }

  public TGetBackendMetaResult() {
  }

  public TGetBackendMetaResult(
    org.apache.doris.thrift.TStatus status)
  {
    this();
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetBackendMetaResult(TGetBackendMetaResult other) {
    if (other.isSetStatus()) {
      this.status = new org.apache.doris.thrift.TStatus(other.status);
    }
    if (other.isSetBackends()) {
      java.util.List<org.apache.doris.thrift.TBackend> __this__backends = new java.util.ArrayList<org.apache.doris.thrift.TBackend>(other.backends.size());
      for (org.apache.doris.thrift.TBackend other_element : other.backends) {
        __this__backends.add(new org.apache.doris.thrift.TBackend(other_element));
      }
      this.backends = __this__backends;
    }
    if (other.isSetMasterAddress()) {
      this.master_address = new org.apache.doris.thrift.TNetworkAddress(other.master_address);
    }
  }

  public TGetBackendMetaResult deepCopy() {
    return new TGetBackendMetaResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.backends = null;
    this.master_address = null;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TStatus getStatus() {
    return this.status;
  }

  public TGetBackendMetaResult setStatus(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status) {
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

  public int getBackendsSize() {
    return (this.backends == null) ? 0 : this.backends.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<org.apache.doris.thrift.TBackend> getBackendsIterator() {
    return (this.backends == null) ? null : this.backends.iterator();
  }

  public void addToBackends(org.apache.doris.thrift.TBackend elem) {
    if (this.backends == null) {
      this.backends = new java.util.ArrayList<org.apache.doris.thrift.TBackend>();
    }
    this.backends.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<org.apache.doris.thrift.TBackend> getBackends() {
    return this.backends;
  }

  public TGetBackendMetaResult setBackends(@org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TBackend> backends) {
    this.backends = backends;
    return this;
  }

  public void unsetBackends() {
    this.backends = null;
  }

  /** Returns true if field backends is set (has been assigned a value) and false otherwise */
  public boolean isSetBackends() {
    return this.backends != null;
  }

  public void setBackendsIsSet(boolean value) {
    if (!value) {
      this.backends = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TNetworkAddress getMasterAddress() {
    return this.master_address;
  }

  public TGetBackendMetaResult setMasterAddress(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TNetworkAddress master_address) {
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

    case BACKENDS:
      if (value == null) {
        unsetBackends();
      } else {
        setBackends((java.util.List<org.apache.doris.thrift.TBackend>)value);
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

    case BACKENDS:
      return getBackends();

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
    case BACKENDS:
      return isSetBackends();
    case MASTER_ADDRESS:
      return isSetMasterAddress();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TGetBackendMetaResult)
      return this.equals((TGetBackendMetaResult)that);
    return false;
  }

  public boolean equals(TGetBackendMetaResult that) {
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

    boolean this_present_backends = true && this.isSetBackends();
    boolean that_present_backends = true && that.isSetBackends();
    if (this_present_backends || that_present_backends) {
      if (!(this_present_backends && that_present_backends))
        return false;
      if (!this.backends.equals(that.backends))
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

    hashCode = hashCode * 8191 + ((isSetBackends()) ? 131071 : 524287);
    if (isSetBackends())
      hashCode = hashCode * 8191 + backends.hashCode();

    hashCode = hashCode * 8191 + ((isSetMasterAddress()) ? 131071 : 524287);
    if (isSetMasterAddress())
      hashCode = hashCode * 8191 + master_address.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TGetBackendMetaResult other) {
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
    lastComparison = java.lang.Boolean.compare(isSetBackends(), other.isSetBackends());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBackends()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.backends, other.backends);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TGetBackendMetaResult(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (isSetBackends()) {
      if (!first) sb.append(", ");
      sb.append("backends:");
      if (this.backends == null) {
        sb.append("null");
      } else {
        sb.append(this.backends);
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

  private static class TGetBackendMetaResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetBackendMetaResultStandardScheme getScheme() {
      return new TGetBackendMetaResultStandardScheme();
    }
  }

  private static class TGetBackendMetaResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TGetBackendMetaResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetBackendMetaResult struct) throws org.apache.thrift.TException {
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
          case 2: // BACKENDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list712 = iprot.readListBegin();
                struct.backends = new java.util.ArrayList<org.apache.doris.thrift.TBackend>(_list712.size);
                @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TBackend _elem713;
                for (int _i714 = 0; _i714 < _list712.size; ++_i714)
                {
                  _elem713 = new org.apache.doris.thrift.TBackend();
                  _elem713.read(iprot);
                  struct.backends.add(_elem713);
                }
                iprot.readListEnd();
              }
              struct.setBackendsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetBackendMetaResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.backends != null) {
        if (struct.isSetBackends()) {
          oprot.writeFieldBegin(BACKENDS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.backends.size()));
            for (org.apache.doris.thrift.TBackend _iter715 : struct.backends)
            {
              _iter715.write(oprot);
            }
            oprot.writeListEnd();
          }
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

  private static class TGetBackendMetaResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TGetBackendMetaResultTupleScheme getScheme() {
      return new TGetBackendMetaResultTupleScheme();
    }
  }

  private static class TGetBackendMetaResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TGetBackendMetaResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetBackendMetaResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.status.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetBackends()) {
        optionals.set(0);
      }
      if (struct.isSetMasterAddress()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetBackends()) {
        {
          oprot.writeI32(struct.backends.size());
          for (org.apache.doris.thrift.TBackend _iter716 : struct.backends)
          {
            _iter716.write(oprot);
          }
        }
      }
      if (struct.isSetMasterAddress()) {
        struct.master_address.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetBackendMetaResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.status = new org.apache.doris.thrift.TStatus();
      struct.status.read(iprot);
      struct.setStatusIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list717 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.backends = new java.util.ArrayList<org.apache.doris.thrift.TBackend>(_list717.size);
          @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TBackend _elem718;
          for (int _i719 = 0; _i719 < _list717.size; ++_i719)
          {
            _elem718 = new org.apache.doris.thrift.TBackend();
            _elem718.read(iprot);
            struct.backends.add(_elem718);
          }
        }
        struct.setBackendsIsSet(true);
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

