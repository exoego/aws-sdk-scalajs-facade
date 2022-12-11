package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object mediaconvert {
  type __doubleMin0 = Double
  type __doubleMin0Max1 = Double
  type __doubleMin0Max2147483647 = Double
  type __doubleMinNegative59Max0 = Double
  type __doubleMinNegative60Max3 = Double
  type __doubleMinNegative60Max6 = Double
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
  type __integerMin0Max4000 = Int
  type __integerMin0Max4194303 = Int
  type __integerMin0Max47185920 = Int
  type __integerMin0Max500 = Int
  type __integerMin0Max50000 = Int
  type __integerMin0Max65534 = Int
  type __integerMin0Max65535 = Int
  type __integerMin0Max7 = Int
  type __integerMin0Max8 = Int
  type __integerMin0Max9 = Int
  type __integerMin0Max96 = Int
  type __integerMin0Max99 = Int
  type __integerMin100000Max100000000 = Int
  type __integerMin1000Max1152000000 = Int
  type __integerMin1000Max1466400000 = Int
  type __integerMin1000Max288000000 = Int
  type __integerMin1000Max30000 = Int
  type __integerMin1000Max300000000 = Int
  type __integerMin1000Max480000000 = Int
  type __integerMin100Max1000 = Int
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
  type __integerMin1Max2048 = Int
  type __integerMin1Max2147483640 = Int
  type __integerMin1Max2147483647 = Int
  type __integerMin1Max31 = Int
  type __integerMin1Max32 = Int
  type __integerMin1Max4 = Int
  type __integerMin1Max4096 = Int
  type __integerMin1Max512 = Int
  type __integerMin1Max6 = Int
  type __integerMin1Max60000 = Int
  type __integerMin1Max64 = Int
  type __integerMin22050Max48000 = Int
  type __integerMin24Max60000 = Int
  type __integerMin25Max10000 = Int
  type __integerMin25Max2000 = Int
  type __integerMin2Max2147483647 = Int
  type __integerMin2Max4096 = Int
  type __integerMin32000Max192000 = Int
  type __integerMin32000Max3024000 = Int
  type __integerMin32000Max384000 = Int
  type __integerMin32000Max48000 = Int
  type __integerMin32Max8182 = Int
  type __integerMin32Max8192 = Int
  type __integerMin384000Max1024000 = Int
  type __integerMin3Max15 = Int
  type __integerMin48000Max48000 = Int
  type __integerMin4Max12 = Int
  type __integerMin50Max86400000 = Int
  type __integerMin6000Max1024000 = Int
  type __integerMin64000Max640000 = Int
  type __integerMin8000Max192000 = Int
  type __integerMin8000Max96000 = Int
  type __integerMin8Max12 = Int
  type __integerMin8Max4096 = Int
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
  type __listOfAllowedRenditionSize = js.Array[AllowedRenditionSize]
  type __listOfAudioDescription = js.Array[AudioDescription]
  type __listOfAutomatedAbrRule = js.Array[AutomatedAbrRule]
  type __listOfCaptionDescription = js.Array[CaptionDescription]
  type __listOfCaptionDescriptionPreset = js.Array[CaptionDescriptionPreset]
  type __listOfCmafAdditionalManifest = js.Array[CmafAdditionalManifest]
  type __listOfDashAdditionalManifest = js.Array[DashAdditionalManifest]
  type __listOfEndpoint = js.Array[Endpoint]
  type __listOfForceIncludeRenditionSize = js.Array[ForceIncludeRenditionSize]
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
  type __listOf__doubleMinNegative60Max6 = js.Array[__doubleMinNegative60Max6]
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
  type __stringMax1000 = String
  type __stringMin0 = String
  type __stringMin1 = String
  type __stringMin11Max11Pattern01D20305D205D = String
  type __stringMin14PatternS3BmpBMPPngPNGHttpsBmpBMPPngPNG = String
  type __stringMin14PatternS3BmpBMPPngPNGTgaTGAHttpsBmpBMPPngPNGTgaTGA = String
  type __stringMin14PatternS3Mov09PngHttpsMov09Png = String
  type __stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIVttVTTWebvttWEBVTTHttpsSccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIVttVTTWebvttWEBVTT = String
  type __stringMin14PatternS3XmlXMLHttpsXmlXML = String
  type __stringMin16Max24PatternAZaZ0922AZaZ0916 = String
  type __stringMin1Max100000 = String
  type __stringMin1Max20 = String
  type __stringMin1Max256 = String
  type __stringMin1Max50 = String
  type __stringMin1Max50PatternAZAZ09 = String
  type __stringMin1Max512PatternAZAZ09 = String
  type __stringMin24Max512PatternAZaZ0902 = String
  type __stringMin32Max32Pattern09aFAF32 = String
  type __stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12 = String
  type __stringMin3Max3Pattern1809aFAF09aEAE = String
  type __stringMin3Max3PatternAZaZ3 = String
  type __stringMin6Max8Pattern09aFAF609aFAF2 = String
  type __stringMin9Max19PatternAZ26EastWestCentralNorthSouthEastWest1912 = String
  type __stringPattern = String
  type __stringPattern010920405090509092 = String
  type __stringPattern01D20305D205D = String
  type __stringPattern0940191020191209301 = String
  type __stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12 = String
  type __stringPattern0xAFaF0908190908 = String
  type __stringPatternAZaZ0902 = String
  type __stringPatternAZaZ0932 = String
  type __stringPatternAZaZ23AZaZ = String
  type __stringPatternArnAwsUsGovAcm = String
  type __stringPatternArnAwsUsGovCnKmsAZ26EastWestCentralNorthSouthEastWest1912D12KeyAFAF098AFAF094AFAF094AFAF094AFAF0912MrkAFAF0932 = String
  type __stringPatternDD = String
  type __stringPatternHttps = String
  type __stringPatternHttpsKantarmediaCom = String
  type __stringPatternIdentityAZaZ26AZaZ09163 = String
  type __stringPatternS3 = String
  type __stringPatternS3ASSETMAPXml = String
  type __stringPatternS3MM2PPMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVaAAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLLOOGGGGaAAATTMMOOSSHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVaAAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLLOOGGGGaAAATTMMOOSS = String
  type __stringPatternS3MM2PPWWEEBBMMMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVaAAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEEAATTMMOOSSOOGGGGaAHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVaAAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEEAATTMMOOSSOOGGGGaA = String
  type __stringPatternSNManifestConfirmConditionNotificationNS = String
  type __stringPatternSNSignalProcessingNotificationNS = String
  type __stringPatternW = String
  type __stringPatternWS = String
  type __timestampUnix = js.Date

  final class MediaConvertOps(private val service: MediaConvert) extends AnyVal {

    @inline def associateCertificateFuture(params: AssociateCertificateRequest): Future[AssociateCertificateResponse] = service.associateCertificate(params).promise().toFuture
    @inline def cancelJobFuture(params: CancelJobRequest): Future[CancelJobResponse] = service.cancelJob(params).promise().toFuture
    @inline def createJobFuture(params: CreateJobRequest): Future[CreateJobResponse] = service.createJob(params).promise().toFuture
    @inline def createJobTemplateFuture(params: CreateJobTemplateRequest): Future[CreateJobTemplateResponse] = service.createJobTemplate(params).promise().toFuture
    @inline def createPresetFuture(params: CreatePresetRequest): Future[CreatePresetResponse] = service.createPreset(params).promise().toFuture
    @inline def createQueueFuture(params: CreateQueueRequest): Future[CreateQueueResponse] = service.createQueue(params).promise().toFuture
    @inline def deleteJobTemplateFuture(params: DeleteJobTemplateRequest): Future[DeleteJobTemplateResponse] = service.deleteJobTemplate(params).promise().toFuture
    @inline def deletePolicyFuture(params: DeletePolicyRequest): Future[DeletePolicyResponse] = service.deletePolicy(params).promise().toFuture
    @inline def deletePresetFuture(params: DeletePresetRequest): Future[DeletePresetResponse] = service.deletePreset(params).promise().toFuture
    @inline def deleteQueueFuture(params: DeleteQueueRequest): Future[DeleteQueueResponse] = service.deleteQueue(params).promise().toFuture
    @inline def describeEndpointsFuture(params: DescribeEndpointsRequest): Future[DescribeEndpointsResponse] = service.describeEndpoints(params).promise().toFuture
    @inline def disassociateCertificateFuture(params: DisassociateCertificateRequest): Future[DisassociateCertificateResponse] = service.disassociateCertificate(params).promise().toFuture
    @inline def getJobFuture(params: GetJobRequest): Future[GetJobResponse] = service.getJob(params).promise().toFuture
    @inline def getJobTemplateFuture(params: GetJobTemplateRequest): Future[GetJobTemplateResponse] = service.getJobTemplate(params).promise().toFuture
    @inline def getPolicyFuture(params: GetPolicyRequest): Future[GetPolicyResponse] = service.getPolicy(params).promise().toFuture
    @inline def getPresetFuture(params: GetPresetRequest): Future[GetPresetResponse] = service.getPreset(params).promise().toFuture
    @inline def getQueueFuture(params: GetQueueRequest): Future[GetQueueResponse] = service.getQueue(params).promise().toFuture
    @inline def listJobTemplatesFuture(params: ListJobTemplatesRequest): Future[ListJobTemplatesResponse] = service.listJobTemplates(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResponse] = service.listJobs(params).promise().toFuture
    @inline def listPresetsFuture(params: ListPresetsRequest): Future[ListPresetsResponse] = service.listPresets(params).promise().toFuture
    @inline def listQueuesFuture(params: ListQueuesRequest): Future[ListQueuesResponse] = service.listQueues(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putPolicyFuture(params: PutPolicyRequest): Future[PutPolicyResponse] = service.putPolicy(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateJobTemplateFuture(params: UpdateJobTemplateRequest): Future[UpdateJobTemplateResponse] = service.updateJobTemplate(params).promise().toFuture
    @inline def updatePresetFuture(params: UpdatePresetRequest): Future[UpdatePresetResponse] = service.updatePreset(params).promise().toFuture
    @inline def updateQueueFuture(params: UpdateQueueRequest): Future[UpdateQueueResponse] = service.updateQueue(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/mediaconvert", JSImport.Namespace, "AWS.MediaConvert")
  class MediaConvert() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateCertificate(params: AssociateCertificateRequest): Request[AssociateCertificateResponse] = js.native
    def cancelJob(params: CancelJobRequest): Request[CancelJobResponse] = js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResponse] = js.native
    def createJobTemplate(params: CreateJobTemplateRequest): Request[CreateJobTemplateResponse] = js.native
    def createPreset(params: CreatePresetRequest): Request[CreatePresetResponse] = js.native
    def createQueue(params: CreateQueueRequest): Request[CreateQueueResponse] = js.native
    def deleteJobTemplate(params: DeleteJobTemplateRequest): Request[DeleteJobTemplateResponse] = js.native
    def deletePolicy(params: DeletePolicyRequest): Request[DeletePolicyResponse] = js.native
    def deletePreset(params: DeletePresetRequest): Request[DeletePresetResponse] = js.native
    def deleteQueue(params: DeleteQueueRequest): Request[DeleteQueueResponse] = js.native
    def describeEndpoints(params: DescribeEndpointsRequest): Request[DescribeEndpointsResponse] = js.native
    def disassociateCertificate(params: DisassociateCertificateRequest): Request[DisassociateCertificateResponse] = js.native
    def getJob(params: GetJobRequest): Request[GetJobResponse] = js.native
    def getJobTemplate(params: GetJobTemplateRequest): Request[GetJobTemplateResponse] = js.native
    def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse] = js.native
    def getPreset(params: GetPresetRequest): Request[GetPresetResponse] = js.native
    def getQueue(params: GetQueueRequest): Request[GetQueueResponse] = js.native
    def listJobTemplates(params: ListJobTemplatesRequest): Request[ListJobTemplatesResponse] = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResponse] = js.native
    def listPresets(params: ListPresetsRequest): Request[ListPresetsResponse] = js.native
    def listQueues(params: ListQueuesRequest): Request[ListQueuesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putPolicy(params: PutPolicyRequest): Request[PutPolicyResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateJobTemplate(params: UpdateJobTemplateRequest): Request[UpdateJobTemplateResponse] = js.native
    def updatePreset(params: UpdatePresetRequest): Request[UpdatePresetResponse] = js.native
    def updateQueue(params: UpdateQueueRequest): Request[UpdateQueueResponse] = js.native
  }
  object MediaConvert {
    @inline implicit def toOps(service: MediaConvert): MediaConvertOps = {
      new MediaConvertOps(service)
    }
  }

  /** Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AAC. The service accepts one of two mutually exclusive groups of AAC settings--VBR and CBR. To select one of these modes, set the value of Bitrate control mode (rateControlMode) to "VBR" or "CBR". In VBR mode, you control the audio quality with the setting VBR quality (vbrQuality). In CBR mode, you use the setting Bitrate (bitrate). Defaults and valid values depend on the rate control mode.
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

  /** Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AC3.
    */
  @js.native
  trait Ac3Settings extends js.Object {
    var Bitrate: js.UndefOr[__integerMin64000Max640000]
    var BitstreamMode: js.UndefOr[Ac3BitstreamMode]
    var CodingMode: js.UndefOr[Ac3CodingMode]
    var Dialnorm: js.UndefOr[__integerMin1Max31]
    var DynamicRangeCompressionLine: js.UndefOr[Ac3DynamicRangeCompressionLine]
    var DynamicRangeCompressionProfile: js.UndefOr[Ac3DynamicRangeCompressionProfile]
    var DynamicRangeCompressionRf: js.UndefOr[Ac3DynamicRangeCompressionRf]
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
        DynamicRangeCompressionLine: js.UndefOr[Ac3DynamicRangeCompressionLine] = js.undefined,
        DynamicRangeCompressionProfile: js.UndefOr[Ac3DynamicRangeCompressionProfile] = js.undefined,
        DynamicRangeCompressionRf: js.UndefOr[Ac3DynamicRangeCompressionRf] = js.undefined,
        LfeFilter: js.UndefOr[Ac3LfeFilter] = js.undefined,
        MetadataControl: js.UndefOr[Ac3MetadataControl] = js.undefined,
        SampleRate: js.UndefOr[__integerMin48000Max48000] = js.undefined
    ): Ac3Settings = {
      val __obj = js.Dynamic.literal()
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      BitstreamMode.foreach(__v => __obj.updateDynamic("BitstreamMode")(__v.asInstanceOf[js.Any]))
      CodingMode.foreach(__v => __obj.updateDynamic("CodingMode")(__v.asInstanceOf[js.Any]))
      Dialnorm.foreach(__v => __obj.updateDynamic("Dialnorm")(__v.asInstanceOf[js.Any]))
      DynamicRangeCompressionLine.foreach(__v => __obj.updateDynamic("DynamicRangeCompressionLine")(__v.asInstanceOf[js.Any]))
      DynamicRangeCompressionProfile.foreach(__v => __obj.updateDynamic("DynamicRangeCompressionProfile")(__v.asInstanceOf[js.Any]))
      DynamicRangeCompressionRf.foreach(__v => __obj.updateDynamic("DynamicRangeCompressionRf")(__v.asInstanceOf[js.Any]))
      LfeFilter.foreach(__v => __obj.updateDynamic("LfeFilter")(__v.asInstanceOf[js.Any]))
      MetadataControl.foreach(__v => __obj.updateDynamic("MetadataControl")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Ac3Settings]
    }
  }

  /** Accelerated transcoding can significantly speed up jobs with long, visually complex content.
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

  /** Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AIFF.
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

  /** Use Allowed renditions to specify a list of possible resolutions in your ABR stack. * MediaConvert will create an ABR stack exclusively from the list of resolutions that you specify. * Some resolutions in the Allowed renditions list may not be included, however you can force a resolution to be included by setting Required to ENABLED. * You must specify at least one resolution that is greater than or equal to any resolutions that you specify in Min top rendition size or Min bottom rendition size. * If you specify Allowed renditions, you must not specify a separate rule for Force include renditions.
    */
  @js.native
  trait AllowedRenditionSize extends js.Object {
    var Height: js.UndefOr[__integerMin32Max8192]
    var Required: js.UndefOr[RequiredFlag]
    var Width: js.UndefOr[__integerMin32Max8192]
  }

  object AllowedRenditionSize {
    @inline
    def apply(
        Height: js.UndefOr[__integerMin32Max8192] = js.undefined,
        Required: js.UndefOr[RequiredFlag] = js.undefined,
        Width: js.UndefOr[__integerMin32Max8192] = js.undefined
    ): AllowedRenditionSize = {
      val __obj = js.Dynamic.literal()
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      Required.foreach(__v => __obj.updateDynamic("Required")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AllowedRenditionSize]
    }
  }

  /** Settings for ancillary captions source.
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
  trait AssociateCertificateResponse extends js.Object

  object AssociateCertificateResponse {
    @inline
    def apply(): AssociateCertificateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateCertificateResponse]
    }
  }

  /** When you mimic a multi-channel audio layout with multiple mono-channel tracks, you can tag each channel layout manually. For example, you would tag the tracks that contain your left, right, and center audio with Left (L), Right (R), and Center (C), respectively. When you don't specify a value, MediaConvert labels your track as Center (C) by default. To use audio layout tagging, your output must be in a QuickTime (.mov) container; your audio codec must be AAC, WAV, or AIFF; and you must set up your audio track to have only one channel.
    */
  @js.native
  trait AudioChannelTaggingSettings extends js.Object {
    var ChannelTag: js.UndefOr[AudioChannelTag]
  }

  object AudioChannelTaggingSettings {
    @inline
    def apply(
        ChannelTag: js.UndefOr[AudioChannelTag] = js.undefined
    ): AudioChannelTaggingSettings = {
      val __obj = js.Dynamic.literal()
      ChannelTag.foreach(__v => __obj.updateDynamic("ChannelTag")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioChannelTaggingSettings]
    }
  }

  /** Settings related to audio encoding. The settings in this group vary depending on the value that you choose for your audio codec.
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

  /** Settings related to one audio tab on the MediaConvert console. In your job JSON, an instance of AudioDescription is equivalent to one audio tab in the console. Usually, one audio tab corresponds to one output audio track. Depending on how you set up your input audio selectors and whether you use audio selector groups, one audio tab can correspond to a group of output audio tracks.
    */
  @js.native
  trait AudioDescription extends js.Object {
    var AudioChannelTaggingSettings: js.UndefOr[AudioChannelTaggingSettings]
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
        AudioChannelTaggingSettings: js.UndefOr[AudioChannelTaggingSettings] = js.undefined,
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
      AudioChannelTaggingSettings.foreach(__v => __obj.updateDynamic("AudioChannelTaggingSettings")(__v.asInstanceOf[js.Any]))
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

  /** Advanced audio normalization settings. Ignore these settings unless you need to comply with a loudness standard.
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

  /** Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use in your outputs. You can use multiple Audio selectors per input.
    */
  @js.native
  trait AudioSelector extends js.Object {
    var AudioDurationCorrection: js.UndefOr[AudioDurationCorrection]
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3]
    var DefaultSelection: js.UndefOr[AudioDefaultSelection]
    var ExternalAudioFileInput: js.UndefOr[__stringPatternS3MM2PPWWEEBBMMMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVaAAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEEAATTMMOOSSOOGGGGaAHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVaAAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEEAATTMMOOSSOOGGGGaA]
    var HlsRenditionGroupSettings: js.UndefOr[HlsRenditionGroupSettings]
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
        AudioDurationCorrection: js.UndefOr[AudioDurationCorrection] = js.undefined,
        CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined,
        DefaultSelection: js.UndefOr[AudioDefaultSelection] = js.undefined,
        ExternalAudioFileInput: js.UndefOr[__stringPatternS3MM2PPWWEEBBMMMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVaAAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEEAATTMMOOSSOOGGGGaAHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVaAAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEEAATTMMOOSSOOGGGGaA] = js.undefined,
        HlsRenditionGroupSettings: js.UndefOr[HlsRenditionGroupSettings] = js.undefined,
        LanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        Offset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        Pids: js.UndefOr[__listOf__integerMin1Max2147483647] = js.undefined,
        ProgramSelection: js.UndefOr[__integerMin0Max8] = js.undefined,
        RemixSettings: js.UndefOr[RemixSettings] = js.undefined,
        SelectorType: js.UndefOr[AudioSelectorType] = js.undefined,
        Tracks: js.UndefOr[__listOf__integerMin1Max2147483647] = js.undefined
    ): AudioSelector = {
      val __obj = js.Dynamic.literal()
      AudioDurationCorrection.foreach(__v => __obj.updateDynamic("AudioDurationCorrection")(__v.asInstanceOf[js.Any]))
      CustomLanguageCode.foreach(__v => __obj.updateDynamic("CustomLanguageCode")(__v.asInstanceOf[js.Any]))
      DefaultSelection.foreach(__v => __obj.updateDynamic("DefaultSelection")(__v.asInstanceOf[js.Any]))
      ExternalAudioFileInput.foreach(__v => __obj.updateDynamic("ExternalAudioFileInput")(__v.asInstanceOf[js.Any]))
      HlsRenditionGroupSettings.foreach(__v => __obj.updateDynamic("HlsRenditionGroupSettings")(__v.asInstanceOf[js.Any]))
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

  /** Use audio selector groups to combine multiple sidecar audio inputs so that you can assign them to a single output audio tab (AudioDescription). Note that, if you're working with embedded audio, it's simpler to assign multiple input tracks into a single audio selector rather than use an audio selector group.
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

  /** Specify one or more Automated ABR rule types. Note: Force include and Allowed renditions are mutually exclusive.
    */
  @js.native
  trait AutomatedAbrRule extends js.Object {
    var AllowedRenditions: js.UndefOr[__listOfAllowedRenditionSize]
    var ForceIncludeRenditions: js.UndefOr[__listOfForceIncludeRenditionSize]
    var MinBottomRenditionSize: js.UndefOr[MinBottomRenditionSize]
    var MinTopRenditionSize: js.UndefOr[MinTopRenditionSize]
    var Type: js.UndefOr[RuleType]
  }

  object AutomatedAbrRule {
    @inline
    def apply(
        AllowedRenditions: js.UndefOr[__listOfAllowedRenditionSize] = js.undefined,
        ForceIncludeRenditions: js.UndefOr[__listOfForceIncludeRenditionSize] = js.undefined,
        MinBottomRenditionSize: js.UndefOr[MinBottomRenditionSize] = js.undefined,
        MinTopRenditionSize: js.UndefOr[MinTopRenditionSize] = js.undefined,
        Type: js.UndefOr[RuleType] = js.undefined
    ): AutomatedAbrRule = {
      val __obj = js.Dynamic.literal()
      AllowedRenditions.foreach(__v => __obj.updateDynamic("AllowedRenditions")(__v.asInstanceOf[js.Any]))
      ForceIncludeRenditions.foreach(__v => __obj.updateDynamic("ForceIncludeRenditions")(__v.asInstanceOf[js.Any]))
      MinBottomRenditionSize.foreach(__v => __obj.updateDynamic("MinBottomRenditionSize")(__v.asInstanceOf[js.Any]))
      MinTopRenditionSize.foreach(__v => __obj.updateDynamic("MinTopRenditionSize")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutomatedAbrRule]
    }
  }

  /** Use automated ABR to have MediaConvert set up the renditions in your ABR package for you automatically, based on characteristics of your input video. This feature optimizes video quality while minimizing the overall size of your ABR package.
    */
  @js.native
  trait AutomatedAbrSettings extends js.Object {
    var MaxAbrBitrate: js.UndefOr[__integerMin100000Max100000000]
    var MaxRenditions: js.UndefOr[__integerMin3Max15]
    var MinAbrBitrate: js.UndefOr[__integerMin100000Max100000000]
    var Rules: js.UndefOr[__listOfAutomatedAbrRule]
  }

  object AutomatedAbrSettings {
    @inline
    def apply(
        MaxAbrBitrate: js.UndefOr[__integerMin100000Max100000000] = js.undefined,
        MaxRenditions: js.UndefOr[__integerMin3Max15] = js.undefined,
        MinAbrBitrate: js.UndefOr[__integerMin100000Max100000000] = js.undefined,
        Rules: js.UndefOr[__listOfAutomatedAbrRule] = js.undefined
    ): AutomatedAbrSettings = {
      val __obj = js.Dynamic.literal()
      MaxAbrBitrate.foreach(__v => __obj.updateDynamic("MaxAbrBitrate")(__v.asInstanceOf[js.Any]))
      MaxRenditions.foreach(__v => __obj.updateDynamic("MaxRenditions")(__v.asInstanceOf[js.Any]))
      MinAbrBitrate.foreach(__v => __obj.updateDynamic("MinAbrBitrate")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutomatedAbrSettings]
    }
  }

  /** Use automated encoding to have MediaConvert choose your encoding settings for you, based on characteristics of your input video.
    */
  @js.native
  trait AutomatedEncodingSettings extends js.Object {
    var AbrSettings: js.UndefOr[AutomatedAbrSettings]
  }

  object AutomatedEncodingSettings {
    @inline
    def apply(
        AbrSettings: js.UndefOr[AutomatedAbrSettings] = js.undefined
    ): AutomatedEncodingSettings = {
      val __obj = js.Dynamic.literal()
      AbrSettings.foreach(__v => __obj.updateDynamic("AbrSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutomatedEncodingSettings]
    }
  }

  /** Settings for quality-defined variable bitrate encoding with the AV1 codec. Use these settings only when you set QVBR for Rate control mode (RateControlMode).
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

  /** Required when you set Codec, under VideoDescription>CodecSettings to the value AV1.
    */
  @js.native
  trait Av1Settings extends js.Object {
    var AdaptiveQuantization: js.UndefOr[Av1AdaptiveQuantization]
    var BitDepth: js.UndefOr[Av1BitDepth]
    var FramerateControl: js.UndefOr[Av1FramerateControl]
    var FramerateConversionAlgorithm: js.UndefOr[Av1FramerateConversionAlgorithm]
    var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647]
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647]
    var GopSize: js.UndefOr[__doubleMin0]
    var MaxBitrate: js.UndefOr[__integerMin1000Max1152000000]
    var NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin0Max15]
    var QvbrSettings: js.UndefOr[Av1QvbrSettings]
    var RateControlMode: js.UndefOr[Av1RateControlMode]
    var Slices: js.UndefOr[__integerMin1Max32]
    var SpatialAdaptiveQuantization: js.UndefOr[Av1SpatialAdaptiveQuantization]
  }

  object Av1Settings {
    @inline
    def apply(
        AdaptiveQuantization: js.UndefOr[Av1AdaptiveQuantization] = js.undefined,
        BitDepth: js.UndefOr[Av1BitDepth] = js.undefined,
        FramerateControl: js.UndefOr[Av1FramerateControl] = js.undefined,
        FramerateConversionAlgorithm: js.UndefOr[Av1FramerateConversionAlgorithm] = js.undefined,
        FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        GopSize: js.UndefOr[__doubleMin0] = js.undefined,
        MaxBitrate: js.UndefOr[__integerMin1000Max1152000000] = js.undefined,
        NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin0Max15] = js.undefined,
        QvbrSettings: js.UndefOr[Av1QvbrSettings] = js.undefined,
        RateControlMode: js.UndefOr[Av1RateControlMode] = js.undefined,
        Slices: js.UndefOr[__integerMin1Max32] = js.undefined,
        SpatialAdaptiveQuantization: js.UndefOr[Av1SpatialAdaptiveQuantization] = js.undefined
    ): Av1Settings = {
      val __obj = js.Dynamic.literal()
      AdaptiveQuantization.foreach(__v => __obj.updateDynamic("AdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      BitDepth.foreach(__v => __obj.updateDynamic("BitDepth")(__v.asInstanceOf[js.Any]))
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

  /** Use ad avail blanking settings to specify your output content during SCTE-35 triggered ad avails. You can blank your video or overlay it with an image. MediaConvert also removes any audio and embedded captions during the ad avail. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/ad-avail-blanking.html.
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

  /** Required when you choose AVC-Intra for your output video codec. For more information about the AVC-Intra settings, see the relevant specification. For detailed information about SD and HD in AVC-Intra, see https://ieeexplore.ieee.org/document/7290936. For information about 4K/2K in AVC-Intra, see https://pro-av.panasonic.net/en/avc-ultra/AVC-ULTRAoverview.pdf.
    */
  @js.native
  trait AvcIntraSettings extends js.Object {
    var AvcIntraClass: js.UndefOr[AvcIntraClass]
    var AvcIntraUhdSettings: js.UndefOr[AvcIntraUhdSettings]
    var FramerateControl: js.UndefOr[AvcIntraFramerateControl]
    var FramerateConversionAlgorithm: js.UndefOr[AvcIntraFramerateConversionAlgorithm]
    var FramerateDenominator: js.UndefOr[__integerMin1Max1001]
    var FramerateNumerator: js.UndefOr[__integerMin24Max60000]
    var InterlaceMode: js.UndefOr[AvcIntraInterlaceMode]
    var ScanTypeConversionMode: js.UndefOr[AvcIntraScanTypeConversionMode]
    var SlowPal: js.UndefOr[AvcIntraSlowPal]
    var Telecine: js.UndefOr[AvcIntraTelecine]
  }

  object AvcIntraSettings {
    @inline
    def apply(
        AvcIntraClass: js.UndefOr[AvcIntraClass] = js.undefined,
        AvcIntraUhdSettings: js.UndefOr[AvcIntraUhdSettings] = js.undefined,
        FramerateControl: js.UndefOr[AvcIntraFramerateControl] = js.undefined,
        FramerateConversionAlgorithm: js.UndefOr[AvcIntraFramerateConversionAlgorithm] = js.undefined,
        FramerateDenominator: js.UndefOr[__integerMin1Max1001] = js.undefined,
        FramerateNumerator: js.UndefOr[__integerMin24Max60000] = js.undefined,
        InterlaceMode: js.UndefOr[AvcIntraInterlaceMode] = js.undefined,
        ScanTypeConversionMode: js.UndefOr[AvcIntraScanTypeConversionMode] = js.undefined,
        SlowPal: js.UndefOr[AvcIntraSlowPal] = js.undefined,
        Telecine: js.UndefOr[AvcIntraTelecine] = js.undefined
    ): AvcIntraSettings = {
      val __obj = js.Dynamic.literal()
      AvcIntraClass.foreach(__v => __obj.updateDynamic("AvcIntraClass")(__v.asInstanceOf[js.Any]))
      AvcIntraUhdSettings.foreach(__v => __obj.updateDynamic("AvcIntraUhdSettings")(__v.asInstanceOf[js.Any]))
      FramerateControl.foreach(__v => __obj.updateDynamic("FramerateControl")(__v.asInstanceOf[js.Any]))
      FramerateConversionAlgorithm.foreach(__v => __obj.updateDynamic("FramerateConversionAlgorithm")(__v.asInstanceOf[js.Any]))
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      InterlaceMode.foreach(__v => __obj.updateDynamic("InterlaceMode")(__v.asInstanceOf[js.Any]))
      ScanTypeConversionMode.foreach(__v => __obj.updateDynamic("ScanTypeConversionMode")(__v.asInstanceOf[js.Any]))
      SlowPal.foreach(__v => __obj.updateDynamic("SlowPal")(__v.asInstanceOf[js.Any]))
      Telecine.foreach(__v => __obj.updateDynamic("Telecine")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvcIntraSettings]
    }
  }

  /** Optional when you set AVC-Intra class (avcIntraClass) to Class 4K/2K (CLASS_4K_2K). When you set AVC-Intra class to a different value, this object isn't allowed.
    */
  @js.native
  trait AvcIntraUhdSettings extends js.Object {
    var QualityTuningLevel: js.UndefOr[AvcIntraUhdQualityTuningLevel]
  }

  object AvcIntraUhdSettings {
    @inline
    def apply(
        QualityTuningLevel: js.UndefOr[AvcIntraUhdQualityTuningLevel] = js.undefined
    ): AvcIntraUhdSettings = {
      val __obj = js.Dynamic.literal()
      QualityTuningLevel.foreach(__v => __obj.updateDynamic("QualityTuningLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvcIntraUhdSettings]
    }
  }

  /** Burn-in is a captions delivery method, rather than a captions format. Burn-in writes the captions directly on your video frames, replacing pixels of video content with the captions. Set up burn-in captions in the same output as your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/burn-in-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to BURN_IN.
    */
  @js.native
  trait BurninDestinationSettings extends js.Object {
    var Alignment: js.UndefOr[BurninSubtitleAlignment]
    var ApplyFontColor: js.UndefOr[BurninSubtitleApplyFontColor]
    var BackgroundColor: js.UndefOr[BurninSubtitleBackgroundColor]
    var BackgroundOpacity: js.UndefOr[__integerMin0Max255]
    var FallbackFont: js.UndefOr[BurninSubtitleFallbackFont]
    var FontColor: js.UndefOr[BurninSubtitleFontColor]
    var FontOpacity: js.UndefOr[__integerMin0Max255]
    var FontResolution: js.UndefOr[__integerMin96Max600]
    var FontScript: js.UndefOr[FontScript]
    var FontSize: js.UndefOr[__integerMin0Max96]
    var HexFontColor: js.UndefOr[__stringMin6Max8Pattern09aFAF609aFAF2]
    var OutlineColor: js.UndefOr[BurninSubtitleOutlineColor]
    var OutlineSize: js.UndefOr[__integerMin0Max10]
    var ShadowColor: js.UndefOr[BurninSubtitleShadowColor]
    var ShadowOpacity: js.UndefOr[__integerMin0Max255]
    var ShadowXOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var ShadowYOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var StylePassthrough: js.UndefOr[BurnInSubtitleStylePassthrough]
    var TeletextSpacing: js.UndefOr[BurninSubtitleTeletextSpacing]
    var XPosition: js.UndefOr[__integerMin0Max2147483647]
    var YPosition: js.UndefOr[__integerMin0Max2147483647]
  }

  object BurninDestinationSettings {
    @inline
    def apply(
        Alignment: js.UndefOr[BurninSubtitleAlignment] = js.undefined,
        ApplyFontColor: js.UndefOr[BurninSubtitleApplyFontColor] = js.undefined,
        BackgroundColor: js.UndefOr[BurninSubtitleBackgroundColor] = js.undefined,
        BackgroundOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        FallbackFont: js.UndefOr[BurninSubtitleFallbackFont] = js.undefined,
        FontColor: js.UndefOr[BurninSubtitleFontColor] = js.undefined,
        FontOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        FontResolution: js.UndefOr[__integerMin96Max600] = js.undefined,
        FontScript: js.UndefOr[FontScript] = js.undefined,
        FontSize: js.UndefOr[__integerMin0Max96] = js.undefined,
        HexFontColor: js.UndefOr[__stringMin6Max8Pattern09aFAF609aFAF2] = js.undefined,
        OutlineColor: js.UndefOr[BurninSubtitleOutlineColor] = js.undefined,
        OutlineSize: js.UndefOr[__integerMin0Max10] = js.undefined,
        ShadowColor: js.UndefOr[BurninSubtitleShadowColor] = js.undefined,
        ShadowOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        ShadowXOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        ShadowYOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        StylePassthrough: js.UndefOr[BurnInSubtitleStylePassthrough] = js.undefined,
        TeletextSpacing: js.UndefOr[BurninSubtitleTeletextSpacing] = js.undefined,
        XPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        YPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    ): BurninDestinationSettings = {
      val __obj = js.Dynamic.literal()
      Alignment.foreach(__v => __obj.updateDynamic("Alignment")(__v.asInstanceOf[js.Any]))
      ApplyFontColor.foreach(__v => __obj.updateDynamic("ApplyFontColor")(__v.asInstanceOf[js.Any]))
      BackgroundColor.foreach(__v => __obj.updateDynamic("BackgroundColor")(__v.asInstanceOf[js.Any]))
      BackgroundOpacity.foreach(__v => __obj.updateDynamic("BackgroundOpacity")(__v.asInstanceOf[js.Any]))
      FallbackFont.foreach(__v => __obj.updateDynamic("FallbackFont")(__v.asInstanceOf[js.Any]))
      FontColor.foreach(__v => __obj.updateDynamic("FontColor")(__v.asInstanceOf[js.Any]))
      FontOpacity.foreach(__v => __obj.updateDynamic("FontOpacity")(__v.asInstanceOf[js.Any]))
      FontResolution.foreach(__v => __obj.updateDynamic("FontResolution")(__v.asInstanceOf[js.Any]))
      FontScript.foreach(__v => __obj.updateDynamic("FontScript")(__v.asInstanceOf[js.Any]))
      FontSize.foreach(__v => __obj.updateDynamic("FontSize")(__v.asInstanceOf[js.Any]))
      HexFontColor.foreach(__v => __obj.updateDynamic("HexFontColor")(__v.asInstanceOf[js.Any]))
      OutlineColor.foreach(__v => __obj.updateDynamic("OutlineColor")(__v.asInstanceOf[js.Any]))
      OutlineSize.foreach(__v => __obj.updateDynamic("OutlineSize")(__v.asInstanceOf[js.Any]))
      ShadowColor.foreach(__v => __obj.updateDynamic("ShadowColor")(__v.asInstanceOf[js.Any]))
      ShadowOpacity.foreach(__v => __obj.updateDynamic("ShadowOpacity")(__v.asInstanceOf[js.Any]))
      ShadowXOffset.foreach(__v => __obj.updateDynamic("ShadowXOffset")(__v.asInstanceOf[js.Any]))
      ShadowYOffset.foreach(__v => __obj.updateDynamic("ShadowYOffset")(__v.asInstanceOf[js.Any]))
      StylePassthrough.foreach(__v => __obj.updateDynamic("StylePassthrough")(__v.asInstanceOf[js.Any]))
      TeletextSpacing.foreach(__v => __obj.updateDynamic("TeletextSpacing")(__v.asInstanceOf[js.Any]))
      XPosition.foreach(__v => __obj.updateDynamic("XPosition")(__v.asInstanceOf[js.Any]))
      YPosition.foreach(__v => __obj.updateDynamic("YPosition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BurninDestinationSettings]
    }
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
  trait CancelJobResponse extends js.Object

  object CancelJobResponse {
    @inline
    def apply(): CancelJobResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelJobResponse]
    }
  }

  /** This object holds groups of settings related to captions for one output. For each output that has captions, include one instance of CaptionDescriptions.
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

  /** Caption Description for preset
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

  /** Settings related to one captions tab on the MediaConvert console. In your job JSON, an instance of captions DestinationSettings is equivalent to one captions tab in the console. Usually, one captions tab corresponds to one output captions track. Depending on your output captions format, one tab might correspond to a set of output captions tracks. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/including-captions.html.
    */
  @js.native
  trait CaptionDestinationSettings extends js.Object {
    var BurninDestinationSettings: js.UndefOr[BurninDestinationSettings]
    var DestinationType: js.UndefOr[CaptionDestinationType]
    var DvbSubDestinationSettings: js.UndefOr[DvbSubDestinationSettings]
    var EmbeddedDestinationSettings: js.UndefOr[EmbeddedDestinationSettings]
    var ImscDestinationSettings: js.UndefOr[ImscDestinationSettings]
    var SccDestinationSettings: js.UndefOr[SccDestinationSettings]
    var SrtDestinationSettings: js.UndefOr[SrtDestinationSettings]
    var TeletextDestinationSettings: js.UndefOr[TeletextDestinationSettings]
    var TtmlDestinationSettings: js.UndefOr[TtmlDestinationSettings]
    var WebvttDestinationSettings: js.UndefOr[WebvttDestinationSettings]
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
        SrtDestinationSettings: js.UndefOr[SrtDestinationSettings] = js.undefined,
        TeletextDestinationSettings: js.UndefOr[TeletextDestinationSettings] = js.undefined,
        TtmlDestinationSettings: js.UndefOr[TtmlDestinationSettings] = js.undefined,
        WebvttDestinationSettings: js.UndefOr[WebvttDestinationSettings] = js.undefined
    ): CaptionDestinationSettings = {
      val __obj = js.Dynamic.literal()
      BurninDestinationSettings.foreach(__v => __obj.updateDynamic("BurninDestinationSettings")(__v.asInstanceOf[js.Any]))
      DestinationType.foreach(__v => __obj.updateDynamic("DestinationType")(__v.asInstanceOf[js.Any]))
      DvbSubDestinationSettings.foreach(__v => __obj.updateDynamic("DvbSubDestinationSettings")(__v.asInstanceOf[js.Any]))
      EmbeddedDestinationSettings.foreach(__v => __obj.updateDynamic("EmbeddedDestinationSettings")(__v.asInstanceOf[js.Any]))
      ImscDestinationSettings.foreach(__v => __obj.updateDynamic("ImscDestinationSettings")(__v.asInstanceOf[js.Any]))
      SccDestinationSettings.foreach(__v => __obj.updateDynamic("SccDestinationSettings")(__v.asInstanceOf[js.Any]))
      SrtDestinationSettings.foreach(__v => __obj.updateDynamic("SrtDestinationSettings")(__v.asInstanceOf[js.Any]))
      TeletextDestinationSettings.foreach(__v => __obj.updateDynamic("TeletextDestinationSettings")(__v.asInstanceOf[js.Any]))
      TtmlDestinationSettings.foreach(__v => __obj.updateDynamic("TtmlDestinationSettings")(__v.asInstanceOf[js.Any]))
      WebvttDestinationSettings.foreach(__v => __obj.updateDynamic("WebvttDestinationSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptionDestinationSettings]
    }
  }

  /** Use captions selectors to specify the captions data from your input that you use in your outputs. You can use up to 20 captions selectors per input.
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

  /** Ignore this setting unless your input captions format is SCC. To have the service compensate for differing frame rates between your input captions and input video, specify the frame rate of the captions file. Specify this value as a fraction. When you work directly in your JSON job specification, use the settings framerateNumerator and framerateDenominator. For example, you might specify 24 / 1 for 24 fps, 25 / 1 for 25 fps, 24000 / 1001 for 23.976 fps, or 30000 / 1001 for 29.97 fps.
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

  /** If your input captions are SCC, TTML, STL, SMI, SRT, or IMSC in an xml file, specify the URI of the input captions source file. If your input captions are IMSC in an IMF package, use TrackSourceSettings instead of FileSoureSettings.
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
    var WebvttHlsSourceSettings: js.UndefOr[WebvttHlsSourceSettings]
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
        TrackSourceSettings: js.UndefOr[TrackSourceSettings] = js.undefined,
        WebvttHlsSourceSettings: js.UndefOr[WebvttHlsSourceSettings] = js.undefined
    ): CaptionSourceSettings = {
      val __obj = js.Dynamic.literal()
      AncillarySourceSettings.foreach(__v => __obj.updateDynamic("AncillarySourceSettings")(__v.asInstanceOf[js.Any]))
      DvbSubSourceSettings.foreach(__v => __obj.updateDynamic("DvbSubSourceSettings")(__v.asInstanceOf[js.Any]))
      EmbeddedSourceSettings.foreach(__v => __obj.updateDynamic("EmbeddedSourceSettings")(__v.asInstanceOf[js.Any]))
      FileSourceSettings.foreach(__v => __obj.updateDynamic("FileSourceSettings")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      TeletextSourceSettings.foreach(__v => __obj.updateDynamic("TeletextSourceSettings")(__v.asInstanceOf[js.Any]))
      TrackSourceSettings.foreach(__v => __obj.updateDynamic("TrackSourceSettings")(__v.asInstanceOf[js.Any]))
      WebvttHlsSourceSettings.foreach(__v => __obj.updateDynamic("WebvttHlsSourceSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptionSourceSettings]
    }
  }

  /** Channel mapping (ChannelMapping) contains the group of fields that hold the remixing value for each channel, in dB. Specify remix values to indicate how much of the content from your input audio channel you want in your output audio channels. Each instance of the InputChannels or InputChannelsFineTune array specifies these values for one output channel. Use one instance of this array for each output channel. In the console, each array corresponds to a column in the graphical depiction of the mapping matrix. The rows of the graphical matrix correspond to input channels. Valid values are within the range from -60 (mute) through 6. A setting of 0 passes the input channel unchanged to the output channel (no attenuation or amplification). Use InputChannels or InputChannelsFineTune to specify your remix values. Don't use both.
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

  /** Specify the details for each pair of HLS and DASH additional manifests that you want the service to generate for this CMAF output group. Each pair of manifests can reference a different subset of outputs in the group.
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

  /** Settings for CMAF encryption
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

  /** Settings related to your CMAF output package. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/outputs-file-ABR.html. When you work directly in your JSON job specification, include this object and any required children when you set Type, under OutputGroupSettings, to CMAF_GROUP_SETTINGS.
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
    var ImageBasedTrickPlay: js.UndefOr[CmafImageBasedTrickPlay]
    var ImageBasedTrickPlaySettings: js.UndefOr[CmafImageBasedTrickPlaySettings]
    var ManifestCompression: js.UndefOr[CmafManifestCompression]
    var ManifestDurationFormat: js.UndefOr[CmafManifestDurationFormat]
    var MinBufferTime: js.UndefOr[__integerMin0Max2147483647]
    var MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647]
    var MpdManifestBandwidthType: js.UndefOr[CmafMpdManifestBandwidthType]
    var MpdProfile: js.UndefOr[CmafMpdProfile]
    var PtsOffsetHandlingForBFrames: js.UndefOr[CmafPtsOffsetHandlingForBFrames]
    var SegmentControl: js.UndefOr[CmafSegmentControl]
    var SegmentLength: js.UndefOr[__integerMin1Max2147483647]
    var SegmentLengthControl: js.UndefOr[CmafSegmentLengthControl]
    var StreamInfResolution: js.UndefOr[CmafStreamInfResolution]
    var TargetDurationCompatibilityMode: js.UndefOr[CmafTargetDurationCompatibilityMode]
    var VideoCompositionOffsets: js.UndefOr[CmafVideoCompositionOffsets]
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
        ImageBasedTrickPlay: js.UndefOr[CmafImageBasedTrickPlay] = js.undefined,
        ImageBasedTrickPlaySettings: js.UndefOr[CmafImageBasedTrickPlaySettings] = js.undefined,
        ManifestCompression: js.UndefOr[CmafManifestCompression] = js.undefined,
        ManifestDurationFormat: js.UndefOr[CmafManifestDurationFormat] = js.undefined,
        MinBufferTime: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647] = js.undefined,
        MpdManifestBandwidthType: js.UndefOr[CmafMpdManifestBandwidthType] = js.undefined,
        MpdProfile: js.UndefOr[CmafMpdProfile] = js.undefined,
        PtsOffsetHandlingForBFrames: js.UndefOr[CmafPtsOffsetHandlingForBFrames] = js.undefined,
        SegmentControl: js.UndefOr[CmafSegmentControl] = js.undefined,
        SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        SegmentLengthControl: js.UndefOr[CmafSegmentLengthControl] = js.undefined,
        StreamInfResolution: js.UndefOr[CmafStreamInfResolution] = js.undefined,
        TargetDurationCompatibilityMode: js.UndefOr[CmafTargetDurationCompatibilityMode] = js.undefined,
        VideoCompositionOffsets: js.UndefOr[CmafVideoCompositionOffsets] = js.undefined,
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
      ImageBasedTrickPlay.foreach(__v => __obj.updateDynamic("ImageBasedTrickPlay")(__v.asInstanceOf[js.Any]))
      ImageBasedTrickPlaySettings.foreach(__v => __obj.updateDynamic("ImageBasedTrickPlaySettings")(__v.asInstanceOf[js.Any]))
      ManifestCompression.foreach(__v => __obj.updateDynamic("ManifestCompression")(__v.asInstanceOf[js.Any]))
      ManifestDurationFormat.foreach(__v => __obj.updateDynamic("ManifestDurationFormat")(__v.asInstanceOf[js.Any]))
      MinBufferTime.foreach(__v => __obj.updateDynamic("MinBufferTime")(__v.asInstanceOf[js.Any]))
      MinFinalSegmentLength.foreach(__v => __obj.updateDynamic("MinFinalSegmentLength")(__v.asInstanceOf[js.Any]))
      MpdManifestBandwidthType.foreach(__v => __obj.updateDynamic("MpdManifestBandwidthType")(__v.asInstanceOf[js.Any]))
      MpdProfile.foreach(__v => __obj.updateDynamic("MpdProfile")(__v.asInstanceOf[js.Any]))
      PtsOffsetHandlingForBFrames.foreach(__v => __obj.updateDynamic("PtsOffsetHandlingForBFrames")(__v.asInstanceOf[js.Any]))
      SegmentControl.foreach(__v => __obj.updateDynamic("SegmentControl")(__v.asInstanceOf[js.Any]))
      SegmentLength.foreach(__v => __obj.updateDynamic("SegmentLength")(__v.asInstanceOf[js.Any]))
      SegmentLengthControl.foreach(__v => __obj.updateDynamic("SegmentLengthControl")(__v.asInstanceOf[js.Any]))
      StreamInfResolution.foreach(__v => __obj.updateDynamic("StreamInfResolution")(__v.asInstanceOf[js.Any]))
      TargetDurationCompatibilityMode.foreach(__v => __obj.updateDynamic("TargetDurationCompatibilityMode")(__v.asInstanceOf[js.Any]))
      VideoCompositionOffsets.foreach(__v => __obj.updateDynamic("VideoCompositionOffsets")(__v.asInstanceOf[js.Any]))
      WriteDashManifest.foreach(__v => __obj.updateDynamic("WriteDashManifest")(__v.asInstanceOf[js.Any]))
      WriteHlsManifest.foreach(__v => __obj.updateDynamic("WriteHlsManifest")(__v.asInstanceOf[js.Any]))
      WriteSegmentTimelineInRepresentation.foreach(__v => __obj.updateDynamic("WriteSegmentTimelineInRepresentation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CmafGroupSettings]
    }
  }

  /** Tile and thumbnail settings applicable when imageBasedTrickPlay is ADVANCED
    */
  @js.native
  trait CmafImageBasedTrickPlaySettings extends js.Object {
    var IntervalCadence: js.UndefOr[CmafIntervalCadence]
    var ThumbnailHeight: js.UndefOr[__integerMin2Max4096]
    var ThumbnailInterval: js.UndefOr[__doubleMin0Max2147483647]
    var ThumbnailWidth: js.UndefOr[__integerMin8Max4096]
    var TileHeight: js.UndefOr[__integerMin1Max2048]
    var TileWidth: js.UndefOr[__integerMin1Max512]
  }

  object CmafImageBasedTrickPlaySettings {
    @inline
    def apply(
        IntervalCadence: js.UndefOr[CmafIntervalCadence] = js.undefined,
        ThumbnailHeight: js.UndefOr[__integerMin2Max4096] = js.undefined,
        ThumbnailInterval: js.UndefOr[__doubleMin0Max2147483647] = js.undefined,
        ThumbnailWidth: js.UndefOr[__integerMin8Max4096] = js.undefined,
        TileHeight: js.UndefOr[__integerMin1Max2048] = js.undefined,
        TileWidth: js.UndefOr[__integerMin1Max512] = js.undefined
    ): CmafImageBasedTrickPlaySettings = {
      val __obj = js.Dynamic.literal()
      IntervalCadence.foreach(__v => __obj.updateDynamic("IntervalCadence")(__v.asInstanceOf[js.Any]))
      ThumbnailHeight.foreach(__v => __obj.updateDynamic("ThumbnailHeight")(__v.asInstanceOf[js.Any]))
      ThumbnailInterval.foreach(__v => __obj.updateDynamic("ThumbnailInterval")(__v.asInstanceOf[js.Any]))
      ThumbnailWidth.foreach(__v => __obj.updateDynamic("ThumbnailWidth")(__v.asInstanceOf[js.Any]))
      TileHeight.foreach(__v => __obj.updateDynamic("TileHeight")(__v.asInstanceOf[js.Any]))
      TileWidth.foreach(__v => __obj.updateDynamic("TileWidth")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CmafImageBasedTrickPlaySettings]
    }
  }

  /** These settings relate to the fragmented MP4 container for the segments in your CMAF outputs.
    */
  @js.native
  trait CmfcSettings extends js.Object {
    var AudioDuration: js.UndefOr[CmfcAudioDuration]
    var AudioGroupId: js.UndefOr[__string]
    var AudioRenditionSets: js.UndefOr[__string]
    var AudioTrackType: js.UndefOr[CmfcAudioTrackType]
    var DescriptiveVideoServiceFlag: js.UndefOr[CmfcDescriptiveVideoServiceFlag]
    var IFrameOnlyManifest: js.UndefOr[CmfcIFrameOnlyManifest]
    var KlvMetadata: js.UndefOr[CmfcKlvMetadata]
    var ManifestMetadataSignaling: js.UndefOr[CmfcManifestMetadataSignaling]
    var Scte35Esam: js.UndefOr[CmfcScte35Esam]
    var Scte35Source: js.UndefOr[CmfcScte35Source]
    var TimedMetadata: js.UndefOr[CmfcTimedMetadata]
    var TimedMetadataBoxVersion: js.UndefOr[CmfcTimedMetadataBoxVersion]
    var TimedMetadataSchemeIdUri: js.UndefOr[__stringMax1000]
    var TimedMetadataValue: js.UndefOr[__stringMax1000]
  }

  object CmfcSettings {
    @inline
    def apply(
        AudioDuration: js.UndefOr[CmfcAudioDuration] = js.undefined,
        AudioGroupId: js.UndefOr[__string] = js.undefined,
        AudioRenditionSets: js.UndefOr[__string] = js.undefined,
        AudioTrackType: js.UndefOr[CmfcAudioTrackType] = js.undefined,
        DescriptiveVideoServiceFlag: js.UndefOr[CmfcDescriptiveVideoServiceFlag] = js.undefined,
        IFrameOnlyManifest: js.UndefOr[CmfcIFrameOnlyManifest] = js.undefined,
        KlvMetadata: js.UndefOr[CmfcKlvMetadata] = js.undefined,
        ManifestMetadataSignaling: js.UndefOr[CmfcManifestMetadataSignaling] = js.undefined,
        Scte35Esam: js.UndefOr[CmfcScte35Esam] = js.undefined,
        Scte35Source: js.UndefOr[CmfcScte35Source] = js.undefined,
        TimedMetadata: js.UndefOr[CmfcTimedMetadata] = js.undefined,
        TimedMetadataBoxVersion: js.UndefOr[CmfcTimedMetadataBoxVersion] = js.undefined,
        TimedMetadataSchemeIdUri: js.UndefOr[__stringMax1000] = js.undefined,
        TimedMetadataValue: js.UndefOr[__stringMax1000] = js.undefined
    ): CmfcSettings = {
      val __obj = js.Dynamic.literal()
      AudioDuration.foreach(__v => __obj.updateDynamic("AudioDuration")(__v.asInstanceOf[js.Any]))
      AudioGroupId.foreach(__v => __obj.updateDynamic("AudioGroupId")(__v.asInstanceOf[js.Any]))
      AudioRenditionSets.foreach(__v => __obj.updateDynamic("AudioRenditionSets")(__v.asInstanceOf[js.Any]))
      AudioTrackType.foreach(__v => __obj.updateDynamic("AudioTrackType")(__v.asInstanceOf[js.Any]))
      DescriptiveVideoServiceFlag.foreach(__v => __obj.updateDynamic("DescriptiveVideoServiceFlag")(__v.asInstanceOf[js.Any]))
      IFrameOnlyManifest.foreach(__v => __obj.updateDynamic("IFrameOnlyManifest")(__v.asInstanceOf[js.Any]))
      KlvMetadata.foreach(__v => __obj.updateDynamic("KlvMetadata")(__v.asInstanceOf[js.Any]))
      ManifestMetadataSignaling.foreach(__v => __obj.updateDynamic("ManifestMetadataSignaling")(__v.asInstanceOf[js.Any]))
      Scte35Esam.foreach(__v => __obj.updateDynamic("Scte35Esam")(__v.asInstanceOf[js.Any]))
      Scte35Source.foreach(__v => __obj.updateDynamic("Scte35Source")(__v.asInstanceOf[js.Any]))
      TimedMetadata.foreach(__v => __obj.updateDynamic("TimedMetadata")(__v.asInstanceOf[js.Any]))
      TimedMetadataBoxVersion.foreach(__v => __obj.updateDynamic("TimedMetadataBoxVersion")(__v.asInstanceOf[js.Any]))
      TimedMetadataSchemeIdUri.foreach(__v => __obj.updateDynamic("TimedMetadataSchemeIdUri")(__v.asInstanceOf[js.Any]))
      TimedMetadataValue.foreach(__v => __obj.updateDynamic("TimedMetadataValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CmfcSettings]
    }
  }

  /** Settings for color correction.
    */
  @js.native
  trait ColorCorrector extends js.Object {
    var Brightness: js.UndefOr[__integerMin1Max100]
    var ColorSpaceConversion: js.UndefOr[ColorSpaceConversion]
    var Contrast: js.UndefOr[__integerMin1Max100]
    var Hdr10Metadata: js.UndefOr[Hdr10Metadata]
    var Hue: js.UndefOr[__integerMinNegative180Max180]
    var SampleRangeConversion: js.UndefOr[SampleRangeConversion]
    var Saturation: js.UndefOr[__integerMin1Max100]
    var SdrReferenceWhiteLevel: js.UndefOr[__integerMin100Max1000]
  }

  object ColorCorrector {
    @inline
    def apply(
        Brightness: js.UndefOr[__integerMin1Max100] = js.undefined,
        ColorSpaceConversion: js.UndefOr[ColorSpaceConversion] = js.undefined,
        Contrast: js.UndefOr[__integerMin1Max100] = js.undefined,
        Hdr10Metadata: js.UndefOr[Hdr10Metadata] = js.undefined,
        Hue: js.UndefOr[__integerMinNegative180Max180] = js.undefined,
        SampleRangeConversion: js.UndefOr[SampleRangeConversion] = js.undefined,
        Saturation: js.UndefOr[__integerMin1Max100] = js.undefined,
        SdrReferenceWhiteLevel: js.UndefOr[__integerMin100Max1000] = js.undefined
    ): ColorCorrector = {
      val __obj = js.Dynamic.literal()
      Brightness.foreach(__v => __obj.updateDynamic("Brightness")(__v.asInstanceOf[js.Any]))
      ColorSpaceConversion.foreach(__v => __obj.updateDynamic("ColorSpaceConversion")(__v.asInstanceOf[js.Any]))
      Contrast.foreach(__v => __obj.updateDynamic("Contrast")(__v.asInstanceOf[js.Any]))
      Hdr10Metadata.foreach(__v => __obj.updateDynamic("Hdr10Metadata")(__v.asInstanceOf[js.Any]))
      Hue.foreach(__v => __obj.updateDynamic("Hue")(__v.asInstanceOf[js.Any]))
      SampleRangeConversion.foreach(__v => __obj.updateDynamic("SampleRangeConversion")(__v.asInstanceOf[js.Any]))
      Saturation.foreach(__v => __obj.updateDynamic("Saturation")(__v.asInstanceOf[js.Any]))
      SdrReferenceWhiteLevel.foreach(__v => __obj.updateDynamic("SdrReferenceWhiteLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColorCorrector]
    }
  }

  /** Container specific settings.
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

  /** Specify the details for each additional DASH manifest that you want the service to generate for this output group. Each manifest can reference a different subset of outputs in the group.
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

  /** Specifies DRM settings for DASH outputs.
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

  /** Settings related to your DASH output package. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/outputs-file-ABR.html. When you work directly in your JSON job specification, include this object and any required children when you set Type, under OutputGroupSettings, to DASH_ISO_GROUP_SETTINGS.
    */
  @js.native
  trait DashIsoGroupSettings extends js.Object {
    var AdditionalManifests: js.UndefOr[__listOfDashAdditionalManifest]
    var AudioChannelConfigSchemeIdUri: js.UndefOr[DashIsoGroupAudioChannelConfigSchemeIdUri]
    var BaseUrl: js.UndefOr[__string]
    var Destination: js.UndefOr[__stringPatternS3]
    var DestinationSettings: js.UndefOr[DestinationSettings]
    var Encryption: js.UndefOr[DashIsoEncryptionSettings]
    var FragmentLength: js.UndefOr[__integerMin1Max2147483647]
    var HbbtvCompliance: js.UndefOr[DashIsoHbbtvCompliance]
    var ImageBasedTrickPlay: js.UndefOr[DashIsoImageBasedTrickPlay]
    var ImageBasedTrickPlaySettings: js.UndefOr[DashIsoImageBasedTrickPlaySettings]
    var MinBufferTime: js.UndefOr[__integerMin0Max2147483647]
    var MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647]
    var MpdManifestBandwidthType: js.UndefOr[DashIsoMpdManifestBandwidthType]
    var MpdProfile: js.UndefOr[DashIsoMpdProfile]
    var PtsOffsetHandlingForBFrames: js.UndefOr[DashIsoPtsOffsetHandlingForBFrames]
    var SegmentControl: js.UndefOr[DashIsoSegmentControl]
    var SegmentLength: js.UndefOr[__integerMin1Max2147483647]
    var SegmentLengthControl: js.UndefOr[DashIsoSegmentLengthControl]
    var VideoCompositionOffsets: js.UndefOr[DashIsoVideoCompositionOffsets]
    var WriteSegmentTimelineInRepresentation: js.UndefOr[DashIsoWriteSegmentTimelineInRepresentation]
  }

  object DashIsoGroupSettings {
    @inline
    def apply(
        AdditionalManifests: js.UndefOr[__listOfDashAdditionalManifest] = js.undefined,
        AudioChannelConfigSchemeIdUri: js.UndefOr[DashIsoGroupAudioChannelConfigSchemeIdUri] = js.undefined,
        BaseUrl: js.UndefOr[__string] = js.undefined,
        Destination: js.UndefOr[__stringPatternS3] = js.undefined,
        DestinationSettings: js.UndefOr[DestinationSettings] = js.undefined,
        Encryption: js.UndefOr[DashIsoEncryptionSettings] = js.undefined,
        FragmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        HbbtvCompliance: js.UndefOr[DashIsoHbbtvCompliance] = js.undefined,
        ImageBasedTrickPlay: js.UndefOr[DashIsoImageBasedTrickPlay] = js.undefined,
        ImageBasedTrickPlaySettings: js.UndefOr[DashIsoImageBasedTrickPlaySettings] = js.undefined,
        MinBufferTime: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647] = js.undefined,
        MpdManifestBandwidthType: js.UndefOr[DashIsoMpdManifestBandwidthType] = js.undefined,
        MpdProfile: js.UndefOr[DashIsoMpdProfile] = js.undefined,
        PtsOffsetHandlingForBFrames: js.UndefOr[DashIsoPtsOffsetHandlingForBFrames] = js.undefined,
        SegmentControl: js.UndefOr[DashIsoSegmentControl] = js.undefined,
        SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        SegmentLengthControl: js.UndefOr[DashIsoSegmentLengthControl] = js.undefined,
        VideoCompositionOffsets: js.UndefOr[DashIsoVideoCompositionOffsets] = js.undefined,
        WriteSegmentTimelineInRepresentation: js.UndefOr[DashIsoWriteSegmentTimelineInRepresentation] = js.undefined
    ): DashIsoGroupSettings = {
      val __obj = js.Dynamic.literal()
      AdditionalManifests.foreach(__v => __obj.updateDynamic("AdditionalManifests")(__v.asInstanceOf[js.Any]))
      AudioChannelConfigSchemeIdUri.foreach(__v => __obj.updateDynamic("AudioChannelConfigSchemeIdUri")(__v.asInstanceOf[js.Any]))
      BaseUrl.foreach(__v => __obj.updateDynamic("BaseUrl")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      DestinationSettings.foreach(__v => __obj.updateDynamic("DestinationSettings")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      FragmentLength.foreach(__v => __obj.updateDynamic("FragmentLength")(__v.asInstanceOf[js.Any]))
      HbbtvCompliance.foreach(__v => __obj.updateDynamic("HbbtvCompliance")(__v.asInstanceOf[js.Any]))
      ImageBasedTrickPlay.foreach(__v => __obj.updateDynamic("ImageBasedTrickPlay")(__v.asInstanceOf[js.Any]))
      ImageBasedTrickPlaySettings.foreach(__v => __obj.updateDynamic("ImageBasedTrickPlaySettings")(__v.asInstanceOf[js.Any]))
      MinBufferTime.foreach(__v => __obj.updateDynamic("MinBufferTime")(__v.asInstanceOf[js.Any]))
      MinFinalSegmentLength.foreach(__v => __obj.updateDynamic("MinFinalSegmentLength")(__v.asInstanceOf[js.Any]))
      MpdManifestBandwidthType.foreach(__v => __obj.updateDynamic("MpdManifestBandwidthType")(__v.asInstanceOf[js.Any]))
      MpdProfile.foreach(__v => __obj.updateDynamic("MpdProfile")(__v.asInstanceOf[js.Any]))
      PtsOffsetHandlingForBFrames.foreach(__v => __obj.updateDynamic("PtsOffsetHandlingForBFrames")(__v.asInstanceOf[js.Any]))
      SegmentControl.foreach(__v => __obj.updateDynamic("SegmentControl")(__v.asInstanceOf[js.Any]))
      SegmentLength.foreach(__v => __obj.updateDynamic("SegmentLength")(__v.asInstanceOf[js.Any]))
      SegmentLengthControl.foreach(__v => __obj.updateDynamic("SegmentLengthControl")(__v.asInstanceOf[js.Any]))
      VideoCompositionOffsets.foreach(__v => __obj.updateDynamic("VideoCompositionOffsets")(__v.asInstanceOf[js.Any]))
      WriteSegmentTimelineInRepresentation.foreach(__v => __obj.updateDynamic("WriteSegmentTimelineInRepresentation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashIsoGroupSettings]
    }
  }

  /** Tile and thumbnail settings applicable when imageBasedTrickPlay is ADVANCED
    */
  @js.native
  trait DashIsoImageBasedTrickPlaySettings extends js.Object {
    var IntervalCadence: js.UndefOr[DashIsoIntervalCadence]
    var ThumbnailHeight: js.UndefOr[__integerMin1Max4096]
    var ThumbnailInterval: js.UndefOr[__doubleMin0Max2147483647]
    var ThumbnailWidth: js.UndefOr[__integerMin8Max4096]
    var TileHeight: js.UndefOr[__integerMin1Max2048]
    var TileWidth: js.UndefOr[__integerMin1Max512]
  }

  object DashIsoImageBasedTrickPlaySettings {
    @inline
    def apply(
        IntervalCadence: js.UndefOr[DashIsoIntervalCadence] = js.undefined,
        ThumbnailHeight: js.UndefOr[__integerMin1Max4096] = js.undefined,
        ThumbnailInterval: js.UndefOr[__doubleMin0Max2147483647] = js.undefined,
        ThumbnailWidth: js.UndefOr[__integerMin8Max4096] = js.undefined,
        TileHeight: js.UndefOr[__integerMin1Max2048] = js.undefined,
        TileWidth: js.UndefOr[__integerMin1Max512] = js.undefined
    ): DashIsoImageBasedTrickPlaySettings = {
      val __obj = js.Dynamic.literal()
      IntervalCadence.foreach(__v => __obj.updateDynamic("IntervalCadence")(__v.asInstanceOf[js.Any]))
      ThumbnailHeight.foreach(__v => __obj.updateDynamic("ThumbnailHeight")(__v.asInstanceOf[js.Any]))
      ThumbnailInterval.foreach(__v => __obj.updateDynamic("ThumbnailInterval")(__v.asInstanceOf[js.Any]))
      ThumbnailWidth.foreach(__v => __obj.updateDynamic("ThumbnailWidth")(__v.asInstanceOf[js.Any]))
      TileHeight.foreach(__v => __obj.updateDynamic("TileHeight")(__v.asInstanceOf[js.Any]))
      TileWidth.foreach(__v => __obj.updateDynamic("TileWidth")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashIsoImageBasedTrickPlaySettings]
    }
  }

  /** Settings for deinterlacer
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
  trait DeleteJobTemplateResponse extends js.Object

  object DeleteJobTemplateResponse {
    @inline
    def apply(): DeleteJobTemplateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteJobTemplateResponse]
    }
  }

  @js.native
  trait DeletePolicyRequest extends js.Object

  object DeletePolicyRequest {
    @inline
    def apply(): DeletePolicyRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeletePolicyRequest]
    }
  }

  @js.native
  trait DeletePolicyResponse extends js.Object

  object DeletePolicyResponse {
    @inline
    def apply(): DeletePolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeletePolicyResponse]
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
  trait DeletePresetResponse extends js.Object

  object DeletePresetResponse {
    @inline
    def apply(): DeletePresetResponse = {
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
  trait DeleteQueueResponse extends js.Object

  object DeleteQueueResponse {
    @inline
    def apply(): DeleteQueueResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteQueueResponse]
    }
  }

  /** DescribeEndpointsRequest
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

  /** Settings associated with the destination. Will vary based on the type of destination
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
  trait DisassociateCertificateResponse extends js.Object

  object DisassociateCertificateResponse {
    @inline
    def apply(): DisassociateCertificateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateCertificateResponse]
    }
  }

  /** Create Dolby Vision Profile 5 or Profile 8.1 compatible video output.
    */
  @js.native
  trait DolbyVision extends js.Object {
    var L6Metadata: js.UndefOr[DolbyVisionLevel6Metadata]
    var L6Mode: js.UndefOr[DolbyVisionLevel6Mode]
    var Mapping: js.UndefOr[DolbyVisionMapping]
    var Profile: js.UndefOr[DolbyVisionProfile]
  }

  object DolbyVision {
    @inline
    def apply(
        L6Metadata: js.UndefOr[DolbyVisionLevel6Metadata] = js.undefined,
        L6Mode: js.UndefOr[DolbyVisionLevel6Mode] = js.undefined,
        Mapping: js.UndefOr[DolbyVisionMapping] = js.undefined,
        Profile: js.UndefOr[DolbyVisionProfile] = js.undefined
    ): DolbyVision = {
      val __obj = js.Dynamic.literal()
      L6Metadata.foreach(__v => __obj.updateDynamic("L6Metadata")(__v.asInstanceOf[js.Any]))
      L6Mode.foreach(__v => __obj.updateDynamic("L6Mode")(__v.asInstanceOf[js.Any]))
      Mapping.foreach(__v => __obj.updateDynamic("Mapping")(__v.asInstanceOf[js.Any]))
      Profile.foreach(__v => __obj.updateDynamic("Profile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DolbyVision]
    }
  }

  /** Use these settings when you set DolbyVisionLevel6Mode to SPECIFY to override the MaxCLL and MaxFALL values in your input with new values.
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

  /** Use these settings to insert a DVB Network Information Table (NIT) in the transport stream of this output. When you work directly in your JSON job specification, include this object only when your job has a transport stream output and the container settings contain the object M2tsSettings.
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

  /** Use these settings to insert a DVB Service Description Table (SDT) in the transport stream of this output. When you work directly in your JSON job specification, include this object only when your job has a transport stream output and the container settings contain the object M2tsSettings.
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

  /** Settings related to DVB-Sub captions. Set up DVB-Sub captions in the same output as your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/dvb-sub-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to DVB_SUB.
    */
  @js.native
  trait DvbSubDestinationSettings extends js.Object {
    var Alignment: js.UndefOr[DvbSubtitleAlignment]
    var ApplyFontColor: js.UndefOr[DvbSubtitleApplyFontColor]
    var BackgroundColor: js.UndefOr[DvbSubtitleBackgroundColor]
    var BackgroundOpacity: js.UndefOr[__integerMin0Max255]
    var DdsHandling: js.UndefOr[DvbddsHandling]
    var DdsXCoordinate: js.UndefOr[__integerMin0Max2147483647]
    var DdsYCoordinate: js.UndefOr[__integerMin0Max2147483647]
    var FallbackFont: js.UndefOr[DvbSubSubtitleFallbackFont]
    var FontColor: js.UndefOr[DvbSubtitleFontColor]
    var FontOpacity: js.UndefOr[__integerMin0Max255]
    var FontResolution: js.UndefOr[__integerMin96Max600]
    var FontScript: js.UndefOr[FontScript]
    var FontSize: js.UndefOr[__integerMin0Max96]
    var Height: js.UndefOr[__integerMin1Max2147483647]
    var HexFontColor: js.UndefOr[__stringMin6Max8Pattern09aFAF609aFAF2]
    var OutlineColor: js.UndefOr[DvbSubtitleOutlineColor]
    var OutlineSize: js.UndefOr[__integerMin0Max10]
    var ShadowColor: js.UndefOr[DvbSubtitleShadowColor]
    var ShadowOpacity: js.UndefOr[__integerMin0Max255]
    var ShadowXOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var ShadowYOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var StylePassthrough: js.UndefOr[DvbSubtitleStylePassthrough]
    var SubtitlingType: js.UndefOr[DvbSubtitlingType]
    var TeletextSpacing: js.UndefOr[DvbSubtitleTeletextSpacing]
    var Width: js.UndefOr[__integerMin1Max2147483647]
    var XPosition: js.UndefOr[__integerMin0Max2147483647]
    var YPosition: js.UndefOr[__integerMin0Max2147483647]
  }

  object DvbSubDestinationSettings {
    @inline
    def apply(
        Alignment: js.UndefOr[DvbSubtitleAlignment] = js.undefined,
        ApplyFontColor: js.UndefOr[DvbSubtitleApplyFontColor] = js.undefined,
        BackgroundColor: js.UndefOr[DvbSubtitleBackgroundColor] = js.undefined,
        BackgroundOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        DdsHandling: js.UndefOr[DvbddsHandling] = js.undefined,
        DdsXCoordinate: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        DdsYCoordinate: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        FallbackFont: js.UndefOr[DvbSubSubtitleFallbackFont] = js.undefined,
        FontColor: js.UndefOr[DvbSubtitleFontColor] = js.undefined,
        FontOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        FontResolution: js.UndefOr[__integerMin96Max600] = js.undefined,
        FontScript: js.UndefOr[FontScript] = js.undefined,
        FontSize: js.UndefOr[__integerMin0Max96] = js.undefined,
        Height: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        HexFontColor: js.UndefOr[__stringMin6Max8Pattern09aFAF609aFAF2] = js.undefined,
        OutlineColor: js.UndefOr[DvbSubtitleOutlineColor] = js.undefined,
        OutlineSize: js.UndefOr[__integerMin0Max10] = js.undefined,
        ShadowColor: js.UndefOr[DvbSubtitleShadowColor] = js.undefined,
        ShadowOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        ShadowXOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        ShadowYOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        StylePassthrough: js.UndefOr[DvbSubtitleStylePassthrough] = js.undefined,
        SubtitlingType: js.UndefOr[DvbSubtitlingType] = js.undefined,
        TeletextSpacing: js.UndefOr[DvbSubtitleTeletextSpacing] = js.undefined,
        Width: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        XPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        YPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    ): DvbSubDestinationSettings = {
      val __obj = js.Dynamic.literal()
      Alignment.foreach(__v => __obj.updateDynamic("Alignment")(__v.asInstanceOf[js.Any]))
      ApplyFontColor.foreach(__v => __obj.updateDynamic("ApplyFontColor")(__v.asInstanceOf[js.Any]))
      BackgroundColor.foreach(__v => __obj.updateDynamic("BackgroundColor")(__v.asInstanceOf[js.Any]))
      BackgroundOpacity.foreach(__v => __obj.updateDynamic("BackgroundOpacity")(__v.asInstanceOf[js.Any]))
      DdsHandling.foreach(__v => __obj.updateDynamic("DdsHandling")(__v.asInstanceOf[js.Any]))
      DdsXCoordinate.foreach(__v => __obj.updateDynamic("DdsXCoordinate")(__v.asInstanceOf[js.Any]))
      DdsYCoordinate.foreach(__v => __obj.updateDynamic("DdsYCoordinate")(__v.asInstanceOf[js.Any]))
      FallbackFont.foreach(__v => __obj.updateDynamic("FallbackFont")(__v.asInstanceOf[js.Any]))
      FontColor.foreach(__v => __obj.updateDynamic("FontColor")(__v.asInstanceOf[js.Any]))
      FontOpacity.foreach(__v => __obj.updateDynamic("FontOpacity")(__v.asInstanceOf[js.Any]))
      FontResolution.foreach(__v => __obj.updateDynamic("FontResolution")(__v.asInstanceOf[js.Any]))
      FontScript.foreach(__v => __obj.updateDynamic("FontScript")(__v.asInstanceOf[js.Any]))
      FontSize.foreach(__v => __obj.updateDynamic("FontSize")(__v.asInstanceOf[js.Any]))
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      HexFontColor.foreach(__v => __obj.updateDynamic("HexFontColor")(__v.asInstanceOf[js.Any]))
      OutlineColor.foreach(__v => __obj.updateDynamic("OutlineColor")(__v.asInstanceOf[js.Any]))
      OutlineSize.foreach(__v => __obj.updateDynamic("OutlineSize")(__v.asInstanceOf[js.Any]))
      ShadowColor.foreach(__v => __obj.updateDynamic("ShadowColor")(__v.asInstanceOf[js.Any]))
      ShadowOpacity.foreach(__v => __obj.updateDynamic("ShadowOpacity")(__v.asInstanceOf[js.Any]))
      ShadowXOffset.foreach(__v => __obj.updateDynamic("ShadowXOffset")(__v.asInstanceOf[js.Any]))
      ShadowYOffset.foreach(__v => __obj.updateDynamic("ShadowYOffset")(__v.asInstanceOf[js.Any]))
      StylePassthrough.foreach(__v => __obj.updateDynamic("StylePassthrough")(__v.asInstanceOf[js.Any]))
      SubtitlingType.foreach(__v => __obj.updateDynamic("SubtitlingType")(__v.asInstanceOf[js.Any]))
      TeletextSpacing.foreach(__v => __obj.updateDynamic("TeletextSpacing")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      XPosition.foreach(__v => __obj.updateDynamic("XPosition")(__v.asInstanceOf[js.Any]))
      YPosition.foreach(__v => __obj.updateDynamic("YPosition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DvbSubDestinationSettings]
    }
  }

  /** DVB Sub Source Settings
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

  /** Use these settings to insert a DVB Time and Date Table (TDT) in the transport stream of this output. When you work directly in your JSON job specification, include this object only when your job has a transport stream output and the container settings contain the object M2tsSettings.
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

  /** Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value EAC3_ATMOS.
    */
  @js.native
  trait Eac3AtmosSettings extends js.Object {
    var Bitrate: js.UndefOr[__integerMin384000Max1024000]
    var BitstreamMode: js.UndefOr[Eac3AtmosBitstreamMode]
    var CodingMode: js.UndefOr[Eac3AtmosCodingMode]
    var DialogueIntelligence: js.UndefOr[Eac3AtmosDialogueIntelligence]
    var DownmixControl: js.UndefOr[Eac3AtmosDownmixControl]
    var DynamicRangeCompressionLine: js.UndefOr[Eac3AtmosDynamicRangeCompressionLine]
    var DynamicRangeCompressionRf: js.UndefOr[Eac3AtmosDynamicRangeCompressionRf]
    var DynamicRangeControl: js.UndefOr[Eac3AtmosDynamicRangeControl]
    var LoRoCenterMixLevel: js.UndefOr[__doubleMinNegative6Max3]
    var LoRoSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1]
    var LtRtCenterMixLevel: js.UndefOr[__doubleMinNegative6Max3]
    var LtRtSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1]
    var MeteringMode: js.UndefOr[Eac3AtmosMeteringMode]
    var SampleRate: js.UndefOr[__integerMin48000Max48000]
    var SpeechThreshold: js.UndefOr[__integerMin0Max100]
    var StereoDownmix: js.UndefOr[Eac3AtmosStereoDownmix]
    var SurroundExMode: js.UndefOr[Eac3AtmosSurroundExMode]
  }

  object Eac3AtmosSettings {
    @inline
    def apply(
        Bitrate: js.UndefOr[__integerMin384000Max1024000] = js.undefined,
        BitstreamMode: js.UndefOr[Eac3AtmosBitstreamMode] = js.undefined,
        CodingMode: js.UndefOr[Eac3AtmosCodingMode] = js.undefined,
        DialogueIntelligence: js.UndefOr[Eac3AtmosDialogueIntelligence] = js.undefined,
        DownmixControl: js.UndefOr[Eac3AtmosDownmixControl] = js.undefined,
        DynamicRangeCompressionLine: js.UndefOr[Eac3AtmosDynamicRangeCompressionLine] = js.undefined,
        DynamicRangeCompressionRf: js.UndefOr[Eac3AtmosDynamicRangeCompressionRf] = js.undefined,
        DynamicRangeControl: js.UndefOr[Eac3AtmosDynamicRangeControl] = js.undefined,
        LoRoCenterMixLevel: js.UndefOr[__doubleMinNegative6Max3] = js.undefined,
        LoRoSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1] = js.undefined,
        LtRtCenterMixLevel: js.UndefOr[__doubleMinNegative6Max3] = js.undefined,
        LtRtSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1] = js.undefined,
        MeteringMode: js.UndefOr[Eac3AtmosMeteringMode] = js.undefined,
        SampleRate: js.UndefOr[__integerMin48000Max48000] = js.undefined,
        SpeechThreshold: js.UndefOr[__integerMin0Max100] = js.undefined,
        StereoDownmix: js.UndefOr[Eac3AtmosStereoDownmix] = js.undefined,
        SurroundExMode: js.UndefOr[Eac3AtmosSurroundExMode] = js.undefined
    ): Eac3AtmosSettings = {
      val __obj = js.Dynamic.literal()
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      BitstreamMode.foreach(__v => __obj.updateDynamic("BitstreamMode")(__v.asInstanceOf[js.Any]))
      CodingMode.foreach(__v => __obj.updateDynamic("CodingMode")(__v.asInstanceOf[js.Any]))
      DialogueIntelligence.foreach(__v => __obj.updateDynamic("DialogueIntelligence")(__v.asInstanceOf[js.Any]))
      DownmixControl.foreach(__v => __obj.updateDynamic("DownmixControl")(__v.asInstanceOf[js.Any]))
      DynamicRangeCompressionLine.foreach(__v => __obj.updateDynamic("DynamicRangeCompressionLine")(__v.asInstanceOf[js.Any]))
      DynamicRangeCompressionRf.foreach(__v => __obj.updateDynamic("DynamicRangeCompressionRf")(__v.asInstanceOf[js.Any]))
      DynamicRangeControl.foreach(__v => __obj.updateDynamic("DynamicRangeControl")(__v.asInstanceOf[js.Any]))
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

  /** Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value EAC3.
    */
  @js.native
  trait Eac3Settings extends js.Object {
    var AttenuationControl: js.UndefOr[Eac3AttenuationControl]
    var Bitrate: js.UndefOr[__integerMin32000Max3024000]
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
        Bitrate: js.UndefOr[__integerMin32000Max3024000] = js.undefined,
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

  /** Settings related to CEA/EIA-608 and CEA/EIA-708 (also called embedded or ancillary) captions. Set up embedded captions in the same output as your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/embedded-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to EMBEDDED, EMBEDDED_PLUS_SCTE20, or SCTE20_PLUS_EMBEDDED.
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

  /** Settings for embedded captions Source
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

  /** Describes an account-specific API endpoint.
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

  /** ESAM ManifestConfirmConditionNotification defined by OC-SP-ESAM-API-I03-131025.
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

  /** Settings for Event Signaling And Messaging (ESAM). If you don't do ad insertion, you can ignore these settings.
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

  /** ESAM SignalProcessingNotification data defined by OC-SP-ESAM-API-I03-131025.
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

  /** If your source content has EIA-608 Line 21 Data Services, enable this feature to specify what MediaConvert does with the Extended Data Services (XDS) packets. You can choose to pass through XDS packets, or remove them from the output. For more information about XDS, see EIA-608 Line Data Services, section 9.5.1.5 05h Content Advisory.
    */
  @js.native
  trait ExtendedDataServices extends js.Object {
    var CopyProtectionAction: js.UndefOr[CopyProtectionAction]
    var VchipAction: js.UndefOr[VchipAction]
  }

  object ExtendedDataServices {
    @inline
    def apply(
        CopyProtectionAction: js.UndefOr[CopyProtectionAction] = js.undefined,
        VchipAction: js.UndefOr[VchipAction] = js.undefined
    ): ExtendedDataServices = {
      val __obj = js.Dynamic.literal()
      CopyProtectionAction.foreach(__v => __obj.updateDynamic("CopyProtectionAction")(__v.asInstanceOf[js.Any]))
      VchipAction.foreach(__v => __obj.updateDynamic("VchipAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExtendedDataServices]
    }
  }

  /** Settings for F4v container
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

  /** Settings related to your File output group. MediaConvert uses this group of settings to generate a single standalone file, rather than a streaming package. When you work directly in your JSON job specification, include this object and any required children when you set Type, under OutputGroupSettings, to FILE_GROUP_SETTINGS.
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

  /** If your input captions are SCC, SMI, SRT, STL, TTML, WebVTT, or IMSC 1.1 in an xml file, specify the URI of the input caption source file. If your caption source is IMSC in an IMF package, use TrackSourceSettings instead of FileSoureSettings.
    */
  @js.native
  trait FileSourceSettings extends js.Object {
    var Convert608To708: js.UndefOr[FileSourceConvert608To708]
    var Framerate: js.UndefOr[CaptionSourceFramerate]
    var SourceFile: js.UndefOr[__stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIVttVTTWebvttWEBVTTHttpsSccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIVttVTTWebvttWEBVTT]
    var TimeDelta: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var TimeDeltaUnits: js.UndefOr[FileSourceTimeDeltaUnits]
  }

  object FileSourceSettings {
    @inline
    def apply(
        Convert608To708: js.UndefOr[FileSourceConvert608To708] = js.undefined,
        Framerate: js.UndefOr[CaptionSourceFramerate] = js.undefined,
        SourceFile: js.UndefOr[__stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIVttVTTWebvttWEBVTTHttpsSccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIVttVTTWebvttWEBVTT] = js.undefined,
        TimeDelta: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        TimeDeltaUnits: js.UndefOr[FileSourceTimeDeltaUnits] = js.undefined
    ): FileSourceSettings = {
      val __obj = js.Dynamic.literal()
      Convert608To708.foreach(__v => __obj.updateDynamic("Convert608To708")(__v.asInstanceOf[js.Any]))
      Framerate.foreach(__v => __obj.updateDynamic("Framerate")(__v.asInstanceOf[js.Any]))
      SourceFile.foreach(__v => __obj.updateDynamic("SourceFile")(__v.asInstanceOf[js.Any]))
      TimeDelta.foreach(__v => __obj.updateDynamic("TimeDelta")(__v.asInstanceOf[js.Any]))
      TimeDeltaUnits.foreach(__v => __obj.updateDynamic("TimeDeltaUnits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileSourceSettings]
    }
  }

  /** Use Force include renditions to specify one or more resolutions to include your ABR stack. * (Recommended) To optimize automated ABR, specify as few resolutions as possible. * (Required) The number of resolutions that you specify must be equal to, or less than, the Max renditions setting. * If you specify a Min top rendition size rule, specify at least one resolution that is equal to, or greater than, Min top rendition size. * If you specify a Min bottom rendition size rule, only specify resolutions that are equal to, or greater than, Min bottom rendition size. * If you specify a Force include renditions rule, do not specify a separate rule for Allowed renditions. * Note: The ABR stack may include other resolutions that you do not specify here, depending on the Max renditions setting.
    */
  @js.native
  trait ForceIncludeRenditionSize extends js.Object {
    var Height: js.UndefOr[__integerMin32Max8192]
    var Width: js.UndefOr[__integerMin32Max8192]
  }

  object ForceIncludeRenditionSize {
    @inline
    def apply(
        Height: js.UndefOr[__integerMin32Max8192] = js.undefined,
        Width: js.UndefOr[__integerMin32Max8192] = js.undefined
    ): ForceIncludeRenditionSize = {
      val __obj = js.Dynamic.literal()
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ForceIncludeRenditionSize]
    }
  }

  /** Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value FRAME_CAPTURE.
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
  trait GetPolicyRequest extends js.Object

  object GetPolicyRequest {
    @inline
    def apply(): GetPolicyRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPolicyRequest]
    }
  }

  @js.native
  trait GetPolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  object GetPolicyResponse {
    @inline
    def apply(
        Policy: js.UndefOr[Policy] = js.undefined
    ): GetPolicyResponse = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPolicyResponse]
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

  /** Settings for quality-defined variable bitrate encoding with the H.264 codec. Use these settings only when you set QVBR for Rate control mode (RateControlMode).
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

  /** Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value H_264.
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
    var HrdBufferFinalFillPercentage: js.UndefOr[__integerMin0Max100]
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
    var ScanTypeConversionMode: js.UndefOr[H264ScanTypeConversionMode]
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
        HrdBufferFinalFillPercentage: js.UndefOr[__integerMin0Max100] = js.undefined,
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
        ScanTypeConversionMode: js.UndefOr[H264ScanTypeConversionMode] = js.undefined,
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
      HrdBufferFinalFillPercentage.foreach(__v => __obj.updateDynamic("HrdBufferFinalFillPercentage")(__v.asInstanceOf[js.Any]))
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
      ScanTypeConversionMode.foreach(__v => __obj.updateDynamic("ScanTypeConversionMode")(__v.asInstanceOf[js.Any]))
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

  /** Settings for quality-defined variable bitrate encoding with the H.265 codec. Use these settings only when you set QVBR for Rate control mode (RateControlMode).
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

  /** Settings for H265 codec
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
    var HrdBufferFinalFillPercentage: js.UndefOr[__integerMin0Max100]
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
    var ScanTypeConversionMode: js.UndefOr[H265ScanTypeConversionMode]
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
        HrdBufferFinalFillPercentage: js.UndefOr[__integerMin0Max100] = js.undefined,
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
        ScanTypeConversionMode: js.UndefOr[H265ScanTypeConversionMode] = js.undefined,
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
      HrdBufferFinalFillPercentage.foreach(__v => __obj.updateDynamic("HrdBufferFinalFillPercentage")(__v.asInstanceOf[js.Any]))
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
      ScanTypeConversionMode.foreach(__v => __obj.updateDynamic("ScanTypeConversionMode")(__v.asInstanceOf[js.Any]))
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

  /** Use these settings to specify static color calibration metadata, as defined by SMPTE ST 2086. These values don't affect the pixel values that are encoded in the video stream. They are intended to help the downstream video player display content in a way that reflects the intentions of the the content creator.
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

  /** Setting for HDR10+ metadata insertion
    */
  @js.native
  trait Hdr10Plus extends js.Object {
    var MasteringMonitorNits: js.UndefOr[__integerMin0Max4000]
    var TargetMonitorNits: js.UndefOr[__integerMin0Max4000]
  }

  object Hdr10Plus {
    @inline
    def apply(
        MasteringMonitorNits: js.UndefOr[__integerMin0Max4000] = js.undefined,
        TargetMonitorNits: js.UndefOr[__integerMin0Max4000] = js.undefined
    ): Hdr10Plus = {
      val __obj = js.Dynamic.literal()
      MasteringMonitorNits.foreach(__v => __obj.updateDynamic("MasteringMonitorNits")(__v.asInstanceOf[js.Any]))
      TargetMonitorNits.foreach(__v => __obj.updateDynamic("TargetMonitorNits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Hdr10Plus]
    }
  }

  /** Specify the details for each additional HLS manifest that you want the service to generate for this output group. Each manifest can reference a different subset of outputs in the group.
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

  /** Caption Language Mapping
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

  /** Settings for HLS encryption
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

  /** Settings related to your HLS output package. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/outputs-file-ABR.html. When you work directly in your JSON job specification, include this object and any required children when you set Type, under OutputGroupSettings, to HLS_GROUP_SETTINGS.
    */
  @js.native
  trait HlsGroupSettings extends js.Object {
    var AdMarkers: js.UndefOr[__listOfHlsAdMarkers]
    var AdditionalManifests: js.UndefOr[__listOfHlsAdditionalManifest]
    var AudioOnlyHeader: js.UndefOr[HlsAudioOnlyHeader]
    var BaseUrl: js.UndefOr[__string]
    var CaptionLanguageMappings: js.UndefOr[__listOfHlsCaptionLanguageMapping]
    var CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting]
    var CaptionSegmentLengthControl: js.UndefOr[HlsCaptionSegmentLengthControl]
    var ClientCache: js.UndefOr[HlsClientCache]
    var CodecSpecification: js.UndefOr[HlsCodecSpecification]
    var Destination: js.UndefOr[__stringPatternS3]
    var DestinationSettings: js.UndefOr[DestinationSettings]
    var DirectoryStructure: js.UndefOr[HlsDirectoryStructure]
    var Encryption: js.UndefOr[HlsEncryptionSettings]
    var ImageBasedTrickPlay: js.UndefOr[HlsImageBasedTrickPlay]
    var ImageBasedTrickPlaySettings: js.UndefOr[HlsImageBasedTrickPlaySettings]
    var ManifestCompression: js.UndefOr[HlsManifestCompression]
    var ManifestDurationFormat: js.UndefOr[HlsManifestDurationFormat]
    var MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647]
    var MinSegmentLength: js.UndefOr[__integerMin0Max2147483647]
    var OutputSelection: js.UndefOr[HlsOutputSelection]
    var ProgramDateTime: js.UndefOr[HlsProgramDateTime]
    var ProgramDateTimePeriod: js.UndefOr[__integerMin0Max3600]
    var SegmentControl: js.UndefOr[HlsSegmentControl]
    var SegmentLength: js.UndefOr[__integerMin1Max2147483647]
    var SegmentLengthControl: js.UndefOr[HlsSegmentLengthControl]
    var SegmentsPerSubdirectory: js.UndefOr[__integerMin1Max2147483647]
    var StreamInfResolution: js.UndefOr[HlsStreamInfResolution]
    var TargetDurationCompatibilityMode: js.UndefOr[HlsTargetDurationCompatibilityMode]
    var TimedMetadataId3Frame: js.UndefOr[HlsTimedMetadataId3Frame]
    var TimedMetadataId3Period: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var TimestampDeltaMilliseconds: js.UndefOr[__integerMinNegative2147483648Max2147483647]
  }

  object HlsGroupSettings {
    @inline
    def apply(
        AdMarkers: js.UndefOr[__listOfHlsAdMarkers] = js.undefined,
        AdditionalManifests: js.UndefOr[__listOfHlsAdditionalManifest] = js.undefined,
        AudioOnlyHeader: js.UndefOr[HlsAudioOnlyHeader] = js.undefined,
        BaseUrl: js.UndefOr[__string] = js.undefined,
        CaptionLanguageMappings: js.UndefOr[__listOfHlsCaptionLanguageMapping] = js.undefined,
        CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting] = js.undefined,
        CaptionSegmentLengthControl: js.UndefOr[HlsCaptionSegmentLengthControl] = js.undefined,
        ClientCache: js.UndefOr[HlsClientCache] = js.undefined,
        CodecSpecification: js.UndefOr[HlsCodecSpecification] = js.undefined,
        Destination: js.UndefOr[__stringPatternS3] = js.undefined,
        DestinationSettings: js.UndefOr[DestinationSettings] = js.undefined,
        DirectoryStructure: js.UndefOr[HlsDirectoryStructure] = js.undefined,
        Encryption: js.UndefOr[HlsEncryptionSettings] = js.undefined,
        ImageBasedTrickPlay: js.UndefOr[HlsImageBasedTrickPlay] = js.undefined,
        ImageBasedTrickPlaySettings: js.UndefOr[HlsImageBasedTrickPlaySettings] = js.undefined,
        ManifestCompression: js.UndefOr[HlsManifestCompression] = js.undefined,
        ManifestDurationFormat: js.UndefOr[HlsManifestDurationFormat] = js.undefined,
        MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647] = js.undefined,
        MinSegmentLength: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        OutputSelection: js.UndefOr[HlsOutputSelection] = js.undefined,
        ProgramDateTime: js.UndefOr[HlsProgramDateTime] = js.undefined,
        ProgramDateTimePeriod: js.UndefOr[__integerMin0Max3600] = js.undefined,
        SegmentControl: js.UndefOr[HlsSegmentControl] = js.undefined,
        SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        SegmentLengthControl: js.UndefOr[HlsSegmentLengthControl] = js.undefined,
        SegmentsPerSubdirectory: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        StreamInfResolution: js.UndefOr[HlsStreamInfResolution] = js.undefined,
        TargetDurationCompatibilityMode: js.UndefOr[HlsTargetDurationCompatibilityMode] = js.undefined,
        TimedMetadataId3Frame: js.UndefOr[HlsTimedMetadataId3Frame] = js.undefined,
        TimedMetadataId3Period: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        TimestampDeltaMilliseconds: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
    ): HlsGroupSettings = {
      val __obj = js.Dynamic.literal()
      AdMarkers.foreach(__v => __obj.updateDynamic("AdMarkers")(__v.asInstanceOf[js.Any]))
      AdditionalManifests.foreach(__v => __obj.updateDynamic("AdditionalManifests")(__v.asInstanceOf[js.Any]))
      AudioOnlyHeader.foreach(__v => __obj.updateDynamic("AudioOnlyHeader")(__v.asInstanceOf[js.Any]))
      BaseUrl.foreach(__v => __obj.updateDynamic("BaseUrl")(__v.asInstanceOf[js.Any]))
      CaptionLanguageMappings.foreach(__v => __obj.updateDynamic("CaptionLanguageMappings")(__v.asInstanceOf[js.Any]))
      CaptionLanguageSetting.foreach(__v => __obj.updateDynamic("CaptionLanguageSetting")(__v.asInstanceOf[js.Any]))
      CaptionSegmentLengthControl.foreach(__v => __obj.updateDynamic("CaptionSegmentLengthControl")(__v.asInstanceOf[js.Any]))
      ClientCache.foreach(__v => __obj.updateDynamic("ClientCache")(__v.asInstanceOf[js.Any]))
      CodecSpecification.foreach(__v => __obj.updateDynamic("CodecSpecification")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      DestinationSettings.foreach(__v => __obj.updateDynamic("DestinationSettings")(__v.asInstanceOf[js.Any]))
      DirectoryStructure.foreach(__v => __obj.updateDynamic("DirectoryStructure")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      ImageBasedTrickPlay.foreach(__v => __obj.updateDynamic("ImageBasedTrickPlay")(__v.asInstanceOf[js.Any]))
      ImageBasedTrickPlaySettings.foreach(__v => __obj.updateDynamic("ImageBasedTrickPlaySettings")(__v.asInstanceOf[js.Any]))
      ManifestCompression.foreach(__v => __obj.updateDynamic("ManifestCompression")(__v.asInstanceOf[js.Any]))
      ManifestDurationFormat.foreach(__v => __obj.updateDynamic("ManifestDurationFormat")(__v.asInstanceOf[js.Any]))
      MinFinalSegmentLength.foreach(__v => __obj.updateDynamic("MinFinalSegmentLength")(__v.asInstanceOf[js.Any]))
      MinSegmentLength.foreach(__v => __obj.updateDynamic("MinSegmentLength")(__v.asInstanceOf[js.Any]))
      OutputSelection.foreach(__v => __obj.updateDynamic("OutputSelection")(__v.asInstanceOf[js.Any]))
      ProgramDateTime.foreach(__v => __obj.updateDynamic("ProgramDateTime")(__v.asInstanceOf[js.Any]))
      ProgramDateTimePeriod.foreach(__v => __obj.updateDynamic("ProgramDateTimePeriod")(__v.asInstanceOf[js.Any]))
      SegmentControl.foreach(__v => __obj.updateDynamic("SegmentControl")(__v.asInstanceOf[js.Any]))
      SegmentLength.foreach(__v => __obj.updateDynamic("SegmentLength")(__v.asInstanceOf[js.Any]))
      SegmentLengthControl.foreach(__v => __obj.updateDynamic("SegmentLengthControl")(__v.asInstanceOf[js.Any]))
      SegmentsPerSubdirectory.foreach(__v => __obj.updateDynamic("SegmentsPerSubdirectory")(__v.asInstanceOf[js.Any]))
      StreamInfResolution.foreach(__v => __obj.updateDynamic("StreamInfResolution")(__v.asInstanceOf[js.Any]))
      TargetDurationCompatibilityMode.foreach(__v => __obj.updateDynamic("TargetDurationCompatibilityMode")(__v.asInstanceOf[js.Any]))
      TimedMetadataId3Frame.foreach(__v => __obj.updateDynamic("TimedMetadataId3Frame")(__v.asInstanceOf[js.Any]))
      TimedMetadataId3Period.foreach(__v => __obj.updateDynamic("TimedMetadataId3Period")(__v.asInstanceOf[js.Any]))
      TimestampDeltaMilliseconds.foreach(__v => __obj.updateDynamic("TimestampDeltaMilliseconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsGroupSettings]
    }
  }

  /** Tile and thumbnail settings applicable when imageBasedTrickPlay is ADVANCED
    */
  @js.native
  trait HlsImageBasedTrickPlaySettings extends js.Object {
    var IntervalCadence: js.UndefOr[HlsIntervalCadence]
    var ThumbnailHeight: js.UndefOr[__integerMin2Max4096]
    var ThumbnailInterval: js.UndefOr[__doubleMin0Max2147483647]
    var ThumbnailWidth: js.UndefOr[__integerMin8Max4096]
    var TileHeight: js.UndefOr[__integerMin1Max2048]
    var TileWidth: js.UndefOr[__integerMin1Max512]
  }

  object HlsImageBasedTrickPlaySettings {
    @inline
    def apply(
        IntervalCadence: js.UndefOr[HlsIntervalCadence] = js.undefined,
        ThumbnailHeight: js.UndefOr[__integerMin2Max4096] = js.undefined,
        ThumbnailInterval: js.UndefOr[__doubleMin0Max2147483647] = js.undefined,
        ThumbnailWidth: js.UndefOr[__integerMin8Max4096] = js.undefined,
        TileHeight: js.UndefOr[__integerMin1Max2048] = js.undefined,
        TileWidth: js.UndefOr[__integerMin1Max512] = js.undefined
    ): HlsImageBasedTrickPlaySettings = {
      val __obj = js.Dynamic.literal()
      IntervalCadence.foreach(__v => __obj.updateDynamic("IntervalCadence")(__v.asInstanceOf[js.Any]))
      ThumbnailHeight.foreach(__v => __obj.updateDynamic("ThumbnailHeight")(__v.asInstanceOf[js.Any]))
      ThumbnailInterval.foreach(__v => __obj.updateDynamic("ThumbnailInterval")(__v.asInstanceOf[js.Any]))
      ThumbnailWidth.foreach(__v => __obj.updateDynamic("ThumbnailWidth")(__v.asInstanceOf[js.Any]))
      TileHeight.foreach(__v => __obj.updateDynamic("TileHeight")(__v.asInstanceOf[js.Any]))
      TileWidth.foreach(__v => __obj.updateDynamic("TileWidth")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsImageBasedTrickPlaySettings]
    }
  }

  /** Settings specific to audio sources in an HLS alternate rendition group. Specify the properties (renditionGroupId, renditionName or renditionLanguageCode) to identify the unique audio track among the alternative rendition groups present in the HLS manifest. If no unique track is found, or multiple tracks match the properties provided, the job fails. If no properties in hlsRenditionGroupSettings are specified, the default audio track within the video segment is chosen. If there is no audio within video segment, the alternative audio with DEFAULT=YES is chosen instead.
    */
  @js.native
  trait HlsRenditionGroupSettings extends js.Object {
    var RenditionGroupId: js.UndefOr[__string]
    var RenditionLanguageCode: js.UndefOr[LanguageCode]
    var RenditionName: js.UndefOr[__string]
  }

  object HlsRenditionGroupSettings {
    @inline
    def apply(
        RenditionGroupId: js.UndefOr[__string] = js.undefined,
        RenditionLanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        RenditionName: js.UndefOr[__string] = js.undefined
    ): HlsRenditionGroupSettings = {
      val __obj = js.Dynamic.literal()
      RenditionGroupId.foreach(__v => __obj.updateDynamic("RenditionGroupId")(__v.asInstanceOf[js.Any]))
      RenditionLanguageCode.foreach(__v => __obj.updateDynamic("RenditionLanguageCode")(__v.asInstanceOf[js.Any]))
      RenditionName.foreach(__v => __obj.updateDynamic("RenditionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsRenditionGroupSettings]
    }
  }

  /** Settings for HLS output groups
    */
  @js.native
  trait HlsSettings extends js.Object {
    var AudioGroupId: js.UndefOr[__string]
    var AudioOnlyContainer: js.UndefOr[HlsAudioOnlyContainer]
    var AudioRenditionSets: js.UndefOr[__string]
    var AudioTrackType: js.UndefOr[HlsAudioTrackType]
    var DescriptiveVideoServiceFlag: js.UndefOr[HlsDescriptiveVideoServiceFlag]
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
        DescriptiveVideoServiceFlag: js.UndefOr[HlsDescriptiveVideoServiceFlag] = js.undefined,
        IFrameOnlyManifest: js.UndefOr[HlsIFrameOnlyManifest] = js.undefined,
        SegmentModifier: js.UndefOr[__string] = js.undefined
    ): HlsSettings = {
      val __obj = js.Dynamic.literal()
      AudioGroupId.foreach(__v => __obj.updateDynamic("AudioGroupId")(__v.asInstanceOf[js.Any]))
      AudioOnlyContainer.foreach(__v => __obj.updateDynamic("AudioOnlyContainer")(__v.asInstanceOf[js.Any]))
      AudioRenditionSets.foreach(__v => __obj.updateDynamic("AudioRenditionSets")(__v.asInstanceOf[js.Any]))
      AudioTrackType.foreach(__v => __obj.updateDynamic("AudioTrackType")(__v.asInstanceOf[js.Any]))
      DescriptiveVideoServiceFlag.foreach(__v => __obj.updateDynamic("DescriptiveVideoServiceFlag")(__v.asInstanceOf[js.Any]))
      IFrameOnlyManifest.foreach(__v => __obj.updateDynamic("IFrameOnlyManifest")(__v.asInstanceOf[js.Any]))
      SegmentModifier.foreach(__v => __obj.updateDynamic("SegmentModifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsSettings]
    }
  }

  /** Optional. Configuration for a destination queue to which the job can hop once a customer-defined minimum wait time has passed.
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

  /** To insert ID3 tags in your output, specify two values. Use ID3 tag (Id3) to specify the base 64 encoded string and use Timecode (TimeCode) to specify the time when the tag should be inserted. To insert multiple ID3 tags in your output, create multiple instances of ID3 insertion (Id3Insertion).
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

  /** Use the image inserter feature to include a graphic overlay on your video. Enable or disable this feature for each input or output individually. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/graphic-overlay.html. This setting is disabled by default.
    */
  @js.native
  trait ImageInserter extends js.Object {
    var InsertableImages: js.UndefOr[__listOfInsertableImage]
    var SdrReferenceWhiteLevel: js.UndefOr[__integerMin100Max1000]
  }

  object ImageInserter {
    @inline
    def apply(
        InsertableImages: js.UndefOr[__listOfInsertableImage] = js.undefined,
        SdrReferenceWhiteLevel: js.UndefOr[__integerMin100Max1000] = js.undefined
    ): ImageInserter = {
      val __obj = js.Dynamic.literal()
      InsertableImages.foreach(__v => __obj.updateDynamic("InsertableImages")(__v.asInstanceOf[js.Any]))
      SdrReferenceWhiteLevel.foreach(__v => __obj.updateDynamic("SdrReferenceWhiteLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageInserter]
    }
  }

  /** Settings related to IMSC captions. IMSC is a sidecar format that holds captions in a file that is separate from the video container. Set up sidecar captions in the same output group, but different output from your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to IMSC.
    */
  @js.native
  trait ImscDestinationSettings extends js.Object {
    var Accessibility: js.UndefOr[ImscAccessibilitySubs]
    var StylePassthrough: js.UndefOr[ImscStylePassthrough]
  }

  object ImscDestinationSettings {
    @inline
    def apply(
        Accessibility: js.UndefOr[ImscAccessibilitySubs] = js.undefined,
        StylePassthrough: js.UndefOr[ImscStylePassthrough] = js.undefined
    ): ImscDestinationSettings = {
      val __obj = js.Dynamic.literal()
      Accessibility.foreach(__v => __obj.updateDynamic("Accessibility")(__v.asInstanceOf[js.Any]))
      StylePassthrough.foreach(__v => __obj.updateDynamic("StylePassthrough")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImscDestinationSettings]
    }
  }

  /** Use inputs to define the source files used in your transcoding job. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/specify-input-settings.html. You can use multiple video inputs to do input stitching. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/assembling-multiple-inputs-and-input-clips.html
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
    var DolbyVisionMetadataXml: js.UndefOr[__stringMin14PatternS3XmlXMLHttpsXmlXML]
    var FileInput: js.UndefOr[__stringPatternS3MM2PPMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVaAAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLLOOGGGGaAAATTMMOOSSHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVaAAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLLOOGGGGaAAATTMMOOSS]
    var FilterEnable: js.UndefOr[InputFilterEnable]
    var FilterStrength: js.UndefOr[__integerMinNegative5Max5]
    var ImageInserter: js.UndefOr[ImageInserter]
    var InputClippings: js.UndefOr[__listOfInputClipping]
    var InputScanType: js.UndefOr[InputScanType]
    var Position: js.UndefOr[Rectangle]
    var ProgramNumber: js.UndefOr[__integerMin1Max2147483647]
    var PsiControl: js.UndefOr[InputPsiControl]
    var SupplementalImps: js.UndefOr[__listOf__stringPatternS3ASSETMAPXml]
    var TimecodeSource: js.UndefOr[InputTimecodeSource]
    var TimecodeStart: js.UndefOr[__stringMin11Max11Pattern01D20305D205D]
    var VideoGenerator: js.UndefOr[InputVideoGenerator]
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
        DolbyVisionMetadataXml: js.UndefOr[__stringMin14PatternS3XmlXMLHttpsXmlXML] = js.undefined,
        FileInput: js.UndefOr[__stringPatternS3MM2PPMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVaAAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLLOOGGGGaAAATTMMOOSSHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMKKAAMMOOVVMMTTSSMM2TTWWMMVVaAAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLLOOGGGGaAAATTMMOOSS] = js.undefined,
        FilterEnable: js.UndefOr[InputFilterEnable] = js.undefined,
        FilterStrength: js.UndefOr[__integerMinNegative5Max5] = js.undefined,
        ImageInserter: js.UndefOr[ImageInserter] = js.undefined,
        InputClippings: js.UndefOr[__listOfInputClipping] = js.undefined,
        InputScanType: js.UndefOr[InputScanType] = js.undefined,
        Position: js.UndefOr[Rectangle] = js.undefined,
        ProgramNumber: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        PsiControl: js.UndefOr[InputPsiControl] = js.undefined,
        SupplementalImps: js.UndefOr[__listOf__stringPatternS3ASSETMAPXml] = js.undefined,
        TimecodeSource: js.UndefOr[InputTimecodeSource] = js.undefined,
        TimecodeStart: js.UndefOr[__stringMin11Max11Pattern01D20305D205D] = js.undefined,
        VideoGenerator: js.UndefOr[InputVideoGenerator] = js.undefined,
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
      DolbyVisionMetadataXml.foreach(__v => __obj.updateDynamic("DolbyVisionMetadataXml")(__v.asInstanceOf[js.Any]))
      FileInput.foreach(__v => __obj.updateDynamic("FileInput")(__v.asInstanceOf[js.Any]))
      FilterEnable.foreach(__v => __obj.updateDynamic("FilterEnable")(__v.asInstanceOf[js.Any]))
      FilterStrength.foreach(__v => __obj.updateDynamic("FilterStrength")(__v.asInstanceOf[js.Any]))
      ImageInserter.foreach(__v => __obj.updateDynamic("ImageInserter")(__v.asInstanceOf[js.Any]))
      InputClippings.foreach(__v => __obj.updateDynamic("InputClippings")(__v.asInstanceOf[js.Any]))
      InputScanType.foreach(__v => __obj.updateDynamic("InputScanType")(__v.asInstanceOf[js.Any]))
      Position.foreach(__v => __obj.updateDynamic("Position")(__v.asInstanceOf[js.Any]))
      ProgramNumber.foreach(__v => __obj.updateDynamic("ProgramNumber")(__v.asInstanceOf[js.Any]))
      PsiControl.foreach(__v => __obj.updateDynamic("PsiControl")(__v.asInstanceOf[js.Any]))
      SupplementalImps.foreach(__v => __obj.updateDynamic("SupplementalImps")(__v.asInstanceOf[js.Any]))
      TimecodeSource.foreach(__v => __obj.updateDynamic("TimecodeSource")(__v.asInstanceOf[js.Any]))
      TimecodeStart.foreach(__v => __obj.updateDynamic("TimecodeStart")(__v.asInstanceOf[js.Any]))
      VideoGenerator.foreach(__v => __obj.updateDynamic("VideoGenerator")(__v.asInstanceOf[js.Any]))
      VideoSelector.foreach(__v => __obj.updateDynamic("VideoSelector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Input]
    }
  }

  /** To transcode only portions of your input, include one input clip for each part of your input that you want in your output. All input clips that you specify will be included in every output of the job. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/assembling-multiple-inputs-and-input-clips.html.
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

  /** Settings for decrypting any input files that you encrypt before you upload them to Amazon S3. MediaConvert can decrypt files only when you use AWS Key Management Service (KMS) to encrypt the data key that you use to encrypt your content.
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

  /** Specified video input in a template.
    */
  @js.native
  trait InputTemplate extends js.Object {
    var AudioSelectorGroups: js.UndefOr[__mapOfAudioSelectorGroup]
    var AudioSelectors: js.UndefOr[__mapOfAudioSelector]
    var CaptionSelectors: js.UndefOr[__mapOfCaptionSelector]
    var Crop: js.UndefOr[Rectangle]
    var DeblockFilter: js.UndefOr[InputDeblockFilter]
    var DenoiseFilter: js.UndefOr[InputDenoiseFilter]
    var DolbyVisionMetadataXml: js.UndefOr[__stringMin14PatternS3XmlXMLHttpsXmlXML]
    var FilterEnable: js.UndefOr[InputFilterEnable]
    var FilterStrength: js.UndefOr[__integerMinNegative5Max5]
    var ImageInserter: js.UndefOr[ImageInserter]
    var InputClippings: js.UndefOr[__listOfInputClipping]
    var InputScanType: js.UndefOr[InputScanType]
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
        DolbyVisionMetadataXml: js.UndefOr[__stringMin14PatternS3XmlXMLHttpsXmlXML] = js.undefined,
        FilterEnable: js.UndefOr[InputFilterEnable] = js.undefined,
        FilterStrength: js.UndefOr[__integerMinNegative5Max5] = js.undefined,
        ImageInserter: js.UndefOr[ImageInserter] = js.undefined,
        InputClippings: js.UndefOr[__listOfInputClipping] = js.undefined,
        InputScanType: js.UndefOr[InputScanType] = js.undefined,
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
      DolbyVisionMetadataXml.foreach(__v => __obj.updateDynamic("DolbyVisionMetadataXml")(__v.asInstanceOf[js.Any]))
      FilterEnable.foreach(__v => __obj.updateDynamic("FilterEnable")(__v.asInstanceOf[js.Any]))
      FilterStrength.foreach(__v => __obj.updateDynamic("FilterStrength")(__v.asInstanceOf[js.Any]))
      ImageInserter.foreach(__v => __obj.updateDynamic("ImageInserter")(__v.asInstanceOf[js.Any]))
      InputClippings.foreach(__v => __obj.updateDynamic("InputClippings")(__v.asInstanceOf[js.Any]))
      InputScanType.foreach(__v => __obj.updateDynamic("InputScanType")(__v.asInstanceOf[js.Any]))
      Position.foreach(__v => __obj.updateDynamic("Position")(__v.asInstanceOf[js.Any]))
      ProgramNumber.foreach(__v => __obj.updateDynamic("ProgramNumber")(__v.asInstanceOf[js.Any]))
      PsiControl.foreach(__v => __obj.updateDynamic("PsiControl")(__v.asInstanceOf[js.Any]))
      TimecodeSource.foreach(__v => __obj.updateDynamic("TimecodeSource")(__v.asInstanceOf[js.Any]))
      TimecodeStart.foreach(__v => __obj.updateDynamic("TimecodeStart")(__v.asInstanceOf[js.Any]))
      VideoSelector.foreach(__v => __obj.updateDynamic("VideoSelector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputTemplate]
    }
  }

  /** When you include Video generator, MediaConvert creates a video input with black frames. Use this setting if you do not have a video input or if you want to add black video frames before, or after, other inputs. You can specify Video generator, or you can specify an Input file, but you cannot specify both. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/video-generator.html
    */
  @js.native
  trait InputVideoGenerator extends js.Object {
    var Duration: js.UndefOr[__integerMin50Max86400000]
  }

  object InputVideoGenerator {
    @inline
    def apply(
        Duration: js.UndefOr[__integerMin50Max86400000] = js.undefined
    ): InputVideoGenerator = {
      val __obj = js.Dynamic.literal()
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputVideoGenerator]
    }
  }

  /** These settings apply to a specific graphic overlay. You can include multiple overlays in your job.
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

  /** Each job converts an input file into an output file or files. For more information, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
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

  /** Provides messages from the service about jobs that you have already successfully submitted.
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

  /** JobSettings contains all the transcode settings for a job.
    */
  @js.native
  trait JobSettings extends js.Object {
    var AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000]
    var AvailBlanking: js.UndefOr[AvailBlanking]
    var Esam: js.UndefOr[EsamSettings]
    var ExtendedDataServices: js.UndefOr[ExtendedDataServices]
    var Inputs: js.UndefOr[__listOfInput]
    var KantarWatermark: js.UndefOr[KantarWatermarkSettings]
    var MotionImageInserter: js.UndefOr[MotionImageInserter]
    var NielsenConfiguration: js.UndefOr[NielsenConfiguration]
    var NielsenNonLinearWatermark: js.UndefOr[NielsenNonLinearWatermarkSettings]
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
        ExtendedDataServices: js.UndefOr[ExtendedDataServices] = js.undefined,
        Inputs: js.UndefOr[__listOfInput] = js.undefined,
        KantarWatermark: js.UndefOr[KantarWatermarkSettings] = js.undefined,
        MotionImageInserter: js.UndefOr[MotionImageInserter] = js.undefined,
        NielsenConfiguration: js.UndefOr[NielsenConfiguration] = js.undefined,
        NielsenNonLinearWatermark: js.UndefOr[NielsenNonLinearWatermarkSettings] = js.undefined,
        OutputGroups: js.UndefOr[__listOfOutputGroup] = js.undefined,
        TimecodeConfig: js.UndefOr[TimecodeConfig] = js.undefined,
        TimedMetadataInsertion: js.UndefOr[TimedMetadataInsertion] = js.undefined
    ): JobSettings = {
      val __obj = js.Dynamic.literal()
      AdAvailOffset.foreach(__v => __obj.updateDynamic("AdAvailOffset")(__v.asInstanceOf[js.Any]))
      AvailBlanking.foreach(__v => __obj.updateDynamic("AvailBlanking")(__v.asInstanceOf[js.Any]))
      Esam.foreach(__v => __obj.updateDynamic("Esam")(__v.asInstanceOf[js.Any]))
      ExtendedDataServices.foreach(__v => __obj.updateDynamic("ExtendedDataServices")(__v.asInstanceOf[js.Any]))
      Inputs.foreach(__v => __obj.updateDynamic("Inputs")(__v.asInstanceOf[js.Any]))
      KantarWatermark.foreach(__v => __obj.updateDynamic("KantarWatermark")(__v.asInstanceOf[js.Any]))
      MotionImageInserter.foreach(__v => __obj.updateDynamic("MotionImageInserter")(__v.asInstanceOf[js.Any]))
      NielsenConfiguration.foreach(__v => __obj.updateDynamic("NielsenConfiguration")(__v.asInstanceOf[js.Any]))
      NielsenNonLinearWatermark.foreach(__v => __obj.updateDynamic("NielsenNonLinearWatermark")(__v.asInstanceOf[js.Any]))
      OutputGroups.foreach(__v => __obj.updateDynamic("OutputGroups")(__v.asInstanceOf[js.Any]))
      TimecodeConfig.foreach(__v => __obj.updateDynamic("TimecodeConfig")(__v.asInstanceOf[js.Any]))
      TimedMetadataInsertion.foreach(__v => __obj.updateDynamic("TimedMetadataInsertion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobSettings]
    }
  }

  /** A job template is a pre-made set of encoding instructions that you can use to quickly create a job.
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

  /** JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs created from it.
    */
  @js.native
  trait JobTemplateSettings extends js.Object {
    var AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000]
    var AvailBlanking: js.UndefOr[AvailBlanking]
    var Esam: js.UndefOr[EsamSettings]
    var ExtendedDataServices: js.UndefOr[ExtendedDataServices]
    var Inputs: js.UndefOr[__listOfInputTemplate]
    var KantarWatermark: js.UndefOr[KantarWatermarkSettings]
    var MotionImageInserter: js.UndefOr[MotionImageInserter]
    var NielsenConfiguration: js.UndefOr[NielsenConfiguration]
    var NielsenNonLinearWatermark: js.UndefOr[NielsenNonLinearWatermarkSettings]
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
        ExtendedDataServices: js.UndefOr[ExtendedDataServices] = js.undefined,
        Inputs: js.UndefOr[__listOfInputTemplate] = js.undefined,
        KantarWatermark: js.UndefOr[KantarWatermarkSettings] = js.undefined,
        MotionImageInserter: js.UndefOr[MotionImageInserter] = js.undefined,
        NielsenConfiguration: js.UndefOr[NielsenConfiguration] = js.undefined,
        NielsenNonLinearWatermark: js.UndefOr[NielsenNonLinearWatermarkSettings] = js.undefined,
        OutputGroups: js.UndefOr[__listOfOutputGroup] = js.undefined,
        TimecodeConfig: js.UndefOr[TimecodeConfig] = js.undefined,
        TimedMetadataInsertion: js.UndefOr[TimedMetadataInsertion] = js.undefined
    ): JobTemplateSettings = {
      val __obj = js.Dynamic.literal()
      AdAvailOffset.foreach(__v => __obj.updateDynamic("AdAvailOffset")(__v.asInstanceOf[js.Any]))
      AvailBlanking.foreach(__v => __obj.updateDynamic("AvailBlanking")(__v.asInstanceOf[js.Any]))
      Esam.foreach(__v => __obj.updateDynamic("Esam")(__v.asInstanceOf[js.Any]))
      ExtendedDataServices.foreach(__v => __obj.updateDynamic("ExtendedDataServices")(__v.asInstanceOf[js.Any]))
      Inputs.foreach(__v => __obj.updateDynamic("Inputs")(__v.asInstanceOf[js.Any]))
      KantarWatermark.foreach(__v => __obj.updateDynamic("KantarWatermark")(__v.asInstanceOf[js.Any]))
      MotionImageInserter.foreach(__v => __obj.updateDynamic("MotionImageInserter")(__v.asInstanceOf[js.Any]))
      NielsenConfiguration.foreach(__v => __obj.updateDynamic("NielsenConfiguration")(__v.asInstanceOf[js.Any]))
      NielsenNonLinearWatermark.foreach(__v => __obj.updateDynamic("NielsenNonLinearWatermark")(__v.asInstanceOf[js.Any]))
      OutputGroups.foreach(__v => __obj.updateDynamic("OutputGroups")(__v.asInstanceOf[js.Any]))
      TimecodeConfig.foreach(__v => __obj.updateDynamic("TimecodeConfig")(__v.asInstanceOf[js.Any]))
      TimedMetadataInsertion.foreach(__v => __obj.updateDynamic("TimedMetadataInsertion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobTemplateSettings]
    }
  }

  /** Use these settings only when you use Kantar watermarking. Specify the values that MediaConvert uses to generate and place Kantar watermarks in your output audio. These settings apply to every output in your job. In addition to specifying these values, you also need to store your Kantar credentials in AWS Secrets Manager. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/kantar-watermarking.html.
    */
  @js.native
  trait KantarWatermarkSettings extends js.Object {
    var ChannelName: js.UndefOr[__stringMin1Max20]
    var ContentReference: js.UndefOr[__stringMin1Max50PatternAZAZ09]
    var CredentialsSecretName: js.UndefOr[__stringMin1Max512PatternAZAZ09]
    var FileOffset: js.UndefOr[__doubleMin0]
    var KantarLicenseId: js.UndefOr[__integerMin0Max2147483647]
    var KantarServerUrl: js.UndefOr[__stringPatternHttpsKantarmediaCom]
    var LogDestination: js.UndefOr[__stringPatternS3]
    var Metadata3: js.UndefOr[__stringMin1Max50]
    var Metadata4: js.UndefOr[__stringMin1Max50]
    var Metadata5: js.UndefOr[__stringMin1Max50]
    var Metadata6: js.UndefOr[__stringMin1Max50]
    var Metadata7: js.UndefOr[__stringMin1Max50]
    var Metadata8: js.UndefOr[__stringMin1Max50]
  }

  object KantarWatermarkSettings {
    @inline
    def apply(
        ChannelName: js.UndefOr[__stringMin1Max20] = js.undefined,
        ContentReference: js.UndefOr[__stringMin1Max50PatternAZAZ09] = js.undefined,
        CredentialsSecretName: js.UndefOr[__stringMin1Max512PatternAZAZ09] = js.undefined,
        FileOffset: js.UndefOr[__doubleMin0] = js.undefined,
        KantarLicenseId: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        KantarServerUrl: js.UndefOr[__stringPatternHttpsKantarmediaCom] = js.undefined,
        LogDestination: js.UndefOr[__stringPatternS3] = js.undefined,
        Metadata3: js.UndefOr[__stringMin1Max50] = js.undefined,
        Metadata4: js.UndefOr[__stringMin1Max50] = js.undefined,
        Metadata5: js.UndefOr[__stringMin1Max50] = js.undefined,
        Metadata6: js.UndefOr[__stringMin1Max50] = js.undefined,
        Metadata7: js.UndefOr[__stringMin1Max50] = js.undefined,
        Metadata8: js.UndefOr[__stringMin1Max50] = js.undefined
    ): KantarWatermarkSettings = {
      val __obj = js.Dynamic.literal()
      ChannelName.foreach(__v => __obj.updateDynamic("ChannelName")(__v.asInstanceOf[js.Any]))
      ContentReference.foreach(__v => __obj.updateDynamic("ContentReference")(__v.asInstanceOf[js.Any]))
      CredentialsSecretName.foreach(__v => __obj.updateDynamic("CredentialsSecretName")(__v.asInstanceOf[js.Any]))
      FileOffset.foreach(__v => __obj.updateDynamic("FileOffset")(__v.asInstanceOf[js.Any]))
      KantarLicenseId.foreach(__v => __obj.updateDynamic("KantarLicenseId")(__v.asInstanceOf[js.Any]))
      KantarServerUrl.foreach(__v => __obj.updateDynamic("KantarServerUrl")(__v.asInstanceOf[js.Any]))
      LogDestination.foreach(__v => __obj.updateDynamic("LogDestination")(__v.asInstanceOf[js.Any]))
      Metadata3.foreach(__v => __obj.updateDynamic("Metadata3")(__v.asInstanceOf[js.Any]))
      Metadata4.foreach(__v => __obj.updateDynamic("Metadata4")(__v.asInstanceOf[js.Any]))
      Metadata5.foreach(__v => __obj.updateDynamic("Metadata5")(__v.asInstanceOf[js.Any]))
      Metadata6.foreach(__v => __obj.updateDynamic("Metadata6")(__v.asInstanceOf[js.Any]))
      Metadata7.foreach(__v => __obj.updateDynamic("Metadata7")(__v.asInstanceOf[js.Any]))
      Metadata8.foreach(__v => __obj.updateDynamic("Metadata8")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KantarWatermarkSettings]
    }
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

  /** Settings for SCTE-35 signals from ESAM. Include this in your job settings to put SCTE-35 markers in your HLS and transport stream outputs at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
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

  /** MPEG-2 TS container settings. These apply to outputs in a File output group when the output's container (ContainerType) is MPEG-2 Transport Stream (M2TS). In these assets, data is organized by the program map table (PMT). Each transport stream program contains subsets of data, including audio, video, and metadata. Each of these subsets of data has a numerical label called a packet identifier (PID). Each transport stream program corresponds to one MediaConvert output. The PMT lists the types of data in a program along with their PID. Downstream systems and players use the program map table to look up the PID for each type of data it accesses and then uses the PIDs to locate specific data within the asset.
    */
  @js.native
  trait M2tsSettings extends js.Object {
    var AudioBufferModel: js.UndefOr[M2tsAudioBufferModel]
    var AudioDuration: js.UndefOr[M2tsAudioDuration]
    var AudioFramesPerPes: js.UndefOr[__integerMin0Max2147483647]
    var AudioPids: js.UndefOr[__listOf__integerMin32Max8182]
    var Bitrate: js.UndefOr[__integerMin0Max2147483647]
    var BufferModel: js.UndefOr[M2tsBufferModel]
    var DataPTSControl: js.UndefOr[M2tsDataPtsControl]
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
    var KlvMetadata: js.UndefOr[M2tsKlvMetadata]
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
        AudioDuration: js.UndefOr[M2tsAudioDuration] = js.undefined,
        AudioFramesPerPes: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        AudioPids: js.UndefOr[__listOf__integerMin32Max8182] = js.undefined,
        Bitrate: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        BufferModel: js.UndefOr[M2tsBufferModel] = js.undefined,
        DataPTSControl: js.UndefOr[M2tsDataPtsControl] = js.undefined,
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
        KlvMetadata: js.UndefOr[M2tsKlvMetadata] = js.undefined,
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
      AudioDuration.foreach(__v => __obj.updateDynamic("AudioDuration")(__v.asInstanceOf[js.Any]))
      AudioFramesPerPes.foreach(__v => __obj.updateDynamic("AudioFramesPerPes")(__v.asInstanceOf[js.Any]))
      AudioPids.foreach(__v => __obj.updateDynamic("AudioPids")(__v.asInstanceOf[js.Any]))
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      BufferModel.foreach(__v => __obj.updateDynamic("BufferModel")(__v.asInstanceOf[js.Any]))
      DataPTSControl.foreach(__v => __obj.updateDynamic("DataPTSControl")(__v.asInstanceOf[js.Any]))
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
      KlvMetadata.foreach(__v => __obj.updateDynamic("KlvMetadata")(__v.asInstanceOf[js.Any]))
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

  /** These settings relate to the MPEG-2 transport stream (MPEG2-TS) container for the MPEG2-TS segments in your HLS outputs.
    */
  @js.native
  trait M3u8Settings extends js.Object {
    var AudioDuration: js.UndefOr[M3u8AudioDuration]
    var AudioFramesPerPes: js.UndefOr[__integerMin0Max2147483647]
    var AudioPids: js.UndefOr[__listOf__integerMin32Max8182]
    var DataPTSControl: js.UndefOr[M3u8DataPtsControl]
    var MaxPcrInterval: js.UndefOr[__integerMin0Max500]
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
        AudioDuration: js.UndefOr[M3u8AudioDuration] = js.undefined,
        AudioFramesPerPes: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        AudioPids: js.UndefOr[__listOf__integerMin32Max8182] = js.undefined,
        DataPTSControl: js.UndefOr[M3u8DataPtsControl] = js.undefined,
        MaxPcrInterval: js.UndefOr[__integerMin0Max500] = js.undefined,
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
      AudioDuration.foreach(__v => __obj.updateDynamic("AudioDuration")(__v.asInstanceOf[js.Any]))
      AudioFramesPerPes.foreach(__v => __obj.updateDynamic("AudioFramesPerPes")(__v.asInstanceOf[js.Any]))
      AudioPids.foreach(__v => __obj.updateDynamic("AudioPids")(__v.asInstanceOf[js.Any]))
      DataPTSControl.foreach(__v => __obj.updateDynamic("DataPTSControl")(__v.asInstanceOf[js.Any]))
      MaxPcrInterval.foreach(__v => __obj.updateDynamic("MaxPcrInterval")(__v.asInstanceOf[js.Any]))
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

  /** Use Min bottom rendition size to specify a minimum size for the lowest resolution in your ABR stack. * The lowest resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you specify 640x360 the lowest resolution in your ABR stack will be equal to or greater than to 640x360. * If you specify a Min top rendition size rule, the value that you specify for Min bottom rendition size must be less than, or equal to, Min top rendition size.
    */
  @js.native
  trait MinBottomRenditionSize extends js.Object {
    var Height: js.UndefOr[__integerMin32Max8192]
    var Width: js.UndefOr[__integerMin32Max8192]
  }

  object MinBottomRenditionSize {
    @inline
    def apply(
        Height: js.UndefOr[__integerMin32Max8192] = js.undefined,
        Width: js.UndefOr[__integerMin32Max8192] = js.undefined
    ): MinBottomRenditionSize = {
      val __obj = js.Dynamic.literal()
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MinBottomRenditionSize]
    }
  }

  /** Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The highest resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you specify 1280x720 the highest resolution in your ABR stack will be equal to or greater than 1280x720. * If you specify a value for Max resolution, the value that you specify for Min top rendition size must be less than, or equal to, Max resolution.
    */
  @js.native
  trait MinTopRenditionSize extends js.Object {
    var Height: js.UndefOr[__integerMin32Max8192]
    var Width: js.UndefOr[__integerMin32Max8192]
  }

  object MinTopRenditionSize {
    @inline
    def apply(
        Height: js.UndefOr[__integerMin32Max8192] = js.undefined,
        Width: js.UndefOr[__integerMin32Max8192] = js.undefined
    ): MinTopRenditionSize = {
      val __obj = js.Dynamic.literal()
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MinTopRenditionSize]
    }
  }

  /** Overlay motion graphics on top of your video. The motion graphics that you specify here appear on all outputs in all output groups. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/motion-graphic-overlay.html.
    */
  @js.native
  trait MotionImageInserter extends js.Object {
    var Framerate: js.UndefOr[MotionImageInsertionFramerate]
    var Input: js.UndefOr[__stringMin14PatternS3Mov09PngHttpsMov09Png]
    var InsertionMode: js.UndefOr[MotionImageInsertionMode]
    var Offset: js.UndefOr[MotionImageInsertionOffset]
    var Playback: js.UndefOr[MotionImagePlayback]
    var StartTime: js.UndefOr[__stringMin11Max11Pattern01D20305D205D]
  }

  object MotionImageInserter {
    @inline
    def apply(
        Framerate: js.UndefOr[MotionImageInsertionFramerate] = js.undefined,
        Input: js.UndefOr[__stringMin14PatternS3Mov09PngHttpsMov09Png] = js.undefined,
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

  /** For motion overlays that don't have a built-in frame rate, specify the frame rate of the overlay in frames per second, as a fraction. For example, specify 24 fps as 24/1. The overlay frame rate doesn't need to match the frame rate of the underlying video.
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

  /** Specify the offset between the upper-left corner of the video frame and the top left corner of the overlay.
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

  /** These settings relate to your QuickTime MOV output container.
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

  /** Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value MP2.
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

  /** Required when you set Codec, under AudioDescriptions>CodecSettings, to the value MP3.
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

  /** These settings relate to your MP4 output container. You can create audio only outputs with this container. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/supported-codecs-containers-audio-only.html#output-codecs-and-containers-supported-for-audio-only.
    */
  @js.native
  trait Mp4Settings extends js.Object {
    var AudioDuration: js.UndefOr[CmfcAudioDuration]
    var CslgAtom: js.UndefOr[Mp4CslgAtom]
    var CttsVersion: js.UndefOr[__integerMin0Max1]
    var FreeSpaceBox: js.UndefOr[Mp4FreeSpaceBox]
    var MoovPlacement: js.UndefOr[Mp4MoovPlacement]
    var Mp4MajorBrand: js.UndefOr[__string]
  }

  object Mp4Settings {
    @inline
    def apply(
        AudioDuration: js.UndefOr[CmfcAudioDuration] = js.undefined,
        CslgAtom: js.UndefOr[Mp4CslgAtom] = js.undefined,
        CttsVersion: js.UndefOr[__integerMin0Max1] = js.undefined,
        FreeSpaceBox: js.UndefOr[Mp4FreeSpaceBox] = js.undefined,
        MoovPlacement: js.UndefOr[Mp4MoovPlacement] = js.undefined,
        Mp4MajorBrand: js.UndefOr[__string] = js.undefined
    ): Mp4Settings = {
      val __obj = js.Dynamic.literal()
      AudioDuration.foreach(__v => __obj.updateDynamic("AudioDuration")(__v.asInstanceOf[js.Any]))
      CslgAtom.foreach(__v => __obj.updateDynamic("CslgAtom")(__v.asInstanceOf[js.Any]))
      CttsVersion.foreach(__v => __obj.updateDynamic("CttsVersion")(__v.asInstanceOf[js.Any]))
      FreeSpaceBox.foreach(__v => __obj.updateDynamic("FreeSpaceBox")(__v.asInstanceOf[js.Any]))
      MoovPlacement.foreach(__v => __obj.updateDynamic("MoovPlacement")(__v.asInstanceOf[js.Any]))
      Mp4MajorBrand.foreach(__v => __obj.updateDynamic("Mp4MajorBrand")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Mp4Settings]
    }
  }

  /** These settings relate to the fragmented MP4 container for the segments in your DASH outputs.
    */
  @js.native
  trait MpdSettings extends js.Object {
    var AccessibilityCaptionHints: js.UndefOr[MpdAccessibilityCaptionHints]
    var AudioDuration: js.UndefOr[MpdAudioDuration]
    var CaptionContainerType: js.UndefOr[MpdCaptionContainerType]
    var KlvMetadata: js.UndefOr[MpdKlvMetadata]
    var ManifestMetadataSignaling: js.UndefOr[MpdManifestMetadataSignaling]
    var Scte35Esam: js.UndefOr[MpdScte35Esam]
    var Scte35Source: js.UndefOr[MpdScte35Source]
    var TimedMetadata: js.UndefOr[MpdTimedMetadata]
    var TimedMetadataBoxVersion: js.UndefOr[MpdTimedMetadataBoxVersion]
    var TimedMetadataSchemeIdUri: js.UndefOr[__stringMax1000]
    var TimedMetadataValue: js.UndefOr[__stringMax1000]
  }

  object MpdSettings {
    @inline
    def apply(
        AccessibilityCaptionHints: js.UndefOr[MpdAccessibilityCaptionHints] = js.undefined,
        AudioDuration: js.UndefOr[MpdAudioDuration] = js.undefined,
        CaptionContainerType: js.UndefOr[MpdCaptionContainerType] = js.undefined,
        KlvMetadata: js.UndefOr[MpdKlvMetadata] = js.undefined,
        ManifestMetadataSignaling: js.UndefOr[MpdManifestMetadataSignaling] = js.undefined,
        Scte35Esam: js.UndefOr[MpdScte35Esam] = js.undefined,
        Scte35Source: js.UndefOr[MpdScte35Source] = js.undefined,
        TimedMetadata: js.UndefOr[MpdTimedMetadata] = js.undefined,
        TimedMetadataBoxVersion: js.UndefOr[MpdTimedMetadataBoxVersion] = js.undefined,
        TimedMetadataSchemeIdUri: js.UndefOr[__stringMax1000] = js.undefined,
        TimedMetadataValue: js.UndefOr[__stringMax1000] = js.undefined
    ): MpdSettings = {
      val __obj = js.Dynamic.literal()
      AccessibilityCaptionHints.foreach(__v => __obj.updateDynamic("AccessibilityCaptionHints")(__v.asInstanceOf[js.Any]))
      AudioDuration.foreach(__v => __obj.updateDynamic("AudioDuration")(__v.asInstanceOf[js.Any]))
      CaptionContainerType.foreach(__v => __obj.updateDynamic("CaptionContainerType")(__v.asInstanceOf[js.Any]))
      KlvMetadata.foreach(__v => __obj.updateDynamic("KlvMetadata")(__v.asInstanceOf[js.Any]))
      ManifestMetadataSignaling.foreach(__v => __obj.updateDynamic("ManifestMetadataSignaling")(__v.asInstanceOf[js.Any]))
      Scte35Esam.foreach(__v => __obj.updateDynamic("Scte35Esam")(__v.asInstanceOf[js.Any]))
      Scte35Source.foreach(__v => __obj.updateDynamic("Scte35Source")(__v.asInstanceOf[js.Any]))
      TimedMetadata.foreach(__v => __obj.updateDynamic("TimedMetadata")(__v.asInstanceOf[js.Any]))
      TimedMetadataBoxVersion.foreach(__v => __obj.updateDynamic("TimedMetadataBoxVersion")(__v.asInstanceOf[js.Any]))
      TimedMetadataSchemeIdUri.foreach(__v => __obj.updateDynamic("TimedMetadataSchemeIdUri")(__v.asInstanceOf[js.Any]))
      TimedMetadataValue.foreach(__v => __obj.updateDynamic("TimedMetadataValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MpdSettings]
    }
  }

  /** Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value MPEG2.
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
    var HrdBufferFinalFillPercentage: js.UndefOr[__integerMin0Max100]
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
    var ScanTypeConversionMode: js.UndefOr[Mpeg2ScanTypeConversionMode]
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
        HrdBufferFinalFillPercentage: js.UndefOr[__integerMin0Max100] = js.undefined,
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
        ScanTypeConversionMode: js.UndefOr[Mpeg2ScanTypeConversionMode] = js.undefined,
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
      HrdBufferFinalFillPercentage.foreach(__v => __obj.updateDynamic("HrdBufferFinalFillPercentage")(__v.asInstanceOf[js.Any]))
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
      ScanTypeConversionMode.foreach(__v => __obj.updateDynamic("ScanTypeConversionMode")(__v.asInstanceOf[js.Any]))
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

  /** Specify the details for each additional Microsoft Smooth Streaming manifest that you want the service to generate for this output group. Each manifest can reference a different subset of outputs in the group.
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

  /** If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to specify the value SpekeKeyProvider.
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

  /** Settings related to your Microsoft Smooth Streaming output package. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/outputs-file-ABR.html. When you work directly in your JSON job specification, include this object and any required children when you set Type, under OutputGroupSettings, to MS_SMOOTH_GROUP_SETTINGS.
    */
  @js.native
  trait MsSmoothGroupSettings extends js.Object {
    var AdditionalManifests: js.UndefOr[__listOfMsSmoothAdditionalManifest]
    var AudioDeduplication: js.UndefOr[MsSmoothAudioDeduplication]
    var Destination: js.UndefOr[__stringPatternS3]
    var DestinationSettings: js.UndefOr[DestinationSettings]
    var Encryption: js.UndefOr[MsSmoothEncryptionSettings]
    var FragmentLength: js.UndefOr[__integerMin1Max2147483647]
    var FragmentLengthControl: js.UndefOr[MsSmoothFragmentLengthControl]
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
        FragmentLengthControl: js.UndefOr[MsSmoothFragmentLengthControl] = js.undefined,
        ManifestEncoding: js.UndefOr[MsSmoothManifestEncoding] = js.undefined
    ): MsSmoothGroupSettings = {
      val __obj = js.Dynamic.literal()
      AdditionalManifests.foreach(__v => __obj.updateDynamic("AdditionalManifests")(__v.asInstanceOf[js.Any]))
      AudioDeduplication.foreach(__v => __obj.updateDynamic("AudioDeduplication")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      DestinationSettings.foreach(__v => __obj.updateDynamic("DestinationSettings")(__v.asInstanceOf[js.Any]))
      Encryption.foreach(__v => __obj.updateDynamic("Encryption")(__v.asInstanceOf[js.Any]))
      FragmentLength.foreach(__v => __obj.updateDynamic("FragmentLength")(__v.asInstanceOf[js.Any]))
      FragmentLengthControl.foreach(__v => __obj.updateDynamic("FragmentLengthControl")(__v.asInstanceOf[js.Any]))
      ManifestEncoding.foreach(__v => __obj.updateDynamic("ManifestEncoding")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MsSmoothGroupSettings]
    }
  }

  /** These settings relate to your MXF output container.
    */
  @js.native
  trait MxfSettings extends js.Object {
    var AfdSignaling: js.UndefOr[MxfAfdSignaling]
    var Profile: js.UndefOr[MxfProfile]
    var XavcProfileSettings: js.UndefOr[MxfXavcProfileSettings]
  }

  object MxfSettings {
    @inline
    def apply(
        AfdSignaling: js.UndefOr[MxfAfdSignaling] = js.undefined,
        Profile: js.UndefOr[MxfProfile] = js.undefined,
        XavcProfileSettings: js.UndefOr[MxfXavcProfileSettings] = js.undefined
    ): MxfSettings = {
      val __obj = js.Dynamic.literal()
      AfdSignaling.foreach(__v => __obj.updateDynamic("AfdSignaling")(__v.asInstanceOf[js.Any]))
      Profile.foreach(__v => __obj.updateDynamic("Profile")(__v.asInstanceOf[js.Any]))
      XavcProfileSettings.foreach(__v => __obj.updateDynamic("XavcProfileSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MxfSettings]
    }
  }

  /** Specify the XAVC profile settings for MXF outputs when you set your MXF profile to XAVC.
    */
  @js.native
  trait MxfXavcProfileSettings extends js.Object {
    var DurationMode: js.UndefOr[MxfXavcDurationMode]
    var MaxAncDataSize: js.UndefOr[__integerMin0Max2147483647]
  }

  object MxfXavcProfileSettings {
    @inline
    def apply(
        DurationMode: js.UndefOr[MxfXavcDurationMode] = js.undefined,
        MaxAncDataSize: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    ): MxfXavcProfileSettings = {
      val __obj = js.Dynamic.literal()
      DurationMode.foreach(__v => __obj.updateDynamic("DurationMode")(__v.asInstanceOf[js.Any]))
      MaxAncDataSize.foreach(__v => __obj.updateDynamic("MaxAncDataSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MxfXavcProfileSettings]
    }
  }

  /** For forensic video watermarking, MediaConvert supports Nagra NexGuard File Marker watermarking. MediaConvert supports both PreRelease Content (NGPR/G2) and OTT Streaming workflows.
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

  /** Settings for your Nielsen configuration. If you don't do Nielsen measurement and analytics, ignore these settings. When you enable Nielsen configuration (nielsenConfiguration), MediaConvert enables PCM to ID3 tagging for all outputs in the job. To enable Nielsen configuration programmatically, include an instance of nielsenConfiguration in your JSON job specification. Even if you don't include any children of nielsenConfiguration, you still enable the setting.
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

  /** Ignore these settings unless you are using Nielsen non-linear watermarking. Specify the values that MediaConvert uses to generate and place Nielsen watermarks in your output audio. In addition to specifying these values, you also need to set up your cloud TIC server. These settings apply to every output in your job. The MediaConvert implementation is currently with the following Nielsen versions: Nielsen Watermark SDK Version 5.2.1 Nielsen NLM Watermark Engine Version 1.2.7 Nielsen Watermark Authenticator [SID_TIC] Version [5.0.0]
    */
  @js.native
  trait NielsenNonLinearWatermarkSettings extends js.Object {
    var ActiveWatermarkProcess: js.UndefOr[NielsenActiveWatermarkProcessType]
    var AdiFilename: js.UndefOr[__stringPatternS3]
    var AssetId: js.UndefOr[__stringMin1Max20]
    var AssetName: js.UndefOr[__stringMin1Max50]
    var CbetSourceId: js.UndefOr[__stringPattern0xAFaF0908190908]
    var EpisodeId: js.UndefOr[__stringMin1Max20]
    var MetadataDestination: js.UndefOr[__stringPatternS3]
    var SourceId: js.UndefOr[__integerMin0Max65534]
    var SourceWatermarkStatus: js.UndefOr[NielsenSourceWatermarkStatusType]
    var TicServerUrl: js.UndefOr[__stringPatternHttps]
    var UniqueTicPerAudioTrack: js.UndefOr[NielsenUniqueTicPerAudioTrackType]
  }

  object NielsenNonLinearWatermarkSettings {
    @inline
    def apply(
        ActiveWatermarkProcess: js.UndefOr[NielsenActiveWatermarkProcessType] = js.undefined,
        AdiFilename: js.UndefOr[__stringPatternS3] = js.undefined,
        AssetId: js.UndefOr[__stringMin1Max20] = js.undefined,
        AssetName: js.UndefOr[__stringMin1Max50] = js.undefined,
        CbetSourceId: js.UndefOr[__stringPattern0xAFaF0908190908] = js.undefined,
        EpisodeId: js.UndefOr[__stringMin1Max20] = js.undefined,
        MetadataDestination: js.UndefOr[__stringPatternS3] = js.undefined,
        SourceId: js.UndefOr[__integerMin0Max65534] = js.undefined,
        SourceWatermarkStatus: js.UndefOr[NielsenSourceWatermarkStatusType] = js.undefined,
        TicServerUrl: js.UndefOr[__stringPatternHttps] = js.undefined,
        UniqueTicPerAudioTrack: js.UndefOr[NielsenUniqueTicPerAudioTrackType] = js.undefined
    ): NielsenNonLinearWatermarkSettings = {
      val __obj = js.Dynamic.literal()
      ActiveWatermarkProcess.foreach(__v => __obj.updateDynamic("ActiveWatermarkProcess")(__v.asInstanceOf[js.Any]))
      AdiFilename.foreach(__v => __obj.updateDynamic("AdiFilename")(__v.asInstanceOf[js.Any]))
      AssetId.foreach(__v => __obj.updateDynamic("AssetId")(__v.asInstanceOf[js.Any]))
      AssetName.foreach(__v => __obj.updateDynamic("AssetName")(__v.asInstanceOf[js.Any]))
      CbetSourceId.foreach(__v => __obj.updateDynamic("CbetSourceId")(__v.asInstanceOf[js.Any]))
      EpisodeId.foreach(__v => __obj.updateDynamic("EpisodeId")(__v.asInstanceOf[js.Any]))
      MetadataDestination.foreach(__v => __obj.updateDynamic("MetadataDestination")(__v.asInstanceOf[js.Any]))
      SourceId.foreach(__v => __obj.updateDynamic("SourceId")(__v.asInstanceOf[js.Any]))
      SourceWatermarkStatus.foreach(__v => __obj.updateDynamic("SourceWatermarkStatus")(__v.asInstanceOf[js.Any]))
      TicServerUrl.foreach(__v => __obj.updateDynamic("TicServerUrl")(__v.asInstanceOf[js.Any]))
      UniqueTicPerAudioTrack.foreach(__v => __obj.updateDynamic("UniqueTicPerAudioTrack")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NielsenNonLinearWatermarkSettings]
    }
  }

  /** Enable the Noise reducer (NoiseReducer) feature to remove noise from your video output if necessary. Enable or disable this feature for each output individually. This setting is disabled by default. When you enable Noise reducer (NoiseReducer), you must also select a value for Noise reducer filter (NoiseReducerFilter).
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

  /** Settings for a noise reducer filter
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

  /** Noise reducer filter settings for spatial filter.
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

  /** Noise reducer filter settings for temporal filter.
    */
  @js.native
  trait NoiseReducerTemporalFilterSettings extends js.Object {
    var AggressiveMode: js.UndefOr[__integerMin0Max4]
    var PostTemporalSharpening: js.UndefOr[NoiseFilterPostTemporalSharpening]
    var PostTemporalSharpeningStrength: js.UndefOr[NoiseFilterPostTemporalSharpeningStrength]
    var Speed: js.UndefOr[__integerMinNegative1Max3]
    var Strength: js.UndefOr[__integerMin0Max16]
  }

  object NoiseReducerTemporalFilterSettings {
    @inline
    def apply(
        AggressiveMode: js.UndefOr[__integerMin0Max4] = js.undefined,
        PostTemporalSharpening: js.UndefOr[NoiseFilterPostTemporalSharpening] = js.undefined,
        PostTemporalSharpeningStrength: js.UndefOr[NoiseFilterPostTemporalSharpeningStrength] = js.undefined,
        Speed: js.UndefOr[__integerMinNegative1Max3] = js.undefined,
        Strength: js.UndefOr[__integerMin0Max16] = js.undefined
    ): NoiseReducerTemporalFilterSettings = {
      val __obj = js.Dynamic.literal()
      AggressiveMode.foreach(__v => __obj.updateDynamic("AggressiveMode")(__v.asInstanceOf[js.Any]))
      PostTemporalSharpening.foreach(__v => __obj.updateDynamic("PostTemporalSharpening")(__v.asInstanceOf[js.Any]))
      PostTemporalSharpeningStrength.foreach(__v => __obj.updateDynamic("PostTemporalSharpeningStrength")(__v.asInstanceOf[js.Any]))
      Speed.foreach(__v => __obj.updateDynamic("Speed")(__v.asInstanceOf[js.Any]))
      Strength.foreach(__v => __obj.updateDynamic("Strength")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NoiseReducerTemporalFilterSettings]
    }
  }

  /** Required when you set Codec, under AudioDescriptions>CodecSettings, to the value OPUS.
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

  /** Each output in your job is a collection of settings that describes how you want MediaConvert to encode a single output file or stream. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/create-outputs.html.
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

  /** OutputChannel mapping settings.
    */
  @js.native
  trait OutputChannelMapping extends js.Object {
    var InputChannels: js.UndefOr[__listOf__integerMinNegative60Max6]
    var InputChannelsFineTune: js.UndefOr[__listOf__doubleMinNegative60Max6]
  }

  object OutputChannelMapping {
    @inline
    def apply(
        InputChannels: js.UndefOr[__listOf__integerMinNegative60Max6] = js.undefined,
        InputChannelsFineTune: js.UndefOr[__listOf__doubleMinNegative60Max6] = js.undefined
    ): OutputChannelMapping = {
      val __obj = js.Dynamic.literal()
      InputChannels.foreach(__v => __obj.updateDynamic("InputChannels")(__v.asInstanceOf[js.Any]))
      InputChannelsFineTune.foreach(__v => __obj.updateDynamic("InputChannelsFineTune")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputChannelMapping]
    }
  }

  /** Details regarding output
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

  /** Group of outputs
    */
  @js.native
  trait OutputGroup extends js.Object {
    var AutomatedEncodingSettings: js.UndefOr[AutomatedEncodingSettings]
    var CustomName: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var OutputGroupSettings: js.UndefOr[OutputGroupSettings]
    var Outputs: js.UndefOr[__listOfOutput]
  }

  object OutputGroup {
    @inline
    def apply(
        AutomatedEncodingSettings: js.UndefOr[AutomatedEncodingSettings] = js.undefined,
        CustomName: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        OutputGroupSettings: js.UndefOr[OutputGroupSettings] = js.undefined,
        Outputs: js.UndefOr[__listOfOutput] = js.undefined
    ): OutputGroup = {
      val __obj = js.Dynamic.literal()
      AutomatedEncodingSettings.foreach(__v => __obj.updateDynamic("AutomatedEncodingSettings")(__v.asInstanceOf[js.Any]))
      CustomName.foreach(__v => __obj.updateDynamic("CustomName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutputGroupSettings.foreach(__v => __obj.updateDynamic("OutputGroupSettings")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputGroup]
    }
  }

  /** Contains details about the output groups specified in the job settings.
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

  /** Output Group settings, including type
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

  /** Specific settings for this type of output.
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

  /** If you work with a third party video watermarking partner, use the group of settings that correspond with your watermarking partner to include watermarks in your output.
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

  /** A policy configures behavior that you allow or disallow for your account. For information about MediaConvert policies, see the user guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  @js.native
  trait Policy extends js.Object {
    var HttpInputs: js.UndefOr[InputPolicy]
    var HttpsInputs: js.UndefOr[InputPolicy]
    var S3Inputs: js.UndefOr[InputPolicy]
  }

  object Policy {
    @inline
    def apply(
        HttpInputs: js.UndefOr[InputPolicy] = js.undefined,
        HttpsInputs: js.UndefOr[InputPolicy] = js.undefined,
        S3Inputs: js.UndefOr[InputPolicy] = js.undefined
    ): Policy = {
      val __obj = js.Dynamic.literal()
      HttpInputs.foreach(__v => __obj.updateDynamic("HttpInputs")(__v.asInstanceOf[js.Any]))
      HttpsInputs.foreach(__v => __obj.updateDynamic("HttpsInputs")(__v.asInstanceOf[js.Any]))
      S3Inputs.foreach(__v => __obj.updateDynamic("S3Inputs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Policy]
    }
  }

  /** A preset is a collection of preconfigured media conversion settings that you want MediaConvert to apply to the output during the conversion process.
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

  /** Settings for preset
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

  /** Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value PRORES.
    */
  @js.native
  trait ProresSettings extends js.Object {
    var ChromaSampling: js.UndefOr[ProresChromaSampling]
    var CodecProfile: js.UndefOr[ProresCodecProfile]
    var FramerateControl: js.UndefOr[ProresFramerateControl]
    var FramerateConversionAlgorithm: js.UndefOr[ProresFramerateConversionAlgorithm]
    var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647]
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647]
    var InterlaceMode: js.UndefOr[ProresInterlaceMode]
    var ParControl: js.UndefOr[ProresParControl]
    var ParDenominator: js.UndefOr[__integerMin1Max2147483647]
    var ParNumerator: js.UndefOr[__integerMin1Max2147483647]
    var ScanTypeConversionMode: js.UndefOr[ProresScanTypeConversionMode]
    var SlowPal: js.UndefOr[ProresSlowPal]
    var Telecine: js.UndefOr[ProresTelecine]
  }

  object ProresSettings {
    @inline
    def apply(
        ChromaSampling: js.UndefOr[ProresChromaSampling] = js.undefined,
        CodecProfile: js.UndefOr[ProresCodecProfile] = js.undefined,
        FramerateControl: js.UndefOr[ProresFramerateControl] = js.undefined,
        FramerateConversionAlgorithm: js.UndefOr[ProresFramerateConversionAlgorithm] = js.undefined,
        FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        InterlaceMode: js.UndefOr[ProresInterlaceMode] = js.undefined,
        ParControl: js.UndefOr[ProresParControl] = js.undefined,
        ParDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        ParNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        ScanTypeConversionMode: js.UndefOr[ProresScanTypeConversionMode] = js.undefined,
        SlowPal: js.UndefOr[ProresSlowPal] = js.undefined,
        Telecine: js.UndefOr[ProresTelecine] = js.undefined
    ): ProresSettings = {
      val __obj = js.Dynamic.literal()
      ChromaSampling.foreach(__v => __obj.updateDynamic("ChromaSampling")(__v.asInstanceOf[js.Any]))
      CodecProfile.foreach(__v => __obj.updateDynamic("CodecProfile")(__v.asInstanceOf[js.Any]))
      FramerateControl.foreach(__v => __obj.updateDynamic("FramerateControl")(__v.asInstanceOf[js.Any]))
      FramerateConversionAlgorithm.foreach(__v => __obj.updateDynamic("FramerateConversionAlgorithm")(__v.asInstanceOf[js.Any]))
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      InterlaceMode.foreach(__v => __obj.updateDynamic("InterlaceMode")(__v.asInstanceOf[js.Any]))
      ParControl.foreach(__v => __obj.updateDynamic("ParControl")(__v.asInstanceOf[js.Any]))
      ParDenominator.foreach(__v => __obj.updateDynamic("ParDenominator")(__v.asInstanceOf[js.Any]))
      ParNumerator.foreach(__v => __obj.updateDynamic("ParNumerator")(__v.asInstanceOf[js.Any]))
      ScanTypeConversionMode.foreach(__v => __obj.updateDynamic("ScanTypeConversionMode")(__v.asInstanceOf[js.Any]))
      SlowPal.foreach(__v => __obj.updateDynamic("SlowPal")(__v.asInstanceOf[js.Any]))
      Telecine.foreach(__v => __obj.updateDynamic("Telecine")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProresSettings]
    }
  }

  @js.native
  trait PutPolicyRequest extends js.Object {
    var Policy: Policy
  }

  object PutPolicyRequest {
    @inline
    def apply(
        Policy: Policy
    ): PutPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Policy" -> Policy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutPolicyRequest]
    }
  }

  @js.native
  trait PutPolicyResponse extends js.Object {
    var Policy: js.UndefOr[Policy]
  }

  object PutPolicyResponse {
    @inline
    def apply(
        Policy: js.UndefOr[Policy] = js.undefined
    ): PutPolicyResponse = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPolicyResponse]
    }
  }

  /** You can use queues to manage the resources that are available to your AWS account for running multiple transcoding jobs at the same time. If you don't specify a queue, the service sends all jobs through the default queue. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html.
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

  /** Description of the source and destination queues between which the job has moved, along with the timestamp of the move
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

  /** Use Rectangle to identify a specific area of the video frame.
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

  /** Use Manual audio remixing (RemixSettings) to adjust audio levels for each audio channel in each output of your job. With audio remixing, you can output more or fewer audio channels than your input audio source provides.
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

  /** Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand queues.
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

  /** Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand queues.
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

  /** The Amazon Resource Name (ARN) and tags for an AWS Elemental MediaConvert resource.
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

  /** Optional. Have MediaConvert automatically apply Amazon S3 access control for the outputs in this output group. When you don't use this setting, S3 automatically applies the default access control list PRIVATE.
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

  /** Settings associated with S3 destination
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

  /** Settings for how your job outputs are encrypted as they are uploaded to Amazon S3.
    */
  @js.native
  trait S3EncryptionSettings extends js.Object {
    var EncryptionType: js.UndefOr[S3ServerSideEncryptionType]
    var KmsEncryptionContext: js.UndefOr[__stringPatternAZaZ0902]
    var KmsKeyArn: js.UndefOr[__stringPatternArnAwsUsGovCnKmsAZ26EastWestCentralNorthSouthEastWest1912D12KeyAFAF098AFAF094AFAF094AFAF094AFAF0912MrkAFAF0932]
  }

  object S3EncryptionSettings {
    @inline
    def apply(
        EncryptionType: js.UndefOr[S3ServerSideEncryptionType] = js.undefined,
        KmsEncryptionContext: js.UndefOr[__stringPatternAZaZ0902] = js.undefined,
        KmsKeyArn: js.UndefOr[__stringPatternArnAwsUsGovCnKmsAZ26EastWestCentralNorthSouthEastWest1912D12KeyAFAF098AFAF094AFAF094AFAF094AFAF0912MrkAFAF0932] = js.undefined
    ): S3EncryptionSettings = {
      val __obj = js.Dynamic.literal()
      EncryptionType.foreach(__v => __obj.updateDynamic("EncryptionType")(__v.asInstanceOf[js.Any]))
      KmsEncryptionContext.foreach(__v => __obj.updateDynamic("KmsEncryptionContext")(__v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3EncryptionSettings]
    }
  }

  /** Settings related to SCC captions. SCC is a sidecar format that holds captions in a file that is separate from the video container. Set up sidecar captions in the same output group, but different output from your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/scc-srt-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to SCC.
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

  /** If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a SPEKE-compliant key provider. If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
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

  /** If your output group type is CMAF, use these settings when doing DRM encryption with a SPEKE-compliant key provider. If your output group type is HLS, DASH, or Microsoft Smooth, use the SpekeKeyProvider settings instead.
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

  /** Settings related to SRT captions. SRT is a sidecar format that holds captions in a file that is separate from the video container. Set up sidecar captions in the same output group, but different output from your video. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to SRT.
    */
  @js.native
  trait SrtDestinationSettings extends js.Object {
    var StylePassthrough: js.UndefOr[SrtStylePassthrough]
  }

  object SrtDestinationSettings {
    @inline
    def apply(
        StylePassthrough: js.UndefOr[SrtStylePassthrough] = js.undefined
    ): SrtDestinationSettings = {
      val __obj = js.Dynamic.literal()
      StylePassthrough.foreach(__v => __obj.updateDynamic("StylePassthrough")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SrtDestinationSettings]
    }
  }

  /** Use these settings to set up encryption with a static key provider.
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
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** Settings related to teletext captions. Set up teletext captions in the same output as your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/teletext-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to TELETEXT.
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

  /** Settings specific to Teletext caption sources, including Page number.
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

  /** Settings for burning the output timecode and specified prefix into the output.
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

  /** These settings control how the service handles timecodes throughout the job. These settings don't affect input clipping.
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

  /** Insert user-defined custom ID3 metadata (id3) at timecodes (timecode) that you specify. In each output that you want to include this metadata, you must set ID3 metadata (timedMetadata) to Passthrough (PASSTHROUGH).
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

  /** Information about when jobs are submitted, started, and finished is specified in Unix epoch format in seconds.
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

  /** Settings specific to caption sources that are specified by track number. Currently, this is only IMSC captions in an IMF package. If your caption source is IMSC 1.1 in a separate xml file, use FileSourceSettings instead of TrackSourceSettings.
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

  /** Settings related to TTML captions. TTML is a sidecar format that holds captions in a file that is separate from the video container. Set up sidecar captions in the same output group, but different output from your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to TTML.
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
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
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

  /** Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VC3
    */
  @js.native
  trait Vc3Settings extends js.Object {
    var FramerateControl: js.UndefOr[Vc3FramerateControl]
    var FramerateConversionAlgorithm: js.UndefOr[Vc3FramerateConversionAlgorithm]
    var FramerateDenominator: js.UndefOr[__integerMin1Max1001]
    var FramerateNumerator: js.UndefOr[__integerMin24Max60000]
    var InterlaceMode: js.UndefOr[Vc3InterlaceMode]
    var ScanTypeConversionMode: js.UndefOr[Vc3ScanTypeConversionMode]
    var SlowPal: js.UndefOr[Vc3SlowPal]
    var Telecine: js.UndefOr[Vc3Telecine]
    var Vc3Class: js.UndefOr[Vc3Class]
  }

  object Vc3Settings {
    @inline
    def apply(
        FramerateControl: js.UndefOr[Vc3FramerateControl] = js.undefined,
        FramerateConversionAlgorithm: js.UndefOr[Vc3FramerateConversionAlgorithm] = js.undefined,
        FramerateDenominator: js.UndefOr[__integerMin1Max1001] = js.undefined,
        FramerateNumerator: js.UndefOr[__integerMin24Max60000] = js.undefined,
        InterlaceMode: js.UndefOr[Vc3InterlaceMode] = js.undefined,
        ScanTypeConversionMode: js.UndefOr[Vc3ScanTypeConversionMode] = js.undefined,
        SlowPal: js.UndefOr[Vc3SlowPal] = js.undefined,
        Telecine: js.UndefOr[Vc3Telecine] = js.undefined,
        Vc3Class: js.UndefOr[Vc3Class] = js.undefined
    ): Vc3Settings = {
      val __obj = js.Dynamic.literal()
      FramerateControl.foreach(__v => __obj.updateDynamic("FramerateControl")(__v.asInstanceOf[js.Any]))
      FramerateConversionAlgorithm.foreach(__v => __obj.updateDynamic("FramerateConversionAlgorithm")(__v.asInstanceOf[js.Any]))
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      InterlaceMode.foreach(__v => __obj.updateDynamic("InterlaceMode")(__v.asInstanceOf[js.Any]))
      ScanTypeConversionMode.foreach(__v => __obj.updateDynamic("ScanTypeConversionMode")(__v.asInstanceOf[js.Any]))
      SlowPal.foreach(__v => __obj.updateDynamic("SlowPal")(__v.asInstanceOf[js.Any]))
      Telecine.foreach(__v => __obj.updateDynamic("Telecine")(__v.asInstanceOf[js.Any]))
      Vc3Class.foreach(__v => __obj.updateDynamic("Vc3Class")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Vc3Settings]
    }
  }

  /** Video codec settings, (CodecSettings) under (VideoDescription), contains the group of settings related to video encoding. The settings in this group vary depending on the value that you choose for Video codec (Codec). For each codec enum that you choose, define the corresponding settings object. The following lists the codec enum, settings object pairs. * AV1, Av1Settings * AVC_INTRA, AvcIntraSettings * FRAME_CAPTURE, FrameCaptureSettings * H_264, H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES, ProresSettings * VC3, Vc3Settings * VP8, Vp8Settings * VP9, Vp9Settings * XAVC, XavcSettings
    */
  @js.native
  trait VideoCodecSettings extends js.Object {
    var Av1Settings: js.UndefOr[Av1Settings]
    var AvcIntraSettings: js.UndefOr[AvcIntraSettings]
    var Codec: js.UndefOr[VideoCodec]
    var FrameCaptureSettings: js.UndefOr[FrameCaptureSettings]
    var H264Settings: js.UndefOr[H264Settings]
    var H265Settings: js.UndefOr[H265Settings]
    var Mpeg2Settings: js.UndefOr[Mpeg2Settings]
    var ProresSettings: js.UndefOr[ProresSettings]
    var Vc3Settings: js.UndefOr[Vc3Settings]
    var Vp8Settings: js.UndefOr[Vp8Settings]
    var Vp9Settings: js.UndefOr[Vp9Settings]
    var XavcSettings: js.UndefOr[XavcSettings]
  }

  object VideoCodecSettings {
    @inline
    def apply(
        Av1Settings: js.UndefOr[Av1Settings] = js.undefined,
        AvcIntraSettings: js.UndefOr[AvcIntraSettings] = js.undefined,
        Codec: js.UndefOr[VideoCodec] = js.undefined,
        FrameCaptureSettings: js.UndefOr[FrameCaptureSettings] = js.undefined,
        H264Settings: js.UndefOr[H264Settings] = js.undefined,
        H265Settings: js.UndefOr[H265Settings] = js.undefined,
        Mpeg2Settings: js.UndefOr[Mpeg2Settings] = js.undefined,
        ProresSettings: js.UndefOr[ProresSettings] = js.undefined,
        Vc3Settings: js.UndefOr[Vc3Settings] = js.undefined,
        Vp8Settings: js.UndefOr[Vp8Settings] = js.undefined,
        Vp9Settings: js.UndefOr[Vp9Settings] = js.undefined,
        XavcSettings: js.UndefOr[XavcSettings] = js.undefined
    ): VideoCodecSettings = {
      val __obj = js.Dynamic.literal()
      Av1Settings.foreach(__v => __obj.updateDynamic("Av1Settings")(__v.asInstanceOf[js.Any]))
      AvcIntraSettings.foreach(__v => __obj.updateDynamic("AvcIntraSettings")(__v.asInstanceOf[js.Any]))
      Codec.foreach(__v => __obj.updateDynamic("Codec")(__v.asInstanceOf[js.Any]))
      FrameCaptureSettings.foreach(__v => __obj.updateDynamic("FrameCaptureSettings")(__v.asInstanceOf[js.Any]))
      H264Settings.foreach(__v => __obj.updateDynamic("H264Settings")(__v.asInstanceOf[js.Any]))
      H265Settings.foreach(__v => __obj.updateDynamic("H265Settings")(__v.asInstanceOf[js.Any]))
      Mpeg2Settings.foreach(__v => __obj.updateDynamic("Mpeg2Settings")(__v.asInstanceOf[js.Any]))
      ProresSettings.foreach(__v => __obj.updateDynamic("ProresSettings")(__v.asInstanceOf[js.Any]))
      Vc3Settings.foreach(__v => __obj.updateDynamic("Vc3Settings")(__v.asInstanceOf[js.Any]))
      Vp8Settings.foreach(__v => __obj.updateDynamic("Vp8Settings")(__v.asInstanceOf[js.Any]))
      Vp9Settings.foreach(__v => __obj.updateDynamic("Vp9Settings")(__v.asInstanceOf[js.Any]))
      XavcSettings.foreach(__v => __obj.updateDynamic("XavcSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoCodecSettings]
    }
  }

  /** Settings related to video encoding of your output. The specific video settings depend on the video codec that you choose. When you work directly in your JSON job specification, include one instance of Video description (VideoDescription) per output.
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

  /** Contains details about the output's video stream
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

  /** Find additional transcoding features under Preprocessors (VideoPreprocessors). Enable the features at each output individually. These features are disabled by default.
    */
  @js.native
  trait VideoPreprocessor extends js.Object {
    var ColorCorrector: js.UndefOr[ColorCorrector]
    var Deinterlacer: js.UndefOr[Deinterlacer]
    var DolbyVision: js.UndefOr[DolbyVision]
    var Hdr10Plus: js.UndefOr[Hdr10Plus]
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
        Hdr10Plus: js.UndefOr[Hdr10Plus] = js.undefined,
        ImageInserter: js.UndefOr[ImageInserter] = js.undefined,
        NoiseReducer: js.UndefOr[NoiseReducer] = js.undefined,
        PartnerWatermarking: js.UndefOr[PartnerWatermarking] = js.undefined,
        TimecodeBurnin: js.UndefOr[TimecodeBurnin] = js.undefined
    ): VideoPreprocessor = {
      val __obj = js.Dynamic.literal()
      ColorCorrector.foreach(__v => __obj.updateDynamic("ColorCorrector")(__v.asInstanceOf[js.Any]))
      Deinterlacer.foreach(__v => __obj.updateDynamic("Deinterlacer")(__v.asInstanceOf[js.Any]))
      DolbyVision.foreach(__v => __obj.updateDynamic("DolbyVision")(__v.asInstanceOf[js.Any]))
      Hdr10Plus.foreach(__v => __obj.updateDynamic("Hdr10Plus")(__v.asInstanceOf[js.Any]))
      ImageInserter.foreach(__v => __obj.updateDynamic("ImageInserter")(__v.asInstanceOf[js.Any]))
      NoiseReducer.foreach(__v => __obj.updateDynamic("NoiseReducer")(__v.asInstanceOf[js.Any]))
      PartnerWatermarking.foreach(__v => __obj.updateDynamic("PartnerWatermarking")(__v.asInstanceOf[js.Any]))
      TimecodeBurnin.foreach(__v => __obj.updateDynamic("TimecodeBurnin")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoPreprocessor]
    }
  }

  /** Input video selectors contain the video settings for the input. Each of your inputs can have up to one video selector.
    */
  @js.native
  trait VideoSelector extends js.Object {
    var AlphaBehavior: js.UndefOr[AlphaBehavior]
    var ColorSpace: js.UndefOr[ColorSpace]
    var ColorSpaceUsage: js.UndefOr[ColorSpaceUsage]
    var EmbeddedTimecodeOverride: js.UndefOr[EmbeddedTimecodeOverride]
    var Hdr10Metadata: js.UndefOr[Hdr10Metadata]
    var PadVideo: js.UndefOr[PadVideo]
    var Pid: js.UndefOr[__integerMin1Max2147483647]
    var ProgramNumber: js.UndefOr[__integerMinNegative2147483648Max2147483647]
    var Rotate: js.UndefOr[InputRotate]
    var SampleRange: js.UndefOr[InputSampleRange]
  }

  object VideoSelector {
    @inline
    def apply(
        AlphaBehavior: js.UndefOr[AlphaBehavior] = js.undefined,
        ColorSpace: js.UndefOr[ColorSpace] = js.undefined,
        ColorSpaceUsage: js.UndefOr[ColorSpaceUsage] = js.undefined,
        EmbeddedTimecodeOverride: js.UndefOr[EmbeddedTimecodeOverride] = js.undefined,
        Hdr10Metadata: js.UndefOr[Hdr10Metadata] = js.undefined,
        PadVideo: js.UndefOr[PadVideo] = js.undefined,
        Pid: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
        ProgramNumber: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
        Rotate: js.UndefOr[InputRotate] = js.undefined,
        SampleRange: js.UndefOr[InputSampleRange] = js.undefined
    ): VideoSelector = {
      val __obj = js.Dynamic.literal()
      AlphaBehavior.foreach(__v => __obj.updateDynamic("AlphaBehavior")(__v.asInstanceOf[js.Any]))
      ColorSpace.foreach(__v => __obj.updateDynamic("ColorSpace")(__v.asInstanceOf[js.Any]))
      ColorSpaceUsage.foreach(__v => __obj.updateDynamic("ColorSpaceUsage")(__v.asInstanceOf[js.Any]))
      EmbeddedTimecodeOverride.foreach(__v => __obj.updateDynamic("EmbeddedTimecodeOverride")(__v.asInstanceOf[js.Any]))
      Hdr10Metadata.foreach(__v => __obj.updateDynamic("Hdr10Metadata")(__v.asInstanceOf[js.Any]))
      PadVideo.foreach(__v => __obj.updateDynamic("PadVideo")(__v.asInstanceOf[js.Any]))
      Pid.foreach(__v => __obj.updateDynamic("Pid")(__v.asInstanceOf[js.Any]))
      ProgramNumber.foreach(__v => __obj.updateDynamic("ProgramNumber")(__v.asInstanceOf[js.Any]))
      Rotate.foreach(__v => __obj.updateDynamic("Rotate")(__v.asInstanceOf[js.Any]))
      SampleRange.foreach(__v => __obj.updateDynamic("SampleRange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoSelector]
    }
  }

  /** Required when you set Codec, under AudioDescriptions>CodecSettings, to the value Vorbis.
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

  /** Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP8.
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

  /** Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value VP9.
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

  /** Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value WAV.
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

  /** Settings related to WebVTT captions. WebVTT is a sidecar format that holds captions in a file that is separate from the video container. Set up sidecar captions in the same output group, but different output from your video. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/ttml-and-webvtt-output-captions.html. When you work directly in your JSON job specification, include this object and any required children when you set destinationType to WebVTT.
    */
  @js.native
  trait WebvttDestinationSettings extends js.Object {
    var Accessibility: js.UndefOr[WebvttAccessibilitySubs]
    var StylePassthrough: js.UndefOr[WebvttStylePassthrough]
  }

  object WebvttDestinationSettings {
    @inline
    def apply(
        Accessibility: js.UndefOr[WebvttAccessibilitySubs] = js.undefined,
        StylePassthrough: js.UndefOr[WebvttStylePassthrough] = js.undefined
    ): WebvttDestinationSettings = {
      val __obj = js.Dynamic.literal()
      Accessibility.foreach(__v => __obj.updateDynamic("Accessibility")(__v.asInstanceOf[js.Any]))
      StylePassthrough.foreach(__v => __obj.updateDynamic("StylePassthrough")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WebvttDestinationSettings]
    }
  }

  /** Settings specific to WebVTT sources in HLS alternative rendition group. Specify the properties (renditionGroupId, renditionName or renditionLanguageCode) to identify the unique subtitle track among the alternative rendition groups present in the HLS manifest. If no unique track is found, or multiple tracks match the specified properties, the job fails. If there is only one subtitle track in the rendition group, the settings can be left empty and the default subtitle track will be chosen. If your caption source is a sidecar file, use FileSourceSettings instead of WebvttHlsSourceSettings.
    */
  @js.native
  trait WebvttHlsSourceSettings extends js.Object {
    var RenditionGroupId: js.UndefOr[__string]
    var RenditionLanguageCode: js.UndefOr[LanguageCode]
    var RenditionName: js.UndefOr[__string]
  }

  object WebvttHlsSourceSettings {
    @inline
    def apply(
        RenditionGroupId: js.UndefOr[__string] = js.undefined,
        RenditionLanguageCode: js.UndefOr[LanguageCode] = js.undefined,
        RenditionName: js.UndefOr[__string] = js.undefined
    ): WebvttHlsSourceSettings = {
      val __obj = js.Dynamic.literal()
      RenditionGroupId.foreach(__v => __obj.updateDynamic("RenditionGroupId")(__v.asInstanceOf[js.Any]))
      RenditionLanguageCode.foreach(__v => __obj.updateDynamic("RenditionLanguageCode")(__v.asInstanceOf[js.Any]))
      RenditionName.foreach(__v => __obj.updateDynamic("RenditionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WebvttHlsSourceSettings]
    }
  }

  /** Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_4K_INTRA_CBG.
    */
  @js.native
  trait Xavc4kIntraCbgProfileSettings extends js.Object {
    var XavcClass: js.UndefOr[Xavc4kIntraCbgProfileClass]
  }

  object Xavc4kIntraCbgProfileSettings {
    @inline
    def apply(
        XavcClass: js.UndefOr[Xavc4kIntraCbgProfileClass] = js.undefined
    ): Xavc4kIntraCbgProfileSettings = {
      val __obj = js.Dynamic.literal()
      XavcClass.foreach(__v => __obj.updateDynamic("XavcClass")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Xavc4kIntraCbgProfileSettings]
    }
  }

  /** Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_4K_INTRA_VBR.
    */
  @js.native
  trait Xavc4kIntraVbrProfileSettings extends js.Object {
    var XavcClass: js.UndefOr[Xavc4kIntraVbrProfileClass]
  }

  object Xavc4kIntraVbrProfileSettings {
    @inline
    def apply(
        XavcClass: js.UndefOr[Xavc4kIntraVbrProfileClass] = js.undefined
    ): Xavc4kIntraVbrProfileSettings = {
      val __obj = js.Dynamic.literal()
      XavcClass.foreach(__v => __obj.updateDynamic("XavcClass")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Xavc4kIntraVbrProfileSettings]
    }
  }

  /** Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_4K.
    */
  @js.native
  trait Xavc4kProfileSettings extends js.Object {
    var BitrateClass: js.UndefOr[Xavc4kProfileBitrateClass]
    var CodecProfile: js.UndefOr[Xavc4kProfileCodecProfile]
    var FlickerAdaptiveQuantization: js.UndefOr[XavcFlickerAdaptiveQuantization]
    var GopBReference: js.UndefOr[XavcGopBReference]
    var GopClosedCadence: js.UndefOr[__integerMin0Max2147483647]
    var HrdBufferSize: js.UndefOr[__integerMin0Max1152000000]
    var QualityTuningLevel: js.UndefOr[Xavc4kProfileQualityTuningLevel]
    var Slices: js.UndefOr[__integerMin8Max12]
  }

  object Xavc4kProfileSettings {
    @inline
    def apply(
        BitrateClass: js.UndefOr[Xavc4kProfileBitrateClass] = js.undefined,
        CodecProfile: js.UndefOr[Xavc4kProfileCodecProfile] = js.undefined,
        FlickerAdaptiveQuantization: js.UndefOr[XavcFlickerAdaptiveQuantization] = js.undefined,
        GopBReference: js.UndefOr[XavcGopBReference] = js.undefined,
        GopClosedCadence: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        HrdBufferSize: js.UndefOr[__integerMin0Max1152000000] = js.undefined,
        QualityTuningLevel: js.UndefOr[Xavc4kProfileQualityTuningLevel] = js.undefined,
        Slices: js.UndefOr[__integerMin8Max12] = js.undefined
    ): Xavc4kProfileSettings = {
      val __obj = js.Dynamic.literal()
      BitrateClass.foreach(__v => __obj.updateDynamic("BitrateClass")(__v.asInstanceOf[js.Any]))
      CodecProfile.foreach(__v => __obj.updateDynamic("CodecProfile")(__v.asInstanceOf[js.Any]))
      FlickerAdaptiveQuantization.foreach(__v => __obj.updateDynamic("FlickerAdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      GopBReference.foreach(__v => __obj.updateDynamic("GopBReference")(__v.asInstanceOf[js.Any]))
      GopClosedCadence.foreach(__v => __obj.updateDynamic("GopClosedCadence")(__v.asInstanceOf[js.Any]))
      HrdBufferSize.foreach(__v => __obj.updateDynamic("HrdBufferSize")(__v.asInstanceOf[js.Any]))
      QualityTuningLevel.foreach(__v => __obj.updateDynamic("QualityTuningLevel")(__v.asInstanceOf[js.Any]))
      Slices.foreach(__v => __obj.updateDynamic("Slices")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Xavc4kProfileSettings]
    }
  }

  /** Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_HD_INTRA_CBG.
    */
  @js.native
  trait XavcHdIntraCbgProfileSettings extends js.Object {
    var XavcClass: js.UndefOr[XavcHdIntraCbgProfileClass]
  }

  object XavcHdIntraCbgProfileSettings {
    @inline
    def apply(
        XavcClass: js.UndefOr[XavcHdIntraCbgProfileClass] = js.undefined
    ): XavcHdIntraCbgProfileSettings = {
      val __obj = js.Dynamic.literal()
      XavcClass.foreach(__v => __obj.updateDynamic("XavcClass")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[XavcHdIntraCbgProfileSettings]
    }
  }

  /** Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_HD.
    */
  @js.native
  trait XavcHdProfileSettings extends js.Object {
    var BitrateClass: js.UndefOr[XavcHdProfileBitrateClass]
    var FlickerAdaptiveQuantization: js.UndefOr[XavcFlickerAdaptiveQuantization]
    var GopBReference: js.UndefOr[XavcGopBReference]
    var GopClosedCadence: js.UndefOr[__integerMin0Max2147483647]
    var HrdBufferSize: js.UndefOr[__integerMin0Max1152000000]
    var InterlaceMode: js.UndefOr[XavcInterlaceMode]
    var QualityTuningLevel: js.UndefOr[XavcHdProfileQualityTuningLevel]
    var Slices: js.UndefOr[__integerMin4Max12]
    var Telecine: js.UndefOr[XavcHdProfileTelecine]
  }

  object XavcHdProfileSettings {
    @inline
    def apply(
        BitrateClass: js.UndefOr[XavcHdProfileBitrateClass] = js.undefined,
        FlickerAdaptiveQuantization: js.UndefOr[XavcFlickerAdaptiveQuantization] = js.undefined,
        GopBReference: js.UndefOr[XavcGopBReference] = js.undefined,
        GopClosedCadence: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
        HrdBufferSize: js.UndefOr[__integerMin0Max1152000000] = js.undefined,
        InterlaceMode: js.UndefOr[XavcInterlaceMode] = js.undefined,
        QualityTuningLevel: js.UndefOr[XavcHdProfileQualityTuningLevel] = js.undefined,
        Slices: js.UndefOr[__integerMin4Max12] = js.undefined,
        Telecine: js.UndefOr[XavcHdProfileTelecine] = js.undefined
    ): XavcHdProfileSettings = {
      val __obj = js.Dynamic.literal()
      BitrateClass.foreach(__v => __obj.updateDynamic("BitrateClass")(__v.asInstanceOf[js.Any]))
      FlickerAdaptiveQuantization.foreach(__v => __obj.updateDynamic("FlickerAdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      GopBReference.foreach(__v => __obj.updateDynamic("GopBReference")(__v.asInstanceOf[js.Any]))
      GopClosedCadence.foreach(__v => __obj.updateDynamic("GopClosedCadence")(__v.asInstanceOf[js.Any]))
      HrdBufferSize.foreach(__v => __obj.updateDynamic("HrdBufferSize")(__v.asInstanceOf[js.Any]))
      InterlaceMode.foreach(__v => __obj.updateDynamic("InterlaceMode")(__v.asInstanceOf[js.Any]))
      QualityTuningLevel.foreach(__v => __obj.updateDynamic("QualityTuningLevel")(__v.asInstanceOf[js.Any]))
      Slices.foreach(__v => __obj.updateDynamic("Slices")(__v.asInstanceOf[js.Any]))
      Telecine.foreach(__v => __obj.updateDynamic("Telecine")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[XavcHdProfileSettings]
    }
  }

  /** Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value XAVC.
    */
  @js.native
  trait XavcSettings extends js.Object {
    var AdaptiveQuantization: js.UndefOr[XavcAdaptiveQuantization]
    var EntropyEncoding: js.UndefOr[XavcEntropyEncoding]
    var FramerateControl: js.UndefOr[XavcFramerateControl]
    var FramerateConversionAlgorithm: js.UndefOr[XavcFramerateConversionAlgorithm]
    var FramerateDenominator: js.UndefOr[__integerMin1Max1001]
    var FramerateNumerator: js.UndefOr[__integerMin24Max60000]
    var Profile: js.UndefOr[XavcProfile]
    var SlowPal: js.UndefOr[XavcSlowPal]
    var Softness: js.UndefOr[__integerMin0Max128]
    var SpatialAdaptiveQuantization: js.UndefOr[XavcSpatialAdaptiveQuantization]
    var TemporalAdaptiveQuantization: js.UndefOr[XavcTemporalAdaptiveQuantization]
    var Xavc4kIntraCbgProfileSettings: js.UndefOr[Xavc4kIntraCbgProfileSettings]
    var Xavc4kIntraVbrProfileSettings: js.UndefOr[Xavc4kIntraVbrProfileSettings]
    var Xavc4kProfileSettings: js.UndefOr[Xavc4kProfileSettings]
    var XavcHdIntraCbgProfileSettings: js.UndefOr[XavcHdIntraCbgProfileSettings]
    var XavcHdProfileSettings: js.UndefOr[XavcHdProfileSettings]
  }

  object XavcSettings {
    @inline
    def apply(
        AdaptiveQuantization: js.UndefOr[XavcAdaptiveQuantization] = js.undefined,
        EntropyEncoding: js.UndefOr[XavcEntropyEncoding] = js.undefined,
        FramerateControl: js.UndefOr[XavcFramerateControl] = js.undefined,
        FramerateConversionAlgorithm: js.UndefOr[XavcFramerateConversionAlgorithm] = js.undefined,
        FramerateDenominator: js.UndefOr[__integerMin1Max1001] = js.undefined,
        FramerateNumerator: js.UndefOr[__integerMin24Max60000] = js.undefined,
        Profile: js.UndefOr[XavcProfile] = js.undefined,
        SlowPal: js.UndefOr[XavcSlowPal] = js.undefined,
        Softness: js.UndefOr[__integerMin0Max128] = js.undefined,
        SpatialAdaptiveQuantization: js.UndefOr[XavcSpatialAdaptiveQuantization] = js.undefined,
        TemporalAdaptiveQuantization: js.UndefOr[XavcTemporalAdaptiveQuantization] = js.undefined,
        Xavc4kIntraCbgProfileSettings: js.UndefOr[Xavc4kIntraCbgProfileSettings] = js.undefined,
        Xavc4kIntraVbrProfileSettings: js.UndefOr[Xavc4kIntraVbrProfileSettings] = js.undefined,
        Xavc4kProfileSettings: js.UndefOr[Xavc4kProfileSettings] = js.undefined,
        XavcHdIntraCbgProfileSettings: js.UndefOr[XavcHdIntraCbgProfileSettings] = js.undefined,
        XavcHdProfileSettings: js.UndefOr[XavcHdProfileSettings] = js.undefined
    ): XavcSettings = {
      val __obj = js.Dynamic.literal()
      AdaptiveQuantization.foreach(__v => __obj.updateDynamic("AdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      EntropyEncoding.foreach(__v => __obj.updateDynamic("EntropyEncoding")(__v.asInstanceOf[js.Any]))
      FramerateControl.foreach(__v => __obj.updateDynamic("FramerateControl")(__v.asInstanceOf[js.Any]))
      FramerateConversionAlgorithm.foreach(__v => __obj.updateDynamic("FramerateConversionAlgorithm")(__v.asInstanceOf[js.Any]))
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      Profile.foreach(__v => __obj.updateDynamic("Profile")(__v.asInstanceOf[js.Any]))
      SlowPal.foreach(__v => __obj.updateDynamic("SlowPal")(__v.asInstanceOf[js.Any]))
      Softness.foreach(__v => __obj.updateDynamic("Softness")(__v.asInstanceOf[js.Any]))
      SpatialAdaptiveQuantization.foreach(__v => __obj.updateDynamic("SpatialAdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      TemporalAdaptiveQuantization.foreach(__v => __obj.updateDynamic("TemporalAdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      Xavc4kIntraCbgProfileSettings.foreach(__v => __obj.updateDynamic("Xavc4kIntraCbgProfileSettings")(__v.asInstanceOf[js.Any]))
      Xavc4kIntraVbrProfileSettings.foreach(__v => __obj.updateDynamic("Xavc4kIntraVbrProfileSettings")(__v.asInstanceOf[js.Any]))
      Xavc4kProfileSettings.foreach(__v => __obj.updateDynamic("Xavc4kProfileSettings")(__v.asInstanceOf[js.Any]))
      XavcHdIntraCbgProfileSettings.foreach(__v => __obj.updateDynamic("XavcHdIntraCbgProfileSettings")(__v.asInstanceOf[js.Any]))
      XavcHdProfileSettings.foreach(__v => __obj.updateDynamic("XavcHdProfileSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[XavcSettings]
    }
  }
}
