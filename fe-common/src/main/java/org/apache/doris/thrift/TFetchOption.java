/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TFetchOption implements org.apache.thrift.TBase<TFetchOption, TFetchOption._Fields>, java.io.Serializable, Cloneable, Comparable<TFetchOption> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TFetchOption");

  private static final org.apache.thrift.protocol.TField USE_TWO_PHASE_FETCH_FIELD_DESC = new org.apache.thrift.protocol.TField("use_two_phase_fetch", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField NODES_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("nodes_info", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField FETCH_ROW_STORE_FIELD_DESC = new org.apache.thrift.protocol.TField("fetch_row_store", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField COLUMN_DESC_FIELD_DESC = new org.apache.thrift.protocol.TField("column_desc", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TFetchOptionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TFetchOptionTupleSchemeFactory();

  public boolean use_two_phase_fetch; // optional
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TPaloNodesInfo nodes_info; // optional
  public boolean fetch_row_store; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TColumn> column_desc; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USE_TWO_PHASE_FETCH((short)1, "use_two_phase_fetch"),
    NODES_INFO((short)2, "nodes_info"),
    FETCH_ROW_STORE((short)3, "fetch_row_store"),
    COLUMN_DESC((short)4, "column_desc");

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
        case 1: // USE_TWO_PHASE_FETCH
          return USE_TWO_PHASE_FETCH;
        case 2: // NODES_INFO
          return NODES_INFO;
        case 3: // FETCH_ROW_STORE
          return FETCH_ROW_STORE;
        case 4: // COLUMN_DESC
          return COLUMN_DESC;
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
  private static final int __USE_TWO_PHASE_FETCH_ISSET_ID = 0;
  private static final int __FETCH_ROW_STORE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.USE_TWO_PHASE_FETCH,_Fields.NODES_INFO,_Fields.FETCH_ROW_STORE,_Fields.COLUMN_DESC};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USE_TWO_PHASE_FETCH, new org.apache.thrift.meta_data.FieldMetaData("use_two_phase_fetch", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.NODES_INFO, new org.apache.thrift.meta_data.FieldMetaData("nodes_info", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TPaloNodesInfo.class)));
    tmpMap.put(_Fields.FETCH_ROW_STORE, new org.apache.thrift.meta_data.FieldMetaData("fetch_row_store", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.COLUMN_DESC, new org.apache.thrift.meta_data.FieldMetaData("column_desc", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TColumn.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TFetchOption.class, metaDataMap);
  }

  public TFetchOption() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TFetchOption(TFetchOption other) {
    __isset_bitfield = other.__isset_bitfield;
    this.use_two_phase_fetch = other.use_two_phase_fetch;
    if (other.isSetNodesInfo()) {
      this.nodes_info = new org.apache.doris.thrift.TPaloNodesInfo(other.nodes_info);
    }
    this.fetch_row_store = other.fetch_row_store;
    if (other.isSetColumnDesc()) {
      java.util.List<org.apache.doris.thrift.TColumn> __this__column_desc = new java.util.ArrayList<org.apache.doris.thrift.TColumn>(other.column_desc.size());
      for (org.apache.doris.thrift.TColumn other_element : other.column_desc) {
        __this__column_desc.add(new org.apache.doris.thrift.TColumn(other_element));
      }
      this.column_desc = __this__column_desc;
    }
  }

  public TFetchOption deepCopy() {
    return new TFetchOption(this);
  }

  @Override
  public void clear() {
    setUseTwoPhaseFetchIsSet(false);
    this.use_two_phase_fetch = false;
    this.nodes_info = null;
    setFetchRowStoreIsSet(false);
    this.fetch_row_store = false;
    this.column_desc = null;
  }

  public boolean isUseTwoPhaseFetch() {
    return this.use_two_phase_fetch;
  }

  public TFetchOption setUseTwoPhaseFetch(boolean use_two_phase_fetch) {
    this.use_two_phase_fetch = use_two_phase_fetch;
    setUseTwoPhaseFetchIsSet(true);
    return this;
  }

  public void unsetUseTwoPhaseFetch() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USE_TWO_PHASE_FETCH_ISSET_ID);
  }

  /** Returns true if field use_two_phase_fetch is set (has been assigned a value) and false otherwise */
  public boolean isSetUseTwoPhaseFetch() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USE_TWO_PHASE_FETCH_ISSET_ID);
  }

  public void setUseTwoPhaseFetchIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USE_TWO_PHASE_FETCH_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TPaloNodesInfo getNodesInfo() {
    return this.nodes_info;
  }

  public TFetchOption setNodesInfo(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TPaloNodesInfo nodes_info) {
    this.nodes_info = nodes_info;
    return this;
  }

  public void unsetNodesInfo() {
    this.nodes_info = null;
  }

  /** Returns true if field nodes_info is set (has been assigned a value) and false otherwise */
  public boolean isSetNodesInfo() {
    return this.nodes_info != null;
  }

  public void setNodesInfoIsSet(boolean value) {
    if (!value) {
      this.nodes_info = null;
    }
  }

  public boolean isFetchRowStore() {
    return this.fetch_row_store;
  }

  public TFetchOption setFetchRowStore(boolean fetch_row_store) {
    this.fetch_row_store = fetch_row_store;
    setFetchRowStoreIsSet(true);
    return this;
  }

  public void unsetFetchRowStore() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FETCH_ROW_STORE_ISSET_ID);
  }

  /** Returns true if field fetch_row_store is set (has been assigned a value) and false otherwise */
  public boolean isSetFetchRowStore() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FETCH_ROW_STORE_ISSET_ID);
  }

  public void setFetchRowStoreIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FETCH_ROW_STORE_ISSET_ID, value);
  }

  public int getColumnDescSize() {
    return (this.column_desc == null) ? 0 : this.column_desc.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<org.apache.doris.thrift.TColumn> getColumnDescIterator() {
    return (this.column_desc == null) ? null : this.column_desc.iterator();
  }

  public void addToColumnDesc(org.apache.doris.thrift.TColumn elem) {
    if (this.column_desc == null) {
      this.column_desc = new java.util.ArrayList<org.apache.doris.thrift.TColumn>();
    }
    this.column_desc.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<org.apache.doris.thrift.TColumn> getColumnDesc() {
    return this.column_desc;
  }

  public TFetchOption setColumnDesc(@org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TColumn> column_desc) {
    this.column_desc = column_desc;
    return this;
  }

  public void unsetColumnDesc() {
    this.column_desc = null;
  }

  /** Returns true if field column_desc is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnDesc() {
    return this.column_desc != null;
  }

  public void setColumnDescIsSet(boolean value) {
    if (!value) {
      this.column_desc = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case USE_TWO_PHASE_FETCH:
      if (value == null) {
        unsetUseTwoPhaseFetch();
      } else {
        setUseTwoPhaseFetch((java.lang.Boolean)value);
      }
      break;

    case NODES_INFO:
      if (value == null) {
        unsetNodesInfo();
      } else {
        setNodesInfo((org.apache.doris.thrift.TPaloNodesInfo)value);
      }
      break;

    case FETCH_ROW_STORE:
      if (value == null) {
        unsetFetchRowStore();
      } else {
        setFetchRowStore((java.lang.Boolean)value);
      }
      break;

    case COLUMN_DESC:
      if (value == null) {
        unsetColumnDesc();
      } else {
        setColumnDesc((java.util.List<org.apache.doris.thrift.TColumn>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USE_TWO_PHASE_FETCH:
      return isUseTwoPhaseFetch();

    case NODES_INFO:
      return getNodesInfo();

    case FETCH_ROW_STORE:
      return isFetchRowStore();

    case COLUMN_DESC:
      return getColumnDesc();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USE_TWO_PHASE_FETCH:
      return isSetUseTwoPhaseFetch();
    case NODES_INFO:
      return isSetNodesInfo();
    case FETCH_ROW_STORE:
      return isSetFetchRowStore();
    case COLUMN_DESC:
      return isSetColumnDesc();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TFetchOption)
      return this.equals((TFetchOption)that);
    return false;
  }

  public boolean equals(TFetchOption that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_use_two_phase_fetch = true && this.isSetUseTwoPhaseFetch();
    boolean that_present_use_two_phase_fetch = true && that.isSetUseTwoPhaseFetch();
    if (this_present_use_two_phase_fetch || that_present_use_two_phase_fetch) {
      if (!(this_present_use_two_phase_fetch && that_present_use_two_phase_fetch))
        return false;
      if (this.use_two_phase_fetch != that.use_two_phase_fetch)
        return false;
    }

    boolean this_present_nodes_info = true && this.isSetNodesInfo();
    boolean that_present_nodes_info = true && that.isSetNodesInfo();
    if (this_present_nodes_info || that_present_nodes_info) {
      if (!(this_present_nodes_info && that_present_nodes_info))
        return false;
      if (!this.nodes_info.equals(that.nodes_info))
        return false;
    }

    boolean this_present_fetch_row_store = true && this.isSetFetchRowStore();
    boolean that_present_fetch_row_store = true && that.isSetFetchRowStore();
    if (this_present_fetch_row_store || that_present_fetch_row_store) {
      if (!(this_present_fetch_row_store && that_present_fetch_row_store))
        return false;
      if (this.fetch_row_store != that.fetch_row_store)
        return false;
    }

    boolean this_present_column_desc = true && this.isSetColumnDesc();
    boolean that_present_column_desc = true && that.isSetColumnDesc();
    if (this_present_column_desc || that_present_column_desc) {
      if (!(this_present_column_desc && that_present_column_desc))
        return false;
      if (!this.column_desc.equals(that.column_desc))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUseTwoPhaseFetch()) ? 131071 : 524287);
    if (isSetUseTwoPhaseFetch())
      hashCode = hashCode * 8191 + ((use_two_phase_fetch) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetNodesInfo()) ? 131071 : 524287);
    if (isSetNodesInfo())
      hashCode = hashCode * 8191 + nodes_info.hashCode();

    hashCode = hashCode * 8191 + ((isSetFetchRowStore()) ? 131071 : 524287);
    if (isSetFetchRowStore())
      hashCode = hashCode * 8191 + ((fetch_row_store) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetColumnDesc()) ? 131071 : 524287);
    if (isSetColumnDesc())
      hashCode = hashCode * 8191 + column_desc.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TFetchOption other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetUseTwoPhaseFetch(), other.isSetUseTwoPhaseFetch());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUseTwoPhaseFetch()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.use_two_phase_fetch, other.use_two_phase_fetch);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetNodesInfo(), other.isSetNodesInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodesInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodes_info, other.nodes_info);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetFetchRowStore(), other.isSetFetchRowStore());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFetchRowStore()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fetch_row_store, other.fetch_row_store);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetColumnDesc(), other.isSetColumnDesc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnDesc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.column_desc, other.column_desc);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TFetchOption(");
    boolean first = true;

    if (isSetUseTwoPhaseFetch()) {
      sb.append("use_two_phase_fetch:");
      sb.append(this.use_two_phase_fetch);
      first = false;
    }
    if (isSetNodesInfo()) {
      if (!first) sb.append(", ");
      sb.append("nodes_info:");
      if (this.nodes_info == null) {
        sb.append("null");
      } else {
        sb.append(this.nodes_info);
      }
      first = false;
    }
    if (isSetFetchRowStore()) {
      if (!first) sb.append(", ");
      sb.append("fetch_row_store:");
      sb.append(this.fetch_row_store);
      first = false;
    }
    if (isSetColumnDesc()) {
      if (!first) sb.append(", ");
      sb.append("column_desc:");
      if (this.column_desc == null) {
        sb.append("null");
      } else {
        sb.append(this.column_desc);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (nodes_info != null) {
      nodes_info.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TFetchOptionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TFetchOptionStandardScheme getScheme() {
      return new TFetchOptionStandardScheme();
    }
  }

  private static class TFetchOptionStandardScheme extends org.apache.thrift.scheme.StandardScheme<TFetchOption> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TFetchOption struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USE_TWO_PHASE_FETCH
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.use_two_phase_fetch = iprot.readBool();
              struct.setUseTwoPhaseFetchIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NODES_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.nodes_info = new org.apache.doris.thrift.TPaloNodesInfo();
              struct.nodes_info.read(iprot);
              struct.setNodesInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FETCH_ROW_STORE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.fetch_row_store = iprot.readBool();
              struct.setFetchRowStoreIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COLUMN_DESC
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list100 = iprot.readListBegin();
                struct.column_desc = new java.util.ArrayList<org.apache.doris.thrift.TColumn>(_list100.size);
                @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TColumn _elem101;
                for (int _i102 = 0; _i102 < _list100.size; ++_i102)
                {
                  _elem101 = new org.apache.doris.thrift.TColumn();
                  _elem101.read(iprot);
                  struct.column_desc.add(_elem101);
                }
                iprot.readListEnd();
              }
              struct.setColumnDescIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TFetchOption struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetUseTwoPhaseFetch()) {
        oprot.writeFieldBegin(USE_TWO_PHASE_FETCH_FIELD_DESC);
        oprot.writeBool(struct.use_two_phase_fetch);
        oprot.writeFieldEnd();
      }
      if (struct.nodes_info != null) {
        if (struct.isSetNodesInfo()) {
          oprot.writeFieldBegin(NODES_INFO_FIELD_DESC);
          struct.nodes_info.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetFetchRowStore()) {
        oprot.writeFieldBegin(FETCH_ROW_STORE_FIELD_DESC);
        oprot.writeBool(struct.fetch_row_store);
        oprot.writeFieldEnd();
      }
      if (struct.column_desc != null) {
        if (struct.isSetColumnDesc()) {
          oprot.writeFieldBegin(COLUMN_DESC_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.column_desc.size()));
            for (org.apache.doris.thrift.TColumn _iter103 : struct.column_desc)
            {
              _iter103.write(oprot);
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

  private static class TFetchOptionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TFetchOptionTupleScheme getScheme() {
      return new TFetchOptionTupleScheme();
    }
  }

  private static class TFetchOptionTupleScheme extends org.apache.thrift.scheme.TupleScheme<TFetchOption> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TFetchOption struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUseTwoPhaseFetch()) {
        optionals.set(0);
      }
      if (struct.isSetNodesInfo()) {
        optionals.set(1);
      }
      if (struct.isSetFetchRowStore()) {
        optionals.set(2);
      }
      if (struct.isSetColumnDesc()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetUseTwoPhaseFetch()) {
        oprot.writeBool(struct.use_two_phase_fetch);
      }
      if (struct.isSetNodesInfo()) {
        struct.nodes_info.write(oprot);
      }
      if (struct.isSetFetchRowStore()) {
        oprot.writeBool(struct.fetch_row_store);
      }
      if (struct.isSetColumnDesc()) {
        {
          oprot.writeI32(struct.column_desc.size());
          for (org.apache.doris.thrift.TColumn _iter104 : struct.column_desc)
          {
            _iter104.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TFetchOption struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.use_two_phase_fetch = iprot.readBool();
        struct.setUseTwoPhaseFetchIsSet(true);
      }
      if (incoming.get(1)) {
        struct.nodes_info = new org.apache.doris.thrift.TPaloNodesInfo();
        struct.nodes_info.read(iprot);
        struct.setNodesInfoIsSet(true);
      }
      if (incoming.get(2)) {
        struct.fetch_row_store = iprot.readBool();
        struct.setFetchRowStoreIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list105 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.column_desc = new java.util.ArrayList<org.apache.doris.thrift.TColumn>(_list105.size);
          @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TColumn _elem106;
          for (int _i107 = 0; _i107 < _list105.size; ++_i107)
          {
            _elem106 = new org.apache.doris.thrift.TColumn();
            _elem106.read(iprot);
            struct.column_desc.add(_elem106);
          }
        }
        struct.setColumnDescIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

