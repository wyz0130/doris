/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public enum THdfsFileFormat implements org.apache.thrift.TEnum {
  TEXT(0),
  LZO_TEXT(1),
  RC_FILE(2),
  SEQUENCE_FILE(3),
  AVRO(4),
  PARQUET(5);

  private final int value;

  private THdfsFileFormat(int value) {
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
  public static THdfsFileFormat findByValue(int value) { 
    switch (value) {
      case 0:
        return TEXT;
      case 1:
        return LZO_TEXT;
      case 2:
        return RC_FILE;
      case 3:
        return SEQUENCE_FILE;
      case 4:
        return AVRO;
      case 5:
        return PARQUET;
      default:
        return null;
    }
  }
}
