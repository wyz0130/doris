/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public enum TPartitionType implements org.apache.thrift.TEnum {
  UNPARTITIONED(0),
  RANDOM(1),
  HASH_PARTITIONED(2),
  RANGE_PARTITIONED(3),
  LIST_PARTITIONED(4),
  BUCKET_SHFFULE_HASH_PARTITIONED(5),
  TABLET_SINK_SHUFFLE_PARTITIONED(6),
  TABLE_SINK_HASH_PARTITIONED(7),
  TABLE_SINK_RANDOM_PARTITIONED(8);

  private final int value;

  private TPartitionType(int value) {
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
  public static TPartitionType findByValue(int value) { 
    switch (value) {
      case 0:
        return UNPARTITIONED;
      case 1:
        return RANDOM;
      case 2:
        return HASH_PARTITIONED;
      case 3:
        return RANGE_PARTITIONED;
      case 4:
        return LIST_PARTITIONED;
      case 5:
        return BUCKET_SHFFULE_HASH_PARTITIONED;
      case 6:
        return TABLET_SINK_SHUFFLE_PARTITIONED;
      case 7:
        return TABLE_SINK_HASH_PARTITIONED;
      case 8:
        return TABLE_SINK_RANDOM_PARTITIONED;
      default:
        return null;
    }
  }
}