/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public enum TExecNodePhase implements org.apache.thrift.TEnum {
  PREPARE(0),
  OPEN(1),
  GETNEXT(2),
  CLOSE(3),
  INVALID(4);

  private final int value;

  private TExecNodePhase(int value) {
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
  public static TExecNodePhase findByValue(int value) { 
    switch (value) {
      case 0:
        return PREPARE;
      case 1:
        return OPEN;
      case 2:
        return GETNEXT;
      case 3:
        return CLOSE;
      case 4:
        return INVALID;
      default:
        return null;
    }
  }
}
