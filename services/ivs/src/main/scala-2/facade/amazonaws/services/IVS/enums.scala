package facade.amazonaws.services.ivs

import scalajs.js

@js.native
sealed trait ChannelLatencyMode extends js.Any
object ChannelLatencyMode {
  val NORMAL = "NORMAL".asInstanceOf[ChannelLatencyMode]
  val LOW = "LOW".asInstanceOf[ChannelLatencyMode]

  @inline def values: js.Array[ChannelLatencyMode] = js.Array(NORMAL, LOW)
}

@js.native
sealed trait ChannelType extends js.Any
object ChannelType {
  val BASIC = "BASIC".asInstanceOf[ChannelType]
  val STANDARD = "STANDARD".asInstanceOf[ChannelType]

  @inline def values: js.Array[ChannelType] = js.Array(BASIC, STANDARD)
}

@js.native
sealed trait RecordingConfigurationState extends js.Any
object RecordingConfigurationState {
  val CREATING = "CREATING".asInstanceOf[RecordingConfigurationState]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[RecordingConfigurationState]
  val ACTIVE = "ACTIVE".asInstanceOf[RecordingConfigurationState]

  @inline def values: js.Array[RecordingConfigurationState] = js.Array(CREATING, CREATE_FAILED, ACTIVE)
}

@js.native
sealed trait StreamHealth extends js.Any
object StreamHealth {
  val HEALTHY = "HEALTHY".asInstanceOf[StreamHealth]
  val STARVING = "STARVING".asInstanceOf[StreamHealth]
  val UNKNOWN = "UNKNOWN".asInstanceOf[StreamHealth]

  @inline def values: js.Array[StreamHealth] = js.Array(HEALTHY, STARVING, UNKNOWN)
}

@js.native
sealed trait StreamState extends js.Any
object StreamState {
  val LIVE = "LIVE".asInstanceOf[StreamState]
  val OFFLINE = "OFFLINE".asInstanceOf[StreamState]

  @inline def values: js.Array[StreamState] = js.Array(LIVE, OFFLINE)
}
