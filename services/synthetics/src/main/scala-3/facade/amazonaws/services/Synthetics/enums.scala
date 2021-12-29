package facade.amazonaws.services.synthetics

import scalajs._

type CanaryRunState = "RUNNING" | "PASSED" | "FAILED"
object CanaryRunState {
  val RUNNING: "RUNNING" = "RUNNING"
  val PASSED: "PASSED" = "PASSED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[CanaryRunState](RUNNING, PASSED, FAILED)
}

type CanaryRunStateReasonCode = "CANARY_FAILURE" | "EXECUTION_FAILURE"
object CanaryRunStateReasonCode {
  val CANARY_FAILURE: "CANARY_FAILURE" = "CANARY_FAILURE"
  val EXECUTION_FAILURE: "EXECUTION_FAILURE" = "EXECUTION_FAILURE"

  @inline def values = js.Array[CanaryRunStateReasonCode](CANARY_FAILURE, EXECUTION_FAILURE)
}

type CanaryState = "CREATING" | "READY" | "STARTING" | "RUNNING" | "UPDATING" | "STOPPING" | "STOPPED" | "ERROR" | "DELETING"
object CanaryState {
  val CREATING: "CREATING" = "CREATING"
  val READY: "READY" = "READY"
  val STARTING: "STARTING" = "STARTING"
  val RUNNING: "RUNNING" = "RUNNING"
  val UPDATING: "UPDATING" = "UPDATING"
  val STOPPING: "STOPPING" = "STOPPING"
  val STOPPED: "STOPPED" = "STOPPED"
  val ERROR: "ERROR" = "ERROR"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[CanaryState](CREATING, READY, STARTING, RUNNING, UPDATING, STOPPING, STOPPED, ERROR, DELETING)
}

type CanaryStateReasonCode = "INVALID_PERMISSIONS"
object CanaryStateReasonCode {
  val INVALID_PERMISSIONS: "INVALID_PERMISSIONS" = "INVALID_PERMISSIONS"

  @inline def values = js.Array[CanaryStateReasonCode](INVALID_PERMISSIONS)
}
