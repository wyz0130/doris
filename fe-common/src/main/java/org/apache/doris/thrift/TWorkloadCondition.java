/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TWorkloadCondition implements org.apache.thrift.TBase<TWorkloadCondition, TWorkloadCondition._Fields>, java.io.Serializable, Cloneable, Comparable<TWorkloadCondition> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TWorkloadCondition");

  private static final org.apache.thrift.protocol.TField METRIC_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("metric_name", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField OP_FIELD_DESC = new org.apache.thrift.protocol.TField("op", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TWorkloadConditionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TWorkloadConditionTupleSchemeFactory();

  /**
   * 
   * @see TWorkloadMetricType
   */
  public @org.apache.thrift.annotation.Nullable TWorkloadMetricType metric_name; // optional
  /**
   * 
   * @see TCompareOperator
   */
  public @org.apache.thrift.annotation.Nullable TCompareOperator op; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String value; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TWorkloadMetricType
     */
    METRIC_NAME((short)1, "metric_name"),
    /**
     * 
     * @see TCompareOperator
     */
    OP((short)2, "op"),
    VALUE((short)3, "value");

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
        case 1: // METRIC_NAME
          return METRIC_NAME;
        case 2: // OP
          return OP;
        case 3: // VALUE
          return VALUE;
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
  private static final _Fields optionals[] = {_Fields.METRIC_NAME,_Fields.OP,_Fields.VALUE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.METRIC_NAME, new org.apache.thrift.meta_data.FieldMetaData("metric_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TWorkloadMetricType.class)));
    tmpMap.put(_Fields.OP, new org.apache.thrift.meta_data.FieldMetaData("op", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TCompareOperator.class)));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TWorkloadCondition.class, metaDataMap);
  }

  public TWorkloadCondition() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TWorkloadCondition(TWorkloadCondition other) {
    if (other.isSetMetricName()) {
      this.metric_name = other.metric_name;
    }
    if (other.isSetOp()) {
      this.op = other.op;
    }
    if (other.isSetValue()) {
      this.value = other.value;
    }
  }

  public TWorkloadCondition deepCopy() {
    return new TWorkloadCondition(this);
  }

  @Override
  public void clear() {
    this.metric_name = null;
    this.op = null;
    this.value = null;
  }

  /**
   * 
   * @see TWorkloadMetricType
   */
  @org.apache.thrift.annotation.Nullable
  public TWorkloadMetricType getMetricName() {
    return this.metric_name;
  }

  /**
   * 
   * @see TWorkloadMetricType
   */
  public TWorkloadCondition setMetricName(@org.apache.thrift.annotation.Nullable TWorkloadMetricType metric_name) {
    this.metric_name = metric_name;
    return this;
  }

  public void unsetMetricName() {
    this.metric_name = null;
  }

  /** Returns true if field metric_name is set (has been assigned a value) and false otherwise */
  public boolean isSetMetricName() {
    return this.metric_name != null;
  }

  public void setMetricNameIsSet(boolean value) {
    if (!value) {
      this.metric_name = null;
    }
  }

  /**
   * 
   * @see TCompareOperator
   */
  @org.apache.thrift.annotation.Nullable
  public TCompareOperator getOp() {
    return this.op;
  }

  /**
   * 
   * @see TCompareOperator
   */
  public TWorkloadCondition setOp(@org.apache.thrift.annotation.Nullable TCompareOperator op) {
    this.op = op;
    return this;
  }

  public void unsetOp() {
    this.op = null;
  }

  /** Returns true if field op is set (has been assigned a value) and false otherwise */
  public boolean isSetOp() {
    return this.op != null;
  }

  public void setOpIsSet(boolean value) {
    if (!value) {
      this.op = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getValue() {
    return this.value;
  }

  public TWorkloadCondition setValue(@org.apache.thrift.annotation.Nullable java.lang.String value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case METRIC_NAME:
      if (value == null) {
        unsetMetricName();
      } else {
        setMetricName((TWorkloadMetricType)value);
      }
      break;

    case OP:
      if (value == null) {
        unsetOp();
      } else {
        setOp((TCompareOperator)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case METRIC_NAME:
      return getMetricName();

    case OP:
      return getOp();

    case VALUE:
      return getValue();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case METRIC_NAME:
      return isSetMetricName();
    case OP:
      return isSetOp();
    case VALUE:
      return isSetValue();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TWorkloadCondition)
      return this.equals((TWorkloadCondition)that);
    return false;
  }

  public boolean equals(TWorkloadCondition that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_metric_name = true && this.isSetMetricName();
    boolean that_present_metric_name = true && that.isSetMetricName();
    if (this_present_metric_name || that_present_metric_name) {
      if (!(this_present_metric_name && that_present_metric_name))
        return false;
      if (!this.metric_name.equals(that.metric_name))
        return false;
    }

    boolean this_present_op = true && this.isSetOp();
    boolean that_present_op = true && that.isSetOp();
    if (this_present_op || that_present_op) {
      if (!(this_present_op && that_present_op))
        return false;
      if (!this.op.equals(that.op))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMetricName()) ? 131071 : 524287);
    if (isSetMetricName())
      hashCode = hashCode * 8191 + metric_name.getValue();

    hashCode = hashCode * 8191 + ((isSetOp()) ? 131071 : 524287);
    if (isSetOp())
      hashCode = hashCode * 8191 + op.getValue();

    hashCode = hashCode * 8191 + ((isSetValue()) ? 131071 : 524287);
    if (isSetValue())
      hashCode = hashCode * 8191 + value.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TWorkloadCondition other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetMetricName(), other.isSetMetricName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetricName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metric_name, other.metric_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetOp(), other.isSetOp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.op, other.op);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetValue(), other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TWorkloadCondition(");
    boolean first = true;

    if (isSetMetricName()) {
      sb.append("metric_name:");
      if (this.metric_name == null) {
        sb.append("null");
      } else {
        sb.append(this.metric_name);
      }
      first = false;
    }
    if (isSetOp()) {
      if (!first) sb.append(", ");
      sb.append("op:");
      if (this.op == null) {
        sb.append("null");
      } else {
        sb.append(this.op);
      }
      first = false;
    }
    if (isSetValue()) {
      if (!first) sb.append(", ");
      sb.append("value:");
      if (this.value == null) {
        sb.append("null");
      } else {
        sb.append(this.value);
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

  private static class TWorkloadConditionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TWorkloadConditionStandardScheme getScheme() {
      return new TWorkloadConditionStandardScheme();
    }
  }

  private static class TWorkloadConditionStandardScheme extends org.apache.thrift.scheme.StandardScheme<TWorkloadCondition> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TWorkloadCondition struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METRIC_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.metric_name = org.apache.doris.thrift.TWorkloadMetricType.findByValue(iprot.readI32());
              struct.setMetricNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OP
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.op = org.apache.doris.thrift.TCompareOperator.findByValue(iprot.readI32());
              struct.setOpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.value = iprot.readString();
              struct.setValueIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TWorkloadCondition struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metric_name != null) {
        if (struct.isSetMetricName()) {
          oprot.writeFieldBegin(METRIC_NAME_FIELD_DESC);
          oprot.writeI32(struct.metric_name.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.op != null) {
        if (struct.isSetOp()) {
          oprot.writeFieldBegin(OP_FIELD_DESC);
          oprot.writeI32(struct.op.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.value != null) {
        if (struct.isSetValue()) {
          oprot.writeFieldBegin(VALUE_FIELD_DESC);
          oprot.writeString(struct.value);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TWorkloadConditionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TWorkloadConditionTupleScheme getScheme() {
      return new TWorkloadConditionTupleScheme();
    }
  }

  private static class TWorkloadConditionTupleScheme extends org.apache.thrift.scheme.TupleScheme<TWorkloadCondition> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TWorkloadCondition struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMetricName()) {
        optionals.set(0);
      }
      if (struct.isSetOp()) {
        optionals.set(1);
      }
      if (struct.isSetValue()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetMetricName()) {
        oprot.writeI32(struct.metric_name.getValue());
      }
      if (struct.isSetOp()) {
        oprot.writeI32(struct.op.getValue());
      }
      if (struct.isSetValue()) {
        oprot.writeString(struct.value);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TWorkloadCondition struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.metric_name = org.apache.doris.thrift.TWorkloadMetricType.findByValue(iprot.readI32());
        struct.setMetricNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.op = org.apache.doris.thrift.TCompareOperator.findByValue(iprot.readI32());
        struct.setOpIsSet(true);
      }
      if (incoming.get(2)) {
        struct.value = iprot.readString();
        struct.setValueIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

