/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public enum TBinlogType implements org.apache.thrift.TEnum {
  UPSERT(0),
  ADD_PARTITION(1),
  CREATE_TABLE(2),
  DROP_PARTITION(3),
  DROP_TABLE(4),
  ALTER_JOB(5),
  MODIFY_TABLE_ADD_OR_DROP_COLUMNS(6),
  DUMMY(7),
  ALTER_DATABASE_PROPERTY(8),
  MODIFY_TABLE_PROPERTY(9),
  BARRIER(10),
  MODIFY_PARTITIONS(11),
  REPLACE_PARTITIONS(12),
  TRUNCATE_TABLE(13);

  private final int value;

  private TBinlogType(int value) {
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
  public static TBinlogType findByValue(int value) { 
    switch (value) {
      case 0:
        return UPSERT;
      case 1:
        return ADD_PARTITION;
      case 2:
        return CREATE_TABLE;
      case 3:
        return DROP_PARTITION;
      case 4:
        return DROP_TABLE;
      case 5:
        return ALTER_JOB;
      case 6:
        return MODIFY_TABLE_ADD_OR_DROP_COLUMNS;
      case 7:
        return DUMMY;
      case 8:
        return ALTER_DATABASE_PROPERTY;
      case 9:
        return MODIFY_TABLE_PROPERTY;
      case 10:
        return BARRIER;
      case 11:
        return MODIFY_PARTITIONS;
      case 12:
        return REPLACE_PARTITIONS;
      case 13:
        return TRUNCATE_TABLE;
      default:
        return null;
    }
  }
}