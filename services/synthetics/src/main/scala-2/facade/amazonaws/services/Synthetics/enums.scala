package facade.amazonaws.services.synthetics

import scalajs.js

@js.native
sealed trait CanaryRunState extends js.Any
object CanaryRunState {
  val RUNNING = "RUNNING".asInstanceOf[CanaryRunState]
  val PASSED = "PASSED".asInstanceOf[CanaryRunState]
  val FAILED = "FAILED".asInstanceOf[CanaryRunState]

  @inline def values: js.Array[CanaryRunState] = js.Array(RUNNING, PASSED, FAILED)
}

@js.native
sealed trait CanaryRunStateReasonCode extends js.Any
object CanaryRunStateReasonCode {
  val CANARY_FAILURE = "CANARY_FAILURE".asInstanceOf[CanaryRunStateReasonCode]
  val EXECUTION_FAILURE = "EXECUTION_FAILURE".asInstanceOf[CanaryRunStateReasonCode]

  @inline def values: js.Array[CanaryRunStateReasonCode] = js.Array(CANARY_FAILURE, EXECUTION_FAILURE)
}

@js.native
sealed trait CanaryState extends js.Any
object CanaryState {
  val CREATING = "CREATING".asInstanceOf[CanaryState]
  val READY = "READY".asInstanceOf[CanaryState]
  val STARTING = "STARTING".asInstanceOf[CanaryState]
  val RUNNING = "RUNNING".asInstanceOf[CanaryState]
  val UPDATING = "UPDATING".asInstanceOf[CanaryState]
  val STOPPING = "STOPPING".asInstanceOf[CanaryState]
  val STOPPED = "STOPPED".asInstanceOf[CanaryState]
  val ERROR = "ERROR".asInstanceOf[CanaryState]
  val DELETING = "DELETING".asInstanceOf[CanaryState]

  @inline def values: js.Array[CanaryState] = js.Array(CREATING, READY, STARTING, RUNNING, UPDATING, STOPPING, STOPPED, ERROR, DELETING)
}

@js.native
sealed trait CanaryStateReasonCode extends js.Any
object CanaryStateReasonCode {
  val INVALID_PERMISSIONS = "INVALID_PERMISSIONS".asInstanceOf[CanaryStateReasonCode]

  @inline def values: js.Array[CanaryStateReasonCode] = js.Array(INVALID_PERMISSIONS)
}
