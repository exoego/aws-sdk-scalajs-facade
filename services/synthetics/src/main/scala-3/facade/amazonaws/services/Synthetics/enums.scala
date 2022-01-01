package facade.amazonaws.services.synthetics

import scalajs.js

type CanaryRunState = "RUNNING" | "PASSED" | "FAILED"
object CanaryRunState {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val PASSED: "PASSED" = "PASSED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[CanaryRunState] = js.Array(RUNNING, PASSED, FAILED)
}

type CanaryRunStateReasonCode = "CANARY_FAILURE" | "EXECUTION_FAILURE"
object CanaryRunStateReasonCode {
  inline val CANARY_FAILURE: "CANARY_FAILURE" = "CANARY_FAILURE"
  inline val EXECUTION_FAILURE: "EXECUTION_FAILURE" = "EXECUTION_FAILURE"

  inline def values: js.Array[CanaryRunStateReasonCode] = js.Array(CANARY_FAILURE, EXECUTION_FAILURE)
}

type CanaryState = "CREATING" | "READY" | "STARTING" | "RUNNING" | "UPDATING" | "STOPPING" | "STOPPED" | "ERROR" | "DELETING"
object CanaryState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val READY: "READY" = "READY"
  inline val STARTING: "STARTING" = "STARTING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val ERROR: "ERROR" = "ERROR"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[CanaryState] = js.Array(CREATING, READY, STARTING, RUNNING, UPDATING, STOPPING, STOPPED, ERROR, DELETING)
}

type CanaryStateReasonCode = "INVALID_PERMISSIONS"
object CanaryStateReasonCode {
  inline val INVALID_PERMISSIONS: "INVALID_PERMISSIONS" = "INVALID_PERMISSIONS"

  inline def values: js.Array[CanaryStateReasonCode] = js.Array(INVALID_PERMISSIONS)
}

type EncryptionMode = "SSE_S3" | "SSE_KMS"
object EncryptionMode {
  inline val SSE_S3: "SSE_S3" = "SSE_S3"
  inline val SSE_KMS: "SSE_KMS" = "SSE_KMS"

  inline def values: js.Array[EncryptionMode] = js.Array(SSE_S3, SSE_KMS)
}
