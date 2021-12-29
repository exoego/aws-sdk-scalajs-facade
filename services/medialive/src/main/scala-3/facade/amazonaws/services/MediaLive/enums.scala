package facade.amazonaws.services.medialive

import scalajs._

/** Aac Coding Mode
  */
type AacCodingMode = "AD_RECEIVER_MIX" | "CODING_MODE_1_0" | "CODING_MODE_1_1" | "CODING_MODE_2_0" | "CODING_MODE_5_1"
object AacCodingMode {
  val AD_RECEIVER_MIX: "AD_RECEIVER_MIX" = "AD_RECEIVER_MIX"
  val CODING_MODE_1_0: "CODING_MODE_1_0" = "CODING_MODE_1_0"
  val CODING_MODE_1_1: "CODING_MODE_1_1" = "CODING_MODE_1_1"
  val CODING_MODE_2_0: "CODING_MODE_2_0" = "CODING_MODE_2_0"
  val CODING_MODE_5_1: "CODING_MODE_5_1" = "CODING_MODE_5_1"

  @inline def values = js.Array[AacCodingMode](AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0, CODING_MODE_5_1)
}

/** Aac Input Type
  */
type AacInputType = "BROADCASTER_MIXED_AD" | "NORMAL"
object AacInputType {
  val BROADCASTER_MIXED_AD: "BROADCASTER_MIXED_AD" = "BROADCASTER_MIXED_AD"
  val NORMAL: "NORMAL" = "NORMAL"

  @inline def values = js.Array[AacInputType](BROADCASTER_MIXED_AD, NORMAL)
}

/** Aac Profile
  */
type AacProfile = "HEV1" | "HEV2" | "LC"
object AacProfile {
  val HEV1: "HEV1" = "HEV1"
  val HEV2: "HEV2" = "HEV2"
  val LC: "LC" = "LC"

  @inline def values = js.Array[AacProfile](HEV1, HEV2, LC)
}

/** Aac Rate Control Mode
  */
type AacRateControlMode = "CBR" | "VBR"
object AacRateControlMode {
  val CBR: "CBR" = "CBR"
  val VBR: "VBR" = "VBR"

  @inline def values = js.Array[AacRateControlMode](CBR, VBR)
}

/** Aac Raw Format
  */
type AacRawFormat = "LATM_LOAS" | "NONE"
object AacRawFormat {
  val LATM_LOAS: "LATM_LOAS" = "LATM_LOAS"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[AacRawFormat](LATM_LOAS, NONE)
}

/** Aac Spec
  */
type AacSpec = "MPEG2" | "MPEG4"
object AacSpec {
  val MPEG2: "MPEG2" = "MPEG2"
  val MPEG4: "MPEG4" = "MPEG4"

  @inline def values = js.Array[AacSpec](MPEG2, MPEG4)
}

/** Aac Vbr Quality
  */
type AacVbrQuality = "HIGH" | "LOW" | "MEDIUM_HIGH" | "MEDIUM_LOW"
object AacVbrQuality {
  val HIGH: "HIGH" = "HIGH"
  val LOW: "LOW" = "LOW"
  val MEDIUM_HIGH: "MEDIUM_HIGH" = "MEDIUM_HIGH"
  val MEDIUM_LOW: "MEDIUM_LOW" = "MEDIUM_LOW"

  @inline def values = js.Array[AacVbrQuality](HIGH, LOW, MEDIUM_HIGH, MEDIUM_LOW)
}

/** Ac3 Bitstream Mode
  */
type Ac3BitstreamMode = "COMMENTARY" | "COMPLETE_MAIN" | "DIALOGUE" | "EMERGENCY" | "HEARING_IMPAIRED" | "MUSIC_AND_EFFECTS" | "VISUALLY_IMPAIRED" | "VOICE_OVER"
object Ac3BitstreamMode {
  val COMMENTARY: "COMMENTARY" = "COMMENTARY"
  val COMPLETE_MAIN: "COMPLETE_MAIN" = "COMPLETE_MAIN"
  val DIALOGUE: "DIALOGUE" = "DIALOGUE"
  val EMERGENCY: "EMERGENCY" = "EMERGENCY"
  val HEARING_IMPAIRED: "HEARING_IMPAIRED" = "HEARING_IMPAIRED"
  val MUSIC_AND_EFFECTS: "MUSIC_AND_EFFECTS" = "MUSIC_AND_EFFECTS"
  val VISUALLY_IMPAIRED: "VISUALLY_IMPAIRED" = "VISUALLY_IMPAIRED"
  val VOICE_OVER: "VOICE_OVER" = "VOICE_OVER"

  @inline def values = js.Array[Ac3BitstreamMode](COMMENTARY, COMPLETE_MAIN, DIALOGUE, EMERGENCY, HEARING_IMPAIRED, MUSIC_AND_EFFECTS, VISUALLY_IMPAIRED, VOICE_OVER)
}

/** Ac3 Coding Mode
  */
type Ac3CodingMode = "CODING_MODE_1_0" | "CODING_MODE_1_1" | "CODING_MODE_2_0" | "CODING_MODE_3_2_LFE"
object Ac3CodingMode {
  val CODING_MODE_1_0: "CODING_MODE_1_0" = "CODING_MODE_1_0"
  val CODING_MODE_1_1: "CODING_MODE_1_1" = "CODING_MODE_1_1"
  val CODING_MODE_2_0: "CODING_MODE_2_0" = "CODING_MODE_2_0"
  val CODING_MODE_3_2_LFE: "CODING_MODE_3_2_LFE" = "CODING_MODE_3_2_LFE"

  @inline def values = js.Array[Ac3CodingMode](CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0, CODING_MODE_3_2_LFE)
}

/** Ac3 Drc Profile
  */
type Ac3DrcProfile = "FILM_STANDARD" | "NONE"
object Ac3DrcProfile {
  val FILM_STANDARD: "FILM_STANDARD" = "FILM_STANDARD"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[Ac3DrcProfile](FILM_STANDARD, NONE)
}

/** Ac3 Lfe Filter
  */
type Ac3LfeFilter = "DISABLED" | "ENABLED"
object Ac3LfeFilter {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[Ac3LfeFilter](DISABLED, ENABLED)
}

/** Ac3 Metadata Control
  */
type Ac3MetadataControl = "FOLLOW_INPUT" | "USE_CONFIGURED"
object Ac3MetadataControl {
  val FOLLOW_INPUT: "FOLLOW_INPUT" = "FOLLOW_INPUT"
  val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"

  @inline def values = js.Array[Ac3MetadataControl](FOLLOW_INPUT, USE_CONFIGURED)
}

/** The HTTP Accept header. Indicates the requested type fothe thumbnail.
  */
type AcceptHeader = "image/jpeg"
object AcceptHeader {
  val `image/jpeg`: "image/jpeg" = "image/jpeg"

  @inline def values = js.Array[AcceptHeader](`image/jpeg`)
}

/** Afd Signaling
  */
type AfdSignaling = "AUTO" | "FIXED" | "NONE"
object AfdSignaling {
  val AUTO: "AUTO" = "AUTO"
  val FIXED: "FIXED" = "FIXED"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[AfdSignaling](AUTO, FIXED, NONE)
}

/** Audio Description Audio Type Control
  */
type AudioDescriptionAudioTypeControl = "FOLLOW_INPUT" | "USE_CONFIGURED"
object AudioDescriptionAudioTypeControl {
  val FOLLOW_INPUT: "FOLLOW_INPUT" = "FOLLOW_INPUT"
  val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"

  @inline def values = js.Array[AudioDescriptionAudioTypeControl](FOLLOW_INPUT, USE_CONFIGURED)
}

/** Audio Description Language Code Control
  */
type AudioDescriptionLanguageCodeControl = "FOLLOW_INPUT" | "USE_CONFIGURED"
object AudioDescriptionLanguageCodeControl {
  val FOLLOW_INPUT: "FOLLOW_INPUT" = "FOLLOW_INPUT"
  val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"

  @inline def values = js.Array[AudioDescriptionLanguageCodeControl](FOLLOW_INPUT, USE_CONFIGURED)
}

/** Audio Language Selection Policy
  */
type AudioLanguageSelectionPolicy = "LOOSE" | "STRICT"
object AudioLanguageSelectionPolicy {
  val LOOSE: "LOOSE" = "LOOSE"
  val STRICT: "STRICT" = "STRICT"

  @inline def values = js.Array[AudioLanguageSelectionPolicy](LOOSE, STRICT)
}

/** Audio Normalization Algorithm
  */
type AudioNormalizationAlgorithm = "ITU_1770_1" | "ITU_1770_2"
object AudioNormalizationAlgorithm {
  val ITU_1770_1: "ITU_1770_1" = "ITU_1770_1"
  val ITU_1770_2: "ITU_1770_2" = "ITU_1770_2"

  @inline def values = js.Array[AudioNormalizationAlgorithm](ITU_1770_1, ITU_1770_2)
}

/** Audio Normalization Algorithm Control
  */
type AudioNormalizationAlgorithmControl = "CORRECT_AUDIO"
object AudioNormalizationAlgorithmControl {
  val CORRECT_AUDIO: "CORRECT_AUDIO" = "CORRECT_AUDIO"

  @inline def values = js.Array[AudioNormalizationAlgorithmControl](CORRECT_AUDIO)
}

/** Audio Only Hls Segment Type
  */
type AudioOnlyHlsSegmentType = "AAC" | "FMP4"
object AudioOnlyHlsSegmentType {
  val AAC: "AAC" = "AAC"
  val FMP4: "FMP4" = "FMP4"

  @inline def values = js.Array[AudioOnlyHlsSegmentType](AAC, FMP4)
}

/** Audio Only Hls Track Type
  */
type AudioOnlyHlsTrackType = "ALTERNATE_AUDIO_AUTO_SELECT" | "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT" | "ALTERNATE_AUDIO_NOT_AUTO_SELECT" | "AUDIO_ONLY_VARIANT_STREAM"
object AudioOnlyHlsTrackType {
  val ALTERNATE_AUDIO_AUTO_SELECT: "ALTERNATE_AUDIO_AUTO_SELECT" = "ALTERNATE_AUDIO_AUTO_SELECT"
  val ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT: "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT" = "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT"
  val ALTERNATE_AUDIO_NOT_AUTO_SELECT: "ALTERNATE_AUDIO_NOT_AUTO_SELECT" = "ALTERNATE_AUDIO_NOT_AUTO_SELECT"
  val AUDIO_ONLY_VARIANT_STREAM: "AUDIO_ONLY_VARIANT_STREAM" = "AUDIO_ONLY_VARIANT_STREAM"

  @inline def values = js.Array[AudioOnlyHlsTrackType](ALTERNATE_AUDIO_AUTO_SELECT, ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT, ALTERNATE_AUDIO_NOT_AUTO_SELECT, AUDIO_ONLY_VARIANT_STREAM)
}

/** Audio Type
  */
type AudioType = "CLEAN_EFFECTS" | "HEARING_IMPAIRED" | "UNDEFINED" | "VISUAL_IMPAIRED_COMMENTARY"
object AudioType {
  val CLEAN_EFFECTS: "CLEAN_EFFECTS" = "CLEAN_EFFECTS"
  val HEARING_IMPAIRED: "HEARING_IMPAIRED" = "HEARING_IMPAIRED"
  val UNDEFINED: "UNDEFINED" = "UNDEFINED"
  val VISUAL_IMPAIRED_COMMENTARY: "VISUAL_IMPAIRED_COMMENTARY" = "VISUAL_IMPAIRED_COMMENTARY"

  @inline def values = js.Array[AudioType](CLEAN_EFFECTS, HEARING_IMPAIRED, UNDEFINED, VISUAL_IMPAIRED_COMMENTARY)
}

/** Authentication Scheme
  */
type AuthenticationScheme = "AKAMAI" | "COMMON"
object AuthenticationScheme {
  val AKAMAI: "AKAMAI" = "AKAMAI"
  val COMMON: "COMMON" = "COMMON"

  @inline def values = js.Array[AuthenticationScheme](AKAMAI, COMMON)
}

/** Avail Blanking State
  */
type AvailBlankingState = "DISABLED" | "ENABLED"
object AvailBlankingState {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[AvailBlankingState](DISABLED, ENABLED)
}

/** Blackout Slate Network End Blackout
  */
type BlackoutSlateNetworkEndBlackout = "DISABLED" | "ENABLED"
object BlackoutSlateNetworkEndBlackout {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[BlackoutSlateNetworkEndBlackout](DISABLED, ENABLED)
}

/** Blackout Slate State
  */
type BlackoutSlateState = "DISABLED" | "ENABLED"
object BlackoutSlateState {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[BlackoutSlateState](DISABLED, ENABLED)
}

/** Burn In Alignment
  */
type BurnInAlignment = "CENTERED" | "LEFT" | "SMART"
object BurnInAlignment {
  val CENTERED: "CENTERED" = "CENTERED"
  val LEFT: "LEFT" = "LEFT"
  val SMART: "SMART" = "SMART"

  @inline def values = js.Array[BurnInAlignment](CENTERED, LEFT, SMART)
}

/** Burn In Background Color
  */
type BurnInBackgroundColor = "BLACK" | "NONE" | "WHITE"
object BurnInBackgroundColor {
  val BLACK: "BLACK" = "BLACK"
  val NONE: "NONE" = "NONE"
  val WHITE: "WHITE" = "WHITE"

  @inline def values = js.Array[BurnInBackgroundColor](BLACK, NONE, WHITE)
}

/** Burn In Font Color
  */
type BurnInFontColor = "BLACK" | "BLUE" | "GREEN" | "RED" | "WHITE" | "YELLOW"
object BurnInFontColor {
  val BLACK: "BLACK" = "BLACK"
  val BLUE: "BLUE" = "BLUE"
  val GREEN: "GREEN" = "GREEN"
  val RED: "RED" = "RED"
  val WHITE: "WHITE" = "WHITE"
  val YELLOW: "YELLOW" = "YELLOW"

  @inline def values = js.Array[BurnInFontColor](BLACK, BLUE, GREEN, RED, WHITE, YELLOW)
}

/** Burn In Outline Color
  */
type BurnInOutlineColor = "BLACK" | "BLUE" | "GREEN" | "RED" | "WHITE" | "YELLOW"
object BurnInOutlineColor {
  val BLACK: "BLACK" = "BLACK"
  val BLUE: "BLUE" = "BLUE"
  val GREEN: "GREEN" = "GREEN"
  val RED: "RED" = "RED"
  val WHITE: "WHITE" = "WHITE"
  val YELLOW: "YELLOW" = "YELLOW"

  @inline def values = js.Array[BurnInOutlineColor](BLACK, BLUE, GREEN, RED, WHITE, YELLOW)
}

/** Burn In Shadow Color
  */
type BurnInShadowColor = "BLACK" | "NONE" | "WHITE"
object BurnInShadowColor {
  val BLACK: "BLACK" = "BLACK"
  val NONE: "NONE" = "NONE"
  val WHITE: "WHITE" = "WHITE"

  @inline def values = js.Array[BurnInShadowColor](BLACK, NONE, WHITE)
}

/** Burn In Teletext Grid Control
  */
type BurnInTeletextGridControl = "FIXED" | "SCALED"
object BurnInTeletextGridControl {
  val FIXED: "FIXED" = "FIXED"
  val SCALED: "SCALED" = "SCALED"

  @inline def values = js.Array[BurnInTeletextGridControl](FIXED, SCALED)
}

/** Maximum CDI input resolution; SD is 480i and 576i up to 30 frames-per-second (fps), HD is 720p up to 60 fps / 1080i up to 30 fps, FHD is 1080p up to 60 fps, UHD is 2160p up to 60 fps
  */
type CdiInputResolution = "SD" | "HD" | "FHD" | "UHD"
object CdiInputResolution {
  val SD: "SD" = "SD"
  val HD: "HD" = "HD"
  val FHD: "FHD" = "FHD"
  val UHD: "UHD" = "UHD"

  @inline def values = js.Array[CdiInputResolution](SD, HD, FHD, UHD)
}

/** A standard channel has two encoding pipelines and a single pipeline channel only has one.
  */
type ChannelClass = "STANDARD" | "SINGLE_PIPELINE"
object ChannelClass {
  val STANDARD: "STANDARD" = "STANDARD"
  val SINGLE_PIPELINE: "SINGLE_PIPELINE" = "SINGLE_PIPELINE"

  @inline def values = js.Array[ChannelClass](STANDARD, SINGLE_PIPELINE)
}

/** Placeholder documentation for ChannelState
  */
type ChannelState = "CREATING" | "CREATE_FAILED" | "IDLE" | "STARTING" | "RUNNING" | "RECOVERING" | "STOPPING" | "DELETING" | "DELETED" | "UPDATING" | "UPDATE_FAILED"
object ChannelState {
  val CREATING: "CREATING" = "CREATING"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val IDLE: "IDLE" = "IDLE"
  val STARTING: "STARTING" = "STARTING"
  val RUNNING: "RUNNING" = "RUNNING"
  val RECOVERING: "RECOVERING" = "RECOVERING"
  val STOPPING: "STOPPING" = "STOPPING"
  val DELETING: "DELETING" = "DELETING"
  val DELETED: "DELETED" = "DELETED"
  val UPDATING: "UPDATING" = "UPDATING"
  val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  @inline def values = js.Array[ChannelState](CREATING, CREATE_FAILED, IDLE, STARTING, RUNNING, RECOVERING, STOPPING, DELETING, DELETED, UPDATING, UPDATE_FAILED)
}

/** Specifies the media type of the thumbnail.
  */
type ContentType = "image/jpeg"
object ContentType {
  val `image/jpeg`: "image/jpeg" = "image/jpeg"

  @inline def values = js.Array[ContentType](`image/jpeg`)
}

/** The status of the action to synchronize the device configuration. If you change the configuration of the input device (for example, the maximum bitrate), MediaLive sends the new data to the device. The device might not update itself immediately. SYNCED means the device has updated its configuration. SYNCING means that it has not updated its configuration.
  */
type DeviceSettingsSyncState = "SYNCED" | "SYNCING"
object DeviceSettingsSyncState {
  val SYNCED: "SYNCED" = "SYNCED"
  val SYNCING: "SYNCING" = "SYNCING"

  @inline def values = js.Array[DeviceSettingsSyncState](SYNCED, SYNCING)
}

/** The status of software on the input device.
  */
type DeviceUpdateStatus = "UP_TO_DATE" | "NOT_UP_TO_DATE"
object DeviceUpdateStatus {
  val UP_TO_DATE: "UP_TO_DATE" = "UP_TO_DATE"
  val NOT_UP_TO_DATE: "NOT_UP_TO_DATE" = "NOT_UP_TO_DATE"

  @inline def values = js.Array[DeviceUpdateStatus](UP_TO_DATE, NOT_UP_TO_DATE)
}

/** Dvb Sdt Output Sdt
  */
type DvbSdtOutputSdt = "SDT_FOLLOW" | "SDT_FOLLOW_IF_PRESENT" | "SDT_MANUAL" | "SDT_NONE"
object DvbSdtOutputSdt {
  val SDT_FOLLOW: "SDT_FOLLOW" = "SDT_FOLLOW"
  val SDT_FOLLOW_IF_PRESENT: "SDT_FOLLOW_IF_PRESENT" = "SDT_FOLLOW_IF_PRESENT"
  val SDT_MANUAL: "SDT_MANUAL" = "SDT_MANUAL"
  val SDT_NONE: "SDT_NONE" = "SDT_NONE"

  @inline def values = js.Array[DvbSdtOutputSdt](SDT_FOLLOW, SDT_FOLLOW_IF_PRESENT, SDT_MANUAL, SDT_NONE)
}

/** Dvb Sub Destination Alignment
  */
type DvbSubDestinationAlignment = "CENTERED" | "LEFT" | "SMART"
object DvbSubDestinationAlignment {
  val CENTERED: "CENTERED" = "CENTERED"
  val LEFT: "LEFT" = "LEFT"
  val SMART: "SMART" = "SMART"

  @inline def values = js.Array[DvbSubDestinationAlignment](CENTERED, LEFT, SMART)
}

/** Dvb Sub Destination Background Color
  */
type DvbSubDestinationBackgroundColor = "BLACK" | "NONE" | "WHITE"
object DvbSubDestinationBackgroundColor {
  val BLACK: "BLACK" = "BLACK"
  val NONE: "NONE" = "NONE"
  val WHITE: "WHITE" = "WHITE"

  @inline def values = js.Array[DvbSubDestinationBackgroundColor](BLACK, NONE, WHITE)
}

/** Dvb Sub Destination Font Color
  */
type DvbSubDestinationFontColor = "BLACK" | "BLUE" | "GREEN" | "RED" | "WHITE" | "YELLOW"
object DvbSubDestinationFontColor {
  val BLACK: "BLACK" = "BLACK"
  val BLUE: "BLUE" = "BLUE"
  val GREEN: "GREEN" = "GREEN"
  val RED: "RED" = "RED"
  val WHITE: "WHITE" = "WHITE"
  val YELLOW: "YELLOW" = "YELLOW"

  @inline def values = js.Array[DvbSubDestinationFontColor](BLACK, BLUE, GREEN, RED, WHITE, YELLOW)
}

/** Dvb Sub Destination Outline Color
  */
type DvbSubDestinationOutlineColor = "BLACK" | "BLUE" | "GREEN" | "RED" | "WHITE" | "YELLOW"
object DvbSubDestinationOutlineColor {
  val BLACK: "BLACK" = "BLACK"
  val BLUE: "BLUE" = "BLUE"
  val GREEN: "GREEN" = "GREEN"
  val RED: "RED" = "RED"
  val WHITE: "WHITE" = "WHITE"
  val YELLOW: "YELLOW" = "YELLOW"

  @inline def values = js.Array[DvbSubDestinationOutlineColor](BLACK, BLUE, GREEN, RED, WHITE, YELLOW)
}

/** Dvb Sub Destination Shadow Color
  */
type DvbSubDestinationShadowColor = "BLACK" | "NONE" | "WHITE"
object DvbSubDestinationShadowColor {
  val BLACK: "BLACK" = "BLACK"
  val NONE: "NONE" = "NONE"
  val WHITE: "WHITE" = "WHITE"

  @inline def values = js.Array[DvbSubDestinationShadowColor](BLACK, NONE, WHITE)
}

/** Dvb Sub Destination Teletext Grid Control
  */
type DvbSubDestinationTeletextGridControl = "FIXED" | "SCALED"
object DvbSubDestinationTeletextGridControl {
  val FIXED: "FIXED" = "FIXED"
  val SCALED: "SCALED" = "SCALED"

  @inline def values = js.Array[DvbSubDestinationTeletextGridControl](FIXED, SCALED)
}

/** Eac3 Attenuation Control
  */
type Eac3AttenuationControl = "ATTENUATE_3_DB" | "NONE"
object Eac3AttenuationControl {
  val ATTENUATE_3_DB: "ATTENUATE_3_DB" = "ATTENUATE_3_DB"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[Eac3AttenuationControl](ATTENUATE_3_DB, NONE)
}

/** Eac3 Bitstream Mode
  */
type Eac3BitstreamMode = "COMMENTARY" | "COMPLETE_MAIN" | "EMERGENCY" | "HEARING_IMPAIRED" | "VISUALLY_IMPAIRED"
object Eac3BitstreamMode {
  val COMMENTARY: "COMMENTARY" = "COMMENTARY"
  val COMPLETE_MAIN: "COMPLETE_MAIN" = "COMPLETE_MAIN"
  val EMERGENCY: "EMERGENCY" = "EMERGENCY"
  val HEARING_IMPAIRED: "HEARING_IMPAIRED" = "HEARING_IMPAIRED"
  val VISUALLY_IMPAIRED: "VISUALLY_IMPAIRED" = "VISUALLY_IMPAIRED"

  @inline def values = js.Array[Eac3BitstreamMode](COMMENTARY, COMPLETE_MAIN, EMERGENCY, HEARING_IMPAIRED, VISUALLY_IMPAIRED)
}

/** Eac3 Coding Mode
  */
type Eac3CodingMode = "CODING_MODE_1_0" | "CODING_MODE_2_0" | "CODING_MODE_3_2"
object Eac3CodingMode {
  val CODING_MODE_1_0: "CODING_MODE_1_0" = "CODING_MODE_1_0"
  val CODING_MODE_2_0: "CODING_MODE_2_0" = "CODING_MODE_2_0"
  val CODING_MODE_3_2: "CODING_MODE_3_2" = "CODING_MODE_3_2"

  @inline def values = js.Array[Eac3CodingMode](CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_3_2)
}

/** Eac3 Dc Filter
  */
type Eac3DcFilter = "DISABLED" | "ENABLED"
object Eac3DcFilter {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[Eac3DcFilter](DISABLED, ENABLED)
}

/** Eac3 Drc Line
  */
type Eac3DrcLine = "FILM_LIGHT" | "FILM_STANDARD" | "MUSIC_LIGHT" | "MUSIC_STANDARD" | "NONE" | "SPEECH"
object Eac3DrcLine {
  val FILM_LIGHT: "FILM_LIGHT" = "FILM_LIGHT"
  val FILM_STANDARD: "FILM_STANDARD" = "FILM_STANDARD"
  val MUSIC_LIGHT: "MUSIC_LIGHT" = "MUSIC_LIGHT"
  val MUSIC_STANDARD: "MUSIC_STANDARD" = "MUSIC_STANDARD"
  val NONE: "NONE" = "NONE"
  val SPEECH: "SPEECH" = "SPEECH"

  @inline def values = js.Array[Eac3DrcLine](FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT, MUSIC_STANDARD, NONE, SPEECH)
}

/** Eac3 Drc Rf
  */
type Eac3DrcRf = "FILM_LIGHT" | "FILM_STANDARD" | "MUSIC_LIGHT" | "MUSIC_STANDARD" | "NONE" | "SPEECH"
object Eac3DrcRf {
  val FILM_LIGHT: "FILM_LIGHT" = "FILM_LIGHT"
  val FILM_STANDARD: "FILM_STANDARD" = "FILM_STANDARD"
  val MUSIC_LIGHT: "MUSIC_LIGHT" = "MUSIC_LIGHT"
  val MUSIC_STANDARD: "MUSIC_STANDARD" = "MUSIC_STANDARD"
  val NONE: "NONE" = "NONE"
  val SPEECH: "SPEECH" = "SPEECH"

  @inline def values = js.Array[Eac3DrcRf](FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT, MUSIC_STANDARD, NONE, SPEECH)
}

/** Eac3 Lfe Control
  */
type Eac3LfeControl = "LFE" | "NO_LFE"
object Eac3LfeControl {
  val LFE: "LFE" = "LFE"
  val NO_LFE: "NO_LFE" = "NO_LFE"

  @inline def values = js.Array[Eac3LfeControl](LFE, NO_LFE)
}

/** Eac3 Lfe Filter
  */
type Eac3LfeFilter = "DISABLED" | "ENABLED"
object Eac3LfeFilter {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[Eac3LfeFilter](DISABLED, ENABLED)
}

/** Eac3 Metadata Control
  */
type Eac3MetadataControl = "FOLLOW_INPUT" | "USE_CONFIGURED"
object Eac3MetadataControl {
  val FOLLOW_INPUT: "FOLLOW_INPUT" = "FOLLOW_INPUT"
  val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"

  @inline def values = js.Array[Eac3MetadataControl](FOLLOW_INPUT, USE_CONFIGURED)
}

/** Eac3 Passthrough Control
  */
type Eac3PassthroughControl = "NO_PASSTHROUGH" | "WHEN_POSSIBLE"
object Eac3PassthroughControl {
  val NO_PASSTHROUGH: "NO_PASSTHROUGH" = "NO_PASSTHROUGH"
  val WHEN_POSSIBLE: "WHEN_POSSIBLE" = "WHEN_POSSIBLE"

  @inline def values = js.Array[Eac3PassthroughControl](NO_PASSTHROUGH, WHEN_POSSIBLE)
}

/** Eac3 Phase Control
  */
type Eac3PhaseControl = "NO_SHIFT" | "SHIFT_90_DEGREES"
object Eac3PhaseControl {
  val NO_SHIFT: "NO_SHIFT" = "NO_SHIFT"
  val SHIFT_90_DEGREES: "SHIFT_90_DEGREES" = "SHIFT_90_DEGREES"

  @inline def values = js.Array[Eac3PhaseControl](NO_SHIFT, SHIFT_90_DEGREES)
}

/** Eac3 Stereo Downmix
  */
type Eac3StereoDownmix = "DPL2" | "LO_RO" | "LT_RT" | "NOT_INDICATED"
object Eac3StereoDownmix {
  val DPL2: "DPL2" = "DPL2"
  val LO_RO: "LO_RO" = "LO_RO"
  val LT_RT: "LT_RT" = "LT_RT"
  val NOT_INDICATED: "NOT_INDICATED" = "NOT_INDICATED"

  @inline def values = js.Array[Eac3StereoDownmix](DPL2, LO_RO, LT_RT, NOT_INDICATED)
}

/** Eac3 Surround Ex Mode
  */
type Eac3SurroundExMode = "DISABLED" | "ENABLED" | "NOT_INDICATED"
object Eac3SurroundExMode {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"
  val NOT_INDICATED: "NOT_INDICATED" = "NOT_INDICATED"

  @inline def values = js.Array[Eac3SurroundExMode](DISABLED, ENABLED, NOT_INDICATED)
}

/** Eac3 Surround Mode
  */
type Eac3SurroundMode = "DISABLED" | "ENABLED" | "NOT_INDICATED"
object Eac3SurroundMode {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"
  val NOT_INDICATED: "NOT_INDICATED" = "NOT_INDICATED"

  @inline def values = js.Array[Eac3SurroundMode](DISABLED, ENABLED, NOT_INDICATED)
}

/** Ebu Tt DDestination Style Control
  */
type EbuTtDDestinationStyleControl = "EXCLUDE" | "INCLUDE"
object EbuTtDDestinationStyleControl {
  val EXCLUDE: "EXCLUDE" = "EXCLUDE"
  val INCLUDE: "INCLUDE" = "INCLUDE"

  @inline def values = js.Array[EbuTtDDestinationStyleControl](EXCLUDE, INCLUDE)
}

/** Ebu Tt DFill Line Gap Control
  */
type EbuTtDFillLineGapControl = "DISABLED" | "ENABLED"
object EbuTtDFillLineGapControl {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[EbuTtDFillLineGapControl](DISABLED, ENABLED)
}

/** Embedded Convert608 To708
  */
type EmbeddedConvert608To708 = "DISABLED" | "UPCONVERT"
object EmbeddedConvert608To708 {
  val DISABLED: "DISABLED" = "DISABLED"
  val UPCONVERT: "UPCONVERT" = "UPCONVERT"

  @inline def values = js.Array[EmbeddedConvert608To708](DISABLED, UPCONVERT)
}

/** Embedded Scte20 Detection
  */
type EmbeddedScte20Detection = "AUTO" | "OFF"
object EmbeddedScte20Detection {
  val AUTO: "AUTO" = "AUTO"
  val OFF: "OFF" = "OFF"

  @inline def values = js.Array[EmbeddedScte20Detection](AUTO, OFF)
}

/** Feature Activations Input Prepare Schedule Actions
  */
type FeatureActivationsInputPrepareScheduleActions = "DISABLED" | "ENABLED"
object FeatureActivationsInputPrepareScheduleActions {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[FeatureActivationsInputPrepareScheduleActions](DISABLED, ENABLED)
}

/** Fec Output Include Fec
  */
type FecOutputIncludeFec = "COLUMN" | "COLUMN_AND_ROW"
object FecOutputIncludeFec {
  val COLUMN: "COLUMN" = "COLUMN"
  val COLUMN_AND_ROW: "COLUMN_AND_ROW" = "COLUMN_AND_ROW"

  @inline def values = js.Array[FecOutputIncludeFec](COLUMN, COLUMN_AND_ROW)
}

/** Fixed Afd
  */
type FixedAfd = "AFD_0000" | "AFD_0010" | "AFD_0011" | "AFD_0100" | "AFD_1000" | "AFD_1001" | "AFD_1010" | "AFD_1011" | "AFD_1101" | "AFD_1110" | "AFD_1111"
object FixedAfd {
  val AFD_0000: "AFD_0000" = "AFD_0000"
  val AFD_0010: "AFD_0010" = "AFD_0010"
  val AFD_0011: "AFD_0011" = "AFD_0011"
  val AFD_0100: "AFD_0100" = "AFD_0100"
  val AFD_1000: "AFD_1000" = "AFD_1000"
  val AFD_1001: "AFD_1001" = "AFD_1001"
  val AFD_1010: "AFD_1010" = "AFD_1010"
  val AFD_1011: "AFD_1011" = "AFD_1011"
  val AFD_1101: "AFD_1101" = "AFD_1101"
  val AFD_1110: "AFD_1110" = "AFD_1110"
  val AFD_1111: "AFD_1111" = "AFD_1111"

  @inline def values = js.Array[FixedAfd](AFD_0000, AFD_0010, AFD_0011, AFD_0100, AFD_1000, AFD_1001, AFD_1010, AFD_1011, AFD_1101, AFD_1110, AFD_1111)
}

/** Fmp4 Nielsen Id3 Behavior
  */
type Fmp4NielsenId3Behavior = "NO_PASSTHROUGH" | "PASSTHROUGH"
object Fmp4NielsenId3Behavior {
  val NO_PASSTHROUGH: "NO_PASSTHROUGH" = "NO_PASSTHROUGH"
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  @inline def values = js.Array[Fmp4NielsenId3Behavior](NO_PASSTHROUGH, PASSTHROUGH)
}

/** Fmp4 Timed Metadata Behavior
  */
type Fmp4TimedMetadataBehavior = "NO_PASSTHROUGH" | "PASSTHROUGH"
object Fmp4TimedMetadataBehavior {
  val NO_PASSTHROUGH: "NO_PASSTHROUGH" = "NO_PASSTHROUGH"
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  @inline def values = js.Array[Fmp4TimedMetadataBehavior](NO_PASSTHROUGH, PASSTHROUGH)
}

/** Follow reference point.
  */
type FollowPoint = "END" | "START"
object FollowPoint {
  val END: "END" = "END"
  val START: "START" = "START"

  @inline def values = js.Array[FollowPoint](END, START)
}

/** Frame Capture Interval Unit
  */
type FrameCaptureIntervalUnit = "MILLISECONDS" | "SECONDS"
object FrameCaptureIntervalUnit {
  val MILLISECONDS: "MILLISECONDS" = "MILLISECONDS"
  val SECONDS: "SECONDS" = "SECONDS"

  @inline def values = js.Array[FrameCaptureIntervalUnit](MILLISECONDS, SECONDS)
}

/** Global Configuration Input End Action
  */
type GlobalConfigurationInputEndAction = "NONE" | "SWITCH_AND_LOOP_INPUTS"
object GlobalConfigurationInputEndAction {
  val NONE: "NONE" = "NONE"
  val SWITCH_AND_LOOP_INPUTS: "SWITCH_AND_LOOP_INPUTS" = "SWITCH_AND_LOOP_INPUTS"

  @inline def values = js.Array[GlobalConfigurationInputEndAction](NONE, SWITCH_AND_LOOP_INPUTS)
}

/** Global Configuration Low Framerate Inputs
  */
type GlobalConfigurationLowFramerateInputs = "DISABLED" | "ENABLED"
object GlobalConfigurationLowFramerateInputs {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[GlobalConfigurationLowFramerateInputs](DISABLED, ENABLED)
}

/** Global Configuration Output Locking Mode
  */
type GlobalConfigurationOutputLockingMode = "EPOCH_LOCKING" | "PIPELINE_LOCKING"
object GlobalConfigurationOutputLockingMode {
  val EPOCH_LOCKING: "EPOCH_LOCKING" = "EPOCH_LOCKING"
  val PIPELINE_LOCKING: "PIPELINE_LOCKING" = "PIPELINE_LOCKING"

  @inline def values = js.Array[GlobalConfigurationOutputLockingMode](EPOCH_LOCKING, PIPELINE_LOCKING)
}

/** Global Configuration Output Timing Source
  */
type GlobalConfigurationOutputTimingSource = "INPUT_CLOCK" | "SYSTEM_CLOCK"
object GlobalConfigurationOutputTimingSource {
  val INPUT_CLOCK: "INPUT_CLOCK" = "INPUT_CLOCK"
  val SYSTEM_CLOCK: "SYSTEM_CLOCK" = "SYSTEM_CLOCK"

  @inline def values = js.Array[GlobalConfigurationOutputTimingSource](INPUT_CLOCK, SYSTEM_CLOCK)
}

/** H264 Adaptive Quantization
  */
type H264AdaptiveQuantization = "HIGH" | "HIGHER" | "LOW" | "MAX" | "MEDIUM" | "OFF"
object H264AdaptiveQuantization {
  val HIGH: "HIGH" = "HIGH"
  val HIGHER: "HIGHER" = "HIGHER"
  val LOW: "LOW" = "LOW"
  val MAX: "MAX" = "MAX"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val OFF: "OFF" = "OFF"

  @inline def values = js.Array[H264AdaptiveQuantization](HIGH, HIGHER, LOW, MAX, MEDIUM, OFF)
}

/** H264 Color Metadata
  */
type H264ColorMetadata = "IGNORE" | "INSERT"
object H264ColorMetadata {
  val IGNORE: "IGNORE" = "IGNORE"
  val INSERT: "INSERT" = "INSERT"

  @inline def values = js.Array[H264ColorMetadata](IGNORE, INSERT)
}

/** H264 Entropy Encoding
  */
type H264EntropyEncoding = "CABAC" | "CAVLC"
object H264EntropyEncoding {
  val CABAC: "CABAC" = "CABAC"
  val CAVLC: "CAVLC" = "CAVLC"

  @inline def values = js.Array[H264EntropyEncoding](CABAC, CAVLC)
}

/** H264 Flicker Aq
  */
type H264FlickerAq = "DISABLED" | "ENABLED"
object H264FlickerAq {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H264FlickerAq](DISABLED, ENABLED)
}

/** H264 Force Field Pictures
  */
type H264ForceFieldPictures = "DISABLED" | "ENABLED"
object H264ForceFieldPictures {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H264ForceFieldPictures](DISABLED, ENABLED)
}

/** H264 Framerate Control
  */
type H264FramerateControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object H264FramerateControl {
  val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  @inline def values = js.Array[H264FramerateControl](INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** H264 Gop BReference
  */
type H264GopBReference = "DISABLED" | "ENABLED"
object H264GopBReference {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H264GopBReference](DISABLED, ENABLED)
}

/** H264 Gop Size Units
  */
type H264GopSizeUnits = "FRAMES" | "SECONDS"
object H264GopSizeUnits {
  val FRAMES: "FRAMES" = "FRAMES"
  val SECONDS: "SECONDS" = "SECONDS"

  @inline def values = js.Array[H264GopSizeUnits](FRAMES, SECONDS)
}

/** H264 Level
  */
type H264Level = "H264_LEVEL_1" | "H264_LEVEL_1_1" | "H264_LEVEL_1_2" | "H264_LEVEL_1_3" | "H264_LEVEL_2" | "H264_LEVEL_2_1" | "H264_LEVEL_2_2" | "H264_LEVEL_3" | "H264_LEVEL_3_1" | "H264_LEVEL_3_2" | "H264_LEVEL_4" | "H264_LEVEL_4_1" | "H264_LEVEL_4_2" | "H264_LEVEL_5" | "H264_LEVEL_5_1" | "H264_LEVEL_5_2" | "H264_LEVEL_AUTO"
object H264Level {
  val H264_LEVEL_1: "H264_LEVEL_1" = "H264_LEVEL_1"
  val H264_LEVEL_1_1: "H264_LEVEL_1_1" = "H264_LEVEL_1_1"
  val H264_LEVEL_1_2: "H264_LEVEL_1_2" = "H264_LEVEL_1_2"
  val H264_LEVEL_1_3: "H264_LEVEL_1_3" = "H264_LEVEL_1_3"
  val H264_LEVEL_2: "H264_LEVEL_2" = "H264_LEVEL_2"
  val H264_LEVEL_2_1: "H264_LEVEL_2_1" = "H264_LEVEL_2_1"
  val H264_LEVEL_2_2: "H264_LEVEL_2_2" = "H264_LEVEL_2_2"
  val H264_LEVEL_3: "H264_LEVEL_3" = "H264_LEVEL_3"
  val H264_LEVEL_3_1: "H264_LEVEL_3_1" = "H264_LEVEL_3_1"
  val H264_LEVEL_3_2: "H264_LEVEL_3_2" = "H264_LEVEL_3_2"
  val H264_LEVEL_4: "H264_LEVEL_4" = "H264_LEVEL_4"
  val H264_LEVEL_4_1: "H264_LEVEL_4_1" = "H264_LEVEL_4_1"
  val H264_LEVEL_4_2: "H264_LEVEL_4_2" = "H264_LEVEL_4_2"
  val H264_LEVEL_5: "H264_LEVEL_5" = "H264_LEVEL_5"
  val H264_LEVEL_5_1: "H264_LEVEL_5_1" = "H264_LEVEL_5_1"
  val H264_LEVEL_5_2: "H264_LEVEL_5_2" = "H264_LEVEL_5_2"
  val H264_LEVEL_AUTO: "H264_LEVEL_AUTO" = "H264_LEVEL_AUTO"

  @inline def values = js.Array[H264Level](
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
type H264LookAheadRateControl = "HIGH" | "LOW" | "MEDIUM"
object H264LookAheadRateControl {
  val HIGH: "HIGH" = "HIGH"
  val LOW: "LOW" = "LOW"
  val MEDIUM: "MEDIUM" = "MEDIUM"

  @inline def values = js.Array[H264LookAheadRateControl](HIGH, LOW, MEDIUM)
}

/** H264 Par Control
  */
type H264ParControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object H264ParControl {
  val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  @inline def values = js.Array[H264ParControl](INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** H264 Profile
  */
type H264Profile = "BASELINE" | "HIGH" | "HIGH_10BIT" | "HIGH_422" | "HIGH_422_10BIT" | "MAIN"
object H264Profile {
  val BASELINE: "BASELINE" = "BASELINE"
  val HIGH: "HIGH" = "HIGH"
  val HIGH_10BIT: "HIGH_10BIT" = "HIGH_10BIT"
  val HIGH_422: "HIGH_422" = "HIGH_422"
  val HIGH_422_10BIT: "HIGH_422_10BIT" = "HIGH_422_10BIT"
  val MAIN: "MAIN" = "MAIN"

  @inline def values = js.Array[H264Profile](BASELINE, HIGH, HIGH_10BIT, HIGH_422, HIGH_422_10BIT, MAIN)
}

/** H264 Quality Level
  */
type H264QualityLevel = "ENHANCED_QUALITY" | "STANDARD_QUALITY"
object H264QualityLevel {
  val ENHANCED_QUALITY: "ENHANCED_QUALITY" = "ENHANCED_QUALITY"
  val STANDARD_QUALITY: "STANDARD_QUALITY" = "STANDARD_QUALITY"

  @inline def values = js.Array[H264QualityLevel](ENHANCED_QUALITY, STANDARD_QUALITY)
}

/** H264 Rate Control Mode
  */
type H264RateControlMode = "CBR" | "MULTIPLEX" | "QVBR" | "VBR"
object H264RateControlMode {
  val CBR: "CBR" = "CBR"
  val MULTIPLEX: "MULTIPLEX" = "MULTIPLEX"
  val QVBR: "QVBR" = "QVBR"
  val VBR: "VBR" = "VBR"

  @inline def values = js.Array[H264RateControlMode](CBR, MULTIPLEX, QVBR, VBR)
}

/** H264 Scan Type
  */
type H264ScanType = "INTERLACED" | "PROGRESSIVE"
object H264ScanType {
  val INTERLACED: "INTERLACED" = "INTERLACED"
  val PROGRESSIVE: "PROGRESSIVE" = "PROGRESSIVE"

  @inline def values = js.Array[H264ScanType](INTERLACED, PROGRESSIVE)
}

/** H264 Scene Change Detect
  */
type H264SceneChangeDetect = "DISABLED" | "ENABLED"
object H264SceneChangeDetect {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H264SceneChangeDetect](DISABLED, ENABLED)
}

/** H264 Spatial Aq
  */
type H264SpatialAq = "DISABLED" | "ENABLED"
object H264SpatialAq {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H264SpatialAq](DISABLED, ENABLED)
}

/** H264 Sub Gop Length
  */
type H264SubGopLength = "DYNAMIC" | "FIXED"
object H264SubGopLength {
  val DYNAMIC: "DYNAMIC" = "DYNAMIC"
  val FIXED: "FIXED" = "FIXED"

  @inline def values = js.Array[H264SubGopLength](DYNAMIC, FIXED)
}

/** H264 Syntax
  */
type H264Syntax = "DEFAULT" | "RP2027"
object H264Syntax {
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val RP2027: "RP2027" = "RP2027"

  @inline def values = js.Array[H264Syntax](DEFAULT, RP2027)
}

/** H264 Temporal Aq
  */
type H264TemporalAq = "DISABLED" | "ENABLED"
object H264TemporalAq {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H264TemporalAq](DISABLED, ENABLED)
}

/** H264 Timecode Insertion Behavior
  */
type H264TimecodeInsertionBehavior = "DISABLED" | "PIC_TIMING_SEI"
object H264TimecodeInsertionBehavior {
  val DISABLED: "DISABLED" = "DISABLED"
  val PIC_TIMING_SEI: "PIC_TIMING_SEI" = "PIC_TIMING_SEI"

  @inline def values = js.Array[H264TimecodeInsertionBehavior](DISABLED, PIC_TIMING_SEI)
}

/** H265 Adaptive Quantization
  */
type H265AdaptiveQuantization = "HIGH" | "HIGHER" | "LOW" | "MAX" | "MEDIUM" | "OFF"
object H265AdaptiveQuantization {
  val HIGH: "HIGH" = "HIGH"
  val HIGHER: "HIGHER" = "HIGHER"
  val LOW: "LOW" = "LOW"
  val MAX: "MAX" = "MAX"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val OFF: "OFF" = "OFF"

  @inline def values = js.Array[H265AdaptiveQuantization](HIGH, HIGHER, LOW, MAX, MEDIUM, OFF)
}

/** H265 Alternative Transfer Function
  */
type H265AlternativeTransferFunction = "INSERT" | "OMIT"
object H265AlternativeTransferFunction {
  val INSERT: "INSERT" = "INSERT"
  val OMIT: "OMIT" = "OMIT"

  @inline def values = js.Array[H265AlternativeTransferFunction](INSERT, OMIT)
}

/** H265 Color Metadata
  */
type H265ColorMetadata = "IGNORE" | "INSERT"
object H265ColorMetadata {
  val IGNORE: "IGNORE" = "IGNORE"
  val INSERT: "INSERT" = "INSERT"

  @inline def values = js.Array[H265ColorMetadata](IGNORE, INSERT)
}

/** H265 Flicker Aq
  */
type H265FlickerAq = "DISABLED" | "ENABLED"
object H265FlickerAq {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H265FlickerAq](DISABLED, ENABLED)
}

/** H265 Gop Size Units
  */
type H265GopSizeUnits = "FRAMES" | "SECONDS"
object H265GopSizeUnits {
  val FRAMES: "FRAMES" = "FRAMES"
  val SECONDS: "SECONDS" = "SECONDS"

  @inline def values = js.Array[H265GopSizeUnits](FRAMES, SECONDS)
}

/** H265 Level
  */
type H265Level = "H265_LEVEL_1" | "H265_LEVEL_2" | "H265_LEVEL_2_1" | "H265_LEVEL_3" | "H265_LEVEL_3_1" | "H265_LEVEL_4" | "H265_LEVEL_4_1" | "H265_LEVEL_5" | "H265_LEVEL_5_1" | "H265_LEVEL_5_2" | "H265_LEVEL_6" | "H265_LEVEL_6_1" | "H265_LEVEL_6_2" | "H265_LEVEL_AUTO"
object H265Level {
  val H265_LEVEL_1: "H265_LEVEL_1" = "H265_LEVEL_1"
  val H265_LEVEL_2: "H265_LEVEL_2" = "H265_LEVEL_2"
  val H265_LEVEL_2_1: "H265_LEVEL_2_1" = "H265_LEVEL_2_1"
  val H265_LEVEL_3: "H265_LEVEL_3" = "H265_LEVEL_3"
  val H265_LEVEL_3_1: "H265_LEVEL_3_1" = "H265_LEVEL_3_1"
  val H265_LEVEL_4: "H265_LEVEL_4" = "H265_LEVEL_4"
  val H265_LEVEL_4_1: "H265_LEVEL_4_1" = "H265_LEVEL_4_1"
  val H265_LEVEL_5: "H265_LEVEL_5" = "H265_LEVEL_5"
  val H265_LEVEL_5_1: "H265_LEVEL_5_1" = "H265_LEVEL_5_1"
  val H265_LEVEL_5_2: "H265_LEVEL_5_2" = "H265_LEVEL_5_2"
  val H265_LEVEL_6: "H265_LEVEL_6" = "H265_LEVEL_6"
  val H265_LEVEL_6_1: "H265_LEVEL_6_1" = "H265_LEVEL_6_1"
  val H265_LEVEL_6_2: "H265_LEVEL_6_2" = "H265_LEVEL_6_2"
  val H265_LEVEL_AUTO: "H265_LEVEL_AUTO" = "H265_LEVEL_AUTO"

  @inline def values = js.Array[H265Level](
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
type H265LookAheadRateControl = "HIGH" | "LOW" | "MEDIUM"
object H265LookAheadRateControl {
  val HIGH: "HIGH" = "HIGH"
  val LOW: "LOW" = "LOW"
  val MEDIUM: "MEDIUM" = "MEDIUM"

  @inline def values = js.Array[H265LookAheadRateControl](HIGH, LOW, MEDIUM)
}

/** H265 Profile
  */
type H265Profile = "MAIN" | "MAIN_10BIT"
object H265Profile {
  val MAIN: "MAIN" = "MAIN"
  val MAIN_10BIT: "MAIN_10BIT" = "MAIN_10BIT"

  @inline def values = js.Array[H265Profile](MAIN, MAIN_10BIT)
}

/** H265 Rate Control Mode
  */
type H265RateControlMode = "CBR" | "MULTIPLEX" | "QVBR"
object H265RateControlMode {
  val CBR: "CBR" = "CBR"
  val MULTIPLEX: "MULTIPLEX" = "MULTIPLEX"
  val QVBR: "QVBR" = "QVBR"

  @inline def values = js.Array[H265RateControlMode](CBR, MULTIPLEX, QVBR)
}

/** H265 Scan Type
  */
type H265ScanType = "INTERLACED" | "PROGRESSIVE"
object H265ScanType {
  val INTERLACED: "INTERLACED" = "INTERLACED"
  val PROGRESSIVE: "PROGRESSIVE" = "PROGRESSIVE"

  @inline def values = js.Array[H265ScanType](INTERLACED, PROGRESSIVE)
}

/** H265 Scene Change Detect
  */
type H265SceneChangeDetect = "DISABLED" | "ENABLED"
object H265SceneChangeDetect {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H265SceneChangeDetect](DISABLED, ENABLED)
}

/** H265 Tier
  */
type H265Tier = "HIGH" | "MAIN"
object H265Tier {
  val HIGH: "HIGH" = "HIGH"
  val MAIN: "MAIN" = "MAIN"

  @inline def values = js.Array[H265Tier](HIGH, MAIN)
}

/** H265 Timecode Insertion Behavior
  */
type H265TimecodeInsertionBehavior = "DISABLED" | "PIC_TIMING_SEI"
object H265TimecodeInsertionBehavior {
  val DISABLED: "DISABLED" = "DISABLED"
  val PIC_TIMING_SEI: "PIC_TIMING_SEI" = "PIC_TIMING_SEI"

  @inline def values = js.Array[H265TimecodeInsertionBehavior](DISABLED, PIC_TIMING_SEI)
}

/** Hls Ad Markers
  */
type HlsAdMarkers = "ADOBE" | "ELEMENTAL" | "ELEMENTAL_SCTE35"
object HlsAdMarkers {
  val ADOBE: "ADOBE" = "ADOBE"
  val ELEMENTAL: "ELEMENTAL" = "ELEMENTAL"
  val ELEMENTAL_SCTE35: "ELEMENTAL_SCTE35" = "ELEMENTAL_SCTE35"

  @inline def values = js.Array[HlsAdMarkers](ADOBE, ELEMENTAL, ELEMENTAL_SCTE35)
}

/** Hls Akamai Http Transfer Mode
  */
type HlsAkamaiHttpTransferMode = "CHUNKED" | "NON_CHUNKED"
object HlsAkamaiHttpTransferMode {
  val CHUNKED: "CHUNKED" = "CHUNKED"
  val NON_CHUNKED: "NON_CHUNKED" = "NON_CHUNKED"

  @inline def values = js.Array[HlsAkamaiHttpTransferMode](CHUNKED, NON_CHUNKED)
}

/** Hls Caption Language Setting
  */
type HlsCaptionLanguageSetting = "INSERT" | "NONE" | "OMIT"
object HlsCaptionLanguageSetting {
  val INSERT: "INSERT" = "INSERT"
  val NONE: "NONE" = "NONE"
  val OMIT: "OMIT" = "OMIT"

  @inline def values = js.Array[HlsCaptionLanguageSetting](INSERT, NONE, OMIT)
}

/** Hls Client Cache
  */
type HlsClientCache = "DISABLED" | "ENABLED"
object HlsClientCache {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[HlsClientCache](DISABLED, ENABLED)
}

/** Hls Codec Specification
  */
type HlsCodecSpecification = "RFC_4281" | "RFC_6381"
object HlsCodecSpecification {
  val RFC_4281: "RFC_4281" = "RFC_4281"
  val RFC_6381: "RFC_6381" = "RFC_6381"

  @inline def values = js.Array[HlsCodecSpecification](RFC_4281, RFC_6381)
}

/** Hls Directory Structure
  */
type HlsDirectoryStructure = "SINGLE_DIRECTORY" | "SUBDIRECTORY_PER_STREAM"
object HlsDirectoryStructure {
  val SINGLE_DIRECTORY: "SINGLE_DIRECTORY" = "SINGLE_DIRECTORY"
  val SUBDIRECTORY_PER_STREAM: "SUBDIRECTORY_PER_STREAM" = "SUBDIRECTORY_PER_STREAM"

  @inline def values = js.Array[HlsDirectoryStructure](SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM)
}

/** Hls Discontinuity Tags
  */
type HlsDiscontinuityTags = "INSERT" | "NEVER_INSERT"
object HlsDiscontinuityTags {
  val INSERT: "INSERT" = "INSERT"
  val NEVER_INSERT: "NEVER_INSERT" = "NEVER_INSERT"

  @inline def values = js.Array[HlsDiscontinuityTags](INSERT, NEVER_INSERT)
}

/** Hls Encryption Type
  */
type HlsEncryptionType = "AES128" | "SAMPLE_AES"
object HlsEncryptionType {
  val AES128: "AES128" = "AES128"
  val SAMPLE_AES: "SAMPLE_AES" = "SAMPLE_AES"

  @inline def values = js.Array[HlsEncryptionType](AES128, SAMPLE_AES)
}

/** Hls H265 Packaging Type
  */
type HlsH265PackagingType = "HEV1" | "HVC1"
object HlsH265PackagingType {
  val HEV1: "HEV1" = "HEV1"
  val HVC1: "HVC1" = "HVC1"

  @inline def values = js.Array[HlsH265PackagingType](HEV1, HVC1)
}

/** State of HLS ID3 Segment Tagging
  */
type HlsId3SegmentTaggingState = "DISABLED" | "ENABLED"
object HlsId3SegmentTaggingState {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[HlsId3SegmentTaggingState](DISABLED, ENABLED)
}

/** Hls Incomplete Segment Behavior
  */
type HlsIncompleteSegmentBehavior = "AUTO" | "SUPPRESS"
object HlsIncompleteSegmentBehavior {
  val AUTO: "AUTO" = "AUTO"
  val SUPPRESS: "SUPPRESS" = "SUPPRESS"

  @inline def values = js.Array[HlsIncompleteSegmentBehavior](AUTO, SUPPRESS)
}

/** Hls Iv In Manifest
  */
type HlsIvInManifest = "EXCLUDE" | "INCLUDE"
object HlsIvInManifest {
  val EXCLUDE: "EXCLUDE" = "EXCLUDE"
  val INCLUDE: "INCLUDE" = "INCLUDE"

  @inline def values = js.Array[HlsIvInManifest](EXCLUDE, INCLUDE)
}

/** Hls Iv Source
  */
type HlsIvSource = "EXPLICIT" | "FOLLOWS_SEGMENT_NUMBER"
object HlsIvSource {
  val EXPLICIT: "EXPLICIT" = "EXPLICIT"
  val FOLLOWS_SEGMENT_NUMBER: "FOLLOWS_SEGMENT_NUMBER" = "FOLLOWS_SEGMENT_NUMBER"

  @inline def values = js.Array[HlsIvSource](EXPLICIT, FOLLOWS_SEGMENT_NUMBER)
}

/** Hls Manifest Compression
  */
type HlsManifestCompression = "GZIP" | "NONE"
object HlsManifestCompression {
  val GZIP: "GZIP" = "GZIP"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[HlsManifestCompression](GZIP, NONE)
}

/** Hls Manifest Duration Format
  */
type HlsManifestDurationFormat = "FLOATING_POINT" | "INTEGER"
object HlsManifestDurationFormat {
  val FLOATING_POINT: "FLOATING_POINT" = "FLOATING_POINT"
  val INTEGER: "INTEGER" = "INTEGER"

  @inline def values = js.Array[HlsManifestDurationFormat](FLOATING_POINT, INTEGER)
}

/** Hls Media Store Storage Class
  */
type HlsMediaStoreStorageClass = "TEMPORAL"
object HlsMediaStoreStorageClass {
  val TEMPORAL: "TEMPORAL" = "TEMPORAL"

  @inline def values = js.Array[HlsMediaStoreStorageClass](TEMPORAL)
}

/** Hls Mode
  */
type HlsMode = "LIVE" | "VOD"
object HlsMode {
  val LIVE: "LIVE" = "LIVE"
  val VOD: "VOD" = "VOD"

  @inline def values = js.Array[HlsMode](LIVE, VOD)
}

/** Hls Output Selection
  */
type HlsOutputSelection = "MANIFESTS_AND_SEGMENTS" | "SEGMENTS_ONLY" | "VARIANT_MANIFESTS_AND_SEGMENTS"
object HlsOutputSelection {
  val MANIFESTS_AND_SEGMENTS: "MANIFESTS_AND_SEGMENTS" = "MANIFESTS_AND_SEGMENTS"
  val SEGMENTS_ONLY: "SEGMENTS_ONLY" = "SEGMENTS_ONLY"
  val VARIANT_MANIFESTS_AND_SEGMENTS: "VARIANT_MANIFESTS_AND_SEGMENTS" = "VARIANT_MANIFESTS_AND_SEGMENTS"

  @inline def values = js.Array[HlsOutputSelection](MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY, VARIANT_MANIFESTS_AND_SEGMENTS)
}

/** Hls Program Date Time
  */
type HlsProgramDateTime = "EXCLUDE" | "INCLUDE"
object HlsProgramDateTime {
  val EXCLUDE: "EXCLUDE" = "EXCLUDE"
  val INCLUDE: "INCLUDE" = "INCLUDE"

  @inline def values = js.Array[HlsProgramDateTime](EXCLUDE, INCLUDE)
}

/** Hls Redundant Manifest
  */
type HlsRedundantManifest = "DISABLED" | "ENABLED"
object HlsRedundantManifest {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[HlsRedundantManifest](DISABLED, ENABLED)
}

/** Hls Segmentation Mode
  */
type HlsSegmentationMode = "USE_INPUT_SEGMENTATION" | "USE_SEGMENT_DURATION"
object HlsSegmentationMode {
  val USE_INPUT_SEGMENTATION: "USE_INPUT_SEGMENTATION" = "USE_INPUT_SEGMENTATION"
  val USE_SEGMENT_DURATION: "USE_SEGMENT_DURATION" = "USE_SEGMENT_DURATION"

  @inline def values = js.Array[HlsSegmentationMode](USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION)
}

/** Hls Stream Inf Resolution
  */
type HlsStreamInfResolution = "EXCLUDE" | "INCLUDE"
object HlsStreamInfResolution {
  val EXCLUDE: "EXCLUDE" = "EXCLUDE"
  val INCLUDE: "INCLUDE" = "INCLUDE"

  @inline def values = js.Array[HlsStreamInfResolution](EXCLUDE, INCLUDE)
}

/** Hls Timed Metadata Id3 Frame
  */
type HlsTimedMetadataId3Frame = "NONE" | "PRIV" | "TDRL"
object HlsTimedMetadataId3Frame {
  val NONE: "NONE" = "NONE"
  val PRIV: "PRIV" = "PRIV"
  val TDRL: "TDRL" = "TDRL"

  @inline def values = js.Array[HlsTimedMetadataId3Frame](NONE, PRIV, TDRL)
}

/** Hls Ts File Mode
  */
type HlsTsFileMode = "SEGMENTED_FILES" | "SINGLE_FILE"
object HlsTsFileMode {
  val SEGMENTED_FILES: "SEGMENTED_FILES" = "SEGMENTED_FILES"
  val SINGLE_FILE: "SINGLE_FILE" = "SINGLE_FILE"

  @inline def values = js.Array[HlsTsFileMode](SEGMENTED_FILES, SINGLE_FILE)
}

/** Hls Webdav Http Transfer Mode
  */
type HlsWebdavHttpTransferMode = "CHUNKED" | "NON_CHUNKED"
object HlsWebdavHttpTransferMode {
  val CHUNKED: "CHUNKED" = "CHUNKED"
  val NON_CHUNKED: "NON_CHUNKED" = "NON_CHUNKED"

  @inline def values = js.Array[HlsWebdavHttpTransferMode](CHUNKED, NON_CHUNKED)
}

/** When set to "standard", an I-Frame only playlist will be written out for each video output in the output group. This I-Frame only playlist will contain byte range offsets pointing to the I-frame(s) in each segment.
  */
type IFrameOnlyPlaylistType = "DISABLED" | "STANDARD"
object IFrameOnlyPlaylistType {
  val DISABLED: "DISABLED" = "DISABLED"
  val STANDARD: "STANDARD" = "STANDARD"

  @inline def values = js.Array[IFrameOnlyPlaylistType](DISABLED, STANDARD)
}

/** A standard input has two sources and a single pipeline input only has one.
  */
type InputClass = "STANDARD" | "SINGLE_PIPELINE"
object InputClass {
  val STANDARD: "STANDARD" = "STANDARD"
  val SINGLE_PIPELINE: "SINGLE_PIPELINE" = "SINGLE_PIPELINE"

  @inline def values = js.Array[InputClass](STANDARD, SINGLE_PIPELINE)
}

/** codec in increasing order of complexity
  */
type InputCodec = "MPEG2" | "AVC" | "HEVC"
object InputCodec {
  val MPEG2: "MPEG2" = "MPEG2"
  val AVC: "AVC" = "AVC"
  val HEVC: "HEVC" = "HEVC"

  @inline def values = js.Array[InputCodec](MPEG2, AVC, HEVC)
}

/** Input Deblock Filter
  */
type InputDeblockFilter = "DISABLED" | "ENABLED"
object InputDeblockFilter {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[InputDeblockFilter](DISABLED, ENABLED)
}

/** Input Denoise Filter
  */
type InputDenoiseFilter = "DISABLED" | "ENABLED"
object InputDenoiseFilter {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[InputDenoiseFilter](DISABLED, ENABLED)
}

/** The source at the input device that is currently active.
  */
type InputDeviceActiveInput = "HDMI" | "SDI"
object InputDeviceActiveInput {
  val HDMI: "HDMI" = "HDMI"
  val SDI: "SDI" = "SDI"

  @inline def values = js.Array[InputDeviceActiveInput](HDMI, SDI)
}

/** The source to activate (use) from the input device.
  */
type InputDeviceConfiguredInput = "AUTO" | "HDMI" | "SDI"
object InputDeviceConfiguredInput {
  val AUTO: "AUTO" = "AUTO"
  val HDMI: "HDMI" = "HDMI"
  val SDI: "SDI" = "SDI"

  @inline def values = js.Array[InputDeviceConfiguredInput](AUTO, HDMI, SDI)
}

/** The state of the connection between the input device and AWS.
  */
type InputDeviceConnectionState = "DISCONNECTED" | "CONNECTED"
object InputDeviceConnectionState {
  val DISCONNECTED: "DISCONNECTED" = "DISCONNECTED"
  val CONNECTED: "CONNECTED" = "CONNECTED"

  @inline def values = js.Array[InputDeviceConnectionState](DISCONNECTED, CONNECTED)
}

/** Specifies whether the input device has been configured (outside of MediaLive) to use a dynamic IP address assignment (DHCP) or a static IP address.
  */
type InputDeviceIpScheme = "STATIC" | "DHCP"
object InputDeviceIpScheme {
  val STATIC: "STATIC" = "STATIC"
  val DHCP: "DHCP" = "DHCP"

  @inline def values = js.Array[InputDeviceIpScheme](STATIC, DHCP)
}

/** The scan type of the video source.
  */
type InputDeviceScanType = "INTERLACED" | "PROGRESSIVE"
object InputDeviceScanType {
  val INTERLACED: "INTERLACED" = "INTERLACED"
  val PROGRESSIVE: "PROGRESSIVE" = "PROGRESSIVE"

  @inline def values = js.Array[InputDeviceScanType](INTERLACED, PROGRESSIVE)
}

/** The state of the input device.
  */
type InputDeviceState = "IDLE" | "STREAMING"
object InputDeviceState {
  val IDLE: "IDLE" = "IDLE"
  val STREAMING: "STREAMING" = "STREAMING"

  @inline def values = js.Array[InputDeviceState](IDLE, STREAMING)
}

/** The type of device transfer. INCOMING for an input device that is being transferred to you, OUTGOING for an input device that you are transferring to another AWS account.
  */
type InputDeviceTransferType = "OUTGOING" | "INCOMING"
object InputDeviceTransferType {
  val OUTGOING: "OUTGOING" = "OUTGOING"
  val INCOMING: "INCOMING" = "INCOMING"

  @inline def values = js.Array[InputDeviceTransferType](OUTGOING, INCOMING)
}

/** The type of the input device. For an AWS Elemental Link device that outputs resolutions up to 1080, choose "HD".
  */
type InputDeviceType = "HD"
object InputDeviceType {
  val HD: "HD" = "HD"

  @inline def values = js.Array[InputDeviceType](HD)
}

/** Input Filter
  */
type InputFilter = "AUTO" | "DISABLED" | "FORCED"
object InputFilter {
  val AUTO: "AUTO" = "AUTO"
  val DISABLED: "DISABLED" = "DISABLED"
  val FORCED: "FORCED" = "FORCED"

  @inline def values = js.Array[InputFilter](AUTO, DISABLED, FORCED)
}

/** Input Loss Action For Hls Out
  */
type InputLossActionForHlsOut = "EMIT_OUTPUT" | "PAUSE_OUTPUT"
object InputLossActionForHlsOut {
  val EMIT_OUTPUT: "EMIT_OUTPUT" = "EMIT_OUTPUT"
  val PAUSE_OUTPUT: "PAUSE_OUTPUT" = "PAUSE_OUTPUT"

  @inline def values = js.Array[InputLossActionForHlsOut](EMIT_OUTPUT, PAUSE_OUTPUT)
}

/** Input Loss Action For Ms Smooth Out
  */
type InputLossActionForMsSmoothOut = "EMIT_OUTPUT" | "PAUSE_OUTPUT"
object InputLossActionForMsSmoothOut {
  val EMIT_OUTPUT: "EMIT_OUTPUT" = "EMIT_OUTPUT"
  val PAUSE_OUTPUT: "PAUSE_OUTPUT" = "PAUSE_OUTPUT"

  @inline def values = js.Array[InputLossActionForMsSmoothOut](EMIT_OUTPUT, PAUSE_OUTPUT)
}

/** Input Loss Action For Rtmp Out
  */
type InputLossActionForRtmpOut = "EMIT_OUTPUT" | "PAUSE_OUTPUT"
object InputLossActionForRtmpOut {
  val EMIT_OUTPUT: "EMIT_OUTPUT" = "EMIT_OUTPUT"
  val PAUSE_OUTPUT: "PAUSE_OUTPUT" = "PAUSE_OUTPUT"

  @inline def values = js.Array[InputLossActionForRtmpOut](EMIT_OUTPUT, PAUSE_OUTPUT)
}

/** Input Loss Action For Udp Out
  */
type InputLossActionForUdpOut = "DROP_PROGRAM" | "DROP_TS" | "EMIT_PROGRAM"
object InputLossActionForUdpOut {
  val DROP_PROGRAM: "DROP_PROGRAM" = "DROP_PROGRAM"
  val DROP_TS: "DROP_TS" = "DROP_TS"
  val EMIT_PROGRAM: "EMIT_PROGRAM" = "EMIT_PROGRAM"

  @inline def values = js.Array[InputLossActionForUdpOut](DROP_PROGRAM, DROP_TS, EMIT_PROGRAM)
}

/** Input Loss Image Type
  */
type InputLossImageType = "COLOR" | "SLATE"
object InputLossImageType {
  val COLOR: "COLOR" = "COLOR"
  val SLATE: "SLATE" = "SLATE"

  @inline def values = js.Array[InputLossImageType](COLOR, SLATE)
}

/** Maximum input bitrate in megabits per second. Bitrates up to 50 Mbps are supported currently.
  */
type InputMaximumBitrate = "MAX_10_MBPS" | "MAX_20_MBPS" | "MAX_50_MBPS"
object InputMaximumBitrate {
  val MAX_10_MBPS: "MAX_10_MBPS" = "MAX_10_MBPS"
  val MAX_20_MBPS: "MAX_20_MBPS" = "MAX_20_MBPS"
  val MAX_50_MBPS: "MAX_50_MBPS" = "MAX_50_MBPS"

  @inline def values = js.Array[InputMaximumBitrate](MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS)
}

/** Input preference when deciding which input to make active when a previously failed input has recovered. If \"EQUAL_INPUT_PREFERENCE\", then the active input will stay active as long as it is healthy. If \"PRIMARY_INPUT_PREFERRED\", then always switch back to the primary input when it is healthy.
  */
type InputPreference = "EQUAL_INPUT_PREFERENCE" | "PRIMARY_INPUT_PREFERRED"
object InputPreference {
  val EQUAL_INPUT_PREFERENCE: "EQUAL_INPUT_PREFERENCE" = "EQUAL_INPUT_PREFERENCE"
  val PRIMARY_INPUT_PREFERRED: "PRIMARY_INPUT_PREFERRED" = "PRIMARY_INPUT_PREFERRED"

  @inline def values = js.Array[InputPreference](EQUAL_INPUT_PREFERENCE, PRIMARY_INPUT_PREFERRED)
}

/** Input resolution based on lines of vertical resolution in the input; SD is less than 720 lines, HD is 720 to 1080 lines, UHD is greater than 1080 lines
  */
type InputResolution = "SD" | "HD" | "UHD"
object InputResolution {
  val SD: "SD" = "SD"
  val HD: "HD" = "HD"
  val UHD: "UHD" = "UHD"

  @inline def values = js.Array[InputResolution](SD, HD, UHD)
}

/** Placeholder documentation for InputSecurityGroupState
  */
type InputSecurityGroupState = "IDLE" | "IN_USE" | "UPDATING" | "DELETED"
object InputSecurityGroupState {
  val IDLE: "IDLE" = "IDLE"
  val IN_USE: "IN_USE" = "IN_USE"
  val UPDATING: "UPDATING" = "UPDATING"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[InputSecurityGroupState](IDLE, IN_USE, UPDATING, DELETED)
}

/** Input Source End Behavior
  */
type InputSourceEndBehavior = "CONTINUE" | "LOOP"
object InputSourceEndBehavior {
  val CONTINUE: "CONTINUE" = "CONTINUE"
  val LOOP: "LOOP" = "LOOP"

  @inline def values = js.Array[InputSourceEndBehavior](CONTINUE, LOOP)
}

/** There are two types of input sources, static and dynamic. If an input source is dynamic you can change the source url of the input dynamically using an input switch action. However, the only input type to support a dynamic url at this time is MP4_FILE. By default all input sources are static.
  */
type InputSourceType = "STATIC" | "DYNAMIC"
object InputSourceType {
  val STATIC: "STATIC" = "STATIC"
  val DYNAMIC: "DYNAMIC" = "DYNAMIC"

  @inline def values = js.Array[InputSourceType](STATIC, DYNAMIC)
}

/** Placeholder documentation for InputState
  */
type InputState = "CREATING" | "DETACHED" | "ATTACHED" | "DELETING" | "DELETED"
object InputState {
  val CREATING: "CREATING" = "CREATING"
  val DETACHED: "DETACHED" = "DETACHED"
  val ATTACHED: "ATTACHED" = "ATTACHED"
  val DELETING: "DELETING" = "DELETING"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[InputState](CREATING, DETACHED, ATTACHED, DELETING, DELETED)
}

/** Documentation update needed
  */
type InputTimecodeSource = "ZEROBASED" | "EMBEDDED"
object InputTimecodeSource {
  val ZEROBASED: "ZEROBASED" = "ZEROBASED"
  val EMBEDDED: "EMBEDDED" = "EMBEDDED"

  @inline def values = js.Array[InputTimecodeSource](ZEROBASED, EMBEDDED)
}

/** Placeholder documentation for InputType
  */
type InputType = "UDP_PUSH" | "RTP_PUSH" | "RTMP_PUSH" | "RTMP_PULL" | "URL_PULL" | "MP4_FILE" | "MEDIACONNECT" | "INPUT_DEVICE" | "AWS_CDI"
object InputType {
  val UDP_PUSH: "UDP_PUSH" = "UDP_PUSH"
  val RTP_PUSH: "RTP_PUSH" = "RTP_PUSH"
  val RTMP_PUSH: "RTMP_PUSH" = "RTMP_PUSH"
  val RTMP_PULL: "RTMP_PULL" = "RTMP_PULL"
  val URL_PULL: "URL_PULL" = "URL_PULL"
  val MP4_FILE: "MP4_FILE" = "MP4_FILE"
  val MEDIACONNECT: "MEDIACONNECT" = "MEDIACONNECT"
  val INPUT_DEVICE: "INPUT_DEVICE" = "INPUT_DEVICE"
  val AWS_CDI: "AWS_CDI" = "AWS_CDI"

  @inline def values = js.Array[InputType](UDP_PUSH, RTP_PUSH, RTMP_PUSH, RTMP_PULL, URL_PULL, MP4_FILE, MEDIACONNECT, INPUT_DEVICE, AWS_CDI)
}

/** If you specify a StopTimecode in an input (in order to clip the file), you can specify if you want the clip to exclude (the default) or include the frame specified by the timecode.
  */
type LastFrameClippingBehavior = "EXCLUDE_LAST_FRAME" | "INCLUDE_LAST_FRAME"
object LastFrameClippingBehavior {
  val EXCLUDE_LAST_FRAME: "EXCLUDE_LAST_FRAME" = "EXCLUDE_LAST_FRAME"
  val INCLUDE_LAST_FRAME: "INCLUDE_LAST_FRAME" = "INCLUDE_LAST_FRAME"

  @inline def values = js.Array[LastFrameClippingBehavior](EXCLUDE_LAST_FRAME, INCLUDE_LAST_FRAME)
}

/** The log level the user wants for their channel.
  */
type LogLevel = "ERROR" | "WARNING" | "INFO" | "DEBUG" | "DISABLED"
object LogLevel {
  val ERROR: "ERROR" = "ERROR"
  val WARNING: "WARNING" = "WARNING"
  val INFO: "INFO" = "INFO"
  val DEBUG: "DEBUG" = "DEBUG"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[LogLevel](ERROR, WARNING, INFO, DEBUG, DISABLED)
}

/** M2ts Absent Input Audio Behavior
  */
type M2tsAbsentInputAudioBehavior = "DROP" | "ENCODE_SILENCE"
object M2tsAbsentInputAudioBehavior {
  val DROP: "DROP" = "DROP"
  val ENCODE_SILENCE: "ENCODE_SILENCE" = "ENCODE_SILENCE"

  @inline def values = js.Array[M2tsAbsentInputAudioBehavior](DROP, ENCODE_SILENCE)
}

/** M2ts Arib
  */
type M2tsArib = "DISABLED" | "ENABLED"
object M2tsArib {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[M2tsArib](DISABLED, ENABLED)
}

/** M2ts Arib Captions Pid Control
  */
type M2tsAribCaptionsPidControl = "AUTO" | "USE_CONFIGURED"
object M2tsAribCaptionsPidControl {
  val AUTO: "AUTO" = "AUTO"
  val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"

  @inline def values = js.Array[M2tsAribCaptionsPidControl](AUTO, USE_CONFIGURED)
}

/** M2ts Audio Buffer Model
  */
type M2tsAudioBufferModel = "ATSC" | "DVB"
object M2tsAudioBufferModel {
  val ATSC: "ATSC" = "ATSC"
  val DVB: "DVB" = "DVB"

  @inline def values = js.Array[M2tsAudioBufferModel](ATSC, DVB)
}

/** M2ts Audio Interval
  */
type M2tsAudioInterval = "VIDEO_AND_FIXED_INTERVALS" | "VIDEO_INTERVAL"
object M2tsAudioInterval {
  val VIDEO_AND_FIXED_INTERVALS: "VIDEO_AND_FIXED_INTERVALS" = "VIDEO_AND_FIXED_INTERVALS"
  val VIDEO_INTERVAL: "VIDEO_INTERVAL" = "VIDEO_INTERVAL"

  @inline def values = js.Array[M2tsAudioInterval](VIDEO_AND_FIXED_INTERVALS, VIDEO_INTERVAL)
}

/** M2ts Audio Stream Type
  */
type M2tsAudioStreamType = "ATSC" | "DVB"
object M2tsAudioStreamType {
  val ATSC: "ATSC" = "ATSC"
  val DVB: "DVB" = "DVB"

  @inline def values = js.Array[M2tsAudioStreamType](ATSC, DVB)
}

/** M2ts Buffer Model
  */
type M2tsBufferModel = "MULTIPLEX" | "NONE"
object M2tsBufferModel {
  val MULTIPLEX: "MULTIPLEX" = "MULTIPLEX"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[M2tsBufferModel](MULTIPLEX, NONE)
}

/** M2ts Cc Descriptor
  */
type M2tsCcDescriptor = "DISABLED" | "ENABLED"
object M2tsCcDescriptor {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[M2tsCcDescriptor](DISABLED, ENABLED)
}

/** M2ts Ebif Control
  */
type M2tsEbifControl = "NONE" | "PASSTHROUGH"
object M2tsEbifControl {
  val NONE: "NONE" = "NONE"
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  @inline def values = js.Array[M2tsEbifControl](NONE, PASSTHROUGH)
}

/** M2ts Ebp Placement
  */
type M2tsEbpPlacement = "VIDEO_AND_AUDIO_PIDS" | "VIDEO_PID"
object M2tsEbpPlacement {
  val VIDEO_AND_AUDIO_PIDS: "VIDEO_AND_AUDIO_PIDS" = "VIDEO_AND_AUDIO_PIDS"
  val VIDEO_PID: "VIDEO_PID" = "VIDEO_PID"

  @inline def values = js.Array[M2tsEbpPlacement](VIDEO_AND_AUDIO_PIDS, VIDEO_PID)
}

/** M2ts Es Rate In Pes
  */
type M2tsEsRateInPes = "EXCLUDE" | "INCLUDE"
object M2tsEsRateInPes {
  val EXCLUDE: "EXCLUDE" = "EXCLUDE"
  val INCLUDE: "INCLUDE" = "INCLUDE"

  @inline def values = js.Array[M2tsEsRateInPes](EXCLUDE, INCLUDE)
}

/** M2ts Klv
  */
type M2tsKlv = "NONE" | "PASSTHROUGH"
object M2tsKlv {
  val NONE: "NONE" = "NONE"
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  @inline def values = js.Array[M2tsKlv](NONE, PASSTHROUGH)
}

/** M2ts Nielsen Id3 Behavior
  */
type M2tsNielsenId3Behavior = "NO_PASSTHROUGH" | "PASSTHROUGH"
object M2tsNielsenId3Behavior {
  val NO_PASSTHROUGH: "NO_PASSTHROUGH" = "NO_PASSTHROUGH"
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  @inline def values = js.Array[M2tsNielsenId3Behavior](NO_PASSTHROUGH, PASSTHROUGH)
}

/** M2ts Pcr Control
  */
type M2tsPcrControl = "CONFIGURED_PCR_PERIOD" | "PCR_EVERY_PES_PACKET"
object M2tsPcrControl {
  val CONFIGURED_PCR_PERIOD: "CONFIGURED_PCR_PERIOD" = "CONFIGURED_PCR_PERIOD"
  val PCR_EVERY_PES_PACKET: "PCR_EVERY_PES_PACKET" = "PCR_EVERY_PES_PACKET"

  @inline def values = js.Array[M2tsPcrControl](CONFIGURED_PCR_PERIOD, PCR_EVERY_PES_PACKET)
}

/** M2ts Rate Mode
  */
type M2tsRateMode = "CBR" | "VBR"
object M2tsRateMode {
  val CBR: "CBR" = "CBR"
  val VBR: "VBR" = "VBR"

  @inline def values = js.Array[M2tsRateMode](CBR, VBR)
}

/** M2ts Scte35 Control
  */
type M2tsScte35Control = "NONE" | "PASSTHROUGH"
object M2tsScte35Control {
  val NONE: "NONE" = "NONE"
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  @inline def values = js.Array[M2tsScte35Control](NONE, PASSTHROUGH)
}

/** M2ts Segmentation Markers
  */
type M2tsSegmentationMarkers = "EBP" | "EBP_LEGACY" | "NONE" | "PSI_SEGSTART" | "RAI_ADAPT" | "RAI_SEGSTART"
object M2tsSegmentationMarkers {
  val EBP: "EBP" = "EBP"
  val EBP_LEGACY: "EBP_LEGACY" = "EBP_LEGACY"
  val NONE: "NONE" = "NONE"
  val PSI_SEGSTART: "PSI_SEGSTART" = "PSI_SEGSTART"
  val RAI_ADAPT: "RAI_ADAPT" = "RAI_ADAPT"
  val RAI_SEGSTART: "RAI_SEGSTART" = "RAI_SEGSTART"

  @inline def values = js.Array[M2tsSegmentationMarkers](EBP, EBP_LEGACY, NONE, PSI_SEGSTART, RAI_ADAPT, RAI_SEGSTART)
}

/** M2ts Segmentation Style
  */
type M2tsSegmentationStyle = "MAINTAIN_CADENCE" | "RESET_CADENCE"
object M2tsSegmentationStyle {
  val MAINTAIN_CADENCE: "MAINTAIN_CADENCE" = "MAINTAIN_CADENCE"
  val RESET_CADENCE: "RESET_CADENCE" = "RESET_CADENCE"

  @inline def values = js.Array[M2tsSegmentationStyle](MAINTAIN_CADENCE, RESET_CADENCE)
}

/** M2ts Timed Metadata Behavior
  */
type M2tsTimedMetadataBehavior = "NO_PASSTHROUGH" | "PASSTHROUGH"
object M2tsTimedMetadataBehavior {
  val NO_PASSTHROUGH: "NO_PASSTHROUGH" = "NO_PASSTHROUGH"
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  @inline def values = js.Array[M2tsTimedMetadataBehavior](NO_PASSTHROUGH, PASSTHROUGH)
}

/** M3u8 Nielsen Id3 Behavior
  */
type M3u8NielsenId3Behavior = "NO_PASSTHROUGH" | "PASSTHROUGH"
object M3u8NielsenId3Behavior {
  val NO_PASSTHROUGH: "NO_PASSTHROUGH" = "NO_PASSTHROUGH"
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  @inline def values = js.Array[M3u8NielsenId3Behavior](NO_PASSTHROUGH, PASSTHROUGH)
}

/** M3u8 Pcr Control
  */
type M3u8PcrControl = "CONFIGURED_PCR_PERIOD" | "PCR_EVERY_PES_PACKET"
object M3u8PcrControl {
  val CONFIGURED_PCR_PERIOD: "CONFIGURED_PCR_PERIOD" = "CONFIGURED_PCR_PERIOD"
  val PCR_EVERY_PES_PACKET: "PCR_EVERY_PES_PACKET" = "PCR_EVERY_PES_PACKET"

  @inline def values = js.Array[M3u8PcrControl](CONFIGURED_PCR_PERIOD, PCR_EVERY_PES_PACKET)
}

/** M3u8 Scte35 Behavior
  */
type M3u8Scte35Behavior = "NO_PASSTHROUGH" | "PASSTHROUGH"
object M3u8Scte35Behavior {
  val NO_PASSTHROUGH: "NO_PASSTHROUGH" = "NO_PASSTHROUGH"
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  @inline def values = js.Array[M3u8Scte35Behavior](NO_PASSTHROUGH, PASSTHROUGH)
}

/** M3u8 Timed Metadata Behavior
  */
type M3u8TimedMetadataBehavior = "NO_PASSTHROUGH" | "PASSTHROUGH"
object M3u8TimedMetadataBehavior {
  val NO_PASSTHROUGH: "NO_PASSTHROUGH" = "NO_PASSTHROUGH"
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  @inline def values = js.Array[M3u8TimedMetadataBehavior](NO_PASSTHROUGH, PASSTHROUGH)
}

/** Motion Graphics Insertion
  */
type MotionGraphicsInsertion = "DISABLED" | "ENABLED"
object MotionGraphicsInsertion {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[MotionGraphicsInsertion](DISABLED, ENABLED)
}

/** Mp2 Coding Mode
  */
type Mp2CodingMode = "CODING_MODE_1_0" | "CODING_MODE_2_0"
object Mp2CodingMode {
  val CODING_MODE_1_0: "CODING_MODE_1_0" = "CODING_MODE_1_0"
  val CODING_MODE_2_0: "CODING_MODE_2_0" = "CODING_MODE_2_0"

  @inline def values = js.Array[Mp2CodingMode](CODING_MODE_1_0, CODING_MODE_2_0)
}

/** Mpeg2 Adaptive Quantization
  */
type Mpeg2AdaptiveQuantization = "AUTO" | "HIGH" | "LOW" | "MEDIUM" | "OFF"
object Mpeg2AdaptiveQuantization {
  val AUTO: "AUTO" = "AUTO"
  val HIGH: "HIGH" = "HIGH"
  val LOW: "LOW" = "LOW"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val OFF: "OFF" = "OFF"

  @inline def values = js.Array[Mpeg2AdaptiveQuantization](AUTO, HIGH, LOW, MEDIUM, OFF)
}

/** Mpeg2 Color Metadata
  */
type Mpeg2ColorMetadata = "IGNORE" | "INSERT"
object Mpeg2ColorMetadata {
  val IGNORE: "IGNORE" = "IGNORE"
  val INSERT: "INSERT" = "INSERT"

  @inline def values = js.Array[Mpeg2ColorMetadata](IGNORE, INSERT)
}

/** Mpeg2 Color Space
  */
type Mpeg2ColorSpace = "AUTO" | "PASSTHROUGH"
object Mpeg2ColorSpace {
  val AUTO: "AUTO" = "AUTO"
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  @inline def values = js.Array[Mpeg2ColorSpace](AUTO, PASSTHROUGH)
}

/** Mpeg2 Display Ratio
  */
type Mpeg2DisplayRatio = "DISPLAYRATIO16X9" | "DISPLAYRATIO4X3"
object Mpeg2DisplayRatio {
  val DISPLAYRATIO16X9: "DISPLAYRATIO16X9" = "DISPLAYRATIO16X9"
  val DISPLAYRATIO4X3: "DISPLAYRATIO4X3" = "DISPLAYRATIO4X3"

  @inline def values = js.Array[Mpeg2DisplayRatio](DISPLAYRATIO16X9, DISPLAYRATIO4X3)
}

/** Mpeg2 Gop Size Units
  */
type Mpeg2GopSizeUnits = "FRAMES" | "SECONDS"
object Mpeg2GopSizeUnits {
  val FRAMES: "FRAMES" = "FRAMES"
  val SECONDS: "SECONDS" = "SECONDS"

  @inline def values = js.Array[Mpeg2GopSizeUnits](FRAMES, SECONDS)
}

/** Mpeg2 Scan Type
  */
type Mpeg2ScanType = "INTERLACED" | "PROGRESSIVE"
object Mpeg2ScanType {
  val INTERLACED: "INTERLACED" = "INTERLACED"
  val PROGRESSIVE: "PROGRESSIVE" = "PROGRESSIVE"

  @inline def values = js.Array[Mpeg2ScanType](INTERLACED, PROGRESSIVE)
}

/** Mpeg2 Sub Gop Length
  */
type Mpeg2SubGopLength = "DYNAMIC" | "FIXED"
object Mpeg2SubGopLength {
  val DYNAMIC: "DYNAMIC" = "DYNAMIC"
  val FIXED: "FIXED" = "FIXED"

  @inline def values = js.Array[Mpeg2SubGopLength](DYNAMIC, FIXED)
}

/** Mpeg2 Timecode Insertion Behavior
  */
type Mpeg2TimecodeInsertionBehavior = "DISABLED" | "GOP_TIMECODE"
object Mpeg2TimecodeInsertionBehavior {
  val DISABLED: "DISABLED" = "DISABLED"
  val GOP_TIMECODE: "GOP_TIMECODE" = "GOP_TIMECODE"

  @inline def values = js.Array[Mpeg2TimecodeInsertionBehavior](DISABLED, GOP_TIMECODE)
}

/** Ms Smooth H265 Packaging Type
  */
type MsSmoothH265PackagingType = "HEV1" | "HVC1"
object MsSmoothH265PackagingType {
  val HEV1: "HEV1" = "HEV1"
  val HVC1: "HVC1" = "HVC1"

  @inline def values = js.Array[MsSmoothH265PackagingType](HEV1, HVC1)
}

/** The current state of the multiplex.
  */
type MultiplexState = "CREATING" | "CREATE_FAILED" | "IDLE" | "STARTING" | "RUNNING" | "RECOVERING" | "STOPPING" | "DELETING" | "DELETED"
object MultiplexState {
  val CREATING: "CREATING" = "CREATING"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val IDLE: "IDLE" = "IDLE"
  val STARTING: "STARTING" = "STARTING"
  val RUNNING: "RUNNING" = "RUNNING"
  val RECOVERING: "RECOVERING" = "RECOVERING"
  val STOPPING: "STOPPING" = "STOPPING"
  val DELETING: "DELETING" = "DELETING"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[MultiplexState](CREATING, CREATE_FAILED, IDLE, STARTING, RUNNING, RECOVERING, STOPPING, DELETING, DELETED)
}

/** Network Input Server Validation
  */
type NetworkInputServerValidation = "CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME" | "CHECK_CRYPTOGRAPHY_ONLY"
object NetworkInputServerValidation {
  val CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME: "CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME" = "CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME"
  val CHECK_CRYPTOGRAPHY_ONLY: "CHECK_CRYPTOGRAPHY_ONLY" = "CHECK_CRYPTOGRAPHY_ONLY"

  @inline def values = js.Array[NetworkInputServerValidation](CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME, CHECK_CRYPTOGRAPHY_ONLY)
}

/** State of Nielsen PCM to ID3 tagging
  */
type NielsenPcmToId3TaggingState = "DISABLED" | "ENABLED"
object NielsenPcmToId3TaggingState {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[NielsenPcmToId3TaggingState](DISABLED, ENABLED)
}

/** Units for duration, e.g. 'MONTHS'
  */
type OfferingDurationUnits = "MONTHS"
object OfferingDurationUnits {
  val MONTHS: "MONTHS" = "MONTHS"

  @inline def values = js.Array[OfferingDurationUnits](MONTHS)
}

/** Offering type, e.g. 'NO_UPFRONT'
  */
type OfferingType = "NO_UPFRONT"
object OfferingType {
  val NO_UPFRONT: "NO_UPFRONT" = "NO_UPFRONT"

  @inline def values = js.Array[OfferingType](NO_UPFRONT)
}

/** Pipeline ID
  */
type PipelineId = "PIPELINE_0" | "PIPELINE_1"
object PipelineId {
  val PIPELINE_0: "PIPELINE_0" = "PIPELINE_0"
  val PIPELINE_1: "PIPELINE_1" = "PIPELINE_1"

  @inline def values = js.Array[PipelineId](PIPELINE_0, PIPELINE_1)
}

/** Indicates which pipeline is preferred by the multiplex for program ingest. If set to \"PIPELINE_0\" or \"PIPELINE_1\" and an unhealthy ingest causes the multiplex to switch to the non-preferred pipeline, it will switch back once that ingest is healthy again. If set to \"CURRENTLY_ACTIVE\", it will not switch back to the other pipeline based on it recovering to a healthy state, it will only switch if the active pipeline becomes unhealthy.
  */
type PreferredChannelPipeline = "CURRENTLY_ACTIVE" | "PIPELINE_0" | "PIPELINE_1"
object PreferredChannelPipeline {
  val CURRENTLY_ACTIVE: "CURRENTLY_ACTIVE" = "CURRENTLY_ACTIVE"
  val PIPELINE_0: "PIPELINE_0" = "PIPELINE_0"
  val PIPELINE_1: "PIPELINE_1" = "PIPELINE_1"

  @inline def values = js.Array[PreferredChannelPipeline](CURRENTLY_ACTIVE, PIPELINE_0, PIPELINE_1)
}

/** Codec, 'MPEG2', 'AVC', 'HEVC', or 'AUDIO'
  */
type ReservationCodec = "MPEG2" | "AVC" | "HEVC" | "AUDIO" | "LINK"
object ReservationCodec {
  val MPEG2: "MPEG2" = "MPEG2"
  val AVC: "AVC" = "AVC"
  val HEVC: "HEVC" = "HEVC"
  val AUDIO: "AUDIO" = "AUDIO"
  val LINK: "LINK" = "LINK"

  @inline def values = js.Array[ReservationCodec](MPEG2, AVC, HEVC, AUDIO, LINK)
}

/** Maximum bitrate in megabits per second
  */
type ReservationMaximumBitrate = "MAX_10_MBPS" | "MAX_20_MBPS" | "MAX_50_MBPS"
object ReservationMaximumBitrate {
  val MAX_10_MBPS: "MAX_10_MBPS" = "MAX_10_MBPS"
  val MAX_20_MBPS: "MAX_20_MBPS" = "MAX_20_MBPS"
  val MAX_50_MBPS: "MAX_50_MBPS" = "MAX_50_MBPS"

  @inline def values = js.Array[ReservationMaximumBitrate](MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS)
}

/** Maximum framerate in frames per second (Outputs only)
  */
type ReservationMaximumFramerate = "MAX_30_FPS" | "MAX_60_FPS"
object ReservationMaximumFramerate {
  val MAX_30_FPS: "MAX_30_FPS" = "MAX_30_FPS"
  val MAX_60_FPS: "MAX_60_FPS" = "MAX_60_FPS"

  @inline def values = js.Array[ReservationMaximumFramerate](MAX_30_FPS, MAX_60_FPS)
}

/** Resolution based on lines of vertical resolution; SD is less than 720 lines, HD is 720 to 1080 lines, FHD is 1080 lines, UHD is greater than 1080 lines
  */
type ReservationResolution = "SD" | "HD" | "FHD" | "UHD"
object ReservationResolution {
  val SD: "SD" = "SD"
  val HD: "HD" = "HD"
  val FHD: "FHD" = "FHD"
  val UHD: "UHD" = "UHD"

  @inline def values = js.Array[ReservationResolution](SD, HD, FHD, UHD)
}

/** Resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
  */
type ReservationResourceType = "INPUT" | "OUTPUT" | "MULTIPLEX" | "CHANNEL"
object ReservationResourceType {
  val INPUT: "INPUT" = "INPUT"
  val OUTPUT: "OUTPUT" = "OUTPUT"
  val MULTIPLEX: "MULTIPLEX" = "MULTIPLEX"
  val CHANNEL: "CHANNEL" = "CHANNEL"

  @inline def values = js.Array[ReservationResourceType](INPUT, OUTPUT, MULTIPLEX, CHANNEL)
}

/** Special features, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
  */
type ReservationSpecialFeature = "ADVANCED_AUDIO" | "AUDIO_NORMALIZATION"
object ReservationSpecialFeature {
  val ADVANCED_AUDIO: "ADVANCED_AUDIO" = "ADVANCED_AUDIO"
  val AUDIO_NORMALIZATION: "AUDIO_NORMALIZATION" = "AUDIO_NORMALIZATION"

  @inline def values = js.Array[ReservationSpecialFeature](ADVANCED_AUDIO, AUDIO_NORMALIZATION)
}

/** Current reservation state
  */
type ReservationState = "ACTIVE" | "EXPIRED" | "CANCELED" | "DELETED"
object ReservationState {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val EXPIRED: "EXPIRED" = "EXPIRED"
  val CANCELED: "CANCELED" = "CANCELED"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[ReservationState](ACTIVE, EXPIRED, CANCELED, DELETED)
}

/** Video quality, e.g. 'STANDARD' (Outputs only)
  */
type ReservationVideoQuality = "STANDARD" | "ENHANCED" | "PREMIUM"
object ReservationVideoQuality {
  val STANDARD: "STANDARD" = "STANDARD"
  val ENHANCED: "ENHANCED" = "ENHANCED"
  val PREMIUM: "PREMIUM" = "PREMIUM"

  @inline def values = js.Array[ReservationVideoQuality](STANDARD, ENHANCED, PREMIUM)
}

/** Rtmp Ad Markers
  */
type RtmpAdMarkers = "ON_CUE_POINT_SCTE35"
object RtmpAdMarkers {
  val ON_CUE_POINT_SCTE35: "ON_CUE_POINT_SCTE35" = "ON_CUE_POINT_SCTE35"

  @inline def values = js.Array[RtmpAdMarkers](ON_CUE_POINT_SCTE35)
}

/** Rtmp Cache Full Behavior
  */
type RtmpCacheFullBehavior = "DISCONNECT_IMMEDIATELY" | "WAIT_FOR_SERVER"
object RtmpCacheFullBehavior {
  val DISCONNECT_IMMEDIATELY: "DISCONNECT_IMMEDIATELY" = "DISCONNECT_IMMEDIATELY"
  val WAIT_FOR_SERVER: "WAIT_FOR_SERVER" = "WAIT_FOR_SERVER"

  @inline def values = js.Array[RtmpCacheFullBehavior](DISCONNECT_IMMEDIATELY, WAIT_FOR_SERVER)
}

/** Rtmp Caption Data
  */
type RtmpCaptionData = "ALL" | "FIELD1_608" | "FIELD1_AND_FIELD2_608"
object RtmpCaptionData {
  val ALL: "ALL" = "ALL"
  val FIELD1_608: "FIELD1_608" = "FIELD1_608"
  val FIELD1_AND_FIELD2_608: "FIELD1_AND_FIELD2_608" = "FIELD1_AND_FIELD2_608"

  @inline def values = js.Array[RtmpCaptionData](ALL, FIELD1_608, FIELD1_AND_FIELD2_608)
}

/** Rtmp Output Certificate Mode
  */
type RtmpOutputCertificateMode = "SELF_SIGNED" | "VERIFY_AUTHENTICITY"
object RtmpOutputCertificateMode {
  val SELF_SIGNED: "SELF_SIGNED" = "SELF_SIGNED"
  val VERIFY_AUTHENTICITY: "VERIFY_AUTHENTICITY" = "VERIFY_AUTHENTICITY"

  @inline def values = js.Array[RtmpOutputCertificateMode](SELF_SIGNED, VERIFY_AUTHENTICITY)
}

/** S3 Canned Acl
  */
type S3CannedAcl = "AUTHENTICATED_READ" | "BUCKET_OWNER_FULL_CONTROL" | "BUCKET_OWNER_READ" | "PUBLIC_READ"
object S3CannedAcl {
  val AUTHENTICATED_READ: "AUTHENTICATED_READ" = "AUTHENTICATED_READ"
  val BUCKET_OWNER_FULL_CONTROL: "BUCKET_OWNER_FULL_CONTROL" = "BUCKET_OWNER_FULL_CONTROL"
  val BUCKET_OWNER_READ: "BUCKET_OWNER_READ" = "BUCKET_OWNER_READ"
  val PUBLIC_READ: "PUBLIC_READ" = "PUBLIC_READ"

  @inline def values = js.Array[S3CannedAcl](AUTHENTICATED_READ, BUCKET_OWNER_FULL_CONTROL, BUCKET_OWNER_READ, PUBLIC_READ)
}

/** Scte20 Convert608 To708
  */
type Scte20Convert608To708 = "DISABLED" | "UPCONVERT"
object Scte20Convert608To708 {
  val DISABLED: "DISABLED" = "DISABLED"
  val UPCONVERT: "UPCONVERT" = "UPCONVERT"

  @inline def values = js.Array[Scte20Convert608To708](DISABLED, UPCONVERT)
}

/** Scte35 Apos No Regional Blackout Behavior
  */
type Scte35AposNoRegionalBlackoutBehavior = "FOLLOW" | "IGNORE"
object Scte35AposNoRegionalBlackoutBehavior {
  val FOLLOW: "FOLLOW" = "FOLLOW"
  val IGNORE: "IGNORE" = "IGNORE"

  @inline def values = js.Array[Scte35AposNoRegionalBlackoutBehavior](FOLLOW, IGNORE)
}

/** Scte35 Apos Web Delivery Allowed Behavior
  */
type Scte35AposWebDeliveryAllowedBehavior = "FOLLOW" | "IGNORE"
object Scte35AposWebDeliveryAllowedBehavior {
  val FOLLOW: "FOLLOW" = "FOLLOW"
  val IGNORE: "IGNORE" = "IGNORE"

  @inline def values = js.Array[Scte35AposWebDeliveryAllowedBehavior](FOLLOW, IGNORE)
}

/** Corresponds to the archive_allowed parameter. A value of ARCHIVE_NOT_ALLOWED corresponds to 0 (false) in the SCTE-35 specification. If you include one of the "restriction" flags then you must include all four of them.
  */
type Scte35ArchiveAllowedFlag = "ARCHIVE_NOT_ALLOWED" | "ARCHIVE_ALLOWED"
object Scte35ArchiveAllowedFlag {
  val ARCHIVE_NOT_ALLOWED: "ARCHIVE_NOT_ALLOWED" = "ARCHIVE_NOT_ALLOWED"
  val ARCHIVE_ALLOWED: "ARCHIVE_ALLOWED" = "ARCHIVE_ALLOWED"

  @inline def values = js.Array[Scte35ArchiveAllowedFlag](ARCHIVE_NOT_ALLOWED, ARCHIVE_ALLOWED)
}

/** Corresponds to the device_restrictions parameter in a segmentation_descriptor. If you include one of the "restriction" flags then you must include all four of them.
  */
type Scte35DeviceRestrictions = "NONE" | "RESTRICT_GROUP0" | "RESTRICT_GROUP1" | "RESTRICT_GROUP2"
object Scte35DeviceRestrictions {
  val NONE: "NONE" = "NONE"
  val RESTRICT_GROUP0: "RESTRICT_GROUP0" = "RESTRICT_GROUP0"
  val RESTRICT_GROUP1: "RESTRICT_GROUP1" = "RESTRICT_GROUP1"
  val RESTRICT_GROUP2: "RESTRICT_GROUP2" = "RESTRICT_GROUP2"

  @inline def values = js.Array[Scte35DeviceRestrictions](NONE, RESTRICT_GROUP0, RESTRICT_GROUP1, RESTRICT_GROUP2)
}

/** Corresponds to the no_regional_blackout_flag parameter. A value of REGIONAL_BLACKOUT corresponds to 0 (false) in the SCTE-35 specification. If you include one of the "restriction" flags then you must include all four of them.
  */
type Scte35NoRegionalBlackoutFlag = "REGIONAL_BLACKOUT" | "NO_REGIONAL_BLACKOUT"
object Scte35NoRegionalBlackoutFlag {
  val REGIONAL_BLACKOUT: "REGIONAL_BLACKOUT" = "REGIONAL_BLACKOUT"
  val NO_REGIONAL_BLACKOUT: "NO_REGIONAL_BLACKOUT" = "NO_REGIONAL_BLACKOUT"

  @inline def values = js.Array[Scte35NoRegionalBlackoutFlag](REGIONAL_BLACKOUT, NO_REGIONAL_BLACKOUT)
}

/** Corresponds to SCTE-35 segmentation_event_cancel_indicator. SEGMENTATION_EVENT_NOT_CANCELED corresponds to 0 in the SCTE-35 specification and indicates that this is an insertion request. SEGMENTATION_EVENT_CANCELED corresponds to 1 in the SCTE-35 specification and indicates that this is a cancelation request, in which case complete this field and the existing event ID to cancel.
  */
type Scte35SegmentationCancelIndicator = "SEGMENTATION_EVENT_NOT_CANCELED" | "SEGMENTATION_EVENT_CANCELED"
object Scte35SegmentationCancelIndicator {
  val SEGMENTATION_EVENT_NOT_CANCELED: "SEGMENTATION_EVENT_NOT_CANCELED" = "SEGMENTATION_EVENT_NOT_CANCELED"
  val SEGMENTATION_EVENT_CANCELED: "SEGMENTATION_EVENT_CANCELED" = "SEGMENTATION_EVENT_CANCELED"

  @inline def values = js.Array[Scte35SegmentationCancelIndicator](SEGMENTATION_EVENT_NOT_CANCELED, SEGMENTATION_EVENT_CANCELED)
}

/** Scte35 Splice Insert No Regional Blackout Behavior
  */
type Scte35SpliceInsertNoRegionalBlackoutBehavior = "FOLLOW" | "IGNORE"
object Scte35SpliceInsertNoRegionalBlackoutBehavior {
  val FOLLOW: "FOLLOW" = "FOLLOW"
  val IGNORE: "IGNORE" = "IGNORE"

  @inline def values = js.Array[Scte35SpliceInsertNoRegionalBlackoutBehavior](FOLLOW, IGNORE)
}

/** Scte35 Splice Insert Web Delivery Allowed Behavior
  */
type Scte35SpliceInsertWebDeliveryAllowedBehavior = "FOLLOW" | "IGNORE"
object Scte35SpliceInsertWebDeliveryAllowedBehavior {
  val FOLLOW: "FOLLOW" = "FOLLOW"
  val IGNORE: "IGNORE" = "IGNORE"

  @inline def values = js.Array[Scte35SpliceInsertWebDeliveryAllowedBehavior](FOLLOW, IGNORE)
}

/** Corresponds to the web_delivery_allowed_flag parameter. A value of WEB_DELIVERY_NOT_ALLOWED corresponds to 0 (false) in the SCTE-35 specification. If you include one of the "restriction" flags then you must include all four of them.
  */
type Scte35WebDeliveryAllowedFlag = "WEB_DELIVERY_NOT_ALLOWED" | "WEB_DELIVERY_ALLOWED"
object Scte35WebDeliveryAllowedFlag {
  val WEB_DELIVERY_NOT_ALLOWED: "WEB_DELIVERY_NOT_ALLOWED" = "WEB_DELIVERY_NOT_ALLOWED"
  val WEB_DELIVERY_ALLOWED: "WEB_DELIVERY_ALLOWED" = "WEB_DELIVERY_ALLOWED"

  @inline def values = js.Array[Scte35WebDeliveryAllowedFlag](WEB_DELIVERY_NOT_ALLOWED, WEB_DELIVERY_ALLOWED)
}

/** Smooth Group Audio Only Timecode Control
  */
type SmoothGroupAudioOnlyTimecodeControl = "PASSTHROUGH" | "USE_CONFIGURED_CLOCK"
object SmoothGroupAudioOnlyTimecodeControl {
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"
  val USE_CONFIGURED_CLOCK: "USE_CONFIGURED_CLOCK" = "USE_CONFIGURED_CLOCK"

  @inline def values = js.Array[SmoothGroupAudioOnlyTimecodeControl](PASSTHROUGH, USE_CONFIGURED_CLOCK)
}

/** Smooth Group Certificate Mode
  */
type SmoothGroupCertificateMode = "SELF_SIGNED" | "VERIFY_AUTHENTICITY"
object SmoothGroupCertificateMode {
  val SELF_SIGNED: "SELF_SIGNED" = "SELF_SIGNED"
  val VERIFY_AUTHENTICITY: "VERIFY_AUTHENTICITY" = "VERIFY_AUTHENTICITY"

  @inline def values = js.Array[SmoothGroupCertificateMode](SELF_SIGNED, VERIFY_AUTHENTICITY)
}

/** Smooth Group Event Id Mode
  */
type SmoothGroupEventIdMode = "NO_EVENT_ID" | "USE_CONFIGURED" | "USE_TIMESTAMP"
object SmoothGroupEventIdMode {
  val NO_EVENT_ID: "NO_EVENT_ID" = "NO_EVENT_ID"
  val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"
  val USE_TIMESTAMP: "USE_TIMESTAMP" = "USE_TIMESTAMP"

  @inline def values = js.Array[SmoothGroupEventIdMode](NO_EVENT_ID, USE_CONFIGURED, USE_TIMESTAMP)
}

/** Smooth Group Event Stop Behavior
  */
type SmoothGroupEventStopBehavior = "NONE" | "SEND_EOS"
object SmoothGroupEventStopBehavior {
  val NONE: "NONE" = "NONE"
  val SEND_EOS: "SEND_EOS" = "SEND_EOS"

  @inline def values = js.Array[SmoothGroupEventStopBehavior](NONE, SEND_EOS)
}

/** Smooth Group Segmentation Mode
  */
type SmoothGroupSegmentationMode = "USE_INPUT_SEGMENTATION" | "USE_SEGMENT_DURATION"
object SmoothGroupSegmentationMode {
  val USE_INPUT_SEGMENTATION: "USE_INPUT_SEGMENTATION" = "USE_INPUT_SEGMENTATION"
  val USE_SEGMENT_DURATION: "USE_SEGMENT_DURATION" = "USE_SEGMENT_DURATION"

  @inline def values = js.Array[SmoothGroupSegmentationMode](USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION)
}

/** Smooth Group Sparse Track Type
  */
type SmoothGroupSparseTrackType = "NONE" | "SCTE_35" | "SCTE_35_WITHOUT_SEGMENTATION"
object SmoothGroupSparseTrackType {
  val NONE: "NONE" = "NONE"
  val SCTE_35: "SCTE_35" = "SCTE_35"
  val SCTE_35_WITHOUT_SEGMENTATION: "SCTE_35_WITHOUT_SEGMENTATION" = "SCTE_35_WITHOUT_SEGMENTATION"

  @inline def values = js.Array[SmoothGroupSparseTrackType](NONE, SCTE_35, SCTE_35_WITHOUT_SEGMENTATION)
}

/** Smooth Group Stream Manifest Behavior
  */
type SmoothGroupStreamManifestBehavior = "DO_NOT_SEND" | "SEND"
object SmoothGroupStreamManifestBehavior {
  val DO_NOT_SEND: "DO_NOT_SEND" = "DO_NOT_SEND"
  val SEND: "SEND" = "SEND"

  @inline def values = js.Array[SmoothGroupStreamManifestBehavior](DO_NOT_SEND, SEND)
}

/** Smooth Group Timestamp Offset Mode
  */
type SmoothGroupTimestampOffsetMode = "USE_CONFIGURED_OFFSET" | "USE_EVENT_START_DATE"
object SmoothGroupTimestampOffsetMode {
  val USE_CONFIGURED_OFFSET: "USE_CONFIGURED_OFFSET" = "USE_CONFIGURED_OFFSET"
  val USE_EVENT_START_DATE: "USE_EVENT_START_DATE" = "USE_EVENT_START_DATE"

  @inline def values = js.Array[SmoothGroupTimestampOffsetMode](USE_CONFIGURED_OFFSET, USE_EVENT_START_DATE)
}

/** Smpte2038 Data Preference
  */
type Smpte2038DataPreference = "IGNORE" | "PREFER"
object Smpte2038DataPreference {
  val IGNORE: "IGNORE" = "IGNORE"
  val PREFER: "PREFER" = "PREFER"

  @inline def values = js.Array[Smpte2038DataPreference](IGNORE, PREFER)
}

/** Temporal Filter Post Filter Sharpening
  */
type TemporalFilterPostFilterSharpening = "AUTO" | "DISABLED" | "ENABLED"
object TemporalFilterPostFilterSharpening {
  val AUTO: "AUTO" = "AUTO"
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[TemporalFilterPostFilterSharpening](AUTO, DISABLED, ENABLED)
}

/** Temporal Filter Strength
  */
type TemporalFilterStrength = "AUTO" | "STRENGTH_1" | "STRENGTH_2" | "STRENGTH_3" | "STRENGTH_4" | "STRENGTH_5" | "STRENGTH_6" | "STRENGTH_7" | "STRENGTH_8" | "STRENGTH_9" | "STRENGTH_10" | "STRENGTH_11" | "STRENGTH_12" | "STRENGTH_13" | "STRENGTH_14" | "STRENGTH_15" | "STRENGTH_16"
object TemporalFilterStrength {
  val AUTO: "AUTO" = "AUTO"
  val STRENGTH_1: "STRENGTH_1" = "STRENGTH_1"
  val STRENGTH_2: "STRENGTH_2" = "STRENGTH_2"
  val STRENGTH_3: "STRENGTH_3" = "STRENGTH_3"
  val STRENGTH_4: "STRENGTH_4" = "STRENGTH_4"
  val STRENGTH_5: "STRENGTH_5" = "STRENGTH_5"
  val STRENGTH_6: "STRENGTH_6" = "STRENGTH_6"
  val STRENGTH_7: "STRENGTH_7" = "STRENGTH_7"
  val STRENGTH_8: "STRENGTH_8" = "STRENGTH_8"
  val STRENGTH_9: "STRENGTH_9" = "STRENGTH_9"
  val STRENGTH_10: "STRENGTH_10" = "STRENGTH_10"
  val STRENGTH_11: "STRENGTH_11" = "STRENGTH_11"
  val STRENGTH_12: "STRENGTH_12" = "STRENGTH_12"
  val STRENGTH_13: "STRENGTH_13" = "STRENGTH_13"
  val STRENGTH_14: "STRENGTH_14" = "STRENGTH_14"
  val STRENGTH_15: "STRENGTH_15" = "STRENGTH_15"
  val STRENGTH_16: "STRENGTH_16" = "STRENGTH_16"

  @inline def values = js.Array[TemporalFilterStrength](
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
type TimecodeConfigSource = "EMBEDDED" | "SYSTEMCLOCK" | "ZEROBASED"
object TimecodeConfigSource {
  val EMBEDDED: "EMBEDDED" = "EMBEDDED"
  val SYSTEMCLOCK: "SYSTEMCLOCK" = "SYSTEMCLOCK"
  val ZEROBASED: "ZEROBASED" = "ZEROBASED"

  @inline def values = js.Array[TimecodeConfigSource](EMBEDDED, SYSTEMCLOCK, ZEROBASED)
}

/** Ttml Destination Style Control
  */
type TtmlDestinationStyleControl = "PASSTHROUGH" | "USE_CONFIGURED"
object TtmlDestinationStyleControl {
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"
  val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"

  @inline def values = js.Array[TtmlDestinationStyleControl](PASSTHROUGH, USE_CONFIGURED)
}

/** Udp Timed Metadata Id3 Frame
  */
type UdpTimedMetadataId3Frame = "NONE" | "PRIV" | "TDRL"
object UdpTimedMetadataId3Frame {
  val NONE: "NONE" = "NONE"
  val PRIV: "PRIV" = "PRIV"
  val TDRL: "TDRL" = "TDRL"

  @inline def values = js.Array[UdpTimedMetadataId3Frame](NONE, PRIV, TDRL)
}

/** Video Description Respond To Afd
  */
type VideoDescriptionRespondToAfd = "NONE" | "PASSTHROUGH" | "RESPOND"
object VideoDescriptionRespondToAfd {
  val NONE: "NONE" = "NONE"
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"
  val RESPOND: "RESPOND" = "RESPOND"

  @inline def values = js.Array[VideoDescriptionRespondToAfd](NONE, PASSTHROUGH, RESPOND)
}

/** Video Description Scaling Behavior
  */
type VideoDescriptionScalingBehavior = "DEFAULT" | "STRETCH_TO_OUTPUT"
object VideoDescriptionScalingBehavior {
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val STRETCH_TO_OUTPUT: "STRETCH_TO_OUTPUT" = "STRETCH_TO_OUTPUT"

  @inline def values = js.Array[VideoDescriptionScalingBehavior](DEFAULT, STRETCH_TO_OUTPUT)
}

/** Video Selector Color Space
  */
type VideoSelectorColorSpace = "FOLLOW" | "HDR10" | "HLG_2020" | "REC_601" | "REC_709"
object VideoSelectorColorSpace {
  val FOLLOW: "FOLLOW" = "FOLLOW"
  val HDR10: "HDR10" = "HDR10"
  val HLG_2020: "HLG_2020" = "HLG_2020"
  val REC_601: "REC_601" = "REC_601"
  val REC_709: "REC_709" = "REC_709"

  @inline def values = js.Array[VideoSelectorColorSpace](FOLLOW, HDR10, HLG_2020, REC_601, REC_709)
}

/** Video Selector Color Space Usage
  */
type VideoSelectorColorSpaceUsage = "FALLBACK" | "FORCE"
object VideoSelectorColorSpaceUsage {
  val FALLBACK: "FALLBACK" = "FALLBACK"
  val FORCE: "FORCE" = "FORCE"

  @inline def values = js.Array[VideoSelectorColorSpaceUsage](FALLBACK, FORCE)
}

/** Wav Coding Mode
  */
type WavCodingMode = "CODING_MODE_1_0" | "CODING_MODE_2_0" | "CODING_MODE_4_0" | "CODING_MODE_8_0"
object WavCodingMode {
  val CODING_MODE_1_0: "CODING_MODE_1_0" = "CODING_MODE_1_0"
  val CODING_MODE_2_0: "CODING_MODE_2_0" = "CODING_MODE_2_0"
  val CODING_MODE_4_0: "CODING_MODE_4_0" = "CODING_MODE_4_0"
  val CODING_MODE_8_0: "CODING_MODE_8_0" = "CODING_MODE_8_0"

  @inline def values = js.Array[WavCodingMode](CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_4_0, CODING_MODE_8_0)
}
