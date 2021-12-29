package facade.amazonaws.services.fis

import scalajs._

type ExperimentActionStatus = "pending" | "initiating" | "running" | "completed" | "cancelled" | "stopping" | "stopped" | "failed"
object ExperimentActionStatus {
  val pending: "pending" = "pending"
  val initiating: "initiating" = "initiating"
  val running: "running" = "running"
  val completed: "completed" = "completed"
  val cancelled: "cancelled" = "cancelled"
  val stopping: "stopping" = "stopping"
  val stopped: "stopped" = "stopped"
  val failed: "failed" = "failed"

  @inline def values = js.Array[ExperimentActionStatus](pending, initiating, running, completed, cancelled, stopping, stopped, failed)
}

type ExperimentStatus = "pending" | "initiating" | "running" | "completed" | "stopping" | "stopped" | "failed"
object ExperimentStatus {
  val pending: "pending" = "pending"
  val initiating: "initiating" = "initiating"
  val running: "running" = "running"
  val completed: "completed" = "completed"
  val stopping: "stopping" = "stopping"
  val stopped: "stopped" = "stopped"
  val failed: "failed" = "failed"

  @inline def values = js.Array[ExperimentStatus](pending, initiating, running, completed, stopping, stopped, failed)
}
