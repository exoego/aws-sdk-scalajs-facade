package facade.amazonaws.services.iotjobsdataplane

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait JobExecutionStatus extends js.Any
object JobExecutionStatus {
  val QUEUED = "QUEUED".asInstanceOf[JobExecutionStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobExecutionStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[JobExecutionStatus]
  val FAILED = "FAILED".asInstanceOf[JobExecutionStatus]
  val TIMED_OUT = "TIMED_OUT".asInstanceOf[JobExecutionStatus]
  val REJECTED = "REJECTED".asInstanceOf[JobExecutionStatus]
  val REMOVED = "REMOVED".asInstanceOf[JobExecutionStatus]
  val CANCELED = "CANCELED".asInstanceOf[JobExecutionStatus]

  @inline def values = js.Array(QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT, REJECTED, REMOVED, CANCELED)
}
