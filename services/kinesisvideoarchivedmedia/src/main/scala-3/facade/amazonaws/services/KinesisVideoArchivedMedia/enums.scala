package facade.amazonaws.services.kinesisvideoarchivedmedia

import scalajs._

type ClipFragmentSelectorType = "PRODUCER_TIMESTAMP" | "SERVER_TIMESTAMP"
object ClipFragmentSelectorType {
  val PRODUCER_TIMESTAMP: "PRODUCER_TIMESTAMP" = "PRODUCER_TIMESTAMP"
  val SERVER_TIMESTAMP: "SERVER_TIMESTAMP" = "SERVER_TIMESTAMP"

  @inline def values = js.Array[ClipFragmentSelectorType](PRODUCER_TIMESTAMP, SERVER_TIMESTAMP)
}

type ContainerFormat = "FRAGMENTED_MP4" | "MPEG_TS"
object ContainerFormat {
  val FRAGMENTED_MP4: "FRAGMENTED_MP4" = "FRAGMENTED_MP4"
  val MPEG_TS: "MPEG_TS" = "MPEG_TS"

  @inline def values = js.Array[ContainerFormat](FRAGMENTED_MP4, MPEG_TS)
}

type DASHDisplayFragmentNumber = "ALWAYS" | "NEVER"
object DASHDisplayFragmentNumber {
  val ALWAYS: "ALWAYS" = "ALWAYS"
  val NEVER: "NEVER" = "NEVER"

  @inline def values = js.Array[DASHDisplayFragmentNumber](ALWAYS, NEVER)
}

type DASHDisplayFragmentTimestamp = "ALWAYS" | "NEVER"
object DASHDisplayFragmentTimestamp {
  val ALWAYS: "ALWAYS" = "ALWAYS"
  val NEVER: "NEVER" = "NEVER"

  @inline def values = js.Array[DASHDisplayFragmentTimestamp](ALWAYS, NEVER)
}

type DASHFragmentSelectorType = "PRODUCER_TIMESTAMP" | "SERVER_TIMESTAMP"
object DASHFragmentSelectorType {
  val PRODUCER_TIMESTAMP: "PRODUCER_TIMESTAMP" = "PRODUCER_TIMESTAMP"
  val SERVER_TIMESTAMP: "SERVER_TIMESTAMP" = "SERVER_TIMESTAMP"

  @inline def values = js.Array[DASHFragmentSelectorType](PRODUCER_TIMESTAMP, SERVER_TIMESTAMP)
}

type DASHPlaybackMode = "LIVE" | "LIVE_REPLAY" | "ON_DEMAND"
object DASHPlaybackMode {
  val LIVE: "LIVE" = "LIVE"
  val LIVE_REPLAY: "LIVE_REPLAY" = "LIVE_REPLAY"
  val ON_DEMAND: "ON_DEMAND" = "ON_DEMAND"

  @inline def values = js.Array[DASHPlaybackMode](LIVE, LIVE_REPLAY, ON_DEMAND)
}

type FragmentSelectorType = "PRODUCER_TIMESTAMP" | "SERVER_TIMESTAMP"
object FragmentSelectorType {
  val PRODUCER_TIMESTAMP: "PRODUCER_TIMESTAMP" = "PRODUCER_TIMESTAMP"
  val SERVER_TIMESTAMP: "SERVER_TIMESTAMP" = "SERVER_TIMESTAMP"

  @inline def values = js.Array[FragmentSelectorType](PRODUCER_TIMESTAMP, SERVER_TIMESTAMP)
}

type HLSDiscontinuityMode = "ALWAYS" | "NEVER" | "ON_DISCONTINUITY"
object HLSDiscontinuityMode {
  val ALWAYS: "ALWAYS" = "ALWAYS"
  val NEVER: "NEVER" = "NEVER"
  val ON_DISCONTINUITY: "ON_DISCONTINUITY" = "ON_DISCONTINUITY"

  @inline def values = js.Array[HLSDiscontinuityMode](ALWAYS, NEVER, ON_DISCONTINUITY)
}

type HLSDisplayFragmentTimestamp = "ALWAYS" | "NEVER"
object HLSDisplayFragmentTimestamp {
  val ALWAYS: "ALWAYS" = "ALWAYS"
  val NEVER: "NEVER" = "NEVER"

  @inline def values = js.Array[HLSDisplayFragmentTimestamp](ALWAYS, NEVER)
}

type HLSFragmentSelectorType = "PRODUCER_TIMESTAMP" | "SERVER_TIMESTAMP"
object HLSFragmentSelectorType {
  val PRODUCER_TIMESTAMP: "PRODUCER_TIMESTAMP" = "PRODUCER_TIMESTAMP"
  val SERVER_TIMESTAMP: "SERVER_TIMESTAMP" = "SERVER_TIMESTAMP"

  @inline def values = js.Array[HLSFragmentSelectorType](PRODUCER_TIMESTAMP, SERVER_TIMESTAMP)
}

type HLSPlaybackMode = "LIVE" | "LIVE_REPLAY" | "ON_DEMAND"
object HLSPlaybackMode {
  val LIVE: "LIVE" = "LIVE"
  val LIVE_REPLAY: "LIVE_REPLAY" = "LIVE_REPLAY"
  val ON_DEMAND: "ON_DEMAND" = "ON_DEMAND"

  @inline def values = js.Array[HLSPlaybackMode](LIVE, LIVE_REPLAY, ON_DEMAND)
}
