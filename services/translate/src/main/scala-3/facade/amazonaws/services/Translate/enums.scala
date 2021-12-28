package facade.amazonaws.services.translate

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait EncryptionKeyType extends js.Any
object EncryptionKeyType {
  val KMS = "KMS".asInstanceOf[EncryptionKeyType]

  @inline def values = js.Array(KMS)
}

@js.native
sealed trait JobStatus extends js.Any
object JobStatus {
  val SUBMITTED = "SUBMITTED".asInstanceOf[JobStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[JobStatus]
  val COMPLETED_WITH_ERROR = "COMPLETED_WITH_ERROR".asInstanceOf[JobStatus]
  val FAILED = "FAILED".asInstanceOf[JobStatus]
  val STOP_REQUESTED = "STOP_REQUESTED".asInstanceOf[JobStatus]
  val STOPPED = "STOPPED".asInstanceOf[JobStatus]

  @inline def values = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, COMPLETED_WITH_ERROR, FAILED, STOP_REQUESTED, STOPPED)
}

@js.native
sealed trait MergeStrategy extends js.Any
object MergeStrategy {
  val OVERWRITE = "OVERWRITE".asInstanceOf[MergeStrategy]

  @inline def values = js.Array(OVERWRITE)
}

@js.native
sealed trait ParallelDataFormat extends js.Any
object ParallelDataFormat {
  val TSV = "TSV".asInstanceOf[ParallelDataFormat]
  val CSV = "CSV".asInstanceOf[ParallelDataFormat]
  val TMX = "TMX".asInstanceOf[ParallelDataFormat]

  @inline def values = js.Array(TSV, CSV, TMX)
}

@js.native
sealed trait ParallelDataStatus extends js.Any
object ParallelDataStatus {
  val CREATING = "CREATING".asInstanceOf[ParallelDataStatus]
  val UPDATING = "UPDATING".asInstanceOf[ParallelDataStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[ParallelDataStatus]
  val DELETING = "DELETING".asInstanceOf[ParallelDataStatus]
  val FAILED = "FAILED".asInstanceOf[ParallelDataStatus]

  @inline def values = js.Array(CREATING, UPDATING, ACTIVE, DELETING, FAILED)
}

@js.native
sealed trait TerminologyDataFormat extends js.Any
object TerminologyDataFormat {
  val CSV = "CSV".asInstanceOf[TerminologyDataFormat]
  val TMX = "TMX".asInstanceOf[TerminologyDataFormat]

  @inline def values = js.Array(CSV, TMX)
}
