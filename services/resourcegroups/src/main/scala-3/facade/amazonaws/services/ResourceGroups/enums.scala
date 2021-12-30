package facade.amazonaws.services.resourcegroups

import scalajs.js

type GroupConfigurationStatus = "UPDATING" | "UPDATE_COMPLETE" | "UPDATE_FAILED"
object GroupConfigurationStatus {
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val UPDATE_COMPLETE: "UPDATE_COMPLETE" = "UPDATE_COMPLETE"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  inline def values: js.Array[GroupConfigurationStatus] = js.Array(UPDATING, UPDATE_COMPLETE, UPDATE_FAILED)
}

type GroupFilterName = "resource-type" | "configuration-type"
object GroupFilterName {
  inline val `resource-type`: "resource-type" = "resource-type"
  inline val `configuration-type`: "configuration-type" = "configuration-type"

  inline def values: js.Array[GroupFilterName] = js.Array(`resource-type`, `configuration-type`)
}

type QueryErrorCode = "CLOUDFORMATION_STACK_INACTIVE" | "CLOUDFORMATION_STACK_NOT_EXISTING"
object QueryErrorCode {
  inline val CLOUDFORMATION_STACK_INACTIVE: "CLOUDFORMATION_STACK_INACTIVE" = "CLOUDFORMATION_STACK_INACTIVE"
  inline val CLOUDFORMATION_STACK_NOT_EXISTING: "CLOUDFORMATION_STACK_NOT_EXISTING" = "CLOUDFORMATION_STACK_NOT_EXISTING"

  inline def values: js.Array[QueryErrorCode] = js.Array(CLOUDFORMATION_STACK_INACTIVE, CLOUDFORMATION_STACK_NOT_EXISTING)
}

type QueryType = "TAG_FILTERS_1_0" | "CLOUDFORMATION_STACK_1_0"
object QueryType {
  inline val TAG_FILTERS_1_0: "TAG_FILTERS_1_0" = "TAG_FILTERS_1_0"
  inline val CLOUDFORMATION_STACK_1_0: "CLOUDFORMATION_STACK_1_0" = "CLOUDFORMATION_STACK_1_0"

  inline def values: js.Array[QueryType] = js.Array(TAG_FILTERS_1_0, CLOUDFORMATION_STACK_1_0)
}

type ResourceFilterName = "resource-type"
object ResourceFilterName {
  inline val `resource-type`: "resource-type" = "resource-type"

  inline def values: js.Array[ResourceFilterName] = js.Array(`resource-type`)
}

type ResourceStatusValue = "PENDING"
object ResourceStatusValue {
  inline val PENDING: "PENDING" = "PENDING"

  inline def values: js.Array[ResourceStatusValue] = js.Array(PENDING)
}
