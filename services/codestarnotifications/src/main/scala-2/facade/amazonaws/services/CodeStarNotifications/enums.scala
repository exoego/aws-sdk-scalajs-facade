package facade.amazonaws.services.codestarnotifications

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait DetailType extends js.Any
object DetailType {
  val BASIC = "BASIC".asInstanceOf[DetailType]
  val FULL = "FULL".asInstanceOf[DetailType]

  @inline def values = js.Array(BASIC, FULL)
}

@js.native
sealed trait ListEventTypesFilterName extends js.Any
object ListEventTypesFilterName {
  val RESOURCE_TYPE = "RESOURCE_TYPE".asInstanceOf[ListEventTypesFilterName]
  val SERVICE_NAME = "SERVICE_NAME".asInstanceOf[ListEventTypesFilterName]

  @inline def values = js.Array(RESOURCE_TYPE, SERVICE_NAME)
}

@js.native
sealed trait ListNotificationRulesFilterName extends js.Any
object ListNotificationRulesFilterName {
  val EVENT_TYPE_ID = "EVENT_TYPE_ID".asInstanceOf[ListNotificationRulesFilterName]
  val CREATED_BY = "CREATED_BY".asInstanceOf[ListNotificationRulesFilterName]
  val RESOURCE = "RESOURCE".asInstanceOf[ListNotificationRulesFilterName]
  val TARGET_ADDRESS = "TARGET_ADDRESS".asInstanceOf[ListNotificationRulesFilterName]

  @inline def values = js.Array(EVENT_TYPE_ID, CREATED_BY, RESOURCE, TARGET_ADDRESS)
}

@js.native
sealed trait ListTargetsFilterName extends js.Any
object ListTargetsFilterName {
  val TARGET_TYPE = "TARGET_TYPE".asInstanceOf[ListTargetsFilterName]
  val TARGET_ADDRESS = "TARGET_ADDRESS".asInstanceOf[ListTargetsFilterName]
  val TARGET_STATUS = "TARGET_STATUS".asInstanceOf[ListTargetsFilterName]

  @inline def values = js.Array(TARGET_TYPE, TARGET_ADDRESS, TARGET_STATUS)
}

@js.native
sealed trait NotificationRuleStatus extends js.Any
object NotificationRuleStatus {
  val ENABLED = "ENABLED".asInstanceOf[NotificationRuleStatus]
  val DISABLED = "DISABLED".asInstanceOf[NotificationRuleStatus]

  @inline def values = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait TargetStatus extends js.Any
object TargetStatus {
  val PENDING = "PENDING".asInstanceOf[TargetStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[TargetStatus]
  val UNREACHABLE = "UNREACHABLE".asInstanceOf[TargetStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[TargetStatus]
  val DEACTIVATED = "DEACTIVATED".asInstanceOf[TargetStatus]

  @inline def values = js.Array(PENDING, ACTIVE, UNREACHABLE, INACTIVE, DEACTIVATED)
}

