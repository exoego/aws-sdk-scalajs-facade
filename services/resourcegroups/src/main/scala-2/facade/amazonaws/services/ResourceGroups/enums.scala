package facade.amazonaws.services.resourcegroups

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait GroupConfigurationStatus extends js.Any
object GroupConfigurationStatus {
  val UPDATING = "UPDATING".asInstanceOf[GroupConfigurationStatus]
  val UPDATE_COMPLETE = "UPDATE_COMPLETE".asInstanceOf[GroupConfigurationStatus]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[GroupConfigurationStatus]

  @inline def values = js.Array(UPDATING, UPDATE_COMPLETE, UPDATE_FAILED)
}

@js.native
sealed trait GroupFilterName extends js.Any
object GroupFilterName {
  val `resource-type` = "resource-type".asInstanceOf[GroupFilterName]
  val `configuration-type` = "configuration-type".asInstanceOf[GroupFilterName]

  @inline def values = js.Array(`resource-type`, `configuration-type`)
}

@js.native
sealed trait QueryErrorCode extends js.Any
object QueryErrorCode {
  val CLOUDFORMATION_STACK_INACTIVE = "CLOUDFORMATION_STACK_INACTIVE".asInstanceOf[QueryErrorCode]
  val CLOUDFORMATION_STACK_NOT_EXISTING = "CLOUDFORMATION_STACK_NOT_EXISTING".asInstanceOf[QueryErrorCode]

  @inline def values = js.Array(CLOUDFORMATION_STACK_INACTIVE, CLOUDFORMATION_STACK_NOT_EXISTING)
}

@js.native
sealed trait QueryType extends js.Any
object QueryType {
  val TAG_FILTERS_1_0 = "TAG_FILTERS_1_0".asInstanceOf[QueryType]
  val CLOUDFORMATION_STACK_1_0 = "CLOUDFORMATION_STACK_1_0".asInstanceOf[QueryType]

  @inline def values = js.Array(TAG_FILTERS_1_0, CLOUDFORMATION_STACK_1_0)
}

@js.native
sealed trait ResourceFilterName extends js.Any
object ResourceFilterName {
  val `resource-type` = "resource-type".asInstanceOf[ResourceFilterName]

  @inline def values = js.Array(`resource-type`)
}

@js.native
sealed trait ResourceStatusValue extends js.Any
object ResourceStatusValue {
  val PENDING = "PENDING".asInstanceOf[ResourceStatusValue]

  @inline def values = js.Array(PENDING)
}
