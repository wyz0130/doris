/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public enum TPartTopNPhase implements org.apache.thrift.TEnum {
  UNKNOWN(0),
  ONE_PHASE_GLOBAL(1),
  TWO_PHASE_LOCAL(2),
  TWO_PHASE_GLOBAL(3);

  private final int value;

  private TPartTopNPhase(int value) {
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
  public static TPartTopNPhase findByValue(int value) { 
    switch (value) {
      case 0:
        return UNKNOWN;
      case 1:
        return ONE_PHASE_GLOBAL;
      case 2:
        return TWO_PHASE_LOCAL;
      case 3:
        return TWO_PHASE_GLOBAL;
      default:
        return null;
    }
  }
}