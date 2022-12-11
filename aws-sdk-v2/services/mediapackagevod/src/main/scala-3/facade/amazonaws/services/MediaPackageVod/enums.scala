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

type PresetSpeke20Audio = "PRESET-AUDIO-1" | "PRESET-AUDIO-2" | "PRESET-AUDIO-3" | "SHARED" | "UNENCRYPTED"
object PresetSpeke20Audio {
  inline val `PRESET-AUDIO-1`: "PRESET-AUDIO-1" = "PRESET-AUDIO-1"
  inline val `PRESET-AUDIO-2`: "PRESET-AUDIO-2" = "PRESET-AUDIO-2"
  inline val `PRESET-AUDIO-3`: "PRESET-AUDIO-3" = "PRESET-AUDIO-3"
  inline val SHARED: "SHARED" = "SHARED"
  inline val UNENCRYPTED: "UNENCRYPTED" = "UNENCRYPTED"

  inline def values: js.Array[PresetSpeke20Audio] = js.Array(`PRESET-AUDIO-1`, `PRESET-AUDIO-2`, `PRESET-AUDIO-3`, SHARED, UNENCRYPTED)
}

type PresetSpeke20Video = "PRESET-VIDEO-1" | "PRESET-VIDEO-2" | "PRESET-VIDEO-3" | "PRESET-VIDEO-4" | "PRESET-VIDEO-5" | "PRESET-VIDEO-6" | "PRESET-VIDEO-7" | "PRESET-VIDEO-8" | "SHARED" | "UNENCRYPTED"
object PresetSpeke20Video {
  inline val `PRESET-VIDEO-1`: "PRESET-VIDEO-1" = "PRESET-VIDEO-1"
  inline val `PRESET-VIDEO-2`: "PRESET-VIDEO-2" = "PRESET-VIDEO-2"
  inline val `PRESET-VIDEO-3`: "PRESET-VIDEO-3" = "PRESET-VIDEO-3"
  inline val `PRESET-VIDEO-4`: "PRESET-VIDEO-4" = "PRESET-VIDEO-4"
  inline val `PRESET-VIDEO-5`: "PRESET-VIDEO-5" = "PRESET-VIDEO-5"
  inline val `PRESET-VIDEO-6`: "PRESET-VIDEO-6" = "PRESET-VIDEO-6"
  inline val `PRESET-VIDEO-7`: "PRESET-VIDEO-7" = "PRESET-VIDEO-7"
  inline val `PRESET-VIDEO-8`: "PRESET-VIDEO-8" = "PRESET-VIDEO-8"
  inline val SHARED: "SHARED" = "SHARED"
  inline val UNENCRYPTED: "UNENCRYPTED" = "UNENCRYPTED"

  inline def values: js.Array[PresetSpeke20Video] = js.Array(
    `PRESET-VIDEO-1`,
    `PRESET-VIDEO-2`,
    `PRESET-VIDEO-3`,
    `PRESET-VIDEO-4`,
    `PRESET-VIDEO-5`,
    `PRESET-VIDEO-6`,
    `PRESET-VIDEO-7`,
    `PRESET-VIDEO-8`,
    SHARED,
    UNENCRYPTED
  )
}

type Profile = "NONE" | "HBBTV_1_5"
object Profile {
  inline val NONE: "NONE" = "NONE"
  inline val HBBTV_1_5: "HBBTV_1_5" = "HBBTV_1_5"

  inline def values: js.Array[Profile] = js.Array(NONE, HBBTV_1_5)
}

type ScteMarkersSource = "SEGMENTS" | "MANIFEST"
object ScteMarkersSource {
  inline val SEGMENTS: "SEGMENTS" = "SEGMENTS"
  inline val MANIFEST: "MANIFEST" = "MANIFEST"

  inline def values: js.Array[ScteMarkersSource] = js.Array(SEGMENTS, MANIFEST)
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
