/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.parquet.format;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * Data page header
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class DataPageHeader implements org.apache.thrift.TBase<DataPageHeader, DataPageHeader._Fields>, java.io.Serializable, Cloneable, Comparable<DataPageHeader> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DataPageHeader");

  private static final org.apache.thrift.protocol.TField NUM_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("num_values", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ENCODING_FIELD_DESC = new org.apache.thrift.protocol.TField("encoding", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField DEFINITION_LEVEL_ENCODING_FIELD_DESC = new org.apache.thrift.protocol.TField("definition_level_encoding", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField REPETITION_LEVEL_ENCODING_FIELD_DESC = new org.apache.thrift.protocol.TField("repetition_level_encoding", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField STATISTICS_FIELD_DESC = new org.apache.thrift.protocol.TField("statistics", org.apache.thrift.protocol.TType.STRUCT, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DataPageHeaderStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DataPageHeaderTupleSchemeFactory();

  /**
   * Number of values, including NULLs, in this data page. *
   */
  public int num_values; // required
  /**
   * Encoding used for this data page *
   * 
   * @see Encoding
   */
  public @org.apache.thrift.annotation.Nullable Encoding encoding; // required
  /**
   * Encoding used for definition levels *
   * 
   * @see Encoding
   */
  public @org.apache.thrift.annotation.Nullable Encoding definition_level_encoding; // required
  /**
   * Encoding used for repetition levels *
   * 
   * @see Encoding
   */
  public @org.apache.thrift.annotation.Nullable Encoding repetition_level_encoding; // required
  /**
   * Optional statistics for the data in this page*
   */
  public @org.apache.thrift.annotation.Nullable Statistics statistics; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Number of values, including NULLs, in this data page. *
     */
    NUM_VALUES((short)1, "num_values"),
    /**
     * Encoding used for this data page *
     * 
     * @see Encoding
     */
    ENCODING((short)2, "encoding"),
    /**
     * Encoding used for definition levels *
     * 
     * @see Encoding
     */
    DEFINITION_LEVEL_ENCODING((short)3, "definition_level_encoding"),
    /**
     * Encoding used for repetition levels *
     * 
     * @see Encoding
     */
    REPETITION_LEVEL_ENCODING((short)4, "repetition_level_encoding"),
    /**
     * Optional statistics for the data in this page*
     */
    STATISTICS((short)5, "statistics");

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
        case 1: // NUM_VALUES
          return NUM_VALUES;
        case 2: // ENCODING
          return ENCODING;
        case 3: // DEFINITION_LEVEL_ENCODING
          return DEFINITION_LEVEL_ENCODING;
        case 4: // REPETITION_LEVEL_ENCODING
          return REPETITION_LEVEL_ENCODING;
        case 5: // STATISTICS
          return STATISTICS;
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
  private static final int __NUM_VALUES_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.STATISTICS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NUM_VALUES, new org.apache.thrift.meta_data.FieldMetaData("num_values", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ENCODING, new org.apache.thrift.meta_data.FieldMetaData("encoding", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Encoding.class)));
    tmpMap.put(_Fields.DEFINITION_LEVEL_ENCODING, new org.apache.thrift.meta_data.FieldMetaData("definition_level_encoding", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Encoding.class)));
    tmpMap.put(_Fields.REPETITION_LEVEL_ENCODING, new org.apache.thrift.meta_data.FieldMetaData("repetition_level_encoding", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Encoding.class)));
    tmpMap.put(_Fields.STATISTICS, new org.apache.thrift.meta_data.FieldMetaData("statistics", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Statistics.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DataPageHeader.class, metaDataMap);
  }

  public DataPageHeader() {
  }

  public DataPageHeader(
    int num_values,
    Encoding encoding,
    Encoding definition_level_encoding,
    Encoding repetition_level_encoding)
  {
    this();
    this.num_values = num_values;
    setNumValuesIsSet(true);
    this.encoding = encoding;
    this.definition_level_encoding = definition_level_encoding;
    this.repetition_level_encoding = repetition_level_encoding;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DataPageHeader(DataPageHeader other) {
    __isset_bitfield = other.__isset_bitfield;
    this.num_values = other.num_values;
    if (other.isSetEncoding()) {
      this.encoding = other.encoding;
    }
    if (other.isSetDefinitionLevelEncoding()) {
      this.definition_level_encoding = other.definition_level_encoding;
    }
    if (other.isSetRepetitionLevelEncoding()) {
      this.repetition_level_encoding = other.repetition_level_encoding;
    }
    if (other.isSetStatistics()) {
      this.statistics = new Statistics(other.statistics);
    }
  }

  public DataPageHeader deepCopy() {
    return new DataPageHeader(this);
  }

  @Override
  public void clear() {
    setNumValuesIsSet(false);
    this.num_values = 0;
    this.encoding = null;
    this.definition_level_encoding = null;
    this.repetition_level_encoding = null;
    this.statistics = null;
  }

  /**
   * Number of values, including NULLs, in this data page. *
   */
  public int getNumValues() {
    return this.num_values;
  }

  /**
   * Number of values, including NULLs, in this data page. *
   */
  public DataPageHeader setNumValues(int num_values) {
    this.num_values = num_values;
    setNumValuesIsSet(true);
    return this;
  }

  public void unsetNumValues() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NUM_VALUES_ISSET_ID);
  }

  /** Returns true if field num_values is set (has been assigned a value) and false otherwise */
  public boolean isSetNumValues() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NUM_VALUES_ISSET_ID);
  }

  public void setNumValuesIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NUM_VALUES_ISSET_ID, value);
  }

  /**
   * Encoding used for this data page *
   * 
   * @see Encoding
   */
  @org.apache.thrift.annotation.Nullable
  public Encoding getEncoding() {
    return this.encoding;
  }

  /**
   * Encoding used for this data page *
   * 
   * @see Encoding
   */
  public DataPageHeader setEncoding(@org.apache.thrift.annotation.Nullable Encoding encoding) {
    this.encoding = encoding;
    return this;
  }

  public void unsetEncoding() {
    this.encoding = null;
  }

  /** Returns true if field encoding is set (has been assigned a value) and false otherwise */
  public boolean isSetEncoding() {
    return this.encoding != null;
  }

  public void setEncodingIsSet(boolean value) {
    if (!value) {
      this.encoding = null;
    }
  }

  /**
   * Encoding used for definition levels *
   * 
   * @see Encoding
   */
  @org.apache.thrift.annotation.Nullable
  public Encoding getDefinitionLevelEncoding() {
    return this.definition_level_encoding;
  }

  /**
   * Encoding used for definition levels *
   * 
   * @see Encoding
   */
  public DataPageHeader setDefinitionLevelEncoding(@org.apache.thrift.annotation.Nullable Encoding definition_level_encoding) {
    this.definition_level_encoding = definition_level_encoding;
    return this;
  }

  public void unsetDefinitionLevelEncoding() {
    this.definition_level_encoding = null;
  }

  /** Returns true if field definition_level_encoding is set (has been assigned a value) and false otherwise */
  public boolean isSetDefinitionLevelEncoding() {
    return this.definition_level_encoding != null;
  }

  public void setDefinitionLevelEncodingIsSet(boolean value) {
    if (!value) {
      this.definition_level_encoding = null;
    }
  }

  /**
   * Encoding used for repetition levels *
   * 
   * @see Encoding
   */
  @org.apache.thrift.annotation.Nullable
  public Encoding getRepetitionLevelEncoding() {
    return this.repetition_level_encoding;
  }

  /**
   * Encoding used for repetition levels *
   * 
   * @see Encoding
   */
  public DataPageHeader setRepetitionLevelEncoding(@org.apache.thrift.annotation.Nullable Encoding repetition_level_encoding) {
    this.repetition_level_encoding = repetition_level_encoding;
    return this;
  }

  public void unsetRepetitionLevelEncoding() {
    this.repetition_level_encoding = null;
  }

  /** Returns true if field repetition_level_encoding is set (has been assigned a value) and false otherwise */
  public boolean isSetRepetitionLevelEncoding() {
    return this.repetition_level_encoding != null;
  }

  public void setRepetitionLevelEncodingIsSet(boolean value) {
    if (!value) {
      this.repetition_level_encoding = null;
    }
  }

  /**
   * Optional statistics for the data in this page*
   */
  @org.apache.thrift.annotation.Nullable
  public Statistics getStatistics() {
    return this.statistics;
  }

  /**
   * Optional statistics for the data in this page*
   */
  public DataPageHeader setStatistics(@org.apache.thrift.annotation.Nullable Statistics statistics) {
    this.statistics = statistics;
    return this;
  }

  public void unsetStatistics() {
    this.statistics = null;
  }

  /** Returns true if field statistics is set (has been assigned a value) and false otherwise */
  public boolean isSetStatistics() {
    return this.statistics != null;
  }

  public void setStatisticsIsSet(boolean value) {
    if (!value) {
      this.statistics = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NUM_VALUES:
      if (value == null) {
        unsetNumValues();
      } else {
        setNumValues((java.lang.Integer)value);
      }
      break;

    case ENCODING:
      if (value == null) {
        unsetEncoding();
      } else {
        setEncoding((Encoding)value);
      }
      break;

    case DEFINITION_LEVEL_ENCODING:
      if (value == null) {
        unsetDefinitionLevelEncoding();
      } else {
        setDefinitionLevelEncoding((Encoding)value);
      }
      break;

    case REPETITION_LEVEL_ENCODING:
      if (value == null) {
        unsetRepetitionLevelEncoding();
      } else {
        setRepetitionLevelEncoding((Encoding)value);
      }
      break;

    case STATISTICS:
      if (value == null) {
        unsetStatistics();
      } else {
        setStatistics((Statistics)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NUM_VALUES:
      return getNumValues();

    case ENCODING:
      return getEncoding();

    case DEFINITION_LEVEL_ENCODING:
      return getDefinitionLevelEncoding();

    case REPETITION_LEVEL_ENCODING:
      return getRepetitionLevelEncoding();

    case STATISTICS:
      return getStatistics();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NUM_VALUES:
      return isSetNumValues();
    case ENCODING:
      return isSetEncoding();
    case DEFINITION_LEVEL_ENCODING:
      return isSetDefinitionLevelEncoding();
    case REPETITION_LEVEL_ENCODING:
      return isSetRepetitionLevelEncoding();
    case STATISTICS:
      return isSetStatistics();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof DataPageHeader)
      return this.equals((DataPageHeader)that);
    return false;
  }

  public boolean equals(DataPageHeader that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_num_values = true;
    boolean that_present_num_values = true;
    if (this_present_num_values || that_present_num_values) {
      if (!(this_present_num_values && that_present_num_values))
        return false;
      if (this.num_values != that.num_values)
        return false;
    }

    boolean this_present_encoding = true && this.isSetEncoding();
    boolean that_present_encoding = true && that.isSetEncoding();
    if (this_present_encoding || that_present_encoding) {
      if (!(this_present_encoding && that_present_encoding))
        return false;
      if (!this.encoding.equals(that.encoding))
        return false;
    }

    boolean this_present_definition_level_encoding = true && this.isSetDefinitionLevelEncoding();
    boolean that_present_definition_level_encoding = true && that.isSetDefinitionLevelEncoding();
    if (this_present_definition_level_encoding || that_present_definition_level_encoding) {
      if (!(this_present_definition_level_encoding && that_present_definition_level_encoding))
        return false;
      if (!this.definition_level_encoding.equals(that.definition_level_encoding))
        return false;
    }

    boolean this_present_repetition_level_encoding = true && this.isSetRepetitionLevelEncoding();
    boolean that_present_repetition_level_encoding = true && that.isSetRepetitionLevelEncoding();
    if (this_present_repetition_level_encoding || that_present_repetition_level_encoding) {
      if (!(this_present_repetition_level_encoding && that_present_repetition_level_encoding))
        return false;
      if (!this.repetition_level_encoding.equals(that.repetition_level_encoding))
        return false;
    }

    boolean this_present_statistics = true && this.isSetStatistics();
    boolean that_present_statistics = true && that.isSetStatistics();
    if (this_present_statistics || that_present_statistics) {
      if (!(this_present_statistics && that_present_statistics))
        return false;
      if (!this.statistics.equals(that.statistics))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + num_values;

    hashCode = hashCode * 8191 + ((isSetEncoding()) ? 131071 : 524287);
    if (isSetEncoding())
      hashCode = hashCode * 8191 + encoding.getValue();

    hashCode = hashCode * 8191 + ((isSetDefinitionLevelEncoding()) ? 131071 : 524287);
    if (isSetDefinitionLevelEncoding())
      hashCode = hashCode * 8191 + definition_level_encoding.getValue();

    hashCode = hashCode * 8191 + ((isSetRepetitionLevelEncoding()) ? 131071 : 524287);
    if (isSetRepetitionLevelEncoding())
      hashCode = hashCode * 8191 + repetition_level_encoding.getValue();

    hashCode = hashCode * 8191 + ((isSetStatistics()) ? 131071 : 524287);
    if (isSetStatistics())
      hashCode = hashCode * 8191 + statistics.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(DataPageHeader other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetNumValues(), other.isSetNumValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_values, other.num_values);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEncoding(), other.isSetEncoding());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEncoding()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.encoding, other.encoding);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDefinitionLevelEncoding(), other.isSetDefinitionLevelEncoding());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDefinitionLevelEncoding()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.definition_level_encoding, other.definition_level_encoding);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRepetitionLevelEncoding(), other.isSetRepetitionLevelEncoding());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRepetitionLevelEncoding()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.repetition_level_encoding, other.repetition_level_encoding);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetStatistics(), other.isSetStatistics());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatistics()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statistics, other.statistics);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DataPageHeader(");
    boolean first = true;

    sb.append("num_values:");
    sb.append(this.num_values);
    first = false;
    if (!first) sb.append(", ");
    sb.append("encoding:");
    if (this.encoding == null) {
      sb.append("null");
    } else {
      sb.append(this.encoding);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("definition_level_encoding:");
    if (this.definition_level_encoding == null) {
      sb.append("null");
    } else {
      sb.append(this.definition_level_encoding);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("repetition_level_encoding:");
    if (this.repetition_level_encoding == null) {
      sb.append("null");
    } else {
      sb.append(this.repetition_level_encoding);
    }
    first = false;
    if (isSetStatistics()) {
      if (!first) sb.append(", ");
      sb.append("statistics:");
      if (this.statistics == null) {
        sb.append("null");
      } else {
        sb.append(this.statistics);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'num_values' because it's a primitive and you chose the non-beans generator.
    if (encoding == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'encoding' was not present! Struct: " + toString());
    }
    if (definition_level_encoding == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'definition_level_encoding' was not present! Struct: " + toString());
    }
    if (repetition_level_encoding == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'repetition_level_encoding' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (statistics != null) {
      statistics.validate();
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

  private static class DataPageHeaderStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DataPageHeaderStandardScheme getScheme() {
      return new DataPageHeaderStandardScheme();
    }
  }

  private static class DataPageHeaderStandardScheme extends org.apache.thrift.scheme.StandardScheme<DataPageHeader> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DataPageHeader struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NUM_VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.num_values = iprot.readI32();
              struct.setNumValuesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ENCODING
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.encoding = org.apache.parquet.format.Encoding.findByValue(iprot.readI32());
              struct.setEncodingIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DEFINITION_LEVEL_ENCODING
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.definition_level_encoding = org.apache.parquet.format.Encoding.findByValue(iprot.readI32());
              struct.setDefinitionLevelEncodingIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // REPETITION_LEVEL_ENCODING
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.repetition_level_encoding = org.apache.parquet.format.Encoding.findByValue(iprot.readI32());
              struct.setRepetitionLevelEncodingIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STATISTICS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.statistics = new Statistics();
              struct.statistics.read(iprot);
              struct.setStatisticsIsSet(true);
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
      if (!struct.isSetNumValues()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'num_values' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DataPageHeader struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(NUM_VALUES_FIELD_DESC);
      oprot.writeI32(struct.num_values);
      oprot.writeFieldEnd();
      if (struct.encoding != null) {
        oprot.writeFieldBegin(ENCODING_FIELD_DESC);
        oprot.writeI32(struct.encoding.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.definition_level_encoding != null) {
        oprot.writeFieldBegin(DEFINITION_LEVEL_ENCODING_FIELD_DESC);
        oprot.writeI32(struct.definition_level_encoding.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.repetition_level_encoding != null) {
        oprot.writeFieldBegin(REPETITION_LEVEL_ENCODING_FIELD_DESC);
        oprot.writeI32(struct.repetition_level_encoding.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.statistics != null) {
        if (struct.isSetStatistics()) {
          oprot.writeFieldBegin(STATISTICS_FIELD_DESC);
          struct.statistics.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DataPageHeaderTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DataPageHeaderTupleScheme getScheme() {
      return new DataPageHeaderTupleScheme();
    }
  }

  private static class DataPageHeaderTupleScheme extends org.apache.thrift.scheme.TupleScheme<DataPageHeader> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DataPageHeader struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.num_values);
      oprot.writeI32(struct.encoding.getValue());
      oprot.writeI32(struct.definition_level_encoding.getValue());
      oprot.writeI32(struct.repetition_level_encoding.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatistics()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetStatistics()) {
        struct.statistics.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DataPageHeader struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.num_values = iprot.readI32();
      struct.setNumValuesIsSet(true);
      struct.encoding = org.apache.parquet.format.Encoding.findByValue(iprot.readI32());
      struct.setEncodingIsSet(true);
      struct.definition_level_encoding = org.apache.parquet.format.Encoding.findByValue(iprot.readI32());
      struct.setDefinitionLevelEncodingIsSet(true);
      struct.repetition_level_encoding = org.apache.parquet.format.Encoding.findByValue(iprot.readI32());
      struct.setRepetitionLevelEncodingIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.statistics = new Statistics();
        struct.statistics.read(iprot);
        struct.setStatisticsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

