package facade.amazonaws.services.qldb

import scalajs._

type ErrorCause = "KINESIS_STREAM_NOT_FOUND" | "IAM_PERMISSION_REVOKED"
object ErrorCause {
  inline val KINESIS_STREAM_NOT_FOUND: "KINESIS_STREAM_NOT_FOUND" = "KINESIS_STREAM_NOT_FOUND"
  inline val IAM_PERMISSION_REVOKED: "IAM_PERMISSION_REVOKED" = "IAM_PERMISSION_REVOKED"

  inline def values: js.Array[ErrorCause] = js.Array(KINESIS_STREAM_NOT_FOUND, IAM_PERMISSION_REVOKED)
}

type ExportStatus = "IN_PROGRESS" | "COMPLETED" | "CANCELLED"
object ExportStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"

  inline def values: js.Array[ExportStatus] = js.Array(IN_PROGRESS, COMPLETED, CANCELLED)
}

type LedgerState = "CREATING" | "ACTIVE" | "DELETING" | "DELETED"
object LedgerState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[LedgerState] = js.Array(CREATING, ACTIVE, DELETING, DELETED)
}

type PermissionsMode = "ALLOW_ALL"
object PermissionsMode {
  inline val ALLOW_ALL: "ALLOW_ALL" = "ALLOW_ALL"

  inline def values: js.Array[PermissionsMode] = js.Array(ALLOW_ALL)
}

type S3ObjectEncryptionType = "SSE_KMS" | "SSE_S3" | "NO_ENCRYPTION"
object S3ObjectEncryptionType {
  inline val SSE_KMS: "SSE_KMS" = "SSE_KMS"
  inline val SSE_S3: "SSE_S3" = "SSE_S3"
  inline val NO_ENCRYPTION: "NO_ENCRYPTION" = "NO_ENCRYPTION"

  inline def values: js.Array[S3ObjectEncryptionType] = js.Array(SSE_KMS, SSE_S3, NO_ENCRYPTION)
}

type StreamStatus = "ACTIVE" | "COMPLETED" | "CANCELED" | "FAILED" | "IMPAIRED"
object StreamStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val CANCELED: "CANCELED" = "CANCELED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val IMPAIRED: "IMPAIRED" = "IMPAIRED"

  inline def values: js.Array[StreamStatus] = js.Array(ACTIVE, COMPLETED, CANCELED, FAILED, IMPAIRED)
}
