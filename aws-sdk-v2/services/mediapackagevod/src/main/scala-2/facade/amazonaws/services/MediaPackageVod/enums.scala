package facade.amazonaws.services.mediapackagevod

import scalajs.js

@js.native
sealed trait AdMarkers extends js.Any
object AdMarkers {
  val NONE = "NONE".asInstanceOf[AdMarkers]
  val SCTE35_ENHANCED = "SCTE35_ENHANCED".asInstanceOf[AdMarkers]
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[AdMarkers]

  @inline def values: js.Array[AdMarkers] = js.Array(NONE, SCTE35_ENHANCED, PASSTHROUGH)
}

@js.native
sealed trait EncryptionMethod extends js.Any
object EncryptionMethod {
  val AES_128 = "AES_128".asInstanceOf[EncryptionMethod]
  val SAMPLE_AES = "SAMPLE_AES".asInstanceOf[EncryptionMethod]

  @inline def values: js.Array[EncryptionMethod] = js.Array(AES_128, SAMPLE_AES)
}

@js.native
sealed trait ManifestLayout extends js.Any
object ManifestLayout {
  val FULL = "FULL".asInstanceOf[ManifestLayout]
  val COMPACT = "COMPACT".asInstanceOf[ManifestLayout]

  @inline def values: js.Array[ManifestLayout] = js.Array(FULL, COMPACT)
}

@js.native
sealed trait PresetSpeke20Audio extends js.Any
object PresetSpeke20Audio {
  val `PRESET-AUDIO-1` = "PRESET-AUDIO-1".asInstanceOf[PresetSpeke20Audio]
  val `PRESET-AUDIO-2` = "PRESET-AUDIO-2".asInstanceOf[PresetSpeke20Audio]
  val `PRESET-AUDIO-3` = "PRESET-AUDIO-3".asInstanceOf[PresetSpeke20Audio]
  val SHARED = "SHARED".asInstanceOf[PresetSpeke20Audio]
  val UNENCRYPTED = "UNENCRYPTED".asInstanceOf[PresetSpeke20Audio]

  @inline def values: js.Array[PresetSpeke20Audio] = js.Array(`PRESET-AUDIO-1`, `PRESET-AUDIO-2`, `PRESET-AUDIO-3`, SHARED, UNENCRYPTED)
}

@js.native
sealed trait PresetSpeke20Video extends js.Any
object PresetSpeke20Video {
  val `PRESET-VIDEO-1` = "PRESET-VIDEO-1".asInstanceOf[PresetSpeke20Video]
  val `PRESET-VIDEO-2` = "PRESET-VIDEO-2".asInstanceOf[PresetSpeke20Video]
  val `PRESET-VIDEO-3` = "PRESET-VIDEO-3".asInstanceOf[PresetSpeke20Video]
  val `PRESET-VIDEO-4` = "PRESET-VIDEO-4".asInstanceOf[PresetSpeke20Video]
  val `PRESET-VIDEO-5` = "PRESET-VIDEO-5".asInstanceOf[PresetSpeke20Video]
  val `PRESET-VIDEO-6` = "PRESET-VIDEO-6".asInstanceOf[PresetSpeke20Video]
  val `PRESET-VIDEO-7` = "PRESET-VIDEO-7".asInstanceOf[PresetSpeke20Video]
  val `PRESET-VIDEO-8` = "PRESET-VIDEO-8".asInstanceOf[PresetSpeke20Video]
  val SHARED = "SHARED".asInstanceOf[PresetSpeke20Video]
  val UNENCRYPTED = "UNENCRYPTED".asInstanceOf[PresetSpeke20Video]

  @inline def values: js.Array[PresetSpeke20Video] = js.Array(
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

@js.native
sealed trait Profile extends js.Any
object Profile {
  val NONE = "NONE".asInstanceOf[Profile]
  val HBBTV_1_5 = "HBBTV_1_5".asInstanceOf[Profile]

  @inline def values: js.Array[Profile] = js.Array(NONE, HBBTV_1_5)
}

@js.native
sealed trait ScteMarkersSource extends js.Any
object ScteMarkersSource {
  val SEGMENTS = "SEGMENTS".asInstanceOf[ScteMarkersSource]
  val MANIFEST = "MANIFEST".asInstanceOf[ScteMarkersSource]

  @inline def values: js.Array[ScteMarkersSource] = js.Array(SEGMENTS, MANIFEST)
}

@js.native
sealed trait SegmentTemplateFormat extends js.Any
object SegmentTemplateFormat {
  val NUMBER_WITH_TIMELINE = "NUMBER_WITH_TIMELINE".asInstanceOf[SegmentTemplateFormat]
  val TIME_WITH_TIMELINE = "TIME_WITH_TIMELINE".asInstanceOf[SegmentTemplateFormat]
  val NUMBER_WITH_DURATION = "NUMBER_WITH_DURATION".asInstanceOf[SegmentTemplateFormat]

  @inline def values: js.Array[SegmentTemplateFormat] = js.Array(NUMBER_WITH_TIMELINE, TIME_WITH_TIMELINE, NUMBER_WITH_DURATION)
}

@js.native
sealed trait StreamOrder extends js.Any
object StreamOrder {
  val ORIGINAL = "ORIGINAL".asInstanceOf[StreamOrder]
  val VIDEO_BITRATE_ASCENDING = "VIDEO_BITRATE_ASCENDING".asInstanceOf[StreamOrder]
  val VIDEO_BITRATE_DESCENDING = "VIDEO_BITRATE_DESCENDING".asInstanceOf[StreamOrder]

  @inline def values: js.Array[StreamOrder] = js.Array(ORIGINAL, VIDEO_BITRATE_ASCENDING, VIDEO_BITRATE_DESCENDING)
}

@js.native
sealed trait __PeriodTriggersElement extends js.Any
object __PeriodTriggersElement {
  val ADS = "ADS".asInstanceOf[__PeriodTriggersElement]

  @inline def values: js.Array[__PeriodTriggersElement] = js.Array(ADS)
}
