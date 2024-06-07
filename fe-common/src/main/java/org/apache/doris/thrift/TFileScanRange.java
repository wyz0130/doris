/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TFileScanRange implements org.apache.thrift.TBase<TFileScanRange, TFileScanRange._Fields>, java.io.Serializable, Cloneable, Comparable<TFileScanRange> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TFileScanRange");

  private static final org.apache.thrift.protocol.TField RANGES_FIELD_DESC = new org.apache.thrift.protocol.TField("ranges", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("params", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TFileScanRangeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TFileScanRangeTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<TFileRangeDesc> ranges; // optional
  public @org.apache.thrift.annotation.Nullable TFileScanRangeParams params; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RANGES((short)1, "ranges"),
    PARAMS((short)2, "params");

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
        case 1: // RANGES
          return RANGES;
        case 2: // PARAMS
          return PARAMS;
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
  private static final _Fields optionals[] = {_Fields.RANGES,_Fields.PARAMS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RANGES, new org.apache.thrift.meta_data.FieldMetaData("ranges", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TFileRangeDesc.class))));
    tmpMap.put(_Fields.PARAMS, new org.apache.thrift.meta_data.FieldMetaData("params", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TFileScanRangeParams.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TFileScanRange.class, metaDataMap);
  }

  public TFileScanRange() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TFileScanRange(TFileScanRange other) {
    if (other.isSetRanges()) {
      java.util.List<TFileRangeDesc> __this__ranges = new java.util.ArrayList<TFileRangeDesc>(other.ranges.size());
      for (TFileRangeDesc other_element : other.ranges) {
        __this__ranges.add(new TFileRangeDesc(other_element));
      }
      this.ranges = __this__ranges;
    }
    if (other.isSetParams()) {
      this.params = new TFileScanRangeParams(other.params);
    }
  }

  public TFileScanRange deepCopy() {
    return new TFileScanRange(this);
  }

  @Override
  public void clear() {
    this.ranges = null;
    this.params = null;
  }

  public int getRangesSize() {
    return (this.ranges == null) ? 0 : this.ranges.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TFileRangeDesc> getRangesIterator() {
    return (this.ranges == null) ? null : this.ranges.iterator();
  }

  public void addToRanges(TFileRangeDesc elem) {
    if (this.ranges == null) {
      this.ranges = new java.util.ArrayList<TFileRangeDesc>();
    }
    this.ranges.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TFileRangeDesc> getRanges() {
    return this.ranges;
  }

  public TFileScanRange setRanges(@org.apache.thrift.annotation.Nullable java.util.List<TFileRangeDesc> ranges) {
    this.ranges = ranges;
    return this;
  }

  public void unsetRanges() {
    this.ranges = null;
  }

  /** Returns true if field ranges is set (has been assigned a value) and false otherwise */
  public boolean isSetRanges() {
    return this.ranges != null;
  }

  public void setRangesIsSet(boolean value) {
    if (!value) {
      this.ranges = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TFileScanRangeParams getParams() {
    return this.params;
  }

  public TFileScanRange setParams(@org.apache.thrift.annotation.Nullable TFileScanRangeParams params) {
    this.params = params;
    return this;
  }

  public void unsetParams() {
    this.params = null;
  }

  /** Returns true if field params is set (has been assigned a value) and false otherwise */
  public boolean isSetParams() {
    return this.params != null;
  }

  public void setParamsIsSet(boolean value) {
    if (!value) {
      this.params = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case RANGES:
      if (value == null) {
        unsetRanges();
      } else {
        setRanges((java.util.List<TFileRangeDesc>)value);
      }
      break;

    case PARAMS:
      if (value == null) {
        unsetParams();
      } else {
        setParams((TFileScanRangeParams)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case RANGES:
      return getRanges();

    case PARAMS:
      return getParams();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case RANGES:
      return isSetRanges();
    case PARAMS:
      return isSetParams();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TFileScanRange)
      return this.equals((TFileScanRange)that);
    return false;
  }

  public boolean equals(TFileScanRange that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_ranges = true && this.isSetRanges();
    boolean that_present_ranges = true && that.isSetRanges();
    if (this_present_ranges || that_present_ranges) {
      if (!(this_present_ranges && that_present_ranges))
        return false;
      if (!this.ranges.equals(that.ranges))
        return false;
    }

    boolean this_present_params = true && this.isSetParams();
    boolean that_present_params = true && that.isSetParams();
    if (this_present_params || that_present_params) {
      if (!(this_present_params && that_present_params))
        return false;
      if (!this.params.equals(that.params))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetRanges()) ? 131071 : 524287);
    if (isSetRanges())
      hashCode = hashCode * 8191 + ranges.hashCode();

    hashCode = hashCode * 8191 + ((isSetParams()) ? 131071 : 524287);
    if (isSetParams())
      hashCode = hashCode * 8191 + params.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TFileScanRange other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetRanges(), other.isSetRanges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRanges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ranges, other.ranges);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetParams(), other.isSetParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.params, other.params);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TFileScanRange(");
    boolean first = true;

    if (isSetRanges()) {
      sb.append("ranges:");
      if (this.ranges == null) {
        sb.append("null");
      } else {
        sb.append(this.ranges);
      }
      first = false;
    }
    if (isSetParams()) {
      if (!first) sb.append(", ");
      sb.append("params:");
      if (this.params == null) {
        sb.append("null");
      } else {
        sb.append(this.params);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (params != null) {
      params.validate();
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

  private static class TFileScanRangeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TFileScanRangeStandardScheme getScheme() {
      return new TFileScanRangeStandardScheme();
    }
  }

  private static class TFileScanRangeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TFileScanRange> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TFileScanRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RANGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list274 = iprot.readListBegin();
                struct.ranges = new java.util.ArrayList<TFileRangeDesc>(_list274.size);
                @org.apache.thrift.annotation.Nullable TFileRangeDesc _elem275;
                for (int _i276 = 0; _i276 < _list274.size; ++_i276)
                {
                  _elem275 = new TFileRangeDesc();
                  _elem275.read(iprot);
                  struct.ranges.add(_elem275);
                }
                iprot.readListEnd();
              }
              struct.setRangesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.params = new TFileScanRangeParams();
              struct.params.read(iprot);
              struct.setParamsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TFileScanRange struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ranges != null) {
        if (struct.isSetRanges()) {
          oprot.writeFieldBegin(RANGES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.ranges.size()));
            for (TFileRangeDesc _iter277 : struct.ranges)
            {
              _iter277.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.params != null) {
        if (struct.isSetParams()) {
          oprot.writeFieldBegin(PARAMS_FIELD_DESC);
          struct.params.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TFileScanRangeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TFileScanRangeTupleScheme getScheme() {
      return new TFileScanRangeTupleScheme();
    }
  }

  private static class TFileScanRangeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TFileScanRange> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TFileScanRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetRanges()) {
        optionals.set(0);
      }
      if (struct.isSetParams()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetRanges()) {
        {
          oprot.writeI32(struct.ranges.size());
          for (TFileRangeDesc _iter278 : struct.ranges)
          {
            _iter278.write(oprot);
          }
        }
      }
      if (struct.isSetParams()) {
        struct.params.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TFileScanRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list279 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.ranges = new java.util.ArrayList<TFileRangeDesc>(_list279.size);
          @org.apache.thrift.annotation.Nullable TFileRangeDesc _elem280;
          for (int _i281 = 0; _i281 < _list279.size; ++_i281)
          {
            _elem280 = new TFileRangeDesc();
            _elem280.read(iprot);
            struct.ranges.add(_elem280);
          }
        }
        struct.setRangesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.params = new TFileScanRangeParams();
        struct.params.read(iprot);
        struct.setParamsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
