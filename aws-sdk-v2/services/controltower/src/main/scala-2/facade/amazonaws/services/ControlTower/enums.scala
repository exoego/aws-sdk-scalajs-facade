package facade.amazonaws.services.controltower

import scalajs.js

@js.native
sealed trait ControlOperationStatus extends js.Any
object ControlOperationStatus {
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[ControlOperationStatus]
  val FAILED = "FAILED".asInstanceOf[ControlOperationStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ControlOperationStatus]

  @inline def values: js.Array[ControlOperationStatus] = js.Array(SUCCEEDED, FAILED, IN_PROGRESS)
}

@js.native
sealed trait ControlOperationType extends js.Any
object ControlOperationType {
  val ENABLE_CONTROL = "ENABLE_CONTROL".asInstanceOf[ControlOperationType]
  val DISABLE_CONTROL = "DISABLE_CONTROL".asInstanceOf[ControlOperationType]

  @inline def values: js.Array[ControlOperationType] = js.Array(ENABLE_CONTROL, DISABLE_CONTROL)
}
