package facade.amazonaws.services.fis

import scalajs._

type ExperimentActionStatus = "pending" | "initiating" | "running" | "completed" | "cancelled" | "stopping" | "stopped" | "failed"
object ExperimentActionStatus {
  inline val pending: "pending" = "pending"
  inline val initiating: "initiating" = "initiating"
  inline val running: "running" = "running"
  inline val completed: "completed" = "completed"
  inline val cancelled: "cancelled" = "cancelled"
  inline val stopping: "stopping" = "stopping"
  inline val stopped: "stopped" = "stopped"
  inline val failed: "failed" = "failed"

  inline def values: js.Array[ExperimentActionStatus] = js.Array(pending, initiating, running, completed, cancelled, stopping, stopped, failed)
}

type ExperimentStatus = "pending" | "initiating" | "running" | "completed" | "stopping" | "stopped" | "failed"
object ExperimentStatus {
  inline val pending: "pending" = "pending"
  inline val initiating: "initiating" = "initiating"
  inline val running: "running" = "running"
  inline val completed: "completed" = "completed"
  inline val stopping: "stopping" = "stopping"
  inline val stopped: "stopped" = "stopped"
  inline val failed: "failed" = "failed"

  inline def values: js.Array[ExperimentStatus] = js.Array(pending, initiating, running, completed, stopping, stopped, failed)
}
