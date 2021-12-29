package facade.amazonaws.services.efs

import scalajs._

type LifeCycleState = "creating" | "available" | "updating" | "deleting" | "deleted" | "error"
object LifeCycleState {
  val creating: "creating" = "creating"
  val available: "available" = "available"
  val updating: "updating" = "updating"
  val deleting: "deleting" = "deleting"
  val deleted: "deleted" = "deleted"
  val error: "error" = "error"

  @inline def values = js.Array[LifeCycleState](creating, available, updating, deleting, deleted, error)
}

type PerformanceMode = "generalPurpose" | "maxIO"
object PerformanceMode {
  val generalPurpose: "generalPurpose" = "generalPurpose"
  val maxIO: "maxIO" = "maxIO"

  @inline def values = js.Array[PerformanceMode](generalPurpose, maxIO)
}

type Status = "ENABLED" | "ENABLING" | "DISABLED" | "DISABLING"
object Status {
  val ENABLED: "ENABLED" = "ENABLED"
  val ENABLING: "ENABLING" = "ENABLING"
  val DISABLED: "DISABLED" = "DISABLED"
  val DISABLING: "DISABLING" = "DISABLING"

  @inline def values = js.Array[Status](ENABLED, ENABLING, DISABLED, DISABLING)
}

type ThroughputMode = "bursting" | "provisioned"
object ThroughputMode {
  val bursting: "bursting" = "bursting"
  val provisioned: "provisioned" = "provisioned"

  @inline def values = js.Array[ThroughputMode](bursting, provisioned)
}

type TransitionToIARules = "AFTER_7_DAYS" | "AFTER_14_DAYS" | "AFTER_30_DAYS" | "AFTER_60_DAYS" | "AFTER_90_DAYS"
object TransitionToIARules {
  val AFTER_7_DAYS: "AFTER_7_DAYS" = "AFTER_7_DAYS"
  val AFTER_14_DAYS: "AFTER_14_DAYS" = "AFTER_14_DAYS"
  val AFTER_30_DAYS: "AFTER_30_DAYS" = "AFTER_30_DAYS"
  val AFTER_60_DAYS: "AFTER_60_DAYS" = "AFTER_60_DAYS"
  val AFTER_90_DAYS: "AFTER_90_DAYS" = "AFTER_90_DAYS"

  @inline def values = js.Array[TransitionToIARules](AFTER_7_DAYS, AFTER_14_DAYS, AFTER_30_DAYS, AFTER_60_DAYS, AFTER_90_DAYS)
}
