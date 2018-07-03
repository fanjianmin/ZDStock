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
 * 预测走势
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-08-21")
public class PredictionTrend implements org.apache.thrift.TBase<PredictionTrend, PredictionTrend._Fields>, java.io.Serializable, Cloneable, Comparable<PredictionTrend>, android.os.Parcelable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PredictionTrend");

  private static final org.apache.thrift.protocol.TField ACTUAL_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("actualData", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PREDICT_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("predictData", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField SUMMARY_FIELD_DESC = new org.apache.thrift.protocol.TField("summary", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PredictionTrendStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PredictionTrendTupleSchemeFactory());
  }

  private PredictionLine actualData; // required
  private PredictionLine predictData; // required
  private String summary; // required

  @Override
  public void writeToParcel(android.os.Parcel out, int flags) {
    out.writeParcelable(actualData, flags);
    out.writeParcelable(predictData, flags);
    out.writeString(summary);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public PredictionTrend(android.os.Parcel in) {
    this.actualData= in.readParcelable(PredictionTrend.class.getClassLoader());
    this.predictData= in.readParcelable(PredictionTrend.class.getClassLoader());
    this.summary= in.readString();
  }

  public static final android.os.Parcelable.Creator<PredictionTrend> CREATOR = new android.os.Parcelable.Creator<PredictionTrend>() {
    @Override
    public PredictionTrend[] newArray(int size) {
      return new PredictionTrend[size];
    }

    @Override
    public PredictionTrend createFromParcel(android.os.Parcel in) {
      return new PredictionTrend(in);
    }
  };

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ACTUAL_DATA((short)1, "actualData"),
    PREDICT_DATA((short)2, "predictData"),
    SUMMARY((short)3, "summary");

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
        case 1: // ACTUAL_DATA
          return ACTUAL_DATA;
        case 2: // PREDICT_DATA
          return PREDICT_DATA;
        case 3: // SUMMARY
          return SUMMARY;
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
    tmpMap.put(_Fields.ACTUAL_DATA, new org.apache.thrift.meta_data.FieldMetaData("actualData", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PredictionLine.class)));
    tmpMap.put(_Fields.PREDICT_DATA, new org.apache.thrift.meta_data.FieldMetaData("predictData", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PredictionLine.class)));
    tmpMap.put(_Fields.SUMMARY, new org.apache.thrift.meta_data.FieldMetaData("summary", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PredictionTrend.class, metaDataMap);
  }

  public PredictionTrend() {
  }

  public PredictionTrend(
    PredictionLine actualData,
    PredictionLine predictData,
    String summary)
  {
    this();
    this.actualData = actualData;
    this.predictData = predictData;
    this.summary = summary;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PredictionTrend(PredictionTrend other) {
    if (other.is_set_actualData()) {
      this.actualData = new PredictionLine(other.actualData);
    }
    if (other.is_set_predictData()) {
      this.predictData = new PredictionLine(other.predictData);
    }
    if (other.is_set_summary()) {
      this.summary = other.summary;
    }
  }

  public PredictionTrend deepCopy() {
    return new PredictionTrend(this);
  }

  public void clear() {
    if (this.actualData != null) {
      this.actualData.clear();
    }
    if (this.predictData != null) {
      this.predictData.clear();
    }
    this.summary = null;
  }

  public PredictionLine get_actualData() {
    return this.actualData;
  }

  public void set_actualData(PredictionLine actualData) {
    this.actualData = actualData;
  }

  public void unset_actualData() {
    this.actualData = null;
  }

  /** Returns true if field actualData is set (has been assigned a value) and false otherwise */
  public boolean is_set_actualData() {
    return this.actualData != null;
  }

  public void set_actualData_isSet(boolean value) {
    if (!value) {
      this.actualData = null;
    }
  }

  public PredictionLine get_predictData() {
    return this.predictData;
  }

  public void set_predictData(PredictionLine predictData) {
    this.predictData = predictData;
  }

  public void unset_predictData() {
    this.predictData = null;
  }

  /** Returns true if field predictData is set (has been assigned a value) and false otherwise */
  public boolean is_set_predictData() {
    return this.predictData != null;
  }

  public void set_predictData_isSet(boolean value) {
    if (!value) {
      this.predictData = null;
    }
  }

  public String get_summary() {
    return this.summary;
  }

  public void set_summary(String summary) {
    this.summary = summary;
  }

  public void unset_summary() {
    this.summary = null;
  }

  /** Returns true if field summary is set (has been assigned a value) and false otherwise */
  public boolean is_set_summary() {
    return this.summary != null;
  }

  public void set_summary_isSet(boolean value) {
    if (!value) {
      this.summary = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACTUAL_DATA:
      if (value == null) {
        unset_actualData();
      } else {
        set_actualData((PredictionLine)value);
      }
      break;

    case PREDICT_DATA:
      if (value == null) {
        unset_predictData();
      } else {
        set_predictData((PredictionLine)value);
      }
      break;

    case SUMMARY:
      if (value == null) {
        unset_summary();
      } else {
        set_summary((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACTUAL_DATA:
      return get_actualData();

    case PREDICT_DATA:
      return get_predictData();

    case SUMMARY:
      return get_summary();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACTUAL_DATA:
      return is_set_actualData();
    case PREDICT_DATA:
      return is_set_predictData();
    case SUMMARY:
      return is_set_summary();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PredictionTrend)
      return this.equals((PredictionTrend)that);
    return false;
  }

  public boolean equals(PredictionTrend that) {
    if (that == null)
      return false;

    boolean this_present_actualData = true && this.is_set_actualData();
    boolean that_present_actualData = true && that.is_set_actualData();
    if (this_present_actualData || that_present_actualData) {
      if (!(this_present_actualData && that_present_actualData))
        return false;
      if (!this.actualData.equals(that.actualData))
        return false;
    }

    boolean this_present_predictData = true && this.is_set_predictData();
    boolean that_present_predictData = true && that.is_set_predictData();
    if (this_present_predictData || that_present_predictData) {
      if (!(this_present_predictData && that_present_predictData))
        return false;
      if (!this.predictData.equals(that.predictData))
        return false;
    }

    boolean this_present_summary = true && this.is_set_summary();
    boolean that_present_summary = true && that.is_set_summary();
    if (this_present_summary || that_present_summary) {
      if (!(this_present_summary && that_present_summary))
        return false;
      if (!this.summary.equals(that.summary))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_actualData = true && (is_set_actualData());
    list.add(present_actualData);
    if (present_actualData)
      list.add(actualData);

    boolean present_predictData = true && (is_set_predictData());
    list.add(present_predictData);
    if (present_predictData)
      list.add(predictData);

    boolean present_summary = true && (is_set_summary());
    list.add(present_summary);
    if (present_summary)
      list.add(summary);

    return list.hashCode();
  }

  @Override
  public int compareTo(PredictionTrend other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_actualData()).compareTo(other.is_set_actualData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_actualData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.actualData, other.actualData);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_predictData()).compareTo(other.is_set_predictData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_predictData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.predictData, other.predictData);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_summary()).compareTo(other.is_set_summary());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_summary()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.summary, other.summary);
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
    StringBuilder sb = new StringBuilder("PredictionTrend(");
    boolean first = true;

    sb.append("actualData:");
    if (this.actualData == null) {
      sb.append("null");
    } else {
      sb.append(this.actualData);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("predictData:");
    if (this.predictData == null) {
      sb.append("null");
    } else {
      sb.append(this.predictData);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("summary:");
    if (this.summary == null) {
      sb.append("null");
    } else {
      sb.append(this.summary);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_actualData()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'actualData' is unset! Struct:" + toString());
    }

    if (!is_set_predictData()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'predictData' is unset! Struct:" + toString());
    }

    if (!is_set_summary()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'summary' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (actualData != null) {
      actualData.validate();
    }
    if (predictData != null) {
      predictData.validate();
    }
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

  private static class PredictionTrendStandardSchemeFactory implements SchemeFactory {
    public PredictionTrendStandardScheme getScheme() {
      return new PredictionTrendStandardScheme();
    }
  }

  private static class PredictionTrendStandardScheme extends StandardScheme<PredictionTrend> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PredictionTrend struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACTUAL_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              if (struct.actualData == null) {
                struct.actualData = new PredictionLine();
              }
              struct.actualData.read(iprot);
              struct.set_actualData_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PREDICT_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              if (struct.predictData == null) {
                struct.predictData = new PredictionLine();
              }
              struct.predictData.read(iprot);
              struct.set_predictData_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SUMMARY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.summary = iprot.readString();
              struct.set_summary_isSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PredictionTrend struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.actualData != null) {
        oprot.writeFieldBegin(ACTUAL_DATA_FIELD_DESC);
        struct.actualData.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.predictData != null) {
        oprot.writeFieldBegin(PREDICT_DATA_FIELD_DESC);
        struct.predictData.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.summary != null) {
        oprot.writeFieldBegin(SUMMARY_FIELD_DESC);
        oprot.writeString(struct.summary);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PredictionTrendTupleSchemeFactory implements SchemeFactory {
    public PredictionTrendTupleScheme getScheme() {
      return new PredictionTrendTupleScheme();
    }
  }

  private static class PredictionTrendTupleScheme extends TupleScheme<PredictionTrend> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PredictionTrend struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.actualData.write(oprot);
      struct.predictData.write(oprot);
      oprot.writeString(struct.summary);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PredictionTrend struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      if (struct.actualData == null) {
        struct.actualData = new PredictionLine();
      }
      struct.actualData.read(iprot);
      struct.set_actualData_isSet(true);
      if (struct.predictData == null) {
        struct.predictData = new PredictionLine();
      }
      struct.predictData.read(iprot);
      struct.set_predictData_isSet(true);
      struct.summary = iprot.readString();
      struct.set_summary_isSet(true);
    }
  }

}

