package facade.amazonaws.services.mediapackagevod

import scalajs.js

type AdMarkers = "NONE" | "SCTE35_ENHANCED" | "PASSTHROUGH"
object AdMarkers {
  inline val NONE: "NONE" = "NONE"
  inline val SCTE35_ENHANCED: "SCTE35_ENHANCED" = "SCTE35_ENHANCED"
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  inline def values: js.Array[AdMarkers] = js.Array(NONE, SCTE35_ENHANCED, PASSTHROUGH)
}

type EncryptionMethod = "AES_128" | "SAMPLE_AES"
object EncryptionMethod {
  inline val AES_128: "AES_128" = "AES_128"
  inline val SAMPLE_AES: "SAMPLE_AES" = "SAMPLE_AES"

  inline def values: js.Array[EncryptionMethod] = js.Array(AES_128, SAMPLE_AES)
}

type ManifestLayout = "FULL" | "COMPACT"
object ManifestLayout {
  inline val FULL: "FULL" = "FULL"
  inline val COMPACT: "COMPACT" = "COMPACT"

  inline def values: js.Array[ManifestLayout] = js.Array(FULL, COMPACT)
}

type Profile = "NONE" | "HBBTV_1_5"
object Profile {
  inline val NONE: "NONE" = "NONE"
  inline val HBBTV_1_5: "HBBTV_1_5" = "HBBTV_1_5"

  inline def values: js.Array[Profile] = js.Array(NONE, HBBTV_1_5)
}

type SegmentTemplateFormat = "NUMBER_WITH_TIMELINE" | "TIME_WITH_TIMELINE" | "NUMBER_WITH_DURATION"
object SegmentTemplateFormat {
  inline val NUMBER_WITH_TIMELINE: "NUMBER_WITH_TIMELINE" = "NUMBER_WITH_TIMELINE"
  inline val TIME_WITH_TIMELINE: "TIME_WITH_TIMELINE" = "TIME_WITH_TIMELINE"
  inline val NUMBER_WITH_DURATION: "NUMBER_WITH_DURATION" = "NUMBER_WITH_DURATION"

  inline def values: js.Array[SegmentTemplateFormat] = js.Array(NUMBER_WITH_TIMELINE, TIME_WITH_TIMELINE, NUMBER_WITH_DURATION)
}

type StreamOrder = "ORIGINAL" | "VIDEO_BITRATE_ASCENDING" | "VIDEO_BITRATE_DESCENDING"
object StreamOrder {
  inline val ORIGINAL: "ORIGINAL" = "ORIGINAL"
  inline val VIDEO_BITRATE_ASCENDING: "VIDEO_BITRATE_ASCENDING" = "VIDEO_BITRATE_ASCENDING"
  inline val VIDEO_BITRATE_DESCENDING: "VIDEO_BITRATE_DESCENDING" = "VIDEO_BITRATE_DESCENDING"

  inline def values: js.Array[StreamOrder] = js.Array(ORIGINAL, VIDEO_BITRATE_ASCENDING, VIDEO_BITRATE_DESCENDING)
}

type __PeriodTriggersElement = "ADS"
object __PeriodTriggersElement {
  inline val ADS: "ADS" = "ADS"

  inline def values: js.Array[__PeriodTriggersElement] = js.Array(ADS)
}
