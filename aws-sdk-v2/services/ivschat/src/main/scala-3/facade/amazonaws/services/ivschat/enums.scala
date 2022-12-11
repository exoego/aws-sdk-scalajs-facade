package facade.amazonaws.services.ivschat

import scalajs.js

type ChatTokenCapability = "SEND_MESSAGE" | "DISCONNECT_USER" | "DELETE_MESSAGE"
object ChatTokenCapability {
  inline val SEND_MESSAGE: "SEND_MESSAGE" = "SEND_MESSAGE"
  inline val DISCONNECT_USER: "DISCONNECT_USER" = "DISCONNECT_USER"
  inline val DELETE_MESSAGE: "DELETE_MESSAGE" = "DELETE_MESSAGE"

  inline def values: js.Array[ChatTokenCapability] = js.Array(SEND_MESSAGE, DISCONNECT_USER, DELETE_MESSAGE)
}

type CreateLoggingConfigurationState = "ACTIVE"
object CreateLoggingConfigurationState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"

  inline def values: js.Array[CreateLoggingConfigurationState] = js.Array(ACTIVE)
}

type FallbackResult = "ALLOW" | "DENY"
object FallbackResult {
  inline val ALLOW: "ALLOW" = "ALLOW"
  inline val DENY: "DENY" = "DENY"

  inline def values: js.Array[FallbackResult] = js.Array(ALLOW, DENY)
}

type LoggingConfigurationState = "CREATING" | "CREATE_FAILED" | "DELETING" | "DELETE_FAILED" | "UPDATING" | "UPDATE_FAILED" | "ACTIVE"
object LoggingConfigurationState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"

  inline def values: js.Array[LoggingConfigurationState] = js.Array(CREATING, CREATE_FAILED, DELETING, DELETE_FAILED, UPDATING, UPDATE_FAILED, ACTIVE)
}

type UpdateLoggingConfigurationState = "ACTIVE"
object UpdateLoggingConfigurationState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"

  inline def values: js.Array[UpdateLoggingConfigurationState] = js.Array(ACTIVE)
}
