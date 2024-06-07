/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public class TPrivilegeCtrl implements org.apache.thrift.TBase<TPrivilegeCtrl, TPrivilegeCtrl._Fields>, java.io.Serializable, Cloneable, Comparable<TPrivilegeCtrl> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPrivilegeCtrl");

  private static final org.apache.thrift.protocol.TField PRIV_HIER_FIELD_DESC = new org.apache.thrift.protocol.TField("priv_hier", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CTL_FIELD_DESC = new org.apache.thrift.protocol.TField("ctl", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DB_FIELD_DESC = new org.apache.thrift.protocol.TField("db", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TBL_FIELD_DESC = new org.apache.thrift.protocol.TField("tbl", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField COLS_FIELD_DESC = new org.apache.thrift.protocol.TField("cols", org.apache.thrift.protocol.TType.SET, (short)5);
  private static final org.apache.thrift.protocol.TField RES_FIELD_DESC = new org.apache.thrift.protocol.TField("res", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TPrivilegeCtrlStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TPrivilegeCtrlTupleSchemeFactory();

  /**
   * 
   * @see TPrivilegeHier
   */
  public @org.apache.thrift.annotation.Nullable TPrivilegeHier priv_hier; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String ctl; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String db; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String tbl; // optional
  public @org.apache.thrift.annotation.Nullable java.util.Set<java.lang.String> cols; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String res; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TPrivilegeHier
     */
    PRIV_HIER((short)1, "priv_hier"),
    CTL((short)2, "ctl"),
    DB((short)3, "db"),
    TBL((short)4, "tbl"),
    COLS((short)5, "cols"),
    RES((short)6, "res");

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
        case 1: // PRIV_HIER
          return PRIV_HIER;
        case 2: // CTL
          return CTL;
        case 3: // DB
          return DB;
        case 4: // TBL
          return TBL;
        case 5: // COLS
          return COLS;
        case 6: // RES
          return RES;
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
  private static final _Fields optionals[] = {_Fields.CTL,_Fields.DB,_Fields.TBL,_Fields.COLS,_Fields.RES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRIV_HIER, new org.apache.thrift.meta_data.FieldMetaData("priv_hier", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TPrivilegeHier.class)));
    tmpMap.put(_Fields.CTL, new org.apache.thrift.meta_data.FieldMetaData("ctl", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DB, new org.apache.thrift.meta_data.FieldMetaData("db", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TBL, new org.apache.thrift.meta_data.FieldMetaData("tbl", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COLS, new org.apache.thrift.meta_data.FieldMetaData("cols", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.RES, new org.apache.thrift.meta_data.FieldMetaData("res", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPrivilegeCtrl.class, metaDataMap);
  }

  public TPrivilegeCtrl() {
  }

  public TPrivilegeCtrl(
    TPrivilegeHier priv_hier)
  {
    this();
    this.priv_hier = priv_hier;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPrivilegeCtrl(TPrivilegeCtrl other) {
    if (other.isSetPrivHier()) {
      this.priv_hier = other.priv_hier;
    }
    if (other.isSetCtl()) {
      this.ctl = other.ctl;
    }
    if (other.isSetDb()) {
      this.db = other.db;
    }
    if (other.isSetTbl()) {
      this.tbl = other.tbl;
    }
    if (other.isSetCols()) {
      java.util.Set<java.lang.String> __this__cols = new java.util.HashSet<java.lang.String>(other.cols);
      this.cols = __this__cols;
    }
    if (other.isSetRes()) {
      this.res = other.res;
    }
  }

  public TPrivilegeCtrl deepCopy() {
    return new TPrivilegeCtrl(this);
  }

  @Override
  public void clear() {
    this.priv_hier = null;
    this.ctl = null;
    this.db = null;
    this.tbl = null;
    this.cols = null;
    this.res = null;
  }

  /**
   * 
   * @see TPrivilegeHier
   */
  @org.apache.thrift.annotation.Nullable
  public TPrivilegeHier getPrivHier() {
    return this.priv_hier;
  }

  /**
   * 
   * @see TPrivilegeHier
   */
  public TPrivilegeCtrl setPrivHier(@org.apache.thrift.annotation.Nullable TPrivilegeHier priv_hier) {
    this.priv_hier = priv_hier;
    return this;
  }

  public void unsetPrivHier() {
    this.priv_hier = null;
  }

  /** Returns true if field priv_hier is set (has been assigned a value) and false otherwise */
  public boolean isSetPrivHier() {
    return this.priv_hier != null;
  }

  public void setPrivHierIsSet(boolean value) {
    if (!value) {
      this.priv_hier = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCtl() {
    return this.ctl;
  }

  public TPrivilegeCtrl setCtl(@org.apache.thrift.annotation.Nullable java.lang.String ctl) {
    this.ctl = ctl;
    return this;
  }

  public void unsetCtl() {
    this.ctl = null;
  }

  /** Returns true if field ctl is set (has been assigned a value) and false otherwise */
  public boolean isSetCtl() {
    return this.ctl != null;
  }

  public void setCtlIsSet(boolean value) {
    if (!value) {
      this.ctl = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDb() {
    return this.db;
  }

  public TPrivilegeCtrl setDb(@org.apache.thrift.annotation.Nullable java.lang.String db) {
    this.db = db;
    return this;
  }

  public void unsetDb() {
    this.db = null;
  }

  /** Returns true if field db is set (has been assigned a value) and false otherwise */
  public boolean isSetDb() {
    return this.db != null;
  }

  public void setDbIsSet(boolean value) {
    if (!value) {
      this.db = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTbl() {
    return this.tbl;
  }

  public TPrivilegeCtrl setTbl(@org.apache.thrift.annotation.Nullable java.lang.String tbl) {
    this.tbl = tbl;
    return this;
  }

  public void unsetTbl() {
    this.tbl = null;
  }

  /** Returns true if field tbl is set (has been assigned a value) and false otherwise */
  public boolean isSetTbl() {
    return this.tbl != null;
  }

  public void setTblIsSet(boolean value) {
    if (!value) {
      this.tbl = null;
    }
  }

  public int getColsSize() {
    return (this.cols == null) ? 0 : this.cols.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getColsIterator() {
    return (this.cols == null) ? null : this.cols.iterator();
  }

  public void addToCols(java.lang.String elem) {
    if (this.cols == null) {
      this.cols = new java.util.HashSet<java.lang.String>();
    }
    this.cols.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Set<java.lang.String> getCols() {
    return this.cols;
  }

  public TPrivilegeCtrl setCols(@org.apache.thrift.annotation.Nullable java.util.Set<java.lang.String> cols) {
    this.cols = cols;
    return this;
  }

  public void unsetCols() {
    this.cols = null;
  }

  /** Returns true if field cols is set (has been assigned a value) and false otherwise */
  public boolean isSetCols() {
    return this.cols != null;
  }

  public void setColsIsSet(boolean value) {
    if (!value) {
      this.cols = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getRes() {
    return this.res;
  }

  public TPrivilegeCtrl setRes(@org.apache.thrift.annotation.Nullable java.lang.String res) {
    this.res = res;
    return this;
  }

  public void unsetRes() {
    this.res = null;
  }

  /** Returns true if field res is set (has been assigned a value) and false otherwise */
  public boolean isSetRes() {
    return this.res != null;
  }

  public void setResIsSet(boolean value) {
    if (!value) {
      this.res = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PRIV_HIER:
      if (value == null) {
        unsetPrivHier();
      } else {
        setPrivHier((TPrivilegeHier)value);
      }
      break;

    case CTL:
      if (value == null) {
        unsetCtl();
      } else {
        setCtl((java.lang.String)value);
      }
      break;

    case DB:
      if (value == null) {
        unsetDb();
      } else {
        setDb((java.lang.String)value);
      }
      break;

    case TBL:
      if (value == null) {
        unsetTbl();
      } else {
        setTbl((java.lang.String)value);
      }
      break;

    case COLS:
      if (value == null) {
        unsetCols();
      } else {
        setCols((java.util.Set<java.lang.String>)value);
      }
      break;

    case RES:
      if (value == null) {
        unsetRes();
      } else {
        setRes((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PRIV_HIER:
      return getPrivHier();

    case CTL:
      return getCtl();

    case DB:
      return getDb();

    case TBL:
      return getTbl();

    case COLS:
      return getCols();

    case RES:
      return getRes();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PRIV_HIER:
      return isSetPrivHier();
    case CTL:
      return isSetCtl();
    case DB:
      return isSetDb();
    case TBL:
      return isSetTbl();
    case COLS:
      return isSetCols();
    case RES:
      return isSetRes();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TPrivilegeCtrl)
      return this.equals((TPrivilegeCtrl)that);
    return false;
  }

  public boolean equals(TPrivilegeCtrl that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_priv_hier = true && this.isSetPrivHier();
    boolean that_present_priv_hier = true && that.isSetPrivHier();
    if (this_present_priv_hier || that_present_priv_hier) {
      if (!(this_present_priv_hier && that_present_priv_hier))
        return false;
      if (!this.priv_hier.equals(that.priv_hier))
        return false;
    }

    boolean this_present_ctl = true && this.isSetCtl();
    boolean that_present_ctl = true && that.isSetCtl();
    if (this_present_ctl || that_present_ctl) {
      if (!(this_present_ctl && that_present_ctl))
        return false;
      if (!this.ctl.equals(that.ctl))
        return false;
    }

    boolean this_present_db = true && this.isSetDb();
    boolean that_present_db = true && that.isSetDb();
    if (this_present_db || that_present_db) {
      if (!(this_present_db && that_present_db))
        return false;
      if (!this.db.equals(that.db))
        return false;
    }

    boolean this_present_tbl = true && this.isSetTbl();
    boolean that_present_tbl = true && that.isSetTbl();
    if (this_present_tbl || that_present_tbl) {
      if (!(this_present_tbl && that_present_tbl))
        return false;
      if (!this.tbl.equals(that.tbl))
        return false;
    }

    boolean this_present_cols = true && this.isSetCols();
    boolean that_present_cols = true && that.isSetCols();
    if (this_present_cols || that_present_cols) {
      if (!(this_present_cols && that_present_cols))
        return false;
      if (!this.cols.equals(that.cols))
        return false;
    }

    boolean this_present_res = true && this.isSetRes();
    boolean that_present_res = true && that.isSetRes();
    if (this_present_res || that_present_res) {
      if (!(this_present_res && that_present_res))
        return false;
      if (!this.res.equals(that.res))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPrivHier()) ? 131071 : 524287);
    if (isSetPrivHier())
      hashCode = hashCode * 8191 + priv_hier.getValue();

    hashCode = hashCode * 8191 + ((isSetCtl()) ? 131071 : 524287);
    if (isSetCtl())
      hashCode = hashCode * 8191 + ctl.hashCode();

    hashCode = hashCode * 8191 + ((isSetDb()) ? 131071 : 524287);
    if (isSetDb())
      hashCode = hashCode * 8191 + db.hashCode();

    hashCode = hashCode * 8191 + ((isSetTbl()) ? 131071 : 524287);
    if (isSetTbl())
      hashCode = hashCode * 8191 + tbl.hashCode();

    hashCode = hashCode * 8191 + ((isSetCols()) ? 131071 : 524287);
    if (isSetCols())
      hashCode = hashCode * 8191 + cols.hashCode();

    hashCode = hashCode * 8191 + ((isSetRes()) ? 131071 : 524287);
    if (isSetRes())
      hashCode = hashCode * 8191 + res.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TPrivilegeCtrl other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetPrivHier(), other.isSetPrivHier());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrivHier()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.priv_hier, other.priv_hier);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCtl(), other.isSetCtl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCtl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ctl, other.ctl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDb(), other.isSetDb());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDb()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.db, other.db);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTbl(), other.isSetTbl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTbl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tbl, other.tbl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCols(), other.isSetCols());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCols()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cols, other.cols);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRes(), other.isSetRes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.res, other.res);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TPrivilegeCtrl(");
    boolean first = true;

    sb.append("priv_hier:");
    if (this.priv_hier == null) {
      sb.append("null");
    } else {
      sb.append(this.priv_hier);
    }
    first = false;
    if (isSetCtl()) {
      if (!first) sb.append(", ");
      sb.append("ctl:");
      if (this.ctl == null) {
        sb.append("null");
      } else {
        sb.append(this.ctl);
      }
      first = false;
    }
    if (isSetDb()) {
      if (!first) sb.append(", ");
      sb.append("db:");
      if (this.db == null) {
        sb.append("null");
      } else {
        sb.append(this.db);
      }
      first = false;
    }
    if (isSetTbl()) {
      if (!first) sb.append(", ");
      sb.append("tbl:");
      if (this.tbl == null) {
        sb.append("null");
      } else {
        sb.append(this.tbl);
      }
      first = false;
    }
    if (isSetCols()) {
      if (!first) sb.append(", ");
      sb.append("cols:");
      if (this.cols == null) {
        sb.append("null");
      } else {
        sb.append(this.cols);
      }
      first = false;
    }
    if (isSetRes()) {
      if (!first) sb.append(", ");
      sb.append("res:");
      if (this.res == null) {
        sb.append("null");
      } else {
        sb.append(this.res);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (priv_hier == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'priv_hier' was not present! Struct: " + toString());
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

  private static class TPrivilegeCtrlStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TPrivilegeCtrlStandardScheme getScheme() {
      return new TPrivilegeCtrlStandardScheme();
    }
  }

  private static class TPrivilegeCtrlStandardScheme extends org.apache.thrift.scheme.StandardScheme<TPrivilegeCtrl> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TPrivilegeCtrl struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PRIV_HIER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.priv_hier = org.apache.doris.thrift.TPrivilegeHier.findByValue(iprot.readI32());
              struct.setPrivHierIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CTL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ctl = iprot.readString();
              struct.setCtlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.db = iprot.readString();
              struct.setDbIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TBL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tbl = iprot.readString();
              struct.setTblIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // COLS
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set432 = iprot.readSetBegin();
                struct.cols = new java.util.HashSet<java.lang.String>(2*_set432.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem433;
                for (int _i434 = 0; _i434 < _set432.size; ++_i434)
                {
                  _elem433 = iprot.readString();
                  struct.cols.add(_elem433);
                }
                iprot.readSetEnd();
              }
              struct.setColsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // RES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.res = iprot.readString();
              struct.setResIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TPrivilegeCtrl struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.priv_hier != null) {
        oprot.writeFieldBegin(PRIV_HIER_FIELD_DESC);
        oprot.writeI32(struct.priv_hier.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.ctl != null) {
        if (struct.isSetCtl()) {
          oprot.writeFieldBegin(CTL_FIELD_DESC);
          oprot.writeString(struct.ctl);
          oprot.writeFieldEnd();
        }
      }
      if (struct.db != null) {
        if (struct.isSetDb()) {
          oprot.writeFieldBegin(DB_FIELD_DESC);
          oprot.writeString(struct.db);
          oprot.writeFieldEnd();
        }
      }
      if (struct.tbl != null) {
        if (struct.isSetTbl()) {
          oprot.writeFieldBegin(TBL_FIELD_DESC);
          oprot.writeString(struct.tbl);
          oprot.writeFieldEnd();
        }
      }
      if (struct.cols != null) {
        if (struct.isSetCols()) {
          oprot.writeFieldBegin(COLS_FIELD_DESC);
          {
            oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, struct.cols.size()));
            for (java.lang.String _iter435 : struct.cols)
            {
              oprot.writeString(_iter435);
            }
            oprot.writeSetEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.res != null) {
        if (struct.isSetRes()) {
          oprot.writeFieldBegin(RES_FIELD_DESC);
          oprot.writeString(struct.res);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPrivilegeCtrlTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TPrivilegeCtrlTupleScheme getScheme() {
      return new TPrivilegeCtrlTupleScheme();
    }
  }

  private static class TPrivilegeCtrlTupleScheme extends org.apache.thrift.scheme.TupleScheme<TPrivilegeCtrl> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPrivilegeCtrl struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.priv_hier.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCtl()) {
        optionals.set(0);
      }
      if (struct.isSetDb()) {
        optionals.set(1);
      }
      if (struct.isSetTbl()) {
        optionals.set(2);
      }
      if (struct.isSetCols()) {
        optionals.set(3);
      }
      if (struct.isSetRes()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetCtl()) {
        oprot.writeString(struct.ctl);
      }
      if (struct.isSetDb()) {
        oprot.writeString(struct.db);
      }
      if (struct.isSetTbl()) {
        oprot.writeString(struct.tbl);
      }
      if (struct.isSetCols()) {
        {
          oprot.writeI32(struct.cols.size());
          for (java.lang.String _iter436 : struct.cols)
          {
            oprot.writeString(_iter436);
          }
        }
      }
      if (struct.isSetRes()) {
        oprot.writeString(struct.res);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPrivilegeCtrl struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.priv_hier = org.apache.doris.thrift.TPrivilegeHier.findByValue(iprot.readI32());
      struct.setPrivHierIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.ctl = iprot.readString();
        struct.setCtlIsSet(true);
      }
      if (incoming.get(1)) {
        struct.db = iprot.readString();
        struct.setDbIsSet(true);
      }
      if (incoming.get(2)) {
        struct.tbl = iprot.readString();
        struct.setTblIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TSet _set437 = iprot.readSetBegin(org.apache.thrift.protocol.TType.STRING);
          struct.cols = new java.util.HashSet<java.lang.String>(2*_set437.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem438;
          for (int _i439 = 0; _i439 < _set437.size; ++_i439)
          {
            _elem438 = iprot.readString();
            struct.cols.add(_elem438);
          }
        }
        struct.setColsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.res = iprot.readString();
        struct.setResIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
