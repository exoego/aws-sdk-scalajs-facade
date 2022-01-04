package facade.amazonaws.services.athena

import scalajs.js

@js.native
sealed trait ColumnNullable extends js.Any
object ColumnNullable {
  val NOT_NULL = "NOT_NULL".asInstanceOf[ColumnNullable]
  val NULLABLE = "NULLABLE".asInstanceOf[ColumnNullable]
  val UNKNOWN = "UNKNOWN".asInstanceOf[ColumnNullable]

  @inline def values: js.Array[ColumnNullable] = js.Array(NOT_NULL, NULLABLE, UNKNOWN)
}

@js.native
sealed trait DataCatalogType extends js.Any
object DataCatalogType {
  val LAMBDA = "LAMBDA".asInstanceOf[DataCatalogType]
  val GLUE = "GLUE".asInstanceOf[DataCatalogType]
  val HIVE = "HIVE".asInstanceOf[DataCatalogType]

  @inline def values: js.Array[DataCatalogType] = js.Array(LAMBDA, GLUE, HIVE)
}

@js.native
sealed trait EncryptionOption extends js.Any
object EncryptionOption {
  val SSE_S3 = "SSE_S3".asInstanceOf[EncryptionOption]
  val SSE_KMS = "SSE_KMS".asInstanceOf[EncryptionOption]
  val CSE_KMS = "CSE_KMS".asInstanceOf[EncryptionOption]

  @inline def values: js.Array[EncryptionOption] = js.Array(SSE_S3, SSE_KMS, CSE_KMS)
}

@js.native
sealed trait QueryExecutionState extends js.Any
object QueryExecutionState {
  val QUEUED = "QUEUED".asInstanceOf[QueryExecutionState]
  val RUNNING = "RUNNING".asInstanceOf[QueryExecutionState]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[QueryExecutionState]
  val FAILED = "FAILED".asInstanceOf[QueryExecutionState]
  val CANCELLED = "CANCELLED".asInstanceOf[QueryExecutionState]

  @inline def values: js.Array[QueryExecutionState] = js.Array(QUEUED, RUNNING, SUCCEEDED, FAILED, CANCELLED)
}

@js.native
sealed trait StatementType extends js.Any
object StatementType {
  val DDL = "DDL".asInstanceOf[StatementType]
  val DML = "DML".asInstanceOf[StatementType]
  val UTILITY = "UTILITY".asInstanceOf[StatementType]

  @inline def values: js.Array[StatementType] = js.Array(DDL, DML, UTILITY)
}

@js.native
sealed trait WorkGroupState extends js.Any
object WorkGroupState {
  val ENABLED = "ENABLED".asInstanceOf[WorkGroupState]
  val DISABLED = "DISABLED".asInstanceOf[WorkGroupState]

  @inline def values: js.Array[WorkGroupState] = js.Array(ENABLED, DISABLED)
}
