package facade.amazonaws.services.qldb

import scalajs._

type ErrorCause = "KINESIS_STREAM_NOT_FOUND" | "IAM_PERMISSION_REVOKED"
object ErrorCause {
  val KINESIS_STREAM_NOT_FOUND: "KINESIS_STREAM_NOT_FOUND" = "KINESIS_STREAM_NOT_FOUND"
  val IAM_PERMISSION_REVOKED: "IAM_PERMISSION_REVOKED" = "IAM_PERMISSION_REVOKED"

  @inline def values = js.Array[ErrorCause](KINESIS_STREAM_NOT_FOUND, IAM_PERMISSION_REVOKED)
}

type ExportStatus = "IN_PROGRESS" | "COMPLETED" | "CANCELLED"
object ExportStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val CANCELLED: "CANCELLED" = "CANCELLED"

  @inline def values = js.Array[ExportStatus](IN_PROGRESS, COMPLETED, CANCELLED)
}

type LedgerState = "CREATING" | "ACTIVE" | "DELETING" | "DELETED"
object LedgerState {
  val CREATING: "CREATING" = "CREATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[LedgerState](CREATING, ACTIVE, DELETING, DELETED)
}

type PermissionsMode = "ALLOW_ALL"
object PermissionsMode {
  val ALLOW_ALL: "ALLOW_ALL" = "ALLOW_ALL"

  @inline def values = js.Array[PermissionsMode](ALLOW_ALL)
}

type S3ObjectEncryptionType = "SSE_KMS" | "SSE_S3" | "NO_ENCRYPTION"
object S3ObjectEncryptionType {
  val SSE_KMS: "SSE_KMS" = "SSE_KMS"
  val SSE_S3: "SSE_S3" = "SSE_S3"
  val NO_ENCRYPTION: "NO_ENCRYPTION" = "NO_ENCRYPTION"

  @inline def values = js.Array[S3ObjectEncryptionType](SSE_KMS, SSE_S3, NO_ENCRYPTION)
}

type StreamStatus = "ACTIVE" | "COMPLETED" | "CANCELED" | "FAILED" | "IMPAIRED"
object StreamStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val CANCELED: "CANCELED" = "CANCELED"
  val FAILED: "FAILED" = "FAILED"
  val IMPAIRED: "IMPAIRED" = "IMPAIRED"

  @inline def values = js.Array[StreamStatus](ACTIVE, COMPLETED, CANCELED, FAILED, IMPAIRED)
}
