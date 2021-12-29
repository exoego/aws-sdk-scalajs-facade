package facade.amazonaws.services.mediapackagevod

import scalajs._

type AdMarkers = "NONE" | "SCTE35_ENHANCED" | "PASSTHROUGH"
object AdMarkers {
  val NONE: "NONE" = "NONE"
  val SCTE35_ENHANCED: "SCTE35_ENHANCED" = "SCTE35_ENHANCED"
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  @inline def values = js.Array[AdMarkers](NONE, SCTE35_ENHANCED, PASSTHROUGH)
}

type EncryptionMethod = "AES_128" | "SAMPLE_AES"
object EncryptionMethod {
  val AES_128: "AES_128" = "AES_128"
  val SAMPLE_AES: "SAMPLE_AES" = "SAMPLE_AES"

  @inline def values = js.Array[EncryptionMethod](AES_128, SAMPLE_AES)
}

type ManifestLayout = "FULL" | "COMPACT"
object ManifestLayout {
  val FULL: "FULL" = "FULL"
  val COMPACT: "COMPACT" = "COMPACT"

  @inline def values = js.Array[ManifestLayout](FULL, COMPACT)
}

type Profile = "NONE" | "HBBTV_1_5"
object Profile {
  val NONE: "NONE" = "NONE"
  val HBBTV_1_5: "HBBTV_1_5" = "HBBTV_1_5"

  @inline def values = js.Array[Profile](NONE, HBBTV_1_5)
}

type SegmentTemplateFormat = "NUMBER_WITH_TIMELINE" | "TIME_WITH_TIMELINE" | "NUMBER_WITH_DURATION"
object SegmentTemplateFormat {
  val NUMBER_WITH_TIMELINE: "NUMBER_WITH_TIMELINE" = "NUMBER_WITH_TIMELINE"
  val TIME_WITH_TIMELINE: "TIME_WITH_TIMELINE" = "TIME_WITH_TIMELINE"
  val NUMBER_WITH_DURATION: "NUMBER_WITH_DURATION" = "NUMBER_WITH_DURATION"

  @inline def values = js.Array[SegmentTemplateFormat](NUMBER_WITH_TIMELINE, TIME_WITH_TIMELINE, NUMBER_WITH_DURATION)
}

type StreamOrder = "ORIGINAL" | "VIDEO_BITRATE_ASCENDING" | "VIDEO_BITRATE_DESCENDING"
object StreamOrder {
  val ORIGINAL: "ORIGINAL" = "ORIGINAL"
  val VIDEO_BITRATE_ASCENDING: "VIDEO_BITRATE_ASCENDING" = "VIDEO_BITRATE_ASCENDING"
  val VIDEO_BITRATE_DESCENDING: "VIDEO_BITRATE_DESCENDING" = "VIDEO_BITRATE_DESCENDING"

  @inline def values = js.Array[StreamOrder](ORIGINAL, VIDEO_BITRATE_ASCENDING, VIDEO_BITRATE_DESCENDING)
}

type __PeriodTriggersElement = "ADS"
object __PeriodTriggersElement {
  val ADS: "ADS" = "ADS"

  @inline def values = js.Array[__PeriodTriggersElement](ADS)
}
