package facade.amazonaws.services.athena

import scalajs.js

type CalculationExecutionState = "CREATING" | "CREATED" | "QUEUED" | "RUNNING" | "CANCELING" | "CANCELED" | "COMPLETED" | "FAILED"
object CalculationExecutionState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATED: "CREATED" = "CREATED"
  inline val QUEUED: "QUEUED" = "QUEUED"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val CANCELING: "CANCELING" = "CANCELING"
  inline val CANCELED: "CANCELED" = "CANCELED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[CalculationExecutionState] = js.Array(CREATING, CREATED, QUEUED, RUNNING, CANCELING, CANCELED, COMPLETED, FAILED)
}

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

type ExecutorState = "CREATING" | "CREATED" | "REGISTERED" | "TERMINATING" | "TERMINATED" | "FAILED"
object ExecutorState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATED: "CREATED" = "CREATED"
  inline val REGISTERED: "REGISTERED" = "REGISTERED"
  inline val TERMINATING: "TERMINATING" = "TERMINATING"
  inline val TERMINATED: "TERMINATED" = "TERMINATED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ExecutorState] = js.Array(CREATING, CREATED, REGISTERED, TERMINATING, TERMINATED, FAILED)
}

type ExecutorType = "COORDINATOR" | "GATEWAY" | "WORKER"
object ExecutorType {
  inline val COORDINATOR: "COORDINATOR" = "COORDINATOR"
  inline val GATEWAY: "GATEWAY" = "GATEWAY"
  inline val WORKER: "WORKER" = "WORKER"

  inline def values: js.Array[ExecutorType] = js.Array(COORDINATOR, GATEWAY, WORKER)
}

type NotebookType = "IPYNB"
object NotebookType {
  inline val IPYNB: "IPYNB" = "IPYNB"

  inline def values: js.Array[NotebookType] = js.Array(IPYNB)
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

type S3AclOption = "BUCKET_OWNER_FULL_CONTROL"
object S3AclOption {
  inline val BUCKET_OWNER_FULL_CONTROL: "BUCKET_OWNER_FULL_CONTROL" = "BUCKET_OWNER_FULL_CONTROL"

  inline def values: js.Array[S3AclOption] = js.Array(BUCKET_OWNER_FULL_CONTROL)
}

type SessionState = "CREATING" | "CREATED" | "IDLE" | "BUSY" | "TERMINATING" | "TERMINATED" | "DEGRADED" | "FAILED"
object SessionState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATED: "CREATED" = "CREATED"
  inline val IDLE: "IDLE" = "IDLE"
  inline val BUSY: "BUSY" = "BUSY"
  inline val TERMINATING: "TERMINATING" = "TERMINATING"
  inline val TERMINATED: "TERMINATED" = "TERMINATED"
  inline val DEGRADED: "DEGRADED" = "DEGRADED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[SessionState] = js.Array(CREATING, CREATED, IDLE, BUSY, TERMINATING, TERMINATED, DEGRADED, FAILED)
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
