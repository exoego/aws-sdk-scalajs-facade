package facade.amazonaws.services.translate

import scalajs._

type EncryptionKeyType = "KMS"
object EncryptionKeyType {
  val KMS: "KMS" = "KMS"

  @inline def values = js.Array[EncryptionKeyType](KMS)
}

type JobStatus = "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "COMPLETED_WITH_ERROR" | "FAILED" | "STOP_REQUESTED" | "STOPPED"
object JobStatus {
  val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val COMPLETED_WITH_ERROR: "COMPLETED_WITH_ERROR" = "COMPLETED_WITH_ERROR"
  val FAILED: "FAILED" = "FAILED"
  val STOP_REQUESTED: "STOP_REQUESTED" = "STOP_REQUESTED"
  val STOPPED: "STOPPED" = "STOPPED"

  @inline def values = js.Array[JobStatus](SUBMITTED, IN_PROGRESS, COMPLETED, COMPLETED_WITH_ERROR, FAILED, STOP_REQUESTED, STOPPED)
}

type MergeStrategy = "OVERWRITE"
object MergeStrategy {
  val OVERWRITE: "OVERWRITE" = "OVERWRITE"

  @inline def values = js.Array[MergeStrategy](OVERWRITE)
}

type ParallelDataFormat = "TSV" | "CSV" | "TMX"
object ParallelDataFormat {
  val TSV: "TSV" = "TSV"
  val CSV: "CSV" = "CSV"
  val TMX: "TMX" = "TMX"

  @inline def values = js.Array[ParallelDataFormat](TSV, CSV, TMX)
}

type ParallelDataStatus = "CREATING" | "UPDATING" | "ACTIVE" | "DELETING" | "FAILED"
object ParallelDataStatus {
  val CREATING: "CREATING" = "CREATING"
  val UPDATING: "UPDATING" = "UPDATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[ParallelDataStatus](CREATING, UPDATING, ACTIVE, DELETING, FAILED)
}

type TerminologyDataFormat = "CSV" | "TMX"
object TerminologyDataFormat {
  val CSV: "CSV" = "CSV"
  val TMX: "TMX" = "TMX"

  @inline def values = js.Array[TerminologyDataFormat](CSV, TMX)
}
