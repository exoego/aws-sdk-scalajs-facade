package facade.amazonaws.services.qldb

import scalajs.js

@js.native
sealed trait EncryptionStatus extends js.Any
object EncryptionStatus {
  val ENABLED = "ENABLED".asInstanceOf[EncryptionStatus]
  val UPDATING = "UPDATING".asInstanceOf[EncryptionStatus]
  val KMS_KEY_INACCESSIBLE = "KMS_KEY_INACCESSIBLE".asInstanceOf[EncryptionStatus]

  @inline def values: js.Array[EncryptionStatus] = js.Array(ENABLED, UPDATING, KMS_KEY_INACCESSIBLE)
}

@js.native
sealed trait ErrorCause extends js.Any
object ErrorCause {
  val KINESIS_STREAM_NOT_FOUND = "KINESIS_STREAM_NOT_FOUND".asInstanceOf[ErrorCause]
  val IAM_PERMISSION_REVOKED = "IAM_PERMISSION_REVOKED".asInstanceOf[ErrorCause]

  @inline def values: js.Array[ErrorCause] = js.Array(KINESIS_STREAM_NOT_FOUND, IAM_PERMISSION_REVOKED)
}

@js.native
sealed trait ExportStatus extends js.Any
object ExportStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ExportStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[ExportStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[ExportStatus]

  @inline def values: js.Array[ExportStatus] = js.Array(IN_PROGRESS, COMPLETED, CANCELLED)
}

@js.native
sealed trait LedgerState extends js.Any
object LedgerState {
  val CREATING = "CREATING".asInstanceOf[LedgerState]
  val ACTIVE = "ACTIVE".asInstanceOf[LedgerState]
  val DELETING = "DELETING".asInstanceOf[LedgerState]
  val DELETED = "DELETED".asInstanceOf[LedgerState]

  @inline def values: js.Array[LedgerState] = js.Array(CREATING, ACTIVE, DELETING, DELETED)
}

@js.native
sealed trait OutputFormat extends js.Any
object OutputFormat {
  val ION_BINARY = "ION_BINARY".asInstanceOf[OutputFormat]
  val ION_TEXT = "ION_TEXT".asInstanceOf[OutputFormat]
  val JSON = "JSON".asInstanceOf[OutputFormat]

  @inline def values: js.Array[OutputFormat] = js.Array(ION_BINARY, ION_TEXT, JSON)
}

@js.native
sealed trait PermissionsMode extends js.Any
object PermissionsMode {
  val ALLOW_ALL = "ALLOW_ALL".asInstanceOf[PermissionsMode]
  val STANDARD = "STANDARD".asInstanceOf[PermissionsMode]

  @inline def values: js.Array[PermissionsMode] = js.Array(ALLOW_ALL, STANDARD)
}

@js.native
sealed trait S3ObjectEncryptionType extends js.Any
object S3ObjectEncryptionType {
  val SSE_KMS = "SSE_KMS".asInstanceOf[S3ObjectEncryptionType]
  val SSE_S3 = "SSE_S3".asInstanceOf[S3ObjectEncryptionType]
  val NO_ENCRYPTION = "NO_ENCRYPTION".asInstanceOf[S3ObjectEncryptionType]

  @inline def values: js.Array[S3ObjectEncryptionType] = js.Array(SSE_KMS, SSE_S3, NO_ENCRYPTION)
}

@js.native
sealed trait StreamStatus extends js.Any
object StreamStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[StreamStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[StreamStatus]
  val CANCELED = "CANCELED".asInstanceOf[StreamStatus]
  val FAILED = "FAILED".asInstanceOf[StreamStatus]
  val IMPAIRED = "IMPAIRED".asInstanceOf[StreamStatus]

  @inline def values: js.Array[StreamStatus] = js.Array(ACTIVE, COMPLETED, CANCELED, FAILED, IMPAIRED)
}
