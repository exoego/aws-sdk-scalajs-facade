package facade.amazonaws.services.ivschat

import scalajs.js

@js.native
sealed trait ChatTokenCapability extends js.Any
object ChatTokenCapability {
  val SEND_MESSAGE = "SEND_MESSAGE".asInstanceOf[ChatTokenCapability]
  val DISCONNECT_USER = "DISCONNECT_USER".asInstanceOf[ChatTokenCapability]
  val DELETE_MESSAGE = "DELETE_MESSAGE".asInstanceOf[ChatTokenCapability]

  @inline def values: js.Array[ChatTokenCapability] = js.Array(SEND_MESSAGE, DISCONNECT_USER, DELETE_MESSAGE)
}

@js.native
sealed trait CreateLoggingConfigurationState extends js.Any
object CreateLoggingConfigurationState {
  val ACTIVE = "ACTIVE".asInstanceOf[CreateLoggingConfigurationState]

  @inline def values: js.Array[CreateLoggingConfigurationState] = js.Array(ACTIVE)
}

@js.native
sealed trait FallbackResult extends js.Any
object FallbackResult {
  val ALLOW = "ALLOW".asInstanceOf[FallbackResult]
  val DENY = "DENY".asInstanceOf[FallbackResult]

  @inline def values: js.Array[FallbackResult] = js.Array(ALLOW, DENY)
}

@js.native
sealed trait LoggingConfigurationState extends js.Any
object LoggingConfigurationState {
  val CREATING = "CREATING".asInstanceOf[LoggingConfigurationState]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[LoggingConfigurationState]
  val DELETING = "DELETING".asInstanceOf[LoggingConfigurationState]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[LoggingConfigurationState]
  val UPDATING = "UPDATING".asInstanceOf[LoggingConfigurationState]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[LoggingConfigurationState]
  val ACTIVE = "ACTIVE".asInstanceOf[LoggingConfigurationState]

  @inline def values: js.Array[LoggingConfigurationState] = js.Array(CREATING, CREATE_FAILED, DELETING, DELETE_FAILED, UPDATING, UPDATE_FAILED, ACTIVE)
}

@js.native
sealed trait UpdateLoggingConfigurationState extends js.Any
object UpdateLoggingConfigurationState {
  val ACTIVE = "ACTIVE".asInstanceOf[UpdateLoggingConfigurationState]

  @inline def values: js.Array[UpdateLoggingConfigurationState] = js.Array(ACTIVE)
}
