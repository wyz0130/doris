/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public enum TExplainLevel implements org.apache.thrift.TEnum {
  BRIEF(0),
  NORMAL(1),
  VERBOSE(2);

  private final int value;

  private TExplainLevel(int value) {
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
  public static TExplainLevel findByValue(int value) { 
    switch (value) {
      case 0:
        return BRIEF;
      case 1:
        return NORMAL;
      case 2:
        return VERBOSE;
      default:
        return null;
    }
  }
}
