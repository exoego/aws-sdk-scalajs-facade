package facade.amazonaws.services.athena

import scalajs.js

@js.native
sealed trait CalculationExecutionState extends js.Any
object CalculationExecutionState {
  val CREATING = "CREATING".asInstanceOf[CalculationExecutionState]
  val CREATED = "CREATED".asInstanceOf[CalculationExecutionState]
  val QUEUED = "QUEUED".asInstanceOf[CalculationExecutionState]
  val RUNNING = "RUNNING".asInstanceOf[CalculationExecutionState]
  val CANCELING = "CANCELING".asInstanceOf[CalculationExecutionState]
  val CANCELED = "CANCELED".asInstanceOf[CalculationExecutionState]
  val COMPLETED = "COMPLETED".asInstanceOf[CalculationExecutionState]
  val FAILED = "FAILED".asInstanceOf[CalculationExecutionState]

  @inline def values: js.Array[CalculationExecutionState] = js.Array(CREATING, CREATED, QUEUED, RUNNING, CANCELING, CANCELED, COMPLETED, FAILED)
}

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
sealed trait ExecutorState extends js.Any
object ExecutorState {
  val CREATING = "CREATING".asInstanceOf[ExecutorState]
  val CREATED = "CREATED".asInstanceOf[ExecutorState]
  val REGISTERED = "REGISTERED".asInstanceOf[ExecutorState]
  val TERMINATING = "TERMINATING".asInstanceOf[ExecutorState]
  val TERMINATED = "TERMINATED".asInstanceOf[ExecutorState]
  val FAILED = "FAILED".asInstanceOf[ExecutorState]

  @inline def values: js.Array[ExecutorState] = js.Array(CREATING, CREATED, REGISTERED, TERMINATING, TERMINATED, FAILED)
}

@js.native
sealed trait ExecutorType extends js.Any
object ExecutorType {
  val COORDINATOR = "COORDINATOR".asInstanceOf[ExecutorType]
  val GATEWAY = "GATEWAY".asInstanceOf[ExecutorType]
  val WORKER = "WORKER".asInstanceOf[ExecutorType]

  @inline def values: js.Array[ExecutorType] = js.Array(COORDINATOR, GATEWAY, WORKER)
}

@js.native
sealed trait NotebookType extends js.Any
object NotebookType {
  val IPYNB = "IPYNB".asInstanceOf[NotebookType]

  @inline def values: js.Array[NotebookType] = js.Array(IPYNB)
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
sealed trait S3AclOption extends js.Any
object S3AclOption {
  val BUCKET_OWNER_FULL_CONTROL = "BUCKET_OWNER_FULL_CONTROL".asInstanceOf[S3AclOption]

  @inline def values: js.Array[S3AclOption] = js.Array(BUCKET_OWNER_FULL_CONTROL)
}

@js.native
sealed trait SessionState extends js.Any
object SessionState {
  val CREATING = "CREATING".asInstanceOf[SessionState]
  val CREATED = "CREATED".asInstanceOf[SessionState]
  val IDLE = "IDLE".asInstanceOf[SessionState]
  val BUSY = "BUSY".asInstanceOf[SessionState]
  val TERMINATING = "TERMINATING".asInstanceOf[SessionState]
  val TERMINATED = "TERMINATED".asInstanceOf[SessionState]
  val DEGRADED = "DEGRADED".asInstanceOf[SessionState]
  val FAILED = "FAILED".asInstanceOf[SessionState]

  @inline def values: js.Array[SessionState] = js.Array(CREATING, CREATED, IDLE, BUSY, TERMINATING, TERMINATED, DEGRADED, FAILED)
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
