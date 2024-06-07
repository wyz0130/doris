/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.parquet.format;


/**
 * Enum to annotate whether lists of min/max elements inside ColumnIndex
 * are ordered and if so, in which direction.
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public enum BoundaryOrder implements org.apache.thrift.TEnum {
  UNORDERED(0),
  ASCENDING(1),
  DESCENDING(2);

  private final int value;

  private BoundaryOrder(int value) {
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
  public static BoundaryOrder findByValue(int value) { 
    switch (value) {
      case 0:
        return UNORDERED;
      case 1:
        return ASCENDING;
      case 2:
        return DESCENDING;
      default:
        return null;
    }
  }
}