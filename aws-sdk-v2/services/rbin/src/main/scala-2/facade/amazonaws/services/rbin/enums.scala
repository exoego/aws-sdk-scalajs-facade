package facade.amazonaws.services.rbin

import scalajs.js

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val EBS_SNAPSHOT = "EBS_SNAPSHOT".asInstanceOf[ResourceType]

  @inline def values: js.Array[ResourceType] = js.Array(EBS_SNAPSHOT)
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
