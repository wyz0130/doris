/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public enum TCommonDdlType implements org.apache.thrift.TEnum {
  CREATE_DATABASE(0),
  DROP_DATABASE(1),
  CREATE_TABLE(2),
  DROP_TABLE(3),
  LOAD(4);

  private final int value;

  private TCommonDdlType(int value) {
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
  public static TCommonDdlType findByValue(int value) { 
    switch (value) {
      case 0:
        return CREATE_DATABASE;
      case 1:
        return DROP_DATABASE;
      case 2:
        return CREATE_TABLE;
      case 3:
        return DROP_TABLE;
      case 4:
        return LOAD;
      default:
        return null;
    }
  }
}
