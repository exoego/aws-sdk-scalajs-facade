package facade.amazonaws.services.efs

import scalajs._

type LifeCycleState = "creating" | "available" | "updating" | "deleting" | "deleted" | "error"
object LifeCycleState {
  inline val creating: "creating" = "creating"
  inline val available: "available" = "available"
  inline val updating: "updating" = "updating"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"
  inline val error: "error" = "error"

  inline def values: js.Array[LifeCycleState] = js.Array(creating, available, updating, deleting, deleted, error)
}

type PerformanceMode = "generalPurpose" | "maxIO"
object PerformanceMode {
  inline val generalPurpose: "generalPurpose" = "generalPurpose"
  inline val maxIO: "maxIO" = "maxIO"

  inline def values: js.Array[PerformanceMode] = js.Array(generalPurpose, maxIO)
}

type Status = "ENABLED" | "ENABLING" | "DISABLED" | "DISABLING"
object Status {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val ENABLING: "ENABLING" = "ENABLING"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val DISABLING: "DISABLING" = "DISABLING"

  inline def values: js.Array[Status] = js.Array(ENABLED, ENABLING, DISABLED, DISABLING)
}

type ThroughputMode = "bursting" | "provisioned"
object ThroughputMode {
  inline val bursting: "bursting" = "bursting"
  inline val provisioned: "provisioned" = "provisioned"

  inline def values: js.Array[ThroughputMode] = js.Array(bursting, provisioned)
}

type TransitionToIARules = "AFTER_7_DAYS" | "AFTER_14_DAYS" | "AFTER_30_DAYS" | "AFTER_60_DAYS" | "AFTER_90_DAYS"
object TransitionToIARules {
  inline val AFTER_7_DAYS: "AFTER_7_DAYS" = "AFTER_7_DAYS"
  inline val AFTER_14_DAYS: "AFTER_14_DAYS" = "AFTER_14_DAYS"
  inline val AFTER_30_DAYS: "AFTER_30_DAYS" = "AFTER_30_DAYS"
  inline val AFTER_60_DAYS: "AFTER_60_DAYS" = "AFTER_60_DAYS"
  inline val AFTER_90_DAYS: "AFTER_90_DAYS" = "AFTER_90_DAYS"

  inline def values: js.Array[TransitionToIARules] = js.Array(AFTER_7_DAYS, AFTER_14_DAYS, AFTER_30_DAYS, AFTER_60_DAYS, AFTER_90_DAYS)
}
