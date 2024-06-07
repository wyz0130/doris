/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public enum TSchemaTableName implements org.apache.thrift.TEnum {
  METADATA_TABLE(1),
  ACTIVE_QUERIES(2),
  WORKLOAD_GROUPS(3),
  ROUTINES_INFO(4),
  WORKLOAD_SCHEDULE_POLICY(5);

  private final int value;

  private TSchemaTableName(int value) {
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
  public static TSchemaTableName findByValue(int value) { 
    switch (value) {
      case 1:
        return METADATA_TABLE;
      case 2:
        return ACTIVE_QUERIES;
      case 3:
        return WORKLOAD_GROUPS;
      case 4:
        return ROUTINES_INFO;
      case 5:
        return WORKLOAD_SCHEDULE_POLICY;
      default:
        return null;
    }
  }
}
