package facade.amazonaws.services.athena

import scalajs.js

type ColumnNullable = "NOT_NULL" | "NULLABLE" | "UNKNOWN"
object ColumnNullable {
  inline val NOT_NULL: "NOT_NULL" = "NOT_NULL"
  inline val NULLABLE: "NULLABLE" = "NULLABLE"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[ColumnNullable] = js.Array(NOT_NULL, NULLABLE, UNKNOWN)
}

type DataCatalogType = "LAMBDA" | "GLUE" | "HIVE"
object DataCatalogType {
  inline val LAMBDA: "LAMBDA" = "LAMBDA"
  inline val GLUE: "GLUE" = "GLUE"
  inline val HIVE: "HIVE" = "HIVE"

  inline def values: js.Array[DataCatalogType] = js.Array(LAMBDA, GLUE, HIVE)
}

type EncryptionOption = "SSE_S3" | "SSE_KMS" | "CSE_KMS"
object EncryptionOption {
  inline val SSE_S3: "SSE_S3" = "SSE_S3"
  inline val SSE_KMS: "SSE_KMS" = "SSE_KMS"
  inline val CSE_KMS: "CSE_KMS" = "CSE_KMS"

  inline def values: js.Array[EncryptionOption] = js.Array(SSE_S3, SSE_KMS, CSE_KMS)
}

type QueryExecutionState = "QUEUED" | "RUNNING" | "SUCCEEDED" | "FAILED" | "CANCELLED"
object QueryExecutionState {
  inline val QUEUED: "QUEUED" = "QUEUED"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"

  inline def values: js.Array[QueryExecutionState] = js.Array(QUEUED, RUNNING, SUCCEEDED, FAILED, CANCELLED)
}

type StatementType = "DDL" | "DML" | "UTILITY"
object StatementType {
  inline val DDL: "DDL" = "DDL"
  inline val DML: "DML" = "DML"
  inline val UTILITY: "UTILITY" = "UTILITY"

  inline def values: js.Array[StatementType] = js.Array(DDL, DML, UTILITY)
}

type WorkGroupState = "ENABLED" | "DISABLED"
object WorkGroupState {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[WorkGroupState] = js.Array(ENABLED, DISABLED)
}
