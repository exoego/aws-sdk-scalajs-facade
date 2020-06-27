package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object mediaconvert {
  type __doubleMin0                                = Double
  type __doubleMin0Max1                            = Double
  type __doubleMin0Max2147483647                   = Double
  type __doubleMinNegative59Max0                   = Double
  type __doubleMinNegative60Max3                   = Double
  type __doubleMinNegative60MaxNegative1           = Double
  type __doubleMinNegative6Max3                    = Double
  type __integer                                   = Int
  type __integerMin0Max0                           = Int
  type __integerMin0Max1                           = Int
  type __integerMin0Max10                          = Int
  type __integerMin0Max100                         = Int
  type __integerMin0Max1000                        = Int
  type __integerMin0Max10000                       = Int
  type __integerMin0Max1152000000                  = Int
  type __integerMin0Max128                         = Int
  type __integerMin0Max1466400000                  = Int
  type __integerMin0Max15                          = Int
  type __integerMin0Max16                          = Int
  type __integerMin0Max2147483647                  = Int
  type __integerMin0Max255                         = Int
  type __integerMin0Max3                           = Int
  type __integerMin0Max30                          = Int
  type __integerMin0Max30000                       = Int
  type __integerMin0Max3600                        = Int
  type __integerMin0Max4                           = Int
  type __integerMin0Max47185920                    = Int
  type __integerMin0Max500                         = Int
  type __integerMin0Max50000                       = Int
  type __integerMin0Max65535                       = Int
  type __integerMin0Max7                           = Int
  type __integerMin0Max8                           = Int
  type __integerMin0Max9                           = Int
  type __integerMin0Max96                          = Int
  type __integerMin0Max99                          = Int
  type __integerMin1000Max1152000000               = Int
  type __integerMin1000Max1466400000               = Int
  type __integerMin1000Max288000000                = Int
  type __integerMin1000Max30000                    = Int
  type __integerMin1000Max300000000                = Int
  type __integerMin10Max48                         = Int
  type __integerMin16000Max320000                  = Int
  type __integerMin16Max24                         = Int
  type __integerMin1Max1                           = Int
  type __integerMin1Max10                          = Int
  type __integerMin1Max100                         = Int
  type __integerMin1Max10000000                    = Int
  type __integerMin1Max1001                        = Int
  type __integerMin1Max17895697                    = Int
  type __integerMin1Max2                           = Int
  type __integerMin1Max20                          = Int
  type __integerMin1Max2147483640                  = Int
  type __integerMin1Max2147483647                  = Int
  type __integerMin1Max31                          = Int
  type __integerMin1Max32                          = Int
  type __integerMin1Max4                           = Int
  type __integerMin1Max6                           = Int
  type __integerMin1Max64                          = Int
  type __integerMin22050Max48000                   = Int
  type __integerMin24Max60000                      = Int
  type __integerMin25Max10000                      = Int
  type __integerMin25Max2000                       = Int
  type __integerMin2Max2147483647                  = Int
  type __integerMin32000Max384000                  = Int
  type __integerMin32000Max48000                   = Int
  type __integerMin32Max8182                       = Int
  type __integerMin32Max8192                       = Int
  type __integerMin384000Max768000                 = Int
  type __integerMin48000Max48000                   = Int
  type __integerMin6000Max1024000                  = Int
  type __integerMin64000Max640000                  = Int
  type __integerMin8000Max192000                   = Int
  type __integerMin8000Max96000                    = Int
  type __integerMin96Max600                        = Int
  type __integerMinNegative1000Max1000             = Int
  type __integerMinNegative180Max180               = Int
  type __integerMinNegative1Max3                   = Int
  type __integerMinNegative2147483648Max2147483647 = Int
  type __integerMinNegative2Max3                   = Int
  type __integerMinNegative50Max50                 = Int
  type __integerMinNegative5Max5                   = Int
  type __integerMinNegative60Max6                  = Int
  type __integerMinNegative70Max0                  = Int
  type __listOfAudioDescription                    = js.Array[AudioDescription]
  type __listOfCaptionDescription                  = js.Array[CaptionDescription]
  type __listOfCaptionDescriptionPreset            = js.Array[CaptionDescriptionPreset]
  type __listOfCmafAdditionalManifest              = js.Array[CmafAdditionalManifest]
  type __listOfDashAdditionalManifest              = js.Array[DashAdditionalManifest]
  type __listOfEndpoint                            = js.Array[Endpoint]
  type __listOfHlsAdMarkers                        = js.Array[HlsAdMarkers]
  type __listOfHlsAdditionalManifest               = js.Array[HlsAdditionalManifest]
  type __listOfHlsCaptionLanguageMapping           = js.Array[HlsCaptionLanguageMapping]
  type __listOfId3Insertion                        = js.Array[Id3Insertion]
  type __listOfInput                               = js.Array[Input]
  type __listOfInputClipping                       = js.Array[InputClipping]
  type __listOfInputTemplate                       = js.Array[InputTemplate]
  type __listOfInsertableImage                     = js.Array[InsertableImage]
  type __listOfJob                                 = js.Array[Job]
  type __listOfJobTemplate                         = js.Array[JobTemplate]
  type __listOfMsSmoothAdditionalManifest          = js.Array[MsSmoothAdditionalManifest]
  type __listOfOutput                              = js.Array[Output]
  type __listOfOutputChannelMapping                = js.Array[OutputChannelMapping]
  type __listOfOutputDetail                        = js.Array[OutputDetail]
  type __listOfOutputGroup                         = js.Array[OutputGroup]
  type __listOfOutputGroupDetail                   = js.Array[OutputGroupDetail]
  type __listOfPreset                              = js.Array[Preset]
  type __listOfQueue                               = js.Array[Queue]
  type __listOfTeletextPageType                    = js.Array[TeletextPageType]
  type __listOf__integerMin1Max2147483647          = js.Array[__integerMin1Max2147483647]
  type __listOf__integerMin32Max8182               = js.Array[__integerMin32Max8182]
  type __listOf__integerMinNegative60Max6          = js.Array[__integerMinNegative60Max6]
  type __listOf__string                            = js.Array[__string]
  type __listOf__stringMin1                        = js.Array[__stringMin1]
  type __listOf__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12 =
    js.Array[__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12]
  type __listOf__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12 =
    js.Array[__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12]
  type __listOf__stringPatternS3ASSETMAPXml                            = js.Array[__stringPatternS3ASSETMAPXml]
  type __mapOfAudioSelector                                            = js.Dictionary[AudioSelector]
  type __mapOfAudioSelectorGroup                                       = js.Dictionary[AudioSelectorGroup]
  type __mapOfCaptionSelector                                          = js.Dictionary[CaptionSelector]
  type __mapOf__string                                                 = js.Dictionary[__string]
  type __string                                                        = String
  type __stringMin0                                                    = String
  type __stringMin1                                                    = String
  type __stringMin11Max11Pattern01D20305D205D                          = String
  type __stringMin14Max1285PatternS3Mov09PngHttpsMov09Png              = String
  type __stringMin14PatternS3BmpBMPPngPNGHttpsBmpBMPPngPNG             = String
  type __stringMin14PatternS3BmpBMPPngPNGTgaTGAHttpsBmpBMPPngPNGTgaTGA = String
  type __stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIHttpsSccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMI =
    String
  type __stringMin16Max24PatternAZaZ0922AZaZ0916                         = String
  type __stringMin1Max256                                                = String
  type __stringMin24Max512PatternAZaZ0902                                = String
  type __stringMin32Max32Pattern09aFAF32                                 = String
  type __stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12     = String
  type __stringMin3Max3Pattern1809aFAF09aEAE                             = String
  type __stringMin3Max3PatternAZaZ3                                      = String
  type __stringMin9Max19PatternAZ26EastWestCentralNorthSouthEastWest1912 = String
  type __stringPattern                                                   = String
  type __stringPattern010920405090509092                                 = String
  type __stringPattern01D20305D205D                                      = String
  type __stringPattern0940191020191209301                                = String
  type __stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12               = String
  type __stringPatternAZaZ0902                                           = String
  type __stringPatternAZaZ0932                                           = String
  type __stringPatternAZaZ23AZaZ                                         = String
  type __stringPatternArnAwsUsGovAcm                                     = String
  type __stringPatternArnAwsUsGovCnKmsAZ26EastWestCentralNorthSouthEastWest1912D12KeyAFAF098AFAF094AFAF094AFAF094AFAF0912 =
    String
  type __stringPatternDD                      = String
  type __stringPatternHttps                   = String
  type __stringPatternIdentityAZaZ26AZaZ09163 = String
  type __stringPatternS3                      = String
  type __stringPatternS3ASSETMAPXml           = String
  type __stringPatternS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEEHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEE =
    String
  type __stringPatternS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLLHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLL =
    String
  type __stringPatternSNManifestConfirmConditionNotificationNS = String
  type __stringPatternSNSignalProcessingNotificationNS         = String
  type __stringPatternW                                        = String
  type __stringPatternWS                                       = String
  type __timestampUnix                                         = js.Date

  implicit final class MediaConvertOps(private val service: MediaConvert) extends AnyVal {

    @inline def associateCertificateFuture(params: AssociateCertificateRequest): Future[AssociateCertificateResponse] =
      service.associateCertificate(params).promise().toFuture
    @inline def cancelJobFuture(params: CancelJobRequest): Future[CancelJobResponse] =
      service.cancelJob(params).promise().toFuture
    @inline def createJobFuture(params: CreateJobRequest): Future[CreateJobResponse] =
      service.createJob(params).promise().toFuture
    @inline def createJobTemplateFuture(params: CreateJobTemplateRequest): Future[CreateJobTemplateResponse] =
      service.createJobTemplate(params).promise().toFuture
    @inline def createPresetFuture(params: CreatePresetRequest): Future[CreatePresetResponse] =
      service.createPreset(params).promise().toFuture
    @inline def createQueueFuture(params: CreateQueueRequest): Future[CreateQueueResponse] =
      service.createQueue(params).promise().toFuture
    @inline def deleteJobTemplateFuture(params: DeleteJobTemplateRequest): Future[DeleteJobTemplateResponse] =
      service.deleteJobTemplate(params).promise().toFuture
    @inline def deletePresetFuture(params: DeletePresetRequest): Future[DeletePresetResponse] =
      service.deletePreset(params).promise().toFuture
    @inline def deleteQueueFuture(params: DeleteQueueRequest): Future[DeleteQueueResponse] =
      service.deleteQueue(params).promise().toFuture
    @inline def describeEndpointsFuture(params: DescribeEndpointsRequest): Future[DescribeEndpointsResponse] =
      service.describeEndpoints(params).promise().toFuture
    @inline def disassociateCertificateFuture(
        params: DisassociateCertificateRequest
    ): Future[DisassociateCertificateResponse]                              = service.disassociateCertificate(params).promise().toFuture
    @inline def getJobFuture(params: GetJobRequest): Future[GetJobResponse] = service.getJob(params).promise().toFuture
    @inline def getJobTemplateFuture(params: GetJobTemplateRequest): Future[GetJobTemplateResponse] =
      service.getJobTemplate(params).promise().toFuture
    @inline def getPresetFuture(params: GetPresetRequest): Future[GetPresetResponse] =
      service.getPreset(params).promise().toFuture
    @inline def getQueueFuture(params: GetQueueRequest): Future[GetQueueResponse] =
      service.getQueue(params).promise().toFuture
    @inline def listJobTemplatesFuture(params: ListJobTemplatesRequest): Future[ListJobTemplatesResponse] =
      service.listJobTemplates(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResponse] =
      service.listJobs(params).promise().toFuture
    @inline def listPresetsFuture(params: ListPresetsRequest): Future[ListPresetsResponse] =
      service.listPresets(params).promise().toFuture
    @inline def listQueuesFuture(params: ListQueuesRequest): Future[ListQueuesResponse] =
      service.listQueues(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateJobTemplateFuture(params: UpdateJobTemplateRequest): Future[UpdateJobTemplateResponse] =
      service.updateJobTemplate(params).promise().toFuture
    @inline def updatePresetFuture(params: UpdatePresetRequest): Future[UpdatePresetResponse] =
      service.updatePreset(params).promise().toFuture
    @inline def updateQueueFuture(params: UpdateQueueRequest): Future[UpdateQueueResponse] =
      service.updateQueue(params).promise().toFuture
  }
}

package mediaconvert {
  @js.native
  @JSImport("aws-sdk", "MediaConvert")
  class MediaConvert() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateCertificate(params: AssociateCertificateRequest): Request[AssociateCertificateResponse] = js.native
    def cancelJob(params: CancelJobRequest): Request[CancelJobResponse]                                  = js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResponse]                                  = js.native
    def createJobTemplate(params: CreateJobTemplateRequest): Request[CreateJobTemplateResponse]          = js.native
    def createPreset(params: CreatePresetRequest): Request[CreatePresetResponse]                         = js.native
    def createQueue(params: CreateQueueRequest): Request[CreateQueueResponse]                            = js.native
    def deleteJobTemplate(params: DeleteJobTemplateRequest): Request[DeleteJobTemplateResponse]          = js.native
    def deletePreset(params: DeletePresetRequest): Request[DeletePresetResponse]                         = js.native
    def deleteQueue(params: DeleteQueueRequest): Request[DeleteQueueResponse]                            = js.native
    def describeEndpoints(params: DescribeEndpointsRequest): Request[DescribeEndpointsResponse]          = js.native
    def disassociateCertificate(params: DisassociateCertificateRequest): Request[DisassociateCertificateResponse] =
      js.native
    def getJob(params: GetJobRequest): Request[GetJobResponse]                                        = js.native
    def getJobTemplate(params: GetJobTemplateRequest): Request[GetJobTemplateResponse]                = js.native
    def getPreset(params: GetPresetRequest): Request[GetPresetResponse]                               = js.native
    def getQueue(params: GetQueueRequest): Request[GetQueueResponse]                                  = js.native
    def listJobTemplates(params: ListJobTemplatesRequest): Request[ListJobTemplatesResponse]          = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResponse]                                  = js.native
    def listPresets(params: ListPresetsRequest): Request[ListPresetsResponse]                         = js.native
    def listQueues(params: ListQueuesRequest): Request[ListQueuesResponse]                            = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                         = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                   = js.native
    def updateJobTemplate(params: UpdateJobTemplateRequest): Request[UpdateJobTemplateResponse]       = js.native
    def updatePreset(params: UpdatePresetRequest): Request[UpdatePresetResponse]                      = js.native
    def updateQueue(params: UpdateQueueRequest): Request[UpdateQueueResponse]                         = js.native
  }

  /**
    * Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio + audio description (AD) as a stereo pair. The value for AudioType will be set to 3, which signals to downstream systems that this stream contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does not perform the mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any values you provide in AudioType and  FollowInputAudioType. Choose NORMAL when the input does not contain pre-mixed audio + audio description (AD). In this case, the encoder will use any values you provide for AudioType and FollowInputAudioType.
    */
  @js.native
  sealed trait AacAudioDescriptionBroadcasterMix extends js.Any
  object AacAudioDescriptionBroadcasterMix extends js.Object {
    val BROADCASTER_MIXED_AD = "BROADCASTER_MIXED_AD".asInstanceOf[AacAudioDescriptionBroadcasterMix]
    val NORMAL               = "NORMAL".asInstanceOf[AacAudioDescriptionBroadcasterMix]

    val values = js.Object.freeze(js.Array(BROADCASTER_MIXED_AD, NORMAL))
  }

  /**
    * AAC Profile.
    */
  @js.native
  sealed trait AacCodecProfile extends js.Any
  object AacCodecProfile extends js.Object {
    val LC   = "LC".asInstanceOf[AacCodecProfile]
    val HEV1 = "HEV1".asInstanceOf[AacCodecProfile]
    val HEV2 = "HEV2".asInstanceOf[AacCodecProfile]

    val values = js.Object.freeze(js.Array(LC, HEV1, HEV2))
  }

  /**
    * Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. "1.0 - Audio Description (Receiver Mix)" setting receives a stereo description plus control track and emits a mono AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
    */
  @js.native
  sealed trait AacCodingMode extends js.Any
  object AacCodingMode extends js.Object {
    val AD_RECEIVER_MIX = "AD_RECEIVER_MIX".asInstanceOf[AacCodingMode]
    val CODING_MODE_1_0 = "CODING_MODE_1_0".asInstanceOf[AacCodingMode]
    val CODING_MODE_1_1 = "CODING_MODE_1_1".asInstanceOf[AacCodingMode]
    val CODING_MODE_2_0 = "CODING_MODE_2_0".asInstanceOf[AacCodingMode]
    val CODING_MODE_5_1 = "CODING_MODE_5_1".asInstanceOf[AacCodingMode]

    val values =
      js.Object.freeze(js.Array(AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0, CODING_MODE_5_1))
  }

  /**
    * Rate Control Mode.
    */
  @js.native
  sealed trait AacRateControlMode extends js.Any
  object AacRateControlMode extends js.Object {
    val CBR = "CBR".asInstanceOf[AacRateControlMode]
    val VBR = "VBR".asInstanceOf[AacRateControlMode]

    val values = js.Object.freeze(js.Array(CBR, VBR))
  }

  /**
    * Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an output, you must choose "No container" for the output container.
    */
  @js.native
  sealed trait AacRawFormat extends js.Any
  object AacRawFormat extends js.Object {
    val LATM_LOAS = "LATM_LOAS".asInstanceOf[AacRawFormat]
    val NONE      = "NONE".asInstanceOf[AacRawFormat]

    val values = js.Object.freeze(js.Array(LATM_LOAS, NONE))
  }

  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AAC. The service accepts one of two mutually exclusive groups of AAC settings--VBR and CBR. To select one of these modes, set the value of Bitrate control mode (rateControlMode) to "VBR" or "CBR".  In VBR mode, you control the audio quality with the setting VBR quality (vbrQuality). In CBR mode, you use the setting Bitrate (bitrate). Defaults and valid values depend on the rate control mode.
    */
  @js.native
  @Factory
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

  /**
    * Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
    */
  @js.native
  sealed trait AacSpecification extends js.Any
  object AacSpecification extends js.Object {
    val MPEG2 = "MPEG2".asInstanceOf[AacSpecification]
    val MPEG4 = "MPEG4".asInstanceOf[AacSpecification]

    val values = js.Object.freeze(js.Array(MPEG2, MPEG4))
  }

  /**
    * VBR Quality Level - Only used if rate_control_mode is VBR.
    */
  @js.native
  sealed trait AacVbrQuality extends js.Any
  object AacVbrQuality extends js.Object {
    val LOW         = "LOW".asInstanceOf[AacVbrQuality]
    val MEDIUM_LOW  = "MEDIUM_LOW".asInstanceOf[AacVbrQuality]
    val MEDIUM_HIGH = "MEDIUM_HIGH".asInstanceOf[AacVbrQuality]
    val HIGH        = "HIGH".asInstanceOf[AacVbrQuality]

    val values = js.Object.freeze(js.Array(LOW, MEDIUM_LOW, MEDIUM_HIGH, HIGH))
  }

  /**
    * Specify the bitstream mode for the AC-3 stream that the encoder emits. For more information about the AC3 bitstream mode, see ATSC A/52-2012 (Annex E).
    */
  @js.native
  sealed trait Ac3BitstreamMode extends js.Any
  object Ac3BitstreamMode extends js.Object {
    val COMPLETE_MAIN     = "COMPLETE_MAIN".asInstanceOf[Ac3BitstreamMode]
    val COMMENTARY        = "COMMENTARY".asInstanceOf[Ac3BitstreamMode]
    val DIALOGUE          = "DIALOGUE".asInstanceOf[Ac3BitstreamMode]
    val EMERGENCY         = "EMERGENCY".asInstanceOf[Ac3BitstreamMode]
    val HEARING_IMPAIRED  = "HEARING_IMPAIRED".asInstanceOf[Ac3BitstreamMode]
    val MUSIC_AND_EFFECTS = "MUSIC_AND_EFFECTS".asInstanceOf[Ac3BitstreamMode]
    val VISUALLY_IMPAIRED = "VISUALLY_IMPAIRED".asInstanceOf[Ac3BitstreamMode]
    val VOICE_OVER        = "VOICE_OVER".asInstanceOf[Ac3BitstreamMode]

    val values = js.Object.freeze(
      js.Array(
        COMPLETE_MAIN,
        COMMENTARY,
        DIALOGUE,
        EMERGENCY,
        HEARING_IMPAIRED,
        MUSIC_AND_EFFECTS,
        VISUALLY_IMPAIRED,
        VOICE_OVER
      )
    )
  }

  /**
    * Dolby Digital coding mode. Determines number of channels.
    */
  @js.native
  sealed trait Ac3CodingMode extends js.Any
  object Ac3CodingMode extends js.Object {
    val CODING_MODE_1_0     = "CODING_MODE_1_0".asInstanceOf[Ac3CodingMode]
    val CODING_MODE_1_1     = "CODING_MODE_1_1".asInstanceOf[Ac3CodingMode]
    val CODING_MODE_2_0     = "CODING_MODE_2_0".asInstanceOf[Ac3CodingMode]
    val CODING_MODE_3_2_LFE = "CODING_MODE_3_2_LFE".asInstanceOf[Ac3CodingMode]

    val values = js.Object.freeze(js.Array(CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0, CODING_MODE_3_2_LFE))
  }

  /**
    * If set to FILM_STANDARD, adds dynamic range compression signaling to the output bitstream as defined in the Dolby Digital specification.
    */
  @js.native
  sealed trait Ac3DynamicRangeCompressionProfile extends js.Any
  object Ac3DynamicRangeCompressionProfile extends js.Object {
    val FILM_STANDARD = "FILM_STANDARD".asInstanceOf[Ac3DynamicRangeCompressionProfile]
    val NONE          = "NONE".asInstanceOf[Ac3DynamicRangeCompressionProfile]

    val values = js.Object.freeze(js.Array(FILM_STANDARD, NONE))
  }

  /**
    * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
    */
  @js.native
  sealed trait Ac3LfeFilter extends js.Any
  object Ac3LfeFilter extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[Ac3LfeFilter]
    val DISABLED = "DISABLED".asInstanceOf[Ac3LfeFilter]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
    */
  @js.native
  sealed trait Ac3MetadataControl extends js.Any
  object Ac3MetadataControl extends js.Object {
    val FOLLOW_INPUT   = "FOLLOW_INPUT".asInstanceOf[Ac3MetadataControl]
    val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[Ac3MetadataControl]

    val values = js.Object.freeze(js.Array(FOLLOW_INPUT, USE_CONFIGURED))
  }

  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AC3.
    */
  @js.native
  @Factory
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

  /**
    * Specify whether the service runs your job with accelerated transcoding. Choose DISABLED if you don't want accelerated transcoding. Choose ENABLED if you want your job to run with accelerated transcoding and to fail if your input files or your job settings aren't compatible with accelerated transcoding. Choose PREFERRED if you want your job to run with accelerated transcoding if the job is compatible with the feature and to run at standard speed if it's not.
    */
  @js.native
  sealed trait AccelerationMode extends js.Any
  object AccelerationMode extends js.Object {
    val DISABLED  = "DISABLED".asInstanceOf[AccelerationMode]
    val ENABLED   = "ENABLED".asInstanceOf[AccelerationMode]
    val PREFERRED = "PREFERRED".asInstanceOf[AccelerationMode]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED, PREFERRED))
  }

  /**
    * Accelerated transcoding can significantly speed up jobs with long, visually complex content. Outputs that use this feature incur pro-tier pricing. For information about feature limitations, see the AWS Elemental MediaConvert User Guide.
    */
  @js.native
  @Factory
  trait AccelerationSettings extends js.Object {
    var Mode: AccelerationMode
  }

  /**
    * Describes whether the current job is running with accelerated transcoding. For jobs that have Acceleration (AccelerationMode) set to DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have Acceleration (AccelerationMode) set to ENABLED or PREFERRED, AccelerationStatus is one of the other states. AccelerationStatus is IN_PROGRESS initially, while the service determines whether the input files and job settings are compatible with accelerated transcoding. If they are, AcclerationStatus is ACCELERATED. If your input files and job settings aren't compatible with accelerated transcoding, the service either fails your job or runs it without accelerated transcoding, depending on how you set Acceleration (AccelerationMode). When the service runs your job without accelerated transcoding, AccelerationStatus is NOT_ACCELERATED.
    */
  @js.native
  sealed trait AccelerationStatus extends js.Any
  object AccelerationStatus extends js.Object {
    val NOT_APPLICABLE  = "NOT_APPLICABLE".asInstanceOf[AccelerationStatus]
    val IN_PROGRESS     = "IN_PROGRESS".asInstanceOf[AccelerationStatus]
    val ACCELERATED     = "ACCELERATED".asInstanceOf[AccelerationStatus]
    val NOT_ACCELERATED = "NOT_ACCELERATED".asInstanceOf[AccelerationStatus]

    val values = js.Object.freeze(js.Array(NOT_APPLICABLE, IN_PROGRESS, ACCELERATED, NOT_ACCELERATED))
  }

  /**
    * This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert AFD signaling (AfdSignaling) to specify whether the service includes AFD values in the output video data and what those values are. * Choose None to remove all AFD values from this output. * Choose Fixed to ignore input AFD values and instead encode the value specified in the job. * Choose Auto to calculate output AFD values based on the input AFD scaler data.
    */
  @js.native
  sealed trait AfdSignaling extends js.Any
  object AfdSignaling extends js.Object {
    val NONE  = "NONE".asInstanceOf[AfdSignaling]
    val AUTO  = "AUTO".asInstanceOf[AfdSignaling]
    val FIXED = "FIXED".asInstanceOf[AfdSignaling]

    val values = js.Object.freeze(js.Array(NONE, AUTO, FIXED))
  }

  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AIFF.
    */
  @js.native
  @Factory
  trait AiffSettings extends js.Object {
    var BitDepth: js.UndefOr[__integerMin16Max24]
    var Channels: js.UndefOr[__integerMin1Max64]
    var SampleRate: js.UndefOr[__integerMin8000Max192000]
  }

  /**
    * Ignore this setting unless this input is a QuickTime animation with an alpha channel. Use this setting to create separate Key and Fill outputs. In each output, specify which part of the input MediaConvert uses. Leave this setting at the default value DISCARD to delete the alpha channel and preserve the video. Set it to REMAP_TO_LUMA to delete the video and map the alpha channel to the luma channel of your outputs.
    */
  @js.native
  sealed trait AlphaBehavior extends js.Any
  object AlphaBehavior extends js.Object {
    val DISCARD       = "DISCARD".asInstanceOf[AlphaBehavior]
    val REMAP_TO_LUMA = "REMAP_TO_LUMA".asInstanceOf[AlphaBehavior]

    val values = js.Object.freeze(js.Array(DISCARD, REMAP_TO_LUMA))
  }

  /**
    * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
    */
  @js.native
  sealed trait AncillaryConvert608To708 extends js.Any
  object AncillaryConvert608To708 extends js.Object {
    val UPCONVERT = "UPCONVERT".asInstanceOf[AncillaryConvert608To708]
    val DISABLED  = "DISABLED".asInstanceOf[AncillaryConvert608To708]

    val values = js.Object.freeze(js.Array(UPCONVERT, DISABLED))
  }

  /**
    * Settings for ancillary captions source.
    */
  @js.native
  @Factory
  trait AncillarySourceSettings extends js.Object {
    var Convert608To708: js.UndefOr[AncillaryConvert608To708]
    var SourceAncillaryChannelNumber: js.UndefOr[__integerMin1Max4]
    var TerminateCaptions: js.UndefOr[AncillaryTerminateCaptions]
  }

  /**
    * By default, the service terminates any unterminated captions at the end of each input. If you want the caption to continue onto your next input, disable this setting.
    */
  @js.native
  sealed trait AncillaryTerminateCaptions extends js.Any
  object AncillaryTerminateCaptions extends js.Object {
    val END_OF_INPUT = "END_OF_INPUT".asInstanceOf[AncillaryTerminateCaptions]
    val DISABLED     = "DISABLED".asInstanceOf[AncillaryTerminateCaptions]

    val values = js.Object.freeze(js.Array(END_OF_INPUT, DISABLED))
  }

  /**
    * The anti-alias filter is automatically applied to all outputs. The service no longer accepts the value DISABLED for AntiAlias. If you specify that in your job, the service will ignore the setting.
    */
  @js.native
  sealed trait AntiAlias extends js.Any
  object AntiAlias extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[AntiAlias]
    val ENABLED  = "ENABLED".asInstanceOf[AntiAlias]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  @js.native
  @Factory
  trait AssociateCertificateRequest extends js.Object {
    var Arn: __string
  }

  @js.native
  @Factory
  trait AssociateCertificateResponse extends js.Object {}

  /**
    * Type of Audio codec.
    */
  @js.native
  sealed trait AudioCodec extends js.Any
  object AudioCodec extends js.Object {
    val AAC         = "AAC".asInstanceOf[AudioCodec]
    val MP2         = "MP2".asInstanceOf[AudioCodec]
    val MP3         = "MP3".asInstanceOf[AudioCodec]
    val WAV         = "WAV".asInstanceOf[AudioCodec]
    val AIFF        = "AIFF".asInstanceOf[AudioCodec]
    val AC3         = "AC3".asInstanceOf[AudioCodec]
    val EAC3        = "EAC3".asInstanceOf[AudioCodec]
    val EAC3_ATMOS  = "EAC3_ATMOS".asInstanceOf[AudioCodec]
    val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[AudioCodec]

    val values = js.Object.freeze(js.Array(AAC, MP2, MP3, WAV, AIFF, AC3, EAC3, EAC3_ATMOS, PASSTHROUGH))
  }

  /**
    * Audio codec settings (CodecSettings) under (AudioDescriptions) contains the group of settings related to audio encoding. The settings in this group vary depending on the value that you choose for Audio codec (Codec). For each codec enum that you choose, define the corresponding settings object. The following lists the codec enum, settings object pairs. * AAC, AacSettings * MP2, Mp2Settings * MP3, Mp3Settings * WAV, WavSettings * AIFF, AiffSettings * AC3, Ac3Settings * EAC3, Eac3Settings * EAC3_ATMOS, Eac3AtmosSettings
    */
  @js.native
  @Factory
  trait AudioCodecSettings extends js.Object {
    var AacSettings: js.UndefOr[AacSettings]
    var Ac3Settings: js.UndefOr[Ac3Settings]
    var AiffSettings: js.UndefOr[AiffSettings]
    var Codec: js.UndefOr[AudioCodec]
    var Eac3AtmosSettings: js.UndefOr[Eac3AtmosSettings]
    var Eac3Settings: js.UndefOr[Eac3Settings]
    var Mp2Settings: js.UndefOr[Mp2Settings]
    var Mp3Settings: js.UndefOr[Mp3Settings]
    var WavSettings: js.UndefOr[WavSettings]
  }

  /**
    * Enable this setting on one audio selector to set it as the default for the job. The service uses this default for outputs where it can't find the specified input audio. If you don't set a default, those outputs have no audio.
    */
  @js.native
  sealed trait AudioDefaultSelection extends js.Any
  object AudioDefaultSelection extends js.Object {
    val DEFAULT     = "DEFAULT".asInstanceOf[AudioDefaultSelection]
    val NOT_DEFAULT = "NOT_DEFAULT".asInstanceOf[AudioDefaultSelection]

    val values = js.Object.freeze(js.Array(DEFAULT, NOT_DEFAULT))
  }

  /**
    * Description of audio output
    */
  @js.native
  @Factory
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

  /**
    * Specify which source for language code takes precedence for this audio track. When you choose Follow input (FOLLOW_INPUT), the service uses the language code from the input track if it's present. If there's no languge code on the input track, the service uses the code that you specify in the setting Language code (languageCode or customLanguageCode). When you choose Use configured (USE_CONFIGURED), the service uses the language code that you specify.
    */
  @js.native
  sealed trait AudioLanguageCodeControl extends js.Any
  object AudioLanguageCodeControl extends js.Object {
    val FOLLOW_INPUT   = "FOLLOW_INPUT".asInstanceOf[AudioLanguageCodeControl]
    val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[AudioLanguageCodeControl]

    val values = js.Object.freeze(js.Array(FOLLOW_INPUT, USE_CONFIGURED))
  }

  /**
    * Choose one of the following audio normalization algorithms: ITU-R BS.1770-1: Ungated loudness. A measurement of ungated average loudness for an entire piece of content, suitable for measurement of short-form content under ATSC recommendation A/85. Supports up to 5.1 audio channels. ITU-R BS.1770-2: Gated loudness. A measurement of gated average loudness compliant with the requirements of EBU-R128. Supports up to 5.1 audio channels. ITU-R BS.1770-3: Modified peak. The same loudness measurement algorithm as 1770-2, with an updated true peak measurement. ITU-R BS.1770-4: Higher channel count. Allows for more audio channels than the other algorithms, including configurations such as 7.1.
    */
  @js.native
  sealed trait AudioNormalizationAlgorithm extends js.Any
  object AudioNormalizationAlgorithm extends js.Object {
    val ITU_BS_1770_1 = "ITU_BS_1770_1".asInstanceOf[AudioNormalizationAlgorithm]
    val ITU_BS_1770_2 = "ITU_BS_1770_2".asInstanceOf[AudioNormalizationAlgorithm]
    val ITU_BS_1770_3 = "ITU_BS_1770_3".asInstanceOf[AudioNormalizationAlgorithm]
    val ITU_BS_1770_4 = "ITU_BS_1770_4".asInstanceOf[AudioNormalizationAlgorithm]

    val values = js.Object.freeze(js.Array(ITU_BS_1770_1, ITU_BS_1770_2, ITU_BS_1770_3, ITU_BS_1770_4))
  }

  /**
    * When enabled the output audio is corrected using the chosen algorithm. If disabled, the audio will be measured but not adjusted.
    */
  @js.native
  sealed trait AudioNormalizationAlgorithmControl extends js.Any
  object AudioNormalizationAlgorithmControl extends js.Object {
    val CORRECT_AUDIO = "CORRECT_AUDIO".asInstanceOf[AudioNormalizationAlgorithmControl]
    val MEASURE_ONLY  = "MEASURE_ONLY".asInstanceOf[AudioNormalizationAlgorithmControl]

    val values = js.Object.freeze(js.Array(CORRECT_AUDIO, MEASURE_ONLY))
  }

  /**
    * If set to LOG, log each output's audio track loudness to a CSV file.
    */
  @js.native
  sealed trait AudioNormalizationLoudnessLogging extends js.Any
  object AudioNormalizationLoudnessLogging extends js.Object {
    val LOG      = "LOG".asInstanceOf[AudioNormalizationLoudnessLogging]
    val DONT_LOG = "DONT_LOG".asInstanceOf[AudioNormalizationLoudnessLogging]

    val values = js.Object.freeze(js.Array(LOG, DONT_LOG))
  }

  /**
    * If set to TRUE_PEAK, calculate and log the TruePeak for each output's audio track loudness.
    */
  @js.native
  sealed trait AudioNormalizationPeakCalculation extends js.Any
  object AudioNormalizationPeakCalculation extends js.Object {
    val TRUE_PEAK = "TRUE_PEAK".asInstanceOf[AudioNormalizationPeakCalculation]
    val NONE      = "NONE".asInstanceOf[AudioNormalizationPeakCalculation]

    val values = js.Object.freeze(js.Array(TRUE_PEAK, NONE))
  }

  /**
    * Advanced audio normalization settings. Ignore these settings unless you need to comply with a loudness standard.
    */
  @js.native
  @Factory
  trait AudioNormalizationSettings extends js.Object {
    var Algorithm: js.UndefOr[AudioNormalizationAlgorithm]
    var AlgorithmControl: js.UndefOr[AudioNormalizationAlgorithmControl]
    var CorrectionGateLevel: js.UndefOr[__integerMinNegative70Max0]
    var LoudnessLogging: js.UndefOr[AudioNormalizationLoudnessLogging]
    var PeakCalculation: js.UndefOr[AudioNormalizationPeakCalculation]
    var TargetLkfs: js.UndefOr[__doubleMinNegative59Max0]
  }

  /**
    * Selector for Audio
    */
  @js.native
  @Factory
  trait AudioSelector extends js.Object {
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3]
    var DefaultSelection: js.UndefOr[AudioDefaultSelection]
    var ExternalAudioFileInput: js.UndefOr[
      __stringPatternS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEEHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEE
    ]
    var LanguageCode: js.UndefOr[LanguageCode]
    var Offset: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var Pids: js.UndefOr[__listOf__integerMin1Max2147483647]
    var ProgramSelection: js.UndefOr[__integerMin0Max8]
    var RemixSettings: js.UndefOr[RemixSettings]
    var SelectorType: js.UndefOr[AudioSelectorType]
    var Tracks: js.UndefOr[__listOf__integerMin1Max2147483647]
  }

  /**
    * Group of Audio Selectors
    */
  @js.native
  @Factory
  trait AudioSelectorGroup extends js.Object {
    var AudioSelectorNames: js.UndefOr[__listOf__stringMin1]
  }

  /**
    * Specifies the type of the audio selector.
    */
  @js.native
  sealed trait AudioSelectorType extends js.Any
  object AudioSelectorType extends js.Object {
    val PID           = "PID".asInstanceOf[AudioSelectorType]
    val TRACK         = "TRACK".asInstanceOf[AudioSelectorType]
    val LANGUAGE_CODE = "LANGUAGE_CODE".asInstanceOf[AudioSelectorType]

    val values = js.Object.freeze(js.Array(PID, TRACK, LANGUAGE_CODE))
  }

  /**
    * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise the value in Audio Type is included in the output. Note that this field and audioType are both ignored if audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
    */
  @js.native
  sealed trait AudioTypeControl extends js.Any
  object AudioTypeControl extends js.Object {
    val FOLLOW_INPUT   = "FOLLOW_INPUT".asInstanceOf[AudioTypeControl]
    val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[AudioTypeControl]

    val values = js.Object.freeze(js.Array(FOLLOW_INPUT, USE_CONFIGURED))
  }

  /**
    * Settings for Avail Blanking
    */
  @js.native
  @Factory
  trait AvailBlanking extends js.Object {
    var AvailBlankingImage: js.UndefOr[__stringMin14PatternS3BmpBMPPngPNGHttpsBmpBMPPngPNG]
  }

  /**
    * Optional. Choose a tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs on any billing report that you set up. Any transcoding outputs that don't have an associated tag will appear in your billing report unsorted. If you don't choose a valid value for this field, your job outputs will appear on the billing report unsorted.
    */
  @js.native
  sealed trait BillingTagsSource extends js.Any
  object BillingTagsSource extends js.Object {
    val QUEUE        = "QUEUE".asInstanceOf[BillingTagsSource]
    val PRESET       = "PRESET".asInstanceOf[BillingTagsSource]
    val JOB_TEMPLATE = "JOB_TEMPLATE".asInstanceOf[BillingTagsSource]
    val JOB          = "JOB".asInstanceOf[BillingTagsSource]

    val values = js.Object.freeze(js.Array(QUEUE, PRESET, JOB_TEMPLATE, JOB))
  }

  /**
    * Burn-In Destination Settings.
    */
  @js.native
  @Factory
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

  /**
    * If no explicit x_position or y_position is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  @js.native
  sealed trait BurninSubtitleAlignment extends js.Any
  object BurninSubtitleAlignment extends js.Object {
    val CENTERED = "CENTERED".asInstanceOf[BurninSubtitleAlignment]
    val LEFT     = "LEFT".asInstanceOf[BurninSubtitleAlignment]

    val values = js.Object.freeze(js.Array(CENTERED, LEFT))
  }

  /**
    * Specifies the color of the rectangle behind the captions.
    * All burn-in and DVB-Sub font settings must match.
    */
  @js.native
  sealed trait BurninSubtitleBackgroundColor extends js.Any
  object BurninSubtitleBackgroundColor extends js.Object {
    val NONE  = "NONE".asInstanceOf[BurninSubtitleBackgroundColor]
    val BLACK = "BLACK".asInstanceOf[BurninSubtitleBackgroundColor]
    val WHITE = "WHITE".asInstanceOf[BurninSubtitleBackgroundColor]

    val values = js.Object.freeze(js.Array(NONE, BLACK, WHITE))
  }

  /**
    * Specifies the color of the burned-in captions. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  @js.native
  sealed trait BurninSubtitleFontColor extends js.Any
  object BurninSubtitleFontColor extends js.Object {
    val WHITE  = "WHITE".asInstanceOf[BurninSubtitleFontColor]
    val BLACK  = "BLACK".asInstanceOf[BurninSubtitleFontColor]
    val YELLOW = "YELLOW".asInstanceOf[BurninSubtitleFontColor]
    val RED    = "RED".asInstanceOf[BurninSubtitleFontColor]
    val GREEN  = "GREEN".asInstanceOf[BurninSubtitleFontColor]
    val BLUE   = "BLUE".asInstanceOf[BurninSubtitleFontColor]

    val values = js.Object.freeze(js.Array(WHITE, BLACK, YELLOW, RED, GREEN, BLUE))
  }

  /**
    * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  @js.native
  sealed trait BurninSubtitleOutlineColor extends js.Any
  object BurninSubtitleOutlineColor extends js.Object {
    val BLACK  = "BLACK".asInstanceOf[BurninSubtitleOutlineColor]
    val WHITE  = "WHITE".asInstanceOf[BurninSubtitleOutlineColor]
    val YELLOW = "YELLOW".asInstanceOf[BurninSubtitleOutlineColor]
    val RED    = "RED".asInstanceOf[BurninSubtitleOutlineColor]
    val GREEN  = "GREEN".asInstanceOf[BurninSubtitleOutlineColor]
    val BLUE   = "BLUE".asInstanceOf[BurninSubtitleOutlineColor]

    val values = js.Object.freeze(js.Array(BLACK, WHITE, YELLOW, RED, GREEN, BLUE))
  }

  /**
    * Specifies the color of the shadow cast by the captions.
    * All burn-in and DVB-Sub font settings must match.
    */
  @js.native
  sealed trait BurninSubtitleShadowColor extends js.Any
  object BurninSubtitleShadowColor extends js.Object {
    val NONE  = "NONE".asInstanceOf[BurninSubtitleShadowColor]
    val BLACK = "BLACK".asInstanceOf[BurninSubtitleShadowColor]
    val WHITE = "WHITE".asInstanceOf[BurninSubtitleShadowColor]

    val values = js.Object.freeze(js.Array(NONE, BLACK, WHITE))
  }

  /**
    * Only applies to jobs with input captions in Teletext or STL formats. Specify whether the spacing between letters in your captions is set by the captions grid or varies depending on letter width. Choose fixed grid to conform to the spacing specified in the captions file more accurately. Choose proportional to make the text easier to read if the captions are closed caption.
    */
  @js.native
  sealed trait BurninSubtitleTeletextSpacing extends js.Any
  object BurninSubtitleTeletextSpacing extends js.Object {
    val FIXED_GRID   = "FIXED_GRID".asInstanceOf[BurninSubtitleTeletextSpacing]
    val PROPORTIONAL = "PROPORTIONAL".asInstanceOf[BurninSubtitleTeletextSpacing]

    val values = js.Object.freeze(js.Array(FIXED_GRID, PROPORTIONAL))
  }

  @js.native
  @Factory
  trait CancelJobRequest extends js.Object {
    var Id: __string
  }

  @js.native
  @Factory
  trait CancelJobResponse extends js.Object {}

  /**
    * Description of Caption output
    */
  @js.native
  @Factory
  trait CaptionDescription extends js.Object {
    var CaptionSelectorName: js.UndefOr[__stringMin1]
    var CustomLanguageCode: js.UndefOr[__stringPatternAZaZ23AZaZ]
    var DestinationSettings: js.UndefOr[CaptionDestinationSettings]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LanguageDescription: js.UndefOr[__string]
  }

  /**
    * Caption Description for preset
    */
  @js.native
  @Factory
  trait CaptionDescriptionPreset extends js.Object {
    var CustomLanguageCode: js.UndefOr[__stringPatternAZaZ23AZaZ]
    var DestinationSettings: js.UndefOr[CaptionDestinationSettings]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LanguageDescription: js.UndefOr[__string]
  }

  /**
    * Specific settings required by destination type. Note that burnin_destination_settings are not available if the source of the caption data is Embedded or Teletext.
    */
  @js.native
  @Factory
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

  /**
    * Specify the format for this set of captions on this output. The default format is embedded without SCTE-20. Other options are embedded with SCTE-20, burn-in, DVB-sub, IMSC, SCC, SRT, teletext, TTML, and web-VTT. If you are using SCTE-20, choose SCTE-20 plus embedded (SCTE20_PLUS_EMBEDDED) to create an output that complies with the SCTE-43 spec. To create a non-compliant output where the embedded captions come first, choose Embedded plus SCTE-20 (EMBEDDED_PLUS_SCTE20).
    */
  @js.native
  sealed trait CaptionDestinationType extends js.Any
  object CaptionDestinationType extends js.Object {
    val BURN_IN              = "BURN_IN".asInstanceOf[CaptionDestinationType]
    val DVB_SUB              = "DVB_SUB".asInstanceOf[CaptionDestinationType]
    val EMBEDDED             = "EMBEDDED".asInstanceOf[CaptionDestinationType]
    val EMBEDDED_PLUS_SCTE20 = "EMBEDDED_PLUS_SCTE20".asInstanceOf[CaptionDestinationType]
    val IMSC                 = "IMSC".asInstanceOf[CaptionDestinationType]
    val SCTE20_PLUS_EMBEDDED = "SCTE20_PLUS_EMBEDDED".asInstanceOf[CaptionDestinationType]
    val SCC                  = "SCC".asInstanceOf[CaptionDestinationType]
    val SRT                  = "SRT".asInstanceOf[CaptionDestinationType]
    val SMI                  = "SMI".asInstanceOf[CaptionDestinationType]
    val TELETEXT             = "TELETEXT".asInstanceOf[CaptionDestinationType]
    val TTML                 = "TTML".asInstanceOf[CaptionDestinationType]
    val WEBVTT               = "WEBVTT".asInstanceOf[CaptionDestinationType]

    val values = js.Object.freeze(
      js.Array(
        BURN_IN,
        DVB_SUB,
        EMBEDDED,
        EMBEDDED_PLUS_SCTE20,
        IMSC,
        SCTE20_PLUS_EMBEDDED,
        SCC,
        SRT,
        SMI,
        TELETEXT,
        TTML,
        WEBVTT
      )
    )
  }

  /**
    * Set up captions in your outputs by first selecting them from your input here.
    */
  @js.native
  @Factory
  trait CaptionSelector extends js.Object {
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3]
    var LanguageCode: js.UndefOr[LanguageCode]
    var SourceSettings: js.UndefOr[CaptionSourceSettings]
  }

  /**
    * If your input captions are SCC, TTML, STL, SMI, SRT, or IMSC in an xml file, specify the URI of the input captions source file. If your input captions are IMSC in an IMF package, use TrackSourceSettings instead of FileSoureSettings.
    */
  @js.native
  @Factory
  trait CaptionSourceSettings extends js.Object {
    var AncillarySourceSettings: js.UndefOr[AncillarySourceSettings]
    var DvbSubSourceSettings: js.UndefOr[DvbSubSourceSettings]
    var EmbeddedSourceSettings: js.UndefOr[EmbeddedSourceSettings]
    var FileSourceSettings: js.UndefOr[FileSourceSettings]
    var SourceType: js.UndefOr[CaptionSourceType]
    var TeletextSourceSettings: js.UndefOr[TeletextSourceSettings]
    var TrackSourceSettings: js.UndefOr[TrackSourceSettings]
  }

  /**
    * Use Source (SourceType) to identify the format of your input captions.  The service cannot auto-detect caption format.
    */
  @js.native
  sealed trait CaptionSourceType extends js.Any
  object CaptionSourceType extends js.Object {
    val ANCILLARY   = "ANCILLARY".asInstanceOf[CaptionSourceType]
    val DVB_SUB     = "DVB_SUB".asInstanceOf[CaptionSourceType]
    val EMBEDDED    = "EMBEDDED".asInstanceOf[CaptionSourceType]
    val SCTE20      = "SCTE20".asInstanceOf[CaptionSourceType]
    val SCC         = "SCC".asInstanceOf[CaptionSourceType]
    val TTML        = "TTML".asInstanceOf[CaptionSourceType]
    val STL         = "STL".asInstanceOf[CaptionSourceType]
    val SRT         = "SRT".asInstanceOf[CaptionSourceType]
    val SMI         = "SMI".asInstanceOf[CaptionSourceType]
    val TELETEXT    = "TELETEXT".asInstanceOf[CaptionSourceType]
    val NULL_SOURCE = "NULL_SOURCE".asInstanceOf[CaptionSourceType]
    val IMSC        = "IMSC".asInstanceOf[CaptionSourceType]

    val values = js.Object.freeze(
      js.Array(ANCILLARY, DVB_SUB, EMBEDDED, SCTE20, SCC, TTML, STL, SRT, SMI, TELETEXT, NULL_SOURCE, IMSC)
    )
  }

  /**
    * Channel mapping (ChannelMapping) contains the group of fields that hold the remixing value for each channel. Units are in dB. Acceptable values are within the range from -60 (mute) through 6. A setting of 0 passes the input channel unchanged to the output channel (no attenuation or amplification).
    */
  @js.native
  @Factory
  trait ChannelMapping extends js.Object {
    var OutputChannels: js.UndefOr[__listOfOutputChannelMapping]
  }

  /**
    * Specify the details for each pair of HLS and DASH additional manifests that you want the service to generate for this CMAF output group. Each pair of manifests can reference a different subset of outputs in the group.
    */
  @js.native
  @Factory
  trait CmafAdditionalManifest extends js.Object {
    var ManifestNameModifier: js.UndefOr[__stringMin1]
    var SelectedOutputs: js.UndefOr[__listOf__stringMin1]
  }

  /**
    * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for later replay.
    */
  @js.native
  sealed trait CmafClientCache extends js.Any
  object CmafClientCache extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[CmafClientCache]
    val ENABLED  = "ENABLED".asInstanceOf[CmafClientCache]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
    */
  @js.native
  sealed trait CmafCodecSpecification extends js.Any
  object CmafCodecSpecification extends js.Object {
    val RFC_6381 = "RFC_6381".asInstanceOf[CmafCodecSpecification]
    val RFC_4281 = "RFC_4281".asInstanceOf[CmafCodecSpecification]

    val values = js.Object.freeze(js.Array(RFC_6381, RFC_4281))
  }

  /**
    * Settings for CMAF encryption
    */
  @js.native
  @Factory
  trait CmafEncryptionSettings extends js.Object {
    var ConstantInitializationVector: js.UndefOr[__stringMin32Max32Pattern09aFAF32]
    var EncryptionMethod: js.UndefOr[CmafEncryptionType]
    var InitializationVectorInManifest: js.UndefOr[CmafInitializationVectorInManifest]
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProviderCmaf]
    var StaticKeyProvider: js.UndefOr[StaticKeyProvider]
    var Type: js.UndefOr[CmafKeyProviderType]
  }

  /**
    * Specify the encryption scheme that you want the service to use when encrypting your CMAF segments. Choose AES-CBC subsample (SAMPLE-AES) or AES_CTR (AES-CTR).
    */
  @js.native
  sealed trait CmafEncryptionType extends js.Any
  object CmafEncryptionType extends js.Object {
    val SAMPLE_AES = "SAMPLE_AES".asInstanceOf[CmafEncryptionType]
    val AES_CTR    = "AES_CTR".asInstanceOf[CmafEncryptionType]

    val values = js.Object.freeze(js.Array(SAMPLE_AES, AES_CTR))
  }

  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to CMAF_GROUP_SETTINGS. Each output in a CMAF Output Group may only contain a single video, audio, or caption output.
    */
  @js.native
  @Factory
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

  /**
    * When you use DRM with CMAF outputs, choose whether the service writes the 128-bit encryption initialization vector in the HLS and DASH manifests.
    */
  @js.native
  sealed trait CmafInitializationVectorInManifest extends js.Any
  object CmafInitializationVectorInManifest extends js.Object {
    val INCLUDE = "INCLUDE".asInstanceOf[CmafInitializationVectorInManifest]
    val EXCLUDE = "EXCLUDE".asInstanceOf[CmafInitializationVectorInManifest]

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
    */
  @js.native
  sealed trait CmafKeyProviderType extends js.Any
  object CmafKeyProviderType extends js.Object {
    val SPEKE      = "SPEKE".asInstanceOf[CmafKeyProviderType]
    val STATIC_KEY = "STATIC_KEY".asInstanceOf[CmafKeyProviderType]

    val values = js.Object.freeze(js.Array(SPEKE, STATIC_KEY))
  }

  /**
    * When set to GZIP, compresses HLS playlist.
    */
  @js.native
  sealed trait CmafManifestCompression extends js.Any
  object CmafManifestCompression extends js.Object {
    val GZIP = "GZIP".asInstanceOf[CmafManifestCompression]
    val NONE = "NONE".asInstanceOf[CmafManifestCompression]

    val values = js.Object.freeze(js.Array(GZIP, NONE))
  }

  /**
    * Indicates whether the output manifest should use floating point values for segment duration.
    */
  @js.native
  sealed trait CmafManifestDurationFormat extends js.Any
  object CmafManifestDurationFormat extends js.Object {
    val FLOATING_POINT = "FLOATING_POINT".asInstanceOf[CmafManifestDurationFormat]
    val INTEGER        = "INTEGER".asInstanceOf[CmafManifestDurationFormat]

    val values = js.Object.freeze(js.Array(FLOATING_POINT, INTEGER))
  }

  /**
    * Specify whether your DASH profile is on-demand or main. When you choose Main profile (MAIN_PROFILE), the service signals  urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE), the service signals urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose On-demand, you must also set the output group setting Segment control (SegmentControl) to Single file (SINGLE_FILE).
    */
  @js.native
  sealed trait CmafMpdProfile extends js.Any
  object CmafMpdProfile extends js.Object {
    val MAIN_PROFILE      = "MAIN_PROFILE".asInstanceOf[CmafMpdProfile]
    val ON_DEMAND_PROFILE = "ON_DEMAND_PROFILE".asInstanceOf[CmafMpdProfile]

    val values = js.Object.freeze(js.Array(MAIN_PROFILE, ON_DEMAND_PROFILE))
  }

  /**
    * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
    */
  @js.native
  sealed trait CmafSegmentControl extends js.Any
  object CmafSegmentControl extends js.Object {
    val SINGLE_FILE     = "SINGLE_FILE".asInstanceOf[CmafSegmentControl]
    val SEGMENTED_FILES = "SEGMENTED_FILES".asInstanceOf[CmafSegmentControl]

    val values = js.Object.freeze(js.Array(SINGLE_FILE, SEGMENTED_FILES))
  }

  /**
    * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
    */
  @js.native
  sealed trait CmafStreamInfResolution extends js.Any
  object CmafStreamInfResolution extends js.Object {
    val INCLUDE = "INCLUDE".asInstanceOf[CmafStreamInfResolution]
    val EXCLUDE = "EXCLUDE".asInstanceOf[CmafStreamInfResolution]

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * When set to ENABLED, a DASH MPD manifest will be generated for this output.
    */
  @js.native
  sealed trait CmafWriteDASHManifest extends js.Any
  object CmafWriteDASHManifest extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[CmafWriteDASHManifest]
    val ENABLED  = "ENABLED".asInstanceOf[CmafWriteDASHManifest]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * When set to ENABLED, an Apple HLS manifest will be generated for this output.
    */
  @js.native
  sealed trait CmafWriteHLSManifest extends js.Any
  object CmafWriteHLSManifest extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[CmafWriteHLSManifest]
    val ENABLED  = "ENABLED".asInstanceOf[CmafWriteHLSManifest]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * When you enable Precise segment duration in DASH manifests (writeSegmentTimelineInRepresentation), your DASH manifest shows precise segment durations. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your DASH manifest are approximate. The segment duration information appears in the duration attribute of the SegmentTemplate element.
    */
  @js.native
  sealed trait CmafWriteSegmentTimelineInRepresentation extends js.Any
  object CmafWriteSegmentTimelineInRepresentation extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[CmafWriteSegmentTimelineInRepresentation]
    val DISABLED = "DISABLED".asInstanceOf[CmafWriteSegmentTimelineInRepresentation]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
    */
  @js.native
  sealed trait CmfcScte35Esam extends js.Any
  object CmfcScte35Esam extends js.Object {
    val INSERT = "INSERT".asInstanceOf[CmfcScte35Esam]
    val NONE   = "NONE".asInstanceOf[CmfcScte35Esam]

    val values = js.Object.freeze(js.Array(INSERT, NONE))
  }

  /**
    * Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want those SCTE-35 markers in this output.
    */
  @js.native
  sealed trait CmfcScte35Source extends js.Any
  object CmfcScte35Source extends js.Object {
    val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[CmfcScte35Source]
    val NONE        = "NONE".asInstanceOf[CmfcScte35Source]

    val values = js.Object.freeze(js.Array(PASSTHROUGH, NONE))
  }

  /**
    * Settings for MP4 segments in CMAF
    */
  @js.native
  @Factory
  trait CmfcSettings extends js.Object {
    var Scte35Esam: js.UndefOr[CmfcScte35Esam]
    var Scte35Source: js.UndefOr[CmfcScte35Source]
  }

  /**
    * Settings for color correction.
    */
  @js.native
  @Factory
  trait ColorCorrector extends js.Object {
    var Brightness: js.UndefOr[__integerMin1Max100]
    var ColorSpaceConversion: js.UndefOr[ColorSpaceConversion]
    var Contrast: js.UndefOr[__integerMin1Max100]
    var Hdr10Metadata: js.UndefOr[Hdr10Metadata]
    var Hue: js.UndefOr[__integerMinNegative180Max180]
    var Saturation: js.UndefOr[__integerMin1Max100]
  }

  /**
    * Choose Insert (INSERT) for this setting to include color metadata in this output. Choose Ignore (IGNORE) to exclude color metadata from this output. If you don't specify a value, the service sets this to Insert by default.
    */
  @js.native
  sealed trait ColorMetadata extends js.Any
  object ColorMetadata extends js.Object {
    val IGNORE = "IGNORE".asInstanceOf[ColorMetadata]
    val INSERT = "INSERT".asInstanceOf[ColorMetadata]

    val values = js.Object.freeze(js.Array(IGNORE, INSERT))
  }

  /**
    * If your input video has accurate color space metadata, or if you don't know about color space, leave this set to the default value Follow (FOLLOW). The service will automatically detect your input color space. If your input video has metadata indicating the wrong color space, specify the accurate color space here. If your input video is HDR 10 and the SMPTE ST 2086 Mastering Display Color Volume static metadata isn't present in your video stream, or if that metadata is present but not accurate, choose Force HDR 10 (FORCE_HDR10) here and specify correct values in the input HDR 10 metadata (Hdr10Metadata) settings. For more information about MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
    */
  @js.native
  sealed trait ColorSpace extends js.Any
  object ColorSpace extends js.Object {
    val FOLLOW   = "FOLLOW".asInstanceOf[ColorSpace]
    val REC_601  = "REC_601".asInstanceOf[ColorSpace]
    val REC_709  = "REC_709".asInstanceOf[ColorSpace]
    val HDR10    = "HDR10".asInstanceOf[ColorSpace]
    val HLG_2020 = "HLG_2020".asInstanceOf[ColorSpace]

    val values = js.Object.freeze(js.Array(FOLLOW, REC_601, REC_709, HDR10, HLG_2020))
  }

  /**
    * Specify the color space you want for this output. The service supports conversion between HDR formats, between SDR formats, and from SDR to HDR. The service doesn't support conversion from HDR to SDR. SDR to HDR conversion doesn't upgrade the dynamic range. The converted video has an HDR format, but visually appears the same as an unconverted output.
    */
  @js.native
  sealed trait ColorSpaceConversion extends js.Any
  object ColorSpaceConversion extends js.Object {
    val NONE           = "NONE".asInstanceOf[ColorSpaceConversion]
    val FORCE_601      = "FORCE_601".asInstanceOf[ColorSpaceConversion]
    val FORCE_709      = "FORCE_709".asInstanceOf[ColorSpaceConversion]
    val FORCE_HDR10    = "FORCE_HDR10".asInstanceOf[ColorSpaceConversion]
    val FORCE_HLG_2020 = "FORCE_HLG_2020".asInstanceOf[ColorSpaceConversion]

    val values = js.Object.freeze(js.Array(NONE, FORCE_601, FORCE_709, FORCE_HDR10, FORCE_HLG_2020))
  }

  /**
    * There are two sources for color metadata, the input file and the job input settings Color space (ColorSpace) and HDR master display information settings(Hdr10Metadata). The Color space usage setting determines which takes precedence. Choose Force (FORCE) to use color metadata from the input job settings. If you don't specify values for those settings, the service defaults to using metadata from your input. FALLBACK - Choose Fallback (FALLBACK) to use color metadata from the source when it is present. If there's no color metadata in your input file, the service defaults to using values you specify in the input settings.
    */
  @js.native
  sealed trait ColorSpaceUsage extends js.Any
  object ColorSpaceUsage extends js.Object {
    val FORCE    = "FORCE".asInstanceOf[ColorSpaceUsage]
    val FALLBACK = "FALLBACK".asInstanceOf[ColorSpaceUsage]

    val values = js.Object.freeze(js.Array(FORCE, FALLBACK))
  }

  /**
    * The length of the term of your reserved queue pricing plan commitment.
    */
  @js.native
  sealed trait Commitment extends js.Any
  object Commitment extends js.Object {
    val ONE_YEAR = "ONE_YEAR".asInstanceOf[Commitment]

    val values = js.Object.freeze(js.Array(ONE_YEAR))
  }

  /**
    * Container specific settings.
    */
  @js.native
  @Factory
  trait ContainerSettings extends js.Object {
    var CmfcSettings: js.UndefOr[CmfcSettings]
    var Container: js.UndefOr[ContainerType]
    var F4vSettings: js.UndefOr[F4vSettings]
    var M2tsSettings: js.UndefOr[M2tsSettings]
    var M3u8Settings: js.UndefOr[M3u8Settings]
    var MovSettings: js.UndefOr[MovSettings]
    var Mp4Settings: js.UndefOr[Mp4Settings]
    var MpdSettings: js.UndefOr[MpdSettings]
  }

  /**
    * Container for this output. Some containers require a container settings object. If not specified, the default object will be created.
    */
  @js.native
  sealed trait ContainerType extends js.Any
  object ContainerType extends js.Object {
    val F4V  = "F4V".asInstanceOf[ContainerType]
    val ISMV = "ISMV".asInstanceOf[ContainerType]
    val M2TS = "M2TS".asInstanceOf[ContainerType]
    val M3U8 = "M3U8".asInstanceOf[ContainerType]
    val CMFC = "CMFC".asInstanceOf[ContainerType]
    val MOV  = "MOV".asInstanceOf[ContainerType]
    val MP4  = "MP4".asInstanceOf[ContainerType]
    val MPD  = "MPD".asInstanceOf[ContainerType]
    val MXF  = "MXF".asInstanceOf[ContainerType]
    val RAW  = "RAW".asInstanceOf[ContainerType]

    val values = js.Object.freeze(js.Array(F4V, ISMV, M2TS, M3U8, CMFC, MOV, MP4, MPD, MXF, RAW))
  }

  @js.native
  @Factory
  trait CreateJobRequest extends js.Object {
    var Role: __string
    var Settings: JobSettings
    var AccelerationSettings: js.UndefOr[AccelerationSettings]
    var BillingTagsSource: js.UndefOr[BillingTagsSource]
    var ClientRequestToken: js.UndefOr[__string]
    var JobTemplate: js.UndefOr[__string]
    var Priority: js.UndefOr[__integerMinNegative50Max50]
    var Queue: js.UndefOr[__string]
    var SimulateReservedQueue: js.UndefOr[SimulateReservedQueue]
    var StatusUpdateInterval: js.UndefOr[StatusUpdateInterval]
    var Tags: js.UndefOr[__mapOf__string]
    var UserMetadata: js.UndefOr[__mapOf__string]
  }

  @js.native
  @Factory
  trait CreateJobResponse extends js.Object {
    var Job: js.UndefOr[Job]
  }

  @js.native
  @Factory
  trait CreateJobTemplateRequest extends js.Object {
    var Name: __string
    var Settings: JobTemplateSettings
    var AccelerationSettings: js.UndefOr[AccelerationSettings]
    var Category: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var Priority: js.UndefOr[__integerMinNegative50Max50]
    var Queue: js.UndefOr[__string]
    var StatusUpdateInterval: js.UndefOr[StatusUpdateInterval]
    var Tags: js.UndefOr[__mapOf__string]
  }

  @js.native
  @Factory
  trait CreateJobTemplateResponse extends js.Object {
    var JobTemplate: js.UndefOr[JobTemplate]
  }

  @js.native
  @Factory
  trait CreatePresetRequest extends js.Object {
    var Name: __string
    var Settings: PresetSettings
    var Category: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
  }

  @js.native
  @Factory
  trait CreatePresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset]
  }

  @js.native
  @Factory
  trait CreateQueueRequest extends js.Object {
    var Name: __string
    var Description: js.UndefOr[__string]
    var PricingPlan: js.UndefOr[PricingPlan]
    var ReservationPlanSettings: js.UndefOr[ReservationPlanSettings]
    var Status: js.UndefOr[QueueStatus]
    var Tags: js.UndefOr[__mapOf__string]
  }

  @js.native
  @Factory
  trait CreateQueueResponse extends js.Object {
    var Queue: js.UndefOr[Queue]
  }

  /**
    * Specify the details for each additional DASH manifest that you want the service to generate for this output group. Each manifest can reference a different subset of outputs in the group.
    */
  @js.native
  @Factory
  trait DashAdditionalManifest extends js.Object {
    var ManifestNameModifier: js.UndefOr[__stringMin1]
    var SelectedOutputs: js.UndefOr[__listOf__stringMin1]
  }

  /**
    * Specifies DRM settings for DASH outputs.
    */
  @js.native
  @Factory
  trait DashIsoEncryptionSettings extends js.Object {
    var PlaybackDeviceCompatibility: js.UndefOr[DashIsoPlaybackDeviceCompatibility]
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProvider]
  }

  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to DASH_ISO_GROUP_SETTINGS.
    */
  @js.native
  @Factory
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

  /**
    * Supports HbbTV specification as indicated
    */
  @js.native
  sealed trait DashIsoHbbtvCompliance extends js.Any
  object DashIsoHbbtvCompliance extends js.Object {
    val HBBTV_1_5 = "HBBTV_1_5".asInstanceOf[DashIsoHbbtvCompliance]
    val NONE      = "NONE".asInstanceOf[DashIsoHbbtvCompliance]

    val values = js.Object.freeze(js.Array(HBBTV_1_5, NONE))
  }

  /**
    * Specify whether your DASH profile is on-demand or main. When you choose Main profile (MAIN_PROFILE), the service signals  urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE), the service signals urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose On-demand, you must also set the output group setting Segment control (SegmentControl) to Single file (SINGLE_FILE).
    */
  @js.native
  sealed trait DashIsoMpdProfile extends js.Any
  object DashIsoMpdProfile extends js.Object {
    val MAIN_PROFILE      = "MAIN_PROFILE".asInstanceOf[DashIsoMpdProfile]
    val ON_DEMAND_PROFILE = "ON_DEMAND_PROFILE".asInstanceOf[DashIsoMpdProfile]

    val values = js.Object.freeze(js.Array(MAIN_PROFILE, ON_DEMAND_PROFILE))
  }

  /**
    * This setting can improve the compatibility of your output with video players on obsolete devices. It applies only to DASH H.264 outputs with DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to correct problems with playback on older devices. Otherwise, keep the default setting CENC v1 (CENC_V1). If you choose Unencrypted SEI, for that output, the service will exclude the access unit delimiter and will leave the SEI NAL units unencrypted.
    */
  @js.native
  sealed trait DashIsoPlaybackDeviceCompatibility extends js.Any
  object DashIsoPlaybackDeviceCompatibility extends js.Object {
    val CENC_V1         = "CENC_V1".asInstanceOf[DashIsoPlaybackDeviceCompatibility]
    val UNENCRYPTED_SEI = "UNENCRYPTED_SEI".asInstanceOf[DashIsoPlaybackDeviceCompatibility]

    val values = js.Object.freeze(js.Array(CENC_V1, UNENCRYPTED_SEI))
  }

  /**
    * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
    */
  @js.native
  sealed trait DashIsoSegmentControl extends js.Any
  object DashIsoSegmentControl extends js.Object {
    val SINGLE_FILE     = "SINGLE_FILE".asInstanceOf[DashIsoSegmentControl]
    val SEGMENTED_FILES = "SEGMENTED_FILES".asInstanceOf[DashIsoSegmentControl]

    val values = js.Object.freeze(js.Array(SINGLE_FILE, SEGMENTED_FILES))
  }

  /**
    * When you enable Precise segment duration in manifests (writeSegmentTimelineInRepresentation), your DASH manifest shows precise segment durations. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your DASH manifest are approximate. The segment duration information appears in the duration attribute of the SegmentTemplate element.
    */
  @js.native
  sealed trait DashIsoWriteSegmentTimelineInRepresentation extends js.Any
  object DashIsoWriteSegmentTimelineInRepresentation extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[DashIsoWriteSegmentTimelineInRepresentation]
    val DISABLED = "DISABLED".asInstanceOf[DashIsoWriteSegmentTimelineInRepresentation]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Specify the encryption mode that you used to encrypt your input files.
    */
  @js.native
  sealed trait DecryptionMode extends js.Any
  object DecryptionMode extends js.Object {
    val AES_CTR = "AES_CTR".asInstanceOf[DecryptionMode]
    val AES_CBC = "AES_CBC".asInstanceOf[DecryptionMode]
    val AES_GCM = "AES_GCM".asInstanceOf[DecryptionMode]

    val values = js.Object.freeze(js.Array(AES_CTR, AES_CBC, AES_GCM))
  }

  /**
    * Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace (DEINTERLACE) or Adaptive (ADAPTIVE). Motion adaptive interpolate (INTERPOLATE) produces sharper pictures, while blend (BLEND) produces smoother motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source file includes a ticker, such as a scrolling headline at the bottom of the frame.
    */
  @js.native
  sealed trait DeinterlaceAlgorithm extends js.Any
  object DeinterlaceAlgorithm extends js.Object {
    val INTERPOLATE        = "INTERPOLATE".asInstanceOf[DeinterlaceAlgorithm]
    val INTERPOLATE_TICKER = "INTERPOLATE_TICKER".asInstanceOf[DeinterlaceAlgorithm]
    val BLEND              = "BLEND".asInstanceOf[DeinterlaceAlgorithm]
    val BLEND_TICKER       = "BLEND_TICKER".asInstanceOf[DeinterlaceAlgorithm]

    val values = js.Object.freeze(js.Array(INTERPOLATE, INTERPOLATE_TICKER, BLEND, BLEND_TICKER))
  }

  /**
    * Settings for deinterlacer
    */
  @js.native
  @Factory
  trait Deinterlacer extends js.Object {
    var Algorithm: js.UndefOr[DeinterlaceAlgorithm]
    var Control: js.UndefOr[DeinterlacerControl]
    var Mode: js.UndefOr[DeinterlacerMode]
  }

  /**
    * - When set to NORMAL (default), the deinterlacer does not convert frames that are tagged  in metadata as progressive. It will only convert those that are tagged as some other type. - When set to FORCE_ALL_FRAMES, the deinterlacer converts every frame to progressive - even those that are already tagged as progressive. Turn Force mode on only if there is  a good chance that the metadata has tagged frames as progressive when they are not  progressive. Do not turn on otherwise; processing frames that are already progressive  into progressive will probably result in lower quality video.
    */
  @js.native
  sealed trait DeinterlacerControl extends js.Any
  object DeinterlacerControl extends js.Object {
    val FORCE_ALL_FRAMES = "FORCE_ALL_FRAMES".asInstanceOf[DeinterlacerControl]
    val NORMAL           = "NORMAL".asInstanceOf[DeinterlacerControl]

    val values = js.Object.freeze(js.Array(FORCE_ALL_FRAMES, NORMAL))
  }

  /**
    * Use Deinterlacer (DeinterlaceMode) to choose how the service will do deinterlacing. Default is Deinterlace. - Deinterlace converts interlaced to progressive. - Inverse telecine converts Hard Telecine 29.97i to progressive 23.976p. - Adaptive auto-detects and converts to progressive.
    */
  @js.native
  sealed trait DeinterlacerMode extends js.Any
  object DeinterlacerMode extends js.Object {
    val DEINTERLACE      = "DEINTERLACE".asInstanceOf[DeinterlacerMode]
    val INVERSE_TELECINE = "INVERSE_TELECINE".asInstanceOf[DeinterlacerMode]
    val ADAPTIVE         = "ADAPTIVE".asInstanceOf[DeinterlacerMode]

    val values = js.Object.freeze(js.Array(DEINTERLACE, INVERSE_TELECINE, ADAPTIVE))
  }

  @js.native
  @Factory
  trait DeleteJobTemplateRequest extends js.Object {
    var Name: __string
  }

  @js.native
  @Factory
  trait DeleteJobTemplateResponse extends js.Object {}

  @js.native
  @Factory
  trait DeletePresetRequest extends js.Object {
    var Name: __string
  }

  @js.native
  @Factory
  trait DeletePresetResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteQueueRequest extends js.Object {
    var Name: __string
  }

  @js.native
  @Factory
  trait DeleteQueueResponse extends js.Object {}

  /**
    * Optional field, defaults to DEFAULT. Specify DEFAULT for this operation to return your endpoints if any exist, or to create an endpoint for you and return it if one doesn't already exist. Specify GET_ONLY to return your endpoints if any exist, or an empty list if none exist.
    */
  @js.native
  sealed trait DescribeEndpointsMode extends js.Any
  object DescribeEndpointsMode extends js.Object {
    val DEFAULT  = "DEFAULT".asInstanceOf[DescribeEndpointsMode]
    val GET_ONLY = "GET_ONLY".asInstanceOf[DescribeEndpointsMode]

    val values = js.Object.freeze(js.Array(DEFAULT, GET_ONLY))
  }

  /**
    * DescribeEndpointsRequest
    */
  @js.native
  @Factory
  trait DescribeEndpointsRequest extends js.Object {
    var MaxResults: js.UndefOr[__integer]
    var Mode: js.UndefOr[DescribeEndpointsMode]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DescribeEndpointsResponse extends js.Object {
    var Endpoints: js.UndefOr[__listOfEndpoint]
    var NextToken: js.UndefOr[__string]
  }

  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  @js.native
  @Factory
  trait DestinationSettings extends js.Object {
    var S3Settings: js.UndefOr[S3DestinationSettings]
  }

  @js.native
  @Factory
  trait DisassociateCertificateRequest extends js.Object {
    var Arn: __string
  }

  @js.native
  @Factory
  trait DisassociateCertificateResponse extends js.Object {}

  /**
    * Settings for Dolby Vision
    */
  @js.native
  @Factory
  trait DolbyVision extends js.Object {
    var L6Metadata: js.UndefOr[DolbyVisionLevel6Metadata]
    var L6Mode: js.UndefOr[DolbyVisionLevel6Mode]
    var Profile: js.UndefOr[DolbyVisionProfile]
  }

  /**
    * Use these settings when you set DolbyVisionLevel6Mode to SPECIFY to override the MaxCLL and MaxFALL values in your input with new values.
    */
  @js.native
  @Factory
  trait DolbyVisionLevel6Metadata extends js.Object {
    var MaxCll: js.UndefOr[__integerMin0Max65535]
    var MaxFall: js.UndefOr[__integerMin0Max65535]
  }

  /**
    * Use Dolby Vision Mode to choose how the service will handle Dolby Vision MaxCLL and MaxFALL properies.
    */
  @js.native
  sealed trait DolbyVisionLevel6Mode extends js.Any
  object DolbyVisionLevel6Mode extends js.Object {
    val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[DolbyVisionLevel6Mode]
    val RECALCULATE = "RECALCULATE".asInstanceOf[DolbyVisionLevel6Mode]
    val SPECIFY     = "SPECIFY".asInstanceOf[DolbyVisionLevel6Mode]

    val values = js.Object.freeze(js.Array(PASSTHROUGH, RECALCULATE, SPECIFY))
  }

  /**
    * In the current MediaConvert implementation, the Dolby Vision profile is always 5 (PROFILE_5). Therefore, all of your inputs must contain Dolby Vision frame interleaved data.
    */
  @js.native
  sealed trait DolbyVisionProfile extends js.Any
  object DolbyVisionProfile extends js.Object {
    val PROFILE_5 = "PROFILE_5".asInstanceOf[DolbyVisionProfile]

    val values = js.Object.freeze(js.Array(PROFILE_5))
  }

  /**
    * Applies only to 29.97 fps outputs. When this feature is enabled, the service will use drop-frame timecode on outputs. If it is not possible to use drop-frame timecode, the system will fall back to non-drop-frame. This setting is enabled by default when Timecode insertion (TimecodeInsertion) is enabled.
    */
  @js.native
  sealed trait DropFrameTimecode extends js.Any
  object DropFrameTimecode extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[DropFrameTimecode]
    val ENABLED  = "ENABLED".asInstanceOf[DropFrameTimecode]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Inserts DVB Network Information Table (NIT) at the specified table repetition interval.
    */
  @js.native
  @Factory
  trait DvbNitSettings extends js.Object {
    var NetworkId: js.UndefOr[__integerMin0Max65535]
    var NetworkName: js.UndefOr[__stringMin1Max256]
    var NitInterval: js.UndefOr[__integerMin25Max10000]
  }

  /**
    * Inserts DVB Service Description Table (NIT) at the specified table repetition interval.
    */
  @js.native
  @Factory
  trait DvbSdtSettings extends js.Object {
    var OutputSdt: js.UndefOr[OutputSdt]
    var SdtInterval: js.UndefOr[__integerMin25Max2000]
    var ServiceName: js.UndefOr[__stringMin1Max256]
    var ServiceProviderName: js.UndefOr[__stringMin1Max256]
  }

  /**
    * DVB-Sub Destination Settings
    */
  @js.native
  @Factory
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

  /**
    * DVB Sub Source Settings
    */
  @js.native
  @Factory
  trait DvbSubSourceSettings extends js.Object {
    var Pid: js.UndefOr[__integerMin1Max2147483647]
  }

  /**
    * If no explicit x_position or y_position is provided, setting alignment to centered will place the captions at the bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified (either left or centered) relative to those coordinates. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  @js.native
  sealed trait DvbSubtitleAlignment extends js.Any
  object DvbSubtitleAlignment extends js.Object {
    val CENTERED = "CENTERED".asInstanceOf[DvbSubtitleAlignment]
    val LEFT     = "LEFT".asInstanceOf[DvbSubtitleAlignment]

    val values = js.Object.freeze(js.Array(CENTERED, LEFT))
  }

  /**
    * Specifies the color of the rectangle behind the captions.
    * All burn-in and DVB-Sub font settings must match.
    */
  @js.native
  sealed trait DvbSubtitleBackgroundColor extends js.Any
  object DvbSubtitleBackgroundColor extends js.Object {
    val NONE  = "NONE".asInstanceOf[DvbSubtitleBackgroundColor]
    val BLACK = "BLACK".asInstanceOf[DvbSubtitleBackgroundColor]
    val WHITE = "WHITE".asInstanceOf[DvbSubtitleBackgroundColor]

    val values = js.Object.freeze(js.Array(NONE, BLACK, WHITE))
  }

  /**
    * Specifies the color of the burned-in captions. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  @js.native
  sealed trait DvbSubtitleFontColor extends js.Any
  object DvbSubtitleFontColor extends js.Object {
    val WHITE  = "WHITE".asInstanceOf[DvbSubtitleFontColor]
    val BLACK  = "BLACK".asInstanceOf[DvbSubtitleFontColor]
    val YELLOW = "YELLOW".asInstanceOf[DvbSubtitleFontColor]
    val RED    = "RED".asInstanceOf[DvbSubtitleFontColor]
    val GREEN  = "GREEN".asInstanceOf[DvbSubtitleFontColor]
    val BLUE   = "BLUE".asInstanceOf[DvbSubtitleFontColor]

    val values = js.Object.freeze(js.Array(WHITE, BLACK, YELLOW, RED, GREEN, BLUE))
  }

  /**
    * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
    */
  @js.native
  sealed trait DvbSubtitleOutlineColor extends js.Any
  object DvbSubtitleOutlineColor extends js.Object {
    val BLACK  = "BLACK".asInstanceOf[DvbSubtitleOutlineColor]
    val WHITE  = "WHITE".asInstanceOf[DvbSubtitleOutlineColor]
    val YELLOW = "YELLOW".asInstanceOf[DvbSubtitleOutlineColor]
    val RED    = "RED".asInstanceOf[DvbSubtitleOutlineColor]
    val GREEN  = "GREEN".asInstanceOf[DvbSubtitleOutlineColor]
    val BLUE   = "BLUE".asInstanceOf[DvbSubtitleOutlineColor]

    val values = js.Object.freeze(js.Array(BLACK, WHITE, YELLOW, RED, GREEN, BLUE))
  }

  /**
    * Specifies the color of the shadow cast by the captions.
    * All burn-in and DVB-Sub font settings must match.
    */
  @js.native
  sealed trait DvbSubtitleShadowColor extends js.Any
  object DvbSubtitleShadowColor extends js.Object {
    val NONE  = "NONE".asInstanceOf[DvbSubtitleShadowColor]
    val BLACK = "BLACK".asInstanceOf[DvbSubtitleShadowColor]
    val WHITE = "WHITE".asInstanceOf[DvbSubtitleShadowColor]

    val values = js.Object.freeze(js.Array(NONE, BLACK, WHITE))
  }

  /**
    * Only applies to jobs with input captions in Teletext or STL formats. Specify whether the spacing between letters in your captions is set by the captions grid or varies depending on letter width. Choose fixed grid to conform to the spacing specified in the captions file more accurately. Choose proportional to make the text easier to read if the captions are closed caption.
    */
  @js.native
  sealed trait DvbSubtitleTeletextSpacing extends js.Any
  object DvbSubtitleTeletextSpacing extends js.Object {
    val FIXED_GRID   = "FIXED_GRID".asInstanceOf[DvbSubtitleTeletextSpacing]
    val PROPORTIONAL = "PROPORTIONAL".asInstanceOf[DvbSubtitleTeletextSpacing]

    val values = js.Object.freeze(js.Array(FIXED_GRID, PROPORTIONAL))
  }

  /**
    * Specify whether your DVB subtitles are standard or for hearing impaired. Choose hearing impaired if your subtitles include audio descriptions and dialogue. Choose standard if your subtitles include only dialogue.
    */
  @js.native
  sealed trait DvbSubtitlingType extends js.Any
  object DvbSubtitlingType extends js.Object {
    val HEARING_IMPAIRED = "HEARING_IMPAIRED".asInstanceOf[DvbSubtitlingType]
    val STANDARD         = "STANDARD".asInstanceOf[DvbSubtitlingType]

    val values = js.Object.freeze(js.Array(HEARING_IMPAIRED, STANDARD))
  }

  /**
    * Inserts DVB Time and Date Table (TDT) at the specified table repetition interval.
    */
  @js.native
  @Factory
  trait DvbTdtSettings extends js.Object {
    var TdtInterval: js.UndefOr[__integerMin1000Max30000]
  }

  /**
    * Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
    */
  @js.native
  sealed trait Eac3AtmosBitstreamMode extends js.Any
  object Eac3AtmosBitstreamMode extends js.Object {
    val COMPLETE_MAIN = "COMPLETE_MAIN".asInstanceOf[Eac3AtmosBitstreamMode]

    val values = js.Object.freeze(js.Array(COMPLETE_MAIN))
  }

  /**
    * The coding mode for Dolby Digital Plus JOC (Atmos) is always 9.1.6 (CODING_MODE_9_1_6).
    */
  @js.native
  sealed trait Eac3AtmosCodingMode extends js.Any
  object Eac3AtmosCodingMode extends js.Object {
    val CODING_MODE_9_1_6 = "CODING_MODE_9_1_6".asInstanceOf[Eac3AtmosCodingMode]

    val values = js.Object.freeze(js.Array(CODING_MODE_9_1_6))
  }

  /**
    * Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue analysis.
    */
  @js.native
  sealed trait Eac3AtmosDialogueIntelligence extends js.Any
  object Eac3AtmosDialogueIntelligence extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[Eac3AtmosDialogueIntelligence]
    val DISABLED = "DISABLED".asInstanceOf[Eac3AtmosDialogueIntelligence]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Specify the absolute peak level for a signal with dynamic range compression.
    */
  @js.native
  sealed trait Eac3AtmosDynamicRangeCompressionLine extends js.Any
  object Eac3AtmosDynamicRangeCompressionLine extends js.Object {
    val NONE           = "NONE".asInstanceOf[Eac3AtmosDynamicRangeCompressionLine]
    val FILM_STANDARD  = "FILM_STANDARD".asInstanceOf[Eac3AtmosDynamicRangeCompressionLine]
    val FILM_LIGHT     = "FILM_LIGHT".asInstanceOf[Eac3AtmosDynamicRangeCompressionLine]
    val MUSIC_STANDARD = "MUSIC_STANDARD".asInstanceOf[Eac3AtmosDynamicRangeCompressionLine]
    val MUSIC_LIGHT    = "MUSIC_LIGHT".asInstanceOf[Eac3AtmosDynamicRangeCompressionLine]
    val SPEECH         = "SPEECH".asInstanceOf[Eac3AtmosDynamicRangeCompressionLine]

    val values = js.Object.freeze(js.Array(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH))
  }

  /**
    * Specify how the service limits the audio dynamic range when compressing the audio.
    */
  @js.native
  sealed trait Eac3AtmosDynamicRangeCompressionRf extends js.Any
  object Eac3AtmosDynamicRangeCompressionRf extends js.Object {
    val NONE           = "NONE".asInstanceOf[Eac3AtmosDynamicRangeCompressionRf]
    val FILM_STANDARD  = "FILM_STANDARD".asInstanceOf[Eac3AtmosDynamicRangeCompressionRf]
    val FILM_LIGHT     = "FILM_LIGHT".asInstanceOf[Eac3AtmosDynamicRangeCompressionRf]
    val MUSIC_STANDARD = "MUSIC_STANDARD".asInstanceOf[Eac3AtmosDynamicRangeCompressionRf]
    val MUSIC_LIGHT    = "MUSIC_LIGHT".asInstanceOf[Eac3AtmosDynamicRangeCompressionRf]
    val SPEECH         = "SPEECH".asInstanceOf[Eac3AtmosDynamicRangeCompressionRf]

    val values = js.Object.freeze(js.Array(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH))
  }

  /**
    * Choose how the service meters the loudness of your audio.
    */
  @js.native
  sealed trait Eac3AtmosMeteringMode extends js.Any
  object Eac3AtmosMeteringMode extends js.Object {
    val LEQ_A         = "LEQ_A".asInstanceOf[Eac3AtmosMeteringMode]
    val ITU_BS_1770_1 = "ITU_BS_1770_1".asInstanceOf[Eac3AtmosMeteringMode]
    val ITU_BS_1770_2 = "ITU_BS_1770_2".asInstanceOf[Eac3AtmosMeteringMode]
    val ITU_BS_1770_3 = "ITU_BS_1770_3".asInstanceOf[Eac3AtmosMeteringMode]
    val ITU_BS_1770_4 = "ITU_BS_1770_4".asInstanceOf[Eac3AtmosMeteringMode]

    val values = js.Object.freeze(js.Array(LEQ_A, ITU_BS_1770_1, ITU_BS_1770_2, ITU_BS_1770_3, ITU_BS_1770_4))
  }

  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value EAC3_ATMOS.
    */
  @js.native
  @Factory
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

  /**
    * Choose how the service does stereo downmixing.
    */
  @js.native
  sealed trait Eac3AtmosStereoDownmix extends js.Any
  object Eac3AtmosStereoDownmix extends js.Object {
    val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3AtmosStereoDownmix]
    val STEREO        = "STEREO".asInstanceOf[Eac3AtmosStereoDownmix]
    val SURROUND      = "SURROUND".asInstanceOf[Eac3AtmosStereoDownmix]
    val DPL2          = "DPL2".asInstanceOf[Eac3AtmosStereoDownmix]

    val values = js.Object.freeze(js.Array(NOT_INDICATED, STEREO, SURROUND, DPL2))
  }

  /**
    * Specify whether your input audio has an additional center rear surround channel matrix encoded into your left and right surround channels.
    */
  @js.native
  sealed trait Eac3AtmosSurroundExMode extends js.Any
  object Eac3AtmosSurroundExMode extends js.Object {
    val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3AtmosSurroundExMode]
    val ENABLED       = "ENABLED".asInstanceOf[Eac3AtmosSurroundExMode]
    val DISABLED      = "DISABLED".asInstanceOf[Eac3AtmosSurroundExMode]

    val values = js.Object.freeze(js.Array(NOT_INDICATED, ENABLED, DISABLED))
  }

  /**
    * If set to ATTENUATE_3_DB, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode.
    */
  @js.native
  sealed trait Eac3AttenuationControl extends js.Any
  object Eac3AttenuationControl extends js.Object {
    val ATTENUATE_3_DB = "ATTENUATE_3_DB".asInstanceOf[Eac3AttenuationControl]
    val NONE           = "NONE".asInstanceOf[Eac3AttenuationControl]

    val values = js.Object.freeze(js.Array(ATTENUATE_3_DB, NONE))
  }

  /**
    * Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
    */
  @js.native
  sealed trait Eac3BitstreamMode extends js.Any
  object Eac3BitstreamMode extends js.Object {
    val COMPLETE_MAIN     = "COMPLETE_MAIN".asInstanceOf[Eac3BitstreamMode]
    val COMMENTARY        = "COMMENTARY".asInstanceOf[Eac3BitstreamMode]
    val EMERGENCY         = "EMERGENCY".asInstanceOf[Eac3BitstreamMode]
    val HEARING_IMPAIRED  = "HEARING_IMPAIRED".asInstanceOf[Eac3BitstreamMode]
    val VISUALLY_IMPAIRED = "VISUALLY_IMPAIRED".asInstanceOf[Eac3BitstreamMode]

    val values = js.Object.freeze(js.Array(COMPLETE_MAIN, COMMENTARY, EMERGENCY, HEARING_IMPAIRED, VISUALLY_IMPAIRED))
  }

  /**
    * Dolby Digital Plus coding mode. Determines number of channels.
    */
  @js.native
  sealed trait Eac3CodingMode extends js.Any
  object Eac3CodingMode extends js.Object {
    val CODING_MODE_1_0 = "CODING_MODE_1_0".asInstanceOf[Eac3CodingMode]
    val CODING_MODE_2_0 = "CODING_MODE_2_0".asInstanceOf[Eac3CodingMode]
    val CODING_MODE_3_2 = "CODING_MODE_3_2".asInstanceOf[Eac3CodingMode]

    val values = js.Object.freeze(js.Array(CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_3_2))
  }

  /**
    * Activates a DC highpass filter for all input channels.
    */
  @js.native
  sealed trait Eac3DcFilter extends js.Any
  object Eac3DcFilter extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[Eac3DcFilter]
    val DISABLED = "DISABLED".asInstanceOf[Eac3DcFilter]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Specify the absolute peak level for a signal with dynamic range compression.
    */
  @js.native
  sealed trait Eac3DynamicRangeCompressionLine extends js.Any
  object Eac3DynamicRangeCompressionLine extends js.Object {
    val NONE           = "NONE".asInstanceOf[Eac3DynamicRangeCompressionLine]
    val FILM_STANDARD  = "FILM_STANDARD".asInstanceOf[Eac3DynamicRangeCompressionLine]
    val FILM_LIGHT     = "FILM_LIGHT".asInstanceOf[Eac3DynamicRangeCompressionLine]
    val MUSIC_STANDARD = "MUSIC_STANDARD".asInstanceOf[Eac3DynamicRangeCompressionLine]
    val MUSIC_LIGHT    = "MUSIC_LIGHT".asInstanceOf[Eac3DynamicRangeCompressionLine]
    val SPEECH         = "SPEECH".asInstanceOf[Eac3DynamicRangeCompressionLine]

    val values = js.Object.freeze(js.Array(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH))
  }

  /**
    * Specify how the service limits the audio dynamic range when compressing the audio.
    */
  @js.native
  sealed trait Eac3DynamicRangeCompressionRf extends js.Any
  object Eac3DynamicRangeCompressionRf extends js.Object {
    val NONE           = "NONE".asInstanceOf[Eac3DynamicRangeCompressionRf]
    val FILM_STANDARD  = "FILM_STANDARD".asInstanceOf[Eac3DynamicRangeCompressionRf]
    val FILM_LIGHT     = "FILM_LIGHT".asInstanceOf[Eac3DynamicRangeCompressionRf]
    val MUSIC_STANDARD = "MUSIC_STANDARD".asInstanceOf[Eac3DynamicRangeCompressionRf]
    val MUSIC_LIGHT    = "MUSIC_LIGHT".asInstanceOf[Eac3DynamicRangeCompressionRf]
    val SPEECH         = "SPEECH".asInstanceOf[Eac3DynamicRangeCompressionRf]

    val values = js.Object.freeze(js.Array(NONE, FILM_STANDARD, FILM_LIGHT, MUSIC_STANDARD, MUSIC_LIGHT, SPEECH))
  }

  /**
    * When encoding 3/2 audio, controls whether the LFE channel is enabled
    */
  @js.native
  sealed trait Eac3LfeControl extends js.Any
  object Eac3LfeControl extends js.Object {
    val LFE    = "LFE".asInstanceOf[Eac3LfeControl]
    val NO_LFE = "NO_LFE".asInstanceOf[Eac3LfeControl]

    val values = js.Object.freeze(js.Array(LFE, NO_LFE))
  }

  /**
    * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
    */
  @js.native
  sealed trait Eac3LfeFilter extends js.Any
  object Eac3LfeFilter extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[Eac3LfeFilter]
    val DISABLED = "DISABLED".asInstanceOf[Eac3LfeFilter]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
    */
  @js.native
  sealed trait Eac3MetadataControl extends js.Any
  object Eac3MetadataControl extends js.Object {
    val FOLLOW_INPUT   = "FOLLOW_INPUT".asInstanceOf[Eac3MetadataControl]
    val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[Eac3MetadataControl]

    val values = js.Object.freeze(js.Array(FOLLOW_INPUT, USE_CONFIGURED))
  }

  /**
    * When set to WHEN_POSSIBLE, input DD+ audio will be passed through if it is present on the input. this detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a consistent DD+ output as the system alternates between passthrough and encoding.
    */
  @js.native
  sealed trait Eac3PassthroughControl extends js.Any
  object Eac3PassthroughControl extends js.Object {
    val WHEN_POSSIBLE  = "WHEN_POSSIBLE".asInstanceOf[Eac3PassthroughControl]
    val NO_PASSTHROUGH = "NO_PASSTHROUGH".asInstanceOf[Eac3PassthroughControl]

    val values = js.Object.freeze(js.Array(WHEN_POSSIBLE, NO_PASSTHROUGH))
  }

  /**
    * Controls the amount of phase-shift applied to the surround channels. Only used for 3/2 coding mode.
    */
  @js.native
  sealed trait Eac3PhaseControl extends js.Any
  object Eac3PhaseControl extends js.Object {
    val SHIFT_90_DEGREES = "SHIFT_90_DEGREES".asInstanceOf[Eac3PhaseControl]
    val NO_SHIFT         = "NO_SHIFT".asInstanceOf[Eac3PhaseControl]

    val values = js.Object.freeze(js.Array(SHIFT_90_DEGREES, NO_SHIFT))
  }

  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value EAC3.
    */
  @js.native
  @Factory
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

  /**
    * Choose how the service does stereo downmixing. This setting only applies if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Stereo downmix (Eac3StereoDownmix).
    */
  @js.native
  sealed trait Eac3StereoDownmix extends js.Any
  object Eac3StereoDownmix extends js.Object {
    val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3StereoDownmix]
    val LO_RO         = "LO_RO".asInstanceOf[Eac3StereoDownmix]
    val LT_RT         = "LT_RT".asInstanceOf[Eac3StereoDownmix]
    val DPL2          = "DPL2".asInstanceOf[Eac3StereoDownmix]

    val values = js.Object.freeze(js.Array(NOT_INDICATED, LO_RO, LT_RT, DPL2))
  }

  /**
    * When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the left and right surround channels.
    */
  @js.native
  sealed trait Eac3SurroundExMode extends js.Any
  object Eac3SurroundExMode extends js.Object {
    val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3SurroundExMode]
    val ENABLED       = "ENABLED".asInstanceOf[Eac3SurroundExMode]
    val DISABLED      = "DISABLED".asInstanceOf[Eac3SurroundExMode]

    val values = js.Object.freeze(js.Array(NOT_INDICATED, ENABLED, DISABLED))
  }

  /**
    * When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels.
    */
  @js.native
  sealed trait Eac3SurroundMode extends js.Any
  object Eac3SurroundMode extends js.Object {
    val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3SurroundMode]
    val ENABLED       = "ENABLED".asInstanceOf[Eac3SurroundMode]
    val DISABLED      = "DISABLED".asInstanceOf[Eac3SurroundMode]

    val values = js.Object.freeze(js.Array(NOT_INDICATED, ENABLED, DISABLED))
  }

  /**
    * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
    */
  @js.native
  sealed trait EmbeddedConvert608To708 extends js.Any
  object EmbeddedConvert608To708 extends js.Object {
    val UPCONVERT = "UPCONVERT".asInstanceOf[EmbeddedConvert608To708]
    val DISABLED  = "DISABLED".asInstanceOf[EmbeddedConvert608To708]

    val values = js.Object.freeze(js.Array(UPCONVERT, DISABLED))
  }

  /**
    * Settings specific to embedded/ancillary caption outputs, including 608/708 Channel destination number.
    */
  @js.native
  @Factory
  trait EmbeddedDestinationSettings extends js.Object {
    var Destination608ChannelNumber: js.UndefOr[__integerMin1Max4]
    var Destination708ServiceNumber: js.UndefOr[__integerMin1Max6]
  }

  /**
    * Settings for embedded captions Source
    */
  @js.native
  @Factory
  trait EmbeddedSourceSettings extends js.Object {
    var Convert608To708: js.UndefOr[EmbeddedConvert608To708]
    var Source608ChannelNumber: js.UndefOr[__integerMin1Max4]
    var Source608TrackNumber: js.UndefOr[__integerMin1Max1]
    var TerminateCaptions: js.UndefOr[EmbeddedTerminateCaptions]
  }

  /**
    * By default, the service terminates any unterminated captions at the end of each input. If you want the caption to continue onto your next input, disable this setting.
    */
  @js.native
  sealed trait EmbeddedTerminateCaptions extends js.Any
  object EmbeddedTerminateCaptions extends js.Object {
    val END_OF_INPUT = "END_OF_INPUT".asInstanceOf[EmbeddedTerminateCaptions]
    val DISABLED     = "DISABLED".asInstanceOf[EmbeddedTerminateCaptions]

    val values = js.Object.freeze(js.Array(END_OF_INPUT, DISABLED))
  }

  /**
    * Describes an account-specific API endpoint.
    */
  @js.native
  @Factory
  trait Endpoint extends js.Object {
    var Url: js.UndefOr[__string]
  }

  /**
    * ESAM ManifestConfirmConditionNotification defined by OC-SP-ESAM-API-I03-131025.
    */
  @js.native
  @Factory
  trait EsamManifestConfirmConditionNotification extends js.Object {
    var MccXml: js.UndefOr[__stringPatternSNManifestConfirmConditionNotificationNS]
  }

  /**
    * Settings for Event Signaling And Messaging (ESAM). If you don't do ad insertion, you can ignore these settings.
    */
  @js.native
  @Factory
  trait EsamSettings extends js.Object {
    var ManifestConfirmConditionNotification: js.UndefOr[EsamManifestConfirmConditionNotification]
    var ResponseSignalPreroll: js.UndefOr[__integerMin0Max30000]
    var SignalProcessingNotification: js.UndefOr[EsamSignalProcessingNotification]
  }

  /**
    * ESAM SignalProcessingNotification data defined by OC-SP-ESAM-API-I03-131025.
    */
  @js.native
  @Factory
  trait EsamSignalProcessingNotification extends js.Object {
    var SccXml: js.UndefOr[__stringPatternSNSignalProcessingNotificationNS]
  }

  /**
    * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
    */
  @js.native
  sealed trait F4vMoovPlacement extends js.Any
  object F4vMoovPlacement extends js.Object {
    val PROGRESSIVE_DOWNLOAD = "PROGRESSIVE_DOWNLOAD".asInstanceOf[F4vMoovPlacement]
    val NORMAL               = "NORMAL".asInstanceOf[F4vMoovPlacement]

    val values = js.Object.freeze(js.Array(PROGRESSIVE_DOWNLOAD, NORMAL))
  }

  /**
    * Settings for F4v container
    */
  @js.native
  @Factory
  trait F4vSettings extends js.Object {
    var MoovPlacement: js.UndefOr[F4vMoovPlacement]
  }

  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to FILE_GROUP_SETTINGS.
    */
  @js.native
  @Factory
  trait FileGroupSettings extends js.Object {
    var Destination: js.UndefOr[__stringPatternS3]
    var DestinationSettings: js.UndefOr[DestinationSettings]
  }

  /**
    * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
    */
  @js.native
  sealed trait FileSourceConvert608To708 extends js.Any
  object FileSourceConvert608To708 extends js.Object {
    val UPCONVERT = "UPCONVERT".asInstanceOf[FileSourceConvert608To708]
    val DISABLED  = "DISABLED".asInstanceOf[FileSourceConvert608To708]

    val values = js.Object.freeze(js.Array(UPCONVERT, DISABLED))
  }

  /**
    * If your input captions are SCC, SMI, SRT, STL, TTML, or IMSC 1.1 in an xml file, specify the URI of the input caption source file. If your caption source is IMSC in an IMF package, use TrackSourceSettings instead of FileSoureSettings.
    */
  @js.native
  @Factory
  trait FileSourceSettings extends js.Object {
    var Convert608To708: js.UndefOr[FileSourceConvert608To708]
    var SourceFile: js.UndefOr[
      __stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIHttpsSccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMI
    ]
    var TimeDelta: js.UndefOr[__integerMinNegative2147483648Max2147483647]
  }

  /**
    * Provide the font script, using an ISO 15924 script code, if the LanguageCode is not sufficient for determining the script type. Where LanguageCode or CustomLanguageCode is sufficient, use "AUTOMATIC" or leave unset.
    */
  @js.native
  sealed trait FontScript extends js.Any
  object FontScript extends js.Object {
    val AUTOMATIC = "AUTOMATIC".asInstanceOf[FontScript]
    val HANS      = "HANS".asInstanceOf[FontScript]
    val HANT      = "HANT".asInstanceOf[FontScript]

    val values = js.Object.freeze(js.Array(AUTOMATIC, HANS, HANT))
  }

  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value FRAME_CAPTURE.
    */
  @js.native
  @Factory
  trait FrameCaptureSettings extends js.Object {
    var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647]
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647]
    var MaxCaptures: js.UndefOr[__integerMin1Max10000000]
    var Quality: js.UndefOr[__integerMin1Max100]
  }

  @js.native
  @Factory
  trait GetJobRequest extends js.Object {
    var Id: __string
  }

  @js.native
  @Factory
  trait GetJobResponse extends js.Object {
    var Job: js.UndefOr[Job]
  }

  @js.native
  @Factory
  trait GetJobTemplateRequest extends js.Object {
    var Name: __string
  }

  @js.native
  @Factory
  trait GetJobTemplateResponse extends js.Object {
    var JobTemplate: js.UndefOr[JobTemplate]
  }

  @js.native
  @Factory
  trait GetPresetRequest extends js.Object {
    var Name: __string
  }

  @js.native
  @Factory
  trait GetPresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset]
  }

  @js.native
  @Factory
  trait GetQueueRequest extends js.Object {
    var Name: __string
  }

  @js.native
  @Factory
  trait GetQueueResponse extends js.Object {
    var Queue: js.UndefOr[Queue]
  }

  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  @js.native
  sealed trait H264AdaptiveQuantization extends js.Any
  object H264AdaptiveQuantization extends js.Object {
    val OFF    = "OFF".asInstanceOf[H264AdaptiveQuantization]
    val LOW    = "LOW".asInstanceOf[H264AdaptiveQuantization]
    val MEDIUM = "MEDIUM".asInstanceOf[H264AdaptiveQuantization]
    val HIGH   = "HIGH".asInstanceOf[H264AdaptiveQuantization]
    val HIGHER = "HIGHER".asInstanceOf[H264AdaptiveQuantization]
    val MAX    = "MAX".asInstanceOf[H264AdaptiveQuantization]

    val values = js.Object.freeze(js.Array(OFF, LOW, MEDIUM, HIGH, HIGHER, MAX))
  }

  /**
    * Specify an H.264 level that is consistent with your output video settings. If you aren't sure what level to specify, choose Auto (AUTO).
    */
  @js.native
  sealed trait H264CodecLevel extends js.Any
  object H264CodecLevel extends js.Object {
    val AUTO      = "AUTO".asInstanceOf[H264CodecLevel]
    val LEVEL_1   = "LEVEL_1".asInstanceOf[H264CodecLevel]
    val LEVEL_1_1 = "LEVEL_1_1".asInstanceOf[H264CodecLevel]
    val LEVEL_1_2 = "LEVEL_1_2".asInstanceOf[H264CodecLevel]
    val LEVEL_1_3 = "LEVEL_1_3".asInstanceOf[H264CodecLevel]
    val LEVEL_2   = "LEVEL_2".asInstanceOf[H264CodecLevel]
    val LEVEL_2_1 = "LEVEL_2_1".asInstanceOf[H264CodecLevel]
    val LEVEL_2_2 = "LEVEL_2_2".asInstanceOf[H264CodecLevel]
    val LEVEL_3   = "LEVEL_3".asInstanceOf[H264CodecLevel]
    val LEVEL_3_1 = "LEVEL_3_1".asInstanceOf[H264CodecLevel]
    val LEVEL_3_2 = "LEVEL_3_2".asInstanceOf[H264CodecLevel]
    val LEVEL_4   = "LEVEL_4".asInstanceOf[H264CodecLevel]
    val LEVEL_4_1 = "LEVEL_4_1".asInstanceOf[H264CodecLevel]
    val LEVEL_4_2 = "LEVEL_4_2".asInstanceOf[H264CodecLevel]
    val LEVEL_5   = "LEVEL_5".asInstanceOf[H264CodecLevel]
    val LEVEL_5_1 = "LEVEL_5_1".asInstanceOf[H264CodecLevel]
    val LEVEL_5_2 = "LEVEL_5_2".asInstanceOf[H264CodecLevel]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  /**
    * H.264 Profile. High 4:2:2 and 10-bit profiles are only available with the AVC-I License.
    */
  @js.native
  sealed trait H264CodecProfile extends js.Any
  object H264CodecProfile extends js.Object {
    val BASELINE       = "BASELINE".asInstanceOf[H264CodecProfile]
    val HIGH           = "HIGH".asInstanceOf[H264CodecProfile]
    val HIGH_10BIT     = "HIGH_10BIT".asInstanceOf[H264CodecProfile]
    val HIGH_422       = "HIGH_422".asInstanceOf[H264CodecProfile]
    val HIGH_422_10BIT = "HIGH_422_10BIT".asInstanceOf[H264CodecProfile]
    val MAIN           = "MAIN".asInstanceOf[H264CodecProfile]

    val values = js.Object.freeze(js.Array(BASELINE, HIGH, HIGH_10BIT, HIGH_422, HIGH_422_10BIT, MAIN))
  }

  /**
    * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
    */
  @js.native
  sealed trait H264DynamicSubGop extends js.Any
  object H264DynamicSubGop extends js.Object {
    val ADAPTIVE = "ADAPTIVE".asInstanceOf[H264DynamicSubGop]
    val STATIC   = "STATIC".asInstanceOf[H264DynamicSubGop]

    val values = js.Object.freeze(js.Array(ADAPTIVE, STATIC))
  }

  /**
    * Entropy encoding mode. Use CABAC (must be in Main or High profile) or CAVLC.
    */
  @js.native
  sealed trait H264EntropyEncoding extends js.Any
  object H264EntropyEncoding extends js.Object {
    val CABAC = "CABAC".asInstanceOf[H264EntropyEncoding]
    val CAVLC = "CAVLC".asInstanceOf[H264EntropyEncoding]

    val values = js.Object.freeze(js.Array(CABAC, CAVLC))
  }

  /**
    * Choosing FORCE_FIELD disables PAFF encoding for interlaced outputs.
    */
  @js.native
  sealed trait H264FieldEncoding extends js.Any
  object H264FieldEncoding extends js.Object {
    val PAFF        = "PAFF".asInstanceOf[H264FieldEncoding]
    val FORCE_FIELD = "FORCE_FIELD".asInstanceOf[H264FieldEncoding]

    val values = js.Object.freeze(js.Array(PAFF, FORCE_FIELD))
  }

  /**
    * Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
    */
  @js.native
  sealed trait H264FlickerAdaptiveQuantization extends js.Any
  object H264FlickerAdaptiveQuantization extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H264FlickerAdaptiveQuantization]
    val ENABLED  = "ENABLED".asInstanceOf[H264FlickerAdaptiveQuantization]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  @js.native
  sealed trait H264FramerateControl extends js.Any
  object H264FramerateControl extends js.Object {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[H264FramerateControl]
    val SPECIFIED              = "SPECIFIED".asInstanceOf[H264FramerateControl]

    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
    */
  @js.native
  sealed trait H264FramerateConversionAlgorithm extends js.Any
  object H264FramerateConversionAlgorithm extends js.Object {
    val DUPLICATE_DROP = "DUPLICATE_DROP".asInstanceOf[H264FramerateConversionAlgorithm]
    val INTERPOLATE    = "INTERPOLATE".asInstanceOf[H264FramerateConversionAlgorithm]

    val values = js.Object.freeze(js.Array(DUPLICATE_DROP, INTERPOLATE))
  }

  /**
    * If enable, use reference B frames for GOP structures that have B frames > 1.
    */
  @js.native
  sealed trait H264GopBReference extends js.Any
  object H264GopBReference extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H264GopBReference]
    val ENABLED  = "ENABLED".asInstanceOf[H264GopBReference]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Indicates if the GOP Size in H264 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
    */
  @js.native
  sealed trait H264GopSizeUnits extends js.Any
  object H264GopSizeUnits extends js.Object {
    val FRAMES  = "FRAMES".asInstanceOf[H264GopSizeUnits]
    val SECONDS = "SECONDS".asInstanceOf[H264GopSizeUnits]

    val values = js.Object.freeze(js.Array(FRAMES, SECONDS))
  }

  /**
    * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type, as follows.
    *   - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
    *   - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
    */
  @js.native
  sealed trait H264InterlaceMode extends js.Any
  object H264InterlaceMode extends js.Object {
    val PROGRESSIVE         = "PROGRESSIVE".asInstanceOf[H264InterlaceMode]
    val TOP_FIELD           = "TOP_FIELD".asInstanceOf[H264InterlaceMode]
    val BOTTOM_FIELD        = "BOTTOM_FIELD".asInstanceOf[H264InterlaceMode]
    val FOLLOW_TOP_FIELD    = "FOLLOW_TOP_FIELD".asInstanceOf[H264InterlaceMode]
    val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD".asInstanceOf[H264InterlaceMode]

    val values = js.Object.freeze(js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD))
  }

  /**
    * Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the input. Using the console, do this by choosing Follow source for Pixel aspect ratio.
    */
  @js.native
  sealed trait H264ParControl extends js.Any
  object H264ParControl extends js.Object {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[H264ParControl]
    val SPECIFIED              = "SPECIFIED".asInstanceOf[H264ParControl]

    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * Use Quality tuning level (H264QualityTuningLevel) to specifiy whether to use fast single-pass, high-quality singlepass, or high-quality multipass video encoding.
    */
  @js.native
  sealed trait H264QualityTuningLevel extends js.Any
  object H264QualityTuningLevel extends js.Object {
    val SINGLE_PASS    = "SINGLE_PASS".asInstanceOf[H264QualityTuningLevel]
    val SINGLE_PASS_HQ = "SINGLE_PASS_HQ".asInstanceOf[H264QualityTuningLevel]
    val MULTI_PASS_HQ  = "MULTI_PASS_HQ".asInstanceOf[H264QualityTuningLevel]

    val values = js.Object.freeze(js.Array(SINGLE_PASS, SINGLE_PASS_HQ, MULTI_PASS_HQ))
  }

  /**
    * Settings for quality-defined variable bitrate encoding with the H.264 codec. Required when you set Rate control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control mode.
    */
  @js.native
  @Factory
  trait H264QvbrSettings extends js.Object {
    var MaxAverageBitrate: js.UndefOr[__integerMin1000Max1152000000]
    var QvbrQualityLevel: js.UndefOr[__integerMin1Max10]
    var QvbrQualityLevelFineTune: js.UndefOr[__doubleMin0Max1]
  }

  /**
    * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
    */
  @js.native
  sealed trait H264RateControlMode extends js.Any
  object H264RateControlMode extends js.Object {
    val VBR  = "VBR".asInstanceOf[H264RateControlMode]
    val CBR  = "CBR".asInstanceOf[H264RateControlMode]
    val QVBR = "QVBR".asInstanceOf[H264RateControlMode]

    val values = js.Object.freeze(js.Array(VBR, CBR, QVBR))
  }

  /**
    * Places a PPS header on each encoded picture, even if repeated.
    */
  @js.native
  sealed trait H264RepeatPps extends js.Any
  object H264RepeatPps extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H264RepeatPps]
    val ENABLED  = "ENABLED".asInstanceOf[H264RepeatPps]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default. If this output uses QVBR, choose Transition detection (TRANSITION_DETECTION) for further video quality improvement. For more information about QVBR, see https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
    */
  @js.native
  sealed trait H264SceneChangeDetect extends js.Any
  object H264SceneChangeDetect extends js.Object {
    val DISABLED             = "DISABLED".asInstanceOf[H264SceneChangeDetect]
    val ENABLED              = "ENABLED".asInstanceOf[H264SceneChangeDetect]
    val TRANSITION_DETECTION = "TRANSITION_DETECTION".asInstanceOf[H264SceneChangeDetect]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED, TRANSITION_DETECTION))
  }

  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value H_264.
    */
  @js.native
  @Factory
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

  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  @js.native
  sealed trait H264SlowPal extends js.Any
  object H264SlowPal extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H264SlowPal]
    val ENABLED  = "ENABLED".asInstanceOf[H264SlowPal]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Adjust quantization within each frame based on spatial variation of content complexity.
    */
  @js.native
  sealed trait H264SpatialAdaptiveQuantization extends js.Any
  object H264SpatialAdaptiveQuantization extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H264SpatialAdaptiveQuantization]
    val ENABLED  = "ENABLED".asInstanceOf[H264SpatialAdaptiveQuantization]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Produces a bitstream compliant with SMPTE RP-2027.
    */
  @js.native
  sealed trait H264Syntax extends js.Any
  object H264Syntax extends js.Object {
    val DEFAULT = "DEFAULT".asInstanceOf[H264Syntax]
    val RP2027  = "RP2027".asInstanceOf[H264Syntax]

    val values = js.Object.freeze(js.Array(DEFAULT, RP2027))
  }

  /**
    * This field applies only if the Streams > Advanced > Framerate (framerate) field  is set to 29.970. This field works with the Streams > Advanced > Preprocessors > Deinterlacer  field (deinterlace_mode) and the Streams > Advanced > Interlaced Mode field (interlace_mode)  to identify the scan type for the output: Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces 23.976; the player converts this output to 29.97i.
    */
  @js.native
  sealed trait H264Telecine extends js.Any
  object H264Telecine extends js.Object {
    val NONE = "NONE".asInstanceOf[H264Telecine]
    val SOFT = "SOFT".asInstanceOf[H264Telecine]
    val HARD = "HARD".asInstanceOf[H264Telecine]

    val values = js.Object.freeze(js.Array(NONE, SOFT, HARD))
  }

  /**
    * Adjust quantization within each frame based on temporal variation of content complexity.
    */
  @js.native
  sealed trait H264TemporalAdaptiveQuantization extends js.Any
  object H264TemporalAdaptiveQuantization extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H264TemporalAdaptiveQuantization]
    val ENABLED  = "ENABLED".asInstanceOf[H264TemporalAdaptiveQuantization]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
    */
  @js.native
  sealed trait H264UnregisteredSeiTimecode extends js.Any
  object H264UnregisteredSeiTimecode extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H264UnregisteredSeiTimecode]
    val ENABLED  = "ENABLED".asInstanceOf[H264UnregisteredSeiTimecode]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  @js.native
  sealed trait H265AdaptiveQuantization extends js.Any
  object H265AdaptiveQuantization extends js.Object {
    val OFF    = "OFF".asInstanceOf[H265AdaptiveQuantization]
    val LOW    = "LOW".asInstanceOf[H265AdaptiveQuantization]
    val MEDIUM = "MEDIUM".asInstanceOf[H265AdaptiveQuantization]
    val HIGH   = "HIGH".asInstanceOf[H265AdaptiveQuantization]
    val HIGHER = "HIGHER".asInstanceOf[H265AdaptiveQuantization]
    val MAX    = "MAX".asInstanceOf[H265AdaptiveQuantization]

    val values = js.Object.freeze(js.Array(OFF, LOW, MEDIUM, HIGH, HIGHER, MAX))
  }

  /**
    * Enables Alternate Transfer Function SEI message for outputs using Hybrid Log Gamma (HLG) Electro-Optical Transfer Function (EOTF).
    */
  @js.native
  sealed trait H265AlternateTransferFunctionSei extends js.Any
  object H265AlternateTransferFunctionSei extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H265AlternateTransferFunctionSei]
    val ENABLED  = "ENABLED".asInstanceOf[H265AlternateTransferFunctionSei]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * H.265 Level.
    */
  @js.native
  sealed trait H265CodecLevel extends js.Any
  object H265CodecLevel extends js.Object {
    val AUTO      = "AUTO".asInstanceOf[H265CodecLevel]
    val LEVEL_1   = "LEVEL_1".asInstanceOf[H265CodecLevel]
    val LEVEL_2   = "LEVEL_2".asInstanceOf[H265CodecLevel]
    val LEVEL_2_1 = "LEVEL_2_1".asInstanceOf[H265CodecLevel]
    val LEVEL_3   = "LEVEL_3".asInstanceOf[H265CodecLevel]
    val LEVEL_3_1 = "LEVEL_3_1".asInstanceOf[H265CodecLevel]
    val LEVEL_4   = "LEVEL_4".asInstanceOf[H265CodecLevel]
    val LEVEL_4_1 = "LEVEL_4_1".asInstanceOf[H265CodecLevel]
    val LEVEL_5   = "LEVEL_5".asInstanceOf[H265CodecLevel]
    val LEVEL_5_1 = "LEVEL_5_1".asInstanceOf[H265CodecLevel]
    val LEVEL_5_2 = "LEVEL_5_2".asInstanceOf[H265CodecLevel]
    val LEVEL_6   = "LEVEL_6".asInstanceOf[H265CodecLevel]
    val LEVEL_6_1 = "LEVEL_6_1".asInstanceOf[H265CodecLevel]
    val LEVEL_6_2 = "LEVEL_6_2".asInstanceOf[H265CodecLevel]

    val values = js.Object.freeze(
      js.Array(
        AUTO,
        LEVEL_1,
        LEVEL_2,
        LEVEL_2_1,
        LEVEL_3,
        LEVEL_3_1,
        LEVEL_4,
        LEVEL_4_1,
        LEVEL_5,
        LEVEL_5_1,
        LEVEL_5_2,
        LEVEL_6,
        LEVEL_6_1,
        LEVEL_6_2
      )
    )
  }

  /**
    * Represents the Profile and Tier, per the HEVC (H.265) specification. Selections are grouped as [Profile] / [Tier], so "Main/High" represents Main Profile with High Tier. 4:2:2 profiles are only available with the HEVC 4:2:2 License.
    */
  @js.native
  sealed trait H265CodecProfile extends js.Any
  object H265CodecProfile extends js.Object {
    val MAIN_MAIN           = "MAIN_MAIN".asInstanceOf[H265CodecProfile]
    val MAIN_HIGH           = "MAIN_HIGH".asInstanceOf[H265CodecProfile]
    val MAIN10_MAIN         = "MAIN10_MAIN".asInstanceOf[H265CodecProfile]
    val MAIN10_HIGH         = "MAIN10_HIGH".asInstanceOf[H265CodecProfile]
    val MAIN_422_8BIT_MAIN  = "MAIN_422_8BIT_MAIN".asInstanceOf[H265CodecProfile]
    val MAIN_422_8BIT_HIGH  = "MAIN_422_8BIT_HIGH".asInstanceOf[H265CodecProfile]
    val MAIN_422_10BIT_MAIN = "MAIN_422_10BIT_MAIN".asInstanceOf[H265CodecProfile]
    val MAIN_422_10BIT_HIGH = "MAIN_422_10BIT_HIGH".asInstanceOf[H265CodecProfile]

    val values = js.Object.freeze(
      js.Array(
        MAIN_MAIN,
        MAIN_HIGH,
        MAIN10_MAIN,
        MAIN10_HIGH,
        MAIN_422_8BIT_MAIN,
        MAIN_422_8BIT_HIGH,
        MAIN_422_10BIT_MAIN,
        MAIN_422_10BIT_HIGH
      )
    )
  }

  /**
    * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
    */
  @js.native
  sealed trait H265DynamicSubGop extends js.Any
  object H265DynamicSubGop extends js.Object {
    val ADAPTIVE = "ADAPTIVE".asInstanceOf[H265DynamicSubGop]
    val STATIC   = "STATIC".asInstanceOf[H265DynamicSubGop]

    val values = js.Object.freeze(js.Array(ADAPTIVE, STATIC))
  }

  /**
    * Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
    */
  @js.native
  sealed trait H265FlickerAdaptiveQuantization extends js.Any
  object H265FlickerAdaptiveQuantization extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H265FlickerAdaptiveQuantization]
    val ENABLED  = "ENABLED".asInstanceOf[H265FlickerAdaptiveQuantization]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job sepecification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  @js.native
  sealed trait H265FramerateControl extends js.Any
  object H265FramerateControl extends js.Object {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[H265FramerateControl]
    val SPECIFIED              = "SPECIFIED".asInstanceOf[H265FramerateControl]

    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
    */
  @js.native
  sealed trait H265FramerateConversionAlgorithm extends js.Any
  object H265FramerateConversionAlgorithm extends js.Object {
    val DUPLICATE_DROP = "DUPLICATE_DROP".asInstanceOf[H265FramerateConversionAlgorithm]
    val INTERPOLATE    = "INTERPOLATE".asInstanceOf[H265FramerateConversionAlgorithm]

    val values = js.Object.freeze(js.Array(DUPLICATE_DROP, INTERPOLATE))
  }

  /**
    * If enable, use reference B frames for GOP structures that have B frames > 1.
    */
  @js.native
  sealed trait H265GopBReference extends js.Any
  object H265GopBReference extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H265GopBReference]
    val ENABLED  = "ENABLED".asInstanceOf[H265GopBReference]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Indicates if the GOP Size in H265 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
    */
  @js.native
  sealed trait H265GopSizeUnits extends js.Any
  object H265GopSizeUnits extends js.Object {
    val FRAMES  = "FRAMES".asInstanceOf[H265GopSizeUnits]
    val SECONDS = "SECONDS".asInstanceOf[H265GopSizeUnits]

    val values = js.Object.freeze(js.Array(FRAMES, SECONDS))
  }

  /**
    * Choose the scan line type for the output. Choose Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Choose Top Field First (TOP_FIELD) or Bottom Field First (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Choose Follow, Default Top (FOLLOW_TOP_FIELD) or Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) to create an interlaced output with the same field polarity as the source. If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first". If the source is progressive, your output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose. If you don't choose a value, the service will default to Progressive (PROGRESSIVE).
    */
  @js.native
  sealed trait H265InterlaceMode extends js.Any
  object H265InterlaceMode extends js.Object {
    val PROGRESSIVE         = "PROGRESSIVE".asInstanceOf[H265InterlaceMode]
    val TOP_FIELD           = "TOP_FIELD".asInstanceOf[H265InterlaceMode]
    val BOTTOM_FIELD        = "BOTTOM_FIELD".asInstanceOf[H265InterlaceMode]
    val FOLLOW_TOP_FIELD    = "FOLLOW_TOP_FIELD".asInstanceOf[H265InterlaceMode]
    val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD".asInstanceOf[H265InterlaceMode]

    val values = js.Object.freeze(js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD))
  }

  /**
    * Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the input. Using the console, do this by choosing Follow source for Pixel aspect ratio.
    */
  @js.native
  sealed trait H265ParControl extends js.Any
  object H265ParControl extends js.Object {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[H265ParControl]
    val SPECIFIED              = "SPECIFIED".asInstanceOf[H265ParControl]

    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * Use Quality tuning level (H265QualityTuningLevel) to specifiy whether to use fast single-pass, high-quality singlepass, or high-quality multipass video encoding.
    */
  @js.native
  sealed trait H265QualityTuningLevel extends js.Any
  object H265QualityTuningLevel extends js.Object {
    val SINGLE_PASS    = "SINGLE_PASS".asInstanceOf[H265QualityTuningLevel]
    val SINGLE_PASS_HQ = "SINGLE_PASS_HQ".asInstanceOf[H265QualityTuningLevel]
    val MULTI_PASS_HQ  = "MULTI_PASS_HQ".asInstanceOf[H265QualityTuningLevel]

    val values = js.Object.freeze(js.Array(SINGLE_PASS, SINGLE_PASS_HQ, MULTI_PASS_HQ))
  }

  /**
    * Settings for quality-defined variable bitrate encoding with the H.265 codec. Required when you set Rate control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control mode.
    */
  @js.native
  @Factory
  trait H265QvbrSettings extends js.Object {
    var MaxAverageBitrate: js.UndefOr[__integerMin1000Max1466400000]
    var QvbrQualityLevel: js.UndefOr[__integerMin1Max10]
    var QvbrQualityLevelFineTune: js.UndefOr[__doubleMin0Max1]
  }

  /**
    * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
    */
  @js.native
  sealed trait H265RateControlMode extends js.Any
  object H265RateControlMode extends js.Object {
    val VBR  = "VBR".asInstanceOf[H265RateControlMode]
    val CBR  = "CBR".asInstanceOf[H265RateControlMode]
    val QVBR = "QVBR".asInstanceOf[H265RateControlMode]

    val values = js.Object.freeze(js.Array(VBR, CBR, QVBR))
  }

  /**
    * Specify Sample Adaptive Offset (SAO) filter strength.  Adaptive mode dynamically selects best strength based on content
    */
  @js.native
  sealed trait H265SampleAdaptiveOffsetFilterMode extends js.Any
  object H265SampleAdaptiveOffsetFilterMode extends js.Object {
    val DEFAULT  = "DEFAULT".asInstanceOf[H265SampleAdaptiveOffsetFilterMode]
    val ADAPTIVE = "ADAPTIVE".asInstanceOf[H265SampleAdaptiveOffsetFilterMode]
    val OFF      = "OFF".asInstanceOf[H265SampleAdaptiveOffsetFilterMode]

    val values = js.Object.freeze(js.Array(DEFAULT, ADAPTIVE, OFF))
  }

  /**
    * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default. If this output uses QVBR, choose Transition detection (TRANSITION_DETECTION) for further video quality improvement. For more information about QVBR, see https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
    */
  @js.native
  sealed trait H265SceneChangeDetect extends js.Any
  object H265SceneChangeDetect extends js.Object {
    val DISABLED             = "DISABLED".asInstanceOf[H265SceneChangeDetect]
    val ENABLED              = "ENABLED".asInstanceOf[H265SceneChangeDetect]
    val TRANSITION_DETECTION = "TRANSITION_DETECTION".asInstanceOf[H265SceneChangeDetect]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED, TRANSITION_DETECTION))
  }

  /**
    * Settings for H265 codec
    */
  @js.native
  @Factory
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

  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  @js.native
  sealed trait H265SlowPal extends js.Any
  object H265SlowPal extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H265SlowPal]
    val ENABLED  = "ENABLED".asInstanceOf[H265SlowPal]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Adjust quantization within each frame based on spatial variation of content complexity.
    */
  @js.native
  sealed trait H265SpatialAdaptiveQuantization extends js.Any
  object H265SpatialAdaptiveQuantization extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H265SpatialAdaptiveQuantization]
    val ENABLED  = "ENABLED".asInstanceOf[H265SpatialAdaptiveQuantization]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * This field applies only if the Streams > Advanced > Framerate (framerate) field  is set to 29.970. This field works with the Streams > Advanced > Preprocessors > Deinterlacer  field (deinterlace_mode) and the Streams > Advanced > Interlaced Mode field (interlace_mode)  to identify the scan type for the output: Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces 23.976; the player converts this output to 29.97i.
    */
  @js.native
  sealed trait H265Telecine extends js.Any
  object H265Telecine extends js.Object {
    val NONE = "NONE".asInstanceOf[H265Telecine]
    val SOFT = "SOFT".asInstanceOf[H265Telecine]
    val HARD = "HARD".asInstanceOf[H265Telecine]

    val values = js.Object.freeze(js.Array(NONE, SOFT, HARD))
  }

  /**
    * Adjust quantization within each frame based on temporal variation of content complexity.
    */
  @js.native
  sealed trait H265TemporalAdaptiveQuantization extends js.Any
  object H265TemporalAdaptiveQuantization extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H265TemporalAdaptiveQuantization]
    val ENABLED  = "ENABLED".asInstanceOf[H265TemporalAdaptiveQuantization]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Enables temporal layer identifiers in the encoded bitstream. Up to 3 layers are supported depending on GOP structure: I- and P-frames form one layer, reference B-frames can form a second layer and non-reference b-frames can form a third layer. Decoders can optionally decode only the lower temporal layers to generate a lower frame rate output. For example, given a bitstream with temporal IDs and with b-frames = 1 (i.e. IbPbPb display order), a decoder could decode all the frames for full frame rate output or only the I and P frames (lowest temporal layer) for a half frame rate output.
    */
  @js.native
  sealed trait H265TemporalIds extends js.Any
  object H265TemporalIds extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H265TemporalIds]
    val ENABLED  = "ENABLED".asInstanceOf[H265TemporalIds]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Enable use of tiles, allowing horizontal as well as vertical subdivision of the encoded pictures.
    */
  @js.native
  sealed trait H265Tiles extends js.Any
  object H265Tiles extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H265Tiles]
    val ENABLED  = "ENABLED".asInstanceOf[H265Tiles]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
    */
  @js.native
  sealed trait H265UnregisteredSeiTimecode extends js.Any
  object H265UnregisteredSeiTimecode extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H265UnregisteredSeiTimecode]
    val ENABLED  = "ENABLED".asInstanceOf[H265UnregisteredSeiTimecode]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * If the location of parameter set NAL units doesn't matter in your workflow, ignore this setting. Use this setting only with CMAF or DASH outputs, or with standalone file outputs in an MPEG-4 container (MP4 outputs). Choose HVC1 to mark your output as HVC1. This makes your output compliant with the following specification: ISO IECJTC1 SC29 N13798 Text ISO/IEC FDIS 14496-15 3rd Edition. For these outputs, the service stores parameter set NAL units in the sample headers but not in the samples directly. For MP4 outputs, when you choose HVC1, your output video might not work properly with some downstream systems and video players. The service defaults to marking your output as HEV1. For these outputs, the service writes parameter set NAL units directly into the samples.
    */
  @js.native
  sealed trait H265WriteMp4PackagingType extends js.Any
  object H265WriteMp4PackagingType extends js.Object {
    val HVC1 = "HVC1".asInstanceOf[H265WriteMp4PackagingType]
    val HEV1 = "HEV1".asInstanceOf[H265WriteMp4PackagingType]

    val values = js.Object.freeze(js.Array(HVC1, HEV1))
  }

  /**
    * Use these settings to specify static color calibration metadata, as defined by SMPTE ST 2086. These values don't affect the pixel values that are encoded in the video stream. They are intended to help the downstream video player display content in a way that reflects the intentions of the the content creator.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait HlsAdMarkers extends js.Any
  object HlsAdMarkers extends js.Object {
    val ELEMENTAL        = "ELEMENTAL".asInstanceOf[HlsAdMarkers]
    val ELEMENTAL_SCTE35 = "ELEMENTAL_SCTE35".asInstanceOf[HlsAdMarkers]

    val values = js.Object.freeze(js.Array(ELEMENTAL, ELEMENTAL_SCTE35))
  }

  /**
    * Specify the details for each additional HLS manifest that you want the service to generate for this output group. Each manifest can reference a different subset of outputs in the group.
    */
  @js.native
  @Factory
  trait HlsAdditionalManifest extends js.Object {
    var ManifestNameModifier: js.UndefOr[__stringMin1]
    var SelectedOutputs: js.UndefOr[__listOf__stringMin1]
  }

  /**
    * Use this setting only in audio-only outputs. Choose MPEG-2 Transport Stream (M2TS) to create a file in an MPEG2-TS container. Keep the default value Automatic (AUTOMATIC) to create a raw audio-only file with no container. Regardless of the value that you specify here, if this output has video, the service will place outputs into an MPEG2-TS container.
    */
  @js.native
  sealed trait HlsAudioOnlyContainer extends js.Any
  object HlsAudioOnlyContainer extends js.Object {
    val AUTOMATIC = "AUTOMATIC".asInstanceOf[HlsAudioOnlyContainer]
    val M2TS      = "M2TS".asInstanceOf[HlsAudioOnlyContainer]

    val values = js.Object.freeze(js.Array(AUTOMATIC, M2TS))
  }

  /**
    * Four types of audio-only tracks are supported: Audio-Only Variant Stream The client can play back this audio-only stream instead of video in low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest. Alternate Audio, Auto Select, Default Alternate rendition that the client should try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES Alternate Audio, Auto Select, Not Default Alternate rendition that the client may try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto Select Alternate rendition that the client will not try to play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
    */
  @js.native
  sealed trait HlsAudioTrackType extends js.Any
  object HlsAudioTrackType extends js.Object {
    val ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT = "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT".asInstanceOf[HlsAudioTrackType]
    val ALTERNATE_AUDIO_AUTO_SELECT         = "ALTERNATE_AUDIO_AUTO_SELECT".asInstanceOf[HlsAudioTrackType]
    val ALTERNATE_AUDIO_NOT_AUTO_SELECT     = "ALTERNATE_AUDIO_NOT_AUTO_SELECT".asInstanceOf[HlsAudioTrackType]
    val AUDIO_ONLY_VARIANT_STREAM           = "AUDIO_ONLY_VARIANT_STREAM".asInstanceOf[HlsAudioTrackType]

    val values = js.Object.freeze(
      js.Array(
        ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT,
        ALTERNATE_AUDIO_AUTO_SELECT,
        ALTERNATE_AUDIO_NOT_AUTO_SELECT,
        AUDIO_ONLY_VARIANT_STREAM
      )
    )
  }

  /**
    * Caption Language Mapping
    */
  @js.native
  @Factory
  trait HlsCaptionLanguageMapping extends js.Object {
    var CaptionChannel: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3]
    var LanguageCode: js.UndefOr[LanguageCode]
    var LanguageDescription: js.UndefOr[__string]
  }

  /**
    * Applies only to 608 Embedded output captions. Insert: Include CLOSED-CAPTIONS lines in the manifest. Specify at least one language in the CC1 Language Code field. One CLOSED-CAPTION line is added for each Language Code you specify. Make sure to specify the languages in the order in which they appear in the original source (if the source is embedded format) or the order of the caption selectors (if the source is other than embedded). Otherwise, languages in the manifest will not match up properly with the output captions. None: Include CLOSED-CAPTIONS=NONE line in the manifest. Omit: Omit any CLOSED-CAPTIONS line from the manifest.
    */
  @js.native
  sealed trait HlsCaptionLanguageSetting extends js.Any
  object HlsCaptionLanguageSetting extends js.Object {
    val INSERT = "INSERT".asInstanceOf[HlsCaptionLanguageSetting]
    val OMIT   = "OMIT".asInstanceOf[HlsCaptionLanguageSetting]
    val NONE   = "NONE".asInstanceOf[HlsCaptionLanguageSetting]

    val values = js.Object.freeze(js.Array(INSERT, OMIT, NONE))
  }

  /**
    * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for later replay.
    */
  @js.native
  sealed trait HlsClientCache extends js.Any
  object HlsClientCache extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[HlsClientCache]
    val ENABLED  = "ENABLED".asInstanceOf[HlsClientCache]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
    */
  @js.native
  sealed trait HlsCodecSpecification extends js.Any
  object HlsCodecSpecification extends js.Object {
    val RFC_6381 = "RFC_6381".asInstanceOf[HlsCodecSpecification]
    val RFC_4281 = "RFC_4281".asInstanceOf[HlsCodecSpecification]

    val values = js.Object.freeze(js.Array(RFC_6381, RFC_4281))
  }

  /**
    * Indicates whether segments should be placed in subdirectories.
    */
  @js.native
  sealed trait HlsDirectoryStructure extends js.Any
  object HlsDirectoryStructure extends js.Object {
    val SINGLE_DIRECTORY        = "SINGLE_DIRECTORY".asInstanceOf[HlsDirectoryStructure]
    val SUBDIRECTORY_PER_STREAM = "SUBDIRECTORY_PER_STREAM".asInstanceOf[HlsDirectoryStructure]

    val values = js.Object.freeze(js.Array(SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM))
  }

  /**
    * Settings for HLS encryption
    */
  @js.native
  @Factory
  trait HlsEncryptionSettings extends js.Object {
    var ConstantInitializationVector: js.UndefOr[__stringMin32Max32Pattern09aFAF32]
    var EncryptionMethod: js.UndefOr[HlsEncryptionType]
    var InitializationVectorInManifest: js.UndefOr[HlsInitializationVectorInManifest]
    var OfflineEncrypted: js.UndefOr[HlsOfflineEncrypted]
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProvider]
    var StaticKeyProvider: js.UndefOr[StaticKeyProvider]
    var Type: js.UndefOr[HlsKeyProviderType]
  }

  /**
    * Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in the web interface also disables encryption.
    */
  @js.native
  sealed trait HlsEncryptionType extends js.Any
  object HlsEncryptionType extends js.Object {
    val AES128     = "AES128".asInstanceOf[HlsEncryptionType]
    val SAMPLE_AES = "SAMPLE_AES".asInstanceOf[HlsEncryptionType]

    val values = js.Object.freeze(js.Array(AES128, SAMPLE_AES))
  }

  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to HLS_GROUP_SETTINGS.
    */
  @js.native
  @Factory
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

  /**
    * When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS manifest
    */
  @js.native
  sealed trait HlsIFrameOnlyManifest extends js.Any
  object HlsIFrameOnlyManifest extends js.Object {
    val INCLUDE = "INCLUDE".asInstanceOf[HlsIFrameOnlyManifest]
    val EXCLUDE = "EXCLUDE".asInstanceOf[HlsIFrameOnlyManifest]

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If set to INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not in the manifest.
    */
  @js.native
  sealed trait HlsInitializationVectorInManifest extends js.Any
  object HlsInitializationVectorInManifest extends js.Object {
    val INCLUDE = "INCLUDE".asInstanceOf[HlsInitializationVectorInManifest]
    val EXCLUDE = "EXCLUDE".asInstanceOf[HlsInitializationVectorInManifest]

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
    */
  @js.native
  sealed trait HlsKeyProviderType extends js.Any
  object HlsKeyProviderType extends js.Object {
    val SPEKE      = "SPEKE".asInstanceOf[HlsKeyProviderType]
    val STATIC_KEY = "STATIC_KEY".asInstanceOf[HlsKeyProviderType]

    val values = js.Object.freeze(js.Array(SPEKE, STATIC_KEY))
  }

  /**
    * When set to GZIP, compresses HLS playlist.
    */
  @js.native
  sealed trait HlsManifestCompression extends js.Any
  object HlsManifestCompression extends js.Object {
    val GZIP = "GZIP".asInstanceOf[HlsManifestCompression]
    val NONE = "NONE".asInstanceOf[HlsManifestCompression]

    val values = js.Object.freeze(js.Array(GZIP, NONE))
  }

  /**
    * Indicates whether the output manifest should use floating point values for segment duration.
    */
  @js.native
  sealed trait HlsManifestDurationFormat extends js.Any
  object HlsManifestDurationFormat extends js.Object {
    val FLOATING_POINT = "FLOATING_POINT".asInstanceOf[HlsManifestDurationFormat]
    val INTEGER        = "INTEGER".asInstanceOf[HlsManifestDurationFormat]

    val values = js.Object.freeze(js.Array(FLOATING_POINT, INTEGER))
  }

  /**
    * Enable this setting to insert the EXT-X-SESSION-KEY element into the master playlist. This allows for offline Apple HLS FairPlay content protection.
    */
  @js.native
  sealed trait HlsOfflineEncrypted extends js.Any
  object HlsOfflineEncrypted extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[HlsOfflineEncrypted]
    val DISABLED = "DISABLED".asInstanceOf[HlsOfflineEncrypted]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Indicates whether the .m3u8 manifest file should be generated for this HLS output group.
    */
  @js.native
  sealed trait HlsOutputSelection extends js.Any
  object HlsOutputSelection extends js.Object {
    val MANIFESTS_AND_SEGMENTS = "MANIFESTS_AND_SEGMENTS".asInstanceOf[HlsOutputSelection]
    val SEGMENTS_ONLY          = "SEGMENTS_ONLY".asInstanceOf[HlsOutputSelection]

    val values = js.Object.freeze(js.Array(MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY))
  }

  /**
    * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The value is calculated as follows: either the program date and time are initialized using the input timecode source, or the time is initialized using the input timecode source and the date is initialized using the timestamp_offset.
    */
  @js.native
  sealed trait HlsProgramDateTime extends js.Any
  object HlsProgramDateTime extends js.Object {
    val INCLUDE = "INCLUDE".asInstanceOf[HlsProgramDateTime]
    val EXCLUDE = "EXCLUDE".asInstanceOf[HlsProgramDateTime]

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * When set to SINGLE_FILE, emits program as a single media resource (.ts) file, uses #EXT-X-BYTERANGE tags to index segment for playback.
    */
  @js.native
  sealed trait HlsSegmentControl extends js.Any
  object HlsSegmentControl extends js.Object {
    val SINGLE_FILE     = "SINGLE_FILE".asInstanceOf[HlsSegmentControl]
    val SEGMENTED_FILES = "SEGMENTED_FILES".asInstanceOf[HlsSegmentControl]

    val values = js.Object.freeze(js.Array(SINGLE_FILE, SEGMENTED_FILES))
  }

  /**
    * Settings for HLS output groups
    */
  @js.native
  @Factory
  trait HlsSettings extends js.Object {
    var AudioGroupId: js.UndefOr[__string]
    var AudioOnlyContainer: js.UndefOr[HlsAudioOnlyContainer]
    var AudioRenditionSets: js.UndefOr[__string]
    var AudioTrackType: js.UndefOr[HlsAudioTrackType]
    var IFrameOnlyManifest: js.UndefOr[HlsIFrameOnlyManifest]
    var SegmentModifier: js.UndefOr[__string]
  }

  /**
    * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
    */
  @js.native
  sealed trait HlsStreamInfResolution extends js.Any
  object HlsStreamInfResolution extends js.Object {
    val INCLUDE = "INCLUDE".asInstanceOf[HlsStreamInfResolution]
    val EXCLUDE = "EXCLUDE".asInstanceOf[HlsStreamInfResolution]

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * Indicates ID3 frame that has the timecode.
    */
  @js.native
  sealed trait HlsTimedMetadataId3Frame extends js.Any
  object HlsTimedMetadataId3Frame extends js.Object {
    val NONE = "NONE".asInstanceOf[HlsTimedMetadataId3Frame]
    val PRIV = "PRIV".asInstanceOf[HlsTimedMetadataId3Frame]
    val TDRL = "TDRL".asInstanceOf[HlsTimedMetadataId3Frame]

    val values = js.Object.freeze(js.Array(NONE, PRIV, TDRL))
  }

  /**
    * To insert ID3 tags in your output, specify two values. Use ID3 tag (Id3) to specify the base 64 encoded string and use Timecode (TimeCode) to specify the time when the tag should be inserted. To insert multiple ID3 tags in your output, create multiple instances of ID3 insertion (Id3Insertion).
    */
  @js.native
  @Factory
  trait Id3Insertion extends js.Object {
    var Id3: js.UndefOr[__stringPatternAZaZ0902]
    var Timecode: js.UndefOr[__stringPattern010920405090509092]
  }

  /**
    * Enable the image inserter feature to include a graphic overlay on your video. Enable or disable this feature for each input or output individually. This setting is disabled by default.
    */
  @js.native
  @Factory
  trait ImageInserter extends js.Object {
    var InsertableImages: js.UndefOr[__listOfInsertableImage]
  }

  /**
    * Settings specific to IMSC caption outputs.
    */
  @js.native
  @Factory
  trait ImscDestinationSettings extends js.Object {
    var StylePassthrough: js.UndefOr[ImscStylePassthrough]
  }

  /**
    * Keep this setting enabled to have MediaConvert use the font style and position information from the captions source in the output. This option is available only when your input captions are CFF-TT, IMSC, SMPTE-TT, or TTML. Disable this setting for simplified output captions.
    */
  @js.native
  sealed trait ImscStylePassthrough extends js.Any
  object ImscStylePassthrough extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[ImscStylePassthrough]
    val DISABLED = "DISABLED".asInstanceOf[ImscStylePassthrough]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Specifies media input
    */
  @js.native
  @Factory
  trait Input extends js.Object {
    var AudioSelectorGroups: js.UndefOr[__mapOfAudioSelectorGroup]
    var AudioSelectors: js.UndefOr[__mapOfAudioSelector]
    var CaptionSelectors: js.UndefOr[__mapOfCaptionSelector]
    var Crop: js.UndefOr[Rectangle]
    var DeblockFilter: js.UndefOr[InputDeblockFilter]
    var DecryptionSettings: js.UndefOr[InputDecryptionSettings]
    var DenoiseFilter: js.UndefOr[InputDenoiseFilter]
    var FileInput: js.UndefOr[
      __stringPatternS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLLHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLL
    ]
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

  /**
    * To transcode only portions of your input (clips), include one Input clipping (one instance of InputClipping in the JSON job file) for each input clip. All input clips you specify will be included in every output of the job.
    */
  @js.native
  @Factory
  trait InputClipping extends js.Object {
    var EndTimecode: js.UndefOr[__stringPattern010920405090509092]
    var StartTimecode: js.UndefOr[__stringPattern010920405090509092]
  }

  /**
    * Enable Deblock (InputDeblockFilter) to produce smoother motion in the output. Default is disabled. Only manaully controllable for MPEG2 and uncompressed video inputs.
    */
  @js.native
  sealed trait InputDeblockFilter extends js.Any
  object InputDeblockFilter extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[InputDeblockFilter]
    val DISABLED = "DISABLED".asInstanceOf[InputDeblockFilter]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Settings for decrypting any input files that you encrypt before you upload them to Amazon S3. MediaConvert can decrypt files only when you use AWS Key Management Service (KMS) to encrypt the data key that you use to encrypt your content.
    */
  @js.native
  @Factory
  trait InputDecryptionSettings extends js.Object {
    var DecryptionMode: js.UndefOr[DecryptionMode]
    var EncryptedDecryptionKey: js.UndefOr[__stringMin24Max512PatternAZaZ0902]
    var InitializationVector: js.UndefOr[__stringMin16Max24PatternAZaZ0922AZaZ0916]
    var KmsKeyRegion: js.UndefOr[__stringMin9Max19PatternAZ26EastWestCentralNorthSouthEastWest1912]
  }

  /**
    * Enable Denoise (InputDenoiseFilter) to filter noise from the input.  Default is disabled. Only applicable to MPEG2, H.264, H.265, and uncompressed video inputs.
    */
  @js.native
  sealed trait InputDenoiseFilter extends js.Any
  object InputDenoiseFilter extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[InputDenoiseFilter]
    val DISABLED = "DISABLED".asInstanceOf[InputDenoiseFilter]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Use Filter enable (InputFilterEnable) to specify how the transcoding service applies the denoise and deblock filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and Deblock (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering, depending on input type and quality. * Disable - The input is not filtered. This is true even if you use the API to enable them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The in put is filtered regardless of input type.
    */
  @js.native
  sealed trait InputFilterEnable extends js.Any
  object InputFilterEnable extends js.Object {
    val AUTO    = "AUTO".asInstanceOf[InputFilterEnable]
    val DISABLE = "DISABLE".asInstanceOf[InputFilterEnable]
    val FORCE   = "FORCE".asInstanceOf[InputFilterEnable]

    val values = js.Object.freeze(js.Array(AUTO, DISABLE, FORCE))
  }

  /**
    * Set PSI control (InputPsiControl) for transport stream inputs to specify which data the demux process to scans. * Ignore PSI - Scan all PIDs for audio and video. * Use PSI - Scan only PSI data.
    */
  @js.native
  sealed trait InputPsiControl extends js.Any
  object InputPsiControl extends js.Object {
    val IGNORE_PSI = "IGNORE_PSI".asInstanceOf[InputPsiControl]
    val USE_PSI    = "USE_PSI".asInstanceOf[InputPsiControl]

    val values = js.Object.freeze(js.Array(IGNORE_PSI, USE_PSI))
  }

  /**
    * Use Rotate (InputRotate) to specify how the service rotates your video. You can choose automatic rotation or specify a rotation. You can specify a clockwise rotation of 0, 90, 180, or 270 degrees. If your input video container is .mov or .mp4 and your input has rotation metadata, you can choose Automatic to have the service rotate your video according to the rotation specified in the metadata. The rotation must be within one degree of 90, 180, or 270 degrees. If the rotation metadata specifies any other rotation, the service will default to no rotation. By default, the service does no rotation, even if your input video has rotation metadata. The service doesn't pass through rotation metadata.
    */
  @js.native
  sealed trait InputRotate extends js.Any
  object InputRotate extends js.Object {
    val DEGREE_0    = "DEGREE_0".asInstanceOf[InputRotate]
    val DEGREES_90  = "DEGREES_90".asInstanceOf[InputRotate]
    val DEGREES_180 = "DEGREES_180".asInstanceOf[InputRotate]
    val DEGREES_270 = "DEGREES_270".asInstanceOf[InputRotate]
    val AUTO        = "AUTO".asInstanceOf[InputRotate]

    val values = js.Object.freeze(js.Array(DEGREE_0, DEGREES_90, DEGREES_180, DEGREES_270, AUTO))
  }

  /**
    * Specified video input in a template.
    */
  @js.native
  @Factory
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

  /**
    * Use this Timecode source setting, located under the input settings (InputTimecodeSource), to specify how the service counts input video frames. This input frame count affects only the behavior of features that apply to a single input at a time, such as input clipping and synchronizing some captions formats. Choose Embedded (EMBEDDED) to use the timecodes in your input video. Choose Start at zero (ZEROBASED) to start the first frame at zero. Choose Specified start (SPECIFIEDSTART) to start the first frame at the timecode that you specify in the setting Start timecode (timecodeStart). If you don't specify a value for Timecode source, the service will use Embedded by default. For more information about timecodes, see https://docs.aws.amazon.com/console/mediaconvert/timecode.
    */
  @js.native
  sealed trait InputTimecodeSource extends js.Any
  object InputTimecodeSource extends js.Object {
    val EMBEDDED       = "EMBEDDED".asInstanceOf[InputTimecodeSource]
    val ZEROBASED      = "ZEROBASED".asInstanceOf[InputTimecodeSource]
    val SPECIFIEDSTART = "SPECIFIEDSTART".asInstanceOf[InputTimecodeSource]

    val values = js.Object.freeze(js.Array(EMBEDDED, ZEROBASED, SPECIFIEDSTART))
  }

  /**
    * Settings that specify how your still graphic overlay appears.
    */
  @js.native
  @Factory
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

  /**
    * Each job converts an input file into an output file or files. For more information, see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  @js.native
  @Factory
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
    var Id: js.UndefOr[__string]
    var JobPercentComplete: js.UndefOr[__integer]
    var JobTemplate: js.UndefOr[__string]
    var Messages: js.UndefOr[JobMessages]
    var OutputGroupDetails: js.UndefOr[__listOfOutputGroupDetail]
    var Priority: js.UndefOr[__integerMinNegative50Max50]
    var Queue: js.UndefOr[__string]
    var RetryCount: js.UndefOr[__integer]
    var SimulateReservedQueue: js.UndefOr[SimulateReservedQueue]
    var Status: js.UndefOr[JobStatus]
    var StatusUpdateInterval: js.UndefOr[StatusUpdateInterval]
    var Timing: js.UndefOr[Timing]
    var UserMetadata: js.UndefOr[__mapOf__string]
  }

  /**
    * Provides messages from the service about jobs that you have already successfully submitted.
    */
  @js.native
  @Factory
  trait JobMessages extends js.Object {
    var Info: js.UndefOr[__listOf__string]
    var Warning: js.UndefOr[__listOf__string]
  }

  /**
    * A job's phase can be PROBING, TRANSCODING OR UPLOADING
    */
  @js.native
  sealed trait JobPhase extends js.Any
  object JobPhase extends js.Object {
    val PROBING     = "PROBING".asInstanceOf[JobPhase]
    val TRANSCODING = "TRANSCODING".asInstanceOf[JobPhase]
    val UPLOADING   = "UPLOADING".asInstanceOf[JobPhase]

    val values = js.Object.freeze(js.Array(PROBING, TRANSCODING, UPLOADING))
  }

  /**
    * JobSettings contains all the transcode settings for a job.
    */
  @js.native
  @Factory
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

  /**
    * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
    */
  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus extends js.Object {
    val SUBMITTED   = "SUBMITTED".asInstanceOf[JobStatus]
    val PROGRESSING = "PROGRESSING".asInstanceOf[JobStatus]
    val COMPLETE    = "COMPLETE".asInstanceOf[JobStatus]
    val CANCELED    = "CANCELED".asInstanceOf[JobStatus]
    val ERROR       = "ERROR".asInstanceOf[JobStatus]

    val values = js.Object.freeze(js.Array(SUBMITTED, PROGRESSING, COMPLETE, CANCELED, ERROR))
  }

  /**
    * A job template is a pre-made set of encoding instructions that you can use to quickly create a job.
    */
  @js.native
  @Factory
  trait JobTemplate extends js.Object {
    var Name: __string
    var Settings: JobTemplateSettings
    var AccelerationSettings: js.UndefOr[AccelerationSettings]
    var Arn: js.UndefOr[__string]
    var Category: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__timestampUnix]
    var Description: js.UndefOr[__string]
    var LastUpdated: js.UndefOr[__timestampUnix]
    var Priority: js.UndefOr[__integerMinNegative50Max50]
    var Queue: js.UndefOr[__string]
    var StatusUpdateInterval: js.UndefOr[StatusUpdateInterval]
    var Type: js.UndefOr[Type]
  }

  /**
    * Optional. When you request a list of job templates, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
    */
  @js.native
  sealed trait JobTemplateListBy extends js.Any
  object JobTemplateListBy extends js.Object {
    val NAME          = "NAME".asInstanceOf[JobTemplateListBy]
    val CREATION_DATE = "CREATION_DATE".asInstanceOf[JobTemplateListBy]
    val SYSTEM        = "SYSTEM".asInstanceOf[JobTemplateListBy]

    val values = js.Object.freeze(js.Array(NAME, CREATION_DATE, SYSTEM))
  }

  /**
    * JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs created from it.
    */
  @js.native
  @Factory
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

  /**
    * Specify the language, using the ISO 639-2 three-letter code listed at https://www.loc.gov/standards/iso639-2/php/code_list.php.
    */
  @js.native
  sealed trait LanguageCode extends js.Any
  object LanguageCode extends js.Object {
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

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  @js.native
  @Factory
  trait ListJobTemplatesRequest extends js.Object {
    var Category: js.UndefOr[__string]
    var ListBy: js.UndefOr[JobTemplateListBy]
    var MaxResults: js.UndefOr[__integerMin1Max20]
    var NextToken: js.UndefOr[__string]
    var Order: js.UndefOr[Order]
  }

  @js.native
  @Factory
  trait ListJobTemplatesResponse extends js.Object {
    var JobTemplates: js.UndefOr[__listOfJobTemplate]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListJobsRequest extends js.Object {
    var MaxResults: js.UndefOr[__integerMin1Max20]
    var NextToken: js.UndefOr[__string]
    var Order: js.UndefOr[Order]
    var Queue: js.UndefOr[__string]
    var Status: js.UndefOr[JobStatus]
  }

  @js.native
  @Factory
  trait ListJobsResponse extends js.Object {
    var Jobs: js.UndefOr[__listOfJob]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListPresetsRequest extends js.Object {
    var Category: js.UndefOr[__string]
    var ListBy: js.UndefOr[PresetListBy]
    var MaxResults: js.UndefOr[__integerMin1Max20]
    var NextToken: js.UndefOr[__string]
    var Order: js.UndefOr[Order]
  }

  @js.native
  @Factory
  trait ListPresetsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Presets: js.UndefOr[__listOfPreset]
  }

  @js.native
  @Factory
  trait ListQueuesRequest extends js.Object {
    var ListBy: js.UndefOr[QueueListBy]
    var MaxResults: js.UndefOr[__integerMin1Max20]
    var NextToken: js.UndefOr[__string]
    var Order: js.UndefOr[Order]
  }

  @js.native
  @Factory
  trait ListQueuesResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Queues: js.UndefOr[__listOfQueue]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var Arn: __string
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var ResourceTags: js.UndefOr[ResourceTags]
  }

  /**
    * Selects between the DVB and ATSC buffer models for Dolby Digital audio.
    */
  @js.native
  sealed trait M2tsAudioBufferModel extends js.Any
  object M2tsAudioBufferModel extends js.Object {
    val DVB  = "DVB".asInstanceOf[M2tsAudioBufferModel]
    val ATSC = "ATSC".asInstanceOf[M2tsAudioBufferModel]

    val values = js.Object.freeze(js.Array(DVB, ATSC))
  }

  /**
    * Controls what buffer model to use for accurate interleaving. If set to MULTIPLEX, use multiplex  buffer model. If set to NONE, this can lead to lower latency, but low-memory devices may not be able to play back the stream without interruptions.
    */
  @js.native
  sealed trait M2tsBufferModel extends js.Any
  object M2tsBufferModel extends js.Object {
    val MULTIPLEX = "MULTIPLEX".asInstanceOf[M2tsBufferModel]
    val NONE      = "NONE".asInstanceOf[M2tsBufferModel]

    val values = js.Object.freeze(js.Array(MULTIPLEX, NONE))
  }

  /**
    * When set to VIDEO_AND_FIXED_INTERVALS, audio EBP markers will be added to partitions 3 and 4. The interval between these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval. When set to VIDEO_INTERVAL, these additional markers will not be inserted. Only applicable when EBP segmentation markers are is selected (segmentationMarkers is EBP or EBP_LEGACY).
    */
  @js.native
  sealed trait M2tsEbpAudioInterval extends js.Any
  object M2tsEbpAudioInterval extends js.Object {
    val VIDEO_AND_FIXED_INTERVALS = "VIDEO_AND_FIXED_INTERVALS".asInstanceOf[M2tsEbpAudioInterval]
    val VIDEO_INTERVAL            = "VIDEO_INTERVAL".asInstanceOf[M2tsEbpAudioInterval]

    val values = js.Object.freeze(js.Array(VIDEO_AND_FIXED_INTERVALS, VIDEO_INTERVAL))
  }

  /**
    * Selects which PIDs to place EBP markers on. They can either be placed only on the video PID, or on both the video PID and all audio PIDs. Only applicable when EBP segmentation markers are is selected (segmentationMarkers is EBP or EBP_LEGACY).
    */
  @js.native
  sealed trait M2tsEbpPlacement extends js.Any
  object M2tsEbpPlacement extends js.Object {
    val VIDEO_AND_AUDIO_PIDS = "VIDEO_AND_AUDIO_PIDS".asInstanceOf[M2tsEbpPlacement]
    val VIDEO_PID            = "VIDEO_PID".asInstanceOf[M2tsEbpPlacement]

    val values = js.Object.freeze(js.Array(VIDEO_AND_AUDIO_PIDS, VIDEO_PID))
  }

  /**
    * Controls whether to include the ES Rate field in the PES header.
    */
  @js.native
  sealed trait M2tsEsRateInPes extends js.Any
  object M2tsEsRateInPes extends js.Object {
    val INCLUDE = "INCLUDE".asInstanceOf[M2tsEsRateInPes]
    val EXCLUDE = "EXCLUDE".asInstanceOf[M2tsEsRateInPes]

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * Keep the default value (DEFAULT) unless you know that your audio EBP markers are incorrectly appearing before your video EBP markers. To correct this problem, set this value to Force (FORCE).
    */
  @js.native
  sealed trait M2tsForceTsVideoEbpOrder extends js.Any
  object M2tsForceTsVideoEbpOrder extends js.Object {
    val FORCE   = "FORCE".asInstanceOf[M2tsForceTsVideoEbpOrder]
    val DEFAULT = "DEFAULT".asInstanceOf[M2tsForceTsVideoEbpOrder]

    val values = js.Object.freeze(js.Array(FORCE, DEFAULT))
  }

  /**
    * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  @js.native
  sealed trait M2tsNielsenId3 extends js.Any
  object M2tsNielsenId3 extends js.Object {
    val INSERT = "INSERT".asInstanceOf[M2tsNielsenId3]
    val NONE   = "NONE".asInstanceOf[M2tsNielsenId3]

    val values = js.Object.freeze(js.Array(INSERT, NONE))
  }

  /**
    * When set to PCR_EVERY_PES_PACKET, a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  @js.native
  sealed trait M2tsPcrControl extends js.Any
  object M2tsPcrControl extends js.Object {
    val PCR_EVERY_PES_PACKET  = "PCR_EVERY_PES_PACKET".asInstanceOf[M2tsPcrControl]
    val CONFIGURED_PCR_PERIOD = "CONFIGURED_PCR_PERIOD".asInstanceOf[M2tsPcrControl]

    val values = js.Object.freeze(js.Array(PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD))
  }

  /**
    * When set to CBR, inserts null packets into transport stream to fill specified bitrate. When set to VBR, the bitrate setting acts as the maximum bitrate, but the output will not be padded up to that bitrate.
    */
  @js.native
  sealed trait M2tsRateMode extends js.Any
  object M2tsRateMode extends js.Object {
    val VBR = "VBR".asInstanceOf[M2tsRateMode]
    val CBR = "CBR".asInstanceOf[M2tsRateMode]

    val values = js.Object.freeze(js.Array(VBR, CBR))
  }

  /**
    * Settings for SCTE-35 signals from ESAM. Include this in your job settings to put SCTE-35 markers in your HLS and transport stream outputs at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
    */
  @js.native
  @Factory
  trait M2tsScte35Esam extends js.Object {
    var Scte35EsamPid: js.UndefOr[__integerMin32Max8182]
  }

  /**
    * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want SCTE-35 markers in this output. For SCTE-35 markers from an ESAM XML document-- Choose None (NONE). Also provide the ESAM XML as a string in the setting Signal processing notification XML (sccXml). Also enable ESAM SCTE-35 (include the property scte35Esam).
    */
  @js.native
  sealed trait M2tsScte35Source extends js.Any
  object M2tsScte35Source extends js.Object {
    val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[M2tsScte35Source]
    val NONE        = "NONE".asInstanceOf[M2tsScte35Source]

    val values = js.Object.freeze(js.Array(PASSTHROUGH, NONE))
  }

  /**
    * Inserts segmentation markers at each segmentation_time period. rai_segstart sets the Random Access Indicator bit in the adaptation field. rai_adapt sets the RAI bit and adds the current timecode in the private data bytes. psi_segstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebp_legacy adds Encoder Boundary Point information to the adaptation field using a legacy proprietary format.
    */
  @js.native
  sealed trait M2tsSegmentationMarkers extends js.Any
  object M2tsSegmentationMarkers extends js.Object {
    val NONE         = "NONE".asInstanceOf[M2tsSegmentationMarkers]
    val RAI_SEGSTART = "RAI_SEGSTART".asInstanceOf[M2tsSegmentationMarkers]
    val RAI_ADAPT    = "RAI_ADAPT".asInstanceOf[M2tsSegmentationMarkers]
    val PSI_SEGSTART = "PSI_SEGSTART".asInstanceOf[M2tsSegmentationMarkers]
    val EBP          = "EBP".asInstanceOf[M2tsSegmentationMarkers]
    val EBP_LEGACY   = "EBP_LEGACY".asInstanceOf[M2tsSegmentationMarkers]

    val values = js.Object.freeze(js.Array(NONE, RAI_SEGSTART, RAI_ADAPT, PSI_SEGSTART, EBP, EBP_LEGACY))
  }

  /**
    * The segmentation style parameter controls how segmentation markers are inserted into the transport stream. With avails, it is possible that segments may be truncated, which can influence where future segmentation markers are inserted. When a segmentation style of "reset_cadence" is selected and a segment is truncated due to an avail, we will reset the segmentation cadence. This means the subsequent segment will have a duration of of segmentation_time seconds. When a segmentation style of "maintain_cadence" is selected and a segment is truncated due to an avail, we will not reset the segmentation cadence. This means the subsequent segment will likely be truncated as well. However, all segments after that will have a duration of segmentation_time seconds. Note that EBP lookahead is a slight exception to this rule.
    */
  @js.native
  sealed trait M2tsSegmentationStyle extends js.Any
  object M2tsSegmentationStyle extends js.Object {
    val MAINTAIN_CADENCE = "MAINTAIN_CADENCE".asInstanceOf[M2tsSegmentationStyle]
    val RESET_CADENCE    = "RESET_CADENCE".asInstanceOf[M2tsSegmentationStyle]

    val values = js.Object.freeze(js.Array(MAINTAIN_CADENCE, RESET_CADENCE))
  }

  /**
    * MPEG-2 TS container settings. These apply to outputs in a File output group when the output's container (ContainerType) is MPEG-2 Transport Stream (M2TS). In these assets, data is organized by the program map table (PMT). Each transport stream program contains subsets of data, including audio, video, and metadata. Each of these subsets of data has a numerical label called a packet identifier (PID). Each transport stream program corresponds to one MediaConvert output. The PMT lists the types of data in a program along with their PID. Downstream systems and players use the program map table to look up the PID for each type of data it accesses and then uses the PIDs to locate specific data within the asset.
    */
  @js.native
  @Factory
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

  /**
    * If INSERT, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  @js.native
  sealed trait M3u8NielsenId3 extends js.Any
  object M3u8NielsenId3 extends js.Object {
    val INSERT = "INSERT".asInstanceOf[M3u8NielsenId3]
    val NONE   = "NONE".asInstanceOf[M3u8NielsenId3]

    val values = js.Object.freeze(js.Array(INSERT, NONE))
  }

  /**
    * When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  @js.native
  sealed trait M3u8PcrControl extends js.Any
  object M3u8PcrControl extends js.Object {
    val PCR_EVERY_PES_PACKET  = "PCR_EVERY_PES_PACKET".asInstanceOf[M3u8PcrControl]
    val CONFIGURED_PCR_PERIOD = "CONFIGURED_PCR_PERIOD".asInstanceOf[M3u8PcrControl]

    val values = js.Object.freeze(js.Array(PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD))
  }

  /**
    * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want SCTE-35 markers in this output. For SCTE-35 markers from an ESAM XML document-- Choose None (NONE) if you don't want manifest conditioning. Choose Passthrough (PASSTHROUGH) and choose Ad markers (adMarkers) if you do want manifest conditioning. In both cases, also provide the ESAM XML as a string in the setting Signal processing notification XML (sccXml).
    */
  @js.native
  sealed trait M3u8Scte35Source extends js.Any
  object M3u8Scte35Source extends js.Object {
    val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[M3u8Scte35Source]
    val NONE        = "NONE".asInstanceOf[M3u8Scte35Source]

    val values = js.Object.freeze(js.Array(PASSTHROUGH, NONE))
  }

  /**
    * Settings for TS segments in HLS
    */
  @js.native
  @Factory
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

  /**
    * Overlay motion graphics on top of your video at the time that you specify.
    */
  @js.native
  @Factory
  trait MotionImageInserter extends js.Object {
    var Framerate: js.UndefOr[MotionImageInsertionFramerate]
    var Input: js.UndefOr[__stringMin14Max1285PatternS3Mov09PngHttpsMov09Png]
    var InsertionMode: js.UndefOr[MotionImageInsertionMode]
    var Offset: js.UndefOr[MotionImageInsertionOffset]
    var Playback: js.UndefOr[MotionImagePlayback]
    var StartTime: js.UndefOr[__stringMin11Max11Pattern01D20305D205D]
  }

  /**
    * For motion overlays that don't have a built-in frame rate, specify the frame rate of the overlay in frames per second, as a fraction. For example, specify 24 fps as 24/1. The overlay frame rate doesn't need to match the frame rate of the underlying video.
    */
  @js.native
  @Factory
  trait MotionImageInsertionFramerate extends js.Object {
    var FramerateDenominator: js.UndefOr[__integerMin1Max17895697]
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483640]
  }

  /**
    * Choose the type of motion graphic asset that you are providing for your overlay. You can choose either a .mov file or a series of .png files.
    */
  @js.native
  sealed trait MotionImageInsertionMode extends js.Any
  object MotionImageInsertionMode extends js.Object {
    val MOV = "MOV".asInstanceOf[MotionImageInsertionMode]
    val PNG = "PNG".asInstanceOf[MotionImageInsertionMode]

    val values = js.Object.freeze(js.Array(MOV, PNG))
  }

  /**
    * Specify the offset between the upper-left corner of the video frame and the top left corner of the overlay.
    */
  @js.native
  @Factory
  trait MotionImageInsertionOffset extends js.Object {
    var ImageX: js.UndefOr[__integerMin0Max2147483647]
    var ImageY: js.UndefOr[__integerMin0Max2147483647]
  }

  /**
    * Specify whether your motion graphic overlay repeats on a loop or plays only once.
    */
  @js.native
  sealed trait MotionImagePlayback extends js.Any
  object MotionImagePlayback extends js.Object {
    val ONCE   = "ONCE".asInstanceOf[MotionImagePlayback]
    val REPEAT = "REPEAT".asInstanceOf[MotionImagePlayback]

    val values = js.Object.freeze(js.Array(ONCE, REPEAT))
  }

  /**
    * When enabled, include 'clap' atom if appropriate for the video output settings.
    */
  @js.native
  sealed trait MovClapAtom extends js.Any
  object MovClapAtom extends js.Object {
    val INCLUDE = "INCLUDE".asInstanceOf[MovClapAtom]
    val EXCLUDE = "EXCLUDE".asInstanceOf[MovClapAtom]

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
    */
  @js.native
  sealed trait MovCslgAtom extends js.Any
  object MovCslgAtom extends js.Object {
    val INCLUDE = "INCLUDE".asInstanceOf[MovCslgAtom]
    val EXCLUDE = "EXCLUDE".asInstanceOf[MovCslgAtom]

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * When set to XDCAM, writes MPEG2 video streams into the QuickTime file using XDCAM fourcc codes. This increases compatibility with Apple editors and players, but may decrease compatibility with other players. Only applicable when the video codec is MPEG2.
    */
  @js.native
  sealed trait MovMpeg2FourCCControl extends js.Any
  object MovMpeg2FourCCControl extends js.Object {
    val XDCAM = "XDCAM".asInstanceOf[MovMpeg2FourCCControl]
    val MPEG  = "MPEG".asInstanceOf[MovMpeg2FourCCControl]

    val values = js.Object.freeze(js.Array(XDCAM, MPEG))
  }

  /**
    * If set to OMNEON, inserts Omneon-compatible padding
    */
  @js.native
  sealed trait MovPaddingControl extends js.Any
  object MovPaddingControl extends js.Object {
    val OMNEON = "OMNEON".asInstanceOf[MovPaddingControl]
    val NONE   = "NONE".asInstanceOf[MovPaddingControl]

    val values = js.Object.freeze(js.Array(OMNEON, NONE))
  }

  /**
    * Always keep the default value (SELF_CONTAINED) for this setting.
    */
  @js.native
  sealed trait MovReference extends js.Any
  object MovReference extends js.Object {
    val SELF_CONTAINED = "SELF_CONTAINED".asInstanceOf[MovReference]
    val EXTERNAL       = "EXTERNAL".asInstanceOf[MovReference]

    val values = js.Object.freeze(js.Array(SELF_CONTAINED, EXTERNAL))
  }

  /**
    * Settings for MOV Container.
    */
  @js.native
  @Factory
  trait MovSettings extends js.Object {
    var ClapAtom: js.UndefOr[MovClapAtom]
    var CslgAtom: js.UndefOr[MovCslgAtom]
    var Mpeg2FourCCControl: js.UndefOr[MovMpeg2FourCCControl]
    var PaddingControl: js.UndefOr[MovPaddingControl]
    var Reference: js.UndefOr[MovReference]
  }

  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value MP2.
    */
  @js.native
  @Factory
  trait Mp2Settings extends js.Object {
    var Bitrate: js.UndefOr[__integerMin32000Max384000]
    var Channels: js.UndefOr[__integerMin1Max2]
    var SampleRate: js.UndefOr[__integerMin32000Max48000]
  }

  /**
    * Specify whether the service encodes this MP3 audio output with a constant bitrate (CBR) or a variable bitrate (VBR).
    */
  @js.native
  sealed trait Mp3RateControlMode extends js.Any
  object Mp3RateControlMode extends js.Object {
    val CBR = "CBR".asInstanceOf[Mp3RateControlMode]
    val VBR = "VBR".asInstanceOf[Mp3RateControlMode]

    val values = js.Object.freeze(js.Array(CBR, VBR))
  }

  /**
    * Required when you set Codec, under AudioDescriptions>CodecSettings, to the value MP3.
    */
  @js.native
  @Factory
  trait Mp3Settings extends js.Object {
    var Bitrate: js.UndefOr[__integerMin16000Max320000]
    var Channels: js.UndefOr[__integerMin1Max2]
    var RateControlMode: js.UndefOr[Mp3RateControlMode]
    var SampleRate: js.UndefOr[__integerMin22050Max48000]
    var VbrQuality: js.UndefOr[__integerMin0Max9]
  }

  /**
    * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
    */
  @js.native
  sealed trait Mp4CslgAtom extends js.Any
  object Mp4CslgAtom extends js.Object {
    val INCLUDE = "INCLUDE".asInstanceOf[Mp4CslgAtom]
    val EXCLUDE = "EXCLUDE".asInstanceOf[Mp4CslgAtom]

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * Inserts a free-space box immediately after the moov box.
    */
  @js.native
  sealed trait Mp4FreeSpaceBox extends js.Any
  object Mp4FreeSpaceBox extends js.Object {
    val INCLUDE = "INCLUDE".asInstanceOf[Mp4FreeSpaceBox]
    val EXCLUDE = "EXCLUDE".asInstanceOf[Mp4FreeSpaceBox]

    val values = js.Object.freeze(js.Array(INCLUDE, EXCLUDE))
  }

  /**
    * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
    */
  @js.native
  sealed trait Mp4MoovPlacement extends js.Any
  object Mp4MoovPlacement extends js.Object {
    val PROGRESSIVE_DOWNLOAD = "PROGRESSIVE_DOWNLOAD".asInstanceOf[Mp4MoovPlacement]
    val NORMAL               = "NORMAL".asInstanceOf[Mp4MoovPlacement]

    val values = js.Object.freeze(js.Array(PROGRESSIVE_DOWNLOAD, NORMAL))
  }

  /**
    * Settings for MP4 container. You can create audio-only AAC outputs with this container.
    */
  @js.native
  @Factory
  trait Mp4Settings extends js.Object {
    var CslgAtom: js.UndefOr[Mp4CslgAtom]
    var CttsVersion: js.UndefOr[__integerMin0Max1]
    var FreeSpaceBox: js.UndefOr[Mp4FreeSpaceBox]
    var MoovPlacement: js.UndefOr[Mp4MoovPlacement]
    var Mp4MajorBrand: js.UndefOr[__string]
  }

  /**
    * Use this setting only in DASH output groups that include sidecar TTML or IMSC captions.  You specify sidecar captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single XML file in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format contained within fragmented MP4 files. This set of fragmented MP4 files is separate from your video and audio fragmented MP4 files.
    */
  @js.native
  sealed trait MpdCaptionContainerType extends js.Any
  object MpdCaptionContainerType extends js.Object {
    val RAW            = "RAW".asInstanceOf[MpdCaptionContainerType]
    val FRAGMENTED_MP4 = "FRAGMENTED_MP4".asInstanceOf[MpdCaptionContainerType]

    val values = js.Object.freeze(js.Array(RAW, FRAGMENTED_MP4))
  }

  /**
    * Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
    */
  @js.native
  sealed trait MpdScte35Esam extends js.Any
  object MpdScte35Esam extends js.Object {
    val INSERT = "INSERT".asInstanceOf[MpdScte35Esam]
    val NONE   = "NONE".asInstanceOf[MpdScte35Esam]

    val values = js.Object.freeze(js.Array(INSERT, NONE))
  }

  /**
    * Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want those SCTE-35 markers in this output.
    */
  @js.native
  sealed trait MpdScte35Source extends js.Any
  object MpdScte35Source extends js.Object {
    val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[MpdScte35Source]
    val NONE        = "NONE".asInstanceOf[MpdScte35Source]

    val values = js.Object.freeze(js.Array(PASSTHROUGH, NONE))
  }

  /**
    * Settings for MP4 segments in DASH
    */
  @js.native
  @Factory
  trait MpdSettings extends js.Object {
    var CaptionContainerType: js.UndefOr[MpdCaptionContainerType]
    var Scte35Esam: js.UndefOr[MpdScte35Esam]
    var Scte35Source: js.UndefOr[MpdScte35Source]
  }

  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  @js.native
  sealed trait Mpeg2AdaptiveQuantization extends js.Any
  object Mpeg2AdaptiveQuantization extends js.Object {
    val OFF    = "OFF".asInstanceOf[Mpeg2AdaptiveQuantization]
    val LOW    = "LOW".asInstanceOf[Mpeg2AdaptiveQuantization]
    val MEDIUM = "MEDIUM".asInstanceOf[Mpeg2AdaptiveQuantization]
    val HIGH   = "HIGH".asInstanceOf[Mpeg2AdaptiveQuantization]

    val values = js.Object.freeze(js.Array(OFF, LOW, MEDIUM, HIGH))
  }

  /**
    * Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
    */
  @js.native
  sealed trait Mpeg2CodecLevel extends js.Any
  object Mpeg2CodecLevel extends js.Object {
    val AUTO     = "AUTO".asInstanceOf[Mpeg2CodecLevel]
    val LOW      = "LOW".asInstanceOf[Mpeg2CodecLevel]
    val MAIN     = "MAIN".asInstanceOf[Mpeg2CodecLevel]
    val HIGH1440 = "HIGH1440".asInstanceOf[Mpeg2CodecLevel]
    val HIGH     = "HIGH".asInstanceOf[Mpeg2CodecLevel]

    val values = js.Object.freeze(js.Array(AUTO, LOW, MAIN, HIGH1440, HIGH))
  }

  /**
    * Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video output.
    */
  @js.native
  sealed trait Mpeg2CodecProfile extends js.Any
  object Mpeg2CodecProfile extends js.Object {
    val MAIN        = "MAIN".asInstanceOf[Mpeg2CodecProfile]
    val PROFILE_422 = "PROFILE_422".asInstanceOf[Mpeg2CodecProfile]

    val values = js.Object.freeze(js.Array(MAIN, PROFILE_422))
  }

  /**
    * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
    */
  @js.native
  sealed trait Mpeg2DynamicSubGop extends js.Any
  object Mpeg2DynamicSubGop extends js.Object {
    val ADAPTIVE = "ADAPTIVE".asInstanceOf[Mpeg2DynamicSubGop]
    val STATIC   = "STATIC".asInstanceOf[Mpeg2DynamicSubGop]

    val values = js.Object.freeze(js.Array(ADAPTIVE, STATIC))
  }

  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job sepecification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  @js.native
  sealed trait Mpeg2FramerateControl extends js.Any
  object Mpeg2FramerateControl extends js.Object {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[Mpeg2FramerateControl]
    val SPECIFIED              = "SPECIFIED".asInstanceOf[Mpeg2FramerateControl]

    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
    */
  @js.native
  sealed trait Mpeg2FramerateConversionAlgorithm extends js.Any
  object Mpeg2FramerateConversionAlgorithm extends js.Object {
    val DUPLICATE_DROP = "DUPLICATE_DROP".asInstanceOf[Mpeg2FramerateConversionAlgorithm]
    val INTERPOLATE    = "INTERPOLATE".asInstanceOf[Mpeg2FramerateConversionAlgorithm]

    val values = js.Object.freeze(js.Array(DUPLICATE_DROP, INTERPOLATE))
  }

  /**
    * Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
    */
  @js.native
  sealed trait Mpeg2GopSizeUnits extends js.Any
  object Mpeg2GopSizeUnits extends js.Object {
    val FRAMES  = "FRAMES".asInstanceOf[Mpeg2GopSizeUnits]
    val SECONDS = "SECONDS".asInstanceOf[Mpeg2GopSizeUnits]

    val values = js.Object.freeze(js.Array(FRAMES, SECONDS))
  }

  /**
    * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type.
    *   - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
    *   - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
    */
  @js.native
  sealed trait Mpeg2InterlaceMode extends js.Any
  object Mpeg2InterlaceMode extends js.Object {
    val PROGRESSIVE         = "PROGRESSIVE".asInstanceOf[Mpeg2InterlaceMode]
    val TOP_FIELD           = "TOP_FIELD".asInstanceOf[Mpeg2InterlaceMode]
    val BOTTOM_FIELD        = "BOTTOM_FIELD".asInstanceOf[Mpeg2InterlaceMode]
    val FOLLOW_TOP_FIELD    = "FOLLOW_TOP_FIELD".asInstanceOf[Mpeg2InterlaceMode]
    val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD".asInstanceOf[Mpeg2InterlaceMode]

    val values = js.Object.freeze(js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD))
  }

  /**
    * Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision for intra-block DC coefficients. If you choose the value auto, the service will automatically select the precision based on the per-frame compression ratio.
    */
  @js.native
  sealed trait Mpeg2IntraDcPrecision extends js.Any
  object Mpeg2IntraDcPrecision extends js.Object {
    val AUTO                  = "AUTO".asInstanceOf[Mpeg2IntraDcPrecision]
    val INTRA_DC_PRECISION_8  = "INTRA_DC_PRECISION_8".asInstanceOf[Mpeg2IntraDcPrecision]
    val INTRA_DC_PRECISION_9  = "INTRA_DC_PRECISION_9".asInstanceOf[Mpeg2IntraDcPrecision]
    val INTRA_DC_PRECISION_10 = "INTRA_DC_PRECISION_10".asInstanceOf[Mpeg2IntraDcPrecision]
    val INTRA_DC_PRECISION_11 = "INTRA_DC_PRECISION_11".asInstanceOf[Mpeg2IntraDcPrecision]

    val values = js.Object.freeze(
      js.Array(AUTO, INTRA_DC_PRECISION_8, INTRA_DC_PRECISION_9, INTRA_DC_PRECISION_10, INTRA_DC_PRECISION_11)
    )
  }

  /**
    * Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the input. Using the console, do this by choosing Follow source for Pixel aspect ratio.
    */
  @js.native
  sealed trait Mpeg2ParControl extends js.Any
  object Mpeg2ParControl extends js.Object {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[Mpeg2ParControl]
    val SPECIFIED              = "SPECIFIED".asInstanceOf[Mpeg2ParControl]

    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * Use Quality tuning level (Mpeg2QualityTuningLevel) to specifiy whether to use single-pass or multipass video encoding.
    */
  @js.native
  sealed trait Mpeg2QualityTuningLevel extends js.Any
  object Mpeg2QualityTuningLevel extends js.Object {
    val SINGLE_PASS = "SINGLE_PASS".asInstanceOf[Mpeg2QualityTuningLevel]
    val MULTI_PASS  = "MULTI_PASS".asInstanceOf[Mpeg2QualityTuningLevel]

    val values = js.Object.freeze(js.Array(SINGLE_PASS, MULTI_PASS))
  }

  /**
    * Use Rate control mode (Mpeg2RateControlMode) to specifiy whether the bitrate is variable (vbr) or constant (cbr).
    */
  @js.native
  sealed trait Mpeg2RateControlMode extends js.Any
  object Mpeg2RateControlMode extends js.Object {
    val VBR = "VBR".asInstanceOf[Mpeg2RateControlMode]
    val CBR = "CBR".asInstanceOf[Mpeg2RateControlMode]

    val values = js.Object.freeze(js.Array(VBR, CBR))
  }

  /**
    * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default.
    */
  @js.native
  sealed trait Mpeg2SceneChangeDetect extends js.Any
  object Mpeg2SceneChangeDetect extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[Mpeg2SceneChangeDetect]
    val ENABLED  = "ENABLED".asInstanceOf[Mpeg2SceneChangeDetect]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value MPEG2.
    */
  @js.native
  @Factory
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

  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  @js.native
  sealed trait Mpeg2SlowPal extends js.Any
  object Mpeg2SlowPal extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[Mpeg2SlowPal]
    val ENABLED  = "ENABLED".asInstanceOf[Mpeg2SlowPal]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Adjust quantization within each frame based on spatial variation of content complexity.
    */
  @js.native
  sealed trait Mpeg2SpatialAdaptiveQuantization extends js.Any
  object Mpeg2SpatialAdaptiveQuantization extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[Mpeg2SpatialAdaptiveQuantization]
    val ENABLED  = "ENABLED".asInstanceOf[Mpeg2SpatialAdaptiveQuantization]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Produces a Type D-10 compatible bitstream (SMPTE 356M-2001).
    */
  @js.native
  sealed trait Mpeg2Syntax extends js.Any
  object Mpeg2Syntax extends js.Object {
    val DEFAULT = "DEFAULT".asInstanceOf[Mpeg2Syntax]
    val D_10    = "D_10".asInstanceOf[Mpeg2Syntax]

    val values = js.Object.freeze(js.Array(DEFAULT, D_10))
  }

  /**
    * Only use Telecine (Mpeg2Telecine) when you set Framerate (Framerate) to 29.970. Set Telecine (Mpeg2Telecine) to Hard (hard) to produce a 29.97i output from a 23.976 input. Set it to Soft (soft) to produce 23.976 output and leave converstion to the player.
    */
  @js.native
  sealed trait Mpeg2Telecine extends js.Any
  object Mpeg2Telecine extends js.Object {
    val NONE = "NONE".asInstanceOf[Mpeg2Telecine]
    val SOFT = "SOFT".asInstanceOf[Mpeg2Telecine]
    val HARD = "HARD".asInstanceOf[Mpeg2Telecine]

    val values = js.Object.freeze(js.Array(NONE, SOFT, HARD))
  }

  /**
    * Adjust quantization within each frame based on temporal variation of content complexity.
    */
  @js.native
  sealed trait Mpeg2TemporalAdaptiveQuantization extends js.Any
  object Mpeg2TemporalAdaptiveQuantization extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[Mpeg2TemporalAdaptiveQuantization]
    val ENABLED  = "ENABLED".asInstanceOf[Mpeg2TemporalAdaptiveQuantization]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Specify the details for each additional Microsoft Smooth Streaming manifest that you want the service to generate for this output group. Each manifest can reference a different subset of outputs in the group.
    */
  @js.native
  @Factory
  trait MsSmoothAdditionalManifest extends js.Object {
    var ManifestNameModifier: js.UndefOr[__stringMin1]
    var SelectedOutputs: js.UndefOr[__listOf__stringMin1]
  }

  /**
    * COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings across a Microsoft Smooth output group into a single audio stream.
    */
  @js.native
  sealed trait MsSmoothAudioDeduplication extends js.Any
  object MsSmoothAudioDeduplication extends js.Object {
    val COMBINE_DUPLICATE_STREAMS = "COMBINE_DUPLICATE_STREAMS".asInstanceOf[MsSmoothAudioDeduplication]
    val NONE                      = "NONE".asInstanceOf[MsSmoothAudioDeduplication]

    val values = js.Object.freeze(js.Array(COMBINE_DUPLICATE_STREAMS, NONE))
  }

  /**
    * If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to specify the value SpekeKeyProvider.
    */
  @js.native
  @Factory
  trait MsSmoothEncryptionSettings extends js.Object {
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProvider]
  }

  /**
    * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to MS_SMOOTH_GROUP_SETTINGS.
    */
  @js.native
  @Factory
  trait MsSmoothGroupSettings extends js.Object {
    var AdditionalManifests: js.UndefOr[__listOfMsSmoothAdditionalManifest]
    var AudioDeduplication: js.UndefOr[MsSmoothAudioDeduplication]
    var Destination: js.UndefOr[__stringPatternS3]
    var DestinationSettings: js.UndefOr[DestinationSettings]
    var Encryption: js.UndefOr[MsSmoothEncryptionSettings]
    var FragmentLength: js.UndefOr[__integerMin1Max2147483647]
    var ManifestEncoding: js.UndefOr[MsSmoothManifestEncoding]
  }

  /**
    * Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding format for the server and client manifest. Valid options are utf8 and utf16.
    */
  @js.native
  sealed trait MsSmoothManifestEncoding extends js.Any
  object MsSmoothManifestEncoding extends js.Object {
    val UTF8  = "UTF8".asInstanceOf[MsSmoothManifestEncoding]
    val UTF16 = "UTF16".asInstanceOf[MsSmoothManifestEncoding]

    val values = js.Object.freeze(js.Array(UTF8, UTF16))
  }

  /**
    * Settings for your Nielsen configuration. If you don't do Nielsen measurement and analytics, ignore these settings. When you enable Nielsen configuration (nielsenConfiguration), MediaConvert enables PCM to ID3 tagging for all outputs in the job. To enable Nielsen configuration programmatically, include an instance of nielsenConfiguration in your JSON job specification. Even if you don't include any children of nielsenConfiguration, you still enable the setting.
    */
  @js.native
  @Factory
  trait NielsenConfiguration extends js.Object {
    var BreakoutCode: js.UndefOr[__integerMin0Max0]
    var DistributorId: js.UndefOr[__string]
  }

  /**
    * Enable the Noise reducer (NoiseReducer) feature to remove noise from your video output if necessary. Enable or disable this feature for each output individually. This setting is disabled by default. When you enable Noise reducer (NoiseReducer), you must also select a value for Noise reducer filter (NoiseReducerFilter).
    */
  @js.native
  @Factory
  trait NoiseReducer extends js.Object {
    var Filter: js.UndefOr[NoiseReducerFilter]
    var FilterSettings: js.UndefOr[NoiseReducerFilterSettings]
    var SpatialFilterSettings: js.UndefOr[NoiseReducerSpatialFilterSettings]
    var TemporalFilterSettings: js.UndefOr[NoiseReducerTemporalFilterSettings]
  }

  /**
    * Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering functions. To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral preserves edges while reducing noise. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) do convolution filtering. * Conserve does min/max noise reduction. * Spatial does frequency-domain filtering based on JND principles. * Temporal optimizes video quality for complex motion.
    */
  @js.native
  sealed trait NoiseReducerFilter extends js.Any
  object NoiseReducerFilter extends js.Object {
    val BILATERAL = "BILATERAL".asInstanceOf[NoiseReducerFilter]
    val MEAN      = "MEAN".asInstanceOf[NoiseReducerFilter]
    val GAUSSIAN  = "GAUSSIAN".asInstanceOf[NoiseReducerFilter]
    val LANCZOS   = "LANCZOS".asInstanceOf[NoiseReducerFilter]
    val SHARPEN   = "SHARPEN".asInstanceOf[NoiseReducerFilter]
    val CONSERVE  = "CONSERVE".asInstanceOf[NoiseReducerFilter]
    val SPATIAL   = "SPATIAL".asInstanceOf[NoiseReducerFilter]
    val TEMPORAL  = "TEMPORAL".asInstanceOf[NoiseReducerFilter]

    val values = js.Object.freeze(js.Array(BILATERAL, MEAN, GAUSSIAN, LANCZOS, SHARPEN, CONSERVE, SPATIAL, TEMPORAL))
  }

  /**
    * Settings for a noise reducer filter
    */
  @js.native
  @Factory
  trait NoiseReducerFilterSettings extends js.Object {
    var Strength: js.UndefOr[__integerMin0Max3]
  }

  /**
    * Noise reducer filter settings for spatial filter.
    */
  @js.native
  @Factory
  trait NoiseReducerSpatialFilterSettings extends js.Object {
    var PostFilterSharpenStrength: js.UndefOr[__integerMin0Max3]
    var Speed: js.UndefOr[__integerMinNegative2Max3]
    var Strength: js.UndefOr[__integerMin0Max16]
  }

  /**
    * Noise reducer filter settings for temporal filter.
    */
  @js.native
  @Factory
  trait NoiseReducerTemporalFilterSettings extends js.Object {
    var AggressiveMode: js.UndefOr[__integerMin0Max4]
    var Speed: js.UndefOr[__integerMinNegative1Max3]
    var Strength: js.UndefOr[__integerMin0Max16]
  }

  /**
    * When you request lists of resources, you can optionally specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource.
    */
  @js.native
  sealed trait Order extends js.Any
  object Order extends js.Object {
    val ASCENDING  = "ASCENDING".asInstanceOf[Order]
    val DESCENDING = "DESCENDING".asInstanceOf[Order]

    val values = js.Object.freeze(js.Array(ASCENDING, DESCENDING))
  }

  /**
    * An output object describes the settings for a single output file or stream in an output group.
    */
  @js.native
  @Factory
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

  /**
    * OutputChannel mapping settings.
    */
  @js.native
  @Factory
  trait OutputChannelMapping extends js.Object {
    var InputChannels: js.UndefOr[__listOf__integerMinNegative60Max6]
  }

  /**
    * Details regarding output
    */
  @js.native
  @Factory
  trait OutputDetail extends js.Object {
    var DurationInMs: js.UndefOr[__integer]
    var VideoDetails: js.UndefOr[VideoDetail]
  }

  /**
    * Group of outputs
    */
  @js.native
  @Factory
  trait OutputGroup extends js.Object {
    var CustomName: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var OutputGroupSettings: js.UndefOr[OutputGroupSettings]
    var Outputs: js.UndefOr[__listOfOutput]
  }

  /**
    * Contains details about the output groups specified in the job settings.
    */
  @js.native
  @Factory
  trait OutputGroupDetail extends js.Object {
    var OutputDetails: js.UndefOr[__listOfOutputDetail]
  }

  /**
    * Output Group settings, including type
    */
  @js.native
  @Factory
  trait OutputGroupSettings extends js.Object {
    var CmafGroupSettings: js.UndefOr[CmafGroupSettings]
    var DashIsoGroupSettings: js.UndefOr[DashIsoGroupSettings]
    var FileGroupSettings: js.UndefOr[FileGroupSettings]
    var HlsGroupSettings: js.UndefOr[HlsGroupSettings]
    var MsSmoothGroupSettings: js.UndefOr[MsSmoothGroupSettings]
    var Type: js.UndefOr[OutputGroupType]
  }

  /**
    * Type of output group (File group, Apple HLS, DASH ISO, Microsoft Smooth Streaming, CMAF)
    */
  @js.native
  sealed trait OutputGroupType extends js.Any
  object OutputGroupType extends js.Object {
    val HLS_GROUP_SETTINGS       = "HLS_GROUP_SETTINGS".asInstanceOf[OutputGroupType]
    val DASH_ISO_GROUP_SETTINGS  = "DASH_ISO_GROUP_SETTINGS".asInstanceOf[OutputGroupType]
    val FILE_GROUP_SETTINGS      = "FILE_GROUP_SETTINGS".asInstanceOf[OutputGroupType]
    val MS_SMOOTH_GROUP_SETTINGS = "MS_SMOOTH_GROUP_SETTINGS".asInstanceOf[OutputGroupType]
    val CMAF_GROUP_SETTINGS      = "CMAF_GROUP_SETTINGS".asInstanceOf[OutputGroupType]

    val values = js.Object.freeze(
      js.Array(
        HLS_GROUP_SETTINGS,
        DASH_ISO_GROUP_SETTINGS,
        FILE_GROUP_SETTINGS,
        MS_SMOOTH_GROUP_SETTINGS,
        CMAF_GROUP_SETTINGS
      )
    )
  }

  /**
    * Selects method of inserting SDT information into output stream.  "Follow input SDT" copies SDT information from input stream to  output stream. "Follow input SDT if present" copies SDT information from  input stream to output stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. Enter "SDT  Manually" means user will enter the SDT information. "No SDT" means output  stream will not contain SDT information.
    */
  @js.native
  sealed trait OutputSdt extends js.Any
  object OutputSdt extends js.Object {
    val SDT_FOLLOW            = "SDT_FOLLOW".asInstanceOf[OutputSdt]
    val SDT_FOLLOW_IF_PRESENT = "SDT_FOLLOW_IF_PRESENT".asInstanceOf[OutputSdt]
    val SDT_MANUAL            = "SDT_MANUAL".asInstanceOf[OutputSdt]
    val SDT_NONE              = "SDT_NONE".asInstanceOf[OutputSdt]

    val values = js.Object.freeze(js.Array(SDT_FOLLOW, SDT_FOLLOW_IF_PRESENT, SDT_MANUAL, SDT_NONE))
  }

  /**
    * Specific settings for this type of output.
    */
  @js.native
  @Factory
  trait OutputSettings extends js.Object {
    var HlsSettings: js.UndefOr[HlsSettings]
  }

  /**
    * A preset is a collection of preconfigured media conversion settings that you want MediaConvert to apply to the output during the conversion process.
    */
  @js.native
  @Factory
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

  /**
    * Optional. When you request a list of presets, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
    */
  @js.native
  sealed trait PresetListBy extends js.Any
  object PresetListBy extends js.Object {
    val NAME          = "NAME".asInstanceOf[PresetListBy]
    val CREATION_DATE = "CREATION_DATE".asInstanceOf[PresetListBy]
    val SYSTEM        = "SYSTEM".asInstanceOf[PresetListBy]

    val values = js.Object.freeze(js.Array(NAME, CREATION_DATE, SYSTEM))
  }

  /**
    * Settings for preset
    */
  @js.native
  @Factory
  trait PresetSettings extends js.Object {
    var AudioDescriptions: js.UndefOr[__listOfAudioDescription]
    var CaptionDescriptions: js.UndefOr[__listOfCaptionDescriptionPreset]
    var ContainerSettings: js.UndefOr[ContainerSettings]
    var VideoDescription: js.UndefOr[VideoDescription]
  }

  /**
    * Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment.
    */
  @js.native
  sealed trait PricingPlan extends js.Any
  object PricingPlan extends js.Object {
    val ON_DEMAND = "ON_DEMAND".asInstanceOf[PricingPlan]
    val RESERVED  = "RESERVED".asInstanceOf[PricingPlan]

    val values = js.Object.freeze(js.Array(ON_DEMAND, RESERVED))
  }

  /**
    * Use Profile (ProResCodecProfile) to specifiy the type of Apple ProRes codec to use for this output.
    */
  @js.native
  sealed trait ProresCodecProfile extends js.Any
  object ProresCodecProfile extends js.Object {
    val APPLE_PRORES_422       = "APPLE_PRORES_422".asInstanceOf[ProresCodecProfile]
    val APPLE_PRORES_422_HQ    = "APPLE_PRORES_422_HQ".asInstanceOf[ProresCodecProfile]
    val APPLE_PRORES_422_LT    = "APPLE_PRORES_422_LT".asInstanceOf[ProresCodecProfile]
    val APPLE_PRORES_422_PROXY = "APPLE_PRORES_422_PROXY".asInstanceOf[ProresCodecProfile]

    val values =
      js.Object.freeze(js.Array(APPLE_PRORES_422, APPLE_PRORES_422_HQ, APPLE_PRORES_422_LT, APPLE_PRORES_422_PROXY))
  }

  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job sepecification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  @js.native
  sealed trait ProresFramerateControl extends js.Any
  object ProresFramerateControl extends js.Object {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[ProresFramerateControl]
    val SPECIFIED              = "SPECIFIED".asInstanceOf[ProresFramerateControl]

    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
    */
  @js.native
  sealed trait ProresFramerateConversionAlgorithm extends js.Any
  object ProresFramerateConversionAlgorithm extends js.Object {
    val DUPLICATE_DROP = "DUPLICATE_DROP".asInstanceOf[ProresFramerateConversionAlgorithm]
    val INTERPOLATE    = "INTERPOLATE".asInstanceOf[ProresFramerateConversionAlgorithm]

    val values = js.Object.freeze(js.Array(DUPLICATE_DROP, INTERPOLATE))
  }

  /**
    * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type.
    *   - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
    *   - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
    */
  @js.native
  sealed trait ProresInterlaceMode extends js.Any
  object ProresInterlaceMode extends js.Object {
    val PROGRESSIVE         = "PROGRESSIVE".asInstanceOf[ProresInterlaceMode]
    val TOP_FIELD           = "TOP_FIELD".asInstanceOf[ProresInterlaceMode]
    val BOTTOM_FIELD        = "BOTTOM_FIELD".asInstanceOf[ProresInterlaceMode]
    val FOLLOW_TOP_FIELD    = "FOLLOW_TOP_FIELD".asInstanceOf[ProresInterlaceMode]
    val FOLLOW_BOTTOM_FIELD = "FOLLOW_BOTTOM_FIELD".asInstanceOf[ProresInterlaceMode]

    val values = js.Object.freeze(js.Array(PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD, FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD))
  }

  /**
    * Use (ProresParControl) to specify how the service determines the pixel aspect ratio. Set to Follow source (INITIALIZE_FROM_SOURCE) to use the pixel aspect ratio from the input.  To specify a different pixel aspect ratio: Using the console, choose it from the dropdown menu. Using the API, set ProresParControl to (SPECIFIED) and provide  for (ParNumerator) and (ParDenominator).
    */
  @js.native
  sealed trait ProresParControl extends js.Any
  object ProresParControl extends js.Object {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[ProresParControl]
    val SPECIFIED              = "SPECIFIED".asInstanceOf[ProresParControl]

    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value PRORES.
    */
  @js.native
  @Factory
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

  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  @js.native
  sealed trait ProresSlowPal extends js.Any
  object ProresSlowPal extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[ProresSlowPal]
    val ENABLED  = "ENABLED".asInstanceOf[ProresSlowPal]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Only use Telecine (ProresTelecine) when you set Framerate (Framerate) to 29.970. Set Telecine (ProresTelecine) to Hard (hard) to produce a 29.97i output from a 23.976 input. Set it to Soft (soft) to produce 23.976 output and leave converstion to the player.
    */
  @js.native
  sealed trait ProresTelecine extends js.Any
  object ProresTelecine extends js.Object {
    val NONE = "NONE".asInstanceOf[ProresTelecine]
    val HARD = "HARD".asInstanceOf[ProresTelecine]

    val values = js.Object.freeze(js.Array(NONE, HARD))
  }

  /**
    * You can use queues to manage the resources that are available to your AWS account for running multiple transcoding jobs at the same time. If you don't specify a queue, the service sends all jobs through the default queue. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html.
    */
  @js.native
  @Factory
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

  /**
    * Optional. When you request a list of queues, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by creation date.
    */
  @js.native
  sealed trait QueueListBy extends js.Any
  object QueueListBy extends js.Object {
    val NAME          = "NAME".asInstanceOf[QueueListBy]
    val CREATION_DATE = "CREATION_DATE".asInstanceOf[QueueListBy]

    val values = js.Object.freeze(js.Array(NAME, CREATION_DATE))
  }

  /**
    * Queues can be ACTIVE or PAUSED. If you pause a queue, jobs in that queue won't begin. Jobs that are running when you pause a queue continue to run until they finish or result in an error.
    */
  @js.native
  sealed trait QueueStatus extends js.Any
  object QueueStatus extends js.Object {
    val ACTIVE = "ACTIVE".asInstanceOf[QueueStatus]
    val PAUSED = "PAUSED".asInstanceOf[QueueStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, PAUSED))
  }

  /**
    * Use Rectangle to identify a specific area of the video frame.
    */
  @js.native
  @Factory
  trait Rectangle extends js.Object {
    var Height: js.UndefOr[__integerMin2Max2147483647]
    var Width: js.UndefOr[__integerMin2Max2147483647]
    var X: js.UndefOr[__integerMin0Max2147483647]
    var Y: js.UndefOr[__integerMin0Max2147483647]
  }

  /**
    * Use Manual audio remixing (RemixSettings) to adjust audio levels for each audio channel in each output of your job. With audio remixing, you can output more or fewer audio channels than your input audio source provides.
    */
  @js.native
  @Factory
  trait RemixSettings extends js.Object {
    var ChannelMapping: js.UndefOr[ChannelMapping]
    var ChannelsIn: js.UndefOr[__integerMin1Max64]
    var ChannelsOut: js.UndefOr[__integerMin1Max64]
  }

  /**
    * Specifies whether the term of your reserved queue pricing plan is automatically extended (AUTO_RENEW) or expires (EXPIRE) at the end of the term.
    */
  @js.native
  sealed trait RenewalType extends js.Any
  object RenewalType extends js.Object {
    val AUTO_RENEW = "AUTO_RENEW".asInstanceOf[RenewalType]
    val EXPIRE     = "EXPIRE".asInstanceOf[RenewalType]

    val values = js.Object.freeze(js.Array(AUTO_RENEW, EXPIRE))
  }

  /**
    * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand queues.
    */
  @js.native
  @Factory
  trait ReservationPlan extends js.Object {
    var Commitment: js.UndefOr[Commitment]
    var ExpiresAt: js.UndefOr[__timestampUnix]
    var PurchasedAt: js.UndefOr[__timestampUnix]
    var RenewalType: js.UndefOr[RenewalType]
    var ReservedSlots: js.UndefOr[__integer]
    var Status: js.UndefOr[ReservationPlanStatus]
  }

  /**
    * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand queues.
    */
  @js.native
  @Factory
  trait ReservationPlanSettings extends js.Object {
    var Commitment: Commitment
    var RenewalType: RenewalType
    var ReservedSlots: __integer
  }

  /**
    * Specifies whether the pricing plan for your reserved queue is ACTIVE or EXPIRED.
    */
  @js.native
  sealed trait ReservationPlanStatus extends js.Any
  object ReservationPlanStatus extends js.Object {
    val ACTIVE  = "ACTIVE".asInstanceOf[ReservationPlanStatus]
    val EXPIRED = "EXPIRED".asInstanceOf[ReservationPlanStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, EXPIRED))
  }

  /**
    * The Amazon Resource Name (ARN) and tags for an AWS Elemental MediaConvert resource.
    */
  @js.native
  @Factory
  trait ResourceTags extends js.Object {
    var Arn: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
  }

  /**
    * Use Respond to AFD (RespondToAfd) to specify how the service changes the video itself in response to AFD values in the input. * Choose Respond to clip the input video frame according to the AFD value, input display aspect ratio, and output display aspect ratio. * Choose Passthrough to include the input AFD values. Do not choose this when AfdSignaling is set to (NONE). A preferred implementation of this workflow is to set RespondToAfd to (NONE) and set AfdSignaling to (AUTO). * Choose None to remove all input AFD values from this output.
    */
  @js.native
  sealed trait RespondToAfd extends js.Any
  object RespondToAfd extends js.Object {
    val NONE        = "NONE".asInstanceOf[RespondToAfd]
    val RESPOND     = "RESPOND".asInstanceOf[RespondToAfd]
    val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[RespondToAfd]

    val values = js.Object.freeze(js.Array(NONE, RESPOND, PASSTHROUGH))
  }

  /**
    * Optional. Have MediaConvert automatically apply Amazon S3 access control for the outputs in this output group. When you don't use this setting, S3 automatically applies the default access control list PRIVATE.
    */
  @js.native
  @Factory
  trait S3DestinationAccessControl extends js.Object {
    var CannedAcl: js.UndefOr[S3ObjectCannedAcl]
  }

  /**
    * Settings associated with S3 destination
    */
  @js.native
  @Factory
  trait S3DestinationSettings extends js.Object {
    var AccessControl: js.UndefOr[S3DestinationAccessControl]
    var Encryption: js.UndefOr[S3EncryptionSettings]
  }

  /**
    * Settings for how your job outputs are encrypted as they are uploaded to Amazon S3.
    */
  @js.native
  @Factory
  trait S3EncryptionSettings extends js.Object {
    var EncryptionType: js.UndefOr[S3ServerSideEncryptionType]
    var KmsKeyArn: js.UndefOr[
      __stringPatternArnAwsUsGovCnKmsAZ26EastWestCentralNorthSouthEastWest1912D12KeyAFAF098AFAF094AFAF094AFAF094AFAF0912
    ]
  }

  /**
    * Choose an Amazon S3 canned ACL for MediaConvert to apply to this output.
    */
  @js.native
  sealed trait S3ObjectCannedAcl extends js.Any
  object S3ObjectCannedAcl extends js.Object {
    val PUBLIC_READ               = "PUBLIC_READ".asInstanceOf[S3ObjectCannedAcl]
    val AUTHENTICATED_READ        = "AUTHENTICATED_READ".asInstanceOf[S3ObjectCannedAcl]
    val BUCKET_OWNER_READ         = "BUCKET_OWNER_READ".asInstanceOf[S3ObjectCannedAcl]
    val BUCKET_OWNER_FULL_CONTROL = "BUCKET_OWNER_FULL_CONTROL".asInstanceOf[S3ObjectCannedAcl]

    val values =
      js.Object.freeze(js.Array(PUBLIC_READ, AUTHENTICATED_READ, BUCKET_OWNER_READ, BUCKET_OWNER_FULL_CONTROL))
  }

  /**
    * Specify how you want your data keys managed. AWS uses data keys to encrypt your content. AWS also encrypts the data keys themselves, using a customer master key (CMK), and then stores the encrypted data keys alongside your encrypted content. Use this setting to specify which AWS service manages the CMK. For simplest set up, choose Amazon S3 (SERVER_SIDE_ENCRYPTION_S3). If you want your master key to be managed by AWS Key Management Service (KMS), choose AWS KMS (SERVER_SIDE_ENCRYPTION_KMS). By default, when you choose AWS KMS, KMS uses the AWS managed customer master key (CMK) associated with Amazon S3 to encrypt your data keys. You can optionally choose to specify a different, customer managed CMK. Do so by specifying the Amazon Resource Name (ARN) of the key for the setting  KMS ARN (kmsKeyArn).
    */
  @js.native
  sealed trait S3ServerSideEncryptionType extends js.Any
  object S3ServerSideEncryptionType extends js.Object {
    val SERVER_SIDE_ENCRYPTION_S3  = "SERVER_SIDE_ENCRYPTION_S3".asInstanceOf[S3ServerSideEncryptionType]
    val SERVER_SIDE_ENCRYPTION_KMS = "SERVER_SIDE_ENCRYPTION_KMS".asInstanceOf[S3ServerSideEncryptionType]

    val values = js.Object.freeze(js.Array(SERVER_SIDE_ENCRYPTION_S3, SERVER_SIDE_ENCRYPTION_KMS))
  }

  /**
    * Specify how the service handles outputs that have a different aspect ratio from the input aspect ratio. Choose Stretch to output (STRETCH_TO_OUTPUT) to have the service stretch your video image to fit. Keep the setting Default (DEFAULT) to have the service letterbox your video instead. This setting overrides any value that you specify for the setting Selection placement (position) in this output.
    */
  @js.native
  sealed trait ScalingBehavior extends js.Any
  object ScalingBehavior extends js.Object {
    val DEFAULT           = "DEFAULT".asInstanceOf[ScalingBehavior]
    val STRETCH_TO_OUTPUT = "STRETCH_TO_OUTPUT".asInstanceOf[ScalingBehavior]

    val values = js.Object.freeze(js.Array(DEFAULT, STRETCH_TO_OUTPUT))
  }

  /**
    * Set Framerate (SccDestinationFramerate) to make sure that the captions and the video are synchronized in the output. Specify a frame rate that matches the frame rate of the associated video. If the video frame rate is 29.97, choose 29.97 dropframe (FRAMERATE_29_97_DROPFRAME) only if the video has video_insertion=true and drop_frame_timecode=true; otherwise, choose 29.97 non-dropframe (FRAMERATE_29_97_NON_DROPFRAME).
    */
  @js.native
  sealed trait SccDestinationFramerate extends js.Any
  object SccDestinationFramerate extends js.Object {
    val FRAMERATE_23_97               = "FRAMERATE_23_97".asInstanceOf[SccDestinationFramerate]
    val FRAMERATE_24                  = "FRAMERATE_24".asInstanceOf[SccDestinationFramerate]
    val FRAMERATE_25                  = "FRAMERATE_25".asInstanceOf[SccDestinationFramerate]
    val FRAMERATE_29_97_DROPFRAME     = "FRAMERATE_29_97_DROPFRAME".asInstanceOf[SccDestinationFramerate]
    val FRAMERATE_29_97_NON_DROPFRAME = "FRAMERATE_29_97_NON_DROPFRAME".asInstanceOf[SccDestinationFramerate]

    val values = js.Object.freeze(
      js.Array(FRAMERATE_23_97, FRAMERATE_24, FRAMERATE_25, FRAMERATE_29_97_DROPFRAME, FRAMERATE_29_97_NON_DROPFRAME)
    )
  }

  /**
    * Settings for SCC caption output.
    */
  @js.native
  @Factory
  trait SccDestinationSettings extends js.Object {
    var Framerate: js.UndefOr[SccDestinationFramerate]
  }

  /**
    * Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you need. When this is enabled, MediaConvert runs your job from an on-demand queue with similar performance to what you will see with one RTS in a reserved queue. This setting is disabled by default.
    */
  @js.native
  sealed trait SimulateReservedQueue extends js.Any
  object SimulateReservedQueue extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[SimulateReservedQueue]
    val ENABLED  = "ENABLED".asInstanceOf[SimulateReservedQueue]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a SPEKE-compliant key provider.  If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
    */
  @js.native
  @Factory
  trait SpekeKeyProvider extends js.Object {
    var CertificateArn: js.UndefOr[__stringPatternArnAwsUsGovAcm]
    var ResourceId: js.UndefOr[__string]
    var SystemIds: js.UndefOr[__listOf__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12]
    var Url: js.UndefOr[__stringPatternHttps]
  }

  /**
    * If your output group type is CMAF, use these settings when doing DRM encryption with a SPEKE-compliant key provider. If your output group type is HLS, DASH, or Microsoft Smooth, use the SpekeKeyProvider settings instead.
    */
  @js.native
  @Factory
  trait SpekeKeyProviderCmaf extends js.Object {
    var CertificateArn: js.UndefOr[__stringPatternArnAwsUsGovAcm]
    var DashSignaledSystemIds: js.UndefOr[__listOf__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12]
    var HlsSignaledSystemIds: js.UndefOr[__listOf__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12]
    var ResourceId: js.UndefOr[__stringPatternW]
    var Url: js.UndefOr[__stringPatternHttps]
  }

  /**
    * Use these settings to set up encryption with a static key provider.
    */
  @js.native
  @Factory
  trait StaticKeyProvider extends js.Object {
    var KeyFormat: js.UndefOr[__stringPatternIdentityAZaZ26AZaZ09163]
    var KeyFormatVersions: js.UndefOr[__stringPatternDD]
    var StaticKeyValue: js.UndefOr[__stringPatternAZaZ0932]
    var Url: js.UndefOr[__string]
  }

  /**
    * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error.
    */
  @js.native
  sealed trait StatusUpdateInterval extends js.Any
  object StatusUpdateInterval extends js.Object {
    val SECONDS_10  = "SECONDS_10".asInstanceOf[StatusUpdateInterval]
    val SECONDS_12  = "SECONDS_12".asInstanceOf[StatusUpdateInterval]
    val SECONDS_15  = "SECONDS_15".asInstanceOf[StatusUpdateInterval]
    val SECONDS_20  = "SECONDS_20".asInstanceOf[StatusUpdateInterval]
    val SECONDS_30  = "SECONDS_30".asInstanceOf[StatusUpdateInterval]
    val SECONDS_60  = "SECONDS_60".asInstanceOf[StatusUpdateInterval]
    val SECONDS_120 = "SECONDS_120".asInstanceOf[StatusUpdateInterval]
    val SECONDS_180 = "SECONDS_180".asInstanceOf[StatusUpdateInterval]
    val SECONDS_240 = "SECONDS_240".asInstanceOf[StatusUpdateInterval]
    val SECONDS_300 = "SECONDS_300".asInstanceOf[StatusUpdateInterval]
    val SECONDS_360 = "SECONDS_360".asInstanceOf[StatusUpdateInterval]
    val SECONDS_420 = "SECONDS_420".asInstanceOf[StatusUpdateInterval]
    val SECONDS_480 = "SECONDS_480".asInstanceOf[StatusUpdateInterval]
    val SECONDS_540 = "SECONDS_540".asInstanceOf[StatusUpdateInterval]
    val SECONDS_600 = "SECONDS_600".asInstanceOf[StatusUpdateInterval]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var Arn: __string
    var Tags: __mapOf__string
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * Settings for Teletext caption output
    */
  @js.native
  @Factory
  trait TeletextDestinationSettings extends js.Object {
    var PageNumber: js.UndefOr[__stringMin3Max3Pattern1809aFAF09aEAE]
    var PageTypes: js.UndefOr[__listOfTeletextPageType]
  }

  /**
    * A page type as defined in the standard ETSI EN 300 468, Table 94
    */
  @js.native
  sealed trait TeletextPageType extends js.Any
  object TeletextPageType extends js.Object {
    val PAGE_TYPE_INITIAL                   = "PAGE_TYPE_INITIAL".asInstanceOf[TeletextPageType]
    val PAGE_TYPE_SUBTITLE                  = "PAGE_TYPE_SUBTITLE".asInstanceOf[TeletextPageType]
    val PAGE_TYPE_ADDL_INFO                 = "PAGE_TYPE_ADDL_INFO".asInstanceOf[TeletextPageType]
    val PAGE_TYPE_PROGRAM_SCHEDULE          = "PAGE_TYPE_PROGRAM_SCHEDULE".asInstanceOf[TeletextPageType]
    val PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE = "PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE".asInstanceOf[TeletextPageType]

    val values = js.Object.freeze(
      js.Array(
        PAGE_TYPE_INITIAL,
        PAGE_TYPE_SUBTITLE,
        PAGE_TYPE_ADDL_INFO,
        PAGE_TYPE_PROGRAM_SCHEDULE,
        PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE
      )
    )
  }

  /**
    * Settings specific to Teletext caption sources, including Page number.
    */
  @js.native
  @Factory
  trait TeletextSourceSettings extends js.Object {
    var PageNumber: js.UndefOr[__stringMin3Max3Pattern1809aFAF09aEAE]
  }

  /**
    * Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and specified prefix into the output.
    */
  @js.native
  @Factory
  trait TimecodeBurnin extends js.Object {
    var FontSize: js.UndefOr[__integerMin10Max48]
    var Position: js.UndefOr[TimecodeBurninPosition]
    var Prefix: js.UndefOr[__stringPattern]
  }

  /**
    * Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to specify the location the burned-in timecode on output video.
    */
  @js.native
  sealed trait TimecodeBurninPosition extends js.Any
  object TimecodeBurninPosition extends js.Object {
    val TOP_CENTER    = "TOP_CENTER".asInstanceOf[TimecodeBurninPosition]
    val TOP_LEFT      = "TOP_LEFT".asInstanceOf[TimecodeBurninPosition]
    val TOP_RIGHT     = "TOP_RIGHT".asInstanceOf[TimecodeBurninPosition]
    val MIDDLE_LEFT   = "MIDDLE_LEFT".asInstanceOf[TimecodeBurninPosition]
    val MIDDLE_CENTER = "MIDDLE_CENTER".asInstanceOf[TimecodeBurninPosition]
    val MIDDLE_RIGHT  = "MIDDLE_RIGHT".asInstanceOf[TimecodeBurninPosition]
    val BOTTOM_LEFT   = "BOTTOM_LEFT".asInstanceOf[TimecodeBurninPosition]
    val BOTTOM_CENTER = "BOTTOM_CENTER".asInstanceOf[TimecodeBurninPosition]
    val BOTTOM_RIGHT  = "BOTTOM_RIGHT".asInstanceOf[TimecodeBurninPosition]

    val values = js.Object.freeze(
      js.Array(
        TOP_CENTER,
        TOP_LEFT,
        TOP_RIGHT,
        MIDDLE_LEFT,
        MIDDLE_CENTER,
        MIDDLE_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_CENTER,
        BOTTOM_RIGHT
      )
    )
  }

  /**
    * These settings control how the service handles timecodes throughout the job. These settings don't affect input clipping.
    */
  @js.native
  @Factory
  trait TimecodeConfig extends js.Object {
    var Anchor: js.UndefOr[__stringPattern010920405090509092]
    var Source: js.UndefOr[TimecodeSource]
    var Start: js.UndefOr[__stringPattern010920405090509092]
    var TimestampOffset: js.UndefOr[__stringPattern0940191020191209301]
  }

  /**
    * Use Source (TimecodeSource) to set how timecodes are handled within this job. To make sure that your video, audio, captions, and markers are synchronized and that time-based features, such as image inserter, work correctly, choose the Timecode source option that matches your assets. All timecodes are in a 24-hour format with frame number (HH:MM:SS:FF). * Embedded (EMBEDDED) - Use the timecode that is in the input video. If no embedded timecode is in the source, the service will use Start at 0 (ZEROBASED) instead. * Start at 0 (ZEROBASED) - Set the timecode of the initial frame to 00:00:00:00. * Specified Start (SPECIFIEDSTART) - Set the timecode of the initial frame to a value other than zero. You use Start timecode (Start) to provide this value.
    */
  @js.native
  sealed trait TimecodeSource extends js.Any
  object TimecodeSource extends js.Object {
    val EMBEDDED       = "EMBEDDED".asInstanceOf[TimecodeSource]
    val ZEROBASED      = "ZEROBASED".asInstanceOf[TimecodeSource]
    val SPECIFIEDSTART = "SPECIFIEDSTART".asInstanceOf[TimecodeSource]

    val values = js.Object.freeze(js.Array(EMBEDDED, ZEROBASED, SPECIFIEDSTART))
  }

  /**
    * Applies only to HLS outputs. Use this setting to specify whether the service inserts the ID3 timed metadata from the input in this output.
    */
  @js.native
  sealed trait TimedMetadata extends js.Any
  object TimedMetadata extends js.Object {
    val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[TimedMetadata]
    val NONE        = "NONE".asInstanceOf[TimedMetadata]

    val values = js.Object.freeze(js.Array(PASSTHROUGH, NONE))
  }

  /**
    * Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3 tags in your job. To include timed metadata, you must enable it here, enable it in each output container, and specify tags and timecodes in ID3 insertion (Id3Insertion) objects.
    */
  @js.native
  @Factory
  trait TimedMetadataInsertion extends js.Object {
    var Id3Insertions: js.UndefOr[__listOfId3Insertion]
  }

  /**
    * Information about when jobs are submitted, started, and finished is specified in Unix epoch format in seconds.
    */
  @js.native
  @Factory
  trait Timing extends js.Object {
    var FinishTime: js.UndefOr[__timestampUnix]
    var StartTime: js.UndefOr[__timestampUnix]
    var SubmitTime: js.UndefOr[__timestampUnix]
  }

  /**
    * Settings specific to caption sources that are specified by track number. Currently, this is only IMSC captions in an IMF package. If your caption source is IMSC 1.1 in a separate xml file, use FileSourceSettings instead of TrackSourceSettings.
    */
  @js.native
  @Factory
  trait TrackSourceSettings extends js.Object {
    var TrackNumber: js.UndefOr[__integerMin1Max2147483647]
  }

  /**
    * Settings specific to TTML caption outputs, including Pass style information (TtmlStylePassthrough).
    */
  @js.native
  @Factory
  trait TtmlDestinationSettings extends js.Object {
    var StylePassthrough: js.UndefOr[TtmlStylePassthrough]
  }

  /**
    * Pass through style and position information from a TTML-like input source (TTML, SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
    */
  @js.native
  sealed trait TtmlStylePassthrough extends js.Any
  object TtmlStylePassthrough extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[TtmlStylePassthrough]
    val DISABLED = "DISABLED".asInstanceOf[TtmlStylePassthrough]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  @js.native
  sealed trait Type extends js.Any
  object Type extends js.Object {
    val SYSTEM = "SYSTEM".asInstanceOf[Type]
    val CUSTOM = "CUSTOM".asInstanceOf[Type]

    val values = js.Object.freeze(js.Array(SYSTEM, CUSTOM))
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var Arn: __string
    var TagKeys: js.UndefOr[__listOf__string]
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateJobTemplateRequest extends js.Object {
    var Name: __string
    var AccelerationSettings: js.UndefOr[AccelerationSettings]
    var Category: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var Priority: js.UndefOr[__integerMinNegative50Max50]
    var Queue: js.UndefOr[__string]
    var Settings: js.UndefOr[JobTemplateSettings]
    var StatusUpdateInterval: js.UndefOr[StatusUpdateInterval]
  }

  @js.native
  @Factory
  trait UpdateJobTemplateResponse extends js.Object {
    var JobTemplate: js.UndefOr[JobTemplate]
  }

  @js.native
  @Factory
  trait UpdatePresetRequest extends js.Object {
    var Name: __string
    var Category: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var Settings: js.UndefOr[PresetSettings]
  }

  @js.native
  @Factory
  trait UpdatePresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset]
  }

  @js.native
  @Factory
  trait UpdateQueueRequest extends js.Object {
    var Name: __string
    var Description: js.UndefOr[__string]
    var ReservationPlanSettings: js.UndefOr[ReservationPlanSettings]
    var Status: js.UndefOr[QueueStatus]
  }

  @js.native
  @Factory
  trait UpdateQueueResponse extends js.Object {
    var Queue: js.UndefOr[Queue]
  }

  /**
    * Type of video codec
    */
  @js.native
  sealed trait VideoCodec extends js.Any
  object VideoCodec extends js.Object {
    val FRAME_CAPTURE = "FRAME_CAPTURE".asInstanceOf[VideoCodec]
    val H_264         = "H_264".asInstanceOf[VideoCodec]
    val H_265         = "H_265".asInstanceOf[VideoCodec]
    val MPEG2         = "MPEG2".asInstanceOf[VideoCodec]
    val PRORES        = "PRORES".asInstanceOf[VideoCodec]

    val values = js.Object.freeze(js.Array(FRAME_CAPTURE, H_264, H_265, MPEG2, PRORES))
  }

  /**
    * Video codec settings, (CodecSettings) under (VideoDescription), contains the group of settings related to video encoding. The settings in this group vary depending on the value that you choose for Video codec (Codec). For each codec enum that you choose, define the corresponding settings object. The following lists the codec enum, settings object pairs. * FRAME_CAPTURE, FrameCaptureSettings * H_264, H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES, ProresSettings
    */
  @js.native
  @Factory
  trait VideoCodecSettings extends js.Object {
    var Codec: js.UndefOr[VideoCodec]
    var FrameCaptureSettings: js.UndefOr[FrameCaptureSettings]
    var H264Settings: js.UndefOr[H264Settings]
    var H265Settings: js.UndefOr[H265Settings]
    var Mpeg2Settings: js.UndefOr[Mpeg2Settings]
    var ProresSettings: js.UndefOr[ProresSettings]
  }

  /**
    * Settings for video outputs
    */
  @js.native
  @Factory
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

  /**
    * Contains details about the output's video stream
    */
  @js.native
  @Factory
  trait VideoDetail extends js.Object {
    var HeightInPx: js.UndefOr[__integer]
    var WidthInPx: js.UndefOr[__integer]
  }

  /**
    * Find additional transcoding features under Preprocessors (VideoPreprocessors). Enable the features at each output individually. These features are disabled by default.
    */
  @js.native
  @Factory
  trait VideoPreprocessor extends js.Object {
    var ColorCorrector: js.UndefOr[ColorCorrector]
    var Deinterlacer: js.UndefOr[Deinterlacer]
    var DolbyVision: js.UndefOr[DolbyVision]
    var ImageInserter: js.UndefOr[ImageInserter]
    var NoiseReducer: js.UndefOr[NoiseReducer]
    var TimecodeBurnin: js.UndefOr[TimecodeBurnin]
  }

  /**
    * Selector for video.
    */
  @js.native
  @Factory
  trait VideoSelector extends js.Object {
    var AlphaBehavior: js.UndefOr[AlphaBehavior]
    var ColorSpace: js.UndefOr[ColorSpace]
    var ColorSpaceUsage: js.UndefOr[ColorSpaceUsage]
    var Hdr10Metadata: js.UndefOr[Hdr10Metadata]
    var Pid: js.UndefOr[__integerMin1Max2147483647]
    var ProgramNumber: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var Rotate: js.UndefOr[InputRotate]
  }

  /**
    * Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable Timecode insertion when the input frame rate is identical to the output frame rate. To include timecodes in this output, set Timecode insertion (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is DISABLED. When the service inserts timecodes in an output, by default, it uses any embedded timecodes from the input. If none are present, the service will set the timecode for the first output frame to zero. To change this default behavior, adjust the settings under Timecode configuration (TimecodeConfig). In the console, these settings are located under Job > Job settings > Timecode configuration. Note - Timecode source under input settings (InputTimecodeSource) does not affect the timecodes that are inserted in the output. Source under Job settings > Timecode configuration (TimecodeSource) does.
    */
  @js.native
  sealed trait VideoTimecodeInsertion extends js.Any
  object VideoTimecodeInsertion extends js.Object {
    val DISABLED       = "DISABLED".asInstanceOf[VideoTimecodeInsertion]
    val PIC_TIMING_SEI = "PIC_TIMING_SEI".asInstanceOf[VideoTimecodeInsertion]

    val values = js.Object.freeze(js.Array(DISABLED, PIC_TIMING_SEI))
  }

  /**
    * The service defaults to using RIFF for WAV outputs. If your output audio is likely to exceed 4 GB in file size, or if you otherwise need the extended support of the RF64 format, set your output WAV file format to RF64.
    */
  @js.native
  sealed trait WavFormat extends js.Any
  object WavFormat extends js.Object {
    val RIFF = "RIFF".asInstanceOf[WavFormat]
    val RF64 = "RF64".asInstanceOf[WavFormat]

    val values = js.Object.freeze(js.Array(RIFF, RF64))
  }

  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value WAV.
    */
  @js.native
  @Factory
  trait WavSettings extends js.Object {
    var BitDepth: js.UndefOr[__integerMin16Max24]
    var Channels: js.UndefOr[__integerMin1Max64]
    var Format: js.UndefOr[WavFormat]
    var SampleRate: js.UndefOr[__integerMin8000Max192000]
  }
}
