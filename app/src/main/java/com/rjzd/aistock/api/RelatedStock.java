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
 * 关联股
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-08-21")
public class RelatedStock implements org.apache.thrift.TBase<RelatedStock, RelatedStock._Fields>, java.io.Serializable, Cloneable, Comparable<RelatedStock>, android.os.Parcelable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RelatedStock");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField RANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("range", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField RELATION_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("relationValue", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField INDUSTRY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("industryName", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RelatedStockStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RelatedStockTupleSchemeFactory());
  }

  private String name; // required
  private String code; // required
  private double range; // required
  private double relationValue; // optional
  private String industryName; // optional

  @Override
  public void writeToParcel(android.os.Parcel out, int flags) {
    //primitive bitfield of type: byte
    out.writeByte(__isset_bitfield);

    out.writeString(name);
    out.writeString(code);
    out.writeDouble(range);
    out.writeDouble(relationValue);
    out.writeString(industryName);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public RelatedStock(android.os.Parcel in) {
    //primitive bitfield of type: byte
    __isset_bitfield = in.readByte();

    this.name= in.readString();
    this.code= in.readString();
    this.range = in.readDouble();
    this.relationValue = in.readDouble();
    this.industryName= in.readString();
  }

  public static final android.os.Parcelable.Creator<RelatedStock> CREATOR = new android.os.Parcelable.Creator<RelatedStock>() {
    @Override
    public RelatedStock[] newArray(int size) {
      return new RelatedStock[size];
    }

    @Override
    public RelatedStock createFromParcel(android.os.Parcel in) {
      return new RelatedStock(in);
    }
  };

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    CODE((short)2, "code"),
    RANGE((short)3, "range"),
    RELATION_VALUE((short)4, "relationValue"),
    INDUSTRY_NAME((short)5, "industryName");

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
        case 1: // NAME
          return NAME;
        case 2: // CODE
          return CODE;
        case 3: // RANGE
          return RANGE;
        case 4: // RELATION_VALUE
          return RELATION_VALUE;
        case 5: // INDUSTRY_NAME
          return INDUSTRY_NAME;
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
  private static final int __RANGE_ISSET_ID = 0;
  private static final int __RELATIONVALUE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.RELATION_VALUE,_Fields.INDUSTRY_NAME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RANGE, new org.apache.thrift.meta_data.FieldMetaData("range", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.RELATION_VALUE, new org.apache.thrift.meta_data.FieldMetaData("relationValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.INDUSTRY_NAME, new org.apache.thrift.meta_data.FieldMetaData("industryName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RelatedStock.class, metaDataMap);
  }

  public RelatedStock() {
  }

  public RelatedStock(
    String name,
    String code,
    double range)
  {
    this();
    this.name = name;
    this.code = code;
    this.range = range;
    set_range_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RelatedStock(RelatedStock other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.is_set_name()) {
      this.name = other.name;
    }
    if (other.is_set_code()) {
      this.code = other.code;
    }
    this.range = other.range;
    this.relationValue = other.relationValue;
    if (other.is_set_industryName()) {
      this.industryName = other.industryName;
    }
  }

  public RelatedStock deepCopy() {
    return new RelatedStock(this);
  }

  public void clear() {
    this.name = null;
    this.code = null;
    set_range_isSet(false);
    this.range = 0.0;
    set_relationValue_isSet(false);
    this.relationValue = 0.0;
    this.industryName = null;
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

  public double get_range() {
    return this.range;
  }

  public void set_range(double range) {
    this.range = range;
    set_range_isSet(true);
  }

  public void unset_range() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RANGE_ISSET_ID);
  }

  /** Returns true if field range is set (has been assigned a value) and false otherwise */
  public boolean is_set_range() {
    return EncodingUtils.testBit(__isset_bitfield, __RANGE_ISSET_ID);
  }

  public void set_range_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RANGE_ISSET_ID, value);
  }

  public double get_relationValue() {
    return this.relationValue;
  }

  public void set_relationValue(double relationValue) {
    this.relationValue = relationValue;
    set_relationValue_isSet(true);
  }

  public void unset_relationValue() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RELATIONVALUE_ISSET_ID);
  }

  /** Returns true if field relationValue is set (has been assigned a value) and false otherwise */
  public boolean is_set_relationValue() {
    return EncodingUtils.testBit(__isset_bitfield, __RELATIONVALUE_ISSET_ID);
  }

  public void set_relationValue_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RELATIONVALUE_ISSET_ID, value);
  }

  public String get_industryName() {
    return this.industryName;
  }

  public void set_industryName(String industryName) {
    this.industryName = industryName;
  }

  public void unset_industryName() {
    this.industryName = null;
  }

  /** Returns true if field industryName is set (has been assigned a value) and false otherwise */
  public boolean is_set_industryName() {
    return this.industryName != null;
  }

  public void set_industryName_isSet(boolean value) {
    if (!value) {
      this.industryName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unset_name();
      } else {
        set_name((String)value);
      }
      break;

    case CODE:
      if (value == null) {
        unset_code();
      } else {
        set_code((String)value);
      }
      break;

    case RANGE:
      if (value == null) {
        unset_range();
      } else {
        set_range((Double)value);
      }
      break;

    case RELATION_VALUE:
      if (value == null) {
        unset_relationValue();
      } else {
        set_relationValue((Double)value);
      }
      break;

    case INDUSTRY_NAME:
      if (value == null) {
        unset_industryName();
      } else {
        set_industryName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return get_name();

    case CODE:
      return get_code();

    case RANGE:
      return get_range();

    case RELATION_VALUE:
      return get_relationValue();

    case INDUSTRY_NAME:
      return get_industryName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return is_set_name();
    case CODE:
      return is_set_code();
    case RANGE:
      return is_set_range();
    case RELATION_VALUE:
      return is_set_relationValue();
    case INDUSTRY_NAME:
      return is_set_industryName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RelatedStock)
      return this.equals((RelatedStock)that);
    return false;
  }

  public boolean equals(RelatedStock that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.is_set_name();
    boolean that_present_name = true && that.is_set_name();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_code = true && this.is_set_code();
    boolean that_present_code = true && that.is_set_code();
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (!this.code.equals(that.code))
        return false;
    }

    boolean this_present_range = true;
    boolean that_present_range = true;
    if (this_present_range || that_present_range) {
      if (!(this_present_range && that_present_range))
        return false;
      if (this.range != that.range)
        return false;
    }

    boolean this_present_relationValue = true && this.is_set_relationValue();
    boolean that_present_relationValue = true && that.is_set_relationValue();
    if (this_present_relationValue || that_present_relationValue) {
      if (!(this_present_relationValue && that_present_relationValue))
        return false;
      if (this.relationValue != that.relationValue)
        return false;
    }

    boolean this_present_industryName = true && this.is_set_industryName();
    boolean that_present_industryName = true && that.is_set_industryName();
    if (this_present_industryName || that_present_industryName) {
      if (!(this_present_industryName && that_present_industryName))
        return false;
      if (!this.industryName.equals(that.industryName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_name = true && (is_set_name());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_code = true && (is_set_code());
    list.add(present_code);
    if (present_code)
      list.add(code);

    boolean present_range = true;
    list.add(present_range);
    if (present_range)
      list.add(range);

    boolean present_relationValue = true && (is_set_relationValue());
    list.add(present_relationValue);
    if (present_relationValue)
      list.add(relationValue);

    boolean present_industryName = true && (is_set_industryName());
    list.add(present_industryName);
    if (present_industryName)
      list.add(industryName);

    return list.hashCode();
  }

  @Override
  public int compareTo(RelatedStock other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(is_set_range()).compareTo(other.is_set_range());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_range()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.range, other.range);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_relationValue()).compareTo(other.is_set_relationValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_relationValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.relationValue, other.relationValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_industryName()).compareTo(other.is_set_industryName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_industryName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.industryName, other.industryName);
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
    StringBuilder sb = new StringBuilder("RelatedStock(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("code:");
    if (this.code == null) {
      sb.append("null");
    } else {
      sb.append(this.code);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("range:");
    sb.append(this.range);
    first = false;
    if (is_set_relationValue()) {
      if (!first) sb.append(", ");
      sb.append("relationValue:");
      sb.append(this.relationValue);
      first = false;
    }
    if (is_set_industryName()) {
      if (!first) sb.append(", ");
      sb.append("industryName:");
      if (this.industryName == null) {
        sb.append("null");
      } else {
        sb.append(this.industryName);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_name()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' is unset! Struct:" + toString());
    }

    if (!is_set_code()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'code' is unset! Struct:" + toString());
    }

    if (!is_set_range()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'range' is unset! Struct:" + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te.getMessage());
    }
  }

  private static class RelatedStockStandardSchemeFactory implements SchemeFactory {
    public RelatedStockStandardScheme getScheme() {
      return new RelatedStockStandardScheme();
    }
  }

  private static class RelatedStockStandardScheme extends StandardScheme<RelatedStock> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RelatedStock struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.set_name_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.code = iprot.readString();
              struct.set_code_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.range = iprot.readDouble();
              struct.set_range_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RELATION_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.relationValue = iprot.readDouble();
              struct.set_relationValue_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // INDUSTRY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.industryName = iprot.readString();
              struct.set_industryName_isSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RelatedStock struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.code != null) {
        oprot.writeFieldBegin(CODE_FIELD_DESC);
        oprot.writeString(struct.code);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(RANGE_FIELD_DESC);
      oprot.writeDouble(struct.range);
      oprot.writeFieldEnd();
      if (struct.is_set_relationValue()) {
        oprot.writeFieldBegin(RELATION_VALUE_FIELD_DESC);
        oprot.writeDouble(struct.relationValue);
        oprot.writeFieldEnd();
      }
      if (struct.industryName != null) {
        if (struct.is_set_industryName()) {
          oprot.writeFieldBegin(INDUSTRY_NAME_FIELD_DESC);
          oprot.writeString(struct.industryName);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RelatedStockTupleSchemeFactory implements SchemeFactory {
    public RelatedStockTupleScheme getScheme() {
      return new RelatedStockTupleScheme();
    }
  }

  private static class RelatedStockTupleScheme extends TupleScheme<RelatedStock> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RelatedStock struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.name);
      oprot.writeString(struct.code);
      oprot.writeDouble(struct.range);
      BitSet optionals = new BitSet();
      if (struct.is_set_relationValue()) {
        optionals.set(0);
      }
      if (struct.is_set_industryName()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.is_set_relationValue()) {
        oprot.writeDouble(struct.relationValue);
      }
      if (struct.is_set_industryName()) {
        oprot.writeString(struct.industryName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RelatedStock struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.name = iprot.readString();
      struct.set_name_isSet(true);
      struct.code = iprot.readString();
      struct.set_code_isSet(true);
      struct.range = iprot.readDouble();
      struct.set_range_isSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.relationValue = iprot.readDouble();
        struct.set_relationValue_isSet(true);
      }
      if (incoming.get(1)) {
        struct.industryName = iprot.readString();
        struct.set_industryName_isSet(true);
      }
    }
  }

}

