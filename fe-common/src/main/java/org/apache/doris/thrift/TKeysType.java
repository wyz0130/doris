/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public enum TKeysType implements org.apache.thrift.TEnum {
  PRIMARY_KEYS(0),
  DUP_KEYS(1),
  UNIQUE_KEYS(2),
  AGG_KEYS(3);

  private final int value;

  private TKeysType(int value) {
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
  public static TKeysType findByValue(int value) { 
    switch (value) {
      case 0:
        return PRIMARY_KEYS;
      case 1:
        return DUP_KEYS;
      case 2:
        return UNIQUE_KEYS;
      case 3:
        return AGG_KEYS;
      default:
        return null;
    }
  }
}