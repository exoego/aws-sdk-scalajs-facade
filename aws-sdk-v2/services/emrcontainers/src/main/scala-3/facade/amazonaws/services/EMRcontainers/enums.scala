package facade.amazonaws.services.emrcontainers

import scalajs.js

type ContainerProviderType = "EKS"
object ContainerProviderType {
  inline val EKS: "EKS" = "EKS"

  inline def values: js.Array[ContainerProviderType] = js.Array(EKS)
}

type EndpointState = "CREATING" | "ACTIVE" | "TERMINATING" | "TERMINATED" | "TERMINATED_WITH_ERRORS"
object EndpointState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val TERMINATING: "TERMINATING" = "TERMINATING"
  inline val TERMINATED: "TERMINATED" = "TERMINATED"
  inline val TERMINATED_WITH_ERRORS: "TERMINATED_WITH_ERRORS" = "TERMINATED_WITH_ERRORS"

  inline def values: js.Array[EndpointState] = js.Array(CREATING, ACTIVE, TERMINATING, TERMINATED, TERMINATED_WITH_ERRORS)
}

type FailureReason = "INTERNAL_ERROR" | "USER_ERROR" | "VALIDATION_ERROR" | "CLUSTER_UNAVAILABLE"
object FailureReason {
  inline val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  inline val USER_ERROR: "USER_ERROR" = "USER_ERROR"
  inline val VALIDATION_ERROR: "VALIDATION_ERROR" = "VALIDATION_ERROR"
  inline val CLUSTER_UNAVAILABLE: "CLUSTER_UNAVAILABLE" = "CLUSTER_UNAVAILABLE"

  inline def values: js.Array[FailureReason] = js.Array(INTERNAL_ERROR, USER_ERROR, VALIDATION_ERROR, CLUSTER_UNAVAILABLE)
}

type JobRunState = "PENDING" | "SUBMITTED" | "RUNNING" | "FAILED" | "CANCELLED" | "CANCEL_PENDING" | "COMPLETED"
object JobRunState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val CANCEL_PENDING: "CANCEL_PENDING" = "CANCEL_PENDING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"

  inline def values: js.Array[JobRunState] = js.Array(PENDING, SUBMITTED, RUNNING, FAILED, CANCELLED, CANCEL_PENDING, COMPLETED)
}

type PersistentAppUI = "ENABLED" | "DISABLED"
object PersistentAppUI {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[PersistentAppUI] = js.Array(ENABLED, DISABLED)
}

type VirtualClusterState = "RUNNING" | "TERMINATING" | "TERMINATED" | "ARRESTED"
object VirtualClusterState {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val TERMINATING: "TERMINATING" = "TERMINATING"
  inline val TERMINATED: "TERMINATED" = "TERMINATED"
  inline val ARRESTED: "ARRESTED" = "ARRESTED"

  inline def values: js.Array[VirtualClusterState] = js.Array(RUNNING, TERMINATING, TERMINATED, ARRESTED)
}
