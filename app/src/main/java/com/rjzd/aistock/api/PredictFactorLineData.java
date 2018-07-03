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
 * 股票预测因子详情
 *  
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-08-21")
public class PredictFactorLineData implements org.apache.thrift.TBase<PredictFactorLineData, PredictFactorLineData._Fields>, java.io.Serializable, Cloneable, Comparable<PredictFactorLineData>, android.os.Parcelable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PredictFactorLineData");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PERIODS_FIELD_DESC = new org.apache.thrift.protocol.TField("periods", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField ELEMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("elements", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField LABEL_MAP_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("labelMapValues", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("msg", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PredictFactorLineDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PredictFactorLineDataTupleSchemeFactory());
  }

  private StatusCode status; // required
  private List<String> periods; // required
  private List<String> elements; // required
  private List<List<Double>> labelMapValues; // required
  private String msg; // required

  @Override
  public void writeToParcel(android.os.Parcel out, int flags) {
    out.writeInt(status.getValue());
    out.writeList(periods);
    out.writeList(elements);
    out.writeList(labelMapValues);
    out.writeString(msg);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public PredictFactorLineData(android.os.Parcel in) {
    this.status = StatusCode.findByValue(in.readInt());
    this.periods = new ArrayList<String>();
    in.readList(this.periods, PredictFactorLineData.class.getClassLoader());
    this.elements = new ArrayList<String>();
    in.readList(this.elements, PredictFactorLineData.class.getClassLoader());
    this.labelMapValues = new ArrayList<List<Double>>();
    in.readList(this.labelMapValues, PredictFactorLineData.class.getClassLoader());
    this.msg= in.readString();
  }

  public static final android.os.Parcelable.Creator<PredictFactorLineData> CREATOR = new android.os.Parcelable.Creator<PredictFactorLineData>() {
    @Override
    public PredictFactorLineData[] newArray(int size) {
      return new PredictFactorLineData[size];
    }

    @Override
    public PredictFactorLineData createFromParcel(android.os.Parcel in) {
      return new PredictFactorLineData(in);
    }
  };

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see StatusCode
     */
    STATUS((short)1, "status"),
    PERIODS((short)3, "periods"),
    ELEMENTS((short)4, "elements"),
    LABEL_MAP_VALUES((short)5, "labelMapValues"),
    MSG((short)6, "msg");

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
        case 1: // STATUS
          return STATUS;
        case 3: // PERIODS
          return PERIODS;
        case 4: // ELEMENTS
          return ELEMENTS;
        case 5: // LABEL_MAP_VALUES
          return LABEL_MAP_VALUES;
        case 6: // MSG
          return MSG;
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
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, StatusCode.class)));
    tmpMap.put(_Fields.PERIODS, new org.apache.thrift.meta_data.FieldMetaData("periods", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.ELEMENTS, new org.apache.thrift.meta_data.FieldMetaData("elements", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.LABEL_MAP_VALUES, new org.apache.thrift.meta_data.FieldMetaData("labelMapValues", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)))));
    tmpMap.put(_Fields.MSG, new org.apache.thrift.meta_data.FieldMetaData("msg", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PredictFactorLineData.class, metaDataMap);
  }

  public PredictFactorLineData() {
  }

  public PredictFactorLineData(
    StatusCode status,
    List<String> periods,
    List<String> elements,
    List<List<Double>> labelMapValues,
    String msg)
  {
    this();
    this.status = status;
    this.periods = periods;
    this.elements = elements;
    this.labelMapValues = labelMapValues;
    this.msg = msg;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PredictFactorLineData(PredictFactorLineData other) {
    if (other.is_set_status()) {
      this.status = other.status;
    }
    if (other.is_set_periods()) {
      List<String> __this__periods = new ArrayList<String>(other.periods);
      this.periods = __this__periods;
    }
    if (other.is_set_elements()) {
      List<String> __this__elements = new ArrayList<String>(other.elements);
      this.elements = __this__elements;
    }
    if (other.is_set_labelMapValues()) {
      List<List<Double>> __this__labelMapValues = new ArrayList<List<Double>>(other.labelMapValues.size());
      for (List<Double> other_element : other.labelMapValues) {
        List<Double> __this__labelMapValues_copy = new ArrayList<Double>(other_element);
        __this__labelMapValues.add(__this__labelMapValues_copy);
      }
      this.labelMapValues = __this__labelMapValues;
    }
    if (other.is_set_msg()) {
      this.msg = other.msg;
    }
  }

  public PredictFactorLineData deepCopy() {
    return new PredictFactorLineData(this);
  }

  public void clear() {
    this.status = null;
    if (this.periods != null) {
      this.periods.clear();
    }
    if (this.elements != null) {
      this.elements.clear();
    }
    if (this.labelMapValues != null) {
      this.labelMapValues.clear();
    }
    this.msg = null;
  }

  /**
   * 
   * @see StatusCode
   */
  public StatusCode get_status() {
    return this.status;
  }

  /**
   * 
   * @see StatusCode
   */
  public void set_status(StatusCode status) {
    this.status = status;
  }

  public void unset_status() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean is_set_status() {
    return this.status != null;
  }

  public void set_status_isSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public int get_periods_size() {
    return (this.periods == null) ? 0 : this.periods.size();
  }

  public java.util.Iterator<String> get_periods_iterator() {
    return (this.periods == null) ? null : this.periods.iterator();
  }

  public void add_to_periods(String elem) {
    if (this.periods == null) {
      this.periods = new ArrayList<String>();
    }
    this.periods.add(elem);
  }

  public List<String> get_periods() {
    return this.periods;
  }

  public void set_periods(List<String> periods) {
    this.periods = periods;
  }

  public void unset_periods() {
    this.periods = null;
  }

  /** Returns true if field periods is set (has been assigned a value) and false otherwise */
  public boolean is_set_periods() {
    return this.periods != null;
  }

  public void set_periods_isSet(boolean value) {
    if (!value) {
      this.periods = null;
    }
  }

  public int get_elements_size() {
    return (this.elements == null) ? 0 : this.elements.size();
  }

  public java.util.Iterator<String> get_elements_iterator() {
    return (this.elements == null) ? null : this.elements.iterator();
  }

  public void add_to_elements(String elem) {
    if (this.elements == null) {
      this.elements = new ArrayList<String>();
    }
    this.elements.add(elem);
  }

  public List<String> get_elements() {
    return this.elements;
  }

  public void set_elements(List<String> elements) {
    this.elements = elements;
  }

  public void unset_elements() {
    this.elements = null;
  }

  /** Returns true if field elements is set (has been assigned a value) and false otherwise */
  public boolean is_set_elements() {
    return this.elements != null;
  }

  public void set_elements_isSet(boolean value) {
    if (!value) {
      this.elements = null;
    }
  }

  public int get_labelMapValues_size() {
    return (this.labelMapValues == null) ? 0 : this.labelMapValues.size();
  }

  public java.util.Iterator<List<Double>> get_labelMapValues_iterator() {
    return (this.labelMapValues == null) ? null : this.labelMapValues.iterator();
  }

  public void add_to_labelMapValues(List<Double> elem) {
    if (this.labelMapValues == null) {
      this.labelMapValues = new ArrayList<List<Double>>();
    }
    this.labelMapValues.add(elem);
  }

  public List<List<Double>> get_labelMapValues() {
    return this.labelMapValues;
  }

  public void set_labelMapValues(List<List<Double>> labelMapValues) {
    this.labelMapValues = labelMapValues;
  }

  public void unset_labelMapValues() {
    this.labelMapValues = null;
  }

  /** Returns true if field labelMapValues is set (has been assigned a value) and false otherwise */
  public boolean is_set_labelMapValues() {
    return this.labelMapValues != null;
  }

  public void set_labelMapValues_isSet(boolean value) {
    if (!value) {
      this.labelMapValues = null;
    }
  }

  public String get_msg() {
    return this.msg;
  }

  public void set_msg(String msg) {
    this.msg = msg;
  }

  public void unset_msg() {
    this.msg = null;
  }

  /** Returns true if field msg is set (has been assigned a value) and false otherwise */
  public boolean is_set_msg() {
    return this.msg != null;
  }

  public void set_msg_isSet(boolean value) {
    if (!value) {
      this.msg = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unset_status();
      } else {
        set_status((StatusCode)value);
      }
      break;

    case PERIODS:
      if (value == null) {
        unset_periods();
      } else {
        set_periods((List<String>)value);
      }
      break;

    case ELEMENTS:
      if (value == null) {
        unset_elements();
      } else {
        set_elements((List<String>)value);
      }
      break;

    case LABEL_MAP_VALUES:
      if (value == null) {
        unset_labelMapValues();
      } else {
        set_labelMapValues((List<List<Double>>)value);
      }
      break;

    case MSG:
      if (value == null) {
        unset_msg();
      } else {
        set_msg((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return get_status();

    case PERIODS:
      return get_periods();

    case ELEMENTS:
      return get_elements();

    case LABEL_MAP_VALUES:
      return get_labelMapValues();

    case MSG:
      return get_msg();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return is_set_status();
    case PERIODS:
      return is_set_periods();
    case ELEMENTS:
      return is_set_elements();
    case LABEL_MAP_VALUES:
      return is_set_labelMapValues();
    case MSG:
      return is_set_msg();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PredictFactorLineData)
      return this.equals((PredictFactorLineData)that);
    return false;
  }

  public boolean equals(PredictFactorLineData that) {
    if (that == null)
      return false;

    boolean this_present_status = true && this.is_set_status();
    boolean that_present_status = true && that.is_set_status();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_periods = true && this.is_set_periods();
    boolean that_present_periods = true && that.is_set_periods();
    if (this_present_periods || that_present_periods) {
      if (!(this_present_periods && that_present_periods))
        return false;
      if (!this.periods.equals(that.periods))
        return false;
    }

    boolean this_present_elements = true && this.is_set_elements();
    boolean that_present_elements = true && that.is_set_elements();
    if (this_present_elements || that_present_elements) {
      if (!(this_present_elements && that_present_elements))
        return false;
      if (!this.elements.equals(that.elements))
        return false;
    }

    boolean this_present_labelMapValues = true && this.is_set_labelMapValues();
    boolean that_present_labelMapValues = true && that.is_set_labelMapValues();
    if (this_present_labelMapValues || that_present_labelMapValues) {
      if (!(this_present_labelMapValues && that_present_labelMapValues))
        return false;
      if (!this.labelMapValues.equals(that.labelMapValues))
        return false;
    }

    boolean this_present_msg = true && this.is_set_msg();
    boolean that_present_msg = true && that.is_set_msg();
    if (this_present_msg || that_present_msg) {
      if (!(this_present_msg && that_present_msg))
        return false;
      if (!this.msg.equals(that.msg))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_status = true && (is_set_status());
    list.add(present_status);
    if (present_status)
      list.add(status.getValue());

    boolean present_periods = true && (is_set_periods());
    list.add(present_periods);
    if (present_periods)
      list.add(periods);

    boolean present_elements = true && (is_set_elements());
    list.add(present_elements);
    if (present_elements)
      list.add(elements);

    boolean present_labelMapValues = true && (is_set_labelMapValues());
    list.add(present_labelMapValues);
    if (present_labelMapValues)
      list.add(labelMapValues);

    boolean present_msg = true && (is_set_msg());
    list.add(present_msg);
    if (present_msg)
      list.add(msg);

    return list.hashCode();
  }

  @Override
  public int compareTo(PredictFactorLineData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_status()).compareTo(other.is_set_status());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_status()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_periods()).compareTo(other.is_set_periods());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_periods()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.periods, other.periods);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_elements()).compareTo(other.is_set_elements());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_elements()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.elements, other.elements);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_labelMapValues()).compareTo(other.is_set_labelMapValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_labelMapValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.labelMapValues, other.labelMapValues);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_msg()).compareTo(other.is_set_msg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_msg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.msg, other.msg);
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
    StringBuilder sb = new StringBuilder("PredictFactorLineData(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("periods:");
    if (this.periods == null) {
      sb.append("null");
    } else {
      sb.append(this.periods);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("elements:");
    if (this.elements == null) {
      sb.append("null");
    } else {
      sb.append(this.elements);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("labelMapValues:");
    if (this.labelMapValues == null) {
      sb.append("null");
    } else {
      sb.append(this.labelMapValues);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("msg:");
    if (this.msg == null) {
      sb.append("null");
    } else {
      sb.append(this.msg);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_status()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' is unset! Struct:" + toString());
    }

    if (!is_set_periods()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'periods' is unset! Struct:" + toString());
    }

    if (!is_set_elements()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'elements' is unset! Struct:" + toString());
    }

    if (!is_set_labelMapValues()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'labelMapValues' is unset! Struct:" + toString());
    }

    if (!is_set_msg()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'msg' is unset! Struct:" + toString());
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

  private static class PredictFactorLineDataStandardSchemeFactory implements SchemeFactory {
    public PredictFactorLineDataStandardScheme getScheme() {
      return new PredictFactorLineDataStandardScheme();
    }
  }

  private static class PredictFactorLineDataStandardScheme extends StandardScheme<PredictFactorLineData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PredictFactorLineData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = com.rjzd.aistock.api.StatusCode.findByValue(iprot.readI32());
              struct.set_status_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PERIODS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list216 = iprot.readListBegin();
                if (struct.periods == null) {
                  struct.periods = new ArrayList<String>(_list216.size);
                }
                String _elem217 = null;
                for (int _i218 = 0; _i218 < _list216.size; ++_i218)
                {
                  _elem217 = iprot.readString();
                  struct.periods.add(_elem217);
                }
                iprot.readListEnd();
              }
              struct.set_periods_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ELEMENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list219 = iprot.readListBegin();
                if (struct.elements == null) {
                  struct.elements = new ArrayList<String>(_list219.size);
                }
                String _elem220 = null;
                for (int _i221 = 0; _i221 < _list219.size; ++_i221)
                {
                  _elem220 = iprot.readString();
                  struct.elements.add(_elem220);
                }
                iprot.readListEnd();
              }
              struct.set_elements_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LABEL_MAP_VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list222 = iprot.readListBegin();
                if (struct.labelMapValues == null) {
                  struct.labelMapValues = new ArrayList<List<Double>>(_list222.size);
                }
                List<Double> _elem223 = new ArrayList<Double>();
                for (int _i224 = 0; _i224 < _list222.size; ++_i224)
                {
                  {
                    org.apache.thrift.protocol.TList _list225 = iprot.readListBegin();
                    if (_elem223 == null) {
                      _elem223 = new ArrayList<Double>(_list225.size);
                    }
                    double _elem226 = (double)0;
                    for (int _i227 = 0; _i227 < _list225.size; ++_i227)
                    {
                      _elem226 = iprot.readDouble();
                      _elem223.add(_elem226);
                    }
                    iprot.readListEnd();
                  }
                  struct.labelMapValues.add(_elem223);
                  _elem223 = null;
                }
                iprot.readListEnd();
              }
              struct.set_labelMapValues_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.msg = iprot.readString();
              struct.set_msg_isSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PredictFactorLineData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI32(struct.status.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.periods != null) {
        oprot.writeFieldBegin(PERIODS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.periods.size()));
          for (String _iter228 : struct.periods)
          {
            oprot.writeString(_iter228);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.elements != null) {
        oprot.writeFieldBegin(ELEMENTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.elements.size()));
          for (String _iter229 : struct.elements)
          {
            oprot.writeString(_iter229);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.labelMapValues != null) {
        oprot.writeFieldBegin(LABEL_MAP_VALUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.labelMapValues.size()));
          for (List<Double> _iter230 : struct.labelMapValues)
          {
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, _iter230.size()));
              for (double _iter231 : _iter230)
              {
                oprot.writeDouble(_iter231);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.msg != null) {
        oprot.writeFieldBegin(MSG_FIELD_DESC);
        oprot.writeString(struct.msg);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PredictFactorLineDataTupleSchemeFactory implements SchemeFactory {
    public PredictFactorLineDataTupleScheme getScheme() {
      return new PredictFactorLineDataTupleScheme();
    }
  }

  private static class PredictFactorLineDataTupleScheme extends TupleScheme<PredictFactorLineData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PredictFactorLineData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.status.getValue());
      {
        oprot.writeI32(struct.periods.size());
        for (String _iter232 : struct.periods)
        {
          oprot.writeString(_iter232);
        }
      }
      {
        oprot.writeI32(struct.elements.size());
        for (String _iter233 : struct.elements)
        {
          oprot.writeString(_iter233);
        }
      }
      {
        oprot.writeI32(struct.labelMapValues.size());
        for (List<Double> _iter234 : struct.labelMapValues)
        {
          {
            oprot.writeI32(_iter234.size());
            for (double _iter235 : _iter234)
            {
              oprot.writeDouble(_iter235);
            }
          }
        }
      }
      oprot.writeString(struct.msg);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PredictFactorLineData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.status = com.rjzd.aistock.api.StatusCode.findByValue(iprot.readI32());
      struct.set_status_isSet(true);
      {
        org.apache.thrift.protocol.TList _list236 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        if (struct.periods == null) {
          struct.periods = new ArrayList<String>(_list236.size);
        }
        String _elem237 = null;
        for (int _i238 = 0; _i238 < _list236.size; ++_i238)
        {
          _elem237 = iprot.readString();
          struct.periods.add(_elem237);
        }
      }
      struct.set_periods_isSet(true);
      {
        org.apache.thrift.protocol.TList _list239 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        if (struct.elements == null) {
          struct.elements = new ArrayList<String>(_list239.size);
        }
        String _elem240 = null;
        for (int _i241 = 0; _i241 < _list239.size; ++_i241)
        {
          _elem240 = iprot.readString();
          struct.elements.add(_elem240);
        }
      }
      struct.set_elements_isSet(true);
      {
        org.apache.thrift.protocol.TList _list242 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, iprot.readI32());
        if (struct.labelMapValues == null) {
          struct.labelMapValues = new ArrayList<List<Double>>(_list242.size);
        }
        List<Double> _elem243 = new ArrayList<Double>();
        for (int _i244 = 0; _i244 < _list242.size; ++_i244)
        {
          {
            org.apache.thrift.protocol.TList _list245 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
            if (_elem243 == null) {
              _elem243 = new ArrayList<Double>(_list245.size);
            }
            double _elem246 = (double)0;
            for (int _i247 = 0; _i247 < _list245.size; ++_i247)
            {
              _elem246 = iprot.readDouble();
              _elem243.add(_elem246);
            }
          }
          struct.labelMapValues.add(_elem243);
          _elem243 = null;
        }
      }
      struct.set_labelMapValues_isSet(true);
      struct.msg = iprot.readString();
      struct.set_msg_isSet(true);
    }
  }

}

