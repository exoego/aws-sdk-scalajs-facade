package facade.amazonaws.services.mediapackage

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AdMarkers extends js.Any
object AdMarkers {
  val NONE = "NONE".asInstanceOf[AdMarkers]
  val SCTE35_ENHANCED = "SCTE35_ENHANCED".asInstanceOf[AdMarkers]
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[AdMarkers]
  val DATERANGE = "DATERANGE".asInstanceOf[AdMarkers]

  @inline def values = js.Array(NONE, SCTE35_ENHANCED, PASSTHROUGH, DATERANGE)
}

/** This setting allows the delivery restriction flags on SCTE-35 segmentation descriptors to determine whether a message signals an ad. Choosing "NONE" means no SCTE-35 messages become ads. Choosing "RESTRICTED" means SCTE-35 messages of the types specified in AdTriggers that contain delivery restrictions will be treated as ads. Choosing "UNRESTRICTED" means SCTE-35 messages of the types specified in AdTriggers that do not contain delivery restrictions will be treated as ads. Choosing "BOTH" means all SCTE-35 messages of the types specified in AdTriggers will be treated as ads. Note that Splice Insert messages do not have these flags and are always treated as ads if specified in AdTriggers.
  */
@js.native
sealed trait AdsOnDeliveryRestrictions extends js.Any
object AdsOnDeliveryRestrictions {
  val NONE = "NONE".asInstanceOf[AdsOnDeliveryRestrictions]
  val RESTRICTED = "RESTRICTED".asInstanceOf[AdsOnDeliveryRestrictions]
  val UNRESTRICTED = "UNRESTRICTED".asInstanceOf[AdsOnDeliveryRestrictions]
  val BOTH = "BOTH".asInstanceOf[AdsOnDeliveryRestrictions]

  @inline def values = js.Array(NONE, RESTRICTED, UNRESTRICTED, BOTH)
}

@js.native
sealed trait EncryptionMethod extends js.Any
object EncryptionMethod {
  val AES_128 = "AES_128".asInstanceOf[EncryptionMethod]
  val SAMPLE_AES = "SAMPLE_AES".asInstanceOf[EncryptionMethod]

  @inline def values = js.Array(AES_128, SAMPLE_AES)
}

@js.native
sealed trait ManifestLayout extends js.Any
object ManifestLayout {
  val FULL = "FULL".asInstanceOf[ManifestLayout]
  val COMPACT = "COMPACT".asInstanceOf[ManifestLayout]

  @inline def values = js.Array(FULL, COMPACT)
}

@js.native
sealed trait Origination extends js.Any
object Origination {
  val ALLOW = "ALLOW".asInstanceOf[Origination]
  val DENY = "DENY".asInstanceOf[Origination]

  @inline def values = js.Array(ALLOW, DENY)
}

@js.native
sealed trait PlaylistType extends js.Any
object PlaylistType {
  val NONE = "NONE".asInstanceOf[PlaylistType]
  val EVENT = "EVENT".asInstanceOf[PlaylistType]
  val VOD = "VOD".asInstanceOf[PlaylistType]

  @inline def values = js.Array(NONE, EVENT, VOD)
}

@js.native
sealed trait PresetSpeke20Audio extends js.Any
object PresetSpeke20Audio {
  val `PRESET-AUDIO-1` = "PRESET-AUDIO-1".asInstanceOf[PresetSpeke20Audio]

  @inline def values = js.Array(`PRESET-AUDIO-1`)
}

@js.native
sealed trait PresetSpeke20Video extends js.Any
object PresetSpeke20Video {
  val `PRESET-VIDEO-1` = "PRESET-VIDEO-1".asInstanceOf[PresetSpeke20Video]

  @inline def values = js.Array(`PRESET-VIDEO-1`)
}

@js.native
sealed trait Profile extends js.Any
object Profile {
  val NONE = "NONE".asInstanceOf[Profile]
  val HBBTV_1_5 = "HBBTV_1_5".asInstanceOf[Profile]

  @inline def values = js.Array(NONE, HBBTV_1_5)
}

@js.native
sealed trait SegmentTemplateFormat extends js.Any
object SegmentTemplateFormat {
  val NUMBER_WITH_TIMELINE = "NUMBER_WITH_TIMELINE".asInstanceOf[SegmentTemplateFormat]
  val TIME_WITH_TIMELINE = "TIME_WITH_TIMELINE".asInstanceOf[SegmentTemplateFormat]
  val NUMBER_WITH_DURATION = "NUMBER_WITH_DURATION".asInstanceOf[SegmentTemplateFormat]

  @inline def values = js.Array(NUMBER_WITH_TIMELINE, TIME_WITH_TIMELINE, NUMBER_WITH_DURATION)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[Status]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[Status]
  val FAILED = "FAILED".asInstanceOf[Status]

  @inline def values = js.Array(IN_PROGRESS, SUCCEEDED, FAILED)
}

@js.native
sealed trait StreamOrder extends js.Any
object StreamOrder {
  val ORIGINAL = "ORIGINAL".asInstanceOf[StreamOrder]
  val VIDEO_BITRATE_ASCENDING = "VIDEO_BITRATE_ASCENDING".asInstanceOf[StreamOrder]
  val VIDEO_BITRATE_DESCENDING = "VIDEO_BITRATE_DESCENDING".asInstanceOf[StreamOrder]

  @inline def values = js.Array(ORIGINAL, VIDEO_BITRATE_ASCENDING, VIDEO_BITRATE_DESCENDING)
}

@js.native
sealed trait UtcTiming extends js.Any
object UtcTiming {
  val NONE = "NONE".asInstanceOf[UtcTiming]
  val `HTTP-HEAD` = "HTTP-HEAD".asInstanceOf[UtcTiming]
  val `HTTP-ISO` = "HTTP-ISO".asInstanceOf[UtcTiming]

  @inline def values = js.Array(NONE, `HTTP-HEAD`, `HTTP-ISO`)
}

@js.native
sealed trait __AdTriggersElement extends js.Any
object __AdTriggersElement {
  val SPLICE_INSERT = "SPLICE_INSERT".asInstanceOf[__AdTriggersElement]
  val BREAK = "BREAK".asInstanceOf[__AdTriggersElement]
  val PROVIDER_ADVERTISEMENT = "PROVIDER_ADVERTISEMENT".asInstanceOf[__AdTriggersElement]
  val DISTRIBUTOR_ADVERTISEMENT = "DISTRIBUTOR_ADVERTISEMENT".asInstanceOf[__AdTriggersElement]
  val PROVIDER_PLACEMENT_OPPORTUNITY = "PROVIDER_PLACEMENT_OPPORTUNITY".asInstanceOf[__AdTriggersElement]
  val DISTRIBUTOR_PLACEMENT_OPPORTUNITY = "DISTRIBUTOR_PLACEMENT_OPPORTUNITY".asInstanceOf[__AdTriggersElement]
  val PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY = "PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY".asInstanceOf[__AdTriggersElement]
  val DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY = "DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY".asInstanceOf[__AdTriggersElement]

  @inline def values = js.Array(
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

@js.native
sealed trait __PeriodTriggersElement extends js.Any
object __PeriodTriggersElement {
  val ADS = "ADS".asInstanceOf[__PeriodTriggersElement]

  @inline def values = js.Array(ADS)
}
