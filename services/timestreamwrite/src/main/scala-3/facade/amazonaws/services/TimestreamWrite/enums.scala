package facade.amazonaws.services.timestreamwrite

import scalajs.js

type DimensionValueType = "VARCHAR"
object DimensionValueType {
  inline val VARCHAR: "VARCHAR" = "VARCHAR"

  inline def values: js.Array[DimensionValueType] = js.Array(VARCHAR)
}

type MeasureValueType = "DOUBLE" | "BIGINT" | "VARCHAR" | "BOOLEAN"
object MeasureValueType {
  inline val DOUBLE: "DOUBLE" = "DOUBLE"
  inline val BIGINT: "BIGINT" = "BIGINT"
  inline val VARCHAR: "VARCHAR" = "VARCHAR"
  inline val BOOLEAN: "BOOLEAN" = "BOOLEAN"

  inline def values: js.Array[MeasureValueType] = js.Array(DOUBLE, BIGINT, VARCHAR, BOOLEAN)
}

type TableStatus = "ACTIVE" | "DELETING"
object TableStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[TableStatus] = js.Array(ACTIVE, DELETING)
}

type TimeUnit = "MILLISECONDS" | "SECONDS" | "MICROSECONDS" | "NANOSECONDS"
object TimeUnit {
  inline val MILLISECONDS: "MILLISECONDS" = "MILLISECONDS"
  inline val SECONDS: "SECONDS" = "SECONDS"
  inline val MICROSECONDS: "MICROSECONDS" = "MICROSECONDS"
  inline val NANOSECONDS: "NANOSECONDS" = "NANOSECONDS"

  inline def values: js.Array[TimeUnit] = js.Array(MILLISECONDS, SECONDS, MICROSECONDS, NANOSECONDS)
}
