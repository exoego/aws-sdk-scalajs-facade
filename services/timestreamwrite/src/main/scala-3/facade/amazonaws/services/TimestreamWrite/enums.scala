package facade.amazonaws.services.timestreamwrite

import scalajs.js

type DimensionValueType = "VARCHAR"
object DimensionValueType {
  inline val VARCHAR: "VARCHAR" = "VARCHAR"

  inline def values: js.Array[DimensionValueType] = js.Array(VARCHAR)
}

type MeasureValueType = "DOUBLE" | "BIGINT" | "VARCHAR" | "BOOLEAN" | "TIMESTAMP" | "MULTI"
object MeasureValueType {
  inline val DOUBLE: "DOUBLE" = "DOUBLE"
  inline val BIGINT: "BIGINT" = "BIGINT"
  inline val VARCHAR: "VARCHAR" = "VARCHAR"
  inline val BOOLEAN: "BOOLEAN" = "BOOLEAN"
  inline val TIMESTAMP: "TIMESTAMP" = "TIMESTAMP"
  inline val MULTI: "MULTI" = "MULTI"

  inline def values: js.Array[MeasureValueType] = js.Array(DOUBLE, BIGINT, VARCHAR, BOOLEAN, TIMESTAMP, MULTI)
}

type S3EncryptionOption = "SSE_S3" | "SSE_KMS"
object S3EncryptionOption {
  inline val SSE_S3: "SSE_S3" = "SSE_S3"
  inline val SSE_KMS: "SSE_KMS" = "SSE_KMS"

  inline def values: js.Array[S3EncryptionOption] = js.Array(SSE_S3, SSE_KMS)
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
