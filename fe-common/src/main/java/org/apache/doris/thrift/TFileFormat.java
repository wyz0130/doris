/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public enum TFileFormat implements org.apache.thrift.TEnum {
  PARQUETFILE(0),
  RCFILE(1),
  SEQUENCEFILE(2),
  TEXTFILE(3);

  private final int value;

  private TFileFormat(int value) {
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
  public static TFileFormat findByValue(int value) { 
    switch (value) {
      case 0:
        return PARQUETFILE;
      case 1:
        return RCFILE;
      case 2:
        return SEQUENCEFILE;
      case 3:
        return TEXTFILE;
      default:
        return null;
    }
  }
}