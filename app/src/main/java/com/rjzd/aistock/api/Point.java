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
 * 绘制K线图所需要数据结构  包括K线 分时  日k 月k
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-08-21")
public class Point implements org.apache.thrift.TBase<Point, Point._Fields>, java.io.Serializable, Cloneable, Comparable<Point>, android.os.Parcelable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Point");

  private static final org.apache.thrift.protocol.TField PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("price", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField CLOSE_FIELD_DESC = new org.apache.thrift.protocol.TField("close", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField OPEN_FIELD_DESC = new org.apache.thrift.protocol.TField("open", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField VOLUME_FIELD_DESC = new org.apache.thrift.protocol.TField("volume", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField HIGH_FIELD_DESC = new org.apache.thrift.protocol.TField("high", org.apache.thrift.protocol.TType.DOUBLE, (short)5);
  private static final org.apache.thrift.protocol.TField LOW_FIELD_DESC = new org.apache.thrift.protocol.TField("low", org.apache.thrift.protocol.TType.DOUBLE, (short)6);
  private static final org.apache.thrift.protocol.TField AVERAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("average", org.apache.thrift.protocol.TType.DOUBLE, (short)7);
  private static final org.apache.thrift.protocol.TField RANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("range", org.apache.thrift.protocol.TType.DOUBLE, (short)8);
  private static final org.apache.thrift.protocol.TField TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("time", org.apache.thrift.protocol.TType.I64, (short)9);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PointStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PointTupleSchemeFactory());
  }

  private double price; // required
  private double close; // required
  private double open; // required
  private long volume; // required
  private double high; // required
  private double low; // required
  private double average; // required
  private double range; // required
  private long time; // required

  @Override
  public void writeToParcel(android.os.Parcel out, int flags) {
    //primitive bitfield of type: short
    out.writeInt(new Short(__isset_bitfield).intValue());

    out.writeDouble(price);
    out.writeDouble(close);
    out.writeDouble(open);
    out.writeLong(volume);
    out.writeDouble(high);
    out.writeDouble(low);
    out.writeDouble(average);
    out.writeDouble(range);
    out.writeLong(time);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public Point(android.os.Parcel in) {
    //primitive bitfield of type: short
    __isset_bitfield = (short) in.readInt();

    this.price = in.readDouble();
    this.close = in.readDouble();
    this.open = in.readDouble();
    this.volume = in.readLong();
    this.high = in.readDouble();
    this.low = in.readDouble();
    this.average = in.readDouble();
    this.range = in.readDouble();
    this.time = in.readLong();
  }

  public static final android.os.Parcelable.Creator<Point> CREATOR = new android.os.Parcelable.Creator<Point>() {
    @Override
    public Point[] newArray(int size) {
      return new Point[size];
    }

    @Override
    public Point createFromParcel(android.os.Parcel in) {
      return new Point(in);
    }
  };

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PRICE((short)1, "price"),
    CLOSE((short)2, "close"),
    OPEN((short)3, "open"),
    VOLUME((short)4, "volume"),
    HIGH((short)5, "high"),
    LOW((short)6, "low"),
    AVERAGE((short)7, "average"),
    RANGE((short)8, "range"),
    TIME((short)9, "time");

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
        case 1: // PRICE
          return PRICE;
        case 2: // CLOSE
          return CLOSE;
        case 3: // OPEN
          return OPEN;
        case 4: // VOLUME
          return VOLUME;
        case 5: // HIGH
          return HIGH;
        case 6: // LOW
          return LOW;
        case 7: // AVERAGE
          return AVERAGE;
        case 8: // RANGE
          return RANGE;
        case 9: // TIME
          return TIME;
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
  private static final int __PRICE_ISSET_ID = 0;
  private static final int __CLOSE_ISSET_ID = 1;
  private static final int __OPEN_ISSET_ID = 2;
  private static final int __VOLUME_ISSET_ID = 3;
  private static final int __HIGH_ISSET_ID = 4;
  private static final int __LOW_ISSET_ID = 5;
  private static final int __AVERAGE_ISSET_ID = 6;
  private static final int __RANGE_ISSET_ID = 7;
  private static final int __TIME_ISSET_ID = 8;
  private short __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRICE, new org.apache.thrift.meta_data.FieldMetaData("price", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.CLOSE, new org.apache.thrift.meta_data.FieldMetaData("close", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.OPEN, new org.apache.thrift.meta_data.FieldMetaData("open", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.VOLUME, new org.apache.thrift.meta_data.FieldMetaData("volume", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.HIGH, new org.apache.thrift.meta_data.FieldMetaData("high", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.LOW, new org.apache.thrift.meta_data.FieldMetaData("low", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.AVERAGE, new org.apache.thrift.meta_data.FieldMetaData("average", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.RANGE, new org.apache.thrift.meta_data.FieldMetaData("range", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.TIME, new org.apache.thrift.meta_data.FieldMetaData("time", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Point.class, metaDataMap);
  }

  public Point() {
  }

  public Point(
    double price,
    double close,
    double open,
    long volume,
    double high,
    double low,
    double average,
    double range,
    long time)
  {
    this();
    this.price = price;
    set_price_isSet(true);
    this.close = close;
    set_close_isSet(true);
    this.open = open;
    set_open_isSet(true);
    this.volume = volume;
    set_volume_isSet(true);
    this.high = high;
    set_high_isSet(true);
    this.low = low;
    set_low_isSet(true);
    this.average = average;
    set_average_isSet(true);
    this.range = range;
    set_range_isSet(true);
    this.time = time;
    set_time_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Point(Point other) {
    __isset_bitfield = other.__isset_bitfield;
    this.price = other.price;
    this.close = other.close;
    this.open = other.open;
    this.volume = other.volume;
    this.high = other.high;
    this.low = other.low;
    this.average = other.average;
    this.range = other.range;
    this.time = other.time;
  }

  public Point deepCopy() {
    return new Point(this);
  }

  public void clear() {
    set_price_isSet(false);
    this.price = 0.0;
    set_close_isSet(false);
    this.close = 0.0;
    set_open_isSet(false);
    this.open = 0.0;
    set_volume_isSet(false);
    this.volume = 0;
    set_high_isSet(false);
    this.high = 0.0;
    set_low_isSet(false);
    this.low = 0.0;
    set_average_isSet(false);
    this.average = 0.0;
    set_range_isSet(false);
    this.range = 0.0;
    set_time_isSet(false);
    this.time = 0;
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

  public double get_close() {
    return this.close;
  }

  public void set_close(double close) {
    this.close = close;
    set_close_isSet(true);
  }

  public void unset_close() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CLOSE_ISSET_ID);
  }

  /** Returns true if field close is set (has been assigned a value) and false otherwise */
  public boolean is_set_close() {
    return EncodingUtils.testBit(__isset_bitfield, __CLOSE_ISSET_ID);
  }

  public void set_close_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CLOSE_ISSET_ID, value);
  }

  public double get_open() {
    return this.open;
  }

  public void set_open(double open) {
    this.open = open;
    set_open_isSet(true);
  }

  public void unset_open() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OPEN_ISSET_ID);
  }

  /** Returns true if field open is set (has been assigned a value) and false otherwise */
  public boolean is_set_open() {
    return EncodingUtils.testBit(__isset_bitfield, __OPEN_ISSET_ID);
  }

  public void set_open_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OPEN_ISSET_ID, value);
  }

  public long get_volume() {
    return this.volume;
  }

  public void set_volume(long volume) {
    this.volume = volume;
    set_volume_isSet(true);
  }

  public void unset_volume() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VOLUME_ISSET_ID);
  }

  /** Returns true if field volume is set (has been assigned a value) and false otherwise */
  public boolean is_set_volume() {
    return EncodingUtils.testBit(__isset_bitfield, __VOLUME_ISSET_ID);
  }

  public void set_volume_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VOLUME_ISSET_ID, value);
  }

  public double get_high() {
    return this.high;
  }

  public void set_high(double high) {
    this.high = high;
    set_high_isSet(true);
  }

  public void unset_high() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HIGH_ISSET_ID);
  }

  /** Returns true if field high is set (has been assigned a value) and false otherwise */
  public boolean is_set_high() {
    return EncodingUtils.testBit(__isset_bitfield, __HIGH_ISSET_ID);
  }

  public void set_high_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HIGH_ISSET_ID, value);
  }

  public double get_low() {
    return this.low;
  }

  public void set_low(double low) {
    this.low = low;
    set_low_isSet(true);
  }

  public void unset_low() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LOW_ISSET_ID);
  }

  /** Returns true if field low is set (has been assigned a value) and false otherwise */
  public boolean is_set_low() {
    return EncodingUtils.testBit(__isset_bitfield, __LOW_ISSET_ID);
  }

  public void set_low_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LOW_ISSET_ID, value);
  }

  public double get_average() {
    return this.average;
  }

  public void set_average(double average) {
    this.average = average;
    set_average_isSet(true);
  }

  public void unset_average() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AVERAGE_ISSET_ID);
  }

  /** Returns true if field average is set (has been assigned a value) and false otherwise */
  public boolean is_set_average() {
    return EncodingUtils.testBit(__isset_bitfield, __AVERAGE_ISSET_ID);
  }

  public void set_average_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AVERAGE_ISSET_ID, value);
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

  public long get_time() {
    return this.time;
  }

  public void set_time(long time) {
    this.time = time;
    set_time_isSet(true);
  }

  public void unset_time() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIME_ISSET_ID);
  }

  /** Returns true if field time is set (has been assigned a value) and false otherwise */
  public boolean is_set_time() {
    return EncodingUtils.testBit(__isset_bitfield, __TIME_ISSET_ID);
  }

  public void set_time_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PRICE:
      if (value == null) {
        unset_price();
      } else {
        set_price((Double)value);
      }
      break;

    case CLOSE:
      if (value == null) {
        unset_close();
      } else {
        set_close((Double)value);
      }
      break;

    case OPEN:
      if (value == null) {
        unset_open();
      } else {
        set_open((Double)value);
      }
      break;

    case VOLUME:
      if (value == null) {
        unset_volume();
      } else {
        set_volume((Long)value);
      }
      break;

    case HIGH:
      if (value == null) {
        unset_high();
      } else {
        set_high((Double)value);
      }
      break;

    case LOW:
      if (value == null) {
        unset_low();
      } else {
        set_low((Double)value);
      }
      break;

    case AVERAGE:
      if (value == null) {
        unset_average();
      } else {
        set_average((Double)value);
      }
      break;

    case RANGE:
      if (value == null) {
        unset_range();
      } else {
        set_range((Double)value);
      }
      break;

    case TIME:
      if (value == null) {
        unset_time();
      } else {
        set_time((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PRICE:
      return get_price();

    case CLOSE:
      return get_close();

    case OPEN:
      return get_open();

    case VOLUME:
      return get_volume();

    case HIGH:
      return get_high();

    case LOW:
      return get_low();

    case AVERAGE:
      return get_average();

    case RANGE:
      return get_range();

    case TIME:
      return get_time();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PRICE:
      return is_set_price();
    case CLOSE:
      return is_set_close();
    case OPEN:
      return is_set_open();
    case VOLUME:
      return is_set_volume();
    case HIGH:
      return is_set_high();
    case LOW:
      return is_set_low();
    case AVERAGE:
      return is_set_average();
    case RANGE:
      return is_set_range();
    case TIME:
      return is_set_time();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Point)
      return this.equals((Point)that);
    return false;
  }

  public boolean equals(Point that) {
    if (that == null)
      return false;

    boolean this_present_price = true;
    boolean that_present_price = true;
    if (this_present_price || that_present_price) {
      if (!(this_present_price && that_present_price))
        return false;
      if (this.price != that.price)
        return false;
    }

    boolean this_present_close = true;
    boolean that_present_close = true;
    if (this_present_close || that_present_close) {
      if (!(this_present_close && that_present_close))
        return false;
      if (this.close != that.close)
        return false;
    }

    boolean this_present_open = true;
    boolean that_present_open = true;
    if (this_present_open || that_present_open) {
      if (!(this_present_open && that_present_open))
        return false;
      if (this.open != that.open)
        return false;
    }

    boolean this_present_volume = true;
    boolean that_present_volume = true;
    if (this_present_volume || that_present_volume) {
      if (!(this_present_volume && that_present_volume))
        return false;
      if (this.volume != that.volume)
        return false;
    }

    boolean this_present_high = true;
    boolean that_present_high = true;
    if (this_present_high || that_present_high) {
      if (!(this_present_high && that_present_high))
        return false;
      if (this.high != that.high)
        return false;
    }

    boolean this_present_low = true;
    boolean that_present_low = true;
    if (this_present_low || that_present_low) {
      if (!(this_present_low && that_present_low))
        return false;
      if (this.low != that.low)
        return false;
    }

    boolean this_present_average = true;
    boolean that_present_average = true;
    if (this_present_average || that_present_average) {
      if (!(this_present_average && that_present_average))
        return false;
      if (this.average != that.average)
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

    boolean this_present_time = true;
    boolean that_present_time = true;
    if (this_present_time || that_present_time) {
      if (!(this_present_time && that_present_time))
        return false;
      if (this.time != that.time)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_price = true;
    list.add(present_price);
    if (present_price)
      list.add(price);

    boolean present_close = true;
    list.add(present_close);
    if (present_close)
      list.add(close);

    boolean present_open = true;
    list.add(present_open);
    if (present_open)
      list.add(open);

    boolean present_volume = true;
    list.add(present_volume);
    if (present_volume)
      list.add(volume);

    boolean present_high = true;
    list.add(present_high);
    if (present_high)
      list.add(high);

    boolean present_low = true;
    list.add(present_low);
    if (present_low)
      list.add(low);

    boolean present_average = true;
    list.add(present_average);
    if (present_average)
      list.add(average);

    boolean present_range = true;
    list.add(present_range);
    if (present_range)
      list.add(range);

    boolean present_time = true;
    list.add(present_time);
    if (present_time)
      list.add(time);

    return list.hashCode();
  }

  @Override
  public int compareTo(Point other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = Boolean.valueOf(is_set_close()).compareTo(other.is_set_close());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_close()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.close, other.close);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_open()).compareTo(other.is_set_open());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_open()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.open, other.open);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_volume()).compareTo(other.is_set_volume());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_volume()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.volume, other.volume);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_high()).compareTo(other.is_set_high());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_high()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.high, other.high);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_low()).compareTo(other.is_set_low());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_low()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.low, other.low);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_average()).compareTo(other.is_set_average());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_average()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.average, other.average);
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
    lastComparison = Boolean.valueOf(is_set_time()).compareTo(other.is_set_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.time, other.time);
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
    StringBuilder sb = new StringBuilder("Point(");
    boolean first = true;

    sb.append("price:");
    sb.append(this.price);
    first = false;
    if (!first) sb.append(", ");
    sb.append("close:");
    sb.append(this.close);
    first = false;
    if (!first) sb.append(", ");
    sb.append("open:");
    sb.append(this.open);
    first = false;
    if (!first) sb.append(", ");
    sb.append("volume:");
    sb.append(this.volume);
    first = false;
    if (!first) sb.append(", ");
    sb.append("high:");
    sb.append(this.high);
    first = false;
    if (!first) sb.append(", ");
    sb.append("low:");
    sb.append(this.low);
    first = false;
    if (!first) sb.append(", ");
    sb.append("average:");
    sb.append(this.average);
    first = false;
    if (!first) sb.append(", ");
    sb.append("range:");
    sb.append(this.range);
    first = false;
    if (!first) sb.append(", ");
    sb.append("time:");
    sb.append(this.time);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_price()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'price' is unset! Struct:" + toString());
    }

    if (!is_set_close()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'close' is unset! Struct:" + toString());
    }

    if (!is_set_open()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'open' is unset! Struct:" + toString());
    }

    if (!is_set_volume()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'volume' is unset! Struct:" + toString());
    }

    if (!is_set_high()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'high' is unset! Struct:" + toString());
    }

    if (!is_set_low()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'low' is unset! Struct:" + toString());
    }

    if (!is_set_average()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'average' is unset! Struct:" + toString());
    }

    if (!is_set_range()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'range' is unset! Struct:" + toString());
    }

    if (!is_set_time()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'time' is unset! Struct:" + toString());
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

  private static class PointStandardSchemeFactory implements SchemeFactory {
    public PointStandardScheme getScheme() {
      return new PointStandardScheme();
    }
  }

  private static class PointStandardScheme extends StandardScheme<Point> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Point struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.price = iprot.readDouble();
              struct.set_price_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CLOSE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.close = iprot.readDouble();
              struct.set_close_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OPEN
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.open = iprot.readDouble();
              struct.set_open_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // VOLUME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.volume = iprot.readI64();
              struct.set_volume_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // HIGH
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.high = iprot.readDouble();
              struct.set_high_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // LOW
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.low = iprot.readDouble();
              struct.set_low_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // AVERAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.average = iprot.readDouble();
              struct.set_average_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // RANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.range = iprot.readDouble();
              struct.set_range_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.time = iprot.readI64();
              struct.set_time_isSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Point struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PRICE_FIELD_DESC);
      oprot.writeDouble(struct.price);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CLOSE_FIELD_DESC);
      oprot.writeDouble(struct.close);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(OPEN_FIELD_DESC);
      oprot.writeDouble(struct.open);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VOLUME_FIELD_DESC);
      oprot.writeI64(struct.volume);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(HIGH_FIELD_DESC);
      oprot.writeDouble(struct.high);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LOW_FIELD_DESC);
      oprot.writeDouble(struct.low);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(AVERAGE_FIELD_DESC);
      oprot.writeDouble(struct.average);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RANGE_FIELD_DESC);
      oprot.writeDouble(struct.range);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TIME_FIELD_DESC);
      oprot.writeI64(struct.time);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PointTupleSchemeFactory implements SchemeFactory {
    public PointTupleScheme getScheme() {
      return new PointTupleScheme();
    }
  }

  private static class PointTupleScheme extends TupleScheme<Point> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Point struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeDouble(struct.price);
      oprot.writeDouble(struct.close);
      oprot.writeDouble(struct.open);
      oprot.writeI64(struct.volume);
      oprot.writeDouble(struct.high);
      oprot.writeDouble(struct.low);
      oprot.writeDouble(struct.average);
      oprot.writeDouble(struct.range);
      oprot.writeI64(struct.time);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Point struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.price = iprot.readDouble();
      struct.set_price_isSet(true);
      struct.close = iprot.readDouble();
      struct.set_close_isSet(true);
      struct.open = iprot.readDouble();
      struct.set_open_isSet(true);
      struct.volume = iprot.readI64();
      struct.set_volume_isSet(true);
      struct.high = iprot.readDouble();
      struct.set_high_isSet(true);
      struct.low = iprot.readDouble();
      struct.set_low_isSet(true);
      struct.average = iprot.readDouble();
      struct.set_average_isSet(true);
      struct.range = iprot.readDouble();
      struct.set_range_isSet(true);
      struct.time = iprot.readI64();
      struct.set_time_isSet(true);
    }
  }

}
