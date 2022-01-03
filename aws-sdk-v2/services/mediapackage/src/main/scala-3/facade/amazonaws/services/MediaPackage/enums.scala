package facade.amazonaws.services.mediapackage

import scalajs.js

type AdMarkers = "NONE" | "SCTE35_ENHANCED" | "PASSTHROUGH" | "DATERANGE"
object AdMarkers {
  inline val NONE: "NONE" = "NONE"
  inline val SCTE35_ENHANCED: "SCTE35_ENHANCED" = "SCTE35_ENHANCED"
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"
  inline val DATERANGE: "DATERANGE" = "DATERANGE"

  inline def values: js.Array[AdMarkers] = js.Array(NONE, SCTE35_ENHANCED, PASSTHROUGH, DATERANGE)
}

/** This setting allows the delivery restriction flags on SCTE-35 segmentation descriptors to determine whether a message signals an ad. Choosing "NONE" means no SCTE-35 messages become ads. Choosing "RESTRICTED" means SCTE-35 messages of the types specified in AdTriggers that contain delivery restrictions will be treated as ads. Choosing "UNRESTRICTED" means SCTE-35 messages of the types specified in AdTriggers that do not contain delivery restrictions will be treated as ads. Choosing "BOTH" means all SCTE-35 messages of the types specified in AdTriggers will be treated as ads. Note that Splice Insert messages do not have these flags and are always treated as ads if specified in AdTriggers.
  */
type AdsOnDeliveryRestrictions = "NONE" | "RESTRICTED" | "UNRESTRICTED" | "BOTH"
object AdsOnDeliveryRestrictions {
  inline val NONE: "NONE" = "NONE"
  inline val RESTRICTED: "RESTRICTED" = "RESTRICTED"
  inline val UNRESTRICTED: "UNRESTRICTED" = "UNRESTRICTED"
  inline val BOTH: "BOTH" = "BOTH"

  inline def values: js.Array[AdsOnDeliveryRestrictions] = js.Array(NONE, RESTRICTED, UNRESTRICTED, BOTH)
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

type Origination = "ALLOW" | "DENY"
object Origination {
  inline val ALLOW: "ALLOW" = "ALLOW"
  inline val DENY: "DENY" = "DENY"

  inline def values: js.Array[Origination] = js.Array(ALLOW, DENY)
}

type PlaylistType = "NONE" | "EVENT" | "VOD"
object PlaylistType {
  inline val NONE: "NONE" = "NONE"
  inline val EVENT: "EVENT" = "EVENT"
  inline val VOD: "VOD" = "VOD"

  inline def values: js.Array[PlaylistType] = js.Array(NONE, EVENT, VOD)
}

type PresetSpeke20Audio = "PRESET-AUDIO-1"
object PresetSpeke20Audio {
  inline val `PRESET-AUDIO-1`: "PRESET-AUDIO-1" = "PRESET-AUDIO-1"

  inline def values: js.Array[PresetSpeke20Audio] = js.Array(`PRESET-AUDIO-1`)
}

type PresetSpeke20Video = "PRESET-VIDEO-1"
object PresetSpeke20Video {
  inline val `PRESET-VIDEO-1`: "PRESET-VIDEO-1" = "PRESET-VIDEO-1"

  inline def values: js.Array[PresetSpeke20Video] = js.Array(`PRESET-VIDEO-1`)
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

type Status = "IN_PROGRESS" | "SUCCEEDED" | "FAILED"
object Status {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[Status] = js.Array(IN_PROGRESS, SUCCEEDED, FAILED)
}

type StreamOrder = "ORIGINAL" | "VIDEO_BITRATE_ASCENDING" | "VIDEO_BITRATE_DESCENDING"
object StreamOrder {
  inline val ORIGINAL: "ORIGINAL" = "ORIGINAL"
  inline val VIDEO_BITRATE_ASCENDING: "VIDEO_BITRATE_ASCENDING" = "VIDEO_BITRATE_ASCENDING"
  inline val VIDEO_BITRATE_DESCENDING: "VIDEO_BITRATE_DESCENDING" = "VIDEO_BITRATE_DESCENDING"

  inline def values: js.Array[StreamOrder] = js.Array(ORIGINAL, VIDEO_BITRATE_ASCENDING, VIDEO_BITRATE_DESCENDING)
}

type UtcTiming = "NONE" | "HTTP-HEAD" | "HTTP-ISO"
object UtcTiming {
  inline val NONE: "NONE" = "NONE"
  inline val `HTTP-HEAD`: "HTTP-HEAD" = "HTTP-HEAD"
  inline val `HTTP-ISO`: "HTTP-ISO" = "HTTP-ISO"

  inline def values: js.Array[UtcTiming] = js.Array(NONE, `HTTP-HEAD`, `HTTP-ISO`)
}

type __AdTriggersElement = "SPLICE_INSERT" | "BREAK" | "PROVIDER_ADVERTISEMENT" | "DISTRIBUTOR_ADVERTISEMENT" | "PROVIDER_PLACEMENT_OPPORTUNITY" | "DISTRIBUTOR_PLACEMENT_OPPORTUNITY" | "PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY" | "DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY"
object __AdTriggersElement {
  inline val SPLICE_INSERT: "SPLICE_INSERT" = "SPLICE_INSERT"
  inline val BREAK: "BREAK" = "BREAK"
  inline val PROVIDER_ADVERTISEMENT: "PROVIDER_ADVERTISEMENT" = "PROVIDER_ADVERTISEMENT"
  inline val DISTRIBUTOR_ADVERTISEMENT: "DISTRIBUTOR_ADVERTISEMENT" = "DISTRIBUTOR_ADVERTISEMENT"
  inline val PROVIDER_PLACEMENT_OPPORTUNITY: "PROVIDER_PLACEMENT_OPPORTUNITY" = "PROVIDER_PLACEMENT_OPPORTUNITY"
  inline val DISTRIBUTOR_PLACEMENT_OPPORTUNITY: "DISTRIBUTOR_PLACEMENT_OPPORTUNITY" = "DISTRIBUTOR_PLACEMENT_OPPORTUNITY"
  inline val PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY: "PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY" = "PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY"
  inline val DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY: "DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY" = "DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY"

  inline def values: js.Array[__AdTriggersElement] = js.Array(
    SPLICE_INSERT,
    BREAK,
    PROVIDER_ADVERTISEMENT,
    DISTRIBUTOR_ADVERTISEMENT,
    PROVIDER_PLACEMENT_OPPORTUNITY,
    DISTRIBUTOR_PLACEMENT_OPPORTUNITY,
    PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY,
    DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY
  )
}

type __PeriodTriggersElement = "ADS"
object __PeriodTriggersElement {
  inline val ADS: "ADS" = "ADS"

  inline def values: js.Array[__PeriodTriggersElement] = js.Array(ADS)
}
