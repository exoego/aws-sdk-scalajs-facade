package facade.amazonaws.services.codestarnotifications

import scalajs._

type DetailType = "BASIC" | "FULL"
object DetailType {
  val BASIC: "BASIC" = "BASIC"
  val FULL: "FULL" = "FULL"

  @inline def values = js.Array[DetailType](BASIC, FULL)
}

type ListEventTypesFilterName = "RESOURCE_TYPE" | "SERVICE_NAME"
object ListEventTypesFilterName {
  val RESOURCE_TYPE: "RESOURCE_TYPE" = "RESOURCE_TYPE"
  val SERVICE_NAME: "SERVICE_NAME" = "SERVICE_NAME"

  @inline def values = js.Array[ListEventTypesFilterName](RESOURCE_TYPE, SERVICE_NAME)
}

type ListNotificationRulesFilterName = "EVENT_TYPE_ID" | "CREATED_BY" | "RESOURCE" | "TARGET_ADDRESS"
object ListNotificationRulesFilterName {
  val EVENT_TYPE_ID: "EVENT_TYPE_ID" = "EVENT_TYPE_ID"
  val CREATED_BY: "CREATED_BY" = "CREATED_BY"
  val RESOURCE: "RESOURCE" = "RESOURCE"
  val TARGET_ADDRESS: "TARGET_ADDRESS" = "TARGET_ADDRESS"

  @inline def values = js.Array[ListNotificationRulesFilterName](EVENT_TYPE_ID, CREATED_BY, RESOURCE, TARGET_ADDRESS)
}

type ListTargetsFilterName = "TARGET_TYPE" | "TARGET_ADDRESS" | "TARGET_STATUS"
object ListTargetsFilterName {
  val TARGET_TYPE: "TARGET_TYPE" = "TARGET_TYPE"
  val TARGET_ADDRESS: "TARGET_ADDRESS" = "TARGET_ADDRESS"
  val TARGET_STATUS: "TARGET_STATUS" = "TARGET_STATUS"

  @inline def values = js.Array[ListTargetsFilterName](TARGET_TYPE, TARGET_ADDRESS, TARGET_STATUS)
}

type NotificationRuleStatus = "ENABLED" | "DISABLED"
object NotificationRuleStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[NotificationRuleStatus](ENABLED, DISABLED)
}

type TargetStatus = "PENDING" | "ACTIVE" | "UNREACHABLE" | "INACTIVE" | "DEACTIVATED"
object TargetStatus {
  val PENDING: "PENDING" = "PENDING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val UNREACHABLE: "UNREACHABLE" = "UNREACHABLE"
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val DEACTIVATED: "DEACTIVATED" = "DEACTIVATED"

  @inline def values = js.Array[TargetStatus](PENDING, ACTIVE, UNREACHABLE, INACTIVE, DEACTIVATED)
}
