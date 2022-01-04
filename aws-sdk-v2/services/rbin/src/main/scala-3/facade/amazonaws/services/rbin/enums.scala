package facade.amazonaws.services.rbin

import scalajs.js

type ResourceType = "EBS_SNAPSHOT"
object ResourceType {
  inline val EBS_SNAPSHOT: "EBS_SNAPSHOT" = "EBS_SNAPSHOT"

  inline def values: js.Array[ResourceType] = js.Array(EBS_SNAPSHOT)
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
