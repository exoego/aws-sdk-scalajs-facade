package facade.amazonaws.services.mediapackage

import scalajs._

type AdMarkers = "NONE" | "SCTE35_ENHANCED" | "PASSTHROUGH" | "DATERANGE"
object AdMarkers {
  val NONE: "NONE" = "NONE"
  val SCTE35_ENHANCED: "SCTE35_ENHANCED" = "SCTE35_ENHANCED"
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"
  val DATERANGE: "DATERANGE" = "DATERANGE"

  @inline def values = js.Array[AdMarkers](NONE, SCTE35_ENHANCED, PASSTHROUGH, DATERANGE)
}

/** This setting allows the delivery restriction flags on SCTE-35 segmentation descriptors to determine whether a message signals an ad. Choosing "NONE" means no SCTE-35 messages become ads. Choosing "RESTRICTED" means SCTE-35 messages of the types specified in AdTriggers that contain delivery restrictions will be treated as ads. Choosing "UNRESTRICTED" means SCTE-35 messages of the types specified in AdTriggers that do not contain delivery restrictions will be treated as ads. Choosing "BOTH" means all SCTE-35 messages of the types specified in AdTriggers will be treated as ads. Note that Splice Insert messages do not have these flags and are always treated as ads if specified in AdTriggers.
  */
type AdsOnDeliveryRestrictions = "NONE" | "RESTRICTED" | "UNRESTRICTED" | "BOTH"
object AdsOnDeliveryRestrictions {
  val NONE: "NONE" = "NONE"
  val RESTRICTED: "RESTRICTED" = "RESTRICTED"
  val UNRESTRICTED: "UNRESTRICTED" = "UNRESTRICTED"
  val BOTH: "BOTH" = "BOTH"

  @inline def values = js.Array[AdsOnDeliveryRestrictions](NONE, RESTRICTED, UNRESTRICTED, BOTH)
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

type Origination = "ALLOW" | "DENY"
object Origination {
  val ALLOW: "ALLOW" = "ALLOW"
  val DENY: "DENY" = "DENY"

  @inline def values = js.Array[Origination](ALLOW, DENY)
}

type PlaylistType = "NONE" | "EVENT" | "VOD"
object PlaylistType {
  val NONE: "NONE" = "NONE"
  val EVENT: "EVENT" = "EVENT"
  val VOD: "VOD" = "VOD"

  @inline def values = js.Array[PlaylistType](NONE, EVENT, VOD)
}

type PresetSpeke20Audio = "PRESET-AUDIO-1"
object PresetSpeke20Audio {
  val `PRESET-AUDIO-1`: "PRESET-AUDIO-1" = "PRESET-AUDIO-1"

  @inline def values = js.Array[PresetSpeke20Audio](`PRESET-AUDIO-1`)
}

type PresetSpeke20Video = "PRESET-VIDEO-1"
object PresetSpeke20Video {
  val `PRESET-VIDEO-1`: "PRESET-VIDEO-1" = "PRESET-VIDEO-1"

  @inline def values = js.Array[PresetSpeke20Video](`PRESET-VIDEO-1`)
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

type Status = "IN_PROGRESS" | "SUCCEEDED" | "FAILED"
object Status {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[Status](IN_PROGRESS, SUCCEEDED, FAILED)
}

type StreamOrder = "ORIGINAL" | "VIDEO_BITRATE_ASCENDING" | "VIDEO_BITRATE_DESCENDING"
object StreamOrder {
  val ORIGINAL: "ORIGINAL" = "ORIGINAL"
  val VIDEO_BITRATE_ASCENDING: "VIDEO_BITRATE_ASCENDING" = "VIDEO_BITRATE_ASCENDING"
  val VIDEO_BITRATE_DESCENDING: "VIDEO_BITRATE_DESCENDING" = "VIDEO_BITRATE_DESCENDING"

  @inline def values = js.Array[StreamOrder](ORIGINAL, VIDEO_BITRATE_ASCENDING, VIDEO_BITRATE_DESCENDING)
}

type UtcTiming = "NONE" | "HTTP-HEAD" | "HTTP-ISO"
object UtcTiming {
  val NONE: "NONE" = "NONE"
  val `HTTP-HEAD`: "HTTP-HEAD" = "HTTP-HEAD"
  val `HTTP-ISO`: "HTTP-ISO" = "HTTP-ISO"

  @inline def values = js.Array[UtcTiming](NONE, `HTTP-HEAD`, `HTTP-ISO`)
}

type __AdTriggersElement = "SPLICE_INSERT" | "BREAK" | "PROVIDER_ADVERTISEMENT" | "DISTRIBUTOR_ADVERTISEMENT" | "PROVIDER_PLACEMENT_OPPORTUNITY" | "DISTRIBUTOR_PLACEMENT_OPPORTUNITY" | "PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY" | "DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY"
object __AdTriggersElement {
  val SPLICE_INSERT: "SPLICE_INSERT" = "SPLICE_INSERT"
  val BREAK: "BREAK" = "BREAK"
  val PROVIDER_ADVERTISEMENT: "PROVIDER_ADVERTISEMENT" = "PROVIDER_ADVERTISEMENT"
  val DISTRIBUTOR_ADVERTISEMENT: "DISTRIBUTOR_ADVERTISEMENT" = "DISTRIBUTOR_ADVERTISEMENT"
  val PROVIDER_PLACEMENT_OPPORTUNITY: "PROVIDER_PLACEMENT_OPPORTUNITY" = "PROVIDER_PLACEMENT_OPPORTUNITY"
  val DISTRIBUTOR_PLACEMENT_OPPORTUNITY: "DISTRIBUTOR_PLACEMENT_OPPORTUNITY" = "DISTRIBUTOR_PLACEMENT_OPPORTUNITY"
  val PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY: "PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY" = "PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY"
  val DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY: "DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY" = "DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY"

  @inline def values = js.Array[__AdTriggersElement](
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
  val ADS: "ADS" = "ADS"

  @inline def values = js.Array[__PeriodTriggersElement](ADS)
}
