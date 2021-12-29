package facade.amazonaws.services.resourcegroups

import scalajs._

type GroupConfigurationStatus = "UPDATING" | "UPDATE_COMPLETE" | "UPDATE_FAILED"
object GroupConfigurationStatus {
  val UPDATING: "UPDATING" = "UPDATING"
  val UPDATE_COMPLETE: "UPDATE_COMPLETE" = "UPDATE_COMPLETE"
  val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  @inline def values = js.Array[GroupConfigurationStatus](UPDATING, UPDATE_COMPLETE, UPDATE_FAILED)
}

type GroupFilterName = "resource-type" | "configuration-type"
object GroupFilterName {
  val `resource-type`: "resource-type" = "resource-type"
  val `configuration-type`: "configuration-type" = "configuration-type"

  @inline def values = js.Array[GroupFilterName](`resource-type`, `configuration-type`)
}

type QueryErrorCode = "CLOUDFORMATION_STACK_INACTIVE" | "CLOUDFORMATION_STACK_NOT_EXISTING"
object QueryErrorCode {
  val CLOUDFORMATION_STACK_INACTIVE: "CLOUDFORMATION_STACK_INACTIVE" = "CLOUDFORMATION_STACK_INACTIVE"
  val CLOUDFORMATION_STACK_NOT_EXISTING: "CLOUDFORMATION_STACK_NOT_EXISTING" = "CLOUDFORMATION_STACK_NOT_EXISTING"

  @inline def values = js.Array[QueryErrorCode](CLOUDFORMATION_STACK_INACTIVE, CLOUDFORMATION_STACK_NOT_EXISTING)
}

type QueryType = "TAG_FILTERS_1_0" | "CLOUDFORMATION_STACK_1_0"
object QueryType {
  val TAG_FILTERS_1_0: "TAG_FILTERS_1_0" = "TAG_FILTERS_1_0"
  val CLOUDFORMATION_STACK_1_0: "CLOUDFORMATION_STACK_1_0" = "CLOUDFORMATION_STACK_1_0"

  @inline def values = js.Array[QueryType](TAG_FILTERS_1_0, CLOUDFORMATION_STACK_1_0)
}

type ResourceFilterName = "resource-type"
object ResourceFilterName {
  val `resource-type`: "resource-type" = "resource-type"

  @inline def values = js.Array[ResourceFilterName](`resource-type`)
}

type ResourceStatusValue = "PENDING"
object ResourceStatusValue {
  val PENDING: "PENDING" = "PENDING"

  @inline def values = js.Array[ResourceStatusValue](PENDING)
}
