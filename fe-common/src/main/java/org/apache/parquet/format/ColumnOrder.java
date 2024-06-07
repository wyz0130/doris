/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.parquet.format;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * Union to specify the order used for the min_value and max_value fields for a
 * column. This union takes the role of an enhanced enum that allows rich
 * elements (which will be needed for a collation-based ordering in the future).
 * 
 * Possible values are:
 * * TypeDefinedOrder - the column uses the order defined by its logical or
 *                      physical type (if there is no logical type).
 * 
 * If the reader does not support the value of this union, min and max stats
 * for this column should be ignored.
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class ColumnOrder extends org.apache.thrift.TUnion<ColumnOrder, ColumnOrder._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ColumnOrder");
  private static final org.apache.thrift.protocol.TField TYPE__ORDER_FIELD_DESC = new org.apache.thrift.protocol.TField("TYPE_ORDER", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * The sort orders for logical types are:
     *   UTF8 - unsigned byte-wise comparison
     *   INT8 - signed comparison
     *   INT16 - signed comparison
     *   INT32 - signed comparison
     *   INT64 - signed comparison
     *   UINT8 - unsigned comparison
     *   UINT16 - unsigned comparison
     *   UINT32 - unsigned comparison
     *   UINT64 - unsigned comparison
     *   DECIMAL - signed comparison of the represented value
     *   DATE - signed comparison
     *   TIME_MILLIS - signed comparison
     *   TIME_MICROS - signed comparison
     *   TIMESTAMP_MILLIS - signed comparison
     *   TIMESTAMP_MICROS - signed comparison
     *   INTERVAL - unsigned comparison
     *   JSON - unsigned byte-wise comparison
     *   BSON - unsigned byte-wise comparison
     *   ENUM - unsigned byte-wise comparison
     *   LIST - undefined
     *   MAP - undefined
     * 
     * In the absence of logical types, the sort order is determined by the physical type:
     *   BOOLEAN - false, true
     *   INT32 - signed comparison
     *   INT64 - signed comparison
     *   INT96 (only used for legacy timestamps) - undefined
     *   FLOAT - signed comparison of the represented value (*)
     *   DOUBLE - signed comparison of the represented value (*)
     *   BYTE_ARRAY - unsigned byte-wise comparison
     *   FIXED_LEN_BYTE_ARRAY - unsigned byte-wise comparison
     * 
     * (*) Because the sorting order is not specified properly for floating
     *     point values (relations vs. total ordering) the following
     *     compatibility rules should be applied when reading statistics:
     *     - If the min is a NaN, it should be ignored.
     *     - If the max is a NaN, it should be ignored.
     *     - If the min is +0, the row group may contain -0 values as well.
     *     - If the max is -0, the row group may contain +0 values as well.
     *     - When looking for NaN values, min and max should be ignored.
     */
    TYPE__ORDER((short)1, "TYPE_ORDER");

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
        case 1: // TYPE__ORDER
          return TYPE__ORDER;
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

  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE__ORDER, new org.apache.thrift.meta_data.FieldMetaData("TYPE_ORDER", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TypeDefinedOrder.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ColumnOrder.class, metaDataMap);
  }

  public ColumnOrder() {
    super();
  }

  public ColumnOrder(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public ColumnOrder(ColumnOrder other) {
    super(other);
  }
  public ColumnOrder deepCopy() {
    return new ColumnOrder(this);
  }

  public static ColumnOrder TYPE_ORDER(TypeDefinedOrder value) {
    ColumnOrder x = new ColumnOrder();
    x.setTYPEORDER(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case TYPE__ORDER:
        if (value instanceof TypeDefinedOrder) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TypeDefinedOrder for field 'TYPE_ORDER', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case TYPE__ORDER:
          if (field.type == TYPE__ORDER_FIELD_DESC.type) {
            TypeDefinedOrder TYPE_ORDER;
            TYPE_ORDER = new TypeDefinedOrder();
            TYPE_ORDER.read(iprot);
            return TYPE_ORDER;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case TYPE__ORDER:
        TypeDefinedOrder TYPE_ORDER = (TypeDefinedOrder)value_;
        TYPE_ORDER.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected java.lang.Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case TYPE__ORDER:
          TypeDefinedOrder TYPE_ORDER;
          TYPE_ORDER = new TypeDefinedOrder();
          TYPE_ORDER.read(iprot);
          return TYPE_ORDER;
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new org.apache.thrift.protocol.TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case TYPE__ORDER:
        TypeDefinedOrder TYPE_ORDER = (TypeDefinedOrder)value_;
        TYPE_ORDER.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case TYPE__ORDER:
        return TYPE__ORDER_FIELD_DESC;
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  /**
   * The sort orders for logical types are:
   *   UTF8 - unsigned byte-wise comparison
   *   INT8 - signed comparison
   *   INT16 - signed comparison
   *   INT32 - signed comparison
   *   INT64 - signed comparison
   *   UINT8 - unsigned comparison
   *   UINT16 - unsigned comparison
   *   UINT32 - unsigned comparison
   *   UINT64 - unsigned comparison
   *   DECIMAL - signed comparison of the represented value
   *   DATE - signed comparison
   *   TIME_MILLIS - signed comparison
   *   TIME_MICROS - signed comparison
   *   TIMESTAMP_MILLIS - signed comparison
   *   TIMESTAMP_MICROS - signed comparison
   *   INTERVAL - unsigned comparison
   *   JSON - unsigned byte-wise comparison
   *   BSON - unsigned byte-wise comparison
   *   ENUM - unsigned byte-wise comparison
   *   LIST - undefined
   *   MAP - undefined
   * 
   * In the absence of logical types, the sort order is determined by the physical type:
   *   BOOLEAN - false, true
   *   INT32 - signed comparison
   *   INT64 - signed comparison
   *   INT96 (only used for legacy timestamps) - undefined
   *   FLOAT - signed comparison of the represented value (*)
   *   DOUBLE - signed comparison of the represented value (*)
   *   BYTE_ARRAY - unsigned byte-wise comparison
   *   FIXED_LEN_BYTE_ARRAY - unsigned byte-wise comparison
   * 
   * (*) Because the sorting order is not specified properly for floating
   *     point values (relations vs. total ordering) the following
   *     compatibility rules should be applied when reading statistics:
   *     - If the min is a NaN, it should be ignored.
   *     - If the max is a NaN, it should be ignored.
   *     - If the min is +0, the row group may contain -0 values as well.
   *     - If the max is -0, the row group may contain +0 values as well.
   *     - When looking for NaN values, min and max should be ignored.
   */
  public TypeDefinedOrder getTYPEORDER() {
    if (getSetField() == _Fields.TYPE__ORDER) {
      return (TypeDefinedOrder)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'TYPE_ORDER' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  /**
   * The sort orders for logical types are:
   *   UTF8 - unsigned byte-wise comparison
   *   INT8 - signed comparison
   *   INT16 - signed comparison
   *   INT32 - signed comparison
   *   INT64 - signed comparison
   *   UINT8 - unsigned comparison
   *   UINT16 - unsigned comparison
   *   UINT32 - unsigned comparison
   *   UINT64 - unsigned comparison
   *   DECIMAL - signed comparison of the represented value
   *   DATE - signed comparison
   *   TIME_MILLIS - signed comparison
   *   TIME_MICROS - signed comparison
   *   TIMESTAMP_MILLIS - signed comparison
   *   TIMESTAMP_MICROS - signed comparison
   *   INTERVAL - unsigned comparison
   *   JSON - unsigned byte-wise comparison
   *   BSON - unsigned byte-wise comparison
   *   ENUM - unsigned byte-wise comparison
   *   LIST - undefined
   *   MAP - undefined
   * 
   * In the absence of logical types, the sort order is determined by the physical type:
   *   BOOLEAN - false, true
   *   INT32 - signed comparison
   *   INT64 - signed comparison
   *   INT96 (only used for legacy timestamps) - undefined
   *   FLOAT - signed comparison of the represented value (*)
   *   DOUBLE - signed comparison of the represented value (*)
   *   BYTE_ARRAY - unsigned byte-wise comparison
   *   FIXED_LEN_BYTE_ARRAY - unsigned byte-wise comparison
   * 
   * (*) Because the sorting order is not specified properly for floating
   *     point values (relations vs. total ordering) the following
   *     compatibility rules should be applied when reading statistics:
   *     - If the min is a NaN, it should be ignored.
   *     - If the max is a NaN, it should be ignored.
   *     - If the min is +0, the row group may contain -0 values as well.
   *     - If the max is -0, the row group may contain +0 values as well.
   *     - When looking for NaN values, min and max should be ignored.
   */
  public void setTYPEORDER(TypeDefinedOrder value) {
    setField_ = _Fields.TYPE__ORDER;
    value_ = java.util.Objects.requireNonNull(value,"_Fields.TYPE__ORDER");
  }

  public boolean isSetTYPEORDER() {
    return setField_ == _Fields.TYPE__ORDER;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof ColumnOrder) {
      return equals((ColumnOrder)other);
    } else {
      return false;
    }
  }

  public boolean equals(ColumnOrder other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(ColumnOrder other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      java.lang.Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
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


}