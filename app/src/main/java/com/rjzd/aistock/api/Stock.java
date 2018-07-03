/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.rjzd.aistock.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * 自选股
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-08-21")
public class Stock implements org.apache.thrift.TBase<Stock, Stock._Fields>, java.io.Serializable, Cloneable, Comparable<Stock>, android.os.Parcelable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Stock");

  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ABBREVIATION_FIELD_DESC = new org.apache.thrift.protocol.TField("abbreviation", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StockStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StockTupleSchemeFactory());
  }

  private String code; // required
  private String name; // required
  private String abbreviation; // required

  @Override
  public void writeToParcel(android.os.Parcel out, int flags) {
    out.writeString(code);
    out.writeString(name);
    out.writeString(abbreviation);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public Stock(android.os.Parcel in) {
    this.code= in.readString();
    this.name= in.readString();
    this.abbreviation= in.readString();
  }

  public static final android.os.Parcelable.Creator<Stock> CREATOR = new android.os.Parcelable.Creator<Stock>() {
    @Override
    public Stock[] newArray(int size) {
      return new Stock[size];
    }

    @Override
    public Stock createFromParcel(android.os.Parcel in) {
      return new Stock(in);
    }
  };

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CODE((short)1, "code"),
    NAME((short)2, "name"),
    ABBREVIATION((short)3, "abbreviation");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CODE
          return CODE;
        case 2: // NAME
          return NAME;
        case 3: // ABBREVIATION
          return ABBREVIATION;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ABBREVIATION, new org.apache.thrift.meta_data.FieldMetaData("abbreviation", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Stock.class, metaDataMap);
  }

  public Stock() {
  }

  public Stock(
    String code,
    String name,
    String abbreviation)
  {
    this();
    this.code = code;
    this.name = name;
    this.abbreviation = abbreviation;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Stock(Stock other) {
    if (other.is_set_code()) {
      this.code = other.code;
    }
    if (other.is_set_name()) {
      this.name = other.name;
    }
    if (other.is_set_abbreviation()) {
      this.abbreviation = other.abbreviation;
    }
  }

  public Stock deepCopy() {
    return new Stock(this);
  }

  public void clear() {
    this.code = null;
    this.name = null;
    this.abbreviation = null;
  }

  public String get_code() {
    return this.code;
  }

  public void set_code(String code) {
    this.code = code;
  }

  public void unset_code() {
    this.code = null;
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean is_set_code() {
    return this.code != null;
  }

  public void set_code_isSet(boolean value) {
    if (!value) {
      this.code = null;
    }
  }

  public String get_name() {
    return this.name;
  }

  public void set_name(String name) {
    this.name = name;
  }

  public void unset_name() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean is_set_name() {
    return this.name != null;
  }

  public void set_name_isSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String get_abbreviation() {
    return this.abbreviation;
  }

  public void set_abbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public void unset_abbreviation() {
    this.abbreviation = null;
  }

  /** Returns true if field abbreviation is set (has been assigned a value) and false otherwise */
  public boolean is_set_abbreviation() {
    return this.abbreviation != null;
  }

  public void set_abbreviation_isSet(boolean value) {
    if (!value) {
      this.abbreviation = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CODE:
      if (value == null) {
        unset_code();
      } else {
        set_code((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unset_name();
      } else {
        set_name((String)value);
      }
      break;

    case ABBREVIATION:
      if (value == null) {
        unset_abbreviation();
      } else {
        set_abbreviation((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CODE:
      return get_code();

    case NAME:
      return get_name();

    case ABBREVIATION:
      return get_abbreviation();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CODE:
      return is_set_code();
    case NAME:
      return is_set_name();
    case ABBREVIATION:
      return is_set_abbreviation();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Stock)
      return this.equals((Stock)that);
    return false;
  }

  public boolean equals(Stock that) {
    if (that == null)
      return false;

    boolean this_present_code = true && this.is_set_code();
    boolean that_present_code = true && that.is_set_code();
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (!this.code.equals(that.code))
        return false;
    }

    boolean this_present_name = true && this.is_set_name();
    boolean that_present_name = true && that.is_set_name();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_abbreviation = true && this.is_set_abbreviation();
    boolean that_present_abbreviation = true && that.is_set_abbreviation();
    if (this_present_abbreviation || that_present_abbreviation) {
      if (!(this_present_abbreviation && that_present_abbreviation))
        return false;
      if (!this.abbreviation.equals(that.abbreviation))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_code = true && (is_set_code());
    list.add(present_code);
    if (present_code)
      list.add(code);

    boolean present_name = true && (is_set_name());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_abbreviation = true && (is_set_abbreviation());
    list.add(present_abbreviation);
    if (present_abbreviation)
      list.add(abbreviation);

    return list.hashCode();
  }

  @Override
  public int compareTo(Stock other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_code()).compareTo(other.is_set_code());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_code()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_name()).compareTo(other.is_set_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_abbreviation()).compareTo(other.is_set_abbreviation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_abbreviation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.abbreviation, other.abbreviation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Stock(");
    boolean first = true;

    sb.append("code:");
    if (this.code == null) {
      sb.append("null");
    } else {
      sb.append(this.code);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("abbreviation:");
    if (this.abbreviation == null) {
      sb.append("null");
    } else {
      sb.append(this.abbreviation);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_code()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'code' is unset! Struct:" + toString());
    }

    if (!is_set_name()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' is unset! Struct:" + toString());
    }

    if (!is_set_abbreviation()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'abbreviation' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te.getMessage());
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te.getMessage());
    }
  }

  private static class StockStandardSchemeFactory implements SchemeFactory {
    public StockStandardScheme getScheme() {
      return new StockStandardScheme();
    }
  }

  private static class StockStandardScheme extends StandardScheme<Stock> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Stock struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.code = iprot.readString();
              struct.set_code_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.set_name_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ABBREVIATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.abbreviation = iprot.readString();
              struct.set_abbreviation_isSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Stock struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.code != null) {
        oprot.writeFieldBegin(CODE_FIELD_DESC);
        oprot.writeString(struct.code);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.abbreviation != null) {
        oprot.writeFieldBegin(ABBREVIATION_FIELD_DESC);
        oprot.writeString(struct.abbreviation);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StockTupleSchemeFactory implements SchemeFactory {
    public StockTupleScheme getScheme() {
      return new StockTupleScheme();
    }
  }

  private static class StockTupleScheme extends TupleScheme<Stock> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Stock struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.code);
      oprot.writeString(struct.name);
      oprot.writeString(struct.abbreviation);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Stock struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.code = iprot.readString();
      struct.set_code_isSet(true);
      struct.name = iprot.readString();
      struct.set_name_isSet(true);
      struct.abbreviation = iprot.readString();
      struct.set_abbreviation_isSet(true);
    }
  }

}
