/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TExprMap implements org.apache.thrift.TBase<TExprMap, TExprMap._Fields>, java.io.Serializable, Cloneable, Comparable<TExprMap> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TExprMap");

  private static final org.apache.thrift.protocol.TField EXPR_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("expr_map", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TExprMapStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TExprMapTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr> expr_map; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXPR_MAP((short)1, "expr_map");

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
        case 1: // EXPR_MAP
          return EXPR_MAP;
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
    tmpMap.put(_Fields.EXPR_MAP, new org.apache.thrift.meta_data.FieldMetaData("expr_map", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TExpr.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TExprMap.class, metaDataMap);
  }

  public TExprMap() {
  }

  public TExprMap(
    java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr> expr_map)
  {
    this();
    this.expr_map = expr_map;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TExprMap(TExprMap other) {
    if (other.isSetExprMap()) {
      java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr> __this__expr_map = new java.util.HashMap<java.lang.String,org.apache.doris.thrift.TExpr>(other.expr_map.size());
      for (java.util.Map.Entry<java.lang.String, org.apache.doris.thrift.TExpr> other_element : other.expr_map.entrySet()) {

        java.lang.String other_element_key = other_element.getKey();
        org.apache.doris.thrift.TExpr other_element_value = other_element.getValue();

        java.lang.String __this__expr_map_copy_key = other_element_key;

        org.apache.doris.thrift.TExpr __this__expr_map_copy_value = new org.apache.doris.thrift.TExpr(other_element_value);

        __this__expr_map.put(__this__expr_map_copy_key, __this__expr_map_copy_value);
      }
      this.expr_map = __this__expr_map;
    }
  }

  public TExprMap deepCopy() {
    return new TExprMap(this);
  }

  @Override
  public void clear() {
    this.expr_map = null;
  }

  public int getExprMapSize() {
    return (this.expr_map == null) ? 0 : this.expr_map.size();
  }

  public void putToExprMap(java.lang.String key, org.apache.doris.thrift.TExpr val) {
    if (this.expr_map == null) {
      this.expr_map = new java.util.HashMap<java.lang.String,org.apache.doris.thrift.TExpr>();
    }
    this.expr_map.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr> getExprMap() {
    return this.expr_map;
  }

  public TExprMap setExprMap(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr> expr_map) {
    this.expr_map = expr_map;
    return this;
  }

  public void unsetExprMap() {
    this.expr_map = null;
  }

  /** Returns true if field expr_map is set (has been assigned a value) and false otherwise */
  public boolean isSetExprMap() {
    return this.expr_map != null;
  }

  public void setExprMapIsSet(boolean value) {
    if (!value) {
      this.expr_map = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case EXPR_MAP:
      if (value == null) {
        unsetExprMap();
      } else {
        setExprMap((java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case EXPR_MAP:
      return getExprMap();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case EXPR_MAP:
      return isSetExprMap();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TExprMap)
      return this.equals((TExprMap)that);
    return false;
  }

  public boolean equals(TExprMap that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_expr_map = true && this.isSetExprMap();
    boolean that_present_expr_map = true && that.isSetExprMap();
    if (this_present_expr_map || that_present_expr_map) {
      if (!(this_present_expr_map && that_present_expr_map))
        return false;
      if (!this.expr_map.equals(that.expr_map))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetExprMap()) ? 131071 : 524287);
    if (isSetExprMap())
      hashCode = hashCode * 8191 + expr_map.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TExprMap other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetExprMap(), other.isSetExprMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExprMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expr_map, other.expr_map);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TExprMap(");
    boolean first = true;

    sb.append("expr_map:");
    if (this.expr_map == null) {
      sb.append("null");
    } else {
      sb.append(this.expr_map);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (expr_map == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'expr_map' was not present! Struct: " + toString());
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

  private static class TExprMapStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TExprMapStandardScheme getScheme() {
      return new TExprMapStandardScheme();
    }
  }

  private static class TExprMapStandardScheme extends org.apache.thrift.scheme.StandardScheme<TExprMap> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TExprMap struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXPR_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map190 = iprot.readMapBegin();
                struct.expr_map = new java.util.HashMap<java.lang.String,org.apache.doris.thrift.TExpr>(2*_map190.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key191;
                @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _val192;
                for (int _i193 = 0; _i193 < _map190.size; ++_i193)
                {
                  _key191 = iprot.readString();
                  _val192 = new org.apache.doris.thrift.TExpr();
                  _val192.read(iprot);
                  struct.expr_map.put(_key191, _val192);
                }
                iprot.readMapEnd();
              }
              struct.setExprMapIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TExprMap struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.expr_map != null) {
        oprot.writeFieldBegin(EXPR_MAP_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.expr_map.size()));
          for (java.util.Map.Entry<java.lang.String, org.apache.doris.thrift.TExpr> _iter194 : struct.expr_map.entrySet())
          {
            oprot.writeString(_iter194.getKey());
            _iter194.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TExprMapTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TExprMapTupleScheme getScheme() {
      return new TExprMapTupleScheme();
    }
  }

  private static class TExprMapTupleScheme extends org.apache.thrift.scheme.TupleScheme<TExprMap> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TExprMap struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.expr_map.size());
        for (java.util.Map.Entry<java.lang.String, org.apache.doris.thrift.TExpr> _iter195 : struct.expr_map.entrySet())
        {
          oprot.writeString(_iter195.getKey());
          _iter195.getValue().write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TExprMap struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map196 = iprot.readMapBegin(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT); 
        struct.expr_map = new java.util.HashMap<java.lang.String,org.apache.doris.thrift.TExpr>(2*_map196.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _key197;
        @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _val198;
        for (int _i199 = 0; _i199 < _map196.size; ++_i199)
        {
          _key197 = iprot.readString();
          _val198 = new org.apache.doris.thrift.TExpr();
          _val198.read(iprot);
          struct.expr_map.put(_key197, _val198);
        }
      }
      struct.setExprMapIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

