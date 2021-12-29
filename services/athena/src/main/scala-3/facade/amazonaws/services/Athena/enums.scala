package facade.amazonaws.services.athena

import scalajs._

type ColumnNullable = "NOT_NULL" | "NULLABLE" | "UNKNOWN"
object ColumnNullable {
  val NOT_NULL: "NOT_NULL" = "NOT_NULL"
  val NULLABLE: "NULLABLE" = "NULLABLE"
  val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  @inline def values = js.Array[ColumnNullable](NOT_NULL, NULLABLE, UNKNOWN)
}

type DataCatalogType = "LAMBDA" | "GLUE" | "HIVE"
object DataCatalogType {
  val LAMBDA: "LAMBDA" = "LAMBDA"
  val GLUE: "GLUE" = "GLUE"
  val HIVE: "HIVE" = "HIVE"

  @inline def values = js.Array[DataCatalogType](LAMBDA, GLUE, HIVE)
}

type EncryptionOption = "SSE_S3" | "SSE_KMS" | "CSE_KMS"
object EncryptionOption {
  val SSE_S3: "SSE_S3" = "SSE_S3"
  val SSE_KMS: "SSE_KMS" = "SSE_KMS"
  val CSE_KMS: "CSE_KMS" = "CSE_KMS"

  @inline def values = js.Array[EncryptionOption](SSE_S3, SSE_KMS, CSE_KMS)
}

type QueryExecutionState = "QUEUED" | "RUNNING" | "SUCCEEDED" | "FAILED" | "CANCELLED"
object QueryExecutionState {
  val QUEUED: "QUEUED" = "QUEUED"
  val RUNNING: "RUNNING" = "RUNNING"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"
  val CANCELLED: "CANCELLED" = "CANCELLED"

  @inline def values = js.Array[QueryExecutionState](QUEUED, RUNNING, SUCCEEDED, FAILED, CANCELLED)
}

type StatementType = "DDL" | "DML" | "UTILITY"
object StatementType {
  val DDL: "DDL" = "DDL"
  val DML: "DML" = "DML"
  val UTILITY: "UTILITY" = "UTILITY"

  @inline def values = js.Array[StatementType](DDL, DML, UTILITY)
}

type WorkGroupState = "ENABLED" | "DISABLED"
object WorkGroupState {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[WorkGroupState](ENABLED, DISABLED)
}
