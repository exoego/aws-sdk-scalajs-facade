package facade.amazonaws.services.qldb

import scalajs.js

type EncryptionStatus = "ENABLED" | "UPDATING" | "KMS_KEY_INACCESSIBLE"
object EncryptionStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val KMS_KEY_INACCESSIBLE: "KMS_KEY_INACCESSIBLE" = "KMS_KEY_INACCESSIBLE"

  inline def values: js.Array[EncryptionStatus] = js.Array(ENABLED, UPDATING, KMS_KEY_INACCESSIBLE)
}

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

type OutputFormat = "ION_BINARY" | "ION_TEXT" | "JSON"
object OutputFormat {
  inline val ION_BINARY: "ION_BINARY" = "ION_BINARY"
  inline val ION_TEXT: "ION_TEXT" = "ION_TEXT"
  inline val JSON: "JSON" = "JSON"

  inline def values: js.Array[OutputFormat] = js.Array(ION_BINARY, ION_TEXT, JSON)
}

type PermissionsMode = "ALLOW_ALL" | "STANDARD"
object PermissionsMode {
  inline val ALLOW_ALL: "ALLOW_ALL" = "ALLOW_ALL"
  inline val STANDARD: "STANDARD" = "STANDARD"

  inline def values: js.Array[PermissionsMode] = js.Array(ALLOW_ALL, STANDARD)
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
