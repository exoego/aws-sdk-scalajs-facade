package facade.amazonaws.services.timestreamquery

import scalajs.js

type DimensionValueType = "VARCHAR"
object DimensionValueType {
  inline val VARCHAR: "VARCHAR" = "VARCHAR"

  inline def values: js.Array[DimensionValueType] = js.Array(VARCHAR)
}

type MeasureValueType = "BIGINT" | "BOOLEAN" | "DOUBLE" | "VARCHAR" | "MULTI"
object MeasureValueType {
  inline val BIGINT: "BIGINT" = "BIGINT"
  inline val BOOLEAN: "BOOLEAN" = "BOOLEAN"
  inline val DOUBLE: "DOUBLE" = "DOUBLE"
  inline val VARCHAR: "VARCHAR" = "VARCHAR"
  inline val MULTI: "MULTI" = "MULTI"

  inline def values: js.Array[MeasureValueType] = js.Array(BIGINT, BOOLEAN, DOUBLE, VARCHAR, MULTI)
}

type S3EncryptionOption = "SSE_S3" | "SSE_KMS"
object S3EncryptionOption {
  inline val SSE_S3: "SSE_S3" = "SSE_S3"
  inline val SSE_KMS: "SSE_KMS" = "SSE_KMS"

  inline def values: js.Array[S3EncryptionOption] = js.Array(SSE_S3, SSE_KMS)
}

type ScalarMeasureValueType = "BIGINT" | "BOOLEAN" | "DOUBLE" | "VARCHAR"
object ScalarMeasureValueType {
  inline val BIGINT: "BIGINT" = "BIGINT"
  inline val BOOLEAN: "BOOLEAN" = "BOOLEAN"
  inline val DOUBLE: "DOUBLE" = "DOUBLE"
  inline val VARCHAR: "VARCHAR" = "VARCHAR"

  inline def values: js.Array[ScalarMeasureValueType] = js.Array(BIGINT, BOOLEAN, DOUBLE, VARCHAR)
}

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

type ScheduledQueryRunStatus = "AUTO_TRIGGER_SUCCESS" | "AUTO_TRIGGER_FAILURE" | "MANUAL_TRIGGER_SUCCESS" | "MANUAL_TRIGGER_FAILURE"
object ScheduledQueryRunStatus {
  inline val AUTO_TRIGGER_SUCCESS: "AUTO_TRIGGER_SUCCESS" = "AUTO_TRIGGER_SUCCESS"
  inline val AUTO_TRIGGER_FAILURE: "AUTO_TRIGGER_FAILURE" = "AUTO_TRIGGER_FAILURE"
  inline val MANUAL_TRIGGER_SUCCESS: "MANUAL_TRIGGER_SUCCESS" = "MANUAL_TRIGGER_SUCCESS"
  inline val MANUAL_TRIGGER_FAILURE: "MANUAL_TRIGGER_FAILURE" = "MANUAL_TRIGGER_FAILURE"

  inline def values: js.Array[ScheduledQueryRunStatus] = js.Array(AUTO_TRIGGER_SUCCESS, AUTO_TRIGGER_FAILURE, MANUAL_TRIGGER_SUCCESS, MANUAL_TRIGGER_FAILURE)
}

type ScheduledQueryState = "ENABLED" | "DISABLED"
object ScheduledQueryState {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[ScheduledQueryState] = js.Array(ENABLED, DISABLED)
}
