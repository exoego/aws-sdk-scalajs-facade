package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object medialive {
  type AacCodingMode                                 = String
  type AacInputType                                  = String
  type AacProfile                                    = String
  type AacRateControlMode                            = String
  type AacRawFormat                                  = String
  type AacSpec                                       = String
  type AacVbrQuality                                 = String
  type Ac3BitstreamMode                              = String
  type Ac3CodingMode                                 = String
  type Ac3DrcProfile                                 = String
  type Ac3LfeFilter                                  = String
  type Ac3MetadataControl                            = String
  type AfdSignaling                                  = String
  type AudioDescriptionAudioTypeControl              = String
  type AudioDescriptionLanguageCodeControl           = String
  type AudioLanguageSelectionPolicy                  = String
  type AudioNormalizationAlgorithm                   = String
  type AudioNormalizationAlgorithmControl            = String
  type AudioOnlyHlsTrackType                         = String
  type AudioType                                     = String
  type AuthenticationScheme                          = String
  type AvailBlankingState                            = String
  type BlackoutSlateNetworkEndBlackout               = String
  type BlackoutSlateState                            = String
  type BurnInAlignment                               = String
  type BurnInBackgroundColor                         = String
  type BurnInFontColor                               = String
  type BurnInOutlineColor                            = String
  type BurnInShadowColor                             = String
  type BurnInTeletextGridControl                     = String
  type ChannelClass                                  = String
  type ChannelState                                  = String
  type DvbSdtOutputSdt                               = String
  type DvbSubDestinationAlignment                    = String
  type DvbSubDestinationBackgroundColor              = String
  type DvbSubDestinationFontColor                    = String
  type DvbSubDestinationOutlineColor                 = String
  type DvbSubDestinationShadowColor                  = String
  type DvbSubDestinationTeletextGridControl          = String
  type Eac3AttenuationControl                        = String
  type Eac3BitstreamMode                             = String
  type Eac3CodingMode                                = String
  type Eac3DcFilter                                  = String
  type Eac3DrcLine                                   = String
  type Eac3DrcRf                                     = String
  type Eac3LfeControl                                = String
  type Eac3LfeFilter                                 = String
  type Eac3MetadataControl                           = String
  type Eac3PassthroughControl                        = String
  type Eac3PhaseControl                              = String
  type Eac3StereoDownmix                             = String
  type Eac3SurroundExMode                            = String
  type Eac3SurroundMode                              = String
  type EmbeddedConvert608To708                       = String
  type EmbeddedScte20Detection                       = String
  type FecOutputIncludeFec                           = String
  type FixedAfd                                      = String
  type FollowPoint                                   = String
  type GlobalConfigurationInputEndAction             = String
  type GlobalConfigurationLowFramerateInputs         = String
  type GlobalConfigurationOutputLockingMode          = String
  type GlobalConfigurationOutputTimingSource         = String
  type H264AdaptiveQuantization                      = String
  type H264ColorMetadata                             = String
  type H264EntropyEncoding                           = String
  type H264FlickerAq                                 = String
  type H264FramerateControl                          = String
  type H264GopBReference                             = String
  type H264GopSizeUnits                              = String
  type H264Level                                     = String
  type H264LookAheadRateControl                      = String
  type H264ParControl                                = String
  type H264Profile                                   = String
  type H264RateControlMode                           = String
  type H264ScanType                                  = String
  type H264SceneChangeDetect                         = String
  type H264SpatialAq                                 = String
  type H264SubGopLength                              = String
  type H264Syntax                                    = String
  type H264TemporalAq                                = String
  type H264TimecodeInsertionBehavior                 = String
  type HlsAdMarkers                                  = String
  type HlsAkamaiHttpTransferMode                     = String
  type HlsCaptionLanguageSetting                     = String
  type HlsClientCache                                = String
  type HlsCodecSpecification                         = String
  type HlsDirectoryStructure                         = String
  type HlsEncryptionType                             = String
  type HlsIvInManifest                               = String
  type HlsIvSource                                   = String
  type HlsManifestCompression                        = String
  type HlsManifestDurationFormat                     = String
  type HlsMediaStoreStorageClass                     = String
  type HlsMode                                       = String
  type HlsOutputSelection                            = String
  type HlsProgramDateTime                            = String
  type HlsRedundantManifest                          = String
  type HlsSegmentationMode                           = String
  type HlsStreamInfResolution                        = String
  type HlsTimedMetadataId3Frame                      = String
  type HlsTsFileMode                                 = String
  type HlsWebdavHttpTransferMode                     = String
  type IFrameOnlyPlaylistType                        = String
  type InputClass                                    = String
  type InputCodec                                    = String
  type InputDeblockFilter                            = String
  type InputDenoiseFilter                            = String
  type InputFilter                                   = String
  type InputLossActionForHlsOut                      = String
  type InputLossActionForMsSmoothOut                 = String
  type InputLossActionForRtmpOut                     = String
  type InputLossActionForUdpOut                      = String
  type InputLossImageType                            = String
  type InputMaximumBitrate                           = String
  type InputResolution                               = String
  type InputSecurityGroupState                       = String
  type InputSourceEndBehavior                        = String
  type InputSourceType                               = String
  type InputState                                    = String
  type InputTimecodeSource                           = String
  type InputType                                     = String
  type LastFrameClippingBehavior                     = String
  type LogLevel                                      = String
  type M2tsAbsentInputAudioBehavior                  = String
  type M2tsArib                                      = String
  type M2tsAribCaptionsPidControl                    = String
  type M2tsAudioBufferModel                          = String
  type M2tsAudioInterval                             = String
  type M2tsAudioStreamType                           = String
  type M2tsBufferModel                               = String
  type M2tsCcDescriptor                              = String
  type M2tsEbifControl                               = String
  type M2tsEbpPlacement                              = String
  type M2tsEsRateInPes                               = String
  type M2tsKlv                                       = String
  type M2tsPcrControl                                = String
  type M2tsRateMode                                  = String
  type M2tsScte35Control                             = String
  type M2tsSegmentationMarkers                       = String
  type M2tsSegmentationStyle                         = String
  type M2tsTimedMetadataBehavior                     = String
  type M3u8PcrControl                                = String
  type M3u8Scte35Behavior                            = String
  type M3u8TimedMetadataBehavior                     = String
  type MaxResults                                    = Int
  type Mp2CodingMode                                 = String
  type NetworkInputServerValidation                  = String
  type OfferingDurationUnits                         = String
  type OfferingType                                  = String
  type PipelineId                                    = String
  type ReservationCodec                              = String
  type ReservationMaximumBitrate                     = String
  type ReservationMaximumFramerate                   = String
  type ReservationResolution                         = String
  type ReservationResourceType                       = String
  type ReservationSpecialFeature                     = String
  type ReservationState                              = String
  type ReservationVideoQuality                       = String
  type RtmpCacheFullBehavior                         = String
  type RtmpCaptionData                               = String
  type RtmpOutputCertificateMode                     = String
  type Scte20Convert608To708                         = String
  type Scte35AposNoRegionalBlackoutBehavior          = String
  type Scte35AposWebDeliveryAllowedBehavior          = String
  type Scte35ArchiveAllowedFlag                      = String
  type Scte35DeviceRestrictions                      = String
  type Scte35NoRegionalBlackoutFlag                  = String
  type Scte35SegmentationCancelIndicator             = String
  type Scte35SpliceInsertNoRegionalBlackoutBehavior  = String
  type Scte35SpliceInsertWebDeliveryAllowedBehavior  = String
  type Scte35WebDeliveryAllowedFlag                  = String
  type SmoothGroupAudioOnlyTimecodeControl           = String
  type SmoothGroupCertificateMode                    = String
  type SmoothGroupEventIdMode                        = String
  type SmoothGroupEventStopBehavior                  = String
  type SmoothGroupSegmentationMode                   = String
  type SmoothGroupSparseTrackType                    = String
  type SmoothGroupStreamManifestBehavior             = String
  type SmoothGroupTimestampOffsetMode                = String
  type Tags                                          = js.Dictionary[__string]
  type TimecodeConfigSource                          = String
  type TtmlDestinationStyleControl                   = String
  type UdpTimedMetadataId3Frame                      = String
  type VideoDescriptionRespondToAfd                  = String
  type VideoDescriptionScalingBehavior               = String
  type VideoSelectorColorSpace                       = String
  type VideoSelectorColorSpaceUsage                  = String
  type __double                                      = Double
  type __doubleMin0                                  = Double
  type __doubleMin1                                  = Double
  type __doubleMinNegative59Max0                     = Double
  type __integer                                     = Int
  type __integerMin0                                 = Int
  type __integerMin0Max10                            = Int
  type __integerMin0Max100                           = Int
  type __integerMin0Max1000                          = Int
  type __integerMin0Max10000                         = Int
  type __integerMin0Max1000000                       = Int
  type __integerMin0Max128                           = Int
  type __integerMin0Max15                            = Int
  type __integerMin0Max255                           = Int
  type __integerMin0Max30                            = Int
  type __integerMin0Max3600                          = Int
  type __integerMin0Max500                           = Int
  type __integerMin0Max600                           = Int
  type __integerMin0Max65535                         = Int
  type __integerMin0Max65536                         = Int
  type __integerMin0Max7                             = Int
  type __integerMin0Max8191                          = Int
  type __integerMin1                                 = Int
  type __integerMin1000                              = Int
  type __integerMin1000Max30000                      = Int
  type __integerMin1Max10                            = Int
  type __integerMin1Max1000000                       = Int
  type __integerMin1Max16                            = Int
  type __integerMin1Max20                            = Int
  type __integerMin1Max31                            = Int
  type __integerMin1Max32                            = Int
  type __integerMin1Max3600                          = Int
  type __integerMin1Max4                             = Int
  type __integerMin1Max5                             = Int
  type __integerMin1Max6                             = Int
  type __integerMin1Max8                             = Int
  type __integerMin25Max10000                        = Int
  type __integerMin25Max2000                         = Int
  type __integerMin3                                 = Int
  type __integerMin30                                = Int
  type __integerMin4Max20                            = Int
  type __integerMin96Max600                          = Int
  type __integerMinNegative1000Max1000               = Int
  type __integerMinNegative60Max6                    = Int
  type __integerMinNegative60Max60                   = Int
  type __listOfAudioChannelMapping                   = js.Array[AudioChannelMapping]
  type __listOfAudioDescription                      = js.Array[AudioDescription]
  type __listOfAudioSelector                         = js.Array[AudioSelector]
  type __listOfCaptionDescription                    = js.Array[CaptionDescription]
  type __listOfCaptionLanguageMapping                = js.Array[CaptionLanguageMapping]
  type __listOfCaptionSelector                       = js.Array[CaptionSelector]
  type __listOfChannelEgressEndpoint                 = js.Array[ChannelEgressEndpoint]
  type __listOfChannelSummary                        = js.Array[ChannelSummary]
  type __listOfHlsAdMarkers                          = js.Array[HlsAdMarkers]
  type __listOfInput                                 = js.Array[Input]
  type __listOfInputAttachment                       = js.Array[InputAttachment]
  type __listOfInputChannelLevel                     = js.Array[InputChannelLevel]
  type __listOfInputDestination                      = js.Array[InputDestination]
  type __listOfInputDestinationRequest               = js.Array[InputDestinationRequest]
  type __listOfInputSecurityGroup                    = js.Array[InputSecurityGroup]
  type __listOfInputSource                           = js.Array[InputSource]
  type __listOfInputSourceRequest                    = js.Array[InputSourceRequest]
  type __listOfInputWhitelistRule                    = js.Array[InputWhitelistRule]
  type __listOfInputWhitelistRuleCidr                = js.Array[InputWhitelistRuleCidr]
  type __listOfMediaConnectFlow                      = js.Array[MediaConnectFlow]
  type __listOfMediaConnectFlowRequest               = js.Array[MediaConnectFlowRequest]
  type __listOfMediaPackageOutputDestinationSettings = js.Array[MediaPackageOutputDestinationSettings]
  type __listOfOffering                              = js.Array[Offering]
  type __listOfOutput                                = js.Array[Output]
  type __listOfOutputDestination                     = js.Array[OutputDestination]
  type __listOfOutputDestinationSettings             = js.Array[OutputDestinationSettings]
  type __listOfOutputGroup                           = js.Array[OutputGroup]
  type __listOfPipelineDetail                        = js.Array[PipelineDetail]
  type __listOfPipelinePauseStateSettings            = js.Array[PipelinePauseStateSettings]
  type __listOfReservation                           = js.Array[Reservation]
  type __listOfScheduleAction                        = js.Array[ScheduleAction]
  type __listOfScte35Descriptor                      = js.Array[Scte35Descriptor]
  type __listOfVideoDescription                      = js.Array[VideoDescription]
  type __listOf__string                              = js.Array[__string]
  type __longMin0Max1099511627775                    = Double
  type __longMin0Max4294967295                       = Double
  type __longMin0Max8589934591                       = Double
  type __string                                      = String
  type __stringMax32                                 = String
  type __stringMin1                                  = String
  type __stringMin1Max255                            = String
  type __stringMin1Max256                            = String
  type __stringMin32Max32                            = String
  type __stringMin34Max34                            = String
  type __stringMin3Max3                              = String
  type __stringMin6Max6                              = String

  implicit final class MediaLiveOps(private val service: MediaLive) extends AnyVal {
    @inline def batchUpdateScheduleFuture(params: BatchUpdateScheduleRequest): Future[BatchUpdateScheduleResponse] =
      service.batchUpdateSchedule(params).promise.toFuture
    @inline def createChannelFuture(params: CreateChannelRequest): Future[CreateChannelResponse] =
      service.createChannel(params).promise.toFuture
    @inline def createInputFuture(params: CreateInputRequest): Future[CreateInputResponse] =
      service.createInput(params).promise.toFuture
    @inline def createInputSecurityGroupFuture(
        params: CreateInputSecurityGroupRequest
    ): Future[CreateInputSecurityGroupResponse] = service.createInputSecurityGroup(params).promise.toFuture
    @inline def createTagsFuture(params: CreateTagsRequest): Future[js.Object] =
      service.createTags(params).promise.toFuture
    @inline def deleteChannelFuture(params: DeleteChannelRequest): Future[DeleteChannelResponse] =
      service.deleteChannel(params).promise.toFuture
    @inline def deleteInputFuture(params: DeleteInputRequest): Future[DeleteInputResponse] =
      service.deleteInput(params).promise.toFuture
    @inline def deleteInputSecurityGroupFuture(
        params: DeleteInputSecurityGroupRequest
    ): Future[DeleteInputSecurityGroupResponse] = service.deleteInputSecurityGroup(params).promise.toFuture
    @inline def deleteReservationFuture(params: DeleteReservationRequest): Future[DeleteReservationResponse] =
      service.deleteReservation(params).promise.toFuture
    @inline def deleteScheduleFuture(params: DeleteScheduleRequest): Future[DeleteScheduleResponse] =
      service.deleteSchedule(params).promise.toFuture
    @inline def deleteTagsFuture(params: DeleteTagsRequest): Future[js.Object] =
      service.deleteTags(params).promise.toFuture
    @inline def describeChannelFuture(params: DescribeChannelRequest): Future[DescribeChannelResponse] =
      service.describeChannel(params).promise.toFuture
    @inline def describeInputFuture(params: DescribeInputRequest): Future[DescribeInputResponse] =
      service.describeInput(params).promise.toFuture
    @inline def describeInputSecurityGroupFuture(
        params: DescribeInputSecurityGroupRequest
    ): Future[DescribeInputSecurityGroupResponse] = service.describeInputSecurityGroup(params).promise.toFuture
    @inline def describeOfferingFuture(params: DescribeOfferingRequest): Future[DescribeOfferingResponse] =
      service.describeOffering(params).promise.toFuture
    @inline def describeReservationFuture(params: DescribeReservationRequest): Future[DescribeReservationResponse] =
      service.describeReservation(params).promise.toFuture
    @inline def describeScheduleFuture(params: DescribeScheduleRequest): Future[DescribeScheduleResponse] =
      service.describeSchedule(params).promise.toFuture
    @inline def listChannelsFuture(params: ListChannelsRequest): Future[ListChannelsResponse] =
      service.listChannels(params).promise.toFuture
    @inline def listInputSecurityGroupsFuture(
        params: ListInputSecurityGroupsRequest
    ): Future[ListInputSecurityGroupsResponse] = service.listInputSecurityGroups(params).promise.toFuture
    @inline def listInputsFuture(params: ListInputsRequest): Future[ListInputsResponse] =
      service.listInputs(params).promise.toFuture
    @inline def listOfferingsFuture(params: ListOfferingsRequest): Future[ListOfferingsResponse] =
      service.listOfferings(params).promise.toFuture
    @inline def listReservationsFuture(params: ListReservationsRequest): Future[ListReservationsResponse] =
      service.listReservations(params).promise.toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    @inline def purchaseOfferingFuture(params: PurchaseOfferingRequest): Future[PurchaseOfferingResponse] =
      service.purchaseOffering(params).promise.toFuture
    @inline def startChannelFuture(params: StartChannelRequest): Future[StartChannelResponse] =
      service.startChannel(params).promise.toFuture
    @inline def stopChannelFuture(params: StopChannelRequest): Future[StopChannelResponse] =
      service.stopChannel(params).promise.toFuture
    @inline def updateChannelClassFuture(params: UpdateChannelClassRequest): Future[UpdateChannelClassResponse] =
      service.updateChannelClass(params).promise.toFuture
    @inline def updateChannelFuture(params: UpdateChannelRequest): Future[UpdateChannelResponse] =
      service.updateChannel(params).promise.toFuture
    @inline def updateInputFuture(params: UpdateInputRequest): Future[UpdateInputResponse] =
      service.updateInput(params).promise.toFuture
    @inline def updateInputSecurityGroupFuture(
        params: UpdateInputSecurityGroupRequest
    ): Future[UpdateInputSecurityGroupResponse] = service.updateInputSecurityGroup(params).promise.toFuture
    @inline def updateReservationFuture(params: UpdateReservationRequest): Future[UpdateReservationResponse] =
      service.updateReservation(params).promise.toFuture
  }
}

package medialive {
  @js.native
  @JSImport("aws-sdk", "MediaLive")
  class MediaLive() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchUpdateSchedule(params: BatchUpdateScheduleRequest): Request[BatchUpdateScheduleResponse] = js.native
    def createChannel(params: CreateChannelRequest): Request[CreateChannelResponse]                   = js.native
    def createInput(params: CreateInputRequest): Request[CreateInputResponse]                         = js.native
    def createInputSecurityGroup(params: CreateInputSecurityGroupRequest): Request[CreateInputSecurityGroupResponse] =
      js.native
    def createTags(params: CreateTagsRequest): Request[js.Object]                   = js.native
    def deleteChannel(params: DeleteChannelRequest): Request[DeleteChannelResponse] = js.native
    def deleteInput(params: DeleteInputRequest): Request[DeleteInputResponse]       = js.native
    def deleteInputSecurityGroup(params: DeleteInputSecurityGroupRequest): Request[DeleteInputSecurityGroupResponse] =
      js.native
    def deleteReservation(params: DeleteReservationRequest): Request[DeleteReservationResponse] = js.native
    def deleteSchedule(params: DeleteScheduleRequest): Request[DeleteScheduleResponse]          = js.native
    def deleteTags(params: DeleteTagsRequest): Request[js.Object]                               = js.native
    def describeChannel(params: DescribeChannelRequest): Request[DescribeChannelResponse]       = js.native
    def describeInput(params: DescribeInputRequest): Request[DescribeInputResponse]             = js.native
    def describeInputSecurityGroup(
        params: DescribeInputSecurityGroupRequest
    ): Request[DescribeInputSecurityGroupResponse]                                                    = js.native
    def describeOffering(params: DescribeOfferingRequest): Request[DescribeOfferingResponse]          = js.native
    def describeReservation(params: DescribeReservationRequest): Request[DescribeReservationResponse] = js.native
    def describeSchedule(params: DescribeScheduleRequest): Request[DescribeScheduleResponse]          = js.native
    def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse]                      = js.native
    def listInputSecurityGroups(params: ListInputSecurityGroupsRequest): Request[ListInputSecurityGroupsResponse] =
      js.native
    def listInputs(params: ListInputsRequest): Request[ListInputsResponse]                            = js.native
    def listOfferings(params: ListOfferingsRequest): Request[ListOfferingsResponse]                   = js.native
    def listReservations(params: ListReservationsRequest): Request[ListReservationsResponse]          = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def purchaseOffering(params: PurchaseOfferingRequest): Request[PurchaseOfferingResponse]          = js.native
    def startChannel(params: StartChannelRequest): Request[StartChannelResponse]                      = js.native
    def stopChannel(params: StopChannelRequest): Request[StopChannelResponse]                         = js.native
    def updateChannel(params: UpdateChannelRequest): Request[UpdateChannelResponse]                   = js.native
    def updateChannelClass(params: UpdateChannelClassRequest): Request[UpdateChannelClassResponse]    = js.native
    def updateInput(params: UpdateInputRequest): Request[UpdateInputResponse]                         = js.native
    def updateInputSecurityGroup(params: UpdateInputSecurityGroupRequest): Request[UpdateInputSecurityGroupResponse] =
      js.native
    def updateReservation(params: UpdateReservationRequest): Request[UpdateReservationResponse] = js.native
  }

  /**
    * Aac Coding Mode
    */
  object AacCodingModeEnum {
    val AD_RECEIVER_MIX = "AD_RECEIVER_MIX"
    val CODING_MODE_1_0 = "CODING_MODE_1_0"
    val CODING_MODE_1_1 = "CODING_MODE_1_1"
    val CODING_MODE_2_0 = "CODING_MODE_2_0"
    val CODING_MODE_5_1 = "CODING_MODE_5_1"

    val values =
      js.Object.freeze(js.Array(AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0, CODING_MODE_5_1))
  }

  /**
    * Aac Input Type
    */
  object AacInputTypeEnum {
    val BROADCASTER_MIXED_AD = "BROADCASTER_MIXED_AD"
    val NORMAL               = "NORMAL"

    val values = js.Object.freeze(js.Array(BROADCASTER_MIXED_AD, NORMAL))
  }

  /**
    * Aac Profile
    */
  object AacProfileEnum {
    val HEV1 = "HEV1"
    val HEV2 = "HEV2"
    val LC   = "LC"

    val values = js.Object.freeze(js.Array(HEV1, HEV2, LC))
  }

  /**
    * Aac Rate Control Mode
    */
  object AacRateControlModeEnum {
    val CBR = "CBR"
    val VBR = "VBR"

    val values = js.Object.freeze(js.Array(CBR, VBR))
  }

  /**
    * Aac Raw Format
    */
  object AacRawFormatEnum {
    val LATM_LOAS = "LATM_LOAS"
    val NONE      = "NONE"

    val values = js.Object.freeze(js.Array(LATM_LOAS, NONE))
  }

  /**
    * Aac Settings
    */
  @js.native
  trait AacSettings extends js.Object {
    var Bitrate: js.UndefOr[__double]
    var CodingMode: js.UndefOr[AacCodingMode]
    var InputType: js.UndefOr[AacInputType]
    var Profile: js.UndefOr[AacProfile]
    var RateControlMode: js.UndefOr[AacRateControlMode]
    var RawFormat: js.UndefOr[AacRawFormat]
    var SampleRate: js.UndefOr[__double]
    var Spec: js.UndefOr[AacSpec]
    var VbrQuality: js.UndefOr[AacVbrQuality]
  }

  object AacSettings {
    @inline
    def apply(
        Bitrate: js.UndefOr[__double] = js.undefined,
        CodingMode: js.UndefOr[AacCodingMode] = js.undefined,
        InputType: js.UndefOr[AacInputType] = js.undefined,
        Profile: js.UndefOr[AacProfile] = js.undefined,
        RateControlMode: js.UndefOr[AacRateControlMode] = js.undefined,
        RawFormat: js.UndefOr[AacRawFormat] = js.undefined,
        SampleRate: js.UndefOr[__double] = js.undefined,
        Spec: js.UndefOr[AacSpec] = js.undefined,
        VbrQuality: js.UndefOr[AacVbrQuality] = js.undefined
    ): AacSettings = {
      val __obj = js.Dynamic.literal()
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      CodingMode.foreach(__v => __obj.updateDynamic("CodingMode")(__v.asInstanceOf[js.Any]))
      InputType.foreach(__v => __obj.updateDynamic("InputType")(__v.asInstanceOf[js.Any]))
      Profile.foreach(__v => __obj.updateDynamic("Profile")(__v.asInstanceOf[js.Any]))
      RateControlMode.foreach(__v => __obj.updateDynamic("RateControlMode")(__v.asInstanceOf[js.Any]))
      RawFormat.foreach(__v => __obj.updateDynamic("RawFormat")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      Spec.foreach(__v => __obj.updateDynamic("Spec")(__v.asInstanceOf[js.Any]))
      VbrQuality.foreach(__v => __obj.updateDynamic("VbrQuality")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AacSettings]
    }
  }

  /**
    * Aac Spec
    */
  object AacSpecEnum {
    val MPEG2 = "MPEG2"
    val MPEG4 = "MPEG4"

    val values = js.Object.freeze(js.Array(MPEG2, MPEG4))
  }

  /**
    * Aac Vbr Quality
    */
  object AacVbrQualityEnum {
    val HIGH        = "HIGH"
    val LOW         = "LOW"
    val MEDIUM_HIGH = "MEDIUM_HIGH"
    val MEDIUM_LOW  = "MEDIUM_LOW"

    val values = js.Object.freeze(js.Array(HIGH, LOW, MEDIUM_HIGH, MEDIUM_LOW))
  }

  /**
    * Ac3 Bitstream Mode
    */
  object Ac3BitstreamModeEnum {
    val COMMENTARY        = "COMMENTARY"
    val COMPLETE_MAIN     = "COMPLETE_MAIN"
    val DIALOGUE          = "DIALOGUE"
    val EMERGENCY         = "EMERGENCY"
    val HEARING_IMPAIRED  = "HEARING_IMPAIRED"
    val MUSIC_AND_EFFECTS = "MUSIC_AND_EFFECTS"
    val VISUALLY_IMPAIRED = "VISUALLY_IMPAIRED"
    val VOICE_OVER        = "VOICE_OVER"

    val values = js.Object.freeze(
      js.Array(
        COMMENTARY,
        COMPLETE_MAIN,
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
    * Ac3 Coding Mode
    */
  object Ac3CodingModeEnum {
    val CODING_MODE_1_0     = "CODING_MODE_1_0"
    val CODING_MODE_1_1     = "CODING_MODE_1_1"
    val CODING_MODE_2_0     = "CODING_MODE_2_0"
    val CODING_MODE_3_2_LFE = "CODING_MODE_3_2_LFE"

    val values = js.Object.freeze(js.Array(CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0, CODING_MODE_3_2_LFE))
  }

  /**
    * Ac3 Drc Profile
    */
  object Ac3DrcProfileEnum {
    val FILM_STANDARD = "FILM_STANDARD"
    val NONE          = "NONE"

    val values = js.Object.freeze(js.Array(FILM_STANDARD, NONE))
  }

  /**
    * Ac3 Lfe Filter
    */
  object Ac3LfeFilterEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Ac3 Metadata Control
    */
  object Ac3MetadataControlEnum {
    val FOLLOW_INPUT   = "FOLLOW_INPUT"
    val USE_CONFIGURED = "USE_CONFIGURED"

    val values = js.Object.freeze(js.Array(FOLLOW_INPUT, USE_CONFIGURED))
  }

  /**
    * Ac3 Settings
    */
  @js.native
  trait Ac3Settings extends js.Object {
    var Bitrate: js.UndefOr[__double]
    var BitstreamMode: js.UndefOr[Ac3BitstreamMode]
    var CodingMode: js.UndefOr[Ac3CodingMode]
    var Dialnorm: js.UndefOr[__integerMin1Max31]
    var DrcProfile: js.UndefOr[Ac3DrcProfile]
    var LfeFilter: js.UndefOr[Ac3LfeFilter]
    var MetadataControl: js.UndefOr[Ac3MetadataControl]
  }

  object Ac3Settings {
    @inline
    def apply(
        Bitrate: js.UndefOr[__double] = js.undefined,
        BitstreamMode: js.UndefOr[Ac3BitstreamMode] = js.undefined,
        CodingMode: js.UndefOr[Ac3CodingMode] = js.undefined,
        Dialnorm: js.UndefOr[__integerMin1Max31] = js.undefined,
        DrcProfile: js.UndefOr[Ac3DrcProfile] = js.undefined,
        LfeFilter: js.UndefOr[Ac3LfeFilter] = js.undefined,
        MetadataControl: js.UndefOr[Ac3MetadataControl] = js.undefined
    ): Ac3Settings = {
      val __obj = js.Dynamic.literal()
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      BitstreamMode.foreach(__v => __obj.updateDynamic("BitstreamMode")(__v.asInstanceOf[js.Any]))
      CodingMode.foreach(__v => __obj.updateDynamic("CodingMode")(__v.asInstanceOf[js.Any]))
      Dialnorm.foreach(__v => __obj.updateDynamic("Dialnorm")(__v.asInstanceOf[js.Any]))
      DrcProfile.foreach(__v => __obj.updateDynamic("DrcProfile")(__v.asInstanceOf[js.Any]))
      LfeFilter.foreach(__v => __obj.updateDynamic("LfeFilter")(__v.asInstanceOf[js.Any]))
      MetadataControl.foreach(__v => __obj.updateDynamic("MetadataControl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Ac3Settings]
    }
  }

  /**
    * Afd Signaling
    */
  object AfdSignalingEnum {
    val AUTO  = "AUTO"
    val FIXED = "FIXED"
    val NONE  = "NONE"

    val values = js.Object.freeze(js.Array(AUTO, FIXED, NONE))
  }

  /**
    * Archive Container Settings
    */
  @js.native
  trait ArchiveContainerSettings extends js.Object {
    var M2tsSettings: js.UndefOr[M2tsSettings]
  }

  object ArchiveContainerSettings {
    @inline
    def apply(
        M2tsSettings: js.UndefOr[M2tsSettings] = js.undefined
    ): ArchiveContainerSettings = {
      val __obj = js.Dynamic.literal()
      M2tsSettings.foreach(__v => __obj.updateDynamic("M2tsSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArchiveContainerSettings]
    }
  }

  /**
    * Archive Group Settings
    */
  @js.native
  trait ArchiveGroupSettings extends js.Object {
    var Destination: OutputLocationRef
    var RolloverInterval: js.UndefOr[__integerMin1]
  }

  object ArchiveGroupSettings {
    @inline
    def apply(
        Destination: OutputLocationRef,
        RolloverInterval: js.UndefOr[__integerMin1] = js.undefined
    ): ArchiveGroupSettings = {
      val __obj = js.Dynamic.literal(
        "Destination" -> Destination.asInstanceOf[js.Any]
      )

      RolloverInterval.foreach(__v => __obj.updateDynamic("RolloverInterval")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArchiveGroupSettings]
    }
  }

  /**
    * Archive Output Settings
    */
  @js.native
  trait ArchiveOutputSettings extends js.Object {
    var ContainerSettings: ArchiveContainerSettings
    var Extension: js.UndefOr[__string]
    var NameModifier: js.UndefOr[__string]
  }

  object ArchiveOutputSettings {
    @inline
    def apply(
        ContainerSettings: ArchiveContainerSettings,
        Extension: js.UndefOr[__string] = js.undefined,
        NameModifier: js.UndefOr[__string] = js.undefined
    ): ArchiveOutputSettings = {
      val __obj = js.Dynamic.literal(
        "ContainerSettings" -> ContainerSettings.asInstanceOf[js.Any]
      )

      Extension.foreach(__v => __obj.updateDynamic("Extension")(__v.asInstanceOf[js.Any]))
      NameModifier.foreach(__v => __obj.updateDynamic("NameModifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArchiveOutputSettings]
    }
  }

  /**
    * Arib Destination Settings
    */
  @js.native
  trait AribDestinationSettings extends js.Object {}

  object AribDestinationSettings {
    @inline
    def apply(
        ): AribDestinationSettings = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AribDestinationSettings]
    }
  }

  /**
    * Arib Source Settings
    */
  @js.native
  trait AribSourceSettings extends js.Object {}

  object AribSourceSettings {
    @inline
    def apply(
        ): AribSourceSettings = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AribSourceSettings]
    }
  }

  /**
    * Audio Channel Mapping
    */
  @js.native
  trait AudioChannelMapping extends js.Object {
    var InputChannelLevels: __listOfInputChannelLevel
    var OutputChannel: __integerMin0Max7
  }

  object AudioChannelMapping {
    @inline
    def apply(
        InputChannelLevels: __listOfInputChannelLevel,
        OutputChannel: __integerMin0Max7
    ): AudioChannelMapping = {
      val __obj = js.Dynamic.literal(
        "InputChannelLevels" -> InputChannelLevels.asInstanceOf[js.Any],
        "OutputChannel"      -> OutputChannel.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AudioChannelMapping]
    }
  }

  /**
    * Audio Codec Settings
    */
  @js.native
  trait AudioCodecSettings extends js.Object {
    var AacSettings: js.UndefOr[AacSettings]
    var Ac3Settings: js.UndefOr[Ac3Settings]
    var Eac3Settings: js.UndefOr[Eac3Settings]
    var Mp2Settings: js.UndefOr[Mp2Settings]
    var PassThroughSettings: js.UndefOr[PassThroughSettings]
  }

  object AudioCodecSettings {
    @inline
    def apply(
        AacSettings: js.UndefOr[AacSettings] = js.undefined,
        Ac3Settings: js.UndefOr[Ac3Settings] = js.undefined,
        Eac3Settings: js.UndefOr[Eac3Settings] = js.undefined,
        Mp2Settings: js.UndefOr[Mp2Settings] = js.undefined,
        PassThroughSettings: js.UndefOr[PassThroughSettings] = js.undefined
    ): AudioCodecSettings = {
      val __obj = js.Dynamic.literal()
      AacSettings.foreach(__v => __obj.updateDynamic("AacSettings")(__v.asInstanceOf[js.Any]))
      Ac3Settings.foreach(__v => __obj.updateDynamic("Ac3Settings")(__v.asInstanceOf[js.Any]))
      Eac3Settings.foreach(__v => __obj.updateDynamic("Eac3Settings")(__v.asInstanceOf[js.Any]))
      Mp2Settings.foreach(__v => __obj.updateDynamic("Mp2Settings")(__v.asInstanceOf[js.Any]))
      PassThroughSettings.foreach(__v => __obj.updateDynamic("PassThroughSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioCodecSettings]
    }
  }

  /**
    * Audio Description
    */
  @js.native
  trait AudioDescription extends js.Object {
    var AudioSelectorName: __string
    var Name: __string
    var AudioNormalizationSettings: js.UndefOr[AudioNormalizationSettings]
    var AudioType: js.UndefOr[AudioType]
    var AudioTypeControl: js.UndefOr[AudioDescriptionAudioTypeControl]
    var CodecSettings: js.UndefOr[AudioCodecSettings]
    var LanguageCode: js.UndefOr[__stringMin3Max3]
    var LanguageCodeControl: js.UndefOr[AudioDescriptionLanguageCodeControl]
    var RemixSettings: js.UndefOr[RemixSettings]
    var StreamName: js.UndefOr[__string]
  }

  object AudioDescription {
    @inline
    def apply(
        AudioSelectorName: __string,
        Name: __string,
        AudioNormalizationSettings: js.UndefOr[AudioNormalizationSettings] = js.undefined,
        AudioType: js.UndefOr[AudioType] = js.undefined,
        AudioTypeControl: js.UndefOr[AudioDescriptionAudioTypeControl] = js.undefined,
        CodecSettings: js.UndefOr[AudioCodecSettings] = js.undefined,
        LanguageCode: js.UndefOr[__stringMin3Max3] = js.undefined,
        LanguageCodeControl: js.UndefOr[AudioDescriptionLanguageCodeControl] = js.undefined,
        RemixSettings: js.UndefOr[RemixSettings] = js.undefined,
        StreamName: js.UndefOr[__string] = js.undefined
    ): AudioDescription = {
      val __obj = js.Dynamic.literal(
        "AudioSelectorName" -> AudioSelectorName.asInstanceOf[js.Any],
        "Name"              -> Name.asInstanceOf[js.Any]
      )

      AudioNormalizationSettings.foreach(
        __v => __obj.updateDynamic("AudioNormalizationSettings")(__v.asInstanceOf[js.Any])
      )
      AudioType.foreach(__v => __obj.updateDynamic("AudioType")(__v.asInstanceOf[js.Any]))
      AudioTypeControl.foreach(__v => __obj.updateDynamic("AudioTypeControl")(__v.asInstanceOf[js.Any]))
      CodecSettings.foreach(__v => __obj.updateDynamic("CodecSettings")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LanguageCodeControl.foreach(__v => __obj.updateDynamic("LanguageCodeControl")(__v.asInstanceOf[js.Any]))
      RemixSettings.foreach(__v => __obj.updateDynamic("RemixSettings")(__v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioDescription]
    }
  }

  /**
    * Audio Description Audio Type Control
    */
  object AudioDescriptionAudioTypeControlEnum {
    val FOLLOW_INPUT   = "FOLLOW_INPUT"
    val USE_CONFIGURED = "USE_CONFIGURED"

    val values = js.Object.freeze(js.Array(FOLLOW_INPUT, USE_CONFIGURED))
  }

  /**
    * Audio Description Language Code Control
    */
  object AudioDescriptionLanguageCodeControlEnum {
    val FOLLOW_INPUT   = "FOLLOW_INPUT"
    val USE_CONFIGURED = "USE_CONFIGURED"

    val values = js.Object.freeze(js.Array(FOLLOW_INPUT, USE_CONFIGURED))
  }

  /**
    * Audio Language Selection
    */
  @js.native
  trait AudioLanguageSelection extends js.Object {
    var LanguageCode: __string
    var LanguageSelectionPolicy: js.UndefOr[AudioLanguageSelectionPolicy]
  }

  object AudioLanguageSelection {
    @inline
    def apply(
        LanguageCode: __string,
        LanguageSelectionPolicy: js.UndefOr[AudioLanguageSelectionPolicy] = js.undefined
    ): AudioLanguageSelection = {
      val __obj = js.Dynamic.literal(
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any]
      )

      LanguageSelectionPolicy.foreach(__v => __obj.updateDynamic("LanguageSelectionPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioLanguageSelection]
    }
  }

  /**
    * Audio Language Selection Policy
    */
  object AudioLanguageSelectionPolicyEnum {
    val LOOSE  = "LOOSE"
    val STRICT = "STRICT"

    val values = js.Object.freeze(js.Array(LOOSE, STRICT))
  }

  /**
    * Audio Normalization Algorithm
    */
  object AudioNormalizationAlgorithmEnum {
    val ITU_1770_1 = "ITU_1770_1"
    val ITU_1770_2 = "ITU_1770_2"

    val values = js.Object.freeze(js.Array(ITU_1770_1, ITU_1770_2))
  }

  /**
    * Audio Normalization Algorithm Control
    */
  object AudioNormalizationAlgorithmControlEnum {
    val CORRECT_AUDIO = "CORRECT_AUDIO"

    val values = js.Object.freeze(js.Array(CORRECT_AUDIO))
  }

  /**
    * Audio Normalization Settings
    */
  @js.native
  trait AudioNormalizationSettings extends js.Object {
    var Algorithm: js.UndefOr[AudioNormalizationAlgorithm]
    var AlgorithmControl: js.UndefOr[AudioNormalizationAlgorithmControl]
    var TargetLkfs: js.UndefOr[__doubleMinNegative59Max0]
  }

  object AudioNormalizationSettings {
    @inline
    def apply(
        Algorithm: js.UndefOr[AudioNormalizationAlgorithm] = js.undefined,
        AlgorithmControl: js.UndefOr[AudioNormalizationAlgorithmControl] = js.undefined,
        TargetLkfs: js.UndefOr[__doubleMinNegative59Max0] = js.undefined
    ): AudioNormalizationSettings = {
      val __obj = js.Dynamic.literal()
      Algorithm.foreach(__v => __obj.updateDynamic("Algorithm")(__v.asInstanceOf[js.Any]))
      AlgorithmControl.foreach(__v => __obj.updateDynamic("AlgorithmControl")(__v.asInstanceOf[js.Any]))
      TargetLkfs.foreach(__v => __obj.updateDynamic("TargetLkfs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioNormalizationSettings]
    }
  }

  /**
    * Audio Only Hls Settings
    */
  @js.native
  trait AudioOnlyHlsSettings extends js.Object {
    var AudioGroupId: js.UndefOr[__string]
    var AudioOnlyImage: js.UndefOr[InputLocation]
    var AudioTrackType: js.UndefOr[AudioOnlyHlsTrackType]
  }

  object AudioOnlyHlsSettings {
    @inline
    def apply(
        AudioGroupId: js.UndefOr[__string] = js.undefined,
        AudioOnlyImage: js.UndefOr[InputLocation] = js.undefined,
        AudioTrackType: js.UndefOr[AudioOnlyHlsTrackType] = js.undefined
    ): AudioOnlyHlsSettings = {
      val __obj = js.Dynamic.literal()
      AudioGroupId.foreach(__v => __obj.updateDynamic("AudioGroupId")(__v.asInstanceOf[js.Any]))
      AudioOnlyImage.foreach(__v => __obj.updateDynamic("AudioOnlyImage")(__v.asInstanceOf[js.Any]))
      AudioTrackType.foreach(__v => __obj.updateDynamic("AudioTrackType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioOnlyHlsSettings]
    }
  }

  /**
    * Audio Only Hls Track Type
    */
  object AudioOnlyHlsTrackTypeEnum {
    val ALTERNATE_AUDIO_AUTO_SELECT         = "ALTERNATE_AUDIO_AUTO_SELECT"
    val ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT = "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT"
    val ALTERNATE_AUDIO_NOT_AUTO_SELECT     = "ALTERNATE_AUDIO_NOT_AUTO_SELECT"
    val AUDIO_ONLY_VARIANT_STREAM           = "AUDIO_ONLY_VARIANT_STREAM"

    val values = js.Object.freeze(
      js.Array(
        ALTERNATE_AUDIO_AUTO_SELECT,
        ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT,
        ALTERNATE_AUDIO_NOT_AUTO_SELECT,
        AUDIO_ONLY_VARIANT_STREAM
      )
    )
  }

  /**
    * Audio Pid Selection
    */
  @js.native
  trait AudioPidSelection extends js.Object {
    var Pid: __integerMin0Max8191
  }

  object AudioPidSelection {
    @inline
    def apply(
        Pid: __integerMin0Max8191
    ): AudioPidSelection = {
      val __obj = js.Dynamic.literal(
        "Pid" -> Pid.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AudioPidSelection]
    }
  }

  /**
    * Audio Selector
    */
  @js.native
  trait AudioSelector extends js.Object {
    var Name: __stringMin1
    var SelectorSettings: js.UndefOr[AudioSelectorSettings]
  }

  object AudioSelector {
    @inline
    def apply(
        Name: __stringMin1,
        SelectorSettings: js.UndefOr[AudioSelectorSettings] = js.undefined
    ): AudioSelector = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      SelectorSettings.foreach(__v => __obj.updateDynamic("SelectorSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioSelector]
    }
  }

  /**
    * Audio Selector Settings
    */
  @js.native
  trait AudioSelectorSettings extends js.Object {
    var AudioLanguageSelection: js.UndefOr[AudioLanguageSelection]
    var AudioPidSelection: js.UndefOr[AudioPidSelection]
  }

  object AudioSelectorSettings {
    @inline
    def apply(
        AudioLanguageSelection: js.UndefOr[AudioLanguageSelection] = js.undefined,
        AudioPidSelection: js.UndefOr[AudioPidSelection] = js.undefined
    ): AudioSelectorSettings = {
      val __obj = js.Dynamic.literal()
      AudioLanguageSelection.foreach(__v => __obj.updateDynamic("AudioLanguageSelection")(__v.asInstanceOf[js.Any]))
      AudioPidSelection.foreach(__v => __obj.updateDynamic("AudioPidSelection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioSelectorSettings]
    }
  }

  /**
    * Audio Type
    */
  object AudioTypeEnum {
    val CLEAN_EFFECTS              = "CLEAN_EFFECTS"
    val HEARING_IMPAIRED           = "HEARING_IMPAIRED"
    val UNDEFINED                  = "UNDEFINED"
    val VISUAL_IMPAIRED_COMMENTARY = "VISUAL_IMPAIRED_COMMENTARY"

    val values = js.Object.freeze(js.Array(CLEAN_EFFECTS, HEARING_IMPAIRED, UNDEFINED, VISUAL_IMPAIRED_COMMENTARY))
  }

  /**
    * Authentication Scheme
    */
  object AuthenticationSchemeEnum {
    val AKAMAI = "AKAMAI"
    val COMMON = "COMMON"

    val values = js.Object.freeze(js.Array(AKAMAI, COMMON))
  }

  /**
    * Avail Blanking
    */
  @js.native
  trait AvailBlanking extends js.Object {
    var AvailBlankingImage: js.UndefOr[InputLocation]
    var State: js.UndefOr[AvailBlankingState]
  }

  object AvailBlanking {
    @inline
    def apply(
        AvailBlankingImage: js.UndefOr[InputLocation] = js.undefined,
        State: js.UndefOr[AvailBlankingState] = js.undefined
    ): AvailBlanking = {
      val __obj = js.Dynamic.literal()
      AvailBlankingImage.foreach(__v => __obj.updateDynamic("AvailBlankingImage")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailBlanking]
    }
  }

  /**
    * Avail Blanking State
    */
  object AvailBlankingStateEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Avail Configuration
    */
  @js.native
  trait AvailConfiguration extends js.Object {
    var AvailSettings: js.UndefOr[AvailSettings]
  }

  object AvailConfiguration {
    @inline
    def apply(
        AvailSettings: js.UndefOr[AvailSettings] = js.undefined
    ): AvailConfiguration = {
      val __obj = js.Dynamic.literal()
      AvailSettings.foreach(__v => __obj.updateDynamic("AvailSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailConfiguration]
    }
  }

  /**
    * Avail Settings
    */
  @js.native
  trait AvailSettings extends js.Object {
    var Scte35SpliceInsert: js.UndefOr[Scte35SpliceInsert]
    var Scte35TimeSignalApos: js.UndefOr[Scte35TimeSignalApos]
  }

  object AvailSettings {
    @inline
    def apply(
        Scte35SpliceInsert: js.UndefOr[Scte35SpliceInsert] = js.undefined,
        Scte35TimeSignalApos: js.UndefOr[Scte35TimeSignalApos] = js.undefined
    ): AvailSettings = {
      val __obj = js.Dynamic.literal()
      Scte35SpliceInsert.foreach(__v => __obj.updateDynamic("Scte35SpliceInsert")(__v.asInstanceOf[js.Any]))
      Scte35TimeSignalApos.foreach(__v => __obj.updateDynamic("Scte35TimeSignalApos")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailSettings]
    }
  }

  /**
    * A list of schedule actions to create (in a request) or that have been created (in a response).
    */
  @js.native
  trait BatchScheduleActionCreateRequest extends js.Object {
    var ScheduleActions: __listOfScheduleAction
  }

  object BatchScheduleActionCreateRequest {
    @inline
    def apply(
        ScheduleActions: __listOfScheduleAction
    ): BatchScheduleActionCreateRequest = {
      val __obj = js.Dynamic.literal(
        "ScheduleActions" -> ScheduleActions.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchScheduleActionCreateRequest]
    }
  }

  /**
    * List of actions that have been created in the schedule.
    */
  @js.native
  trait BatchScheduleActionCreateResult extends js.Object {
    var ScheduleActions: __listOfScheduleAction
  }

  object BatchScheduleActionCreateResult {
    @inline
    def apply(
        ScheduleActions: __listOfScheduleAction
    ): BatchScheduleActionCreateResult = {
      val __obj = js.Dynamic.literal(
        "ScheduleActions" -> ScheduleActions.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchScheduleActionCreateResult]
    }
  }

  /**
    * A list of schedule actions to delete.
    */
  @js.native
  trait BatchScheduleActionDeleteRequest extends js.Object {
    var ActionNames: __listOf__string
  }

  object BatchScheduleActionDeleteRequest {
    @inline
    def apply(
        ActionNames: __listOf__string
    ): BatchScheduleActionDeleteRequest = {
      val __obj = js.Dynamic.literal(
        "ActionNames" -> ActionNames.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchScheduleActionDeleteRequest]
    }
  }

  /**
    * List of actions that have been deleted from the schedule.
    */
  @js.native
  trait BatchScheduleActionDeleteResult extends js.Object {
    var ScheduleActions: __listOfScheduleAction
  }

  object BatchScheduleActionDeleteResult {
    @inline
    def apply(
        ScheduleActions: __listOfScheduleAction
    ): BatchScheduleActionDeleteResult = {
      val __obj = js.Dynamic.literal(
        "ScheduleActions" -> ScheduleActions.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchScheduleActionDeleteResult]
    }
  }

  /**
    * List of actions to create and list of actions to delete.
    */
  @js.native
  trait BatchUpdateScheduleRequest extends js.Object {
    var ChannelId: __string
    var Creates: js.UndefOr[BatchScheduleActionCreateRequest]
    var Deletes: js.UndefOr[BatchScheduleActionDeleteRequest]
  }

  object BatchUpdateScheduleRequest {
    @inline
    def apply(
        ChannelId: __string,
        Creates: js.UndefOr[BatchScheduleActionCreateRequest] = js.undefined,
        Deletes: js.UndefOr[BatchScheduleActionDeleteRequest] = js.undefined
    ): BatchUpdateScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelId" -> ChannelId.asInstanceOf[js.Any]
      )

      Creates.foreach(__v => __obj.updateDynamic("Creates")(__v.asInstanceOf[js.Any]))
      Deletes.foreach(__v => __obj.updateDynamic("Deletes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpdateScheduleRequest]
    }
  }

  /**
    * Placeholder documentation for BatchUpdateScheduleResponse
    */
  @js.native
  trait BatchUpdateScheduleResponse extends js.Object {
    var Creates: js.UndefOr[BatchScheduleActionCreateResult]
    var Deletes: js.UndefOr[BatchScheduleActionDeleteResult]
  }

  object BatchUpdateScheduleResponse {
    @inline
    def apply(
        Creates: js.UndefOr[BatchScheduleActionCreateResult] = js.undefined,
        Deletes: js.UndefOr[BatchScheduleActionDeleteResult] = js.undefined
    ): BatchUpdateScheduleResponse = {
      val __obj = js.Dynamic.literal()
      Creates.foreach(__v => __obj.updateDynamic("Creates")(__v.asInstanceOf[js.Any]))
      Deletes.foreach(__v => __obj.updateDynamic("Deletes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpdateScheduleResponse]
    }
  }

  /**
    * Blackout Slate
    */
  @js.native
  trait BlackoutSlate extends js.Object {
    var BlackoutSlateImage: js.UndefOr[InputLocation]
    var NetworkEndBlackout: js.UndefOr[BlackoutSlateNetworkEndBlackout]
    var NetworkEndBlackoutImage: js.UndefOr[InputLocation]
    var NetworkId: js.UndefOr[__stringMin34Max34]
    var State: js.UndefOr[BlackoutSlateState]
  }

  object BlackoutSlate {
    @inline
    def apply(
        BlackoutSlateImage: js.UndefOr[InputLocation] = js.undefined,
        NetworkEndBlackout: js.UndefOr[BlackoutSlateNetworkEndBlackout] = js.undefined,
        NetworkEndBlackoutImage: js.UndefOr[InputLocation] = js.undefined,
        NetworkId: js.UndefOr[__stringMin34Max34] = js.undefined,
        State: js.UndefOr[BlackoutSlateState] = js.undefined
    ): BlackoutSlate = {
      val __obj = js.Dynamic.literal()
      BlackoutSlateImage.foreach(__v => __obj.updateDynamic("BlackoutSlateImage")(__v.asInstanceOf[js.Any]))
      NetworkEndBlackout.foreach(__v => __obj.updateDynamic("NetworkEndBlackout")(__v.asInstanceOf[js.Any]))
      NetworkEndBlackoutImage.foreach(__v => __obj.updateDynamic("NetworkEndBlackoutImage")(__v.asInstanceOf[js.Any]))
      NetworkId.foreach(__v => __obj.updateDynamic("NetworkId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BlackoutSlate]
    }
  }

  /**
    * Blackout Slate Network End Blackout
    */
  object BlackoutSlateNetworkEndBlackoutEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Blackout Slate State
    */
  object BlackoutSlateStateEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Burn In Alignment
    */
  object BurnInAlignmentEnum {
    val CENTERED = "CENTERED"
    val LEFT     = "LEFT"
    val SMART    = "SMART"

    val values = js.Object.freeze(js.Array(CENTERED, LEFT, SMART))
  }

  /**
    * Burn In Background Color
    */
  object BurnInBackgroundColorEnum {
    val BLACK = "BLACK"
    val NONE  = "NONE"
    val WHITE = "WHITE"

    val values = js.Object.freeze(js.Array(BLACK, NONE, WHITE))
  }

  /**
    * Burn In Destination Settings
    */
  @js.native
  trait BurnInDestinationSettings extends js.Object {
    var Alignment: js.UndefOr[BurnInAlignment]
    var BackgroundColor: js.UndefOr[BurnInBackgroundColor]
    var BackgroundOpacity: js.UndefOr[__integerMin0Max255]
    var Font: js.UndefOr[InputLocation]
    var FontColor: js.UndefOr[BurnInFontColor]
    var FontOpacity: js.UndefOr[__integerMin0Max255]
    var FontResolution: js.UndefOr[__integerMin96Max600]
    var FontSize: js.UndefOr[__string]
    var OutlineColor: js.UndefOr[BurnInOutlineColor]
    var OutlineSize: js.UndefOr[__integerMin0Max10]
    var ShadowColor: js.UndefOr[BurnInShadowColor]
    var ShadowOpacity: js.UndefOr[__integerMin0Max255]
    var ShadowXOffset: js.UndefOr[__integer]
    var ShadowYOffset: js.UndefOr[__integer]
    var TeletextGridControl: js.UndefOr[BurnInTeletextGridControl]
    var XPosition: js.UndefOr[__integerMin0]
    var YPosition: js.UndefOr[__integerMin0]
  }

  object BurnInDestinationSettings {
    @inline
    def apply(
        Alignment: js.UndefOr[BurnInAlignment] = js.undefined,
        BackgroundColor: js.UndefOr[BurnInBackgroundColor] = js.undefined,
        BackgroundOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        Font: js.UndefOr[InputLocation] = js.undefined,
        FontColor: js.UndefOr[BurnInFontColor] = js.undefined,
        FontOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        FontResolution: js.UndefOr[__integerMin96Max600] = js.undefined,
        FontSize: js.UndefOr[__string] = js.undefined,
        OutlineColor: js.UndefOr[BurnInOutlineColor] = js.undefined,
        OutlineSize: js.UndefOr[__integerMin0Max10] = js.undefined,
        ShadowColor: js.UndefOr[BurnInShadowColor] = js.undefined,
        ShadowOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        ShadowXOffset: js.UndefOr[__integer] = js.undefined,
        ShadowYOffset: js.UndefOr[__integer] = js.undefined,
        TeletextGridControl: js.UndefOr[BurnInTeletextGridControl] = js.undefined,
        XPosition: js.UndefOr[__integerMin0] = js.undefined,
        YPosition: js.UndefOr[__integerMin0] = js.undefined
    ): BurnInDestinationSettings = {
      val __obj = js.Dynamic.literal()
      Alignment.foreach(__v => __obj.updateDynamic("Alignment")(__v.asInstanceOf[js.Any]))
      BackgroundColor.foreach(__v => __obj.updateDynamic("BackgroundColor")(__v.asInstanceOf[js.Any]))
      BackgroundOpacity.foreach(__v => __obj.updateDynamic("BackgroundOpacity")(__v.asInstanceOf[js.Any]))
      Font.foreach(__v => __obj.updateDynamic("Font")(__v.asInstanceOf[js.Any]))
      FontColor.foreach(__v => __obj.updateDynamic("FontColor")(__v.asInstanceOf[js.Any]))
      FontOpacity.foreach(__v => __obj.updateDynamic("FontOpacity")(__v.asInstanceOf[js.Any]))
      FontResolution.foreach(__v => __obj.updateDynamic("FontResolution")(__v.asInstanceOf[js.Any]))
      FontSize.foreach(__v => __obj.updateDynamic("FontSize")(__v.asInstanceOf[js.Any]))
      OutlineColor.foreach(__v => __obj.updateDynamic("OutlineColor")(__v.asInstanceOf[js.Any]))
      OutlineSize.foreach(__v => __obj.updateDynamic("OutlineSize")(__v.asInstanceOf[js.Any]))
      ShadowColor.foreach(__v => __obj.updateDynamic("ShadowColor")(__v.asInstanceOf[js.Any]))
      ShadowOpacity.foreach(__v => __obj.updateDynamic("ShadowOpacity")(__v.asInstanceOf[js.Any]))
      ShadowXOffset.foreach(__v => __obj.updateDynamic("ShadowXOffset")(__v.asInstanceOf[js.Any]))
      ShadowYOffset.foreach(__v => __obj.updateDynamic("ShadowYOffset")(__v.asInstanceOf[js.Any]))
      TeletextGridControl.foreach(__v => __obj.updateDynamic("TeletextGridControl")(__v.asInstanceOf[js.Any]))
      XPosition.foreach(__v => __obj.updateDynamic("XPosition")(__v.asInstanceOf[js.Any]))
      YPosition.foreach(__v => __obj.updateDynamic("YPosition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BurnInDestinationSettings]
    }
  }

  /**
    * Burn In Font Color
    */
  object BurnInFontColorEnum {
    val BLACK  = "BLACK"
    val BLUE   = "BLUE"
    val GREEN  = "GREEN"
    val RED    = "RED"
    val WHITE  = "WHITE"
    val YELLOW = "YELLOW"

    val values = js.Object.freeze(js.Array(BLACK, BLUE, GREEN, RED, WHITE, YELLOW))
  }

  /**
    * Burn In Outline Color
    */
  object BurnInOutlineColorEnum {
    val BLACK  = "BLACK"
    val BLUE   = "BLUE"
    val GREEN  = "GREEN"
    val RED    = "RED"
    val WHITE  = "WHITE"
    val YELLOW = "YELLOW"

    val values = js.Object.freeze(js.Array(BLACK, BLUE, GREEN, RED, WHITE, YELLOW))
  }

  /**
    * Burn In Shadow Color
    */
  object BurnInShadowColorEnum {
    val BLACK = "BLACK"
    val NONE  = "NONE"
    val WHITE = "WHITE"

    val values = js.Object.freeze(js.Array(BLACK, NONE, WHITE))
  }

  /**
    * Burn In Teletext Grid Control
    */
  object BurnInTeletextGridControlEnum {
    val FIXED  = "FIXED"
    val SCALED = "SCALED"

    val values = js.Object.freeze(js.Array(FIXED, SCALED))
  }

  /**
    * Output groups for this Live Event. Output groups contain information about where streams should be distributed.
    */
  @js.native
  trait CaptionDescription extends js.Object {
    var CaptionSelectorName: __string
    var Name: __string
    var DestinationSettings: js.UndefOr[CaptionDestinationSettings]
    var LanguageCode: js.UndefOr[__string]
    var LanguageDescription: js.UndefOr[__string]
  }

  object CaptionDescription {
    @inline
    def apply(
        CaptionSelectorName: __string,
        Name: __string,
        DestinationSettings: js.UndefOr[CaptionDestinationSettings] = js.undefined,
        LanguageCode: js.UndefOr[__string] = js.undefined,
        LanguageDescription: js.UndefOr[__string] = js.undefined
    ): CaptionDescription = {
      val __obj = js.Dynamic.literal(
        "CaptionSelectorName" -> CaptionSelectorName.asInstanceOf[js.Any],
        "Name"                -> Name.asInstanceOf[js.Any]
      )

      DestinationSettings.foreach(__v => __obj.updateDynamic("DestinationSettings")(__v.asInstanceOf[js.Any]))
      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      LanguageDescription.foreach(__v => __obj.updateDynamic("LanguageDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptionDescription]
    }
  }

  /**
    * Caption Destination Settings
    */
  @js.native
  trait CaptionDestinationSettings extends js.Object {
    var AribDestinationSettings: js.UndefOr[AribDestinationSettings]
    var BurnInDestinationSettings: js.UndefOr[BurnInDestinationSettings]
    var DvbSubDestinationSettings: js.UndefOr[DvbSubDestinationSettings]
    var EmbeddedDestinationSettings: js.UndefOr[EmbeddedDestinationSettings]
    var EmbeddedPlusScte20DestinationSettings: js.UndefOr[EmbeddedPlusScte20DestinationSettings]
    var RtmpCaptionInfoDestinationSettings: js.UndefOr[RtmpCaptionInfoDestinationSettings]
    var Scte20PlusEmbeddedDestinationSettings: js.UndefOr[Scte20PlusEmbeddedDestinationSettings]
    var Scte27DestinationSettings: js.UndefOr[Scte27DestinationSettings]
    var SmpteTtDestinationSettings: js.UndefOr[SmpteTtDestinationSettings]
    var TeletextDestinationSettings: js.UndefOr[TeletextDestinationSettings]
    var TtmlDestinationSettings: js.UndefOr[TtmlDestinationSettings]
    var WebvttDestinationSettings: js.UndefOr[WebvttDestinationSettings]
  }

  object CaptionDestinationSettings {
    @inline
    def apply(
        AribDestinationSettings: js.UndefOr[AribDestinationSettings] = js.undefined,
        BurnInDestinationSettings: js.UndefOr[BurnInDestinationSettings] = js.undefined,
        DvbSubDestinationSettings: js.UndefOr[DvbSubDestinationSettings] = js.undefined,
        EmbeddedDestinationSettings: js.UndefOr[EmbeddedDestinationSettings] = js.undefined,
        EmbeddedPlusScte20DestinationSettings: js.UndefOr[EmbeddedPlusScte20DestinationSettings] = js.undefined,
        RtmpCaptionInfoDestinationSettings: js.UndefOr[RtmpCaptionInfoDestinationSettings] = js.undefined,
        Scte20PlusEmbeddedDestinationSettings: js.UndefOr[Scte20PlusEmbeddedDestinationSettings] = js.undefined,
        Scte27DestinationSettings: js.UndefOr[Scte27DestinationSettings] = js.undefined,
        SmpteTtDestinationSettings: js.UndefOr[SmpteTtDestinationSettings] = js.undefined,
        TeletextDestinationSettings: js.UndefOr[TeletextDestinationSettings] = js.undefined,
        TtmlDestinationSettings: js.UndefOr[TtmlDestinationSettings] = js.undefined,
        WebvttDestinationSettings: js.UndefOr[WebvttDestinationSettings] = js.undefined
    ): CaptionDestinationSettings = {
      val __obj = js.Dynamic.literal()
      AribDestinationSettings.foreach(__v => __obj.updateDynamic("AribDestinationSettings")(__v.asInstanceOf[js.Any]))
      BurnInDestinationSettings.foreach(
        __v => __obj.updateDynamic("BurnInDestinationSettings")(__v.asInstanceOf[js.Any])
      )
      DvbSubDestinationSettings.foreach(
        __v => __obj.updateDynamic("DvbSubDestinationSettings")(__v.asInstanceOf[js.Any])
      )
      EmbeddedDestinationSettings.foreach(
        __v => __obj.updateDynamic("EmbeddedDestinationSettings")(__v.asInstanceOf[js.Any])
      )
      EmbeddedPlusScte20DestinationSettings.foreach(
        __v => __obj.updateDynamic("EmbeddedPlusScte20DestinationSettings")(__v.asInstanceOf[js.Any])
      )
      RtmpCaptionInfoDestinationSettings.foreach(
        __v => __obj.updateDynamic("RtmpCaptionInfoDestinationSettings")(__v.asInstanceOf[js.Any])
      )
      Scte20PlusEmbeddedDestinationSettings.foreach(
        __v => __obj.updateDynamic("Scte20PlusEmbeddedDestinationSettings")(__v.asInstanceOf[js.Any])
      )
      Scte27DestinationSettings.foreach(
        __v => __obj.updateDynamic("Scte27DestinationSettings")(__v.asInstanceOf[js.Any])
      )
      SmpteTtDestinationSettings.foreach(
        __v => __obj.updateDynamic("SmpteTtDestinationSettings")(__v.asInstanceOf[js.Any])
      )
      TeletextDestinationSettings.foreach(
        __v => __obj.updateDynamic("TeletextDestinationSettings")(__v.asInstanceOf[js.Any])
      )
      TtmlDestinationSettings.foreach(__v => __obj.updateDynamic("TtmlDestinationSettings")(__v.asInstanceOf[js.Any]))
      WebvttDestinationSettings.foreach(
        __v => __obj.updateDynamic("WebvttDestinationSettings")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CaptionDestinationSettings]
    }
  }

  /**
    * Maps a caption channel to an ISO 693-2 language code (http://www.loc.gov/standards/iso639-2), with an optional description.
    */
  @js.native
  trait CaptionLanguageMapping extends js.Object {
    var CaptionChannel: __integerMin1Max4
    var LanguageCode: __stringMin3Max3
    var LanguageDescription: __stringMin1
  }

  object CaptionLanguageMapping {
    @inline
    def apply(
        CaptionChannel: __integerMin1Max4,
        LanguageCode: __stringMin3Max3,
        LanguageDescription: __stringMin1
    ): CaptionLanguageMapping = {
      val __obj = js.Dynamic.literal(
        "CaptionChannel"      -> CaptionChannel.asInstanceOf[js.Any],
        "LanguageCode"        -> LanguageCode.asInstanceOf[js.Any],
        "LanguageDescription" -> LanguageDescription.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CaptionLanguageMapping]
    }
  }

  /**
    * Output groups for this Live Event. Output groups contain information about where streams should be distributed.
    */
  @js.native
  trait CaptionSelector extends js.Object {
    var Name: __stringMin1
    var LanguageCode: js.UndefOr[__string]
    var SelectorSettings: js.UndefOr[CaptionSelectorSettings]
  }

  object CaptionSelector {
    @inline
    def apply(
        Name: __stringMin1,
        LanguageCode: js.UndefOr[__string] = js.undefined,
        SelectorSettings: js.UndefOr[CaptionSelectorSettings] = js.undefined
    ): CaptionSelector = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      LanguageCode.foreach(__v => __obj.updateDynamic("LanguageCode")(__v.asInstanceOf[js.Any]))
      SelectorSettings.foreach(__v => __obj.updateDynamic("SelectorSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptionSelector]
    }
  }

  /**
    * Caption Selector Settings
    */
  @js.native
  trait CaptionSelectorSettings extends js.Object {
    var AribSourceSettings: js.UndefOr[AribSourceSettings]
    var DvbSubSourceSettings: js.UndefOr[DvbSubSourceSettings]
    var EmbeddedSourceSettings: js.UndefOr[EmbeddedSourceSettings]
    var Scte20SourceSettings: js.UndefOr[Scte20SourceSettings]
    var Scte27SourceSettings: js.UndefOr[Scte27SourceSettings]
    var TeletextSourceSettings: js.UndefOr[TeletextSourceSettings]
  }

  object CaptionSelectorSettings {
    @inline
    def apply(
        AribSourceSettings: js.UndefOr[AribSourceSettings] = js.undefined,
        DvbSubSourceSettings: js.UndefOr[DvbSubSourceSettings] = js.undefined,
        EmbeddedSourceSettings: js.UndefOr[EmbeddedSourceSettings] = js.undefined,
        Scte20SourceSettings: js.UndefOr[Scte20SourceSettings] = js.undefined,
        Scte27SourceSettings: js.UndefOr[Scte27SourceSettings] = js.undefined,
        TeletextSourceSettings: js.UndefOr[TeletextSourceSettings] = js.undefined
    ): CaptionSelectorSettings = {
      val __obj = js.Dynamic.literal()
      AribSourceSettings.foreach(__v => __obj.updateDynamic("AribSourceSettings")(__v.asInstanceOf[js.Any]))
      DvbSubSourceSettings.foreach(__v => __obj.updateDynamic("DvbSubSourceSettings")(__v.asInstanceOf[js.Any]))
      EmbeddedSourceSettings.foreach(__v => __obj.updateDynamic("EmbeddedSourceSettings")(__v.asInstanceOf[js.Any]))
      Scte20SourceSettings.foreach(__v => __obj.updateDynamic("Scte20SourceSettings")(__v.asInstanceOf[js.Any]))
      Scte27SourceSettings.foreach(__v => __obj.updateDynamic("Scte27SourceSettings")(__v.asInstanceOf[js.Any]))
      TeletextSourceSettings.foreach(__v => __obj.updateDynamic("TeletextSourceSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CaptionSelectorSettings]
    }
  }

  /**
    * Placeholder documentation for Channel
    */
  @js.native
  trait Channel extends js.Object {
    var Arn: js.UndefOr[__string]
    var ChannelClass: js.UndefOr[ChannelClass]
    var Destinations: js.UndefOr[__listOfOutputDestination]
    var EgressEndpoints: js.UndefOr[__listOfChannelEgressEndpoint]
    var EncoderSettings: js.UndefOr[EncoderSettings]
    var Id: js.UndefOr[__string]
    var InputAttachments: js.UndefOr[__listOfInputAttachment]
    var InputSpecification: js.UndefOr[InputSpecification]
    var LogLevel: js.UndefOr[LogLevel]
    var Name: js.UndefOr[__string]
    var PipelineDetails: js.UndefOr[__listOfPipelineDetail]
    var PipelinesRunningCount: js.UndefOr[__integer]
    var RoleArn: js.UndefOr[__string]
    var State: js.UndefOr[ChannelState]
    var Tags: js.UndefOr[Tags]
  }

  object Channel {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        ChannelClass: js.UndefOr[ChannelClass] = js.undefined,
        Destinations: js.UndefOr[__listOfOutputDestination] = js.undefined,
        EgressEndpoints: js.UndefOr[__listOfChannelEgressEndpoint] = js.undefined,
        EncoderSettings: js.UndefOr[EncoderSettings] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        InputAttachments: js.UndefOr[__listOfInputAttachment] = js.undefined,
        InputSpecification: js.UndefOr[InputSpecification] = js.undefined,
        LogLevel: js.UndefOr[LogLevel] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        PipelineDetails: js.UndefOr[__listOfPipelineDetail] = js.undefined,
        PipelinesRunningCount: js.UndefOr[__integer] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ChannelState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): Channel = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ChannelClass.foreach(__v => __obj.updateDynamic("ChannelClass")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      EgressEndpoints.foreach(__v => __obj.updateDynamic("EgressEndpoints")(__v.asInstanceOf[js.Any]))
      EncoderSettings.foreach(__v => __obj.updateDynamic("EncoderSettings")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InputAttachments.foreach(__v => __obj.updateDynamic("InputAttachments")(__v.asInstanceOf[js.Any]))
      InputSpecification.foreach(__v => __obj.updateDynamic("InputSpecification")(__v.asInstanceOf[js.Any]))
      LogLevel.foreach(__v => __obj.updateDynamic("LogLevel")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PipelineDetails.foreach(__v => __obj.updateDynamic("PipelineDetails")(__v.asInstanceOf[js.Any]))
      PipelinesRunningCount.foreach(__v => __obj.updateDynamic("PipelinesRunningCount")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Channel]
    }
  }

  /**
    * A standard channel has two encoding pipelines and a single pipeline channel only has one.
    */
  object ChannelClassEnum {
    val STANDARD        = "STANDARD"
    val SINGLE_PIPELINE = "SINGLE_PIPELINE"

    val values = js.Object.freeze(js.Array(STANDARD, SINGLE_PIPELINE))
  }

  /**
    * Placeholder documentation for ChannelEgressEndpoint
    */
  @js.native
  trait ChannelEgressEndpoint extends js.Object {
    var SourceIp: js.UndefOr[__string]
  }

  object ChannelEgressEndpoint {
    @inline
    def apply(
        SourceIp: js.UndefOr[__string] = js.undefined
    ): ChannelEgressEndpoint = {
      val __obj = js.Dynamic.literal()
      SourceIp.foreach(__v => __obj.updateDynamic("SourceIp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelEgressEndpoint]
    }
  }

  /**
    * Placeholder documentation for ChannelState
    */
  object ChannelStateEnum {
    val CREATING      = "CREATING"
    val CREATE_FAILED = "CREATE_FAILED"
    val IDLE          = "IDLE"
    val STARTING      = "STARTING"
    val RUNNING       = "RUNNING"
    val RECOVERING    = "RECOVERING"
    val STOPPING      = "STOPPING"
    val DELETING      = "DELETING"
    val DELETED       = "DELETED"
    val UPDATING      = "UPDATING"
    val UPDATE_FAILED = "UPDATE_FAILED"

    val values = js.Object.freeze(
      js.Array(
        CREATING,
        CREATE_FAILED,
        IDLE,
        STARTING,
        RUNNING,
        RECOVERING,
        STOPPING,
        DELETING,
        DELETED,
        UPDATING,
        UPDATE_FAILED
      )
    )
  }

  /**
    * Placeholder documentation for ChannelSummary
    */
  @js.native
  trait ChannelSummary extends js.Object {
    var Arn: js.UndefOr[__string]
    var ChannelClass: js.UndefOr[ChannelClass]
    var Destinations: js.UndefOr[__listOfOutputDestination]
    var EgressEndpoints: js.UndefOr[__listOfChannelEgressEndpoint]
    var Id: js.UndefOr[__string]
    var InputAttachments: js.UndefOr[__listOfInputAttachment]
    var InputSpecification: js.UndefOr[InputSpecification]
    var LogLevel: js.UndefOr[LogLevel]
    var Name: js.UndefOr[__string]
    var PipelinesRunningCount: js.UndefOr[__integer]
    var RoleArn: js.UndefOr[__string]
    var State: js.UndefOr[ChannelState]
    var Tags: js.UndefOr[Tags]
  }

  object ChannelSummary {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        ChannelClass: js.UndefOr[ChannelClass] = js.undefined,
        Destinations: js.UndefOr[__listOfOutputDestination] = js.undefined,
        EgressEndpoints: js.UndefOr[__listOfChannelEgressEndpoint] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        InputAttachments: js.UndefOr[__listOfInputAttachment] = js.undefined,
        InputSpecification: js.UndefOr[InputSpecification] = js.undefined,
        LogLevel: js.UndefOr[LogLevel] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        PipelinesRunningCount: js.UndefOr[__integer] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ChannelState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): ChannelSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ChannelClass.foreach(__v => __obj.updateDynamic("ChannelClass")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      EgressEndpoints.foreach(__v => __obj.updateDynamic("EgressEndpoints")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InputAttachments.foreach(__v => __obj.updateDynamic("InputAttachments")(__v.asInstanceOf[js.Any]))
      InputSpecification.foreach(__v => __obj.updateDynamic("InputSpecification")(__v.asInstanceOf[js.Any]))
      LogLevel.foreach(__v => __obj.updateDynamic("LogLevel")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PipelinesRunningCount.foreach(__v => __obj.updateDynamic("PipelinesRunningCount")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelSummary]
    }
  }

  /**
    * A request to create a channel
    */
  @js.native
  trait CreateChannelRequest extends js.Object {
    var ChannelClass: js.UndefOr[ChannelClass]
    var Destinations: js.UndefOr[__listOfOutputDestination]
    var EncoderSettings: js.UndefOr[EncoderSettings]
    var InputAttachments: js.UndefOr[__listOfInputAttachment]
    var InputSpecification: js.UndefOr[InputSpecification]
    var LogLevel: js.UndefOr[LogLevel]
    var Name: js.UndefOr[__string]
    var RequestId: js.UndefOr[__string]
    var Reserved: js.UndefOr[__string]
    var RoleArn: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object CreateChannelRequest {
    @inline
    def apply(
        ChannelClass: js.UndefOr[ChannelClass] = js.undefined,
        Destinations: js.UndefOr[__listOfOutputDestination] = js.undefined,
        EncoderSettings: js.UndefOr[EncoderSettings] = js.undefined,
        InputAttachments: js.UndefOr[__listOfInputAttachment] = js.undefined,
        InputSpecification: js.UndefOr[InputSpecification] = js.undefined,
        LogLevel: js.UndefOr[LogLevel] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        RequestId: js.UndefOr[__string] = js.undefined,
        Reserved: js.UndefOr[__string] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateChannelRequest = {
      val __obj = js.Dynamic.literal()
      ChannelClass.foreach(__v => __obj.updateDynamic("ChannelClass")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      EncoderSettings.foreach(__v => __obj.updateDynamic("EncoderSettings")(__v.asInstanceOf[js.Any]))
      InputAttachments.foreach(__v => __obj.updateDynamic("InputAttachments")(__v.asInstanceOf[js.Any]))
      InputSpecification.foreach(__v => __obj.updateDynamic("InputSpecification")(__v.asInstanceOf[js.Any]))
      LogLevel.foreach(__v => __obj.updateDynamic("LogLevel")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Reserved.foreach(__v => __obj.updateDynamic("Reserved")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChannelRequest]
    }
  }

  /**
    * Placeholder documentation for CreateChannelResponse
    */
  @js.native
  trait CreateChannelResponse extends js.Object {
    var Channel: js.UndefOr[Channel]
  }

  object CreateChannelResponse {
    @inline
    def apply(
        Channel: js.UndefOr[Channel] = js.undefined
    ): CreateChannelResponse = {
      val __obj = js.Dynamic.literal()
      Channel.foreach(__v => __obj.updateDynamic("Channel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChannelResponse]
    }
  }

  /**
    * The name of the input
    */
  @js.native
  trait CreateInputRequest extends js.Object {
    var Destinations: js.UndefOr[__listOfInputDestinationRequest]
    var InputSecurityGroups: js.UndefOr[__listOf__string]
    var MediaConnectFlows: js.UndefOr[__listOfMediaConnectFlowRequest]
    var Name: js.UndefOr[__string]
    var RequestId: js.UndefOr[__string]
    var RoleArn: js.UndefOr[__string]
    var Sources: js.UndefOr[__listOfInputSourceRequest]
    var Tags: js.UndefOr[Tags]
    var Type: js.UndefOr[InputType]
    var Vpc: js.UndefOr[InputVpcRequest]
  }

  object CreateInputRequest {
    @inline
    def apply(
        Destinations: js.UndefOr[__listOfInputDestinationRequest] = js.undefined,
        InputSecurityGroups: js.UndefOr[__listOf__string] = js.undefined,
        MediaConnectFlows: js.UndefOr[__listOfMediaConnectFlowRequest] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        RequestId: js.UndefOr[__string] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        Sources: js.UndefOr[__listOfInputSourceRequest] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Type: js.UndefOr[InputType] = js.undefined,
        Vpc: js.UndefOr[InputVpcRequest] = js.undefined
    ): CreateInputRequest = {
      val __obj = js.Dynamic.literal()
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      InputSecurityGroups.foreach(__v => __obj.updateDynamic("InputSecurityGroups")(__v.asInstanceOf[js.Any]))
      MediaConnectFlows.foreach(__v => __obj.updateDynamic("MediaConnectFlows")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.updateDynamic("Sources")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Vpc.foreach(__v => __obj.updateDynamic("Vpc")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInputRequest]
    }
  }

  /**
    * Placeholder documentation for CreateInputResponse
    */
  @js.native
  trait CreateInputResponse extends js.Object {
    var Input: js.UndefOr[Input]
  }

  object CreateInputResponse {
    @inline
    def apply(
        Input: js.UndefOr[Input] = js.undefined
    ): CreateInputResponse = {
      val __obj = js.Dynamic.literal()
      Input.foreach(__v => __obj.updateDynamic("Input")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInputResponse]
    }
  }

  /**
    * The IPv4 CIDRs to whitelist for this Input Security Group
    */
  @js.native
  trait CreateInputSecurityGroupRequest extends js.Object {
    var Tags: js.UndefOr[Tags]
    var WhitelistRules: js.UndefOr[__listOfInputWhitelistRuleCidr]
  }

  object CreateInputSecurityGroupRequest {
    @inline
    def apply(
        Tags: js.UndefOr[Tags] = js.undefined,
        WhitelistRules: js.UndefOr[__listOfInputWhitelistRuleCidr] = js.undefined
    ): CreateInputSecurityGroupRequest = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      WhitelistRules.foreach(__v => __obj.updateDynamic("WhitelistRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInputSecurityGroupRequest]
    }
  }

  /**
    * Placeholder documentation for CreateInputSecurityGroupResponse
    */
  @js.native
  trait CreateInputSecurityGroupResponse extends js.Object {
    var SecurityGroup: js.UndefOr[InputSecurityGroup]
  }

  object CreateInputSecurityGroupResponse {
    @inline
    def apply(
        SecurityGroup: js.UndefOr[InputSecurityGroup] = js.undefined
    ): CreateInputSecurityGroupResponse = {
      val __obj = js.Dynamic.literal()
      SecurityGroup.foreach(__v => __obj.updateDynamic("SecurityGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInputSecurityGroupResponse]
    }
  }

  /**
    * Placeholder documentation for CreateTagsRequest
    */
  @js.native
  trait CreateTagsRequest extends js.Object {
    var ResourceArn: __string
    var Tags: js.UndefOr[Tags]
  }

  object CreateTagsRequest {
    @inline
    def apply(
        ResourceArn: __string,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTagsRequest]
    }
  }

  /**
    * Placeholder documentation for DeleteChannelRequest
    */
  @js.native
  trait DeleteChannelRequest extends js.Object {
    var ChannelId: __string
  }

  object DeleteChannelRequest {
    @inline
    def apply(
        ChannelId: __string
    ): DeleteChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelId" -> ChannelId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteChannelRequest]
    }
  }

  /**
    * Placeholder documentation for DeleteChannelResponse
    */
  @js.native
  trait DeleteChannelResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var ChannelClass: js.UndefOr[ChannelClass]
    var Destinations: js.UndefOr[__listOfOutputDestination]
    var EgressEndpoints: js.UndefOr[__listOfChannelEgressEndpoint]
    var EncoderSettings: js.UndefOr[EncoderSettings]
    var Id: js.UndefOr[__string]
    var InputAttachments: js.UndefOr[__listOfInputAttachment]
    var InputSpecification: js.UndefOr[InputSpecification]
    var LogLevel: js.UndefOr[LogLevel]
    var Name: js.UndefOr[__string]
    var PipelineDetails: js.UndefOr[__listOfPipelineDetail]
    var PipelinesRunningCount: js.UndefOr[__integer]
    var RoleArn: js.UndefOr[__string]
    var State: js.UndefOr[ChannelState]
    var Tags: js.UndefOr[Tags]
  }

  object DeleteChannelResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        ChannelClass: js.UndefOr[ChannelClass] = js.undefined,
        Destinations: js.UndefOr[__listOfOutputDestination] = js.undefined,
        EgressEndpoints: js.UndefOr[__listOfChannelEgressEndpoint] = js.undefined,
        EncoderSettings: js.UndefOr[EncoderSettings] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        InputAttachments: js.UndefOr[__listOfInputAttachment] = js.undefined,
        InputSpecification: js.UndefOr[InputSpecification] = js.undefined,
        LogLevel: js.UndefOr[LogLevel] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        PipelineDetails: js.UndefOr[__listOfPipelineDetail] = js.undefined,
        PipelinesRunningCount: js.UndefOr[__integer] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ChannelState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DeleteChannelResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ChannelClass.foreach(__v => __obj.updateDynamic("ChannelClass")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      EgressEndpoints.foreach(__v => __obj.updateDynamic("EgressEndpoints")(__v.asInstanceOf[js.Any]))
      EncoderSettings.foreach(__v => __obj.updateDynamic("EncoderSettings")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InputAttachments.foreach(__v => __obj.updateDynamic("InputAttachments")(__v.asInstanceOf[js.Any]))
      InputSpecification.foreach(__v => __obj.updateDynamic("InputSpecification")(__v.asInstanceOf[js.Any]))
      LogLevel.foreach(__v => __obj.updateDynamic("LogLevel")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PipelineDetails.foreach(__v => __obj.updateDynamic("PipelineDetails")(__v.asInstanceOf[js.Any]))
      PipelinesRunningCount.foreach(__v => __obj.updateDynamic("PipelinesRunningCount")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteChannelResponse]
    }
  }

  /**
    * Placeholder documentation for DeleteInputRequest
    */
  @js.native
  trait DeleteInputRequest extends js.Object {
    var InputId: __string
  }

  object DeleteInputRequest {
    @inline
    def apply(
        InputId: __string
    ): DeleteInputRequest = {
      val __obj = js.Dynamic.literal(
        "InputId" -> InputId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteInputRequest]
    }
  }

  /**
    * Placeholder documentation for DeleteInputResponse
    */
  @js.native
  trait DeleteInputResponse extends js.Object {}

  object DeleteInputResponse {
    @inline
    def apply(
        ): DeleteInputResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteInputResponse]
    }
  }

  /**
    * Placeholder documentation for DeleteInputSecurityGroupRequest
    */
  @js.native
  trait DeleteInputSecurityGroupRequest extends js.Object {
    var InputSecurityGroupId: __string
  }

  object DeleteInputSecurityGroupRequest {
    @inline
    def apply(
        InputSecurityGroupId: __string
    ): DeleteInputSecurityGroupRequest = {
      val __obj = js.Dynamic.literal(
        "InputSecurityGroupId" -> InputSecurityGroupId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteInputSecurityGroupRequest]
    }
  }

  /**
    * Placeholder documentation for DeleteInputSecurityGroupResponse
    */
  @js.native
  trait DeleteInputSecurityGroupResponse extends js.Object {}

  object DeleteInputSecurityGroupResponse {
    @inline
    def apply(
        ): DeleteInputSecurityGroupResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteInputSecurityGroupResponse]
    }
  }

  /**
    * Placeholder documentation for DeleteReservationRequest
    */
  @js.native
  trait DeleteReservationRequest extends js.Object {
    var ReservationId: __string
  }

  object DeleteReservationRequest {
    @inline
    def apply(
        ReservationId: __string
    ): DeleteReservationRequest = {
      val __obj = js.Dynamic.literal(
        "ReservationId" -> ReservationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteReservationRequest]
    }
  }

  /**
    * Placeholder documentation for DeleteReservationResponse
    */
  @js.native
  trait DeleteReservationResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Count: js.UndefOr[__integer]
    var CurrencyCode: js.UndefOr[__string]
    var Duration: js.UndefOr[__integer]
    var DurationUnits: js.UndefOr[OfferingDurationUnits]
    var End: js.UndefOr[__string]
    var FixedPrice: js.UndefOr[__double]
    var Name: js.UndefOr[__string]
    var OfferingDescription: js.UndefOr[__string]
    var OfferingId: js.UndefOr[__string]
    var OfferingType: js.UndefOr[OfferingType]
    var Region: js.UndefOr[__string]
    var ReservationId: js.UndefOr[__string]
    var ResourceSpecification: js.UndefOr[ReservationResourceSpecification]
    var Start: js.UndefOr[__string]
    var State: js.UndefOr[ReservationState]
    var Tags: js.UndefOr[Tags]
    var UsagePrice: js.UndefOr[__double]
  }

  object DeleteReservationResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Count: js.UndefOr[__integer] = js.undefined,
        CurrencyCode: js.UndefOr[__string] = js.undefined,
        Duration: js.UndefOr[__integer] = js.undefined,
        DurationUnits: js.UndefOr[OfferingDurationUnits] = js.undefined,
        End: js.UndefOr[__string] = js.undefined,
        FixedPrice: js.UndefOr[__double] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        OfferingDescription: js.UndefOr[__string] = js.undefined,
        OfferingId: js.UndefOr[__string] = js.undefined,
        OfferingType: js.UndefOr[OfferingType] = js.undefined,
        Region: js.UndefOr[__string] = js.undefined,
        ReservationId: js.UndefOr[__string] = js.undefined,
        ResourceSpecification: js.UndefOr[ReservationResourceSpecification] = js.undefined,
        Start: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ReservationState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        UsagePrice: js.UndefOr[__double] = js.undefined
    ): DeleteReservationResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      DurationUnits.foreach(__v => __obj.updateDynamic("DurationUnits")(__v.asInstanceOf[js.Any]))
      End.foreach(__v => __obj.updateDynamic("End")(__v.asInstanceOf[js.Any]))
      FixedPrice.foreach(__v => __obj.updateDynamic("FixedPrice")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OfferingDescription.foreach(__v => __obj.updateDynamic("OfferingDescription")(__v.asInstanceOf[js.Any]))
      OfferingId.foreach(__v => __obj.updateDynamic("OfferingId")(__v.asInstanceOf[js.Any]))
      OfferingType.foreach(__v => __obj.updateDynamic("OfferingType")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      ReservationId.foreach(__v => __obj.updateDynamic("ReservationId")(__v.asInstanceOf[js.Any]))
      ResourceSpecification.foreach(__v => __obj.updateDynamic("ResourceSpecification")(__v.asInstanceOf[js.Any]))
      Start.foreach(__v => __obj.updateDynamic("Start")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UsagePrice.foreach(__v => __obj.updateDynamic("UsagePrice")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteReservationResponse]
    }
  }

  /**
    * Placeholder documentation for DeleteScheduleRequest
    */
  @js.native
  trait DeleteScheduleRequest extends js.Object {
    var ChannelId: __string
  }

  object DeleteScheduleRequest {
    @inline
    def apply(
        ChannelId: __string
    ): DeleteScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelId" -> ChannelId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteScheduleRequest]
    }
  }

  /**
    * Placeholder documentation for DeleteScheduleResponse
    */
  @js.native
  trait DeleteScheduleResponse extends js.Object {}

  object DeleteScheduleResponse {
    @inline
    def apply(
        ): DeleteScheduleResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteScheduleResponse]
    }
  }

  /**
    * Placeholder documentation for DeleteTagsRequest
    */
  @js.native
  trait DeleteTagsRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  object DeleteTagsRequest {
    @inline
    def apply(
        ResourceArn: __string,
        TagKeys: __listOf__string
    ): DeleteTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTagsRequest]
    }
  }

  /**
    * Placeholder documentation for DescribeChannelRequest
    */
  @js.native
  trait DescribeChannelRequest extends js.Object {
    var ChannelId: __string
  }

  object DescribeChannelRequest {
    @inline
    def apply(
        ChannelId: __string
    ): DescribeChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelId" -> ChannelId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeChannelRequest]
    }
  }

  /**
    * Placeholder documentation for DescribeChannelResponse
    */
  @js.native
  trait DescribeChannelResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var ChannelClass: js.UndefOr[ChannelClass]
    var Destinations: js.UndefOr[__listOfOutputDestination]
    var EgressEndpoints: js.UndefOr[__listOfChannelEgressEndpoint]
    var EncoderSettings: js.UndefOr[EncoderSettings]
    var Id: js.UndefOr[__string]
    var InputAttachments: js.UndefOr[__listOfInputAttachment]
    var InputSpecification: js.UndefOr[InputSpecification]
    var LogLevel: js.UndefOr[LogLevel]
    var Name: js.UndefOr[__string]
    var PipelineDetails: js.UndefOr[__listOfPipelineDetail]
    var PipelinesRunningCount: js.UndefOr[__integer]
    var RoleArn: js.UndefOr[__string]
    var State: js.UndefOr[ChannelState]
    var Tags: js.UndefOr[Tags]
  }

  object DescribeChannelResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        ChannelClass: js.UndefOr[ChannelClass] = js.undefined,
        Destinations: js.UndefOr[__listOfOutputDestination] = js.undefined,
        EgressEndpoints: js.UndefOr[__listOfChannelEgressEndpoint] = js.undefined,
        EncoderSettings: js.UndefOr[EncoderSettings] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        InputAttachments: js.UndefOr[__listOfInputAttachment] = js.undefined,
        InputSpecification: js.UndefOr[InputSpecification] = js.undefined,
        LogLevel: js.UndefOr[LogLevel] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        PipelineDetails: js.UndefOr[__listOfPipelineDetail] = js.undefined,
        PipelinesRunningCount: js.UndefOr[__integer] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ChannelState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DescribeChannelResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ChannelClass.foreach(__v => __obj.updateDynamic("ChannelClass")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      EgressEndpoints.foreach(__v => __obj.updateDynamic("EgressEndpoints")(__v.asInstanceOf[js.Any]))
      EncoderSettings.foreach(__v => __obj.updateDynamic("EncoderSettings")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InputAttachments.foreach(__v => __obj.updateDynamic("InputAttachments")(__v.asInstanceOf[js.Any]))
      InputSpecification.foreach(__v => __obj.updateDynamic("InputSpecification")(__v.asInstanceOf[js.Any]))
      LogLevel.foreach(__v => __obj.updateDynamic("LogLevel")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PipelineDetails.foreach(__v => __obj.updateDynamic("PipelineDetails")(__v.asInstanceOf[js.Any]))
      PipelinesRunningCount.foreach(__v => __obj.updateDynamic("PipelinesRunningCount")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeChannelResponse]
    }
  }

  /**
    * Placeholder documentation for DescribeInputRequest
    */
  @js.native
  trait DescribeInputRequest extends js.Object {
    var InputId: __string
  }

  object DescribeInputRequest {
    @inline
    def apply(
        InputId: __string
    ): DescribeInputRequest = {
      val __obj = js.Dynamic.literal(
        "InputId" -> InputId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeInputRequest]
    }
  }

  /**
    * Placeholder documentation for DescribeInputResponse
    */
  @js.native
  trait DescribeInputResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var AttachedChannels: js.UndefOr[__listOf__string]
    var Destinations: js.UndefOr[__listOfInputDestination]
    var Id: js.UndefOr[__string]
    var InputClass: js.UndefOr[InputClass]
    var InputSourceType: js.UndefOr[InputSourceType]
    var MediaConnectFlows: js.UndefOr[__listOfMediaConnectFlow]
    var Name: js.UndefOr[__string]
    var RoleArn: js.UndefOr[__string]
    var SecurityGroups: js.UndefOr[__listOf__string]
    var Sources: js.UndefOr[__listOfInputSource]
    var State: js.UndefOr[InputState]
    var Tags: js.UndefOr[Tags]
    var Type: js.UndefOr[InputType]
  }

  object DescribeInputResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        AttachedChannels: js.UndefOr[__listOf__string] = js.undefined,
        Destinations: js.UndefOr[__listOfInputDestination] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        InputClass: js.UndefOr[InputClass] = js.undefined,
        InputSourceType: js.UndefOr[InputSourceType] = js.undefined,
        MediaConnectFlows: js.UndefOr[__listOfMediaConnectFlow] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        SecurityGroups: js.UndefOr[__listOf__string] = js.undefined,
        Sources: js.UndefOr[__listOfInputSource] = js.undefined,
        State: js.UndefOr[InputState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Type: js.UndefOr[InputType] = js.undefined
    ): DescribeInputResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AttachedChannels.foreach(__v => __obj.updateDynamic("AttachedChannels")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InputClass.foreach(__v => __obj.updateDynamic("InputClass")(__v.asInstanceOf[js.Any]))
      InputSourceType.foreach(__v => __obj.updateDynamic("InputSourceType")(__v.asInstanceOf[js.Any]))
      MediaConnectFlows.foreach(__v => __obj.updateDynamic("MediaConnectFlows")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.updateDynamic("Sources")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInputResponse]
    }
  }

  /**
    * Placeholder documentation for DescribeInputSecurityGroupRequest
    */
  @js.native
  trait DescribeInputSecurityGroupRequest extends js.Object {
    var InputSecurityGroupId: __string
  }

  object DescribeInputSecurityGroupRequest {
    @inline
    def apply(
        InputSecurityGroupId: __string
    ): DescribeInputSecurityGroupRequest = {
      val __obj = js.Dynamic.literal(
        "InputSecurityGroupId" -> InputSecurityGroupId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeInputSecurityGroupRequest]
    }
  }

  /**
    * Placeholder documentation for DescribeInputSecurityGroupResponse
    */
  @js.native
  trait DescribeInputSecurityGroupResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Inputs: js.UndefOr[__listOf__string]
    var State: js.UndefOr[InputSecurityGroupState]
    var Tags: js.UndefOr[Tags]
    var WhitelistRules: js.UndefOr[__listOfInputWhitelistRule]
  }

  object DescribeInputSecurityGroupResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Inputs: js.UndefOr[__listOf__string] = js.undefined,
        State: js.UndefOr[InputSecurityGroupState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        WhitelistRules: js.UndefOr[__listOfInputWhitelistRule] = js.undefined
    ): DescribeInputSecurityGroupResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Inputs.foreach(__v => __obj.updateDynamic("Inputs")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      WhitelistRules.foreach(__v => __obj.updateDynamic("WhitelistRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInputSecurityGroupResponse]
    }
  }

  /**
    * Placeholder documentation for DescribeOfferingRequest
    */
  @js.native
  trait DescribeOfferingRequest extends js.Object {
    var OfferingId: __string
  }

  object DescribeOfferingRequest {
    @inline
    def apply(
        OfferingId: __string
    ): DescribeOfferingRequest = {
      val __obj = js.Dynamic.literal(
        "OfferingId" -> OfferingId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeOfferingRequest]
    }
  }

  /**
    * Placeholder documentation for DescribeOfferingResponse
    */
  @js.native
  trait DescribeOfferingResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CurrencyCode: js.UndefOr[__string]
    var Duration: js.UndefOr[__integer]
    var DurationUnits: js.UndefOr[OfferingDurationUnits]
    var FixedPrice: js.UndefOr[__double]
    var OfferingDescription: js.UndefOr[__string]
    var OfferingId: js.UndefOr[__string]
    var OfferingType: js.UndefOr[OfferingType]
    var Region: js.UndefOr[__string]
    var ResourceSpecification: js.UndefOr[ReservationResourceSpecification]
    var UsagePrice: js.UndefOr[__double]
  }

  object DescribeOfferingResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CurrencyCode: js.UndefOr[__string] = js.undefined,
        Duration: js.UndefOr[__integer] = js.undefined,
        DurationUnits: js.UndefOr[OfferingDurationUnits] = js.undefined,
        FixedPrice: js.UndefOr[__double] = js.undefined,
        OfferingDescription: js.UndefOr[__string] = js.undefined,
        OfferingId: js.UndefOr[__string] = js.undefined,
        OfferingType: js.UndefOr[OfferingType] = js.undefined,
        Region: js.UndefOr[__string] = js.undefined,
        ResourceSpecification: js.UndefOr[ReservationResourceSpecification] = js.undefined,
        UsagePrice: js.UndefOr[__double] = js.undefined
    ): DescribeOfferingResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      DurationUnits.foreach(__v => __obj.updateDynamic("DurationUnits")(__v.asInstanceOf[js.Any]))
      FixedPrice.foreach(__v => __obj.updateDynamic("FixedPrice")(__v.asInstanceOf[js.Any]))
      OfferingDescription.foreach(__v => __obj.updateDynamic("OfferingDescription")(__v.asInstanceOf[js.Any]))
      OfferingId.foreach(__v => __obj.updateDynamic("OfferingId")(__v.asInstanceOf[js.Any]))
      OfferingType.foreach(__v => __obj.updateDynamic("OfferingType")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      ResourceSpecification.foreach(__v => __obj.updateDynamic("ResourceSpecification")(__v.asInstanceOf[js.Any]))
      UsagePrice.foreach(__v => __obj.updateDynamic("UsagePrice")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOfferingResponse]
    }
  }

  /**
    * Placeholder documentation for DescribeReservationRequest
    */
  @js.native
  trait DescribeReservationRequest extends js.Object {
    var ReservationId: __string
  }

  object DescribeReservationRequest {
    @inline
    def apply(
        ReservationId: __string
    ): DescribeReservationRequest = {
      val __obj = js.Dynamic.literal(
        "ReservationId" -> ReservationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeReservationRequest]
    }
  }

  /**
    * Placeholder documentation for DescribeReservationResponse
    */
  @js.native
  trait DescribeReservationResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Count: js.UndefOr[__integer]
    var CurrencyCode: js.UndefOr[__string]
    var Duration: js.UndefOr[__integer]
    var DurationUnits: js.UndefOr[OfferingDurationUnits]
    var End: js.UndefOr[__string]
    var FixedPrice: js.UndefOr[__double]
    var Name: js.UndefOr[__string]
    var OfferingDescription: js.UndefOr[__string]
    var OfferingId: js.UndefOr[__string]
    var OfferingType: js.UndefOr[OfferingType]
    var Region: js.UndefOr[__string]
    var ReservationId: js.UndefOr[__string]
    var ResourceSpecification: js.UndefOr[ReservationResourceSpecification]
    var Start: js.UndefOr[__string]
    var State: js.UndefOr[ReservationState]
    var Tags: js.UndefOr[Tags]
    var UsagePrice: js.UndefOr[__double]
  }

  object DescribeReservationResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Count: js.UndefOr[__integer] = js.undefined,
        CurrencyCode: js.UndefOr[__string] = js.undefined,
        Duration: js.UndefOr[__integer] = js.undefined,
        DurationUnits: js.UndefOr[OfferingDurationUnits] = js.undefined,
        End: js.UndefOr[__string] = js.undefined,
        FixedPrice: js.UndefOr[__double] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        OfferingDescription: js.UndefOr[__string] = js.undefined,
        OfferingId: js.UndefOr[__string] = js.undefined,
        OfferingType: js.UndefOr[OfferingType] = js.undefined,
        Region: js.UndefOr[__string] = js.undefined,
        ReservationId: js.UndefOr[__string] = js.undefined,
        ResourceSpecification: js.UndefOr[ReservationResourceSpecification] = js.undefined,
        Start: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ReservationState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        UsagePrice: js.UndefOr[__double] = js.undefined
    ): DescribeReservationResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      DurationUnits.foreach(__v => __obj.updateDynamic("DurationUnits")(__v.asInstanceOf[js.Any]))
      End.foreach(__v => __obj.updateDynamic("End")(__v.asInstanceOf[js.Any]))
      FixedPrice.foreach(__v => __obj.updateDynamic("FixedPrice")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OfferingDescription.foreach(__v => __obj.updateDynamic("OfferingDescription")(__v.asInstanceOf[js.Any]))
      OfferingId.foreach(__v => __obj.updateDynamic("OfferingId")(__v.asInstanceOf[js.Any]))
      OfferingType.foreach(__v => __obj.updateDynamic("OfferingType")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      ReservationId.foreach(__v => __obj.updateDynamic("ReservationId")(__v.asInstanceOf[js.Any]))
      ResourceSpecification.foreach(__v => __obj.updateDynamic("ResourceSpecification")(__v.asInstanceOf[js.Any]))
      Start.foreach(__v => __obj.updateDynamic("Start")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UsagePrice.foreach(__v => __obj.updateDynamic("UsagePrice")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReservationResponse]
    }
  }

  /**
    * Placeholder documentation for DescribeScheduleRequest
    */
  @js.native
  trait DescribeScheduleRequest extends js.Object {
    var ChannelId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object DescribeScheduleRequest {
    @inline
    def apply(
        ChannelId: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): DescribeScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelId" -> ChannelId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScheduleRequest]
    }
  }

  /**
    * Placeholder documentation for DescribeScheduleResponse
    */
  @js.native
  trait DescribeScheduleResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var ScheduleActions: js.UndefOr[__listOfScheduleAction]
  }

  object DescribeScheduleResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        ScheduleActions: js.UndefOr[__listOfScheduleAction] = js.undefined
    ): DescribeScheduleResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ScheduleActions.foreach(__v => __obj.updateDynamic("ScheduleActions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScheduleResponse]
    }
  }

  /**
    * DVB Network Information Table (NIT)
    */
  @js.native
  trait DvbNitSettings extends js.Object {
    var NetworkId: __integerMin0Max65536
    var NetworkName: __stringMin1Max256
    var RepInterval: js.UndefOr[__integerMin25Max10000]
  }

  object DvbNitSettings {
    @inline
    def apply(
        NetworkId: __integerMin0Max65536,
        NetworkName: __stringMin1Max256,
        RepInterval: js.UndefOr[__integerMin25Max10000] = js.undefined
    ): DvbNitSettings = {
      val __obj = js.Dynamic.literal(
        "NetworkId"   -> NetworkId.asInstanceOf[js.Any],
        "NetworkName" -> NetworkName.asInstanceOf[js.Any]
      )

      RepInterval.foreach(__v => __obj.updateDynamic("RepInterval")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DvbNitSettings]
    }
  }

  /**
    * Dvb Sdt Output Sdt
    */
  object DvbSdtOutputSdtEnum {
    val SDT_FOLLOW            = "SDT_FOLLOW"
    val SDT_FOLLOW_IF_PRESENT = "SDT_FOLLOW_IF_PRESENT"
    val SDT_MANUAL            = "SDT_MANUAL"
    val SDT_NONE              = "SDT_NONE"

    val values = js.Object.freeze(js.Array(SDT_FOLLOW, SDT_FOLLOW_IF_PRESENT, SDT_MANUAL, SDT_NONE))
  }

  /**
    * DVB Service Description Table (SDT)
    */
  @js.native
  trait DvbSdtSettings extends js.Object {
    var OutputSdt: js.UndefOr[DvbSdtOutputSdt]
    var RepInterval: js.UndefOr[__integerMin25Max2000]
    var ServiceName: js.UndefOr[__stringMin1Max256]
    var ServiceProviderName: js.UndefOr[__stringMin1Max256]
  }

  object DvbSdtSettings {
    @inline
    def apply(
        OutputSdt: js.UndefOr[DvbSdtOutputSdt] = js.undefined,
        RepInterval: js.UndefOr[__integerMin25Max2000] = js.undefined,
        ServiceName: js.UndefOr[__stringMin1Max256] = js.undefined,
        ServiceProviderName: js.UndefOr[__stringMin1Max256] = js.undefined
    ): DvbSdtSettings = {
      val __obj = js.Dynamic.literal()
      OutputSdt.foreach(__v => __obj.updateDynamic("OutputSdt")(__v.asInstanceOf[js.Any]))
      RepInterval.foreach(__v => __obj.updateDynamic("RepInterval")(__v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.updateDynamic("ServiceName")(__v.asInstanceOf[js.Any]))
      ServiceProviderName.foreach(__v => __obj.updateDynamic("ServiceProviderName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DvbSdtSettings]
    }
  }

  /**
    * Dvb Sub Destination Alignment
    */
  object DvbSubDestinationAlignmentEnum {
    val CENTERED = "CENTERED"
    val LEFT     = "LEFT"
    val SMART    = "SMART"

    val values = js.Object.freeze(js.Array(CENTERED, LEFT, SMART))
  }

  /**
    * Dvb Sub Destination Background Color
    */
  object DvbSubDestinationBackgroundColorEnum {
    val BLACK = "BLACK"
    val NONE  = "NONE"
    val WHITE = "WHITE"

    val values = js.Object.freeze(js.Array(BLACK, NONE, WHITE))
  }

  /**
    * Dvb Sub Destination Font Color
    */
  object DvbSubDestinationFontColorEnum {
    val BLACK  = "BLACK"
    val BLUE   = "BLUE"
    val GREEN  = "GREEN"
    val RED    = "RED"
    val WHITE  = "WHITE"
    val YELLOW = "YELLOW"

    val values = js.Object.freeze(js.Array(BLACK, BLUE, GREEN, RED, WHITE, YELLOW))
  }

  /**
    * Dvb Sub Destination Outline Color
    */
  object DvbSubDestinationOutlineColorEnum {
    val BLACK  = "BLACK"
    val BLUE   = "BLUE"
    val GREEN  = "GREEN"
    val RED    = "RED"
    val WHITE  = "WHITE"
    val YELLOW = "YELLOW"

    val values = js.Object.freeze(js.Array(BLACK, BLUE, GREEN, RED, WHITE, YELLOW))
  }

  /**
    * Dvb Sub Destination Settings
    */
  @js.native
  trait DvbSubDestinationSettings extends js.Object {
    var Alignment: js.UndefOr[DvbSubDestinationAlignment]
    var BackgroundColor: js.UndefOr[DvbSubDestinationBackgroundColor]
    var BackgroundOpacity: js.UndefOr[__integerMin0Max255]
    var Font: js.UndefOr[InputLocation]
    var FontColor: js.UndefOr[DvbSubDestinationFontColor]
    var FontOpacity: js.UndefOr[__integerMin0Max255]
    var FontResolution: js.UndefOr[__integerMin96Max600]
    var FontSize: js.UndefOr[__string]
    var OutlineColor: js.UndefOr[DvbSubDestinationOutlineColor]
    var OutlineSize: js.UndefOr[__integerMin0Max10]
    var ShadowColor: js.UndefOr[DvbSubDestinationShadowColor]
    var ShadowOpacity: js.UndefOr[__integerMin0Max255]
    var ShadowXOffset: js.UndefOr[__integer]
    var ShadowYOffset: js.UndefOr[__integer]
    var TeletextGridControl: js.UndefOr[DvbSubDestinationTeletextGridControl]
    var XPosition: js.UndefOr[__integerMin0]
    var YPosition: js.UndefOr[__integerMin0]
  }

  object DvbSubDestinationSettings {
    @inline
    def apply(
        Alignment: js.UndefOr[DvbSubDestinationAlignment] = js.undefined,
        BackgroundColor: js.UndefOr[DvbSubDestinationBackgroundColor] = js.undefined,
        BackgroundOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        Font: js.UndefOr[InputLocation] = js.undefined,
        FontColor: js.UndefOr[DvbSubDestinationFontColor] = js.undefined,
        FontOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        FontResolution: js.UndefOr[__integerMin96Max600] = js.undefined,
        FontSize: js.UndefOr[__string] = js.undefined,
        OutlineColor: js.UndefOr[DvbSubDestinationOutlineColor] = js.undefined,
        OutlineSize: js.UndefOr[__integerMin0Max10] = js.undefined,
        ShadowColor: js.UndefOr[DvbSubDestinationShadowColor] = js.undefined,
        ShadowOpacity: js.UndefOr[__integerMin0Max255] = js.undefined,
        ShadowXOffset: js.UndefOr[__integer] = js.undefined,
        ShadowYOffset: js.UndefOr[__integer] = js.undefined,
        TeletextGridControl: js.UndefOr[DvbSubDestinationTeletextGridControl] = js.undefined,
        XPosition: js.UndefOr[__integerMin0] = js.undefined,
        YPosition: js.UndefOr[__integerMin0] = js.undefined
    ): DvbSubDestinationSettings = {
      val __obj = js.Dynamic.literal()
      Alignment.foreach(__v => __obj.updateDynamic("Alignment")(__v.asInstanceOf[js.Any]))
      BackgroundColor.foreach(__v => __obj.updateDynamic("BackgroundColor")(__v.asInstanceOf[js.Any]))
      BackgroundOpacity.foreach(__v => __obj.updateDynamic("BackgroundOpacity")(__v.asInstanceOf[js.Any]))
      Font.foreach(__v => __obj.updateDynamic("Font")(__v.asInstanceOf[js.Any]))
      FontColor.foreach(__v => __obj.updateDynamic("FontColor")(__v.asInstanceOf[js.Any]))
      FontOpacity.foreach(__v => __obj.updateDynamic("FontOpacity")(__v.asInstanceOf[js.Any]))
      FontResolution.foreach(__v => __obj.updateDynamic("FontResolution")(__v.asInstanceOf[js.Any]))
      FontSize.foreach(__v => __obj.updateDynamic("FontSize")(__v.asInstanceOf[js.Any]))
      OutlineColor.foreach(__v => __obj.updateDynamic("OutlineColor")(__v.asInstanceOf[js.Any]))
      OutlineSize.foreach(__v => __obj.updateDynamic("OutlineSize")(__v.asInstanceOf[js.Any]))
      ShadowColor.foreach(__v => __obj.updateDynamic("ShadowColor")(__v.asInstanceOf[js.Any]))
      ShadowOpacity.foreach(__v => __obj.updateDynamic("ShadowOpacity")(__v.asInstanceOf[js.Any]))
      ShadowXOffset.foreach(__v => __obj.updateDynamic("ShadowXOffset")(__v.asInstanceOf[js.Any]))
      ShadowYOffset.foreach(__v => __obj.updateDynamic("ShadowYOffset")(__v.asInstanceOf[js.Any]))
      TeletextGridControl.foreach(__v => __obj.updateDynamic("TeletextGridControl")(__v.asInstanceOf[js.Any]))
      XPosition.foreach(__v => __obj.updateDynamic("XPosition")(__v.asInstanceOf[js.Any]))
      YPosition.foreach(__v => __obj.updateDynamic("YPosition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DvbSubDestinationSettings]
    }
  }

  /**
    * Dvb Sub Destination Shadow Color
    */
  object DvbSubDestinationShadowColorEnum {
    val BLACK = "BLACK"
    val NONE  = "NONE"
    val WHITE = "WHITE"

    val values = js.Object.freeze(js.Array(BLACK, NONE, WHITE))
  }

  /**
    * Dvb Sub Destination Teletext Grid Control
    */
  object DvbSubDestinationTeletextGridControlEnum {
    val FIXED  = "FIXED"
    val SCALED = "SCALED"

    val values = js.Object.freeze(js.Array(FIXED, SCALED))
  }

  /**
    * Dvb Sub Source Settings
    */
  @js.native
  trait DvbSubSourceSettings extends js.Object {
    var Pid: js.UndefOr[__integerMin1]
  }

  object DvbSubSourceSettings {
    @inline
    def apply(
        Pid: js.UndefOr[__integerMin1] = js.undefined
    ): DvbSubSourceSettings = {
      val __obj = js.Dynamic.literal()
      Pid.foreach(__v => __obj.updateDynamic("Pid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DvbSubSourceSettings]
    }
  }

  /**
    * DVB Time and Date Table (SDT)
    */
  @js.native
  trait DvbTdtSettings extends js.Object {
    var RepInterval: js.UndefOr[__integerMin1000Max30000]
  }

  object DvbTdtSettings {
    @inline
    def apply(
        RepInterval: js.UndefOr[__integerMin1000Max30000] = js.undefined
    ): DvbTdtSettings = {
      val __obj = js.Dynamic.literal()
      RepInterval.foreach(__v => __obj.updateDynamic("RepInterval")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DvbTdtSettings]
    }
  }

  /**
    * Eac3 Attenuation Control
    */
  object Eac3AttenuationControlEnum {
    val ATTENUATE_3_DB = "ATTENUATE_3_DB"
    val NONE           = "NONE"

    val values = js.Object.freeze(js.Array(ATTENUATE_3_DB, NONE))
  }

  /**
    * Eac3 Bitstream Mode
    */
  object Eac3BitstreamModeEnum {
    val COMMENTARY        = "COMMENTARY"
    val COMPLETE_MAIN     = "COMPLETE_MAIN"
    val EMERGENCY         = "EMERGENCY"
    val HEARING_IMPAIRED  = "HEARING_IMPAIRED"
    val VISUALLY_IMPAIRED = "VISUALLY_IMPAIRED"

    val values = js.Object.freeze(js.Array(COMMENTARY, COMPLETE_MAIN, EMERGENCY, HEARING_IMPAIRED, VISUALLY_IMPAIRED))
  }

  /**
    * Eac3 Coding Mode
    */
  object Eac3CodingModeEnum {
    val CODING_MODE_1_0 = "CODING_MODE_1_0"
    val CODING_MODE_2_0 = "CODING_MODE_2_0"
    val CODING_MODE_3_2 = "CODING_MODE_3_2"

    val values = js.Object.freeze(js.Array(CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_3_2))
  }

  /**
    * Eac3 Dc Filter
    */
  object Eac3DcFilterEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Eac3 Drc Line
    */
  object Eac3DrcLineEnum {
    val FILM_LIGHT     = "FILM_LIGHT"
    val FILM_STANDARD  = "FILM_STANDARD"
    val MUSIC_LIGHT    = "MUSIC_LIGHT"
    val MUSIC_STANDARD = "MUSIC_STANDARD"
    val NONE           = "NONE"
    val SPEECH         = "SPEECH"

    val values = js.Object.freeze(js.Array(FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT, MUSIC_STANDARD, NONE, SPEECH))
  }

  /**
    * Eac3 Drc Rf
    */
  object Eac3DrcRfEnum {
    val FILM_LIGHT     = "FILM_LIGHT"
    val FILM_STANDARD  = "FILM_STANDARD"
    val MUSIC_LIGHT    = "MUSIC_LIGHT"
    val MUSIC_STANDARD = "MUSIC_STANDARD"
    val NONE           = "NONE"
    val SPEECH         = "SPEECH"

    val values = js.Object.freeze(js.Array(FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT, MUSIC_STANDARD, NONE, SPEECH))
  }

  /**
    * Eac3 Lfe Control
    */
  object Eac3LfeControlEnum {
    val LFE    = "LFE"
    val NO_LFE = "NO_LFE"

    val values = js.Object.freeze(js.Array(LFE, NO_LFE))
  }

  /**
    * Eac3 Lfe Filter
    */
  object Eac3LfeFilterEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Eac3 Metadata Control
    */
  object Eac3MetadataControlEnum {
    val FOLLOW_INPUT   = "FOLLOW_INPUT"
    val USE_CONFIGURED = "USE_CONFIGURED"

    val values = js.Object.freeze(js.Array(FOLLOW_INPUT, USE_CONFIGURED))
  }

  /**
    * Eac3 Passthrough Control
    */
  object Eac3PassthroughControlEnum {
    val NO_PASSTHROUGH = "NO_PASSTHROUGH"
    val WHEN_POSSIBLE  = "WHEN_POSSIBLE"

    val values = js.Object.freeze(js.Array(NO_PASSTHROUGH, WHEN_POSSIBLE))
  }

  /**
    * Eac3 Phase Control
    */
  object Eac3PhaseControlEnum {
    val NO_SHIFT         = "NO_SHIFT"
    val SHIFT_90_DEGREES = "SHIFT_90_DEGREES"

    val values = js.Object.freeze(js.Array(NO_SHIFT, SHIFT_90_DEGREES))
  }

  /**
    * Eac3 Settings
    */
  @js.native
  trait Eac3Settings extends js.Object {
    var AttenuationControl: js.UndefOr[Eac3AttenuationControl]
    var Bitrate: js.UndefOr[__double]
    var BitstreamMode: js.UndefOr[Eac3BitstreamMode]
    var CodingMode: js.UndefOr[Eac3CodingMode]
    var DcFilter: js.UndefOr[Eac3DcFilter]
    var Dialnorm: js.UndefOr[__integerMin1Max31]
    var DrcLine: js.UndefOr[Eac3DrcLine]
    var DrcRf: js.UndefOr[Eac3DrcRf]
    var LfeControl: js.UndefOr[Eac3LfeControl]
    var LfeFilter: js.UndefOr[Eac3LfeFilter]
    var LoRoCenterMixLevel: js.UndefOr[__double]
    var LoRoSurroundMixLevel: js.UndefOr[__double]
    var LtRtCenterMixLevel: js.UndefOr[__double]
    var LtRtSurroundMixLevel: js.UndefOr[__double]
    var MetadataControl: js.UndefOr[Eac3MetadataControl]
    var PassthroughControl: js.UndefOr[Eac3PassthroughControl]
    var PhaseControl: js.UndefOr[Eac3PhaseControl]
    var StereoDownmix: js.UndefOr[Eac3StereoDownmix]
    var SurroundExMode: js.UndefOr[Eac3SurroundExMode]
    var SurroundMode: js.UndefOr[Eac3SurroundMode]
  }

  object Eac3Settings {
    @inline
    def apply(
        AttenuationControl: js.UndefOr[Eac3AttenuationControl] = js.undefined,
        Bitrate: js.UndefOr[__double] = js.undefined,
        BitstreamMode: js.UndefOr[Eac3BitstreamMode] = js.undefined,
        CodingMode: js.UndefOr[Eac3CodingMode] = js.undefined,
        DcFilter: js.UndefOr[Eac3DcFilter] = js.undefined,
        Dialnorm: js.UndefOr[__integerMin1Max31] = js.undefined,
        DrcLine: js.UndefOr[Eac3DrcLine] = js.undefined,
        DrcRf: js.UndefOr[Eac3DrcRf] = js.undefined,
        LfeControl: js.UndefOr[Eac3LfeControl] = js.undefined,
        LfeFilter: js.UndefOr[Eac3LfeFilter] = js.undefined,
        LoRoCenterMixLevel: js.UndefOr[__double] = js.undefined,
        LoRoSurroundMixLevel: js.UndefOr[__double] = js.undefined,
        LtRtCenterMixLevel: js.UndefOr[__double] = js.undefined,
        LtRtSurroundMixLevel: js.UndefOr[__double] = js.undefined,
        MetadataControl: js.UndefOr[Eac3MetadataControl] = js.undefined,
        PassthroughControl: js.UndefOr[Eac3PassthroughControl] = js.undefined,
        PhaseControl: js.UndefOr[Eac3PhaseControl] = js.undefined,
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
      DrcLine.foreach(__v => __obj.updateDynamic("DrcLine")(__v.asInstanceOf[js.Any]))
      DrcRf.foreach(__v => __obj.updateDynamic("DrcRf")(__v.asInstanceOf[js.Any]))
      LfeControl.foreach(__v => __obj.updateDynamic("LfeControl")(__v.asInstanceOf[js.Any]))
      LfeFilter.foreach(__v => __obj.updateDynamic("LfeFilter")(__v.asInstanceOf[js.Any]))
      LoRoCenterMixLevel.foreach(__v => __obj.updateDynamic("LoRoCenterMixLevel")(__v.asInstanceOf[js.Any]))
      LoRoSurroundMixLevel.foreach(__v => __obj.updateDynamic("LoRoSurroundMixLevel")(__v.asInstanceOf[js.Any]))
      LtRtCenterMixLevel.foreach(__v => __obj.updateDynamic("LtRtCenterMixLevel")(__v.asInstanceOf[js.Any]))
      LtRtSurroundMixLevel.foreach(__v => __obj.updateDynamic("LtRtSurroundMixLevel")(__v.asInstanceOf[js.Any]))
      MetadataControl.foreach(__v => __obj.updateDynamic("MetadataControl")(__v.asInstanceOf[js.Any]))
      PassthroughControl.foreach(__v => __obj.updateDynamic("PassthroughControl")(__v.asInstanceOf[js.Any]))
      PhaseControl.foreach(__v => __obj.updateDynamic("PhaseControl")(__v.asInstanceOf[js.Any]))
      StereoDownmix.foreach(__v => __obj.updateDynamic("StereoDownmix")(__v.asInstanceOf[js.Any]))
      SurroundExMode.foreach(__v => __obj.updateDynamic("SurroundExMode")(__v.asInstanceOf[js.Any]))
      SurroundMode.foreach(__v => __obj.updateDynamic("SurroundMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Eac3Settings]
    }
  }

  /**
    * Eac3 Stereo Downmix
    */
  object Eac3StereoDownmixEnum {
    val DPL2          = "DPL2"
    val LO_RO         = "LO_RO"
    val LT_RT         = "LT_RT"
    val NOT_INDICATED = "NOT_INDICATED"

    val values = js.Object.freeze(js.Array(DPL2, LO_RO, LT_RT, NOT_INDICATED))
  }

  /**
    * Eac3 Surround Ex Mode
    */
  object Eac3SurroundExModeEnum {
    val DISABLED      = "DISABLED"
    val ENABLED       = "ENABLED"
    val NOT_INDICATED = "NOT_INDICATED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED, NOT_INDICATED))
  }

  /**
    * Eac3 Surround Mode
    */
  object Eac3SurroundModeEnum {
    val DISABLED      = "DISABLED"
    val ENABLED       = "ENABLED"
    val NOT_INDICATED = "NOT_INDICATED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED, NOT_INDICATED))
  }

  /**
    * Embedded Convert608 To708
    */
  object EmbeddedConvert608To708Enum {
    val DISABLED  = "DISABLED"
    val UPCONVERT = "UPCONVERT"

    val values = js.Object.freeze(js.Array(DISABLED, UPCONVERT))
  }

  /**
    * Embedded Destination Settings
    */
  @js.native
  trait EmbeddedDestinationSettings extends js.Object {}

  object EmbeddedDestinationSettings {
    @inline
    def apply(
        ): EmbeddedDestinationSettings = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[EmbeddedDestinationSettings]
    }
  }

  /**
    * Embedded Plus Scte20 Destination Settings
    */
  @js.native
  trait EmbeddedPlusScte20DestinationSettings extends js.Object {}

  object EmbeddedPlusScte20DestinationSettings {
    @inline
    def apply(
        ): EmbeddedPlusScte20DestinationSettings = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[EmbeddedPlusScte20DestinationSettings]
    }
  }

  /**
    * Embedded Scte20 Detection
    */
  object EmbeddedScte20DetectionEnum {
    val AUTO = "AUTO"
    val OFF  = "OFF"

    val values = js.Object.freeze(js.Array(AUTO, OFF))
  }

  /**
    * Embedded Source Settings
    */
  @js.native
  trait EmbeddedSourceSettings extends js.Object {
    var Convert608To708: js.UndefOr[EmbeddedConvert608To708]
    var Scte20Detection: js.UndefOr[EmbeddedScte20Detection]
    var Source608ChannelNumber: js.UndefOr[__integerMin1Max4]
    var Source608TrackNumber: js.UndefOr[__integerMin1Max5]
  }

  object EmbeddedSourceSettings {
    @inline
    def apply(
        Convert608To708: js.UndefOr[EmbeddedConvert608To708] = js.undefined,
        Scte20Detection: js.UndefOr[EmbeddedScte20Detection] = js.undefined,
        Source608ChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined,
        Source608TrackNumber: js.UndefOr[__integerMin1Max5] = js.undefined
    ): EmbeddedSourceSettings = {
      val __obj = js.Dynamic.literal()
      Convert608To708.foreach(__v => __obj.updateDynamic("Convert608To708")(__v.asInstanceOf[js.Any]))
      Scte20Detection.foreach(__v => __obj.updateDynamic("Scte20Detection")(__v.asInstanceOf[js.Any]))
      Source608ChannelNumber.foreach(__v => __obj.updateDynamic("Source608ChannelNumber")(__v.asInstanceOf[js.Any]))
      Source608TrackNumber.foreach(__v => __obj.updateDynamic("Source608TrackNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmbeddedSourceSettings]
    }
  }

  /**
    * Encoder Settings
    */
  @js.native
  trait EncoderSettings extends js.Object {
    var AudioDescriptions: __listOfAudioDescription
    var OutputGroups: __listOfOutputGroup
    var TimecodeConfig: TimecodeConfig
    var VideoDescriptions: __listOfVideoDescription
    var AvailBlanking: js.UndefOr[AvailBlanking]
    var AvailConfiguration: js.UndefOr[AvailConfiguration]
    var BlackoutSlate: js.UndefOr[BlackoutSlate]
    var CaptionDescriptions: js.UndefOr[__listOfCaptionDescription]
    var GlobalConfiguration: js.UndefOr[GlobalConfiguration]
  }

  object EncoderSettings {
    @inline
    def apply(
        AudioDescriptions: __listOfAudioDescription,
        OutputGroups: __listOfOutputGroup,
        TimecodeConfig: TimecodeConfig,
        VideoDescriptions: __listOfVideoDescription,
        AvailBlanking: js.UndefOr[AvailBlanking] = js.undefined,
        AvailConfiguration: js.UndefOr[AvailConfiguration] = js.undefined,
        BlackoutSlate: js.UndefOr[BlackoutSlate] = js.undefined,
        CaptionDescriptions: js.UndefOr[__listOfCaptionDescription] = js.undefined,
        GlobalConfiguration: js.UndefOr[GlobalConfiguration] = js.undefined
    ): EncoderSettings = {
      val __obj = js.Dynamic.literal(
        "AudioDescriptions" -> AudioDescriptions.asInstanceOf[js.Any],
        "OutputGroups"      -> OutputGroups.asInstanceOf[js.Any],
        "TimecodeConfig"    -> TimecodeConfig.asInstanceOf[js.Any],
        "VideoDescriptions" -> VideoDescriptions.asInstanceOf[js.Any]
      )

      AvailBlanking.foreach(__v => __obj.updateDynamic("AvailBlanking")(__v.asInstanceOf[js.Any]))
      AvailConfiguration.foreach(__v => __obj.updateDynamic("AvailConfiguration")(__v.asInstanceOf[js.Any]))
      BlackoutSlate.foreach(__v => __obj.updateDynamic("BlackoutSlate")(__v.asInstanceOf[js.Any]))
      CaptionDescriptions.foreach(__v => __obj.updateDynamic("CaptionDescriptions")(__v.asInstanceOf[js.Any]))
      GlobalConfiguration.foreach(__v => __obj.updateDynamic("GlobalConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncoderSettings]
    }
  }

  /**
    * Fec Output Include Fec
    */
  object FecOutputIncludeFecEnum {
    val COLUMN         = "COLUMN"
    val COLUMN_AND_ROW = "COLUMN_AND_ROW"

    val values = js.Object.freeze(js.Array(COLUMN, COLUMN_AND_ROW))
  }

  /**
    * Fec Output Settings
    */
  @js.native
  trait FecOutputSettings extends js.Object {
    var ColumnDepth: js.UndefOr[__integerMin4Max20]
    var IncludeFec: js.UndefOr[FecOutputIncludeFec]
    var RowLength: js.UndefOr[__integerMin1Max20]
  }

  object FecOutputSettings {
    @inline
    def apply(
        ColumnDepth: js.UndefOr[__integerMin4Max20] = js.undefined,
        IncludeFec: js.UndefOr[FecOutputIncludeFec] = js.undefined,
        RowLength: js.UndefOr[__integerMin1Max20] = js.undefined
    ): FecOutputSettings = {
      val __obj = js.Dynamic.literal()
      ColumnDepth.foreach(__v => __obj.updateDynamic("ColumnDepth")(__v.asInstanceOf[js.Any]))
      IncludeFec.foreach(__v => __obj.updateDynamic("IncludeFec")(__v.asInstanceOf[js.Any]))
      RowLength.foreach(__v => __obj.updateDynamic("RowLength")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FecOutputSettings]
    }
  }

  /**
    * Fixed Afd
    */
  object FixedAfdEnum {
    val AFD_0000 = "AFD_0000"
    val AFD_0010 = "AFD_0010"
    val AFD_0011 = "AFD_0011"
    val AFD_0100 = "AFD_0100"
    val AFD_1000 = "AFD_1000"
    val AFD_1001 = "AFD_1001"
    val AFD_1010 = "AFD_1010"
    val AFD_1011 = "AFD_1011"
    val AFD_1101 = "AFD_1101"
    val AFD_1110 = "AFD_1110"
    val AFD_1111 = "AFD_1111"

    val values = js.Object.freeze(
      js.Array(
        AFD_0000,
        AFD_0010,
        AFD_0011,
        AFD_0100,
        AFD_1000,
        AFD_1001,
        AFD_1010,
        AFD_1011,
        AFD_1101,
        AFD_1110,
        AFD_1111
      )
    )
  }

  /**
    * Start time for the action.
    */
  @js.native
  trait FixedModeScheduleActionStartSettings extends js.Object {
    var Time: __string
  }

  object FixedModeScheduleActionStartSettings {
    @inline
    def apply(
        Time: __string
    ): FixedModeScheduleActionStartSettings = {
      val __obj = js.Dynamic.literal(
        "Time" -> Time.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FixedModeScheduleActionStartSettings]
    }
  }

  /**
    * Settings to specify if an action follows another.
    */
  @js.native
  trait FollowModeScheduleActionStartSettings extends js.Object {
    var FollowPoint: FollowPoint
    var ReferenceActionName: __string
  }

  object FollowModeScheduleActionStartSettings {
    @inline
    def apply(
        FollowPoint: FollowPoint,
        ReferenceActionName: __string
    ): FollowModeScheduleActionStartSettings = {
      val __obj = js.Dynamic.literal(
        "FollowPoint"         -> FollowPoint.asInstanceOf[js.Any],
        "ReferenceActionName" -> ReferenceActionName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FollowModeScheduleActionStartSettings]
    }
  }

  /**
    * Follow reference point.
    */
  object FollowPointEnum {
    val END   = "END"
    val START = "START"

    val values = js.Object.freeze(js.Array(END, START))
  }

  /**
    * Frame Capture Group Settings
    */
  @js.native
  trait FrameCaptureGroupSettings extends js.Object {
    var Destination: OutputLocationRef
  }

  object FrameCaptureGroupSettings {
    @inline
    def apply(
        Destination: OutputLocationRef
    ): FrameCaptureGroupSettings = {
      val __obj = js.Dynamic.literal(
        "Destination" -> Destination.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FrameCaptureGroupSettings]
    }
  }

  /**
    * Frame Capture Output Settings
    */
  @js.native
  trait FrameCaptureOutputSettings extends js.Object {
    var NameModifier: js.UndefOr[__string]
  }

  object FrameCaptureOutputSettings {
    @inline
    def apply(
        NameModifier: js.UndefOr[__string] = js.undefined
    ): FrameCaptureOutputSettings = {
      val __obj = js.Dynamic.literal()
      NameModifier.foreach(__v => __obj.updateDynamic("NameModifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FrameCaptureOutputSettings]
    }
  }

  /**
    * Frame Capture Settings
    */
  @js.native
  trait FrameCaptureSettings extends js.Object {
    var CaptureInterval: __integerMin1Max3600
  }

  object FrameCaptureSettings {
    @inline
    def apply(
        CaptureInterval: __integerMin1Max3600
    ): FrameCaptureSettings = {
      val __obj = js.Dynamic.literal(
        "CaptureInterval" -> CaptureInterval.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FrameCaptureSettings]
    }
  }

  /**
    * Global Configuration
    */
  @js.native
  trait GlobalConfiguration extends js.Object {
    var InitialAudioGain: js.UndefOr[__integerMinNegative60Max60]
    var InputEndAction: js.UndefOr[GlobalConfigurationInputEndAction]
    var InputLossBehavior: js.UndefOr[InputLossBehavior]
    var OutputLockingMode: js.UndefOr[GlobalConfigurationOutputLockingMode]
    var OutputTimingSource: js.UndefOr[GlobalConfigurationOutputTimingSource]
    var SupportLowFramerateInputs: js.UndefOr[GlobalConfigurationLowFramerateInputs]
  }

  object GlobalConfiguration {
    @inline
    def apply(
        InitialAudioGain: js.UndefOr[__integerMinNegative60Max60] = js.undefined,
        InputEndAction: js.UndefOr[GlobalConfigurationInputEndAction] = js.undefined,
        InputLossBehavior: js.UndefOr[InputLossBehavior] = js.undefined,
        OutputLockingMode: js.UndefOr[GlobalConfigurationOutputLockingMode] = js.undefined,
        OutputTimingSource: js.UndefOr[GlobalConfigurationOutputTimingSource] = js.undefined,
        SupportLowFramerateInputs: js.UndefOr[GlobalConfigurationLowFramerateInputs] = js.undefined
    ): GlobalConfiguration = {
      val __obj = js.Dynamic.literal()
      InitialAudioGain.foreach(__v => __obj.updateDynamic("InitialAudioGain")(__v.asInstanceOf[js.Any]))
      InputEndAction.foreach(__v => __obj.updateDynamic("InputEndAction")(__v.asInstanceOf[js.Any]))
      InputLossBehavior.foreach(__v => __obj.updateDynamic("InputLossBehavior")(__v.asInstanceOf[js.Any]))
      OutputLockingMode.foreach(__v => __obj.updateDynamic("OutputLockingMode")(__v.asInstanceOf[js.Any]))
      OutputTimingSource.foreach(__v => __obj.updateDynamic("OutputTimingSource")(__v.asInstanceOf[js.Any]))
      SupportLowFramerateInputs.foreach(
        __v => __obj.updateDynamic("SupportLowFramerateInputs")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GlobalConfiguration]
    }
  }

  /**
    * Global Configuration Input End Action
    */
  object GlobalConfigurationInputEndActionEnum {
    val NONE                   = "NONE"
    val SWITCH_AND_LOOP_INPUTS = "SWITCH_AND_LOOP_INPUTS"

    val values = js.Object.freeze(js.Array(NONE, SWITCH_AND_LOOP_INPUTS))
  }

  /**
    * Global Configuration Low Framerate Inputs
    */
  object GlobalConfigurationLowFramerateInputsEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Global Configuration Output Locking Mode
    */
  object GlobalConfigurationOutputLockingModeEnum {
    val EPOCH_LOCKING    = "EPOCH_LOCKING"
    val PIPELINE_LOCKING = "PIPELINE_LOCKING"

    val values = js.Object.freeze(js.Array(EPOCH_LOCKING, PIPELINE_LOCKING))
  }

  /**
    * Global Configuration Output Timing Source
    */
  object GlobalConfigurationOutputTimingSourceEnum {
    val INPUT_CLOCK  = "INPUT_CLOCK"
    val SYSTEM_CLOCK = "SYSTEM_CLOCK"

    val values = js.Object.freeze(js.Array(INPUT_CLOCK, SYSTEM_CLOCK))
  }

  /**
    * H264 Adaptive Quantization
    */
  object H264AdaptiveQuantizationEnum {
    val HIGH   = "HIGH"
    val HIGHER = "HIGHER"
    val LOW    = "LOW"
    val MAX    = "MAX"
    val MEDIUM = "MEDIUM"
    val OFF    = "OFF"

    val values = js.Object.freeze(js.Array(HIGH, HIGHER, LOW, MAX, MEDIUM, OFF))
  }

  /**
    * H264 Color Metadata
    */
  object H264ColorMetadataEnum {
    val IGNORE = "IGNORE"
    val INSERT = "INSERT"

    val values = js.Object.freeze(js.Array(IGNORE, INSERT))
  }

  /**
    * H264 Entropy Encoding
    */
  object H264EntropyEncodingEnum {
    val CABAC = "CABAC"
    val CAVLC = "CAVLC"

    val values = js.Object.freeze(js.Array(CABAC, CAVLC))
  }

  /**
    * H264 Flicker Aq
    */
  object H264FlickerAqEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * H264 Framerate Control
    */
  object H264FramerateControlEnum {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE"
    val SPECIFIED              = "SPECIFIED"

    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * H264 Gop BReference
    */
  object H264GopBReferenceEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * H264 Gop Size Units
    */
  object H264GopSizeUnitsEnum {
    val FRAMES  = "FRAMES"
    val SECONDS = "SECONDS"

    val values = js.Object.freeze(js.Array(FRAMES, SECONDS))
  }

  /**
    * H264 Level
    */
  object H264LevelEnum {
    val H264_LEVEL_1    = "H264_LEVEL_1"
    val H264_LEVEL_1_1  = "H264_LEVEL_1_1"
    val H264_LEVEL_1_2  = "H264_LEVEL_1_2"
    val H264_LEVEL_1_3  = "H264_LEVEL_1_3"
    val H264_LEVEL_2    = "H264_LEVEL_2"
    val H264_LEVEL_2_1  = "H264_LEVEL_2_1"
    val H264_LEVEL_2_2  = "H264_LEVEL_2_2"
    val H264_LEVEL_3    = "H264_LEVEL_3"
    val H264_LEVEL_3_1  = "H264_LEVEL_3_1"
    val H264_LEVEL_3_2  = "H264_LEVEL_3_2"
    val H264_LEVEL_4    = "H264_LEVEL_4"
    val H264_LEVEL_4_1  = "H264_LEVEL_4_1"
    val H264_LEVEL_4_2  = "H264_LEVEL_4_2"
    val H264_LEVEL_5    = "H264_LEVEL_5"
    val H264_LEVEL_5_1  = "H264_LEVEL_5_1"
    val H264_LEVEL_5_2  = "H264_LEVEL_5_2"
    val H264_LEVEL_AUTO = "H264_LEVEL_AUTO"

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  /**
    * H264 Look Ahead Rate Control
    */
  object H264LookAheadRateControlEnum {
    val HIGH   = "HIGH"
    val LOW    = "LOW"
    val MEDIUM = "MEDIUM"

    val values = js.Object.freeze(js.Array(HIGH, LOW, MEDIUM))
  }

  /**
    * H264 Par Control
    */
  object H264ParControlEnum {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE"
    val SPECIFIED              = "SPECIFIED"

    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * H264 Profile
    */
  object H264ProfileEnum {
    val BASELINE       = "BASELINE"
    val HIGH           = "HIGH"
    val HIGH_10BIT     = "HIGH_10BIT"
    val HIGH_422       = "HIGH_422"
    val HIGH_422_10BIT = "HIGH_422_10BIT"
    val MAIN           = "MAIN"

    val values = js.Object.freeze(js.Array(BASELINE, HIGH, HIGH_10BIT, HIGH_422, HIGH_422_10BIT, MAIN))
  }

  /**
    * H264 Rate Control Mode
    */
  object H264RateControlModeEnum {
    val CBR  = "CBR"
    val QVBR = "QVBR"
    val VBR  = "VBR"

    val values = js.Object.freeze(js.Array(CBR, QVBR, VBR))
  }

  /**
    * H264 Scan Type
    */
  object H264ScanTypeEnum {
    val INTERLACED  = "INTERLACED"
    val PROGRESSIVE = "PROGRESSIVE"

    val values = js.Object.freeze(js.Array(INTERLACED, PROGRESSIVE))
  }

  /**
    * H264 Scene Change Detect
    */
  object H264SceneChangeDetectEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * H264 Settings
    */
  @js.native
  trait H264Settings extends js.Object {
    var AdaptiveQuantization: js.UndefOr[H264AdaptiveQuantization]
    var AfdSignaling: js.UndefOr[AfdSignaling]
    var Bitrate: js.UndefOr[__integerMin1000]
    var BufFillPct: js.UndefOr[__integerMin0Max100]
    var BufSize: js.UndefOr[__integerMin0]
    var ColorMetadata: js.UndefOr[H264ColorMetadata]
    var EntropyEncoding: js.UndefOr[H264EntropyEncoding]
    var FixedAfd: js.UndefOr[FixedAfd]
    var FlickerAq: js.UndefOr[H264FlickerAq]
    var FramerateControl: js.UndefOr[H264FramerateControl]
    var FramerateDenominator: js.UndefOr[__integerMin1]
    var FramerateNumerator: js.UndefOr[__integerMin1]
    var GopBReference: js.UndefOr[H264GopBReference]
    var GopClosedCadence: js.UndefOr[__integerMin0]
    var GopNumBFrames: js.UndefOr[__integerMin0Max7]
    var GopSize: js.UndefOr[__doubleMin1]
    var GopSizeUnits: js.UndefOr[H264GopSizeUnits]
    var Level: js.UndefOr[H264Level]
    var LookAheadRateControl: js.UndefOr[H264LookAheadRateControl]
    var MaxBitrate: js.UndefOr[__integerMin1000]
    var MinIInterval: js.UndefOr[__integerMin0Max30]
    var NumRefFrames: js.UndefOr[__integerMin1Max6]
    var ParControl: js.UndefOr[H264ParControl]
    var ParDenominator: js.UndefOr[__integerMin1]
    var ParNumerator: js.UndefOr[__integer]
    var Profile: js.UndefOr[H264Profile]
    var QvbrQualityLevel: js.UndefOr[__integerMin1Max10]
    var RateControlMode: js.UndefOr[H264RateControlMode]
    var ScanType: js.UndefOr[H264ScanType]
    var SceneChangeDetect: js.UndefOr[H264SceneChangeDetect]
    var Slices: js.UndefOr[__integerMin1Max32]
    var Softness: js.UndefOr[__integerMin0Max128]
    var SpatialAq: js.UndefOr[H264SpatialAq]
    var SubgopLength: js.UndefOr[H264SubGopLength]
    var Syntax: js.UndefOr[H264Syntax]
    var TemporalAq: js.UndefOr[H264TemporalAq]
    var TimecodeInsertion: js.UndefOr[H264TimecodeInsertionBehavior]
  }

  object H264Settings {
    @inline
    def apply(
        AdaptiveQuantization: js.UndefOr[H264AdaptiveQuantization] = js.undefined,
        AfdSignaling: js.UndefOr[AfdSignaling] = js.undefined,
        Bitrate: js.UndefOr[__integerMin1000] = js.undefined,
        BufFillPct: js.UndefOr[__integerMin0Max100] = js.undefined,
        BufSize: js.UndefOr[__integerMin0] = js.undefined,
        ColorMetadata: js.UndefOr[H264ColorMetadata] = js.undefined,
        EntropyEncoding: js.UndefOr[H264EntropyEncoding] = js.undefined,
        FixedAfd: js.UndefOr[FixedAfd] = js.undefined,
        FlickerAq: js.UndefOr[H264FlickerAq] = js.undefined,
        FramerateControl: js.UndefOr[H264FramerateControl] = js.undefined,
        FramerateDenominator: js.UndefOr[__integerMin1] = js.undefined,
        FramerateNumerator: js.UndefOr[__integerMin1] = js.undefined,
        GopBReference: js.UndefOr[H264GopBReference] = js.undefined,
        GopClosedCadence: js.UndefOr[__integerMin0] = js.undefined,
        GopNumBFrames: js.UndefOr[__integerMin0Max7] = js.undefined,
        GopSize: js.UndefOr[__doubleMin1] = js.undefined,
        GopSizeUnits: js.UndefOr[H264GopSizeUnits] = js.undefined,
        Level: js.UndefOr[H264Level] = js.undefined,
        LookAheadRateControl: js.UndefOr[H264LookAheadRateControl] = js.undefined,
        MaxBitrate: js.UndefOr[__integerMin1000] = js.undefined,
        MinIInterval: js.UndefOr[__integerMin0Max30] = js.undefined,
        NumRefFrames: js.UndefOr[__integerMin1Max6] = js.undefined,
        ParControl: js.UndefOr[H264ParControl] = js.undefined,
        ParDenominator: js.UndefOr[__integerMin1] = js.undefined,
        ParNumerator: js.UndefOr[__integer] = js.undefined,
        Profile: js.UndefOr[H264Profile] = js.undefined,
        QvbrQualityLevel: js.UndefOr[__integerMin1Max10] = js.undefined,
        RateControlMode: js.UndefOr[H264RateControlMode] = js.undefined,
        ScanType: js.UndefOr[H264ScanType] = js.undefined,
        SceneChangeDetect: js.UndefOr[H264SceneChangeDetect] = js.undefined,
        Slices: js.UndefOr[__integerMin1Max32] = js.undefined,
        Softness: js.UndefOr[__integerMin0Max128] = js.undefined,
        SpatialAq: js.UndefOr[H264SpatialAq] = js.undefined,
        SubgopLength: js.UndefOr[H264SubGopLength] = js.undefined,
        Syntax: js.UndefOr[H264Syntax] = js.undefined,
        TemporalAq: js.UndefOr[H264TemporalAq] = js.undefined,
        TimecodeInsertion: js.UndefOr[H264TimecodeInsertionBehavior] = js.undefined
    ): H264Settings = {
      val __obj = js.Dynamic.literal()
      AdaptiveQuantization.foreach(__v => __obj.updateDynamic("AdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      AfdSignaling.foreach(__v => __obj.updateDynamic("AfdSignaling")(__v.asInstanceOf[js.Any]))
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      BufFillPct.foreach(__v => __obj.updateDynamic("BufFillPct")(__v.asInstanceOf[js.Any]))
      BufSize.foreach(__v => __obj.updateDynamic("BufSize")(__v.asInstanceOf[js.Any]))
      ColorMetadata.foreach(__v => __obj.updateDynamic("ColorMetadata")(__v.asInstanceOf[js.Any]))
      EntropyEncoding.foreach(__v => __obj.updateDynamic("EntropyEncoding")(__v.asInstanceOf[js.Any]))
      FixedAfd.foreach(__v => __obj.updateDynamic("FixedAfd")(__v.asInstanceOf[js.Any]))
      FlickerAq.foreach(__v => __obj.updateDynamic("FlickerAq")(__v.asInstanceOf[js.Any]))
      FramerateControl.foreach(__v => __obj.updateDynamic("FramerateControl")(__v.asInstanceOf[js.Any]))
      FramerateDenominator.foreach(__v => __obj.updateDynamic("FramerateDenominator")(__v.asInstanceOf[js.Any]))
      FramerateNumerator.foreach(__v => __obj.updateDynamic("FramerateNumerator")(__v.asInstanceOf[js.Any]))
      GopBReference.foreach(__v => __obj.updateDynamic("GopBReference")(__v.asInstanceOf[js.Any]))
      GopClosedCadence.foreach(__v => __obj.updateDynamic("GopClosedCadence")(__v.asInstanceOf[js.Any]))
      GopNumBFrames.foreach(__v => __obj.updateDynamic("GopNumBFrames")(__v.asInstanceOf[js.Any]))
      GopSize.foreach(__v => __obj.updateDynamic("GopSize")(__v.asInstanceOf[js.Any]))
      GopSizeUnits.foreach(__v => __obj.updateDynamic("GopSizeUnits")(__v.asInstanceOf[js.Any]))
      Level.foreach(__v => __obj.updateDynamic("Level")(__v.asInstanceOf[js.Any]))
      LookAheadRateControl.foreach(__v => __obj.updateDynamic("LookAheadRateControl")(__v.asInstanceOf[js.Any]))
      MaxBitrate.foreach(__v => __obj.updateDynamic("MaxBitrate")(__v.asInstanceOf[js.Any]))
      MinIInterval.foreach(__v => __obj.updateDynamic("MinIInterval")(__v.asInstanceOf[js.Any]))
      NumRefFrames.foreach(__v => __obj.updateDynamic("NumRefFrames")(__v.asInstanceOf[js.Any]))
      ParControl.foreach(__v => __obj.updateDynamic("ParControl")(__v.asInstanceOf[js.Any]))
      ParDenominator.foreach(__v => __obj.updateDynamic("ParDenominator")(__v.asInstanceOf[js.Any]))
      ParNumerator.foreach(__v => __obj.updateDynamic("ParNumerator")(__v.asInstanceOf[js.Any]))
      Profile.foreach(__v => __obj.updateDynamic("Profile")(__v.asInstanceOf[js.Any]))
      QvbrQualityLevel.foreach(__v => __obj.updateDynamic("QvbrQualityLevel")(__v.asInstanceOf[js.Any]))
      RateControlMode.foreach(__v => __obj.updateDynamic("RateControlMode")(__v.asInstanceOf[js.Any]))
      ScanType.foreach(__v => __obj.updateDynamic("ScanType")(__v.asInstanceOf[js.Any]))
      SceneChangeDetect.foreach(__v => __obj.updateDynamic("SceneChangeDetect")(__v.asInstanceOf[js.Any]))
      Slices.foreach(__v => __obj.updateDynamic("Slices")(__v.asInstanceOf[js.Any]))
      Softness.foreach(__v => __obj.updateDynamic("Softness")(__v.asInstanceOf[js.Any]))
      SpatialAq.foreach(__v => __obj.updateDynamic("SpatialAq")(__v.asInstanceOf[js.Any]))
      SubgopLength.foreach(__v => __obj.updateDynamic("SubgopLength")(__v.asInstanceOf[js.Any]))
      Syntax.foreach(__v => __obj.updateDynamic("Syntax")(__v.asInstanceOf[js.Any]))
      TemporalAq.foreach(__v => __obj.updateDynamic("TemporalAq")(__v.asInstanceOf[js.Any]))
      TimecodeInsertion.foreach(__v => __obj.updateDynamic("TimecodeInsertion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[H264Settings]
    }
  }

  /**
    * H264 Spatial Aq
    */
  object H264SpatialAqEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * H264 Sub Gop Length
    */
  object H264SubGopLengthEnum {
    val DYNAMIC = "DYNAMIC"
    val FIXED   = "FIXED"

    val values = js.Object.freeze(js.Array(DYNAMIC, FIXED))
  }

  /**
    * H264 Syntax
    */
  object H264SyntaxEnum {
    val DEFAULT = "DEFAULT"
    val RP2027  = "RP2027"

    val values = js.Object.freeze(js.Array(DEFAULT, RP2027))
  }

  /**
    * H264 Temporal Aq
    */
  object H264TemporalAqEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * H264 Timecode Insertion Behavior
    */
  object H264TimecodeInsertionBehaviorEnum {
    val DISABLED       = "DISABLED"
    val PIC_TIMING_SEI = "PIC_TIMING_SEI"

    val values = js.Object.freeze(js.Array(DISABLED, PIC_TIMING_SEI))
  }

  /**
    * Hls Ad Markers
    */
  object HlsAdMarkersEnum {
    val ADOBE            = "ADOBE"
    val ELEMENTAL        = "ELEMENTAL"
    val ELEMENTAL_SCTE35 = "ELEMENTAL_SCTE35"

    val values = js.Object.freeze(js.Array(ADOBE, ELEMENTAL, ELEMENTAL_SCTE35))
  }

  /**
    * Hls Akamai Http Transfer Mode
    */
  object HlsAkamaiHttpTransferModeEnum {
    val CHUNKED     = "CHUNKED"
    val NON_CHUNKED = "NON_CHUNKED"

    val values = js.Object.freeze(js.Array(CHUNKED, NON_CHUNKED))
  }

  /**
    * Hls Akamai Settings
    */
  @js.native
  trait HlsAkamaiSettings extends js.Object {
    var ConnectionRetryInterval: js.UndefOr[__integerMin0]
    var FilecacheDuration: js.UndefOr[__integerMin0Max600]
    var HttpTransferMode: js.UndefOr[HlsAkamaiHttpTransferMode]
    var NumRetries: js.UndefOr[__integerMin0]
    var RestartDelay: js.UndefOr[__integerMin0Max15]
    var Salt: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  object HlsAkamaiSettings {
    @inline
    def apply(
        ConnectionRetryInterval: js.UndefOr[__integerMin0] = js.undefined,
        FilecacheDuration: js.UndefOr[__integerMin0Max600] = js.undefined,
        HttpTransferMode: js.UndefOr[HlsAkamaiHttpTransferMode] = js.undefined,
        NumRetries: js.UndefOr[__integerMin0] = js.undefined,
        RestartDelay: js.UndefOr[__integerMin0Max15] = js.undefined,
        Salt: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): HlsAkamaiSettings = {
      val __obj = js.Dynamic.literal()
      ConnectionRetryInterval.foreach(__v => __obj.updateDynamic("ConnectionRetryInterval")(__v.asInstanceOf[js.Any]))
      FilecacheDuration.foreach(__v => __obj.updateDynamic("FilecacheDuration")(__v.asInstanceOf[js.Any]))
      HttpTransferMode.foreach(__v => __obj.updateDynamic("HttpTransferMode")(__v.asInstanceOf[js.Any]))
      NumRetries.foreach(__v => __obj.updateDynamic("NumRetries")(__v.asInstanceOf[js.Any]))
      RestartDelay.foreach(__v => __obj.updateDynamic("RestartDelay")(__v.asInstanceOf[js.Any]))
      Salt.foreach(__v => __obj.updateDynamic("Salt")(__v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.updateDynamic("Token")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsAkamaiSettings]
    }
  }

  /**
    * Hls Basic Put Settings
    */
  @js.native
  trait HlsBasicPutSettings extends js.Object {
    var ConnectionRetryInterval: js.UndefOr[__integerMin0]
    var FilecacheDuration: js.UndefOr[__integerMin0Max600]
    var NumRetries: js.UndefOr[__integerMin0]
    var RestartDelay: js.UndefOr[__integerMin0Max15]
  }

  object HlsBasicPutSettings {
    @inline
    def apply(
        ConnectionRetryInterval: js.UndefOr[__integerMin0] = js.undefined,
        FilecacheDuration: js.UndefOr[__integerMin0Max600] = js.undefined,
        NumRetries: js.UndefOr[__integerMin0] = js.undefined,
        RestartDelay: js.UndefOr[__integerMin0Max15] = js.undefined
    ): HlsBasicPutSettings = {
      val __obj = js.Dynamic.literal()
      ConnectionRetryInterval.foreach(__v => __obj.updateDynamic("ConnectionRetryInterval")(__v.asInstanceOf[js.Any]))
      FilecacheDuration.foreach(__v => __obj.updateDynamic("FilecacheDuration")(__v.asInstanceOf[js.Any]))
      NumRetries.foreach(__v => __obj.updateDynamic("NumRetries")(__v.asInstanceOf[js.Any]))
      RestartDelay.foreach(__v => __obj.updateDynamic("RestartDelay")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsBasicPutSettings]
    }
  }

  /**
    * Hls Caption Language Setting
    */
  object HlsCaptionLanguageSettingEnum {
    val INSERT = "INSERT"
    val NONE   = "NONE"
    val OMIT   = "OMIT"

    val values = js.Object.freeze(js.Array(INSERT, NONE, OMIT))
  }

  /**
    * Hls Cdn Settings
    */
  @js.native
  trait HlsCdnSettings extends js.Object {
    var HlsAkamaiSettings: js.UndefOr[HlsAkamaiSettings]
    var HlsBasicPutSettings: js.UndefOr[HlsBasicPutSettings]
    var HlsMediaStoreSettings: js.UndefOr[HlsMediaStoreSettings]
    var HlsWebdavSettings: js.UndefOr[HlsWebdavSettings]
  }

  object HlsCdnSettings {
    @inline
    def apply(
        HlsAkamaiSettings: js.UndefOr[HlsAkamaiSettings] = js.undefined,
        HlsBasicPutSettings: js.UndefOr[HlsBasicPutSettings] = js.undefined,
        HlsMediaStoreSettings: js.UndefOr[HlsMediaStoreSettings] = js.undefined,
        HlsWebdavSettings: js.UndefOr[HlsWebdavSettings] = js.undefined
    ): HlsCdnSettings = {
      val __obj = js.Dynamic.literal()
      HlsAkamaiSettings.foreach(__v => __obj.updateDynamic("HlsAkamaiSettings")(__v.asInstanceOf[js.Any]))
      HlsBasicPutSettings.foreach(__v => __obj.updateDynamic("HlsBasicPutSettings")(__v.asInstanceOf[js.Any]))
      HlsMediaStoreSettings.foreach(__v => __obj.updateDynamic("HlsMediaStoreSettings")(__v.asInstanceOf[js.Any]))
      HlsWebdavSettings.foreach(__v => __obj.updateDynamic("HlsWebdavSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsCdnSettings]
    }
  }

  /**
    * Hls Client Cache
    */
  object HlsClientCacheEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Hls Codec Specification
    */
  object HlsCodecSpecificationEnum {
    val RFC_4281 = "RFC_4281"
    val RFC_6381 = "RFC_6381"

    val values = js.Object.freeze(js.Array(RFC_4281, RFC_6381))
  }

  /**
    * Hls Directory Structure
    */
  object HlsDirectoryStructureEnum {
    val SINGLE_DIRECTORY        = "SINGLE_DIRECTORY"
    val SUBDIRECTORY_PER_STREAM = "SUBDIRECTORY_PER_STREAM"

    val values = js.Object.freeze(js.Array(SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM))
  }

  /**
    * Hls Encryption Type
    */
  object HlsEncryptionTypeEnum {
    val AES128     = "AES128"
    val SAMPLE_AES = "SAMPLE_AES"

    val values = js.Object.freeze(js.Array(AES128, SAMPLE_AES))
  }

  /**
    * Hls Group Settings
    */
  @js.native
  trait HlsGroupSettings extends js.Object {
    var Destination: OutputLocationRef
    var AdMarkers: js.UndefOr[__listOfHlsAdMarkers]
    var BaseUrlContent: js.UndefOr[__string]
    var BaseUrlManifest: js.UndefOr[__string]
    var CaptionLanguageMappings: js.UndefOr[__listOfCaptionLanguageMapping]
    var CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting]
    var ClientCache: js.UndefOr[HlsClientCache]
    var CodecSpecification: js.UndefOr[HlsCodecSpecification]
    var ConstantIv: js.UndefOr[__stringMin32Max32]
    var DirectoryStructure: js.UndefOr[HlsDirectoryStructure]
    var EncryptionType: js.UndefOr[HlsEncryptionType]
    var HlsCdnSettings: js.UndefOr[HlsCdnSettings]
    var IFrameOnlyPlaylists: js.UndefOr[IFrameOnlyPlaylistType]
    var IndexNSegments: js.UndefOr[__integerMin3]
    var InputLossAction: js.UndefOr[InputLossActionForHlsOut]
    var IvInManifest: js.UndefOr[HlsIvInManifest]
    var IvSource: js.UndefOr[HlsIvSource]
    var KeepSegments: js.UndefOr[__integerMin1]
    var KeyFormat: js.UndefOr[__string]
    var KeyFormatVersions: js.UndefOr[__string]
    var KeyProviderSettings: js.UndefOr[KeyProviderSettings]
    var ManifestCompression: js.UndefOr[HlsManifestCompression]
    var ManifestDurationFormat: js.UndefOr[HlsManifestDurationFormat]
    var MinSegmentLength: js.UndefOr[__integerMin0]
    var Mode: js.UndefOr[HlsMode]
    var OutputSelection: js.UndefOr[HlsOutputSelection]
    var ProgramDateTime: js.UndefOr[HlsProgramDateTime]
    var ProgramDateTimePeriod: js.UndefOr[__integerMin0Max3600]
    var RedundantManifest: js.UndefOr[HlsRedundantManifest]
    var SegmentLength: js.UndefOr[__integerMin1]
    var SegmentationMode: js.UndefOr[HlsSegmentationMode]
    var SegmentsPerSubdirectory: js.UndefOr[__integerMin1]
    var StreamInfResolution: js.UndefOr[HlsStreamInfResolution]
    var TimedMetadataId3Frame: js.UndefOr[HlsTimedMetadataId3Frame]
    var TimedMetadataId3Period: js.UndefOr[__integerMin0]
    var TimestampDeltaMilliseconds: js.UndefOr[__integerMin0]
    var TsFileMode: js.UndefOr[HlsTsFileMode]
  }

  object HlsGroupSettings {
    @inline
    def apply(
        Destination: OutputLocationRef,
        AdMarkers: js.UndefOr[__listOfHlsAdMarkers] = js.undefined,
        BaseUrlContent: js.UndefOr[__string] = js.undefined,
        BaseUrlManifest: js.UndefOr[__string] = js.undefined,
        CaptionLanguageMappings: js.UndefOr[__listOfCaptionLanguageMapping] = js.undefined,
        CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting] = js.undefined,
        ClientCache: js.UndefOr[HlsClientCache] = js.undefined,
        CodecSpecification: js.UndefOr[HlsCodecSpecification] = js.undefined,
        ConstantIv: js.UndefOr[__stringMin32Max32] = js.undefined,
        DirectoryStructure: js.UndefOr[HlsDirectoryStructure] = js.undefined,
        EncryptionType: js.UndefOr[HlsEncryptionType] = js.undefined,
        HlsCdnSettings: js.UndefOr[HlsCdnSettings] = js.undefined,
        IFrameOnlyPlaylists: js.UndefOr[IFrameOnlyPlaylistType] = js.undefined,
        IndexNSegments: js.UndefOr[__integerMin3] = js.undefined,
        InputLossAction: js.UndefOr[InputLossActionForHlsOut] = js.undefined,
        IvInManifest: js.UndefOr[HlsIvInManifest] = js.undefined,
        IvSource: js.UndefOr[HlsIvSource] = js.undefined,
        KeepSegments: js.UndefOr[__integerMin1] = js.undefined,
        KeyFormat: js.UndefOr[__string] = js.undefined,
        KeyFormatVersions: js.UndefOr[__string] = js.undefined,
        KeyProviderSettings: js.UndefOr[KeyProviderSettings] = js.undefined,
        ManifestCompression: js.UndefOr[HlsManifestCompression] = js.undefined,
        ManifestDurationFormat: js.UndefOr[HlsManifestDurationFormat] = js.undefined,
        MinSegmentLength: js.UndefOr[__integerMin0] = js.undefined,
        Mode: js.UndefOr[HlsMode] = js.undefined,
        OutputSelection: js.UndefOr[HlsOutputSelection] = js.undefined,
        ProgramDateTime: js.UndefOr[HlsProgramDateTime] = js.undefined,
        ProgramDateTimePeriod: js.UndefOr[__integerMin0Max3600] = js.undefined,
        RedundantManifest: js.UndefOr[HlsRedundantManifest] = js.undefined,
        SegmentLength: js.UndefOr[__integerMin1] = js.undefined,
        SegmentationMode: js.UndefOr[HlsSegmentationMode] = js.undefined,
        SegmentsPerSubdirectory: js.UndefOr[__integerMin1] = js.undefined,
        StreamInfResolution: js.UndefOr[HlsStreamInfResolution] = js.undefined,
        TimedMetadataId3Frame: js.UndefOr[HlsTimedMetadataId3Frame] = js.undefined,
        TimedMetadataId3Period: js.UndefOr[__integerMin0] = js.undefined,
        TimestampDeltaMilliseconds: js.UndefOr[__integerMin0] = js.undefined,
        TsFileMode: js.UndefOr[HlsTsFileMode] = js.undefined
    ): HlsGroupSettings = {
      val __obj = js.Dynamic.literal(
        "Destination" -> Destination.asInstanceOf[js.Any]
      )

      AdMarkers.foreach(__v => __obj.updateDynamic("AdMarkers")(__v.asInstanceOf[js.Any]))
      BaseUrlContent.foreach(__v => __obj.updateDynamic("BaseUrlContent")(__v.asInstanceOf[js.Any]))
      BaseUrlManifest.foreach(__v => __obj.updateDynamic("BaseUrlManifest")(__v.asInstanceOf[js.Any]))
      CaptionLanguageMappings.foreach(__v => __obj.updateDynamic("CaptionLanguageMappings")(__v.asInstanceOf[js.Any]))
      CaptionLanguageSetting.foreach(__v => __obj.updateDynamic("CaptionLanguageSetting")(__v.asInstanceOf[js.Any]))
      ClientCache.foreach(__v => __obj.updateDynamic("ClientCache")(__v.asInstanceOf[js.Any]))
      CodecSpecification.foreach(__v => __obj.updateDynamic("CodecSpecification")(__v.asInstanceOf[js.Any]))
      ConstantIv.foreach(__v => __obj.updateDynamic("ConstantIv")(__v.asInstanceOf[js.Any]))
      DirectoryStructure.foreach(__v => __obj.updateDynamic("DirectoryStructure")(__v.asInstanceOf[js.Any]))
      EncryptionType.foreach(__v => __obj.updateDynamic("EncryptionType")(__v.asInstanceOf[js.Any]))
      HlsCdnSettings.foreach(__v => __obj.updateDynamic("HlsCdnSettings")(__v.asInstanceOf[js.Any]))
      IFrameOnlyPlaylists.foreach(__v => __obj.updateDynamic("IFrameOnlyPlaylists")(__v.asInstanceOf[js.Any]))
      IndexNSegments.foreach(__v => __obj.updateDynamic("IndexNSegments")(__v.asInstanceOf[js.Any]))
      InputLossAction.foreach(__v => __obj.updateDynamic("InputLossAction")(__v.asInstanceOf[js.Any]))
      IvInManifest.foreach(__v => __obj.updateDynamic("IvInManifest")(__v.asInstanceOf[js.Any]))
      IvSource.foreach(__v => __obj.updateDynamic("IvSource")(__v.asInstanceOf[js.Any]))
      KeepSegments.foreach(__v => __obj.updateDynamic("KeepSegments")(__v.asInstanceOf[js.Any]))
      KeyFormat.foreach(__v => __obj.updateDynamic("KeyFormat")(__v.asInstanceOf[js.Any]))
      KeyFormatVersions.foreach(__v => __obj.updateDynamic("KeyFormatVersions")(__v.asInstanceOf[js.Any]))
      KeyProviderSettings.foreach(__v => __obj.updateDynamic("KeyProviderSettings")(__v.asInstanceOf[js.Any]))
      ManifestCompression.foreach(__v => __obj.updateDynamic("ManifestCompression")(__v.asInstanceOf[js.Any]))
      ManifestDurationFormat.foreach(__v => __obj.updateDynamic("ManifestDurationFormat")(__v.asInstanceOf[js.Any]))
      MinSegmentLength.foreach(__v => __obj.updateDynamic("MinSegmentLength")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      OutputSelection.foreach(__v => __obj.updateDynamic("OutputSelection")(__v.asInstanceOf[js.Any]))
      ProgramDateTime.foreach(__v => __obj.updateDynamic("ProgramDateTime")(__v.asInstanceOf[js.Any]))
      ProgramDateTimePeriod.foreach(__v => __obj.updateDynamic("ProgramDateTimePeriod")(__v.asInstanceOf[js.Any]))
      RedundantManifest.foreach(__v => __obj.updateDynamic("RedundantManifest")(__v.asInstanceOf[js.Any]))
      SegmentLength.foreach(__v => __obj.updateDynamic("SegmentLength")(__v.asInstanceOf[js.Any]))
      SegmentationMode.foreach(__v => __obj.updateDynamic("SegmentationMode")(__v.asInstanceOf[js.Any]))
      SegmentsPerSubdirectory.foreach(__v => __obj.updateDynamic("SegmentsPerSubdirectory")(__v.asInstanceOf[js.Any]))
      StreamInfResolution.foreach(__v => __obj.updateDynamic("StreamInfResolution")(__v.asInstanceOf[js.Any]))
      TimedMetadataId3Frame.foreach(__v => __obj.updateDynamic("TimedMetadataId3Frame")(__v.asInstanceOf[js.Any]))
      TimedMetadataId3Period.foreach(__v => __obj.updateDynamic("TimedMetadataId3Period")(__v.asInstanceOf[js.Any]))
      TimestampDeltaMilliseconds.foreach(
        __v => __obj.updateDynamic("TimestampDeltaMilliseconds")(__v.asInstanceOf[js.Any])
      )
      TsFileMode.foreach(__v => __obj.updateDynamic("TsFileMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsGroupSettings]
    }
  }

  /**
    * Hls Input Settings
    */
  @js.native
  trait HlsInputSettings extends js.Object {
    var Bandwidth: js.UndefOr[__integerMin0]
    var BufferSegments: js.UndefOr[__integerMin0]
    var Retries: js.UndefOr[__integerMin0]
    var RetryInterval: js.UndefOr[__integerMin0]
  }

  object HlsInputSettings {
    @inline
    def apply(
        Bandwidth: js.UndefOr[__integerMin0] = js.undefined,
        BufferSegments: js.UndefOr[__integerMin0] = js.undefined,
        Retries: js.UndefOr[__integerMin0] = js.undefined,
        RetryInterval: js.UndefOr[__integerMin0] = js.undefined
    ): HlsInputSettings = {
      val __obj = js.Dynamic.literal()
      Bandwidth.foreach(__v => __obj.updateDynamic("Bandwidth")(__v.asInstanceOf[js.Any]))
      BufferSegments.foreach(__v => __obj.updateDynamic("BufferSegments")(__v.asInstanceOf[js.Any]))
      Retries.foreach(__v => __obj.updateDynamic("Retries")(__v.asInstanceOf[js.Any]))
      RetryInterval.foreach(__v => __obj.updateDynamic("RetryInterval")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsInputSettings]
    }
  }

  /**
    * Hls Iv In Manifest
    */
  object HlsIvInManifestEnum {
    val EXCLUDE = "EXCLUDE"
    val INCLUDE = "INCLUDE"

    val values = js.Object.freeze(js.Array(EXCLUDE, INCLUDE))
  }

  /**
    * Hls Iv Source
    */
  object HlsIvSourceEnum {
    val EXPLICIT               = "EXPLICIT"
    val FOLLOWS_SEGMENT_NUMBER = "FOLLOWS_SEGMENT_NUMBER"

    val values = js.Object.freeze(js.Array(EXPLICIT, FOLLOWS_SEGMENT_NUMBER))
  }

  /**
    * Hls Manifest Compression
    */
  object HlsManifestCompressionEnum {
    val GZIP = "GZIP"
    val NONE = "NONE"

    val values = js.Object.freeze(js.Array(GZIP, NONE))
  }

  /**
    * Hls Manifest Duration Format
    */
  object HlsManifestDurationFormatEnum {
    val FLOATING_POINT = "FLOATING_POINT"
    val INTEGER        = "INTEGER"

    val values = js.Object.freeze(js.Array(FLOATING_POINT, INTEGER))
  }

  /**
    * Hls Media Store Settings
    */
  @js.native
  trait HlsMediaStoreSettings extends js.Object {
    var ConnectionRetryInterval: js.UndefOr[__integerMin0]
    var FilecacheDuration: js.UndefOr[__integerMin0Max600]
    var MediaStoreStorageClass: js.UndefOr[HlsMediaStoreStorageClass]
    var NumRetries: js.UndefOr[__integerMin0]
    var RestartDelay: js.UndefOr[__integerMin0Max15]
  }

  object HlsMediaStoreSettings {
    @inline
    def apply(
        ConnectionRetryInterval: js.UndefOr[__integerMin0] = js.undefined,
        FilecacheDuration: js.UndefOr[__integerMin0Max600] = js.undefined,
        MediaStoreStorageClass: js.UndefOr[HlsMediaStoreStorageClass] = js.undefined,
        NumRetries: js.UndefOr[__integerMin0] = js.undefined,
        RestartDelay: js.UndefOr[__integerMin0Max15] = js.undefined
    ): HlsMediaStoreSettings = {
      val __obj = js.Dynamic.literal()
      ConnectionRetryInterval.foreach(__v => __obj.updateDynamic("ConnectionRetryInterval")(__v.asInstanceOf[js.Any]))
      FilecacheDuration.foreach(__v => __obj.updateDynamic("FilecacheDuration")(__v.asInstanceOf[js.Any]))
      MediaStoreStorageClass.foreach(__v => __obj.updateDynamic("MediaStoreStorageClass")(__v.asInstanceOf[js.Any]))
      NumRetries.foreach(__v => __obj.updateDynamic("NumRetries")(__v.asInstanceOf[js.Any]))
      RestartDelay.foreach(__v => __obj.updateDynamic("RestartDelay")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsMediaStoreSettings]
    }
  }

  /**
    * Hls Media Store Storage Class
    */
  object HlsMediaStoreStorageClassEnum {
    val TEMPORAL = "TEMPORAL"

    val values = js.Object.freeze(js.Array(TEMPORAL))
  }

  /**
    * Hls Mode
    */
  object HlsModeEnum {
    val LIVE = "LIVE"
    val VOD  = "VOD"

    val values = js.Object.freeze(js.Array(LIVE, VOD))
  }

  /**
    * Hls Output Selection
    */
  object HlsOutputSelectionEnum {
    val MANIFESTS_AND_SEGMENTS = "MANIFESTS_AND_SEGMENTS"
    val SEGMENTS_ONLY          = "SEGMENTS_ONLY"

    val values = js.Object.freeze(js.Array(MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY))
  }

  /**
    * Hls Output Settings
    */
  @js.native
  trait HlsOutputSettings extends js.Object {
    var HlsSettings: HlsSettings
    var NameModifier: js.UndefOr[__stringMin1]
    var SegmentModifier: js.UndefOr[__string]
  }

  object HlsOutputSettings {
    @inline
    def apply(
        HlsSettings: HlsSettings,
        NameModifier: js.UndefOr[__stringMin1] = js.undefined,
        SegmentModifier: js.UndefOr[__string] = js.undefined
    ): HlsOutputSettings = {
      val __obj = js.Dynamic.literal(
        "HlsSettings" -> HlsSettings.asInstanceOf[js.Any]
      )

      NameModifier.foreach(__v => __obj.updateDynamic("NameModifier")(__v.asInstanceOf[js.Any]))
      SegmentModifier.foreach(__v => __obj.updateDynamic("SegmentModifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsOutputSettings]
    }
  }

  /**
    * Hls Program Date Time
    */
  object HlsProgramDateTimeEnum {
    val EXCLUDE = "EXCLUDE"
    val INCLUDE = "INCLUDE"

    val values = js.Object.freeze(js.Array(EXCLUDE, INCLUDE))
  }

  /**
    * Hls Redundant Manifest
    */
  object HlsRedundantManifestEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Hls Segmentation Mode
    */
  object HlsSegmentationModeEnum {
    val USE_INPUT_SEGMENTATION = "USE_INPUT_SEGMENTATION"
    val USE_SEGMENT_DURATION   = "USE_SEGMENT_DURATION"

    val values = js.Object.freeze(js.Array(USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION))
  }

  /**
    * Hls Settings
    */
  @js.native
  trait HlsSettings extends js.Object {
    var AudioOnlyHlsSettings: js.UndefOr[AudioOnlyHlsSettings]
    var StandardHlsSettings: js.UndefOr[StandardHlsSettings]
  }

  object HlsSettings {
    @inline
    def apply(
        AudioOnlyHlsSettings: js.UndefOr[AudioOnlyHlsSettings] = js.undefined,
        StandardHlsSettings: js.UndefOr[StandardHlsSettings] = js.undefined
    ): HlsSettings = {
      val __obj = js.Dynamic.literal()
      AudioOnlyHlsSettings.foreach(__v => __obj.updateDynamic("AudioOnlyHlsSettings")(__v.asInstanceOf[js.Any]))
      StandardHlsSettings.foreach(__v => __obj.updateDynamic("StandardHlsSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsSettings]
    }
  }

  /**
    * Hls Stream Inf Resolution
    */
  object HlsStreamInfResolutionEnum {
    val EXCLUDE = "EXCLUDE"
    val INCLUDE = "INCLUDE"

    val values = js.Object.freeze(js.Array(EXCLUDE, INCLUDE))
  }

  /**
    * Hls Timed Metadata Id3 Frame
    */
  object HlsTimedMetadataId3FrameEnum {
    val NONE = "NONE"
    val PRIV = "PRIV"
    val TDRL = "TDRL"

    val values = js.Object.freeze(js.Array(NONE, PRIV, TDRL))
  }

  /**
    * Settings for the action to emit HLS metadata
    */
  @js.native
  trait HlsTimedMetadataScheduleActionSettings extends js.Object {
    var Id3: __string
  }

  object HlsTimedMetadataScheduleActionSettings {
    @inline
    def apply(
        Id3: __string
    ): HlsTimedMetadataScheduleActionSettings = {
      val __obj = js.Dynamic.literal(
        "Id3" -> Id3.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HlsTimedMetadataScheduleActionSettings]
    }
  }

  /**
    * Hls Ts File Mode
    */
  object HlsTsFileModeEnum {
    val SEGMENTED_FILES = "SEGMENTED_FILES"
    val SINGLE_FILE     = "SINGLE_FILE"

    val values = js.Object.freeze(js.Array(SEGMENTED_FILES, SINGLE_FILE))
  }

  /**
    * Hls Webdav Http Transfer Mode
    */
  object HlsWebdavHttpTransferModeEnum {
    val CHUNKED     = "CHUNKED"
    val NON_CHUNKED = "NON_CHUNKED"

    val values = js.Object.freeze(js.Array(CHUNKED, NON_CHUNKED))
  }

  /**
    * Hls Webdav Settings
    */
  @js.native
  trait HlsWebdavSettings extends js.Object {
    var ConnectionRetryInterval: js.UndefOr[__integerMin0]
    var FilecacheDuration: js.UndefOr[__integerMin0Max600]
    var HttpTransferMode: js.UndefOr[HlsWebdavHttpTransferMode]
    var NumRetries: js.UndefOr[__integerMin0]
    var RestartDelay: js.UndefOr[__integerMin0Max15]
  }

  object HlsWebdavSettings {
    @inline
    def apply(
        ConnectionRetryInterval: js.UndefOr[__integerMin0] = js.undefined,
        FilecacheDuration: js.UndefOr[__integerMin0Max600] = js.undefined,
        HttpTransferMode: js.UndefOr[HlsWebdavHttpTransferMode] = js.undefined,
        NumRetries: js.UndefOr[__integerMin0] = js.undefined,
        RestartDelay: js.UndefOr[__integerMin0Max15] = js.undefined
    ): HlsWebdavSettings = {
      val __obj = js.Dynamic.literal()
      ConnectionRetryInterval.foreach(__v => __obj.updateDynamic("ConnectionRetryInterval")(__v.asInstanceOf[js.Any]))
      FilecacheDuration.foreach(__v => __obj.updateDynamic("FilecacheDuration")(__v.asInstanceOf[js.Any]))
      HttpTransferMode.foreach(__v => __obj.updateDynamic("HttpTransferMode")(__v.asInstanceOf[js.Any]))
      NumRetries.foreach(__v => __obj.updateDynamic("NumRetries")(__v.asInstanceOf[js.Any]))
      RestartDelay.foreach(__v => __obj.updateDynamic("RestartDelay")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsWebdavSettings]
    }
  }

  /**
    * When set to "standard", an I-Frame only playlist will be written out for each video output in the output group. This I-Frame only playlist will contain byte range offsets pointing to the I-frame(s) in each segment.
    */
  object IFrameOnlyPlaylistTypeEnum {
    val DISABLED = "DISABLED"
    val STANDARD = "STANDARD"

    val values = js.Object.freeze(js.Array(DISABLED, STANDARD))
  }

  /**
    * Settings to configure an action so that it occurs immediately. This is only supported for input switch actions currently.
    */
  @js.native
  trait ImmediateModeScheduleActionStartSettings extends js.Object {}

  object ImmediateModeScheduleActionStartSettings {
    @inline
    def apply(
        ): ImmediateModeScheduleActionStartSettings = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ImmediateModeScheduleActionStartSettings]
    }
  }

  /**
    * Placeholder documentation for Input
    */
  @js.native
  trait Input extends js.Object {
    var Arn: js.UndefOr[__string]
    var AttachedChannels: js.UndefOr[__listOf__string]
    var Destinations: js.UndefOr[__listOfInputDestination]
    var Id: js.UndefOr[__string]
    var InputClass: js.UndefOr[InputClass]
    var InputSourceType: js.UndefOr[InputSourceType]
    var MediaConnectFlows: js.UndefOr[__listOfMediaConnectFlow]
    var Name: js.UndefOr[__string]
    var RoleArn: js.UndefOr[__string]
    var SecurityGroups: js.UndefOr[__listOf__string]
    var Sources: js.UndefOr[__listOfInputSource]
    var State: js.UndefOr[InputState]
    var Tags: js.UndefOr[Tags]
    var Type: js.UndefOr[InputType]
  }

  object Input {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        AttachedChannels: js.UndefOr[__listOf__string] = js.undefined,
        Destinations: js.UndefOr[__listOfInputDestination] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        InputClass: js.UndefOr[InputClass] = js.undefined,
        InputSourceType: js.UndefOr[InputSourceType] = js.undefined,
        MediaConnectFlows: js.UndefOr[__listOfMediaConnectFlow] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        SecurityGroups: js.UndefOr[__listOf__string] = js.undefined,
        Sources: js.UndefOr[__listOfInputSource] = js.undefined,
        State: js.UndefOr[InputState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Type: js.UndefOr[InputType] = js.undefined
    ): Input = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AttachedChannels.foreach(__v => __obj.updateDynamic("AttachedChannels")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InputClass.foreach(__v => __obj.updateDynamic("InputClass")(__v.asInstanceOf[js.Any]))
      InputSourceType.foreach(__v => __obj.updateDynamic("InputSourceType")(__v.asInstanceOf[js.Any]))
      MediaConnectFlows.foreach(__v => __obj.updateDynamic("MediaConnectFlows")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.updateDynamic("Sources")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Input]
    }
  }

  /**
    * Placeholder documentation for InputAttachment
    */
  @js.native
  trait InputAttachment extends js.Object {
    var InputAttachmentName: js.UndefOr[__string]
    var InputId: js.UndefOr[__string]
    var InputSettings: js.UndefOr[InputSettings]
  }

  object InputAttachment {
    @inline
    def apply(
        InputAttachmentName: js.UndefOr[__string] = js.undefined,
        InputId: js.UndefOr[__string] = js.undefined,
        InputSettings: js.UndefOr[InputSettings] = js.undefined
    ): InputAttachment = {
      val __obj = js.Dynamic.literal()
      InputAttachmentName.foreach(__v => __obj.updateDynamic("InputAttachmentName")(__v.asInstanceOf[js.Any]))
      InputId.foreach(__v => __obj.updateDynamic("InputId")(__v.asInstanceOf[js.Any]))
      InputSettings.foreach(__v => __obj.updateDynamic("InputSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputAttachment]
    }
  }

  /**
    * Input Channel Level
    */
  @js.native
  trait InputChannelLevel extends js.Object {
    var Gain: __integerMinNegative60Max6
    var InputChannel: __integerMin0Max15
  }

  object InputChannelLevel {
    @inline
    def apply(
        Gain: __integerMinNegative60Max6,
        InputChannel: __integerMin0Max15
    ): InputChannelLevel = {
      val __obj = js.Dynamic.literal(
        "Gain"         -> Gain.asInstanceOf[js.Any],
        "InputChannel" -> InputChannel.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InputChannelLevel]
    }
  }

  /**
    * A standard input has two sources and a single pipeline input only has one.
    */
  object InputClassEnum {
    val STANDARD        = "STANDARD"
    val SINGLE_PIPELINE = "SINGLE_PIPELINE"

    val values = js.Object.freeze(js.Array(STANDARD, SINGLE_PIPELINE))
  }

  /**
    * Settings to let you create a clip of the file input, in order to set up the input to ingest only a portion of the file.
    */
  @js.native
  trait InputClippingSettings extends js.Object {
    var InputTimecodeSource: InputTimecodeSource
    var StartTimecode: js.UndefOr[StartTimecode]
    var StopTimecode: js.UndefOr[StopTimecode]
  }

  object InputClippingSettings {
    @inline
    def apply(
        InputTimecodeSource: InputTimecodeSource,
        StartTimecode: js.UndefOr[StartTimecode] = js.undefined,
        StopTimecode: js.UndefOr[StopTimecode] = js.undefined
    ): InputClippingSettings = {
      val __obj = js.Dynamic.literal(
        "InputTimecodeSource" -> InputTimecodeSource.asInstanceOf[js.Any]
      )

      StartTimecode.foreach(__v => __obj.updateDynamic("StartTimecode")(__v.asInstanceOf[js.Any]))
      StopTimecode.foreach(__v => __obj.updateDynamic("StopTimecode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputClippingSettings]
    }
  }

  /**
    * codec in increasing order of complexity
    */
  object InputCodecEnum {
    val MPEG2 = "MPEG2"
    val AVC   = "AVC"
    val HEVC  = "HEVC"

    val values = js.Object.freeze(js.Array(MPEG2, AVC, HEVC))
  }

  /**
    * Input Deblock Filter
    */
  object InputDeblockFilterEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Input Denoise Filter
    */
  object InputDenoiseFilterEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * The settings for a PUSH type input.
    */
  @js.native
  trait InputDestination extends js.Object {
    var Ip: js.UndefOr[__string]
    var Port: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
    var Vpc: js.UndefOr[InputDestinationVpc]
  }

  object InputDestination {
    @inline
    def apply(
        Ip: js.UndefOr[__string] = js.undefined,
        Port: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined,
        Vpc: js.UndefOr[InputDestinationVpc] = js.undefined
    ): InputDestination = {
      val __obj = js.Dynamic.literal()
      Ip.foreach(__v => __obj.updateDynamic("Ip")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      Vpc.foreach(__v => __obj.updateDynamic("Vpc")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputDestination]
    }
  }

  /**
    * Endpoint settings for a PUSH type input.
    */
  @js.native
  trait InputDestinationRequest extends js.Object {
    var StreamName: js.UndefOr[__string]
  }

  object InputDestinationRequest {
    @inline
    def apply(
        StreamName: js.UndefOr[__string] = js.undefined
    ): InputDestinationRequest = {
      val __obj = js.Dynamic.literal()
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputDestinationRequest]
    }
  }

  /**
    * The properties for a VPC type input destination.
    */
  @js.native
  trait InputDestinationVpc extends js.Object {
    var AvailabilityZone: js.UndefOr[__string]
    var NetworkInterfaceId: js.UndefOr[__string]
  }

  object InputDestinationVpc {
    @inline
    def apply(
        AvailabilityZone: js.UndefOr[__string] = js.undefined,
        NetworkInterfaceId: js.UndefOr[__string] = js.undefined
    ): InputDestinationVpc = {
      val __obj = js.Dynamic.literal()
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      NetworkInterfaceId.foreach(__v => __obj.updateDynamic("NetworkInterfaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputDestinationVpc]
    }
  }

  /**
    * Input Filter
    */
  object InputFilterEnum {
    val AUTO     = "AUTO"
    val DISABLED = "DISABLED"
    val FORCED   = "FORCED"

    val values = js.Object.freeze(js.Array(AUTO, DISABLED, FORCED))
  }

  /**
    * Input Location
    */
  @js.native
  trait InputLocation extends js.Object {
    var Uri: __string
    var PasswordParam: js.UndefOr[__string]
    var Username: js.UndefOr[__string]
  }

  object InputLocation {
    @inline
    def apply(
        Uri: __string,
        PasswordParam: js.UndefOr[__string] = js.undefined,
        Username: js.UndefOr[__string] = js.undefined
    ): InputLocation = {
      val __obj = js.Dynamic.literal(
        "Uri" -> Uri.asInstanceOf[js.Any]
      )

      PasswordParam.foreach(__v => __obj.updateDynamic("PasswordParam")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputLocation]
    }
  }

  /**
    * Input Loss Action For Hls Out
    */
  object InputLossActionForHlsOutEnum {
    val EMIT_OUTPUT  = "EMIT_OUTPUT"
    val PAUSE_OUTPUT = "PAUSE_OUTPUT"

    val values = js.Object.freeze(js.Array(EMIT_OUTPUT, PAUSE_OUTPUT))
  }

  /**
    * Input Loss Action For Ms Smooth Out
    */
  object InputLossActionForMsSmoothOutEnum {
    val EMIT_OUTPUT  = "EMIT_OUTPUT"
    val PAUSE_OUTPUT = "PAUSE_OUTPUT"

    val values = js.Object.freeze(js.Array(EMIT_OUTPUT, PAUSE_OUTPUT))
  }

  /**
    * Input Loss Action For Rtmp Out
    */
  object InputLossActionForRtmpOutEnum {
    val EMIT_OUTPUT  = "EMIT_OUTPUT"
    val PAUSE_OUTPUT = "PAUSE_OUTPUT"

    val values = js.Object.freeze(js.Array(EMIT_OUTPUT, PAUSE_OUTPUT))
  }

  /**
    * Input Loss Action For Udp Out
    */
  object InputLossActionForUdpOutEnum {
    val DROP_PROGRAM = "DROP_PROGRAM"
    val DROP_TS      = "DROP_TS"
    val EMIT_PROGRAM = "EMIT_PROGRAM"

    val values = js.Object.freeze(js.Array(DROP_PROGRAM, DROP_TS, EMIT_PROGRAM))
  }

  /**
    * Input Loss Behavior
    */
  @js.native
  trait InputLossBehavior extends js.Object {
    var BlackFrameMsec: js.UndefOr[__integerMin0Max1000000]
    var InputLossImageColor: js.UndefOr[__stringMin6Max6]
    var InputLossImageSlate: js.UndefOr[InputLocation]
    var InputLossImageType: js.UndefOr[InputLossImageType]
    var RepeatFrameMsec: js.UndefOr[__integerMin0Max1000000]
  }

  object InputLossBehavior {
    @inline
    def apply(
        BlackFrameMsec: js.UndefOr[__integerMin0Max1000000] = js.undefined,
        InputLossImageColor: js.UndefOr[__stringMin6Max6] = js.undefined,
        InputLossImageSlate: js.UndefOr[InputLocation] = js.undefined,
        InputLossImageType: js.UndefOr[InputLossImageType] = js.undefined,
        RepeatFrameMsec: js.UndefOr[__integerMin0Max1000000] = js.undefined
    ): InputLossBehavior = {
      val __obj = js.Dynamic.literal()
      BlackFrameMsec.foreach(__v => __obj.updateDynamic("BlackFrameMsec")(__v.asInstanceOf[js.Any]))
      InputLossImageColor.foreach(__v => __obj.updateDynamic("InputLossImageColor")(__v.asInstanceOf[js.Any]))
      InputLossImageSlate.foreach(__v => __obj.updateDynamic("InputLossImageSlate")(__v.asInstanceOf[js.Any]))
      InputLossImageType.foreach(__v => __obj.updateDynamic("InputLossImageType")(__v.asInstanceOf[js.Any]))
      RepeatFrameMsec.foreach(__v => __obj.updateDynamic("RepeatFrameMsec")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputLossBehavior]
    }
  }

  /**
    * Input Loss Image Type
    */
  object InputLossImageTypeEnum {
    val COLOR = "COLOR"
    val SLATE = "SLATE"

    val values = js.Object.freeze(js.Array(COLOR, SLATE))
  }

  /**
    * Maximum input bitrate in megabits per second. Bitrates up to 50 Mbps are supported currently.
    */
  object InputMaximumBitrateEnum {
    val MAX_10_MBPS = "MAX_10_MBPS"
    val MAX_20_MBPS = "MAX_20_MBPS"
    val MAX_50_MBPS = "MAX_50_MBPS"

    val values = js.Object.freeze(js.Array(MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS))
  }

  /**
    * Input resolution based on lines of vertical resolution in the input; SD is less than 720 lines, HD is 720 to 1080 lines, UHD is greater than 1080 lines
    */
  object InputResolutionEnum {
    val SD  = "SD"
    val HD  = "HD"
    val UHD = "UHD"

    val values = js.Object.freeze(js.Array(SD, HD, UHD))
  }

  /**
    * An Input Security Group
    */
  @js.native
  trait InputSecurityGroup extends js.Object {
    var Arn: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Inputs: js.UndefOr[__listOf__string]
    var State: js.UndefOr[InputSecurityGroupState]
    var Tags: js.UndefOr[Tags]
    var WhitelistRules: js.UndefOr[__listOfInputWhitelistRule]
  }

  object InputSecurityGroup {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Inputs: js.UndefOr[__listOf__string] = js.undefined,
        State: js.UndefOr[InputSecurityGroupState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        WhitelistRules: js.UndefOr[__listOfInputWhitelistRule] = js.undefined
    ): InputSecurityGroup = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Inputs.foreach(__v => __obj.updateDynamic("Inputs")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      WhitelistRules.foreach(__v => __obj.updateDynamic("WhitelistRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputSecurityGroup]
    }
  }

  /**
    * Placeholder documentation for InputSecurityGroupState
    */
  object InputSecurityGroupStateEnum {
    val IDLE     = "IDLE"
    val IN_USE   = "IN_USE"
    val UPDATING = "UPDATING"
    val DELETED  = "DELETED"

    val values = js.Object.freeze(js.Array(IDLE, IN_USE, UPDATING, DELETED))
  }

  /**
    * Live Event input parameters. There can be multiple inputs in a single Live Event.
    */
  @js.native
  trait InputSettings extends js.Object {
    var AudioSelectors: js.UndefOr[__listOfAudioSelector]
    var CaptionSelectors: js.UndefOr[__listOfCaptionSelector]
    var DeblockFilter: js.UndefOr[InputDeblockFilter]
    var DenoiseFilter: js.UndefOr[InputDenoiseFilter]
    var FilterStrength: js.UndefOr[__integerMin1Max5]
    var InputFilter: js.UndefOr[InputFilter]
    var NetworkInputSettings: js.UndefOr[NetworkInputSettings]
    var SourceEndBehavior: js.UndefOr[InputSourceEndBehavior]
    var VideoSelector: js.UndefOr[VideoSelector]
  }

  object InputSettings {
    @inline
    def apply(
        AudioSelectors: js.UndefOr[__listOfAudioSelector] = js.undefined,
        CaptionSelectors: js.UndefOr[__listOfCaptionSelector] = js.undefined,
        DeblockFilter: js.UndefOr[InputDeblockFilter] = js.undefined,
        DenoiseFilter: js.UndefOr[InputDenoiseFilter] = js.undefined,
        FilterStrength: js.UndefOr[__integerMin1Max5] = js.undefined,
        InputFilter: js.UndefOr[InputFilter] = js.undefined,
        NetworkInputSettings: js.UndefOr[NetworkInputSettings] = js.undefined,
        SourceEndBehavior: js.UndefOr[InputSourceEndBehavior] = js.undefined,
        VideoSelector: js.UndefOr[VideoSelector] = js.undefined
    ): InputSettings = {
      val __obj = js.Dynamic.literal()
      AudioSelectors.foreach(__v => __obj.updateDynamic("AudioSelectors")(__v.asInstanceOf[js.Any]))
      CaptionSelectors.foreach(__v => __obj.updateDynamic("CaptionSelectors")(__v.asInstanceOf[js.Any]))
      DeblockFilter.foreach(__v => __obj.updateDynamic("DeblockFilter")(__v.asInstanceOf[js.Any]))
      DenoiseFilter.foreach(__v => __obj.updateDynamic("DenoiseFilter")(__v.asInstanceOf[js.Any]))
      FilterStrength.foreach(__v => __obj.updateDynamic("FilterStrength")(__v.asInstanceOf[js.Any]))
      InputFilter.foreach(__v => __obj.updateDynamic("InputFilter")(__v.asInstanceOf[js.Any]))
      NetworkInputSettings.foreach(__v => __obj.updateDynamic("NetworkInputSettings")(__v.asInstanceOf[js.Any]))
      SourceEndBehavior.foreach(__v => __obj.updateDynamic("SourceEndBehavior")(__v.asInstanceOf[js.Any]))
      VideoSelector.foreach(__v => __obj.updateDynamic("VideoSelector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputSettings]
    }
  }

  /**
    * The settings for a PULL type input.
    */
  @js.native
  trait InputSource extends js.Object {
    var PasswordParam: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
    var Username: js.UndefOr[__string]
  }

  object InputSource {
    @inline
    def apply(
        PasswordParam: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined,
        Username: js.UndefOr[__string] = js.undefined
    ): InputSource = {
      val __obj = js.Dynamic.literal()
      PasswordParam.foreach(__v => __obj.updateDynamic("PasswordParam")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputSource]
    }
  }

  /**
    * Input Source End Behavior
    */
  object InputSourceEndBehaviorEnum {
    val CONTINUE = "CONTINUE"
    val LOOP     = "LOOP"

    val values = js.Object.freeze(js.Array(CONTINUE, LOOP))
  }

  /**
    * Settings for for a PULL type input.
    */
  @js.native
  trait InputSourceRequest extends js.Object {
    var PasswordParam: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
    var Username: js.UndefOr[__string]
  }

  object InputSourceRequest {
    @inline
    def apply(
        PasswordParam: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined,
        Username: js.UndefOr[__string] = js.undefined
    ): InputSourceRequest = {
      val __obj = js.Dynamic.literal()
      PasswordParam.foreach(__v => __obj.updateDynamic("PasswordParam")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputSourceRequest]
    }
  }

  /**
    * There are two types of input sources, static and dynamic. If an input source is dynamic you can
    * change the source url of the input dynamically using an input switch action. However, the only input type
    * to support a dynamic url at this time is MP4_FILE. By default all input sources are static.
    */
  object InputSourceTypeEnum {
    val STATIC  = "STATIC"
    val DYNAMIC = "DYNAMIC"

    val values = js.Object.freeze(js.Array(STATIC, DYNAMIC))
  }

  /**
    * Placeholder documentation for InputSpecification
    */
  @js.native
  trait InputSpecification extends js.Object {
    var Codec: js.UndefOr[InputCodec]
    var MaximumBitrate: js.UndefOr[InputMaximumBitrate]
    var Resolution: js.UndefOr[InputResolution]
  }

  object InputSpecification {
    @inline
    def apply(
        Codec: js.UndefOr[InputCodec] = js.undefined,
        MaximumBitrate: js.UndefOr[InputMaximumBitrate] = js.undefined,
        Resolution: js.UndefOr[InputResolution] = js.undefined
    ): InputSpecification = {
      val __obj = js.Dynamic.literal()
      Codec.foreach(__v => __obj.updateDynamic("Codec")(__v.asInstanceOf[js.Any]))
      MaximumBitrate.foreach(__v => __obj.updateDynamic("MaximumBitrate")(__v.asInstanceOf[js.Any]))
      Resolution.foreach(__v => __obj.updateDynamic("Resolution")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputSpecification]
    }
  }

  /**
    * Placeholder documentation for InputState
    */
  object InputStateEnum {
    val CREATING = "CREATING"
    val DETACHED = "DETACHED"
    val ATTACHED = "ATTACHED"
    val DELETING = "DELETING"
    val DELETED  = "DELETED"

    val values = js.Object.freeze(js.Array(CREATING, DETACHED, ATTACHED, DELETING, DELETED))
  }

  /**
    * Settings for the "switch input" action: to switch from ingesting one input to ingesting another input.
    */
  @js.native
  trait InputSwitchScheduleActionSettings extends js.Object {
    var InputAttachmentNameReference: __string
    var InputClippingSettings: js.UndefOr[InputClippingSettings]
    var UrlPath: js.UndefOr[__listOf__string]
  }

  object InputSwitchScheduleActionSettings {
    @inline
    def apply(
        InputAttachmentNameReference: __string,
        InputClippingSettings: js.UndefOr[InputClippingSettings] = js.undefined,
        UrlPath: js.UndefOr[__listOf__string] = js.undefined
    ): InputSwitchScheduleActionSettings = {
      val __obj = js.Dynamic.literal(
        "InputAttachmentNameReference" -> InputAttachmentNameReference.asInstanceOf[js.Any]
      )

      InputClippingSettings.foreach(__v => __obj.updateDynamic("InputClippingSettings")(__v.asInstanceOf[js.Any]))
      UrlPath.foreach(__v => __obj.updateDynamic("UrlPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputSwitchScheduleActionSettings]
    }
  }

  /**
    * Documentation update needed
    */
  object InputTimecodeSourceEnum {
    val ZEROBASED = "ZEROBASED"
    val EMBEDDED  = "EMBEDDED"

    val values = js.Object.freeze(js.Array(ZEROBASED, EMBEDDED))
  }

  /**
    * Placeholder documentation for InputType
    */
  object InputTypeEnum {
    val UDP_PUSH     = "UDP_PUSH"
    val RTP_PUSH     = "RTP_PUSH"
    val RTMP_PUSH    = "RTMP_PUSH"
    val RTMP_PULL    = "RTMP_PULL"
    val URL_PULL     = "URL_PULL"
    val MP4_FILE     = "MP4_FILE"
    val MEDIACONNECT = "MEDIACONNECT"

    val values = js.Object.freeze(js.Array(UDP_PUSH, RTP_PUSH, RTMP_PUSH, RTMP_PULL, URL_PULL, MP4_FILE, MEDIACONNECT))
  }

  /**
    * Settings for a private VPC Input.
    * When this property is specified, the input destination addresses will be created in a VPC rather than with public Internet addresses.
    * This property requires setting the roleArn property on Input creation.
    * Not compatible with the inputSecurityGroups property.
    */
  @js.native
  trait InputVpcRequest extends js.Object {
    var SubnetIds: __listOf__string
    var SecurityGroupIds: js.UndefOr[__listOf__string]
  }

  object InputVpcRequest {
    @inline
    def apply(
        SubnetIds: __listOf__string,
        SecurityGroupIds: js.UndefOr[__listOf__string] = js.undefined
    ): InputVpcRequest = {
      val __obj = js.Dynamic.literal(
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any]
      )

      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputVpcRequest]
    }
  }

  /**
    * Whitelist rule
    */
  @js.native
  trait InputWhitelistRule extends js.Object {
    var Cidr: js.UndefOr[__string]
  }

  object InputWhitelistRule {
    @inline
    def apply(
        Cidr: js.UndefOr[__string] = js.undefined
    ): InputWhitelistRule = {
      val __obj = js.Dynamic.literal()
      Cidr.foreach(__v => __obj.updateDynamic("Cidr")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputWhitelistRule]
    }
  }

  /**
    * An IPv4 CIDR to whitelist.
    */
  @js.native
  trait InputWhitelistRuleCidr extends js.Object {
    var Cidr: js.UndefOr[__string]
  }

  object InputWhitelistRuleCidr {
    @inline
    def apply(
        Cidr: js.UndefOr[__string] = js.undefined
    ): InputWhitelistRuleCidr = {
      val __obj = js.Dynamic.literal()
      Cidr.foreach(__v => __obj.updateDynamic("Cidr")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputWhitelistRuleCidr]
    }
  }

  /**
    * Key Provider Settings
    */
  @js.native
  trait KeyProviderSettings extends js.Object {
    var StaticKeySettings: js.UndefOr[StaticKeySettings]
  }

  object KeyProviderSettings {
    @inline
    def apply(
        StaticKeySettings: js.UndefOr[StaticKeySettings] = js.undefined
    ): KeyProviderSettings = {
      val __obj = js.Dynamic.literal()
      StaticKeySettings.foreach(__v => __obj.updateDynamic("StaticKeySettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyProviderSettings]
    }
  }

  /**
    * If you specify a StopTimecode in an input (in order to clip the file), you can specify if you want the clip to exclude (the default) or include the frame specified by the timecode.
    */
  object LastFrameClippingBehaviorEnum {
    val EXCLUDE_LAST_FRAME = "EXCLUDE_LAST_FRAME"
    val INCLUDE_LAST_FRAME = "INCLUDE_LAST_FRAME"

    val values = js.Object.freeze(js.Array(EXCLUDE_LAST_FRAME, INCLUDE_LAST_FRAME))
  }

  /**
    * Placeholder documentation for ListChannelsRequest
    */
  @js.native
  trait ListChannelsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListChannelsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListChannelsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelsRequest]
    }
  }

  /**
    * Placeholder documentation for ListChannelsResponse
    */
  @js.native
  trait ListChannelsResponse extends js.Object {
    var Channels: js.UndefOr[__listOfChannelSummary]
    var NextToken: js.UndefOr[__string]
  }

  object ListChannelsResponse {
    @inline
    def apply(
        Channels: js.UndefOr[__listOfChannelSummary] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListChannelsResponse = {
      val __obj = js.Dynamic.literal()
      Channels.foreach(__v => __obj.updateDynamic("Channels")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelsResponse]
    }
  }

  /**
    * Placeholder documentation for ListInputSecurityGroupsRequest
    */
  @js.native
  trait ListInputSecurityGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListInputSecurityGroupsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListInputSecurityGroupsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInputSecurityGroupsRequest]
    }
  }

  /**
    * Placeholder documentation for ListInputSecurityGroupsResponse
    */
  @js.native
  trait ListInputSecurityGroupsResponse extends js.Object {
    var InputSecurityGroups: js.UndefOr[__listOfInputSecurityGroup]
    var NextToken: js.UndefOr[__string]
  }

  object ListInputSecurityGroupsResponse {
    @inline
    def apply(
        InputSecurityGroups: js.UndefOr[__listOfInputSecurityGroup] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListInputSecurityGroupsResponse = {
      val __obj = js.Dynamic.literal()
      InputSecurityGroups.foreach(__v => __obj.updateDynamic("InputSecurityGroups")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInputSecurityGroupsResponse]
    }
  }

  /**
    * Placeholder documentation for ListInputsRequest
    */
  @js.native
  trait ListInputsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListInputsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListInputsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInputsRequest]
    }
  }

  /**
    * Placeholder documentation for ListInputsResponse
    */
  @js.native
  trait ListInputsResponse extends js.Object {
    var Inputs: js.UndefOr[__listOfInput]
    var NextToken: js.UndefOr[__string]
  }

  object ListInputsResponse {
    @inline
    def apply(
        Inputs: js.UndefOr[__listOfInput] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListInputsResponse = {
      val __obj = js.Dynamic.literal()
      Inputs.foreach(__v => __obj.updateDynamic("Inputs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInputsResponse]
    }
  }

  /**
    * Placeholder documentation for ListOfferingsRequest
    */
  @js.native
  trait ListOfferingsRequest extends js.Object {
    var ChannelClass: js.UndefOr[__string]
    var ChannelConfiguration: js.UndefOr[__string]
    var Codec: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var MaximumBitrate: js.UndefOr[__string]
    var MaximumFramerate: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
    var Resolution: js.UndefOr[__string]
    var ResourceType: js.UndefOr[__string]
    var SpecialFeature: js.UndefOr[__string]
    var VideoQuality: js.UndefOr[__string]
  }

  object ListOfferingsRequest {
    @inline
    def apply(
        ChannelClass: js.UndefOr[__string] = js.undefined,
        ChannelConfiguration: js.UndefOr[__string] = js.undefined,
        Codec: js.UndefOr[__string] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        MaximumBitrate: js.UndefOr[__string] = js.undefined,
        MaximumFramerate: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Resolution: js.UndefOr[__string] = js.undefined,
        ResourceType: js.UndefOr[__string] = js.undefined,
        SpecialFeature: js.UndefOr[__string] = js.undefined,
        VideoQuality: js.UndefOr[__string] = js.undefined
    ): ListOfferingsRequest = {
      val __obj = js.Dynamic.literal()
      ChannelClass.foreach(__v => __obj.updateDynamic("ChannelClass")(__v.asInstanceOf[js.Any]))
      ChannelConfiguration.foreach(__v => __obj.updateDynamic("ChannelConfiguration")(__v.asInstanceOf[js.Any]))
      Codec.foreach(__v => __obj.updateDynamic("Codec")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      MaximumBitrate.foreach(__v => __obj.updateDynamic("MaximumBitrate")(__v.asInstanceOf[js.Any]))
      MaximumFramerate.foreach(__v => __obj.updateDynamic("MaximumFramerate")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Resolution.foreach(__v => __obj.updateDynamic("Resolution")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      SpecialFeature.foreach(__v => __obj.updateDynamic("SpecialFeature")(__v.asInstanceOf[js.Any]))
      VideoQuality.foreach(__v => __obj.updateDynamic("VideoQuality")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOfferingsRequest]
    }
  }

  /**
    * Placeholder documentation for ListOfferingsResponse
    */
  @js.native
  trait ListOfferingsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Offerings: js.UndefOr[__listOfOffering]
  }

  object ListOfferingsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Offerings: js.UndefOr[__listOfOffering] = js.undefined
    ): ListOfferingsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Offerings.foreach(__v => __obj.updateDynamic("Offerings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOfferingsResponse]
    }
  }

  /**
    * Placeholder documentation for ListReservationsRequest
    */
  @js.native
  trait ListReservationsRequest extends js.Object {
    var ChannelClass: js.UndefOr[__string]
    var Codec: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var MaximumBitrate: js.UndefOr[__string]
    var MaximumFramerate: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
    var Resolution: js.UndefOr[__string]
    var ResourceType: js.UndefOr[__string]
    var SpecialFeature: js.UndefOr[__string]
    var VideoQuality: js.UndefOr[__string]
  }

  object ListReservationsRequest {
    @inline
    def apply(
        ChannelClass: js.UndefOr[__string] = js.undefined,
        Codec: js.UndefOr[__string] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        MaximumBitrate: js.UndefOr[__string] = js.undefined,
        MaximumFramerate: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Resolution: js.UndefOr[__string] = js.undefined,
        ResourceType: js.UndefOr[__string] = js.undefined,
        SpecialFeature: js.UndefOr[__string] = js.undefined,
        VideoQuality: js.UndefOr[__string] = js.undefined
    ): ListReservationsRequest = {
      val __obj = js.Dynamic.literal()
      ChannelClass.foreach(__v => __obj.updateDynamic("ChannelClass")(__v.asInstanceOf[js.Any]))
      Codec.foreach(__v => __obj.updateDynamic("Codec")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      MaximumBitrate.foreach(__v => __obj.updateDynamic("MaximumBitrate")(__v.asInstanceOf[js.Any]))
      MaximumFramerate.foreach(__v => __obj.updateDynamic("MaximumFramerate")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Resolution.foreach(__v => __obj.updateDynamic("Resolution")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      SpecialFeature.foreach(__v => __obj.updateDynamic("SpecialFeature")(__v.asInstanceOf[js.Any]))
      VideoQuality.foreach(__v => __obj.updateDynamic("VideoQuality")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReservationsRequest]
    }
  }

  /**
    * Placeholder documentation for ListReservationsResponse
    */
  @js.native
  trait ListReservationsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Reservations: js.UndefOr[__listOfReservation]
  }

  object ListReservationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Reservations: js.UndefOr[__listOfReservation] = js.undefined
    ): ListReservationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Reservations.foreach(__v => __obj.updateDynamic("Reservations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReservationsResponse]
    }
  }

  /**
    * Placeholder documentation for ListTagsForResourceRequest
    */
  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: __string
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  /**
    * Placeholder documentation for ListTagsForResourceResponse
    */
  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * The log level the user wants for their channel.
    */
  object LogLevelEnum {
    val ERROR    = "ERROR"
    val WARNING  = "WARNING"
    val INFO     = "INFO"
    val DEBUG    = "DEBUG"
    val DISABLED = "DISABLED"

    val values = js.Object.freeze(js.Array(ERROR, WARNING, INFO, DEBUG, DISABLED))
  }

  /**
    * M2ts Absent Input Audio Behavior
    */
  object M2tsAbsentInputAudioBehaviorEnum {
    val DROP           = "DROP"
    val ENCODE_SILENCE = "ENCODE_SILENCE"

    val values = js.Object.freeze(js.Array(DROP, ENCODE_SILENCE))
  }

  /**
    * M2ts Arib
    */
  object M2tsAribEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * M2ts Arib Captions Pid Control
    */
  object M2tsAribCaptionsPidControlEnum {
    val AUTO           = "AUTO"
    val USE_CONFIGURED = "USE_CONFIGURED"

    val values = js.Object.freeze(js.Array(AUTO, USE_CONFIGURED))
  }

  /**
    * M2ts Audio Buffer Model
    */
  object M2tsAudioBufferModelEnum {
    val ATSC = "ATSC"
    val DVB  = "DVB"

    val values = js.Object.freeze(js.Array(ATSC, DVB))
  }

  /**
    * M2ts Audio Interval
    */
  object M2tsAudioIntervalEnum {
    val VIDEO_AND_FIXED_INTERVALS = "VIDEO_AND_FIXED_INTERVALS"
    val VIDEO_INTERVAL            = "VIDEO_INTERVAL"

    val values = js.Object.freeze(js.Array(VIDEO_AND_FIXED_INTERVALS, VIDEO_INTERVAL))
  }

  /**
    * M2ts Audio Stream Type
    */
  object M2tsAudioStreamTypeEnum {
    val ATSC = "ATSC"
    val DVB  = "DVB"

    val values = js.Object.freeze(js.Array(ATSC, DVB))
  }

  /**
    * M2ts Buffer Model
    */
  object M2tsBufferModelEnum {
    val MULTIPLEX = "MULTIPLEX"
    val NONE      = "NONE"

    val values = js.Object.freeze(js.Array(MULTIPLEX, NONE))
  }

  /**
    * M2ts Cc Descriptor
    */
  object M2tsCcDescriptorEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * M2ts Ebif Control
    */
  object M2tsEbifControlEnum {
    val NONE        = "NONE"
    val PASSTHROUGH = "PASSTHROUGH"

    val values = js.Object.freeze(js.Array(NONE, PASSTHROUGH))
  }

  /**
    * M2ts Ebp Placement
    */
  object M2tsEbpPlacementEnum {
    val VIDEO_AND_AUDIO_PIDS = "VIDEO_AND_AUDIO_PIDS"
    val VIDEO_PID            = "VIDEO_PID"

    val values = js.Object.freeze(js.Array(VIDEO_AND_AUDIO_PIDS, VIDEO_PID))
  }

  /**
    * M2ts Es Rate In Pes
    */
  object M2tsEsRateInPesEnum {
    val EXCLUDE = "EXCLUDE"
    val INCLUDE = "INCLUDE"

    val values = js.Object.freeze(js.Array(EXCLUDE, INCLUDE))
  }

  /**
    * M2ts Klv
    */
  object M2tsKlvEnum {
    val NONE        = "NONE"
    val PASSTHROUGH = "PASSTHROUGH"

    val values = js.Object.freeze(js.Array(NONE, PASSTHROUGH))
  }

  /**
    * M2ts Pcr Control
    */
  object M2tsPcrControlEnum {
    val CONFIGURED_PCR_PERIOD = "CONFIGURED_PCR_PERIOD"
    val PCR_EVERY_PES_PACKET  = "PCR_EVERY_PES_PACKET"

    val values = js.Object.freeze(js.Array(CONFIGURED_PCR_PERIOD, PCR_EVERY_PES_PACKET))
  }

  /**
    * M2ts Rate Mode
    */
  object M2tsRateModeEnum {
    val CBR = "CBR"
    val VBR = "VBR"

    val values = js.Object.freeze(js.Array(CBR, VBR))
  }

  /**
    * M2ts Scte35 Control
    */
  object M2tsScte35ControlEnum {
    val NONE        = "NONE"
    val PASSTHROUGH = "PASSTHROUGH"

    val values = js.Object.freeze(js.Array(NONE, PASSTHROUGH))
  }

  /**
    * M2ts Segmentation Markers
    */
  object M2tsSegmentationMarkersEnum {
    val EBP          = "EBP"
    val EBP_LEGACY   = "EBP_LEGACY"
    val NONE         = "NONE"
    val PSI_SEGSTART = "PSI_SEGSTART"
    val RAI_ADAPT    = "RAI_ADAPT"
    val RAI_SEGSTART = "RAI_SEGSTART"

    val values = js.Object.freeze(js.Array(EBP, EBP_LEGACY, NONE, PSI_SEGSTART, RAI_ADAPT, RAI_SEGSTART))
  }

  /**
    * M2ts Segmentation Style
    */
  object M2tsSegmentationStyleEnum {
    val MAINTAIN_CADENCE = "MAINTAIN_CADENCE"
    val RESET_CADENCE    = "RESET_CADENCE"

    val values = js.Object.freeze(js.Array(MAINTAIN_CADENCE, RESET_CADENCE))
  }

  /**
    * M2ts Settings
    */
  @js.native
  trait M2tsSettings extends js.Object {
    var AbsentInputAudioBehavior: js.UndefOr[M2tsAbsentInputAudioBehavior]
    var Arib: js.UndefOr[M2tsArib]
    var AribCaptionsPid: js.UndefOr[__string]
    var AribCaptionsPidControl: js.UndefOr[M2tsAribCaptionsPidControl]
    var AudioBufferModel: js.UndefOr[M2tsAudioBufferModel]
    var AudioFramesPerPes: js.UndefOr[__integerMin0]
    var AudioPids: js.UndefOr[__string]
    var AudioStreamType: js.UndefOr[M2tsAudioStreamType]
    var Bitrate: js.UndefOr[__integerMin0]
    var BufferModel: js.UndefOr[M2tsBufferModel]
    var CcDescriptor: js.UndefOr[M2tsCcDescriptor]
    var DvbNitSettings: js.UndefOr[DvbNitSettings]
    var DvbSdtSettings: js.UndefOr[DvbSdtSettings]
    var DvbSubPids: js.UndefOr[__string]
    var DvbTdtSettings: js.UndefOr[DvbTdtSettings]
    var DvbTeletextPid: js.UndefOr[__string]
    var Ebif: js.UndefOr[M2tsEbifControl]
    var EbpAudioInterval: js.UndefOr[M2tsAudioInterval]
    var EbpLookaheadMs: js.UndefOr[__integerMin0Max10000]
    var EbpPlacement: js.UndefOr[M2tsEbpPlacement]
    var EcmPid: js.UndefOr[__string]
    var EsRateInPes: js.UndefOr[M2tsEsRateInPes]
    var EtvPlatformPid: js.UndefOr[__string]
    var EtvSignalPid: js.UndefOr[__string]
    var FragmentTime: js.UndefOr[__doubleMin0]
    var Klv: js.UndefOr[M2tsKlv]
    var KlvDataPids: js.UndefOr[__string]
    var NullPacketBitrate: js.UndefOr[__doubleMin0]
    var PatInterval: js.UndefOr[__integerMin0Max1000]
    var PcrControl: js.UndefOr[M2tsPcrControl]
    var PcrPeriod: js.UndefOr[__integerMin0Max500]
    var PcrPid: js.UndefOr[__string]
    var PmtInterval: js.UndefOr[__integerMin0Max1000]
    var PmtPid: js.UndefOr[__string]
    var ProgramNum: js.UndefOr[__integerMin0Max65535]
    var RateMode: js.UndefOr[M2tsRateMode]
    var Scte27Pids: js.UndefOr[__string]
    var Scte35Control: js.UndefOr[M2tsScte35Control]
    var Scte35Pid: js.UndefOr[__string]
    var SegmentationMarkers: js.UndefOr[M2tsSegmentationMarkers]
    var SegmentationStyle: js.UndefOr[M2tsSegmentationStyle]
    var SegmentationTime: js.UndefOr[__doubleMin1]
    var TimedMetadataBehavior: js.UndefOr[M2tsTimedMetadataBehavior]
    var TimedMetadataPid: js.UndefOr[__string]
    var TransportStreamId: js.UndefOr[__integerMin0Max65535]
    var VideoPid: js.UndefOr[__string]
  }

  object M2tsSettings {
    @inline
    def apply(
        AbsentInputAudioBehavior: js.UndefOr[M2tsAbsentInputAudioBehavior] = js.undefined,
        Arib: js.UndefOr[M2tsArib] = js.undefined,
        AribCaptionsPid: js.UndefOr[__string] = js.undefined,
        AribCaptionsPidControl: js.UndefOr[M2tsAribCaptionsPidControl] = js.undefined,
        AudioBufferModel: js.UndefOr[M2tsAudioBufferModel] = js.undefined,
        AudioFramesPerPes: js.UndefOr[__integerMin0] = js.undefined,
        AudioPids: js.UndefOr[__string] = js.undefined,
        AudioStreamType: js.UndefOr[M2tsAudioStreamType] = js.undefined,
        Bitrate: js.UndefOr[__integerMin0] = js.undefined,
        BufferModel: js.UndefOr[M2tsBufferModel] = js.undefined,
        CcDescriptor: js.UndefOr[M2tsCcDescriptor] = js.undefined,
        DvbNitSettings: js.UndefOr[DvbNitSettings] = js.undefined,
        DvbSdtSettings: js.UndefOr[DvbSdtSettings] = js.undefined,
        DvbSubPids: js.UndefOr[__string] = js.undefined,
        DvbTdtSettings: js.UndefOr[DvbTdtSettings] = js.undefined,
        DvbTeletextPid: js.UndefOr[__string] = js.undefined,
        Ebif: js.UndefOr[M2tsEbifControl] = js.undefined,
        EbpAudioInterval: js.UndefOr[M2tsAudioInterval] = js.undefined,
        EbpLookaheadMs: js.UndefOr[__integerMin0Max10000] = js.undefined,
        EbpPlacement: js.UndefOr[M2tsEbpPlacement] = js.undefined,
        EcmPid: js.UndefOr[__string] = js.undefined,
        EsRateInPes: js.UndefOr[M2tsEsRateInPes] = js.undefined,
        EtvPlatformPid: js.UndefOr[__string] = js.undefined,
        EtvSignalPid: js.UndefOr[__string] = js.undefined,
        FragmentTime: js.UndefOr[__doubleMin0] = js.undefined,
        Klv: js.UndefOr[M2tsKlv] = js.undefined,
        KlvDataPids: js.UndefOr[__string] = js.undefined,
        NullPacketBitrate: js.UndefOr[__doubleMin0] = js.undefined,
        PatInterval: js.UndefOr[__integerMin0Max1000] = js.undefined,
        PcrControl: js.UndefOr[M2tsPcrControl] = js.undefined,
        PcrPeriod: js.UndefOr[__integerMin0Max500] = js.undefined,
        PcrPid: js.UndefOr[__string] = js.undefined,
        PmtInterval: js.UndefOr[__integerMin0Max1000] = js.undefined,
        PmtPid: js.UndefOr[__string] = js.undefined,
        ProgramNum: js.UndefOr[__integerMin0Max65535] = js.undefined,
        RateMode: js.UndefOr[M2tsRateMode] = js.undefined,
        Scte27Pids: js.UndefOr[__string] = js.undefined,
        Scte35Control: js.UndefOr[M2tsScte35Control] = js.undefined,
        Scte35Pid: js.UndefOr[__string] = js.undefined,
        SegmentationMarkers: js.UndefOr[M2tsSegmentationMarkers] = js.undefined,
        SegmentationStyle: js.UndefOr[M2tsSegmentationStyle] = js.undefined,
        SegmentationTime: js.UndefOr[__doubleMin1] = js.undefined,
        TimedMetadataBehavior: js.UndefOr[M2tsTimedMetadataBehavior] = js.undefined,
        TimedMetadataPid: js.UndefOr[__string] = js.undefined,
        TransportStreamId: js.UndefOr[__integerMin0Max65535] = js.undefined,
        VideoPid: js.UndefOr[__string] = js.undefined
    ): M2tsSettings = {
      val __obj = js.Dynamic.literal()
      AbsentInputAudioBehavior.foreach(__v => __obj.updateDynamic("AbsentInputAudioBehavior")(__v.asInstanceOf[js.Any]))
      Arib.foreach(__v => __obj.updateDynamic("Arib")(__v.asInstanceOf[js.Any]))
      AribCaptionsPid.foreach(__v => __obj.updateDynamic("AribCaptionsPid")(__v.asInstanceOf[js.Any]))
      AribCaptionsPidControl.foreach(__v => __obj.updateDynamic("AribCaptionsPidControl")(__v.asInstanceOf[js.Any]))
      AudioBufferModel.foreach(__v => __obj.updateDynamic("AudioBufferModel")(__v.asInstanceOf[js.Any]))
      AudioFramesPerPes.foreach(__v => __obj.updateDynamic("AudioFramesPerPes")(__v.asInstanceOf[js.Any]))
      AudioPids.foreach(__v => __obj.updateDynamic("AudioPids")(__v.asInstanceOf[js.Any]))
      AudioStreamType.foreach(__v => __obj.updateDynamic("AudioStreamType")(__v.asInstanceOf[js.Any]))
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      BufferModel.foreach(__v => __obj.updateDynamic("BufferModel")(__v.asInstanceOf[js.Any]))
      CcDescriptor.foreach(__v => __obj.updateDynamic("CcDescriptor")(__v.asInstanceOf[js.Any]))
      DvbNitSettings.foreach(__v => __obj.updateDynamic("DvbNitSettings")(__v.asInstanceOf[js.Any]))
      DvbSdtSettings.foreach(__v => __obj.updateDynamic("DvbSdtSettings")(__v.asInstanceOf[js.Any]))
      DvbSubPids.foreach(__v => __obj.updateDynamic("DvbSubPids")(__v.asInstanceOf[js.Any]))
      DvbTdtSettings.foreach(__v => __obj.updateDynamic("DvbTdtSettings")(__v.asInstanceOf[js.Any]))
      DvbTeletextPid.foreach(__v => __obj.updateDynamic("DvbTeletextPid")(__v.asInstanceOf[js.Any]))
      Ebif.foreach(__v => __obj.updateDynamic("Ebif")(__v.asInstanceOf[js.Any]))
      EbpAudioInterval.foreach(__v => __obj.updateDynamic("EbpAudioInterval")(__v.asInstanceOf[js.Any]))
      EbpLookaheadMs.foreach(__v => __obj.updateDynamic("EbpLookaheadMs")(__v.asInstanceOf[js.Any]))
      EbpPlacement.foreach(__v => __obj.updateDynamic("EbpPlacement")(__v.asInstanceOf[js.Any]))
      EcmPid.foreach(__v => __obj.updateDynamic("EcmPid")(__v.asInstanceOf[js.Any]))
      EsRateInPes.foreach(__v => __obj.updateDynamic("EsRateInPes")(__v.asInstanceOf[js.Any]))
      EtvPlatformPid.foreach(__v => __obj.updateDynamic("EtvPlatformPid")(__v.asInstanceOf[js.Any]))
      EtvSignalPid.foreach(__v => __obj.updateDynamic("EtvSignalPid")(__v.asInstanceOf[js.Any]))
      FragmentTime.foreach(__v => __obj.updateDynamic("FragmentTime")(__v.asInstanceOf[js.Any]))
      Klv.foreach(__v => __obj.updateDynamic("Klv")(__v.asInstanceOf[js.Any]))
      KlvDataPids.foreach(__v => __obj.updateDynamic("KlvDataPids")(__v.asInstanceOf[js.Any]))
      NullPacketBitrate.foreach(__v => __obj.updateDynamic("NullPacketBitrate")(__v.asInstanceOf[js.Any]))
      PatInterval.foreach(__v => __obj.updateDynamic("PatInterval")(__v.asInstanceOf[js.Any]))
      PcrControl.foreach(__v => __obj.updateDynamic("PcrControl")(__v.asInstanceOf[js.Any]))
      PcrPeriod.foreach(__v => __obj.updateDynamic("PcrPeriod")(__v.asInstanceOf[js.Any]))
      PcrPid.foreach(__v => __obj.updateDynamic("PcrPid")(__v.asInstanceOf[js.Any]))
      PmtInterval.foreach(__v => __obj.updateDynamic("PmtInterval")(__v.asInstanceOf[js.Any]))
      PmtPid.foreach(__v => __obj.updateDynamic("PmtPid")(__v.asInstanceOf[js.Any]))
      ProgramNum.foreach(__v => __obj.updateDynamic("ProgramNum")(__v.asInstanceOf[js.Any]))
      RateMode.foreach(__v => __obj.updateDynamic("RateMode")(__v.asInstanceOf[js.Any]))
      Scte27Pids.foreach(__v => __obj.updateDynamic("Scte27Pids")(__v.asInstanceOf[js.Any]))
      Scte35Control.foreach(__v => __obj.updateDynamic("Scte35Control")(__v.asInstanceOf[js.Any]))
      Scte35Pid.foreach(__v => __obj.updateDynamic("Scte35Pid")(__v.asInstanceOf[js.Any]))
      SegmentationMarkers.foreach(__v => __obj.updateDynamic("SegmentationMarkers")(__v.asInstanceOf[js.Any]))
      SegmentationStyle.foreach(__v => __obj.updateDynamic("SegmentationStyle")(__v.asInstanceOf[js.Any]))
      SegmentationTime.foreach(__v => __obj.updateDynamic("SegmentationTime")(__v.asInstanceOf[js.Any]))
      TimedMetadataBehavior.foreach(__v => __obj.updateDynamic("TimedMetadataBehavior")(__v.asInstanceOf[js.Any]))
      TimedMetadataPid.foreach(__v => __obj.updateDynamic("TimedMetadataPid")(__v.asInstanceOf[js.Any]))
      TransportStreamId.foreach(__v => __obj.updateDynamic("TransportStreamId")(__v.asInstanceOf[js.Any]))
      VideoPid.foreach(__v => __obj.updateDynamic("VideoPid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[M2tsSettings]
    }
  }

  /**
    * M2ts Timed Metadata Behavior
    */
  object M2tsTimedMetadataBehaviorEnum {
    val NO_PASSTHROUGH = "NO_PASSTHROUGH"
    val PASSTHROUGH    = "PASSTHROUGH"

    val values = js.Object.freeze(js.Array(NO_PASSTHROUGH, PASSTHROUGH))
  }

  /**
    * M3u8 Pcr Control
    */
  object M3u8PcrControlEnum {
    val CONFIGURED_PCR_PERIOD = "CONFIGURED_PCR_PERIOD"
    val PCR_EVERY_PES_PACKET  = "PCR_EVERY_PES_PACKET"

    val values = js.Object.freeze(js.Array(CONFIGURED_PCR_PERIOD, PCR_EVERY_PES_PACKET))
  }

  /**
    * M3u8 Scte35 Behavior
    */
  object M3u8Scte35BehaviorEnum {
    val NO_PASSTHROUGH = "NO_PASSTHROUGH"
    val PASSTHROUGH    = "PASSTHROUGH"

    val values = js.Object.freeze(js.Array(NO_PASSTHROUGH, PASSTHROUGH))
  }

  /**
    * Settings information for the .m3u8 container
    */
  @js.native
  trait M3u8Settings extends js.Object {
    var AudioFramesPerPes: js.UndefOr[__integerMin0]
    var AudioPids: js.UndefOr[__string]
    var EcmPid: js.UndefOr[__string]
    var PatInterval: js.UndefOr[__integerMin0Max1000]
    var PcrControl: js.UndefOr[M3u8PcrControl]
    var PcrPeriod: js.UndefOr[__integerMin0Max500]
    var PcrPid: js.UndefOr[__string]
    var PmtInterval: js.UndefOr[__integerMin0Max1000]
    var PmtPid: js.UndefOr[__string]
    var ProgramNum: js.UndefOr[__integerMin0Max65535]
    var Scte35Behavior: js.UndefOr[M3u8Scte35Behavior]
    var Scte35Pid: js.UndefOr[__string]
    var TimedMetadataBehavior: js.UndefOr[M3u8TimedMetadataBehavior]
    var TimedMetadataPid: js.UndefOr[__string]
    var TransportStreamId: js.UndefOr[__integerMin0Max65535]
    var VideoPid: js.UndefOr[__string]
  }

  object M3u8Settings {
    @inline
    def apply(
        AudioFramesPerPes: js.UndefOr[__integerMin0] = js.undefined,
        AudioPids: js.UndefOr[__string] = js.undefined,
        EcmPid: js.UndefOr[__string] = js.undefined,
        PatInterval: js.UndefOr[__integerMin0Max1000] = js.undefined,
        PcrControl: js.UndefOr[M3u8PcrControl] = js.undefined,
        PcrPeriod: js.UndefOr[__integerMin0Max500] = js.undefined,
        PcrPid: js.UndefOr[__string] = js.undefined,
        PmtInterval: js.UndefOr[__integerMin0Max1000] = js.undefined,
        PmtPid: js.UndefOr[__string] = js.undefined,
        ProgramNum: js.UndefOr[__integerMin0Max65535] = js.undefined,
        Scte35Behavior: js.UndefOr[M3u8Scte35Behavior] = js.undefined,
        Scte35Pid: js.UndefOr[__string] = js.undefined,
        TimedMetadataBehavior: js.UndefOr[M3u8TimedMetadataBehavior] = js.undefined,
        TimedMetadataPid: js.UndefOr[__string] = js.undefined,
        TransportStreamId: js.UndefOr[__integerMin0Max65535] = js.undefined,
        VideoPid: js.UndefOr[__string] = js.undefined
    ): M3u8Settings = {
      val __obj = js.Dynamic.literal()
      AudioFramesPerPes.foreach(__v => __obj.updateDynamic("AudioFramesPerPes")(__v.asInstanceOf[js.Any]))
      AudioPids.foreach(__v => __obj.updateDynamic("AudioPids")(__v.asInstanceOf[js.Any]))
      EcmPid.foreach(__v => __obj.updateDynamic("EcmPid")(__v.asInstanceOf[js.Any]))
      PatInterval.foreach(__v => __obj.updateDynamic("PatInterval")(__v.asInstanceOf[js.Any]))
      PcrControl.foreach(__v => __obj.updateDynamic("PcrControl")(__v.asInstanceOf[js.Any]))
      PcrPeriod.foreach(__v => __obj.updateDynamic("PcrPeriod")(__v.asInstanceOf[js.Any]))
      PcrPid.foreach(__v => __obj.updateDynamic("PcrPid")(__v.asInstanceOf[js.Any]))
      PmtInterval.foreach(__v => __obj.updateDynamic("PmtInterval")(__v.asInstanceOf[js.Any]))
      PmtPid.foreach(__v => __obj.updateDynamic("PmtPid")(__v.asInstanceOf[js.Any]))
      ProgramNum.foreach(__v => __obj.updateDynamic("ProgramNum")(__v.asInstanceOf[js.Any]))
      Scte35Behavior.foreach(__v => __obj.updateDynamic("Scte35Behavior")(__v.asInstanceOf[js.Any]))
      Scte35Pid.foreach(__v => __obj.updateDynamic("Scte35Pid")(__v.asInstanceOf[js.Any]))
      TimedMetadataBehavior.foreach(__v => __obj.updateDynamic("TimedMetadataBehavior")(__v.asInstanceOf[js.Any]))
      TimedMetadataPid.foreach(__v => __obj.updateDynamic("TimedMetadataPid")(__v.asInstanceOf[js.Any]))
      TransportStreamId.foreach(__v => __obj.updateDynamic("TransportStreamId")(__v.asInstanceOf[js.Any]))
      VideoPid.foreach(__v => __obj.updateDynamic("VideoPid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[M3u8Settings]
    }
  }

  /**
    * M3u8 Timed Metadata Behavior
    */
  object M3u8TimedMetadataBehaviorEnum {
    val NO_PASSTHROUGH = "NO_PASSTHROUGH"
    val PASSTHROUGH    = "PASSTHROUGH"

    val values = js.Object.freeze(js.Array(NO_PASSTHROUGH, PASSTHROUGH))
  }

  /**
    * The settings for a MediaConnect Flow.
    */
  @js.native
  trait MediaConnectFlow extends js.Object {
    var FlowArn: js.UndefOr[__string]
  }

  object MediaConnectFlow {
    @inline
    def apply(
        FlowArn: js.UndefOr[__string] = js.undefined
    ): MediaConnectFlow = {
      val __obj = js.Dynamic.literal()
      FlowArn.foreach(__v => __obj.updateDynamic("FlowArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MediaConnectFlow]
    }
  }

  /**
    * The settings for a MediaConnect Flow.
    */
  @js.native
  trait MediaConnectFlowRequest extends js.Object {
    var FlowArn: js.UndefOr[__string]
  }

  object MediaConnectFlowRequest {
    @inline
    def apply(
        FlowArn: js.UndefOr[__string] = js.undefined
    ): MediaConnectFlowRequest = {
      val __obj = js.Dynamic.literal()
      FlowArn.foreach(__v => __obj.updateDynamic("FlowArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MediaConnectFlowRequest]
    }
  }

  /**
    * Media Package Group Settings
    */
  @js.native
  trait MediaPackageGroupSettings extends js.Object {
    var Destination: OutputLocationRef
  }

  object MediaPackageGroupSettings {
    @inline
    def apply(
        Destination: OutputLocationRef
    ): MediaPackageGroupSettings = {
      val __obj = js.Dynamic.literal(
        "Destination" -> Destination.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MediaPackageGroupSettings]
    }
  }

  /**
    * MediaPackage Output Destination Settings
    */
  @js.native
  trait MediaPackageOutputDestinationSettings extends js.Object {
    var ChannelId: js.UndefOr[__stringMin1]
  }

  object MediaPackageOutputDestinationSettings {
    @inline
    def apply(
        ChannelId: js.UndefOr[__stringMin1] = js.undefined
    ): MediaPackageOutputDestinationSettings = {
      val __obj = js.Dynamic.literal()
      ChannelId.foreach(__v => __obj.updateDynamic("ChannelId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MediaPackageOutputDestinationSettings]
    }
  }

  /**
    * Media Package Output Settings
    */
  @js.native
  trait MediaPackageOutputSettings extends js.Object {}

  object MediaPackageOutputSettings {
    @inline
    def apply(
        ): MediaPackageOutputSettings = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[MediaPackageOutputSettings]
    }
  }

  /**
    * Mp2 Coding Mode
    */
  object Mp2CodingModeEnum {
    val CODING_MODE_1_0 = "CODING_MODE_1_0"
    val CODING_MODE_2_0 = "CODING_MODE_2_0"

    val values = js.Object.freeze(js.Array(CODING_MODE_1_0, CODING_MODE_2_0))
  }

  /**
    * Mp2 Settings
    */
  @js.native
  trait Mp2Settings extends js.Object {
    var Bitrate: js.UndefOr[__double]
    var CodingMode: js.UndefOr[Mp2CodingMode]
    var SampleRate: js.UndefOr[__double]
  }

  object Mp2Settings {
    @inline
    def apply(
        Bitrate: js.UndefOr[__double] = js.undefined,
        CodingMode: js.UndefOr[Mp2CodingMode] = js.undefined,
        SampleRate: js.UndefOr[__double] = js.undefined
    ): Mp2Settings = {
      val __obj = js.Dynamic.literal()
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      CodingMode.foreach(__v => __obj.updateDynamic("CodingMode")(__v.asInstanceOf[js.Any]))
      SampleRate.foreach(__v => __obj.updateDynamic("SampleRate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Mp2Settings]
    }
  }

  /**
    * Ms Smooth Group Settings
    */
  @js.native
  trait MsSmoothGroupSettings extends js.Object {
    var Destination: OutputLocationRef
    var AcquisitionPointId: js.UndefOr[__string]
    var AudioOnlyTimecodeControl: js.UndefOr[SmoothGroupAudioOnlyTimecodeControl]
    var CertificateMode: js.UndefOr[SmoothGroupCertificateMode]
    var ConnectionRetryInterval: js.UndefOr[__integerMin0]
    var EventId: js.UndefOr[__string]
    var EventIdMode: js.UndefOr[SmoothGroupEventIdMode]
    var EventStopBehavior: js.UndefOr[SmoothGroupEventStopBehavior]
    var FilecacheDuration: js.UndefOr[__integerMin0]
    var FragmentLength: js.UndefOr[__integerMin1]
    var InputLossAction: js.UndefOr[InputLossActionForMsSmoothOut]
    var NumRetries: js.UndefOr[__integerMin0]
    var RestartDelay: js.UndefOr[__integerMin0]
    var SegmentationMode: js.UndefOr[SmoothGroupSegmentationMode]
    var SendDelayMs: js.UndefOr[__integerMin0Max10000]
    var SparseTrackType: js.UndefOr[SmoothGroupSparseTrackType]
    var StreamManifestBehavior: js.UndefOr[SmoothGroupStreamManifestBehavior]
    var TimestampOffset: js.UndefOr[__string]
    var TimestampOffsetMode: js.UndefOr[SmoothGroupTimestampOffsetMode]
  }

  object MsSmoothGroupSettings {
    @inline
    def apply(
        Destination: OutputLocationRef,
        AcquisitionPointId: js.UndefOr[__string] = js.undefined,
        AudioOnlyTimecodeControl: js.UndefOr[SmoothGroupAudioOnlyTimecodeControl] = js.undefined,
        CertificateMode: js.UndefOr[SmoothGroupCertificateMode] = js.undefined,
        ConnectionRetryInterval: js.UndefOr[__integerMin0] = js.undefined,
        EventId: js.UndefOr[__string] = js.undefined,
        EventIdMode: js.UndefOr[SmoothGroupEventIdMode] = js.undefined,
        EventStopBehavior: js.UndefOr[SmoothGroupEventStopBehavior] = js.undefined,
        FilecacheDuration: js.UndefOr[__integerMin0] = js.undefined,
        FragmentLength: js.UndefOr[__integerMin1] = js.undefined,
        InputLossAction: js.UndefOr[InputLossActionForMsSmoothOut] = js.undefined,
        NumRetries: js.UndefOr[__integerMin0] = js.undefined,
        RestartDelay: js.UndefOr[__integerMin0] = js.undefined,
        SegmentationMode: js.UndefOr[SmoothGroupSegmentationMode] = js.undefined,
        SendDelayMs: js.UndefOr[__integerMin0Max10000] = js.undefined,
        SparseTrackType: js.UndefOr[SmoothGroupSparseTrackType] = js.undefined,
        StreamManifestBehavior: js.UndefOr[SmoothGroupStreamManifestBehavior] = js.undefined,
        TimestampOffset: js.UndefOr[__string] = js.undefined,
        TimestampOffsetMode: js.UndefOr[SmoothGroupTimestampOffsetMode] = js.undefined
    ): MsSmoothGroupSettings = {
      val __obj = js.Dynamic.literal(
        "Destination" -> Destination.asInstanceOf[js.Any]
      )

      AcquisitionPointId.foreach(__v => __obj.updateDynamic("AcquisitionPointId")(__v.asInstanceOf[js.Any]))
      AudioOnlyTimecodeControl.foreach(__v => __obj.updateDynamic("AudioOnlyTimecodeControl")(__v.asInstanceOf[js.Any]))
      CertificateMode.foreach(__v => __obj.updateDynamic("CertificateMode")(__v.asInstanceOf[js.Any]))
      ConnectionRetryInterval.foreach(__v => __obj.updateDynamic("ConnectionRetryInterval")(__v.asInstanceOf[js.Any]))
      EventId.foreach(__v => __obj.updateDynamic("EventId")(__v.asInstanceOf[js.Any]))
      EventIdMode.foreach(__v => __obj.updateDynamic("EventIdMode")(__v.asInstanceOf[js.Any]))
      EventStopBehavior.foreach(__v => __obj.updateDynamic("EventStopBehavior")(__v.asInstanceOf[js.Any]))
      FilecacheDuration.foreach(__v => __obj.updateDynamic("FilecacheDuration")(__v.asInstanceOf[js.Any]))
      FragmentLength.foreach(__v => __obj.updateDynamic("FragmentLength")(__v.asInstanceOf[js.Any]))
      InputLossAction.foreach(__v => __obj.updateDynamic("InputLossAction")(__v.asInstanceOf[js.Any]))
      NumRetries.foreach(__v => __obj.updateDynamic("NumRetries")(__v.asInstanceOf[js.Any]))
      RestartDelay.foreach(__v => __obj.updateDynamic("RestartDelay")(__v.asInstanceOf[js.Any]))
      SegmentationMode.foreach(__v => __obj.updateDynamic("SegmentationMode")(__v.asInstanceOf[js.Any]))
      SendDelayMs.foreach(__v => __obj.updateDynamic("SendDelayMs")(__v.asInstanceOf[js.Any]))
      SparseTrackType.foreach(__v => __obj.updateDynamic("SparseTrackType")(__v.asInstanceOf[js.Any]))
      StreamManifestBehavior.foreach(__v => __obj.updateDynamic("StreamManifestBehavior")(__v.asInstanceOf[js.Any]))
      TimestampOffset.foreach(__v => __obj.updateDynamic("TimestampOffset")(__v.asInstanceOf[js.Any]))
      TimestampOffsetMode.foreach(__v => __obj.updateDynamic("TimestampOffsetMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MsSmoothGroupSettings]
    }
  }

  /**
    * Ms Smooth Output Settings
    */
  @js.native
  trait MsSmoothOutputSettings extends js.Object {
    var NameModifier: js.UndefOr[__string]
  }

  object MsSmoothOutputSettings {
    @inline
    def apply(
        NameModifier: js.UndefOr[__string] = js.undefined
    ): MsSmoothOutputSettings = {
      val __obj = js.Dynamic.literal()
      NameModifier.foreach(__v => __obj.updateDynamic("NameModifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MsSmoothOutputSettings]
    }
  }

  /**
    * Network Input Server Validation
    */
  object NetworkInputServerValidationEnum {
    val CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME = "CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME"
    val CHECK_CRYPTOGRAPHY_ONLY              = "CHECK_CRYPTOGRAPHY_ONLY"

    val values = js.Object.freeze(js.Array(CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME, CHECK_CRYPTOGRAPHY_ONLY))
  }

  /**
    * Network source to transcode. Must be accessible to the Elemental Live node that is running the live event through a network connection.
    */
  @js.native
  trait NetworkInputSettings extends js.Object {
    var HlsInputSettings: js.UndefOr[HlsInputSettings]
    var ServerValidation: js.UndefOr[NetworkInputServerValidation]
  }

  object NetworkInputSettings {
    @inline
    def apply(
        HlsInputSettings: js.UndefOr[HlsInputSettings] = js.undefined,
        ServerValidation: js.UndefOr[NetworkInputServerValidation] = js.undefined
    ): NetworkInputSettings = {
      val __obj = js.Dynamic.literal()
      HlsInputSettings.foreach(__v => __obj.updateDynamic("HlsInputSettings")(__v.asInstanceOf[js.Any]))
      ServerValidation.foreach(__v => __obj.updateDynamic("ServerValidation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkInputSettings]
    }
  }

  /**
    * Reserved resources available for purchase
    */
  @js.native
  trait Offering extends js.Object {
    var Arn: js.UndefOr[__string]
    var CurrencyCode: js.UndefOr[__string]
    var Duration: js.UndefOr[__integer]
    var DurationUnits: js.UndefOr[OfferingDurationUnits]
    var FixedPrice: js.UndefOr[__double]
    var OfferingDescription: js.UndefOr[__string]
    var OfferingId: js.UndefOr[__string]
    var OfferingType: js.UndefOr[OfferingType]
    var Region: js.UndefOr[__string]
    var ResourceSpecification: js.UndefOr[ReservationResourceSpecification]
    var UsagePrice: js.UndefOr[__double]
  }

  object Offering {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CurrencyCode: js.UndefOr[__string] = js.undefined,
        Duration: js.UndefOr[__integer] = js.undefined,
        DurationUnits: js.UndefOr[OfferingDurationUnits] = js.undefined,
        FixedPrice: js.UndefOr[__double] = js.undefined,
        OfferingDescription: js.UndefOr[__string] = js.undefined,
        OfferingId: js.UndefOr[__string] = js.undefined,
        OfferingType: js.UndefOr[OfferingType] = js.undefined,
        Region: js.UndefOr[__string] = js.undefined,
        ResourceSpecification: js.UndefOr[ReservationResourceSpecification] = js.undefined,
        UsagePrice: js.UndefOr[__double] = js.undefined
    ): Offering = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      DurationUnits.foreach(__v => __obj.updateDynamic("DurationUnits")(__v.asInstanceOf[js.Any]))
      FixedPrice.foreach(__v => __obj.updateDynamic("FixedPrice")(__v.asInstanceOf[js.Any]))
      OfferingDescription.foreach(__v => __obj.updateDynamic("OfferingDescription")(__v.asInstanceOf[js.Any]))
      OfferingId.foreach(__v => __obj.updateDynamic("OfferingId")(__v.asInstanceOf[js.Any]))
      OfferingType.foreach(__v => __obj.updateDynamic("OfferingType")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      ResourceSpecification.foreach(__v => __obj.updateDynamic("ResourceSpecification")(__v.asInstanceOf[js.Any]))
      UsagePrice.foreach(__v => __obj.updateDynamic("UsagePrice")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Offering]
    }
  }

  /**
    * Units for duration, e.g. 'MONTHS'
    */
  object OfferingDurationUnitsEnum {
    val MONTHS = "MONTHS"

    val values = js.Object.freeze(js.Array(MONTHS))
  }

  /**
    * Offering type, e.g. 'NO_UPFRONT'
    */
  object OfferingTypeEnum {
    val NO_UPFRONT = "NO_UPFRONT"

    val values = js.Object.freeze(js.Array(NO_UPFRONT))
  }

  /**
    * Output settings. There can be multiple outputs within a group.
    */
  @js.native
  trait Output extends js.Object {
    var OutputSettings: OutputSettings
    var AudioDescriptionNames: js.UndefOr[__listOf__string]
    var CaptionDescriptionNames: js.UndefOr[__listOf__string]
    var OutputName: js.UndefOr[__stringMin1Max255]
    var VideoDescriptionName: js.UndefOr[__string]
  }

  object Output {
    @inline
    def apply(
        OutputSettings: OutputSettings,
        AudioDescriptionNames: js.UndefOr[__listOf__string] = js.undefined,
        CaptionDescriptionNames: js.UndefOr[__listOf__string] = js.undefined,
        OutputName: js.UndefOr[__stringMin1Max255] = js.undefined,
        VideoDescriptionName: js.UndefOr[__string] = js.undefined
    ): Output = {
      val __obj = js.Dynamic.literal(
        "OutputSettings" -> OutputSettings.asInstanceOf[js.Any]
      )

      AudioDescriptionNames.foreach(__v => __obj.updateDynamic("AudioDescriptionNames")(__v.asInstanceOf[js.Any]))
      CaptionDescriptionNames.foreach(__v => __obj.updateDynamic("CaptionDescriptionNames")(__v.asInstanceOf[js.Any]))
      OutputName.foreach(__v => __obj.updateDynamic("OutputName")(__v.asInstanceOf[js.Any]))
      VideoDescriptionName.foreach(__v => __obj.updateDynamic("VideoDescriptionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Output]
    }
  }

  /**
    * Placeholder documentation for OutputDestination
    */
  @js.native
  trait OutputDestination extends js.Object {
    var Id: js.UndefOr[__string]
    var MediaPackageSettings: js.UndefOr[__listOfMediaPackageOutputDestinationSettings]
    var Settings: js.UndefOr[__listOfOutputDestinationSettings]
  }

  object OutputDestination {
    @inline
    def apply(
        Id: js.UndefOr[__string] = js.undefined,
        MediaPackageSettings: js.UndefOr[__listOfMediaPackageOutputDestinationSettings] = js.undefined,
        Settings: js.UndefOr[__listOfOutputDestinationSettings] = js.undefined
    ): OutputDestination = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      MediaPackageSettings.foreach(__v => __obj.updateDynamic("MediaPackageSettings")(__v.asInstanceOf[js.Any]))
      Settings.foreach(__v => __obj.updateDynamic("Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputDestination]
    }
  }

  /**
    * Placeholder documentation for OutputDestinationSettings
    */
  @js.native
  trait OutputDestinationSettings extends js.Object {
    var PasswordParam: js.UndefOr[__string]
    var StreamName: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
    var Username: js.UndefOr[__string]
  }

  object OutputDestinationSettings {
    @inline
    def apply(
        PasswordParam: js.UndefOr[__string] = js.undefined,
        StreamName: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined,
        Username: js.UndefOr[__string] = js.undefined
    ): OutputDestinationSettings = {
      val __obj = js.Dynamic.literal()
      PasswordParam.foreach(__v => __obj.updateDynamic("PasswordParam")(__v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputDestinationSettings]
    }
  }

  /**
    * Output groups for this Live Event. Output groups contain information about where streams should be distributed.
    */
  @js.native
  trait OutputGroup extends js.Object {
    var OutputGroupSettings: OutputGroupSettings
    var Outputs: __listOfOutput
    var Name: js.UndefOr[__stringMax32]
  }

  object OutputGroup {
    @inline
    def apply(
        OutputGroupSettings: OutputGroupSettings,
        Outputs: __listOfOutput,
        Name: js.UndefOr[__stringMax32] = js.undefined
    ): OutputGroup = {
      val __obj = js.Dynamic.literal(
        "OutputGroupSettings" -> OutputGroupSettings.asInstanceOf[js.Any],
        "Outputs"             -> Outputs.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputGroup]
    }
  }

  /**
    * Output Group Settings
    */
  @js.native
  trait OutputGroupSettings extends js.Object {
    var ArchiveGroupSettings: js.UndefOr[ArchiveGroupSettings]
    var FrameCaptureGroupSettings: js.UndefOr[FrameCaptureGroupSettings]
    var HlsGroupSettings: js.UndefOr[HlsGroupSettings]
    var MediaPackageGroupSettings: js.UndefOr[MediaPackageGroupSettings]
    var MsSmoothGroupSettings: js.UndefOr[MsSmoothGroupSettings]
    var RtmpGroupSettings: js.UndefOr[RtmpGroupSettings]
    var UdpGroupSettings: js.UndefOr[UdpGroupSettings]
  }

  object OutputGroupSettings {
    @inline
    def apply(
        ArchiveGroupSettings: js.UndefOr[ArchiveGroupSettings] = js.undefined,
        FrameCaptureGroupSettings: js.UndefOr[FrameCaptureGroupSettings] = js.undefined,
        HlsGroupSettings: js.UndefOr[HlsGroupSettings] = js.undefined,
        MediaPackageGroupSettings: js.UndefOr[MediaPackageGroupSettings] = js.undefined,
        MsSmoothGroupSettings: js.UndefOr[MsSmoothGroupSettings] = js.undefined,
        RtmpGroupSettings: js.UndefOr[RtmpGroupSettings] = js.undefined,
        UdpGroupSettings: js.UndefOr[UdpGroupSettings] = js.undefined
    ): OutputGroupSettings = {
      val __obj = js.Dynamic.literal()
      ArchiveGroupSettings.foreach(__v => __obj.updateDynamic("ArchiveGroupSettings")(__v.asInstanceOf[js.Any]))
      FrameCaptureGroupSettings.foreach(
        __v => __obj.updateDynamic("FrameCaptureGroupSettings")(__v.asInstanceOf[js.Any])
      )
      HlsGroupSettings.foreach(__v => __obj.updateDynamic("HlsGroupSettings")(__v.asInstanceOf[js.Any]))
      MediaPackageGroupSettings.foreach(
        __v => __obj.updateDynamic("MediaPackageGroupSettings")(__v.asInstanceOf[js.Any])
      )
      MsSmoothGroupSettings.foreach(__v => __obj.updateDynamic("MsSmoothGroupSettings")(__v.asInstanceOf[js.Any]))
      RtmpGroupSettings.foreach(__v => __obj.updateDynamic("RtmpGroupSettings")(__v.asInstanceOf[js.Any]))
      UdpGroupSettings.foreach(__v => __obj.updateDynamic("UdpGroupSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputGroupSettings]
    }
  }

  /**
    * Reference to an OutputDestination ID defined in the channel
    */
  @js.native
  trait OutputLocationRef extends js.Object {
    var DestinationRefId: js.UndefOr[__string]
  }

  object OutputLocationRef {
    @inline
    def apply(
        DestinationRefId: js.UndefOr[__string] = js.undefined
    ): OutputLocationRef = {
      val __obj = js.Dynamic.literal()
      DestinationRefId.foreach(__v => __obj.updateDynamic("DestinationRefId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputLocationRef]
    }
  }

  /**
    * Output Settings
    */
  @js.native
  trait OutputSettings extends js.Object {
    var ArchiveOutputSettings: js.UndefOr[ArchiveOutputSettings]
    var FrameCaptureOutputSettings: js.UndefOr[FrameCaptureOutputSettings]
    var HlsOutputSettings: js.UndefOr[HlsOutputSettings]
    var MediaPackageOutputSettings: js.UndefOr[MediaPackageOutputSettings]
    var MsSmoothOutputSettings: js.UndefOr[MsSmoothOutputSettings]
    var RtmpOutputSettings: js.UndefOr[RtmpOutputSettings]
    var UdpOutputSettings: js.UndefOr[UdpOutputSettings]
  }

  object OutputSettings {
    @inline
    def apply(
        ArchiveOutputSettings: js.UndefOr[ArchiveOutputSettings] = js.undefined,
        FrameCaptureOutputSettings: js.UndefOr[FrameCaptureOutputSettings] = js.undefined,
        HlsOutputSettings: js.UndefOr[HlsOutputSettings] = js.undefined,
        MediaPackageOutputSettings: js.UndefOr[MediaPackageOutputSettings] = js.undefined,
        MsSmoothOutputSettings: js.UndefOr[MsSmoothOutputSettings] = js.undefined,
        RtmpOutputSettings: js.UndefOr[RtmpOutputSettings] = js.undefined,
        UdpOutputSettings: js.UndefOr[UdpOutputSettings] = js.undefined
    ): OutputSettings = {
      val __obj = js.Dynamic.literal()
      ArchiveOutputSettings.foreach(__v => __obj.updateDynamic("ArchiveOutputSettings")(__v.asInstanceOf[js.Any]))
      FrameCaptureOutputSettings.foreach(
        __v => __obj.updateDynamic("FrameCaptureOutputSettings")(__v.asInstanceOf[js.Any])
      )
      HlsOutputSettings.foreach(__v => __obj.updateDynamic("HlsOutputSettings")(__v.asInstanceOf[js.Any]))
      MediaPackageOutputSettings.foreach(
        __v => __obj.updateDynamic("MediaPackageOutputSettings")(__v.asInstanceOf[js.Any])
      )
      MsSmoothOutputSettings.foreach(__v => __obj.updateDynamic("MsSmoothOutputSettings")(__v.asInstanceOf[js.Any]))
      RtmpOutputSettings.foreach(__v => __obj.updateDynamic("RtmpOutputSettings")(__v.asInstanceOf[js.Any]))
      UdpOutputSettings.foreach(__v => __obj.updateDynamic("UdpOutputSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputSettings]
    }
  }

  /**
    * Pass Through Settings
    */
  @js.native
  trait PassThroughSettings extends js.Object {}

  object PassThroughSettings {
    @inline
    def apply(
        ): PassThroughSettings = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PassThroughSettings]
    }
  }

  /**
    * Settings for the action to set pause state of a channel.
    */
  @js.native
  trait PauseStateScheduleActionSettings extends js.Object {
    var Pipelines: js.UndefOr[__listOfPipelinePauseStateSettings]
  }

  object PauseStateScheduleActionSettings {
    @inline
    def apply(
        Pipelines: js.UndefOr[__listOfPipelinePauseStateSettings] = js.undefined
    ): PauseStateScheduleActionSettings = {
      val __obj = js.Dynamic.literal()
      Pipelines.foreach(__v => __obj.updateDynamic("Pipelines")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PauseStateScheduleActionSettings]
    }
  }

  /**
    * Runtime details of a pipeline when a channel is running.
    */
  @js.native
  trait PipelineDetail extends js.Object {
    var ActiveInputAttachmentName: js.UndefOr[__string]
    var ActiveInputSwitchActionName: js.UndefOr[__string]
    var PipelineId: js.UndefOr[__string]
  }

  object PipelineDetail {
    @inline
    def apply(
        ActiveInputAttachmentName: js.UndefOr[__string] = js.undefined,
        ActiveInputSwitchActionName: js.UndefOr[__string] = js.undefined,
        PipelineId: js.UndefOr[__string] = js.undefined
    ): PipelineDetail = {
      val __obj = js.Dynamic.literal()
      ActiveInputAttachmentName.foreach(
        __v => __obj.updateDynamic("ActiveInputAttachmentName")(__v.asInstanceOf[js.Any])
      )
      ActiveInputSwitchActionName.foreach(
        __v => __obj.updateDynamic("ActiveInputSwitchActionName")(__v.asInstanceOf[js.Any])
      )
      PipelineId.foreach(__v => __obj.updateDynamic("PipelineId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineDetail]
    }
  }

  /**
    * Pipeline ID
    */
  object PipelineIdEnum {
    val PIPELINE_0 = "PIPELINE_0"
    val PIPELINE_1 = "PIPELINE_1"

    val values = js.Object.freeze(js.Array(PIPELINE_0, PIPELINE_1))
  }

  /**
    * Settings for pausing a pipeline.
    */
  @js.native
  trait PipelinePauseStateSettings extends js.Object {
    var PipelineId: PipelineId
  }

  object PipelinePauseStateSettings {
    @inline
    def apply(
        PipelineId: PipelineId
    ): PipelinePauseStateSettings = {
      val __obj = js.Dynamic.literal(
        "PipelineId" -> PipelineId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PipelinePauseStateSettings]
    }
  }

  /**
    * Placeholder documentation for PurchaseOfferingRequest
    */
  @js.native
  trait PurchaseOfferingRequest extends js.Object {
    var Count: __integerMin1
    var OfferingId: __string
    var Name: js.UndefOr[__string]
    var RequestId: js.UndefOr[__string]
    var Start: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object PurchaseOfferingRequest {
    @inline
    def apply(
        Count: __integerMin1,
        OfferingId: __string,
        Name: js.UndefOr[__string] = js.undefined,
        RequestId: js.UndefOr[__string] = js.undefined,
        Start: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): PurchaseOfferingRequest = {
      val __obj = js.Dynamic.literal(
        "Count"      -> Count.asInstanceOf[js.Any],
        "OfferingId" -> OfferingId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Start.foreach(__v => __obj.updateDynamic("Start")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PurchaseOfferingRequest]
    }
  }

  /**
    * Placeholder documentation for PurchaseOfferingResponse
    */
  @js.native
  trait PurchaseOfferingResponse extends js.Object {
    var Reservation: js.UndefOr[Reservation]
  }

  object PurchaseOfferingResponse {
    @inline
    def apply(
        Reservation: js.UndefOr[Reservation] = js.undefined
    ): PurchaseOfferingResponse = {
      val __obj = js.Dynamic.literal()
      Reservation.foreach(__v => __obj.updateDynamic("Reservation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PurchaseOfferingResponse]
    }
  }

  /**
    * Remix Settings
    */
  @js.native
  trait RemixSettings extends js.Object {
    var ChannelMappings: __listOfAudioChannelMapping
    var ChannelsIn: js.UndefOr[__integerMin1Max16]
    var ChannelsOut: js.UndefOr[__integerMin1Max8]
  }

  object RemixSettings {
    @inline
    def apply(
        ChannelMappings: __listOfAudioChannelMapping,
        ChannelsIn: js.UndefOr[__integerMin1Max16] = js.undefined,
        ChannelsOut: js.UndefOr[__integerMin1Max8] = js.undefined
    ): RemixSettings = {
      val __obj = js.Dynamic.literal(
        "ChannelMappings" -> ChannelMappings.asInstanceOf[js.Any]
      )

      ChannelsIn.foreach(__v => __obj.updateDynamic("ChannelsIn")(__v.asInstanceOf[js.Any]))
      ChannelsOut.foreach(__v => __obj.updateDynamic("ChannelsOut")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemixSettings]
    }
  }

  /**
    * Reserved resources available to use
    */
  @js.native
  trait Reservation extends js.Object {
    var Arn: js.UndefOr[__string]
    var Count: js.UndefOr[__integer]
    var CurrencyCode: js.UndefOr[__string]
    var Duration: js.UndefOr[__integer]
    var DurationUnits: js.UndefOr[OfferingDurationUnits]
    var End: js.UndefOr[__string]
    var FixedPrice: js.UndefOr[__double]
    var Name: js.UndefOr[__string]
    var OfferingDescription: js.UndefOr[__string]
    var OfferingId: js.UndefOr[__string]
    var OfferingType: js.UndefOr[OfferingType]
    var Region: js.UndefOr[__string]
    var ReservationId: js.UndefOr[__string]
    var ResourceSpecification: js.UndefOr[ReservationResourceSpecification]
    var Start: js.UndefOr[__string]
    var State: js.UndefOr[ReservationState]
    var Tags: js.UndefOr[Tags]
    var UsagePrice: js.UndefOr[__double]
  }

  object Reservation {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Count: js.UndefOr[__integer] = js.undefined,
        CurrencyCode: js.UndefOr[__string] = js.undefined,
        Duration: js.UndefOr[__integer] = js.undefined,
        DurationUnits: js.UndefOr[OfferingDurationUnits] = js.undefined,
        End: js.UndefOr[__string] = js.undefined,
        FixedPrice: js.UndefOr[__double] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        OfferingDescription: js.UndefOr[__string] = js.undefined,
        OfferingId: js.UndefOr[__string] = js.undefined,
        OfferingType: js.UndefOr[OfferingType] = js.undefined,
        Region: js.UndefOr[__string] = js.undefined,
        ReservationId: js.UndefOr[__string] = js.undefined,
        ResourceSpecification: js.UndefOr[ReservationResourceSpecification] = js.undefined,
        Start: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ReservationState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        UsagePrice: js.UndefOr[__double] = js.undefined
    ): Reservation = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      DurationUnits.foreach(__v => __obj.updateDynamic("DurationUnits")(__v.asInstanceOf[js.Any]))
      End.foreach(__v => __obj.updateDynamic("End")(__v.asInstanceOf[js.Any]))
      FixedPrice.foreach(__v => __obj.updateDynamic("FixedPrice")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OfferingDescription.foreach(__v => __obj.updateDynamic("OfferingDescription")(__v.asInstanceOf[js.Any]))
      OfferingId.foreach(__v => __obj.updateDynamic("OfferingId")(__v.asInstanceOf[js.Any]))
      OfferingType.foreach(__v => __obj.updateDynamic("OfferingType")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      ReservationId.foreach(__v => __obj.updateDynamic("ReservationId")(__v.asInstanceOf[js.Any]))
      ResourceSpecification.foreach(__v => __obj.updateDynamic("ResourceSpecification")(__v.asInstanceOf[js.Any]))
      Start.foreach(__v => __obj.updateDynamic("Start")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UsagePrice.foreach(__v => __obj.updateDynamic("UsagePrice")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Reservation]
    }
  }

  /**
    * Codec, 'MPEG2', 'AVC', 'HEVC', or 'AUDIO'
    */
  object ReservationCodecEnum {
    val MPEG2 = "MPEG2"
    val AVC   = "AVC"
    val HEVC  = "HEVC"
    val AUDIO = "AUDIO"

    val values = js.Object.freeze(js.Array(MPEG2, AVC, HEVC, AUDIO))
  }

  /**
    * Maximum bitrate in megabits per second
    */
  object ReservationMaximumBitrateEnum {
    val MAX_10_MBPS = "MAX_10_MBPS"
    val MAX_20_MBPS = "MAX_20_MBPS"
    val MAX_50_MBPS = "MAX_50_MBPS"

    val values = js.Object.freeze(js.Array(MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS))
  }

  /**
    * Maximum framerate in frames per second (Outputs only)
    */
  object ReservationMaximumFramerateEnum {
    val MAX_30_FPS = "MAX_30_FPS"
    val MAX_60_FPS = "MAX_60_FPS"

    val values = js.Object.freeze(js.Array(MAX_30_FPS, MAX_60_FPS))
  }

  /**
    * Resolution based on lines of vertical resolution; SD is less than 720 lines, HD is 720 to 1080 lines, UHD is greater than 1080 lines
    */
  object ReservationResolutionEnum {
    val SD  = "SD"
    val HD  = "HD"
    val UHD = "UHD"

    val values = js.Object.freeze(js.Array(SD, HD, UHD))
  }

  /**
    * Resource configuration (codec, resolution, bitrate, ...)
    */
  @js.native
  trait ReservationResourceSpecification extends js.Object {
    var ChannelClass: js.UndefOr[ChannelClass]
    var Codec: js.UndefOr[ReservationCodec]
    var MaximumBitrate: js.UndefOr[ReservationMaximumBitrate]
    var MaximumFramerate: js.UndefOr[ReservationMaximumFramerate]
    var Resolution: js.UndefOr[ReservationResolution]
    var ResourceType: js.UndefOr[ReservationResourceType]
    var SpecialFeature: js.UndefOr[ReservationSpecialFeature]
    var VideoQuality: js.UndefOr[ReservationVideoQuality]
  }

  object ReservationResourceSpecification {
    @inline
    def apply(
        ChannelClass: js.UndefOr[ChannelClass] = js.undefined,
        Codec: js.UndefOr[ReservationCodec] = js.undefined,
        MaximumBitrate: js.UndefOr[ReservationMaximumBitrate] = js.undefined,
        MaximumFramerate: js.UndefOr[ReservationMaximumFramerate] = js.undefined,
        Resolution: js.UndefOr[ReservationResolution] = js.undefined,
        ResourceType: js.UndefOr[ReservationResourceType] = js.undefined,
        SpecialFeature: js.UndefOr[ReservationSpecialFeature] = js.undefined,
        VideoQuality: js.UndefOr[ReservationVideoQuality] = js.undefined
    ): ReservationResourceSpecification = {
      val __obj = js.Dynamic.literal()
      ChannelClass.foreach(__v => __obj.updateDynamic("ChannelClass")(__v.asInstanceOf[js.Any]))
      Codec.foreach(__v => __obj.updateDynamic("Codec")(__v.asInstanceOf[js.Any]))
      MaximumBitrate.foreach(__v => __obj.updateDynamic("MaximumBitrate")(__v.asInstanceOf[js.Any]))
      MaximumFramerate.foreach(__v => __obj.updateDynamic("MaximumFramerate")(__v.asInstanceOf[js.Any]))
      Resolution.foreach(__v => __obj.updateDynamic("Resolution")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      SpecialFeature.foreach(__v => __obj.updateDynamic("SpecialFeature")(__v.asInstanceOf[js.Any]))
      VideoQuality.foreach(__v => __obj.updateDynamic("VideoQuality")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservationResourceSpecification]
    }
  }

  /**
    * Resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
    */
  object ReservationResourceTypeEnum {
    val INPUT   = "INPUT"
    val OUTPUT  = "OUTPUT"
    val CHANNEL = "CHANNEL"

    val values = js.Object.freeze(js.Array(INPUT, OUTPUT, CHANNEL))
  }

  /**
    * Special features, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
    */
  object ReservationSpecialFeatureEnum {
    val ADVANCED_AUDIO      = "ADVANCED_AUDIO"
    val AUDIO_NORMALIZATION = "AUDIO_NORMALIZATION"

    val values = js.Object.freeze(js.Array(ADVANCED_AUDIO, AUDIO_NORMALIZATION))
  }

  /**
    * Current reservation state
    */
  object ReservationStateEnum {
    val ACTIVE   = "ACTIVE"
    val EXPIRED  = "EXPIRED"
    val CANCELED = "CANCELED"
    val DELETED  = "DELETED"

    val values = js.Object.freeze(js.Array(ACTIVE, EXPIRED, CANCELED, DELETED))
  }

  /**
    * Video quality, e.g. 'STANDARD' (Outputs only)
    */
  object ReservationVideoQualityEnum {
    val STANDARD = "STANDARD"
    val ENHANCED = "ENHANCED"
    val PREMIUM  = "PREMIUM"

    val values = js.Object.freeze(js.Array(STANDARD, ENHANCED, PREMIUM))
  }

  /**
    * Rtmp Cache Full Behavior
    */
  object RtmpCacheFullBehaviorEnum {
    val DISCONNECT_IMMEDIATELY = "DISCONNECT_IMMEDIATELY"
    val WAIT_FOR_SERVER        = "WAIT_FOR_SERVER"

    val values = js.Object.freeze(js.Array(DISCONNECT_IMMEDIATELY, WAIT_FOR_SERVER))
  }

  /**
    * Rtmp Caption Data
    */
  object RtmpCaptionDataEnum {
    val ALL                   = "ALL"
    val FIELD1_608            = "FIELD1_608"
    val FIELD1_AND_FIELD2_608 = "FIELD1_AND_FIELD2_608"

    val values = js.Object.freeze(js.Array(ALL, FIELD1_608, FIELD1_AND_FIELD2_608))
  }

  /**
    * Rtmp Caption Info Destination Settings
    */
  @js.native
  trait RtmpCaptionInfoDestinationSettings extends js.Object {}

  object RtmpCaptionInfoDestinationSettings {
    @inline
    def apply(
        ): RtmpCaptionInfoDestinationSettings = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RtmpCaptionInfoDestinationSettings]
    }
  }

  /**
    * Rtmp Group Settings
    */
  @js.native
  trait RtmpGroupSettings extends js.Object {
    var AuthenticationScheme: js.UndefOr[AuthenticationScheme]
    var CacheFullBehavior: js.UndefOr[RtmpCacheFullBehavior]
    var CacheLength: js.UndefOr[__integerMin30]
    var CaptionData: js.UndefOr[RtmpCaptionData]
    var InputLossAction: js.UndefOr[InputLossActionForRtmpOut]
    var RestartDelay: js.UndefOr[__integerMin0]
  }

  object RtmpGroupSettings {
    @inline
    def apply(
        AuthenticationScheme: js.UndefOr[AuthenticationScheme] = js.undefined,
        CacheFullBehavior: js.UndefOr[RtmpCacheFullBehavior] = js.undefined,
        CacheLength: js.UndefOr[__integerMin30] = js.undefined,
        CaptionData: js.UndefOr[RtmpCaptionData] = js.undefined,
        InputLossAction: js.UndefOr[InputLossActionForRtmpOut] = js.undefined,
        RestartDelay: js.UndefOr[__integerMin0] = js.undefined
    ): RtmpGroupSettings = {
      val __obj = js.Dynamic.literal()
      AuthenticationScheme.foreach(__v => __obj.updateDynamic("AuthenticationScheme")(__v.asInstanceOf[js.Any]))
      CacheFullBehavior.foreach(__v => __obj.updateDynamic("CacheFullBehavior")(__v.asInstanceOf[js.Any]))
      CacheLength.foreach(__v => __obj.updateDynamic("CacheLength")(__v.asInstanceOf[js.Any]))
      CaptionData.foreach(__v => __obj.updateDynamic("CaptionData")(__v.asInstanceOf[js.Any]))
      InputLossAction.foreach(__v => __obj.updateDynamic("InputLossAction")(__v.asInstanceOf[js.Any]))
      RestartDelay.foreach(__v => __obj.updateDynamic("RestartDelay")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RtmpGroupSettings]
    }
  }

  /**
    * Rtmp Output Certificate Mode
    */
  object RtmpOutputCertificateModeEnum {
    val SELF_SIGNED         = "SELF_SIGNED"
    val VERIFY_AUTHENTICITY = "VERIFY_AUTHENTICITY"

    val values = js.Object.freeze(js.Array(SELF_SIGNED, VERIFY_AUTHENTICITY))
  }

  /**
    * Rtmp Output Settings
    */
  @js.native
  trait RtmpOutputSettings extends js.Object {
    var Destination: OutputLocationRef
    var CertificateMode: js.UndefOr[RtmpOutputCertificateMode]
    var ConnectionRetryInterval: js.UndefOr[__integerMin1]
    var NumRetries: js.UndefOr[__integerMin0]
  }

  object RtmpOutputSettings {
    @inline
    def apply(
        Destination: OutputLocationRef,
        CertificateMode: js.UndefOr[RtmpOutputCertificateMode] = js.undefined,
        ConnectionRetryInterval: js.UndefOr[__integerMin1] = js.undefined,
        NumRetries: js.UndefOr[__integerMin0] = js.undefined
    ): RtmpOutputSettings = {
      val __obj = js.Dynamic.literal(
        "Destination" -> Destination.asInstanceOf[js.Any]
      )

      CertificateMode.foreach(__v => __obj.updateDynamic("CertificateMode")(__v.asInstanceOf[js.Any]))
      ConnectionRetryInterval.foreach(__v => __obj.updateDynamic("ConnectionRetryInterval")(__v.asInstanceOf[js.Any]))
      NumRetries.foreach(__v => __obj.updateDynamic("NumRetries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RtmpOutputSettings]
    }
  }

  /**
    * Contains information on a single schedule action.
    */
  @js.native
  trait ScheduleAction extends js.Object {
    var ActionName: __string
    var ScheduleActionSettings: ScheduleActionSettings
    var ScheduleActionStartSettings: ScheduleActionStartSettings
  }

  object ScheduleAction {
    @inline
    def apply(
        ActionName: __string,
        ScheduleActionSettings: ScheduleActionSettings,
        ScheduleActionStartSettings: ScheduleActionStartSettings
    ): ScheduleAction = {
      val __obj = js.Dynamic.literal(
        "ActionName"                  -> ActionName.asInstanceOf[js.Any],
        "ScheduleActionSettings"      -> ScheduleActionSettings.asInstanceOf[js.Any],
        "ScheduleActionStartSettings" -> ScheduleActionStartSettings.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ScheduleAction]
    }
  }

  /**
    * Holds the settings for a single schedule action.
    */
  @js.native
  trait ScheduleActionSettings extends js.Object {
    var HlsTimedMetadataSettings: js.UndefOr[HlsTimedMetadataScheduleActionSettings]
    var InputSwitchSettings: js.UndefOr[InputSwitchScheduleActionSettings]
    var PauseStateSettings: js.UndefOr[PauseStateScheduleActionSettings]
    var Scte35ReturnToNetworkSettings: js.UndefOr[Scte35ReturnToNetworkScheduleActionSettings]
    var Scte35SpliceInsertSettings: js.UndefOr[Scte35SpliceInsertScheduleActionSettings]
    var Scte35TimeSignalSettings: js.UndefOr[Scte35TimeSignalScheduleActionSettings]
    var StaticImageActivateSettings: js.UndefOr[StaticImageActivateScheduleActionSettings]
    var StaticImageDeactivateSettings: js.UndefOr[StaticImageDeactivateScheduleActionSettings]
  }

  object ScheduleActionSettings {
    @inline
    def apply(
        HlsTimedMetadataSettings: js.UndefOr[HlsTimedMetadataScheduleActionSettings] = js.undefined,
        InputSwitchSettings: js.UndefOr[InputSwitchScheduleActionSettings] = js.undefined,
        PauseStateSettings: js.UndefOr[PauseStateScheduleActionSettings] = js.undefined,
        Scte35ReturnToNetworkSettings: js.UndefOr[Scte35ReturnToNetworkScheduleActionSettings] = js.undefined,
        Scte35SpliceInsertSettings: js.UndefOr[Scte35SpliceInsertScheduleActionSettings] = js.undefined,
        Scte35TimeSignalSettings: js.UndefOr[Scte35TimeSignalScheduleActionSettings] = js.undefined,
        StaticImageActivateSettings: js.UndefOr[StaticImageActivateScheduleActionSettings] = js.undefined,
        StaticImageDeactivateSettings: js.UndefOr[StaticImageDeactivateScheduleActionSettings] = js.undefined
    ): ScheduleActionSettings = {
      val __obj = js.Dynamic.literal()
      HlsTimedMetadataSettings.foreach(__v => __obj.updateDynamic("HlsTimedMetadataSettings")(__v.asInstanceOf[js.Any]))
      InputSwitchSettings.foreach(__v => __obj.updateDynamic("InputSwitchSettings")(__v.asInstanceOf[js.Any]))
      PauseStateSettings.foreach(__v => __obj.updateDynamic("PauseStateSettings")(__v.asInstanceOf[js.Any]))
      Scte35ReturnToNetworkSettings.foreach(
        __v => __obj.updateDynamic("Scte35ReturnToNetworkSettings")(__v.asInstanceOf[js.Any])
      )
      Scte35SpliceInsertSettings.foreach(
        __v => __obj.updateDynamic("Scte35SpliceInsertSettings")(__v.asInstanceOf[js.Any])
      )
      Scte35TimeSignalSettings.foreach(__v => __obj.updateDynamic("Scte35TimeSignalSettings")(__v.asInstanceOf[js.Any]))
      StaticImageActivateSettings.foreach(
        __v => __obj.updateDynamic("StaticImageActivateSettings")(__v.asInstanceOf[js.Any])
      )
      StaticImageDeactivateSettings.foreach(
        __v => __obj.updateDynamic("StaticImageDeactivateSettings")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ScheduleActionSettings]
    }
  }

  /**
    * Settings to specify when an action should occur. Only one of the options must be selected.
    */
  @js.native
  trait ScheduleActionStartSettings extends js.Object {
    var FixedModeScheduleActionStartSettings: js.UndefOr[FixedModeScheduleActionStartSettings]
    var FollowModeScheduleActionStartSettings: js.UndefOr[FollowModeScheduleActionStartSettings]
    var ImmediateModeScheduleActionStartSettings: js.UndefOr[ImmediateModeScheduleActionStartSettings]
  }

  object ScheduleActionStartSettings {
    @inline
    def apply(
        FixedModeScheduleActionStartSettings: js.UndefOr[FixedModeScheduleActionStartSettings] = js.undefined,
        FollowModeScheduleActionStartSettings: js.UndefOr[FollowModeScheduleActionStartSettings] = js.undefined,
        ImmediateModeScheduleActionStartSettings: js.UndefOr[ImmediateModeScheduleActionStartSettings] = js.undefined
    ): ScheduleActionStartSettings = {
      val __obj = js.Dynamic.literal()
      FixedModeScheduleActionStartSettings.foreach(
        __v => __obj.updateDynamic("FixedModeScheduleActionStartSettings")(__v.asInstanceOf[js.Any])
      )
      FollowModeScheduleActionStartSettings.foreach(
        __v => __obj.updateDynamic("FollowModeScheduleActionStartSettings")(__v.asInstanceOf[js.Any])
      )
      ImmediateModeScheduleActionStartSettings.foreach(
        __v => __obj.updateDynamic("ImmediateModeScheduleActionStartSettings")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ScheduleActionStartSettings]
    }
  }

  /**
    * Scte20 Convert608 To708
    */
  object Scte20Convert608To708Enum {
    val DISABLED  = "DISABLED"
    val UPCONVERT = "UPCONVERT"

    val values = js.Object.freeze(js.Array(DISABLED, UPCONVERT))
  }

  /**
    * Scte20 Plus Embedded Destination Settings
    */
  @js.native
  trait Scte20PlusEmbeddedDestinationSettings extends js.Object {}

  object Scte20PlusEmbeddedDestinationSettings {
    @inline
    def apply(
        ): Scte20PlusEmbeddedDestinationSettings = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[Scte20PlusEmbeddedDestinationSettings]
    }
  }

  /**
    * Scte20 Source Settings
    */
  @js.native
  trait Scte20SourceSettings extends js.Object {
    var Convert608To708: js.UndefOr[Scte20Convert608To708]
    var Source608ChannelNumber: js.UndefOr[__integerMin1Max4]
  }

  object Scte20SourceSettings {
    @inline
    def apply(
        Convert608To708: js.UndefOr[Scte20Convert608To708] = js.undefined,
        Source608ChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined
    ): Scte20SourceSettings = {
      val __obj = js.Dynamic.literal()
      Convert608To708.foreach(__v => __obj.updateDynamic("Convert608To708")(__v.asInstanceOf[js.Any]))
      Source608ChannelNumber.foreach(__v => __obj.updateDynamic("Source608ChannelNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Scte20SourceSettings]
    }
  }

  /**
    * Scte27 Destination Settings
    */
  @js.native
  trait Scte27DestinationSettings extends js.Object {}

  object Scte27DestinationSettings {
    @inline
    def apply(
        ): Scte27DestinationSettings = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[Scte27DestinationSettings]
    }
  }

  /**
    * Scte27 Source Settings
    */
  @js.native
  trait Scte27SourceSettings extends js.Object {
    var Pid: js.UndefOr[__integerMin1]
  }

  object Scte27SourceSettings {
    @inline
    def apply(
        Pid: js.UndefOr[__integerMin1] = js.undefined
    ): Scte27SourceSettings = {
      val __obj = js.Dynamic.literal()
      Pid.foreach(__v => __obj.updateDynamic("Pid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Scte27SourceSettings]
    }
  }

  /**
    * Scte35 Apos No Regional Blackout Behavior
    */
  object Scte35AposNoRegionalBlackoutBehaviorEnum {
    val FOLLOW = "FOLLOW"
    val IGNORE = "IGNORE"

    val values = js.Object.freeze(js.Array(FOLLOW, IGNORE))
  }

  /**
    * Scte35 Apos Web Delivery Allowed Behavior
    */
  object Scte35AposWebDeliveryAllowedBehaviorEnum {
    val FOLLOW = "FOLLOW"
    val IGNORE = "IGNORE"

    val values = js.Object.freeze(js.Array(FOLLOW, IGNORE))
  }

  /**
    * Corresponds to the archive_allowed parameter. A value of ARCHIVE_NOT_ALLOWED corresponds to 0 (false) in the SCTE-35 specification. If you include one of the "restriction" flags then you must include all four of them.
    */
  object Scte35ArchiveAllowedFlagEnum {
    val ARCHIVE_NOT_ALLOWED = "ARCHIVE_NOT_ALLOWED"
    val ARCHIVE_ALLOWED     = "ARCHIVE_ALLOWED"

    val values = js.Object.freeze(js.Array(ARCHIVE_NOT_ALLOWED, ARCHIVE_ALLOWED))
  }

  /**
    * Corresponds to SCTE-35 delivery_not_restricted_flag parameter. To declare delivery restrictions, include this element and its four "restriction" flags. To declare that there are no restrictions, omit this element.
    */
  @js.native
  trait Scte35DeliveryRestrictions extends js.Object {
    var ArchiveAllowedFlag: Scte35ArchiveAllowedFlag
    var DeviceRestrictions: Scte35DeviceRestrictions
    var NoRegionalBlackoutFlag: Scte35NoRegionalBlackoutFlag
    var WebDeliveryAllowedFlag: Scte35WebDeliveryAllowedFlag
  }

  object Scte35DeliveryRestrictions {
    @inline
    def apply(
        ArchiveAllowedFlag: Scte35ArchiveAllowedFlag,
        DeviceRestrictions: Scte35DeviceRestrictions,
        NoRegionalBlackoutFlag: Scte35NoRegionalBlackoutFlag,
        WebDeliveryAllowedFlag: Scte35WebDeliveryAllowedFlag
    ): Scte35DeliveryRestrictions = {
      val __obj = js.Dynamic.literal(
        "ArchiveAllowedFlag"     -> ArchiveAllowedFlag.asInstanceOf[js.Any],
        "DeviceRestrictions"     -> DeviceRestrictions.asInstanceOf[js.Any],
        "NoRegionalBlackoutFlag" -> NoRegionalBlackoutFlag.asInstanceOf[js.Any],
        "WebDeliveryAllowedFlag" -> WebDeliveryAllowedFlag.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Scte35DeliveryRestrictions]
    }
  }

  /**
    * Holds one set of SCTE-35 Descriptor Settings.
    */
  @js.native
  trait Scte35Descriptor extends js.Object {
    var Scte35DescriptorSettings: Scte35DescriptorSettings
  }

  object Scte35Descriptor {
    @inline
    def apply(
        Scte35DescriptorSettings: Scte35DescriptorSettings
    ): Scte35Descriptor = {
      val __obj = js.Dynamic.literal(
        "Scte35DescriptorSettings" -> Scte35DescriptorSettings.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Scte35Descriptor]
    }
  }

  /**
    * SCTE-35 Descriptor settings.
    */
  @js.native
  trait Scte35DescriptorSettings extends js.Object {
    var SegmentationDescriptorScte35DescriptorSettings: Scte35SegmentationDescriptor
  }

  object Scte35DescriptorSettings {
    @inline
    def apply(
        SegmentationDescriptorScte35DescriptorSettings: Scte35SegmentationDescriptor
    ): Scte35DescriptorSettings = {
      val __obj = js.Dynamic.literal(
        "SegmentationDescriptorScte35DescriptorSettings" -> SegmentationDescriptorScte35DescriptorSettings
          .asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Scte35DescriptorSettings]
    }
  }

  /**
    * Corresponds to the device_restrictions parameter in a segmentation_descriptor. If you include one of the "restriction" flags then you must include all four of them.
    */
  object Scte35DeviceRestrictionsEnum {
    val NONE            = "NONE"
    val RESTRICT_GROUP0 = "RESTRICT_GROUP0"
    val RESTRICT_GROUP1 = "RESTRICT_GROUP1"
    val RESTRICT_GROUP2 = "RESTRICT_GROUP2"

    val values = js.Object.freeze(js.Array(NONE, RESTRICT_GROUP0, RESTRICT_GROUP1, RESTRICT_GROUP2))
  }

  /**
    * Corresponds to the no_regional_blackout_flag parameter. A value of REGIONAL_BLACKOUT corresponds to 0 (false) in the SCTE-35 specification. If you include one of the "restriction" flags then you must include all four of them.
    */
  object Scte35NoRegionalBlackoutFlagEnum {
    val REGIONAL_BLACKOUT    = "REGIONAL_BLACKOUT"
    val NO_REGIONAL_BLACKOUT = "NO_REGIONAL_BLACKOUT"

    val values = js.Object.freeze(js.Array(REGIONAL_BLACKOUT, NO_REGIONAL_BLACKOUT))
  }

  /**
    * Settings for a SCTE-35 return_to_network message.
    */
  @js.native
  trait Scte35ReturnToNetworkScheduleActionSettings extends js.Object {
    var SpliceEventId: __longMin0Max4294967295
  }

  object Scte35ReturnToNetworkScheduleActionSettings {
    @inline
    def apply(
        SpliceEventId: __longMin0Max4294967295
    ): Scte35ReturnToNetworkScheduleActionSettings = {
      val __obj = js.Dynamic.literal(
        "SpliceEventId" -> SpliceEventId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Scte35ReturnToNetworkScheduleActionSettings]
    }
  }

  /**
    * Corresponds to SCTE-35 segmentation_event_cancel_indicator. SEGMENTATION_EVENT_NOT_CANCELED corresponds to 0 in the SCTE-35 specification and indicates that this is an insertion request. SEGMENTATION_EVENT_CANCELED corresponds to 1 in the SCTE-35 specification and indicates that this is a cancelation request, in which case complete this field and the existing event ID to cancel.
    */
  object Scte35SegmentationCancelIndicatorEnum {
    val SEGMENTATION_EVENT_NOT_CANCELED = "SEGMENTATION_EVENT_NOT_CANCELED"
    val SEGMENTATION_EVENT_CANCELED     = "SEGMENTATION_EVENT_CANCELED"

    val values = js.Object.freeze(js.Array(SEGMENTATION_EVENT_NOT_CANCELED, SEGMENTATION_EVENT_CANCELED))
  }

  /**
    * Corresponds to SCTE-35 segmentation_descriptor.
    */
  @js.native
  trait Scte35SegmentationDescriptor extends js.Object {
    var SegmentationCancelIndicator: Scte35SegmentationCancelIndicator
    var SegmentationEventId: __longMin0Max4294967295
    var DeliveryRestrictions: js.UndefOr[Scte35DeliveryRestrictions]
    var SegmentNum: js.UndefOr[__integerMin0Max255]
    var SegmentationDuration: js.UndefOr[__longMin0Max1099511627775]
    var SegmentationTypeId: js.UndefOr[__integerMin0Max255]
    var SegmentationUpid: js.UndefOr[__string]
    var SegmentationUpidType: js.UndefOr[__integerMin0Max255]
    var SegmentsExpected: js.UndefOr[__integerMin0Max255]
    var SubSegmentNum: js.UndefOr[__integerMin0Max255]
    var SubSegmentsExpected: js.UndefOr[__integerMin0Max255]
  }

  object Scte35SegmentationDescriptor {
    @inline
    def apply(
        SegmentationCancelIndicator: Scte35SegmentationCancelIndicator,
        SegmentationEventId: __longMin0Max4294967295,
        DeliveryRestrictions: js.UndefOr[Scte35DeliveryRestrictions] = js.undefined,
        SegmentNum: js.UndefOr[__integerMin0Max255] = js.undefined,
        SegmentationDuration: js.UndefOr[__longMin0Max1099511627775] = js.undefined,
        SegmentationTypeId: js.UndefOr[__integerMin0Max255] = js.undefined,
        SegmentationUpid: js.UndefOr[__string] = js.undefined,
        SegmentationUpidType: js.UndefOr[__integerMin0Max255] = js.undefined,
        SegmentsExpected: js.UndefOr[__integerMin0Max255] = js.undefined,
        SubSegmentNum: js.UndefOr[__integerMin0Max255] = js.undefined,
        SubSegmentsExpected: js.UndefOr[__integerMin0Max255] = js.undefined
    ): Scte35SegmentationDescriptor = {
      val __obj = js.Dynamic.literal(
        "SegmentationCancelIndicator" -> SegmentationCancelIndicator.asInstanceOf[js.Any],
        "SegmentationEventId"         -> SegmentationEventId.asInstanceOf[js.Any]
      )

      DeliveryRestrictions.foreach(__v => __obj.updateDynamic("DeliveryRestrictions")(__v.asInstanceOf[js.Any]))
      SegmentNum.foreach(__v => __obj.updateDynamic("SegmentNum")(__v.asInstanceOf[js.Any]))
      SegmentationDuration.foreach(__v => __obj.updateDynamic("SegmentationDuration")(__v.asInstanceOf[js.Any]))
      SegmentationTypeId.foreach(__v => __obj.updateDynamic("SegmentationTypeId")(__v.asInstanceOf[js.Any]))
      SegmentationUpid.foreach(__v => __obj.updateDynamic("SegmentationUpid")(__v.asInstanceOf[js.Any]))
      SegmentationUpidType.foreach(__v => __obj.updateDynamic("SegmentationUpidType")(__v.asInstanceOf[js.Any]))
      SegmentsExpected.foreach(__v => __obj.updateDynamic("SegmentsExpected")(__v.asInstanceOf[js.Any]))
      SubSegmentNum.foreach(__v => __obj.updateDynamic("SubSegmentNum")(__v.asInstanceOf[js.Any]))
      SubSegmentsExpected.foreach(__v => __obj.updateDynamic("SubSegmentsExpected")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Scte35SegmentationDescriptor]
    }
  }

  /**
    * Scte35 Splice Insert
    */
  @js.native
  trait Scte35SpliceInsert extends js.Object {
    var AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000]
    var NoRegionalBlackoutFlag: js.UndefOr[Scte35SpliceInsertNoRegionalBlackoutBehavior]
    var WebDeliveryAllowedFlag: js.UndefOr[Scte35SpliceInsertWebDeliveryAllowedBehavior]
  }

  object Scte35SpliceInsert {
    @inline
    def apply(
        AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000] = js.undefined,
        NoRegionalBlackoutFlag: js.UndefOr[Scte35SpliceInsertNoRegionalBlackoutBehavior] = js.undefined,
        WebDeliveryAllowedFlag: js.UndefOr[Scte35SpliceInsertWebDeliveryAllowedBehavior] = js.undefined
    ): Scte35SpliceInsert = {
      val __obj = js.Dynamic.literal()
      AdAvailOffset.foreach(__v => __obj.updateDynamic("AdAvailOffset")(__v.asInstanceOf[js.Any]))
      NoRegionalBlackoutFlag.foreach(__v => __obj.updateDynamic("NoRegionalBlackoutFlag")(__v.asInstanceOf[js.Any]))
      WebDeliveryAllowedFlag.foreach(__v => __obj.updateDynamic("WebDeliveryAllowedFlag")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Scte35SpliceInsert]
    }
  }

  /**
    * Scte35 Splice Insert No Regional Blackout Behavior
    */
  object Scte35SpliceInsertNoRegionalBlackoutBehaviorEnum {
    val FOLLOW = "FOLLOW"
    val IGNORE = "IGNORE"

    val values = js.Object.freeze(js.Array(FOLLOW, IGNORE))
  }

  /**
    * Settings for a SCTE-35 splice_insert message.
    */
  @js.native
  trait Scte35SpliceInsertScheduleActionSettings extends js.Object {
    var SpliceEventId: __longMin0Max4294967295
    var Duration: js.UndefOr[__longMin0Max8589934591]
  }

  object Scte35SpliceInsertScheduleActionSettings {
    @inline
    def apply(
        SpliceEventId: __longMin0Max4294967295,
        Duration: js.UndefOr[__longMin0Max8589934591] = js.undefined
    ): Scte35SpliceInsertScheduleActionSettings = {
      val __obj = js.Dynamic.literal(
        "SpliceEventId" -> SpliceEventId.asInstanceOf[js.Any]
      )

      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Scte35SpliceInsertScheduleActionSettings]
    }
  }

  /**
    * Scte35 Splice Insert Web Delivery Allowed Behavior
    */
  object Scte35SpliceInsertWebDeliveryAllowedBehaviorEnum {
    val FOLLOW = "FOLLOW"
    val IGNORE = "IGNORE"

    val values = js.Object.freeze(js.Array(FOLLOW, IGNORE))
  }

  /**
    * Scte35 Time Signal Apos
    */
  @js.native
  trait Scte35TimeSignalApos extends js.Object {
    var AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000]
    var NoRegionalBlackoutFlag: js.UndefOr[Scte35AposNoRegionalBlackoutBehavior]
    var WebDeliveryAllowedFlag: js.UndefOr[Scte35AposWebDeliveryAllowedBehavior]
  }

  object Scte35TimeSignalApos {
    @inline
    def apply(
        AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000] = js.undefined,
        NoRegionalBlackoutFlag: js.UndefOr[Scte35AposNoRegionalBlackoutBehavior] = js.undefined,
        WebDeliveryAllowedFlag: js.UndefOr[Scte35AposWebDeliveryAllowedBehavior] = js.undefined
    ): Scte35TimeSignalApos = {
      val __obj = js.Dynamic.literal()
      AdAvailOffset.foreach(__v => __obj.updateDynamic("AdAvailOffset")(__v.asInstanceOf[js.Any]))
      NoRegionalBlackoutFlag.foreach(__v => __obj.updateDynamic("NoRegionalBlackoutFlag")(__v.asInstanceOf[js.Any]))
      WebDeliveryAllowedFlag.foreach(__v => __obj.updateDynamic("WebDeliveryAllowedFlag")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Scte35TimeSignalApos]
    }
  }

  /**
    * Settings for a SCTE-35 time_signal.
    */
  @js.native
  trait Scte35TimeSignalScheduleActionSettings extends js.Object {
    var Scte35Descriptors: __listOfScte35Descriptor
  }

  object Scte35TimeSignalScheduleActionSettings {
    @inline
    def apply(
        Scte35Descriptors: __listOfScte35Descriptor
    ): Scte35TimeSignalScheduleActionSettings = {
      val __obj = js.Dynamic.literal(
        "Scte35Descriptors" -> Scte35Descriptors.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Scte35TimeSignalScheduleActionSettings]
    }
  }

  /**
    * Corresponds to the web_delivery_allowed_flag parameter. A value of WEB_DELIVERY_NOT_ALLOWED corresponds to 0 (false) in the SCTE-35 specification. If you include one of the "restriction" flags then you must include all four of them.
    */
  object Scte35WebDeliveryAllowedFlagEnum {
    val WEB_DELIVERY_NOT_ALLOWED = "WEB_DELIVERY_NOT_ALLOWED"
    val WEB_DELIVERY_ALLOWED     = "WEB_DELIVERY_ALLOWED"

    val values = js.Object.freeze(js.Array(WEB_DELIVERY_NOT_ALLOWED, WEB_DELIVERY_ALLOWED))
  }

  /**
    * Smooth Group Audio Only Timecode Control
    */
  object SmoothGroupAudioOnlyTimecodeControlEnum {
    val PASSTHROUGH          = "PASSTHROUGH"
    val USE_CONFIGURED_CLOCK = "USE_CONFIGURED_CLOCK"

    val values = js.Object.freeze(js.Array(PASSTHROUGH, USE_CONFIGURED_CLOCK))
  }

  /**
    * Smooth Group Certificate Mode
    */
  object SmoothGroupCertificateModeEnum {
    val SELF_SIGNED         = "SELF_SIGNED"
    val VERIFY_AUTHENTICITY = "VERIFY_AUTHENTICITY"

    val values = js.Object.freeze(js.Array(SELF_SIGNED, VERIFY_AUTHENTICITY))
  }

  /**
    * Smooth Group Event Id Mode
    */
  object SmoothGroupEventIdModeEnum {
    val NO_EVENT_ID    = "NO_EVENT_ID"
    val USE_CONFIGURED = "USE_CONFIGURED"
    val USE_TIMESTAMP  = "USE_TIMESTAMP"

    val values = js.Object.freeze(js.Array(NO_EVENT_ID, USE_CONFIGURED, USE_TIMESTAMP))
  }

  /**
    * Smooth Group Event Stop Behavior
    */
  object SmoothGroupEventStopBehaviorEnum {
    val NONE     = "NONE"
    val SEND_EOS = "SEND_EOS"

    val values = js.Object.freeze(js.Array(NONE, SEND_EOS))
  }

  /**
    * Smooth Group Segmentation Mode
    */
  object SmoothGroupSegmentationModeEnum {
    val USE_INPUT_SEGMENTATION = "USE_INPUT_SEGMENTATION"
    val USE_SEGMENT_DURATION   = "USE_SEGMENT_DURATION"

    val values = js.Object.freeze(js.Array(USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION))
  }

  /**
    * Smooth Group Sparse Track Type
    */
  object SmoothGroupSparseTrackTypeEnum {
    val NONE    = "NONE"
    val SCTE_35 = "SCTE_35"

    val values = js.Object.freeze(js.Array(NONE, SCTE_35))
  }

  /**
    * Smooth Group Stream Manifest Behavior
    */
  object SmoothGroupStreamManifestBehaviorEnum {
    val DO_NOT_SEND = "DO_NOT_SEND"
    val SEND        = "SEND"

    val values = js.Object.freeze(js.Array(DO_NOT_SEND, SEND))
  }

  /**
    * Smooth Group Timestamp Offset Mode
    */
  object SmoothGroupTimestampOffsetModeEnum {
    val USE_CONFIGURED_OFFSET = "USE_CONFIGURED_OFFSET"
    val USE_EVENT_START_DATE  = "USE_EVENT_START_DATE"

    val values = js.Object.freeze(js.Array(USE_CONFIGURED_OFFSET, USE_EVENT_START_DATE))
  }

  /**
    * Smpte Tt Destination Settings
    */
  @js.native
  trait SmpteTtDestinationSettings extends js.Object {}

  object SmpteTtDestinationSettings {
    @inline
    def apply(
        ): SmpteTtDestinationSettings = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[SmpteTtDestinationSettings]
    }
  }

  /**
    * Standard Hls Settings
    */
  @js.native
  trait StandardHlsSettings extends js.Object {
    var M3u8Settings: M3u8Settings
    var AudioRenditionSets: js.UndefOr[__string]
  }

  object StandardHlsSettings {
    @inline
    def apply(
        M3u8Settings: M3u8Settings,
        AudioRenditionSets: js.UndefOr[__string] = js.undefined
    ): StandardHlsSettings = {
      val __obj = js.Dynamic.literal(
        "M3u8Settings" -> M3u8Settings.asInstanceOf[js.Any]
      )

      AudioRenditionSets.foreach(__v => __obj.updateDynamic("AudioRenditionSets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StandardHlsSettings]
    }
  }

  /**
    * Placeholder documentation for StartChannelRequest
    */
  @js.native
  trait StartChannelRequest extends js.Object {
    var ChannelId: __string
  }

  object StartChannelRequest {
    @inline
    def apply(
        ChannelId: __string
    ): StartChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelId" -> ChannelId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartChannelRequest]
    }
  }

  /**
    * Placeholder documentation for StartChannelResponse
    */
  @js.native
  trait StartChannelResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var ChannelClass: js.UndefOr[ChannelClass]
    var Destinations: js.UndefOr[__listOfOutputDestination]
    var EgressEndpoints: js.UndefOr[__listOfChannelEgressEndpoint]
    var EncoderSettings: js.UndefOr[EncoderSettings]
    var Id: js.UndefOr[__string]
    var InputAttachments: js.UndefOr[__listOfInputAttachment]
    var InputSpecification: js.UndefOr[InputSpecification]
    var LogLevel: js.UndefOr[LogLevel]
    var Name: js.UndefOr[__string]
    var PipelineDetails: js.UndefOr[__listOfPipelineDetail]
    var PipelinesRunningCount: js.UndefOr[__integer]
    var RoleArn: js.UndefOr[__string]
    var State: js.UndefOr[ChannelState]
    var Tags: js.UndefOr[Tags]
  }

  object StartChannelResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        ChannelClass: js.UndefOr[ChannelClass] = js.undefined,
        Destinations: js.UndefOr[__listOfOutputDestination] = js.undefined,
        EgressEndpoints: js.UndefOr[__listOfChannelEgressEndpoint] = js.undefined,
        EncoderSettings: js.UndefOr[EncoderSettings] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        InputAttachments: js.UndefOr[__listOfInputAttachment] = js.undefined,
        InputSpecification: js.UndefOr[InputSpecification] = js.undefined,
        LogLevel: js.UndefOr[LogLevel] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        PipelineDetails: js.UndefOr[__listOfPipelineDetail] = js.undefined,
        PipelinesRunningCount: js.UndefOr[__integer] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ChannelState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): StartChannelResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ChannelClass.foreach(__v => __obj.updateDynamic("ChannelClass")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      EgressEndpoints.foreach(__v => __obj.updateDynamic("EgressEndpoints")(__v.asInstanceOf[js.Any]))
      EncoderSettings.foreach(__v => __obj.updateDynamic("EncoderSettings")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InputAttachments.foreach(__v => __obj.updateDynamic("InputAttachments")(__v.asInstanceOf[js.Any]))
      InputSpecification.foreach(__v => __obj.updateDynamic("InputSpecification")(__v.asInstanceOf[js.Any]))
      LogLevel.foreach(__v => __obj.updateDynamic("LogLevel")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PipelineDetails.foreach(__v => __obj.updateDynamic("PipelineDetails")(__v.asInstanceOf[js.Any]))
      PipelinesRunningCount.foreach(__v => __obj.updateDynamic("PipelinesRunningCount")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartChannelResponse]
    }
  }

  /**
    * Settings to identify the start of the clip.
    */
  @js.native
  trait StartTimecode extends js.Object {
    var Timecode: js.UndefOr[__string]
  }

  object StartTimecode {
    @inline
    def apply(
        Timecode: js.UndefOr[__string] = js.undefined
    ): StartTimecode = {
      val __obj = js.Dynamic.literal()
      Timecode.foreach(__v => __obj.updateDynamic("Timecode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTimecode]
    }
  }

  /**
    * Settings for the action to activate a static image.
    */
  @js.native
  trait StaticImageActivateScheduleActionSettings extends js.Object {
    var Image: InputLocation
    var Duration: js.UndefOr[__integerMin0]
    var FadeIn: js.UndefOr[__integerMin0]
    var FadeOut: js.UndefOr[__integerMin0]
    var Height: js.UndefOr[__integerMin1]
    var ImageX: js.UndefOr[__integerMin0]
    var ImageY: js.UndefOr[__integerMin0]
    var Layer: js.UndefOr[__integerMin0Max7]
    var Opacity: js.UndefOr[__integerMin0Max100]
    var Width: js.UndefOr[__integerMin1]
  }

  object StaticImageActivateScheduleActionSettings {
    @inline
    def apply(
        Image: InputLocation,
        Duration: js.UndefOr[__integerMin0] = js.undefined,
        FadeIn: js.UndefOr[__integerMin0] = js.undefined,
        FadeOut: js.UndefOr[__integerMin0] = js.undefined,
        Height: js.UndefOr[__integerMin1] = js.undefined,
        ImageX: js.UndefOr[__integerMin0] = js.undefined,
        ImageY: js.UndefOr[__integerMin0] = js.undefined,
        Layer: js.UndefOr[__integerMin0Max7] = js.undefined,
        Opacity: js.UndefOr[__integerMin0Max100] = js.undefined,
        Width: js.UndefOr[__integerMin1] = js.undefined
    ): StaticImageActivateScheduleActionSettings = {
      val __obj = js.Dynamic.literal(
        "Image" -> Image.asInstanceOf[js.Any]
      )

      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      FadeIn.foreach(__v => __obj.updateDynamic("FadeIn")(__v.asInstanceOf[js.Any]))
      FadeOut.foreach(__v => __obj.updateDynamic("FadeOut")(__v.asInstanceOf[js.Any]))
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      ImageX.foreach(__v => __obj.updateDynamic("ImageX")(__v.asInstanceOf[js.Any]))
      ImageY.foreach(__v => __obj.updateDynamic("ImageY")(__v.asInstanceOf[js.Any]))
      Layer.foreach(__v => __obj.updateDynamic("Layer")(__v.asInstanceOf[js.Any]))
      Opacity.foreach(__v => __obj.updateDynamic("Opacity")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StaticImageActivateScheduleActionSettings]
    }
  }

  /**
    * Settings for the action to deactivate the image in a specific layer.
    */
  @js.native
  trait StaticImageDeactivateScheduleActionSettings extends js.Object {
    var FadeOut: js.UndefOr[__integerMin0]
    var Layer: js.UndefOr[__integerMin0Max7]
  }

  object StaticImageDeactivateScheduleActionSettings {
    @inline
    def apply(
        FadeOut: js.UndefOr[__integerMin0] = js.undefined,
        Layer: js.UndefOr[__integerMin0Max7] = js.undefined
    ): StaticImageDeactivateScheduleActionSettings = {
      val __obj = js.Dynamic.literal()
      FadeOut.foreach(__v => __obj.updateDynamic("FadeOut")(__v.asInstanceOf[js.Any]))
      Layer.foreach(__v => __obj.updateDynamic("Layer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StaticImageDeactivateScheduleActionSettings]
    }
  }

  /**
    * Static Key Settings
    */
  @js.native
  trait StaticKeySettings extends js.Object {
    var StaticKeyValue: __stringMin32Max32
    var KeyProviderServer: js.UndefOr[InputLocation]
  }

  object StaticKeySettings {
    @inline
    def apply(
        StaticKeyValue: __stringMin32Max32,
        KeyProviderServer: js.UndefOr[InputLocation] = js.undefined
    ): StaticKeySettings = {
      val __obj = js.Dynamic.literal(
        "StaticKeyValue" -> StaticKeyValue.asInstanceOf[js.Any]
      )

      KeyProviderServer.foreach(__v => __obj.updateDynamic("KeyProviderServer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StaticKeySettings]
    }
  }

  /**
    * Placeholder documentation for StopChannelRequest
    */
  @js.native
  trait StopChannelRequest extends js.Object {
    var ChannelId: __string
  }

  object StopChannelRequest {
    @inline
    def apply(
        ChannelId: __string
    ): StopChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelId" -> ChannelId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopChannelRequest]
    }
  }

  /**
    * Placeholder documentation for StopChannelResponse
    */
  @js.native
  trait StopChannelResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var ChannelClass: js.UndefOr[ChannelClass]
    var Destinations: js.UndefOr[__listOfOutputDestination]
    var EgressEndpoints: js.UndefOr[__listOfChannelEgressEndpoint]
    var EncoderSettings: js.UndefOr[EncoderSettings]
    var Id: js.UndefOr[__string]
    var InputAttachments: js.UndefOr[__listOfInputAttachment]
    var InputSpecification: js.UndefOr[InputSpecification]
    var LogLevel: js.UndefOr[LogLevel]
    var Name: js.UndefOr[__string]
    var PipelineDetails: js.UndefOr[__listOfPipelineDetail]
    var PipelinesRunningCount: js.UndefOr[__integer]
    var RoleArn: js.UndefOr[__string]
    var State: js.UndefOr[ChannelState]
    var Tags: js.UndefOr[Tags]
  }

  object StopChannelResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        ChannelClass: js.UndefOr[ChannelClass] = js.undefined,
        Destinations: js.UndefOr[__listOfOutputDestination] = js.undefined,
        EgressEndpoints: js.UndefOr[__listOfChannelEgressEndpoint] = js.undefined,
        EncoderSettings: js.UndefOr[EncoderSettings] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        InputAttachments: js.UndefOr[__listOfInputAttachment] = js.undefined,
        InputSpecification: js.UndefOr[InputSpecification] = js.undefined,
        LogLevel: js.UndefOr[LogLevel] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        PipelineDetails: js.UndefOr[__listOfPipelineDetail] = js.undefined,
        PipelinesRunningCount: js.UndefOr[__integer] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ChannelState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): StopChannelResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ChannelClass.foreach(__v => __obj.updateDynamic("ChannelClass")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      EgressEndpoints.foreach(__v => __obj.updateDynamic("EgressEndpoints")(__v.asInstanceOf[js.Any]))
      EncoderSettings.foreach(__v => __obj.updateDynamic("EncoderSettings")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InputAttachments.foreach(__v => __obj.updateDynamic("InputAttachments")(__v.asInstanceOf[js.Any]))
      InputSpecification.foreach(__v => __obj.updateDynamic("InputSpecification")(__v.asInstanceOf[js.Any]))
      LogLevel.foreach(__v => __obj.updateDynamic("LogLevel")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PipelineDetails.foreach(__v => __obj.updateDynamic("PipelineDetails")(__v.asInstanceOf[js.Any]))
      PipelinesRunningCount.foreach(__v => __obj.updateDynamic("PipelinesRunningCount")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopChannelResponse]
    }
  }

  /**
    * Settings to identify the end of the clip.
    */
  @js.native
  trait StopTimecode extends js.Object {
    var LastFrameClippingBehavior: js.UndefOr[LastFrameClippingBehavior]
    var Timecode: js.UndefOr[__string]
  }

  object StopTimecode {
    @inline
    def apply(
        LastFrameClippingBehavior: js.UndefOr[LastFrameClippingBehavior] = js.undefined,
        Timecode: js.UndefOr[__string] = js.undefined
    ): StopTimecode = {
      val __obj = js.Dynamic.literal()
      LastFrameClippingBehavior.foreach(
        __v => __obj.updateDynamic("LastFrameClippingBehavior")(__v.asInstanceOf[js.Any])
      )
      Timecode.foreach(__v => __obj.updateDynamic("Timecode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopTimecode]
    }
  }

  /**
    * Teletext Destination Settings
    */
  @js.native
  trait TeletextDestinationSettings extends js.Object {}

  object TeletextDestinationSettings {
    @inline
    def apply(
        ): TeletextDestinationSettings = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TeletextDestinationSettings]
    }
  }

  /**
    * Teletext Source Settings
    */
  @js.native
  trait TeletextSourceSettings extends js.Object {
    var PageNumber: js.UndefOr[__string]
  }

  object TeletextSourceSettings {
    @inline
    def apply(
        PageNumber: js.UndefOr[__string] = js.undefined
    ): TeletextSourceSettings = {
      val __obj = js.Dynamic.literal()
      PageNumber.foreach(__v => __obj.updateDynamic("PageNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TeletextSourceSettings]
    }
  }

  /**
    * Timecode Config
    */
  @js.native
  trait TimecodeConfig extends js.Object {
    var Source: TimecodeConfigSource
    var SyncThreshold: js.UndefOr[__integerMin1Max1000000]
  }

  object TimecodeConfig {
    @inline
    def apply(
        Source: TimecodeConfigSource,
        SyncThreshold: js.UndefOr[__integerMin1Max1000000] = js.undefined
    ): TimecodeConfig = {
      val __obj = js.Dynamic.literal(
        "Source" -> Source.asInstanceOf[js.Any]
      )

      SyncThreshold.foreach(__v => __obj.updateDynamic("SyncThreshold")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimecodeConfig]
    }
  }

  /**
    * Timecode Config Source
    */
  object TimecodeConfigSourceEnum {
    val EMBEDDED    = "EMBEDDED"
    val SYSTEMCLOCK = "SYSTEMCLOCK"
    val ZEROBASED   = "ZEROBASED"

    val values = js.Object.freeze(js.Array(EMBEDDED, SYSTEMCLOCK, ZEROBASED))
  }

  /**
    * Ttml Destination Settings
    */
  @js.native
  trait TtmlDestinationSettings extends js.Object {
    var StyleControl: js.UndefOr[TtmlDestinationStyleControl]
  }

  object TtmlDestinationSettings {
    @inline
    def apply(
        StyleControl: js.UndefOr[TtmlDestinationStyleControl] = js.undefined
    ): TtmlDestinationSettings = {
      val __obj = js.Dynamic.literal()
      StyleControl.foreach(__v => __obj.updateDynamic("StyleControl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TtmlDestinationSettings]
    }
  }

  /**
    * Ttml Destination Style Control
    */
  object TtmlDestinationStyleControlEnum {
    val PASSTHROUGH    = "PASSTHROUGH"
    val USE_CONFIGURED = "USE_CONFIGURED"

    val values = js.Object.freeze(js.Array(PASSTHROUGH, USE_CONFIGURED))
  }

  /**
    * Udp Container Settings
    */
  @js.native
  trait UdpContainerSettings extends js.Object {
    var M2tsSettings: js.UndefOr[M2tsSettings]
  }

  object UdpContainerSettings {
    @inline
    def apply(
        M2tsSettings: js.UndefOr[M2tsSettings] = js.undefined
    ): UdpContainerSettings = {
      val __obj = js.Dynamic.literal()
      M2tsSettings.foreach(__v => __obj.updateDynamic("M2tsSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UdpContainerSettings]
    }
  }

  /**
    * Udp Group Settings
    */
  @js.native
  trait UdpGroupSettings extends js.Object {
    var InputLossAction: js.UndefOr[InputLossActionForUdpOut]
    var TimedMetadataId3Frame: js.UndefOr[UdpTimedMetadataId3Frame]
    var TimedMetadataId3Period: js.UndefOr[__integerMin0]
  }

  object UdpGroupSettings {
    @inline
    def apply(
        InputLossAction: js.UndefOr[InputLossActionForUdpOut] = js.undefined,
        TimedMetadataId3Frame: js.UndefOr[UdpTimedMetadataId3Frame] = js.undefined,
        TimedMetadataId3Period: js.UndefOr[__integerMin0] = js.undefined
    ): UdpGroupSettings = {
      val __obj = js.Dynamic.literal()
      InputLossAction.foreach(__v => __obj.updateDynamic("InputLossAction")(__v.asInstanceOf[js.Any]))
      TimedMetadataId3Frame.foreach(__v => __obj.updateDynamic("TimedMetadataId3Frame")(__v.asInstanceOf[js.Any]))
      TimedMetadataId3Period.foreach(__v => __obj.updateDynamic("TimedMetadataId3Period")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UdpGroupSettings]
    }
  }

  /**
    * Udp Output Settings
    */
  @js.native
  trait UdpOutputSettings extends js.Object {
    var ContainerSettings: UdpContainerSettings
    var Destination: OutputLocationRef
    var BufferMsec: js.UndefOr[__integerMin0Max10000]
    var FecOutputSettings: js.UndefOr[FecOutputSettings]
  }

  object UdpOutputSettings {
    @inline
    def apply(
        ContainerSettings: UdpContainerSettings,
        Destination: OutputLocationRef,
        BufferMsec: js.UndefOr[__integerMin0Max10000] = js.undefined,
        FecOutputSettings: js.UndefOr[FecOutputSettings] = js.undefined
    ): UdpOutputSettings = {
      val __obj = js.Dynamic.literal(
        "ContainerSettings" -> ContainerSettings.asInstanceOf[js.Any],
        "Destination"       -> Destination.asInstanceOf[js.Any]
      )

      BufferMsec.foreach(__v => __obj.updateDynamic("BufferMsec")(__v.asInstanceOf[js.Any]))
      FecOutputSettings.foreach(__v => __obj.updateDynamic("FecOutputSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UdpOutputSettings]
    }
  }

  /**
    * Udp Timed Metadata Id3 Frame
    */
  object UdpTimedMetadataId3FrameEnum {
    val NONE = "NONE"
    val PRIV = "PRIV"
    val TDRL = "TDRL"

    val values = js.Object.freeze(js.Array(NONE, PRIV, TDRL))
  }

  /**
    * Channel class that the channel should be updated to.
    */
  @js.native
  trait UpdateChannelClassRequest extends js.Object {
    var ChannelClass: ChannelClass
    var ChannelId: __string
    var Destinations: js.UndefOr[__listOfOutputDestination]
  }

  object UpdateChannelClassRequest {
    @inline
    def apply(
        ChannelClass: ChannelClass,
        ChannelId: __string,
        Destinations: js.UndefOr[__listOfOutputDestination] = js.undefined
    ): UpdateChannelClassRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelClass" -> ChannelClass.asInstanceOf[js.Any],
        "ChannelId"    -> ChannelId.asInstanceOf[js.Any]
      )

      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChannelClassRequest]
    }
  }

  /**
    * Placeholder documentation for UpdateChannelClassResponse
    */
  @js.native
  trait UpdateChannelClassResponse extends js.Object {
    var Channel: js.UndefOr[Channel]
  }

  object UpdateChannelClassResponse {
    @inline
    def apply(
        Channel: js.UndefOr[Channel] = js.undefined
    ): UpdateChannelClassResponse = {
      val __obj = js.Dynamic.literal()
      Channel.foreach(__v => __obj.updateDynamic("Channel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChannelClassResponse]
    }
  }

  /**
    * A request to update a channel.
    */
  @js.native
  trait UpdateChannelRequest extends js.Object {
    var ChannelId: __string
    var Destinations: js.UndefOr[__listOfOutputDestination]
    var EncoderSettings: js.UndefOr[EncoderSettings]
    var InputAttachments: js.UndefOr[__listOfInputAttachment]
    var InputSpecification: js.UndefOr[InputSpecification]
    var LogLevel: js.UndefOr[LogLevel]
    var Name: js.UndefOr[__string]
    var RoleArn: js.UndefOr[__string]
  }

  object UpdateChannelRequest {
    @inline
    def apply(
        ChannelId: __string,
        Destinations: js.UndefOr[__listOfOutputDestination] = js.undefined,
        EncoderSettings: js.UndefOr[EncoderSettings] = js.undefined,
        InputAttachments: js.UndefOr[__listOfInputAttachment] = js.undefined,
        InputSpecification: js.UndefOr[InputSpecification] = js.undefined,
        LogLevel: js.UndefOr[LogLevel] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined
    ): UpdateChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelId" -> ChannelId.asInstanceOf[js.Any]
      )

      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      EncoderSettings.foreach(__v => __obj.updateDynamic("EncoderSettings")(__v.asInstanceOf[js.Any]))
      InputAttachments.foreach(__v => __obj.updateDynamic("InputAttachments")(__v.asInstanceOf[js.Any]))
      InputSpecification.foreach(__v => __obj.updateDynamic("InputSpecification")(__v.asInstanceOf[js.Any]))
      LogLevel.foreach(__v => __obj.updateDynamic("LogLevel")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChannelRequest]
    }
  }

  /**
    * Placeholder documentation for UpdateChannelResponse
    */
  @js.native
  trait UpdateChannelResponse extends js.Object {
    var Channel: js.UndefOr[Channel]
  }

  object UpdateChannelResponse {
    @inline
    def apply(
        Channel: js.UndefOr[Channel] = js.undefined
    ): UpdateChannelResponse = {
      val __obj = js.Dynamic.literal()
      Channel.foreach(__v => __obj.updateDynamic("Channel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChannelResponse]
    }
  }

  /**
    * A request to update an input.
    */
  @js.native
  trait UpdateInputRequest extends js.Object {
    var InputId: __string
    var Destinations: js.UndefOr[__listOfInputDestinationRequest]
    var InputSecurityGroups: js.UndefOr[__listOf__string]
    var MediaConnectFlows: js.UndefOr[__listOfMediaConnectFlowRequest]
    var Name: js.UndefOr[__string]
    var RoleArn: js.UndefOr[__string]
    var Sources: js.UndefOr[__listOfInputSourceRequest]
  }

  object UpdateInputRequest {
    @inline
    def apply(
        InputId: __string,
        Destinations: js.UndefOr[__listOfInputDestinationRequest] = js.undefined,
        InputSecurityGroups: js.UndefOr[__listOf__string] = js.undefined,
        MediaConnectFlows: js.UndefOr[__listOfMediaConnectFlowRequest] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        Sources: js.UndefOr[__listOfInputSourceRequest] = js.undefined
    ): UpdateInputRequest = {
      val __obj = js.Dynamic.literal(
        "InputId" -> InputId.asInstanceOf[js.Any]
      )

      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      InputSecurityGroups.foreach(__v => __obj.updateDynamic("InputSecurityGroups")(__v.asInstanceOf[js.Any]))
      MediaConnectFlows.foreach(__v => __obj.updateDynamic("MediaConnectFlows")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.updateDynamic("Sources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateInputRequest]
    }
  }

  /**
    * Placeholder documentation for UpdateInputResponse
    */
  @js.native
  trait UpdateInputResponse extends js.Object {
    var Input: js.UndefOr[Input]
  }

  object UpdateInputResponse {
    @inline
    def apply(
        Input: js.UndefOr[Input] = js.undefined
    ): UpdateInputResponse = {
      val __obj = js.Dynamic.literal()
      Input.foreach(__v => __obj.updateDynamic("Input")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateInputResponse]
    }
  }

  /**
    * The request to update some combination of the Input Security Group name and the IPv4 CIDRs the Input Security Group should allow.
    */
  @js.native
  trait UpdateInputSecurityGroupRequest extends js.Object {
    var InputSecurityGroupId: __string
    var Tags: js.UndefOr[Tags]
    var WhitelistRules: js.UndefOr[__listOfInputWhitelistRuleCidr]
  }

  object UpdateInputSecurityGroupRequest {
    @inline
    def apply(
        InputSecurityGroupId: __string,
        Tags: js.UndefOr[Tags] = js.undefined,
        WhitelistRules: js.UndefOr[__listOfInputWhitelistRuleCidr] = js.undefined
    ): UpdateInputSecurityGroupRequest = {
      val __obj = js.Dynamic.literal(
        "InputSecurityGroupId" -> InputSecurityGroupId.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      WhitelistRules.foreach(__v => __obj.updateDynamic("WhitelistRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateInputSecurityGroupRequest]
    }
  }

  /**
    * Placeholder documentation for UpdateInputSecurityGroupResponse
    */
  @js.native
  trait UpdateInputSecurityGroupResponse extends js.Object {
    var SecurityGroup: js.UndefOr[InputSecurityGroup]
  }

  object UpdateInputSecurityGroupResponse {
    @inline
    def apply(
        SecurityGroup: js.UndefOr[InputSecurityGroup] = js.undefined
    ): UpdateInputSecurityGroupResponse = {
      val __obj = js.Dynamic.literal()
      SecurityGroup.foreach(__v => __obj.updateDynamic("SecurityGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateInputSecurityGroupResponse]
    }
  }

  /**
    * Request to update a reservation
    */
  @js.native
  trait UpdateReservationRequest extends js.Object {
    var ReservationId: __string
    var Name: js.UndefOr[__string]
  }

  object UpdateReservationRequest {
    @inline
    def apply(
        ReservationId: __string,
        Name: js.UndefOr[__string] = js.undefined
    ): UpdateReservationRequest = {
      val __obj = js.Dynamic.literal(
        "ReservationId" -> ReservationId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateReservationRequest]
    }
  }

  /**
    * Placeholder documentation for UpdateReservationResponse
    */
  @js.native
  trait UpdateReservationResponse extends js.Object {
    var Reservation: js.UndefOr[Reservation]
  }

  object UpdateReservationResponse {
    @inline
    def apply(
        Reservation: js.UndefOr[Reservation] = js.undefined
    ): UpdateReservationResponse = {
      val __obj = js.Dynamic.literal()
      Reservation.foreach(__v => __obj.updateDynamic("Reservation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateReservationResponse]
    }
  }

  /**
    * Video Codec Settings
    */
  @js.native
  trait VideoCodecSettings extends js.Object {
    var FrameCaptureSettings: js.UndefOr[FrameCaptureSettings]
    var H264Settings: js.UndefOr[H264Settings]
  }

  object VideoCodecSettings {
    @inline
    def apply(
        FrameCaptureSettings: js.UndefOr[FrameCaptureSettings] = js.undefined,
        H264Settings: js.UndefOr[H264Settings] = js.undefined
    ): VideoCodecSettings = {
      val __obj = js.Dynamic.literal()
      FrameCaptureSettings.foreach(__v => __obj.updateDynamic("FrameCaptureSettings")(__v.asInstanceOf[js.Any]))
      H264Settings.foreach(__v => __obj.updateDynamic("H264Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoCodecSettings]
    }
  }

  /**
    * Video settings for this stream.
    */
  @js.native
  trait VideoDescription extends js.Object {
    var Name: __string
    var CodecSettings: js.UndefOr[VideoCodecSettings]
    var Height: js.UndefOr[__integer]
    var RespondToAfd: js.UndefOr[VideoDescriptionRespondToAfd]
    var ScalingBehavior: js.UndefOr[VideoDescriptionScalingBehavior]
    var Sharpness: js.UndefOr[__integerMin0Max100]
    var Width: js.UndefOr[__integer]
  }

  object VideoDescription {
    @inline
    def apply(
        Name: __string,
        CodecSettings: js.UndefOr[VideoCodecSettings] = js.undefined,
        Height: js.UndefOr[__integer] = js.undefined,
        RespondToAfd: js.UndefOr[VideoDescriptionRespondToAfd] = js.undefined,
        ScalingBehavior: js.UndefOr[VideoDescriptionScalingBehavior] = js.undefined,
        Sharpness: js.UndefOr[__integerMin0Max100] = js.undefined,
        Width: js.UndefOr[__integer] = js.undefined
    ): VideoDescription = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CodecSettings.foreach(__v => __obj.updateDynamic("CodecSettings")(__v.asInstanceOf[js.Any]))
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      RespondToAfd.foreach(__v => __obj.updateDynamic("RespondToAfd")(__v.asInstanceOf[js.Any]))
      ScalingBehavior.foreach(__v => __obj.updateDynamic("ScalingBehavior")(__v.asInstanceOf[js.Any]))
      Sharpness.foreach(__v => __obj.updateDynamic("Sharpness")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoDescription]
    }
  }

  /**
    * Video Description Respond To Afd
    */
  object VideoDescriptionRespondToAfdEnum {
    val NONE        = "NONE"
    val PASSTHROUGH = "PASSTHROUGH"
    val RESPOND     = "RESPOND"

    val values = js.Object.freeze(js.Array(NONE, PASSTHROUGH, RESPOND))
  }

  /**
    * Video Description Scaling Behavior
    */
  object VideoDescriptionScalingBehaviorEnum {
    val DEFAULT           = "DEFAULT"
    val STRETCH_TO_OUTPUT = "STRETCH_TO_OUTPUT"

    val values = js.Object.freeze(js.Array(DEFAULT, STRETCH_TO_OUTPUT))
  }

  /**
    * Specifies a particular video stream within an input source. An input may have only a single video selector.
    */
  @js.native
  trait VideoSelector extends js.Object {
    var ColorSpace: js.UndefOr[VideoSelectorColorSpace]
    var ColorSpaceUsage: js.UndefOr[VideoSelectorColorSpaceUsage]
    var SelectorSettings: js.UndefOr[VideoSelectorSettings]
  }

  object VideoSelector {
    @inline
    def apply(
        ColorSpace: js.UndefOr[VideoSelectorColorSpace] = js.undefined,
        ColorSpaceUsage: js.UndefOr[VideoSelectorColorSpaceUsage] = js.undefined,
        SelectorSettings: js.UndefOr[VideoSelectorSettings] = js.undefined
    ): VideoSelector = {
      val __obj = js.Dynamic.literal()
      ColorSpace.foreach(__v => __obj.updateDynamic("ColorSpace")(__v.asInstanceOf[js.Any]))
      ColorSpaceUsage.foreach(__v => __obj.updateDynamic("ColorSpaceUsage")(__v.asInstanceOf[js.Any]))
      SelectorSettings.foreach(__v => __obj.updateDynamic("SelectorSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoSelector]
    }
  }

  /**
    * Video Selector Color Space
    */
  object VideoSelectorColorSpaceEnum {
    val FOLLOW  = "FOLLOW"
    val REC_601 = "REC_601"
    val REC_709 = "REC_709"

    val values = js.Object.freeze(js.Array(FOLLOW, REC_601, REC_709))
  }

  /**
    * Video Selector Color Space Usage
    */
  object VideoSelectorColorSpaceUsageEnum {
    val FALLBACK = "FALLBACK"
    val FORCE    = "FORCE"

    val values = js.Object.freeze(js.Array(FALLBACK, FORCE))
  }

  /**
    * Video Selector Pid
    */
  @js.native
  trait VideoSelectorPid extends js.Object {
    var Pid: js.UndefOr[__integerMin0Max8191]
  }

  object VideoSelectorPid {
    @inline
    def apply(
        Pid: js.UndefOr[__integerMin0Max8191] = js.undefined
    ): VideoSelectorPid = {
      val __obj = js.Dynamic.literal()
      Pid.foreach(__v => __obj.updateDynamic("Pid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoSelectorPid]
    }
  }

  /**
    * Video Selector Program Id
    */
  @js.native
  trait VideoSelectorProgramId extends js.Object {
    var ProgramId: js.UndefOr[__integerMin0Max65536]
  }

  object VideoSelectorProgramId {
    @inline
    def apply(
        ProgramId: js.UndefOr[__integerMin0Max65536] = js.undefined
    ): VideoSelectorProgramId = {
      val __obj = js.Dynamic.literal()
      ProgramId.foreach(__v => __obj.updateDynamic("ProgramId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoSelectorProgramId]
    }
  }

  /**
    * Video Selector Settings
    */
  @js.native
  trait VideoSelectorSettings extends js.Object {
    var VideoSelectorPid: js.UndefOr[VideoSelectorPid]
    var VideoSelectorProgramId: js.UndefOr[VideoSelectorProgramId]
  }

  object VideoSelectorSettings {
    @inline
    def apply(
        VideoSelectorPid: js.UndefOr[VideoSelectorPid] = js.undefined,
        VideoSelectorProgramId: js.UndefOr[VideoSelectorProgramId] = js.undefined
    ): VideoSelectorSettings = {
      val __obj = js.Dynamic.literal()
      VideoSelectorPid.foreach(__v => __obj.updateDynamic("VideoSelectorPid")(__v.asInstanceOf[js.Any]))
      VideoSelectorProgramId.foreach(__v => __obj.updateDynamic("VideoSelectorProgramId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoSelectorSettings]
    }
  }

  /**
    * Webvtt Destination Settings
    */
  @js.native
  trait WebvttDestinationSettings extends js.Object {}

  object WebvttDestinationSettings {
    @inline
    def apply(
        ): WebvttDestinationSettings = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[WebvttDestinationSettings]
    }
  }
}
