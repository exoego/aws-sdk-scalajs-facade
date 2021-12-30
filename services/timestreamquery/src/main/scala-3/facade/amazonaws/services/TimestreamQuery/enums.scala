package facade.amazonaws.services.timestreamquery

import scalajs.js

type ScalarType = "VARCHAR" | "BOOLEAN" | "BIGINT" | "DOUBLE" | "TIMESTAMP" | "DATE" | "TIME" | "INTERVAL_DAY_TO_SECOND" | "INTERVAL_YEAR_TO_MONTH" | "UNKNOWN" | "INTEGER"
object ScalarType {
  inline val VARCHAR: "VARCHAR" = "VARCHAR"
  inline val BOOLEAN: "BOOLEAN" = "BOOLEAN"
  inline val BIGINT: "BIGINT" = "BIGINT"
  inline val DOUBLE: "DOUBLE" = "DOUBLE"
  inline val TIMESTAMP: "TIMESTAMP" = "TIMESTAMP"
  inline val DATE: "DATE" = "DATE"
  inline val TIME: "TIME" = "TIME"
  inline val INTERVAL_DAY_TO_SECOND: "INTERVAL_DAY_TO_SECOND" = "INTERVAL_DAY_TO_SECOND"
  inline val INTERVAL_YEAR_TO_MONTH: "INTERVAL_YEAR_TO_MONTH" = "INTERVAL_YEAR_TO_MONTH"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"
  inline val INTEGER: "INTEGER" = "INTEGER"

  inline def values: js.Array[ScalarType] = js.Array(VARCHAR, BOOLEAN, BIGINT, DOUBLE, TIMESTAMP, DATE, TIME, INTERVAL_DAY_TO_SECOND, INTERVAL_YEAR_TO_MONTH, UNKNOWN, INTEGER)
}
