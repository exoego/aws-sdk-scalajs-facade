package facade.amazonaws.services.ivs

import scalajs.js

type ChannelLatencyMode = "NORMAL" | "LOW"
object ChannelLatencyMode {
  inline val NORMAL: "NORMAL" = "NORMAL"
  inline val LOW: "LOW" = "LOW"

  inline def values: js.Array[ChannelLatencyMode] = js.Array(NORMAL, LOW)
}

type ChannelType = "BASIC" | "STANDARD"
object ChannelType {
  inline val BASIC: "BASIC" = "BASIC"
  inline val STANDARD: "STANDARD" = "STANDARD"

  inline def values: js.Array[ChannelType] = js.Array(BASIC, STANDARD)
}

type RecordingConfigurationState = "CREATING" | "CREATE_FAILED" | "ACTIVE"
object RecordingConfigurationState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"

  inline def values: js.Array[RecordingConfigurationState] = js.Array(CREATING, CREATE_FAILED, ACTIVE)
}

type StreamHealth = "HEALTHY" | "STARVING" | "UNKNOWN"
object StreamHealth {
  inline val HEALTHY: "HEALTHY" = "HEALTHY"
  inline val STARVING: "STARVING" = "STARVING"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[StreamHealth] = js.Array(HEALTHY, STARVING, UNKNOWN)
}

type StreamState = "LIVE" | "OFFLINE"
object StreamState {
  inline val LIVE: "LIVE" = "LIVE"
  inline val OFFLINE: "OFFLINE" = "OFFLINE"

  inline def values: js.Array[StreamState] = js.Array(LIVE, OFFLINE)
}
