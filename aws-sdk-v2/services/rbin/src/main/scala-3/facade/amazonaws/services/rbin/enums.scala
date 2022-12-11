package facade.amazonaws.services.rbin

import scalajs.js

type LockState = "locked" | "pending_unlock" | "unlocked"
object LockState {
  inline val locked: "locked" = "locked"
  inline val pending_unlock: "pending_unlock" = "pending_unlock"
  inline val unlocked: "unlocked" = "unlocked"

  inline def values: js.Array[LockState] = js.Array(locked, pending_unlock, unlocked)
}

type ResourceType = "EBS_SNAPSHOT" | "EC2_IMAGE"
object ResourceType {
  inline val EBS_SNAPSHOT: "EBS_SNAPSHOT" = "EBS_SNAPSHOT"
  inline val EC2_IMAGE: "EC2_IMAGE" = "EC2_IMAGE"

  inline def values: js.Array[ResourceType] = js.Array(EBS_SNAPSHOT, EC2_IMAGE)
}

type RetentionPeriodUnit = "DAYS"
object RetentionPeriodUnit {
  inline val DAYS: "DAYS" = "DAYS"

  inline def values: js.Array[RetentionPeriodUnit] = js.Array(DAYS)
}

type RuleStatus = "pending" | "available"
object RuleStatus {
  inline val pending: "pending" = "pending"
  inline val available: "available" = "available"

  inline def values: js.Array[RuleStatus] = js.Array(pending, available)
}

type UnlockDelayUnit = "DAYS"
object UnlockDelayUnit {
  inline val DAYS: "DAYS" = "DAYS"

  inline def values: js.Array[UnlockDelayUnit] = js.Array(DAYS)
}
