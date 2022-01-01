package facade.amazonaws.services.medialive

import scalajs.js

/** Aac Coding Mode
  */
type AacCodingMode = "AD_RECEIVER_MIX" | "CODING_MODE_1_0" | "CODING_MODE_1_1" | "CODING_MODE_2_0" | "CODING_MODE_5_1"
object AacCodingMode {
  inline val AD_RECEIVER_MIX: "AD_RECEIVER_MIX" = "AD_RECEIVER_MIX"
  inline val CODING_MODE_1_0: "CODING_MODE_1_0" = "CODING_MODE_1_0"
  inline val CODING_MODE_1_1: "CODING_MODE_1_1" = "CODING_MODE_1_1"
  inline val CODING_MODE_2_0: "CODING_MODE_2_0" = "CODING_MODE_2_0"
  inline val CODING_MODE_5_1: "CODING_MODE_5_1" = "CODING_MODE_5_1"

  inline def values: js.Array[AacCodingMode] = js.Array(AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0, CODING_MODE_5_1)
}

/** Aac Input Type
  */
type AacInputType = "BROADCASTER_MIXED_AD" | "NORMAL"
object AacInputType {
  inline val BROADCASTER_MIXED_AD: "BROADCASTER_MIXED_AD" = "BROADCASTER_MIXED_AD"
  inline val NORMAL: "NORMAL" = "NORMAL"

  inline def values: js.Array[AacInputType] = js.Array(BROADCASTER_MIXED_AD, NORMAL)
}

/** Aac Profile
  */
type AacProfile = "HEV1" | "HEV2" | "LC"
object AacProfile {
  inline val HEV1: "HEV1" = "HEV1"
  inline val HEV2: "HEV2" = "HEV2"
  inline val LC: "LC" = "LC"

  inline def values: js.Array[AacProfile] = js.Array(HEV1, HEV2, LC)
}

/** Aac Rate Control Mode
  */
type AacRateControlMode = "CBR" | "VBR"
object AacRateControlMode {
  inline val CBR: "CBR" = "CBR"
  inline val VBR: "VBR" = "VBR"

  inline def values: js.Array[AacRateControlMode] = js.Array(CBR, VBR)
}

/** Aac Raw Format
  */
type AacRawFormat = "LATM_LOAS" | "NONE"
object AacRawFormat {
  inline val LATM_LOAS: "LATM_LOAS" = "LATM_LOAS"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[AacRawFormat] = js.Array(LATM_LOAS, NONE)
}

/** Aac Spec
  */
type AacSpec = "MPEG2" | "MPEG4"
object AacSpec {
  inline val MPEG2: "MPEG2" = "MPEG2"
  inline val MPEG4: "MPEG4" = "MPEG4"

  inline def values: js.Array[AacSpec] = js.Array(MPEG2, MPEG4)
}

/** Aac Vbr Quality
  */
type AacVbrQuality = "HIGH" | "LOW" | "MEDIUM_HIGH" | "MEDIUM_LOW"
object AacVbrQuality {
  inline val HIGH: "HIGH" = "HIGH"
  inline val LOW: "LOW" = "LOW"
  inline val MEDIUM_HIGH: "MEDIUM_HIGH" = "MEDIUM_HIGH"
  inline val MEDIUM_LOW: "MEDIUM_LOW" = "MEDIUM_LOW"

  inline def values: js.Array[AacVbrQuality] = js.Array(HIGH, LOW, MEDIUM_HIGH, MEDIUM_LOW)
}

/** Ac3 Bitstream Mode
  */
type Ac3BitstreamMode = "COMMENTARY" | "COMPLETE_MAIN" | "DIALOGUE" | "EMERGENCY" | "HEARING_IMPAIRED" | "MUSIC_AND_EFFECTS" | "VISUALLY_IMPAIRED" | "VOICE_OVER"
object Ac3BitstreamMode {
  inline val COMMENTARY: "COMMENTARY" = "COMMENTARY"
  inline val COMPLETE_MAIN: "COMPLETE_MAIN" = "COMPLETE_MAIN"
  inline val DIALOGUE: "DIALOGUE" = "DIALOGUE"
  inline val EMERGENCY: "EMERGENCY" = "EMERGENCY"
  inline val HEARING_IMPAIRED: "HEARING_IMPAIRED" = "HEARING_IMPAIRED"
  inline val MUSIC_AND_EFFECTS: "MUSIC_AND_EFFECTS" = "MUSIC_AND_EFFECTS"
  inline val VISUALLY_IMPAIRED: "VISUALLY_IMPAIRED" = "VISUALLY_IMPAIRED"
  inline val VOICE_OVER: "VOICE_OVER" = "VOICE_OVER"

  inline def values: js.Array[Ac3BitstreamMode] = js.Array(COMMENTARY, COMPLETE_MAIN, DIALOGUE, EMERGENCY, HEARING_IMPAIRED, MUSIC_AND_EFFECTS, VISUALLY_IMPAIRED, VOICE_OVER)
}

/** Ac3 Coding Mode
  */
type Ac3CodingMode = "CODING_MODE_1_0" | "CODING_MODE_1_1" | "CODING_MODE_2_0" | "CODING_MODE_3_2_LFE"
object Ac3CodingMode {
  inline val CODING_MODE_1_0: "CODING_MODE_1_0" = "CODING_MODE_1_0"
  inline val CODING_MODE_1_1: "CODING_MODE_1_1" = "CODING_MODE_1_1"
  inline val CODING_MODE_2_0: "CODING_MODE_2_0" = "CODING_MODE_2_0"
  inline val CODING_MODE_3_2_LFE: "CODING_MODE_3_2_LFE" = "CODING_MODE_3_2_LFE"

  inline def values: js.Array[Ac3CodingMode] = js.Array(CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0, CODING_MODE_3_2_LFE)
}

/** Ac3 Drc Profile
  */
type Ac3DrcProfile = "FILM_STANDARD" | "NONE"
object Ac3DrcProfile {
  inline val FILM_STANDARD: "FILM_STANDARD" = "FILM_STANDARD"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[Ac3DrcProfile] = js.Array(FILM_STANDARD, NONE)
}

/** Ac3 Lfe Filter
  */
type Ac3LfeFilter = "DISABLED" | "ENABLED"
object Ac3LfeFilter {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[Ac3LfeFilter] = js.Array(DISABLED, ENABLED)
}

/** Ac3 Metadata Control
  */
type Ac3MetadataControl = "FOLLOW_INPUT" | "USE_CONFIGURED"
object Ac3MetadataControl {
  inline val FOLLOW_INPUT: "FOLLOW_INPUT" = "FOLLOW_INPUT"
  inline val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"

  inline def values: js.Array[Ac3MetadataControl] = js.Array(FOLLOW_INPUT, USE_CONFIGURED)
}

/** The HTTP Accept header. Indicates the requested type fothe thumbnail.
  */
type AcceptHeader = "image/jpeg"
object AcceptHeader {
  inline val `image/jpeg`: "image/jpeg" = "image/jpeg"

  inline def values: js.Array[AcceptHeader] = js.Array(`image/jpeg`)
}

/** Afd Signaling
  */
type AfdSignaling = "AUTO" | "FIXED" | "NONE"
object AfdSignaling {
  inline val AUTO: "AUTO" = "AUTO"
  inline val FIXED: "FIXED" = "FIXED"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[AfdSignaling] = js.Array(AUTO, FIXED, NONE)
}

/** Audio Description Audio Type Control
  */
type AudioDescriptionAudioTypeControl = "FOLLOW_INPUT" | "USE_CONFIGURED"
object AudioDescriptionAudioTypeControl {
  inline val FOLLOW_INPUT: "FOLLOW_INPUT" = "FOLLOW_INPUT"
  inline val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"

  inline def values: js.Array[AudioDescriptionAudioTypeControl] = js.Array(FOLLOW_INPUT, USE_CONFIGURED)
}

/** Audio Description Language Code Control
  */
type AudioDescriptionLanguageCodeControl = "FOLLOW_INPUT" | "USE_CONFIGURED"
object AudioDescriptionLanguageCodeControl {
  inline val FOLLOW_INPUT: "FOLLOW_INPUT" = "FOLLOW_INPUT"
  inline val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"

  inline def values: js.Array[AudioDescriptionLanguageCodeControl] = js.Array(FOLLOW_INPUT, USE_CONFIGURED)
}

/** Audio Language Selection Policy
  */
type AudioLanguageSelectionPolicy = "LOOSE" | "STRICT"
object AudioLanguageSelectionPolicy {
  inline val LOOSE: "LOOSE" = "LOOSE"
  inline val STRICT: "STRICT" = "STRICT"

  inline def values: js.Array[AudioLanguageSelectionPolicy] = js.Array(LOOSE, STRICT)
}

/** Audio Normalization Algorithm
  */
type AudioNormalizationAlgorithm = "ITU_1770_1" | "ITU_1770_2"
object AudioNormalizationAlgorithm {
  inline val ITU_1770_1: "ITU_1770_1" = "ITU_1770_1"
  inline val ITU_1770_2: "ITU_1770_2" = "ITU_1770_2"

  inline def values: js.Array[AudioNormalizationAlgorithm] = js.Array(ITU_1770_1, ITU_1770_2)
}

/** Audio Normalization Algorithm Control
  */
type AudioNormalizationAlgorithmControl = "CORRECT_AUDIO"
object AudioNormalizationAlgorithmControl {
  inline val CORRECT_AUDIO: "CORRECT_AUDIO" = "CORRECT_AUDIO"

  inline def values: js.Array[AudioNormalizationAlgorithmControl] = js.Array(CORRECT_AUDIO)
}

/** Audio Only Hls Segment Type
  */
type AudioOnlyHlsSegmentType = "AAC" | "FMP4"
object AudioOnlyHlsSegmentType {
  inline val AAC: "AAC" = "AAC"
  inline val FMP4: "FMP4" = "FMP4"

  inline def values: js.Array[AudioOnlyHlsSegmentType] = js.Array(AAC, FMP4)
}

/** Audio Only Hls Track Type
  */
type AudioOnlyHlsTrackType = "ALTERNATE_AUDIO_AUTO_SELECT" | "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT" | "ALTERNATE_AUDIO_NOT_AUTO_SELECT" | "AUDIO_ONLY_VARIANT_STREAM"
object AudioOnlyHlsTrackType {
  inline val ALTERNATE_AUDIO_AUTO_SELECT: "ALTERNATE_AUDIO_AUTO_SELECT" = "ALTERNATE_AUDIO_AUTO_SELECT"
  inline val ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT: "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT" = "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT"
  inline val ALTERNATE_AUDIO_NOT_AUTO_SELECT: "ALTERNATE_AUDIO_NOT_AUTO_SELECT" = "ALTERNATE_AUDIO_NOT_AUTO_SELECT"
  inline val AUDIO_ONLY_VARIANT_STREAM: "AUDIO_ONLY_VARIANT_STREAM" = "AUDIO_ONLY_VARIANT_STREAM"

  inline def values: js.Array[AudioOnlyHlsTrackType] = js.Array(ALTERNATE_AUDIO_AUTO_SELECT, ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT, ALTERNATE_AUDIO_NOT_AUTO_SELECT, AUDIO_ONLY_VARIANT_STREAM)
}

/** Audio Type
  */
type AudioType = "CLEAN_EFFECTS" | "HEARING_IMPAIRED" | "UNDEFINED" | "VISUAL_IMPAIRED_COMMENTARY"
object AudioType {
  inline val CLEAN_EFFECTS: "CLEAN_EFFECTS" = "CLEAN_EFFECTS"
  inline val HEARING_IMPAIRED: "HEARING_IMPAIRED" = "HEARING_IMPAIRED"
  inline val UNDEFINED: "UNDEFINED" = "UNDEFINED"
  inline val VISUAL_IMPAIRED_COMMENTARY: "VISUAL_IMPAIRED_COMMENTARY" = "VISUAL_IMPAIRED_COMMENTARY"

  inline def values: js.Array[AudioType] = js.Array(CLEAN_EFFECTS, HEARING_IMPAIRED, UNDEFINED, VISUAL_IMPAIRED_COMMENTARY)
}

/** Authentication Scheme
  */
type AuthenticationScheme = "AKAMAI" | "COMMON"
object AuthenticationScheme {
  inline val AKAMAI: "AKAMAI" = "AKAMAI"
  inline val COMMON: "COMMON" = "COMMON"

  inline def values: js.Array[AuthenticationScheme] = js.Array(AKAMAI, COMMON)
}

/** Avail Blanking State
  */
type AvailBlankingState = "DISABLED" | "ENABLED"
object AvailBlankingState {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[AvailBlankingState] = js.Array(DISABLED, ENABLED)
}

/** Blackout Slate Network End Blackout
  */
type BlackoutSlateNetworkEndBlackout = "DISABLED" | "ENABLED"
object BlackoutSlateNetworkEndBlackout {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[BlackoutSlateNetworkEndBlackout] = js.Array(DISABLED, ENABLED)
}

/** Blackout Slate State
  */
type BlackoutSlateState = "DISABLED" | "ENABLED"
object BlackoutSlateState {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[BlackoutSlateState] = js.Array(DISABLED, ENABLED)
}

/** Burn In Alignment
  */
type BurnInAlignment = "CENTERED" | "LEFT" | "SMART"
object BurnInAlignment {
  inline val CENTERED: "CENTERED" = "CENTERED"
  inline val LEFT: "LEFT" = "LEFT"
  inline val SMART: "SMART" = "SMART"

  inline def values: js.Array[BurnInAlignment] = js.Array(CENTERED, LEFT, SMART)
}

/** Burn In Background Color
  */
type BurnInBackgroundColor = "BLACK" | "NONE" | "WHITE"
object BurnInBackgroundColor {
  inline val BLACK: "BLACK" = "BLACK"
  inline val NONE: "NONE" = "NONE"
  inline val WHITE: "WHITE" = "WHITE"

  inline def values: js.Array[BurnInBackgroundColor] = js.Array(BLACK, NONE, WHITE)
}

/** Burn In Font Color
  */
type BurnInFontColor = "BLACK" | "BLUE" | "GREEN" | "RED" | "WHITE" | "YELLOW"
object BurnInFontColor {
  inline val BLACK: "BLACK" = "BLACK"
  inline val BLUE: "BLUE" = "BLUE"
  inline val GREEN: "GREEN" = "GREEN"
  inline val RED: "RED" = "RED"
  inline val WHITE: "WHITE" = "WHITE"
  inline val YELLOW: "YELLOW" = "YELLOW"

  inline def values: js.Array[BurnInFontColor] = js.Array(BLACK, BLUE, GREEN, RED, WHITE, YELLOW)
}

/** Burn In Outline Color
  */
type BurnInOutlineColor = "BLACK" | "BLUE" | "GREEN" | "RED" | "WHITE" | "YELLOW"
object BurnInOutlineColor {
  inline val BLACK: "BLACK" = "BLACK"
  inline val BLUE: "BLUE" = "BLUE"
  inline val GREEN: "GREEN" = "GREEN"
  inline val RED: "RED" = "RED"
  inline val WHITE: "WHITE" = "WHITE"
  inline val YELLOW: "YELLOW" = "YELLOW"

  inline def values: js.Array[BurnInOutlineColor] = js.Array(BLACK, BLUE, GREEN, RED, WHITE, YELLOW)
}

/** Burn In Shadow Color
  */
type BurnInShadowColor = "BLACK" | "NONE" | "WHITE"
object BurnInShadowColor {
  inline val BLACK: "BLACK" = "BLACK"
  inline val NONE: "NONE" = "NONE"
  inline val WHITE: "WHITE" = "WHITE"

  inline def values: js.Array[BurnInShadowColor] = js.Array(BLACK, NONE, WHITE)
}

/** Burn In Teletext Grid Control
  */
type BurnInTeletextGridControl = "FIXED" | "SCALED"
object BurnInTeletextGridControl {
  inline val FIXED: "FIXED" = "FIXED"
  inline val SCALED: "SCALED" = "SCALED"

  inline def values: js.Array[BurnInTeletextGridControl] = js.Array(FIXED, SCALED)
}

/** Maximum CDI input resolution; SD is 480i and 576i up to 30 frames-per-second (fps), HD is 720p up to 60 fps / 1080i up to 30 fps, FHD is 1080p up to 60 fps, UHD is 2160p up to 60 fps
  */
type CdiInputResolution = "SD" | "HD" | "FHD" | "UHD"
object CdiInputResolution {
  inline val SD: "SD" = "SD"
  inline val HD: "HD" = "HD"
  inline val FHD: "FHD" = "FHD"
  inline val UHD: "UHD" = "UHD"

  inline def values: js.Array[CdiInputResolution] = js.Array(SD, HD, FHD, UHD)
}

/** A standard channel has two encoding pipelines and a single pipeline channel only has one.
  */
type ChannelClass = "STANDARD" | "SINGLE_PIPELINE"
object ChannelClass {
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val SINGLE_PIPELINE: "SINGLE_PIPELINE" = "SINGLE_PIPELINE"

  inline def values: js.Array[ChannelClass] = js.Array(STANDARD, SINGLE_PIPELINE)
}

/** Placeholder documentation for ChannelState
  */
type ChannelState = "CREATING" | "CREATE_FAILED" | "IDLE" | "STARTING" | "RUNNING" | "RECOVERING" | "STOPPING" | "DELETING" | "DELETED" | "UPDATING" | "UPDATE_FAILED"
object ChannelState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val IDLE: "IDLE" = "IDLE"
  inline val STARTING: "STARTING" = "STARTING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val RECOVERING: "RECOVERING" = "RECOVERING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  inline def values: js.Array[ChannelState] = js.Array(CREATING, CREATE_FAILED, IDLE, STARTING, RUNNING, RECOVERING, STOPPING, DELETING, DELETED, UPDATING, UPDATE_FAILED)
}

/** Specifies the media type of the thumbnail.
  */
type ContentType = "image/jpeg"
object ContentType {
  inline val `image/jpeg`: "image/jpeg" = "image/jpeg"

  inline def values: js.Array[ContentType] = js.Array(`image/jpeg`)
}

/** The status of the action to synchronize the device configuration. If you change the configuration of the input device (for example, the maximum bitrate), MediaLive sends the new data to the device. The device might not update itself immediately. SYNCED means the device has updated its configuration. SYNCING means that it has not updated its configuration.
  */
type DeviceSettingsSyncState = "SYNCED" | "SYNCING"
object DeviceSettingsSyncState {
  inline val SYNCED: "SYNCED" = "SYNCED"
  inline val SYNCING: "SYNCING" = "SYNCING"

  inline def values: js.Array[DeviceSettingsSyncState] = js.Array(SYNCED, SYNCING)
}

/** The status of software on the input device.
  */
type DeviceUpdateStatus = "UP_TO_DATE" | "NOT_UP_TO_DATE"
object DeviceUpdateStatus {
  inline val UP_TO_DATE: "UP_TO_DATE" = "UP_TO_DATE"
  inline val NOT_UP_TO_DATE: "NOT_UP_TO_DATE" = "NOT_UP_TO_DATE"

  inline def values: js.Array[DeviceUpdateStatus] = js.Array(UP_TO_DATE, NOT_UP_TO_DATE)
}

/** Dvb Sdt Output Sdt
  */
type DvbSdtOutputSdt = "SDT_FOLLOW" | "SDT_FOLLOW_IF_PRESENT" | "SDT_MANUAL" | "SDT_NONE"
object DvbSdtOutputSdt {
  inline val SDT_FOLLOW: "SDT_FOLLOW" = "SDT_FOLLOW"
  inline val SDT_FOLLOW_IF_PRESENT: "SDT_FOLLOW_IF_PRESENT" = "SDT_FOLLOW_IF_PRESENT"
  inline val SDT_MANUAL: "SDT_MANUAL" = "SDT_MANUAL"
  inline val SDT_NONE: "SDT_NONE" = "SDT_NONE"

  inline def values: js.Array[DvbSdtOutputSdt] = js.Array(SDT_FOLLOW, SDT_FOLLOW_IF_PRESENT, SDT_MANUAL, SDT_NONE)
}

/** Dvb Sub Destination Alignment
  */
type DvbSubDestinationAlignment = "CENTERED" | "LEFT" | "SMART"
object DvbSubDestinationAlignment {
  inline val CENTERED: "CENTERED" = "CENTERED"
  inline val LEFT: "LEFT" = "LEFT"
  inline val SMART: "SMART" = "SMART"

  inline def values: js.Array[DvbSubDestinationAlignment] = js.Array(CENTERED, LEFT, SMART)
}

/** Dvb Sub Destination Background Color
  */
type DvbSubDestinationBackgroundColor = "BLACK" | "NONE" | "WHITE"
object DvbSubDestinationBackgroundColor {
  inline val BLACK: "BLACK" = "BLACK"
  inline val NONE: "NONE" = "NONE"
  inline val WHITE: "WHITE" = "WHITE"

  inline def values: js.Array[DvbSubDestinationBackgroundColor] = js.Array(BLACK, NONE, WHITE)
}

/** Dvb Sub Destination Font Color
  */
type DvbSubDestinationFontColor = "BLACK" | "BLUE" | "GREEN" | "RED" | "WHITE" | "YELLOW"
object DvbSubDestinationFontColor {
  inline val BLACK: "BLACK" = "BLACK"
  inline val BLUE: "BLUE" = "BLUE"
  inline val GREEN: "GREEN" = "GREEN"
  inline val RED: "RED" = "RED"
  inline val WHITE: "WHITE" = "WHITE"
  inline val YELLOW: "YELLOW" = "YELLOW"

  inline def values: js.Array[DvbSubDestinationFontColor] = js.Array(BLACK, BLUE, GREEN, RED, WHITE, YELLOW)
}

/** Dvb Sub Destination Outline Color
  */
type DvbSubDestinationOutlineColor = "BLACK" | "BLUE" | "GREEN" | "RED" | "WHITE" | "YELLOW"
object DvbSubDestinationOutlineColor {
  inline val BLACK: "BLACK" = "BLACK"
  inline val BLUE: "BLUE" = "BLUE"
  inline val GREEN: "GREEN" = "GREEN"
  inline val RED: "RED" = "RED"
  inline val WHITE: "WHITE" = "WHITE"
  inline val YELLOW: "YELLOW" = "YELLOW"

  inline def values: js.Array[DvbSubDestinationOutlineColor] = js.Array(BLACK, BLUE, GREEN, RED, WHITE, YELLOW)
}

/** Dvb Sub Destination Shadow Color
  */
type DvbSubDestinationShadowColor = "BLACK" | "NONE" | "WHITE"
object DvbSubDestinationShadowColor {
  inline val BLACK: "BLACK" = "BLACK"
  inline val NONE: "NONE" = "NONE"
  inline val WHITE: "WHITE" = "WHITE"

  inline def values: js.Array[DvbSubDestinationShadowColor] = js.Array(BLACK, NONE, WHITE)
}

/** Dvb Sub Destination Teletext Grid Control
  */
type DvbSubDestinationTeletextGridControl = "FIXED" | "SCALED"
object DvbSubDestinationTeletextGridControl {
  inline val FIXED: "FIXED" = "FIXED"
  inline val SCALED: "SCALED" = "SCALED"

  inline def values: js.Array[DvbSubDestinationTeletextGridControl] = js.Array(FIXED, SCALED)
}

/** Dvb Sub Ocr Language
  */
type DvbSubOcrLanguage = "DEU" | "ENG" | "FRA" | "NLD" | "POR" | "SPA"
object DvbSubOcrLanguage {
  inline val DEU: "DEU" = "DEU"
  inline val ENG: "ENG" = "ENG"
  inline val FRA: "FRA" = "FRA"
  inline val NLD: "NLD" = "NLD"
  inline val POR: "POR" = "POR"
  inline val SPA: "SPA" = "SPA"

  inline def values: js.Array[DvbSubOcrLanguage] = js.Array(DEU, ENG, FRA, NLD, POR, SPA)
}

/** Eac3 Attenuation Control
  */
type Eac3AttenuationControl = "ATTENUATE_3_DB" | "NONE"
object Eac3AttenuationControl {
  inline val ATTENUATE_3_DB: "ATTENUATE_3_DB" = "ATTENUATE_3_DB"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[Eac3AttenuationControl] = js.Array(ATTENUATE_3_DB, NONE)
}

/** Eac3 Bitstream Mode
  */
type Eac3BitstreamMode = "COMMENTARY" | "COMPLETE_MAIN" | "EMERGENCY" | "HEARING_IMPAIRED" | "VISUALLY_IMPAIRED"
object Eac3BitstreamMode {
  inline val COMMENTARY: "COMMENTARY" = "COMMENTARY"
  inline val COMPLETE_MAIN: "COMPLETE_MAIN" = "COMPLETE_MAIN"
  inline val EMERGENCY: "EMERGENCY" = "EMERGENCY"
  inline val HEARING_IMPAIRED: "HEARING_IMPAIRED" = "HEARING_IMPAIRED"
  inline val VISUALLY_IMPAIRED: "VISUALLY_IMPAIRED" = "VISUALLY_IMPAIRED"

  inline def values: js.Array[Eac3BitstreamMode] = js.Array(COMMENTARY, COMPLETE_MAIN, EMERGENCY, HEARING_IMPAIRED, VISUALLY_IMPAIRED)
}

/** Eac3 Coding Mode
  */
type Eac3CodingMode = "CODING_MODE_1_0" | "CODING_MODE_2_0" | "CODING_MODE_3_2"
object Eac3CodingMode {
  inline val CODING_MODE_1_0: "CODING_MODE_1_0" = "CODING_MODE_1_0"
  inline val CODING_MODE_2_0: "CODING_MODE_2_0" = "CODING_MODE_2_0"
  inline val CODING_MODE_3_2: "CODING_MODE_3_2" = "CODING_MODE_3_2"

  inline def values: js.Array[Eac3CodingMode] = js.Array(CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_3_2)
}

/** Eac3 Dc Filter
  */
type Eac3DcFilter = "DISABLED" | "ENABLED"
object Eac3DcFilter {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[Eac3DcFilter] = js.Array(DISABLED, ENABLED)
}

/** Eac3 Drc Line
  */
type Eac3DrcLine = "FILM_LIGHT" | "FILM_STANDARD" | "MUSIC_LIGHT" | "MUSIC_STANDARD" | "NONE" | "SPEECH"
object Eac3DrcLine {
  inline val FILM_LIGHT: "FILM_LIGHT" = "FILM_LIGHT"
  inline val FILM_STANDARD: "FILM_STANDARD" = "FILM_STANDARD"
  inline val MUSIC_LIGHT: "MUSIC_LIGHT" = "MUSIC_LIGHT"
  inline val MUSIC_STANDARD: "MUSIC_STANDARD" = "MUSIC_STANDARD"
  inline val NONE: "NONE" = "NONE"
  inline val SPEECH: "SPEECH" = "SPEECH"

  inline def values: js.Array[Eac3DrcLine] = js.Array(FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT, MUSIC_STANDARD, NONE, SPEECH)
}

/** Eac3 Drc Rf
  */
type Eac3DrcRf = "FILM_LIGHT" | "FILM_STANDARD" | "MUSIC_LIGHT" | "MUSIC_STANDARD" | "NONE" | "SPEECH"
object Eac3DrcRf {
  inline val FILM_LIGHT: "FILM_LIGHT" = "FILM_LIGHT"
  inline val FILM_STANDARD: "FILM_STANDARD" = "FILM_STANDARD"
  inline val MUSIC_LIGHT: "MUSIC_LIGHT" = "MUSIC_LIGHT"
  inline val MUSIC_STANDARD: "MUSIC_STANDARD" = "MUSIC_STANDARD"
  inline val NONE: "NONE" = "NONE"
  inline val SPEECH: "SPEECH" = "SPEECH"

  inline def values: js.Array[Eac3DrcRf] = js.Array(FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT, MUSIC_STANDARD, NONE, SPEECH)
}

/** Eac3 Lfe Control
  */
type Eac3LfeControl = "LFE" | "NO_LFE"
object Eac3LfeControl {
  inline val LFE: "LFE" = "LFE"
  inline val NO_LFE: "NO_LFE" = "NO_LFE"

  inline def values: js.Array[Eac3LfeControl] = js.Array(LFE, NO_LFE)
}

/** Eac3 Lfe Filter
  */
type Eac3LfeFilter = "DISABLED" | "ENABLED"
object Eac3LfeFilter {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[Eac3LfeFilter] = js.Array(DISABLED, ENABLED)
}

/** Eac3 Metadata Control
  */
type Eac3MetadataControl = "FOLLOW_INPUT" | "USE_CONFIGURED"
object Eac3MetadataControl {
  inline val FOLLOW_INPUT: "FOLLOW_INPUT" = "FOLLOW_INPUT"
  inline val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"

  inline def values: js.Array[Eac3MetadataControl] = js.Array(FOLLOW_INPUT, USE_CONFIGURED)
}

/** Eac3 Passthrough Control
  */
type Eac3PassthroughControl = "NO_PASSTHROUGH" | "WHEN_POSSIBLE"
object Eac3PassthroughControl {
  inline val NO_PASSTHROUGH: "NO_PASSTHROUGH" = "NO_PASSTHROUGH"
  inline val WHEN_POSSIBLE: "WHEN_POSSIBLE" = "WHEN_POSSIBLE"

  inline def values: js.Array[Eac3PassthroughControl] = js.Array(NO_PASSTHROUGH, WHEN_POSSIBLE)
}

/** Eac3 Phase Control
  */
type Eac3PhaseControl = "NO_SHIFT" | "SHIFT_90_DEGREES"
object Eac3PhaseControl {
  inline val NO_SHIFT: "NO_SHIFT" = "NO_SHIFT"
  inline val SHIFT_90_DEGREES: "SHIFT_90_DEGREES" = "SHIFT_90_DEGREES"

  inline def values: js.Array[Eac3PhaseControl] = js.Array(NO_SHIFT, SHIFT_90_DEGREES)
}

/** Eac3 Stereo Downmix
  */
type Eac3StereoDownmix = "DPL2" | "LO_RO" | "LT_RT" | "NOT_INDICATED"
object Eac3StereoDownmix {
  inline val DPL2: "DPL2" = "DPL2"
  inline val LO_RO: "LO_RO" = "LO_RO"
  inline val LT_RT: "LT_RT" = "LT_RT"
  inline val NOT_INDICATED: "NOT_INDICATED" = "NOT_INDICATED"

  inline def values: js.Array[Eac3StereoDownmix] = js.Array(DPL2, LO_RO, LT_RT, NOT_INDICATED)
}

/** Eac3 Surround Ex Mode
  */
type Eac3SurroundExMode = "DISABLED" | "ENABLED" | "NOT_INDICATED"
object Eac3SurroundExMode {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val NOT_INDICATED: "NOT_INDICATED" = "NOT_INDICATED"

  inline def values: js.Array[Eac3SurroundExMode] = js.Array(DISABLED, ENABLED, NOT_INDICATED)
}

/** Eac3 Surround Mode
  */
type Eac3SurroundMode = "DISABLED" | "ENABLED" | "NOT_INDICATED"
object Eac3SurroundMode {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val NOT_INDICATED: "NOT_INDICATED" = "NOT_INDICATED"

  inline def values: js.Array[Eac3SurroundMode] = js.Array(DISABLED, ENABLED, NOT_INDICATED)
}

/** Ebu Tt DDestination Style Control
  */
type EbuTtDDestinationStyleControl = "EXCLUDE" | "INCLUDE"
object EbuTtDDestinationStyleControl {
  inline val EXCLUDE: "EXCLUDE" = "EXCLUDE"
  inline val INCLUDE: "INCLUDE" = "INCLUDE"

  inline def values: js.Array[EbuTtDDestinationStyleControl] = js.Array(EXCLUDE, INCLUDE)
}

/** Ebu Tt DFill Line Gap Control
  */
type EbuTtDFillLineGapControl = "DISABLED" | "ENABLED"
object EbuTtDFillLineGapControl {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[EbuTtDFillLineGapControl] = js.Array(DISABLED, ENABLED)
}

/** Embedded Convert608 To708
  */
type EmbeddedConvert608To708 = "DISABLED" | "UPCONVERT"
object EmbeddedConvert608To708 {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val UPCONVERT: "UPCONVERT" = "UPCONVERT"

  inline def values: js.Array[EmbeddedConvert608To708] = js.Array(DISABLED, UPCONVERT)
}

/** Embedded Scte20 Detection
  */
type EmbeddedScte20Detection = "AUTO" | "OFF"
object EmbeddedScte20Detection {
  inline val AUTO: "AUTO" = "AUTO"
  inline val OFF: "OFF" = "OFF"

  inline def values: js.Array[EmbeddedScte20Detection] = js.Array(AUTO, OFF)
}

/** Feature Activations Input Prepare Schedule Actions
  */
type FeatureActivationsInputPrepareScheduleActions = "DISABLED" | "ENABLED"
object FeatureActivationsInputPrepareScheduleActions {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[FeatureActivationsInputPrepareScheduleActions] = js.Array(DISABLED, ENABLED)
}

/** Fec Output Include Fec
  */
type FecOutputIncludeFec = "COLUMN" | "COLUMN_AND_ROW"
object FecOutputIncludeFec {
  inline val COLUMN: "COLUMN" = "COLUMN"
  inline val COLUMN_AND_ROW: "COLUMN_AND_ROW" = "COLUMN_AND_ROW"

  inline def values: js.Array[FecOutputIncludeFec] = js.Array(COLUMN, COLUMN_AND_ROW)
}

/** Fixed Afd
  */
type FixedAfd = "AFD_0000" | "AFD_0010" | "AFD_0011" | "AFD_0100" | "AFD_1000" | "AFD_1001" | "AFD_1010" | "AFD_1011" | "AFD_1101" | "AFD_1110" | "AFD_1111"
object FixedAfd {
  inline val AFD_0000: "AFD_0000" = "AFD_0000"
  inline val AFD_0010: "AFD_0010" = "AFD_0010"
  inline val AFD_0011: "AFD_0011" = "AFD_0011"
  inline val AFD_0100: "AFD_0100" = "AFD_0100"
  inline val AFD_1000: "AFD_1000" = "AFD_1000"
  inline val AFD_1001: "AFD_1001" = "AFD_1001"
  inline val AFD_1010: "AFD_1010" = "AFD_1010"
  inline val AFD_1011: "AFD_1011" = "AFD_1011"
  inline val AFD_1101: "AFD_1101" = "AFD_1101"
  inline val AFD_1110: "AFD_1110" = "AFD_1110"
  inline val AFD_1111: "AFD_1111" = "AFD_1111"

  inline def values: js.Array[FixedAfd] = js.Array(AFD_0000, AFD_0010, AFD_0011, AFD_0100, AFD_1000, AFD_1001, AFD_1010, AFD_1011, AFD_1101, AFD_1110, AFD_1111)
}

/** Fmp4 Nielsen Id3 Behavior
  */
type Fmp4NielsenId3Behavior = "NO_PASSTHROUGH" | "PASSTHROUGH"
object Fmp4NielsenId3Behavior {
  inline val NO_PASSTHROUGH: "NO_PASSTHROUGH" = "NO_PASSTHROUGH"
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  inline def values: js.Array[Fmp4NielsenId3Behavior] = js.Array(NO_PASSTHROUGH, PASSTHROUGH)
}

/** Fmp4 Timed Metadata Behavior
  */
type Fmp4TimedMetadataBehavior = "NO_PASSTHROUGH" | "PASSTHROUGH"
object Fmp4TimedMetadataBehavior {
  inline val NO_PASSTHROUGH: "NO_PASSTHROUGH" = "NO_PASSTHROUGH"
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  inline def values: js.Array[Fmp4TimedMetadataBehavior] = js.Array(NO_PASSTHROUGH, PASSTHROUGH)
}

/** Follow reference point.
  */
type FollowPoint = "END" | "START"
object FollowPoint {
  inline val END: "END" = "END"
  inline val START: "START" = "START"

  inline def values: js.Array[FollowPoint] = js.Array(END, START)
}

/** Frame Capture Interval Unit
  */
type FrameCaptureIntervalUnit = "MILLISECONDS" | "SECONDS"
object FrameCaptureIntervalUnit {
  inline val MILLISECONDS: "MILLISECONDS" = "MILLISECONDS"
  inline val SECONDS: "SECONDS" = "SECONDS"

  inline def values: js.Array[FrameCaptureIntervalUnit] = js.Array(MILLISECONDS, SECONDS)
}

/** Global Configuration Input End Action
  */
type GlobalConfigurationInputEndAction = "NONE" | "SWITCH_AND_LOOP_INPUTS"
object GlobalConfigurationInputEndAction {
  inline val NONE: "NONE" = "NONE"
  inline val SWITCH_AND_LOOP_INPUTS: "SWITCH_AND_LOOP_INPUTS" = "SWITCH_AND_LOOP_INPUTS"

  inline def values: js.Array[GlobalConfigurationInputEndAction] = js.Array(NONE, SWITCH_AND_LOOP_INPUTS)
}

/** Global Configuration Low Framerate Inputs
  */
type GlobalConfigurationLowFramerateInputs = "DISABLED" | "ENABLED"
object GlobalConfigurationLowFramerateInputs {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[GlobalConfigurationLowFramerateInputs] = js.Array(DISABLED, ENABLED)
}

/** Global Configuration Output Locking Mode
  */
type GlobalConfigurationOutputLockingMode = "EPOCH_LOCKING" | "PIPELINE_LOCKING"
object GlobalConfigurationOutputLockingMode {
  inline val EPOCH_LOCKING: "EPOCH_LOCKING" = "EPOCH_LOCKING"
  inline val PIPELINE_LOCKING: "PIPELINE_LOCKING" = "PIPELINE_LOCKING"

  inline def values: js.Array[GlobalConfigurationOutputLockingMode] = js.Array(EPOCH_LOCKING, PIPELINE_LOCKING)
}

/** Global Configuration Output Timing Source
  */
type GlobalConfigurationOutputTimingSource = "INPUT_CLOCK" | "SYSTEM_CLOCK"
object GlobalConfigurationOutputTimingSource {
  inline val INPUT_CLOCK: "INPUT_CLOCK" = "INPUT_CLOCK"
  inline val SYSTEM_CLOCK: "SYSTEM_CLOCK" = "SYSTEM_CLOCK"

  inline def values: js.Array[GlobalConfigurationOutputTimingSource] = js.Array(INPUT_CLOCK, SYSTEM_CLOCK)
}

/** H264 Adaptive Quantization
  */
type H264AdaptiveQuantization = "AUTO" | "HIGH" | "HIGHER" | "LOW" | "MAX" | "MEDIUM" | "OFF"
object H264AdaptiveQuantization {
  inline val AUTO: "AUTO" = "AUTO"
  inline val HIGH: "HIGH" = "HIGH"
  inline val HIGHER: "HIGHER" = "HIGHER"
  inline val LOW: "LOW" = "LOW"
  inline val MAX: "MAX" = "MAX"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val OFF: "OFF" = "OFF"

  inline def values: js.Array[H264AdaptiveQuantization] = js.Array(AUTO, HIGH, HIGHER, LOW, MAX, MEDIUM, OFF)
}

/** H264 Color Metadata
  */
type H264ColorMetadata = "IGNORE" | "INSERT"
object H264ColorMetadata {
  inline val IGNORE: "IGNORE" = "IGNORE"
  inline val INSERT: "INSERT" = "INSERT"

  inline def values: js.Array[H264ColorMetadata] = js.Array(IGNORE, INSERT)
}

/** H264 Entropy Encoding
  */
type H264EntropyEncoding = "CABAC" | "CAVLC"
object H264EntropyEncoding {
  inline val CABAC: "CABAC" = "CABAC"
  inline val CAVLC: "CAVLC" = "CAVLC"

  inline def values: js.Array[H264EntropyEncoding] = js.Array(CABAC, CAVLC)
}

/** H264 Flicker Aq
  */
type H264FlickerAq = "DISABLED" | "ENABLED"
object H264FlickerAq {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H264FlickerAq] = js.Array(DISABLED, ENABLED)
}

/** H264 Force Field Pictures
  */
type H264ForceFieldPictures = "DISABLED" | "ENABLED"
object H264ForceFieldPictures {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H264ForceFieldPictures] = js.Array(DISABLED, ENABLED)
}

/** H264 Framerate Control
  */
type H264FramerateControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object H264FramerateControl {
  inline val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  inline val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  inline def values: js.Array[H264FramerateControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** H264 Gop BReference
  */
type H264GopBReference = "DISABLED" | "ENABLED"
object H264GopBReference {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H264GopBReference] = js.Array(DISABLED, ENABLED)
}

/** H264 Gop Size Units
  */
type H264GopSizeUnits = "FRAMES" | "SECONDS"
object H264GopSizeUnits {
  inline val FRAMES: "FRAMES" = "FRAMES"
  inline val SECONDS: "SECONDS" = "SECONDS"

  inline def values: js.Array[H264GopSizeUnits] = js.Array(FRAMES, SECONDS)
}

/** H264 Level
  */
type H264Level = "H264_LEVEL_1" | "H264_LEVEL_1_1" | "H264_LEVEL_1_2" | "H264_LEVEL_1_3" | "H264_LEVEL_2" | "H264_LEVEL_2_1" | "H264_LEVEL_2_2" | "H264_LEVEL_3" | "H264_LEVEL_3_1" | "H264_LEVEL_3_2" | "H264_LEVEL_4" | "H264_LEVEL_4_1" | "H264_LEVEL_4_2" | "H264_LEVEL_5" | "H264_LEVEL_5_1" | "H264_LEVEL_5_2" | "H264_LEVEL_AUTO"
object H264Level {
  inline val H264_LEVEL_1: "H264_LEVEL_1" = "H264_LEVEL_1"
  inline val H264_LEVEL_1_1: "H264_LEVEL_1_1" = "H264_LEVEL_1_1"
  inline val H264_LEVEL_1_2: "H264_LEVEL_1_2" = "H264_LEVEL_1_2"
  inline val H264_LEVEL_1_3: "H264_LEVEL_1_3" = "H264_LEVEL_1_3"
  inline val H264_LEVEL_2: "H264_LEVEL_2" = "H264_LEVEL_2"
  inline val H264_LEVEL_2_1: "H264_LEVEL_2_1" = "H264_LEVEL_2_1"
  inline val H264_LEVEL_2_2: "H264_LEVEL_2_2" = "H264_LEVEL_2_2"
  inline val H264_LEVEL_3: "H264_LEVEL_3" = "H264_LEVEL_3"
  inline val H264_LEVEL_3_1: "H264_LEVEL_3_1" = "H264_LEVEL_3_1"
  inline val H264_LEVEL_3_2: "H264_LEVEL_3_2" = "H264_LEVEL_3_2"
  inline val H264_LEVEL_4: "H264_LEVEL_4" = "H264_LEVEL_4"
  inline val H264_LEVEL_4_1: "H264_LEVEL_4_1" = "H264_LEVEL_4_1"
  inline val H264_LEVEL_4_2: "H264_LEVEL_4_2" = "H264_LEVEL_4_2"
  inline val H264_LEVEL_5: "H264_LEVEL_5" = "H264_LEVEL_5"
  inline val H264_LEVEL_5_1: "H264_LEVEL_5_1" = "H264_LEVEL_5_1"
  inline val H264_LEVEL_5_2: "H264_LEVEL_5_2" = "H264_LEVEL_5_2"
  inline val H264_LEVEL_AUTO: "H264_LEVEL_AUTO" = "H264_LEVEL_AUTO"

  inline def values: js.Array[H264Level] = js.Array(
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
  inline val HIGH: "HIGH" = "HIGH"
  inline val LOW: "LOW" = "LOW"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"

  inline def values: js.Array[H264LookAheadRateControl] = js.Array(HIGH, LOW, MEDIUM)
}

/** H264 Par Control
  */
type H264ParControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object H264ParControl {
  inline val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  inline val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  inline def values: js.Array[H264ParControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** H264 Profile
  */
type H264Profile = "BASELINE" | "HIGH" | "HIGH_10BIT" | "HIGH_422" | "HIGH_422_10BIT" | "MAIN"
object H264Profile {
  inline val BASELINE: "BASELINE" = "BASELINE"
  inline val HIGH: "HIGH" = "HIGH"
  inline val HIGH_10BIT: "HIGH_10BIT" = "HIGH_10BIT"
  inline val HIGH_422: "HIGH_422" = "HIGH_422"
  inline val HIGH_422_10BIT: "HIGH_422_10BIT" = "HIGH_422_10BIT"
  inline val MAIN: "MAIN" = "MAIN"

  inline def values: js.Array[H264Profile] = js.Array(BASELINE, HIGH, HIGH_10BIT, HIGH_422, HIGH_422_10BIT, MAIN)
}

/** H264 Quality Level
  */
type H264QualityLevel = "ENHANCED_QUALITY" | "STANDARD_QUALITY"
object H264QualityLevel {
  inline val ENHANCED_QUALITY: "ENHANCED_QUALITY" = "ENHANCED_QUALITY"
  inline val STANDARD_QUALITY: "STANDARD_QUALITY" = "STANDARD_QUALITY"

  inline def values: js.Array[H264QualityLevel] = js.Array(ENHANCED_QUALITY, STANDARD_QUALITY)
}

/** H264 Rate Control Mode
  */
type H264RateControlMode = "CBR" | "MULTIPLEX" | "QVBR" | "VBR"
object H264RateControlMode {
  inline val CBR: "CBR" = "CBR"
  inline val MULTIPLEX: "MULTIPLEX" = "MULTIPLEX"
  inline val QVBR: "QVBR" = "QVBR"
  inline val VBR: "VBR" = "VBR"

  inline def values: js.Array[H264RateControlMode] = js.Array(CBR, MULTIPLEX, QVBR, VBR)
}

/** H264 Scan Type
  */
type H264ScanType = "INTERLACED" | "PROGRESSIVE"
object H264ScanType {
  inline val INTERLACED: "INTERLACED" = "INTERLACED"
  inline val PROGRESSIVE: "PROGRESSIVE" = "PROGRESSIVE"

  inline def values: js.Array[H264ScanType] = js.Array(INTERLACED, PROGRESSIVE)
}

/** H264 Scene Change Detect
  */
type H264SceneChangeDetect = "DISABLED" | "ENABLED"
object H264SceneChangeDetect {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H264SceneChangeDetect] = js.Array(DISABLED, ENABLED)
}

/** H264 Spatial Aq
  */
type H264SpatialAq = "DISABLED" | "ENABLED"
object H264SpatialAq {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H264SpatialAq] = js.Array(DISABLED, ENABLED)
}

/** H264 Sub Gop Length
  */
type H264SubGopLength = "DYNAMIC" | "FIXED"
object H264SubGopLength {
  inline val DYNAMIC: "DYNAMIC" = "DYNAMIC"
  inline val FIXED: "FIXED" = "FIXED"

  inline def values: js.Array[H264SubGopLength] = js.Array(DYNAMIC, FIXED)
}

/** H264 Syntax
  */
type H264Syntax = "DEFAULT" | "RP2027"
object H264Syntax {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val RP2027: "RP2027" = "RP2027"

  inline def values: js.Array[H264Syntax] = js.Array(DEFAULT, RP2027)
}

/** H264 Temporal Aq
  */
type H264TemporalAq = "DISABLED" | "ENABLED"
object H264TemporalAq {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H264TemporalAq] = js.Array(DISABLED, ENABLED)
}

/** H264 Timecode Insertion Behavior
  */
type H264TimecodeInsertionBehavior = "DISABLED" | "PIC_TIMING_SEI"
object H264TimecodeInsertionBehavior {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val PIC_TIMING_SEI: "PIC_TIMING_SEI" = "PIC_TIMING_SEI"

  inline def values: js.Array[H264TimecodeInsertionBehavior] = js.Array(DISABLED, PIC_TIMING_SEI)
}

/** H265 Adaptive Quantization
  */
type H265AdaptiveQuantization = "AUTO" | "HIGH" | "HIGHER" | "LOW" | "MAX" | "MEDIUM" | "OFF"
object H265AdaptiveQuantization {
  inline val AUTO: "AUTO" = "AUTO"
  inline val HIGH: "HIGH" = "HIGH"
  inline val HIGHER: "HIGHER" = "HIGHER"
  inline val LOW: "LOW" = "LOW"
  inline val MAX: "MAX" = "MAX"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val OFF: "OFF" = "OFF"

  inline def values: js.Array[H265AdaptiveQuantization] = js.Array(AUTO, HIGH, HIGHER, LOW, MAX, MEDIUM, OFF)
}

/** H265 Alternative Transfer Function
  */
type H265AlternativeTransferFunction = "INSERT" | "OMIT"
object H265AlternativeTransferFunction {
  inline val INSERT: "INSERT" = "INSERT"
  inline val OMIT: "OMIT" = "OMIT"

  inline def values: js.Array[H265AlternativeTransferFunction] = js.Array(INSERT, OMIT)
}

/** H265 Color Metadata
  */
type H265ColorMetadata = "IGNORE" | "INSERT"
object H265ColorMetadata {
  inline val IGNORE: "IGNORE" = "IGNORE"
  inline val INSERT: "INSERT" = "INSERT"

  inline def values: js.Array[H265ColorMetadata] = js.Array(IGNORE, INSERT)
}

/** H265 Flicker Aq
  */
type H265FlickerAq = "DISABLED" | "ENABLED"
object H265FlickerAq {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H265FlickerAq] = js.Array(DISABLED, ENABLED)
}

/** H265 Gop Size Units
  */
type H265GopSizeUnits = "FRAMES" | "SECONDS"
object H265GopSizeUnits {
  inline val FRAMES: "FRAMES" = "FRAMES"
  inline val SECONDS: "SECONDS" = "SECONDS"

  inline def values: js.Array[H265GopSizeUnits] = js.Array(FRAMES, SECONDS)
}

/** H265 Level
  */
type H265Level = "H265_LEVEL_1" | "H265_LEVEL_2" | "H265_LEVEL_2_1" | "H265_LEVEL_3" | "H265_LEVEL_3_1" | "H265_LEVEL_4" | "H265_LEVEL_4_1" | "H265_LEVEL_5" | "H265_LEVEL_5_1" | "H265_LEVEL_5_2" | "H265_LEVEL_6" | "H265_LEVEL_6_1" | "H265_LEVEL_6_2" | "H265_LEVEL_AUTO"
object H265Level {
  inline val H265_LEVEL_1: "H265_LEVEL_1" = "H265_LEVEL_1"
  inline val H265_LEVEL_2: "H265_LEVEL_2" = "H265_LEVEL_2"
  inline val H265_LEVEL_2_1: "H265_LEVEL_2_1" = "H265_LEVEL_2_1"
  inline val H265_LEVEL_3: "H265_LEVEL_3" = "H265_LEVEL_3"
  inline val H265_LEVEL_3_1: "H265_LEVEL_3_1" = "H265_LEVEL_3_1"
  inline val H265_LEVEL_4: "H265_LEVEL_4" = "H265_LEVEL_4"
  inline val H265_LEVEL_4_1: "H265_LEVEL_4_1" = "H265_LEVEL_4_1"
  inline val H265_LEVEL_5: "H265_LEVEL_5" = "H265_LEVEL_5"
  inline val H265_LEVEL_5_1: "H265_LEVEL_5_1" = "H265_LEVEL_5_1"
  inline val H265_LEVEL_5_2: "H265_LEVEL_5_2" = "H265_LEVEL_5_2"
  inline val H265_LEVEL_6: "H265_LEVEL_6" = "H265_LEVEL_6"
  inline val H265_LEVEL_6_1: "H265_LEVEL_6_1" = "H265_LEVEL_6_1"
  inline val H265_LEVEL_6_2: "H265_LEVEL_6_2" = "H265_LEVEL_6_2"
  inline val H265_LEVEL_AUTO: "H265_LEVEL_AUTO" = "H265_LEVEL_AUTO"

  inline def values: js.Array[H265Level] = js.Array(
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
  inline val HIGH: "HIGH" = "HIGH"
  inline val LOW: "LOW" = "LOW"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"

  inline def values: js.Array[H265LookAheadRateControl] = js.Array(HIGH, LOW, MEDIUM)
}

/** H265 Profile
  */
type H265Profile = "MAIN" | "MAIN_10BIT"
object H265Profile {
  inline val MAIN: "MAIN" = "MAIN"
  inline val MAIN_10BIT: "MAIN_10BIT" = "MAIN_10BIT"

  inline def values: js.Array[H265Profile] = js.Array(MAIN, MAIN_10BIT)
}

/** H265 Rate Control Mode
  */
type H265RateControlMode = "CBR" | "MULTIPLEX" | "QVBR"
object H265RateControlMode {
  inline val CBR: "CBR" = "CBR"
  inline val MULTIPLEX: "MULTIPLEX" = "MULTIPLEX"
  inline val QVBR: "QVBR" = "QVBR"

  inline def values: js.Array[H265RateControlMode] = js.Array(CBR, MULTIPLEX, QVBR)
}

/** H265 Scan Type
  */
type H265ScanType = "INTERLACED" | "PROGRESSIVE"
object H265ScanType {
  inline val INTERLACED: "INTERLACED" = "INTERLACED"
  inline val PROGRESSIVE: "PROGRESSIVE" = "PROGRESSIVE"

  inline def values: js.Array[H265ScanType] = js.Array(INTERLACED, PROGRESSIVE)
}

/** H265 Scene Change Detect
  */
type H265SceneChangeDetect = "DISABLED" | "ENABLED"
object H265SceneChangeDetect {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H265SceneChangeDetect] = js.Array(DISABLED, ENABLED)
}

/** H265 Tier
  */
type H265Tier = "HIGH" | "MAIN"
object H265Tier {
  inline val HIGH: "HIGH" = "HIGH"
  inline val MAIN: "MAIN" = "MAIN"

  inline def values: js.Array[H265Tier] = js.Array(HIGH, MAIN)
}

/** H265 Timecode Insertion Behavior
  */
type H265TimecodeInsertionBehavior = "DISABLED" | "PIC_TIMING_SEI"
object H265TimecodeInsertionBehavior {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val PIC_TIMING_SEI: "PIC_TIMING_SEI" = "PIC_TIMING_SEI"

  inline def values: js.Array[H265TimecodeInsertionBehavior] = js.Array(DISABLED, PIC_TIMING_SEI)
}

/** Hls Ad Markers
  */
type HlsAdMarkers = "ADOBE" | "ELEMENTAL" | "ELEMENTAL_SCTE35"
object HlsAdMarkers {
  inline val ADOBE: "ADOBE" = "ADOBE"
  inline val ELEMENTAL: "ELEMENTAL" = "ELEMENTAL"
  inline val ELEMENTAL_SCTE35: "ELEMENTAL_SCTE35" = "ELEMENTAL_SCTE35"

  inline def values: js.Array[HlsAdMarkers] = js.Array(ADOBE, ELEMENTAL, ELEMENTAL_SCTE35)
}

/** Hls Akamai Http Transfer Mode
  */
type HlsAkamaiHttpTransferMode = "CHUNKED" | "NON_CHUNKED"
object HlsAkamaiHttpTransferMode {
  inline val CHUNKED: "CHUNKED" = "CHUNKED"
  inline val NON_CHUNKED: "NON_CHUNKED" = "NON_CHUNKED"

  inline def values: js.Array[HlsAkamaiHttpTransferMode] = js.Array(CHUNKED, NON_CHUNKED)
}

/** Hls Caption Language Setting
  */
type HlsCaptionLanguageSetting = "INSERT" | "NONE" | "OMIT"
object HlsCaptionLanguageSetting {
  inline val INSERT: "INSERT" = "INSERT"
  inline val NONE: "NONE" = "NONE"
  inline val OMIT: "OMIT" = "OMIT"

  inline def values: js.Array[HlsCaptionLanguageSetting] = js.Array(INSERT, NONE, OMIT)
}

/** Hls Client Cache
  */
type HlsClientCache = "DISABLED" | "ENABLED"
object HlsClientCache {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[HlsClientCache] = js.Array(DISABLED, ENABLED)
}

/** Hls Codec Specification
  */
type HlsCodecSpecification = "RFC_4281" | "RFC_6381"
object HlsCodecSpecification {
  inline val RFC_4281: "RFC_4281" = "RFC_4281"
  inline val RFC_6381: "RFC_6381" = "RFC_6381"

  inline def values: js.Array[HlsCodecSpecification] = js.Array(RFC_4281, RFC_6381)
}

/** Hls Directory Structure
  */
type HlsDirectoryStructure = "SINGLE_DIRECTORY" | "SUBDIRECTORY_PER_STREAM"
object HlsDirectoryStructure {
  inline val SINGLE_DIRECTORY: "SINGLE_DIRECTORY" = "SINGLE_DIRECTORY"
  inline val SUBDIRECTORY_PER_STREAM: "SUBDIRECTORY_PER_STREAM" = "SUBDIRECTORY_PER_STREAM"

  inline def values: js.Array[HlsDirectoryStructure] = js.Array(SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM)
}

/** Hls Discontinuity Tags
  */
type HlsDiscontinuityTags = "INSERT" | "NEVER_INSERT"
object HlsDiscontinuityTags {
  inline val INSERT: "INSERT" = "INSERT"
  inline val NEVER_INSERT: "NEVER_INSERT" = "NEVER_INSERT"

  inline def values: js.Array[HlsDiscontinuityTags] = js.Array(INSERT, NEVER_INSERT)
}

/** Hls Encryption Type
  */
type HlsEncryptionType = "AES128" | "SAMPLE_AES"
object HlsEncryptionType {
  inline val AES128: "AES128" = "AES128"
  inline val SAMPLE_AES: "SAMPLE_AES" = "SAMPLE_AES"

  inline def values: js.Array[HlsEncryptionType] = js.Array(AES128, SAMPLE_AES)
}

/** Hls H265 Packaging Type
  */
type HlsH265PackagingType = "HEV1" | "HVC1"
object HlsH265PackagingType {
  inline val HEV1: "HEV1" = "HEV1"
  inline val HVC1: "HVC1" = "HVC1"

  inline def values: js.Array[HlsH265PackagingType] = js.Array(HEV1, HVC1)
}

/** State of HLS ID3 Segment Tagging
  */
type HlsId3SegmentTaggingState = "DISABLED" | "ENABLED"
object HlsId3SegmentTaggingState {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[HlsId3SegmentTaggingState] = js.Array(DISABLED, ENABLED)
}

/** Hls Incomplete Segment Behavior
  */
type HlsIncompleteSegmentBehavior = "AUTO" | "SUPPRESS"
object HlsIncompleteSegmentBehavior {
  inline val AUTO: "AUTO" = "AUTO"
  inline val SUPPRESS: "SUPPRESS" = "SUPPRESS"

  inline def values: js.Array[HlsIncompleteSegmentBehavior] = js.Array(AUTO, SUPPRESS)
}

/** Hls Iv In Manifest
  */
type HlsIvInManifest = "EXCLUDE" | "INCLUDE"
object HlsIvInManifest {
  inline val EXCLUDE: "EXCLUDE" = "EXCLUDE"
  inline val INCLUDE: "INCLUDE" = "INCLUDE"

  inline def values: js.Array[HlsIvInManifest] = js.Array(EXCLUDE, INCLUDE)
}

/** Hls Iv Source
  */
type HlsIvSource = "EXPLICIT" | "FOLLOWS_SEGMENT_NUMBER"
object HlsIvSource {
  inline val EXPLICIT: "EXPLICIT" = "EXPLICIT"
  inline val FOLLOWS_SEGMENT_NUMBER: "FOLLOWS_SEGMENT_NUMBER" = "FOLLOWS_SEGMENT_NUMBER"

  inline def values: js.Array[HlsIvSource] = js.Array(EXPLICIT, FOLLOWS_SEGMENT_NUMBER)
}

/** Hls Manifest Compression
  */
type HlsManifestCompression = "GZIP" | "NONE"
object HlsManifestCompression {
  inline val GZIP: "GZIP" = "GZIP"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[HlsManifestCompression] = js.Array(GZIP, NONE)
}

/** Hls Manifest Duration Format
  */
type HlsManifestDurationFormat = "FLOATING_POINT" | "INTEGER"
object HlsManifestDurationFormat {
  inline val FLOATING_POINT: "FLOATING_POINT" = "FLOATING_POINT"
  inline val INTEGER: "INTEGER" = "INTEGER"

  inline def values: js.Array[HlsManifestDurationFormat] = js.Array(FLOATING_POINT, INTEGER)
}

/** Hls Media Store Storage Class
  */
type HlsMediaStoreStorageClass = "TEMPORAL"
object HlsMediaStoreStorageClass {
  inline val TEMPORAL: "TEMPORAL" = "TEMPORAL"

  inline def values: js.Array[HlsMediaStoreStorageClass] = js.Array(TEMPORAL)
}

/** Hls Mode
  */
type HlsMode = "LIVE" | "VOD"
object HlsMode {
  inline val LIVE: "LIVE" = "LIVE"
  inline val VOD: "VOD" = "VOD"

  inline def values: js.Array[HlsMode] = js.Array(LIVE, VOD)
}

/** Hls Output Selection
  */
type HlsOutputSelection = "MANIFESTS_AND_SEGMENTS" | "SEGMENTS_ONLY" | "VARIANT_MANIFESTS_AND_SEGMENTS"
object HlsOutputSelection {
  inline val MANIFESTS_AND_SEGMENTS: "MANIFESTS_AND_SEGMENTS" = "MANIFESTS_AND_SEGMENTS"
  inline val SEGMENTS_ONLY: "SEGMENTS_ONLY" = "SEGMENTS_ONLY"
  inline val VARIANT_MANIFESTS_AND_SEGMENTS: "VARIANT_MANIFESTS_AND_SEGMENTS" = "VARIANT_MANIFESTS_AND_SEGMENTS"

  inline def values: js.Array[HlsOutputSelection] = js.Array(MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY, VARIANT_MANIFESTS_AND_SEGMENTS)
}

/** Hls Program Date Time
  */
type HlsProgramDateTime = "EXCLUDE" | "INCLUDE"
object HlsProgramDateTime {
  inline val EXCLUDE: "EXCLUDE" = "EXCLUDE"
  inline val INCLUDE: "INCLUDE" = "INCLUDE"

  inline def values: js.Array[HlsProgramDateTime] = js.Array(EXCLUDE, INCLUDE)
}

/** Hls Redundant Manifest
  */
type HlsRedundantManifest = "DISABLED" | "ENABLED"
object HlsRedundantManifest {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[HlsRedundantManifest] = js.Array(DISABLED, ENABLED)
}

/** Hls Scte35 Source Type
  */
type HlsScte35SourceType = "MANIFEST" | "SEGMENTS"
object HlsScte35SourceType {
  inline val MANIFEST: "MANIFEST" = "MANIFEST"
  inline val SEGMENTS: "SEGMENTS" = "SEGMENTS"

  inline def values: js.Array[HlsScte35SourceType] = js.Array(MANIFEST, SEGMENTS)
}

/** Hls Segmentation Mode
  */
type HlsSegmentationMode = "USE_INPUT_SEGMENTATION" | "USE_SEGMENT_DURATION"
object HlsSegmentationMode {
  inline val USE_INPUT_SEGMENTATION: "USE_INPUT_SEGMENTATION" = "USE_INPUT_SEGMENTATION"
  inline val USE_SEGMENT_DURATION: "USE_SEGMENT_DURATION" = "USE_SEGMENT_DURATION"

  inline def values: js.Array[HlsSegmentationMode] = js.Array(USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION)
}

/** Hls Stream Inf Resolution
  */
type HlsStreamInfResolution = "EXCLUDE" | "INCLUDE"
object HlsStreamInfResolution {
  inline val EXCLUDE: "EXCLUDE" = "EXCLUDE"
  inline val INCLUDE: "INCLUDE" = "INCLUDE"

  inline def values: js.Array[HlsStreamInfResolution] = js.Array(EXCLUDE, INCLUDE)
}

/** Hls Timed Metadata Id3 Frame
  */
type HlsTimedMetadataId3Frame = "NONE" | "PRIV" | "TDRL"
object HlsTimedMetadataId3Frame {
  inline val NONE: "NONE" = "NONE"
  inline val PRIV: "PRIV" = "PRIV"
  inline val TDRL: "TDRL" = "TDRL"

  inline def values: js.Array[HlsTimedMetadataId3Frame] = js.Array(NONE, PRIV, TDRL)
}

/** Hls Ts File Mode
  */
type HlsTsFileMode = "SEGMENTED_FILES" | "SINGLE_FILE"
object HlsTsFileMode {
  inline val SEGMENTED_FILES: "SEGMENTED_FILES" = "SEGMENTED_FILES"
  inline val SINGLE_FILE: "SINGLE_FILE" = "SINGLE_FILE"

  inline def values: js.Array[HlsTsFileMode] = js.Array(SEGMENTED_FILES, SINGLE_FILE)
}

/** Hls Webdav Http Transfer Mode
  */
type HlsWebdavHttpTransferMode = "CHUNKED" | "NON_CHUNKED"
object HlsWebdavHttpTransferMode {
  inline val CHUNKED: "CHUNKED" = "CHUNKED"
  inline val NON_CHUNKED: "NON_CHUNKED" = "NON_CHUNKED"

  inline def values: js.Array[HlsWebdavHttpTransferMode] = js.Array(CHUNKED, NON_CHUNKED)
}

/** When set to "standard", an I-Frame only playlist will be written out for each video output in the output group. This I-Frame only playlist will contain byte range offsets pointing to the I-frame(s) in each segment.
  */
type IFrameOnlyPlaylistType = "DISABLED" | "STANDARD"
object IFrameOnlyPlaylistType {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val STANDARD: "STANDARD" = "STANDARD"

  inline def values: js.Array[IFrameOnlyPlaylistType] = js.Array(DISABLED, STANDARD)
}

/** A standard input has two sources and a single pipeline input only has one.
  */
type InputClass = "STANDARD" | "SINGLE_PIPELINE"
object InputClass {
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val SINGLE_PIPELINE: "SINGLE_PIPELINE" = "SINGLE_PIPELINE"

  inline def values: js.Array[InputClass] = js.Array(STANDARD, SINGLE_PIPELINE)
}

/** codec in increasing order of complexity
  */
type InputCodec = "MPEG2" | "AVC" | "HEVC"
object InputCodec {
  inline val MPEG2: "MPEG2" = "MPEG2"
  inline val AVC: "AVC" = "AVC"
  inline val HEVC: "HEVC" = "HEVC"

  inline def values: js.Array[InputCodec] = js.Array(MPEG2, AVC, HEVC)
}

/** Input Deblock Filter
  */
type InputDeblockFilter = "DISABLED" | "ENABLED"
object InputDeblockFilter {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[InputDeblockFilter] = js.Array(DISABLED, ENABLED)
}

/** Input Denoise Filter
  */
type InputDenoiseFilter = "DISABLED" | "ENABLED"
object InputDenoiseFilter {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[InputDenoiseFilter] = js.Array(DISABLED, ENABLED)
}

/** The source at the input device that is currently active.
  */
type InputDeviceActiveInput = "HDMI" | "SDI"
object InputDeviceActiveInput {
  inline val HDMI: "HDMI" = "HDMI"
  inline val SDI: "SDI" = "SDI"

  inline def values: js.Array[InputDeviceActiveInput] = js.Array(HDMI, SDI)
}

/** The source to activate (use) from the input device.
  */
type InputDeviceConfiguredInput = "AUTO" | "HDMI" | "SDI"
object InputDeviceConfiguredInput {
  inline val AUTO: "AUTO" = "AUTO"
  inline val HDMI: "HDMI" = "HDMI"
  inline val SDI: "SDI" = "SDI"

  inline def values: js.Array[InputDeviceConfiguredInput] = js.Array(AUTO, HDMI, SDI)
}

/** The state of the connection between the input device and AWS.
  */
type InputDeviceConnectionState = "DISCONNECTED" | "CONNECTED"
object InputDeviceConnectionState {
  inline val DISCONNECTED: "DISCONNECTED" = "DISCONNECTED"
  inline val CONNECTED: "CONNECTED" = "CONNECTED"

  inline def values: js.Array[InputDeviceConnectionState] = js.Array(DISCONNECTED, CONNECTED)
}

/** Specifies whether the input device has been configured (outside of MediaLive) to use a dynamic IP address assignment (DHCP) or a static IP address.
  */
type InputDeviceIpScheme = "STATIC" | "DHCP"
object InputDeviceIpScheme {
  inline val STATIC: "STATIC" = "STATIC"
  inline val DHCP: "DHCP" = "DHCP"

  inline def values: js.Array[InputDeviceIpScheme] = js.Array(STATIC, DHCP)
}

/** The scan type of the video source.
  */
type InputDeviceScanType = "INTERLACED" | "PROGRESSIVE"
object InputDeviceScanType {
  inline val INTERLACED: "INTERLACED" = "INTERLACED"
  inline val PROGRESSIVE: "PROGRESSIVE" = "PROGRESSIVE"

  inline def values: js.Array[InputDeviceScanType] = js.Array(INTERLACED, PROGRESSIVE)
}

/** The state of the input device.
  */
type InputDeviceState = "IDLE" | "STREAMING"
object InputDeviceState {
  inline val IDLE: "IDLE" = "IDLE"
  inline val STREAMING: "STREAMING" = "STREAMING"

  inline def values: js.Array[InputDeviceState] = js.Array(IDLE, STREAMING)
}

/** The type of device transfer. INCOMING for an input device that is being transferred to you, OUTGOING for an input device that you are transferring to another AWS account.
  */
type InputDeviceTransferType = "OUTGOING" | "INCOMING"
object InputDeviceTransferType {
  inline val OUTGOING: "OUTGOING" = "OUTGOING"
  inline val INCOMING: "INCOMING" = "INCOMING"

  inline def values: js.Array[InputDeviceTransferType] = js.Array(OUTGOING, INCOMING)
}

/** The type of the input device. For an AWS Elemental Link device that outputs resolutions up to 1080, choose "HD".
  */
type InputDeviceType = "HD"
object InputDeviceType {
  inline val HD: "HD" = "HD"

  inline def values: js.Array[InputDeviceType] = js.Array(HD)
}

/** Input Filter
  */
type InputFilter = "AUTO" | "DISABLED" | "FORCED"
object InputFilter {
  inline val AUTO: "AUTO" = "AUTO"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val FORCED: "FORCED" = "FORCED"

  inline def values: js.Array[InputFilter] = js.Array(AUTO, DISABLED, FORCED)
}

/** Input Loss Action For Hls Out
  */
type InputLossActionForHlsOut = "EMIT_OUTPUT" | "PAUSE_OUTPUT"
object InputLossActionForHlsOut {
  inline val EMIT_OUTPUT: "EMIT_OUTPUT" = "EMIT_OUTPUT"
  inline val PAUSE_OUTPUT: "PAUSE_OUTPUT" = "PAUSE_OUTPUT"

  inline def values: js.Array[InputLossActionForHlsOut] = js.Array(EMIT_OUTPUT, PAUSE_OUTPUT)
}

/** Input Loss Action For Ms Smooth Out
  */
type InputLossActionForMsSmoothOut = "EMIT_OUTPUT" | "PAUSE_OUTPUT"
object InputLossActionForMsSmoothOut {
  inline val EMIT_OUTPUT: "EMIT_OUTPUT" = "EMIT_OUTPUT"
  inline val PAUSE_OUTPUT: "PAUSE_OUTPUT" = "PAUSE_OUTPUT"

  inline def values: js.Array[InputLossActionForMsSmoothOut] = js.Array(EMIT_OUTPUT, PAUSE_OUTPUT)
}

/** Input Loss Action For Rtmp Out
  */
type InputLossActionForRtmpOut = "EMIT_OUTPUT" | "PAUSE_OUTPUT"
object InputLossActionForRtmpOut {
  inline val EMIT_OUTPUT: "EMIT_OUTPUT" = "EMIT_OUTPUT"
  inline val PAUSE_OUTPUT: "PAUSE_OUTPUT" = "PAUSE_OUTPUT"

  inline def values: js.Array[InputLossActionForRtmpOut] = js.Array(EMIT_OUTPUT, PAUSE_OUTPUT)
}

/** Input Loss Action For Udp Out
  */
type InputLossActionForUdpOut = "DROP_PROGRAM" | "DROP_TS" | "EMIT_PROGRAM"
object InputLossActionForUdpOut {
  inline val DROP_PROGRAM: "DROP_PROGRAM" = "DROP_PROGRAM"
  inline val DROP_TS: "DROP_TS" = "DROP_TS"
  inline val EMIT_PROGRAM: "EMIT_PROGRAM" = "EMIT_PROGRAM"

  inline def values: js.Array[InputLossActionForUdpOut] = js.Array(DROP_PROGRAM, DROP_TS, EMIT_PROGRAM)
}

/** Input Loss Image Type
  */
type InputLossImageType = "COLOR" | "SLATE"
object InputLossImageType {
  inline val COLOR: "COLOR" = "COLOR"
  inline val SLATE: "SLATE" = "SLATE"

  inline def values: js.Array[InputLossImageType] = js.Array(COLOR, SLATE)
}

/** Maximum input bitrate in megabits per second. Bitrates up to 50 Mbps are supported currently.
  */
type InputMaximumBitrate = "MAX_10_MBPS" | "MAX_20_MBPS" | "MAX_50_MBPS"
object InputMaximumBitrate {
  inline val MAX_10_MBPS: "MAX_10_MBPS" = "MAX_10_MBPS"
  inline val MAX_20_MBPS: "MAX_20_MBPS" = "MAX_20_MBPS"
  inline val MAX_50_MBPS: "MAX_50_MBPS" = "MAX_50_MBPS"

  inline def values: js.Array[InputMaximumBitrate] = js.Array(MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS)
}

/** Input preference when deciding which input to make active when a previously failed input has recovered. If \"EQUAL_INPUT_PREFERENCE\", then the active input will stay active as long as it is healthy. If \"PRIMARY_INPUT_PREFERRED\", then always switch back to the primary input when it is healthy.
  */
type InputPreference = "EQUAL_INPUT_PREFERENCE" | "PRIMARY_INPUT_PREFERRED"
object InputPreference {
  inline val EQUAL_INPUT_PREFERENCE: "EQUAL_INPUT_PREFERENCE" = "EQUAL_INPUT_PREFERENCE"
  inline val PRIMARY_INPUT_PREFERRED: "PRIMARY_INPUT_PREFERRED" = "PRIMARY_INPUT_PREFERRED"

  inline def values: js.Array[InputPreference] = js.Array(EQUAL_INPUT_PREFERENCE, PRIMARY_INPUT_PREFERRED)
}

/** Input resolution based on lines of vertical resolution in the input; SD is less than 720 lines, HD is 720 to 1080 lines, UHD is greater than 1080 lines
  */
type InputResolution = "SD" | "HD" | "UHD"
object InputResolution {
  inline val SD: "SD" = "SD"
  inline val HD: "HD" = "HD"
  inline val UHD: "UHD" = "UHD"

  inline def values: js.Array[InputResolution] = js.Array(SD, HD, UHD)
}

/** Placeholder documentation for InputSecurityGroupState
  */
type InputSecurityGroupState = "IDLE" | "IN_USE" | "UPDATING" | "DELETED"
object InputSecurityGroupState {
  inline val IDLE: "IDLE" = "IDLE"
  inline val IN_USE: "IN_USE" = "IN_USE"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[InputSecurityGroupState] = js.Array(IDLE, IN_USE, UPDATING, DELETED)
}

/** Input Source End Behavior
  */
type InputSourceEndBehavior = "CONTINUE" | "LOOP"
object InputSourceEndBehavior {
  inline val CONTINUE: "CONTINUE" = "CONTINUE"
  inline val LOOP: "LOOP" = "LOOP"

  inline def values: js.Array[InputSourceEndBehavior] = js.Array(CONTINUE, LOOP)
}

/** There are two types of input sources, static and dynamic. If an input source is dynamic you can change the source url of the input dynamically using an input switch action. Currently, two input types support a dynamic url at this time, MP4_FILE and TS_FILE. By default all input sources are static.
  */
type InputSourceType = "STATIC" | "DYNAMIC"
object InputSourceType {
  inline val STATIC: "STATIC" = "STATIC"
  inline val DYNAMIC: "DYNAMIC" = "DYNAMIC"

  inline def values: js.Array[InputSourceType] = js.Array(STATIC, DYNAMIC)
}

/** Placeholder documentation for InputState
  */
type InputState = "CREATING" | "DETACHED" | "ATTACHED" | "DELETING" | "DELETED"
object InputState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val DETACHED: "DETACHED" = "DETACHED"
  inline val ATTACHED: "ATTACHED" = "ATTACHED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[InputState] = js.Array(CREATING, DETACHED, ATTACHED, DELETING, DELETED)
}

/** Documentation update needed
  */
type InputTimecodeSource = "ZEROBASED" | "EMBEDDED"
object InputTimecodeSource {
  inline val ZEROBASED: "ZEROBASED" = "ZEROBASED"
  inline val EMBEDDED: "EMBEDDED" = "EMBEDDED"

  inline def values: js.Array[InputTimecodeSource] = js.Array(ZEROBASED, EMBEDDED)
}

/** The different types of inputs that AWS Elemental MediaLive supports.
  */
type InputType = "UDP_PUSH" | "RTP_PUSH" | "RTMP_PUSH" | "RTMP_PULL" | "URL_PULL" | "MP4_FILE" | "MEDIACONNECT" | "INPUT_DEVICE" | "AWS_CDI" | "TS_FILE"
object InputType {
  inline val UDP_PUSH: "UDP_PUSH" = "UDP_PUSH"
  inline val RTP_PUSH: "RTP_PUSH" = "RTP_PUSH"
  inline val RTMP_PUSH: "RTMP_PUSH" = "RTMP_PUSH"
  inline val RTMP_PULL: "RTMP_PULL" = "RTMP_PULL"
  inline val URL_PULL: "URL_PULL" = "URL_PULL"
  inline val MP4_FILE: "MP4_FILE" = "MP4_FILE"
  inline val MEDIACONNECT: "MEDIACONNECT" = "MEDIACONNECT"
  inline val INPUT_DEVICE: "INPUT_DEVICE" = "INPUT_DEVICE"
  inline val AWS_CDI: "AWS_CDI" = "AWS_CDI"
  inline val TS_FILE: "TS_FILE" = "TS_FILE"

  inline def values: js.Array[InputType] = js.Array(UDP_PUSH, RTP_PUSH, RTMP_PUSH, RTMP_PULL, URL_PULL, MP4_FILE, MEDIACONNECT, INPUT_DEVICE, AWS_CDI, TS_FILE)
}

/** If you specify a StopTimecode in an input (in order to clip the file), you can specify if you want the clip to exclude (the default) or include the frame specified by the timecode.
  */
type LastFrameClippingBehavior = "EXCLUDE_LAST_FRAME" | "INCLUDE_LAST_FRAME"
object LastFrameClippingBehavior {
  inline val EXCLUDE_LAST_FRAME: "EXCLUDE_LAST_FRAME" = "EXCLUDE_LAST_FRAME"
  inline val INCLUDE_LAST_FRAME: "INCLUDE_LAST_FRAME" = "INCLUDE_LAST_FRAME"

  inline def values: js.Array[LastFrameClippingBehavior] = js.Array(EXCLUDE_LAST_FRAME, INCLUDE_LAST_FRAME)
}

/** The log level the user wants for their channel.
  */
type LogLevel = "ERROR" | "WARNING" | "INFO" | "DEBUG" | "DISABLED"
object LogLevel {
  inline val ERROR: "ERROR" = "ERROR"
  inline val WARNING: "WARNING" = "WARNING"
  inline val INFO: "INFO" = "INFO"
  inline val DEBUG: "DEBUG" = "DEBUG"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[LogLevel] = js.Array(ERROR, WARNING, INFO, DEBUG, DISABLED)
}

/** M2ts Absent Input Audio Behavior
  */
type M2tsAbsentInputAudioBehavior = "DROP" | "ENCODE_SILENCE"
object M2tsAbsentInputAudioBehavior {
  inline val DROP: "DROP" = "DROP"
  inline val ENCODE_SILENCE: "ENCODE_SILENCE" = "ENCODE_SILENCE"

  inline def values: js.Array[M2tsAbsentInputAudioBehavior] = js.Array(DROP, ENCODE_SILENCE)
}

/** M2ts Arib
  */
type M2tsArib = "DISABLED" | "ENABLED"
object M2tsArib {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[M2tsArib] = js.Array(DISABLED, ENABLED)
}

/** M2ts Arib Captions Pid Control
  */
type M2tsAribCaptionsPidControl = "AUTO" | "USE_CONFIGURED"
object M2tsAribCaptionsPidControl {
  inline val AUTO: "AUTO" = "AUTO"
  inline val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"

  inline def values: js.Array[M2tsAribCaptionsPidControl] = js.Array(AUTO, USE_CONFIGURED)
}

/** M2ts Audio Buffer Model
  */
type M2tsAudioBufferModel = "ATSC" | "DVB"
object M2tsAudioBufferModel {
  inline val ATSC: "ATSC" = "ATSC"
  inline val DVB: "DVB" = "DVB"

  inline def values: js.Array[M2tsAudioBufferModel] = js.Array(ATSC, DVB)
}

/** M2ts Audio Interval
  */
type M2tsAudioInterval = "VIDEO_AND_FIXED_INTERVALS" | "VIDEO_INTERVAL"
object M2tsAudioInterval {
  inline val VIDEO_AND_FIXED_INTERVALS: "VIDEO_AND_FIXED_INTERVALS" = "VIDEO_AND_FIXED_INTERVALS"
  inline val VIDEO_INTERVAL: "VIDEO_INTERVAL" = "VIDEO_INTERVAL"

  inline def values: js.Array[M2tsAudioInterval] = js.Array(VIDEO_AND_FIXED_INTERVALS, VIDEO_INTERVAL)
}

/** M2ts Audio Stream Type
  */
type M2tsAudioStreamType = "ATSC" | "DVB"
object M2tsAudioStreamType {
  inline val ATSC: "ATSC" = "ATSC"
  inline val DVB: "DVB" = "DVB"

  inline def values: js.Array[M2tsAudioStreamType] = js.Array(ATSC, DVB)
}

/** M2ts Buffer Model
  */
type M2tsBufferModel = "MULTIPLEX" | "NONE"
object M2tsBufferModel {
  inline val MULTIPLEX: "MULTIPLEX" = "MULTIPLEX"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[M2tsBufferModel] = js.Array(MULTIPLEX, NONE)
}

/** M2ts Cc Descriptor
  */
type M2tsCcDescriptor = "DISABLED" | "ENABLED"
object M2tsCcDescriptor {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[M2tsCcDescriptor] = js.Array(DISABLED, ENABLED)
}

/** M2ts Ebif Control
  */
type M2tsEbifControl = "NONE" | "PASSTHROUGH"
object M2tsEbifControl {
  inline val NONE: "NONE" = "NONE"
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  inline def values: js.Array[M2tsEbifControl] = js.Array(NONE, PASSTHROUGH)
}

/** M2ts Ebp Placement
  */
type M2tsEbpPlacement = "VIDEO_AND_AUDIO_PIDS" | "VIDEO_PID"
object M2tsEbpPlacement {
  inline val VIDEO_AND_AUDIO_PIDS: "VIDEO_AND_AUDIO_PIDS" = "VIDEO_AND_AUDIO_PIDS"
  inline val VIDEO_PID: "VIDEO_PID" = "VIDEO_PID"

  inline def values: js.Array[M2tsEbpPlacement] = js.Array(VIDEO_AND_AUDIO_PIDS, VIDEO_PID)
}

/** M2ts Es Rate In Pes
  */
type M2tsEsRateInPes = "EXCLUDE" | "INCLUDE"
object M2tsEsRateInPes {
  inline val EXCLUDE: "EXCLUDE" = "EXCLUDE"
  inline val INCLUDE: "INCLUDE" = "INCLUDE"

  inline def values: js.Array[M2tsEsRateInPes] = js.Array(EXCLUDE, INCLUDE)
}

/** M2ts Klv
  */
type M2tsKlv = "NONE" | "PASSTHROUGH"
object M2tsKlv {
  inline val NONE: "NONE" = "NONE"
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  inline def values: js.Array[M2tsKlv] = js.Array(NONE, PASSTHROUGH)
}

/** M2ts Nielsen Id3 Behavior
  */
type M2tsNielsenId3Behavior = "NO_PASSTHROUGH" | "PASSTHROUGH"
object M2tsNielsenId3Behavior {
  inline val NO_PASSTHROUGH: "NO_PASSTHROUGH" = "NO_PASSTHROUGH"
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  inline def values: js.Array[M2tsNielsenId3Behavior] = js.Array(NO_PASSTHROUGH, PASSTHROUGH)
}

/** M2ts Pcr Control
  */
type M2tsPcrControl = "CONFIGURED_PCR_PERIOD" | "PCR_EVERY_PES_PACKET"
object M2tsPcrControl {
  inline val CONFIGURED_PCR_PERIOD: "CONFIGURED_PCR_PERIOD" = "CONFIGURED_PCR_PERIOD"
  inline val PCR_EVERY_PES_PACKET: "PCR_EVERY_PES_PACKET" = "PCR_EVERY_PES_PACKET"

  inline def values: js.Array[M2tsPcrControl] = js.Array(CONFIGURED_PCR_PERIOD, PCR_EVERY_PES_PACKET)
}

/** M2ts Rate Mode
  */
type M2tsRateMode = "CBR" | "VBR"
object M2tsRateMode {
  inline val CBR: "CBR" = "CBR"
  inline val VBR: "VBR" = "VBR"

  inline def values: js.Array[M2tsRateMode] = js.Array(CBR, VBR)
}

/** M2ts Scte35 Control
  */
type M2tsScte35Control = "NONE" | "PASSTHROUGH"
object M2tsScte35Control {
  inline val NONE: "NONE" = "NONE"
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  inline def values: js.Array[M2tsScte35Control] = js.Array(NONE, PASSTHROUGH)
}

/** M2ts Segmentation Markers
  */
type M2tsSegmentationMarkers = "EBP" | "EBP_LEGACY" | "NONE" | "PSI_SEGSTART" | "RAI_ADAPT" | "RAI_SEGSTART"
object M2tsSegmentationMarkers {
  inline val EBP: "EBP" = "EBP"
  inline val EBP_LEGACY: "EBP_LEGACY" = "EBP_LEGACY"
  inline val NONE: "NONE" = "NONE"
  inline val PSI_SEGSTART: "PSI_SEGSTART" = "PSI_SEGSTART"
  inline val RAI_ADAPT: "RAI_ADAPT" = "RAI_ADAPT"
  inline val RAI_SEGSTART: "RAI_SEGSTART" = "RAI_SEGSTART"

  inline def values: js.Array[M2tsSegmentationMarkers] = js.Array(EBP, EBP_LEGACY, NONE, PSI_SEGSTART, RAI_ADAPT, RAI_SEGSTART)
}

/** M2ts Segmentation Style
  */
type M2tsSegmentationStyle = "MAINTAIN_CADENCE" | "RESET_CADENCE"
object M2tsSegmentationStyle {
  inline val MAINTAIN_CADENCE: "MAINTAIN_CADENCE" = "MAINTAIN_CADENCE"
  inline val RESET_CADENCE: "RESET_CADENCE" = "RESET_CADENCE"

  inline def values: js.Array[M2tsSegmentationStyle] = js.Array(MAINTAIN_CADENCE, RESET_CADENCE)
}

/** M2ts Timed Metadata Behavior
  */
type M2tsTimedMetadataBehavior = "NO_PASSTHROUGH" | "PASSTHROUGH"
object M2tsTimedMetadataBehavior {
  inline val NO_PASSTHROUGH: "NO_PASSTHROUGH" = "NO_PASSTHROUGH"
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  inline def values: js.Array[M2tsTimedMetadataBehavior] = js.Array(NO_PASSTHROUGH, PASSTHROUGH)
}

/** M3u8 Nielsen Id3 Behavior
  */
type M3u8NielsenId3Behavior = "NO_PASSTHROUGH" | "PASSTHROUGH"
object M3u8NielsenId3Behavior {
  inline val NO_PASSTHROUGH: "NO_PASSTHROUGH" = "NO_PASSTHROUGH"
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  inline def values: js.Array[M3u8NielsenId3Behavior] = js.Array(NO_PASSTHROUGH, PASSTHROUGH)
}

/** M3u8 Pcr Control
  */
type M3u8PcrControl = "CONFIGURED_PCR_PERIOD" | "PCR_EVERY_PES_PACKET"
object M3u8PcrControl {
  inline val CONFIGURED_PCR_PERIOD: "CONFIGURED_PCR_PERIOD" = "CONFIGURED_PCR_PERIOD"
  inline val PCR_EVERY_PES_PACKET: "PCR_EVERY_PES_PACKET" = "PCR_EVERY_PES_PACKET"

  inline def values: js.Array[M3u8PcrControl] = js.Array(CONFIGURED_PCR_PERIOD, PCR_EVERY_PES_PACKET)
}

/** M3u8 Scte35 Behavior
  */
type M3u8Scte35Behavior = "NO_PASSTHROUGH" | "PASSTHROUGH"
object M3u8Scte35Behavior {
  inline val NO_PASSTHROUGH: "NO_PASSTHROUGH" = "NO_PASSTHROUGH"
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  inline def values: js.Array[M3u8Scte35Behavior] = js.Array(NO_PASSTHROUGH, PASSTHROUGH)
}

/** M3u8 Timed Metadata Behavior
  */
type M3u8TimedMetadataBehavior = "NO_PASSTHROUGH" | "PASSTHROUGH"
object M3u8TimedMetadataBehavior {
  inline val NO_PASSTHROUGH: "NO_PASSTHROUGH" = "NO_PASSTHROUGH"
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  inline def values: js.Array[M3u8TimedMetadataBehavior] = js.Array(NO_PASSTHROUGH, PASSTHROUGH)
}

/** Motion Graphics Insertion
  */
type MotionGraphicsInsertion = "DISABLED" | "ENABLED"
object MotionGraphicsInsertion {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[MotionGraphicsInsertion] = js.Array(DISABLED, ENABLED)
}

/** Mp2 Coding Mode
  */
type Mp2CodingMode = "CODING_MODE_1_0" | "CODING_MODE_2_0"
object Mp2CodingMode {
  inline val CODING_MODE_1_0: "CODING_MODE_1_0" = "CODING_MODE_1_0"
  inline val CODING_MODE_2_0: "CODING_MODE_2_0" = "CODING_MODE_2_0"

  inline def values: js.Array[Mp2CodingMode] = js.Array(CODING_MODE_1_0, CODING_MODE_2_0)
}

/** Mpeg2 Adaptive Quantization
  */
type Mpeg2AdaptiveQuantization = "AUTO" | "HIGH" | "LOW" | "MEDIUM" | "OFF"
object Mpeg2AdaptiveQuantization {
  inline val AUTO: "AUTO" = "AUTO"
  inline val HIGH: "HIGH" = "HIGH"
  inline val LOW: "LOW" = "LOW"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val OFF: "OFF" = "OFF"

  inline def values: js.Array[Mpeg2AdaptiveQuantization] = js.Array(AUTO, HIGH, LOW, MEDIUM, OFF)
}

/** Mpeg2 Color Metadata
  */
type Mpeg2ColorMetadata = "IGNORE" | "INSERT"
object Mpeg2ColorMetadata {
  inline val IGNORE: "IGNORE" = "IGNORE"
  inline val INSERT: "INSERT" = "INSERT"

  inline def values: js.Array[Mpeg2ColorMetadata] = js.Array(IGNORE, INSERT)
}

/** Mpeg2 Color Space
  */
type Mpeg2ColorSpace = "AUTO" | "PASSTHROUGH"
object Mpeg2ColorSpace {
  inline val AUTO: "AUTO" = "AUTO"
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  inline def values: js.Array[Mpeg2ColorSpace] = js.Array(AUTO, PASSTHROUGH)
}

/** Mpeg2 Display Ratio
  */
type Mpeg2DisplayRatio = "DISPLAYRATIO16X9" | "DISPLAYRATIO4X3"
object Mpeg2DisplayRatio {
  inline val DISPLAYRATIO16X9: "DISPLAYRATIO16X9" = "DISPLAYRATIO16X9"
  inline val DISPLAYRATIO4X3: "DISPLAYRATIO4X3" = "DISPLAYRATIO4X3"

  inline def values: js.Array[Mpeg2DisplayRatio] = js.Array(DISPLAYRATIO16X9, DISPLAYRATIO4X3)
}

/** Mpeg2 Gop Size Units
  */
type Mpeg2GopSizeUnits = "FRAMES" | "SECONDS"
object Mpeg2GopSizeUnits {
  inline val FRAMES: "FRAMES" = "FRAMES"
  inline val SECONDS: "SECONDS" = "SECONDS"

  inline def values: js.Array[Mpeg2GopSizeUnits] = js.Array(FRAMES, SECONDS)
}

/** Mpeg2 Scan Type
  */
type Mpeg2ScanType = "INTERLACED" | "PROGRESSIVE"
object Mpeg2ScanType {
  inline val INTERLACED: "INTERLACED" = "INTERLACED"
  inline val PROGRESSIVE: "PROGRESSIVE" = "PROGRESSIVE"

  inline def values: js.Array[Mpeg2ScanType] = js.Array(INTERLACED, PROGRESSIVE)
}

/** Mpeg2 Sub Gop Length
  */
type Mpeg2SubGopLength = "DYNAMIC" | "FIXED"
object Mpeg2SubGopLength {
  inline val DYNAMIC: "DYNAMIC" = "DYNAMIC"
  inline val FIXED: "FIXED" = "FIXED"

  inline def values: js.Array[Mpeg2SubGopLength] = js.Array(DYNAMIC, FIXED)
}

/** Mpeg2 Timecode Insertion Behavior
  */
type Mpeg2TimecodeInsertionBehavior = "DISABLED" | "GOP_TIMECODE"
object Mpeg2TimecodeInsertionBehavior {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val GOP_TIMECODE: "GOP_TIMECODE" = "GOP_TIMECODE"

  inline def values: js.Array[Mpeg2TimecodeInsertionBehavior] = js.Array(DISABLED, GOP_TIMECODE)
}

/** Ms Smooth H265 Packaging Type
  */
type MsSmoothH265PackagingType = "HEV1" | "HVC1"
object MsSmoothH265PackagingType {
  inline val HEV1: "HEV1" = "HEV1"
  inline val HVC1: "HVC1" = "HVC1"

  inline def values: js.Array[MsSmoothH265PackagingType] = js.Array(HEV1, HVC1)
}

/** The current state of the multiplex.
  */
type MultiplexState = "CREATING" | "CREATE_FAILED" | "IDLE" | "STARTING" | "RUNNING" | "RECOVERING" | "STOPPING" | "DELETING" | "DELETED"
object MultiplexState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val IDLE: "IDLE" = "IDLE"
  inline val STARTING: "STARTING" = "STARTING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val RECOVERING: "RECOVERING" = "RECOVERING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[MultiplexState] = js.Array(CREATING, CREATE_FAILED, IDLE, STARTING, RUNNING, RECOVERING, STOPPING, DELETING, DELETED)
}

/** Network Input Server Validation
  */
type NetworkInputServerValidation = "CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME" | "CHECK_CRYPTOGRAPHY_ONLY"
object NetworkInputServerValidation {
  inline val CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME: "CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME" = "CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME"
  inline val CHECK_CRYPTOGRAPHY_ONLY: "CHECK_CRYPTOGRAPHY_ONLY" = "CHECK_CRYPTOGRAPHY_ONLY"

  inline def values: js.Array[NetworkInputServerValidation] = js.Array(CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME, CHECK_CRYPTOGRAPHY_ONLY)
}

/** State of Nielsen PCM to ID3 tagging
  */
type NielsenPcmToId3TaggingState = "DISABLED" | "ENABLED"
object NielsenPcmToId3TaggingState {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[NielsenPcmToId3TaggingState] = js.Array(DISABLED, ENABLED)
}

/** Nielsen Watermarks Cbet Stepaside
  */
type NielsenWatermarksCbetStepaside = "DISABLED" | "ENABLED"
object NielsenWatermarksCbetStepaside {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[NielsenWatermarksCbetStepaside] = js.Array(DISABLED, ENABLED)
}

/** Nielsen Watermarks Distribution Types
  */
type NielsenWatermarksDistributionTypes = "FINAL_DISTRIBUTOR" | "PROGRAM_CONTENT"
object NielsenWatermarksDistributionTypes {
  inline val FINAL_DISTRIBUTOR: "FINAL_DISTRIBUTOR" = "FINAL_DISTRIBUTOR"
  inline val PROGRAM_CONTENT: "PROGRAM_CONTENT" = "PROGRAM_CONTENT"

  inline def values: js.Array[NielsenWatermarksDistributionTypes] = js.Array(FINAL_DISTRIBUTOR, PROGRAM_CONTENT)
}

/** Units for duration, e.g. 'MONTHS'
  */
type OfferingDurationUnits = "MONTHS"
object OfferingDurationUnits {
  inline val MONTHS: "MONTHS" = "MONTHS"

  inline def values: js.Array[OfferingDurationUnits] = js.Array(MONTHS)
}

/** Offering type, e.g. 'NO_UPFRONT'
  */
type OfferingType = "NO_UPFRONT"
object OfferingType {
  inline val NO_UPFRONT: "NO_UPFRONT" = "NO_UPFRONT"

  inline def values: js.Array[OfferingType] = js.Array(NO_UPFRONT)
}

/** Pipeline ID
  */
type PipelineId = "PIPELINE_0" | "PIPELINE_1"
object PipelineId {
  inline val PIPELINE_0: "PIPELINE_0" = "PIPELINE_0"
  inline val PIPELINE_1: "PIPELINE_1" = "PIPELINE_1"

  inline def values: js.Array[PipelineId] = js.Array(PIPELINE_0, PIPELINE_1)
}

/** Indicates which pipeline is preferred by the multiplex for program ingest. If set to \"PIPELINE_0\" or \"PIPELINE_1\" and an unhealthy ingest causes the multiplex to switch to the non-preferred pipeline, it will switch back once that ingest is healthy again. If set to \"CURRENTLY_ACTIVE\", it will not switch back to the other pipeline based on it recovering to a healthy state, it will only switch if the active pipeline becomes unhealthy.
  */
type PreferredChannelPipeline = "CURRENTLY_ACTIVE" | "PIPELINE_0" | "PIPELINE_1"
object PreferredChannelPipeline {
  inline val CURRENTLY_ACTIVE: "CURRENTLY_ACTIVE" = "CURRENTLY_ACTIVE"
  inline val PIPELINE_0: "PIPELINE_0" = "PIPELINE_0"
  inline val PIPELINE_1: "PIPELINE_1" = "PIPELINE_1"

  inline def values: js.Array[PreferredChannelPipeline] = js.Array(CURRENTLY_ACTIVE, PIPELINE_0, PIPELINE_1)
}

/** Codec, 'MPEG2', 'AVC', 'HEVC', or 'AUDIO'
  */
type ReservationCodec = "MPEG2" | "AVC" | "HEVC" | "AUDIO" | "LINK"
object ReservationCodec {
  inline val MPEG2: "MPEG2" = "MPEG2"
  inline val AVC: "AVC" = "AVC"
  inline val HEVC: "HEVC" = "HEVC"
  inline val AUDIO: "AUDIO" = "AUDIO"
  inline val LINK: "LINK" = "LINK"

  inline def values: js.Array[ReservationCodec] = js.Array(MPEG2, AVC, HEVC, AUDIO, LINK)
}

/** Maximum bitrate in megabits per second
  */
type ReservationMaximumBitrate = "MAX_10_MBPS" | "MAX_20_MBPS" | "MAX_50_MBPS"
object ReservationMaximumBitrate {
  inline val MAX_10_MBPS: "MAX_10_MBPS" = "MAX_10_MBPS"
  inline val MAX_20_MBPS: "MAX_20_MBPS" = "MAX_20_MBPS"
  inline val MAX_50_MBPS: "MAX_50_MBPS" = "MAX_50_MBPS"

  inline def values: js.Array[ReservationMaximumBitrate] = js.Array(MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS)
}

/** Maximum framerate in frames per second (Outputs only)
  */
type ReservationMaximumFramerate = "MAX_30_FPS" | "MAX_60_FPS"
object ReservationMaximumFramerate {
  inline val MAX_30_FPS: "MAX_30_FPS" = "MAX_30_FPS"
  inline val MAX_60_FPS: "MAX_60_FPS" = "MAX_60_FPS"

  inline def values: js.Array[ReservationMaximumFramerate] = js.Array(MAX_30_FPS, MAX_60_FPS)
}

/** Resolution based on lines of vertical resolution; SD is less than 720 lines, HD is 720 to 1080 lines, FHD is 1080 lines, UHD is greater than 1080 lines
  */
type ReservationResolution = "SD" | "HD" | "FHD" | "UHD"
object ReservationResolution {
  inline val SD: "SD" = "SD"
  inline val HD: "HD" = "HD"
  inline val FHD: "FHD" = "FHD"
  inline val UHD: "UHD" = "UHD"

  inline def values: js.Array[ReservationResolution] = js.Array(SD, HD, FHD, UHD)
}

/** Resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
  */
type ReservationResourceType = "INPUT" | "OUTPUT" | "MULTIPLEX" | "CHANNEL"
object ReservationResourceType {
  inline val INPUT: "INPUT" = "INPUT"
  inline val OUTPUT: "OUTPUT" = "OUTPUT"
  inline val MULTIPLEX: "MULTIPLEX" = "MULTIPLEX"
  inline val CHANNEL: "CHANNEL" = "CHANNEL"

  inline def values: js.Array[ReservationResourceType] = js.Array(INPUT, OUTPUT, MULTIPLEX, CHANNEL)
}

/** Special features, 'ADVANCED_AUDIO' 'AUDIO_NORMALIZATION' 'MGHD' or 'MGUHD'
  */
type ReservationSpecialFeature = "ADVANCED_AUDIO" | "AUDIO_NORMALIZATION" | "MGHD" | "MGUHD"
object ReservationSpecialFeature {
  inline val ADVANCED_AUDIO: "ADVANCED_AUDIO" = "ADVANCED_AUDIO"
  inline val AUDIO_NORMALIZATION: "AUDIO_NORMALIZATION" = "AUDIO_NORMALIZATION"
  inline val MGHD: "MGHD" = "MGHD"
  inline val MGUHD: "MGUHD" = "MGUHD"

  inline def values: js.Array[ReservationSpecialFeature] = js.Array(ADVANCED_AUDIO, AUDIO_NORMALIZATION, MGHD, MGUHD)
}

/** Current reservation state
  */
type ReservationState = "ACTIVE" | "EXPIRED" | "CANCELED" | "DELETED"
object ReservationState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val EXPIRED: "EXPIRED" = "EXPIRED"
  inline val CANCELED: "CANCELED" = "CANCELED"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[ReservationState] = js.Array(ACTIVE, EXPIRED, CANCELED, DELETED)
}

/** Video quality, e.g. 'STANDARD' (Outputs only)
  */
type ReservationVideoQuality = "STANDARD" | "ENHANCED" | "PREMIUM"
object ReservationVideoQuality {
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val ENHANCED: "ENHANCED" = "ENHANCED"
  inline val PREMIUM: "PREMIUM" = "PREMIUM"

  inline def values: js.Array[ReservationVideoQuality] = js.Array(STANDARD, ENHANCED, PREMIUM)
}

/** Rtmp Ad Markers
  */
type RtmpAdMarkers = "ON_CUE_POINT_SCTE35"
object RtmpAdMarkers {
  inline val ON_CUE_POINT_SCTE35: "ON_CUE_POINT_SCTE35" = "ON_CUE_POINT_SCTE35"

  inline def values: js.Array[RtmpAdMarkers] = js.Array(ON_CUE_POINT_SCTE35)
}

/** Rtmp Cache Full Behavior
  */
type RtmpCacheFullBehavior = "DISCONNECT_IMMEDIATELY" | "WAIT_FOR_SERVER"
object RtmpCacheFullBehavior {
  inline val DISCONNECT_IMMEDIATELY: "DISCONNECT_IMMEDIATELY" = "DISCONNECT_IMMEDIATELY"
  inline val WAIT_FOR_SERVER: "WAIT_FOR_SERVER" = "WAIT_FOR_SERVER"

  inline def values: js.Array[RtmpCacheFullBehavior] = js.Array(DISCONNECT_IMMEDIATELY, WAIT_FOR_SERVER)
}

/** Rtmp Caption Data
  */
type RtmpCaptionData = "ALL" | "FIELD1_608" | "FIELD1_AND_FIELD2_608"
object RtmpCaptionData {
  inline val ALL: "ALL" = "ALL"
  inline val FIELD1_608: "FIELD1_608" = "FIELD1_608"
  inline val FIELD1_AND_FIELD2_608: "FIELD1_AND_FIELD2_608" = "FIELD1_AND_FIELD2_608"

  inline def values: js.Array[RtmpCaptionData] = js.Array(ALL, FIELD1_608, FIELD1_AND_FIELD2_608)
}

/** Rtmp Output Certificate Mode
  */
type RtmpOutputCertificateMode = "SELF_SIGNED" | "VERIFY_AUTHENTICITY"
object RtmpOutputCertificateMode {
  inline val SELF_SIGNED: "SELF_SIGNED" = "SELF_SIGNED"
  inline val VERIFY_AUTHENTICITY: "VERIFY_AUTHENTICITY" = "VERIFY_AUTHENTICITY"

  inline def values: js.Array[RtmpOutputCertificateMode] = js.Array(SELF_SIGNED, VERIFY_AUTHENTICITY)
}

/** S3 Canned Acl
  */
type S3CannedAcl = "AUTHENTICATED_READ" | "BUCKET_OWNER_FULL_CONTROL" | "BUCKET_OWNER_READ" | "PUBLIC_READ"
object S3CannedAcl {
  inline val AUTHENTICATED_READ: "AUTHENTICATED_READ" = "AUTHENTICATED_READ"
  inline val BUCKET_OWNER_FULL_CONTROL: "BUCKET_OWNER_FULL_CONTROL" = "BUCKET_OWNER_FULL_CONTROL"
  inline val BUCKET_OWNER_READ: "BUCKET_OWNER_READ" = "BUCKET_OWNER_READ"
  inline val PUBLIC_READ: "PUBLIC_READ" = "PUBLIC_READ"

  inline def values: js.Array[S3CannedAcl] = js.Array(AUTHENTICATED_READ, BUCKET_OWNER_FULL_CONTROL, BUCKET_OWNER_READ, PUBLIC_READ)
}

/** Scte20 Convert608 To708
  */
type Scte20Convert608To708 = "DISABLED" | "UPCONVERT"
object Scte20Convert608To708 {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val UPCONVERT: "UPCONVERT" = "UPCONVERT"

  inline def values: js.Array[Scte20Convert608To708] = js.Array(DISABLED, UPCONVERT)
}

/** Scte27 Ocr Language
  */
type Scte27OcrLanguage = "DEU" | "ENG" | "FRA" | "NLD" | "POR" | "SPA"
object Scte27OcrLanguage {
  inline val DEU: "DEU" = "DEU"
  inline val ENG: "ENG" = "ENG"
  inline val FRA: "FRA" = "FRA"
  inline val NLD: "NLD" = "NLD"
  inline val POR: "POR" = "POR"
  inline val SPA: "SPA" = "SPA"

  inline def values: js.Array[Scte27OcrLanguage] = js.Array(DEU, ENG, FRA, NLD, POR, SPA)
}

/** Scte35 Apos No Regional Blackout Behavior
  */
type Scte35AposNoRegionalBlackoutBehavior = "FOLLOW" | "IGNORE"
object Scte35AposNoRegionalBlackoutBehavior {
  inline val FOLLOW: "FOLLOW" = "FOLLOW"
  inline val IGNORE: "IGNORE" = "IGNORE"

  inline def values: js.Array[Scte35AposNoRegionalBlackoutBehavior] = js.Array(FOLLOW, IGNORE)
}

/** Scte35 Apos Web Delivery Allowed Behavior
  */
type Scte35AposWebDeliveryAllowedBehavior = "FOLLOW" | "IGNORE"
object Scte35AposWebDeliveryAllowedBehavior {
  inline val FOLLOW: "FOLLOW" = "FOLLOW"
  inline val IGNORE: "IGNORE" = "IGNORE"

  inline def values: js.Array[Scte35AposWebDeliveryAllowedBehavior] = js.Array(FOLLOW, IGNORE)
}

/** Corresponds to the archive_allowed parameter. A value of ARCHIVE_NOT_ALLOWED corresponds to 0 (false) in the SCTE-35 specification. If you include one of the "restriction" flags then you must include all four of them.
  */
type Scte35ArchiveAllowedFlag = "ARCHIVE_NOT_ALLOWED" | "ARCHIVE_ALLOWED"
object Scte35ArchiveAllowedFlag {
  inline val ARCHIVE_NOT_ALLOWED: "ARCHIVE_NOT_ALLOWED" = "ARCHIVE_NOT_ALLOWED"
  inline val ARCHIVE_ALLOWED: "ARCHIVE_ALLOWED" = "ARCHIVE_ALLOWED"

  inline def values: js.Array[Scte35ArchiveAllowedFlag] = js.Array(ARCHIVE_NOT_ALLOWED, ARCHIVE_ALLOWED)
}

/** Corresponds to the device_restrictions parameter in a segmentation_descriptor. If you include one of the "restriction" flags then you must include all four of them.
  */
type Scte35DeviceRestrictions = "NONE" | "RESTRICT_GROUP0" | "RESTRICT_GROUP1" | "RESTRICT_GROUP2"
object Scte35DeviceRestrictions {
  inline val NONE: "NONE" = "NONE"
  inline val RESTRICT_GROUP0: "RESTRICT_GROUP0" = "RESTRICT_GROUP0"
  inline val RESTRICT_GROUP1: "RESTRICT_GROUP1" = "RESTRICT_GROUP1"
  inline val RESTRICT_GROUP2: "RESTRICT_GROUP2" = "RESTRICT_GROUP2"

  inline def values: js.Array[Scte35DeviceRestrictions] = js.Array(NONE, RESTRICT_GROUP0, RESTRICT_GROUP1, RESTRICT_GROUP2)
}

/** Corresponds to the no_regional_blackout_flag parameter. A value of REGIONAL_BLACKOUT corresponds to 0 (false) in the SCTE-35 specification. If you include one of the "restriction" flags then you must include all four of them.
  */
type Scte35NoRegionalBlackoutFlag = "REGIONAL_BLACKOUT" | "NO_REGIONAL_BLACKOUT"
object Scte35NoRegionalBlackoutFlag {
  inline val REGIONAL_BLACKOUT: "REGIONAL_BLACKOUT" = "REGIONAL_BLACKOUT"
  inline val NO_REGIONAL_BLACKOUT: "NO_REGIONAL_BLACKOUT" = "NO_REGIONAL_BLACKOUT"

  inline def values: js.Array[Scte35NoRegionalBlackoutFlag] = js.Array(REGIONAL_BLACKOUT, NO_REGIONAL_BLACKOUT)
}

/** Corresponds to SCTE-35 segmentation_event_cancel_indicator. SEGMENTATION_EVENT_NOT_CANCELED corresponds to 0 in the SCTE-35 specification and indicates that this is an insertion request. SEGMENTATION_EVENT_CANCELED corresponds to 1 in the SCTE-35 specification and indicates that this is a cancelation request, in which case complete this field and the existing event ID to cancel.
  */
type Scte35SegmentationCancelIndicator = "SEGMENTATION_EVENT_NOT_CANCELED" | "SEGMENTATION_EVENT_CANCELED"
object Scte35SegmentationCancelIndicator {
  inline val SEGMENTATION_EVENT_NOT_CANCELED: "SEGMENTATION_EVENT_NOT_CANCELED" = "SEGMENTATION_EVENT_NOT_CANCELED"
  inline val SEGMENTATION_EVENT_CANCELED: "SEGMENTATION_EVENT_CANCELED" = "SEGMENTATION_EVENT_CANCELED"

  inline def values: js.Array[Scte35SegmentationCancelIndicator] = js.Array(SEGMENTATION_EVENT_NOT_CANCELED, SEGMENTATION_EVENT_CANCELED)
}

/** Scte35 Splice Insert No Regional Blackout Behavior
  */
type Scte35SpliceInsertNoRegionalBlackoutBehavior = "FOLLOW" | "IGNORE"
object Scte35SpliceInsertNoRegionalBlackoutBehavior {
  inline val FOLLOW: "FOLLOW" = "FOLLOW"
  inline val IGNORE: "IGNORE" = "IGNORE"

  inline def values: js.Array[Scte35SpliceInsertNoRegionalBlackoutBehavior] = js.Array(FOLLOW, IGNORE)
}

/** Scte35 Splice Insert Web Delivery Allowed Behavior
  */
type Scte35SpliceInsertWebDeliveryAllowedBehavior = "FOLLOW" | "IGNORE"
object Scte35SpliceInsertWebDeliveryAllowedBehavior {
  inline val FOLLOW: "FOLLOW" = "FOLLOW"
  inline val IGNORE: "IGNORE" = "IGNORE"

  inline def values: js.Array[Scte35SpliceInsertWebDeliveryAllowedBehavior] = js.Array(FOLLOW, IGNORE)
}

/** Corresponds to the web_delivery_allowed_flag parameter. A value of WEB_DELIVERY_NOT_ALLOWED corresponds to 0 (false) in the SCTE-35 specification. If you include one of the "restriction" flags then you must include all four of them.
  */
type Scte35WebDeliveryAllowedFlag = "WEB_DELIVERY_NOT_ALLOWED" | "WEB_DELIVERY_ALLOWED"
object Scte35WebDeliveryAllowedFlag {
  inline val WEB_DELIVERY_NOT_ALLOWED: "WEB_DELIVERY_NOT_ALLOWED" = "WEB_DELIVERY_NOT_ALLOWED"
  inline val WEB_DELIVERY_ALLOWED: "WEB_DELIVERY_ALLOWED" = "WEB_DELIVERY_ALLOWED"

  inline def values: js.Array[Scte35WebDeliveryAllowedFlag] = js.Array(WEB_DELIVERY_NOT_ALLOWED, WEB_DELIVERY_ALLOWED)
}

/** Smooth Group Audio Only Timecode Control
  */
type SmoothGroupAudioOnlyTimecodeControl = "PASSTHROUGH" | "USE_CONFIGURED_CLOCK"
object SmoothGroupAudioOnlyTimecodeControl {
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"
  inline val USE_CONFIGURED_CLOCK: "USE_CONFIGURED_CLOCK" = "USE_CONFIGURED_CLOCK"

  inline def values: js.Array[SmoothGroupAudioOnlyTimecodeControl] = js.Array(PASSTHROUGH, USE_CONFIGURED_CLOCK)
}

/** Smooth Group Certificate Mode
  */
type SmoothGroupCertificateMode = "SELF_SIGNED" | "VERIFY_AUTHENTICITY"
object SmoothGroupCertificateMode {
  inline val SELF_SIGNED: "SELF_SIGNED" = "SELF_SIGNED"
  inline val VERIFY_AUTHENTICITY: "VERIFY_AUTHENTICITY" = "VERIFY_AUTHENTICITY"

  inline def values: js.Array[SmoothGroupCertificateMode] = js.Array(SELF_SIGNED, VERIFY_AUTHENTICITY)
}

/** Smooth Group Event Id Mode
  */
type SmoothGroupEventIdMode = "NO_EVENT_ID" | "USE_CONFIGURED" | "USE_TIMESTAMP"
object SmoothGroupEventIdMode {
  inline val NO_EVENT_ID: "NO_EVENT_ID" = "NO_EVENT_ID"
  inline val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"
  inline val USE_TIMESTAMP: "USE_TIMESTAMP" = "USE_TIMESTAMP"

  inline def values: js.Array[SmoothGroupEventIdMode] = js.Array(NO_EVENT_ID, USE_CONFIGURED, USE_TIMESTAMP)
}

/** Smooth Group Event Stop Behavior
  */
type SmoothGroupEventStopBehavior = "NONE" | "SEND_EOS"
object SmoothGroupEventStopBehavior {
  inline val NONE: "NONE" = "NONE"
  inline val SEND_EOS: "SEND_EOS" = "SEND_EOS"

  inline def values: js.Array[SmoothGroupEventStopBehavior] = js.Array(NONE, SEND_EOS)
}

/** Smooth Group Segmentation Mode
  */
type SmoothGroupSegmentationMode = "USE_INPUT_SEGMENTATION" | "USE_SEGMENT_DURATION"
object SmoothGroupSegmentationMode {
  inline val USE_INPUT_SEGMENTATION: "USE_INPUT_SEGMENTATION" = "USE_INPUT_SEGMENTATION"
  inline val USE_SEGMENT_DURATION: "USE_SEGMENT_DURATION" = "USE_SEGMENT_DURATION"

  inline def values: js.Array[SmoothGroupSegmentationMode] = js.Array(USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION)
}

/** Smooth Group Sparse Track Type
  */
type SmoothGroupSparseTrackType = "NONE" | "SCTE_35" | "SCTE_35_WITHOUT_SEGMENTATION"
object SmoothGroupSparseTrackType {
  inline val NONE: "NONE" = "NONE"
  inline val SCTE_35: "SCTE_35" = "SCTE_35"
  inline val SCTE_35_WITHOUT_SEGMENTATION: "SCTE_35_WITHOUT_SEGMENTATION" = "SCTE_35_WITHOUT_SEGMENTATION"

  inline def values: js.Array[SmoothGroupSparseTrackType] = js.Array(NONE, SCTE_35, SCTE_35_WITHOUT_SEGMENTATION)
}

/** Smooth Group Stream Manifest Behavior
  */
type SmoothGroupStreamManifestBehavior = "DO_NOT_SEND" | "SEND"
object SmoothGroupStreamManifestBehavior {
  inline val DO_NOT_SEND: "DO_NOT_SEND" = "DO_NOT_SEND"
  inline val SEND: "SEND" = "SEND"

  inline def values: js.Array[SmoothGroupStreamManifestBehavior] = js.Array(DO_NOT_SEND, SEND)
}

/** Smooth Group Timestamp Offset Mode
  */
type SmoothGroupTimestampOffsetMode = "USE_CONFIGURED_OFFSET" | "USE_EVENT_START_DATE"
object SmoothGroupTimestampOffsetMode {
  inline val USE_CONFIGURED_OFFSET: "USE_CONFIGURED_OFFSET" = "USE_CONFIGURED_OFFSET"
  inline val USE_EVENT_START_DATE: "USE_EVENT_START_DATE" = "USE_EVENT_START_DATE"

  inline def values: js.Array[SmoothGroupTimestampOffsetMode] = js.Array(USE_CONFIGURED_OFFSET, USE_EVENT_START_DATE)
}

/** Smpte2038 Data Preference
  */
type Smpte2038DataPreference = "IGNORE" | "PREFER"
object Smpte2038DataPreference {
  inline val IGNORE: "IGNORE" = "IGNORE"
  inline val PREFER: "PREFER" = "PREFER"

  inline def values: js.Array[Smpte2038DataPreference] = js.Array(IGNORE, PREFER)
}

/** Temporal Filter Post Filter Sharpening
  */
type TemporalFilterPostFilterSharpening = "AUTO" | "DISABLED" | "ENABLED"
object TemporalFilterPostFilterSharpening {
  inline val AUTO: "AUTO" = "AUTO"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[TemporalFilterPostFilterSharpening] = js.Array(AUTO, DISABLED, ENABLED)
}

/** Temporal Filter Strength
  */
type TemporalFilterStrength = "AUTO" | "STRENGTH_1" | "STRENGTH_2" | "STRENGTH_3" | "STRENGTH_4" | "STRENGTH_5" | "STRENGTH_6" | "STRENGTH_7" | "STRENGTH_8" | "STRENGTH_9" | "STRENGTH_10" | "STRENGTH_11" | "STRENGTH_12" | "STRENGTH_13" | "STRENGTH_14" | "STRENGTH_15" | "STRENGTH_16"
object TemporalFilterStrength {
  inline val AUTO: "AUTO" = "AUTO"
  inline val STRENGTH_1: "STRENGTH_1" = "STRENGTH_1"
  inline val STRENGTH_2: "STRENGTH_2" = "STRENGTH_2"
  inline val STRENGTH_3: "STRENGTH_3" = "STRENGTH_3"
  inline val STRENGTH_4: "STRENGTH_4" = "STRENGTH_4"
  inline val STRENGTH_5: "STRENGTH_5" = "STRENGTH_5"
  inline val STRENGTH_6: "STRENGTH_6" = "STRENGTH_6"
  inline val STRENGTH_7: "STRENGTH_7" = "STRENGTH_7"
  inline val STRENGTH_8: "STRENGTH_8" = "STRENGTH_8"
  inline val STRENGTH_9: "STRENGTH_9" = "STRENGTH_9"
  inline val STRENGTH_10: "STRENGTH_10" = "STRENGTH_10"
  inline val STRENGTH_11: "STRENGTH_11" = "STRENGTH_11"
  inline val STRENGTH_12: "STRENGTH_12" = "STRENGTH_12"
  inline val STRENGTH_13: "STRENGTH_13" = "STRENGTH_13"
  inline val STRENGTH_14: "STRENGTH_14" = "STRENGTH_14"
  inline val STRENGTH_15: "STRENGTH_15" = "STRENGTH_15"
  inline val STRENGTH_16: "STRENGTH_16" = "STRENGTH_16"

  inline def values: js.Array[TemporalFilterStrength] = js.Array(
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
  inline val EMBEDDED: "EMBEDDED" = "EMBEDDED"
  inline val SYSTEMCLOCK: "SYSTEMCLOCK" = "SYSTEMCLOCK"
  inline val ZEROBASED: "ZEROBASED" = "ZEROBASED"

  inline def values: js.Array[TimecodeConfigSource] = js.Array(EMBEDDED, SYSTEMCLOCK, ZEROBASED)
}

/** Ttml Destination Style Control
  */
type TtmlDestinationStyleControl = "PASSTHROUGH" | "USE_CONFIGURED"
object TtmlDestinationStyleControl {
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"
  inline val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"

  inline def values: js.Array[TtmlDestinationStyleControl] = js.Array(PASSTHROUGH, USE_CONFIGURED)
}

/** Udp Timed Metadata Id3 Frame
  */
type UdpTimedMetadataId3Frame = "NONE" | "PRIV" | "TDRL"
object UdpTimedMetadataId3Frame {
  inline val NONE: "NONE" = "NONE"
  inline val PRIV: "PRIV" = "PRIV"
  inline val TDRL: "TDRL" = "TDRL"

  inline def values: js.Array[UdpTimedMetadataId3Frame] = js.Array(NONE, PRIV, TDRL)
}

/** Video Description Respond To Afd
  */
type VideoDescriptionRespondToAfd = "NONE" | "PASSTHROUGH" | "RESPOND"
object VideoDescriptionRespondToAfd {
  inline val NONE: "NONE" = "NONE"
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"
  inline val RESPOND: "RESPOND" = "RESPOND"

  inline def values: js.Array[VideoDescriptionRespondToAfd] = js.Array(NONE, PASSTHROUGH, RESPOND)
}

/** Video Description Scaling Behavior
  */
type VideoDescriptionScalingBehavior = "DEFAULT" | "STRETCH_TO_OUTPUT"
object VideoDescriptionScalingBehavior {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val STRETCH_TO_OUTPUT: "STRETCH_TO_OUTPUT" = "STRETCH_TO_OUTPUT"

  inline def values: js.Array[VideoDescriptionScalingBehavior] = js.Array(DEFAULT, STRETCH_TO_OUTPUT)
}

/** Video Selector Color Space
  */
type VideoSelectorColorSpace = "FOLLOW" | "HDR10" | "HLG_2020" | "REC_601" | "REC_709"
object VideoSelectorColorSpace {
  inline val FOLLOW: "FOLLOW" = "FOLLOW"
  inline val HDR10: "HDR10" = "HDR10"
  inline val HLG_2020: "HLG_2020" = "HLG_2020"
  inline val REC_601: "REC_601" = "REC_601"
  inline val REC_709: "REC_709" = "REC_709"

  inline def values: js.Array[VideoSelectorColorSpace] = js.Array(FOLLOW, HDR10, HLG_2020, REC_601, REC_709)
}

/** Video Selector Color Space Usage
  */
type VideoSelectorColorSpaceUsage = "FALLBACK" | "FORCE"
object VideoSelectorColorSpaceUsage {
  inline val FALLBACK: "FALLBACK" = "FALLBACK"
  inline val FORCE: "FORCE" = "FORCE"

  inline def values: js.Array[VideoSelectorColorSpaceUsage] = js.Array(FALLBACK, FORCE)
}

/** Wav Coding Mode
  */
type WavCodingMode = "CODING_MODE_1_0" | "CODING_MODE_2_0" | "CODING_MODE_4_0" | "CODING_MODE_8_0"
object WavCodingMode {
  inline val CODING_MODE_1_0: "CODING_MODE_1_0" = "CODING_MODE_1_0"
  inline val CODING_MODE_2_0: "CODING_MODE_2_0" = "CODING_MODE_2_0"
  inline val CODING_MODE_4_0: "CODING_MODE_4_0" = "CODING_MODE_4_0"
  inline val CODING_MODE_8_0: "CODING_MODE_8_0" = "CODING_MODE_8_0"

  inline def values: js.Array[WavCodingMode] = js.Array(CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_4_0, CODING_MODE_8_0)
}

/** Webvtt Destination Style Control
  */
type WebvttDestinationStyleControl = "NO_STYLE_DATA" | "PASSTHROUGH"
object WebvttDestinationStyleControl {
  inline val NO_STYLE_DATA: "NO_STYLE_DATA" = "NO_STYLE_DATA"
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  inline def values: js.Array[WebvttDestinationStyleControl] = js.Array(NO_STYLE_DATA, PASSTHROUGH)
}
