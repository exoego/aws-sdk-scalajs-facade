package facade.amazonaws.services.qldb

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ErrorCause extends js.Any
object ErrorCause {
  val KINESIS_STREAM_NOT_FOUND = "KINESIS_STREAM_NOT_FOUND".asInstanceOf[ErrorCause]
  val IAM_PERMISSION_REVOKED = "IAM_PERMISSION_REVOKED".asInstanceOf[ErrorCause]

  @inline def values = js.Array(KINESIS_STREAM_NOT_FOUND, IAM_PERMISSION_REVOKED)
}

@js.native
sealed trait ExportStatus extends js.Any
object ExportStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ExportStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[ExportStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[ExportStatus]

  @inline def values = js.Array(IN_PROGRESS, COMPLETED, CANCELLED)
}

@js.native
sealed trait LedgerState extends js.Any
object LedgerState {
  val CREATING = "CREATING".asInstanceOf[LedgerState]
  val ACTIVE = "ACTIVE".asInstanceOf[LedgerState]
  val DELETING = "DELETING".asInstanceOf[LedgerState]
  val DELETED = "DELETED".asInstanceOf[LedgerState]

  @inline def values = js.Array(CREATING, ACTIVE, DELETING, DELETED)
}

@js.native
sealed trait PermissionsMode extends js.Any
object PermissionsMode {
  val ALLOW_ALL = "ALLOW_ALL".asInstanceOf[PermissionsMode]

  @inline def values = js.Array(ALLOW_ALL)
}

@js.native
sealed trait S3ObjectEncryptionType extends js.Any
object S3ObjectEncryptionType {
  val SSE_KMS = "SSE_KMS".asInstanceOf[S3ObjectEncryptionType]
  val SSE_S3 = "SSE_S3".asInstanceOf[S3ObjectEncryptionType]
  val NO_ENCRYPTION = "NO_ENCRYPTION".asInstanceOf[S3ObjectEncryptionType]

  @inline def values = js.Array(SSE_KMS, SSE_S3, NO_ENCRYPTION)
}

@js.native
sealed trait StreamStatus extends js.Any
object StreamStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[StreamStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[StreamStatus]
  val CANCELED = "CANCELED".asInstanceOf[StreamStatus]
  val FAILED = "FAILED".asInstanceOf[StreamStatus]
  val IMPAIRED = "IMPAIRED".asInstanceOf[StreamStatus]

  @inline def values = js.Array(ACTIVE, COMPLETED, CANCELED, FAILED, IMPAIRED)
}
