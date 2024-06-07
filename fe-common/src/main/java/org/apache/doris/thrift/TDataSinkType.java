/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public enum TDataSinkType implements org.apache.thrift.TEnum {
  DATA_STREAM_SINK(0),
  RESULT_SINK(1),
  DATA_SPLIT_SINK(2),
  MYSQL_TABLE_SINK(3),
  EXPORT_SINK(4),
  OLAP_TABLE_SINK(5),
  MEMORY_SCRATCH_SINK(6),
  ODBC_TABLE_SINK(7),
  RESULT_FILE_SINK(8),
  JDBC_TABLE_SINK(9),
  MULTI_CAST_DATA_STREAM_SINK(10),
  GROUP_COMMIT_OLAP_TABLE_SINK(11),
  GROUP_COMMIT_BLOCK_SINK(12),
  HIVE_TABLE_SINK(13);

  private final int value;

  private TDataSinkType(int value) {
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
  public static TDataSinkType findByValue(int value) { 
    switch (value) {
      case 0:
        return DATA_STREAM_SINK;
      case 1:
        return RESULT_SINK;
      case 2:
        return DATA_SPLIT_SINK;
      case 3:
        return MYSQL_TABLE_SINK;
      case 4:
        return EXPORT_SINK;
      case 5:
        return OLAP_TABLE_SINK;
      case 6:
        return MEMORY_SCRATCH_SINK;
      case 7:
        return ODBC_TABLE_SINK;
      case 8:
        return RESULT_FILE_SINK;
      case 9:
        return JDBC_TABLE_SINK;
      case 10:
        return MULTI_CAST_DATA_STREAM_SINK;
      case 11:
        return GROUP_COMMIT_OLAP_TABLE_SINK;
      case 12:
        return GROUP_COMMIT_BLOCK_SINK;
      case 13:
        return HIVE_TABLE_SINK;
      default:
        return null;
    }
  }
}
