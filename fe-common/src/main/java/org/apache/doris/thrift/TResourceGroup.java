/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TResourceGroup implements org.apache.thrift.TBase<TResourceGroup, TResourceGroup._Fields>, java.io.Serializable, Cloneable, Comparable<TResourceGroup> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TResourceGroup");

  private static final org.apache.thrift.protocol.TField RESOURCE_BY_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("resourceByType", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TResourceGroupStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TResourceGroupTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.Map<TResourceType,java.lang.Integer> resourceByType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESOURCE_BY_TYPE((short)1, "resourceByType");

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
        case 1: // RESOURCE_BY_TYPE
          return RESOURCE_BY_TYPE;
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
    tmpMap.put(_Fields.RESOURCE_BY_TYPE, new org.apache.thrift.meta_data.FieldMetaData("resourceByType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TResourceType.class), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TResourceGroup.class, metaDataMap);
  }

  public TResourceGroup() {
  }

  public TResourceGroup(
    java.util.Map<TResourceType,java.lang.Integer> resourceByType)
  {
    this();
    this.resourceByType = resourceByType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TResourceGroup(TResourceGroup other) {
    if (other.isSetResourceByType()) {
      java.util.Map<TResourceType,java.lang.Integer> __this__resourceByType = new java.util.EnumMap<TResourceType,java.lang.Integer>(TResourceType.class);
      for (java.util.Map.Entry<TResourceType, java.lang.Integer> other_element : other.resourceByType.entrySet()) {

        TResourceType other_element_key = other_element.getKey();
        java.lang.Integer other_element_value = other_element.getValue();

        TResourceType __this__resourceByType_copy_key = other_element_key;

        java.lang.Integer __this__resourceByType_copy_value = other_element_value;

        __this__resourceByType.put(__this__resourceByType_copy_key, __this__resourceByType_copy_value);
      }
      this.resourceByType = __this__resourceByType;
    }
  }

  public TResourceGroup deepCopy() {
    return new TResourceGroup(this);
  }

  @Override
  public void clear() {
    this.resourceByType = null;
  }

  public int getResourceByTypeSize() {
    return (this.resourceByType == null) ? 0 : this.resourceByType.size();
  }

  public void putToResourceByType(TResourceType key, int val) {
    if (this.resourceByType == null) {
      this.resourceByType = new java.util.EnumMap<TResourceType,java.lang.Integer>(TResourceType.class);
    }
    this.resourceByType.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<TResourceType,java.lang.Integer> getResourceByType() {
    return this.resourceByType;
  }

  public TResourceGroup setResourceByType(@org.apache.thrift.annotation.Nullable java.util.Map<TResourceType,java.lang.Integer> resourceByType) {
    this.resourceByType = resourceByType;
    return this;
  }

  public void unsetResourceByType() {
    this.resourceByType = null;
  }

  /** Returns true if field resourceByType is set (has been assigned a value) and false otherwise */
  public boolean isSetResourceByType() {
    return this.resourceByType != null;
  }

  public void setResourceByTypeIsSet(boolean value) {
    if (!value) {
      this.resourceByType = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case RESOURCE_BY_TYPE:
      if (value == null) {
        unsetResourceByType();
      } else {
        setResourceByType((java.util.Map<TResourceType,java.lang.Integer>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case RESOURCE_BY_TYPE:
      return getResourceByType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case RESOURCE_BY_TYPE:
      return isSetResourceByType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TResourceGroup)
      return this.equals((TResourceGroup)that);
    return false;
  }

  public boolean equals(TResourceGroup that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_resourceByType = true && this.isSetResourceByType();
    boolean that_present_resourceByType = true && that.isSetResourceByType();
    if (this_present_resourceByType || that_present_resourceByType) {
      if (!(this_present_resourceByType && that_present_resourceByType))
        return false;
      if (!this.resourceByType.equals(that.resourceByType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetResourceByType()) ? 131071 : 524287);
    if (isSetResourceByType())
      hashCode = hashCode * 8191 + resourceByType.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TResourceGroup other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetResourceByType(), other.isSetResourceByType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourceByType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourceByType, other.resourceByType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TResourceGroup(");
    boolean first = true;

    sb.append("resourceByType:");
    if (this.resourceByType == null) {
      sb.append("null");
    } else {
      sb.append(this.resourceByType);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (resourceByType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'resourceByType' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TResourceGroupStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TResourceGroupStandardScheme getScheme() {
      return new TResourceGroupStandardScheme();
    }
  }

  private static class TResourceGroupStandardScheme extends org.apache.thrift.scheme.StandardScheme<TResourceGroup> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TResourceGroup struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESOURCE_BY_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map148 = iprot.readMapBegin();
                struct.resourceByType = new java.util.EnumMap<TResourceType,java.lang.Integer>(TResourceType.class);
                @org.apache.thrift.annotation.Nullable TResourceType _key149;
                int _val150;
                for (int _i151 = 0; _i151 < _map148.size; ++_i151)
                {
                  _key149 = org.apache.doris.thrift.TResourceType.findByValue(iprot.readI32());
                  _val150 = iprot.readI32();
                  if (_key149 != null)
                  {
                    struct.resourceByType.put(_key149, _val150);
                  }
                }
                iprot.readMapEnd();
              }
              struct.setResourceByTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TResourceGroup struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.resourceByType != null) {
        oprot.writeFieldBegin(RESOURCE_BY_TYPE_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.I32, struct.resourceByType.size()));
          for (java.util.Map.Entry<TResourceType, java.lang.Integer> _iter152 : struct.resourceByType.entrySet())
          {
            oprot.writeI32(_iter152.getKey().getValue());
            oprot.writeI32(_iter152.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TResourceGroupTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TResourceGroupTupleScheme getScheme() {
      return new TResourceGroupTupleScheme();
    }
  }

  private static class TResourceGroupTupleScheme extends org.apache.thrift.scheme.TupleScheme<TResourceGroup> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TResourceGroup struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.resourceByType.size());
        for (java.util.Map.Entry<TResourceType, java.lang.Integer> _iter153 : struct.resourceByType.entrySet())
        {
          oprot.writeI32(_iter153.getKey().getValue());
          oprot.writeI32(_iter153.getValue());
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TResourceGroup struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map154 = iprot.readMapBegin(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.I32); 
        struct.resourceByType = new java.util.EnumMap<TResourceType,java.lang.Integer>(TResourceType.class);
        @org.apache.thrift.annotation.Nullable TResourceType _key155;
        int _val156;
        for (int _i157 = 0; _i157 < _map154.size; ++_i157)
        {
          _key155 = org.apache.doris.thrift.TResourceType.findByValue(iprot.readI32());
          _val156 = iprot.readI32();
          if (_key155 != null)
          {
            struct.resourceByType.put(_key155, _val156);
          }
        }
      }
      struct.setResourceByTypeIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

