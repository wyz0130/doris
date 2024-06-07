/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TTabletCommitInfo implements org.apache.thrift.TBase<TTabletCommitInfo, TTabletCommitInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TTabletCommitInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTabletCommitInfo");

  private static final org.apache.thrift.protocol.TField TABLET_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tabletId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField BACKEND_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("backendId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField INVALID_DICT_COLS_FIELD_DESC = new org.apache.thrift.protocol.TField("invalid_dict_cols", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTabletCommitInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTabletCommitInfoTupleSchemeFactory();

  public long tabletId; // required
  public long backendId; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> invalid_dict_cols; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLET_ID((short)1, "tabletId"),
    BACKEND_ID((short)2, "backendId"),
    INVALID_DICT_COLS((short)3, "invalid_dict_cols");

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
        case 1: // TABLET_ID
          return TABLET_ID;
        case 2: // BACKEND_ID
          return BACKEND_ID;
        case 3: // INVALID_DICT_COLS
          return INVALID_DICT_COLS;
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
  private static final int __TABLETID_ISSET_ID = 0;
  private static final int __BACKENDID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.INVALID_DICT_COLS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLET_ID, new org.apache.thrift.meta_data.FieldMetaData("tabletId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.BACKEND_ID, new org.apache.thrift.meta_data.FieldMetaData("backendId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.INVALID_DICT_COLS, new org.apache.thrift.meta_data.FieldMetaData("invalid_dict_cols", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTabletCommitInfo.class, metaDataMap);
  }

  public TTabletCommitInfo() {
  }

  public TTabletCommitInfo(
    long tabletId,
    long backendId)
  {
    this();
    this.tabletId = tabletId;
    setTabletIdIsSet(true);
    this.backendId = backendId;
    setBackendIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTabletCommitInfo(TTabletCommitInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.tabletId = other.tabletId;
    this.backendId = other.backendId;
    if (other.isSetInvalidDictCols()) {
      java.util.List<java.lang.String> __this__invalid_dict_cols = new java.util.ArrayList<java.lang.String>(other.invalid_dict_cols);
      this.invalid_dict_cols = __this__invalid_dict_cols;
    }
  }

  public TTabletCommitInfo deepCopy() {
    return new TTabletCommitInfo(this);
  }

  @Override
  public void clear() {
    setTabletIdIsSet(false);
    this.tabletId = 0;
    setBackendIdIsSet(false);
    this.backendId = 0;
    this.invalid_dict_cols = null;
  }

  public long getTabletId() {
    return this.tabletId;
  }

  public TTabletCommitInfo setTabletId(long tabletId) {
    this.tabletId = tabletId;
    setTabletIdIsSet(true);
    return this;
  }

  public void unsetTabletId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TABLETID_ISSET_ID);
  }

  /** Returns true if field tabletId is set (has been assigned a value) and false otherwise */
  public boolean isSetTabletId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TABLETID_ISSET_ID);
  }

  public void setTabletIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TABLETID_ISSET_ID, value);
  }

  public long getBackendId() {
    return this.backendId;
  }

  public TTabletCommitInfo setBackendId(long backendId) {
    this.backendId = backendId;
    setBackendIdIsSet(true);
    return this;
  }

  public void unsetBackendId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BACKENDID_ISSET_ID);
  }

  /** Returns true if field backendId is set (has been assigned a value) and false otherwise */
  public boolean isSetBackendId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BACKENDID_ISSET_ID);
  }

  public void setBackendIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BACKENDID_ISSET_ID, value);
  }

  public int getInvalidDictColsSize() {
    return (this.invalid_dict_cols == null) ? 0 : this.invalid_dict_cols.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getInvalidDictColsIterator() {
    return (this.invalid_dict_cols == null) ? null : this.invalid_dict_cols.iterator();
  }

  public void addToInvalidDictCols(java.lang.String elem) {
    if (this.invalid_dict_cols == null) {
      this.invalid_dict_cols = new java.util.ArrayList<java.lang.String>();
    }
    this.invalid_dict_cols.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getInvalidDictCols() {
    return this.invalid_dict_cols;
  }

  public TTabletCommitInfo setInvalidDictCols(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> invalid_dict_cols) {
    this.invalid_dict_cols = invalid_dict_cols;
    return this;
  }

  public void unsetInvalidDictCols() {
    this.invalid_dict_cols = null;
  }

  /** Returns true if field invalid_dict_cols is set (has been assigned a value) and false otherwise */
  public boolean isSetInvalidDictCols() {
    return this.invalid_dict_cols != null;
  }

  public void setInvalidDictColsIsSet(boolean value) {
    if (!value) {
      this.invalid_dict_cols = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TABLET_ID:
      if (value == null) {
        unsetTabletId();
      } else {
        setTabletId((java.lang.Long)value);
      }
      break;

    case BACKEND_ID:
      if (value == null) {
        unsetBackendId();
      } else {
        setBackendId((java.lang.Long)value);
      }
      break;

    case INVALID_DICT_COLS:
      if (value == null) {
        unsetInvalidDictCols();
      } else {
        setInvalidDictCols((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLET_ID:
      return getTabletId();

    case BACKEND_ID:
      return getBackendId();

    case INVALID_DICT_COLS:
      return getInvalidDictCols();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TABLET_ID:
      return isSetTabletId();
    case BACKEND_ID:
      return isSetBackendId();
    case INVALID_DICT_COLS:
      return isSetInvalidDictCols();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TTabletCommitInfo)
      return this.equals((TTabletCommitInfo)that);
    return false;
  }

  public boolean equals(TTabletCommitInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tabletId = true;
    boolean that_present_tabletId = true;
    if (this_present_tabletId || that_present_tabletId) {
      if (!(this_present_tabletId && that_present_tabletId))
        return false;
      if (this.tabletId != that.tabletId)
        return false;
    }

    boolean this_present_backendId = true;
    boolean that_present_backendId = true;
    if (this_present_backendId || that_present_backendId) {
      if (!(this_present_backendId && that_present_backendId))
        return false;
      if (this.backendId != that.backendId)
        return false;
    }

    boolean this_present_invalid_dict_cols = true && this.isSetInvalidDictCols();
    boolean that_present_invalid_dict_cols = true && that.isSetInvalidDictCols();
    if (this_present_invalid_dict_cols || that_present_invalid_dict_cols) {
      if (!(this_present_invalid_dict_cols && that_present_invalid_dict_cols))
        return false;
      if (!this.invalid_dict_cols.equals(that.invalid_dict_cols))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(tabletId);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(backendId);

    hashCode = hashCode * 8191 + ((isSetInvalidDictCols()) ? 131071 : 524287);
    if (isSetInvalidDictCols())
      hashCode = hashCode * 8191 + invalid_dict_cols.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TTabletCommitInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTabletId(), other.isSetTabletId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTabletId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tabletId, other.tabletId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBackendId(), other.isSetBackendId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBackendId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.backendId, other.backendId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetInvalidDictCols(), other.isSetInvalidDictCols());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInvalidDictCols()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.invalid_dict_cols, other.invalid_dict_cols);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TTabletCommitInfo(");
    boolean first = true;

    sb.append("tabletId:");
    sb.append(this.tabletId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("backendId:");
    sb.append(this.backendId);
    first = false;
    if (isSetInvalidDictCols()) {
      if (!first) sb.append(", ");
      sb.append("invalid_dict_cols:");
      if (this.invalid_dict_cols == null) {
        sb.append("null");
      } else {
        sb.append(this.invalid_dict_cols);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'tabletId' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'backendId' because it's a primitive and you chose the non-beans generator.
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TTabletCommitInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTabletCommitInfoStandardScheme getScheme() {
      return new TTabletCommitInfoStandardScheme();
    }
  }

  private static class TTabletCommitInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTabletCommitInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTabletCommitInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLET_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.tabletId = iprot.readI64();
              struct.setTabletIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BACKEND_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.backendId = iprot.readI64();
              struct.setBackendIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INVALID_DICT_COLS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list56 = iprot.readListBegin();
                struct.invalid_dict_cols = new java.util.ArrayList<java.lang.String>(_list56.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem57;
                for (int _i58 = 0; _i58 < _list56.size; ++_i58)
                {
                  _elem57 = iprot.readString();
                  struct.invalid_dict_cols.add(_elem57);
                }
                iprot.readListEnd();
              }
              struct.setInvalidDictColsIsSet(true);
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
      if (!struct.isSetTabletId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'tabletId' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetBackendId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'backendId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTabletCommitInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TABLET_ID_FIELD_DESC);
      oprot.writeI64(struct.tabletId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BACKEND_ID_FIELD_DESC);
      oprot.writeI64(struct.backendId);
      oprot.writeFieldEnd();
      if (struct.invalid_dict_cols != null) {
        if (struct.isSetInvalidDictCols()) {
          oprot.writeFieldBegin(INVALID_DICT_COLS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.invalid_dict_cols.size()));
            for (java.lang.String _iter59 : struct.invalid_dict_cols)
            {
              oprot.writeString(_iter59);
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

  private static class TTabletCommitInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTabletCommitInfoTupleScheme getScheme() {
      return new TTabletCommitInfoTupleScheme();
    }
  }

  private static class TTabletCommitInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTabletCommitInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTabletCommitInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.tabletId);
      oprot.writeI64(struct.backendId);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetInvalidDictCols()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetInvalidDictCols()) {
        {
          oprot.writeI32(struct.invalid_dict_cols.size());
          for (java.lang.String _iter60 : struct.invalid_dict_cols)
          {
            oprot.writeString(_iter60);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTabletCommitInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.tabletId = iprot.readI64();
      struct.setTabletIdIsSet(true);
      struct.backendId = iprot.readI64();
      struct.setBackendIdIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list61 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.invalid_dict_cols = new java.util.ArrayList<java.lang.String>(_list61.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem62;
          for (int _i63 = 0; _i63 < _list61.size; ++_i63)
          {
            _elem62 = iprot.readString();
            struct.invalid_dict_cols.add(_elem62);
          }
        }
        struct.setInvalidDictColsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

