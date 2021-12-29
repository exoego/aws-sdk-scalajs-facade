package facade.amazonaws.services.codestarnotifications

import scalajs._

type DetailType = "BASIC" | "FULL"
object DetailType {
  inline val BASIC: "BASIC" = "BASIC"
  inline val FULL: "FULL" = "FULL"

  inline def values: js.Array[DetailType] = js.Array(BASIC, FULL)
}

type ListEventTypesFilterName = "RESOURCE_TYPE" | "SERVICE_NAME"
object ListEventTypesFilterName {
  inline val RESOURCE_TYPE: "RESOURCE_TYPE" = "RESOURCE_TYPE"
  inline val SERVICE_NAME: "SERVICE_NAME" = "SERVICE_NAME"

  inline def values: js.Array[ListEventTypesFilterName] = js.Array(RESOURCE_TYPE, SERVICE_NAME)
}

type ListNotificationRulesFilterName = "EVENT_TYPE_ID" | "CREATED_BY" | "RESOURCE" | "TARGET_ADDRESS"
object ListNotificationRulesFilterName {
  inline val EVENT_TYPE_ID: "EVENT_TYPE_ID" = "EVENT_TYPE_ID"
  inline val CREATED_BY: "CREATED_BY" = "CREATED_BY"
  inline val RESOURCE: "RESOURCE" = "RESOURCE"
  inline val TARGET_ADDRESS: "TARGET_ADDRESS" = "TARGET_ADDRESS"

  inline def values: js.Array[ListNotificationRulesFilterName] = js.Array(EVENT_TYPE_ID, CREATED_BY, RESOURCE, TARGET_ADDRESS)
}

type ListTargetsFilterName = "TARGET_TYPE" | "TARGET_ADDRESS" | "TARGET_STATUS"
object ListTargetsFilterName {
  inline val TARGET_TYPE: "TARGET_TYPE" = "TARGET_TYPE"
  inline val TARGET_ADDRESS: "TARGET_ADDRESS" = "TARGET_ADDRESS"
  inline val TARGET_STATUS: "TARGET_STATUS" = "TARGET_STATUS"

  inline def values: js.Array[ListTargetsFilterName] = js.Array(TARGET_TYPE, TARGET_ADDRESS, TARGET_STATUS)
}

type NotificationRuleStatus = "ENABLED" | "DISABLED"
object NotificationRuleStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[NotificationRuleStatus] = js.Array(ENABLED, DISABLED)
}

type TargetStatus = "PENDING" | "ACTIVE" | "UNREACHABLE" | "INACTIVE" | "DEACTIVATED"
object TargetStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val UNREACHABLE: "UNREACHABLE" = "UNREACHABLE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val DEACTIVATED: "DEACTIVATED" = "DEACTIVATED"

  inline def values: js.Array[TargetStatus] = js.Array(PENDING, ACTIVE, UNREACHABLE, INACTIVE, DEACTIVATED)
}
