package facade.amazonaws.services.medialive

import scalajs.js

/** Aac Coding Mode
  */
@js.native
sealed trait AacCodingMode extends js.Any
object AacCodingMode {
  val AD_RECEIVER_MIX = "AD_RECEIVER_MIX".asInstanceOf[AacCodingMode]
  val CODING_MODE_1_0 = "CODING_MODE_1_0".asInstanceOf[AacCodingMode]
  val CODING_MODE_1_1 = "CODING_MODE_1_1".asInstanceOf[AacCodingMode]
  val CODING_MODE_2_0 = "CODING_MODE_2_0".asInstanceOf[AacCodingMode]
  val CODING_MODE_5_1 = "CODING_MODE_5_1".asInstanceOf[AacCodingMode]

  @inline def values: js.Array[AacCodingMode] = js.Array(AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0, CODING_MODE_5_1)
}

/** Aac Input Type
  */
@js.native
sealed trait AacInputType extends js.Any
object AacInputType {
  val BROADCASTER_MIXED_AD = "BROADCASTER_MIXED_AD".asInstanceOf[AacInputType]
  val NORMAL = "NORMAL".asInstanceOf[AacInputType]

  @inline def values: js.Array[AacInputType] = js.Array(BROADCASTER_MIXED_AD, NORMAL)
}

/** Aac Profile
  */
@js.native
sealed trait AacProfile extends js.Any
object AacProfile {
  val HEV1 = "HEV1".asInstanceOf[AacProfile]
  val HEV2 = "HEV2".asInstanceOf[AacProfile]
  val LC = "LC".asInstanceOf[AacProfile]

  @inline def values: js.Array[AacProfile] = js.Array(HEV1, HEV2, LC)
}

/** Aac Rate Control Mode
  */
@js.native
sealed trait AacRateControlMode extends js.Any
object AacRateControlMode {
  val CBR = "CBR".asInstanceOf[AacRateControlMode]
  val VBR = "VBR".asInstanceOf[AacRateControlMode]

  @inline def values: js.Array[AacRateControlMode] = js.Array(CBR, VBR)
}

/** Aac Raw Format
  */
@js.native
sealed trait AacRawFormat extends js.Any
object AacRawFormat {
  val LATM_LOAS = "LATM_LOAS".asInstanceOf[AacRawFormat]
  val NONE = "NONE".asInstanceOf[AacRawFormat]

  @inline def values: js.Array[AacRawFormat] = js.Array(LATM_LOAS, NONE)
}

/** Aac Spec
  */
@js.native
sealed trait AacSpec extends js.Any
object AacSpec {
  val MPEG2 = "MPEG2".asInstanceOf[AacSpec]
  val MPEG4 = "MPEG4".asInstanceOf[AacSpec]

  @inline def values: js.Array[AacSpec] = js.Array(MPEG2, MPEG4)
}

/** Aac Vbr Quality
  */
@js.native
sealed trait AacVbrQuality extends js.Any
object AacVbrQuality {
  val HIGH = "HIGH".asInstanceOf[AacVbrQuality]
  val LOW = "LOW".asInstanceOf[AacVbrQuality]
  val MEDIUM_HIGH = "MEDIUM_HIGH".asInstanceOf[AacVbrQuality]
  val MEDIUM_LOW = "MEDIUM_LOW".asInstanceOf[AacVbrQuality]

  @inline def values: js.Array[AacVbrQuality] = js.Array(HIGH, LOW, MEDIUM_HIGH, MEDIUM_LOW)
}

/** Ac3 Bitstream Mode
  */
@js.native
sealed trait Ac3BitstreamMode extends js.Any
object Ac3BitstreamMode {
  val COMMENTARY = "COMMENTARY".asInstanceOf[Ac3BitstreamMode]
  val COMPLETE_MAIN = "COMPLETE_MAIN".asInstanceOf[Ac3BitstreamMode]
  val DIALOGUE = "DIALOGUE".asInstanceOf[Ac3BitstreamMode]
  val EMERGENCY = "EMERGENCY".asInstanceOf[Ac3BitstreamMode]
  val HEARING_IMPAIRED = "HEARING_IMPAIRED".asInstanceOf[Ac3BitstreamMode]
  val MUSIC_AND_EFFECTS = "MUSIC_AND_EFFECTS".asInstanceOf[Ac3BitstreamMode]
  val VISUALLY_IMPAIRED = "VISUALLY_IMPAIRED".asInstanceOf[Ac3BitstreamMode]
  val VOICE_OVER = "VOICE_OVER".asInstanceOf[Ac3BitstreamMode]

  @inline def values: js.Array[Ac3BitstreamMode] = js.Array(COMMENTARY, COMPLETE_MAIN, DIALOGUE, EMERGENCY, HEARING_IMPAIRED, MUSIC_AND_EFFECTS, VISUALLY_IMPAIRED, VOICE_OVER)
}

/** Ac3 Coding Mode
  */
@js.native
sealed trait Ac3CodingMode extends js.Any
object Ac3CodingMode {
  val CODING_MODE_1_0 = "CODING_MODE_1_0".asInstanceOf[Ac3CodingMode]
  val CODING_MODE_1_1 = "CODING_MODE_1_1".asInstanceOf[Ac3CodingMode]
  val CODING_MODE_2_0 = "CODING_MODE_2_0".asInstanceOf[Ac3CodingMode]
  val CODING_MODE_3_2_LFE = "CODING_MODE_3_2_LFE".asInstanceOf[Ac3CodingMode]

  @inline def values: js.Array[Ac3CodingMode] = js.Array(CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0, CODING_MODE_3_2_LFE)
}

/** Ac3 Drc Profile
  */
@js.native
sealed trait Ac3DrcProfile extends js.Any
object Ac3DrcProfile {
  val FILM_STANDARD = "FILM_STANDARD".asInstanceOf[Ac3DrcProfile]
  val NONE = "NONE".asInstanceOf[Ac3DrcProfile]

  @inline def values: js.Array[Ac3DrcProfile] = js.Array(FILM_STANDARD, NONE)
}

/** Ac3 Lfe Filter
  */
@js.native
sealed trait Ac3LfeFilter extends js.Any
object Ac3LfeFilter {
  val DISABLED = "DISABLED".asInstanceOf[Ac3LfeFilter]
  val ENABLED = "ENABLED".asInstanceOf[Ac3LfeFilter]

  @inline def values: js.Array[Ac3LfeFilter] = js.Array(DISABLED, ENABLED)
}

/** Ac3 Metadata Control
  */
@js.native
sealed trait Ac3MetadataControl extends js.Any
object Ac3MetadataControl {
  val FOLLOW_INPUT = "FOLLOW_INPUT".asInstanceOf[Ac3MetadataControl]
  val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[Ac3MetadataControl]

  @inline def values: js.Array[Ac3MetadataControl] = js.Array(FOLLOW_INPUT, USE_CONFIGURED)
}

/** The HTTP Accept header. Indicates the requested type fothe thumbnail.
  */
@js.native
sealed trait AcceptHeader extends js.Any
object AcceptHeader {
  val `image/jpeg` = "image/jpeg".asInstanceOf[AcceptHeader]

  @inline def values: js.Array[AcceptHeader] = js.Array(`image/jpeg`)
}

/** Accessibility Type
  */
@js.native
sealed trait AccessibilityType extends js.Any
object AccessibilityType {
  val DOES_NOT_IMPLEMENT_ACCESSIBILITY_FEATURES = "DOES_NOT_IMPLEMENT_ACCESSIBILITY_FEATURES".asInstanceOf[AccessibilityType]
  val IMPLEMENTS_ACCESSIBILITY_FEATURES = "IMPLEMENTS_ACCESSIBILITY_FEATURES".asInstanceOf[AccessibilityType]

  @inline def values: js.Array[AccessibilityType] = js.Array(DOES_NOT_IMPLEMENT_ACCESSIBILITY_FEATURES, IMPLEMENTS_ACCESSIBILITY_FEATURES)
}

/** Afd Signaling
  */
@js.native
sealed trait AfdSignaling extends js.Any
object AfdSignaling {
  val AUTO = "AUTO".asInstanceOf[AfdSignaling]
  val FIXED = "FIXED".asInstanceOf[AfdSignaling]
  val NONE = "NONE".asInstanceOf[AfdSignaling]

  @inline def values: js.Array[AfdSignaling] = js.Array(AUTO, FIXED, NONE)
}

/** Audio Description Audio Type Control
  */
@js.native
sealed trait AudioDescriptionAudioTypeControl extends js.Any
object AudioDescriptionAudioTypeControl {
  val FOLLOW_INPUT = "FOLLOW_INPUT".asInstanceOf[AudioDescriptionAudioTypeControl]
  val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[AudioDescriptionAudioTypeControl]

  @inline def values: js.Array[AudioDescriptionAudioTypeControl] = js.Array(FOLLOW_INPUT, USE_CONFIGURED)
}

/** Audio Description Language Code Control
  */
@js.native
sealed trait AudioDescriptionLanguageCodeControl extends js.Any
object AudioDescriptionLanguageCodeControl {
  val FOLLOW_INPUT = "FOLLOW_INPUT".asInstanceOf[AudioDescriptionLanguageCodeControl]
  val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[AudioDescriptionLanguageCodeControl]

  @inline def values: js.Array[AudioDescriptionLanguageCodeControl] = js.Array(FOLLOW_INPUT, USE_CONFIGURED)
}

/** Audio Language Selection Policy
  */
@js.native
sealed trait AudioLanguageSelectionPolicy extends js.Any
object AudioLanguageSelectionPolicy {
  val LOOSE = "LOOSE".asInstanceOf[AudioLanguageSelectionPolicy]
  val STRICT = "STRICT".asInstanceOf[AudioLanguageSelectionPolicy]

  @inline def values: js.Array[AudioLanguageSelectionPolicy] = js.Array(LOOSE, STRICT)
}

/** Audio Normalization Algorithm
  */
@js.native
sealed trait AudioNormalizationAlgorithm extends js.Any
object AudioNormalizationAlgorithm {
  val ITU_1770_1 = "ITU_1770_1".asInstanceOf[AudioNormalizationAlgorithm]
  val ITU_1770_2 = "ITU_1770_2".asInstanceOf[AudioNormalizationAlgorithm]

  @inline def values: js.Array[AudioNormalizationAlgorithm] = js.Array(ITU_1770_1, ITU_1770_2)
}

/** Audio Normalization Algorithm Control
  */
@js.native
sealed trait AudioNormalizationAlgorithmControl extends js.Any
object AudioNormalizationAlgorithmControl {
  val CORRECT_AUDIO = "CORRECT_AUDIO".asInstanceOf[AudioNormalizationAlgorithmControl]

  @inline def values: js.Array[AudioNormalizationAlgorithmControl] = js.Array(CORRECT_AUDIO)
}

/** Audio Only Hls Segment Type
  */
@js.native
sealed trait AudioOnlyHlsSegmentType extends js.Any
object AudioOnlyHlsSegmentType {
  val AAC = "AAC".asInstanceOf[AudioOnlyHlsSegmentType]
  val FMP4 = "FMP4".asInstanceOf[AudioOnlyHlsSegmentType]

  @inline def values: js.Array[AudioOnlyHlsSegmentType] = js.Array(AAC, FMP4)
}

/** Audio Only Hls Track Type
  */
@js.native
sealed trait AudioOnlyHlsTrackType extends js.Any
object AudioOnlyHlsTrackType {
  val ALTERNATE_AUDIO_AUTO_SELECT = "ALTERNATE_AUDIO_AUTO_SELECT".asInstanceOf[AudioOnlyHlsTrackType]
  val ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT = "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT".asInstanceOf[AudioOnlyHlsTrackType]
  val ALTERNATE_AUDIO_NOT_AUTO_SELECT = "ALTERNATE_AUDIO_NOT_AUTO_SELECT".asInstanceOf[AudioOnlyHlsTrackType]
  val AUDIO_ONLY_VARIANT_STREAM = "AUDIO_ONLY_VARIANT_STREAM".asInstanceOf[AudioOnlyHlsTrackType]

  @inline def values: js.Array[AudioOnlyHlsTrackType] = js.Array(ALTERNATE_AUDIO_AUTO_SELECT, ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT, ALTERNATE_AUDIO_NOT_AUTO_SELECT, AUDIO_ONLY_VARIANT_STREAM)
}

/** Audio Type
  */
@js.native
sealed trait AudioType extends js.Any
object AudioType {
  val CLEAN_EFFECTS = "CLEAN_EFFECTS".asInstanceOf[AudioType]
  val HEARING_IMPAIRED = "HEARING_IMPAIRED".asInstanceOf[AudioType]
  val UNDEFINED = "UNDEFINED".asInstanceOf[AudioType]
  val VISUAL_IMPAIRED_COMMENTARY = "VISUAL_IMPAIRED_COMMENTARY".asInstanceOf[AudioType]

  @inline def values: js.Array[AudioType] = js.Array(CLEAN_EFFECTS, HEARING_IMPAIRED, UNDEFINED, VISUAL_IMPAIRED_COMMENTARY)
}

/** Authentication Scheme
  */
@js.native
sealed trait AuthenticationScheme extends js.Any
object AuthenticationScheme {
  val AKAMAI = "AKAMAI".asInstanceOf[AuthenticationScheme]
  val COMMON = "COMMON".asInstanceOf[AuthenticationScheme]

  @inline def values: js.Array[AuthenticationScheme] = js.Array(AKAMAI, COMMON)
}

/** Avail Blanking State
  */
@js.native
sealed trait AvailBlankingState extends js.Any
object AvailBlankingState {
  val DISABLED = "DISABLED".asInstanceOf[AvailBlankingState]
  val ENABLED = "ENABLED".asInstanceOf[AvailBlankingState]

  @inline def values: js.Array[AvailBlankingState] = js.Array(DISABLED, ENABLED)
}

/** Blackout Slate Network End Blackout
  */
@js.native
sealed trait BlackoutSlateNetworkEndBlackout extends js.Any
object BlackoutSlateNetworkEndBlackout {
  val DISABLED = "DISABLED".asInstanceOf[BlackoutSlateNetworkEndBlackout]
  val ENABLED = "ENABLED".asInstanceOf[BlackoutSlateNetworkEndBlackout]

  @inline def values: js.Array[BlackoutSlateNetworkEndBlackout] = js.Array(DISABLED, ENABLED)
}

/** Blackout Slate State
  */
@js.native
sealed trait BlackoutSlateState extends js.Any
object BlackoutSlateState {
  val DISABLED = "DISABLED".asInstanceOf[BlackoutSlateState]
  val ENABLED = "ENABLED".asInstanceOf[BlackoutSlateState]

  @inline def values: js.Array[BlackoutSlateState] = js.Array(DISABLED, ENABLED)
}

/** Burn In Alignment
  */
@js.native
sealed trait BurnInAlignment extends js.Any
object BurnInAlignment {
  val CENTERED = "CENTERED".asInstanceOf[BurnInAlignment]
  val LEFT = "LEFT".asInstanceOf[BurnInAlignment]
  val SMART = "SMART".asInstanceOf[BurnInAlignment]

  @inline def values: js.Array[BurnInAlignment] = js.Array(CENTERED, LEFT, SMART)
}

/** Burn In Background Color
  */
@js.native
sealed trait BurnInBackgroundColor extends js.Any
object BurnInBackgroundColor {
  val BLACK = "BLACK".asInstanceOf[BurnInBackgroundColor]
  val NONE = "NONE".asInstanceOf[BurnInBackgroundColor]
  val WHITE = "WHITE".asInstanceOf[BurnInBackgroundColor]

  @inline def values: js.Array[BurnInBackgroundColor] = js.Array(BLACK, NONE, WHITE)
}

/** Burn In Font Color
  */
@js.native
sealed trait BurnInFontColor extends js.Any
object BurnInFontColor {
  val BLACK = "BLACK".asInstanceOf[BurnInFontColor]
  val BLUE = "BLUE".asInstanceOf[BurnInFontColor]
  val GREEN = "GREEN".asInstanceOf[BurnInFontColor]
  val RED = "RED".asInstanceOf[BurnInFontColor]
  val WHITE = "WHITE".asInstanceOf[BurnInFontColor]
  val YELLOW = "YELLOW".asInstanceOf[BurnInFontColor]

  @inline def values: js.Array[BurnInFontColor] = js.Array(BLACK, BLUE, GREEN, RED, WHITE, YELLOW)
}

/** Burn In Outline Color
  */
@js.native
sealed trait BurnInOutlineColor extends js.Any
object BurnInOutlineColor {
  val BLACK = "BLACK".asInstanceOf[BurnInOutlineColor]
  val BLUE = "BLUE".asInstanceOf[BurnInOutlineColor]
  val GREEN = "GREEN".asInstanceOf[BurnInOutlineColor]
  val RED = "RED".asInstanceOf[BurnInOutlineColor]
  val WHITE = "WHITE".asInstanceOf[BurnInOutlineColor]
  val YELLOW = "YELLOW".asInstanceOf[BurnInOutlineColor]

  @inline def values: js.Array[BurnInOutlineColor] = js.Array(BLACK, BLUE, GREEN, RED, WHITE, YELLOW)
}

/** Burn In Shadow Color
  */
@js.native
sealed trait BurnInShadowColor extends js.Any
object BurnInShadowColor {
  val BLACK = "BLACK".asInstanceOf[BurnInShadowColor]
  val NONE = "NONE".asInstanceOf[BurnInShadowColor]
  val WHITE = "WHITE".asInstanceOf[BurnInShadowColor]

  @inline def values: js.Array[BurnInShadowColor] = js.Array(BLACK, NONE, WHITE)
}

/** Burn In Teletext Grid Control
  */
@js.native
sealed trait BurnInTeletextGridControl extends js.Any
object BurnInTeletextGridControl {
  val FIXED = "FIXED".asInstanceOf[BurnInTeletextGridControl]
  val SCALED = "SCALED".asInstanceOf[BurnInTeletextGridControl]

  @inline def values: js.Array[BurnInTeletextGridControl] = js.Array(FIXED, SCALED)
}

/** Maximum CDI input resolution; SD is 480i and 576i up to 30 frames-per-second (fps), HD is 720p up to 60 fps / 1080i up to 30 fps, FHD is 1080p up to 60 fps, UHD is 2160p up to 60 fps
  */
@js.native
sealed trait CdiInputResolution extends js.Any
object CdiInputResolution {
  val SD = "SD".asInstanceOf[CdiInputResolution]
  val HD = "HD".asInstanceOf[CdiInputResolution]
  val FHD = "FHD".asInstanceOf[CdiInputResolution]
  val UHD = "UHD".asInstanceOf[CdiInputResolution]

  @inline def values: js.Array[CdiInputResolution] = js.Array(SD, HD, FHD, UHD)
}

/** A standard channel has two encoding pipelines and a single pipeline channel only has one.
  */
@js.native
sealed trait ChannelClass extends js.Any
object ChannelClass {
  val STANDARD = "STANDARD".asInstanceOf[ChannelClass]
  val SINGLE_PIPELINE = "SINGLE_PIPELINE".asInstanceOf[ChannelClass]

  @inline def values: js.Array[ChannelClass] = js.Array(STANDARD, SINGLE_PIPELINE)
}

/** Placeholder documentation for ChannelState
  */
@js.native
sealed trait ChannelState extends js.Any
object ChannelState {
  val CREATING = "CREATING".asInstanceOf[ChannelState]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[ChannelState]
  val IDLE = "IDLE".asInstanceOf[ChannelState]
  val STARTING = "STARTING".asInstanceOf[ChannelState]
  val RUNNING = "RUNNING".asInstanceOf[ChannelState]
  val RECOVERING = "RECOVERING".asInstanceOf[ChannelState]
  val STOPPING = "STOPPING".asInstanceOf[ChannelState]
  val DELETING = "DELETING".asInstanceOf[ChannelState]
  val DELETED = "DELETED".asInstanceOf[ChannelState]
  val UPDATING = "UPDATING".asInstanceOf[ChannelState]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[ChannelState]

  @inline def values: js.Array[ChannelState] = js.Array(CREATING, CREATE_FAILED, IDLE, STARTING, RUNNING, RECOVERING, STOPPING, DELETING, DELETED, UPDATING, UPDATE_FAILED)
}

/** Specifies the media type of the thumbnail.
  */
@js.native
sealed trait ContentType extends js.Any
object ContentType {
  val `image/jpeg` = "image/jpeg".asInstanceOf[ContentType]

  @inline def values: js.Array[ContentType] = js.Array(`image/jpeg`)
}

/** The status of the action to synchronize the device configuration. If you change the configuration of the input device (for example, the maximum bitrate), MediaLive sends the new data to the device. The device might not update itself immediately. SYNCED means the device has updated its configuration. SYNCING means that it has not updated its configuration.
  */
@js.native
sealed trait DeviceSettingsSyncState extends js.Any
object DeviceSettingsSyncState {
  val SYNCED = "SYNCED".asInstanceOf[DeviceSettingsSyncState]
  val SYNCING = "SYNCING".asInstanceOf[DeviceSettingsSyncState]

  @inline def values: js.Array[DeviceSettingsSyncState] = js.Array(SYNCED, SYNCING)
}

/** The status of software on the input device.
  */
@js.native
sealed trait DeviceUpdateStatus extends js.Any
object DeviceUpdateStatus {
  val UP_TO_DATE = "UP_TO_DATE".asInstanceOf[DeviceUpdateStatus]
  val NOT_UP_TO_DATE = "NOT_UP_TO_DATE".asInstanceOf[DeviceUpdateStatus]
  val UPDATING = "UPDATING".asInstanceOf[DeviceUpdateStatus]

  @inline def values: js.Array[DeviceUpdateStatus] = js.Array(UP_TO_DATE, NOT_UP_TO_DATE, UPDATING)
}

/** Dvb Sdt Output Sdt
  */
@js.native
sealed trait DvbSdtOutputSdt extends js.Any
object DvbSdtOutputSdt {
  val SDT_FOLLOW = "SDT_FOLLOW".asInstanceOf[DvbSdtOutputSdt]
  val SDT_FOLLOW_IF_PRESENT = "SDT_FOLLOW_IF_PRESENT".asInstanceOf[DvbSdtOutputSdt]
  val SDT_MANUAL = "SDT_MANUAL".asInstanceOf[DvbSdtOutputSdt]
  val SDT_NONE = "SDT_NONE".asInstanceOf[DvbSdtOutputSdt]

  @inline def values: js.Array[DvbSdtOutputSdt] = js.Array(SDT_FOLLOW, SDT_FOLLOW_IF_PRESENT, SDT_MANUAL, SDT_NONE)
}

/** Dvb Sub Destination Alignment
  */
@js.native
sealed trait DvbSubDestinationAlignment extends js.Any
object DvbSubDestinationAlignment {
  val CENTERED = "CENTERED".asInstanceOf[DvbSubDestinationAlignment]
  val LEFT = "LEFT".asInstanceOf[DvbSubDestinationAlignment]
  val SMART = "SMART".asInstanceOf[DvbSubDestinationAlignment]

  @inline def values: js.Array[DvbSubDestinationAlignment] = js.Array(CENTERED, LEFT, SMART)
}

/** Dvb Sub Destination Background Color
  */
@js.native
sealed trait DvbSubDestinationBackgroundColor extends js.Any
object DvbSubDestinationBackgroundColor {
  val BLACK = "BLACK".asInstanceOf[DvbSubDestinationBackgroundColor]
  val NONE = "NONE".asInstanceOf[DvbSubDestinationBackgroundColor]
  val WHITE = "WHITE".asInstanceOf[DvbSubDestinationBackgroundColor]

  @inline def values: js.Array[DvbSubDestinationBackgroundColor] = js.Array(BLACK, NONE, WHITE)
}

/** Dvb Sub Destination Font Color
  */
@js.native
sealed trait DvbSubDestinationFontColor extends js.Any
object DvbSubDestinationFontColor {
  val BLACK = "BLACK".asInstanceOf[DvbSubDestinationFontColor]
  val BLUE = "BLUE".asInstanceOf[DvbSubDestinationFontColor]
  val GREEN = "GREEN".asInstanceOf[DvbSubDestinationFontColor]
  val RED = "RED".asInstanceOf[DvbSubDestinationFontColor]
  val WHITE = "WHITE".asInstanceOf[DvbSubDestinationFontColor]
  val YELLOW = "YELLOW".asInstanceOf[DvbSubDestinationFontColor]

  @inline def values: js.Array[DvbSubDestinationFontColor] = js.Array(BLACK, BLUE, GREEN, RED, WHITE, YELLOW)
}

/** Dvb Sub Destination Outline Color
  */
@js.native
sealed trait DvbSubDestinationOutlineColor extends js.Any
object DvbSubDestinationOutlineColor {
  val BLACK = "BLACK".asInstanceOf[DvbSubDestinationOutlineColor]
  val BLUE = "BLUE".asInstanceOf[DvbSubDestinationOutlineColor]
  val GREEN = "GREEN".asInstanceOf[DvbSubDestinationOutlineColor]
  val RED = "RED".asInstanceOf[DvbSubDestinationOutlineColor]
  val WHITE = "WHITE".asInstanceOf[DvbSubDestinationOutlineColor]
  val YELLOW = "YELLOW".asInstanceOf[DvbSubDestinationOutlineColor]

  @inline def values: js.Array[DvbSubDestinationOutlineColor] = js.Array(BLACK, BLUE, GREEN, RED, WHITE, YELLOW)
}

/** Dvb Sub Destination Shadow Color
  */
@js.native
sealed trait DvbSubDestinationShadowColor extends js.Any
object DvbSubDestinationShadowColor {
  val BLACK = "BLACK".asInstanceOf[DvbSubDestinationShadowColor]
  val NONE = "NONE".asInstanceOf[DvbSubDestinationShadowColor]
  val WHITE = "WHITE".asInstanceOf[DvbSubDestinationShadowColor]

  @inline def values: js.Array[DvbSubDestinationShadowColor] = js.Array(BLACK, NONE, WHITE)
}

/** Dvb Sub Destination Teletext Grid Control
  */
@js.native
sealed trait DvbSubDestinationTeletextGridControl extends js.Any
object DvbSubDestinationTeletextGridControl {
  val FIXED = "FIXED".asInstanceOf[DvbSubDestinationTeletextGridControl]
  val SCALED = "SCALED".asInstanceOf[DvbSubDestinationTeletextGridControl]

  @inline def values: js.Array[DvbSubDestinationTeletextGridControl] = js.Array(FIXED, SCALED)
}

/** Dvb Sub Ocr Language
  */
@js.native
sealed trait DvbSubOcrLanguage extends js.Any
object DvbSubOcrLanguage {
  val DEU = "DEU".asInstanceOf[DvbSubOcrLanguage]
  val ENG = "ENG".asInstanceOf[DvbSubOcrLanguage]
  val FRA = "FRA".asInstanceOf[DvbSubOcrLanguage]
  val NLD = "NLD".asInstanceOf[DvbSubOcrLanguage]
  val POR = "POR".asInstanceOf[DvbSubOcrLanguage]
  val SPA = "SPA".asInstanceOf[DvbSubOcrLanguage]

  @inline def values: js.Array[DvbSubOcrLanguage] = js.Array(DEU, ENG, FRA, NLD, POR, SPA)
}

/** Eac3 Atmos Coding Mode
  */
@js.native
sealed trait Eac3AtmosCodingMode extends js.Any
object Eac3AtmosCodingMode {
  val CODING_MODE_5_1_4 = "CODING_MODE_5_1_4".asInstanceOf[Eac3AtmosCodingMode]
  val CODING_MODE_7_1_4 = "CODING_MODE_7_1_4".asInstanceOf[Eac3AtmosCodingMode]
  val CODING_MODE_9_1_6 = "CODING_MODE_9_1_6".asInstanceOf[Eac3AtmosCodingMode]

  @inline def values: js.Array[Eac3AtmosCodingMode] = js.Array(CODING_MODE_5_1_4, CODING_MODE_7_1_4, CODING_MODE_9_1_6)
}

/** Eac3 Atmos Drc Line
  */
@js.native
sealed trait Eac3AtmosDrcLine extends js.Any
object Eac3AtmosDrcLine {
  val FILM_LIGHT = "FILM_LIGHT".asInstanceOf[Eac3AtmosDrcLine]
  val FILM_STANDARD = "FILM_STANDARD".asInstanceOf[Eac3AtmosDrcLine]
  val MUSIC_LIGHT = "MUSIC_LIGHT".asInstanceOf[Eac3AtmosDrcLine]
  val MUSIC_STANDARD = "MUSIC_STANDARD".asInstanceOf[Eac3AtmosDrcLine]
  val NONE = "NONE".asInstanceOf[Eac3AtmosDrcLine]
  val SPEECH = "SPEECH".asInstanceOf[Eac3AtmosDrcLine]

  @inline def values: js.Array[Eac3AtmosDrcLine] = js.Array(FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT, MUSIC_STANDARD, NONE, SPEECH)
}

/** Eac3 Atmos Drc Rf
  */
@js.native
sealed trait Eac3AtmosDrcRf extends js.Any
object Eac3AtmosDrcRf {
  val FILM_LIGHT = "FILM_LIGHT".asInstanceOf[Eac3AtmosDrcRf]
  val FILM_STANDARD = "FILM_STANDARD".asInstanceOf[Eac3AtmosDrcRf]
  val MUSIC_LIGHT = "MUSIC_LIGHT".asInstanceOf[Eac3AtmosDrcRf]
  val MUSIC_STANDARD = "MUSIC_STANDARD".asInstanceOf[Eac3AtmosDrcRf]
  val NONE = "NONE".asInstanceOf[Eac3AtmosDrcRf]
  val SPEECH = "SPEECH".asInstanceOf[Eac3AtmosDrcRf]

  @inline def values: js.Array[Eac3AtmosDrcRf] = js.Array(FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT, MUSIC_STANDARD, NONE, SPEECH)
}

/** Eac3 Attenuation Control
  */
@js.native
sealed trait Eac3AttenuationControl extends js.Any
object Eac3AttenuationControl {
  val ATTENUATE_3_DB = "ATTENUATE_3_DB".asInstanceOf[Eac3AttenuationControl]
  val NONE = "NONE".asInstanceOf[Eac3AttenuationControl]

  @inline def values: js.Array[Eac3AttenuationControl] = js.Array(ATTENUATE_3_DB, NONE)
}

/** Eac3 Bitstream Mode
  */
@js.native
sealed trait Eac3BitstreamMode extends js.Any
object Eac3BitstreamMode {
  val COMMENTARY = "COMMENTARY".asInstanceOf[Eac3BitstreamMode]
  val COMPLETE_MAIN = "COMPLETE_MAIN".asInstanceOf[Eac3BitstreamMode]
  val EMERGENCY = "EMERGENCY".asInstanceOf[Eac3BitstreamMode]
  val HEARING_IMPAIRED = "HEARING_IMPAIRED".asInstanceOf[Eac3BitstreamMode]
  val VISUALLY_IMPAIRED = "VISUALLY_IMPAIRED".asInstanceOf[Eac3BitstreamMode]

  @inline def values: js.Array[Eac3BitstreamMode] = js.Array(COMMENTARY, COMPLETE_MAIN, EMERGENCY, HEARING_IMPAIRED, VISUALLY_IMPAIRED)
}

/** Eac3 Coding Mode
  */
@js.native
sealed trait Eac3CodingMode extends js.Any
object Eac3CodingMode {
  val CODING_MODE_1_0 = "CODING_MODE_1_0".asInstanceOf[Eac3CodingMode]
  val CODING_MODE_2_0 = "CODING_MODE_2_0".asInstanceOf[Eac3CodingMode]
  val CODING_MODE_3_2 = "CODING_MODE_3_2".asInstanceOf[Eac3CodingMode]

  @inline def values: js.Array[Eac3CodingMode] = js.Array(CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_3_2)
}

/** Eac3 Dc Filter
  */
@js.native
sealed trait Eac3DcFilter extends js.Any
object Eac3DcFilter {
  val DISABLED = "DISABLED".asInstanceOf[Eac3DcFilter]
  val ENABLED = "ENABLED".asInstanceOf[Eac3DcFilter]

  @inline def values: js.Array[Eac3DcFilter] = js.Array(DISABLED, ENABLED)
}

/** Eac3 Drc Line
  */
@js.native
sealed trait Eac3DrcLine extends js.Any
object Eac3DrcLine {
  val FILM_LIGHT = "FILM_LIGHT".asInstanceOf[Eac3DrcLine]
  val FILM_STANDARD = "FILM_STANDARD".asInstanceOf[Eac3DrcLine]
  val MUSIC_LIGHT = "MUSIC_LIGHT".asInstanceOf[Eac3DrcLine]
  val MUSIC_STANDARD = "MUSIC_STANDARD".asInstanceOf[Eac3DrcLine]
  val NONE = "NONE".asInstanceOf[Eac3DrcLine]
  val SPEECH = "SPEECH".asInstanceOf[Eac3DrcLine]

  @inline def values: js.Array[Eac3DrcLine] = js.Array(FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT, MUSIC_STANDARD, NONE, SPEECH)
}

/** Eac3 Drc Rf
  */
@js.native
sealed trait Eac3DrcRf extends js.Any
object Eac3DrcRf {
  val FILM_LIGHT = "FILM_LIGHT".asInstanceOf[Eac3DrcRf]
  val FILM_STANDARD = "FILM_STANDARD".asInstanceOf[Eac3DrcRf]
  val MUSIC_LIGHT = "MUSIC_LIGHT".asInstanceOf[Eac3DrcRf]
  val MUSIC_STANDARD = "MUSIC_STANDARD".asInstanceOf[Eac3DrcRf]
  val NONE = "NONE".asInstanceOf[Eac3DrcRf]
  val SPEECH = "SPEECH".asInstanceOf[Eac3DrcRf]

  @inline def values: js.Array[Eac3DrcRf] = js.Array(FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT, MUSIC_STANDARD, NONE, SPEECH)
}

/** Eac3 Lfe Control
  */
@js.native
sealed trait Eac3LfeControl extends js.Any
object Eac3LfeControl {
  val LFE = "LFE".asInstanceOf[Eac3LfeControl]
  val NO_LFE = "NO_LFE".asInstanceOf[Eac3LfeControl]

  @inline def values: js.Array[Eac3LfeControl] = js.Array(LFE, NO_LFE)
}

/** Eac3 Lfe Filter
  */
@js.native
sealed trait Eac3LfeFilter extends js.Any
object Eac3LfeFilter {
  val DISABLED = "DISABLED".asInstanceOf[Eac3LfeFilter]
  val ENABLED = "ENABLED".asInstanceOf[Eac3LfeFilter]

  @inline def values: js.Array[Eac3LfeFilter] = js.Array(DISABLED, ENABLED)
}

/** Eac3 Metadata Control
  */
@js.native
sealed trait Eac3MetadataControl extends js.Any
object Eac3MetadataControl {
  val FOLLOW_INPUT = "FOLLOW_INPUT".asInstanceOf[Eac3MetadataControl]
  val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[Eac3MetadataControl]

  @inline def values: js.Array[Eac3MetadataControl] = js.Array(FOLLOW_INPUT, USE_CONFIGURED)
}

/** Eac3 Passthrough Control
  */
@js.native
sealed trait Eac3PassthroughControl extends js.Any
object Eac3PassthroughControl {
  val NO_PASSTHROUGH = "NO_PASSTHROUGH".asInstanceOf[Eac3PassthroughControl]
  val WHEN_POSSIBLE = "WHEN_POSSIBLE".asInstanceOf[Eac3PassthroughControl]

  @inline def values: js.Array[Eac3PassthroughControl] = js.Array(NO_PASSTHROUGH, WHEN_POSSIBLE)
}

/** Eac3 Phase Control
  */
@js.native
sealed trait Eac3PhaseControl extends js.Any
object Eac3PhaseControl {
  val NO_SHIFT = "NO_SHIFT".asInstanceOf[Eac3PhaseControl]
  val SHIFT_90_DEGREES = "SHIFT_90_DEGREES".asInstanceOf[Eac3PhaseControl]

  @inline def values: js.Array[Eac3PhaseControl] = js.Array(NO_SHIFT, SHIFT_90_DEGREES)
}

/** Eac3 Stereo Downmix
  */
@js.native
sealed trait Eac3StereoDownmix extends js.Any
object Eac3StereoDownmix {
  val DPL2 = "DPL2".asInstanceOf[Eac3StereoDownmix]
  val LO_RO = "LO_RO".asInstanceOf[Eac3StereoDownmix]
  val LT_RT = "LT_RT".asInstanceOf[Eac3StereoDownmix]
  val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3StereoDownmix]

  @inline def values: js.Array[Eac3StereoDownmix] = js.Array(DPL2, LO_RO, LT_RT, NOT_INDICATED)
}

/** Eac3 Surround Ex Mode
  */
@js.native
sealed trait Eac3SurroundExMode extends js.Any
object Eac3SurroundExMode {
  val DISABLED = "DISABLED".asInstanceOf[Eac3SurroundExMode]
  val ENABLED = "ENABLED".asInstanceOf[Eac3SurroundExMode]
  val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3SurroundExMode]

  @inline def values: js.Array[Eac3SurroundExMode] = js.Array(DISABLED, ENABLED, NOT_INDICATED)
}

/** Eac3 Surround Mode
  */
@js.native
sealed trait Eac3SurroundMode extends js.Any
object Eac3SurroundMode {
  val DISABLED = "DISABLED".asInstanceOf[Eac3SurroundMode]
  val ENABLED = "ENABLED".asInstanceOf[Eac3SurroundMode]
  val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3SurroundMode]

  @inline def values: js.Array[Eac3SurroundMode] = js.Array(DISABLED, ENABLED, NOT_INDICATED)
}

/** Ebu Tt DDestination Style Control
  */
@js.native
sealed trait EbuTtDDestinationStyleControl extends js.Any
object EbuTtDDestinationStyleControl {
  val EXCLUDE = "EXCLUDE".asInstanceOf[EbuTtDDestinationStyleControl]
  val INCLUDE = "INCLUDE".asInstanceOf[EbuTtDDestinationStyleControl]

  @inline def values: js.Array[EbuTtDDestinationStyleControl] = js.Array(EXCLUDE, INCLUDE)
}

/** Ebu Tt DFill Line Gap Control
  */
@js.native
sealed trait EbuTtDFillLineGapControl extends js.Any
object EbuTtDFillLineGapControl {
  val DISABLED = "DISABLED".asInstanceOf[EbuTtDFillLineGapControl]
  val ENABLED = "ENABLED".asInstanceOf[EbuTtDFillLineGapControl]

  @inline def values: js.Array[EbuTtDFillLineGapControl] = js.Array(DISABLED, ENABLED)
}

/** Embedded Convert608 To708
  */
@js.native
sealed trait EmbeddedConvert608To708 extends js.Any
object EmbeddedConvert608To708 {
  val DISABLED = "DISABLED".asInstanceOf[EmbeddedConvert608To708]
  val UPCONVERT = "UPCONVERT".asInstanceOf[EmbeddedConvert608To708]

  @inline def values: js.Array[EmbeddedConvert608To708] = js.Array(DISABLED, UPCONVERT)
}

/** Embedded Scte20 Detection
  */
@js.native
sealed trait EmbeddedScte20Detection extends js.Any
object EmbeddedScte20Detection {
  val AUTO = "AUTO".asInstanceOf[EmbeddedScte20Detection]
  val OFF = "OFF".asInstanceOf[EmbeddedScte20Detection]

  @inline def values: js.Array[EmbeddedScte20Detection] = js.Array(AUTO, OFF)
}

/** Feature Activations Input Prepare Schedule Actions
  */
@js.native
sealed trait FeatureActivationsInputPrepareScheduleActions extends js.Any
object FeatureActivationsInputPrepareScheduleActions {
  val DISABLED = "DISABLED".asInstanceOf[FeatureActivationsInputPrepareScheduleActions]
  val ENABLED = "ENABLED".asInstanceOf[FeatureActivationsInputPrepareScheduleActions]

  @inline def values: js.Array[FeatureActivationsInputPrepareScheduleActions] = js.Array(DISABLED, ENABLED)
}

/** Fec Output Include Fec
  */
@js.native
sealed trait FecOutputIncludeFec extends js.Any
object FecOutputIncludeFec {
  val COLUMN = "COLUMN".asInstanceOf[FecOutputIncludeFec]
  val COLUMN_AND_ROW = "COLUMN_AND_ROW".asInstanceOf[FecOutputIncludeFec]

  @inline def values: js.Array[FecOutputIncludeFec] = js.Array(COLUMN, COLUMN_AND_ROW)
}

/** Fixed Afd
  */
@js.native
sealed trait FixedAfd extends js.Any
object FixedAfd {
  val AFD_0000 = "AFD_0000".asInstanceOf[FixedAfd]
  val AFD_0010 = "AFD_0010".asInstanceOf[FixedAfd]
  val AFD_0011 = "AFD_0011".asInstanceOf[FixedAfd]
  val AFD_0100 = "AFD_0100".asInstanceOf[FixedAfd]
  val AFD_1000 = "AFD_1000".asInstanceOf[FixedAfd]
  val AFD_1001 = "AFD_1001".asInstanceOf[FixedAfd]
  val AFD_1010 = "AFD_1010".asInstanceOf[FixedAfd]
  val AFD_1011 = "AFD_1011".asInstanceOf[FixedAfd]
  val AFD_1101 = "AFD_1101".asInstanceOf[FixedAfd]
  val AFD_1110 = "AFD_1110".asInstanceOf[FixedAfd]
  val AFD_1111 = "AFD_1111".asInstanceOf[FixedAfd]

  @inline def values: js.Array[FixedAfd] = js.Array(AFD_0000, AFD_0010, AFD_0011, AFD_0100, AFD_1000, AFD_1001, AFD_1010, AFD_1011, AFD_1101, AFD_1110, AFD_1111)
}

/** Fmp4 Nielsen Id3 Behavior
  */
@js.native
sealed trait Fmp4NielsenId3Behavior extends js.Any
object Fmp4NielsenId3Behavior {
  val NO_PASSTHROUGH = "NO_PASSTHROUGH".asInstanceOf[Fmp4NielsenId3Behavior]
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[Fmp4NielsenId3Behavior]

  @inline def values: js.Array[Fmp4NielsenId3Behavior] = js.Array(NO_PASSTHROUGH, PASSTHROUGH)
}

/** Fmp4 Timed Metadata Behavior
  */
@js.native
sealed trait Fmp4TimedMetadataBehavior extends js.Any
object Fmp4TimedMetadataBehavior {
  val NO_PASSTHROUGH = "NO_PASSTHROUGH".asInstanceOf[Fmp4TimedMetadataBehavior]
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[Fmp4TimedMetadataBehavior]

  @inline def values: js.Array[Fmp4TimedMetadataBehavior] = js.Array(NO_PASSTHROUGH, PASSTHROUGH)
}

/** Follow reference point.
  */
@js.native
sealed trait FollowPoint extends js.Any
object FollowPoint {
  val END = "END".asInstanceOf[FollowPoint]
  val START = "START".asInstanceOf[FollowPoint]

  @inline def values: js.Array[FollowPoint] = js.Array(END, START)
}

/** Frame Capture Interval Unit
  */
@js.native
sealed trait FrameCaptureIntervalUnit extends js.Any
object FrameCaptureIntervalUnit {
  val MILLISECONDS = "MILLISECONDS".asInstanceOf[FrameCaptureIntervalUnit]
  val SECONDS = "SECONDS".asInstanceOf[FrameCaptureIntervalUnit]

  @inline def values: js.Array[FrameCaptureIntervalUnit] = js.Array(MILLISECONDS, SECONDS)
}

/** Global Configuration Input End Action
  */
@js.native
sealed trait GlobalConfigurationInputEndAction extends js.Any
object GlobalConfigurationInputEndAction {
  val NONE = "NONE".asInstanceOf[GlobalConfigurationInputEndAction]
  val SWITCH_AND_LOOP_INPUTS = "SWITCH_AND_LOOP_INPUTS".asInstanceOf[GlobalConfigurationInputEndAction]

  @inline def values: js.Array[GlobalConfigurationInputEndAction] = js.Array(NONE, SWITCH_AND_LOOP_INPUTS)
}

/** Global Configuration Low Framerate Inputs
  */
@js.native
sealed trait GlobalConfigurationLowFramerateInputs extends js.Any
object GlobalConfigurationLowFramerateInputs {
  val DISABLED = "DISABLED".asInstanceOf[GlobalConfigurationLowFramerateInputs]
  val ENABLED = "ENABLED".asInstanceOf[GlobalConfigurationLowFramerateInputs]

  @inline def values: js.Array[GlobalConfigurationLowFramerateInputs] = js.Array(DISABLED, ENABLED)
}

/** Global Configuration Output Locking Mode
  */
@js.native
sealed trait GlobalConfigurationOutputLockingMode extends js.Any
object GlobalConfigurationOutputLockingMode {
  val EPOCH_LOCKING = "EPOCH_LOCKING".asInstanceOf[GlobalConfigurationOutputLockingMode]
  val PIPELINE_LOCKING = "PIPELINE_LOCKING".asInstanceOf[GlobalConfigurationOutputLockingMode]

  @inline def values: js.Array[GlobalConfigurationOutputLockingMode] = js.Array(EPOCH_LOCKING, PIPELINE_LOCKING)
}

/** Global Configuration Output Timing Source
  */
@js.native
sealed trait GlobalConfigurationOutputTimingSource extends js.Any
object GlobalConfigurationOutputTimingSource {
  val INPUT_CLOCK = "INPUT_CLOCK".asInstanceOf[GlobalConfigurationOutputTimingSource]
  val SYSTEM_CLOCK = "SYSTEM_CLOCK".asInstanceOf[GlobalConfigurationOutputTimingSource]

  @inline def values: js.Array[GlobalConfigurationOutputTimingSource] = js.Array(INPUT_CLOCK, SYSTEM_CLOCK)
}

/** H264 Adaptive Quantization
  */
@js.native
sealed trait H264AdaptiveQuantization extends js.Any
object H264AdaptiveQuantization {
  val AUTO = "AUTO".asInstanceOf[H264AdaptiveQuantization]
  val HIGH = "HIGH".asInstanceOf[H264AdaptiveQuantization]
  val HIGHER = "HIGHER".asInstanceOf[H264AdaptiveQuantization]
  val LOW = "LOW".asInstanceOf[H264AdaptiveQuantization]
  val MAX = "MAX".asInstanceOf[H264AdaptiveQuantization]
  val MEDIUM = "MEDIUM".asInstanceOf[H264AdaptiveQuantization]
  val OFF = "OFF".asInstanceOf[H264AdaptiveQuantization]

  @inline def values: js.Array[H264AdaptiveQuantization] = js.Array(AUTO, HIGH, HIGHER, LOW, MAX, MEDIUM, OFF)
}

/** H264 Color Metadata
  */
@js.native
sealed trait H264ColorMetadata extends js.Any
object H264ColorMetadata {
  val IGNORE = "IGNORE".asInstanceOf[H264ColorMetadata]
  val INSERT = "INSERT".asInstanceOf[H264ColorMetadata]

  @inline def values: js.Array[H264ColorMetadata] = js.Array(IGNORE, INSERT)
}

/** H264 Entropy Encoding
  */
@js.native
sealed trait H264EntropyEncoding extends js.Any
object H264EntropyEncoding {
  val CABAC = "CABAC".asInstanceOf[H264EntropyEncoding]
  val CAVLC = "CAVLC".asInstanceOf[H264EntropyEncoding]

  @inline def values: js.Array[H264EntropyEncoding] = js.Array(CABAC, CAVLC)
}

/** H264 Flicker Aq
  */
@js.native
sealed trait H264FlickerAq extends js.Any
object H264FlickerAq {
  val DISABLED = "DISABLED".asInstanceOf[H264FlickerAq]
  val ENABLED = "ENABLED".asInstanceOf[H264FlickerAq]

  @inline def values: js.Array[H264FlickerAq] = js.Array(DISABLED, ENABLED)
}

/** H264 Force Field Pictures
  */
@js.native
sealed trait H264ForceFieldPictures extends js.Any
object H264ForceFieldPictures {
  val DISABLED = "DISABLED".asInstanceOf[H264ForceFieldPictures]
  val ENABLED = "ENABLED".asInstanceOf[H264ForceFieldPictures]

  @inline def values: js.Array[H264ForceFieldPictures] = js.Array(DISABLED, ENABLED)
}

/** H264 Framerate Control
  */
@js.native
sealed trait H264FramerateControl extends js.Any
object H264FramerateControl {
  val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[H264FramerateControl]
  val SPECIFIED = "SPECIFIED".asInstanceOf[H264FramerateControl]

  @inline def values: js.Array[H264FramerateControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** H264 Gop BReference
  */
@js.native
sealed trait H264GopBReference extends js.Any
object H264GopBReference {
  val DISABLED = "DISABLED".asInstanceOf[H264GopBReference]
  val ENABLED = "ENABLED".asInstanceOf[H264GopBReference]

  @inline def values: js.Array[H264GopBReference] = js.Array(DISABLED, ENABLED)
}

/** H264 Gop Size Units
  */
@js.native
sealed trait H264GopSizeUnits extends js.Any
object H264GopSizeUnits {
  val FRAMES = "FRAMES".asInstanceOf[H264GopSizeUnits]
  val SECONDS = "SECONDS".asInstanceOf[H264GopSizeUnits]

  @inline def values: js.Array[H264GopSizeUnits] = js.Array(FRAMES, SECONDS)
}

/** H264 Level
  */
@js.native
sealed trait H264Level extends js.Any
object H264Level {
  val H264_LEVEL_1 = "H264_LEVEL_1".asInstanceOf[H264Level]
  val H264_LEVEL_1_1 = "H264_LEVEL_1_1".asInstanceOf[H264Level]
  val H264_LEVEL_1_2 = "H264_LEVEL_1_2".asInstanceOf[H264Level]
  val H264_LEVEL_1_3 = "H264_LEVEL_1_3".asInstanceOf[H264Level]
  val H264_LEVEL_2 = "H264_LEVEL_2".asInstanceOf[H264Level]
  val H264_LEVEL_2_1 = "H264_LEVEL_2_1".asInstanceOf[H264Level]
  val H264_LEVEL_2_2 = "H264_LEVEL_2_2".asInstanceOf[H264Level]
  val H264_LEVEL_3 = "H264_LEVEL_3".asInstanceOf[H264Level]
  val H264_LEVEL_3_1 = "H264_LEVEL_3_1".asInstanceOf[H264Level]
  val H264_LEVEL_3_2 = "H264_LEVEL_3_2".asInstanceOf[H264Level]
  val H264_LEVEL_4 = "H264_LEVEL_4".asInstanceOf[H264Level]
  val H264_LEVEL_4_1 = "H264_LEVEL_4_1".asInstanceOf[H264Level]
  val H264_LEVEL_4_2 = "H264_LEVEL_4_2".asInstanceOf[H264Level]
  val H264_LEVEL_5 = "H264_LEVEL_5".asInstanceOf[H264Level]
  val H264_LEVEL_5_1 = "H264_LEVEL_5_1".asInstanceOf[H264Level]
  val H264_LEVEL_5_2 = "H264_LEVEL_5_2".asInstanceOf[H264Level]
  val H264_LEVEL_AUTO = "H264_LEVEL_AUTO".asInstanceOf[H264Level]

  @inline def values: js.Array[H264Level] = js.Array(
    H264_LEVEL_1,
    H264_LEVEL_1_1,
    H264_LEVEL_1_2,
    H264_LEVEL_1_3,
    H264_LEVEL_2,
    H264_LEVEL_2_1,
    H264_LEVEL_2_2,
    H264_LEVEL_3,
    H264_LEVEL_3_1,
    H264_LEVEL_3_2,
    H264_LEVEL_4,
    H264_LEVEL_4_1,
    H264_LEVEL_4_2,
    H264_LEVEL_5,
    H264_LEVEL_5_1,
    H264_LEVEL_5_2,
    H264_LEVEL_AUTO
  )
}

/** H264 Look Ahead Rate Control
  */
@js.native
sealed trait H264LookAheadRateControl extends js.Any
object H264LookAheadRateControl {
  val HIGH = "HIGH".asInstanceOf[H264LookAheadRateControl]
  val LOW = "LOW".asInstanceOf[H264LookAheadRateControl]
  val MEDIUM = "MEDIUM".asInstanceOf[H264LookAheadRateControl]

  @inline def values: js.Array[H264LookAheadRateControl] = js.Array(HIGH, LOW, MEDIUM)
}

/** H264 Par Control
  */
@js.native
sealed trait H264ParControl extends js.Any
object H264ParControl {
  val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[H264ParControl]
  val SPECIFIED = "SPECIFIED".asInstanceOf[H264ParControl]

  @inline def values: js.Array[H264ParControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** H264 Profile
  */
@js.native
sealed trait H264Profile extends js.Any
object H264Profile {
  val BASELINE = "BASELINE".asInstanceOf[H264Profile]
  val HIGH = "HIGH".asInstanceOf[H264Profile]
  val HIGH_10BIT = "HIGH_10BIT".asInstanceOf[H264Profile]
  val HIGH_422 = "HIGH_422".asInstanceOf[H264Profile]
  val HIGH_422_10BIT = "HIGH_422_10BIT".asInstanceOf[H264Profile]
  val MAIN = "MAIN".asInstanceOf[H264Profile]

  @inline def values: js.Array[H264Profile] = js.Array(BASELINE, HIGH, HIGH_10BIT, HIGH_422, HIGH_422_10BIT, MAIN)
}

/** H264 Quality Level
  */
@js.native
sealed trait H264QualityLevel extends js.Any
object H264QualityLevel {
  val ENHANCED_QUALITY = "ENHANCED_QUALITY".asInstanceOf[H264QualityLevel]
  val STANDARD_QUALITY = "STANDARD_QUALITY".asInstanceOf[H264QualityLevel]

  @inline def values: js.Array[H264QualityLevel] = js.Array(ENHANCED_QUALITY, STANDARD_QUALITY)
}

/** H264 Rate Control Mode
  */
@js.native
sealed trait H264RateControlMode extends js.Any
object H264RateControlMode {
  val CBR = "CBR".asInstanceOf[H264RateControlMode]
  val MULTIPLEX = "MULTIPLEX".asInstanceOf[H264RateControlMode]
  val QVBR = "QVBR".asInstanceOf[H264RateControlMode]
  val VBR = "VBR".asInstanceOf[H264RateControlMode]

  @inline def values: js.Array[H264RateControlMode] = js.Array(CBR, MULTIPLEX, QVBR, VBR)
}

/** H264 Scan Type
  */
@js.native
sealed trait H264ScanType extends js.Any
object H264ScanType {
  val INTERLACED = "INTERLACED".asInstanceOf[H264ScanType]
  val PROGRESSIVE = "PROGRESSIVE".asInstanceOf[H264ScanType]

  @inline def values: js.Array[H264ScanType] = js.Array(INTERLACED, PROGRESSIVE)
}

/** H264 Scene Change Detect
  */
@js.native
sealed trait H264SceneChangeDetect extends js.Any
object H264SceneChangeDetect {
  val DISABLED = "DISABLED".asInstanceOf[H264SceneChangeDetect]
  val ENABLED = "ENABLED".asInstanceOf[H264SceneChangeDetect]

  @inline def values: js.Array[H264SceneChangeDetect] = js.Array(DISABLED, ENABLED)
}

/** H264 Spatial Aq
  */
@js.native
sealed trait H264SpatialAq extends js.Any
object H264SpatialAq {
  val DISABLED = "DISABLED".asInstanceOf[H264SpatialAq]
  val ENABLED = "ENABLED".asInstanceOf[H264SpatialAq]

  @inline def values: js.Array[H264SpatialAq] = js.Array(DISABLED, ENABLED)
}

/** H264 Sub Gop Length
  */
@js.native
sealed trait H264SubGopLength extends js.Any
object H264SubGopLength {
  val DYNAMIC = "DYNAMIC".asInstanceOf[H264SubGopLength]
  val FIXED = "FIXED".asInstanceOf[H264SubGopLength]

  @inline def values: js.Array[H264SubGopLength] = js.Array(DYNAMIC, FIXED)
}

/** H264 Syntax
  */
@js.native
sealed trait H264Syntax extends js.Any
object H264Syntax {
  val DEFAULT = "DEFAULT".asInstanceOf[H264Syntax]
  val RP2027 = "RP2027".asInstanceOf[H264Syntax]

  @inline def values: js.Array[H264Syntax] = js.Array(DEFAULT, RP2027)
}

/** H264 Temporal Aq
  */
@js.native
sealed trait H264TemporalAq extends js.Any
object H264TemporalAq {
  val DISABLED = "DISABLED".asInstanceOf[H264TemporalAq]
  val ENABLED = "ENABLED".asInstanceOf[H264TemporalAq]

  @inline def values: js.Array[H264TemporalAq] = js.Array(DISABLED, ENABLED)
}

/** H264 Timecode Insertion Behavior
  */
@js.native
sealed trait H264TimecodeInsertionBehavior extends js.Any
object H264TimecodeInsertionBehavior {
  val DISABLED = "DISABLED".asInstanceOf[H264TimecodeInsertionBehavior]
  val PIC_TIMING_SEI = "PIC_TIMING_SEI".asInstanceOf[H264TimecodeInsertionBehavior]

  @inline def values: js.Array[H264TimecodeInsertionBehavior] = js.Array(DISABLED, PIC_TIMING_SEI)
}

/** H265 Adaptive Quantization
  */
@js.native
sealed trait H265AdaptiveQuantization extends js.Any
object H265AdaptiveQuantization {
  val AUTO = "AUTO".asInstanceOf[H265AdaptiveQuantization]
  val HIGH = "HIGH".asInstanceOf[H265AdaptiveQuantization]
  val HIGHER = "HIGHER".asInstanceOf[H265AdaptiveQuantization]
  val LOW = "LOW".asInstanceOf[H265AdaptiveQuantization]
  val MAX = "MAX".asInstanceOf[H265AdaptiveQuantization]
  val MEDIUM = "MEDIUM".asInstanceOf[H265AdaptiveQuantization]
  val OFF = "OFF".asInstanceOf[H265AdaptiveQuantization]

  @inline def values: js.Array[H265AdaptiveQuantization] = js.Array(AUTO, HIGH, HIGHER, LOW, MAX, MEDIUM, OFF)
}

/** H265 Alternative Transfer Function
  */
@js.native
sealed trait H265AlternativeTransferFunction extends js.Any
object H265AlternativeTransferFunction {
  val INSERT = "INSERT".asInstanceOf[H265AlternativeTransferFunction]
  val OMIT = "OMIT".asInstanceOf[H265AlternativeTransferFunction]

  @inline def values: js.Array[H265AlternativeTransferFunction] = js.Array(INSERT, OMIT)
}

/** H265 Color Metadata
  */
@js.native
sealed trait H265ColorMetadata extends js.Any
object H265ColorMetadata {
  val IGNORE = "IGNORE".asInstanceOf[H265ColorMetadata]
  val INSERT = "INSERT".asInstanceOf[H265ColorMetadata]

  @inline def values: js.Array[H265ColorMetadata] = js.Array(IGNORE, INSERT)
}

/** H265 Flicker Aq
  */
@js.native
sealed trait H265FlickerAq extends js.Any
object H265FlickerAq {
  val DISABLED = "DISABLED".asInstanceOf[H265FlickerAq]
  val ENABLED = "ENABLED".asInstanceOf[H265FlickerAq]

  @inline def values: js.Array[H265FlickerAq] = js.Array(DISABLED, ENABLED)
}

/** H265 Gop Size Units
  */
@js.native
sealed trait H265GopSizeUnits extends js.Any
object H265GopSizeUnits {
  val FRAMES = "FRAMES".asInstanceOf[H265GopSizeUnits]
  val SECONDS = "SECONDS".asInstanceOf[H265GopSizeUnits]

  @inline def values: js.Array[H265GopSizeUnits] = js.Array(FRAMES, SECONDS)
}

/** H265 Level
  */
@js.native
sealed trait H265Level extends js.Any
object H265Level {
  val H265_LEVEL_1 = "H265_LEVEL_1".asInstanceOf[H265Level]
  val H265_LEVEL_2 = "H265_LEVEL_2".asInstanceOf[H265Level]
  val H265_LEVEL_2_1 = "H265_LEVEL_2_1".asInstanceOf[H265Level]
  val H265_LEVEL_3 = "H265_LEVEL_3".asInstanceOf[H265Level]
  val H265_LEVEL_3_1 = "H265_LEVEL_3_1".asInstanceOf[H265Level]
  val H265_LEVEL_4 = "H265_LEVEL_4".asInstanceOf[H265Level]
  val H265_LEVEL_4_1 = "H265_LEVEL_4_1".asInstanceOf[H265Level]
  val H265_LEVEL_5 = "H265_LEVEL_5".asInstanceOf[H265Level]
  val H265_LEVEL_5_1 = "H265_LEVEL_5_1".asInstanceOf[H265Level]
  val H265_LEVEL_5_2 = "H265_LEVEL_5_2".asInstanceOf[H265Level]
  val H265_LEVEL_6 = "H265_LEVEL_6".asInstanceOf[H265Level]
  val H265_LEVEL_6_1 = "H265_LEVEL_6_1".asInstanceOf[H265Level]
  val H265_LEVEL_6_2 = "H265_LEVEL_6_2".asInstanceOf[H265Level]
  val H265_LEVEL_AUTO = "H265_LEVEL_AUTO".asInstanceOf[H265Level]

  @inline def values: js.Array[H265Level] = js.Array(
    H265_LEVEL_1,
    H265_LEVEL_2,
    H265_LEVEL_2_1,
    H265_LEVEL_3,
    H265_LEVEL_3_1,
    H265_LEVEL_4,
    H265_LEVEL_4_1,
    H265_LEVEL_5,
    H265_LEVEL_5_1,
    H265_LEVEL_5_2,
    H265_LEVEL_6,
    H265_LEVEL_6_1,
    H265_LEVEL_6_2,
    H265_LEVEL_AUTO
  )
}

/** H265 Look Ahead Rate Control
  */
@js.native
sealed trait H265LookAheadRateControl extends js.Any
object H265LookAheadRateControl {
  val HIGH = "HIGH".asInstanceOf[H265LookAheadRateControl]
  val LOW = "LOW".asInstanceOf[H265LookAheadRateControl]
  val MEDIUM = "MEDIUM".asInstanceOf[H265LookAheadRateControl]

  @inline def values: js.Array[H265LookAheadRateControl] = js.Array(HIGH, LOW, MEDIUM)
}

/** H265 Profile
  */
@js.native
sealed trait H265Profile extends js.Any
object H265Profile {
  val MAIN = "MAIN".asInstanceOf[H265Profile]
  val MAIN_10BIT = "MAIN_10BIT".asInstanceOf[H265Profile]

  @inline def values: js.Array[H265Profile] = js.Array(MAIN, MAIN_10BIT)
}

/** H265 Rate Control Mode
  */
@js.native
sealed trait H265RateControlMode extends js.Any
object H265RateControlMode {
  val CBR = "CBR".asInstanceOf[H265RateControlMode]
  val MULTIPLEX = "MULTIPLEX".asInstanceOf[H265RateControlMode]
  val QVBR = "QVBR".asInstanceOf[H265RateControlMode]

  @inline def values: js.Array[H265RateControlMode] = js.Array(CBR, MULTIPLEX, QVBR)
}

/** H265 Scan Type
  */
@js.native
sealed trait H265ScanType extends js.Any
object H265ScanType {
  val INTERLACED = "INTERLACED".asInstanceOf[H265ScanType]
  val PROGRESSIVE = "PROGRESSIVE".asInstanceOf[H265ScanType]

  @inline def values: js.Array[H265ScanType] = js.Array(INTERLACED, PROGRESSIVE)
}

/** H265 Scene Change Detect
  */
@js.native
sealed trait H265SceneChangeDetect extends js.Any
object H265SceneChangeDetect {
  val DISABLED = "DISABLED".asInstanceOf[H265SceneChangeDetect]
  val ENABLED = "ENABLED".asInstanceOf[H265SceneChangeDetect]

  @inline def values: js.Array[H265SceneChangeDetect] = js.Array(DISABLED, ENABLED)
}

/** H265 Tier
  */
@js.native
sealed trait H265Tier extends js.Any
object H265Tier {
  val HIGH = "HIGH".asInstanceOf[H265Tier]
  val MAIN = "MAIN".asInstanceOf[H265Tier]

  @inline def values: js.Array[H265Tier] = js.Array(HIGH, MAIN)
}

/** H265 Timecode Insertion Behavior
  */
@js.native
sealed trait H265TimecodeInsertionBehavior extends js.Any
object H265TimecodeInsertionBehavior {
  val DISABLED = "DISABLED".asInstanceOf[H265TimecodeInsertionBehavior]
  val PIC_TIMING_SEI = "PIC_TIMING_SEI".asInstanceOf[H265TimecodeInsertionBehavior]

  @inline def values: js.Array[H265TimecodeInsertionBehavior] = js.Array(DISABLED, PIC_TIMING_SEI)
}

/** Hls Ad Markers
  */
@js.native
sealed trait HlsAdMarkers extends js.Any
object HlsAdMarkers {
  val ADOBE = "ADOBE".asInstanceOf[HlsAdMarkers]
  val ELEMENTAL = "ELEMENTAL".asInstanceOf[HlsAdMarkers]
  val ELEMENTAL_SCTE35 = "ELEMENTAL_SCTE35".asInstanceOf[HlsAdMarkers]

  @inline def values: js.Array[HlsAdMarkers] = js.Array(ADOBE, ELEMENTAL, ELEMENTAL_SCTE35)
}

/** Hls Akamai Http Transfer Mode
  */
@js.native
sealed trait HlsAkamaiHttpTransferMode extends js.Any
object HlsAkamaiHttpTransferMode {
  val CHUNKED = "CHUNKED".asInstanceOf[HlsAkamaiHttpTransferMode]
  val NON_CHUNKED = "NON_CHUNKED".asInstanceOf[HlsAkamaiHttpTransferMode]

  @inline def values: js.Array[HlsAkamaiHttpTransferMode] = js.Array(CHUNKED, NON_CHUNKED)
}

/** Hls Caption Language Setting
  */
@js.native
sealed trait HlsCaptionLanguageSetting extends js.Any
object HlsCaptionLanguageSetting {
  val INSERT = "INSERT".asInstanceOf[HlsCaptionLanguageSetting]
  val NONE = "NONE".asInstanceOf[HlsCaptionLanguageSetting]
  val OMIT = "OMIT".asInstanceOf[HlsCaptionLanguageSetting]

  @inline def values: js.Array[HlsCaptionLanguageSetting] = js.Array(INSERT, NONE, OMIT)
}

/** Hls Client Cache
  */
@js.native
sealed trait HlsClientCache extends js.Any
object HlsClientCache {
  val DISABLED = "DISABLED".asInstanceOf[HlsClientCache]
  val ENABLED = "ENABLED".asInstanceOf[HlsClientCache]

  @inline def values: js.Array[HlsClientCache] = js.Array(DISABLED, ENABLED)
}

/** Hls Codec Specification
  */
@js.native
sealed trait HlsCodecSpecification extends js.Any
object HlsCodecSpecification {
  val RFC_4281 = "RFC_4281".asInstanceOf[HlsCodecSpecification]
  val RFC_6381 = "RFC_6381".asInstanceOf[HlsCodecSpecification]

  @inline def values: js.Array[HlsCodecSpecification] = js.Array(RFC_4281, RFC_6381)
}

/** Hls Directory Structure
  */
@js.native
sealed trait HlsDirectoryStructure extends js.Any
object HlsDirectoryStructure {
  val SINGLE_DIRECTORY = "SINGLE_DIRECTORY".asInstanceOf[HlsDirectoryStructure]
  val SUBDIRECTORY_PER_STREAM = "SUBDIRECTORY_PER_STREAM".asInstanceOf[HlsDirectoryStructure]

  @inline def values: js.Array[HlsDirectoryStructure] = js.Array(SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM)
}

/** Hls Discontinuity Tags
  */
@js.native
sealed trait HlsDiscontinuityTags extends js.Any
object HlsDiscontinuityTags {
  val INSERT = "INSERT".asInstanceOf[HlsDiscontinuityTags]
  val NEVER_INSERT = "NEVER_INSERT".asInstanceOf[HlsDiscontinuityTags]

  @inline def values: js.Array[HlsDiscontinuityTags] = js.Array(INSERT, NEVER_INSERT)
}

/** Hls Encryption Type
  */
@js.native
sealed trait HlsEncryptionType extends js.Any
object HlsEncryptionType {
  val AES128 = "AES128".asInstanceOf[HlsEncryptionType]
  val SAMPLE_AES = "SAMPLE_AES".asInstanceOf[HlsEncryptionType]

  @inline def values: js.Array[HlsEncryptionType] = js.Array(AES128, SAMPLE_AES)
}

/** Hls H265 Packaging Type
  */
@js.native
sealed trait HlsH265PackagingType extends js.Any
object HlsH265PackagingType {
  val HEV1 = "HEV1".asInstanceOf[HlsH265PackagingType]
  val HVC1 = "HVC1".asInstanceOf[HlsH265PackagingType]

  @inline def values: js.Array[HlsH265PackagingType] = js.Array(HEV1, HVC1)
}

/** State of HLS ID3 Segment Tagging
  */
@js.native
sealed trait HlsId3SegmentTaggingState extends js.Any
object HlsId3SegmentTaggingState {
  val DISABLED = "DISABLED".asInstanceOf[HlsId3SegmentTaggingState]
  val ENABLED = "ENABLED".asInstanceOf[HlsId3SegmentTaggingState]

  @inline def values: js.Array[HlsId3SegmentTaggingState] = js.Array(DISABLED, ENABLED)
}

/** Hls Incomplete Segment Behavior
  */
@js.native
sealed trait HlsIncompleteSegmentBehavior extends js.Any
object HlsIncompleteSegmentBehavior {
  val AUTO = "AUTO".asInstanceOf[HlsIncompleteSegmentBehavior]
  val SUPPRESS = "SUPPRESS".asInstanceOf[HlsIncompleteSegmentBehavior]

  @inline def values: js.Array[HlsIncompleteSegmentBehavior] = js.Array(AUTO, SUPPRESS)
}

/** Hls Iv In Manifest
  */
@js.native
sealed trait HlsIvInManifest extends js.Any
object HlsIvInManifest {
  val EXCLUDE = "EXCLUDE".asInstanceOf[HlsIvInManifest]
  val INCLUDE = "INCLUDE".asInstanceOf[HlsIvInManifest]

  @inline def values: js.Array[HlsIvInManifest] = js.Array(EXCLUDE, INCLUDE)
}

/** Hls Iv Source
  */
@js.native
sealed trait HlsIvSource extends js.Any
object HlsIvSource {
  val EXPLICIT = "EXPLICIT".asInstanceOf[HlsIvSource]
  val FOLLOWS_SEGMENT_NUMBER = "FOLLOWS_SEGMENT_NUMBER".asInstanceOf[HlsIvSource]

  @inline def values: js.Array[HlsIvSource] = js.Array(EXPLICIT, FOLLOWS_SEGMENT_NUMBER)
}

/** Hls Manifest Compression
  */
@js.native
sealed trait HlsManifestCompression extends js.Any
object HlsManifestCompression {
  val GZIP = "GZIP".asInstanceOf[HlsManifestCompression]
  val NONE = "NONE".asInstanceOf[HlsManifestCompression]

  @inline def values: js.Array[HlsManifestCompression] = js.Array(GZIP, NONE)
}

/** Hls Manifest Duration Format
  */
@js.native
sealed trait HlsManifestDurationFormat extends js.Any
object HlsManifestDurationFormat {
  val FLOATING_POINT = "FLOATING_POINT".asInstanceOf[HlsManifestDurationFormat]
  val INTEGER = "INTEGER".asInstanceOf[HlsManifestDurationFormat]

  @inline def values: js.Array[HlsManifestDurationFormat] = js.Array(FLOATING_POINT, INTEGER)
}

/** Hls Media Store Storage Class
  */
@js.native
sealed trait HlsMediaStoreStorageClass extends js.Any
object HlsMediaStoreStorageClass {
  val TEMPORAL = "TEMPORAL".asInstanceOf[HlsMediaStoreStorageClass]

  @inline def values: js.Array[HlsMediaStoreStorageClass] = js.Array(TEMPORAL)
}

/** Hls Mode
  */
@js.native
sealed trait HlsMode extends js.Any
object HlsMode {
  val LIVE = "LIVE".asInstanceOf[HlsMode]
  val VOD = "VOD".asInstanceOf[HlsMode]

  @inline def values: js.Array[HlsMode] = js.Array(LIVE, VOD)
}

/** Hls Output Selection
  */
@js.native
sealed trait HlsOutputSelection extends js.Any
object HlsOutputSelection {
  val MANIFESTS_AND_SEGMENTS = "MANIFESTS_AND_SEGMENTS".asInstanceOf[HlsOutputSelection]
  val SEGMENTS_ONLY = "SEGMENTS_ONLY".asInstanceOf[HlsOutputSelection]
  val VARIANT_MANIFESTS_AND_SEGMENTS = "VARIANT_MANIFESTS_AND_SEGMENTS".asInstanceOf[HlsOutputSelection]

  @inline def values: js.Array[HlsOutputSelection] = js.Array(MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY, VARIANT_MANIFESTS_AND_SEGMENTS)
}

/** Hls Program Date Time
  */
@js.native
sealed trait HlsProgramDateTime extends js.Any
object HlsProgramDateTime {
  val EXCLUDE = "EXCLUDE".asInstanceOf[HlsProgramDateTime]
  val INCLUDE = "INCLUDE".asInstanceOf[HlsProgramDateTime]

  @inline def values: js.Array[HlsProgramDateTime] = js.Array(EXCLUDE, INCLUDE)
}

/** Hls Program Date Time Clock
  */
@js.native
sealed trait HlsProgramDateTimeClock extends js.Any
object HlsProgramDateTimeClock {
  val INITIALIZE_FROM_OUTPUT_TIMECODE = "INITIALIZE_FROM_OUTPUT_TIMECODE".asInstanceOf[HlsProgramDateTimeClock]
  val SYSTEM_CLOCK = "SYSTEM_CLOCK".asInstanceOf[HlsProgramDateTimeClock]

  @inline def values: js.Array[HlsProgramDateTimeClock] = js.Array(INITIALIZE_FROM_OUTPUT_TIMECODE, SYSTEM_CLOCK)
}

/** Hls Redundant Manifest
  */
@js.native
sealed trait HlsRedundantManifest extends js.Any
object HlsRedundantManifest {
  val DISABLED = "DISABLED".asInstanceOf[HlsRedundantManifest]
  val ENABLED = "ENABLED".asInstanceOf[HlsRedundantManifest]

  @inline def values: js.Array[HlsRedundantManifest] = js.Array(DISABLED, ENABLED)
}

/** Hls Scte35 Source Type
  */
@js.native
sealed trait HlsScte35SourceType extends js.Any
object HlsScte35SourceType {
  val MANIFEST = "MANIFEST".asInstanceOf[HlsScte35SourceType]
  val SEGMENTS = "SEGMENTS".asInstanceOf[HlsScte35SourceType]

  @inline def values: js.Array[HlsScte35SourceType] = js.Array(MANIFEST, SEGMENTS)
}

/** Hls Segmentation Mode
  */
@js.native
sealed trait HlsSegmentationMode extends js.Any
object HlsSegmentationMode {
  val USE_INPUT_SEGMENTATION = "USE_INPUT_SEGMENTATION".asInstanceOf[HlsSegmentationMode]
  val USE_SEGMENT_DURATION = "USE_SEGMENT_DURATION".asInstanceOf[HlsSegmentationMode]

  @inline def values: js.Array[HlsSegmentationMode] = js.Array(USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION)
}

/** Hls Stream Inf Resolution
  */
@js.native
sealed trait HlsStreamInfResolution extends js.Any
object HlsStreamInfResolution {
  val EXCLUDE = "EXCLUDE".asInstanceOf[HlsStreamInfResolution]
  val INCLUDE = "INCLUDE".asInstanceOf[HlsStreamInfResolution]

  @inline def values: js.Array[HlsStreamInfResolution] = js.Array(EXCLUDE, INCLUDE)
}

/** Hls Timed Metadata Id3 Frame
  */
@js.native
sealed trait HlsTimedMetadataId3Frame extends js.Any
object HlsTimedMetadataId3Frame {
  val NONE = "NONE".asInstanceOf[HlsTimedMetadataId3Frame]
  val PRIV = "PRIV".asInstanceOf[HlsTimedMetadataId3Frame]
  val TDRL = "TDRL".asInstanceOf[HlsTimedMetadataId3Frame]

  @inline def values: js.Array[HlsTimedMetadataId3Frame] = js.Array(NONE, PRIV, TDRL)
}

/** Hls Ts File Mode
  */
@js.native
sealed trait HlsTsFileMode extends js.Any
object HlsTsFileMode {
  val SEGMENTED_FILES = "SEGMENTED_FILES".asInstanceOf[HlsTsFileMode]
  val SINGLE_FILE = "SINGLE_FILE".asInstanceOf[HlsTsFileMode]

  @inline def values: js.Array[HlsTsFileMode] = js.Array(SEGMENTED_FILES, SINGLE_FILE)
}

/** Hls Webdav Http Transfer Mode
  */
@js.native
sealed trait HlsWebdavHttpTransferMode extends js.Any
object HlsWebdavHttpTransferMode {
  val CHUNKED = "CHUNKED".asInstanceOf[HlsWebdavHttpTransferMode]
  val NON_CHUNKED = "NON_CHUNKED".asInstanceOf[HlsWebdavHttpTransferMode]

  @inline def values: js.Array[HlsWebdavHttpTransferMode] = js.Array(CHUNKED, NON_CHUNKED)
}

/** When set to "standard", an I-Frame only playlist will be written out for each video output in the output group. This I-Frame only playlist will contain byte range offsets pointing to the I-frame(s) in each segment.
  */
@js.native
sealed trait IFrameOnlyPlaylistType extends js.Any
object IFrameOnlyPlaylistType {
  val DISABLED = "DISABLED".asInstanceOf[IFrameOnlyPlaylistType]
  val STANDARD = "STANDARD".asInstanceOf[IFrameOnlyPlaylistType]

  @inline def values: js.Array[IFrameOnlyPlaylistType] = js.Array(DISABLED, STANDARD)
}

/** A standard input has two sources and a single pipeline input only has one.
  */
@js.native
sealed trait InputClass extends js.Any
object InputClass {
  val STANDARD = "STANDARD".asInstanceOf[InputClass]
  val SINGLE_PIPELINE = "SINGLE_PIPELINE".asInstanceOf[InputClass]

  @inline def values: js.Array[InputClass] = js.Array(STANDARD, SINGLE_PIPELINE)
}

/** codec in increasing order of complexity
  */
@js.native
sealed trait InputCodec extends js.Any
object InputCodec {
  val MPEG2 = "MPEG2".asInstanceOf[InputCodec]
  val AVC = "AVC".asInstanceOf[InputCodec]
  val HEVC = "HEVC".asInstanceOf[InputCodec]

  @inline def values: js.Array[InputCodec] = js.Array(MPEG2, AVC, HEVC)
}

/** Input Deblock Filter
  */
@js.native
sealed trait InputDeblockFilter extends js.Any
object InputDeblockFilter {
  val DISABLED = "DISABLED".asInstanceOf[InputDeblockFilter]
  val ENABLED = "ENABLED".asInstanceOf[InputDeblockFilter]

  @inline def values: js.Array[InputDeblockFilter] = js.Array(DISABLED, ENABLED)
}

/** Input Denoise Filter
  */
@js.native
sealed trait InputDenoiseFilter extends js.Any
object InputDenoiseFilter {
  val DISABLED = "DISABLED".asInstanceOf[InputDenoiseFilter]
  val ENABLED = "ENABLED".asInstanceOf[InputDenoiseFilter]

  @inline def values: js.Array[InputDenoiseFilter] = js.Array(DISABLED, ENABLED)
}

/** The source at the input device that is currently active.
  */
@js.native
sealed trait InputDeviceActiveInput extends js.Any
object InputDeviceActiveInput {
  val HDMI = "HDMI".asInstanceOf[InputDeviceActiveInput]
  val SDI = "SDI".asInstanceOf[InputDeviceActiveInput]

  @inline def values: js.Array[InputDeviceActiveInput] = js.Array(HDMI, SDI)
}

/** The source to activate (use) from the input device.
  */
@js.native
sealed trait InputDeviceConfiguredInput extends js.Any
object InputDeviceConfiguredInput {
  val AUTO = "AUTO".asInstanceOf[InputDeviceConfiguredInput]
  val HDMI = "HDMI".asInstanceOf[InputDeviceConfiguredInput]
  val SDI = "SDI".asInstanceOf[InputDeviceConfiguredInput]

  @inline def values: js.Array[InputDeviceConfiguredInput] = js.Array(AUTO, HDMI, SDI)
}

/** The state of the connection between the input device and AWS.
  */
@js.native
sealed trait InputDeviceConnectionState extends js.Any
object InputDeviceConnectionState {
  val DISCONNECTED = "DISCONNECTED".asInstanceOf[InputDeviceConnectionState]
  val CONNECTED = "CONNECTED".asInstanceOf[InputDeviceConnectionState]

  @inline def values: js.Array[InputDeviceConnectionState] = js.Array(DISCONNECTED, CONNECTED)
}

/** Specifies whether the input device has been configured (outside of MediaLive) to use a dynamic IP address assignment (DHCP) or a static IP address.
  */
@js.native
sealed trait InputDeviceIpScheme extends js.Any
object InputDeviceIpScheme {
  val STATIC = "STATIC".asInstanceOf[InputDeviceIpScheme]
  val DHCP = "DHCP".asInstanceOf[InputDeviceIpScheme]

  @inline def values: js.Array[InputDeviceIpScheme] = js.Array(STATIC, DHCP)
}

/** The scan type of the video source.
  */
@js.native
sealed trait InputDeviceScanType extends js.Any
object InputDeviceScanType {
  val INTERLACED = "INTERLACED".asInstanceOf[InputDeviceScanType]
  val PROGRESSIVE = "PROGRESSIVE".asInstanceOf[InputDeviceScanType]

  @inline def values: js.Array[InputDeviceScanType] = js.Array(INTERLACED, PROGRESSIVE)
}

/** The state of the input device.
  */
@js.native
sealed trait InputDeviceState extends js.Any
object InputDeviceState {
  val IDLE = "IDLE".asInstanceOf[InputDeviceState]
  val STREAMING = "STREAMING".asInstanceOf[InputDeviceState]

  @inline def values: js.Array[InputDeviceState] = js.Array(IDLE, STREAMING)
}

/** The type of device transfer. INCOMING for an input device that is being transferred to you, OUTGOING for an input device that you are transferring to another AWS account.
  */
@js.native
sealed trait InputDeviceTransferType extends js.Any
object InputDeviceTransferType {
  val OUTGOING = "OUTGOING".asInstanceOf[InputDeviceTransferType]
  val INCOMING = "INCOMING".asInstanceOf[InputDeviceTransferType]

  @inline def values: js.Array[InputDeviceTransferType] = js.Array(OUTGOING, INCOMING)
}

/** The type of the input device. For an AWS Elemental Link device that outputs resolutions up to 1080, choose "HD".
  */
@js.native
sealed trait InputDeviceType extends js.Any
object InputDeviceType {
  val HD = "HD".asInstanceOf[InputDeviceType]
  val UHD = "UHD".asInstanceOf[InputDeviceType]

  @inline def values: js.Array[InputDeviceType] = js.Array(HD, UHD)
}

/** Input Filter
  */
@js.native
sealed trait InputFilter extends js.Any
object InputFilter {
  val AUTO = "AUTO".asInstanceOf[InputFilter]
  val DISABLED = "DISABLED".asInstanceOf[InputFilter]
  val FORCED = "FORCED".asInstanceOf[InputFilter]

  @inline def values: js.Array[InputFilter] = js.Array(AUTO, DISABLED, FORCED)
}

/** Input Loss Action For Hls Out
  */
@js.native
sealed trait InputLossActionForHlsOut extends js.Any
object InputLossActionForHlsOut {
  val EMIT_OUTPUT = "EMIT_OUTPUT".asInstanceOf[InputLossActionForHlsOut]
  val PAUSE_OUTPUT = "PAUSE_OUTPUT".asInstanceOf[InputLossActionForHlsOut]

  @inline def values: js.Array[InputLossActionForHlsOut] = js.Array(EMIT_OUTPUT, PAUSE_OUTPUT)
}

/** Input Loss Action For Ms Smooth Out
  */
@js.native
sealed trait InputLossActionForMsSmoothOut extends js.Any
object InputLossActionForMsSmoothOut {
  val EMIT_OUTPUT = "EMIT_OUTPUT".asInstanceOf[InputLossActionForMsSmoothOut]
  val PAUSE_OUTPUT = "PAUSE_OUTPUT".asInstanceOf[InputLossActionForMsSmoothOut]

  @inline def values: js.Array[InputLossActionForMsSmoothOut] = js.Array(EMIT_OUTPUT, PAUSE_OUTPUT)
}

/** Input Loss Action For Rtmp Out
  */
@js.native
sealed trait InputLossActionForRtmpOut extends js.Any
object InputLossActionForRtmpOut {
  val EMIT_OUTPUT = "EMIT_OUTPUT".asInstanceOf[InputLossActionForRtmpOut]
  val PAUSE_OUTPUT = "PAUSE_OUTPUT".asInstanceOf[InputLossActionForRtmpOut]

  @inline def values: js.Array[InputLossActionForRtmpOut] = js.Array(EMIT_OUTPUT, PAUSE_OUTPUT)
}

/** Input Loss Action For Udp Out
  */
@js.native
sealed trait InputLossActionForUdpOut extends js.Any
object InputLossActionForUdpOut {
  val DROP_PROGRAM = "DROP_PROGRAM".asInstanceOf[InputLossActionForUdpOut]
  val DROP_TS = "DROP_TS".asInstanceOf[InputLossActionForUdpOut]
  val EMIT_PROGRAM = "EMIT_PROGRAM".asInstanceOf[InputLossActionForUdpOut]

  @inline def values: js.Array[InputLossActionForUdpOut] = js.Array(DROP_PROGRAM, DROP_TS, EMIT_PROGRAM)
}

/** Input Loss Image Type
  */
@js.native
sealed trait InputLossImageType extends js.Any
object InputLossImageType {
  val COLOR = "COLOR".asInstanceOf[InputLossImageType]
  val SLATE = "SLATE".asInstanceOf[InputLossImageType]

  @inline def values: js.Array[InputLossImageType] = js.Array(COLOR, SLATE)
}

/** Maximum input bitrate in megabits per second. Bitrates up to 50 Mbps are supported currently.
  */
@js.native
sealed trait InputMaximumBitrate extends js.Any
object InputMaximumBitrate {
  val MAX_10_MBPS = "MAX_10_MBPS".asInstanceOf[InputMaximumBitrate]
  val MAX_20_MBPS = "MAX_20_MBPS".asInstanceOf[InputMaximumBitrate]
  val MAX_50_MBPS = "MAX_50_MBPS".asInstanceOf[InputMaximumBitrate]

  @inline def values: js.Array[InputMaximumBitrate] = js.Array(MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS)
}

/** Input preference when deciding which input to make active when a previously failed input has recovered. If \"EQUAL_INPUT_PREFERENCE\", then the active input will stay active as long as it is healthy. If \"PRIMARY_INPUT_PREFERRED\", then always switch back to the primary input when it is healthy.
  */
@js.native
sealed trait InputPreference extends js.Any
object InputPreference {
  val EQUAL_INPUT_PREFERENCE = "EQUAL_INPUT_PREFERENCE".asInstanceOf[InputPreference]
  val PRIMARY_INPUT_PREFERRED = "PRIMARY_INPUT_PREFERRED".asInstanceOf[InputPreference]

  @inline def values: js.Array[InputPreference] = js.Array(EQUAL_INPUT_PREFERENCE, PRIMARY_INPUT_PREFERRED)
}

/** Input resolution based on lines of vertical resolution in the input; SD is less than 720 lines, HD is 720 to 1080 lines, UHD is greater than 1080 lines
  */
@js.native
sealed trait InputResolution extends js.Any
object InputResolution {
  val SD = "SD".asInstanceOf[InputResolution]
  val HD = "HD".asInstanceOf[InputResolution]
  val UHD = "UHD".asInstanceOf[InputResolution]

  @inline def values: js.Array[InputResolution] = js.Array(SD, HD, UHD)
}

/** Placeholder documentation for InputSecurityGroupState
  */
@js.native
sealed trait InputSecurityGroupState extends js.Any
object InputSecurityGroupState {
  val IDLE = "IDLE".asInstanceOf[InputSecurityGroupState]
  val IN_USE = "IN_USE".asInstanceOf[InputSecurityGroupState]
  val UPDATING = "UPDATING".asInstanceOf[InputSecurityGroupState]
  val DELETED = "DELETED".asInstanceOf[InputSecurityGroupState]

  @inline def values: js.Array[InputSecurityGroupState] = js.Array(IDLE, IN_USE, UPDATING, DELETED)
}

/** Input Source End Behavior
  */
@js.native
sealed trait InputSourceEndBehavior extends js.Any
object InputSourceEndBehavior {
  val CONTINUE = "CONTINUE".asInstanceOf[InputSourceEndBehavior]
  val LOOP = "LOOP".asInstanceOf[InputSourceEndBehavior]

  @inline def values: js.Array[InputSourceEndBehavior] = js.Array(CONTINUE, LOOP)
}

/** There are two types of input sources, static and dynamic. If an input source is dynamic you can change the source url of the input dynamically using an input switch action. Currently, two input types support a dynamic url at this time, MP4_FILE and TS_FILE. By default all input sources are static.
  */
@js.native
sealed trait InputSourceType extends js.Any
object InputSourceType {
  val STATIC = "STATIC".asInstanceOf[InputSourceType]
  val DYNAMIC = "DYNAMIC".asInstanceOf[InputSourceType]

  @inline def values: js.Array[InputSourceType] = js.Array(STATIC, DYNAMIC)
}

/** Placeholder documentation for InputState
  */
@js.native
sealed trait InputState extends js.Any
object InputState {
  val CREATING = "CREATING".asInstanceOf[InputState]
  val DETACHED = "DETACHED".asInstanceOf[InputState]
  val ATTACHED = "ATTACHED".asInstanceOf[InputState]
  val DELETING = "DELETING".asInstanceOf[InputState]
  val DELETED = "DELETED".asInstanceOf[InputState]

  @inline def values: js.Array[InputState] = js.Array(CREATING, DETACHED, ATTACHED, DELETING, DELETED)
}

/** Documentation update needed
  */
@js.native
sealed trait InputTimecodeSource extends js.Any
object InputTimecodeSource {
  val ZEROBASED = "ZEROBASED".asInstanceOf[InputTimecodeSource]
  val EMBEDDED = "EMBEDDED".asInstanceOf[InputTimecodeSource]

  @inline def values: js.Array[InputTimecodeSource] = js.Array(ZEROBASED, EMBEDDED)
}

/** The different types of inputs that AWS Elemental MediaLive supports.
  */
@js.native
sealed trait InputType extends js.Any
object InputType {
  val UDP_PUSH = "UDP_PUSH".asInstanceOf[InputType]
  val RTP_PUSH = "RTP_PUSH".asInstanceOf[InputType]
  val RTMP_PUSH = "RTMP_PUSH".asInstanceOf[InputType]
  val RTMP_PULL = "RTMP_PULL".asInstanceOf[InputType]
  val URL_PULL = "URL_PULL".asInstanceOf[InputType]
  val MP4_FILE = "MP4_FILE".asInstanceOf[InputType]
  val MEDIACONNECT = "MEDIACONNECT".asInstanceOf[InputType]
  val INPUT_DEVICE = "INPUT_DEVICE".asInstanceOf[InputType]
  val AWS_CDI = "AWS_CDI".asInstanceOf[InputType]
  val TS_FILE = "TS_FILE".asInstanceOf[InputType]

  @inline def values: js.Array[InputType] = js.Array(UDP_PUSH, RTP_PUSH, RTMP_PUSH, RTMP_PULL, URL_PULL, MP4_FILE, MEDIACONNECT, INPUT_DEVICE, AWS_CDI, TS_FILE)
}

/** If you specify a StopTimecode in an input (in order to clip the file), you can specify if you want the clip to exclude (the default) or include the frame specified by the timecode.
  */
@js.native
sealed trait LastFrameClippingBehavior extends js.Any
object LastFrameClippingBehavior {
  val EXCLUDE_LAST_FRAME = "EXCLUDE_LAST_FRAME".asInstanceOf[LastFrameClippingBehavior]
  val INCLUDE_LAST_FRAME = "INCLUDE_LAST_FRAME".asInstanceOf[LastFrameClippingBehavior]

  @inline def values: js.Array[LastFrameClippingBehavior] = js.Array(EXCLUDE_LAST_FRAME, INCLUDE_LAST_FRAME)
}

/** The log level the user wants for their channel.
  */
@js.native
sealed trait LogLevel extends js.Any
object LogLevel {
  val ERROR = "ERROR".asInstanceOf[LogLevel]
  val WARNING = "WARNING".asInstanceOf[LogLevel]
  val INFO = "INFO".asInstanceOf[LogLevel]
  val DEBUG = "DEBUG".asInstanceOf[LogLevel]
  val DISABLED = "DISABLED".asInstanceOf[LogLevel]

  @inline def values: js.Array[LogLevel] = js.Array(ERROR, WARNING, INFO, DEBUG, DISABLED)
}

/** M2ts Absent Input Audio Behavior
  */
@js.native
sealed trait M2tsAbsentInputAudioBehavior extends js.Any
object M2tsAbsentInputAudioBehavior {
  val DROP = "DROP".asInstanceOf[M2tsAbsentInputAudioBehavior]
  val ENCODE_SILENCE = "ENCODE_SILENCE".asInstanceOf[M2tsAbsentInputAudioBehavior]

  @inline def values: js.Array[M2tsAbsentInputAudioBehavior] = js.Array(DROP, ENCODE_SILENCE)
}

/** M2ts Arib
  */
@js.native
sealed trait M2tsArib extends js.Any
object M2tsArib {
  val DISABLED = "DISABLED".asInstanceOf[M2tsArib]
  val ENABLED = "ENABLED".asInstanceOf[M2tsArib]

  @inline def values: js.Array[M2tsArib] = js.Array(DISABLED, ENABLED)
}

/** M2ts Arib Captions Pid Control
  */
@js.native
sealed trait M2tsAribCaptionsPidControl extends js.Any
object M2tsAribCaptionsPidControl {
  val AUTO = "AUTO".asInstanceOf[M2tsAribCaptionsPidControl]
  val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[M2tsAribCaptionsPidControl]

  @inline def values: js.Array[M2tsAribCaptionsPidControl] = js.Array(AUTO, USE_CONFIGURED)
}

/** M2ts Audio Buffer Model
  */
@js.native
sealed trait M2tsAudioBufferModel extends js.Any
object M2tsAudioBufferModel {
  val ATSC = "ATSC".asInstanceOf[M2tsAudioBufferModel]
  val DVB = "DVB".asInstanceOf[M2tsAudioBufferModel]

  @inline def values: js.Array[M2tsAudioBufferModel] = js.Array(ATSC, DVB)
}

/** M2ts Audio Interval
  */
@js.native
sealed trait M2tsAudioInterval extends js.Any
object M2tsAudioInterval {
  val VIDEO_AND_FIXED_INTERVALS = "VIDEO_AND_FIXED_INTERVALS".asInstanceOf[M2tsAudioInterval]
  val VIDEO_INTERVAL = "VIDEO_INTERVAL".asInstanceOf[M2tsAudioInterval]

  @inline def values: js.Array[M2tsAudioInterval] = js.Array(VIDEO_AND_FIXED_INTERVALS, VIDEO_INTERVAL)
}

/** M2ts Audio Stream Type
  */
@js.native
sealed trait M2tsAudioStreamType extends js.Any
object M2tsAudioStreamType {
  val ATSC = "ATSC".asInstanceOf[M2tsAudioStreamType]
  val DVB = "DVB".asInstanceOf[M2tsAudioStreamType]

  @inline def values: js.Array[M2tsAudioStreamType] = js.Array(ATSC, DVB)
}

/** M2ts Buffer Model
  */
@js.native
sealed trait M2tsBufferModel extends js.Any
object M2tsBufferModel {
  val MULTIPLEX = "MULTIPLEX".asInstanceOf[M2tsBufferModel]
  val NONE = "NONE".asInstanceOf[M2tsBufferModel]

  @inline def values: js.Array[M2tsBufferModel] = js.Array(MULTIPLEX, NONE)
}

/** M2ts Cc Descriptor
  */
@js.native
sealed trait M2tsCcDescriptor extends js.Any
object M2tsCcDescriptor {
  val DISABLED = "DISABLED".asInstanceOf[M2tsCcDescriptor]
  val ENABLED = "ENABLED".asInstanceOf[M2tsCcDescriptor]

  @inline def values: js.Array[M2tsCcDescriptor] = js.Array(DISABLED, ENABLED)
}

/** M2ts Ebif Control
  */
@js.native
sealed trait M2tsEbifControl extends js.Any
object M2tsEbifControl {
  val NONE = "NONE".asInstanceOf[M2tsEbifControl]
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[M2tsEbifControl]

  @inline def values: js.Array[M2tsEbifControl] = js.Array(NONE, PASSTHROUGH)
}

/** M2ts Ebp Placement
  */
@js.native
sealed trait M2tsEbpPlacement extends js.Any
object M2tsEbpPlacement {
  val VIDEO_AND_AUDIO_PIDS = "VIDEO_AND_AUDIO_PIDS".asInstanceOf[M2tsEbpPlacement]
  val VIDEO_PID = "VIDEO_PID".asInstanceOf[M2tsEbpPlacement]

  @inline def values: js.Array[M2tsEbpPlacement] = js.Array(VIDEO_AND_AUDIO_PIDS, VIDEO_PID)
}

/** M2ts Es Rate In Pes
  */
@js.native
sealed trait M2tsEsRateInPes extends js.Any
object M2tsEsRateInPes {
  val EXCLUDE = "EXCLUDE".asInstanceOf[M2tsEsRateInPes]
  val INCLUDE = "INCLUDE".asInstanceOf[M2tsEsRateInPes]

  @inline def values: js.Array[M2tsEsRateInPes] = js.Array(EXCLUDE, INCLUDE)
}

/** M2ts Klv
  */
@js.native
sealed trait M2tsKlv extends js.Any
object M2tsKlv {
  val NONE = "NONE".asInstanceOf[M2tsKlv]
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[M2tsKlv]

  @inline def values: js.Array[M2tsKlv] = js.Array(NONE, PASSTHROUGH)
}

/** M2ts Nielsen Id3 Behavior
  */
@js.native
sealed trait M2tsNielsenId3Behavior extends js.Any
object M2tsNielsenId3Behavior {
  val NO_PASSTHROUGH = "NO_PASSTHROUGH".asInstanceOf[M2tsNielsenId3Behavior]
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[M2tsNielsenId3Behavior]

  @inline def values: js.Array[M2tsNielsenId3Behavior] = js.Array(NO_PASSTHROUGH, PASSTHROUGH)
}

/** M2ts Pcr Control
  */
@js.native
sealed trait M2tsPcrControl extends js.Any
object M2tsPcrControl {
  val CONFIGURED_PCR_PERIOD = "CONFIGURED_PCR_PERIOD".asInstanceOf[M2tsPcrControl]
  val PCR_EVERY_PES_PACKET = "PCR_EVERY_PES_PACKET".asInstanceOf[M2tsPcrControl]

  @inline def values: js.Array[M2tsPcrControl] = js.Array(CONFIGURED_PCR_PERIOD, PCR_EVERY_PES_PACKET)
}

/** M2ts Rate Mode
  */
@js.native
sealed trait M2tsRateMode extends js.Any
object M2tsRateMode {
  val CBR = "CBR".asInstanceOf[M2tsRateMode]
  val VBR = "VBR".asInstanceOf[M2tsRateMode]

  @inline def values: js.Array[M2tsRateMode] = js.Array(CBR, VBR)
}

/** M2ts Scte35 Control
  */
@js.native
sealed trait M2tsScte35Control extends js.Any
object M2tsScte35Control {
  val NONE = "NONE".asInstanceOf[M2tsScte35Control]
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[M2tsScte35Control]

  @inline def values: js.Array[M2tsScte35Control] = js.Array(NONE, PASSTHROUGH)
}

/** M2ts Segmentation Markers
  */
@js.native
sealed trait M2tsSegmentationMarkers extends js.Any
object M2tsSegmentationMarkers {
  val EBP = "EBP".asInstanceOf[M2tsSegmentationMarkers]
  val EBP_LEGACY = "EBP_LEGACY".asInstanceOf[M2tsSegmentationMarkers]
  val NONE = "NONE".asInstanceOf[M2tsSegmentationMarkers]
  val PSI_SEGSTART = "PSI_SEGSTART".asInstanceOf[M2tsSegmentationMarkers]
  val RAI_ADAPT = "RAI_ADAPT".asInstanceOf[M2tsSegmentationMarkers]
  val RAI_SEGSTART = "RAI_SEGSTART".asInstanceOf[M2tsSegmentationMarkers]

  @inline def values: js.Array[M2tsSegmentationMarkers] = js.Array(EBP, EBP_LEGACY, NONE, PSI_SEGSTART, RAI_ADAPT, RAI_SEGSTART)
}

/** M2ts Segmentation Style
  */
@js.native
sealed trait M2tsSegmentationStyle extends js.Any
object M2tsSegmentationStyle {
  val MAINTAIN_CADENCE = "MAINTAIN_CADENCE".asInstanceOf[M2tsSegmentationStyle]
  val RESET_CADENCE = "RESET_CADENCE".asInstanceOf[M2tsSegmentationStyle]

  @inline def values: js.Array[M2tsSegmentationStyle] = js.Array(MAINTAIN_CADENCE, RESET_CADENCE)
}

/** M2ts Timed Metadata Behavior
  */
@js.native
sealed trait M2tsTimedMetadataBehavior extends js.Any
object M2tsTimedMetadataBehavior {
  val NO_PASSTHROUGH = "NO_PASSTHROUGH".asInstanceOf[M2tsTimedMetadataBehavior]
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[M2tsTimedMetadataBehavior]

  @inline def values: js.Array[M2tsTimedMetadataBehavior] = js.Array(NO_PASSTHROUGH, PASSTHROUGH)
}

/** M3u8 Nielsen Id3 Behavior
  */
@js.native
sealed trait M3u8NielsenId3Behavior extends js.Any
object M3u8NielsenId3Behavior {
  val NO_PASSTHROUGH = "NO_PASSTHROUGH".asInstanceOf[M3u8NielsenId3Behavior]
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[M3u8NielsenId3Behavior]

  @inline def values: js.Array[M3u8NielsenId3Behavior] = js.Array(NO_PASSTHROUGH, PASSTHROUGH)
}

/** M3u8 Pcr Control
  */
@js.native
sealed trait M3u8PcrControl extends js.Any
object M3u8PcrControl {
  val CONFIGURED_PCR_PERIOD = "CONFIGURED_PCR_PERIOD".asInstanceOf[M3u8PcrControl]
  val PCR_EVERY_PES_PACKET = "PCR_EVERY_PES_PACKET".asInstanceOf[M3u8PcrControl]

  @inline def values: js.Array[M3u8PcrControl] = js.Array(CONFIGURED_PCR_PERIOD, PCR_EVERY_PES_PACKET)
}

/** M3u8 Scte35 Behavior
  */
@js.native
sealed trait M3u8Scte35Behavior extends js.Any
object M3u8Scte35Behavior {
  val NO_PASSTHROUGH = "NO_PASSTHROUGH".asInstanceOf[M3u8Scte35Behavior]
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[M3u8Scte35Behavior]

  @inline def values: js.Array[M3u8Scte35Behavior] = js.Array(NO_PASSTHROUGH, PASSTHROUGH)
}

/** M3u8 Timed Metadata Behavior
  */
@js.native
sealed trait M3u8TimedMetadataBehavior extends js.Any
object M3u8TimedMetadataBehavior {
  val NO_PASSTHROUGH = "NO_PASSTHROUGH".asInstanceOf[M3u8TimedMetadataBehavior]
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[M3u8TimedMetadataBehavior]

  @inline def values: js.Array[M3u8TimedMetadataBehavior] = js.Array(NO_PASSTHROUGH, PASSTHROUGH)
}

/** The currently selected maintenance day.
  */
@js.native
sealed trait MaintenanceDay extends js.Any
object MaintenanceDay {
  val MONDAY = "MONDAY".asInstanceOf[MaintenanceDay]
  val TUESDAY = "TUESDAY".asInstanceOf[MaintenanceDay]
  val WEDNESDAY = "WEDNESDAY".asInstanceOf[MaintenanceDay]
  val THURSDAY = "THURSDAY".asInstanceOf[MaintenanceDay]
  val FRIDAY = "FRIDAY".asInstanceOf[MaintenanceDay]
  val SATURDAY = "SATURDAY".asInstanceOf[MaintenanceDay]
  val SUNDAY = "SUNDAY".asInstanceOf[MaintenanceDay]

  @inline def values: js.Array[MaintenanceDay] = js.Array(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY)
}

/** Motion Graphics Insertion
  */
@js.native
sealed trait MotionGraphicsInsertion extends js.Any
object MotionGraphicsInsertion {
  val DISABLED = "DISABLED".asInstanceOf[MotionGraphicsInsertion]
  val ENABLED = "ENABLED".asInstanceOf[MotionGraphicsInsertion]

  @inline def values: js.Array[MotionGraphicsInsertion] = js.Array(DISABLED, ENABLED)
}

/** Mp2 Coding Mode
  */
@js.native
sealed trait Mp2CodingMode extends js.Any
object Mp2CodingMode {
  val CODING_MODE_1_0 = "CODING_MODE_1_0".asInstanceOf[Mp2CodingMode]
  val CODING_MODE_2_0 = "CODING_MODE_2_0".asInstanceOf[Mp2CodingMode]

  @inline def values: js.Array[Mp2CodingMode] = js.Array(CODING_MODE_1_0, CODING_MODE_2_0)
}

/** Mpeg2 Adaptive Quantization
  */
@js.native
sealed trait Mpeg2AdaptiveQuantization extends js.Any
object Mpeg2AdaptiveQuantization {
  val AUTO = "AUTO".asInstanceOf[Mpeg2AdaptiveQuantization]
  val HIGH = "HIGH".asInstanceOf[Mpeg2AdaptiveQuantization]
  val LOW = "LOW".asInstanceOf[Mpeg2AdaptiveQuantization]
  val MEDIUM = "MEDIUM".asInstanceOf[Mpeg2AdaptiveQuantization]
  val OFF = "OFF".asInstanceOf[Mpeg2AdaptiveQuantization]

  @inline def values: js.Array[Mpeg2AdaptiveQuantization] = js.Array(AUTO, HIGH, LOW, MEDIUM, OFF)
}

/** Mpeg2 Color Metadata
  */
@js.native
sealed trait Mpeg2ColorMetadata extends js.Any
object Mpeg2ColorMetadata {
  val IGNORE = "IGNORE".asInstanceOf[Mpeg2ColorMetadata]
  val INSERT = "INSERT".asInstanceOf[Mpeg2ColorMetadata]

  @inline def values: js.Array[Mpeg2ColorMetadata] = js.Array(IGNORE, INSERT)
}

/** Mpeg2 Color Space
  */
@js.native
sealed trait Mpeg2ColorSpace extends js.Any
object Mpeg2ColorSpace {
  val AUTO = "AUTO".asInstanceOf[Mpeg2ColorSpace]
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[Mpeg2ColorSpace]

  @inline def values: js.Array[Mpeg2ColorSpace] = js.Array(AUTO, PASSTHROUGH)
}

/** Mpeg2 Display Ratio
  */
@js.native
sealed trait Mpeg2DisplayRatio extends js.Any
object Mpeg2DisplayRatio {
  val DISPLAYRATIO16X9 = "DISPLAYRATIO16X9".asInstanceOf[Mpeg2DisplayRatio]
  val DISPLAYRATIO4X3 = "DISPLAYRATIO4X3".asInstanceOf[Mpeg2DisplayRatio]

  @inline def values: js.Array[Mpeg2DisplayRatio] = js.Array(DISPLAYRATIO16X9, DISPLAYRATIO4X3)
}

/** Mpeg2 Gop Size Units
  */
@js.native
sealed trait Mpeg2GopSizeUnits extends js.Any
object Mpeg2GopSizeUnits {
  val FRAMES = "FRAMES".asInstanceOf[Mpeg2GopSizeUnits]
  val SECONDS = "SECONDS".asInstanceOf[Mpeg2GopSizeUnits]

  @inline def values: js.Array[Mpeg2GopSizeUnits] = js.Array(FRAMES, SECONDS)
}

/** Mpeg2 Scan Type
  */
@js.native
sealed trait Mpeg2ScanType extends js.Any
object Mpeg2ScanType {
  val INTERLACED = "INTERLACED".asInstanceOf[Mpeg2ScanType]
  val PROGRESSIVE = "PROGRESSIVE".asInstanceOf[Mpeg2ScanType]

  @inline def values: js.Array[Mpeg2ScanType] = js.Array(INTERLACED, PROGRESSIVE)
}

/** Mpeg2 Sub Gop Length
  */
@js.native
sealed trait Mpeg2SubGopLength extends js.Any
object Mpeg2SubGopLength {
  val DYNAMIC = "DYNAMIC".asInstanceOf[Mpeg2SubGopLength]
  val FIXED = "FIXED".asInstanceOf[Mpeg2SubGopLength]

  @inline def values: js.Array[Mpeg2SubGopLength] = js.Array(DYNAMIC, FIXED)
}

/** Mpeg2 Timecode Insertion Behavior
  */
@js.native
sealed trait Mpeg2TimecodeInsertionBehavior extends js.Any
object Mpeg2TimecodeInsertionBehavior {
  val DISABLED = "DISABLED".asInstanceOf[Mpeg2TimecodeInsertionBehavior]
  val GOP_TIMECODE = "GOP_TIMECODE".asInstanceOf[Mpeg2TimecodeInsertionBehavior]

  @inline def values: js.Array[Mpeg2TimecodeInsertionBehavior] = js.Array(DISABLED, GOP_TIMECODE)
}

/** Ms Smooth H265 Packaging Type
  */
@js.native
sealed trait MsSmoothH265PackagingType extends js.Any
object MsSmoothH265PackagingType {
  val HEV1 = "HEV1".asInstanceOf[MsSmoothH265PackagingType]
  val HVC1 = "HVC1".asInstanceOf[MsSmoothH265PackagingType]

  @inline def values: js.Array[MsSmoothH265PackagingType] = js.Array(HEV1, HVC1)
}

/** The current state of the multiplex.
  */
@js.native
sealed trait MultiplexState extends js.Any
object MultiplexState {
  val CREATING = "CREATING".asInstanceOf[MultiplexState]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[MultiplexState]
  val IDLE = "IDLE".asInstanceOf[MultiplexState]
  val STARTING = "STARTING".asInstanceOf[MultiplexState]
  val RUNNING = "RUNNING".asInstanceOf[MultiplexState]
  val RECOVERING = "RECOVERING".asInstanceOf[MultiplexState]
  val STOPPING = "STOPPING".asInstanceOf[MultiplexState]
  val DELETING = "DELETING".asInstanceOf[MultiplexState]
  val DELETED = "DELETED".asInstanceOf[MultiplexState]

  @inline def values: js.Array[MultiplexState] = js.Array(CREATING, CREATE_FAILED, IDLE, STARTING, RUNNING, RECOVERING, STOPPING, DELETING, DELETED)
}

/** Network Input Server Validation
  */
@js.native
sealed trait NetworkInputServerValidation extends js.Any
object NetworkInputServerValidation {
  val CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME = "CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME".asInstanceOf[NetworkInputServerValidation]
  val CHECK_CRYPTOGRAPHY_ONLY = "CHECK_CRYPTOGRAPHY_ONLY".asInstanceOf[NetworkInputServerValidation]

  @inline def values: js.Array[NetworkInputServerValidation] = js.Array(CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME, CHECK_CRYPTOGRAPHY_ONLY)
}

/** State of Nielsen PCM to ID3 tagging
  */
@js.native
sealed trait NielsenPcmToId3TaggingState extends js.Any
object NielsenPcmToId3TaggingState {
  val DISABLED = "DISABLED".asInstanceOf[NielsenPcmToId3TaggingState]
  val ENABLED = "ENABLED".asInstanceOf[NielsenPcmToId3TaggingState]

  @inline def values: js.Array[NielsenPcmToId3TaggingState] = js.Array(DISABLED, ENABLED)
}

/** Nielsen Watermarks Cbet Stepaside
  */
@js.native
sealed trait NielsenWatermarksCbetStepaside extends js.Any
object NielsenWatermarksCbetStepaside {
  val DISABLED = "DISABLED".asInstanceOf[NielsenWatermarksCbetStepaside]
  val ENABLED = "ENABLED".asInstanceOf[NielsenWatermarksCbetStepaside]

  @inline def values: js.Array[NielsenWatermarksCbetStepaside] = js.Array(DISABLED, ENABLED)
}

/** Nielsen Watermarks Distribution Types
  */
@js.native
sealed trait NielsenWatermarksDistributionTypes extends js.Any
object NielsenWatermarksDistributionTypes {
  val FINAL_DISTRIBUTOR = "FINAL_DISTRIBUTOR".asInstanceOf[NielsenWatermarksDistributionTypes]
  val PROGRAM_CONTENT = "PROGRAM_CONTENT".asInstanceOf[NielsenWatermarksDistributionTypes]

  @inline def values: js.Array[NielsenWatermarksDistributionTypes] = js.Array(FINAL_DISTRIBUTOR, PROGRAM_CONTENT)
}

/** Units for duration, e.g. 'MONTHS'
  */
@js.native
sealed trait OfferingDurationUnits extends js.Any
object OfferingDurationUnits {
  val MONTHS = "MONTHS".asInstanceOf[OfferingDurationUnits]

  @inline def values: js.Array[OfferingDurationUnits] = js.Array(MONTHS)
}

/** Offering type, e.g. 'NO_UPFRONT'
  */
@js.native
sealed trait OfferingType extends js.Any
object OfferingType {
  val NO_UPFRONT = "NO_UPFRONT".asInstanceOf[OfferingType]

  @inline def values: js.Array[OfferingType] = js.Array(NO_UPFRONT)
}

/** Pipeline ID
  */
@js.native
sealed trait PipelineId extends js.Any
object PipelineId {
  val PIPELINE_0 = "PIPELINE_0".asInstanceOf[PipelineId]
  val PIPELINE_1 = "PIPELINE_1".asInstanceOf[PipelineId]

  @inline def values: js.Array[PipelineId] = js.Array(PIPELINE_0, PIPELINE_1)
}

/** Indicates which pipeline is preferred by the multiplex for program ingest. If set to \"PIPELINE_0\" or \"PIPELINE_1\" and an unhealthy ingest causes the multiplex to switch to the non-preferred pipeline, it will switch back once that ingest is healthy again. If set to \"CURRENTLY_ACTIVE\", it will not switch back to the other pipeline based on it recovering to a healthy state, it will only switch if the active pipeline becomes unhealthy.
  */
@js.native
sealed trait PreferredChannelPipeline extends js.Any
object PreferredChannelPipeline {
  val CURRENTLY_ACTIVE = "CURRENTLY_ACTIVE".asInstanceOf[PreferredChannelPipeline]
  val PIPELINE_0 = "PIPELINE_0".asInstanceOf[PreferredChannelPipeline]
  val PIPELINE_1 = "PIPELINE_1".asInstanceOf[PreferredChannelPipeline]

  @inline def values: js.Array[PreferredChannelPipeline] = js.Array(CURRENTLY_ACTIVE, PIPELINE_0, PIPELINE_1)
}

/** Whether or not to force reboot the input device.
  */
@js.native
sealed trait RebootInputDeviceForce extends js.Any
object RebootInputDeviceForce {
  val NO = "NO".asInstanceOf[RebootInputDeviceForce]
  val YES = "YES".asInstanceOf[RebootInputDeviceForce]

  @inline def values: js.Array[RebootInputDeviceForce] = js.Array(NO, YES)
}

/** Automatic Renewal Status for Reservation
  */
@js.native
sealed trait ReservationAutomaticRenewal extends js.Any
object ReservationAutomaticRenewal {
  val DISABLED = "DISABLED".asInstanceOf[ReservationAutomaticRenewal]
  val ENABLED = "ENABLED".asInstanceOf[ReservationAutomaticRenewal]
  val UNAVAILABLE = "UNAVAILABLE".asInstanceOf[ReservationAutomaticRenewal]

  @inline def values: js.Array[ReservationAutomaticRenewal] = js.Array(DISABLED, ENABLED, UNAVAILABLE)
}

/** Codec, 'MPEG2', 'AVC', 'HEVC', or 'AUDIO'
  */
@js.native
sealed trait ReservationCodec extends js.Any
object ReservationCodec {
  val MPEG2 = "MPEG2".asInstanceOf[ReservationCodec]
  val AVC = "AVC".asInstanceOf[ReservationCodec]
  val HEVC = "HEVC".asInstanceOf[ReservationCodec]
  val AUDIO = "AUDIO".asInstanceOf[ReservationCodec]
  val LINK = "LINK".asInstanceOf[ReservationCodec]

  @inline def values: js.Array[ReservationCodec] = js.Array(MPEG2, AVC, HEVC, AUDIO, LINK)
}

/** Maximum bitrate in megabits per second
  */
@js.native
sealed trait ReservationMaximumBitrate extends js.Any
object ReservationMaximumBitrate {
  val MAX_10_MBPS = "MAX_10_MBPS".asInstanceOf[ReservationMaximumBitrate]
  val MAX_20_MBPS = "MAX_20_MBPS".asInstanceOf[ReservationMaximumBitrate]
  val MAX_50_MBPS = "MAX_50_MBPS".asInstanceOf[ReservationMaximumBitrate]

  @inline def values: js.Array[ReservationMaximumBitrate] = js.Array(MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS)
}

/** Maximum framerate in frames per second (Outputs only)
  */
@js.native
sealed trait ReservationMaximumFramerate extends js.Any
object ReservationMaximumFramerate {
  val MAX_30_FPS = "MAX_30_FPS".asInstanceOf[ReservationMaximumFramerate]
  val MAX_60_FPS = "MAX_60_FPS".asInstanceOf[ReservationMaximumFramerate]

  @inline def values: js.Array[ReservationMaximumFramerate] = js.Array(MAX_30_FPS, MAX_60_FPS)
}

/** Resolution based on lines of vertical resolution; SD is less than 720 lines, HD is 720 to 1080 lines, FHD is 1080 lines, UHD is greater than 1080 lines
  */
@js.native
sealed trait ReservationResolution extends js.Any
object ReservationResolution {
  val SD = "SD".asInstanceOf[ReservationResolution]
  val HD = "HD".asInstanceOf[ReservationResolution]
  val FHD = "FHD".asInstanceOf[ReservationResolution]
  val UHD = "UHD".asInstanceOf[ReservationResolution]

  @inline def values: js.Array[ReservationResolution] = js.Array(SD, HD, FHD, UHD)
}

/** Resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
  */
@js.native
sealed trait ReservationResourceType extends js.Any
object ReservationResourceType {
  val INPUT = "INPUT".asInstanceOf[ReservationResourceType]
  val OUTPUT = "OUTPUT".asInstanceOf[ReservationResourceType]
  val MULTIPLEX = "MULTIPLEX".asInstanceOf[ReservationResourceType]
  val CHANNEL = "CHANNEL".asInstanceOf[ReservationResourceType]

  @inline def values: js.Array[ReservationResourceType] = js.Array(INPUT, OUTPUT, MULTIPLEX, CHANNEL)
}

/** Special features, 'ADVANCED_AUDIO' 'AUDIO_NORMALIZATION' 'MGHD' or 'MGUHD'
  */
@js.native
sealed trait ReservationSpecialFeature extends js.Any
object ReservationSpecialFeature {
  val ADVANCED_AUDIO = "ADVANCED_AUDIO".asInstanceOf[ReservationSpecialFeature]
  val AUDIO_NORMALIZATION = "AUDIO_NORMALIZATION".asInstanceOf[ReservationSpecialFeature]
  val MGHD = "MGHD".asInstanceOf[ReservationSpecialFeature]
  val MGUHD = "MGUHD".asInstanceOf[ReservationSpecialFeature]

  @inline def values: js.Array[ReservationSpecialFeature] = js.Array(ADVANCED_AUDIO, AUDIO_NORMALIZATION, MGHD, MGUHD)
}

/** Current reservation state
  */
@js.native
sealed trait ReservationState extends js.Any
object ReservationState {
  val ACTIVE = "ACTIVE".asInstanceOf[ReservationState]
  val EXPIRED = "EXPIRED".asInstanceOf[ReservationState]
  val CANCELED = "CANCELED".asInstanceOf[ReservationState]
  val DELETED = "DELETED".asInstanceOf[ReservationState]

  @inline def values: js.Array[ReservationState] = js.Array(ACTIVE, EXPIRED, CANCELED, DELETED)
}

/** Video quality, e.g. 'STANDARD' (Outputs only)
  */
@js.native
sealed trait ReservationVideoQuality extends js.Any
object ReservationVideoQuality {
  val STANDARD = "STANDARD".asInstanceOf[ReservationVideoQuality]
  val ENHANCED = "ENHANCED".asInstanceOf[ReservationVideoQuality]
  val PREMIUM = "PREMIUM".asInstanceOf[ReservationVideoQuality]

  @inline def values: js.Array[ReservationVideoQuality] = js.Array(STANDARD, ENHANCED, PREMIUM)
}

/** Rtmp Ad Markers
  */
@js.native
sealed trait RtmpAdMarkers extends js.Any
object RtmpAdMarkers {
  val ON_CUE_POINT_SCTE35 = "ON_CUE_POINT_SCTE35".asInstanceOf[RtmpAdMarkers]

  @inline def values: js.Array[RtmpAdMarkers] = js.Array(ON_CUE_POINT_SCTE35)
}

/** Rtmp Cache Full Behavior
  */
@js.native
sealed trait RtmpCacheFullBehavior extends js.Any
object RtmpCacheFullBehavior {
  val DISCONNECT_IMMEDIATELY = "DISCONNECT_IMMEDIATELY".asInstanceOf[RtmpCacheFullBehavior]
  val WAIT_FOR_SERVER = "WAIT_FOR_SERVER".asInstanceOf[RtmpCacheFullBehavior]

  @inline def values: js.Array[RtmpCacheFullBehavior] = js.Array(DISCONNECT_IMMEDIATELY, WAIT_FOR_SERVER)
}

/** Rtmp Caption Data
  */
@js.native
sealed trait RtmpCaptionData extends js.Any
object RtmpCaptionData {
  val ALL = "ALL".asInstanceOf[RtmpCaptionData]
  val FIELD1_608 = "FIELD1_608".asInstanceOf[RtmpCaptionData]
  val FIELD1_AND_FIELD2_608 = "FIELD1_AND_FIELD2_608".asInstanceOf[RtmpCaptionData]

  @inline def values: js.Array[RtmpCaptionData] = js.Array(ALL, FIELD1_608, FIELD1_AND_FIELD2_608)
}

/** Rtmp Output Certificate Mode
  */
@js.native
sealed trait RtmpOutputCertificateMode extends js.Any
object RtmpOutputCertificateMode {
  val SELF_SIGNED = "SELF_SIGNED".asInstanceOf[RtmpOutputCertificateMode]
  val VERIFY_AUTHENTICITY = "VERIFY_AUTHENTICITY".asInstanceOf[RtmpOutputCertificateMode]

  @inline def values: js.Array[RtmpOutputCertificateMode] = js.Array(SELF_SIGNED, VERIFY_AUTHENTICITY)
}

/** S3 Canned Acl
  */
@js.native
sealed trait S3CannedAcl extends js.Any
object S3CannedAcl {
  val AUTHENTICATED_READ = "AUTHENTICATED_READ".asInstanceOf[S3CannedAcl]
  val BUCKET_OWNER_FULL_CONTROL = "BUCKET_OWNER_FULL_CONTROL".asInstanceOf[S3CannedAcl]
  val BUCKET_OWNER_READ = "BUCKET_OWNER_READ".asInstanceOf[S3CannedAcl]
  val PUBLIC_READ = "PUBLIC_READ".asInstanceOf[S3CannedAcl]

  @inline def values: js.Array[S3CannedAcl] = js.Array(AUTHENTICATED_READ, BUCKET_OWNER_FULL_CONTROL, BUCKET_OWNER_READ, PUBLIC_READ)
}

/** Scte20 Convert608 To708
  */
@js.native
sealed trait Scte20Convert608To708 extends js.Any
object Scte20Convert608To708 {
  val DISABLED = "DISABLED".asInstanceOf[Scte20Convert608To708]
  val UPCONVERT = "UPCONVERT".asInstanceOf[Scte20Convert608To708]

  @inline def values: js.Array[Scte20Convert608To708] = js.Array(DISABLED, UPCONVERT)
}

/** Scte27 Ocr Language
  */
@js.native
sealed trait Scte27OcrLanguage extends js.Any
object Scte27OcrLanguage {
  val DEU = "DEU".asInstanceOf[Scte27OcrLanguage]
  val ENG = "ENG".asInstanceOf[Scte27OcrLanguage]
  val FRA = "FRA".asInstanceOf[Scte27OcrLanguage]
  val NLD = "NLD".asInstanceOf[Scte27OcrLanguage]
  val POR = "POR".asInstanceOf[Scte27OcrLanguage]
  val SPA = "SPA".asInstanceOf[Scte27OcrLanguage]

  @inline def values: js.Array[Scte27OcrLanguage] = js.Array(DEU, ENG, FRA, NLD, POR, SPA)
}

/** Scte35 Apos No Regional Blackout Behavior
  */
@js.native
sealed trait Scte35AposNoRegionalBlackoutBehavior extends js.Any
object Scte35AposNoRegionalBlackoutBehavior {
  val FOLLOW = "FOLLOW".asInstanceOf[Scte35AposNoRegionalBlackoutBehavior]
  val IGNORE = "IGNORE".asInstanceOf[Scte35AposNoRegionalBlackoutBehavior]

  @inline def values: js.Array[Scte35AposNoRegionalBlackoutBehavior] = js.Array(FOLLOW, IGNORE)
}

/** Scte35 Apos Web Delivery Allowed Behavior
  */
@js.native
sealed trait Scte35AposWebDeliveryAllowedBehavior extends js.Any
object Scte35AposWebDeliveryAllowedBehavior {
  val FOLLOW = "FOLLOW".asInstanceOf[Scte35AposWebDeliveryAllowedBehavior]
  val IGNORE = "IGNORE".asInstanceOf[Scte35AposWebDeliveryAllowedBehavior]

  @inline def values: js.Array[Scte35AposWebDeliveryAllowedBehavior] = js.Array(FOLLOW, IGNORE)
}

/** Corresponds to the archive_allowed parameter. A value of ARCHIVE_NOT_ALLOWED corresponds to 0 (false) in the SCTE-35 specification. If you include one of the "restriction" flags then you must include all four of them.
  */
@js.native
sealed trait Scte35ArchiveAllowedFlag extends js.Any
object Scte35ArchiveAllowedFlag {
  val ARCHIVE_NOT_ALLOWED = "ARCHIVE_NOT_ALLOWED".asInstanceOf[Scte35ArchiveAllowedFlag]
  val ARCHIVE_ALLOWED = "ARCHIVE_ALLOWED".asInstanceOf[Scte35ArchiveAllowedFlag]

  @inline def values: js.Array[Scte35ArchiveAllowedFlag] = js.Array(ARCHIVE_NOT_ALLOWED, ARCHIVE_ALLOWED)
}

/** Corresponds to the device_restrictions parameter in a segmentation_descriptor. If you include one of the "restriction" flags then you must include all four of them.
  */
@js.native
sealed trait Scte35DeviceRestrictions extends js.Any
object Scte35DeviceRestrictions {
  val NONE = "NONE".asInstanceOf[Scte35DeviceRestrictions]
  val RESTRICT_GROUP0 = "RESTRICT_GROUP0".asInstanceOf[Scte35DeviceRestrictions]
  val RESTRICT_GROUP1 = "RESTRICT_GROUP1".asInstanceOf[Scte35DeviceRestrictions]
  val RESTRICT_GROUP2 = "RESTRICT_GROUP2".asInstanceOf[Scte35DeviceRestrictions]

  @inline def values: js.Array[Scte35DeviceRestrictions] = js.Array(NONE, RESTRICT_GROUP0, RESTRICT_GROUP1, RESTRICT_GROUP2)
}

/** Settings to let you create a clip of the file input, in order to set up the input to ingest only a portion of the file.
  */
@js.native
sealed trait Scte35InputMode extends js.Any
object Scte35InputMode {
  val FIXED = "FIXED".asInstanceOf[Scte35InputMode]
  val FOLLOW_ACTIVE = "FOLLOW_ACTIVE".asInstanceOf[Scte35InputMode]

  @inline def values: js.Array[Scte35InputMode] = js.Array(FIXED, FOLLOW_ACTIVE)
}

/** Corresponds to the no_regional_blackout_flag parameter. A value of REGIONAL_BLACKOUT corresponds to 0 (false) in the SCTE-35 specification. If you include one of the "restriction" flags then you must include all four of them.
  */
@js.native
sealed trait Scte35NoRegionalBlackoutFlag extends js.Any
object Scte35NoRegionalBlackoutFlag {
  val REGIONAL_BLACKOUT = "REGIONAL_BLACKOUT".asInstanceOf[Scte35NoRegionalBlackoutFlag]
  val NO_REGIONAL_BLACKOUT = "NO_REGIONAL_BLACKOUT".asInstanceOf[Scte35NoRegionalBlackoutFlag]

  @inline def values: js.Array[Scte35NoRegionalBlackoutFlag] = js.Array(REGIONAL_BLACKOUT, NO_REGIONAL_BLACKOUT)
}

/** Corresponds to SCTE-35 segmentation_event_cancel_indicator. SEGMENTATION_EVENT_NOT_CANCELED corresponds to 0 in the SCTE-35 specification and indicates that this is an insertion request. SEGMENTATION_EVENT_CANCELED corresponds to 1 in the SCTE-35 specification and indicates that this is a cancelation request, in which case complete this field and the existing event ID to cancel.
  */
@js.native
sealed trait Scte35SegmentationCancelIndicator extends js.Any
object Scte35SegmentationCancelIndicator {
  val SEGMENTATION_EVENT_NOT_CANCELED = "SEGMENTATION_EVENT_NOT_CANCELED".asInstanceOf[Scte35SegmentationCancelIndicator]
  val SEGMENTATION_EVENT_CANCELED = "SEGMENTATION_EVENT_CANCELED".asInstanceOf[Scte35SegmentationCancelIndicator]

  @inline def values: js.Array[Scte35SegmentationCancelIndicator] = js.Array(SEGMENTATION_EVENT_NOT_CANCELED, SEGMENTATION_EVENT_CANCELED)
}

/** Scte35 Splice Insert No Regional Blackout Behavior
  */
@js.native
sealed trait Scte35SpliceInsertNoRegionalBlackoutBehavior extends js.Any
object Scte35SpliceInsertNoRegionalBlackoutBehavior {
  val FOLLOW = "FOLLOW".asInstanceOf[Scte35SpliceInsertNoRegionalBlackoutBehavior]
  val IGNORE = "IGNORE".asInstanceOf[Scte35SpliceInsertNoRegionalBlackoutBehavior]

  @inline def values: js.Array[Scte35SpliceInsertNoRegionalBlackoutBehavior] = js.Array(FOLLOW, IGNORE)
}

/** Scte35 Splice Insert Web Delivery Allowed Behavior
  */
@js.native
sealed trait Scte35SpliceInsertWebDeliveryAllowedBehavior extends js.Any
object Scte35SpliceInsertWebDeliveryAllowedBehavior {
  val FOLLOW = "FOLLOW".asInstanceOf[Scte35SpliceInsertWebDeliveryAllowedBehavior]
  val IGNORE = "IGNORE".asInstanceOf[Scte35SpliceInsertWebDeliveryAllowedBehavior]

  @inline def values: js.Array[Scte35SpliceInsertWebDeliveryAllowedBehavior] = js.Array(FOLLOW, IGNORE)
}

/** Corresponds to the web_delivery_allowed_flag parameter. A value of WEB_DELIVERY_NOT_ALLOWED corresponds to 0 (false) in the SCTE-35 specification. If you include one of the "restriction" flags then you must include all four of them.
  */
@js.native
sealed trait Scte35WebDeliveryAllowedFlag extends js.Any
object Scte35WebDeliveryAllowedFlag {
  val WEB_DELIVERY_NOT_ALLOWED = "WEB_DELIVERY_NOT_ALLOWED".asInstanceOf[Scte35WebDeliveryAllowedFlag]
  val WEB_DELIVERY_ALLOWED = "WEB_DELIVERY_ALLOWED".asInstanceOf[Scte35WebDeliveryAllowedFlag]

  @inline def values: js.Array[Scte35WebDeliveryAllowedFlag] = js.Array(WEB_DELIVERY_NOT_ALLOWED, WEB_DELIVERY_ALLOWED)
}

/** Smooth Group Audio Only Timecode Control
  */
@js.native
sealed trait SmoothGroupAudioOnlyTimecodeControl extends js.Any
object SmoothGroupAudioOnlyTimecodeControl {
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[SmoothGroupAudioOnlyTimecodeControl]
  val USE_CONFIGURED_CLOCK = "USE_CONFIGURED_CLOCK".asInstanceOf[SmoothGroupAudioOnlyTimecodeControl]

  @inline def values: js.Array[SmoothGroupAudioOnlyTimecodeControl] = js.Array(PASSTHROUGH, USE_CONFIGURED_CLOCK)
}

/** Smooth Group Certificate Mode
  */
@js.native
sealed trait SmoothGroupCertificateMode extends js.Any
object SmoothGroupCertificateMode {
  val SELF_SIGNED = "SELF_SIGNED".asInstanceOf[SmoothGroupCertificateMode]
  val VERIFY_AUTHENTICITY = "VERIFY_AUTHENTICITY".asInstanceOf[SmoothGroupCertificateMode]

  @inline def values: js.Array[SmoothGroupCertificateMode] = js.Array(SELF_SIGNED, VERIFY_AUTHENTICITY)
}

/** Smooth Group Event Id Mode
  */
@js.native
sealed trait SmoothGroupEventIdMode extends js.Any
object SmoothGroupEventIdMode {
  val NO_EVENT_ID = "NO_EVENT_ID".asInstanceOf[SmoothGroupEventIdMode]
  val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[SmoothGroupEventIdMode]
  val USE_TIMESTAMP = "USE_TIMESTAMP".asInstanceOf[SmoothGroupEventIdMode]

  @inline def values: js.Array[SmoothGroupEventIdMode] = js.Array(NO_EVENT_ID, USE_CONFIGURED, USE_TIMESTAMP)
}

/** Smooth Group Event Stop Behavior
  */
@js.native
sealed trait SmoothGroupEventStopBehavior extends js.Any
object SmoothGroupEventStopBehavior {
  val NONE = "NONE".asInstanceOf[SmoothGroupEventStopBehavior]
  val SEND_EOS = "SEND_EOS".asInstanceOf[SmoothGroupEventStopBehavior]

  @inline def values: js.Array[SmoothGroupEventStopBehavior] = js.Array(NONE, SEND_EOS)
}

/** Smooth Group Segmentation Mode
  */
@js.native
sealed trait SmoothGroupSegmentationMode extends js.Any
object SmoothGroupSegmentationMode {
  val USE_INPUT_SEGMENTATION = "USE_INPUT_SEGMENTATION".asInstanceOf[SmoothGroupSegmentationMode]
  val USE_SEGMENT_DURATION = "USE_SEGMENT_DURATION".asInstanceOf[SmoothGroupSegmentationMode]

  @inline def values: js.Array[SmoothGroupSegmentationMode] = js.Array(USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION)
}

/** Smooth Group Sparse Track Type
  */
@js.native
sealed trait SmoothGroupSparseTrackType extends js.Any
object SmoothGroupSparseTrackType {
  val NONE = "NONE".asInstanceOf[SmoothGroupSparseTrackType]
  val SCTE_35 = "SCTE_35".asInstanceOf[SmoothGroupSparseTrackType]
  val SCTE_35_WITHOUT_SEGMENTATION = "SCTE_35_WITHOUT_SEGMENTATION".asInstanceOf[SmoothGroupSparseTrackType]

  @inline def values: js.Array[SmoothGroupSparseTrackType] = js.Array(NONE, SCTE_35, SCTE_35_WITHOUT_SEGMENTATION)
}

/** Smooth Group Stream Manifest Behavior
  */
@js.native
sealed trait SmoothGroupStreamManifestBehavior extends js.Any
object SmoothGroupStreamManifestBehavior {
  val DO_NOT_SEND = "DO_NOT_SEND".asInstanceOf[SmoothGroupStreamManifestBehavior]
  val SEND = "SEND".asInstanceOf[SmoothGroupStreamManifestBehavior]

  @inline def values: js.Array[SmoothGroupStreamManifestBehavior] = js.Array(DO_NOT_SEND, SEND)
}

/** Smooth Group Timestamp Offset Mode
  */
@js.native
sealed trait SmoothGroupTimestampOffsetMode extends js.Any
object SmoothGroupTimestampOffsetMode {
  val USE_CONFIGURED_OFFSET = "USE_CONFIGURED_OFFSET".asInstanceOf[SmoothGroupTimestampOffsetMode]
  val USE_EVENT_START_DATE = "USE_EVENT_START_DATE".asInstanceOf[SmoothGroupTimestampOffsetMode]

  @inline def values: js.Array[SmoothGroupTimestampOffsetMode] = js.Array(USE_CONFIGURED_OFFSET, USE_EVENT_START_DATE)
}

/** Smpte2038 Data Preference
  */
@js.native
sealed trait Smpte2038DataPreference extends js.Any
object Smpte2038DataPreference {
  val IGNORE = "IGNORE".asInstanceOf[Smpte2038DataPreference]
  val PREFER = "PREFER".asInstanceOf[Smpte2038DataPreference]

  @inline def values: js.Array[Smpte2038DataPreference] = js.Array(IGNORE, PREFER)
}

/** Temporal Filter Post Filter Sharpening
  */
@js.native
sealed trait TemporalFilterPostFilterSharpening extends js.Any
object TemporalFilterPostFilterSharpening {
  val AUTO = "AUTO".asInstanceOf[TemporalFilterPostFilterSharpening]
  val DISABLED = "DISABLED".asInstanceOf[TemporalFilterPostFilterSharpening]
  val ENABLED = "ENABLED".asInstanceOf[TemporalFilterPostFilterSharpening]

  @inline def values: js.Array[TemporalFilterPostFilterSharpening] = js.Array(AUTO, DISABLED, ENABLED)
}

/** Temporal Filter Strength
  */
@js.native
sealed trait TemporalFilterStrength extends js.Any
object TemporalFilterStrength {
  val AUTO = "AUTO".asInstanceOf[TemporalFilterStrength]
  val STRENGTH_1 = "STRENGTH_1".asInstanceOf[TemporalFilterStrength]
  val STRENGTH_2 = "STRENGTH_2".asInstanceOf[TemporalFilterStrength]
  val STRENGTH_3 = "STRENGTH_3".asInstanceOf[TemporalFilterStrength]
  val STRENGTH_4 = "STRENGTH_4".asInstanceOf[TemporalFilterStrength]
  val STRENGTH_5 = "STRENGTH_5".asInstanceOf[TemporalFilterStrength]
  val STRENGTH_6 = "STRENGTH_6".asInstanceOf[TemporalFilterStrength]
  val STRENGTH_7 = "STRENGTH_7".asInstanceOf[TemporalFilterStrength]
  val STRENGTH_8 = "STRENGTH_8".asInstanceOf[TemporalFilterStrength]
  val STRENGTH_9 = "STRENGTH_9".asInstanceOf[TemporalFilterStrength]
  val STRENGTH_10 = "STRENGTH_10".asInstanceOf[TemporalFilterStrength]
  val STRENGTH_11 = "STRENGTH_11".asInstanceOf[TemporalFilterStrength]
  val STRENGTH_12 = "STRENGTH_12".asInstanceOf[TemporalFilterStrength]
  val STRENGTH_13 = "STRENGTH_13".asInstanceOf[TemporalFilterStrength]
  val STRENGTH_14 = "STRENGTH_14".asInstanceOf[TemporalFilterStrength]
  val STRENGTH_15 = "STRENGTH_15".asInstanceOf[TemporalFilterStrength]
  val STRENGTH_16 = "STRENGTH_16".asInstanceOf[TemporalFilterStrength]

  @inline def values: js.Array[TemporalFilterStrength] = js.Array(
    AUTO,
    STRENGTH_1,
    STRENGTH_2,
    STRENGTH_3,
    STRENGTH_4,
    STRENGTH_5,
    STRENGTH_6,
    STRENGTH_7,
    STRENGTH_8,
    STRENGTH_9,
    STRENGTH_10,
    STRENGTH_11,
    STRENGTH_12,
    STRENGTH_13,
    STRENGTH_14,
    STRENGTH_15,
    STRENGTH_16
  )
}

/** Timecode Config Source
  */
@js.native
sealed trait TimecodeConfigSource extends js.Any
object TimecodeConfigSource {
  val EMBEDDED = "EMBEDDED".asInstanceOf[TimecodeConfigSource]
  val SYSTEMCLOCK = "SYSTEMCLOCK".asInstanceOf[TimecodeConfigSource]
  val ZEROBASED = "ZEROBASED".asInstanceOf[TimecodeConfigSource]

  @inline def values: js.Array[TimecodeConfigSource] = js.Array(EMBEDDED, SYSTEMCLOCK, ZEROBASED)
}

/** Ttml Destination Style Control
  */
@js.native
sealed trait TtmlDestinationStyleControl extends js.Any
object TtmlDestinationStyleControl {
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[TtmlDestinationStyleControl]
  val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[TtmlDestinationStyleControl]

  @inline def values: js.Array[TtmlDestinationStyleControl] = js.Array(PASSTHROUGH, USE_CONFIGURED)
}

/** Udp Timed Metadata Id3 Frame
  */
@js.native
sealed trait UdpTimedMetadataId3Frame extends js.Any
object UdpTimedMetadataId3Frame {
  val NONE = "NONE".asInstanceOf[UdpTimedMetadataId3Frame]
  val PRIV = "PRIV".asInstanceOf[UdpTimedMetadataId3Frame]
  val TDRL = "TDRL".asInstanceOf[UdpTimedMetadataId3Frame]

  @inline def values: js.Array[UdpTimedMetadataId3Frame] = js.Array(NONE, PRIV, TDRL)
}

/** Video Description Respond To Afd
  */
@js.native
sealed trait VideoDescriptionRespondToAfd extends js.Any
object VideoDescriptionRespondToAfd {
  val NONE = "NONE".asInstanceOf[VideoDescriptionRespondToAfd]
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[VideoDescriptionRespondToAfd]
  val RESPOND = "RESPOND".asInstanceOf[VideoDescriptionRespondToAfd]

  @inline def values: js.Array[VideoDescriptionRespondToAfd] = js.Array(NONE, PASSTHROUGH, RESPOND)
}

/** Video Description Scaling Behavior
  */
@js.native
sealed trait VideoDescriptionScalingBehavior extends js.Any
object VideoDescriptionScalingBehavior {
  val DEFAULT = "DEFAULT".asInstanceOf[VideoDescriptionScalingBehavior]
  val STRETCH_TO_OUTPUT = "STRETCH_TO_OUTPUT".asInstanceOf[VideoDescriptionScalingBehavior]

  @inline def values: js.Array[VideoDescriptionScalingBehavior] = js.Array(DEFAULT, STRETCH_TO_OUTPUT)
}

/** Video Selector Color Space
  */
@js.native
sealed trait VideoSelectorColorSpace extends js.Any
object VideoSelectorColorSpace {
  val FOLLOW = "FOLLOW".asInstanceOf[VideoSelectorColorSpace]
  val HDR10 = "HDR10".asInstanceOf[VideoSelectorColorSpace]
  val HLG_2020 = "HLG_2020".asInstanceOf[VideoSelectorColorSpace]
  val REC_601 = "REC_601".asInstanceOf[VideoSelectorColorSpace]
  val REC_709 = "REC_709".asInstanceOf[VideoSelectorColorSpace]

  @inline def values: js.Array[VideoSelectorColorSpace] = js.Array(FOLLOW, HDR10, HLG_2020, REC_601, REC_709)
}

/** Video Selector Color Space Usage
  */
@js.native
sealed trait VideoSelectorColorSpaceUsage extends js.Any
object VideoSelectorColorSpaceUsage {
  val FALLBACK = "FALLBACK".asInstanceOf[VideoSelectorColorSpaceUsage]
  val FORCE = "FORCE".asInstanceOf[VideoSelectorColorSpaceUsage]

  @inline def values: js.Array[VideoSelectorColorSpaceUsage] = js.Array(FALLBACK, FORCE)
}

/** Wav Coding Mode
  */
@js.native
sealed trait WavCodingMode extends js.Any
object WavCodingMode {
  val CODING_MODE_1_0 = "CODING_MODE_1_0".asInstanceOf[WavCodingMode]
  val CODING_MODE_2_0 = "CODING_MODE_2_0".asInstanceOf[WavCodingMode]
  val CODING_MODE_4_0 = "CODING_MODE_4_0".asInstanceOf[WavCodingMode]
  val CODING_MODE_8_0 = "CODING_MODE_8_0".asInstanceOf[WavCodingMode]

  @inline def values: js.Array[WavCodingMode] = js.Array(CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_4_0, CODING_MODE_8_0)
}

/** Webvtt Destination Style Control
  */
@js.native
sealed trait WebvttDestinationStyleControl extends js.Any
object WebvttDestinationStyleControl {
  val NO_STYLE_DATA = "NO_STYLE_DATA".asInstanceOf[WebvttDestinationStyleControl]
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[WebvttDestinationStyleControl]

  @inline def values: js.Array[WebvttDestinationStyleControl] = js.Array(NO_STYLE_DATA, PASSTHROUGH)
}
