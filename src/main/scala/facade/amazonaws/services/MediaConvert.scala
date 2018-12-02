package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object mediaconvert {
  type AacAudioDescriptionBroadcasterMix = String
  type AacCodecProfile = String
  type AacCodingMode = String
  type AacRateControlMode = String
  type AacRawFormat = String
  type AacSpecification = String
  type AacVbrQuality = String
  type Ac3BitstreamMode = String
  type Ac3CodingMode = String
  type Ac3DynamicRangeCompressionProfile = String
  type Ac3LfeFilter = String
  type Ac3MetadataControl = String
  type AfdSignaling = String
  type AntiAlias = String
  type AudioCodec = String
  type AudioDefaultSelection = String
  type AudioLanguageCodeControl = String
  type AudioNormalizationAlgorithm = String
  type AudioNormalizationAlgorithmControl = String
  type AudioNormalizationLoudnessLogging = String
  type AudioNormalizationPeakCalculation = String
  type AudioSelectorType = String
  type AudioTypeControl = String
  type BillingTagsSource = String
  type BurninSubtitleAlignment = String
  type BurninSubtitleBackgroundColor = String
  type BurninSubtitleFontColor = String
  type BurninSubtitleOutlineColor = String
  type BurninSubtitleShadowColor = String
  type BurninSubtitleTeletextSpacing = String
  type CaptionDestinationType = String
  type CaptionSourceType = String
  type CmafClientCache = String
  type CmafCodecSpecification = String
  type CmafEncryptionType = String
  type CmafInitializationVectorInManifest = String
  type CmafKeyProviderType = String
  type CmafManifestCompression = String
  type CmafManifestDurationFormat = String
  type CmafSegmentControl = String
  type CmafStreamInfResolution = String
  type CmafWriteDASHManifest = String
  type CmafWriteHLSManifest = String
  type ColorMetadata = String
  type ColorSpace = String
  type ColorSpaceConversion = String
  type ColorSpaceUsage = String
  type Commitment = String
  type ContainerType = String
  type DashIsoHbbtvCompliance = String
  type DashIsoSegmentControl = String
  type DashIsoWriteSegmentTimelineInRepresentation = String
  type DecryptionMode = String
  type DeinterlaceAlgorithm = String
  type DeinterlacerControl = String
  type DeinterlacerMode = String
  type DescribeEndpointsMode = String
  type DropFrameTimecode = String
  type DvbSubtitleAlignment = String
  type DvbSubtitleBackgroundColor = String
  type DvbSubtitleFontColor = String
  type DvbSubtitleOutlineColor = String
  type DvbSubtitleShadowColor = String
  type DvbSubtitleTeletextSpacing = String
  type Eac3AttenuationControl = String
  type Eac3BitstreamMode = String
  type Eac3CodingMode = String
  type Eac3DcFilter = String
  type Eac3DynamicRangeCompressionLine = String
  type Eac3DynamicRangeCompressionRf = String
  type Eac3LfeControl = String
  type Eac3LfeFilter = String
  type Eac3MetadataControl = String
  type Eac3PassthroughControl = String
  type Eac3PhaseControl = String
  type Eac3StereoDownmix = String
  type Eac3SurroundExMode = String
  type Eac3SurroundMode = String
  type EmbeddedConvert608To708 = String
  type F4vMoovPlacement = String
  type FileSourceConvert608To708 = String
  type H264AdaptiveQuantization = String
  type H264CodecLevel = String
  type H264CodecProfile = String
  type H264DynamicSubGop = String
  type H264EntropyEncoding = String
  type H264FieldEncoding = String
  type H264FlickerAdaptiveQuantization = String
  type H264FramerateControl = String
  type H264FramerateConversionAlgorithm = String
  type H264GopBReference = String
  type H264GopSizeUnits = String
  type H264InterlaceMode = String
  type H264ParControl = String
  type H264QualityTuningLevel = String
  type H264RateControlMode = String
  type H264RepeatPps = String
  type H264SceneChangeDetect = String
  type H264SlowPal = String
  type H264SpatialAdaptiveQuantization = String
  type H264Syntax = String
  type H264Telecine = String
  type H264TemporalAdaptiveQuantization = String
  type H264UnregisteredSeiTimecode = String
  type H265AdaptiveQuantization = String
  type H265AlternateTransferFunctionSei = String
  type H265CodecLevel = String
  type H265CodecProfile = String
  type H265DynamicSubGop = String
  type H265FlickerAdaptiveQuantization = String
  type H265FramerateControl = String
  type H265FramerateConversionAlgorithm = String
  type H265GopBReference = String
  type H265GopSizeUnits = String
  type H265InterlaceMode = String
  type H265ParControl = String
  type H265QualityTuningLevel = String
  type H265RateControlMode = String
  type H265SampleAdaptiveOffsetFilterMode = String
  type H265SceneChangeDetect = String
  type H265SlowPal = String
  type H265SpatialAdaptiveQuantization = String
  type H265Telecine = String
  type H265TemporalAdaptiveQuantization = String
  type H265TemporalIds = String
  type H265Tiles = String
  type H265UnregisteredSeiTimecode = String
  type H265WriteMp4PackagingType = String
  type HlsAdMarkers = String
  type HlsAudioTrackType = String
  type HlsCaptionLanguageSetting = String
  type HlsClientCache = String
  type HlsCodecSpecification = String
  type HlsDirectoryStructure = String
  type HlsEncryptionType = String
  type HlsIFrameOnlyManifest = String
  type HlsInitializationVectorInManifest = String
  type HlsKeyProviderType = String
  type HlsManifestCompression = String
  type HlsManifestDurationFormat = String
  type HlsOutputSelection = String
  type HlsProgramDateTime = String
  type HlsSegmentControl = String
  type HlsStreamInfResolution = String
  type HlsTimedMetadataId3Frame = String
  type InputDeblockFilter = String
  type InputDenoiseFilter = String
  type InputFilterEnable = String
  type InputPsiControl = String
  type InputTimecodeSource = String
  type JobStatus = String
  type JobTemplateListBy = String
  type LanguageCode = String
  type M2tsAudioBufferModel = String
  type M2tsBufferModel = String
  type M2tsEbpAudioInterval = String
  type M2tsEbpPlacement = String
  type M2tsEsRateInPes = String
  type M2tsNielsenId3 = String
  type M2tsPcrControl = String
  type M2tsRateMode = String
  type M2tsScte35Source = String
  type M2tsSegmentationMarkers = String
  type M2tsSegmentationStyle = String
  type M3u8NielsenId3 = String
  type M3u8PcrControl = String
  type M3u8Scte35Source = String
  type MotionImageInsertionMode = String
  type MotionImagePlayback = String
  type MovClapAtom = String
  type MovCslgAtom = String
  type MovMpeg2FourCCControl = String
  type MovPaddingControl = String
  type MovReference = String
  type Mp4CslgAtom = String
  type Mp4FreeSpaceBox = String
  type Mp4MoovPlacement = String
  type Mpeg2AdaptiveQuantization = String
  type Mpeg2CodecLevel = String
  type Mpeg2CodecProfile = String
  type Mpeg2DynamicSubGop = String
  type Mpeg2FramerateControl = String
  type Mpeg2FramerateConversionAlgorithm = String
  type Mpeg2GopSizeUnits = String
  type Mpeg2InterlaceMode = String
  type Mpeg2IntraDcPrecision = String
  type Mpeg2ParControl = String
  type Mpeg2QualityTuningLevel = String
  type Mpeg2RateControlMode = String
  type Mpeg2SceneChangeDetect = String
  type Mpeg2SlowPal = String
  type Mpeg2SpatialAdaptiveQuantization = String
  type Mpeg2Syntax = String
  type Mpeg2Telecine = String
  type Mpeg2TemporalAdaptiveQuantization = String
  type MsSmoothAudioDeduplication = String
  type MsSmoothManifestEncoding = String
  type NoiseReducerFilter = String
  type Order = String
  type OutputGroupType = String
  type OutputSdt = String
  type PresetListBy = String
  type PricingPlan = String
  type ProresCodecProfile = String
  type ProresFramerateControl = String
  type ProresFramerateConversionAlgorithm = String
  type ProresInterlaceMode = String
  type ProresParControl = String
  type ProresSlowPal = String
  type ProresTelecine = String
  type QueueListBy = String
  type QueueStatus = String
  type RenewalType = String
  type ReservationPlanStatus = String
  type RespondToAfd = String
  type ScalingBehavior = String
  type SccDestinationFramerate = String
  type TimecodeBurninPosition = String
  type TimecodeSource = String
  type TimedMetadata = String
  type TtmlStylePassthrough = String
  type Type = String
  type VideoCodec = String
  type VideoTimecodeInsertion = String
  type WavFormat = String
  type __doubleMin0 = Double
  type __doubleMin0Max2147483647 = Double
  type __doubleMinNegative59Max0 = Double
  type __doubleMinNegative60Max3 = Double
  type __doubleMinNegative60MaxNegative1 = Double
  type __integer = Int
  type __integerMin0Max10 = Int
  type __integerMin0Max100 = Int
  type __integerMin0Max1000 = Int
  type __integerMin0Max10000 = Int
  type __integerMin0Max1152000000 = Int
  type __integerMin0Max128 = Int
  type __integerMin0Max1466400000 = Int
  type __integerMin0Max15 = Int
  type __integerMin0Max16 = Int
  type __integerMin0Max2147483647 = Int
  type __integerMin0Max255 = Int
  type __integerMin0Max3 = Int
  type __integerMin0Max30 = Int
  type __integerMin0Max3600 = Int
  type __integerMin0Max47185920 = Int
  type __integerMin0Max500 = Int
  type __integerMin0Max50000 = Int
  type __integerMin0Max65535 = Int
  type __integerMin0Max7 = Int
  type __integerMin0Max8 = Int
  type __integerMin0Max9 = Int
  type __integerMin0Max96 = Int
  type __integerMin0Max99 = Int
  type __integerMin1000Max1152000000 = Int
  type __integerMin1000Max1466400000 = Int
  type __integerMin1000Max288000000 = Int
  type __integerMin1000Max30000 = Int
  type __integerMin1000Max300000000 = Int
  type __integerMin10Max48 = Int
  type __integerMin16Max24 = Int
  type __integerMin1Max1 = Int
  type __integerMin1Max10 = Int
  type __integerMin1Max100 = Int
  type __integerMin1Max10000000 = Int
  type __integerMin1Max1001 = Int
  type __integerMin1Max16 = Int
  type __integerMin1Max17895697 = Int
  type __integerMin1Max2 = Int
  type __integerMin1Max20 = Int
  type __integerMin1Max2147483640 = Int
  type __integerMin1Max2147483647 = Int
  type __integerMin1Max31 = Int
  type __integerMin1Max32 = Int
  type __integerMin1Max4 = Int
  type __integerMin1Max6 = Int
  type __integerMin1Max8 = Int
  type __integerMin24Max60000 = Int
  type __integerMin25Max10000 = Int
  type __integerMin25Max2000 = Int
  type __integerMin2Max2147483647 = Int
  type __integerMin32000Max384000 = Int
  type __integerMin32000Max48000 = Int
  type __integerMin32Max2160 = Int
  type __integerMin32Max4096 = Int
  type __integerMin32Max8182 = Int
  type __integerMin48000Max48000 = Int
  type __integerMin6000Max1024000 = Int
  type __integerMin64000Max640000 = Int
  type __integerMin8000Max192000 = Int
  type __integerMin8000Max96000 = Int
  type __integerMin96Max600 = Int
  type __integerMinNegative1000Max1000 = Int
  type __integerMinNegative180Max180 = Int
  type __integerMinNegative2147483648Max2147483647 = Int
  type __integerMinNegative2Max3 = Int
  type __integerMinNegative5Max5 = Int
  type __integerMinNegative60Max6 = Int
  type __integerMinNegative70Max0 = Int
  type __listOfAudioDescription = js.Array[AudioDescription]
  type __listOfCaptionDescription = js.Array[CaptionDescription]
  type __listOfCaptionDescriptionPreset = js.Array[CaptionDescriptionPreset]
  type __listOfEndpoint = js.Array[Endpoint]
  type __listOfHlsAdMarkers = js.Array[HlsAdMarkers]
  type __listOfHlsCaptionLanguageMapping = js.Array[HlsCaptionLanguageMapping]
  type __listOfId3Insertion = js.Array[Id3Insertion]
  type __listOfInput = js.Array[Input]
  type __listOfInputClipping = js.Array[InputClipping]
  type __listOfInputTemplate = js.Array[InputTemplate]
  type __listOfInsertableImage = js.Array[InsertableImage]
  type __listOfJob = js.Array[Job]
  type __listOfJobTemplate = js.Array[JobTemplate]
  type __listOfOutput = js.Array[Output]
  type __listOfOutputChannelMapping = js.Array[OutputChannelMapping]
  type __listOfOutputDetail = js.Array[OutputDetail]
  type __listOfOutputGroup = js.Array[OutputGroup]
  type __listOfOutputGroupDetail = js.Array[OutputGroupDetail]
  type __listOfPreset = js.Array[Preset]
  type __listOfQueue = js.Array[Queue]
  type __listOf__integerMin1Max2147483647 = js.Array[__integerMin1Max2147483647]
  type __listOf__integerMin32Max8182 = js.Array[__integerMin32Max8182]
  type __listOf__integerMinNegative60Max6 = js.Array[__integerMinNegative60Max6]
  type __listOf__string = js.Array[__string]
  type __listOf__stringMin1 = js.Array[__stringMin1]
  type __listOf__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12 = js.Array[__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12]
  type __mapOfAudioSelector = js.Dictionary[AudioSelector]
  type __mapOfAudioSelectorGroup = js.Dictionary[AudioSelectorGroup]
  type __mapOfCaptionSelector = js.Dictionary[CaptionSelector]
  type __mapOf__string = js.Dictionary[__string]
  type __string = String
  type __stringMin0 = String
  type __stringMin1 = String
  type __stringMin11Max11Pattern01D20305D205D = String
  type __stringMin14Max1285PatternS3Mov09Png = String
  type __stringMin14PatternS3BmpBMPPngPNG = String
  type __stringMin14PatternS3BmpBMPPngPNGTgaTGA = String
  type __stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTSmiSMI = String
  type __stringMin16Max24PatternAZaZ0922AZaZ0916 = String
  type __stringMin1Max256 = String
  type __stringMin24Max512PatternAZaZ0902 = String
  type __stringMin32Max32Pattern09aFAF32 = String
  type __stringMin3Max3Pattern1809aFAF09aEAE = String
  type __stringMin3Max3PatternAZaZ3 = String
  type __stringMin9Max19PatternAZ26EastWestCentralNorthSouthEastWest1912 = String
  type __stringPattern = String
  type __stringPattern010920405090509092 = String
  type __stringPattern01D20305D205D = String
  type __stringPattern0940191020191209301 = String
  type __stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12 = String
  type __stringPatternAZaZ0902 = String
  type __stringPatternAZaZ0932 = String
  type __stringPatternArnAwsAcm = String
  type __stringPatternDD = String
  type __stringPatternHttps = String
  type __stringPatternIdentityAZaZ26AZaZ09163 = String
  type __stringPatternS3 = String
  type __stringPatternS3MM2VVMMPPEEGGAAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MM = String
  type __stringPatternS3MM2VVMMPPEEGGAAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEE = String
  type __stringPatternWS = String
  type __timestampUnix = js.Date
}

package mediaconvert {
  @js.native
  @JSImport("aws-sdk", "MediaConvert")
  class MediaConvert(config: AWSConfig) extends js.Object {
    def associateCertificate(params: AssociateCertificateRequest): Request[AssociateCertificateResponse] = js.native
    def cancelJob(params: CancelJobRequest): Request[CancelJobResponse] = js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResponse] = js.native
    def createJobTemplate(params: CreateJobTemplateRequest): Request[CreateJobTemplateResponse] = js.native
    def createPreset(params: CreatePresetRequest): Request[CreatePresetResponse] = js.native
    def createQueue(params: CreateQueueRequest): Request[CreateQueueResponse] = js.native
    def deleteJobTemplate(params: DeleteJobTemplateRequest): Request[DeleteJobTemplateResponse] = js.native
    def deletePreset(params: DeletePresetRequest): Request[DeletePresetResponse] = js.native
    def deleteQueue(params: DeleteQueueRequest): Request[DeleteQueueResponse] = js.native
    def describeEndpoints(params: DescribeEndpointsRequest): Request[DescribeEndpointsResponse] = js.native
    def disassociateCertificate(params: DisassociateCertificateRequest): Request[DisassociateCertificateResponse] = js.native
    def getJob(params: GetJobRequest): Request[GetJobResponse] = js.native
    def getJobTemplate(params: GetJobTemplateRequest): Request[GetJobTemplateResponse] = js.native
    def getPreset(params: GetPresetRequest): Request[GetPresetResponse] = js.native
    def getQueue(params: GetQueueRequest): Request[GetQueueResponse] = js.native
    def listJobTemplates(params: ListJobTemplatesRequest): Request[ListJobTemplatesResponse] = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResponse] = js.native
    def listPresets(params: ListPresetsRequest): Request[ListPresetsResponse] = js.native
    def listQueues(params: ListQueuesRequest): Request[ListQueuesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateJobTemplate(params: UpdateJobTemplateRequest): Request[UpdateJobTemplateResponse] = js.native
    def updatePreset(params: UpdatePresetRequest): Request[UpdatePresetResponse] = js.native
    def updateQueue(params: UpdateQueueRequest): Request[UpdateQueueResponse] = js.native
  }

  /**
   * Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio + audio description (AD) as a stereo pair. The value for AudioType will be set to 3, which signals to downstream systems that this stream contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does not perform the mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any values you provide in AudioType and  FollowInputAudioType. Choose NORMAL when the input does not contain pre-mixed audio + audio description (AD). In this case, the encoder will use any values you provide for AudioType and FollowInputAudioType.
   */
  object AacAudioDescriptionBroadcasterMixEnum {
    val BROADCASTER_MIXED_AD = "BROADCASTER_MIXED_AD"
    val NORMAL = "NORMAL"

    val values = IndexedSeq(BROADCASTER_MIXED_AD, NORMAL)
  }

  /**
   * AAC Profile.
   */
  object AacCodecProfileEnum {
    val LC = "LC"
    val HEV1 = "HEV1"
    val HEV2 = "HEV2"

    val values = IndexedSeq(LC, HEV1, HEV2)
  }

  /**
   * Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. "1.0 - Audio Description (Receiver Mix)" setting receives a stereo description plus control track and emits a mono AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
   */
  object AacCodingModeEnum {
    val AD_RECEIVER_MIX = "AD_RECEIVER_MIX"
    val CODING_MODE_1_0 = "CODING_MODE_1_0"
    val CODING_MODE_1_1 = "CODING_MODE_1_1"
    val CODING_MODE_2_0 = "CODING_MODE_2_0"
    val CODING_MODE_5_1 = "CODING_MODE_5_1"

    val values = IndexedSeq(AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0, CODING_MODE_5_1)
  }

  /**
   * Rate Control Mode.
   */
  object AacRateControlModeEnum {
    val CBR = "CBR"
    val VBR = "VBR"

    val values = IndexedSeq(CBR, VBR)
  }

  /**
   * Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an output, you must choose "No container" for the output container.
   */
  object AacRawFormatEnum {
    val LATM_LOAS = "LATM_LOAS"
    val NONE = "NONE"

    val values = IndexedSeq(LATM_LOAS, NONE)
  }

  /**
   * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AAC. The service accepts one of two mutually exclusive groups of AAC settings--VBR and CBR. To select one of these modes, set the value of Bitrate control mode (rateControlMode) to "VBR" or "CBR".  In VBR mode, you control the audio quality with the setting VBR quality (vbrQuality). In CBR mode, you use the setting Bitrate (bitrate). Defaults and valid values depend on the rate control mode.
   */
  @js.native
  trait AacSettings extends js.Object {
    var AudioDescriptionBroadcasterMix: js.UndefOr[AacAudioDescriptionBroadcasterMix]
    var Bitrate: js.UndefOr[__integerMin6000Max1024000]
    var CodecProfile: js.UndefOr[AacCodecProfile]
    var CodingMode: js.UndefOr[AacCodingMode]
    var RateControlMode: js.UndefOr[AacRateControlMode]
    var RawFormat: js.UndefOr[AacRawFormat]
    var SampleRate: js.UndefOr[__integerMin8000Max96000]
    var Specification: js.UndefOr[AacSpecification]
    var VbrQuality: js.UndefOr[AacVbrQuality]
  }

  object AacSettings {
    def apply(
      AudioDescriptionBroadcasterMix: js.UndefOr[AacAudioDescriptionBroadcasterMix] = js.undefined,
      Bitrate: js.UndefOr[__integerMin6000Max1024000] = js.undefined,
      CodecProfile: js.UndefOr[AacCodecProfile] = js.undefined,
      CodingMode: js.UndefOr[AacCodingMode] = js.undefined,
      RateControlMode: js.UndefOr[AacRateControlMode] = js.undefined,
      RawFormat: js.UndefOr[AacRawFormat] = js.undefined,
      SampleRate: js.UndefOr[__integerMin8000Max96000] = js.undefined,
      Specification: js.UndefOr[AacSpecification] = js.undefined,
      VbrQuality: js.UndefOr[AacVbrQuality] = js.undefined): AacSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AudioDescriptionBroadcasterMix" -> AudioDescriptionBroadcasterMix.map { x => x.asInstanceOf[js.Any] },
        "Bitrate" -> Bitrate.map { x => x.asInstanceOf[js.Any] },
        "CodecProfile" -> CodecProfile.map { x => x.asInstanceOf[js.Any] },
        "CodingMode" -> CodingMode.map { x => x.asInstanceOf[js.Any] },
        "RateControlMode" -> RateControlMode.map { x => x.asInstanceOf[js.Any] },
        "RawFormat" -> RawFormat.map { x => x.asInstanceOf[js.Any] },
        "SampleRate" -> SampleRate.map { x => x.asInstanceOf[js.Any] },
        "Specification" -> Specification.map { x => x.asInstanceOf[js.Any] },
        "VbrQuality" -> VbrQuality.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AacSettings]
    }
  }

  /**
   * Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
   */
  object AacSpecificationEnum {
    val MPEG2 = "MPEG2"
    val MPEG4 = "MPEG4"

    val values = IndexedSeq(MPEG2, MPEG4)
  }

  /**
   * VBR Quality Level - Only used if rate_control_mode is VBR.
   */
  object AacVbrQualityEnum {
    val LOW = "LOW"
    val MEDIUM_LOW = "MEDIUM_LOW"
    val MEDIUM_HIGH = "MEDIUM_HIGH"
    val HIGH = "HIGH"

    val values = IndexedSeq(LOW, MEDIUM_LOW, MEDIUM_HIGH, HIGH)
  }

  /**
   * Specifies the "Bitstream Mode" (bsmod) for the emitted AC-3 stream. See ATSC A/52-2012 for background on these values.
   */
  object Ac3BitstreamModeEnum {
    val COMPLETE_MAIN = "COMPLETE_MAIN"
    val COMMENTARY = "COMMENTARY"
    val DIALOGUE = "DIALOGUE"
    val EMERGENCY = "EMERGENCY"
    val HEARING_IMPAIRED = "HEARING_IMPAIRED"
    val MUSIC_AND_EFFECTS = "MUSIC_AND_EFFECTS"
    val VISUALLY_IMPAIRED = "VISUALLY_IMPAIRED"
    val VOICE_OVER = "VOICE_OVER"

    val values = IndexedSeq(COMPLETE_MAIN, COMMENTARY, DIALOGUE, EMERGENCY, HEARING_IMPAIRED, MUSIC_AND_EFFECTS, VISUALLY_IMPAIRED, VOICE_OVER)
  }

  /**
   * Dolby Digital coding mode. Determines number of channels.
   */
  object Ac3CodingModeEnum {
    val CODING_MODE_1_0 = "CODING_MODE_1_0"
    val CODING_MODE_1_1 = "CODING_MODE_1_1"
    val CODING_MODE_2_0 = "CODING_MODE_2_0"
    val CODING_MODE_3_2_LFE = "CODING_MODE_3_2_LFE"

    val values = IndexedSeq(CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0, CODING_MODE_3_2_LFE)
  }

  /**
   * If set to FILM_STANDARD, adds dynamic range compression signaling to the output bitstream as defined in the Dolby Digital specification.
   */
  object Ac3DynamicRangeCompressionProfileEnum {
    val FILM_STANDARD = "FILM_STANDARD"
    val NONE = "NONE"

    val values = IndexedSeq(FILM_STANDARD, NONE)
  }

  /**
   * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
   */
  object Ac3LfeFilterEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  /**
   * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
   */
  object Ac3MetadataControlEnum {
    val FOLLOW_INPUT = "FOLLOW_INPUT"
    val USE_CONFIGURED = "USE_CONFIGURED"

    val values = IndexedSeq(FOLLOW_INPUT, USE_CONFIGURED)
  }

  /**
   * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AC3.
   */
  @js.native
  trait Ac3Settings extends js.Object {
    var Bitrate: js.UndefOr[__integerMin64000Max640000]
    var BitstreamMode: js.UndefOr[Ac3BitstreamMode]
    var CodingMode: js.UndefOr[Ac3CodingMode]
    var Dialnorm: js.UndefOr[__integerMin1Max31]
    var DynamicRangeCompressionProfile: js.UndefOr[Ac3DynamicRangeCompressionProfile]
    var LfeFilter: js.UndefOr[Ac3LfeFilter]
    var MetadataControl: js.UndefOr[Ac3MetadataControl]
    var SampleRate: js.UndefOr[__integerMin48000Max48000]
  }

  object Ac3Settings {
    def apply(
      Bitrate: js.UndefOr[__integerMin64000Max640000] = js.undefined,
      BitstreamMode: js.UndefOr[Ac3BitstreamMode] = js.undefined,
      CodingMode: js.UndefOr[Ac3CodingMode] = js.undefined,
      Dialnorm: js.UndefOr[__integerMin1Max31] = js.undefined,
      DynamicRangeCompressionProfile: js.UndefOr[Ac3DynamicRangeCompressionProfile] = js.undefined,
      LfeFilter: js.UndefOr[Ac3LfeFilter] = js.undefined,
      MetadataControl: js.UndefOr[Ac3MetadataControl] = js.undefined,
      SampleRate: js.UndefOr[__integerMin48000Max48000] = js.undefined): Ac3Settings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bitrate" -> Bitrate.map { x => x.asInstanceOf[js.Any] },
        "BitstreamMode" -> BitstreamMode.map { x => x.asInstanceOf[js.Any] },
        "CodingMode" -> CodingMode.map { x => x.asInstanceOf[js.Any] },
        "Dialnorm" -> Dialnorm.map { x => x.asInstanceOf[js.Any] },
        "DynamicRangeCompressionProfile" -> DynamicRangeCompressionProfile.map { x => x.asInstanceOf[js.Any] },
        "LfeFilter" -> LfeFilter.map { x => x.asInstanceOf[js.Any] },
        "MetadataControl" -> MetadataControl.map { x => x.asInstanceOf[js.Any] },
        "SampleRate" -> SampleRate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Ac3Settings]
    }
  }

  /**
   * This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert AFD signaling  (AfdSignaling) to specify whether the service includes AFD values in the output video data  and what those values are. * Choose None to remove all AFD values from this output. * Choose Fixed to ignore input AFD values and instead encode the value specified in the job. * Choose Auto to calculate output AFD values based on the input AFD scaler data.
   */
  object AfdSignalingEnum {
    val NONE = "NONE"
    val AUTO = "AUTO"
    val FIXED = "FIXED"

    val values = IndexedSeq(NONE, AUTO, FIXED)
  }

  /**
   * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AIFF.
   */
  @js.native
  trait AiffSettings extends js.Object {
    var BitDepth: js.UndefOr[__integerMin16Max24]
    var Channels: js.UndefOr[__integerMin1Max2]
    var SampleRate: js.UndefOr[__integerMin8000Max192000]
  }

  object AiffSettings {
    def apply(
      BitDepth: js.UndefOr[__integerMin16Max24] = js.undefined,
      Channels: js.UndefOr[__integerMin1Max2] = js.undefined,
      SampleRate: js.UndefOr[__integerMin8000Max192000] = js.undefined): AiffSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BitDepth" -> BitDepth.map { x => x.asInstanceOf[js.Any] },
        "Channels" -> Channels.map { x => x.asInstanceOf[js.Any] },
        "SampleRate" -> SampleRate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AiffSettings]
    }
  }

  /**
   * Settings for ancillary captions source.
   */
  @js.native
  trait AncillarySourceSettings extends js.Object {
    var SourceAncillaryChannelNumber: js.UndefOr[__integerMin1Max4]
  }

  object AncillarySourceSettings {
    def apply(
      SourceAncillaryChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined): AncillarySourceSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceAncillaryChannelNumber" -> SourceAncillaryChannelNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AncillarySourceSettings]
    }
  }

  /**
   * Enable Anti-alias (AntiAlias) to enhance sharp edges in video output when your input resolution is much larger than your output resolution. Default is enabled.
   */
  object AntiAliasEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  @js.native
  trait AssociateCertificateRequest extends js.Object {
    var Arn: __string
  }

  object AssociateCertificateRequest {
    def apply(
      Arn: __string): AssociateCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateCertificateRequest]
    }
  }

  @js.native
  trait AssociateCertificateResponse extends js.Object {

  }

  object AssociateCertificateResponse {
    def apply(): AssociateCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateCertificateResponse]
    }
  }

  /**
   * Type of Audio codec.
   */
  object AudioCodecEnum {
    val AAC = "AAC"
    val MP2 = "MP2"
    val WAV = "WAV"
    val AIFF = "AIFF"
    val AC3 = "AC3"
    val EAC3 = "EAC3"
    val PASSTHROUGH = "PASSTHROUGH"

    val values = IndexedSeq(AAC, MP2, WAV, AIFF, AC3, EAC3, PASSTHROUGH)
  }

  /**
   * Audio codec settings (CodecSettings) under (AudioDescriptions) contains the group of settings related to audio encoding. The settings in this group vary depending on the value you choose for Audio codec (Codec). For each codec enum you choose, define the corresponding settings object. The following lists the codec enum, settings object pairs. * AAC, AacSettings * MP2, Mp2Settings * WAV, WavSettings * AIFF, AiffSettings * AC3, Ac3Settings * EAC3, Eac3Settings
   */
  @js.native
  trait AudioCodecSettings extends js.Object {
    var AacSettings: js.UndefOr[AacSettings]
    var Ac3Settings: js.UndefOr[Ac3Settings]
    var AiffSettings: js.UndefOr[AiffSettings]
    var Codec: js.UndefOr[AudioCodec]
    var Eac3Settings: js.UndefOr[Eac3Settings]
    var Mp2Settings: js.UndefOr[Mp2Settings]
    var WavSettings: js.UndefOr[WavSettings]
  }

  object AudioCodecSettings {
    def apply(
      AacSettings: js.UndefOr[AacSettings] = js.undefined,
      Ac3Settings: js.UndefOr[Ac3Settings] = js.undefined,
      AiffSettings: js.UndefOr[AiffSettings] = js.undefined,
      Codec: js.UndefOr[AudioCodec] = js.undefined,
      Eac3Settings: js.UndefOr[Eac3Settings] = js.undefined,
      Mp2Settings: js.UndefOr[Mp2Settings] = js.undefined,
      WavSettings: js.UndefOr[WavSettings] = js.undefined): AudioCodecSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AacSettings" -> AacSettings.map { x => x.asInstanceOf[js.Any] },
        "Ac3Settings" -> Ac3Settings.map { x => x.asInstanceOf[js.Any] },
        "AiffSettings" -> AiffSettings.map { x => x.asInstanceOf[js.Any] },
        "Codec" -> Codec.map { x => x.asInstanceOf[js.Any] },
        "Eac3Settings" -> Eac3Settings.map { x => x.asInstanceOf[js.Any] },
        "Mp2Settings" -> Mp2Settings.map { x => x.asInstanceOf[js.Any] },
        "WavSettings" -> WavSettings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AudioCodecSettings]
    }
  }

  /**
   * Enable this setting on one audio selector to set it as the default for the job. The service uses this default for outputs where it can't find the specified input audio. If you don't set a default, those outputs have no audio.
   */
  object AudioDefaultSelectionEnum {
    val DEFAULT = "DEFAULT"
    val NOT_DEFAULT = "NOT_DEFAULT"

    val values = IndexedSeq(DEFAULT, NOT_DEFAULT)
  }

  /**
   * Description of audio output
   */
  @js.native
  trait AudioDescription extends js.Object {
    var AudioNormalizationSettings: js.UndefOr[AudioNormalizationSettings]
    var AudioSourceName: js.UndefOr[__string]
    var AudioType: js.UndefOr[__integerMin0Max255]
    var AudioTypeControl: js.UndefOr[AudioTypeControl]
    var CodecSettings: js.UndefOr[AudioCodecSettings]
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LanguageCodeControl: js.UndefOr[AudioLanguageCodeControl]
    var RemixSettings: js.UndefOr[RemixSettings]
    var StreamName: js.UndefOr[__stringPatternWS]
  }

  object AudioDescription {
    def apply(
      AudioNormalizationSettings: js.UndefOr[AudioNormalizationSettings] = js.undefined,
      AudioSourceName: js.UndefOr[__string] = js.undefined,
      AudioType: js.UndefOr[__integerMin0Max255] = js.undefined,
      AudioTypeControl: js.UndefOr[AudioTypeControl] = js.undefined,
      CodecSettings: js.UndefOr[AudioCodecSettings] = js.undefined,
      CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      LanguageCodeControl: js.UndefOr[AudioLanguageCodeControl] = js.undefined,
      RemixSettings: js.UndefOr[RemixSettings] = js.undefined,
      StreamName: js.UndefOr[__stringPatternWS] = js.undefined): AudioDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AudioNormalizationSettings" -> AudioNormalizationSettings.map { x => x.asInstanceOf[js.Any] },
        "AudioSourceName" -> AudioSourceName.map { x => x.asInstanceOf[js.Any] },
        "AudioType" -> AudioType.map { x => x.asInstanceOf[js.Any] },
        "AudioTypeControl" -> AudioTypeControl.map { x => x.asInstanceOf[js.Any] },
        "CodecSettings" -> CodecSettings.map { x => x.asInstanceOf[js.Any] },
        "CustomLanguageCode" -> CustomLanguageCode.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "LanguageCodeControl" -> LanguageCodeControl.map { x => x.asInstanceOf[js.Any] },
        "RemixSettings" -> RemixSettings.map { x => x.asInstanceOf[js.Any] },
        "StreamName" -> StreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AudioDescription]
    }
  }

  /**
   * Choosing FOLLOW_INPUT will cause the ISO 639 language code of the output to follow the ISO 639 language code of the input. The language specified for languageCode' will be used when USE_CONFIGURED is selected or when FOLLOW_INPUT is selected but there is no ISO 639 language code specified by the input.
   */
  object AudioLanguageCodeControlEnum {
    val FOLLOW_INPUT = "FOLLOW_INPUT"
    val USE_CONFIGURED = "USE_CONFIGURED"

    val values = IndexedSeq(FOLLOW_INPUT, USE_CONFIGURED)
  }

  /**
   * Audio normalization algorithm to use. 1770-1 conforms to the CALM Act specification, 1770-2 conforms to the EBU R-128 specification.
   */
  object AudioNormalizationAlgorithmEnum {
    val ITU_BS_1770_1 = "ITU_BS_1770_1"
    val ITU_BS_1770_2 = "ITU_BS_1770_2"

    val values = IndexedSeq(ITU_BS_1770_1, ITU_BS_1770_2)
  }

  /**
   * When enabled the output audio is corrected using the chosen algorithm. If disabled, the audio will be measured but not adjusted.
   */
  object AudioNormalizationAlgorithmControlEnum {
    val CORRECT_AUDIO = "CORRECT_AUDIO"
    val MEASURE_ONLY = "MEASURE_ONLY"

    val values = IndexedSeq(CORRECT_AUDIO, MEASURE_ONLY)
  }

  /**
   * If set to LOG, log each output's audio track loudness to a CSV file.
   */
  object AudioNormalizationLoudnessLoggingEnum {
    val LOG = "LOG"
    val DONT_LOG = "DONT_LOG"

    val values = IndexedSeq(LOG, DONT_LOG)
  }

  /**
   * If set to TRUE_PEAK, calculate and log the TruePeak for each output's audio track loudness.
   */
  object AudioNormalizationPeakCalculationEnum {
    val TRUE_PEAK = "TRUE_PEAK"
    val NONE = "NONE"

    val values = IndexedSeq(TRUE_PEAK, NONE)
  }

  /**
   * Advanced audio normalization settings.
   */
  @js.native
  trait AudioNormalizationSettings extends js.Object {
    var Algorithm: js.UndefOr[AudioNormalizationAlgorithm]
    var AlgorithmControl: js.UndefOr[AudioNormalizationAlgorithmControl]
    var CorrectionGateLevel: js.UndefOr[__integerMinNegative70Max0]
    var LoudnessLogging: js.UndefOr[AudioNormalizationLoudnessLogging]
    var PeakCalculation: js.UndefOr[AudioNormalizationPeakCalculation]
    var TargetLkfs: js.UndefOr[__doubleMinNegative59Max0]
  }

  object AudioNormalizationSettings {
    def apply(
      Algorithm: js.UndefOr[AudioNormalizationAlgorithm] = js.undefined,
      AlgorithmControl: js.UndefOr[AudioNormalizationAlgorithmControl] = js.undefined,
      CorrectionGateLevel: js.UndefOr[__integerMinNegative70Max0] = js.undefined,
      LoudnessLogging: js.UndefOr[AudioNormalizationLoudnessLogging] = js.undefined,
      PeakCalculation: js.UndefOr[AudioNormalizationPeakCalculation] = js.undefined,
      TargetLkfs: js.UndefOr[__doubleMinNegative59Max0] = js.undefined): AudioNormalizationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Algorithm" -> Algorithm.map { x => x.asInstanceOf[js.Any] },
        "AlgorithmControl" -> AlgorithmControl.map { x => x.asInstanceOf[js.Any] },
        "CorrectionGateLevel" -> CorrectionGateLevel.map { x => x.asInstanceOf[js.Any] },
        "LoudnessLogging" -> LoudnessLogging.map { x => x.asInstanceOf[js.Any] },
        "PeakCalculation" -> PeakCalculation.map { x => x.asInstanceOf[js.Any] },
        "TargetLkfs" -> TargetLkfs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AudioNormalizationSettings]
    }
  }

  /**
   * Selector for Audio
   */
  @js.native
  trait AudioSelector extends js.Object {
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3]
    var DefaultSelection: js.UndefOr[AudioDefaultSelection]
    var ExternalAudioFileInput: js.UndefOr[__stringPatternS3MM2VVMMPPEEGGAAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEE]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Offset: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var Pids: js.UndefOr[__listOf__integerMin1Max2147483647]
    var ProgramSelection: js.UndefOr[__integerMin0Max8]
    var RemixSettings: js.UndefOr[RemixSettings]
    var SelectorType: js.UndefOr[AudioSelectorType]
    var Tracks: js.UndefOr[__listOf__integerMin1Max2147483647]
  }

  object AudioSelector {
    def apply(
      CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined,
      DefaultSelection: js.UndefOr[AudioDefaultSelection] = js.undefined,
      ExternalAudioFileInput: js.UndefOr[__stringPatternS3MM2VVMMPPEEGGAAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEE] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      Offset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
      Pids: js.UndefOr[__listOf__integerMin1Max2147483647] = js.undefined,
      ProgramSelection: js.UndefOr[__integerMin0Max8] = js.undefined,
      RemixSettings: js.UndefOr[RemixSettings] = js.undefined,
      SelectorType: js.UndefOr[AudioSelectorType] = js.undefined,
      Tracks: js.UndefOr[__listOf__integerMin1Max2147483647] = js.undefined): AudioSelector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomLanguageCode" -> CustomLanguageCode.map { x => x.asInstanceOf[js.Any] },
        "DefaultSelection" -> DefaultSelection.map { x => x.asInstanceOf[js.Any] },
        "ExternalAudioFileInput" -> ExternalAudioFileInput.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "Offset" -> Offset.map { x => x.asInstanceOf[js.Any] },
        "Pids" -> Pids.map { x => x.asInstanceOf[js.Any] },
        "ProgramSelection" -> ProgramSelection.map { x => x.asInstanceOf[js.Any] },
        "RemixSettings" -> RemixSettings.map { x => x.asInstanceOf[js.Any] },
        "SelectorType" -> SelectorType.map { x => x.asInstanceOf[js.Any] },
        "Tracks" -> Tracks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AudioSelector]
    }
  }

  /**
   * Group of Audio Selectors
   */
  @js.native
  trait AudioSelectorGroup extends js.Object {
    var AudioSelectorNames: js.UndefOr[__listOf__stringMin1]
  }

  object AudioSelectorGroup {
    def apply(
      AudioSelectorNames: js.UndefOr[__listOf__stringMin1] = js.undefined): AudioSelectorGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AudioSelectorNames" -> AudioSelectorNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AudioSelectorGroup]
    }
  }

  /**
   * Specifies the type of the audio selector.
   */
  object AudioSelectorTypeEnum {
    val PID = "PID"
    val TRACK = "TRACK"
    val LANGUAGE_CODE = "LANGUAGE_CODE"

    val values = IndexedSeq(PID, TRACK, LANGUAGE_CODE)
  }

  /**
   * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise the value in Audio Type is included in the output. Note that this field and audioType are both ignored if audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
   */
  object AudioTypeControlEnum {
    val FOLLOW_INPUT = "FOLLOW_INPUT"
    val USE_CONFIGURED = "USE_CONFIGURED"

    val values = IndexedSeq(FOLLOW_INPUT, USE_CONFIGURED)
  }

  /**
   * Settings for Avail Blanking
   */
  @js.native
  trait AvailBlanking extends js.Object {
    var AvailBlankingImage: js.UndefOr[__stringMin14PatternS3BmpBMPPngPNG]
  }

  object AvailBlanking {
    def apply(
      AvailBlankingImage: js.UndefOr[__stringMin14PatternS3BmpBMPPngPNG] = js.undefined): AvailBlanking = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailBlankingImage" -> AvailBlankingImage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailBlanking]
    }
  }

  /**
   * Optional. Choose a tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs on any billing report that you set up. Any transcoding outputs that don't have an associated tag will appear in your billing report unsorted. If you don't choose a valid value for this field, your job outputs will appear on the billing report unsorted.
   */
  object BillingTagsSourceEnum {
    val QUEUE = "QUEUE"
    val PRESET = "PRESET"
    val JOB_TEMPLATE = "JOB_TEMPLATE"

    val values = IndexedSeq(QUEUE, PRESET, JOB_TEMPLATE)
  }

  /**
   * Burn-In Destination Settings.
   */
  @js.native
  trait BurninDestinationSettings extends js.Object {
    var Alignment: js.UndefOr[BurninSubtitleAlignment]
    var BackgroundColor: js.UndefOr[BurninSubtitleBackgroundColor]
    var BackgroundOpacity: js.UndefOr[__integerMin0Max255]
    var FontColor: js.UndefOr[BurninSubtitleFontColor]
    var FontOpacity: js.UndefOr[__integerMin0Max255]
    var FontResolution: js.UndefOr[__integerMin96Max600]
    var FontSize: js.UndefOr[__integerMin0Max96]
    var OutlineColor: js.UndefOr[BurninSubtitleOutlineColor]
    var OutlineSize: js.UndefOr[__integerMin0Max10]
    var ShadowColor: js.UndefOr[BurninSubtitleShadowColor]
    var ShadowOpacity: js.UndefOr[__integerMin0Max255]
    var ShadowXOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var ShadowYOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var TeletextSpacing: js.UndefOr[BurninSubtitleTeletextSpacing]
    var XPosition: js.UndefOr[__integerMin0Max2147483647]
    var YPosition: js.UndefOr[__integerMin0Max2147483647]
  }

  object BurninDestinationSettings {
    def apply(
      Alignment: js.UndefOr[BurninSubtitleAlignment] = js.undefined,
      BackgroundColor: js.UndefOr[BurninSubtitleBackgroundColor] = js.undefined,
      BackgroundOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
      FontColor: js.UndefOr[BurninSubtitleFontColor] = js.undefined,
      FontOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
      FontResolution: js.UndefOr[__integerMin96Max600] = js.undefined,
      FontSize: js.UndefOr[__integerMin0Max96] = js.undefined,
      OutlineColor: js.UndefOr[BurninSubtitleOutlineColor] = js.undefined,
      OutlineSize: js.UndefOr[__integerMin0Max10] = js.undefined,
      ShadowColor: js.UndefOr[BurninSubtitleShadowColor] = js.undefined,
      ShadowOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
      ShadowXOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
      ShadowYOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
      TeletextSpacing: js.UndefOr[BurninSubtitleTeletextSpacing] = js.undefined,
      XPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      YPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined): BurninDestinationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Alignment" -> Alignment.map { x => x.asInstanceOf[js.Any] },
        "BackgroundColor" -> BackgroundColor.map { x => x.asInstanceOf[js.Any] },
        "BackgroundOpacity" -> BackgroundOpacity.map { x => x.asInstanceOf[js.Any] },
        "FontColor" -> FontColor.map { x => x.asInstanceOf[js.Any] },
        "FontOpacity" -> FontOpacity.map { x => x.asInstanceOf[js.Any] },
        "FontResolution" -> FontResolution.map { x => x.asInstanceOf[js.Any] },
        "FontSize" -> FontSize.map { x => x.asInstanceOf[js.Any] },
        "OutlineColor" -> OutlineColor.map { x => x.asInstanceOf[js.Any] },
        "OutlineSize" -> OutlineSize.map { x => x.asInstanceOf[js.Any] },
        "ShadowColor" -> ShadowColor.map { x => x.asInstanceOf[js.Any] },
        "ShadowOpacity" -> ShadowOpacity.map { x => x.asInstanceOf[js.Any] },
        "ShadowXOffset" -> ShadowXOffset.map { x => x.asInstanceOf[js.Any] },
        "ShadowYOffset" -> ShadowYOffset.map { x => x.asInstanceOf[js.Any] },
        "TeletextSpacing" -> TeletextSpacing.map { x => x.asInstanceOf[js.Any] },
        "XPosition" -> XPosition.map { x => x.asInstanceOf[js.Any] },
        "YPosition" -> YPosition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BurninDestinationSettings]
    }
  }

  /**
   * If no explicit x_position or y_position is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
   */
  object BurninSubtitleAlignmentEnum {
    val CENTERED = "CENTERED"
    val LEFT = "LEFT"

    val values = IndexedSeq(CENTERED, LEFT)
  }

  /**
   * Specifies the color of the rectangle behind the captions.
   * All burn-in and DVB-Sub font settings must match.
   */
  object BurninSubtitleBackgroundColorEnum {
    val NONE = "NONE"
    val BLACK = "BLACK"
    val WHITE = "WHITE"

    val values = IndexedSeq(NONE, BLACK, WHITE)
  }

  /**
   * Specifies the color of the burned-in captions. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
   */
  object BurninSubtitleFontColorEnum {
    val WHITE = "WHITE"
    val BLACK = "BLACK"
    val YELLOW = "YELLOW"
    val RED = "RED"
    val GREEN = "GREEN"
    val BLUE = "BLUE"

    val values = IndexedSeq(WHITE, BLACK, YELLOW, RED, GREEN, BLUE)
  }

  /**
   * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
   */
  object BurninSubtitleOutlineColorEnum {
    val BLACK = "BLACK"
    val WHITE = "WHITE"
    val YELLOW = "YELLOW"
    val RED = "RED"
    val GREEN = "GREEN"
    val BLUE = "BLUE"

    val values = IndexedSeq(BLACK, WHITE, YELLOW, RED, GREEN, BLUE)
  }

  /**
   * Specifies the color of the shadow cast by the captions.
   * All burn-in and DVB-Sub font settings must match.
   */
  object BurninSubtitleShadowColorEnum {
    val NONE = "NONE"
    val BLACK = "BLACK"
    val WHITE = "WHITE"

    val values = IndexedSeq(NONE, BLACK, WHITE)
  }

  /**
   * Only applies to jobs with input captions in Teletext or STL formats. Specify whether the spacing between letters in your captions is set by the captions grid or varies depending on letter width. Choose fixed grid to conform to the spacing specified in the captions file more accurately. Choose proportional to make the text easier to read if the captions are closed caption.
   */
  object BurninSubtitleTeletextSpacingEnum {
    val FIXED_GRID = "FIXED_GRID"
    val PROPORTIONAL = "PROPORTIONAL"

    val values = IndexedSeq(FIXED_GRID, PROPORTIONAL)
  }

  @js.native
  trait CancelJobRequest extends js.Object {
    var Id: __string
  }

  object CancelJobRequest {
    def apply(
      Id: __string): CancelJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobRequest]
    }
  }

  @js.native
  trait CancelJobResponse extends js.Object {

  }

  object CancelJobResponse {
    def apply(): CancelJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobResponse]
    }
  }

  /**
   * Description of Caption output
   */
  @js.native
  trait CaptionDescription extends js.Object {
    var CaptionSelectorName: js.UndefOr[__stringMin1]
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3]
    var DestinationSettings: js.UndefOr[CaptionDestinationSettings]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LanguageDescription: js.UndefOr[__string]
  }

  object CaptionDescription {
    def apply(
      CaptionSelectorName: js.UndefOr[__stringMin1] = js.undefined,
      CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined,
      DestinationSettings: js.UndefOr[CaptionDestinationSettings] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      LanguageDescription: js.UndefOr[__string] = js.undefined): CaptionDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CaptionSelectorName" -> CaptionSelectorName.map { x => x.asInstanceOf[js.Any] },
        "CustomLanguageCode" -> CustomLanguageCode.map { x => x.asInstanceOf[js.Any] },
        "DestinationSettings" -> DestinationSettings.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "LanguageDescription" -> LanguageDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CaptionDescription]
    }
  }

  /**
   * Caption Description for preset
   */
  @js.native
  trait CaptionDescriptionPreset extends js.Object {
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3]
    var DestinationSettings: js.UndefOr[CaptionDestinationSettings]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LanguageDescription: js.UndefOr[__string]
  }

  object CaptionDescriptionPreset {
    def apply(
      CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined,
      DestinationSettings: js.UndefOr[CaptionDestinationSettings] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      LanguageDescription: js.UndefOr[__string] = js.undefined): CaptionDescriptionPreset = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomLanguageCode" -> CustomLanguageCode.map { x => x.asInstanceOf[js.Any] },
        "DestinationSettings" -> DestinationSettings.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "LanguageDescription" -> LanguageDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CaptionDescriptionPreset]
    }
  }

  /**
   * Specific settings required by destination type. Note that burnin_destination_settings are not available if the source of the caption data is Embedded or Teletext.
   */
  @js.native
  trait CaptionDestinationSettings extends js.Object {
    var BurninDestinationSettings: js.UndefOr[BurninDestinationSettings]
    var DestinationType: js.UndefOr[CaptionDestinationType]
    var DvbSubDestinationSettings: js.UndefOr[DvbSubDestinationSettings]
    var SccDestinationSettings: js.UndefOr[SccDestinationSettings]
    var TeletextDestinationSettings: js.UndefOr[TeletextDestinationSettings]
    var TtmlDestinationSettings: js.UndefOr[TtmlDestinationSettings]
  }

  object CaptionDestinationSettings {
    def apply(
      BurninDestinationSettings: js.UndefOr[BurninDestinationSettings] = js.undefined,
      DestinationType: js.UndefOr[CaptionDestinationType] = js.undefined,
      DvbSubDestinationSettings: js.UndefOr[DvbSubDestinationSettings] = js.undefined,
      SccDestinationSettings: js.UndefOr[SccDestinationSettings] = js.undefined,
      TeletextDestinationSettings: js.UndefOr[TeletextDestinationSettings] = js.undefined,
      TtmlDestinationSettings: js.UndefOr[TtmlDestinationSettings] = js.undefined): CaptionDestinationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BurninDestinationSettings" -> BurninDestinationSettings.map { x => x.asInstanceOf[js.Any] },
        "DestinationType" -> DestinationType.map { x => x.asInstanceOf[js.Any] },
        "DvbSubDestinationSettings" -> DvbSubDestinationSettings.map { x => x.asInstanceOf[js.Any] },
        "SccDestinationSettings" -> SccDestinationSettings.map { x => x.asInstanceOf[js.Any] },
        "TeletextDestinationSettings" -> TeletextDestinationSettings.map { x => x.asInstanceOf[js.Any] },
        "TtmlDestinationSettings" -> TtmlDestinationSettings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CaptionDestinationSettings]
    }
  }

  /**
   * Type of Caption output, including Burn-In, Embedded (with or without SCTE20), SCC, SMI, SRT, TTML, WebVTT, DVB-Sub, Teletext.
   */
  object CaptionDestinationTypeEnum {
    val BURN_IN = "BURN_IN"
    val DVB_SUB = "DVB_SUB"
    val EMBEDDED = "EMBEDDED"
    val EMBEDDED_PLUS_SCTE20 = "EMBEDDED_PLUS_SCTE20"
    val SCTE20_PLUS_EMBEDDED = "SCTE20_PLUS_EMBEDDED"
    val SCC = "SCC"
    val SRT = "SRT"
    val SMI = "SMI"
    val TELETEXT = "TELETEXT"
    val TTML = "TTML"
    val WEBVTT = "WEBVTT"

    val values = IndexedSeq(BURN_IN, DVB_SUB, EMBEDDED, EMBEDDED_PLUS_SCTE20, SCTE20_PLUS_EMBEDDED, SCC, SRT, SMI, TELETEXT, TTML, WEBVTT)
  }

  /**
   * Set up captions in your outputs by first selecting them from your input here.
   */
  @js.native
  trait CaptionSelector extends js.Object {
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3]
    var LanguageCode: js.UndefOr[LanguageCode]
    var SourceSettings: js.UndefOr[CaptionSourceSettings]
  }

  object CaptionSelector {
    def apply(
      CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      SourceSettings: js.UndefOr[CaptionSourceSettings] = js.undefined): CaptionSelector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomLanguageCode" -> CustomLanguageCode.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "SourceSettings" -> SourceSettings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CaptionSelector]
    }
  }

  /**
   * Source settings (SourceSettings) contains the group of settings for captions in the input.
   */
  @js.native
  trait CaptionSourceSettings extends js.Object {
    var AncillarySourceSettings: js.UndefOr[AncillarySourceSettings]
    var DvbSubSourceSettings: js.UndefOr[DvbSubSourceSettings]
    var EmbeddedSourceSettings: js.UndefOr[EmbeddedSourceSettings]
    var FileSourceSettings: js.UndefOr[FileSourceSettings]
    var SourceType: js.UndefOr[CaptionSourceType]
    var TeletextSourceSettings: js.UndefOr[TeletextSourceSettings]
  }

  object CaptionSourceSettings {
    def apply(
      AncillarySourceSettings: js.UndefOr[AncillarySourceSettings] = js.undefined,
      DvbSubSourceSettings: js.UndefOr[DvbSubSourceSettings] = js.undefined,
      EmbeddedSourceSettings: js.UndefOr[EmbeddedSourceSettings] = js.undefined,
      FileSourceSettings: js.UndefOr[FileSourceSettings] = js.undefined,
      SourceType: js.UndefOr[CaptionSourceType] = js.undefined,
      TeletextSourceSettings: js.UndefOr[TeletextSourceSettings] = js.undefined): CaptionSourceSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AncillarySourceSettings" -> AncillarySourceSettings.map { x => x.asInstanceOf[js.Any] },
        "DvbSubSourceSettings" -> DvbSubSourceSettings.map { x => x.asInstanceOf[js.Any] },
        "EmbeddedSourceSettings" -> EmbeddedSourceSettings.map { x => x.asInstanceOf[js.Any] },
        "FileSourceSettings" -> FileSourceSettings.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "TeletextSourceSettings" -> TeletextSourceSettings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CaptionSourceSettings]
    }
  }

  /**
   * Use Source (SourceType) to identify the format of your input captions.  The service cannot auto-detect caption format.
   */
  object CaptionSourceTypeEnum {
    val ANCILLARY = "ANCILLARY"
    val DVB_SUB = "DVB_SUB"
    val EMBEDDED = "EMBEDDED"
    val SCTE20 = "SCTE20"
    val SCC = "SCC"
    val TTML = "TTML"
    val STL = "STL"
    val SRT = "SRT"
    val SMI = "SMI"
    val TELETEXT = "TELETEXT"
    val NULL_SOURCE = "NULL_SOURCE"

    val values = IndexedSeq(ANCILLARY, DVB_SUB, EMBEDDED, SCTE20, SCC, TTML, STL, SRT, SMI, TELETEXT, NULL_SOURCE)
  }

  /**
   * Channel mapping (ChannelMapping) contains the group of fields that hold the remixing value for each channel. Units are in dB. Acceptable values are within the range from -60 (mute) through 6. A setting of 0 passes the input channel unchanged to the output channel (no attenuation or amplification).
   */
  @js.native
  trait ChannelMapping extends js.Object {
    var OutputChannels: js.UndefOr[__listOfOutputChannelMapping]
  }

  object ChannelMapping {
    def apply(
      OutputChannels: js.UndefOr[__listOfOutputChannelMapping] = js.undefined): ChannelMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OutputChannels" -> OutputChannels.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChannelMapping]
    }
  }

  /**
   * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for later replay.
   */
  object CmafClientCacheEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
   */
  object CmafCodecSpecificationEnum {
    val RFC_6381 = "RFC_6381"
    val RFC_4281 = "RFC_4281"

    val values = IndexedSeq(RFC_6381, RFC_4281)
  }

  /**
   * Settings for CMAF encryption
   */
  @js.native
  trait CmafEncryptionSettings extends js.Object {
    var ConstantInitializationVector: js.UndefOr[__stringMin32Max32Pattern09aFAF32]
    var EncryptionMethod: js.UndefOr[CmafEncryptionType]
    var InitializationVectorInManifest: js.UndefOr[CmafInitializationVectorInManifest]
    var StaticKeyProvider: js.UndefOr[StaticKeyProvider]
    var Type: js.UndefOr[CmafKeyProviderType]
  }

  object CmafEncryptionSettings {
    def apply(
      ConstantInitializationVector: js.UndefOr[__stringMin32Max32Pattern09aFAF32] = js.undefined,
      EncryptionMethod: js.UndefOr[CmafEncryptionType] = js.undefined,
      InitializationVectorInManifest: js.UndefOr[CmafInitializationVectorInManifest] = js.undefined,
      StaticKeyProvider: js.UndefOr[StaticKeyProvider] = js.undefined,
      Type: js.UndefOr[CmafKeyProviderType] = js.undefined): CmafEncryptionSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConstantInitializationVector" -> ConstantInitializationVector.map { x => x.asInstanceOf[js.Any] },
        "EncryptionMethod" -> EncryptionMethod.map { x => x.asInstanceOf[js.Any] },
        "InitializationVectorInManifest" -> InitializationVectorInManifest.map { x => x.asInstanceOf[js.Any] },
        "StaticKeyProvider" -> StaticKeyProvider.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CmafEncryptionSettings]
    }
  }

  /**
   * Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in the web interface also disables encryption.
   */
  object CmafEncryptionTypeEnum {
    val SAMPLE_AES = "SAMPLE_AES"

    val values = IndexedSeq(SAMPLE_AES)
  }

  /**
   * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to CMAF_GROUP_SETTINGS. Each output in a CMAF Output Group may only contain a single video, audio, or caption output.
   */
  @js.native
  trait CmafGroupSettings extends js.Object {
    var BaseUrl: js.UndefOr[__string]
    var ClientCache: js.UndefOr[CmafClientCache]
    var CodecSpecification: js.UndefOr[CmafCodecSpecification]
    var Destination: js.UndefOr[__stringPatternS3]
    var Encryption: js.UndefOr[CmafEncryptionSettings]
    var FragmentLength: js.UndefOr[__integerMin1Max2147483647]
    var ManifestCompression: js.UndefOr[CmafManifestCompression]
    var ManifestDurationFormat: js.UndefOr[CmafManifestDurationFormat]
    var MinBufferTime: js.UndefOr[__integerMin0Max2147483647]
    var MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647]
    var SegmentControl: js.UndefOr[CmafSegmentControl]
    var SegmentLength: js.UndefOr[__integerMin1Max2147483647]
    var StreamInfResolution: js.UndefOr[CmafStreamInfResolution]
    var WriteDashManifest: js.UndefOr[CmafWriteDASHManifest]
    var WriteHlsManifest: js.UndefOr[CmafWriteHLSManifest]
  }

  object CmafGroupSettings {
    def apply(
      BaseUrl: js.UndefOr[__string] = js.undefined,
      ClientCache: js.UndefOr[CmafClientCache] = js.undefined,
      CodecSpecification: js.UndefOr[CmafCodecSpecification] = js.undefined,
      Destination: js.UndefOr[__stringPatternS3] = js.undefined,
      Encryption: js.UndefOr[CmafEncryptionSettings] = js.undefined,
      FragmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      ManifestCompression: js.UndefOr[CmafManifestCompression] = js.undefined,
      ManifestDurationFormat: js.UndefOr[CmafManifestDurationFormat] = js.undefined,
      MinBufferTime: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647] = js.undefined,
      SegmentControl: js.UndefOr[CmafSegmentControl] = js.undefined,
      SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      StreamInfResolution: js.UndefOr[CmafStreamInfResolution] = js.undefined,
      WriteDashManifest: js.UndefOr[CmafWriteDASHManifest] = js.undefined,
      WriteHlsManifest: js.UndefOr[CmafWriteHLSManifest] = js.undefined): CmafGroupSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaseUrl" -> BaseUrl.map { x => x.asInstanceOf[js.Any] },
        "ClientCache" -> ClientCache.map { x => x.asInstanceOf[js.Any] },
        "CodecSpecification" -> CodecSpecification.map { x => x.asInstanceOf[js.Any] },
        "Destination" -> Destination.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] },
        "FragmentLength" -> FragmentLength.map { x => x.asInstanceOf[js.Any] },
        "ManifestCompression" -> ManifestCompression.map { x => x.asInstanceOf[js.Any] },
        "ManifestDurationFormat" -> ManifestDurationFormat.map { x => x.asInstanceOf[js.Any] },
        "MinBufferTime" -> MinBufferTime.map { x => x.asInstanceOf[js.Any] },
        "MinFinalSegmentLength" -> MinFinalSegmentLength.map { x => x.asInstanceOf[js.Any] },
        "SegmentControl" -> SegmentControl.map { x => x.asInstanceOf[js.Any] },
        "SegmentLength" -> SegmentLength.map { x => x.asInstanceOf[js.Any] },
        "StreamInfResolution" -> StreamInfResolution.map { x => x.asInstanceOf[js.Any] },
        "WriteDashManifest" -> WriteDashManifest.map { x => x.asInstanceOf[js.Any] },
        "WriteHlsManifest" -> WriteHlsManifest.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CmafGroupSettings]
    }
  }

  /**
   * The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If set to INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not in the manifest.
   */
  object CmafInitializationVectorInManifestEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = IndexedSeq(INCLUDE, EXCLUDE)
  }

  /**
   * Indicates which type of key provider is used for encryption.
   */
  object CmafKeyProviderTypeEnum {
    val STATIC_KEY = "STATIC_KEY"

    val values = IndexedSeq(STATIC_KEY)
  }

  /**
   * When set to GZIP, compresses HLS playlist.
   */
  object CmafManifestCompressionEnum {
    val GZIP = "GZIP"
    val NONE = "NONE"

    val values = IndexedSeq(GZIP, NONE)
  }

  /**
   * Indicates whether the output manifest should use floating point values for segment duration.
   */
  object CmafManifestDurationFormatEnum {
    val FLOATING_POINT = "FLOATING_POINT"
    val INTEGER = "INTEGER"

    val values = IndexedSeq(FLOATING_POINT, INTEGER)
  }

  /**
   * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
   */
  object CmafSegmentControlEnum {
    val SINGLE_FILE = "SINGLE_FILE"
    val SEGMENTED_FILES = "SEGMENTED_FILES"

    val values = IndexedSeq(SINGLE_FILE, SEGMENTED_FILES)
  }

  /**
   * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
   */
  object CmafStreamInfResolutionEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = IndexedSeq(INCLUDE, EXCLUDE)
  }

  /**
   * When set to ENABLED, a DASH MPD manifest will be generated for this output.
   */
  object CmafWriteDASHManifestEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * When set to ENABLED, an Apple HLS manifest will be generated for this output.
   */
  object CmafWriteHLSManifestEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Settings for color correction.
   */
  @js.native
  trait ColorCorrector extends js.Object {
    var Brightness: js.UndefOr[__integerMin1Max100]
    var ColorSpaceConversion: js.UndefOr[ColorSpaceConversion]
    var Contrast: js.UndefOr[__integerMin1Max100]
    var Hdr10Metadata: js.UndefOr[Hdr10Metadata]
    var Hue: js.UndefOr[__integerMinNegative180Max180]
    var Saturation: js.UndefOr[__integerMin1Max100]
  }

  object ColorCorrector {
    def apply(
      Brightness: js.UndefOr[__integerMin1Max100] = js.undefined,
      ColorSpaceConversion: js.UndefOr[ColorSpaceConversion] = js.undefined,
      Contrast: js.UndefOr[__integerMin1Max100] = js.undefined,
      Hdr10Metadata: js.UndefOr[Hdr10Metadata] = js.undefined,
      Hue: js.UndefOr[__integerMinNegative180Max180] = js.undefined,
      Saturation: js.UndefOr[__integerMin1Max100] = js.undefined): ColorCorrector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Brightness" -> Brightness.map { x => x.asInstanceOf[js.Any] },
        "ColorSpaceConversion" -> ColorSpaceConversion.map { x => x.asInstanceOf[js.Any] },
        "Contrast" -> Contrast.map { x => x.asInstanceOf[js.Any] },
        "Hdr10Metadata" -> Hdr10Metadata.map { x => x.asInstanceOf[js.Any] },
        "Hue" -> Hue.map { x => x.asInstanceOf[js.Any] },
        "Saturation" -> Saturation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ColorCorrector]
    }
  }

  /**
   * Enable Insert color metadata (ColorMetadata) to include color metadata in this output. This setting is enabled by default.
   */
  object ColorMetadataEnum {
    val IGNORE = "IGNORE"
    val INSERT = "INSERT"

    val values = IndexedSeq(IGNORE, INSERT)
  }

  /**
   * If your input video has accurate color space metadata, or if you don't know about color space, leave this set to the default value FOLLOW. The service will automatically detect your input color space. If your input video has metadata indicating the wrong color space, or if your input video is missing color space metadata that should be there, specify the accurate color space here. If you choose HDR10, you can also correct inaccurate color space coefficients, using the HDR master display information controls. You must also set Color space usage (ColorSpaceUsage) to FORCE for the service to use these values.
   */
  object ColorSpaceEnum {
    val FOLLOW = "FOLLOW"
    val REC_601 = "REC_601"
    val REC_709 = "REC_709"
    val HDR10 = "HDR10"
    val HLG_2020 = "HLG_2020"

    val values = IndexedSeq(FOLLOW, REC_601, REC_709, HDR10, HLG_2020)
  }

  /**
   * Determines if colorspace conversion will be performed. If set to _None_, no conversion will be performed. If _Force 601_ or _Force 709_ are selected, conversion will be performed for inputs with differing colorspaces. An input's colorspace can be specified explicitly in the "Video Selector":#inputs-video_selector if necessary.
   */
  object ColorSpaceConversionEnum {
    val NONE = "NONE"
    val FORCE_601 = "FORCE_601"
    val FORCE_709 = "FORCE_709"
    val FORCE_HDR10 = "FORCE_HDR10"
    val FORCE_HLG_2020 = "FORCE_HLG_2020"

    val values = IndexedSeq(NONE, FORCE_601, FORCE_709, FORCE_HDR10, FORCE_HLG_2020)
  }

  /**
   * There are two sources for color metadata, the input file and the job configuration (in the Color space and HDR master display informaiton settings). The Color space usage setting controls which takes precedence. FORCE: The system will use color metadata supplied by user, if any. If the user does not supply color metadata, the system will use data from the source. FALLBACK: The system will use color metadata from the source. If source has no color metadata, the system will use user-supplied color metadata values if available.
   */
  object ColorSpaceUsageEnum {
    val FORCE = "FORCE"
    val FALLBACK = "FALLBACK"

    val values = IndexedSeq(FORCE, FALLBACK)
  }

  /**
   * The length of time that you commit to when you set up a pricing plan contract for a reserved queue.
   */
  object CommitmentEnum {
    val ONE_YEAR = "ONE_YEAR"

    val values = IndexedSeq(ONE_YEAR)
  }

  /**
   * Container specific settings.
   */
  @js.native
  trait ContainerSettings extends js.Object {
    var Container: js.UndefOr[ContainerType]
    var F4vSettings: js.UndefOr[F4vSettings]
    var M2tsSettings: js.UndefOr[M2tsSettings]
    var M3u8Settings: js.UndefOr[M3u8Settings]
    var MovSettings: js.UndefOr[MovSettings]
    var Mp4Settings: js.UndefOr[Mp4Settings]
  }

  object ContainerSettings {
    def apply(
      Container: js.UndefOr[ContainerType] = js.undefined,
      F4vSettings: js.UndefOr[F4vSettings] = js.undefined,
      M2tsSettings: js.UndefOr[M2tsSettings] = js.undefined,
      M3u8Settings: js.UndefOr[M3u8Settings] = js.undefined,
      MovSettings: js.UndefOr[MovSettings] = js.undefined,
      Mp4Settings: js.UndefOr[Mp4Settings] = js.undefined): ContainerSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Container" -> Container.map { x => x.asInstanceOf[js.Any] },
        "F4vSettings" -> F4vSettings.map { x => x.asInstanceOf[js.Any] },
        "M2tsSettings" -> M2tsSettings.map { x => x.asInstanceOf[js.Any] },
        "M3u8Settings" -> M3u8Settings.map { x => x.asInstanceOf[js.Any] },
        "MovSettings" -> MovSettings.map { x => x.asInstanceOf[js.Any] },
        "Mp4Settings" -> Mp4Settings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerSettings]
    }
  }

  /**
   * Container for this output. Some containers require a container settings object. If not specified, the default object will be created.
   */
  object ContainerTypeEnum {
    val F4V = "F4V"
    val ISMV = "ISMV"
    val M2TS = "M2TS"
    val M3U8 = "M3U8"
    val CMFC = "CMFC"
    val MOV = "MOV"
    val MP4 = "MP4"
    val MPD = "MPD"
    val MXF = "MXF"
    val RAW = "RAW"

    val values = IndexedSeq(F4V, ISMV, M2TS, M3U8, CMFC, MOV, MP4, MPD, MXF, RAW)
  }

  @js.native
  trait CreateJobRequest extends js.Object {
    var Role: __string
    var Settings: JobSettings
    var BillingTagsSource: js.UndefOr[BillingTagsSource]
    var ClientRequestToken: js.UndefOr[__string]
    var JobTemplate: js.UndefOr[__string]
    var Queue: js.UndefOr[__string]
    var UserMetadata: js.UndefOr[__mapOf__string]
  }

  object CreateJobRequest {
    def apply(
      Role: __string,
      Settings: JobSettings,
      BillingTagsSource: js.UndefOr[BillingTagsSource] = js.undefined,
      ClientRequestToken: js.UndefOr[__string] = js.undefined,
      JobTemplate: js.UndefOr[__string] = js.undefined,
      Queue: js.UndefOr[__string] = js.undefined,
      UserMetadata: js.UndefOr[__mapOf__string] = js.undefined): CreateJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Role" -> Role.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any],
        "BillingTagsSource" -> BillingTagsSource.map { x => x.asInstanceOf[js.Any] },
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "JobTemplate" -> JobTemplate.map { x => x.asInstanceOf[js.Any] },
        "Queue" -> Queue.map { x => x.asInstanceOf[js.Any] },
        "UserMetadata" -> UserMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobRequest]
    }
  }

  @js.native
  trait CreateJobResponse extends js.Object {
    var Job: js.UndefOr[Job]
  }

  object CreateJobResponse {
    def apply(
      Job: js.UndefOr[Job] = js.undefined): CreateJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Job" -> Job.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobResponse]
    }
  }

  @js.native
  trait CreateJobTemplateRequest extends js.Object {
    var Name: __string
    var Settings: JobTemplateSettings
    var Category: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var Queue: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreateJobTemplateRequest {
    def apply(
      Name: __string,
      Settings: JobTemplateSettings,
      Category: js.UndefOr[__string] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      Queue: js.UndefOr[__string] = js.undefined,
      Tags: js.UndefOr[__mapOf__string] = js.undefined): CreateJobTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any],
        "Category" -> Category.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Queue" -> Queue.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobTemplateRequest]
    }
  }

  @js.native
  trait CreateJobTemplateResponse extends js.Object {
    var JobTemplate: js.UndefOr[JobTemplate]
  }

  object CreateJobTemplateResponse {
    def apply(
      JobTemplate: js.UndefOr[JobTemplate] = js.undefined): CreateJobTemplateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobTemplate" -> JobTemplate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobTemplateResponse]
    }
  }

  @js.native
  trait CreatePresetRequest extends js.Object {
    var Name: __string
    var Settings: PresetSettings
    var Category: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreatePresetRequest {
    def apply(
      Name: __string,
      Settings: PresetSettings,
      Category: js.UndefOr[__string] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      Tags: js.UndefOr[__mapOf__string] = js.undefined): CreatePresetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any],
        "Category" -> Category.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePresetRequest]
    }
  }

  @js.native
  trait CreatePresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset]
  }

  object CreatePresetResponse {
    def apply(
      Preset: js.UndefOr[Preset] = js.undefined): CreatePresetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Preset" -> Preset.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePresetResponse]
    }
  }

  @js.native
  trait CreateQueueRequest extends js.Object {
    var Name: __string
    var Description: js.UndefOr[__string]
    var PricingPlan: js.UndefOr[PricingPlan]
    var ReservationPlanSettings: js.UndefOr[ReservationPlanSettings]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreateQueueRequest {
    def apply(
      Name: __string,
      Description: js.UndefOr[__string] = js.undefined,
      PricingPlan: js.UndefOr[PricingPlan] = js.undefined,
      ReservationPlanSettings: js.UndefOr[ReservationPlanSettings] = js.undefined,
      Tags: js.UndefOr[__mapOf__string] = js.undefined): CreateQueueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "PricingPlan" -> PricingPlan.map { x => x.asInstanceOf[js.Any] },
        "ReservationPlanSettings" -> ReservationPlanSettings.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateQueueRequest]
    }
  }

  @js.native
  trait CreateQueueResponse extends js.Object {
    var Queue: js.UndefOr[Queue]
  }

  object CreateQueueResponse {
    def apply(
      Queue: js.UndefOr[Queue] = js.undefined): CreateQueueResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Queue" -> Queue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateQueueResponse]
    }
  }

  /**
   * Specifies DRM settings for DASH outputs.
   */
  @js.native
  trait DashIsoEncryptionSettings extends js.Object {
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProvider]
  }

  object DashIsoEncryptionSettings {
    def apply(
      SpekeKeyProvider: js.UndefOr[SpekeKeyProvider] = js.undefined): DashIsoEncryptionSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SpekeKeyProvider" -> SpekeKeyProvider.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DashIsoEncryptionSettings]
    }
  }

  /**
   * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to DASH_ISO_GROUP_SETTINGS.
   */
  @js.native
  trait DashIsoGroupSettings extends js.Object {
    var BaseUrl: js.UndefOr[__string]
    var Destination: js.UndefOr[__stringPatternS3]
    var Encryption: js.UndefOr[DashIsoEncryptionSettings]
    var FragmentLength: js.UndefOr[__integerMin1Max2147483647]
    var HbbtvCompliance: js.UndefOr[DashIsoHbbtvCompliance]
    var MinBufferTime: js.UndefOr[__integerMin0Max2147483647]
    var SegmentControl: js.UndefOr[DashIsoSegmentControl]
    var SegmentLength: js.UndefOr[__integerMin1Max2147483647]
    var WriteSegmentTimelineInRepresentation: js.UndefOr[DashIsoWriteSegmentTimelineInRepresentation]
  }

  object DashIsoGroupSettings {
    def apply(
      BaseUrl: js.UndefOr[__string] = js.undefined,
      Destination: js.UndefOr[__stringPatternS3] = js.undefined,
      Encryption: js.UndefOr[DashIsoEncryptionSettings] = js.undefined,
      FragmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      HbbtvCompliance: js.UndefOr[DashIsoHbbtvCompliance] = js.undefined,
      MinBufferTime: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      SegmentControl: js.UndefOr[DashIsoSegmentControl] = js.undefined,
      SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      WriteSegmentTimelineInRepresentation: js.UndefOr[DashIsoWriteSegmentTimelineInRepresentation] = js.undefined): DashIsoGroupSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BaseUrl" -> BaseUrl.map { x => x.asInstanceOf[js.Any] },
        "Destination" -> Destination.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] },
        "FragmentLength" -> FragmentLength.map { x => x.asInstanceOf[js.Any] },
        "HbbtvCompliance" -> HbbtvCompliance.map { x => x.asInstanceOf[js.Any] },
        "MinBufferTime" -> MinBufferTime.map { x => x.asInstanceOf[js.Any] },
        "SegmentControl" -> SegmentControl.map { x => x.asInstanceOf[js.Any] },
        "SegmentLength" -> SegmentLength.map { x => x.asInstanceOf[js.Any] },
        "WriteSegmentTimelineInRepresentation" -> WriteSegmentTimelineInRepresentation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DashIsoGroupSettings]
    }
  }

  /**
   * Supports HbbTV specification as indicated
   */
  object DashIsoHbbtvComplianceEnum {
    val HBBTV_1_5 = "HBBTV_1_5"
    val NONE = "NONE"

    val values = IndexedSeq(HBBTV_1_5, NONE)
  }

  /**
   * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
   */
  object DashIsoSegmentControlEnum {
    val SINGLE_FILE = "SINGLE_FILE"
    val SEGMENTED_FILES = "SEGMENTED_FILES"

    val values = IndexedSeq(SINGLE_FILE, SEGMENTED_FILES)
  }

  /**
   * When you enable Precise segment duration in manifests (writeSegmentTimelineInRepresentation), your DASH manifest shows precise segment durations. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your DASH manifest are approximate. The segment duration information appears in the duration attribute of the SegmentTemplate element.
   */
  object DashIsoWriteSegmentTimelineInRepresentationEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  /**
   * This specifies how the encrypted file needs to be decrypted.
   */
  object DecryptionModeEnum {
    val AES_CTR = "AES_CTR"
    val AES_CBC = "AES_CBC"
    val AES_GCM = "AES_GCM"

    val values = IndexedSeq(AES_CTR, AES_CBC, AES_GCM)
  }

  /**
   * Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace (DEINTERLACE) or Adaptive (ADAPTIVE). Motion adaptive interpolate (INTERPOLATE) produces sharper pictures, while blend (BLEND) produces smoother motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source file includes a ticker, such as a scrolling headline at the bottom of the frame.
   */
  object DeinterlaceAlgorithmEnum {
    val INTERPOLATE = "INTERPOLATE"
    val INTERPOLATE_TICKER = "INTERPOLATE_TICKER"
    val BLEND = "BLEND"
    val BLEND_TICKER = "BLEND_TICKER"

    val values = IndexedSeq(INTERPOLATE, INTERPOLATE_TICKER, BLEND, BLEND_TICKER)
  }

  /**
   * Settings for deinterlacer
   */
  @js.native
  trait Deinterlacer extends js.Object {
    var Algorithm: js.UndefOr[DeinterlaceAlgorithm]
    var Control: js.UndefOr[DeinterlacerControl]
    var Mode: js.UndefOr[DeinterlacerMode]
  }

  object Deinterlacer {
    def apply(
      Algorithm: js.UndefOr[DeinterlaceAlgorithm] = js.undefined,
      Control: js.UndefOr[DeinterlacerControl] = js.undefined,
      Mode: js.UndefOr[DeinterlacerMode] = js.undefined): Deinterlacer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Algorithm" -> Algorithm.map { x => x.asInstanceOf[js.Any] },
        "Control" -> Control.map { x => x.asInstanceOf[js.Any] },
        "Mode" -> Mode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Deinterlacer]
    }
  }

  /**
   * - When set to NORMAL (default), the deinterlacer does not convert frames that are tagged  in metadata as progressive. It will only convert those that are tagged as some other type. - When set to FORCE_ALL_FRAMES, the deinterlacer converts every frame to progressive - even those that are already tagged as progressive. Turn Force mode on only if there is  a good chance that the metadata has tagged frames as progressive when they are not  progressive. Do not turn on otherwise; processing frames that are already progressive  into progressive will probably result in lower quality video.
   */
  object DeinterlacerControlEnum {
    val FORCE_ALL_FRAMES = "FORCE_ALL_FRAMES"
    val NORMAL = "NORMAL"

    val values = IndexedSeq(FORCE_ALL_FRAMES, NORMAL)
  }

  /**
   * Use Deinterlacer (DeinterlaceMode) to choose how the service will do deinterlacing. Default is Deinterlace. - Deinterlace converts interlaced to progressive. - Inverse telecine converts Hard Telecine 29.97i to progressive 23.976p. - Adaptive auto-detects and converts to progressive.
   */
  object DeinterlacerModeEnum {
    val DEINTERLACE = "DEINTERLACE"
    val INVERSE_TELECINE = "INVERSE_TELECINE"
    val ADAPTIVE = "ADAPTIVE"

    val values = IndexedSeq(DEINTERLACE, INVERSE_TELECINE, ADAPTIVE)
  }

  @js.native
  trait DeleteJobTemplateRequest extends js.Object {
    var Name: __string
  }

  object DeleteJobTemplateRequest {
    def apply(
      Name: __string): DeleteJobTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteJobTemplateRequest]
    }
  }

  @js.native
  trait DeleteJobTemplateResponse extends js.Object {

  }

  object DeleteJobTemplateResponse {
    def apply(): DeleteJobTemplateResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteJobTemplateResponse]
    }
  }

  @js.native
  trait DeletePresetRequest extends js.Object {
    var Name: __string
  }

  object DeletePresetRequest {
    def apply(
      Name: __string): DeletePresetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePresetRequest]
    }
  }

  @js.native
  trait DeletePresetResponse extends js.Object {

  }

  object DeletePresetResponse {
    def apply(): DeletePresetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePresetResponse]
    }
  }

  @js.native
  trait DeleteQueueRequest extends js.Object {
    var Name: __string
  }

  object DeleteQueueRequest {
    def apply(
      Name: __string): DeleteQueueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteQueueRequest]
    }
  }

  @js.native
  trait DeleteQueueResponse extends js.Object {

  }

  object DeleteQueueResponse {
    def apply(): DeleteQueueResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteQueueResponse]
    }
  }

  /**
   * Optional field, defaults to DEFAULT. Specify DEFAULT for this operation to return your endpoints if any exist, or to create an endpoint for you and return it if one doesn't already exist. Specify GET_ONLY to return your endpoints if any exist, or an empty list if none exist.
   */
  object DescribeEndpointsModeEnum {
    val DEFAULT = "DEFAULT"
    val GET_ONLY = "GET_ONLY"

    val values = IndexedSeq(DEFAULT, GET_ONLY)
  }

  /**
   * DescribeEndpointsRequest
   */
  @js.native
  trait DescribeEndpointsRequest extends js.Object {
    var MaxResults: js.UndefOr[__integer]
    var Mode: js.UndefOr[DescribeEndpointsMode]
    var NextToken: js.UndefOr[__string]
  }

  object DescribeEndpointsRequest {
    def apply(
      MaxResults: js.UndefOr[__integer] = js.undefined,
      Mode: js.UndefOr[DescribeEndpointsMode] = js.undefined,
      NextToken: js.UndefOr[__string] = js.undefined): DescribeEndpointsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Mode" -> Mode.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointsRequest]
    }
  }

  @js.native
  trait DescribeEndpointsResponse extends js.Object {
    var Endpoints: js.UndefOr[__listOfEndpoint]
    var NextToken: js.UndefOr[__string]
  }

  object DescribeEndpointsResponse {
    def apply(
      Endpoints: js.UndefOr[__listOfEndpoint] = js.undefined,
      NextToken: js.UndefOr[__string] = js.undefined): DescribeEndpointsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Endpoints" -> Endpoints.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointsResponse]
    }
  }

  @js.native
  trait DisassociateCertificateRequest extends js.Object {
    var Arn: __string
  }

  object DisassociateCertificateRequest {
    def apply(
      Arn: __string): DisassociateCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateCertificateRequest]
    }
  }

  @js.native
  trait DisassociateCertificateResponse extends js.Object {

  }

  object DisassociateCertificateResponse {
    def apply(): DisassociateCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateCertificateResponse]
    }
  }

  /**
   * Applies only to 29.97 fps outputs. When this feature is enabled, the service will use drop-frame timecode on outputs. If it is not possible to use drop-frame timecode, the system will fall back to non-drop-frame. This setting is enabled by default when Timecode insertion (TimecodeInsertion) is enabled.
   */
  object DropFrameTimecodeEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Inserts DVB Network Information Table (NIT) at the specified table repetition interval.
   */
  @js.native
  trait DvbNitSettings extends js.Object {
    var NetworkId: js.UndefOr[__integerMin0Max65535]
    var NetworkName: js.UndefOr[__stringMin1Max256]
    var NitInterval: js.UndefOr[__integerMin25Max10000]
  }

  object DvbNitSettings {
    def apply(
      NetworkId: js.UndefOr[__integerMin0Max65535] = js.undefined,
      NetworkName: js.UndefOr[__stringMin1Max256] = js.undefined,
      NitInterval: js.UndefOr[__integerMin25Max10000] = js.undefined): DvbNitSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkId" -> NetworkId.map { x => x.asInstanceOf[js.Any] },
        "NetworkName" -> NetworkName.map { x => x.asInstanceOf[js.Any] },
        "NitInterval" -> NitInterval.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DvbNitSettings]
    }
  }

  /**
   * Inserts DVB Service Description Table (NIT) at the specified table repetition interval.
   */
  @js.native
  trait DvbSdtSettings extends js.Object {
    var OutputSdt: js.UndefOr[OutputSdt]
    var SdtInterval: js.UndefOr[__integerMin25Max2000]
    var ServiceName: js.UndefOr[__stringMin1Max256]
    var ServiceProviderName: js.UndefOr[__stringMin1Max256]
  }

  object DvbSdtSettings {
    def apply(
      OutputSdt: js.UndefOr[OutputSdt] = js.undefined,
      SdtInterval: js.UndefOr[__integerMin25Max2000] = js.undefined,
      ServiceName: js.UndefOr[__stringMin1Max256] = js.undefined,
      ServiceProviderName: js.UndefOr[__stringMin1Max256] = js.undefined): DvbSdtSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OutputSdt" -> OutputSdt.map { x => x.asInstanceOf[js.Any] },
        "SdtInterval" -> SdtInterval.map { x => x.asInstanceOf[js.Any] },
        "ServiceName" -> ServiceName.map { x => x.asInstanceOf[js.Any] },
        "ServiceProviderName" -> ServiceProviderName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DvbSdtSettings]
    }
  }

  /**
   * DVB-Sub Destination Settings
   */
  @js.native
  trait DvbSubDestinationSettings extends js.Object {
    var Alignment: js.UndefOr[DvbSubtitleAlignment]
    var BackgroundColor: js.UndefOr[DvbSubtitleBackgroundColor]
    var BackgroundOpacity: js.UndefOr[__integerMin0Max255]
    var FontColor: js.UndefOr[DvbSubtitleFontColor]
    var FontOpacity: js.UndefOr[__integerMin0Max255]
    var FontResolution: js.UndefOr[__integerMin96Max600]
    var FontSize: js.UndefOr[__integerMin0Max96]
    var OutlineColor: js.UndefOr[DvbSubtitleOutlineColor]
    var OutlineSize: js.UndefOr[__integerMin0Max10]
    var ShadowColor: js.UndefOr[DvbSubtitleShadowColor]
    var ShadowOpacity: js.UndefOr[__integerMin0Max255]
    var ShadowXOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var ShadowYOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var TeletextSpacing: js.UndefOr[DvbSubtitleTeletextSpacing]
    var XPosition: js.UndefOr[__integerMin0Max2147483647]
    var YPosition: js.UndefOr[__integerMin0Max2147483647]
  }

  object DvbSubDestinationSettings {
    def apply(
      Alignment: js.UndefOr[DvbSubtitleAlignment] = js.undefined,
      BackgroundColor: js.UndefOr[DvbSubtitleBackgroundColor] = js.undefined,
      BackgroundOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
      FontColor: js.UndefOr[DvbSubtitleFontColor] = js.undefined,
      FontOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
      FontResolution: js.UndefOr[__integerMin96Max600] = js.undefined,
      FontSize: js.UndefOr[__integerMin0Max96] = js.undefined,
      OutlineColor: js.UndefOr[DvbSubtitleOutlineColor] = js.undefined,
      OutlineSize: js.UndefOr[__integerMin0Max10] = js.undefined,
      ShadowColor: js.UndefOr[DvbSubtitleShadowColor] = js.undefined,
      ShadowOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
      ShadowXOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
      ShadowYOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
      TeletextSpacing: js.UndefOr[DvbSubtitleTeletextSpacing] = js.undefined,
      XPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      YPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined): DvbSubDestinationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Alignment" -> Alignment.map { x => x.asInstanceOf[js.Any] },
        "BackgroundColor" -> BackgroundColor.map { x => x.asInstanceOf[js.Any] },
        "BackgroundOpacity" -> BackgroundOpacity.map { x => x.asInstanceOf[js.Any] },
        "FontColor" -> FontColor.map { x => x.asInstanceOf[js.Any] },
        "FontOpacity" -> FontOpacity.map { x => x.asInstanceOf[js.Any] },
        "FontResolution" -> FontResolution.map { x => x.asInstanceOf[js.Any] },
        "FontSize" -> FontSize.map { x => x.asInstanceOf[js.Any] },
        "OutlineColor" -> OutlineColor.map { x => x.asInstanceOf[js.Any] },
        "OutlineSize" -> OutlineSize.map { x => x.asInstanceOf[js.Any] },
        "ShadowColor" -> ShadowColor.map { x => x.asInstanceOf[js.Any] },
        "ShadowOpacity" -> ShadowOpacity.map { x => x.asInstanceOf[js.Any] },
        "ShadowXOffset" -> ShadowXOffset.map { x => x.asInstanceOf[js.Any] },
        "ShadowYOffset" -> ShadowYOffset.map { x => x.asInstanceOf[js.Any] },
        "TeletextSpacing" -> TeletextSpacing.map { x => x.asInstanceOf[js.Any] },
        "XPosition" -> XPosition.map { x => x.asInstanceOf[js.Any] },
        "YPosition" -> YPosition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DvbSubDestinationSettings]
    }
  }

  /**
   * DVB Sub Source Settings
   */
  @js.native
  trait DvbSubSourceSettings extends js.Object {
    var Pid: js.UndefOr[__integerMin1Max2147483647]
  }

  object DvbSubSourceSettings {
    def apply(
      Pid: js.UndefOr[__integerMin1Max2147483647] = js.undefined): DvbSubSourceSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Pid" -> Pid.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DvbSubSourceSettings]
    }
  }

  /**
   * If no explicit x_position or y_position is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
   */
  object DvbSubtitleAlignmentEnum {
    val CENTERED = "CENTERED"
    val LEFT = "LEFT"

    val values = IndexedSeq(CENTERED, LEFT)
  }

  /**
   * Specifies the color of the rectangle behind the captions.
   * All burn-in and DVB-Sub font settings must match.
   */
  object DvbSubtitleBackgroundColorEnum {
    val NONE = "NONE"
    val BLACK = "BLACK"
    val WHITE = "WHITE"

    val values = IndexedSeq(NONE, BLACK, WHITE)
  }

  /**
   * Specifies the color of the burned-in captions. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
   */
  object DvbSubtitleFontColorEnum {
    val WHITE = "WHITE"
    val BLACK = "BLACK"
    val YELLOW = "YELLOW"
    val RED = "RED"
    val GREEN = "GREEN"
    val BLUE = "BLUE"

    val values = IndexedSeq(WHITE, BLACK, YELLOW, RED, GREEN, BLUE)
  }

  /**
   * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
   */
  object DvbSubtitleOutlineColorEnum {
    val BLACK = "BLACK"
    val WHITE = "WHITE"
    val YELLOW = "YELLOW"
    val RED = "RED"
    val GREEN = "GREEN"
    val BLUE = "BLUE"

    val values = IndexedSeq(BLACK, WHITE, YELLOW, RED, GREEN, BLUE)
  }

  /**
   * Specifies the color of the shadow cast by the captions.
   * All burn-in and DVB-Sub font settings must match.
   */
  object DvbSubtitleShadowColorEnum {
    val NONE = "NONE"
    val BLACK = "BLACK"
    val WHITE = "WHITE"

    val values = IndexedSeq(NONE, BLACK, WHITE)
  }

  /**
   * Only applies to jobs with input captions in Teletext or STL formats. Specify whether the spacing between letters in your captions is set by the captions grid or varies depending on letter width. Choose fixed grid to conform to the spacing specified in the captions file more accurately. Choose proportional to make the text easier to read if the captions are closed caption.
   */
  object DvbSubtitleTeletextSpacingEnum {
    val FIXED_GRID = "FIXED_GRID"
    val PROPORTIONAL = "PROPORTIONAL"

    val values = IndexedSeq(FIXED_GRID, PROPORTIONAL)
  }

  /**
   * Inserts DVB Time and Date Table (TDT) at the specified table repetition interval.
   */
  @js.native
  trait DvbTdtSettings extends js.Object {
    var TdtInterval: js.UndefOr[__integerMin1000Max30000]
  }

  object DvbTdtSettings {
    def apply(
      TdtInterval: js.UndefOr[__integerMin1000Max30000] = js.undefined): DvbTdtSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TdtInterval" -> TdtInterval.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DvbTdtSettings]
    }
  }

  /**
   * If set to ATTENUATE_3_DB, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode.
   */
  object Eac3AttenuationControlEnum {
    val ATTENUATE_3_DB = "ATTENUATE_3_DB"
    val NONE = "NONE"

    val values = IndexedSeq(ATTENUATE_3_DB, NONE)
  }

  /**
   * Specifies the "Bitstream Mode" (bsmod) for the emitted E-AC-3 stream. See ATSC A/52-2012 (Annex E) for background on these values.
   */
  object Eac3BitstreamModeEnum {
    val COMPLETE_MAIN = "COMPLETE_MAIN"
    val COMMENTARY = "COMMENTARY"
    val EMERGENCY = "EMERGENCY"
    val HEARING_IMPAIRED = "HEARING_IMPAIRED"
    val VISUALLY_IMPAIRED = "VISUALLY_IMPAIRED"

    val values = IndexedSeq(COMPLETE_MAIN, COMMENTARY, EMERGENCY, HEARING_IMPAIRED, VISUALLY_IMPAIRED)
  }

  /**
   * Dolby Digital Plus coding mode. Determines number of channels.
   */
  object Eac3CodingModeEnum {
    val CODING_MODE_1_0 = "CODING_MODE_1_0"
    val CODING_MODE_2_0 = "CODING_MODE_2_0"
    val CODING_MODE_3_2 = "CODING_MODE_3_2"

    val values = IndexedSeq(CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_3_2)
  }

  /**
   * Activates a DC highpass filter for all input channels.
   */
  object Eac3DcFilterEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  /**
   * Enables Dynamic Range Compression that restricts the absolute peak level for a signal.
   */
  object Eac3DynamicRangeCompressionLineEnum {
    val NONE = "NONE"
    val FILM_STANDARD = "FILM_STANDARD"
    val FILM_LIGHT = "FILM_LIGHT"
    val MUSIC_STANDARD = "MUSIC_STANDARD"
    val MUSIC_LIGHT = "MUSIC_LIGHT"
    val SPEECH = "SPEECH"

    val values = IndexedSeq(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH)
  }

  /**
   * Enables Heavy Dynamic Range Compression, ensures that the instantaneous signal peaks do not exceed specified levels.
   */
  object Eac3DynamicRangeCompressionRfEnum {
    val NONE = "NONE"
    val FILM_STANDARD = "FILM_STANDARD"
    val FILM_LIGHT = "FILM_LIGHT"
    val MUSIC_STANDARD = "MUSIC_STANDARD"
    val MUSIC_LIGHT = "MUSIC_LIGHT"
    val SPEECH = "SPEECH"

    val values = IndexedSeq(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH)
  }

  /**
   * When encoding 3/2 audio, controls whether the LFE channel is enabled
   */
  object Eac3LfeControlEnum {
    val LFE = "LFE"
    val NO_LFE = "NO_LFE"

    val values = IndexedSeq(LFE, NO_LFE)
  }

  /**
   * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
   */
  object Eac3LfeFilterEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  /**
   * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
   */
  object Eac3MetadataControlEnum {
    val FOLLOW_INPUT = "FOLLOW_INPUT"
    val USE_CONFIGURED = "USE_CONFIGURED"

    val values = IndexedSeq(FOLLOW_INPUT, USE_CONFIGURED)
  }

  /**
   * When set to WHEN_POSSIBLE, input DD+ audio will be passed through if it is present on the input. this detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a consistent DD+ output as the system alternates between passthrough and encoding.
   */
  object Eac3PassthroughControlEnum {
    val WHEN_POSSIBLE = "WHEN_POSSIBLE"
    val NO_PASSTHROUGH = "NO_PASSTHROUGH"

    val values = IndexedSeq(WHEN_POSSIBLE, NO_PASSTHROUGH)
  }

  /**
   * Controls the amount of phase-shift applied to the surround channels. Only used for 3/2 coding mode.
   */
  object Eac3PhaseControlEnum {
    val SHIFT_90_DEGREES = "SHIFT_90_DEGREES"
    val NO_SHIFT = "NO_SHIFT"

    val values = IndexedSeq(SHIFT_90_DEGREES, NO_SHIFT)
  }

  /**
   * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value EAC3.
   */
  @js.native
  trait Eac3Settings extends js.Object {
    var AttenuationControl: js.UndefOr[Eac3AttenuationControl]
    var Bitrate: js.UndefOr[__integerMin64000Max640000]
    var BitstreamMode: js.UndefOr[Eac3BitstreamMode]
    var CodingMode: js.UndefOr[Eac3CodingMode]
    var DcFilter: js.UndefOr[Eac3DcFilter]
    var Dialnorm: js.UndefOr[__integerMin1Max31]
    var DynamicRangeCompressionLine: js.UndefOr[Eac3DynamicRangeCompressionLine]
    var DynamicRangeCompressionRf: js.UndefOr[Eac3DynamicRangeCompressionRf]
    var LfeControl: js.UndefOr[Eac3LfeControl]
    var LfeFilter: js.UndefOr[Eac3LfeFilter]
    var LoRoCenterMixLevel: js.UndefOr[__doubleMinNegative60Max3]
    var LoRoSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1]
    var LtRtCenterMixLevel: js.UndefOr[__doubleMinNegative60Max3]
    var LtRtSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1]
    var MetadataControl: js.UndefOr[Eac3MetadataControl]
    var PassthroughControl: js.UndefOr[Eac3PassthroughControl]
    var PhaseControl: js.UndefOr[Eac3PhaseControl]
    var SampleRate: js.UndefOr[__integerMin48000Max48000]
    var StereoDownmix: js.UndefOr[Eac3StereoDownmix]
    var SurroundExMode: js.UndefOr[Eac3SurroundExMode]
    var SurroundMode: js.UndefOr[Eac3SurroundMode]
  }

  object Eac3Settings {
    def apply(
      AttenuationControl: js.UndefOr[Eac3AttenuationControl] = js.undefined,
      Bitrate: js.UndefOr[__integerMin64000Max640000] = js.undefined,
      BitstreamMode: js.UndefOr[Eac3BitstreamMode] = js.undefined,
      CodingMode: js.UndefOr[Eac3CodingMode] = js.undefined,
      DcFilter: js.UndefOr[Eac3DcFilter] = js.undefined,
      Dialnorm: js.UndefOr[__integerMin1Max31] = js.undefined,
      DynamicRangeCompressionLine: js.UndefOr[Eac3DynamicRangeCompressionLine] = js.undefined,
      DynamicRangeCompressionRf: js.UndefOr[Eac3DynamicRangeCompressionRf] = js.undefined,
      LfeControl: js.UndefOr[Eac3LfeControl] = js.undefined,
      LfeFilter: js.UndefOr[Eac3LfeFilter] = js.undefined,
      LoRoCenterMixLevel: js.UndefOr[__doubleMinNegative60Max3] = js.undefined,
      LoRoSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1] = js.undefined,
      LtRtCenterMixLevel: js.UndefOr[__doubleMinNegative60Max3] = js.undefined,
      LtRtSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1] = js.undefined,
      MetadataControl: js.UndefOr[Eac3MetadataControl] = js.undefined,
      PassthroughControl: js.UndefOr[Eac3PassthroughControl] = js.undefined,
      PhaseControl: js.UndefOr[Eac3PhaseControl] = js.undefined,
      SampleRate: js.UndefOr[__integerMin48000Max48000] = js.undefined,
      StereoDownmix: js.UndefOr[Eac3StereoDownmix] = js.undefined,
      SurroundExMode: js.UndefOr[Eac3SurroundExMode] = js.undefined,
      SurroundMode: js.UndefOr[Eac3SurroundMode] = js.undefined): Eac3Settings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttenuationControl" -> AttenuationControl.map { x => x.asInstanceOf[js.Any] },
        "Bitrate" -> Bitrate.map { x => x.asInstanceOf[js.Any] },
        "BitstreamMode" -> BitstreamMode.map { x => x.asInstanceOf[js.Any] },
        "CodingMode" -> CodingMode.map { x => x.asInstanceOf[js.Any] },
        "DcFilter" -> DcFilter.map { x => x.asInstanceOf[js.Any] },
        "Dialnorm" -> Dialnorm.map { x => x.asInstanceOf[js.Any] },
        "DynamicRangeCompressionLine" -> DynamicRangeCompressionLine.map { x => x.asInstanceOf[js.Any] },
        "DynamicRangeCompressionRf" -> DynamicRangeCompressionRf.map { x => x.asInstanceOf[js.Any] },
        "LfeControl" -> LfeControl.map { x => x.asInstanceOf[js.Any] },
        "LfeFilter" -> LfeFilter.map { x => x.asInstanceOf[js.Any] },
        "LoRoCenterMixLevel" -> LoRoCenterMixLevel.map { x => x.asInstanceOf[js.Any] },
        "LoRoSurroundMixLevel" -> LoRoSurroundMixLevel.map { x => x.asInstanceOf[js.Any] },
        "LtRtCenterMixLevel" -> LtRtCenterMixLevel.map { x => x.asInstanceOf[js.Any] },
        "LtRtSurroundMixLevel" -> LtRtSurroundMixLevel.map { x => x.asInstanceOf[js.Any] },
        "MetadataControl" -> MetadataControl.map { x => x.asInstanceOf[js.Any] },
        "PassthroughControl" -> PassthroughControl.map { x => x.asInstanceOf[js.Any] },
        "PhaseControl" -> PhaseControl.map { x => x.asInstanceOf[js.Any] },
        "SampleRate" -> SampleRate.map { x => x.asInstanceOf[js.Any] },
        "StereoDownmix" -> StereoDownmix.map { x => x.asInstanceOf[js.Any] },
        "SurroundExMode" -> SurroundExMode.map { x => x.asInstanceOf[js.Any] },
        "SurroundMode" -> SurroundMode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Eac3Settings]
    }
  }

  /**
   * Stereo downmix preference. Only used for 3/2 coding mode.
   */
  object Eac3StereoDownmixEnum {
    val NOT_INDICATED = "NOT_INDICATED"
    val LO_RO = "LO_RO"
    val LT_RT = "LT_RT"
    val DPL2 = "DPL2"

    val values = IndexedSeq(NOT_INDICATED, LO_RO, LT_RT, DPL2)
  }

  /**
   * When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the left and right surround channels.
   */
  object Eac3SurroundExModeEnum {
    val NOT_INDICATED = "NOT_INDICATED"
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(NOT_INDICATED, ENABLED, DISABLED)
  }

  /**
   * When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels.
   */
  object Eac3SurroundModeEnum {
    val NOT_INDICATED = "NOT_INDICATED"
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(NOT_INDICATED, ENABLED, DISABLED)
  }

  /**
   * When set to UPCONVERT, 608 data is both passed through via the "608 compatibility bytes" fields of the 708 wrapper as well as translated into 708. 708 data present in the source content will be discarded.
   */
  object EmbeddedConvert608To708Enum {
    val UPCONVERT = "UPCONVERT"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(UPCONVERT, DISABLED)
  }

  /**
   * Settings for embedded captions Source
   */
  @js.native
  trait EmbeddedSourceSettings extends js.Object {
    var Convert608To708: js.UndefOr[EmbeddedConvert608To708]
    var Source608ChannelNumber: js.UndefOr[__integerMin1Max4]
    var Source608TrackNumber: js.UndefOr[__integerMin1Max1]
  }

  object EmbeddedSourceSettings {
    def apply(
      Convert608To708: js.UndefOr[EmbeddedConvert608To708] = js.undefined,
      Source608ChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined,
      Source608TrackNumber: js.UndefOr[__integerMin1Max1] = js.undefined): EmbeddedSourceSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Convert608To708" -> Convert608To708.map { x => x.asInstanceOf[js.Any] },
        "Source608ChannelNumber" -> Source608ChannelNumber.map { x => x.asInstanceOf[js.Any] },
        "Source608TrackNumber" -> Source608TrackNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EmbeddedSourceSettings]
    }
  }

  /**
   * Describes an account-specific API endpoint.
   */
  @js.native
  trait Endpoint extends js.Object {
    var Url: js.UndefOr[__string]
  }

  object Endpoint {
    def apply(
      Url: js.UndefOr[__string] = js.undefined): Endpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Endpoint]
    }
  }

  /**
   * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
   */
  object F4vMoovPlacementEnum {
    val PROGRESSIVE_DOWNLOAD = "PROGRESSIVE_DOWNLOAD"
    val NORMAL = "NORMAL"

    val values = IndexedSeq(PROGRESSIVE_DOWNLOAD, NORMAL)
  }

  /**
   * Settings for F4v container
   */
  @js.native
  trait F4vSettings extends js.Object {
    var MoovPlacement: js.UndefOr[F4vMoovPlacement]
  }

  object F4vSettings {
    def apply(
      MoovPlacement: js.UndefOr[F4vMoovPlacement] = js.undefined): F4vSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MoovPlacement" -> MoovPlacement.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[F4vSettings]
    }
  }

  /**
   * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to FILE_GROUP_SETTINGS.
   */
  @js.native
  trait FileGroupSettings extends js.Object {
    var Destination: js.UndefOr[__stringPatternS3]
  }

  object FileGroupSettings {
    def apply(
      Destination: js.UndefOr[__stringPatternS3] = js.undefined): FileGroupSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Destination" -> Destination.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FileGroupSettings]
    }
  }

  /**
   * If set to UPCONVERT, 608 caption data is both passed through via the "608 compatibility bytes" fields of the 708 wrapper as well as translated into 708. 708 data present in the source content will be discarded.
   */
  object FileSourceConvert608To708Enum {
    val UPCONVERT = "UPCONVERT"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(UPCONVERT, DISABLED)
  }

  /**
   * Settings for File-based Captions in Source
   */
  @js.native
  trait FileSourceSettings extends js.Object {
    var Convert608To708: js.UndefOr[FileSourceConvert608To708]
    var SourceFile: js.UndefOr[__stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTSmiSMI]
    var TimeDelta: js.UndefOr[__integerMinNegative2147483648Max2147483647]
  }

  object FileSourceSettings {
    def apply(
      Convert608To708: js.UndefOr[FileSourceConvert608To708] = js.undefined,
      SourceFile: js.UndefOr[__stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTSmiSMI] = js.undefined,
      TimeDelta: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined): FileSourceSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Convert608To708" -> Convert608To708.map { x => x.asInstanceOf[js.Any] },
        "SourceFile" -> SourceFile.map { x => x.asInstanceOf[js.Any] },
        "TimeDelta" -> TimeDelta.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FileSourceSettings]
    }
  }

  /**
   * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value FRAME_CAPTURE.
   */
  @js.native
  trait FrameCaptureSettings extends js.Object {
    var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647]
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647]
    var MaxCaptures: js.UndefOr[__integerMin1Max10000000]
    var Quality: js.UndefOr[__integerMin1Max100]
  }

  object FrameCaptureSettings {
    def apply(
      FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      MaxCaptures: js.UndefOr[__integerMin1Max10000000] = js.undefined,
      Quality: js.UndefOr[__integerMin1Max100] = js.undefined): FrameCaptureSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FramerateDenominator" -> FramerateDenominator.map { x => x.asInstanceOf[js.Any] },
        "FramerateNumerator" -> FramerateNumerator.map { x => x.asInstanceOf[js.Any] },
        "MaxCaptures" -> MaxCaptures.map { x => x.asInstanceOf[js.Any] },
        "Quality" -> Quality.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FrameCaptureSettings]
    }
  }

  @js.native
  trait GetJobRequest extends js.Object {
    var Id: __string
  }

  object GetJobRequest {
    def apply(
      Id: __string): GetJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobRequest]
    }
  }

  @js.native
  trait GetJobResponse extends js.Object {
    var Job: js.UndefOr[Job]
  }

  object GetJobResponse {
    def apply(
      Job: js.UndefOr[Job] = js.undefined): GetJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Job" -> Job.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobResponse]
    }
  }

  @js.native
  trait GetJobTemplateRequest extends js.Object {
    var Name: __string
  }

  object GetJobTemplateRequest {
    def apply(
      Name: __string): GetJobTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobTemplateRequest]
    }
  }

  @js.native
  trait GetJobTemplateResponse extends js.Object {
    var JobTemplate: js.UndefOr[JobTemplate]
  }

  object GetJobTemplateResponse {
    def apply(
      JobTemplate: js.UndefOr[JobTemplate] = js.undefined): GetJobTemplateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobTemplate" -> JobTemplate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobTemplateResponse]
    }
  }

  @js.native
  trait GetPresetRequest extends js.Object {
    var Name: __string
  }

  object GetPresetRequest {
    def apply(
      Name: __string): GetPresetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPresetRequest]
    }
  }

  @js.native
  trait GetPresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset]
  }

  object GetPresetResponse {
    def apply(
      Preset: js.UndefOr[Preset] = js.undefined): GetPresetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Preset" -> Preset.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPresetResponse]
    }
  }

  @js.native
  trait GetQueueRequest extends js.Object {
    var Name: __string
  }

  object GetQueueRequest {
    def apply(
      Name: __string): GetQueueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueueRequest]
    }
  }

  @js.native
  trait GetQueueResponse extends js.Object {
    var Queue: js.UndefOr[Queue]
  }

  object GetQueueResponse {
    def apply(
      Queue: js.UndefOr[Queue] = js.undefined): GetQueueResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Queue" -> Queue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueueResponse]
    }
  }

  /**
   * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
   */
  object H264AdaptiveQuantizationEnum {
    val OFF = "OFF"
    val LOW = "LOW"
    val MEDIUM = "MEDIUM"
    val HIGH = "HIGH"
    val HIGHER = "HIGHER"
    val MAX = "MAX"

    val values = IndexedSeq(OFF, LOW, MEDIUM, HIGH, HIGHER, MAX)
  }

  /**
   * H.264 Level.
   */
  object H264CodecLevelEnum {
    val AUTO = "AUTO"
    val LEVEL_1 = "LEVEL_1"
    val LEVEL_1_1 = "LEVEL_1_1"
    val LEVEL_1_2 = "LEVEL_1_2"
    val LEVEL_1_3 = "LEVEL_1_3"
    val LEVEL_2 = "LEVEL_2"
    val LEVEL_2_1 = "LEVEL_2_1"
    val LEVEL_2_2 = "LEVEL_2_2"
    val LEVEL_3 = "LEVEL_3"
    val LEVEL_3_1 = "LEVEL_3_1"
    val LEVEL_3_2 = "LEVEL_3_2"
    val LEVEL_4 = "LEVEL_4"
    val LEVEL_4_1 = "LEVEL_4_1"
    val LEVEL_4_2 = "LEVEL_4_2"
    val LEVEL_5 = "LEVEL_5"
    val LEVEL_5_1 = "LEVEL_5_1"
    val LEVEL_5_2 = "LEVEL_5_2"

    val values = IndexedSeq(AUTO, LEVEL_1, LEVEL_1_1, LEVEL_1_2, LEVEL_1_3, LEVEL_2, LEVEL_2_1, LEVEL_2_2, LEVEL_3, LEVEL_3_1, LEVEL_3_2, LEVEL_4, LEVEL_4_1, LEVEL_4_2, LEVEL_5, LEVEL_5_1, LEVEL_5_2)
  }

  /**
   * H.264 Profile. High 4:2:2 and 10-bit profiles are only available with the AVC-I License.
   */
  object H264CodecProfileEnum {
    val BASELINE = "BASELINE"
    val HIGH = "HIGH"
    val HIGH_10BIT = "HIGH_10BIT"
    val HIGH_422 = "HIGH_422"
    val HIGH_422_10BIT = "HIGH_422_10BIT"
    val MAIN = "MAIN"

    val values = IndexedSeq(BASELINE, HIGH, HIGH_10BIT, HIGH_422, HIGH_422_10BIT, MAIN)
  }

  /**
   * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
   */
  object H264DynamicSubGopEnum {
    val ADAPTIVE = "ADAPTIVE"
    val STATIC = "STATIC"

    val values = IndexedSeq(ADAPTIVE, STATIC)
  }

  /**
   * Entropy encoding mode. Use CABAC (must be in Main or High profile) or CAVLC.
   */
  object H264EntropyEncodingEnum {
    val CABAC = "CABAC"
    val CAVLC = "CAVLC"

    val values = IndexedSeq(CABAC, CAVLC)
  }

  /**
   * Choosing FORCE_FIELD disables PAFF encoding for interlaced outputs.
   */
  object H264FieldEncodingEnum {
    val PAFF = "PAFF"
    val FORCE_FIELD = "FORCE_FIELD"

    val values = IndexedSeq(PAFF, FORCE_FIELD)
  }

  /**
   * Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
   */
  object H264FlickerAdaptiveQuantizationEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * If you are using the console, use the Framerate setting to specify the framerate for this output. If you want to keep the same framerate as the input video, choose Follow source. If you want to do framerate conversion, choose a framerate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your framerate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the framerate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the framerate from the input. Choose SPECIFIED if you want the service to use the framerate you specify in the settings FramerateNumerator and FramerateDenominator.
   */
  object H264FramerateControlEnum {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE"
    val SPECIFIED = "SPECIFIED"

    val values = IndexedSeq(INITIALIZE_FROM_SOURCE, SPECIFIED)
  }

  /**
   * When set to INTERPOLATE, produces smoother motion during framerate conversion.
   */
  object H264FramerateConversionAlgorithmEnum {
    val DUPLICATE_DROP = "DUPLICATE_DROP"
    val INTERPOLATE = "INTERPOLATE"

    val values = IndexedSeq(DUPLICATE_DROP, INTERPOLATE)
  }

  /**
   * If enable, use reference B frames for GOP structures that have B frames > 1.
   */
  object H264GopBReferenceEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Indicates if the GOP Size in H264 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
   */
  object H264GopSizeUnitsEnum {
    val FRAMES = "FRAMES"
    val SECONDS = "SECONDS"

    val values = IndexedSeq(FRAMES, SECONDS)
  }

  /**
   * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type, as follows.
   * - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
   * - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
   */
  object H264InterlaceModeEnum {
    val PROGRESSIVE = "PROGRESSIVE"
    val TOP_FIELD = "TOP_FIELD"
    val BOTTOM_FIELD = "BOTTOM_FIELD"
    val FOLLOW_TOP_FIELD = "FOLLOW_TOP_FIELD"
    val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD"

    val values = IndexedSeq(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD)
  }

  /**
   * Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the input. Using the console, do this by choosing Follow source for Pixel aspect ratio.
   */
  object H264ParControlEnum {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE"
    val SPECIFIED = "SPECIFIED"

    val values = IndexedSeq(INITIALIZE_FROM_SOURCE, SPECIFIED)
  }

  /**
   * Use Quality tuning level (H264QualityTuningLevel) to specifiy whether to use fast single-pass, high-quality singlepass, or high-quality multipass video encoding.
   */
  object H264QualityTuningLevelEnum {
    val SINGLE_PASS = "SINGLE_PASS"
    val SINGLE_PASS_HQ = "SINGLE_PASS_HQ"
    val MULTI_PASS_HQ = "MULTI_PASS_HQ"

    val values = IndexedSeq(SINGLE_PASS, SINGLE_PASS_HQ, MULTI_PASS_HQ)
  }

  /**
   * Settings for quality-defined variable bitrate encoding with the H.264 codec. Required when you set Rate control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control mode.
   */
  @js.native
  trait H264QvbrSettings extends js.Object {
    var MaxAverageBitrate: js.UndefOr[__integerMin1000Max1152000000]
    var QvbrQualityLevel: js.UndefOr[__integerMin1Max10]
  }

  object H264QvbrSettings {
    def apply(
      MaxAverageBitrate: js.UndefOr[__integerMin1000Max1152000000] = js.undefined,
      QvbrQualityLevel: js.UndefOr[__integerMin1Max10] = js.undefined): H264QvbrSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxAverageBitrate" -> MaxAverageBitrate.map { x => x.asInstanceOf[js.Any] },
        "QvbrQualityLevel" -> QvbrQualityLevel.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[H264QvbrSettings]
    }
  }

  /**
   * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
   */
  object H264RateControlModeEnum {
    val VBR = "VBR"
    val CBR = "CBR"
    val QVBR = "QVBR"

    val values = IndexedSeq(VBR, CBR, QVBR)
  }

  /**
   * Places a PPS header on each encoded picture, even if repeated.
   */
  object H264RepeatPpsEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Scene change detection (inserts I-frames on scene changes).
   */
  object H264SceneChangeDetectEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value H_264.
   */
  @js.native
  trait H264Settings extends js.Object {
    var AdaptiveQuantization: js.UndefOr[H264AdaptiveQuantization]
    var Bitrate: js.UndefOr[__integerMin1000Max1152000000]
    var CodecLevel: js.UndefOr[H264CodecLevel]
    var CodecProfile: js.UndefOr[H264CodecProfile]
    var DynamicSubGop: js.UndefOr[H264DynamicSubGop]
    var EntropyEncoding: js.UndefOr[H264EntropyEncoding]
    var FieldEncoding: js.UndefOr[H264FieldEncoding]
    var FlickerAdaptiveQuantization: js.UndefOr[H264FlickerAdaptiveQuantization]
    var FramerateControl: js.UndefOr[H264FramerateControl]
    var FramerateConversionAlgorithm: js.UndefOr[H264FramerateConversionAlgorithm]
    var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647]
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647]
    var GopBReference: js.UndefOr[H264GopBReference]
    var GopClosedCadence: js.UndefOr[__integerMin0Max2147483647]
    var GopSize: js.UndefOr[__doubleMin0]
    var GopSizeUnits: js.UndefOr[H264GopSizeUnits]
    var HrdBufferInitialFillPercentage: js.UndefOr[__integerMin0Max100]
    var HrdBufferSize: js.UndefOr[__integerMin0Max1152000000]
    var InterlaceMode: js.UndefOr[H264InterlaceMode]
    var MaxBitrate: js.UndefOr[__integerMin1000Max1152000000]
    var MinIInterval: js.UndefOr[__integerMin0Max30]
    var NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin0Max7]
    var NumberReferenceFrames: js.UndefOr[__integerMin1Max6]
    var ParControl: js.UndefOr[H264ParControl]
    var ParDenominator: js.UndefOr[__integerMin1Max2147483647]
    var ParNumerator: js.UndefOr[__integerMin1Max2147483647]
    var QualityTuningLevel: js.UndefOr[H264QualityTuningLevel]
    var QvbrSettings: js.UndefOr[H264QvbrSettings]
    var RateControlMode: js.UndefOr[H264RateControlMode]
    var RepeatPps: js.UndefOr[H264RepeatPps]
    var SceneChangeDetect: js.UndefOr[H264SceneChangeDetect]
    var Slices: js.UndefOr[__integerMin1Max32]
    var SlowPal: js.UndefOr[H264SlowPal]
    var Softness: js.UndefOr[__integerMin0Max128]
    var SpatialAdaptiveQuantization: js.UndefOr[H264SpatialAdaptiveQuantization]
    var Syntax: js.UndefOr[H264Syntax]
    var Telecine: js.UndefOr[H264Telecine]
    var TemporalAdaptiveQuantization: js.UndefOr[H264TemporalAdaptiveQuantization]
    var UnregisteredSeiTimecode: js.UndefOr[H264UnregisteredSeiTimecode]
  }

  object H264Settings {
    def apply(
      AdaptiveQuantization: js.UndefOr[H264AdaptiveQuantization] = js.undefined,
      Bitrate: js.UndefOr[__integerMin1000Max1152000000] = js.undefined,
      CodecLevel: js.UndefOr[H264CodecLevel] = js.undefined,
      CodecProfile: js.UndefOr[H264CodecProfile] = js.undefined,
      DynamicSubGop: js.UndefOr[H264DynamicSubGop] = js.undefined,
      EntropyEncoding: js.UndefOr[H264EntropyEncoding] = js.undefined,
      FieldEncoding: js.UndefOr[H264FieldEncoding] = js.undefined,
      FlickerAdaptiveQuantization: js.UndefOr[H264FlickerAdaptiveQuantization] = js.undefined,
      FramerateControl: js.UndefOr[H264FramerateControl] = js.undefined,
      FramerateConversionAlgorithm: js.UndefOr[H264FramerateConversionAlgorithm] = js.undefined,
      FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      GopBReference: js.UndefOr[H264GopBReference] = js.undefined,
      GopClosedCadence: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      GopSize: js.UndefOr[__doubleMin0] = js.undefined,
      GopSizeUnits: js.UndefOr[H264GopSizeUnits] = js.undefined,
      HrdBufferInitialFillPercentage: js.UndefOr[__integerMin0Max100] = js.undefined,
      HrdBufferSize: js.UndefOr[__integerMin0Max1152000000] = js.undefined,
      InterlaceMode: js.UndefOr[H264InterlaceMode] = js.undefined,
      MaxBitrate: js.UndefOr[__integerMin1000Max1152000000] = js.undefined,
      MinIInterval: js.UndefOr[__integerMin0Max30] = js.undefined,
      NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin0Max7] = js.undefined,
      NumberReferenceFrames: js.UndefOr[__integerMin1Max6] = js.undefined,
      ParControl: js.UndefOr[H264ParControl] = js.undefined,
      ParDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      ParNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      QualityTuningLevel: js.UndefOr[H264QualityTuningLevel] = js.undefined,
      QvbrSettings: js.UndefOr[H264QvbrSettings] = js.undefined,
      RateControlMode: js.UndefOr[H264RateControlMode] = js.undefined,
      RepeatPps: js.UndefOr[H264RepeatPps] = js.undefined,
      SceneChangeDetect: js.UndefOr[H264SceneChangeDetect] = js.undefined,
      Slices: js.UndefOr[__integerMin1Max32] = js.undefined,
      SlowPal: js.UndefOr[H264SlowPal] = js.undefined,
      Softness: js.UndefOr[__integerMin0Max128] = js.undefined,
      SpatialAdaptiveQuantization: js.UndefOr[H264SpatialAdaptiveQuantization] = js.undefined,
      Syntax: js.UndefOr[H264Syntax] = js.undefined,
      Telecine: js.UndefOr[H264Telecine] = js.undefined,
      TemporalAdaptiveQuantization: js.UndefOr[H264TemporalAdaptiveQuantization] = js.undefined,
      UnregisteredSeiTimecode: js.UndefOr[H264UnregisteredSeiTimecode] = js.undefined): H264Settings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdaptiveQuantization" -> AdaptiveQuantization.map { x => x.asInstanceOf[js.Any] },
        "Bitrate" -> Bitrate.map { x => x.asInstanceOf[js.Any] },
        "CodecLevel" -> CodecLevel.map { x => x.asInstanceOf[js.Any] },
        "CodecProfile" -> CodecProfile.map { x => x.asInstanceOf[js.Any] },
        "DynamicSubGop" -> DynamicSubGop.map { x => x.asInstanceOf[js.Any] },
        "EntropyEncoding" -> EntropyEncoding.map { x => x.asInstanceOf[js.Any] },
        "FieldEncoding" -> FieldEncoding.map { x => x.asInstanceOf[js.Any] },
        "FlickerAdaptiveQuantization" -> FlickerAdaptiveQuantization.map { x => x.asInstanceOf[js.Any] },
        "FramerateControl" -> FramerateControl.map { x => x.asInstanceOf[js.Any] },
        "FramerateConversionAlgorithm" -> FramerateConversionAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "FramerateDenominator" -> FramerateDenominator.map { x => x.asInstanceOf[js.Any] },
        "FramerateNumerator" -> FramerateNumerator.map { x => x.asInstanceOf[js.Any] },
        "GopBReference" -> GopBReference.map { x => x.asInstanceOf[js.Any] },
        "GopClosedCadence" -> GopClosedCadence.map { x => x.asInstanceOf[js.Any] },
        "GopSize" -> GopSize.map { x => x.asInstanceOf[js.Any] },
        "GopSizeUnits" -> GopSizeUnits.map { x => x.asInstanceOf[js.Any] },
        "HrdBufferInitialFillPercentage" -> HrdBufferInitialFillPercentage.map { x => x.asInstanceOf[js.Any] },
        "HrdBufferSize" -> HrdBufferSize.map { x => x.asInstanceOf[js.Any] },
        "InterlaceMode" -> InterlaceMode.map { x => x.asInstanceOf[js.Any] },
        "MaxBitrate" -> MaxBitrate.map { x => x.asInstanceOf[js.Any] },
        "MinIInterval" -> MinIInterval.map { x => x.asInstanceOf[js.Any] },
        "NumberBFramesBetweenReferenceFrames" -> NumberBFramesBetweenReferenceFrames.map { x => x.asInstanceOf[js.Any] },
        "NumberReferenceFrames" -> NumberReferenceFrames.map { x => x.asInstanceOf[js.Any] },
        "ParControl" -> ParControl.map { x => x.asInstanceOf[js.Any] },
        "ParDenominator" -> ParDenominator.map { x => x.asInstanceOf[js.Any] },
        "ParNumerator" -> ParNumerator.map { x => x.asInstanceOf[js.Any] },
        "QualityTuningLevel" -> QualityTuningLevel.map { x => x.asInstanceOf[js.Any] },
        "QvbrSettings" -> QvbrSettings.map { x => x.asInstanceOf[js.Any] },
        "RateControlMode" -> RateControlMode.map { x => x.asInstanceOf[js.Any] },
        "RepeatPps" -> RepeatPps.map { x => x.asInstanceOf[js.Any] },
        "SceneChangeDetect" -> SceneChangeDetect.map { x => x.asInstanceOf[js.Any] },
        "Slices" -> Slices.map { x => x.asInstanceOf[js.Any] },
        "SlowPal" -> SlowPal.map { x => x.asInstanceOf[js.Any] },
        "Softness" -> Softness.map { x => x.asInstanceOf[js.Any] },
        "SpatialAdaptiveQuantization" -> SpatialAdaptiveQuantization.map { x => x.asInstanceOf[js.Any] },
        "Syntax" -> Syntax.map { x => x.asInstanceOf[js.Any] },
        "Telecine" -> Telecine.map { x => x.asInstanceOf[js.Any] },
        "TemporalAdaptiveQuantization" -> TemporalAdaptiveQuantization.map { x => x.asInstanceOf[js.Any] },
        "UnregisteredSeiTimecode" -> UnregisteredSeiTimecode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[H264Settings]
    }
  }

  /**
   * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
   */
  object H264SlowPalEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Adjust quantization within each frame based on spatial variation of content complexity.
   */
  object H264SpatialAdaptiveQuantizationEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Produces a bitstream compliant with SMPTE RP-2027.
   */
  object H264SyntaxEnum {
    val DEFAULT = "DEFAULT"
    val RP2027 = "RP2027"

    val values = IndexedSeq(DEFAULT, RP2027)
  }

  /**
   * This field applies only if the Streams > Advanced > Framerate (framerate) field  is set to 29.970. This field works with the Streams > Advanced > Preprocessors > Deinterlacer  field (deinterlace_mode) and the Streams > Advanced > Interlaced Mode field (interlace_mode)  to identify the scan type for the output: Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces 23.976; the player converts this output to 29.97i.
   */
  object H264TelecineEnum {
    val NONE = "NONE"
    val SOFT = "SOFT"
    val HARD = "HARD"

    val values = IndexedSeq(NONE, SOFT, HARD)
  }

  /**
   * Adjust quantization within each frame based on temporal variation of content complexity.
   */
  object H264TemporalAdaptiveQuantizationEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
   */
  object H264UnregisteredSeiTimecodeEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
   */
  object H265AdaptiveQuantizationEnum {
    val OFF = "OFF"
    val LOW = "LOW"
    val MEDIUM = "MEDIUM"
    val HIGH = "HIGH"
    val HIGHER = "HIGHER"
    val MAX = "MAX"

    val values = IndexedSeq(OFF, LOW, MEDIUM, HIGH, HIGHER, MAX)
  }

  /**
   * Enables Alternate Transfer Function SEI message for outputs using Hybrid Log Gamma (HLG) Electro-Optical Transfer Function (EOTF).
   */
  object H265AlternateTransferFunctionSeiEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * H.265 Level.
   */
  object H265CodecLevelEnum {
    val AUTO = "AUTO"
    val LEVEL_1 = "LEVEL_1"
    val LEVEL_2 = "LEVEL_2"
    val LEVEL_2_1 = "LEVEL_2_1"
    val LEVEL_3 = "LEVEL_3"
    val LEVEL_3_1 = "LEVEL_3_1"
    val LEVEL_4 = "LEVEL_4"
    val LEVEL_4_1 = "LEVEL_4_1"
    val LEVEL_5 = "LEVEL_5"
    val LEVEL_5_1 = "LEVEL_5_1"
    val LEVEL_5_2 = "LEVEL_5_2"
    val LEVEL_6 = "LEVEL_6"
    val LEVEL_6_1 = "LEVEL_6_1"
    val LEVEL_6_2 = "LEVEL_6_2"

    val values = IndexedSeq(AUTO, LEVEL_1, LEVEL_2, LEVEL_2_1, LEVEL_3, LEVEL_3_1, LEVEL_4, LEVEL_4_1, LEVEL_5, LEVEL_5_1, LEVEL_5_2, LEVEL_6, LEVEL_6_1, LEVEL_6_2)
  }

  /**
   * Represents the Profile and Tier, per the HEVC (H.265) specification. Selections are grouped as [Profile] / [Tier], so "Main/High" represents Main Profile with High Tier. 4:2:2 profiles are only available with the HEVC 4:2:2 License.
   */
  object H265CodecProfileEnum {
    val MAIN_MAIN = "MAIN_MAIN"
    val MAIN_HIGH = "MAIN_HIGH"
    val MAIN10_MAIN = "MAIN10_MAIN"
    val MAIN10_HIGH = "MAIN10_HIGH"
    val MAIN_422_8BIT_MAIN = "MAIN_422_8BIT_MAIN"
    val MAIN_422_8BIT_HIGH = "MAIN_422_8BIT_HIGH"
    val MAIN_422_10BIT_MAIN = "MAIN_422_10BIT_MAIN"
    val MAIN_422_10BIT_HIGH = "MAIN_422_10BIT_HIGH"

    val values = IndexedSeq(MAIN_MAIN, MAIN_HIGH, MAIN10_MAIN, MAIN10_HIGH, MAIN_422_8BIT_MAIN, MAIN_422_8BIT_HIGH, MAIN_422_10BIT_MAIN, MAIN_422_10BIT_HIGH)
  }

  /**
   * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
   */
  object H265DynamicSubGopEnum {
    val ADAPTIVE = "ADAPTIVE"
    val STATIC = "STATIC"

    val values = IndexedSeq(ADAPTIVE, STATIC)
  }

  /**
   * Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
   */
  object H265FlickerAdaptiveQuantizationEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * If you are using the console, use the Framerate setting to specify the framerate for this output. If you want to keep the same framerate as the input video, choose Follow source. If you want to do framerate conversion, choose a framerate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your framerate as a fraction. If you are creating your transcoding job sepecification as a JSON file without the console, use FramerateControl to specify which value the service uses for the framerate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the framerate from the input. Choose SPECIFIED if you want the service to use the framerate you specify in the settings FramerateNumerator and FramerateDenominator.
   */
  object H265FramerateControlEnum {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE"
    val SPECIFIED = "SPECIFIED"

    val values = IndexedSeq(INITIALIZE_FROM_SOURCE, SPECIFIED)
  }

  /**
   * When set to INTERPOLATE, produces smoother motion during framerate conversion.
   */
  object H265FramerateConversionAlgorithmEnum {
    val DUPLICATE_DROP = "DUPLICATE_DROP"
    val INTERPOLATE = "INTERPOLATE"

    val values = IndexedSeq(DUPLICATE_DROP, INTERPOLATE)
  }

  /**
   * If enable, use reference B frames for GOP structures that have B frames > 1.
   */
  object H265GopBReferenceEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Indicates if the GOP Size in H265 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
   */
  object H265GopSizeUnitsEnum {
    val FRAMES = "FRAMES"
    val SECONDS = "SECONDS"

    val values = IndexedSeq(FRAMES, SECONDS)
  }

  /**
   * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type.
   * - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
   * - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
   */
  object H265InterlaceModeEnum {
    val PROGRESSIVE = "PROGRESSIVE"
    val TOP_FIELD = "TOP_FIELD"
    val BOTTOM_FIELD = "BOTTOM_FIELD"
    val FOLLOW_TOP_FIELD = "FOLLOW_TOP_FIELD"
    val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD"

    val values = IndexedSeq(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD)
  }

  /**
   * Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the input. Using the console, do this by choosing Follow source for Pixel aspect ratio.
   */
  object H265ParControlEnum {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE"
    val SPECIFIED = "SPECIFIED"

    val values = IndexedSeq(INITIALIZE_FROM_SOURCE, SPECIFIED)
  }

  /**
   * Use Quality tuning level (H265QualityTuningLevel) to specifiy whether to use fast single-pass, high-quality singlepass, or high-quality multipass video encoding.
   */
  object H265QualityTuningLevelEnum {
    val SINGLE_PASS = "SINGLE_PASS"
    val SINGLE_PASS_HQ = "SINGLE_PASS_HQ"
    val MULTI_PASS_HQ = "MULTI_PASS_HQ"

    val values = IndexedSeq(SINGLE_PASS, SINGLE_PASS_HQ, MULTI_PASS_HQ)
  }

  /**
   * Settings for quality-defined variable bitrate encoding with the H.265 codec. Required when you set Rate control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control mode.
   */
  @js.native
  trait H265QvbrSettings extends js.Object {
    var MaxAverageBitrate: js.UndefOr[__integerMin1000Max1466400000]
    var QvbrQualityLevel: js.UndefOr[__integerMin1Max10]
  }

  object H265QvbrSettings {
    def apply(
      MaxAverageBitrate: js.UndefOr[__integerMin1000Max1466400000] = js.undefined,
      QvbrQualityLevel: js.UndefOr[__integerMin1Max10] = js.undefined): H265QvbrSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxAverageBitrate" -> MaxAverageBitrate.map { x => x.asInstanceOf[js.Any] },
        "QvbrQualityLevel" -> QvbrQualityLevel.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[H265QvbrSettings]
    }
  }

  /**
   * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
   */
  object H265RateControlModeEnum {
    val VBR = "VBR"
    val CBR = "CBR"
    val QVBR = "QVBR"

    val values = IndexedSeq(VBR, CBR, QVBR)
  }

  /**
   * Specify Sample Adaptive Offset (SAO) filter strength.  Adaptive mode dynamically selects best strength based on content
   */
  object H265SampleAdaptiveOffsetFilterModeEnum {
    val DEFAULT = "DEFAULT"
    val ADAPTIVE = "ADAPTIVE"
    val OFF = "OFF"

    val values = IndexedSeq(DEFAULT, ADAPTIVE, OFF)
  }

  /**
   * Scene change detection (inserts I-frames on scene changes).
   */
  object H265SceneChangeDetectEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Settings for H265 codec
   */
  @js.native
  trait H265Settings extends js.Object {
    var AdaptiveQuantization: js.UndefOr[H265AdaptiveQuantization]
    var AlternateTransferFunctionSei: js.UndefOr[H265AlternateTransferFunctionSei]
    var Bitrate: js.UndefOr[__integerMin1000Max1466400000]
    var CodecLevel: js.UndefOr[H265CodecLevel]
    var CodecProfile: js.UndefOr[H265CodecProfile]
    var DynamicSubGop: js.UndefOr[H265DynamicSubGop]
    var FlickerAdaptiveQuantization: js.UndefOr[H265FlickerAdaptiveQuantization]
    var FramerateControl: js.UndefOr[H265FramerateControl]
    var FramerateConversionAlgorithm: js.UndefOr[H265FramerateConversionAlgorithm]
    var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647]
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647]
    var GopBReference: js.UndefOr[H265GopBReference]
    var GopClosedCadence: js.UndefOr[__integerMin0Max2147483647]
    var GopSize: js.UndefOr[__doubleMin0]
    var GopSizeUnits: js.UndefOr[H265GopSizeUnits]
    var HrdBufferInitialFillPercentage: js.UndefOr[__integerMin0Max100]
    var HrdBufferSize: js.UndefOr[__integerMin0Max1466400000]
    var InterlaceMode: js.UndefOr[H265InterlaceMode]
    var MaxBitrate: js.UndefOr[__integerMin1000Max1466400000]
    var MinIInterval: js.UndefOr[__integerMin0Max30]
    var NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin0Max7]
    var NumberReferenceFrames: js.UndefOr[__integerMin1Max6]
    var ParControl: js.UndefOr[H265ParControl]
    var ParDenominator: js.UndefOr[__integerMin1Max2147483647]
    var ParNumerator: js.UndefOr[__integerMin1Max2147483647]
    var QualityTuningLevel: js.UndefOr[H265QualityTuningLevel]
    var QvbrSettings: js.UndefOr[H265QvbrSettings]
    var RateControlMode: js.UndefOr[H265RateControlMode]
    var SampleAdaptiveOffsetFilterMode: js.UndefOr[H265SampleAdaptiveOffsetFilterMode]
    var SceneChangeDetect: js.UndefOr[H265SceneChangeDetect]
    var Slices: js.UndefOr[__integerMin1Max32]
    var SlowPal: js.UndefOr[H265SlowPal]
    var SpatialAdaptiveQuantization: js.UndefOr[H265SpatialAdaptiveQuantization]
    var Telecine: js.UndefOr[H265Telecine]
    var TemporalAdaptiveQuantization: js.UndefOr[H265TemporalAdaptiveQuantization]
    var TemporalIds: js.UndefOr[H265TemporalIds]
    var Tiles: js.UndefOr[H265Tiles]
    var UnregisteredSeiTimecode: js.UndefOr[H265UnregisteredSeiTimecode]
    var WriteMp4PackagingType: js.UndefOr[H265WriteMp4PackagingType]
  }

  object H265Settings {
    def apply(
      AdaptiveQuantization: js.UndefOr[H265AdaptiveQuantization] = js.undefined,
      AlternateTransferFunctionSei: js.UndefOr[H265AlternateTransferFunctionSei] = js.undefined,
      Bitrate: js.UndefOr[__integerMin1000Max1466400000] = js.undefined,
      CodecLevel: js.UndefOr[H265CodecLevel] = js.undefined,
      CodecProfile: js.UndefOr[H265CodecProfile] = js.undefined,
      DynamicSubGop: js.UndefOr[H265DynamicSubGop] = js.undefined,
      FlickerAdaptiveQuantization: js.UndefOr[H265FlickerAdaptiveQuantization] = js.undefined,
      FramerateControl: js.UndefOr[H265FramerateControl] = js.undefined,
      FramerateConversionAlgorithm: js.UndefOr[H265FramerateConversionAlgorithm] = js.undefined,
      FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      GopBReference: js.UndefOr[H265GopBReference] = js.undefined,
      GopClosedCadence: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      GopSize: js.UndefOr[__doubleMin0] = js.undefined,
      GopSizeUnits: js.UndefOr[H265GopSizeUnits] = js.undefined,
      HrdBufferInitialFillPercentage: js.UndefOr[__integerMin0Max100] = js.undefined,
      HrdBufferSize: js.UndefOr[__integerMin0Max1466400000] = js.undefined,
      InterlaceMode: js.UndefOr[H265InterlaceMode] = js.undefined,
      MaxBitrate: js.UndefOr[__integerMin1000Max1466400000] = js.undefined,
      MinIInterval: js.UndefOr[__integerMin0Max30] = js.undefined,
      NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin0Max7] = js.undefined,
      NumberReferenceFrames: js.UndefOr[__integerMin1Max6] = js.undefined,
      ParControl: js.UndefOr[H265ParControl] = js.undefined,
      ParDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      ParNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      QualityTuningLevel: js.UndefOr[H265QualityTuningLevel] = js.undefined,
      QvbrSettings: js.UndefOr[H265QvbrSettings] = js.undefined,
      RateControlMode: js.UndefOr[H265RateControlMode] = js.undefined,
      SampleAdaptiveOffsetFilterMode: js.UndefOr[H265SampleAdaptiveOffsetFilterMode] = js.undefined,
      SceneChangeDetect: js.UndefOr[H265SceneChangeDetect] = js.undefined,
      Slices: js.UndefOr[__integerMin1Max32] = js.undefined,
      SlowPal: js.UndefOr[H265SlowPal] = js.undefined,
      SpatialAdaptiveQuantization: js.UndefOr[H265SpatialAdaptiveQuantization] = js.undefined,
      Telecine: js.UndefOr[H265Telecine] = js.undefined,
      TemporalAdaptiveQuantization: js.UndefOr[H265TemporalAdaptiveQuantization] = js.undefined,
      TemporalIds: js.UndefOr[H265TemporalIds] = js.undefined,
      Tiles: js.UndefOr[H265Tiles] = js.undefined,
      UnregisteredSeiTimecode: js.UndefOr[H265UnregisteredSeiTimecode] = js.undefined,
      WriteMp4PackagingType: js.UndefOr[H265WriteMp4PackagingType] = js.undefined): H265Settings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdaptiveQuantization" -> AdaptiveQuantization.map { x => x.asInstanceOf[js.Any] },
        "AlternateTransferFunctionSei" -> AlternateTransferFunctionSei.map { x => x.asInstanceOf[js.Any] },
        "Bitrate" -> Bitrate.map { x => x.asInstanceOf[js.Any] },
        "CodecLevel" -> CodecLevel.map { x => x.asInstanceOf[js.Any] },
        "CodecProfile" -> CodecProfile.map { x => x.asInstanceOf[js.Any] },
        "DynamicSubGop" -> DynamicSubGop.map { x => x.asInstanceOf[js.Any] },
        "FlickerAdaptiveQuantization" -> FlickerAdaptiveQuantization.map { x => x.asInstanceOf[js.Any] },
        "FramerateControl" -> FramerateControl.map { x => x.asInstanceOf[js.Any] },
        "FramerateConversionAlgorithm" -> FramerateConversionAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "FramerateDenominator" -> FramerateDenominator.map { x => x.asInstanceOf[js.Any] },
        "FramerateNumerator" -> FramerateNumerator.map { x => x.asInstanceOf[js.Any] },
        "GopBReference" -> GopBReference.map { x => x.asInstanceOf[js.Any] },
        "GopClosedCadence" -> GopClosedCadence.map { x => x.asInstanceOf[js.Any] },
        "GopSize" -> GopSize.map { x => x.asInstanceOf[js.Any] },
        "GopSizeUnits" -> GopSizeUnits.map { x => x.asInstanceOf[js.Any] },
        "HrdBufferInitialFillPercentage" -> HrdBufferInitialFillPercentage.map { x => x.asInstanceOf[js.Any] },
        "HrdBufferSize" -> HrdBufferSize.map { x => x.asInstanceOf[js.Any] },
        "InterlaceMode" -> InterlaceMode.map { x => x.asInstanceOf[js.Any] },
        "MaxBitrate" -> MaxBitrate.map { x => x.asInstanceOf[js.Any] },
        "MinIInterval" -> MinIInterval.map { x => x.asInstanceOf[js.Any] },
        "NumberBFramesBetweenReferenceFrames" -> NumberBFramesBetweenReferenceFrames.map { x => x.asInstanceOf[js.Any] },
        "NumberReferenceFrames" -> NumberReferenceFrames.map { x => x.asInstanceOf[js.Any] },
        "ParControl" -> ParControl.map { x => x.asInstanceOf[js.Any] },
        "ParDenominator" -> ParDenominator.map { x => x.asInstanceOf[js.Any] },
        "ParNumerator" -> ParNumerator.map { x => x.asInstanceOf[js.Any] },
        "QualityTuningLevel" -> QualityTuningLevel.map { x => x.asInstanceOf[js.Any] },
        "QvbrSettings" -> QvbrSettings.map { x => x.asInstanceOf[js.Any] },
        "RateControlMode" -> RateControlMode.map { x => x.asInstanceOf[js.Any] },
        "SampleAdaptiveOffsetFilterMode" -> SampleAdaptiveOffsetFilterMode.map { x => x.asInstanceOf[js.Any] },
        "SceneChangeDetect" -> SceneChangeDetect.map { x => x.asInstanceOf[js.Any] },
        "Slices" -> Slices.map { x => x.asInstanceOf[js.Any] },
        "SlowPal" -> SlowPal.map { x => x.asInstanceOf[js.Any] },
        "SpatialAdaptiveQuantization" -> SpatialAdaptiveQuantization.map { x => x.asInstanceOf[js.Any] },
        "Telecine" -> Telecine.map { x => x.asInstanceOf[js.Any] },
        "TemporalAdaptiveQuantization" -> TemporalAdaptiveQuantization.map { x => x.asInstanceOf[js.Any] },
        "TemporalIds" -> TemporalIds.map { x => x.asInstanceOf[js.Any] },
        "Tiles" -> Tiles.map { x => x.asInstanceOf[js.Any] },
        "UnregisteredSeiTimecode" -> UnregisteredSeiTimecode.map { x => x.asInstanceOf[js.Any] },
        "WriteMp4PackagingType" -> WriteMp4PackagingType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[H265Settings]
    }
  }

  /**
   * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
   */
  object H265SlowPalEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Adjust quantization within each frame based on spatial variation of content complexity.
   */
  object H265SpatialAdaptiveQuantizationEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * This field applies only if the Streams > Advanced > Framerate (framerate) field  is set to 29.970. This field works with the Streams > Advanced > Preprocessors > Deinterlacer  field (deinterlace_mode) and the Streams > Advanced > Interlaced Mode field (interlace_mode)  to identify the scan type for the output: Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces 23.976; the player converts this output to 29.97i.
   */
  object H265TelecineEnum {
    val NONE = "NONE"
    val SOFT = "SOFT"
    val HARD = "HARD"

    val values = IndexedSeq(NONE, SOFT, HARD)
  }

  /**
   * Adjust quantization within each frame based on temporal variation of content complexity.
   */
  object H265TemporalAdaptiveQuantizationEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Enables temporal layer identifiers in the encoded bitstream. Up to 3 layers are supported depending on GOP structure: I- and P-frames form one layer, reference B-frames can form a second layer and non-reference b-frames can form a third layer. Decoders can optionally decode only the lower temporal layers to generate a lower frame rate output. For example, given a bitstream with temporal IDs and with b-frames = 1 (i.e. IbPbPb display order), a decoder could decode all the frames for full frame rate output or only the I and P frames (lowest temporal layer) for a half frame rate output.
   */
  object H265TemporalIdsEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Enable use of tiles, allowing horizontal as well as vertical subdivision of the encoded pictures.
   */
  object H265TilesEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
   */
  object H265UnregisteredSeiTimecodeEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * If HVC1, output that is H.265 will be marked as HVC1 and adhere to the ISO-IECJTC1-SC29_N13798_Text_ISOIEC_FDIS_14496-15_3rd_E spec which states that parameter set NAL units will be stored in the sample headers but not in the samples directly. If HEV1, then H.265 will be marked as HEV1 and parameter set NAL units will be written into the samples.
   */
  object H265WriteMp4PackagingTypeEnum {
    val HVC1 = "HVC1"
    val HEV1 = "HEV1"

    val values = IndexedSeq(HVC1, HEV1)
  }

  /**
   * Use the HDR master display (Hdr10Metadata) settings to correct HDR metadata or to provide missing metadata. These values vary depending on the input video and must be provided by a color grader. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that these settings are not color correction. Note that if you are creating HDR outputs inside of an HLS CMAF package, to comply with the Apple specification, you must use the HVC1 for H.265 setting.
   */
  @js.native
  trait Hdr10Metadata extends js.Object {
    var BluePrimaryX: js.UndefOr[__integerMin0Max50000]
    var BluePrimaryY: js.UndefOr[__integerMin0Max50000]
    var GreenPrimaryX: js.UndefOr[__integerMin0Max50000]
    var GreenPrimaryY: js.UndefOr[__integerMin0Max50000]
    var MaxContentLightLevel: js.UndefOr[__integerMin0Max65535]
    var MaxFrameAverageLightLevel: js.UndefOr[__integerMin0Max65535]
    var MaxLuminance: js.UndefOr[__integerMin0Max2147483647]
    var MinLuminance: js.UndefOr[__integerMin0Max2147483647]
    var RedPrimaryX: js.UndefOr[__integerMin0Max50000]
    var RedPrimaryY: js.UndefOr[__integerMin0Max50000]
    var WhitePointX: js.UndefOr[__integerMin0Max50000]
    var WhitePointY: js.UndefOr[__integerMin0Max50000]
  }

  object Hdr10Metadata {
    def apply(
      BluePrimaryX: js.UndefOr[__integerMin0Max50000] = js.undefined,
      BluePrimaryY: js.UndefOr[__integerMin0Max50000] = js.undefined,
      GreenPrimaryX: js.UndefOr[__integerMin0Max50000] = js.undefined,
      GreenPrimaryY: js.UndefOr[__integerMin0Max50000] = js.undefined,
      MaxContentLightLevel: js.UndefOr[__integerMin0Max65535] = js.undefined,
      MaxFrameAverageLightLevel: js.UndefOr[__integerMin0Max65535] = js.undefined,
      MaxLuminance: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      MinLuminance: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      RedPrimaryX: js.UndefOr[__integerMin0Max50000] = js.undefined,
      RedPrimaryY: js.UndefOr[__integerMin0Max50000] = js.undefined,
      WhitePointX: js.UndefOr[__integerMin0Max50000] = js.undefined,
      WhitePointY: js.UndefOr[__integerMin0Max50000] = js.undefined): Hdr10Metadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BluePrimaryX" -> BluePrimaryX.map { x => x.asInstanceOf[js.Any] },
        "BluePrimaryY" -> BluePrimaryY.map { x => x.asInstanceOf[js.Any] },
        "GreenPrimaryX" -> GreenPrimaryX.map { x => x.asInstanceOf[js.Any] },
        "GreenPrimaryY" -> GreenPrimaryY.map { x => x.asInstanceOf[js.Any] },
        "MaxContentLightLevel" -> MaxContentLightLevel.map { x => x.asInstanceOf[js.Any] },
        "MaxFrameAverageLightLevel" -> MaxFrameAverageLightLevel.map { x => x.asInstanceOf[js.Any] },
        "MaxLuminance" -> MaxLuminance.map { x => x.asInstanceOf[js.Any] },
        "MinLuminance" -> MinLuminance.map { x => x.asInstanceOf[js.Any] },
        "RedPrimaryX" -> RedPrimaryX.map { x => x.asInstanceOf[js.Any] },
        "RedPrimaryY" -> RedPrimaryY.map { x => x.asInstanceOf[js.Any] },
        "WhitePointX" -> WhitePointX.map { x => x.asInstanceOf[js.Any] },
        "WhitePointY" -> WhitePointY.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Hdr10Metadata]
    }
  }

  object HlsAdMarkersEnum {
    val ELEMENTAL = "ELEMENTAL"
    val ELEMENTAL_SCTE35 = "ELEMENTAL_SCTE35"

    val values = IndexedSeq(ELEMENTAL, ELEMENTAL_SCTE35)
  }

  /**
   * Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this audio-only stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest. Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
   */
  object HlsAudioTrackTypeEnum {
    val ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT = "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT"
    val ALTERNATE_AUDIO_AUTO_SELECT = "ALTERNATE_AUDIO_AUTO_SELECT"
    val ALTERNATE_AUDIO_NOT_AUTO_SELECT = "ALTERNATE_AUDIO_NOT_AUTO_SELECT"
    val AUDIO_ONLY_VARIANT_STREAM = "AUDIO_ONLY_VARIANT_STREAM"

    val values = IndexedSeq(ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT, ALTERNATE_AUDIO_AUTO_SELECT, ALTERNATE_AUDIO_NOT_AUTO_SELECT, AUDIO_ONLY_VARIANT_STREAM)
  }

  /**
   * Caption Language Mapping
   */
  @js.native
  trait HlsCaptionLanguageMapping extends js.Object {
    var CaptionChannel: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LanguageDescription: js.UndefOr[__string]
  }

  object HlsCaptionLanguageMapping {
    def apply(
      CaptionChannel: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
      CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined,
      LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
      LanguageDescription: js.UndefOr[__string] = js.undefined): HlsCaptionLanguageMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CaptionChannel" -> CaptionChannel.map { x => x.asInstanceOf[js.Any] },
        "CustomLanguageCode" -> CustomLanguageCode.map { x => x.asInstanceOf[js.Any] },
        "LanguageCode" -> LanguageCode.map { x => x.asInstanceOf[js.Any] },
        "LanguageDescription" -> LanguageDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsCaptionLanguageMapping]
    }
  }

  /**
   * Applies only to 608 Embedded output captions. Insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you specify. Make sure to specify the languages in the order in which they appear in the original source (if the source is embedded format) or the order of the caption selectors (if the source is other than embedded). Otherwise, languages in the manifest will not match up properly with the output captions. None: Include CLOSED-CAPTIONS=NONE line in the manifest. Omit: Omit any CLOSED-CAPTIONS line from the manifest.
   */
  object HlsCaptionLanguageSettingEnum {
    val INSERT = "INSERT"
    val OMIT = "OMIT"
    val NONE = "NONE"

    val values = IndexedSeq(INSERT, OMIT, NONE)
  }

  /**
   * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for later replay.
   */
  object HlsClientCacheEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
   */
  object HlsCodecSpecificationEnum {
    val RFC_6381 = "RFC_6381"
    val RFC_4281 = "RFC_4281"

    val values = IndexedSeq(RFC_6381, RFC_4281)
  }

  /**
   * Indicates whether segments should be placed in subdirectories.
   */
  object HlsDirectoryStructureEnum {
    val SINGLE_DIRECTORY = "SINGLE_DIRECTORY"
    val SUBDIRECTORY_PER_STREAM = "SUBDIRECTORY_PER_STREAM"

    val values = IndexedSeq(SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM)
  }

  /**
   * Settings for HLS encryption
   */
  @js.native
  trait HlsEncryptionSettings extends js.Object {
    var ConstantInitializationVector: js.UndefOr[__stringMin32Max32Pattern09aFAF32]
    var EncryptionMethod: js.UndefOr[HlsEncryptionType]
    var InitializationVectorInManifest: js.UndefOr[HlsInitializationVectorInManifest]
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProvider]
    var StaticKeyProvider: js.UndefOr[StaticKeyProvider]
    var Type: js.UndefOr[HlsKeyProviderType]
  }

  object HlsEncryptionSettings {
    def apply(
      ConstantInitializationVector: js.UndefOr[__stringMin32Max32Pattern09aFAF32] = js.undefined,
      EncryptionMethod: js.UndefOr[HlsEncryptionType] = js.undefined,
      InitializationVectorInManifest: js.UndefOr[HlsInitializationVectorInManifest] = js.undefined,
      SpekeKeyProvider: js.UndefOr[SpekeKeyProvider] = js.undefined,
      StaticKeyProvider: js.UndefOr[StaticKeyProvider] = js.undefined,
      Type: js.UndefOr[HlsKeyProviderType] = js.undefined): HlsEncryptionSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConstantInitializationVector" -> ConstantInitializationVector.map { x => x.asInstanceOf[js.Any] },
        "EncryptionMethod" -> EncryptionMethod.map { x => x.asInstanceOf[js.Any] },
        "InitializationVectorInManifest" -> InitializationVectorInManifest.map { x => x.asInstanceOf[js.Any] },
        "SpekeKeyProvider" -> SpekeKeyProvider.map { x => x.asInstanceOf[js.Any] },
        "StaticKeyProvider" -> StaticKeyProvider.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsEncryptionSettings]
    }
  }

  /**
   * Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in the web interface also disables encryption.
   */
  object HlsEncryptionTypeEnum {
    val AES128 = "AES128"
    val SAMPLE_AES = "SAMPLE_AES"

    val values = IndexedSeq(AES128, SAMPLE_AES)
  }

  /**
   * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to HLS_GROUP_SETTINGS.
   */
  @js.native
  trait HlsGroupSettings extends js.Object {
    var AdMarkers: js.UndefOr[__listOfHlsAdMarkers]
    var BaseUrl: js.UndefOr[__string]
    var CaptionLanguageMappings: js.UndefOr[__listOfHlsCaptionLanguageMapping]
    var CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting]
    var ClientCache: js.UndefOr[HlsClientCache]
    var CodecSpecification: js.UndefOr[HlsCodecSpecification]
    var Destination: js.UndefOr[__stringPatternS3]
    var DirectoryStructure: js.UndefOr[HlsDirectoryStructure]
    var Encryption: js.UndefOr[HlsEncryptionSettings]
    var ManifestCompression: js.UndefOr[HlsManifestCompression]
    var ManifestDurationFormat: js.UndefOr[HlsManifestDurationFormat]
    var MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647]
    var MinSegmentLength: js.UndefOr[__integerMin0Max2147483647]
    var OutputSelection: js.UndefOr[HlsOutputSelection]
    var ProgramDateTime: js.UndefOr[HlsProgramDateTime]
    var ProgramDateTimePeriod: js.UndefOr[__integerMin0Max3600]
    var SegmentControl: js.UndefOr[HlsSegmentControl]
    var SegmentLength: js.UndefOr[__integerMin1Max2147483647]
    var SegmentsPerSubdirectory: js.UndefOr[__integerMin1Max2147483647]
    var StreamInfResolution: js.UndefOr[HlsStreamInfResolution]
    var TimedMetadataId3Frame: js.UndefOr[HlsTimedMetadataId3Frame]
    var TimedMetadataId3Period: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var TimestampDeltaMilliseconds: js.UndefOr[__integerMinNegative2147483648Max2147483647]
  }

  object HlsGroupSettings {
    def apply(
      AdMarkers: js.UndefOr[__listOfHlsAdMarkers] = js.undefined,
      BaseUrl: js.UndefOr[__string] = js.undefined,
      CaptionLanguageMappings: js.UndefOr[__listOfHlsCaptionLanguageMapping] = js.undefined,
      CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting] = js.undefined,
      ClientCache: js.UndefOr[HlsClientCache] = js.undefined,
      CodecSpecification: js.UndefOr[HlsCodecSpecification] = js.undefined,
      Destination: js.UndefOr[__stringPatternS3] = js.undefined,
      DirectoryStructure: js.UndefOr[HlsDirectoryStructure] = js.undefined,
      Encryption: js.UndefOr[HlsEncryptionSettings] = js.undefined,
      ManifestCompression: js.UndefOr[HlsManifestCompression] = js.undefined,
      ManifestDurationFormat: js.UndefOr[HlsManifestDurationFormat] = js.undefined,
      MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647] = js.undefined,
      MinSegmentLength: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      OutputSelection: js.UndefOr[HlsOutputSelection] = js.undefined,
      ProgramDateTime: js.UndefOr[HlsProgramDateTime] = js.undefined,
      ProgramDateTimePeriod: js.UndefOr[__integerMin0Max3600] = js.undefined,
      SegmentControl: js.UndefOr[HlsSegmentControl] = js.undefined,
      SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      SegmentsPerSubdirectory: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      StreamInfResolution: js.UndefOr[HlsStreamInfResolution] = js.undefined,
      TimedMetadataId3Frame: js.UndefOr[HlsTimedMetadataId3Frame] = js.undefined,
      TimedMetadataId3Period: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
      TimestampDeltaMilliseconds: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined): HlsGroupSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdMarkers" -> AdMarkers.map { x => x.asInstanceOf[js.Any] },
        "BaseUrl" -> BaseUrl.map { x => x.asInstanceOf[js.Any] },
        "CaptionLanguageMappings" -> CaptionLanguageMappings.map { x => x.asInstanceOf[js.Any] },
        "CaptionLanguageSetting" -> CaptionLanguageSetting.map { x => x.asInstanceOf[js.Any] },
        "ClientCache" -> ClientCache.map { x => x.asInstanceOf[js.Any] },
        "CodecSpecification" -> CodecSpecification.map { x => x.asInstanceOf[js.Any] },
        "Destination" -> Destination.map { x => x.asInstanceOf[js.Any] },
        "DirectoryStructure" -> DirectoryStructure.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] },
        "ManifestCompression" -> ManifestCompression.map { x => x.asInstanceOf[js.Any] },
        "ManifestDurationFormat" -> ManifestDurationFormat.map { x => x.asInstanceOf[js.Any] },
        "MinFinalSegmentLength" -> MinFinalSegmentLength.map { x => x.asInstanceOf[js.Any] },
        "MinSegmentLength" -> MinSegmentLength.map { x => x.asInstanceOf[js.Any] },
        "OutputSelection" -> OutputSelection.map { x => x.asInstanceOf[js.Any] },
        "ProgramDateTime" -> ProgramDateTime.map { x => x.asInstanceOf[js.Any] },
        "ProgramDateTimePeriod" -> ProgramDateTimePeriod.map { x => x.asInstanceOf[js.Any] },
        "SegmentControl" -> SegmentControl.map { x => x.asInstanceOf[js.Any] },
        "SegmentLength" -> SegmentLength.map { x => x.asInstanceOf[js.Any] },
        "SegmentsPerSubdirectory" -> SegmentsPerSubdirectory.map { x => x.asInstanceOf[js.Any] },
        "StreamInfResolution" -> StreamInfResolution.map { x => x.asInstanceOf[js.Any] },
        "TimedMetadataId3Frame" -> TimedMetadataId3Frame.map { x => x.asInstanceOf[js.Any] },
        "TimedMetadataId3Period" -> TimedMetadataId3Period.map { x => x.asInstanceOf[js.Any] },
        "TimestampDeltaMilliseconds" -> TimestampDeltaMilliseconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsGroupSettings]
    }
  }

  /**
   * When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS manifest
   */
  object HlsIFrameOnlyManifestEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = IndexedSeq(INCLUDE, EXCLUDE)
  }

  /**
   * The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If set to INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not in the manifest.
   */
  object HlsInitializationVectorInManifestEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = IndexedSeq(INCLUDE, EXCLUDE)
  }

  /**
   * Indicates which type of key provider is used for encryption.
   */
  object HlsKeyProviderTypeEnum {
    val SPEKE = "SPEKE"
    val STATIC_KEY = "STATIC_KEY"

    val values = IndexedSeq(SPEKE, STATIC_KEY)
  }

  /**
   * When set to GZIP, compresses HLS playlist.
   */
  object HlsManifestCompressionEnum {
    val GZIP = "GZIP"
    val NONE = "NONE"

    val values = IndexedSeq(GZIP, NONE)
  }

  /**
   * Indicates whether the output manifest should use floating point values for segment duration.
   */
  object HlsManifestDurationFormatEnum {
    val FLOATING_POINT = "FLOATING_POINT"
    val INTEGER = "INTEGER"

    val values = IndexedSeq(FLOATING_POINT, INTEGER)
  }

  /**
   * Indicates whether the .m3u8 manifest file should be generated for this HLS output group.
   */
  object HlsOutputSelectionEnum {
    val MANIFESTS_AND_SEGMENTS = "MANIFESTS_AND_SEGMENTS"
    val SEGMENTS_ONLY = "SEGMENTS_ONLY"

    val values = IndexedSeq(MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY)
  }

  /**
   * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as follows: either the program date and time are initialized using the input timecode source, or the time is initialized using the input timecode source and the date is initialized using the timestamp_offset.
   */
  object HlsProgramDateTimeEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = IndexedSeq(INCLUDE, EXCLUDE)
  }

  /**
   * When set to SINGLE_FILE, emits program as a single media resource (.ts) file, uses #EXT-X-BYTERANGE tags to index segment for playback.
   */
  object HlsSegmentControlEnum {
    val SINGLE_FILE = "SINGLE_FILE"
    val SEGMENTED_FILES = "SEGMENTED_FILES"

    val values = IndexedSeq(SINGLE_FILE, SEGMENTED_FILES)
  }

  /**
   * Settings for HLS output groups
   */
  @js.native
  trait HlsSettings extends js.Object {
    var AudioGroupId: js.UndefOr[__string]
    var AudioRenditionSets: js.UndefOr[__string]
    var AudioTrackType: js.UndefOr[HlsAudioTrackType]
    var IFrameOnlyManifest: js.UndefOr[HlsIFrameOnlyManifest]
    var SegmentModifier: js.UndefOr[__string]
  }

  object HlsSettings {
    def apply(
      AudioGroupId: js.UndefOr[__string] = js.undefined,
      AudioRenditionSets: js.UndefOr[__string] = js.undefined,
      AudioTrackType: js.UndefOr[HlsAudioTrackType] = js.undefined,
      IFrameOnlyManifest: js.UndefOr[HlsIFrameOnlyManifest] = js.undefined,
      SegmentModifier: js.UndefOr[__string] = js.undefined): HlsSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AudioGroupId" -> AudioGroupId.map { x => x.asInstanceOf[js.Any] },
        "AudioRenditionSets" -> AudioRenditionSets.map { x => x.asInstanceOf[js.Any] },
        "AudioTrackType" -> AudioTrackType.map { x => x.asInstanceOf[js.Any] },
        "IFrameOnlyManifest" -> IFrameOnlyManifest.map { x => x.asInstanceOf[js.Any] },
        "SegmentModifier" -> SegmentModifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsSettings]
    }
  }

  /**
   * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
   */
  object HlsStreamInfResolutionEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = IndexedSeq(INCLUDE, EXCLUDE)
  }

  /**
   * Indicates ID3 frame that has the timecode.
   */
  object HlsTimedMetadataId3FrameEnum {
    val NONE = "NONE"
    val PRIV = "PRIV"
    val TDRL = "TDRL"

    val values = IndexedSeq(NONE, PRIV, TDRL)
  }

  /**
   * To insert ID3 tags in your output, specify two values. Use ID3 tag (Id3) to specify the base 64 encoded string and use Timecode (TimeCode) to specify the time when the tag should be inserted. To insert multiple ID3 tags in your output, create multiple instances of ID3 insertion (Id3Insertion).
   */
  @js.native
  trait Id3Insertion extends js.Object {
    var Id3: js.UndefOr[__stringPatternAZaZ0902]
    var Timecode: js.UndefOr[__stringPattern010920405090509092]
  }

  object Id3Insertion {
    def apply(
      Id3: js.UndefOr[__stringPatternAZaZ0902] = js.undefined,
      Timecode: js.UndefOr[__stringPattern010920405090509092] = js.undefined): Id3Insertion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id3" -> Id3.map { x => x.asInstanceOf[js.Any] },
        "Timecode" -> Timecode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Id3Insertion]
    }
  }

  /**
   * Enable the Image inserter (ImageInserter) feature to include a graphic overlay on your video. Enable or disable this feature for each input or output individually. This setting is disabled by default.
   */
  @js.native
  trait ImageInserter extends js.Object {
    var InsertableImages: js.UndefOr[__listOfInsertableImage]
  }

  object ImageInserter {
    def apply(
      InsertableImages: js.UndefOr[__listOfInsertableImage] = js.undefined): ImageInserter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InsertableImages" -> InsertableImages.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImageInserter]
    }
  }

  /**
   * Specifies media input
   */
  @js.native
  trait Input extends js.Object {
    var AudioSelectorGroups: js.UndefOr[__mapOfAudioSelectorGroup]
    var AudioSelectors: js.UndefOr[__mapOfAudioSelector]
    var CaptionSelectors: js.UndefOr[__mapOfCaptionSelector]
    var DeblockFilter: js.UndefOr[InputDeblockFilter]
    var DecryptionSettings: js.UndefOr[InputDecryptionSettings]
    var DenoiseFilter: js.UndefOr[InputDenoiseFilter]
    var FileInput: js.UndefOr[__stringPatternS3MM2VVMMPPEEGGAAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MM]
    var FilterEnable: js.UndefOr[InputFilterEnable]
    var FilterStrength: js.UndefOr[__integerMinNegative5Max5]
    var ImageInserter: js.UndefOr[ImageInserter]
    var InputClippings: js.UndefOr[__listOfInputClipping]
    var ProgramNumber: js.UndefOr[__integerMin1Max2147483647]
    var PsiControl: js.UndefOr[InputPsiControl]
    var TimecodeSource: js.UndefOr[InputTimecodeSource]
    var VideoSelector: js.UndefOr[VideoSelector]
  }

  object Input {
    def apply(
      AudioSelectorGroups: js.UndefOr[__mapOfAudioSelectorGroup] = js.undefined,
      AudioSelectors: js.UndefOr[__mapOfAudioSelector] = js.undefined,
      CaptionSelectors: js.UndefOr[__mapOfCaptionSelector] = js.undefined,
      DeblockFilter: js.UndefOr[InputDeblockFilter] = js.undefined,
      DecryptionSettings: js.UndefOr[InputDecryptionSettings] = js.undefined,
      DenoiseFilter: js.UndefOr[InputDenoiseFilter] = js.undefined,
      FileInput: js.UndefOr[__stringPatternS3MM2VVMMPPEEGGAAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MM] = js.undefined,
      FilterEnable: js.UndefOr[InputFilterEnable] = js.undefined,
      FilterStrength: js.UndefOr[__integerMinNegative5Max5] = js.undefined,
      ImageInserter: js.UndefOr[ImageInserter] = js.undefined,
      InputClippings: js.UndefOr[__listOfInputClipping] = js.undefined,
      ProgramNumber: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      PsiControl: js.UndefOr[InputPsiControl] = js.undefined,
      TimecodeSource: js.UndefOr[InputTimecodeSource] = js.undefined,
      VideoSelector: js.UndefOr[VideoSelector] = js.undefined): Input = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AudioSelectorGroups" -> AudioSelectorGroups.map { x => x.asInstanceOf[js.Any] },
        "AudioSelectors" -> AudioSelectors.map { x => x.asInstanceOf[js.Any] },
        "CaptionSelectors" -> CaptionSelectors.map { x => x.asInstanceOf[js.Any] },
        "DeblockFilter" -> DeblockFilter.map { x => x.asInstanceOf[js.Any] },
        "DecryptionSettings" -> DecryptionSettings.map { x => x.asInstanceOf[js.Any] },
        "DenoiseFilter" -> DenoiseFilter.map { x => x.asInstanceOf[js.Any] },
        "FileInput" -> FileInput.map { x => x.asInstanceOf[js.Any] },
        "FilterEnable" -> FilterEnable.map { x => x.asInstanceOf[js.Any] },
        "FilterStrength" -> FilterStrength.map { x => x.asInstanceOf[js.Any] },
        "ImageInserter" -> ImageInserter.map { x => x.asInstanceOf[js.Any] },
        "InputClippings" -> InputClippings.map { x => x.asInstanceOf[js.Any] },
        "ProgramNumber" -> ProgramNumber.map { x => x.asInstanceOf[js.Any] },
        "PsiControl" -> PsiControl.map { x => x.asInstanceOf[js.Any] },
        "TimecodeSource" -> TimecodeSource.map { x => x.asInstanceOf[js.Any] },
        "VideoSelector" -> VideoSelector.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Input]
    }
  }

  /**
   * To transcode only portions of your input (clips), include one Input clipping (one instance of InputClipping in the JSON job file) for each input clip. All input clips you specify will be included in every output of the job.
   */
  @js.native
  trait InputClipping extends js.Object {
    var EndTimecode: js.UndefOr[__stringPattern010920405090509092]
    var StartTimecode: js.UndefOr[__stringPattern010920405090509092]
  }

  object InputClipping {
    def apply(
      EndTimecode: js.UndefOr[__stringPattern010920405090509092] = js.undefined,
      StartTimecode: js.UndefOr[__stringPattern010920405090509092] = js.undefined): InputClipping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndTimecode" -> EndTimecode.map { x => x.asInstanceOf[js.Any] },
        "StartTimecode" -> StartTimecode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputClipping]
    }
  }

  /**
   * Enable Deblock (InputDeblockFilter) to produce smoother motion in the output. Default is disabled. Only manaully controllable for MPEG2 and uncompressed video inputs.
   */
  object InputDeblockFilterEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  /**
   * Specify the decryption settings used to decrypt encrypted input
   */
  @js.native
  trait InputDecryptionSettings extends js.Object {
    var DecryptionMode: js.UndefOr[DecryptionMode]
    var EncryptedDecryptionKey: js.UndefOr[__stringMin24Max512PatternAZaZ0902]
    var InitializationVector: js.UndefOr[__stringMin16Max24PatternAZaZ0922AZaZ0916]
    var KmsKeyRegion: js.UndefOr[__stringMin9Max19PatternAZ26EastWestCentralNorthSouthEastWest1912]
  }

  object InputDecryptionSettings {
    def apply(
      DecryptionMode: js.UndefOr[DecryptionMode] = js.undefined,
      EncryptedDecryptionKey: js.UndefOr[__stringMin24Max512PatternAZaZ0902] = js.undefined,
      InitializationVector: js.UndefOr[__stringMin16Max24PatternAZaZ0922AZaZ0916] = js.undefined,
      KmsKeyRegion: js.UndefOr[__stringMin9Max19PatternAZ26EastWestCentralNorthSouthEastWest1912] = js.undefined): InputDecryptionSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DecryptionMode" -> DecryptionMode.map { x => x.asInstanceOf[js.Any] },
        "EncryptedDecryptionKey" -> EncryptedDecryptionKey.map { x => x.asInstanceOf[js.Any] },
        "InitializationVector" -> InitializationVector.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyRegion" -> KmsKeyRegion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputDecryptionSettings]
    }
  }

  /**
   * Enable Denoise (InputDenoiseFilter) to filter noise from the input.  Default is disabled. Only applicable to MPEG2, H.264, H.265, and uncompressed video inputs.
   */
  object InputDenoiseFilterEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  /**
   * Use Filter enable (InputFilterEnable) to specify how the transcoding service applies the denoise and deblock filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and Deblock (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering, depending on input type and quality. * Disable - The input is not filtered. This is true even if you use the API to enable them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The in put is filtered regardless of input type.
   */
  object InputFilterEnableEnum {
    val AUTO = "AUTO"
    val DISABLE = "DISABLE"
    val FORCE = "FORCE"

    val values = IndexedSeq(AUTO, DISABLE, FORCE)
  }

  /**
   * Set PSI control (InputPsiControl) for transport stream inputs to specify which data the demux process to scans. * Ignore PSI - Scan all PIDs for audio and video. * Use PSI - Scan only PSI data.
   */
  object InputPsiControlEnum {
    val IGNORE_PSI = "IGNORE_PSI"
    val USE_PSI = "USE_PSI"

    val values = IndexedSeq(IGNORE_PSI, USE_PSI)
  }

  /**
   * Specified video input in a template.
   */
  @js.native
  trait InputTemplate extends js.Object {
    var AudioSelectorGroups: js.UndefOr[__mapOfAudioSelectorGroup]
    var AudioSelectors: js.UndefOr[__mapOfAudioSelector]
    var CaptionSelectors: js.UndefOr[__mapOfCaptionSelector]
    var DeblockFilter: js.UndefOr[InputDeblockFilter]
    var DenoiseFilter: js.UndefOr[InputDenoiseFilter]
    var FilterEnable: js.UndefOr[InputFilterEnable]
    var FilterStrength: js.UndefOr[__integerMinNegative5Max5]
    var ImageInserter: js.UndefOr[ImageInserter]
    var InputClippings: js.UndefOr[__listOfInputClipping]
    var ProgramNumber: js.UndefOr[__integerMin1Max2147483647]
    var PsiControl: js.UndefOr[InputPsiControl]
    var TimecodeSource: js.UndefOr[InputTimecodeSource]
    var VideoSelector: js.UndefOr[VideoSelector]
  }

  object InputTemplate {
    def apply(
      AudioSelectorGroups: js.UndefOr[__mapOfAudioSelectorGroup] = js.undefined,
      AudioSelectors: js.UndefOr[__mapOfAudioSelector] = js.undefined,
      CaptionSelectors: js.UndefOr[__mapOfCaptionSelector] = js.undefined,
      DeblockFilter: js.UndefOr[InputDeblockFilter] = js.undefined,
      DenoiseFilter: js.UndefOr[InputDenoiseFilter] = js.undefined,
      FilterEnable: js.UndefOr[InputFilterEnable] = js.undefined,
      FilterStrength: js.UndefOr[__integerMinNegative5Max5] = js.undefined,
      ImageInserter: js.UndefOr[ImageInserter] = js.undefined,
      InputClippings: js.UndefOr[__listOfInputClipping] = js.undefined,
      ProgramNumber: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      PsiControl: js.UndefOr[InputPsiControl] = js.undefined,
      TimecodeSource: js.UndefOr[InputTimecodeSource] = js.undefined,
      VideoSelector: js.UndefOr[VideoSelector] = js.undefined): InputTemplate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AudioSelectorGroups" -> AudioSelectorGroups.map { x => x.asInstanceOf[js.Any] },
        "AudioSelectors" -> AudioSelectors.map { x => x.asInstanceOf[js.Any] },
        "CaptionSelectors" -> CaptionSelectors.map { x => x.asInstanceOf[js.Any] },
        "DeblockFilter" -> DeblockFilter.map { x => x.asInstanceOf[js.Any] },
        "DenoiseFilter" -> DenoiseFilter.map { x => x.asInstanceOf[js.Any] },
        "FilterEnable" -> FilterEnable.map { x => x.asInstanceOf[js.Any] },
        "FilterStrength" -> FilterStrength.map { x => x.asInstanceOf[js.Any] },
        "ImageInserter" -> ImageInserter.map { x => x.asInstanceOf[js.Any] },
        "InputClippings" -> InputClippings.map { x => x.asInstanceOf[js.Any] },
        "ProgramNumber" -> ProgramNumber.map { x => x.asInstanceOf[js.Any] },
        "PsiControl" -> PsiControl.map { x => x.asInstanceOf[js.Any] },
        "TimecodeSource" -> TimecodeSource.map { x => x.asInstanceOf[js.Any] },
        "VideoSelector" -> VideoSelector.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputTemplate]
    }
  }

  /**
   * Timecode source under input settings (InputTimecodeSource) only affects the behavior of features that apply to a single input at a time, such as input clipping and synchronizing some captions formats. Use this setting to specify whether the service counts frames by timecodes embedded in the video (EMBEDDED) or by starting the first frame at zero (ZEROBASED). In both cases, the timecode format is HH:MM:SS:FF or HH:MM:SS;FF, where FF is the frame number. Only set this to EMBEDDED if your source video has embedded timecodes.
   */
  object InputTimecodeSourceEnum {
    val EMBEDDED = "EMBEDDED"
    val ZEROBASED = "ZEROBASED"
    val SPECIFIEDSTART = "SPECIFIEDSTART"

    val values = IndexedSeq(EMBEDDED, ZEROBASED, SPECIFIEDSTART)
  }

  /**
   * Settings that specify how your overlay appears.
   */
  @js.native
  trait InsertableImage extends js.Object {
    var Duration: js.UndefOr[__integerMin0Max2147483647]
    var FadeIn: js.UndefOr[__integerMin0Max2147483647]
    var FadeOut: js.UndefOr[__integerMin0Max2147483647]
    var Height: js.UndefOr[__integerMin0Max2147483647]
    var ImageInserterInput: js.UndefOr[__stringMin14PatternS3BmpBMPPngPNGTgaTGA]
    var ImageX: js.UndefOr[__integerMin0Max2147483647]
    var ImageY: js.UndefOr[__integerMin0Max2147483647]
    var Layer: js.UndefOr[__integerMin0Max99]
    var Opacity: js.UndefOr[__integerMin0Max100]
    var StartTime: js.UndefOr[__stringPattern01D20305D205D]
    var Width: js.UndefOr[__integerMin0Max2147483647]
  }

  object InsertableImage {
    def apply(
      Duration: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      FadeIn: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      FadeOut: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      Height: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      ImageInserterInput: js.UndefOr[__stringMin14PatternS3BmpBMPPngPNGTgaTGA] = js.undefined,
      ImageX: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      ImageY: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      Layer: js.UndefOr[__integerMin0Max99] = js.undefined,
      Opacity: js.UndefOr[__integerMin0Max100] = js.undefined,
      StartTime: js.UndefOr[__stringPattern01D20305D205D] = js.undefined,
      Width: js.UndefOr[__integerMin0Max2147483647] = js.undefined): InsertableImage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "FadeIn" -> FadeIn.map { x => x.asInstanceOf[js.Any] },
        "FadeOut" -> FadeOut.map { x => x.asInstanceOf[js.Any] },
        "Height" -> Height.map { x => x.asInstanceOf[js.Any] },
        "ImageInserterInput" -> ImageInserterInput.map { x => x.asInstanceOf[js.Any] },
        "ImageX" -> ImageX.map { x => x.asInstanceOf[js.Any] },
        "ImageY" -> ImageY.map { x => x.asInstanceOf[js.Any] },
        "Layer" -> Layer.map { x => x.asInstanceOf[js.Any] },
        "Opacity" -> Opacity.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "Width" -> Width.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InsertableImage]
    }
  }

  /**
   * Each job converts an input file into an output file or files. For more information, see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
   */
  @js.native
  trait Job extends js.Object {
    var Role: __string
    var Settings: JobSettings
    var Arn: js.UndefOr[__string]
    var BillingTagsSource: js.UndefOr[BillingTagsSource]
    var CreatedAt: js.UndefOr[__timestampUnix]
    var ErrorCode: js.UndefOr[__integer]
    var ErrorMessage: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var JobTemplate: js.UndefOr[__string]
    var OutputGroupDetails: js.UndefOr[__listOfOutputGroupDetail]
    var Queue: js.UndefOr[__string]
    var Status: js.UndefOr[JobStatus]
    var Timing: js.UndefOr[Timing]
    var UserMetadata: js.UndefOr[__mapOf__string]
  }

  object Job {
    def apply(
      Role: __string,
      Settings: JobSettings,
      Arn: js.UndefOr[__string] = js.undefined,
      BillingTagsSource: js.UndefOr[BillingTagsSource] = js.undefined,
      CreatedAt: js.UndefOr[__timestampUnix] = js.undefined,
      ErrorCode: js.UndefOr[__integer] = js.undefined,
      ErrorMessage: js.UndefOr[__string] = js.undefined,
      Id: js.UndefOr[__string] = js.undefined,
      JobTemplate: js.UndefOr[__string] = js.undefined,
      OutputGroupDetails: js.UndefOr[__listOfOutputGroupDetail] = js.undefined,
      Queue: js.UndefOr[__string] = js.undefined,
      Status: js.UndefOr[JobStatus] = js.undefined,
      Timing: js.UndefOr[Timing] = js.undefined,
      UserMetadata: js.UndefOr[__mapOf__string] = js.undefined): Job = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Role" -> Role.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any],
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "BillingTagsSource" -> BillingTagsSource.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "JobTemplate" -> JobTemplate.map { x => x.asInstanceOf[js.Any] },
        "OutputGroupDetails" -> OutputGroupDetails.map { x => x.asInstanceOf[js.Any] },
        "Queue" -> Queue.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Timing" -> Timing.map { x => x.asInstanceOf[js.Any] },
        "UserMetadata" -> UserMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Job]
    }
  }

  /**
   * JobSettings contains all the transcode settings for a job.
   */
  @js.native
  trait JobSettings extends js.Object {
    var AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000]
    var AvailBlanking: js.UndefOr[AvailBlanking]
    var Inputs: js.UndefOr[__listOfInput]
    var MotionImageInserter: js.UndefOr[MotionImageInserter]
    var NielsenConfiguration: js.UndefOr[NielsenConfiguration]
    var OutputGroups: js.UndefOr[__listOfOutputGroup]
    var TimecodeConfig: js.UndefOr[TimecodeConfig]
    var TimedMetadataInsertion: js.UndefOr[TimedMetadataInsertion]
  }

  object JobSettings {
    def apply(
      AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000] = js.undefined,
      AvailBlanking: js.UndefOr[AvailBlanking] = js.undefined,
      Inputs: js.UndefOr[__listOfInput] = js.undefined,
      MotionImageInserter: js.UndefOr[MotionImageInserter] = js.undefined,
      NielsenConfiguration: js.UndefOr[NielsenConfiguration] = js.undefined,
      OutputGroups: js.UndefOr[__listOfOutputGroup] = js.undefined,
      TimecodeConfig: js.UndefOr[TimecodeConfig] = js.undefined,
      TimedMetadataInsertion: js.UndefOr[TimedMetadataInsertion] = js.undefined): JobSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdAvailOffset" -> AdAvailOffset.map { x => x.asInstanceOf[js.Any] },
        "AvailBlanking" -> AvailBlanking.map { x => x.asInstanceOf[js.Any] },
        "Inputs" -> Inputs.map { x => x.asInstanceOf[js.Any] },
        "MotionImageInserter" -> MotionImageInserter.map { x => x.asInstanceOf[js.Any] },
        "NielsenConfiguration" -> NielsenConfiguration.map { x => x.asInstanceOf[js.Any] },
        "OutputGroups" -> OutputGroups.map { x => x.asInstanceOf[js.Any] },
        "TimecodeConfig" -> TimecodeConfig.map { x => x.asInstanceOf[js.Any] },
        "TimedMetadataInsertion" -> TimedMetadataInsertion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobSettings]
    }
  }

  /**
   * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
   */
  object JobStatusEnum {
    val SUBMITTED = "SUBMITTED"
    val PROGRESSING = "PROGRESSING"
    val COMPLETE = "COMPLETE"
    val CANCELED = "CANCELED"
    val ERROR = "ERROR"

    val values = IndexedSeq(SUBMITTED, PROGRESSING, COMPLETE, CANCELED, ERROR)
  }

  /**
   * A job template is a pre-made set of encoding instructions that you can use to quickly create a job.
   */
  @js.native
  trait JobTemplate extends js.Object {
    var Name: __string
    var Settings: JobTemplateSettings
    var Arn: js.UndefOr[__string]
    var Category: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__timestampUnix]
    var Description: js.UndefOr[__string]
    var LastUpdated: js.UndefOr[__timestampUnix]
    var Queue: js.UndefOr[__string]
    var Type: js.UndefOr[Type]
  }

  object JobTemplate {
    def apply(
      Name: __string,
      Settings: JobTemplateSettings,
      Arn: js.UndefOr[__string] = js.undefined,
      Category: js.UndefOr[__string] = js.undefined,
      CreatedAt: js.UndefOr[__timestampUnix] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      LastUpdated: js.UndefOr[__timestampUnix] = js.undefined,
      Queue: js.UndefOr[__string] = js.undefined,
      Type: js.UndefOr[Type] = js.undefined): JobTemplate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any],
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Category" -> Category.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "LastUpdated" -> LastUpdated.map { x => x.asInstanceOf[js.Any] },
        "Queue" -> Queue.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobTemplate]
    }
  }

  /**
   * Optional. When you request a list of job templates, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
   */
  object JobTemplateListByEnum {
    val NAME = "NAME"
    val CREATION_DATE = "CREATION_DATE"
    val SYSTEM = "SYSTEM"

    val values = IndexedSeq(NAME, CREATION_DATE, SYSTEM)
  }

  /**
   * JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs created from it.
   */
  @js.native
  trait JobTemplateSettings extends js.Object {
    var AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000]
    var AvailBlanking: js.UndefOr[AvailBlanking]
    var Inputs: js.UndefOr[__listOfInputTemplate]
    var MotionImageInserter: js.UndefOr[MotionImageInserter]
    var NielsenConfiguration: js.UndefOr[NielsenConfiguration]
    var OutputGroups: js.UndefOr[__listOfOutputGroup]
    var TimecodeConfig: js.UndefOr[TimecodeConfig]
    var TimedMetadataInsertion: js.UndefOr[TimedMetadataInsertion]
  }

  object JobTemplateSettings {
    def apply(
      AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000] = js.undefined,
      AvailBlanking: js.UndefOr[AvailBlanking] = js.undefined,
      Inputs: js.UndefOr[__listOfInputTemplate] = js.undefined,
      MotionImageInserter: js.UndefOr[MotionImageInserter] = js.undefined,
      NielsenConfiguration: js.UndefOr[NielsenConfiguration] = js.undefined,
      OutputGroups: js.UndefOr[__listOfOutputGroup] = js.undefined,
      TimecodeConfig: js.UndefOr[TimecodeConfig] = js.undefined,
      TimedMetadataInsertion: js.UndefOr[TimedMetadataInsertion] = js.undefined): JobTemplateSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdAvailOffset" -> AdAvailOffset.map { x => x.asInstanceOf[js.Any] },
        "AvailBlanking" -> AvailBlanking.map { x => x.asInstanceOf[js.Any] },
        "Inputs" -> Inputs.map { x => x.asInstanceOf[js.Any] },
        "MotionImageInserter" -> MotionImageInserter.map { x => x.asInstanceOf[js.Any] },
        "NielsenConfiguration" -> NielsenConfiguration.map { x => x.asInstanceOf[js.Any] },
        "OutputGroups" -> OutputGroups.map { x => x.asInstanceOf[js.Any] },
        "TimecodeConfig" -> TimecodeConfig.map { x => x.asInstanceOf[js.Any] },
        "TimedMetadataInsertion" -> TimedMetadataInsertion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobTemplateSettings]
    }
  }

  /**
   * Specify the language, using the ISO 639-2 three-letter code listed at https://www.loc.gov/standards/iso639-2/php/code_list.php.
   */
  object LanguageCodeEnum {
    val ENG = "ENG"
    val SPA = "SPA"
    val FRA = "FRA"
    val DEU = "DEU"
    val GER = "GER"
    val ZHO = "ZHO"
    val ARA = "ARA"
    val HIN = "HIN"
    val JPN = "JPN"
    val RUS = "RUS"
    val POR = "POR"
    val ITA = "ITA"
    val URD = "URD"
    val VIE = "VIE"
    val KOR = "KOR"
    val PAN = "PAN"
    val ABK = "ABK"
    val AAR = "AAR"
    val AFR = "AFR"
    val AKA = "AKA"
    val SQI = "SQI"
    val AMH = "AMH"
    val ARG = "ARG"
    val HYE = "HYE"
    val ASM = "ASM"
    val AVA = "AVA"
    val AVE = "AVE"
    val AYM = "AYM"
    val AZE = "AZE"
    val BAM = "BAM"
    val BAK = "BAK"
    val EUS = "EUS"
    val BEL = "BEL"
    val BEN = "BEN"
    val BIH = "BIH"
    val BIS = "BIS"
    val BOS = "BOS"
    val BRE = "BRE"
    val BUL = "BUL"
    val MYA = "MYA"
    val CAT = "CAT"
    val KHM = "KHM"
    val CHA = "CHA"
    val CHE = "CHE"
    val NYA = "NYA"
    val CHU = "CHU"
    val CHV = "CHV"
    val COR = "COR"
    val COS = "COS"
    val CRE = "CRE"
    val HRV = "HRV"
    val CES = "CES"
    val DAN = "DAN"
    val DIV = "DIV"
    val NLD = "NLD"
    val DZO = "DZO"
    val ENM = "ENM"
    val EPO = "EPO"
    val EST = "EST"
    val EWE = "EWE"
    val FAO = "FAO"
    val FIJ = "FIJ"
    val FIN = "FIN"
    val FRM = "FRM"
    val FUL = "FUL"
    val GLA = "GLA"
    val GLG = "GLG"
    val LUG = "LUG"
    val KAT = "KAT"
    val ELL = "ELL"
    val GRN = "GRN"
    val GUJ = "GUJ"
    val HAT = "HAT"
    val HAU = "HAU"
    val HEB = "HEB"
    val HER = "HER"
    val HMO = "HMO"
    val HUN = "HUN"
    val ISL = "ISL"
    val IDO = "IDO"
    val IBO = "IBO"
    val IND = "IND"
    val INA = "INA"
    val ILE = "ILE"
    val IKU = "IKU"
    val IPK = "IPK"
    val GLE = "GLE"
    val JAV = "JAV"
    val KAL = "KAL"
    val KAN = "KAN"
    val KAU = "KAU"
    val KAS = "KAS"
    val KAZ = "KAZ"
    val KIK = "KIK"
    val KIN = "KIN"
    val KIR = "KIR"
    val KOM = "KOM"
    val KON = "KON"
    val KUA = "KUA"
    val KUR = "KUR"
    val LAO = "LAO"
    val LAT = "LAT"
    val LAV = "LAV"
    val LIM = "LIM"
    val LIN = "LIN"
    val LIT = "LIT"
    val LUB = "LUB"
    val LTZ = "LTZ"
    val MKD = "MKD"
    val MLG = "MLG"
    val MSA = "MSA"
    val MAL = "MAL"
    val MLT = "MLT"
    val GLV = "GLV"
    val MRI = "MRI"
    val MAR = "MAR"
    val MAH = "MAH"
    val MON = "MON"
    val NAU = "NAU"
    val NAV = "NAV"
    val NDE = "NDE"
    val NBL = "NBL"
    val NDO = "NDO"
    val NEP = "NEP"
    val SME = "SME"
    val NOR = "NOR"
    val NOB = "NOB"
    val NNO = "NNO"
    val OCI = "OCI"
    val OJI = "OJI"
    val ORI = "ORI"
    val ORM = "ORM"
    val OSS = "OSS"
    val PLI = "PLI"
    val FAS = "FAS"
    val POL = "POL"
    val PUS = "PUS"
    val QUE = "QUE"
    val QAA = "QAA"
    val RON = "RON"
    val ROH = "ROH"
    val RUN = "RUN"
    val SMO = "SMO"
    val SAG = "SAG"
    val SAN = "SAN"
    val SRD = "SRD"
    val SRB = "SRB"
    val SNA = "SNA"
    val III = "III"
    val SND = "SND"
    val SIN = "SIN"
    val SLK = "SLK"
    val SLV = "SLV"
    val SOM = "SOM"
    val SOT = "SOT"
    val SUN = "SUN"
    val SWA = "SWA"
    val SSW = "SSW"
    val SWE = "SWE"
    val TGL = "TGL"
    val TAH = "TAH"
    val TGK = "TGK"
    val TAM = "TAM"
    val TAT = "TAT"
    val TEL = "TEL"
    val THA = "THA"
    val BOD = "BOD"
    val TIR = "TIR"
    val TON = "TON"
    val TSO = "TSO"
    val TSN = "TSN"
    val TUR = "TUR"
    val TUK = "TUK"
    val TWI = "TWI"
    val UIG = "UIG"
    val UKR = "UKR"
    val UZB = "UZB"
    val VEN = "VEN"
    val VOL = "VOL"
    val WLN = "WLN"
    val CYM = "CYM"
    val FRY = "FRY"
    val WOL = "WOL"
    val XHO = "XHO"
    val YID = "YID"
    val YOR = "YOR"
    val ZHA = "ZHA"
    val ZUL = "ZUL"
    val ORJ = "ORJ"
    val QPC = "QPC"
    val TNG = "TNG"

    val values = IndexedSeq(ENG, SPA, FRA, DEU, GER, ZHO, ARA, HIN, JPN, RUS, POR, ITA, URD, VIE, KOR, PAN, ABK, AAR, AFR, AKA, SQI, AMH, ARG, HYE, ASM, AVA, AVE, AYM, AZE, BAM, BAK, EUS, BEL, BEN, BIH, BIS, BOS, BRE, BUL, MYA, CAT, KHM, CHA, CHE, NYA, CHU, CHV, COR, COS, CRE, HRV, CES, DAN, DIV, NLD, DZO, ENM, EPO, EST, EWE, FAO, FIJ, FIN, FRM, FUL, GLA, GLG, LUG, KAT, ELL, GRN, GUJ, HAT, HAU, HEB, HER, HMO, HUN, ISL, IDO, IBO, IND, INA, ILE, IKU, IPK, GLE, JAV, KAL, KAN, KAU, KAS, KAZ, KIK, KIN, KIR, KOM, KON, KUA, KUR, LAO, LAT, LAV, LIM, LIN, LIT, LUB, LTZ, MKD, MLG, MSA, MAL, MLT, GLV, MRI, MAR, MAH, MON, NAU, NAV, NDE, NBL, NDO, NEP, SME, NOR, NOB, NNO, OCI, OJI, ORI, ORM, OSS, PLI, FAS, POL, PUS, QUE, QAA, RON, ROH, RUN, SMO, SAG, SAN, SRD, SRB, SNA, III, SND, SIN, SLK, SLV, SOM, SOT, SUN, SWA, SSW, SWE, TGL, TAH, TGK, TAM, TAT, TEL, THA, BOD, TIR, TON, TSO, TSN, TUR, TUK, TWI, UIG, UKR, UZB, VEN, VOL, WLN, CYM, FRY, WOL, XHO, YID, YOR, ZHA, ZUL, ORJ, QPC, TNG)
  }

  @js.native
  trait ListJobTemplatesRequest extends js.Object {
    var Category: js.UndefOr[__string]
    var ListBy: js.UndefOr[JobTemplateListBy]
    var MaxResults: js.UndefOr[__integerMin1Max20]
    var NextToken: js.UndefOr[__string]
    var Order: js.UndefOr[Order]
  }

  object ListJobTemplatesRequest {
    def apply(
      Category: js.UndefOr[__string] = js.undefined,
      ListBy: js.UndefOr[JobTemplateListBy] = js.undefined,
      MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined,
      NextToken: js.UndefOr[__string] = js.undefined,
      Order: js.UndefOr[Order] = js.undefined): ListJobTemplatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Category" -> Category.map { x => x.asInstanceOf[js.Any] },
        "ListBy" -> ListBy.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Order" -> Order.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobTemplatesRequest]
    }
  }

  @js.native
  trait ListJobTemplatesResponse extends js.Object {
    var JobTemplates: js.UndefOr[__listOfJobTemplate]
    var NextToken: js.UndefOr[__string]
  }

  object ListJobTemplatesResponse {
    def apply(
      JobTemplates: js.UndefOr[__listOfJobTemplate] = js.undefined,
      NextToken: js.UndefOr[__string] = js.undefined): ListJobTemplatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobTemplates" -> JobTemplates.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobTemplatesResponse]
    }
  }

  @js.native
  trait ListJobsRequest extends js.Object {
    var MaxResults: js.UndefOr[__integerMin1Max20]
    var NextToken: js.UndefOr[__string]
    var Order: js.UndefOr[Order]
    var Queue: js.UndefOr[__string]
    var Status: js.UndefOr[JobStatus]
  }

  object ListJobsRequest {
    def apply(
      MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined,
      NextToken: js.UndefOr[__string] = js.undefined,
      Order: js.UndefOr[Order] = js.undefined,
      Queue: js.UndefOr[__string] = js.undefined,
      Status: js.UndefOr[JobStatus] = js.undefined): ListJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Order" -> Order.map { x => x.asInstanceOf[js.Any] },
        "Queue" -> Queue.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsRequest]
    }
  }

  @js.native
  trait ListJobsResponse extends js.Object {
    var Jobs: js.UndefOr[__listOfJob]
    var NextToken: js.UndefOr[__string]
  }

  object ListJobsResponse {
    def apply(
      Jobs: js.UndefOr[__listOfJob] = js.undefined,
      NextToken: js.UndefOr[__string] = js.undefined): ListJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Jobs" -> Jobs.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsResponse]
    }
  }

  @js.native
  trait ListPresetsRequest extends js.Object {
    var Category: js.UndefOr[__string]
    var ListBy: js.UndefOr[PresetListBy]
    var MaxResults: js.UndefOr[__integerMin1Max20]
    var NextToken: js.UndefOr[__string]
    var Order: js.UndefOr[Order]
  }

  object ListPresetsRequest {
    def apply(
      Category: js.UndefOr[__string] = js.undefined,
      ListBy: js.UndefOr[PresetListBy] = js.undefined,
      MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined,
      NextToken: js.UndefOr[__string] = js.undefined,
      Order: js.UndefOr[Order] = js.undefined): ListPresetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Category" -> Category.map { x => x.asInstanceOf[js.Any] },
        "ListBy" -> ListBy.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Order" -> Order.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPresetsRequest]
    }
  }

  @js.native
  trait ListPresetsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Presets: js.UndefOr[__listOfPreset]
  }

  object ListPresetsResponse {
    def apply(
      NextToken: js.UndefOr[__string] = js.undefined,
      Presets: js.UndefOr[__listOfPreset] = js.undefined): ListPresetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Presets" -> Presets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPresetsResponse]
    }
  }

  @js.native
  trait ListQueuesRequest extends js.Object {
    var ListBy: js.UndefOr[QueueListBy]
    var MaxResults: js.UndefOr[__integerMin1Max20]
    var NextToken: js.UndefOr[__string]
    var Order: js.UndefOr[Order]
  }

  object ListQueuesRequest {
    def apply(
      ListBy: js.UndefOr[QueueListBy] = js.undefined,
      MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined,
      NextToken: js.UndefOr[__string] = js.undefined,
      Order: js.UndefOr[Order] = js.undefined): ListQueuesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ListBy" -> ListBy.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Order" -> Order.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQueuesRequest]
    }
  }

  @js.native
  trait ListQueuesResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Queues: js.UndefOr[__listOfQueue]
  }

  object ListQueuesResponse {
    def apply(
      NextToken: js.UndefOr[__string] = js.undefined,
      Queues: js.UndefOr[__listOfQueue] = js.undefined): ListQueuesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Queues" -> Queues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQueuesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var Arn: __string
  }

  object ListTagsForResourceRequest {
    def apply(
      Arn: __string): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var ResourceTags: js.UndefOr[ResourceTags]
  }

  object ListTagsForResourceResponse {
    def apply(
      ResourceTags: js.UndefOr[ResourceTags] = js.undefined): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceTags" -> ResourceTags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
   * Selects between the DVB and ATSC buffer models for Dolby Digital audio.
   */
  object M2tsAudioBufferModelEnum {
    val DVB = "DVB"
    val ATSC = "ATSC"

    val values = IndexedSeq(DVB, ATSC)
  }

  /**
   * Controls what buffer model to use for accurate interleaving. If set to MULTIPLEX, use multiplex  buffer model. If set to NONE, this can lead to lower latency, but low-memory devices may not be able to play back the stream without interruptions.
   */
  object M2tsBufferModelEnum {
    val MULTIPLEX = "MULTIPLEX"
    val NONE = "NONE"

    val values = IndexedSeq(MULTIPLEX, NONE)
  }

  /**
   * When set to VIDEO_AND_FIXED_INTERVALS, audio EBP markers will be added to partitions 3 and 4. The interval between these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval. When set to VIDEO_INTERVAL, these additional markers will not be inserted. Only applicable when EBP segmentation markers are is selected (segmentationMarkers is EBP or EBP_LEGACY).
   */
  object M2tsEbpAudioIntervalEnum {
    val VIDEO_AND_FIXED_INTERVALS = "VIDEO_AND_FIXED_INTERVALS"
    val VIDEO_INTERVAL = "VIDEO_INTERVAL"

    val values = IndexedSeq(VIDEO_AND_FIXED_INTERVALS, VIDEO_INTERVAL)
  }

  /**
   * Selects which PIDs to place EBP markers on. They can either be placed only on the video PID, or on both the video PID and all audio PIDs. Only applicable when EBP segmentation markers are is selected (segmentationMarkers is EBP or EBP_LEGACY).
   */
  object M2tsEbpPlacementEnum {
    val VIDEO_AND_AUDIO_PIDS = "VIDEO_AND_AUDIO_PIDS"
    val VIDEO_PID = "VIDEO_PID"

    val values = IndexedSeq(VIDEO_AND_AUDIO_PIDS, VIDEO_PID)
  }

  /**
   * Controls whether to include the ES Rate field in the PES header.
   */
  object M2tsEsRateInPesEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = IndexedSeq(INCLUDE, EXCLUDE)
  }

  /**
   * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
   */
  object M2tsNielsenId3Enum {
    val INSERT = "INSERT"
    val NONE = "NONE"

    val values = IndexedSeq(INSERT, NONE)
  }

  /**
   * When set to PCR_EVERY_PES_PACKET, a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This is effective only when the PCR PID is the same as the video or audio elementary stream.
   */
  object M2tsPcrControlEnum {
    val PCR_EVERY_PES_PACKET = "PCR_EVERY_PES_PACKET"
    val CONFIGURED_PCR_PERIOD = "CONFIGURED_PCR_PERIOD"

    val values = IndexedSeq(PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD)
  }

  /**
   * When set to CBR, inserts null packets into transport stream to fill specified bitrate. When set to VBR, the bitrate setting acts as the maximum bitrate, but the output will not be padded up to that bitrate.
   */
  object M2tsRateModeEnum {
    val VBR = "VBR"
    val CBR = "CBR"

    val values = IndexedSeq(VBR, CBR)
  }

  /**
   * Enables SCTE-35 passthrough (scte35Source) to pass any SCTE-35 signals from input to output.
   */
  object M2tsScte35SourceEnum {
    val PASSTHROUGH = "PASSTHROUGH"
    val NONE = "NONE"

    val values = IndexedSeq(PASSTHROUGH, NONE)
  }

  /**
   * Inserts segmentation markers at each segmentation_time period. rai_segstart sets the Random Access Indicator bit in the adaptation field. rai_adapt sets the RAI bit and adds the current timecode in the private data bytes. psi_segstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebp_legacy adds Encoder Boundary Point information to the adaptation field using a legacy proprietary format.
   */
  object M2tsSegmentationMarkersEnum {
    val NONE = "NONE"
    val RAI_SEGSTART = "RAI_SEGSTART"
    val RAI_ADAPT = "RAI_ADAPT"
    val PSI_SEGSTART = "PSI_SEGSTART"
    val EBP = "EBP"
    val EBP_LEGACY = "EBP_LEGACY"

    val values = IndexedSeq(NONE, RAI_SEGSTART, RAI_ADAPT, PSI_SEGSTART, EBP, EBP_LEGACY)
  }

  /**
   * The segmentation style parameter controls how segmentation markers are inserted into the transport stream. With avails, it is possible that segments may be truncated, which can influence where future segmentation markers are inserted. When a segmentation style of "reset_cadence" is selected and a segment is truncated due to an avail, we will reset the segmentation cadence. This means the subsequent segment will have a duration of of $segmentation_time seconds. When a segmentation style of "maintain_cadence" is selected and a segment is truncated due to an avail, we will not reset the segmentation cadence. This means the subsequent segment will likely be truncated as well. However, all segments after that will have a duration of $segmentation_time seconds. Note that EBP lookahead is a slight exception to this rule.
   */
  object M2tsSegmentationStyleEnum {
    val MAINTAIN_CADENCE = "MAINTAIN_CADENCE"
    val RESET_CADENCE = "RESET_CADENCE"

    val values = IndexedSeq(MAINTAIN_CADENCE, RESET_CADENCE)
  }

  /**
   * Settings for M2TS Container.
   */
  @js.native
  trait M2tsSettings extends js.Object {
    var AudioBufferModel: js.UndefOr[M2tsAudioBufferModel]
    var AudioFramesPerPes: js.UndefOr[__integerMin0Max2147483647]
    var AudioPids: js.UndefOr[__listOf__integerMin32Max8182]
    var Bitrate: js.UndefOr[__integerMin0Max2147483647]
    var BufferModel: js.UndefOr[M2tsBufferModel]
    var DvbNitSettings: js.UndefOr[DvbNitSettings]
    var DvbSdtSettings: js.UndefOr[DvbSdtSettings]
    var DvbSubPids: js.UndefOr[__listOf__integerMin32Max8182]
    var DvbTdtSettings: js.UndefOr[DvbTdtSettings]
    var DvbTeletextPid: js.UndefOr[__integerMin32Max8182]
    var EbpAudioInterval: js.UndefOr[M2tsEbpAudioInterval]
    var EbpPlacement: js.UndefOr[M2tsEbpPlacement]
    var EsRateInPes: js.UndefOr[M2tsEsRateInPes]
    var FragmentTime: js.UndefOr[__doubleMin0]
    var MaxPcrInterval: js.UndefOr[__integerMin0Max500]
    var MinEbpInterval: js.UndefOr[__integerMin0Max10000]
    var NielsenId3: js.UndefOr[M2tsNielsenId3]
    var NullPacketBitrate: js.UndefOr[__doubleMin0]
    var PatInterval: js.UndefOr[__integerMin0Max1000]
    var PcrControl: js.UndefOr[M2tsPcrControl]
    var PcrPid: js.UndefOr[__integerMin32Max8182]
    var PmtInterval: js.UndefOr[__integerMin0Max1000]
    var PmtPid: js.UndefOr[__integerMin32Max8182]
    var PrivateMetadataPid: js.UndefOr[__integerMin32Max8182]
    var ProgramNumber: js.UndefOr[__integerMin0Max65535]
    var RateMode: js.UndefOr[M2tsRateMode]
    var Scte35Pid: js.UndefOr[__integerMin32Max8182]
    var Scte35Source: js.UndefOr[M2tsScte35Source]
    var SegmentationMarkers: js.UndefOr[M2tsSegmentationMarkers]
    var SegmentationStyle: js.UndefOr[M2tsSegmentationStyle]
    var SegmentationTime: js.UndefOr[__doubleMin0]
    var TimedMetadataPid: js.UndefOr[__integerMin32Max8182]
    var TransportStreamId: js.UndefOr[__integerMin0Max65535]
    var VideoPid: js.UndefOr[__integerMin32Max8182]
  }

  object M2tsSettings {
    def apply(
      AudioBufferModel: js.UndefOr[M2tsAudioBufferModel] = js.undefined,
      AudioFramesPerPes: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      AudioPids: js.UndefOr[__listOf__integerMin32Max8182] = js.undefined,
      Bitrate: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      BufferModel: js.UndefOr[M2tsBufferModel] = js.undefined,
      DvbNitSettings: js.UndefOr[DvbNitSettings] = js.undefined,
      DvbSdtSettings: js.UndefOr[DvbSdtSettings] = js.undefined,
      DvbSubPids: js.UndefOr[__listOf__integerMin32Max8182] = js.undefined,
      DvbTdtSettings: js.UndefOr[DvbTdtSettings] = js.undefined,
      DvbTeletextPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
      EbpAudioInterval: js.UndefOr[M2tsEbpAudioInterval] = js.undefined,
      EbpPlacement: js.UndefOr[M2tsEbpPlacement] = js.undefined,
      EsRateInPes: js.UndefOr[M2tsEsRateInPes] = js.undefined,
      FragmentTime: js.UndefOr[__doubleMin0] = js.undefined,
      MaxPcrInterval: js.UndefOr[__integerMin0Max500] = js.undefined,
      MinEbpInterval: js.UndefOr[__integerMin0Max10000] = js.undefined,
      NielsenId3: js.UndefOr[M2tsNielsenId3] = js.undefined,
      NullPacketBitrate: js.UndefOr[__doubleMin0] = js.undefined,
      PatInterval: js.UndefOr[__integerMin0Max1000] = js.undefined,
      PcrControl: js.UndefOr[M2tsPcrControl] = js.undefined,
      PcrPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
      PmtInterval: js.UndefOr[__integerMin0Max1000] = js.undefined,
      PmtPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
      PrivateMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
      ProgramNumber: js.UndefOr[__integerMin0Max65535] = js.undefined,
      RateMode: js.UndefOr[M2tsRateMode] = js.undefined,
      Scte35Pid: js.UndefOr[__integerMin32Max8182] = js.undefined,
      Scte35Source: js.UndefOr[M2tsScte35Source] = js.undefined,
      SegmentationMarkers: js.UndefOr[M2tsSegmentationMarkers] = js.undefined,
      SegmentationStyle: js.UndefOr[M2tsSegmentationStyle] = js.undefined,
      SegmentationTime: js.UndefOr[__doubleMin0] = js.undefined,
      TimedMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
      TransportStreamId: js.UndefOr[__integerMin0Max65535] = js.undefined,
      VideoPid: js.UndefOr[__integerMin32Max8182] = js.undefined): M2tsSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AudioBufferModel" -> AudioBufferModel.map { x => x.asInstanceOf[js.Any] },
        "AudioFramesPerPes" -> AudioFramesPerPes.map { x => x.asInstanceOf[js.Any] },
        "AudioPids" -> AudioPids.map { x => x.asInstanceOf[js.Any] },
        "Bitrate" -> Bitrate.map { x => x.asInstanceOf[js.Any] },
        "BufferModel" -> BufferModel.map { x => x.asInstanceOf[js.Any] },
        "DvbNitSettings" -> DvbNitSettings.map { x => x.asInstanceOf[js.Any] },
        "DvbSdtSettings" -> DvbSdtSettings.map { x => x.asInstanceOf[js.Any] },
        "DvbSubPids" -> DvbSubPids.map { x => x.asInstanceOf[js.Any] },
        "DvbTdtSettings" -> DvbTdtSettings.map { x => x.asInstanceOf[js.Any] },
        "DvbTeletextPid" -> DvbTeletextPid.map { x => x.asInstanceOf[js.Any] },
        "EbpAudioInterval" -> EbpAudioInterval.map { x => x.asInstanceOf[js.Any] },
        "EbpPlacement" -> EbpPlacement.map { x => x.asInstanceOf[js.Any] },
        "EsRateInPes" -> EsRateInPes.map { x => x.asInstanceOf[js.Any] },
        "FragmentTime" -> FragmentTime.map { x => x.asInstanceOf[js.Any] },
        "MaxPcrInterval" -> MaxPcrInterval.map { x => x.asInstanceOf[js.Any] },
        "MinEbpInterval" -> MinEbpInterval.map { x => x.asInstanceOf[js.Any] },
        "NielsenId3" -> NielsenId3.map { x => x.asInstanceOf[js.Any] },
        "NullPacketBitrate" -> NullPacketBitrate.map { x => x.asInstanceOf[js.Any] },
        "PatInterval" -> PatInterval.map { x => x.asInstanceOf[js.Any] },
        "PcrControl" -> PcrControl.map { x => x.asInstanceOf[js.Any] },
        "PcrPid" -> PcrPid.map { x => x.asInstanceOf[js.Any] },
        "PmtInterval" -> PmtInterval.map { x => x.asInstanceOf[js.Any] },
        "PmtPid" -> PmtPid.map { x => x.asInstanceOf[js.Any] },
        "PrivateMetadataPid" -> PrivateMetadataPid.map { x => x.asInstanceOf[js.Any] },
        "ProgramNumber" -> ProgramNumber.map { x => x.asInstanceOf[js.Any] },
        "RateMode" -> RateMode.map { x => x.asInstanceOf[js.Any] },
        "Scte35Pid" -> Scte35Pid.map { x => x.asInstanceOf[js.Any] },
        "Scte35Source" -> Scte35Source.map { x => x.asInstanceOf[js.Any] },
        "SegmentationMarkers" -> SegmentationMarkers.map { x => x.asInstanceOf[js.Any] },
        "SegmentationStyle" -> SegmentationStyle.map { x => x.asInstanceOf[js.Any] },
        "SegmentationTime" -> SegmentationTime.map { x => x.asInstanceOf[js.Any] },
        "TimedMetadataPid" -> TimedMetadataPid.map { x => x.asInstanceOf[js.Any] },
        "TransportStreamId" -> TransportStreamId.map { x => x.asInstanceOf[js.Any] },
        "VideoPid" -> VideoPid.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[M2tsSettings]
    }
  }

  /**
   * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
   */
  object M3u8NielsenId3Enum {
    val INSERT = "INSERT"
    val NONE = "NONE"

    val values = IndexedSeq(INSERT, NONE)
  }

  /**
   * When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
   */
  object M3u8PcrControlEnum {
    val PCR_EVERY_PES_PACKET = "PCR_EVERY_PES_PACKET"
    val CONFIGURED_PCR_PERIOD = "CONFIGURED_PCR_PERIOD"

    val values = IndexedSeq(PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD)
  }

  /**
   * Enables SCTE-35 passthrough (scte35Source) to pass any SCTE-35 signals from input to output.
   */
  object M3u8Scte35SourceEnum {
    val PASSTHROUGH = "PASSTHROUGH"
    val NONE = "NONE"

    val values = IndexedSeq(PASSTHROUGH, NONE)
  }

  /**
   * Settings for TS segments in HLS
   */
  @js.native
  trait M3u8Settings extends js.Object {
    var AudioFramesPerPes: js.UndefOr[__integerMin0Max2147483647]
    var AudioPids: js.UndefOr[__listOf__integerMin32Max8182]
    var NielsenId3: js.UndefOr[M3u8NielsenId3]
    var PatInterval: js.UndefOr[__integerMin0Max1000]
    var PcrControl: js.UndefOr[M3u8PcrControl]
    var PcrPid: js.UndefOr[__integerMin32Max8182]
    var PmtInterval: js.UndefOr[__integerMin0Max1000]
    var PmtPid: js.UndefOr[__integerMin32Max8182]
    var PrivateMetadataPid: js.UndefOr[__integerMin32Max8182]
    var ProgramNumber: js.UndefOr[__integerMin0Max65535]
    var Scte35Pid: js.UndefOr[__integerMin32Max8182]
    var Scte35Source: js.UndefOr[M3u8Scte35Source]
    var TimedMetadata: js.UndefOr[TimedMetadata]
    var TimedMetadataPid: js.UndefOr[__integerMin32Max8182]
    var TransportStreamId: js.UndefOr[__integerMin0Max65535]
    var VideoPid: js.UndefOr[__integerMin32Max8182]
  }

  object M3u8Settings {
    def apply(
      AudioFramesPerPes: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      AudioPids: js.UndefOr[__listOf__integerMin32Max8182] = js.undefined,
      NielsenId3: js.UndefOr[M3u8NielsenId3] = js.undefined,
      PatInterval: js.UndefOr[__integerMin0Max1000] = js.undefined,
      PcrControl: js.UndefOr[M3u8PcrControl] = js.undefined,
      PcrPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
      PmtInterval: js.UndefOr[__integerMin0Max1000] = js.undefined,
      PmtPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
      PrivateMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
      ProgramNumber: js.UndefOr[__integerMin0Max65535] = js.undefined,
      Scte35Pid: js.UndefOr[__integerMin32Max8182] = js.undefined,
      Scte35Source: js.UndefOr[M3u8Scte35Source] = js.undefined,
      TimedMetadata: js.UndefOr[TimedMetadata] = js.undefined,
      TimedMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
      TransportStreamId: js.UndefOr[__integerMin0Max65535] = js.undefined,
      VideoPid: js.UndefOr[__integerMin32Max8182] = js.undefined): M3u8Settings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AudioFramesPerPes" -> AudioFramesPerPes.map { x => x.asInstanceOf[js.Any] },
        "AudioPids" -> AudioPids.map { x => x.asInstanceOf[js.Any] },
        "NielsenId3" -> NielsenId3.map { x => x.asInstanceOf[js.Any] },
        "PatInterval" -> PatInterval.map { x => x.asInstanceOf[js.Any] },
        "PcrControl" -> PcrControl.map { x => x.asInstanceOf[js.Any] },
        "PcrPid" -> PcrPid.map { x => x.asInstanceOf[js.Any] },
        "PmtInterval" -> PmtInterval.map { x => x.asInstanceOf[js.Any] },
        "PmtPid" -> PmtPid.map { x => x.asInstanceOf[js.Any] },
        "PrivateMetadataPid" -> PrivateMetadataPid.map { x => x.asInstanceOf[js.Any] },
        "ProgramNumber" -> ProgramNumber.map { x => x.asInstanceOf[js.Any] },
        "Scte35Pid" -> Scte35Pid.map { x => x.asInstanceOf[js.Any] },
        "Scte35Source" -> Scte35Source.map { x => x.asInstanceOf[js.Any] },
        "TimedMetadata" -> TimedMetadata.map { x => x.asInstanceOf[js.Any] },
        "TimedMetadataPid" -> TimedMetadataPid.map { x => x.asInstanceOf[js.Any] },
        "TransportStreamId" -> TransportStreamId.map { x => x.asInstanceOf[js.Any] },
        "VideoPid" -> VideoPid.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[M3u8Settings]
    }
  }

  /**
   * Overlay motion graphics on top of your video at the time that you specify.
   */
  @js.native
  trait MotionImageInserter extends js.Object {
    var Framerate: js.UndefOr[MotionImageInsertionFramerate]
    var Input: js.UndefOr[__stringMin14Max1285PatternS3Mov09Png]
    var InsertionMode: js.UndefOr[MotionImageInsertionMode]
    var Offset: js.UndefOr[MotionImageInsertionOffset]
    var Playback: js.UndefOr[MotionImagePlayback]
    var StartTime: js.UndefOr[__stringMin11Max11Pattern01D20305D205D]
  }

  object MotionImageInserter {
    def apply(
      Framerate: js.UndefOr[MotionImageInsertionFramerate] = js.undefined,
      Input: js.UndefOr[__stringMin14Max1285PatternS3Mov09Png] = js.undefined,
      InsertionMode: js.UndefOr[MotionImageInsertionMode] = js.undefined,
      Offset: js.UndefOr[MotionImageInsertionOffset] = js.undefined,
      Playback: js.UndefOr[MotionImagePlayback] = js.undefined,
      StartTime: js.UndefOr[__stringMin11Max11Pattern01D20305D205D] = js.undefined): MotionImageInserter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Framerate" -> Framerate.map { x => x.asInstanceOf[js.Any] },
        "Input" -> Input.map { x => x.asInstanceOf[js.Any] },
        "InsertionMode" -> InsertionMode.map { x => x.asInstanceOf[js.Any] },
        "Offset" -> Offset.map { x => x.asInstanceOf[js.Any] },
        "Playback" -> Playback.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MotionImageInserter]
    }
  }

  /**
   * For motion overlays that don't have a built-in framerate, specify the framerate of the overlay in frames per second, as a fraction. For example, specify 24 fps as 24/1. The overlay framerate doesn't need to match the framerate of the underlying video.
   */
  @js.native
  trait MotionImageInsertionFramerate extends js.Object {
    var FramerateDenominator: js.UndefOr[__integerMin1Max17895697]
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483640]
  }

  object MotionImageInsertionFramerate {
    def apply(
      FramerateDenominator: js.UndefOr[__integerMin1Max17895697] = js.undefined,
      FramerateNumerator: js.UndefOr[__integerMin1Max2147483640] = js.undefined): MotionImageInsertionFramerate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FramerateDenominator" -> FramerateDenominator.map { x => x.asInstanceOf[js.Any] },
        "FramerateNumerator" -> FramerateNumerator.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MotionImageInsertionFramerate]
    }
  }

  /**
   * Choose the type of motion graphic asset that you are providing for your overlay. You can choose either a .mov file or a series of .png files.
   */
  object MotionImageInsertionModeEnum {
    val MOV = "MOV"
    val PNG = "PNG"

    val values = IndexedSeq(MOV, PNG)
  }

  /**
   * Specify the offset between the upper-left corner of the video frame and the top left corner of the overlay.
   */
  @js.native
  trait MotionImageInsertionOffset extends js.Object {
    var ImageX: js.UndefOr[__integerMin0Max2147483647]
    var ImageY: js.UndefOr[__integerMin0Max2147483647]
  }

  object MotionImageInsertionOffset {
    def apply(
      ImageX: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      ImageY: js.UndefOr[__integerMin0Max2147483647] = js.undefined): MotionImageInsertionOffset = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ImageX" -> ImageX.map { x => x.asInstanceOf[js.Any] },
        "ImageY" -> ImageY.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MotionImageInsertionOffset]
    }
  }

  /**
   * Specify whether your motion graphic overlay repeats on a loop or plays only once.
   */
  object MotionImagePlaybackEnum {
    val ONCE = "ONCE"
    val REPEAT = "REPEAT"

    val values = IndexedSeq(ONCE, REPEAT)
  }

  /**
   * When enabled, include 'clap' atom if appropriate for the video output settings.
   */
  object MovClapAtomEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = IndexedSeq(INCLUDE, EXCLUDE)
  }

  /**
   * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
   */
  object MovCslgAtomEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = IndexedSeq(INCLUDE, EXCLUDE)
  }

  /**
   * When set to XDCAM, writes MPEG2 video streams into the QuickTime file using XDCAM fourcc codes. This increases compatibility with Apple editors and players, but may decrease compatibility with other players. Only applicable when the video codec is MPEG2.
   */
  object MovMpeg2FourCCControlEnum {
    val XDCAM = "XDCAM"
    val MPEG = "MPEG"

    val values = IndexedSeq(XDCAM, MPEG)
  }

  /**
   * If set to OMNEON, inserts Omneon-compatible padding
   */
  object MovPaddingControlEnum {
    val OMNEON = "OMNEON"
    val NONE = "NONE"

    val values = IndexedSeq(OMNEON, NONE)
  }

  /**
   * A value of 'external' creates separate media files and the wrapper file (.mov) contains references to these media files. A value of 'self_contained' creates only a wrapper (.mov) file and this file contains all of the media.
   */
  object MovReferenceEnum {
    val SELF_CONTAINED = "SELF_CONTAINED"
    val EXTERNAL = "EXTERNAL"

    val values = IndexedSeq(SELF_CONTAINED, EXTERNAL)
  }

  /**
   * Settings for MOV Container.
   */
  @js.native
  trait MovSettings extends js.Object {
    var ClapAtom: js.UndefOr[MovClapAtom]
    var CslgAtom: js.UndefOr[MovCslgAtom]
    var Mpeg2FourCCControl: js.UndefOr[MovMpeg2FourCCControl]
    var PaddingControl: js.UndefOr[MovPaddingControl]
    var Reference: js.UndefOr[MovReference]
  }

  object MovSettings {
    def apply(
      ClapAtom: js.UndefOr[MovClapAtom] = js.undefined,
      CslgAtom: js.UndefOr[MovCslgAtom] = js.undefined,
      Mpeg2FourCCControl: js.UndefOr[MovMpeg2FourCCControl] = js.undefined,
      PaddingControl: js.UndefOr[MovPaddingControl] = js.undefined,
      Reference: js.UndefOr[MovReference] = js.undefined): MovSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClapAtom" -> ClapAtom.map { x => x.asInstanceOf[js.Any] },
        "CslgAtom" -> CslgAtom.map { x => x.asInstanceOf[js.Any] },
        "Mpeg2FourCCControl" -> Mpeg2FourCCControl.map { x => x.asInstanceOf[js.Any] },
        "PaddingControl" -> PaddingControl.map { x => x.asInstanceOf[js.Any] },
        "Reference" -> Reference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MovSettings]
    }
  }

  /**
   * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value MP2.
   */
  @js.native
  trait Mp2Settings extends js.Object {
    var Bitrate: js.UndefOr[__integerMin32000Max384000]
    var Channels: js.UndefOr[__integerMin1Max2]
    var SampleRate: js.UndefOr[__integerMin32000Max48000]
  }

  object Mp2Settings {
    def apply(
      Bitrate: js.UndefOr[__integerMin32000Max384000] = js.undefined,
      Channels: js.UndefOr[__integerMin1Max2] = js.undefined,
      SampleRate: js.UndefOr[__integerMin32000Max48000] = js.undefined): Mp2Settings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bitrate" -> Bitrate.map { x => x.asInstanceOf[js.Any] },
        "Channels" -> Channels.map { x => x.asInstanceOf[js.Any] },
        "SampleRate" -> SampleRate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Mp2Settings]
    }
  }

  /**
   * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
   */
  object Mp4CslgAtomEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = IndexedSeq(INCLUDE, EXCLUDE)
  }

  /**
   * Inserts a free-space box immediately after the moov box.
   */
  object Mp4FreeSpaceBoxEnum {
    val INCLUDE = "INCLUDE"
    val EXCLUDE = "EXCLUDE"

    val values = IndexedSeq(INCLUDE, EXCLUDE)
  }

  /**
   * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
   */
  object Mp4MoovPlacementEnum {
    val PROGRESSIVE_DOWNLOAD = "PROGRESSIVE_DOWNLOAD"
    val NORMAL = "NORMAL"

    val values = IndexedSeq(PROGRESSIVE_DOWNLOAD, NORMAL)
  }

  /**
   * Settings for MP4 Container
   */
  @js.native
  trait Mp4Settings extends js.Object {
    var CslgAtom: js.UndefOr[Mp4CslgAtom]
    var FreeSpaceBox: js.UndefOr[Mp4FreeSpaceBox]
    var MoovPlacement: js.UndefOr[Mp4MoovPlacement]
    var Mp4MajorBrand: js.UndefOr[__string]
  }

  object Mp4Settings {
    def apply(
      CslgAtom: js.UndefOr[Mp4CslgAtom] = js.undefined,
      FreeSpaceBox: js.UndefOr[Mp4FreeSpaceBox] = js.undefined,
      MoovPlacement: js.UndefOr[Mp4MoovPlacement] = js.undefined,
      Mp4MajorBrand: js.UndefOr[__string] = js.undefined): Mp4Settings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CslgAtom" -> CslgAtom.map { x => x.asInstanceOf[js.Any] },
        "FreeSpaceBox" -> FreeSpaceBox.map { x => x.asInstanceOf[js.Any] },
        "MoovPlacement" -> MoovPlacement.map { x => x.asInstanceOf[js.Any] },
        "Mp4MajorBrand" -> Mp4MajorBrand.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Mp4Settings]
    }
  }

  /**
   * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
   */
  object Mpeg2AdaptiveQuantizationEnum {
    val OFF = "OFF"
    val LOW = "LOW"
    val MEDIUM = "MEDIUM"
    val HIGH = "HIGH"

    val values = IndexedSeq(OFF, LOW, MEDIUM, HIGH)
  }

  /**
   * Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
   */
  object Mpeg2CodecLevelEnum {
    val AUTO = "AUTO"
    val LOW = "LOW"
    val MAIN = "MAIN"
    val HIGH1440 = "HIGH1440"
    val HIGH = "HIGH"

    val values = IndexedSeq(AUTO, LOW, MAIN, HIGH1440, HIGH)
  }

  /**
   * Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video output.
   */
  object Mpeg2CodecProfileEnum {
    val MAIN = "MAIN"
    val PROFILE_422 = "PROFILE_422"

    val values = IndexedSeq(MAIN, PROFILE_422)
  }

  /**
   * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
   */
  object Mpeg2DynamicSubGopEnum {
    val ADAPTIVE = "ADAPTIVE"
    val STATIC = "STATIC"

    val values = IndexedSeq(ADAPTIVE, STATIC)
  }

  /**
   * If you are using the console, use the Framerate setting to specify the framerate for this output. If you want to keep the same framerate as the input video, choose Follow source. If you want to do framerate conversion, choose a framerate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your framerate as a fraction. If you are creating your transcoding job sepecification as a JSON file without the console, use FramerateControl to specify which value the service uses for the framerate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the framerate from the input. Choose SPECIFIED if you want the service to use the framerate you specify in the settings FramerateNumerator and FramerateDenominator.
   */
  object Mpeg2FramerateControlEnum {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE"
    val SPECIFIED = "SPECIFIED"

    val values = IndexedSeq(INITIALIZE_FROM_SOURCE, SPECIFIED)
  }

  /**
   * When set to INTERPOLATE, produces smoother motion during framerate conversion.
   */
  object Mpeg2FramerateConversionAlgorithmEnum {
    val DUPLICATE_DROP = "DUPLICATE_DROP"
    val INTERPOLATE = "INTERPOLATE"

    val values = IndexedSeq(DUPLICATE_DROP, INTERPOLATE)
  }

  /**
   * Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
   */
  object Mpeg2GopSizeUnitsEnum {
    val FRAMES = "FRAMES"
    val SECONDS = "SECONDS"

    val values = IndexedSeq(FRAMES, SECONDS)
  }

  /**
   * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type.
   * - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
   * - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
   */
  object Mpeg2InterlaceModeEnum {
    val PROGRESSIVE = "PROGRESSIVE"
    val TOP_FIELD = "TOP_FIELD"
    val BOTTOM_FIELD = "BOTTOM_FIELD"
    val FOLLOW_TOP_FIELD = "FOLLOW_TOP_FIELD"
    val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD"

    val values = IndexedSeq(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD)
  }

  /**
   * Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision for intra-block DC coefficients. If you choose the value auto, the service will automatically select the precision based on the per-frame compression ratio.
   */
  object Mpeg2IntraDcPrecisionEnum {
    val AUTO = "AUTO"
    val INTRA_DC_PRECISION_8 = "INTRA_DC_PRECISION_8"
    val INTRA_DC_PRECISION_9 = "INTRA_DC_PRECISION_9"
    val INTRA_DC_PRECISION_10 = "INTRA_DC_PRECISION_10"
    val INTRA_DC_PRECISION_11 = "INTRA_DC_PRECISION_11"

    val values = IndexedSeq(AUTO, INTRA_DC_PRECISION_8, INTRA_DC_PRECISION_9, INTRA_DC_PRECISION_10, INTRA_DC_PRECISION_11)
  }

  /**
   * Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the input. Using the console, do this by choosing Follow source for Pixel aspect ratio.
   */
  object Mpeg2ParControlEnum {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE"
    val SPECIFIED = "SPECIFIED"

    val values = IndexedSeq(INITIALIZE_FROM_SOURCE, SPECIFIED)
  }

  /**
   * Use Quality tuning level (Mpeg2QualityTuningLevel) to specifiy whether to use single-pass or multipass video encoding.
   */
  object Mpeg2QualityTuningLevelEnum {
    val SINGLE_PASS = "SINGLE_PASS"
    val MULTI_PASS = "MULTI_PASS"

    val values = IndexedSeq(SINGLE_PASS, MULTI_PASS)
  }

  /**
   * Use Rate control mode (Mpeg2RateControlMode) to specifiy whether the bitrate is variable (vbr) or constant (cbr).
   */
  object Mpeg2RateControlModeEnum {
    val VBR = "VBR"
    val CBR = "CBR"

    val values = IndexedSeq(VBR, CBR)
  }

  /**
   * Scene change detection (inserts I-frames on scene changes).
   */
  object Mpeg2SceneChangeDetectEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value MPEG2.
   */
  @js.native
  trait Mpeg2Settings extends js.Object {
    var AdaptiveQuantization: js.UndefOr[Mpeg2AdaptiveQuantization]
    var Bitrate: js.UndefOr[__integerMin1000Max288000000]
    var CodecLevel: js.UndefOr[Mpeg2CodecLevel]
    var CodecProfile: js.UndefOr[Mpeg2CodecProfile]
    var DynamicSubGop: js.UndefOr[Mpeg2DynamicSubGop]
    var FramerateControl: js.UndefOr[Mpeg2FramerateControl]
    var FramerateConversionAlgorithm: js.UndefOr[Mpeg2FramerateConversionAlgorithm]
    var FramerateDenominator: js.UndefOr[__integerMin1Max1001]
    var FramerateNumerator: js.UndefOr[__integerMin24Max60000]
    var GopClosedCadence: js.UndefOr[__integerMin0Max2147483647]
    var GopSize: js.UndefOr[__doubleMin0]
    var GopSizeUnits: js.UndefOr[Mpeg2GopSizeUnits]
    var HrdBufferInitialFillPercentage: js.UndefOr[__integerMin0Max100]
    var HrdBufferSize: js.UndefOr[__integerMin0Max47185920]
    var InterlaceMode: js.UndefOr[Mpeg2InterlaceMode]
    var IntraDcPrecision: js.UndefOr[Mpeg2IntraDcPrecision]
    var MaxBitrate: js.UndefOr[__integerMin1000Max300000000]
    var MinIInterval: js.UndefOr[__integerMin0Max30]
    var NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin0Max7]
    var ParControl: js.UndefOr[Mpeg2ParControl]
    var ParDenominator: js.UndefOr[__integerMin1Max2147483647]
    var ParNumerator: js.UndefOr[__integerMin1Max2147483647]
    var QualityTuningLevel: js.UndefOr[Mpeg2QualityTuningLevel]
    var RateControlMode: js.UndefOr[Mpeg2RateControlMode]
    var SceneChangeDetect: js.UndefOr[Mpeg2SceneChangeDetect]
    var SlowPal: js.UndefOr[Mpeg2SlowPal]
    var Softness: js.UndefOr[__integerMin0Max128]
    var SpatialAdaptiveQuantization: js.UndefOr[Mpeg2SpatialAdaptiveQuantization]
    var Syntax: js.UndefOr[Mpeg2Syntax]
    var Telecine: js.UndefOr[Mpeg2Telecine]
    var TemporalAdaptiveQuantization: js.UndefOr[Mpeg2TemporalAdaptiveQuantization]
  }

  object Mpeg2Settings {
    def apply(
      AdaptiveQuantization: js.UndefOr[Mpeg2AdaptiveQuantization] = js.undefined,
      Bitrate: js.UndefOr[__integerMin1000Max288000000] = js.undefined,
      CodecLevel: js.UndefOr[Mpeg2CodecLevel] = js.undefined,
      CodecProfile: js.UndefOr[Mpeg2CodecProfile] = js.undefined,
      DynamicSubGop: js.UndefOr[Mpeg2DynamicSubGop] = js.undefined,
      FramerateControl: js.UndefOr[Mpeg2FramerateControl] = js.undefined,
      FramerateConversionAlgorithm: js.UndefOr[Mpeg2FramerateConversionAlgorithm] = js.undefined,
      FramerateDenominator: js.UndefOr[__integerMin1Max1001] = js.undefined,
      FramerateNumerator: js.UndefOr[__integerMin24Max60000] = js.undefined,
      GopClosedCadence: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      GopSize: js.UndefOr[__doubleMin0] = js.undefined,
      GopSizeUnits: js.UndefOr[Mpeg2GopSizeUnits] = js.undefined,
      HrdBufferInitialFillPercentage: js.UndefOr[__integerMin0Max100] = js.undefined,
      HrdBufferSize: js.UndefOr[__integerMin0Max47185920] = js.undefined,
      InterlaceMode: js.UndefOr[Mpeg2InterlaceMode] = js.undefined,
      IntraDcPrecision: js.UndefOr[Mpeg2IntraDcPrecision] = js.undefined,
      MaxBitrate: js.UndefOr[__integerMin1000Max300000000] = js.undefined,
      MinIInterval: js.UndefOr[__integerMin0Max30] = js.undefined,
      NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin0Max7] = js.undefined,
      ParControl: js.UndefOr[Mpeg2ParControl] = js.undefined,
      ParDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      ParNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      QualityTuningLevel: js.UndefOr[Mpeg2QualityTuningLevel] = js.undefined,
      RateControlMode: js.UndefOr[Mpeg2RateControlMode] = js.undefined,
      SceneChangeDetect: js.UndefOr[Mpeg2SceneChangeDetect] = js.undefined,
      SlowPal: js.UndefOr[Mpeg2SlowPal] = js.undefined,
      Softness: js.UndefOr[__integerMin0Max128] = js.undefined,
      SpatialAdaptiveQuantization: js.UndefOr[Mpeg2SpatialAdaptiveQuantization] = js.undefined,
      Syntax: js.UndefOr[Mpeg2Syntax] = js.undefined,
      Telecine: js.UndefOr[Mpeg2Telecine] = js.undefined,
      TemporalAdaptiveQuantization: js.UndefOr[Mpeg2TemporalAdaptiveQuantization] = js.undefined): Mpeg2Settings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdaptiveQuantization" -> AdaptiveQuantization.map { x => x.asInstanceOf[js.Any] },
        "Bitrate" -> Bitrate.map { x => x.asInstanceOf[js.Any] },
        "CodecLevel" -> CodecLevel.map { x => x.asInstanceOf[js.Any] },
        "CodecProfile" -> CodecProfile.map { x => x.asInstanceOf[js.Any] },
        "DynamicSubGop" -> DynamicSubGop.map { x => x.asInstanceOf[js.Any] },
        "FramerateControl" -> FramerateControl.map { x => x.asInstanceOf[js.Any] },
        "FramerateConversionAlgorithm" -> FramerateConversionAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "FramerateDenominator" -> FramerateDenominator.map { x => x.asInstanceOf[js.Any] },
        "FramerateNumerator" -> FramerateNumerator.map { x => x.asInstanceOf[js.Any] },
        "GopClosedCadence" -> GopClosedCadence.map { x => x.asInstanceOf[js.Any] },
        "GopSize" -> GopSize.map { x => x.asInstanceOf[js.Any] },
        "GopSizeUnits" -> GopSizeUnits.map { x => x.asInstanceOf[js.Any] },
        "HrdBufferInitialFillPercentage" -> HrdBufferInitialFillPercentage.map { x => x.asInstanceOf[js.Any] },
        "HrdBufferSize" -> HrdBufferSize.map { x => x.asInstanceOf[js.Any] },
        "InterlaceMode" -> InterlaceMode.map { x => x.asInstanceOf[js.Any] },
        "IntraDcPrecision" -> IntraDcPrecision.map { x => x.asInstanceOf[js.Any] },
        "MaxBitrate" -> MaxBitrate.map { x => x.asInstanceOf[js.Any] },
        "MinIInterval" -> MinIInterval.map { x => x.asInstanceOf[js.Any] },
        "NumberBFramesBetweenReferenceFrames" -> NumberBFramesBetweenReferenceFrames.map { x => x.asInstanceOf[js.Any] },
        "ParControl" -> ParControl.map { x => x.asInstanceOf[js.Any] },
        "ParDenominator" -> ParDenominator.map { x => x.asInstanceOf[js.Any] },
        "ParNumerator" -> ParNumerator.map { x => x.asInstanceOf[js.Any] },
        "QualityTuningLevel" -> QualityTuningLevel.map { x => x.asInstanceOf[js.Any] },
        "RateControlMode" -> RateControlMode.map { x => x.asInstanceOf[js.Any] },
        "SceneChangeDetect" -> SceneChangeDetect.map { x => x.asInstanceOf[js.Any] },
        "SlowPal" -> SlowPal.map { x => x.asInstanceOf[js.Any] },
        "Softness" -> Softness.map { x => x.asInstanceOf[js.Any] },
        "SpatialAdaptiveQuantization" -> SpatialAdaptiveQuantization.map { x => x.asInstanceOf[js.Any] },
        "Syntax" -> Syntax.map { x => x.asInstanceOf[js.Any] },
        "Telecine" -> Telecine.map { x => x.asInstanceOf[js.Any] },
        "TemporalAdaptiveQuantization" -> TemporalAdaptiveQuantization.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Mpeg2Settings]
    }
  }

  /**
   * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
   */
  object Mpeg2SlowPalEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Adjust quantization within each frame based on spatial variation of content complexity.
   */
  object Mpeg2SpatialAdaptiveQuantizationEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Produces a Type D-10 compatible bitstream (SMPTE 356M-2001).
   */
  object Mpeg2SyntaxEnum {
    val DEFAULT = "DEFAULT"
    val D_10 = "D_10"

    val values = IndexedSeq(DEFAULT, D_10)
  }

  /**
   * Only use Telecine (Mpeg2Telecine) when you set Framerate (Framerate) to 29.970. Set Telecine (Mpeg2Telecine) to Hard (hard) to produce a 29.97i output from a 23.976 input. Set it to Soft (soft) to produce 23.976 output and leave converstion to the player.
   */
  object Mpeg2TelecineEnum {
    val NONE = "NONE"
    val SOFT = "SOFT"
    val HARD = "HARD"

    val values = IndexedSeq(NONE, SOFT, HARD)
  }

  /**
   * Adjust quantization within each frame based on temporal variation of content complexity.
   */
  object Mpeg2TemporalAdaptiveQuantizationEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings across a Microsoft Smooth output group into a single audio stream.
   */
  object MsSmoothAudioDeduplicationEnum {
    val COMBINE_DUPLICATE_STREAMS = "COMBINE_DUPLICATE_STREAMS"
    val NONE = "NONE"

    val values = IndexedSeq(COMBINE_DUPLICATE_STREAMS, NONE)
  }

  /**
   * If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to specify the value SpekeKeyProvider.
   */
  @js.native
  trait MsSmoothEncryptionSettings extends js.Object {
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProvider]
  }

  object MsSmoothEncryptionSettings {
    def apply(
      SpekeKeyProvider: js.UndefOr[SpekeKeyProvider] = js.undefined): MsSmoothEncryptionSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SpekeKeyProvider" -> SpekeKeyProvider.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MsSmoothEncryptionSettings]
    }
  }

  /**
   * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to MS_SMOOTH_GROUP_SETTINGS.
   */
  @js.native
  trait MsSmoothGroupSettings extends js.Object {
    var AudioDeduplication: js.UndefOr[MsSmoothAudioDeduplication]
    var Destination: js.UndefOr[__stringPatternS3]
    var Encryption: js.UndefOr[MsSmoothEncryptionSettings]
    var FragmentLength: js.UndefOr[__integerMin1Max2147483647]
    var ManifestEncoding: js.UndefOr[MsSmoothManifestEncoding]
  }

  object MsSmoothGroupSettings {
    def apply(
      AudioDeduplication: js.UndefOr[MsSmoothAudioDeduplication] = js.undefined,
      Destination: js.UndefOr[__stringPatternS3] = js.undefined,
      Encryption: js.UndefOr[MsSmoothEncryptionSettings] = js.undefined,
      FragmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      ManifestEncoding: js.UndefOr[MsSmoothManifestEncoding] = js.undefined): MsSmoothGroupSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AudioDeduplication" -> AudioDeduplication.map { x => x.asInstanceOf[js.Any] },
        "Destination" -> Destination.map { x => x.asInstanceOf[js.Any] },
        "Encryption" -> Encryption.map { x => x.asInstanceOf[js.Any] },
        "FragmentLength" -> FragmentLength.map { x => x.asInstanceOf[js.Any] },
        "ManifestEncoding" -> ManifestEncoding.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MsSmoothGroupSettings]
    }
  }

  /**
   * Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding format for the server and client manifest. Valid options are utf8 and utf16.
   */
  object MsSmoothManifestEncodingEnum {
    val UTF8 = "UTF8"
    val UTF16 = "UTF16"

    val values = IndexedSeq(UTF8, UTF16)
  }

  /**
   * Settings for Nielsen Configuration
   */
  @js.native
  trait NielsenConfiguration extends js.Object {
    var BreakoutCode: js.UndefOr[__integerMin0Max9]
    var DistributorId: js.UndefOr[__string]
  }

  object NielsenConfiguration {
    def apply(
      BreakoutCode: js.UndefOr[__integerMin0Max9] = js.undefined,
      DistributorId: js.UndefOr[__string] = js.undefined): NielsenConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BreakoutCode" -> BreakoutCode.map { x => x.asInstanceOf[js.Any] },
        "DistributorId" -> DistributorId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NielsenConfiguration]
    }
  }

  /**
   * Enable the Noise reducer (NoiseReducer) feature to remove noise from your video output if necessary. Enable or disable this feature for each output individually. This setting is disabled by default. When you enable Noise reducer (NoiseReducer), you must also select a value for Noise reducer filter (NoiseReducerFilter).
   */
  @js.native
  trait NoiseReducer extends js.Object {
    var Filter: js.UndefOr[NoiseReducerFilter]
    var FilterSettings: js.UndefOr[NoiseReducerFilterSettings]
    var SpatialFilterSettings: js.UndefOr[NoiseReducerSpatialFilterSettings]
  }

  object NoiseReducer {
    def apply(
      Filter: js.UndefOr[NoiseReducerFilter] = js.undefined,
      FilterSettings: js.UndefOr[NoiseReducerFilterSettings] = js.undefined,
      SpatialFilterSettings: js.UndefOr[NoiseReducerSpatialFilterSettings] = js.undefined): NoiseReducer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "FilterSettings" -> FilterSettings.map { x => x.asInstanceOf[js.Any] },
        "SpatialFilterSettings" -> SpatialFilterSettings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NoiseReducer]
    }
  }

  /**
   * Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering functions. To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral is an edge preserving noise reduction filter. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) are convolution filters. * Conserve is a min/max noise reduction filter. * Spatial is a frequency-domain filter based on JND principles.
   */
  object NoiseReducerFilterEnum {
    val BILATERAL = "BILATERAL"
    val MEAN = "MEAN"
    val GAUSSIAN = "GAUSSIAN"
    val LANCZOS = "LANCZOS"
    val SHARPEN = "SHARPEN"
    val CONSERVE = "CONSERVE"
    val SPATIAL = "SPATIAL"

    val values = IndexedSeq(BILATERAL, MEAN, GAUSSIAN, LANCZOS, SHARPEN, CONSERVE, SPATIAL)
  }

  /**
   * Settings for a noise reducer filter
   */
  @js.native
  trait NoiseReducerFilterSettings extends js.Object {
    var Strength: js.UndefOr[__integerMin0Max3]
  }

  object NoiseReducerFilterSettings {
    def apply(
      Strength: js.UndefOr[__integerMin0Max3] = js.undefined): NoiseReducerFilterSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Strength" -> Strength.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NoiseReducerFilterSettings]
    }
  }

  /**
   * Noise reducer filter settings for spatial filter.
   */
  @js.native
  trait NoiseReducerSpatialFilterSettings extends js.Object {
    var PostFilterSharpenStrength: js.UndefOr[__integerMin0Max3]
    var Speed: js.UndefOr[__integerMinNegative2Max3]
    var Strength: js.UndefOr[__integerMin0Max16]
  }

  object NoiseReducerSpatialFilterSettings {
    def apply(
      PostFilterSharpenStrength: js.UndefOr[__integerMin0Max3] = js.undefined,
      Speed: js.UndefOr[__integerMinNegative2Max3] = js.undefined,
      Strength: js.UndefOr[__integerMin0Max16] = js.undefined): NoiseReducerSpatialFilterSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PostFilterSharpenStrength" -> PostFilterSharpenStrength.map { x => x.asInstanceOf[js.Any] },
        "Speed" -> Speed.map { x => x.asInstanceOf[js.Any] },
        "Strength" -> Strength.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NoiseReducerSpatialFilterSettings]
    }
  }

  /**
   * When you request lists of resources, you can optionally specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource.
   */
  object OrderEnum {
    val ASCENDING = "ASCENDING"
    val DESCENDING = "DESCENDING"

    val values = IndexedSeq(ASCENDING, DESCENDING)
  }

  /**
   * An output object describes the settings for a single output file or stream in an output group.
   */
  @js.native
  trait Output extends js.Object {
    var AudioDescriptions: js.UndefOr[__listOfAudioDescription]
    var CaptionDescriptions: js.UndefOr[__listOfCaptionDescription]
    var ContainerSettings: js.UndefOr[ContainerSettings]
    var Extension: js.UndefOr[__string]
    var NameModifier: js.UndefOr[__stringMin1]
    var OutputSettings: js.UndefOr[OutputSettings]
    var Preset: js.UndefOr[__stringMin0]
    var VideoDescription: js.UndefOr[VideoDescription]
  }

  object Output {
    def apply(
      AudioDescriptions: js.UndefOr[__listOfAudioDescription] = js.undefined,
      CaptionDescriptions: js.UndefOr[__listOfCaptionDescription] = js.undefined,
      ContainerSettings: js.UndefOr[ContainerSettings] = js.undefined,
      Extension: js.UndefOr[__string] = js.undefined,
      NameModifier: js.UndefOr[__stringMin1] = js.undefined,
      OutputSettings: js.UndefOr[OutputSettings] = js.undefined,
      Preset: js.UndefOr[__stringMin0] = js.undefined,
      VideoDescription: js.UndefOr[VideoDescription] = js.undefined): Output = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AudioDescriptions" -> AudioDescriptions.map { x => x.asInstanceOf[js.Any] },
        "CaptionDescriptions" -> CaptionDescriptions.map { x => x.asInstanceOf[js.Any] },
        "ContainerSettings" -> ContainerSettings.map { x => x.asInstanceOf[js.Any] },
        "Extension" -> Extension.map { x => x.asInstanceOf[js.Any] },
        "NameModifier" -> NameModifier.map { x => x.asInstanceOf[js.Any] },
        "OutputSettings" -> OutputSettings.map { x => x.asInstanceOf[js.Any] },
        "Preset" -> Preset.map { x => x.asInstanceOf[js.Any] },
        "VideoDescription" -> VideoDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Output]
    }
  }

  /**
   * OutputChannel mapping settings.
   */
  @js.native
  trait OutputChannelMapping extends js.Object {
    var InputChannels: js.UndefOr[__listOf__integerMinNegative60Max6]
  }

  object OutputChannelMapping {
    def apply(
      InputChannels: js.UndefOr[__listOf__integerMinNegative60Max6] = js.undefined): OutputChannelMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputChannels" -> InputChannels.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputChannelMapping]
    }
  }

  /**
   * Details regarding output
   */
  @js.native
  trait OutputDetail extends js.Object {
    var DurationInMs: js.UndefOr[__integer]
    var VideoDetails: js.UndefOr[VideoDetail]
  }

  object OutputDetail {
    def apply(
      DurationInMs: js.UndefOr[__integer] = js.undefined,
      VideoDetails: js.UndefOr[VideoDetail] = js.undefined): OutputDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DurationInMs" -> DurationInMs.map { x => x.asInstanceOf[js.Any] },
        "VideoDetails" -> VideoDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputDetail]
    }
  }

  /**
   * Group of outputs
   */
  @js.native
  trait OutputGroup extends js.Object {
    var CustomName: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var OutputGroupSettings: js.UndefOr[OutputGroupSettings]
    var Outputs: js.UndefOr[__listOfOutput]
  }

  object OutputGroup {
    def apply(
      CustomName: js.UndefOr[__string] = js.undefined,
      Name: js.UndefOr[__string] = js.undefined,
      OutputGroupSettings: js.UndefOr[OutputGroupSettings] = js.undefined,
      Outputs: js.UndefOr[__listOfOutput] = js.undefined): OutputGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomName" -> CustomName.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "OutputGroupSettings" -> OutputGroupSettings.map { x => x.asInstanceOf[js.Any] },
        "Outputs" -> Outputs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputGroup]
    }
  }

  /**
   * Contains details about the output groups specified in the job settings.
   */
  @js.native
  trait OutputGroupDetail extends js.Object {
    var OutputDetails: js.UndefOr[__listOfOutputDetail]
  }

  object OutputGroupDetail {
    def apply(
      OutputDetails: js.UndefOr[__listOfOutputDetail] = js.undefined): OutputGroupDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OutputDetails" -> OutputDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputGroupDetail]
    }
  }

  /**
   * Output Group settings, including type
   */
  @js.native
  trait OutputGroupSettings extends js.Object {
    var CmafGroupSettings: js.UndefOr[CmafGroupSettings]
    var DashIsoGroupSettings: js.UndefOr[DashIsoGroupSettings]
    var FileGroupSettings: js.UndefOr[FileGroupSettings]
    var HlsGroupSettings: js.UndefOr[HlsGroupSettings]
    var MsSmoothGroupSettings: js.UndefOr[MsSmoothGroupSettings]
    var Type: js.UndefOr[OutputGroupType]
  }

  object OutputGroupSettings {
    def apply(
      CmafGroupSettings: js.UndefOr[CmafGroupSettings] = js.undefined,
      DashIsoGroupSettings: js.UndefOr[DashIsoGroupSettings] = js.undefined,
      FileGroupSettings: js.UndefOr[FileGroupSettings] = js.undefined,
      HlsGroupSettings: js.UndefOr[HlsGroupSettings] = js.undefined,
      MsSmoothGroupSettings: js.UndefOr[MsSmoothGroupSettings] = js.undefined,
      Type: js.UndefOr[OutputGroupType] = js.undefined): OutputGroupSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CmafGroupSettings" -> CmafGroupSettings.map { x => x.asInstanceOf[js.Any] },
        "DashIsoGroupSettings" -> DashIsoGroupSettings.map { x => x.asInstanceOf[js.Any] },
        "FileGroupSettings" -> FileGroupSettings.map { x => x.asInstanceOf[js.Any] },
        "HlsGroupSettings" -> HlsGroupSettings.map { x => x.asInstanceOf[js.Any] },
        "MsSmoothGroupSettings" -> MsSmoothGroupSettings.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputGroupSettings]
    }
  }

  /**
   * Type of output group (File group, Apple HLS, DASH ISO, Microsoft Smooth Streaming, CMAF)
   */
  object OutputGroupTypeEnum {
    val HLS_GROUP_SETTINGS = "HLS_GROUP_SETTINGS"
    val DASH_ISO_GROUP_SETTINGS = "DASH_ISO_GROUP_SETTINGS"
    val FILE_GROUP_SETTINGS = "FILE_GROUP_SETTINGS"
    val MS_SMOOTH_GROUP_SETTINGS = "MS_SMOOTH_GROUP_SETTINGS"
    val CMAF_GROUP_SETTINGS = "CMAF_GROUP_SETTINGS"

    val values = IndexedSeq(HLS_GROUP_SETTINGS, DASH_ISO_GROUP_SETTINGS, FILE_GROUP_SETTINGS, MS_SMOOTH_GROUP_SETTINGS, CMAF_GROUP_SETTINGS)
  }

  /**
   * Selects method of inserting SDT information into output stream.  "Follow input SDT" copies SDT information from input stream to  output stream. "Follow input SDT if present" copies SDT information from  input stream to output stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. Enter "SDT  Manually" means user will enter the SDT information. "No SDT" means output  stream will not contain SDT information.
   */
  object OutputSdtEnum {
    val SDT_FOLLOW = "SDT_FOLLOW"
    val SDT_FOLLOW_IF_PRESENT = "SDT_FOLLOW_IF_PRESENT"
    val SDT_MANUAL = "SDT_MANUAL"
    val SDT_NONE = "SDT_NONE"

    val values = IndexedSeq(SDT_FOLLOW, SDT_FOLLOW_IF_PRESENT, SDT_MANUAL, SDT_NONE)
  }

  /**
   * Specific settings for this type of output.
   */
  @js.native
  trait OutputSettings extends js.Object {
    var HlsSettings: js.UndefOr[HlsSettings]
  }

  object OutputSettings {
    def apply(
      HlsSettings: js.UndefOr[HlsSettings] = js.undefined): OutputSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HlsSettings" -> HlsSettings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputSettings]
    }
  }

  /**
   * A preset is a collection of preconfigured media conversion settings that you want MediaConvert to apply to the output during the conversion process.
   */
  @js.native
  trait Preset extends js.Object {
    var Name: __string
    var Settings: PresetSettings
    var Arn: js.UndefOr[__string]
    var Category: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__timestampUnix]
    var Description: js.UndefOr[__string]
    var LastUpdated: js.UndefOr[__timestampUnix]
    var Type: js.UndefOr[Type]
  }

  object Preset {
    def apply(
      Name: __string,
      Settings: PresetSettings,
      Arn: js.UndefOr[__string] = js.undefined,
      Category: js.UndefOr[__string] = js.undefined,
      CreatedAt: js.UndefOr[__timestampUnix] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      LastUpdated: js.UndefOr[__timestampUnix] = js.undefined,
      Type: js.UndefOr[Type] = js.undefined): Preset = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any],
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Category" -> Category.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "LastUpdated" -> LastUpdated.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Preset]
    }
  }

  /**
   * Optional. When you request a list of presets, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
   */
  object PresetListByEnum {
    val NAME = "NAME"
    val CREATION_DATE = "CREATION_DATE"
    val SYSTEM = "SYSTEM"

    val values = IndexedSeq(NAME, CREATION_DATE, SYSTEM)
  }

  /**
   * Settings for preset
   */
  @js.native
  trait PresetSettings extends js.Object {
    var AudioDescriptions: js.UndefOr[__listOfAudioDescription]
    var CaptionDescriptions: js.UndefOr[__listOfCaptionDescriptionPreset]
    var ContainerSettings: js.UndefOr[ContainerSettings]
    var VideoDescription: js.UndefOr[VideoDescription]
  }

  object PresetSettings {
    def apply(
      AudioDescriptions: js.UndefOr[__listOfAudioDescription] = js.undefined,
      CaptionDescriptions: js.UndefOr[__listOfCaptionDescriptionPreset] = js.undefined,
      ContainerSettings: js.UndefOr[ContainerSettings] = js.undefined,
      VideoDescription: js.UndefOr[VideoDescription] = js.undefined): PresetSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AudioDescriptions" -> AudioDescriptions.map { x => x.asInstanceOf[js.Any] },
        "CaptionDescriptions" -> CaptionDescriptions.map { x => x.asInstanceOf[js.Any] },
        "ContainerSettings" -> ContainerSettings.map { x => x.asInstanceOf[js.Any] },
        "VideoDescription" -> VideoDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PresetSettings]
    }
  }

  /**
   * Specifies whether the pricing plan for the queue is On-demand or Reserved. The pricing plan for the queue determines whether you pay On-demand or Reserved pricing for the transcoding jobs that you run through the queue. For Reserved queue pricing, you must set up a contract. You can create a Reserved queue contract through the AWS Elemental MediaConvert console.
   */
  object PricingPlanEnum {
    val ON_DEMAND = "ON_DEMAND"
    val RESERVED = "RESERVED"

    val values = IndexedSeq(ON_DEMAND, RESERVED)
  }

  /**
   * Use Profile (ProResCodecProfile) to specifiy the type of Apple ProRes codec to use for this output.
   */
  object ProresCodecProfileEnum {
    val APPLE_PRORES_422 = "APPLE_PRORES_422"
    val APPLE_PRORES_422_HQ = "APPLE_PRORES_422_HQ"
    val APPLE_PRORES_422_LT = "APPLE_PRORES_422_LT"
    val APPLE_PRORES_422_PROXY = "APPLE_PRORES_422_PROXY"

    val values = IndexedSeq(APPLE_PRORES_422, APPLE_PRORES_422_HQ, APPLE_PRORES_422_LT, APPLE_PRORES_422_PROXY)
  }

  /**
   * If you are using the console, use the Framerate setting to specify the framerate for this output. If you want to keep the same framerate as the input video, choose Follow source. If you want to do framerate conversion, choose a framerate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your framerate as a fraction. If you are creating your transcoding job sepecification as a JSON file without the console, use FramerateControl to specify which value the service uses for the framerate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the framerate from the input. Choose SPECIFIED if you want the service to use the framerate you specify in the settings FramerateNumerator and FramerateDenominator.
   */
  object ProresFramerateControlEnum {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE"
    val SPECIFIED = "SPECIFIED"

    val values = IndexedSeq(INITIALIZE_FROM_SOURCE, SPECIFIED)
  }

  /**
   * When set to INTERPOLATE, produces smoother motion during framerate conversion.
   */
  object ProresFramerateConversionAlgorithmEnum {
    val DUPLICATE_DROP = "DUPLICATE_DROP"
    val INTERPOLATE = "INTERPOLATE"

    val values = IndexedSeq(DUPLICATE_DROP, INTERPOLATE)
  }

  /**
   * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type.
   * - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
   * - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
   */
  object ProresInterlaceModeEnum {
    val PROGRESSIVE = "PROGRESSIVE"
    val TOP_FIELD = "TOP_FIELD"
    val BOTTOM_FIELD = "BOTTOM_FIELD"
    val FOLLOW_TOP_FIELD = "FOLLOW_TOP_FIELD"
    val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD"

    val values = IndexedSeq(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD)
  }

  /**
   * Use (ProresParControl) to specify how the service determines the pixel aspect ratio. Set to Follow source (INITIALIZE_FROM_SOURCE) to use the pixel aspect ratio from the input.  To specify a different pixel aspect ratio: Using the console, choose it from the dropdown menu. Using the API, set ProresParControl to (SPECIFIED) and provide  for (ParNumerator) and (ParDenominator).
   */
  object ProresParControlEnum {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE"
    val SPECIFIED = "SPECIFIED"

    val values = IndexedSeq(INITIALIZE_FROM_SOURCE, SPECIFIED)
  }

  /**
   * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value PRORES.
   */
  @js.native
  trait ProresSettings extends js.Object {
    var CodecProfile: js.UndefOr[ProresCodecProfile]
    var FramerateControl: js.UndefOr[ProresFramerateControl]
    var FramerateConversionAlgorithm: js.UndefOr[ProresFramerateConversionAlgorithm]
    var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647]
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647]
    var InterlaceMode: js.UndefOr[ProresInterlaceMode]
    var ParControl: js.UndefOr[ProresParControl]
    var ParDenominator: js.UndefOr[__integerMin1Max2147483647]
    var ParNumerator: js.UndefOr[__integerMin1Max2147483647]
    var SlowPal: js.UndefOr[ProresSlowPal]
    var Telecine: js.UndefOr[ProresTelecine]
  }

  object ProresSettings {
    def apply(
      CodecProfile: js.UndefOr[ProresCodecProfile] = js.undefined,
      FramerateControl: js.UndefOr[ProresFramerateControl] = js.undefined,
      FramerateConversionAlgorithm: js.UndefOr[ProresFramerateConversionAlgorithm] = js.undefined,
      FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      InterlaceMode: js.UndefOr[ProresInterlaceMode] = js.undefined,
      ParControl: js.UndefOr[ProresParControl] = js.undefined,
      ParDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      ParNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      SlowPal: js.UndefOr[ProresSlowPal] = js.undefined,
      Telecine: js.UndefOr[ProresTelecine] = js.undefined): ProresSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodecProfile" -> CodecProfile.map { x => x.asInstanceOf[js.Any] },
        "FramerateControl" -> FramerateControl.map { x => x.asInstanceOf[js.Any] },
        "FramerateConversionAlgorithm" -> FramerateConversionAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "FramerateDenominator" -> FramerateDenominator.map { x => x.asInstanceOf[js.Any] },
        "FramerateNumerator" -> FramerateNumerator.map { x => x.asInstanceOf[js.Any] },
        "InterlaceMode" -> InterlaceMode.map { x => x.asInstanceOf[js.Any] },
        "ParControl" -> ParControl.map { x => x.asInstanceOf[js.Any] },
        "ParDenominator" -> ParDenominator.map { x => x.asInstanceOf[js.Any] },
        "ParNumerator" -> ParNumerator.map { x => x.asInstanceOf[js.Any] },
        "SlowPal" -> SlowPal.map { x => x.asInstanceOf[js.Any] },
        "Telecine" -> Telecine.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProresSettings]
    }
  }

  /**
   * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
   */
  object ProresSlowPalEnum {
    val DISABLED = "DISABLED"
    val ENABLED = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
   * Only use Telecine (ProresTelecine) when you set Framerate (Framerate) to 29.970. Set Telecine (ProresTelecine) to Hard (hard) to produce a 29.97i output from a 23.976 input. Set it to Soft (soft) to produce 23.976 output and leave converstion to the player.
   */
  object ProresTelecineEnum {
    val NONE = "NONE"
    val HARD = "HARD"

    val values = IndexedSeq(NONE, HARD)
  }

  /**
   * You can use queues to manage the resources that are available to your AWS account for running multiple transcoding jobs at the same time. If you don't specify a queue, the service sends all jobs through the default queue. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/about-resource-allocation-and-job-prioritization.html.
   */
  @js.native
  trait Queue extends js.Object {
    var Name: __string
    var Arn: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__timestampUnix]
    var Description: js.UndefOr[__string]
    var LastUpdated: js.UndefOr[__timestampUnix]
    var PricingPlan: js.UndefOr[PricingPlan]
    var ProgressingJobsCount: js.UndefOr[__integer]
    var ReservationPlan: js.UndefOr[ReservationPlan]
    var Status: js.UndefOr[QueueStatus]
    var SubmittedJobsCount: js.UndefOr[__integer]
    var Type: js.UndefOr[Type]
  }

  object Queue {
    def apply(
      Name: __string,
      Arn: js.UndefOr[__string] = js.undefined,
      CreatedAt: js.UndefOr[__timestampUnix] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      LastUpdated: js.UndefOr[__timestampUnix] = js.undefined,
      PricingPlan: js.UndefOr[PricingPlan] = js.undefined,
      ProgressingJobsCount: js.UndefOr[__integer] = js.undefined,
      ReservationPlan: js.UndefOr[ReservationPlan] = js.undefined,
      Status: js.UndefOr[QueueStatus] = js.undefined,
      SubmittedJobsCount: js.UndefOr[__integer] = js.undefined,
      Type: js.UndefOr[Type] = js.undefined): Queue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "LastUpdated" -> LastUpdated.map { x => x.asInstanceOf[js.Any] },
        "PricingPlan" -> PricingPlan.map { x => x.asInstanceOf[js.Any] },
        "ProgressingJobsCount" -> ProgressingJobsCount.map { x => x.asInstanceOf[js.Any] },
        "ReservationPlan" -> ReservationPlan.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "SubmittedJobsCount" -> SubmittedJobsCount.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Queue]
    }
  }

  /**
   * Optional. When you request a list of queues, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by creation date.
   */
  object QueueListByEnum {
    val NAME = "NAME"
    val CREATION_DATE = "CREATION_DATE"

    val values = IndexedSeq(NAME, CREATION_DATE)
  }

  /**
   * Queues can be ACTIVE or PAUSED. If you pause a queue, jobs in that queue won't begin. Jobs that are running when you pause a queue continue to run until they finish or result in an error.
   */
  object QueueStatusEnum {
    val ACTIVE = "ACTIVE"
    val PAUSED = "PAUSED"

    val values = IndexedSeq(ACTIVE, PAUSED)
  }

  /**
   * Use Rectangle to identify a specific area of the video frame.
   */
  @js.native
  trait Rectangle extends js.Object {
    var Height: js.UndefOr[__integerMin2Max2147483647]
    var Width: js.UndefOr[__integerMin2Max2147483647]
    var X: js.UndefOr[__integerMin0Max2147483647]
    var Y: js.UndefOr[__integerMin0Max2147483647]
  }

  object Rectangle {
    def apply(
      Height: js.UndefOr[__integerMin2Max2147483647] = js.undefined,
      Width: js.UndefOr[__integerMin2Max2147483647] = js.undefined,
      X: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
      Y: js.UndefOr[__integerMin0Max2147483647] = js.undefined): Rectangle = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Height" -> Height.map { x => x.asInstanceOf[js.Any] },
        "Width" -> Width.map { x => x.asInstanceOf[js.Any] },
        "X" -> X.map { x => x.asInstanceOf[js.Any] },
        "Y" -> Y.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Rectangle]
    }
  }

  /**
   * Use Manual audio remixing (RemixSettings) to adjust audio levels for each audio channel in each output of your job. With audio remixing, you can output more or fewer audio channels than your input audio source provides.
   */
  @js.native
  trait RemixSettings extends js.Object {
    var ChannelMapping: js.UndefOr[ChannelMapping]
    var ChannelsIn: js.UndefOr[__integerMin1Max16]
    var ChannelsOut: js.UndefOr[__integerMin1Max8]
  }

  object RemixSettings {
    def apply(
      ChannelMapping: js.UndefOr[ChannelMapping] = js.undefined,
      ChannelsIn: js.UndefOr[__integerMin1Max16] = js.undefined,
      ChannelsOut: js.UndefOr[__integerMin1Max8] = js.undefined): RemixSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChannelMapping" -> ChannelMapping.map { x => x.asInstanceOf[js.Any] },
        "ChannelsIn" -> ChannelsIn.map { x => x.asInstanceOf[js.Any] },
        "ChannelsOut" -> ChannelsOut.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemixSettings]
    }
  }

  /**
   * Specifies whether the pricing plan contract for your reserved queue automatically renews (AUTO_RENEW) or expires (EXPIRE) at the end of the contract period.
   */
  object RenewalTypeEnum {
    val AUTO_RENEW = "AUTO_RENEW"
    val EXPIRE = "EXPIRE"

    val values = IndexedSeq(AUTO_RENEW, EXPIRE)
  }

  /**
   * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand queues.
   */
  @js.native
  trait ReservationPlan extends js.Object {
    var Commitment: js.UndefOr[Commitment]
    var ExpiresAt: js.UndefOr[__timestampUnix]
    var PurchasedAt: js.UndefOr[__timestampUnix]
    var RenewalType: js.UndefOr[RenewalType]
    var ReservedSlots: js.UndefOr[__integer]
    var Status: js.UndefOr[ReservationPlanStatus]
  }

  object ReservationPlan {
    def apply(
      Commitment: js.UndefOr[Commitment] = js.undefined,
      ExpiresAt: js.UndefOr[__timestampUnix] = js.undefined,
      PurchasedAt: js.UndefOr[__timestampUnix] = js.undefined,
      RenewalType: js.UndefOr[RenewalType] = js.undefined,
      ReservedSlots: js.UndefOr[__integer] = js.undefined,
      Status: js.UndefOr[ReservationPlanStatus] = js.undefined): ReservationPlan = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Commitment" -> Commitment.map { x => x.asInstanceOf[js.Any] },
        "ExpiresAt" -> ExpiresAt.map { x => x.asInstanceOf[js.Any] },
        "PurchasedAt" -> PurchasedAt.map { x => x.asInstanceOf[js.Any] },
        "RenewalType" -> RenewalType.map { x => x.asInstanceOf[js.Any] },
        "ReservedSlots" -> ReservedSlots.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservationPlan]
    }
  }

  /**
   * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand queues.
   */
  @js.native
  trait ReservationPlanSettings extends js.Object {
    var Commitment: Commitment
    var RenewalType: RenewalType
    var ReservedSlots: __integer
  }

  object ReservationPlanSettings {
    def apply(
      Commitment: Commitment,
      RenewalType: RenewalType,
      ReservedSlots: __integer): ReservationPlanSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Commitment" -> Commitment.asInstanceOf[js.Any],
        "RenewalType" -> RenewalType.asInstanceOf[js.Any],
        "ReservedSlots" -> ReservedSlots.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservationPlanSettings]
    }
  }

  /**
   * Specifies whether the pricing plan for your reserved queue is ACTIVE or EXPIRED.
   */
  object ReservationPlanStatusEnum {
    val ACTIVE = "ACTIVE"
    val EXPIRED = "EXPIRED"

    val values = IndexedSeq(ACTIVE, EXPIRED)
  }

  /**
   * The Amazon Resource Name (ARN) and tags for an AWS Elemental MediaConvert resource.
   */
  @js.native
  trait ResourceTags extends js.Object {
    var Arn: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object ResourceTags {
    def apply(
      Arn: js.UndefOr[__string] = js.undefined,
      Tags: js.UndefOr[__mapOf__string] = js.undefined): ResourceTags = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceTags]
    }
  }

  /**
   * Use Respond to AFD (RespondToAfd) to specify how the service changes the video itself in response to AFD values in the input. * Choose Respond to clip the input video frame according to the AFD value, input display aspect ratio, and output display aspect ratio. * Choose Passthrough to include the input AFD values. Do not choose this when AfdSignaling is set to (NONE). A preferred implementation of this workflow is to set RespondToAfd to (NONE) and set AfdSignaling to (AUTO). * Choose None to remove all input AFD values from this output.
   */
  object RespondToAfdEnum {
    val NONE = "NONE"
    val RESPOND = "RESPOND"
    val PASSTHROUGH = "PASSTHROUGH"

    val values = IndexedSeq(NONE, RESPOND, PASSTHROUGH)
  }

  /**
   * Applies only if your input aspect ratio is different from your output aspect ratio. Enable Stretch to output (StretchToOutput) to have the service stretch your video image to fit. Leave this setting disabled to allow the service to letterbox your video instead. This setting overrides any positioning value you specify elsewhere in the job.
   */
  object ScalingBehaviorEnum {
    val DEFAULT = "DEFAULT"
    val STRETCH_TO_OUTPUT = "STRETCH_TO_OUTPUT"

    val values = IndexedSeq(DEFAULT, STRETCH_TO_OUTPUT)
  }

  /**
   * Set Framerate (SccDestinationFramerate) to make sure that the captions and the video are synchronized in the output. Specify a framerate that matches the framerate of the associated video. If the video framerate is 29.97, choose 29.97 dropframe (FRAMERATE_29_97_DROPFRAME) only if the video has video_insertion=true and drop_frame_timecode=true; otherwise, choose 29.97 non-dropframe (FRAMERATE_29_97_NON_DROPFRAME).
   */
  object SccDestinationFramerateEnum {
    val FRAMERATE_23_97 = "FRAMERATE_23_97"
    val FRAMERATE_24 = "FRAMERATE_24"
    val FRAMERATE_29_97_DROPFRAME = "FRAMERATE_29_97_DROPFRAME"
    val FRAMERATE_29_97_NON_DROPFRAME = "FRAMERATE_29_97_NON_DROPFRAME"

    val values = IndexedSeq(FRAMERATE_23_97, FRAMERATE_24, FRAMERATE_29_97_DROPFRAME, FRAMERATE_29_97_NON_DROPFRAME)
  }

  /**
   * Settings for SCC caption output.
   */
  @js.native
  trait SccDestinationSettings extends js.Object {
    var Framerate: js.UndefOr[SccDestinationFramerate]
  }

  object SccDestinationSettings {
    def apply(
      Framerate: js.UndefOr[SccDestinationFramerate] = js.undefined): SccDestinationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Framerate" -> Framerate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SccDestinationSettings]
    }
  }

  /**
   * Settings for use with a SPEKE key provider
   */
  @js.native
  trait SpekeKeyProvider extends js.Object {
    var CertificateArn: js.UndefOr[__stringPatternArnAwsAcm]
    var ResourceId: js.UndefOr[__string]
    var SystemIds: js.UndefOr[__listOf__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12]
    var Url: js.UndefOr[__stringPatternHttps]
  }

  object SpekeKeyProvider {
    def apply(
      CertificateArn: js.UndefOr[__stringPatternArnAwsAcm] = js.undefined,
      ResourceId: js.UndefOr[__string] = js.undefined,
      SystemIds: js.UndefOr[__listOf__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12] = js.undefined,
      Url: js.UndefOr[__stringPatternHttps] = js.undefined): SpekeKeyProvider = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "SystemIds" -> SystemIds.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpekeKeyProvider]
    }
  }

  /**
   * Use these settings to set up encryption with a static key provider.
   */
  @js.native
  trait StaticKeyProvider extends js.Object {
    var KeyFormat: js.UndefOr[__stringPatternIdentityAZaZ26AZaZ09163]
    var KeyFormatVersions: js.UndefOr[__stringPatternDD]
    var StaticKeyValue: js.UndefOr[__stringPatternAZaZ0932]
    var Url: js.UndefOr[__string]
  }

  object StaticKeyProvider {
    def apply(
      KeyFormat: js.UndefOr[__stringPatternIdentityAZaZ26AZaZ09163] = js.undefined,
      KeyFormatVersions: js.UndefOr[__stringPatternDD] = js.undefined,
      StaticKeyValue: js.UndefOr[__stringPatternAZaZ0932] = js.undefined,
      Url: js.UndefOr[__string] = js.undefined): StaticKeyProvider = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyFormat" -> KeyFormat.map { x => x.asInstanceOf[js.Any] },
        "KeyFormatVersions" -> KeyFormatVersions.map { x => x.asInstanceOf[js.Any] },
        "StaticKeyValue" -> StaticKeyValue.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StaticKeyProvider]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var Arn: __string
    var Tags: __mapOf__string
  }

  object TagResourceRequest {
    def apply(
      Arn: __string,
      Tags: __mapOf__string): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {

  }

  object TagResourceResponse {
    def apply(): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
    }
  }

  /**
   * Settings for Teletext caption output
   */
  @js.native
  trait TeletextDestinationSettings extends js.Object {
    var PageNumber: js.UndefOr[__stringMin3Max3Pattern1809aFAF09aEAE]
  }

  object TeletextDestinationSettings {
    def apply(
      PageNumber: js.UndefOr[__stringMin3Max3Pattern1809aFAF09aEAE] = js.undefined): TeletextDestinationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PageNumber" -> PageNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TeletextDestinationSettings]
    }
  }

  /**
   * Settings specific to Teletext caption sources, including Page number.
   */
  @js.native
  trait TeletextSourceSettings extends js.Object {
    var PageNumber: js.UndefOr[__stringMin3Max3Pattern1809aFAF09aEAE]
  }

  object TeletextSourceSettings {
    def apply(
      PageNumber: js.UndefOr[__stringMin3Max3Pattern1809aFAF09aEAE] = js.undefined): TeletextSourceSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PageNumber" -> PageNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TeletextSourceSettings]
    }
  }

  /**
   * Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and specified prefix into the output.
   */
  @js.native
  trait TimecodeBurnin extends js.Object {
    var FontSize: js.UndefOr[__integerMin10Max48]
    var Position: js.UndefOr[TimecodeBurninPosition]
    var Prefix: js.UndefOr[__stringPattern]
  }

  object TimecodeBurnin {
    def apply(
      FontSize: js.UndefOr[__integerMin10Max48] = js.undefined,
      Position: js.UndefOr[TimecodeBurninPosition] = js.undefined,
      Prefix: js.UndefOr[__stringPattern] = js.undefined): TimecodeBurnin = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FontSize" -> FontSize.map { x => x.asInstanceOf[js.Any] },
        "Position" -> Position.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimecodeBurnin]
    }
  }

  /**
   * Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to specify the location the burned-in timecode on output video.
   */
  object TimecodeBurninPositionEnum {
    val TOP_CENTER = "TOP_CENTER"
    val TOP_LEFT = "TOP_LEFT"
    val TOP_RIGHT = "TOP_RIGHT"
    val MIDDLE_LEFT = "MIDDLE_LEFT"
    val MIDDLE_CENTER = "MIDDLE_CENTER"
    val MIDDLE_RIGHT = "MIDDLE_RIGHT"
    val BOTTOM_LEFT = "BOTTOM_LEFT"
    val BOTTOM_CENTER = "BOTTOM_CENTER"
    val BOTTOM_RIGHT = "BOTTOM_RIGHT"

    val values = IndexedSeq(TOP_CENTER, TOP_LEFT, TOP_RIGHT, MIDDLE_LEFT, MIDDLE_CENTER, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT)
  }

  /**
   * These settings control how the service handles timecodes throughout the job. These settings don't affect input clipping.
   */
  @js.native
  trait TimecodeConfig extends js.Object {
    var Anchor: js.UndefOr[__stringPattern010920405090509092]
    var Source: js.UndefOr[TimecodeSource]
    var Start: js.UndefOr[__stringPattern010920405090509092]
    var TimestampOffset: js.UndefOr[__stringPattern0940191020191209301]
  }

  object TimecodeConfig {
    def apply(
      Anchor: js.UndefOr[__stringPattern010920405090509092] = js.undefined,
      Source: js.UndefOr[TimecodeSource] = js.undefined,
      Start: js.UndefOr[__stringPattern010920405090509092] = js.undefined,
      TimestampOffset: js.UndefOr[__stringPattern0940191020191209301] = js.undefined): TimecodeConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Anchor" -> Anchor.map { x => x.asInstanceOf[js.Any] },
        "Source" -> Source.map { x => x.asInstanceOf[js.Any] },
        "Start" -> Start.map { x => x.asInstanceOf[js.Any] },
        "TimestampOffset" -> TimestampOffset.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimecodeConfig]
    }
  }

  /**
   * Use Source (TimecodeSource) to set how timecodes are handled within this job. To make sure that your video, audio, captions, and markers are synchronized and that time-based features, such as image inserter, work correctly, choose the Timecode source option that matches your assets. All timecodes are in a 24-hour format with frame number (HH:MM:SS:FF). * Embedded (EMBEDDED) - Use the timecode that is in the input video. If no embedded timecode is in the source, the service will use Start at 0 (ZEROBASED) instead. * Start at 0 (ZEROBASED) - Set the timecode of the initial frame to 00:00:00:00. * Specified Start (SPECIFIEDSTART) - Set the timecode of the initial frame to a value other than zero. You use Start timecode (Start) to provide this value.
   */
  object TimecodeSourceEnum {
    val EMBEDDED = "EMBEDDED"
    val ZEROBASED = "ZEROBASED"
    val SPECIFIEDSTART = "SPECIFIEDSTART"

    val values = IndexedSeq(EMBEDDED, ZEROBASED, SPECIFIEDSTART)
  }

  /**
   * Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed metadata from the input in this output.
   */
  object TimedMetadataEnum {
    val PASSTHROUGH = "PASSTHROUGH"
    val NONE = "NONE"

    val values = IndexedSeq(PASSTHROUGH, NONE)
  }

  /**
   * Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3 tags in your job. To include timed metadata, you must enable it here, enable it in each output container, and specify tags and timecodes in ID3 insertion (Id3Insertion) objects.
   */
  @js.native
  trait TimedMetadataInsertion extends js.Object {
    var Id3Insertions: js.UndefOr[__listOfId3Insertion]
  }

  object TimedMetadataInsertion {
    def apply(
      Id3Insertions: js.UndefOr[__listOfId3Insertion] = js.undefined): TimedMetadataInsertion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id3Insertions" -> Id3Insertions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimedMetadataInsertion]
    }
  }

  /**
   * Information about when jobs are submitted, started, and finished is specified in Unix epoch format in seconds.
   */
  @js.native
  trait Timing extends js.Object {
    var FinishTime: js.UndefOr[__timestampUnix]
    var StartTime: js.UndefOr[__timestampUnix]
    var SubmitTime: js.UndefOr[__timestampUnix]
  }

  object Timing {
    def apply(
      FinishTime: js.UndefOr[__timestampUnix] = js.undefined,
      StartTime: js.UndefOr[__timestampUnix] = js.undefined,
      SubmitTime: js.UndefOr[__timestampUnix] = js.undefined): Timing = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FinishTime" -> FinishTime.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "SubmitTime" -> SubmitTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Timing]
    }
  }

  /**
   * Settings specific to TTML caption outputs, including Pass style information (TtmlStylePassthrough).
   */
  @js.native
  trait TtmlDestinationSettings extends js.Object {
    var StylePassthrough: js.UndefOr[TtmlStylePassthrough]
  }

  object TtmlDestinationSettings {
    def apply(
      StylePassthrough: js.UndefOr[TtmlStylePassthrough] = js.undefined): TtmlDestinationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StylePassthrough" -> StylePassthrough.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TtmlDestinationSettings]
    }
  }

  /**
   * Pass through style and position information from a TTML-like input source (TTML, SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
   */
  object TtmlStylePassthroughEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  object TypeEnum {
    val SYSTEM = "SYSTEM"
    val CUSTOM = "CUSTOM"

    val values = IndexedSeq(SYSTEM, CUSTOM)
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var Arn: __string
    var TagKeys: js.UndefOr[__listOf__string]
  }

  object UntagResourceRequest {
    def apply(
      Arn: __string,
      TagKeys: js.UndefOr[__listOf__string] = js.undefined): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {

  }

  object UntagResourceResponse {
    def apply(): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateJobTemplateRequest extends js.Object {
    var Name: __string
    var Category: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var Queue: js.UndefOr[__string]
    var Settings: js.UndefOr[JobTemplateSettings]
  }

  object UpdateJobTemplateRequest {
    def apply(
      Name: __string,
      Category: js.UndefOr[__string] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      Queue: js.UndefOr[__string] = js.undefined,
      Settings: js.UndefOr[JobTemplateSettings] = js.undefined): UpdateJobTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Category" -> Category.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Queue" -> Queue.map { x => x.asInstanceOf[js.Any] },
        "Settings" -> Settings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateJobTemplateRequest]
    }
  }

  @js.native
  trait UpdateJobTemplateResponse extends js.Object {
    var JobTemplate: js.UndefOr[JobTemplate]
  }

  object UpdateJobTemplateResponse {
    def apply(
      JobTemplate: js.UndefOr[JobTemplate] = js.undefined): UpdateJobTemplateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobTemplate" -> JobTemplate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateJobTemplateResponse]
    }
  }

  @js.native
  trait UpdatePresetRequest extends js.Object {
    var Name: __string
    var Category: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var Settings: js.UndefOr[PresetSettings]
  }

  object UpdatePresetRequest {
    def apply(
      Name: __string,
      Category: js.UndefOr[__string] = js.undefined,
      Description: js.UndefOr[__string] = js.undefined,
      Settings: js.UndefOr[PresetSettings] = js.undefined): UpdatePresetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Category" -> Category.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Settings" -> Settings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePresetRequest]
    }
  }

  @js.native
  trait UpdatePresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset]
  }

  object UpdatePresetResponse {
    def apply(
      Preset: js.UndefOr[Preset] = js.undefined): UpdatePresetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Preset" -> Preset.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePresetResponse]
    }
  }

  @js.native
  trait UpdateQueueRequest extends js.Object {
    var Name: __string
    var Description: js.UndefOr[__string]
    var ReservationPlanSettings: js.UndefOr[ReservationPlanSettings]
    var Status: js.UndefOr[QueueStatus]
  }

  object UpdateQueueRequest {
    def apply(
      Name: __string,
      Description: js.UndefOr[__string] = js.undefined,
      ReservationPlanSettings: js.UndefOr[ReservationPlanSettings] = js.undefined,
      Status: js.UndefOr[QueueStatus] = js.undefined): UpdateQueueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ReservationPlanSettings" -> ReservationPlanSettings.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateQueueRequest]
    }
  }

  @js.native
  trait UpdateQueueResponse extends js.Object {
    var Queue: js.UndefOr[Queue]
  }

  object UpdateQueueResponse {
    def apply(
      Queue: js.UndefOr[Queue] = js.undefined): UpdateQueueResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Queue" -> Queue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateQueueResponse]
    }
  }

  /**
   * Type of video codec
   */
  object VideoCodecEnum {
    val FRAME_CAPTURE = "FRAME_CAPTURE"
    val H_264 = "H_264"
    val H_265 = "H_265"
    val MPEG2 = "MPEG2"
    val PRORES = "PRORES"

    val values = IndexedSeq(FRAME_CAPTURE, H_264, H_265, MPEG2, PRORES)
  }

  /**
   * Video codec settings, (CodecSettings) under (VideoDescription), contains the group of settings related to video encoding. The settings in this group vary depending on the value you choose for Video codec (Codec). For each codec enum you choose, define the corresponding settings object. The following lists the codec enum, settings object pairs. * H_264, H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES, ProresSettings * FRAME_CAPTURE, FrameCaptureSettings
   */
  @js.native
  trait VideoCodecSettings extends js.Object {
    var Codec: js.UndefOr[VideoCodec]
    var FrameCaptureSettings: js.UndefOr[FrameCaptureSettings]
    var H264Settings: js.UndefOr[H264Settings]
    var H265Settings: js.UndefOr[H265Settings]
    var Mpeg2Settings: js.UndefOr[Mpeg2Settings]
    var ProresSettings: js.UndefOr[ProresSettings]
  }

  object VideoCodecSettings {
    def apply(
      Codec: js.UndefOr[VideoCodec] = js.undefined,
      FrameCaptureSettings: js.UndefOr[FrameCaptureSettings] = js.undefined,
      H264Settings: js.UndefOr[H264Settings] = js.undefined,
      H265Settings: js.UndefOr[H265Settings] = js.undefined,
      Mpeg2Settings: js.UndefOr[Mpeg2Settings] = js.undefined,
      ProresSettings: js.UndefOr[ProresSettings] = js.undefined): VideoCodecSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Codec" -> Codec.map { x => x.asInstanceOf[js.Any] },
        "FrameCaptureSettings" -> FrameCaptureSettings.map { x => x.asInstanceOf[js.Any] },
        "H264Settings" -> H264Settings.map { x => x.asInstanceOf[js.Any] },
        "H265Settings" -> H265Settings.map { x => x.asInstanceOf[js.Any] },
        "Mpeg2Settings" -> Mpeg2Settings.map { x => x.asInstanceOf[js.Any] },
        "ProresSettings" -> ProresSettings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VideoCodecSettings]
    }
  }

  /**
   * Settings for video outputs
   */
  @js.native
  trait VideoDescription extends js.Object {
    var AfdSignaling: js.UndefOr[AfdSignaling]
    var AntiAlias: js.UndefOr[AntiAlias]
    var CodecSettings: js.UndefOr[VideoCodecSettings]
    var ColorMetadata: js.UndefOr[ColorMetadata]
    var Crop: js.UndefOr[Rectangle]
    var DropFrameTimecode: js.UndefOr[DropFrameTimecode]
    var FixedAfd: js.UndefOr[__integerMin0Max15]
    var Height: js.UndefOr[__integerMin32Max2160]
    var Position: js.UndefOr[Rectangle]
    var RespondToAfd: js.UndefOr[RespondToAfd]
    var ScalingBehavior: js.UndefOr[ScalingBehavior]
    var Sharpness: js.UndefOr[__integerMin0Max100]
    var TimecodeInsertion: js.UndefOr[VideoTimecodeInsertion]
    var VideoPreprocessors: js.UndefOr[VideoPreprocessor]
    var Width: js.UndefOr[__integerMin32Max4096]
  }

  object VideoDescription {
    def apply(
      AfdSignaling: js.UndefOr[AfdSignaling] = js.undefined,
      AntiAlias: js.UndefOr[AntiAlias] = js.undefined,
      CodecSettings: js.UndefOr[VideoCodecSettings] = js.undefined,
      ColorMetadata: js.UndefOr[ColorMetadata] = js.undefined,
      Crop: js.UndefOr[Rectangle] = js.undefined,
      DropFrameTimecode: js.UndefOr[DropFrameTimecode] = js.undefined,
      FixedAfd: js.UndefOr[__integerMin0Max15] = js.undefined,
      Height: js.UndefOr[__integerMin32Max2160] = js.undefined,
      Position: js.UndefOr[Rectangle] = js.undefined,
      RespondToAfd: js.UndefOr[RespondToAfd] = js.undefined,
      ScalingBehavior: js.UndefOr[ScalingBehavior] = js.undefined,
      Sharpness: js.UndefOr[__integerMin0Max100] = js.undefined,
      TimecodeInsertion: js.UndefOr[VideoTimecodeInsertion] = js.undefined,
      VideoPreprocessors: js.UndefOr[VideoPreprocessor] = js.undefined,
      Width: js.UndefOr[__integerMin32Max4096] = js.undefined): VideoDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AfdSignaling" -> AfdSignaling.map { x => x.asInstanceOf[js.Any] },
        "AntiAlias" -> AntiAlias.map { x => x.asInstanceOf[js.Any] },
        "CodecSettings" -> CodecSettings.map { x => x.asInstanceOf[js.Any] },
        "ColorMetadata" -> ColorMetadata.map { x => x.asInstanceOf[js.Any] },
        "Crop" -> Crop.map { x => x.asInstanceOf[js.Any] },
        "DropFrameTimecode" -> DropFrameTimecode.map { x => x.asInstanceOf[js.Any] },
        "FixedAfd" -> FixedAfd.map { x => x.asInstanceOf[js.Any] },
        "Height" -> Height.map { x => x.asInstanceOf[js.Any] },
        "Position" -> Position.map { x => x.asInstanceOf[js.Any] },
        "RespondToAfd" -> RespondToAfd.map { x => x.asInstanceOf[js.Any] },
        "ScalingBehavior" -> ScalingBehavior.map { x => x.asInstanceOf[js.Any] },
        "Sharpness" -> Sharpness.map { x => x.asInstanceOf[js.Any] },
        "TimecodeInsertion" -> TimecodeInsertion.map { x => x.asInstanceOf[js.Any] },
        "VideoPreprocessors" -> VideoPreprocessors.map { x => x.asInstanceOf[js.Any] },
        "Width" -> Width.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VideoDescription]
    }
  }

  /**
   * Contains details about the output's video stream
   */
  @js.native
  trait VideoDetail extends js.Object {
    var HeightInPx: js.UndefOr[__integer]
    var WidthInPx: js.UndefOr[__integer]
  }

  object VideoDetail {
    def apply(
      HeightInPx: js.UndefOr[__integer] = js.undefined,
      WidthInPx: js.UndefOr[__integer] = js.undefined): VideoDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HeightInPx" -> HeightInPx.map { x => x.asInstanceOf[js.Any] },
        "WidthInPx" -> WidthInPx.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VideoDetail]
    }
  }

  /**
   * Find additional transcoding features under Preprocessors (VideoPreprocessors). Enable the features at each output individually. These features are disabled by default.
   */
  @js.native
  trait VideoPreprocessor extends js.Object {
    var ColorCorrector: js.UndefOr[ColorCorrector]
    var Deinterlacer: js.UndefOr[Deinterlacer]
    var ImageInserter: js.UndefOr[ImageInserter]
    var NoiseReducer: js.UndefOr[NoiseReducer]
    var TimecodeBurnin: js.UndefOr[TimecodeBurnin]
  }

  object VideoPreprocessor {
    def apply(
      ColorCorrector: js.UndefOr[ColorCorrector] = js.undefined,
      Deinterlacer: js.UndefOr[Deinterlacer] = js.undefined,
      ImageInserter: js.UndefOr[ImageInserter] = js.undefined,
      NoiseReducer: js.UndefOr[NoiseReducer] = js.undefined,
      TimecodeBurnin: js.UndefOr[TimecodeBurnin] = js.undefined): VideoPreprocessor = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ColorCorrector" -> ColorCorrector.map { x => x.asInstanceOf[js.Any] },
        "Deinterlacer" -> Deinterlacer.map { x => x.asInstanceOf[js.Any] },
        "ImageInserter" -> ImageInserter.map { x => x.asInstanceOf[js.Any] },
        "NoiseReducer" -> NoiseReducer.map { x => x.asInstanceOf[js.Any] },
        "TimecodeBurnin" -> TimecodeBurnin.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VideoPreprocessor]
    }
  }

  /**
   * Selector for video.
   */
  @js.native
  trait VideoSelector extends js.Object {
    var ColorSpace: js.UndefOr[ColorSpace]
    var ColorSpaceUsage: js.UndefOr[ColorSpaceUsage]
    var Hdr10Metadata: js.UndefOr[Hdr10Metadata]
    var Pid: js.UndefOr[__integerMin1Max2147483647]
    var ProgramNumber: js.UndefOr[__integerMinNegative2147483648Max2147483647]
  }

  object VideoSelector {
    def apply(
      ColorSpace: js.UndefOr[ColorSpace] = js.undefined,
      ColorSpaceUsage: js.UndefOr[ColorSpaceUsage] = js.undefined,
      Hdr10Metadata: js.UndefOr[Hdr10Metadata] = js.undefined,
      Pid: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
      ProgramNumber: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined): VideoSelector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ColorSpace" -> ColorSpace.map { x => x.asInstanceOf[js.Any] },
        "ColorSpaceUsage" -> ColorSpaceUsage.map { x => x.asInstanceOf[js.Any] },
        "Hdr10Metadata" -> Hdr10Metadata.map { x => x.asInstanceOf[js.Any] },
        "Pid" -> Pid.map { x => x.asInstanceOf[js.Any] },
        "ProgramNumber" -> ProgramNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VideoSelector]
    }
  }

  /**
   * Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable Timecode insertion when the input framerate is identical to the output framerate. To include timecodes in this output, set Timecode insertion (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is DISABLED. When the service inserts timecodes in an output, by default, it uses any embedded timecodes from the input. If none are present, the service will set the timecode for the first output frame to zero. To change this default behavior, adjust the settings under Timecode configuration (TimecodeConfig). In the console, these settings are located under Job > Job settings > Timecode configuration. Note - Timecode source under input settings (InputTimecodeSource) does not affect the timecodes that are inserted in the output. Source under Job settings > Timecode configuration (TimecodeSource) does.
   */
  object VideoTimecodeInsertionEnum {
    val DISABLED = "DISABLED"
    val PIC_TIMING_SEI = "PIC_TIMING_SEI"

    val values = IndexedSeq(DISABLED, PIC_TIMING_SEI)
  }

  /**
   * The service defaults to using RIFF for WAV outputs. If your output audio is likely to exceed 4 GB in file size, or if you otherwise need the extended support of the RF64 format, set your output WAV file format to RF64.
   */
  object WavFormatEnum {
    val RIFF = "RIFF"
    val RF64 = "RF64"

    val values = IndexedSeq(RIFF, RF64)
  }

  /**
   * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value WAV.
   */
  @js.native
  trait WavSettings extends js.Object {
    var BitDepth: js.UndefOr[__integerMin16Max24]
    var Channels: js.UndefOr[__integerMin1Max8]
    var Format: js.UndefOr[WavFormat]
    var SampleRate: js.UndefOr[__integerMin8000Max192000]
  }

  object WavSettings {
    def apply(
      BitDepth: js.UndefOr[__integerMin16Max24] = js.undefined,
      Channels: js.UndefOr[__integerMin1Max8] = js.undefined,
      Format: js.UndefOr[WavFormat] = js.undefined,
      SampleRate: js.UndefOr[__integerMin8000Max192000] = js.undefined): WavSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BitDepth" -> BitDepth.map { x => x.asInstanceOf[js.Any] },
        "Channels" -> Channels.map { x => x.asInstanceOf[js.Any] },
        "Format" -> Format.map { x => x.asInstanceOf[js.Any] },
        "SampleRate" -> SampleRate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WavSettings]
    }
  }
}
