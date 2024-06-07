/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TShowVariableResult implements org.apache.thrift.TBase<TShowVariableResult, TShowVariableResult._Fields>, java.io.Serializable, Cloneable, Comparable<TShowVariableResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TShowVariableResult");

  private static final org.apache.thrift.protocol.TField VARIABLES_FIELD_DESC = new org.apache.thrift.protocol.TField("variables", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TShowVariableResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TShowVariableResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> variables; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VARIABLES((short)1, "variables");

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
        case 1: // VARIABLES
          return VARIABLES;
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
    tmpMap.put(_Fields.VARIABLES, new org.apache.thrift.meta_data.FieldMetaData("variables", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TShowVariableResult.class, metaDataMap);
  }

  public TShowVariableResult() {
  }

  public TShowVariableResult(
    java.util.Map<java.lang.String,java.lang.String> variables)
  {
    this();
    this.variables = variables;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TShowVariableResult(TShowVariableResult other) {
    if (other.isSetVariables()) {
      java.util.Map<java.lang.String,java.lang.String> __this__variables = new java.util.HashMap<java.lang.String,java.lang.String>(other.variables);
      this.variables = __this__variables;
    }
  }

  public TShowVariableResult deepCopy() {
    return new TShowVariableResult(this);
  }

  @Override
  public void clear() {
    this.variables = null;
  }

  public int getVariablesSize() {
    return (this.variables == null) ? 0 : this.variables.size();
  }

  public void putToVariables(java.lang.String key, java.lang.String val) {
    if (this.variables == null) {
      this.variables = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.variables.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.lang.String> getVariables() {
    return this.variables;
  }

  public TShowVariableResult setVariables(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> variables) {
    this.variables = variables;
    return this;
  }

  public void unsetVariables() {
    this.variables = null;
  }

  /** Returns true if field variables is set (has been assigned a value) and false otherwise */
  public boolean isSetVariables() {
    return this.variables != null;
  }

  public void setVariablesIsSet(boolean value) {
    if (!value) {
      this.variables = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case VARIABLES:
      if (value == null) {
        unsetVariables();
      } else {
        setVariables((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case VARIABLES:
      return getVariables();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case VARIABLES:
      return isSetVariables();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TShowVariableResult)
      return this.equals((TShowVariableResult)that);
    return false;
  }

  public boolean equals(TShowVariableResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_variables = true && this.isSetVariables();
    boolean that_present_variables = true && that.isSetVariables();
    if (this_present_variables || that_present_variables) {
      if (!(this_present_variables && that_present_variables))
        return false;
      if (!this.variables.equals(that.variables))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetVariables()) ? 131071 : 524287);
    if (isSetVariables())
      hashCode = hashCode * 8191 + variables.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TShowVariableResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetVariables(), other.isSetVariables());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVariables()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.variables, other.variables);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TShowVariableResult(");
    boolean first = true;

    sb.append("variables:");
    if (this.variables == null) {
      sb.append("null");
    } else {
      sb.append(this.variables);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (variables == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'variables' was not present! Struct: " + toString());
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

  private static class TShowVariableResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TShowVariableResultStandardScheme getScheme() {
      return new TShowVariableResultStandardScheme();
    }
  }

  private static class TShowVariableResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TShowVariableResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TShowVariableResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VARIABLES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map40 = iprot.readMapBegin();
                struct.variables = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map40.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key41;
                @org.apache.thrift.annotation.Nullable java.lang.String _val42;
                for (int _i43 = 0; _i43 < _map40.size; ++_i43)
                {
                  _key41 = iprot.readString();
                  _val42 = iprot.readString();
                  struct.variables.put(_key41, _val42);
                }
                iprot.readMapEnd();
              }
              struct.setVariablesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TShowVariableResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.variables != null) {
        oprot.writeFieldBegin(VARIABLES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.variables.size()));
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter44 : struct.variables.entrySet())
          {
            oprot.writeString(_iter44.getKey());
            oprot.writeString(_iter44.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TShowVariableResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TShowVariableResultTupleScheme getScheme() {
      return new TShowVariableResultTupleScheme();
    }
  }

  private static class TShowVariableResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TShowVariableResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TShowVariableResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.variables.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter45 : struct.variables.entrySet())
        {
          oprot.writeString(_iter45.getKey());
          oprot.writeString(_iter45.getValue());
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TShowVariableResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map46 = iprot.readMapBegin(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING); 
        struct.variables = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map46.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _key47;
        @org.apache.thrift.annotation.Nullable java.lang.String _val48;
        for (int _i49 = 0; _i49 < _map46.size; ++_i49)
        {
          _key47 = iprot.readString();
          _val48 = iprot.readString();
          struct.variables.put(_key47, _val48);
        }
      }
      struct.setVariablesIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
