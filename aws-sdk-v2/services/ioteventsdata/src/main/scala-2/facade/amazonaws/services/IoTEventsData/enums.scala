package facade.amazonaws.services.ioteventsdata

import scalajs.js

@js.native
sealed trait AlarmStateName extends js.Any
object AlarmStateName {
  val DISABLED = "DISABLED".asInstanceOf[AlarmStateName]
  val NORMAL = "NORMAL".asInstanceOf[AlarmStateName]
  val ACTIVE = "ACTIVE".asInstanceOf[AlarmStateName]
  val ACKNOWLEDGED = "ACKNOWLEDGED".asInstanceOf[AlarmStateName]
  val SNOOZE_DISABLED = "SNOOZE_DISABLED".asInstanceOf[AlarmStateName]
  val LATCHED = "LATCHED".asInstanceOf[AlarmStateName]

  @inline def values: js.Array[AlarmStateName] = js.Array(DISABLED, NORMAL, ACTIVE, ACKNOWLEDGED, SNOOZE_DISABLED, LATCHED)
}

@js.native
sealed trait ComparisonOperator extends js.Any
object ComparisonOperator {
  val GREATER = "GREATER".asInstanceOf[ComparisonOperator]
  val GREATER_OR_EQUAL = "GREATER_OR_EQUAL".asInstanceOf[ComparisonOperator]
  val LESS = "LESS".asInstanceOf[ComparisonOperator]
  val LESS_OR_EQUAL = "LESS_OR_EQUAL".asInstanceOf[ComparisonOperator]
  val EQUAL = "EQUAL".asInstanceOf[ComparisonOperator]
  val NOT_EQUAL = "NOT_EQUAL".asInstanceOf[ComparisonOperator]

  @inline def values: js.Array[ComparisonOperator] = js.Array(GREATER, GREATER_OR_EQUAL, LESS, LESS_OR_EQUAL, EQUAL, NOT_EQUAL)
}

@js.native
sealed trait CustomerActionName extends js.Any
object CustomerActionName {
  val SNOOZE = "SNOOZE".asInstanceOf[CustomerActionName]
  val ENABLE = "ENABLE".asInstanceOf[CustomerActionName]
  val DISABLE = "DISABLE".asInstanceOf[CustomerActionName]
  val ACKNOWLEDGE = "ACKNOWLEDGE".asInstanceOf[CustomerActionName]
  val RESET = "RESET".asInstanceOf[CustomerActionName]

  @inline def values: js.Array[CustomerActionName] = js.Array(SNOOZE, ENABLE, DISABLE, ACKNOWLEDGE, RESET)
}

@js.native
sealed trait ErrorCode extends js.Any
object ErrorCode {
  val ResourceNotFoundException = "ResourceNotFoundException".asInstanceOf[ErrorCode]
  val InvalidRequestException = "InvalidRequestException".asInstanceOf[ErrorCode]
  val InternalFailureException = "InternalFailureException".asInstanceOf[ErrorCode]
  val ServiceUnavailableException = "ServiceUnavailableException".asInstanceOf[ErrorCode]
  val ThrottlingException = "ThrottlingException".asInstanceOf[ErrorCode]

  @inline def values: js.Array[ErrorCode] = js.Array(ResourceNotFoundException, InvalidRequestException, InternalFailureException, ServiceUnavailableException, ThrottlingException)
}

@js.native
sealed trait EventType extends js.Any
object EventType {
  val STATE_CHANGE = "STATE_CHANGE".asInstanceOf[EventType]

  @inline def values: js.Array[EventType] = js.Array(STATE_CHANGE)
}

@js.native
sealed trait TriggerType extends js.Any
object TriggerType {
  val SNOOZE_TIMEOUT = "SNOOZE_TIMEOUT".asInstanceOf[TriggerType]

  @inline def values: js.Array[TriggerType] = js.Array(SNOOZE_TIMEOUT)
}
