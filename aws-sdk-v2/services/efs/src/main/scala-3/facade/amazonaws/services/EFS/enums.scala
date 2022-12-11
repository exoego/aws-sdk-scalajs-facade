package facade.amazonaws.services.efs

import scalajs.js

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

type ReplicationStatus = "ENABLED" | "ENABLING" | "DELETING" | "ERROR"
object ReplicationStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val ENABLING: "ENABLING" = "ENABLING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[ReplicationStatus] = js.Array(ENABLED, ENABLING, DELETING, ERROR)
}

/** An EFS resource, for example a file system or a mount target.
  */
type Resource = "FILE_SYSTEM" | "MOUNT_TARGET"
object Resource {
  inline val FILE_SYSTEM: "FILE_SYSTEM" = "FILE_SYSTEM"
  inline val MOUNT_TARGET: "MOUNT_TARGET" = "MOUNT_TARGET"

  inline def values: js.Array[Resource] = js.Array(FILE_SYSTEM, MOUNT_TARGET)
}

/** A preference indicating a choice to use 63bit/32bit IDs for all applicable resources.
  */
type ResourceIdType = "LONG_ID" | "SHORT_ID"
object ResourceIdType {
  inline val LONG_ID: "LONG_ID" = "LONG_ID"
  inline val SHORT_ID: "SHORT_ID" = "SHORT_ID"

  inline def values: js.Array[ResourceIdType] = js.Array(LONG_ID, SHORT_ID)
}

type Status = "ENABLED" | "ENABLING" | "DISABLED" | "DISABLING"
object Status {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val ENABLING: "ENABLING" = "ENABLING"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val DISABLING: "DISABLING" = "DISABLING"

  inline def values: js.Array[Status] = js.Array(ENABLED, ENABLING, DISABLED, DISABLING)
}

type ThroughputMode = "bursting" | "provisioned" | "elastic"
object ThroughputMode {
  inline val bursting: "bursting" = "bursting"
  inline val provisioned: "provisioned" = "provisioned"
  inline val elastic: "elastic" = "elastic"

  inline def values: js.Array[ThroughputMode] = js.Array(bursting, provisioned, elastic)
}

type TransitionToIARules = "AFTER_7_DAYS" | "AFTER_14_DAYS" | "AFTER_30_DAYS" | "AFTER_60_DAYS" | "AFTER_90_DAYS" | "AFTER_1_DAY"
object TransitionToIARules {
  inline val AFTER_7_DAYS: "AFTER_7_DAYS" = "AFTER_7_DAYS"
  inline val AFTER_14_DAYS: "AFTER_14_DAYS" = "AFTER_14_DAYS"
  inline val AFTER_30_DAYS: "AFTER_30_DAYS" = "AFTER_30_DAYS"
  inline val AFTER_60_DAYS: "AFTER_60_DAYS" = "AFTER_60_DAYS"
  inline val AFTER_90_DAYS: "AFTER_90_DAYS" = "AFTER_90_DAYS"
  inline val AFTER_1_DAY: "AFTER_1_DAY" = "AFTER_1_DAY"

  inline def values: js.Array[TransitionToIARules] = js.Array(AFTER_7_DAYS, AFTER_14_DAYS, AFTER_30_DAYS, AFTER_60_DAYS, AFTER_90_DAYS, AFTER_1_DAY)
}

type TransitionToPrimaryStorageClassRules = "AFTER_1_ACCESS"
object TransitionToPrimaryStorageClassRules {
  inline val AFTER_1_ACCESS: "AFTER_1_ACCESS" = "AFTER_1_ACCESS"

  inline def values: js.Array[TransitionToPrimaryStorageClassRules] = js.Array(AFTER_1_ACCESS)
}
