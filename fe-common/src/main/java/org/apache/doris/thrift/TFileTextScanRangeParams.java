/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TFileTextScanRangeParams implements org.apache.thrift.TBase<TFileTextScanRangeParams, TFileTextScanRangeParams._Fields>, java.io.Serializable, Cloneable, Comparable<TFileTextScanRangeParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TFileTextScanRangeParams");

  private static final org.apache.thrift.protocol.TField COLUMN_SEPARATOR_FIELD_DESC = new org.apache.thrift.protocol.TField("column_separator", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField LINE_DELIMITER_FIELD_DESC = new org.apache.thrift.protocol.TField("line_delimiter", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COLLECTION_DELIMITER_FIELD_DESC = new org.apache.thrift.protocol.TField("collection_delimiter", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField MAPKV_DELIMITER_FIELD_DESC = new org.apache.thrift.protocol.TField("mapkv_delimiter", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField ENCLOSE_FIELD_DESC = new org.apache.thrift.protocol.TField("enclose", org.apache.thrift.protocol.TType.BYTE, (short)5);
  private static final org.apache.thrift.protocol.TField ESCAPE_FIELD_DESC = new org.apache.thrift.protocol.TField("escape", org.apache.thrift.protocol.TType.BYTE, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TFileTextScanRangeParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TFileTextScanRangeParamsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String column_separator; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String line_delimiter; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String collection_delimiter; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String mapkv_delimiter; // optional
  public byte enclose; // optional
  public byte escape; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COLUMN_SEPARATOR((short)1, "column_separator"),
    LINE_DELIMITER((short)2, "line_delimiter"),
    COLLECTION_DELIMITER((short)3, "collection_delimiter"),
    MAPKV_DELIMITER((short)4, "mapkv_delimiter"),
    ENCLOSE((short)5, "enclose"),
    ESCAPE((short)6, "escape");

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
        case 1: // COLUMN_SEPARATOR
          return COLUMN_SEPARATOR;
        case 2: // LINE_DELIMITER
          return LINE_DELIMITER;
        case 3: // COLLECTION_DELIMITER
          return COLLECTION_DELIMITER;
        case 4: // MAPKV_DELIMITER
          return MAPKV_DELIMITER;
        case 5: // ENCLOSE
          return ENCLOSE;
        case 6: // ESCAPE
          return ESCAPE;
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
  private static final int __ENCLOSE_ISSET_ID = 0;
  private static final int __ESCAPE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.COLUMN_SEPARATOR,_Fields.LINE_DELIMITER,_Fields.COLLECTION_DELIMITER,_Fields.MAPKV_DELIMITER,_Fields.ENCLOSE,_Fields.ESCAPE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COLUMN_SEPARATOR, new org.apache.thrift.meta_data.FieldMetaData("column_separator", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LINE_DELIMITER, new org.apache.thrift.meta_data.FieldMetaData("line_delimiter", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COLLECTION_DELIMITER, new org.apache.thrift.meta_data.FieldMetaData("collection_delimiter", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MAPKV_DELIMITER, new org.apache.thrift.meta_data.FieldMetaData("mapkv_delimiter", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ENCLOSE, new org.apache.thrift.meta_data.FieldMetaData("enclose", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.ESCAPE, new org.apache.thrift.meta_data.FieldMetaData("escape", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TFileTextScanRangeParams.class, metaDataMap);
  }

  public TFileTextScanRangeParams() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TFileTextScanRangeParams(TFileTextScanRangeParams other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetColumnSeparator()) {
      this.column_separator = other.column_separator;
    }
    if (other.isSetLineDelimiter()) {
      this.line_delimiter = other.line_delimiter;
    }
    if (other.isSetCollectionDelimiter()) {
      this.collection_delimiter = other.collection_delimiter;
    }
    if (other.isSetMapkvDelimiter()) {
      this.mapkv_delimiter = other.mapkv_delimiter;
    }
    this.enclose = other.enclose;
    this.escape = other.escape;
  }

  public TFileTextScanRangeParams deepCopy() {
    return new TFileTextScanRangeParams(this);
  }

  @Override
  public void clear() {
    this.column_separator = null;
    this.line_delimiter = null;
    this.collection_delimiter = null;
    this.mapkv_delimiter = null;
    setEncloseIsSet(false);
    this.enclose = 0;
    setEscapeIsSet(false);
    this.escape = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getColumnSeparator() {
    return this.column_separator;
  }

  public TFileTextScanRangeParams setColumnSeparator(@org.apache.thrift.annotation.Nullable java.lang.String column_separator) {
    this.column_separator = column_separator;
    return this;
  }

  public void unsetColumnSeparator() {
    this.column_separator = null;
  }

  /** Returns true if field column_separator is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnSeparator() {
    return this.column_separator != null;
  }

  public void setColumnSeparatorIsSet(boolean value) {
    if (!value) {
      this.column_separator = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getLineDelimiter() {
    return this.line_delimiter;
  }

  public TFileTextScanRangeParams setLineDelimiter(@org.apache.thrift.annotation.Nullable java.lang.String line_delimiter) {
    this.line_delimiter = line_delimiter;
    return this;
  }

  public void unsetLineDelimiter() {
    this.line_delimiter = null;
  }

  /** Returns true if field line_delimiter is set (has been assigned a value) and false otherwise */
  public boolean isSetLineDelimiter() {
    return this.line_delimiter != null;
  }

  public void setLineDelimiterIsSet(boolean value) {
    if (!value) {
      this.line_delimiter = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCollectionDelimiter() {
    return this.collection_delimiter;
  }

  public TFileTextScanRangeParams setCollectionDelimiter(@org.apache.thrift.annotation.Nullable java.lang.String collection_delimiter) {
    this.collection_delimiter = collection_delimiter;
    return this;
  }

  public void unsetCollectionDelimiter() {
    this.collection_delimiter = null;
  }

  /** Returns true if field collection_delimiter is set (has been assigned a value) and false otherwise */
  public boolean isSetCollectionDelimiter() {
    return this.collection_delimiter != null;
  }

  public void setCollectionDelimiterIsSet(boolean value) {
    if (!value) {
      this.collection_delimiter = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getMapkvDelimiter() {
    return this.mapkv_delimiter;
  }

  public TFileTextScanRangeParams setMapkvDelimiter(@org.apache.thrift.annotation.Nullable java.lang.String mapkv_delimiter) {
    this.mapkv_delimiter = mapkv_delimiter;
    return this;
  }

  public void unsetMapkvDelimiter() {
    this.mapkv_delimiter = null;
  }

  /** Returns true if field mapkv_delimiter is set (has been assigned a value) and false otherwise */
  public boolean isSetMapkvDelimiter() {
    return this.mapkv_delimiter != null;
  }

  public void setMapkvDelimiterIsSet(boolean value) {
    if (!value) {
      this.mapkv_delimiter = null;
    }
  }

  public byte getEnclose() {
    return this.enclose;
  }

  public TFileTextScanRangeParams setEnclose(byte enclose) {
    this.enclose = enclose;
    setEncloseIsSet(true);
    return this;
  }

  public void unsetEnclose() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ENCLOSE_ISSET_ID);
  }

  /** Returns true if field enclose is set (has been assigned a value) and false otherwise */
  public boolean isSetEnclose() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ENCLOSE_ISSET_ID);
  }

  public void setEncloseIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ENCLOSE_ISSET_ID, value);
  }

  public byte getEscape() {
    return this.escape;
  }

  public TFileTextScanRangeParams setEscape(byte escape) {
    this.escape = escape;
    setEscapeIsSet(true);
    return this;
  }

  public void unsetEscape() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ESCAPE_ISSET_ID);
  }

  /** Returns true if field escape is set (has been assigned a value) and false otherwise */
  public boolean isSetEscape() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ESCAPE_ISSET_ID);
  }

  public void setEscapeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ESCAPE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case COLUMN_SEPARATOR:
      if (value == null) {
        unsetColumnSeparator();
      } else {
        setColumnSeparator((java.lang.String)value);
      }
      break;

    case LINE_DELIMITER:
      if (value == null) {
        unsetLineDelimiter();
      } else {
        setLineDelimiter((java.lang.String)value);
      }
      break;

    case COLLECTION_DELIMITER:
      if (value == null) {
        unsetCollectionDelimiter();
      } else {
        setCollectionDelimiter((java.lang.String)value);
      }
      break;

    case MAPKV_DELIMITER:
      if (value == null) {
        unsetMapkvDelimiter();
      } else {
        setMapkvDelimiter((java.lang.String)value);
      }
      break;

    case ENCLOSE:
      if (value == null) {
        unsetEnclose();
      } else {
        setEnclose((java.lang.Byte)value);
      }
      break;

    case ESCAPE:
      if (value == null) {
        unsetEscape();
      } else {
        setEscape((java.lang.Byte)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case COLUMN_SEPARATOR:
      return getColumnSeparator();

    case LINE_DELIMITER:
      return getLineDelimiter();

    case COLLECTION_DELIMITER:
      return getCollectionDelimiter();

    case MAPKV_DELIMITER:
      return getMapkvDelimiter();

    case ENCLOSE:
      return getEnclose();

    case ESCAPE:
      return getEscape();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case COLUMN_SEPARATOR:
      return isSetColumnSeparator();
    case LINE_DELIMITER:
      return isSetLineDelimiter();
    case COLLECTION_DELIMITER:
      return isSetCollectionDelimiter();
    case MAPKV_DELIMITER:
      return isSetMapkvDelimiter();
    case ENCLOSE:
      return isSetEnclose();
    case ESCAPE:
      return isSetEscape();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TFileTextScanRangeParams)
      return this.equals((TFileTextScanRangeParams)that);
    return false;
  }

  public boolean equals(TFileTextScanRangeParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_column_separator = true && this.isSetColumnSeparator();
    boolean that_present_column_separator = true && that.isSetColumnSeparator();
    if (this_present_column_separator || that_present_column_separator) {
      if (!(this_present_column_separator && that_present_column_separator))
        return false;
      if (!this.column_separator.equals(that.column_separator))
        return false;
    }

    boolean this_present_line_delimiter = true && this.isSetLineDelimiter();
    boolean that_present_line_delimiter = true && that.isSetLineDelimiter();
    if (this_present_line_delimiter || that_present_line_delimiter) {
      if (!(this_present_line_delimiter && that_present_line_delimiter))
        return false;
      if (!this.line_delimiter.equals(that.line_delimiter))
        return false;
    }

    boolean this_present_collection_delimiter = true && this.isSetCollectionDelimiter();
    boolean that_present_collection_delimiter = true && that.isSetCollectionDelimiter();
    if (this_present_collection_delimiter || that_present_collection_delimiter) {
      if (!(this_present_collection_delimiter && that_present_collection_delimiter))
        return false;
      if (!this.collection_delimiter.equals(that.collection_delimiter))
        return false;
    }

    boolean this_present_mapkv_delimiter = true && this.isSetMapkvDelimiter();
    boolean that_present_mapkv_delimiter = true && that.isSetMapkvDelimiter();
    if (this_present_mapkv_delimiter || that_present_mapkv_delimiter) {
      if (!(this_present_mapkv_delimiter && that_present_mapkv_delimiter))
        return false;
      if (!this.mapkv_delimiter.equals(that.mapkv_delimiter))
        return false;
    }

    boolean this_present_enclose = true && this.isSetEnclose();
    boolean that_present_enclose = true && that.isSetEnclose();
    if (this_present_enclose || that_present_enclose) {
      if (!(this_present_enclose && that_present_enclose))
        return false;
      if (this.enclose != that.enclose)
        return false;
    }

    boolean this_present_escape = true && this.isSetEscape();
    boolean that_present_escape = true && that.isSetEscape();
    if (this_present_escape || that_present_escape) {
      if (!(this_present_escape && that_present_escape))
        return false;
      if (this.escape != that.escape)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetColumnSeparator()) ? 131071 : 524287);
    if (isSetColumnSeparator())
      hashCode = hashCode * 8191 + column_separator.hashCode();

    hashCode = hashCode * 8191 + ((isSetLineDelimiter()) ? 131071 : 524287);
    if (isSetLineDelimiter())
      hashCode = hashCode * 8191 + line_delimiter.hashCode();

    hashCode = hashCode * 8191 + ((isSetCollectionDelimiter()) ? 131071 : 524287);
    if (isSetCollectionDelimiter())
      hashCode = hashCode * 8191 + collection_delimiter.hashCode();

    hashCode = hashCode * 8191 + ((isSetMapkvDelimiter()) ? 131071 : 524287);
    if (isSetMapkvDelimiter())
      hashCode = hashCode * 8191 + mapkv_delimiter.hashCode();

    hashCode = hashCode * 8191 + ((isSetEnclose()) ? 131071 : 524287);
    if (isSetEnclose())
      hashCode = hashCode * 8191 + (int) (enclose);

    hashCode = hashCode * 8191 + ((isSetEscape()) ? 131071 : 524287);
    if (isSetEscape())
      hashCode = hashCode * 8191 + (int) (escape);

    return hashCode;
  }

  @Override
  public int compareTo(TFileTextScanRangeParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetColumnSeparator(), other.isSetColumnSeparator());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnSeparator()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.column_separator, other.column_separator);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetLineDelimiter(), other.isSetLineDelimiter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLineDelimiter()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.line_delimiter, other.line_delimiter);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCollectionDelimiter(), other.isSetCollectionDelimiter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCollectionDelimiter()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.collection_delimiter, other.collection_delimiter);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMapkvDelimiter(), other.isSetMapkvDelimiter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMapkvDelimiter()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mapkv_delimiter, other.mapkv_delimiter);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEnclose(), other.isSetEnclose());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnclose()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.enclose, other.enclose);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEscape(), other.isSetEscape());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEscape()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.escape, other.escape);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TFileTextScanRangeParams(");
    boolean first = true;

    if (isSetColumnSeparator()) {
      sb.append("column_separator:");
      if (this.column_separator == null) {
        sb.append("null");
      } else {
        sb.append(this.column_separator);
      }
      first = false;
    }
    if (isSetLineDelimiter()) {
      if (!first) sb.append(", ");
      sb.append("line_delimiter:");
      if (this.line_delimiter == null) {
        sb.append("null");
      } else {
        sb.append(this.line_delimiter);
      }
      first = false;
    }
    if (isSetCollectionDelimiter()) {
      if (!first) sb.append(", ");
      sb.append("collection_delimiter:");
      if (this.collection_delimiter == null) {
        sb.append("null");
      } else {
        sb.append(this.collection_delimiter);
      }
      first = false;
    }
    if (isSetMapkvDelimiter()) {
      if (!first) sb.append(", ");
      sb.append("mapkv_delimiter:");
      if (this.mapkv_delimiter == null) {
        sb.append("null");
      } else {
        sb.append(this.mapkv_delimiter);
      }
      first = false;
    }
    if (isSetEnclose()) {
      if (!first) sb.append(", ");
      sb.append("enclose:");
      sb.append(this.enclose);
      first = false;
    }
    if (isSetEscape()) {
      if (!first) sb.append(", ");
      sb.append("escape:");
      sb.append(this.escape);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TFileTextScanRangeParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TFileTextScanRangeParamsStandardScheme getScheme() {
      return new TFileTextScanRangeParamsStandardScheme();
    }
  }

  private static class TFileTextScanRangeParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TFileTextScanRangeParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TFileTextScanRangeParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COLUMN_SEPARATOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.column_separator = iprot.readString();
              struct.setColumnSeparatorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LINE_DELIMITER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.line_delimiter = iprot.readString();
              struct.setLineDelimiterIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COLLECTION_DELIMITER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.collection_delimiter = iprot.readString();
              struct.setCollectionDelimiterIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MAPKV_DELIMITER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mapkv_delimiter = iprot.readString();
              struct.setMapkvDelimiterIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ENCLOSE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.enclose = iprot.readByte();
              struct.setEncloseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ESCAPE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.escape = iprot.readByte();
              struct.setEscapeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TFileTextScanRangeParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.column_separator != null) {
        if (struct.isSetColumnSeparator()) {
          oprot.writeFieldBegin(COLUMN_SEPARATOR_FIELD_DESC);
          oprot.writeString(struct.column_separator);
          oprot.writeFieldEnd();
        }
      }
      if (struct.line_delimiter != null) {
        if (struct.isSetLineDelimiter()) {
          oprot.writeFieldBegin(LINE_DELIMITER_FIELD_DESC);
          oprot.writeString(struct.line_delimiter);
          oprot.writeFieldEnd();
        }
      }
      if (struct.collection_delimiter != null) {
        if (struct.isSetCollectionDelimiter()) {
          oprot.writeFieldBegin(COLLECTION_DELIMITER_FIELD_DESC);
          oprot.writeString(struct.collection_delimiter);
          oprot.writeFieldEnd();
        }
      }
      if (struct.mapkv_delimiter != null) {
        if (struct.isSetMapkvDelimiter()) {
          oprot.writeFieldBegin(MAPKV_DELIMITER_FIELD_DESC);
          oprot.writeString(struct.mapkv_delimiter);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetEnclose()) {
        oprot.writeFieldBegin(ENCLOSE_FIELD_DESC);
        oprot.writeByte(struct.enclose);
        oprot.writeFieldEnd();
      }
      if (struct.isSetEscape()) {
        oprot.writeFieldBegin(ESCAPE_FIELD_DESC);
        oprot.writeByte(struct.escape);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TFileTextScanRangeParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TFileTextScanRangeParamsTupleScheme getScheme() {
      return new TFileTextScanRangeParamsTupleScheme();
    }
  }

  private static class TFileTextScanRangeParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TFileTextScanRangeParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TFileTextScanRangeParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetColumnSeparator()) {
        optionals.set(0);
      }
      if (struct.isSetLineDelimiter()) {
        optionals.set(1);
      }
      if (struct.isSetCollectionDelimiter()) {
        optionals.set(2);
      }
      if (struct.isSetMapkvDelimiter()) {
        optionals.set(3);
      }
      if (struct.isSetEnclose()) {
        optionals.set(4);
      }
      if (struct.isSetEscape()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetColumnSeparator()) {
        oprot.writeString(struct.column_separator);
      }
      if (struct.isSetLineDelimiter()) {
        oprot.writeString(struct.line_delimiter);
      }
      if (struct.isSetCollectionDelimiter()) {
        oprot.writeString(struct.collection_delimiter);
      }
      if (struct.isSetMapkvDelimiter()) {
        oprot.writeString(struct.mapkv_delimiter);
      }
      if (struct.isSetEnclose()) {
        oprot.writeByte(struct.enclose);
      }
      if (struct.isSetEscape()) {
        oprot.writeByte(struct.escape);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TFileTextScanRangeParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.column_separator = iprot.readString();
        struct.setColumnSeparatorIsSet(true);
      }
      if (incoming.get(1)) {
        struct.line_delimiter = iprot.readString();
        struct.setLineDelimiterIsSet(true);
      }
      if (incoming.get(2)) {
        struct.collection_delimiter = iprot.readString();
        struct.setCollectionDelimiterIsSet(true);
      }
      if (incoming.get(3)) {
        struct.mapkv_delimiter = iprot.readString();
        struct.setMapkvDelimiterIsSet(true);
      }
      if (incoming.get(4)) {
        struct.enclose = iprot.readByte();
        struct.setEncloseIsSet(true);
      }
      if (incoming.get(5)) {
        struct.escape = iprot.readByte();
        struct.setEscapeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
