/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public enum TWorkloadMetricType implements org.apache.thrift.TEnum {
  QUERY_TIME(0),
  BE_SCAN_ROWS(1),
  BE_SCAN_BYTES(2);

  private final int value;

  private TWorkloadMetricType(int value) {
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
  @org.apache.thrift.annotation.Nullable
  public static TWorkloadMetricType findByValue(int value) { 
    switch (value) {
      case 0:
        return QUERY_TIME;
      case 1:
        return BE_SCAN_ROWS;
      case 2:
        return BE_SCAN_BYTES;
      default:
        return null;
    }
  }
}