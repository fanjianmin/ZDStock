/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.rjzd.aistock.api;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * 新闻类型    新闻/公告/研报
 * 
 */
public enum NewsType implements org.apache.thrift.TEnum {
  NEWS(10),
  ANNOUNCEMENT(20),
  RESEARCH_REPORT(30);

  private final int value;

  private NewsType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static NewsType findByValue(int value) { 
    switch (value) {
      case 10:
        return NEWS;
      case 20:
        return ANNOUNCEMENT;
      case 30:
        return RESEARCH_REPORT;
      default:
        return null;
    }
  }
}