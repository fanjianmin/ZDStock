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
 * 大盘数据 用于绘制3D柱状图 和 网格表
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-08-21")
public class Market implements org.apache.thrift.TBase<Market, Market._Fields>, java.io.Serializable, Cloneable, Comparable<Market>, android.os.Parcelable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Market");

  private static final org.apache.thrift.protocol.TField STOCK_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("stockName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PLATE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("plateName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField RANGE_PERCENTAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("rangePercentage", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField STOCK_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("stockCode", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField LATEST_PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("latestPrice", org.apache.thrift.protocol.TType.DOUBLE, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MarketStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MarketTupleSchemeFactory());
  }

  private String stockName; // required
  private String plateName; // optional
  private double rangePercentage; // required
  private String stockCode; // optional
  private double latestPrice; // optional

  @Override
  public void writeToParcel(android.os.Parcel out, int flags) {
    //primitive bitfield of type: byte
    out.writeByte(__isset_bitfield);

    out.writeString(stockName);
    out.writeString(plateName);
    out.writeDouble(rangePercentage);
    out.writeString(stockCode);
    out.writeDouble(latestPrice);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public Market(android.os.Parcel in) {
    //primitive bitfield of type: byte
    __isset_bitfield = in.readByte();

    this.stockName= in.readString();
    this.plateName= in.readString();
    this.rangePercentage = in.readDouble();
    this.stockCode= in.readString();
    this.latestPrice = in.readDouble();
  }

  public static final android.os.Parcelable.Creator<Market> CREATOR = new android.os.Parcelable.Creator<Market>() {
    @Override
    public Market[] newArray(int size) {
      return new Market[size];
    }

    @Override
    public Market createFromParcel(android.os.Parcel in) {
      return new Market(in);
    }
  };

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STOCK_NAME((short)1, "stockName"),
    PLATE_NAME((short)2, "plateName"),
    RANGE_PERCENTAGE((short)3, "rangePercentage"),
    STOCK_CODE((short)4, "stockCode"),
    LATEST_PRICE((short)5, "latestPrice");

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
        case 1: // STOCK_NAME
          return STOCK_NAME;
        case 2: // PLATE_NAME
          return PLATE_NAME;
        case 3: // RANGE_PERCENTAGE
          return RANGE_PERCENTAGE;
        case 4: // STOCK_CODE
          return STOCK_CODE;
        case 5: // LATEST_PRICE
          return LATEST_PRICE;
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
  private static final int __RANGEPERCENTAGE_ISSET_ID = 0;
  private static final int __LATESTPRICE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PLATE_NAME,_Fields.STOCK_CODE,_Fields.LATEST_PRICE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STOCK_NAME, new org.apache.thrift.meta_data.FieldMetaData("stockName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PLATE_NAME, new org.apache.thrift.meta_data.FieldMetaData("plateName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RANGE_PERCENTAGE, new org.apache.thrift.meta_data.FieldMetaData("rangePercentage", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.STOCK_CODE, new org.apache.thrift.meta_data.FieldMetaData("stockCode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LATEST_PRICE, new org.apache.thrift.meta_data.FieldMetaData("latestPrice", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Market.class, metaDataMap);
  }

  public Market() {
  }

  public Market(
    String stockName,
    double rangePercentage)
  {
    this();
    this.stockName = stockName;
    this.rangePercentage = rangePercentage;
    set_rangePercentage_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Market(Market other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.is_set_stockName()) {
      this.stockName = other.stockName;
    }
    if (other.is_set_plateName()) {
      this.plateName = other.plateName;
    }
    this.rangePercentage = other.rangePercentage;
    if (other.is_set_stockCode()) {
      this.stockCode = other.stockCode;
    }
    this.latestPrice = other.latestPrice;
  }

  public Market deepCopy() {
    return new Market(this);
  }

  public void clear() {
    this.stockName = null;
    this.plateName = null;
    set_rangePercentage_isSet(false);
    this.rangePercentage = 0.0;
    this.stockCode = null;
    set_latestPrice_isSet(false);
    this.latestPrice = 0.0;
  }

  public String get_stockName() {
    return this.stockName;
  }

  public void set_stockName(String stockName) {
    this.stockName = stockName;
  }

  public void unset_stockName() {
    this.stockName = null;
  }

  /** Returns true if field stockName is set (has been assigned a value) and false otherwise */
  public boolean is_set_stockName() {
    return this.stockName != null;
  }

  public void set_stockName_isSet(boolean value) {
    if (!value) {
      this.stockName = null;
    }
  }

  public String get_plateName() {
    return this.plateName;
  }

  public void set_plateName(String plateName) {
    this.plateName = plateName;
  }

  public void unset_plateName() {
    this.plateName = null;
  }

  /** Returns true if field plateName is set (has been assigned a value) and false otherwise */
  public boolean is_set_plateName() {
    return this.plateName != null;
  }

  public void set_plateName_isSet(boolean value) {
    if (!value) {
      this.plateName = null;
    }
  }

  public double get_rangePercentage() {
    return this.rangePercentage;
  }

  public void set_rangePercentage(double rangePercentage) {
    this.rangePercentage = rangePercentage;
    set_rangePercentage_isSet(true);
  }

  public void unset_rangePercentage() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RANGEPERCENTAGE_ISSET_ID);
  }

  /** Returns true if field rangePercentage is set (has been assigned a value) and false otherwise */
  public boolean is_set_rangePercentage() {
    return EncodingUtils.testBit(__isset_bitfield, __RANGEPERCENTAGE_ISSET_ID);
  }

  public void set_rangePercentage_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RANGEPERCENTAGE_ISSET_ID, value);
  }

  public String get_stockCode() {
    return this.stockCode;
  }

  public void set_stockCode(String stockCode) {
    this.stockCode = stockCode;
  }

  public void unset_stockCode() {
    this.stockCode = null;
  }

  /** Returns true if field stockCode is set (has been assigned a value) and false otherwise */
  public boolean is_set_stockCode() {
    return this.stockCode != null;
  }

  public void set_stockCode_isSet(boolean value) {
    if (!value) {
      this.stockCode = null;
    }
  }

  public double get_latestPrice() {
    return this.latestPrice;
  }

  public void set_latestPrice(double latestPrice) {
    this.latestPrice = latestPrice;
    set_latestPrice_isSet(true);
  }

  public void unset_latestPrice() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LATESTPRICE_ISSET_ID);
  }

  /** Returns true if field latestPrice is set (has been assigned a value) and false otherwise */
  public boolean is_set_latestPrice() {
    return EncodingUtils.testBit(__isset_bitfield, __LATESTPRICE_ISSET_ID);
  }

  public void set_latestPrice_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LATESTPRICE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STOCK_NAME:
      if (value == null) {
        unset_stockName();
      } else {
        set_stockName((String)value);
      }
      break;

    case PLATE_NAME:
      if (value == null) {
        unset_plateName();
      } else {
        set_plateName((String)value);
      }
      break;

    case RANGE_PERCENTAGE:
      if (value == null) {
        unset_rangePercentage();
      } else {
        set_rangePercentage((Double)value);
      }
      break;

    case STOCK_CODE:
      if (value == null) {
        unset_stockCode();
      } else {
        set_stockCode((String)value);
      }
      break;

    case LATEST_PRICE:
      if (value == null) {
        unset_latestPrice();
      } else {
        set_latestPrice((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STOCK_NAME:
      return get_stockName();

    case PLATE_NAME:
      return get_plateName();

    case RANGE_PERCENTAGE:
      return get_rangePercentage();

    case STOCK_CODE:
      return get_stockCode();

    case LATEST_PRICE:
      return get_latestPrice();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STOCK_NAME:
      return is_set_stockName();
    case PLATE_NAME:
      return is_set_plateName();
    case RANGE_PERCENTAGE:
      return is_set_rangePercentage();
    case STOCK_CODE:
      return is_set_stockCode();
    case LATEST_PRICE:
      return is_set_latestPrice();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Market)
      return this.equals((Market)that);
    return false;
  }

  public boolean equals(Market that) {
    if (that == null)
      return false;

    boolean this_present_stockName = true && this.is_set_stockName();
    boolean that_present_stockName = true && that.is_set_stockName();
    if (this_present_stockName || that_present_stockName) {
      if (!(this_present_stockName && that_present_stockName))
        return false;
      if (!this.stockName.equals(that.stockName))
        return false;
    }

    boolean this_present_plateName = true && this.is_set_plateName();
    boolean that_present_plateName = true && that.is_set_plateName();
    if (this_present_plateName || that_present_plateName) {
      if (!(this_present_plateName && that_present_plateName))
        return false;
      if (!this.plateName.equals(that.plateName))
        return false;
    }

    boolean this_present_rangePercentage = true;
    boolean that_present_rangePercentage = true;
    if (this_present_rangePercentage || that_present_rangePercentage) {
      if (!(this_present_rangePercentage && that_present_rangePercentage))
        return false;
      if (this.rangePercentage != that.rangePercentage)
        return false;
    }

    boolean this_present_stockCode = true && this.is_set_stockCode();
    boolean that_present_stockCode = true && that.is_set_stockCode();
    if (this_present_stockCode || that_present_stockCode) {
      if (!(this_present_stockCode && that_present_stockCode))
        return false;
      if (!this.stockCode.equals(that.stockCode))
        return false;
    }

    boolean this_present_latestPrice = true && this.is_set_latestPrice();
    boolean that_present_latestPrice = true && that.is_set_latestPrice();
    if (this_present_latestPrice || that_present_latestPrice) {
      if (!(this_present_latestPrice && that_present_latestPrice))
        return false;
      if (this.latestPrice != that.latestPrice)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_stockName = true && (is_set_stockName());
    list.add(present_stockName);
    if (present_stockName)
      list.add(stockName);

    boolean present_plateName = true && (is_set_plateName());
    list.add(present_plateName);
    if (present_plateName)
      list.add(plateName);

    boolean present_rangePercentage = true;
    list.add(present_rangePercentage);
    if (present_rangePercentage)
      list.add(rangePercentage);

    boolean present_stockCode = true && (is_set_stockCode());
    list.add(present_stockCode);
    if (present_stockCode)
      list.add(stockCode);

    boolean present_latestPrice = true && (is_set_latestPrice());
    list.add(present_latestPrice);
    if (present_latestPrice)
      list.add(latestPrice);

    return list.hashCode();
  }

  @Override
  public int compareTo(Market other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_stockName()).compareTo(other.is_set_stockName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_stockName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stockName, other.stockName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_plateName()).compareTo(other.is_set_plateName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_plateName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.plateName, other.plateName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_rangePercentage()).compareTo(other.is_set_rangePercentage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_rangePercentage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rangePercentage, other.rangePercentage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_stockCode()).compareTo(other.is_set_stockCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_stockCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stockCode, other.stockCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_latestPrice()).compareTo(other.is_set_latestPrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_latestPrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.latestPrice, other.latestPrice);
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
    StringBuilder sb = new StringBuilder("Market(");
    boolean first = true;

    sb.append("stockName:");
    if (this.stockName == null) {
      sb.append("null");
    } else {
      sb.append(this.stockName);
    }
    first = false;
    if (is_set_plateName()) {
      if (!first) sb.append(", ");
      sb.append("plateName:");
      if (this.plateName == null) {
        sb.append("null");
      } else {
        sb.append(this.plateName);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("rangePercentage:");
    sb.append(this.rangePercentage);
    first = false;
    if (is_set_stockCode()) {
      if (!first) sb.append(", ");
      sb.append("stockCode:");
      if (this.stockCode == null) {
        sb.append("null");
      } else {
        sb.append(this.stockCode);
      }
      first = false;
    }
    if (is_set_latestPrice()) {
      if (!first) sb.append(", ");
      sb.append("latestPrice:");
      sb.append(this.latestPrice);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_stockName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'stockName' is unset! Struct:" + toString());
    }

    if (!is_set_rangePercentage()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'rangePercentage' is unset! Struct:" + toString());
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

  private static class MarketStandardSchemeFactory implements SchemeFactory {
    public MarketStandardScheme getScheme() {
      return new MarketStandardScheme();
    }
  }

  private static class MarketStandardScheme extends StandardScheme<Market> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Market struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STOCK_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stockName = iprot.readString();
              struct.set_stockName_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PLATE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.plateName = iprot.readString();
              struct.set_plateName_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RANGE_PERCENTAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.rangePercentage = iprot.readDouble();
              struct.set_rangePercentage_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STOCK_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stockCode = iprot.readString();
              struct.set_stockCode_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LATEST_PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.latestPrice = iprot.readDouble();
              struct.set_latestPrice_isSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Market struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.stockName != null) {
        oprot.writeFieldBegin(STOCK_NAME_FIELD_DESC);
        oprot.writeString(struct.stockName);
        oprot.writeFieldEnd();
      }
      if (struct.plateName != null) {
        if (struct.is_set_plateName()) {
          oprot.writeFieldBegin(PLATE_NAME_FIELD_DESC);
          oprot.writeString(struct.plateName);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(RANGE_PERCENTAGE_FIELD_DESC);
      oprot.writeDouble(struct.rangePercentage);
      oprot.writeFieldEnd();
      if (struct.stockCode != null) {
        if (struct.is_set_stockCode()) {
          oprot.writeFieldBegin(STOCK_CODE_FIELD_DESC);
          oprot.writeString(struct.stockCode);
          oprot.writeFieldEnd();
        }
      }
      if (struct.is_set_latestPrice()) {
        oprot.writeFieldBegin(LATEST_PRICE_FIELD_DESC);
        oprot.writeDouble(struct.latestPrice);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MarketTupleSchemeFactory implements SchemeFactory {
    public MarketTupleScheme getScheme() {
      return new MarketTupleScheme();
    }
  }

  private static class MarketTupleScheme extends TupleScheme<Market> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Market struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.stockName);
      oprot.writeDouble(struct.rangePercentage);
      BitSet optionals = new BitSet();
      if (struct.is_set_plateName()) {
        optionals.set(0);
      }
      if (struct.is_set_stockCode()) {
        optionals.set(1);
      }
      if (struct.is_set_latestPrice()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.is_set_plateName()) {
        oprot.writeString(struct.plateName);
      }
      if (struct.is_set_stockCode()) {
        oprot.writeString(struct.stockCode);
      }
      if (struct.is_set_latestPrice()) {
        oprot.writeDouble(struct.latestPrice);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Market struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.stockName = iprot.readString();
      struct.set_stockName_isSet(true);
      struct.rangePercentage = iprot.readDouble();
      struct.set_rangePercentage_isSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.plateName = iprot.readString();
        struct.set_plateName_isSet(true);
      }
      if (incoming.get(1)) {
        struct.stockCode = iprot.readString();
        struct.set_stockCode_isSet(true);
      }
      if (incoming.get(2)) {
        struct.latestPrice = iprot.readDouble();
        struct.set_latestPrice_isSet(true);
      }
    }
  }

}

