/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public enum TQueryStatsType implements org.apache.thrift.TEnum {
  CATALOG(0),
  DATABASE(1),
  TABLE(2),
  TABLE_ALL(3),
  TABLE_ALL_VERBOSE(4),
  TABLET(5),
  TABLETS(6);

  private final int value;

  private TQueryStatsType(int value) {
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
  public static TQueryStatsType findByValue(int value) { 
    switch (value) {
      case 0:
        return CATALOG;
      case 1:
        return DATABASE;
      case 2:
        return TABLE;
      case 3:
        return TABLE_ALL;
      case 4:
        return TABLE_ALL_VERBOSE;
      case 5:
        return TABLET;
      case 6:
        return TABLETS;
      default:
        return null;
    }
  }
}
