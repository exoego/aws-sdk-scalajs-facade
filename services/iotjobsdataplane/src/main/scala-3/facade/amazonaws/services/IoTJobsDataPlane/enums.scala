package facade.amazonaws.services.iotjobsdataplane

import scalajs._

type JobExecutionStatus = "QUEUED" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "TIMED_OUT" | "REJECTED" | "REMOVED" | "CANCELED"
object JobExecutionStatus {
  val QUEUED: "QUEUED" = "QUEUED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"
  val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  val REJECTED: "REJECTED" = "REJECTED"
  val REMOVED: "REMOVED" = "REMOVED"
  val CANCELED: "CANCELED" = "CANCELED"

  @inline def values = js.Array[JobExecutionStatus](QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT, REJECTED, REMOVED, CANCELED)
}
