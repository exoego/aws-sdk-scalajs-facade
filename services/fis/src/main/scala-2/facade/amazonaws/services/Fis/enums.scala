package facade.amazonaws.services.fis

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ExperimentActionStatus extends js.Any
object ExperimentActionStatus {
  val pending = "pending".asInstanceOf[ExperimentActionStatus]
  val initiating = "initiating".asInstanceOf[ExperimentActionStatus]
  val running = "running".asInstanceOf[ExperimentActionStatus]
  val completed = "completed".asInstanceOf[ExperimentActionStatus]
  val cancelled = "cancelled".asInstanceOf[ExperimentActionStatus]
  val stopping = "stopping".asInstanceOf[ExperimentActionStatus]
  val stopped = "stopped".asInstanceOf[ExperimentActionStatus]
  val failed = "failed".asInstanceOf[ExperimentActionStatus]

  @inline def values = js.Array(pending, initiating, running, completed, cancelled, stopping, stopped, failed)
}

@js.native
sealed trait ExperimentStatus extends js.Any
object ExperimentStatus {
  val pending = "pending".asInstanceOf[ExperimentStatus]
  val initiating = "initiating".asInstanceOf[ExperimentStatus]
  val running = "running".asInstanceOf[ExperimentStatus]
  val completed = "completed".asInstanceOf[ExperimentStatus]
  val stopping = "stopping".asInstanceOf[ExperimentStatus]
  val stopped = "stopped".asInstanceOf[ExperimentStatus]
  val failed = "failed".asInstanceOf[ExperimentStatus]

  @inline def values = js.Array(pending, initiating, running, completed, stopping, stopped, failed)
}
