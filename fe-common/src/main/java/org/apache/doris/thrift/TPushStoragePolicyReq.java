/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TPushStoragePolicyReq implements org.apache.thrift.TBase<TPushStoragePolicyReq, TPushStoragePolicyReq._Fields>, java.io.Serializable, Cloneable, Comparable<TPushStoragePolicyReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPushStoragePolicyReq");

  private static final org.apache.thrift.protocol.TField STORAGE_POLICY_FIELD_DESC = new org.apache.thrift.protocol.TField("storage_policy", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField RESOURCE_FIELD_DESC = new org.apache.thrift.protocol.TField("resource", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField DROPPED_STORAGE_POLICY_FIELD_DESC = new org.apache.thrift.protocol.TField("dropped_storage_policy", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TPushStoragePolicyReqStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TPushStoragePolicyReqTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<TStoragePolicy> storage_policy; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<TStorageResource> resource; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Long> dropped_storage_policy; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STORAGE_POLICY((short)1, "storage_policy"),
    RESOURCE((short)2, "resource"),
    DROPPED_STORAGE_POLICY((short)3, "dropped_storage_policy");

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
        case 1: // STORAGE_POLICY
          return STORAGE_POLICY;
        case 2: // RESOURCE
          return RESOURCE;
        case 3: // DROPPED_STORAGE_POLICY
          return DROPPED_STORAGE_POLICY;
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
  private static final _Fields optionals[] = {_Fields.STORAGE_POLICY,_Fields.RESOURCE,_Fields.DROPPED_STORAGE_POLICY};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STORAGE_POLICY, new org.apache.thrift.meta_data.FieldMetaData("storage_policy", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TStoragePolicy.class))));
    tmpMap.put(_Fields.RESOURCE, new org.apache.thrift.meta_data.FieldMetaData("resource", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TStorageResource.class))));
    tmpMap.put(_Fields.DROPPED_STORAGE_POLICY, new org.apache.thrift.meta_data.FieldMetaData("dropped_storage_policy", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPushStoragePolicyReq.class, metaDataMap);
  }

  public TPushStoragePolicyReq() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPushStoragePolicyReq(TPushStoragePolicyReq other) {
    if (other.isSetStoragePolicy()) {
      java.util.List<TStoragePolicy> __this__storage_policy = new java.util.ArrayList<TStoragePolicy>(other.storage_policy.size());
      for (TStoragePolicy other_element : other.storage_policy) {
        __this__storage_policy.add(new TStoragePolicy(other_element));
      }
      this.storage_policy = __this__storage_policy;
    }
    if (other.isSetResource()) {
      java.util.List<TStorageResource> __this__resource = new java.util.ArrayList<TStorageResource>(other.resource.size());
      for (TStorageResource other_element : other.resource) {
        __this__resource.add(new TStorageResource(other_element));
      }
      this.resource = __this__resource;
    }
    if (other.isSetDroppedStoragePolicy()) {
      java.util.List<java.lang.Long> __this__dropped_storage_policy = new java.util.ArrayList<java.lang.Long>(other.dropped_storage_policy);
      this.dropped_storage_policy = __this__dropped_storage_policy;
    }
  }

  public TPushStoragePolicyReq deepCopy() {
    return new TPushStoragePolicyReq(this);
  }

  @Override
  public void clear() {
    this.storage_policy = null;
    this.resource = null;
    this.dropped_storage_policy = null;
  }

  public int getStoragePolicySize() {
    return (this.storage_policy == null) ? 0 : this.storage_policy.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TStoragePolicy> getStoragePolicyIterator() {
    return (this.storage_policy == null) ? null : this.storage_policy.iterator();
  }

  public void addToStoragePolicy(TStoragePolicy elem) {
    if (this.storage_policy == null) {
      this.storage_policy = new java.util.ArrayList<TStoragePolicy>();
    }
    this.storage_policy.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TStoragePolicy> getStoragePolicy() {
    return this.storage_policy;
  }

  public TPushStoragePolicyReq setStoragePolicy(@org.apache.thrift.annotation.Nullable java.util.List<TStoragePolicy> storage_policy) {
    this.storage_policy = storage_policy;
    return this;
  }

  public void unsetStoragePolicy() {
    this.storage_policy = null;
  }

  /** Returns true if field storage_policy is set (has been assigned a value) and false otherwise */
  public boolean isSetStoragePolicy() {
    return this.storage_policy != null;
  }

  public void setStoragePolicyIsSet(boolean value) {
    if (!value) {
      this.storage_policy = null;
    }
  }

  public int getResourceSize() {
    return (this.resource == null) ? 0 : this.resource.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TStorageResource> getResourceIterator() {
    return (this.resource == null) ? null : this.resource.iterator();
  }

  public void addToResource(TStorageResource elem) {
    if (this.resource == null) {
      this.resource = new java.util.ArrayList<TStorageResource>();
    }
    this.resource.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TStorageResource> getResource() {
    return this.resource;
  }

  public TPushStoragePolicyReq setResource(@org.apache.thrift.annotation.Nullable java.util.List<TStorageResource> resource) {
    this.resource = resource;
    return this;
  }

  public void unsetResource() {
    this.resource = null;
  }

  /** Returns true if field resource is set (has been assigned a value) and false otherwise */
  public boolean isSetResource() {
    return this.resource != null;
  }

  public void setResourceIsSet(boolean value) {
    if (!value) {
      this.resource = null;
    }
  }

  public int getDroppedStoragePolicySize() {
    return (this.dropped_storage_policy == null) ? 0 : this.dropped_storage_policy.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Long> getDroppedStoragePolicyIterator() {
    return (this.dropped_storage_policy == null) ? null : this.dropped_storage_policy.iterator();
  }

  public void addToDroppedStoragePolicy(long elem) {
    if (this.dropped_storage_policy == null) {
      this.dropped_storage_policy = new java.util.ArrayList<java.lang.Long>();
    }
    this.dropped_storage_policy.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Long> getDroppedStoragePolicy() {
    return this.dropped_storage_policy;
  }

  public TPushStoragePolicyReq setDroppedStoragePolicy(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Long> dropped_storage_policy) {
    this.dropped_storage_policy = dropped_storage_policy;
    return this;
  }

  public void unsetDroppedStoragePolicy() {
    this.dropped_storage_policy = null;
  }

  /** Returns true if field dropped_storage_policy is set (has been assigned a value) and false otherwise */
  public boolean isSetDroppedStoragePolicy() {
    return this.dropped_storage_policy != null;
  }

  public void setDroppedStoragePolicyIsSet(boolean value) {
    if (!value) {
      this.dropped_storage_policy = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case STORAGE_POLICY:
      if (value == null) {
        unsetStoragePolicy();
      } else {
        setStoragePolicy((java.util.List<TStoragePolicy>)value);
      }
      break;

    case RESOURCE:
      if (value == null) {
        unsetResource();
      } else {
        setResource((java.util.List<TStorageResource>)value);
      }
      break;

    case DROPPED_STORAGE_POLICY:
      if (value == null) {
        unsetDroppedStoragePolicy();
      } else {
        setDroppedStoragePolicy((java.util.List<java.lang.Long>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STORAGE_POLICY:
      return getStoragePolicy();

    case RESOURCE:
      return getResource();

    case DROPPED_STORAGE_POLICY:
      return getDroppedStoragePolicy();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STORAGE_POLICY:
      return isSetStoragePolicy();
    case RESOURCE:
      return isSetResource();
    case DROPPED_STORAGE_POLICY:
      return isSetDroppedStoragePolicy();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TPushStoragePolicyReq)
      return this.equals((TPushStoragePolicyReq)that);
    return false;
  }

  public boolean equals(TPushStoragePolicyReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_storage_policy = true && this.isSetStoragePolicy();
    boolean that_present_storage_policy = true && that.isSetStoragePolicy();
    if (this_present_storage_policy || that_present_storage_policy) {
      if (!(this_present_storage_policy && that_present_storage_policy))
        return false;
      if (!this.storage_policy.equals(that.storage_policy))
        return false;
    }

    boolean this_present_resource = true && this.isSetResource();
    boolean that_present_resource = true && that.isSetResource();
    if (this_present_resource || that_present_resource) {
      if (!(this_present_resource && that_present_resource))
        return false;
      if (!this.resource.equals(that.resource))
        return false;
    }

    boolean this_present_dropped_storage_policy = true && this.isSetDroppedStoragePolicy();
    boolean that_present_dropped_storage_policy = true && that.isSetDroppedStoragePolicy();
    if (this_present_dropped_storage_policy || that_present_dropped_storage_policy) {
      if (!(this_present_dropped_storage_policy && that_present_dropped_storage_policy))
        return false;
      if (!this.dropped_storage_policy.equals(that.dropped_storage_policy))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStoragePolicy()) ? 131071 : 524287);
    if (isSetStoragePolicy())
      hashCode = hashCode * 8191 + storage_policy.hashCode();

    hashCode = hashCode * 8191 + ((isSetResource()) ? 131071 : 524287);
    if (isSetResource())
      hashCode = hashCode * 8191 + resource.hashCode();

    hashCode = hashCode * 8191 + ((isSetDroppedStoragePolicy()) ? 131071 : 524287);
    if (isSetDroppedStoragePolicy())
      hashCode = hashCode * 8191 + dropped_storage_policy.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TPushStoragePolicyReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetStoragePolicy(), other.isSetStoragePolicy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStoragePolicy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.storage_policy, other.storage_policy);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetResource(), other.isSetResource());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResource()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resource, other.resource);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDroppedStoragePolicy(), other.isSetDroppedStoragePolicy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDroppedStoragePolicy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dropped_storage_policy, other.dropped_storage_policy);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TPushStoragePolicyReq(");
    boolean first = true;

    if (isSetStoragePolicy()) {
      sb.append("storage_policy:");
      if (this.storage_policy == null) {
        sb.append("null");
      } else {
        sb.append(this.storage_policy);
      }
      first = false;
    }
    if (isSetResource()) {
      if (!first) sb.append(", ");
      sb.append("resource:");
      if (this.resource == null) {
        sb.append("null");
      } else {
        sb.append(this.resource);
      }
      first = false;
    }
    if (isSetDroppedStoragePolicy()) {
      if (!first) sb.append(", ");
      sb.append("dropped_storage_policy:");
      if (this.dropped_storage_policy == null) {
        sb.append("null");
      } else {
        sb.append(this.dropped_storage_policy);
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

  private static class TPushStoragePolicyReqStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TPushStoragePolicyReqStandardScheme getScheme() {
      return new TPushStoragePolicyReqStandardScheme();
    }
  }

  private static class TPushStoragePolicyReqStandardScheme extends org.apache.thrift.scheme.StandardScheme<TPushStoragePolicyReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TPushStoragePolicyReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STORAGE_POLICY
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.storage_policy = new java.util.ArrayList<TStoragePolicy>(_list24.size);
                @org.apache.thrift.annotation.Nullable TStoragePolicy _elem25;
                for (int _i26 = 0; _i26 < _list24.size; ++_i26)
                {
                  _elem25 = new TStoragePolicy();
                  _elem25.read(iprot);
                  struct.storage_policy.add(_elem25);
                }
                iprot.readListEnd();
              }
              struct.setStoragePolicyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RESOURCE
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list27 = iprot.readListBegin();
                struct.resource = new java.util.ArrayList<TStorageResource>(_list27.size);
                @org.apache.thrift.annotation.Nullable TStorageResource _elem28;
                for (int _i29 = 0; _i29 < _list27.size; ++_i29)
                {
                  _elem28 = new TStorageResource();
                  _elem28.read(iprot);
                  struct.resource.add(_elem28);
                }
                iprot.readListEnd();
              }
              struct.setResourceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DROPPED_STORAGE_POLICY
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list30 = iprot.readListBegin();
                struct.dropped_storage_policy = new java.util.ArrayList<java.lang.Long>(_list30.size);
                long _elem31;
                for (int _i32 = 0; _i32 < _list30.size; ++_i32)
                {
                  _elem31 = iprot.readI64();
                  struct.dropped_storage_policy.add(_elem31);
                }
                iprot.readListEnd();
              }
              struct.setDroppedStoragePolicyIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TPushStoragePolicyReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.storage_policy != null) {
        if (struct.isSetStoragePolicy()) {
          oprot.writeFieldBegin(STORAGE_POLICY_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.storage_policy.size()));
            for (TStoragePolicy _iter33 : struct.storage_policy)
            {
              _iter33.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.resource != null) {
        if (struct.isSetResource()) {
          oprot.writeFieldBegin(RESOURCE_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.resource.size()));
            for (TStorageResource _iter34 : struct.resource)
            {
              _iter34.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.dropped_storage_policy != null) {
        if (struct.isSetDroppedStoragePolicy()) {
          oprot.writeFieldBegin(DROPPED_STORAGE_POLICY_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.dropped_storage_policy.size()));
            for (long _iter35 : struct.dropped_storage_policy)
            {
              oprot.writeI64(_iter35);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPushStoragePolicyReqTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TPushStoragePolicyReqTupleScheme getScheme() {
      return new TPushStoragePolicyReqTupleScheme();
    }
  }

  private static class TPushStoragePolicyReqTupleScheme extends org.apache.thrift.scheme.TupleScheme<TPushStoragePolicyReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPushStoragePolicyReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStoragePolicy()) {
        optionals.set(0);
      }
      if (struct.isSetResource()) {
        optionals.set(1);
      }
      if (struct.isSetDroppedStoragePolicy()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStoragePolicy()) {
        {
          oprot.writeI32(struct.storage_policy.size());
          for (TStoragePolicy _iter36 : struct.storage_policy)
          {
            _iter36.write(oprot);
          }
        }
      }
      if (struct.isSetResource()) {
        {
          oprot.writeI32(struct.resource.size());
          for (TStorageResource _iter37 : struct.resource)
          {
            _iter37.write(oprot);
          }
        }
      }
      if (struct.isSetDroppedStoragePolicy()) {
        {
          oprot.writeI32(struct.dropped_storage_policy.size());
          for (long _iter38 : struct.dropped_storage_policy)
          {
            oprot.writeI64(_iter38);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPushStoragePolicyReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list39 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.storage_policy = new java.util.ArrayList<TStoragePolicy>(_list39.size);
          @org.apache.thrift.annotation.Nullable TStoragePolicy _elem40;
          for (int _i41 = 0; _i41 < _list39.size; ++_i41)
          {
            _elem40 = new TStoragePolicy();
            _elem40.read(iprot);
            struct.storage_policy.add(_elem40);
          }
        }
        struct.setStoragePolicyIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list42 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.resource = new java.util.ArrayList<TStorageResource>(_list42.size);
          @org.apache.thrift.annotation.Nullable TStorageResource _elem43;
          for (int _i44 = 0; _i44 < _list42.size; ++_i44)
          {
            _elem43 = new TStorageResource();
            _elem43.read(iprot);
            struct.resource.add(_elem43);
          }
        }
        struct.setResourceIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list45 = iprot.readListBegin(org.apache.thrift.protocol.TType.I64);
          struct.dropped_storage_policy = new java.util.ArrayList<java.lang.Long>(_list45.size);
          long _elem46;
          for (int _i47 = 0; _i47 < _list45.size; ++_i47)
          {
            _elem46 = iprot.readI64();
            struct.dropped_storage_policy.add(_elem46);
          }
        }
        struct.setDroppedStoragePolicyIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

