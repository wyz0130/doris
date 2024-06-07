/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TMultiCastDataStreamSink implements org.apache.thrift.TBase<TMultiCastDataStreamSink, TMultiCastDataStreamSink._Fields>, java.io.Serializable, Cloneable, Comparable<TMultiCastDataStreamSink> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMultiCastDataStreamSink");

  private static final org.apache.thrift.protocol.TField SINKS_FIELD_DESC = new org.apache.thrift.protocol.TField("sinks", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField DESTINATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("destinations", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TMultiCastDataStreamSinkStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TMultiCastDataStreamSinkTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<TDataStreamSink> sinks; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<java.util.List<TPlanFragmentDestination>> destinations; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SINKS((short)1, "sinks"),
    DESTINATIONS((short)2, "destinations");

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
        case 1: // SINKS
          return SINKS;
        case 2: // DESTINATIONS
          return DESTINATIONS;
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
  private static final _Fields optionals[] = {_Fields.SINKS,_Fields.DESTINATIONS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SINKS, new org.apache.thrift.meta_data.FieldMetaData("sinks", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDataStreamSink.class))));
    tmpMap.put(_Fields.DESTINATIONS, new org.apache.thrift.meta_data.FieldMetaData("destinations", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TPlanFragmentDestination.class)))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMultiCastDataStreamSink.class, metaDataMap);
  }

  public TMultiCastDataStreamSink() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMultiCastDataStreamSink(TMultiCastDataStreamSink other) {
    if (other.isSetSinks()) {
      java.util.List<TDataStreamSink> __this__sinks = new java.util.ArrayList<TDataStreamSink>(other.sinks.size());
      for (TDataStreamSink other_element : other.sinks) {
        __this__sinks.add(new TDataStreamSink(other_element));
      }
      this.sinks = __this__sinks;
    }
    if (other.isSetDestinations()) {
      java.util.List<java.util.List<TPlanFragmentDestination>> __this__destinations = new java.util.ArrayList<java.util.List<TPlanFragmentDestination>>(other.destinations.size());
      for (java.util.List<TPlanFragmentDestination> other_element : other.destinations) {
        java.util.List<TPlanFragmentDestination> __this__destinations_copy = new java.util.ArrayList<TPlanFragmentDestination>(other_element.size());
        for (TPlanFragmentDestination other_element_element : other_element) {
          __this__destinations_copy.add(new TPlanFragmentDestination(other_element_element));
        }
        __this__destinations.add(__this__destinations_copy);
      }
      this.destinations = __this__destinations;
    }
  }

  public TMultiCastDataStreamSink deepCopy() {
    return new TMultiCastDataStreamSink(this);
  }

  @Override
  public void clear() {
    this.sinks = null;
    this.destinations = null;
  }

  public int getSinksSize() {
    return (this.sinks == null) ? 0 : this.sinks.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TDataStreamSink> getSinksIterator() {
    return (this.sinks == null) ? null : this.sinks.iterator();
  }

  public void addToSinks(TDataStreamSink elem) {
    if (this.sinks == null) {
      this.sinks = new java.util.ArrayList<TDataStreamSink>();
    }
    this.sinks.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TDataStreamSink> getSinks() {
    return this.sinks;
  }

  public TMultiCastDataStreamSink setSinks(@org.apache.thrift.annotation.Nullable java.util.List<TDataStreamSink> sinks) {
    this.sinks = sinks;
    return this;
  }

  public void unsetSinks() {
    this.sinks = null;
  }

  /** Returns true if field sinks is set (has been assigned a value) and false otherwise */
  public boolean isSetSinks() {
    return this.sinks != null;
  }

  public void setSinksIsSet(boolean value) {
    if (!value) {
      this.sinks = null;
    }
  }

  public int getDestinationsSize() {
    return (this.destinations == null) ? 0 : this.destinations.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.util.List<TPlanFragmentDestination>> getDestinationsIterator() {
    return (this.destinations == null) ? null : this.destinations.iterator();
  }

  public void addToDestinations(java.util.List<TPlanFragmentDestination> elem) {
    if (this.destinations == null) {
      this.destinations = new java.util.ArrayList<java.util.List<TPlanFragmentDestination>>();
    }
    this.destinations.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.util.List<TPlanFragmentDestination>> getDestinations() {
    return this.destinations;
  }

  public TMultiCastDataStreamSink setDestinations(@org.apache.thrift.annotation.Nullable java.util.List<java.util.List<TPlanFragmentDestination>> destinations) {
    this.destinations = destinations;
    return this;
  }

  public void unsetDestinations() {
    this.destinations = null;
  }

  /** Returns true if field destinations is set (has been assigned a value) and false otherwise */
  public boolean isSetDestinations() {
    return this.destinations != null;
  }

  public void setDestinationsIsSet(boolean value) {
    if (!value) {
      this.destinations = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SINKS:
      if (value == null) {
        unsetSinks();
      } else {
        setSinks((java.util.List<TDataStreamSink>)value);
      }
      break;

    case DESTINATIONS:
      if (value == null) {
        unsetDestinations();
      } else {
        setDestinations((java.util.List<java.util.List<TPlanFragmentDestination>>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SINKS:
      return getSinks();

    case DESTINATIONS:
      return getDestinations();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SINKS:
      return isSetSinks();
    case DESTINATIONS:
      return isSetDestinations();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TMultiCastDataStreamSink)
      return this.equals((TMultiCastDataStreamSink)that);
    return false;
  }

  public boolean equals(TMultiCastDataStreamSink that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_sinks = true && this.isSetSinks();
    boolean that_present_sinks = true && that.isSetSinks();
    if (this_present_sinks || that_present_sinks) {
      if (!(this_present_sinks && that_present_sinks))
        return false;
      if (!this.sinks.equals(that.sinks))
        return false;
    }

    boolean this_present_destinations = true && this.isSetDestinations();
    boolean that_present_destinations = true && that.isSetDestinations();
    if (this_present_destinations || that_present_destinations) {
      if (!(this_present_destinations && that_present_destinations))
        return false;
      if (!this.destinations.equals(that.destinations))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSinks()) ? 131071 : 524287);
    if (isSetSinks())
      hashCode = hashCode * 8191 + sinks.hashCode();

    hashCode = hashCode * 8191 + ((isSetDestinations()) ? 131071 : 524287);
    if (isSetDestinations())
      hashCode = hashCode * 8191 + destinations.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TMultiCastDataStreamSink other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetSinks(), other.isSetSinks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSinks()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sinks, other.sinks);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDestinations(), other.isSetDestinations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDestinations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.destinations, other.destinations);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TMultiCastDataStreamSink(");
    boolean first = true;

    if (isSetSinks()) {
      sb.append("sinks:");
      if (this.sinks == null) {
        sb.append("null");
      } else {
        sb.append(this.sinks);
      }
      first = false;
    }
    if (isSetDestinations()) {
      if (!first) sb.append(", ");
      sb.append("destinations:");
      if (this.destinations == null) {
        sb.append("null");
      } else {
        sb.append(this.destinations);
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

  private static class TMultiCastDataStreamSinkStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMultiCastDataStreamSinkStandardScheme getScheme() {
      return new TMultiCastDataStreamSinkStandardScheme();
    }
  }

  private static class TMultiCastDataStreamSinkStandardScheme extends org.apache.thrift.scheme.StandardScheme<TMultiCastDataStreamSink> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TMultiCastDataStreamSink struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SINKS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list76 = iprot.readListBegin();
                struct.sinks = new java.util.ArrayList<TDataStreamSink>(_list76.size);
                @org.apache.thrift.annotation.Nullable TDataStreamSink _elem77;
                for (int _i78 = 0; _i78 < _list76.size; ++_i78)
                {
                  _elem77 = new TDataStreamSink();
                  _elem77.read(iprot);
                  struct.sinks.add(_elem77);
                }
                iprot.readListEnd();
              }
              struct.setSinksIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DESTINATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list79 = iprot.readListBegin();
                struct.destinations = new java.util.ArrayList<java.util.List<TPlanFragmentDestination>>(_list79.size);
                @org.apache.thrift.annotation.Nullable java.util.List<TPlanFragmentDestination> _elem80;
                for (int _i81 = 0; _i81 < _list79.size; ++_i81)
                {
                  {
                    org.apache.thrift.protocol.TList _list82 = iprot.readListBegin();
                    _elem80 = new java.util.ArrayList<TPlanFragmentDestination>(_list82.size);
                    @org.apache.thrift.annotation.Nullable TPlanFragmentDestination _elem83;
                    for (int _i84 = 0; _i84 < _list82.size; ++_i84)
                    {
                      _elem83 = new TPlanFragmentDestination();
                      _elem83.read(iprot);
                      _elem80.add(_elem83);
                    }
                    iprot.readListEnd();
                  }
                  struct.destinations.add(_elem80);
                }
                iprot.readListEnd();
              }
              struct.setDestinationsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TMultiCastDataStreamSink struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sinks != null) {
        if (struct.isSetSinks()) {
          oprot.writeFieldBegin(SINKS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.sinks.size()));
            for (TDataStreamSink _iter85 : struct.sinks)
            {
              _iter85.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.destinations != null) {
        if (struct.isSetDestinations()) {
          oprot.writeFieldBegin(DESTINATIONS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.destinations.size()));
            for (java.util.List<TPlanFragmentDestination> _iter86 : struct.destinations)
            {
              {
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter86.size()));
                for (TPlanFragmentDestination _iter87 : _iter86)
                {
                  _iter87.write(oprot);
                }
                oprot.writeListEnd();
              }
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

  private static class TMultiCastDataStreamSinkTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMultiCastDataStreamSinkTupleScheme getScheme() {
      return new TMultiCastDataStreamSinkTupleScheme();
    }
  }

  private static class TMultiCastDataStreamSinkTupleScheme extends org.apache.thrift.scheme.TupleScheme<TMultiCastDataStreamSink> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMultiCastDataStreamSink struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSinks()) {
        optionals.set(0);
      }
      if (struct.isSetDestinations()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSinks()) {
        {
          oprot.writeI32(struct.sinks.size());
          for (TDataStreamSink _iter88 : struct.sinks)
          {
            _iter88.write(oprot);
          }
        }
      }
      if (struct.isSetDestinations()) {
        {
          oprot.writeI32(struct.destinations.size());
          for (java.util.List<TPlanFragmentDestination> _iter89 : struct.destinations)
          {
            {
              oprot.writeI32(_iter89.size());
              for (TPlanFragmentDestination _iter90 : _iter89)
              {
                _iter90.write(oprot);
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMultiCastDataStreamSink struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list91 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.sinks = new java.util.ArrayList<TDataStreamSink>(_list91.size);
          @org.apache.thrift.annotation.Nullable TDataStreamSink _elem92;
          for (int _i93 = 0; _i93 < _list91.size; ++_i93)
          {
            _elem92 = new TDataStreamSink();
            _elem92.read(iprot);
            struct.sinks.add(_elem92);
          }
        }
        struct.setSinksIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list94 = iprot.readListBegin(org.apache.thrift.protocol.TType.LIST);
          struct.destinations = new java.util.ArrayList<java.util.List<TPlanFragmentDestination>>(_list94.size);
          @org.apache.thrift.annotation.Nullable java.util.List<TPlanFragmentDestination> _elem95;
          for (int _i96 = 0; _i96 < _list94.size; ++_i96)
          {
            {
              org.apache.thrift.protocol.TList _list97 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
              _elem95 = new java.util.ArrayList<TPlanFragmentDestination>(_list97.size);
              @org.apache.thrift.annotation.Nullable TPlanFragmentDestination _elem98;
              for (int _i99 = 0; _i99 < _list97.size; ++_i99)
              {
                _elem98 = new TPlanFragmentDestination();
                _elem98.read(iprot);
                _elem95.add(_elem98);
              }
            }
            struct.destinations.add(_elem95);
          }
        }
        struct.setDestinationsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

