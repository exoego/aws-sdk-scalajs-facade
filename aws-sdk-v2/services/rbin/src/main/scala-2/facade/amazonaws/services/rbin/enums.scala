package facade.amazonaws.services.rbin

import scalajs.js

@js.native
sealed trait LockState extends js.Any
object LockState {
  val locked = "locked".asInstanceOf[LockState]
  val pending_unlock = "pending_unlock".asInstanceOf[LockState]
  val unlocked = "unlocked".asInstanceOf[LockState]

  @inline def values: js.Array[LockState] = js.Array(locked, pending_unlock, unlocked)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val EBS_SNAPSHOT = "EBS_SNAPSHOT".asInstanceOf[ResourceType]
  val EC2_IMAGE = "EC2_IMAGE".asInstanceOf[ResourceType]

  @inline def values: js.Array[ResourceType] = js.Array(EBS_SNAPSHOT, EC2_IMAGE)
}

@js.native
sealed trait RetentionPeriodUnit extends js.Any
object RetentionPeriodUnit {
  val DAYS = "DAYS".asInstanceOf[RetentionPeriodUnit]

  @inline def values: js.Array[RetentionPeriodUnit] = js.Array(DAYS)
}

@js.native
sealed trait RuleStatus extends js.Any
object RuleStatus {
  val pending = "pending".asInstanceOf[RuleStatus]
  val available = "available".asInstanceOf[RuleStatus]

  @inline def values: js.Array[RuleStatus] = js.Array(pending, available)
}

@js.native
sealed trait UnlockDelayUnit extends js.Any
object UnlockDelayUnit {
  val DAYS = "DAYS".asInstanceOf[UnlockDelayUnit]

  @inline def values: js.Array[UnlockDelayUnit] = js.Array(DAYS)
}
