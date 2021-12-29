package facade.amazonaws.services.braket

import scalajs._

type CancellationStatus = "CANCELLING" | "CANCELLED"
object CancellationStatus {
  inline val CANCELLING: "CANCELLING" = "CANCELLING"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"

  inline def values: js.Array[CancellationStatus] = js.Array(CANCELLING, CANCELLED)
}

type DeviceStatus = "ONLINE" | "OFFLINE"
object DeviceStatus {
  inline val ONLINE: "ONLINE" = "ONLINE"
  inline val OFFLINE: "OFFLINE" = "OFFLINE"

  inline def values: js.Array[DeviceStatus] = js.Array(ONLINE, OFFLINE)
}

type DeviceType = "QPU" | "SIMULATOR"
object DeviceType {
  inline val QPU: "QPU" = "QPU"
  inline val SIMULATOR: "SIMULATOR" = "SIMULATOR"

  inline def values: js.Array[DeviceType] = js.Array(QPU, SIMULATOR)
}

type QuantumTaskStatus = "CREATED" | "QUEUED" | "RUNNING" | "COMPLETED" | "FAILED" | "CANCELLING" | "CANCELLED"
object QuantumTaskStatus {
  inline val CREATED: "CREATED" = "CREATED"
  inline val QUEUED: "QUEUED" = "QUEUED"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val CANCELLING: "CANCELLING" = "CANCELLING"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"

  inline def values: js.Array[QuantumTaskStatus] = js.Array(CREATED, QUEUED, RUNNING, COMPLETED, FAILED, CANCELLING, CANCELLED)
}

type SearchQuantumTasksFilterOperator = "LT" | "LTE" | "EQUAL" | "GT" | "GTE" | "BETWEEN"
object SearchQuantumTasksFilterOperator {
  inline val LT: "LT" = "LT"
  inline val LTE: "LTE" = "LTE"
  inline val EQUAL: "EQUAL" = "EQUAL"
  inline val GT: "GT" = "GT"
  inline val GTE: "GTE" = "GTE"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"

  inline def values: js.Array[SearchQuantumTasksFilterOperator] = js.Array(LT, LTE, EQUAL, GT, GTE, BETWEEN)
}
