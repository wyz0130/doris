/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2024-05-20")
public enum TParquetDataLogicalType implements org.apache.thrift.TEnum {
  UNDEFINED(0),
  STRING(1),
  MAP(2),
  LIST(3),
  ENUM(4),
  DECIMAL(5),
  DATE(6),
  TIME(7),
  TIMESTAMP(8),
  INTERVAL(9),
  INT(10),
  NIL(11),
  JSON(12),
  BSON(13),
  UUID(14),
  NONE(15);

  private final int value;

  private TParquetDataLogicalType(int value) {
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
  public static TParquetDataLogicalType findByValue(int value) { 
    switch (value) {
      case 0:
        return UNDEFINED;
      case 1:
        return STRING;
      case 2:
        return MAP;
      case 3:
        return LIST;
      case 4:
        return ENUM;
      case 5:
        return DECIMAL;
      case 6:
        return DATE;
      case 7:
        return TIME;
      case 8:
        return TIMESTAMP;
      case 9:
        return INTERVAL;
      case 10:
        return INT;
      case 11:
        return NIL;
      case 12:
        return JSON;
      case 13:
        return BSON;
      case 14:
        return UUID;
      case 15:
        return NONE;
      default:
        return null;
    }
  }
}
