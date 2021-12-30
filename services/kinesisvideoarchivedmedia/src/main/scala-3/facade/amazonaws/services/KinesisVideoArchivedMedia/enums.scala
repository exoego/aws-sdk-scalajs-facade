package facade.amazonaws.services.kinesisvideoarchivedmedia

import scalajs.js

type ClipFragmentSelectorType = "PRODUCER_TIMESTAMP" | "SERVER_TIMESTAMP"
object ClipFragmentSelectorType {
  inline val PRODUCER_TIMESTAMP: "PRODUCER_TIMESTAMP" = "PRODUCER_TIMESTAMP"
  inline val SERVER_TIMESTAMP: "SERVER_TIMESTAMP" = "SERVER_TIMESTAMP"

  inline def values: js.Array[ClipFragmentSelectorType] = js.Array(PRODUCER_TIMESTAMP, SERVER_TIMESTAMP)
}

type ContainerFormat = "FRAGMENTED_MP4" | "MPEG_TS"
object ContainerFormat {
  inline val FRAGMENTED_MP4: "FRAGMENTED_MP4" = "FRAGMENTED_MP4"
  inline val MPEG_TS: "MPEG_TS" = "MPEG_TS"

  inline def values: js.Array[ContainerFormat] = js.Array(FRAGMENTED_MP4, MPEG_TS)
}

type DASHDisplayFragmentNumber = "ALWAYS" | "NEVER"
object DASHDisplayFragmentNumber {
  inline val ALWAYS: "ALWAYS" = "ALWAYS"
  inline val NEVER: "NEVER" = "NEVER"

  inline def values: js.Array[DASHDisplayFragmentNumber] = js.Array(ALWAYS, NEVER)
}

type DASHDisplayFragmentTimestamp = "ALWAYS" | "NEVER"
object DASHDisplayFragmentTimestamp {
  inline val ALWAYS: "ALWAYS" = "ALWAYS"
  inline val NEVER: "NEVER" = "NEVER"

  inline def values: js.Array[DASHDisplayFragmentTimestamp] = js.Array(ALWAYS, NEVER)
}

type DASHFragmentSelectorType = "PRODUCER_TIMESTAMP" | "SERVER_TIMESTAMP"
object DASHFragmentSelectorType {
  inline val PRODUCER_TIMESTAMP: "PRODUCER_TIMESTAMP" = "PRODUCER_TIMESTAMP"
  inline val SERVER_TIMESTAMP: "SERVER_TIMESTAMP" = "SERVER_TIMESTAMP"

  inline def values: js.Array[DASHFragmentSelectorType] = js.Array(PRODUCER_TIMESTAMP, SERVER_TIMESTAMP)
}

type DASHPlaybackMode = "LIVE" | "LIVE_REPLAY" | "ON_DEMAND"
object DASHPlaybackMode {
  inline val LIVE: "LIVE" = "LIVE"
  inline val LIVE_REPLAY: "LIVE_REPLAY" = "LIVE_REPLAY"
  inline val ON_DEMAND: "ON_DEMAND" = "ON_DEMAND"

  inline def values: js.Array[DASHPlaybackMode] = js.Array(LIVE, LIVE_REPLAY, ON_DEMAND)
}

type FragmentSelectorType = "PRODUCER_TIMESTAMP" | "SERVER_TIMESTAMP"
object FragmentSelectorType {
  inline val PRODUCER_TIMESTAMP: "PRODUCER_TIMESTAMP" = "PRODUCER_TIMESTAMP"
  inline val SERVER_TIMESTAMP: "SERVER_TIMESTAMP" = "SERVER_TIMESTAMP"

  inline def values: js.Array[FragmentSelectorType] = js.Array(PRODUCER_TIMESTAMP, SERVER_TIMESTAMP)
}

type HLSDiscontinuityMode = "ALWAYS" | "NEVER" | "ON_DISCONTINUITY"
object HLSDiscontinuityMode {
  inline val ALWAYS: "ALWAYS" = "ALWAYS"
  inline val NEVER: "NEVER" = "NEVER"
  inline val ON_DISCONTINUITY: "ON_DISCONTINUITY" = "ON_DISCONTINUITY"

  inline def values: js.Array[HLSDiscontinuityMode] = js.Array(ALWAYS, NEVER, ON_DISCONTINUITY)
}

type HLSDisplayFragmentTimestamp = "ALWAYS" | "NEVER"
object HLSDisplayFragmentTimestamp {
  inline val ALWAYS: "ALWAYS" = "ALWAYS"
  inline val NEVER: "NEVER" = "NEVER"

  inline def values: js.Array[HLSDisplayFragmentTimestamp] = js.Array(ALWAYS, NEVER)
}

type HLSFragmentSelectorType = "PRODUCER_TIMESTAMP" | "SERVER_TIMESTAMP"
object HLSFragmentSelectorType {
  inline val PRODUCER_TIMESTAMP: "PRODUCER_TIMESTAMP" = "PRODUCER_TIMESTAMP"
  inline val SERVER_TIMESTAMP: "SERVER_TIMESTAMP" = "SERVER_TIMESTAMP"

  inline def values: js.Array[HLSFragmentSelectorType] = js.Array(PRODUCER_TIMESTAMP, SERVER_TIMESTAMP)
}

type HLSPlaybackMode = "LIVE" | "LIVE_REPLAY" | "ON_DEMAND"
object HLSPlaybackMode {
  inline val LIVE: "LIVE" = "LIVE"
  inline val LIVE_REPLAY: "LIVE_REPLAY" = "LIVE_REPLAY"
  inline val ON_DEMAND: "ON_DEMAND" = "ON_DEMAND"

  inline def values: js.Array[HLSPlaybackMode] = js.Array(LIVE, LIVE_REPLAY, ON_DEMAND)
}
