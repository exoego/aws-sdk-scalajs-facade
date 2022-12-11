package facade.amazonaws.services.kinesisvideoarchivedmedia

import scalajs.js

@js.native
sealed trait ClipFragmentSelectorType extends js.Any
object ClipFragmentSelectorType {
  val PRODUCER_TIMESTAMP = "PRODUCER_TIMESTAMP".asInstanceOf[ClipFragmentSelectorType]
  val SERVER_TIMESTAMP = "SERVER_TIMESTAMP".asInstanceOf[ClipFragmentSelectorType]

  @inline def values: js.Array[ClipFragmentSelectorType] = js.Array(PRODUCER_TIMESTAMP, SERVER_TIMESTAMP)
}

@js.native
sealed trait ContainerFormat extends js.Any
object ContainerFormat {
  val FRAGMENTED_MP4 = "FRAGMENTED_MP4".asInstanceOf[ContainerFormat]
  val MPEG_TS = "MPEG_TS".asInstanceOf[ContainerFormat]

  @inline def values: js.Array[ContainerFormat] = js.Array(FRAGMENTED_MP4, MPEG_TS)
}

@js.native
sealed trait DASHDisplayFragmentNumber extends js.Any
object DASHDisplayFragmentNumber {
  val ALWAYS = "ALWAYS".asInstanceOf[DASHDisplayFragmentNumber]
  val NEVER = "NEVER".asInstanceOf[DASHDisplayFragmentNumber]

  @inline def values: js.Array[DASHDisplayFragmentNumber] = js.Array(ALWAYS, NEVER)
}

@js.native
sealed trait DASHDisplayFragmentTimestamp extends js.Any
object DASHDisplayFragmentTimestamp {
  val ALWAYS = "ALWAYS".asInstanceOf[DASHDisplayFragmentTimestamp]
  val NEVER = "NEVER".asInstanceOf[DASHDisplayFragmentTimestamp]

  @inline def values: js.Array[DASHDisplayFragmentTimestamp] = js.Array(ALWAYS, NEVER)
}

@js.native
sealed trait DASHFragmentSelectorType extends js.Any
object DASHFragmentSelectorType {
  val PRODUCER_TIMESTAMP = "PRODUCER_TIMESTAMP".asInstanceOf[DASHFragmentSelectorType]
  val SERVER_TIMESTAMP = "SERVER_TIMESTAMP".asInstanceOf[DASHFragmentSelectorType]

  @inline def values: js.Array[DASHFragmentSelectorType] = js.Array(PRODUCER_TIMESTAMP, SERVER_TIMESTAMP)
}

@js.native
sealed trait DASHPlaybackMode extends js.Any
object DASHPlaybackMode {
  val LIVE = "LIVE".asInstanceOf[DASHPlaybackMode]
  val LIVE_REPLAY = "LIVE_REPLAY".asInstanceOf[DASHPlaybackMode]
  val ON_DEMAND = "ON_DEMAND".asInstanceOf[DASHPlaybackMode]

  @inline def values: js.Array[DASHPlaybackMode] = js.Array(LIVE, LIVE_REPLAY, ON_DEMAND)
}

@js.native
sealed trait Format extends js.Any
object Format {
  val JPEG = "JPEG".asInstanceOf[Format]
  val PNG = "PNG".asInstanceOf[Format]

  @inline def values: js.Array[Format] = js.Array(JPEG, PNG)
}

@js.native
sealed trait FormatConfigKey extends js.Any
object FormatConfigKey {
  val JPEGQuality = "JPEGQuality".asInstanceOf[FormatConfigKey]

  @inline def values: js.Array[FormatConfigKey] = js.Array(JPEGQuality)
}

@js.native
sealed trait FragmentSelectorType extends js.Any
object FragmentSelectorType {
  val PRODUCER_TIMESTAMP = "PRODUCER_TIMESTAMP".asInstanceOf[FragmentSelectorType]
  val SERVER_TIMESTAMP = "SERVER_TIMESTAMP".asInstanceOf[FragmentSelectorType]

  @inline def values: js.Array[FragmentSelectorType] = js.Array(PRODUCER_TIMESTAMP, SERVER_TIMESTAMP)
}

@js.native
sealed trait HLSDiscontinuityMode extends js.Any
object HLSDiscontinuityMode {
  val ALWAYS = "ALWAYS".asInstanceOf[HLSDiscontinuityMode]
  val NEVER = "NEVER".asInstanceOf[HLSDiscontinuityMode]
  val ON_DISCONTINUITY = "ON_DISCONTINUITY".asInstanceOf[HLSDiscontinuityMode]

  @inline def values: js.Array[HLSDiscontinuityMode] = js.Array(ALWAYS, NEVER, ON_DISCONTINUITY)
}

@js.native
sealed trait HLSDisplayFragmentTimestamp extends js.Any
object HLSDisplayFragmentTimestamp {
  val ALWAYS = "ALWAYS".asInstanceOf[HLSDisplayFragmentTimestamp]
  val NEVER = "NEVER".asInstanceOf[HLSDisplayFragmentTimestamp]

  @inline def values: js.Array[HLSDisplayFragmentTimestamp] = js.Array(ALWAYS, NEVER)
}

@js.native
sealed trait HLSFragmentSelectorType extends js.Any
object HLSFragmentSelectorType {
  val PRODUCER_TIMESTAMP = "PRODUCER_TIMESTAMP".asInstanceOf[HLSFragmentSelectorType]
  val SERVER_TIMESTAMP = "SERVER_TIMESTAMP".asInstanceOf[HLSFragmentSelectorType]

  @inline def values: js.Array[HLSFragmentSelectorType] = js.Array(PRODUCER_TIMESTAMP, SERVER_TIMESTAMP)
}

@js.native
sealed trait HLSPlaybackMode extends js.Any
object HLSPlaybackMode {
  val LIVE = "LIVE".asInstanceOf[HLSPlaybackMode]
  val LIVE_REPLAY = "LIVE_REPLAY".asInstanceOf[HLSPlaybackMode]
  val ON_DEMAND = "ON_DEMAND".asInstanceOf[HLSPlaybackMode]

  @inline def values: js.Array[HLSPlaybackMode] = js.Array(LIVE, LIVE_REPLAY, ON_DEMAND)
}

@js.native
sealed trait ImageError extends js.Any
object ImageError {
  val NO_MEDIA = "NO_MEDIA".asInstanceOf[ImageError]
  val MEDIA_ERROR = "MEDIA_ERROR".asInstanceOf[ImageError]

  @inline def values: js.Array[ImageError] = js.Array(NO_MEDIA, MEDIA_ERROR)
}

@js.native
sealed trait ImageSelectorType extends js.Any
object ImageSelectorType {
  val PRODUCER_TIMESTAMP = "PRODUCER_TIMESTAMP".asInstanceOf[ImageSelectorType]
  val SERVER_TIMESTAMP = "SERVER_TIMESTAMP".asInstanceOf[ImageSelectorType]

  @inline def values: js.Array[ImageSelectorType] = js.Array(PRODUCER_TIMESTAMP, SERVER_TIMESTAMP)
}
