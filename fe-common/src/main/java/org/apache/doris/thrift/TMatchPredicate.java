/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TMatchPredicate implements org.apache.thrift.TBase<TMatchPredicate, TMatchPredicate._Fields>, java.io.Serializable, Cloneable, Comparable<TMatchPredicate> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMatchPredicate");

  private static final org.apache.thrift.protocol.TField PARSER_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("parser_type", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PARSER_MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("parser_mode", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CHAR_FILTER_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("char_filter_map", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TMatchPredicateStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TMatchPredicateTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String parser_type; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String parser_mode; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> char_filter_map; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARSER_TYPE((short)1, "parser_type"),
    PARSER_MODE((short)2, "parser_mode"),
    CHAR_FILTER_MAP((short)3, "char_filter_map");

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
        case 1: // PARSER_TYPE
          return PARSER_TYPE;
        case 2: // PARSER_MODE
          return PARSER_MODE;
        case 3: // CHAR_FILTER_MAP
          return CHAR_FILTER_MAP;
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
  private static final _Fields optionals[] = {_Fields.CHAR_FILTER_MAP};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARSER_TYPE, new org.apache.thrift.meta_data.FieldMetaData("parser_type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARSER_MODE, new org.apache.thrift.meta_data.FieldMetaData("parser_mode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CHAR_FILTER_MAP, new org.apache.thrift.meta_data.FieldMetaData("char_filter_map", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMatchPredicate.class, metaDataMap);
  }

  public TMatchPredicate() {
  }

  public TMatchPredicate(
    java.lang.String parser_type,
    java.lang.String parser_mode)
  {
    this();
    this.parser_type = parser_type;
    this.parser_mode = parser_mode;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMatchPredicate(TMatchPredicate other) {
    if (other.isSetParserType()) {
      this.parser_type = other.parser_type;
    }
    if (other.isSetParserMode()) {
      this.parser_mode = other.parser_mode;
    }
    if (other.isSetCharFilterMap()) {
      java.util.Map<java.lang.String,java.lang.String> __this__char_filter_map = new java.util.HashMap<java.lang.String,java.lang.String>(other.char_filter_map);
      this.char_filter_map = __this__char_filter_map;
    }
  }

  public TMatchPredicate deepCopy() {
    return new TMatchPredicate(this);
  }

  @Override
  public void clear() {
    this.parser_type = null;
    this.parser_mode = null;
    this.char_filter_map = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getParserType() {
    return this.parser_type;
  }

  public TMatchPredicate setParserType(@org.apache.thrift.annotation.Nullable java.lang.String parser_type) {
    this.parser_type = parser_type;
    return this;
  }

  public void unsetParserType() {
    this.parser_type = null;
  }

  /** Returns true if field parser_type is set (has been assigned a value) and false otherwise */
  public boolean isSetParserType() {
    return this.parser_type != null;
  }

  public void setParserTypeIsSet(boolean value) {
    if (!value) {
      this.parser_type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getParserMode() {
    return this.parser_mode;
  }

  public TMatchPredicate setParserMode(@org.apache.thrift.annotation.Nullable java.lang.String parser_mode) {
    this.parser_mode = parser_mode;
    return this;
  }

  public void unsetParserMode() {
    this.parser_mode = null;
  }

  /** Returns true if field parser_mode is set (has been assigned a value) and false otherwise */
  public boolean isSetParserMode() {
    return this.parser_mode != null;
  }

  public void setParserModeIsSet(boolean value) {
    if (!value) {
      this.parser_mode = null;
    }
  }

  public int getCharFilterMapSize() {
    return (this.char_filter_map == null) ? 0 : this.char_filter_map.size();
  }

  public void putToCharFilterMap(java.lang.String key, java.lang.String val) {
    if (this.char_filter_map == null) {
      this.char_filter_map = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.char_filter_map.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.lang.String> getCharFilterMap() {
    return this.char_filter_map;
  }

  public TMatchPredicate setCharFilterMap(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> char_filter_map) {
    this.char_filter_map = char_filter_map;
    return this;
  }

  public void unsetCharFilterMap() {
    this.char_filter_map = null;
  }

  /** Returns true if field char_filter_map is set (has been assigned a value) and false otherwise */
  public boolean isSetCharFilterMap() {
    return this.char_filter_map != null;
  }

  public void setCharFilterMapIsSet(boolean value) {
    if (!value) {
      this.char_filter_map = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PARSER_TYPE:
      if (value == null) {
        unsetParserType();
      } else {
        setParserType((java.lang.String)value);
      }
      break;

    case PARSER_MODE:
      if (value == null) {
        unsetParserMode();
      } else {
        setParserMode((java.lang.String)value);
      }
      break;

    case CHAR_FILTER_MAP:
      if (value == null) {
        unsetCharFilterMap();
      } else {
        setCharFilterMap((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PARSER_TYPE:
      return getParserType();

    case PARSER_MODE:
      return getParserMode();

    case CHAR_FILTER_MAP:
      return getCharFilterMap();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PARSER_TYPE:
      return isSetParserType();
    case PARSER_MODE:
      return isSetParserMode();
    case CHAR_FILTER_MAP:
      return isSetCharFilterMap();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TMatchPredicate)
      return this.equals((TMatchPredicate)that);
    return false;
  }

  public boolean equals(TMatchPredicate that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_parser_type = true && this.isSetParserType();
    boolean that_present_parser_type = true && that.isSetParserType();
    if (this_present_parser_type || that_present_parser_type) {
      if (!(this_present_parser_type && that_present_parser_type))
        return false;
      if (!this.parser_type.equals(that.parser_type))
        return false;
    }

    boolean this_present_parser_mode = true && this.isSetParserMode();
    boolean that_present_parser_mode = true && that.isSetParserMode();
    if (this_present_parser_mode || that_present_parser_mode) {
      if (!(this_present_parser_mode && that_present_parser_mode))
        return false;
      if (!this.parser_mode.equals(that.parser_mode))
        return false;
    }

    boolean this_present_char_filter_map = true && this.isSetCharFilterMap();
    boolean that_present_char_filter_map = true && that.isSetCharFilterMap();
    if (this_present_char_filter_map || that_present_char_filter_map) {
      if (!(this_present_char_filter_map && that_present_char_filter_map))
        return false;
      if (!this.char_filter_map.equals(that.char_filter_map))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetParserType()) ? 131071 : 524287);
    if (isSetParserType())
      hashCode = hashCode * 8191 + parser_type.hashCode();

    hashCode = hashCode * 8191 + ((isSetParserMode()) ? 131071 : 524287);
    if (isSetParserMode())
      hashCode = hashCode * 8191 + parser_mode.hashCode();

    hashCode = hashCode * 8191 + ((isSetCharFilterMap()) ? 131071 : 524287);
    if (isSetCharFilterMap())
      hashCode = hashCode * 8191 + char_filter_map.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TMatchPredicate other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetParserType(), other.isSetParserType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParserType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parser_type, other.parser_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetParserMode(), other.isSetParserMode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParserMode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parser_mode, other.parser_mode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCharFilterMap(), other.isSetCharFilterMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCharFilterMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.char_filter_map, other.char_filter_map);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TMatchPredicate(");
    boolean first = true;

    sb.append("parser_type:");
    if (this.parser_type == null) {
      sb.append("null");
    } else {
      sb.append(this.parser_type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("parser_mode:");
    if (this.parser_mode == null) {
      sb.append("null");
    } else {
      sb.append(this.parser_mode);
    }
    first = false;
    if (isSetCharFilterMap()) {
      if (!first) sb.append(", ");
      sb.append("char_filter_map:");
      if (this.char_filter_map == null) {
        sb.append("null");
      } else {
        sb.append(this.char_filter_map);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (parser_type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'parser_type' was not present! Struct: " + toString());
    }
    if (parser_mode == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'parser_mode' was not present! Struct: " + toString());
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

  private static class TMatchPredicateStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMatchPredicateStandardScheme getScheme() {
      return new TMatchPredicateStandardScheme();
    }
  }

  private static class TMatchPredicateStandardScheme extends org.apache.thrift.scheme.StandardScheme<TMatchPredicate> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TMatchPredicate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARSER_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.parser_type = iprot.readString();
              struct.setParserTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARSER_MODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.parser_mode = iprot.readString();
              struct.setParserModeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CHAR_FILTER_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map8 = iprot.readMapBegin();
                struct.char_filter_map = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map8.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key9;
                @org.apache.thrift.annotation.Nullable java.lang.String _val10;
                for (int _i11 = 0; _i11 < _map8.size; ++_i11)
                {
                  _key9 = iprot.readString();
                  _val10 = iprot.readString();
                  struct.char_filter_map.put(_key9, _val10);
                }
                iprot.readMapEnd();
              }
              struct.setCharFilterMapIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TMatchPredicate struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.parser_type != null) {
        oprot.writeFieldBegin(PARSER_TYPE_FIELD_DESC);
        oprot.writeString(struct.parser_type);
        oprot.writeFieldEnd();
      }
      if (struct.parser_mode != null) {
        oprot.writeFieldBegin(PARSER_MODE_FIELD_DESC);
        oprot.writeString(struct.parser_mode);
        oprot.writeFieldEnd();
      }
      if (struct.char_filter_map != null) {
        if (struct.isSetCharFilterMap()) {
          oprot.writeFieldBegin(CHAR_FILTER_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.char_filter_map.size()));
            for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter12 : struct.char_filter_map.entrySet())
            {
              oprot.writeString(_iter12.getKey());
              oprot.writeString(_iter12.getValue());
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

  private static class TMatchPredicateTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMatchPredicateTupleScheme getScheme() {
      return new TMatchPredicateTupleScheme();
    }
  }

  private static class TMatchPredicateTupleScheme extends org.apache.thrift.scheme.TupleScheme<TMatchPredicate> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMatchPredicate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.parser_type);
      oprot.writeString(struct.parser_mode);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCharFilterMap()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetCharFilterMap()) {
        {
          oprot.writeI32(struct.char_filter_map.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter13 : struct.char_filter_map.entrySet())
          {
            oprot.writeString(_iter13.getKey());
            oprot.writeString(_iter13.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMatchPredicate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.parser_type = iprot.readString();
      struct.setParserTypeIsSet(true);
      struct.parser_mode = iprot.readString();
      struct.setParserModeIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map14 = iprot.readMapBegin(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING); 
          struct.char_filter_map = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map14.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _key15;
          @org.apache.thrift.annotation.Nullable java.lang.String _val16;
          for (int _i17 = 0; _i17 < _map14.size; ++_i17)
          {
            _key15 = iprot.readString();
            _val16 = iprot.readString();
            struct.char_filter_map.put(_key15, _val16);
          }
        }
        struct.setCharFilterMapIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

