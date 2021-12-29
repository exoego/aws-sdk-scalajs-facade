package facade.amazonaws.services.timestreamwrite

import scalajs._

type DimensionValueType = "VARCHAR"
object DimensionValueType {
  val VARCHAR: "VARCHAR" = "VARCHAR"

  @inline def values = js.Array[DimensionValueType](VARCHAR)
}

type MeasureValueType = "DOUBLE" | "BIGINT" | "VARCHAR" | "BOOLEAN"
object MeasureValueType {
  val DOUBLE: "DOUBLE" = "DOUBLE"
  val BIGINT: "BIGINT" = "BIGINT"
  val VARCHAR: "VARCHAR" = "VARCHAR"
  val BOOLEAN: "BOOLEAN" = "BOOLEAN"

  @inline def values = js.Array[MeasureValueType](DOUBLE, BIGINT, VARCHAR, BOOLEAN)
}

type TableStatus = "ACTIVE" | "DELETING"
object TableStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[TableStatus](ACTIVE, DELETING)
}

type TimeUnit = "MILLISECONDS" | "SECONDS" | "MICROSECONDS" | "NANOSECONDS"
object TimeUnit {
  val MILLISECONDS: "MILLISECONDS" = "MILLISECONDS"
  val SECONDS: "SECONDS" = "SECONDS"
  val MICROSECONDS: "MICROSECONDS" = "MICROSECONDS"
  val NANOSECONDS: "NANOSECONDS" = "NANOSECONDS"

  @inline def values = js.Array[TimeUnit](MILLISECONDS, SECONDS, MICROSECONDS, NANOSECONDS)
}
