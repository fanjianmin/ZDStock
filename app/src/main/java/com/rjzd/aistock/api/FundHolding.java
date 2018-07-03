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
 * 机构持仓
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-08-21")
public class FundHolding implements org.apache.thrift.TBase<FundHolding, FundHolding._Fields>, java.io.Serializable, Cloneable, Comparable<FundHolding>, android.os.Parcelable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FundHolding");

  private static final org.apache.thrift.protocol.TField YEAR_FIELD_DESC = new org.apache.thrift.protocol.TField("year", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField QUARTER_FIELD_DESC = new org.apache.thrift.protocol.TField("quarter", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField HOLD_TOTAL_FIELD_DESC = new org.apache.thrift.protocol.TField("holdTotal", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("count", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField HOLD_PERCENTAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("holdPercentage", org.apache.thrift.protocol.TType.DOUBLE, (short)5);
  private static final org.apache.thrift.protocol.TField PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("price", org.apache.thrift.protocol.TType.DOUBLE, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FundHoldingStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FundHoldingTupleSchemeFactory());
  }

  private int year; // required
  private int quarter; // required
  private int holdTotal; // required
  private double count; // required
  private double holdPercentage; // required
  private double price; // required

  @Override
  public void writeToParcel(android.os.Parcel out, int flags) {
    //primitive bitfield of type: byte
    out.writeByte(__isset_bitfield);

    out.writeInt(year);
    out.writeInt(quarter);
    out.writeInt(holdTotal);
    out.writeDouble(count);
    out.writeDouble(holdPercentage);
    out.writeDouble(price);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public FundHolding(android.os.Parcel in) {
    //primitive bitfield of type: byte
    __isset_bitfield = in.readByte();

    this.year = in.readInt();
    this.quarter = in.readInt();
    this.holdTotal = in.readInt();
    this.count = in.readDouble();
    this.holdPercentage = in.readDouble();
    this.price = in.readDouble();
  }

  public static final android.os.Parcelable.Creator<FundHolding> CREATOR = new android.os.Parcelable.Creator<FundHolding>() {
    @Override
    public FundHolding[] newArray(int size) {
      return new FundHolding[size];
    }

    @Override
    public FundHolding createFromParcel(android.os.Parcel in) {
      return new FundHolding(in);
    }
  };

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    YEAR((short)1, "year"),
    QUARTER((short)2, "quarter"),
    HOLD_TOTAL((short)3, "holdTotal"),
    COUNT((short)4, "count"),
    HOLD_PERCENTAGE((short)5, "holdPercentage"),
    PRICE((short)6, "price");

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
        case 1: // YEAR
          return YEAR;
        case 2: // QUARTER
          return QUARTER;
        case 3: // HOLD_TOTAL
          return HOLD_TOTAL;
        case 4: // COUNT
          return COUNT;
        case 5: // HOLD_PERCENTAGE
          return HOLD_PERCENTAGE;
        case 6: // PRICE
          return PRICE;
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
  private static final int __YEAR_ISSET_ID = 0;
  private static final int __QUARTER_ISSET_ID = 1;
  private static final int __HOLDTOTAL_ISSET_ID = 2;
  private static final int __COUNT_ISSET_ID = 3;
  private static final int __HOLDPERCENTAGE_ISSET_ID = 4;
  private static final int __PRICE_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.YEAR, new org.apache.thrift.meta_data.FieldMetaData("year", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.QUARTER, new org.apache.thrift.meta_data.FieldMetaData("quarter", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.HOLD_TOTAL, new org.apache.thrift.meta_data.FieldMetaData("holdTotal", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COUNT, new org.apache.thrift.meta_data.FieldMetaData("count", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.HOLD_PERCENTAGE, new org.apache.thrift.meta_data.FieldMetaData("holdPercentage", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.PRICE, new org.apache.thrift.meta_data.FieldMetaData("price", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FundHolding.class, metaDataMap);
  }

  public FundHolding() {
  }

  public FundHolding(
    int year,
    int quarter,
    int holdTotal,
    double count,
    double holdPercentage,
    double price)
  {
    this();
    this.year = year;
    set_year_isSet(true);
    this.quarter = quarter;
    set_quarter_isSet(true);
    this.holdTotal = holdTotal;
    set_holdTotal_isSet(true);
    this.count = count;
    set_count_isSet(true);
    this.holdPercentage = holdPercentage;
    set_holdPercentage_isSet(true);
    this.price = price;
    set_price_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FundHolding(FundHolding other) {
    __isset_bitfield = other.__isset_bitfield;
    this.year = other.year;
    this.quarter = other.quarter;
    this.holdTotal = other.holdTotal;
    this.count = other.count;
    this.holdPercentage = other.holdPercentage;
    this.price = other.price;
  }

  public FundHolding deepCopy() {
    return new FundHolding(this);
  }

  public void clear() {
    set_year_isSet(false);
    this.year = 0;
    set_quarter_isSet(false);
    this.quarter = 0;
    set_holdTotal_isSet(false);
    this.holdTotal = 0;
    set_count_isSet(false);
    this.count = 0.0;
    set_holdPercentage_isSet(false);
    this.holdPercentage = 0.0;
    set_price_isSet(false);
    this.price = 0.0;
  }

  public int get_year() {
    return this.year;
  }

  public void set_year(int year) {
    this.year = year;
    set_year_isSet(true);
  }

  public void unset_year() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __YEAR_ISSET_ID);
  }

  /** Returns true if field year is set (has been assigned a value) and false otherwise */
  public boolean is_set_year() {
    return EncodingUtils.testBit(__isset_bitfield, __YEAR_ISSET_ID);
  }

  public void set_year_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __YEAR_ISSET_ID, value);
  }

  public int get_quarter() {
    return this.quarter;
  }

  public void set_quarter(int quarter) {
    this.quarter = quarter;
    set_quarter_isSet(true);
  }

  public void unset_quarter() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __QUARTER_ISSET_ID);
  }

  /** Returns true if field quarter is set (has been assigned a value) and false otherwise */
  public boolean is_set_quarter() {
    return EncodingUtils.testBit(__isset_bitfield, __QUARTER_ISSET_ID);
  }

  public void set_quarter_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __QUARTER_ISSET_ID, value);
  }

  public int get_holdTotal() {
    return this.holdTotal;
  }

  public void set_holdTotal(int holdTotal) {
    this.holdTotal = holdTotal;
    set_holdTotal_isSet(true);
  }

  public void unset_holdTotal() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HOLDTOTAL_ISSET_ID);
  }

  /** Returns true if field holdTotal is set (has been assigned a value) and false otherwise */
  public boolean is_set_holdTotal() {
    return EncodingUtils.testBit(__isset_bitfield, __HOLDTOTAL_ISSET_ID);
  }

  public void set_holdTotal_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HOLDTOTAL_ISSET_ID, value);
  }

  public double get_count() {
    return this.count;
  }

  public void set_count(double count) {
    this.count = count;
    set_count_isSet(true);
  }

  public void unset_count() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  /** Returns true if field count is set (has been assigned a value) and false otherwise */
  public boolean is_set_count() {
    return EncodingUtils.testBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  public void set_count_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COUNT_ISSET_ID, value);
  }

  public double get_holdPercentage() {
    return this.holdPercentage;
  }

  public void set_holdPercentage(double holdPercentage) {
    this.holdPercentage = holdPercentage;
    set_holdPercentage_isSet(true);
  }

  public void unset_holdPercentage() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HOLDPERCENTAGE_ISSET_ID);
  }

  /** Returns true if field holdPercentage is set (has been assigned a value) and false otherwise */
  public boolean is_set_holdPercentage() {
    return EncodingUtils.testBit(__isset_bitfield, __HOLDPERCENTAGE_ISSET_ID);
  }

  public void set_holdPercentage_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HOLDPERCENTAGE_ISSET_ID, value);
  }

  public double get_price() {
    return this.price;
  }

  public void set_price(double price) {
    this.price = price;
    set_price_isSet(true);
  }

  public void unset_price() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PRICE_ISSET_ID);
  }

  /** Returns true if field price is set (has been assigned a value) and false otherwise */
  public boolean is_set_price() {
    return EncodingUtils.testBit(__isset_bitfield, __PRICE_ISSET_ID);
  }

  public void set_price_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PRICE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case YEAR:
      if (value == null) {
        unset_year();
      } else {
        set_year((Integer)value);
      }
      break;

    case QUARTER:
      if (value == null) {
        unset_quarter();
      } else {
        set_quarter((Integer)value);
      }
      break;

    case HOLD_TOTAL:
      if (value == null) {
        unset_holdTotal();
      } else {
        set_holdTotal((Integer)value);
      }
      break;

    case COUNT:
      if (value == null) {
        unset_count();
      } else {
        set_count((Double)value);
      }
      break;

    case HOLD_PERCENTAGE:
      if (value == null) {
        unset_holdPercentage();
      } else {
        set_holdPercentage((Double)value);
      }
      break;

    case PRICE:
      if (value == null) {
        unset_price();
      } else {
        set_price((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case YEAR:
      return get_year();

    case QUARTER:
      return get_quarter();

    case HOLD_TOTAL:
      return get_holdTotal();

    case COUNT:
      return get_count();

    case HOLD_PERCENTAGE:
      return get_holdPercentage();

    case PRICE:
      return get_price();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case YEAR:
      return is_set_year();
    case QUARTER:
      return is_set_quarter();
    case HOLD_TOTAL:
      return is_set_holdTotal();
    case COUNT:
      return is_set_count();
    case HOLD_PERCENTAGE:
      return is_set_holdPercentage();
    case PRICE:
      return is_set_price();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FundHolding)
      return this.equals((FundHolding)that);
    return false;
  }

  public boolean equals(FundHolding that) {
    if (that == null)
      return false;

    boolean this_present_year = true;
    boolean that_present_year = true;
    if (this_present_year || that_present_year) {
      if (!(this_present_year && that_present_year))
        return false;
      if (this.year != that.year)
        return false;
    }

    boolean this_present_quarter = true;
    boolean that_present_quarter = true;
    if (this_present_quarter || that_present_quarter) {
      if (!(this_present_quarter && that_present_quarter))
        return false;
      if (this.quarter != that.quarter)
        return false;
    }

    boolean this_present_holdTotal = true;
    boolean that_present_holdTotal = true;
    if (this_present_holdTotal || that_present_holdTotal) {
      if (!(this_present_holdTotal && that_present_holdTotal))
        return false;
      if (this.holdTotal != that.holdTotal)
        return false;
    }

    boolean this_present_count = true;
    boolean that_present_count = true;
    if (this_present_count || that_present_count) {
      if (!(this_present_count && that_present_count))
        return false;
      if (this.count != that.count)
        return false;
    }

    boolean this_present_holdPercentage = true;
    boolean that_present_holdPercentage = true;
    if (this_present_holdPercentage || that_present_holdPercentage) {
      if (!(this_present_holdPercentage && that_present_holdPercentage))
        return false;
      if (this.holdPercentage != that.holdPercentage)
        return false;
    }

    boolean this_present_price = true;
    boolean that_present_price = true;
    if (this_present_price || that_present_price) {
      if (!(this_present_price && that_present_price))
        return false;
      if (this.price != that.price)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_year = true;
    list.add(present_year);
    if (present_year)
      list.add(year);

    boolean present_quarter = true;
    list.add(present_quarter);
    if (present_quarter)
      list.add(quarter);

    boolean present_holdTotal = true;
    list.add(present_holdTotal);
    if (present_holdTotal)
      list.add(holdTotal);

    boolean present_count = true;
    list.add(present_count);
    if (present_count)
      list.add(count);

    boolean present_holdPercentage = true;
    list.add(present_holdPercentage);
    if (present_holdPercentage)
      list.add(holdPercentage);

    boolean present_price = true;
    list.add(present_price);
    if (present_price)
      list.add(price);

    return list.hashCode();
  }

  @Override
  public int compareTo(FundHolding other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_year()).compareTo(other.is_set_year());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_year()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.year, other.year);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_quarter()).compareTo(other.is_set_quarter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_quarter()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.quarter, other.quarter);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_holdTotal()).compareTo(other.is_set_holdTotal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_holdTotal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.holdTotal, other.holdTotal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_count()).compareTo(other.is_set_count());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_count()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.count, other.count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_holdPercentage()).compareTo(other.is_set_holdPercentage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_holdPercentage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.holdPercentage, other.holdPercentage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_price()).compareTo(other.is_set_price());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_price()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.price, other.price);
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
    StringBuilder sb = new StringBuilder("FundHolding(");
    boolean first = true;

    sb.append("year:");
    sb.append(this.year);
    first = false;
    if (!first) sb.append(", ");
    sb.append("quarter:");
    sb.append(this.quarter);
    first = false;
    if (!first) sb.append(", ");
    sb.append("holdTotal:");
    sb.append(this.holdTotal);
    first = false;
    if (!first) sb.append(", ");
    sb.append("count:");
    sb.append(this.count);
    first = false;
    if (!first) sb.append(", ");
    sb.append("holdPercentage:");
    sb.append(this.holdPercentage);
    first = false;
    if (!first) sb.append(", ");
    sb.append("price:");
    sb.append(this.price);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_year()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'year' is unset! Struct:" + toString());
    }

    if (!is_set_quarter()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'quarter' is unset! Struct:" + toString());
    }

    if (!is_set_holdTotal()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'holdTotal' is unset! Struct:" + toString());
    }

    if (!is_set_count()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'count' is unset! Struct:" + toString());
    }

    if (!is_set_holdPercentage()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'holdPercentage' is unset! Struct:" + toString());
    }

    if (!is_set_price()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'price' is unset! Struct:" + toString());
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

  private static class FundHoldingStandardSchemeFactory implements SchemeFactory {
    public FundHoldingStandardScheme getScheme() {
      return new FundHoldingStandardScheme();
    }
  }

  private static class FundHoldingStandardScheme extends StandardScheme<FundHolding> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FundHolding struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // YEAR
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.year = iprot.readI32();
              struct.set_year_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // QUARTER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.quarter = iprot.readI32();
              struct.set_quarter_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HOLD_TOTAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.holdTotal = iprot.readI32();
              struct.set_holdTotal_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.count = iprot.readDouble();
              struct.set_count_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // HOLD_PERCENTAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.holdPercentage = iprot.readDouble();
              struct.set_holdPercentage_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.price = iprot.readDouble();
              struct.set_price_isSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FundHolding struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(YEAR_FIELD_DESC);
      oprot.writeI32(struct.year);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(QUARTER_FIELD_DESC);
      oprot.writeI32(struct.quarter);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(HOLD_TOTAL_FIELD_DESC);
      oprot.writeI32(struct.holdTotal);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(COUNT_FIELD_DESC);
      oprot.writeDouble(struct.count);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(HOLD_PERCENTAGE_FIELD_DESC);
      oprot.writeDouble(struct.holdPercentage);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PRICE_FIELD_DESC);
      oprot.writeDouble(struct.price);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FundHoldingTupleSchemeFactory implements SchemeFactory {
    public FundHoldingTupleScheme getScheme() {
      return new FundHoldingTupleScheme();
    }
  }

  private static class FundHoldingTupleScheme extends TupleScheme<FundHolding> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FundHolding struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.year);
      oprot.writeI32(struct.quarter);
      oprot.writeI32(struct.holdTotal);
      oprot.writeDouble(struct.count);
      oprot.writeDouble(struct.holdPercentage);
      oprot.writeDouble(struct.price);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FundHolding struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.year = iprot.readI32();
      struct.set_year_isSet(true);
      struct.quarter = iprot.readI32();
      struct.set_quarter_isSet(true);
      struct.holdTotal = iprot.readI32();
      struct.set_holdTotal_isSet(true);
      struct.count = iprot.readDouble();
      struct.set_count_isSet(true);
      struct.holdPercentage = iprot.readDouble();
      struct.set_holdPercentage_isSet(true);
      struct.price = iprot.readDouble();
      struct.set_price_isSet(true);
    }
  }

}

