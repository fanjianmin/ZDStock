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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-08-22")
public class DailyStockRecommendation implements org.apache.thrift.TBase<DailyStockRecommendation, DailyStockRecommendation._Fields>, java.io.Serializable, Cloneable, Comparable<DailyStockRecommendation>, android.os.Parcelable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DailyStockRecommendation");

  private static final org.apache.thrift.protocol.TField PREDICT_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("predictDate", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RECOMMEND_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("recommendList", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DailyStockRecommendationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DailyStockRecommendationTupleSchemeFactory());
  }

  private String predictDate; // required
  private List<StockRecommendation> recommendList; // required

  @Override
  public void writeToParcel(android.os.Parcel out, int flags) {
    out.writeString(predictDate);
    out.writeTypedList(recommendList);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public DailyStockRecommendation(android.os.Parcel in) {
    this.predictDate= in.readString();
    this.recommendList = new ArrayList<StockRecommendation>();
    in.readTypedList(this.recommendList, StockRecommendation.CREATOR);
  }

  public static final android.os.Parcelable.Creator<DailyStockRecommendation> CREATOR = new android.os.Parcelable.Creator<DailyStockRecommendation>() {
    @Override
    public DailyStockRecommendation[] newArray(int size) {
      return new DailyStockRecommendation[size];
    }

    @Override
    public DailyStockRecommendation createFromParcel(android.os.Parcel in) {
      return new DailyStockRecommendation(in);
    }
  };

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PREDICT_DATE((short)1, "predictDate"),
    RECOMMEND_LIST((short)2, "recommendList");

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
        case 1: // PREDICT_DATE
          return PREDICT_DATE;
        case 2: // RECOMMEND_LIST
          return RECOMMEND_LIST;
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
    tmpMap.put(_Fields.PREDICT_DATE, new org.apache.thrift.meta_data.FieldMetaData("predictDate", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RECOMMEND_LIST, new org.apache.thrift.meta_data.FieldMetaData("recommendList", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StockRecommendation.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DailyStockRecommendation.class, metaDataMap);
  }

  public DailyStockRecommendation() {
  }

  public DailyStockRecommendation(
    String predictDate,
    List<StockRecommendation> recommendList)
  {
    this();
    this.predictDate = predictDate;
    this.recommendList = recommendList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DailyStockRecommendation(DailyStockRecommendation other) {
    if (other.is_set_predictDate()) {
      this.predictDate = other.predictDate;
    }
    if (other.is_set_recommendList()) {
      List<StockRecommendation> __this__recommendList = new ArrayList<StockRecommendation>(other.recommendList.size());
      for (StockRecommendation other_element : other.recommendList) {
        __this__recommendList.add(new StockRecommendation(other_element));
      }
      this.recommendList = __this__recommendList;
    }
  }

  public DailyStockRecommendation deepCopy() {
    return new DailyStockRecommendation(this);
  }

  public void clear() {
    this.predictDate = null;
    if (this.recommendList != null) {
      this.recommendList.clear();
    }
  }

  public String get_predictDate() {
    return this.predictDate;
  }

  public void set_predictDate(String predictDate) {
    this.predictDate = predictDate;
  }

  public void unset_predictDate() {
    this.predictDate = null;
  }

  /** Returns true if field predictDate is set (has been assigned a value) and false otherwise */
  public boolean is_set_predictDate() {
    return this.predictDate != null;
  }

  public void set_predictDate_isSet(boolean value) {
    if (!value) {
      this.predictDate = null;
    }
  }

  public int get_recommendList_size() {
    return (this.recommendList == null) ? 0 : this.recommendList.size();
  }

  public java.util.Iterator<StockRecommendation> get_recommendList_iterator() {
    return (this.recommendList == null) ? null : this.recommendList.iterator();
  }

  public void add_to_recommendList(StockRecommendation elem) {
    if (this.recommendList == null) {
      this.recommendList = new ArrayList<StockRecommendation>();
    }
    this.recommendList.add(elem);
  }

  public List<StockRecommendation> get_recommendList() {
    return this.recommendList;
  }

  public void set_recommendList(List<StockRecommendation> recommendList) {
    this.recommendList = recommendList;
  }

  public void unset_recommendList() {
    this.recommendList = null;
  }

  /** Returns true if field recommendList is set (has been assigned a value) and false otherwise */
  public boolean is_set_recommendList() {
    return this.recommendList != null;
  }

  public void set_recommendList_isSet(boolean value) {
    if (!value) {
      this.recommendList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PREDICT_DATE:
      if (value == null) {
        unset_predictDate();
      } else {
        set_predictDate((String)value);
      }
      break;

    case RECOMMEND_LIST:
      if (value == null) {
        unset_recommendList();
      } else {
        set_recommendList((List<StockRecommendation>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PREDICT_DATE:
      return get_predictDate();

    case RECOMMEND_LIST:
      return get_recommendList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PREDICT_DATE:
      return is_set_predictDate();
    case RECOMMEND_LIST:
      return is_set_recommendList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DailyStockRecommendation)
      return this.equals((DailyStockRecommendation)that);
    return false;
  }

  public boolean equals(DailyStockRecommendation that) {
    if (that == null)
      return false;

    boolean this_present_predictDate = true && this.is_set_predictDate();
    boolean that_present_predictDate = true && that.is_set_predictDate();
    if (this_present_predictDate || that_present_predictDate) {
      if (!(this_present_predictDate && that_present_predictDate))
        return false;
      if (!this.predictDate.equals(that.predictDate))
        return false;
    }

    boolean this_present_recommendList = true && this.is_set_recommendList();
    boolean that_present_recommendList = true && that.is_set_recommendList();
    if (this_present_recommendList || that_present_recommendList) {
      if (!(this_present_recommendList && that_present_recommendList))
        return false;
      if (!this.recommendList.equals(that.recommendList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_predictDate = true && (is_set_predictDate());
    list.add(present_predictDate);
    if (present_predictDate)
      list.add(predictDate);

    boolean present_recommendList = true && (is_set_recommendList());
    list.add(present_recommendList);
    if (present_recommendList)
      list.add(recommendList);

    return list.hashCode();
  }

  @Override
  public int compareTo(DailyStockRecommendation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_predictDate()).compareTo(other.is_set_predictDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_predictDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.predictDate, other.predictDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_recommendList()).compareTo(other.is_set_recommendList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_recommendList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recommendList, other.recommendList);
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
    StringBuilder sb = new StringBuilder("DailyStockRecommendation(");
    boolean first = true;

    sb.append("predictDate:");
    if (this.predictDate == null) {
      sb.append("null");
    } else {
      sb.append(this.predictDate);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("recommendList:");
    if (this.recommendList == null) {
      sb.append("null");
    } else {
      sb.append(this.recommendList);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_predictDate()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'predictDate' is unset! Struct:" + toString());
    }

    if (!is_set_recommendList()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'recommendList' is unset! Struct:" + toString());
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

  private static class DailyStockRecommendationStandardSchemeFactory implements SchemeFactory {
    public DailyStockRecommendationStandardScheme getScheme() {
      return new DailyStockRecommendationStandardScheme();
    }
  }

  private static class DailyStockRecommendationStandardScheme extends StandardScheme<DailyStockRecommendation> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DailyStockRecommendation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PREDICT_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.predictDate = iprot.readString();
              struct.set_predictDate_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RECOMMEND_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list538 = iprot.readListBegin();
                if (struct.recommendList == null) {
                  struct.recommendList = new ArrayList<StockRecommendation>(_list538.size);
                }
                StockRecommendation _elem539 = new StockRecommendation();
                for (int _i540 = 0; _i540 < _list538.size; ++_i540)
                {
                  if (_elem539 == null) {
                    _elem539 = new StockRecommendation();
                  }
                  _elem539.read(iprot);
                  struct.recommendList.add(_elem539);
                  _elem539 = null;
                }
                iprot.readListEnd();
              }
              struct.set_recommendList_isSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DailyStockRecommendation struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.predictDate != null) {
        oprot.writeFieldBegin(PREDICT_DATE_FIELD_DESC);
        oprot.writeString(struct.predictDate);
        oprot.writeFieldEnd();
      }
      if (struct.recommendList != null) {
        oprot.writeFieldBegin(RECOMMEND_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.recommendList.size()));
          for (StockRecommendation _iter541 : struct.recommendList)
          {
            _iter541.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DailyStockRecommendationTupleSchemeFactory implements SchemeFactory {
    public DailyStockRecommendationTupleScheme getScheme() {
      return new DailyStockRecommendationTupleScheme();
    }
  }

  private static class DailyStockRecommendationTupleScheme extends TupleScheme<DailyStockRecommendation> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DailyStockRecommendation struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.predictDate);
      {
        oprot.writeI32(struct.recommendList.size());
        for (StockRecommendation _iter542 : struct.recommendList)
        {
          _iter542.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DailyStockRecommendation struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.predictDate = iprot.readString();
      struct.set_predictDate_isSet(true);
      {
        org.apache.thrift.protocol.TList _list543 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        if (struct.recommendList == null) {
          struct.recommendList = new ArrayList<StockRecommendation>(_list543.size);
        }
        StockRecommendation _elem544 = new StockRecommendation();
        for (int _i545 = 0; _i545 < _list543.size; ++_i545)
        {
          if (_elem544 == null) {
            _elem544 = new StockRecommendation();
          }
          _elem544.read(iprot);
          struct.recommendList.add(_elem544);
          _elem544 = null;
        }
      }
      struct.set_recommendList_isSet(true);
    }
  }

}
