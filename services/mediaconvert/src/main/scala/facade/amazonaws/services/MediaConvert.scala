package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object mediaconvert {
  type __doubleMin0 = Double
  type __doubleMin0Max1 = Double
  type __doubleMin0Max2147483647 = Double
  type __doubleMinNegative59Max0 = Double
  type __doubleMinNegative60Max3 = Double
  type __doubleMinNegative60MaxNegative1 = Double
  type __doubleMinNegative6Max3 = Double
  type __integer = Int
  type __integerMin0Max0 = Int
  type __integerMin0Max1 = Int
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
  type __integerMin0Max30000 = Int
  type __integerMin0Max3600 = Int
  type __integerMin0Max4 = Int
  type __integerMin0Max4194303 = Int
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
  type __integerMin1000Max480000000 = Int
  type __integerMin10Max48 = Int
  type __integerMin16000Max320000 = Int
  type __integerMin16000Max48000 = Int
  type __integerMin16Max24 = Int
  type __integerMin1Max1 = Int
  type __integerMin1Max10 = Int
  type __integerMin1Max100 = Int
  type __integerMin1Max10000000 = Int
  type __integerMin1Max1001 = Int
  type __integerMin1Max17895697 = Int
  type __integerMin1Max2 = Int
  type __integerMin1Max20 = Int
  type __integerMin1Max2147483640 = Int
  type __integerMin1Max2147483647 = Int
  type __integerMin1Max31 = Int
  type __integerMin1Max32 = Int
  type __integerMin1Max4 = Int
  type __integerMin1Max6 = Int
  type __integerMin1Max60000 = Int
  type __integerMin1Max64 = Int
  type __integerMin22050Max48000 = Int
  type __integerMin24Max60000 = Int
  type __integerMin25Max10000 = Int
  type __integerMin25Max2000 = Int
  type __integerMin2Max2147483647 = Int
  type __integerMin32000Max192000 = Int
  type __integerMin32000Max384000 = Int
  type __integerMin32000Max48000 = Int
  type __integerMin32Max8182 = Int
  type __integerMin32Max8192 = Int
  type __integerMin384000Max768000 = Int
  type __integerMin48000Max48000 = Int
  type __integerMin6000Max1024000 = Int
  type __integerMin64000Max640000 = Int
  type __integerMin7Max15 = Int
  type __integerMin8000Max192000 = Int
  type __integerMin8000Max96000 = Int
  type __integerMin96Max600 = Int
  type __integerMinNegative1000Max1000 = Int
  type __integerMinNegative180Max180 = Int
  type __integerMinNegative1Max10 = Int
  type __integerMinNegative1Max3 = Int
  type __integerMinNegative2147483648Max2147483647 = Int
  type __integerMinNegative2Max3 = Int
  type __integerMinNegative50Max50 = Int
  type __integerMinNegative5Max5 = Int
  type __integerMinNegative60Max6 = Int
  type __integerMinNegative70Max0 = Int
  type __listOfAudioDescription = js.Array[AudioDescription]
  type __listOfCaptionDescription = js.Array[CaptionDescription]
  type __listOfCaptionDescriptionPreset = js.Array[CaptionDescriptionPreset]
  type __listOfCmafAdditionalManifest = js.Array[CmafAdditionalManifest]
  type __listOfDashAdditionalManifest = js.Array[DashAdditionalManifest]
  type __listOfEndpoint = js.Array[Endpoint]
  type __listOfHlsAdMarkers = js.Array[HlsAdMarkers]
  type __listOfHlsAdditionalManifest = js.Array[HlsAdditionalManifest]
  type __listOfHlsCaptionLanguageMapping = js.Array[HlsCaptionLanguageMapping]
  type __listOfHopDestination = js.Array[HopDestination]
  type __listOfId3Insertion = js.Array[Id3Insertion]
  type __listOfInput = js.Array[Input]
  type __listOfInputClipping = js.Array[InputClipping]
  type __listOfInputTemplate = js.Array[InputTemplate]
  type __listOfInsertableImage = js.Array[InsertableImage]
  type __listOfJob = js.Array[Job]
  type __listOfJobTemplate = js.Array[JobTemplate]
  type __listOfMsSmoothAdditionalManifest = js.Array[MsSmoothAdditionalManifest]
  type __listOfOutput = js.Array[Output]
  type __listOfOutputChannelMapping = js.Array[OutputChannelMapping]
  type __listOfOutputDetail = js.Array[OutputDetail]
  type __listOfOutputGroup = js.Array[OutputGroup]
  type __listOfOutputGroupDetail = js.Array[OutputGroupDetail]
  type __listOfPreset = js.Array[Preset]
  type __listOfQueue = js.Array[Queue]
  type __listOfQueueTransition = js.Array[QueueTransition]
  type __listOfTeletextPageType = js.Array[TeletextPageType]
  type __listOf__integerMin1Max2147483647 = js.Array[__integerMin1Max2147483647]
  type __listOf__integerMin32Max8182 = js.Array[__integerMin32Max8182]
  type __listOf__integerMinNegative60Max6 = js.Array[__integerMinNegative60Max6]
  type __listOf__string = js.Array[__string]
  type __listOf__stringMin1 = js.Array[__stringMin1]
  type __listOf__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12 = js.Array[__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12]
  type __listOf__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12 = js.Array[__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12]
  type __listOf__stringPatternS3ASSETMAPXml = js.Array[__stringPatternS3ASSETMAPXml]
  type __mapOfAudioSelector = js.Dictionary[AudioSelector]
  type __mapOfAudioSelectorGroup = js.Dictionary[AudioSelectorGroup]
  type __mapOfCaptionSelector = js.Dictionary[CaptionSelector]
  type __mapOf__string = js.Dictionary[__string]
  type __string = String
  type __stringMin0 = String
  type __stringMin1 = String
  type __stringMin11Max11Pattern01D20305D205D = String
  type __stringMin14Max1285PatternS3Mov09PngHttpsMov09Png = String
  type __stringMin14PatternS3BmpBMPPngPNGHttpsBmpBMPPngPNG = String
  type __stringMin14PatternS3BmpBMPPngPNGTgaTGAHttpsBmpBMPPngPNGTgaTGA = String
  type __stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIHttpsSccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMI = String
  type __stringMin16Max24PatternAZaZ0922AZaZ0916 = String
  type __stringMin1Max100000 = String
  type __stringMin1Max256 = String
  type __stringMin24Max512PatternAZaZ0902 = String
  type __stringMin32Max32Pattern09aFAF32 = String
  type __stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12 = String
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
  type __stringPatternAZaZ23AZaZ = String
  type __stringPatternArnAwsUsGovAcm = String
  type __stringPatternArnAwsUsGovCnKmsAZ26EastWestCentralNorthSouthEastWest1912D12KeyAFAF098AFAF094AFAF094AFAF094AFAF0912 = String
  type __stringPatternDD = String
  type __stringPatternHttps = String
  type __stringPatternIdentityAZaZ26AZaZ09163 = String
  type __stringPatternS3 = String
  type __stringPatternS3ASSETMAPXml = String
  type __stringPatternS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLLHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLL = String
  type __stringPatternS3WWEEBBMMMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEEHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEE = String
  type __stringPatternSNManifestConfirmConditionNotificationNS = String
  type __stringPatternSNSignalProcessingNotificationNS = String
  type __stringPatternW = String
  type __stringPatternWS = String
  type __timestampUnix = js.Date

  implicit final class MediaConvertOps(private val service: MediaConvert) extends AnyVal {

    @inline def associateCertificateFuture(params: AssociateCertificateRequest): Future[AssociateCertificateResponse] = service.associateCertificate(params).promise().toFuture
    @inline def cancelJobFuture(params: CancelJobRequest): Future[CancelJobResponse] = service.cancelJob(params).promise().toFuture
    @inline def createJobFuture(params: CreateJobRequest): Future[CreateJobResponse] = service.createJob(params).promise().toFuture
    @inline def createJobTemplateFuture(params: CreateJobTemplateRequest): Future[CreateJobTemplateResponse] = service.createJobTemplate(params).promise().toFuture
    @inline def createPresetFuture(params: CreatePresetRequest): Future[CreatePresetResponse] = service.createPreset(params).promise().toFuture
    @inline def createQueueFuture(params: CreateQueueRequest): Future[CreateQueueResponse] = service.createQueue(params).promise().toFuture
    @inline def deleteJobTemplateFuture(params: DeleteJobTemplateRequest): Future[DeleteJobTemplateResponse] = service.deleteJobTemplate(params).promise().toFuture
    @inline def deletePresetFuture(params: DeletePresetRequest): Future[DeletePresetResponse] = service.deletePreset(params).promise().toFuture
    @inline def deleteQueueFuture(params: DeleteQueueRequest): Future[DeleteQueueResponse] = service.deleteQueue(params).promise().toFuture
    @inline def describeEndpointsFuture(params: DescribeEndpointsRequest): Future[DescribeEndpointsResponse] = service.describeEndpoints(params).promise().toFuture
    @inline def disassociateCertificateFuture(params: DisassociateCertificateRequest): Future[DisassociateCertificateResponse] = service.disassociateCertificate(params).promise().toFuture
    @inline def getJobFuture(params: GetJobRequest): Future[GetJobResponse] = service.getJob(params).promise().toFuture
    @inline def getJobTemplateFuture(params: GetJobTemplateRequest): Future[GetJobTemplateResponse] = service.getJobTemplate(params).promise().toFuture
    @inline def getPresetFuture(params: GetPresetRequest): Future[GetPresetResponse] = service.getPreset(params).promise().toFuture
    @inline def getQueueFuture(params: GetQueueRequest): Future[GetQueueResponse] = service.getQueue(params).promise().toFuture
    @inline def listJobTemplatesFuture(params: ListJobTemplatesRequest): Future[ListJobTemplatesResponse] = service.listJobTemplates(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResponse] = service.listJobs(params).promise().toFuture
    @inline def listPresetsFuture(params: ListPresetsRequest): Future[ListPresetsResponse] = service.listPresets(params).promise().toFuture
    @inline def listQueuesFuture(params: ListQueuesRequest): Future[ListQueuesResponse] = service.listQueues(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateJobTemplateFuture(params: UpdateJobTemplateRequest): Future[UpdateJobTemplateResponse] = service.updateJobTemplate(params).promise().toFuture
    @inline def updatePresetFuture(params: UpdatePresetRequest): Future[UpdatePresetResponse] = service.updatePreset(params).promise().toFuture
    @inline def updateQueueFuture(params: UpdateQueueRequest): Future[UpdateQueueResponse] = service.updateQueue(params).promise().toFuture
  }
}

package mediaconvert {
  @js.native
  @JSImport("aws-sdk", "MediaConvert", "AWS.MediaConvert")
  class MediaConvert() extends js.Object {
    def this(config: AWSConfig) = this()

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
  @js.native
  sealed trait AacAudioDescriptionBroadcasterMix extends js.Any
  object AacAudioDescriptionBroadcasterMix {
    val BROADCASTER_MIXED_AD = "BROADCASTER_MIXED_AD".asInstanceOf[AacAudioDescriptionBroadcasterMix]
    val NORMAL = "NORMAL".asInstanceOf[AacAudioDescriptionBroadcasterMix]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(BROADCASTER_MIXED_AD, NORMAL))
  }

  /**
    * AAC Profile.
    */
  @js.native
  sealed trait AacCodecProfile extends js.Any
  object AacCodecProfile {
    val LC = "LC".asInstanceOf[AacCodecProfile]
    val HEV1 = "HEV1".asInstanceOf[AacCodecProfile]
    val HEV2 = "HEV2".asInstanceOf[AacCodecProfile]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(LC, HEV1, HEV2))
  }

  /**
    * Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. "1.0 - Audio Description (Receiver Mix)" setting receives a stereo description plus control track and emits a mono AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
    */
  @js.native
  sealed trait AacCodingMode extends js.Any
  object AacCodingMode {
    val AD_RECEIVER_MIX = "AD_RECEIVER_MIX".asInstanceOf[AacCodingMode]
    val CODING_MODE_1_0 = "CODING_MODE_1_0".asInstanceOf[AacCodingMode]
    val CODING_MODE_1_1 = "CODING_MODE_1_1".asInstanceOf[AacCodingMode]
    val CODING_MODE_2_0 = "CODING_MODE_2_0".asInstanceOf[AacCodingMode]
    val CODING_MODE_5_1 = "CODING_MODE_5_1".asInstanceOf[AacCodingMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0, CODING_MODE_5_1))
  }

  /**
    * Rate Control Mode.
    */
  @js.native
  sealed trait AacRateControlMode extends js.Any
  object AacRateControlMode {
    val CBR = "CBR".asInstanceOf[AacRateControlMode]
    val VBR = "VBR".asInstanceOf[AacRateControlMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(CBR, VBR))
  }

  /**
    * Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an output, you must choose "No container" for the output container.
    */
  @js.native
  sealed trait AacRawFormat extends js.Any
  object AacRawFormat {
    val LATM_LOAS = "LATM_LOAS".asInstanceOf[AacRawFormat]
    val NONE = "NONE".asInstanceOf[AacRawFormat]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(LATM_LOAS, NONE))
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
    @inline
    def apply(
        AudioDescriptionBroadcasterMix: js.UndefOr[AacAudioDescriptionBroadcasterMix] = js.undefined,
        Bitrate: js.UndefOr[__integerMin6000Max1024000] = js.undefined,
        CodecProfile: js.UndefOr[AacCodecProfile] = js.undefined,
        CodingMode: js.UndefOr[AacCodingMode] = js.undefined,
        RateControlMode: js.UndefOr[AacRateControlMode] = js.undefined,
        RawFormat: js.UndefOr[AacRawFormat] = js.undefined,
        SampleRate: js.UndefOr[__integerMin8000Max96000] = js.undefined,
        Specification: js.UndefOr[AacSpecification] = js.undefined,
        VbrQuality: js.UndefOr[AacVbrQuality] = js.undefined
    ): AacSettings = {
      val __obj = js.Dynamic.literal()
      AudioDescriptionBroadcasterMix.foreach(__v => __obj.updateDynamic("AudioDescriptionBroadcasterMix")(__v.asInstanceOf[js.Any]))
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      CodecProfile.foreach(__v => __obj.updateDynamic("CodecProfile")(__v.asInstanceOf[js.Any]))
      CodingMode.foreach(__v => __obj.updateDynamic("CodingMode")(__v.asInstanceOf[js.Any]))
      RateControlMode.foreach(__v => __obj.updateDynamic("RateControlMode")(__v.asInstanceOf[js.Any]))
      RawFormat.foreach(__v => __obj.updateDynamic("RawFormat")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      Specification.foreach(__v => __obj.updateDynamic("Specification")(__v.asInstanceOf[js.Any]))
      VbrQuality.foreach(__v => __obj.updateDynamic("VbrQuality")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AacSettings]
    }
  }

  /**
    * Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
    */
  @js.native
  sealed trait AacSpecification extends js.Any
  object AacSpecification {
    val MPEG2 = "MPEG2".asInstanceOf[AacSpecification]
    val MPEG4 = "MPEG4".asInstanceOf[AacSpecification]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(MPEG2, MPEG4))
  }

  /**
    * VBR Quality Level - Only used if rate_control_mode is VBR.
    */
  @js.native
  sealed trait AacVbrQuality extends js.Any
  object AacVbrQuality {
    val LOW = "LOW".asInstanceOf[AacVbrQuality]
    val MEDIUM_LOW = "MEDIUM_LOW".asInstanceOf[AacVbrQuality]
    val MEDIUM_HIGH = "MEDIUM_HIGH".asInstanceOf[AacVbrQuality]
    val HIGH = "HIGH".asInstanceOf[AacVbrQuality]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(LOW, MEDIUM_LOW, MEDIUM_HIGH, HIGH))
  }

  /**
    * Specify the bitstream mode for the AC-3 stream that the encoder emits. For more information about the AC3 bitstream mode, see ATSC A/52-2012 (Annex E).
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(COMPLETE_MAIN, COMMENTARY, DIALOGUE, EMERGENCY, HEARING_IMPAIRED, MUSIC_AND_EFFECTS, VISUALLY_IMPAIRED, VOICE_OVER))
  }

  /**
    * Dolby Digital coding mode. Determines number of channels.
    */
  @js.native
  sealed trait Ac3CodingMode extends js.Any
  object Ac3CodingMode {
    val CODING_MODE_1_0 = "CODING_MODE_1_0".asInstanceOf[Ac3CodingMode]
    val CODING_MODE_1_1 = "CODING_MODE_1_1".asInstanceOf[Ac3CodingMode]
    val CODING_MODE_2_0 = "CODING_MODE_2_0".asInstanceOf[Ac3CodingMode]
    val CODING_MODE_3_2_LFE = "CODING_MODE_3_2_LFE".asInstanceOf[Ac3CodingMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0, CODING_MODE_3_2_LFE))
  }

  /**
    * If set to FILM_STANDARD, adds dynamic range compression signaling to the output bitstream as defined in the Dolby Digital specification.
    */
  @js.native
  sealed trait Ac3DynamicRangeCompressionProfile extends js.Any
  object Ac3DynamicRangeCompressionProfile {
    val FILM_STANDARD = "FILM_STANDARD".asInstanceOf[Ac3DynamicRangeCompressionProfile]
    val NONE = "NONE".asInstanceOf[Ac3DynamicRangeCompressionProfile]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(FILM_STANDARD, NONE))
  }

  /**
    * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
    */
  @js.native
  sealed trait Ac3LfeFilter extends js.Any
  object Ac3LfeFilter {
    val ENABLED = "ENABLED".asInstanceOf[Ac3LfeFilter]
    val DISABLED = "DISABLED".asInstanceOf[Ac3LfeFilter]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
    */
  @js.native
  sealed trait Ac3MetadataControl extends js.Any
  object Ac3MetadataControl {
    val FOLLOW_INPUT = "FOLLOW_INPUT".asInstanceOf[Ac3MetadataControl]
    val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[Ac3MetadataControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(FOLLOW_INPUT, USE_CONFIGURED))
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
    @inline
    def apply(
        Bitrate: js.UndefOr[__integerMin64000Max640000] = js.undefined,
        BitstreamMode: js.UndefOr[Ac3BitstreamMode] = js.undefined,
        CodingMode: js.UndefOr[Ac3CodingMode] = js.undefined,
        Dialnorm: js.UndefOr[__integerMin1Max31] = js.undefined,
        DynamicRangeCompressionProfile: js.UndefOr[Ac3DynamicRangeCompressionProfile] = js.undefined,
        LfeFilter: js.UndefOr[Ac3LfeFilter] = js.undefined,
        MetadataControl: js.UndefOr[Ac3MetadataControl] = js.undefined,
        SampleRate: js.UndefOr[__integerMin48000Max48000] = js.undefined
    ): Ac3Settings = {
      val __obj = js.Dynamic.literal()
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      BitstreamMode.foreach(__v => __obj.updateDynamic("BitstreamMode")(__v.asInstanceOf[js.Any]))
      CodingMode.foreach(__v => __obj.updateDynamic("CodingMode")(__v.asInstanceOf[js.Any]))
      Dialnorm.foreach(__v => __obj.updateDynamic("Dialnorm")(__v.asInstanceOf[js.Any]))
      DynamicRangeCompressionProfile.foreach(__v => __obj.updateDynamic("DynamicRangeCompressionProfile")(__v.asInstanceOf[js.Any]))
      LfeFilter.foreach(__v => __obj.updateDynamic("LfeFilter")(__v.asInstanceOf[js.Any]))
      MetadataControl.foreach(__v => __obj.updateDynamic("MetadataControl")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Ac3Settings]
    }
  }

  /**
    * Specify whether the service runs your job with accelerated transcoding. Choose DISABLED if you don't want accelerated transcoding. Choose ENABLED if you want your job to run with accelerated transcoding and to fail if your input files or your job settings aren't compatible with accelerated transcoding. Choose PREFERRED if you want your job to run with accelerated transcoding if the job is compatible with the feature and to run at standard speed if it's not.
    */
  @js.native
  sealed trait AccelerationMode extends js.Any
  object AccelerationMode {
    val DISABLED = "DISABLED".asInstanceOf[AccelerationMode]
    val ENABLED = "ENABLED".asInstanceOf[AccelerationMode]
    val PREFERRED = "PREFERRED".asInstanceOf[AccelerationMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED, PREFERRED))
  }

  /**
    * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
    */
  @js.native
  trait AccelerationSettings extends js.Object {
    var Mode: AccelerationMode
  }

  object AccelerationSettings {
    @inline
    def apply(
        Mode: AccelerationMode
    ): AccelerationSettings = {
      val __obj = js.Dynamic.literal(
        "Mode" -> Mode.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AccelerationSettings]
    }
  }

  /**
    * Describes whether the current job is running with accelerated transcoding. For jobs that have Acceleration (AccelerationMode) set to DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have Acceleration (AccelerationMode) set to ENABLED or PREFERRED, AccelerationStatus is one of the other states. AccelerationStatus is IN_PROGRESS initially, while the service determines whether the input files and job settings are compatible with accelerated transcoding. If they are, AcclerationStatus is ACCELERATED. If your input files and job settings aren't compatible with accelerated transcoding, the service either fails your job or runs it without accelerated transcoding, depending on how you set Acceleration (AccelerationMode). When the service runs your job without accelerated transcoding, AccelerationStatus is NOT_ACCELERATED.
    */
  @js.native
  sealed trait AccelerationStatus extends js.Any
  object AccelerationStatus {
    val NOT_APPLICABLE = "NOT_APPLICABLE".asInstanceOf[AccelerationStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AccelerationStatus]
    val ACCELERATED = "ACCELERATED".asInstanceOf[AccelerationStatus]
    val NOT_ACCELERATED = "NOT_ACCELERATED".asInstanceOf[AccelerationStatus]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NOT_APPLICABLE, IN_PROGRESS, ACCELERATED, NOT_ACCELERATED))
  }

  /**
    * This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert AFD signaling (AfdSignaling) to specify whether the service includes AFD values in the output video data and what those values are. * Choose None to remove all AFD values from this output. * Choose Fixed to ignore input AFD values and instead encode the value specified in the job. * Choose Auto to calculate output AFD values based on the input AFD scaler data.
    */
  @js.native
  sealed trait AfdSignaling extends js.Any
  object AfdSignaling {
    val NONE = "NONE".asInstanceOf[AfdSignaling]
    val AUTO = "AUTO".asInstanceOf[AfdSignaling]
    val FIXED = "FIXED".asInstanceOf[AfdSignaling]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NONE, AUTO, FIXED))
  }

  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AIFF.
    */
  @js.native
  trait AiffSettings extends js.Object {
    var BitDepth: js.UndefOr[__integerMin16Max24]
    var Channels: js.UndefOr[__integerMin1Max64]
    var SampleRate: js.UndefOr[__integerMin8000Max192000]
  }

  object AiffSettings {
    @inline
    def apply(
        BitDepth: js.UndefOr[__integerMin16Max24] = js.undefined,
        Channels: js.UndefOr[__integerMin1Max64] = js.undefined,
        SampleRate: js.UndefOr[__integerMin8000Max192000] = js.undefined
    ): AiffSettings = {
      val __obj = js.Dynamic.literal()
      BitDepth.foreach(__v => __obj.updateDynamic("BitDepth")(__v.asInstanceOf[js.Any]))
      Channels.foreach(__v => __obj.updateDynamic("Channels")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AiffSettings]
    }
  }

  /**
    * Ignore this setting unless this input is a QuickTime animation with an alpha channel. Use this setting to create separate Key and Fill outputs. In each output, specify which part of the input MediaConvert uses. Leave this setting at the default value DISCARD to delete the alpha channel and preserve the video. Set it to REMAP_TO_LUMA to delete the video and map the alpha channel to the luma channel of your outputs.
    */
  @js.native
  sealed trait AlphaBehavior extends js.Any
  object AlphaBehavior {
    val DISCARD = "DISCARD".asInstanceOf[AlphaBehavior]
    val REMAP_TO_LUMA = "REMAP_TO_LUMA".asInstanceOf[AlphaBehavior]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISCARD, REMAP_TO_LUMA))
  }

  /**
    * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
    */
  @js.native
  sealed trait AncillaryConvert608To708 extends js.Any
  object AncillaryConvert608To708 {
    val UPCONVERT = "UPCONVERT".asInstanceOf[AncillaryConvert608To708]
    val DISABLED = "DISABLED".asInstanceOf[AncillaryConvert608To708]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(UPCONVERT, DISABLED))
  }

  /**
    * Settings for ancillary captions source.
    */
  @js.native
  trait AncillarySourceSettings extends js.Object {
    var Convert608To708: js.UndefOr[AncillaryConvert608To708]
    var SourceAncillaryChannelNumber: js.UndefOr[__integerMin1Max4]
    var TerminateCaptions: js.UndefOr[AncillaryTerminateCaptions]
  }

  object AncillarySourceSettings {
    @inline
    def apply(
        Convert608To708: js.UndefOr[AncillaryConvert608To708] = js.undefined,
        SourceAncillaryChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined,
        TerminateCaptions: js.UndefOr[AncillaryTerminateCaptions] = js.undefined
    ): AncillarySourceSettings = {
      val __obj = js.Dynamic.literal()
      Convert608To708.foreach(__v => __obj.updateDynamic("Convert608To708")(__v.asInstanceOf[js.Any]))
      SourceAncillaryChannelNumber.foreach(__v => __obj.updateDynamic("SourceAncillaryChannelNumber")(__v.asInstanceOf[js.Any]))
      TerminateCaptions.foreach(__v => __obj.updateDynamic("TerminateCaptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AncillarySourceSettings]
    }
  }

  /**
    * By default, the service terminates any unterminated captions at the end of each input. If you want the caption to continue onto your next input, disable this setting.
    */
  @js.native
  sealed trait AncillaryTerminateCaptions extends js.Any
  object AncillaryTerminateCaptions {
    val END_OF_INPUT = "END_OF_INPUT".asInstanceOf[AncillaryTerminateCaptions]
    val DISABLED = "DISABLED".asInstanceOf[AncillaryTerminateCaptions]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(END_OF_INPUT, DISABLED))
  }

  /**
    * The anti-alias filter is automatically applied to all outputs. The service no longer accepts the value DISABLED for AntiAlias. If you specify that in your job, the service will ignore the setting.
    */
  @js.native
  sealed trait AntiAlias extends js.Any
  object AntiAlias {
    val DISABLED = "DISABLED".asInstanceOf[AntiAlias]
    val ENABLED = "ENABLED".asInstanceOf[AntiAlias]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  @js.native
  trait AssociateCertificateRequest extends js.Object {
    var Arn: __string
  }

  object AssociateCertificateRequest {
    @inline
    def apply(
        Arn: __string
    ): AssociateCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateCertificateRequest]
    }
  }

  @js.native
  trait AssociateCertificateResponse extends js.Object {}

  object AssociateCertificateResponse {
    @inline
    def apply(
    ): AssociateCertificateResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateCertificateResponse]
    }
  }

  /**
    * Type of Audio codec.
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(AAC, MP2, MP3, WAV, AIFF, AC3, EAC3, EAC3_ATMOS, VORBIS, OPUS, PASSTHROUGH))
  }

  /**
    * Audio codec settings (CodecSettings) under (AudioDescriptions) contains the group of settings related to audio encoding. The settings in this group vary depending on the value that you choose for Audio codec (Codec). For each codec enum that you choose, define the corresponding settings object. The following lists the codec enum, settings object pairs. * AAC, AacSettings * MP2, Mp2Settings * MP3, Mp3Settings * WAV, WavSettings * AIFF, AiffSettings * AC3, Ac3Settings * EAC3, Eac3Settings * EAC3_ATMOS, Eac3AtmosSettings * VORBIS, VorbisSettings * OPUS, OpusSettings
    */
  @js.native
  trait AudioCodecSettings extends js.Object {
    var AacSettings: js.UndefOr[AacSettings]
    var Ac3Settings: js.UndefOr[Ac3Settings]
    var AiffSettings: js.UndefOr[AiffSettings]
    var Codec: js.UndefOr[AudioCodec]
    var Eac3AtmosSettings: js.UndefOr[Eac3AtmosSettings]
    var Eac3Settings: js.UndefOr[Eac3Settings]
    var Mp2Settings: js.UndefOr[Mp2Settings]
    var Mp3Settings: js.UndefOr[Mp3Settings]
    var OpusSettings: js.UndefOr[OpusSettings]
    var VorbisSettings: js.UndefOr[VorbisSettings]
    var WavSettings: js.UndefOr[WavSettings]
  }

  object AudioCodecSettings {
    @inline
    def apply(
        AacSettings: js.UndefOr[AacSettings] = js.undefined,
        Ac3Settings: js.UndefOr[Ac3Settings] = js.undefined,
        AiffSettings: js.UndefOr[AiffSettings] = js.undefined,
        Codec: js.UndefOr[AudioCodec] = js.undefined,
        Eac3AtmosSettings: js.UndefOr[Eac3AtmosSettings] = js.undefined,
        Eac3Settings: js.UndefOr[Eac3Settings] = js.undefined,
        Mp2Settings: js.UndefOr[Mp2Settings] = js.undefined,
        Mp3Settings: js.UndefOr[Mp3Settings] = js.undefined,
        OpusSettings: js.UndefOr[OpusSettings] = js.undefined,
        VorbisSettings: js.UndefOr[VorbisSettings] = js.undefined,
        WavSettings: js.UndefOr[WavSettings] = js.undefined
    ): AudioCodecSettings = {
      val __obj = js.Dynamic.literal()
      AacSettings.foreach(__v => __obj.updateDynamic("AacSettings")(__v.asInstanceOf[js.Any]))
      Ac3Settings.foreach(__v => __obj.updateDynamic("Ac3Settings")(__v.asInstanceOf[js.Any]))
      AiffSettings.foreach(__v => __obj.updateDynamic("AiffSettings")(__v.asInstanceOf[js.Any]))
      Codec.foreach(__v => __obj.updateDynamic("Codec")(__v.asInstanceOf[js.Any]))
      Eac3AtmosSettings.foreach(__v => __obj.updateDynamic("Eac3AtmosSettings")(__v.asInstanceOf[js.Any]))
      Eac3Settings.foreach(__v => __obj.updateDynamic("Eac3Settings")(__v.asInstanceOf[js.Any]))
      Mp2Settings.foreach(__v => __obj.updateDynamic("Mp2Settings")(__v.asInstanceOf[js.Any]))
      Mp3Settings.foreach(__v => __obj.updateDynamic("Mp3Settings")(__v.asInstanceOf[js.Any]))
      OpusSettings.foreach(__v => __obj.updateDynamic("OpusSettings")(__v.asInstanceOf[js.Any]))
      VorbisSettings.foreach(__v => __obj.updateDynamic("VorbisSettings")(__v.asInstanceOf[js.Any]))
      WavSettings.foreach(__v => __obj.updateDynamic("WavSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioCodecSettings]
    }
  }

  /**
    * Enable this setting on one audio selector to set it as the default for the job. The service uses this default for outputs where it can't find the specified input audio. If you don't set a default, those outputs have no audio.
    */
  @js.native
  sealed trait AudioDefaultSelection extends js.Any
  object AudioDefaultSelection {
    val DEFAULT = "DEFAULT".asInstanceOf[AudioDefaultSelection]
    val NOT_DEFAULT = "NOT_DEFAULT".asInstanceOf[AudioDefaultSelection]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DEFAULT, NOT_DEFAULT))
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
    var CustomLanguageCode: js.UndefOr[__stringPatternAZaZ23AZaZ]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LanguageCodeControl: js.UndefOr[AudioLanguageCodeControl]
    var RemixSettings: js.UndefOr[RemixSettings]
    var StreamName: js.UndefOr[__stringPatternWS]
  }

  object AudioDescription {
    @inline
    def apply(
        AudioNormalizationSettings: js.UndefOr[AudioNormalizationSettings] = js.undefined,
        AudioSourceName: js.UndefOr[__string] = js.undefined,
        AudioType: js.UndefOr[__integerMin0Max255] = js.undefined,
        AudioTypeControl: js.UndefOr[AudioTypeControl] = js.undefined,
        CodecSettings: js.UndefOr[AudioCodecSettings] = js.undefined,
        CustomLanguageCode: js.UndefOr[__stringPatternAZaZ23AZaZ] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LanguageCodeControl: js.UndefOr[AudioLanguageCodeControl] = js.undefined,
        RemixSettings: js.UndefOr[RemixSettings] = js.undefined,
        StreamName: js.UndefOr[__stringPatternWS] = js.undefined
    ): AudioDescription = {
      val __obj = js.Dynamic.literal()
      AudioNormalizationSettings.foreach(__v => __obj.updateDynamic("AudioNormalizationSettings")(__v.asInstanceOf[js.Any]))
      AudioSourceName.foreach(__v => __obj.updateDynamic("AudioSourceName")(__v.asInstanceOf[js.Any]))
      AudioType.foreach(__v => __obj.updateDynamic("AudioType")(__v.asInstanceOf[js.Any]))
      AudioTypeControl.foreach(__v => __obj.updateDynamic("AudioTypeControl")(__v.asInstanceOf[js.Any]))
      CodecSettings.foreach(__v => __obj.updateDynamic("CodecSettings")(__v.asInstanceOf[js.Any]))
      CustomLanguageCode.foreach(__v => __obj.updateDynamic("CustomLanguageCode")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LanguageCodeControl.foreach(__v => __obj.updateDynamic("LanguageCodeControl")(__v.asInstanceOf[js.Any]))
      RemixSettings.foreach(__v => __obj.updateDynamic("RemixSettings")(__v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioDescription]
    }
  }

  /**
    * Specify which source for language code takes precedence for this audio track. When you choose Follow input (FOLLOW_INPUT), the service uses the language code from the input track if it's present. If there's no languge code on the input track, the service uses the code that you specify in the setting Language code (languageCode or customLanguageCode). When you choose Use configured (USE_CONFIGURED), the service uses the language code that you specify.
    */
  @js.native
  sealed trait AudioLanguageCodeControl extends js.Any
  object AudioLanguageCodeControl {
    val FOLLOW_INPUT = "FOLLOW_INPUT".asInstanceOf[AudioLanguageCodeControl]
    val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[AudioLanguageCodeControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(FOLLOW_INPUT, USE_CONFIGURED))
  }

  /**
    * Choose one of the following audio normalization algorithms: ITU-R BS.1770-1: Ungated loudness. A measurement of ungated average loudness for an entire piece of content, suitable for measurement of short-form content under ATSC recommendation A/85. Supports up to 5.1 audio channels. ITU-R BS.1770-2: Gated loudness. A measurement of gated average loudness compliant with the requirements of EBU-R128. Supports up to 5.1 audio channels. ITU-R BS.1770-3: Modified peak. The same loudness measurement algorithm as 1770-2, with an updated true peak measurement. ITU-R BS.1770-4: Higher channel count. Allows for more audio channels than the other algorithms, including configurations such as 7.1.
    */
  @js.native
  sealed trait AudioNormalizationAlgorithm extends js.Any
  object AudioNormalizationAlgorithm {
    val ITU_BS_1770_1 = "ITU_BS_1770_1".asInstanceOf[AudioNormalizationAlgorithm]
    val ITU_BS_1770_2 = "ITU_BS_1770_2".asInstanceOf[AudioNormalizationAlgorithm]
    val ITU_BS_1770_3 = "ITU_BS_1770_3".asInstanceOf[AudioNormalizationAlgorithm]
    val ITU_BS_1770_4 = "ITU_BS_1770_4".asInstanceOf[AudioNormalizationAlgorithm]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ITU_BS_1770_1, ITU_BS_1770_2, ITU_BS_1770_3, ITU_BS_1770_4))
  }

  /**
    * When enabled the output audio is corrected using the chosen algorithm. If disabled, the audio will be measured but not adjusted.
    */
  @js.native
  sealed trait AudioNormalizationAlgorithmControl extends js.Any
  object AudioNormalizationAlgorithmControl {
    val CORRECT_AUDIO = "CORRECT_AUDIO".asInstanceOf[AudioNormalizationAlgorithmControl]
    val MEASURE_ONLY = "MEASURE_ONLY".asInstanceOf[AudioNormalizationAlgorithmControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(CORRECT_AUDIO, MEASURE_ONLY))
  }

  /**
    * If set to LOG, log each output's audio track loudness to a CSV file.
    */
  @js.native
  sealed trait AudioNormalizationLoudnessLogging extends js.Any
  object AudioNormalizationLoudnessLogging {
    val LOG = "LOG".asInstanceOf[AudioNormalizationLoudnessLogging]
    val DONT_LOG = "DONT_LOG".asInstanceOf[AudioNormalizationLoudnessLogging]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(LOG, DONT_LOG))
  }

  /**
    * If set to TRUE_PEAK, calculate and log the TruePeak for each output's audio track loudness.
    */
  @js.native
  sealed trait AudioNormalizationPeakCalculation extends js.Any
  object AudioNormalizationPeakCalculation {
    val TRUE_PEAK = "TRUE_PEAK".asInstanceOf[AudioNormalizationPeakCalculation]
    val NONE = "NONE".asInstanceOf[AudioNormalizationPeakCalculation]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(TRUE_PEAK, NONE))
  }

  /**
    * Advanced audio normalization settings. Ignore these settings unless you need to comply with a loudness standard.
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
    @inline
    def apply(
        Algorithm: js.UndefOr[AudioNormalizationAlgorithm] = js.undefined,
        AlgorithmControl: js.UndefOr[AudioNormalizationAlgorithmControl] = js.undefined,
        CorrectionGateLevel: js.UndefOr[__integerMinNegative70Max0] = js.undefined,
        LoudnessLogging: js.UndefOr[AudioNormalizationLoudnessLogging] = js.undefined,
        PeakCalculation: js.UndefOr[AudioNormalizationPeakCalculation] = js.undefined,
        TargetLkfs: js.UndefOr[__doubleMinNegative59Max0] = js.undefined
    ): AudioNormalizationSettings = {
      val __obj = js.Dynamic.literal()
      Algorithm.foreach(__v => __obj.updateDynamic("Algorithm")(__v.asInstanceOf[js.Any]))
      AlgorithmControl.foreach(__v => __obj.updateDynamic("AlgorithmControl")(__v.asInstanceOf[js.Any]))
      CorrectionGateLevel.foreach(__v => __obj.updateDynamic("CorrectionGateLevel")(__v.asInstanceOf[js.Any]))
      LoudnessLogging.foreach(__v => __obj.updateDynamic("LoudnessLogging")(__v.asInstanceOf[js.Any]))
      PeakCalculation.foreach(__v => __obj.updateDynamic("PeakCalculation")(__v.asInstanceOf[js.Any]))
      TargetLkfs.foreach(__v => __obj.updateDynamic("TargetLkfs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioNormalizationSettings]
    }
  }

  /**
    * Selector for Audio
    */
  @js.native
  trait AudioSelector extends js.Object {
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3]
    var DefaultSelection: js.UndefOr[AudioDefaultSelection]
    var ExternalAudioFileInput: js.UndefOr[__stringPatternS3WWEEBBMMMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEEHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEE]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Offset: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var Pids: js.UndefOr[__listOf__integerMin1Max2147483647]
    var ProgramSelection: js.UndefOr[__integerMin0Max8]
    var RemixSettings: js.UndefOr[RemixSettings]
    var SelectorType: js.UndefOr[AudioSelectorType]
    var Tracks: js.UndefOr[__listOf__integerMin1Max2147483647]
  }

  object AudioSelector {
    @inline
    def apply(
        CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined,
        DefaultSelection: js.UndefOr[AudioDefaultSelection] = js.undefined,
        ExternalAudioFileInput: js.UndefOr[__stringPatternS3WWEEBBMMMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEEHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEE] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Offset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        Pids: js.UndefOr[__listOf__integerMin1Max2147483647] = js.undefined,
        ProgramSelection: js.UndefOr[__integerMin0Max8] = js.undefined,
        RemixSettings: js.UndefOr[RemixSettings] = js.undefined,
        SelectorType: js.UndefOr[AudioSelectorType] = js.undefined,
        Tracks: js.UndefOr[__listOf__integerMin1Max2147483647] = js.undefined
    ): AudioSelector = {
      val __obj = js.Dynamic.literal()
      CustomLanguageCode.foreach(__v => __obj.updateDynamic("CustomLanguageCode")(__v.asInstanceOf[js.Any]))
      DefaultSelection.foreach(__v => __obj.updateDynamic("DefaultSelection")(__v.asInstanceOf[js.Any]))
      ExternalAudioFileInput.foreach(__v => __obj.updateDynamic("ExternalAudioFileInput")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      Offset.foreach(__v => __obj.updateDynamic("Offset")(__v.asInstanceOf[js.Any]))
      Pids.foreach(__v => __obj.updateDynamic("Pids")(__v.asInstanceOf[js.Any]))
      ProgramSelection.foreach(__v => __obj.updateDynamic("ProgramSelection")(__v.asInstanceOf[js.Any]))
      RemixSettings.foreach(__v => __obj.updateDynamic("RemixSettings")(__v.asInstanceOf[js.Any]))
      SelectorType.foreach(__v => __obj.updateDynamic("SelectorType")(__v.asInstanceOf[js.Any]))
      Tracks.foreach(__v => __obj.updateDynamic("Tracks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioSelector]
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
    @inline
    def apply(
        AudioSelectorNames: js.UndefOr[__listOf__stringMin1] = js.undefined
    ): AudioSelectorGroup = {
      val __obj = js.Dynamic.literal()
      AudioSelectorNames.foreach(__v => __obj.updateDynamic("AudioSelectorNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioSelectorGroup]
    }
  }

  /**
    * Specifies the type of the audio selector.
    */
  @js.native
  sealed trait AudioSelectorType extends js.Any
  object AudioSelectorType {
    val PID = "PID".asInstanceOf[AudioSelectorType]
    val TRACK = "TRACK".asInstanceOf[AudioSelectorType]
    val LANGUAGE_CODE = "LANGUAGE_CODE".asInstanceOf[AudioSelectorType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PID, TRACK, LANGUAGE_CODE))
  }

  /**
    * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise the value in Audio Type is included in the output. Note that this field and audioType are both ignored if audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
    */
  @js.native
  sealed trait AudioTypeControl extends js.Any
  object AudioTypeControl {
    val FOLLOW_INPUT = "FOLLOW_INPUT".asInstanceOf[AudioTypeControl]
    val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[AudioTypeControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(FOLLOW_INPUT, USE_CONFIGURED))
  }

  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(OFF, LOW, MEDIUM, HIGH, HIGHER, MAX))
  }

  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  @js.native
  sealed trait Av1FramerateControl extends js.Any
  object Av1FramerateControl {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[Av1FramerateControl]
    val SPECIFIED = "SPECIFIED".asInstanceOf[Av1FramerateControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * Optional. Specify how the transcoder performs framerate conversion. The default behavior is to use duplicate drop conversion.
    */
  @js.native
  sealed trait Av1FramerateConversionAlgorithm extends js.Any
  object Av1FramerateConversionAlgorithm {
    val DUPLICATE_DROP = "DUPLICATE_DROP".asInstanceOf[Av1FramerateConversionAlgorithm]
    val INTERPOLATE = "INTERPOLATE".asInstanceOf[Av1FramerateConversionAlgorithm]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DUPLICATE_DROP, INTERPOLATE))
  }

  /**
    * Settings for quality-defined variable bitrate encoding with the AV1 codec. Required when you set Rate control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control mode.
    */
  @js.native
  trait Av1QvbrSettings extends js.Object {
    var QvbrQualityLevel: js.UndefOr[__integerMin1Max10]
    var QvbrQualityLevelFineTune: js.UndefOr[__doubleMin0Max1]
  }

  object Av1QvbrSettings {
    @inline
    def apply(
        QvbrQualityLevel: js.UndefOr[__integerMin1Max10] = js.undefined,
        QvbrQualityLevelFineTune: js.UndefOr[__doubleMin0Max1] = js.undefined
    ): Av1QvbrSettings = {
      val __obj = js.Dynamic.literal()
      QvbrQualityLevel.foreach(__v => __obj.updateDynamic("QvbrQualityLevel")(__v.asInstanceOf[js.Any]))
      QvbrQualityLevelFineTune.foreach(__v => __obj.updateDynamic("QvbrQualityLevelFineTune")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Av1QvbrSettings]
    }
  }

  /**
    * 'With AV1 outputs, for rate control mode, MediaConvert supports only quality-defined variable bitrate (QVBR). You can''t use CBR or VBR.'
    */
  @js.native
  sealed trait Av1RateControlMode extends js.Any
  object Av1RateControlMode {
    val QVBR = "QVBR".asInstanceOf[Av1RateControlMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(QVBR))
  }

  /**
    * Required when you set Codec, under VideoDescription>CodecSettings to the value AV1.
    */
  @js.native
  trait Av1Settings extends js.Object {
    var AdaptiveQuantization: js.UndefOr[Av1AdaptiveQuantization]
    var FramerateControl: js.UndefOr[Av1FramerateControl]
    var FramerateConversionAlgorithm: js.UndefOr[Av1FramerateConversionAlgorithm]
    var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647]
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647]
    var GopSize: js.UndefOr[__doubleMin0]
    var MaxBitrate: js.UndefOr[__integerMin1000Max1152000000]
    var NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin7Max15]
    var QvbrSettings: js.UndefOr[Av1QvbrSettings]
    var RateControlMode: js.UndefOr[Av1RateControlMode]
    var Slices: js.UndefOr[__integerMin1Max32]
    var SpatialAdaptiveQuantization: js.UndefOr[Av1SpatialAdaptiveQuantization]
  }

  object Av1Settings {
    @inline
    def apply(
        AdaptiveQuantization: js.UndefOr[Av1AdaptiveQuantization] = js.undefined,
        FramerateControl: js.UndefOr[Av1FramerateControl] = js.undefined,
        FramerateConversionAlgorithm: js.UndefOr[Av1FramerateConversionAlgorithm] = js.undefined,
        FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        GopSize: js.UndefOr[__doubleMin0] = js.undefined,
        MaxBitrate: js.UndefOr[__integerMin1000Max1152000000] = js.undefined,
        NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin7Max15] = js.undefined,
        QvbrSettings: js.UndefOr[Av1QvbrSettings] = js.undefined,
        RateControlMode: js.UndefOr[Av1RateControlMode] = js.undefined,
        Slices: js.UndefOr[__integerMin1Max32] = js.undefined,
        SpatialAdaptiveQuantization: js.UndefOr[Av1SpatialAdaptiveQuantization] = js.undefined
    ): Av1Settings = {
      val __obj = js.Dynamic.literal()
      AdaptiveQuantization.foreach(__v => __obj.updateDynamic("AdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      FramerateControl.foreach(__v => __obj.updateDynamic("FramerateControl")(__v.asInstanceOf[js.Any]))
      FramerateConversionAlgorithm.foreach(__v => __obj.updateDynamic("FramerateConversionAlgorithm")(__v.asInstanceOf[js.Any]))
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      GopSize.foreach(__v => __obj.updateDynamic("GopSize")(__v.asInstanceOf[js.Any]))
      MaxBitrate.foreach(__v => __obj.updateDynamic("MaxBitrate")(__v.asInstanceOf[js.Any]))
      NumberBFramesBetweenReferenceFrames.foreach(__v => __obj.updateDynamic("NumberBFramesBetweenReferenceFrames")(__v.asInstanceOf[js.Any]))
      QvbrSettings.foreach(__v => __obj.updateDynamic("QvbrSettings")(__v.asInstanceOf[js.Any]))
      RateControlMode.foreach(__v => __obj.updateDynamic("RateControlMode")(__v.asInstanceOf[js.Any]))
      Slices.foreach(__v => __obj.updateDynamic("Slices")(__v.asInstanceOf[js.Any]))
      SpatialAdaptiveQuantization.foreach(__v => __obj.updateDynamic("SpatialAdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Av1Settings]
    }
  }

  /**
    * Adjust quantization within each frame based on spatial variation of content complexity.
    */
  @js.native
  sealed trait Av1SpatialAdaptiveQuantization extends js.Any
  object Av1SpatialAdaptiveQuantization {
    val DISABLED = "DISABLED".asInstanceOf[Av1SpatialAdaptiveQuantization]
    val ENABLED = "ENABLED".asInstanceOf[Av1SpatialAdaptiveQuantization]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Settings for Avail Blanking
    */
  @js.native
  trait AvailBlanking extends js.Object {
    var AvailBlankingImage: js.UndefOr[__stringMin14PatternS3BmpBMPPngPNGHttpsBmpBMPPngPNG]
  }

  object AvailBlanking {
    @inline
    def apply(
        AvailBlankingImage: js.UndefOr[__stringMin14PatternS3BmpBMPPngPNGHttpsBmpBMPPngPNG] = js.undefined
    ): AvailBlanking = {
      val __obj = js.Dynamic.literal()
      AvailBlankingImage.foreach(__v => __obj.updateDynamic("AvailBlankingImage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailBlanking]
    }
  }

  /**
    * The tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs on any billing report that you set up.
    */
  @js.native
  sealed trait BillingTagsSource extends js.Any
  object BillingTagsSource {
    val QUEUE = "QUEUE".asInstanceOf[BillingTagsSource]
    val PRESET = "PRESET".asInstanceOf[BillingTagsSource]
    val JOB_TEMPLATE = "JOB_TEMPLATE".asInstanceOf[BillingTagsSource]
    val JOB = "JOB".asInstanceOf[BillingTagsSource]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(QUEUE, PRESET, JOB_TEMPLATE, JOB))
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
    var FontScript: js.UndefOr[FontScript]
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
    @inline
    def apply(
        Alignment: js.UndefOr[BurninSubtitleAlignment] = js.undefined,
        BackgroundColor: js.UndefOr[BurninSubtitleBackgroundColor] = js.undefined,
        BackgroundOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        FontColor: js.UndefOr[BurninSubtitleFontColor] = js.undefined,
        FontOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        FontResolution: js.UndefOr[__integerMin96Max600] = js.undefined,
        FontScript: js.UndefOr[FontScript] = js.undefined,
        FontSize: js.UndefOr[__integerMin0Max96] = js.undefined,
        OutlineColor: js.UndefOr[BurninSubtitleOutlineColor] = js.undefined,
        OutlineSize: js.UndefOr[__integerMin0Max10] = js.undefined,
        ShadowColor: js.UndefOr[BurninSubtitleShadowColor] = js.undefined,
        ShadowOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        ShadowXOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        ShadowYOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        TeletextSpacing: js.UndefOr[BurninSubtitleTeletextSpacing] = js.undefined,
        XPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        YPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    ): BurninDestinationSettings = {
      val __obj = js.Dynamic.literal()
      Alignment.foreach(__v => __obj.updateDynamic("Alignment")(__v.asInstanceOf[js.Any]))
      BackgroundColor.foreach(__v => __obj.updateDynamic("BackgroundColor")(__v.asInstanceOf[js.Any]))
      BackgroundOpacity.foreach(__v => __obj.updateDynamic("BackgroundOpacity")(__v.asInstanceOf[js.Any]))
      FontColor.foreach(__v => __obj.updateDynamic("FontColor")(__v.asInstanceOf[js.Any]))
      FontOpacity.foreach(__v => __obj.updateDynamic("FontOpacity")(__v.asInstanceOf[js.Any]))
      FontResolution.foreach(__v => __obj.updateDynamic("FontResolution")(__v.asInstanceOf[js.Any]))
      FontScript.foreach(__v => __obj.updateDynamic("FontScript")(__v.asInstanceOf[js.Any]))
      FontSize.foreach(__v => __obj.updateDynamic("FontSize")(__v.asInstanceOf[js.Any]))
      OutlineColor.foreach(__v => __obj.updateDynamic("OutlineColor")(__v.asInstanceOf[js.Any]))
      OutlineSize.foreach(__v => __obj.updateDynamic("OutlineSize")(__v.asInstanceOf[js.Any]))
      ShadowColor.foreach(__v => __obj.updateDynamic("ShadowColor")(__v.asInstanceOf[js.Any]))
      ShadowOpacity.foreach(__v => __obj.updateDynamic("ShadowOpacity")(__v.asInstanceOf[js.Any]))
      ShadowXOffset.foreach(__v => __obj.updateDynamic("ShadowXOffset")(__v.asInstanceOf[js.Any]))
      ShadowYOffset.foreach(__v => __obj.updateDynamic("ShadowYOffset")(__v.asInstanceOf[js.Any]))
      TeletextSpacing.foreach(__v => __obj.updateDynamic("TeletextSpacing")(__v.asInstanceOf[js.Any]))
      XPosition.foreach(__v => __obj.updateDynamic("XPosition")(__v.asInstanceOf[js.Any]))
      YPosition.foreach(__v => __obj.updateDynamic("YPosition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BurninDestinationSettings]
    }
  }

  /**
    * If no explicit x_position or y_position is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  @js.native
  sealed trait BurninSubtitleAlignment extends js.Any
  object BurninSubtitleAlignment {
    val CENTERED = "CENTERED".asInstanceOf[BurninSubtitleAlignment]
    val LEFT = "LEFT".asInstanceOf[BurninSubtitleAlignment]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(CENTERED, LEFT))
  }

  /**
    * Specifies the color of the rectangle behind the captions.
    * All burn-in and DVB-Sub font settings must match.
    */
  @js.native
  sealed trait BurninSubtitleBackgroundColor extends js.Any
  object BurninSubtitleBackgroundColor {
    val NONE = "NONE".asInstanceOf[BurninSubtitleBackgroundColor]
    val BLACK = "BLACK".asInstanceOf[BurninSubtitleBackgroundColor]
    val WHITE = "WHITE".asInstanceOf[BurninSubtitleBackgroundColor]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NONE, BLACK, WHITE))
  }

  /**
    * Specifies the color of the burned-in captions. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(WHITE, BLACK, YELLOW, RED, GREEN, BLUE))
  }

  /**
    * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(BLACK, WHITE, YELLOW, RED, GREEN, BLUE))
  }

  /**
    * Specifies the color of the shadow cast by the captions.
    * All burn-in and DVB-Sub font settings must match.
    */
  @js.native
  sealed trait BurninSubtitleShadowColor extends js.Any
  object BurninSubtitleShadowColor {
    val NONE = "NONE".asInstanceOf[BurninSubtitleShadowColor]
    val BLACK = "BLACK".asInstanceOf[BurninSubtitleShadowColor]
    val WHITE = "WHITE".asInstanceOf[BurninSubtitleShadowColor]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NONE, BLACK, WHITE))
  }

  /**
    * Only applies to jobs with input captions in Teletext or STL formats. Specify whether the spacing between letters in your captions is set by the captions grid or varies depending on letter width. Choose fixed grid to conform to the spacing specified in the captions file more accurately. Choose proportional to make the text easier to read if the captions are closed caption.
    */
  @js.native
  sealed trait BurninSubtitleTeletextSpacing extends js.Any
  object BurninSubtitleTeletextSpacing {
    val FIXED_GRID = "FIXED_GRID".asInstanceOf[BurninSubtitleTeletextSpacing]
    val PROPORTIONAL = "PROPORTIONAL".asInstanceOf[BurninSubtitleTeletextSpacing]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(FIXED_GRID, PROPORTIONAL))
  }

  @js.native
  trait CancelJobRequest extends js.Object {
    var Id: __string
  }

  object CancelJobRequest {
    @inline
    def apply(
        Id: __string
    ): CancelJobRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelJobRequest]
    }
  }

  @js.native
  trait CancelJobResponse extends js.Object {}

  object CancelJobResponse {
    @inline
    def apply(
    ): CancelJobResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CancelJobResponse]
    }
  }

  /**
    * Description of Caption output
    */
  @js.native
  trait CaptionDescription extends js.Object {
    var CaptionSelectorName: js.UndefOr[__stringMin1]
    var CustomLanguageCode: js.UndefOr[__stringPatternAZaZ23AZaZ]
    var DestinationSettings: js.UndefOr[CaptionDestinationSettings]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LanguageDescription: js.UndefOr[__string]
  }

  object CaptionDescription {
    @inline
    def apply(
        CaptionSelectorName: js.UndefOr[__stringMin1] = js.undefined,
        CustomLanguageCode: js.UndefOr[__stringPatternAZaZ23AZaZ] = js.undefined,
        DestinationSettings: js.UndefOr[CaptionDestinationSettings] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LanguageDescription: js.UndefOr[__string] = js.undefined
    ): CaptionDescription = {
      val __obj = js.Dynamic.literal()
      CaptionSelectorName.foreach(__v => __obj.updateDynamic("CaptionSelectorName")(__v.asInstanceOf[js.Any]))
      CustomLanguageCode.foreach(__v => __obj.updateDynamic("CustomLanguageCode")(__v.asInstanceOf[js.Any]))
      DestinationSettings.foreach(__v => __obj.updateDynamic("DestinationSettings")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LanguageDescription.foreach(__v => __obj.updateDynamic("LanguageDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptionDescription]
    }
  }

  /**
    * Caption Description for preset
    */
  @js.native
  trait CaptionDescriptionPreset extends js.Object {
    var CustomLanguageCode: js.UndefOr[__stringPatternAZaZ23AZaZ]
    var DestinationSettings: js.UndefOr[CaptionDestinationSettings]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LanguageDescription: js.UndefOr[__string]
  }

  object CaptionDescriptionPreset {
    @inline
    def apply(
        CustomLanguageCode: js.UndefOr[__stringPatternAZaZ23AZaZ] = js.undefined,
        DestinationSettings: js.UndefOr[CaptionDestinationSettings] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LanguageDescription: js.UndefOr[__string] = js.undefined
    ): CaptionDescriptionPreset = {
      val __obj = js.Dynamic.literal()
      CustomLanguageCode.foreach(__v => __obj.updateDynamic("CustomLanguageCode")(__v.asInstanceOf[js.Any]))
      DestinationSettings.foreach(__v => __obj.updateDynamic("DestinationSettings")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LanguageDescription.foreach(__v => __obj.updateDynamic("LanguageDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptionDescriptionPreset]
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
    var EmbeddedDestinationSettings: js.UndefOr[EmbeddedDestinationSettings]
    var ImscDestinationSettings: js.UndefOr[ImscDestinationSettings]
    var SccDestinationSettings: js.UndefOr[SccDestinationSettings]
    var TeletextDestinationSettings: js.UndefOr[TeletextDestinationSettings]
    var TtmlDestinationSettings: js.UndefOr[TtmlDestinationSettings]
  }

  object CaptionDestinationSettings {
    @inline
    def apply(
        BurninDestinationSettings: js.UndefOr[BurninDestinationSettings] = js.undefined,
        DestinationType: js.UndefOr[CaptionDestinationType] = js.undefined,
        DvbSubDestinationSettings: js.UndefOr[DvbSubDestinationSettings] = js.undefined,
        EmbeddedDestinationSettings: js.UndefOr[EmbeddedDestinationSettings] = js.undefined,
        ImscDestinationSettings: js.UndefOr[ImscDestinationSettings] = js.undefined,
        SccDestinationSettings: js.UndefOr[SccDestinationSettings] = js.undefined,
        TeletextDestinationSettings: js.UndefOr[TeletextDestinationSettings] = js.undefined,
        TtmlDestinationSettings: js.UndefOr[TtmlDestinationSettings] = js.undefined
    ): CaptionDestinationSettings = {
      val __obj = js.Dynamic.literal()
      BurninDestinationSettings.foreach(__v => __obj.updateDynamic("BurninDestinationSettings")(__v.asInstanceOf[js.Any]))
      DestinationType.foreach(__v => __obj.updateDynamic("DestinationType")(__v.asInstanceOf[js.Any]))
      DvbSubDestinationSettings.foreach(__v => __obj.updateDynamic("DvbSubDestinationSettings")(__v.asInstanceOf[js.Any]))
      EmbeddedDestinationSettings.foreach(__v => __obj.updateDynamic("EmbeddedDestinationSettings")(__v.asInstanceOf[js.Any]))
      ImscDestinationSettings.foreach(__v => __obj.updateDynamic("ImscDestinationSettings")(__v.asInstanceOf[js.Any]))
      SccDestinationSettings.foreach(__v => __obj.updateDynamic("SccDestinationSettings")(__v.asInstanceOf[js.Any]))
      TeletextDestinationSettings.foreach(__v => __obj.updateDynamic("TeletextDestinationSettings")(__v.asInstanceOf[js.Any]))
      TtmlDestinationSettings.foreach(__v => __obj.updateDynamic("TtmlDestinationSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptionDestinationSettings]
    }
  }

  /**
    * Specify the format for this set of captions on this output. The default format is embedded without SCTE-20. Other options are embedded with SCTE-20, burn-in, DVB-sub, IMSC, SCC, SRT, teletext, TTML, and web-VTT. If you are using SCTE-20, choose SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED) to create an output that complies with the SCTE-43 spec. To create a non-compliant output where the embedded captions come first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(BURN_IN, DVB_SUB, EMBEDDED, EMBEDDED_PLUS_SCTE20, IMSC, SCTE20_PLUS_EMBEDDED, SCC, SRT, SMI, TELETEXT, TTML, WEBVTT))
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
    @inline
    def apply(
        CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        SourceSettings: js.UndefOr[CaptionSourceSettings] = js.undefined
    ): CaptionSelector = {
      val __obj = js.Dynamic.literal()
      CustomLanguageCode.foreach(__v => __obj.updateDynamic("CustomLanguageCode")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      SourceSettings.foreach(__v => __obj.updateDynamic("SourceSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptionSelector]
    }
  }

  /**
    * Ignore this setting unless your input captions format is SCC. To have the service compensate for differing frame rates between your input captions and input video, specify the frame rate of the captions file. Specify this value as a fraction, using the settings Framerate numerator (framerateNumerator) and Framerate denominator (framerateDenominator). For example, you might specify 24 / 1 for 24 fps, 25 / 1 for 25 fps, 24000 / 1001 for 23.976 fps, or 30000 / 1001 for 29.97 fps.
    */
  @js.native
  trait CaptionSourceFramerate extends js.Object {
    var FramerateDenominator: js.UndefOr[__integerMin1Max1001]
    var FramerateNumerator: js.UndefOr[__integerMin1Max60000]
  }

  object CaptionSourceFramerate {
    @inline
    def apply(
        FramerateDenominator: js.UndefOr[__integerMin1Max1001] = js.undefined,
        FramerateNumerator: js.UndefOr[__integerMin1Max60000] = js.undefined
    ): CaptionSourceFramerate = {
      val __obj = js.Dynamic.literal()
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptionSourceFramerate]
    }
  }

  /**
    * If your input captions are SCC, TTML, STL, SMI, SRT, or IMSC in an xml file, specify the URI of the input captions source file. If your input captions are IMSC in an IMF package, use TrackSourceSettings instead of FileSoureSettings.
    */
  @js.native
  trait CaptionSourceSettings extends js.Object {
    var AncillarySourceSettings: js.UndefOr[AncillarySourceSettings]
    var DvbSubSourceSettings: js.UndefOr[DvbSubSourceSettings]
    var EmbeddedSourceSettings: js.UndefOr[EmbeddedSourceSettings]
    var FileSourceSettings: js.UndefOr[FileSourceSettings]
    var SourceType: js.UndefOr[CaptionSourceType]
    var TeletextSourceSettings: js.UndefOr[TeletextSourceSettings]
    var TrackSourceSettings: js.UndefOr[TrackSourceSettings]
  }

  object CaptionSourceSettings {
    @inline
    def apply(
        AncillarySourceSettings: js.UndefOr[AncillarySourceSettings] = js.undefined,
        DvbSubSourceSettings: js.UndefOr[DvbSubSourceSettings] = js.undefined,
        EmbeddedSourceSettings: js.UndefOr[EmbeddedSourceSettings] = js.undefined,
        FileSourceSettings: js.UndefOr[FileSourceSettings] = js.undefined,
        SourceType: js.UndefOr[CaptionSourceType] = js.undefined,
        TeletextSourceSettings: js.UndefOr[TeletextSourceSettings] = js.undefined,
        TrackSourceSettings: js.UndefOr[TrackSourceSettings] = js.undefined
    ): CaptionSourceSettings = {
      val __obj = js.Dynamic.literal()
      AncillarySourceSettings.foreach(__v => __obj.updateDynamic("AncillarySourceSettings")(__v.asInstanceOf[js.Any]))
      DvbSubSourceSettings.foreach(__v => __obj.updateDynamic("DvbSubSourceSettings")(__v.asInstanceOf[js.Any]))
      EmbeddedSourceSettings.foreach(__v => __obj.updateDynamic("EmbeddedSourceSettings")(__v.asInstanceOf[js.Any]))
      FileSourceSettings.foreach(__v => __obj.updateDynamic("FileSourceSettings")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      TeletextSourceSettings.foreach(__v => __obj.updateDynamic("TeletextSourceSettings")(__v.asInstanceOf[js.Any]))
      TrackSourceSettings.foreach(__v => __obj.updateDynamic("TrackSourceSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptionSourceSettings]
    }
  }

  /**
    * Use Source (SourceType) to identify the format of your input captions.  The service cannot auto-detect caption format.
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
    val TELETEXT = "TELETEXT".asInstanceOf[CaptionSourceType]
    val NULL_SOURCE = "NULL_SOURCE".asInstanceOf[CaptionSourceType]
    val IMSC = "IMSC".asInstanceOf[CaptionSourceType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ANCILLARY, DVB_SUB, EMBEDDED, SCTE20, SCC, TTML, STL, SRT, SMI, TELETEXT, NULL_SOURCE, IMSC))
  }

  /**
    * Channel mapping (ChannelMapping) contains the group of fields that hold the remixing value for each channel. Units are in dB. Acceptable values are within the range from -60 (mute) through 6. A setting of 0 passes the input channel unchanged to the output channel (no attenuation or amplification).
    */
  @js.native
  trait ChannelMapping extends js.Object {
    var OutputChannels: js.UndefOr[__listOfOutputChannelMapping]
  }

  object ChannelMapping {
    @inline
    def apply(
        OutputChannels: js.UndefOr[__listOfOutputChannelMapping] = js.undefined
    ): ChannelMapping = {
      val __obj = js.Dynamic.literal()
      OutputChannels.foreach(__v => __obj.updateDynamic("OutputChannels")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelMapping]
    }
  }

  /**
    * Specify the details for each pair of HLS and DASH additional manifests that you want the service to generate for this CMAF output group. Each pair of manifests can reference a different subset of outputs in the group.
    */
  @js.native
  trait CmafAdditionalManifest extends js.Object {
    var ManifestNameModifier: js.UndefOr[__stringMin1]
    var SelectedOutputs: js.UndefOr[__listOf__stringMin1]
  }

  object CmafAdditionalManifest {
    @inline
    def apply(
        ManifestNameModifier: js.UndefOr[__stringMin1] = js.undefined,
        SelectedOutputs: js.UndefOr[__listOf__stringMin1] = js.undefined
    ): CmafAdditionalManifest = {
      val __obj = js.Dynamic.literal()
      ManifestNameModifier.foreach(__v => __obj.updateDynamic("ManifestNameModifier")(__v.asInstanceOf[js.Any]))
      SelectedOutputs.foreach(__v => __obj.updateDynamic("SelectedOutputs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CmafAdditionalManifest]
    }
  }

  /**
    * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for later replay.
    */
  @js.native
  sealed trait CmafClientCache extends js.Any
  object CmafClientCache {
    val DISABLED = "DISABLED".asInstanceOf[CmafClientCache]
    val ENABLED = "ENABLED".asInstanceOf[CmafClientCache]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
    */
  @js.native
  sealed trait CmafCodecSpecification extends js.Any
  object CmafCodecSpecification {
    val RFC_6381 = "RFC_6381".asInstanceOf[CmafCodecSpecification]
    val RFC_4281 = "RFC_4281".asInstanceOf[CmafCodecSpecification]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(RFC_6381, RFC_4281))
  }

  /**
    * Settings for CMAF encryption
    */
  @js.native
  trait CmafEncryptionSettings extends js.Object {
    var ConstantInitializationVector: js.UndefOr[__stringMin32Max32Pattern09aFAF32]
    var EncryptionMethod: js.UndefOr[CmafEncryptionType]
    var InitializationVectorInManifest: js.UndefOr[CmafInitializationVectorInManifest]
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProviderCmaf]
    var StaticKeyProvider: js.UndefOr[StaticKeyProvider]
    var Type: js.UndefOr[CmafKeyProviderType]
  }

  object CmafEncryptionSettings {
    @inline
    def apply(
        ConstantInitializationVector: js.UndefOr[__stringMin32Max32Pattern09aFAF32] = js.undefined,
        EncryptionMethod: js.UndefOr[CmafEncryptionType] = js.undefined,
        InitializationVectorInManifest: js.UndefOr[CmafInitializationVectorInManifest] = js.undefined,
        SpekeKeyProvider: js.UndefOr[SpekeKeyProviderCmaf] = js.undefined,
        StaticKeyProvider: js.UndefOr[StaticKeyProvider] = js.undefined,
        Type: js.UndefOr[CmafKeyProviderType] = js.undefined
    ): CmafEncryptionSettings = {
      val __obj = js.Dynamic.literal()
      ConstantInitializationVector.foreach(__v => __obj.updateDynamic("ConstantInitializationVector")(__v.asInstanceOf[js.Any]))
      EncryptionMethod.foreach(__v => __obj.updateDynamic("EncryptionMethod")(__v.asInstanceOf[js.Any]))
      InitializationVectorInManifest.foreach(__v => __obj.updateDynamic("InitializationVectorInManifest")(__v.asInstanceOf[js.Any]))
      SpekeKeyProvider.foreach(__v => __obj.updateDynamic("SpekeKeyProvider")(__v.asInstanceOf[js.Any]))
      StaticKeyProvider.foreach(__v => __obj.updateDynamic("StaticKeyProvider")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CmafEncryptionSettings]
    }
  }

  /**
    * Specify the encryption scheme that you want the service to use when encrypting your CMAF segments. Choose AES-CBC subsample (SAMPLE-AES) or AES_CTR (AES-CTR).
    */
  @js.native
  sealed trait CmafEncryptionType extends js.Any
  object CmafEncryptionType {
    val SAMPLE_AES = "SAMPLE_AES".asInstanceOf[CmafEncryptionType]
    val AES_CTR = "AES_CTR".asInstanceOf[CmafEncryptionType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(SAMPLE_AES, AES_CTR))
  }

  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to CMAF_GROUP_SETTINGS. Each output in a CMAF Output Group may only contain a single video, audio, or caption output.
    */
  @js.native
  trait CmafGroupSettings extends js.Object {
    var AdditionalManifests: js.UndefOr[__listOfCmafAdditionalManifest]
    var BaseUrl: js.UndefOr[__string]
    var ClientCache: js.UndefOr[CmafClientCache]
    var CodecSpecification: js.UndefOr[CmafCodecSpecification]
    var Destination: js.UndefOr[__stringPatternS3]
    var DestinationSettings: js.UndefOr[DestinationSettings]
    var Encryption: js.UndefOr[CmafEncryptionSettings]
    var FragmentLength: js.UndefOr[__integerMin1Max2147483647]
    var ManifestCompression: js.UndefOr[CmafManifestCompression]
    var ManifestDurationFormat: js.UndefOr[CmafManifestDurationFormat]
    var MinBufferTime: js.UndefOr[__integerMin0Max2147483647]
    var MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647]
    var MpdProfile: js.UndefOr[CmafMpdProfile]
    var SegmentControl: js.UndefOr[CmafSegmentControl]
    var SegmentLength: js.UndefOr[__integerMin1Max2147483647]
    var StreamInfResolution: js.UndefOr[CmafStreamInfResolution]
    var WriteDashManifest: js.UndefOr[CmafWriteDASHManifest]
    var WriteHlsManifest: js.UndefOr[CmafWriteHLSManifest]
    var WriteSegmentTimelineInRepresentation: js.UndefOr[CmafWriteSegmentTimelineInRepresentation]
  }

  object CmafGroupSettings {
    @inline
    def apply(
        AdditionalManifests: js.UndefOr[__listOfCmafAdditionalManifest] = js.undefined,
        BaseUrl: js.UndefOr[__string] = js.undefined,
        ClientCache: js.UndefOr[CmafClientCache] = js.undefined,
        CodecSpecification: js.UndefOr[CmafCodecSpecification] = js.undefined,
        Destination: js.UndefOr[__stringPatternS3] = js.undefined,
        DestinationSettings: js.UndefOr[DestinationSettings] = js.undefined,
        Encryption: js.UndefOr[CmafEncryptionSettings] = js.undefined,
        FragmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        ManifestCompression: js.UndefOr[CmafManifestCompression] = js.undefined,
        ManifestDurationFormat: js.UndefOr[CmafManifestDurationFormat] = js.undefined,
        MinBufferTime: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647] = js.undefined,
        MpdProfile: js.UndefOr[CmafMpdProfile] = js.undefined,
        SegmentControl: js.UndefOr[CmafSegmentControl] = js.undefined,
        SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        StreamInfResolution: js.UndefOr[CmafStreamInfResolution] = js.undefined,
        WriteDashManifest: js.UndefOr[CmafWriteDASHManifest] = js.undefined,
        WriteHlsManifest: js.UndefOr[CmafWriteHLSManifest] = js.undefined,
        WriteSegmentTimelineInRepresentation: js.UndefOr[CmafWriteSegmentTimelineInRepresentation] = js.undefined
    ): CmafGroupSettings = {
      val __obj = js.Dynamic.literal()
      AdditionalManifests.foreach(__v => __obj.updateDynamic("AdditionalManifests")(__v.asInstanceOf[js.Any]))
      BaseUrl.foreach(__v => __obj.updateDynamic("BaseUrl")(__v.asInstanceOf[js.Any]))
      ClientCache.foreach(__v => __obj.updateDynamic("ClientCache")(__v.asInstanceOf[js.Any]))
      CodecSpecification.foreach(__v => __obj.updateDynamic("CodecSpecification")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      DestinationSettings.foreach(__v => __obj.updateDynamic("DestinationSettings")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      FragmentLength.foreach(__v => __obj.updateDynamic("FragmentLength")(__v.asInstanceOf[js.Any]))
      ManifestCompression.foreach(__v => __obj.updateDynamic("ManifestCompression")(__v.asInstanceOf[js.Any]))
      ManifestDurationFormat.foreach(__v => __obj.updateDynamic("ManifestDurationFormat")(__v.asInstanceOf[js.Any]))
      MinBufferTime.foreach(__v => __obj.updateDynamic("MinBufferTime")(__v.asInstanceOf[js.Any]))
      MinFinalSegmentLength.foreach(__v => __obj.updateDynamic("MinFinalSegmentLength")(__v.asInstanceOf[js.Any]))
      MpdProfile.foreach(__v => __obj.updateDynamic("MpdProfile")(__v.asInstanceOf[js.Any]))
      SegmentControl.foreach(__v => __obj.updateDynamic("SegmentControl")(__v.asInstanceOf[js.Any]))
      SegmentLength.foreach(__v => __obj.updateDynamic("SegmentLength")(__v.asInstanceOf[js.Any]))
      StreamInfResolution.foreach(__v => __obj.updateDynamic("StreamInfResolution")(__v.asInstanceOf[js.Any]))
      WriteDashManifest.foreach(__v => __obj.updateDynamic("WriteDashManifest")(__v.asInstanceOf[js.Any]))
      WriteHlsManifest.foreach(__v => __obj.updateDynamic("WriteHlsManifest")(__v.asInstanceOf[js.Any]))
      WriteSegmentTimelineInRepresentation.foreach(__v => __obj.updateDynamic("WriteSegmentTimelineInRepresentation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CmafGroupSettings]
    }
  }

  /**
    * When you use DRM with CMAF outputs, choose whether the service writes the 128-bit encryption initialization vector in the HLS and DASH manifests.
    */
  @js.native
  sealed trait CmafInitializationVectorInManifest extends js.Any
  object CmafInitializationVectorInManifest {
    val INCLUDE = "INCLUDE".asInstanceOf[CmafInitializationVectorInManifest]
    val EXCLUDE = "EXCLUDE".asInstanceOf[CmafInitializationVectorInManifest]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
    */
  @js.native
  sealed trait CmafKeyProviderType extends js.Any
  object CmafKeyProviderType {
    val SPEKE = "SPEKE".asInstanceOf[CmafKeyProviderType]
    val STATIC_KEY = "STATIC_KEY".asInstanceOf[CmafKeyProviderType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(SPEKE, STATIC_KEY))
  }

  /**
    * When set to GZIP, compresses HLS playlist.
    */
  @js.native
  sealed trait CmafManifestCompression extends js.Any
  object CmafManifestCompression {
    val GZIP = "GZIP".asInstanceOf[CmafManifestCompression]
    val NONE = "NONE".asInstanceOf[CmafManifestCompression]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(GZIP, NONE))
  }

  /**
    * Indicates whether the output manifest should use floating point values for segment duration.
    */
  @js.native
  sealed trait CmafManifestDurationFormat extends js.Any
  object CmafManifestDurationFormat {
    val FLOATING_POINT = "FLOATING_POINT".asInstanceOf[CmafManifestDurationFormat]
    val INTEGER = "INTEGER".asInstanceOf[CmafManifestDurationFormat]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(FLOATING_POINT, INTEGER))
  }

  /**
    * Specify whether your DASH profile is on-demand or main. When you choose Main profile (MAIN_PROFILE), the service signals  urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE), the service signals urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose On-demand, you must also set the output group setting Segment control (SegmentControl) to Single file (SINGLE_FILE).
    */
  @js.native
  sealed trait CmafMpdProfile extends js.Any
  object CmafMpdProfile {
    val MAIN_PROFILE = "MAIN_PROFILE".asInstanceOf[CmafMpdProfile]
    val ON_DEMAND_PROFILE = "ON_DEMAND_PROFILE".asInstanceOf[CmafMpdProfile]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(MAIN_PROFILE, ON_DEMAND_PROFILE))
  }

  /**
    * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
    */
  @js.native
  sealed trait CmafSegmentControl extends js.Any
  object CmafSegmentControl {
    val SINGLE_FILE = "SINGLE_FILE".asInstanceOf[CmafSegmentControl]
    val SEGMENTED_FILES = "SEGMENTED_FILES".asInstanceOf[CmafSegmentControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(SINGLE_FILE, SEGMENTED_FILES))
  }

  /**
    * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
    */
  @js.native
  sealed trait CmafStreamInfResolution extends js.Any
  object CmafStreamInfResolution {
    val INCLUDE = "INCLUDE".asInstanceOf[CmafStreamInfResolution]
    val EXCLUDE = "EXCLUDE".asInstanceOf[CmafStreamInfResolution]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * When set to ENABLED, a DASH MPD manifest will be generated for this output.
    */
  @js.native
  sealed trait CmafWriteDASHManifest extends js.Any
  object CmafWriteDASHManifest {
    val DISABLED = "DISABLED".asInstanceOf[CmafWriteDASHManifest]
    val ENABLED = "ENABLED".asInstanceOf[CmafWriteDASHManifest]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * When set to ENABLED, an Apple HLS manifest will be generated for this output.
    */
  @js.native
  sealed trait CmafWriteHLSManifest extends js.Any
  object CmafWriteHLSManifest {
    val DISABLED = "DISABLED".asInstanceOf[CmafWriteHLSManifest]
    val ENABLED = "ENABLED".asInstanceOf[CmafWriteHLSManifest]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * When you enable Precise segment duration in DASH manifests (writeSegmentTimelineInRepresentation), your DASH manifest shows precise segment durations. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your DASH manifest are approximate. The segment duration information appears in the duration attribute of the SegmentTemplate element.
    */
  @js.native
  sealed trait CmafWriteSegmentTimelineInRepresentation extends js.Any
  object CmafWriteSegmentTimelineInRepresentation {
    val ENABLED = "ENABLED".asInstanceOf[CmafWriteSegmentTimelineInRepresentation]
    val DISABLED = "DISABLED".asInstanceOf[CmafWriteSegmentTimelineInRepresentation]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
    */
  @js.native
  sealed trait CmfcScte35Esam extends js.Any
  object CmfcScte35Esam {
    val INSERT = "INSERT".asInstanceOf[CmfcScte35Esam]
    val NONE = "NONE".asInstanceOf[CmfcScte35Esam]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INSERT, NONE))
  }

  /**
    * Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want those SCTE-35 markers in this output.
    */
  @js.native
  sealed trait CmfcScte35Source extends js.Any
  object CmfcScte35Source {
    val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[CmfcScte35Source]
    val NONE = "NONE".asInstanceOf[CmfcScte35Source]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PASSTHROUGH, NONE))
  }

  /**
    * Settings for MP4 segments in CMAF
    */
  @js.native
  trait CmfcSettings extends js.Object {
    var Scte35Esam: js.UndefOr[CmfcScte35Esam]
    var Scte35Source: js.UndefOr[CmfcScte35Source]
  }

  object CmfcSettings {
    @inline
    def apply(
        Scte35Esam: js.UndefOr[CmfcScte35Esam] = js.undefined,
        Scte35Source: js.UndefOr[CmfcScte35Source] = js.undefined
    ): CmfcSettings = {
      val __obj = js.Dynamic.literal()
      Scte35Esam.foreach(__v => __obj.updateDynamic("Scte35Esam")(__v.asInstanceOf[js.Any]))
      Scte35Source.foreach(__v => __obj.updateDynamic("Scte35Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CmfcSettings]
    }
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
    @inline
    def apply(
        Brightness: js.UndefOr[__integerMin1Max100] = js.undefined,
        ColorSpaceConversion: js.UndefOr[ColorSpaceConversion] = js.undefined,
        Contrast: js.UndefOr[__integerMin1Max100] = js.undefined,
        Hdr10Metadata: js.UndefOr[Hdr10Metadata] = js.undefined,
        Hue: js.UndefOr[__integerMinNegative180Max180] = js.undefined,
        Saturation: js.UndefOr[__integerMin1Max100] = js.undefined
    ): ColorCorrector = {
      val __obj = js.Dynamic.literal()
      Brightness.foreach(__v => __obj.updateDynamic("Brightness")(__v.asInstanceOf[js.Any]))
      ColorSpaceConversion.foreach(__v => __obj.updateDynamic("ColorSpaceConversion")(__v.asInstanceOf[js.Any]))
      Contrast.foreach(__v => __obj.updateDynamic("Contrast")(__v.asInstanceOf[js.Any]))
      Hdr10Metadata.foreach(__v => __obj.updateDynamic("Hdr10Metadata")(__v.asInstanceOf[js.Any]))
      Hue.foreach(__v => __obj.updateDynamic("Hue")(__v.asInstanceOf[js.Any]))
      Saturation.foreach(__v => __obj.updateDynamic("Saturation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColorCorrector]
    }
  }

  /**
    * Choose Insert (INSERT) for this setting to include color metadata in this output. Choose Ignore (IGNORE) to exclude color metadata from this output. If you don't specify a value, the service sets this to Insert by default.
    */
  @js.native
  sealed trait ColorMetadata extends js.Any
  object ColorMetadata {
    val IGNORE = "IGNORE".asInstanceOf[ColorMetadata]
    val INSERT = "INSERT".asInstanceOf[ColorMetadata]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(IGNORE, INSERT))
  }

  /**
    * If your input video has accurate color space metadata, or if you don't know about color space, leave this set to the default value Follow (FOLLOW). The service will automatically detect your input color space. If your input video has metadata indicating the wrong color space, specify the accurate color space here. If your input video is HDR 10 and the SMPTE ST 2086 Mastering Display Color Volume static metadata isn't present in your video stream, or if that metadata is present but not accurate, choose Force HDR 10 (FORCE_HDR10) here and specify correct values in the input HDR 10 metadata (Hdr10Metadata) settings. For more information about MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
    */
  @js.native
  sealed trait ColorSpace extends js.Any
  object ColorSpace {
    val FOLLOW = "FOLLOW".asInstanceOf[ColorSpace]
    val REC_601 = "REC_601".asInstanceOf[ColorSpace]
    val REC_709 = "REC_709".asInstanceOf[ColorSpace]
    val HDR10 = "HDR10".asInstanceOf[ColorSpace]
    val HLG_2020 = "HLG_2020".asInstanceOf[ColorSpace]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(FOLLOW, REC_601, REC_709, HDR10, HLG_2020))
  }

  /**
    * Specify the color space you want for this output. The service supports conversion between HDR formats, between SDR formats, from SDR to HDR, and from HDR to SDR. SDR to HDR conversion doesn't upgrade the dynamic range. The converted video has an HDR format, but visually appears the same as an unconverted output. HDR to SDR conversion uses Elemental tone mapping technology to approximate the outcome of manually regrading from HDR to SDR.
    */
  @js.native
  sealed trait ColorSpaceConversion extends js.Any
  object ColorSpaceConversion {
    val NONE = "NONE".asInstanceOf[ColorSpaceConversion]
    val FORCE_601 = "FORCE_601".asInstanceOf[ColorSpaceConversion]
    val FORCE_709 = "FORCE_709".asInstanceOf[ColorSpaceConversion]
    val FORCE_HDR10 = "FORCE_HDR10".asInstanceOf[ColorSpaceConversion]
    val FORCE_HLG_2020 = "FORCE_HLG_2020".asInstanceOf[ColorSpaceConversion]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NONE, FORCE_601, FORCE_709, FORCE_HDR10, FORCE_HLG_2020))
  }

  /**
    * There are two sources for color metadata, the input file and the job input settings Color space (ColorSpace) and HDR master display information settings(Hdr10Metadata). The Color space usage setting determines which takes precedence. Choose Force (FORCE) to use color metadata from the input job settings. If you don't specify values for those settings, the service defaults to using metadata from your input. FALLBACK - Choose Fallback (FALLBACK) to use color metadata from the source when it is present. If there's no color metadata in your input file, the service defaults to using values you specify in the input settings.
    */
  @js.native
  sealed trait ColorSpaceUsage extends js.Any
  object ColorSpaceUsage {
    val FORCE = "FORCE".asInstanceOf[ColorSpaceUsage]
    val FALLBACK = "FALLBACK".asInstanceOf[ColorSpaceUsage]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(FORCE, FALLBACK))
  }

  /**
    * The length of the term of your reserved queue pricing plan commitment.
    */
  @js.native
  sealed trait Commitment extends js.Any
  object Commitment {
    val ONE_YEAR = "ONE_YEAR".asInstanceOf[Commitment]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ONE_YEAR))
  }

  /**
    * Container specific settings.
    */
  @js.native
  trait ContainerSettings extends js.Object {
    var CmfcSettings: js.UndefOr[CmfcSettings]
    var Container: js.UndefOr[ContainerType]
    var F4vSettings: js.UndefOr[F4vSettings]
    var M2tsSettings: js.UndefOr[M2tsSettings]
    var M3u8Settings: js.UndefOr[M3u8Settings]
    var MovSettings: js.UndefOr[MovSettings]
    var Mp4Settings: js.UndefOr[Mp4Settings]
    var MpdSettings: js.UndefOr[MpdSettings]
    var MxfSettings: js.UndefOr[MxfSettings]
  }

  object ContainerSettings {
    @inline
    def apply(
        CmfcSettings: js.UndefOr[CmfcSettings] = js.undefined,
        Container: js.UndefOr[ContainerType] = js.undefined,
        F4vSettings: js.UndefOr[F4vSettings] = js.undefined,
        M2tsSettings: js.UndefOr[M2tsSettings] = js.undefined,
        M3u8Settings: js.UndefOr[M3u8Settings] = js.undefined,
        MovSettings: js.UndefOr[MovSettings] = js.undefined,
        Mp4Settings: js.UndefOr[Mp4Settings] = js.undefined,
        MpdSettings: js.UndefOr[MpdSettings] = js.undefined,
        MxfSettings: js.UndefOr[MxfSettings] = js.undefined
    ): ContainerSettings = {
      val __obj = js.Dynamic.literal()
      CmfcSettings.foreach(__v => __obj.updateDynamic("CmfcSettings")(__v.asInstanceOf[js.Any]))
      Container.foreach(__v => __obj.updateDynamic("Container")(__v.asInstanceOf[js.Any]))
      F4vSettings.foreach(__v => __obj.updateDynamic("F4vSettings")(__v.asInstanceOf[js.Any]))
      M2tsSettings.foreach(__v => __obj.updateDynamic("M2tsSettings")(__v.asInstanceOf[js.Any]))
      M3u8Settings.foreach(__v => __obj.updateDynamic("M3u8Settings")(__v.asInstanceOf[js.Any]))
      MovSettings.foreach(__v => __obj.updateDynamic("MovSettings")(__v.asInstanceOf[js.Any]))
      Mp4Settings.foreach(__v => __obj.updateDynamic("Mp4Settings")(__v.asInstanceOf[js.Any]))
      MpdSettings.foreach(__v => __obj.updateDynamic("MpdSettings")(__v.asInstanceOf[js.Any]))
      MxfSettings.foreach(__v => __obj.updateDynamic("MxfSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerSettings]
    }
  }

  /**
    * Container for this output. Some containers require a container settings object. If not specified, the default object will be created.
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(F4V, ISMV, M2TS, M3U8, CMFC, MOV, MP4, MPD, MXF, WEBM, RAW))
  }

  @js.native
  trait CreateJobRequest extends js.Object {
    var Role: __string
    var Settings: JobSettings
    var AccelerationSettings: js.UndefOr[AccelerationSettings]
    var BillingTagsSource: js.UndefOr[BillingTagsSource]
    var ClientRequestToken: js.UndefOr[__string]
    var HopDestinations: js.UndefOr[__listOfHopDestination]
    var JobTemplate: js.UndefOr[__string]
    var Priority: js.UndefOr[__integerMinNegative50Max50]
    var Queue: js.UndefOr[__string]
    var SimulateReservedQueue: js.UndefOr[SimulateReservedQueue]
    var StatusUpdateInterval: js.UndefOr[StatusUpdateInterval]
    var Tags: js.UndefOr[__mapOf__string]
    var UserMetadata: js.UndefOr[__mapOf__string]
  }

  object CreateJobRequest {
    @inline
    def apply(
        Role: __string,
        Settings: JobSettings,
        AccelerationSettings: js.UndefOr[AccelerationSettings] = js.undefined,
        BillingTagsSource: js.UndefOr[BillingTagsSource] = js.undefined,
        ClientRequestToken: js.UndefOr[__string] = js.undefined,
        HopDestinations: js.UndefOr[__listOfHopDestination] = js.undefined,
        JobTemplate: js.UndefOr[__string] = js.undefined,
        Priority: js.UndefOr[__integerMinNegative50Max50] = js.undefined,
        Queue: js.UndefOr[__string] = js.undefined,
        SimulateReservedQueue: js.UndefOr[SimulateReservedQueue] = js.undefined,
        StatusUpdateInterval: js.UndefOr[StatusUpdateInterval] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        UserMetadata: js.UndefOr[__mapOf__string] = js.undefined
    ): CreateJobRequest = {
      val __obj = js.Dynamic.literal(
        "Role" -> Role.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any]
      )

      AccelerationSettings.foreach(__v => __obj.updateDynamic("AccelerationSettings")(__v.asInstanceOf[js.Any]))
      BillingTagsSource.foreach(__v => __obj.updateDynamic("BillingTagsSource")(__v.asInstanceOf[js.Any]))
      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      HopDestinations.foreach(__v => __obj.updateDynamic("HopDestinations")(__v.asInstanceOf[js.Any]))
      JobTemplate.foreach(__v => __obj.updateDynamic("JobTemplate")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      SimulateReservedQueue.foreach(__v => __obj.updateDynamic("SimulateReservedQueue")(__v.asInstanceOf[js.Any]))
      StatusUpdateInterval.foreach(__v => __obj.updateDynamic("StatusUpdateInterval")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UserMetadata.foreach(__v => __obj.updateDynamic("UserMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobRequest]
    }
  }

  @js.native
  trait CreateJobResponse extends js.Object {
    var Job: js.UndefOr[Job]
  }

  object CreateJobResponse {
    @inline
    def apply(
        Job: js.UndefOr[Job] = js.undefined
    ): CreateJobResponse = {
      val __obj = js.Dynamic.literal()
      Job.foreach(__v => __obj.updateDynamic("Job")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobResponse]
    }
  }

  @js.native
  trait CreateJobTemplateRequest extends js.Object {
    var Name: __string
    var Settings: JobTemplateSettings
    var AccelerationSettings: js.UndefOr[AccelerationSettings]
    var Category: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HopDestinations: js.UndefOr[__listOfHopDestination]
    var Priority: js.UndefOr[__integerMinNegative50Max50]
    var Queue: js.UndefOr[__string]
    var StatusUpdateInterval: js.UndefOr[StatusUpdateInterval]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreateJobTemplateRequest {
    @inline
    def apply(
        Name: __string,
        Settings: JobTemplateSettings,
        AccelerationSettings: js.UndefOr[AccelerationSettings] = js.undefined,
        Category: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HopDestinations: js.UndefOr[__listOfHopDestination] = js.undefined,
        Priority: js.UndefOr[__integerMinNegative50Max50] = js.undefined,
        Queue: js.UndefOr[__string] = js.undefined,
        StatusUpdateInterval: js.UndefOr[StatusUpdateInterval] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): CreateJobTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any]
      )

      AccelerationSettings.foreach(__v => __obj.updateDynamic("AccelerationSettings")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HopDestinations.foreach(__v => __obj.updateDynamic("HopDestinations")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      StatusUpdateInterval.foreach(__v => __obj.updateDynamic("StatusUpdateInterval")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobTemplateRequest]
    }
  }

  @js.native
  trait CreateJobTemplateResponse extends js.Object {
    var JobTemplate: js.UndefOr[JobTemplate]
  }

  object CreateJobTemplateResponse {
    @inline
    def apply(
        JobTemplate: js.UndefOr[JobTemplate] = js.undefined
    ): CreateJobTemplateResponse = {
      val __obj = js.Dynamic.literal()
      JobTemplate.foreach(__v => __obj.updateDynamic("JobTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobTemplateResponse]
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
    @inline
    def apply(
        Name: __string,
        Settings: PresetSettings,
        Category: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): CreatePresetRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any]
      )

      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePresetRequest]
    }
  }

  @js.native
  trait CreatePresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset]
  }

  object CreatePresetResponse {
    @inline
    def apply(
        Preset: js.UndefOr[Preset] = js.undefined
    ): CreatePresetResponse = {
      val __obj = js.Dynamic.literal()
      Preset.foreach(__v => __obj.updateDynamic("Preset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePresetResponse]
    }
  }

  @js.native
  trait CreateQueueRequest extends js.Object {
    var Name: __string
    var Description: js.UndefOr[__string]
    var PricingPlan: js.UndefOr[PricingPlan]
    var ReservationPlanSettings: js.UndefOr[ReservationPlanSettings]
    var Status: js.UndefOr[QueueStatus]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreateQueueRequest {
    @inline
    def apply(
        Name: __string,
        Description: js.UndefOr[__string] = js.undefined,
        PricingPlan: js.UndefOr[PricingPlan] = js.undefined,
        ReservationPlanSettings: js.UndefOr[ReservationPlanSettings] = js.undefined,
        Status: js.UndefOr[QueueStatus] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): CreateQueueRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PricingPlan.foreach(__v => __obj.updateDynamic("PricingPlan")(__v.asInstanceOf[js.Any]))
      ReservationPlanSettings.foreach(__v => __obj.updateDynamic("ReservationPlanSettings")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateQueueRequest]
    }
  }

  @js.native
  trait CreateQueueResponse extends js.Object {
    var Queue: js.UndefOr[Queue]
  }

  object CreateQueueResponse {
    @inline
    def apply(
        Queue: js.UndefOr[Queue] = js.undefined
    ): CreateQueueResponse = {
      val __obj = js.Dynamic.literal()
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateQueueResponse]
    }
  }

  /**
    * Specify the details for each additional DASH manifest that you want the service to generate for this output group. Each manifest can reference a different subset of outputs in the group.
    */
  @js.native
  trait DashAdditionalManifest extends js.Object {
    var ManifestNameModifier: js.UndefOr[__stringMin1]
    var SelectedOutputs: js.UndefOr[__listOf__stringMin1]
  }

  object DashAdditionalManifest {
    @inline
    def apply(
        ManifestNameModifier: js.UndefOr[__stringMin1] = js.undefined,
        SelectedOutputs: js.UndefOr[__listOf__stringMin1] = js.undefined
    ): DashAdditionalManifest = {
      val __obj = js.Dynamic.literal()
      ManifestNameModifier.foreach(__v => __obj.updateDynamic("ManifestNameModifier")(__v.asInstanceOf[js.Any]))
      SelectedOutputs.foreach(__v => __obj.updateDynamic("SelectedOutputs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashAdditionalManifest]
    }
  }

  /**
    * Specifies DRM settings for DASH outputs.
    */
  @js.native
  trait DashIsoEncryptionSettings extends js.Object {
    var PlaybackDeviceCompatibility: js.UndefOr[DashIsoPlaybackDeviceCompatibility]
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProvider]
  }

  object DashIsoEncryptionSettings {
    @inline
    def apply(
        PlaybackDeviceCompatibility: js.UndefOr[DashIsoPlaybackDeviceCompatibility] = js.undefined,
        SpekeKeyProvider: js.UndefOr[SpekeKeyProvider] = js.undefined
    ): DashIsoEncryptionSettings = {
      val __obj = js.Dynamic.literal()
      PlaybackDeviceCompatibility.foreach(__v => __obj.updateDynamic("PlaybackDeviceCompatibility")(__v.asInstanceOf[js.Any]))
      SpekeKeyProvider.foreach(__v => __obj.updateDynamic("SpekeKeyProvider")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashIsoEncryptionSettings]
    }
  }

  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to DASH_ISO_GROUP_SETTINGS.
    */
  @js.native
  trait DashIsoGroupSettings extends js.Object {
    var AdditionalManifests: js.UndefOr[__listOfDashAdditionalManifest]
    var BaseUrl: js.UndefOr[__string]
    var Destination: js.UndefOr[__stringPatternS3]
    var DestinationSettings: js.UndefOr[DestinationSettings]
    var Encryption: js.UndefOr[DashIsoEncryptionSettings]
    var FragmentLength: js.UndefOr[__integerMin1Max2147483647]
    var HbbtvCompliance: js.UndefOr[DashIsoHbbtvCompliance]
    var MinBufferTime: js.UndefOr[__integerMin0Max2147483647]
    var MpdProfile: js.UndefOr[DashIsoMpdProfile]
    var SegmentControl: js.UndefOr[DashIsoSegmentControl]
    var SegmentLength: js.UndefOr[__integerMin1Max2147483647]
    var WriteSegmentTimelineInRepresentation: js.UndefOr[DashIsoWriteSegmentTimelineInRepresentation]
  }

  object DashIsoGroupSettings {
    @inline
    def apply(
        AdditionalManifests: js.UndefOr[__listOfDashAdditionalManifest] = js.undefined,
        BaseUrl: js.UndefOr[__string] = js.undefined,
        Destination: js.UndefOr[__stringPatternS3] = js.undefined,
        DestinationSettings: js.UndefOr[DestinationSettings] = js.undefined,
        Encryption: js.UndefOr[DashIsoEncryptionSettings] = js.undefined,
        FragmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        HbbtvCompliance: js.UndefOr[DashIsoHbbtvCompliance] = js.undefined,
        MinBufferTime: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        MpdProfile: js.UndefOr[DashIsoMpdProfile] = js.undefined,
        SegmentControl: js.UndefOr[DashIsoSegmentControl] = js.undefined,
        SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        WriteSegmentTimelineInRepresentation: js.UndefOr[DashIsoWriteSegmentTimelineInRepresentation] = js.undefined
    ): DashIsoGroupSettings = {
      val __obj = js.Dynamic.literal()
      AdditionalManifests.foreach(__v => __obj.updateDynamic("AdditionalManifests")(__v.asInstanceOf[js.Any]))
      BaseUrl.foreach(__v => __obj.updateDynamic("BaseUrl")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      DestinationSettings.foreach(__v => __obj.updateDynamic("DestinationSettings")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      FragmentLength.foreach(__v => __obj.updateDynamic("FragmentLength")(__v.asInstanceOf[js.Any]))
      HbbtvCompliance.foreach(__v => __obj.updateDynamic("HbbtvCompliance")(__v.asInstanceOf[js.Any]))
      MinBufferTime.foreach(__v => __obj.updateDynamic("MinBufferTime")(__v.asInstanceOf[js.Any]))
      MpdProfile.foreach(__v => __obj.updateDynamic("MpdProfile")(__v.asInstanceOf[js.Any]))
      SegmentControl.foreach(__v => __obj.updateDynamic("SegmentControl")(__v.asInstanceOf[js.Any]))
      SegmentLength.foreach(__v => __obj.updateDynamic("SegmentLength")(__v.asInstanceOf[js.Any]))
      WriteSegmentTimelineInRepresentation.foreach(__v => __obj.updateDynamic("WriteSegmentTimelineInRepresentation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashIsoGroupSettings]
    }
  }

  /**
    * Supports HbbTV specification as indicated
    */
  @js.native
  sealed trait DashIsoHbbtvCompliance extends js.Any
  object DashIsoHbbtvCompliance {
    val HBBTV_1_5 = "HBBTV_1_5".asInstanceOf[DashIsoHbbtvCompliance]
    val NONE = "NONE".asInstanceOf[DashIsoHbbtvCompliance]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(HBBTV_1_5, NONE))
  }

  /**
    * Specify whether your DASH profile is on-demand or main. When you choose Main profile (MAIN_PROFILE), the service signals  urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE), the service signals urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose On-demand, you must also set the output group setting Segment control (SegmentControl) to Single file (SINGLE_FILE).
    */
  @js.native
  sealed trait DashIsoMpdProfile extends js.Any
  object DashIsoMpdProfile {
    val MAIN_PROFILE = "MAIN_PROFILE".asInstanceOf[DashIsoMpdProfile]
    val ON_DEMAND_PROFILE = "ON_DEMAND_PROFILE".asInstanceOf[DashIsoMpdProfile]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(MAIN_PROFILE, ON_DEMAND_PROFILE))
  }

  /**
    * This setting can improve the compatibility of your output with video players on obsolete devices. It applies only to DASH H.264 outputs with DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to correct problems with playback on older devices. Otherwise, keep the default setting CENC v1 (CENC_V1). If you choose Unencrypted SEI, for that output, the service will exclude the access unit delimiter and will leave the SEI NAL units unencrypted.
    */
  @js.native
  sealed trait DashIsoPlaybackDeviceCompatibility extends js.Any
  object DashIsoPlaybackDeviceCompatibility {
    val CENC_V1 = "CENC_V1".asInstanceOf[DashIsoPlaybackDeviceCompatibility]
    val UNENCRYPTED_SEI = "UNENCRYPTED_SEI".asInstanceOf[DashIsoPlaybackDeviceCompatibility]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(CENC_V1, UNENCRYPTED_SEI))
  }

  /**
    * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
    */
  @js.native
  sealed trait DashIsoSegmentControl extends js.Any
  object DashIsoSegmentControl {
    val SINGLE_FILE = "SINGLE_FILE".asInstanceOf[DashIsoSegmentControl]
    val SEGMENTED_FILES = "SEGMENTED_FILES".asInstanceOf[DashIsoSegmentControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(SINGLE_FILE, SEGMENTED_FILES))
  }

  /**
    * When you enable Precise segment duration in manifests (writeSegmentTimelineInRepresentation), your DASH manifest shows precise segment durations. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your DASH manifest are approximate. The segment duration information appears in the duration attribute of the SegmentTemplate element.
    */
  @js.native
  sealed trait DashIsoWriteSegmentTimelineInRepresentation extends js.Any
  object DashIsoWriteSegmentTimelineInRepresentation {
    val ENABLED = "ENABLED".asInstanceOf[DashIsoWriteSegmentTimelineInRepresentation]
    val DISABLED = "DISABLED".asInstanceOf[DashIsoWriteSegmentTimelineInRepresentation]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Specify the encryption mode that you used to encrypt your input files.
    */
  @js.native
  sealed trait DecryptionMode extends js.Any
  object DecryptionMode {
    val AES_CTR = "AES_CTR".asInstanceOf[DecryptionMode]
    val AES_CBC = "AES_CBC".asInstanceOf[DecryptionMode]
    val AES_GCM = "AES_GCM".asInstanceOf[DecryptionMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(AES_CTR, AES_CBC, AES_GCM))
  }

  /**
    * Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace (DEINTERLACE) or Adaptive (ADAPTIVE). Motion adaptive interpolate (INTERPOLATE) produces sharper pictures, while blend (BLEND) produces smoother motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source file includes a ticker, such as a scrolling headline at the bottom of the frame.
    */
  @js.native
  sealed trait DeinterlaceAlgorithm extends js.Any
  object DeinterlaceAlgorithm {
    val INTERPOLATE = "INTERPOLATE".asInstanceOf[DeinterlaceAlgorithm]
    val INTERPOLATE_TICKER = "INTERPOLATE_TICKER".asInstanceOf[DeinterlaceAlgorithm]
    val BLEND = "BLEND".asInstanceOf[DeinterlaceAlgorithm]
    val BLEND_TICKER = "BLEND_TICKER".asInstanceOf[DeinterlaceAlgorithm]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INTERPOLATE, INTERPOLATE_TICKER, BLEND, BLEND_TICKER))
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
    @inline
    def apply(
        Algorithm: js.UndefOr[DeinterlaceAlgorithm] = js.undefined,
        Control: js.UndefOr[DeinterlacerControl] = js.undefined,
        Mode: js.UndefOr[DeinterlacerMode] = js.undefined
    ): Deinterlacer = {
      val __obj = js.Dynamic.literal()
      Algorithm.foreach(__v => __obj.updateDynamic("Algorithm")(__v.asInstanceOf[js.Any]))
      Control.foreach(__v => __obj.updateDynamic("Control")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Deinterlacer]
    }
  }

  /**
    * - When set to NORMAL (default), the deinterlacer does not convert frames that are tagged  in metadata as progressive. It will only convert those that are tagged as some other type. - When set to FORCE_ALL_FRAMES, the deinterlacer converts every frame to progressive - even those that are already tagged as progressive. Turn Force mode on only if there is  a good chance that the metadata has tagged frames as progressive when they are not  progressive. Do not turn on otherwise; processing frames that are already progressive  into progressive will probably result in lower quality video.
    */
  @js.native
  sealed trait DeinterlacerControl extends js.Any
  object DeinterlacerControl {
    val FORCE_ALL_FRAMES = "FORCE_ALL_FRAMES".asInstanceOf[DeinterlacerControl]
    val NORMAL = "NORMAL".asInstanceOf[DeinterlacerControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(FORCE_ALL_FRAMES, NORMAL))
  }

  /**
    * Use Deinterlacer (DeinterlaceMode) to choose how the service will do deinterlacing. Default is Deinterlace. - Deinterlace converts interlaced to progressive. - Inverse telecine converts Hard Telecine 29.97i to progressive 23.976p. - Adaptive auto-detects and converts to progressive.
    */
  @js.native
  sealed trait DeinterlacerMode extends js.Any
  object DeinterlacerMode {
    val DEINTERLACE = "DEINTERLACE".asInstanceOf[DeinterlacerMode]
    val INVERSE_TELECINE = "INVERSE_TELECINE".asInstanceOf[DeinterlacerMode]
    val ADAPTIVE = "ADAPTIVE".asInstanceOf[DeinterlacerMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DEINTERLACE, INVERSE_TELECINE, ADAPTIVE))
  }

  @js.native
  trait DeleteJobTemplateRequest extends js.Object {
    var Name: __string
  }

  object DeleteJobTemplateRequest {
    @inline
    def apply(
        Name: __string
    ): DeleteJobTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteJobTemplateRequest]
    }
  }

  @js.native
  trait DeleteJobTemplateResponse extends js.Object {}

  object DeleteJobTemplateResponse {
    @inline
    def apply(
    ): DeleteJobTemplateResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteJobTemplateResponse]
    }
  }

  @js.native
  trait DeletePresetRequest extends js.Object {
    var Name: __string
  }

  object DeletePresetRequest {
    @inline
    def apply(
        Name: __string
    ): DeletePresetRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePresetRequest]
    }
  }

  @js.native
  trait DeletePresetResponse extends js.Object {}

  object DeletePresetResponse {
    @inline
    def apply(
    ): DeletePresetResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeletePresetResponse]
    }
  }

  @js.native
  trait DeleteQueueRequest extends js.Object {
    var Name: __string
  }

  object DeleteQueueRequest {
    @inline
    def apply(
        Name: __string
    ): DeleteQueueRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteQueueRequest]
    }
  }

  @js.native
  trait DeleteQueueResponse extends js.Object {}

  object DeleteQueueResponse {
    @inline
    def apply(
    ): DeleteQueueResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteQueueResponse]
    }
  }

  /**
    * Optional field, defaults to DEFAULT. Specify DEFAULT for this operation to return your endpoints if any exist, or to create an endpoint for you and return it if one doesn't already exist. Specify GET_ONLY to return your endpoints if any exist, or an empty list if none exist.
    */
  @js.native
  sealed trait DescribeEndpointsMode extends js.Any
  object DescribeEndpointsMode {
    val DEFAULT = "DEFAULT".asInstanceOf[DescribeEndpointsMode]
    val GET_ONLY = "GET_ONLY".asInstanceOf[DescribeEndpointsMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DEFAULT, GET_ONLY))
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
    @inline
    def apply(
        MaxResults: js.UndefOr[__integer] = js.undefined,
        Mode: js.UndefOr[DescribeEndpointsMode] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): DescribeEndpointsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndpointsRequest]
    }
  }

  @js.native
  trait DescribeEndpointsResponse extends js.Object {
    var Endpoints: js.UndefOr[__listOfEndpoint]
    var NextToken: js.UndefOr[__string]
  }

  object DescribeEndpointsResponse {
    @inline
    def apply(
        Endpoints: js.UndefOr[__listOfEndpoint] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): DescribeEndpointsResponse = {
      val __obj = js.Dynamic.literal()
      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndpointsResponse]
    }
  }

  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  @js.native
  trait DestinationSettings extends js.Object {
    var S3Settings: js.UndefOr[S3DestinationSettings]
  }

  object DestinationSettings {
    @inline
    def apply(
        S3Settings: js.UndefOr[S3DestinationSettings] = js.undefined
    ): DestinationSettings = {
      val __obj = js.Dynamic.literal()
      S3Settings.foreach(__v => __obj.updateDynamic("S3Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DestinationSettings]
    }
  }

  @js.native
  trait DisassociateCertificateRequest extends js.Object {
    var Arn: __string
  }

  object DisassociateCertificateRequest {
    @inline
    def apply(
        Arn: __string
    ): DisassociateCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateCertificateRequest]
    }
  }

  @js.native
  trait DisassociateCertificateResponse extends js.Object {}

  object DisassociateCertificateResponse {
    @inline
    def apply(
    ): DisassociateCertificateResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateCertificateResponse]
    }
  }

  /**
    * Settings for Dolby Vision
    */
  @js.native
  trait DolbyVision extends js.Object {
    var L6Metadata: js.UndefOr[DolbyVisionLevel6Metadata]
    var L6Mode: js.UndefOr[DolbyVisionLevel6Mode]
    var Profile: js.UndefOr[DolbyVisionProfile]
  }

  object DolbyVision {
    @inline
    def apply(
        L6Metadata: js.UndefOr[DolbyVisionLevel6Metadata] = js.undefined,
        L6Mode: js.UndefOr[DolbyVisionLevel6Mode] = js.undefined,
        Profile: js.UndefOr[DolbyVisionProfile] = js.undefined
    ): DolbyVision = {
      val __obj = js.Dynamic.literal()
      L6Metadata.foreach(__v => __obj.updateDynamic("L6Metadata")(__v.asInstanceOf[js.Any]))
      L6Mode.foreach(__v => __obj.updateDynamic("L6Mode")(__v.asInstanceOf[js.Any]))
      Profile.foreach(__v => __obj.updateDynamic("Profile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DolbyVision]
    }
  }

  /**
    * Use these settings when you set DolbyVisionLevel6Mode to SPECIFY to override the MaxCLL and MaxFALL values in your input with new values.
    */
  @js.native
  trait DolbyVisionLevel6Metadata extends js.Object {
    var MaxCll: js.UndefOr[__integerMin0Max65535]
    var MaxFall: js.UndefOr[__integerMin0Max65535]
  }

  object DolbyVisionLevel6Metadata {
    @inline
    def apply(
        MaxCll: js.UndefOr[__integerMin0Max65535] = js.undefined,
        MaxFall: js.UndefOr[__integerMin0Max65535] = js.undefined
    ): DolbyVisionLevel6Metadata = {
      val __obj = js.Dynamic.literal()
      MaxCll.foreach(__v => __obj.updateDynamic("MaxCll")(__v.asInstanceOf[js.Any]))
      MaxFall.foreach(__v => __obj.updateDynamic("MaxFall")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DolbyVisionLevel6Metadata]
    }
  }

  /**
    * Use Dolby Vision Mode to choose how the service will handle Dolby Vision MaxCLL and MaxFALL properies.
    */
  @js.native
  sealed trait DolbyVisionLevel6Mode extends js.Any
  object DolbyVisionLevel6Mode {
    val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[DolbyVisionLevel6Mode]
    val RECALCULATE = "RECALCULATE".asInstanceOf[DolbyVisionLevel6Mode]
    val SPECIFY = "SPECIFY".asInstanceOf[DolbyVisionLevel6Mode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PASSTHROUGH, RECALCULATE, SPECIFY))
  }

  /**
    * In the current MediaConvert implementation, the Dolby Vision profile is always 5 (PROFILE_5). Therefore, all of your inputs must contain Dolby Vision frame interleaved data.
    */
  @js.native
  sealed trait DolbyVisionProfile extends js.Any
  object DolbyVisionProfile {
    val PROFILE_5 = "PROFILE_5".asInstanceOf[DolbyVisionProfile]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PROFILE_5))
  }

  /**
    * Applies only to 29.97 fps outputs. When this feature is enabled, the service will use drop-frame timecode on outputs. If it is not possible to use drop-frame timecode, the system will fall back to non-drop-frame. This setting is enabled by default when Timecode insertion (TimecodeInsertion) is enabled.
    */
  @js.native
  sealed trait DropFrameTimecode extends js.Any
  object DropFrameTimecode {
    val DISABLED = "DISABLED".asInstanceOf[DropFrameTimecode]
    val ENABLED = "ENABLED".asInstanceOf[DropFrameTimecode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
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
    @inline
    def apply(
        NetworkId: js.UndefOr[__integerMin0Max65535] = js.undefined,
        NetworkName: js.UndefOr[__stringMin1Max256] = js.undefined,
        NitInterval: js.UndefOr[__integerMin25Max10000] = js.undefined
    ): DvbNitSettings = {
      val __obj = js.Dynamic.literal()
      NetworkId.foreach(__v => __obj.updateDynamic("NetworkId")(__v.asInstanceOf[js.Any]))
      NetworkName.foreach(__v => __obj.updateDynamic("NetworkName")(__v.asInstanceOf[js.Any]))
      NitInterval.foreach(__v => __obj.updateDynamic("NitInterval")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DvbNitSettings]
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
    @inline
    def apply(
        OutputSdt: js.UndefOr[OutputSdt] = js.undefined,
        SdtInterval: js.UndefOr[__integerMin25Max2000] = js.undefined,
        ServiceName: js.UndefOr[__stringMin1Max256] = js.undefined,
        ServiceProviderName: js.UndefOr[__stringMin1Max256] = js.undefined
    ): DvbSdtSettings = {
      val __obj = js.Dynamic.literal()
      OutputSdt.foreach(__v => __obj.updateDynamic("OutputSdt")(__v.asInstanceOf[js.Any]))
      SdtInterval.foreach(__v => __obj.updateDynamic("SdtInterval")(__v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.updateDynamic("ServiceName")(__v.asInstanceOf[js.Any]))
      ServiceProviderName.foreach(__v => __obj.updateDynamic("ServiceProviderName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DvbSdtSettings]
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
    var FontScript: js.UndefOr[FontScript]
    var FontSize: js.UndefOr[__integerMin0Max96]
    var OutlineColor: js.UndefOr[DvbSubtitleOutlineColor]
    var OutlineSize: js.UndefOr[__integerMin0Max10]
    var ShadowColor: js.UndefOr[DvbSubtitleShadowColor]
    var ShadowOpacity: js.UndefOr[__integerMin0Max255]
    var ShadowXOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var ShadowYOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var SubtitlingType: js.UndefOr[DvbSubtitlingType]
    var TeletextSpacing: js.UndefOr[DvbSubtitleTeletextSpacing]
    var XPosition: js.UndefOr[__integerMin0Max2147483647]
    var YPosition: js.UndefOr[__integerMin0Max2147483647]
  }

  object DvbSubDestinationSettings {
    @inline
    def apply(
        Alignment: js.UndefOr[DvbSubtitleAlignment] = js.undefined,
        BackgroundColor: js.UndefOr[DvbSubtitleBackgroundColor] = js.undefined,
        BackgroundOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        FontColor: js.UndefOr[DvbSubtitleFontColor] = js.undefined,
        FontOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        FontResolution: js.UndefOr[__integerMin96Max600] = js.undefined,
        FontScript: js.UndefOr[FontScript] = js.undefined,
        FontSize: js.UndefOr[__integerMin0Max96] = js.undefined,
        OutlineColor: js.UndefOr[DvbSubtitleOutlineColor] = js.undefined,
        OutlineSize: js.UndefOr[__integerMin0Max10] = js.undefined,
        ShadowColor: js.UndefOr[DvbSubtitleShadowColor] = js.undefined,
        ShadowOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        ShadowXOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        ShadowYOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        SubtitlingType: js.UndefOr[DvbSubtitlingType] = js.undefined,
        TeletextSpacing: js.UndefOr[DvbSubtitleTeletextSpacing] = js.undefined,
        XPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        YPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    ): DvbSubDestinationSettings = {
      val __obj = js.Dynamic.literal()
      Alignment.foreach(__v => __obj.updateDynamic("Alignment")(__v.asInstanceOf[js.Any]))
      BackgroundColor.foreach(__v => __obj.updateDynamic("BackgroundColor")(__v.asInstanceOf[js.Any]))
      BackgroundOpacity.foreach(__v => __obj.updateDynamic("BackgroundOpacity")(__v.asInstanceOf[js.Any]))
      FontColor.foreach(__v => __obj.updateDynamic("FontColor")(__v.asInstanceOf[js.Any]))
      FontOpacity.foreach(__v => __obj.updateDynamic("FontOpacity")(__v.asInstanceOf[js.Any]))
      FontResolution.foreach(__v => __obj.updateDynamic("FontResolution")(__v.asInstanceOf[js.Any]))
      FontScript.foreach(__v => __obj.updateDynamic("FontScript")(__v.asInstanceOf[js.Any]))
      FontSize.foreach(__v => __obj.updateDynamic("FontSize")(__v.asInstanceOf[js.Any]))
      OutlineColor.foreach(__v => __obj.updateDynamic("OutlineColor")(__v.asInstanceOf[js.Any]))
      OutlineSize.foreach(__v => __obj.updateDynamic("OutlineSize")(__v.asInstanceOf[js.Any]))
      ShadowColor.foreach(__v => __obj.updateDynamic("ShadowColor")(__v.asInstanceOf[js.Any]))
      ShadowOpacity.foreach(__v => __obj.updateDynamic("ShadowOpacity")(__v.asInstanceOf[js.Any]))
      ShadowXOffset.foreach(__v => __obj.updateDynamic("ShadowXOffset")(__v.asInstanceOf[js.Any]))
      ShadowYOffset.foreach(__v => __obj.updateDynamic("ShadowYOffset")(__v.asInstanceOf[js.Any]))
      SubtitlingType.foreach(__v => __obj.updateDynamic("SubtitlingType")(__v.asInstanceOf[js.Any]))
      TeletextSpacing.foreach(__v => __obj.updateDynamic("TeletextSpacing")(__v.asInstanceOf[js.Any]))
      XPosition.foreach(__v => __obj.updateDynamic("XPosition")(__v.asInstanceOf[js.Any]))
      YPosition.foreach(__v => __obj.updateDynamic("YPosition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DvbSubDestinationSettings]
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
    @inline
    def apply(
        Pid: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    ): DvbSubSourceSettings = {
      val __obj = js.Dynamic.literal()
      Pid.foreach(__v => __obj.updateDynamic("Pid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DvbSubSourceSettings]
    }
  }

  /**
    * If no explicit x_position or y_position is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  @js.native
  sealed trait DvbSubtitleAlignment extends js.Any
  object DvbSubtitleAlignment {
    val CENTERED = "CENTERED".asInstanceOf[DvbSubtitleAlignment]
    val LEFT = "LEFT".asInstanceOf[DvbSubtitleAlignment]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(CENTERED, LEFT))
  }

  /**
    * Specifies the color of the rectangle behind the captions.
    * All burn-in and DVB-Sub font settings must match.
    */
  @js.native
  sealed trait DvbSubtitleBackgroundColor extends js.Any
  object DvbSubtitleBackgroundColor {
    val NONE = "NONE".asInstanceOf[DvbSubtitleBackgroundColor]
    val BLACK = "BLACK".asInstanceOf[DvbSubtitleBackgroundColor]
    val WHITE = "WHITE".asInstanceOf[DvbSubtitleBackgroundColor]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NONE, BLACK, WHITE))
  }

  /**
    * Specifies the color of the burned-in captions. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(WHITE, BLACK, YELLOW, RED, GREEN, BLUE))
  }

  /**
    * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(BLACK, WHITE, YELLOW, RED, GREEN, BLUE))
  }

  /**
    * Specifies the color of the shadow cast by the captions.
    * All burn-in and DVB-Sub font settings must match.
    */
  @js.native
  sealed trait DvbSubtitleShadowColor extends js.Any
  object DvbSubtitleShadowColor {
    val NONE = "NONE".asInstanceOf[DvbSubtitleShadowColor]
    val BLACK = "BLACK".asInstanceOf[DvbSubtitleShadowColor]
    val WHITE = "WHITE".asInstanceOf[DvbSubtitleShadowColor]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NONE, BLACK, WHITE))
  }

  /**
    * Only applies to jobs with input captions in Teletext or STL formats. Specify whether the spacing between letters in your captions is set by the captions grid or varies depending on letter width. Choose fixed grid to conform to the spacing specified in the captions file more accurately. Choose proportional to make the text easier to read if the captions are closed caption.
    */
  @js.native
  sealed trait DvbSubtitleTeletextSpacing extends js.Any
  object DvbSubtitleTeletextSpacing {
    val FIXED_GRID = "FIXED_GRID".asInstanceOf[DvbSubtitleTeletextSpacing]
    val PROPORTIONAL = "PROPORTIONAL".asInstanceOf[DvbSubtitleTeletextSpacing]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(FIXED_GRID, PROPORTIONAL))
  }

  /**
    * Specify whether your DVB subtitles are standard or for hearing impaired. Choose hearing impaired if your subtitles include audio descriptions and dialogue. Choose standard if your subtitles include only dialogue.
    */
  @js.native
  sealed trait DvbSubtitlingType extends js.Any
  object DvbSubtitlingType {
    val HEARING_IMPAIRED = "HEARING_IMPAIRED".asInstanceOf[DvbSubtitlingType]
    val STANDARD = "STANDARD".asInstanceOf[DvbSubtitlingType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(HEARING_IMPAIRED, STANDARD))
  }

  /**
    * Inserts DVB Time and Date Table (TDT) at the specified table repetition interval.
    */
  @js.native
  trait DvbTdtSettings extends js.Object {
    var TdtInterval: js.UndefOr[__integerMin1000Max30000]
  }

  object DvbTdtSettings {
    @inline
    def apply(
        TdtInterval: js.UndefOr[__integerMin1000Max30000] = js.undefined
    ): DvbTdtSettings = {
      val __obj = js.Dynamic.literal()
      TdtInterval.foreach(__v => __obj.updateDynamic("TdtInterval")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DvbTdtSettings]
    }
  }

  /**
    * Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
    */
  @js.native
  sealed trait Eac3AtmosBitstreamMode extends js.Any
  object Eac3AtmosBitstreamMode {
    val COMPLETE_MAIN = "COMPLETE_MAIN".asInstanceOf[Eac3AtmosBitstreamMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(COMPLETE_MAIN))
  }

  /**
    * The coding mode for Dolby Digital Plus JOC (Atmos) is always 9.1.6 (CODING_MODE_9_1_6).
    */
  @js.native
  sealed trait Eac3AtmosCodingMode extends js.Any
  object Eac3AtmosCodingMode {
    val CODING_MODE_9_1_6 = "CODING_MODE_9_1_6".asInstanceOf[Eac3AtmosCodingMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(CODING_MODE_9_1_6))
  }

  /**
    * Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue analysis.
    */
  @js.native
  sealed trait Eac3AtmosDialogueIntelligence extends js.Any
  object Eac3AtmosDialogueIntelligence {
    val ENABLED = "ENABLED".asInstanceOf[Eac3AtmosDialogueIntelligence]
    val DISABLED = "DISABLED".asInstanceOf[Eac3AtmosDialogueIntelligence]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Specify the absolute peak level for a signal with dynamic range compression.
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH))
  }

  /**
    * Specify how the service limits the audio dynamic range when compressing the audio.
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH))
  }

  /**
    * Choose how the service meters the loudness of your audio.
    */
  @js.native
  sealed trait Eac3AtmosMeteringMode extends js.Any
  object Eac3AtmosMeteringMode {
    val LEQ_A = "LEQ_A".asInstanceOf[Eac3AtmosMeteringMode]
    val ITU_BS_1770_1 = "ITU_BS_1770_1".asInstanceOf[Eac3AtmosMeteringMode]
    val ITU_BS_1770_2 = "ITU_BS_1770_2".asInstanceOf[Eac3AtmosMeteringMode]
    val ITU_BS_1770_3 = "ITU_BS_1770_3".asInstanceOf[Eac3AtmosMeteringMode]
    val ITU_BS_1770_4 = "ITU_BS_1770_4".asInstanceOf[Eac3AtmosMeteringMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(LEQ_A, ITU_BS_1770_1, ITU_BS_1770_2, ITU_BS_1770_3, ITU_BS_1770_4))
  }

  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value EAC3_ATMOS.
    */
  @js.native
  trait Eac3AtmosSettings extends js.Object {
    var Bitrate: js.UndefOr[__integerMin384000Max768000]
    var BitstreamMode: js.UndefOr[Eac3AtmosBitstreamMode]
    var CodingMode: js.UndefOr[Eac3AtmosCodingMode]
    var DialogueIntelligence: js.UndefOr[Eac3AtmosDialogueIntelligence]
    var DynamicRangeCompressionLine: js.UndefOr[Eac3AtmosDynamicRangeCompressionLine]
    var DynamicRangeCompressionRf: js.UndefOr[Eac3AtmosDynamicRangeCompressionRf]
    var LoRoCenterMixLevel: js.UndefOr[__doubleMinNegative6Max3]
    var LoRoSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1]
    var LtRtCenterMixLevel: js.UndefOr[__doubleMinNegative6Max3]
    var LtRtSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1]
    var MeteringMode: js.UndefOr[Eac3AtmosMeteringMode]
    var SampleRate: js.UndefOr[__integerMin48000Max48000]
    var SpeechThreshold: js.UndefOr[__integerMin1Max100]
    var StereoDownmix: js.UndefOr[Eac3AtmosStereoDownmix]
    var SurroundExMode: js.UndefOr[Eac3AtmosSurroundExMode]
  }

  object Eac3AtmosSettings {
    @inline
    def apply(
        Bitrate: js.UndefOr[__integerMin384000Max768000] = js.undefined,
        BitstreamMode: js.UndefOr[Eac3AtmosBitstreamMode] = js.undefined,
        CodingMode: js.UndefOr[Eac3AtmosCodingMode] = js.undefined,
        DialogueIntelligence: js.UndefOr[Eac3AtmosDialogueIntelligence] = js.undefined,
        DynamicRangeCompressionLine: js.UndefOr[Eac3AtmosDynamicRangeCompressionLine] = js.undefined,
        DynamicRangeCompressionRf: js.UndefOr[Eac3AtmosDynamicRangeCompressionRf] = js.undefined,
        LoRoCenterMixLevel: js.UndefOr[__doubleMinNegative6Max3] = js.undefined,
        LoRoSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1] = js.undefined,
        LtRtCenterMixLevel: js.UndefOr[__doubleMinNegative6Max3] = js.undefined,
        LtRtSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1] = js.undefined,
        MeteringMode: js.UndefOr[Eac3AtmosMeteringMode] = js.undefined,
        SampleRate: js.UndefOr[__integerMin48000Max48000] = js.undefined,
        SpeechThreshold: js.UndefOr[__integerMin1Max100] = js.undefined,
        StereoDownmix: js.UndefOr[Eac3AtmosStereoDownmix] = js.undefined,
        SurroundExMode: js.UndefOr[Eac3AtmosSurroundExMode] = js.undefined
    ): Eac3AtmosSettings = {
      val __obj = js.Dynamic.literal()
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      BitstreamMode.foreach(__v => __obj.updateDynamic("BitstreamMode")(__v.asInstanceOf[js.Any]))
      CodingMode.foreach(__v => __obj.updateDynamic("CodingMode")(__v.asInstanceOf[js.Any]))
      DialogueIntelligence.foreach(__v => __obj.updateDynamic("DialogueIntelligence")(__v.asInstanceOf[js.Any]))
      DynamicRangeCompressionLine.foreach(__v => __obj.updateDynamic("DynamicRangeCompressionLine")(__v.asInstanceOf[js.Any]))
      DynamicRangeCompressionRf.foreach(__v => __obj.updateDynamic("DynamicRangeCompressionRf")(__v.asInstanceOf[js.Any]))
      LoRoCenterMixLevel.foreach(__v => __obj.updateDynamic("LoRoCenterMixLevel")(__v.asInstanceOf[js.Any]))
      LoRoSurroundMixLevel.foreach(__v => __obj.updateDynamic("LoRoSurroundMixLevel")(__v.asInstanceOf[js.Any]))
      LtRtCenterMixLevel.foreach(__v => __obj.updateDynamic("LtRtCenterMixLevel")(__v.asInstanceOf[js.Any]))
      LtRtSurroundMixLevel.foreach(__v => __obj.updateDynamic("LtRtSurroundMixLevel")(__v.asInstanceOf[js.Any]))
      MeteringMode.foreach(__v => __obj.updateDynamic("MeteringMode")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      SpeechThreshold.foreach(__v => __obj.updateDynamic("SpeechThreshold")(__v.asInstanceOf[js.Any]))
      StereoDownmix.foreach(__v => __obj.updateDynamic("StereoDownmix")(__v.asInstanceOf[js.Any]))
      SurroundExMode.foreach(__v => __obj.updateDynamic("SurroundExMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Eac3AtmosSettings]
    }
  }

  /**
    * Choose how the service does stereo downmixing.
    */
  @js.native
  sealed trait Eac3AtmosStereoDownmix extends js.Any
  object Eac3AtmosStereoDownmix {
    val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3AtmosStereoDownmix]
    val STEREO = "STEREO".asInstanceOf[Eac3AtmosStereoDownmix]
    val SURROUND = "SURROUND".asInstanceOf[Eac3AtmosStereoDownmix]
    val DPL2 = "DPL2".asInstanceOf[Eac3AtmosStereoDownmix]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NOT_INDICATED, STEREO, SURROUND, DPL2))
  }

  /**
    * Specify whether your input audio has an additional center rear surround channel matrix encoded into your left and right surround channels.
    */
  @js.native
  sealed trait Eac3AtmosSurroundExMode extends js.Any
  object Eac3AtmosSurroundExMode {
    val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3AtmosSurroundExMode]
    val ENABLED = "ENABLED".asInstanceOf[Eac3AtmosSurroundExMode]
    val DISABLED = "DISABLED".asInstanceOf[Eac3AtmosSurroundExMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NOT_INDICATED, ENABLED, DISABLED))
  }

  /**
    * If set to ATTENUATE_3_DB, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode.
    */
  @js.native
  sealed trait Eac3AttenuationControl extends js.Any
  object Eac3AttenuationControl {
    val ATTENUATE_3_DB = "ATTENUATE_3_DB".asInstanceOf[Eac3AttenuationControl]
    val NONE = "NONE".asInstanceOf[Eac3AttenuationControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ATTENUATE_3_DB, NONE))
  }

  /**
    * Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
    */
  @js.native
  sealed trait Eac3BitstreamMode extends js.Any
  object Eac3BitstreamMode {
    val COMPLETE_MAIN = "COMPLETE_MAIN".asInstanceOf[Eac3BitstreamMode]
    val COMMENTARY = "COMMENTARY".asInstanceOf[Eac3BitstreamMode]
    val EMERGENCY = "EMERGENCY".asInstanceOf[Eac3BitstreamMode]
    val HEARING_IMPAIRED = "HEARING_IMPAIRED".asInstanceOf[Eac3BitstreamMode]
    val VISUALLY_IMPAIRED = "VISUALLY_IMPAIRED".asInstanceOf[Eac3BitstreamMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(COMPLETE_MAIN, COMMENTARY, EMERGENCY, HEARING_IMPAIRED, VISUALLY_IMPAIRED))
  }

  /**
    * Dolby Digital Plus coding mode. Determines number of channels.
    */
  @js.native
  sealed trait Eac3CodingMode extends js.Any
  object Eac3CodingMode {
    val CODING_MODE_1_0 = "CODING_MODE_1_0".asInstanceOf[Eac3CodingMode]
    val CODING_MODE_2_0 = "CODING_MODE_2_0".asInstanceOf[Eac3CodingMode]
    val CODING_MODE_3_2 = "CODING_MODE_3_2".asInstanceOf[Eac3CodingMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_3_2))
  }

  /**
    * Activates a DC highpass filter for all input channels.
    */
  @js.native
  sealed trait Eac3DcFilter extends js.Any
  object Eac3DcFilter {
    val ENABLED = "ENABLED".asInstanceOf[Eac3DcFilter]
    val DISABLED = "DISABLED".asInstanceOf[Eac3DcFilter]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Specify the absolute peak level for a signal with dynamic range compression.
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH))
  }

  /**
    * Specify how the service limits the audio dynamic range when compressing the audio.
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH))
  }

  /**
    * When encoding 3/2 audio, controls whether the LFE channel is enabled
    */
  @js.native
  sealed trait Eac3LfeControl extends js.Any
  object Eac3LfeControl {
    val LFE = "LFE".asInstanceOf[Eac3LfeControl]
    val NO_LFE = "NO_LFE".asInstanceOf[Eac3LfeControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(LFE, NO_LFE))
  }

  /**
    * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
    */
  @js.native
  sealed trait Eac3LfeFilter extends js.Any
  object Eac3LfeFilter {
    val ENABLED = "ENABLED".asInstanceOf[Eac3LfeFilter]
    val DISABLED = "DISABLED".asInstanceOf[Eac3LfeFilter]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
    */
  @js.native
  sealed trait Eac3MetadataControl extends js.Any
  object Eac3MetadataControl {
    val FOLLOW_INPUT = "FOLLOW_INPUT".asInstanceOf[Eac3MetadataControl]
    val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[Eac3MetadataControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(FOLLOW_INPUT, USE_CONFIGURED))
  }

  /**
    * When set to WHEN_POSSIBLE, input DD+ audio will be passed through if it is present on the input. this detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a consistent DD+ output as the system alternates between passthrough and encoding.
    */
  @js.native
  sealed trait Eac3PassthroughControl extends js.Any
  object Eac3PassthroughControl {
    val WHEN_POSSIBLE = "WHEN_POSSIBLE".asInstanceOf[Eac3PassthroughControl]
    val NO_PASSTHROUGH = "NO_PASSTHROUGH".asInstanceOf[Eac3PassthroughControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(WHEN_POSSIBLE, NO_PASSTHROUGH))
  }

  /**
    * Controls the amount of phase-shift applied to the surround channels. Only used for 3/2 coding mode.
    */
  @js.native
  sealed trait Eac3PhaseControl extends js.Any
  object Eac3PhaseControl {
    val SHIFT_90_DEGREES = "SHIFT_90_DEGREES".asInstanceOf[Eac3PhaseControl]
    val NO_SHIFT = "NO_SHIFT".asInstanceOf[Eac3PhaseControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(SHIFT_90_DEGREES, NO_SHIFT))
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
    @inline
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
        SurroundMode: js.UndefOr[Eac3SurroundMode] = js.undefined
    ): Eac3Settings = {
      val __obj = js.Dynamic.literal()
      AttenuationControl.foreach(__v => __obj.updateDynamic("AttenuationControl")(__v.asInstanceOf[js.Any]))
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      BitstreamMode.foreach(__v => __obj.updateDynamic("BitstreamMode")(__v.asInstanceOf[js.Any]))
      CodingMode.foreach(__v => __obj.updateDynamic("CodingMode")(__v.asInstanceOf[js.Any]))
      DcFilter.foreach(__v => __obj.updateDynamic("DcFilter")(__v.asInstanceOf[js.Any]))
      Dialnorm.foreach(__v => __obj.updateDynamic("Dialnorm")(__v.asInstanceOf[js.Any]))
      DynamicRangeCompressionLine.foreach(__v => __obj.updateDynamic("DynamicRangeCompressionLine")(__v.asInstanceOf[js.Any]))
      DynamicRangeCompressionRf.foreach(__v => __obj.updateDynamic("DynamicRangeCompressionRf")(__v.asInstanceOf[js.Any]))
      LfeControl.foreach(__v => __obj.updateDynamic("LfeControl")(__v.asInstanceOf[js.Any]))
      LfeFilter.foreach(__v => __obj.updateDynamic("LfeFilter")(__v.asInstanceOf[js.Any]))
      LoRoCenterMixLevel.foreach(__v => __obj.updateDynamic("LoRoCenterMixLevel")(__v.asInstanceOf[js.Any]))
      LoRoSurroundMixLevel.foreach(__v => __obj.updateDynamic("LoRoSurroundMixLevel")(__v.asInstanceOf[js.Any]))
      LtRtCenterMixLevel.foreach(__v => __obj.updateDynamic("LtRtCenterMixLevel")(__v.asInstanceOf[js.Any]))
      LtRtSurroundMixLevel.foreach(__v => __obj.updateDynamic("LtRtSurroundMixLevel")(__v.asInstanceOf[js.Any]))
      MetadataControl.foreach(__v => __obj.updateDynamic("MetadataControl")(__v.asInstanceOf[js.Any]))
      PassthroughControl.foreach(__v => __obj.updateDynamic("PassthroughControl")(__v.asInstanceOf[js.Any]))
      PhaseControl.foreach(__v => __obj.updateDynamic("PhaseControl")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      StereoDownmix.foreach(__v => __obj.updateDynamic("StereoDownmix")(__v.asInstanceOf[js.Any]))
      SurroundExMode.foreach(__v => __obj.updateDynamic("SurroundExMode")(__v.asInstanceOf[js.Any]))
      SurroundMode.foreach(__v => __obj.updateDynamic("SurroundMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Eac3Settings]
    }
  }

  /**
    * Choose how the service does stereo downmixing. This setting only applies if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Stereo downmix (Eac3StereoDownmix).
    */
  @js.native
  sealed trait Eac3StereoDownmix extends js.Any
  object Eac3StereoDownmix {
    val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3StereoDownmix]
    val LO_RO = "LO_RO".asInstanceOf[Eac3StereoDownmix]
    val LT_RT = "LT_RT".asInstanceOf[Eac3StereoDownmix]
    val DPL2 = "DPL2".asInstanceOf[Eac3StereoDownmix]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NOT_INDICATED, LO_RO, LT_RT, DPL2))
  }

  /**
    * When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the left and right surround channels.
    */
  @js.native
  sealed trait Eac3SurroundExMode extends js.Any
  object Eac3SurroundExMode {
    val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3SurroundExMode]
    val ENABLED = "ENABLED".asInstanceOf[Eac3SurroundExMode]
    val DISABLED = "DISABLED".asInstanceOf[Eac3SurroundExMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NOT_INDICATED, ENABLED, DISABLED))
  }

  /**
    * When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels.
    */
  @js.native
  sealed trait Eac3SurroundMode extends js.Any
  object Eac3SurroundMode {
    val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3SurroundMode]
    val ENABLED = "ENABLED".asInstanceOf[Eac3SurroundMode]
    val DISABLED = "DISABLED".asInstanceOf[Eac3SurroundMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NOT_INDICATED, ENABLED, DISABLED))
  }

  /**
    * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
    */
  @js.native
  sealed trait EmbeddedConvert608To708 extends js.Any
  object EmbeddedConvert608To708 {
    val UPCONVERT = "UPCONVERT".asInstanceOf[EmbeddedConvert608To708]
    val DISABLED = "DISABLED".asInstanceOf[EmbeddedConvert608To708]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(UPCONVERT, DISABLED))
  }

  /**
    * Settings specific to embedded/ancillary caption outputs, including 608/708 Channel destination number.
    */
  @js.native
  trait EmbeddedDestinationSettings extends js.Object {
    var Destination608ChannelNumber: js.UndefOr[__integerMin1Max4]
    var Destination708ServiceNumber: js.UndefOr[__integerMin1Max6]
  }

  object EmbeddedDestinationSettings {
    @inline
    def apply(
        Destination608ChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined,
        Destination708ServiceNumber: js.UndefOr[__integerMin1Max6] = js.undefined
    ): EmbeddedDestinationSettings = {
      val __obj = js.Dynamic.literal()
      Destination608ChannelNumber.foreach(__v => __obj.updateDynamic("Destination608ChannelNumber")(__v.asInstanceOf[js.Any]))
      Destination708ServiceNumber.foreach(__v => __obj.updateDynamic("Destination708ServiceNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmbeddedDestinationSettings]
    }
  }

  /**
    * Settings for embedded captions Source
    */
  @js.native
  trait EmbeddedSourceSettings extends js.Object {
    var Convert608To708: js.UndefOr[EmbeddedConvert608To708]
    var Source608ChannelNumber: js.UndefOr[__integerMin1Max4]
    var Source608TrackNumber: js.UndefOr[__integerMin1Max1]
    var TerminateCaptions: js.UndefOr[EmbeddedTerminateCaptions]
  }

  object EmbeddedSourceSettings {
    @inline
    def apply(
        Convert608To708: js.UndefOr[EmbeddedConvert608To708] = js.undefined,
        Source608ChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined,
        Source608TrackNumber: js.UndefOr[__integerMin1Max1] = js.undefined,
        TerminateCaptions: js.UndefOr[EmbeddedTerminateCaptions] = js.undefined
    ): EmbeddedSourceSettings = {
      val __obj = js.Dynamic.literal()
      Convert608To708.foreach(__v => __obj.updateDynamic("Convert608To708")(__v.asInstanceOf[js.Any]))
      Source608ChannelNumber.foreach(__v => __obj.updateDynamic("Source608ChannelNumber")(__v.asInstanceOf[js.Any]))
      Source608TrackNumber.foreach(__v => __obj.updateDynamic("Source608TrackNumber")(__v.asInstanceOf[js.Any]))
      TerminateCaptions.foreach(__v => __obj.updateDynamic("TerminateCaptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmbeddedSourceSettings]
    }
  }

  /**
    * By default, the service terminates any unterminated captions at the end of each input. If you want the caption to continue onto your next input, disable this setting.
    */
  @js.native
  sealed trait EmbeddedTerminateCaptions extends js.Any
  object EmbeddedTerminateCaptions {
    val END_OF_INPUT = "END_OF_INPUT".asInstanceOf[EmbeddedTerminateCaptions]
    val DISABLED = "DISABLED".asInstanceOf[EmbeddedTerminateCaptions]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(END_OF_INPUT, DISABLED))
  }

  /**
    * Describes an account-specific API endpoint.
    */
  @js.native
  trait Endpoint extends js.Object {
    var Url: js.UndefOr[__string]
  }

  object Endpoint {
    @inline
    def apply(
        Url: js.UndefOr[__string] = js.undefined
    ): Endpoint = {
      val __obj = js.Dynamic.literal()
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Endpoint]
    }
  }

  /**
    * ESAM ManifestConfirmConditionNotification defined by OC-SP-ESAM-API-I03-131025.
    */
  @js.native
  trait EsamManifestConfirmConditionNotification extends js.Object {
    var MccXml: js.UndefOr[__stringPatternSNManifestConfirmConditionNotificationNS]
  }

  object EsamManifestConfirmConditionNotification {
    @inline
    def apply(
        MccXml: js.UndefOr[__stringPatternSNManifestConfirmConditionNotificationNS] = js.undefined
    ): EsamManifestConfirmConditionNotification = {
      val __obj = js.Dynamic.literal()
      MccXml.foreach(__v => __obj.updateDynamic("MccXml")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EsamManifestConfirmConditionNotification]
    }
  }

  /**
    * Settings for Event Signaling And Messaging (ESAM). If you don't do ad insertion, you can ignore these settings.
    */
  @js.native
  trait EsamSettings extends js.Object {
    var ManifestConfirmConditionNotification: js.UndefOr[EsamManifestConfirmConditionNotification]
    var ResponseSignalPreroll: js.UndefOr[__integerMin0Max30000]
    var SignalProcessingNotification: js.UndefOr[EsamSignalProcessingNotification]
  }

  object EsamSettings {
    @inline
    def apply(
        ManifestConfirmConditionNotification: js.UndefOr[EsamManifestConfirmConditionNotification] = js.undefined,
        ResponseSignalPreroll: js.UndefOr[__integerMin0Max30000] = js.undefined,
        SignalProcessingNotification: js.UndefOr[EsamSignalProcessingNotification] = js.undefined
    ): EsamSettings = {
      val __obj = js.Dynamic.literal()
      ManifestConfirmConditionNotification.foreach(__v => __obj.updateDynamic("ManifestConfirmConditionNotification")(__v.asInstanceOf[js.Any]))
      ResponseSignalPreroll.foreach(__v => __obj.updateDynamic("ResponseSignalPreroll")(__v.asInstanceOf[js.Any]))
      SignalProcessingNotification.foreach(__v => __obj.updateDynamic("SignalProcessingNotification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EsamSettings]
    }
  }

  /**
    * ESAM SignalProcessingNotification data defined by OC-SP-ESAM-API-I03-131025.
    */
  @js.native
  trait EsamSignalProcessingNotification extends js.Object {
    var SccXml: js.UndefOr[__stringPatternSNSignalProcessingNotificationNS]
  }

  object EsamSignalProcessingNotification {
    @inline
    def apply(
        SccXml: js.UndefOr[__stringPatternSNSignalProcessingNotificationNS] = js.undefined
    ): EsamSignalProcessingNotification = {
      val __obj = js.Dynamic.literal()
      SccXml.foreach(__v => __obj.updateDynamic("SccXml")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EsamSignalProcessingNotification]
    }
  }

  /**
    * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
    */
  @js.native
  sealed trait F4vMoovPlacement extends js.Any
  object F4vMoovPlacement {
    val PROGRESSIVE_DOWNLOAD = "PROGRESSIVE_DOWNLOAD".asInstanceOf[F4vMoovPlacement]
    val NORMAL = "NORMAL".asInstanceOf[F4vMoovPlacement]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PROGRESSIVE_DOWNLOAD, NORMAL))
  }

  /**
    * Settings for F4v container
    */
  @js.native
  trait F4vSettings extends js.Object {
    var MoovPlacement: js.UndefOr[F4vMoovPlacement]
  }

  object F4vSettings {
    @inline
    def apply(
        MoovPlacement: js.UndefOr[F4vMoovPlacement] = js.undefined
    ): F4vSettings = {
      val __obj = js.Dynamic.literal()
      MoovPlacement.foreach(__v => __obj.updateDynamic("MoovPlacement")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[F4vSettings]
    }
  }

  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to FILE_GROUP_SETTINGS.
    */
  @js.native
  trait FileGroupSettings extends js.Object {
    var Destination: js.UndefOr[__stringPatternS3]
    var DestinationSettings: js.UndefOr[DestinationSettings]
  }

  object FileGroupSettings {
    @inline
    def apply(
        Destination: js.UndefOr[__stringPatternS3] = js.undefined,
        DestinationSettings: js.UndefOr[DestinationSettings] = js.undefined
    ): FileGroupSettings = {
      val __obj = js.Dynamic.literal()
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      DestinationSettings.foreach(__v => __obj.updateDynamic("DestinationSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileGroupSettings]
    }
  }

  /**
    * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
    */
  @js.native
  sealed trait FileSourceConvert608To708 extends js.Any
  object FileSourceConvert608To708 {
    val UPCONVERT = "UPCONVERT".asInstanceOf[FileSourceConvert608To708]
    val DISABLED = "DISABLED".asInstanceOf[FileSourceConvert608To708]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(UPCONVERT, DISABLED))
  }

  /**
    * If your input captions are SCC, SMI, SRT, STL, TTML, or IMSC 1.1 in an xml file, specify the URI of the input caption source file. If your caption source is IMSC in an IMF package, use TrackSourceSettings instead of FileSoureSettings.
    */
  @js.native
  trait FileSourceSettings extends js.Object {
    var Convert608To708: js.UndefOr[FileSourceConvert608To708]
    var Framerate: js.UndefOr[CaptionSourceFramerate]
    var SourceFile: js.UndefOr[__stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIHttpsSccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMI]
    var TimeDelta: js.UndefOr[__integerMinNegative2147483648Max2147483647]
  }

  object FileSourceSettings {
    @inline
    def apply(
        Convert608To708: js.UndefOr[FileSourceConvert608To708] = js.undefined,
        Framerate: js.UndefOr[CaptionSourceFramerate] = js.undefined,
        SourceFile: js.UndefOr[__stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIHttpsSccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMI] = js.undefined,
        TimeDelta: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
    ): FileSourceSettings = {
      val __obj = js.Dynamic.literal()
      Convert608To708.foreach(__v => __obj.updateDynamic("Convert608To708")(__v.asInstanceOf[js.Any]))
      Framerate.foreach(__v => __obj.updateDynamic("Framerate")(__v.asInstanceOf[js.Any]))
      SourceFile.foreach(__v => __obj.updateDynamic("SourceFile")(__v.asInstanceOf[js.Any]))
      TimeDelta.foreach(__v => __obj.updateDynamic("TimeDelta")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileSourceSettings]
    }
  }

  /**
    * Provide the font script, using an ISO 15924 script code, if the LanguageCode is not sufficient for determining the script type. Where LanguageCode or CustomLanguageCode is sufficient, use "AUTOMATIC" or leave unset.
    */
  @js.native
  sealed trait FontScript extends js.Any
  object FontScript {
    val AUTOMATIC = "AUTOMATIC".asInstanceOf[FontScript]
    val HANS = "HANS".asInstanceOf[FontScript]
    val HANT = "HANT".asInstanceOf[FontScript]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(AUTOMATIC, HANS, HANT))
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
    @inline
    def apply(
        FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        MaxCaptures: js.UndefOr[__integerMin1Max10000000] = js.undefined,
        Quality: js.UndefOr[__integerMin1Max100] = js.undefined
    ): FrameCaptureSettings = {
      val __obj = js.Dynamic.literal()
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      MaxCaptures.foreach(__v => __obj.updateDynamic("MaxCaptures")(__v.asInstanceOf[js.Any]))
      Quality.foreach(__v => __obj.updateDynamic("Quality")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FrameCaptureSettings]
    }
  }

  @js.native
  trait GetJobRequest extends js.Object {
    var Id: __string
  }

  object GetJobRequest {
    @inline
    def apply(
        Id: __string
    ): GetJobRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetJobRequest]
    }
  }

  @js.native
  trait GetJobResponse extends js.Object {
    var Job: js.UndefOr[Job]
  }

  object GetJobResponse {
    @inline
    def apply(
        Job: js.UndefOr[Job] = js.undefined
    ): GetJobResponse = {
      val __obj = js.Dynamic.literal()
      Job.foreach(__v => __obj.updateDynamic("Job")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobResponse]
    }
  }

  @js.native
  trait GetJobTemplateRequest extends js.Object {
    var Name: __string
  }

  object GetJobTemplateRequest {
    @inline
    def apply(
        Name: __string
    ): GetJobTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetJobTemplateRequest]
    }
  }

  @js.native
  trait GetJobTemplateResponse extends js.Object {
    var JobTemplate: js.UndefOr[JobTemplate]
  }

  object GetJobTemplateResponse {
    @inline
    def apply(
        JobTemplate: js.UndefOr[JobTemplate] = js.undefined
    ): GetJobTemplateResponse = {
      val __obj = js.Dynamic.literal()
      JobTemplate.foreach(__v => __obj.updateDynamic("JobTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobTemplateResponse]
    }
  }

  @js.native
  trait GetPresetRequest extends js.Object {
    var Name: __string
  }

  object GetPresetRequest {
    @inline
    def apply(
        Name: __string
    ): GetPresetRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPresetRequest]
    }
  }

  @js.native
  trait GetPresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset]
  }

  object GetPresetResponse {
    @inline
    def apply(
        Preset: js.UndefOr[Preset] = js.undefined
    ): GetPresetResponse = {
      val __obj = js.Dynamic.literal()
      Preset.foreach(__v => __obj.updateDynamic("Preset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPresetResponse]
    }
  }

  @js.native
  trait GetQueueRequest extends js.Object {
    var Name: __string
  }

  object GetQueueRequest {
    @inline
    def apply(
        Name: __string
    ): GetQueueRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetQueueRequest]
    }
  }

  @js.native
  trait GetQueueResponse extends js.Object {
    var Queue: js.UndefOr[Queue]
  }

  object GetQueueResponse {
    @inline
    def apply(
        Queue: js.UndefOr[Queue] = js.undefined
    ): GetQueueResponse = {
      val __obj = js.Dynamic.literal()
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQueueResponse]
    }
  }

  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  @js.native
  sealed trait H264AdaptiveQuantization extends js.Any
  object H264AdaptiveQuantization {
    val OFF = "OFF".asInstanceOf[H264AdaptiveQuantization]
    val LOW = "LOW".asInstanceOf[H264AdaptiveQuantization]
    val MEDIUM = "MEDIUM".asInstanceOf[H264AdaptiveQuantization]
    val HIGH = "HIGH".asInstanceOf[H264AdaptiveQuantization]
    val HIGHER = "HIGHER".asInstanceOf[H264AdaptiveQuantization]
    val MAX = "MAX".asInstanceOf[H264AdaptiveQuantization]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(OFF, LOW, MEDIUM, HIGH, HIGHER, MAX))
  }

  /**
    * Specify an H.264 level that is consistent with your output video settings. If you aren't sure what level to specify, choose Auto (AUTO).
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(
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
    ))
  }

  /**
    * H.264 Profile. High 4:2:2 and 10-bit profiles are only available with the AVC-I License.
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(BASELINE, HIGH, HIGH_10BIT, HIGH_422, HIGH_422_10BIT, MAIN))
  }

  /**
    * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
    */
  @js.native
  sealed trait H264DynamicSubGop extends js.Any
  object H264DynamicSubGop {
    val ADAPTIVE = "ADAPTIVE".asInstanceOf[H264DynamicSubGop]
    val STATIC = "STATIC".asInstanceOf[H264DynamicSubGop]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ADAPTIVE, STATIC))
  }

  /**
    * Entropy encoding mode. Use CABAC (must be in Main or High profile) or CAVLC.
    */
  @js.native
  sealed trait H264EntropyEncoding extends js.Any
  object H264EntropyEncoding {
    val CABAC = "CABAC".asInstanceOf[H264EntropyEncoding]
    val CAVLC = "CAVLC".asInstanceOf[H264EntropyEncoding]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(CABAC, CAVLC))
  }

  /**
    * Choosing FORCE_FIELD disables PAFF encoding for interlaced outputs.
    */
  @js.native
  sealed trait H264FieldEncoding extends js.Any
  object H264FieldEncoding {
    val PAFF = "PAFF".asInstanceOf[H264FieldEncoding]
    val FORCE_FIELD = "FORCE_FIELD".asInstanceOf[H264FieldEncoding]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PAFF, FORCE_FIELD))
  }

  /**
    * Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
    */
  @js.native
  sealed trait H264FlickerAdaptiveQuantization extends js.Any
  object H264FlickerAdaptiveQuantization {
    val DISABLED = "DISABLED".asInstanceOf[H264FlickerAdaptiveQuantization]
    val ENABLED = "ENABLED".asInstanceOf[H264FlickerAdaptiveQuantization]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  @js.native
  sealed trait H264FramerateControl extends js.Any
  object H264FramerateControl {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[H264FramerateControl]
    val SPECIFIED = "SPECIFIED".asInstanceOf[H264FramerateControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * Optional. Specify how the transcoder performs framerate conversion. The default behavior is to use duplicate drop conversion.
    */
  @js.native
  sealed trait H264FramerateConversionAlgorithm extends js.Any
  object H264FramerateConversionAlgorithm {
    val DUPLICATE_DROP = "DUPLICATE_DROP".asInstanceOf[H264FramerateConversionAlgorithm]
    val INTERPOLATE = "INTERPOLATE".asInstanceOf[H264FramerateConversionAlgorithm]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DUPLICATE_DROP, INTERPOLATE))
  }

  /**
    * If enable, use reference B frames for GOP structures that have B frames > 1.
    */
  @js.native
  sealed trait H264GopBReference extends js.Any
  object H264GopBReference {
    val DISABLED = "DISABLED".asInstanceOf[H264GopBReference]
    val ENABLED = "ENABLED".asInstanceOf[H264GopBReference]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Indicates if the GOP Size in H264 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
    */
  @js.native
  sealed trait H264GopSizeUnits extends js.Any
  object H264GopSizeUnits {
    val FRAMES = "FRAMES".asInstanceOf[H264GopSizeUnits]
    val SECONDS = "SECONDS".asInstanceOf[H264GopSizeUnits]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(FRAMES, SECONDS))
  }

  /**
    * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type, as follows.
    *   - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
    *   - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
    */
  @js.native
  sealed trait H264InterlaceMode extends js.Any
  object H264InterlaceMode {
    val PROGRESSIVE = "PROGRESSIVE".asInstanceOf[H264InterlaceMode]
    val TOP_FIELD = "TOP_FIELD".asInstanceOf[H264InterlaceMode]
    val BOTTOM_FIELD = "BOTTOM_FIELD".asInstanceOf[H264InterlaceMode]
    val FOLLOW_TOP_FIELD = "FOLLOW_TOP_FIELD".asInstanceOf[H264InterlaceMode]
    val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD".asInstanceOf[H264InterlaceMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD))
  }

  /**
    * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
    */
  @js.native
  sealed trait H264ParControl extends js.Any
  object H264ParControl {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[H264ParControl]
    val SPECIFIED = "SPECIFIED".asInstanceOf[H264ParControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, single-pass encoding.
    */
  @js.native
  sealed trait H264QualityTuningLevel extends js.Any
  object H264QualityTuningLevel {
    val SINGLE_PASS = "SINGLE_PASS".asInstanceOf[H264QualityTuningLevel]
    val SINGLE_PASS_HQ = "SINGLE_PASS_HQ".asInstanceOf[H264QualityTuningLevel]
    val MULTI_PASS_HQ = "MULTI_PASS_HQ".asInstanceOf[H264QualityTuningLevel]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(SINGLE_PASS, SINGLE_PASS_HQ, MULTI_PASS_HQ))
  }

  /**
    * Settings for quality-defined variable bitrate encoding with the H.264 codec. Required when you set Rate control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control mode.
    */
  @js.native
  trait H264QvbrSettings extends js.Object {
    var MaxAverageBitrate: js.UndefOr[__integerMin1000Max1152000000]
    var QvbrQualityLevel: js.UndefOr[__integerMin1Max10]
    var QvbrQualityLevelFineTune: js.UndefOr[__doubleMin0Max1]
  }

  object H264QvbrSettings {
    @inline
    def apply(
        MaxAverageBitrate: js.UndefOr[__integerMin1000Max1152000000] = js.undefined,
        QvbrQualityLevel: js.UndefOr[__integerMin1Max10] = js.undefined,
        QvbrQualityLevelFineTune: js.UndefOr[__doubleMin0Max1] = js.undefined
    ): H264QvbrSettings = {
      val __obj = js.Dynamic.literal()
      MaxAverageBitrate.foreach(__v => __obj.updateDynamic("MaxAverageBitrate")(__v.asInstanceOf[js.Any]))
      QvbrQualityLevel.foreach(__v => __obj.updateDynamic("QvbrQualityLevel")(__v.asInstanceOf[js.Any]))
      QvbrQualityLevelFineTune.foreach(__v => __obj.updateDynamic("QvbrQualityLevelFineTune")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[H264QvbrSettings]
    }
  }

  /**
    * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
    */
  @js.native
  sealed trait H264RateControlMode extends js.Any
  object H264RateControlMode {
    val VBR = "VBR".asInstanceOf[H264RateControlMode]
    val CBR = "CBR".asInstanceOf[H264RateControlMode]
    val QVBR = "QVBR".asInstanceOf[H264RateControlMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(VBR, CBR, QVBR))
  }

  /**
    * Places a PPS header on each encoded picture, even if repeated.
    */
  @js.native
  sealed trait H264RepeatPps extends js.Any
  object H264RepeatPps {
    val DISABLED = "DISABLED".asInstanceOf[H264RepeatPps]
    val ENABLED = "ENABLED".asInstanceOf[H264RepeatPps]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default. If this output uses QVBR, choose Transition detection (TRANSITION_DETECTION) for further video quality improvement. For more information about QVBR, see https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
    */
  @js.native
  sealed trait H264SceneChangeDetect extends js.Any
  object H264SceneChangeDetect {
    val DISABLED = "DISABLED".asInstanceOf[H264SceneChangeDetect]
    val ENABLED = "ENABLED".asInstanceOf[H264SceneChangeDetect]
    val TRANSITION_DETECTION = "TRANSITION_DETECTION".asInstanceOf[H264SceneChangeDetect]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED, TRANSITION_DETECTION))
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
    @inline
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
        UnregisteredSeiTimecode: js.UndefOr[H264UnregisteredSeiTimecode] = js.undefined
    ): H264Settings = {
      val __obj = js.Dynamic.literal()
      AdaptiveQuantization.foreach(__v => __obj.updateDynamic("AdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      CodecLevel.foreach(__v => __obj.updateDynamic("CodecLevel")(__v.asInstanceOf[js.Any]))
      CodecProfile.foreach(__v => __obj.updateDynamic("CodecProfile")(__v.asInstanceOf[js.Any]))
      DynamicSubGop.foreach(__v => __obj.updateDynamic("DynamicSubGop")(__v.asInstanceOf[js.Any]))
      EntropyEncoding.foreach(__v => __obj.updateDynamic("EntropyEncoding")(__v.asInstanceOf[js.Any]))
      FieldEncoding.foreach(__v => __obj.updateDynamic("FieldEncoding")(__v.asInstanceOf[js.Any]))
      FlickerAdaptiveQuantization.foreach(__v => __obj.updateDynamic("FlickerAdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      FramerateControl.foreach(__v => __obj.updateDynamic("FramerateControl")(__v.asInstanceOf[js.Any]))
      FramerateConversionAlgorithm.foreach(__v => __obj.updateDynamic("FramerateConversionAlgorithm")(__v.asInstanceOf[js.Any]))
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      GopBReference.foreach(__v => __obj.updateDynamic("GopBReference")(__v.asInstanceOf[js.Any]))
      GopClosedCadence.foreach(__v => __obj.updateDynamic("GopClosedCadence")(__v.asInstanceOf[js.Any]))
      GopSize.foreach(__v => __obj.updateDynamic("GopSize")(__v.asInstanceOf[js.Any]))
      GopSizeUnits.foreach(__v => __obj.updateDynamic("GopSizeUnits")(__v.asInstanceOf[js.Any]))
      HrdBufferInitialFillPercentage.foreach(__v => __obj.updateDynamic("HrdBufferInitialFillPercentage")(__v.asInstanceOf[js.Any]))
      HrdBufferSize.foreach(__v => __obj.updateDynamic("HrdBufferSize")(__v.asInstanceOf[js.Any]))
      InterlaceMode.foreach(__v => __obj.updateDynamic("InterlaceMode")(__v.asInstanceOf[js.Any]))
      MaxBitrate.foreach(__v => __obj.updateDynamic("MaxBitrate")(__v.asInstanceOf[js.Any]))
      MinIInterval.foreach(__v => __obj.updateDynamic("MinIInterval")(__v.asInstanceOf[js.Any]))
      NumberBFramesBetweenReferenceFrames.foreach(__v => __obj.updateDynamic("NumberBFramesBetweenReferenceFrames")(__v.asInstanceOf[js.Any]))
      NumberReferenceFrames.foreach(__v => __obj.updateDynamic("NumberReferenceFrames")(__v.asInstanceOf[js.Any]))
      ParControl.foreach(__v => __obj.updateDynamic("ParControl")(__v.asInstanceOf[js.Any]))
      ParDenominator.foreach(__v => __obj.updateDynamic("ParDenominator")(__v.asInstanceOf[js.Any]))
      ParNumerator.foreach(__v => __obj.updateDynamic("ParNumerator")(__v.asInstanceOf[js.Any]))
      QualityTuningLevel.foreach(__v => __obj.updateDynamic("QualityTuningLevel")(__v.asInstanceOf[js.Any]))
      QvbrSettings.foreach(__v => __obj.updateDynamic("QvbrSettings")(__v.asInstanceOf[js.Any]))
      RateControlMode.foreach(__v => __obj.updateDynamic("RateControlMode")(__v.asInstanceOf[js.Any]))
      RepeatPps.foreach(__v => __obj.updateDynamic("RepeatPps")(__v.asInstanceOf[js.Any]))
      SceneChangeDetect.foreach(__v => __obj.updateDynamic("SceneChangeDetect")(__v.asInstanceOf[js.Any]))
      Slices.foreach(__v => __obj.updateDynamic("Slices")(__v.asInstanceOf[js.Any]))
      SlowPal.foreach(__v => __obj.updateDynamic("SlowPal")(__v.asInstanceOf[js.Any]))
      Softness.foreach(__v => __obj.updateDynamic("Softness")(__v.asInstanceOf[js.Any]))
      SpatialAdaptiveQuantization.foreach(__v => __obj.updateDynamic("SpatialAdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      Syntax.foreach(__v => __obj.updateDynamic("Syntax")(__v.asInstanceOf[js.Any]))
      Telecine.foreach(__v => __obj.updateDynamic("Telecine")(__v.asInstanceOf[js.Any]))
      TemporalAdaptiveQuantization.foreach(__v => __obj.updateDynamic("TemporalAdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      UnregisteredSeiTimecode.foreach(__v => __obj.updateDynamic("UnregisteredSeiTimecode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[H264Settings]
    }
  }

  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  @js.native
  sealed trait H264SlowPal extends js.Any
  object H264SlowPal {
    val DISABLED = "DISABLED".asInstanceOf[H264SlowPal]
    val ENABLED = "ENABLED".asInstanceOf[H264SlowPal]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Adjust quantization within each frame based on spatial variation of content complexity.
    */
  @js.native
  sealed trait H264SpatialAdaptiveQuantization extends js.Any
  object H264SpatialAdaptiveQuantization {
    val DISABLED = "DISABLED".asInstanceOf[H264SpatialAdaptiveQuantization]
    val ENABLED = "ENABLED".asInstanceOf[H264SpatialAdaptiveQuantization]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Produces a bitstream compliant with SMPTE RP-2027.
    */
  @js.native
  sealed trait H264Syntax extends js.Any
  object H264Syntax {
    val DEFAULT = "DEFAULT".asInstanceOf[H264Syntax]
    val RP2027 = "RP2027".asInstanceOf[H264Syntax]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DEFAULT, RP2027))
  }

  /**
    * This field applies only if the Streams > Advanced > Framerate (framerate) field  is set to 29.970. This field works with the Streams > Advanced > Preprocessors > Deinterlacer  field (deinterlace_mode) and the Streams > Advanced > Interlaced Mode field (interlace_mode)  to identify the scan type for the output: Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces 23.976; the player converts this output to 29.97i.
    */
  @js.native
  sealed trait H264Telecine extends js.Any
  object H264Telecine {
    val NONE = "NONE".asInstanceOf[H264Telecine]
    val SOFT = "SOFT".asInstanceOf[H264Telecine]
    val HARD = "HARD".asInstanceOf[H264Telecine]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NONE, SOFT, HARD))
  }

  /**
    * Adjust quantization within each frame based on temporal variation of content complexity.
    */
  @js.native
  sealed trait H264TemporalAdaptiveQuantization extends js.Any
  object H264TemporalAdaptiveQuantization {
    val DISABLED = "DISABLED".asInstanceOf[H264TemporalAdaptiveQuantization]
    val ENABLED = "ENABLED".asInstanceOf[H264TemporalAdaptiveQuantization]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
    */
  @js.native
  sealed trait H264UnregisteredSeiTimecode extends js.Any
  object H264UnregisteredSeiTimecode {
    val DISABLED = "DISABLED".asInstanceOf[H264UnregisteredSeiTimecode]
    val ENABLED = "ENABLED".asInstanceOf[H264UnregisteredSeiTimecode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(OFF, LOW, MEDIUM, HIGH, HIGHER, MAX))
  }

  /**
    * Enables Alternate Transfer Function SEI message for outputs using Hybrid Log Gamma (HLG) Electro-Optical Transfer Function (EOTF).
    */
  @js.native
  sealed trait H265AlternateTransferFunctionSei extends js.Any
  object H265AlternateTransferFunctionSei {
    val DISABLED = "DISABLED".asInstanceOf[H265AlternateTransferFunctionSei]
    val ENABLED = "ENABLED".asInstanceOf[H265AlternateTransferFunctionSei]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * H.265 Level.
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(AUTO, LEVEL_1, LEVEL_2, LEVEL_2_1, LEVEL_3, LEVEL_3_1, LEVEL_4, LEVEL_4_1, LEVEL_5, LEVEL_5_1, LEVEL_5_2, LEVEL_6, LEVEL_6_1, LEVEL_6_2))
  }

  /**
    * Represents the Profile and Tier, per the HEVC (H.265) specification. Selections are grouped as [Profile] / [Tier], so "Main/High" represents Main Profile with High Tier. 4:2:2 profiles are only available with the HEVC 4:2:2 License.
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(MAIN_MAIN, MAIN_HIGH, MAIN10_MAIN, MAIN10_HIGH, MAIN_422_8BIT_MAIN, MAIN_422_8BIT_HIGH, MAIN_422_10BIT_MAIN, MAIN_422_10BIT_HIGH))
  }

  /**
    * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
    */
  @js.native
  sealed trait H265DynamicSubGop extends js.Any
  object H265DynamicSubGop {
    val ADAPTIVE = "ADAPTIVE".asInstanceOf[H265DynamicSubGop]
    val STATIC = "STATIC".asInstanceOf[H265DynamicSubGop]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ADAPTIVE, STATIC))
  }

  /**
    * Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
    */
  @js.native
  sealed trait H265FlickerAdaptiveQuantization extends js.Any
  object H265FlickerAdaptiveQuantization {
    val DISABLED = "DISABLED".asInstanceOf[H265FlickerAdaptiveQuantization]
    val ENABLED = "ENABLED".asInstanceOf[H265FlickerAdaptiveQuantization]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  @js.native
  sealed trait H265FramerateControl extends js.Any
  object H265FramerateControl {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[H265FramerateControl]
    val SPECIFIED = "SPECIFIED".asInstanceOf[H265FramerateControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * Optional. Specify how the transcoder performs framerate conversion. The default behavior is to use duplicate drop conversion.
    */
  @js.native
  sealed trait H265FramerateConversionAlgorithm extends js.Any
  object H265FramerateConversionAlgorithm {
    val DUPLICATE_DROP = "DUPLICATE_DROP".asInstanceOf[H265FramerateConversionAlgorithm]
    val INTERPOLATE = "INTERPOLATE".asInstanceOf[H265FramerateConversionAlgorithm]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DUPLICATE_DROP, INTERPOLATE))
  }

  /**
    * If enable, use reference B frames for GOP structures that have B frames > 1.
    */
  @js.native
  sealed trait H265GopBReference extends js.Any
  object H265GopBReference {
    val DISABLED = "DISABLED".asInstanceOf[H265GopBReference]
    val ENABLED = "ENABLED".asInstanceOf[H265GopBReference]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Indicates if the GOP Size in H265 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
    */
  @js.native
  sealed trait H265GopSizeUnits extends js.Any
  object H265GopSizeUnits {
    val FRAMES = "FRAMES".asInstanceOf[H265GopSizeUnits]
    val SECONDS = "SECONDS".asInstanceOf[H265GopSizeUnits]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(FRAMES, SECONDS))
  }

  /**
    * Choose the scan line type for the output. Choose Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Choose Top Field First (TOP_FIELD) or Bottom Field First (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Choose Follow, Default Top (FOLLOW_TOP_FIELD) or Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) to create an interlaced output with the same field polarity as the source. If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first". If the source is progressive, your output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose. If you don't choose a value, the service will default to Progressive (PROGRESSIVE).
    */
  @js.native
  sealed trait H265InterlaceMode extends js.Any
  object H265InterlaceMode {
    val PROGRESSIVE = "PROGRESSIVE".asInstanceOf[H265InterlaceMode]
    val TOP_FIELD = "TOP_FIELD".asInstanceOf[H265InterlaceMode]
    val BOTTOM_FIELD = "BOTTOM_FIELD".asInstanceOf[H265InterlaceMode]
    val FOLLOW_TOP_FIELD = "FOLLOW_TOP_FIELD".asInstanceOf[H265InterlaceMode]
    val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD".asInstanceOf[H265InterlaceMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD))
  }

  /**
    * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
    */
  @js.native
  sealed trait H265ParControl extends js.Any
  object H265ParControl {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[H265ParControl]
    val SPECIFIED = "SPECIFIED".asInstanceOf[H265ParControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, single-pass encoding.
    */
  @js.native
  sealed trait H265QualityTuningLevel extends js.Any
  object H265QualityTuningLevel {
    val SINGLE_PASS = "SINGLE_PASS".asInstanceOf[H265QualityTuningLevel]
    val SINGLE_PASS_HQ = "SINGLE_PASS_HQ".asInstanceOf[H265QualityTuningLevel]
    val MULTI_PASS_HQ = "MULTI_PASS_HQ".asInstanceOf[H265QualityTuningLevel]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(SINGLE_PASS, SINGLE_PASS_HQ, MULTI_PASS_HQ))
  }

  /**
    * Settings for quality-defined variable bitrate encoding with the H.265 codec. Required when you set Rate control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control mode.
    */
  @js.native
  trait H265QvbrSettings extends js.Object {
    var MaxAverageBitrate: js.UndefOr[__integerMin1000Max1466400000]
    var QvbrQualityLevel: js.UndefOr[__integerMin1Max10]
    var QvbrQualityLevelFineTune: js.UndefOr[__doubleMin0Max1]
  }

  object H265QvbrSettings {
    @inline
    def apply(
        MaxAverageBitrate: js.UndefOr[__integerMin1000Max1466400000] = js.undefined,
        QvbrQualityLevel: js.UndefOr[__integerMin1Max10] = js.undefined,
        QvbrQualityLevelFineTune: js.UndefOr[__doubleMin0Max1] = js.undefined
    ): H265QvbrSettings = {
      val __obj = js.Dynamic.literal()
      MaxAverageBitrate.foreach(__v => __obj.updateDynamic("MaxAverageBitrate")(__v.asInstanceOf[js.Any]))
      QvbrQualityLevel.foreach(__v => __obj.updateDynamic("QvbrQualityLevel")(__v.asInstanceOf[js.Any]))
      QvbrQualityLevelFineTune.foreach(__v => __obj.updateDynamic("QvbrQualityLevelFineTune")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[H265QvbrSettings]
    }
  }

  /**
    * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
    */
  @js.native
  sealed trait H265RateControlMode extends js.Any
  object H265RateControlMode {
    val VBR = "VBR".asInstanceOf[H265RateControlMode]
    val CBR = "CBR".asInstanceOf[H265RateControlMode]
    val QVBR = "QVBR".asInstanceOf[H265RateControlMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(VBR, CBR, QVBR))
  }

  /**
    * Specify Sample Adaptive Offset (SAO) filter strength.  Adaptive mode dynamically selects best strength based on content
    */
  @js.native
  sealed trait H265SampleAdaptiveOffsetFilterMode extends js.Any
  object H265SampleAdaptiveOffsetFilterMode {
    val DEFAULT = "DEFAULT".asInstanceOf[H265SampleAdaptiveOffsetFilterMode]
    val ADAPTIVE = "ADAPTIVE".asInstanceOf[H265SampleAdaptiveOffsetFilterMode]
    val OFF = "OFF".asInstanceOf[H265SampleAdaptiveOffsetFilterMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DEFAULT, ADAPTIVE, OFF))
  }

  /**
    * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default. If this output uses QVBR, choose Transition detection (TRANSITION_DETECTION) for further video quality improvement. For more information about QVBR, see https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
    */
  @js.native
  sealed trait H265SceneChangeDetect extends js.Any
  object H265SceneChangeDetect {
    val DISABLED = "DISABLED".asInstanceOf[H265SceneChangeDetect]
    val ENABLED = "ENABLED".asInstanceOf[H265SceneChangeDetect]
    val TRANSITION_DETECTION = "TRANSITION_DETECTION".asInstanceOf[H265SceneChangeDetect]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED, TRANSITION_DETECTION))
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
    @inline
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
        WriteMp4PackagingType: js.UndefOr[H265WriteMp4PackagingType] = js.undefined
    ): H265Settings = {
      val __obj = js.Dynamic.literal()
      AdaptiveQuantization.foreach(__v => __obj.updateDynamic("AdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      AlternateTransferFunctionSei.foreach(__v => __obj.updateDynamic("AlternateTransferFunctionSei")(__v.asInstanceOf[js.Any]))
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      CodecLevel.foreach(__v => __obj.updateDynamic("CodecLevel")(__v.asInstanceOf[js.Any]))
      CodecProfile.foreach(__v => __obj.updateDynamic("CodecProfile")(__v.asInstanceOf[js.Any]))
      DynamicSubGop.foreach(__v => __obj.updateDynamic("DynamicSubGop")(__v.asInstanceOf[js.Any]))
      FlickerAdaptiveQuantization.foreach(__v => __obj.updateDynamic("FlickerAdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      FramerateControl.foreach(__v => __obj.updateDynamic("FramerateControl")(__v.asInstanceOf[js.Any]))
      FramerateConversionAlgorithm.foreach(__v => __obj.updateDynamic("FramerateConversionAlgorithm")(__v.asInstanceOf[js.Any]))
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      GopBReference.foreach(__v => __obj.updateDynamic("GopBReference")(__v.asInstanceOf[js.Any]))
      GopClosedCadence.foreach(__v => __obj.updateDynamic("GopClosedCadence")(__v.asInstanceOf[js.Any]))
      GopSize.foreach(__v => __obj.updateDynamic("GopSize")(__v.asInstanceOf[js.Any]))
      GopSizeUnits.foreach(__v => __obj.updateDynamic("GopSizeUnits")(__v.asInstanceOf[js.Any]))
      HrdBufferInitialFillPercentage.foreach(__v => __obj.updateDynamic("HrdBufferInitialFillPercentage")(__v.asInstanceOf[js.Any]))
      HrdBufferSize.foreach(__v => __obj.updateDynamic("HrdBufferSize")(__v.asInstanceOf[js.Any]))
      InterlaceMode.foreach(__v => __obj.updateDynamic("InterlaceMode")(__v.asInstanceOf[js.Any]))
      MaxBitrate.foreach(__v => __obj.updateDynamic("MaxBitrate")(__v.asInstanceOf[js.Any]))
      MinIInterval.foreach(__v => __obj.updateDynamic("MinIInterval")(__v.asInstanceOf[js.Any]))
      NumberBFramesBetweenReferenceFrames.foreach(__v => __obj.updateDynamic("NumberBFramesBetweenReferenceFrames")(__v.asInstanceOf[js.Any]))
      NumberReferenceFrames.foreach(__v => __obj.updateDynamic("NumberReferenceFrames")(__v.asInstanceOf[js.Any]))
      ParControl.foreach(__v => __obj.updateDynamic("ParControl")(__v.asInstanceOf[js.Any]))
      ParDenominator.foreach(__v => __obj.updateDynamic("ParDenominator")(__v.asInstanceOf[js.Any]))
      ParNumerator.foreach(__v => __obj.updateDynamic("ParNumerator")(__v.asInstanceOf[js.Any]))
      QualityTuningLevel.foreach(__v => __obj.updateDynamic("QualityTuningLevel")(__v.asInstanceOf[js.Any]))
      QvbrSettings.foreach(__v => __obj.updateDynamic("QvbrSettings")(__v.asInstanceOf[js.Any]))
      RateControlMode.foreach(__v => __obj.updateDynamic("RateControlMode")(__v.asInstanceOf[js.Any]))
      SampleAdaptiveOffsetFilterMode.foreach(__v => __obj.updateDynamic("SampleAdaptiveOffsetFilterMode")(__v.asInstanceOf[js.Any]))
      SceneChangeDetect.foreach(__v => __obj.updateDynamic("SceneChangeDetect")(__v.asInstanceOf[js.Any]))
      Slices.foreach(__v => __obj.updateDynamic("Slices")(__v.asInstanceOf[js.Any]))
      SlowPal.foreach(__v => __obj.updateDynamic("SlowPal")(__v.asInstanceOf[js.Any]))
      SpatialAdaptiveQuantization.foreach(__v => __obj.updateDynamic("SpatialAdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      Telecine.foreach(__v => __obj.updateDynamic("Telecine")(__v.asInstanceOf[js.Any]))
      TemporalAdaptiveQuantization.foreach(__v => __obj.updateDynamic("TemporalAdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      TemporalIds.foreach(__v => __obj.updateDynamic("TemporalIds")(__v.asInstanceOf[js.Any]))
      Tiles.foreach(__v => __obj.updateDynamic("Tiles")(__v.asInstanceOf[js.Any]))
      UnregisteredSeiTimecode.foreach(__v => __obj.updateDynamic("UnregisteredSeiTimecode")(__v.asInstanceOf[js.Any]))
      WriteMp4PackagingType.foreach(__v => __obj.updateDynamic("WriteMp4PackagingType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[H265Settings]
    }
  }

  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  @js.native
  sealed trait H265SlowPal extends js.Any
  object H265SlowPal {
    val DISABLED = "DISABLED".asInstanceOf[H265SlowPal]
    val ENABLED = "ENABLED".asInstanceOf[H265SlowPal]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Adjust quantization within each frame based on spatial variation of content complexity.
    */
  @js.native
  sealed trait H265SpatialAdaptiveQuantization extends js.Any
  object H265SpatialAdaptiveQuantization {
    val DISABLED = "DISABLED".asInstanceOf[H265SpatialAdaptiveQuantization]
    val ENABLED = "ENABLED".asInstanceOf[H265SpatialAdaptiveQuantization]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * This field applies only if the Streams > Advanced > Framerate (framerate) field  is set to 29.970. This field works with the Streams > Advanced > Preprocessors > Deinterlacer  field (deinterlace_mode) and the Streams > Advanced > Interlaced Mode field (interlace_mode)  to identify the scan type for the output: Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces 23.976; the player converts this output to 29.97i.
    */
  @js.native
  sealed trait H265Telecine extends js.Any
  object H265Telecine {
    val NONE = "NONE".asInstanceOf[H265Telecine]
    val SOFT = "SOFT".asInstanceOf[H265Telecine]
    val HARD = "HARD".asInstanceOf[H265Telecine]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NONE, SOFT, HARD))
  }

  /**
    * Adjust quantization within each frame based on temporal variation of content complexity.
    */
  @js.native
  sealed trait H265TemporalAdaptiveQuantization extends js.Any
  object H265TemporalAdaptiveQuantization {
    val DISABLED = "DISABLED".asInstanceOf[H265TemporalAdaptiveQuantization]
    val ENABLED = "ENABLED".asInstanceOf[H265TemporalAdaptiveQuantization]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Enables temporal layer identifiers in the encoded bitstream. Up to 3 layers are supported depending on GOP structure: I- and P-frames form one layer, reference B-frames can form a second layer and non-reference b-frames can form a third layer. Decoders can optionally decode only the lower temporal layers to generate a lower frame rate output. For example, given a bitstream with temporal IDs and with b-frames = 1 (i.e. IbPbPb display order), a decoder could decode all the frames for full frame rate output or only the I and P frames (lowest temporal layer) for a half frame rate output.
    */
  @js.native
  sealed trait H265TemporalIds extends js.Any
  object H265TemporalIds {
    val DISABLED = "DISABLED".asInstanceOf[H265TemporalIds]
    val ENABLED = "ENABLED".asInstanceOf[H265TemporalIds]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Enable use of tiles, allowing horizontal as well as vertical subdivision of the encoded pictures.
    */
  @js.native
  sealed trait H265Tiles extends js.Any
  object H265Tiles {
    val DISABLED = "DISABLED".asInstanceOf[H265Tiles]
    val ENABLED = "ENABLED".asInstanceOf[H265Tiles]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
    */
  @js.native
  sealed trait H265UnregisteredSeiTimecode extends js.Any
  object H265UnregisteredSeiTimecode {
    val DISABLED = "DISABLED".asInstanceOf[H265UnregisteredSeiTimecode]
    val ENABLED = "ENABLED".asInstanceOf[H265UnregisteredSeiTimecode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * If the location of parameter set NAL units doesn't matter in your workflow, ignore this setting. Use this setting only with CMAF or DASH outputs, or with standalone file outputs in an MPEG-4 container (MP4 outputs). Choose HVC1 to mark your output as HVC1. This makes your output compliant with the following specification: ISO IECJTC1 SC29 N13798 Text ISO/IEC FDIS 14496-15 3rd Edition. For these outputs, the service stores parameter set NAL units in the sample headers but not in the samples directly. For MP4 outputs, when you choose HVC1, your output video might not work properly with some downstream systems and video players. The service defaults to marking your output as HEV1. For these outputs, the service writes parameter set NAL units directly into the samples.
    */
  @js.native
  sealed trait H265WriteMp4PackagingType extends js.Any
  object H265WriteMp4PackagingType {
    val HVC1 = "HVC1".asInstanceOf[H265WriteMp4PackagingType]
    val HEV1 = "HEV1".asInstanceOf[H265WriteMp4PackagingType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(HVC1, HEV1))
  }

  /**
    * Use these settings to specify static color calibration metadata, as defined by SMPTE ST 2086. These values don't affect the pixel values that are encoded in the video stream. They are intended to help the downstream video player display content in a way that reflects the intentions of the the content creator.
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
    @inline
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
        WhitePointY: js.UndefOr[__integerMin0Max50000] = js.undefined
    ): Hdr10Metadata = {
      val __obj = js.Dynamic.literal()
      BluePrimaryX.foreach(__v => __obj.updateDynamic("BluePrimaryX")(__v.asInstanceOf[js.Any]))
      BluePrimaryY.foreach(__v => __obj.updateDynamic("BluePrimaryY")(__v.asInstanceOf[js.Any]))
      GreenPrimaryX.foreach(__v => __obj.updateDynamic("GreenPrimaryX")(__v.asInstanceOf[js.Any]))
      GreenPrimaryY.foreach(__v => __obj.updateDynamic("GreenPrimaryY")(__v.asInstanceOf[js.Any]))
      MaxContentLightLevel.foreach(__v => __obj.updateDynamic("MaxContentLightLevel")(__v.asInstanceOf[js.Any]))
      MaxFrameAverageLightLevel.foreach(__v => __obj.updateDynamic("MaxFrameAverageLightLevel")(__v.asInstanceOf[js.Any]))
      MaxLuminance.foreach(__v => __obj.updateDynamic("MaxLuminance")(__v.asInstanceOf[js.Any]))
      MinLuminance.foreach(__v => __obj.updateDynamic("MinLuminance")(__v.asInstanceOf[js.Any]))
      RedPrimaryX.foreach(__v => __obj.updateDynamic("RedPrimaryX")(__v.asInstanceOf[js.Any]))
      RedPrimaryY.foreach(__v => __obj.updateDynamic("RedPrimaryY")(__v.asInstanceOf[js.Any]))
      WhitePointX.foreach(__v => __obj.updateDynamic("WhitePointX")(__v.asInstanceOf[js.Any]))
      WhitePointY.foreach(__v => __obj.updateDynamic("WhitePointY")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Hdr10Metadata]
    }
  }

  @js.native
  sealed trait HlsAdMarkers extends js.Any
  object HlsAdMarkers {
    val ELEMENTAL = "ELEMENTAL".asInstanceOf[HlsAdMarkers]
    val ELEMENTAL_SCTE35 = "ELEMENTAL_SCTE35".asInstanceOf[HlsAdMarkers]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ELEMENTAL, ELEMENTAL_SCTE35))
  }

  /**
    * Specify the details for each additional HLS manifest that you want the service to generate for this output group. Each manifest can reference a different subset of outputs in the group.
    */
  @js.native
  trait HlsAdditionalManifest extends js.Object {
    var ManifestNameModifier: js.UndefOr[__stringMin1]
    var SelectedOutputs: js.UndefOr[__listOf__stringMin1]
  }

  object HlsAdditionalManifest {
    @inline
    def apply(
        ManifestNameModifier: js.UndefOr[__stringMin1] = js.undefined,
        SelectedOutputs: js.UndefOr[__listOf__stringMin1] = js.undefined
    ): HlsAdditionalManifest = {
      val __obj = js.Dynamic.literal()
      ManifestNameModifier.foreach(__v => __obj.updateDynamic("ManifestNameModifier")(__v.asInstanceOf[js.Any]))
      SelectedOutputs.foreach(__v => __obj.updateDynamic("SelectedOutputs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsAdditionalManifest]
    }
  }

  /**
    * Use this setting only in audio-only outputs. Choose MPEG-2 Transport Stream (M2TS) to create a file in an MPEG2-TS container. Keep the default value Automatic (AUTOMATIC) to create a raw audio-only file with no container. Regardless of the value that you specify here, if this output has video, the service will place outputs into an MPEG2-TS container.
    */
  @js.native
  sealed trait HlsAudioOnlyContainer extends js.Any
  object HlsAudioOnlyContainer {
    val AUTOMATIC = "AUTOMATIC".asInstanceOf[HlsAudioOnlyContainer]
    val M2TS = "M2TS".asInstanceOf[HlsAudioOnlyContainer]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(AUTOMATIC, M2TS))
  }

  /**
    * Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this audio-only stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest. Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
    */
  @js.native
  sealed trait HlsAudioTrackType extends js.Any
  object HlsAudioTrackType {
    val ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT = "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT".asInstanceOf[HlsAudioTrackType]
    val ALTERNATE_AUDIO_AUTO_SELECT = "ALTERNATE_AUDIO_AUTO_SELECT".asInstanceOf[HlsAudioTrackType]
    val ALTERNATE_AUDIO_NOT_AUTO_SELECT = "ALTERNATE_AUDIO_NOT_AUTO_SELECT".asInstanceOf[HlsAudioTrackType]
    val AUDIO_ONLY_VARIANT_STREAM = "AUDIO_ONLY_VARIANT_STREAM".asInstanceOf[HlsAudioTrackType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT, ALTERNATE_AUDIO_AUTO_SELECT, ALTERNATE_AUDIO_NOT_AUTO_SELECT, AUDIO_ONLY_VARIANT_STREAM))
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
    @inline
    def apply(
        CaptionChannel: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        LanguageDescription: js.UndefOr[__string] = js.undefined
    ): HlsCaptionLanguageMapping = {
      val __obj = js.Dynamic.literal()
      CaptionChannel.foreach(__v => __obj.updateDynamic("CaptionChannel")(__v.asInstanceOf[js.Any]))
      CustomLanguageCode.foreach(__v => __obj.updateDynamic("CustomLanguageCode")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LanguageDescription.foreach(__v => __obj.updateDynamic("LanguageDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsCaptionLanguageMapping]
    }
  }

  /**
    * Applies only to 608 Embedded output captions. Insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you specify. Make sure to specify the languages in the order in which they appear in the original source (if the source is embedded format) or the order of the caption selectors (if the source is other than embedded). Otherwise, languages in the manifest will not match up properly with the output captions. None: Include CLOSED-CAPTIONS=NONE line in the manifest. Omit: Omit any CLOSED-CAPTIONS line from the manifest.
    */
  @js.native
  sealed trait HlsCaptionLanguageSetting extends js.Any
  object HlsCaptionLanguageSetting {
    val INSERT = "INSERT".asInstanceOf[HlsCaptionLanguageSetting]
    val OMIT = "OMIT".asInstanceOf[HlsCaptionLanguageSetting]
    val NONE = "NONE".asInstanceOf[HlsCaptionLanguageSetting]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INSERT, OMIT, NONE))
  }

  /**
    * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for later replay.
    */
  @js.native
  sealed trait HlsClientCache extends js.Any
  object HlsClientCache {
    val DISABLED = "DISABLED".asInstanceOf[HlsClientCache]
    val ENABLED = "ENABLED".asInstanceOf[HlsClientCache]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
    */
  @js.native
  sealed trait HlsCodecSpecification extends js.Any
  object HlsCodecSpecification {
    val RFC_6381 = "RFC_6381".asInstanceOf[HlsCodecSpecification]
    val RFC_4281 = "RFC_4281".asInstanceOf[HlsCodecSpecification]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(RFC_6381, RFC_4281))
  }

  /**
    * Indicates whether segments should be placed in subdirectories.
    */
  @js.native
  sealed trait HlsDirectoryStructure extends js.Any
  object HlsDirectoryStructure {
    val SINGLE_DIRECTORY = "SINGLE_DIRECTORY".asInstanceOf[HlsDirectoryStructure]
    val SUBDIRECTORY_PER_STREAM = "SUBDIRECTORY_PER_STREAM".asInstanceOf[HlsDirectoryStructure]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM))
  }

  /**
    * Settings for HLS encryption
    */
  @js.native
  trait HlsEncryptionSettings extends js.Object {
    var ConstantInitializationVector: js.UndefOr[__stringMin32Max32Pattern09aFAF32]
    var EncryptionMethod: js.UndefOr[HlsEncryptionType]
    var InitializationVectorInManifest: js.UndefOr[HlsInitializationVectorInManifest]
    var OfflineEncrypted: js.UndefOr[HlsOfflineEncrypted]
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProvider]
    var StaticKeyProvider: js.UndefOr[StaticKeyProvider]
    var Type: js.UndefOr[HlsKeyProviderType]
  }

  object HlsEncryptionSettings {
    @inline
    def apply(
        ConstantInitializationVector: js.UndefOr[__stringMin32Max32Pattern09aFAF32] = js.undefined,
        EncryptionMethod: js.UndefOr[HlsEncryptionType] = js.undefined,
        InitializationVectorInManifest: js.UndefOr[HlsInitializationVectorInManifest] = js.undefined,
        OfflineEncrypted: js.UndefOr[HlsOfflineEncrypted] = js.undefined,
        SpekeKeyProvider: js.UndefOr[SpekeKeyProvider] = js.undefined,
        StaticKeyProvider: js.UndefOr[StaticKeyProvider] = js.undefined,
        Type: js.UndefOr[HlsKeyProviderType] = js.undefined
    ): HlsEncryptionSettings = {
      val __obj = js.Dynamic.literal()
      ConstantInitializationVector.foreach(__v => __obj.updateDynamic("ConstantInitializationVector")(__v.asInstanceOf[js.Any]))
      EncryptionMethod.foreach(__v => __obj.updateDynamic("EncryptionMethod")(__v.asInstanceOf[js.Any]))
      InitializationVectorInManifest.foreach(__v => __obj.updateDynamic("InitializationVectorInManifest")(__v.asInstanceOf[js.Any]))
      OfflineEncrypted.foreach(__v => __obj.updateDynamic("OfflineEncrypted")(__v.asInstanceOf[js.Any]))
      SpekeKeyProvider.foreach(__v => __obj.updateDynamic("SpekeKeyProvider")(__v.asInstanceOf[js.Any]))
      StaticKeyProvider.foreach(__v => __obj.updateDynamic("StaticKeyProvider")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsEncryptionSettings]
    }
  }

  /**
    * Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in the web interface also disables encryption.
    */
  @js.native
  sealed trait HlsEncryptionType extends js.Any
  object HlsEncryptionType {
    val AES128 = "AES128".asInstanceOf[HlsEncryptionType]
    val SAMPLE_AES = "SAMPLE_AES".asInstanceOf[HlsEncryptionType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(AES128, SAMPLE_AES))
  }

  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to HLS_GROUP_SETTINGS.
    */
  @js.native
  trait HlsGroupSettings extends js.Object {
    var AdMarkers: js.UndefOr[__listOfHlsAdMarkers]
    var AdditionalManifests: js.UndefOr[__listOfHlsAdditionalManifest]
    var BaseUrl: js.UndefOr[__string]
    var CaptionLanguageMappings: js.UndefOr[__listOfHlsCaptionLanguageMapping]
    var CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting]
    var ClientCache: js.UndefOr[HlsClientCache]
    var CodecSpecification: js.UndefOr[HlsCodecSpecification]
    var Destination: js.UndefOr[__stringPatternS3]
    var DestinationSettings: js.UndefOr[DestinationSettings]
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
    @inline
    def apply(
        AdMarkers: js.UndefOr[__listOfHlsAdMarkers] = js.undefined,
        AdditionalManifests: js.UndefOr[__listOfHlsAdditionalManifest] = js.undefined,
        BaseUrl: js.UndefOr[__string] = js.undefined,
        CaptionLanguageMappings: js.UndefOr[__listOfHlsCaptionLanguageMapping] = js.undefined,
        CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting] = js.undefined,
        ClientCache: js.UndefOr[HlsClientCache] = js.undefined,
        CodecSpecification: js.UndefOr[HlsCodecSpecification] = js.undefined,
        Destination: js.UndefOr[__stringPatternS3] = js.undefined,
        DestinationSettings: js.UndefOr[DestinationSettings] = js.undefined,
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
        TimestampDeltaMilliseconds: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
    ): HlsGroupSettings = {
      val __obj = js.Dynamic.literal()
      AdMarkers.foreach(__v => __obj.updateDynamic("AdMarkers")(__v.asInstanceOf[js.Any]))
      AdditionalManifests.foreach(__v => __obj.updateDynamic("AdditionalManifests")(__v.asInstanceOf[js.Any]))
      BaseUrl.foreach(__v => __obj.updateDynamic("BaseUrl")(__v.asInstanceOf[js.Any]))
      CaptionLanguageMappings.foreach(__v => __obj.updateDynamic("CaptionLanguageMappings")(__v.asInstanceOf[js.Any]))
      CaptionLanguageSetting.foreach(__v => __obj.updateDynamic("CaptionLanguageSetting")(__v.asInstanceOf[js.Any]))
      ClientCache.foreach(__v => __obj.updateDynamic("ClientCache")(__v.asInstanceOf[js.Any]))
      CodecSpecification.foreach(__v => __obj.updateDynamic("CodecSpecification")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      DestinationSettings.foreach(__v => __obj.updateDynamic("DestinationSettings")(__v.asInstanceOf[js.Any]))
      DirectoryStructure.foreach(__v => __obj.updateDynamic("DirectoryStructure")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      ManifestCompression.foreach(__v => __obj.updateDynamic("ManifestCompression")(__v.asInstanceOf[js.Any]))
      ManifestDurationFormat.foreach(__v => __obj.updateDynamic("ManifestDurationFormat")(__v.asInstanceOf[js.Any]))
      MinFinalSegmentLength.foreach(__v => __obj.updateDynamic("MinFinalSegmentLength")(__v.asInstanceOf[js.Any]))
      MinSegmentLength.foreach(__v => __obj.updateDynamic("MinSegmentLength")(__v.asInstanceOf[js.Any]))
      OutputSelection.foreach(__v => __obj.updateDynamic("OutputSelection")(__v.asInstanceOf[js.Any]))
      ProgramDateTime.foreach(__v => __obj.updateDynamic("ProgramDateTime")(__v.asInstanceOf[js.Any]))
      ProgramDateTimePeriod.foreach(__v => __obj.updateDynamic("ProgramDateTimePeriod")(__v.asInstanceOf[js.Any]))
      SegmentControl.foreach(__v => __obj.updateDynamic("SegmentControl")(__v.asInstanceOf[js.Any]))
      SegmentLength.foreach(__v => __obj.updateDynamic("SegmentLength")(__v.asInstanceOf[js.Any]))
      SegmentsPerSubdirectory.foreach(__v => __obj.updateDynamic("SegmentsPerSubdirectory")(__v.asInstanceOf[js.Any]))
      StreamInfResolution.foreach(__v => __obj.updateDynamic("StreamInfResolution")(__v.asInstanceOf[js.Any]))
      TimedMetadataId3Frame.foreach(__v => __obj.updateDynamic("TimedMetadataId3Frame")(__v.asInstanceOf[js.Any]))
      TimedMetadataId3Period.foreach(__v => __obj.updateDynamic("TimedMetadataId3Period")(__v.asInstanceOf[js.Any]))
      TimestampDeltaMilliseconds.foreach(__v => __obj.updateDynamic("TimestampDeltaMilliseconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsGroupSettings]
    }
  }

  /**
    * When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS manifest
    */
  @js.native
  sealed trait HlsIFrameOnlyManifest extends js.Any
  object HlsIFrameOnlyManifest {
    val INCLUDE = "INCLUDE".asInstanceOf[HlsIFrameOnlyManifest]
    val EXCLUDE = "EXCLUDE".asInstanceOf[HlsIFrameOnlyManifest]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If set to INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not in the manifest.
    */
  @js.native
  sealed trait HlsInitializationVectorInManifest extends js.Any
  object HlsInitializationVectorInManifest {
    val INCLUDE = "INCLUDE".asInstanceOf[HlsInitializationVectorInManifest]
    val EXCLUDE = "EXCLUDE".asInstanceOf[HlsInitializationVectorInManifest]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
    */
  @js.native
  sealed trait HlsKeyProviderType extends js.Any
  object HlsKeyProviderType {
    val SPEKE = "SPEKE".asInstanceOf[HlsKeyProviderType]
    val STATIC_KEY = "STATIC_KEY".asInstanceOf[HlsKeyProviderType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(SPEKE, STATIC_KEY))
  }

  /**
    * When set to GZIP, compresses HLS playlist.
    */
  @js.native
  sealed trait HlsManifestCompression extends js.Any
  object HlsManifestCompression {
    val GZIP = "GZIP".asInstanceOf[HlsManifestCompression]
    val NONE = "NONE".asInstanceOf[HlsManifestCompression]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(GZIP, NONE))
  }

  /**
    * Indicates whether the output manifest should use floating point values for segment duration.
    */
  @js.native
  sealed trait HlsManifestDurationFormat extends js.Any
  object HlsManifestDurationFormat {
    val FLOATING_POINT = "FLOATING_POINT".asInstanceOf[HlsManifestDurationFormat]
    val INTEGER = "INTEGER".asInstanceOf[HlsManifestDurationFormat]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(FLOATING_POINT, INTEGER))
  }

  /**
    * Enable this setting to insert the EXT-X-SESSION-KEY element into the master playlist. This allows for offline Apple HLS FairPlay content protection.
    */
  @js.native
  sealed trait HlsOfflineEncrypted extends js.Any
  object HlsOfflineEncrypted {
    val ENABLED = "ENABLED".asInstanceOf[HlsOfflineEncrypted]
    val DISABLED = "DISABLED".asInstanceOf[HlsOfflineEncrypted]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Indicates whether the .m3u8 manifest file should be generated for this HLS output group.
    */
  @js.native
  sealed trait HlsOutputSelection extends js.Any
  object HlsOutputSelection {
    val MANIFESTS_AND_SEGMENTS = "MANIFESTS_AND_SEGMENTS".asInstanceOf[HlsOutputSelection]
    val SEGMENTS_ONLY = "SEGMENTS_ONLY".asInstanceOf[HlsOutputSelection]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY))
  }

  /**
    * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as follows: either the program date and time are initialized using the input timecode source, or the time is initialized using the input timecode source and the date is initialized using the timestamp_offset.
    */
  @js.native
  sealed trait HlsProgramDateTime extends js.Any
  object HlsProgramDateTime {
    val INCLUDE = "INCLUDE".asInstanceOf[HlsProgramDateTime]
    val EXCLUDE = "EXCLUDE".asInstanceOf[HlsProgramDateTime]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * When set to SINGLE_FILE, emits program as a single media resource (.ts) file, uses #EXT-X-BYTERANGE tags to index segment for playback.
    */
  @js.native
  sealed trait HlsSegmentControl extends js.Any
  object HlsSegmentControl {
    val SINGLE_FILE = "SINGLE_FILE".asInstanceOf[HlsSegmentControl]
    val SEGMENTED_FILES = "SEGMENTED_FILES".asInstanceOf[HlsSegmentControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(SINGLE_FILE, SEGMENTED_FILES))
  }

  /**
    * Settings for HLS output groups
    */
  @js.native
  trait HlsSettings extends js.Object {
    var AudioGroupId: js.UndefOr[__string]
    var AudioOnlyContainer: js.UndefOr[HlsAudioOnlyContainer]
    var AudioRenditionSets: js.UndefOr[__string]
    var AudioTrackType: js.UndefOr[HlsAudioTrackType]
    var IFrameOnlyManifest: js.UndefOr[HlsIFrameOnlyManifest]
    var SegmentModifier: js.UndefOr[__string]
  }

  object HlsSettings {
    @inline
    def apply(
        AudioGroupId: js.UndefOr[__string] = js.undefined,
        AudioOnlyContainer: js.UndefOr[HlsAudioOnlyContainer] = js.undefined,
        AudioRenditionSets: js.UndefOr[__string] = js.undefined,
        AudioTrackType: js.UndefOr[HlsAudioTrackType] = js.undefined,
        IFrameOnlyManifest: js.UndefOr[HlsIFrameOnlyManifest] = js.undefined,
        SegmentModifier: js.UndefOr[__string] = js.undefined
    ): HlsSettings = {
      val __obj = js.Dynamic.literal()
      AudioGroupId.foreach(__v => __obj.updateDynamic("AudioGroupId")(__v.asInstanceOf[js.Any]))
      AudioOnlyContainer.foreach(__v => __obj.updateDynamic("AudioOnlyContainer")(__v.asInstanceOf[js.Any]))
      AudioRenditionSets.foreach(__v => __obj.updateDynamic("AudioRenditionSets")(__v.asInstanceOf[js.Any]))
      AudioTrackType.foreach(__v => __obj.updateDynamic("AudioTrackType")(__v.asInstanceOf[js.Any]))
      IFrameOnlyManifest.foreach(__v => __obj.updateDynamic("IFrameOnlyManifest")(__v.asInstanceOf[js.Any]))
      SegmentModifier.foreach(__v => __obj.updateDynamic("SegmentModifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsSettings]
    }
  }

  /**
    * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
    */
  @js.native
  sealed trait HlsStreamInfResolution extends js.Any
  object HlsStreamInfResolution {
    val INCLUDE = "INCLUDE".asInstanceOf[HlsStreamInfResolution]
    val EXCLUDE = "EXCLUDE".asInstanceOf[HlsStreamInfResolution]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * Indicates ID3 frame that has the timecode.
    */
  @js.native
  sealed trait HlsTimedMetadataId3Frame extends js.Any
  object HlsTimedMetadataId3Frame {
    val NONE = "NONE".asInstanceOf[HlsTimedMetadataId3Frame]
    val PRIV = "PRIV".asInstanceOf[HlsTimedMetadataId3Frame]
    val TDRL = "TDRL".asInstanceOf[HlsTimedMetadataId3Frame]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NONE, PRIV, TDRL))
  }

  /**
    * Optional. Configuration for a destination queue to which the job can hop once a customer-defined minimum wait time has passed.
    */
  @js.native
  trait HopDestination extends js.Object {
    var Priority: js.UndefOr[__integerMinNegative50Max50]
    var Queue: js.UndefOr[__string]
    var WaitMinutes: js.UndefOr[__integer]
  }

  object HopDestination {
    @inline
    def apply(
        Priority: js.UndefOr[__integerMinNegative50Max50] = js.undefined,
        Queue: js.UndefOr[__string] = js.undefined,
        WaitMinutes: js.UndefOr[__integer] = js.undefined
    ): HopDestination = {
      val __obj = js.Dynamic.literal()
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      WaitMinutes.foreach(__v => __obj.updateDynamic("WaitMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HopDestination]
    }
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
    @inline
    def apply(
        Id3: js.UndefOr[__stringPatternAZaZ0902] = js.undefined,
        Timecode: js.UndefOr[__stringPattern010920405090509092] = js.undefined
    ): Id3Insertion = {
      val __obj = js.Dynamic.literal()
      Id3.foreach(__v => __obj.updateDynamic("Id3")(__v.asInstanceOf[js.Any]))
      Timecode.foreach(__v => __obj.updateDynamic("Timecode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Id3Insertion]
    }
  }

  /**
    * Enable the image inserter feature to include a graphic overlay on your video. Enable or disable this feature for each input or output individually. This setting is disabled by default.
    */
  @js.native
  trait ImageInserter extends js.Object {
    var InsertableImages: js.UndefOr[__listOfInsertableImage]
  }

  object ImageInserter {
    @inline
    def apply(
        InsertableImages: js.UndefOr[__listOfInsertableImage] = js.undefined
    ): ImageInserter = {
      val __obj = js.Dynamic.literal()
      InsertableImages.foreach(__v => __obj.updateDynamic("InsertableImages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageInserter]
    }
  }

  /**
    * Settings specific to IMSC caption outputs.
    */
  @js.native
  trait ImscDestinationSettings extends js.Object {
    var StylePassthrough: js.UndefOr[ImscStylePassthrough]
  }

  object ImscDestinationSettings {
    @inline
    def apply(
        StylePassthrough: js.UndefOr[ImscStylePassthrough] = js.undefined
    ): ImscDestinationSettings = {
      val __obj = js.Dynamic.literal()
      StylePassthrough.foreach(__v => __obj.updateDynamic("StylePassthrough")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImscDestinationSettings]
    }
  }

  /**
    * Keep this setting enabled to have MediaConvert use the font style and position information from the captions source in the output. This option is available only when your input captions are IMSC, SMPTE-TT, or TTML. Disable this setting for simplified output captions.
    */
  @js.native
  sealed trait ImscStylePassthrough extends js.Any
  object ImscStylePassthrough {
    val ENABLED = "ENABLED".asInstanceOf[ImscStylePassthrough]
    val DISABLED = "DISABLED".asInstanceOf[ImscStylePassthrough]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Specifies media input
    */
  @js.native
  trait Input extends js.Object {
    var AudioSelectorGroups: js.UndefOr[__mapOfAudioSelectorGroup]
    var AudioSelectors: js.UndefOr[__mapOfAudioSelector]
    var CaptionSelectors: js.UndefOr[__mapOfCaptionSelector]
    var Crop: js.UndefOr[Rectangle]
    var DeblockFilter: js.UndefOr[InputDeblockFilter]
    var DecryptionSettings: js.UndefOr[InputDecryptionSettings]
    var DenoiseFilter: js.UndefOr[InputDenoiseFilter]
    var FileInput: js.UndefOr[__stringPatternS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLLHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLL]
    var FilterEnable: js.UndefOr[InputFilterEnable]
    var FilterStrength: js.UndefOr[__integerMinNegative5Max5]
    var ImageInserter: js.UndefOr[ImageInserter]
    var InputClippings: js.UndefOr[__listOfInputClipping]
    var Position: js.UndefOr[Rectangle]
    var ProgramNumber: js.UndefOr[__integerMin1Max2147483647]
    var PsiControl: js.UndefOr[InputPsiControl]
    var SupplementalImps: js.UndefOr[__listOf__stringPatternS3ASSETMAPXml]
    var TimecodeSource: js.UndefOr[InputTimecodeSource]
    var TimecodeStart: js.UndefOr[__stringMin11Max11Pattern01D20305D205D]
    var VideoSelector: js.UndefOr[VideoSelector]
  }

  object Input {
    @inline
    def apply(
        AudioSelectorGroups: js.UndefOr[__mapOfAudioSelectorGroup] = js.undefined,
        AudioSelectors: js.UndefOr[__mapOfAudioSelector] = js.undefined,
        CaptionSelectors: js.UndefOr[__mapOfCaptionSelector] = js.undefined,
        Crop: js.UndefOr[Rectangle] = js.undefined,
        DeblockFilter: js.UndefOr[InputDeblockFilter] = js.undefined,
        DecryptionSettings: js.UndefOr[InputDecryptionSettings] = js.undefined,
        DenoiseFilter: js.UndefOr[InputDenoiseFilter] = js.undefined,
        FileInput: js.UndefOr[__stringPatternS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLLHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLL] = js.undefined,
        FilterEnable: js.UndefOr[InputFilterEnable] = js.undefined,
        FilterStrength: js.UndefOr[__integerMinNegative5Max5] = js.undefined,
        ImageInserter: js.UndefOr[ImageInserter] = js.undefined,
        InputClippings: js.UndefOr[__listOfInputClipping] = js.undefined,
        Position: js.UndefOr[Rectangle] = js.undefined,
        ProgramNumber: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        PsiControl: js.UndefOr[InputPsiControl] = js.undefined,
        SupplementalImps: js.UndefOr[__listOf__stringPatternS3ASSETMAPXml] = js.undefined,
        TimecodeSource: js.UndefOr[InputTimecodeSource] = js.undefined,
        TimecodeStart: js.UndefOr[__stringMin11Max11Pattern01D20305D205D] = js.undefined,
        VideoSelector: js.UndefOr[VideoSelector] = js.undefined
    ): Input = {
      val __obj = js.Dynamic.literal()
      AudioSelectorGroups.foreach(__v => __obj.updateDynamic("AudioSelectorGroups")(__v.asInstanceOf[js.Any]))
      AudioSelectors.foreach(__v => __obj.updateDynamic("AudioSelectors")(__v.asInstanceOf[js.Any]))
      CaptionSelectors.foreach(__v => __obj.updateDynamic("CaptionSelectors")(__v.asInstanceOf[js.Any]))
      Crop.foreach(__v => __obj.updateDynamic("Crop")(__v.asInstanceOf[js.Any]))
      DeblockFilter.foreach(__v => __obj.updateDynamic("DeblockFilter")(__v.asInstanceOf[js.Any]))
      DecryptionSettings.foreach(__v => __obj.updateDynamic("DecryptionSettings")(__v.asInstanceOf[js.Any]))
      DenoiseFilter.foreach(__v => __obj.updateDynamic("DenoiseFilter")(__v.asInstanceOf[js.Any]))
      FileInput.foreach(__v => __obj.updateDynamic("FileInput")(__v.asInstanceOf[js.Any]))
      FilterEnable.foreach(__v => __obj.updateDynamic("FilterEnable")(__v.asInstanceOf[js.Any]))
      FilterStrength.foreach(__v => __obj.updateDynamic("FilterStrength")(__v.asInstanceOf[js.Any]))
      ImageInserter.foreach(__v => __obj.updateDynamic("ImageInserter")(__v.asInstanceOf[js.Any]))
      InputClippings.foreach(__v => __obj.updateDynamic("InputClippings")(__v.asInstanceOf[js.Any]))
      Position.foreach(__v => __obj.updateDynamic("Position")(__v.asInstanceOf[js.Any]))
      ProgramNumber.foreach(__v => __obj.updateDynamic("ProgramNumber")(__v.asInstanceOf[js.Any]))
      PsiControl.foreach(__v => __obj.updateDynamic("PsiControl")(__v.asInstanceOf[js.Any]))
      SupplementalImps.foreach(__v => __obj.updateDynamic("SupplementalImps")(__v.asInstanceOf[js.Any]))
      TimecodeSource.foreach(__v => __obj.updateDynamic("TimecodeSource")(__v.asInstanceOf[js.Any]))
      TimecodeStart.foreach(__v => __obj.updateDynamic("TimecodeStart")(__v.asInstanceOf[js.Any]))
      VideoSelector.foreach(__v => __obj.updateDynamic("VideoSelector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Input]
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
    @inline
    def apply(
        EndTimecode: js.UndefOr[__stringPattern010920405090509092] = js.undefined,
        StartTimecode: js.UndefOr[__stringPattern010920405090509092] = js.undefined
    ): InputClipping = {
      val __obj = js.Dynamic.literal()
      EndTimecode.foreach(__v => __obj.updateDynamic("EndTimecode")(__v.asInstanceOf[js.Any]))
      StartTimecode.foreach(__v => __obj.updateDynamic("StartTimecode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputClipping]
    }
  }

  /**
    * Enable Deblock (InputDeblockFilter) to produce smoother motion in the output. Default is disabled. Only manually controllable for MPEG2 and uncompressed video inputs.
    */
  @js.native
  sealed trait InputDeblockFilter extends js.Any
  object InputDeblockFilter {
    val ENABLED = "ENABLED".asInstanceOf[InputDeblockFilter]
    val DISABLED = "DISABLED".asInstanceOf[InputDeblockFilter]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Settings for decrypting any input files that you encrypt before you upload them to Amazon S3. MediaConvert can decrypt files only when you use AWS Key Management Service (KMS) to encrypt the data key that you use to encrypt your content.
    */
  @js.native
  trait InputDecryptionSettings extends js.Object {
    var DecryptionMode: js.UndefOr[DecryptionMode]
    var EncryptedDecryptionKey: js.UndefOr[__stringMin24Max512PatternAZaZ0902]
    var InitializationVector: js.UndefOr[__stringMin16Max24PatternAZaZ0922AZaZ0916]
    var KmsKeyRegion: js.UndefOr[__stringMin9Max19PatternAZ26EastWestCentralNorthSouthEastWest1912]
  }

  object InputDecryptionSettings {
    @inline
    def apply(
        DecryptionMode: js.UndefOr[DecryptionMode] = js.undefined,
        EncryptedDecryptionKey: js.UndefOr[__stringMin24Max512PatternAZaZ0902] = js.undefined,
        InitializationVector: js.UndefOr[__stringMin16Max24PatternAZaZ0922AZaZ0916] = js.undefined,
        KmsKeyRegion: js.UndefOr[__stringMin9Max19PatternAZ26EastWestCentralNorthSouthEastWest1912] = js.undefined
    ): InputDecryptionSettings = {
      val __obj = js.Dynamic.literal()
      DecryptionMode.foreach(__v => __obj.updateDynamic("DecryptionMode")(__v.asInstanceOf[js.Any]))
      EncryptedDecryptionKey.foreach(__v => __obj.updateDynamic("EncryptedDecryptionKey")(__v.asInstanceOf[js.Any]))
      InitializationVector.foreach(__v => __obj.updateDynamic("InitializationVector")(__v.asInstanceOf[js.Any]))
      KmsKeyRegion.foreach(__v => __obj.updateDynamic("KmsKeyRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputDecryptionSettings]
    }
  }

  /**
    * Enable Denoise (InputDenoiseFilter) to filter noise from the input.  Default is disabled. Only applicable to MPEG2, H.264, H.265, and uncompressed video inputs.
    */
  @js.native
  sealed trait InputDenoiseFilter extends js.Any
  object InputDenoiseFilter {
    val ENABLED = "ENABLED".asInstanceOf[InputDenoiseFilter]
    val DISABLED = "DISABLED".asInstanceOf[InputDenoiseFilter]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Use Filter enable (InputFilterEnable) to specify how the transcoding service applies the denoise and deblock filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and Deblock (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering, depending on input type and quality. * Disable - The input is not filtered. This is true even if you use the API to enable them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The in put is filtered regardless of input type.
    */
  @js.native
  sealed trait InputFilterEnable extends js.Any
  object InputFilterEnable {
    val AUTO = "AUTO".asInstanceOf[InputFilterEnable]
    val DISABLE = "DISABLE".asInstanceOf[InputFilterEnable]
    val FORCE = "FORCE".asInstanceOf[InputFilterEnable]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(AUTO, DISABLE, FORCE))
  }

  /**
    * Set PSI control (InputPsiControl) for transport stream inputs to specify which data the demux process to scans. * Ignore PSI - Scan all PIDs for audio and video. * Use PSI - Scan only PSI data.
    */
  @js.native
  sealed trait InputPsiControl extends js.Any
  object InputPsiControl {
    val IGNORE_PSI = "IGNORE_PSI".asInstanceOf[InputPsiControl]
    val USE_PSI = "USE_PSI".asInstanceOf[InputPsiControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(IGNORE_PSI, USE_PSI))
  }

  /**
    * Use Rotate (InputRotate) to specify how the service rotates your video. You can choose automatic rotation or specify a rotation. You can specify a clockwise rotation of 0, 90, 180, or 270 degrees. If your input video container is .mov or .mp4 and your input has rotation metadata, you can choose Automatic to have the service rotate your video according to the rotation specified in the metadata. The rotation must be within one degree of 90, 180, or 270 degrees. If the rotation metadata specifies any other rotation, the service will default to no rotation. By default, the service does no rotation, even if your input video has rotation metadata. The service doesn't pass through rotation metadata.
    */
  @js.native
  sealed trait InputRotate extends js.Any
  object InputRotate {
    val DEGREE_0 = "DEGREE_0".asInstanceOf[InputRotate]
    val DEGREES_90 = "DEGREES_90".asInstanceOf[InputRotate]
    val DEGREES_180 = "DEGREES_180".asInstanceOf[InputRotate]
    val DEGREES_270 = "DEGREES_270".asInstanceOf[InputRotate]
    val AUTO = "AUTO".asInstanceOf[InputRotate]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DEGREE_0, DEGREES_90, DEGREES_180, DEGREES_270, AUTO))
  }

  /**
    * Specified video input in a template.
    */
  @js.native
  trait InputTemplate extends js.Object {
    var AudioSelectorGroups: js.UndefOr[__mapOfAudioSelectorGroup]
    var AudioSelectors: js.UndefOr[__mapOfAudioSelector]
    var CaptionSelectors: js.UndefOr[__mapOfCaptionSelector]
    var Crop: js.UndefOr[Rectangle]
    var DeblockFilter: js.UndefOr[InputDeblockFilter]
    var DenoiseFilter: js.UndefOr[InputDenoiseFilter]
    var FilterEnable: js.UndefOr[InputFilterEnable]
    var FilterStrength: js.UndefOr[__integerMinNegative5Max5]
    var ImageInserter: js.UndefOr[ImageInserter]
    var InputClippings: js.UndefOr[__listOfInputClipping]
    var Position: js.UndefOr[Rectangle]
    var ProgramNumber: js.UndefOr[__integerMin1Max2147483647]
    var PsiControl: js.UndefOr[InputPsiControl]
    var TimecodeSource: js.UndefOr[InputTimecodeSource]
    var TimecodeStart: js.UndefOr[__stringMin11Max11Pattern01D20305D205D]
    var VideoSelector: js.UndefOr[VideoSelector]
  }

  object InputTemplate {
    @inline
    def apply(
        AudioSelectorGroups: js.UndefOr[__mapOfAudioSelectorGroup] = js.undefined,
        AudioSelectors: js.UndefOr[__mapOfAudioSelector] = js.undefined,
        CaptionSelectors: js.UndefOr[__mapOfCaptionSelector] = js.undefined,
        Crop: js.UndefOr[Rectangle] = js.undefined,
        DeblockFilter: js.UndefOr[InputDeblockFilter] = js.undefined,
        DenoiseFilter: js.UndefOr[InputDenoiseFilter] = js.undefined,
        FilterEnable: js.UndefOr[InputFilterEnable] = js.undefined,
        FilterStrength: js.UndefOr[__integerMinNegative5Max5] = js.undefined,
        ImageInserter: js.UndefOr[ImageInserter] = js.undefined,
        InputClippings: js.UndefOr[__listOfInputClipping] = js.undefined,
        Position: js.UndefOr[Rectangle] = js.undefined,
        ProgramNumber: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        PsiControl: js.UndefOr[InputPsiControl] = js.undefined,
        TimecodeSource: js.UndefOr[InputTimecodeSource] = js.undefined,
        TimecodeStart: js.UndefOr[__stringMin11Max11Pattern01D20305D205D] = js.undefined,
        VideoSelector: js.UndefOr[VideoSelector] = js.undefined
    ): InputTemplate = {
      val __obj = js.Dynamic.literal()
      AudioSelectorGroups.foreach(__v => __obj.updateDynamic("AudioSelectorGroups")(__v.asInstanceOf[js.Any]))
      AudioSelectors.foreach(__v => __obj.updateDynamic("AudioSelectors")(__v.asInstanceOf[js.Any]))
      CaptionSelectors.foreach(__v => __obj.updateDynamic("CaptionSelectors")(__v.asInstanceOf[js.Any]))
      Crop.foreach(__v => __obj.updateDynamic("Crop")(__v.asInstanceOf[js.Any]))
      DeblockFilter.foreach(__v => __obj.updateDynamic("DeblockFilter")(__v.asInstanceOf[js.Any]))
      DenoiseFilter.foreach(__v => __obj.updateDynamic("DenoiseFilter")(__v.asInstanceOf[js.Any]))
      FilterEnable.foreach(__v => __obj.updateDynamic("FilterEnable")(__v.asInstanceOf[js.Any]))
      FilterStrength.foreach(__v => __obj.updateDynamic("FilterStrength")(__v.asInstanceOf[js.Any]))
      ImageInserter.foreach(__v => __obj.updateDynamic("ImageInserter")(__v.asInstanceOf[js.Any]))
      InputClippings.foreach(__v => __obj.updateDynamic("InputClippings")(__v.asInstanceOf[js.Any]))
      Position.foreach(__v => __obj.updateDynamic("Position")(__v.asInstanceOf[js.Any]))
      ProgramNumber.foreach(__v => __obj.updateDynamic("ProgramNumber")(__v.asInstanceOf[js.Any]))
      PsiControl.foreach(__v => __obj.updateDynamic("PsiControl")(__v.asInstanceOf[js.Any]))
      TimecodeSource.foreach(__v => __obj.updateDynamic("TimecodeSource")(__v.asInstanceOf[js.Any]))
      TimecodeStart.foreach(__v => __obj.updateDynamic("TimecodeStart")(__v.asInstanceOf[js.Any]))
      VideoSelector.foreach(__v => __obj.updateDynamic("VideoSelector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputTemplate]
    }
  }

  /**
    * Use this Timecode source setting, located under the input settings (InputTimecodeSource), to specify how the service counts input video frames. This input frame count affects only the behavior of features that apply to a single input at a time, such as input clipping and synchronizing some captions formats. Choose Embedded (EMBEDDED) to use the timecodes in your input video. Choose Start at zero (ZEROBASED) to start the first frame at zero. Choose Specified start (SPECIFIEDSTART) to start the first frame at the timecode that you specify in the setting Start timecode (timecodeStart). If you don't specify a value for Timecode source, the service will use Embedded by default. For more information about timecodes, see https://docs.aws.amazon.com/console/mediaconvert/timecode.
    */
  @js.native
  sealed trait InputTimecodeSource extends js.Any
  object InputTimecodeSource {
    val EMBEDDED = "EMBEDDED".asInstanceOf[InputTimecodeSource]
    val ZEROBASED = "ZEROBASED".asInstanceOf[InputTimecodeSource]
    val SPECIFIEDSTART = "SPECIFIEDSTART".asInstanceOf[InputTimecodeSource]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(EMBEDDED, ZEROBASED, SPECIFIEDSTART))
  }

  /**
    * Settings that specify how your still graphic overlay appears.
    */
  @js.native
  trait InsertableImage extends js.Object {
    var Duration: js.UndefOr[__integerMin0Max2147483647]
    var FadeIn: js.UndefOr[__integerMin0Max2147483647]
    var FadeOut: js.UndefOr[__integerMin0Max2147483647]
    var Height: js.UndefOr[__integerMin0Max2147483647]
    var ImageInserterInput: js.UndefOr[__stringMin14PatternS3BmpBMPPngPNGTgaTGAHttpsBmpBMPPngPNGTgaTGA]
    var ImageX: js.UndefOr[__integerMin0Max2147483647]
    var ImageY: js.UndefOr[__integerMin0Max2147483647]
    var Layer: js.UndefOr[__integerMin0Max99]
    var Opacity: js.UndefOr[__integerMin0Max100]
    var StartTime: js.UndefOr[__stringPattern01D20305D205D]
    var Width: js.UndefOr[__integerMin0Max2147483647]
  }

  object InsertableImage {
    @inline
    def apply(
        Duration: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        FadeIn: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        FadeOut: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        Height: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        ImageInserterInput: js.UndefOr[__stringMin14PatternS3BmpBMPPngPNGTgaTGAHttpsBmpBMPPngPNGTgaTGA] = js.undefined,
        ImageX: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        ImageY: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        Layer: js.UndefOr[__integerMin0Max99] = js.undefined,
        Opacity: js.UndefOr[__integerMin0Max100] = js.undefined,
        StartTime: js.UndefOr[__stringPattern01D20305D205D] = js.undefined,
        Width: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    ): InsertableImage = {
      val __obj = js.Dynamic.literal()
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      FadeIn.foreach(__v => __obj.updateDynamic("FadeIn")(__v.asInstanceOf[js.Any]))
      FadeOut.foreach(__v => __obj.updateDynamic("FadeOut")(__v.asInstanceOf[js.Any]))
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      ImageInserterInput.foreach(__v => __obj.updateDynamic("ImageInserterInput")(__v.asInstanceOf[js.Any]))
      ImageX.foreach(__v => __obj.updateDynamic("ImageX")(__v.asInstanceOf[js.Any]))
      ImageY.foreach(__v => __obj.updateDynamic("ImageY")(__v.asInstanceOf[js.Any]))
      Layer.foreach(__v => __obj.updateDynamic("Layer")(__v.asInstanceOf[js.Any]))
      Opacity.foreach(__v => __obj.updateDynamic("Opacity")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InsertableImage]
    }
  }

  /**
    * Each job converts an input file into an output file or files. For more information, see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  @js.native
  trait Job extends js.Object {
    var Role: __string
    var Settings: JobSettings
    var AccelerationSettings: js.UndefOr[AccelerationSettings]
    var AccelerationStatus: js.UndefOr[AccelerationStatus]
    var Arn: js.UndefOr[__string]
    var BillingTagsSource: js.UndefOr[BillingTagsSource]
    var CreatedAt: js.UndefOr[__timestampUnix]
    var CurrentPhase: js.UndefOr[JobPhase]
    var ErrorCode: js.UndefOr[__integer]
    var ErrorMessage: js.UndefOr[__string]
    var HopDestinations: js.UndefOr[__listOfHopDestination]
    var Id: js.UndefOr[__string]
    var JobPercentComplete: js.UndefOr[__integer]
    var JobTemplate: js.UndefOr[__string]
    var Messages: js.UndefOr[JobMessages]
    var OutputGroupDetails: js.UndefOr[__listOfOutputGroupDetail]
    var Priority: js.UndefOr[__integerMinNegative50Max50]
    var Queue: js.UndefOr[__string]
    var QueueTransitions: js.UndefOr[__listOfQueueTransition]
    var RetryCount: js.UndefOr[__integer]
    var SimulateReservedQueue: js.UndefOr[SimulateReservedQueue]
    var Status: js.UndefOr[JobStatus]
    var StatusUpdateInterval: js.UndefOr[StatusUpdateInterval]
    var Timing: js.UndefOr[Timing]
    var UserMetadata: js.UndefOr[__mapOf__string]
  }

  object Job {
    @inline
    def apply(
        Role: __string,
        Settings: JobSettings,
        AccelerationSettings: js.UndefOr[AccelerationSettings] = js.undefined,
        AccelerationStatus: js.UndefOr[AccelerationStatus] = js.undefined,
        Arn: js.UndefOr[__string] = js.undefined,
        BillingTagsSource: js.UndefOr[BillingTagsSource] = js.undefined,
        CreatedAt: js.UndefOr[__timestampUnix] = js.undefined,
        CurrentPhase: js.UndefOr[JobPhase] = js.undefined,
        ErrorCode: js.UndefOr[__integer] = js.undefined,
        ErrorMessage: js.UndefOr[__string] = js.undefined,
        HopDestinations: js.UndefOr[__listOfHopDestination] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        JobPercentComplete: js.UndefOr[__integer] = js.undefined,
        JobTemplate: js.UndefOr[__string] = js.undefined,
        Messages: js.UndefOr[JobMessages] = js.undefined,
        OutputGroupDetails: js.UndefOr[__listOfOutputGroupDetail] = js.undefined,
        Priority: js.UndefOr[__integerMinNegative50Max50] = js.undefined,
        Queue: js.UndefOr[__string] = js.undefined,
        QueueTransitions: js.UndefOr[__listOfQueueTransition] = js.undefined,
        RetryCount: js.UndefOr[__integer] = js.undefined,
        SimulateReservedQueue: js.UndefOr[SimulateReservedQueue] = js.undefined,
        Status: js.UndefOr[JobStatus] = js.undefined,
        StatusUpdateInterval: js.UndefOr[StatusUpdateInterval] = js.undefined,
        Timing: js.UndefOr[Timing] = js.undefined,
        UserMetadata: js.UndefOr[__mapOf__string] = js.undefined
    ): Job = {
      val __obj = js.Dynamic.literal(
        "Role" -> Role.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any]
      )

      AccelerationSettings.foreach(__v => __obj.updateDynamic("AccelerationSettings")(__v.asInstanceOf[js.Any]))
      AccelerationStatus.foreach(__v => __obj.updateDynamic("AccelerationStatus")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      BillingTagsSource.foreach(__v => __obj.updateDynamic("BillingTagsSource")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      CurrentPhase.foreach(__v => __obj.updateDynamic("CurrentPhase")(__v.asInstanceOf[js.Any]))
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      HopDestinations.foreach(__v => __obj.updateDynamic("HopDestinations")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      JobPercentComplete.foreach(__v => __obj.updateDynamic("JobPercentComplete")(__v.asInstanceOf[js.Any]))
      JobTemplate.foreach(__v => __obj.updateDynamic("JobTemplate")(__v.asInstanceOf[js.Any]))
      Messages.foreach(__v => __obj.updateDynamic("Messages")(__v.asInstanceOf[js.Any]))
      OutputGroupDetails.foreach(__v => __obj.updateDynamic("OutputGroupDetails")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      QueueTransitions.foreach(__v => __obj.updateDynamic("QueueTransitions")(__v.asInstanceOf[js.Any]))
      RetryCount.foreach(__v => __obj.updateDynamic("RetryCount")(__v.asInstanceOf[js.Any]))
      SimulateReservedQueue.foreach(__v => __obj.updateDynamic("SimulateReservedQueue")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusUpdateInterval.foreach(__v => __obj.updateDynamic("StatusUpdateInterval")(__v.asInstanceOf[js.Any]))
      Timing.foreach(__v => __obj.updateDynamic("Timing")(__v.asInstanceOf[js.Any]))
      UserMetadata.foreach(__v => __obj.updateDynamic("UserMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Job]
    }
  }

  /**
    * Provides messages from the service about jobs that you have already successfully submitted.
    */
  @js.native
  trait JobMessages extends js.Object {
    var Info: js.UndefOr[__listOf__string]
    var Warning: js.UndefOr[__listOf__string]
  }

  object JobMessages {
    @inline
    def apply(
        Info: js.UndefOr[__listOf__string] = js.undefined,
        Warning: js.UndefOr[__listOf__string] = js.undefined
    ): JobMessages = {
      val __obj = js.Dynamic.literal()
      Info.foreach(__v => __obj.updateDynamic("Info")(__v.asInstanceOf[js.Any]))
      Warning.foreach(__v => __obj.updateDynamic("Warning")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobMessages]
    }
  }

  /**
    * A job's phase can be PROBING, TRANSCODING OR UPLOADING
    */
  @js.native
  sealed trait JobPhase extends js.Any
  object JobPhase {
    val PROBING = "PROBING".asInstanceOf[JobPhase]
    val TRANSCODING = "TRANSCODING".asInstanceOf[JobPhase]
    val UPLOADING = "UPLOADING".asInstanceOf[JobPhase]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PROBING, TRANSCODING, UPLOADING))
  }

  /**
    * JobSettings contains all the transcode settings for a job.
    */
  @js.native
  trait JobSettings extends js.Object {
    var AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000]
    var AvailBlanking: js.UndefOr[AvailBlanking]
    var Esam: js.UndefOr[EsamSettings]
    var Inputs: js.UndefOr[__listOfInput]
    var MotionImageInserter: js.UndefOr[MotionImageInserter]
    var NielsenConfiguration: js.UndefOr[NielsenConfiguration]
    var OutputGroups: js.UndefOr[__listOfOutputGroup]
    var TimecodeConfig: js.UndefOr[TimecodeConfig]
    var TimedMetadataInsertion: js.UndefOr[TimedMetadataInsertion]
  }

  object JobSettings {
    @inline
    def apply(
        AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000] = js.undefined,
        AvailBlanking: js.UndefOr[AvailBlanking] = js.undefined,
        Esam: js.UndefOr[EsamSettings] = js.undefined,
        Inputs: js.UndefOr[__listOfInput] = js.undefined,
        MotionImageInserter: js.UndefOr[MotionImageInserter] = js.undefined,
        NielsenConfiguration: js.UndefOr[NielsenConfiguration] = js.undefined,
        OutputGroups: js.UndefOr[__listOfOutputGroup] = js.undefined,
        TimecodeConfig: js.UndefOr[TimecodeConfig] = js.undefined,
        TimedMetadataInsertion: js.UndefOr[TimedMetadataInsertion] = js.undefined
    ): JobSettings = {
      val __obj = js.Dynamic.literal()
      AdAvailOffset.foreach(__v => __obj.updateDynamic("AdAvailOffset")(__v.asInstanceOf[js.Any]))
      AvailBlanking.foreach(__v => __obj.updateDynamic("AvailBlanking")(__v.asInstanceOf[js.Any]))
      Esam.foreach(__v => __obj.updateDynamic("Esam")(__v.asInstanceOf[js.Any]))
      Inputs.foreach(__v => __obj.updateDynamic("Inputs")(__v.asInstanceOf[js.Any]))
      MotionImageInserter.foreach(__v => __obj.updateDynamic("MotionImageInserter")(__v.asInstanceOf[js.Any]))
      NielsenConfiguration.foreach(__v => __obj.updateDynamic("NielsenConfiguration")(__v.asInstanceOf[js.Any]))
      OutputGroups.foreach(__v => __obj.updateDynamic("OutputGroups")(__v.asInstanceOf[js.Any]))
      TimecodeConfig.foreach(__v => __obj.updateDynamic("TimecodeConfig")(__v.asInstanceOf[js.Any]))
      TimedMetadataInsertion.foreach(__v => __obj.updateDynamic("TimedMetadataInsertion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobSettings]
    }
  }

  /**
    * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
    */
  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus {
    val SUBMITTED = "SUBMITTED".asInstanceOf[JobStatus]
    val PROGRESSING = "PROGRESSING".asInstanceOf[JobStatus]
    val COMPLETE = "COMPLETE".asInstanceOf[JobStatus]
    val CANCELED = "CANCELED".asInstanceOf[JobStatus]
    val ERROR = "ERROR".asInstanceOf[JobStatus]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(SUBMITTED, PROGRESSING, COMPLETE, CANCELED, ERROR))
  }

  /**
    * A job template is a pre-made set of encoding instructions that you can use to quickly create a job.
    */
  @js.native
  trait JobTemplate extends js.Object {
    var Name: __string
    var Settings: JobTemplateSettings
    var AccelerationSettings: js.UndefOr[AccelerationSettings]
    var Arn: js.UndefOr[__string]
    var Category: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__timestampUnix]
    var Description: js.UndefOr[__string]
    var HopDestinations: js.UndefOr[__listOfHopDestination]
    var LastUpdated: js.UndefOr[__timestampUnix]
    var Priority: js.UndefOr[__integerMinNegative50Max50]
    var Queue: js.UndefOr[__string]
    var StatusUpdateInterval: js.UndefOr[StatusUpdateInterval]
    var Type: js.UndefOr[Type]
  }

  object JobTemplate {
    @inline
    def apply(
        Name: __string,
        Settings: JobTemplateSettings,
        AccelerationSettings: js.UndefOr[AccelerationSettings] = js.undefined,
        Arn: js.UndefOr[__string] = js.undefined,
        Category: js.UndefOr[__string] = js.undefined,
        CreatedAt: js.UndefOr[__timestampUnix] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HopDestinations: js.UndefOr[__listOfHopDestination] = js.undefined,
        LastUpdated: js.UndefOr[__timestampUnix] = js.undefined,
        Priority: js.UndefOr[__integerMinNegative50Max50] = js.undefined,
        Queue: js.UndefOr[__string] = js.undefined,
        StatusUpdateInterval: js.UndefOr[StatusUpdateInterval] = js.undefined,
        Type: js.UndefOr[Type] = js.undefined
    ): JobTemplate = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any]
      )

      AccelerationSettings.foreach(__v => __obj.updateDynamic("AccelerationSettings")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HopDestinations.foreach(__v => __obj.updateDynamic("HopDestinations")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      StatusUpdateInterval.foreach(__v => __obj.updateDynamic("StatusUpdateInterval")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobTemplate]
    }
  }

  /**
    * Optional. When you request a list of job templates, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
    */
  @js.native
  sealed trait JobTemplateListBy extends js.Any
  object JobTemplateListBy {
    val NAME = "NAME".asInstanceOf[JobTemplateListBy]
    val CREATION_DATE = "CREATION_DATE".asInstanceOf[JobTemplateListBy]
    val SYSTEM = "SYSTEM".asInstanceOf[JobTemplateListBy]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NAME, CREATION_DATE, SYSTEM))
  }

  /**
    * JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs created from it.
    */
  @js.native
  trait JobTemplateSettings extends js.Object {
    var AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000]
    var AvailBlanking: js.UndefOr[AvailBlanking]
    var Esam: js.UndefOr[EsamSettings]
    var Inputs: js.UndefOr[__listOfInputTemplate]
    var MotionImageInserter: js.UndefOr[MotionImageInserter]
    var NielsenConfiguration: js.UndefOr[NielsenConfiguration]
    var OutputGroups: js.UndefOr[__listOfOutputGroup]
    var TimecodeConfig: js.UndefOr[TimecodeConfig]
    var TimedMetadataInsertion: js.UndefOr[TimedMetadataInsertion]
  }

  object JobTemplateSettings {
    @inline
    def apply(
        AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000] = js.undefined,
        AvailBlanking: js.UndefOr[AvailBlanking] = js.undefined,
        Esam: js.UndefOr[EsamSettings] = js.undefined,
        Inputs: js.UndefOr[__listOfInputTemplate] = js.undefined,
        MotionImageInserter: js.UndefOr[MotionImageInserter] = js.undefined,
        NielsenConfiguration: js.UndefOr[NielsenConfiguration] = js.undefined,
        OutputGroups: js.UndefOr[__listOfOutputGroup] = js.undefined,
        TimecodeConfig: js.UndefOr[TimecodeConfig] = js.undefined,
        TimedMetadataInsertion: js.UndefOr[TimedMetadataInsertion] = js.undefined
    ): JobTemplateSettings = {
      val __obj = js.Dynamic.literal()
      AdAvailOffset.foreach(__v => __obj.updateDynamic("AdAvailOffset")(__v.asInstanceOf[js.Any]))
      AvailBlanking.foreach(__v => __obj.updateDynamic("AvailBlanking")(__v.asInstanceOf[js.Any]))
      Esam.foreach(__v => __obj.updateDynamic("Esam")(__v.asInstanceOf[js.Any]))
      Inputs.foreach(__v => __obj.updateDynamic("Inputs")(__v.asInstanceOf[js.Any]))
      MotionImageInserter.foreach(__v => __obj.updateDynamic("MotionImageInserter")(__v.asInstanceOf[js.Any]))
      NielsenConfiguration.foreach(__v => __obj.updateDynamic("NielsenConfiguration")(__v.asInstanceOf[js.Any]))
      OutputGroups.foreach(__v => __obj.updateDynamic("OutputGroups")(__v.asInstanceOf[js.Any]))
      TimecodeConfig.foreach(__v => __obj.updateDynamic("TimecodeConfig")(__v.asInstanceOf[js.Any]))
      TimedMetadataInsertion.foreach(__v => __obj.updateDynamic("TimedMetadataInsertion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobTemplateSettings]
    }
  }

  /**
    * Specify the language, using the ISO 639-2 three-letter code listed at https://www.loc.gov/standards/iso639-2/php/code_list.php.
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(
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
    ))
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
    @inline
    def apply(
        Category: js.UndefOr[__string] = js.undefined,
        ListBy: js.UndefOr[JobTemplateListBy] = js.undefined,
        MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Order: js.UndefOr[Order] = js.undefined
    ): ListJobTemplatesRequest = {
      val __obj = js.Dynamic.literal()
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      ListBy.foreach(__v => __obj.updateDynamic("ListBy")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Order.foreach(__v => __obj.updateDynamic("Order")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobTemplatesRequest]
    }
  }

  @js.native
  trait ListJobTemplatesResponse extends js.Object {
    var JobTemplates: js.UndefOr[__listOfJobTemplate]
    var NextToken: js.UndefOr[__string]
  }

  object ListJobTemplatesResponse {
    @inline
    def apply(
        JobTemplates: js.UndefOr[__listOfJobTemplate] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListJobTemplatesResponse = {
      val __obj = js.Dynamic.literal()
      JobTemplates.foreach(__v => __obj.updateDynamic("JobTemplates")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobTemplatesResponse]
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
    @inline
    def apply(
        MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Order: js.UndefOr[Order] = js.undefined,
        Queue: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[JobStatus] = js.undefined
    ): ListJobsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Order.foreach(__v => __obj.updateDynamic("Order")(__v.asInstanceOf[js.Any]))
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsRequest]
    }
  }

  @js.native
  trait ListJobsResponse extends js.Object {
    var Jobs: js.UndefOr[__listOfJob]
    var NextToken: js.UndefOr[__string]
  }

  object ListJobsResponse {
    @inline
    def apply(
        Jobs: js.UndefOr[__listOfJob] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListJobsResponse = {
      val __obj = js.Dynamic.literal()
      Jobs.foreach(__v => __obj.updateDynamic("Jobs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsResponse]
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
    @inline
    def apply(
        Category: js.UndefOr[__string] = js.undefined,
        ListBy: js.UndefOr[PresetListBy] = js.undefined,
        MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Order: js.UndefOr[Order] = js.undefined
    ): ListPresetsRequest = {
      val __obj = js.Dynamic.literal()
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      ListBy.foreach(__v => __obj.updateDynamic("ListBy")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Order.foreach(__v => __obj.updateDynamic("Order")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPresetsRequest]
    }
  }

  @js.native
  trait ListPresetsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Presets: js.UndefOr[__listOfPreset]
  }

  object ListPresetsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Presets: js.UndefOr[__listOfPreset] = js.undefined
    ): ListPresetsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Presets.foreach(__v => __obj.updateDynamic("Presets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPresetsResponse]
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
    @inline
    def apply(
        ListBy: js.UndefOr[QueueListBy] = js.undefined,
        MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Order: js.UndefOr[Order] = js.undefined
    ): ListQueuesRequest = {
      val __obj = js.Dynamic.literal()
      ListBy.foreach(__v => __obj.updateDynamic("ListBy")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Order.foreach(__v => __obj.updateDynamic("Order")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueuesRequest]
    }
  }

  @js.native
  trait ListQueuesResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Queues: js.UndefOr[__listOfQueue]
  }

  object ListQueuesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Queues: js.UndefOr[__listOfQueue] = js.undefined
    ): ListQueuesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Queues.foreach(__v => __obj.updateDynamic("Queues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueuesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var Arn: __string
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        Arn: __string
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var ResourceTags: js.UndefOr[ResourceTags]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        ResourceTags: js.UndefOr[ResourceTags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      ResourceTags.foreach(__v => __obj.updateDynamic("ResourceTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * Selects between the DVB and ATSC buffer models for Dolby Digital audio.
    */
  @js.native
  sealed trait M2tsAudioBufferModel extends js.Any
  object M2tsAudioBufferModel {
    val DVB = "DVB".asInstanceOf[M2tsAudioBufferModel]
    val ATSC = "ATSC".asInstanceOf[M2tsAudioBufferModel]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DVB, ATSC))
  }

  /**
    * Controls what buffer model to use for accurate interleaving. If set to MULTIPLEX, use multiplex  buffer model. If set to NONE, this can lead to lower latency, but low-memory devices may not be able to play back the stream without interruptions.
    */
  @js.native
  sealed trait M2tsBufferModel extends js.Any
  object M2tsBufferModel {
    val MULTIPLEX = "MULTIPLEX".asInstanceOf[M2tsBufferModel]
    val NONE = "NONE".asInstanceOf[M2tsBufferModel]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(MULTIPLEX, NONE))
  }

  /**
    * When set to VIDEO_AND_FIXED_INTERVALS, audio EBP markers will be added to partitions 3 and 4. The interval between these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval. When set to VIDEO_INTERVAL, these additional markers will not be inserted. Only applicable when EBP segmentation markers are is selected (segmentationMarkers is EBP or EBP_LEGACY).
    */
  @js.native
  sealed trait M2tsEbpAudioInterval extends js.Any
  object M2tsEbpAudioInterval {
    val VIDEO_AND_FIXED_INTERVALS = "VIDEO_AND_FIXED_INTERVALS".asInstanceOf[M2tsEbpAudioInterval]
    val VIDEO_INTERVAL = "VIDEO_INTERVAL".asInstanceOf[M2tsEbpAudioInterval]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(VIDEO_AND_FIXED_INTERVALS, VIDEO_INTERVAL))
  }

  /**
    * Selects which PIDs to place EBP markers on. They can either be placed only on the video PID, or on both the video PID and all audio PIDs. Only applicable when EBP segmentation markers are is selected (segmentationMarkers is EBP or EBP_LEGACY).
    */
  @js.native
  sealed trait M2tsEbpPlacement extends js.Any
  object M2tsEbpPlacement {
    val VIDEO_AND_AUDIO_PIDS = "VIDEO_AND_AUDIO_PIDS".asInstanceOf[M2tsEbpPlacement]
    val VIDEO_PID = "VIDEO_PID".asInstanceOf[M2tsEbpPlacement]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(VIDEO_AND_AUDIO_PIDS, VIDEO_PID))
  }

  /**
    * Controls whether to include the ES Rate field in the PES header.
    */
  @js.native
  sealed trait M2tsEsRateInPes extends js.Any
  object M2tsEsRateInPes {
    val INCLUDE = "INCLUDE".asInstanceOf[M2tsEsRateInPes]
    val EXCLUDE = "EXCLUDE".asInstanceOf[M2tsEsRateInPes]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * Keep the default value (DEFAULT) unless you know that your audio EBP markers are incorrectly appearing before your video EBP markers. To correct this problem, set this value to Force (FORCE).
    */
  @js.native
  sealed trait M2tsForceTsVideoEbpOrder extends js.Any
  object M2tsForceTsVideoEbpOrder {
    val FORCE = "FORCE".asInstanceOf[M2tsForceTsVideoEbpOrder]
    val DEFAULT = "DEFAULT".asInstanceOf[M2tsForceTsVideoEbpOrder]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(FORCE, DEFAULT))
  }

  /**
    * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  @js.native
  sealed trait M2tsNielsenId3 extends js.Any
  object M2tsNielsenId3 {
    val INSERT = "INSERT".asInstanceOf[M2tsNielsenId3]
    val NONE = "NONE".asInstanceOf[M2tsNielsenId3]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INSERT, NONE))
  }

  /**
    * When set to PCR_EVERY_PES_PACKET, a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  @js.native
  sealed trait M2tsPcrControl extends js.Any
  object M2tsPcrControl {
    val PCR_EVERY_PES_PACKET = "PCR_EVERY_PES_PACKET".asInstanceOf[M2tsPcrControl]
    val CONFIGURED_PCR_PERIOD = "CONFIGURED_PCR_PERIOD".asInstanceOf[M2tsPcrControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD))
  }

  /**
    * When set to CBR, inserts null packets into transport stream to fill specified bitrate. When set to VBR, the bitrate setting acts as the maximum bitrate, but the output will not be padded up to that bitrate.
    */
  @js.native
  sealed trait M2tsRateMode extends js.Any
  object M2tsRateMode {
    val VBR = "VBR".asInstanceOf[M2tsRateMode]
    val CBR = "CBR".asInstanceOf[M2tsRateMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(VBR, CBR))
  }

  /**
    * Settings for SCTE-35 signals from ESAM. Include this in your job settings to put SCTE-35 markers in your HLS and transport stream outputs at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
    */
  @js.native
  trait M2tsScte35Esam extends js.Object {
    var Scte35EsamPid: js.UndefOr[__integerMin32Max8182]
  }

  object M2tsScte35Esam {
    @inline
    def apply(
        Scte35EsamPid: js.UndefOr[__integerMin32Max8182] = js.undefined
    ): M2tsScte35Esam = {
      val __obj = js.Dynamic.literal()
      Scte35EsamPid.foreach(__v => __obj.updateDynamic("Scte35EsamPid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[M2tsScte35Esam]
    }
  }

  /**
    * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want SCTE-35 markers in this output. For SCTE-35 markers from an ESAM XML document-- Choose None (NONE). Also provide the ESAM XML as a string in the setting Signal processing notification XML (sccXml). Also enable ESAM SCTE-35 (include the property scte35Esam).
    */
  @js.native
  sealed trait M2tsScte35Source extends js.Any
  object M2tsScte35Source {
    val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[M2tsScte35Source]
    val NONE = "NONE".asInstanceOf[M2tsScte35Source]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PASSTHROUGH, NONE))
  }

  /**
    * Inserts segmentation markers at each segmentation_time period. rai_segstart sets the Random Access Indicator bit in the adaptation field. rai_adapt sets the RAI bit and adds the current timecode in the private data bytes. psi_segstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebp_legacy adds Encoder Boundary Point information to the adaptation field using a legacy proprietary format.
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NONE, RAI_SEGSTART, RAI_ADAPT, PSI_SEGSTART, EBP, EBP_LEGACY))
  }

  /**
    * The segmentation style parameter controls how segmentation markers are inserted into the transport stream. With avails, it is possible that segments may be truncated, which can influence where future segmentation markers are inserted. When a segmentation style of "reset_cadence" is selected and a segment is truncated due to an avail, we will reset the segmentation cadence. This means the subsequent segment will have a duration of of segmentation_time seconds. When a segmentation style of "maintain_cadence" is selected and a segment is truncated due to an avail, we will not reset the segmentation cadence. This means the subsequent segment will likely be truncated as well. However, all segments after that will have a duration of segmentation_time seconds. Note that EBP lookahead is a slight exception to this rule.
    */
  @js.native
  sealed trait M2tsSegmentationStyle extends js.Any
  object M2tsSegmentationStyle {
    val MAINTAIN_CADENCE = "MAINTAIN_CADENCE".asInstanceOf[M2tsSegmentationStyle]
    val RESET_CADENCE = "RESET_CADENCE".asInstanceOf[M2tsSegmentationStyle]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(MAINTAIN_CADENCE, RESET_CADENCE))
  }

  /**
    * MPEG-2 TS container settings. These apply to outputs in a File output group when the output's container (ContainerType) is MPEG-2 Transport Stream (M2TS). In these assets, data is organized by the program map table (PMT). Each transport stream program contains subsets of data, including audio, video, and metadata. Each of these subsets of data has a numerical label called a packet identifier (PID). Each transport stream program corresponds to one MediaConvert output. The PMT lists the types of data in a program along with their PID. Downstream systems and players use the program map table to look up the PID for each type of data it accesses and then uses the PIDs to locate specific data within the asset.
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
    var ForceTsVideoEbpOrder: js.UndefOr[M2tsForceTsVideoEbpOrder]
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
    var Scte35Esam: js.UndefOr[M2tsScte35Esam]
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
    @inline
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
        ForceTsVideoEbpOrder: js.UndefOr[M2tsForceTsVideoEbpOrder] = js.undefined,
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
        Scte35Esam: js.UndefOr[M2tsScte35Esam] = js.undefined,
        Scte35Pid: js.UndefOr[__integerMin32Max8182] = js.undefined,
        Scte35Source: js.UndefOr[M2tsScte35Source] = js.undefined,
        SegmentationMarkers: js.UndefOr[M2tsSegmentationMarkers] = js.undefined,
        SegmentationStyle: js.UndefOr[M2tsSegmentationStyle] = js.undefined,
        SegmentationTime: js.UndefOr[__doubleMin0] = js.undefined,
        TimedMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined,
        TransportStreamId: js.UndefOr[__integerMin0Max65535] = js.undefined,
        VideoPid: js.UndefOr[__integerMin32Max8182] = js.undefined
    ): M2tsSettings = {
      val __obj = js.Dynamic.literal()
      AudioBufferModel.foreach(__v => __obj.updateDynamic("AudioBufferModel")(__v.asInstanceOf[js.Any]))
      AudioFramesPerPes.foreach(__v => __obj.updateDynamic("AudioFramesPerPes")(__v.asInstanceOf[js.Any]))
      AudioPids.foreach(__v => __obj.updateDynamic("AudioPids")(__v.asInstanceOf[js.Any]))
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      BufferModel.foreach(__v => __obj.updateDynamic("BufferModel")(__v.asInstanceOf[js.Any]))
      DvbNitSettings.foreach(__v => __obj.updateDynamic("DvbNitSettings")(__v.asInstanceOf[js.Any]))
      DvbSdtSettings.foreach(__v => __obj.updateDynamic("DvbSdtSettings")(__v.asInstanceOf[js.Any]))
      DvbSubPids.foreach(__v => __obj.updateDynamic("DvbSubPids")(__v.asInstanceOf[js.Any]))
      DvbTdtSettings.foreach(__v => __obj.updateDynamic("DvbTdtSettings")(__v.asInstanceOf[js.Any]))
      DvbTeletextPid.foreach(__v => __obj.updateDynamic("DvbTeletextPid")(__v.asInstanceOf[js.Any]))
      EbpAudioInterval.foreach(__v => __obj.updateDynamic("EbpAudioInterval")(__v.asInstanceOf[js.Any]))
      EbpPlacement.foreach(__v => __obj.updateDynamic("EbpPlacement")(__v.asInstanceOf[js.Any]))
      EsRateInPes.foreach(__v => __obj.updateDynamic("EsRateInPes")(__v.asInstanceOf[js.Any]))
      ForceTsVideoEbpOrder.foreach(__v => __obj.updateDynamic("ForceTsVideoEbpOrder")(__v.asInstanceOf[js.Any]))
      FragmentTime.foreach(__v => __obj.updateDynamic("FragmentTime")(__v.asInstanceOf[js.Any]))
      MaxPcrInterval.foreach(__v => __obj.updateDynamic("MaxPcrInterval")(__v.asInstanceOf[js.Any]))
      MinEbpInterval.foreach(__v => __obj.updateDynamic("MinEbpInterval")(__v.asInstanceOf[js.Any]))
      NielsenId3.foreach(__v => __obj.updateDynamic("NielsenId3")(__v.asInstanceOf[js.Any]))
      NullPacketBitrate.foreach(__v => __obj.updateDynamic("NullPacketBitrate")(__v.asInstanceOf[js.Any]))
      PatInterval.foreach(__v => __obj.updateDynamic("PatInterval")(__v.asInstanceOf[js.Any]))
      PcrControl.foreach(__v => __obj.updateDynamic("PcrControl")(__v.asInstanceOf[js.Any]))
      PcrPid.foreach(__v => __obj.updateDynamic("PcrPid")(__v.asInstanceOf[js.Any]))
      PmtInterval.foreach(__v => __obj.updateDynamic("PmtInterval")(__v.asInstanceOf[js.Any]))
      PmtPid.foreach(__v => __obj.updateDynamic("PmtPid")(__v.asInstanceOf[js.Any]))
      PrivateMetadataPid.foreach(__v => __obj.updateDynamic("PrivateMetadataPid")(__v.asInstanceOf[js.Any]))
      ProgramNumber.foreach(__v => __obj.updateDynamic("ProgramNumber")(__v.asInstanceOf[js.Any]))
      RateMode.foreach(__v => __obj.updateDynamic("RateMode")(__v.asInstanceOf[js.Any]))
      Scte35Esam.foreach(__v => __obj.updateDynamic("Scte35Esam")(__v.asInstanceOf[js.Any]))
      Scte35Pid.foreach(__v => __obj.updateDynamic("Scte35Pid")(__v.asInstanceOf[js.Any]))
      Scte35Source.foreach(__v => __obj.updateDynamic("Scte35Source")(__v.asInstanceOf[js.Any]))
      SegmentationMarkers.foreach(__v => __obj.updateDynamic("SegmentationMarkers")(__v.asInstanceOf[js.Any]))
      SegmentationStyle.foreach(__v => __obj.updateDynamic("SegmentationStyle")(__v.asInstanceOf[js.Any]))
      SegmentationTime.foreach(__v => __obj.updateDynamic("SegmentationTime")(__v.asInstanceOf[js.Any]))
      TimedMetadataPid.foreach(__v => __obj.updateDynamic("TimedMetadataPid")(__v.asInstanceOf[js.Any]))
      TransportStreamId.foreach(__v => __obj.updateDynamic("TransportStreamId")(__v.asInstanceOf[js.Any]))
      VideoPid.foreach(__v => __obj.updateDynamic("VideoPid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[M2tsSettings]
    }
  }

  /**
    * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  @js.native
  sealed trait M3u8NielsenId3 extends js.Any
  object M3u8NielsenId3 {
    val INSERT = "INSERT".asInstanceOf[M3u8NielsenId3]
    val NONE = "NONE".asInstanceOf[M3u8NielsenId3]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INSERT, NONE))
  }

  /**
    * When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  @js.native
  sealed trait M3u8PcrControl extends js.Any
  object M3u8PcrControl {
    val PCR_EVERY_PES_PACKET = "PCR_EVERY_PES_PACKET".asInstanceOf[M3u8PcrControl]
    val CONFIGURED_PCR_PERIOD = "CONFIGURED_PCR_PERIOD".asInstanceOf[M3u8PcrControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD))
  }

  /**
    * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want SCTE-35 markers in this output. For SCTE-35 markers from an ESAM XML document-- Choose None (NONE) if you don't want manifest conditioning. Choose Passthrough (PASSTHROUGH) and choose Ad markers (adMarkers) if you do want manifest conditioning. In both cases, also provide the ESAM XML as a string in the setting Signal processing notification XML (sccXml).
    */
  @js.native
  sealed trait M3u8Scte35Source extends js.Any
  object M3u8Scte35Source {
    val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[M3u8Scte35Source]
    val NONE = "NONE".asInstanceOf[M3u8Scte35Source]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PASSTHROUGH, NONE))
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
    @inline
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
        VideoPid: js.UndefOr[__integerMin32Max8182] = js.undefined
    ): M3u8Settings = {
      val __obj = js.Dynamic.literal()
      AudioFramesPerPes.foreach(__v => __obj.updateDynamic("AudioFramesPerPes")(__v.asInstanceOf[js.Any]))
      AudioPids.foreach(__v => __obj.updateDynamic("AudioPids")(__v.asInstanceOf[js.Any]))
      NielsenId3.foreach(__v => __obj.updateDynamic("NielsenId3")(__v.asInstanceOf[js.Any]))
      PatInterval.foreach(__v => __obj.updateDynamic("PatInterval")(__v.asInstanceOf[js.Any]))
      PcrControl.foreach(__v => __obj.updateDynamic("PcrControl")(__v.asInstanceOf[js.Any]))
      PcrPid.foreach(__v => __obj.updateDynamic("PcrPid")(__v.asInstanceOf[js.Any]))
      PmtInterval.foreach(__v => __obj.updateDynamic("PmtInterval")(__v.asInstanceOf[js.Any]))
      PmtPid.foreach(__v => __obj.updateDynamic("PmtPid")(__v.asInstanceOf[js.Any]))
      PrivateMetadataPid.foreach(__v => __obj.updateDynamic("PrivateMetadataPid")(__v.asInstanceOf[js.Any]))
      ProgramNumber.foreach(__v => __obj.updateDynamic("ProgramNumber")(__v.asInstanceOf[js.Any]))
      Scte35Pid.foreach(__v => __obj.updateDynamic("Scte35Pid")(__v.asInstanceOf[js.Any]))
      Scte35Source.foreach(__v => __obj.updateDynamic("Scte35Source")(__v.asInstanceOf[js.Any]))
      TimedMetadata.foreach(__v => __obj.updateDynamic("TimedMetadata")(__v.asInstanceOf[js.Any]))
      TimedMetadataPid.foreach(__v => __obj.updateDynamic("TimedMetadataPid")(__v.asInstanceOf[js.Any]))
      TransportStreamId.foreach(__v => __obj.updateDynamic("TransportStreamId")(__v.asInstanceOf[js.Any]))
      VideoPid.foreach(__v => __obj.updateDynamic("VideoPid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[M3u8Settings]
    }
  }

  /**
    * Overlay motion graphics on top of your video at the time that you specify.
    */
  @js.native
  trait MotionImageInserter extends js.Object {
    var Framerate: js.UndefOr[MotionImageInsertionFramerate]
    var Input: js.UndefOr[__stringMin14Max1285PatternS3Mov09PngHttpsMov09Png]
    var InsertionMode: js.UndefOr[MotionImageInsertionMode]
    var Offset: js.UndefOr[MotionImageInsertionOffset]
    var Playback: js.UndefOr[MotionImagePlayback]
    var StartTime: js.UndefOr[__stringMin11Max11Pattern01D20305D205D]
  }

  object MotionImageInserter {
    @inline
    def apply(
        Framerate: js.UndefOr[MotionImageInsertionFramerate] = js.undefined,
        Input: js.UndefOr[__stringMin14Max1285PatternS3Mov09PngHttpsMov09Png] = js.undefined,
        InsertionMode: js.UndefOr[MotionImageInsertionMode] = js.undefined,
        Offset: js.UndefOr[MotionImageInsertionOffset] = js.undefined,
        Playback: js.UndefOr[MotionImagePlayback] = js.undefined,
        StartTime: js.UndefOr[__stringMin11Max11Pattern01D20305D205D] = js.undefined
    ): MotionImageInserter = {
      val __obj = js.Dynamic.literal()
      Framerate.foreach(__v => __obj.updateDynamic("Framerate")(__v.asInstanceOf[js.Any]))
      Input.foreach(__v => __obj.updateDynamic("Input")(__v.asInstanceOf[js.Any]))
      InsertionMode.foreach(__v => __obj.updateDynamic("InsertionMode")(__v.asInstanceOf[js.Any]))
      Offset.foreach(__v => __obj.updateDynamic("Offset")(__v.asInstanceOf[js.Any]))
      Playback.foreach(__v => __obj.updateDynamic("Playback")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MotionImageInserter]
    }
  }

  /**
    * For motion overlays that don't have a built-in frame rate, specify the frame rate of the overlay in frames per second, as a fraction. For example, specify 24 fps as 24/1. The overlay frame rate doesn't need to match the frame rate of the underlying video.
    */
  @js.native
  trait MotionImageInsertionFramerate extends js.Object {
    var FramerateDenominator: js.UndefOr[__integerMin1Max17895697]
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483640]
  }

  object MotionImageInsertionFramerate {
    @inline
    def apply(
        FramerateDenominator: js.UndefOr[__integerMin1Max17895697] = js.undefined,
        FramerateNumerator: js.UndefOr[__integerMin1Max2147483640] = js.undefined
    ): MotionImageInsertionFramerate = {
      val __obj = js.Dynamic.literal()
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MotionImageInsertionFramerate]
    }
  }

  /**
    * Choose the type of motion graphic asset that you are providing for your overlay. You can choose either a .mov file or a series of .png files.
    */
  @js.native
  sealed trait MotionImageInsertionMode extends js.Any
  object MotionImageInsertionMode {
    val MOV = "MOV".asInstanceOf[MotionImageInsertionMode]
    val PNG = "PNG".asInstanceOf[MotionImageInsertionMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(MOV, PNG))
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
    @inline
    def apply(
        ImageX: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        ImageY: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    ): MotionImageInsertionOffset = {
      val __obj = js.Dynamic.literal()
      ImageX.foreach(__v => __obj.updateDynamic("ImageX")(__v.asInstanceOf[js.Any]))
      ImageY.foreach(__v => __obj.updateDynamic("ImageY")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MotionImageInsertionOffset]
    }
  }

  /**
    * Specify whether your motion graphic overlay repeats on a loop or plays only once.
    */
  @js.native
  sealed trait MotionImagePlayback extends js.Any
  object MotionImagePlayback {
    val ONCE = "ONCE".asInstanceOf[MotionImagePlayback]
    val REPEAT = "REPEAT".asInstanceOf[MotionImagePlayback]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ONCE, REPEAT))
  }

  /**
    * When enabled, include 'clap' atom if appropriate for the video output settings.
    */
  @js.native
  sealed trait MovClapAtom extends js.Any
  object MovClapAtom {
    val INCLUDE = "INCLUDE".asInstanceOf[MovClapAtom]
    val EXCLUDE = "EXCLUDE".asInstanceOf[MovClapAtom]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
    */
  @js.native
  sealed trait MovCslgAtom extends js.Any
  object MovCslgAtom {
    val INCLUDE = "INCLUDE".asInstanceOf[MovCslgAtom]
    val EXCLUDE = "EXCLUDE".asInstanceOf[MovCslgAtom]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * When set to XDCAM, writes MPEG2 video streams into the QuickTime file using XDCAM fourcc codes. This increases compatibility with Apple editors and players, but may decrease compatibility with other players. Only applicable when the video codec is MPEG2.
    */
  @js.native
  sealed trait MovMpeg2FourCCControl extends js.Any
  object MovMpeg2FourCCControl {
    val XDCAM = "XDCAM".asInstanceOf[MovMpeg2FourCCControl]
    val MPEG = "MPEG".asInstanceOf[MovMpeg2FourCCControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(XDCAM, MPEG))
  }

  /**
    * If set to OMNEON, inserts Omneon-compatible padding
    */
  @js.native
  sealed trait MovPaddingControl extends js.Any
  object MovPaddingControl {
    val OMNEON = "OMNEON".asInstanceOf[MovPaddingControl]
    val NONE = "NONE".asInstanceOf[MovPaddingControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(OMNEON, NONE))
  }

  /**
    * Always keep the default value (SELF_CONTAINED) for this setting.
    */
  @js.native
  sealed trait MovReference extends js.Any
  object MovReference {
    val SELF_CONTAINED = "SELF_CONTAINED".asInstanceOf[MovReference]
    val EXTERNAL = "EXTERNAL".asInstanceOf[MovReference]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(SELF_CONTAINED, EXTERNAL))
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
    @inline
    def apply(
        ClapAtom: js.UndefOr[MovClapAtom] = js.undefined,
        CslgAtom: js.UndefOr[MovCslgAtom] = js.undefined,
        Mpeg2FourCCControl: js.UndefOr[MovMpeg2FourCCControl] = js.undefined,
        PaddingControl: js.UndefOr[MovPaddingControl] = js.undefined,
        Reference: js.UndefOr[MovReference] = js.undefined
    ): MovSettings = {
      val __obj = js.Dynamic.literal()
      ClapAtom.foreach(__v => __obj.updateDynamic("ClapAtom")(__v.asInstanceOf[js.Any]))
      CslgAtom.foreach(__v => __obj.updateDynamic("CslgAtom")(__v.asInstanceOf[js.Any]))
      Mpeg2FourCCControl.foreach(__v => __obj.updateDynamic("Mpeg2FourCCControl")(__v.asInstanceOf[js.Any]))
      PaddingControl.foreach(__v => __obj.updateDynamic("PaddingControl")(__v.asInstanceOf[js.Any]))
      Reference.foreach(__v => __obj.updateDynamic("Reference")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MovSettings]
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
    @inline
    def apply(
        Bitrate: js.UndefOr[__integerMin32000Max384000] = js.undefined,
        Channels: js.UndefOr[__integerMin1Max2] = js.undefined,
        SampleRate: js.UndefOr[__integerMin32000Max48000] = js.undefined
    ): Mp2Settings = {
      val __obj = js.Dynamic.literal()
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      Channels.foreach(__v => __obj.updateDynamic("Channels")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Mp2Settings]
    }
  }

  /**
    * Specify whether the service encodes this MP3 audio output with a constant bitrate (CBR) or a variable bitrate (VBR).
    */
  @js.native
  sealed trait Mp3RateControlMode extends js.Any
  object Mp3RateControlMode {
    val CBR = "CBR".asInstanceOf[Mp3RateControlMode]
    val VBR = "VBR".asInstanceOf[Mp3RateControlMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(CBR, VBR))
  }

  /**
    * Required when you set Codec, under AudioDescriptions>CodecSettings, to the value MP3.
    */
  @js.native
  trait Mp3Settings extends js.Object {
    var Bitrate: js.UndefOr[__integerMin16000Max320000]
    var Channels: js.UndefOr[__integerMin1Max2]
    var RateControlMode: js.UndefOr[Mp3RateControlMode]
    var SampleRate: js.UndefOr[__integerMin22050Max48000]
    var VbrQuality: js.UndefOr[__integerMin0Max9]
  }

  object Mp3Settings {
    @inline
    def apply(
        Bitrate: js.UndefOr[__integerMin16000Max320000] = js.undefined,
        Channels: js.UndefOr[__integerMin1Max2] = js.undefined,
        RateControlMode: js.UndefOr[Mp3RateControlMode] = js.undefined,
        SampleRate: js.UndefOr[__integerMin22050Max48000] = js.undefined,
        VbrQuality: js.UndefOr[__integerMin0Max9] = js.undefined
    ): Mp3Settings = {
      val __obj = js.Dynamic.literal()
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      Channels.foreach(__v => __obj.updateDynamic("Channels")(__v.asInstanceOf[js.Any]))
      RateControlMode.foreach(__v => __obj.updateDynamic("RateControlMode")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      VbrQuality.foreach(__v => __obj.updateDynamic("VbrQuality")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Mp3Settings]
    }
  }

  /**
    * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
    */
  @js.native
  sealed trait Mp4CslgAtom extends js.Any
  object Mp4CslgAtom {
    val INCLUDE = "INCLUDE".asInstanceOf[Mp4CslgAtom]
    val EXCLUDE = "EXCLUDE".asInstanceOf[Mp4CslgAtom]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * Inserts a free-space box immediately after the moov box.
    */
  @js.native
  sealed trait Mp4FreeSpaceBox extends js.Any
  object Mp4FreeSpaceBox {
    val INCLUDE = "INCLUDE".asInstanceOf[Mp4FreeSpaceBox]
    val EXCLUDE = "EXCLUDE".asInstanceOf[Mp4FreeSpaceBox]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
    */
  @js.native
  sealed trait Mp4MoovPlacement extends js.Any
  object Mp4MoovPlacement {
    val PROGRESSIVE_DOWNLOAD = "PROGRESSIVE_DOWNLOAD".asInstanceOf[Mp4MoovPlacement]
    val NORMAL = "NORMAL".asInstanceOf[Mp4MoovPlacement]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PROGRESSIVE_DOWNLOAD, NORMAL))
  }

  /**
    * Settings for MP4 container. You can create audio-only AAC outputs with this container.
    */
  @js.native
  trait Mp4Settings extends js.Object {
    var CslgAtom: js.UndefOr[Mp4CslgAtom]
    var CttsVersion: js.UndefOr[__integerMin0Max1]
    var FreeSpaceBox: js.UndefOr[Mp4FreeSpaceBox]
    var MoovPlacement: js.UndefOr[Mp4MoovPlacement]
    var Mp4MajorBrand: js.UndefOr[__string]
  }

  object Mp4Settings {
    @inline
    def apply(
        CslgAtom: js.UndefOr[Mp4CslgAtom] = js.undefined,
        CttsVersion: js.UndefOr[__integerMin0Max1] = js.undefined,
        FreeSpaceBox: js.UndefOr[Mp4FreeSpaceBox] = js.undefined,
        MoovPlacement: js.UndefOr[Mp4MoovPlacement] = js.undefined,
        Mp4MajorBrand: js.UndefOr[__string] = js.undefined
    ): Mp4Settings = {
      val __obj = js.Dynamic.literal()
      CslgAtom.foreach(__v => __obj.updateDynamic("CslgAtom")(__v.asInstanceOf[js.Any]))
      CttsVersion.foreach(__v => __obj.updateDynamic("CttsVersion")(__v.asInstanceOf[js.Any]))
      FreeSpaceBox.foreach(__v => __obj.updateDynamic("FreeSpaceBox")(__v.asInstanceOf[js.Any]))
      MoovPlacement.foreach(__v => __obj.updateDynamic("MoovPlacement")(__v.asInstanceOf[js.Any]))
      Mp4MajorBrand.foreach(__v => __obj.updateDynamic("Mp4MajorBrand")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Mp4Settings]
    }
  }

  /**
    * Use this setting only in DASH output groups that include sidecar TTML or IMSC captions.  You specify sidecar captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single XML file in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format contained within fragmented MP4 files. This set of fragmented MP4 files is separate from your video and audio fragmented MP4 files.
    */
  @js.native
  sealed trait MpdCaptionContainerType extends js.Any
  object MpdCaptionContainerType {
    val RAW = "RAW".asInstanceOf[MpdCaptionContainerType]
    val FRAGMENTED_MP4 = "FRAGMENTED_MP4".asInstanceOf[MpdCaptionContainerType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(RAW, FRAGMENTED_MP4))
  }

  /**
    * Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
    */
  @js.native
  sealed trait MpdScte35Esam extends js.Any
  object MpdScte35Esam {
    val INSERT = "INSERT".asInstanceOf[MpdScte35Esam]
    val NONE = "NONE".asInstanceOf[MpdScte35Esam]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INSERT, NONE))
  }

  /**
    * Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want those SCTE-35 markers in this output.
    */
  @js.native
  sealed trait MpdScte35Source extends js.Any
  object MpdScte35Source {
    val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[MpdScte35Source]
    val NONE = "NONE".asInstanceOf[MpdScte35Source]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PASSTHROUGH, NONE))
  }

  /**
    * Settings for MP4 segments in DASH
    */
  @js.native
  trait MpdSettings extends js.Object {
    var CaptionContainerType: js.UndefOr[MpdCaptionContainerType]
    var Scte35Esam: js.UndefOr[MpdScte35Esam]
    var Scte35Source: js.UndefOr[MpdScte35Source]
  }

  object MpdSettings {
    @inline
    def apply(
        CaptionContainerType: js.UndefOr[MpdCaptionContainerType] = js.undefined,
        Scte35Esam: js.UndefOr[MpdScte35Esam] = js.undefined,
        Scte35Source: js.UndefOr[MpdScte35Source] = js.undefined
    ): MpdSettings = {
      val __obj = js.Dynamic.literal()
      CaptionContainerType.foreach(__v => __obj.updateDynamic("CaptionContainerType")(__v.asInstanceOf[js.Any]))
      Scte35Esam.foreach(__v => __obj.updateDynamic("Scte35Esam")(__v.asInstanceOf[js.Any]))
      Scte35Source.foreach(__v => __obj.updateDynamic("Scte35Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MpdSettings]
    }
  }

  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  @js.native
  sealed trait Mpeg2AdaptiveQuantization extends js.Any
  object Mpeg2AdaptiveQuantization {
    val OFF = "OFF".asInstanceOf[Mpeg2AdaptiveQuantization]
    val LOW = "LOW".asInstanceOf[Mpeg2AdaptiveQuantization]
    val MEDIUM = "MEDIUM".asInstanceOf[Mpeg2AdaptiveQuantization]
    val HIGH = "HIGH".asInstanceOf[Mpeg2AdaptiveQuantization]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(OFF, LOW, MEDIUM, HIGH))
  }

  /**
    * Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
    */
  @js.native
  sealed trait Mpeg2CodecLevel extends js.Any
  object Mpeg2CodecLevel {
    val AUTO = "AUTO".asInstanceOf[Mpeg2CodecLevel]
    val LOW = "LOW".asInstanceOf[Mpeg2CodecLevel]
    val MAIN = "MAIN".asInstanceOf[Mpeg2CodecLevel]
    val HIGH1440 = "HIGH1440".asInstanceOf[Mpeg2CodecLevel]
    val HIGH = "HIGH".asInstanceOf[Mpeg2CodecLevel]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(AUTO, LOW, MAIN, HIGH1440, HIGH))
  }

  /**
    * Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video output.
    */
  @js.native
  sealed trait Mpeg2CodecProfile extends js.Any
  object Mpeg2CodecProfile {
    val MAIN = "MAIN".asInstanceOf[Mpeg2CodecProfile]
    val PROFILE_422 = "PROFILE_422".asInstanceOf[Mpeg2CodecProfile]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(MAIN, PROFILE_422))
  }

  /**
    * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
    */
  @js.native
  sealed trait Mpeg2DynamicSubGop extends js.Any
  object Mpeg2DynamicSubGop {
    val ADAPTIVE = "ADAPTIVE".asInstanceOf[Mpeg2DynamicSubGop]
    val STATIC = "STATIC".asInstanceOf[Mpeg2DynamicSubGop]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ADAPTIVE, STATIC))
  }

  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  @js.native
  sealed trait Mpeg2FramerateControl extends js.Any
  object Mpeg2FramerateControl {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[Mpeg2FramerateControl]
    val SPECIFIED = "SPECIFIED".asInstanceOf[Mpeg2FramerateControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * Optional. Specify how the transcoder performs framerate conversion. The default behavior is to use duplicate drop conversion.
    */
  @js.native
  sealed trait Mpeg2FramerateConversionAlgorithm extends js.Any
  object Mpeg2FramerateConversionAlgorithm {
    val DUPLICATE_DROP = "DUPLICATE_DROP".asInstanceOf[Mpeg2FramerateConversionAlgorithm]
    val INTERPOLATE = "INTERPOLATE".asInstanceOf[Mpeg2FramerateConversionAlgorithm]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DUPLICATE_DROP, INTERPOLATE))
  }

  /**
    * Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
    */
  @js.native
  sealed trait Mpeg2GopSizeUnits extends js.Any
  object Mpeg2GopSizeUnits {
    val FRAMES = "FRAMES".asInstanceOf[Mpeg2GopSizeUnits]
    val SECONDS = "SECONDS".asInstanceOf[Mpeg2GopSizeUnits]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(FRAMES, SECONDS))
  }

  /**
    * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type.
    *   - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
    *   - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
    */
  @js.native
  sealed trait Mpeg2InterlaceMode extends js.Any
  object Mpeg2InterlaceMode {
    val PROGRESSIVE = "PROGRESSIVE".asInstanceOf[Mpeg2InterlaceMode]
    val TOP_FIELD = "TOP_FIELD".asInstanceOf[Mpeg2InterlaceMode]
    val BOTTOM_FIELD = "BOTTOM_FIELD".asInstanceOf[Mpeg2InterlaceMode]
    val FOLLOW_TOP_FIELD = "FOLLOW_TOP_FIELD".asInstanceOf[Mpeg2InterlaceMode]
    val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD".asInstanceOf[Mpeg2InterlaceMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD))
  }

  /**
    * Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision for intra-block DC coefficients. If you choose the value auto, the service will automatically select the precision based on the per-frame compression ratio.
    */
  @js.native
  sealed trait Mpeg2IntraDcPrecision extends js.Any
  object Mpeg2IntraDcPrecision {
    val AUTO = "AUTO".asInstanceOf[Mpeg2IntraDcPrecision]
    val INTRA_DC_PRECISION_8 = "INTRA_DC_PRECISION_8".asInstanceOf[Mpeg2IntraDcPrecision]
    val INTRA_DC_PRECISION_9 = "INTRA_DC_PRECISION_9".asInstanceOf[Mpeg2IntraDcPrecision]
    val INTRA_DC_PRECISION_10 = "INTRA_DC_PRECISION_10".asInstanceOf[Mpeg2IntraDcPrecision]
    val INTRA_DC_PRECISION_11 = "INTRA_DC_PRECISION_11".asInstanceOf[Mpeg2IntraDcPrecision]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(AUTO, INTRA_DC_PRECISION_8, INTRA_DC_PRECISION_9, INTRA_DC_PRECISION_10, INTRA_DC_PRECISION_11))
  }

  /**
    * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
    */
  @js.native
  sealed trait Mpeg2ParControl extends js.Any
  object Mpeg2ParControl {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[Mpeg2ParControl]
    val SPECIFIED = "SPECIFIED".asInstanceOf[Mpeg2ParControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, single-pass encoding.
    */
  @js.native
  sealed trait Mpeg2QualityTuningLevel extends js.Any
  object Mpeg2QualityTuningLevel {
    val SINGLE_PASS = "SINGLE_PASS".asInstanceOf[Mpeg2QualityTuningLevel]
    val MULTI_PASS = "MULTI_PASS".asInstanceOf[Mpeg2QualityTuningLevel]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(SINGLE_PASS, MULTI_PASS))
  }

  /**
    * Use Rate control mode (Mpeg2RateControlMode) to specifiy whether the bitrate is variable (vbr) or constant (cbr).
    */
  @js.native
  sealed trait Mpeg2RateControlMode extends js.Any
  object Mpeg2RateControlMode {
    val VBR = "VBR".asInstanceOf[Mpeg2RateControlMode]
    val CBR = "CBR".asInstanceOf[Mpeg2RateControlMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(VBR, CBR))
  }

  /**
    * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default.
    */
  @js.native
  sealed trait Mpeg2SceneChangeDetect extends js.Any
  object Mpeg2SceneChangeDetect {
    val DISABLED = "DISABLED".asInstanceOf[Mpeg2SceneChangeDetect]
    val ENABLED = "ENABLED".asInstanceOf[Mpeg2SceneChangeDetect]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
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
    @inline
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
        TemporalAdaptiveQuantization: js.UndefOr[Mpeg2TemporalAdaptiveQuantization] = js.undefined
    ): Mpeg2Settings = {
      val __obj = js.Dynamic.literal()
      AdaptiveQuantization.foreach(__v => __obj.updateDynamic("AdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      CodecLevel.foreach(__v => __obj.updateDynamic("CodecLevel")(__v.asInstanceOf[js.Any]))
      CodecProfile.foreach(__v => __obj.updateDynamic("CodecProfile")(__v.asInstanceOf[js.Any]))
      DynamicSubGop.foreach(__v => __obj.updateDynamic("DynamicSubGop")(__v.asInstanceOf[js.Any]))
      FramerateControl.foreach(__v => __obj.updateDynamic("FramerateControl")(__v.asInstanceOf[js.Any]))
      FramerateConversionAlgorithm.foreach(__v => __obj.updateDynamic("FramerateConversionAlgorithm")(__v.asInstanceOf[js.Any]))
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      GopClosedCadence.foreach(__v => __obj.updateDynamic("GopClosedCadence")(__v.asInstanceOf[js.Any]))
      GopSize.foreach(__v => __obj.updateDynamic("GopSize")(__v.asInstanceOf[js.Any]))
      GopSizeUnits.foreach(__v => __obj.updateDynamic("GopSizeUnits")(__v.asInstanceOf[js.Any]))
      HrdBufferInitialFillPercentage.foreach(__v => __obj.updateDynamic("HrdBufferInitialFillPercentage")(__v.asInstanceOf[js.Any]))
      HrdBufferSize.foreach(__v => __obj.updateDynamic("HrdBufferSize")(__v.asInstanceOf[js.Any]))
      InterlaceMode.foreach(__v => __obj.updateDynamic("InterlaceMode")(__v.asInstanceOf[js.Any]))
      IntraDcPrecision.foreach(__v => __obj.updateDynamic("IntraDcPrecision")(__v.asInstanceOf[js.Any]))
      MaxBitrate.foreach(__v => __obj.updateDynamic("MaxBitrate")(__v.asInstanceOf[js.Any]))
      MinIInterval.foreach(__v => __obj.updateDynamic("MinIInterval")(__v.asInstanceOf[js.Any]))
      NumberBFramesBetweenReferenceFrames.foreach(__v => __obj.updateDynamic("NumberBFramesBetweenReferenceFrames")(__v.asInstanceOf[js.Any]))
      ParControl.foreach(__v => __obj.updateDynamic("ParControl")(__v.asInstanceOf[js.Any]))
      ParDenominator.foreach(__v => __obj.updateDynamic("ParDenominator")(__v.asInstanceOf[js.Any]))
      ParNumerator.foreach(__v => __obj.updateDynamic("ParNumerator")(__v.asInstanceOf[js.Any]))
      QualityTuningLevel.foreach(__v => __obj.updateDynamic("QualityTuningLevel")(__v.asInstanceOf[js.Any]))
      RateControlMode.foreach(__v => __obj.updateDynamic("RateControlMode")(__v.asInstanceOf[js.Any]))
      SceneChangeDetect.foreach(__v => __obj.updateDynamic("SceneChangeDetect")(__v.asInstanceOf[js.Any]))
      SlowPal.foreach(__v => __obj.updateDynamic("SlowPal")(__v.asInstanceOf[js.Any]))
      Softness.foreach(__v => __obj.updateDynamic("Softness")(__v.asInstanceOf[js.Any]))
      SpatialAdaptiveQuantization.foreach(__v => __obj.updateDynamic("SpatialAdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      Syntax.foreach(__v => __obj.updateDynamic("Syntax")(__v.asInstanceOf[js.Any]))
      Telecine.foreach(__v => __obj.updateDynamic("Telecine")(__v.asInstanceOf[js.Any]))
      TemporalAdaptiveQuantization.foreach(__v => __obj.updateDynamic("TemporalAdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Mpeg2Settings]
    }
  }

  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  @js.native
  sealed trait Mpeg2SlowPal extends js.Any
  object Mpeg2SlowPal {
    val DISABLED = "DISABLED".asInstanceOf[Mpeg2SlowPal]
    val ENABLED = "ENABLED".asInstanceOf[Mpeg2SlowPal]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Adjust quantization within each frame based on spatial variation of content complexity.
    */
  @js.native
  sealed trait Mpeg2SpatialAdaptiveQuantization extends js.Any
  object Mpeg2SpatialAdaptiveQuantization {
    val DISABLED = "DISABLED".asInstanceOf[Mpeg2SpatialAdaptiveQuantization]
    val ENABLED = "ENABLED".asInstanceOf[Mpeg2SpatialAdaptiveQuantization]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Produces a Type D-10 compatible bitstream (SMPTE 356M-2001).
    */
  @js.native
  sealed trait Mpeg2Syntax extends js.Any
  object Mpeg2Syntax {
    val DEFAULT = "DEFAULT".asInstanceOf[Mpeg2Syntax]
    val D_10 = "D_10".asInstanceOf[Mpeg2Syntax]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DEFAULT, D_10))
  }

  /**
    * Only use Telecine (Mpeg2Telecine) when you set Framerate (Framerate) to 29.970. Set Telecine (Mpeg2Telecine) to Hard (hard) to produce a 29.97i output from a 23.976 input. Set it to Soft (soft) to produce 23.976 output and leave converstion to the player.
    */
  @js.native
  sealed trait Mpeg2Telecine extends js.Any
  object Mpeg2Telecine {
    val NONE = "NONE".asInstanceOf[Mpeg2Telecine]
    val SOFT = "SOFT".asInstanceOf[Mpeg2Telecine]
    val HARD = "HARD".asInstanceOf[Mpeg2Telecine]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NONE, SOFT, HARD))
  }

  /**
    * Adjust quantization within each frame based on temporal variation of content complexity.
    */
  @js.native
  sealed trait Mpeg2TemporalAdaptiveQuantization extends js.Any
  object Mpeg2TemporalAdaptiveQuantization {
    val DISABLED = "DISABLED".asInstanceOf[Mpeg2TemporalAdaptiveQuantization]
    val ENABLED = "ENABLED".asInstanceOf[Mpeg2TemporalAdaptiveQuantization]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Specify the details for each additional Microsoft Smooth Streaming manifest that you want the service to generate for this output group. Each manifest can reference a different subset of outputs in the group.
    */
  @js.native
  trait MsSmoothAdditionalManifest extends js.Object {
    var ManifestNameModifier: js.UndefOr[__stringMin1]
    var SelectedOutputs: js.UndefOr[__listOf__stringMin1]
  }

  object MsSmoothAdditionalManifest {
    @inline
    def apply(
        ManifestNameModifier: js.UndefOr[__stringMin1] = js.undefined,
        SelectedOutputs: js.UndefOr[__listOf__stringMin1] = js.undefined
    ): MsSmoothAdditionalManifest = {
      val __obj = js.Dynamic.literal()
      ManifestNameModifier.foreach(__v => __obj.updateDynamic("ManifestNameModifier")(__v.asInstanceOf[js.Any]))
      SelectedOutputs.foreach(__v => __obj.updateDynamic("SelectedOutputs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MsSmoothAdditionalManifest]
    }
  }

  /**
    * COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings across a Microsoft Smooth output group into a single audio stream.
    */
  @js.native
  sealed trait MsSmoothAudioDeduplication extends js.Any
  object MsSmoothAudioDeduplication {
    val COMBINE_DUPLICATE_STREAMS = "COMBINE_DUPLICATE_STREAMS".asInstanceOf[MsSmoothAudioDeduplication]
    val NONE = "NONE".asInstanceOf[MsSmoothAudioDeduplication]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(COMBINE_DUPLICATE_STREAMS, NONE))
  }

  /**
    * If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to specify the value SpekeKeyProvider.
    */
  @js.native
  trait MsSmoothEncryptionSettings extends js.Object {
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProvider]
  }

  object MsSmoothEncryptionSettings {
    @inline
    def apply(
        SpekeKeyProvider: js.UndefOr[SpekeKeyProvider] = js.undefined
    ): MsSmoothEncryptionSettings = {
      val __obj = js.Dynamic.literal()
      SpekeKeyProvider.foreach(__v => __obj.updateDynamic("SpekeKeyProvider")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MsSmoothEncryptionSettings]
    }
  }

  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to MS_SMOOTH_GROUP_SETTINGS.
    */
  @js.native
  trait MsSmoothGroupSettings extends js.Object {
    var AdditionalManifests: js.UndefOr[__listOfMsSmoothAdditionalManifest]
    var AudioDeduplication: js.UndefOr[MsSmoothAudioDeduplication]
    var Destination: js.UndefOr[__stringPatternS3]
    var DestinationSettings: js.UndefOr[DestinationSettings]
    var Encryption: js.UndefOr[MsSmoothEncryptionSettings]
    var FragmentLength: js.UndefOr[__integerMin1Max2147483647]
    var ManifestEncoding: js.UndefOr[MsSmoothManifestEncoding]
  }

  object MsSmoothGroupSettings {
    @inline
    def apply(
        AdditionalManifests: js.UndefOr[__listOfMsSmoothAdditionalManifest] = js.undefined,
        AudioDeduplication: js.UndefOr[MsSmoothAudioDeduplication] = js.undefined,
        Destination: js.UndefOr[__stringPatternS3] = js.undefined,
        DestinationSettings: js.UndefOr[DestinationSettings] = js.undefined,
        Encryption: js.UndefOr[MsSmoothEncryptionSettings] = js.undefined,
        FragmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        ManifestEncoding: js.UndefOr[MsSmoothManifestEncoding] = js.undefined
    ): MsSmoothGroupSettings = {
      val __obj = js.Dynamic.literal()
      AdditionalManifests.foreach(__v => __obj.updateDynamic("AdditionalManifests")(__v.asInstanceOf[js.Any]))
      AudioDeduplication.foreach(__v => __obj.updateDynamic("AudioDeduplication")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      DestinationSettings.foreach(__v => __obj.updateDynamic("DestinationSettings")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      FragmentLength.foreach(__v => __obj.updateDynamic("FragmentLength")(__v.asInstanceOf[js.Any]))
      ManifestEncoding.foreach(__v => __obj.updateDynamic("ManifestEncoding")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MsSmoothGroupSettings]
    }
  }

  /**
    * Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding format for the server and client manifest. Valid options are utf8 and utf16.
    */
  @js.native
  sealed trait MsSmoothManifestEncoding extends js.Any
  object MsSmoothManifestEncoding {
    val UTF8 = "UTF8".asInstanceOf[MsSmoothManifestEncoding]
    val UTF16 = "UTF16".asInstanceOf[MsSmoothManifestEncoding]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(UTF8, UTF16))
  }

  /**
    * Optional. When you have AFD signaling set up in your output video stream, use this setting to choose whether to also include it in the MXF wrapper. Choose Don't copy (NO_COPY) to exclude AFD signaling from the MXF wrapper. Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD values from the video stream for this output to the MXF wrapper. Regardless of which option you choose, the AFD values remain in the video stream. Related settings: To set up your output to include or exclude AFD values, see AfdSignaling, under VideoDescription. On the console, find AFD signaling under the output's video encoding settings.
    */
  @js.native
  sealed trait MxfAfdSignaling extends js.Any
  object MxfAfdSignaling {
    val NO_COPY = "NO_COPY".asInstanceOf[MxfAfdSignaling]
    val COPY_FROM_VIDEO = "COPY_FROM_VIDEO".asInstanceOf[MxfAfdSignaling]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NO_COPY, COPY_FROM_VIDEO))
  }

  /**
    * MXF settings
    */
  @js.native
  trait MxfSettings extends js.Object {
    var AfdSignaling: js.UndefOr[MxfAfdSignaling]
  }

  object MxfSettings {
    @inline
    def apply(
        AfdSignaling: js.UndefOr[MxfAfdSignaling] = js.undefined
    ): MxfSettings = {
      val __obj = js.Dynamic.literal()
      AfdSignaling.foreach(__v => __obj.updateDynamic("AfdSignaling")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MxfSettings]
    }
  }

  /**
    * For forensic video watermarking, MediaConvert supports Nagra NexGuard File Marker watermarking. MediaConvert supports both PreRelease Content (NGPR/G2) and OTT Streaming workflows.
    */
  @js.native
  trait NexGuardFileMarkerSettings extends js.Object {
    var License: js.UndefOr[__stringMin1Max100000]
    var Payload: js.UndefOr[__integerMin0Max4194303]
    var Preset: js.UndefOr[__stringMin1Max256]
    var Strength: js.UndefOr[WatermarkingStrength]
  }

  object NexGuardFileMarkerSettings {
    @inline
    def apply(
        License: js.UndefOr[__stringMin1Max100000] = js.undefined,
        Payload: js.UndefOr[__integerMin0Max4194303] = js.undefined,
        Preset: js.UndefOr[__stringMin1Max256] = js.undefined,
        Strength: js.UndefOr[WatermarkingStrength] = js.undefined
    ): NexGuardFileMarkerSettings = {
      val __obj = js.Dynamic.literal()
      License.foreach(__v => __obj.updateDynamic("License")(__v.asInstanceOf[js.Any]))
      Payload.foreach(__v => __obj.updateDynamic("Payload")(__v.asInstanceOf[js.Any]))
      Preset.foreach(__v => __obj.updateDynamic("Preset")(__v.asInstanceOf[js.Any]))
      Strength.foreach(__v => __obj.updateDynamic("Strength")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NexGuardFileMarkerSettings]
    }
  }

  /**
    * Settings for your Nielsen configuration. If you don't do Nielsen measurement and analytics, ignore these settings. When you enable Nielsen configuration (nielsenConfiguration), MediaConvert enables PCM to ID3 tagging for all outputs in the job. To enable Nielsen configuration programmatically, include an instance of nielsenConfiguration in your JSON job specification. Even if you don't include any children of nielsenConfiguration, you still enable the setting.
    */
  @js.native
  trait NielsenConfiguration extends js.Object {
    var BreakoutCode: js.UndefOr[__integerMin0Max0]
    var DistributorId: js.UndefOr[__string]
  }

  object NielsenConfiguration {
    @inline
    def apply(
        BreakoutCode: js.UndefOr[__integerMin0Max0] = js.undefined,
        DistributorId: js.UndefOr[__string] = js.undefined
    ): NielsenConfiguration = {
      val __obj = js.Dynamic.literal()
      BreakoutCode.foreach(__v => __obj.updateDynamic("BreakoutCode")(__v.asInstanceOf[js.Any]))
      DistributorId.foreach(__v => __obj.updateDynamic("DistributorId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NielsenConfiguration]
    }
  }

  /**
    * Optional. When you set Noise reducer (noiseReducer) to Temporal (TEMPORAL), you can optionally use this setting to apply additional sharpening. The default behavior, Auto (AUTO) allows the transcoder to determine whether to apply filtering, depending on input type and quality.
    */
  @js.native
  sealed trait NoiseFilterPostTemporalSharpening extends js.Any
  object NoiseFilterPostTemporalSharpening {
    val DISABLED = "DISABLED".asInstanceOf[NoiseFilterPostTemporalSharpening]
    val ENABLED = "ENABLED".asInstanceOf[NoiseFilterPostTemporalSharpening]
    val AUTO = "AUTO".asInstanceOf[NoiseFilterPostTemporalSharpening]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED, AUTO))
  }

  /**
    * Enable the Noise reducer (NoiseReducer) feature to remove noise from your video output if necessary. Enable or disable this feature for each output individually. This setting is disabled by default. When you enable Noise reducer (NoiseReducer), you must also select a value for Noise reducer filter (NoiseReducerFilter).
    */
  @js.native
  trait NoiseReducer extends js.Object {
    var Filter: js.UndefOr[NoiseReducerFilter]
    var FilterSettings: js.UndefOr[NoiseReducerFilterSettings]
    var SpatialFilterSettings: js.UndefOr[NoiseReducerSpatialFilterSettings]
    var TemporalFilterSettings: js.UndefOr[NoiseReducerTemporalFilterSettings]
  }

  object NoiseReducer {
    @inline
    def apply(
        Filter: js.UndefOr[NoiseReducerFilter] = js.undefined,
        FilterSettings: js.UndefOr[NoiseReducerFilterSettings] = js.undefined,
        SpatialFilterSettings: js.UndefOr[NoiseReducerSpatialFilterSettings] = js.undefined,
        TemporalFilterSettings: js.UndefOr[NoiseReducerTemporalFilterSettings] = js.undefined
    ): NoiseReducer = {
      val __obj = js.Dynamic.literal()
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      FilterSettings.foreach(__v => __obj.updateDynamic("FilterSettings")(__v.asInstanceOf[js.Any]))
      SpatialFilterSettings.foreach(__v => __obj.updateDynamic("SpatialFilterSettings")(__v.asInstanceOf[js.Any]))
      TemporalFilterSettings.foreach(__v => __obj.updateDynamic("TemporalFilterSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NoiseReducer]
    }
  }

  /**
    * Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering functions. To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral preserves edges while reducing noise. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) do convolution filtering. * Conserve does min/max noise reduction. * Spatial does frequency-domain filtering based on JND principles. * Temporal optimizes video quality for complex motion.
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(BILATERAL, MEAN, GAUSSIAN, LANCZOS, SHARPEN, CONSERVE, SPATIAL, TEMPORAL))
  }

  /**
    * Settings for a noise reducer filter
    */
  @js.native
  trait NoiseReducerFilterSettings extends js.Object {
    var Strength: js.UndefOr[__integerMin0Max3]
  }

  object NoiseReducerFilterSettings {
    @inline
    def apply(
        Strength: js.UndefOr[__integerMin0Max3] = js.undefined
    ): NoiseReducerFilterSettings = {
      val __obj = js.Dynamic.literal()
      Strength.foreach(__v => __obj.updateDynamic("Strength")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NoiseReducerFilterSettings]
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
    @inline
    def apply(
        PostFilterSharpenStrength: js.UndefOr[__integerMin0Max3] = js.undefined,
        Speed: js.UndefOr[__integerMinNegative2Max3] = js.undefined,
        Strength: js.UndefOr[__integerMin0Max16] = js.undefined
    ): NoiseReducerSpatialFilterSettings = {
      val __obj = js.Dynamic.literal()
      PostFilterSharpenStrength.foreach(__v => __obj.updateDynamic("PostFilterSharpenStrength")(__v.asInstanceOf[js.Any]))
      Speed.foreach(__v => __obj.updateDynamic("Speed")(__v.asInstanceOf[js.Any]))
      Strength.foreach(__v => __obj.updateDynamic("Strength")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NoiseReducerSpatialFilterSettings]
    }
  }

  /**
    * Noise reducer filter settings for temporal filter.
    */
  @js.native
  trait NoiseReducerTemporalFilterSettings extends js.Object {
    var AggressiveMode: js.UndefOr[__integerMin0Max4]
    var PostTemporalSharpening: js.UndefOr[NoiseFilterPostTemporalSharpening]
    var Speed: js.UndefOr[__integerMinNegative1Max3]
    var Strength: js.UndefOr[__integerMin0Max16]
  }

  object NoiseReducerTemporalFilterSettings {
    @inline
    def apply(
        AggressiveMode: js.UndefOr[__integerMin0Max4] = js.undefined,
        PostTemporalSharpening: js.UndefOr[NoiseFilterPostTemporalSharpening] = js.undefined,
        Speed: js.UndefOr[__integerMinNegative1Max3] = js.undefined,
        Strength: js.UndefOr[__integerMin0Max16] = js.undefined
    ): NoiseReducerTemporalFilterSettings = {
      val __obj = js.Dynamic.literal()
      AggressiveMode.foreach(__v => __obj.updateDynamic("AggressiveMode")(__v.asInstanceOf[js.Any]))
      PostTemporalSharpening.foreach(__v => __obj.updateDynamic("PostTemporalSharpening")(__v.asInstanceOf[js.Any]))
      Speed.foreach(__v => __obj.updateDynamic("Speed")(__v.asInstanceOf[js.Any]))
      Strength.foreach(__v => __obj.updateDynamic("Strength")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NoiseReducerTemporalFilterSettings]
    }
  }

  /**
    * Required when you set Codec, under AudioDescriptions>CodecSettings, to the value OPUS.
    */
  @js.native
  trait OpusSettings extends js.Object {
    var Bitrate: js.UndefOr[__integerMin32000Max192000]
    var Channels: js.UndefOr[__integerMin1Max2]
    var SampleRate: js.UndefOr[__integerMin16000Max48000]
  }

  object OpusSettings {
    @inline
    def apply(
        Bitrate: js.UndefOr[__integerMin32000Max192000] = js.undefined,
        Channels: js.UndefOr[__integerMin1Max2] = js.undefined,
        SampleRate: js.UndefOr[__integerMin16000Max48000] = js.undefined
    ): OpusSettings = {
      val __obj = js.Dynamic.literal()
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      Channels.foreach(__v => __obj.updateDynamic("Channels")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpusSettings]
    }
  }

  /**
    * Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource.
    */
  @js.native
  sealed trait Order extends js.Any
  object Order {
    val ASCENDING = "ASCENDING".asInstanceOf[Order]
    val DESCENDING = "DESCENDING".asInstanceOf[Order]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ASCENDING, DESCENDING))
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
    @inline
    def apply(
        AudioDescriptions: js.UndefOr[__listOfAudioDescription] = js.undefined,
        CaptionDescriptions: js.UndefOr[__listOfCaptionDescription] = js.undefined,
        ContainerSettings: js.UndefOr[ContainerSettings] = js.undefined,
        Extension: js.UndefOr[__string] = js.undefined,
        NameModifier: js.UndefOr[__stringMin1] = js.undefined,
        OutputSettings: js.UndefOr[OutputSettings] = js.undefined,
        Preset: js.UndefOr[__stringMin0] = js.undefined,
        VideoDescription: js.UndefOr[VideoDescription] = js.undefined
    ): Output = {
      val __obj = js.Dynamic.literal()
      AudioDescriptions.foreach(__v => __obj.updateDynamic("AudioDescriptions")(__v.asInstanceOf[js.Any]))
      CaptionDescriptions.foreach(__v => __obj.updateDynamic("CaptionDescriptions")(__v.asInstanceOf[js.Any]))
      ContainerSettings.foreach(__v => __obj.updateDynamic("ContainerSettings")(__v.asInstanceOf[js.Any]))
      Extension.foreach(__v => __obj.updateDynamic("Extension")(__v.asInstanceOf[js.Any]))
      NameModifier.foreach(__v => __obj.updateDynamic("NameModifier")(__v.asInstanceOf[js.Any]))
      OutputSettings.foreach(__v => __obj.updateDynamic("OutputSettings")(__v.asInstanceOf[js.Any]))
      Preset.foreach(__v => __obj.updateDynamic("Preset")(__v.asInstanceOf[js.Any]))
      VideoDescription.foreach(__v => __obj.updateDynamic("VideoDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Output]
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
    @inline
    def apply(
        InputChannels: js.UndefOr[__listOf__integerMinNegative60Max6] = js.undefined
    ): OutputChannelMapping = {
      val __obj = js.Dynamic.literal()
      InputChannels.foreach(__v => __obj.updateDynamic("InputChannels")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputChannelMapping]
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
    @inline
    def apply(
        DurationInMs: js.UndefOr[__integer] = js.undefined,
        VideoDetails: js.UndefOr[VideoDetail] = js.undefined
    ): OutputDetail = {
      val __obj = js.Dynamic.literal()
      DurationInMs.foreach(__v => __obj.updateDynamic("DurationInMs")(__v.asInstanceOf[js.Any]))
      VideoDetails.foreach(__v => __obj.updateDynamic("VideoDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputDetail]
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
    @inline
    def apply(
        CustomName: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        OutputGroupSettings: js.UndefOr[OutputGroupSettings] = js.undefined,
        Outputs: js.UndefOr[__listOfOutput] = js.undefined
    ): OutputGroup = {
      val __obj = js.Dynamic.literal()
      CustomName.foreach(__v => __obj.updateDynamic("CustomName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutputGroupSettings.foreach(__v => __obj.updateDynamic("OutputGroupSettings")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputGroup]
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
    @inline
    def apply(
        OutputDetails: js.UndefOr[__listOfOutputDetail] = js.undefined
    ): OutputGroupDetail = {
      val __obj = js.Dynamic.literal()
      OutputDetails.foreach(__v => __obj.updateDynamic("OutputDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputGroupDetail]
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
    @inline
    def apply(
        CmafGroupSettings: js.UndefOr[CmafGroupSettings] = js.undefined,
        DashIsoGroupSettings: js.UndefOr[DashIsoGroupSettings] = js.undefined,
        FileGroupSettings: js.UndefOr[FileGroupSettings] = js.undefined,
        HlsGroupSettings: js.UndefOr[HlsGroupSettings] = js.undefined,
        MsSmoothGroupSettings: js.UndefOr[MsSmoothGroupSettings] = js.undefined,
        Type: js.UndefOr[OutputGroupType] = js.undefined
    ): OutputGroupSettings = {
      val __obj = js.Dynamic.literal()
      CmafGroupSettings.foreach(__v => __obj.updateDynamic("CmafGroupSettings")(__v.asInstanceOf[js.Any]))
      DashIsoGroupSettings.foreach(__v => __obj.updateDynamic("DashIsoGroupSettings")(__v.asInstanceOf[js.Any]))
      FileGroupSettings.foreach(__v => __obj.updateDynamic("FileGroupSettings")(__v.asInstanceOf[js.Any]))
      HlsGroupSettings.foreach(__v => __obj.updateDynamic("HlsGroupSettings")(__v.asInstanceOf[js.Any]))
      MsSmoothGroupSettings.foreach(__v => __obj.updateDynamic("MsSmoothGroupSettings")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputGroupSettings]
    }
  }

  /**
    * Type of output group (File group, Apple HLS, DASH ISO, Microsoft Smooth Streaming, CMAF)
    */
  @js.native
  sealed trait OutputGroupType extends js.Any
  object OutputGroupType {
    val HLS_GROUP_SETTINGS = "HLS_GROUP_SETTINGS".asInstanceOf[OutputGroupType]
    val DASH_ISO_GROUP_SETTINGS = "DASH_ISO_GROUP_SETTINGS".asInstanceOf[OutputGroupType]
    val FILE_GROUP_SETTINGS = "FILE_GROUP_SETTINGS".asInstanceOf[OutputGroupType]
    val MS_SMOOTH_GROUP_SETTINGS = "MS_SMOOTH_GROUP_SETTINGS".asInstanceOf[OutputGroupType]
    val CMAF_GROUP_SETTINGS = "CMAF_GROUP_SETTINGS".asInstanceOf[OutputGroupType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(HLS_GROUP_SETTINGS, DASH_ISO_GROUP_SETTINGS, FILE_GROUP_SETTINGS, MS_SMOOTH_GROUP_SETTINGS, CMAF_GROUP_SETTINGS))
  }

  /**
    * Selects method of inserting SDT information into output stream.  "Follow input SDT" copies SDT information from input stream to  output stream. "Follow input SDT if present" copies SDT information from  input stream to output stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. Enter "SDT  Manually" means user will enter the SDT information. "No SDT" means output  stream will not contain SDT information.
    */
  @js.native
  sealed trait OutputSdt extends js.Any
  object OutputSdt {
    val SDT_FOLLOW = "SDT_FOLLOW".asInstanceOf[OutputSdt]
    val SDT_FOLLOW_IF_PRESENT = "SDT_FOLLOW_IF_PRESENT".asInstanceOf[OutputSdt]
    val SDT_MANUAL = "SDT_MANUAL".asInstanceOf[OutputSdt]
    val SDT_NONE = "SDT_NONE".asInstanceOf[OutputSdt]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(SDT_FOLLOW, SDT_FOLLOW_IF_PRESENT, SDT_MANUAL, SDT_NONE))
  }

  /**
    * Specific settings for this type of output.
    */
  @js.native
  trait OutputSettings extends js.Object {
    var HlsSettings: js.UndefOr[HlsSettings]
  }

  object OutputSettings {
    @inline
    def apply(
        HlsSettings: js.UndefOr[HlsSettings] = js.undefined
    ): OutputSettings = {
      val __obj = js.Dynamic.literal()
      HlsSettings.foreach(__v => __obj.updateDynamic("HlsSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputSettings]
    }
  }

  /**
    * If you work with a third party video watermarking partner, use the group of settings that correspond with your watermarking partner to include watermarks in your output.
    */
  @js.native
  trait PartnerWatermarking extends js.Object {
    var NexguardFileMarkerSettings: js.UndefOr[NexGuardFileMarkerSettings]
  }

  object PartnerWatermarking {
    @inline
    def apply(
        NexguardFileMarkerSettings: js.UndefOr[NexGuardFileMarkerSettings] = js.undefined
    ): PartnerWatermarking = {
      val __obj = js.Dynamic.literal()
      NexguardFileMarkerSettings.foreach(__v => __obj.updateDynamic("NexguardFileMarkerSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PartnerWatermarking]
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
    @inline
    def apply(
        Name: __string,
        Settings: PresetSettings,
        Arn: js.UndefOr[__string] = js.undefined,
        Category: js.UndefOr[__string] = js.undefined,
        CreatedAt: js.UndefOr[__timestampUnix] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        LastUpdated: js.UndefOr[__timestampUnix] = js.undefined,
        Type: js.UndefOr[Type] = js.undefined
    ): Preset = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any]
      )

      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Preset]
    }
  }

  /**
    * Optional. When you request a list of presets, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
    */
  @js.native
  sealed trait PresetListBy extends js.Any
  object PresetListBy {
    val NAME = "NAME".asInstanceOf[PresetListBy]
    val CREATION_DATE = "CREATION_DATE".asInstanceOf[PresetListBy]
    val SYSTEM = "SYSTEM".asInstanceOf[PresetListBy]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NAME, CREATION_DATE, SYSTEM))
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
    @inline
    def apply(
        AudioDescriptions: js.UndefOr[__listOfAudioDescription] = js.undefined,
        CaptionDescriptions: js.UndefOr[__listOfCaptionDescriptionPreset] = js.undefined,
        ContainerSettings: js.UndefOr[ContainerSettings] = js.undefined,
        VideoDescription: js.UndefOr[VideoDescription] = js.undefined
    ): PresetSettings = {
      val __obj = js.Dynamic.literal()
      AudioDescriptions.foreach(__v => __obj.updateDynamic("AudioDescriptions")(__v.asInstanceOf[js.Any]))
      CaptionDescriptions.foreach(__v => __obj.updateDynamic("CaptionDescriptions")(__v.asInstanceOf[js.Any]))
      ContainerSettings.foreach(__v => __obj.updateDynamic("ContainerSettings")(__v.asInstanceOf[js.Any]))
      VideoDescription.foreach(__v => __obj.updateDynamic("VideoDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PresetSettings]
    }
  }

  /**
    * Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment.
    */
  @js.native
  sealed trait PricingPlan extends js.Any
  object PricingPlan {
    val ON_DEMAND = "ON_DEMAND".asInstanceOf[PricingPlan]
    val RESERVED = "RESERVED".asInstanceOf[PricingPlan]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ON_DEMAND, RESERVED))
  }

  /**
    * Use Profile (ProResCodecProfile) to specifiy the type of Apple ProRes codec to use for this output.
    */
  @js.native
  sealed trait ProresCodecProfile extends js.Any
  object ProresCodecProfile {
    val APPLE_PRORES_422 = "APPLE_PRORES_422".asInstanceOf[ProresCodecProfile]
    val APPLE_PRORES_422_HQ = "APPLE_PRORES_422_HQ".asInstanceOf[ProresCodecProfile]
    val APPLE_PRORES_422_LT = "APPLE_PRORES_422_LT".asInstanceOf[ProresCodecProfile]
    val APPLE_PRORES_422_PROXY = "APPLE_PRORES_422_PROXY".asInstanceOf[ProresCodecProfile]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(APPLE_PRORES_422, APPLE_PRORES_422_HQ, APPLE_PRORES_422_LT, APPLE_PRORES_422_PROXY))
  }

  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  @js.native
  sealed trait ProresFramerateControl extends js.Any
  object ProresFramerateControl {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[ProresFramerateControl]
    val SPECIFIED = "SPECIFIED".asInstanceOf[ProresFramerateControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * Optional. Specify how the transcoder performs framerate conversion. The default behavior is to use duplicate drop conversion.
    */
  @js.native
  sealed trait ProresFramerateConversionAlgorithm extends js.Any
  object ProresFramerateConversionAlgorithm {
    val DUPLICATE_DROP = "DUPLICATE_DROP".asInstanceOf[ProresFramerateConversionAlgorithm]
    val INTERPOLATE = "INTERPOLATE".asInstanceOf[ProresFramerateConversionAlgorithm]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DUPLICATE_DROP, INTERPOLATE))
  }

  /**
    * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type.
    *   - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
    *   - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
    */
  @js.native
  sealed trait ProresInterlaceMode extends js.Any
  object ProresInterlaceMode {
    val PROGRESSIVE = "PROGRESSIVE".asInstanceOf[ProresInterlaceMode]
    val TOP_FIELD = "TOP_FIELD".asInstanceOf[ProresInterlaceMode]
    val BOTTOM_FIELD = "BOTTOM_FIELD".asInstanceOf[ProresInterlaceMode]
    val FOLLOW_TOP_FIELD = "FOLLOW_TOP_FIELD".asInstanceOf[ProresInterlaceMode]
    val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD".asInstanceOf[ProresInterlaceMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD))
  }

  /**
    * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
    */
  @js.native
  sealed trait ProresParControl extends js.Any
  object ProresParControl {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[ProresParControl]
    val SPECIFIED = "SPECIFIED".asInstanceOf[ProresParControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
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
    @inline
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
        Telecine: js.UndefOr[ProresTelecine] = js.undefined
    ): ProresSettings = {
      val __obj = js.Dynamic.literal()
      CodecProfile.foreach(__v => __obj.updateDynamic("CodecProfile")(__v.asInstanceOf[js.Any]))
      FramerateControl.foreach(__v => __obj.updateDynamic("FramerateControl")(__v.asInstanceOf[js.Any]))
      FramerateConversionAlgorithm.foreach(__v => __obj.updateDynamic("FramerateConversionAlgorithm")(__v.asInstanceOf[js.Any]))
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      InterlaceMode.foreach(__v => __obj.updateDynamic("InterlaceMode")(__v.asInstanceOf[js.Any]))
      ParControl.foreach(__v => __obj.updateDynamic("ParControl")(__v.asInstanceOf[js.Any]))
      ParDenominator.foreach(__v => __obj.updateDynamic("ParDenominator")(__v.asInstanceOf[js.Any]))
      ParNumerator.foreach(__v => __obj.updateDynamic("ParNumerator")(__v.asInstanceOf[js.Any]))
      SlowPal.foreach(__v => __obj.updateDynamic("SlowPal")(__v.asInstanceOf[js.Any]))
      Telecine.foreach(__v => __obj.updateDynamic("Telecine")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProresSettings]
    }
  }

  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  @js.native
  sealed trait ProresSlowPal extends js.Any
  object ProresSlowPal {
    val DISABLED = "DISABLED".asInstanceOf[ProresSlowPal]
    val ENABLED = "ENABLED".asInstanceOf[ProresSlowPal]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Only use Telecine (ProresTelecine) when you set Framerate (Framerate) to 29.970. Set Telecine (ProresTelecine) to Hard (hard) to produce a 29.97i output from a 23.976 input. Set it to Soft (soft) to produce 23.976 output and leave converstion to the player.
    */
  @js.native
  sealed trait ProresTelecine extends js.Any
  object ProresTelecine {
    val NONE = "NONE".asInstanceOf[ProresTelecine]
    val HARD = "HARD".asInstanceOf[ProresTelecine]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NONE, HARD))
  }

  /**
    * You can use queues to manage the resources that are available to your AWS account for running multiple transcoding jobs at the same time. If you don't specify a queue, the service sends all jobs through the default queue. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html.
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
    @inline
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
        Type: js.UndefOr[Type] = js.undefined
    ): Queue = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      PricingPlan.foreach(__v => __obj.updateDynamic("PricingPlan")(__v.asInstanceOf[js.Any]))
      ProgressingJobsCount.foreach(__v => __obj.updateDynamic("ProgressingJobsCount")(__v.asInstanceOf[js.Any]))
      ReservationPlan.foreach(__v => __obj.updateDynamic("ReservationPlan")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SubmittedJobsCount.foreach(__v => __obj.updateDynamic("SubmittedJobsCount")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Queue]
    }
  }

  /**
    * Optional. When you request a list of queues, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by creation date.
    */
  @js.native
  sealed trait QueueListBy extends js.Any
  object QueueListBy {
    val NAME = "NAME".asInstanceOf[QueueListBy]
    val CREATION_DATE = "CREATION_DATE".asInstanceOf[QueueListBy]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NAME, CREATION_DATE))
  }

  /**
    * Queues can be ACTIVE or PAUSED. If you pause a queue, jobs in that queue won't begin. Jobs that are running when you pause a queue continue to run until they finish or result in an error.
    */
  @js.native
  sealed trait QueueStatus extends js.Any
  object QueueStatus {
    val ACTIVE = "ACTIVE".asInstanceOf[QueueStatus]
    val PAUSED = "PAUSED".asInstanceOf[QueueStatus]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ACTIVE, PAUSED))
  }

  /**
    * Description of the source and destination queues between which the job has moved, along with the timestamp of the move
    */
  @js.native
  trait QueueTransition extends js.Object {
    var DestinationQueue: js.UndefOr[__string]
    var SourceQueue: js.UndefOr[__string]
    var Timestamp: js.UndefOr[__timestampUnix]
  }

  object QueueTransition {
    @inline
    def apply(
        DestinationQueue: js.UndefOr[__string] = js.undefined,
        SourceQueue: js.UndefOr[__string] = js.undefined,
        Timestamp: js.UndefOr[__timestampUnix] = js.undefined
    ): QueueTransition = {
      val __obj = js.Dynamic.literal()
      DestinationQueue.foreach(__v => __obj.updateDynamic("DestinationQueue")(__v.asInstanceOf[js.Any]))
      SourceQueue.foreach(__v => __obj.updateDynamic("SourceQueue")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueueTransition]
    }
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
    @inline
    def apply(
        Height: js.UndefOr[__integerMin2Max2147483647] = js.undefined,
        Width: js.UndefOr[__integerMin2Max2147483647] = js.undefined,
        X: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        Y: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    ): Rectangle = {
      val __obj = js.Dynamic.literal()
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      X.foreach(__v => __obj.updateDynamic("X")(__v.asInstanceOf[js.Any]))
      Y.foreach(__v => __obj.updateDynamic("Y")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Rectangle]
    }
  }

  /**
    * Use Manual audio remixing (RemixSettings) to adjust audio levels for each audio channel in each output of your job. With audio remixing, you can output more or fewer audio channels than your input audio source provides.
    */
  @js.native
  trait RemixSettings extends js.Object {
    var ChannelMapping: js.UndefOr[ChannelMapping]
    var ChannelsIn: js.UndefOr[__integerMin1Max64]
    var ChannelsOut: js.UndefOr[__integerMin1Max64]
  }

  object RemixSettings {
    @inline
    def apply(
        ChannelMapping: js.UndefOr[ChannelMapping] = js.undefined,
        ChannelsIn: js.UndefOr[__integerMin1Max64] = js.undefined,
        ChannelsOut: js.UndefOr[__integerMin1Max64] = js.undefined
    ): RemixSettings = {
      val __obj = js.Dynamic.literal()
      ChannelMapping.foreach(__v => __obj.updateDynamic("ChannelMapping")(__v.asInstanceOf[js.Any]))
      ChannelsIn.foreach(__v => __obj.updateDynamic("ChannelsIn")(__v.asInstanceOf[js.Any]))
      ChannelsOut.foreach(__v => __obj.updateDynamic("ChannelsOut")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemixSettings]
    }
  }

  /**
    * Specifies whether the term of your reserved queue pricing plan is automatically extended (AUTO_RENEW) or expires (EXPIRE) at the end of the term.
    */
  @js.native
  sealed trait RenewalType extends js.Any
  object RenewalType {
    val AUTO_RENEW = "AUTO_RENEW".asInstanceOf[RenewalType]
    val EXPIRE = "EXPIRE".asInstanceOf[RenewalType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(AUTO_RENEW, EXPIRE))
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
    @inline
    def apply(
        Commitment: js.UndefOr[Commitment] = js.undefined,
        ExpiresAt: js.UndefOr[__timestampUnix] = js.undefined,
        PurchasedAt: js.UndefOr[__timestampUnix] = js.undefined,
        RenewalType: js.UndefOr[RenewalType] = js.undefined,
        ReservedSlots: js.UndefOr[__integer] = js.undefined,
        Status: js.UndefOr[ReservationPlanStatus] = js.undefined
    ): ReservationPlan = {
      val __obj = js.Dynamic.literal()
      Commitment.foreach(__v => __obj.updateDynamic("Commitment")(__v.asInstanceOf[js.Any]))
      ExpiresAt.foreach(__v => __obj.updateDynamic("ExpiresAt")(__v.asInstanceOf[js.Any]))
      PurchasedAt.foreach(__v => __obj.updateDynamic("PurchasedAt")(__v.asInstanceOf[js.Any]))
      RenewalType.foreach(__v => __obj.updateDynamic("RenewalType")(__v.asInstanceOf[js.Any]))
      ReservedSlots.foreach(__v => __obj.updateDynamic("ReservedSlots")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservationPlan]
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
    @inline
    def apply(
        Commitment: Commitment,
        RenewalType: RenewalType,
        ReservedSlots: __integer
    ): ReservationPlanSettings = {
      val __obj = js.Dynamic.literal(
        "Commitment" -> Commitment.asInstanceOf[js.Any],
        "RenewalType" -> RenewalType.asInstanceOf[js.Any],
        "ReservedSlots" -> ReservedSlots.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ReservationPlanSettings]
    }
  }

  /**
    * Specifies whether the pricing plan for your reserved queue is ACTIVE or EXPIRED.
    */
  @js.native
  sealed trait ReservationPlanStatus extends js.Any
  object ReservationPlanStatus {
    val ACTIVE = "ACTIVE".asInstanceOf[ReservationPlanStatus]
    val EXPIRED = "EXPIRED".asInstanceOf[ReservationPlanStatus]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ACTIVE, EXPIRED))
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
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): ResourceTags = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceTags]
    }
  }

  /**
    * Use Respond to AFD (RespondToAfd) to specify how the service changes the video itself in response to AFD values in the input. * Choose Respond to clip the input video frame according to the AFD value, input display aspect ratio, and output display aspect ratio. * Choose Passthrough to include the input AFD values. Do not choose this when AfdSignaling is set to (NONE). A preferred implementation of this workflow is to set RespondToAfd to (NONE) and set AfdSignaling to (AUTO). * Choose None to remove all input AFD values from this output.
    */
  @js.native
  sealed trait RespondToAfd extends js.Any
  object RespondToAfd {
    val NONE = "NONE".asInstanceOf[RespondToAfd]
    val RESPOND = "RESPOND".asInstanceOf[RespondToAfd]
    val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[RespondToAfd]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NONE, RESPOND, PASSTHROUGH))
  }

  /**
    * Optional. Have MediaConvert automatically apply Amazon S3 access control for the outputs in this output group. When you don't use this setting, S3 automatically applies the default access control list PRIVATE.
    */
  @js.native
  trait S3DestinationAccessControl extends js.Object {
    var CannedAcl: js.UndefOr[S3ObjectCannedAcl]
  }

  object S3DestinationAccessControl {
    @inline
    def apply(
        CannedAcl: js.UndefOr[S3ObjectCannedAcl] = js.undefined
    ): S3DestinationAccessControl = {
      val __obj = js.Dynamic.literal()
      CannedAcl.foreach(__v => __obj.updateDynamic("CannedAcl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3DestinationAccessControl]
    }
  }

  /**
    * Settings associated with S3 destination
    */
  @js.native
  trait S3DestinationSettings extends js.Object {
    var AccessControl: js.UndefOr[S3DestinationAccessControl]
    var Encryption: js.UndefOr[S3EncryptionSettings]
  }

  object S3DestinationSettings {
    @inline
    def apply(
        AccessControl: js.UndefOr[S3DestinationAccessControl] = js.undefined,
        Encryption: js.UndefOr[S3EncryptionSettings] = js.undefined
    ): S3DestinationSettings = {
      val __obj = js.Dynamic.literal()
      AccessControl.foreach(__v => __obj.updateDynamic("AccessControl")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3DestinationSettings]
    }
  }

  /**
    * Settings for how your job outputs are encrypted as they are uploaded to Amazon S3.
    */
  @js.native
  trait S3EncryptionSettings extends js.Object {
    var EncryptionType: js.UndefOr[S3ServerSideEncryptionType]
    var KmsKeyArn: js.UndefOr[__stringPatternArnAwsUsGovCnKmsAZ26EastWestCentralNorthSouthEastWest1912D12KeyAFAF098AFAF094AFAF094AFAF094AFAF0912]
  }

  object S3EncryptionSettings {
    @inline
    def apply(
        EncryptionType: js.UndefOr[S3ServerSideEncryptionType] = js.undefined,
        KmsKeyArn: js.UndefOr[__stringPatternArnAwsUsGovCnKmsAZ26EastWestCentralNorthSouthEastWest1912D12KeyAFAF098AFAF094AFAF094AFAF094AFAF0912] = js.undefined
    ): S3EncryptionSettings = {
      val __obj = js.Dynamic.literal()
      EncryptionType.foreach(__v => __obj.updateDynamic("EncryptionType")(__v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3EncryptionSettings]
    }
  }

  /**
    * Choose an Amazon S3 canned ACL for MediaConvert to apply to this output.
    */
  @js.native
  sealed trait S3ObjectCannedAcl extends js.Any
  object S3ObjectCannedAcl {
    val PUBLIC_READ = "PUBLIC_READ".asInstanceOf[S3ObjectCannedAcl]
    val AUTHENTICATED_READ = "AUTHENTICATED_READ".asInstanceOf[S3ObjectCannedAcl]
    val BUCKET_OWNER_READ = "BUCKET_OWNER_READ".asInstanceOf[S3ObjectCannedAcl]
    val BUCKET_OWNER_FULL_CONTROL = "BUCKET_OWNER_FULL_CONTROL".asInstanceOf[S3ObjectCannedAcl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PUBLIC_READ, AUTHENTICATED_READ, BUCKET_OWNER_READ, BUCKET_OWNER_FULL_CONTROL))
  }

  /**
    * Specify how you want your data keys managed. AWS uses data keys to encrypt your content. AWS also encrypts the data keys themselves, using a customer master key (CMK), and then stores the encrypted data keys alongside your encrypted content. Use this setting to specify which AWS service manages the CMK. For simplest set up, choose Amazon S3 (SERVER_SIDE_ENCRYPTION_S3). If you want your master key to be managed by AWS Key Management Service (KMS), choose AWS KMS (SERVER_SIDE_ENCRYPTION_KMS). By default, when you choose AWS KMS, KMS uses the AWS managed customer master key (CMK) associated with Amazon S3 to encrypt your data keys. You can optionally choose to specify a different, customer managed CMK. Do so by specifying the Amazon Resource Name (ARN) of the key for the setting  KMS ARN (kmsKeyArn).
    */
  @js.native
  sealed trait S3ServerSideEncryptionType extends js.Any
  object S3ServerSideEncryptionType {
    val SERVER_SIDE_ENCRYPTION_S3 = "SERVER_SIDE_ENCRYPTION_S3".asInstanceOf[S3ServerSideEncryptionType]
    val SERVER_SIDE_ENCRYPTION_KMS = "SERVER_SIDE_ENCRYPTION_KMS".asInstanceOf[S3ServerSideEncryptionType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(SERVER_SIDE_ENCRYPTION_S3, SERVER_SIDE_ENCRYPTION_KMS))
  }

  /**
    * Specify how the service handles outputs that have a different aspect ratio from the input aspect ratio. Choose Stretch to output (STRETCH_TO_OUTPUT) to have the service stretch your video image to fit. Keep the setting Default (DEFAULT) to have the service letterbox your video instead. This setting overrides any value that you specify for the setting Selection placement (position) in this output.
    */
  @js.native
  sealed trait ScalingBehavior extends js.Any
  object ScalingBehavior {
    val DEFAULT = "DEFAULT".asInstanceOf[ScalingBehavior]
    val STRETCH_TO_OUTPUT = "STRETCH_TO_OUTPUT".asInstanceOf[ScalingBehavior]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DEFAULT, STRETCH_TO_OUTPUT))
  }

  /**
    * Set Framerate (SccDestinationFramerate) to make sure that the captions and the video are synchronized in the output. Specify a frame rate that matches the frame rate of the associated video. If the video frame rate is 29.97, choose 29.97 dropframe (FRAMERATE_29_97_DROPFRAME) only if the video has video_insertion=true and drop_frame_timecode=true; otherwise, choose 29.97 non-dropframe (FRAMERATE_29_97_NON_DROPFRAME).
    */
  @js.native
  sealed trait SccDestinationFramerate extends js.Any
  object SccDestinationFramerate {
    val FRAMERATE_23_97 = "FRAMERATE_23_97".asInstanceOf[SccDestinationFramerate]
    val FRAMERATE_24 = "FRAMERATE_24".asInstanceOf[SccDestinationFramerate]
    val FRAMERATE_25 = "FRAMERATE_25".asInstanceOf[SccDestinationFramerate]
    val FRAMERATE_29_97_DROPFRAME = "FRAMERATE_29_97_DROPFRAME".asInstanceOf[SccDestinationFramerate]
    val FRAMERATE_29_97_NON_DROPFRAME = "FRAMERATE_29_97_NON_DROPFRAME".asInstanceOf[SccDestinationFramerate]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(FRAMERATE_23_97, FRAMERATE_24, FRAMERATE_25, FRAMERATE_29_97_DROPFRAME, FRAMERATE_29_97_NON_DROPFRAME))
  }

  /**
    * Settings for SCC caption output.
    */
  @js.native
  trait SccDestinationSettings extends js.Object {
    var Framerate: js.UndefOr[SccDestinationFramerate]
  }

  object SccDestinationSettings {
    @inline
    def apply(
        Framerate: js.UndefOr[SccDestinationFramerate] = js.undefined
    ): SccDestinationSettings = {
      val __obj = js.Dynamic.literal()
      Framerate.foreach(__v => __obj.updateDynamic("Framerate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SccDestinationSettings]
    }
  }

  /**
    * Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you need. When this is enabled, MediaConvert runs your job from an on-demand queue with similar performance to what you will see with one RTS in a reserved queue. This setting is disabled by default.
    */
  @js.native
  sealed trait SimulateReservedQueue extends js.Any
  object SimulateReservedQueue {
    val DISABLED = "DISABLED".asInstanceOf[SimulateReservedQueue]
    val ENABLED = "ENABLED".asInstanceOf[SimulateReservedQueue]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a SPEKE-compliant key provider.  If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
    */
  @js.native
  trait SpekeKeyProvider extends js.Object {
    var CertificateArn: js.UndefOr[__stringPatternArnAwsUsGovAcm]
    var ResourceId: js.UndefOr[__string]
    var SystemIds: js.UndefOr[__listOf__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12]
    var Url: js.UndefOr[__stringPatternHttps]
  }

  object SpekeKeyProvider {
    @inline
    def apply(
        CertificateArn: js.UndefOr[__stringPatternArnAwsUsGovAcm] = js.undefined,
        ResourceId: js.UndefOr[__string] = js.undefined,
        SystemIds: js.UndefOr[__listOf__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12] = js.undefined,
        Url: js.UndefOr[__stringPatternHttps] = js.undefined
    ): SpekeKeyProvider = {
      val __obj = js.Dynamic.literal()
      CertificateArn.foreach(__v => __obj.updateDynamic("CertificateArn")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      SystemIds.foreach(__v => __obj.updateDynamic("SystemIds")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SpekeKeyProvider]
    }
  }

  /**
    * If your output group type is CMAF, use these settings when doing DRM encryption with a SPEKE-compliant key provider. If your output group type is HLS, DASH, or Microsoft Smooth, use the SpekeKeyProvider settings instead.
    */
  @js.native
  trait SpekeKeyProviderCmaf extends js.Object {
    var CertificateArn: js.UndefOr[__stringPatternArnAwsUsGovAcm]
    var DashSignaledSystemIds: js.UndefOr[__listOf__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12]
    var HlsSignaledSystemIds: js.UndefOr[__listOf__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12]
    var ResourceId: js.UndefOr[__stringPatternW]
    var Url: js.UndefOr[__stringPatternHttps]
  }

  object SpekeKeyProviderCmaf {
    @inline
    def apply(
        CertificateArn: js.UndefOr[__stringPatternArnAwsUsGovAcm] = js.undefined,
        DashSignaledSystemIds: js.UndefOr[__listOf__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12] = js.undefined,
        HlsSignaledSystemIds: js.UndefOr[__listOf__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12] = js.undefined,
        ResourceId: js.UndefOr[__stringPatternW] = js.undefined,
        Url: js.UndefOr[__stringPatternHttps] = js.undefined
    ): SpekeKeyProviderCmaf = {
      val __obj = js.Dynamic.literal()
      CertificateArn.foreach(__v => __obj.updateDynamic("CertificateArn")(__v.asInstanceOf[js.Any]))
      DashSignaledSystemIds.foreach(__v => __obj.updateDynamic("DashSignaledSystemIds")(__v.asInstanceOf[js.Any]))
      HlsSignaledSystemIds.foreach(__v => __obj.updateDynamic("HlsSignaledSystemIds")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SpekeKeyProviderCmaf]
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
    @inline
    def apply(
        KeyFormat: js.UndefOr[__stringPatternIdentityAZaZ26AZaZ09163] = js.undefined,
        KeyFormatVersions: js.UndefOr[__stringPatternDD] = js.undefined,
        StaticKeyValue: js.UndefOr[__stringPatternAZaZ0932] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined
    ): StaticKeyProvider = {
      val __obj = js.Dynamic.literal()
      KeyFormat.foreach(__v => __obj.updateDynamic("KeyFormat")(__v.asInstanceOf[js.Any]))
      KeyFormatVersions.foreach(__v => __obj.updateDynamic("KeyFormatVersions")(__v.asInstanceOf[js.Any]))
      StaticKeyValue.foreach(__v => __obj.updateDynamic("StaticKeyValue")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StaticKeyProvider]
    }
  }

  /**
    * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error.
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(
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
    ))
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var Arn: __string
    var Tags: __mapOf__string
  }

  object TagResourceRequest {
    @inline
    def apply(
        Arn: __string,
        Tags: __mapOf__string
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /**
    * Settings for Teletext caption output
    */
  @js.native
  trait TeletextDestinationSettings extends js.Object {
    var PageNumber: js.UndefOr[__stringMin3Max3Pattern1809aFAF09aEAE]
    var PageTypes: js.UndefOr[__listOfTeletextPageType]
  }

  object TeletextDestinationSettings {
    @inline
    def apply(
        PageNumber: js.UndefOr[__stringMin3Max3Pattern1809aFAF09aEAE] = js.undefined,
        PageTypes: js.UndefOr[__listOfTeletextPageType] = js.undefined
    ): TeletextDestinationSettings = {
      val __obj = js.Dynamic.literal()
      PageNumber.foreach(__v => __obj.updateDynamic("PageNumber")(__v.asInstanceOf[js.Any]))
      PageTypes.foreach(__v => __obj.updateDynamic("PageTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TeletextDestinationSettings]
    }
  }

  /**
    * A page type as defined in the standard ETSI EN 300 468, Table 94
    */
  @js.native
  sealed trait TeletextPageType extends js.Any
  object TeletextPageType {
    val PAGE_TYPE_INITIAL = "PAGE_TYPE_INITIAL".asInstanceOf[TeletextPageType]
    val PAGE_TYPE_SUBTITLE = "PAGE_TYPE_SUBTITLE".asInstanceOf[TeletextPageType]
    val PAGE_TYPE_ADDL_INFO = "PAGE_TYPE_ADDL_INFO".asInstanceOf[TeletextPageType]
    val PAGE_TYPE_PROGRAM_SCHEDULE = "PAGE_TYPE_PROGRAM_SCHEDULE".asInstanceOf[TeletextPageType]
    val PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE = "PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE".asInstanceOf[TeletextPageType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PAGE_TYPE_INITIAL, PAGE_TYPE_SUBTITLE, PAGE_TYPE_ADDL_INFO, PAGE_TYPE_PROGRAM_SCHEDULE, PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE))
  }

  /**
    * Settings specific to Teletext caption sources, including Page number.
    */
  @js.native
  trait TeletextSourceSettings extends js.Object {
    var PageNumber: js.UndefOr[__stringMin3Max3Pattern1809aFAF09aEAE]
  }

  object TeletextSourceSettings {
    @inline
    def apply(
        PageNumber: js.UndefOr[__stringMin3Max3Pattern1809aFAF09aEAE] = js.undefined
    ): TeletextSourceSettings = {
      val __obj = js.Dynamic.literal()
      PageNumber.foreach(__v => __obj.updateDynamic("PageNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TeletextSourceSettings]
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
    @inline
    def apply(
        FontSize: js.UndefOr[__integerMin10Max48] = js.undefined,
        Position: js.UndefOr[TimecodeBurninPosition] = js.undefined,
        Prefix: js.UndefOr[__stringPattern] = js.undefined
    ): TimecodeBurnin = {
      val __obj = js.Dynamic.literal()
      FontSize.foreach(__v => __obj.updateDynamic("FontSize")(__v.asInstanceOf[js.Any]))
      Position.foreach(__v => __obj.updateDynamic("Position")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimecodeBurnin]
    }
  }

  /**
    * Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to specify the location the burned-in timecode on output video.
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

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(TOP_CENTER, TOP_LEFT, TOP_RIGHT, MIDDLE_LEFT, MIDDLE_CENTER, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT))
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
    @inline
    def apply(
        Anchor: js.UndefOr[__stringPattern010920405090509092] = js.undefined,
        Source: js.UndefOr[TimecodeSource] = js.undefined,
        Start: js.UndefOr[__stringPattern010920405090509092] = js.undefined,
        TimestampOffset: js.UndefOr[__stringPattern0940191020191209301] = js.undefined
    ): TimecodeConfig = {
      val __obj = js.Dynamic.literal()
      Anchor.foreach(__v => __obj.updateDynamic("Anchor")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Start.foreach(__v => __obj.updateDynamic("Start")(__v.asInstanceOf[js.Any]))
      TimestampOffset.foreach(__v => __obj.updateDynamic("TimestampOffset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimecodeConfig]
    }
  }

  /**
    * Use Source (TimecodeSource) to set how timecodes are handled within this job. To make sure that your video, audio, captions, and markers are synchronized and that time-based features, such as image inserter, work correctly, choose the Timecode source option that matches your assets. All timecodes are in a 24-hour format with frame number (HH:MM:SS:FF). * Embedded (EMBEDDED) - Use the timecode that is in the input video. If no embedded timecode is in the source, the service will use Start at 0 (ZEROBASED) instead. * Start at 0 (ZEROBASED) - Set the timecode of the initial frame to 00:00:00:00. * Specified Start (SPECIFIEDSTART) - Set the timecode of the initial frame to a value other than zero. You use Start timecode (Start) to provide this value.
    */
  @js.native
  sealed trait TimecodeSource extends js.Any
  object TimecodeSource {
    val EMBEDDED = "EMBEDDED".asInstanceOf[TimecodeSource]
    val ZEROBASED = "ZEROBASED".asInstanceOf[TimecodeSource]
    val SPECIFIEDSTART = "SPECIFIEDSTART".asInstanceOf[TimecodeSource]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(EMBEDDED, ZEROBASED, SPECIFIEDSTART))
  }

  /**
    * Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed metadata from the input in this output.
    */
  @js.native
  sealed trait TimedMetadata extends js.Any
  object TimedMetadata {
    val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[TimedMetadata]
    val NONE = "NONE".asInstanceOf[TimedMetadata]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PASSTHROUGH, NONE))
  }

  /**
    * Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3 tags in your job. To include timed metadata, you must enable it here, enable it in each output container, and specify tags and timecodes in ID3 insertion (Id3Insertion) objects.
    */
  @js.native
  trait TimedMetadataInsertion extends js.Object {
    var Id3Insertions: js.UndefOr[__listOfId3Insertion]
  }

  object TimedMetadataInsertion {
    @inline
    def apply(
        Id3Insertions: js.UndefOr[__listOfId3Insertion] = js.undefined
    ): TimedMetadataInsertion = {
      val __obj = js.Dynamic.literal()
      Id3Insertions.foreach(__v => __obj.updateDynamic("Id3Insertions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimedMetadataInsertion]
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
    @inline
    def apply(
        FinishTime: js.UndefOr[__timestampUnix] = js.undefined,
        StartTime: js.UndefOr[__timestampUnix] = js.undefined,
        SubmitTime: js.UndefOr[__timestampUnix] = js.undefined
    ): Timing = {
      val __obj = js.Dynamic.literal()
      FinishTime.foreach(__v => __obj.updateDynamic("FinishTime")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      SubmitTime.foreach(__v => __obj.updateDynamic("SubmitTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Timing]
    }
  }

  /**
    * Settings specific to caption sources that are specified by track number. Currently, this is only IMSC captions in an IMF package. If your caption source is IMSC 1.1 in a separate xml file, use FileSourceSettings instead of TrackSourceSettings.
    */
  @js.native
  trait TrackSourceSettings extends js.Object {
    var TrackNumber: js.UndefOr[__integerMin1Max2147483647]
  }

  object TrackSourceSettings {
    @inline
    def apply(
        TrackNumber: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    ): TrackSourceSettings = {
      val __obj = js.Dynamic.literal()
      TrackNumber.foreach(__v => __obj.updateDynamic("TrackNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrackSourceSettings]
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
    @inline
    def apply(
        StylePassthrough: js.UndefOr[TtmlStylePassthrough] = js.undefined
    ): TtmlDestinationSettings = {
      val __obj = js.Dynamic.literal()
      StylePassthrough.foreach(__v => __obj.updateDynamic("StylePassthrough")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TtmlDestinationSettings]
    }
  }

  /**
    * Pass through style and position information from a TTML-like input source (TTML, SMPTE-TT) to the TTML output.
    */
  @js.native
  sealed trait TtmlStylePassthrough extends js.Any
  object TtmlStylePassthrough {
    val ENABLED = "ENABLED".asInstanceOf[TtmlStylePassthrough]
    val DISABLED = "DISABLED".asInstanceOf[TtmlStylePassthrough]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  @js.native
  sealed trait Type extends js.Any
  object Type {
    val SYSTEM = "SYSTEM".asInstanceOf[Type]
    val CUSTOM = "CUSTOM".asInstanceOf[Type]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(SYSTEM, CUSTOM))
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var Arn: __string
    var TagKeys: js.UndefOr[__listOf__string]
  }

  object UntagResourceRequest {
    @inline
    def apply(
        Arn: __string,
        TagKeys: js.UndefOr[__listOf__string] = js.undefined
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      TagKeys.foreach(__v => __obj.updateDynamic("TagKeys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateJobTemplateRequest extends js.Object {
    var Name: __string
    var AccelerationSettings: js.UndefOr[AccelerationSettings]
    var Category: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HopDestinations: js.UndefOr[__listOfHopDestination]
    var Priority: js.UndefOr[__integerMinNegative50Max50]
    var Queue: js.UndefOr[__string]
    var Settings: js.UndefOr[JobTemplateSettings]
    var StatusUpdateInterval: js.UndefOr[StatusUpdateInterval]
  }

  object UpdateJobTemplateRequest {
    @inline
    def apply(
        Name: __string,
        AccelerationSettings: js.UndefOr[AccelerationSettings] = js.undefined,
        Category: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HopDestinations: js.UndefOr[__listOfHopDestination] = js.undefined,
        Priority: js.UndefOr[__integerMinNegative50Max50] = js.undefined,
        Queue: js.UndefOr[__string] = js.undefined,
        Settings: js.UndefOr[JobTemplateSettings] = js.undefined,
        StatusUpdateInterval: js.UndefOr[StatusUpdateInterval] = js.undefined
    ): UpdateJobTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AccelerationSettings.foreach(__v => __obj.updateDynamic("AccelerationSettings")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HopDestinations.foreach(__v => __obj.updateDynamic("HopDestinations")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      Settings.foreach(__v => __obj.updateDynamic("Settings")(__v.asInstanceOf[js.Any]))
      StatusUpdateInterval.foreach(__v => __obj.updateDynamic("StatusUpdateInterval")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJobTemplateRequest]
    }
  }

  @js.native
  trait UpdateJobTemplateResponse extends js.Object {
    var JobTemplate: js.UndefOr[JobTemplate]
  }

  object UpdateJobTemplateResponse {
    @inline
    def apply(
        JobTemplate: js.UndefOr[JobTemplate] = js.undefined
    ): UpdateJobTemplateResponse = {
      val __obj = js.Dynamic.literal()
      JobTemplate.foreach(__v => __obj.updateDynamic("JobTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJobTemplateResponse]
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
    @inline
    def apply(
        Name: __string,
        Category: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        Settings: js.UndefOr[PresetSettings] = js.undefined
    ): UpdatePresetRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Settings.foreach(__v => __obj.updateDynamic("Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePresetRequest]
    }
  }

  @js.native
  trait UpdatePresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset]
  }

  object UpdatePresetResponse {
    @inline
    def apply(
        Preset: js.UndefOr[Preset] = js.undefined
    ): UpdatePresetResponse = {
      val __obj = js.Dynamic.literal()
      Preset.foreach(__v => __obj.updateDynamic("Preset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePresetResponse]
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
    @inline
    def apply(
        Name: __string,
        Description: js.UndefOr[__string] = js.undefined,
        ReservationPlanSettings: js.UndefOr[ReservationPlanSettings] = js.undefined,
        Status: js.UndefOr[QueueStatus] = js.undefined
    ): UpdateQueueRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ReservationPlanSettings.foreach(__v => __obj.updateDynamic("ReservationPlanSettings")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateQueueRequest]
    }
  }

  @js.native
  trait UpdateQueueResponse extends js.Object {
    var Queue: js.UndefOr[Queue]
  }

  object UpdateQueueResponse {
    @inline
    def apply(
        Queue: js.UndefOr[Queue] = js.undefined
    ): UpdateQueueResponse = {
      val __obj = js.Dynamic.literal()
      Queue.foreach(__v => __obj.updateDynamic("Queue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateQueueResponse]
    }
  }

  /**
    * Type of video codec
    */
  @js.native
  sealed trait VideoCodec extends js.Any
  object VideoCodec {
    val FRAME_CAPTURE = "FRAME_CAPTURE".asInstanceOf[VideoCodec]
    val AV1 = "AV1".asInstanceOf[VideoCodec]
    val H_264 = "H_264".asInstanceOf[VideoCodec]
    val H_265 = "H_265".asInstanceOf[VideoCodec]
    val MPEG2 = "MPEG2".asInstanceOf[VideoCodec]
    val PRORES = "PRORES".asInstanceOf[VideoCodec]
    val VP8 = "VP8".asInstanceOf[VideoCodec]
    val VP9 = "VP9".asInstanceOf[VideoCodec]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(FRAME_CAPTURE, AV1, H_264, H_265, MPEG2, PRORES, VP8, VP9))
  }

  /**
    * Video codec settings, (CodecSettings) under (VideoDescription), contains the group of settings related to video encoding. The settings in this group vary depending on the value that you choose for Video codec (Codec). For each codec enum that you choose, define the corresponding settings object. The following lists the codec enum, settings object pairs. * FRAME_CAPTURE, FrameCaptureSettings * AV1, Av1Settings * H_264, H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES, ProresSettings * VP8, Vp8Settings * VP9, Vp9Settings
    */
  @js.native
  trait VideoCodecSettings extends js.Object {
    var Av1Settings: js.UndefOr[Av1Settings]
    var Codec: js.UndefOr[VideoCodec]
    var FrameCaptureSettings: js.UndefOr[FrameCaptureSettings]
    var H264Settings: js.UndefOr[H264Settings]
    var H265Settings: js.UndefOr[H265Settings]
    var Mpeg2Settings: js.UndefOr[Mpeg2Settings]
    var ProresSettings: js.UndefOr[ProresSettings]
    var Vp8Settings: js.UndefOr[Vp8Settings]
    var Vp9Settings: js.UndefOr[Vp9Settings]
  }

  object VideoCodecSettings {
    @inline
    def apply(
        Av1Settings: js.UndefOr[Av1Settings] = js.undefined,
        Codec: js.UndefOr[VideoCodec] = js.undefined,
        FrameCaptureSettings: js.UndefOr[FrameCaptureSettings] = js.undefined,
        H264Settings: js.UndefOr[H264Settings] = js.undefined,
        H265Settings: js.UndefOr[H265Settings] = js.undefined,
        Mpeg2Settings: js.UndefOr[Mpeg2Settings] = js.undefined,
        ProresSettings: js.UndefOr[ProresSettings] = js.undefined,
        Vp8Settings: js.UndefOr[Vp8Settings] = js.undefined,
        Vp9Settings: js.UndefOr[Vp9Settings] = js.undefined
    ): VideoCodecSettings = {
      val __obj = js.Dynamic.literal()
      Av1Settings.foreach(__v => __obj.updateDynamic("Av1Settings")(__v.asInstanceOf[js.Any]))
      Codec.foreach(__v => __obj.updateDynamic("Codec")(__v.asInstanceOf[js.Any]))
      FrameCaptureSettings.foreach(__v => __obj.updateDynamic("FrameCaptureSettings")(__v.asInstanceOf[js.Any]))
      H264Settings.foreach(__v => __obj.updateDynamic("H264Settings")(__v.asInstanceOf[js.Any]))
      H265Settings.foreach(__v => __obj.updateDynamic("H265Settings")(__v.asInstanceOf[js.Any]))
      Mpeg2Settings.foreach(__v => __obj.updateDynamic("Mpeg2Settings")(__v.asInstanceOf[js.Any]))
      ProresSettings.foreach(__v => __obj.updateDynamic("ProresSettings")(__v.asInstanceOf[js.Any]))
      Vp8Settings.foreach(__v => __obj.updateDynamic("Vp8Settings")(__v.asInstanceOf[js.Any]))
      Vp9Settings.foreach(__v => __obj.updateDynamic("Vp9Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoCodecSettings]
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
    var Height: js.UndefOr[__integerMin32Max8192]
    var Position: js.UndefOr[Rectangle]
    var RespondToAfd: js.UndefOr[RespondToAfd]
    var ScalingBehavior: js.UndefOr[ScalingBehavior]
    var Sharpness: js.UndefOr[__integerMin0Max100]
    var TimecodeInsertion: js.UndefOr[VideoTimecodeInsertion]
    var VideoPreprocessors: js.UndefOr[VideoPreprocessor]
    var Width: js.UndefOr[__integerMin32Max8192]
  }

  object VideoDescription {
    @inline
    def apply(
        AfdSignaling: js.UndefOr[AfdSignaling] = js.undefined,
        AntiAlias: js.UndefOr[AntiAlias] = js.undefined,
        CodecSettings: js.UndefOr[VideoCodecSettings] = js.undefined,
        ColorMetadata: js.UndefOr[ColorMetadata] = js.undefined,
        Crop: js.UndefOr[Rectangle] = js.undefined,
        DropFrameTimecode: js.UndefOr[DropFrameTimecode] = js.undefined,
        FixedAfd: js.UndefOr[__integerMin0Max15] = js.undefined,
        Height: js.UndefOr[__integerMin32Max8192] = js.undefined,
        Position: js.UndefOr[Rectangle] = js.undefined,
        RespondToAfd: js.UndefOr[RespondToAfd] = js.undefined,
        ScalingBehavior: js.UndefOr[ScalingBehavior] = js.undefined,
        Sharpness: js.UndefOr[__integerMin0Max100] = js.undefined,
        TimecodeInsertion: js.UndefOr[VideoTimecodeInsertion] = js.undefined,
        VideoPreprocessors: js.UndefOr[VideoPreprocessor] = js.undefined,
        Width: js.UndefOr[__integerMin32Max8192] = js.undefined
    ): VideoDescription = {
      val __obj = js.Dynamic.literal()
      AfdSignaling.foreach(__v => __obj.updateDynamic("AfdSignaling")(__v.asInstanceOf[js.Any]))
      AntiAlias.foreach(__v => __obj.updateDynamic("AntiAlias")(__v.asInstanceOf[js.Any]))
      CodecSettings.foreach(__v => __obj.updateDynamic("CodecSettings")(__v.asInstanceOf[js.Any]))
      ColorMetadata.foreach(__v => __obj.updateDynamic("ColorMetadata")(__v.asInstanceOf[js.Any]))
      Crop.foreach(__v => __obj.updateDynamic("Crop")(__v.asInstanceOf[js.Any]))
      DropFrameTimecode.foreach(__v => __obj.updateDynamic("DropFrameTimecode")(__v.asInstanceOf[js.Any]))
      FixedAfd.foreach(__v => __obj.updateDynamic("FixedAfd")(__v.asInstanceOf[js.Any]))
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      Position.foreach(__v => __obj.updateDynamic("Position")(__v.asInstanceOf[js.Any]))
      RespondToAfd.foreach(__v => __obj.updateDynamic("RespondToAfd")(__v.asInstanceOf[js.Any]))
      ScalingBehavior.foreach(__v => __obj.updateDynamic("ScalingBehavior")(__v.asInstanceOf[js.Any]))
      Sharpness.foreach(__v => __obj.updateDynamic("Sharpness")(__v.asInstanceOf[js.Any]))
      TimecodeInsertion.foreach(__v => __obj.updateDynamic("TimecodeInsertion")(__v.asInstanceOf[js.Any]))
      VideoPreprocessors.foreach(__v => __obj.updateDynamic("VideoPreprocessors")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoDescription]
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
    @inline
    def apply(
        HeightInPx: js.UndefOr[__integer] = js.undefined,
        WidthInPx: js.UndefOr[__integer] = js.undefined
    ): VideoDetail = {
      val __obj = js.Dynamic.literal()
      HeightInPx.foreach(__v => __obj.updateDynamic("HeightInPx")(__v.asInstanceOf[js.Any]))
      WidthInPx.foreach(__v => __obj.updateDynamic("WidthInPx")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoDetail]
    }
  }

  /**
    * Find additional transcoding features under Preprocessors (VideoPreprocessors). Enable the features at each output individually. These features are disabled by default.
    */
  @js.native
  trait VideoPreprocessor extends js.Object {
    var ColorCorrector: js.UndefOr[ColorCorrector]
    var Deinterlacer: js.UndefOr[Deinterlacer]
    var DolbyVision: js.UndefOr[DolbyVision]
    var ImageInserter: js.UndefOr[ImageInserter]
    var NoiseReducer: js.UndefOr[NoiseReducer]
    var PartnerWatermarking: js.UndefOr[PartnerWatermarking]
    var TimecodeBurnin: js.UndefOr[TimecodeBurnin]
  }

  object VideoPreprocessor {
    @inline
    def apply(
        ColorCorrector: js.UndefOr[ColorCorrector] = js.undefined,
        Deinterlacer: js.UndefOr[Deinterlacer] = js.undefined,
        DolbyVision: js.UndefOr[DolbyVision] = js.undefined,
        ImageInserter: js.UndefOr[ImageInserter] = js.undefined,
        NoiseReducer: js.UndefOr[NoiseReducer] = js.undefined,
        PartnerWatermarking: js.UndefOr[PartnerWatermarking] = js.undefined,
        TimecodeBurnin: js.UndefOr[TimecodeBurnin] = js.undefined
    ): VideoPreprocessor = {
      val __obj = js.Dynamic.literal()
      ColorCorrector.foreach(__v => __obj.updateDynamic("ColorCorrector")(__v.asInstanceOf[js.Any]))
      Deinterlacer.foreach(__v => __obj.updateDynamic("Deinterlacer")(__v.asInstanceOf[js.Any]))
      DolbyVision.foreach(__v => __obj.updateDynamic("DolbyVision")(__v.asInstanceOf[js.Any]))
      ImageInserter.foreach(__v => __obj.updateDynamic("ImageInserter")(__v.asInstanceOf[js.Any]))
      NoiseReducer.foreach(__v => __obj.updateDynamic("NoiseReducer")(__v.asInstanceOf[js.Any]))
      PartnerWatermarking.foreach(__v => __obj.updateDynamic("PartnerWatermarking")(__v.asInstanceOf[js.Any]))
      TimecodeBurnin.foreach(__v => __obj.updateDynamic("TimecodeBurnin")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoPreprocessor]
    }
  }

  /**
    * Selector for video.
    */
  @js.native
  trait VideoSelector extends js.Object {
    var AlphaBehavior: js.UndefOr[AlphaBehavior]
    var ColorSpace: js.UndefOr[ColorSpace]
    var ColorSpaceUsage: js.UndefOr[ColorSpaceUsage]
    var Hdr10Metadata: js.UndefOr[Hdr10Metadata]
    var Pid: js.UndefOr[__integerMin1Max2147483647]
    var ProgramNumber: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var Rotate: js.UndefOr[InputRotate]
  }

  object VideoSelector {
    @inline
    def apply(
        AlphaBehavior: js.UndefOr[AlphaBehavior] = js.undefined,
        ColorSpace: js.UndefOr[ColorSpace] = js.undefined,
        ColorSpaceUsage: js.UndefOr[ColorSpaceUsage] = js.undefined,
        Hdr10Metadata: js.UndefOr[Hdr10Metadata] = js.undefined,
        Pid: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        ProgramNumber: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        Rotate: js.UndefOr[InputRotate] = js.undefined
    ): VideoSelector = {
      val __obj = js.Dynamic.literal()
      AlphaBehavior.foreach(__v => __obj.updateDynamic("AlphaBehavior")(__v.asInstanceOf[js.Any]))
      ColorSpace.foreach(__v => __obj.updateDynamic("ColorSpace")(__v.asInstanceOf[js.Any]))
      ColorSpaceUsage.foreach(__v => __obj.updateDynamic("ColorSpaceUsage")(__v.asInstanceOf[js.Any]))
      Hdr10Metadata.foreach(__v => __obj.updateDynamic("Hdr10Metadata")(__v.asInstanceOf[js.Any]))
      Pid.foreach(__v => __obj.updateDynamic("Pid")(__v.asInstanceOf[js.Any]))
      ProgramNumber.foreach(__v => __obj.updateDynamic("ProgramNumber")(__v.asInstanceOf[js.Any]))
      Rotate.foreach(__v => __obj.updateDynamic("Rotate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoSelector]
    }
  }

  /**
    * Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable Timecode insertion when the input frame rate is identical to the output frame rate. To include timecodes in this output, set Timecode insertion (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is DISABLED. When the service inserts timecodes in an output, by default, it uses any embedded timecodes from the input. If none are present, the service will set the timecode for the first output frame to zero. To change this default behavior, adjust the settings under Timecode configuration (TimecodeConfig). In the console, these settings are located under Job > Job settings > Timecode configuration. Note - Timecode source under input settings (InputTimecodeSource) does not affect the timecodes that are inserted in the output. Source under Job settings > Timecode configuration (TimecodeSource) does.
    */
  @js.native
  sealed trait VideoTimecodeInsertion extends js.Any
  object VideoTimecodeInsertion {
    val DISABLED = "DISABLED".asInstanceOf[VideoTimecodeInsertion]
    val PIC_TIMING_SEI = "PIC_TIMING_SEI".asInstanceOf[VideoTimecodeInsertion]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DISABLED, PIC_TIMING_SEI))
  }

  /**
    * Required when you set Codec, under AudioDescriptions>CodecSettings, to the value Vorbis.
    */
  @js.native
  trait VorbisSettings extends js.Object {
    var Channels: js.UndefOr[__integerMin1Max2]
    var SampleRate: js.UndefOr[__integerMin22050Max48000]
    var VbrQuality: js.UndefOr[__integerMinNegative1Max10]
  }

  object VorbisSettings {
    @inline
    def apply(
        Channels: js.UndefOr[__integerMin1Max2] = js.undefined,
        SampleRate: js.UndefOr[__integerMin22050Max48000] = js.undefined,
        VbrQuality: js.UndefOr[__integerMinNegative1Max10] = js.undefined
    ): VorbisSettings = {
      val __obj = js.Dynamic.literal()
      Channels.foreach(__v => __obj.updateDynamic("Channels")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      VbrQuality.foreach(__v => __obj.updateDynamic("VbrQuality")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VorbisSettings]
    }
  }

  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  @js.native
  sealed trait Vp8FramerateControl extends js.Any
  object Vp8FramerateControl {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[Vp8FramerateControl]
    val SPECIFIED = "SPECIFIED".asInstanceOf[Vp8FramerateControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * Optional. Specify how the transcoder performs framerate conversion. The default behavior is to use Drop duplicate (DUPLICATE_DROP) conversion. When you choose Interpolate (INTERPOLATE) instead, the conversion produces smoother motion.
    */
  @js.native
  sealed trait Vp8FramerateConversionAlgorithm extends js.Any
  object Vp8FramerateConversionAlgorithm {
    val DUPLICATE_DROP = "DUPLICATE_DROP".asInstanceOf[Vp8FramerateConversionAlgorithm]
    val INTERPOLATE = "INTERPOLATE".asInstanceOf[Vp8FramerateConversionAlgorithm]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DUPLICATE_DROP, INTERPOLATE))
  }

  /**
    * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
    */
  @js.native
  sealed trait Vp8ParControl extends js.Any
  object Vp8ParControl {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[Vp8ParControl]
    val SPECIFIED = "SPECIFIED".asInstanceOf[Vp8ParControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, multi-pass encoding.
    */
  @js.native
  sealed trait Vp8QualityTuningLevel extends js.Any
  object Vp8QualityTuningLevel {
    val MULTI_PASS = "MULTI_PASS".asInstanceOf[Vp8QualityTuningLevel]
    val MULTI_PASS_HQ = "MULTI_PASS_HQ".asInstanceOf[Vp8QualityTuningLevel]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(MULTI_PASS, MULTI_PASS_HQ))
  }

  /**
    * With the VP8 codec, you can use only the variable bitrate (VBR) rate control mode.
    */
  @js.native
  sealed trait Vp8RateControlMode extends js.Any
  object Vp8RateControlMode {
    val VBR = "VBR".asInstanceOf[Vp8RateControlMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(VBR))
  }

  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP8.
    */
  @js.native
  trait Vp8Settings extends js.Object {
    var Bitrate: js.UndefOr[__integerMin1000Max1152000000]
    var FramerateControl: js.UndefOr[Vp8FramerateControl]
    var FramerateConversionAlgorithm: js.UndefOr[Vp8FramerateConversionAlgorithm]
    var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647]
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647]
    var GopSize: js.UndefOr[__doubleMin0]
    var HrdBufferSize: js.UndefOr[__integerMin0Max47185920]
    var MaxBitrate: js.UndefOr[__integerMin1000Max1152000000]
    var ParControl: js.UndefOr[Vp8ParControl]
    var ParDenominator: js.UndefOr[__integerMin1Max2147483647]
    var ParNumerator: js.UndefOr[__integerMin1Max2147483647]
    var QualityTuningLevel: js.UndefOr[Vp8QualityTuningLevel]
    var RateControlMode: js.UndefOr[Vp8RateControlMode]
  }

  object Vp8Settings {
    @inline
    def apply(
        Bitrate: js.UndefOr[__integerMin1000Max1152000000] = js.undefined,
        FramerateControl: js.UndefOr[Vp8FramerateControl] = js.undefined,
        FramerateConversionAlgorithm: js.UndefOr[Vp8FramerateConversionAlgorithm] = js.undefined,
        FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        GopSize: js.UndefOr[__doubleMin0] = js.undefined,
        HrdBufferSize: js.UndefOr[__integerMin0Max47185920] = js.undefined,
        MaxBitrate: js.UndefOr[__integerMin1000Max1152000000] = js.undefined,
        ParControl: js.UndefOr[Vp8ParControl] = js.undefined,
        ParDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        ParNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        QualityTuningLevel: js.UndefOr[Vp8QualityTuningLevel] = js.undefined,
        RateControlMode: js.UndefOr[Vp8RateControlMode] = js.undefined
    ): Vp8Settings = {
      val __obj = js.Dynamic.literal()
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      FramerateControl.foreach(__v => __obj.updateDynamic("FramerateControl")(__v.asInstanceOf[js.Any]))
      FramerateConversionAlgorithm.foreach(__v => __obj.updateDynamic("FramerateConversionAlgorithm")(__v.asInstanceOf[js.Any]))
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      GopSize.foreach(__v => __obj.updateDynamic("GopSize")(__v.asInstanceOf[js.Any]))
      HrdBufferSize.foreach(__v => __obj.updateDynamic("HrdBufferSize")(__v.asInstanceOf[js.Any]))
      MaxBitrate.foreach(__v => __obj.updateDynamic("MaxBitrate")(__v.asInstanceOf[js.Any]))
      ParControl.foreach(__v => __obj.updateDynamic("ParControl")(__v.asInstanceOf[js.Any]))
      ParDenominator.foreach(__v => __obj.updateDynamic("ParDenominator")(__v.asInstanceOf[js.Any]))
      ParNumerator.foreach(__v => __obj.updateDynamic("ParNumerator")(__v.asInstanceOf[js.Any]))
      QualityTuningLevel.foreach(__v => __obj.updateDynamic("QualityTuningLevel")(__v.asInstanceOf[js.Any]))
      RateControlMode.foreach(__v => __obj.updateDynamic("RateControlMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Vp8Settings]
    }
  }

  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  @js.native
  sealed trait Vp9FramerateControl extends js.Any
  object Vp9FramerateControl {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[Vp9FramerateControl]
    val SPECIFIED = "SPECIFIED".asInstanceOf[Vp9FramerateControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * Optional. Specify how the transcoder performs framerate conversion. The default behavior is to use Drop duplicate (DUPLICATE_DROP) conversion. When you choose Interpolate (INTERPOLATE) instead, the conversion produces smoother motion.
    */
  @js.native
  sealed trait Vp9FramerateConversionAlgorithm extends js.Any
  object Vp9FramerateConversionAlgorithm {
    val DUPLICATE_DROP = "DUPLICATE_DROP".asInstanceOf[Vp9FramerateConversionAlgorithm]
    val INTERPOLATE = "INTERPOLATE".asInstanceOf[Vp9FramerateConversionAlgorithm]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(DUPLICATE_DROP, INTERPOLATE))
  }

  /**
    * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
    */
  @js.native
  sealed trait Vp9ParControl extends js.Any
  object Vp9ParControl {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[Vp9ParControl]
    val SPECIFIED = "SPECIFIED".asInstanceOf[Vp9ParControl]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, multi-pass encoding.
    */
  @js.native
  sealed trait Vp9QualityTuningLevel extends js.Any
  object Vp9QualityTuningLevel {
    val MULTI_PASS = "MULTI_PASS".asInstanceOf[Vp9QualityTuningLevel]
    val MULTI_PASS_HQ = "MULTI_PASS_HQ".asInstanceOf[Vp9QualityTuningLevel]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(MULTI_PASS, MULTI_PASS_HQ))
  }

  /**
    * With the VP9 codec, you can use only the variable bitrate (VBR) rate control mode.
    */
  @js.native
  sealed trait Vp9RateControlMode extends js.Any
  object Vp9RateControlMode {
    val VBR = "VBR".asInstanceOf[Vp9RateControlMode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(VBR))
  }

  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP9.
    */
  @js.native
  trait Vp9Settings extends js.Object {
    var Bitrate: js.UndefOr[__integerMin1000Max480000000]
    var FramerateControl: js.UndefOr[Vp9FramerateControl]
    var FramerateConversionAlgorithm: js.UndefOr[Vp9FramerateConversionAlgorithm]
    var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647]
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647]
    var GopSize: js.UndefOr[__doubleMin0]
    var HrdBufferSize: js.UndefOr[__integerMin0Max47185920]
    var MaxBitrate: js.UndefOr[__integerMin1000Max480000000]
    var ParControl: js.UndefOr[Vp9ParControl]
    var ParDenominator: js.UndefOr[__integerMin1Max2147483647]
    var ParNumerator: js.UndefOr[__integerMin1Max2147483647]
    var QualityTuningLevel: js.UndefOr[Vp9QualityTuningLevel]
    var RateControlMode: js.UndefOr[Vp9RateControlMode]
  }

  object Vp9Settings {
    @inline
    def apply(
        Bitrate: js.UndefOr[__integerMin1000Max480000000] = js.undefined,
        FramerateControl: js.UndefOr[Vp9FramerateControl] = js.undefined,
        FramerateConversionAlgorithm: js.UndefOr[Vp9FramerateConversionAlgorithm] = js.undefined,
        FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        GopSize: js.UndefOr[__doubleMin0] = js.undefined,
        HrdBufferSize: js.UndefOr[__integerMin0Max47185920] = js.undefined,
        MaxBitrate: js.UndefOr[__integerMin1000Max480000000] = js.undefined,
        ParControl: js.UndefOr[Vp9ParControl] = js.undefined,
        ParDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        ParNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        QualityTuningLevel: js.UndefOr[Vp9QualityTuningLevel] = js.undefined,
        RateControlMode: js.UndefOr[Vp9RateControlMode] = js.undefined
    ): Vp9Settings = {
      val __obj = js.Dynamic.literal()
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      FramerateControl.foreach(__v => __obj.updateDynamic("FramerateControl")(__v.asInstanceOf[js.Any]))
      FramerateConversionAlgorithm.foreach(__v => __obj.updateDynamic("FramerateConversionAlgorithm")(__v.asInstanceOf[js.Any]))
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      GopSize.foreach(__v => __obj.updateDynamic("GopSize")(__v.asInstanceOf[js.Any]))
      HrdBufferSize.foreach(__v => __obj.updateDynamic("HrdBufferSize")(__v.asInstanceOf[js.Any]))
      MaxBitrate.foreach(__v => __obj.updateDynamic("MaxBitrate")(__v.asInstanceOf[js.Any]))
      ParControl.foreach(__v => __obj.updateDynamic("ParControl")(__v.asInstanceOf[js.Any]))
      ParDenominator.foreach(__v => __obj.updateDynamic("ParDenominator")(__v.asInstanceOf[js.Any]))
      ParNumerator.foreach(__v => __obj.updateDynamic("ParNumerator")(__v.asInstanceOf[js.Any]))
      QualityTuningLevel.foreach(__v => __obj.updateDynamic("QualityTuningLevel")(__v.asInstanceOf[js.Any]))
      RateControlMode.foreach(__v => __obj.updateDynamic("RateControlMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Vp9Settings]
    }
  }

  /**
    * Optional. Ignore this setting unless Nagra support directs you to specify a value. When you don't specify a value here, the Nagra NexGuard library uses its default value.
    */
  @js.native
  sealed trait WatermarkingStrength extends js.Any
  object WatermarkingStrength {
    val LIGHTEST = "LIGHTEST".asInstanceOf[WatermarkingStrength]
    val LIGHTER = "LIGHTER".asInstanceOf[WatermarkingStrength]
    val DEFAULT = "DEFAULT".asInstanceOf[WatermarkingStrength]
    val STRONGER = "STRONGER".asInstanceOf[WatermarkingStrength]
    val STRONGEST = "STRONGEST".asInstanceOf[WatermarkingStrength]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(LIGHTEST, LIGHTER, DEFAULT, STRONGER, STRONGEST))
  }

  /**
    * The service defaults to using RIFF for WAV outputs. If your output audio is likely to exceed 4 GB in file size, or if you otherwise need the extended support of the RF64 format, set your output WAV file format to RF64.
    */
  @js.native
  sealed trait WavFormat extends js.Any
  object WavFormat {
    val RIFF = "RIFF".asInstanceOf[WavFormat]
    val RF64 = "RF64".asInstanceOf[WavFormat]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(RIFF, RF64))
  }

  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value WAV.
    */
  @js.native
  trait WavSettings extends js.Object {
    var BitDepth: js.UndefOr[__integerMin16Max24]
    var Channels: js.UndefOr[__integerMin1Max64]
    var Format: js.UndefOr[WavFormat]
    var SampleRate: js.UndefOr[__integerMin8000Max192000]
  }

  object WavSettings {
    @inline
    def apply(
        BitDepth: js.UndefOr[__integerMin16Max24] = js.undefined,
        Channels: js.UndefOr[__integerMin1Max64] = js.undefined,
        Format: js.UndefOr[WavFormat] = js.undefined,
        SampleRate: js.UndefOr[__integerMin8000Max192000] = js.undefined
    ): WavSettings = {
      val __obj = js.Dynamic.literal()
      BitDepth.foreach(__v => __obj.updateDynamic("BitDepth")(__v.asInstanceOf[js.Any]))
      Channels.foreach(__v => __obj.updateDynamic("Channels")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WavSettings]
    }
  }
}
