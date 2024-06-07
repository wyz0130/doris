/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.parquet.format;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class EncryptionAlgorithm extends org.apache.thrift.TUnion<EncryptionAlgorithm, EncryptionAlgorithm._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EncryptionAlgorithm");
  private static final org.apache.thrift.protocol.TField AES__GCM__V1_FIELD_DESC = new org.apache.thrift.protocol.TField("AES_GCM_V1", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField AES__GCM__CTR__V1_FIELD_DESC = new org.apache.thrift.protocol.TField("AES_GCM_CTR_V1", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AES__GCM__V1((short)1, "AES_GCM_V1"),
    AES__GCM__CTR__V1((short)2, "AES_GCM_CTR_V1");

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
        case 1: // AES__GCM__V1
          return AES__GCM__V1;
        case 2: // AES__GCM__CTR__V1
          return AES__GCM__CTR__V1;
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
    tmpMap.put(_Fields.AES__GCM__V1, new org.apache.thrift.meta_data.FieldMetaData("AES_GCM_V1", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AesGcmV1.class)));
    tmpMap.put(_Fields.AES__GCM__CTR__V1, new org.apache.thrift.meta_data.FieldMetaData("AES_GCM_CTR_V1", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AesGcmCtrV1.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EncryptionAlgorithm.class, metaDataMap);
  }

  public EncryptionAlgorithm() {
    super();
  }

  public EncryptionAlgorithm(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public EncryptionAlgorithm(EncryptionAlgorithm other) {
    super(other);
  }
  public EncryptionAlgorithm deepCopy() {
    return new EncryptionAlgorithm(this);
  }

  public static EncryptionAlgorithm AES_GCM_V1(AesGcmV1 value) {
    EncryptionAlgorithm x = new EncryptionAlgorithm();
    x.setAESGCMV1(value);
    return x;
  }

  public static EncryptionAlgorithm AES_GCM_CTR_V1(AesGcmCtrV1 value) {
    EncryptionAlgorithm x = new EncryptionAlgorithm();
    x.setAESGCMCTRV1(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case AES__GCM__V1:
        if (value instanceof AesGcmV1) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type AesGcmV1 for field 'AES_GCM_V1', but got " + value.getClass().getSimpleName());
      case AES__GCM__CTR__V1:
        if (value instanceof AesGcmCtrV1) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type AesGcmCtrV1 for field 'AES_GCM_CTR_V1', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case AES__GCM__V1:
          if (field.type == AES__GCM__V1_FIELD_DESC.type) {
            AesGcmV1 AES_GCM_V1;
            AES_GCM_V1 = new AesGcmV1();
            AES_GCM_V1.read(iprot);
            return AES_GCM_V1;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case AES__GCM__CTR__V1:
          if (field.type == AES__GCM__CTR__V1_FIELD_DESC.type) {
            AesGcmCtrV1 AES_GCM_CTR_V1;
            AES_GCM_CTR_V1 = new AesGcmCtrV1();
            AES_GCM_CTR_V1.read(iprot);
            return AES_GCM_CTR_V1;
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
      case AES__GCM__V1:
        AesGcmV1 AES_GCM_V1 = (AesGcmV1)value_;
        AES_GCM_V1.write(oprot);
        return;
      case AES__GCM__CTR__V1:
        AesGcmCtrV1 AES_GCM_CTR_V1 = (AesGcmCtrV1)value_;
        AES_GCM_CTR_V1.write(oprot);
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
        case AES__GCM__V1:
          AesGcmV1 AES_GCM_V1;
          AES_GCM_V1 = new AesGcmV1();
          AES_GCM_V1.read(iprot);
          return AES_GCM_V1;
        case AES__GCM__CTR__V1:
          AesGcmCtrV1 AES_GCM_CTR_V1;
          AES_GCM_CTR_V1 = new AesGcmCtrV1();
          AES_GCM_CTR_V1.read(iprot);
          return AES_GCM_CTR_V1;
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
      case AES__GCM__V1:
        AesGcmV1 AES_GCM_V1 = (AesGcmV1)value_;
        AES_GCM_V1.write(oprot);
        return;
      case AES__GCM__CTR__V1:
        AesGcmCtrV1 AES_GCM_CTR_V1 = (AesGcmCtrV1)value_;
        AES_GCM_CTR_V1.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case AES__GCM__V1:
        return AES__GCM__V1_FIELD_DESC;
      case AES__GCM__CTR__V1:
        return AES__GCM__CTR__V1_FIELD_DESC;
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


  public AesGcmV1 getAESGCMV1() {
    if (getSetField() == _Fields.AES__GCM__V1) {
      return (AesGcmV1)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'AES_GCM_V1' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setAESGCMV1(AesGcmV1 value) {
    setField_ = _Fields.AES__GCM__V1;
    value_ = java.util.Objects.requireNonNull(value,"_Fields.AES__GCM__V1");
  }

  public AesGcmCtrV1 getAESGCMCTRV1() {
    if (getSetField() == _Fields.AES__GCM__CTR__V1) {
      return (AesGcmCtrV1)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'AES_GCM_CTR_V1' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setAESGCMCTRV1(AesGcmCtrV1 value) {
    setField_ = _Fields.AES__GCM__CTR__V1;
    value_ = java.util.Objects.requireNonNull(value,"_Fields.AES__GCM__CTR__V1");
  }

  public boolean isSetAESGCMV1() {
    return setField_ == _Fields.AES__GCM__V1;
  }


  public boolean isSetAESGCMCTRV1() {
    return setField_ == _Fields.AES__GCM__CTR__V1;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof EncryptionAlgorithm) {
      return equals((EncryptionAlgorithm)other);
    } else {
      return false;
    }
  }

  public boolean equals(EncryptionAlgorithm other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(EncryptionAlgorithm other) {
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