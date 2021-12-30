package facade.amazonaws.services.mediaconvert

import scalajs.js

/** Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio + audio description (AD) as a stereo pair. The value for AudioType will be set to 3, which signals to downstream systems that this stream contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does not perform the mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any values you provide in AudioType and FollowInputAudioType. Choose NORMAL when the input does not contain pre-mixed audio + audio description (AD). In this case, the encoder will use any values you provide for AudioType and FollowInputAudioType.
  */
type AacAudioDescriptionBroadcasterMix = "BROADCASTER_MIXED_AD" | "NORMAL"
object AacAudioDescriptionBroadcasterMix {
  inline val BROADCASTER_MIXED_AD: "BROADCASTER_MIXED_AD" = "BROADCASTER_MIXED_AD"
  inline val NORMAL: "NORMAL" = "NORMAL"

  inline def values: js.Array[AacAudioDescriptionBroadcasterMix] = js.Array(BROADCASTER_MIXED_AD, NORMAL)
}

/** AAC Profile.
  */
type AacCodecProfile = "LC" | "HEV1" | "HEV2"
object AacCodecProfile {
  inline val LC: "LC" = "LC"
  inline val HEV1: "HEV1" = "HEV1"
  inline val HEV2: "HEV2" = "HEV2"

  inline def values: js.Array[AacCodecProfile] = js.Array(LC, HEV1, HEV2)
}

/** Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. "1.0 - Audio Description (Receiver Mix)" setting receives a stereo description plus control track and emits a mono AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
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

/** Rate Control Mode.
  */
type AacRateControlMode = "CBR" | "VBR"
object AacRateControlMode {
  inline val CBR: "CBR" = "CBR"
  inline val VBR: "VBR" = "VBR"

  inline def values: js.Array[AacRateControlMode] = js.Array(CBR, VBR)
}

/** Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an output, you must choose "No container" for the output container.
  */
type AacRawFormat = "LATM_LOAS" | "NONE"
object AacRawFormat {
  inline val LATM_LOAS: "LATM_LOAS" = "LATM_LOAS"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[AacRawFormat] = js.Array(LATM_LOAS, NONE)
}

/** Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
  */
type AacSpecification = "MPEG2" | "MPEG4"
object AacSpecification {
  inline val MPEG2: "MPEG2" = "MPEG2"
  inline val MPEG4: "MPEG4" = "MPEG4"

  inline def values: js.Array[AacSpecification] = js.Array(MPEG2, MPEG4)
}

/** VBR Quality Level - Only used if rate_control_mode is VBR.
  */
type AacVbrQuality = "LOW" | "MEDIUM_LOW" | "MEDIUM_HIGH" | "HIGH"
object AacVbrQuality {
  inline val LOW: "LOW" = "LOW"
  inline val MEDIUM_LOW: "MEDIUM_LOW" = "MEDIUM_LOW"
  inline val MEDIUM_HIGH: "MEDIUM_HIGH" = "MEDIUM_HIGH"
  inline val HIGH: "HIGH" = "HIGH"

  inline def values: js.Array[AacVbrQuality] = js.Array(LOW, MEDIUM_LOW, MEDIUM_HIGH, HIGH)
}

/** Specify the bitstream mode for the AC-3 stream that the encoder emits. For more information about the AC3 bitstream mode, see ATSC A/52-2012 (Annex E).
  */
type Ac3BitstreamMode = "COMPLETE_MAIN" | "COMMENTARY" | "DIALOGUE" | "EMERGENCY" | "HEARING_IMPAIRED" | "MUSIC_AND_EFFECTS" | "VISUALLY_IMPAIRED" | "VOICE_OVER"
object Ac3BitstreamMode {
  inline val COMPLETE_MAIN: "COMPLETE_MAIN" = "COMPLETE_MAIN"
  inline val COMMENTARY: "COMMENTARY" = "COMMENTARY"
  inline val DIALOGUE: "DIALOGUE" = "DIALOGUE"
  inline val EMERGENCY: "EMERGENCY" = "EMERGENCY"
  inline val HEARING_IMPAIRED: "HEARING_IMPAIRED" = "HEARING_IMPAIRED"
  inline val MUSIC_AND_EFFECTS: "MUSIC_AND_EFFECTS" = "MUSIC_AND_EFFECTS"
  inline val VISUALLY_IMPAIRED: "VISUALLY_IMPAIRED" = "VISUALLY_IMPAIRED"
  inline val VOICE_OVER: "VOICE_OVER" = "VOICE_OVER"

  inline def values: js.Array[Ac3BitstreamMode] = js.Array(COMPLETE_MAIN, COMMENTARY, DIALOGUE, EMERGENCY, HEARING_IMPAIRED, MUSIC_AND_EFFECTS, VISUALLY_IMPAIRED, VOICE_OVER)
}

/** Dolby Digital coding mode. Determines number of channels.
  */
type Ac3CodingMode = "CODING_MODE_1_0" | "CODING_MODE_1_1" | "CODING_MODE_2_0" | "CODING_MODE_3_2_LFE"
object Ac3CodingMode {
  inline val CODING_MODE_1_0: "CODING_MODE_1_0" = "CODING_MODE_1_0"
  inline val CODING_MODE_1_1: "CODING_MODE_1_1" = "CODING_MODE_1_1"
  inline val CODING_MODE_2_0: "CODING_MODE_2_0" = "CODING_MODE_2_0"
  inline val CODING_MODE_3_2_LFE: "CODING_MODE_3_2_LFE" = "CODING_MODE_3_2_LFE"

  inline def values: js.Array[Ac3CodingMode] = js.Array(CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0, CODING_MODE_3_2_LFE)
}

/** Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the Dolby Digital stream for the line operating mode. Related setting: When you use this setting, MediaConvert ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
  */
type Ac3DynamicRangeCompressionLine = "FILM_STANDARD" | "FILM_LIGHT" | "MUSIC_STANDARD" | "MUSIC_LIGHT" | "SPEECH" | "NONE"
object Ac3DynamicRangeCompressionLine {
  inline val FILM_STANDARD: "FILM_STANDARD" = "FILM_STANDARD"
  inline val FILM_LIGHT: "FILM_LIGHT" = "FILM_LIGHT"
  inline val MUSIC_STANDARD: "MUSIC_STANDARD" = "MUSIC_STANDARD"
  inline val MUSIC_LIGHT: "MUSIC_LIGHT" = "MUSIC_LIGHT"
  inline val SPEECH: "SPEECH" = "SPEECH"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[Ac3DynamicRangeCompressionLine] = js.Array(FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH, NONE)
}

/** When you want to add Dolby dynamic range compression (DRC) signaling to your output stream, we recommend that you use the mode-specific settings instead of Dynamic range compression profile (DynamicRangeCompressionProfile). The mode-specific settings are Dynamic range compression profile, line mode (dynamicRangeCompressionLine) and Dynamic range compression profile, RF mode (dynamicRangeCompressionRf). Note that when you specify values for all three settings, MediaConvert ignores the value of this setting in favor of the mode-specific settings. If you do use this setting instead of the mode-specific settings, choose None (NONE) to leave out DRC signaling. Keep the default Film standard (FILM_STANDARD) to set the profile to Dolby's film standard profile for all operating modes.
  */
type Ac3DynamicRangeCompressionProfile = "FILM_STANDARD" | "NONE"
object Ac3DynamicRangeCompressionProfile {
  inline val FILM_STANDARD: "FILM_STANDARD" = "FILM_STANDARD"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[Ac3DynamicRangeCompressionProfile] = js.Array(FILM_STANDARD, NONE)
}

/** Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the Dolby Digital stream for the RF operating mode. Related setting: When you use this setting, MediaConvert ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
  */
type Ac3DynamicRangeCompressionRf = "FILM_STANDARD" | "FILM_LIGHT" | "MUSIC_STANDARD" | "MUSIC_LIGHT" | "SPEECH" | "NONE"
object Ac3DynamicRangeCompressionRf {
  inline val FILM_STANDARD: "FILM_STANDARD" = "FILM_STANDARD"
  inline val FILM_LIGHT: "FILM_LIGHT" = "FILM_LIGHT"
  inline val MUSIC_STANDARD: "MUSIC_STANDARD" = "MUSIC_STANDARD"
  inline val MUSIC_LIGHT: "MUSIC_LIGHT" = "MUSIC_LIGHT"
  inline val SPEECH: "SPEECH" = "SPEECH"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[Ac3DynamicRangeCompressionRf] = js.Array(FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH, NONE)
}

/** Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
  */
type Ac3LfeFilter = "ENABLED" | "DISABLED"
object Ac3LfeFilter {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[Ac3LfeFilter] = js.Array(ENABLED, DISABLED)
}

/** When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
  */
type Ac3MetadataControl = "FOLLOW_INPUT" | "USE_CONFIGURED"
object Ac3MetadataControl {
  inline val FOLLOW_INPUT: "FOLLOW_INPUT" = "FOLLOW_INPUT"
  inline val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"

  inline def values: js.Array[Ac3MetadataControl] = js.Array(FOLLOW_INPUT, USE_CONFIGURED)
}

/** Specify whether the service runs your job with accelerated transcoding. Choose DISABLED if you don't want accelerated transcoding. Choose ENABLED if you want your job to run with accelerated transcoding and to fail if your input files or your job settings aren't compatible with accelerated transcoding. Choose PREFERRED if you want your job to run with accelerated transcoding if the job is compatible with the feature and to run at standard speed if it's not.
  */
type AccelerationMode = "DISABLED" | "ENABLED" | "PREFERRED"
object AccelerationMode {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val PREFERRED: "PREFERRED" = "PREFERRED"

  inline def values: js.Array[AccelerationMode] = js.Array(DISABLED, ENABLED, PREFERRED)
}

/** Describes whether the current job is running with accelerated transcoding. For jobs that have Acceleration (AccelerationMode) set to DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have Acceleration (AccelerationMode) set to ENABLED or PREFERRED, AccelerationStatus is one of the other states. AccelerationStatus is IN_PROGRESS initially, while the service determines whether the input files and job settings are compatible with accelerated transcoding. If they are, AcclerationStatus is ACCELERATED. If your input files and job settings aren't compatible with accelerated transcoding, the service either fails your job or runs it without accelerated transcoding, depending on how you set Acceleration (AccelerationMode). When the service runs your job without accelerated transcoding, AccelerationStatus is NOT_ACCELERATED.
  */
type AccelerationStatus = "NOT_APPLICABLE" | "IN_PROGRESS" | "ACCELERATED" | "NOT_ACCELERATED"
object AccelerationStatus {
  inline val NOT_APPLICABLE: "NOT_APPLICABLE" = "NOT_APPLICABLE"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val ACCELERATED: "ACCELERATED" = "ACCELERATED"
  inline val NOT_ACCELERATED: "NOT_ACCELERATED" = "NOT_ACCELERATED"

  inline def values: js.Array[AccelerationStatus] = js.Array(NOT_APPLICABLE, IN_PROGRESS, ACCELERATED, NOT_ACCELERATED)
}

/** This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert AFD signaling (AfdSignaling) to specify whether the service includes AFD values in the output video data and what those values are. * Choose None to remove all AFD values from this output. * Choose Fixed to ignore input AFD values and instead encode the value specified in the job. * Choose Auto to calculate output AFD values based on the input AFD scaler data.
  */
type AfdSignaling = "NONE" | "AUTO" | "FIXED"
object AfdSignaling {
  inline val NONE: "NONE" = "NONE"
  inline val AUTO: "AUTO" = "AUTO"
  inline val FIXED: "FIXED" = "FIXED"

  inline def values: js.Array[AfdSignaling] = js.Array(NONE, AUTO, FIXED)
}

/** Ignore this setting unless this input is a QuickTime animation with an alpha channel. Use this setting to create separate Key and Fill outputs. In each output, specify which part of the input MediaConvert uses. Leave this setting at the default value DISCARD to delete the alpha channel and preserve the video. Set it to REMAP_TO_LUMA to delete the video and map the alpha channel to the luma channel of your outputs.
  */
type AlphaBehavior = "DISCARD" | "REMAP_TO_LUMA"
object AlphaBehavior {
  inline val DISCARD: "DISCARD" = "DISCARD"
  inline val REMAP_TO_LUMA: "REMAP_TO_LUMA" = "REMAP_TO_LUMA"

  inline def values: js.Array[AlphaBehavior] = js.Array(DISCARD, REMAP_TO_LUMA)
}

/** Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
  */
type AncillaryConvert608To708 = "UPCONVERT" | "DISABLED"
object AncillaryConvert608To708 {
  inline val UPCONVERT: "UPCONVERT" = "UPCONVERT"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[AncillaryConvert608To708] = js.Array(UPCONVERT, DISABLED)
}

/** By default, the service terminates any unterminated captions at the end of each input. If you want the caption to continue onto your next input, disable this setting.
  */
type AncillaryTerminateCaptions = "END_OF_INPUT" | "DISABLED"
object AncillaryTerminateCaptions {
  inline val END_OF_INPUT: "END_OF_INPUT" = "END_OF_INPUT"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[AncillaryTerminateCaptions] = js.Array(END_OF_INPUT, DISABLED)
}

/** The anti-alias filter is automatically applied to all outputs. The service no longer accepts the value DISABLED for AntiAlias. If you specify that in your job, the service will ignore the setting.
  */
type AntiAlias = "DISABLED" | "ENABLED"
object AntiAlias {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[AntiAlias] = js.Array(DISABLED, ENABLED)
}

/** You can add a tag for this mono-channel audio track to mimic its placement in a multi-channel layout. For example, if this track is the left surround channel, choose Left surround (LS).
  */
type AudioChannelTag = "L" | "R" | "C" | "LFE" | "LS" | "RS" | "LC" | "RC" | "CS" | "LSD" | "RSD" | "TCS" | "VHL" | "VHC" | "VHR"
object AudioChannelTag {
  inline val L: "L" = "L"
  inline val R: "R" = "R"
  inline val C: "C" = "C"
  inline val LFE: "LFE" = "LFE"
  inline val LS: "LS" = "LS"
  inline val RS: "RS" = "RS"
  inline val LC: "LC" = "LC"
  inline val RC: "RC" = "RC"
  inline val CS: "CS" = "CS"
  inline val LSD: "LSD" = "LSD"
  inline val RSD: "RSD" = "RSD"
  inline val TCS: "TCS" = "TCS"
  inline val VHL: "VHL" = "VHL"
  inline val VHC: "VHC" = "VHC"
  inline val VHR: "VHR" = "VHR"

  inline def values: js.Array[AudioChannelTag] = js.Array(L, R, C, LFE, LS, RS, LC, RC, CS, LSD, RSD, TCS, VHL, VHC, VHR)
}

/** Type of Audio codec.
  */
type AudioCodec = "AAC" | "MP2" | "MP3" | "WAV" | "AIFF" | "AC3" | "EAC3" | "EAC3_ATMOS" | "VORBIS" | "OPUS" | "PASSTHROUGH"
object AudioCodec {
  inline val AAC: "AAC" = "AAC"
  inline val MP2: "MP2" = "MP2"
  inline val MP3: "MP3" = "MP3"
  inline val WAV: "WAV" = "WAV"
  inline val AIFF: "AIFF" = "AIFF"
  inline val AC3: "AC3" = "AC3"
  inline val EAC3: "EAC3" = "EAC3"
  inline val EAC3_ATMOS: "EAC3_ATMOS" = "EAC3_ATMOS"
  inline val VORBIS: "VORBIS" = "VORBIS"
  inline val OPUS: "OPUS" = "OPUS"
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  inline def values: js.Array[AudioCodec] = js.Array(AAC, MP2, MP3, WAV, AIFF, AC3, EAC3, EAC3_ATMOS, VORBIS, OPUS, PASSTHROUGH)
}

/** Enable this setting on one audio selector to set it as the default for the job. The service uses this default for outputs where it can't find the specified input audio. If you don't set a default, those outputs have no audio.
  */
type AudioDefaultSelection = "DEFAULT" | "NOT_DEFAULT"
object AudioDefaultSelection {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val NOT_DEFAULT: "NOT_DEFAULT" = "NOT_DEFAULT"

  inline def values: js.Array[AudioDefaultSelection] = js.Array(DEFAULT, NOT_DEFAULT)
}

/** Specify which source for language code takes precedence for this audio track. When you choose Follow input (FOLLOW_INPUT), the service uses the language code from the input track if it's present. If there's no languge code on the input track, the service uses the code that you specify in the setting Language code (languageCode or customLanguageCode). When you choose Use configured (USE_CONFIGURED), the service uses the language code that you specify.
  */
type AudioLanguageCodeControl = "FOLLOW_INPUT" | "USE_CONFIGURED"
object AudioLanguageCodeControl {
  inline val FOLLOW_INPUT: "FOLLOW_INPUT" = "FOLLOW_INPUT"
  inline val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"

  inline def values: js.Array[AudioLanguageCodeControl] = js.Array(FOLLOW_INPUT, USE_CONFIGURED)
}

/** Choose one of the following audio normalization algorithms: ITU-R BS.1770-1: Ungated loudness. A measurement of ungated average loudness for an entire piece of content, suitable for measurement of short-form content under ATSC recommendation A/85. Supports up to 5.1 audio channels. ITU-R BS.1770-2: Gated loudness. A measurement of gated average loudness compliant with the requirements of EBU-R128. Supports up to 5.1 audio channels. ITU-R BS.1770-3: Modified peak. The same loudness measurement algorithm as 1770-2, with an updated true peak measurement. ITU-R BS.1770-4: Higher channel count. Allows for more audio channels than the other algorithms, including configurations such as 7.1.
  */
type AudioNormalizationAlgorithm = "ITU_BS_1770_1" | "ITU_BS_1770_2" | "ITU_BS_1770_3" | "ITU_BS_1770_4"
object AudioNormalizationAlgorithm {
  inline val ITU_BS_1770_1: "ITU_BS_1770_1" = "ITU_BS_1770_1"
  inline val ITU_BS_1770_2: "ITU_BS_1770_2" = "ITU_BS_1770_2"
  inline val ITU_BS_1770_3: "ITU_BS_1770_3" = "ITU_BS_1770_3"
  inline val ITU_BS_1770_4: "ITU_BS_1770_4" = "ITU_BS_1770_4"

  inline def values: js.Array[AudioNormalizationAlgorithm] = js.Array(ITU_BS_1770_1, ITU_BS_1770_2, ITU_BS_1770_3, ITU_BS_1770_4)
}

/** When enabled the output audio is corrected using the chosen algorithm. If disabled, the audio will be measured but not adjusted.
  */
type AudioNormalizationAlgorithmControl = "CORRECT_AUDIO" | "MEASURE_ONLY"
object AudioNormalizationAlgorithmControl {
  inline val CORRECT_AUDIO: "CORRECT_AUDIO" = "CORRECT_AUDIO"
  inline val MEASURE_ONLY: "MEASURE_ONLY" = "MEASURE_ONLY"

  inline def values: js.Array[AudioNormalizationAlgorithmControl] = js.Array(CORRECT_AUDIO, MEASURE_ONLY)
}

/** If set to LOG, log each output's audio track loudness to a CSV file.
  */
type AudioNormalizationLoudnessLogging = "LOG" | "DONT_LOG"
object AudioNormalizationLoudnessLogging {
  inline val LOG: "LOG" = "LOG"
  inline val DONT_LOG: "DONT_LOG" = "DONT_LOG"

  inline def values: js.Array[AudioNormalizationLoudnessLogging] = js.Array(LOG, DONT_LOG)
}

/** If set to TRUE_PEAK, calculate and log the TruePeak for each output's audio track loudness.
  */
type AudioNormalizationPeakCalculation = "TRUE_PEAK" | "NONE"
object AudioNormalizationPeakCalculation {
  inline val TRUE_PEAK: "TRUE_PEAK" = "TRUE_PEAK"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[AudioNormalizationPeakCalculation] = js.Array(TRUE_PEAK, NONE)
}

/** Specifies the type of the audio selector.
  */
type AudioSelectorType = "PID" | "TRACK" | "LANGUAGE_CODE"
object AudioSelectorType {
  inline val PID: "PID" = "PID"
  inline val TRACK: "TRACK" = "TRACK"
  inline val LANGUAGE_CODE: "LANGUAGE_CODE" = "LANGUAGE_CODE"

  inline def values: js.Array[AudioSelectorType] = js.Array(PID, TRACK, LANGUAGE_CODE)
}

/** When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise the value in Audio Type is included in the output. Note that this field and audioType are both ignored if audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
  */
type AudioTypeControl = "FOLLOW_INPUT" | "USE_CONFIGURED"
object AudioTypeControl {
  inline val FOLLOW_INPUT: "FOLLOW_INPUT" = "FOLLOW_INPUT"
  inline val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"

  inline def values: js.Array[AudioTypeControl] = js.Array(FOLLOW_INPUT, USE_CONFIGURED)
}

/** Specify the strength of any adaptive quantization filters that you enable. The value that you choose here applies to Spatial adaptive quantization (spatialAdaptiveQuantization).
  */
type Av1AdaptiveQuantization = "OFF" | "LOW" | "MEDIUM" | "HIGH" | "HIGHER" | "MAX"
object Av1AdaptiveQuantization {
  inline val OFF: "OFF" = "OFF"
  inline val LOW: "LOW" = "LOW"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val HIGH: "HIGH" = "HIGH"
  inline val HIGHER: "HIGHER" = "HIGHER"
  inline val MAX: "MAX" = "MAX"

  inline def values: js.Array[Av1AdaptiveQuantization] = js.Array(OFF, LOW, MEDIUM, HIGH, HIGHER, MAX)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
type Av1FramerateControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object Av1FramerateControl {
  inline val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  inline val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  inline def values: js.Array[Av1FramerateControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
type Av1FramerateConversionAlgorithm = "DUPLICATE_DROP" | "INTERPOLATE" | "FRAMEFORMER"
object Av1FramerateConversionAlgorithm {
  inline val DUPLICATE_DROP: "DUPLICATE_DROP" = "DUPLICATE_DROP"
  inline val INTERPOLATE: "INTERPOLATE" = "INTERPOLATE"
  inline val FRAMEFORMER: "FRAMEFORMER" = "FRAMEFORMER"

  inline def values: js.Array[Av1FramerateConversionAlgorithm] = js.Array(DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** 'With AV1 outputs, for rate control mode, MediaConvert supports only quality-defined variable bitrate (QVBR). You can''t use CBR or VBR.'
  */
type Av1RateControlMode = "QVBR"
object Av1RateControlMode {
  inline val QVBR: "QVBR" = "QVBR"

  inline def values: js.Array[Av1RateControlMode] = js.Array(QVBR)
}

/** Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture, you might choose to disable this feature. Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video
  * games, set it to Low. For content with a wider variety of textures, set it to High or Higher.
  */
type Av1SpatialAdaptiveQuantization = "DISABLED" | "ENABLED"
object Av1SpatialAdaptiveQuantization {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[Av1SpatialAdaptiveQuantization] = js.Array(DISABLED, ENABLED)
}

/** Specify the AVC-Intra class of your output. The AVC-Intra class selection determines the output video bit rate depending on the frame rate of the output. Outputs with higher class values have higher bitrates and improved image quality. Note that for Class 4K/2K, MediaConvert supports only 4:2:2 chroma subsampling.
  */
type AvcIntraClass = "CLASS_50" | "CLASS_100" | "CLASS_200" | "CLASS_4K_2K"
object AvcIntraClass {
  inline val CLASS_50: "CLASS_50" = "CLASS_50"
  inline val CLASS_100: "CLASS_100" = "CLASS_100"
  inline val CLASS_200: "CLASS_200" = "CLASS_200"
  inline val CLASS_4K_2K: "CLASS_4K_2K" = "CLASS_4K_2K"

  inline def values: js.Array[AvcIntraClass] = js.Array(CLASS_50, CLASS_100, CLASS_200, CLASS_4K_2K)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
type AvcIntraFramerateControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object AvcIntraFramerateControl {
  inline val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  inline val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  inline def values: js.Array[AvcIntraFramerateControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
type AvcIntraFramerateConversionAlgorithm = "DUPLICATE_DROP" | "INTERPOLATE" | "FRAMEFORMER"
object AvcIntraFramerateConversionAlgorithm {
  inline val DUPLICATE_DROP: "DUPLICATE_DROP" = "DUPLICATE_DROP"
  inline val INTERPOLATE: "INTERPOLATE" = "INTERPOLATE"
  inline val FRAMEFORMER: "FRAMEFORMER" = "FRAMEFORMER"

  inline def values: js.Array[AvcIntraFramerateConversionAlgorithm] = js.Array(DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
  */
type AvcIntraInterlaceMode = "PROGRESSIVE" | "TOP_FIELD" | "BOTTOM_FIELD" | "FOLLOW_TOP_FIELD" | "FOLLOW_BOTTOM_FIELD"
object AvcIntraInterlaceMode {
  inline val PROGRESSIVE: "PROGRESSIVE" = "PROGRESSIVE"
  inline val TOP_FIELD: "TOP_FIELD" = "TOP_FIELD"
  inline val BOTTOM_FIELD: "BOTTOM_FIELD" = "BOTTOM_FIELD"
  inline val FOLLOW_TOP_FIELD: "FOLLOW_TOP_FIELD" = "FOLLOW_TOP_FIELD"
  inline val FOLLOW_BOTTOM_FIELD: "FOLLOW_BOTTOM_FIELD" = "FOLLOW_BOTTOM_FIELD"

  inline def values: js.Array[AvcIntraInterlaceMode] = js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD)
}

/** Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
  */
type AvcIntraScanTypeConversionMode = "INTERLACED" | "INTERLACED_OPTIMIZE"
object AvcIntraScanTypeConversionMode {
  inline val INTERLACED: "INTERLACED" = "INTERLACED"
  inline val INTERLACED_OPTIMIZE: "INTERLACED_OPTIMIZE" = "INTERLACED_OPTIMIZE"

  inline def values: js.Array[AvcIntraScanTypeConversionMode] = js.Array(INTERLACED, INTERLACED_OPTIMIZE)
}

/** Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
  */
type AvcIntraSlowPal = "DISABLED" | "ENABLED"
object AvcIntraSlowPal {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[AvcIntraSlowPal] = js.Array(DISABLED, ENABLED)
}

/** When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother picture.
  */
type AvcIntraTelecine = "NONE" | "HARD"
object AvcIntraTelecine {
  inline val NONE: "NONE" = "NONE"
  inline val HARD: "HARD" = "HARD"

  inline def values: js.Array[AvcIntraTelecine] = js.Array(NONE, HARD)
}

/** Optional. Use Quality tuning level (qualityTuningLevel) to choose how many transcoding passes MediaConvert does with your video. When you choose Multi-pass (MULTI_PASS), your video quality is better and your output bitrate is more accurate. That is, the actual bitrate of your output is closer to the target bitrate defined in the specification. When you choose Single-pass (SINGLE_PASS), your encoding time is faster. The default behavior is Single-pass (SINGLE_PASS).
  */
type AvcIntraUhdQualityTuningLevel = "SINGLE_PASS" | "MULTI_PASS"
object AvcIntraUhdQualityTuningLevel {
  inline val SINGLE_PASS: "SINGLE_PASS" = "SINGLE_PASS"
  inline val MULTI_PASS: "MULTI_PASS" = "MULTI_PASS"

  inline def values: js.Array[AvcIntraUhdQualityTuningLevel] = js.Array(SINGLE_PASS, MULTI_PASS)
}

/** The tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs on any billing report that you set up.
  */
type BillingTagsSource = "QUEUE" | "PRESET" | "JOB_TEMPLATE" | "JOB"
object BillingTagsSource {
  inline val QUEUE: "QUEUE" = "QUEUE"
  inline val PRESET: "PRESET" = "PRESET"
  inline val JOB_TEMPLATE: "JOB_TEMPLATE" = "JOB_TEMPLATE"
  inline val JOB: "JOB" = "JOB"

  inline def values: js.Array[BillingTagsSource] = js.Array(QUEUE, PRESET, JOB_TEMPLATE, JOB)
}

/** If no explicit x_position or y_position is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
  */
type BurninSubtitleAlignment = "CENTERED" | "LEFT"
object BurninSubtitleAlignment {
  inline val CENTERED: "CENTERED" = "CENTERED"
  inline val LEFT: "LEFT" = "LEFT"

  inline def values: js.Array[BurninSubtitleAlignment] = js.Array(CENTERED, LEFT)
}

/** Specifies the color of the rectangle behind the captions. All burn-in and DVB-Sub font settings must match.
  */
type BurninSubtitleBackgroundColor = "NONE" | "BLACK" | "WHITE"
object BurninSubtitleBackgroundColor {
  inline val NONE: "NONE" = "NONE"
  inline val BLACK: "BLACK" = "BLACK"
  inline val WHITE: "WHITE" = "WHITE"

  inline def values: js.Array[BurninSubtitleBackgroundColor] = js.Array(NONE, BLACK, WHITE)
}

/** Specifies the color of the burned-in captions. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
  */
type BurninSubtitleFontColor = "WHITE" | "BLACK" | "YELLOW" | "RED" | "GREEN" | "BLUE"
object BurninSubtitleFontColor {
  inline val WHITE: "WHITE" = "WHITE"
  inline val BLACK: "BLACK" = "BLACK"
  inline val YELLOW: "YELLOW" = "YELLOW"
  inline val RED: "RED" = "RED"
  inline val GREEN: "GREEN" = "GREEN"
  inline val BLUE: "BLUE" = "BLUE"

  inline def values: js.Array[BurninSubtitleFontColor] = js.Array(WHITE, BLACK, YELLOW, RED, GREEN, BLUE)
}

/** Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
  */
type BurninSubtitleOutlineColor = "BLACK" | "WHITE" | "YELLOW" | "RED" | "GREEN" | "BLUE"
object BurninSubtitleOutlineColor {
  inline val BLACK: "BLACK" = "BLACK"
  inline val WHITE: "WHITE" = "WHITE"
  inline val YELLOW: "YELLOW" = "YELLOW"
  inline val RED: "RED" = "RED"
  inline val GREEN: "GREEN" = "GREEN"
  inline val BLUE: "BLUE" = "BLUE"

  inline def values: js.Array[BurninSubtitleOutlineColor] = js.Array(BLACK, WHITE, YELLOW, RED, GREEN, BLUE)
}

/** Specifies the color of the shadow cast by the captions. All burn-in and DVB-Sub font settings must match.
  */
type BurninSubtitleShadowColor = "NONE" | "BLACK" | "WHITE"
object BurninSubtitleShadowColor {
  inline val NONE: "NONE" = "NONE"
  inline val BLACK: "BLACK" = "BLACK"
  inline val WHITE: "WHITE" = "WHITE"

  inline def values: js.Array[BurninSubtitleShadowColor] = js.Array(NONE, BLACK, WHITE)
}

/** Only applies to jobs with input captions in Teletext or STL formats. Specify whether the spacing between letters in your captions is set by the captions grid or varies depending on letter width. Choose fixed grid to conform to the spacing specified in the captions file more accurately. Choose proportional to make the text easier to read if the captions are closed caption.
  */
type BurninSubtitleTeletextSpacing = "FIXED_GRID" | "PROPORTIONAL"
object BurninSubtitleTeletextSpacing {
  inline val FIXED_GRID: "FIXED_GRID" = "FIXED_GRID"
  inline val PROPORTIONAL: "PROPORTIONAL" = "PROPORTIONAL"

  inline def values: js.Array[BurninSubtitleTeletextSpacing] = js.Array(FIXED_GRID, PROPORTIONAL)
}

/** Specify the format for this set of captions on this output. The default format is embedded without SCTE-20. Other options are embedded with SCTE-20, burn-in, DVB-sub, IMSC, SCC, SRT, teletext, TTML, and web-VTT. If you are using SCTE-20, choose SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED) to create an output that complies with the SCTE-43 spec. To create a non-compliant output where the embedded captions come first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
  */
type CaptionDestinationType = "BURN_IN" | "DVB_SUB" | "EMBEDDED" | "EMBEDDED_PLUS_SCTE20" | "IMSC" | "SCTE20_PLUS_EMBEDDED" | "SCC" | "SRT" | "SMI" | "TELETEXT" | "TTML" | "WEBVTT"
object CaptionDestinationType {
  inline val BURN_IN: "BURN_IN" = "BURN_IN"
  inline val DVB_SUB: "DVB_SUB" = "DVB_SUB"
  inline val EMBEDDED: "EMBEDDED" = "EMBEDDED"
  inline val EMBEDDED_PLUS_SCTE20: "EMBEDDED_PLUS_SCTE20" = "EMBEDDED_PLUS_SCTE20"
  inline val IMSC: "IMSC" = "IMSC"
  inline val SCTE20_PLUS_EMBEDDED: "SCTE20_PLUS_EMBEDDED" = "SCTE20_PLUS_EMBEDDED"
  inline val SCC: "SCC" = "SCC"
  inline val SRT: "SRT" = "SRT"
  inline val SMI: "SMI" = "SMI"
  inline val TELETEXT: "TELETEXT" = "TELETEXT"
  inline val TTML: "TTML" = "TTML"
  inline val WEBVTT: "WEBVTT" = "WEBVTT"

  inline def values: js.Array[CaptionDestinationType] = js.Array(BURN_IN, DVB_SUB, EMBEDDED, EMBEDDED_PLUS_SCTE20, IMSC, SCTE20_PLUS_EMBEDDED, SCC, SRT, SMI, TELETEXT, TTML, WEBVTT)
}

/** Use Source (SourceType) to identify the format of your input captions. The service cannot auto-detect caption format.
  */
type CaptionSourceType = "ANCILLARY" | "DVB_SUB" | "EMBEDDED" | "SCTE20" | "SCC" | "TTML" | "STL" | "SRT" | "SMI" | "SMPTE_TT" | "TELETEXT" | "NULL_SOURCE" | "IMSC" | "WEBVTT"
object CaptionSourceType {
  inline val ANCILLARY: "ANCILLARY" = "ANCILLARY"
  inline val DVB_SUB: "DVB_SUB" = "DVB_SUB"
  inline val EMBEDDED: "EMBEDDED" = "EMBEDDED"
  inline val SCTE20: "SCTE20" = "SCTE20"
  inline val SCC: "SCC" = "SCC"
  inline val TTML: "TTML" = "TTML"
  inline val STL: "STL" = "STL"
  inline val SRT: "SRT" = "SRT"
  inline val SMI: "SMI" = "SMI"
  inline val SMPTE_TT: "SMPTE_TT" = "SMPTE_TT"
  inline val TELETEXT: "TELETEXT" = "TELETEXT"
  inline val NULL_SOURCE: "NULL_SOURCE" = "NULL_SOURCE"
  inline val IMSC: "IMSC" = "IMSC"
  inline val WEBVTT: "WEBVTT" = "WEBVTT"

  inline def values: js.Array[CaptionSourceType] = js.Array(ANCILLARY, DVB_SUB, EMBEDDED, SCTE20, SCC, TTML, STL, SRT, SMI, SMPTE_TT, TELETEXT, NULL_SOURCE, IMSC, WEBVTT)
}

/** Disable this setting only when your workflow requires the #EXT-X-ALLOW-CACHE:no tag. Otherwise, keep the default value Enabled (ENABLED) and control caching in your video distribution set up. For example, use the Cache-Control http header.
  */
type CmafClientCache = "DISABLED" | "ENABLED"
object CmafClientCache {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[CmafClientCache] = js.Array(DISABLED, ENABLED)
}

/** Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
  */
type CmafCodecSpecification = "RFC_6381" | "RFC_4281"
object CmafCodecSpecification {
  inline val RFC_6381: "RFC_6381" = "RFC_6381"
  inline val RFC_4281: "RFC_4281" = "RFC_4281"

  inline def values: js.Array[CmafCodecSpecification] = js.Array(RFC_6381, RFC_4281)
}

/** Specify the encryption scheme that you want the service to use when encrypting your CMAF segments. Choose AES-CBC subsample (SAMPLE-AES) or AES_CTR (AES-CTR).
  */
type CmafEncryptionType = "SAMPLE_AES" | "AES_CTR"
object CmafEncryptionType {
  inline val SAMPLE_AES: "SAMPLE_AES" = "SAMPLE_AES"
  inline val AES_CTR: "AES_CTR" = "AES_CTR"

  inline def values: js.Array[CmafEncryptionType] = js.Array(SAMPLE_AES, AES_CTR)
}

/** When you use DRM with CMAF outputs, choose whether the service writes the 128-bit encryption initialization vector in the HLS and DASH manifests.
  */
type CmafInitializationVectorInManifest = "INCLUDE" | "EXCLUDE"
object CmafInitializationVectorInManifest {
  inline val INCLUDE: "INCLUDE" = "INCLUDE"
  inline val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  inline def values: js.Array[CmafInitializationVectorInManifest] = js.Array(INCLUDE, EXCLUDE)
}

/** Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
  */
type CmafKeyProviderType = "SPEKE" | "STATIC_KEY"
object CmafKeyProviderType {
  inline val SPEKE: "SPEKE" = "SPEKE"
  inline val STATIC_KEY: "STATIC_KEY" = "STATIC_KEY"

  inline def values: js.Array[CmafKeyProviderType] = js.Array(SPEKE, STATIC_KEY)
}

/** When set to GZIP, compresses HLS playlist.
  */
type CmafManifestCompression = "GZIP" | "NONE"
object CmafManifestCompression {
  inline val GZIP: "GZIP" = "GZIP"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[CmafManifestCompression] = js.Array(GZIP, NONE)
}

/** Indicates whether the output manifest should use floating point values for segment duration.
  */
type CmafManifestDurationFormat = "FLOATING_POINT" | "INTEGER"
object CmafManifestDurationFormat {
  inline val FLOATING_POINT: "FLOATING_POINT" = "FLOATING_POINT"
  inline val INTEGER: "INTEGER" = "INTEGER"

  inline def values: js.Array[CmafManifestDurationFormat] = js.Array(FLOATING_POINT, INTEGER)
}

/** Specify whether your DASH profile is on-demand or main. When you choose Main profile (MAIN_PROFILE), the service signals urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE), the service signals urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose On-demand, you must also set the output group setting Segment control (SegmentControl) to Single file (SINGLE_FILE).
  */
type CmafMpdProfile = "MAIN_PROFILE" | "ON_DEMAND_PROFILE"
object CmafMpdProfile {
  inline val MAIN_PROFILE: "MAIN_PROFILE" = "MAIN_PROFILE"
  inline val ON_DEMAND_PROFILE: "ON_DEMAND_PROFILE" = "ON_DEMAND_PROFILE"

  inline def values: js.Array[CmafMpdProfile] = js.Array(MAIN_PROFILE, ON_DEMAND_PROFILE)
}

/** Use this setting only when your output video stream has B-frames, which causes the initial presentation time stamp (PTS) to be offset from the initial decode time stamp (DTS). Specify how MediaConvert handles PTS when writing time stamps in output DASH manifests. Choose Match initial PTS (MATCH_INITIAL_PTS) when you want MediaConvert to use the initial PTS as the first time stamp in the manifest. Choose Zero-based (ZERO_BASED) to have MediaConvert ignore the initial PTS in the video stream and instead write the initial time stamp as zero in the manifest. For outputs that don't have B-frames, the time stamps in your DASH manifests start at zero regardless of your choice here.
  */
type CmafPtsOffsetHandlingForBFrames = "ZERO_BASED" | "MATCH_INITIAL_PTS"
object CmafPtsOffsetHandlingForBFrames {
  inline val ZERO_BASED: "ZERO_BASED" = "ZERO_BASED"
  inline val MATCH_INITIAL_PTS: "MATCH_INITIAL_PTS" = "MATCH_INITIAL_PTS"

  inline def values: js.Array[CmafPtsOffsetHandlingForBFrames] = js.Array(ZERO_BASED, MATCH_INITIAL_PTS)
}

/** When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
  */
type CmafSegmentControl = "SINGLE_FILE" | "SEGMENTED_FILES"
object CmafSegmentControl {
  inline val SINGLE_FILE: "SINGLE_FILE" = "SINGLE_FILE"
  inline val SEGMENTED_FILES: "SEGMENTED_FILES" = "SEGMENTED_FILES"

  inline def values: js.Array[CmafSegmentControl] = js.Array(SINGLE_FILE, SEGMENTED_FILES)
}

/** Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
  */
type CmafStreamInfResolution = "INCLUDE" | "EXCLUDE"
object CmafStreamInfResolution {
  inline val INCLUDE: "INCLUDE" = "INCLUDE"
  inline val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  inline def values: js.Array[CmafStreamInfResolution] = js.Array(INCLUDE, EXCLUDE)
}

/** When set to ENABLED, a DASH MPD manifest will be generated for this output.
  */
type CmafWriteDASHManifest = "DISABLED" | "ENABLED"
object CmafWriteDASHManifest {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[CmafWriteDASHManifest] = js.Array(DISABLED, ENABLED)
}

/** When set to ENABLED, an Apple HLS manifest will be generated for this output.
  */
type CmafWriteHLSManifest = "DISABLED" | "ENABLED"
object CmafWriteHLSManifest {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[CmafWriteHLSManifest] = js.Array(DISABLED, ENABLED)
}

/** When you enable Precise segment duration in DASH manifests (writeSegmentTimelineInRepresentation), your DASH manifest shows precise segment durations. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your DASH manifest are approximate. The segment duration information appears in the duration attribute of the SegmentTemplate element.
  */
type CmafWriteSegmentTimelineInRepresentation = "ENABLED" | "DISABLED"
object CmafWriteSegmentTimelineInRepresentation {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[CmafWriteSegmentTimelineInRepresentation] = js.Array(ENABLED, DISABLED)
}

/** Specify this setting only when your output will be consumed by a downstream repackaging workflow that is sensitive to very small duration differences between video and audio. For this situation, choose Match video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with silence or trims them to ensure that the total duration of each audio stream is at least as long as the total duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
  */
type CmfcAudioDuration = "DEFAULT_CODEC_DURATION" | "MATCH_VIDEO_DURATION"
object CmfcAudioDuration {
  inline val DEFAULT_CODEC_DURATION: "DEFAULT_CODEC_DURATION" = "DEFAULT_CODEC_DURATION"
  inline val MATCH_VIDEO_DURATION: "MATCH_VIDEO_DURATION" = "MATCH_VIDEO_DURATION"

  inline def values: js.Array[CmfcAudioDuration] = js.Array(DEFAULT_CODEC_DURATION, MATCH_VIDEO_DURATION)
}

/** Use this setting to control the values that MediaConvert puts in your HLS parent playlist to control how the client player selects which audio track to play. The other options for this setting determine the values that MediaConvert writes for the DEFAULT and AUTOSELECT attributes of the EXT-X-MEDIA entry for the audio variant. For more information about these attributes, see the Apple documentation article https://developer.apple.com/documentation/http_live_streaming/example_playlists_for_http_live_streaming/adding_alternate_media_to_a_playlist. Choose Alternate audio, auto select, default (ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT) to set DEFAULT=YES and AUTOSELECT=YES. Choose this value for only one variant in your output group. Choose Alternate audio, auto select, not default (ALTERNATE_AUDIO_AUTO_SELECT) to set DEFAULT=NO and AUTOSELECT=YES. Choose Alternate Audio, Not Auto Select to set DEFAULT=NO and AUTOSELECT=NO. When you don't specify a value for this setting, MediaConvert
  * defaults to Alternate audio, auto select, default. When there is more than one variant in your output group, you must explicitly choose a value for this setting.
  */
type CmfcAudioTrackType = "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT" | "ALTERNATE_AUDIO_AUTO_SELECT" | "ALTERNATE_AUDIO_NOT_AUTO_SELECT"
object CmfcAudioTrackType {
  inline val ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT: "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT" = "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT"
  inline val ALTERNATE_AUDIO_AUTO_SELECT: "ALTERNATE_AUDIO_AUTO_SELECT" = "ALTERNATE_AUDIO_AUTO_SELECT"
  inline val ALTERNATE_AUDIO_NOT_AUTO_SELECT: "ALTERNATE_AUDIO_NOT_AUTO_SELECT" = "ALTERNATE_AUDIO_NOT_AUTO_SELECT"

  inline def values: js.Array[CmfcAudioTrackType] = js.Array(ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT, ALTERNATE_AUDIO_AUTO_SELECT, ALTERNATE_AUDIO_NOT_AUTO_SELECT)
}

/** Specify whether to flag this audio track as descriptive video service (DVS) in your HLS parent manifest. When you choose Flag (FLAG), MediaConvert includes the parameter CHARACTERISTICS="public.accessibility.describes-video" in the EXT-X-MEDIA entry for this track. When you keep the default choice, Don't flag (DONT_FLAG), MediaConvert leaves this parameter out. The DVS flag can help with accessibility on Apple devices. For more information, see the Apple documentation.
  */
type CmfcDescriptiveVideoServiceFlag = "DONT_FLAG" | "FLAG"
object CmfcDescriptiveVideoServiceFlag {
  inline val DONT_FLAG: "DONT_FLAG" = "DONT_FLAG"
  inline val FLAG: "FLAG" = "FLAG"

  inline def values: js.Array[CmfcDescriptiveVideoServiceFlag] = js.Array(DONT_FLAG, FLAG)
}

/** Choose Include (INCLUDE) to have MediaConvert generate an HLS child manifest that lists only the I-frames for this rendition, in addition to your regular manifest for this rendition. You might use this manifest as part of a workflow that creates preview functions for your video. MediaConvert adds both the I-frame only child manifest and the regular child manifest to the parent manifest. When you don't need the I-frame only child manifest, keep the default value Exclude (EXCLUDE).
  */
type CmfcIFrameOnlyManifest = "INCLUDE" | "EXCLUDE"
object CmfcIFrameOnlyManifest {
  inline val INCLUDE: "INCLUDE" = "INCLUDE"
  inline val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  inline def values: js.Array[CmfcIFrameOnlyManifest] = js.Array(INCLUDE, EXCLUDE)
}

/** Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
  */
type CmfcScte35Esam = "INSERT" | "NONE"
object CmfcScte35Esam {
  inline val INSERT: "INSERT" = "INSERT"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[CmfcScte35Esam] = js.Array(INSERT, NONE)
}

/** Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want those SCTE-35 markers in this output.
  */
type CmfcScte35Source = "PASSTHROUGH" | "NONE"
object CmfcScte35Source {
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[CmfcScte35Source] = js.Array(PASSTHROUGH, NONE)
}

/** Choose Insert (INSERT) for this setting to include color metadata in this output. Choose Ignore (IGNORE) to exclude color metadata from this output. If you don't specify a value, the service sets this to Insert by default.
  */
type ColorMetadata = "IGNORE" | "INSERT"
object ColorMetadata {
  inline val IGNORE: "IGNORE" = "IGNORE"
  inline val INSERT: "INSERT" = "INSERT"

  inline def values: js.Array[ColorMetadata] = js.Array(IGNORE, INSERT)
}

/** If your input video has accurate color space metadata, or if you don't know about color space, leave this set to the default value Follow (FOLLOW). The service will automatically detect your input color space. If your input video has metadata indicating the wrong color space, specify the accurate color space here. If your input video is HDR 10 and the SMPTE ST 2086 Mastering Display Color Volume static metadata isn't present in your video stream, or if that metadata is present but not accurate, choose Force HDR 10 (FORCE_HDR10) here and specify correct values in the input HDR 10 metadata (Hdr10Metadata) settings. For more information about MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
  */
type ColorSpace = "FOLLOW" | "REC_601" | "REC_709" | "HDR10" | "HLG_2020"
object ColorSpace {
  inline val FOLLOW: "FOLLOW" = "FOLLOW"
  inline val REC_601: "REC_601" = "REC_601"
  inline val REC_709: "REC_709" = "REC_709"
  inline val HDR10: "HDR10" = "HDR10"
  inline val HLG_2020: "HLG_2020" = "HLG_2020"

  inline def values: js.Array[ColorSpace] = js.Array(FOLLOW, REC_601, REC_709, HDR10, HLG_2020)
}

/** Specify the color space you want for this output. The service supports conversion between HDR formats, between SDR formats, from SDR to HDR, and from HDR to SDR. SDR to HDR conversion doesn't upgrade the dynamic range. The converted video has an HDR format, but visually appears the same as an unconverted output. HDR to SDR conversion uses Elemental tone mapping technology to approximate the outcome of manually regrading from HDR to SDR.
  */
type ColorSpaceConversion = "NONE" | "FORCE_601" | "FORCE_709" | "FORCE_HDR10" | "FORCE_HLG_2020"
object ColorSpaceConversion {
  inline val NONE: "NONE" = "NONE"
  inline val FORCE_601: "FORCE_601" = "FORCE_601"
  inline val FORCE_709: "FORCE_709" = "FORCE_709"
  inline val FORCE_HDR10: "FORCE_HDR10" = "FORCE_HDR10"
  inline val FORCE_HLG_2020: "FORCE_HLG_2020" = "FORCE_HLG_2020"

  inline def values: js.Array[ColorSpaceConversion] = js.Array(NONE, FORCE_601, FORCE_709, FORCE_HDR10, FORCE_HLG_2020)
}

/** There are two sources for color metadata, the input file and the job input settings Color space (ColorSpace) and HDR master display information settings(Hdr10Metadata). The Color space usage setting determines which takes precedence. Choose Force (FORCE) to use color metadata from the input job settings. If you don't specify values for those settings, the service defaults to using metadata from your input. FALLBACK - Choose Fallback (FALLBACK) to use color metadata from the source when it is present. If there's no color metadata in your input file, the service defaults to using values you specify in the input settings.
  */
type ColorSpaceUsage = "FORCE" | "FALLBACK"
object ColorSpaceUsage {
  inline val FORCE: "FORCE" = "FORCE"
  inline val FALLBACK: "FALLBACK" = "FALLBACK"

  inline def values: js.Array[ColorSpaceUsage] = js.Array(FORCE, FALLBACK)
}

/** The length of the term of your reserved queue pricing plan commitment.
  */
type Commitment = "ONE_YEAR"
object Commitment {
  inline val ONE_YEAR: "ONE_YEAR" = "ONE_YEAR"

  inline def values: js.Array[Commitment] = js.Array(ONE_YEAR)
}

/** Container for this output. Some containers require a container settings object. If not specified, the default object will be created.
  */
type ContainerType = "F4V" | "ISMV" | "M2TS" | "M3U8" | "CMFC" | "MOV" | "MP4" | "MPD" | "MXF" | "WEBM" | "RAW"
object ContainerType {
  inline val F4V: "F4V" = "F4V"
  inline val ISMV: "ISMV" = "ISMV"
  inline val M2TS: "M2TS" = "M2TS"
  inline val M3U8: "M3U8" = "M3U8"
  inline val CMFC: "CMFC" = "CMFC"
  inline val MOV: "MOV" = "MOV"
  inline val MP4: "MP4" = "MP4"
  inline val MPD: "MPD" = "MPD"
  inline val MXF: "MXF" = "MXF"
  inline val WEBM: "WEBM" = "WEBM"
  inline val RAW: "RAW" = "RAW"

  inline def values: js.Array[ContainerType] = js.Array(F4V, ISMV, M2TS, M3U8, CMFC, MOV, MP4, MPD, MXF, WEBM, RAW)
}

/** Use this setting only when your audio codec is a Dolby one (AC3, EAC3, or Atmos) and your downstream workflow requires that your DASH manifest use the Dolby channel configuration tag, rather than the MPEG one. For example, you might need to use this to make dynamic ad insertion work. Specify which audio channel configuration scheme ID URI MediaConvert writes in your DASH manifest. Keep the default value, MPEG channel configuration (MPEG_CHANNEL_CONFIGURATION), to have MediaConvert write this: urn:mpeg:mpegB:cicp:ChannelConfiguration. Choose Dolby channel configuration (DOLBY_CHANNEL_CONFIGURATION) to have MediaConvert write this instead: tag:dolby.com,2014:dash:audio_channel_configuration:2011.
  */
type DashIsoGroupAudioChannelConfigSchemeIdUri = "MPEG_CHANNEL_CONFIGURATION" | "DOLBY_CHANNEL_CONFIGURATION"
object DashIsoGroupAudioChannelConfigSchemeIdUri {
  inline val MPEG_CHANNEL_CONFIGURATION: "MPEG_CHANNEL_CONFIGURATION" = "MPEG_CHANNEL_CONFIGURATION"
  inline val DOLBY_CHANNEL_CONFIGURATION: "DOLBY_CHANNEL_CONFIGURATION" = "DOLBY_CHANNEL_CONFIGURATION"

  inline def values: js.Array[DashIsoGroupAudioChannelConfigSchemeIdUri] = js.Array(MPEG_CHANNEL_CONFIGURATION, DOLBY_CHANNEL_CONFIGURATION)
}

/** Supports HbbTV specification as indicated
  */
type DashIsoHbbtvCompliance = "HBBTV_1_5" | "NONE"
object DashIsoHbbtvCompliance {
  inline val HBBTV_1_5: "HBBTV_1_5" = "HBBTV_1_5"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[DashIsoHbbtvCompliance] = js.Array(HBBTV_1_5, NONE)
}

/** Specify whether your DASH profile is on-demand or main. When you choose Main profile (MAIN_PROFILE), the service signals urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE), the service signals urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose On-demand, you must also set the output group setting Segment control (SegmentControl) to Single file (SINGLE_FILE).
  */
type DashIsoMpdProfile = "MAIN_PROFILE" | "ON_DEMAND_PROFILE"
object DashIsoMpdProfile {
  inline val MAIN_PROFILE: "MAIN_PROFILE" = "MAIN_PROFILE"
  inline val ON_DEMAND_PROFILE: "ON_DEMAND_PROFILE" = "ON_DEMAND_PROFILE"

  inline def values: js.Array[DashIsoMpdProfile] = js.Array(MAIN_PROFILE, ON_DEMAND_PROFILE)
}

/** This setting can improve the compatibility of your output with video players on obsolete devices. It applies only to DASH H.264 outputs with DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to correct problems with playback on older devices. Otherwise, keep the default setting CENC v1 (CENC_V1). If you choose Unencrypted SEI, for that output, the service will exclude the access unit delimiter and will leave the SEI NAL units unencrypted.
  */
type DashIsoPlaybackDeviceCompatibility = "CENC_V1" | "UNENCRYPTED_SEI"
object DashIsoPlaybackDeviceCompatibility {
  inline val CENC_V1: "CENC_V1" = "CENC_V1"
  inline val UNENCRYPTED_SEI: "UNENCRYPTED_SEI" = "UNENCRYPTED_SEI"

  inline def values: js.Array[DashIsoPlaybackDeviceCompatibility] = js.Array(CENC_V1, UNENCRYPTED_SEI)
}

/** Use this setting only when your output video stream has B-frames, which causes the initial presentation time stamp (PTS) to be offset from the initial decode time stamp (DTS). Specify how MediaConvert handles PTS when writing time stamps in output DASH manifests. Choose Match initial PTS (MATCH_INITIAL_PTS) when you want MediaConvert to use the initial PTS as the first time stamp in the manifest. Choose Zero-based (ZERO_BASED) to have MediaConvert ignore the initial PTS in the video stream and instead write the initial time stamp as zero in the manifest. For outputs that don't have B-frames, the time stamps in your DASH manifests start at zero regardless of your choice here.
  */
type DashIsoPtsOffsetHandlingForBFrames = "ZERO_BASED" | "MATCH_INITIAL_PTS"
object DashIsoPtsOffsetHandlingForBFrames {
  inline val ZERO_BASED: "ZERO_BASED" = "ZERO_BASED"
  inline val MATCH_INITIAL_PTS: "MATCH_INITIAL_PTS" = "MATCH_INITIAL_PTS"

  inline def values: js.Array[DashIsoPtsOffsetHandlingForBFrames] = js.Array(ZERO_BASED, MATCH_INITIAL_PTS)
}

/** When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
  */
type DashIsoSegmentControl = "SINGLE_FILE" | "SEGMENTED_FILES"
object DashIsoSegmentControl {
  inline val SINGLE_FILE: "SINGLE_FILE" = "SINGLE_FILE"
  inline val SEGMENTED_FILES: "SEGMENTED_FILES" = "SEGMENTED_FILES"

  inline def values: js.Array[DashIsoSegmentControl] = js.Array(SINGLE_FILE, SEGMENTED_FILES)
}

/** When you enable Precise segment duration in manifests (writeSegmentTimelineInRepresentation), your DASH manifest shows precise segment durations. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your DASH manifest are approximate. The segment duration information appears in the duration attribute of the SegmentTemplate element.
  */
type DashIsoWriteSegmentTimelineInRepresentation = "ENABLED" | "DISABLED"
object DashIsoWriteSegmentTimelineInRepresentation {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[DashIsoWriteSegmentTimelineInRepresentation] = js.Array(ENABLED, DISABLED)
}

/** Specify the encryption mode that you used to encrypt your input files.
  */
type DecryptionMode = "AES_CTR" | "AES_CBC" | "AES_GCM"
object DecryptionMode {
  inline val AES_CTR: "AES_CTR" = "AES_CTR"
  inline val AES_CBC: "AES_CBC" = "AES_CBC"
  inline val AES_GCM: "AES_GCM" = "AES_GCM"

  inline def values: js.Array[DecryptionMode] = js.Array(AES_CTR, AES_CBC, AES_GCM)
}

/** Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace (DEINTERLACE) or Adaptive (ADAPTIVE). Motion adaptive interpolate (INTERPOLATE) produces sharper pictures, while blend (BLEND) produces smoother motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source file includes a ticker, such as a scrolling headline at the bottom of the frame.
  */
type DeinterlaceAlgorithm = "INTERPOLATE" | "INTERPOLATE_TICKER" | "BLEND" | "BLEND_TICKER"
object DeinterlaceAlgorithm {
  inline val INTERPOLATE: "INTERPOLATE" = "INTERPOLATE"
  inline val INTERPOLATE_TICKER: "INTERPOLATE_TICKER" = "INTERPOLATE_TICKER"
  inline val BLEND: "BLEND" = "BLEND"
  inline val BLEND_TICKER: "BLEND_TICKER" = "BLEND_TICKER"

  inline def values: js.Array[DeinterlaceAlgorithm] = js.Array(INTERPOLATE, INTERPOLATE_TICKER, BLEND, BLEND_TICKER)
}

/**   - When set to NORMAL (default), the deinterlacer does not convert frames that are tagged in metadata as progressive. It will only convert those that are tagged as some other type. - When set to FORCE_ALL_FRAMES, the deinterlacer converts every frame to progressive - even those that are already tagged as progressive. Turn Force mode on only if there is a good chance that the metadata has tagged frames as progressive when they are not progressive. Do not turn on otherwise; processing frames that are already progressive into progressive will probably result in lower quality video.
  */
type DeinterlacerControl = "FORCE_ALL_FRAMES" | "NORMAL"
object DeinterlacerControl {
  inline val FORCE_ALL_FRAMES: "FORCE_ALL_FRAMES" = "FORCE_ALL_FRAMES"
  inline val NORMAL: "NORMAL" = "NORMAL"

  inline def values: js.Array[DeinterlacerControl] = js.Array(FORCE_ALL_FRAMES, NORMAL)
}

/** Use Deinterlacer (DeinterlaceMode) to choose how the service will do deinterlacing. Default is Deinterlace. - Deinterlace converts interlaced to progressive. - Inverse telecine converts Hard Telecine 29.97i to progressive 23.976p. - Adaptive auto-detects and converts to progressive.
  */
type DeinterlacerMode = "DEINTERLACE" | "INVERSE_TELECINE" | "ADAPTIVE"
object DeinterlacerMode {
  inline val DEINTERLACE: "DEINTERLACE" = "DEINTERLACE"
  inline val INVERSE_TELECINE: "INVERSE_TELECINE" = "INVERSE_TELECINE"
  inline val ADAPTIVE: "ADAPTIVE" = "ADAPTIVE"

  inline def values: js.Array[DeinterlacerMode] = js.Array(DEINTERLACE, INVERSE_TELECINE, ADAPTIVE)
}

/** Optional field, defaults to DEFAULT. Specify DEFAULT for this operation to return your endpoints if any exist, or to create an endpoint for you and return it if one doesn't already exist. Specify GET_ONLY to return your endpoints if any exist, or an empty list if none exist.
  */
type DescribeEndpointsMode = "DEFAULT" | "GET_ONLY"
object DescribeEndpointsMode {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val GET_ONLY: "GET_ONLY" = "GET_ONLY"

  inline def values: js.Array[DescribeEndpointsMode] = js.Array(DEFAULT, GET_ONLY)
}

/** Use Dolby Vision Mode to choose how the service will handle Dolby Vision MaxCLL and MaxFALL properies.
  */
type DolbyVisionLevel6Mode = "PASSTHROUGH" | "RECALCULATE" | "SPECIFY"
object DolbyVisionLevel6Mode {
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"
  inline val RECALCULATE: "RECALCULATE" = "RECALCULATE"
  inline val SPECIFY: "SPECIFY" = "SPECIFY"

  inline def values: js.Array[DolbyVisionLevel6Mode] = js.Array(PASSTHROUGH, RECALCULATE, SPECIFY)
}

/** In the current MediaConvert implementation, the Dolby Vision profile is always 5 (PROFILE_5). Therefore, all of your inputs must contain Dolby Vision frame interleaved data.
  */
type DolbyVisionProfile = "PROFILE_5"
object DolbyVisionProfile {
  inline val PROFILE_5: "PROFILE_5" = "PROFILE_5"

  inline def values: js.Array[DolbyVisionProfile] = js.Array(PROFILE_5)
}

/** Applies only to 29.97 fps outputs. When this feature is enabled, the service will use drop-frame timecode on outputs. If it is not possible to use drop-frame timecode, the system will fall back to non-drop-frame. This setting is enabled by default when Timecode insertion (TimecodeInsertion) is enabled.
  */
type DropFrameTimecode = "DISABLED" | "ENABLED"
object DropFrameTimecode {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[DropFrameTimecode] = js.Array(DISABLED, ENABLED)
}

/** If no explicit x_position or y_position is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
  */
type DvbSubtitleAlignment = "CENTERED" | "LEFT"
object DvbSubtitleAlignment {
  inline val CENTERED: "CENTERED" = "CENTERED"
  inline val LEFT: "LEFT" = "LEFT"

  inline def values: js.Array[DvbSubtitleAlignment] = js.Array(CENTERED, LEFT)
}

/** Specifies the color of the rectangle behind the captions. All burn-in and DVB-Sub font settings must match.
  */
type DvbSubtitleBackgroundColor = "NONE" | "BLACK" | "WHITE"
object DvbSubtitleBackgroundColor {
  inline val NONE: "NONE" = "NONE"
  inline val BLACK: "BLACK" = "BLACK"
  inline val WHITE: "WHITE" = "WHITE"

  inline def values: js.Array[DvbSubtitleBackgroundColor] = js.Array(NONE, BLACK, WHITE)
}

/** Specifies the color of the burned-in captions. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
  */
type DvbSubtitleFontColor = "WHITE" | "BLACK" | "YELLOW" | "RED" | "GREEN" | "BLUE"
object DvbSubtitleFontColor {
  inline val WHITE: "WHITE" = "WHITE"
  inline val BLACK: "BLACK" = "BLACK"
  inline val YELLOW: "YELLOW" = "YELLOW"
  inline val RED: "RED" = "RED"
  inline val GREEN: "GREEN" = "GREEN"
  inline val BLUE: "BLUE" = "BLUE"

  inline def values: js.Array[DvbSubtitleFontColor] = js.Array(WHITE, BLACK, YELLOW, RED, GREEN, BLUE)
}

/** Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
  */
type DvbSubtitleOutlineColor = "BLACK" | "WHITE" | "YELLOW" | "RED" | "GREEN" | "BLUE"
object DvbSubtitleOutlineColor {
  inline val BLACK: "BLACK" = "BLACK"
  inline val WHITE: "WHITE" = "WHITE"
  inline val YELLOW: "YELLOW" = "YELLOW"
  inline val RED: "RED" = "RED"
  inline val GREEN: "GREEN" = "GREEN"
  inline val BLUE: "BLUE" = "BLUE"

  inline def values: js.Array[DvbSubtitleOutlineColor] = js.Array(BLACK, WHITE, YELLOW, RED, GREEN, BLUE)
}

/** Specifies the color of the shadow cast by the captions. All burn-in and DVB-Sub font settings must match.
  */
type DvbSubtitleShadowColor = "NONE" | "BLACK" | "WHITE"
object DvbSubtitleShadowColor {
  inline val NONE: "NONE" = "NONE"
  inline val BLACK: "BLACK" = "BLACK"
  inline val WHITE: "WHITE" = "WHITE"

  inline def values: js.Array[DvbSubtitleShadowColor] = js.Array(NONE, BLACK, WHITE)
}

/** Only applies to jobs with input captions in Teletext or STL formats. Specify whether the spacing between letters in your captions is set by the captions grid or varies depending on letter width. Choose fixed grid to conform to the spacing specified in the captions file more accurately. Choose proportional to make the text easier to read if the captions are closed caption.
  */
type DvbSubtitleTeletextSpacing = "FIXED_GRID" | "PROPORTIONAL"
object DvbSubtitleTeletextSpacing {
  inline val FIXED_GRID: "FIXED_GRID" = "FIXED_GRID"
  inline val PROPORTIONAL: "PROPORTIONAL" = "PROPORTIONAL"

  inline def values: js.Array[DvbSubtitleTeletextSpacing] = js.Array(FIXED_GRID, PROPORTIONAL)
}

/** Specify whether your DVB subtitles are standard or for hearing impaired. Choose hearing impaired if your subtitles include audio descriptions and dialogue. Choose standard if your subtitles include only dialogue.
  */
type DvbSubtitlingType = "HEARING_IMPAIRED" | "STANDARD"
object DvbSubtitlingType {
  inline val HEARING_IMPAIRED: "HEARING_IMPAIRED" = "HEARING_IMPAIRED"
  inline val STANDARD: "STANDARD" = "STANDARD"

  inline def values: js.Array[DvbSubtitlingType] = js.Array(HEARING_IMPAIRED, STANDARD)
}

/** Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
  */
type Eac3AtmosBitstreamMode = "COMPLETE_MAIN"
object Eac3AtmosBitstreamMode {
  inline val COMPLETE_MAIN: "COMPLETE_MAIN" = "COMPLETE_MAIN"

  inline def values: js.Array[Eac3AtmosBitstreamMode] = js.Array(COMPLETE_MAIN)
}

/** The coding mode for Dolby Digital Plus JOC (Atmos) is always 9.1.6 (CODING_MODE_9_1_6).
  */
type Eac3AtmosCodingMode = "CODING_MODE_9_1_6"
object Eac3AtmosCodingMode {
  inline val CODING_MODE_9_1_6: "CODING_MODE_9_1_6" = "CODING_MODE_9_1_6"

  inline def values: js.Array[Eac3AtmosCodingMode] = js.Array(CODING_MODE_9_1_6)
}

/** Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue analysis.
  */
type Eac3AtmosDialogueIntelligence = "ENABLED" | "DISABLED"
object Eac3AtmosDialogueIntelligence {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[Eac3AtmosDialogueIntelligence] = js.Array(ENABLED, DISABLED)
}

/** Specify the absolute peak level for a signal with dynamic range compression.
  */
type Eac3AtmosDynamicRangeCompressionLine = "NONE" | "FILM_STANDARD" | "FILM_LIGHT" | "MUSIC_STANDARD" | "MUSIC_LIGHT" | "SPEECH"
object Eac3AtmosDynamicRangeCompressionLine {
  inline val NONE: "NONE" = "NONE"
  inline val FILM_STANDARD: "FILM_STANDARD" = "FILM_STANDARD"
  inline val FILM_LIGHT: "FILM_LIGHT" = "FILM_LIGHT"
  inline val MUSIC_STANDARD: "MUSIC_STANDARD" = "MUSIC_STANDARD"
  inline val MUSIC_LIGHT: "MUSIC_LIGHT" = "MUSIC_LIGHT"
  inline val SPEECH: "SPEECH" = "SPEECH"

  inline def values: js.Array[Eac3AtmosDynamicRangeCompressionLine] = js.Array(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH)
}

/** Specify how the service limits the audio dynamic range when compressing the audio.
  */
type Eac3AtmosDynamicRangeCompressionRf = "NONE" | "FILM_STANDARD" | "FILM_LIGHT" | "MUSIC_STANDARD" | "MUSIC_LIGHT" | "SPEECH"
object Eac3AtmosDynamicRangeCompressionRf {
  inline val NONE: "NONE" = "NONE"
  inline val FILM_STANDARD: "FILM_STANDARD" = "FILM_STANDARD"
  inline val FILM_LIGHT: "FILM_LIGHT" = "FILM_LIGHT"
  inline val MUSIC_STANDARD: "MUSIC_STANDARD" = "MUSIC_STANDARD"
  inline val MUSIC_LIGHT: "MUSIC_LIGHT" = "MUSIC_LIGHT"
  inline val SPEECH: "SPEECH" = "SPEECH"

  inline def values: js.Array[Eac3AtmosDynamicRangeCompressionRf] = js.Array(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH)
}

/** Choose how the service meters the loudness of your audio.
  */
type Eac3AtmosMeteringMode = "LEQ_A" | "ITU_BS_1770_1" | "ITU_BS_1770_2" | "ITU_BS_1770_3" | "ITU_BS_1770_4"
object Eac3AtmosMeteringMode {
  inline val LEQ_A: "LEQ_A" = "LEQ_A"
  inline val ITU_BS_1770_1: "ITU_BS_1770_1" = "ITU_BS_1770_1"
  inline val ITU_BS_1770_2: "ITU_BS_1770_2" = "ITU_BS_1770_2"
  inline val ITU_BS_1770_3: "ITU_BS_1770_3" = "ITU_BS_1770_3"
  inline val ITU_BS_1770_4: "ITU_BS_1770_4" = "ITU_BS_1770_4"

  inline def values: js.Array[Eac3AtmosMeteringMode] = js.Array(LEQ_A, ITU_BS_1770_1, ITU_BS_1770_2, ITU_BS_1770_3, ITU_BS_1770_4)
}

/** Choose how the service does stereo downmixing.
  */
type Eac3AtmosStereoDownmix = "NOT_INDICATED" | "STEREO" | "SURROUND" | "DPL2"
object Eac3AtmosStereoDownmix {
  inline val NOT_INDICATED: "NOT_INDICATED" = "NOT_INDICATED"
  inline val STEREO: "STEREO" = "STEREO"
  inline val SURROUND: "SURROUND" = "SURROUND"
  inline val DPL2: "DPL2" = "DPL2"

  inline def values: js.Array[Eac3AtmosStereoDownmix] = js.Array(NOT_INDICATED, STEREO, SURROUND, DPL2)
}

/** Specify whether your input audio has an additional center rear surround channel matrix encoded into your left and right surround channels.
  */
type Eac3AtmosSurroundExMode = "NOT_INDICATED" | "ENABLED" | "DISABLED"
object Eac3AtmosSurroundExMode {
  inline val NOT_INDICATED: "NOT_INDICATED" = "NOT_INDICATED"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[Eac3AtmosSurroundExMode] = js.Array(NOT_INDICATED, ENABLED, DISABLED)
}

/** If set to ATTENUATE_3_DB, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode.
  */
type Eac3AttenuationControl = "ATTENUATE_3_DB" | "NONE"
object Eac3AttenuationControl {
  inline val ATTENUATE_3_DB: "ATTENUATE_3_DB" = "ATTENUATE_3_DB"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[Eac3AttenuationControl] = js.Array(ATTENUATE_3_DB, NONE)
}

/** Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
  */
type Eac3BitstreamMode = "COMPLETE_MAIN" | "COMMENTARY" | "EMERGENCY" | "HEARING_IMPAIRED" | "VISUALLY_IMPAIRED"
object Eac3BitstreamMode {
  inline val COMPLETE_MAIN: "COMPLETE_MAIN" = "COMPLETE_MAIN"
  inline val COMMENTARY: "COMMENTARY" = "COMMENTARY"
  inline val EMERGENCY: "EMERGENCY" = "EMERGENCY"
  inline val HEARING_IMPAIRED: "HEARING_IMPAIRED" = "HEARING_IMPAIRED"
  inline val VISUALLY_IMPAIRED: "VISUALLY_IMPAIRED" = "VISUALLY_IMPAIRED"

  inline def values: js.Array[Eac3BitstreamMode] = js.Array(COMPLETE_MAIN, COMMENTARY, EMERGENCY, HEARING_IMPAIRED, VISUALLY_IMPAIRED)
}

/** Dolby Digital Plus coding mode. Determines number of channels.
  */
type Eac3CodingMode = "CODING_MODE_1_0" | "CODING_MODE_2_0" | "CODING_MODE_3_2"
object Eac3CodingMode {
  inline val CODING_MODE_1_0: "CODING_MODE_1_0" = "CODING_MODE_1_0"
  inline val CODING_MODE_2_0: "CODING_MODE_2_0" = "CODING_MODE_2_0"
  inline val CODING_MODE_3_2: "CODING_MODE_3_2" = "CODING_MODE_3_2"

  inline def values: js.Array[Eac3CodingMode] = js.Array(CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_3_2)
}

/** Activates a DC highpass filter for all input channels.
  */
type Eac3DcFilter = "ENABLED" | "DISABLED"
object Eac3DcFilter {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[Eac3DcFilter] = js.Array(ENABLED, DISABLED)
}

/** Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the Dolby Digital stream for the line operating mode. Related setting: When you use this setting, MediaConvert ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
  */
type Eac3DynamicRangeCompressionLine = "NONE" | "FILM_STANDARD" | "FILM_LIGHT" | "MUSIC_STANDARD" | "MUSIC_LIGHT" | "SPEECH"
object Eac3DynamicRangeCompressionLine {
  inline val NONE: "NONE" = "NONE"
  inline val FILM_STANDARD: "FILM_STANDARD" = "FILM_STANDARD"
  inline val FILM_LIGHT: "FILM_LIGHT" = "FILM_LIGHT"
  inline val MUSIC_STANDARD: "MUSIC_STANDARD" = "MUSIC_STANDARD"
  inline val MUSIC_LIGHT: "MUSIC_LIGHT" = "MUSIC_LIGHT"
  inline val SPEECH: "SPEECH" = "SPEECH"

  inline def values: js.Array[Eac3DynamicRangeCompressionLine] = js.Array(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH)
}

/** Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the Dolby Digital stream for the RF operating mode. Related setting: When you use this setting, MediaConvert ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
  */
type Eac3DynamicRangeCompressionRf = "NONE" | "FILM_STANDARD" | "FILM_LIGHT" | "MUSIC_STANDARD" | "MUSIC_LIGHT" | "SPEECH"
object Eac3DynamicRangeCompressionRf {
  inline val NONE: "NONE" = "NONE"
  inline val FILM_STANDARD: "FILM_STANDARD" = "FILM_STANDARD"
  inline val FILM_LIGHT: "FILM_LIGHT" = "FILM_LIGHT"
  inline val MUSIC_STANDARD: "MUSIC_STANDARD" = "MUSIC_STANDARD"
  inline val MUSIC_LIGHT: "MUSIC_LIGHT" = "MUSIC_LIGHT"
  inline val SPEECH: "SPEECH" = "SPEECH"

  inline def values: js.Array[Eac3DynamicRangeCompressionRf] = js.Array(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH)
}

/** When encoding 3/2 audio, controls whether the LFE channel is enabled
  */
type Eac3LfeControl = "LFE" | "NO_LFE"
object Eac3LfeControl {
  inline val LFE: "LFE" = "LFE"
  inline val NO_LFE: "NO_LFE" = "NO_LFE"

  inline def values: js.Array[Eac3LfeControl] = js.Array(LFE, NO_LFE)
}

/** Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
  */
type Eac3LfeFilter = "ENABLED" | "DISABLED"
object Eac3LfeFilter {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[Eac3LfeFilter] = js.Array(ENABLED, DISABLED)
}

/** When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
  */
type Eac3MetadataControl = "FOLLOW_INPUT" | "USE_CONFIGURED"
object Eac3MetadataControl {
  inline val FOLLOW_INPUT: "FOLLOW_INPUT" = "FOLLOW_INPUT"
  inline val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"

  inline def values: js.Array[Eac3MetadataControl] = js.Array(FOLLOW_INPUT, USE_CONFIGURED)
}

/** When set to WHEN_POSSIBLE, input DD+ audio will be passed through if it is present on the input. this detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a consistent DD+ output as the system alternates between passthrough and encoding.
  */
type Eac3PassthroughControl = "WHEN_POSSIBLE" | "NO_PASSTHROUGH"
object Eac3PassthroughControl {
  inline val WHEN_POSSIBLE: "WHEN_POSSIBLE" = "WHEN_POSSIBLE"
  inline val NO_PASSTHROUGH: "NO_PASSTHROUGH" = "NO_PASSTHROUGH"

  inline def values: js.Array[Eac3PassthroughControl] = js.Array(WHEN_POSSIBLE, NO_PASSTHROUGH)
}

/** Controls the amount of phase-shift applied to the surround channels. Only used for 3/2 coding mode.
  */
type Eac3PhaseControl = "SHIFT_90_DEGREES" | "NO_SHIFT"
object Eac3PhaseControl {
  inline val SHIFT_90_DEGREES: "SHIFT_90_DEGREES" = "SHIFT_90_DEGREES"
  inline val NO_SHIFT: "NO_SHIFT" = "NO_SHIFT"

  inline def values: js.Array[Eac3PhaseControl] = js.Array(SHIFT_90_DEGREES, NO_SHIFT)
}

/** Choose how the service does stereo downmixing. This setting only applies if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Stereo downmix (Eac3StereoDownmix).
  */
type Eac3StereoDownmix = "NOT_INDICATED" | "LO_RO" | "LT_RT" | "DPL2"
object Eac3StereoDownmix {
  inline val NOT_INDICATED: "NOT_INDICATED" = "NOT_INDICATED"
  inline val LO_RO: "LO_RO" = "LO_RO"
  inline val LT_RT: "LT_RT" = "LT_RT"
  inline val DPL2: "DPL2" = "DPL2"

  inline def values: js.Array[Eac3StereoDownmix] = js.Array(NOT_INDICATED, LO_RO, LT_RT, DPL2)
}

/** When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the left and right surround channels.
  */
type Eac3SurroundExMode = "NOT_INDICATED" | "ENABLED" | "DISABLED"
object Eac3SurroundExMode {
  inline val NOT_INDICATED: "NOT_INDICATED" = "NOT_INDICATED"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[Eac3SurroundExMode] = js.Array(NOT_INDICATED, ENABLED, DISABLED)
}

/** When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels.
  */
type Eac3SurroundMode = "NOT_INDICATED" | "ENABLED" | "DISABLED"
object Eac3SurroundMode {
  inline val NOT_INDICATED: "NOT_INDICATED" = "NOT_INDICATED"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[Eac3SurroundMode] = js.Array(NOT_INDICATED, ENABLED, DISABLED)
}

/** Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
  */
type EmbeddedConvert608To708 = "UPCONVERT" | "DISABLED"
object EmbeddedConvert608To708 {
  inline val UPCONVERT: "UPCONVERT" = "UPCONVERT"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[EmbeddedConvert608To708] = js.Array(UPCONVERT, DISABLED)
}

/** By default, the service terminates any unterminated captions at the end of each input. If you want the caption to continue onto your next input, disable this setting.
  */
type EmbeddedTerminateCaptions = "END_OF_INPUT" | "DISABLED"
object EmbeddedTerminateCaptions {
  inline val END_OF_INPUT: "END_OF_INPUT" = "END_OF_INPUT"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[EmbeddedTerminateCaptions] = js.Array(END_OF_INPUT, DISABLED)
}

/** If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
  */
type F4vMoovPlacement = "PROGRESSIVE_DOWNLOAD" | "NORMAL"
object F4vMoovPlacement {
  inline val PROGRESSIVE_DOWNLOAD: "PROGRESSIVE_DOWNLOAD" = "PROGRESSIVE_DOWNLOAD"
  inline val NORMAL: "NORMAL" = "NORMAL"

  inline def values: js.Array[F4vMoovPlacement] = js.Array(PROGRESSIVE_DOWNLOAD, NORMAL)
}

/** Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
  */
type FileSourceConvert608To708 = "UPCONVERT" | "DISABLED"
object FileSourceConvert608To708 {
  inline val UPCONVERT: "UPCONVERT" = "UPCONVERT"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[FileSourceConvert608To708] = js.Array(UPCONVERT, DISABLED)
}

/** Provide the font script, using an ISO 15924 script code, if the LanguageCode is not sufficient for determining the script type. Where LanguageCode or CustomLanguageCode is sufficient, use "AUTOMATIC" or leave unset.
  */
type FontScript = "AUTOMATIC" | "HANS" | "HANT"
object FontScript {
  inline val AUTOMATIC: "AUTOMATIC" = "AUTOMATIC"
  inline val HANS: "HANS" = "HANS"
  inline val HANT: "HANT" = "HANT"

  inline def values: js.Array[FontScript] = js.Array(AUTOMATIC, HANS, HANT)
}

/** Keep the default value, Auto (AUTO), for this setting to have MediaConvert automatically apply the best types of quantization for your video content. When you want to apply your quantization settings manually, you must set H264AdaptiveQuantization to a value other than Auto (AUTO). Use this setting to specify the strength of any adaptive quantization filters that you enable. If you don't want MediaConvert to do any adaptive quantization in this transcode, set Adaptive quantization (H264AdaptiveQuantization) to Off (OFF). Related settings: The value that you choose here applies to the following settings: H264FlickerAdaptiveQuantization, H264SpatialAdaptiveQuantization, and H264TemporalAdaptiveQuantization.
  */
type H264AdaptiveQuantization = "OFF" | "AUTO" | "LOW" | "MEDIUM" | "HIGH" | "HIGHER" | "MAX"
object H264AdaptiveQuantization {
  inline val OFF: "OFF" = "OFF"
  inline val AUTO: "AUTO" = "AUTO"
  inline val LOW: "LOW" = "LOW"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val HIGH: "HIGH" = "HIGH"
  inline val HIGHER: "HIGHER" = "HIGHER"
  inline val MAX: "MAX" = "MAX"

  inline def values: js.Array[H264AdaptiveQuantization] = js.Array(OFF, AUTO, LOW, MEDIUM, HIGH, HIGHER, MAX)
}

/** Specify an H.264 level that is consistent with your output video settings. If you aren't sure what level to specify, choose Auto (AUTO).
  */
type H264CodecLevel = "AUTO" | "LEVEL_1" | "LEVEL_1_1" | "LEVEL_1_2" | "LEVEL_1_3" | "LEVEL_2" | "LEVEL_2_1" | "LEVEL_2_2" | "LEVEL_3" | "LEVEL_3_1" | "LEVEL_3_2" | "LEVEL_4" | "LEVEL_4_1" | "LEVEL_4_2" | "LEVEL_5" | "LEVEL_5_1" | "LEVEL_5_2"
object H264CodecLevel {
  inline val AUTO: "AUTO" = "AUTO"
  inline val LEVEL_1: "LEVEL_1" = "LEVEL_1"
  inline val LEVEL_1_1: "LEVEL_1_1" = "LEVEL_1_1"
  inline val LEVEL_1_2: "LEVEL_1_2" = "LEVEL_1_2"
  inline val LEVEL_1_3: "LEVEL_1_3" = "LEVEL_1_3"
  inline val LEVEL_2: "LEVEL_2" = "LEVEL_2"
  inline val LEVEL_2_1: "LEVEL_2_1" = "LEVEL_2_1"
  inline val LEVEL_2_2: "LEVEL_2_2" = "LEVEL_2_2"
  inline val LEVEL_3: "LEVEL_3" = "LEVEL_3"
  inline val LEVEL_3_1: "LEVEL_3_1" = "LEVEL_3_1"
  inline val LEVEL_3_2: "LEVEL_3_2" = "LEVEL_3_2"
  inline val LEVEL_4: "LEVEL_4" = "LEVEL_4"
  inline val LEVEL_4_1: "LEVEL_4_1" = "LEVEL_4_1"
  inline val LEVEL_4_2: "LEVEL_4_2" = "LEVEL_4_2"
  inline val LEVEL_5: "LEVEL_5" = "LEVEL_5"
  inline val LEVEL_5_1: "LEVEL_5_1" = "LEVEL_5_1"
  inline val LEVEL_5_2: "LEVEL_5_2" = "LEVEL_5_2"

  inline def values: js.Array[H264CodecLevel] = js.Array(
    AUTO,
    LEVEL_1,
    LEVEL_1_1,
    LEVEL_1_2,
    LEVEL_1_3,
    LEVEL_2,
    LEVEL_2_1,
    LEVEL_2_2,
    LEVEL_3,
    LEVEL_3_1,
    LEVEL_3_2,
    LEVEL_4,
    LEVEL_4_1,
    LEVEL_4_2,
    LEVEL_5,
    LEVEL_5_1,
    LEVEL_5_2
  )
}

/** H.264 Profile. High 4:2:2 and 10-bit profiles are only available with the AVC-I License.
  */
type H264CodecProfile = "BASELINE" | "HIGH" | "HIGH_10BIT" | "HIGH_422" | "HIGH_422_10BIT" | "MAIN"
object H264CodecProfile {
  inline val BASELINE: "BASELINE" = "BASELINE"
  inline val HIGH: "HIGH" = "HIGH"
  inline val HIGH_10BIT: "HIGH_10BIT" = "HIGH_10BIT"
  inline val HIGH_422: "HIGH_422" = "HIGH_422"
  inline val HIGH_422_10BIT: "HIGH_422_10BIT" = "HIGH_422_10BIT"
  inline val MAIN: "MAIN" = "MAIN"

  inline def values: js.Array[H264CodecProfile] = js.Array(BASELINE, HIGH, HIGH_10BIT, HIGH_422, HIGH_422_10BIT, MAIN)
}

/** Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
  */
type H264DynamicSubGop = "ADAPTIVE" | "STATIC"
object H264DynamicSubGop {
  inline val ADAPTIVE: "ADAPTIVE" = "ADAPTIVE"
  inline val STATIC: "STATIC" = "STATIC"

  inline def values: js.Array[H264DynamicSubGop] = js.Array(ADAPTIVE, STATIC)
}

/** Entropy encoding mode. Use CABAC (must be in Main or High profile) or CAVLC.
  */
type H264EntropyEncoding = "CABAC" | "CAVLC"
object H264EntropyEncoding {
  inline val CABAC: "CABAC" = "CABAC"
  inline val CAVLC: "CAVLC" = "CAVLC"

  inline def values: js.Array[H264EntropyEncoding] = js.Array(CABAC, CAVLC)
}

/** Keep the default value, PAFF, to have MediaConvert use PAFF encoding for interlaced outputs. Choose Force field (FORCE_FIELD) to disable PAFF encoding and create separate interlaced fields.
  */
type H264FieldEncoding = "PAFF" | "FORCE_FIELD"
object H264FieldEncoding {
  inline val PAFF: "PAFF" = "PAFF"
  inline val FORCE_FIELD: "FORCE_FIELD" = "FORCE_FIELD"

  inline def values: js.Array[H264FieldEncoding] = js.Array(PAFF, FORCE_FIELD)
}

/** Only use this setting when you change the default value, AUTO, for the setting H264AdaptiveQuantization. When you keep all defaults, excluding H264AdaptiveQuantization and all other adaptive quantization from your JSON job specification, MediaConvert automatically applies the best types of quantization for your video content. When you set H264AdaptiveQuantization to a value other than AUTO, the default value for H264FlickerAdaptiveQuantization is Disabled (DISABLED). Change this value to Enabled (ENABLED) to reduce I-frame pop. I-frame pop appears as a visual flicker that can arise when the encoder saves bits by copying some macroblocks many times from frame to frame, and then refreshes them at the I-frame. When you enable this setting, the encoder updates these macroblocks slightly more often to smooth out the flicker. To manually enable or disable H264FlickerAdaptiveQuantization, you must set Adaptive quantization (H264AdaptiveQuantization) to a value other than AUTO.
  */
type H264FlickerAdaptiveQuantization = "DISABLED" | "ENABLED"
object H264FlickerAdaptiveQuantization {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H264FlickerAdaptiveQuantization] = js.Array(DISABLED, ENABLED)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
type H264FramerateControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object H264FramerateControl {
  inline val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  inline val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  inline def values: js.Array[H264FramerateControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
type H264FramerateConversionAlgorithm = "DUPLICATE_DROP" | "INTERPOLATE" | "FRAMEFORMER"
object H264FramerateConversionAlgorithm {
  inline val DUPLICATE_DROP: "DUPLICATE_DROP" = "DUPLICATE_DROP"
  inline val INTERPOLATE: "INTERPOLATE" = "INTERPOLATE"
  inline val FRAMEFORMER: "FRAMEFORMER" = "FRAMEFORMER"

  inline def values: js.Array[H264FramerateConversionAlgorithm] = js.Array(DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** If enable, use reference B frames for GOP structures that have B frames > 1.
  */
type H264GopBReference = "DISABLED" | "ENABLED"
object H264GopBReference {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H264GopBReference] = js.Array(DISABLED, ENABLED)
}

/** Indicates if the GOP Size in H264 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
  */
type H264GopSizeUnits = "FRAMES" | "SECONDS"
object H264GopSizeUnits {
  inline val FRAMES: "FRAMES" = "FRAMES"
  inline val SECONDS: "SECONDS" = "SECONDS"

  inline def values: js.Array[H264GopSizeUnits] = js.Array(FRAMES, SECONDS)
}

/** Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
  */
type H264InterlaceMode = "PROGRESSIVE" | "TOP_FIELD" | "BOTTOM_FIELD" | "FOLLOW_TOP_FIELD" | "FOLLOW_BOTTOM_FIELD"
object H264InterlaceMode {
  inline val PROGRESSIVE: "PROGRESSIVE" = "PROGRESSIVE"
  inline val TOP_FIELD: "TOP_FIELD" = "TOP_FIELD"
  inline val BOTTOM_FIELD: "BOTTOM_FIELD" = "BOTTOM_FIELD"
  inline val FOLLOW_TOP_FIELD: "FOLLOW_TOP_FIELD" = "FOLLOW_TOP_FIELD"
  inline val FOLLOW_BOTTOM_FIELD: "FOLLOW_BOTTOM_FIELD" = "FOLLOW_BOTTOM_FIELD"

  inline def values: js.Array[H264InterlaceMode] = js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD)
}

/** Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
  */
type H264ParControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object H264ParControl {
  inline val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  inline val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  inline def values: js.Array[H264ParControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, single-pass encoding.
  */
type H264QualityTuningLevel = "SINGLE_PASS" | "SINGLE_PASS_HQ" | "MULTI_PASS_HQ"
object H264QualityTuningLevel {
  inline val SINGLE_PASS: "SINGLE_PASS" = "SINGLE_PASS"
  inline val SINGLE_PASS_HQ: "SINGLE_PASS_HQ" = "SINGLE_PASS_HQ"
  inline val MULTI_PASS_HQ: "MULTI_PASS_HQ" = "MULTI_PASS_HQ"

  inline def values: js.Array[H264QualityTuningLevel] = js.Array(SINGLE_PASS, SINGLE_PASS_HQ, MULTI_PASS_HQ)
}

/** Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
  */
type H264RateControlMode = "VBR" | "CBR" | "QVBR"
object H264RateControlMode {
  inline val VBR: "VBR" = "VBR"
  inline val CBR: "CBR" = "CBR"
  inline val QVBR: "QVBR" = "QVBR"

  inline def values: js.Array[H264RateControlMode] = js.Array(VBR, CBR, QVBR)
}

/** Places a PPS header on each encoded picture, even if repeated.
  */
type H264RepeatPps = "DISABLED" | "ENABLED"
object H264RepeatPps {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H264RepeatPps] = js.Array(DISABLED, ENABLED)
}

/** Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
  */
type H264ScanTypeConversionMode = "INTERLACED" | "INTERLACED_OPTIMIZE"
object H264ScanTypeConversionMode {
  inline val INTERLACED: "INTERLACED" = "INTERLACED"
  inline val INTERLACED_OPTIMIZE: "INTERLACED_OPTIMIZE" = "INTERLACED_OPTIMIZE"

  inline def values: js.Array[H264ScanTypeConversionMode] = js.Array(INTERLACED, INTERLACED_OPTIMIZE)
}

/** Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default. If this output uses QVBR, choose Transition detection (TRANSITION_DETECTION) for further video quality improvement. For more information about QVBR, see https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
  */
type H264SceneChangeDetect = "DISABLED" | "ENABLED" | "TRANSITION_DETECTION"
object H264SceneChangeDetect {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val TRANSITION_DETECTION: "TRANSITION_DETECTION" = "TRANSITION_DETECTION"

  inline def values: js.Array[H264SceneChangeDetect] = js.Array(DISABLED, ENABLED, TRANSITION_DETECTION)
}

/** Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
  */
type H264SlowPal = "DISABLED" | "ENABLED"
object H264SlowPal {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H264SlowPal] = js.Array(DISABLED, ENABLED)
}

/** Only use this setting when you change the default value, Auto (AUTO), for the setting H264AdaptiveQuantization. When you keep all defaults, excluding H264AdaptiveQuantization and all other adaptive quantization from your JSON job specification, MediaConvert automatically applies the best types of quantization for your video content. When you set H264AdaptiveQuantization to a value other than AUTO, the default value for H264SpatialAdaptiveQuantization is Enabled (ENABLED). Keep this default value to adjust quantization within each frame based on spatial variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your video quality.
  * Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture, you might choose to set H264SpatialAdaptiveQuantization to Disabled (DISABLED). Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization (H264AdaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video games, set it to Low. For content with a wider variety of textures, set it to High or Higher. To manually enable or disable H264SpatialAdaptiveQuantization, you must set Adaptive quantization (H264AdaptiveQuantization) to a value other than AUTO.
  */
type H264SpatialAdaptiveQuantization = "DISABLED" | "ENABLED"
object H264SpatialAdaptiveQuantization {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H264SpatialAdaptiveQuantization] = js.Array(DISABLED, ENABLED)
}

/** Produces a bitstream compliant with SMPTE RP-2027.
  */
type H264Syntax = "DEFAULT" | "RP2027"
object H264Syntax {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val RP2027: "RP2027" = "RP2027"

  inline def values: js.Array[H264Syntax] = js.Array(DEFAULT, RP2027)
}

/** When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is interlaced, you can optionally enable hard or soft telecine to create a smoother picture. Hard telecine (HARD) produces a 29.97i output. Soft telecine (SOFT) produces an output with a 23.976 output that signals to the video player device to do the conversion during play back. When you keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother picture.
  */
type H264Telecine = "NONE" | "SOFT" | "HARD"
object H264Telecine {
  inline val NONE: "NONE" = "NONE"
  inline val SOFT: "SOFT" = "SOFT"
  inline val HARD: "HARD" = "HARD"

  inline def values: js.Array[H264Telecine] = js.Array(NONE, SOFT, HARD)
}

/** Only use this setting when you change the default value, AUTO, for the setting H264AdaptiveQuantization. When you keep all defaults, excluding H264AdaptiveQuantization and all other adaptive quantization from your JSON job specification, MediaConvert automatically applies the best types of quantization for your video content. When you set H264AdaptiveQuantization to a value other than AUTO, the default value for H264TemporalAdaptiveQuantization is Enabled (ENABLED). Keep this default value to adjust quantization within each frame based on temporal variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that aren't moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into
  * account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen that doesn't have moving objects with sharp edges, such as sports athletes' faces, you might choose to set H264TemporalAdaptiveQuantization to Disabled (DISABLED). Related setting: When you enable temporal quantization, adjust the strength of the filter with the setting Adaptive quantization (adaptiveQuantization). To manually enable or disable H264TemporalAdaptiveQuantization, you must set Adaptive quantization (H264AdaptiveQuantization) to a value other than AUTO.
  */
type H264TemporalAdaptiveQuantization = "DISABLED" | "ENABLED"
object H264TemporalAdaptiveQuantization {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H264TemporalAdaptiveQuantization] = js.Array(DISABLED, ENABLED)
}

/** Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
  */
type H264UnregisteredSeiTimecode = "DISABLED" | "ENABLED"
object H264UnregisteredSeiTimecode {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H264UnregisteredSeiTimecode] = js.Array(DISABLED, ENABLED)
}

/** Specify the strength of any adaptive quantization filters that you enable. The value that you choose here applies to the following settings: Flicker adaptive quantization (flickerAdaptiveQuantization), Spatial adaptive quantization (spatialAdaptiveQuantization), and Temporal adaptive quantization (temporalAdaptiveQuantization).
  */
type H265AdaptiveQuantization = "OFF" | "LOW" | "MEDIUM" | "HIGH" | "HIGHER" | "MAX"
object H265AdaptiveQuantization {
  inline val OFF: "OFF" = "OFF"
  inline val LOW: "LOW" = "LOW"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val HIGH: "HIGH" = "HIGH"
  inline val HIGHER: "HIGHER" = "HIGHER"
  inline val MAX: "MAX" = "MAX"

  inline def values: js.Array[H265AdaptiveQuantization] = js.Array(OFF, LOW, MEDIUM, HIGH, HIGHER, MAX)
}

/** Enables Alternate Transfer Function SEI message for outputs using Hybrid Log Gamma (HLG) Electro-Optical Transfer Function (EOTF).
  */
type H265AlternateTransferFunctionSei = "DISABLED" | "ENABLED"
object H265AlternateTransferFunctionSei {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H265AlternateTransferFunctionSei] = js.Array(DISABLED, ENABLED)
}

/** H.265 Level.
  */
type H265CodecLevel = "AUTO" | "LEVEL_1" | "LEVEL_2" | "LEVEL_2_1" | "LEVEL_3" | "LEVEL_3_1" | "LEVEL_4" | "LEVEL_4_1" | "LEVEL_5" | "LEVEL_5_1" | "LEVEL_5_2" | "LEVEL_6" | "LEVEL_6_1" | "LEVEL_6_2"
object H265CodecLevel {
  inline val AUTO: "AUTO" = "AUTO"
  inline val LEVEL_1: "LEVEL_1" = "LEVEL_1"
  inline val LEVEL_2: "LEVEL_2" = "LEVEL_2"
  inline val LEVEL_2_1: "LEVEL_2_1" = "LEVEL_2_1"
  inline val LEVEL_3: "LEVEL_3" = "LEVEL_3"
  inline val LEVEL_3_1: "LEVEL_3_1" = "LEVEL_3_1"
  inline val LEVEL_4: "LEVEL_4" = "LEVEL_4"
  inline val LEVEL_4_1: "LEVEL_4_1" = "LEVEL_4_1"
  inline val LEVEL_5: "LEVEL_5" = "LEVEL_5"
  inline val LEVEL_5_1: "LEVEL_5_1" = "LEVEL_5_1"
  inline val LEVEL_5_2: "LEVEL_5_2" = "LEVEL_5_2"
  inline val LEVEL_6: "LEVEL_6" = "LEVEL_6"
  inline val LEVEL_6_1: "LEVEL_6_1" = "LEVEL_6_1"
  inline val LEVEL_6_2: "LEVEL_6_2" = "LEVEL_6_2"

  inline def values: js.Array[H265CodecLevel] = js.Array(AUTO, LEVEL_1, LEVEL_2, LEVEL_2_1, LEVEL_3, LEVEL_3_1, LEVEL_4, LEVEL_4_1, LEVEL_5, LEVEL_5_1, LEVEL_5_2, LEVEL_6, LEVEL_6_1, LEVEL_6_2)
}

/** Represents the Profile and Tier, per the HEVC (H.265) specification. Selections are grouped as [Profile] / [Tier], so "Main/High" represents Main Profile with High Tier. 4:2:2 profiles are only available with the HEVC 4:2:2 License.
  */
type H265CodecProfile = "MAIN_MAIN" | "MAIN_HIGH" | "MAIN10_MAIN" | "MAIN10_HIGH" | "MAIN_422_8BIT_MAIN" | "MAIN_422_8BIT_HIGH" | "MAIN_422_10BIT_MAIN" | "MAIN_422_10BIT_HIGH"
object H265CodecProfile {
  inline val MAIN_MAIN: "MAIN_MAIN" = "MAIN_MAIN"
  inline val MAIN_HIGH: "MAIN_HIGH" = "MAIN_HIGH"
  inline val MAIN10_MAIN: "MAIN10_MAIN" = "MAIN10_MAIN"
  inline val MAIN10_HIGH: "MAIN10_HIGH" = "MAIN10_HIGH"
  inline val MAIN_422_8BIT_MAIN: "MAIN_422_8BIT_MAIN" = "MAIN_422_8BIT_MAIN"
  inline val MAIN_422_8BIT_HIGH: "MAIN_422_8BIT_HIGH" = "MAIN_422_8BIT_HIGH"
  inline val MAIN_422_10BIT_MAIN: "MAIN_422_10BIT_MAIN" = "MAIN_422_10BIT_MAIN"
  inline val MAIN_422_10BIT_HIGH: "MAIN_422_10BIT_HIGH" = "MAIN_422_10BIT_HIGH"

  inline def values: js.Array[H265CodecProfile] = js.Array(MAIN_MAIN, MAIN_HIGH, MAIN10_MAIN, MAIN10_HIGH, MAIN_422_8BIT_MAIN, MAIN_422_8BIT_HIGH, MAIN_422_10BIT_MAIN, MAIN_422_10BIT_HIGH)
}

/** Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
  */
type H265DynamicSubGop = "ADAPTIVE" | "STATIC"
object H265DynamicSubGop {
  inline val ADAPTIVE: "ADAPTIVE" = "ADAPTIVE"
  inline val STATIC: "STATIC" = "STATIC"

  inline def values: js.Array[H265DynamicSubGop] = js.Array(ADAPTIVE, STATIC)
}

/** Enable this setting to have the encoder reduce I-frame pop. I-frame pop appears as a visual flicker that can arise when the encoder saves bits by copying some macroblocks many times from frame to frame, and then refreshes them at the I-frame. When you enable this setting, the encoder updates these macroblocks slightly more often to smooth out the flicker. This setting is disabled by default. Related setting: In addition to enabling this setting, you must also set adaptiveQuantization to a value other than Off (OFF).
  */
type H265FlickerAdaptiveQuantization = "DISABLED" | "ENABLED"
object H265FlickerAdaptiveQuantization {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H265FlickerAdaptiveQuantization] = js.Array(DISABLED, ENABLED)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
type H265FramerateControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object H265FramerateControl {
  inline val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  inline val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  inline def values: js.Array[H265FramerateControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
type H265FramerateConversionAlgorithm = "DUPLICATE_DROP" | "INTERPOLATE" | "FRAMEFORMER"
object H265FramerateConversionAlgorithm {
  inline val DUPLICATE_DROP: "DUPLICATE_DROP" = "DUPLICATE_DROP"
  inline val INTERPOLATE: "INTERPOLATE" = "INTERPOLATE"
  inline val FRAMEFORMER: "FRAMEFORMER" = "FRAMEFORMER"

  inline def values: js.Array[H265FramerateConversionAlgorithm] = js.Array(DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** If enable, use reference B frames for GOP structures that have B frames > 1.
  */
type H265GopBReference = "DISABLED" | "ENABLED"
object H265GopBReference {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H265GopBReference] = js.Array(DISABLED, ENABLED)
}

/** Indicates if the GOP Size in H265 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
  */
type H265GopSizeUnits = "FRAMES" | "SECONDS"
object H265GopSizeUnits {
  inline val FRAMES: "FRAMES" = "FRAMES"
  inline val SECONDS: "SECONDS" = "SECONDS"

  inline def values: js.Array[H265GopSizeUnits] = js.Array(FRAMES, SECONDS)
}

/** Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
  */
type H265InterlaceMode = "PROGRESSIVE" | "TOP_FIELD" | "BOTTOM_FIELD" | "FOLLOW_TOP_FIELD" | "FOLLOW_BOTTOM_FIELD"
object H265InterlaceMode {
  inline val PROGRESSIVE: "PROGRESSIVE" = "PROGRESSIVE"
  inline val TOP_FIELD: "TOP_FIELD" = "TOP_FIELD"
  inline val BOTTOM_FIELD: "BOTTOM_FIELD" = "BOTTOM_FIELD"
  inline val FOLLOW_TOP_FIELD: "FOLLOW_TOP_FIELD" = "FOLLOW_TOP_FIELD"
  inline val FOLLOW_BOTTOM_FIELD: "FOLLOW_BOTTOM_FIELD" = "FOLLOW_BOTTOM_FIELD"

  inline def values: js.Array[H265InterlaceMode] = js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD)
}

/** Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
  */
type H265ParControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object H265ParControl {
  inline val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  inline val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  inline def values: js.Array[H265ParControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, single-pass encoding.
  */
type H265QualityTuningLevel = "SINGLE_PASS" | "SINGLE_PASS_HQ" | "MULTI_PASS_HQ"
object H265QualityTuningLevel {
  inline val SINGLE_PASS: "SINGLE_PASS" = "SINGLE_PASS"
  inline val SINGLE_PASS_HQ: "SINGLE_PASS_HQ" = "SINGLE_PASS_HQ"
  inline val MULTI_PASS_HQ: "MULTI_PASS_HQ" = "MULTI_PASS_HQ"

  inline def values: js.Array[H265QualityTuningLevel] = js.Array(SINGLE_PASS, SINGLE_PASS_HQ, MULTI_PASS_HQ)
}

/** Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
  */
type H265RateControlMode = "VBR" | "CBR" | "QVBR"
object H265RateControlMode {
  inline val VBR: "VBR" = "VBR"
  inline val CBR: "CBR" = "CBR"
  inline val QVBR: "QVBR" = "QVBR"

  inline def values: js.Array[H265RateControlMode] = js.Array(VBR, CBR, QVBR)
}

/** Specify Sample Adaptive Offset (SAO) filter strength. Adaptive mode dynamically selects best strength based on content
  */
type H265SampleAdaptiveOffsetFilterMode = "DEFAULT" | "ADAPTIVE" | "OFF"
object H265SampleAdaptiveOffsetFilterMode {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val ADAPTIVE: "ADAPTIVE" = "ADAPTIVE"
  inline val OFF: "OFF" = "OFF"

  inline def values: js.Array[H265SampleAdaptiveOffsetFilterMode] = js.Array(DEFAULT, ADAPTIVE, OFF)
}

/** Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
  */
type H265ScanTypeConversionMode = "INTERLACED" | "INTERLACED_OPTIMIZE"
object H265ScanTypeConversionMode {
  inline val INTERLACED: "INTERLACED" = "INTERLACED"
  inline val INTERLACED_OPTIMIZE: "INTERLACED_OPTIMIZE" = "INTERLACED_OPTIMIZE"

  inline def values: js.Array[H265ScanTypeConversionMode] = js.Array(INTERLACED, INTERLACED_OPTIMIZE)
}

/** Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default. If this output uses QVBR, choose Transition detection (TRANSITION_DETECTION) for further video quality improvement. For more information about QVBR, see https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
  */
type H265SceneChangeDetect = "DISABLED" | "ENABLED" | "TRANSITION_DETECTION"
object H265SceneChangeDetect {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val TRANSITION_DETECTION: "TRANSITION_DETECTION" = "TRANSITION_DETECTION"

  inline def values: js.Array[H265SceneChangeDetect] = js.Array(DISABLED, ENABLED, TRANSITION_DETECTION)
}

/** Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
  */
type H265SlowPal = "DISABLED" | "ENABLED"
object H265SlowPal {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H265SlowPal] = js.Array(DISABLED, ENABLED)
}

/** Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture, you might choose to disable this feature. Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video
  * games, set it to Low. For content with a wider variety of textures, set it to High or Higher.
  */
type H265SpatialAdaptiveQuantization = "DISABLED" | "ENABLED"
object H265SpatialAdaptiveQuantization {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H265SpatialAdaptiveQuantization] = js.Array(DISABLED, ENABLED)
}

/** This field applies only if the Streams > Advanced > Framerate (framerate) field is set to 29.970. This field works with the Streams > Advanced > Preprocessors > Deinterlacer field (deinterlace_mode) and the Streams > Advanced > Interlaced Mode field (interlace_mode) to identify the scan type for the output: Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces 23.976; the player converts this output to 29.97i.
  */
type H265Telecine = "NONE" | "SOFT" | "HARD"
object H265Telecine {
  inline val NONE: "NONE" = "NONE"
  inline val SOFT: "SOFT" = "SOFT"
  inline val HARD: "HARD" = "HARD"

  inline def values: js.Array[H265Telecine] = js.Array(NONE, SOFT, HARD)
}

/** Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on temporal variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that aren't moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen that doesn't have moving objects with sharp edges, such as sports athletes' faces, you might choose to disable this feature. Related setting: When you enable temporal quantization, adjust the strength of the filter with the setting Adaptive quantization (adaptiveQuantization).
  */
type H265TemporalAdaptiveQuantization = "DISABLED" | "ENABLED"
object H265TemporalAdaptiveQuantization {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H265TemporalAdaptiveQuantization] = js.Array(DISABLED, ENABLED)
}

/** Enables temporal layer identifiers in the encoded bitstream. Up to 3 layers are supported depending on GOP structure: I- and P-frames form one layer, reference B-frames can form a second layer and non-reference b-frames can form a third layer. Decoders can optionally decode only the lower temporal layers to generate a lower frame rate output. For example, given a bitstream with temporal IDs and with b-frames = 1 (i.e. IbPbPb display order), a decoder could decode all the frames for full frame rate output or only the I and P frames (lowest temporal layer) for a half frame rate output.
  */
type H265TemporalIds = "DISABLED" | "ENABLED"
object H265TemporalIds {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H265TemporalIds] = js.Array(DISABLED, ENABLED)
}

/** Enable use of tiles, allowing horizontal as well as vertical subdivision of the encoded pictures.
  */
type H265Tiles = "DISABLED" | "ENABLED"
object H265Tiles {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H265Tiles] = js.Array(DISABLED, ENABLED)
}

/** Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
  */
type H265UnregisteredSeiTimecode = "DISABLED" | "ENABLED"
object H265UnregisteredSeiTimecode {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[H265UnregisteredSeiTimecode] = js.Array(DISABLED, ENABLED)
}

/** If the location of parameter set NAL units doesn't matter in your workflow, ignore this setting. Use this setting only with CMAF or DASH outputs, or with standalone file outputs in an MPEG-4 container (MP4 outputs). Choose HVC1 to mark your output as HVC1. This makes your output compliant with the following specification: ISO IECJTC1 SC29 N13798 Text ISO/IEC FDIS 14496-15 3rd Edition. For these outputs, the service stores parameter set NAL units in the sample headers but not in the samples directly. For MP4 outputs, when you choose HVC1, your output video might not work properly with some downstream systems and video players. The service defaults to marking your output as HEV1. For these outputs, the service writes parameter set NAL units directly into the samples.
  */
type H265WriteMp4PackagingType = "HVC1" | "HEV1"
object H265WriteMp4PackagingType {
  inline val HVC1: "HVC1" = "HVC1"
  inline val HEV1: "HEV1" = "HEV1"

  inline def values: js.Array[H265WriteMp4PackagingType] = js.Array(HVC1, HEV1)
}

type HlsAdMarkers = "ELEMENTAL" | "ELEMENTAL_SCTE35"
object HlsAdMarkers {
  inline val ELEMENTAL: "ELEMENTAL" = "ELEMENTAL"
  inline val ELEMENTAL_SCTE35: "ELEMENTAL_SCTE35" = "ELEMENTAL_SCTE35"

  inline def values: js.Array[HlsAdMarkers] = js.Array(ELEMENTAL, ELEMENTAL_SCTE35)
}

/** Use this setting only in audio-only outputs. Choose MPEG-2 Transport Stream (M2TS) to create a file in an MPEG2-TS container. Keep the default value Automatic (AUTOMATIC) to create a raw audio-only file with no container. Regardless of the value that you specify here, if this output has video, the service will place outputs into an MPEG2-TS container.
  */
type HlsAudioOnlyContainer = "AUTOMATIC" | "M2TS"
object HlsAudioOnlyContainer {
  inline val AUTOMATIC: "AUTOMATIC" = "AUTOMATIC"
  inline val M2TS: "M2TS" = "M2TS"

  inline def values: js.Array[HlsAudioOnlyContainer] = js.Array(AUTOMATIC, M2TS)
}

/** Ignore this setting unless you are using FairPlay DRM with Verimatrix and you encounter playback issues. Keep the default value, Include (INCLUDE), to output audio-only headers. Choose Exclude (EXCLUDE) to remove the audio-only headers from your audio segments.
  */
type HlsAudioOnlyHeader = "INCLUDE" | "EXCLUDE"
object HlsAudioOnlyHeader {
  inline val INCLUDE: "INCLUDE" = "INCLUDE"
  inline val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  inline def values: js.Array[HlsAudioOnlyHeader] = js.Array(INCLUDE, EXCLUDE)
}

/** Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this audio-only stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest. Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
  */
type HlsAudioTrackType = "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT" | "ALTERNATE_AUDIO_AUTO_SELECT" | "ALTERNATE_AUDIO_NOT_AUTO_SELECT" | "AUDIO_ONLY_VARIANT_STREAM"
object HlsAudioTrackType {
  inline val ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT: "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT" = "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT"
  inline val ALTERNATE_AUDIO_AUTO_SELECT: "ALTERNATE_AUDIO_AUTO_SELECT" = "ALTERNATE_AUDIO_AUTO_SELECT"
  inline val ALTERNATE_AUDIO_NOT_AUTO_SELECT: "ALTERNATE_AUDIO_NOT_AUTO_SELECT" = "ALTERNATE_AUDIO_NOT_AUTO_SELECT"
  inline val AUDIO_ONLY_VARIANT_STREAM: "AUDIO_ONLY_VARIANT_STREAM" = "AUDIO_ONLY_VARIANT_STREAM"

  inline def values: js.Array[HlsAudioTrackType] = js.Array(ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT, ALTERNATE_AUDIO_AUTO_SELECT, ALTERNATE_AUDIO_NOT_AUTO_SELECT, AUDIO_ONLY_VARIANT_STREAM)
}

/** Applies only to 608 Embedded output captions. Insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you specify. Make sure to specify the languages in the order in which they appear in the original source (if the source is embedded format) or the order of the caption selectors (if the source is other than embedded). Otherwise, languages in the manifest will not match up properly with the output captions. None: Include CLOSED-CAPTIONS=NONE line in the manifest. Omit: Omit any CLOSED-CAPTIONS line from the manifest.
  */
type HlsCaptionLanguageSetting = "INSERT" | "OMIT" | "NONE"
object HlsCaptionLanguageSetting {
  inline val INSERT: "INSERT" = "INSERT"
  inline val OMIT: "OMIT" = "OMIT"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[HlsCaptionLanguageSetting] = js.Array(INSERT, OMIT, NONE)
}

/** Disable this setting only when your workflow requires the #EXT-X-ALLOW-CACHE:no tag. Otherwise, keep the default value Enabled (ENABLED) and control caching in your video distribution set up. For example, use the Cache-Control http header.
  */
type HlsClientCache = "DISABLED" | "ENABLED"
object HlsClientCache {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[HlsClientCache] = js.Array(DISABLED, ENABLED)
}

/** Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
  */
type HlsCodecSpecification = "RFC_6381" | "RFC_4281"
object HlsCodecSpecification {
  inline val RFC_6381: "RFC_6381" = "RFC_6381"
  inline val RFC_4281: "RFC_4281" = "RFC_4281"

  inline def values: js.Array[HlsCodecSpecification] = js.Array(RFC_6381, RFC_4281)
}

/** Specify whether to flag this audio track as descriptive video service (DVS) in your HLS parent manifest. When you choose Flag (FLAG), MediaConvert includes the parameter CHARACTERISTICS="public.accessibility.describes-video" in the EXT-X-MEDIA entry for this track. When you keep the default choice, Don't flag (DONT_FLAG), MediaConvert leaves this parameter out. The DVS flag can help with accessibility on Apple devices. For more information, see the Apple documentation.
  */
type HlsDescriptiveVideoServiceFlag = "DONT_FLAG" | "FLAG"
object HlsDescriptiveVideoServiceFlag {
  inline val DONT_FLAG: "DONT_FLAG" = "DONT_FLAG"
  inline val FLAG: "FLAG" = "FLAG"

  inline def values: js.Array[HlsDescriptiveVideoServiceFlag] = js.Array(DONT_FLAG, FLAG)
}

/** Indicates whether segments should be placed in subdirectories.
  */
type HlsDirectoryStructure = "SINGLE_DIRECTORY" | "SUBDIRECTORY_PER_STREAM"
object HlsDirectoryStructure {
  inline val SINGLE_DIRECTORY: "SINGLE_DIRECTORY" = "SINGLE_DIRECTORY"
  inline val SUBDIRECTORY_PER_STREAM: "SUBDIRECTORY_PER_STREAM" = "SUBDIRECTORY_PER_STREAM"

  inline def values: js.Array[HlsDirectoryStructure] = js.Array(SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM)
}

/** Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in the web interface also disables encryption.
  */
type HlsEncryptionType = "AES128" | "SAMPLE_AES"
object HlsEncryptionType {
  inline val AES128: "AES128" = "AES128"
  inline val SAMPLE_AES: "SAMPLE_AES" = "SAMPLE_AES"

  inline def values: js.Array[HlsEncryptionType] = js.Array(AES128, SAMPLE_AES)
}

/** Choose Include (INCLUDE) to have MediaConvert generate a child manifest that lists only the I-frames for this rendition, in addition to your regular manifest for this rendition. You might use this manifest as part of a workflow that creates preview functions for your video. MediaConvert adds both the I-frame only child manifest and the regular child manifest to the parent manifest. When you don't need the I-frame only child manifest, keep the default value Exclude (EXCLUDE).
  */
type HlsIFrameOnlyManifest = "INCLUDE" | "EXCLUDE"
object HlsIFrameOnlyManifest {
  inline val INCLUDE: "INCLUDE" = "INCLUDE"
  inline val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  inline def values: js.Array[HlsIFrameOnlyManifest] = js.Array(INCLUDE, EXCLUDE)
}

/** The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If set to INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not in the manifest.
  */
type HlsInitializationVectorInManifest = "INCLUDE" | "EXCLUDE"
object HlsInitializationVectorInManifest {
  inline val INCLUDE: "INCLUDE" = "INCLUDE"
  inline val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  inline def values: js.Array[HlsInitializationVectorInManifest] = js.Array(INCLUDE, EXCLUDE)
}

/** Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
  */
type HlsKeyProviderType = "SPEKE" | "STATIC_KEY"
object HlsKeyProviderType {
  inline val SPEKE: "SPEKE" = "SPEKE"
  inline val STATIC_KEY: "STATIC_KEY" = "STATIC_KEY"

  inline def values: js.Array[HlsKeyProviderType] = js.Array(SPEKE, STATIC_KEY)
}

/** When set to GZIP, compresses HLS playlist.
  */
type HlsManifestCompression = "GZIP" | "NONE"
object HlsManifestCompression {
  inline val GZIP: "GZIP" = "GZIP"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[HlsManifestCompression] = js.Array(GZIP, NONE)
}

/** Indicates whether the output manifest should use floating point values for segment duration.
  */
type HlsManifestDurationFormat = "FLOATING_POINT" | "INTEGER"
object HlsManifestDurationFormat {
  inline val FLOATING_POINT: "FLOATING_POINT" = "FLOATING_POINT"
  inline val INTEGER: "INTEGER" = "INTEGER"

  inline def values: js.Array[HlsManifestDurationFormat] = js.Array(FLOATING_POINT, INTEGER)
}

/** Enable this setting to insert the EXT-X-SESSION-KEY element into the master playlist. This allows for offline Apple HLS FairPlay content protection.
  */
type HlsOfflineEncrypted = "ENABLED" | "DISABLED"
object HlsOfflineEncrypted {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[HlsOfflineEncrypted] = js.Array(ENABLED, DISABLED)
}

/** Indicates whether the .m3u8 manifest file should be generated for this HLS output group.
  */
type HlsOutputSelection = "MANIFESTS_AND_SEGMENTS" | "SEGMENTS_ONLY"
object HlsOutputSelection {
  inline val MANIFESTS_AND_SEGMENTS: "MANIFESTS_AND_SEGMENTS" = "MANIFESTS_AND_SEGMENTS"
  inline val SEGMENTS_ONLY: "SEGMENTS_ONLY" = "SEGMENTS_ONLY"

  inline def values: js.Array[HlsOutputSelection] = js.Array(MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY)
}

/** Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as follows: either the program date and time are initialized using the input timecode source, or the time is initialized using the input timecode source and the date is initialized using the timestamp_offset.
  */
type HlsProgramDateTime = "INCLUDE" | "EXCLUDE"
object HlsProgramDateTime {
  inline val INCLUDE: "INCLUDE" = "INCLUDE"
  inline val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  inline def values: js.Array[HlsProgramDateTime] = js.Array(INCLUDE, EXCLUDE)
}

/** When set to SINGLE_FILE, emits program as a single media resource (.ts) file, uses #EXT-X-BYTERANGE tags to index segment for playback.
  */
type HlsSegmentControl = "SINGLE_FILE" | "SEGMENTED_FILES"
object HlsSegmentControl {
  inline val SINGLE_FILE: "SINGLE_FILE" = "SINGLE_FILE"
  inline val SEGMENTED_FILES: "SEGMENTED_FILES" = "SEGMENTED_FILES"

  inline def values: js.Array[HlsSegmentControl] = js.Array(SINGLE_FILE, SEGMENTED_FILES)
}

/** Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
  */
type HlsStreamInfResolution = "INCLUDE" | "EXCLUDE"
object HlsStreamInfResolution {
  inline val INCLUDE: "INCLUDE" = "INCLUDE"
  inline val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  inline def values: js.Array[HlsStreamInfResolution] = js.Array(INCLUDE, EXCLUDE)
}

/** Indicates ID3 frame that has the timecode.
  */
type HlsTimedMetadataId3Frame = "NONE" | "PRIV" | "TDRL"
object HlsTimedMetadataId3Frame {
  inline val NONE: "NONE" = "NONE"
  inline val PRIV: "PRIV" = "PRIV"
  inline val TDRL: "TDRL" = "TDRL"

  inline def values: js.Array[HlsTimedMetadataId3Frame] = js.Array(NONE, PRIV, TDRL)
}

/** Keep this setting enabled to have MediaConvert use the font style and position information from the captions source in the output. This option is available only when your input captions are IMSC, SMPTE-TT, or TTML. Disable this setting for simplified output captions.
  */
type ImscStylePassthrough = "ENABLED" | "DISABLED"
object ImscStylePassthrough {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[ImscStylePassthrough] = js.Array(ENABLED, DISABLED)
}

/** Enable Deblock (InputDeblockFilter) to produce smoother motion in the output. Default is disabled. Only manually controllable for MPEG2 and uncompressed video inputs.
  */
type InputDeblockFilter = "ENABLED" | "DISABLED"
object InputDeblockFilter {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[InputDeblockFilter] = js.Array(ENABLED, DISABLED)
}

/** Enable Denoise (InputDenoiseFilter) to filter noise from the input. Default is disabled. Only applicable to MPEG2, H.264, H.265, and uncompressed video inputs.
  */
type InputDenoiseFilter = "ENABLED" | "DISABLED"
object InputDenoiseFilter {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[InputDenoiseFilter] = js.Array(ENABLED, DISABLED)
}

/** Specify how the transcoding service applies the denoise and deblock filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and Deblock (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering, depending on input type and quality. * Disable - The input is not filtered. This is true even if you use the API to enable them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The input is filtered regardless of input type.
  */
type InputFilterEnable = "AUTO" | "DISABLE" | "FORCE"
object InputFilterEnable {
  inline val AUTO: "AUTO" = "AUTO"
  inline val DISABLE: "DISABLE" = "DISABLE"
  inline val FORCE: "FORCE" = "FORCE"

  inline def values: js.Array[InputFilterEnable] = js.Array(AUTO, DISABLE, FORCE)
}

/** Set PSI control (InputPsiControl) for transport stream inputs to specify which data the demux process to scans. * Ignore PSI - Scan all PIDs for audio and video. * Use PSI - Scan only PSI data.
  */
type InputPsiControl = "IGNORE_PSI" | "USE_PSI"
object InputPsiControl {
  inline val IGNORE_PSI: "IGNORE_PSI" = "IGNORE_PSI"
  inline val USE_PSI: "USE_PSI" = "USE_PSI"

  inline def values: js.Array[InputPsiControl] = js.Array(IGNORE_PSI, USE_PSI)
}

/** Use Rotate (InputRotate) to specify how the service rotates your video. You can choose automatic rotation or specify a rotation. You can specify a clockwise rotation of 0, 90, 180, or 270 degrees. If your input video container is .mov or .mp4 and your input has rotation metadata, you can choose Automatic to have the service rotate your video according to the rotation specified in the metadata. The rotation must be within one degree of 90, 180, or 270 degrees. If the rotation metadata specifies any other rotation, the service will default to no rotation. By default, the service does no rotation, even if your input video has rotation metadata. The service doesn't pass through rotation metadata.
  */
type InputRotate = "DEGREE_0" | "DEGREES_90" | "DEGREES_180" | "DEGREES_270" | "AUTO"
object InputRotate {
  inline val DEGREE_0: "DEGREE_0" = "DEGREE_0"
  inline val DEGREES_90: "DEGREES_90" = "DEGREES_90"
  inline val DEGREES_180: "DEGREES_180" = "DEGREES_180"
  inline val DEGREES_270: "DEGREES_270" = "DEGREES_270"
  inline val AUTO: "AUTO" = "AUTO"

  inline def values: js.Array[InputRotate] = js.Array(DEGREE_0, DEGREES_90, DEGREES_180, DEGREES_270, AUTO)
}

/** When you have a progressive segmented frame (PsF) input, use this setting to flag the input as PsF. MediaConvert doesn't automatically detect PsF. Therefore, flagging your input as PsF results in better preservation of video quality when you do deinterlacing and frame rate conversion. If you don't specify, the default value is Auto (AUTO). Auto is the correct setting for all inputs that are not PsF. Don't set this value to PsF when your input is interlaced. Doing so creates horizontal interlacing artifacts.
  */
type InputScanType = "AUTO" | "PSF"
object InputScanType {
  inline val AUTO: "AUTO" = "AUTO"
  inline val PSF: "PSF" = "PSF"

  inline def values: js.Array[InputScanType] = js.Array(AUTO, PSF)
}

/** Use this Timecode source setting, located under the input settings (InputTimecodeSource), to specify how the service counts input video frames. This input frame count affects only the behavior of features that apply to a single input at a time, such as input clipping and synchronizing some captions formats. Choose Embedded (EMBEDDED) to use the timecodes in your input video. Choose Start at zero (ZEROBASED) to start the first frame at zero. Choose Specified start (SPECIFIEDSTART) to start the first frame at the timecode that you specify in the setting Start timecode (timecodeStart). If you don't specify a value for Timecode source, the service will use Embedded by default. For more information about timecodes, see https://docs.aws.amazon.com/console/mediaconvert/timecode.
  */
type InputTimecodeSource = "EMBEDDED" | "ZEROBASED" | "SPECIFIEDSTART"
object InputTimecodeSource {
  inline val EMBEDDED: "EMBEDDED" = "EMBEDDED"
  inline val ZEROBASED: "ZEROBASED" = "ZEROBASED"
  inline val SPECIFIEDSTART: "SPECIFIEDSTART" = "SPECIFIEDSTART"

  inline def values: js.Array[InputTimecodeSource] = js.Array(EMBEDDED, ZEROBASED, SPECIFIEDSTART)
}

/** A job's phase can be PROBING, TRANSCODING OR UPLOADING
  */
type JobPhase = "PROBING" | "TRANSCODING" | "UPLOADING"
object JobPhase {
  inline val PROBING: "PROBING" = "PROBING"
  inline val TRANSCODING: "TRANSCODING" = "TRANSCODING"
  inline val UPLOADING: "UPLOADING" = "UPLOADING"

  inline def values: js.Array[JobPhase] = js.Array(PROBING, TRANSCODING, UPLOADING)
}

/** A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
  */
type JobStatus = "SUBMITTED" | "PROGRESSING" | "COMPLETE" | "CANCELED" | "ERROR"
object JobStatus {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val PROGRESSING: "PROGRESSING" = "PROGRESSING"
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val CANCELED: "CANCELED" = "CANCELED"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[JobStatus] = js.Array(SUBMITTED, PROGRESSING, COMPLETE, CANCELED, ERROR)
}

/** Optional. When you request a list of job templates, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
  */
type JobTemplateListBy = "NAME" | "CREATION_DATE" | "SYSTEM"
object JobTemplateListBy {
  inline val NAME: "NAME" = "NAME"
  inline val CREATION_DATE: "CREATION_DATE" = "CREATION_DATE"
  inline val SYSTEM: "SYSTEM" = "SYSTEM"

  inline def values: js.Array[JobTemplateListBy] = js.Array(NAME, CREATION_DATE, SYSTEM)
}

/** Specify the language, using the ISO 639-2 three-letter code listed at https://www.loc.gov/standards/iso639-2/php/code_list.php.
  */
type LanguageCode = "ENG" | "SPA" | "FRA" | "DEU" | "GER" | "ZHO" | "ARA" | "HIN" | "JPN" | "RUS" | "POR" | "ITA" | "URD" | "VIE" | "KOR" | "PAN" | "ABK" | "AAR" | "AFR" | "AKA" | "SQI" | "AMH" | "ARG" | "HYE" | "ASM" | "AVA" | "AVE" | "AYM" | "AZE" | "BAM" | "BAK" | "EUS" | "BEL" | "BEN" | "BIH" | "BIS" | "BOS" | "BRE" | "BUL" | "MYA" | "CAT" | "KHM" | "CHA" | "CHE" | "NYA" | "CHU" | "CHV" | "COR" | "COS" | "CRE" | "HRV" | "CES" | "DAN" | "DIV" | "NLD" | "DZO" | "ENM" | "EPO" | "EST" | "EWE" | "FAO" | "FIJ" | "FIN" | "FRM" | "FUL" | "GLA" | "GLG" | "LUG" | "KAT" | "ELL" | "GRN" | "GUJ" | "HAT" | "HAU" | "HEB" | "HER" | "HMO" | "HUN" | "ISL" | "IDO" | "IBO" | "IND" | "INA" | "ILE" | "IKU" | "IPK" | "GLE" | "JAV" | "KAL" | "KAN" | "KAU" | "KAS" | "KAZ" | "KIK" | "KIN" | "KIR" | "KOM" | "KON" | "KUA" | "KUR" | "LAO" | "LAT" | "LAV" | "LIM" | "LIN" | "LIT" | "LUB" | "LTZ" | "MKD" | "MLG" | "MSA" | "MAL" | "MLT" | "GLV" | "MRI" | "MAR" | "MAH" | "MON" | "NAU" | "NAV" | "NDE" | "NBL" |
  "NDO" | "NEP" | "SME" | "NOR" | "NOB" | "NNO" | "OCI" | "OJI" | "ORI" | "ORM" | "OSS" | "PLI" | "FAS" | "POL" | "PUS" | "QUE" | "QAA" | "RON" | "ROH" | "RUN" | "SMO" | "SAG" | "SAN" | "SRD" | "SRB" | "SNA" | "III" | "SND" | "SIN" | "SLK" | "SLV" | "SOM" | "SOT" | "SUN" | "SWA" | "SSW" | "SWE" | "TGL" | "TAH" | "TGK" | "TAM" | "TAT" | "TEL" | "THA" | "BOD" | "TIR" | "TON" | "TSO" | "TSN" | "TUR" | "TUK" | "TWI" | "UIG" | "UKR" | "UZB" | "VEN" | "VOL" | "WLN" | "CYM" | "FRY" | "WOL" | "XHO" | "YID" | "YOR" | "ZHA" | "ZUL" | "ORJ" | "QPC" | "TNG"
object LanguageCode {
  inline val ENG: "ENG" = "ENG"
  inline val SPA: "SPA" = "SPA"
  inline val FRA: "FRA" = "FRA"
  inline val DEU: "DEU" = "DEU"
  inline val GER: "GER" = "GER"
  inline val ZHO: "ZHO" = "ZHO"
  inline val ARA: "ARA" = "ARA"
  inline val HIN: "HIN" = "HIN"
  inline val JPN: "JPN" = "JPN"
  inline val RUS: "RUS" = "RUS"
  inline val POR: "POR" = "POR"
  inline val ITA: "ITA" = "ITA"
  inline val URD: "URD" = "URD"
  inline val VIE: "VIE" = "VIE"
  inline val KOR: "KOR" = "KOR"
  inline val PAN: "PAN" = "PAN"
  inline val ABK: "ABK" = "ABK"
  inline val AAR: "AAR" = "AAR"
  inline val AFR: "AFR" = "AFR"
  inline val AKA: "AKA" = "AKA"
  inline val SQI: "SQI" = "SQI"
  inline val AMH: "AMH" = "AMH"
  inline val ARG: "ARG" = "ARG"
  inline val HYE: "HYE" = "HYE"
  inline val ASM: "ASM" = "ASM"
  inline val AVA: "AVA" = "AVA"
  inline val AVE: "AVE" = "AVE"
  inline val AYM: "AYM" = "AYM"
  inline val AZE: "AZE" = "AZE"
  inline val BAM: "BAM" = "BAM"
  inline val BAK: "BAK" = "BAK"
  inline val EUS: "EUS" = "EUS"
  inline val BEL: "BEL" = "BEL"
  inline val BEN: "BEN" = "BEN"
  inline val BIH: "BIH" = "BIH"
  inline val BIS: "BIS" = "BIS"
  inline val BOS: "BOS" = "BOS"
  inline val BRE: "BRE" = "BRE"
  inline val BUL: "BUL" = "BUL"
  inline val MYA: "MYA" = "MYA"
  inline val CAT: "CAT" = "CAT"
  inline val KHM: "KHM" = "KHM"
  inline val CHA: "CHA" = "CHA"
  inline val CHE: "CHE" = "CHE"
  inline val NYA: "NYA" = "NYA"
  inline val CHU: "CHU" = "CHU"
  inline val CHV: "CHV" = "CHV"
  inline val COR: "COR" = "COR"
  inline val COS: "COS" = "COS"
  inline val CRE: "CRE" = "CRE"
  inline val HRV: "HRV" = "HRV"
  inline val CES: "CES" = "CES"
  inline val DAN: "DAN" = "DAN"
  inline val DIV: "DIV" = "DIV"
  inline val NLD: "NLD" = "NLD"
  inline val DZO: "DZO" = "DZO"
  inline val ENM: "ENM" = "ENM"
  inline val EPO: "EPO" = "EPO"
  inline val EST: "EST" = "EST"
  inline val EWE: "EWE" = "EWE"
  inline val FAO: "FAO" = "FAO"
  inline val FIJ: "FIJ" = "FIJ"
  inline val FIN: "FIN" = "FIN"
  inline val FRM: "FRM" = "FRM"
  inline val FUL: "FUL" = "FUL"
  inline val GLA: "GLA" = "GLA"
  inline val GLG: "GLG" = "GLG"
  inline val LUG: "LUG" = "LUG"
  inline val KAT: "KAT" = "KAT"
  inline val ELL: "ELL" = "ELL"
  inline val GRN: "GRN" = "GRN"
  inline val GUJ: "GUJ" = "GUJ"
  inline val HAT: "HAT" = "HAT"
  inline val HAU: "HAU" = "HAU"
  inline val HEB: "HEB" = "HEB"
  inline val HER: "HER" = "HER"
  inline val HMO: "HMO" = "HMO"
  inline val HUN: "HUN" = "HUN"
  inline val ISL: "ISL" = "ISL"
  inline val IDO: "IDO" = "IDO"
  inline val IBO: "IBO" = "IBO"
  inline val IND: "IND" = "IND"
  inline val INA: "INA" = "INA"
  inline val ILE: "ILE" = "ILE"
  inline val IKU: "IKU" = "IKU"
  inline val IPK: "IPK" = "IPK"
  inline val GLE: "GLE" = "GLE"
  inline val JAV: "JAV" = "JAV"
  inline val KAL: "KAL" = "KAL"
  inline val KAN: "KAN" = "KAN"
  inline val KAU: "KAU" = "KAU"
  inline val KAS: "KAS" = "KAS"
  inline val KAZ: "KAZ" = "KAZ"
  inline val KIK: "KIK" = "KIK"
  inline val KIN: "KIN" = "KIN"
  inline val KIR: "KIR" = "KIR"
  inline val KOM: "KOM" = "KOM"
  inline val KON: "KON" = "KON"
  inline val KUA: "KUA" = "KUA"
  inline val KUR: "KUR" = "KUR"
  inline val LAO: "LAO" = "LAO"
  inline val LAT: "LAT" = "LAT"
  inline val LAV: "LAV" = "LAV"
  inline val LIM: "LIM" = "LIM"
  inline val LIN: "LIN" = "LIN"
  inline val LIT: "LIT" = "LIT"
  inline val LUB: "LUB" = "LUB"
  inline val LTZ: "LTZ" = "LTZ"
  inline val MKD: "MKD" = "MKD"
  inline val MLG: "MLG" = "MLG"
  inline val MSA: "MSA" = "MSA"
  inline val MAL: "MAL" = "MAL"
  inline val MLT: "MLT" = "MLT"
  inline val GLV: "GLV" = "GLV"
  inline val MRI: "MRI" = "MRI"
  inline val MAR: "MAR" = "MAR"
  inline val MAH: "MAH" = "MAH"
  inline val MON: "MON" = "MON"
  inline val NAU: "NAU" = "NAU"
  inline val NAV: "NAV" = "NAV"
  inline val NDE: "NDE" = "NDE"
  inline val NBL: "NBL" = "NBL"
  inline val NDO: "NDO" = "NDO"
  inline val NEP: "NEP" = "NEP"
  inline val SME: "SME" = "SME"
  inline val NOR: "NOR" = "NOR"
  inline val NOB: "NOB" = "NOB"
  inline val NNO: "NNO" = "NNO"
  inline val OCI: "OCI" = "OCI"
  inline val OJI: "OJI" = "OJI"
  inline val ORI: "ORI" = "ORI"
  inline val ORM: "ORM" = "ORM"
  inline val OSS: "OSS" = "OSS"
  inline val PLI: "PLI" = "PLI"
  inline val FAS: "FAS" = "FAS"
  inline val POL: "POL" = "POL"
  inline val PUS: "PUS" = "PUS"
  inline val QUE: "QUE" = "QUE"
  inline val QAA: "QAA" = "QAA"
  inline val RON: "RON" = "RON"
  inline val ROH: "ROH" = "ROH"
  inline val RUN: "RUN" = "RUN"
  inline val SMO: "SMO" = "SMO"
  inline val SAG: "SAG" = "SAG"
  inline val SAN: "SAN" = "SAN"
  inline val SRD: "SRD" = "SRD"
  inline val SRB: "SRB" = "SRB"
  inline val SNA: "SNA" = "SNA"
  inline val III: "III" = "III"
  inline val SND: "SND" = "SND"
  inline val SIN: "SIN" = "SIN"
  inline val SLK: "SLK" = "SLK"
  inline val SLV: "SLV" = "SLV"
  inline val SOM: "SOM" = "SOM"
  inline val SOT: "SOT" = "SOT"
  inline val SUN: "SUN" = "SUN"
  inline val SWA: "SWA" = "SWA"
  inline val SSW: "SSW" = "SSW"
  inline val SWE: "SWE" = "SWE"
  inline val TGL: "TGL" = "TGL"
  inline val TAH: "TAH" = "TAH"
  inline val TGK: "TGK" = "TGK"
  inline val TAM: "TAM" = "TAM"
  inline val TAT: "TAT" = "TAT"
  inline val TEL: "TEL" = "TEL"
  inline val THA: "THA" = "THA"
  inline val BOD: "BOD" = "BOD"
  inline val TIR: "TIR" = "TIR"
  inline val TON: "TON" = "TON"
  inline val TSO: "TSO" = "TSO"
  inline val TSN: "TSN" = "TSN"
  inline val TUR: "TUR" = "TUR"
  inline val TUK: "TUK" = "TUK"
  inline val TWI: "TWI" = "TWI"
  inline val UIG: "UIG" = "UIG"
  inline val UKR: "UKR" = "UKR"
  inline val UZB: "UZB" = "UZB"
  inline val VEN: "VEN" = "VEN"
  inline val VOL: "VOL" = "VOL"
  inline val WLN: "WLN" = "WLN"
  inline val CYM: "CYM" = "CYM"
  inline val FRY: "FRY" = "FRY"
  inline val WOL: "WOL" = "WOL"
  inline val XHO: "XHO" = "XHO"
  inline val YID: "YID" = "YID"
  inline val YOR: "YOR" = "YOR"
  inline val ZHA: "ZHA" = "ZHA"
  inline val ZUL: "ZUL" = "ZUL"
  inline val ORJ: "ORJ" = "ORJ"
  inline val QPC: "QPC" = "QPC"
  inline val TNG: "TNG" = "TNG"

  inline def values: js.Array[LanguageCode] = js.Array(
    ENG,
    SPA,
    FRA,
    DEU,
    GER,
    ZHO,
    ARA,
    HIN,
    JPN,
    RUS,
    POR,
    ITA,
    URD,
    VIE,
    KOR,
    PAN,
    ABK,
    AAR,
    AFR,
    AKA,
    SQI,
    AMH,
    ARG,
    HYE,
    ASM,
    AVA,
    AVE,
    AYM,
    AZE,
    BAM,
    BAK,
    EUS,
    BEL,
    BEN,
    BIH,
    BIS,
    BOS,
    BRE,
    BUL,
    MYA,
    CAT,
    KHM,
    CHA,
    CHE,
    NYA,
    CHU,
    CHV,
    COR,
    COS,
    CRE,
    HRV,
    CES,
    DAN,
    DIV,
    NLD,
    DZO,
    ENM,
    EPO,
    EST,
    EWE,
    FAO,
    FIJ,
    FIN,
    FRM,
    FUL,
    GLA,
    GLG,
    LUG,
    KAT,
    ELL,
    GRN,
    GUJ,
    HAT,
    HAU,
    HEB,
    HER,
    HMO,
    HUN,
    ISL,
    IDO,
    IBO,
    IND,
    INA,
    ILE,
    IKU,
    IPK,
    GLE,
    JAV,
    KAL,
    KAN,
    KAU,
    KAS,
    KAZ,
    KIK,
    KIN,
    KIR,
    KOM,
    KON,
    KUA,
    KUR,
    LAO,
    LAT,
    LAV,
    LIM,
    LIN,
    LIT,
    LUB,
    LTZ,
    MKD,
    MLG,
    MSA,
    MAL,
    MLT,
    GLV,
    MRI,
    MAR,
    MAH,
    MON,
    NAU,
    NAV,
    NDE,
    NBL,
    NDO,
    NEP,
    SME,
    NOR,
    NOB,
    NNO,
    OCI,
    OJI,
    ORI,
    ORM,
    OSS,
    PLI,
    FAS,
    POL,
    PUS,
    QUE,
    QAA,
    RON,
    ROH,
    RUN,
    SMO,
    SAG,
    SAN,
    SRD,
    SRB,
    SNA,
    III,
    SND,
    SIN,
    SLK,
    SLV,
    SOM,
    SOT,
    SUN,
    SWA,
    SSW,
    SWE,
    TGL,
    TAH,
    TGK,
    TAM,
    TAT,
    TEL,
    THA,
    BOD,
    TIR,
    TON,
    TSO,
    TSN,
    TUR,
    TUK,
    TWI,
    UIG,
    UKR,
    UZB,
    VEN,
    VOL,
    WLN,
    CYM,
    FRY,
    WOL,
    XHO,
    YID,
    YOR,
    ZHA,
    ZUL,
    ORJ,
    QPC,
    TNG
  )
}

/** Selects between the DVB and ATSC buffer models for Dolby Digital audio.
  */
type M2tsAudioBufferModel = "DVB" | "ATSC"
object M2tsAudioBufferModel {
  inline val DVB: "DVB" = "DVB"
  inline val ATSC: "ATSC" = "ATSC"

  inline def values: js.Array[M2tsAudioBufferModel] = js.Array(DVB, ATSC)
}

/** Specify this setting only when your output will be consumed by a downstream repackaging workflow that is sensitive to very small duration differences between video and audio. For this situation, choose Match video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with silence or trims them to ensure that the total duration of each audio stream is at least as long as the total duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
  */
type M2tsAudioDuration = "DEFAULT_CODEC_DURATION" | "MATCH_VIDEO_DURATION"
object M2tsAudioDuration {
  inline val DEFAULT_CODEC_DURATION: "DEFAULT_CODEC_DURATION" = "DEFAULT_CODEC_DURATION"
  inline val MATCH_VIDEO_DURATION: "MATCH_VIDEO_DURATION" = "MATCH_VIDEO_DURATION"

  inline def values: js.Array[M2tsAudioDuration] = js.Array(DEFAULT_CODEC_DURATION, MATCH_VIDEO_DURATION)
}

/** Controls what buffer model to use for accurate interleaving. If set to MULTIPLEX, use multiplex buffer model. If set to NONE, this can lead to lower latency, but low-memory devices may not be able to play back the stream without interruptions.
  */
type M2tsBufferModel = "MULTIPLEX" | "NONE"
object M2tsBufferModel {
  inline val MULTIPLEX: "MULTIPLEX" = "MULTIPLEX"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[M2tsBufferModel] = js.Array(MULTIPLEX, NONE)
}

/** When set to VIDEO_AND_FIXED_INTERVALS, audio EBP markers will be added to partitions 3 and 4. The interval between these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval. When set to VIDEO_INTERVAL, these additional markers will not be inserted. Only applicable when EBP segmentation markers are is selected (segmentationMarkers is EBP or EBP_LEGACY).
  */
type M2tsEbpAudioInterval = "VIDEO_AND_FIXED_INTERVALS" | "VIDEO_INTERVAL"
object M2tsEbpAudioInterval {
  inline val VIDEO_AND_FIXED_INTERVALS: "VIDEO_AND_FIXED_INTERVALS" = "VIDEO_AND_FIXED_INTERVALS"
  inline val VIDEO_INTERVAL: "VIDEO_INTERVAL" = "VIDEO_INTERVAL"

  inline def values: js.Array[M2tsEbpAudioInterval] = js.Array(VIDEO_AND_FIXED_INTERVALS, VIDEO_INTERVAL)
}

/** Selects which PIDs to place EBP markers on. They can either be placed only on the video PID, or on both the video PID and all audio PIDs. Only applicable when EBP segmentation markers are is selected (segmentationMarkers is EBP or EBP_LEGACY).
  */
type M2tsEbpPlacement = "VIDEO_AND_AUDIO_PIDS" | "VIDEO_PID"
object M2tsEbpPlacement {
  inline val VIDEO_AND_AUDIO_PIDS: "VIDEO_AND_AUDIO_PIDS" = "VIDEO_AND_AUDIO_PIDS"
  inline val VIDEO_PID: "VIDEO_PID" = "VIDEO_PID"

  inline def values: js.Array[M2tsEbpPlacement] = js.Array(VIDEO_AND_AUDIO_PIDS, VIDEO_PID)
}

/** Controls whether to include the ES Rate field in the PES header.
  */
type M2tsEsRateInPes = "INCLUDE" | "EXCLUDE"
object M2tsEsRateInPes {
  inline val INCLUDE: "INCLUDE" = "INCLUDE"
  inline val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  inline def values: js.Array[M2tsEsRateInPes] = js.Array(INCLUDE, EXCLUDE)
}

/** Keep the default value (DEFAULT) unless you know that your audio EBP markers are incorrectly appearing before your video EBP markers. To correct this problem, set this value to Force (FORCE).
  */
type M2tsForceTsVideoEbpOrder = "FORCE" | "DEFAULT"
object M2tsForceTsVideoEbpOrder {
  inline val FORCE: "FORCE" = "FORCE"
  inline val DEFAULT: "DEFAULT" = "DEFAULT"

  inline def values: js.Array[M2tsForceTsVideoEbpOrder] = js.Array(FORCE, DEFAULT)
}

/** If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
  */
type M2tsNielsenId3 = "INSERT" | "NONE"
object M2tsNielsenId3 {
  inline val INSERT: "INSERT" = "INSERT"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[M2tsNielsenId3] = js.Array(INSERT, NONE)
}

/** When set to PCR_EVERY_PES_PACKET, a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This is effective only when the PCR PID is the same as the video or audio elementary stream.
  */
type M2tsPcrControl = "PCR_EVERY_PES_PACKET" | "CONFIGURED_PCR_PERIOD"
object M2tsPcrControl {
  inline val PCR_EVERY_PES_PACKET: "PCR_EVERY_PES_PACKET" = "PCR_EVERY_PES_PACKET"
  inline val CONFIGURED_PCR_PERIOD: "CONFIGURED_PCR_PERIOD" = "CONFIGURED_PCR_PERIOD"

  inline def values: js.Array[M2tsPcrControl] = js.Array(PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD)
}

/** When set to CBR, inserts null packets into transport stream to fill specified bitrate. When set to VBR, the bitrate setting acts as the maximum bitrate, but the output will not be padded up to that bitrate.
  */
type M2tsRateMode = "VBR" | "CBR"
object M2tsRateMode {
  inline val VBR: "VBR" = "VBR"
  inline val CBR: "CBR" = "CBR"

  inline def values: js.Array[M2tsRateMode] = js.Array(VBR, CBR)
}

/** For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want SCTE-35 markers in this output. For SCTE-35 markers from an ESAM XML document-- Choose None (NONE). Also provide the ESAM XML as a string in the setting Signal processing notification XML (sccXml). Also enable ESAM SCTE-35 (include the property scte35Esam).
  */
type M2tsScte35Source = "PASSTHROUGH" | "NONE"
object M2tsScte35Source {
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[M2tsScte35Source] = js.Array(PASSTHROUGH, NONE)
}

/** Inserts segmentation markers at each segmentation_time period. rai_segstart sets the Random Access Indicator bit in the adaptation field. rai_adapt sets the RAI bit and adds the current timecode in the private data bytes. psi_segstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebp_legacy adds Encoder Boundary Point information to the adaptation field using a legacy proprietary format.
  */
type M2tsSegmentationMarkers = "NONE" | "RAI_SEGSTART" | "RAI_ADAPT" | "PSI_SEGSTART" | "EBP" | "EBP_LEGACY"
object M2tsSegmentationMarkers {
  inline val NONE: "NONE" = "NONE"
  inline val RAI_SEGSTART: "RAI_SEGSTART" = "RAI_SEGSTART"
  inline val RAI_ADAPT: "RAI_ADAPT" = "RAI_ADAPT"
  inline val PSI_SEGSTART: "PSI_SEGSTART" = "PSI_SEGSTART"
  inline val EBP: "EBP" = "EBP"
  inline val EBP_LEGACY: "EBP_LEGACY" = "EBP_LEGACY"

  inline def values: js.Array[M2tsSegmentationMarkers] = js.Array(NONE, RAI_SEGSTART, RAI_ADAPT, PSI_SEGSTART, EBP, EBP_LEGACY)
}

/** The segmentation style parameter controls how segmentation markers are inserted into the transport stream. With avails, it is possible that segments may be truncated, which can influence where future segmentation markers are inserted. When a segmentation style of "reset_cadence" is selected and a segment is truncated due to an avail, we will reset the segmentation cadence. This means the subsequent segment will have a duration of of segmentation_time seconds. When a segmentation style of "maintain_cadence" is selected and a segment is truncated due to an avail, we will not reset the segmentation cadence. This means the subsequent segment will likely be truncated as well. However, all segments after that will have a duration of segmentation_time seconds. Note that EBP lookahead is a slight exception to this rule.
  */
type M2tsSegmentationStyle = "MAINTAIN_CADENCE" | "RESET_CADENCE"
object M2tsSegmentationStyle {
  inline val MAINTAIN_CADENCE: "MAINTAIN_CADENCE" = "MAINTAIN_CADENCE"
  inline val RESET_CADENCE: "RESET_CADENCE" = "RESET_CADENCE"

  inline def values: js.Array[M2tsSegmentationStyle] = js.Array(MAINTAIN_CADENCE, RESET_CADENCE)
}

/** Specify this setting only when your output will be consumed by a downstream repackaging workflow that is sensitive to very small duration differences between video and audio. For this situation, choose Match video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with silence or trims them to ensure that the total duration of each audio stream is at least as long as the total duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
  */
type M3u8AudioDuration = "DEFAULT_CODEC_DURATION" | "MATCH_VIDEO_DURATION"
object M3u8AudioDuration {
  inline val DEFAULT_CODEC_DURATION: "DEFAULT_CODEC_DURATION" = "DEFAULT_CODEC_DURATION"
  inline val MATCH_VIDEO_DURATION: "MATCH_VIDEO_DURATION" = "MATCH_VIDEO_DURATION"

  inline def values: js.Array[M3u8AudioDuration] = js.Array(DEFAULT_CODEC_DURATION, MATCH_VIDEO_DURATION)
}

/** If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
  */
type M3u8NielsenId3 = "INSERT" | "NONE"
object M3u8NielsenId3 {
  inline val INSERT: "INSERT" = "INSERT"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[M3u8NielsenId3] = js.Array(INSERT, NONE)
}

/** When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
  */
type M3u8PcrControl = "PCR_EVERY_PES_PACKET" | "CONFIGURED_PCR_PERIOD"
object M3u8PcrControl {
  inline val PCR_EVERY_PES_PACKET: "PCR_EVERY_PES_PACKET" = "PCR_EVERY_PES_PACKET"
  inline val CONFIGURED_PCR_PERIOD: "CONFIGURED_PCR_PERIOD" = "CONFIGURED_PCR_PERIOD"

  inline def values: js.Array[M3u8PcrControl] = js.Array(PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD)
}

/** For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want SCTE-35 markers in this output. For SCTE-35 markers from an ESAM XML document-- Choose None (NONE) if you don't want manifest conditioning. Choose Passthrough (PASSTHROUGH) and choose Ad markers (adMarkers) if you do want manifest conditioning. In both cases, also provide the ESAM XML as a string in the setting Signal processing notification XML (sccXml).
  */
type M3u8Scte35Source = "PASSTHROUGH" | "NONE"
object M3u8Scte35Source {
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[M3u8Scte35Source] = js.Array(PASSTHROUGH, NONE)
}

/** Choose the type of motion graphic asset that you are providing for your overlay. You can choose either a .mov file or a series of .png files.
  */
type MotionImageInsertionMode = "MOV" | "PNG"
object MotionImageInsertionMode {
  inline val MOV: "MOV" = "MOV"
  inline val PNG: "PNG" = "PNG"

  inline def values: js.Array[MotionImageInsertionMode] = js.Array(MOV, PNG)
}

/** Specify whether your motion graphic overlay repeats on a loop or plays only once.
  */
type MotionImagePlayback = "ONCE" | "REPEAT"
object MotionImagePlayback {
  inline val ONCE: "ONCE" = "ONCE"
  inline val REPEAT: "REPEAT" = "REPEAT"

  inline def values: js.Array[MotionImagePlayback] = js.Array(ONCE, REPEAT)
}

/** When enabled, include 'clap' atom if appropriate for the video output settings.
  */
type MovClapAtom = "INCLUDE" | "EXCLUDE"
object MovClapAtom {
  inline val INCLUDE: "INCLUDE" = "INCLUDE"
  inline val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  inline def values: js.Array[MovClapAtom] = js.Array(INCLUDE, EXCLUDE)
}

/** When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
  */
type MovCslgAtom = "INCLUDE" | "EXCLUDE"
object MovCslgAtom {
  inline val INCLUDE: "INCLUDE" = "INCLUDE"
  inline val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  inline def values: js.Array[MovCslgAtom] = js.Array(INCLUDE, EXCLUDE)
}

/** When set to XDCAM, writes MPEG2 video streams into the QuickTime file using XDCAM fourcc codes. This increases compatibility with Apple editors and players, but may decrease compatibility with other players. Only applicable when the video codec is MPEG2.
  */
type MovMpeg2FourCCControl = "XDCAM" | "MPEG"
object MovMpeg2FourCCControl {
  inline val XDCAM: "XDCAM" = "XDCAM"
  inline val MPEG: "MPEG" = "MPEG"

  inline def values: js.Array[MovMpeg2FourCCControl] = js.Array(XDCAM, MPEG)
}

/** To make this output compatible with Omenon, keep the default value, OMNEON. Unless you need Omneon compatibility, set this value to NONE. When you keep the default value, OMNEON, MediaConvert increases the length of the edit list atom. This might cause file rejections when a recipient of the output file doesn't expct this extra padding.
  */
type MovPaddingControl = "OMNEON" | "NONE"
object MovPaddingControl {
  inline val OMNEON: "OMNEON" = "OMNEON"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[MovPaddingControl] = js.Array(OMNEON, NONE)
}

/** Always keep the default value (SELF_CONTAINED) for this setting.
  */
type MovReference = "SELF_CONTAINED" | "EXTERNAL"
object MovReference {
  inline val SELF_CONTAINED: "SELF_CONTAINED" = "SELF_CONTAINED"
  inline val EXTERNAL: "EXTERNAL" = "EXTERNAL"

  inline def values: js.Array[MovReference] = js.Array(SELF_CONTAINED, EXTERNAL)
}

/** Specify whether the service encodes this MP3 audio output with a constant bitrate (CBR) or a variable bitrate (VBR).
  */
type Mp3RateControlMode = "CBR" | "VBR"
object Mp3RateControlMode {
  inline val CBR: "CBR" = "CBR"
  inline val VBR: "VBR" = "VBR"

  inline def values: js.Array[Mp3RateControlMode] = js.Array(CBR, VBR)
}

/** When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
  */
type Mp4CslgAtom = "INCLUDE" | "EXCLUDE"
object Mp4CslgAtom {
  inline val INCLUDE: "INCLUDE" = "INCLUDE"
  inline val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  inline def values: js.Array[Mp4CslgAtom] = js.Array(INCLUDE, EXCLUDE)
}

/** Inserts a free-space box immediately after the moov box.
  */
type Mp4FreeSpaceBox = "INCLUDE" | "EXCLUDE"
object Mp4FreeSpaceBox {
  inline val INCLUDE: "INCLUDE" = "INCLUDE"
  inline val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  inline def values: js.Array[Mp4FreeSpaceBox] = js.Array(INCLUDE, EXCLUDE)
}

/** If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
  */
type Mp4MoovPlacement = "PROGRESSIVE_DOWNLOAD" | "NORMAL"
object Mp4MoovPlacement {
  inline val PROGRESSIVE_DOWNLOAD: "PROGRESSIVE_DOWNLOAD" = "PROGRESSIVE_DOWNLOAD"
  inline val NORMAL: "NORMAL" = "NORMAL"

  inline def values: js.Array[Mp4MoovPlacement] = js.Array(PROGRESSIVE_DOWNLOAD, NORMAL)
}

/** Optional. Choose Include (INCLUDE) to have MediaConvert mark up your DASH manifest with <Accessibility> elements for embedded 608 captions. This markup isn't generally required, but some video players require it to discover and play embedded 608 captions. Keep the default value, Exclude (EXCLUDE), to leave these elements out. When you enable this setting, this is the markup that MediaConvert includes in your manifest: <Accessibility schemeIdUri="urn:scte:dash:cc:cea-608:2015" value="CC1=eng"/>
  */
type MpdAccessibilityCaptionHints = "INCLUDE" | "EXCLUDE"
object MpdAccessibilityCaptionHints {
  inline val INCLUDE: "INCLUDE" = "INCLUDE"
  inline val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  inline def values: js.Array[MpdAccessibilityCaptionHints] = js.Array(INCLUDE, EXCLUDE)
}

/** Specify this setting only when your output will be consumed by a downstream repackaging workflow that is sensitive to very small duration differences between video and audio. For this situation, choose Match video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with silence or trims them to ensure that the total duration of each audio stream is at least as long as the total duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
  */
type MpdAudioDuration = "DEFAULT_CODEC_DURATION" | "MATCH_VIDEO_DURATION"
object MpdAudioDuration {
  inline val DEFAULT_CODEC_DURATION: "DEFAULT_CODEC_DURATION" = "DEFAULT_CODEC_DURATION"
  inline val MATCH_VIDEO_DURATION: "MATCH_VIDEO_DURATION" = "MATCH_VIDEO_DURATION"

  inline def values: js.Array[MpdAudioDuration] = js.Array(DEFAULT_CODEC_DURATION, MATCH_VIDEO_DURATION)
}

/** Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify sidecar captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single XML file in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format contained within fragmented MP4 files. This set of fragmented MP4 files is separate from your video and audio fragmented MP4 files.
  */
type MpdCaptionContainerType = "RAW" | "FRAGMENTED_MP4"
object MpdCaptionContainerType {
  inline val RAW: "RAW" = "RAW"
  inline val FRAGMENTED_MP4: "FRAGMENTED_MP4" = "FRAGMENTED_MP4"

  inline def values: js.Array[MpdCaptionContainerType] = js.Array(RAW, FRAGMENTED_MP4)
}

/** Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
  */
type MpdScte35Esam = "INSERT" | "NONE"
object MpdScte35Esam {
  inline val INSERT: "INSERT" = "INSERT"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[MpdScte35Esam] = js.Array(INSERT, NONE)
}

/** Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want those SCTE-35 markers in this output.
  */
type MpdScte35Source = "PASSTHROUGH" | "NONE"
object MpdScte35Source {
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[MpdScte35Source] = js.Array(PASSTHROUGH, NONE)
}

/** Specify the strength of any adaptive quantization filters that you enable. The value that you choose here applies to the following settings: Spatial adaptive quantization (spatialAdaptiveQuantization), and Temporal adaptive quantization (temporalAdaptiveQuantization).
  */
type Mpeg2AdaptiveQuantization = "OFF" | "LOW" | "MEDIUM" | "HIGH"
object Mpeg2AdaptiveQuantization {
  inline val OFF: "OFF" = "OFF"
  inline val LOW: "LOW" = "LOW"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val HIGH: "HIGH" = "HIGH"

  inline def values: js.Array[Mpeg2AdaptiveQuantization] = js.Array(OFF, LOW, MEDIUM, HIGH)
}

/** Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
  */
type Mpeg2CodecLevel = "AUTO" | "LOW" | "MAIN" | "HIGH1440" | "HIGH"
object Mpeg2CodecLevel {
  inline val AUTO: "AUTO" = "AUTO"
  inline val LOW: "LOW" = "LOW"
  inline val MAIN: "MAIN" = "MAIN"
  inline val HIGH1440: "HIGH1440" = "HIGH1440"
  inline val HIGH: "HIGH" = "HIGH"

  inline def values: js.Array[Mpeg2CodecLevel] = js.Array(AUTO, LOW, MAIN, HIGH1440, HIGH)
}

/** Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video output.
  */
type Mpeg2CodecProfile = "MAIN" | "PROFILE_422"
object Mpeg2CodecProfile {
  inline val MAIN: "MAIN" = "MAIN"
  inline val PROFILE_422: "PROFILE_422" = "PROFILE_422"

  inline def values: js.Array[Mpeg2CodecProfile] = js.Array(MAIN, PROFILE_422)
}

/** Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
  */
type Mpeg2DynamicSubGop = "ADAPTIVE" | "STATIC"
object Mpeg2DynamicSubGop {
  inline val ADAPTIVE: "ADAPTIVE" = "ADAPTIVE"
  inline val STATIC: "STATIC" = "STATIC"

  inline def values: js.Array[Mpeg2DynamicSubGop] = js.Array(ADAPTIVE, STATIC)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
type Mpeg2FramerateControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object Mpeg2FramerateControl {
  inline val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  inline val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  inline def values: js.Array[Mpeg2FramerateControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
type Mpeg2FramerateConversionAlgorithm = "DUPLICATE_DROP" | "INTERPOLATE" | "FRAMEFORMER"
object Mpeg2FramerateConversionAlgorithm {
  inline val DUPLICATE_DROP: "DUPLICATE_DROP" = "DUPLICATE_DROP"
  inline val INTERPOLATE: "INTERPOLATE" = "INTERPOLATE"
  inline val FRAMEFORMER: "FRAMEFORMER" = "FRAMEFORMER"

  inline def values: js.Array[Mpeg2FramerateConversionAlgorithm] = js.Array(DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
  */
type Mpeg2GopSizeUnits = "FRAMES" | "SECONDS"
object Mpeg2GopSizeUnits {
  inline val FRAMES: "FRAMES" = "FRAMES"
  inline val SECONDS: "SECONDS" = "SECONDS"

  inline def values: js.Array[Mpeg2GopSizeUnits] = js.Array(FRAMES, SECONDS)
}

/** Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
  */
type Mpeg2InterlaceMode = "PROGRESSIVE" | "TOP_FIELD" | "BOTTOM_FIELD" | "FOLLOW_TOP_FIELD" | "FOLLOW_BOTTOM_FIELD"
object Mpeg2InterlaceMode {
  inline val PROGRESSIVE: "PROGRESSIVE" = "PROGRESSIVE"
  inline val TOP_FIELD: "TOP_FIELD" = "TOP_FIELD"
  inline val BOTTOM_FIELD: "BOTTOM_FIELD" = "BOTTOM_FIELD"
  inline val FOLLOW_TOP_FIELD: "FOLLOW_TOP_FIELD" = "FOLLOW_TOP_FIELD"
  inline val FOLLOW_BOTTOM_FIELD: "FOLLOW_BOTTOM_FIELD" = "FOLLOW_BOTTOM_FIELD"

  inline def values: js.Array[Mpeg2InterlaceMode] = js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD)
}

/** Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision for intra-block DC coefficients. If you choose the value auto, the service will automatically select the precision based on the per-frame compression ratio.
  */
type Mpeg2IntraDcPrecision = "AUTO" | "INTRA_DC_PRECISION_8" | "INTRA_DC_PRECISION_9" | "INTRA_DC_PRECISION_10" | "INTRA_DC_PRECISION_11"
object Mpeg2IntraDcPrecision {
  inline val AUTO: "AUTO" = "AUTO"
  inline val INTRA_DC_PRECISION_8: "INTRA_DC_PRECISION_8" = "INTRA_DC_PRECISION_8"
  inline val INTRA_DC_PRECISION_9: "INTRA_DC_PRECISION_9" = "INTRA_DC_PRECISION_9"
  inline val INTRA_DC_PRECISION_10: "INTRA_DC_PRECISION_10" = "INTRA_DC_PRECISION_10"
  inline val INTRA_DC_PRECISION_11: "INTRA_DC_PRECISION_11" = "INTRA_DC_PRECISION_11"

  inline def values: js.Array[Mpeg2IntraDcPrecision] = js.Array(AUTO, INTRA_DC_PRECISION_8, INTRA_DC_PRECISION_9, INTRA_DC_PRECISION_10, INTRA_DC_PRECISION_11)
}

/** Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
  */
type Mpeg2ParControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object Mpeg2ParControl {
  inline val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  inline val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  inline def values: js.Array[Mpeg2ParControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, single-pass encoding.
  */
type Mpeg2QualityTuningLevel = "SINGLE_PASS" | "MULTI_PASS"
object Mpeg2QualityTuningLevel {
  inline val SINGLE_PASS: "SINGLE_PASS" = "SINGLE_PASS"
  inline val MULTI_PASS: "MULTI_PASS" = "MULTI_PASS"

  inline def values: js.Array[Mpeg2QualityTuningLevel] = js.Array(SINGLE_PASS, MULTI_PASS)
}

/** Use Rate control mode (Mpeg2RateControlMode) to specify whether the bitrate is variable (vbr) or constant (cbr).
  */
type Mpeg2RateControlMode = "VBR" | "CBR"
object Mpeg2RateControlMode {
  inline val VBR: "VBR" = "VBR"
  inline val CBR: "CBR" = "CBR"

  inline def values: js.Array[Mpeg2RateControlMode] = js.Array(VBR, CBR)
}

/** Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
  */
type Mpeg2ScanTypeConversionMode = "INTERLACED" | "INTERLACED_OPTIMIZE"
object Mpeg2ScanTypeConversionMode {
  inline val INTERLACED: "INTERLACED" = "INTERLACED"
  inline val INTERLACED_OPTIMIZE: "INTERLACED_OPTIMIZE" = "INTERLACED_OPTIMIZE"

  inline def values: js.Array[Mpeg2ScanTypeConversionMode] = js.Array(INTERLACED, INTERLACED_OPTIMIZE)
}

/** Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default.
  */
type Mpeg2SceneChangeDetect = "DISABLED" | "ENABLED"
object Mpeg2SceneChangeDetect {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[Mpeg2SceneChangeDetect] = js.Array(DISABLED, ENABLED)
}

/** Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
  */
type Mpeg2SlowPal = "DISABLED" | "ENABLED"
object Mpeg2SlowPal {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[Mpeg2SlowPal] = js.Array(DISABLED, ENABLED)
}

/** Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture, you might choose to disable this feature. Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video
  * games, set it to Low. For content with a wider variety of textures, set it to High or Higher.
  */
type Mpeg2SpatialAdaptiveQuantization = "DISABLED" | "ENABLED"
object Mpeg2SpatialAdaptiveQuantization {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[Mpeg2SpatialAdaptiveQuantization] = js.Array(DISABLED, ENABLED)
}

/** Specify whether this output's video uses the D10 syntax. Keep the default value to not use the syntax. Related settings: When you choose D10 (D_10) for your MXF profile (profile), you must also set this value to to D10 (D_10).
  */
type Mpeg2Syntax = "DEFAULT" | "D_10"
object Mpeg2Syntax {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val D_10: "D_10" = "D_10"

  inline def values: js.Array[Mpeg2Syntax] = js.Array(DEFAULT, D_10)
}

/** When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is interlaced, you can optionally enable hard or soft telecine to create a smoother picture. Hard telecine (HARD) produces a 29.97i output. Soft telecine (SOFT) produces an output with a 23.976 output that signals to the video player device to do the conversion during play back. When you keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother picture.
  */
type Mpeg2Telecine = "NONE" | "SOFT" | "HARD"
object Mpeg2Telecine {
  inline val NONE: "NONE" = "NONE"
  inline val SOFT: "SOFT" = "SOFT"
  inline val HARD: "HARD" = "HARD"

  inline def values: js.Array[Mpeg2Telecine] = js.Array(NONE, SOFT, HARD)
}

/** Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on temporal variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that aren't moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen that doesn't have moving objects with sharp edges, such as sports athletes' faces, you might choose to disable this feature. Related setting: When you enable temporal quantization, adjust the strength of the filter with the setting Adaptive quantization (adaptiveQuantization).
  */
type Mpeg2TemporalAdaptiveQuantization = "DISABLED" | "ENABLED"
object Mpeg2TemporalAdaptiveQuantization {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[Mpeg2TemporalAdaptiveQuantization] = js.Array(DISABLED, ENABLED)
}

/** COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings across a Microsoft Smooth output group into a single audio stream.
  */
type MsSmoothAudioDeduplication = "COMBINE_DUPLICATE_STREAMS" | "NONE"
object MsSmoothAudioDeduplication {
  inline val COMBINE_DUPLICATE_STREAMS: "COMBINE_DUPLICATE_STREAMS" = "COMBINE_DUPLICATE_STREAMS"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[MsSmoothAudioDeduplication] = js.Array(COMBINE_DUPLICATE_STREAMS, NONE)
}

/** Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding format for the server and client manifest. Valid options are utf8 and utf16.
  */
type MsSmoothManifestEncoding = "UTF8" | "UTF16"
object MsSmoothManifestEncoding {
  inline val UTF8: "UTF8" = "UTF8"
  inline val UTF16: "UTF16" = "UTF16"

  inline def values: js.Array[MsSmoothManifestEncoding] = js.Array(UTF8, UTF16)
}

/** Optional. When you have AFD signaling set up in your output video stream, use this setting to choose whether to also include it in the MXF wrapper. Choose Don't copy (NO_COPY) to exclude AFD signaling from the MXF wrapper. Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD values from the video stream for this output to the MXF wrapper. Regardless of which option you choose, the AFD values remain in the video stream. Related settings: To set up your output to include or exclude AFD values, see AfdSignaling, under VideoDescription. On the console, find AFD signaling under the output's video encoding settings.
  */
type MxfAfdSignaling = "NO_COPY" | "COPY_FROM_VIDEO"
object MxfAfdSignaling {
  inline val NO_COPY: "NO_COPY" = "NO_COPY"
  inline val COPY_FROM_VIDEO: "COPY_FROM_VIDEO" = "COPY_FROM_VIDEO"

  inline def values: js.Array[MxfAfdSignaling] = js.Array(NO_COPY, COPY_FROM_VIDEO)
}

/** Specify the MXF profile, also called shim, for this output. When you choose Auto, MediaConvert chooses a profile based on the video codec and resolution. For a list of codecs supported with each MXF profile, see https://docs.aws.amazon.com/mediaconvert/latest/ug/codecs-supported-with-each-mxf-profile.html. For more information about the automatic selection behavior, see https://docs.aws.amazon.com/mediaconvert/latest/ug/default-automatic-selection-of-mxf-profiles.html.
  */
type MxfProfile = "D_10" | "XDCAM" | "OP1A"
object MxfProfile {
  inline val D_10: "D_10" = "D_10"
  inline val XDCAM: "XDCAM" = "XDCAM"
  inline val OP1A: "OP1A" = "OP1A"

  inline def values: js.Array[MxfProfile] = js.Array(D_10, XDCAM, OP1A)
}

/** Choose the type of Nielsen watermarks that you want in your outputs. When you choose NAES 2 and NW (NAES2_AND_NW), you must provide a value for the setting SID (sourceId). When you choose CBET (CBET), you must provide a value for the setting CSID (cbetSourceId). When you choose NAES 2, NW, and CBET (NAES2_AND_NW_AND_CBET), you must provide values for both of these settings.
  */
type NielsenActiveWatermarkProcessType = "NAES2_AND_NW" | "CBET" | "NAES2_AND_NW_AND_CBET"
object NielsenActiveWatermarkProcessType {
  inline val NAES2_AND_NW: "NAES2_AND_NW" = "NAES2_AND_NW"
  inline val CBET: "CBET" = "CBET"
  inline val NAES2_AND_NW_AND_CBET: "NAES2_AND_NW_AND_CBET" = "NAES2_AND_NW_AND_CBET"

  inline def values: js.Array[NielsenActiveWatermarkProcessType] = js.Array(NAES2_AND_NW, CBET, NAES2_AND_NW_AND_CBET)
}

/** Required. Specify whether your source content already contains Nielsen non-linear watermarks. When you set this value to Watermarked (WATERMARKED), the service fails the job. Nielsen requires that you add non-linear watermarking to only clean content that doesn't already have non-linear Nielsen watermarks.
  */
type NielsenSourceWatermarkStatusType = "CLEAN" | "WATERMARKED"
object NielsenSourceWatermarkStatusType {
  inline val CLEAN: "CLEAN" = "CLEAN"
  inline val WATERMARKED: "WATERMARKED" = "WATERMARKED"

  inline def values: js.Array[NielsenSourceWatermarkStatusType] = js.Array(CLEAN, WATERMARKED)
}

/** To create assets that have the same TIC values in each audio track, keep the default value Share TICs (SAME_TICS_PER_TRACK). To create assets that have unique TIC values for each audio track, choose Use unique TICs (RESERVE_UNIQUE_TICS_PER_TRACK).
  */
type NielsenUniqueTicPerAudioTrackType = "RESERVE_UNIQUE_TICS_PER_TRACK" | "SAME_TICS_PER_TRACK"
object NielsenUniqueTicPerAudioTrackType {
  inline val RESERVE_UNIQUE_TICS_PER_TRACK: "RESERVE_UNIQUE_TICS_PER_TRACK" = "RESERVE_UNIQUE_TICS_PER_TRACK"
  inline val SAME_TICS_PER_TRACK: "SAME_TICS_PER_TRACK" = "SAME_TICS_PER_TRACK"

  inline def values: js.Array[NielsenUniqueTicPerAudioTrackType] = js.Array(RESERVE_UNIQUE_TICS_PER_TRACK, SAME_TICS_PER_TRACK)
}

/** Optional. When you set Noise reducer (noiseReducer) to Temporal (TEMPORAL), you can use this setting to apply sharpening. The default behavior, Auto (AUTO), allows the transcoder to determine whether to apply filtering, depending on input type and quality. When you set Noise reducer to Temporal, your output bandwidth is reduced. When Post temporal sharpening is also enabled, that bandwidth reduction is smaller.
  */
type NoiseFilterPostTemporalSharpening = "DISABLED" | "ENABLED" | "AUTO"
object NoiseFilterPostTemporalSharpening {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val AUTO: "AUTO" = "AUTO"

  inline def values: js.Array[NoiseFilterPostTemporalSharpening] = js.Array(DISABLED, ENABLED, AUTO)
}

/** Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering functions. To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral preserves edges while reducing noise. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) do convolution filtering. * Conserve does min/max noise reduction. * Spatial does frequency-domain filtering based on JND principles. * Temporal optimizes video quality for complex motion.
  */
type NoiseReducerFilter = "BILATERAL" | "MEAN" | "GAUSSIAN" | "LANCZOS" | "SHARPEN" | "CONSERVE" | "SPATIAL" | "TEMPORAL"
object NoiseReducerFilter {
  inline val BILATERAL: "BILATERAL" = "BILATERAL"
  inline val MEAN: "MEAN" = "MEAN"
  inline val GAUSSIAN: "GAUSSIAN" = "GAUSSIAN"
  inline val LANCZOS: "LANCZOS" = "LANCZOS"
  inline val SHARPEN: "SHARPEN" = "SHARPEN"
  inline val CONSERVE: "CONSERVE" = "CONSERVE"
  inline val SPATIAL: "SPATIAL" = "SPATIAL"
  inline val TEMPORAL: "TEMPORAL" = "TEMPORAL"

  inline def values: js.Array[NoiseReducerFilter] = js.Array(BILATERAL, MEAN, GAUSSIAN, LANCZOS, SHARPEN, CONSERVE, SPATIAL, TEMPORAL)
}

/** Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource.
  */
type Order = "ASCENDING" | "DESCENDING"
object Order {
  inline val ASCENDING: "ASCENDING" = "ASCENDING"
  inline val DESCENDING: "DESCENDING" = "DESCENDING"

  inline def values: js.Array[Order] = js.Array(ASCENDING, DESCENDING)
}

/** Type of output group (File group, Apple HLS, DASH ISO, Microsoft Smooth Streaming, CMAF)
  */
type OutputGroupType = "HLS_GROUP_SETTINGS" | "DASH_ISO_GROUP_SETTINGS" | "FILE_GROUP_SETTINGS" | "MS_SMOOTH_GROUP_SETTINGS" | "CMAF_GROUP_SETTINGS"
object OutputGroupType {
  inline val HLS_GROUP_SETTINGS: "HLS_GROUP_SETTINGS" = "HLS_GROUP_SETTINGS"
  inline val DASH_ISO_GROUP_SETTINGS: "DASH_ISO_GROUP_SETTINGS" = "DASH_ISO_GROUP_SETTINGS"
  inline val FILE_GROUP_SETTINGS: "FILE_GROUP_SETTINGS" = "FILE_GROUP_SETTINGS"
  inline val MS_SMOOTH_GROUP_SETTINGS: "MS_SMOOTH_GROUP_SETTINGS" = "MS_SMOOTH_GROUP_SETTINGS"
  inline val CMAF_GROUP_SETTINGS: "CMAF_GROUP_SETTINGS" = "CMAF_GROUP_SETTINGS"

  inline def values: js.Array[OutputGroupType] = js.Array(HLS_GROUP_SETTINGS, DASH_ISO_GROUP_SETTINGS, FILE_GROUP_SETTINGS, MS_SMOOTH_GROUP_SETTINGS, CMAF_GROUP_SETTINGS)
}

/** Selects method of inserting SDT information into output stream. "Follow input SDT" copies SDT information from input stream to output stream. "Follow input SDT if present" copies SDT information from input stream to output stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. Enter "SDT Manually" means user will enter the SDT information. "No SDT" means output stream will not contain SDT information.
  */
type OutputSdt = "SDT_FOLLOW" | "SDT_FOLLOW_IF_PRESENT" | "SDT_MANUAL" | "SDT_NONE"
object OutputSdt {
  inline val SDT_FOLLOW: "SDT_FOLLOW" = "SDT_FOLLOW"
  inline val SDT_FOLLOW_IF_PRESENT: "SDT_FOLLOW_IF_PRESENT" = "SDT_FOLLOW_IF_PRESENT"
  inline val SDT_MANUAL: "SDT_MANUAL" = "SDT_MANUAL"
  inline val SDT_NONE: "SDT_NONE" = "SDT_NONE"

  inline def values: js.Array[OutputSdt] = js.Array(SDT_FOLLOW, SDT_FOLLOW_IF_PRESENT, SDT_MANUAL, SDT_NONE)
}

/** Optional. When you request a list of presets, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
  */
type PresetListBy = "NAME" | "CREATION_DATE" | "SYSTEM"
object PresetListBy {
  inline val NAME: "NAME" = "NAME"
  inline val CREATION_DATE: "CREATION_DATE" = "CREATION_DATE"
  inline val SYSTEM: "SYSTEM" = "SYSTEM"

  inline def values: js.Array[PresetListBy] = js.Array(NAME, CREATION_DATE, SYSTEM)
}

/** Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment.
  */
type PricingPlan = "ON_DEMAND" | "RESERVED"
object PricingPlan {
  inline val ON_DEMAND: "ON_DEMAND" = "ON_DEMAND"
  inline val RESERVED: "RESERVED" = "RESERVED"

  inline def values: js.Array[PricingPlan] = js.Array(ON_DEMAND, RESERVED)
}

/** Use Profile (ProResCodecProfile) to specify the type of Apple ProRes codec to use for this output.
  */
type ProresCodecProfile = "APPLE_PRORES_422" | "APPLE_PRORES_422_HQ" | "APPLE_PRORES_422_LT" | "APPLE_PRORES_422_PROXY"
object ProresCodecProfile {
  inline val APPLE_PRORES_422: "APPLE_PRORES_422" = "APPLE_PRORES_422"
  inline val APPLE_PRORES_422_HQ: "APPLE_PRORES_422_HQ" = "APPLE_PRORES_422_HQ"
  inline val APPLE_PRORES_422_LT: "APPLE_PRORES_422_LT" = "APPLE_PRORES_422_LT"
  inline val APPLE_PRORES_422_PROXY: "APPLE_PRORES_422_PROXY" = "APPLE_PRORES_422_PROXY"

  inline def values: js.Array[ProresCodecProfile] = js.Array(APPLE_PRORES_422, APPLE_PRORES_422_HQ, APPLE_PRORES_422_LT, APPLE_PRORES_422_PROXY)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
type ProresFramerateControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object ProresFramerateControl {
  inline val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  inline val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  inline def values: js.Array[ProresFramerateControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
type ProresFramerateConversionAlgorithm = "DUPLICATE_DROP" | "INTERPOLATE" | "FRAMEFORMER"
object ProresFramerateConversionAlgorithm {
  inline val DUPLICATE_DROP: "DUPLICATE_DROP" = "DUPLICATE_DROP"
  inline val INTERPOLATE: "INTERPOLATE" = "INTERPOLATE"
  inline val FRAMEFORMER: "FRAMEFORMER" = "FRAMEFORMER"

  inline def values: js.Array[ProresFramerateConversionAlgorithm] = js.Array(DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
  */
type ProresInterlaceMode = "PROGRESSIVE" | "TOP_FIELD" | "BOTTOM_FIELD" | "FOLLOW_TOP_FIELD" | "FOLLOW_BOTTOM_FIELD"
object ProresInterlaceMode {
  inline val PROGRESSIVE: "PROGRESSIVE" = "PROGRESSIVE"
  inline val TOP_FIELD: "TOP_FIELD" = "TOP_FIELD"
  inline val BOTTOM_FIELD: "BOTTOM_FIELD" = "BOTTOM_FIELD"
  inline val FOLLOW_TOP_FIELD: "FOLLOW_TOP_FIELD" = "FOLLOW_TOP_FIELD"
  inline val FOLLOW_BOTTOM_FIELD: "FOLLOW_BOTTOM_FIELD" = "FOLLOW_BOTTOM_FIELD"

  inline def values: js.Array[ProresInterlaceMode] = js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD)
}

/** Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
  */
type ProresParControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object ProresParControl {
  inline val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  inline val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  inline def values: js.Array[ProresParControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
  */
type ProresScanTypeConversionMode = "INTERLACED" | "INTERLACED_OPTIMIZE"
object ProresScanTypeConversionMode {
  inline val INTERLACED: "INTERLACED" = "INTERLACED"
  inline val INTERLACED_OPTIMIZE: "INTERLACED_OPTIMIZE" = "INTERLACED_OPTIMIZE"

  inline def values: js.Array[ProresScanTypeConversionMode] = js.Array(INTERLACED, INTERLACED_OPTIMIZE)
}

/** Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
  */
type ProresSlowPal = "DISABLED" | "ENABLED"
object ProresSlowPal {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[ProresSlowPal] = js.Array(DISABLED, ENABLED)
}

/** When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother picture.
  */
type ProresTelecine = "NONE" | "HARD"
object ProresTelecine {
  inline val NONE: "NONE" = "NONE"
  inline val HARD: "HARD" = "HARD"

  inline def values: js.Array[ProresTelecine] = js.Array(NONE, HARD)
}

/** Optional. When you request a list of queues, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by creation date.
  */
type QueueListBy = "NAME" | "CREATION_DATE"
object QueueListBy {
  inline val NAME: "NAME" = "NAME"
  inline val CREATION_DATE: "CREATION_DATE" = "CREATION_DATE"

  inline def values: js.Array[QueueListBy] = js.Array(NAME, CREATION_DATE)
}

/** Queues can be ACTIVE or PAUSED. If you pause a queue, jobs in that queue won't begin. Jobs that are running when you pause a queue continue to run until they finish or result in an error.
  */
type QueueStatus = "ACTIVE" | "PAUSED"
object QueueStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val PAUSED: "PAUSED" = "PAUSED"

  inline def values: js.Array[QueueStatus] = js.Array(ACTIVE, PAUSED)
}

/** Specifies whether the term of your reserved queue pricing plan is automatically extended (AUTO_RENEW) or expires (EXPIRE) at the end of the term.
  */
type RenewalType = "AUTO_RENEW" | "EXPIRE"
object RenewalType {
  inline val AUTO_RENEW: "AUTO_RENEW" = "AUTO_RENEW"
  inline val EXPIRE: "EXPIRE" = "EXPIRE"

  inline def values: js.Array[RenewalType] = js.Array(AUTO_RENEW, EXPIRE)
}

/** Specifies whether the pricing plan for your reserved queue is ACTIVE or EXPIRED.
  */
type ReservationPlanStatus = "ACTIVE" | "EXPIRED"
object ReservationPlanStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val EXPIRED: "EXPIRED" = "EXPIRED"

  inline def values: js.Array[ReservationPlanStatus] = js.Array(ACTIVE, EXPIRED)
}

/** Use Respond to AFD (RespondToAfd) to specify how the service changes the video itself in response to AFD values in the input. * Choose Respond to clip the input video frame according to the AFD value, input display aspect ratio, and output display aspect ratio. * Choose Passthrough to include the input AFD values. Do not choose this when AfdSignaling is set to (NONE). A preferred implementation of this workflow is to set RespondToAfd to (NONE) and set AfdSignaling to (AUTO). * Choose None to remove all input AFD values from this output.
  */
type RespondToAfd = "NONE" | "RESPOND" | "PASSTHROUGH"
object RespondToAfd {
  inline val NONE: "NONE" = "NONE"
  inline val RESPOND: "RESPOND" = "RESPOND"
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  inline def values: js.Array[RespondToAfd] = js.Array(NONE, RESPOND, PASSTHROUGH)
}

/** Choose an Amazon S3 canned ACL for MediaConvert to apply to this output.
  */
type S3ObjectCannedAcl = "PUBLIC_READ" | "AUTHENTICATED_READ" | "BUCKET_OWNER_READ" | "BUCKET_OWNER_FULL_CONTROL"
object S3ObjectCannedAcl {
  inline val PUBLIC_READ: "PUBLIC_READ" = "PUBLIC_READ"
  inline val AUTHENTICATED_READ: "AUTHENTICATED_READ" = "AUTHENTICATED_READ"
  inline val BUCKET_OWNER_READ: "BUCKET_OWNER_READ" = "BUCKET_OWNER_READ"
  inline val BUCKET_OWNER_FULL_CONTROL: "BUCKET_OWNER_FULL_CONTROL" = "BUCKET_OWNER_FULL_CONTROL"

  inline def values: js.Array[S3ObjectCannedAcl] = js.Array(PUBLIC_READ, AUTHENTICATED_READ, BUCKET_OWNER_READ, BUCKET_OWNER_FULL_CONTROL)
}

/** Specify how you want your data keys managed. AWS uses data keys to encrypt your content. AWS also encrypts the data keys themselves, using a customer master key (CMK), and then stores the encrypted data keys alongside your encrypted content. Use this setting to specify which AWS service manages the CMK. For simplest set up, choose Amazon S3 (SERVER_SIDE_ENCRYPTION_S3). If you want your master key to be managed by AWS Key Management Service (KMS), choose AWS KMS (SERVER_SIDE_ENCRYPTION_KMS). By default, when you choose AWS KMS, KMS uses the AWS managed customer master key (CMK) associated with Amazon S3 to encrypt your data keys. You can optionally choose to specify a different, customer managed CMK. Do so by specifying the Amazon Resource Name (ARN) of the key for the setting KMS ARN (kmsKeyArn).
  */
type S3ServerSideEncryptionType = "SERVER_SIDE_ENCRYPTION_S3" | "SERVER_SIDE_ENCRYPTION_KMS"
object S3ServerSideEncryptionType {
  inline val SERVER_SIDE_ENCRYPTION_S3: "SERVER_SIDE_ENCRYPTION_S3" = "SERVER_SIDE_ENCRYPTION_S3"
  inline val SERVER_SIDE_ENCRYPTION_KMS: "SERVER_SIDE_ENCRYPTION_KMS" = "SERVER_SIDE_ENCRYPTION_KMS"

  inline def values: js.Array[S3ServerSideEncryptionType] = js.Array(SERVER_SIDE_ENCRYPTION_S3, SERVER_SIDE_ENCRYPTION_KMS)
}

/** Specify how the service handles outputs that have a different aspect ratio from the input aspect ratio. Choose Stretch to output (STRETCH_TO_OUTPUT) to have the service stretch your video image to fit. Keep the setting Default (DEFAULT) to have the service letterbox your video instead. This setting overrides any value that you specify for the setting Selection placement (position) in this output.
  */
type ScalingBehavior = "DEFAULT" | "STRETCH_TO_OUTPUT"
object ScalingBehavior {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val STRETCH_TO_OUTPUT: "STRETCH_TO_OUTPUT" = "STRETCH_TO_OUTPUT"

  inline def values: js.Array[ScalingBehavior] = js.Array(DEFAULT, STRETCH_TO_OUTPUT)
}

/** Set Framerate (SccDestinationFramerate) to make sure that the captions and the video are synchronized in the output. Specify a frame rate that matches the frame rate of the associated video. If the video frame rate is 29.97, choose 29.97 dropframe (FRAMERATE_29_97_DROPFRAME) only if the video has video_insertion=true and drop_frame_timecode=true; otherwise, choose 29.97 non-dropframe (FRAMERATE_29_97_NON_DROPFRAME).
  */
type SccDestinationFramerate = "FRAMERATE_23_97" | "FRAMERATE_24" | "FRAMERATE_25" | "FRAMERATE_29_97_DROPFRAME" | "FRAMERATE_29_97_NON_DROPFRAME"
object SccDestinationFramerate {
  inline val FRAMERATE_23_97: "FRAMERATE_23_97" = "FRAMERATE_23_97"
  inline val FRAMERATE_24: "FRAMERATE_24" = "FRAMERATE_24"
  inline val FRAMERATE_25: "FRAMERATE_25" = "FRAMERATE_25"
  inline val FRAMERATE_29_97_DROPFRAME: "FRAMERATE_29_97_DROPFRAME" = "FRAMERATE_29_97_DROPFRAME"
  inline val FRAMERATE_29_97_NON_DROPFRAME: "FRAMERATE_29_97_NON_DROPFRAME" = "FRAMERATE_29_97_NON_DROPFRAME"

  inline def values: js.Array[SccDestinationFramerate] = js.Array(FRAMERATE_23_97, FRAMERATE_24, FRAMERATE_25, FRAMERATE_29_97_DROPFRAME, FRAMERATE_29_97_NON_DROPFRAME)
}

/** Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you need. When this is enabled, MediaConvert runs your job from an on-demand queue with similar performance to what you will see with one RTS in a reserved queue. This setting is disabled by default.
  */
type SimulateReservedQueue = "DISABLED" | "ENABLED"
object SimulateReservedQueue {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[SimulateReservedQueue] = js.Array(DISABLED, ENABLED)
}

/** Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error.
  */
type StatusUpdateInterval = "SECONDS_10" | "SECONDS_12" | "SECONDS_15" | "SECONDS_20" | "SECONDS_30" | "SECONDS_60" | "SECONDS_120" | "SECONDS_180" | "SECONDS_240" | "SECONDS_300" | "SECONDS_360" | "SECONDS_420" | "SECONDS_480" | "SECONDS_540" | "SECONDS_600"
object StatusUpdateInterval {
  inline val SECONDS_10: "SECONDS_10" = "SECONDS_10"
  inline val SECONDS_12: "SECONDS_12" = "SECONDS_12"
  inline val SECONDS_15: "SECONDS_15" = "SECONDS_15"
  inline val SECONDS_20: "SECONDS_20" = "SECONDS_20"
  inline val SECONDS_30: "SECONDS_30" = "SECONDS_30"
  inline val SECONDS_60: "SECONDS_60" = "SECONDS_60"
  inline val SECONDS_120: "SECONDS_120" = "SECONDS_120"
  inline val SECONDS_180: "SECONDS_180" = "SECONDS_180"
  inline val SECONDS_240: "SECONDS_240" = "SECONDS_240"
  inline val SECONDS_300: "SECONDS_300" = "SECONDS_300"
  inline val SECONDS_360: "SECONDS_360" = "SECONDS_360"
  inline val SECONDS_420: "SECONDS_420" = "SECONDS_420"
  inline val SECONDS_480: "SECONDS_480" = "SECONDS_480"
  inline val SECONDS_540: "SECONDS_540" = "SECONDS_540"
  inline val SECONDS_600: "SECONDS_600" = "SECONDS_600"

  inline def values: js.Array[StatusUpdateInterval] = js.Array(
    SECONDS_10,
    SECONDS_12,
    SECONDS_15,
    SECONDS_20,
    SECONDS_30,
    SECONDS_60,
    SECONDS_120,
    SECONDS_180,
    SECONDS_240,
    SECONDS_300,
    SECONDS_360,
    SECONDS_420,
    SECONDS_480,
    SECONDS_540,
    SECONDS_600
  )
}

/** A page type as defined in the standard ETSI EN 300 468, Table 94
  */
type TeletextPageType = "PAGE_TYPE_INITIAL" | "PAGE_TYPE_SUBTITLE" | "PAGE_TYPE_ADDL_INFO" | "PAGE_TYPE_PROGRAM_SCHEDULE" | "PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE"
object TeletextPageType {
  inline val PAGE_TYPE_INITIAL: "PAGE_TYPE_INITIAL" = "PAGE_TYPE_INITIAL"
  inline val PAGE_TYPE_SUBTITLE: "PAGE_TYPE_SUBTITLE" = "PAGE_TYPE_SUBTITLE"
  inline val PAGE_TYPE_ADDL_INFO: "PAGE_TYPE_ADDL_INFO" = "PAGE_TYPE_ADDL_INFO"
  inline val PAGE_TYPE_PROGRAM_SCHEDULE: "PAGE_TYPE_PROGRAM_SCHEDULE" = "PAGE_TYPE_PROGRAM_SCHEDULE"
  inline val PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE: "PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE" = "PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE"

  inline def values: js.Array[TeletextPageType] = js.Array(PAGE_TYPE_INITIAL, PAGE_TYPE_SUBTITLE, PAGE_TYPE_ADDL_INFO, PAGE_TYPE_PROGRAM_SCHEDULE, PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE)
}

/** Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to specify the location the burned-in timecode on output video.
  */
type TimecodeBurninPosition = "TOP_CENTER" | "TOP_LEFT" | "TOP_RIGHT" | "MIDDLE_LEFT" | "MIDDLE_CENTER" | "MIDDLE_RIGHT" | "BOTTOM_LEFT" | "BOTTOM_CENTER" | "BOTTOM_RIGHT"
object TimecodeBurninPosition {
  inline val TOP_CENTER: "TOP_CENTER" = "TOP_CENTER"
  inline val TOP_LEFT: "TOP_LEFT" = "TOP_LEFT"
  inline val TOP_RIGHT: "TOP_RIGHT" = "TOP_RIGHT"
  inline val MIDDLE_LEFT: "MIDDLE_LEFT" = "MIDDLE_LEFT"
  inline val MIDDLE_CENTER: "MIDDLE_CENTER" = "MIDDLE_CENTER"
  inline val MIDDLE_RIGHT: "MIDDLE_RIGHT" = "MIDDLE_RIGHT"
  inline val BOTTOM_LEFT: "BOTTOM_LEFT" = "BOTTOM_LEFT"
  inline val BOTTOM_CENTER: "BOTTOM_CENTER" = "BOTTOM_CENTER"
  inline val BOTTOM_RIGHT: "BOTTOM_RIGHT" = "BOTTOM_RIGHT"

  inline def values: js.Array[TimecodeBurninPosition] = js.Array(TOP_CENTER, TOP_LEFT, TOP_RIGHT, MIDDLE_LEFT, MIDDLE_CENTER, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT)
}

/** Use Source (TimecodeSource) to set how timecodes are handled within this job. To make sure that your video, audio, captions, and markers are synchronized and that time-based features, such as image inserter, work correctly, choose the Timecode source option that matches your assets. All timecodes are in a 24-hour format with frame number (HH:MM:SS:FF). * Embedded (EMBEDDED) - Use the timecode that is in the input video. If no embedded timecode is in the source, the service will use Start at 0 (ZEROBASED) instead. * Start at 0 (ZEROBASED) - Set the timecode of the initial frame to 00:00:00:00. * Specified Start (SPECIFIEDSTART) - Set the timecode of the initial frame to a value other than zero. You use Start timecode (Start) to provide this value.
  */
type TimecodeSource = "EMBEDDED" | "ZEROBASED" | "SPECIFIEDSTART"
object TimecodeSource {
  inline val EMBEDDED: "EMBEDDED" = "EMBEDDED"
  inline val ZEROBASED: "ZEROBASED" = "ZEROBASED"
  inline val SPECIFIEDSTART: "SPECIFIEDSTART" = "SPECIFIEDSTART"

  inline def values: js.Array[TimecodeSource] = js.Array(EMBEDDED, ZEROBASED, SPECIFIEDSTART)
}

/** Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed metadata from the input in this output.
  */
type TimedMetadata = "PASSTHROUGH" | "NONE"
object TimedMetadata {
  inline val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[TimedMetadata] = js.Array(PASSTHROUGH, NONE)
}

/** Pass through style and position information from a TTML-like input source (TTML, IMSC, SMPTE-TT) to the TTML output.
  */
type TtmlStylePassthrough = "ENABLED" | "DISABLED"
object TtmlStylePassthrough {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[TtmlStylePassthrough] = js.Array(ENABLED, DISABLED)
}

type Type = "SYSTEM" | "CUSTOM"
object Type {
  inline val SYSTEM: "SYSTEM" = "SYSTEM"
  inline val CUSTOM: "CUSTOM" = "CUSTOM"

  inline def values: js.Array[Type] = js.Array(SYSTEM, CUSTOM)
}

/** Specify the VC3 class to choose the quality characteristics for this output. VC3 class, together with the settings Framerate (framerateNumerator and framerateDenominator) and Resolution (height and width), determine your output bitrate. For example, say that your video resolution is 1920x1080 and your framerate is 29.97. Then Class 145 (CLASS_145) gives you an output with a bitrate of approximately 145 Mbps and Class 220 (CLASS_220) gives you and output with a bitrate of approximately 220 Mbps. VC3 class also specifies the color bit depth of your output.
  */
type Vc3Class = "CLASS_145_8BIT" | "CLASS_220_8BIT" | "CLASS_220_10BIT"
object Vc3Class {
  inline val CLASS_145_8BIT: "CLASS_145_8BIT" = "CLASS_145_8BIT"
  inline val CLASS_220_8BIT: "CLASS_220_8BIT" = "CLASS_220_8BIT"
  inline val CLASS_220_10BIT: "CLASS_220_10BIT" = "CLASS_220_10BIT"

  inline def values: js.Array[Vc3Class] = js.Array(CLASS_145_8BIT, CLASS_220_8BIT, CLASS_220_10BIT)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
type Vc3FramerateControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object Vc3FramerateControl {
  inline val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  inline val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  inline def values: js.Array[Vc3FramerateControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
type Vc3FramerateConversionAlgorithm = "DUPLICATE_DROP" | "INTERPOLATE" | "FRAMEFORMER"
object Vc3FramerateConversionAlgorithm {
  inline val DUPLICATE_DROP: "DUPLICATE_DROP" = "DUPLICATE_DROP"
  inline val INTERPOLATE: "INTERPOLATE" = "INTERPOLATE"
  inline val FRAMEFORMER: "FRAMEFORMER" = "FRAMEFORMER"

  inline def values: js.Array[Vc3FramerateConversionAlgorithm] = js.Array(DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** Optional. Choose the scan line type for this output. If you don't specify a value, MediaConvert will create a progressive output.
  */
type Vc3InterlaceMode = "INTERLACED" | "PROGRESSIVE"
object Vc3InterlaceMode {
  inline val INTERLACED: "INTERLACED" = "INTERLACED"
  inline val PROGRESSIVE: "PROGRESSIVE" = "PROGRESSIVE"

  inline def values: js.Array[Vc3InterlaceMode] = js.Array(INTERLACED, PROGRESSIVE)
}

/** Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
  */
type Vc3ScanTypeConversionMode = "INTERLACED" | "INTERLACED_OPTIMIZE"
object Vc3ScanTypeConversionMode {
  inline val INTERLACED: "INTERLACED" = "INTERLACED"
  inline val INTERLACED_OPTIMIZE: "INTERLACED_OPTIMIZE" = "INTERLACED_OPTIMIZE"

  inline def values: js.Array[Vc3ScanTypeConversionMode] = js.Array(INTERLACED, INTERLACED_OPTIMIZE)
}

/** Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling this setting will slightly reduce the duration of your video. Related settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
  */
type Vc3SlowPal = "DISABLED" | "ENABLED"
object Vc3SlowPal {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[Vc3SlowPal] = js.Array(DISABLED, ENABLED)
}

/** When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother picture.
  */
type Vc3Telecine = "NONE" | "HARD"
object Vc3Telecine {
  inline val NONE: "NONE" = "NONE"
  inline val HARD: "HARD" = "HARD"

  inline def values: js.Array[Vc3Telecine] = js.Array(NONE, HARD)
}

/** Type of video codec
  */
type VideoCodec = "AV1" | "AVC_INTRA" | "FRAME_CAPTURE" | "H_264" | "H_265" | "MPEG2" | "PRORES" | "VC3" | "VP8" | "VP9"
object VideoCodec {
  inline val AV1: "AV1" = "AV1"
  inline val AVC_INTRA: "AVC_INTRA" = "AVC_INTRA"
  inline val FRAME_CAPTURE: "FRAME_CAPTURE" = "FRAME_CAPTURE"
  inline val H_264: "H_264" = "H_264"
  inline val H_265: "H_265" = "H_265"
  inline val MPEG2: "MPEG2" = "MPEG2"
  inline val PRORES: "PRORES" = "PRORES"
  inline val VC3: "VC3" = "VC3"
  inline val VP8: "VP8" = "VP8"
  inline val VP9: "VP9" = "VP9"

  inline def values: js.Array[VideoCodec] = js.Array(AV1, AVC_INTRA, FRAME_CAPTURE, H_264, H_265, MPEG2, PRORES, VC3, VP8, VP9)
}

/** Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable Timecode insertion when the input frame rate is identical to the output frame rate. To include timecodes in this output, set Timecode insertion (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is DISABLED. When the service inserts timecodes in an output, by default, it uses any embedded timecodes from the input. If none are present, the service will set the timecode for the first output frame to zero. To change this default behavior, adjust the settings under Timecode configuration (TimecodeConfig). In the console, these settings are located under Job > Job settings > Timecode configuration. Note - Timecode source under input settings (InputTimecodeSource) does not affect the timecodes that are inserted in the output. Source under Job settings > Timecode configuration (TimecodeSource) does.
  */
type VideoTimecodeInsertion = "DISABLED" | "PIC_TIMING_SEI"
object VideoTimecodeInsertion {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val PIC_TIMING_SEI: "PIC_TIMING_SEI" = "PIC_TIMING_SEI"

  inline def values: js.Array[VideoTimecodeInsertion] = js.Array(DISABLED, PIC_TIMING_SEI)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
type Vp8FramerateControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object Vp8FramerateControl {
  inline val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  inline val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  inline def values: js.Array[Vp8FramerateControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
type Vp8FramerateConversionAlgorithm = "DUPLICATE_DROP" | "INTERPOLATE" | "FRAMEFORMER"
object Vp8FramerateConversionAlgorithm {
  inline val DUPLICATE_DROP: "DUPLICATE_DROP" = "DUPLICATE_DROP"
  inline val INTERPOLATE: "INTERPOLATE" = "INTERPOLATE"
  inline val FRAMEFORMER: "FRAMEFORMER" = "FRAMEFORMER"

  inline def values: js.Array[Vp8FramerateConversionAlgorithm] = js.Array(DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
  */
type Vp8ParControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object Vp8ParControl {
  inline val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  inline val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  inline def values: js.Array[Vp8ParControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, multi-pass encoding.
  */
type Vp8QualityTuningLevel = "MULTI_PASS" | "MULTI_PASS_HQ"
object Vp8QualityTuningLevel {
  inline val MULTI_PASS: "MULTI_PASS" = "MULTI_PASS"
  inline val MULTI_PASS_HQ: "MULTI_PASS_HQ" = "MULTI_PASS_HQ"

  inline def values: js.Array[Vp8QualityTuningLevel] = js.Array(MULTI_PASS, MULTI_PASS_HQ)
}

/** With the VP8 codec, you can use only the variable bitrate (VBR) rate control mode.
  */
type Vp8RateControlMode = "VBR"
object Vp8RateControlMode {
  inline val VBR: "VBR" = "VBR"

  inline def values: js.Array[Vp8RateControlMode] = js.Array(VBR)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
type Vp9FramerateControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object Vp9FramerateControl {
  inline val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  inline val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  inline def values: js.Array[Vp9FramerateControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
type Vp9FramerateConversionAlgorithm = "DUPLICATE_DROP" | "INTERPOLATE" | "FRAMEFORMER"
object Vp9FramerateConversionAlgorithm {
  inline val DUPLICATE_DROP: "DUPLICATE_DROP" = "DUPLICATE_DROP"
  inline val INTERPOLATE: "INTERPOLATE" = "INTERPOLATE"
  inline val FRAMEFORMER: "FRAMEFORMER" = "FRAMEFORMER"

  inline def values: js.Array[Vp9FramerateConversionAlgorithm] = js.Array(DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
  */
type Vp9ParControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object Vp9ParControl {
  inline val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  inline val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  inline def values: js.Array[Vp9ParControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, multi-pass encoding.
  */
type Vp9QualityTuningLevel = "MULTI_PASS" | "MULTI_PASS_HQ"
object Vp9QualityTuningLevel {
  inline val MULTI_PASS: "MULTI_PASS" = "MULTI_PASS"
  inline val MULTI_PASS_HQ: "MULTI_PASS_HQ" = "MULTI_PASS_HQ"

  inline def values: js.Array[Vp9QualityTuningLevel] = js.Array(MULTI_PASS, MULTI_PASS_HQ)
}

/** With the VP9 codec, you can use only the variable bitrate (VBR) rate control mode.
  */
type Vp9RateControlMode = "VBR"
object Vp9RateControlMode {
  inline val VBR: "VBR" = "VBR"

  inline def values: js.Array[Vp9RateControlMode] = js.Array(VBR)
}

/** Optional. Ignore this setting unless Nagra support directs you to specify a value. When you don't specify a value here, the Nagra NexGuard library uses its default value.
  */
type WatermarkingStrength = "LIGHTEST" | "LIGHTER" | "DEFAULT" | "STRONGER" | "STRONGEST"
object WatermarkingStrength {
  inline val LIGHTEST: "LIGHTEST" = "LIGHTEST"
  inline val LIGHTER: "LIGHTER" = "LIGHTER"
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val STRONGER: "STRONGER" = "STRONGER"
  inline val STRONGEST: "STRONGEST" = "STRONGEST"

  inline def values: js.Array[WatermarkingStrength] = js.Array(LIGHTEST, LIGHTER, DEFAULT, STRONGER, STRONGEST)
}

/** The service defaults to using RIFF for WAV outputs. If your output audio is likely to exceed 4 GB in file size, or if you otherwise need the extended support of the RF64 format, set your output WAV file format to RF64.
  */
type WavFormat = "RIFF" | "RF64"
object WavFormat {
  inline val RIFF: "RIFF" = "RIFF"
  inline val RF64: "RF64" = "RF64"

  inline def values: js.Array[WavFormat] = js.Array(RIFF, RF64)
}

/** If your input captions format is teletext or teletext inside of STL, enable this setting to pass through style, color, and position information to your WebVTT output captions.
  */
type WebvttStylePassthrough = "ENABLED" | "DISABLED"
object WebvttStylePassthrough {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[WebvttStylePassthrough] = js.Array(ENABLED, DISABLED)
}
