package facade.amazonaws.services.ioteventsdata

import scalajs.js

type AlarmStateName = "DISABLED" | "NORMAL" | "ACTIVE" | "ACKNOWLEDGED" | "SNOOZE_DISABLED" | "LATCHED"
object AlarmStateName {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val NORMAL: "NORMAL" = "NORMAL"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val ACKNOWLEDGED: "ACKNOWLEDGED" = "ACKNOWLEDGED"
  inline val SNOOZE_DISABLED: "SNOOZE_DISABLED" = "SNOOZE_DISABLED"
  inline val LATCHED: "LATCHED" = "LATCHED"

  inline def values: js.Array[AlarmStateName] = js.Array(DISABLED, NORMAL, ACTIVE, ACKNOWLEDGED, SNOOZE_DISABLED, LATCHED)
}

type ComparisonOperator = "GREATER" | "GREATER_OR_EQUAL" | "LESS" | "LESS_OR_EQUAL" | "EQUAL" | "NOT_EQUAL"
object ComparisonOperator {
  inline val GREATER: "GREATER" = "GREATER"
  inline val GREATER_OR_EQUAL: "GREATER_OR_EQUAL" = "GREATER_OR_EQUAL"
  inline val LESS: "LESS" = "LESS"
  inline val LESS_OR_EQUAL: "LESS_OR_EQUAL" = "LESS_OR_EQUAL"
  inline val EQUAL: "EQUAL" = "EQUAL"
  inline val NOT_EQUAL: "NOT_EQUAL" = "NOT_EQUAL"

  inline def values: js.Array[ComparisonOperator] = js.Array(GREATER, GREATER_OR_EQUAL, LESS, LESS_OR_EQUAL, EQUAL, NOT_EQUAL)
}

type CustomerActionName = "SNOOZE" | "ENABLE" | "DISABLE" | "ACKNOWLEDGE" | "RESET"
object CustomerActionName {
  inline val SNOOZE: "SNOOZE" = "SNOOZE"
  inline val ENABLE: "ENABLE" = "ENABLE"
  inline val DISABLE: "DISABLE" = "DISABLE"
  inline val ACKNOWLEDGE: "ACKNOWLEDGE" = "ACKNOWLEDGE"
  inline val RESET: "RESET" = "RESET"

  inline def values: js.Array[CustomerActionName] = js.Array(SNOOZE, ENABLE, DISABLE, ACKNOWLEDGE, RESET)
}

type ErrorCode = "ResourceNotFoundException" | "InvalidRequestException" | "InternalFailureException" | "ServiceUnavailableException" | "ThrottlingException"
object ErrorCode {
  inline val ResourceNotFoundException: "ResourceNotFoundException" = "ResourceNotFoundException"
  inline val InvalidRequestException: "InvalidRequestException" = "InvalidRequestException"
  inline val InternalFailureException: "InternalFailureException" = "InternalFailureException"
  inline val ServiceUnavailableException: "ServiceUnavailableException" = "ServiceUnavailableException"
  inline val ThrottlingException: "ThrottlingException" = "ThrottlingException"

  inline def values: js.Array[ErrorCode] = js.Array(ResourceNotFoundException, InvalidRequestException, InternalFailureException, ServiceUnavailableException, ThrottlingException)
}

type EventType = "STATE_CHANGE"
object EventType {
  inline val STATE_CHANGE: "STATE_CHANGE" = "STATE_CHANGE"

  inline def values: js.Array[EventType] = js.Array(STATE_CHANGE)
}

type TriggerType = "SNOOZE_TIMEOUT"
object TriggerType {
  inline val SNOOZE_TIMEOUT: "SNOOZE_TIMEOUT" = "SNOOZE_TIMEOUT"

  inline def values: js.Array[TriggerType] = js.Array(SNOOZE_TIMEOUT)
}
