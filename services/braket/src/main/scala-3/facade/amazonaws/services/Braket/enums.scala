package facade.amazonaws.services.braket

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait CancellationStatus extends js.Any
object CancellationStatus {
  val CANCELLING = "CANCELLING".asInstanceOf[CancellationStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[CancellationStatus]

  @inline def values = js.Array(CANCELLING, CANCELLED)
}

@js.native
sealed trait DeviceStatus extends js.Any
object DeviceStatus {
  val ONLINE = "ONLINE".asInstanceOf[DeviceStatus]
  val OFFLINE = "OFFLINE".asInstanceOf[DeviceStatus]

  @inline def values = js.Array(ONLINE, OFFLINE)
}

@js.native
sealed trait DeviceType extends js.Any
object DeviceType {
  val QPU = "QPU".asInstanceOf[DeviceType]
  val SIMULATOR = "SIMULATOR".asInstanceOf[DeviceType]

  @inline def values = js.Array(QPU, SIMULATOR)
}

@js.native
sealed trait QuantumTaskStatus extends js.Any
object QuantumTaskStatus {
  val CREATED = "CREATED".asInstanceOf[QuantumTaskStatus]
  val QUEUED = "QUEUED".asInstanceOf[QuantumTaskStatus]
  val RUNNING = "RUNNING".asInstanceOf[QuantumTaskStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[QuantumTaskStatus]
  val FAILED = "FAILED".asInstanceOf[QuantumTaskStatus]
  val CANCELLING = "CANCELLING".asInstanceOf[QuantumTaskStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[QuantumTaskStatus]

  @inline def values = js.Array(CREATED, QUEUED, RUNNING, COMPLETED, FAILED, CANCELLING, CANCELLED)
}

@js.native
sealed trait SearchQuantumTasksFilterOperator extends js.Any
object SearchQuantumTasksFilterOperator {
  val LT = "LT".asInstanceOf[SearchQuantumTasksFilterOperator]
  val LTE = "LTE".asInstanceOf[SearchQuantumTasksFilterOperator]
  val EQUAL = "EQUAL".asInstanceOf[SearchQuantumTasksFilterOperator]
  val GT = "GT".asInstanceOf[SearchQuantumTasksFilterOperator]
  val GTE = "GTE".asInstanceOf[SearchQuantumTasksFilterOperator]
  val BETWEEN = "BETWEEN".asInstanceOf[SearchQuantumTasksFilterOperator]

  @inline def values = js.Array(LT, LTE, EQUAL, GT, GTE, BETWEEN)
}
