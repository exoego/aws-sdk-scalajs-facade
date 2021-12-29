package facade.amazonaws.services.iotjobsdataplane

import scalajs._

type JobExecutionStatus = "QUEUED" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "TIMED_OUT" | "REJECTED" | "REMOVED" | "CANCELED"
object JobExecutionStatus {
  inline val QUEUED: "QUEUED" = "QUEUED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  inline val REJECTED: "REJECTED" = "REJECTED"
  inline val REMOVED: "REMOVED" = "REMOVED"
  inline val CANCELED: "CANCELED" = "CANCELED"

  inline def values: js.Array[JobExecutionStatus] = js.Array(QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT, REJECTED, REMOVED, CANCELED)
}
