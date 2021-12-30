package facade.amazonaws.services.translate

import scalajs.js

type EncryptionKeyType = "KMS"
object EncryptionKeyType {
  inline val KMS: "KMS" = "KMS"

  inline def values: js.Array[EncryptionKeyType] = js.Array(KMS)
}

type JobStatus = "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "COMPLETED_WITH_ERROR" | "FAILED" | "STOP_REQUESTED" | "STOPPED"
object JobStatus {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val COMPLETED_WITH_ERROR: "COMPLETED_WITH_ERROR" = "COMPLETED_WITH_ERROR"
  inline val FAILED: "FAILED" = "FAILED"
  inline val STOP_REQUESTED: "STOP_REQUESTED" = "STOP_REQUESTED"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[JobStatus] = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, COMPLETED_WITH_ERROR, FAILED, STOP_REQUESTED, STOPPED)
}

type MergeStrategy = "OVERWRITE"
object MergeStrategy {
  inline val OVERWRITE: "OVERWRITE" = "OVERWRITE"

  inline def values: js.Array[MergeStrategy] = js.Array(OVERWRITE)
}

type ParallelDataFormat = "TSV" | "CSV" | "TMX"
object ParallelDataFormat {
  inline val TSV: "TSV" = "TSV"
  inline val CSV: "CSV" = "CSV"
  inline val TMX: "TMX" = "TMX"

  inline def values: js.Array[ParallelDataFormat] = js.Array(TSV, CSV, TMX)
}

type ParallelDataStatus = "CREATING" | "UPDATING" | "ACTIVE" | "DELETING" | "FAILED"
object ParallelDataStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ParallelDataStatus] = js.Array(CREATING, UPDATING, ACTIVE, DELETING, FAILED)
}

type TerminologyDataFormat = "CSV" | "TMX"
object TerminologyDataFormat {
  inline val CSV: "CSV" = "CSV"
  inline val TMX: "TMX" = "TMX"

  inline def values: js.Array[TerminologyDataFormat] = js.Array(CSV, TMX)
}
