package facade.amazonaws.services.mediaconvert

import scalajs._

/** Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio + audio description (AD) as a stereo pair. The value for AudioType will be set to 3, which signals to downstream systems that this stream contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does not perform the mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any values you provide in AudioType and FollowInputAudioType. Choose NORMAL when the input does not contain pre-mixed audio + audio description (AD). In this case, the encoder will use any values you provide for AudioType and FollowInputAudioType.
  */
type AacAudioDescriptionBroadcasterMix = "BROADCASTER_MIXED_AD" | "NORMAL"
object AacAudioDescriptionBroadcasterMix {
  val BROADCASTER_MIXED_AD: "BROADCASTER_MIXED_AD" = "BROADCASTER_MIXED_AD"
  val NORMAL: "NORMAL" = "NORMAL"

  @inline def values = js.Array[AacAudioDescriptionBroadcasterMix](BROADCASTER_MIXED_AD, NORMAL)
}

/** AAC Profile.
  */
type AacCodecProfile = "LC" | "HEV1" | "HEV2"
object AacCodecProfile {
  val LC: "LC" = "LC"
  val HEV1: "HEV1" = "HEV1"
  val HEV2: "HEV2" = "HEV2"

  @inline def values = js.Array[AacCodecProfile](LC, HEV1, HEV2)
}

/** Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. "1.0 - Audio Description (Receiver Mix)" setting receives a stereo description plus control track and emits a mono AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
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

/** Rate Control Mode.
  */
type AacRateControlMode = "CBR" | "VBR"
object AacRateControlMode {
  val CBR: "CBR" = "CBR"
  val VBR: "VBR" = "VBR"

  @inline def values = js.Array[AacRateControlMode](CBR, VBR)
}

/** Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an output, you must choose "No container" for the output container.
  */
type AacRawFormat = "LATM_LOAS" | "NONE"
object AacRawFormat {
  val LATM_LOAS: "LATM_LOAS" = "LATM_LOAS"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[AacRawFormat](LATM_LOAS, NONE)
}

/** Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
  */
type AacSpecification = "MPEG2" | "MPEG4"
object AacSpecification {
  val MPEG2: "MPEG2" = "MPEG2"
  val MPEG4: "MPEG4" = "MPEG4"

  @inline def values = js.Array[AacSpecification](MPEG2, MPEG4)
}

/** VBR Quality Level - Only used if rate_control_mode is VBR.
  */
type AacVbrQuality = "LOW" | "MEDIUM_LOW" | "MEDIUM_HIGH" | "HIGH"
object AacVbrQuality {
  val LOW: "LOW" = "LOW"
  val MEDIUM_LOW: "MEDIUM_LOW" = "MEDIUM_LOW"
  val MEDIUM_HIGH: "MEDIUM_HIGH" = "MEDIUM_HIGH"
  val HIGH: "HIGH" = "HIGH"

  @inline def values = js.Array[AacVbrQuality](LOW, MEDIUM_LOW, MEDIUM_HIGH, HIGH)
}

/** Specify the bitstream mode for the AC-3 stream that the encoder emits. For more information about the AC3 bitstream mode, see ATSC A/52-2012 (Annex E).
  */
type Ac3BitstreamMode = "COMPLETE_MAIN" | "COMMENTARY" | "DIALOGUE" | "EMERGENCY" | "HEARING_IMPAIRED" | "MUSIC_AND_EFFECTS" | "VISUALLY_IMPAIRED" | "VOICE_OVER"
object Ac3BitstreamMode {
  val COMPLETE_MAIN: "COMPLETE_MAIN" = "COMPLETE_MAIN"
  val COMMENTARY: "COMMENTARY" = "COMMENTARY"
  val DIALOGUE: "DIALOGUE" = "DIALOGUE"
  val EMERGENCY: "EMERGENCY" = "EMERGENCY"
  val HEARING_IMPAIRED: "HEARING_IMPAIRED" = "HEARING_IMPAIRED"
  val MUSIC_AND_EFFECTS: "MUSIC_AND_EFFECTS" = "MUSIC_AND_EFFECTS"
  val VISUALLY_IMPAIRED: "VISUALLY_IMPAIRED" = "VISUALLY_IMPAIRED"
  val VOICE_OVER: "VOICE_OVER" = "VOICE_OVER"

  @inline def values = js.Array[Ac3BitstreamMode](COMPLETE_MAIN, COMMENTARY, DIALOGUE, EMERGENCY, HEARING_IMPAIRED, MUSIC_AND_EFFECTS, VISUALLY_IMPAIRED, VOICE_OVER)
}

/** Dolby Digital coding mode. Determines number of channels.
  */
type Ac3CodingMode = "CODING_MODE_1_0" | "CODING_MODE_1_1" | "CODING_MODE_2_0" | "CODING_MODE_3_2_LFE"
object Ac3CodingMode {
  val CODING_MODE_1_0: "CODING_MODE_1_0" = "CODING_MODE_1_0"
  val CODING_MODE_1_1: "CODING_MODE_1_1" = "CODING_MODE_1_1"
  val CODING_MODE_2_0: "CODING_MODE_2_0" = "CODING_MODE_2_0"
  val CODING_MODE_3_2_LFE: "CODING_MODE_3_2_LFE" = "CODING_MODE_3_2_LFE"

  @inline def values = js.Array[Ac3CodingMode](CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0, CODING_MODE_3_2_LFE)
}

/** Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the Dolby Digital stream for the line operating mode. Related setting: When you use this setting, MediaConvert ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
  */
type Ac3DynamicRangeCompressionLine = "FILM_STANDARD" | "FILM_LIGHT" | "MUSIC_STANDARD" | "MUSIC_LIGHT" | "SPEECH" | "NONE"
object Ac3DynamicRangeCompressionLine {
  val FILM_STANDARD: "FILM_STANDARD" = "FILM_STANDARD"
  val FILM_LIGHT: "FILM_LIGHT" = "FILM_LIGHT"
  val MUSIC_STANDARD: "MUSIC_STANDARD" = "MUSIC_STANDARD"
  val MUSIC_LIGHT: "MUSIC_LIGHT" = "MUSIC_LIGHT"
  val SPEECH: "SPEECH" = "SPEECH"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[Ac3DynamicRangeCompressionLine](FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH, NONE)
}

/** When you want to add Dolby dynamic range compression (DRC) signaling to your output stream, we recommend that you use the mode-specific settings instead of Dynamic range compression profile (DynamicRangeCompressionProfile). The mode-specific settings are Dynamic range compression profile, line mode (dynamicRangeCompressionLine) and Dynamic range compression profile, RF mode (dynamicRangeCompressionRf). Note that when you specify values for all three settings, MediaConvert ignores the value of this setting in favor of the mode-specific settings. If you do use this setting instead of the mode-specific settings, choose None (NONE) to leave out DRC signaling. Keep the default Film standard (FILM_STANDARD) to set the profile to Dolby's film standard profile for all operating modes.
  */
type Ac3DynamicRangeCompressionProfile = "FILM_STANDARD" | "NONE"
object Ac3DynamicRangeCompressionProfile {
  val FILM_STANDARD: "FILM_STANDARD" = "FILM_STANDARD"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[Ac3DynamicRangeCompressionProfile](FILM_STANDARD, NONE)
}

/** Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the Dolby Digital stream for the RF operating mode. Related setting: When you use this setting, MediaConvert ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
  */
type Ac3DynamicRangeCompressionRf = "FILM_STANDARD" | "FILM_LIGHT" | "MUSIC_STANDARD" | "MUSIC_LIGHT" | "SPEECH" | "NONE"
object Ac3DynamicRangeCompressionRf {
  val FILM_STANDARD: "FILM_STANDARD" = "FILM_STANDARD"
  val FILM_LIGHT: "FILM_LIGHT" = "FILM_LIGHT"
  val MUSIC_STANDARD: "MUSIC_STANDARD" = "MUSIC_STANDARD"
  val MUSIC_LIGHT: "MUSIC_LIGHT" = "MUSIC_LIGHT"
  val SPEECH: "SPEECH" = "SPEECH"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[Ac3DynamicRangeCompressionRf](FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH, NONE)
}

/** Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
  */
type Ac3LfeFilter = "ENABLED" | "DISABLED"
object Ac3LfeFilter {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[Ac3LfeFilter](ENABLED, DISABLED)
}

/** When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
  */
type Ac3MetadataControl = "FOLLOW_INPUT" | "USE_CONFIGURED"
object Ac3MetadataControl {
  val FOLLOW_INPUT: "FOLLOW_INPUT" = "FOLLOW_INPUT"
  val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"

  @inline def values = js.Array[Ac3MetadataControl](FOLLOW_INPUT, USE_CONFIGURED)
}

/** Specify whether the service runs your job with accelerated transcoding. Choose DISABLED if you don't want accelerated transcoding. Choose ENABLED if you want your job to run with accelerated transcoding and to fail if your input files or your job settings aren't compatible with accelerated transcoding. Choose PREFERRED if you want your job to run with accelerated transcoding if the job is compatible with the feature and to run at standard speed if it's not.
  */
type AccelerationMode = "DISABLED" | "ENABLED" | "PREFERRED"
object AccelerationMode {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"
  val PREFERRED: "PREFERRED" = "PREFERRED"

  @inline def values = js.Array[AccelerationMode](DISABLED, ENABLED, PREFERRED)
}

/** Describes whether the current job is running with accelerated transcoding. For jobs that have Acceleration (AccelerationMode) set to DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have Acceleration (AccelerationMode) set to ENABLED or PREFERRED, AccelerationStatus is one of the other states. AccelerationStatus is IN_PROGRESS initially, while the service determines whether the input files and job settings are compatible with accelerated transcoding. If they are, AcclerationStatus is ACCELERATED. If your input files and job settings aren't compatible with accelerated transcoding, the service either fails your job or runs it without accelerated transcoding, depending on how you set Acceleration (AccelerationMode). When the service runs your job without accelerated transcoding, AccelerationStatus is NOT_ACCELERATED.
  */
type AccelerationStatus = "NOT_APPLICABLE" | "IN_PROGRESS" | "ACCELERATED" | "NOT_ACCELERATED"
object AccelerationStatus {
  val NOT_APPLICABLE: "NOT_APPLICABLE" = "NOT_APPLICABLE"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val ACCELERATED: "ACCELERATED" = "ACCELERATED"
  val NOT_ACCELERATED: "NOT_ACCELERATED" = "NOT_ACCELERATED"

  @inline def values = js.Array[AccelerationStatus](NOT_APPLICABLE, IN_PROGRESS, ACCELERATED, NOT_ACCELERATED)
}

/** This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert AFD signaling (AfdSignaling) to specify whether the service includes AFD values in the output video data and what those values are. * Choose None to remove all AFD values from this output. * Choose Fixed to ignore input AFD values and instead encode the value specified in the job. * Choose Auto to calculate output AFD values based on the input AFD scaler data.
  */
type AfdSignaling = "NONE" | "AUTO" | "FIXED"
object AfdSignaling {
  val NONE: "NONE" = "NONE"
  val AUTO: "AUTO" = "AUTO"
  val FIXED: "FIXED" = "FIXED"

  @inline def values = js.Array[AfdSignaling](NONE, AUTO, FIXED)
}

/** Ignore this setting unless this input is a QuickTime animation with an alpha channel. Use this setting to create separate Key and Fill outputs. In each output, specify which part of the input MediaConvert uses. Leave this setting at the default value DISCARD to delete the alpha channel and preserve the video. Set it to REMAP_TO_LUMA to delete the video and map the alpha channel to the luma channel of your outputs.
  */
type AlphaBehavior = "DISCARD" | "REMAP_TO_LUMA"
object AlphaBehavior {
  val DISCARD: "DISCARD" = "DISCARD"
  val REMAP_TO_LUMA: "REMAP_TO_LUMA" = "REMAP_TO_LUMA"

  @inline def values = js.Array[AlphaBehavior](DISCARD, REMAP_TO_LUMA)
}

/** Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
  */
type AncillaryConvert608To708 = "UPCONVERT" | "DISABLED"
object AncillaryConvert608To708 {
  val UPCONVERT: "UPCONVERT" = "UPCONVERT"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[AncillaryConvert608To708](UPCONVERT, DISABLED)
}

/** By default, the service terminates any unterminated captions at the end of each input. If you want the caption to continue onto your next input, disable this setting.
  */
type AncillaryTerminateCaptions = "END_OF_INPUT" | "DISABLED"
object AncillaryTerminateCaptions {
  val END_OF_INPUT: "END_OF_INPUT" = "END_OF_INPUT"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[AncillaryTerminateCaptions](END_OF_INPUT, DISABLED)
}

/** The anti-alias filter is automatically applied to all outputs. The service no longer accepts the value DISABLED for AntiAlias. If you specify that in your job, the service will ignore the setting.
  */
type AntiAlias = "DISABLED" | "ENABLED"
object AntiAlias {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[AntiAlias](DISABLED, ENABLED)
}

/** You can add a tag for this mono-channel audio track to mimic its placement in a multi-channel layout. For example, if this track is the left surround channel, choose Left surround (LS).
  */
type AudioChannelTag = "L" | "R" | "C" | "LFE" | "LS" | "RS" | "LC" | "RC" | "CS" | "LSD" | "RSD" | "TCS" | "VHL" | "VHC" | "VHR"
object AudioChannelTag {
  val L: "L" = "L"
  val R: "R" = "R"
  val C: "C" = "C"
  val LFE: "LFE" = "LFE"
  val LS: "LS" = "LS"
  val RS: "RS" = "RS"
  val LC: "LC" = "LC"
  val RC: "RC" = "RC"
  val CS: "CS" = "CS"
  val LSD: "LSD" = "LSD"
  val RSD: "RSD" = "RSD"
  val TCS: "TCS" = "TCS"
  val VHL: "VHL" = "VHL"
  val VHC: "VHC" = "VHC"
  val VHR: "VHR" = "VHR"

  @inline def values = js.Array[AudioChannelTag](L, R, C, LFE, LS, RS, LC, RC, CS, LSD, RSD, TCS, VHL, VHC, VHR)
}

/** Type of Audio codec.
  */
type AudioCodec = "AAC" | "MP2" | "MP3" | "WAV" | "AIFF" | "AC3" | "EAC3" | "EAC3_ATMOS" | "VORBIS" | "OPUS" | "PASSTHROUGH"
object AudioCodec {
  val AAC: "AAC" = "AAC"
  val MP2: "MP2" = "MP2"
  val MP3: "MP3" = "MP3"
  val WAV: "WAV" = "WAV"
  val AIFF: "AIFF" = "AIFF"
  val AC3: "AC3" = "AC3"
  val EAC3: "EAC3" = "EAC3"
  val EAC3_ATMOS: "EAC3_ATMOS" = "EAC3_ATMOS"
  val VORBIS: "VORBIS" = "VORBIS"
  val OPUS: "OPUS" = "OPUS"
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  @inline def values = js.Array[AudioCodec](AAC, MP2, MP3, WAV, AIFF, AC3, EAC3, EAC3_ATMOS, VORBIS, OPUS, PASSTHROUGH)
}

/** Enable this setting on one audio selector to set it as the default for the job. The service uses this default for outputs where it can't find the specified input audio. If you don't set a default, those outputs have no audio.
  */
type AudioDefaultSelection = "DEFAULT" | "NOT_DEFAULT"
object AudioDefaultSelection {
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val NOT_DEFAULT: "NOT_DEFAULT" = "NOT_DEFAULT"

  @inline def values = js.Array[AudioDefaultSelection](DEFAULT, NOT_DEFAULT)
}

/** Specify which source for language code takes precedence for this audio track. When you choose Follow input (FOLLOW_INPUT), the service uses the language code from the input track if it's present. If there's no languge code on the input track, the service uses the code that you specify in the setting Language code (languageCode or customLanguageCode). When you choose Use configured (USE_CONFIGURED), the service uses the language code that you specify.
  */
type AudioLanguageCodeControl = "FOLLOW_INPUT" | "USE_CONFIGURED"
object AudioLanguageCodeControl {
  val FOLLOW_INPUT: "FOLLOW_INPUT" = "FOLLOW_INPUT"
  val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"

  @inline def values = js.Array[AudioLanguageCodeControl](FOLLOW_INPUT, USE_CONFIGURED)
}

/** Choose one of the following audio normalization algorithms: ITU-R BS.1770-1: Ungated loudness. A measurement of ungated average loudness for an entire piece of content, suitable for measurement of short-form content under ATSC recommendation A/85. Supports up to 5.1 audio channels. ITU-R BS.1770-2: Gated loudness. A measurement of gated average loudness compliant with the requirements of EBU-R128. Supports up to 5.1 audio channels. ITU-R BS.1770-3: Modified peak. The same loudness measurement algorithm as 1770-2, with an updated true peak measurement. ITU-R BS.1770-4: Higher channel count. Allows for more audio channels than the other algorithms, including configurations such as 7.1.
  */
type AudioNormalizationAlgorithm = "ITU_BS_1770_1" | "ITU_BS_1770_2" | "ITU_BS_1770_3" | "ITU_BS_1770_4"
object AudioNormalizationAlgorithm {
  val ITU_BS_1770_1: "ITU_BS_1770_1" = "ITU_BS_1770_1"
  val ITU_BS_1770_2: "ITU_BS_1770_2" = "ITU_BS_1770_2"
  val ITU_BS_1770_3: "ITU_BS_1770_3" = "ITU_BS_1770_3"
  val ITU_BS_1770_4: "ITU_BS_1770_4" = "ITU_BS_1770_4"

  @inline def values = js.Array[AudioNormalizationAlgorithm](ITU_BS_1770_1, ITU_BS_1770_2, ITU_BS_1770_3, ITU_BS_1770_4)
}

/** When enabled the output audio is corrected using the chosen algorithm. If disabled, the audio will be measured but not adjusted.
  */
type AudioNormalizationAlgorithmControl = "CORRECT_AUDIO" | "MEASURE_ONLY"
object AudioNormalizationAlgorithmControl {
  val CORRECT_AUDIO: "CORRECT_AUDIO" = "CORRECT_AUDIO"
  val MEASURE_ONLY: "MEASURE_ONLY" = "MEASURE_ONLY"

  @inline def values = js.Array[AudioNormalizationAlgorithmControl](CORRECT_AUDIO, MEASURE_ONLY)
}

/** If set to LOG, log each output's audio track loudness to a CSV file.
  */
type AudioNormalizationLoudnessLogging = "LOG" | "DONT_LOG"
object AudioNormalizationLoudnessLogging {
  val LOG: "LOG" = "LOG"
  val DONT_LOG: "DONT_LOG" = "DONT_LOG"

  @inline def values = js.Array[AudioNormalizationLoudnessLogging](LOG, DONT_LOG)
}

/** If set to TRUE_PEAK, calculate and log the TruePeak for each output's audio track loudness.
  */
type AudioNormalizationPeakCalculation = "TRUE_PEAK" | "NONE"
object AudioNormalizationPeakCalculation {
  val TRUE_PEAK: "TRUE_PEAK" = "TRUE_PEAK"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[AudioNormalizationPeakCalculation](TRUE_PEAK, NONE)
}

/** Specifies the type of the audio selector.
  */
type AudioSelectorType = "PID" | "TRACK" | "LANGUAGE_CODE"
object AudioSelectorType {
  val PID: "PID" = "PID"
  val TRACK: "TRACK" = "TRACK"
  val LANGUAGE_CODE: "LANGUAGE_CODE" = "LANGUAGE_CODE"

  @inline def values = js.Array[AudioSelectorType](PID, TRACK, LANGUAGE_CODE)
}

/** When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise the value in Audio Type is included in the output. Note that this field and audioType are both ignored if audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
  */
type AudioTypeControl = "FOLLOW_INPUT" | "USE_CONFIGURED"
object AudioTypeControl {
  val FOLLOW_INPUT: "FOLLOW_INPUT" = "FOLLOW_INPUT"
  val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"

  @inline def values = js.Array[AudioTypeControl](FOLLOW_INPUT, USE_CONFIGURED)
}

/** Specify the strength of any adaptive quantization filters that you enable. The value that you choose here applies to Spatial adaptive quantization (spatialAdaptiveQuantization).
  */
type Av1AdaptiveQuantization = "OFF" | "LOW" | "MEDIUM" | "HIGH" | "HIGHER" | "MAX"
object Av1AdaptiveQuantization {
  val OFF: "OFF" = "OFF"
  val LOW: "LOW" = "LOW"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val HIGH: "HIGH" = "HIGH"
  val HIGHER: "HIGHER" = "HIGHER"
  val MAX: "MAX" = "MAX"

  @inline def values = js.Array[Av1AdaptiveQuantization](OFF, LOW, MEDIUM, HIGH, HIGHER, MAX)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
type Av1FramerateControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object Av1FramerateControl {
  val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  @inline def values = js.Array[Av1FramerateControl](INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
type Av1FramerateConversionAlgorithm = "DUPLICATE_DROP" | "INTERPOLATE" | "FRAMEFORMER"
object Av1FramerateConversionAlgorithm {
  val DUPLICATE_DROP: "DUPLICATE_DROP" = "DUPLICATE_DROP"
  val INTERPOLATE: "INTERPOLATE" = "INTERPOLATE"
  val FRAMEFORMER: "FRAMEFORMER" = "FRAMEFORMER"

  @inline def values = js.Array[Av1FramerateConversionAlgorithm](DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** 'With AV1 outputs, for rate control mode, MediaConvert supports only quality-defined variable bitrate (QVBR). You can''t use CBR or VBR.'
  */
type Av1RateControlMode = "QVBR"
object Av1RateControlMode {
  val QVBR: "QVBR" = "QVBR"

  @inline def values = js.Array[Av1RateControlMode](QVBR)
}

/** Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture, you might choose to disable this feature. Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video
  * games, set it to Low. For content with a wider variety of textures, set it to High or Higher.
  */
type Av1SpatialAdaptiveQuantization = "DISABLED" | "ENABLED"
object Av1SpatialAdaptiveQuantization {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[Av1SpatialAdaptiveQuantization](DISABLED, ENABLED)
}

/** Specify the AVC-Intra class of your output. The AVC-Intra class selection determines the output video bit rate depending on the frame rate of the output. Outputs with higher class values have higher bitrates and improved image quality. Note that for Class 4K/2K, MediaConvert supports only 4:2:2 chroma subsampling.
  */
type AvcIntraClass = "CLASS_50" | "CLASS_100" | "CLASS_200" | "CLASS_4K_2K"
object AvcIntraClass {
  val CLASS_50: "CLASS_50" = "CLASS_50"
  val CLASS_100: "CLASS_100" = "CLASS_100"
  val CLASS_200: "CLASS_200" = "CLASS_200"
  val CLASS_4K_2K: "CLASS_4K_2K" = "CLASS_4K_2K"

  @inline def values = js.Array[AvcIntraClass](CLASS_50, CLASS_100, CLASS_200, CLASS_4K_2K)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
type AvcIntraFramerateControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object AvcIntraFramerateControl {
  val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  @inline def values = js.Array[AvcIntraFramerateControl](INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
type AvcIntraFramerateConversionAlgorithm = "DUPLICATE_DROP" | "INTERPOLATE" | "FRAMEFORMER"
object AvcIntraFramerateConversionAlgorithm {
  val DUPLICATE_DROP: "DUPLICATE_DROP" = "DUPLICATE_DROP"
  val INTERPOLATE: "INTERPOLATE" = "INTERPOLATE"
  val FRAMEFORMER: "FRAMEFORMER" = "FRAMEFORMER"

  @inline def values = js.Array[AvcIntraFramerateConversionAlgorithm](DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
  */
type AvcIntraInterlaceMode = "PROGRESSIVE" | "TOP_FIELD" | "BOTTOM_FIELD" | "FOLLOW_TOP_FIELD" | "FOLLOW_BOTTOM_FIELD"
object AvcIntraInterlaceMode {
  val PROGRESSIVE: "PROGRESSIVE" = "PROGRESSIVE"
  val TOP_FIELD: "TOP_FIELD" = "TOP_FIELD"
  val BOTTOM_FIELD: "BOTTOM_FIELD" = "BOTTOM_FIELD"
  val FOLLOW_TOP_FIELD: "FOLLOW_TOP_FIELD" = "FOLLOW_TOP_FIELD"
  val FOLLOW_BOTTOM_FIELD: "FOLLOW_BOTTOM_FIELD" = "FOLLOW_BOTTOM_FIELD"

  @inline def values = js.Array[AvcIntraInterlaceMode](PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD)
}

/** Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
  */
type AvcIntraScanTypeConversionMode = "INTERLACED" | "INTERLACED_OPTIMIZE"
object AvcIntraScanTypeConversionMode {
  val INTERLACED: "INTERLACED" = "INTERLACED"
  val INTERLACED_OPTIMIZE: "INTERLACED_OPTIMIZE" = "INTERLACED_OPTIMIZE"

  @inline def values = js.Array[AvcIntraScanTypeConversionMode](INTERLACED, INTERLACED_OPTIMIZE)
}

/** Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
  */
type AvcIntraSlowPal = "DISABLED" | "ENABLED"
object AvcIntraSlowPal {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[AvcIntraSlowPal](DISABLED, ENABLED)
}

/** When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother picture.
  */
type AvcIntraTelecine = "NONE" | "HARD"
object AvcIntraTelecine {
  val NONE: "NONE" = "NONE"
  val HARD: "HARD" = "HARD"

  @inline def values = js.Array[AvcIntraTelecine](NONE, HARD)
}

/** Optional. Use Quality tuning level (qualityTuningLevel) to choose how many transcoding passes MediaConvert does with your video. When you choose Multi-pass (MULTI_PASS), your video quality is better and your output bitrate is more accurate. That is, the actual bitrate of your output is closer to the target bitrate defined in the specification. When you choose Single-pass (SINGLE_PASS), your encoding time is faster. The default behavior is Single-pass (SINGLE_PASS).
  */
type AvcIntraUhdQualityTuningLevel = "SINGLE_PASS" | "MULTI_PASS"
object AvcIntraUhdQualityTuningLevel {
  val SINGLE_PASS: "SINGLE_PASS" = "SINGLE_PASS"
  val MULTI_PASS: "MULTI_PASS" = "MULTI_PASS"

  @inline def values = js.Array[AvcIntraUhdQualityTuningLevel](SINGLE_PASS, MULTI_PASS)
}

/** The tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs on any billing report that you set up.
  */
type BillingTagsSource = "QUEUE" | "PRESET" | "JOB_TEMPLATE" | "JOB"
object BillingTagsSource {
  val QUEUE: "QUEUE" = "QUEUE"
  val PRESET: "PRESET" = "PRESET"
  val JOB_TEMPLATE: "JOB_TEMPLATE" = "JOB_TEMPLATE"
  val JOB: "JOB" = "JOB"

  @inline def values = js.Array[BillingTagsSource](QUEUE, PRESET, JOB_TEMPLATE, JOB)
}

/** If no explicit x_position or y_position is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
  */
type BurninSubtitleAlignment = "CENTERED" | "LEFT"
object BurninSubtitleAlignment {
  val CENTERED: "CENTERED" = "CENTERED"
  val LEFT: "LEFT" = "LEFT"

  @inline def values = js.Array[BurninSubtitleAlignment](CENTERED, LEFT)
}

/** Specifies the color of the rectangle behind the captions. All burn-in and DVB-Sub font settings must match.
  */
type BurninSubtitleBackgroundColor = "NONE" | "BLACK" | "WHITE"
object BurninSubtitleBackgroundColor {
  val NONE: "NONE" = "NONE"
  val BLACK: "BLACK" = "BLACK"
  val WHITE: "WHITE" = "WHITE"

  @inline def values = js.Array[BurninSubtitleBackgroundColor](NONE, BLACK, WHITE)
}

/** Specifies the color of the burned-in captions. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
  */
type BurninSubtitleFontColor = "WHITE" | "BLACK" | "YELLOW" | "RED" | "GREEN" | "BLUE"
object BurninSubtitleFontColor {
  val WHITE: "WHITE" = "WHITE"
  val BLACK: "BLACK" = "BLACK"
  val YELLOW: "YELLOW" = "YELLOW"
  val RED: "RED" = "RED"
  val GREEN: "GREEN" = "GREEN"
  val BLUE: "BLUE" = "BLUE"

  @inline def values = js.Array[BurninSubtitleFontColor](WHITE, BLACK, YELLOW, RED, GREEN, BLUE)
}

/** Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
  */
type BurninSubtitleOutlineColor = "BLACK" | "WHITE" | "YELLOW" | "RED" | "GREEN" | "BLUE"
object BurninSubtitleOutlineColor {
  val BLACK: "BLACK" = "BLACK"
  val WHITE: "WHITE" = "WHITE"
  val YELLOW: "YELLOW" = "YELLOW"
  val RED: "RED" = "RED"
  val GREEN: "GREEN" = "GREEN"
  val BLUE: "BLUE" = "BLUE"

  @inline def values = js.Array[BurninSubtitleOutlineColor](BLACK, WHITE, YELLOW, RED, GREEN, BLUE)
}

/** Specifies the color of the shadow cast by the captions. All burn-in and DVB-Sub font settings must match.
  */
type BurninSubtitleShadowColor = "NONE" | "BLACK" | "WHITE"
object BurninSubtitleShadowColor {
  val NONE: "NONE" = "NONE"
  val BLACK: "BLACK" = "BLACK"
  val WHITE: "WHITE" = "WHITE"

  @inline def values = js.Array[BurninSubtitleShadowColor](NONE, BLACK, WHITE)
}

/** Only applies to jobs with input captions in Teletext or STL formats. Specify whether the spacing between letters in your captions is set by the captions grid or varies depending on letter width. Choose fixed grid to conform to the spacing specified in the captions file more accurately. Choose proportional to make the text easier to read if the captions are closed caption.
  */
type BurninSubtitleTeletextSpacing = "FIXED_GRID" | "PROPORTIONAL"
object BurninSubtitleTeletextSpacing {
  val FIXED_GRID: "FIXED_GRID" = "FIXED_GRID"
  val PROPORTIONAL: "PROPORTIONAL" = "PROPORTIONAL"

  @inline def values = js.Array[BurninSubtitleTeletextSpacing](FIXED_GRID, PROPORTIONAL)
}

/** Specify the format for this set of captions on this output. The default format is embedded without SCTE-20. Other options are embedded with SCTE-20, burn-in, DVB-sub, IMSC, SCC, SRT, teletext, TTML, and web-VTT. If you are using SCTE-20, choose SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED) to create an output that complies with the SCTE-43 spec. To create a non-compliant output where the embedded captions come first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
  */
type CaptionDestinationType = "BURN_IN" | "DVB_SUB" | "EMBEDDED" | "EMBEDDED_PLUS_SCTE20" | "IMSC" | "SCTE20_PLUS_EMBEDDED" | "SCC" | "SRT" | "SMI" | "TELETEXT" | "TTML" | "WEBVTT"
object CaptionDestinationType {
  val BURN_IN: "BURN_IN" = "BURN_IN"
  val DVB_SUB: "DVB_SUB" = "DVB_SUB"
  val EMBEDDED: "EMBEDDED" = "EMBEDDED"
  val EMBEDDED_PLUS_SCTE20: "EMBEDDED_PLUS_SCTE20" = "EMBEDDED_PLUS_SCTE20"
  val IMSC: "IMSC" = "IMSC"
  val SCTE20_PLUS_EMBEDDED: "SCTE20_PLUS_EMBEDDED" = "SCTE20_PLUS_EMBEDDED"
  val SCC: "SCC" = "SCC"
  val SRT: "SRT" = "SRT"
  val SMI: "SMI" = "SMI"
  val TELETEXT: "TELETEXT" = "TELETEXT"
  val TTML: "TTML" = "TTML"
  val WEBVTT: "WEBVTT" = "WEBVTT"

  @inline def values = js.Array[CaptionDestinationType](BURN_IN, DVB_SUB, EMBEDDED, EMBEDDED_PLUS_SCTE20, IMSC, SCTE20_PLUS_EMBEDDED, SCC, SRT, SMI, TELETEXT, TTML, WEBVTT)
}

/** Use Source (SourceType) to identify the format of your input captions. The service cannot auto-detect caption format.
  */
type CaptionSourceType = "ANCILLARY" | "DVB_SUB" | "EMBEDDED" | "SCTE20" | "SCC" | "TTML" | "STL" | "SRT" | "SMI" | "SMPTE_TT" | "TELETEXT" | "NULL_SOURCE" | "IMSC" | "WEBVTT"
object CaptionSourceType {
  val ANCILLARY: "ANCILLARY" = "ANCILLARY"
  val DVB_SUB: "DVB_SUB" = "DVB_SUB"
  val EMBEDDED: "EMBEDDED" = "EMBEDDED"
  val SCTE20: "SCTE20" = "SCTE20"
  val SCC: "SCC" = "SCC"
  val TTML: "TTML" = "TTML"
  val STL: "STL" = "STL"
  val SRT: "SRT" = "SRT"
  val SMI: "SMI" = "SMI"
  val SMPTE_TT: "SMPTE_TT" = "SMPTE_TT"
  val TELETEXT: "TELETEXT" = "TELETEXT"
  val NULL_SOURCE: "NULL_SOURCE" = "NULL_SOURCE"
  val IMSC: "IMSC" = "IMSC"
  val WEBVTT: "WEBVTT" = "WEBVTT"

  @inline def values = js.Array[CaptionSourceType](ANCILLARY, DVB_SUB, EMBEDDED, SCTE20, SCC, TTML, STL, SRT, SMI, SMPTE_TT, TELETEXT, NULL_SOURCE, IMSC, WEBVTT)
}

/** Disable this setting only when your workflow requires the #EXT-X-ALLOW-CACHE:no tag. Otherwise, keep the default value Enabled (ENABLED) and control caching in your video distribution set up. For example, use the Cache-Control http header.
  */
type CmafClientCache = "DISABLED" | "ENABLED"
object CmafClientCache {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[CmafClientCache](DISABLED, ENABLED)
}

/** Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
  */
type CmafCodecSpecification = "RFC_6381" | "RFC_4281"
object CmafCodecSpecification {
  val RFC_6381: "RFC_6381" = "RFC_6381"
  val RFC_4281: "RFC_4281" = "RFC_4281"

  @inline def values = js.Array[CmafCodecSpecification](RFC_6381, RFC_4281)
}

/** Specify the encryption scheme that you want the service to use when encrypting your CMAF segments. Choose AES-CBC subsample (SAMPLE-AES) or AES_CTR (AES-CTR).
  */
type CmafEncryptionType = "SAMPLE_AES" | "AES_CTR"
object CmafEncryptionType {
  val SAMPLE_AES: "SAMPLE_AES" = "SAMPLE_AES"
  val AES_CTR: "AES_CTR" = "AES_CTR"

  @inline def values = js.Array[CmafEncryptionType](SAMPLE_AES, AES_CTR)
}

/** When you use DRM with CMAF outputs, choose whether the service writes the 128-bit encryption initialization vector in the HLS and DASH manifests.
  */
type CmafInitializationVectorInManifest = "INCLUDE" | "EXCLUDE"
object CmafInitializationVectorInManifest {
  val INCLUDE: "INCLUDE" = "INCLUDE"
  val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  @inline def values = js.Array[CmafInitializationVectorInManifest](INCLUDE, EXCLUDE)
}

/** Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
  */
type CmafKeyProviderType = "SPEKE" | "STATIC_KEY"
object CmafKeyProviderType {
  val SPEKE: "SPEKE" = "SPEKE"
  val STATIC_KEY: "STATIC_KEY" = "STATIC_KEY"

  @inline def values = js.Array[CmafKeyProviderType](SPEKE, STATIC_KEY)
}

/** When set to GZIP, compresses HLS playlist.
  */
type CmafManifestCompression = "GZIP" | "NONE"
object CmafManifestCompression {
  val GZIP: "GZIP" = "GZIP"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[CmafManifestCompression](GZIP, NONE)
}

/** Indicates whether the output manifest should use floating point values for segment duration.
  */
type CmafManifestDurationFormat = "FLOATING_POINT" | "INTEGER"
object CmafManifestDurationFormat {
  val FLOATING_POINT: "FLOATING_POINT" = "FLOATING_POINT"
  val INTEGER: "INTEGER" = "INTEGER"

  @inline def values = js.Array[CmafManifestDurationFormat](FLOATING_POINT, INTEGER)
}

/** Specify whether your DASH profile is on-demand or main. When you choose Main profile (MAIN_PROFILE), the service signals urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE), the service signals urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose On-demand, you must also set the output group setting Segment control (SegmentControl) to Single file (SINGLE_FILE).
  */
type CmafMpdProfile = "MAIN_PROFILE" | "ON_DEMAND_PROFILE"
object CmafMpdProfile {
  val MAIN_PROFILE: "MAIN_PROFILE" = "MAIN_PROFILE"
  val ON_DEMAND_PROFILE: "ON_DEMAND_PROFILE" = "ON_DEMAND_PROFILE"

  @inline def values = js.Array[CmafMpdProfile](MAIN_PROFILE, ON_DEMAND_PROFILE)
}

/** Use this setting only when your output video stream has B-frames, which causes the initial presentation time stamp (PTS) to be offset from the initial decode time stamp (DTS). Specify how MediaConvert handles PTS when writing time stamps in output DASH manifests. Choose Match initial PTS (MATCH_INITIAL_PTS) when you want MediaConvert to use the initial PTS as the first time stamp in the manifest. Choose Zero-based (ZERO_BASED) to have MediaConvert ignore the initial PTS in the video stream and instead write the initial time stamp as zero in the manifest. For outputs that don't have B-frames, the time stamps in your DASH manifests start at zero regardless of your choice here.
  */
type CmafPtsOffsetHandlingForBFrames = "ZERO_BASED" | "MATCH_INITIAL_PTS"
object CmafPtsOffsetHandlingForBFrames {
  val ZERO_BASED: "ZERO_BASED" = "ZERO_BASED"
  val MATCH_INITIAL_PTS: "MATCH_INITIAL_PTS" = "MATCH_INITIAL_PTS"

  @inline def values = js.Array[CmafPtsOffsetHandlingForBFrames](ZERO_BASED, MATCH_INITIAL_PTS)
}

/** When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
  */
type CmafSegmentControl = "SINGLE_FILE" | "SEGMENTED_FILES"
object CmafSegmentControl {
  val SINGLE_FILE: "SINGLE_FILE" = "SINGLE_FILE"
  val SEGMENTED_FILES: "SEGMENTED_FILES" = "SEGMENTED_FILES"

  @inline def values = js.Array[CmafSegmentControl](SINGLE_FILE, SEGMENTED_FILES)
}

/** Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
  */
type CmafStreamInfResolution = "INCLUDE" | "EXCLUDE"
object CmafStreamInfResolution {
  val INCLUDE: "INCLUDE" = "INCLUDE"
  val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  @inline def values = js.Array[CmafStreamInfResolution](INCLUDE, EXCLUDE)
}

/** When set to ENABLED, a DASH MPD manifest will be generated for this output.
  */
type CmafWriteDASHManifest = "DISABLED" | "ENABLED"
object CmafWriteDASHManifest {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[CmafWriteDASHManifest](DISABLED, ENABLED)
}

/** When set to ENABLED, an Apple HLS manifest will be generated for this output.
  */
type CmafWriteHLSManifest = "DISABLED" | "ENABLED"
object CmafWriteHLSManifest {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[CmafWriteHLSManifest](DISABLED, ENABLED)
}

/** When you enable Precise segment duration in DASH manifests (writeSegmentTimelineInRepresentation), your DASH manifest shows precise segment durations. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your DASH manifest are approximate. The segment duration information appears in the duration attribute of the SegmentTemplate element.
  */
type CmafWriteSegmentTimelineInRepresentation = "ENABLED" | "DISABLED"
object CmafWriteSegmentTimelineInRepresentation {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[CmafWriteSegmentTimelineInRepresentation](ENABLED, DISABLED)
}

/** Specify this setting only when your output will be consumed by a downstream repackaging workflow that is sensitive to very small duration differences between video and audio. For this situation, choose Match video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with silence or trims them to ensure that the total duration of each audio stream is at least as long as the total duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
  */
type CmfcAudioDuration = "DEFAULT_CODEC_DURATION" | "MATCH_VIDEO_DURATION"
object CmfcAudioDuration {
  val DEFAULT_CODEC_DURATION: "DEFAULT_CODEC_DURATION" = "DEFAULT_CODEC_DURATION"
  val MATCH_VIDEO_DURATION: "MATCH_VIDEO_DURATION" = "MATCH_VIDEO_DURATION"

  @inline def values = js.Array[CmfcAudioDuration](DEFAULT_CODEC_DURATION, MATCH_VIDEO_DURATION)
}

/** Use this setting to control the values that MediaConvert puts in your HLS parent playlist to control how the client player selects which audio track to play. The other options for this setting determine the values that MediaConvert writes for the DEFAULT and AUTOSELECT attributes of the EXT-X-MEDIA entry for the audio variant. For more information about these attributes, see the Apple documentation article https://developer.apple.com/documentation/http_live_streaming/example_playlists_for_http_live_streaming/adding_alternate_media_to_a_playlist. Choose Alternate audio, auto select, default (ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT) to set DEFAULT=YES and AUTOSELECT=YES. Choose this value for only one variant in your output group. Choose Alternate audio, auto select, not default (ALTERNATE_AUDIO_AUTO_SELECT) to set DEFAULT=NO and AUTOSELECT=YES. Choose Alternate Audio, Not Auto Select to set DEFAULT=NO and AUTOSELECT=NO. When you don't specify a value for this setting, MediaConvert
  * defaults to Alternate audio, auto select, default. When there is more than one variant in your output group, you must explicitly choose a value for this setting.
  */
type CmfcAudioTrackType = "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT" | "ALTERNATE_AUDIO_AUTO_SELECT" | "ALTERNATE_AUDIO_NOT_AUTO_SELECT"
object CmfcAudioTrackType {
  val ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT: "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT" = "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT"
  val ALTERNATE_AUDIO_AUTO_SELECT: "ALTERNATE_AUDIO_AUTO_SELECT" = "ALTERNATE_AUDIO_AUTO_SELECT"
  val ALTERNATE_AUDIO_NOT_AUTO_SELECT: "ALTERNATE_AUDIO_NOT_AUTO_SELECT" = "ALTERNATE_AUDIO_NOT_AUTO_SELECT"

  @inline def values = js.Array[CmfcAudioTrackType](ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT, ALTERNATE_AUDIO_AUTO_SELECT, ALTERNATE_AUDIO_NOT_AUTO_SELECT)
}

/** Specify whether to flag this audio track as descriptive video service (DVS) in your HLS parent manifest. When you choose Flag (FLAG), MediaConvert includes the parameter CHARACTERISTICS="public.accessibility.describes-video" in the EXT-X-MEDIA entry for this track. When you keep the default choice, Don't flag (DONT_FLAG), MediaConvert leaves this parameter out. The DVS flag can help with accessibility on Apple devices. For more information, see the Apple documentation.
  */
type CmfcDescriptiveVideoServiceFlag = "DONT_FLAG" | "FLAG"
object CmfcDescriptiveVideoServiceFlag {
  val DONT_FLAG: "DONT_FLAG" = "DONT_FLAG"
  val FLAG: "FLAG" = "FLAG"

  @inline def values = js.Array[CmfcDescriptiveVideoServiceFlag](DONT_FLAG, FLAG)
}

/** Choose Include (INCLUDE) to have MediaConvert generate an HLS child manifest that lists only the I-frames for this rendition, in addition to your regular manifest for this rendition. You might use this manifest as part of a workflow that creates preview functions for your video. MediaConvert adds both the I-frame only child manifest and the regular child manifest to the parent manifest. When you don't need the I-frame only child manifest, keep the default value Exclude (EXCLUDE).
  */
type CmfcIFrameOnlyManifest = "INCLUDE" | "EXCLUDE"
object CmfcIFrameOnlyManifest {
  val INCLUDE: "INCLUDE" = "INCLUDE"
  val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  @inline def values = js.Array[CmfcIFrameOnlyManifest](INCLUDE, EXCLUDE)
}

/** Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
  */
type CmfcScte35Esam = "INSERT" | "NONE"
object CmfcScte35Esam {
  val INSERT: "INSERT" = "INSERT"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[CmfcScte35Esam](INSERT, NONE)
}

/** Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want those SCTE-35 markers in this output.
  */
type CmfcScte35Source = "PASSTHROUGH" | "NONE"
object CmfcScte35Source {
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[CmfcScte35Source](PASSTHROUGH, NONE)
}

/** Choose Insert (INSERT) for this setting to include color metadata in this output. Choose Ignore (IGNORE) to exclude color metadata from this output. If you don't specify a value, the service sets this to Insert by default.
  */
type ColorMetadata = "IGNORE" | "INSERT"
object ColorMetadata {
  val IGNORE: "IGNORE" = "IGNORE"
  val INSERT: "INSERT" = "INSERT"

  @inline def values = js.Array[ColorMetadata](IGNORE, INSERT)
}

/** If your input video has accurate color space metadata, or if you don't know about color space, leave this set to the default value Follow (FOLLOW). The service will automatically detect your input color space. If your input video has metadata indicating the wrong color space, specify the accurate color space here. If your input video is HDR 10 and the SMPTE ST 2086 Mastering Display Color Volume static metadata isn't present in your video stream, or if that metadata is present but not accurate, choose Force HDR 10 (FORCE_HDR10) here and specify correct values in the input HDR 10 metadata (Hdr10Metadata) settings. For more information about MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
  */
type ColorSpace = "FOLLOW" | "REC_601" | "REC_709" | "HDR10" | "HLG_2020"
object ColorSpace {
  val FOLLOW: "FOLLOW" = "FOLLOW"
  val REC_601: "REC_601" = "REC_601"
  val REC_709: "REC_709" = "REC_709"
  val HDR10: "HDR10" = "HDR10"
  val HLG_2020: "HLG_2020" = "HLG_2020"

  @inline def values = js.Array[ColorSpace](FOLLOW, REC_601, REC_709, HDR10, HLG_2020)
}

/** Specify the color space you want for this output. The service supports conversion between HDR formats, between SDR formats, from SDR to HDR, and from HDR to SDR. SDR to HDR conversion doesn't upgrade the dynamic range. The converted video has an HDR format, but visually appears the same as an unconverted output. HDR to SDR conversion uses Elemental tone mapping technology to approximate the outcome of manually regrading from HDR to SDR.
  */
type ColorSpaceConversion = "NONE" | "FORCE_601" | "FORCE_709" | "FORCE_HDR10" | "FORCE_HLG_2020"
object ColorSpaceConversion {
  val NONE: "NONE" = "NONE"
  val FORCE_601: "FORCE_601" = "FORCE_601"
  val FORCE_709: "FORCE_709" = "FORCE_709"
  val FORCE_HDR10: "FORCE_HDR10" = "FORCE_HDR10"
  val FORCE_HLG_2020: "FORCE_HLG_2020" = "FORCE_HLG_2020"

  @inline def values = js.Array[ColorSpaceConversion](NONE, FORCE_601, FORCE_709, FORCE_HDR10, FORCE_HLG_2020)
}

/** There are two sources for color metadata, the input file and the job input settings Color space (ColorSpace) and HDR master display information settings(Hdr10Metadata). The Color space usage setting determines which takes precedence. Choose Force (FORCE) to use color metadata from the input job settings. If you don't specify values for those settings, the service defaults to using metadata from your input. FALLBACK - Choose Fallback (FALLBACK) to use color metadata from the source when it is present. If there's no color metadata in your input file, the service defaults to using values you specify in the input settings.
  */
type ColorSpaceUsage = "FORCE" | "FALLBACK"
object ColorSpaceUsage {
  val FORCE: "FORCE" = "FORCE"
  val FALLBACK: "FALLBACK" = "FALLBACK"

  @inline def values = js.Array[ColorSpaceUsage](FORCE, FALLBACK)
}

/** The length of the term of your reserved queue pricing plan commitment.
  */
type Commitment = "ONE_YEAR"
object Commitment {
  val ONE_YEAR: "ONE_YEAR" = "ONE_YEAR"

  @inline def values = js.Array[Commitment](ONE_YEAR)
}

/** Container for this output. Some containers require a container settings object. If not specified, the default object will be created.
  */
type ContainerType = "F4V" | "ISMV" | "M2TS" | "M3U8" | "CMFC" | "MOV" | "MP4" | "MPD" | "MXF" | "WEBM" | "RAW"
object ContainerType {
  val F4V: "F4V" = "F4V"
  val ISMV: "ISMV" = "ISMV"
  val M2TS: "M2TS" = "M2TS"
  val M3U8: "M3U8" = "M3U8"
  val CMFC: "CMFC" = "CMFC"
  val MOV: "MOV" = "MOV"
  val MP4: "MP4" = "MP4"
  val MPD: "MPD" = "MPD"
  val MXF: "MXF" = "MXF"
  val WEBM: "WEBM" = "WEBM"
  val RAW: "RAW" = "RAW"

  @inline def values = js.Array[ContainerType](F4V, ISMV, M2TS, M3U8, CMFC, MOV, MP4, MPD, MXF, WEBM, RAW)
}

/** Use this setting only when your audio codec is a Dolby one (AC3, EAC3, or Atmos) and your downstream workflow requires that your DASH manifest use the Dolby channel configuration tag, rather than the MPEG one. For example, you might need to use this to make dynamic ad insertion work. Specify which audio channel configuration scheme ID URI MediaConvert writes in your DASH manifest. Keep the default value, MPEG channel configuration (MPEG_CHANNEL_CONFIGURATION), to have MediaConvert write this: urn:mpeg:mpegB:cicp:ChannelConfiguration. Choose Dolby channel configuration (DOLBY_CHANNEL_CONFIGURATION) to have MediaConvert write this instead: tag:dolby.com,2014:dash:audio_channel_configuration:2011.
  */
type DashIsoGroupAudioChannelConfigSchemeIdUri = "MPEG_CHANNEL_CONFIGURATION" | "DOLBY_CHANNEL_CONFIGURATION"
object DashIsoGroupAudioChannelConfigSchemeIdUri {
  val MPEG_CHANNEL_CONFIGURATION: "MPEG_CHANNEL_CONFIGURATION" = "MPEG_CHANNEL_CONFIGURATION"
  val DOLBY_CHANNEL_CONFIGURATION: "DOLBY_CHANNEL_CONFIGURATION" = "DOLBY_CHANNEL_CONFIGURATION"

  @inline def values = js.Array[DashIsoGroupAudioChannelConfigSchemeIdUri](MPEG_CHANNEL_CONFIGURATION, DOLBY_CHANNEL_CONFIGURATION)
}

/** Supports HbbTV specification as indicated
  */
type DashIsoHbbtvCompliance = "HBBTV_1_5" | "NONE"
object DashIsoHbbtvCompliance {
  val HBBTV_1_5: "HBBTV_1_5" = "HBBTV_1_5"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[DashIsoHbbtvCompliance](HBBTV_1_5, NONE)
}

/** Specify whether your DASH profile is on-demand or main. When you choose Main profile (MAIN_PROFILE), the service signals urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE), the service signals urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose On-demand, you must also set the output group setting Segment control (SegmentControl) to Single file (SINGLE_FILE).
  */
type DashIsoMpdProfile = "MAIN_PROFILE" | "ON_DEMAND_PROFILE"
object DashIsoMpdProfile {
  val MAIN_PROFILE: "MAIN_PROFILE" = "MAIN_PROFILE"
  val ON_DEMAND_PROFILE: "ON_DEMAND_PROFILE" = "ON_DEMAND_PROFILE"

  @inline def values = js.Array[DashIsoMpdProfile](MAIN_PROFILE, ON_DEMAND_PROFILE)
}

/** This setting can improve the compatibility of your output with video players on obsolete devices. It applies only to DASH H.264 outputs with DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to correct problems with playback on older devices. Otherwise, keep the default setting CENC v1 (CENC_V1). If you choose Unencrypted SEI, for that output, the service will exclude the access unit delimiter and will leave the SEI NAL units unencrypted.
  */
type DashIsoPlaybackDeviceCompatibility = "CENC_V1" | "UNENCRYPTED_SEI"
object DashIsoPlaybackDeviceCompatibility {
  val CENC_V1: "CENC_V1" = "CENC_V1"
  val UNENCRYPTED_SEI: "UNENCRYPTED_SEI" = "UNENCRYPTED_SEI"

  @inline def values = js.Array[DashIsoPlaybackDeviceCompatibility](CENC_V1, UNENCRYPTED_SEI)
}

/** Use this setting only when your output video stream has B-frames, which causes the initial presentation time stamp (PTS) to be offset from the initial decode time stamp (DTS). Specify how MediaConvert handles PTS when writing time stamps in output DASH manifests. Choose Match initial PTS (MATCH_INITIAL_PTS) when you want MediaConvert to use the initial PTS as the first time stamp in the manifest. Choose Zero-based (ZERO_BASED) to have MediaConvert ignore the initial PTS in the video stream and instead write the initial time stamp as zero in the manifest. For outputs that don't have B-frames, the time stamps in your DASH manifests start at zero regardless of your choice here.
  */
type DashIsoPtsOffsetHandlingForBFrames = "ZERO_BASED" | "MATCH_INITIAL_PTS"
object DashIsoPtsOffsetHandlingForBFrames {
  val ZERO_BASED: "ZERO_BASED" = "ZERO_BASED"
  val MATCH_INITIAL_PTS: "MATCH_INITIAL_PTS" = "MATCH_INITIAL_PTS"

  @inline def values = js.Array[DashIsoPtsOffsetHandlingForBFrames](ZERO_BASED, MATCH_INITIAL_PTS)
}

/** When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
  */
type DashIsoSegmentControl = "SINGLE_FILE" | "SEGMENTED_FILES"
object DashIsoSegmentControl {
  val SINGLE_FILE: "SINGLE_FILE" = "SINGLE_FILE"
  val SEGMENTED_FILES: "SEGMENTED_FILES" = "SEGMENTED_FILES"

  @inline def values = js.Array[DashIsoSegmentControl](SINGLE_FILE, SEGMENTED_FILES)
}

/** When you enable Precise segment duration in manifests (writeSegmentTimelineInRepresentation), your DASH manifest shows precise segment durations. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your DASH manifest are approximate. The segment duration information appears in the duration attribute of the SegmentTemplate element.
  */
type DashIsoWriteSegmentTimelineInRepresentation = "ENABLED" | "DISABLED"
object DashIsoWriteSegmentTimelineInRepresentation {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[DashIsoWriteSegmentTimelineInRepresentation](ENABLED, DISABLED)
}

/** Specify the encryption mode that you used to encrypt your input files.
  */
type DecryptionMode = "AES_CTR" | "AES_CBC" | "AES_GCM"
object DecryptionMode {
  val AES_CTR: "AES_CTR" = "AES_CTR"
  val AES_CBC: "AES_CBC" = "AES_CBC"
  val AES_GCM: "AES_GCM" = "AES_GCM"

  @inline def values = js.Array[DecryptionMode](AES_CTR, AES_CBC, AES_GCM)
}

/** Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace (DEINTERLACE) or Adaptive (ADAPTIVE). Motion adaptive interpolate (INTERPOLATE) produces sharper pictures, while blend (BLEND) produces smoother motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source file includes a ticker, such as a scrolling headline at the bottom of the frame.
  */
type DeinterlaceAlgorithm = "INTERPOLATE" | "INTERPOLATE_TICKER" | "BLEND" | "BLEND_TICKER"
object DeinterlaceAlgorithm {
  val INTERPOLATE: "INTERPOLATE" = "INTERPOLATE"
  val INTERPOLATE_TICKER: "INTERPOLATE_TICKER" = "INTERPOLATE_TICKER"
  val BLEND: "BLEND" = "BLEND"
  val BLEND_TICKER: "BLEND_TICKER" = "BLEND_TICKER"

  @inline def values = js.Array[DeinterlaceAlgorithm](INTERPOLATE, INTERPOLATE_TICKER, BLEND, BLEND_TICKER)
}

/**   - When set to NORMAL (default), the deinterlacer does not convert frames that are tagged in metadata as progressive. It will only convert those that are tagged as some other type. - When set to FORCE_ALL_FRAMES, the deinterlacer converts every frame to progressive - even those that are already tagged as progressive. Turn Force mode on only if there is a good chance that the metadata has tagged frames as progressive when they are not progressive. Do not turn on otherwise; processing frames that are already progressive into progressive will probably result in lower quality video.
  */
type DeinterlacerControl = "FORCE_ALL_FRAMES" | "NORMAL"
object DeinterlacerControl {
  val FORCE_ALL_FRAMES: "FORCE_ALL_FRAMES" = "FORCE_ALL_FRAMES"
  val NORMAL: "NORMAL" = "NORMAL"

  @inline def values = js.Array[DeinterlacerControl](FORCE_ALL_FRAMES, NORMAL)
}

/** Use Deinterlacer (DeinterlaceMode) to choose how the service will do deinterlacing. Default is Deinterlace. - Deinterlace converts interlaced to progressive. - Inverse telecine converts Hard Telecine 29.97i to progressive 23.976p. - Adaptive auto-detects and converts to progressive.
  */
type DeinterlacerMode = "DEINTERLACE" | "INVERSE_TELECINE" | "ADAPTIVE"
object DeinterlacerMode {
  val DEINTERLACE: "DEINTERLACE" = "DEINTERLACE"
  val INVERSE_TELECINE: "INVERSE_TELECINE" = "INVERSE_TELECINE"
  val ADAPTIVE: "ADAPTIVE" = "ADAPTIVE"

  @inline def values = js.Array[DeinterlacerMode](DEINTERLACE, INVERSE_TELECINE, ADAPTIVE)
}

/** Optional field, defaults to DEFAULT. Specify DEFAULT for this operation to return your endpoints if any exist, or to create an endpoint for you and return it if one doesn't already exist. Specify GET_ONLY to return your endpoints if any exist, or an empty list if none exist.
  */
type DescribeEndpointsMode = "DEFAULT" | "GET_ONLY"
object DescribeEndpointsMode {
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val GET_ONLY: "GET_ONLY" = "GET_ONLY"

  @inline def values = js.Array[DescribeEndpointsMode](DEFAULT, GET_ONLY)
}

/** Use Dolby Vision Mode to choose how the service will handle Dolby Vision MaxCLL and MaxFALL properies.
  */
type DolbyVisionLevel6Mode = "PASSTHROUGH" | "RECALCULATE" | "SPECIFY"
object DolbyVisionLevel6Mode {
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"
  val RECALCULATE: "RECALCULATE" = "RECALCULATE"
  val SPECIFY: "SPECIFY" = "SPECIFY"

  @inline def values = js.Array[DolbyVisionLevel6Mode](PASSTHROUGH, RECALCULATE, SPECIFY)
}

/** In the current MediaConvert implementation, the Dolby Vision profile is always 5 (PROFILE_5). Therefore, all of your inputs must contain Dolby Vision frame interleaved data.
  */
type DolbyVisionProfile = "PROFILE_5"
object DolbyVisionProfile {
  val PROFILE_5: "PROFILE_5" = "PROFILE_5"

  @inline def values = js.Array[DolbyVisionProfile](PROFILE_5)
}

/** Applies only to 29.97 fps outputs. When this feature is enabled, the service will use drop-frame timecode on outputs. If it is not possible to use drop-frame timecode, the system will fall back to non-drop-frame. This setting is enabled by default when Timecode insertion (TimecodeInsertion) is enabled.
  */
type DropFrameTimecode = "DISABLED" | "ENABLED"
object DropFrameTimecode {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[DropFrameTimecode](DISABLED, ENABLED)
}

/** If no explicit x_position or y_position is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
  */
type DvbSubtitleAlignment = "CENTERED" | "LEFT"
object DvbSubtitleAlignment {
  val CENTERED: "CENTERED" = "CENTERED"
  val LEFT: "LEFT" = "LEFT"

  @inline def values = js.Array[DvbSubtitleAlignment](CENTERED, LEFT)
}

/** Specifies the color of the rectangle behind the captions. All burn-in and DVB-Sub font settings must match.
  */
type DvbSubtitleBackgroundColor = "NONE" | "BLACK" | "WHITE"
object DvbSubtitleBackgroundColor {
  val NONE: "NONE" = "NONE"
  val BLACK: "BLACK" = "BLACK"
  val WHITE: "WHITE" = "WHITE"

  @inline def values = js.Array[DvbSubtitleBackgroundColor](NONE, BLACK, WHITE)
}

/** Specifies the color of the burned-in captions. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
  */
type DvbSubtitleFontColor = "WHITE" | "BLACK" | "YELLOW" | "RED" | "GREEN" | "BLUE"
object DvbSubtitleFontColor {
  val WHITE: "WHITE" = "WHITE"
  val BLACK: "BLACK" = "BLACK"
  val YELLOW: "YELLOW" = "YELLOW"
  val RED: "RED" = "RED"
  val GREEN: "GREEN" = "GREEN"
  val BLUE: "BLUE" = "BLUE"

  @inline def values = js.Array[DvbSubtitleFontColor](WHITE, BLACK, YELLOW, RED, GREEN, BLUE)
}

/** Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
  */
type DvbSubtitleOutlineColor = "BLACK" | "WHITE" | "YELLOW" | "RED" | "GREEN" | "BLUE"
object DvbSubtitleOutlineColor {
  val BLACK: "BLACK" = "BLACK"
  val WHITE: "WHITE" = "WHITE"
  val YELLOW: "YELLOW" = "YELLOW"
  val RED: "RED" = "RED"
  val GREEN: "GREEN" = "GREEN"
  val BLUE: "BLUE" = "BLUE"

  @inline def values = js.Array[DvbSubtitleOutlineColor](BLACK, WHITE, YELLOW, RED, GREEN, BLUE)
}

/** Specifies the color of the shadow cast by the captions. All burn-in and DVB-Sub font settings must match.
  */
type DvbSubtitleShadowColor = "NONE" | "BLACK" | "WHITE"
object DvbSubtitleShadowColor {
  val NONE: "NONE" = "NONE"
  val BLACK: "BLACK" = "BLACK"
  val WHITE: "WHITE" = "WHITE"

  @inline def values = js.Array[DvbSubtitleShadowColor](NONE, BLACK, WHITE)
}

/** Only applies to jobs with input captions in Teletext or STL formats. Specify whether the spacing between letters in your captions is set by the captions grid or varies depending on letter width. Choose fixed grid to conform to the spacing specified in the captions file more accurately. Choose proportional to make the text easier to read if the captions are closed caption.
  */
type DvbSubtitleTeletextSpacing = "FIXED_GRID" | "PROPORTIONAL"
object DvbSubtitleTeletextSpacing {
  val FIXED_GRID: "FIXED_GRID" = "FIXED_GRID"
  val PROPORTIONAL: "PROPORTIONAL" = "PROPORTIONAL"

  @inline def values = js.Array[DvbSubtitleTeletextSpacing](FIXED_GRID, PROPORTIONAL)
}

/** Specify whether your DVB subtitles are standard or for hearing impaired. Choose hearing impaired if your subtitles include audio descriptions and dialogue. Choose standard if your subtitles include only dialogue.
  */
type DvbSubtitlingType = "HEARING_IMPAIRED" | "STANDARD"
object DvbSubtitlingType {
  val HEARING_IMPAIRED: "HEARING_IMPAIRED" = "HEARING_IMPAIRED"
  val STANDARD: "STANDARD" = "STANDARD"

  @inline def values = js.Array[DvbSubtitlingType](HEARING_IMPAIRED, STANDARD)
}

/** Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
  */
type Eac3AtmosBitstreamMode = "COMPLETE_MAIN"
object Eac3AtmosBitstreamMode {
  val COMPLETE_MAIN: "COMPLETE_MAIN" = "COMPLETE_MAIN"

  @inline def values = js.Array[Eac3AtmosBitstreamMode](COMPLETE_MAIN)
}

/** The coding mode for Dolby Digital Plus JOC (Atmos) is always 9.1.6 (CODING_MODE_9_1_6).
  */
type Eac3AtmosCodingMode = "CODING_MODE_9_1_6"
object Eac3AtmosCodingMode {
  val CODING_MODE_9_1_6: "CODING_MODE_9_1_6" = "CODING_MODE_9_1_6"

  @inline def values = js.Array[Eac3AtmosCodingMode](CODING_MODE_9_1_6)
}

/** Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue analysis.
  */
type Eac3AtmosDialogueIntelligence = "ENABLED" | "DISABLED"
object Eac3AtmosDialogueIntelligence {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[Eac3AtmosDialogueIntelligence](ENABLED, DISABLED)
}

/** Specify the absolute peak level for a signal with dynamic range compression.
  */
type Eac3AtmosDynamicRangeCompressionLine = "NONE" | "FILM_STANDARD" | "FILM_LIGHT" | "MUSIC_STANDARD" | "MUSIC_LIGHT" | "SPEECH"
object Eac3AtmosDynamicRangeCompressionLine {
  val NONE: "NONE" = "NONE"
  val FILM_STANDARD: "FILM_STANDARD" = "FILM_STANDARD"
  val FILM_LIGHT: "FILM_LIGHT" = "FILM_LIGHT"
  val MUSIC_STANDARD: "MUSIC_STANDARD" = "MUSIC_STANDARD"
  val MUSIC_LIGHT: "MUSIC_LIGHT" = "MUSIC_LIGHT"
  val SPEECH: "SPEECH" = "SPEECH"

  @inline def values = js.Array[Eac3AtmosDynamicRangeCompressionLine](NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH)
}

/** Specify how the service limits the audio dynamic range when compressing the audio.
  */
type Eac3AtmosDynamicRangeCompressionRf = "NONE" | "FILM_STANDARD" | "FILM_LIGHT" | "MUSIC_STANDARD" | "MUSIC_LIGHT" | "SPEECH"
object Eac3AtmosDynamicRangeCompressionRf {
  val NONE: "NONE" = "NONE"
  val FILM_STANDARD: "FILM_STANDARD" = "FILM_STANDARD"
  val FILM_LIGHT: "FILM_LIGHT" = "FILM_LIGHT"
  val MUSIC_STANDARD: "MUSIC_STANDARD" = "MUSIC_STANDARD"
  val MUSIC_LIGHT: "MUSIC_LIGHT" = "MUSIC_LIGHT"
  val SPEECH: "SPEECH" = "SPEECH"

  @inline def values = js.Array[Eac3AtmosDynamicRangeCompressionRf](NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH)
}

/** Choose how the service meters the loudness of your audio.
  */
type Eac3AtmosMeteringMode = "LEQ_A" | "ITU_BS_1770_1" | "ITU_BS_1770_2" | "ITU_BS_1770_3" | "ITU_BS_1770_4"
object Eac3AtmosMeteringMode {
  val LEQ_A: "LEQ_A" = "LEQ_A"
  val ITU_BS_1770_1: "ITU_BS_1770_1" = "ITU_BS_1770_1"
  val ITU_BS_1770_2: "ITU_BS_1770_2" = "ITU_BS_1770_2"
  val ITU_BS_1770_3: "ITU_BS_1770_3" = "ITU_BS_1770_3"
  val ITU_BS_1770_4: "ITU_BS_1770_4" = "ITU_BS_1770_4"

  @inline def values = js.Array[Eac3AtmosMeteringMode](LEQ_A, ITU_BS_1770_1, ITU_BS_1770_2, ITU_BS_1770_3, ITU_BS_1770_4)
}

/** Choose how the service does stereo downmixing.
  */
type Eac3AtmosStereoDownmix = "NOT_INDICATED" | "STEREO" | "SURROUND" | "DPL2"
object Eac3AtmosStereoDownmix {
  val NOT_INDICATED: "NOT_INDICATED" = "NOT_INDICATED"
  val STEREO: "STEREO" = "STEREO"
  val SURROUND: "SURROUND" = "SURROUND"
  val DPL2: "DPL2" = "DPL2"

  @inline def values = js.Array[Eac3AtmosStereoDownmix](NOT_INDICATED, STEREO, SURROUND, DPL2)
}

/** Specify whether your input audio has an additional center rear surround channel matrix encoded into your left and right surround channels.
  */
type Eac3AtmosSurroundExMode = "NOT_INDICATED" | "ENABLED" | "DISABLED"
object Eac3AtmosSurroundExMode {
  val NOT_INDICATED: "NOT_INDICATED" = "NOT_INDICATED"
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[Eac3AtmosSurroundExMode](NOT_INDICATED, ENABLED, DISABLED)
}

/** If set to ATTENUATE_3_DB, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode.
  */
type Eac3AttenuationControl = "ATTENUATE_3_DB" | "NONE"
object Eac3AttenuationControl {
  val ATTENUATE_3_DB: "ATTENUATE_3_DB" = "ATTENUATE_3_DB"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[Eac3AttenuationControl](ATTENUATE_3_DB, NONE)
}

/** Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
  */
type Eac3BitstreamMode = "COMPLETE_MAIN" | "COMMENTARY" | "EMERGENCY" | "HEARING_IMPAIRED" | "VISUALLY_IMPAIRED"
object Eac3BitstreamMode {
  val COMPLETE_MAIN: "COMPLETE_MAIN" = "COMPLETE_MAIN"
  val COMMENTARY: "COMMENTARY" = "COMMENTARY"
  val EMERGENCY: "EMERGENCY" = "EMERGENCY"
  val HEARING_IMPAIRED: "HEARING_IMPAIRED" = "HEARING_IMPAIRED"
  val VISUALLY_IMPAIRED: "VISUALLY_IMPAIRED" = "VISUALLY_IMPAIRED"

  @inline def values = js.Array[Eac3BitstreamMode](COMPLETE_MAIN, COMMENTARY, EMERGENCY, HEARING_IMPAIRED, VISUALLY_IMPAIRED)
}

/** Dolby Digital Plus coding mode. Determines number of channels.
  */
type Eac3CodingMode = "CODING_MODE_1_0" | "CODING_MODE_2_0" | "CODING_MODE_3_2"
object Eac3CodingMode {
  val CODING_MODE_1_0: "CODING_MODE_1_0" = "CODING_MODE_1_0"
  val CODING_MODE_2_0: "CODING_MODE_2_0" = "CODING_MODE_2_0"
  val CODING_MODE_3_2: "CODING_MODE_3_2" = "CODING_MODE_3_2"

  @inline def values = js.Array[Eac3CodingMode](CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_3_2)
}

/** Activates a DC highpass filter for all input channels.
  */
type Eac3DcFilter = "ENABLED" | "DISABLED"
object Eac3DcFilter {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[Eac3DcFilter](ENABLED, DISABLED)
}

/** Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the Dolby Digital stream for the line operating mode. Related setting: When you use this setting, MediaConvert ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
  */
type Eac3DynamicRangeCompressionLine = "NONE" | "FILM_STANDARD" | "FILM_LIGHT" | "MUSIC_STANDARD" | "MUSIC_LIGHT" | "SPEECH"
object Eac3DynamicRangeCompressionLine {
  val NONE: "NONE" = "NONE"
  val FILM_STANDARD: "FILM_STANDARD" = "FILM_STANDARD"
  val FILM_LIGHT: "FILM_LIGHT" = "FILM_LIGHT"
  val MUSIC_STANDARD: "MUSIC_STANDARD" = "MUSIC_STANDARD"
  val MUSIC_LIGHT: "MUSIC_LIGHT" = "MUSIC_LIGHT"
  val SPEECH: "SPEECH" = "SPEECH"

  @inline def values = js.Array[Eac3DynamicRangeCompressionLine](NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH)
}

/** Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the Dolby Digital stream for the RF operating mode. Related setting: When you use this setting, MediaConvert ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
  */
type Eac3DynamicRangeCompressionRf = "NONE" | "FILM_STANDARD" | "FILM_LIGHT" | "MUSIC_STANDARD" | "MUSIC_LIGHT" | "SPEECH"
object Eac3DynamicRangeCompressionRf {
  val NONE: "NONE" = "NONE"
  val FILM_STANDARD: "FILM_STANDARD" = "FILM_STANDARD"
  val FILM_LIGHT: "FILM_LIGHT" = "FILM_LIGHT"
  val MUSIC_STANDARD: "MUSIC_STANDARD" = "MUSIC_STANDARD"
  val MUSIC_LIGHT: "MUSIC_LIGHT" = "MUSIC_LIGHT"
  val SPEECH: "SPEECH" = "SPEECH"

  @inline def values = js.Array[Eac3DynamicRangeCompressionRf](NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH)
}

/** When encoding 3/2 audio, controls whether the LFE channel is enabled
  */
type Eac3LfeControl = "LFE" | "NO_LFE"
object Eac3LfeControl {
  val LFE: "LFE" = "LFE"
  val NO_LFE: "NO_LFE" = "NO_LFE"

  @inline def values = js.Array[Eac3LfeControl](LFE, NO_LFE)
}

/** Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
  */
type Eac3LfeFilter = "ENABLED" | "DISABLED"
object Eac3LfeFilter {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[Eac3LfeFilter](ENABLED, DISABLED)
}

/** When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
  */
type Eac3MetadataControl = "FOLLOW_INPUT" | "USE_CONFIGURED"
object Eac3MetadataControl {
  val FOLLOW_INPUT: "FOLLOW_INPUT" = "FOLLOW_INPUT"
  val USE_CONFIGURED: "USE_CONFIGURED" = "USE_CONFIGURED"

  @inline def values = js.Array[Eac3MetadataControl](FOLLOW_INPUT, USE_CONFIGURED)
}

/** When set to WHEN_POSSIBLE, input DD+ audio will be passed through if it is present on the input. this detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a consistent DD+ output as the system alternates between passthrough and encoding.
  */
type Eac3PassthroughControl = "WHEN_POSSIBLE" | "NO_PASSTHROUGH"
object Eac3PassthroughControl {
  val WHEN_POSSIBLE: "WHEN_POSSIBLE" = "WHEN_POSSIBLE"
  val NO_PASSTHROUGH: "NO_PASSTHROUGH" = "NO_PASSTHROUGH"

  @inline def values = js.Array[Eac3PassthroughControl](WHEN_POSSIBLE, NO_PASSTHROUGH)
}

/** Controls the amount of phase-shift applied to the surround channels. Only used for 3/2 coding mode.
  */
type Eac3PhaseControl = "SHIFT_90_DEGREES" | "NO_SHIFT"
object Eac3PhaseControl {
  val SHIFT_90_DEGREES: "SHIFT_90_DEGREES" = "SHIFT_90_DEGREES"
  val NO_SHIFT: "NO_SHIFT" = "NO_SHIFT"

  @inline def values = js.Array[Eac3PhaseControl](SHIFT_90_DEGREES, NO_SHIFT)
}

/** Choose how the service does stereo downmixing. This setting only applies if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Stereo downmix (Eac3StereoDownmix).
  */
type Eac3StereoDownmix = "NOT_INDICATED" | "LO_RO" | "LT_RT" | "DPL2"
object Eac3StereoDownmix {
  val NOT_INDICATED: "NOT_INDICATED" = "NOT_INDICATED"
  val LO_RO: "LO_RO" = "LO_RO"
  val LT_RT: "LT_RT" = "LT_RT"
  val DPL2: "DPL2" = "DPL2"

  @inline def values = js.Array[Eac3StereoDownmix](NOT_INDICATED, LO_RO, LT_RT, DPL2)
}

/** When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the left and right surround channels.
  */
type Eac3SurroundExMode = "NOT_INDICATED" | "ENABLED" | "DISABLED"
object Eac3SurroundExMode {
  val NOT_INDICATED: "NOT_INDICATED" = "NOT_INDICATED"
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[Eac3SurroundExMode](NOT_INDICATED, ENABLED, DISABLED)
}

/** When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels.
  */
type Eac3SurroundMode = "NOT_INDICATED" | "ENABLED" | "DISABLED"
object Eac3SurroundMode {
  val NOT_INDICATED: "NOT_INDICATED" = "NOT_INDICATED"
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[Eac3SurroundMode](NOT_INDICATED, ENABLED, DISABLED)
}

/** Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
  */
type EmbeddedConvert608To708 = "UPCONVERT" | "DISABLED"
object EmbeddedConvert608To708 {
  val UPCONVERT: "UPCONVERT" = "UPCONVERT"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[EmbeddedConvert608To708](UPCONVERT, DISABLED)
}

/** By default, the service terminates any unterminated captions at the end of each input. If you want the caption to continue onto your next input, disable this setting.
  */
type EmbeddedTerminateCaptions = "END_OF_INPUT" | "DISABLED"
object EmbeddedTerminateCaptions {
  val END_OF_INPUT: "END_OF_INPUT" = "END_OF_INPUT"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[EmbeddedTerminateCaptions](END_OF_INPUT, DISABLED)
}

/** If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
  */
type F4vMoovPlacement = "PROGRESSIVE_DOWNLOAD" | "NORMAL"
object F4vMoovPlacement {
  val PROGRESSIVE_DOWNLOAD: "PROGRESSIVE_DOWNLOAD" = "PROGRESSIVE_DOWNLOAD"
  val NORMAL: "NORMAL" = "NORMAL"

  @inline def values = js.Array[F4vMoovPlacement](PROGRESSIVE_DOWNLOAD, NORMAL)
}

/** Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
  */
type FileSourceConvert608To708 = "UPCONVERT" | "DISABLED"
object FileSourceConvert608To708 {
  val UPCONVERT: "UPCONVERT" = "UPCONVERT"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[FileSourceConvert608To708](UPCONVERT, DISABLED)
}

/** Provide the font script, using an ISO 15924 script code, if the LanguageCode is not sufficient for determining the script type. Where LanguageCode or CustomLanguageCode is sufficient, use "AUTOMATIC" or leave unset.
  */
type FontScript = "AUTOMATIC" | "HANS" | "HANT"
object FontScript {
  val AUTOMATIC: "AUTOMATIC" = "AUTOMATIC"
  val HANS: "HANS" = "HANS"
  val HANT: "HANT" = "HANT"

  @inline def values = js.Array[FontScript](AUTOMATIC, HANS, HANT)
}

/** Keep the default value, Auto (AUTO), for this setting to have MediaConvert automatically apply the best types of quantization for your video content. When you want to apply your quantization settings manually, you must set H264AdaptiveQuantization to a value other than Auto (AUTO). Use this setting to specify the strength of any adaptive quantization filters that you enable. If you don't want MediaConvert to do any adaptive quantization in this transcode, set Adaptive quantization (H264AdaptiveQuantization) to Off (OFF). Related settings: The value that you choose here applies to the following settings: H264FlickerAdaptiveQuantization, H264SpatialAdaptiveQuantization, and H264TemporalAdaptiveQuantization.
  */
type H264AdaptiveQuantization = "OFF" | "AUTO" | "LOW" | "MEDIUM" | "HIGH" | "HIGHER" | "MAX"
object H264AdaptiveQuantization {
  val OFF: "OFF" = "OFF"
  val AUTO: "AUTO" = "AUTO"
  val LOW: "LOW" = "LOW"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val HIGH: "HIGH" = "HIGH"
  val HIGHER: "HIGHER" = "HIGHER"
  val MAX: "MAX" = "MAX"

  @inline def values = js.Array[H264AdaptiveQuantization](OFF, AUTO, LOW, MEDIUM, HIGH, HIGHER, MAX)
}

/** Specify an H.264 level that is consistent with your output video settings. If you aren't sure what level to specify, choose Auto (AUTO).
  */
type H264CodecLevel = "AUTO" | "LEVEL_1" | "LEVEL_1_1" | "LEVEL_1_2" | "LEVEL_1_3" | "LEVEL_2" | "LEVEL_2_1" | "LEVEL_2_2" | "LEVEL_3" | "LEVEL_3_1" | "LEVEL_3_2" | "LEVEL_4" | "LEVEL_4_1" | "LEVEL_4_2" | "LEVEL_5" | "LEVEL_5_1" | "LEVEL_5_2"
object H264CodecLevel {
  val AUTO: "AUTO" = "AUTO"
  val LEVEL_1: "LEVEL_1" = "LEVEL_1"
  val LEVEL_1_1: "LEVEL_1_1" = "LEVEL_1_1"
  val LEVEL_1_2: "LEVEL_1_2" = "LEVEL_1_2"
  val LEVEL_1_3: "LEVEL_1_3" = "LEVEL_1_3"
  val LEVEL_2: "LEVEL_2" = "LEVEL_2"
  val LEVEL_2_1: "LEVEL_2_1" = "LEVEL_2_1"
  val LEVEL_2_2: "LEVEL_2_2" = "LEVEL_2_2"
  val LEVEL_3: "LEVEL_3" = "LEVEL_3"
  val LEVEL_3_1: "LEVEL_3_1" = "LEVEL_3_1"
  val LEVEL_3_2: "LEVEL_3_2" = "LEVEL_3_2"
  val LEVEL_4: "LEVEL_4" = "LEVEL_4"
  val LEVEL_4_1: "LEVEL_4_1" = "LEVEL_4_1"
  val LEVEL_4_2: "LEVEL_4_2" = "LEVEL_4_2"
  val LEVEL_5: "LEVEL_5" = "LEVEL_5"
  val LEVEL_5_1: "LEVEL_5_1" = "LEVEL_5_1"
  val LEVEL_5_2: "LEVEL_5_2" = "LEVEL_5_2"

  @inline def values = js.Array[H264CodecLevel](
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
  val BASELINE: "BASELINE" = "BASELINE"
  val HIGH: "HIGH" = "HIGH"
  val HIGH_10BIT: "HIGH_10BIT" = "HIGH_10BIT"
  val HIGH_422: "HIGH_422" = "HIGH_422"
  val HIGH_422_10BIT: "HIGH_422_10BIT" = "HIGH_422_10BIT"
  val MAIN: "MAIN" = "MAIN"

  @inline def values = js.Array[H264CodecProfile](BASELINE, HIGH, HIGH_10BIT, HIGH_422, HIGH_422_10BIT, MAIN)
}

/** Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
  */
type H264DynamicSubGop = "ADAPTIVE" | "STATIC"
object H264DynamicSubGop {
  val ADAPTIVE: "ADAPTIVE" = "ADAPTIVE"
  val STATIC: "STATIC" = "STATIC"

  @inline def values = js.Array[H264DynamicSubGop](ADAPTIVE, STATIC)
}

/** Entropy encoding mode. Use CABAC (must be in Main or High profile) or CAVLC.
  */
type H264EntropyEncoding = "CABAC" | "CAVLC"
object H264EntropyEncoding {
  val CABAC: "CABAC" = "CABAC"
  val CAVLC: "CAVLC" = "CAVLC"

  @inline def values = js.Array[H264EntropyEncoding](CABAC, CAVLC)
}

/** Keep the default value, PAFF, to have MediaConvert use PAFF encoding for interlaced outputs. Choose Force field (FORCE_FIELD) to disable PAFF encoding and create separate interlaced fields.
  */
type H264FieldEncoding = "PAFF" | "FORCE_FIELD"
object H264FieldEncoding {
  val PAFF: "PAFF" = "PAFF"
  val FORCE_FIELD: "FORCE_FIELD" = "FORCE_FIELD"

  @inline def values = js.Array[H264FieldEncoding](PAFF, FORCE_FIELD)
}

/** Only use this setting when you change the default value, AUTO, for the setting H264AdaptiveQuantization. When you keep all defaults, excluding H264AdaptiveQuantization and all other adaptive quantization from your JSON job specification, MediaConvert automatically applies the best types of quantization for your video content. When you set H264AdaptiveQuantization to a value other than AUTO, the default value for H264FlickerAdaptiveQuantization is Disabled (DISABLED). Change this value to Enabled (ENABLED) to reduce I-frame pop. I-frame pop appears as a visual flicker that can arise when the encoder saves bits by copying some macroblocks many times from frame to frame, and then refreshes them at the I-frame. When you enable this setting, the encoder updates these macroblocks slightly more often to smooth out the flicker. To manually enable or disable H264FlickerAdaptiveQuantization, you must set Adaptive quantization (H264AdaptiveQuantization) to a value other than AUTO.
  */
type H264FlickerAdaptiveQuantization = "DISABLED" | "ENABLED"
object H264FlickerAdaptiveQuantization {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H264FlickerAdaptiveQuantization](DISABLED, ENABLED)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
type H264FramerateControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object H264FramerateControl {
  val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  @inline def values = js.Array[H264FramerateControl](INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
type H264FramerateConversionAlgorithm = "DUPLICATE_DROP" | "INTERPOLATE" | "FRAMEFORMER"
object H264FramerateConversionAlgorithm {
  val DUPLICATE_DROP: "DUPLICATE_DROP" = "DUPLICATE_DROP"
  val INTERPOLATE: "INTERPOLATE" = "INTERPOLATE"
  val FRAMEFORMER: "FRAMEFORMER" = "FRAMEFORMER"

  @inline def values = js.Array[H264FramerateConversionAlgorithm](DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** If enable, use reference B frames for GOP structures that have B frames > 1.
  */
type H264GopBReference = "DISABLED" | "ENABLED"
object H264GopBReference {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H264GopBReference](DISABLED, ENABLED)
}

/** Indicates if the GOP Size in H264 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
  */
type H264GopSizeUnits = "FRAMES" | "SECONDS"
object H264GopSizeUnits {
  val FRAMES: "FRAMES" = "FRAMES"
  val SECONDS: "SECONDS" = "SECONDS"

  @inline def values = js.Array[H264GopSizeUnits](FRAMES, SECONDS)
}

/** Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
  */
type H264InterlaceMode = "PROGRESSIVE" | "TOP_FIELD" | "BOTTOM_FIELD" | "FOLLOW_TOP_FIELD" | "FOLLOW_BOTTOM_FIELD"
object H264InterlaceMode {
  val PROGRESSIVE: "PROGRESSIVE" = "PROGRESSIVE"
  val TOP_FIELD: "TOP_FIELD" = "TOP_FIELD"
  val BOTTOM_FIELD: "BOTTOM_FIELD" = "BOTTOM_FIELD"
  val FOLLOW_TOP_FIELD: "FOLLOW_TOP_FIELD" = "FOLLOW_TOP_FIELD"
  val FOLLOW_BOTTOM_FIELD: "FOLLOW_BOTTOM_FIELD" = "FOLLOW_BOTTOM_FIELD"

  @inline def values = js.Array[H264InterlaceMode](PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD)
}

/** Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
  */
type H264ParControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object H264ParControl {
  val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  @inline def values = js.Array[H264ParControl](INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, single-pass encoding.
  */
type H264QualityTuningLevel = "SINGLE_PASS" | "SINGLE_PASS_HQ" | "MULTI_PASS_HQ"
object H264QualityTuningLevel {
  val SINGLE_PASS: "SINGLE_PASS" = "SINGLE_PASS"
  val SINGLE_PASS_HQ: "SINGLE_PASS_HQ" = "SINGLE_PASS_HQ"
  val MULTI_PASS_HQ: "MULTI_PASS_HQ" = "MULTI_PASS_HQ"

  @inline def values = js.Array[H264QualityTuningLevel](SINGLE_PASS, SINGLE_PASS_HQ, MULTI_PASS_HQ)
}

/** Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
  */
type H264RateControlMode = "VBR" | "CBR" | "QVBR"
object H264RateControlMode {
  val VBR: "VBR" = "VBR"
  val CBR: "CBR" = "CBR"
  val QVBR: "QVBR" = "QVBR"

  @inline def values = js.Array[H264RateControlMode](VBR, CBR, QVBR)
}

/** Places a PPS header on each encoded picture, even if repeated.
  */
type H264RepeatPps = "DISABLED" | "ENABLED"
object H264RepeatPps {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H264RepeatPps](DISABLED, ENABLED)
}

/** Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
  */
type H264ScanTypeConversionMode = "INTERLACED" | "INTERLACED_OPTIMIZE"
object H264ScanTypeConversionMode {
  val INTERLACED: "INTERLACED" = "INTERLACED"
  val INTERLACED_OPTIMIZE: "INTERLACED_OPTIMIZE" = "INTERLACED_OPTIMIZE"

  @inline def values = js.Array[H264ScanTypeConversionMode](INTERLACED, INTERLACED_OPTIMIZE)
}

/** Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default. If this output uses QVBR, choose Transition detection (TRANSITION_DETECTION) for further video quality improvement. For more information about QVBR, see https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
  */
type H264SceneChangeDetect = "DISABLED" | "ENABLED" | "TRANSITION_DETECTION"
object H264SceneChangeDetect {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"
  val TRANSITION_DETECTION: "TRANSITION_DETECTION" = "TRANSITION_DETECTION"

  @inline def values = js.Array[H264SceneChangeDetect](DISABLED, ENABLED, TRANSITION_DETECTION)
}

/** Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
  */
type H264SlowPal = "DISABLED" | "ENABLED"
object H264SlowPal {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H264SlowPal](DISABLED, ENABLED)
}

/** Only use this setting when you change the default value, Auto (AUTO), for the setting H264AdaptiveQuantization. When you keep all defaults, excluding H264AdaptiveQuantization and all other adaptive quantization from your JSON job specification, MediaConvert automatically applies the best types of quantization for your video content. When you set H264AdaptiveQuantization to a value other than AUTO, the default value for H264SpatialAdaptiveQuantization is Enabled (ENABLED). Keep this default value to adjust quantization within each frame based on spatial variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your video quality.
  * Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture, you might choose to set H264SpatialAdaptiveQuantization to Disabled (DISABLED). Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization (H264AdaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video games, set it to Low. For content with a wider variety of textures, set it to High or Higher. To manually enable or disable H264SpatialAdaptiveQuantization, you must set Adaptive quantization (H264AdaptiveQuantization) to a value other than AUTO.
  */
type H264SpatialAdaptiveQuantization = "DISABLED" | "ENABLED"
object H264SpatialAdaptiveQuantization {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H264SpatialAdaptiveQuantization](DISABLED, ENABLED)
}

/** Produces a bitstream compliant with SMPTE RP-2027.
  */
type H264Syntax = "DEFAULT" | "RP2027"
object H264Syntax {
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val RP2027: "RP2027" = "RP2027"

  @inline def values = js.Array[H264Syntax](DEFAULT, RP2027)
}

/** When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is interlaced, you can optionally enable hard or soft telecine to create a smoother picture. Hard telecine (HARD) produces a 29.97i output. Soft telecine (SOFT) produces an output with a 23.976 output that signals to the video player device to do the conversion during play back. When you keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother picture.
  */
type H264Telecine = "NONE" | "SOFT" | "HARD"
object H264Telecine {
  val NONE: "NONE" = "NONE"
  val SOFT: "SOFT" = "SOFT"
  val HARD: "HARD" = "HARD"

  @inline def values = js.Array[H264Telecine](NONE, SOFT, HARD)
}

/** Only use this setting when you change the default value, AUTO, for the setting H264AdaptiveQuantization. When you keep all defaults, excluding H264AdaptiveQuantization and all other adaptive quantization from your JSON job specification, MediaConvert automatically applies the best types of quantization for your video content. When you set H264AdaptiveQuantization to a value other than AUTO, the default value for H264TemporalAdaptiveQuantization is Enabled (ENABLED). Keep this default value to adjust quantization within each frame based on temporal variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that aren't moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into
  * account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen that doesn't have moving objects with sharp edges, such as sports athletes' faces, you might choose to set H264TemporalAdaptiveQuantization to Disabled (DISABLED). Related setting: When you enable temporal quantization, adjust the strength of the filter with the setting Adaptive quantization (adaptiveQuantization). To manually enable or disable H264TemporalAdaptiveQuantization, you must set Adaptive quantization (H264AdaptiveQuantization) to a value other than AUTO.
  */
type H264TemporalAdaptiveQuantization = "DISABLED" | "ENABLED"
object H264TemporalAdaptiveQuantization {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H264TemporalAdaptiveQuantization](DISABLED, ENABLED)
}

/** Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
  */
type H264UnregisteredSeiTimecode = "DISABLED" | "ENABLED"
object H264UnregisteredSeiTimecode {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H264UnregisteredSeiTimecode](DISABLED, ENABLED)
}

/** Specify the strength of any adaptive quantization filters that you enable. The value that you choose here applies to the following settings: Flicker adaptive quantization (flickerAdaptiveQuantization), Spatial adaptive quantization (spatialAdaptiveQuantization), and Temporal adaptive quantization (temporalAdaptiveQuantization).
  */
type H265AdaptiveQuantization = "OFF" | "LOW" | "MEDIUM" | "HIGH" | "HIGHER" | "MAX"
object H265AdaptiveQuantization {
  val OFF: "OFF" = "OFF"
  val LOW: "LOW" = "LOW"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val HIGH: "HIGH" = "HIGH"
  val HIGHER: "HIGHER" = "HIGHER"
  val MAX: "MAX" = "MAX"

  @inline def values = js.Array[H265AdaptiveQuantization](OFF, LOW, MEDIUM, HIGH, HIGHER, MAX)
}

/** Enables Alternate Transfer Function SEI message for outputs using Hybrid Log Gamma (HLG) Electro-Optical Transfer Function (EOTF).
  */
type H265AlternateTransferFunctionSei = "DISABLED" | "ENABLED"
object H265AlternateTransferFunctionSei {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H265AlternateTransferFunctionSei](DISABLED, ENABLED)
}

/** H.265 Level.
  */
type H265CodecLevel = "AUTO" | "LEVEL_1" | "LEVEL_2" | "LEVEL_2_1" | "LEVEL_3" | "LEVEL_3_1" | "LEVEL_4" | "LEVEL_4_1" | "LEVEL_5" | "LEVEL_5_1" | "LEVEL_5_2" | "LEVEL_6" | "LEVEL_6_1" | "LEVEL_6_2"
object H265CodecLevel {
  val AUTO: "AUTO" = "AUTO"
  val LEVEL_1: "LEVEL_1" = "LEVEL_1"
  val LEVEL_2: "LEVEL_2" = "LEVEL_2"
  val LEVEL_2_1: "LEVEL_2_1" = "LEVEL_2_1"
  val LEVEL_3: "LEVEL_3" = "LEVEL_3"
  val LEVEL_3_1: "LEVEL_3_1" = "LEVEL_3_1"
  val LEVEL_4: "LEVEL_4" = "LEVEL_4"
  val LEVEL_4_1: "LEVEL_4_1" = "LEVEL_4_1"
  val LEVEL_5: "LEVEL_5" = "LEVEL_5"
  val LEVEL_5_1: "LEVEL_5_1" = "LEVEL_5_1"
  val LEVEL_5_2: "LEVEL_5_2" = "LEVEL_5_2"
  val LEVEL_6: "LEVEL_6" = "LEVEL_6"
  val LEVEL_6_1: "LEVEL_6_1" = "LEVEL_6_1"
  val LEVEL_6_2: "LEVEL_6_2" = "LEVEL_6_2"

  @inline def values = js.Array[H265CodecLevel](AUTO, LEVEL_1, LEVEL_2, LEVEL_2_1, LEVEL_3, LEVEL_3_1, LEVEL_4, LEVEL_4_1, LEVEL_5, LEVEL_5_1, LEVEL_5_2, LEVEL_6, LEVEL_6_1, LEVEL_6_2)
}

/** Represents the Profile and Tier, per the HEVC (H.265) specification. Selections are grouped as [Profile] / [Tier], so "Main/High" represents Main Profile with High Tier. 4:2:2 profiles are only available with the HEVC 4:2:2 License.
  */
type H265CodecProfile = "MAIN_MAIN" | "MAIN_HIGH" | "MAIN10_MAIN" | "MAIN10_HIGH" | "MAIN_422_8BIT_MAIN" | "MAIN_422_8BIT_HIGH" | "MAIN_422_10BIT_MAIN" | "MAIN_422_10BIT_HIGH"
object H265CodecProfile {
  val MAIN_MAIN: "MAIN_MAIN" = "MAIN_MAIN"
  val MAIN_HIGH: "MAIN_HIGH" = "MAIN_HIGH"
  val MAIN10_MAIN: "MAIN10_MAIN" = "MAIN10_MAIN"
  val MAIN10_HIGH: "MAIN10_HIGH" = "MAIN10_HIGH"
  val MAIN_422_8BIT_MAIN: "MAIN_422_8BIT_MAIN" = "MAIN_422_8BIT_MAIN"
  val MAIN_422_8BIT_HIGH: "MAIN_422_8BIT_HIGH" = "MAIN_422_8BIT_HIGH"
  val MAIN_422_10BIT_MAIN: "MAIN_422_10BIT_MAIN" = "MAIN_422_10BIT_MAIN"
  val MAIN_422_10BIT_HIGH: "MAIN_422_10BIT_HIGH" = "MAIN_422_10BIT_HIGH"

  @inline def values = js.Array[H265CodecProfile](MAIN_MAIN, MAIN_HIGH, MAIN10_MAIN, MAIN10_HIGH, MAIN_422_8BIT_MAIN, MAIN_422_8BIT_HIGH, MAIN_422_10BIT_MAIN, MAIN_422_10BIT_HIGH)
}

/** Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
  */
type H265DynamicSubGop = "ADAPTIVE" | "STATIC"
object H265DynamicSubGop {
  val ADAPTIVE: "ADAPTIVE" = "ADAPTIVE"
  val STATIC: "STATIC" = "STATIC"

  @inline def values = js.Array[H265DynamicSubGop](ADAPTIVE, STATIC)
}

/** Enable this setting to have the encoder reduce I-frame pop. I-frame pop appears as a visual flicker that can arise when the encoder saves bits by copying some macroblocks many times from frame to frame, and then refreshes them at the I-frame. When you enable this setting, the encoder updates these macroblocks slightly more often to smooth out the flicker. This setting is disabled by default. Related setting: In addition to enabling this setting, you must also set adaptiveQuantization to a value other than Off (OFF).
  */
type H265FlickerAdaptiveQuantization = "DISABLED" | "ENABLED"
object H265FlickerAdaptiveQuantization {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H265FlickerAdaptiveQuantization](DISABLED, ENABLED)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
type H265FramerateControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object H265FramerateControl {
  val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  @inline def values = js.Array[H265FramerateControl](INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
type H265FramerateConversionAlgorithm = "DUPLICATE_DROP" | "INTERPOLATE" | "FRAMEFORMER"
object H265FramerateConversionAlgorithm {
  val DUPLICATE_DROP: "DUPLICATE_DROP" = "DUPLICATE_DROP"
  val INTERPOLATE: "INTERPOLATE" = "INTERPOLATE"
  val FRAMEFORMER: "FRAMEFORMER" = "FRAMEFORMER"

  @inline def values = js.Array[H265FramerateConversionAlgorithm](DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** If enable, use reference B frames for GOP structures that have B frames > 1.
  */
type H265GopBReference = "DISABLED" | "ENABLED"
object H265GopBReference {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H265GopBReference](DISABLED, ENABLED)
}

/** Indicates if the GOP Size in H265 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
  */
type H265GopSizeUnits = "FRAMES" | "SECONDS"
object H265GopSizeUnits {
  val FRAMES: "FRAMES" = "FRAMES"
  val SECONDS: "SECONDS" = "SECONDS"

  @inline def values = js.Array[H265GopSizeUnits](FRAMES, SECONDS)
}

/** Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
  */
type H265InterlaceMode = "PROGRESSIVE" | "TOP_FIELD" | "BOTTOM_FIELD" | "FOLLOW_TOP_FIELD" | "FOLLOW_BOTTOM_FIELD"
object H265InterlaceMode {
  val PROGRESSIVE: "PROGRESSIVE" = "PROGRESSIVE"
  val TOP_FIELD: "TOP_FIELD" = "TOP_FIELD"
  val BOTTOM_FIELD: "BOTTOM_FIELD" = "BOTTOM_FIELD"
  val FOLLOW_TOP_FIELD: "FOLLOW_TOP_FIELD" = "FOLLOW_TOP_FIELD"
  val FOLLOW_BOTTOM_FIELD: "FOLLOW_BOTTOM_FIELD" = "FOLLOW_BOTTOM_FIELD"

  @inline def values = js.Array[H265InterlaceMode](PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD)
}

/** Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
  */
type H265ParControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object H265ParControl {
  val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  @inline def values = js.Array[H265ParControl](INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, single-pass encoding.
  */
type H265QualityTuningLevel = "SINGLE_PASS" | "SINGLE_PASS_HQ" | "MULTI_PASS_HQ"
object H265QualityTuningLevel {
  val SINGLE_PASS: "SINGLE_PASS" = "SINGLE_PASS"
  val SINGLE_PASS_HQ: "SINGLE_PASS_HQ" = "SINGLE_PASS_HQ"
  val MULTI_PASS_HQ: "MULTI_PASS_HQ" = "MULTI_PASS_HQ"

  @inline def values = js.Array[H265QualityTuningLevel](SINGLE_PASS, SINGLE_PASS_HQ, MULTI_PASS_HQ)
}

/** Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
  */
type H265RateControlMode = "VBR" | "CBR" | "QVBR"
object H265RateControlMode {
  val VBR: "VBR" = "VBR"
  val CBR: "CBR" = "CBR"
  val QVBR: "QVBR" = "QVBR"

  @inline def values = js.Array[H265RateControlMode](VBR, CBR, QVBR)
}

/** Specify Sample Adaptive Offset (SAO) filter strength. Adaptive mode dynamically selects best strength based on content
  */
type H265SampleAdaptiveOffsetFilterMode = "DEFAULT" | "ADAPTIVE" | "OFF"
object H265SampleAdaptiveOffsetFilterMode {
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val ADAPTIVE: "ADAPTIVE" = "ADAPTIVE"
  val OFF: "OFF" = "OFF"

  @inline def values = js.Array[H265SampleAdaptiveOffsetFilterMode](DEFAULT, ADAPTIVE, OFF)
}

/** Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
  */
type H265ScanTypeConversionMode = "INTERLACED" | "INTERLACED_OPTIMIZE"
object H265ScanTypeConversionMode {
  val INTERLACED: "INTERLACED" = "INTERLACED"
  val INTERLACED_OPTIMIZE: "INTERLACED_OPTIMIZE" = "INTERLACED_OPTIMIZE"

  @inline def values = js.Array[H265ScanTypeConversionMode](INTERLACED, INTERLACED_OPTIMIZE)
}

/** Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default. If this output uses QVBR, choose Transition detection (TRANSITION_DETECTION) for further video quality improvement. For more information about QVBR, see https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
  */
type H265SceneChangeDetect = "DISABLED" | "ENABLED" | "TRANSITION_DETECTION"
object H265SceneChangeDetect {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"
  val TRANSITION_DETECTION: "TRANSITION_DETECTION" = "TRANSITION_DETECTION"

  @inline def values = js.Array[H265SceneChangeDetect](DISABLED, ENABLED, TRANSITION_DETECTION)
}

/** Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
  */
type H265SlowPal = "DISABLED" | "ENABLED"
object H265SlowPal {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H265SlowPal](DISABLED, ENABLED)
}

/** Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture, you might choose to disable this feature. Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video
  * games, set it to Low. For content with a wider variety of textures, set it to High or Higher.
  */
type H265SpatialAdaptiveQuantization = "DISABLED" | "ENABLED"
object H265SpatialAdaptiveQuantization {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H265SpatialAdaptiveQuantization](DISABLED, ENABLED)
}

/** This field applies only if the Streams > Advanced > Framerate (framerate) field is set to 29.970. This field works with the Streams > Advanced > Preprocessors > Deinterlacer field (deinterlace_mode) and the Streams > Advanced > Interlaced Mode field (interlace_mode) to identify the scan type for the output: Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces 23.976; the player converts this output to 29.97i.
  */
type H265Telecine = "NONE" | "SOFT" | "HARD"
object H265Telecine {
  val NONE: "NONE" = "NONE"
  val SOFT: "SOFT" = "SOFT"
  val HARD: "HARD" = "HARD"

  @inline def values = js.Array[H265Telecine](NONE, SOFT, HARD)
}

/** Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on temporal variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that aren't moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen that doesn't have moving objects with sharp edges, such as sports athletes' faces, you might choose to disable this feature. Related setting: When you enable temporal quantization, adjust the strength of the filter with the setting Adaptive quantization (adaptiveQuantization).
  */
type H265TemporalAdaptiveQuantization = "DISABLED" | "ENABLED"
object H265TemporalAdaptiveQuantization {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H265TemporalAdaptiveQuantization](DISABLED, ENABLED)
}

/** Enables temporal layer identifiers in the encoded bitstream. Up to 3 layers are supported depending on GOP structure: I- and P-frames form one layer, reference B-frames can form a second layer and non-reference b-frames can form a third layer. Decoders can optionally decode only the lower temporal layers to generate a lower frame rate output. For example, given a bitstream with temporal IDs and with b-frames = 1 (i.e. IbPbPb display order), a decoder could decode all the frames for full frame rate output or only the I and P frames (lowest temporal layer) for a half frame rate output.
  */
type H265TemporalIds = "DISABLED" | "ENABLED"
object H265TemporalIds {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H265TemporalIds](DISABLED, ENABLED)
}

/** Enable use of tiles, allowing horizontal as well as vertical subdivision of the encoded pictures.
  */
type H265Tiles = "DISABLED" | "ENABLED"
object H265Tiles {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H265Tiles](DISABLED, ENABLED)
}

/** Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
  */
type H265UnregisteredSeiTimecode = "DISABLED" | "ENABLED"
object H265UnregisteredSeiTimecode {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[H265UnregisteredSeiTimecode](DISABLED, ENABLED)
}

/** If the location of parameter set NAL units doesn't matter in your workflow, ignore this setting. Use this setting only with CMAF or DASH outputs, or with standalone file outputs in an MPEG-4 container (MP4 outputs). Choose HVC1 to mark your output as HVC1. This makes your output compliant with the following specification: ISO IECJTC1 SC29 N13798 Text ISO/IEC FDIS 14496-15 3rd Edition. For these outputs, the service stores parameter set NAL units in the sample headers but not in the samples directly. For MP4 outputs, when you choose HVC1, your output video might not work properly with some downstream systems and video players. The service defaults to marking your output as HEV1. For these outputs, the service writes parameter set NAL units directly into the samples.
  */
type H265WriteMp4PackagingType = "HVC1" | "HEV1"
object H265WriteMp4PackagingType {
  val HVC1: "HVC1" = "HVC1"
  val HEV1: "HEV1" = "HEV1"

  @inline def values = js.Array[H265WriteMp4PackagingType](HVC1, HEV1)
}

type HlsAdMarkers = "ELEMENTAL" | "ELEMENTAL_SCTE35"
object HlsAdMarkers {
  val ELEMENTAL: "ELEMENTAL" = "ELEMENTAL"
  val ELEMENTAL_SCTE35: "ELEMENTAL_SCTE35" = "ELEMENTAL_SCTE35"

  @inline def values = js.Array[HlsAdMarkers](ELEMENTAL, ELEMENTAL_SCTE35)
}

/** Use this setting only in audio-only outputs. Choose MPEG-2 Transport Stream (M2TS) to create a file in an MPEG2-TS container. Keep the default value Automatic (AUTOMATIC) to create a raw audio-only file with no container. Regardless of the value that you specify here, if this output has video, the service will place outputs into an MPEG2-TS container.
  */
type HlsAudioOnlyContainer = "AUTOMATIC" | "M2TS"
object HlsAudioOnlyContainer {
  val AUTOMATIC: "AUTOMATIC" = "AUTOMATIC"
  val M2TS: "M2TS" = "M2TS"

  @inline def values = js.Array[HlsAudioOnlyContainer](AUTOMATIC, M2TS)
}

/** Ignore this setting unless you are using FairPlay DRM with Verimatrix and you encounter playback issues. Keep the default value, Include (INCLUDE), to output audio-only headers. Choose Exclude (EXCLUDE) to remove the audio-only headers from your audio segments.
  */
type HlsAudioOnlyHeader = "INCLUDE" | "EXCLUDE"
object HlsAudioOnlyHeader {
  val INCLUDE: "INCLUDE" = "INCLUDE"
  val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  @inline def values = js.Array[HlsAudioOnlyHeader](INCLUDE, EXCLUDE)
}

/** Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this audio-only stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest. Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
  */
type HlsAudioTrackType = "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT" | "ALTERNATE_AUDIO_AUTO_SELECT" | "ALTERNATE_AUDIO_NOT_AUTO_SELECT" | "AUDIO_ONLY_VARIANT_STREAM"
object HlsAudioTrackType {
  val ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT: "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT" = "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT"
  val ALTERNATE_AUDIO_AUTO_SELECT: "ALTERNATE_AUDIO_AUTO_SELECT" = "ALTERNATE_AUDIO_AUTO_SELECT"
  val ALTERNATE_AUDIO_NOT_AUTO_SELECT: "ALTERNATE_AUDIO_NOT_AUTO_SELECT" = "ALTERNATE_AUDIO_NOT_AUTO_SELECT"
  val AUDIO_ONLY_VARIANT_STREAM: "AUDIO_ONLY_VARIANT_STREAM" = "AUDIO_ONLY_VARIANT_STREAM"

  @inline def values = js.Array[HlsAudioTrackType](ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT, ALTERNATE_AUDIO_AUTO_SELECT, ALTERNATE_AUDIO_NOT_AUTO_SELECT, AUDIO_ONLY_VARIANT_STREAM)
}

/** Applies only to 608 Embedded output captions. Insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you specify. Make sure to specify the languages in the order in which they appear in the original source (if the source is embedded format) or the order of the caption selectors (if the source is other than embedded). Otherwise, languages in the manifest will not match up properly with the output captions. None: Include CLOSED-CAPTIONS=NONE line in the manifest. Omit: Omit any CLOSED-CAPTIONS line from the manifest.
  */
type HlsCaptionLanguageSetting = "INSERT" | "OMIT" | "NONE"
object HlsCaptionLanguageSetting {
  val INSERT: "INSERT" = "INSERT"
  val OMIT: "OMIT" = "OMIT"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[HlsCaptionLanguageSetting](INSERT, OMIT, NONE)
}

/** Disable this setting only when your workflow requires the #EXT-X-ALLOW-CACHE:no tag. Otherwise, keep the default value Enabled (ENABLED) and control caching in your video distribution set up. For example, use the Cache-Control http header.
  */
type HlsClientCache = "DISABLED" | "ENABLED"
object HlsClientCache {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[HlsClientCache](DISABLED, ENABLED)
}

/** Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
  */
type HlsCodecSpecification = "RFC_6381" | "RFC_4281"
object HlsCodecSpecification {
  val RFC_6381: "RFC_6381" = "RFC_6381"
  val RFC_4281: "RFC_4281" = "RFC_4281"

  @inline def values = js.Array[HlsCodecSpecification](RFC_6381, RFC_4281)
}

/** Specify whether to flag this audio track as descriptive video service (DVS) in your HLS parent manifest. When you choose Flag (FLAG), MediaConvert includes the parameter CHARACTERISTICS="public.accessibility.describes-video" in the EXT-X-MEDIA entry for this track. When you keep the default choice, Don't flag (DONT_FLAG), MediaConvert leaves this parameter out. The DVS flag can help with accessibility on Apple devices. For more information, see the Apple documentation.
  */
type HlsDescriptiveVideoServiceFlag = "DONT_FLAG" | "FLAG"
object HlsDescriptiveVideoServiceFlag {
  val DONT_FLAG: "DONT_FLAG" = "DONT_FLAG"
  val FLAG: "FLAG" = "FLAG"

  @inline def values = js.Array[HlsDescriptiveVideoServiceFlag](DONT_FLAG, FLAG)
}

/** Indicates whether segments should be placed in subdirectories.
  */
type HlsDirectoryStructure = "SINGLE_DIRECTORY" | "SUBDIRECTORY_PER_STREAM"
object HlsDirectoryStructure {
  val SINGLE_DIRECTORY: "SINGLE_DIRECTORY" = "SINGLE_DIRECTORY"
  val SUBDIRECTORY_PER_STREAM: "SUBDIRECTORY_PER_STREAM" = "SUBDIRECTORY_PER_STREAM"

  @inline def values = js.Array[HlsDirectoryStructure](SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM)
}

/** Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in the web interface also disables encryption.
  */
type HlsEncryptionType = "AES128" | "SAMPLE_AES"
object HlsEncryptionType {
  val AES128: "AES128" = "AES128"
  val SAMPLE_AES: "SAMPLE_AES" = "SAMPLE_AES"

  @inline def values = js.Array[HlsEncryptionType](AES128, SAMPLE_AES)
}

/** Choose Include (INCLUDE) to have MediaConvert generate a child manifest that lists only the I-frames for this rendition, in addition to your regular manifest for this rendition. You might use this manifest as part of a workflow that creates preview functions for your video. MediaConvert adds both the I-frame only child manifest and the regular child manifest to the parent manifest. When you don't need the I-frame only child manifest, keep the default value Exclude (EXCLUDE).
  */
type HlsIFrameOnlyManifest = "INCLUDE" | "EXCLUDE"
object HlsIFrameOnlyManifest {
  val INCLUDE: "INCLUDE" = "INCLUDE"
  val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  @inline def values = js.Array[HlsIFrameOnlyManifest](INCLUDE, EXCLUDE)
}

/** The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If set to INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not in the manifest.
  */
type HlsInitializationVectorInManifest = "INCLUDE" | "EXCLUDE"
object HlsInitializationVectorInManifest {
  val INCLUDE: "INCLUDE" = "INCLUDE"
  val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  @inline def values = js.Array[HlsInitializationVectorInManifest](INCLUDE, EXCLUDE)
}

/** Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
  */
type HlsKeyProviderType = "SPEKE" | "STATIC_KEY"
object HlsKeyProviderType {
  val SPEKE: "SPEKE" = "SPEKE"
  val STATIC_KEY: "STATIC_KEY" = "STATIC_KEY"

  @inline def values = js.Array[HlsKeyProviderType](SPEKE, STATIC_KEY)
}

/** When set to GZIP, compresses HLS playlist.
  */
type HlsManifestCompression = "GZIP" | "NONE"
object HlsManifestCompression {
  val GZIP: "GZIP" = "GZIP"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[HlsManifestCompression](GZIP, NONE)
}

/** Indicates whether the output manifest should use floating point values for segment duration.
  */
type HlsManifestDurationFormat = "FLOATING_POINT" | "INTEGER"
object HlsManifestDurationFormat {
  val FLOATING_POINT: "FLOATING_POINT" = "FLOATING_POINT"
  val INTEGER: "INTEGER" = "INTEGER"

  @inline def values = js.Array[HlsManifestDurationFormat](FLOATING_POINT, INTEGER)
}

/** Enable this setting to insert the EXT-X-SESSION-KEY element into the master playlist. This allows for offline Apple HLS FairPlay content protection.
  */
type HlsOfflineEncrypted = "ENABLED" | "DISABLED"
object HlsOfflineEncrypted {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[HlsOfflineEncrypted](ENABLED, DISABLED)
}

/** Indicates whether the .m3u8 manifest file should be generated for this HLS output group.
  */
type HlsOutputSelection = "MANIFESTS_AND_SEGMENTS" | "SEGMENTS_ONLY"
object HlsOutputSelection {
  val MANIFESTS_AND_SEGMENTS: "MANIFESTS_AND_SEGMENTS" = "MANIFESTS_AND_SEGMENTS"
  val SEGMENTS_ONLY: "SEGMENTS_ONLY" = "SEGMENTS_ONLY"

  @inline def values = js.Array[HlsOutputSelection](MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY)
}

/** Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as follows: either the program date and time are initialized using the input timecode source, or the time is initialized using the input timecode source and the date is initialized using the timestamp_offset.
  */
type HlsProgramDateTime = "INCLUDE" | "EXCLUDE"
object HlsProgramDateTime {
  val INCLUDE: "INCLUDE" = "INCLUDE"
  val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  @inline def values = js.Array[HlsProgramDateTime](INCLUDE, EXCLUDE)
}

/** When set to SINGLE_FILE, emits program as a single media resource (.ts) file, uses #EXT-X-BYTERANGE tags to index segment for playback.
  */
type HlsSegmentControl = "SINGLE_FILE" | "SEGMENTED_FILES"
object HlsSegmentControl {
  val SINGLE_FILE: "SINGLE_FILE" = "SINGLE_FILE"
  val SEGMENTED_FILES: "SEGMENTED_FILES" = "SEGMENTED_FILES"

  @inline def values = js.Array[HlsSegmentControl](SINGLE_FILE, SEGMENTED_FILES)
}

/** Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
  */
type HlsStreamInfResolution = "INCLUDE" | "EXCLUDE"
object HlsStreamInfResolution {
  val INCLUDE: "INCLUDE" = "INCLUDE"
  val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  @inline def values = js.Array[HlsStreamInfResolution](INCLUDE, EXCLUDE)
}

/** Indicates ID3 frame that has the timecode.
  */
type HlsTimedMetadataId3Frame = "NONE" | "PRIV" | "TDRL"
object HlsTimedMetadataId3Frame {
  val NONE: "NONE" = "NONE"
  val PRIV: "PRIV" = "PRIV"
  val TDRL: "TDRL" = "TDRL"

  @inline def values = js.Array[HlsTimedMetadataId3Frame](NONE, PRIV, TDRL)
}

/** Keep this setting enabled to have MediaConvert use the font style and position information from the captions source in the output. This option is available only when your input captions are IMSC, SMPTE-TT, or TTML. Disable this setting for simplified output captions.
  */
type ImscStylePassthrough = "ENABLED" | "DISABLED"
object ImscStylePassthrough {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[ImscStylePassthrough](ENABLED, DISABLED)
}

/** Enable Deblock (InputDeblockFilter) to produce smoother motion in the output. Default is disabled. Only manually controllable for MPEG2 and uncompressed video inputs.
  */
type InputDeblockFilter = "ENABLED" | "DISABLED"
object InputDeblockFilter {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[InputDeblockFilter](ENABLED, DISABLED)
}

/** Enable Denoise (InputDenoiseFilter) to filter noise from the input. Default is disabled. Only applicable to MPEG2, H.264, H.265, and uncompressed video inputs.
  */
type InputDenoiseFilter = "ENABLED" | "DISABLED"
object InputDenoiseFilter {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[InputDenoiseFilter](ENABLED, DISABLED)
}

/** Specify how the transcoding service applies the denoise and deblock filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and Deblock (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering, depending on input type and quality. * Disable - The input is not filtered. This is true even if you use the API to enable them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The input is filtered regardless of input type.
  */
type InputFilterEnable = "AUTO" | "DISABLE" | "FORCE"
object InputFilterEnable {
  val AUTO: "AUTO" = "AUTO"
  val DISABLE: "DISABLE" = "DISABLE"
  val FORCE: "FORCE" = "FORCE"

  @inline def values = js.Array[InputFilterEnable](AUTO, DISABLE, FORCE)
}

/** Set PSI control (InputPsiControl) for transport stream inputs to specify which data the demux process to scans. * Ignore PSI - Scan all PIDs for audio and video. * Use PSI - Scan only PSI data.
  */
type InputPsiControl = "IGNORE_PSI" | "USE_PSI"
object InputPsiControl {
  val IGNORE_PSI: "IGNORE_PSI" = "IGNORE_PSI"
  val USE_PSI: "USE_PSI" = "USE_PSI"

  @inline def values = js.Array[InputPsiControl](IGNORE_PSI, USE_PSI)
}

/** Use Rotate (InputRotate) to specify how the service rotates your video. You can choose automatic rotation or specify a rotation. You can specify a clockwise rotation of 0, 90, 180, or 270 degrees. If your input video container is .mov or .mp4 and your input has rotation metadata, you can choose Automatic to have the service rotate your video according to the rotation specified in the metadata. The rotation must be within one degree of 90, 180, or 270 degrees. If the rotation metadata specifies any other rotation, the service will default to no rotation. By default, the service does no rotation, even if your input video has rotation metadata. The service doesn't pass through rotation metadata.
  */
type InputRotate = "DEGREE_0" | "DEGREES_90" | "DEGREES_180" | "DEGREES_270" | "AUTO"
object InputRotate {
  val DEGREE_0: "DEGREE_0" = "DEGREE_0"
  val DEGREES_90: "DEGREES_90" = "DEGREES_90"
  val DEGREES_180: "DEGREES_180" = "DEGREES_180"
  val DEGREES_270: "DEGREES_270" = "DEGREES_270"
  val AUTO: "AUTO" = "AUTO"

  @inline def values = js.Array[InputRotate](DEGREE_0, DEGREES_90, DEGREES_180, DEGREES_270, AUTO)
}

/** When you have a progressive segmented frame (PsF) input, use this setting to flag the input as PsF. MediaConvert doesn't automatically detect PsF. Therefore, flagging your input as PsF results in better preservation of video quality when you do deinterlacing and frame rate conversion. If you don't specify, the default value is Auto (AUTO). Auto is the correct setting for all inputs that are not PsF. Don't set this value to PsF when your input is interlaced. Doing so creates horizontal interlacing artifacts.
  */
type InputScanType = "AUTO" | "PSF"
object InputScanType {
  val AUTO: "AUTO" = "AUTO"
  val PSF: "PSF" = "PSF"

  @inline def values = js.Array[InputScanType](AUTO, PSF)
}

/** Use this Timecode source setting, located under the input settings (InputTimecodeSource), to specify how the service counts input video frames. This input frame count affects only the behavior of features that apply to a single input at a time, such as input clipping and synchronizing some captions formats. Choose Embedded (EMBEDDED) to use the timecodes in your input video. Choose Start at zero (ZEROBASED) to start the first frame at zero. Choose Specified start (SPECIFIEDSTART) to start the first frame at the timecode that you specify in the setting Start timecode (timecodeStart). If you don't specify a value for Timecode source, the service will use Embedded by default. For more information about timecodes, see https://docs.aws.amazon.com/console/mediaconvert/timecode.
  */
type InputTimecodeSource = "EMBEDDED" | "ZEROBASED" | "SPECIFIEDSTART"
object InputTimecodeSource {
  val EMBEDDED: "EMBEDDED" = "EMBEDDED"
  val ZEROBASED: "ZEROBASED" = "ZEROBASED"
  val SPECIFIEDSTART: "SPECIFIEDSTART" = "SPECIFIEDSTART"

  @inline def values = js.Array[InputTimecodeSource](EMBEDDED, ZEROBASED, SPECIFIEDSTART)
}

/** A job's phase can be PROBING, TRANSCODING OR UPLOADING
  */
type JobPhase = "PROBING" | "TRANSCODING" | "UPLOADING"
object JobPhase {
  val PROBING: "PROBING" = "PROBING"
  val TRANSCODING: "TRANSCODING" = "TRANSCODING"
  val UPLOADING: "UPLOADING" = "UPLOADING"

  @inline def values = js.Array[JobPhase](PROBING, TRANSCODING, UPLOADING)
}

/** A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
  */
type JobStatus = "SUBMITTED" | "PROGRESSING" | "COMPLETE" | "CANCELED" | "ERROR"
object JobStatus {
  val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  val PROGRESSING: "PROGRESSING" = "PROGRESSING"
  val COMPLETE: "COMPLETE" = "COMPLETE"
  val CANCELED: "CANCELED" = "CANCELED"
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[JobStatus](SUBMITTED, PROGRESSING, COMPLETE, CANCELED, ERROR)
}

/** Optional. When you request a list of job templates, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
  */
type JobTemplateListBy = "NAME" | "CREATION_DATE" | "SYSTEM"
object JobTemplateListBy {
  val NAME: "NAME" = "NAME"
  val CREATION_DATE: "CREATION_DATE" = "CREATION_DATE"
  val SYSTEM: "SYSTEM" = "SYSTEM"

  @inline def values = js.Array[JobTemplateListBy](NAME, CREATION_DATE, SYSTEM)
}

/** Specify the language, using the ISO 639-2 three-letter code listed at https://www.loc.gov/standards/iso639-2/php/code_list.php.
  */
type LanguageCode = "ENG" | "SPA" | "FRA" | "DEU" | "GER" | "ZHO" | "ARA" | "HIN" | "JPN" | "RUS" | "POR" | "ITA" | "URD" | "VIE" | "KOR" | "PAN" | "ABK" | "AAR" | "AFR" | "AKA" | "SQI" | "AMH" | "ARG" | "HYE" | "ASM" | "AVA" | "AVE" | "AYM" | "AZE" | "BAM" | "BAK" | "EUS" | "BEL" | "BEN" | "BIH" | "BIS" | "BOS" | "BRE" | "BUL" | "MYA" | "CAT" | "KHM" | "CHA" | "CHE" | "NYA" | "CHU" | "CHV" | "COR" | "COS" | "CRE" | "HRV" | "CES" | "DAN" | "DIV" | "NLD" | "DZO" | "ENM" | "EPO" | "EST" | "EWE" | "FAO" | "FIJ" | "FIN" | "FRM" | "FUL" | "GLA" | "GLG" | "LUG" | "KAT" | "ELL" | "GRN" | "GUJ" | "HAT" | "HAU" | "HEB" | "HER" | "HMO" | "HUN" | "ISL" | "IDO" | "IBO" | "IND" | "INA" | "ILE" | "IKU" | "IPK" | "GLE" | "JAV" | "KAL" | "KAN" | "KAU" | "KAS" | "KAZ" | "KIK" | "KIN" | "KIR" | "KOM" | "KON" | "KUA" | "KUR" | "LAO" | "LAT" | "LAV" | "LIM" | "LIN" | "LIT" | "LUB" | "LTZ" | "MKD" | "MLG" | "MSA" | "MAL" | "MLT" | "GLV" | "MRI" | "MAR" | "MAH" | "MON" | "NAU" | "NAV" | "NDE" | "NBL" |
  "NDO" | "NEP" | "SME" | "NOR" | "NOB" | "NNO" | "OCI" | "OJI" | "ORI" | "ORM" | "OSS" | "PLI" | "FAS" | "POL" | "PUS" | "QUE" | "QAA" | "RON" | "ROH" | "RUN" | "SMO" | "SAG" | "SAN" | "SRD" | "SRB" | "SNA" | "III" | "SND" | "SIN" | "SLK" | "SLV" | "SOM" | "SOT" | "SUN" | "SWA" | "SSW" | "SWE" | "TGL" | "TAH" | "TGK" | "TAM" | "TAT" | "TEL" | "THA" | "BOD" | "TIR" | "TON" | "TSO" | "TSN" | "TUR" | "TUK" | "TWI" | "UIG" | "UKR" | "UZB" | "VEN" | "VOL" | "WLN" | "CYM" | "FRY" | "WOL" | "XHO" | "YID" | "YOR" | "ZHA" | "ZUL" | "ORJ" | "QPC" | "TNG"
object LanguageCode {
  val ENG: "ENG" = "ENG"
  val SPA: "SPA" = "SPA"
  val FRA: "FRA" = "FRA"
  val DEU: "DEU" = "DEU"
  val GER: "GER" = "GER"
  val ZHO: "ZHO" = "ZHO"
  val ARA: "ARA" = "ARA"
  val HIN: "HIN" = "HIN"
  val JPN: "JPN" = "JPN"
  val RUS: "RUS" = "RUS"
  val POR: "POR" = "POR"
  val ITA: "ITA" = "ITA"
  val URD: "URD" = "URD"
  val VIE: "VIE" = "VIE"
  val KOR: "KOR" = "KOR"
  val PAN: "PAN" = "PAN"
  val ABK: "ABK" = "ABK"
  val AAR: "AAR" = "AAR"
  val AFR: "AFR" = "AFR"
  val AKA: "AKA" = "AKA"
  val SQI: "SQI" = "SQI"
  val AMH: "AMH" = "AMH"
  val ARG: "ARG" = "ARG"
  val HYE: "HYE" = "HYE"
  val ASM: "ASM" = "ASM"
  val AVA: "AVA" = "AVA"
  val AVE: "AVE" = "AVE"
  val AYM: "AYM" = "AYM"
  val AZE: "AZE" = "AZE"
  val BAM: "BAM" = "BAM"
  val BAK: "BAK" = "BAK"
  val EUS: "EUS" = "EUS"
  val BEL: "BEL" = "BEL"
  val BEN: "BEN" = "BEN"
  val BIH: "BIH" = "BIH"
  val BIS: "BIS" = "BIS"
  val BOS: "BOS" = "BOS"
  val BRE: "BRE" = "BRE"
  val BUL: "BUL" = "BUL"
  val MYA: "MYA" = "MYA"
  val CAT: "CAT" = "CAT"
  val KHM: "KHM" = "KHM"
  val CHA: "CHA" = "CHA"
  val CHE: "CHE" = "CHE"
  val NYA: "NYA" = "NYA"
  val CHU: "CHU" = "CHU"
  val CHV: "CHV" = "CHV"
  val COR: "COR" = "COR"
  val COS: "COS" = "COS"
  val CRE: "CRE" = "CRE"
  val HRV: "HRV" = "HRV"
  val CES: "CES" = "CES"
  val DAN: "DAN" = "DAN"
  val DIV: "DIV" = "DIV"
  val NLD: "NLD" = "NLD"
  val DZO: "DZO" = "DZO"
  val ENM: "ENM" = "ENM"
  val EPO: "EPO" = "EPO"
  val EST: "EST" = "EST"
  val EWE: "EWE" = "EWE"
  val FAO: "FAO" = "FAO"
  val FIJ: "FIJ" = "FIJ"
  val FIN: "FIN" = "FIN"
  val FRM: "FRM" = "FRM"
  val FUL: "FUL" = "FUL"
  val GLA: "GLA" = "GLA"
  val GLG: "GLG" = "GLG"
  val LUG: "LUG" = "LUG"
  val KAT: "KAT" = "KAT"
  val ELL: "ELL" = "ELL"
  val GRN: "GRN" = "GRN"
  val GUJ: "GUJ" = "GUJ"
  val HAT: "HAT" = "HAT"
  val HAU: "HAU" = "HAU"
  val HEB: "HEB" = "HEB"
  val HER: "HER" = "HER"
  val HMO: "HMO" = "HMO"
  val HUN: "HUN" = "HUN"
  val ISL: "ISL" = "ISL"
  val IDO: "IDO" = "IDO"
  val IBO: "IBO" = "IBO"
  val IND: "IND" = "IND"
  val INA: "INA" = "INA"
  val ILE: "ILE" = "ILE"
  val IKU: "IKU" = "IKU"
  val IPK: "IPK" = "IPK"
  val GLE: "GLE" = "GLE"
  val JAV: "JAV" = "JAV"
  val KAL: "KAL" = "KAL"
  val KAN: "KAN" = "KAN"
  val KAU: "KAU" = "KAU"
  val KAS: "KAS" = "KAS"
  val KAZ: "KAZ" = "KAZ"
  val KIK: "KIK" = "KIK"
  val KIN: "KIN" = "KIN"
  val KIR: "KIR" = "KIR"
  val KOM: "KOM" = "KOM"
  val KON: "KON" = "KON"
  val KUA: "KUA" = "KUA"
  val KUR: "KUR" = "KUR"
  val LAO: "LAO" = "LAO"
  val LAT: "LAT" = "LAT"
  val LAV: "LAV" = "LAV"
  val LIM: "LIM" = "LIM"
  val LIN: "LIN" = "LIN"
  val LIT: "LIT" = "LIT"
  val LUB: "LUB" = "LUB"
  val LTZ: "LTZ" = "LTZ"
  val MKD: "MKD" = "MKD"
  val MLG: "MLG" = "MLG"
  val MSA: "MSA" = "MSA"
  val MAL: "MAL" = "MAL"
  val MLT: "MLT" = "MLT"
  val GLV: "GLV" = "GLV"
  val MRI: "MRI" = "MRI"
  val MAR: "MAR" = "MAR"
  val MAH: "MAH" = "MAH"
  val MON: "MON" = "MON"
  val NAU: "NAU" = "NAU"
  val NAV: "NAV" = "NAV"
  val NDE: "NDE" = "NDE"
  val NBL: "NBL" = "NBL"
  val NDO: "NDO" = "NDO"
  val NEP: "NEP" = "NEP"
  val SME: "SME" = "SME"
  val NOR: "NOR" = "NOR"
  val NOB: "NOB" = "NOB"
  val NNO: "NNO" = "NNO"
  val OCI: "OCI" = "OCI"
  val OJI: "OJI" = "OJI"
  val ORI: "ORI" = "ORI"
  val ORM: "ORM" = "ORM"
  val OSS: "OSS" = "OSS"
  val PLI: "PLI" = "PLI"
  val FAS: "FAS" = "FAS"
  val POL: "POL" = "POL"
  val PUS: "PUS" = "PUS"
  val QUE: "QUE" = "QUE"
  val QAA: "QAA" = "QAA"
  val RON: "RON" = "RON"
  val ROH: "ROH" = "ROH"
  val RUN: "RUN" = "RUN"
  val SMO: "SMO" = "SMO"
  val SAG: "SAG" = "SAG"
  val SAN: "SAN" = "SAN"
  val SRD: "SRD" = "SRD"
  val SRB: "SRB" = "SRB"
  val SNA: "SNA" = "SNA"
  val III: "III" = "III"
  val SND: "SND" = "SND"
  val SIN: "SIN" = "SIN"
  val SLK: "SLK" = "SLK"
  val SLV: "SLV" = "SLV"
  val SOM: "SOM" = "SOM"
  val SOT: "SOT" = "SOT"
  val SUN: "SUN" = "SUN"
  val SWA: "SWA" = "SWA"
  val SSW: "SSW" = "SSW"
  val SWE: "SWE" = "SWE"
  val TGL: "TGL" = "TGL"
  val TAH: "TAH" = "TAH"
  val TGK: "TGK" = "TGK"
  val TAM: "TAM" = "TAM"
  val TAT: "TAT" = "TAT"
  val TEL: "TEL" = "TEL"
  val THA: "THA" = "THA"
  val BOD: "BOD" = "BOD"
  val TIR: "TIR" = "TIR"
  val TON: "TON" = "TON"
  val TSO: "TSO" = "TSO"
  val TSN: "TSN" = "TSN"
  val TUR: "TUR" = "TUR"
  val TUK: "TUK" = "TUK"
  val TWI: "TWI" = "TWI"
  val UIG: "UIG" = "UIG"
  val UKR: "UKR" = "UKR"
  val UZB: "UZB" = "UZB"
  val VEN: "VEN" = "VEN"
  val VOL: "VOL" = "VOL"
  val WLN: "WLN" = "WLN"
  val CYM: "CYM" = "CYM"
  val FRY: "FRY" = "FRY"
  val WOL: "WOL" = "WOL"
  val XHO: "XHO" = "XHO"
  val YID: "YID" = "YID"
  val YOR: "YOR" = "YOR"
  val ZHA: "ZHA" = "ZHA"
  val ZUL: "ZUL" = "ZUL"
  val ORJ: "ORJ" = "ORJ"
  val QPC: "QPC" = "QPC"
  val TNG: "TNG" = "TNG"

  @inline def values = js.Array[LanguageCode](
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
  val DVB: "DVB" = "DVB"
  val ATSC: "ATSC" = "ATSC"

  @inline def values = js.Array[M2tsAudioBufferModel](DVB, ATSC)
}

/** Specify this setting only when your output will be consumed by a downstream repackaging workflow that is sensitive to very small duration differences between video and audio. For this situation, choose Match video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with silence or trims them to ensure that the total duration of each audio stream is at least as long as the total duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
  */
type M2tsAudioDuration = "DEFAULT_CODEC_DURATION" | "MATCH_VIDEO_DURATION"
object M2tsAudioDuration {
  val DEFAULT_CODEC_DURATION: "DEFAULT_CODEC_DURATION" = "DEFAULT_CODEC_DURATION"
  val MATCH_VIDEO_DURATION: "MATCH_VIDEO_DURATION" = "MATCH_VIDEO_DURATION"

  @inline def values = js.Array[M2tsAudioDuration](DEFAULT_CODEC_DURATION, MATCH_VIDEO_DURATION)
}

/** Controls what buffer model to use for accurate interleaving. If set to MULTIPLEX, use multiplex buffer model. If set to NONE, this can lead to lower latency, but low-memory devices may not be able to play back the stream without interruptions.
  */
type M2tsBufferModel = "MULTIPLEX" | "NONE"
object M2tsBufferModel {
  val MULTIPLEX: "MULTIPLEX" = "MULTIPLEX"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[M2tsBufferModel](MULTIPLEX, NONE)
}

/** When set to VIDEO_AND_FIXED_INTERVALS, audio EBP markers will be added to partitions 3 and 4. The interval between these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval. When set to VIDEO_INTERVAL, these additional markers will not be inserted. Only applicable when EBP segmentation markers are is selected (segmentationMarkers is EBP or EBP_LEGACY).
  */
type M2tsEbpAudioInterval = "VIDEO_AND_FIXED_INTERVALS" | "VIDEO_INTERVAL"
object M2tsEbpAudioInterval {
  val VIDEO_AND_FIXED_INTERVALS: "VIDEO_AND_FIXED_INTERVALS" = "VIDEO_AND_FIXED_INTERVALS"
  val VIDEO_INTERVAL: "VIDEO_INTERVAL" = "VIDEO_INTERVAL"

  @inline def values = js.Array[M2tsEbpAudioInterval](VIDEO_AND_FIXED_INTERVALS, VIDEO_INTERVAL)
}

/** Selects which PIDs to place EBP markers on. They can either be placed only on the video PID, or on both the video PID and all audio PIDs. Only applicable when EBP segmentation markers are is selected (segmentationMarkers is EBP or EBP_LEGACY).
  */
type M2tsEbpPlacement = "VIDEO_AND_AUDIO_PIDS" | "VIDEO_PID"
object M2tsEbpPlacement {
  val VIDEO_AND_AUDIO_PIDS: "VIDEO_AND_AUDIO_PIDS" = "VIDEO_AND_AUDIO_PIDS"
  val VIDEO_PID: "VIDEO_PID" = "VIDEO_PID"

  @inline def values = js.Array[M2tsEbpPlacement](VIDEO_AND_AUDIO_PIDS, VIDEO_PID)
}

/** Controls whether to include the ES Rate field in the PES header.
  */
type M2tsEsRateInPes = "INCLUDE" | "EXCLUDE"
object M2tsEsRateInPes {
  val INCLUDE: "INCLUDE" = "INCLUDE"
  val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  @inline def values = js.Array[M2tsEsRateInPes](INCLUDE, EXCLUDE)
}

/** Keep the default value (DEFAULT) unless you know that your audio EBP markers are incorrectly appearing before your video EBP markers. To correct this problem, set this value to Force (FORCE).
  */
type M2tsForceTsVideoEbpOrder = "FORCE" | "DEFAULT"
object M2tsForceTsVideoEbpOrder {
  val FORCE: "FORCE" = "FORCE"
  val DEFAULT: "DEFAULT" = "DEFAULT"

  @inline def values = js.Array[M2tsForceTsVideoEbpOrder](FORCE, DEFAULT)
}

/** If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
  */
type M2tsNielsenId3 = "INSERT" | "NONE"
object M2tsNielsenId3 {
  val INSERT: "INSERT" = "INSERT"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[M2tsNielsenId3](INSERT, NONE)
}

/** When set to PCR_EVERY_PES_PACKET, a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This is effective only when the PCR PID is the same as the video or audio elementary stream.
  */
type M2tsPcrControl = "PCR_EVERY_PES_PACKET" | "CONFIGURED_PCR_PERIOD"
object M2tsPcrControl {
  val PCR_EVERY_PES_PACKET: "PCR_EVERY_PES_PACKET" = "PCR_EVERY_PES_PACKET"
  val CONFIGURED_PCR_PERIOD: "CONFIGURED_PCR_PERIOD" = "CONFIGURED_PCR_PERIOD"

  @inline def values = js.Array[M2tsPcrControl](PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD)
}

/** When set to CBR, inserts null packets into transport stream to fill specified bitrate. When set to VBR, the bitrate setting acts as the maximum bitrate, but the output will not be padded up to that bitrate.
  */
type M2tsRateMode = "VBR" | "CBR"
object M2tsRateMode {
  val VBR: "VBR" = "VBR"
  val CBR: "CBR" = "CBR"

  @inline def values = js.Array[M2tsRateMode](VBR, CBR)
}

/** For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want SCTE-35 markers in this output. For SCTE-35 markers from an ESAM XML document-- Choose None (NONE). Also provide the ESAM XML as a string in the setting Signal processing notification XML (sccXml). Also enable ESAM SCTE-35 (include the property scte35Esam).
  */
type M2tsScte35Source = "PASSTHROUGH" | "NONE"
object M2tsScte35Source {
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[M2tsScte35Source](PASSTHROUGH, NONE)
}

/** Inserts segmentation markers at each segmentation_time period. rai_segstart sets the Random Access Indicator bit in the adaptation field. rai_adapt sets the RAI bit and adds the current timecode in the private data bytes. psi_segstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebp_legacy adds Encoder Boundary Point information to the adaptation field using a legacy proprietary format.
  */
type M2tsSegmentationMarkers = "NONE" | "RAI_SEGSTART" | "RAI_ADAPT" | "PSI_SEGSTART" | "EBP" | "EBP_LEGACY"
object M2tsSegmentationMarkers {
  val NONE: "NONE" = "NONE"
  val RAI_SEGSTART: "RAI_SEGSTART" = "RAI_SEGSTART"
  val RAI_ADAPT: "RAI_ADAPT" = "RAI_ADAPT"
  val PSI_SEGSTART: "PSI_SEGSTART" = "PSI_SEGSTART"
  val EBP: "EBP" = "EBP"
  val EBP_LEGACY: "EBP_LEGACY" = "EBP_LEGACY"

  @inline def values = js.Array[M2tsSegmentationMarkers](NONE, RAI_SEGSTART, RAI_ADAPT, PSI_SEGSTART, EBP, EBP_LEGACY)
}

/** The segmentation style parameter controls how segmentation markers are inserted into the transport stream. With avails, it is possible that segments may be truncated, which can influence where future segmentation markers are inserted. When a segmentation style of "reset_cadence" is selected and a segment is truncated due to an avail, we will reset the segmentation cadence. This means the subsequent segment will have a duration of of segmentation_time seconds. When a segmentation style of "maintain_cadence" is selected and a segment is truncated due to an avail, we will not reset the segmentation cadence. This means the subsequent segment will likely be truncated as well. However, all segments after that will have a duration of segmentation_time seconds. Note that EBP lookahead is a slight exception to this rule.
  */
type M2tsSegmentationStyle = "MAINTAIN_CADENCE" | "RESET_CADENCE"
object M2tsSegmentationStyle {
  val MAINTAIN_CADENCE: "MAINTAIN_CADENCE" = "MAINTAIN_CADENCE"
  val RESET_CADENCE: "RESET_CADENCE" = "RESET_CADENCE"

  @inline def values = js.Array[M2tsSegmentationStyle](MAINTAIN_CADENCE, RESET_CADENCE)
}

/** Specify this setting only when your output will be consumed by a downstream repackaging workflow that is sensitive to very small duration differences between video and audio. For this situation, choose Match video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with silence or trims them to ensure that the total duration of each audio stream is at least as long as the total duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
  */
type M3u8AudioDuration = "DEFAULT_CODEC_DURATION" | "MATCH_VIDEO_DURATION"
object M3u8AudioDuration {
  val DEFAULT_CODEC_DURATION: "DEFAULT_CODEC_DURATION" = "DEFAULT_CODEC_DURATION"
  val MATCH_VIDEO_DURATION: "MATCH_VIDEO_DURATION" = "MATCH_VIDEO_DURATION"

  @inline def values = js.Array[M3u8AudioDuration](DEFAULT_CODEC_DURATION, MATCH_VIDEO_DURATION)
}

/** If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
  */
type M3u8NielsenId3 = "INSERT" | "NONE"
object M3u8NielsenId3 {
  val INSERT: "INSERT" = "INSERT"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[M3u8NielsenId3](INSERT, NONE)
}

/** When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
  */
type M3u8PcrControl = "PCR_EVERY_PES_PACKET" | "CONFIGURED_PCR_PERIOD"
object M3u8PcrControl {
  val PCR_EVERY_PES_PACKET: "PCR_EVERY_PES_PACKET" = "PCR_EVERY_PES_PACKET"
  val CONFIGURED_PCR_PERIOD: "CONFIGURED_PCR_PERIOD" = "CONFIGURED_PCR_PERIOD"

  @inline def values = js.Array[M3u8PcrControl](PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD)
}

/** For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want SCTE-35 markers in this output. For SCTE-35 markers from an ESAM XML document-- Choose None (NONE) if you don't want manifest conditioning. Choose Passthrough (PASSTHROUGH) and choose Ad markers (adMarkers) if you do want manifest conditioning. In both cases, also provide the ESAM XML as a string in the setting Signal processing notification XML (sccXml).
  */
type M3u8Scte35Source = "PASSTHROUGH" | "NONE"
object M3u8Scte35Source {
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[M3u8Scte35Source](PASSTHROUGH, NONE)
}

/** Choose the type of motion graphic asset that you are providing for your overlay. You can choose either a .mov file or a series of .png files.
  */
type MotionImageInsertionMode = "MOV" | "PNG"
object MotionImageInsertionMode {
  val MOV: "MOV" = "MOV"
  val PNG: "PNG" = "PNG"

  @inline def values = js.Array[MotionImageInsertionMode](MOV, PNG)
}

/** Specify whether your motion graphic overlay repeats on a loop or plays only once.
  */
type MotionImagePlayback = "ONCE" | "REPEAT"
object MotionImagePlayback {
  val ONCE: "ONCE" = "ONCE"
  val REPEAT: "REPEAT" = "REPEAT"

  @inline def values = js.Array[MotionImagePlayback](ONCE, REPEAT)
}

/** When enabled, include 'clap' atom if appropriate for the video output settings.
  */
type MovClapAtom = "INCLUDE" | "EXCLUDE"
object MovClapAtom {
  val INCLUDE: "INCLUDE" = "INCLUDE"
  val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  @inline def values = js.Array[MovClapAtom](INCLUDE, EXCLUDE)
}

/** When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
  */
type MovCslgAtom = "INCLUDE" | "EXCLUDE"
object MovCslgAtom {
  val INCLUDE: "INCLUDE" = "INCLUDE"
  val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  @inline def values = js.Array[MovCslgAtom](INCLUDE, EXCLUDE)
}

/** When set to XDCAM, writes MPEG2 video streams into the QuickTime file using XDCAM fourcc codes. This increases compatibility with Apple editors and players, but may decrease compatibility with other players. Only applicable when the video codec is MPEG2.
  */
type MovMpeg2FourCCControl = "XDCAM" | "MPEG"
object MovMpeg2FourCCControl {
  val XDCAM: "XDCAM" = "XDCAM"
  val MPEG: "MPEG" = "MPEG"

  @inline def values = js.Array[MovMpeg2FourCCControl](XDCAM, MPEG)
}

/** To make this output compatible with Omenon, keep the default value, OMNEON. Unless you need Omneon compatibility, set this value to NONE. When you keep the default value, OMNEON, MediaConvert increases the length of the edit list atom. This might cause file rejections when a recipient of the output file doesn't expct this extra padding.
  */
type MovPaddingControl = "OMNEON" | "NONE"
object MovPaddingControl {
  val OMNEON: "OMNEON" = "OMNEON"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[MovPaddingControl](OMNEON, NONE)
}

/** Always keep the default value (SELF_CONTAINED) for this setting.
  */
type MovReference = "SELF_CONTAINED" | "EXTERNAL"
object MovReference {
  val SELF_CONTAINED: "SELF_CONTAINED" = "SELF_CONTAINED"
  val EXTERNAL: "EXTERNAL" = "EXTERNAL"

  @inline def values = js.Array[MovReference](SELF_CONTAINED, EXTERNAL)
}

/** Specify whether the service encodes this MP3 audio output with a constant bitrate (CBR) or a variable bitrate (VBR).
  */
type Mp3RateControlMode = "CBR" | "VBR"
object Mp3RateControlMode {
  val CBR: "CBR" = "CBR"
  val VBR: "VBR" = "VBR"

  @inline def values = js.Array[Mp3RateControlMode](CBR, VBR)
}

/** When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
  */
type Mp4CslgAtom = "INCLUDE" | "EXCLUDE"
object Mp4CslgAtom {
  val INCLUDE: "INCLUDE" = "INCLUDE"
  val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  @inline def values = js.Array[Mp4CslgAtom](INCLUDE, EXCLUDE)
}

/** Inserts a free-space box immediately after the moov box.
  */
type Mp4FreeSpaceBox = "INCLUDE" | "EXCLUDE"
object Mp4FreeSpaceBox {
  val INCLUDE: "INCLUDE" = "INCLUDE"
  val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  @inline def values = js.Array[Mp4FreeSpaceBox](INCLUDE, EXCLUDE)
}

/** If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
  */
type Mp4MoovPlacement = "PROGRESSIVE_DOWNLOAD" | "NORMAL"
object Mp4MoovPlacement {
  val PROGRESSIVE_DOWNLOAD: "PROGRESSIVE_DOWNLOAD" = "PROGRESSIVE_DOWNLOAD"
  val NORMAL: "NORMAL" = "NORMAL"

  @inline def values = js.Array[Mp4MoovPlacement](PROGRESSIVE_DOWNLOAD, NORMAL)
}

/** Optional. Choose Include (INCLUDE) to have MediaConvert mark up your DASH manifest with <Accessibility> elements for embedded 608 captions. This markup isn't generally required, but some video players require it to discover and play embedded 608 captions. Keep the default value, Exclude (EXCLUDE), to leave these elements out. When you enable this setting, this is the markup that MediaConvert includes in your manifest: <Accessibility schemeIdUri="urn:scte:dash:cc:cea-608:2015" value="CC1=eng"/>
  */
type MpdAccessibilityCaptionHints = "INCLUDE" | "EXCLUDE"
object MpdAccessibilityCaptionHints {
  val INCLUDE: "INCLUDE" = "INCLUDE"
  val EXCLUDE: "EXCLUDE" = "EXCLUDE"

  @inline def values = js.Array[MpdAccessibilityCaptionHints](INCLUDE, EXCLUDE)
}

/** Specify this setting only when your output will be consumed by a downstream repackaging workflow that is sensitive to very small duration differences between video and audio. For this situation, choose Match video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with silence or trims them to ensure that the total duration of each audio stream is at least as long as the total duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
  */
type MpdAudioDuration = "DEFAULT_CODEC_DURATION" | "MATCH_VIDEO_DURATION"
object MpdAudioDuration {
  val DEFAULT_CODEC_DURATION: "DEFAULT_CODEC_DURATION" = "DEFAULT_CODEC_DURATION"
  val MATCH_VIDEO_DURATION: "MATCH_VIDEO_DURATION" = "MATCH_VIDEO_DURATION"

  @inline def values = js.Array[MpdAudioDuration](DEFAULT_CODEC_DURATION, MATCH_VIDEO_DURATION)
}

/** Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify sidecar captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single XML file in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format contained within fragmented MP4 files. This set of fragmented MP4 files is separate from your video and audio fragmented MP4 files.
  */
type MpdCaptionContainerType = "RAW" | "FRAGMENTED_MP4"
object MpdCaptionContainerType {
  val RAW: "RAW" = "RAW"
  val FRAGMENTED_MP4: "FRAGMENTED_MP4" = "FRAGMENTED_MP4"

  @inline def values = js.Array[MpdCaptionContainerType](RAW, FRAGMENTED_MP4)
}

/** Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
  */
type MpdScte35Esam = "INSERT" | "NONE"
object MpdScte35Esam {
  val INSERT: "INSERT" = "INSERT"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[MpdScte35Esam](INSERT, NONE)
}

/** Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want those SCTE-35 markers in this output.
  */
type MpdScte35Source = "PASSTHROUGH" | "NONE"
object MpdScte35Source {
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[MpdScte35Source](PASSTHROUGH, NONE)
}

/** Specify the strength of any adaptive quantization filters that you enable. The value that you choose here applies to the following settings: Spatial adaptive quantization (spatialAdaptiveQuantization), and Temporal adaptive quantization (temporalAdaptiveQuantization).
  */
type Mpeg2AdaptiveQuantization = "OFF" | "LOW" | "MEDIUM" | "HIGH"
object Mpeg2AdaptiveQuantization {
  val OFF: "OFF" = "OFF"
  val LOW: "LOW" = "LOW"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val HIGH: "HIGH" = "HIGH"

  @inline def values = js.Array[Mpeg2AdaptiveQuantization](OFF, LOW, MEDIUM, HIGH)
}

/** Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
  */
type Mpeg2CodecLevel = "AUTO" | "LOW" | "MAIN" | "HIGH1440" | "HIGH"
object Mpeg2CodecLevel {
  val AUTO: "AUTO" = "AUTO"
  val LOW: "LOW" = "LOW"
  val MAIN: "MAIN" = "MAIN"
  val HIGH1440: "HIGH1440" = "HIGH1440"
  val HIGH: "HIGH" = "HIGH"

  @inline def values = js.Array[Mpeg2CodecLevel](AUTO, LOW, MAIN, HIGH1440, HIGH)
}

/** Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video output.
  */
type Mpeg2CodecProfile = "MAIN" | "PROFILE_422"
object Mpeg2CodecProfile {
  val MAIN: "MAIN" = "MAIN"
  val PROFILE_422: "PROFILE_422" = "PROFILE_422"

  @inline def values = js.Array[Mpeg2CodecProfile](MAIN, PROFILE_422)
}

/** Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
  */
type Mpeg2DynamicSubGop = "ADAPTIVE" | "STATIC"
object Mpeg2DynamicSubGop {
  val ADAPTIVE: "ADAPTIVE" = "ADAPTIVE"
  val STATIC: "STATIC" = "STATIC"

  @inline def values = js.Array[Mpeg2DynamicSubGop](ADAPTIVE, STATIC)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
type Mpeg2FramerateControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object Mpeg2FramerateControl {
  val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  @inline def values = js.Array[Mpeg2FramerateControl](INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
type Mpeg2FramerateConversionAlgorithm = "DUPLICATE_DROP" | "INTERPOLATE" | "FRAMEFORMER"
object Mpeg2FramerateConversionAlgorithm {
  val DUPLICATE_DROP: "DUPLICATE_DROP" = "DUPLICATE_DROP"
  val INTERPOLATE: "INTERPOLATE" = "INTERPOLATE"
  val FRAMEFORMER: "FRAMEFORMER" = "FRAMEFORMER"

  @inline def values = js.Array[Mpeg2FramerateConversionAlgorithm](DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
  */
type Mpeg2GopSizeUnits = "FRAMES" | "SECONDS"
object Mpeg2GopSizeUnits {
  val FRAMES: "FRAMES" = "FRAMES"
  val SECONDS: "SECONDS" = "SECONDS"

  @inline def values = js.Array[Mpeg2GopSizeUnits](FRAMES, SECONDS)
}

/** Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
  */
type Mpeg2InterlaceMode = "PROGRESSIVE" | "TOP_FIELD" | "BOTTOM_FIELD" | "FOLLOW_TOP_FIELD" | "FOLLOW_BOTTOM_FIELD"
object Mpeg2InterlaceMode {
  val PROGRESSIVE: "PROGRESSIVE" = "PROGRESSIVE"
  val TOP_FIELD: "TOP_FIELD" = "TOP_FIELD"
  val BOTTOM_FIELD: "BOTTOM_FIELD" = "BOTTOM_FIELD"
  val FOLLOW_TOP_FIELD: "FOLLOW_TOP_FIELD" = "FOLLOW_TOP_FIELD"
  val FOLLOW_BOTTOM_FIELD: "FOLLOW_BOTTOM_FIELD" = "FOLLOW_BOTTOM_FIELD"

  @inline def values = js.Array[Mpeg2InterlaceMode](PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD)
}

/** Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision for intra-block DC coefficients. If you choose the value auto, the service will automatically select the precision based on the per-frame compression ratio.
  */
type Mpeg2IntraDcPrecision = "AUTO" | "INTRA_DC_PRECISION_8" | "INTRA_DC_PRECISION_9" | "INTRA_DC_PRECISION_10" | "INTRA_DC_PRECISION_11"
object Mpeg2IntraDcPrecision {
  val AUTO: "AUTO" = "AUTO"
  val INTRA_DC_PRECISION_8: "INTRA_DC_PRECISION_8" = "INTRA_DC_PRECISION_8"
  val INTRA_DC_PRECISION_9: "INTRA_DC_PRECISION_9" = "INTRA_DC_PRECISION_9"
  val INTRA_DC_PRECISION_10: "INTRA_DC_PRECISION_10" = "INTRA_DC_PRECISION_10"
  val INTRA_DC_PRECISION_11: "INTRA_DC_PRECISION_11" = "INTRA_DC_PRECISION_11"

  @inline def values = js.Array[Mpeg2IntraDcPrecision](AUTO, INTRA_DC_PRECISION_8, INTRA_DC_PRECISION_9, INTRA_DC_PRECISION_10, INTRA_DC_PRECISION_11)
}

/** Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
  */
type Mpeg2ParControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object Mpeg2ParControl {
  val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  @inline def values = js.Array[Mpeg2ParControl](INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, single-pass encoding.
  */
type Mpeg2QualityTuningLevel = "SINGLE_PASS" | "MULTI_PASS"
object Mpeg2QualityTuningLevel {
  val SINGLE_PASS: "SINGLE_PASS" = "SINGLE_PASS"
  val MULTI_PASS: "MULTI_PASS" = "MULTI_PASS"

  @inline def values = js.Array[Mpeg2QualityTuningLevel](SINGLE_PASS, MULTI_PASS)
}

/** Use Rate control mode (Mpeg2RateControlMode) to specify whether the bitrate is variable (vbr) or constant (cbr).
  */
type Mpeg2RateControlMode = "VBR" | "CBR"
object Mpeg2RateControlMode {
  val VBR: "VBR" = "VBR"
  val CBR: "CBR" = "CBR"

  @inline def values = js.Array[Mpeg2RateControlMode](VBR, CBR)
}

/** Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
  */
type Mpeg2ScanTypeConversionMode = "INTERLACED" | "INTERLACED_OPTIMIZE"
object Mpeg2ScanTypeConversionMode {
  val INTERLACED: "INTERLACED" = "INTERLACED"
  val INTERLACED_OPTIMIZE: "INTERLACED_OPTIMIZE" = "INTERLACED_OPTIMIZE"

  @inline def values = js.Array[Mpeg2ScanTypeConversionMode](INTERLACED, INTERLACED_OPTIMIZE)
}

/** Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default.
  */
type Mpeg2SceneChangeDetect = "DISABLED" | "ENABLED"
object Mpeg2SceneChangeDetect {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[Mpeg2SceneChangeDetect](DISABLED, ENABLED)
}

/** Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
  */
type Mpeg2SlowPal = "DISABLED" | "ENABLED"
object Mpeg2SlowPal {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[Mpeg2SlowPal](DISABLED, ENABLED)
}

/** Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture, you might choose to disable this feature. Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video
  * games, set it to Low. For content with a wider variety of textures, set it to High or Higher.
  */
type Mpeg2SpatialAdaptiveQuantization = "DISABLED" | "ENABLED"
object Mpeg2SpatialAdaptiveQuantization {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[Mpeg2SpatialAdaptiveQuantization](DISABLED, ENABLED)
}

/** Specify whether this output's video uses the D10 syntax. Keep the default value to not use the syntax. Related settings: When you choose D10 (D_10) for your MXF profile (profile), you must also set this value to to D10 (D_10).
  */
type Mpeg2Syntax = "DEFAULT" | "D_10"
object Mpeg2Syntax {
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val D_10: "D_10" = "D_10"

  @inline def values = js.Array[Mpeg2Syntax](DEFAULT, D_10)
}

/** When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is interlaced, you can optionally enable hard or soft telecine to create a smoother picture. Hard telecine (HARD) produces a 29.97i output. Soft telecine (SOFT) produces an output with a 23.976 output that signals to the video player device to do the conversion during play back. When you keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother picture.
  */
type Mpeg2Telecine = "NONE" | "SOFT" | "HARD"
object Mpeg2Telecine {
  val NONE: "NONE" = "NONE"
  val SOFT: "SOFT" = "SOFT"
  val HARD: "HARD" = "HARD"

  @inline def values = js.Array[Mpeg2Telecine](NONE, SOFT, HARD)
}

/** Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on temporal variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that aren't moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen that doesn't have moving objects with sharp edges, such as sports athletes' faces, you might choose to disable this feature. Related setting: When you enable temporal quantization, adjust the strength of the filter with the setting Adaptive quantization (adaptiveQuantization).
  */
type Mpeg2TemporalAdaptiveQuantization = "DISABLED" | "ENABLED"
object Mpeg2TemporalAdaptiveQuantization {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[Mpeg2TemporalAdaptiveQuantization](DISABLED, ENABLED)
}

/** COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings across a Microsoft Smooth output group into a single audio stream.
  */
type MsSmoothAudioDeduplication = "COMBINE_DUPLICATE_STREAMS" | "NONE"
object MsSmoothAudioDeduplication {
  val COMBINE_DUPLICATE_STREAMS: "COMBINE_DUPLICATE_STREAMS" = "COMBINE_DUPLICATE_STREAMS"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[MsSmoothAudioDeduplication](COMBINE_DUPLICATE_STREAMS, NONE)
}

/** Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding format for the server and client manifest. Valid options are utf8 and utf16.
  */
type MsSmoothManifestEncoding = "UTF8" | "UTF16"
object MsSmoothManifestEncoding {
  val UTF8: "UTF8" = "UTF8"
  val UTF16: "UTF16" = "UTF16"

  @inline def values = js.Array[MsSmoothManifestEncoding](UTF8, UTF16)
}

/** Optional. When you have AFD signaling set up in your output video stream, use this setting to choose whether to also include it in the MXF wrapper. Choose Don't copy (NO_COPY) to exclude AFD signaling from the MXF wrapper. Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD values from the video stream for this output to the MXF wrapper. Regardless of which option you choose, the AFD values remain in the video stream. Related settings: To set up your output to include or exclude AFD values, see AfdSignaling, under VideoDescription. On the console, find AFD signaling under the output's video encoding settings.
  */
type MxfAfdSignaling = "NO_COPY" | "COPY_FROM_VIDEO"
object MxfAfdSignaling {
  val NO_COPY: "NO_COPY" = "NO_COPY"
  val COPY_FROM_VIDEO: "COPY_FROM_VIDEO" = "COPY_FROM_VIDEO"

  @inline def values = js.Array[MxfAfdSignaling](NO_COPY, COPY_FROM_VIDEO)
}

/** Specify the MXF profile, also called shim, for this output. When you choose Auto, MediaConvert chooses a profile based on the video codec and resolution. For a list of codecs supported with each MXF profile, see https://docs.aws.amazon.com/mediaconvert/latest/ug/codecs-supported-with-each-mxf-profile.html. For more information about the automatic selection behavior, see https://docs.aws.amazon.com/mediaconvert/latest/ug/default-automatic-selection-of-mxf-profiles.html.
  */
type MxfProfile = "D_10" | "XDCAM" | "OP1A"
object MxfProfile {
  val D_10: "D_10" = "D_10"
  val XDCAM: "XDCAM" = "XDCAM"
  val OP1A: "OP1A" = "OP1A"

  @inline def values = js.Array[MxfProfile](D_10, XDCAM, OP1A)
}

/** Choose the type of Nielsen watermarks that you want in your outputs. When you choose NAES 2 and NW (NAES2_AND_NW), you must provide a value for the setting SID (sourceId). When you choose CBET (CBET), you must provide a value for the setting CSID (cbetSourceId). When you choose NAES 2, NW, and CBET (NAES2_AND_NW_AND_CBET), you must provide values for both of these settings.
  */
type NielsenActiveWatermarkProcessType = "NAES2_AND_NW" | "CBET" | "NAES2_AND_NW_AND_CBET"
object NielsenActiveWatermarkProcessType {
  val NAES2_AND_NW: "NAES2_AND_NW" = "NAES2_AND_NW"
  val CBET: "CBET" = "CBET"
  val NAES2_AND_NW_AND_CBET: "NAES2_AND_NW_AND_CBET" = "NAES2_AND_NW_AND_CBET"

  @inline def values = js.Array[NielsenActiveWatermarkProcessType](NAES2_AND_NW, CBET, NAES2_AND_NW_AND_CBET)
}

/** Required. Specify whether your source content already contains Nielsen non-linear watermarks. When you set this value to Watermarked (WATERMARKED), the service fails the job. Nielsen requires that you add non-linear watermarking to only clean content that doesn't already have non-linear Nielsen watermarks.
  */
type NielsenSourceWatermarkStatusType = "CLEAN" | "WATERMARKED"
object NielsenSourceWatermarkStatusType {
  val CLEAN: "CLEAN" = "CLEAN"
  val WATERMARKED: "WATERMARKED" = "WATERMARKED"

  @inline def values = js.Array[NielsenSourceWatermarkStatusType](CLEAN, WATERMARKED)
}

/** To create assets that have the same TIC values in each audio track, keep the default value Share TICs (SAME_TICS_PER_TRACK). To create assets that have unique TIC values for each audio track, choose Use unique TICs (RESERVE_UNIQUE_TICS_PER_TRACK).
  */
type NielsenUniqueTicPerAudioTrackType = "RESERVE_UNIQUE_TICS_PER_TRACK" | "SAME_TICS_PER_TRACK"
object NielsenUniqueTicPerAudioTrackType {
  val RESERVE_UNIQUE_TICS_PER_TRACK: "RESERVE_UNIQUE_TICS_PER_TRACK" = "RESERVE_UNIQUE_TICS_PER_TRACK"
  val SAME_TICS_PER_TRACK: "SAME_TICS_PER_TRACK" = "SAME_TICS_PER_TRACK"

  @inline def values = js.Array[NielsenUniqueTicPerAudioTrackType](RESERVE_UNIQUE_TICS_PER_TRACK, SAME_TICS_PER_TRACK)
}

/** Optional. When you set Noise reducer (noiseReducer) to Temporal (TEMPORAL), you can use this setting to apply sharpening. The default behavior, Auto (AUTO), allows the transcoder to determine whether to apply filtering, depending on input type and quality. When you set Noise reducer to Temporal, your output bandwidth is reduced. When Post temporal sharpening is also enabled, that bandwidth reduction is smaller.
  */
type NoiseFilterPostTemporalSharpening = "DISABLED" | "ENABLED" | "AUTO"
object NoiseFilterPostTemporalSharpening {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"
  val AUTO: "AUTO" = "AUTO"

  @inline def values = js.Array[NoiseFilterPostTemporalSharpening](DISABLED, ENABLED, AUTO)
}

/** Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering functions. To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral preserves edges while reducing noise. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) do convolution filtering. * Conserve does min/max noise reduction. * Spatial does frequency-domain filtering based on JND principles. * Temporal optimizes video quality for complex motion.
  */
type NoiseReducerFilter = "BILATERAL" | "MEAN" | "GAUSSIAN" | "LANCZOS" | "SHARPEN" | "CONSERVE" | "SPATIAL" | "TEMPORAL"
object NoiseReducerFilter {
  val BILATERAL: "BILATERAL" = "BILATERAL"
  val MEAN: "MEAN" = "MEAN"
  val GAUSSIAN: "GAUSSIAN" = "GAUSSIAN"
  val LANCZOS: "LANCZOS" = "LANCZOS"
  val SHARPEN: "SHARPEN" = "SHARPEN"
  val CONSERVE: "CONSERVE" = "CONSERVE"
  val SPATIAL: "SPATIAL" = "SPATIAL"
  val TEMPORAL: "TEMPORAL" = "TEMPORAL"

  @inline def values = js.Array[NoiseReducerFilter](BILATERAL, MEAN, GAUSSIAN, LANCZOS, SHARPEN, CONSERVE, SPATIAL, TEMPORAL)
}

/** Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource.
  */
type Order = "ASCENDING" | "DESCENDING"
object Order {
  val ASCENDING: "ASCENDING" = "ASCENDING"
  val DESCENDING: "DESCENDING" = "DESCENDING"

  @inline def values = js.Array[Order](ASCENDING, DESCENDING)
}

/** Type of output group (File group, Apple HLS, DASH ISO, Microsoft Smooth Streaming, CMAF)
  */
type OutputGroupType = "HLS_GROUP_SETTINGS" | "DASH_ISO_GROUP_SETTINGS" | "FILE_GROUP_SETTINGS" | "MS_SMOOTH_GROUP_SETTINGS" | "CMAF_GROUP_SETTINGS"
object OutputGroupType {
  val HLS_GROUP_SETTINGS: "HLS_GROUP_SETTINGS" = "HLS_GROUP_SETTINGS"
  val DASH_ISO_GROUP_SETTINGS: "DASH_ISO_GROUP_SETTINGS" = "DASH_ISO_GROUP_SETTINGS"
  val FILE_GROUP_SETTINGS: "FILE_GROUP_SETTINGS" = "FILE_GROUP_SETTINGS"
  val MS_SMOOTH_GROUP_SETTINGS: "MS_SMOOTH_GROUP_SETTINGS" = "MS_SMOOTH_GROUP_SETTINGS"
  val CMAF_GROUP_SETTINGS: "CMAF_GROUP_SETTINGS" = "CMAF_GROUP_SETTINGS"

  @inline def values = js.Array[OutputGroupType](HLS_GROUP_SETTINGS, DASH_ISO_GROUP_SETTINGS, FILE_GROUP_SETTINGS, MS_SMOOTH_GROUP_SETTINGS, CMAF_GROUP_SETTINGS)
}

/** Selects method of inserting SDT information into output stream. "Follow input SDT" copies SDT information from input stream to output stream. "Follow input SDT if present" copies SDT information from input stream to output stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. Enter "SDT Manually" means user will enter the SDT information. "No SDT" means output stream will not contain SDT information.
  */
type OutputSdt = "SDT_FOLLOW" | "SDT_FOLLOW_IF_PRESENT" | "SDT_MANUAL" | "SDT_NONE"
object OutputSdt {
  val SDT_FOLLOW: "SDT_FOLLOW" = "SDT_FOLLOW"
  val SDT_FOLLOW_IF_PRESENT: "SDT_FOLLOW_IF_PRESENT" = "SDT_FOLLOW_IF_PRESENT"
  val SDT_MANUAL: "SDT_MANUAL" = "SDT_MANUAL"
  val SDT_NONE: "SDT_NONE" = "SDT_NONE"

  @inline def values = js.Array[OutputSdt](SDT_FOLLOW, SDT_FOLLOW_IF_PRESENT, SDT_MANUAL, SDT_NONE)
}

/** Optional. When you request a list of presets, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
  */
type PresetListBy = "NAME" | "CREATION_DATE" | "SYSTEM"
object PresetListBy {
  val NAME: "NAME" = "NAME"
  val CREATION_DATE: "CREATION_DATE" = "CREATION_DATE"
  val SYSTEM: "SYSTEM" = "SYSTEM"

  @inline def values = js.Array[PresetListBy](NAME, CREATION_DATE, SYSTEM)
}

/** Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment.
  */
type PricingPlan = "ON_DEMAND" | "RESERVED"
object PricingPlan {
  val ON_DEMAND: "ON_DEMAND" = "ON_DEMAND"
  val RESERVED: "RESERVED" = "RESERVED"

  @inline def values = js.Array[PricingPlan](ON_DEMAND, RESERVED)
}

/** Use Profile (ProResCodecProfile) to specify the type of Apple ProRes codec to use for this output.
  */
type ProresCodecProfile = "APPLE_PRORES_422" | "APPLE_PRORES_422_HQ" | "APPLE_PRORES_422_LT" | "APPLE_PRORES_422_PROXY"
object ProresCodecProfile {
  val APPLE_PRORES_422: "APPLE_PRORES_422" = "APPLE_PRORES_422"
  val APPLE_PRORES_422_HQ: "APPLE_PRORES_422_HQ" = "APPLE_PRORES_422_HQ"
  val APPLE_PRORES_422_LT: "APPLE_PRORES_422_LT" = "APPLE_PRORES_422_LT"
  val APPLE_PRORES_422_PROXY: "APPLE_PRORES_422_PROXY" = "APPLE_PRORES_422_PROXY"

  @inline def values = js.Array[ProresCodecProfile](APPLE_PRORES_422, APPLE_PRORES_422_HQ, APPLE_PRORES_422_LT, APPLE_PRORES_422_PROXY)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
type ProresFramerateControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object ProresFramerateControl {
  val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  @inline def values = js.Array[ProresFramerateControl](INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
type ProresFramerateConversionAlgorithm = "DUPLICATE_DROP" | "INTERPOLATE" | "FRAMEFORMER"
object ProresFramerateConversionAlgorithm {
  val DUPLICATE_DROP: "DUPLICATE_DROP" = "DUPLICATE_DROP"
  val INTERPOLATE: "INTERPOLATE" = "INTERPOLATE"
  val FRAMEFORMER: "FRAMEFORMER" = "FRAMEFORMER"

  @inline def values = js.Array[ProresFramerateConversionAlgorithm](DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
  */
type ProresInterlaceMode = "PROGRESSIVE" | "TOP_FIELD" | "BOTTOM_FIELD" | "FOLLOW_TOP_FIELD" | "FOLLOW_BOTTOM_FIELD"
object ProresInterlaceMode {
  val PROGRESSIVE: "PROGRESSIVE" = "PROGRESSIVE"
  val TOP_FIELD: "TOP_FIELD" = "TOP_FIELD"
  val BOTTOM_FIELD: "BOTTOM_FIELD" = "BOTTOM_FIELD"
  val FOLLOW_TOP_FIELD: "FOLLOW_TOP_FIELD" = "FOLLOW_TOP_FIELD"
  val FOLLOW_BOTTOM_FIELD: "FOLLOW_BOTTOM_FIELD" = "FOLLOW_BOTTOM_FIELD"

  @inline def values = js.Array[ProresInterlaceMode](PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD)
}

/** Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
  */
type ProresParControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object ProresParControl {
  val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  @inline def values = js.Array[ProresParControl](INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
  */
type ProresScanTypeConversionMode = "INTERLACED" | "INTERLACED_OPTIMIZE"
object ProresScanTypeConversionMode {
  val INTERLACED: "INTERLACED" = "INTERLACED"
  val INTERLACED_OPTIMIZE: "INTERLACED_OPTIMIZE" = "INTERLACED_OPTIMIZE"

  @inline def values = js.Array[ProresScanTypeConversionMode](INTERLACED, INTERLACED_OPTIMIZE)
}

/** Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
  */
type ProresSlowPal = "DISABLED" | "ENABLED"
object ProresSlowPal {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[ProresSlowPal](DISABLED, ENABLED)
}

/** When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother picture.
  */
type ProresTelecine = "NONE" | "HARD"
object ProresTelecine {
  val NONE: "NONE" = "NONE"
  val HARD: "HARD" = "HARD"

  @inline def values = js.Array[ProresTelecine](NONE, HARD)
}

/** Optional. When you request a list of queues, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by creation date.
  */
type QueueListBy = "NAME" | "CREATION_DATE"
object QueueListBy {
  val NAME: "NAME" = "NAME"
  val CREATION_DATE: "CREATION_DATE" = "CREATION_DATE"

  @inline def values = js.Array[QueueListBy](NAME, CREATION_DATE)
}

/** Queues can be ACTIVE or PAUSED. If you pause a queue, jobs in that queue won't begin. Jobs that are running when you pause a queue continue to run until they finish or result in an error.
  */
type QueueStatus = "ACTIVE" | "PAUSED"
object QueueStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val PAUSED: "PAUSED" = "PAUSED"

  @inline def values = js.Array[QueueStatus](ACTIVE, PAUSED)
}

/** Specifies whether the term of your reserved queue pricing plan is automatically extended (AUTO_RENEW) or expires (EXPIRE) at the end of the term.
  */
type RenewalType = "AUTO_RENEW" | "EXPIRE"
object RenewalType {
  val AUTO_RENEW: "AUTO_RENEW" = "AUTO_RENEW"
  val EXPIRE: "EXPIRE" = "EXPIRE"

  @inline def values = js.Array[RenewalType](AUTO_RENEW, EXPIRE)
}

/** Specifies whether the pricing plan for your reserved queue is ACTIVE or EXPIRED.
  */
type ReservationPlanStatus = "ACTIVE" | "EXPIRED"
object ReservationPlanStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val EXPIRED: "EXPIRED" = "EXPIRED"

  @inline def values = js.Array[ReservationPlanStatus](ACTIVE, EXPIRED)
}

/** Use Respond to AFD (RespondToAfd) to specify how the service changes the video itself in response to AFD values in the input. * Choose Respond to clip the input video frame according to the AFD value, input display aspect ratio, and output display aspect ratio. * Choose Passthrough to include the input AFD values. Do not choose this when AfdSignaling is set to (NONE). A preferred implementation of this workflow is to set RespondToAfd to (NONE) and set AfdSignaling to (AUTO). * Choose None to remove all input AFD values from this output.
  */
type RespondToAfd = "NONE" | "RESPOND" | "PASSTHROUGH"
object RespondToAfd {
  val NONE: "NONE" = "NONE"
  val RESPOND: "RESPOND" = "RESPOND"
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"

  @inline def values = js.Array[RespondToAfd](NONE, RESPOND, PASSTHROUGH)
}

/** Choose an Amazon S3 canned ACL for MediaConvert to apply to this output.
  */
type S3ObjectCannedAcl = "PUBLIC_READ" | "AUTHENTICATED_READ" | "BUCKET_OWNER_READ" | "BUCKET_OWNER_FULL_CONTROL"
object S3ObjectCannedAcl {
  val PUBLIC_READ: "PUBLIC_READ" = "PUBLIC_READ"
  val AUTHENTICATED_READ: "AUTHENTICATED_READ" = "AUTHENTICATED_READ"
  val BUCKET_OWNER_READ: "BUCKET_OWNER_READ" = "BUCKET_OWNER_READ"
  val BUCKET_OWNER_FULL_CONTROL: "BUCKET_OWNER_FULL_CONTROL" = "BUCKET_OWNER_FULL_CONTROL"

  @inline def values = js.Array[S3ObjectCannedAcl](PUBLIC_READ, AUTHENTICATED_READ, BUCKET_OWNER_READ, BUCKET_OWNER_FULL_CONTROL)
}

/** Specify how you want your data keys managed. AWS uses data keys to encrypt your content. AWS also encrypts the data keys themselves, using a customer master key (CMK), and then stores the encrypted data keys alongside your encrypted content. Use this setting to specify which AWS service manages the CMK. For simplest set up, choose Amazon S3 (SERVER_SIDE_ENCRYPTION_S3). If you want your master key to be managed by AWS Key Management Service (KMS), choose AWS KMS (SERVER_SIDE_ENCRYPTION_KMS). By default, when you choose AWS KMS, KMS uses the AWS managed customer master key (CMK) associated with Amazon S3 to encrypt your data keys. You can optionally choose to specify a different, customer managed CMK. Do so by specifying the Amazon Resource Name (ARN) of the key for the setting KMS ARN (kmsKeyArn).
  */
type S3ServerSideEncryptionType = "SERVER_SIDE_ENCRYPTION_S3" | "SERVER_SIDE_ENCRYPTION_KMS"
object S3ServerSideEncryptionType {
  val SERVER_SIDE_ENCRYPTION_S3: "SERVER_SIDE_ENCRYPTION_S3" = "SERVER_SIDE_ENCRYPTION_S3"
  val SERVER_SIDE_ENCRYPTION_KMS: "SERVER_SIDE_ENCRYPTION_KMS" = "SERVER_SIDE_ENCRYPTION_KMS"

  @inline def values = js.Array[S3ServerSideEncryptionType](SERVER_SIDE_ENCRYPTION_S3, SERVER_SIDE_ENCRYPTION_KMS)
}

/** Specify how the service handles outputs that have a different aspect ratio from the input aspect ratio. Choose Stretch to output (STRETCH_TO_OUTPUT) to have the service stretch your video image to fit. Keep the setting Default (DEFAULT) to have the service letterbox your video instead. This setting overrides any value that you specify for the setting Selection placement (position) in this output.
  */
type ScalingBehavior = "DEFAULT" | "STRETCH_TO_OUTPUT"
object ScalingBehavior {
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val STRETCH_TO_OUTPUT: "STRETCH_TO_OUTPUT" = "STRETCH_TO_OUTPUT"

  @inline def values = js.Array[ScalingBehavior](DEFAULT, STRETCH_TO_OUTPUT)
}

/** Set Framerate (SccDestinationFramerate) to make sure that the captions and the video are synchronized in the output. Specify a frame rate that matches the frame rate of the associated video. If the video frame rate is 29.97, choose 29.97 dropframe (FRAMERATE_29_97_DROPFRAME) only if the video has video_insertion=true and drop_frame_timecode=true; otherwise, choose 29.97 non-dropframe (FRAMERATE_29_97_NON_DROPFRAME).
  */
type SccDestinationFramerate = "FRAMERATE_23_97" | "FRAMERATE_24" | "FRAMERATE_25" | "FRAMERATE_29_97_DROPFRAME" | "FRAMERATE_29_97_NON_DROPFRAME"
object SccDestinationFramerate {
  val FRAMERATE_23_97: "FRAMERATE_23_97" = "FRAMERATE_23_97"
  val FRAMERATE_24: "FRAMERATE_24" = "FRAMERATE_24"
  val FRAMERATE_25: "FRAMERATE_25" = "FRAMERATE_25"
  val FRAMERATE_29_97_DROPFRAME: "FRAMERATE_29_97_DROPFRAME" = "FRAMERATE_29_97_DROPFRAME"
  val FRAMERATE_29_97_NON_DROPFRAME: "FRAMERATE_29_97_NON_DROPFRAME" = "FRAMERATE_29_97_NON_DROPFRAME"

  @inline def values = js.Array[SccDestinationFramerate](FRAMERATE_23_97, FRAMERATE_24, FRAMERATE_25, FRAMERATE_29_97_DROPFRAME, FRAMERATE_29_97_NON_DROPFRAME)
}

/** Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you need. When this is enabled, MediaConvert runs your job from an on-demand queue with similar performance to what you will see with one RTS in a reserved queue. This setting is disabled by default.
  */
type SimulateReservedQueue = "DISABLED" | "ENABLED"
object SimulateReservedQueue {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[SimulateReservedQueue](DISABLED, ENABLED)
}

/** Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error.
  */
type StatusUpdateInterval = "SECONDS_10" | "SECONDS_12" | "SECONDS_15" | "SECONDS_20" | "SECONDS_30" | "SECONDS_60" | "SECONDS_120" | "SECONDS_180" | "SECONDS_240" | "SECONDS_300" | "SECONDS_360" | "SECONDS_420" | "SECONDS_480" | "SECONDS_540" | "SECONDS_600"
object StatusUpdateInterval {
  val SECONDS_10: "SECONDS_10" = "SECONDS_10"
  val SECONDS_12: "SECONDS_12" = "SECONDS_12"
  val SECONDS_15: "SECONDS_15" = "SECONDS_15"
  val SECONDS_20: "SECONDS_20" = "SECONDS_20"
  val SECONDS_30: "SECONDS_30" = "SECONDS_30"
  val SECONDS_60: "SECONDS_60" = "SECONDS_60"
  val SECONDS_120: "SECONDS_120" = "SECONDS_120"
  val SECONDS_180: "SECONDS_180" = "SECONDS_180"
  val SECONDS_240: "SECONDS_240" = "SECONDS_240"
  val SECONDS_300: "SECONDS_300" = "SECONDS_300"
  val SECONDS_360: "SECONDS_360" = "SECONDS_360"
  val SECONDS_420: "SECONDS_420" = "SECONDS_420"
  val SECONDS_480: "SECONDS_480" = "SECONDS_480"
  val SECONDS_540: "SECONDS_540" = "SECONDS_540"
  val SECONDS_600: "SECONDS_600" = "SECONDS_600"

  @inline def values = js.Array[StatusUpdateInterval](
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
  val PAGE_TYPE_INITIAL: "PAGE_TYPE_INITIAL" = "PAGE_TYPE_INITIAL"
  val PAGE_TYPE_SUBTITLE: "PAGE_TYPE_SUBTITLE" = "PAGE_TYPE_SUBTITLE"
  val PAGE_TYPE_ADDL_INFO: "PAGE_TYPE_ADDL_INFO" = "PAGE_TYPE_ADDL_INFO"
  val PAGE_TYPE_PROGRAM_SCHEDULE: "PAGE_TYPE_PROGRAM_SCHEDULE" = "PAGE_TYPE_PROGRAM_SCHEDULE"
  val PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE: "PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE" = "PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE"

  @inline def values = js.Array[TeletextPageType](PAGE_TYPE_INITIAL, PAGE_TYPE_SUBTITLE, PAGE_TYPE_ADDL_INFO, PAGE_TYPE_PROGRAM_SCHEDULE, PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE)
}

/** Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to specify the location the burned-in timecode on output video.
  */
type TimecodeBurninPosition = "TOP_CENTER" | "TOP_LEFT" | "TOP_RIGHT" | "MIDDLE_LEFT" | "MIDDLE_CENTER" | "MIDDLE_RIGHT" | "BOTTOM_LEFT" | "BOTTOM_CENTER" | "BOTTOM_RIGHT"
object TimecodeBurninPosition {
  val TOP_CENTER: "TOP_CENTER" = "TOP_CENTER"
  val TOP_LEFT: "TOP_LEFT" = "TOP_LEFT"
  val TOP_RIGHT: "TOP_RIGHT" = "TOP_RIGHT"
  val MIDDLE_LEFT: "MIDDLE_LEFT" = "MIDDLE_LEFT"
  val MIDDLE_CENTER: "MIDDLE_CENTER" = "MIDDLE_CENTER"
  val MIDDLE_RIGHT: "MIDDLE_RIGHT" = "MIDDLE_RIGHT"
  val BOTTOM_LEFT: "BOTTOM_LEFT" = "BOTTOM_LEFT"
  val BOTTOM_CENTER: "BOTTOM_CENTER" = "BOTTOM_CENTER"
  val BOTTOM_RIGHT: "BOTTOM_RIGHT" = "BOTTOM_RIGHT"

  @inline def values = js.Array[TimecodeBurninPosition](TOP_CENTER, TOP_LEFT, TOP_RIGHT, MIDDLE_LEFT, MIDDLE_CENTER, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT)
}

/** Use Source (TimecodeSource) to set how timecodes are handled within this job. To make sure that your video, audio, captions, and markers are synchronized and that time-based features, such as image inserter, work correctly, choose the Timecode source option that matches your assets. All timecodes are in a 24-hour format with frame number (HH:MM:SS:FF). * Embedded (EMBEDDED) - Use the timecode that is in the input video. If no embedded timecode is in the source, the service will use Start at 0 (ZEROBASED) instead. * Start at 0 (ZEROBASED) - Set the timecode of the initial frame to 00:00:00:00. * Specified Start (SPECIFIEDSTART) - Set the timecode of the initial frame to a value other than zero. You use Start timecode (Start) to provide this value.
  */
type TimecodeSource = "EMBEDDED" | "ZEROBASED" | "SPECIFIEDSTART"
object TimecodeSource {
  val EMBEDDED: "EMBEDDED" = "EMBEDDED"
  val ZEROBASED: "ZEROBASED" = "ZEROBASED"
  val SPECIFIEDSTART: "SPECIFIEDSTART" = "SPECIFIEDSTART"

  @inline def values = js.Array[TimecodeSource](EMBEDDED, ZEROBASED, SPECIFIEDSTART)
}

/** Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed metadata from the input in this output.
  */
type TimedMetadata = "PASSTHROUGH" | "NONE"
object TimedMetadata {
  val PASSTHROUGH: "PASSTHROUGH" = "PASSTHROUGH"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[TimedMetadata](PASSTHROUGH, NONE)
}

/** Pass through style and position information from a TTML-like input source (TTML, IMSC, SMPTE-TT) to the TTML output.
  */
type TtmlStylePassthrough = "ENABLED" | "DISABLED"
object TtmlStylePassthrough {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[TtmlStylePassthrough](ENABLED, DISABLED)
}

type Type = "SYSTEM" | "CUSTOM"
object Type {
  val SYSTEM: "SYSTEM" = "SYSTEM"
  val CUSTOM: "CUSTOM" = "CUSTOM"

  @inline def values = js.Array[Type](SYSTEM, CUSTOM)
}

/** Specify the VC3 class to choose the quality characteristics for this output. VC3 class, together with the settings Framerate (framerateNumerator and framerateDenominator) and Resolution (height and width), determine your output bitrate. For example, say that your video resolution is 1920x1080 and your framerate is 29.97. Then Class 145 (CLASS_145) gives you an output with a bitrate of approximately 145 Mbps and Class 220 (CLASS_220) gives you and output with a bitrate of approximately 220 Mbps. VC3 class also specifies the color bit depth of your output.
  */
type Vc3Class = "CLASS_145_8BIT" | "CLASS_220_8BIT" | "CLASS_220_10BIT"
object Vc3Class {
  val CLASS_145_8BIT: "CLASS_145_8BIT" = "CLASS_145_8BIT"
  val CLASS_220_8BIT: "CLASS_220_8BIT" = "CLASS_220_8BIT"
  val CLASS_220_10BIT: "CLASS_220_10BIT" = "CLASS_220_10BIT"

  @inline def values = js.Array[Vc3Class](CLASS_145_8BIT, CLASS_220_8BIT, CLASS_220_10BIT)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
type Vc3FramerateControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object Vc3FramerateControl {
  val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  @inline def values = js.Array[Vc3FramerateControl](INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
type Vc3FramerateConversionAlgorithm = "DUPLICATE_DROP" | "INTERPOLATE" | "FRAMEFORMER"
object Vc3FramerateConversionAlgorithm {
  val DUPLICATE_DROP: "DUPLICATE_DROP" = "DUPLICATE_DROP"
  val INTERPOLATE: "INTERPOLATE" = "INTERPOLATE"
  val FRAMEFORMER: "FRAMEFORMER" = "FRAMEFORMER"

  @inline def values = js.Array[Vc3FramerateConversionAlgorithm](DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** Optional. Choose the scan line type for this output. If you don't specify a value, MediaConvert will create a progressive output.
  */
type Vc3InterlaceMode = "INTERLACED" | "PROGRESSIVE"
object Vc3InterlaceMode {
  val INTERLACED: "INTERLACED" = "INTERLACED"
  val PROGRESSIVE: "PROGRESSIVE" = "PROGRESSIVE"

  @inline def values = js.Array[Vc3InterlaceMode](INTERLACED, PROGRESSIVE)
}

/** Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
  */
type Vc3ScanTypeConversionMode = "INTERLACED" | "INTERLACED_OPTIMIZE"
object Vc3ScanTypeConversionMode {
  val INTERLACED: "INTERLACED" = "INTERLACED"
  val INTERLACED_OPTIMIZE: "INTERLACED_OPTIMIZE" = "INTERLACED_OPTIMIZE"

  @inline def values = js.Array[Vc3ScanTypeConversionMode](INTERLACED, INTERLACED_OPTIMIZE)
}

/** Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling this setting will slightly reduce the duration of your video. Related settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
  */
type Vc3SlowPal = "DISABLED" | "ENABLED"
object Vc3SlowPal {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[Vc3SlowPal](DISABLED, ENABLED)
}

/** When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother picture.
  */
type Vc3Telecine = "NONE" | "HARD"
object Vc3Telecine {
  val NONE: "NONE" = "NONE"
  val HARD: "HARD" = "HARD"

  @inline def values = js.Array[Vc3Telecine](NONE, HARD)
}

/** Type of video codec
  */
type VideoCodec = "AV1" | "AVC_INTRA" | "FRAME_CAPTURE" | "H_264" | "H_265" | "MPEG2" | "PRORES" | "VC3" | "VP8" | "VP9"
object VideoCodec {
  val AV1: "AV1" = "AV1"
  val AVC_INTRA: "AVC_INTRA" = "AVC_INTRA"
  val FRAME_CAPTURE: "FRAME_CAPTURE" = "FRAME_CAPTURE"
  val H_264: "H_264" = "H_264"
  val H_265: "H_265" = "H_265"
  val MPEG2: "MPEG2" = "MPEG2"
  val PRORES: "PRORES" = "PRORES"
  val VC3: "VC3" = "VC3"
  val VP8: "VP8" = "VP8"
  val VP9: "VP9" = "VP9"

  @inline def values = js.Array[VideoCodec](AV1, AVC_INTRA, FRAME_CAPTURE, H_264, H_265, MPEG2, PRORES, VC3, VP8, VP9)
}

/** Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable Timecode insertion when the input frame rate is identical to the output frame rate. To include timecodes in this output, set Timecode insertion (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is DISABLED. When the service inserts timecodes in an output, by default, it uses any embedded timecodes from the input. If none are present, the service will set the timecode for the first output frame to zero. To change this default behavior, adjust the settings under Timecode configuration (TimecodeConfig). In the console, these settings are located under Job > Job settings > Timecode configuration. Note - Timecode source under input settings (InputTimecodeSource) does not affect the timecodes that are inserted in the output. Source under Job settings > Timecode configuration (TimecodeSource) does.
  */
type VideoTimecodeInsertion = "DISABLED" | "PIC_TIMING_SEI"
object VideoTimecodeInsertion {
  val DISABLED: "DISABLED" = "DISABLED"
  val PIC_TIMING_SEI: "PIC_TIMING_SEI" = "PIC_TIMING_SEI"

  @inline def values = js.Array[VideoTimecodeInsertion](DISABLED, PIC_TIMING_SEI)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
type Vp8FramerateControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object Vp8FramerateControl {
  val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  @inline def values = js.Array[Vp8FramerateControl](INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
type Vp8FramerateConversionAlgorithm = "DUPLICATE_DROP" | "INTERPOLATE" | "FRAMEFORMER"
object Vp8FramerateConversionAlgorithm {
  val DUPLICATE_DROP: "DUPLICATE_DROP" = "DUPLICATE_DROP"
  val INTERPOLATE: "INTERPOLATE" = "INTERPOLATE"
  val FRAMEFORMER: "FRAMEFORMER" = "FRAMEFORMER"

  @inline def values = js.Array[Vp8FramerateConversionAlgorithm](DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
  */
type Vp8ParControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object Vp8ParControl {
  val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  @inline def values = js.Array[Vp8ParControl](INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, multi-pass encoding.
  */
type Vp8QualityTuningLevel = "MULTI_PASS" | "MULTI_PASS_HQ"
object Vp8QualityTuningLevel {
  val MULTI_PASS: "MULTI_PASS" = "MULTI_PASS"
  val MULTI_PASS_HQ: "MULTI_PASS_HQ" = "MULTI_PASS_HQ"

  @inline def values = js.Array[Vp8QualityTuningLevel](MULTI_PASS, MULTI_PASS_HQ)
}

/** With the VP8 codec, you can use only the variable bitrate (VBR) rate control mode.
  */
type Vp8RateControlMode = "VBR"
object Vp8RateControlMode {
  val VBR: "VBR" = "VBR"

  @inline def values = js.Array[Vp8RateControlMode](VBR)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
type Vp9FramerateControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object Vp9FramerateControl {
  val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  @inline def values = js.Array[Vp9FramerateControl](INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
type Vp9FramerateConversionAlgorithm = "DUPLICATE_DROP" | "INTERPOLATE" | "FRAMEFORMER"
object Vp9FramerateConversionAlgorithm {
  val DUPLICATE_DROP: "DUPLICATE_DROP" = "DUPLICATE_DROP"
  val INTERPOLATE: "INTERPOLATE" = "INTERPOLATE"
  val FRAMEFORMER: "FRAMEFORMER" = "FRAMEFORMER"

  @inline def values = js.Array[Vp9FramerateConversionAlgorithm](DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
  */
type Vp9ParControl = "INITIALIZE_FROM_SOURCE" | "SPECIFIED"
object Vp9ParControl {
  val INITIALIZE_FROM_SOURCE: "INITIALIZE_FROM_SOURCE" = "INITIALIZE_FROM_SOURCE"
  val SPECIFIED: "SPECIFIED" = "SPECIFIED"

  @inline def values = js.Array[Vp9ParControl](INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, multi-pass encoding.
  */
type Vp9QualityTuningLevel = "MULTI_PASS" | "MULTI_PASS_HQ"
object Vp9QualityTuningLevel {
  val MULTI_PASS: "MULTI_PASS" = "MULTI_PASS"
  val MULTI_PASS_HQ: "MULTI_PASS_HQ" = "MULTI_PASS_HQ"

  @inline def values = js.Array[Vp9QualityTuningLevel](MULTI_PASS, MULTI_PASS_HQ)
}

/** With the VP9 codec, you can use only the variable bitrate (VBR) rate control mode.
  */
type Vp9RateControlMode = "VBR"
object Vp9RateControlMode {
  val VBR: "VBR" = "VBR"

  @inline def values = js.Array[Vp9RateControlMode](VBR)
}

/** Optional. Ignore this setting unless Nagra support directs you to specify a value. When you don't specify a value here, the Nagra NexGuard library uses its default value.
  */
type WatermarkingStrength = "LIGHTEST" | "LIGHTER" | "DEFAULT" | "STRONGER" | "STRONGEST"
object WatermarkingStrength {
  val LIGHTEST: "LIGHTEST" = "LIGHTEST"
  val LIGHTER: "LIGHTER" = "LIGHTER"
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val STRONGER: "STRONGER" = "STRONGER"
  val STRONGEST: "STRONGEST" = "STRONGEST"

  @inline def values = js.Array[WatermarkingStrength](LIGHTEST, LIGHTER, DEFAULT, STRONGER, STRONGEST)
}

/** The service defaults to using RIFF for WAV outputs. If your output audio is likely to exceed 4 GB in file size, or if you otherwise need the extended support of the RF64 format, set your output WAV file format to RF64.
  */
type WavFormat = "RIFF" | "RF64"
object WavFormat {
  val RIFF: "RIFF" = "RIFF"
  val RF64: "RF64" = "RF64"

  @inline def values = js.Array[WavFormat](RIFF, RF64)
}

/** If your input captions format is teletext or teletext inside of STL, enable this setting to pass through style, color, and position information to your WebVTT output captions.
  */
type WebvttStylePassthrough = "ENABLED" | "DISABLED"
object WebvttStylePassthrough {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[WebvttStylePassthrough](ENABLED, DISABLED)
}
