package facade.amazonaws.services.braket

import scalajs._

type CancellationStatus = "CANCELLING" | "CANCELLED"
object CancellationStatus {
  val CANCELLING: "CANCELLING" = "CANCELLING"
  val CANCELLED: "CANCELLED" = "CANCELLED"

  @inline def values = js.Array[CancellationStatus](CANCELLING, CANCELLED)
}

type DeviceStatus = "ONLINE" | "OFFLINE"
object DeviceStatus {
  val ONLINE: "ONLINE" = "ONLINE"
  val OFFLINE: "OFFLINE" = "OFFLINE"

  @inline def values = js.Array[DeviceStatus](ONLINE, OFFLINE)
}

type DeviceType = "QPU" | "SIMULATOR"
object DeviceType {
  val QPU: "QPU" = "QPU"
  val SIMULATOR: "SIMULATOR" = "SIMULATOR"

  @inline def values = js.Array[DeviceType](QPU, SIMULATOR)
}

type QuantumTaskStatus = "CREATED" | "QUEUED" | "RUNNING" | "COMPLETED" | "FAILED" | "CANCELLING" | "CANCELLED"
object QuantumTaskStatus {
  val CREATED: "CREATED" = "CREATED"
  val QUEUED: "QUEUED" = "QUEUED"
  val RUNNING: "RUNNING" = "RUNNING"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"
  val CANCELLING: "CANCELLING" = "CANCELLING"
  val CANCELLED: "CANCELLED" = "CANCELLED"

  @inline def values = js.Array[QuantumTaskStatus](CREATED, QUEUED, RUNNING, COMPLETED, FAILED, CANCELLING, CANCELLED)
}

type SearchQuantumTasksFilterOperator = "LT" | "LTE" | "EQUAL" | "GT" | "GTE" | "BETWEEN"
object SearchQuantumTasksFilterOperator {
  val LT: "LT" = "LT"
  val LTE: "LTE" = "LTE"
  val EQUAL: "EQUAL" = "EQUAL"
  val GT: "GT" = "GT"
  val GTE: "GTE" = "GTE"
  val BETWEEN: "BETWEEN" = "BETWEEN"

  @inline def values = js.Array[SearchQuantumTasksFilterOperator](LT, LTE, EQUAL, GT, GTE, BETWEEN)
}
