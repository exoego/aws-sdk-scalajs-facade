package facade.amazonaws.services.mediaconvert

import scalajs.js

/** Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio + audio description (AD) as a stereo pair. The value for AudioType will be set to 3, which signals to downstream systems that this stream contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does not perform the mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any values you provide in AudioType and FollowInputAudioType. Choose NORMAL when the input does not contain pre-mixed audio + audio description (AD). In this case, the encoder will use any values you provide for AudioType and FollowInputAudioType.
  */
@js.native
sealed trait AacAudioDescriptionBroadcasterMix extends js.Any
object AacAudioDescriptionBroadcasterMix {
  val BROADCASTER_MIXED_AD = "BROADCASTER_MIXED_AD".asInstanceOf[AacAudioDescriptionBroadcasterMix]
  val NORMAL = "NORMAL".asInstanceOf[AacAudioDescriptionBroadcasterMix]

  @inline def values: js.Array[AacAudioDescriptionBroadcasterMix] = js.Array(BROADCASTER_MIXED_AD, NORMAL)
}

/** AAC Profile.
  */
@js.native
sealed trait AacCodecProfile extends js.Any
object AacCodecProfile {
  val LC = "LC".asInstanceOf[AacCodecProfile]
  val HEV1 = "HEV1".asInstanceOf[AacCodecProfile]
  val HEV2 = "HEV2".asInstanceOf[AacCodecProfile]

  @inline def values: js.Array[AacCodecProfile] = js.Array(LC, HEV1, HEV2)
}

/** Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. "1.0 - Audio Description (Receiver Mix)" setting receives a stereo description plus control track and emits a mono AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
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

/** Rate Control Mode.
  */
@js.native
sealed trait AacRateControlMode extends js.Any
object AacRateControlMode {
  val CBR = "CBR".asInstanceOf[AacRateControlMode]
  val VBR = "VBR".asInstanceOf[AacRateControlMode]

  @inline def values: js.Array[AacRateControlMode] = js.Array(CBR, VBR)
}

/** Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an output, you must choose "No container" for the output container.
  */
@js.native
sealed trait AacRawFormat extends js.Any
object AacRawFormat {
  val LATM_LOAS = "LATM_LOAS".asInstanceOf[AacRawFormat]
  val NONE = "NONE".asInstanceOf[AacRawFormat]

  @inline def values: js.Array[AacRawFormat] = js.Array(LATM_LOAS, NONE)
}

/** Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
  */
@js.native
sealed trait AacSpecification extends js.Any
object AacSpecification {
  val MPEG2 = "MPEG2".asInstanceOf[AacSpecification]
  val MPEG4 = "MPEG4".asInstanceOf[AacSpecification]

  @inline def values: js.Array[AacSpecification] = js.Array(MPEG2, MPEG4)
}

/** VBR Quality Level - Only used if rate_control_mode is VBR.
  */
@js.native
sealed trait AacVbrQuality extends js.Any
object AacVbrQuality {
  val LOW = "LOW".asInstanceOf[AacVbrQuality]
  val MEDIUM_LOW = "MEDIUM_LOW".asInstanceOf[AacVbrQuality]
  val MEDIUM_HIGH = "MEDIUM_HIGH".asInstanceOf[AacVbrQuality]
  val HIGH = "HIGH".asInstanceOf[AacVbrQuality]

  @inline def values: js.Array[AacVbrQuality] = js.Array(LOW, MEDIUM_LOW, MEDIUM_HIGH, HIGH)
}

/** Specify the bitstream mode for the AC-3 stream that the encoder emits. For more information about the AC3 bitstream mode, see ATSC A/52-2012 (Annex E).
  */
@js.native
sealed trait Ac3BitstreamMode extends js.Any
object Ac3BitstreamMode {
  val COMPLETE_MAIN = "COMPLETE_MAIN".asInstanceOf[Ac3BitstreamMode]
  val COMMENTARY = "COMMENTARY".asInstanceOf[Ac3BitstreamMode]
  val DIALOGUE = "DIALOGUE".asInstanceOf[Ac3BitstreamMode]
  val EMERGENCY = "EMERGENCY".asInstanceOf[Ac3BitstreamMode]
  val HEARING_IMPAIRED = "HEARING_IMPAIRED".asInstanceOf[Ac3BitstreamMode]
  val MUSIC_AND_EFFECTS = "MUSIC_AND_EFFECTS".asInstanceOf[Ac3BitstreamMode]
  val VISUALLY_IMPAIRED = "VISUALLY_IMPAIRED".asInstanceOf[Ac3BitstreamMode]
  val VOICE_OVER = "VOICE_OVER".asInstanceOf[Ac3BitstreamMode]

  @inline def values: js.Array[Ac3BitstreamMode] = js.Array(COMPLETE_MAIN, COMMENTARY, DIALOGUE, EMERGENCY, HEARING_IMPAIRED, MUSIC_AND_EFFECTS, VISUALLY_IMPAIRED, VOICE_OVER)
}

/** Dolby Digital coding mode. Determines number of channels.
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

/** Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the Dolby Digital stream for the line operating mode. Related setting: When you use this setting, MediaConvert ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
  */
@js.native
sealed trait Ac3DynamicRangeCompressionLine extends js.Any
object Ac3DynamicRangeCompressionLine {
  val FILM_STANDARD = "FILM_STANDARD".asInstanceOf[Ac3DynamicRangeCompressionLine]
  val FILM_LIGHT = "FILM_LIGHT".asInstanceOf[Ac3DynamicRangeCompressionLine]
  val MUSIC_STANDARD = "MUSIC_STANDARD".asInstanceOf[Ac3DynamicRangeCompressionLine]
  val MUSIC_LIGHT = "MUSIC_LIGHT".asInstanceOf[Ac3DynamicRangeCompressionLine]
  val SPEECH = "SPEECH".asInstanceOf[Ac3DynamicRangeCompressionLine]
  val NONE = "NONE".asInstanceOf[Ac3DynamicRangeCompressionLine]

  @inline def values: js.Array[Ac3DynamicRangeCompressionLine] = js.Array(FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH, NONE)
}

/** When you want to add Dolby dynamic range compression (DRC) signaling to your output stream, we recommend that you use the mode-specific settings instead of Dynamic range compression profile (DynamicRangeCompressionProfile). The mode-specific settings are Dynamic range compression profile, line mode (dynamicRangeCompressionLine) and Dynamic range compression profile, RF mode (dynamicRangeCompressionRf). Note that when you specify values for all three settings, MediaConvert ignores the value of this setting in favor of the mode-specific settings. If you do use this setting instead of the mode-specific settings, choose None (NONE) to leave out DRC signaling. Keep the default Film standard (FILM_STANDARD) to set the profile to Dolby's film standard profile for all operating modes.
  */
@js.native
sealed trait Ac3DynamicRangeCompressionProfile extends js.Any
object Ac3DynamicRangeCompressionProfile {
  val FILM_STANDARD = "FILM_STANDARD".asInstanceOf[Ac3DynamicRangeCompressionProfile]
  val NONE = "NONE".asInstanceOf[Ac3DynamicRangeCompressionProfile]

  @inline def values: js.Array[Ac3DynamicRangeCompressionProfile] = js.Array(FILM_STANDARD, NONE)
}

/** Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the Dolby Digital stream for the RF operating mode. Related setting: When you use this setting, MediaConvert ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
  */
@js.native
sealed trait Ac3DynamicRangeCompressionRf extends js.Any
object Ac3DynamicRangeCompressionRf {
  val FILM_STANDARD = "FILM_STANDARD".asInstanceOf[Ac3DynamicRangeCompressionRf]
  val FILM_LIGHT = "FILM_LIGHT".asInstanceOf[Ac3DynamicRangeCompressionRf]
  val MUSIC_STANDARD = "MUSIC_STANDARD".asInstanceOf[Ac3DynamicRangeCompressionRf]
  val MUSIC_LIGHT = "MUSIC_LIGHT".asInstanceOf[Ac3DynamicRangeCompressionRf]
  val SPEECH = "SPEECH".asInstanceOf[Ac3DynamicRangeCompressionRf]
  val NONE = "NONE".asInstanceOf[Ac3DynamicRangeCompressionRf]

  @inline def values: js.Array[Ac3DynamicRangeCompressionRf] = js.Array(FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH, NONE)
}

/** Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
  */
@js.native
sealed trait Ac3LfeFilter extends js.Any
object Ac3LfeFilter {
  val ENABLED = "ENABLED".asInstanceOf[Ac3LfeFilter]
  val DISABLED = "DISABLED".asInstanceOf[Ac3LfeFilter]

  @inline def values: js.Array[Ac3LfeFilter] = js.Array(ENABLED, DISABLED)
}

/** When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
  */
@js.native
sealed trait Ac3MetadataControl extends js.Any
object Ac3MetadataControl {
  val FOLLOW_INPUT = "FOLLOW_INPUT".asInstanceOf[Ac3MetadataControl]
  val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[Ac3MetadataControl]

  @inline def values: js.Array[Ac3MetadataControl] = js.Array(FOLLOW_INPUT, USE_CONFIGURED)
}

/** Specify whether the service runs your job with accelerated transcoding. Choose DISABLED if you don't want accelerated transcoding. Choose ENABLED if you want your job to run with accelerated transcoding and to fail if your input files or your job settings aren't compatible with accelerated transcoding. Choose PREFERRED if you want your job to run with accelerated transcoding if the job is compatible with the feature and to run at standard speed if it's not.
  */
@js.native
sealed trait AccelerationMode extends js.Any
object AccelerationMode {
  val DISABLED = "DISABLED".asInstanceOf[AccelerationMode]
  val ENABLED = "ENABLED".asInstanceOf[AccelerationMode]
  val PREFERRED = "PREFERRED".asInstanceOf[AccelerationMode]

  @inline def values: js.Array[AccelerationMode] = js.Array(DISABLED, ENABLED, PREFERRED)
}

/** Describes whether the current job is running with accelerated transcoding. For jobs that have Acceleration (AccelerationMode) set to DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have Acceleration (AccelerationMode) set to ENABLED or PREFERRED, AccelerationStatus is one of the other states. AccelerationStatus is IN_PROGRESS initially, while the service determines whether the input files and job settings are compatible with accelerated transcoding. If they are, AcclerationStatus is ACCELERATED. If your input files and job settings aren't compatible with accelerated transcoding, the service either fails your job or runs it without accelerated transcoding, depending on how you set Acceleration (AccelerationMode). When the service runs your job without accelerated transcoding, AccelerationStatus is NOT_ACCELERATED.
  */
@js.native
sealed trait AccelerationStatus extends js.Any
object AccelerationStatus {
  val NOT_APPLICABLE = "NOT_APPLICABLE".asInstanceOf[AccelerationStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AccelerationStatus]
  val ACCELERATED = "ACCELERATED".asInstanceOf[AccelerationStatus]
  val NOT_ACCELERATED = "NOT_ACCELERATED".asInstanceOf[AccelerationStatus]

  @inline def values: js.Array[AccelerationStatus] = js.Array(NOT_APPLICABLE, IN_PROGRESS, ACCELERATED, NOT_ACCELERATED)
}

/** This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert AFD signaling (AfdSignaling) to specify whether the service includes AFD values in the output video data and what those values are. * Choose None to remove all AFD values from this output. * Choose Fixed to ignore input AFD values and instead encode the value specified in the job. * Choose Auto to calculate output AFD values based on the input AFD scaler data.
  */
@js.native
sealed trait AfdSignaling extends js.Any
object AfdSignaling {
  val NONE = "NONE".asInstanceOf[AfdSignaling]
  val AUTO = "AUTO".asInstanceOf[AfdSignaling]
  val FIXED = "FIXED".asInstanceOf[AfdSignaling]

  @inline def values: js.Array[AfdSignaling] = js.Array(NONE, AUTO, FIXED)
}

/** Ignore this setting unless this input is a QuickTime animation with an alpha channel. Use this setting to create separate Key and Fill outputs. In each output, specify which part of the input MediaConvert uses. Leave this setting at the default value DISCARD to delete the alpha channel and preserve the video. Set it to REMAP_TO_LUMA to delete the video and map the alpha channel to the luma channel of your outputs.
  */
@js.native
sealed trait AlphaBehavior extends js.Any
object AlphaBehavior {
  val DISCARD = "DISCARD".asInstanceOf[AlphaBehavior]
  val REMAP_TO_LUMA = "REMAP_TO_LUMA".asInstanceOf[AlphaBehavior]

  @inline def values: js.Array[AlphaBehavior] = js.Array(DISCARD, REMAP_TO_LUMA)
}

/** Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
  */
@js.native
sealed trait AncillaryConvert608To708 extends js.Any
object AncillaryConvert608To708 {
  val UPCONVERT = "UPCONVERT".asInstanceOf[AncillaryConvert608To708]
  val DISABLED = "DISABLED".asInstanceOf[AncillaryConvert608To708]

  @inline def values: js.Array[AncillaryConvert608To708] = js.Array(UPCONVERT, DISABLED)
}

/** By default, the service terminates any unterminated captions at the end of each input. If you want the caption to continue onto your next input, disable this setting.
  */
@js.native
sealed trait AncillaryTerminateCaptions extends js.Any
object AncillaryTerminateCaptions {
  val END_OF_INPUT = "END_OF_INPUT".asInstanceOf[AncillaryTerminateCaptions]
  val DISABLED = "DISABLED".asInstanceOf[AncillaryTerminateCaptions]

  @inline def values: js.Array[AncillaryTerminateCaptions] = js.Array(END_OF_INPUT, DISABLED)
}

/** The anti-alias filter is automatically applied to all outputs. The service no longer accepts the value DISABLED for AntiAlias. If you specify that in your job, the service will ignore the setting.
  */
@js.native
sealed trait AntiAlias extends js.Any
object AntiAlias {
  val DISABLED = "DISABLED".asInstanceOf[AntiAlias]
  val ENABLED = "ENABLED".asInstanceOf[AntiAlias]

  @inline def values: js.Array[AntiAlias] = js.Array(DISABLED, ENABLED)
}

/** You can add a tag for this mono-channel audio track to mimic its placement in a multi-channel layout. For example, if this track is the left surround channel, choose Left surround (LS).
  */
@js.native
sealed trait AudioChannelTag extends js.Any
object AudioChannelTag {
  val L = "L".asInstanceOf[AudioChannelTag]
  val R = "R".asInstanceOf[AudioChannelTag]
  val C = "C".asInstanceOf[AudioChannelTag]
  val LFE = "LFE".asInstanceOf[AudioChannelTag]
  val LS = "LS".asInstanceOf[AudioChannelTag]
  val RS = "RS".asInstanceOf[AudioChannelTag]
  val LC = "LC".asInstanceOf[AudioChannelTag]
  val RC = "RC".asInstanceOf[AudioChannelTag]
  val CS = "CS".asInstanceOf[AudioChannelTag]
  val LSD = "LSD".asInstanceOf[AudioChannelTag]
  val RSD = "RSD".asInstanceOf[AudioChannelTag]
  val TCS = "TCS".asInstanceOf[AudioChannelTag]
  val VHL = "VHL".asInstanceOf[AudioChannelTag]
  val VHC = "VHC".asInstanceOf[AudioChannelTag]
  val VHR = "VHR".asInstanceOf[AudioChannelTag]

  @inline def values: js.Array[AudioChannelTag] = js.Array(L, R, C, LFE, LS, RS, LC, RC, CS, LSD, RSD, TCS, VHL, VHC, VHR)
}

/** Type of Audio codec.
  */
@js.native
sealed trait AudioCodec extends js.Any
object AudioCodec {
  val AAC = "AAC".asInstanceOf[AudioCodec]
  val MP2 = "MP2".asInstanceOf[AudioCodec]
  val MP3 = "MP3".asInstanceOf[AudioCodec]
  val WAV = "WAV".asInstanceOf[AudioCodec]
  val AIFF = "AIFF".asInstanceOf[AudioCodec]
  val AC3 = "AC3".asInstanceOf[AudioCodec]
  val EAC3 = "EAC3".asInstanceOf[AudioCodec]
  val EAC3_ATMOS = "EAC3_ATMOS".asInstanceOf[AudioCodec]
  val VORBIS = "VORBIS".asInstanceOf[AudioCodec]
  val OPUS = "OPUS".asInstanceOf[AudioCodec]
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[AudioCodec]

  @inline def values: js.Array[AudioCodec] = js.Array(AAC, MP2, MP3, WAV, AIFF, AC3, EAC3, EAC3_ATMOS, VORBIS, OPUS, PASSTHROUGH)
}

/** Enable this setting on one audio selector to set it as the default for the job. The service uses this default for outputs where it can't find the specified input audio. If you don't set a default, those outputs have no audio.
  */
@js.native
sealed trait AudioDefaultSelection extends js.Any
object AudioDefaultSelection {
  val DEFAULT = "DEFAULT".asInstanceOf[AudioDefaultSelection]
  val NOT_DEFAULT = "NOT_DEFAULT".asInstanceOf[AudioDefaultSelection]

  @inline def values: js.Array[AudioDefaultSelection] = js.Array(DEFAULT, NOT_DEFAULT)
}

/** Specify which source for language code takes precedence for this audio track. When you choose Follow input (FOLLOW_INPUT), the service uses the language code from the input track if it's present. If there's no languge code on the input track, the service uses the code that you specify in the setting Language code (languageCode or customLanguageCode). When you choose Use configured (USE_CONFIGURED), the service uses the language code that you specify.
  */
@js.native
sealed trait AudioLanguageCodeControl extends js.Any
object AudioLanguageCodeControl {
  val FOLLOW_INPUT = "FOLLOW_INPUT".asInstanceOf[AudioLanguageCodeControl]
  val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[AudioLanguageCodeControl]

  @inline def values: js.Array[AudioLanguageCodeControl] = js.Array(FOLLOW_INPUT, USE_CONFIGURED)
}

/** Choose one of the following audio normalization algorithms: ITU-R BS.1770-1: Ungated loudness. A measurement of ungated average loudness for an entire piece of content, suitable for measurement of short-form content under ATSC recommendation A/85. Supports up to 5.1 audio channels. ITU-R BS.1770-2: Gated loudness. A measurement of gated average loudness compliant with the requirements of EBU-R128. Supports up to 5.1 audio channels. ITU-R BS.1770-3: Modified peak. The same loudness measurement algorithm as 1770-2, with an updated true peak measurement. ITU-R BS.1770-4: Higher channel count. Allows for more audio channels than the other algorithms, including configurations such as 7.1.
  */
@js.native
sealed trait AudioNormalizationAlgorithm extends js.Any
object AudioNormalizationAlgorithm {
  val ITU_BS_1770_1 = "ITU_BS_1770_1".asInstanceOf[AudioNormalizationAlgorithm]
  val ITU_BS_1770_2 = "ITU_BS_1770_2".asInstanceOf[AudioNormalizationAlgorithm]
  val ITU_BS_1770_3 = "ITU_BS_1770_3".asInstanceOf[AudioNormalizationAlgorithm]
  val ITU_BS_1770_4 = "ITU_BS_1770_4".asInstanceOf[AudioNormalizationAlgorithm]

  @inline def values: js.Array[AudioNormalizationAlgorithm] = js.Array(ITU_BS_1770_1, ITU_BS_1770_2, ITU_BS_1770_3, ITU_BS_1770_4)
}

/** When enabled the output audio is corrected using the chosen algorithm. If disabled, the audio will be measured but not adjusted.
  */
@js.native
sealed trait AudioNormalizationAlgorithmControl extends js.Any
object AudioNormalizationAlgorithmControl {
  val CORRECT_AUDIO = "CORRECT_AUDIO".asInstanceOf[AudioNormalizationAlgorithmControl]
  val MEASURE_ONLY = "MEASURE_ONLY".asInstanceOf[AudioNormalizationAlgorithmControl]

  @inline def values: js.Array[AudioNormalizationAlgorithmControl] = js.Array(CORRECT_AUDIO, MEASURE_ONLY)
}

/** If set to LOG, log each output's audio track loudness to a CSV file.
  */
@js.native
sealed trait AudioNormalizationLoudnessLogging extends js.Any
object AudioNormalizationLoudnessLogging {
  val LOG = "LOG".asInstanceOf[AudioNormalizationLoudnessLogging]
  val DONT_LOG = "DONT_LOG".asInstanceOf[AudioNormalizationLoudnessLogging]

  @inline def values: js.Array[AudioNormalizationLoudnessLogging] = js.Array(LOG, DONT_LOG)
}

/** If set to TRUE_PEAK, calculate and log the TruePeak for each output's audio track loudness.
  */
@js.native
sealed trait AudioNormalizationPeakCalculation extends js.Any
object AudioNormalizationPeakCalculation {
  val TRUE_PEAK = "TRUE_PEAK".asInstanceOf[AudioNormalizationPeakCalculation]
  val NONE = "NONE".asInstanceOf[AudioNormalizationPeakCalculation]

  @inline def values: js.Array[AudioNormalizationPeakCalculation] = js.Array(TRUE_PEAK, NONE)
}

/** Specifies the type of the audio selector.
  */
@js.native
sealed trait AudioSelectorType extends js.Any
object AudioSelectorType {
  val PID = "PID".asInstanceOf[AudioSelectorType]
  val TRACK = "TRACK".asInstanceOf[AudioSelectorType]
  val LANGUAGE_CODE = "LANGUAGE_CODE".asInstanceOf[AudioSelectorType]

  @inline def values: js.Array[AudioSelectorType] = js.Array(PID, TRACK, LANGUAGE_CODE)
}

/** When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise the value in Audio Type is included in the output. Note that this field and audioType are both ignored if audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
  */
@js.native
sealed trait AudioTypeControl extends js.Any
object AudioTypeControl {
  val FOLLOW_INPUT = "FOLLOW_INPUT".asInstanceOf[AudioTypeControl]
  val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[AudioTypeControl]

  @inline def values: js.Array[AudioTypeControl] = js.Array(FOLLOW_INPUT, USE_CONFIGURED)
}

/** Specify the strength of any adaptive quantization filters that you enable. The value that you choose here applies to Spatial adaptive quantization (spatialAdaptiveQuantization).
  */
@js.native
sealed trait Av1AdaptiveQuantization extends js.Any
object Av1AdaptiveQuantization {
  val OFF = "OFF".asInstanceOf[Av1AdaptiveQuantization]
  val LOW = "LOW".asInstanceOf[Av1AdaptiveQuantization]
  val MEDIUM = "MEDIUM".asInstanceOf[Av1AdaptiveQuantization]
  val HIGH = "HIGH".asInstanceOf[Av1AdaptiveQuantization]
  val HIGHER = "HIGHER".asInstanceOf[Av1AdaptiveQuantization]
  val MAX = "MAX".asInstanceOf[Av1AdaptiveQuantization]

  @inline def values: js.Array[Av1AdaptiveQuantization] = js.Array(OFF, LOW, MEDIUM, HIGH, HIGHER, MAX)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
@js.native
sealed trait Av1FramerateControl extends js.Any
object Av1FramerateControl {
  val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[Av1FramerateControl]
  val SPECIFIED = "SPECIFIED".asInstanceOf[Av1FramerateControl]

  @inline def values: js.Array[Av1FramerateControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
@js.native
sealed trait Av1FramerateConversionAlgorithm extends js.Any
object Av1FramerateConversionAlgorithm {
  val DUPLICATE_DROP = "DUPLICATE_DROP".asInstanceOf[Av1FramerateConversionAlgorithm]
  val INTERPOLATE = "INTERPOLATE".asInstanceOf[Av1FramerateConversionAlgorithm]
  val FRAMEFORMER = "FRAMEFORMER".asInstanceOf[Av1FramerateConversionAlgorithm]

  @inline def values: js.Array[Av1FramerateConversionAlgorithm] = js.Array(DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** 'With AV1 outputs, for rate control mode, MediaConvert supports only quality-defined variable bitrate (QVBR). You can''t use CBR or VBR.'
  */
@js.native
sealed trait Av1RateControlMode extends js.Any
object Av1RateControlMode {
  val QVBR = "QVBR".asInstanceOf[Av1RateControlMode]

  @inline def values: js.Array[Av1RateControlMode] = js.Array(QVBR)
}

/** Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture, you might choose to disable this feature. Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video
  * games, set it to Low. For content with a wider variety of textures, set it to High or Higher.
  */
@js.native
sealed trait Av1SpatialAdaptiveQuantization extends js.Any
object Av1SpatialAdaptiveQuantization {
  val DISABLED = "DISABLED".asInstanceOf[Av1SpatialAdaptiveQuantization]
  val ENABLED = "ENABLED".asInstanceOf[Av1SpatialAdaptiveQuantization]

  @inline def values: js.Array[Av1SpatialAdaptiveQuantization] = js.Array(DISABLED, ENABLED)
}

/** Specify the AVC-Intra class of your output. The AVC-Intra class selection determines the output video bit rate depending on the frame rate of the output. Outputs with higher class values have higher bitrates and improved image quality. Note that for Class 4K/2K, MediaConvert supports only 4:2:2 chroma subsampling.
  */
@js.native
sealed trait AvcIntraClass extends js.Any
object AvcIntraClass {
  val CLASS_50 = "CLASS_50".asInstanceOf[AvcIntraClass]
  val CLASS_100 = "CLASS_100".asInstanceOf[AvcIntraClass]
  val CLASS_200 = "CLASS_200".asInstanceOf[AvcIntraClass]
  val CLASS_4K_2K = "CLASS_4K_2K".asInstanceOf[AvcIntraClass]

  @inline def values: js.Array[AvcIntraClass] = js.Array(CLASS_50, CLASS_100, CLASS_200, CLASS_4K_2K)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
@js.native
sealed trait AvcIntraFramerateControl extends js.Any
object AvcIntraFramerateControl {
  val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[AvcIntraFramerateControl]
  val SPECIFIED = "SPECIFIED".asInstanceOf[AvcIntraFramerateControl]

  @inline def values: js.Array[AvcIntraFramerateControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
@js.native
sealed trait AvcIntraFramerateConversionAlgorithm extends js.Any
object AvcIntraFramerateConversionAlgorithm {
  val DUPLICATE_DROP = "DUPLICATE_DROP".asInstanceOf[AvcIntraFramerateConversionAlgorithm]
  val INTERPOLATE = "INTERPOLATE".asInstanceOf[AvcIntraFramerateConversionAlgorithm]
  val FRAMEFORMER = "FRAMEFORMER".asInstanceOf[AvcIntraFramerateConversionAlgorithm]

  @inline def values: js.Array[AvcIntraFramerateConversionAlgorithm] = js.Array(DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
  */
@js.native
sealed trait AvcIntraInterlaceMode extends js.Any
object AvcIntraInterlaceMode {
  val PROGRESSIVE = "PROGRESSIVE".asInstanceOf[AvcIntraInterlaceMode]
  val TOP_FIELD = "TOP_FIELD".asInstanceOf[AvcIntraInterlaceMode]
  val BOTTOM_FIELD = "BOTTOM_FIELD".asInstanceOf[AvcIntraInterlaceMode]
  val FOLLOW_TOP_FIELD = "FOLLOW_TOP_FIELD".asInstanceOf[AvcIntraInterlaceMode]
  val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD".asInstanceOf[AvcIntraInterlaceMode]

  @inline def values: js.Array[AvcIntraInterlaceMode] = js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD)
}

/** Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
  */
@js.native
sealed trait AvcIntraScanTypeConversionMode extends js.Any
object AvcIntraScanTypeConversionMode {
  val INTERLACED = "INTERLACED".asInstanceOf[AvcIntraScanTypeConversionMode]
  val INTERLACED_OPTIMIZE = "INTERLACED_OPTIMIZE".asInstanceOf[AvcIntraScanTypeConversionMode]

  @inline def values: js.Array[AvcIntraScanTypeConversionMode] = js.Array(INTERLACED, INTERLACED_OPTIMIZE)
}

/** Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
  */
@js.native
sealed trait AvcIntraSlowPal extends js.Any
object AvcIntraSlowPal {
  val DISABLED = "DISABLED".asInstanceOf[AvcIntraSlowPal]
  val ENABLED = "ENABLED".asInstanceOf[AvcIntraSlowPal]

  @inline def values: js.Array[AvcIntraSlowPal] = js.Array(DISABLED, ENABLED)
}

/** When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother picture.
  */
@js.native
sealed trait AvcIntraTelecine extends js.Any
object AvcIntraTelecine {
  val NONE = "NONE".asInstanceOf[AvcIntraTelecine]
  val HARD = "HARD".asInstanceOf[AvcIntraTelecine]

  @inline def values: js.Array[AvcIntraTelecine] = js.Array(NONE, HARD)
}

/** Optional. Use Quality tuning level (qualityTuningLevel) to choose how many transcoding passes MediaConvert does with your video. When you choose Multi-pass (MULTI_PASS), your video quality is better and your output bitrate is more accurate. That is, the actual bitrate of your output is closer to the target bitrate defined in the specification. When you choose Single-pass (SINGLE_PASS), your encoding time is faster. The default behavior is Single-pass (SINGLE_PASS).
  */
@js.native
sealed trait AvcIntraUhdQualityTuningLevel extends js.Any
object AvcIntraUhdQualityTuningLevel {
  val SINGLE_PASS = "SINGLE_PASS".asInstanceOf[AvcIntraUhdQualityTuningLevel]
  val MULTI_PASS = "MULTI_PASS".asInstanceOf[AvcIntraUhdQualityTuningLevel]

  @inline def values: js.Array[AvcIntraUhdQualityTuningLevel] = js.Array(SINGLE_PASS, MULTI_PASS)
}

/** The tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs on any billing report that you set up.
  */
@js.native
sealed trait BillingTagsSource extends js.Any
object BillingTagsSource {
  val QUEUE = "QUEUE".asInstanceOf[BillingTagsSource]
  val PRESET = "PRESET".asInstanceOf[BillingTagsSource]
  val JOB_TEMPLATE = "JOB_TEMPLATE".asInstanceOf[BillingTagsSource]
  val JOB = "JOB".asInstanceOf[BillingTagsSource]

  @inline def values: js.Array[BillingTagsSource] = js.Array(QUEUE, PRESET, JOB_TEMPLATE, JOB)
}

/** If no explicit x_position or y_position is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
  */
@js.native
sealed trait BurninSubtitleAlignment extends js.Any
object BurninSubtitleAlignment {
  val CENTERED = "CENTERED".asInstanceOf[BurninSubtitleAlignment]
  val LEFT = "LEFT".asInstanceOf[BurninSubtitleAlignment]

  @inline def values: js.Array[BurninSubtitleAlignment] = js.Array(CENTERED, LEFT)
}

/** Specifies the color of the rectangle behind the captions. All burn-in and DVB-Sub font settings must match.
  */
@js.native
sealed trait BurninSubtitleBackgroundColor extends js.Any
object BurninSubtitleBackgroundColor {
  val NONE = "NONE".asInstanceOf[BurninSubtitleBackgroundColor]
  val BLACK = "BLACK".asInstanceOf[BurninSubtitleBackgroundColor]
  val WHITE = "WHITE".asInstanceOf[BurninSubtitleBackgroundColor]

  @inline def values: js.Array[BurninSubtitleBackgroundColor] = js.Array(NONE, BLACK, WHITE)
}

/** Specifies the color of the burned-in captions. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
  */
@js.native
sealed trait BurninSubtitleFontColor extends js.Any
object BurninSubtitleFontColor {
  val WHITE = "WHITE".asInstanceOf[BurninSubtitleFontColor]
  val BLACK = "BLACK".asInstanceOf[BurninSubtitleFontColor]
  val YELLOW = "YELLOW".asInstanceOf[BurninSubtitleFontColor]
  val RED = "RED".asInstanceOf[BurninSubtitleFontColor]
  val GREEN = "GREEN".asInstanceOf[BurninSubtitleFontColor]
  val BLUE = "BLUE".asInstanceOf[BurninSubtitleFontColor]

  @inline def values: js.Array[BurninSubtitleFontColor] = js.Array(WHITE, BLACK, YELLOW, RED, GREEN, BLUE)
}

/** Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
  */
@js.native
sealed trait BurninSubtitleOutlineColor extends js.Any
object BurninSubtitleOutlineColor {
  val BLACK = "BLACK".asInstanceOf[BurninSubtitleOutlineColor]
  val WHITE = "WHITE".asInstanceOf[BurninSubtitleOutlineColor]
  val YELLOW = "YELLOW".asInstanceOf[BurninSubtitleOutlineColor]
  val RED = "RED".asInstanceOf[BurninSubtitleOutlineColor]
  val GREEN = "GREEN".asInstanceOf[BurninSubtitleOutlineColor]
  val BLUE = "BLUE".asInstanceOf[BurninSubtitleOutlineColor]

  @inline def values: js.Array[BurninSubtitleOutlineColor] = js.Array(BLACK, WHITE, YELLOW, RED, GREEN, BLUE)
}

/** Specifies the color of the shadow cast by the captions. All burn-in and DVB-Sub font settings must match.
  */
@js.native
sealed trait BurninSubtitleShadowColor extends js.Any
object BurninSubtitleShadowColor {
  val NONE = "NONE".asInstanceOf[BurninSubtitleShadowColor]
  val BLACK = "BLACK".asInstanceOf[BurninSubtitleShadowColor]
  val WHITE = "WHITE".asInstanceOf[BurninSubtitleShadowColor]

  @inline def values: js.Array[BurninSubtitleShadowColor] = js.Array(NONE, BLACK, WHITE)
}

/** Only applies to jobs with input captions in Teletext or STL formats. Specify whether the spacing between letters in your captions is set by the captions grid or varies depending on letter width. Choose fixed grid to conform to the spacing specified in the captions file more accurately. Choose proportional to make the text easier to read if the captions are closed caption.
  */
@js.native
sealed trait BurninSubtitleTeletextSpacing extends js.Any
object BurninSubtitleTeletextSpacing {
  val FIXED_GRID = "FIXED_GRID".asInstanceOf[BurninSubtitleTeletextSpacing]
  val PROPORTIONAL = "PROPORTIONAL".asInstanceOf[BurninSubtitleTeletextSpacing]

  @inline def values: js.Array[BurninSubtitleTeletextSpacing] = js.Array(FIXED_GRID, PROPORTIONAL)
}

/** Specify the format for this set of captions on this output. The default format is embedded without SCTE-20. Other options are embedded with SCTE-20, burn-in, DVB-sub, IMSC, SCC, SRT, teletext, TTML, and web-VTT. If you are using SCTE-20, choose SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED) to create an output that complies with the SCTE-43 spec. To create a non-compliant output where the embedded captions come first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
  */
@js.native
sealed trait CaptionDestinationType extends js.Any
object CaptionDestinationType {
  val BURN_IN = "BURN_IN".asInstanceOf[CaptionDestinationType]
  val DVB_SUB = "DVB_SUB".asInstanceOf[CaptionDestinationType]
  val EMBEDDED = "EMBEDDED".asInstanceOf[CaptionDestinationType]
  val EMBEDDED_PLUS_SCTE20 = "EMBEDDED_PLUS_SCTE20".asInstanceOf[CaptionDestinationType]
  val IMSC = "IMSC".asInstanceOf[CaptionDestinationType]
  val SCTE20_PLUS_EMBEDDED = "SCTE20_PLUS_EMBEDDED".asInstanceOf[CaptionDestinationType]
  val SCC = "SCC".asInstanceOf[CaptionDestinationType]
  val SRT = "SRT".asInstanceOf[CaptionDestinationType]
  val SMI = "SMI".asInstanceOf[CaptionDestinationType]
  val TELETEXT = "TELETEXT".asInstanceOf[CaptionDestinationType]
  val TTML = "TTML".asInstanceOf[CaptionDestinationType]
  val WEBVTT = "WEBVTT".asInstanceOf[CaptionDestinationType]

  @inline def values: js.Array[CaptionDestinationType] = js.Array(BURN_IN, DVB_SUB, EMBEDDED, EMBEDDED_PLUS_SCTE20, IMSC, SCTE20_PLUS_EMBEDDED, SCC, SRT, SMI, TELETEXT, TTML, WEBVTT)
}

/** Use Source (SourceType) to identify the format of your input captions. The service cannot auto-detect caption format.
  */
@js.native
sealed trait CaptionSourceType extends js.Any
object CaptionSourceType {
  val ANCILLARY = "ANCILLARY".asInstanceOf[CaptionSourceType]
  val DVB_SUB = "DVB_SUB".asInstanceOf[CaptionSourceType]
  val EMBEDDED = "EMBEDDED".asInstanceOf[CaptionSourceType]
  val SCTE20 = "SCTE20".asInstanceOf[CaptionSourceType]
  val SCC = "SCC".asInstanceOf[CaptionSourceType]
  val TTML = "TTML".asInstanceOf[CaptionSourceType]
  val STL = "STL".asInstanceOf[CaptionSourceType]
  val SRT = "SRT".asInstanceOf[CaptionSourceType]
  val SMI = "SMI".asInstanceOf[CaptionSourceType]
  val SMPTE_TT = "SMPTE_TT".asInstanceOf[CaptionSourceType]
  val TELETEXT = "TELETEXT".asInstanceOf[CaptionSourceType]
  val NULL_SOURCE = "NULL_SOURCE".asInstanceOf[CaptionSourceType]
  val IMSC = "IMSC".asInstanceOf[CaptionSourceType]
  val WEBVTT = "WEBVTT".asInstanceOf[CaptionSourceType]

  @inline def values: js.Array[CaptionSourceType] = js.Array(ANCILLARY, DVB_SUB, EMBEDDED, SCTE20, SCC, TTML, STL, SRT, SMI, SMPTE_TT, TELETEXT, NULL_SOURCE, IMSC, WEBVTT)
}

/** Disable this setting only when your workflow requires the #EXT-X-ALLOW-CACHE:no tag. Otherwise, keep the default value Enabled (ENABLED) and control caching in your video distribution set up. For example, use the Cache-Control http header.
  */
@js.native
sealed trait CmafClientCache extends js.Any
object CmafClientCache {
  val DISABLED = "DISABLED".asInstanceOf[CmafClientCache]
  val ENABLED = "ENABLED".asInstanceOf[CmafClientCache]

  @inline def values: js.Array[CmafClientCache] = js.Array(DISABLED, ENABLED)
}

/** Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
  */
@js.native
sealed trait CmafCodecSpecification extends js.Any
object CmafCodecSpecification {
  val RFC_6381 = "RFC_6381".asInstanceOf[CmafCodecSpecification]
  val RFC_4281 = "RFC_4281".asInstanceOf[CmafCodecSpecification]

  @inline def values: js.Array[CmafCodecSpecification] = js.Array(RFC_6381, RFC_4281)
}

/** Specify the encryption scheme that you want the service to use when encrypting your CMAF segments. Choose AES-CBC subsample (SAMPLE-AES) or AES_CTR (AES-CTR).
  */
@js.native
sealed trait CmafEncryptionType extends js.Any
object CmafEncryptionType {
  val SAMPLE_AES = "SAMPLE_AES".asInstanceOf[CmafEncryptionType]
  val AES_CTR = "AES_CTR".asInstanceOf[CmafEncryptionType]

  @inline def values: js.Array[CmafEncryptionType] = js.Array(SAMPLE_AES, AES_CTR)
}

/** When you use DRM with CMAF outputs, choose whether the service writes the 128-bit encryption initialization vector in the HLS and DASH manifests.
  */
@js.native
sealed trait CmafInitializationVectorInManifest extends js.Any
object CmafInitializationVectorInManifest {
  val INCLUDE = "INCLUDE".asInstanceOf[CmafInitializationVectorInManifest]
  val EXCLUDE = "EXCLUDE".asInstanceOf[CmafInitializationVectorInManifest]

  @inline def values: js.Array[CmafInitializationVectorInManifest] = js.Array(INCLUDE, EXCLUDE)
}

/** Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
  */
@js.native
sealed trait CmafKeyProviderType extends js.Any
object CmafKeyProviderType {
  val SPEKE = "SPEKE".asInstanceOf[CmafKeyProviderType]
  val STATIC_KEY = "STATIC_KEY".asInstanceOf[CmafKeyProviderType]

  @inline def values: js.Array[CmafKeyProviderType] = js.Array(SPEKE, STATIC_KEY)
}

/** When set to GZIP, compresses HLS playlist.
  */
@js.native
sealed trait CmafManifestCompression extends js.Any
object CmafManifestCompression {
  val GZIP = "GZIP".asInstanceOf[CmafManifestCompression]
  val NONE = "NONE".asInstanceOf[CmafManifestCompression]

  @inline def values: js.Array[CmafManifestCompression] = js.Array(GZIP, NONE)
}

/** Indicates whether the output manifest should use floating point values for segment duration.
  */
@js.native
sealed trait CmafManifestDurationFormat extends js.Any
object CmafManifestDurationFormat {
  val FLOATING_POINT = "FLOATING_POINT".asInstanceOf[CmafManifestDurationFormat]
  val INTEGER = "INTEGER".asInstanceOf[CmafManifestDurationFormat]

  @inline def values: js.Array[CmafManifestDurationFormat] = js.Array(FLOATING_POINT, INTEGER)
}

/** Specify whether your DASH profile is on-demand or main. When you choose Main profile (MAIN_PROFILE), the service signals urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE), the service signals urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose On-demand, you must also set the output group setting Segment control (SegmentControl) to Single file (SINGLE_FILE).
  */
@js.native
sealed trait CmafMpdProfile extends js.Any
object CmafMpdProfile {
  val MAIN_PROFILE = "MAIN_PROFILE".asInstanceOf[CmafMpdProfile]
  val ON_DEMAND_PROFILE = "ON_DEMAND_PROFILE".asInstanceOf[CmafMpdProfile]

  @inline def values: js.Array[CmafMpdProfile] = js.Array(MAIN_PROFILE, ON_DEMAND_PROFILE)
}

/** Use this setting only when your output video stream has B-frames, which causes the initial presentation time stamp (PTS) to be offset from the initial decode time stamp (DTS). Specify how MediaConvert handles PTS when writing time stamps in output DASH manifests. Choose Match initial PTS (MATCH_INITIAL_PTS) when you want MediaConvert to use the initial PTS as the first time stamp in the manifest. Choose Zero-based (ZERO_BASED) to have MediaConvert ignore the initial PTS in the video stream and instead write the initial time stamp as zero in the manifest. For outputs that don't have B-frames, the time stamps in your DASH manifests start at zero regardless of your choice here.
  */
@js.native
sealed trait CmafPtsOffsetHandlingForBFrames extends js.Any
object CmafPtsOffsetHandlingForBFrames {
  val ZERO_BASED = "ZERO_BASED".asInstanceOf[CmafPtsOffsetHandlingForBFrames]
  val MATCH_INITIAL_PTS = "MATCH_INITIAL_PTS".asInstanceOf[CmafPtsOffsetHandlingForBFrames]

  @inline def values: js.Array[CmafPtsOffsetHandlingForBFrames] = js.Array(ZERO_BASED, MATCH_INITIAL_PTS)
}

/** When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
  */
@js.native
sealed trait CmafSegmentControl extends js.Any
object CmafSegmentControl {
  val SINGLE_FILE = "SINGLE_FILE".asInstanceOf[CmafSegmentControl]
  val SEGMENTED_FILES = "SEGMENTED_FILES".asInstanceOf[CmafSegmentControl]

  @inline def values: js.Array[CmafSegmentControl] = js.Array(SINGLE_FILE, SEGMENTED_FILES)
}

/** Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
  */
@js.native
sealed trait CmafStreamInfResolution extends js.Any
object CmafStreamInfResolution {
  val INCLUDE = "INCLUDE".asInstanceOf[CmafStreamInfResolution]
  val EXCLUDE = "EXCLUDE".asInstanceOf[CmafStreamInfResolution]

  @inline def values: js.Array[CmafStreamInfResolution] = js.Array(INCLUDE, EXCLUDE)
}

/** When set to ENABLED, a DASH MPD manifest will be generated for this output.
  */
@js.native
sealed trait CmafWriteDASHManifest extends js.Any
object CmafWriteDASHManifest {
  val DISABLED = "DISABLED".asInstanceOf[CmafWriteDASHManifest]
  val ENABLED = "ENABLED".asInstanceOf[CmafWriteDASHManifest]

  @inline def values: js.Array[CmafWriteDASHManifest] = js.Array(DISABLED, ENABLED)
}

/** When set to ENABLED, an Apple HLS manifest will be generated for this output.
  */
@js.native
sealed trait CmafWriteHLSManifest extends js.Any
object CmafWriteHLSManifest {
  val DISABLED = "DISABLED".asInstanceOf[CmafWriteHLSManifest]
  val ENABLED = "ENABLED".asInstanceOf[CmafWriteHLSManifest]

  @inline def values: js.Array[CmafWriteHLSManifest] = js.Array(DISABLED, ENABLED)
}

/** When you enable Precise segment duration in DASH manifests (writeSegmentTimelineInRepresentation), your DASH manifest shows precise segment durations. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your DASH manifest are approximate. The segment duration information appears in the duration attribute of the SegmentTemplate element.
  */
@js.native
sealed trait CmafWriteSegmentTimelineInRepresentation extends js.Any
object CmafWriteSegmentTimelineInRepresentation {
  val ENABLED = "ENABLED".asInstanceOf[CmafWriteSegmentTimelineInRepresentation]
  val DISABLED = "DISABLED".asInstanceOf[CmafWriteSegmentTimelineInRepresentation]

  @inline def values: js.Array[CmafWriteSegmentTimelineInRepresentation] = js.Array(ENABLED, DISABLED)
}

/** Specify this setting only when your output will be consumed by a downstream repackaging workflow that is sensitive to very small duration differences between video and audio. For this situation, choose Match video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with silence or trims them to ensure that the total duration of each audio stream is at least as long as the total duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
  */
@js.native
sealed trait CmfcAudioDuration extends js.Any
object CmfcAudioDuration {
  val DEFAULT_CODEC_DURATION = "DEFAULT_CODEC_DURATION".asInstanceOf[CmfcAudioDuration]
  val MATCH_VIDEO_DURATION = "MATCH_VIDEO_DURATION".asInstanceOf[CmfcAudioDuration]

  @inline def values: js.Array[CmfcAudioDuration] = js.Array(DEFAULT_CODEC_DURATION, MATCH_VIDEO_DURATION)
}

/** Use this setting to control the values that MediaConvert puts in your HLS parent playlist to control how the client player selects which audio track to play. The other options for this setting determine the values that MediaConvert writes for the DEFAULT and AUTOSELECT attributes of the EXT-X-MEDIA entry for the audio variant. For more information about these attributes, see the Apple documentation article https://developer.apple.com/documentation/http_live_streaming/example_playlists_for_http_live_streaming/adding_alternate_media_to_a_playlist. Choose Alternate audio, auto select, default (ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT) to set DEFAULT=YES and AUTOSELECT=YES. Choose this value for only one variant in your output group. Choose Alternate audio, auto select, not default (ALTERNATE_AUDIO_AUTO_SELECT) to set DEFAULT=NO and AUTOSELECT=YES. Choose Alternate Audio, Not Auto Select to set DEFAULT=NO and AUTOSELECT=NO. When you don't specify a value for this setting, MediaConvert
  * defaults to Alternate audio, auto select, default. When there is more than one variant in your output group, you must explicitly choose a value for this setting.
  */
@js.native
sealed trait CmfcAudioTrackType extends js.Any
object CmfcAudioTrackType {
  val ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT = "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT".asInstanceOf[CmfcAudioTrackType]
  val ALTERNATE_AUDIO_AUTO_SELECT = "ALTERNATE_AUDIO_AUTO_SELECT".asInstanceOf[CmfcAudioTrackType]
  val ALTERNATE_AUDIO_NOT_AUTO_SELECT = "ALTERNATE_AUDIO_NOT_AUTO_SELECT".asInstanceOf[CmfcAudioTrackType]

  @inline def values: js.Array[CmfcAudioTrackType] = js.Array(ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT, ALTERNATE_AUDIO_AUTO_SELECT, ALTERNATE_AUDIO_NOT_AUTO_SELECT)
}

/** Specify whether to flag this audio track as descriptive video service (DVS) in your HLS parent manifest. When you choose Flag (FLAG), MediaConvert includes the parameter CHARACTERISTICS="public.accessibility.describes-video" in the EXT-X-MEDIA entry for this track. When you keep the default choice, Don't flag (DONT_FLAG), MediaConvert leaves this parameter out. The DVS flag can help with accessibility on Apple devices. For more information, see the Apple documentation.
  */
@js.native
sealed trait CmfcDescriptiveVideoServiceFlag extends js.Any
object CmfcDescriptiveVideoServiceFlag {
  val DONT_FLAG = "DONT_FLAG".asInstanceOf[CmfcDescriptiveVideoServiceFlag]
  val FLAG = "FLAG".asInstanceOf[CmfcDescriptiveVideoServiceFlag]

  @inline def values: js.Array[CmfcDescriptiveVideoServiceFlag] = js.Array(DONT_FLAG, FLAG)
}

/** Choose Include (INCLUDE) to have MediaConvert generate an HLS child manifest that lists only the I-frames for this rendition, in addition to your regular manifest for this rendition. You might use this manifest as part of a workflow that creates preview functions for your video. MediaConvert adds both the I-frame only child manifest and the regular child manifest to the parent manifest. When you don't need the I-frame only child manifest, keep the default value Exclude (EXCLUDE).
  */
@js.native
sealed trait CmfcIFrameOnlyManifest extends js.Any
object CmfcIFrameOnlyManifest {
  val INCLUDE = "INCLUDE".asInstanceOf[CmfcIFrameOnlyManifest]
  val EXCLUDE = "EXCLUDE".asInstanceOf[CmfcIFrameOnlyManifest]

  @inline def values: js.Array[CmfcIFrameOnlyManifest] = js.Array(INCLUDE, EXCLUDE)
}

/** Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
  */
@js.native
sealed trait CmfcScte35Esam extends js.Any
object CmfcScte35Esam {
  val INSERT = "INSERT".asInstanceOf[CmfcScte35Esam]
  val NONE = "NONE".asInstanceOf[CmfcScte35Esam]

  @inline def values: js.Array[CmfcScte35Esam] = js.Array(INSERT, NONE)
}

/** Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want those SCTE-35 markers in this output.
  */
@js.native
sealed trait CmfcScte35Source extends js.Any
object CmfcScte35Source {
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[CmfcScte35Source]
  val NONE = "NONE".asInstanceOf[CmfcScte35Source]

  @inline def values: js.Array[CmfcScte35Source] = js.Array(PASSTHROUGH, NONE)
}

/** Choose Insert (INSERT) for this setting to include color metadata in this output. Choose Ignore (IGNORE) to exclude color metadata from this output. If you don't specify a value, the service sets this to Insert by default.
  */
@js.native
sealed trait ColorMetadata extends js.Any
object ColorMetadata {
  val IGNORE = "IGNORE".asInstanceOf[ColorMetadata]
  val INSERT = "INSERT".asInstanceOf[ColorMetadata]

  @inline def values: js.Array[ColorMetadata] = js.Array(IGNORE, INSERT)
}

/** If your input video has accurate color space metadata, or if you don't know about color space, leave this set to the default value Follow (FOLLOW). The service will automatically detect your input color space. If your input video has metadata indicating the wrong color space, specify the accurate color space here. If your input video is HDR 10 and the SMPTE ST 2086 Mastering Display Color Volume static metadata isn't present in your video stream, or if that metadata is present but not accurate, choose Force HDR 10 (FORCE_HDR10) here and specify correct values in the input HDR 10 metadata (Hdr10Metadata) settings. For more information about MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
  */
@js.native
sealed trait ColorSpace extends js.Any
object ColorSpace {
  val FOLLOW = "FOLLOW".asInstanceOf[ColorSpace]
  val REC_601 = "REC_601".asInstanceOf[ColorSpace]
  val REC_709 = "REC_709".asInstanceOf[ColorSpace]
  val HDR10 = "HDR10".asInstanceOf[ColorSpace]
  val HLG_2020 = "HLG_2020".asInstanceOf[ColorSpace]

  @inline def values: js.Array[ColorSpace] = js.Array(FOLLOW, REC_601, REC_709, HDR10, HLG_2020)
}

/** Specify the color space you want for this output. The service supports conversion between HDR formats, between SDR formats, from SDR to HDR, and from HDR to SDR. SDR to HDR conversion doesn't upgrade the dynamic range. The converted video has an HDR format, but visually appears the same as an unconverted output. HDR to SDR conversion uses Elemental tone mapping technology to approximate the outcome of manually regrading from HDR to SDR.
  */
@js.native
sealed trait ColorSpaceConversion extends js.Any
object ColorSpaceConversion {
  val NONE = "NONE".asInstanceOf[ColorSpaceConversion]
  val FORCE_601 = "FORCE_601".asInstanceOf[ColorSpaceConversion]
  val FORCE_709 = "FORCE_709".asInstanceOf[ColorSpaceConversion]
  val FORCE_HDR10 = "FORCE_HDR10".asInstanceOf[ColorSpaceConversion]
  val FORCE_HLG_2020 = "FORCE_HLG_2020".asInstanceOf[ColorSpaceConversion]

  @inline def values: js.Array[ColorSpaceConversion] = js.Array(NONE, FORCE_601, FORCE_709, FORCE_HDR10, FORCE_HLG_2020)
}

/** There are two sources for color metadata, the input file and the job input settings Color space (ColorSpace) and HDR master display information settings(Hdr10Metadata). The Color space usage setting determines which takes precedence. Choose Force (FORCE) to use color metadata from the input job settings. If you don't specify values for those settings, the service defaults to using metadata from your input. FALLBACK - Choose Fallback (FALLBACK) to use color metadata from the source when it is present. If there's no color metadata in your input file, the service defaults to using values you specify in the input settings.
  */
@js.native
sealed trait ColorSpaceUsage extends js.Any
object ColorSpaceUsage {
  val FORCE = "FORCE".asInstanceOf[ColorSpaceUsage]
  val FALLBACK = "FALLBACK".asInstanceOf[ColorSpaceUsage]

  @inline def values: js.Array[ColorSpaceUsage] = js.Array(FORCE, FALLBACK)
}

/** The length of the term of your reserved queue pricing plan commitment.
  */
@js.native
sealed trait Commitment extends js.Any
object Commitment {
  val ONE_YEAR = "ONE_YEAR".asInstanceOf[Commitment]

  @inline def values: js.Array[Commitment] = js.Array(ONE_YEAR)
}

/** Container for this output. Some containers require a container settings object. If not specified, the default object will be created.
  */
@js.native
sealed trait ContainerType extends js.Any
object ContainerType {
  val F4V = "F4V".asInstanceOf[ContainerType]
  val ISMV = "ISMV".asInstanceOf[ContainerType]
  val M2TS = "M2TS".asInstanceOf[ContainerType]
  val M3U8 = "M3U8".asInstanceOf[ContainerType]
  val CMFC = "CMFC".asInstanceOf[ContainerType]
  val MOV = "MOV".asInstanceOf[ContainerType]
  val MP4 = "MP4".asInstanceOf[ContainerType]
  val MPD = "MPD".asInstanceOf[ContainerType]
  val MXF = "MXF".asInstanceOf[ContainerType]
  val WEBM = "WEBM".asInstanceOf[ContainerType]
  val RAW = "RAW".asInstanceOf[ContainerType]

  @inline def values: js.Array[ContainerType] = js.Array(F4V, ISMV, M2TS, M3U8, CMFC, MOV, MP4, MPD, MXF, WEBM, RAW)
}

/** Use this setting only when your audio codec is a Dolby one (AC3, EAC3, or Atmos) and your downstream workflow requires that your DASH manifest use the Dolby channel configuration tag, rather than the MPEG one. For example, you might need to use this to make dynamic ad insertion work. Specify which audio channel configuration scheme ID URI MediaConvert writes in your DASH manifest. Keep the default value, MPEG channel configuration (MPEG_CHANNEL_CONFIGURATION), to have MediaConvert write this: urn:mpeg:mpegB:cicp:ChannelConfiguration. Choose Dolby channel configuration (DOLBY_CHANNEL_CONFIGURATION) to have MediaConvert write this instead: tag:dolby.com,2014:dash:audio_channel_configuration:2011.
  */
@js.native
sealed trait DashIsoGroupAudioChannelConfigSchemeIdUri extends js.Any
object DashIsoGroupAudioChannelConfigSchemeIdUri {
  val MPEG_CHANNEL_CONFIGURATION = "MPEG_CHANNEL_CONFIGURATION".asInstanceOf[DashIsoGroupAudioChannelConfigSchemeIdUri]
  val DOLBY_CHANNEL_CONFIGURATION = "DOLBY_CHANNEL_CONFIGURATION".asInstanceOf[DashIsoGroupAudioChannelConfigSchemeIdUri]

  @inline def values: js.Array[DashIsoGroupAudioChannelConfigSchemeIdUri] = js.Array(MPEG_CHANNEL_CONFIGURATION, DOLBY_CHANNEL_CONFIGURATION)
}

/** Supports HbbTV specification as indicated
  */
@js.native
sealed trait DashIsoHbbtvCompliance extends js.Any
object DashIsoHbbtvCompliance {
  val HBBTV_1_5 = "HBBTV_1_5".asInstanceOf[DashIsoHbbtvCompliance]
  val NONE = "NONE".asInstanceOf[DashIsoHbbtvCompliance]

  @inline def values: js.Array[DashIsoHbbtvCompliance] = js.Array(HBBTV_1_5, NONE)
}

/** Specify whether your DASH profile is on-demand or main. When you choose Main profile (MAIN_PROFILE), the service signals urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE), the service signals urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose On-demand, you must also set the output group setting Segment control (SegmentControl) to Single file (SINGLE_FILE).
  */
@js.native
sealed trait DashIsoMpdProfile extends js.Any
object DashIsoMpdProfile {
  val MAIN_PROFILE = "MAIN_PROFILE".asInstanceOf[DashIsoMpdProfile]
  val ON_DEMAND_PROFILE = "ON_DEMAND_PROFILE".asInstanceOf[DashIsoMpdProfile]

  @inline def values: js.Array[DashIsoMpdProfile] = js.Array(MAIN_PROFILE, ON_DEMAND_PROFILE)
}

/** This setting can improve the compatibility of your output with video players on obsolete devices. It applies only to DASH H.264 outputs with DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to correct problems with playback on older devices. Otherwise, keep the default setting CENC v1 (CENC_V1). If you choose Unencrypted SEI, for that output, the service will exclude the access unit delimiter and will leave the SEI NAL units unencrypted.
  */
@js.native
sealed trait DashIsoPlaybackDeviceCompatibility extends js.Any
object DashIsoPlaybackDeviceCompatibility {
  val CENC_V1 = "CENC_V1".asInstanceOf[DashIsoPlaybackDeviceCompatibility]
  val UNENCRYPTED_SEI = "UNENCRYPTED_SEI".asInstanceOf[DashIsoPlaybackDeviceCompatibility]

  @inline def values: js.Array[DashIsoPlaybackDeviceCompatibility] = js.Array(CENC_V1, UNENCRYPTED_SEI)
}

/** Use this setting only when your output video stream has B-frames, which causes the initial presentation time stamp (PTS) to be offset from the initial decode time stamp (DTS). Specify how MediaConvert handles PTS when writing time stamps in output DASH manifests. Choose Match initial PTS (MATCH_INITIAL_PTS) when you want MediaConvert to use the initial PTS as the first time stamp in the manifest. Choose Zero-based (ZERO_BASED) to have MediaConvert ignore the initial PTS in the video stream and instead write the initial time stamp as zero in the manifest. For outputs that don't have B-frames, the time stamps in your DASH manifests start at zero regardless of your choice here.
  */
@js.native
sealed trait DashIsoPtsOffsetHandlingForBFrames extends js.Any
object DashIsoPtsOffsetHandlingForBFrames {
  val ZERO_BASED = "ZERO_BASED".asInstanceOf[DashIsoPtsOffsetHandlingForBFrames]
  val MATCH_INITIAL_PTS = "MATCH_INITIAL_PTS".asInstanceOf[DashIsoPtsOffsetHandlingForBFrames]

  @inline def values: js.Array[DashIsoPtsOffsetHandlingForBFrames] = js.Array(ZERO_BASED, MATCH_INITIAL_PTS)
}

/** When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
  */
@js.native
sealed trait DashIsoSegmentControl extends js.Any
object DashIsoSegmentControl {
  val SINGLE_FILE = "SINGLE_FILE".asInstanceOf[DashIsoSegmentControl]
  val SEGMENTED_FILES = "SEGMENTED_FILES".asInstanceOf[DashIsoSegmentControl]

  @inline def values: js.Array[DashIsoSegmentControl] = js.Array(SINGLE_FILE, SEGMENTED_FILES)
}

/** When you enable Precise segment duration in manifests (writeSegmentTimelineInRepresentation), your DASH manifest shows precise segment durations. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your DASH manifest are approximate. The segment duration information appears in the duration attribute of the SegmentTemplate element.
  */
@js.native
sealed trait DashIsoWriteSegmentTimelineInRepresentation extends js.Any
object DashIsoWriteSegmentTimelineInRepresentation {
  val ENABLED = "ENABLED".asInstanceOf[DashIsoWriteSegmentTimelineInRepresentation]
  val DISABLED = "DISABLED".asInstanceOf[DashIsoWriteSegmentTimelineInRepresentation]

  @inline def values: js.Array[DashIsoWriteSegmentTimelineInRepresentation] = js.Array(ENABLED, DISABLED)
}

/** Specify the encryption mode that you used to encrypt your input files.
  */
@js.native
sealed trait DecryptionMode extends js.Any
object DecryptionMode {
  val AES_CTR = "AES_CTR".asInstanceOf[DecryptionMode]
  val AES_CBC = "AES_CBC".asInstanceOf[DecryptionMode]
  val AES_GCM = "AES_GCM".asInstanceOf[DecryptionMode]

  @inline def values: js.Array[DecryptionMode] = js.Array(AES_CTR, AES_CBC, AES_GCM)
}

/** Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace (DEINTERLACE) or Adaptive (ADAPTIVE). Motion adaptive interpolate (INTERPOLATE) produces sharper pictures, while blend (BLEND) produces smoother motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source file includes a ticker, such as a scrolling headline at the bottom of the frame.
  */
@js.native
sealed trait DeinterlaceAlgorithm extends js.Any
object DeinterlaceAlgorithm {
  val INTERPOLATE = "INTERPOLATE".asInstanceOf[DeinterlaceAlgorithm]
  val INTERPOLATE_TICKER = "INTERPOLATE_TICKER".asInstanceOf[DeinterlaceAlgorithm]
  val BLEND = "BLEND".asInstanceOf[DeinterlaceAlgorithm]
  val BLEND_TICKER = "BLEND_TICKER".asInstanceOf[DeinterlaceAlgorithm]

  @inline def values: js.Array[DeinterlaceAlgorithm] = js.Array(INTERPOLATE, INTERPOLATE_TICKER, BLEND, BLEND_TICKER)
}

/**   - When set to NORMAL (default), the deinterlacer does not convert frames that are tagged in metadata as progressive. It will only convert those that are tagged as some other type. - When set to FORCE_ALL_FRAMES, the deinterlacer converts every frame to progressive - even those that are already tagged as progressive. Turn Force mode on only if there is a good chance that the metadata has tagged frames as progressive when they are not progressive. Do not turn on otherwise; processing frames that are already progressive into progressive will probably result in lower quality video.
  */
@js.native
sealed trait DeinterlacerControl extends js.Any
object DeinterlacerControl {
  val FORCE_ALL_FRAMES = "FORCE_ALL_FRAMES".asInstanceOf[DeinterlacerControl]
  val NORMAL = "NORMAL".asInstanceOf[DeinterlacerControl]

  @inline def values: js.Array[DeinterlacerControl] = js.Array(FORCE_ALL_FRAMES, NORMAL)
}

/** Use Deinterlacer (DeinterlaceMode) to choose how the service will do deinterlacing. Default is Deinterlace. - Deinterlace converts interlaced to progressive. - Inverse telecine converts Hard Telecine 29.97i to progressive 23.976p. - Adaptive auto-detects and converts to progressive.
  */
@js.native
sealed trait DeinterlacerMode extends js.Any
object DeinterlacerMode {
  val DEINTERLACE = "DEINTERLACE".asInstanceOf[DeinterlacerMode]
  val INVERSE_TELECINE = "INVERSE_TELECINE".asInstanceOf[DeinterlacerMode]
  val ADAPTIVE = "ADAPTIVE".asInstanceOf[DeinterlacerMode]

  @inline def values: js.Array[DeinterlacerMode] = js.Array(DEINTERLACE, INVERSE_TELECINE, ADAPTIVE)
}

/** Optional field, defaults to DEFAULT. Specify DEFAULT for this operation to return your endpoints if any exist, or to create an endpoint for you and return it if one doesn't already exist. Specify GET_ONLY to return your endpoints if any exist, or an empty list if none exist.
  */
@js.native
sealed trait DescribeEndpointsMode extends js.Any
object DescribeEndpointsMode {
  val DEFAULT = "DEFAULT".asInstanceOf[DescribeEndpointsMode]
  val GET_ONLY = "GET_ONLY".asInstanceOf[DescribeEndpointsMode]

  @inline def values: js.Array[DescribeEndpointsMode] = js.Array(DEFAULT, GET_ONLY)
}

/** Use Dolby Vision Mode to choose how the service will handle Dolby Vision MaxCLL and MaxFALL properies.
  */
@js.native
sealed trait DolbyVisionLevel6Mode extends js.Any
object DolbyVisionLevel6Mode {
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[DolbyVisionLevel6Mode]
  val RECALCULATE = "RECALCULATE".asInstanceOf[DolbyVisionLevel6Mode]
  val SPECIFY = "SPECIFY".asInstanceOf[DolbyVisionLevel6Mode]

  @inline def values: js.Array[DolbyVisionLevel6Mode] = js.Array(PASSTHROUGH, RECALCULATE, SPECIFY)
}

/** In the current MediaConvert implementation, the Dolby Vision profile is always 5 (PROFILE_5). Therefore, all of your inputs must contain Dolby Vision frame interleaved data.
  */
@js.native
sealed trait DolbyVisionProfile extends js.Any
object DolbyVisionProfile {
  val PROFILE_5 = "PROFILE_5".asInstanceOf[DolbyVisionProfile]

  @inline def values: js.Array[DolbyVisionProfile] = js.Array(PROFILE_5)
}

/** Applies only to 29.97 fps outputs. When this feature is enabled, the service will use drop-frame timecode on outputs. If it is not possible to use drop-frame timecode, the system will fall back to non-drop-frame. This setting is enabled by default when Timecode insertion (TimecodeInsertion) is enabled.
  */
@js.native
sealed trait DropFrameTimecode extends js.Any
object DropFrameTimecode {
  val DISABLED = "DISABLED".asInstanceOf[DropFrameTimecode]
  val ENABLED = "ENABLED".asInstanceOf[DropFrameTimecode]

  @inline def values: js.Array[DropFrameTimecode] = js.Array(DISABLED, ENABLED)
}

/** If no explicit x_position or y_position is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
  */
@js.native
sealed trait DvbSubtitleAlignment extends js.Any
object DvbSubtitleAlignment {
  val CENTERED = "CENTERED".asInstanceOf[DvbSubtitleAlignment]
  val LEFT = "LEFT".asInstanceOf[DvbSubtitleAlignment]

  @inline def values: js.Array[DvbSubtitleAlignment] = js.Array(CENTERED, LEFT)
}

/** Specifies the color of the rectangle behind the captions. All burn-in and DVB-Sub font settings must match.
  */
@js.native
sealed trait DvbSubtitleBackgroundColor extends js.Any
object DvbSubtitleBackgroundColor {
  val NONE = "NONE".asInstanceOf[DvbSubtitleBackgroundColor]
  val BLACK = "BLACK".asInstanceOf[DvbSubtitleBackgroundColor]
  val WHITE = "WHITE".asInstanceOf[DvbSubtitleBackgroundColor]

  @inline def values: js.Array[DvbSubtitleBackgroundColor] = js.Array(NONE, BLACK, WHITE)
}

/** Specifies the color of the burned-in captions. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
  */
@js.native
sealed trait DvbSubtitleFontColor extends js.Any
object DvbSubtitleFontColor {
  val WHITE = "WHITE".asInstanceOf[DvbSubtitleFontColor]
  val BLACK = "BLACK".asInstanceOf[DvbSubtitleFontColor]
  val YELLOW = "YELLOW".asInstanceOf[DvbSubtitleFontColor]
  val RED = "RED".asInstanceOf[DvbSubtitleFontColor]
  val GREEN = "GREEN".asInstanceOf[DvbSubtitleFontColor]
  val BLUE = "BLUE".asInstanceOf[DvbSubtitleFontColor]

  @inline def values: js.Array[DvbSubtitleFontColor] = js.Array(WHITE, BLACK, YELLOW, RED, GREEN, BLUE)
}

/** Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
  */
@js.native
sealed trait DvbSubtitleOutlineColor extends js.Any
object DvbSubtitleOutlineColor {
  val BLACK = "BLACK".asInstanceOf[DvbSubtitleOutlineColor]
  val WHITE = "WHITE".asInstanceOf[DvbSubtitleOutlineColor]
  val YELLOW = "YELLOW".asInstanceOf[DvbSubtitleOutlineColor]
  val RED = "RED".asInstanceOf[DvbSubtitleOutlineColor]
  val GREEN = "GREEN".asInstanceOf[DvbSubtitleOutlineColor]
  val BLUE = "BLUE".asInstanceOf[DvbSubtitleOutlineColor]

  @inline def values: js.Array[DvbSubtitleOutlineColor] = js.Array(BLACK, WHITE, YELLOW, RED, GREEN, BLUE)
}

/** Specifies the color of the shadow cast by the captions. All burn-in and DVB-Sub font settings must match.
  */
@js.native
sealed trait DvbSubtitleShadowColor extends js.Any
object DvbSubtitleShadowColor {
  val NONE = "NONE".asInstanceOf[DvbSubtitleShadowColor]
  val BLACK = "BLACK".asInstanceOf[DvbSubtitleShadowColor]
  val WHITE = "WHITE".asInstanceOf[DvbSubtitleShadowColor]

  @inline def values: js.Array[DvbSubtitleShadowColor] = js.Array(NONE, BLACK, WHITE)
}

/** Only applies to jobs with input captions in Teletext or STL formats. Specify whether the spacing between letters in your captions is set by the captions grid or varies depending on letter width. Choose fixed grid to conform to the spacing specified in the captions file more accurately. Choose proportional to make the text easier to read if the captions are closed caption.
  */
@js.native
sealed trait DvbSubtitleTeletextSpacing extends js.Any
object DvbSubtitleTeletextSpacing {
  val FIXED_GRID = "FIXED_GRID".asInstanceOf[DvbSubtitleTeletextSpacing]
  val PROPORTIONAL = "PROPORTIONAL".asInstanceOf[DvbSubtitleTeletextSpacing]

  @inline def values: js.Array[DvbSubtitleTeletextSpacing] = js.Array(FIXED_GRID, PROPORTIONAL)
}

/** Specify whether your DVB subtitles are standard or for hearing impaired. Choose hearing impaired if your subtitles include audio descriptions and dialogue. Choose standard if your subtitles include only dialogue.
  */
@js.native
sealed trait DvbSubtitlingType extends js.Any
object DvbSubtitlingType {
  val HEARING_IMPAIRED = "HEARING_IMPAIRED".asInstanceOf[DvbSubtitlingType]
  val STANDARD = "STANDARD".asInstanceOf[DvbSubtitlingType]

  @inline def values: js.Array[DvbSubtitlingType] = js.Array(HEARING_IMPAIRED, STANDARD)
}

/** Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
  */
@js.native
sealed trait Eac3AtmosBitstreamMode extends js.Any
object Eac3AtmosBitstreamMode {
  val COMPLETE_MAIN = "COMPLETE_MAIN".asInstanceOf[Eac3AtmosBitstreamMode]

  @inline def values: js.Array[Eac3AtmosBitstreamMode] = js.Array(COMPLETE_MAIN)
}

/** The coding mode for Dolby Digital Plus JOC (Atmos) is always 9.1.6 (CODING_MODE_9_1_6).
  */
@js.native
sealed trait Eac3AtmosCodingMode extends js.Any
object Eac3AtmosCodingMode {
  val CODING_MODE_9_1_6 = "CODING_MODE_9_1_6".asInstanceOf[Eac3AtmosCodingMode]

  @inline def values: js.Array[Eac3AtmosCodingMode] = js.Array(CODING_MODE_9_1_6)
}

/** Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue analysis.
  */
@js.native
sealed trait Eac3AtmosDialogueIntelligence extends js.Any
object Eac3AtmosDialogueIntelligence {
  val ENABLED = "ENABLED".asInstanceOf[Eac3AtmosDialogueIntelligence]
  val DISABLED = "DISABLED".asInstanceOf[Eac3AtmosDialogueIntelligence]

  @inline def values: js.Array[Eac3AtmosDialogueIntelligence] = js.Array(ENABLED, DISABLED)
}

/** Specify the absolute peak level for a signal with dynamic range compression.
  */
@js.native
sealed trait Eac3AtmosDynamicRangeCompressionLine extends js.Any
object Eac3AtmosDynamicRangeCompressionLine {
  val NONE = "NONE".asInstanceOf[Eac3AtmosDynamicRangeCompressionLine]
  val FILM_STANDARD = "FILM_STANDARD".asInstanceOf[Eac3AtmosDynamicRangeCompressionLine]
  val FILM_LIGHT = "FILM_LIGHT".asInstanceOf[Eac3AtmosDynamicRangeCompressionLine]
  val MUSIC_STANDARD = "MUSIC_STANDARD".asInstanceOf[Eac3AtmosDynamicRangeCompressionLine]
  val MUSIC_LIGHT = "MUSIC_LIGHT".asInstanceOf[Eac3AtmosDynamicRangeCompressionLine]
  val SPEECH = "SPEECH".asInstanceOf[Eac3AtmosDynamicRangeCompressionLine]

  @inline def values: js.Array[Eac3AtmosDynamicRangeCompressionLine] = js.Array(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH)
}

/** Specify how the service limits the audio dynamic range when compressing the audio.
  */
@js.native
sealed trait Eac3AtmosDynamicRangeCompressionRf extends js.Any
object Eac3AtmosDynamicRangeCompressionRf {
  val NONE = "NONE".asInstanceOf[Eac3AtmosDynamicRangeCompressionRf]
  val FILM_STANDARD = "FILM_STANDARD".asInstanceOf[Eac3AtmosDynamicRangeCompressionRf]
  val FILM_LIGHT = "FILM_LIGHT".asInstanceOf[Eac3AtmosDynamicRangeCompressionRf]
  val MUSIC_STANDARD = "MUSIC_STANDARD".asInstanceOf[Eac3AtmosDynamicRangeCompressionRf]
  val MUSIC_LIGHT = "MUSIC_LIGHT".asInstanceOf[Eac3AtmosDynamicRangeCompressionRf]
  val SPEECH = "SPEECH".asInstanceOf[Eac3AtmosDynamicRangeCompressionRf]

  @inline def values: js.Array[Eac3AtmosDynamicRangeCompressionRf] = js.Array(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH)
}

/** Choose how the service meters the loudness of your audio.
  */
@js.native
sealed trait Eac3AtmosMeteringMode extends js.Any
object Eac3AtmosMeteringMode {
  val LEQ_A = "LEQ_A".asInstanceOf[Eac3AtmosMeteringMode]
  val ITU_BS_1770_1 = "ITU_BS_1770_1".asInstanceOf[Eac3AtmosMeteringMode]
  val ITU_BS_1770_2 = "ITU_BS_1770_2".asInstanceOf[Eac3AtmosMeteringMode]
  val ITU_BS_1770_3 = "ITU_BS_1770_3".asInstanceOf[Eac3AtmosMeteringMode]
  val ITU_BS_1770_4 = "ITU_BS_1770_4".asInstanceOf[Eac3AtmosMeteringMode]

  @inline def values: js.Array[Eac3AtmosMeteringMode] = js.Array(LEQ_A, ITU_BS_1770_1, ITU_BS_1770_2, ITU_BS_1770_3, ITU_BS_1770_4)
}

/** Choose how the service does stereo downmixing.
  */
@js.native
sealed trait Eac3AtmosStereoDownmix extends js.Any
object Eac3AtmosStereoDownmix {
  val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3AtmosStereoDownmix]
  val STEREO = "STEREO".asInstanceOf[Eac3AtmosStereoDownmix]
  val SURROUND = "SURROUND".asInstanceOf[Eac3AtmosStereoDownmix]
  val DPL2 = "DPL2".asInstanceOf[Eac3AtmosStereoDownmix]

  @inline def values: js.Array[Eac3AtmosStereoDownmix] = js.Array(NOT_INDICATED, STEREO, SURROUND, DPL2)
}

/** Specify whether your input audio has an additional center rear surround channel matrix encoded into your left and right surround channels.
  */
@js.native
sealed trait Eac3AtmosSurroundExMode extends js.Any
object Eac3AtmosSurroundExMode {
  val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3AtmosSurroundExMode]
  val ENABLED = "ENABLED".asInstanceOf[Eac3AtmosSurroundExMode]
  val DISABLED = "DISABLED".asInstanceOf[Eac3AtmosSurroundExMode]

  @inline def values: js.Array[Eac3AtmosSurroundExMode] = js.Array(NOT_INDICATED, ENABLED, DISABLED)
}

/** If set to ATTENUATE_3_DB, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode.
  */
@js.native
sealed trait Eac3AttenuationControl extends js.Any
object Eac3AttenuationControl {
  val ATTENUATE_3_DB = "ATTENUATE_3_DB".asInstanceOf[Eac3AttenuationControl]
  val NONE = "NONE".asInstanceOf[Eac3AttenuationControl]

  @inline def values: js.Array[Eac3AttenuationControl] = js.Array(ATTENUATE_3_DB, NONE)
}

/** Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
  */
@js.native
sealed trait Eac3BitstreamMode extends js.Any
object Eac3BitstreamMode {
  val COMPLETE_MAIN = "COMPLETE_MAIN".asInstanceOf[Eac3BitstreamMode]
  val COMMENTARY = "COMMENTARY".asInstanceOf[Eac3BitstreamMode]
  val EMERGENCY = "EMERGENCY".asInstanceOf[Eac3BitstreamMode]
  val HEARING_IMPAIRED = "HEARING_IMPAIRED".asInstanceOf[Eac3BitstreamMode]
  val VISUALLY_IMPAIRED = "VISUALLY_IMPAIRED".asInstanceOf[Eac3BitstreamMode]

  @inline def values: js.Array[Eac3BitstreamMode] = js.Array(COMPLETE_MAIN, COMMENTARY, EMERGENCY, HEARING_IMPAIRED, VISUALLY_IMPAIRED)
}

/** Dolby Digital Plus coding mode. Determines number of channels.
  */
@js.native
sealed trait Eac3CodingMode extends js.Any
object Eac3CodingMode {
  val CODING_MODE_1_0 = "CODING_MODE_1_0".asInstanceOf[Eac3CodingMode]
  val CODING_MODE_2_0 = "CODING_MODE_2_0".asInstanceOf[Eac3CodingMode]
  val CODING_MODE_3_2 = "CODING_MODE_3_2".asInstanceOf[Eac3CodingMode]

  @inline def values: js.Array[Eac3CodingMode] = js.Array(CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_3_2)
}

/** Activates a DC highpass filter for all input channels.
  */
@js.native
sealed trait Eac3DcFilter extends js.Any
object Eac3DcFilter {
  val ENABLED = "ENABLED".asInstanceOf[Eac3DcFilter]
  val DISABLED = "DISABLED".asInstanceOf[Eac3DcFilter]

  @inline def values: js.Array[Eac3DcFilter] = js.Array(ENABLED, DISABLED)
}

/** Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the Dolby Digital stream for the line operating mode. Related setting: When you use this setting, MediaConvert ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
  */
@js.native
sealed trait Eac3DynamicRangeCompressionLine extends js.Any
object Eac3DynamicRangeCompressionLine {
  val NONE = "NONE".asInstanceOf[Eac3DynamicRangeCompressionLine]
  val FILM_STANDARD = "FILM_STANDARD".asInstanceOf[Eac3DynamicRangeCompressionLine]
  val FILM_LIGHT = "FILM_LIGHT".asInstanceOf[Eac3DynamicRangeCompressionLine]
  val MUSIC_STANDARD = "MUSIC_STANDARD".asInstanceOf[Eac3DynamicRangeCompressionLine]
  val MUSIC_LIGHT = "MUSIC_LIGHT".asInstanceOf[Eac3DynamicRangeCompressionLine]
  val SPEECH = "SPEECH".asInstanceOf[Eac3DynamicRangeCompressionLine]

  @inline def values: js.Array[Eac3DynamicRangeCompressionLine] = js.Array(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH)
}

/** Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the Dolby Digital stream for the RF operating mode. Related setting: When you use this setting, MediaConvert ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
  */
@js.native
sealed trait Eac3DynamicRangeCompressionRf extends js.Any
object Eac3DynamicRangeCompressionRf {
  val NONE = "NONE".asInstanceOf[Eac3DynamicRangeCompressionRf]
  val FILM_STANDARD = "FILM_STANDARD".asInstanceOf[Eac3DynamicRangeCompressionRf]
  val FILM_LIGHT = "FILM_LIGHT".asInstanceOf[Eac3DynamicRangeCompressionRf]
  val MUSIC_STANDARD = "MUSIC_STANDARD".asInstanceOf[Eac3DynamicRangeCompressionRf]
  val MUSIC_LIGHT = "MUSIC_LIGHT".asInstanceOf[Eac3DynamicRangeCompressionRf]
  val SPEECH = "SPEECH".asInstanceOf[Eac3DynamicRangeCompressionRf]

  @inline def values: js.Array[Eac3DynamicRangeCompressionRf] = js.Array(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH)
}

/** When encoding 3/2 audio, controls whether the LFE channel is enabled
  */
@js.native
sealed trait Eac3LfeControl extends js.Any
object Eac3LfeControl {
  val LFE = "LFE".asInstanceOf[Eac3LfeControl]
  val NO_LFE = "NO_LFE".asInstanceOf[Eac3LfeControl]

  @inline def values: js.Array[Eac3LfeControl] = js.Array(LFE, NO_LFE)
}

/** Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
  */
@js.native
sealed trait Eac3LfeFilter extends js.Any
object Eac3LfeFilter {
  val ENABLED = "ENABLED".asInstanceOf[Eac3LfeFilter]
  val DISABLED = "DISABLED".asInstanceOf[Eac3LfeFilter]

  @inline def values: js.Array[Eac3LfeFilter] = js.Array(ENABLED, DISABLED)
}

/** When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
  */
@js.native
sealed trait Eac3MetadataControl extends js.Any
object Eac3MetadataControl {
  val FOLLOW_INPUT = "FOLLOW_INPUT".asInstanceOf[Eac3MetadataControl]
  val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[Eac3MetadataControl]

  @inline def values: js.Array[Eac3MetadataControl] = js.Array(FOLLOW_INPUT, USE_CONFIGURED)
}

/** When set to WHEN_POSSIBLE, input DD+ audio will be passed through if it is present on the input. this detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a consistent DD+ output as the system alternates between passthrough and encoding.
  */
@js.native
sealed trait Eac3PassthroughControl extends js.Any
object Eac3PassthroughControl {
  val WHEN_POSSIBLE = "WHEN_POSSIBLE".asInstanceOf[Eac3PassthroughControl]
  val NO_PASSTHROUGH = "NO_PASSTHROUGH".asInstanceOf[Eac3PassthroughControl]

  @inline def values: js.Array[Eac3PassthroughControl] = js.Array(WHEN_POSSIBLE, NO_PASSTHROUGH)
}

/** Controls the amount of phase-shift applied to the surround channels. Only used for 3/2 coding mode.
  */
@js.native
sealed trait Eac3PhaseControl extends js.Any
object Eac3PhaseControl {
  val SHIFT_90_DEGREES = "SHIFT_90_DEGREES".asInstanceOf[Eac3PhaseControl]
  val NO_SHIFT = "NO_SHIFT".asInstanceOf[Eac3PhaseControl]

  @inline def values: js.Array[Eac3PhaseControl] = js.Array(SHIFT_90_DEGREES, NO_SHIFT)
}

/** Choose how the service does stereo downmixing. This setting only applies if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Stereo downmix (Eac3StereoDownmix).
  */
@js.native
sealed trait Eac3StereoDownmix extends js.Any
object Eac3StereoDownmix {
  val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3StereoDownmix]
  val LO_RO = "LO_RO".asInstanceOf[Eac3StereoDownmix]
  val LT_RT = "LT_RT".asInstanceOf[Eac3StereoDownmix]
  val DPL2 = "DPL2".asInstanceOf[Eac3StereoDownmix]

  @inline def values: js.Array[Eac3StereoDownmix] = js.Array(NOT_INDICATED, LO_RO, LT_RT, DPL2)
}

/** When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the left and right surround channels.
  */
@js.native
sealed trait Eac3SurroundExMode extends js.Any
object Eac3SurroundExMode {
  val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3SurroundExMode]
  val ENABLED = "ENABLED".asInstanceOf[Eac3SurroundExMode]
  val DISABLED = "DISABLED".asInstanceOf[Eac3SurroundExMode]

  @inline def values: js.Array[Eac3SurroundExMode] = js.Array(NOT_INDICATED, ENABLED, DISABLED)
}

/** When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels.
  */
@js.native
sealed trait Eac3SurroundMode extends js.Any
object Eac3SurroundMode {
  val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3SurroundMode]
  val ENABLED = "ENABLED".asInstanceOf[Eac3SurroundMode]
  val DISABLED = "DISABLED".asInstanceOf[Eac3SurroundMode]

  @inline def values: js.Array[Eac3SurroundMode] = js.Array(NOT_INDICATED, ENABLED, DISABLED)
}

/** Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
  */
@js.native
sealed trait EmbeddedConvert608To708 extends js.Any
object EmbeddedConvert608To708 {
  val UPCONVERT = "UPCONVERT".asInstanceOf[EmbeddedConvert608To708]
  val DISABLED = "DISABLED".asInstanceOf[EmbeddedConvert608To708]

  @inline def values: js.Array[EmbeddedConvert608To708] = js.Array(UPCONVERT, DISABLED)
}

/** By default, the service terminates any unterminated captions at the end of each input. If you want the caption to continue onto your next input, disable this setting.
  */
@js.native
sealed trait EmbeddedTerminateCaptions extends js.Any
object EmbeddedTerminateCaptions {
  val END_OF_INPUT = "END_OF_INPUT".asInstanceOf[EmbeddedTerminateCaptions]
  val DISABLED = "DISABLED".asInstanceOf[EmbeddedTerminateCaptions]

  @inline def values: js.Array[EmbeddedTerminateCaptions] = js.Array(END_OF_INPUT, DISABLED)
}

/** If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
  */
@js.native
sealed trait F4vMoovPlacement extends js.Any
object F4vMoovPlacement {
  val PROGRESSIVE_DOWNLOAD = "PROGRESSIVE_DOWNLOAD".asInstanceOf[F4vMoovPlacement]
  val NORMAL = "NORMAL".asInstanceOf[F4vMoovPlacement]

  @inline def values: js.Array[F4vMoovPlacement] = js.Array(PROGRESSIVE_DOWNLOAD, NORMAL)
}

/** Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
  */
@js.native
sealed trait FileSourceConvert608To708 extends js.Any
object FileSourceConvert608To708 {
  val UPCONVERT = "UPCONVERT".asInstanceOf[FileSourceConvert608To708]
  val DISABLED = "DISABLED".asInstanceOf[FileSourceConvert608To708]

  @inline def values: js.Array[FileSourceConvert608To708] = js.Array(UPCONVERT, DISABLED)
}

/** Provide the font script, using an ISO 15924 script code, if the LanguageCode is not sufficient for determining the script type. Where LanguageCode or CustomLanguageCode is sufficient, use "AUTOMATIC" or leave unset.
  */
@js.native
sealed trait FontScript extends js.Any
object FontScript {
  val AUTOMATIC = "AUTOMATIC".asInstanceOf[FontScript]
  val HANS = "HANS".asInstanceOf[FontScript]
  val HANT = "HANT".asInstanceOf[FontScript]

  @inline def values: js.Array[FontScript] = js.Array(AUTOMATIC, HANS, HANT)
}

/** Keep the default value, Auto (AUTO), for this setting to have MediaConvert automatically apply the best types of quantization for your video content. When you want to apply your quantization settings manually, you must set H264AdaptiveQuantization to a value other than Auto (AUTO). Use this setting to specify the strength of any adaptive quantization filters that you enable. If you don't want MediaConvert to do any adaptive quantization in this transcode, set Adaptive quantization (H264AdaptiveQuantization) to Off (OFF). Related settings: The value that you choose here applies to the following settings: H264FlickerAdaptiveQuantization, H264SpatialAdaptiveQuantization, and H264TemporalAdaptiveQuantization.
  */
@js.native
sealed trait H264AdaptiveQuantization extends js.Any
object H264AdaptiveQuantization {
  val OFF = "OFF".asInstanceOf[H264AdaptiveQuantization]
  val AUTO = "AUTO".asInstanceOf[H264AdaptiveQuantization]
  val LOW = "LOW".asInstanceOf[H264AdaptiveQuantization]
  val MEDIUM = "MEDIUM".asInstanceOf[H264AdaptiveQuantization]
  val HIGH = "HIGH".asInstanceOf[H264AdaptiveQuantization]
  val HIGHER = "HIGHER".asInstanceOf[H264AdaptiveQuantization]
  val MAX = "MAX".asInstanceOf[H264AdaptiveQuantization]

  @inline def values: js.Array[H264AdaptiveQuantization] = js.Array(OFF, AUTO, LOW, MEDIUM, HIGH, HIGHER, MAX)
}

/** Specify an H.264 level that is consistent with your output video settings. If you aren't sure what level to specify, choose Auto (AUTO).
  */
@js.native
sealed trait H264CodecLevel extends js.Any
object H264CodecLevel {
  val AUTO = "AUTO".asInstanceOf[H264CodecLevel]
  val LEVEL_1 = "LEVEL_1".asInstanceOf[H264CodecLevel]
  val LEVEL_1_1 = "LEVEL_1_1".asInstanceOf[H264CodecLevel]
  val LEVEL_1_2 = "LEVEL_1_2".asInstanceOf[H264CodecLevel]
  val LEVEL_1_3 = "LEVEL_1_3".asInstanceOf[H264CodecLevel]
  val LEVEL_2 = "LEVEL_2".asInstanceOf[H264CodecLevel]
  val LEVEL_2_1 = "LEVEL_2_1".asInstanceOf[H264CodecLevel]
  val LEVEL_2_2 = "LEVEL_2_2".asInstanceOf[H264CodecLevel]
  val LEVEL_3 = "LEVEL_3".asInstanceOf[H264CodecLevel]
  val LEVEL_3_1 = "LEVEL_3_1".asInstanceOf[H264CodecLevel]
  val LEVEL_3_2 = "LEVEL_3_2".asInstanceOf[H264CodecLevel]
  val LEVEL_4 = "LEVEL_4".asInstanceOf[H264CodecLevel]
  val LEVEL_4_1 = "LEVEL_4_1".asInstanceOf[H264CodecLevel]
  val LEVEL_4_2 = "LEVEL_4_2".asInstanceOf[H264CodecLevel]
  val LEVEL_5 = "LEVEL_5".asInstanceOf[H264CodecLevel]
  val LEVEL_5_1 = "LEVEL_5_1".asInstanceOf[H264CodecLevel]
  val LEVEL_5_2 = "LEVEL_5_2".asInstanceOf[H264CodecLevel]

  @inline def values: js.Array[H264CodecLevel] = js.Array(
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
@js.native
sealed trait H264CodecProfile extends js.Any
object H264CodecProfile {
  val BASELINE = "BASELINE".asInstanceOf[H264CodecProfile]
  val HIGH = "HIGH".asInstanceOf[H264CodecProfile]
  val HIGH_10BIT = "HIGH_10BIT".asInstanceOf[H264CodecProfile]
  val HIGH_422 = "HIGH_422".asInstanceOf[H264CodecProfile]
  val HIGH_422_10BIT = "HIGH_422_10BIT".asInstanceOf[H264CodecProfile]
  val MAIN = "MAIN".asInstanceOf[H264CodecProfile]

  @inline def values: js.Array[H264CodecProfile] = js.Array(BASELINE, HIGH, HIGH_10BIT, HIGH_422, HIGH_422_10BIT, MAIN)
}

/** Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
  */
@js.native
sealed trait H264DynamicSubGop extends js.Any
object H264DynamicSubGop {
  val ADAPTIVE = "ADAPTIVE".asInstanceOf[H264DynamicSubGop]
  val STATIC = "STATIC".asInstanceOf[H264DynamicSubGop]

  @inline def values: js.Array[H264DynamicSubGop] = js.Array(ADAPTIVE, STATIC)
}

/** Entropy encoding mode. Use CABAC (must be in Main or High profile) or CAVLC.
  */
@js.native
sealed trait H264EntropyEncoding extends js.Any
object H264EntropyEncoding {
  val CABAC = "CABAC".asInstanceOf[H264EntropyEncoding]
  val CAVLC = "CAVLC".asInstanceOf[H264EntropyEncoding]

  @inline def values: js.Array[H264EntropyEncoding] = js.Array(CABAC, CAVLC)
}

/** Keep the default value, PAFF, to have MediaConvert use PAFF encoding for interlaced outputs. Choose Force field (FORCE_FIELD) to disable PAFF encoding and create separate interlaced fields.
  */
@js.native
sealed trait H264FieldEncoding extends js.Any
object H264FieldEncoding {
  val PAFF = "PAFF".asInstanceOf[H264FieldEncoding]
  val FORCE_FIELD = "FORCE_FIELD".asInstanceOf[H264FieldEncoding]

  @inline def values: js.Array[H264FieldEncoding] = js.Array(PAFF, FORCE_FIELD)
}

/** Only use this setting when you change the default value, AUTO, for the setting H264AdaptiveQuantization. When you keep all defaults, excluding H264AdaptiveQuantization and all other adaptive quantization from your JSON job specification, MediaConvert automatically applies the best types of quantization for your video content. When you set H264AdaptiveQuantization to a value other than AUTO, the default value for H264FlickerAdaptiveQuantization is Disabled (DISABLED). Change this value to Enabled (ENABLED) to reduce I-frame pop. I-frame pop appears as a visual flicker that can arise when the encoder saves bits by copying some macroblocks many times from frame to frame, and then refreshes them at the I-frame. When you enable this setting, the encoder updates these macroblocks slightly more often to smooth out the flicker. To manually enable or disable H264FlickerAdaptiveQuantization, you must set Adaptive quantization (H264AdaptiveQuantization) to a value other than AUTO.
  */
@js.native
sealed trait H264FlickerAdaptiveQuantization extends js.Any
object H264FlickerAdaptiveQuantization {
  val DISABLED = "DISABLED".asInstanceOf[H264FlickerAdaptiveQuantization]
  val ENABLED = "ENABLED".asInstanceOf[H264FlickerAdaptiveQuantization]

  @inline def values: js.Array[H264FlickerAdaptiveQuantization] = js.Array(DISABLED, ENABLED)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
@js.native
sealed trait H264FramerateControl extends js.Any
object H264FramerateControl {
  val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[H264FramerateControl]
  val SPECIFIED = "SPECIFIED".asInstanceOf[H264FramerateControl]

  @inline def values: js.Array[H264FramerateControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
@js.native
sealed trait H264FramerateConversionAlgorithm extends js.Any
object H264FramerateConversionAlgorithm {
  val DUPLICATE_DROP = "DUPLICATE_DROP".asInstanceOf[H264FramerateConversionAlgorithm]
  val INTERPOLATE = "INTERPOLATE".asInstanceOf[H264FramerateConversionAlgorithm]
  val FRAMEFORMER = "FRAMEFORMER".asInstanceOf[H264FramerateConversionAlgorithm]

  @inline def values: js.Array[H264FramerateConversionAlgorithm] = js.Array(DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** If enable, use reference B frames for GOP structures that have B frames > 1.
  */
@js.native
sealed trait H264GopBReference extends js.Any
object H264GopBReference {
  val DISABLED = "DISABLED".asInstanceOf[H264GopBReference]
  val ENABLED = "ENABLED".asInstanceOf[H264GopBReference]

  @inline def values: js.Array[H264GopBReference] = js.Array(DISABLED, ENABLED)
}

/** Indicates if the GOP Size in H264 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
  */
@js.native
sealed trait H264GopSizeUnits extends js.Any
object H264GopSizeUnits {
  val FRAMES = "FRAMES".asInstanceOf[H264GopSizeUnits]
  val SECONDS = "SECONDS".asInstanceOf[H264GopSizeUnits]

  @inline def values: js.Array[H264GopSizeUnits] = js.Array(FRAMES, SECONDS)
}

/** Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
  */
@js.native
sealed trait H264InterlaceMode extends js.Any
object H264InterlaceMode {
  val PROGRESSIVE = "PROGRESSIVE".asInstanceOf[H264InterlaceMode]
  val TOP_FIELD = "TOP_FIELD".asInstanceOf[H264InterlaceMode]
  val BOTTOM_FIELD = "BOTTOM_FIELD".asInstanceOf[H264InterlaceMode]
  val FOLLOW_TOP_FIELD = "FOLLOW_TOP_FIELD".asInstanceOf[H264InterlaceMode]
  val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD".asInstanceOf[H264InterlaceMode]

  @inline def values: js.Array[H264InterlaceMode] = js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD)
}

/** Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
  */
@js.native
sealed trait H264ParControl extends js.Any
object H264ParControl {
  val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[H264ParControl]
  val SPECIFIED = "SPECIFIED".asInstanceOf[H264ParControl]

  @inline def values: js.Array[H264ParControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, single-pass encoding.
  */
@js.native
sealed trait H264QualityTuningLevel extends js.Any
object H264QualityTuningLevel {
  val SINGLE_PASS = "SINGLE_PASS".asInstanceOf[H264QualityTuningLevel]
  val SINGLE_PASS_HQ = "SINGLE_PASS_HQ".asInstanceOf[H264QualityTuningLevel]
  val MULTI_PASS_HQ = "MULTI_PASS_HQ".asInstanceOf[H264QualityTuningLevel]

  @inline def values: js.Array[H264QualityTuningLevel] = js.Array(SINGLE_PASS, SINGLE_PASS_HQ, MULTI_PASS_HQ)
}

/** Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
  */
@js.native
sealed trait H264RateControlMode extends js.Any
object H264RateControlMode {
  val VBR = "VBR".asInstanceOf[H264RateControlMode]
  val CBR = "CBR".asInstanceOf[H264RateControlMode]
  val QVBR = "QVBR".asInstanceOf[H264RateControlMode]

  @inline def values: js.Array[H264RateControlMode] = js.Array(VBR, CBR, QVBR)
}

/** Places a PPS header on each encoded picture, even if repeated.
  */
@js.native
sealed trait H264RepeatPps extends js.Any
object H264RepeatPps {
  val DISABLED = "DISABLED".asInstanceOf[H264RepeatPps]
  val ENABLED = "ENABLED".asInstanceOf[H264RepeatPps]

  @inline def values: js.Array[H264RepeatPps] = js.Array(DISABLED, ENABLED)
}

/** Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
  */
@js.native
sealed trait H264ScanTypeConversionMode extends js.Any
object H264ScanTypeConversionMode {
  val INTERLACED = "INTERLACED".asInstanceOf[H264ScanTypeConversionMode]
  val INTERLACED_OPTIMIZE = "INTERLACED_OPTIMIZE".asInstanceOf[H264ScanTypeConversionMode]

  @inline def values: js.Array[H264ScanTypeConversionMode] = js.Array(INTERLACED, INTERLACED_OPTIMIZE)
}

/** Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default. If this output uses QVBR, choose Transition detection (TRANSITION_DETECTION) for further video quality improvement. For more information about QVBR, see https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
  */
@js.native
sealed trait H264SceneChangeDetect extends js.Any
object H264SceneChangeDetect {
  val DISABLED = "DISABLED".asInstanceOf[H264SceneChangeDetect]
  val ENABLED = "ENABLED".asInstanceOf[H264SceneChangeDetect]
  val TRANSITION_DETECTION = "TRANSITION_DETECTION".asInstanceOf[H264SceneChangeDetect]

  @inline def values: js.Array[H264SceneChangeDetect] = js.Array(DISABLED, ENABLED, TRANSITION_DETECTION)
}

/** Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
  */
@js.native
sealed trait H264SlowPal extends js.Any
object H264SlowPal {
  val DISABLED = "DISABLED".asInstanceOf[H264SlowPal]
  val ENABLED = "ENABLED".asInstanceOf[H264SlowPal]

  @inline def values: js.Array[H264SlowPal] = js.Array(DISABLED, ENABLED)
}

/** Only use this setting when you change the default value, Auto (AUTO), for the setting H264AdaptiveQuantization. When you keep all defaults, excluding H264AdaptiveQuantization and all other adaptive quantization from your JSON job specification, MediaConvert automatically applies the best types of quantization for your video content. When you set H264AdaptiveQuantization to a value other than AUTO, the default value for H264SpatialAdaptiveQuantization is Enabled (ENABLED). Keep this default value to adjust quantization within each frame based on spatial variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your video quality.
  * Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture, you might choose to set H264SpatialAdaptiveQuantization to Disabled (DISABLED). Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization (H264AdaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video games, set it to Low. For content with a wider variety of textures, set it to High or Higher. To manually enable or disable H264SpatialAdaptiveQuantization, you must set Adaptive quantization (H264AdaptiveQuantization) to a value other than AUTO.
  */
@js.native
sealed trait H264SpatialAdaptiveQuantization extends js.Any
object H264SpatialAdaptiveQuantization {
  val DISABLED = "DISABLED".asInstanceOf[H264SpatialAdaptiveQuantization]
  val ENABLED = "ENABLED".asInstanceOf[H264SpatialAdaptiveQuantization]

  @inline def values: js.Array[H264SpatialAdaptiveQuantization] = js.Array(DISABLED, ENABLED)
}

/** Produces a bitstream compliant with SMPTE RP-2027.
  */
@js.native
sealed trait H264Syntax extends js.Any
object H264Syntax {
  val DEFAULT = "DEFAULT".asInstanceOf[H264Syntax]
  val RP2027 = "RP2027".asInstanceOf[H264Syntax]

  @inline def values: js.Array[H264Syntax] = js.Array(DEFAULT, RP2027)
}

/** When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is interlaced, you can optionally enable hard or soft telecine to create a smoother picture. Hard telecine (HARD) produces a 29.97i output. Soft telecine (SOFT) produces an output with a 23.976 output that signals to the video player device to do the conversion during play back. When you keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother picture.
  */
@js.native
sealed trait H264Telecine extends js.Any
object H264Telecine {
  val NONE = "NONE".asInstanceOf[H264Telecine]
  val SOFT = "SOFT".asInstanceOf[H264Telecine]
  val HARD = "HARD".asInstanceOf[H264Telecine]

  @inline def values: js.Array[H264Telecine] = js.Array(NONE, SOFT, HARD)
}

/** Only use this setting when you change the default value, AUTO, for the setting H264AdaptiveQuantization. When you keep all defaults, excluding H264AdaptiveQuantization and all other adaptive quantization from your JSON job specification, MediaConvert automatically applies the best types of quantization for your video content. When you set H264AdaptiveQuantization to a value other than AUTO, the default value for H264TemporalAdaptiveQuantization is Enabled (ENABLED). Keep this default value to adjust quantization within each frame based on temporal variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that aren't moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into
  * account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen that doesn't have moving objects with sharp edges, such as sports athletes' faces, you might choose to set H264TemporalAdaptiveQuantization to Disabled (DISABLED). Related setting: When you enable temporal quantization, adjust the strength of the filter with the setting Adaptive quantization (adaptiveQuantization). To manually enable or disable H264TemporalAdaptiveQuantization, you must set Adaptive quantization (H264AdaptiveQuantization) to a value other than AUTO.
  */
@js.native
sealed trait H264TemporalAdaptiveQuantization extends js.Any
object H264TemporalAdaptiveQuantization {
  val DISABLED = "DISABLED".asInstanceOf[H264TemporalAdaptiveQuantization]
  val ENABLED = "ENABLED".asInstanceOf[H264TemporalAdaptiveQuantization]

  @inline def values: js.Array[H264TemporalAdaptiveQuantization] = js.Array(DISABLED, ENABLED)
}

/** Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
  */
@js.native
sealed trait H264UnregisteredSeiTimecode extends js.Any
object H264UnregisteredSeiTimecode {
  val DISABLED = "DISABLED".asInstanceOf[H264UnregisteredSeiTimecode]
  val ENABLED = "ENABLED".asInstanceOf[H264UnregisteredSeiTimecode]

  @inline def values: js.Array[H264UnregisteredSeiTimecode] = js.Array(DISABLED, ENABLED)
}

/** Specify the strength of any adaptive quantization filters that you enable. The value that you choose here applies to the following settings: Flicker adaptive quantization (flickerAdaptiveQuantization), Spatial adaptive quantization (spatialAdaptiveQuantization), and Temporal adaptive quantization (temporalAdaptiveQuantization).
  */
@js.native
sealed trait H265AdaptiveQuantization extends js.Any
object H265AdaptiveQuantization {
  val OFF = "OFF".asInstanceOf[H265AdaptiveQuantization]
  val LOW = "LOW".asInstanceOf[H265AdaptiveQuantization]
  val MEDIUM = "MEDIUM".asInstanceOf[H265AdaptiveQuantization]
  val HIGH = "HIGH".asInstanceOf[H265AdaptiveQuantization]
  val HIGHER = "HIGHER".asInstanceOf[H265AdaptiveQuantization]
  val MAX = "MAX".asInstanceOf[H265AdaptiveQuantization]

  @inline def values: js.Array[H265AdaptiveQuantization] = js.Array(OFF, LOW, MEDIUM, HIGH, HIGHER, MAX)
}

/** Enables Alternate Transfer Function SEI message for outputs using Hybrid Log Gamma (HLG) Electro-Optical Transfer Function (EOTF).
  */
@js.native
sealed trait H265AlternateTransferFunctionSei extends js.Any
object H265AlternateTransferFunctionSei {
  val DISABLED = "DISABLED".asInstanceOf[H265AlternateTransferFunctionSei]
  val ENABLED = "ENABLED".asInstanceOf[H265AlternateTransferFunctionSei]

  @inline def values: js.Array[H265AlternateTransferFunctionSei] = js.Array(DISABLED, ENABLED)
}

/** H.265 Level.
  */
@js.native
sealed trait H265CodecLevel extends js.Any
object H265CodecLevel {
  val AUTO = "AUTO".asInstanceOf[H265CodecLevel]
  val LEVEL_1 = "LEVEL_1".asInstanceOf[H265CodecLevel]
  val LEVEL_2 = "LEVEL_2".asInstanceOf[H265CodecLevel]
  val LEVEL_2_1 = "LEVEL_2_1".asInstanceOf[H265CodecLevel]
  val LEVEL_3 = "LEVEL_3".asInstanceOf[H265CodecLevel]
  val LEVEL_3_1 = "LEVEL_3_1".asInstanceOf[H265CodecLevel]
  val LEVEL_4 = "LEVEL_4".asInstanceOf[H265CodecLevel]
  val LEVEL_4_1 = "LEVEL_4_1".asInstanceOf[H265CodecLevel]
  val LEVEL_5 = "LEVEL_5".asInstanceOf[H265CodecLevel]
  val LEVEL_5_1 = "LEVEL_5_1".asInstanceOf[H265CodecLevel]
  val LEVEL_5_2 = "LEVEL_5_2".asInstanceOf[H265CodecLevel]
  val LEVEL_6 = "LEVEL_6".asInstanceOf[H265CodecLevel]
  val LEVEL_6_1 = "LEVEL_6_1".asInstanceOf[H265CodecLevel]
  val LEVEL_6_2 = "LEVEL_6_2".asInstanceOf[H265CodecLevel]

  @inline def values: js.Array[H265CodecLevel] = js.Array(AUTO, LEVEL_1, LEVEL_2, LEVEL_2_1, LEVEL_3, LEVEL_3_1, LEVEL_4, LEVEL_4_1, LEVEL_5, LEVEL_5_1, LEVEL_5_2, LEVEL_6, LEVEL_6_1, LEVEL_6_2)
}

/** Represents the Profile and Tier, per the HEVC (H.265) specification. Selections are grouped as [Profile] / [Tier], so "Main/High" represents Main Profile with High Tier. 4:2:2 profiles are only available with the HEVC 4:2:2 License.
  */
@js.native
sealed trait H265CodecProfile extends js.Any
object H265CodecProfile {
  val MAIN_MAIN = "MAIN_MAIN".asInstanceOf[H265CodecProfile]
  val MAIN_HIGH = "MAIN_HIGH".asInstanceOf[H265CodecProfile]
  val MAIN10_MAIN = "MAIN10_MAIN".asInstanceOf[H265CodecProfile]
  val MAIN10_HIGH = "MAIN10_HIGH".asInstanceOf[H265CodecProfile]
  val MAIN_422_8BIT_MAIN = "MAIN_422_8BIT_MAIN".asInstanceOf[H265CodecProfile]
  val MAIN_422_8BIT_HIGH = "MAIN_422_8BIT_HIGH".asInstanceOf[H265CodecProfile]
  val MAIN_422_10BIT_MAIN = "MAIN_422_10BIT_MAIN".asInstanceOf[H265CodecProfile]
  val MAIN_422_10BIT_HIGH = "MAIN_422_10BIT_HIGH".asInstanceOf[H265CodecProfile]

  @inline def values: js.Array[H265CodecProfile] = js.Array(MAIN_MAIN, MAIN_HIGH, MAIN10_MAIN, MAIN10_HIGH, MAIN_422_8BIT_MAIN, MAIN_422_8BIT_HIGH, MAIN_422_10BIT_MAIN, MAIN_422_10BIT_HIGH)
}

/** Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
  */
@js.native
sealed trait H265DynamicSubGop extends js.Any
object H265DynamicSubGop {
  val ADAPTIVE = "ADAPTIVE".asInstanceOf[H265DynamicSubGop]
  val STATIC = "STATIC".asInstanceOf[H265DynamicSubGop]

  @inline def values: js.Array[H265DynamicSubGop] = js.Array(ADAPTIVE, STATIC)
}

/** Enable this setting to have the encoder reduce I-frame pop. I-frame pop appears as a visual flicker that can arise when the encoder saves bits by copying some macroblocks many times from frame to frame, and then refreshes them at the I-frame. When you enable this setting, the encoder updates these macroblocks slightly more often to smooth out the flicker. This setting is disabled by default. Related setting: In addition to enabling this setting, you must also set adaptiveQuantization to a value other than Off (OFF).
  */
@js.native
sealed trait H265FlickerAdaptiveQuantization extends js.Any
object H265FlickerAdaptiveQuantization {
  val DISABLED = "DISABLED".asInstanceOf[H265FlickerAdaptiveQuantization]
  val ENABLED = "ENABLED".asInstanceOf[H265FlickerAdaptiveQuantization]

  @inline def values: js.Array[H265FlickerAdaptiveQuantization] = js.Array(DISABLED, ENABLED)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
@js.native
sealed trait H265FramerateControl extends js.Any
object H265FramerateControl {
  val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[H265FramerateControl]
  val SPECIFIED = "SPECIFIED".asInstanceOf[H265FramerateControl]

  @inline def values: js.Array[H265FramerateControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
@js.native
sealed trait H265FramerateConversionAlgorithm extends js.Any
object H265FramerateConversionAlgorithm {
  val DUPLICATE_DROP = "DUPLICATE_DROP".asInstanceOf[H265FramerateConversionAlgorithm]
  val INTERPOLATE = "INTERPOLATE".asInstanceOf[H265FramerateConversionAlgorithm]
  val FRAMEFORMER = "FRAMEFORMER".asInstanceOf[H265FramerateConversionAlgorithm]

  @inline def values: js.Array[H265FramerateConversionAlgorithm] = js.Array(DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** If enable, use reference B frames for GOP structures that have B frames > 1.
  */
@js.native
sealed trait H265GopBReference extends js.Any
object H265GopBReference {
  val DISABLED = "DISABLED".asInstanceOf[H265GopBReference]
  val ENABLED = "ENABLED".asInstanceOf[H265GopBReference]

  @inline def values: js.Array[H265GopBReference] = js.Array(DISABLED, ENABLED)
}

/** Indicates if the GOP Size in H265 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
  */
@js.native
sealed trait H265GopSizeUnits extends js.Any
object H265GopSizeUnits {
  val FRAMES = "FRAMES".asInstanceOf[H265GopSizeUnits]
  val SECONDS = "SECONDS".asInstanceOf[H265GopSizeUnits]

  @inline def values: js.Array[H265GopSizeUnits] = js.Array(FRAMES, SECONDS)
}

/** Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
  */
@js.native
sealed trait H265InterlaceMode extends js.Any
object H265InterlaceMode {
  val PROGRESSIVE = "PROGRESSIVE".asInstanceOf[H265InterlaceMode]
  val TOP_FIELD = "TOP_FIELD".asInstanceOf[H265InterlaceMode]
  val BOTTOM_FIELD = "BOTTOM_FIELD".asInstanceOf[H265InterlaceMode]
  val FOLLOW_TOP_FIELD = "FOLLOW_TOP_FIELD".asInstanceOf[H265InterlaceMode]
  val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD".asInstanceOf[H265InterlaceMode]

  @inline def values: js.Array[H265InterlaceMode] = js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD)
}

/** Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
  */
@js.native
sealed trait H265ParControl extends js.Any
object H265ParControl {
  val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[H265ParControl]
  val SPECIFIED = "SPECIFIED".asInstanceOf[H265ParControl]

  @inline def values: js.Array[H265ParControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, single-pass encoding.
  */
@js.native
sealed trait H265QualityTuningLevel extends js.Any
object H265QualityTuningLevel {
  val SINGLE_PASS = "SINGLE_PASS".asInstanceOf[H265QualityTuningLevel]
  val SINGLE_PASS_HQ = "SINGLE_PASS_HQ".asInstanceOf[H265QualityTuningLevel]
  val MULTI_PASS_HQ = "MULTI_PASS_HQ".asInstanceOf[H265QualityTuningLevel]

  @inline def values: js.Array[H265QualityTuningLevel] = js.Array(SINGLE_PASS, SINGLE_PASS_HQ, MULTI_PASS_HQ)
}

/** Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
  */
@js.native
sealed trait H265RateControlMode extends js.Any
object H265RateControlMode {
  val VBR = "VBR".asInstanceOf[H265RateControlMode]
  val CBR = "CBR".asInstanceOf[H265RateControlMode]
  val QVBR = "QVBR".asInstanceOf[H265RateControlMode]

  @inline def values: js.Array[H265RateControlMode] = js.Array(VBR, CBR, QVBR)
}

/** Specify Sample Adaptive Offset (SAO) filter strength. Adaptive mode dynamically selects best strength based on content
  */
@js.native
sealed trait H265SampleAdaptiveOffsetFilterMode extends js.Any
object H265SampleAdaptiveOffsetFilterMode {
  val DEFAULT = "DEFAULT".asInstanceOf[H265SampleAdaptiveOffsetFilterMode]
  val ADAPTIVE = "ADAPTIVE".asInstanceOf[H265SampleAdaptiveOffsetFilterMode]
  val OFF = "OFF".asInstanceOf[H265SampleAdaptiveOffsetFilterMode]

  @inline def values: js.Array[H265SampleAdaptiveOffsetFilterMode] = js.Array(DEFAULT, ADAPTIVE, OFF)
}

/** Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
  */
@js.native
sealed trait H265ScanTypeConversionMode extends js.Any
object H265ScanTypeConversionMode {
  val INTERLACED = "INTERLACED".asInstanceOf[H265ScanTypeConversionMode]
  val INTERLACED_OPTIMIZE = "INTERLACED_OPTIMIZE".asInstanceOf[H265ScanTypeConversionMode]

  @inline def values: js.Array[H265ScanTypeConversionMode] = js.Array(INTERLACED, INTERLACED_OPTIMIZE)
}

/** Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default. If this output uses QVBR, choose Transition detection (TRANSITION_DETECTION) for further video quality improvement. For more information about QVBR, see https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
  */
@js.native
sealed trait H265SceneChangeDetect extends js.Any
object H265SceneChangeDetect {
  val DISABLED = "DISABLED".asInstanceOf[H265SceneChangeDetect]
  val ENABLED = "ENABLED".asInstanceOf[H265SceneChangeDetect]
  val TRANSITION_DETECTION = "TRANSITION_DETECTION".asInstanceOf[H265SceneChangeDetect]

  @inline def values: js.Array[H265SceneChangeDetect] = js.Array(DISABLED, ENABLED, TRANSITION_DETECTION)
}

/** Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
  */
@js.native
sealed trait H265SlowPal extends js.Any
object H265SlowPal {
  val DISABLED = "DISABLED".asInstanceOf[H265SlowPal]
  val ENABLED = "ENABLED".asInstanceOf[H265SlowPal]

  @inline def values: js.Array[H265SlowPal] = js.Array(DISABLED, ENABLED)
}

/** Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture, you might choose to disable this feature. Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video
  * games, set it to Low. For content with a wider variety of textures, set it to High or Higher.
  */
@js.native
sealed trait H265SpatialAdaptiveQuantization extends js.Any
object H265SpatialAdaptiveQuantization {
  val DISABLED = "DISABLED".asInstanceOf[H265SpatialAdaptiveQuantization]
  val ENABLED = "ENABLED".asInstanceOf[H265SpatialAdaptiveQuantization]

  @inline def values: js.Array[H265SpatialAdaptiveQuantization] = js.Array(DISABLED, ENABLED)
}

/** This field applies only if the Streams > Advanced > Framerate (framerate) field is set to 29.970. This field works with the Streams > Advanced > Preprocessors > Deinterlacer field (deinterlace_mode) and the Streams > Advanced > Interlaced Mode field (interlace_mode) to identify the scan type for the output: Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces 23.976; the player converts this output to 29.97i.
  */
@js.native
sealed trait H265Telecine extends js.Any
object H265Telecine {
  val NONE = "NONE".asInstanceOf[H265Telecine]
  val SOFT = "SOFT".asInstanceOf[H265Telecine]
  val HARD = "HARD".asInstanceOf[H265Telecine]

  @inline def values: js.Array[H265Telecine] = js.Array(NONE, SOFT, HARD)
}

/** Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on temporal variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that aren't moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen that doesn't have moving objects with sharp edges, such as sports athletes' faces, you might choose to disable this feature. Related setting: When you enable temporal quantization, adjust the strength of the filter with the setting Adaptive quantization (adaptiveQuantization).
  */
@js.native
sealed trait H265TemporalAdaptiveQuantization extends js.Any
object H265TemporalAdaptiveQuantization {
  val DISABLED = "DISABLED".asInstanceOf[H265TemporalAdaptiveQuantization]
  val ENABLED = "ENABLED".asInstanceOf[H265TemporalAdaptiveQuantization]

  @inline def values: js.Array[H265TemporalAdaptiveQuantization] = js.Array(DISABLED, ENABLED)
}

/** Enables temporal layer identifiers in the encoded bitstream. Up to 3 layers are supported depending on GOP structure: I- and P-frames form one layer, reference B-frames can form a second layer and non-reference b-frames can form a third layer. Decoders can optionally decode only the lower temporal layers to generate a lower frame rate output. For example, given a bitstream with temporal IDs and with b-frames = 1 (i.e. IbPbPb display order), a decoder could decode all the frames for full frame rate output or only the I and P frames (lowest temporal layer) for a half frame rate output.
  */
@js.native
sealed trait H265TemporalIds extends js.Any
object H265TemporalIds {
  val DISABLED = "DISABLED".asInstanceOf[H265TemporalIds]
  val ENABLED = "ENABLED".asInstanceOf[H265TemporalIds]

  @inline def values: js.Array[H265TemporalIds] = js.Array(DISABLED, ENABLED)
}

/** Enable use of tiles, allowing horizontal as well as vertical subdivision of the encoded pictures.
  */
@js.native
sealed trait H265Tiles extends js.Any
object H265Tiles {
  val DISABLED = "DISABLED".asInstanceOf[H265Tiles]
  val ENABLED = "ENABLED".asInstanceOf[H265Tiles]

  @inline def values: js.Array[H265Tiles] = js.Array(DISABLED, ENABLED)
}

/** Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
  */
@js.native
sealed trait H265UnregisteredSeiTimecode extends js.Any
object H265UnregisteredSeiTimecode {
  val DISABLED = "DISABLED".asInstanceOf[H265UnregisteredSeiTimecode]
  val ENABLED = "ENABLED".asInstanceOf[H265UnregisteredSeiTimecode]

  @inline def values: js.Array[H265UnregisteredSeiTimecode] = js.Array(DISABLED, ENABLED)
}

/** If the location of parameter set NAL units doesn't matter in your workflow, ignore this setting. Use this setting only with CMAF or DASH outputs, or with standalone file outputs in an MPEG-4 container (MP4 outputs). Choose HVC1 to mark your output as HVC1. This makes your output compliant with the following specification: ISO IECJTC1 SC29 N13798 Text ISO/IEC FDIS 14496-15 3rd Edition. For these outputs, the service stores parameter set NAL units in the sample headers but not in the samples directly. For MP4 outputs, when you choose HVC1, your output video might not work properly with some downstream systems and video players. The service defaults to marking your output as HEV1. For these outputs, the service writes parameter set NAL units directly into the samples.
  */
@js.native
sealed trait H265WriteMp4PackagingType extends js.Any
object H265WriteMp4PackagingType {
  val HVC1 = "HVC1".asInstanceOf[H265WriteMp4PackagingType]
  val HEV1 = "HEV1".asInstanceOf[H265WriteMp4PackagingType]

  @inline def values: js.Array[H265WriteMp4PackagingType] = js.Array(HVC1, HEV1)
}

@js.native
sealed trait HlsAdMarkers extends js.Any
object HlsAdMarkers {
  val ELEMENTAL = "ELEMENTAL".asInstanceOf[HlsAdMarkers]
  val ELEMENTAL_SCTE35 = "ELEMENTAL_SCTE35".asInstanceOf[HlsAdMarkers]

  @inline def values: js.Array[HlsAdMarkers] = js.Array(ELEMENTAL, ELEMENTAL_SCTE35)
}

/** Use this setting only in audio-only outputs. Choose MPEG-2 Transport Stream (M2TS) to create a file in an MPEG2-TS container. Keep the default value Automatic (AUTOMATIC) to create a raw audio-only file with no container. Regardless of the value that you specify here, if this output has video, the service will place outputs into an MPEG2-TS container.
  */
@js.native
sealed trait HlsAudioOnlyContainer extends js.Any
object HlsAudioOnlyContainer {
  val AUTOMATIC = "AUTOMATIC".asInstanceOf[HlsAudioOnlyContainer]
  val M2TS = "M2TS".asInstanceOf[HlsAudioOnlyContainer]

  @inline def values: js.Array[HlsAudioOnlyContainer] = js.Array(AUTOMATIC, M2TS)
}

/** Ignore this setting unless you are using FairPlay DRM with Verimatrix and you encounter playback issues. Keep the default value, Include (INCLUDE), to output audio-only headers. Choose Exclude (EXCLUDE) to remove the audio-only headers from your audio segments.
  */
@js.native
sealed trait HlsAudioOnlyHeader extends js.Any
object HlsAudioOnlyHeader {
  val INCLUDE = "INCLUDE".asInstanceOf[HlsAudioOnlyHeader]
  val EXCLUDE = "EXCLUDE".asInstanceOf[HlsAudioOnlyHeader]

  @inline def values: js.Array[HlsAudioOnlyHeader] = js.Array(INCLUDE, EXCLUDE)
}

/** Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this audio-only stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest. Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
  */
@js.native
sealed trait HlsAudioTrackType extends js.Any
object HlsAudioTrackType {
  val ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT = "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT".asInstanceOf[HlsAudioTrackType]
  val ALTERNATE_AUDIO_AUTO_SELECT = "ALTERNATE_AUDIO_AUTO_SELECT".asInstanceOf[HlsAudioTrackType]
  val ALTERNATE_AUDIO_NOT_AUTO_SELECT = "ALTERNATE_AUDIO_NOT_AUTO_SELECT".asInstanceOf[HlsAudioTrackType]
  val AUDIO_ONLY_VARIANT_STREAM = "AUDIO_ONLY_VARIANT_STREAM".asInstanceOf[HlsAudioTrackType]

  @inline def values: js.Array[HlsAudioTrackType] = js.Array(ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT, ALTERNATE_AUDIO_AUTO_SELECT, ALTERNATE_AUDIO_NOT_AUTO_SELECT, AUDIO_ONLY_VARIANT_STREAM)
}

/** Applies only to 608 Embedded output captions. Insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you specify. Make sure to specify the languages in the order in which they appear in the original source (if the source is embedded format) or the order of the caption selectors (if the source is other than embedded). Otherwise, languages in the manifest will not match up properly with the output captions. None: Include CLOSED-CAPTIONS=NONE line in the manifest. Omit: Omit any CLOSED-CAPTIONS line from the manifest.
  */
@js.native
sealed trait HlsCaptionLanguageSetting extends js.Any
object HlsCaptionLanguageSetting {
  val INSERT = "INSERT".asInstanceOf[HlsCaptionLanguageSetting]
  val OMIT = "OMIT".asInstanceOf[HlsCaptionLanguageSetting]
  val NONE = "NONE".asInstanceOf[HlsCaptionLanguageSetting]

  @inline def values: js.Array[HlsCaptionLanguageSetting] = js.Array(INSERT, OMIT, NONE)
}

/** Disable this setting only when your workflow requires the #EXT-X-ALLOW-CACHE:no tag. Otherwise, keep the default value Enabled (ENABLED) and control caching in your video distribution set up. For example, use the Cache-Control http header.
  */
@js.native
sealed trait HlsClientCache extends js.Any
object HlsClientCache {
  val DISABLED = "DISABLED".asInstanceOf[HlsClientCache]
  val ENABLED = "ENABLED".asInstanceOf[HlsClientCache]

  @inline def values: js.Array[HlsClientCache] = js.Array(DISABLED, ENABLED)
}

/** Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
  */
@js.native
sealed trait HlsCodecSpecification extends js.Any
object HlsCodecSpecification {
  val RFC_6381 = "RFC_6381".asInstanceOf[HlsCodecSpecification]
  val RFC_4281 = "RFC_4281".asInstanceOf[HlsCodecSpecification]

  @inline def values: js.Array[HlsCodecSpecification] = js.Array(RFC_6381, RFC_4281)
}

/** Specify whether to flag this audio track as descriptive video service (DVS) in your HLS parent manifest. When you choose Flag (FLAG), MediaConvert includes the parameter CHARACTERISTICS="public.accessibility.describes-video" in the EXT-X-MEDIA entry for this track. When you keep the default choice, Don't flag (DONT_FLAG), MediaConvert leaves this parameter out. The DVS flag can help with accessibility on Apple devices. For more information, see the Apple documentation.
  */
@js.native
sealed trait HlsDescriptiveVideoServiceFlag extends js.Any
object HlsDescriptiveVideoServiceFlag {
  val DONT_FLAG = "DONT_FLAG".asInstanceOf[HlsDescriptiveVideoServiceFlag]
  val FLAG = "FLAG".asInstanceOf[HlsDescriptiveVideoServiceFlag]

  @inline def values: js.Array[HlsDescriptiveVideoServiceFlag] = js.Array(DONT_FLAG, FLAG)
}

/** Indicates whether segments should be placed in subdirectories.
  */
@js.native
sealed trait HlsDirectoryStructure extends js.Any
object HlsDirectoryStructure {
  val SINGLE_DIRECTORY = "SINGLE_DIRECTORY".asInstanceOf[HlsDirectoryStructure]
  val SUBDIRECTORY_PER_STREAM = "SUBDIRECTORY_PER_STREAM".asInstanceOf[HlsDirectoryStructure]

  @inline def values: js.Array[HlsDirectoryStructure] = js.Array(SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM)
}

/** Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in the web interface also disables encryption.
  */
@js.native
sealed trait HlsEncryptionType extends js.Any
object HlsEncryptionType {
  val AES128 = "AES128".asInstanceOf[HlsEncryptionType]
  val SAMPLE_AES = "SAMPLE_AES".asInstanceOf[HlsEncryptionType]

  @inline def values: js.Array[HlsEncryptionType] = js.Array(AES128, SAMPLE_AES)
}

/** Choose Include (INCLUDE) to have MediaConvert generate a child manifest that lists only the I-frames for this rendition, in addition to your regular manifest for this rendition. You might use this manifest as part of a workflow that creates preview functions for your video. MediaConvert adds both the I-frame only child manifest and the regular child manifest to the parent manifest. When you don't need the I-frame only child manifest, keep the default value Exclude (EXCLUDE).
  */
@js.native
sealed trait HlsIFrameOnlyManifest extends js.Any
object HlsIFrameOnlyManifest {
  val INCLUDE = "INCLUDE".asInstanceOf[HlsIFrameOnlyManifest]
  val EXCLUDE = "EXCLUDE".asInstanceOf[HlsIFrameOnlyManifest]

  @inline def values: js.Array[HlsIFrameOnlyManifest] = js.Array(INCLUDE, EXCLUDE)
}

/** The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If set to INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not in the manifest.
  */
@js.native
sealed trait HlsInitializationVectorInManifest extends js.Any
object HlsInitializationVectorInManifest {
  val INCLUDE = "INCLUDE".asInstanceOf[HlsInitializationVectorInManifest]
  val EXCLUDE = "EXCLUDE".asInstanceOf[HlsInitializationVectorInManifest]

  @inline def values: js.Array[HlsInitializationVectorInManifest] = js.Array(INCLUDE, EXCLUDE)
}

/** Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
  */
@js.native
sealed trait HlsKeyProviderType extends js.Any
object HlsKeyProviderType {
  val SPEKE = "SPEKE".asInstanceOf[HlsKeyProviderType]
  val STATIC_KEY = "STATIC_KEY".asInstanceOf[HlsKeyProviderType]

  @inline def values: js.Array[HlsKeyProviderType] = js.Array(SPEKE, STATIC_KEY)
}

/** When set to GZIP, compresses HLS playlist.
  */
@js.native
sealed trait HlsManifestCompression extends js.Any
object HlsManifestCompression {
  val GZIP = "GZIP".asInstanceOf[HlsManifestCompression]
  val NONE = "NONE".asInstanceOf[HlsManifestCompression]

  @inline def values: js.Array[HlsManifestCompression] = js.Array(GZIP, NONE)
}

/** Indicates whether the output manifest should use floating point values for segment duration.
  */
@js.native
sealed trait HlsManifestDurationFormat extends js.Any
object HlsManifestDurationFormat {
  val FLOATING_POINT = "FLOATING_POINT".asInstanceOf[HlsManifestDurationFormat]
  val INTEGER = "INTEGER".asInstanceOf[HlsManifestDurationFormat]

  @inline def values: js.Array[HlsManifestDurationFormat] = js.Array(FLOATING_POINT, INTEGER)
}

/** Enable this setting to insert the EXT-X-SESSION-KEY element into the master playlist. This allows for offline Apple HLS FairPlay content protection.
  */
@js.native
sealed trait HlsOfflineEncrypted extends js.Any
object HlsOfflineEncrypted {
  val ENABLED = "ENABLED".asInstanceOf[HlsOfflineEncrypted]
  val DISABLED = "DISABLED".asInstanceOf[HlsOfflineEncrypted]

  @inline def values: js.Array[HlsOfflineEncrypted] = js.Array(ENABLED, DISABLED)
}

/** Indicates whether the .m3u8 manifest file should be generated for this HLS output group.
  */
@js.native
sealed trait HlsOutputSelection extends js.Any
object HlsOutputSelection {
  val MANIFESTS_AND_SEGMENTS = "MANIFESTS_AND_SEGMENTS".asInstanceOf[HlsOutputSelection]
  val SEGMENTS_ONLY = "SEGMENTS_ONLY".asInstanceOf[HlsOutputSelection]

  @inline def values: js.Array[HlsOutputSelection] = js.Array(MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY)
}

/** Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as follows: either the program date and time are initialized using the input timecode source, or the time is initialized using the input timecode source and the date is initialized using the timestamp_offset.
  */
@js.native
sealed trait HlsProgramDateTime extends js.Any
object HlsProgramDateTime {
  val INCLUDE = "INCLUDE".asInstanceOf[HlsProgramDateTime]
  val EXCLUDE = "EXCLUDE".asInstanceOf[HlsProgramDateTime]

  @inline def values: js.Array[HlsProgramDateTime] = js.Array(INCLUDE, EXCLUDE)
}

/** When set to SINGLE_FILE, emits program as a single media resource (.ts) file, uses #EXT-X-BYTERANGE tags to index segment for playback.
  */
@js.native
sealed trait HlsSegmentControl extends js.Any
object HlsSegmentControl {
  val SINGLE_FILE = "SINGLE_FILE".asInstanceOf[HlsSegmentControl]
  val SEGMENTED_FILES = "SEGMENTED_FILES".asInstanceOf[HlsSegmentControl]

  @inline def values: js.Array[HlsSegmentControl] = js.Array(SINGLE_FILE, SEGMENTED_FILES)
}

/** Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
  */
@js.native
sealed trait HlsStreamInfResolution extends js.Any
object HlsStreamInfResolution {
  val INCLUDE = "INCLUDE".asInstanceOf[HlsStreamInfResolution]
  val EXCLUDE = "EXCLUDE".asInstanceOf[HlsStreamInfResolution]

  @inline def values: js.Array[HlsStreamInfResolution] = js.Array(INCLUDE, EXCLUDE)
}

/** Indicates ID3 frame that has the timecode.
  */
@js.native
sealed trait HlsTimedMetadataId3Frame extends js.Any
object HlsTimedMetadataId3Frame {
  val NONE = "NONE".asInstanceOf[HlsTimedMetadataId3Frame]
  val PRIV = "PRIV".asInstanceOf[HlsTimedMetadataId3Frame]
  val TDRL = "TDRL".asInstanceOf[HlsTimedMetadataId3Frame]

  @inline def values: js.Array[HlsTimedMetadataId3Frame] = js.Array(NONE, PRIV, TDRL)
}

/** Keep this setting enabled to have MediaConvert use the font style and position information from the captions source in the output. This option is available only when your input captions are IMSC, SMPTE-TT, or TTML. Disable this setting for simplified output captions.
  */
@js.native
sealed trait ImscStylePassthrough extends js.Any
object ImscStylePassthrough {
  val ENABLED = "ENABLED".asInstanceOf[ImscStylePassthrough]
  val DISABLED = "DISABLED".asInstanceOf[ImscStylePassthrough]

  @inline def values: js.Array[ImscStylePassthrough] = js.Array(ENABLED, DISABLED)
}

/** Enable Deblock (InputDeblockFilter) to produce smoother motion in the output. Default is disabled. Only manually controllable for MPEG2 and uncompressed video inputs.
  */
@js.native
sealed trait InputDeblockFilter extends js.Any
object InputDeblockFilter {
  val ENABLED = "ENABLED".asInstanceOf[InputDeblockFilter]
  val DISABLED = "DISABLED".asInstanceOf[InputDeblockFilter]

  @inline def values: js.Array[InputDeblockFilter] = js.Array(ENABLED, DISABLED)
}

/** Enable Denoise (InputDenoiseFilter) to filter noise from the input. Default is disabled. Only applicable to MPEG2, H.264, H.265, and uncompressed video inputs.
  */
@js.native
sealed trait InputDenoiseFilter extends js.Any
object InputDenoiseFilter {
  val ENABLED = "ENABLED".asInstanceOf[InputDenoiseFilter]
  val DISABLED = "DISABLED".asInstanceOf[InputDenoiseFilter]

  @inline def values: js.Array[InputDenoiseFilter] = js.Array(ENABLED, DISABLED)
}

/** Specify how the transcoding service applies the denoise and deblock filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and Deblock (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering, depending on input type and quality. * Disable - The input is not filtered. This is true even if you use the API to enable them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The input is filtered regardless of input type.
  */
@js.native
sealed trait InputFilterEnable extends js.Any
object InputFilterEnable {
  val AUTO = "AUTO".asInstanceOf[InputFilterEnable]
  val DISABLE = "DISABLE".asInstanceOf[InputFilterEnable]
  val FORCE = "FORCE".asInstanceOf[InputFilterEnable]

  @inline def values: js.Array[InputFilterEnable] = js.Array(AUTO, DISABLE, FORCE)
}

/** Set PSI control (InputPsiControl) for transport stream inputs to specify which data the demux process to scans. * Ignore PSI - Scan all PIDs for audio and video. * Use PSI - Scan only PSI data.
  */
@js.native
sealed trait InputPsiControl extends js.Any
object InputPsiControl {
  val IGNORE_PSI = "IGNORE_PSI".asInstanceOf[InputPsiControl]
  val USE_PSI = "USE_PSI".asInstanceOf[InputPsiControl]

  @inline def values: js.Array[InputPsiControl] = js.Array(IGNORE_PSI, USE_PSI)
}

/** Use Rotate (InputRotate) to specify how the service rotates your video. You can choose automatic rotation or specify a rotation. You can specify a clockwise rotation of 0, 90, 180, or 270 degrees. If your input video container is .mov or .mp4 and your input has rotation metadata, you can choose Automatic to have the service rotate your video according to the rotation specified in the metadata. The rotation must be within one degree of 90, 180, or 270 degrees. If the rotation metadata specifies any other rotation, the service will default to no rotation. By default, the service does no rotation, even if your input video has rotation metadata. The service doesn't pass through rotation metadata.
  */
@js.native
sealed trait InputRotate extends js.Any
object InputRotate {
  val DEGREE_0 = "DEGREE_0".asInstanceOf[InputRotate]
  val DEGREES_90 = "DEGREES_90".asInstanceOf[InputRotate]
  val DEGREES_180 = "DEGREES_180".asInstanceOf[InputRotate]
  val DEGREES_270 = "DEGREES_270".asInstanceOf[InputRotate]
  val AUTO = "AUTO".asInstanceOf[InputRotate]

  @inline def values: js.Array[InputRotate] = js.Array(DEGREE_0, DEGREES_90, DEGREES_180, DEGREES_270, AUTO)
}

/** When you have a progressive segmented frame (PsF) input, use this setting to flag the input as PsF. MediaConvert doesn't automatically detect PsF. Therefore, flagging your input as PsF results in better preservation of video quality when you do deinterlacing and frame rate conversion. If you don't specify, the default value is Auto (AUTO). Auto is the correct setting for all inputs that are not PsF. Don't set this value to PsF when your input is interlaced. Doing so creates horizontal interlacing artifacts.
  */
@js.native
sealed trait InputScanType extends js.Any
object InputScanType {
  val AUTO = "AUTO".asInstanceOf[InputScanType]
  val PSF = "PSF".asInstanceOf[InputScanType]

  @inline def values: js.Array[InputScanType] = js.Array(AUTO, PSF)
}

/** Use this Timecode source setting, located under the input settings (InputTimecodeSource), to specify how the service counts input video frames. This input frame count affects only the behavior of features that apply to a single input at a time, such as input clipping and synchronizing some captions formats. Choose Embedded (EMBEDDED) to use the timecodes in your input video. Choose Start at zero (ZEROBASED) to start the first frame at zero. Choose Specified start (SPECIFIEDSTART) to start the first frame at the timecode that you specify in the setting Start timecode (timecodeStart). If you don't specify a value for Timecode source, the service will use Embedded by default. For more information about timecodes, see https://docs.aws.amazon.com/console/mediaconvert/timecode.
  */
@js.native
sealed trait InputTimecodeSource extends js.Any
object InputTimecodeSource {
  val EMBEDDED = "EMBEDDED".asInstanceOf[InputTimecodeSource]
  val ZEROBASED = "ZEROBASED".asInstanceOf[InputTimecodeSource]
  val SPECIFIEDSTART = "SPECIFIEDSTART".asInstanceOf[InputTimecodeSource]

  @inline def values: js.Array[InputTimecodeSource] = js.Array(EMBEDDED, ZEROBASED, SPECIFIEDSTART)
}

/** A job's phase can be PROBING, TRANSCODING OR UPLOADING
  */
@js.native
sealed trait JobPhase extends js.Any
object JobPhase {
  val PROBING = "PROBING".asInstanceOf[JobPhase]
  val TRANSCODING = "TRANSCODING".asInstanceOf[JobPhase]
  val UPLOADING = "UPLOADING".asInstanceOf[JobPhase]

  @inline def values: js.Array[JobPhase] = js.Array(PROBING, TRANSCODING, UPLOADING)
}

/** A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
  */
@js.native
sealed trait JobStatus extends js.Any
object JobStatus {
  val SUBMITTED = "SUBMITTED".asInstanceOf[JobStatus]
  val PROGRESSING = "PROGRESSING".asInstanceOf[JobStatus]
  val COMPLETE = "COMPLETE".asInstanceOf[JobStatus]
  val CANCELED = "CANCELED".asInstanceOf[JobStatus]
  val ERROR = "ERROR".asInstanceOf[JobStatus]

  @inline def values: js.Array[JobStatus] = js.Array(SUBMITTED, PROGRESSING, COMPLETE, CANCELED, ERROR)
}

/** Optional. When you request a list of job templates, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
  */
@js.native
sealed trait JobTemplateListBy extends js.Any
object JobTemplateListBy {
  val NAME = "NAME".asInstanceOf[JobTemplateListBy]
  val CREATION_DATE = "CREATION_DATE".asInstanceOf[JobTemplateListBy]
  val SYSTEM = "SYSTEM".asInstanceOf[JobTemplateListBy]

  @inline def values: js.Array[JobTemplateListBy] = js.Array(NAME, CREATION_DATE, SYSTEM)
}

/** Specify the language, using the ISO 639-2 three-letter code listed at https://www.loc.gov/standards/iso639-2/php/code_list.php.
  */
@js.native
sealed trait LanguageCode extends js.Any
object LanguageCode {
  val ENG = "ENG".asInstanceOf[LanguageCode]
  val SPA = "SPA".asInstanceOf[LanguageCode]
  val FRA = "FRA".asInstanceOf[LanguageCode]
  val DEU = "DEU".asInstanceOf[LanguageCode]
  val GER = "GER".asInstanceOf[LanguageCode]
  val ZHO = "ZHO".asInstanceOf[LanguageCode]
  val ARA = "ARA".asInstanceOf[LanguageCode]
  val HIN = "HIN".asInstanceOf[LanguageCode]
  val JPN = "JPN".asInstanceOf[LanguageCode]
  val RUS = "RUS".asInstanceOf[LanguageCode]
  val POR = "POR".asInstanceOf[LanguageCode]
  val ITA = "ITA".asInstanceOf[LanguageCode]
  val URD = "URD".asInstanceOf[LanguageCode]
  val VIE = "VIE".asInstanceOf[LanguageCode]
  val KOR = "KOR".asInstanceOf[LanguageCode]
  val PAN = "PAN".asInstanceOf[LanguageCode]
  val ABK = "ABK".asInstanceOf[LanguageCode]
  val AAR = "AAR".asInstanceOf[LanguageCode]
  val AFR = "AFR".asInstanceOf[LanguageCode]
  val AKA = "AKA".asInstanceOf[LanguageCode]
  val SQI = "SQI".asInstanceOf[LanguageCode]
  val AMH = "AMH".asInstanceOf[LanguageCode]
  val ARG = "ARG".asInstanceOf[LanguageCode]
  val HYE = "HYE".asInstanceOf[LanguageCode]
  val ASM = "ASM".asInstanceOf[LanguageCode]
  val AVA = "AVA".asInstanceOf[LanguageCode]
  val AVE = "AVE".asInstanceOf[LanguageCode]
  val AYM = "AYM".asInstanceOf[LanguageCode]
  val AZE = "AZE".asInstanceOf[LanguageCode]
  val BAM = "BAM".asInstanceOf[LanguageCode]
  val BAK = "BAK".asInstanceOf[LanguageCode]
  val EUS = "EUS".asInstanceOf[LanguageCode]
  val BEL = "BEL".asInstanceOf[LanguageCode]
  val BEN = "BEN".asInstanceOf[LanguageCode]
  val BIH = "BIH".asInstanceOf[LanguageCode]
  val BIS = "BIS".asInstanceOf[LanguageCode]
  val BOS = "BOS".asInstanceOf[LanguageCode]
  val BRE = "BRE".asInstanceOf[LanguageCode]
  val BUL = "BUL".asInstanceOf[LanguageCode]
  val MYA = "MYA".asInstanceOf[LanguageCode]
  val CAT = "CAT".asInstanceOf[LanguageCode]
  val KHM = "KHM".asInstanceOf[LanguageCode]
  val CHA = "CHA".asInstanceOf[LanguageCode]
  val CHE = "CHE".asInstanceOf[LanguageCode]
  val NYA = "NYA".asInstanceOf[LanguageCode]
  val CHU = "CHU".asInstanceOf[LanguageCode]
  val CHV = "CHV".asInstanceOf[LanguageCode]
  val COR = "COR".asInstanceOf[LanguageCode]
  val COS = "COS".asInstanceOf[LanguageCode]
  val CRE = "CRE".asInstanceOf[LanguageCode]
  val HRV = "HRV".asInstanceOf[LanguageCode]
  val CES = "CES".asInstanceOf[LanguageCode]
  val DAN = "DAN".asInstanceOf[LanguageCode]
  val DIV = "DIV".asInstanceOf[LanguageCode]
  val NLD = "NLD".asInstanceOf[LanguageCode]
  val DZO = "DZO".asInstanceOf[LanguageCode]
  val ENM = "ENM".asInstanceOf[LanguageCode]
  val EPO = "EPO".asInstanceOf[LanguageCode]
  val EST = "EST".asInstanceOf[LanguageCode]
  val EWE = "EWE".asInstanceOf[LanguageCode]
  val FAO = "FAO".asInstanceOf[LanguageCode]
  val FIJ = "FIJ".asInstanceOf[LanguageCode]
  val FIN = "FIN".asInstanceOf[LanguageCode]
  val FRM = "FRM".asInstanceOf[LanguageCode]
  val FUL = "FUL".asInstanceOf[LanguageCode]
  val GLA = "GLA".asInstanceOf[LanguageCode]
  val GLG = "GLG".asInstanceOf[LanguageCode]
  val LUG = "LUG".asInstanceOf[LanguageCode]
  val KAT = "KAT".asInstanceOf[LanguageCode]
  val ELL = "ELL".asInstanceOf[LanguageCode]
  val GRN = "GRN".asInstanceOf[LanguageCode]
  val GUJ = "GUJ".asInstanceOf[LanguageCode]
  val HAT = "HAT".asInstanceOf[LanguageCode]
  val HAU = "HAU".asInstanceOf[LanguageCode]
  val HEB = "HEB".asInstanceOf[LanguageCode]
  val HER = "HER".asInstanceOf[LanguageCode]
  val HMO = "HMO".asInstanceOf[LanguageCode]
  val HUN = "HUN".asInstanceOf[LanguageCode]
  val ISL = "ISL".asInstanceOf[LanguageCode]
  val IDO = "IDO".asInstanceOf[LanguageCode]
  val IBO = "IBO".asInstanceOf[LanguageCode]
  val IND = "IND".asInstanceOf[LanguageCode]
  val INA = "INA".asInstanceOf[LanguageCode]
  val ILE = "ILE".asInstanceOf[LanguageCode]
  val IKU = "IKU".asInstanceOf[LanguageCode]
  val IPK = "IPK".asInstanceOf[LanguageCode]
  val GLE = "GLE".asInstanceOf[LanguageCode]
  val JAV = "JAV".asInstanceOf[LanguageCode]
  val KAL = "KAL".asInstanceOf[LanguageCode]
  val KAN = "KAN".asInstanceOf[LanguageCode]
  val KAU = "KAU".asInstanceOf[LanguageCode]
  val KAS = "KAS".asInstanceOf[LanguageCode]
  val KAZ = "KAZ".asInstanceOf[LanguageCode]
  val KIK = "KIK".asInstanceOf[LanguageCode]
  val KIN = "KIN".asInstanceOf[LanguageCode]
  val KIR = "KIR".asInstanceOf[LanguageCode]
  val KOM = "KOM".asInstanceOf[LanguageCode]
  val KON = "KON".asInstanceOf[LanguageCode]
  val KUA = "KUA".asInstanceOf[LanguageCode]
  val KUR = "KUR".asInstanceOf[LanguageCode]
  val LAO = "LAO".asInstanceOf[LanguageCode]
  val LAT = "LAT".asInstanceOf[LanguageCode]
  val LAV = "LAV".asInstanceOf[LanguageCode]
  val LIM = "LIM".asInstanceOf[LanguageCode]
  val LIN = "LIN".asInstanceOf[LanguageCode]
  val LIT = "LIT".asInstanceOf[LanguageCode]
  val LUB = "LUB".asInstanceOf[LanguageCode]
  val LTZ = "LTZ".asInstanceOf[LanguageCode]
  val MKD = "MKD".asInstanceOf[LanguageCode]
  val MLG = "MLG".asInstanceOf[LanguageCode]
  val MSA = "MSA".asInstanceOf[LanguageCode]
  val MAL = "MAL".asInstanceOf[LanguageCode]
  val MLT = "MLT".asInstanceOf[LanguageCode]
  val GLV = "GLV".asInstanceOf[LanguageCode]
  val MRI = "MRI".asInstanceOf[LanguageCode]
  val MAR = "MAR".asInstanceOf[LanguageCode]
  val MAH = "MAH".asInstanceOf[LanguageCode]
  val MON = "MON".asInstanceOf[LanguageCode]
  val NAU = "NAU".asInstanceOf[LanguageCode]
  val NAV = "NAV".asInstanceOf[LanguageCode]
  val NDE = "NDE".asInstanceOf[LanguageCode]
  val NBL = "NBL".asInstanceOf[LanguageCode]
  val NDO = "NDO".asInstanceOf[LanguageCode]
  val NEP = "NEP".asInstanceOf[LanguageCode]
  val SME = "SME".asInstanceOf[LanguageCode]
  val NOR = "NOR".asInstanceOf[LanguageCode]
  val NOB = "NOB".asInstanceOf[LanguageCode]
  val NNO = "NNO".asInstanceOf[LanguageCode]
  val OCI = "OCI".asInstanceOf[LanguageCode]
  val OJI = "OJI".asInstanceOf[LanguageCode]
  val ORI = "ORI".asInstanceOf[LanguageCode]
  val ORM = "ORM".asInstanceOf[LanguageCode]
  val OSS = "OSS".asInstanceOf[LanguageCode]
  val PLI = "PLI".asInstanceOf[LanguageCode]
  val FAS = "FAS".asInstanceOf[LanguageCode]
  val POL = "POL".asInstanceOf[LanguageCode]
  val PUS = "PUS".asInstanceOf[LanguageCode]
  val QUE = "QUE".asInstanceOf[LanguageCode]
  val QAA = "QAA".asInstanceOf[LanguageCode]
  val RON = "RON".asInstanceOf[LanguageCode]
  val ROH = "ROH".asInstanceOf[LanguageCode]
  val RUN = "RUN".asInstanceOf[LanguageCode]
  val SMO = "SMO".asInstanceOf[LanguageCode]
  val SAG = "SAG".asInstanceOf[LanguageCode]
  val SAN = "SAN".asInstanceOf[LanguageCode]
  val SRD = "SRD".asInstanceOf[LanguageCode]
  val SRB = "SRB".asInstanceOf[LanguageCode]
  val SNA = "SNA".asInstanceOf[LanguageCode]
  val III = "III".asInstanceOf[LanguageCode]
  val SND = "SND".asInstanceOf[LanguageCode]
  val SIN = "SIN".asInstanceOf[LanguageCode]
  val SLK = "SLK".asInstanceOf[LanguageCode]
  val SLV = "SLV".asInstanceOf[LanguageCode]
  val SOM = "SOM".asInstanceOf[LanguageCode]
  val SOT = "SOT".asInstanceOf[LanguageCode]
  val SUN = "SUN".asInstanceOf[LanguageCode]
  val SWA = "SWA".asInstanceOf[LanguageCode]
  val SSW = "SSW".asInstanceOf[LanguageCode]
  val SWE = "SWE".asInstanceOf[LanguageCode]
  val TGL = "TGL".asInstanceOf[LanguageCode]
  val TAH = "TAH".asInstanceOf[LanguageCode]
  val TGK = "TGK".asInstanceOf[LanguageCode]
  val TAM = "TAM".asInstanceOf[LanguageCode]
  val TAT = "TAT".asInstanceOf[LanguageCode]
  val TEL = "TEL".asInstanceOf[LanguageCode]
  val THA = "THA".asInstanceOf[LanguageCode]
  val BOD = "BOD".asInstanceOf[LanguageCode]
  val TIR = "TIR".asInstanceOf[LanguageCode]
  val TON = "TON".asInstanceOf[LanguageCode]
  val TSO = "TSO".asInstanceOf[LanguageCode]
  val TSN = "TSN".asInstanceOf[LanguageCode]
  val TUR = "TUR".asInstanceOf[LanguageCode]
  val TUK = "TUK".asInstanceOf[LanguageCode]
  val TWI = "TWI".asInstanceOf[LanguageCode]
  val UIG = "UIG".asInstanceOf[LanguageCode]
  val UKR = "UKR".asInstanceOf[LanguageCode]
  val UZB = "UZB".asInstanceOf[LanguageCode]
  val VEN = "VEN".asInstanceOf[LanguageCode]
  val VOL = "VOL".asInstanceOf[LanguageCode]
  val WLN = "WLN".asInstanceOf[LanguageCode]
  val CYM = "CYM".asInstanceOf[LanguageCode]
  val FRY = "FRY".asInstanceOf[LanguageCode]
  val WOL = "WOL".asInstanceOf[LanguageCode]
  val XHO = "XHO".asInstanceOf[LanguageCode]
  val YID = "YID".asInstanceOf[LanguageCode]
  val YOR = "YOR".asInstanceOf[LanguageCode]
  val ZHA = "ZHA".asInstanceOf[LanguageCode]
  val ZUL = "ZUL".asInstanceOf[LanguageCode]
  val ORJ = "ORJ".asInstanceOf[LanguageCode]
  val QPC = "QPC".asInstanceOf[LanguageCode]
  val TNG = "TNG".asInstanceOf[LanguageCode]

  @inline def values: js.Array[LanguageCode] = js.Array(
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
@js.native
sealed trait M2tsAudioBufferModel extends js.Any
object M2tsAudioBufferModel {
  val DVB = "DVB".asInstanceOf[M2tsAudioBufferModel]
  val ATSC = "ATSC".asInstanceOf[M2tsAudioBufferModel]

  @inline def values: js.Array[M2tsAudioBufferModel] = js.Array(DVB, ATSC)
}

/** Specify this setting only when your output will be consumed by a downstream repackaging workflow that is sensitive to very small duration differences between video and audio. For this situation, choose Match video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with silence or trims them to ensure that the total duration of each audio stream is at least as long as the total duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
  */
@js.native
sealed trait M2tsAudioDuration extends js.Any
object M2tsAudioDuration {
  val DEFAULT_CODEC_DURATION = "DEFAULT_CODEC_DURATION".asInstanceOf[M2tsAudioDuration]
  val MATCH_VIDEO_DURATION = "MATCH_VIDEO_DURATION".asInstanceOf[M2tsAudioDuration]

  @inline def values: js.Array[M2tsAudioDuration] = js.Array(DEFAULT_CODEC_DURATION, MATCH_VIDEO_DURATION)
}

/** Controls what buffer model to use for accurate interleaving. If set to MULTIPLEX, use multiplex buffer model. If set to NONE, this can lead to lower latency, but low-memory devices may not be able to play back the stream without interruptions.
  */
@js.native
sealed trait M2tsBufferModel extends js.Any
object M2tsBufferModel {
  val MULTIPLEX = "MULTIPLEX".asInstanceOf[M2tsBufferModel]
  val NONE = "NONE".asInstanceOf[M2tsBufferModel]

  @inline def values: js.Array[M2tsBufferModel] = js.Array(MULTIPLEX, NONE)
}

/** When set to VIDEO_AND_FIXED_INTERVALS, audio EBP markers will be added to partitions 3 and 4. The interval between these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval. When set to VIDEO_INTERVAL, these additional markers will not be inserted. Only applicable when EBP segmentation markers are is selected (segmentationMarkers is EBP or EBP_LEGACY).
  */
@js.native
sealed trait M2tsEbpAudioInterval extends js.Any
object M2tsEbpAudioInterval {
  val VIDEO_AND_FIXED_INTERVALS = "VIDEO_AND_FIXED_INTERVALS".asInstanceOf[M2tsEbpAudioInterval]
  val VIDEO_INTERVAL = "VIDEO_INTERVAL".asInstanceOf[M2tsEbpAudioInterval]

  @inline def values: js.Array[M2tsEbpAudioInterval] = js.Array(VIDEO_AND_FIXED_INTERVALS, VIDEO_INTERVAL)
}

/** Selects which PIDs to place EBP markers on. They can either be placed only on the video PID, or on both the video PID and all audio PIDs. Only applicable when EBP segmentation markers are is selected (segmentationMarkers is EBP or EBP_LEGACY).
  */
@js.native
sealed trait M2tsEbpPlacement extends js.Any
object M2tsEbpPlacement {
  val VIDEO_AND_AUDIO_PIDS = "VIDEO_AND_AUDIO_PIDS".asInstanceOf[M2tsEbpPlacement]
  val VIDEO_PID = "VIDEO_PID".asInstanceOf[M2tsEbpPlacement]

  @inline def values: js.Array[M2tsEbpPlacement] = js.Array(VIDEO_AND_AUDIO_PIDS, VIDEO_PID)
}

/** Controls whether to include the ES Rate field in the PES header.
  */
@js.native
sealed trait M2tsEsRateInPes extends js.Any
object M2tsEsRateInPes {
  val INCLUDE = "INCLUDE".asInstanceOf[M2tsEsRateInPes]
  val EXCLUDE = "EXCLUDE".asInstanceOf[M2tsEsRateInPes]

  @inline def values: js.Array[M2tsEsRateInPes] = js.Array(INCLUDE, EXCLUDE)
}

/** Keep the default value (DEFAULT) unless you know that your audio EBP markers are incorrectly appearing before your video EBP markers. To correct this problem, set this value to Force (FORCE).
  */
@js.native
sealed trait M2tsForceTsVideoEbpOrder extends js.Any
object M2tsForceTsVideoEbpOrder {
  val FORCE = "FORCE".asInstanceOf[M2tsForceTsVideoEbpOrder]
  val DEFAULT = "DEFAULT".asInstanceOf[M2tsForceTsVideoEbpOrder]

  @inline def values: js.Array[M2tsForceTsVideoEbpOrder] = js.Array(FORCE, DEFAULT)
}

/** If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
  */
@js.native
sealed trait M2tsNielsenId3 extends js.Any
object M2tsNielsenId3 {
  val INSERT = "INSERT".asInstanceOf[M2tsNielsenId3]
  val NONE = "NONE".asInstanceOf[M2tsNielsenId3]

  @inline def values: js.Array[M2tsNielsenId3] = js.Array(INSERT, NONE)
}

/** When set to PCR_EVERY_PES_PACKET, a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This is effective only when the PCR PID is the same as the video or audio elementary stream.
  */
@js.native
sealed trait M2tsPcrControl extends js.Any
object M2tsPcrControl {
  val PCR_EVERY_PES_PACKET = "PCR_EVERY_PES_PACKET".asInstanceOf[M2tsPcrControl]
  val CONFIGURED_PCR_PERIOD = "CONFIGURED_PCR_PERIOD".asInstanceOf[M2tsPcrControl]

  @inline def values: js.Array[M2tsPcrControl] = js.Array(PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD)
}

/** When set to CBR, inserts null packets into transport stream to fill specified bitrate. When set to VBR, the bitrate setting acts as the maximum bitrate, but the output will not be padded up to that bitrate.
  */
@js.native
sealed trait M2tsRateMode extends js.Any
object M2tsRateMode {
  val VBR = "VBR".asInstanceOf[M2tsRateMode]
  val CBR = "CBR".asInstanceOf[M2tsRateMode]

  @inline def values: js.Array[M2tsRateMode] = js.Array(VBR, CBR)
}

/** For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want SCTE-35 markers in this output. For SCTE-35 markers from an ESAM XML document-- Choose None (NONE). Also provide the ESAM XML as a string in the setting Signal processing notification XML (sccXml). Also enable ESAM SCTE-35 (include the property scte35Esam).
  */
@js.native
sealed trait M2tsScte35Source extends js.Any
object M2tsScte35Source {
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[M2tsScte35Source]
  val NONE = "NONE".asInstanceOf[M2tsScte35Source]

  @inline def values: js.Array[M2tsScte35Source] = js.Array(PASSTHROUGH, NONE)
}

/** Inserts segmentation markers at each segmentation_time period. rai_segstart sets the Random Access Indicator bit in the adaptation field. rai_adapt sets the RAI bit and adds the current timecode in the private data bytes. psi_segstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebp_legacy adds Encoder Boundary Point information to the adaptation field using a legacy proprietary format.
  */
@js.native
sealed trait M2tsSegmentationMarkers extends js.Any
object M2tsSegmentationMarkers {
  val NONE = "NONE".asInstanceOf[M2tsSegmentationMarkers]
  val RAI_SEGSTART = "RAI_SEGSTART".asInstanceOf[M2tsSegmentationMarkers]
  val RAI_ADAPT = "RAI_ADAPT".asInstanceOf[M2tsSegmentationMarkers]
  val PSI_SEGSTART = "PSI_SEGSTART".asInstanceOf[M2tsSegmentationMarkers]
  val EBP = "EBP".asInstanceOf[M2tsSegmentationMarkers]
  val EBP_LEGACY = "EBP_LEGACY".asInstanceOf[M2tsSegmentationMarkers]

  @inline def values: js.Array[M2tsSegmentationMarkers] = js.Array(NONE, RAI_SEGSTART, RAI_ADAPT, PSI_SEGSTART, EBP, EBP_LEGACY)
}

/** The segmentation style parameter controls how segmentation markers are inserted into the transport stream. With avails, it is possible that segments may be truncated, which can influence where future segmentation markers are inserted. When a segmentation style of "reset_cadence" is selected and a segment is truncated due to an avail, we will reset the segmentation cadence. This means the subsequent segment will have a duration of of segmentation_time seconds. When a segmentation style of "maintain_cadence" is selected and a segment is truncated due to an avail, we will not reset the segmentation cadence. This means the subsequent segment will likely be truncated as well. However, all segments after that will have a duration of segmentation_time seconds. Note that EBP lookahead is a slight exception to this rule.
  */
@js.native
sealed trait M2tsSegmentationStyle extends js.Any
object M2tsSegmentationStyle {
  val MAINTAIN_CADENCE = "MAINTAIN_CADENCE".asInstanceOf[M2tsSegmentationStyle]
  val RESET_CADENCE = "RESET_CADENCE".asInstanceOf[M2tsSegmentationStyle]

  @inline def values: js.Array[M2tsSegmentationStyle] = js.Array(MAINTAIN_CADENCE, RESET_CADENCE)
}

/** Specify this setting only when your output will be consumed by a downstream repackaging workflow that is sensitive to very small duration differences between video and audio. For this situation, choose Match video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with silence or trims them to ensure that the total duration of each audio stream is at least as long as the total duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
  */
@js.native
sealed trait M3u8AudioDuration extends js.Any
object M3u8AudioDuration {
  val DEFAULT_CODEC_DURATION = "DEFAULT_CODEC_DURATION".asInstanceOf[M3u8AudioDuration]
  val MATCH_VIDEO_DURATION = "MATCH_VIDEO_DURATION".asInstanceOf[M3u8AudioDuration]

  @inline def values: js.Array[M3u8AudioDuration] = js.Array(DEFAULT_CODEC_DURATION, MATCH_VIDEO_DURATION)
}

/** If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
  */
@js.native
sealed trait M3u8NielsenId3 extends js.Any
object M3u8NielsenId3 {
  val INSERT = "INSERT".asInstanceOf[M3u8NielsenId3]
  val NONE = "NONE".asInstanceOf[M3u8NielsenId3]

  @inline def values: js.Array[M3u8NielsenId3] = js.Array(INSERT, NONE)
}

/** When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
  */
@js.native
sealed trait M3u8PcrControl extends js.Any
object M3u8PcrControl {
  val PCR_EVERY_PES_PACKET = "PCR_EVERY_PES_PACKET".asInstanceOf[M3u8PcrControl]
  val CONFIGURED_PCR_PERIOD = "CONFIGURED_PCR_PERIOD".asInstanceOf[M3u8PcrControl]

  @inline def values: js.Array[M3u8PcrControl] = js.Array(PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD)
}

/** For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want SCTE-35 markers in this output. For SCTE-35 markers from an ESAM XML document-- Choose None (NONE) if you don't want manifest conditioning. Choose Passthrough (PASSTHROUGH) and choose Ad markers (adMarkers) if you do want manifest conditioning. In both cases, also provide the ESAM XML as a string in the setting Signal processing notification XML (sccXml).
  */
@js.native
sealed trait M3u8Scte35Source extends js.Any
object M3u8Scte35Source {
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[M3u8Scte35Source]
  val NONE = "NONE".asInstanceOf[M3u8Scte35Source]

  @inline def values: js.Array[M3u8Scte35Source] = js.Array(PASSTHROUGH, NONE)
}

/** Choose the type of motion graphic asset that you are providing for your overlay. You can choose either a .mov file or a series of .png files.
  */
@js.native
sealed trait MotionImageInsertionMode extends js.Any
object MotionImageInsertionMode {
  val MOV = "MOV".asInstanceOf[MotionImageInsertionMode]
  val PNG = "PNG".asInstanceOf[MotionImageInsertionMode]

  @inline def values: js.Array[MotionImageInsertionMode] = js.Array(MOV, PNG)
}

/** Specify whether your motion graphic overlay repeats on a loop or plays only once.
  */
@js.native
sealed trait MotionImagePlayback extends js.Any
object MotionImagePlayback {
  val ONCE = "ONCE".asInstanceOf[MotionImagePlayback]
  val REPEAT = "REPEAT".asInstanceOf[MotionImagePlayback]

  @inline def values: js.Array[MotionImagePlayback] = js.Array(ONCE, REPEAT)
}

/** When enabled, include 'clap' atom if appropriate for the video output settings.
  */
@js.native
sealed trait MovClapAtom extends js.Any
object MovClapAtom {
  val INCLUDE = "INCLUDE".asInstanceOf[MovClapAtom]
  val EXCLUDE = "EXCLUDE".asInstanceOf[MovClapAtom]

  @inline def values: js.Array[MovClapAtom] = js.Array(INCLUDE, EXCLUDE)
}

/** When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
  */
@js.native
sealed trait MovCslgAtom extends js.Any
object MovCslgAtom {
  val INCLUDE = "INCLUDE".asInstanceOf[MovCslgAtom]
  val EXCLUDE = "EXCLUDE".asInstanceOf[MovCslgAtom]

  @inline def values: js.Array[MovCslgAtom] = js.Array(INCLUDE, EXCLUDE)
}

/** When set to XDCAM, writes MPEG2 video streams into the QuickTime file using XDCAM fourcc codes. This increases compatibility with Apple editors and players, but may decrease compatibility with other players. Only applicable when the video codec is MPEG2.
  */
@js.native
sealed trait MovMpeg2FourCCControl extends js.Any
object MovMpeg2FourCCControl {
  val XDCAM = "XDCAM".asInstanceOf[MovMpeg2FourCCControl]
  val MPEG = "MPEG".asInstanceOf[MovMpeg2FourCCControl]

  @inline def values: js.Array[MovMpeg2FourCCControl] = js.Array(XDCAM, MPEG)
}

/** To make this output compatible with Omenon, keep the default value, OMNEON. Unless you need Omneon compatibility, set this value to NONE. When you keep the default value, OMNEON, MediaConvert increases the length of the edit list atom. This might cause file rejections when a recipient of the output file doesn't expct this extra padding.
  */
@js.native
sealed trait MovPaddingControl extends js.Any
object MovPaddingControl {
  val OMNEON = "OMNEON".asInstanceOf[MovPaddingControl]
  val NONE = "NONE".asInstanceOf[MovPaddingControl]

  @inline def values: js.Array[MovPaddingControl] = js.Array(OMNEON, NONE)
}

/** Always keep the default value (SELF_CONTAINED) for this setting.
  */
@js.native
sealed trait MovReference extends js.Any
object MovReference {
  val SELF_CONTAINED = "SELF_CONTAINED".asInstanceOf[MovReference]
  val EXTERNAL = "EXTERNAL".asInstanceOf[MovReference]

  @inline def values: js.Array[MovReference] = js.Array(SELF_CONTAINED, EXTERNAL)
}

/** Specify whether the service encodes this MP3 audio output with a constant bitrate (CBR) or a variable bitrate (VBR).
  */
@js.native
sealed trait Mp3RateControlMode extends js.Any
object Mp3RateControlMode {
  val CBR = "CBR".asInstanceOf[Mp3RateControlMode]
  val VBR = "VBR".asInstanceOf[Mp3RateControlMode]

  @inline def values: js.Array[Mp3RateControlMode] = js.Array(CBR, VBR)
}

/** When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
  */
@js.native
sealed trait Mp4CslgAtom extends js.Any
object Mp4CslgAtom {
  val INCLUDE = "INCLUDE".asInstanceOf[Mp4CslgAtom]
  val EXCLUDE = "EXCLUDE".asInstanceOf[Mp4CslgAtom]

  @inline def values: js.Array[Mp4CslgAtom] = js.Array(INCLUDE, EXCLUDE)
}

/** Inserts a free-space box immediately after the moov box.
  */
@js.native
sealed trait Mp4FreeSpaceBox extends js.Any
object Mp4FreeSpaceBox {
  val INCLUDE = "INCLUDE".asInstanceOf[Mp4FreeSpaceBox]
  val EXCLUDE = "EXCLUDE".asInstanceOf[Mp4FreeSpaceBox]

  @inline def values: js.Array[Mp4FreeSpaceBox] = js.Array(INCLUDE, EXCLUDE)
}

/** If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
  */
@js.native
sealed trait Mp4MoovPlacement extends js.Any
object Mp4MoovPlacement {
  val PROGRESSIVE_DOWNLOAD = "PROGRESSIVE_DOWNLOAD".asInstanceOf[Mp4MoovPlacement]
  val NORMAL = "NORMAL".asInstanceOf[Mp4MoovPlacement]

  @inline def values: js.Array[Mp4MoovPlacement] = js.Array(PROGRESSIVE_DOWNLOAD, NORMAL)
}

/** Optional. Choose Include (INCLUDE) to have MediaConvert mark up your DASH manifest with <Accessibility> elements for embedded 608 captions. This markup isn't generally required, but some video players require it to discover and play embedded 608 captions. Keep the default value, Exclude (EXCLUDE), to leave these elements out. When you enable this setting, this is the markup that MediaConvert includes in your manifest: <Accessibility schemeIdUri="urn:scte:dash:cc:cea-608:2015" value="CC1=eng"/>
  */
@js.native
sealed trait MpdAccessibilityCaptionHints extends js.Any
object MpdAccessibilityCaptionHints {
  val INCLUDE = "INCLUDE".asInstanceOf[MpdAccessibilityCaptionHints]
  val EXCLUDE = "EXCLUDE".asInstanceOf[MpdAccessibilityCaptionHints]

  @inline def values: js.Array[MpdAccessibilityCaptionHints] = js.Array(INCLUDE, EXCLUDE)
}

/** Specify this setting only when your output will be consumed by a downstream repackaging workflow that is sensitive to very small duration differences between video and audio. For this situation, choose Match video duration (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration (DEFAULT_CODEC_DURATION). When you choose Match video duration, MediaConvert pads the output audio streams with silence or trims them to ensure that the total duration of each audio stream is at least as long as the total duration of the video stream. After padding or trimming, the audio stream duration is no more than one frame longer than the video stream. MediaConvert applies audio padding or trimming only to the end of the last segment of the output. For unsegmented outputs, MediaConvert adds padding only to the end of the file. When you keep the default value, any minor discrepancies between audio and video duration will depend on your output audio codec.
  */
@js.native
sealed trait MpdAudioDuration extends js.Any
object MpdAudioDuration {
  val DEFAULT_CODEC_DURATION = "DEFAULT_CODEC_DURATION".asInstanceOf[MpdAudioDuration]
  val MATCH_VIDEO_DURATION = "MATCH_VIDEO_DURATION".asInstanceOf[MpdAudioDuration]

  @inline def values: js.Array[MpdAudioDuration] = js.Array(DEFAULT_CODEC_DURATION, MATCH_VIDEO_DURATION)
}

/** Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify sidecar captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single XML file in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format contained within fragmented MP4 files. This set of fragmented MP4 files is separate from your video and audio fragmented MP4 files.
  */
@js.native
sealed trait MpdCaptionContainerType extends js.Any
object MpdCaptionContainerType {
  val RAW = "RAW".asInstanceOf[MpdCaptionContainerType]
  val FRAGMENTED_MP4 = "FRAGMENTED_MP4".asInstanceOf[MpdCaptionContainerType]

  @inline def values: js.Array[MpdCaptionContainerType] = js.Array(RAW, FRAGMENTED_MP4)
}

/** Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
  */
@js.native
sealed trait MpdScte35Esam extends js.Any
object MpdScte35Esam {
  val INSERT = "INSERT".asInstanceOf[MpdScte35Esam]
  val NONE = "NONE".asInstanceOf[MpdScte35Esam]

  @inline def values: js.Array[MpdScte35Esam] = js.Array(INSERT, NONE)
}

/** Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want those SCTE-35 markers in this output.
  */
@js.native
sealed trait MpdScte35Source extends js.Any
object MpdScte35Source {
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[MpdScte35Source]
  val NONE = "NONE".asInstanceOf[MpdScte35Source]

  @inline def values: js.Array[MpdScte35Source] = js.Array(PASSTHROUGH, NONE)
}

/** Specify the strength of any adaptive quantization filters that you enable. The value that you choose here applies to the following settings: Spatial adaptive quantization (spatialAdaptiveQuantization), and Temporal adaptive quantization (temporalAdaptiveQuantization).
  */
@js.native
sealed trait Mpeg2AdaptiveQuantization extends js.Any
object Mpeg2AdaptiveQuantization {
  val OFF = "OFF".asInstanceOf[Mpeg2AdaptiveQuantization]
  val LOW = "LOW".asInstanceOf[Mpeg2AdaptiveQuantization]
  val MEDIUM = "MEDIUM".asInstanceOf[Mpeg2AdaptiveQuantization]
  val HIGH = "HIGH".asInstanceOf[Mpeg2AdaptiveQuantization]

  @inline def values: js.Array[Mpeg2AdaptiveQuantization] = js.Array(OFF, LOW, MEDIUM, HIGH)
}

/** Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
  */
@js.native
sealed trait Mpeg2CodecLevel extends js.Any
object Mpeg2CodecLevel {
  val AUTO = "AUTO".asInstanceOf[Mpeg2CodecLevel]
  val LOW = "LOW".asInstanceOf[Mpeg2CodecLevel]
  val MAIN = "MAIN".asInstanceOf[Mpeg2CodecLevel]
  val HIGH1440 = "HIGH1440".asInstanceOf[Mpeg2CodecLevel]
  val HIGH = "HIGH".asInstanceOf[Mpeg2CodecLevel]

  @inline def values: js.Array[Mpeg2CodecLevel] = js.Array(AUTO, LOW, MAIN, HIGH1440, HIGH)
}

/** Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video output.
  */
@js.native
sealed trait Mpeg2CodecProfile extends js.Any
object Mpeg2CodecProfile {
  val MAIN = "MAIN".asInstanceOf[Mpeg2CodecProfile]
  val PROFILE_422 = "PROFILE_422".asInstanceOf[Mpeg2CodecProfile]

  @inline def values: js.Array[Mpeg2CodecProfile] = js.Array(MAIN, PROFILE_422)
}

/** Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
  */
@js.native
sealed trait Mpeg2DynamicSubGop extends js.Any
object Mpeg2DynamicSubGop {
  val ADAPTIVE = "ADAPTIVE".asInstanceOf[Mpeg2DynamicSubGop]
  val STATIC = "STATIC".asInstanceOf[Mpeg2DynamicSubGop]

  @inline def values: js.Array[Mpeg2DynamicSubGop] = js.Array(ADAPTIVE, STATIC)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
@js.native
sealed trait Mpeg2FramerateControl extends js.Any
object Mpeg2FramerateControl {
  val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[Mpeg2FramerateControl]
  val SPECIFIED = "SPECIFIED".asInstanceOf[Mpeg2FramerateControl]

  @inline def values: js.Array[Mpeg2FramerateControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
@js.native
sealed trait Mpeg2FramerateConversionAlgorithm extends js.Any
object Mpeg2FramerateConversionAlgorithm {
  val DUPLICATE_DROP = "DUPLICATE_DROP".asInstanceOf[Mpeg2FramerateConversionAlgorithm]
  val INTERPOLATE = "INTERPOLATE".asInstanceOf[Mpeg2FramerateConversionAlgorithm]
  val FRAMEFORMER = "FRAMEFORMER".asInstanceOf[Mpeg2FramerateConversionAlgorithm]

  @inline def values: js.Array[Mpeg2FramerateConversionAlgorithm] = js.Array(DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
  */
@js.native
sealed trait Mpeg2GopSizeUnits extends js.Any
object Mpeg2GopSizeUnits {
  val FRAMES = "FRAMES".asInstanceOf[Mpeg2GopSizeUnits]
  val SECONDS = "SECONDS".asInstanceOf[Mpeg2GopSizeUnits]

  @inline def values: js.Array[Mpeg2GopSizeUnits] = js.Array(FRAMES, SECONDS)
}

/** Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
  */
@js.native
sealed trait Mpeg2InterlaceMode extends js.Any
object Mpeg2InterlaceMode {
  val PROGRESSIVE = "PROGRESSIVE".asInstanceOf[Mpeg2InterlaceMode]
  val TOP_FIELD = "TOP_FIELD".asInstanceOf[Mpeg2InterlaceMode]
  val BOTTOM_FIELD = "BOTTOM_FIELD".asInstanceOf[Mpeg2InterlaceMode]
  val FOLLOW_TOP_FIELD = "FOLLOW_TOP_FIELD".asInstanceOf[Mpeg2InterlaceMode]
  val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD".asInstanceOf[Mpeg2InterlaceMode]

  @inline def values: js.Array[Mpeg2InterlaceMode] = js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD)
}

/** Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision for intra-block DC coefficients. If you choose the value auto, the service will automatically select the precision based on the per-frame compression ratio.
  */
@js.native
sealed trait Mpeg2IntraDcPrecision extends js.Any
object Mpeg2IntraDcPrecision {
  val AUTO = "AUTO".asInstanceOf[Mpeg2IntraDcPrecision]
  val INTRA_DC_PRECISION_8 = "INTRA_DC_PRECISION_8".asInstanceOf[Mpeg2IntraDcPrecision]
  val INTRA_DC_PRECISION_9 = "INTRA_DC_PRECISION_9".asInstanceOf[Mpeg2IntraDcPrecision]
  val INTRA_DC_PRECISION_10 = "INTRA_DC_PRECISION_10".asInstanceOf[Mpeg2IntraDcPrecision]
  val INTRA_DC_PRECISION_11 = "INTRA_DC_PRECISION_11".asInstanceOf[Mpeg2IntraDcPrecision]

  @inline def values: js.Array[Mpeg2IntraDcPrecision] = js.Array(AUTO, INTRA_DC_PRECISION_8, INTRA_DC_PRECISION_9, INTRA_DC_PRECISION_10, INTRA_DC_PRECISION_11)
}

/** Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
  */
@js.native
sealed trait Mpeg2ParControl extends js.Any
object Mpeg2ParControl {
  val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[Mpeg2ParControl]
  val SPECIFIED = "SPECIFIED".asInstanceOf[Mpeg2ParControl]

  @inline def values: js.Array[Mpeg2ParControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, single-pass encoding.
  */
@js.native
sealed trait Mpeg2QualityTuningLevel extends js.Any
object Mpeg2QualityTuningLevel {
  val SINGLE_PASS = "SINGLE_PASS".asInstanceOf[Mpeg2QualityTuningLevel]
  val MULTI_PASS = "MULTI_PASS".asInstanceOf[Mpeg2QualityTuningLevel]

  @inline def values: js.Array[Mpeg2QualityTuningLevel] = js.Array(SINGLE_PASS, MULTI_PASS)
}

/** Use Rate control mode (Mpeg2RateControlMode) to specify whether the bitrate is variable (vbr) or constant (cbr).
  */
@js.native
sealed trait Mpeg2RateControlMode extends js.Any
object Mpeg2RateControlMode {
  val VBR = "VBR".asInstanceOf[Mpeg2RateControlMode]
  val CBR = "CBR".asInstanceOf[Mpeg2RateControlMode]

  @inline def values: js.Array[Mpeg2RateControlMode] = js.Array(VBR, CBR)
}

/** Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
  */
@js.native
sealed trait Mpeg2ScanTypeConversionMode extends js.Any
object Mpeg2ScanTypeConversionMode {
  val INTERLACED = "INTERLACED".asInstanceOf[Mpeg2ScanTypeConversionMode]
  val INTERLACED_OPTIMIZE = "INTERLACED_OPTIMIZE".asInstanceOf[Mpeg2ScanTypeConversionMode]

  @inline def values: js.Array[Mpeg2ScanTypeConversionMode] = js.Array(INTERLACED, INTERLACED_OPTIMIZE)
}

/** Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default.
  */
@js.native
sealed trait Mpeg2SceneChangeDetect extends js.Any
object Mpeg2SceneChangeDetect {
  val DISABLED = "DISABLED".asInstanceOf[Mpeg2SceneChangeDetect]
  val ENABLED = "ENABLED".asInstanceOf[Mpeg2SceneChangeDetect]

  @inline def values: js.Array[Mpeg2SceneChangeDetect] = js.Array(DISABLED, ENABLED)
}

/** Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
  */
@js.native
sealed trait Mpeg2SlowPal extends js.Any
object Mpeg2SlowPal {
  val DISABLED = "DISABLED".asInstanceOf[Mpeg2SlowPal]
  val ENABLED = "ENABLED".asInstanceOf[Mpeg2SlowPal]

  @inline def values: js.Array[Mpeg2SlowPal] = js.Array(DISABLED, ENABLED)
}

/** Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture, you might choose to disable this feature. Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video
  * games, set it to Low. For content with a wider variety of textures, set it to High or Higher.
  */
@js.native
sealed trait Mpeg2SpatialAdaptiveQuantization extends js.Any
object Mpeg2SpatialAdaptiveQuantization {
  val DISABLED = "DISABLED".asInstanceOf[Mpeg2SpatialAdaptiveQuantization]
  val ENABLED = "ENABLED".asInstanceOf[Mpeg2SpatialAdaptiveQuantization]

  @inline def values: js.Array[Mpeg2SpatialAdaptiveQuantization] = js.Array(DISABLED, ENABLED)
}

/** Specify whether this output's video uses the D10 syntax. Keep the default value to not use the syntax. Related settings: When you choose D10 (D_10) for your MXF profile (profile), you must also set this value to to D10 (D_10).
  */
@js.native
sealed trait Mpeg2Syntax extends js.Any
object Mpeg2Syntax {
  val DEFAULT = "DEFAULT".asInstanceOf[Mpeg2Syntax]
  val D_10 = "D_10".asInstanceOf[Mpeg2Syntax]

  @inline def values: js.Array[Mpeg2Syntax] = js.Array(DEFAULT, D_10)
}

/** When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is interlaced, you can optionally enable hard or soft telecine to create a smoother picture. Hard telecine (HARD) produces a 29.97i output. Soft telecine (SOFT) produces an output with a 23.976 output that signals to the video player device to do the conversion during play back. When you keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother picture.
  */
@js.native
sealed trait Mpeg2Telecine extends js.Any
object Mpeg2Telecine {
  val NONE = "NONE".asInstanceOf[Mpeg2Telecine]
  val SOFT = "SOFT".asInstanceOf[Mpeg2Telecine]
  val HARD = "HARD".asInstanceOf[Mpeg2Telecine]

  @inline def values: js.Array[Mpeg2Telecine] = js.Array(NONE, SOFT, HARD)
}

/** Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on temporal variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that aren't moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen that doesn't have moving objects with sharp edges, such as sports athletes' faces, you might choose to disable this feature. Related setting: When you enable temporal quantization, adjust the strength of the filter with the setting Adaptive quantization (adaptiveQuantization).
  */
@js.native
sealed trait Mpeg2TemporalAdaptiveQuantization extends js.Any
object Mpeg2TemporalAdaptiveQuantization {
  val DISABLED = "DISABLED".asInstanceOf[Mpeg2TemporalAdaptiveQuantization]
  val ENABLED = "ENABLED".asInstanceOf[Mpeg2TemporalAdaptiveQuantization]

  @inline def values: js.Array[Mpeg2TemporalAdaptiveQuantization] = js.Array(DISABLED, ENABLED)
}

/** COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings across a Microsoft Smooth output group into a single audio stream.
  */
@js.native
sealed trait MsSmoothAudioDeduplication extends js.Any
object MsSmoothAudioDeduplication {
  val COMBINE_DUPLICATE_STREAMS = "COMBINE_DUPLICATE_STREAMS".asInstanceOf[MsSmoothAudioDeduplication]
  val NONE = "NONE".asInstanceOf[MsSmoothAudioDeduplication]

  @inline def values: js.Array[MsSmoothAudioDeduplication] = js.Array(COMBINE_DUPLICATE_STREAMS, NONE)
}

/** Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding format for the server and client manifest. Valid options are utf8 and utf16.
  */
@js.native
sealed trait MsSmoothManifestEncoding extends js.Any
object MsSmoothManifestEncoding {
  val UTF8 = "UTF8".asInstanceOf[MsSmoothManifestEncoding]
  val UTF16 = "UTF16".asInstanceOf[MsSmoothManifestEncoding]

  @inline def values: js.Array[MsSmoothManifestEncoding] = js.Array(UTF8, UTF16)
}

/** Optional. When you have AFD signaling set up in your output video stream, use this setting to choose whether to also include it in the MXF wrapper. Choose Don't copy (NO_COPY) to exclude AFD signaling from the MXF wrapper. Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD values from the video stream for this output to the MXF wrapper. Regardless of which option you choose, the AFD values remain in the video stream. Related settings: To set up your output to include or exclude AFD values, see AfdSignaling, under VideoDescription. On the console, find AFD signaling under the output's video encoding settings.
  */
@js.native
sealed trait MxfAfdSignaling extends js.Any
object MxfAfdSignaling {
  val NO_COPY = "NO_COPY".asInstanceOf[MxfAfdSignaling]
  val COPY_FROM_VIDEO = "COPY_FROM_VIDEO".asInstanceOf[MxfAfdSignaling]

  @inline def values: js.Array[MxfAfdSignaling] = js.Array(NO_COPY, COPY_FROM_VIDEO)
}

/** Specify the MXF profile, also called shim, for this output. When you choose Auto, MediaConvert chooses a profile based on the video codec and resolution. For a list of codecs supported with each MXF profile, see https://docs.aws.amazon.com/mediaconvert/latest/ug/codecs-supported-with-each-mxf-profile.html. For more information about the automatic selection behavior, see https://docs.aws.amazon.com/mediaconvert/latest/ug/default-automatic-selection-of-mxf-profiles.html.
  */
@js.native
sealed trait MxfProfile extends js.Any
object MxfProfile {
  val D_10 = "D_10".asInstanceOf[MxfProfile]
  val XDCAM = "XDCAM".asInstanceOf[MxfProfile]
  val OP1A = "OP1A".asInstanceOf[MxfProfile]

  @inline def values: js.Array[MxfProfile] = js.Array(D_10, XDCAM, OP1A)
}

/** Choose the type of Nielsen watermarks that you want in your outputs. When you choose NAES 2 and NW (NAES2_AND_NW), you must provide a value for the setting SID (sourceId). When you choose CBET (CBET), you must provide a value for the setting CSID (cbetSourceId). When you choose NAES 2, NW, and CBET (NAES2_AND_NW_AND_CBET), you must provide values for both of these settings.
  */
@js.native
sealed trait NielsenActiveWatermarkProcessType extends js.Any
object NielsenActiveWatermarkProcessType {
  val NAES2_AND_NW = "NAES2_AND_NW".asInstanceOf[NielsenActiveWatermarkProcessType]
  val CBET = "CBET".asInstanceOf[NielsenActiveWatermarkProcessType]
  val NAES2_AND_NW_AND_CBET = "NAES2_AND_NW_AND_CBET".asInstanceOf[NielsenActiveWatermarkProcessType]

  @inline def values: js.Array[NielsenActiveWatermarkProcessType] = js.Array(NAES2_AND_NW, CBET, NAES2_AND_NW_AND_CBET)
}

/** Required. Specify whether your source content already contains Nielsen non-linear watermarks. When you set this value to Watermarked (WATERMARKED), the service fails the job. Nielsen requires that you add non-linear watermarking to only clean content that doesn't already have non-linear Nielsen watermarks.
  */
@js.native
sealed trait NielsenSourceWatermarkStatusType extends js.Any
object NielsenSourceWatermarkStatusType {
  val CLEAN = "CLEAN".asInstanceOf[NielsenSourceWatermarkStatusType]
  val WATERMARKED = "WATERMARKED".asInstanceOf[NielsenSourceWatermarkStatusType]

  @inline def values: js.Array[NielsenSourceWatermarkStatusType] = js.Array(CLEAN, WATERMARKED)
}

/** To create assets that have the same TIC values in each audio track, keep the default value Share TICs (SAME_TICS_PER_TRACK). To create assets that have unique TIC values for each audio track, choose Use unique TICs (RESERVE_UNIQUE_TICS_PER_TRACK).
  */
@js.native
sealed trait NielsenUniqueTicPerAudioTrackType extends js.Any
object NielsenUniqueTicPerAudioTrackType {
  val RESERVE_UNIQUE_TICS_PER_TRACK = "RESERVE_UNIQUE_TICS_PER_TRACK".asInstanceOf[NielsenUniqueTicPerAudioTrackType]
  val SAME_TICS_PER_TRACK = "SAME_TICS_PER_TRACK".asInstanceOf[NielsenUniqueTicPerAudioTrackType]

  @inline def values: js.Array[NielsenUniqueTicPerAudioTrackType] = js.Array(RESERVE_UNIQUE_TICS_PER_TRACK, SAME_TICS_PER_TRACK)
}

/** Optional. When you set Noise reducer (noiseReducer) to Temporal (TEMPORAL), you can use this setting to apply sharpening. The default behavior, Auto (AUTO), allows the transcoder to determine whether to apply filtering, depending on input type and quality. When you set Noise reducer to Temporal, your output bandwidth is reduced. When Post temporal sharpening is also enabled, that bandwidth reduction is smaller.
  */
@js.native
sealed trait NoiseFilterPostTemporalSharpening extends js.Any
object NoiseFilterPostTemporalSharpening {
  val DISABLED = "DISABLED".asInstanceOf[NoiseFilterPostTemporalSharpening]
  val ENABLED = "ENABLED".asInstanceOf[NoiseFilterPostTemporalSharpening]
  val AUTO = "AUTO".asInstanceOf[NoiseFilterPostTemporalSharpening]

  @inline def values: js.Array[NoiseFilterPostTemporalSharpening] = js.Array(DISABLED, ENABLED, AUTO)
}

/** Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering functions. To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral preserves edges while reducing noise. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) do convolution filtering. * Conserve does min/max noise reduction. * Spatial does frequency-domain filtering based on JND principles. * Temporal optimizes video quality for complex motion.
  */
@js.native
sealed trait NoiseReducerFilter extends js.Any
object NoiseReducerFilter {
  val BILATERAL = "BILATERAL".asInstanceOf[NoiseReducerFilter]
  val MEAN = "MEAN".asInstanceOf[NoiseReducerFilter]
  val GAUSSIAN = "GAUSSIAN".asInstanceOf[NoiseReducerFilter]
  val LANCZOS = "LANCZOS".asInstanceOf[NoiseReducerFilter]
  val SHARPEN = "SHARPEN".asInstanceOf[NoiseReducerFilter]
  val CONSERVE = "CONSERVE".asInstanceOf[NoiseReducerFilter]
  val SPATIAL = "SPATIAL".asInstanceOf[NoiseReducerFilter]
  val TEMPORAL = "TEMPORAL".asInstanceOf[NoiseReducerFilter]

  @inline def values: js.Array[NoiseReducerFilter] = js.Array(BILATERAL, MEAN, GAUSSIAN, LANCZOS, SHARPEN, CONSERVE, SPATIAL, TEMPORAL)
}

/** Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource.
  */
@js.native
sealed trait Order extends js.Any
object Order {
  val ASCENDING = "ASCENDING".asInstanceOf[Order]
  val DESCENDING = "DESCENDING".asInstanceOf[Order]

  @inline def values: js.Array[Order] = js.Array(ASCENDING, DESCENDING)
}

/** Type of output group (File group, Apple HLS, DASH ISO, Microsoft Smooth Streaming, CMAF)
  */
@js.native
sealed trait OutputGroupType extends js.Any
object OutputGroupType {
  val HLS_GROUP_SETTINGS = "HLS_GROUP_SETTINGS".asInstanceOf[OutputGroupType]
  val DASH_ISO_GROUP_SETTINGS = "DASH_ISO_GROUP_SETTINGS".asInstanceOf[OutputGroupType]
  val FILE_GROUP_SETTINGS = "FILE_GROUP_SETTINGS".asInstanceOf[OutputGroupType]
  val MS_SMOOTH_GROUP_SETTINGS = "MS_SMOOTH_GROUP_SETTINGS".asInstanceOf[OutputGroupType]
  val CMAF_GROUP_SETTINGS = "CMAF_GROUP_SETTINGS".asInstanceOf[OutputGroupType]

  @inline def values: js.Array[OutputGroupType] = js.Array(HLS_GROUP_SETTINGS, DASH_ISO_GROUP_SETTINGS, FILE_GROUP_SETTINGS, MS_SMOOTH_GROUP_SETTINGS, CMAF_GROUP_SETTINGS)
}

/** Selects method of inserting SDT information into output stream. "Follow input SDT" copies SDT information from input stream to output stream. "Follow input SDT if present" copies SDT information from input stream to output stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. Enter "SDT Manually" means user will enter the SDT information. "No SDT" means output stream will not contain SDT information.
  */
@js.native
sealed trait OutputSdt extends js.Any
object OutputSdt {
  val SDT_FOLLOW = "SDT_FOLLOW".asInstanceOf[OutputSdt]
  val SDT_FOLLOW_IF_PRESENT = "SDT_FOLLOW_IF_PRESENT".asInstanceOf[OutputSdt]
  val SDT_MANUAL = "SDT_MANUAL".asInstanceOf[OutputSdt]
  val SDT_NONE = "SDT_NONE".asInstanceOf[OutputSdt]

  @inline def values: js.Array[OutputSdt] = js.Array(SDT_FOLLOW, SDT_FOLLOW_IF_PRESENT, SDT_MANUAL, SDT_NONE)
}

/** Optional. When you request a list of presets, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
  */
@js.native
sealed trait PresetListBy extends js.Any
object PresetListBy {
  val NAME = "NAME".asInstanceOf[PresetListBy]
  val CREATION_DATE = "CREATION_DATE".asInstanceOf[PresetListBy]
  val SYSTEM = "SYSTEM".asInstanceOf[PresetListBy]

  @inline def values: js.Array[PresetListBy] = js.Array(NAME, CREATION_DATE, SYSTEM)
}

/** Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment.
  */
@js.native
sealed trait PricingPlan extends js.Any
object PricingPlan {
  val ON_DEMAND = "ON_DEMAND".asInstanceOf[PricingPlan]
  val RESERVED = "RESERVED".asInstanceOf[PricingPlan]

  @inline def values: js.Array[PricingPlan] = js.Array(ON_DEMAND, RESERVED)
}

/** Use Profile (ProResCodecProfile) to specify the type of Apple ProRes codec to use for this output.
  */
@js.native
sealed trait ProresCodecProfile extends js.Any
object ProresCodecProfile {
  val APPLE_PRORES_422 = "APPLE_PRORES_422".asInstanceOf[ProresCodecProfile]
  val APPLE_PRORES_422_HQ = "APPLE_PRORES_422_HQ".asInstanceOf[ProresCodecProfile]
  val APPLE_PRORES_422_LT = "APPLE_PRORES_422_LT".asInstanceOf[ProresCodecProfile]
  val APPLE_PRORES_422_PROXY = "APPLE_PRORES_422_PROXY".asInstanceOf[ProresCodecProfile]

  @inline def values: js.Array[ProresCodecProfile] = js.Array(APPLE_PRORES_422, APPLE_PRORES_422_HQ, APPLE_PRORES_422_LT, APPLE_PRORES_422_PROXY)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
@js.native
sealed trait ProresFramerateControl extends js.Any
object ProresFramerateControl {
  val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[ProresFramerateControl]
  val SPECIFIED = "SPECIFIED".asInstanceOf[ProresFramerateControl]

  @inline def values: js.Array[ProresFramerateControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
@js.native
sealed trait ProresFramerateConversionAlgorithm extends js.Any
object ProresFramerateConversionAlgorithm {
  val DUPLICATE_DROP = "DUPLICATE_DROP".asInstanceOf[ProresFramerateConversionAlgorithm]
  val INTERPOLATE = "INTERPOLATE".asInstanceOf[ProresFramerateConversionAlgorithm]
  val FRAMEFORMER = "FRAMEFORMER".asInstanceOf[ProresFramerateConversionAlgorithm]

  @inline def values: js.Array[ProresFramerateConversionAlgorithm] = js.Array(DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
  */
@js.native
sealed trait ProresInterlaceMode extends js.Any
object ProresInterlaceMode {
  val PROGRESSIVE = "PROGRESSIVE".asInstanceOf[ProresInterlaceMode]
  val TOP_FIELD = "TOP_FIELD".asInstanceOf[ProresInterlaceMode]
  val BOTTOM_FIELD = "BOTTOM_FIELD".asInstanceOf[ProresInterlaceMode]
  val FOLLOW_TOP_FIELD = "FOLLOW_TOP_FIELD".asInstanceOf[ProresInterlaceMode]
  val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD".asInstanceOf[ProresInterlaceMode]

  @inline def values: js.Array[ProresInterlaceMode] = js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD)
}

/** Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
  */
@js.native
sealed trait ProresParControl extends js.Any
object ProresParControl {
  val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[ProresParControl]
  val SPECIFIED = "SPECIFIED".asInstanceOf[ProresParControl]

  @inline def values: js.Array[ProresParControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
  */
@js.native
sealed trait ProresScanTypeConversionMode extends js.Any
object ProresScanTypeConversionMode {
  val INTERLACED = "INTERLACED".asInstanceOf[ProresScanTypeConversionMode]
  val INTERLACED_OPTIMIZE = "INTERLACED_OPTIMIZE".asInstanceOf[ProresScanTypeConversionMode]

  @inline def values: js.Array[ProresScanTypeConversionMode] = js.Array(INTERLACED, INTERLACED_OPTIMIZE)
}

/** Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
  */
@js.native
sealed trait ProresSlowPal extends js.Any
object ProresSlowPal {
  val DISABLED = "DISABLED".asInstanceOf[ProresSlowPal]
  val ENABLED = "ENABLED".asInstanceOf[ProresSlowPal]

  @inline def values: js.Array[ProresSlowPal] = js.Array(DISABLED, ENABLED)
}

/** When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother picture.
  */
@js.native
sealed trait ProresTelecine extends js.Any
object ProresTelecine {
  val NONE = "NONE".asInstanceOf[ProresTelecine]
  val HARD = "HARD".asInstanceOf[ProresTelecine]

  @inline def values: js.Array[ProresTelecine] = js.Array(NONE, HARD)
}

/** Optional. When you request a list of queues, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by creation date.
  */
@js.native
sealed trait QueueListBy extends js.Any
object QueueListBy {
  val NAME = "NAME".asInstanceOf[QueueListBy]
  val CREATION_DATE = "CREATION_DATE".asInstanceOf[QueueListBy]

  @inline def values: js.Array[QueueListBy] = js.Array(NAME, CREATION_DATE)
}

/** Queues can be ACTIVE or PAUSED. If you pause a queue, jobs in that queue won't begin. Jobs that are running when you pause a queue continue to run until they finish or result in an error.
  */
@js.native
sealed trait QueueStatus extends js.Any
object QueueStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[QueueStatus]
  val PAUSED = "PAUSED".asInstanceOf[QueueStatus]

  @inline def values: js.Array[QueueStatus] = js.Array(ACTIVE, PAUSED)
}

/** Specifies whether the term of your reserved queue pricing plan is automatically extended (AUTO_RENEW) or expires (EXPIRE) at the end of the term.
  */
@js.native
sealed trait RenewalType extends js.Any
object RenewalType {
  val AUTO_RENEW = "AUTO_RENEW".asInstanceOf[RenewalType]
  val EXPIRE = "EXPIRE".asInstanceOf[RenewalType]

  @inline def values: js.Array[RenewalType] = js.Array(AUTO_RENEW, EXPIRE)
}

/** Specifies whether the pricing plan for your reserved queue is ACTIVE or EXPIRED.
  */
@js.native
sealed trait ReservationPlanStatus extends js.Any
object ReservationPlanStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[ReservationPlanStatus]
  val EXPIRED = "EXPIRED".asInstanceOf[ReservationPlanStatus]

  @inline def values: js.Array[ReservationPlanStatus] = js.Array(ACTIVE, EXPIRED)
}

/** Use Respond to AFD (RespondToAfd) to specify how the service changes the video itself in response to AFD values in the input. * Choose Respond to clip the input video frame according to the AFD value, input display aspect ratio, and output display aspect ratio. * Choose Passthrough to include the input AFD values. Do not choose this when AfdSignaling is set to (NONE). A preferred implementation of this workflow is to set RespondToAfd to (NONE) and set AfdSignaling to (AUTO). * Choose None to remove all input AFD values from this output.
  */
@js.native
sealed trait RespondToAfd extends js.Any
object RespondToAfd {
  val NONE = "NONE".asInstanceOf[RespondToAfd]
  val RESPOND = "RESPOND".asInstanceOf[RespondToAfd]
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[RespondToAfd]

  @inline def values: js.Array[RespondToAfd] = js.Array(NONE, RESPOND, PASSTHROUGH)
}

/** Choose an Amazon S3 canned ACL for MediaConvert to apply to this output.
  */
@js.native
sealed trait S3ObjectCannedAcl extends js.Any
object S3ObjectCannedAcl {
  val PUBLIC_READ = "PUBLIC_READ".asInstanceOf[S3ObjectCannedAcl]
  val AUTHENTICATED_READ = "AUTHENTICATED_READ".asInstanceOf[S3ObjectCannedAcl]
  val BUCKET_OWNER_READ = "BUCKET_OWNER_READ".asInstanceOf[S3ObjectCannedAcl]
  val BUCKET_OWNER_FULL_CONTROL = "BUCKET_OWNER_FULL_CONTROL".asInstanceOf[S3ObjectCannedAcl]

  @inline def values: js.Array[S3ObjectCannedAcl] = js.Array(PUBLIC_READ, AUTHENTICATED_READ, BUCKET_OWNER_READ, BUCKET_OWNER_FULL_CONTROL)
}

/** Specify how you want your data keys managed. AWS uses data keys to encrypt your content. AWS also encrypts the data keys themselves, using a customer master key (CMK), and then stores the encrypted data keys alongside your encrypted content. Use this setting to specify which AWS service manages the CMK. For simplest set up, choose Amazon S3 (SERVER_SIDE_ENCRYPTION_S3). If you want your master key to be managed by AWS Key Management Service (KMS), choose AWS KMS (SERVER_SIDE_ENCRYPTION_KMS). By default, when you choose AWS KMS, KMS uses the AWS managed customer master key (CMK) associated with Amazon S3 to encrypt your data keys. You can optionally choose to specify a different, customer managed CMK. Do so by specifying the Amazon Resource Name (ARN) of the key for the setting KMS ARN (kmsKeyArn).
  */
@js.native
sealed trait S3ServerSideEncryptionType extends js.Any
object S3ServerSideEncryptionType {
  val SERVER_SIDE_ENCRYPTION_S3 = "SERVER_SIDE_ENCRYPTION_S3".asInstanceOf[S3ServerSideEncryptionType]
  val SERVER_SIDE_ENCRYPTION_KMS = "SERVER_SIDE_ENCRYPTION_KMS".asInstanceOf[S3ServerSideEncryptionType]

  @inline def values: js.Array[S3ServerSideEncryptionType] = js.Array(SERVER_SIDE_ENCRYPTION_S3, SERVER_SIDE_ENCRYPTION_KMS)
}

/** Specify how the service handles outputs that have a different aspect ratio from the input aspect ratio. Choose Stretch to output (STRETCH_TO_OUTPUT) to have the service stretch your video image to fit. Keep the setting Default (DEFAULT) to have the service letterbox your video instead. This setting overrides any value that you specify for the setting Selection placement (position) in this output.
  */
@js.native
sealed trait ScalingBehavior extends js.Any
object ScalingBehavior {
  val DEFAULT = "DEFAULT".asInstanceOf[ScalingBehavior]
  val STRETCH_TO_OUTPUT = "STRETCH_TO_OUTPUT".asInstanceOf[ScalingBehavior]

  @inline def values: js.Array[ScalingBehavior] = js.Array(DEFAULT, STRETCH_TO_OUTPUT)
}

/** Set Framerate (SccDestinationFramerate) to make sure that the captions and the video are synchronized in the output. Specify a frame rate that matches the frame rate of the associated video. If the video frame rate is 29.97, choose 29.97 dropframe (FRAMERATE_29_97_DROPFRAME) only if the video has video_insertion=true and drop_frame_timecode=true; otherwise, choose 29.97 non-dropframe (FRAMERATE_29_97_NON_DROPFRAME).
  */
@js.native
sealed trait SccDestinationFramerate extends js.Any
object SccDestinationFramerate {
  val FRAMERATE_23_97 = "FRAMERATE_23_97".asInstanceOf[SccDestinationFramerate]
  val FRAMERATE_24 = "FRAMERATE_24".asInstanceOf[SccDestinationFramerate]
  val FRAMERATE_25 = "FRAMERATE_25".asInstanceOf[SccDestinationFramerate]
  val FRAMERATE_29_97_DROPFRAME = "FRAMERATE_29_97_DROPFRAME".asInstanceOf[SccDestinationFramerate]
  val FRAMERATE_29_97_NON_DROPFRAME = "FRAMERATE_29_97_NON_DROPFRAME".asInstanceOf[SccDestinationFramerate]

  @inline def values: js.Array[SccDestinationFramerate] = js.Array(FRAMERATE_23_97, FRAMERATE_24, FRAMERATE_25, FRAMERATE_29_97_DROPFRAME, FRAMERATE_29_97_NON_DROPFRAME)
}

/** Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you need. When this is enabled, MediaConvert runs your job from an on-demand queue with similar performance to what you will see with one RTS in a reserved queue. This setting is disabled by default.
  */
@js.native
sealed trait SimulateReservedQueue extends js.Any
object SimulateReservedQueue {
  val DISABLED = "DISABLED".asInstanceOf[SimulateReservedQueue]
  val ENABLED = "ENABLED".asInstanceOf[SimulateReservedQueue]

  @inline def values: js.Array[SimulateReservedQueue] = js.Array(DISABLED, ENABLED)
}

/** Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error.
  */
@js.native
sealed trait StatusUpdateInterval extends js.Any
object StatusUpdateInterval {
  val SECONDS_10 = "SECONDS_10".asInstanceOf[StatusUpdateInterval]
  val SECONDS_12 = "SECONDS_12".asInstanceOf[StatusUpdateInterval]
  val SECONDS_15 = "SECONDS_15".asInstanceOf[StatusUpdateInterval]
  val SECONDS_20 = "SECONDS_20".asInstanceOf[StatusUpdateInterval]
  val SECONDS_30 = "SECONDS_30".asInstanceOf[StatusUpdateInterval]
  val SECONDS_60 = "SECONDS_60".asInstanceOf[StatusUpdateInterval]
  val SECONDS_120 = "SECONDS_120".asInstanceOf[StatusUpdateInterval]
  val SECONDS_180 = "SECONDS_180".asInstanceOf[StatusUpdateInterval]
  val SECONDS_240 = "SECONDS_240".asInstanceOf[StatusUpdateInterval]
  val SECONDS_300 = "SECONDS_300".asInstanceOf[StatusUpdateInterval]
  val SECONDS_360 = "SECONDS_360".asInstanceOf[StatusUpdateInterval]
  val SECONDS_420 = "SECONDS_420".asInstanceOf[StatusUpdateInterval]
  val SECONDS_480 = "SECONDS_480".asInstanceOf[StatusUpdateInterval]
  val SECONDS_540 = "SECONDS_540".asInstanceOf[StatusUpdateInterval]
  val SECONDS_600 = "SECONDS_600".asInstanceOf[StatusUpdateInterval]

  @inline def values: js.Array[StatusUpdateInterval] = js.Array(
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
@js.native
sealed trait TeletextPageType extends js.Any
object TeletextPageType {
  val PAGE_TYPE_INITIAL = "PAGE_TYPE_INITIAL".asInstanceOf[TeletextPageType]
  val PAGE_TYPE_SUBTITLE = "PAGE_TYPE_SUBTITLE".asInstanceOf[TeletextPageType]
  val PAGE_TYPE_ADDL_INFO = "PAGE_TYPE_ADDL_INFO".asInstanceOf[TeletextPageType]
  val PAGE_TYPE_PROGRAM_SCHEDULE = "PAGE_TYPE_PROGRAM_SCHEDULE".asInstanceOf[TeletextPageType]
  val PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE = "PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE".asInstanceOf[TeletextPageType]

  @inline def values: js.Array[TeletextPageType] = js.Array(PAGE_TYPE_INITIAL, PAGE_TYPE_SUBTITLE, PAGE_TYPE_ADDL_INFO, PAGE_TYPE_PROGRAM_SCHEDULE, PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE)
}

/** Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to specify the location the burned-in timecode on output video.
  */
@js.native
sealed trait TimecodeBurninPosition extends js.Any
object TimecodeBurninPosition {
  val TOP_CENTER = "TOP_CENTER".asInstanceOf[TimecodeBurninPosition]
  val TOP_LEFT = "TOP_LEFT".asInstanceOf[TimecodeBurninPosition]
  val TOP_RIGHT = "TOP_RIGHT".asInstanceOf[TimecodeBurninPosition]
  val MIDDLE_LEFT = "MIDDLE_LEFT".asInstanceOf[TimecodeBurninPosition]
  val MIDDLE_CENTER = "MIDDLE_CENTER".asInstanceOf[TimecodeBurninPosition]
  val MIDDLE_RIGHT = "MIDDLE_RIGHT".asInstanceOf[TimecodeBurninPosition]
  val BOTTOM_LEFT = "BOTTOM_LEFT".asInstanceOf[TimecodeBurninPosition]
  val BOTTOM_CENTER = "BOTTOM_CENTER".asInstanceOf[TimecodeBurninPosition]
  val BOTTOM_RIGHT = "BOTTOM_RIGHT".asInstanceOf[TimecodeBurninPosition]

  @inline def values: js.Array[TimecodeBurninPosition] = js.Array(TOP_CENTER, TOP_LEFT, TOP_RIGHT, MIDDLE_LEFT, MIDDLE_CENTER, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT)
}

/** Use Source (TimecodeSource) to set how timecodes are handled within this job. To make sure that your video, audio, captions, and markers are synchronized and that time-based features, such as image inserter, work correctly, choose the Timecode source option that matches your assets. All timecodes are in a 24-hour format with frame number (HH:MM:SS:FF). * Embedded (EMBEDDED) - Use the timecode that is in the input video. If no embedded timecode is in the source, the service will use Start at 0 (ZEROBASED) instead. * Start at 0 (ZEROBASED) - Set the timecode of the initial frame to 00:00:00:00. * Specified Start (SPECIFIEDSTART) - Set the timecode of the initial frame to a value other than zero. You use Start timecode (Start) to provide this value.
  */
@js.native
sealed trait TimecodeSource extends js.Any
object TimecodeSource {
  val EMBEDDED = "EMBEDDED".asInstanceOf[TimecodeSource]
  val ZEROBASED = "ZEROBASED".asInstanceOf[TimecodeSource]
  val SPECIFIEDSTART = "SPECIFIEDSTART".asInstanceOf[TimecodeSource]

  @inline def values: js.Array[TimecodeSource] = js.Array(EMBEDDED, ZEROBASED, SPECIFIEDSTART)
}

/** Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed metadata from the input in this output.
  */
@js.native
sealed trait TimedMetadata extends js.Any
object TimedMetadata {
  val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[TimedMetadata]
  val NONE = "NONE".asInstanceOf[TimedMetadata]

  @inline def values: js.Array[TimedMetadata] = js.Array(PASSTHROUGH, NONE)
}

/** Pass through style and position information from a TTML-like input source (TTML, IMSC, SMPTE-TT) to the TTML output.
  */
@js.native
sealed trait TtmlStylePassthrough extends js.Any
object TtmlStylePassthrough {
  val ENABLED = "ENABLED".asInstanceOf[TtmlStylePassthrough]
  val DISABLED = "DISABLED".asInstanceOf[TtmlStylePassthrough]

  @inline def values: js.Array[TtmlStylePassthrough] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait Type extends js.Any
object Type {
  val SYSTEM = "SYSTEM".asInstanceOf[Type]
  val CUSTOM = "CUSTOM".asInstanceOf[Type]

  @inline def values: js.Array[Type] = js.Array(SYSTEM, CUSTOM)
}

/** Specify the VC3 class to choose the quality characteristics for this output. VC3 class, together with the settings Framerate (framerateNumerator and framerateDenominator) and Resolution (height and width), determine your output bitrate. For example, say that your video resolution is 1920x1080 and your framerate is 29.97. Then Class 145 (CLASS_145) gives you an output with a bitrate of approximately 145 Mbps and Class 220 (CLASS_220) gives you and output with a bitrate of approximately 220 Mbps. VC3 class also specifies the color bit depth of your output.
  */
@js.native
sealed trait Vc3Class extends js.Any
object Vc3Class {
  val CLASS_145_8BIT = "CLASS_145_8BIT".asInstanceOf[Vc3Class]
  val CLASS_220_8BIT = "CLASS_220_8BIT".asInstanceOf[Vc3Class]
  val CLASS_220_10BIT = "CLASS_220_10BIT".asInstanceOf[Vc3Class]

  @inline def values: js.Array[Vc3Class] = js.Array(CLASS_145_8BIT, CLASS_220_8BIT, CLASS_220_10BIT)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
@js.native
sealed trait Vc3FramerateControl extends js.Any
object Vc3FramerateControl {
  val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[Vc3FramerateControl]
  val SPECIFIED = "SPECIFIED".asInstanceOf[Vc3FramerateControl]

  @inline def values: js.Array[Vc3FramerateControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
@js.native
sealed trait Vc3FramerateConversionAlgorithm extends js.Any
object Vc3FramerateConversionAlgorithm {
  val DUPLICATE_DROP = "DUPLICATE_DROP".asInstanceOf[Vc3FramerateConversionAlgorithm]
  val INTERPOLATE = "INTERPOLATE".asInstanceOf[Vc3FramerateConversionAlgorithm]
  val FRAMEFORMER = "FRAMEFORMER".asInstanceOf[Vc3FramerateConversionAlgorithm]

  @inline def values: js.Array[Vc3FramerateConversionAlgorithm] = js.Array(DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** Optional. Choose the scan line type for this output. If you don't specify a value, MediaConvert will create a progressive output.
  */
@js.native
sealed trait Vc3InterlaceMode extends js.Any
object Vc3InterlaceMode {
  val INTERLACED = "INTERLACED".asInstanceOf[Vc3InterlaceMode]
  val PROGRESSIVE = "PROGRESSIVE".asInstanceOf[Vc3InterlaceMode]

  @inline def values: js.Array[Vc3InterlaceMode] = js.Array(INTERLACED, PROGRESSIVE)
}

/** Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
  */
@js.native
sealed trait Vc3ScanTypeConversionMode extends js.Any
object Vc3ScanTypeConversionMode {
  val INTERLACED = "INTERLACED".asInstanceOf[Vc3ScanTypeConversionMode]
  val INTERLACED_OPTIMIZE = "INTERLACED_OPTIMIZE".asInstanceOf[Vc3ScanTypeConversionMode]

  @inline def values: js.Array[Vc3ScanTypeConversionMode] = js.Array(INTERLACED, INTERLACED_OPTIMIZE)
}

/** Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling this setting will slightly reduce the duration of your video. Related settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
  */
@js.native
sealed trait Vc3SlowPal extends js.Any
object Vc3SlowPal {
  val DISABLED = "DISABLED".asInstanceOf[Vc3SlowPal]
  val ENABLED = "ENABLED".asInstanceOf[Vc3SlowPal]

  @inline def values: js.Array[Vc3SlowPal] = js.Array(DISABLED, ENABLED)
}

/** When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother picture.
  */
@js.native
sealed trait Vc3Telecine extends js.Any
object Vc3Telecine {
  val NONE = "NONE".asInstanceOf[Vc3Telecine]
  val HARD = "HARD".asInstanceOf[Vc3Telecine]

  @inline def values: js.Array[Vc3Telecine] = js.Array(NONE, HARD)
}

/** Type of video codec
  */
@js.native
sealed trait VideoCodec extends js.Any
object VideoCodec {
  val AV1 = "AV1".asInstanceOf[VideoCodec]
  val AVC_INTRA = "AVC_INTRA".asInstanceOf[VideoCodec]
  val FRAME_CAPTURE = "FRAME_CAPTURE".asInstanceOf[VideoCodec]
  val H_264 = "H_264".asInstanceOf[VideoCodec]
  val H_265 = "H_265".asInstanceOf[VideoCodec]
  val MPEG2 = "MPEG2".asInstanceOf[VideoCodec]
  val PRORES = "PRORES".asInstanceOf[VideoCodec]
  val VC3 = "VC3".asInstanceOf[VideoCodec]
  val VP8 = "VP8".asInstanceOf[VideoCodec]
  val VP9 = "VP9".asInstanceOf[VideoCodec]

  @inline def values: js.Array[VideoCodec] = js.Array(AV1, AVC_INTRA, FRAME_CAPTURE, H_264, H_265, MPEG2, PRORES, VC3, VP8, VP9)
}

/** Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable Timecode insertion when the input frame rate is identical to the output frame rate. To include timecodes in this output, set Timecode insertion (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is DISABLED. When the service inserts timecodes in an output, by default, it uses any embedded timecodes from the input. If none are present, the service will set the timecode for the first output frame to zero. To change this default behavior, adjust the settings under Timecode configuration (TimecodeConfig). In the console, these settings are located under Job > Job settings > Timecode configuration. Note - Timecode source under input settings (InputTimecodeSource) does not affect the timecodes that are inserted in the output. Source under Job settings > Timecode configuration (TimecodeSource) does.
  */
@js.native
sealed trait VideoTimecodeInsertion extends js.Any
object VideoTimecodeInsertion {
  val DISABLED = "DISABLED".asInstanceOf[VideoTimecodeInsertion]
  val PIC_TIMING_SEI = "PIC_TIMING_SEI".asInstanceOf[VideoTimecodeInsertion]

  @inline def values: js.Array[VideoTimecodeInsertion] = js.Array(DISABLED, PIC_TIMING_SEI)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
@js.native
sealed trait Vp8FramerateControl extends js.Any
object Vp8FramerateControl {
  val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[Vp8FramerateControl]
  val SPECIFIED = "SPECIFIED".asInstanceOf[Vp8FramerateControl]

  @inline def values: js.Array[Vp8FramerateControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
@js.native
sealed trait Vp8FramerateConversionAlgorithm extends js.Any
object Vp8FramerateConversionAlgorithm {
  val DUPLICATE_DROP = "DUPLICATE_DROP".asInstanceOf[Vp8FramerateConversionAlgorithm]
  val INTERPOLATE = "INTERPOLATE".asInstanceOf[Vp8FramerateConversionAlgorithm]
  val FRAMEFORMER = "FRAMEFORMER".asInstanceOf[Vp8FramerateConversionAlgorithm]

  @inline def values: js.Array[Vp8FramerateConversionAlgorithm] = js.Array(DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
  */
@js.native
sealed trait Vp8ParControl extends js.Any
object Vp8ParControl {
  val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[Vp8ParControl]
  val SPECIFIED = "SPECIFIED".asInstanceOf[Vp8ParControl]

  @inline def values: js.Array[Vp8ParControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, multi-pass encoding.
  */
@js.native
sealed trait Vp8QualityTuningLevel extends js.Any
object Vp8QualityTuningLevel {
  val MULTI_PASS = "MULTI_PASS".asInstanceOf[Vp8QualityTuningLevel]
  val MULTI_PASS_HQ = "MULTI_PASS_HQ".asInstanceOf[Vp8QualityTuningLevel]

  @inline def values: js.Array[Vp8QualityTuningLevel] = js.Array(MULTI_PASS, MULTI_PASS_HQ)
}

/** With the VP8 codec, you can use only the variable bitrate (VBR) rate control mode.
  */
@js.native
sealed trait Vp8RateControlMode extends js.Any
object Vp8RateControlMode {
  val VBR = "VBR".asInstanceOf[Vp8RateControlMode]

  @inline def values: js.Array[Vp8RateControlMode] = js.Array(VBR)
}

/** If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
  */
@js.native
sealed trait Vp9FramerateControl extends js.Any
object Vp9FramerateControl {
  val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[Vp9FramerateControl]
  val SPECIFIED = "SPECIFIED".asInstanceOf[Vp9FramerateControl]

  @inline def values: js.Array[Vp9FramerateControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
  */
@js.native
sealed trait Vp9FramerateConversionAlgorithm extends js.Any
object Vp9FramerateConversionAlgorithm {
  val DUPLICATE_DROP = "DUPLICATE_DROP".asInstanceOf[Vp9FramerateConversionAlgorithm]
  val INTERPOLATE = "INTERPOLATE".asInstanceOf[Vp9FramerateConversionAlgorithm]
  val FRAMEFORMER = "FRAMEFORMER".asInstanceOf[Vp9FramerateConversionAlgorithm]

  @inline def values: js.Array[Vp9FramerateConversionAlgorithm] = js.Array(DUPLICATE_DROP, INTERPOLATE, FRAMEFORMER)
}

/** Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
  */
@js.native
sealed trait Vp9ParControl extends js.Any
object Vp9ParControl {
  val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[Vp9ParControl]
  val SPECIFIED = "SPECIFIED".asInstanceOf[Vp9ParControl]

  @inline def values: js.Array[Vp9ParControl] = js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED)
}

/** Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, multi-pass encoding.
  */
@js.native
sealed trait Vp9QualityTuningLevel extends js.Any
object Vp9QualityTuningLevel {
  val MULTI_PASS = "MULTI_PASS".asInstanceOf[Vp9QualityTuningLevel]
  val MULTI_PASS_HQ = "MULTI_PASS_HQ".asInstanceOf[Vp9QualityTuningLevel]

  @inline def values: js.Array[Vp9QualityTuningLevel] = js.Array(MULTI_PASS, MULTI_PASS_HQ)
}

/** With the VP9 codec, you can use only the variable bitrate (VBR) rate control mode.
  */
@js.native
sealed trait Vp9RateControlMode extends js.Any
object Vp9RateControlMode {
  val VBR = "VBR".asInstanceOf[Vp9RateControlMode]

  @inline def values: js.Array[Vp9RateControlMode] = js.Array(VBR)
}

/** Optional. Ignore this setting unless Nagra support directs you to specify a value. When you don't specify a value here, the Nagra NexGuard library uses its default value.
  */
@js.native
sealed trait WatermarkingStrength extends js.Any
object WatermarkingStrength {
  val LIGHTEST = "LIGHTEST".asInstanceOf[WatermarkingStrength]
  val LIGHTER = "LIGHTER".asInstanceOf[WatermarkingStrength]
  val DEFAULT = "DEFAULT".asInstanceOf[WatermarkingStrength]
  val STRONGER = "STRONGER".asInstanceOf[WatermarkingStrength]
  val STRONGEST = "STRONGEST".asInstanceOf[WatermarkingStrength]

  @inline def values: js.Array[WatermarkingStrength] = js.Array(LIGHTEST, LIGHTER, DEFAULT, STRONGER, STRONGEST)
}

/** The service defaults to using RIFF for WAV outputs. If your output audio is likely to exceed 4 GB in file size, or if you otherwise need the extended support of the RF64 format, set your output WAV file format to RF64.
  */
@js.native
sealed trait WavFormat extends js.Any
object WavFormat {
  val RIFF = "RIFF".asInstanceOf[WavFormat]
  val RF64 = "RF64".asInstanceOf[WavFormat]

  @inline def values: js.Array[WavFormat] = js.Array(RIFF, RF64)
}

/** If your input captions format is teletext or teletext inside of STL, enable this setting to pass through style, color, and position information to your WebVTT output captions.
  */
@js.native
sealed trait WebvttStylePassthrough extends js.Any
object WebvttStylePassthrough {
  val ENABLED = "ENABLED".asInstanceOf[WebvttStylePassthrough]
  val DISABLED = "DISABLED".asInstanceOf[WebvttStylePassthrough]

  @inline def values: js.Array[WebvttStylePassthrough] = js.Array(ENABLED, DISABLED)
}
