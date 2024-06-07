/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TUpdateFollowerStatsCacheRequest implements org.apache.thrift.TBase<TUpdateFollowerStatsCacheRequest, TUpdateFollowerStatsCacheRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TUpdateFollowerStatsCacheRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TUpdateFollowerStatsCacheRequest");

  private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField STATS_ROWS_FIELD_DESC = new org.apache.thrift.protocol.TField("statsRows", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField COL_STATS_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("colStatsData", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TUpdateFollowerStatsCacheRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TUpdateFollowerStatsCacheRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String key; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> statsRows; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String colStatsData; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    KEY((short)1, "key"),
    STATS_ROWS((short)2, "statsRows"),
    COL_STATS_DATA((short)3, "colStatsData");

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
        case 1: // KEY
          return KEY;
        case 2: // STATS_ROWS
          return STATS_ROWS;
        case 3: // COL_STATS_DATA
          return COL_STATS_DATA;
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
  private static final _Fields optionals[] = {_Fields.KEY,_Fields.STATS_ROWS,_Fields.COL_STATS_DATA};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEY, new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATS_ROWS, new org.apache.thrift.meta_data.FieldMetaData("statsRows", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.COL_STATS_DATA, new org.apache.thrift.meta_data.FieldMetaData("colStatsData", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TUpdateFollowerStatsCacheRequest.class, metaDataMap);
  }

  public TUpdateFollowerStatsCacheRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TUpdateFollowerStatsCacheRequest(TUpdateFollowerStatsCacheRequest other) {
    if (other.isSetKey()) {
      this.key = other.key;
    }
    if (other.isSetStatsRows()) {
      java.util.List<java.lang.String> __this__statsRows = new java.util.ArrayList<java.lang.String>(other.statsRows);
      this.statsRows = __this__statsRows;
    }
    if (other.isSetColStatsData()) {
      this.colStatsData = other.colStatsData;
    }
  }

  public TUpdateFollowerStatsCacheRequest deepCopy() {
    return new TUpdateFollowerStatsCacheRequest(this);
  }

  @Override
  public void clear() {
    this.key = null;
    this.statsRows = null;
    this.colStatsData = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getKey() {
    return this.key;
  }

  public TUpdateFollowerStatsCacheRequest setKey(@org.apache.thrift.annotation.Nullable java.lang.String key) {
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

  public int getStatsRowsSize() {
    return (this.statsRows == null) ? 0 : this.statsRows.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getStatsRowsIterator() {
    return (this.statsRows == null) ? null : this.statsRows.iterator();
  }

  public void addToStatsRows(java.lang.String elem) {
    if (this.statsRows == null) {
      this.statsRows = new java.util.ArrayList<java.lang.String>();
    }
    this.statsRows.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getStatsRows() {
    return this.statsRows;
  }

  public TUpdateFollowerStatsCacheRequest setStatsRows(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> statsRows) {
    this.statsRows = statsRows;
    return this;
  }

  public void unsetStatsRows() {
    this.statsRows = null;
  }

  /** Returns true if field statsRows is set (has been assigned a value) and false otherwise */
  public boolean isSetStatsRows() {
    return this.statsRows != null;
  }

  public void setStatsRowsIsSet(boolean value) {
    if (!value) {
      this.statsRows = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getColStatsData() {
    return this.colStatsData;
  }

  public TUpdateFollowerStatsCacheRequest setColStatsData(@org.apache.thrift.annotation.Nullable java.lang.String colStatsData) {
    this.colStatsData = colStatsData;
    return this;
  }

  public void unsetColStatsData() {
    this.colStatsData = null;
  }

  /** Returns true if field colStatsData is set (has been assigned a value) and false otherwise */
  public boolean isSetColStatsData() {
    return this.colStatsData != null;
  }

  public void setColStatsDataIsSet(boolean value) {
    if (!value) {
      this.colStatsData = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case KEY:
      if (value == null) {
        unsetKey();
      } else {
        setKey((java.lang.String)value);
      }
      break;

    case STATS_ROWS:
      if (value == null) {
        unsetStatsRows();
      } else {
        setStatsRows((java.util.List<java.lang.String>)value);
      }
      break;

    case COL_STATS_DATA:
      if (value == null) {
        unsetColStatsData();
      } else {
        setColStatsData((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case KEY:
      return getKey();

    case STATS_ROWS:
      return getStatsRows();

    case COL_STATS_DATA:
      return getColStatsData();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case KEY:
      return isSetKey();
    case STATS_ROWS:
      return isSetStatsRows();
    case COL_STATS_DATA:
      return isSetColStatsData();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TUpdateFollowerStatsCacheRequest)
      return this.equals((TUpdateFollowerStatsCacheRequest)that);
    return false;
  }

  public boolean equals(TUpdateFollowerStatsCacheRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_key = true && this.isSetKey();
    boolean that_present_key = true && that.isSetKey();
    if (this_present_key || that_present_key) {
      if (!(this_present_key && that_present_key))
        return false;
      if (!this.key.equals(that.key))
        return false;
    }

    boolean this_present_statsRows = true && this.isSetStatsRows();
    boolean that_present_statsRows = true && that.isSetStatsRows();
    if (this_present_statsRows || that_present_statsRows) {
      if (!(this_present_statsRows && that_present_statsRows))
        return false;
      if (!this.statsRows.equals(that.statsRows))
        return false;
    }

    boolean this_present_colStatsData = true && this.isSetColStatsData();
    boolean that_present_colStatsData = true && that.isSetColStatsData();
    if (this_present_colStatsData || that_present_colStatsData) {
      if (!(this_present_colStatsData && that_present_colStatsData))
        return false;
      if (!this.colStatsData.equals(that.colStatsData))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetKey()) ? 131071 : 524287);
    if (isSetKey())
      hashCode = hashCode * 8191 + key.hashCode();

    hashCode = hashCode * 8191 + ((isSetStatsRows()) ? 131071 : 524287);
    if (isSetStatsRows())
      hashCode = hashCode * 8191 + statsRows.hashCode();

    hashCode = hashCode * 8191 + ((isSetColStatsData()) ? 131071 : 524287);
    if (isSetColStatsData())
      hashCode = hashCode * 8191 + colStatsData.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TUpdateFollowerStatsCacheRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.compare(isSetStatsRows(), other.isSetStatsRows());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatsRows()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statsRows, other.statsRows);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetColStatsData(), other.isSetColStatsData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColStatsData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.colStatsData, other.colStatsData);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TUpdateFollowerStatsCacheRequest(");
    boolean first = true;

    if (isSetKey()) {
      sb.append("key:");
      if (this.key == null) {
        sb.append("null");
      } else {
        sb.append(this.key);
      }
      first = false;
    }
    if (isSetStatsRows()) {
      if (!first) sb.append(", ");
      sb.append("statsRows:");
      if (this.statsRows == null) {
        sb.append("null");
      } else {
        sb.append(this.statsRows);
      }
      first = false;
    }
    if (isSetColStatsData()) {
      if (!first) sb.append(", ");
      sb.append("colStatsData:");
      if (this.colStatsData == null) {
        sb.append("null");
      } else {
        sb.append(this.colStatsData);
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

  private static class TUpdateFollowerStatsCacheRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TUpdateFollowerStatsCacheRequestStandardScheme getScheme() {
      return new TUpdateFollowerStatsCacheRequestStandardScheme();
    }
  }

  private static class TUpdateFollowerStatsCacheRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TUpdateFollowerStatsCacheRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TUpdateFollowerStatsCacheRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.key = iprot.readString();
              struct.setKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATS_ROWS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list552 = iprot.readListBegin();
                struct.statsRows = new java.util.ArrayList<java.lang.String>(_list552.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem553;
                for (int _i554 = 0; _i554 < _list552.size; ++_i554)
                {
                  _elem553 = iprot.readString();
                  struct.statsRows.add(_elem553);
                }
                iprot.readListEnd();
              }
              struct.setStatsRowsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COL_STATS_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.colStatsData = iprot.readString();
              struct.setColStatsDataIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TUpdateFollowerStatsCacheRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.key != null) {
        if (struct.isSetKey()) {
          oprot.writeFieldBegin(KEY_FIELD_DESC);
          oprot.writeString(struct.key);
          oprot.writeFieldEnd();
        }
      }
      if (struct.statsRows != null) {
        if (struct.isSetStatsRows()) {
          oprot.writeFieldBegin(STATS_ROWS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.statsRows.size()));
            for (java.lang.String _iter555 : struct.statsRows)
            {
              oprot.writeString(_iter555);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.colStatsData != null) {
        if (struct.isSetColStatsData()) {
          oprot.writeFieldBegin(COL_STATS_DATA_FIELD_DESC);
          oprot.writeString(struct.colStatsData);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TUpdateFollowerStatsCacheRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TUpdateFollowerStatsCacheRequestTupleScheme getScheme() {
      return new TUpdateFollowerStatsCacheRequestTupleScheme();
    }
  }

  private static class TUpdateFollowerStatsCacheRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TUpdateFollowerStatsCacheRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TUpdateFollowerStatsCacheRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetKey()) {
        optionals.set(0);
      }
      if (struct.isSetStatsRows()) {
        optionals.set(1);
      }
      if (struct.isSetColStatsData()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetKey()) {
        oprot.writeString(struct.key);
      }
      if (struct.isSetStatsRows()) {
        {
          oprot.writeI32(struct.statsRows.size());
          for (java.lang.String _iter556 : struct.statsRows)
          {
            oprot.writeString(_iter556);
          }
        }
      }
      if (struct.isSetColStatsData()) {
        oprot.writeString(struct.colStatsData);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TUpdateFollowerStatsCacheRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.key = iprot.readString();
        struct.setKeyIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list557 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.statsRows = new java.util.ArrayList<java.lang.String>(_list557.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem558;
          for (int _i559 = 0; _i559 < _list557.size; ++_i559)
          {
            _elem558 = iprot.readString();
            struct.statsRows.add(_elem558);
          }
        }
        struct.setStatsRowsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.colStatsData = iprot.readString();
        struct.setColStatsDataIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
