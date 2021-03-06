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
 * 宏观因子数据
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-08-21")
public class Macro implements org.apache.thrift.TBase<Macro, Macro._Fields>, java.io.Serializable, Cloneable, Comparable<Macro>, android.os.Parcelable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Macro");

  private static final org.apache.thrift.protocol.TField EXPONENT1_FIELD_DESC = new org.apache.thrift.protocol.TField("exponent1", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("price", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField EXPONENT_NAME1_FIELD_DESC = new org.apache.thrift.protocol.TField("exponentName1", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField EXPONENT_NAME2_FIELD_DESC = new org.apache.thrift.protocol.TField("exponentName2", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField EXPONENT2_FIELD_DESC = new org.apache.thrift.protocol.TField("exponent2", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField DATE_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("dateList", org.apache.thrift.protocol.TType.LIST, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MacroStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MacroTupleSchemeFactory());
  }

  private List<Double> exponent1; // required
  private List<Double> price; // required
  private String exponentName1; // required
  private String exponentName2; // required
  private List<Double> exponent2; // required
  private List<String> dateList; // required

  @Override
  public void writeToParcel(android.os.Parcel out, int flags) {
    out.writeList(exponent1);
    out.writeList(price);
    out.writeString(exponentName1);
    out.writeString(exponentName2);
    out.writeList(exponent2);
    out.writeList(dateList);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public Macro(android.os.Parcel in) {
    this.exponent1 = new ArrayList<Double>();
    in.readList(this.exponent1, Macro.class.getClassLoader());
    this.price = new ArrayList<Double>();
    in.readList(this.price, Macro.class.getClassLoader());
    this.exponentName1= in.readString();
    this.exponentName2= in.readString();
    this.exponent2 = new ArrayList<Double>();
    in.readList(this.exponent2, Macro.class.getClassLoader());
    this.dateList = new ArrayList<String>();
    in.readList(this.dateList, Macro.class.getClassLoader());
  }

  public static final android.os.Parcelable.Creator<Macro> CREATOR = new android.os.Parcelable.Creator<Macro>() {
    @Override
    public Macro[] newArray(int size) {
      return new Macro[size];
    }

    @Override
    public Macro createFromParcel(android.os.Parcel in) {
      return new Macro(in);
    }
  };

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXPONENT1((short)1, "exponent1"),
    PRICE((short)2, "price"),
    EXPONENT_NAME1((short)3, "exponentName1"),
    EXPONENT_NAME2((short)4, "exponentName2"),
    EXPONENT2((short)5, "exponent2"),
    DATE_LIST((short)6, "dateList");

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
        case 1: // EXPONENT1
          return EXPONENT1;
        case 2: // PRICE
          return PRICE;
        case 3: // EXPONENT_NAME1
          return EXPONENT_NAME1;
        case 4: // EXPONENT_NAME2
          return EXPONENT_NAME2;
        case 5: // EXPONENT2
          return EXPONENT2;
        case 6: // DATE_LIST
          return DATE_LIST;
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
    tmpMap.put(_Fields.EXPONENT1, new org.apache.thrift.meta_data.FieldMetaData("exponent1", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.PRICE, new org.apache.thrift.meta_data.FieldMetaData("price", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.EXPONENT_NAME1, new org.apache.thrift.meta_data.FieldMetaData("exponentName1", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXPONENT_NAME2, new org.apache.thrift.meta_data.FieldMetaData("exponentName2", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXPONENT2, new org.apache.thrift.meta_data.FieldMetaData("exponent2", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.DATE_LIST, new org.apache.thrift.meta_data.FieldMetaData("dateList", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Macro.class, metaDataMap);
  }

  public Macro() {
  }

  public Macro(
    List<Double> exponent1,
    List<Double> price,
    String exponentName1,
    String exponentName2,
    List<Double> exponent2,
    List<String> dateList)
  {
    this();
    this.exponent1 = exponent1;
    this.price = price;
    this.exponentName1 = exponentName1;
    this.exponentName2 = exponentName2;
    this.exponent2 = exponent2;
    this.dateList = dateList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Macro(Macro other) {
    if (other.is_set_exponent1()) {
      List<Double> __this__exponent1 = new ArrayList<Double>(other.exponent1);
      this.exponent1 = __this__exponent1;
    }
    if (other.is_set_price()) {
      List<Double> __this__price = new ArrayList<Double>(other.price);
      this.price = __this__price;
    }
    if (other.is_set_exponentName1()) {
      this.exponentName1 = other.exponentName1;
    }
    if (other.is_set_exponentName2()) {
      this.exponentName2 = other.exponentName2;
    }
    if (other.is_set_exponent2()) {
      List<Double> __this__exponent2 = new ArrayList<Double>(other.exponent2);
      this.exponent2 = __this__exponent2;
    }
    if (other.is_set_dateList()) {
      List<String> __this__dateList = new ArrayList<String>(other.dateList);
      this.dateList = __this__dateList;
    }
  }

  public Macro deepCopy() {
    return new Macro(this);
  }

  public void clear() {
    if (this.exponent1 != null) {
      this.exponent1.clear();
    }
    if (this.price != null) {
      this.price.clear();
    }
    this.exponentName1 = null;
    this.exponentName2 = null;
    if (this.exponent2 != null) {
      this.exponent2.clear();
    }
    if (this.dateList != null) {
      this.dateList.clear();
    }
  }

  public int get_exponent1_size() {
    return (this.exponent1 == null) ? 0 : this.exponent1.size();
  }

  public java.util.Iterator<Double> get_exponent1_iterator() {
    return (this.exponent1 == null) ? null : this.exponent1.iterator();
  }

  public void add_to_exponent1(double elem) {
    if (this.exponent1 == null) {
      this.exponent1 = new ArrayList<Double>();
    }
    this.exponent1.add(elem);
  }

  public List<Double> get_exponent1() {
    return this.exponent1;
  }

  public void set_exponent1(List<Double> exponent1) {
    this.exponent1 = exponent1;
  }

  public void unset_exponent1() {
    this.exponent1 = null;
  }

  /** Returns true if field exponent1 is set (has been assigned a value) and false otherwise */
  public boolean is_set_exponent1() {
    return this.exponent1 != null;
  }

  public void set_exponent1_isSet(boolean value) {
    if (!value) {
      this.exponent1 = null;
    }
  }

  public int get_price_size() {
    return (this.price == null) ? 0 : this.price.size();
  }

  public java.util.Iterator<Double> get_price_iterator() {
    return (this.price == null) ? null : this.price.iterator();
  }

  public void add_to_price(double elem) {
    if (this.price == null) {
      this.price = new ArrayList<Double>();
    }
    this.price.add(elem);
  }

  public List<Double> get_price() {
    return this.price;
  }

  public void set_price(List<Double> price) {
    this.price = price;
  }

  public void unset_price() {
    this.price = null;
  }

  /** Returns true if field price is set (has been assigned a value) and false otherwise */
  public boolean is_set_price() {
    return this.price != null;
  }

  public void set_price_isSet(boolean value) {
    if (!value) {
      this.price = null;
    }
  }

  public String get_exponentName1() {
    return this.exponentName1;
  }

  public void set_exponentName1(String exponentName1) {
    this.exponentName1 = exponentName1;
  }

  public void unset_exponentName1() {
    this.exponentName1 = null;
  }

  /** Returns true if field exponentName1 is set (has been assigned a value) and false otherwise */
  public boolean is_set_exponentName1() {
    return this.exponentName1 != null;
  }

  public void set_exponentName1_isSet(boolean value) {
    if (!value) {
      this.exponentName1 = null;
    }
  }

  public String get_exponentName2() {
    return this.exponentName2;
  }

  public void set_exponentName2(String exponentName2) {
    this.exponentName2 = exponentName2;
  }

  public void unset_exponentName2() {
    this.exponentName2 = null;
  }

  /** Returns true if field exponentName2 is set (has been assigned a value) and false otherwise */
  public boolean is_set_exponentName2() {
    return this.exponentName2 != null;
  }

  public void set_exponentName2_isSet(boolean value) {
    if (!value) {
      this.exponentName2 = null;
    }
  }

  public int get_exponent2_size() {
    return (this.exponent2 == null) ? 0 : this.exponent2.size();
  }

  public java.util.Iterator<Double> get_exponent2_iterator() {
    return (this.exponent2 == null) ? null : this.exponent2.iterator();
  }

  public void add_to_exponent2(double elem) {
    if (this.exponent2 == null) {
      this.exponent2 = new ArrayList<Double>();
    }
    this.exponent2.add(elem);
  }

  public List<Double> get_exponent2() {
    return this.exponent2;
  }

  public void set_exponent2(List<Double> exponent2) {
    this.exponent2 = exponent2;
  }

  public void unset_exponent2() {
    this.exponent2 = null;
  }

  /** Returns true if field exponent2 is set (has been assigned a value) and false otherwise */
  public boolean is_set_exponent2() {
    return this.exponent2 != null;
  }

  public void set_exponent2_isSet(boolean value) {
    if (!value) {
      this.exponent2 = null;
    }
  }

  public int get_dateList_size() {
    return (this.dateList == null) ? 0 : this.dateList.size();
  }

  public java.util.Iterator<String> get_dateList_iterator() {
    return (this.dateList == null) ? null : this.dateList.iterator();
  }

  public void add_to_dateList(String elem) {
    if (this.dateList == null) {
      this.dateList = new ArrayList<String>();
    }
    this.dateList.add(elem);
  }

  public List<String> get_dateList() {
    return this.dateList;
  }

  public void set_dateList(List<String> dateList) {
    this.dateList = dateList;
  }

  public void unset_dateList() {
    this.dateList = null;
  }

  /** Returns true if field dateList is set (has been assigned a value) and false otherwise */
  public boolean is_set_dateList() {
    return this.dateList != null;
  }

  public void set_dateList_isSet(boolean value) {
    if (!value) {
      this.dateList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXPONENT1:
      if (value == null) {
        unset_exponent1();
      } else {
        set_exponent1((List<Double>)value);
      }
      break;

    case PRICE:
      if (value == null) {
        unset_price();
      } else {
        set_price((List<Double>)value);
      }
      break;

    case EXPONENT_NAME1:
      if (value == null) {
        unset_exponentName1();
      } else {
        set_exponentName1((String)value);
      }
      break;

    case EXPONENT_NAME2:
      if (value == null) {
        unset_exponentName2();
      } else {
        set_exponentName2((String)value);
      }
      break;

    case EXPONENT2:
      if (value == null) {
        unset_exponent2();
      } else {
        set_exponent2((List<Double>)value);
      }
      break;

    case DATE_LIST:
      if (value == null) {
        unset_dateList();
      } else {
        set_dateList((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXPONENT1:
      return get_exponent1();

    case PRICE:
      return get_price();

    case EXPONENT_NAME1:
      return get_exponentName1();

    case EXPONENT_NAME2:
      return get_exponentName2();

    case EXPONENT2:
      return get_exponent2();

    case DATE_LIST:
      return get_dateList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXPONENT1:
      return is_set_exponent1();
    case PRICE:
      return is_set_price();
    case EXPONENT_NAME1:
      return is_set_exponentName1();
    case EXPONENT_NAME2:
      return is_set_exponentName2();
    case EXPONENT2:
      return is_set_exponent2();
    case DATE_LIST:
      return is_set_dateList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Macro)
      return this.equals((Macro)that);
    return false;
  }

  public boolean equals(Macro that) {
    if (that == null)
      return false;

    boolean this_present_exponent1 = true && this.is_set_exponent1();
    boolean that_present_exponent1 = true && that.is_set_exponent1();
    if (this_present_exponent1 || that_present_exponent1) {
      if (!(this_present_exponent1 && that_present_exponent1))
        return false;
      if (!this.exponent1.equals(that.exponent1))
        return false;
    }

    boolean this_present_price = true && this.is_set_price();
    boolean that_present_price = true && that.is_set_price();
    if (this_present_price || that_present_price) {
      if (!(this_present_price && that_present_price))
        return false;
      if (!this.price.equals(that.price))
        return false;
    }

    boolean this_present_exponentName1 = true && this.is_set_exponentName1();
    boolean that_present_exponentName1 = true && that.is_set_exponentName1();
    if (this_present_exponentName1 || that_present_exponentName1) {
      if (!(this_present_exponentName1 && that_present_exponentName1))
        return false;
      if (!this.exponentName1.equals(that.exponentName1))
        return false;
    }

    boolean this_present_exponentName2 = true && this.is_set_exponentName2();
    boolean that_present_exponentName2 = true && that.is_set_exponentName2();
    if (this_present_exponentName2 || that_present_exponentName2) {
      if (!(this_present_exponentName2 && that_present_exponentName2))
        return false;
      if (!this.exponentName2.equals(that.exponentName2))
        return false;
    }

    boolean this_present_exponent2 = true && this.is_set_exponent2();
    boolean that_present_exponent2 = true && that.is_set_exponent2();
    if (this_present_exponent2 || that_present_exponent2) {
      if (!(this_present_exponent2 && that_present_exponent2))
        return false;
      if (!this.exponent2.equals(that.exponent2))
        return false;
    }

    boolean this_present_dateList = true && this.is_set_dateList();
    boolean that_present_dateList = true && that.is_set_dateList();
    if (this_present_dateList || that_present_dateList) {
      if (!(this_present_dateList && that_present_dateList))
        return false;
      if (!this.dateList.equals(that.dateList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_exponent1 = true && (is_set_exponent1());
    list.add(present_exponent1);
    if (present_exponent1)
      list.add(exponent1);

    boolean present_price = true && (is_set_price());
    list.add(present_price);
    if (present_price)
      list.add(price);

    boolean present_exponentName1 = true && (is_set_exponentName1());
    list.add(present_exponentName1);
    if (present_exponentName1)
      list.add(exponentName1);

    boolean present_exponentName2 = true && (is_set_exponentName2());
    list.add(present_exponentName2);
    if (present_exponentName2)
      list.add(exponentName2);

    boolean present_exponent2 = true && (is_set_exponent2());
    list.add(present_exponent2);
    if (present_exponent2)
      list.add(exponent2);

    boolean present_dateList = true && (is_set_dateList());
    list.add(present_dateList);
    if (present_dateList)
      list.add(dateList);

    return list.hashCode();
  }

  @Override
  public int compareTo(Macro other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_exponent1()).compareTo(other.is_set_exponent1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_exponent1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exponent1, other.exponent1);
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
    lastComparison = Boolean.valueOf(is_set_exponentName1()).compareTo(other.is_set_exponentName1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_exponentName1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exponentName1, other.exponentName1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_exponentName2()).compareTo(other.is_set_exponentName2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_exponentName2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exponentName2, other.exponentName2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_exponent2()).compareTo(other.is_set_exponent2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_exponent2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exponent2, other.exponent2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_dateList()).compareTo(other.is_set_dateList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_dateList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dateList, other.dateList);
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
    StringBuilder sb = new StringBuilder("Macro(");
    boolean first = true;

    sb.append("exponent1:");
    if (this.exponent1 == null) {
      sb.append("null");
    } else {
      sb.append(this.exponent1);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("price:");
    if (this.price == null) {
      sb.append("null");
    } else {
      sb.append(this.price);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("exponentName1:");
    if (this.exponentName1 == null) {
      sb.append("null");
    } else {
      sb.append(this.exponentName1);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("exponentName2:");
    if (this.exponentName2 == null) {
      sb.append("null");
    } else {
      sb.append(this.exponentName2);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("exponent2:");
    if (this.exponent2 == null) {
      sb.append("null");
    } else {
      sb.append(this.exponent2);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dateList:");
    if (this.dateList == null) {
      sb.append("null");
    } else {
      sb.append(this.dateList);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_exponent1()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'exponent1' is unset! Struct:" + toString());
    }

    if (!is_set_price()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'price' is unset! Struct:" + toString());
    }

    if (!is_set_exponentName1()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'exponentName1' is unset! Struct:" + toString());
    }

    if (!is_set_exponentName2()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'exponentName2' is unset! Struct:" + toString());
    }

    if (!is_set_exponent2()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'exponent2' is unset! Struct:" + toString());
    }

    if (!is_set_dateList()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dateList' is unset! Struct:" + toString());
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

  private static class MacroStandardSchemeFactory implements SchemeFactory {
    public MacroStandardScheme getScheme() {
      return new MacroStandardScheme();
    }
  }

  private static class MacroStandardScheme extends StandardScheme<Macro> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Macro struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXPONENT1
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list184 = iprot.readListBegin();
                if (struct.exponent1 == null) {
                  struct.exponent1 = new ArrayList<Double>(_list184.size);
                }
                double _elem185 = (double)0;
                for (int _i186 = 0; _i186 < _list184.size; ++_i186)
                {
                  _elem185 = iprot.readDouble();
                  struct.exponent1.add(_elem185);
                }
                iprot.readListEnd();
              }
              struct.set_exponent1_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list187 = iprot.readListBegin();
                if (struct.price == null) {
                  struct.price = new ArrayList<Double>(_list187.size);
                }
                double _elem188 = (double)0;
                for (int _i189 = 0; _i189 < _list187.size; ++_i189)
                {
                  _elem188 = iprot.readDouble();
                  struct.price.add(_elem188);
                }
                iprot.readListEnd();
              }
              struct.set_price_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXPONENT_NAME1
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.exponentName1 = iprot.readString();
              struct.set_exponentName1_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXPONENT_NAME2
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.exponentName2 = iprot.readString();
              struct.set_exponentName2_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // EXPONENT2
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list190 = iprot.readListBegin();
                if (struct.exponent2 == null) {
                  struct.exponent2 = new ArrayList<Double>(_list190.size);
                }
                double _elem191 = (double)0;
                for (int _i192 = 0; _i192 < _list190.size; ++_i192)
                {
                  _elem191 = iprot.readDouble();
                  struct.exponent2.add(_elem191);
                }
                iprot.readListEnd();
              }
              struct.set_exponent2_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DATE_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list193 = iprot.readListBegin();
                if (struct.dateList == null) {
                  struct.dateList = new ArrayList<String>(_list193.size);
                }
                String _elem194 = null;
                for (int _i195 = 0; _i195 < _list193.size; ++_i195)
                {
                  _elem194 = iprot.readString();
                  struct.dateList.add(_elem194);
                }
                iprot.readListEnd();
              }
              struct.set_dateList_isSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Macro struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.exponent1 != null) {
        oprot.writeFieldBegin(EXPONENT1_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, struct.exponent1.size()));
          for (double _iter196 : struct.exponent1)
          {
            oprot.writeDouble(_iter196);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.price != null) {
        oprot.writeFieldBegin(PRICE_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, struct.price.size()));
          for (double _iter197 : struct.price)
          {
            oprot.writeDouble(_iter197);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.exponentName1 != null) {
        oprot.writeFieldBegin(EXPONENT_NAME1_FIELD_DESC);
        oprot.writeString(struct.exponentName1);
        oprot.writeFieldEnd();
      }
      if (struct.exponentName2 != null) {
        oprot.writeFieldBegin(EXPONENT_NAME2_FIELD_DESC);
        oprot.writeString(struct.exponentName2);
        oprot.writeFieldEnd();
      }
      if (struct.exponent2 != null) {
        oprot.writeFieldBegin(EXPONENT2_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, struct.exponent2.size()));
          for (double _iter198 : struct.exponent2)
          {
            oprot.writeDouble(_iter198);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.dateList != null) {
        oprot.writeFieldBegin(DATE_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.dateList.size()));
          for (String _iter199 : struct.dateList)
          {
            oprot.writeString(_iter199);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MacroTupleSchemeFactory implements SchemeFactory {
    public MacroTupleScheme getScheme() {
      return new MacroTupleScheme();
    }
  }

  private static class MacroTupleScheme extends TupleScheme<Macro> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Macro struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.exponent1.size());
        for (double _iter200 : struct.exponent1)
        {
          oprot.writeDouble(_iter200);
        }
      }
      {
        oprot.writeI32(struct.price.size());
        for (double _iter201 : struct.price)
        {
          oprot.writeDouble(_iter201);
        }
      }
      oprot.writeString(struct.exponentName1);
      oprot.writeString(struct.exponentName2);
      {
        oprot.writeI32(struct.exponent2.size());
        for (double _iter202 : struct.exponent2)
        {
          oprot.writeDouble(_iter202);
        }
      }
      {
        oprot.writeI32(struct.dateList.size());
        for (String _iter203 : struct.dateList)
        {
          oprot.writeString(_iter203);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Macro struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list204 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
        if (struct.exponent1 == null) {
          struct.exponent1 = new ArrayList<Double>(_list204.size);
        }
        double _elem205 = (double)0;
        for (int _i206 = 0; _i206 < _list204.size; ++_i206)
        {
          _elem205 = iprot.readDouble();
          struct.exponent1.add(_elem205);
        }
      }
      struct.set_exponent1_isSet(true);
      {
        org.apache.thrift.protocol.TList _list207 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
        if (struct.price == null) {
          struct.price = new ArrayList<Double>(_list207.size);
        }
        double _elem208 = (double)0;
        for (int _i209 = 0; _i209 < _list207.size; ++_i209)
        {
          _elem208 = iprot.readDouble();
          struct.price.add(_elem208);
        }
      }
      struct.set_price_isSet(true);
      struct.exponentName1 = iprot.readString();
      struct.set_exponentName1_isSet(true);
      struct.exponentName2 = iprot.readString();
      struct.set_exponentName2_isSet(true);
      {
        org.apache.thrift.protocol.TList _list210 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
        if (struct.exponent2 == null) {
          struct.exponent2 = new ArrayList<Double>(_list210.size);
        }
        double _elem211 = (double)0;
        for (int _i212 = 0; _i212 < _list210.size; ++_i212)
        {
          _elem211 = iprot.readDouble();
          struct.exponent2.add(_elem211);
        }
      }
      struct.set_exponent2_isSet(true);
      {
        org.apache.thrift.protocol.TList _list213 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        if (struct.dateList == null) {
          struct.dateList = new ArrayList<String>(_list213.size);
        }
        String _elem214 = null;
        for (int _i215 = 0; _i215 < _list213.size; ++_i215)
        {
          _elem214 = iprot.readString();
          struct.dateList.add(_elem214);
        }
      }
      struct.set_dateList_isSet(true);
    }
  }

}

