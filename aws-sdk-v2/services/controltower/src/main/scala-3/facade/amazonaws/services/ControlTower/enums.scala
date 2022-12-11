package facade.amazonaws.services.controltower

import scalajs.js

type ControlOperationStatus = "SUCCEEDED" | "FAILED" | "IN_PROGRESS"
object ControlOperationStatus {
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"

  inline def values: js.Array[ControlOperationStatus] = js.Array(SUCCEEDED, FAILED, IN_PROGRESS)
}

type ControlOperationType = "ENABLE_CONTROL" | "DISABLE_CONTROL"
object ControlOperationType {
  inline val ENABLE_CONTROL: "ENABLE_CONTROL" = "ENABLE_CONTROL"
  inline val DISABLE_CONTROL: "DISABLE_CONTROL" = "DISABLE_CONTROL"

  inline def values: js.Array[ControlOperationType] = js.Array(ENABLE_CONTROL, DISABLE_CONTROL)
}
