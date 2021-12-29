package facade.amazonaws.services.ivs

import scalajs._

type ChannelLatencyMode = "NORMAL" | "LOW"
object ChannelLatencyMode {
  val NORMAL: "NORMAL" = "NORMAL"
  val LOW: "LOW" = "LOW"

  @inline def values = js.Array[ChannelLatencyMode](NORMAL, LOW)
}

type ChannelType = "BASIC" | "STANDARD"
object ChannelType {
  val BASIC: "BASIC" = "BASIC"
  val STANDARD: "STANDARD" = "STANDARD"

  @inline def values = js.Array[ChannelType](BASIC, STANDARD)
}

type RecordingConfigurationState = "CREATING" | "CREATE_FAILED" | "ACTIVE"
object RecordingConfigurationState {
  val CREATING: "CREATING" = "CREATING"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val ACTIVE: "ACTIVE" = "ACTIVE"

  @inline def values = js.Array[RecordingConfigurationState](CREATING, CREATE_FAILED, ACTIVE)
}

type StreamHealth = "HEALTHY" | "STARVING" | "UNKNOWN"
object StreamHealth {
  val HEALTHY: "HEALTHY" = "HEALTHY"
  val STARVING: "STARVING" = "STARVING"
  val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  @inline def values = js.Array[StreamHealth](HEALTHY, STARVING, UNKNOWN)
}

type StreamState = "LIVE" | "OFFLINE"
object StreamState {
  val LIVE: "LIVE" = "LIVE"
  val OFFLINE: "OFFLINE" = "OFFLINE"

  @inline def values = js.Array[StreamState](LIVE, OFFLINE)
}
