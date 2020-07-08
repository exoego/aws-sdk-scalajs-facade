package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object medialive {
  type MaxResults                                    = Int
  type Tags                                          = js.Dictionary[__string]
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
  type __integerMin0Max100000000                     = Int
  type __integerMin0Max128                           = Int
  type __integerMin0Max15                            = Int
  type __integerMin0Max255                           = Int
  type __integerMin0Max30                            = Int
  type __integerMin0Max32768                         = Int
  type __integerMin0Max3600                          = Int
  type __integerMin0Max500                           = Int
  type __integerMin0Max600                           = Int
  type __integerMin0Max65535                         = Int
  type __integerMin0Max65536                         = Int
  type __integerMin0Max7                             = Int
  type __integerMin0Max8191                          = Int
  type __integerMin1                                 = Int
  type __integerMin1000                              = Int
  type __integerMin1000000Max100000000               = Int
  type __integerMin100000Max100000000                = Int
  type __integerMin100000Max40000000                 = Int
  type __integerMin100000Max80000000                 = Int
  type __integerMin1000Max3000                       = Int
  type __integerMin1000Max30000                      = Int
  type __integerMin1Max10                            = Int
  type __integerMin1Max1000000                       = Int
  type __integerMin1Max16                            = Int
  type __integerMin1Max20                            = Int
  type __integerMin1Max3003                          = Int
  type __integerMin1Max31                            = Int
  type __integerMin1Max32                            = Int
  type __integerMin1Max3600000                       = Int
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
  type __listOfAudioTrack                            = js.Array[AudioTrack]
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
  type __listOfInputDeviceRequest                    = js.Array[InputDeviceRequest]
  type __listOfInputDeviceSettings                   = js.Array[InputDeviceSettings]
  type __listOfInputDeviceSummary                    = js.Array[InputDeviceSummary]
  type __listOfInputSecurityGroup                    = js.Array[InputSecurityGroup]
  type __listOfInputSource                           = js.Array[InputSource]
  type __listOfInputSourceRequest                    = js.Array[InputSourceRequest]
  type __listOfInputWhitelistRule                    = js.Array[InputWhitelistRule]
  type __listOfInputWhitelistRuleCidr                = js.Array[InputWhitelistRuleCidr]
  type __listOfMediaConnectFlow                      = js.Array[MediaConnectFlow]
  type __listOfMediaConnectFlowRequest               = js.Array[MediaConnectFlowRequest]
  type __listOfMediaPackageOutputDestinationSettings = js.Array[MediaPackageOutputDestinationSettings]
  type __listOfMultiplexOutputDestination            = js.Array[MultiplexOutputDestination]
  type __listOfMultiplexProgramSummary               = js.Array[MultiplexProgramSummary]
  type __listOfMultiplexSummary                      = js.Array[MultiplexSummary]
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
  type __listOf__integer                             = js.Array[__integer]
  type __listOf__string                              = js.Array[__string]
  type __longMin0Max1099511627775                    = Double
  type __longMin0Max4294967295                       = Double
  type __longMin0Max8589934591                       = Double
  type __string                                      = String
  type __stringMax256                                = String
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
      service.batchUpdateSchedule(params).promise().toFuture
    @inline def createChannelFuture(params: CreateChannelRequest): Future[CreateChannelResponse] =
      service.createChannel(params).promise().toFuture
    @inline def createInputFuture(params: CreateInputRequest): Future[CreateInputResponse] =
      service.createInput(params).promise().toFuture
    @inline def createInputSecurityGroupFuture(
        params: CreateInputSecurityGroupRequest
    ): Future[CreateInputSecurityGroupResponse] = service.createInputSecurityGroup(params).promise().toFuture
    @inline def createMultiplexFuture(params: CreateMultiplexRequest): Future[CreateMultiplexResponse] =
      service.createMultiplex(params).promise().toFuture
    @inline def createMultiplexProgramFuture(
        params: CreateMultiplexProgramRequest
    ): Future[CreateMultiplexProgramResponse] = service.createMultiplexProgram(params).promise().toFuture
    @inline def createTagsFuture(params: CreateTagsRequest): Future[js.Object] =
      service.createTags(params).promise().toFuture
    @inline def deleteChannelFuture(params: DeleteChannelRequest): Future[DeleteChannelResponse] =
      service.deleteChannel(params).promise().toFuture
    @inline def deleteInputFuture(params: DeleteInputRequest): Future[DeleteInputResponse] =
      service.deleteInput(params).promise().toFuture
    @inline def deleteInputSecurityGroupFuture(
        params: DeleteInputSecurityGroupRequest
    ): Future[DeleteInputSecurityGroupResponse] = service.deleteInputSecurityGroup(params).promise().toFuture
    @inline def deleteMultiplexFuture(params: DeleteMultiplexRequest): Future[DeleteMultiplexResponse] =
      service.deleteMultiplex(params).promise().toFuture
    @inline def deleteMultiplexProgramFuture(
        params: DeleteMultiplexProgramRequest
    ): Future[DeleteMultiplexProgramResponse] = service.deleteMultiplexProgram(params).promise().toFuture
    @inline def deleteReservationFuture(params: DeleteReservationRequest): Future[DeleteReservationResponse] =
      service.deleteReservation(params).promise().toFuture
    @inline def deleteScheduleFuture(params: DeleteScheduleRequest): Future[DeleteScheduleResponse] =
      service.deleteSchedule(params).promise().toFuture
    @inline def deleteTagsFuture(params: DeleteTagsRequest): Future[js.Object] =
      service.deleteTags(params).promise().toFuture
    @inline def describeChannelFuture(params: DescribeChannelRequest): Future[DescribeChannelResponse] =
      service.describeChannel(params).promise().toFuture
    @inline def describeInputDeviceFuture(params: DescribeInputDeviceRequest): Future[DescribeInputDeviceResponse] =
      service.describeInputDevice(params).promise().toFuture
    @inline def describeInputFuture(params: DescribeInputRequest): Future[DescribeInputResponse] =
      service.describeInput(params).promise().toFuture
    @inline def describeInputSecurityGroupFuture(
        params: DescribeInputSecurityGroupRequest
    ): Future[DescribeInputSecurityGroupResponse] = service.describeInputSecurityGroup(params).promise().toFuture
    @inline def describeMultiplexFuture(params: DescribeMultiplexRequest): Future[DescribeMultiplexResponse] =
      service.describeMultiplex(params).promise().toFuture
    @inline def describeMultiplexProgramFuture(
        params: DescribeMultiplexProgramRequest
    ): Future[DescribeMultiplexProgramResponse] = service.describeMultiplexProgram(params).promise().toFuture
    @inline def describeOfferingFuture(params: DescribeOfferingRequest): Future[DescribeOfferingResponse] =
      service.describeOffering(params).promise().toFuture
    @inline def describeReservationFuture(params: DescribeReservationRequest): Future[DescribeReservationResponse] =
      service.describeReservation(params).promise().toFuture
    @inline def describeScheduleFuture(params: DescribeScheduleRequest): Future[DescribeScheduleResponse] =
      service.describeSchedule(params).promise().toFuture
    @inline def listChannelsFuture(params: ListChannelsRequest): Future[ListChannelsResponse] =
      service.listChannels(params).promise().toFuture
    @inline def listInputDevicesFuture(params: ListInputDevicesRequest): Future[ListInputDevicesResponse] =
      service.listInputDevices(params).promise().toFuture
    @inline def listInputSecurityGroupsFuture(
        params: ListInputSecurityGroupsRequest
    ): Future[ListInputSecurityGroupsResponse] = service.listInputSecurityGroups(params).promise().toFuture
    @inline def listInputsFuture(params: ListInputsRequest): Future[ListInputsResponse] =
      service.listInputs(params).promise().toFuture
    @inline def listMultiplexProgramsFuture(
        params: ListMultiplexProgramsRequest
    ): Future[ListMultiplexProgramsResponse] = service.listMultiplexPrograms(params).promise().toFuture
    @inline def listMultiplexesFuture(params: ListMultiplexesRequest): Future[ListMultiplexesResponse] =
      service.listMultiplexes(params).promise().toFuture
    @inline def listOfferingsFuture(params: ListOfferingsRequest): Future[ListOfferingsResponse] =
      service.listOfferings(params).promise().toFuture
    @inline def listReservationsFuture(params: ListReservationsRequest): Future[ListReservationsResponse] =
      service.listReservations(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def purchaseOfferingFuture(params: PurchaseOfferingRequest): Future[PurchaseOfferingResponse] =
      service.purchaseOffering(params).promise().toFuture
    @inline def startChannelFuture(params: StartChannelRequest): Future[StartChannelResponse] =
      service.startChannel(params).promise().toFuture
    @inline def startMultiplexFuture(params: StartMultiplexRequest): Future[StartMultiplexResponse] =
      service.startMultiplex(params).promise().toFuture
    @inline def stopChannelFuture(params: StopChannelRequest): Future[StopChannelResponse] =
      service.stopChannel(params).promise().toFuture
    @inline def stopMultiplexFuture(params: StopMultiplexRequest): Future[StopMultiplexResponse] =
      service.stopMultiplex(params).promise().toFuture
    @inline def updateChannelClassFuture(params: UpdateChannelClassRequest): Future[UpdateChannelClassResponse] =
      service.updateChannelClass(params).promise().toFuture
    @inline def updateChannelFuture(params: UpdateChannelRequest): Future[UpdateChannelResponse] =
      service.updateChannel(params).promise().toFuture
    @inline def updateInputDeviceFuture(params: UpdateInputDeviceRequest): Future[UpdateInputDeviceResponse] =
      service.updateInputDevice(params).promise().toFuture
    @inline def updateInputFuture(params: UpdateInputRequest): Future[UpdateInputResponse] =
      service.updateInput(params).promise().toFuture
    @inline def updateInputSecurityGroupFuture(
        params: UpdateInputSecurityGroupRequest
    ): Future[UpdateInputSecurityGroupResponse] = service.updateInputSecurityGroup(params).promise().toFuture
    @inline def updateMultiplexFuture(params: UpdateMultiplexRequest): Future[UpdateMultiplexResponse] =
      service.updateMultiplex(params).promise().toFuture
    @inline def updateMultiplexProgramFuture(
        params: UpdateMultiplexProgramRequest
    ): Future[UpdateMultiplexProgramResponse] = service.updateMultiplexProgram(params).promise().toFuture
    @inline def updateReservationFuture(params: UpdateReservationRequest): Future[UpdateReservationResponse] =
      service.updateReservation(params).promise().toFuture
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
    def createMultiplex(params: CreateMultiplexRequest): Request[CreateMultiplexResponse] = js.native
    def createMultiplexProgram(params: CreateMultiplexProgramRequest): Request[CreateMultiplexProgramResponse] =
      js.native
    def createTags(params: CreateTagsRequest): Request[js.Object]                   = js.native
    def deleteChannel(params: DeleteChannelRequest): Request[DeleteChannelResponse] = js.native
    def deleteInput(params: DeleteInputRequest): Request[DeleteInputResponse]       = js.native
    def deleteInputSecurityGroup(params: DeleteInputSecurityGroupRequest): Request[DeleteInputSecurityGroupResponse] =
      js.native
    def deleteMultiplex(params: DeleteMultiplexRequest): Request[DeleteMultiplexResponse] = js.native
    def deleteMultiplexProgram(params: DeleteMultiplexProgramRequest): Request[DeleteMultiplexProgramResponse] =
      js.native
    def deleteReservation(params: DeleteReservationRequest): Request[DeleteReservationResponse]       = js.native
    def deleteSchedule(params: DeleteScheduleRequest): Request[DeleteScheduleResponse]                = js.native
    def deleteTags(params: DeleteTagsRequest): Request[js.Object]                                     = js.native
    def describeChannel(params: DescribeChannelRequest): Request[DescribeChannelResponse]             = js.native
    def describeInput(params: DescribeInputRequest): Request[DescribeInputResponse]                   = js.native
    def describeInputDevice(params: DescribeInputDeviceRequest): Request[DescribeInputDeviceResponse] = js.native
    def describeInputSecurityGroup(
        params: DescribeInputSecurityGroupRequest
    ): Request[DescribeInputSecurityGroupResponse]                                              = js.native
    def describeMultiplex(params: DescribeMultiplexRequest): Request[DescribeMultiplexResponse] = js.native
    def describeMultiplexProgram(params: DescribeMultiplexProgramRequest): Request[DescribeMultiplexProgramResponse] =
      js.native
    def describeOffering(params: DescribeOfferingRequest): Request[DescribeOfferingResponse]          = js.native
    def describeReservation(params: DescribeReservationRequest): Request[DescribeReservationResponse] = js.native
    def describeSchedule(params: DescribeScheduleRequest): Request[DescribeScheduleResponse]          = js.native
    def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse]                      = js.native
    def listInputDevices(params: ListInputDevicesRequest): Request[ListInputDevicesResponse]          = js.native
    def listInputSecurityGroups(params: ListInputSecurityGroupsRequest): Request[ListInputSecurityGroupsResponse] =
      js.native
    def listInputs(params: ListInputsRequest): Request[ListInputsResponse]                                  = js.native
    def listMultiplexPrograms(params: ListMultiplexProgramsRequest): Request[ListMultiplexProgramsResponse] = js.native
    def listMultiplexes(params: ListMultiplexesRequest): Request[ListMultiplexesResponse]                   = js.native
    def listOfferings(params: ListOfferingsRequest): Request[ListOfferingsResponse]                         = js.native
    def listReservations(params: ListReservationsRequest): Request[ListReservationsResponse]                = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def purchaseOffering(params: PurchaseOfferingRequest): Request[PurchaseOfferingResponse]                = js.native
    def startChannel(params: StartChannelRequest): Request[StartChannelResponse]                            = js.native
    def startMultiplex(params: StartMultiplexRequest): Request[StartMultiplexResponse]                      = js.native
    def stopChannel(params: StopChannelRequest): Request[StopChannelResponse]                               = js.native
    def stopMultiplex(params: StopMultiplexRequest): Request[StopMultiplexResponse]                         = js.native
    def updateChannel(params: UpdateChannelRequest): Request[UpdateChannelResponse]                         = js.native
    def updateChannelClass(params: UpdateChannelClassRequest): Request[UpdateChannelClassResponse]          = js.native
    def updateInput(params: UpdateInputRequest): Request[UpdateInputResponse]                               = js.native
    def updateInputDevice(params: UpdateInputDeviceRequest): Request[UpdateInputDeviceResponse]             = js.native
    def updateInputSecurityGroup(params: UpdateInputSecurityGroupRequest): Request[UpdateInputSecurityGroupResponse] =
      js.native
    def updateMultiplex(params: UpdateMultiplexRequest): Request[UpdateMultiplexResponse] = js.native
    def updateMultiplexProgram(params: UpdateMultiplexProgramRequest): Request[UpdateMultiplexProgramResponse] =
      js.native
    def updateReservation(params: UpdateReservationRequest): Request[UpdateReservationResponse] = js.native
  }

  /**
    * Aac Coding Mode
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
    * Aac Input Type
    */
  @js.native
  sealed trait AacInputType extends js.Any
  object AacInputType extends js.Object {
    val BROADCASTER_MIXED_AD = "BROADCASTER_MIXED_AD".asInstanceOf[AacInputType]
    val NORMAL               = "NORMAL".asInstanceOf[AacInputType]

    val values = js.Object.freeze(js.Array(BROADCASTER_MIXED_AD, NORMAL))
  }

  /**
    * Aac Profile
    */
  @js.native
  sealed trait AacProfile extends js.Any
  object AacProfile extends js.Object {
    val HEV1 = "HEV1".asInstanceOf[AacProfile]
    val HEV2 = "HEV2".asInstanceOf[AacProfile]
    val LC   = "LC".asInstanceOf[AacProfile]

    val values = js.Object.freeze(js.Array(HEV1, HEV2, LC))
  }

  /**
    * Aac Rate Control Mode
    */
  @js.native
  sealed trait AacRateControlMode extends js.Any
  object AacRateControlMode extends js.Object {
    val CBR = "CBR".asInstanceOf[AacRateControlMode]
    val VBR = "VBR".asInstanceOf[AacRateControlMode]

    val values = js.Object.freeze(js.Array(CBR, VBR))
  }

  /**
    * Aac Raw Format
    */
  @js.native
  sealed trait AacRawFormat extends js.Any
  object AacRawFormat extends js.Object {
    val LATM_LOAS = "LATM_LOAS".asInstanceOf[AacRawFormat]
    val NONE      = "NONE".asInstanceOf[AacRawFormat]

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
  @js.native
  sealed trait AacSpec extends js.Any
  object AacSpec extends js.Object {
    val MPEG2 = "MPEG2".asInstanceOf[AacSpec]
    val MPEG4 = "MPEG4".asInstanceOf[AacSpec]

    val values = js.Object.freeze(js.Array(MPEG2, MPEG4))
  }

  /**
    * Aac Vbr Quality
    */
  @js.native
  sealed trait AacVbrQuality extends js.Any
  object AacVbrQuality extends js.Object {
    val HIGH        = "HIGH".asInstanceOf[AacVbrQuality]
    val LOW         = "LOW".asInstanceOf[AacVbrQuality]
    val MEDIUM_HIGH = "MEDIUM_HIGH".asInstanceOf[AacVbrQuality]
    val MEDIUM_LOW  = "MEDIUM_LOW".asInstanceOf[AacVbrQuality]

    val values = js.Object.freeze(js.Array(HIGH, LOW, MEDIUM_HIGH, MEDIUM_LOW))
  }

  /**
    * Ac3 Bitstream Mode
    */
  @js.native
  sealed trait Ac3BitstreamMode extends js.Any
  object Ac3BitstreamMode extends js.Object {
    val COMMENTARY        = "COMMENTARY".asInstanceOf[Ac3BitstreamMode]
    val COMPLETE_MAIN     = "COMPLETE_MAIN".asInstanceOf[Ac3BitstreamMode]
    val DIALOGUE          = "DIALOGUE".asInstanceOf[Ac3BitstreamMode]
    val EMERGENCY         = "EMERGENCY".asInstanceOf[Ac3BitstreamMode]
    val HEARING_IMPAIRED  = "HEARING_IMPAIRED".asInstanceOf[Ac3BitstreamMode]
    val MUSIC_AND_EFFECTS = "MUSIC_AND_EFFECTS".asInstanceOf[Ac3BitstreamMode]
    val VISUALLY_IMPAIRED = "VISUALLY_IMPAIRED".asInstanceOf[Ac3BitstreamMode]
    val VOICE_OVER        = "VOICE_OVER".asInstanceOf[Ac3BitstreamMode]

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
    * Ac3 Drc Profile
    */
  @js.native
  sealed trait Ac3DrcProfile extends js.Any
  object Ac3DrcProfile extends js.Object {
    val FILM_STANDARD = "FILM_STANDARD".asInstanceOf[Ac3DrcProfile]
    val NONE          = "NONE".asInstanceOf[Ac3DrcProfile]

    val values = js.Object.freeze(js.Array(FILM_STANDARD, NONE))
  }

  /**
    * Ac3 Lfe Filter
    */
  @js.native
  sealed trait Ac3LfeFilter extends js.Any
  object Ac3LfeFilter extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[Ac3LfeFilter]
    val ENABLED  = "ENABLED".asInstanceOf[Ac3LfeFilter]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Ac3 Metadata Control
    */
  @js.native
  sealed trait Ac3MetadataControl extends js.Any
  object Ac3MetadataControl extends js.Object {
    val FOLLOW_INPUT   = "FOLLOW_INPUT".asInstanceOf[Ac3MetadataControl]
    val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[Ac3MetadataControl]

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
  @js.native
  sealed trait AfdSignaling extends js.Any
  object AfdSignaling extends js.Object {
    val AUTO  = "AUTO".asInstanceOf[AfdSignaling]
    val FIXED = "FIXED".asInstanceOf[AfdSignaling]
    val NONE  = "NONE".asInstanceOf[AfdSignaling]

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

      AudioNormalizationSettings.foreach(__v =>
        __obj.updateDynamic("AudioNormalizationSettings")(__v.asInstanceOf[js.Any])
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
  @js.native
  sealed trait AudioDescriptionAudioTypeControl extends js.Any
  object AudioDescriptionAudioTypeControl extends js.Object {
    val FOLLOW_INPUT   = "FOLLOW_INPUT".asInstanceOf[AudioDescriptionAudioTypeControl]
    val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[AudioDescriptionAudioTypeControl]

    val values = js.Object.freeze(js.Array(FOLLOW_INPUT, USE_CONFIGURED))
  }

  /**
    * Audio Description Language Code Control
    */
  @js.native
  sealed trait AudioDescriptionLanguageCodeControl extends js.Any
  object AudioDescriptionLanguageCodeControl extends js.Object {
    val FOLLOW_INPUT   = "FOLLOW_INPUT".asInstanceOf[AudioDescriptionLanguageCodeControl]
    val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[AudioDescriptionLanguageCodeControl]

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
  @js.native
  sealed trait AudioLanguageSelectionPolicy extends js.Any
  object AudioLanguageSelectionPolicy extends js.Object {
    val LOOSE  = "LOOSE".asInstanceOf[AudioLanguageSelectionPolicy]
    val STRICT = "STRICT".asInstanceOf[AudioLanguageSelectionPolicy]

    val values = js.Object.freeze(js.Array(LOOSE, STRICT))
  }

  /**
    * Audio Normalization Algorithm
    */
  @js.native
  sealed trait AudioNormalizationAlgorithm extends js.Any
  object AudioNormalizationAlgorithm extends js.Object {
    val ITU_1770_1 = "ITU_1770_1".asInstanceOf[AudioNormalizationAlgorithm]
    val ITU_1770_2 = "ITU_1770_2".asInstanceOf[AudioNormalizationAlgorithm]

    val values = js.Object.freeze(js.Array(ITU_1770_1, ITU_1770_2))
  }

  /**
    * Audio Normalization Algorithm Control
    */
  @js.native
  sealed trait AudioNormalizationAlgorithmControl extends js.Any
  object AudioNormalizationAlgorithmControl extends js.Object {
    val CORRECT_AUDIO = "CORRECT_AUDIO".asInstanceOf[AudioNormalizationAlgorithmControl]

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
    * Audio Only Hls Segment Type
    */
  @js.native
  sealed trait AudioOnlyHlsSegmentType extends js.Any
  object AudioOnlyHlsSegmentType extends js.Object {
    val AAC  = "AAC".asInstanceOf[AudioOnlyHlsSegmentType]
    val FMP4 = "FMP4".asInstanceOf[AudioOnlyHlsSegmentType]

    val values = js.Object.freeze(js.Array(AAC, FMP4))
  }

  /**
    * Audio Only Hls Settings
    */
  @js.native
  trait AudioOnlyHlsSettings extends js.Object {
    var AudioGroupId: js.UndefOr[__string]
    var AudioOnlyImage: js.UndefOr[InputLocation]
    var AudioTrackType: js.UndefOr[AudioOnlyHlsTrackType]
    var SegmentType: js.UndefOr[AudioOnlyHlsSegmentType]
  }

  object AudioOnlyHlsSettings {
    @inline
    def apply(
        AudioGroupId: js.UndefOr[__string] = js.undefined,
        AudioOnlyImage: js.UndefOr[InputLocation] = js.undefined,
        AudioTrackType: js.UndefOr[AudioOnlyHlsTrackType] = js.undefined,
        SegmentType: js.UndefOr[AudioOnlyHlsSegmentType] = js.undefined
    ): AudioOnlyHlsSettings = {
      val __obj = js.Dynamic.literal()
      AudioGroupId.foreach(__v => __obj.updateDynamic("AudioGroupId")(__v.asInstanceOf[js.Any]))
      AudioOnlyImage.foreach(__v => __obj.updateDynamic("AudioOnlyImage")(__v.asInstanceOf[js.Any]))
      AudioTrackType.foreach(__v => __obj.updateDynamic("AudioTrackType")(__v.asInstanceOf[js.Any]))
      SegmentType.foreach(__v => __obj.updateDynamic("SegmentType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioOnlyHlsSettings]
    }
  }

  /**
    * Audio Only Hls Track Type
    */
  @js.native
  sealed trait AudioOnlyHlsTrackType extends js.Any
  object AudioOnlyHlsTrackType extends js.Object {
    val ALTERNATE_AUDIO_AUTO_SELECT         = "ALTERNATE_AUDIO_AUTO_SELECT".asInstanceOf[AudioOnlyHlsTrackType]
    val ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT = "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT".asInstanceOf[AudioOnlyHlsTrackType]
    val ALTERNATE_AUDIO_NOT_AUTO_SELECT     = "ALTERNATE_AUDIO_NOT_AUTO_SELECT".asInstanceOf[AudioOnlyHlsTrackType]
    val AUDIO_ONLY_VARIANT_STREAM           = "AUDIO_ONLY_VARIANT_STREAM".asInstanceOf[AudioOnlyHlsTrackType]

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
    var AudioTrackSelection: js.UndefOr[AudioTrackSelection]
  }

  object AudioSelectorSettings {
    @inline
    def apply(
        AudioLanguageSelection: js.UndefOr[AudioLanguageSelection] = js.undefined,
        AudioPidSelection: js.UndefOr[AudioPidSelection] = js.undefined,
        AudioTrackSelection: js.UndefOr[AudioTrackSelection] = js.undefined
    ): AudioSelectorSettings = {
      val __obj = js.Dynamic.literal()
      AudioLanguageSelection.foreach(__v => __obj.updateDynamic("AudioLanguageSelection")(__v.asInstanceOf[js.Any]))
      AudioPidSelection.foreach(__v => __obj.updateDynamic("AudioPidSelection")(__v.asInstanceOf[js.Any]))
      AudioTrackSelection.foreach(__v => __obj.updateDynamic("AudioTrackSelection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AudioSelectorSettings]
    }
  }

  /**
    * Audio Track
    */
  @js.native
  trait AudioTrack extends js.Object {
    var Track: __integerMin1
  }

  object AudioTrack {
    @inline
    def apply(
        Track: __integerMin1
    ): AudioTrack = {
      val __obj = js.Dynamic.literal(
        "Track" -> Track.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AudioTrack]
    }
  }

  /**
    * Audio Track Selection
    */
  @js.native
  trait AudioTrackSelection extends js.Object {
    var Tracks: __listOfAudioTrack
  }

  object AudioTrackSelection {
    @inline
    def apply(
        Tracks: __listOfAudioTrack
    ): AudioTrackSelection = {
      val __obj = js.Dynamic.literal(
        "Tracks" -> Tracks.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AudioTrackSelection]
    }
  }

  /**
    * Audio Type
    */
  @js.native
  sealed trait AudioType extends js.Any
  object AudioType extends js.Object {
    val CLEAN_EFFECTS              = "CLEAN_EFFECTS".asInstanceOf[AudioType]
    val HEARING_IMPAIRED           = "HEARING_IMPAIRED".asInstanceOf[AudioType]
    val UNDEFINED                  = "UNDEFINED".asInstanceOf[AudioType]
    val VISUAL_IMPAIRED_COMMENTARY = "VISUAL_IMPAIRED_COMMENTARY".asInstanceOf[AudioType]

    val values = js.Object.freeze(js.Array(CLEAN_EFFECTS, HEARING_IMPAIRED, UNDEFINED, VISUAL_IMPAIRED_COMMENTARY))
  }

  /**
    * Authentication Scheme
    */
  @js.native
  sealed trait AuthenticationScheme extends js.Any
  object AuthenticationScheme extends js.Object {
    val AKAMAI = "AKAMAI".asInstanceOf[AuthenticationScheme]
    val COMMON = "COMMON".asInstanceOf[AuthenticationScheme]

    val values = js.Object.freeze(js.Array(AKAMAI, COMMON))
  }

  /**
    * The settings for Automatic Input Failover.
    */
  @js.native
  trait AutomaticInputFailoverSettings extends js.Object {
    var SecondaryInputId: __string
    var InputPreference: js.UndefOr[InputPreference]
  }

  object AutomaticInputFailoverSettings {
    @inline
    def apply(
        SecondaryInputId: __string,
        InputPreference: js.UndefOr[InputPreference] = js.undefined
    ): AutomaticInputFailoverSettings = {
      val __obj = js.Dynamic.literal(
        "SecondaryInputId" -> SecondaryInputId.asInstanceOf[js.Any]
      )

      InputPreference.foreach(__v => __obj.updateDynamic("InputPreference")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutomaticInputFailoverSettings]
    }
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
  @js.native
  sealed trait AvailBlankingState extends js.Any
  object AvailBlankingState extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[AvailBlankingState]
    val ENABLED  = "ENABLED".asInstanceOf[AvailBlankingState]

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
  @js.native
  sealed trait BlackoutSlateNetworkEndBlackout extends js.Any
  object BlackoutSlateNetworkEndBlackout extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[BlackoutSlateNetworkEndBlackout]
    val ENABLED  = "ENABLED".asInstanceOf[BlackoutSlateNetworkEndBlackout]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Blackout Slate State
    */
  @js.native
  sealed trait BlackoutSlateState extends js.Any
  object BlackoutSlateState extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[BlackoutSlateState]
    val ENABLED  = "ENABLED".asInstanceOf[BlackoutSlateState]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Burn In Alignment
    */
  @js.native
  sealed trait BurnInAlignment extends js.Any
  object BurnInAlignment extends js.Object {
    val CENTERED = "CENTERED".asInstanceOf[BurnInAlignment]
    val LEFT     = "LEFT".asInstanceOf[BurnInAlignment]
    val SMART    = "SMART".asInstanceOf[BurnInAlignment]

    val values = js.Object.freeze(js.Array(CENTERED, LEFT, SMART))
  }

  /**
    * Burn In Background Color
    */
  @js.native
  sealed trait BurnInBackgroundColor extends js.Any
  object BurnInBackgroundColor extends js.Object {
    val BLACK = "BLACK".asInstanceOf[BurnInBackgroundColor]
    val NONE  = "NONE".asInstanceOf[BurnInBackgroundColor]
    val WHITE = "WHITE".asInstanceOf[BurnInBackgroundColor]

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
  @js.native
  sealed trait BurnInFontColor extends js.Any
  object BurnInFontColor extends js.Object {
    val BLACK  = "BLACK".asInstanceOf[BurnInFontColor]
    val BLUE   = "BLUE".asInstanceOf[BurnInFontColor]
    val GREEN  = "GREEN".asInstanceOf[BurnInFontColor]
    val RED    = "RED".asInstanceOf[BurnInFontColor]
    val WHITE  = "WHITE".asInstanceOf[BurnInFontColor]
    val YELLOW = "YELLOW".asInstanceOf[BurnInFontColor]

    val values = js.Object.freeze(js.Array(BLACK, BLUE, GREEN, RED, WHITE, YELLOW))
  }

  /**
    * Burn In Outline Color
    */
  @js.native
  sealed trait BurnInOutlineColor extends js.Any
  object BurnInOutlineColor extends js.Object {
    val BLACK  = "BLACK".asInstanceOf[BurnInOutlineColor]
    val BLUE   = "BLUE".asInstanceOf[BurnInOutlineColor]
    val GREEN  = "GREEN".asInstanceOf[BurnInOutlineColor]
    val RED    = "RED".asInstanceOf[BurnInOutlineColor]
    val WHITE  = "WHITE".asInstanceOf[BurnInOutlineColor]
    val YELLOW = "YELLOW".asInstanceOf[BurnInOutlineColor]

    val values = js.Object.freeze(js.Array(BLACK, BLUE, GREEN, RED, WHITE, YELLOW))
  }

  /**
    * Burn In Shadow Color
    */
  @js.native
  sealed trait BurnInShadowColor extends js.Any
  object BurnInShadowColor extends js.Object {
    val BLACK = "BLACK".asInstanceOf[BurnInShadowColor]
    val NONE  = "NONE".asInstanceOf[BurnInShadowColor]
    val WHITE = "WHITE".asInstanceOf[BurnInShadowColor]

    val values = js.Object.freeze(js.Array(BLACK, NONE, WHITE))
  }

  /**
    * Burn In Teletext Grid Control
    */
  @js.native
  sealed trait BurnInTeletextGridControl extends js.Any
  object BurnInTeletextGridControl extends js.Object {
    val FIXED  = "FIXED".asInstanceOf[BurnInTeletextGridControl]
    val SCALED = "SCALED".asInstanceOf[BurnInTeletextGridControl]

    val values = js.Object.freeze(js.Array(FIXED, SCALED))
  }

  /**
    * Caption Description
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
      BurnInDestinationSettings.foreach(__v =>
        __obj.updateDynamic("BurnInDestinationSettings")(__v.asInstanceOf[js.Any])
      )
      DvbSubDestinationSettings.foreach(__v =>
        __obj.updateDynamic("DvbSubDestinationSettings")(__v.asInstanceOf[js.Any])
      )
      EmbeddedDestinationSettings.foreach(__v =>
        __obj.updateDynamic("EmbeddedDestinationSettings")(__v.asInstanceOf[js.Any])
      )
      EmbeddedPlusScte20DestinationSettings.foreach(__v =>
        __obj.updateDynamic("EmbeddedPlusScte20DestinationSettings")(__v.asInstanceOf[js.Any])
      )
      RtmpCaptionInfoDestinationSettings.foreach(__v =>
        __obj.updateDynamic("RtmpCaptionInfoDestinationSettings")(__v.asInstanceOf[js.Any])
      )
      Scte20PlusEmbeddedDestinationSettings.foreach(__v =>
        __obj.updateDynamic("Scte20PlusEmbeddedDestinationSettings")(__v.asInstanceOf[js.Any])
      )
      Scte27DestinationSettings.foreach(__v =>
        __obj.updateDynamic("Scte27DestinationSettings")(__v.asInstanceOf[js.Any])
      )
      SmpteTtDestinationSettings.foreach(__v =>
        __obj.updateDynamic("SmpteTtDestinationSettings")(__v.asInstanceOf[js.Any])
      )
      TeletextDestinationSettings.foreach(__v =>
        __obj.updateDynamic("TeletextDestinationSettings")(__v.asInstanceOf[js.Any])
      )
      TtmlDestinationSettings.foreach(__v => __obj.updateDynamic("TtmlDestinationSettings")(__v.asInstanceOf[js.Any]))
      WebvttDestinationSettings.foreach(__v =>
        __obj.updateDynamic("WebvttDestinationSettings")(__v.asInstanceOf[js.Any])
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
  @js.native
  sealed trait ChannelClass extends js.Any
  object ChannelClass extends js.Object {
    val STANDARD        = "STANDARD".asInstanceOf[ChannelClass]
    val SINGLE_PIPELINE = "SINGLE_PIPELINE".asInstanceOf[ChannelClass]

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
  @js.native
  sealed trait ChannelState extends js.Any
  object ChannelState extends js.Object {
    val CREATING      = "CREATING".asInstanceOf[ChannelState]
    val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[ChannelState]
    val IDLE          = "IDLE".asInstanceOf[ChannelState]
    val STARTING      = "STARTING".asInstanceOf[ChannelState]
    val RUNNING       = "RUNNING".asInstanceOf[ChannelState]
    val RECOVERING    = "RECOVERING".asInstanceOf[ChannelState]
    val STOPPING      = "STOPPING".asInstanceOf[ChannelState]
    val DELETING      = "DELETING".asInstanceOf[ChannelState]
    val DELETED       = "DELETED".asInstanceOf[ChannelState]
    val UPDATING      = "UPDATING".asInstanceOf[ChannelState]
    val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[ChannelState]

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
    * Passthrough applies no color space conversion to the output
    */
  @js.native
  trait ColorSpacePassthroughSettings extends js.Object {}

  object ColorSpacePassthroughSettings {
    @inline
    def apply(
    ): ColorSpacePassthroughSettings = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ColorSpacePassthroughSettings]
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
    var InputDevices: js.UndefOr[__listOfInputDeviceSettings]
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
        InputDevices: js.UndefOr[__listOfInputDeviceSettings] = js.undefined,
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
      InputDevices.foreach(__v => __obj.updateDynamic("InputDevices")(__v.asInstanceOf[js.Any]))
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
    * A request to create a program in a multiplex.
    */
  @js.native
  trait CreateMultiplexProgramRequest extends js.Object {
    var MultiplexId: __string
    var MultiplexProgramSettings: MultiplexProgramSettings
    var ProgramName: __string
    var RequestId: __string
  }

  object CreateMultiplexProgramRequest {
    @inline
    def apply(
        MultiplexId: __string,
        MultiplexProgramSettings: MultiplexProgramSettings,
        ProgramName: __string,
        RequestId: __string
    ): CreateMultiplexProgramRequest = {
      val __obj = js.Dynamic.literal(
        "MultiplexId"              -> MultiplexId.asInstanceOf[js.Any],
        "MultiplexProgramSettings" -> MultiplexProgramSettings.asInstanceOf[js.Any],
        "ProgramName"              -> ProgramName.asInstanceOf[js.Any],
        "RequestId"                -> RequestId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateMultiplexProgramRequest]
    }
  }

  /**
    * Placeholder documentation for CreateMultiplexProgramResponse
    */
  @js.native
  trait CreateMultiplexProgramResponse extends js.Object {
    var MultiplexProgram: js.UndefOr[MultiplexProgram]
  }

  object CreateMultiplexProgramResponse {
    @inline
    def apply(
        MultiplexProgram: js.UndefOr[MultiplexProgram] = js.undefined
    ): CreateMultiplexProgramResponse = {
      val __obj = js.Dynamic.literal()
      MultiplexProgram.foreach(__v => __obj.updateDynamic("MultiplexProgram")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMultiplexProgramResponse]
    }
  }

  /**
    * A request to create a multiplex.
    */
  @js.native
  trait CreateMultiplexRequest extends js.Object {
    var AvailabilityZones: __listOf__string
    var MultiplexSettings: MultiplexSettings
    var Name: __string
    var RequestId: __string
    var Tags: js.UndefOr[Tags]
  }

  object CreateMultiplexRequest {
    @inline
    def apply(
        AvailabilityZones: __listOf__string,
        MultiplexSettings: MultiplexSettings,
        Name: __string,
        RequestId: __string,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateMultiplexRequest = {
      val __obj = js.Dynamic.literal(
        "AvailabilityZones" -> AvailabilityZones.asInstanceOf[js.Any],
        "MultiplexSettings" -> MultiplexSettings.asInstanceOf[js.Any],
        "Name"              -> Name.asInstanceOf[js.Any],
        "RequestId"         -> RequestId.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMultiplexRequest]
    }
  }

  /**
    * Placeholder documentation for CreateMultiplexResponse
    */
  @js.native
  trait CreateMultiplexResponse extends js.Object {
    var Multiplex: js.UndefOr[Multiplex]
  }

  object CreateMultiplexResponse {
    @inline
    def apply(
        Multiplex: js.UndefOr[Multiplex] = js.undefined
    ): CreateMultiplexResponse = {
      val __obj = js.Dynamic.literal()
      Multiplex.foreach(__v => __obj.updateDynamic("Multiplex")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMultiplexResponse]
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
    * Placeholder documentation for DeleteMultiplexProgramRequest
    */
  @js.native
  trait DeleteMultiplexProgramRequest extends js.Object {
    var MultiplexId: __string
    var ProgramName: __string
  }

  object DeleteMultiplexProgramRequest {
    @inline
    def apply(
        MultiplexId: __string,
        ProgramName: __string
    ): DeleteMultiplexProgramRequest = {
      val __obj = js.Dynamic.literal(
        "MultiplexId" -> MultiplexId.asInstanceOf[js.Any],
        "ProgramName" -> ProgramName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteMultiplexProgramRequest]
    }
  }

  /**
    * Placeholder documentation for DeleteMultiplexProgramResponse
    */
  @js.native
  trait DeleteMultiplexProgramResponse extends js.Object {
    var ChannelId: js.UndefOr[__string]
    var MultiplexProgramSettings: js.UndefOr[MultiplexProgramSettings]
    var PacketIdentifiersMap: js.UndefOr[MultiplexProgramPacketIdentifiersMap]
    var ProgramName: js.UndefOr[__string]
  }

  object DeleteMultiplexProgramResponse {
    @inline
    def apply(
        ChannelId: js.UndefOr[__string] = js.undefined,
        MultiplexProgramSettings: js.UndefOr[MultiplexProgramSettings] = js.undefined,
        PacketIdentifiersMap: js.UndefOr[MultiplexProgramPacketIdentifiersMap] = js.undefined,
        ProgramName: js.UndefOr[__string] = js.undefined
    ): DeleteMultiplexProgramResponse = {
      val __obj = js.Dynamic.literal()
      ChannelId.foreach(__v => __obj.updateDynamic("ChannelId")(__v.asInstanceOf[js.Any]))
      MultiplexProgramSettings.foreach(__v => __obj.updateDynamic("MultiplexProgramSettings")(__v.asInstanceOf[js.Any]))
      PacketIdentifiersMap.foreach(__v => __obj.updateDynamic("PacketIdentifiersMap")(__v.asInstanceOf[js.Any]))
      ProgramName.foreach(__v => __obj.updateDynamic("ProgramName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteMultiplexProgramResponse]
    }
  }

  /**
    * Placeholder documentation for DeleteMultiplexRequest
    */
  @js.native
  trait DeleteMultiplexRequest extends js.Object {
    var MultiplexId: __string
  }

  object DeleteMultiplexRequest {
    @inline
    def apply(
        MultiplexId: __string
    ): DeleteMultiplexRequest = {
      val __obj = js.Dynamic.literal(
        "MultiplexId" -> MultiplexId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteMultiplexRequest]
    }
  }

  /**
    * Placeholder documentation for DeleteMultiplexResponse
    */
  @js.native
  trait DeleteMultiplexResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var AvailabilityZones: js.UndefOr[__listOf__string]
    var Destinations: js.UndefOr[__listOfMultiplexOutputDestination]
    var Id: js.UndefOr[__string]
    var MultiplexSettings: js.UndefOr[MultiplexSettings]
    var Name: js.UndefOr[__string]
    var PipelinesRunningCount: js.UndefOr[__integer]
    var ProgramCount: js.UndefOr[__integer]
    var State: js.UndefOr[MultiplexState]
    var Tags: js.UndefOr[Tags]
  }

  object DeleteMultiplexResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        AvailabilityZones: js.UndefOr[__listOf__string] = js.undefined,
        Destinations: js.UndefOr[__listOfMultiplexOutputDestination] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        MultiplexSettings: js.UndefOr[MultiplexSettings] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        PipelinesRunningCount: js.UndefOr[__integer] = js.undefined,
        ProgramCount: js.UndefOr[__integer] = js.undefined,
        State: js.UndefOr[MultiplexState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DeleteMultiplexResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      MultiplexSettings.foreach(__v => __obj.updateDynamic("MultiplexSettings")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PipelinesRunningCount.foreach(__v => __obj.updateDynamic("PipelinesRunningCount")(__v.asInstanceOf[js.Any]))
      ProgramCount.foreach(__v => __obj.updateDynamic("ProgramCount")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteMultiplexResponse]
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
    * Placeholder documentation for DescribeInputDeviceRequest
    */
  @js.native
  trait DescribeInputDeviceRequest extends js.Object {
    var InputDeviceId: __string
  }

  object DescribeInputDeviceRequest {
    @inline
    def apply(
        InputDeviceId: __string
    ): DescribeInputDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "InputDeviceId" -> InputDeviceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeInputDeviceRequest]
    }
  }

  /**
    * Placeholder documentation for DescribeInputDeviceResponse
    */
  @js.native
  trait DescribeInputDeviceResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var ConnectionState: js.UndefOr[InputDeviceConnectionState]
    var DeviceSettingsSyncState: js.UndefOr[DeviceSettingsSyncState]
    var HdDeviceSettings: js.UndefOr[InputDeviceHdSettings]
    var Id: js.UndefOr[__string]
    var MacAddress: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var NetworkSettings: js.UndefOr[InputDeviceNetworkSettings]
    var SerialNumber: js.UndefOr[__string]
    var Type: js.UndefOr[InputDeviceType]
  }

  object DescribeInputDeviceResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        ConnectionState: js.UndefOr[InputDeviceConnectionState] = js.undefined,
        DeviceSettingsSyncState: js.UndefOr[DeviceSettingsSyncState] = js.undefined,
        HdDeviceSettings: js.UndefOr[InputDeviceHdSettings] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        MacAddress: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        NetworkSettings: js.UndefOr[InputDeviceNetworkSettings] = js.undefined,
        SerialNumber: js.UndefOr[__string] = js.undefined,
        Type: js.UndefOr[InputDeviceType] = js.undefined
    ): DescribeInputDeviceResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ConnectionState.foreach(__v => __obj.updateDynamic("ConnectionState")(__v.asInstanceOf[js.Any]))
      DeviceSettingsSyncState.foreach(__v => __obj.updateDynamic("DeviceSettingsSyncState")(__v.asInstanceOf[js.Any]))
      HdDeviceSettings.foreach(__v => __obj.updateDynamic("HdDeviceSettings")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      MacAddress.foreach(__v => __obj.updateDynamic("MacAddress")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NetworkSettings.foreach(__v => __obj.updateDynamic("NetworkSettings")(__v.asInstanceOf[js.Any]))
      SerialNumber.foreach(__v => __obj.updateDynamic("SerialNumber")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInputDeviceResponse]
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
    var InputDevices: js.UndefOr[__listOfInputDeviceSettings]
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
        InputDevices: js.UndefOr[__listOfInputDeviceSettings] = js.undefined,
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
      InputDevices.foreach(__v => __obj.updateDynamic("InputDevices")(__v.asInstanceOf[js.Any]))
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
    * Placeholder documentation for DescribeMultiplexProgramRequest
    */
  @js.native
  trait DescribeMultiplexProgramRequest extends js.Object {
    var MultiplexId: __string
    var ProgramName: __string
  }

  object DescribeMultiplexProgramRequest {
    @inline
    def apply(
        MultiplexId: __string,
        ProgramName: __string
    ): DescribeMultiplexProgramRequest = {
      val __obj = js.Dynamic.literal(
        "MultiplexId" -> MultiplexId.asInstanceOf[js.Any],
        "ProgramName" -> ProgramName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeMultiplexProgramRequest]
    }
  }

  /**
    * Placeholder documentation for DescribeMultiplexProgramResponse
    */
  @js.native
  trait DescribeMultiplexProgramResponse extends js.Object {
    var ChannelId: js.UndefOr[__string]
    var MultiplexProgramSettings: js.UndefOr[MultiplexProgramSettings]
    var PacketIdentifiersMap: js.UndefOr[MultiplexProgramPacketIdentifiersMap]
    var ProgramName: js.UndefOr[__string]
  }

  object DescribeMultiplexProgramResponse {
    @inline
    def apply(
        ChannelId: js.UndefOr[__string] = js.undefined,
        MultiplexProgramSettings: js.UndefOr[MultiplexProgramSettings] = js.undefined,
        PacketIdentifiersMap: js.UndefOr[MultiplexProgramPacketIdentifiersMap] = js.undefined,
        ProgramName: js.UndefOr[__string] = js.undefined
    ): DescribeMultiplexProgramResponse = {
      val __obj = js.Dynamic.literal()
      ChannelId.foreach(__v => __obj.updateDynamic("ChannelId")(__v.asInstanceOf[js.Any]))
      MultiplexProgramSettings.foreach(__v => __obj.updateDynamic("MultiplexProgramSettings")(__v.asInstanceOf[js.Any]))
      PacketIdentifiersMap.foreach(__v => __obj.updateDynamic("PacketIdentifiersMap")(__v.asInstanceOf[js.Any]))
      ProgramName.foreach(__v => __obj.updateDynamic("ProgramName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMultiplexProgramResponse]
    }
  }

  /**
    * Placeholder documentation for DescribeMultiplexRequest
    */
  @js.native
  trait DescribeMultiplexRequest extends js.Object {
    var MultiplexId: __string
  }

  object DescribeMultiplexRequest {
    @inline
    def apply(
        MultiplexId: __string
    ): DescribeMultiplexRequest = {
      val __obj = js.Dynamic.literal(
        "MultiplexId" -> MultiplexId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeMultiplexRequest]
    }
  }

  /**
    * Placeholder documentation for DescribeMultiplexResponse
    */
  @js.native
  trait DescribeMultiplexResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var AvailabilityZones: js.UndefOr[__listOf__string]
    var Destinations: js.UndefOr[__listOfMultiplexOutputDestination]
    var Id: js.UndefOr[__string]
    var MultiplexSettings: js.UndefOr[MultiplexSettings]
    var Name: js.UndefOr[__string]
    var PipelinesRunningCount: js.UndefOr[__integer]
    var ProgramCount: js.UndefOr[__integer]
    var State: js.UndefOr[MultiplexState]
    var Tags: js.UndefOr[Tags]
  }

  object DescribeMultiplexResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        AvailabilityZones: js.UndefOr[__listOf__string] = js.undefined,
        Destinations: js.UndefOr[__listOfMultiplexOutputDestination] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        MultiplexSettings: js.UndefOr[MultiplexSettings] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        PipelinesRunningCount: js.UndefOr[__integer] = js.undefined,
        ProgramCount: js.UndefOr[__integer] = js.undefined,
        State: js.UndefOr[MultiplexState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DescribeMultiplexResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      MultiplexSettings.foreach(__v => __obj.updateDynamic("MultiplexSettings")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PipelinesRunningCount.foreach(__v => __obj.updateDynamic("PipelinesRunningCount")(__v.asInstanceOf[js.Any]))
      ProgramCount.foreach(__v => __obj.updateDynamic("ProgramCount")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMultiplexResponse]
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
    * The status of the action to synchronize the device configuration. If you change the configuration of the input device (for example, the maximum bitrate), MediaLive sends the new data to the device. The device might not update itself immediately. SYNCED means the device has updated its configuration. SYNCING means that it has not updated its configuration.
    */
  @js.native
  sealed trait DeviceSettingsSyncState extends js.Any
  object DeviceSettingsSyncState extends js.Object {
    val SYNCED  = "SYNCED".asInstanceOf[DeviceSettingsSyncState]
    val SYNCING = "SYNCING".asInstanceOf[DeviceSettingsSyncState]

    val values = js.Object.freeze(js.Array(SYNCED, SYNCING))
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
  @js.native
  sealed trait DvbSdtOutputSdt extends js.Any
  object DvbSdtOutputSdt extends js.Object {
    val SDT_FOLLOW            = "SDT_FOLLOW".asInstanceOf[DvbSdtOutputSdt]
    val SDT_FOLLOW_IF_PRESENT = "SDT_FOLLOW_IF_PRESENT".asInstanceOf[DvbSdtOutputSdt]
    val SDT_MANUAL            = "SDT_MANUAL".asInstanceOf[DvbSdtOutputSdt]
    val SDT_NONE              = "SDT_NONE".asInstanceOf[DvbSdtOutputSdt]

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
  @js.native
  sealed trait DvbSubDestinationAlignment extends js.Any
  object DvbSubDestinationAlignment extends js.Object {
    val CENTERED = "CENTERED".asInstanceOf[DvbSubDestinationAlignment]
    val LEFT     = "LEFT".asInstanceOf[DvbSubDestinationAlignment]
    val SMART    = "SMART".asInstanceOf[DvbSubDestinationAlignment]

    val values = js.Object.freeze(js.Array(CENTERED, LEFT, SMART))
  }

  /**
    * Dvb Sub Destination Background Color
    */
  @js.native
  sealed trait DvbSubDestinationBackgroundColor extends js.Any
  object DvbSubDestinationBackgroundColor extends js.Object {
    val BLACK = "BLACK".asInstanceOf[DvbSubDestinationBackgroundColor]
    val NONE  = "NONE".asInstanceOf[DvbSubDestinationBackgroundColor]
    val WHITE = "WHITE".asInstanceOf[DvbSubDestinationBackgroundColor]

    val values = js.Object.freeze(js.Array(BLACK, NONE, WHITE))
  }

  /**
    * Dvb Sub Destination Font Color
    */
  @js.native
  sealed trait DvbSubDestinationFontColor extends js.Any
  object DvbSubDestinationFontColor extends js.Object {
    val BLACK  = "BLACK".asInstanceOf[DvbSubDestinationFontColor]
    val BLUE   = "BLUE".asInstanceOf[DvbSubDestinationFontColor]
    val GREEN  = "GREEN".asInstanceOf[DvbSubDestinationFontColor]
    val RED    = "RED".asInstanceOf[DvbSubDestinationFontColor]
    val WHITE  = "WHITE".asInstanceOf[DvbSubDestinationFontColor]
    val YELLOW = "YELLOW".asInstanceOf[DvbSubDestinationFontColor]

    val values = js.Object.freeze(js.Array(BLACK, BLUE, GREEN, RED, WHITE, YELLOW))
  }

  /**
    * Dvb Sub Destination Outline Color
    */
  @js.native
  sealed trait DvbSubDestinationOutlineColor extends js.Any
  object DvbSubDestinationOutlineColor extends js.Object {
    val BLACK  = "BLACK".asInstanceOf[DvbSubDestinationOutlineColor]
    val BLUE   = "BLUE".asInstanceOf[DvbSubDestinationOutlineColor]
    val GREEN  = "GREEN".asInstanceOf[DvbSubDestinationOutlineColor]
    val RED    = "RED".asInstanceOf[DvbSubDestinationOutlineColor]
    val WHITE  = "WHITE".asInstanceOf[DvbSubDestinationOutlineColor]
    val YELLOW = "YELLOW".asInstanceOf[DvbSubDestinationOutlineColor]

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
  @js.native
  sealed trait DvbSubDestinationShadowColor extends js.Any
  object DvbSubDestinationShadowColor extends js.Object {
    val BLACK = "BLACK".asInstanceOf[DvbSubDestinationShadowColor]
    val NONE  = "NONE".asInstanceOf[DvbSubDestinationShadowColor]
    val WHITE = "WHITE".asInstanceOf[DvbSubDestinationShadowColor]

    val values = js.Object.freeze(js.Array(BLACK, NONE, WHITE))
  }

  /**
    * Dvb Sub Destination Teletext Grid Control
    */
  @js.native
  sealed trait DvbSubDestinationTeletextGridControl extends js.Any
  object DvbSubDestinationTeletextGridControl extends js.Object {
    val FIXED  = "FIXED".asInstanceOf[DvbSubDestinationTeletextGridControl]
    val SCALED = "SCALED".asInstanceOf[DvbSubDestinationTeletextGridControl]

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
  @js.native
  sealed trait Eac3AttenuationControl extends js.Any
  object Eac3AttenuationControl extends js.Object {
    val ATTENUATE_3_DB = "ATTENUATE_3_DB".asInstanceOf[Eac3AttenuationControl]
    val NONE           = "NONE".asInstanceOf[Eac3AttenuationControl]

    val values = js.Object.freeze(js.Array(ATTENUATE_3_DB, NONE))
  }

  /**
    * Eac3 Bitstream Mode
    */
  @js.native
  sealed trait Eac3BitstreamMode extends js.Any
  object Eac3BitstreamMode extends js.Object {
    val COMMENTARY        = "COMMENTARY".asInstanceOf[Eac3BitstreamMode]
    val COMPLETE_MAIN     = "COMPLETE_MAIN".asInstanceOf[Eac3BitstreamMode]
    val EMERGENCY         = "EMERGENCY".asInstanceOf[Eac3BitstreamMode]
    val HEARING_IMPAIRED  = "HEARING_IMPAIRED".asInstanceOf[Eac3BitstreamMode]
    val VISUALLY_IMPAIRED = "VISUALLY_IMPAIRED".asInstanceOf[Eac3BitstreamMode]

    val values = js.Object.freeze(js.Array(COMMENTARY, COMPLETE_MAIN, EMERGENCY, HEARING_IMPAIRED, VISUALLY_IMPAIRED))
  }

  /**
    * Eac3 Coding Mode
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
    * Eac3 Dc Filter
    */
  @js.native
  sealed trait Eac3DcFilter extends js.Any
  object Eac3DcFilter extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[Eac3DcFilter]
    val ENABLED  = "ENABLED".asInstanceOf[Eac3DcFilter]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Eac3 Drc Line
    */
  @js.native
  sealed trait Eac3DrcLine extends js.Any
  object Eac3DrcLine extends js.Object {
    val FILM_LIGHT     = "FILM_LIGHT".asInstanceOf[Eac3DrcLine]
    val FILM_STANDARD  = "FILM_STANDARD".asInstanceOf[Eac3DrcLine]
    val MUSIC_LIGHT    = "MUSIC_LIGHT".asInstanceOf[Eac3DrcLine]
    val MUSIC_STANDARD = "MUSIC_STANDARD".asInstanceOf[Eac3DrcLine]
    val NONE           = "NONE".asInstanceOf[Eac3DrcLine]
    val SPEECH         = "SPEECH".asInstanceOf[Eac3DrcLine]

    val values = js.Object.freeze(js.Array(FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT, MUSIC_STANDARD, NONE, SPEECH))
  }

  /**
    * Eac3 Drc Rf
    */
  @js.native
  sealed trait Eac3DrcRf extends js.Any
  object Eac3DrcRf extends js.Object {
    val FILM_LIGHT     = "FILM_LIGHT".asInstanceOf[Eac3DrcRf]
    val FILM_STANDARD  = "FILM_STANDARD".asInstanceOf[Eac3DrcRf]
    val MUSIC_LIGHT    = "MUSIC_LIGHT".asInstanceOf[Eac3DrcRf]
    val MUSIC_STANDARD = "MUSIC_STANDARD".asInstanceOf[Eac3DrcRf]
    val NONE           = "NONE".asInstanceOf[Eac3DrcRf]
    val SPEECH         = "SPEECH".asInstanceOf[Eac3DrcRf]

    val values = js.Object.freeze(js.Array(FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT, MUSIC_STANDARD, NONE, SPEECH))
  }

  /**
    * Eac3 Lfe Control
    */
  @js.native
  sealed trait Eac3LfeControl extends js.Any
  object Eac3LfeControl extends js.Object {
    val LFE    = "LFE".asInstanceOf[Eac3LfeControl]
    val NO_LFE = "NO_LFE".asInstanceOf[Eac3LfeControl]

    val values = js.Object.freeze(js.Array(LFE, NO_LFE))
  }

  /**
    * Eac3 Lfe Filter
    */
  @js.native
  sealed trait Eac3LfeFilter extends js.Any
  object Eac3LfeFilter extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[Eac3LfeFilter]
    val ENABLED  = "ENABLED".asInstanceOf[Eac3LfeFilter]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Eac3 Metadata Control
    */
  @js.native
  sealed trait Eac3MetadataControl extends js.Any
  object Eac3MetadataControl extends js.Object {
    val FOLLOW_INPUT   = "FOLLOW_INPUT".asInstanceOf[Eac3MetadataControl]
    val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[Eac3MetadataControl]

    val values = js.Object.freeze(js.Array(FOLLOW_INPUT, USE_CONFIGURED))
  }

  /**
    * Eac3 Passthrough Control
    */
  @js.native
  sealed trait Eac3PassthroughControl extends js.Any
  object Eac3PassthroughControl extends js.Object {
    val NO_PASSTHROUGH = "NO_PASSTHROUGH".asInstanceOf[Eac3PassthroughControl]
    val WHEN_POSSIBLE  = "WHEN_POSSIBLE".asInstanceOf[Eac3PassthroughControl]

    val values = js.Object.freeze(js.Array(NO_PASSTHROUGH, WHEN_POSSIBLE))
  }

  /**
    * Eac3 Phase Control
    */
  @js.native
  sealed trait Eac3PhaseControl extends js.Any
  object Eac3PhaseControl extends js.Object {
    val NO_SHIFT         = "NO_SHIFT".asInstanceOf[Eac3PhaseControl]
    val SHIFT_90_DEGREES = "SHIFT_90_DEGREES".asInstanceOf[Eac3PhaseControl]

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
  @js.native
  sealed trait Eac3StereoDownmix extends js.Any
  object Eac3StereoDownmix extends js.Object {
    val DPL2          = "DPL2".asInstanceOf[Eac3StereoDownmix]
    val LO_RO         = "LO_RO".asInstanceOf[Eac3StereoDownmix]
    val LT_RT         = "LT_RT".asInstanceOf[Eac3StereoDownmix]
    val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3StereoDownmix]

    val values = js.Object.freeze(js.Array(DPL2, LO_RO, LT_RT, NOT_INDICATED))
  }

  /**
    * Eac3 Surround Ex Mode
    */
  @js.native
  sealed trait Eac3SurroundExMode extends js.Any
  object Eac3SurroundExMode extends js.Object {
    val DISABLED      = "DISABLED".asInstanceOf[Eac3SurroundExMode]
    val ENABLED       = "ENABLED".asInstanceOf[Eac3SurroundExMode]
    val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3SurroundExMode]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED, NOT_INDICATED))
  }

  /**
    * Eac3 Surround Mode
    */
  @js.native
  sealed trait Eac3SurroundMode extends js.Any
  object Eac3SurroundMode extends js.Object {
    val DISABLED      = "DISABLED".asInstanceOf[Eac3SurroundMode]
    val ENABLED       = "ENABLED".asInstanceOf[Eac3SurroundMode]
    val NOT_INDICATED = "NOT_INDICATED".asInstanceOf[Eac3SurroundMode]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED, NOT_INDICATED))
  }

  /**
    * Embedded Convert608 To708
    */
  @js.native
  sealed trait EmbeddedConvert608To708 extends js.Any
  object EmbeddedConvert608To708 extends js.Object {
    val DISABLED  = "DISABLED".asInstanceOf[EmbeddedConvert608To708]
    val UPCONVERT = "UPCONVERT".asInstanceOf[EmbeddedConvert608To708]

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
  @js.native
  sealed trait EmbeddedScte20Detection extends js.Any
  object EmbeddedScte20Detection extends js.Object {
    val AUTO = "AUTO".asInstanceOf[EmbeddedScte20Detection]
    val OFF  = "OFF".asInstanceOf[EmbeddedScte20Detection]

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
    var FeatureActivations: js.UndefOr[FeatureActivations]
    var GlobalConfiguration: js.UndefOr[GlobalConfiguration]
    var NielsenConfiguration: js.UndefOr[NielsenConfiguration]
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
        FeatureActivations: js.UndefOr[FeatureActivations] = js.undefined,
        GlobalConfiguration: js.UndefOr[GlobalConfiguration] = js.undefined,
        NielsenConfiguration: js.UndefOr[NielsenConfiguration] = js.undefined
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
      FeatureActivations.foreach(__v => __obj.updateDynamic("FeatureActivations")(__v.asInstanceOf[js.Any]))
      GlobalConfiguration.foreach(__v => __obj.updateDynamic("GlobalConfiguration")(__v.asInstanceOf[js.Any]))
      NielsenConfiguration.foreach(__v => __obj.updateDynamic("NielsenConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncoderSettings]
    }
  }

  /**
    * Feature Activations
    */
  @js.native
  trait FeatureActivations extends js.Object {
    var InputPrepareScheduleActions: js.UndefOr[FeatureActivationsInputPrepareScheduleActions]
  }

  object FeatureActivations {
    @inline
    def apply(
        InputPrepareScheduleActions: js.UndefOr[FeatureActivationsInputPrepareScheduleActions] = js.undefined
    ): FeatureActivations = {
      val __obj = js.Dynamic.literal()
      InputPrepareScheduleActions.foreach(__v =>
        __obj.updateDynamic("InputPrepareScheduleActions")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[FeatureActivations]
    }
  }

  /**
    * Feature Activations Input Prepare Schedule Actions
    */
  @js.native
  sealed trait FeatureActivationsInputPrepareScheduleActions extends js.Any
  object FeatureActivationsInputPrepareScheduleActions extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[FeatureActivationsInputPrepareScheduleActions]
    val ENABLED  = "ENABLED".asInstanceOf[FeatureActivationsInputPrepareScheduleActions]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Fec Output Include Fec
    */
  @js.native
  sealed trait FecOutputIncludeFec extends js.Any
  object FecOutputIncludeFec extends js.Object {
    val COLUMN         = "COLUMN".asInstanceOf[FecOutputIncludeFec]
    val COLUMN_AND_ROW = "COLUMN_AND_ROW".asInstanceOf[FecOutputIncludeFec]

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
  @js.native
  sealed trait FixedAfd extends js.Any
  object FixedAfd extends js.Object {
    val AFD_0000 = "AFD_0000".asInstanceOf[FixedAfd]
    val AFD_0010 = "AFD_0010".asInstanceOf[FixedAfd]
    val AFD_0011 = "AFD_0011".asInstanceOf[FixedAfd]
    val AFD_0100 = "AFD_0100".asInstanceOf[FixedAfd]
    val AFD_1000 = "AFD_1000".asInstanceOf[FixedAfd]
    val AFD_1001 = "AFD_1001".asInstanceOf[FixedAfd]
    val AFD_1010 = "AFD_1010".asInstanceOf[FixedAfd]
    val AFD_1011 = "AFD_1011".asInstanceOf[FixedAfd]
    val AFD_1101 = "AFD_1101".asInstanceOf[FixedAfd]
    val AFD_1110 = "AFD_1110".asInstanceOf[FixedAfd]
    val AFD_1111 = "AFD_1111".asInstanceOf[FixedAfd]

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
    * Fmp4 Hls Settings
    */
  @js.native
  trait Fmp4HlsSettings extends js.Object {
    var AudioRenditionSets: js.UndefOr[__string]
    var NielsenId3Behavior: js.UndefOr[Fmp4NielsenId3Behavior]
    var TimedMetadataBehavior: js.UndefOr[Fmp4TimedMetadataBehavior]
  }

  object Fmp4HlsSettings {
    @inline
    def apply(
        AudioRenditionSets: js.UndefOr[__string] = js.undefined,
        NielsenId3Behavior: js.UndefOr[Fmp4NielsenId3Behavior] = js.undefined,
        TimedMetadataBehavior: js.UndefOr[Fmp4TimedMetadataBehavior] = js.undefined
    ): Fmp4HlsSettings = {
      val __obj = js.Dynamic.literal()
      AudioRenditionSets.foreach(__v => __obj.updateDynamic("AudioRenditionSets")(__v.asInstanceOf[js.Any]))
      NielsenId3Behavior.foreach(__v => __obj.updateDynamic("NielsenId3Behavior")(__v.asInstanceOf[js.Any]))
      TimedMetadataBehavior.foreach(__v => __obj.updateDynamic("TimedMetadataBehavior")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Fmp4HlsSettings]
    }
  }

  /**
    * Fmp4 Nielsen Id3 Behavior
    */
  @js.native
  sealed trait Fmp4NielsenId3Behavior extends js.Any
  object Fmp4NielsenId3Behavior extends js.Object {
    val NO_PASSTHROUGH = "NO_PASSTHROUGH".asInstanceOf[Fmp4NielsenId3Behavior]
    val PASSTHROUGH    = "PASSTHROUGH".asInstanceOf[Fmp4NielsenId3Behavior]

    val values = js.Object.freeze(js.Array(NO_PASSTHROUGH, PASSTHROUGH))
  }

  /**
    * Fmp4 Timed Metadata Behavior
    */
  @js.native
  sealed trait Fmp4TimedMetadataBehavior extends js.Any
  object Fmp4TimedMetadataBehavior extends js.Object {
    val NO_PASSTHROUGH = "NO_PASSTHROUGH".asInstanceOf[Fmp4TimedMetadataBehavior]
    val PASSTHROUGH    = "PASSTHROUGH".asInstanceOf[Fmp4TimedMetadataBehavior]

    val values = js.Object.freeze(js.Array(NO_PASSTHROUGH, PASSTHROUGH))
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
  @js.native
  sealed trait FollowPoint extends js.Any
  object FollowPoint extends js.Object {
    val END   = "END".asInstanceOf[FollowPoint]
    val START = "START".asInstanceOf[FollowPoint]

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
    * Frame Capture Interval Unit
    */
  @js.native
  sealed trait FrameCaptureIntervalUnit extends js.Any
  object FrameCaptureIntervalUnit extends js.Object {
    val MILLISECONDS = "MILLISECONDS".asInstanceOf[FrameCaptureIntervalUnit]
    val SECONDS      = "SECONDS".asInstanceOf[FrameCaptureIntervalUnit]

    val values = js.Object.freeze(js.Array(MILLISECONDS, SECONDS))
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
    var CaptureInterval: __integerMin1Max3600000
    var CaptureIntervalUnits: js.UndefOr[FrameCaptureIntervalUnit]
  }

  object FrameCaptureSettings {
    @inline
    def apply(
        CaptureInterval: __integerMin1Max3600000,
        CaptureIntervalUnits: js.UndefOr[FrameCaptureIntervalUnit] = js.undefined
    ): FrameCaptureSettings = {
      val __obj = js.Dynamic.literal(
        "CaptureInterval" -> CaptureInterval.asInstanceOf[js.Any]
      )

      CaptureIntervalUnits.foreach(__v => __obj.updateDynamic("CaptureIntervalUnits")(__v.asInstanceOf[js.Any]))
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
      SupportLowFramerateInputs.foreach(__v =>
        __obj.updateDynamic("SupportLowFramerateInputs")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GlobalConfiguration]
    }
  }

  /**
    * Global Configuration Input End Action
    */
  @js.native
  sealed trait GlobalConfigurationInputEndAction extends js.Any
  object GlobalConfigurationInputEndAction extends js.Object {
    val NONE                   = "NONE".asInstanceOf[GlobalConfigurationInputEndAction]
    val SWITCH_AND_LOOP_INPUTS = "SWITCH_AND_LOOP_INPUTS".asInstanceOf[GlobalConfigurationInputEndAction]

    val values = js.Object.freeze(js.Array(NONE, SWITCH_AND_LOOP_INPUTS))
  }

  /**
    * Global Configuration Low Framerate Inputs
    */
  @js.native
  sealed trait GlobalConfigurationLowFramerateInputs extends js.Any
  object GlobalConfigurationLowFramerateInputs extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[GlobalConfigurationLowFramerateInputs]
    val ENABLED  = "ENABLED".asInstanceOf[GlobalConfigurationLowFramerateInputs]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Global Configuration Output Locking Mode
    */
  @js.native
  sealed trait GlobalConfigurationOutputLockingMode extends js.Any
  object GlobalConfigurationOutputLockingMode extends js.Object {
    val EPOCH_LOCKING    = "EPOCH_LOCKING".asInstanceOf[GlobalConfigurationOutputLockingMode]
    val PIPELINE_LOCKING = "PIPELINE_LOCKING".asInstanceOf[GlobalConfigurationOutputLockingMode]

    val values = js.Object.freeze(js.Array(EPOCH_LOCKING, PIPELINE_LOCKING))
  }

  /**
    * Global Configuration Output Timing Source
    */
  @js.native
  sealed trait GlobalConfigurationOutputTimingSource extends js.Any
  object GlobalConfigurationOutputTimingSource extends js.Object {
    val INPUT_CLOCK  = "INPUT_CLOCK".asInstanceOf[GlobalConfigurationOutputTimingSource]
    val SYSTEM_CLOCK = "SYSTEM_CLOCK".asInstanceOf[GlobalConfigurationOutputTimingSource]

    val values = js.Object.freeze(js.Array(INPUT_CLOCK, SYSTEM_CLOCK))
  }

  /**
    * H264 Adaptive Quantization
    */
  @js.native
  sealed trait H264AdaptiveQuantization extends js.Any
  object H264AdaptiveQuantization extends js.Object {
    val HIGH   = "HIGH".asInstanceOf[H264AdaptiveQuantization]
    val HIGHER = "HIGHER".asInstanceOf[H264AdaptiveQuantization]
    val LOW    = "LOW".asInstanceOf[H264AdaptiveQuantization]
    val MAX    = "MAX".asInstanceOf[H264AdaptiveQuantization]
    val MEDIUM = "MEDIUM".asInstanceOf[H264AdaptiveQuantization]
    val OFF    = "OFF".asInstanceOf[H264AdaptiveQuantization]

    val values = js.Object.freeze(js.Array(HIGH, HIGHER, LOW, MAX, MEDIUM, OFF))
  }

  /**
    * H264 Color Metadata
    */
  @js.native
  sealed trait H264ColorMetadata extends js.Any
  object H264ColorMetadata extends js.Object {
    val IGNORE = "IGNORE".asInstanceOf[H264ColorMetadata]
    val INSERT = "INSERT".asInstanceOf[H264ColorMetadata]

    val values = js.Object.freeze(js.Array(IGNORE, INSERT))
  }

  /**
    * H264 Color Space Settings
    */
  @js.native
  trait H264ColorSpaceSettings extends js.Object {
    var ColorSpacePassthroughSettings: js.UndefOr[ColorSpacePassthroughSettings]
    var Rec601Settings: js.UndefOr[Rec601Settings]
    var Rec709Settings: js.UndefOr[Rec709Settings]
  }

  object H264ColorSpaceSettings {
    @inline
    def apply(
        ColorSpacePassthroughSettings: js.UndefOr[ColorSpacePassthroughSettings] = js.undefined,
        Rec601Settings: js.UndefOr[Rec601Settings] = js.undefined,
        Rec709Settings: js.UndefOr[Rec709Settings] = js.undefined
    ): H264ColorSpaceSettings = {
      val __obj = js.Dynamic.literal()
      ColorSpacePassthroughSettings.foreach(__v =>
        __obj.updateDynamic("ColorSpacePassthroughSettings")(__v.asInstanceOf[js.Any])
      )
      Rec601Settings.foreach(__v => __obj.updateDynamic("Rec601Settings")(__v.asInstanceOf[js.Any]))
      Rec709Settings.foreach(__v => __obj.updateDynamic("Rec709Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[H264ColorSpaceSettings]
    }
  }

  /**
    * H264 Entropy Encoding
    */
  @js.native
  sealed trait H264EntropyEncoding extends js.Any
  object H264EntropyEncoding extends js.Object {
    val CABAC = "CABAC".asInstanceOf[H264EntropyEncoding]
    val CAVLC = "CAVLC".asInstanceOf[H264EntropyEncoding]

    val values = js.Object.freeze(js.Array(CABAC, CAVLC))
  }

  /**
    * H264 Filter Settings
    */
  @js.native
  trait H264FilterSettings extends js.Object {
    var TemporalFilterSettings: js.UndefOr[TemporalFilterSettings]
  }

  object H264FilterSettings {
    @inline
    def apply(
        TemporalFilterSettings: js.UndefOr[TemporalFilterSettings] = js.undefined
    ): H264FilterSettings = {
      val __obj = js.Dynamic.literal()
      TemporalFilterSettings.foreach(__v => __obj.updateDynamic("TemporalFilterSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[H264FilterSettings]
    }
  }

  /**
    * H264 Flicker Aq
    */
  @js.native
  sealed trait H264FlickerAq extends js.Any
  object H264FlickerAq extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H264FlickerAq]
    val ENABLED  = "ENABLED".asInstanceOf[H264FlickerAq]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * H264 Force Field Pictures
    */
  @js.native
  sealed trait H264ForceFieldPictures extends js.Any
  object H264ForceFieldPictures extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H264ForceFieldPictures]
    val ENABLED  = "ENABLED".asInstanceOf[H264ForceFieldPictures]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * H264 Framerate Control
    */
  @js.native
  sealed trait H264FramerateControl extends js.Any
  object H264FramerateControl extends js.Object {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[H264FramerateControl]
    val SPECIFIED              = "SPECIFIED".asInstanceOf[H264FramerateControl]

    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * H264 Gop BReference
    */
  @js.native
  sealed trait H264GopBReference extends js.Any
  object H264GopBReference extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H264GopBReference]
    val ENABLED  = "ENABLED".asInstanceOf[H264GopBReference]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * H264 Gop Size Units
    */
  @js.native
  sealed trait H264GopSizeUnits extends js.Any
  object H264GopSizeUnits extends js.Object {
    val FRAMES  = "FRAMES".asInstanceOf[H264GopSizeUnits]
    val SECONDS = "SECONDS".asInstanceOf[H264GopSizeUnits]

    val values = js.Object.freeze(js.Array(FRAMES, SECONDS))
  }

  /**
    * H264 Level
    */
  @js.native
  sealed trait H264Level extends js.Any
  object H264Level extends js.Object {
    val H264_LEVEL_1    = "H264_LEVEL_1".asInstanceOf[H264Level]
    val H264_LEVEL_1_1  = "H264_LEVEL_1_1".asInstanceOf[H264Level]
    val H264_LEVEL_1_2  = "H264_LEVEL_1_2".asInstanceOf[H264Level]
    val H264_LEVEL_1_3  = "H264_LEVEL_1_3".asInstanceOf[H264Level]
    val H264_LEVEL_2    = "H264_LEVEL_2".asInstanceOf[H264Level]
    val H264_LEVEL_2_1  = "H264_LEVEL_2_1".asInstanceOf[H264Level]
    val H264_LEVEL_2_2  = "H264_LEVEL_2_2".asInstanceOf[H264Level]
    val H264_LEVEL_3    = "H264_LEVEL_3".asInstanceOf[H264Level]
    val H264_LEVEL_3_1  = "H264_LEVEL_3_1".asInstanceOf[H264Level]
    val H264_LEVEL_3_2  = "H264_LEVEL_3_2".asInstanceOf[H264Level]
    val H264_LEVEL_4    = "H264_LEVEL_4".asInstanceOf[H264Level]
    val H264_LEVEL_4_1  = "H264_LEVEL_4_1".asInstanceOf[H264Level]
    val H264_LEVEL_4_2  = "H264_LEVEL_4_2".asInstanceOf[H264Level]
    val H264_LEVEL_5    = "H264_LEVEL_5".asInstanceOf[H264Level]
    val H264_LEVEL_5_1  = "H264_LEVEL_5_1".asInstanceOf[H264Level]
    val H264_LEVEL_5_2  = "H264_LEVEL_5_2".asInstanceOf[H264Level]
    val H264_LEVEL_AUTO = "H264_LEVEL_AUTO".asInstanceOf[H264Level]

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
  @js.native
  sealed trait H264LookAheadRateControl extends js.Any
  object H264LookAheadRateControl extends js.Object {
    val HIGH   = "HIGH".asInstanceOf[H264LookAheadRateControl]
    val LOW    = "LOW".asInstanceOf[H264LookAheadRateControl]
    val MEDIUM = "MEDIUM".asInstanceOf[H264LookAheadRateControl]

    val values = js.Object.freeze(js.Array(HIGH, LOW, MEDIUM))
  }

  /**
    * H264 Par Control
    */
  @js.native
  sealed trait H264ParControl extends js.Any
  object H264ParControl extends js.Object {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE".asInstanceOf[H264ParControl]
    val SPECIFIED              = "SPECIFIED".asInstanceOf[H264ParControl]

    val values = js.Object.freeze(js.Array(INITIALIZE_FROM_SOURCE, SPECIFIED))
  }

  /**
    * H264 Profile
    */
  @js.native
  sealed trait H264Profile extends js.Any
  object H264Profile extends js.Object {
    val BASELINE       = "BASELINE".asInstanceOf[H264Profile]
    val HIGH           = "HIGH".asInstanceOf[H264Profile]
    val HIGH_10BIT     = "HIGH_10BIT".asInstanceOf[H264Profile]
    val HIGH_422       = "HIGH_422".asInstanceOf[H264Profile]
    val HIGH_422_10BIT = "HIGH_422_10BIT".asInstanceOf[H264Profile]
    val MAIN           = "MAIN".asInstanceOf[H264Profile]

    val values = js.Object.freeze(js.Array(BASELINE, HIGH, HIGH_10BIT, HIGH_422, HIGH_422_10BIT, MAIN))
  }

  /**
    * H264 Quality Level
    */
  @js.native
  sealed trait H264QualityLevel extends js.Any
  object H264QualityLevel extends js.Object {
    val ENHANCED_QUALITY = "ENHANCED_QUALITY".asInstanceOf[H264QualityLevel]
    val STANDARD_QUALITY = "STANDARD_QUALITY".asInstanceOf[H264QualityLevel]

    val values = js.Object.freeze(js.Array(ENHANCED_QUALITY, STANDARD_QUALITY))
  }

  /**
    * H264 Rate Control Mode
    */
  @js.native
  sealed trait H264RateControlMode extends js.Any
  object H264RateControlMode extends js.Object {
    val CBR       = "CBR".asInstanceOf[H264RateControlMode]
    val MULTIPLEX = "MULTIPLEX".asInstanceOf[H264RateControlMode]
    val QVBR      = "QVBR".asInstanceOf[H264RateControlMode]
    val VBR       = "VBR".asInstanceOf[H264RateControlMode]

    val values = js.Object.freeze(js.Array(CBR, MULTIPLEX, QVBR, VBR))
  }

  /**
    * H264 Scan Type
    */
  @js.native
  sealed trait H264ScanType extends js.Any
  object H264ScanType extends js.Object {
    val INTERLACED  = "INTERLACED".asInstanceOf[H264ScanType]
    val PROGRESSIVE = "PROGRESSIVE".asInstanceOf[H264ScanType]

    val values = js.Object.freeze(js.Array(INTERLACED, PROGRESSIVE))
  }

  /**
    * H264 Scene Change Detect
    */
  @js.native
  sealed trait H264SceneChangeDetect extends js.Any
  object H264SceneChangeDetect extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H264SceneChangeDetect]
    val ENABLED  = "ENABLED".asInstanceOf[H264SceneChangeDetect]

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
    var ColorSpaceSettings: js.UndefOr[H264ColorSpaceSettings]
    var EntropyEncoding: js.UndefOr[H264EntropyEncoding]
    var FilterSettings: js.UndefOr[H264FilterSettings]
    var FixedAfd: js.UndefOr[FixedAfd]
    var FlickerAq: js.UndefOr[H264FlickerAq]
    var ForceFieldPictures: js.UndefOr[H264ForceFieldPictures]
    var FramerateControl: js.UndefOr[H264FramerateControl]
    var FramerateDenominator: js.UndefOr[__integerMin1]
    var FramerateNumerator: js.UndefOr[__integerMin1]
    var GopBReference: js.UndefOr[H264GopBReference]
    var GopClosedCadence: js.UndefOr[__integerMin0]
    var GopNumBFrames: js.UndefOr[__integerMin0Max7]
    var GopSize: js.UndefOr[__double]
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
    var QualityLevel: js.UndefOr[H264QualityLevel]
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
        ColorSpaceSettings: js.UndefOr[H264ColorSpaceSettings] = js.undefined,
        EntropyEncoding: js.UndefOr[H264EntropyEncoding] = js.undefined,
        FilterSettings: js.UndefOr[H264FilterSettings] = js.undefined,
        FixedAfd: js.UndefOr[FixedAfd] = js.undefined,
        FlickerAq: js.UndefOr[H264FlickerAq] = js.undefined,
        ForceFieldPictures: js.UndefOr[H264ForceFieldPictures] = js.undefined,
        FramerateControl: js.UndefOr[H264FramerateControl] = js.undefined,
        FramerateDenominator: js.UndefOr[__integerMin1] = js.undefined,
        FramerateNumerator: js.UndefOr[__integerMin1] = js.undefined,
        GopBReference: js.UndefOr[H264GopBReference] = js.undefined,
        GopClosedCadence: js.UndefOr[__integerMin0] = js.undefined,
        GopNumBFrames: js.UndefOr[__integerMin0Max7] = js.undefined,
        GopSize: js.UndefOr[__double] = js.undefined,
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
        QualityLevel: js.UndefOr[H264QualityLevel] = js.undefined,
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
      ColorSpaceSettings.foreach(__v => __obj.updateDynamic("ColorSpaceSettings")(__v.asInstanceOf[js.Any]))
      EntropyEncoding.foreach(__v => __obj.updateDynamic("EntropyEncoding")(__v.asInstanceOf[js.Any]))
      FilterSettings.foreach(__v => __obj.updateDynamic("FilterSettings")(__v.asInstanceOf[js.Any]))
      FixedAfd.foreach(__v => __obj.updateDynamic("FixedAfd")(__v.asInstanceOf[js.Any]))
      FlickerAq.foreach(__v => __obj.updateDynamic("FlickerAq")(__v.asInstanceOf[js.Any]))
      ForceFieldPictures.foreach(__v => __obj.updateDynamic("ForceFieldPictures")(__v.asInstanceOf[js.Any]))
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
      QualityLevel.foreach(__v => __obj.updateDynamic("QualityLevel")(__v.asInstanceOf[js.Any]))
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
  @js.native
  sealed trait H264SpatialAq extends js.Any
  object H264SpatialAq extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H264SpatialAq]
    val ENABLED  = "ENABLED".asInstanceOf[H264SpatialAq]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * H264 Sub Gop Length
    */
  @js.native
  sealed trait H264SubGopLength extends js.Any
  object H264SubGopLength extends js.Object {
    val DYNAMIC = "DYNAMIC".asInstanceOf[H264SubGopLength]
    val FIXED   = "FIXED".asInstanceOf[H264SubGopLength]

    val values = js.Object.freeze(js.Array(DYNAMIC, FIXED))
  }

  /**
    * H264 Syntax
    */
  @js.native
  sealed trait H264Syntax extends js.Any
  object H264Syntax extends js.Object {
    val DEFAULT = "DEFAULT".asInstanceOf[H264Syntax]
    val RP2027  = "RP2027".asInstanceOf[H264Syntax]

    val values = js.Object.freeze(js.Array(DEFAULT, RP2027))
  }

  /**
    * H264 Temporal Aq
    */
  @js.native
  sealed trait H264TemporalAq extends js.Any
  object H264TemporalAq extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H264TemporalAq]
    val ENABLED  = "ENABLED".asInstanceOf[H264TemporalAq]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * H264 Timecode Insertion Behavior
    */
  @js.native
  sealed trait H264TimecodeInsertionBehavior extends js.Any
  object H264TimecodeInsertionBehavior extends js.Object {
    val DISABLED       = "DISABLED".asInstanceOf[H264TimecodeInsertionBehavior]
    val PIC_TIMING_SEI = "PIC_TIMING_SEI".asInstanceOf[H264TimecodeInsertionBehavior]

    val values = js.Object.freeze(js.Array(DISABLED, PIC_TIMING_SEI))
  }

  /**
    * H265 Adaptive Quantization
    */
  @js.native
  sealed trait H265AdaptiveQuantization extends js.Any
  object H265AdaptiveQuantization extends js.Object {
    val HIGH   = "HIGH".asInstanceOf[H265AdaptiveQuantization]
    val HIGHER = "HIGHER".asInstanceOf[H265AdaptiveQuantization]
    val LOW    = "LOW".asInstanceOf[H265AdaptiveQuantization]
    val MAX    = "MAX".asInstanceOf[H265AdaptiveQuantization]
    val MEDIUM = "MEDIUM".asInstanceOf[H265AdaptiveQuantization]
    val OFF    = "OFF".asInstanceOf[H265AdaptiveQuantization]

    val values = js.Object.freeze(js.Array(HIGH, HIGHER, LOW, MAX, MEDIUM, OFF))
  }

  /**
    * H265 Alternative Transfer Function
    */
  @js.native
  sealed trait H265AlternativeTransferFunction extends js.Any
  object H265AlternativeTransferFunction extends js.Object {
    val INSERT = "INSERT".asInstanceOf[H265AlternativeTransferFunction]
    val OMIT   = "OMIT".asInstanceOf[H265AlternativeTransferFunction]

    val values = js.Object.freeze(js.Array(INSERT, OMIT))
  }

  /**
    * H265 Color Metadata
    */
  @js.native
  sealed trait H265ColorMetadata extends js.Any
  object H265ColorMetadata extends js.Object {
    val IGNORE = "IGNORE".asInstanceOf[H265ColorMetadata]
    val INSERT = "INSERT".asInstanceOf[H265ColorMetadata]

    val values = js.Object.freeze(js.Array(IGNORE, INSERT))
  }

  /**
    * H265 Color Space Settings
    */
  @js.native
  trait H265ColorSpaceSettings extends js.Object {
    var ColorSpacePassthroughSettings: js.UndefOr[ColorSpacePassthroughSettings]
    var Hdr10Settings: js.UndefOr[Hdr10Settings]
    var Rec601Settings: js.UndefOr[Rec601Settings]
    var Rec709Settings: js.UndefOr[Rec709Settings]
  }

  object H265ColorSpaceSettings {
    @inline
    def apply(
        ColorSpacePassthroughSettings: js.UndefOr[ColorSpacePassthroughSettings] = js.undefined,
        Hdr10Settings: js.UndefOr[Hdr10Settings] = js.undefined,
        Rec601Settings: js.UndefOr[Rec601Settings] = js.undefined,
        Rec709Settings: js.UndefOr[Rec709Settings] = js.undefined
    ): H265ColorSpaceSettings = {
      val __obj = js.Dynamic.literal()
      ColorSpacePassthroughSettings.foreach(__v =>
        __obj.updateDynamic("ColorSpacePassthroughSettings")(__v.asInstanceOf[js.Any])
      )
      Hdr10Settings.foreach(__v => __obj.updateDynamic("Hdr10Settings")(__v.asInstanceOf[js.Any]))
      Rec601Settings.foreach(__v => __obj.updateDynamic("Rec601Settings")(__v.asInstanceOf[js.Any]))
      Rec709Settings.foreach(__v => __obj.updateDynamic("Rec709Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[H265ColorSpaceSettings]
    }
  }

  /**
    * H265 Flicker Aq
    */
  @js.native
  sealed trait H265FlickerAq extends js.Any
  object H265FlickerAq extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H265FlickerAq]
    val ENABLED  = "ENABLED".asInstanceOf[H265FlickerAq]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * H265 Gop Size Units
    */
  @js.native
  sealed trait H265GopSizeUnits extends js.Any
  object H265GopSizeUnits extends js.Object {
    val FRAMES  = "FRAMES".asInstanceOf[H265GopSizeUnits]
    val SECONDS = "SECONDS".asInstanceOf[H265GopSizeUnits]

    val values = js.Object.freeze(js.Array(FRAMES, SECONDS))
  }

  /**
    * H265 Level
    */
  @js.native
  sealed trait H265Level extends js.Any
  object H265Level extends js.Object {
    val H265_LEVEL_1    = "H265_LEVEL_1".asInstanceOf[H265Level]
    val H265_LEVEL_2    = "H265_LEVEL_2".asInstanceOf[H265Level]
    val H265_LEVEL_2_1  = "H265_LEVEL_2_1".asInstanceOf[H265Level]
    val H265_LEVEL_3    = "H265_LEVEL_3".asInstanceOf[H265Level]
    val H265_LEVEL_3_1  = "H265_LEVEL_3_1".asInstanceOf[H265Level]
    val H265_LEVEL_4    = "H265_LEVEL_4".asInstanceOf[H265Level]
    val H265_LEVEL_4_1  = "H265_LEVEL_4_1".asInstanceOf[H265Level]
    val H265_LEVEL_5    = "H265_LEVEL_5".asInstanceOf[H265Level]
    val H265_LEVEL_5_1  = "H265_LEVEL_5_1".asInstanceOf[H265Level]
    val H265_LEVEL_5_2  = "H265_LEVEL_5_2".asInstanceOf[H265Level]
    val H265_LEVEL_6    = "H265_LEVEL_6".asInstanceOf[H265Level]
    val H265_LEVEL_6_1  = "H265_LEVEL_6_1".asInstanceOf[H265Level]
    val H265_LEVEL_6_2  = "H265_LEVEL_6_2".asInstanceOf[H265Level]
    val H265_LEVEL_AUTO = "H265_LEVEL_AUTO".asInstanceOf[H265Level]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  /**
    * H265 Look Ahead Rate Control
    */
  @js.native
  sealed trait H265LookAheadRateControl extends js.Any
  object H265LookAheadRateControl extends js.Object {
    val HIGH   = "HIGH".asInstanceOf[H265LookAheadRateControl]
    val LOW    = "LOW".asInstanceOf[H265LookAheadRateControl]
    val MEDIUM = "MEDIUM".asInstanceOf[H265LookAheadRateControl]

    val values = js.Object.freeze(js.Array(HIGH, LOW, MEDIUM))
  }

  /**
    * H265 Profile
    */
  @js.native
  sealed trait H265Profile extends js.Any
  object H265Profile extends js.Object {
    val MAIN       = "MAIN".asInstanceOf[H265Profile]
    val MAIN_10BIT = "MAIN_10BIT".asInstanceOf[H265Profile]

    val values = js.Object.freeze(js.Array(MAIN, MAIN_10BIT))
  }

  /**
    * H265 Rate Control Mode
    */
  @js.native
  sealed trait H265RateControlMode extends js.Any
  object H265RateControlMode extends js.Object {
    val CBR       = "CBR".asInstanceOf[H265RateControlMode]
    val MULTIPLEX = "MULTIPLEX".asInstanceOf[H265RateControlMode]
    val QVBR      = "QVBR".asInstanceOf[H265RateControlMode]

    val values = js.Object.freeze(js.Array(CBR, MULTIPLEX, QVBR))
  }

  /**
    * H265 Scan Type
    */
  @js.native
  sealed trait H265ScanType extends js.Any
  object H265ScanType extends js.Object {
    val PROGRESSIVE = "PROGRESSIVE".asInstanceOf[H265ScanType]

    val values = js.Object.freeze(js.Array(PROGRESSIVE))
  }

  /**
    * H265 Scene Change Detect
    */
  @js.native
  sealed trait H265SceneChangeDetect extends js.Any
  object H265SceneChangeDetect extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[H265SceneChangeDetect]
    val ENABLED  = "ENABLED".asInstanceOf[H265SceneChangeDetect]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * H265 Settings
    */
  @js.native
  trait H265Settings extends js.Object {
    var FramerateDenominator: __integerMin1Max3003
    var FramerateNumerator: __integerMin1
    var AdaptiveQuantization: js.UndefOr[H265AdaptiveQuantization]
    var AfdSignaling: js.UndefOr[AfdSignaling]
    var AlternativeTransferFunction: js.UndefOr[H265AlternativeTransferFunction]
    var Bitrate: js.UndefOr[__integerMin100000Max40000000]
    var BufSize: js.UndefOr[__integerMin100000Max80000000]
    var ColorMetadata: js.UndefOr[H265ColorMetadata]
    var ColorSpaceSettings: js.UndefOr[H265ColorSpaceSettings]
    var FixedAfd: js.UndefOr[FixedAfd]
    var FlickerAq: js.UndefOr[H265FlickerAq]
    var GopClosedCadence: js.UndefOr[__integerMin0]
    var GopSize: js.UndefOr[__double]
    var GopSizeUnits: js.UndefOr[H265GopSizeUnits]
    var Level: js.UndefOr[H265Level]
    var LookAheadRateControl: js.UndefOr[H265LookAheadRateControl]
    var MaxBitrate: js.UndefOr[__integerMin100000Max40000000]
    var MinIInterval: js.UndefOr[__integerMin0Max30]
    var ParDenominator: js.UndefOr[__integerMin1]
    var ParNumerator: js.UndefOr[__integerMin1]
    var Profile: js.UndefOr[H265Profile]
    var QvbrQualityLevel: js.UndefOr[__integerMin1Max10]
    var RateControlMode: js.UndefOr[H265RateControlMode]
    var ScanType: js.UndefOr[H265ScanType]
    var SceneChangeDetect: js.UndefOr[H265SceneChangeDetect]
    var Slices: js.UndefOr[__integerMin1Max16]
    var Tier: js.UndefOr[H265Tier]
    var TimecodeInsertion: js.UndefOr[H265TimecodeInsertionBehavior]
  }

  object H265Settings {
    @inline
    def apply(
        FramerateDenominator: __integerMin1Max3003,
        FramerateNumerator: __integerMin1,
        AdaptiveQuantization: js.UndefOr[H265AdaptiveQuantization] = js.undefined,
        AfdSignaling: js.UndefOr[AfdSignaling] = js.undefined,
        AlternativeTransferFunction: js.UndefOr[H265AlternativeTransferFunction] = js.undefined,
        Bitrate: js.UndefOr[__integerMin100000Max40000000] = js.undefined,
        BufSize: js.UndefOr[__integerMin100000Max80000000] = js.undefined,
        ColorMetadata: js.UndefOr[H265ColorMetadata] = js.undefined,
        ColorSpaceSettings: js.UndefOr[H265ColorSpaceSettings] = js.undefined,
        FixedAfd: js.UndefOr[FixedAfd] = js.undefined,
        FlickerAq: js.UndefOr[H265FlickerAq] = js.undefined,
        GopClosedCadence: js.UndefOr[__integerMin0] = js.undefined,
        GopSize: js.UndefOr[__double] = js.undefined,
        GopSizeUnits: js.UndefOr[H265GopSizeUnits] = js.undefined,
        Level: js.UndefOr[H265Level] = js.undefined,
        LookAheadRateControl: js.UndefOr[H265LookAheadRateControl] = js.undefined,
        MaxBitrate: js.UndefOr[__integerMin100000Max40000000] = js.undefined,
        MinIInterval: js.UndefOr[__integerMin0Max30] = js.undefined,
        ParDenominator: js.UndefOr[__integerMin1] = js.undefined,
        ParNumerator: js.UndefOr[__integerMin1] = js.undefined,
        Profile: js.UndefOr[H265Profile] = js.undefined,
        QvbrQualityLevel: js.UndefOr[__integerMin1Max10] = js.undefined,
        RateControlMode: js.UndefOr[H265RateControlMode] = js.undefined,
        ScanType: js.UndefOr[H265ScanType] = js.undefined,
        SceneChangeDetect: js.UndefOr[H265SceneChangeDetect] = js.undefined,
        Slices: js.UndefOr[__integerMin1Max16] = js.undefined,
        Tier: js.UndefOr[H265Tier] = js.undefined,
        TimecodeInsertion: js.UndefOr[H265TimecodeInsertionBehavior] = js.undefined
    ): H265Settings = {
      val __obj = js.Dynamic.literal(
        "FramerateDenominator" -> FramerateDenominator.asInstanceOf[js.Any],
        "FramerateNumerator"   -> FramerateNumerator.asInstanceOf[js.Any]
      )

      AdaptiveQuantization.foreach(__v => __obj.updateDynamic("AdaptiveQuantization")(__v.asInstanceOf[js.Any]))
      AfdSignaling.foreach(__v => __obj.updateDynamic("AfdSignaling")(__v.asInstanceOf[js.Any]))
      AlternativeTransferFunction.foreach(__v =>
        __obj.updateDynamic("AlternativeTransferFunction")(__v.asInstanceOf[js.Any])
      )
      Bitrate.foreach(__v => __obj.updateDynamic("Bitrate")(__v.asInstanceOf[js.Any]))
      BufSize.foreach(__v => __obj.updateDynamic("BufSize")(__v.asInstanceOf[js.Any]))
      ColorMetadata.foreach(__v => __obj.updateDynamic("ColorMetadata")(__v.asInstanceOf[js.Any]))
      ColorSpaceSettings.foreach(__v => __obj.updateDynamic("ColorSpaceSettings")(__v.asInstanceOf[js.Any]))
      FixedAfd.foreach(__v => __obj.updateDynamic("FixedAfd")(__v.asInstanceOf[js.Any]))
      FlickerAq.foreach(__v => __obj.updateDynamic("FlickerAq")(__v.asInstanceOf[js.Any]))
      GopClosedCadence.foreach(__v => __obj.updateDynamic("GopClosedCadence")(__v.asInstanceOf[js.Any]))
      GopSize.foreach(__v => __obj.updateDynamic("GopSize")(__v.asInstanceOf[js.Any]))
      GopSizeUnits.foreach(__v => __obj.updateDynamic("GopSizeUnits")(__v.asInstanceOf[js.Any]))
      Level.foreach(__v => __obj.updateDynamic("Level")(__v.asInstanceOf[js.Any]))
      LookAheadRateControl.foreach(__v => __obj.updateDynamic("LookAheadRateControl")(__v.asInstanceOf[js.Any]))
      MaxBitrate.foreach(__v => __obj.updateDynamic("MaxBitrate")(__v.asInstanceOf[js.Any]))
      MinIInterval.foreach(__v => __obj.updateDynamic("MinIInterval")(__v.asInstanceOf[js.Any]))
      ParDenominator.foreach(__v => __obj.updateDynamic("ParDenominator")(__v.asInstanceOf[js.Any]))
      ParNumerator.foreach(__v => __obj.updateDynamic("ParNumerator")(__v.asInstanceOf[js.Any]))
      Profile.foreach(__v => __obj.updateDynamic("Profile")(__v.asInstanceOf[js.Any]))
      QvbrQualityLevel.foreach(__v => __obj.updateDynamic("QvbrQualityLevel")(__v.asInstanceOf[js.Any]))
      RateControlMode.foreach(__v => __obj.updateDynamic("RateControlMode")(__v.asInstanceOf[js.Any]))
      ScanType.foreach(__v => __obj.updateDynamic("ScanType")(__v.asInstanceOf[js.Any]))
      SceneChangeDetect.foreach(__v => __obj.updateDynamic("SceneChangeDetect")(__v.asInstanceOf[js.Any]))
      Slices.foreach(__v => __obj.updateDynamic("Slices")(__v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.updateDynamic("Tier")(__v.asInstanceOf[js.Any]))
      TimecodeInsertion.foreach(__v => __obj.updateDynamic("TimecodeInsertion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[H265Settings]
    }
  }

  /**
    * H265 Tier
    */
  @js.native
  sealed trait H265Tier extends js.Any
  object H265Tier extends js.Object {
    val HIGH = "HIGH".asInstanceOf[H265Tier]
    val MAIN = "MAIN".asInstanceOf[H265Tier]

    val values = js.Object.freeze(js.Array(HIGH, MAIN))
  }

  /**
    * H265 Timecode Insertion Behavior
    */
  @js.native
  sealed trait H265TimecodeInsertionBehavior extends js.Any
  object H265TimecodeInsertionBehavior extends js.Object {
    val DISABLED       = "DISABLED".asInstanceOf[H265TimecodeInsertionBehavior]
    val PIC_TIMING_SEI = "PIC_TIMING_SEI".asInstanceOf[H265TimecodeInsertionBehavior]

    val values = js.Object.freeze(js.Array(DISABLED, PIC_TIMING_SEI))
  }

  /**
    * Hdr10 Settings
    */
  @js.native
  trait Hdr10Settings extends js.Object {
    var MaxCll: js.UndefOr[__integerMin0Max32768]
    var MaxFall: js.UndefOr[__integerMin0Max32768]
  }

  object Hdr10Settings {
    @inline
    def apply(
        MaxCll: js.UndefOr[__integerMin0Max32768] = js.undefined,
        MaxFall: js.UndefOr[__integerMin0Max32768] = js.undefined
    ): Hdr10Settings = {
      val __obj = js.Dynamic.literal()
      MaxCll.foreach(__v => __obj.updateDynamic("MaxCll")(__v.asInstanceOf[js.Any]))
      MaxFall.foreach(__v => __obj.updateDynamic("MaxFall")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Hdr10Settings]
    }
  }

  /**
    * Hls Ad Markers
    */
  @js.native
  sealed trait HlsAdMarkers extends js.Any
  object HlsAdMarkers extends js.Object {
    val ADOBE            = "ADOBE".asInstanceOf[HlsAdMarkers]
    val ELEMENTAL        = "ELEMENTAL".asInstanceOf[HlsAdMarkers]
    val ELEMENTAL_SCTE35 = "ELEMENTAL_SCTE35".asInstanceOf[HlsAdMarkers]

    val values = js.Object.freeze(js.Array(ADOBE, ELEMENTAL, ELEMENTAL_SCTE35))
  }

  /**
    * Hls Akamai Http Transfer Mode
    */
  @js.native
  sealed trait HlsAkamaiHttpTransferMode extends js.Any
  object HlsAkamaiHttpTransferMode extends js.Object {
    val CHUNKED     = "CHUNKED".asInstanceOf[HlsAkamaiHttpTransferMode]
    val NON_CHUNKED = "NON_CHUNKED".asInstanceOf[HlsAkamaiHttpTransferMode]

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
  @js.native
  sealed trait HlsCaptionLanguageSetting extends js.Any
  object HlsCaptionLanguageSetting extends js.Object {
    val INSERT = "INSERT".asInstanceOf[HlsCaptionLanguageSetting]
    val NONE   = "NONE".asInstanceOf[HlsCaptionLanguageSetting]
    val OMIT   = "OMIT".asInstanceOf[HlsCaptionLanguageSetting]

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
  @js.native
  sealed trait HlsClientCache extends js.Any
  object HlsClientCache extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[HlsClientCache]
    val ENABLED  = "ENABLED".asInstanceOf[HlsClientCache]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Hls Codec Specification
    */
  @js.native
  sealed trait HlsCodecSpecification extends js.Any
  object HlsCodecSpecification extends js.Object {
    val RFC_4281 = "RFC_4281".asInstanceOf[HlsCodecSpecification]
    val RFC_6381 = "RFC_6381".asInstanceOf[HlsCodecSpecification]

    val values = js.Object.freeze(js.Array(RFC_4281, RFC_6381))
  }

  /**
    * Hls Directory Structure
    */
  @js.native
  sealed trait HlsDirectoryStructure extends js.Any
  object HlsDirectoryStructure extends js.Object {
    val SINGLE_DIRECTORY        = "SINGLE_DIRECTORY".asInstanceOf[HlsDirectoryStructure]
    val SUBDIRECTORY_PER_STREAM = "SUBDIRECTORY_PER_STREAM".asInstanceOf[HlsDirectoryStructure]

    val values = js.Object.freeze(js.Array(SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM))
  }

  /**
    * Hls Encryption Type
    */
  @js.native
  sealed trait HlsEncryptionType extends js.Any
  object HlsEncryptionType extends js.Object {
    val AES128     = "AES128".asInstanceOf[HlsEncryptionType]
    val SAMPLE_AES = "SAMPLE_AES".asInstanceOf[HlsEncryptionType]

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
    var BaseUrlContent1: js.UndefOr[__string]
    var BaseUrlManifest: js.UndefOr[__string]
    var BaseUrlManifest1: js.UndefOr[__string]
    var CaptionLanguageMappings: js.UndefOr[__listOfCaptionLanguageMapping]
    var CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting]
    var ClientCache: js.UndefOr[HlsClientCache]
    var CodecSpecification: js.UndefOr[HlsCodecSpecification]
    var ConstantIv: js.UndefOr[__stringMin32Max32]
    var DirectoryStructure: js.UndefOr[HlsDirectoryStructure]
    var EncryptionType: js.UndefOr[HlsEncryptionType]
    var HlsCdnSettings: js.UndefOr[HlsCdnSettings]
    var HlsId3SegmentTagging: js.UndefOr[HlsId3SegmentTaggingState]
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
        BaseUrlContent1: js.UndefOr[__string] = js.undefined,
        BaseUrlManifest: js.UndefOr[__string] = js.undefined,
        BaseUrlManifest1: js.UndefOr[__string] = js.undefined,
        CaptionLanguageMappings: js.UndefOr[__listOfCaptionLanguageMapping] = js.undefined,
        CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting] = js.undefined,
        ClientCache: js.UndefOr[HlsClientCache] = js.undefined,
        CodecSpecification: js.UndefOr[HlsCodecSpecification] = js.undefined,
        ConstantIv: js.UndefOr[__stringMin32Max32] = js.undefined,
        DirectoryStructure: js.UndefOr[HlsDirectoryStructure] = js.undefined,
        EncryptionType: js.UndefOr[HlsEncryptionType] = js.undefined,
        HlsCdnSettings: js.UndefOr[HlsCdnSettings] = js.undefined,
        HlsId3SegmentTagging: js.UndefOr[HlsId3SegmentTaggingState] = js.undefined,
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
      BaseUrlContent1.foreach(__v => __obj.updateDynamic("BaseUrlContent1")(__v.asInstanceOf[js.Any]))
      BaseUrlManifest.foreach(__v => __obj.updateDynamic("BaseUrlManifest")(__v.asInstanceOf[js.Any]))
      BaseUrlManifest1.foreach(__v => __obj.updateDynamic("BaseUrlManifest1")(__v.asInstanceOf[js.Any]))
      CaptionLanguageMappings.foreach(__v => __obj.updateDynamic("CaptionLanguageMappings")(__v.asInstanceOf[js.Any]))
      CaptionLanguageSetting.foreach(__v => __obj.updateDynamic("CaptionLanguageSetting")(__v.asInstanceOf[js.Any]))
      ClientCache.foreach(__v => __obj.updateDynamic("ClientCache")(__v.asInstanceOf[js.Any]))
      CodecSpecification.foreach(__v => __obj.updateDynamic("CodecSpecification")(__v.asInstanceOf[js.Any]))
      ConstantIv.foreach(__v => __obj.updateDynamic("ConstantIv")(__v.asInstanceOf[js.Any]))
      DirectoryStructure.foreach(__v => __obj.updateDynamic("DirectoryStructure")(__v.asInstanceOf[js.Any]))
      EncryptionType.foreach(__v => __obj.updateDynamic("EncryptionType")(__v.asInstanceOf[js.Any]))
      HlsCdnSettings.foreach(__v => __obj.updateDynamic("HlsCdnSettings")(__v.asInstanceOf[js.Any]))
      HlsId3SegmentTagging.foreach(__v => __obj.updateDynamic("HlsId3SegmentTagging")(__v.asInstanceOf[js.Any]))
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
      TimestampDeltaMilliseconds.foreach(__v =>
        __obj.updateDynamic("TimestampDeltaMilliseconds")(__v.asInstanceOf[js.Any])
      )
      TsFileMode.foreach(__v => __obj.updateDynamic("TsFileMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsGroupSettings]
    }
  }

  /**
    * Hls H265 Packaging Type
    */
  @js.native
  sealed trait HlsH265PackagingType extends js.Any
  object HlsH265PackagingType extends js.Object {
    val HEV1 = "HEV1".asInstanceOf[HlsH265PackagingType]
    val HVC1 = "HVC1".asInstanceOf[HlsH265PackagingType]

    val values = js.Object.freeze(js.Array(HEV1, HVC1))
  }

  /**
    * Settings for the action to insert a user-defined ID3 tag in each HLS segment
    */
  @js.native
  trait HlsId3SegmentTaggingScheduleActionSettings extends js.Object {
    var Tag: __string
  }

  object HlsId3SegmentTaggingScheduleActionSettings {
    @inline
    def apply(
        Tag: __string
    ): HlsId3SegmentTaggingScheduleActionSettings = {
      val __obj = js.Dynamic.literal(
        "Tag" -> Tag.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HlsId3SegmentTaggingScheduleActionSettings]
    }
  }

  /**
    * State of HLS ID3 Segment Tagging
    */
  @js.native
  sealed trait HlsId3SegmentTaggingState extends js.Any
  object HlsId3SegmentTaggingState extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[HlsId3SegmentTaggingState]
    val ENABLED  = "ENABLED".asInstanceOf[HlsId3SegmentTaggingState]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
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
  @js.native
  sealed trait HlsIvInManifest extends js.Any
  object HlsIvInManifest extends js.Object {
    val EXCLUDE = "EXCLUDE".asInstanceOf[HlsIvInManifest]
    val INCLUDE = "INCLUDE".asInstanceOf[HlsIvInManifest]

    val values = js.Object.freeze(js.Array(EXCLUDE, INCLUDE))
  }

  /**
    * Hls Iv Source
    */
  @js.native
  sealed trait HlsIvSource extends js.Any
  object HlsIvSource extends js.Object {
    val EXPLICIT               = "EXPLICIT".asInstanceOf[HlsIvSource]
    val FOLLOWS_SEGMENT_NUMBER = "FOLLOWS_SEGMENT_NUMBER".asInstanceOf[HlsIvSource]

    val values = js.Object.freeze(js.Array(EXPLICIT, FOLLOWS_SEGMENT_NUMBER))
  }

  /**
    * Hls Manifest Compression
    */
  @js.native
  sealed trait HlsManifestCompression extends js.Any
  object HlsManifestCompression extends js.Object {
    val GZIP = "GZIP".asInstanceOf[HlsManifestCompression]
    val NONE = "NONE".asInstanceOf[HlsManifestCompression]

    val values = js.Object.freeze(js.Array(GZIP, NONE))
  }

  /**
    * Hls Manifest Duration Format
    */
  @js.native
  sealed trait HlsManifestDurationFormat extends js.Any
  object HlsManifestDurationFormat extends js.Object {
    val FLOATING_POINT = "FLOATING_POINT".asInstanceOf[HlsManifestDurationFormat]
    val INTEGER        = "INTEGER".asInstanceOf[HlsManifestDurationFormat]

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
  @js.native
  sealed trait HlsMediaStoreStorageClass extends js.Any
  object HlsMediaStoreStorageClass extends js.Object {
    val TEMPORAL = "TEMPORAL".asInstanceOf[HlsMediaStoreStorageClass]

    val values = js.Object.freeze(js.Array(TEMPORAL))
  }

  /**
    * Hls Mode
    */
  @js.native
  sealed trait HlsMode extends js.Any
  object HlsMode extends js.Object {
    val LIVE = "LIVE".asInstanceOf[HlsMode]
    val VOD  = "VOD".asInstanceOf[HlsMode]

    val values = js.Object.freeze(js.Array(LIVE, VOD))
  }

  /**
    * Hls Output Selection
    */
  @js.native
  sealed trait HlsOutputSelection extends js.Any
  object HlsOutputSelection extends js.Object {
    val MANIFESTS_AND_SEGMENTS = "MANIFESTS_AND_SEGMENTS".asInstanceOf[HlsOutputSelection]
    val SEGMENTS_ONLY          = "SEGMENTS_ONLY".asInstanceOf[HlsOutputSelection]

    val values = js.Object.freeze(js.Array(MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY))
  }

  /**
    * Hls Output Settings
    */
  @js.native
  trait HlsOutputSettings extends js.Object {
    var HlsSettings: HlsSettings
    var H265PackagingType: js.UndefOr[HlsH265PackagingType]
    var NameModifier: js.UndefOr[__stringMin1]
    var SegmentModifier: js.UndefOr[__string]
  }

  object HlsOutputSettings {
    @inline
    def apply(
        HlsSettings: HlsSettings,
        H265PackagingType: js.UndefOr[HlsH265PackagingType] = js.undefined,
        NameModifier: js.UndefOr[__stringMin1] = js.undefined,
        SegmentModifier: js.UndefOr[__string] = js.undefined
    ): HlsOutputSettings = {
      val __obj = js.Dynamic.literal(
        "HlsSettings" -> HlsSettings.asInstanceOf[js.Any]
      )

      H265PackagingType.foreach(__v => __obj.updateDynamic("H265PackagingType")(__v.asInstanceOf[js.Any]))
      NameModifier.foreach(__v => __obj.updateDynamic("NameModifier")(__v.asInstanceOf[js.Any]))
      SegmentModifier.foreach(__v => __obj.updateDynamic("SegmentModifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsOutputSettings]
    }
  }

  /**
    * Hls Program Date Time
    */
  @js.native
  sealed trait HlsProgramDateTime extends js.Any
  object HlsProgramDateTime extends js.Object {
    val EXCLUDE = "EXCLUDE".asInstanceOf[HlsProgramDateTime]
    val INCLUDE = "INCLUDE".asInstanceOf[HlsProgramDateTime]

    val values = js.Object.freeze(js.Array(EXCLUDE, INCLUDE))
  }

  /**
    * Hls Redundant Manifest
    */
  @js.native
  sealed trait HlsRedundantManifest extends js.Any
  object HlsRedundantManifest extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[HlsRedundantManifest]
    val ENABLED  = "ENABLED".asInstanceOf[HlsRedundantManifest]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Hls Segmentation Mode
    */
  @js.native
  sealed trait HlsSegmentationMode extends js.Any
  object HlsSegmentationMode extends js.Object {
    val USE_INPUT_SEGMENTATION = "USE_INPUT_SEGMENTATION".asInstanceOf[HlsSegmentationMode]
    val USE_SEGMENT_DURATION   = "USE_SEGMENT_DURATION".asInstanceOf[HlsSegmentationMode]

    val values = js.Object.freeze(js.Array(USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION))
  }

  /**
    * Hls Settings
    */
  @js.native
  trait HlsSettings extends js.Object {
    var AudioOnlyHlsSettings: js.UndefOr[AudioOnlyHlsSettings]
    var Fmp4HlsSettings: js.UndefOr[Fmp4HlsSettings]
    var StandardHlsSettings: js.UndefOr[StandardHlsSettings]
  }

  object HlsSettings {
    @inline
    def apply(
        AudioOnlyHlsSettings: js.UndefOr[AudioOnlyHlsSettings] = js.undefined,
        Fmp4HlsSettings: js.UndefOr[Fmp4HlsSettings] = js.undefined,
        StandardHlsSettings: js.UndefOr[StandardHlsSettings] = js.undefined
    ): HlsSettings = {
      val __obj = js.Dynamic.literal()
      AudioOnlyHlsSettings.foreach(__v => __obj.updateDynamic("AudioOnlyHlsSettings")(__v.asInstanceOf[js.Any]))
      Fmp4HlsSettings.foreach(__v => __obj.updateDynamic("Fmp4HlsSettings")(__v.asInstanceOf[js.Any]))
      StandardHlsSettings.foreach(__v => __obj.updateDynamic("StandardHlsSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsSettings]
    }
  }

  /**
    * Hls Stream Inf Resolution
    */
  @js.native
  sealed trait HlsStreamInfResolution extends js.Any
  object HlsStreamInfResolution extends js.Object {
    val EXCLUDE = "EXCLUDE".asInstanceOf[HlsStreamInfResolution]
    val INCLUDE = "INCLUDE".asInstanceOf[HlsStreamInfResolution]

    val values = js.Object.freeze(js.Array(EXCLUDE, INCLUDE))
  }

  /**
    * Hls Timed Metadata Id3 Frame
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
  @js.native
  sealed trait HlsTsFileMode extends js.Any
  object HlsTsFileMode extends js.Object {
    val SEGMENTED_FILES = "SEGMENTED_FILES".asInstanceOf[HlsTsFileMode]
    val SINGLE_FILE     = "SINGLE_FILE".asInstanceOf[HlsTsFileMode]

    val values = js.Object.freeze(js.Array(SEGMENTED_FILES, SINGLE_FILE))
  }

  /**
    * Hls Webdav Http Transfer Mode
    */
  @js.native
  sealed trait HlsWebdavHttpTransferMode extends js.Any
  object HlsWebdavHttpTransferMode extends js.Object {
    val CHUNKED     = "CHUNKED".asInstanceOf[HlsWebdavHttpTransferMode]
    val NON_CHUNKED = "NON_CHUNKED".asInstanceOf[HlsWebdavHttpTransferMode]

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
  @js.native
  sealed trait IFrameOnlyPlaylistType extends js.Any
  object IFrameOnlyPlaylistType extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[IFrameOnlyPlaylistType]
    val STANDARD = "STANDARD".asInstanceOf[IFrameOnlyPlaylistType]

    val values = js.Object.freeze(js.Array(DISABLED, STANDARD))
  }

  /**
    * Settings to configure an action so that it occurs as soon as possible.
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
    var InputDevices: js.UndefOr[__listOfInputDeviceSettings]
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
        InputDevices: js.UndefOr[__listOfInputDeviceSettings] = js.undefined,
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
      InputDevices.foreach(__v => __obj.updateDynamic("InputDevices")(__v.asInstanceOf[js.Any]))
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
    var AutomaticInputFailoverSettings: js.UndefOr[AutomaticInputFailoverSettings]
    var InputAttachmentName: js.UndefOr[__string]
    var InputId: js.UndefOr[__string]
    var InputSettings: js.UndefOr[InputSettings]
  }

  object InputAttachment {
    @inline
    def apply(
        AutomaticInputFailoverSettings: js.UndefOr[AutomaticInputFailoverSettings] = js.undefined,
        InputAttachmentName: js.UndefOr[__string] = js.undefined,
        InputId: js.UndefOr[__string] = js.undefined,
        InputSettings: js.UndefOr[InputSettings] = js.undefined
    ): InputAttachment = {
      val __obj = js.Dynamic.literal()
      AutomaticInputFailoverSettings.foreach(__v =>
        __obj.updateDynamic("AutomaticInputFailoverSettings")(__v.asInstanceOf[js.Any])
      )
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
  @js.native
  sealed trait InputClass extends js.Any
  object InputClass extends js.Object {
    val STANDARD        = "STANDARD".asInstanceOf[InputClass]
    val SINGLE_PIPELINE = "SINGLE_PIPELINE".asInstanceOf[InputClass]

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
  @js.native
  sealed trait InputCodec extends js.Any
  object InputCodec extends js.Object {
    val MPEG2 = "MPEG2".asInstanceOf[InputCodec]
    val AVC   = "AVC".asInstanceOf[InputCodec]
    val HEVC  = "HEVC".asInstanceOf[InputCodec]

    val values = js.Object.freeze(js.Array(MPEG2, AVC, HEVC))
  }

  /**
    * Input Deblock Filter
    */
  @js.native
  sealed trait InputDeblockFilter extends js.Any
  object InputDeblockFilter extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[InputDeblockFilter]
    val ENABLED  = "ENABLED".asInstanceOf[InputDeblockFilter]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * Input Denoise Filter
    */
  @js.native
  sealed trait InputDenoiseFilter extends js.Any
  object InputDenoiseFilter extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[InputDenoiseFilter]
    val ENABLED  = "ENABLED".asInstanceOf[InputDenoiseFilter]

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
    * The source at the input device that is currently active.
    */
  @js.native
  sealed trait InputDeviceActiveInput extends js.Any
  object InputDeviceActiveInput extends js.Object {
    val HDMI = "HDMI".asInstanceOf[InputDeviceActiveInput]
    val SDI  = "SDI".asInstanceOf[InputDeviceActiveInput]

    val values = js.Object.freeze(js.Array(HDMI, SDI))
  }

  /**
    * Configurable settings for the input device.
    */
  @js.native
  trait InputDeviceConfigurableSettings extends js.Object {
    var ConfiguredInput: js.UndefOr[InputDeviceConfiguredInput]
    var MaxBitrate: js.UndefOr[__integer]
  }

  object InputDeviceConfigurableSettings {
    @inline
    def apply(
        ConfiguredInput: js.UndefOr[InputDeviceConfiguredInput] = js.undefined,
        MaxBitrate: js.UndefOr[__integer] = js.undefined
    ): InputDeviceConfigurableSettings = {
      val __obj = js.Dynamic.literal()
      ConfiguredInput.foreach(__v => __obj.updateDynamic("ConfiguredInput")(__v.asInstanceOf[js.Any]))
      MaxBitrate.foreach(__v => __obj.updateDynamic("MaxBitrate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputDeviceConfigurableSettings]
    }
  }

  /**
    * The source to activate (use) from the input device.
    */
  @js.native
  sealed trait InputDeviceConfiguredInput extends js.Any
  object InputDeviceConfiguredInput extends js.Object {
    val AUTO = "AUTO".asInstanceOf[InputDeviceConfiguredInput]
    val HDMI = "HDMI".asInstanceOf[InputDeviceConfiguredInput]
    val SDI  = "SDI".asInstanceOf[InputDeviceConfiguredInput]

    val values = js.Object.freeze(js.Array(AUTO, HDMI, SDI))
  }

  /**
    * The state of the connection between the input device and AWS.
    */
  @js.native
  sealed trait InputDeviceConnectionState extends js.Any
  object InputDeviceConnectionState extends js.Object {
    val DISCONNECTED = "DISCONNECTED".asInstanceOf[InputDeviceConnectionState]
    val CONNECTED    = "CONNECTED".asInstanceOf[InputDeviceConnectionState]

    val values = js.Object.freeze(js.Array(DISCONNECTED, CONNECTED))
  }

  /**
    * Settings that describe the active source from the input device, and the video characteristics of that source.
    */
  @js.native
  trait InputDeviceHdSettings extends js.Object {
    var ActiveInput: js.UndefOr[InputDeviceActiveInput]
    var ConfiguredInput: js.UndefOr[InputDeviceConfiguredInput]
    var DeviceState: js.UndefOr[InputDeviceState]
    var Framerate: js.UndefOr[__double]
    var Height: js.UndefOr[__integer]
    var MaxBitrate: js.UndefOr[__integer]
    var ScanType: js.UndefOr[InputDeviceScanType]
    var Width: js.UndefOr[__integer]
  }

  object InputDeviceHdSettings {
    @inline
    def apply(
        ActiveInput: js.UndefOr[InputDeviceActiveInput] = js.undefined,
        ConfiguredInput: js.UndefOr[InputDeviceConfiguredInput] = js.undefined,
        DeviceState: js.UndefOr[InputDeviceState] = js.undefined,
        Framerate: js.UndefOr[__double] = js.undefined,
        Height: js.UndefOr[__integer] = js.undefined,
        MaxBitrate: js.UndefOr[__integer] = js.undefined,
        ScanType: js.UndefOr[InputDeviceScanType] = js.undefined,
        Width: js.UndefOr[__integer] = js.undefined
    ): InputDeviceHdSettings = {
      val __obj = js.Dynamic.literal()
      ActiveInput.foreach(__v => __obj.updateDynamic("ActiveInput")(__v.asInstanceOf[js.Any]))
      ConfiguredInput.foreach(__v => __obj.updateDynamic("ConfiguredInput")(__v.asInstanceOf[js.Any]))
      DeviceState.foreach(__v => __obj.updateDynamic("DeviceState")(__v.asInstanceOf[js.Any]))
      Framerate.foreach(__v => __obj.updateDynamic("Framerate")(__v.asInstanceOf[js.Any]))
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      MaxBitrate.foreach(__v => __obj.updateDynamic("MaxBitrate")(__v.asInstanceOf[js.Any]))
      ScanType.foreach(__v => __obj.updateDynamic("ScanType")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputDeviceHdSettings]
    }
  }

  /**
    * Specifies whether the input device has been configured (outside of MediaLive) to use a dynamic IP address assignment (DHCP) or a static IP address.
    */
  @js.native
  sealed trait InputDeviceIpScheme extends js.Any
  object InputDeviceIpScheme extends js.Object {
    val STATIC = "STATIC".asInstanceOf[InputDeviceIpScheme]
    val DHCP   = "DHCP".asInstanceOf[InputDeviceIpScheme]

    val values = js.Object.freeze(js.Array(STATIC, DHCP))
  }

  /**
    * The network settings for the input device.
    */
  @js.native
  trait InputDeviceNetworkSettings extends js.Object {
    var DnsAddresses: js.UndefOr[__listOf__string]
    var Gateway: js.UndefOr[__string]
    var IpAddress: js.UndefOr[__string]
    var IpScheme: js.UndefOr[InputDeviceIpScheme]
    var SubnetMask: js.UndefOr[__string]
  }

  object InputDeviceNetworkSettings {
    @inline
    def apply(
        DnsAddresses: js.UndefOr[__listOf__string] = js.undefined,
        Gateway: js.UndefOr[__string] = js.undefined,
        IpAddress: js.UndefOr[__string] = js.undefined,
        IpScheme: js.UndefOr[InputDeviceIpScheme] = js.undefined,
        SubnetMask: js.UndefOr[__string] = js.undefined
    ): InputDeviceNetworkSettings = {
      val __obj = js.Dynamic.literal()
      DnsAddresses.foreach(__v => __obj.updateDynamic("DnsAddresses")(__v.asInstanceOf[js.Any]))
      Gateway.foreach(__v => __obj.updateDynamic("Gateway")(__v.asInstanceOf[js.Any]))
      IpAddress.foreach(__v => __obj.updateDynamic("IpAddress")(__v.asInstanceOf[js.Any]))
      IpScheme.foreach(__v => __obj.updateDynamic("IpScheme")(__v.asInstanceOf[js.Any]))
      SubnetMask.foreach(__v => __obj.updateDynamic("SubnetMask")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputDeviceNetworkSettings]
    }
  }

  /**
    * Settings for an input device.
    */
  @js.native
  trait InputDeviceRequest extends js.Object {
    var Id: js.UndefOr[__string]
  }

  object InputDeviceRequest {
    @inline
    def apply(
        Id: js.UndefOr[__string] = js.undefined
    ): InputDeviceRequest = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputDeviceRequest]
    }
  }

  /**
    * The scan type of the video source.
    */
  @js.native
  sealed trait InputDeviceScanType extends js.Any
  object InputDeviceScanType extends js.Object {
    val INTERLACED  = "INTERLACED".asInstanceOf[InputDeviceScanType]
    val PROGRESSIVE = "PROGRESSIVE".asInstanceOf[InputDeviceScanType]

    val values = js.Object.freeze(js.Array(INTERLACED, PROGRESSIVE))
  }

  /**
    * Settings for an input device.
    */
  @js.native
  trait InputDeviceSettings extends js.Object {
    var Id: js.UndefOr[__string]
  }

  object InputDeviceSettings {
    @inline
    def apply(
        Id: js.UndefOr[__string] = js.undefined
    ): InputDeviceSettings = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputDeviceSettings]
    }
  }

  /**
    * The state of the input device.
    */
  @js.native
  sealed trait InputDeviceState extends js.Any
  object InputDeviceState extends js.Object {
    val IDLE      = "IDLE".asInstanceOf[InputDeviceState]
    val STREAMING = "STREAMING".asInstanceOf[InputDeviceState]

    val values = js.Object.freeze(js.Array(IDLE, STREAMING))
  }

  /**
    * Details of the input device.
    */
  @js.native
  trait InputDeviceSummary extends js.Object {
    var Arn: js.UndefOr[__string]
    var ConnectionState: js.UndefOr[InputDeviceConnectionState]
    var DeviceSettingsSyncState: js.UndefOr[DeviceSettingsSyncState]
    var HdDeviceSettings: js.UndefOr[InputDeviceHdSettings]
    var Id: js.UndefOr[__string]
    var MacAddress: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var NetworkSettings: js.UndefOr[InputDeviceNetworkSettings]
    var SerialNumber: js.UndefOr[__string]
    var Type: js.UndefOr[InputDeviceType]
  }

  object InputDeviceSummary {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        ConnectionState: js.UndefOr[InputDeviceConnectionState] = js.undefined,
        DeviceSettingsSyncState: js.UndefOr[DeviceSettingsSyncState] = js.undefined,
        HdDeviceSettings: js.UndefOr[InputDeviceHdSettings] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        MacAddress: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        NetworkSettings: js.UndefOr[InputDeviceNetworkSettings] = js.undefined,
        SerialNumber: js.UndefOr[__string] = js.undefined,
        Type: js.UndefOr[InputDeviceType] = js.undefined
    ): InputDeviceSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ConnectionState.foreach(__v => __obj.updateDynamic("ConnectionState")(__v.asInstanceOf[js.Any]))
      DeviceSettingsSyncState.foreach(__v => __obj.updateDynamic("DeviceSettingsSyncState")(__v.asInstanceOf[js.Any]))
      HdDeviceSettings.foreach(__v => __obj.updateDynamic("HdDeviceSettings")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      MacAddress.foreach(__v => __obj.updateDynamic("MacAddress")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NetworkSettings.foreach(__v => __obj.updateDynamic("NetworkSettings")(__v.asInstanceOf[js.Any]))
      SerialNumber.foreach(__v => __obj.updateDynamic("SerialNumber")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputDeviceSummary]
    }
  }

  /**
    * The type of the input device. For an AWS Elemental Link device that outputs resolutions up to 1080, choose "HD".
    */
  @js.native
  sealed trait InputDeviceType extends js.Any
  object InputDeviceType extends js.Object {
    val HD = "HD".asInstanceOf[InputDeviceType]

    val values = js.Object.freeze(js.Array(HD))
  }

  /**
    * Input Filter
    */
  @js.native
  sealed trait InputFilter extends js.Any
  object InputFilter extends js.Object {
    val AUTO     = "AUTO".asInstanceOf[InputFilter]
    val DISABLED = "DISABLED".asInstanceOf[InputFilter]
    val FORCED   = "FORCED".asInstanceOf[InputFilter]

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
  @js.native
  sealed trait InputLossActionForHlsOut extends js.Any
  object InputLossActionForHlsOut extends js.Object {
    val EMIT_OUTPUT  = "EMIT_OUTPUT".asInstanceOf[InputLossActionForHlsOut]
    val PAUSE_OUTPUT = "PAUSE_OUTPUT".asInstanceOf[InputLossActionForHlsOut]

    val values = js.Object.freeze(js.Array(EMIT_OUTPUT, PAUSE_OUTPUT))
  }

  /**
    * Input Loss Action For Ms Smooth Out
    */
  @js.native
  sealed trait InputLossActionForMsSmoothOut extends js.Any
  object InputLossActionForMsSmoothOut extends js.Object {
    val EMIT_OUTPUT  = "EMIT_OUTPUT".asInstanceOf[InputLossActionForMsSmoothOut]
    val PAUSE_OUTPUT = "PAUSE_OUTPUT".asInstanceOf[InputLossActionForMsSmoothOut]

    val values = js.Object.freeze(js.Array(EMIT_OUTPUT, PAUSE_OUTPUT))
  }

  /**
    * Input Loss Action For Rtmp Out
    */
  @js.native
  sealed trait InputLossActionForRtmpOut extends js.Any
  object InputLossActionForRtmpOut extends js.Object {
    val EMIT_OUTPUT  = "EMIT_OUTPUT".asInstanceOf[InputLossActionForRtmpOut]
    val PAUSE_OUTPUT = "PAUSE_OUTPUT".asInstanceOf[InputLossActionForRtmpOut]

    val values = js.Object.freeze(js.Array(EMIT_OUTPUT, PAUSE_OUTPUT))
  }

  /**
    * Input Loss Action For Udp Out
    */
  @js.native
  sealed trait InputLossActionForUdpOut extends js.Any
  object InputLossActionForUdpOut extends js.Object {
    val DROP_PROGRAM = "DROP_PROGRAM".asInstanceOf[InputLossActionForUdpOut]
    val DROP_TS      = "DROP_TS".asInstanceOf[InputLossActionForUdpOut]
    val EMIT_PROGRAM = "EMIT_PROGRAM".asInstanceOf[InputLossActionForUdpOut]

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
  @js.native
  sealed trait InputLossImageType extends js.Any
  object InputLossImageType extends js.Object {
    val COLOR = "COLOR".asInstanceOf[InputLossImageType]
    val SLATE = "SLATE".asInstanceOf[InputLossImageType]

    val values = js.Object.freeze(js.Array(COLOR, SLATE))
  }

  /**
    * Maximum input bitrate in megabits per second. Bitrates up to 50 Mbps are supported currently.
    */
  @js.native
  sealed trait InputMaximumBitrate extends js.Any
  object InputMaximumBitrate extends js.Object {
    val MAX_10_MBPS = "MAX_10_MBPS".asInstanceOf[InputMaximumBitrate]
    val MAX_20_MBPS = "MAX_20_MBPS".asInstanceOf[InputMaximumBitrate]
    val MAX_50_MBPS = "MAX_50_MBPS".asInstanceOf[InputMaximumBitrate]

    val values = js.Object.freeze(js.Array(MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS))
  }

  /**
    * Input preference when deciding which input to make active when a previously failed input has recovered.
    * If \"EQUAL_INPUT_PREFERENCE\", then the active input will stay active as long as it is healthy.
    * If \"PRIMARY_INPUT_PREFERRED\", then always switch back to the primary input when it is healthy.
    */
  @js.native
  sealed trait InputPreference extends js.Any
  object InputPreference extends js.Object {
    val EQUAL_INPUT_PREFERENCE  = "EQUAL_INPUT_PREFERENCE".asInstanceOf[InputPreference]
    val PRIMARY_INPUT_PREFERRED = "PRIMARY_INPUT_PREFERRED".asInstanceOf[InputPreference]

    val values = js.Object.freeze(js.Array(EQUAL_INPUT_PREFERENCE, PRIMARY_INPUT_PREFERRED))
  }

  /**
    * Action to prepare an input for a future immediate input switch.
    */
  @js.native
  trait InputPrepareScheduleActionSettings extends js.Object {
    var InputAttachmentNameReference: __string
    var InputClippingSettings: js.UndefOr[InputClippingSettings]
    var UrlPath: js.UndefOr[__listOf__string]
  }

  object InputPrepareScheduleActionSettings {
    @inline
    def apply(
        InputAttachmentNameReference: __string,
        InputClippingSettings: js.UndefOr[InputClippingSettings] = js.undefined,
        UrlPath: js.UndefOr[__listOf__string] = js.undefined
    ): InputPrepareScheduleActionSettings = {
      val __obj = js.Dynamic.literal(
        "InputAttachmentNameReference" -> InputAttachmentNameReference.asInstanceOf[js.Any]
      )

      InputClippingSettings.foreach(__v => __obj.updateDynamic("InputClippingSettings")(__v.asInstanceOf[js.Any]))
      UrlPath.foreach(__v => __obj.updateDynamic("UrlPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputPrepareScheduleActionSettings]
    }
  }

  /**
    * Input resolution based on lines of vertical resolution in the input; SD is less than 720 lines, HD is 720 to 1080 lines, UHD is greater than 1080 lines
    */
  @js.native
  sealed trait InputResolution extends js.Any
  object InputResolution extends js.Object {
    val SD  = "SD".asInstanceOf[InputResolution]
    val HD  = "HD".asInstanceOf[InputResolution]
    val UHD = "UHD".asInstanceOf[InputResolution]

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
  @js.native
  sealed trait InputSecurityGroupState extends js.Any
  object InputSecurityGroupState extends js.Object {
    val IDLE     = "IDLE".asInstanceOf[InputSecurityGroupState]
    val IN_USE   = "IN_USE".asInstanceOf[InputSecurityGroupState]
    val UPDATING = "UPDATING".asInstanceOf[InputSecurityGroupState]
    val DELETED  = "DELETED".asInstanceOf[InputSecurityGroupState]

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
    var Smpte2038DataPreference: js.UndefOr[Smpte2038DataPreference]
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
        Smpte2038DataPreference: js.UndefOr[Smpte2038DataPreference] = js.undefined,
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
      Smpte2038DataPreference.foreach(__v => __obj.updateDynamic("Smpte2038DataPreference")(__v.asInstanceOf[js.Any]))
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
  @js.native
  sealed trait InputSourceEndBehavior extends js.Any
  object InputSourceEndBehavior extends js.Object {
    val CONTINUE = "CONTINUE".asInstanceOf[InputSourceEndBehavior]
    val LOOP     = "LOOP".asInstanceOf[InputSourceEndBehavior]

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
  @js.native
  sealed trait InputSourceType extends js.Any
  object InputSourceType extends js.Object {
    val STATIC  = "STATIC".asInstanceOf[InputSourceType]
    val DYNAMIC = "DYNAMIC".asInstanceOf[InputSourceType]

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
  @js.native
  sealed trait InputState extends js.Any
  object InputState extends js.Object {
    val CREATING = "CREATING".asInstanceOf[InputState]
    val DETACHED = "DETACHED".asInstanceOf[InputState]
    val ATTACHED = "ATTACHED".asInstanceOf[InputState]
    val DELETING = "DELETING".asInstanceOf[InputState]
    val DELETED  = "DELETED".asInstanceOf[InputState]

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
  @js.native
  sealed trait InputTimecodeSource extends js.Any
  object InputTimecodeSource extends js.Object {
    val ZEROBASED = "ZEROBASED".asInstanceOf[InputTimecodeSource]
    val EMBEDDED  = "EMBEDDED".asInstanceOf[InputTimecodeSource]

    val values = js.Object.freeze(js.Array(ZEROBASED, EMBEDDED))
  }

  /**
    * Placeholder documentation for InputType
    */
  @js.native
  sealed trait InputType extends js.Any
  object InputType extends js.Object {
    val UDP_PUSH     = "UDP_PUSH".asInstanceOf[InputType]
    val RTP_PUSH     = "RTP_PUSH".asInstanceOf[InputType]
    val RTMP_PUSH    = "RTMP_PUSH".asInstanceOf[InputType]
    val RTMP_PULL    = "RTMP_PULL".asInstanceOf[InputType]
    val URL_PULL     = "URL_PULL".asInstanceOf[InputType]
    val MP4_FILE     = "MP4_FILE".asInstanceOf[InputType]
    val MEDIACONNECT = "MEDIACONNECT".asInstanceOf[InputType]
    val INPUT_DEVICE = "INPUT_DEVICE".asInstanceOf[InputType]

    val values = js.Object.freeze(
      js.Array(UDP_PUSH, RTP_PUSH, RTMP_PUSH, RTMP_PULL, URL_PULL, MP4_FILE, MEDIACONNECT, INPUT_DEVICE)
    )
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
  @js.native
  sealed trait LastFrameClippingBehavior extends js.Any
  object LastFrameClippingBehavior extends js.Object {
    val EXCLUDE_LAST_FRAME = "EXCLUDE_LAST_FRAME".asInstanceOf[LastFrameClippingBehavior]
    val INCLUDE_LAST_FRAME = "INCLUDE_LAST_FRAME".asInstanceOf[LastFrameClippingBehavior]

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
    * Placeholder documentation for ListInputDevicesRequest
    */
  @js.native
  trait ListInputDevicesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListInputDevicesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListInputDevicesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInputDevicesRequest]
    }
  }

  /**
    * Placeholder documentation for ListInputDevicesResponse
    */
  @js.native
  trait ListInputDevicesResponse extends js.Object {
    var InputDevices: js.UndefOr[__listOfInputDeviceSummary]
    var NextToken: js.UndefOr[__string]
  }

  object ListInputDevicesResponse {
    @inline
    def apply(
        InputDevices: js.UndefOr[__listOfInputDeviceSummary] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListInputDevicesResponse = {
      val __obj = js.Dynamic.literal()
      InputDevices.foreach(__v => __obj.updateDynamic("InputDevices")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInputDevicesResponse]
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
    * Placeholder documentation for ListMultiplexProgramsRequest
    */
  @js.native
  trait ListMultiplexProgramsRequest extends js.Object {
    var MultiplexId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListMultiplexProgramsRequest {
    @inline
    def apply(
        MultiplexId: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListMultiplexProgramsRequest = {
      val __obj = js.Dynamic.literal(
        "MultiplexId" -> MultiplexId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMultiplexProgramsRequest]
    }
  }

  /**
    * Placeholder documentation for ListMultiplexProgramsResponse
    */
  @js.native
  trait ListMultiplexProgramsResponse extends js.Object {
    var MultiplexPrograms: js.UndefOr[__listOfMultiplexProgramSummary]
    var NextToken: js.UndefOr[__string]
  }

  object ListMultiplexProgramsResponse {
    @inline
    def apply(
        MultiplexPrograms: js.UndefOr[__listOfMultiplexProgramSummary] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListMultiplexProgramsResponse = {
      val __obj = js.Dynamic.literal()
      MultiplexPrograms.foreach(__v => __obj.updateDynamic("MultiplexPrograms")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMultiplexProgramsResponse]
    }
  }

  /**
    * Placeholder documentation for ListMultiplexesRequest
    */
  @js.native
  trait ListMultiplexesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListMultiplexesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListMultiplexesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMultiplexesRequest]
    }
  }

  /**
    * Placeholder documentation for ListMultiplexesResponse
    */
  @js.native
  trait ListMultiplexesResponse extends js.Object {
    var Multiplexes: js.UndefOr[__listOfMultiplexSummary]
    var NextToken: js.UndefOr[__string]
  }

  object ListMultiplexesResponse {
    @inline
    def apply(
        Multiplexes: js.UndefOr[__listOfMultiplexSummary] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListMultiplexesResponse = {
      val __obj = js.Dynamic.literal()
      Multiplexes.foreach(__v => __obj.updateDynamic("Multiplexes")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMultiplexesResponse]
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
    var Duration: js.UndefOr[__string]
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
        Duration: js.UndefOr[__string] = js.undefined,
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
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
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
  @js.native
  sealed trait LogLevel extends js.Any
  object LogLevel extends js.Object {
    val ERROR    = "ERROR".asInstanceOf[LogLevel]
    val WARNING  = "WARNING".asInstanceOf[LogLevel]
    val INFO     = "INFO".asInstanceOf[LogLevel]
    val DEBUG    = "DEBUG".asInstanceOf[LogLevel]
    val DISABLED = "DISABLED".asInstanceOf[LogLevel]

    val values = js.Object.freeze(js.Array(ERROR, WARNING, INFO, DEBUG, DISABLED))
  }

  /**
    * M2ts Absent Input Audio Behavior
    */
  @js.native
  sealed trait M2tsAbsentInputAudioBehavior extends js.Any
  object M2tsAbsentInputAudioBehavior extends js.Object {
    val DROP           = "DROP".asInstanceOf[M2tsAbsentInputAudioBehavior]
    val ENCODE_SILENCE = "ENCODE_SILENCE".asInstanceOf[M2tsAbsentInputAudioBehavior]

    val values = js.Object.freeze(js.Array(DROP, ENCODE_SILENCE))
  }

  /**
    * M2ts Arib
    */
  @js.native
  sealed trait M2tsArib extends js.Any
  object M2tsArib extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[M2tsArib]
    val ENABLED  = "ENABLED".asInstanceOf[M2tsArib]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * M2ts Arib Captions Pid Control
    */
  @js.native
  sealed trait M2tsAribCaptionsPidControl extends js.Any
  object M2tsAribCaptionsPidControl extends js.Object {
    val AUTO           = "AUTO".asInstanceOf[M2tsAribCaptionsPidControl]
    val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[M2tsAribCaptionsPidControl]

    val values = js.Object.freeze(js.Array(AUTO, USE_CONFIGURED))
  }

  /**
    * M2ts Audio Buffer Model
    */
  @js.native
  sealed trait M2tsAudioBufferModel extends js.Any
  object M2tsAudioBufferModel extends js.Object {
    val ATSC = "ATSC".asInstanceOf[M2tsAudioBufferModel]
    val DVB  = "DVB".asInstanceOf[M2tsAudioBufferModel]

    val values = js.Object.freeze(js.Array(ATSC, DVB))
  }

  /**
    * M2ts Audio Interval
    */
  @js.native
  sealed trait M2tsAudioInterval extends js.Any
  object M2tsAudioInterval extends js.Object {
    val VIDEO_AND_FIXED_INTERVALS = "VIDEO_AND_FIXED_INTERVALS".asInstanceOf[M2tsAudioInterval]
    val VIDEO_INTERVAL            = "VIDEO_INTERVAL".asInstanceOf[M2tsAudioInterval]

    val values = js.Object.freeze(js.Array(VIDEO_AND_FIXED_INTERVALS, VIDEO_INTERVAL))
  }

  /**
    * M2ts Audio Stream Type
    */
  @js.native
  sealed trait M2tsAudioStreamType extends js.Any
  object M2tsAudioStreamType extends js.Object {
    val ATSC = "ATSC".asInstanceOf[M2tsAudioStreamType]
    val DVB  = "DVB".asInstanceOf[M2tsAudioStreamType]

    val values = js.Object.freeze(js.Array(ATSC, DVB))
  }

  /**
    * M2ts Buffer Model
    */
  @js.native
  sealed trait M2tsBufferModel extends js.Any
  object M2tsBufferModel extends js.Object {
    val MULTIPLEX = "MULTIPLEX".asInstanceOf[M2tsBufferModel]
    val NONE      = "NONE".asInstanceOf[M2tsBufferModel]

    val values = js.Object.freeze(js.Array(MULTIPLEX, NONE))
  }

  /**
    * M2ts Cc Descriptor
    */
  @js.native
  sealed trait M2tsCcDescriptor extends js.Any
  object M2tsCcDescriptor extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[M2tsCcDescriptor]
    val ENABLED  = "ENABLED".asInstanceOf[M2tsCcDescriptor]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
  }

  /**
    * M2ts Ebif Control
    */
  @js.native
  sealed trait M2tsEbifControl extends js.Any
  object M2tsEbifControl extends js.Object {
    val NONE        = "NONE".asInstanceOf[M2tsEbifControl]
    val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[M2tsEbifControl]

    val values = js.Object.freeze(js.Array(NONE, PASSTHROUGH))
  }

  /**
    * M2ts Ebp Placement
    */
  @js.native
  sealed trait M2tsEbpPlacement extends js.Any
  object M2tsEbpPlacement extends js.Object {
    val VIDEO_AND_AUDIO_PIDS = "VIDEO_AND_AUDIO_PIDS".asInstanceOf[M2tsEbpPlacement]
    val VIDEO_PID            = "VIDEO_PID".asInstanceOf[M2tsEbpPlacement]

    val values = js.Object.freeze(js.Array(VIDEO_AND_AUDIO_PIDS, VIDEO_PID))
  }

  /**
    * M2ts Es Rate In Pes
    */
  @js.native
  sealed trait M2tsEsRateInPes extends js.Any
  object M2tsEsRateInPes extends js.Object {
    val EXCLUDE = "EXCLUDE".asInstanceOf[M2tsEsRateInPes]
    val INCLUDE = "INCLUDE".asInstanceOf[M2tsEsRateInPes]

    val values = js.Object.freeze(js.Array(EXCLUDE, INCLUDE))
  }

  /**
    * M2ts Klv
    */
  @js.native
  sealed trait M2tsKlv extends js.Any
  object M2tsKlv extends js.Object {
    val NONE        = "NONE".asInstanceOf[M2tsKlv]
    val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[M2tsKlv]

    val values = js.Object.freeze(js.Array(NONE, PASSTHROUGH))
  }

  /**
    * M2ts Nielsen Id3 Behavior
    */
  @js.native
  sealed trait M2tsNielsenId3Behavior extends js.Any
  object M2tsNielsenId3Behavior extends js.Object {
    val NO_PASSTHROUGH = "NO_PASSTHROUGH".asInstanceOf[M2tsNielsenId3Behavior]
    val PASSTHROUGH    = "PASSTHROUGH".asInstanceOf[M2tsNielsenId3Behavior]

    val values = js.Object.freeze(js.Array(NO_PASSTHROUGH, PASSTHROUGH))
  }

  /**
    * M2ts Pcr Control
    */
  @js.native
  sealed trait M2tsPcrControl extends js.Any
  object M2tsPcrControl extends js.Object {
    val CONFIGURED_PCR_PERIOD = "CONFIGURED_PCR_PERIOD".asInstanceOf[M2tsPcrControl]
    val PCR_EVERY_PES_PACKET  = "PCR_EVERY_PES_PACKET".asInstanceOf[M2tsPcrControl]

    val values = js.Object.freeze(js.Array(CONFIGURED_PCR_PERIOD, PCR_EVERY_PES_PACKET))
  }

  /**
    * M2ts Rate Mode
    */
  @js.native
  sealed trait M2tsRateMode extends js.Any
  object M2tsRateMode extends js.Object {
    val CBR = "CBR".asInstanceOf[M2tsRateMode]
    val VBR = "VBR".asInstanceOf[M2tsRateMode]

    val values = js.Object.freeze(js.Array(CBR, VBR))
  }

  /**
    * M2ts Scte35 Control
    */
  @js.native
  sealed trait M2tsScte35Control extends js.Any
  object M2tsScte35Control extends js.Object {
    val NONE        = "NONE".asInstanceOf[M2tsScte35Control]
    val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[M2tsScte35Control]

    val values = js.Object.freeze(js.Array(NONE, PASSTHROUGH))
  }

  /**
    * M2ts Segmentation Markers
    */
  @js.native
  sealed trait M2tsSegmentationMarkers extends js.Any
  object M2tsSegmentationMarkers extends js.Object {
    val EBP          = "EBP".asInstanceOf[M2tsSegmentationMarkers]
    val EBP_LEGACY   = "EBP_LEGACY".asInstanceOf[M2tsSegmentationMarkers]
    val NONE         = "NONE".asInstanceOf[M2tsSegmentationMarkers]
    val PSI_SEGSTART = "PSI_SEGSTART".asInstanceOf[M2tsSegmentationMarkers]
    val RAI_ADAPT    = "RAI_ADAPT".asInstanceOf[M2tsSegmentationMarkers]
    val RAI_SEGSTART = "RAI_SEGSTART".asInstanceOf[M2tsSegmentationMarkers]

    val values = js.Object.freeze(js.Array(EBP, EBP_LEGACY, NONE, PSI_SEGSTART, RAI_ADAPT, RAI_SEGSTART))
  }

  /**
    * M2ts Segmentation Style
    */
  @js.native
  sealed trait M2tsSegmentationStyle extends js.Any
  object M2tsSegmentationStyle extends js.Object {
    val MAINTAIN_CADENCE = "MAINTAIN_CADENCE".asInstanceOf[M2tsSegmentationStyle]
    val RESET_CADENCE    = "RESET_CADENCE".asInstanceOf[M2tsSegmentationStyle]

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
    var NielsenId3Behavior: js.UndefOr[M2tsNielsenId3Behavior]
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
        NielsenId3Behavior: js.UndefOr[M2tsNielsenId3Behavior] = js.undefined,
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
      NielsenId3Behavior.foreach(__v => __obj.updateDynamic("NielsenId3Behavior")(__v.asInstanceOf[js.Any]))
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
  @js.native
  sealed trait M2tsTimedMetadataBehavior extends js.Any
  object M2tsTimedMetadataBehavior extends js.Object {
    val NO_PASSTHROUGH = "NO_PASSTHROUGH".asInstanceOf[M2tsTimedMetadataBehavior]
    val PASSTHROUGH    = "PASSTHROUGH".asInstanceOf[M2tsTimedMetadataBehavior]

    val values = js.Object.freeze(js.Array(NO_PASSTHROUGH, PASSTHROUGH))
  }

  /**
    * M3u8 Nielsen Id3 Behavior
    */
  @js.native
  sealed trait M3u8NielsenId3Behavior extends js.Any
  object M3u8NielsenId3Behavior extends js.Object {
    val NO_PASSTHROUGH = "NO_PASSTHROUGH".asInstanceOf[M3u8NielsenId3Behavior]
    val PASSTHROUGH    = "PASSTHROUGH".asInstanceOf[M3u8NielsenId3Behavior]

    val values = js.Object.freeze(js.Array(NO_PASSTHROUGH, PASSTHROUGH))
  }

  /**
    * M3u8 Pcr Control
    */
  @js.native
  sealed trait M3u8PcrControl extends js.Any
  object M3u8PcrControl extends js.Object {
    val CONFIGURED_PCR_PERIOD = "CONFIGURED_PCR_PERIOD".asInstanceOf[M3u8PcrControl]
    val PCR_EVERY_PES_PACKET  = "PCR_EVERY_PES_PACKET".asInstanceOf[M3u8PcrControl]

    val values = js.Object.freeze(js.Array(CONFIGURED_PCR_PERIOD, PCR_EVERY_PES_PACKET))
  }

  /**
    * M3u8 Scte35 Behavior
    */
  @js.native
  sealed trait M3u8Scte35Behavior extends js.Any
  object M3u8Scte35Behavior extends js.Object {
    val NO_PASSTHROUGH = "NO_PASSTHROUGH".asInstanceOf[M3u8Scte35Behavior]
    val PASSTHROUGH    = "PASSTHROUGH".asInstanceOf[M3u8Scte35Behavior]

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
    var NielsenId3Behavior: js.UndefOr[M3u8NielsenId3Behavior]
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
        NielsenId3Behavior: js.UndefOr[M3u8NielsenId3Behavior] = js.undefined,
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
      NielsenId3Behavior.foreach(__v => __obj.updateDynamic("NielsenId3Behavior")(__v.asInstanceOf[js.Any]))
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
  @js.native
  sealed trait M3u8TimedMetadataBehavior extends js.Any
  object M3u8TimedMetadataBehavior extends js.Object {
    val NO_PASSTHROUGH = "NO_PASSTHROUGH".asInstanceOf[M3u8TimedMetadataBehavior]
    val PASSTHROUGH    = "PASSTHROUGH".asInstanceOf[M3u8TimedMetadataBehavior]

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
  @js.native
  sealed trait Mp2CodingMode extends js.Any
  object Mp2CodingMode extends js.Object {
    val CODING_MODE_1_0 = "CODING_MODE_1_0".asInstanceOf[Mp2CodingMode]
    val CODING_MODE_2_0 = "CODING_MODE_2_0".asInstanceOf[Mp2CodingMode]

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
    * Ms Smooth H265 Packaging Type
    */
  @js.native
  sealed trait MsSmoothH265PackagingType extends js.Any
  object MsSmoothH265PackagingType extends js.Object {
    val HEV1 = "HEV1".asInstanceOf[MsSmoothH265PackagingType]
    val HVC1 = "HVC1".asInstanceOf[MsSmoothH265PackagingType]

    val values = js.Object.freeze(js.Array(HEV1, HVC1))
  }

  /**
    * Ms Smooth Output Settings
    */
  @js.native
  trait MsSmoothOutputSettings extends js.Object {
    var H265PackagingType: js.UndefOr[MsSmoothH265PackagingType]
    var NameModifier: js.UndefOr[__string]
  }

  object MsSmoothOutputSettings {
    @inline
    def apply(
        H265PackagingType: js.UndefOr[MsSmoothH265PackagingType] = js.undefined,
        NameModifier: js.UndefOr[__string] = js.undefined
    ): MsSmoothOutputSettings = {
      val __obj = js.Dynamic.literal()
      H265PackagingType.foreach(__v => __obj.updateDynamic("H265PackagingType")(__v.asInstanceOf[js.Any]))
      NameModifier.foreach(__v => __obj.updateDynamic("NameModifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MsSmoothOutputSettings]
    }
  }

  /**
    * The multiplex object.
    */
  @js.native
  trait Multiplex extends js.Object {
    var Arn: js.UndefOr[__string]
    var AvailabilityZones: js.UndefOr[__listOf__string]
    var Destinations: js.UndefOr[__listOfMultiplexOutputDestination]
    var Id: js.UndefOr[__string]
    var MultiplexSettings: js.UndefOr[MultiplexSettings]
    var Name: js.UndefOr[__string]
    var PipelinesRunningCount: js.UndefOr[__integer]
    var ProgramCount: js.UndefOr[__integer]
    var State: js.UndefOr[MultiplexState]
    var Tags: js.UndefOr[Tags]
  }

  object Multiplex {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        AvailabilityZones: js.UndefOr[__listOf__string] = js.undefined,
        Destinations: js.UndefOr[__listOfMultiplexOutputDestination] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        MultiplexSettings: js.UndefOr[MultiplexSettings] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        PipelinesRunningCount: js.UndefOr[__integer] = js.undefined,
        ProgramCount: js.UndefOr[__integer] = js.undefined,
        State: js.UndefOr[MultiplexState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): Multiplex = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      MultiplexSettings.foreach(__v => __obj.updateDynamic("MultiplexSettings")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PipelinesRunningCount.foreach(__v => __obj.updateDynamic("PipelinesRunningCount")(__v.asInstanceOf[js.Any]))
      ProgramCount.foreach(__v => __obj.updateDynamic("ProgramCount")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Multiplex]
    }
  }

  /**
    * Multiplex Group Settings
    */
  @js.native
  trait MultiplexGroupSettings extends js.Object {}

  object MultiplexGroupSettings {
    @inline
    def apply(
    ): MultiplexGroupSettings = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[MultiplexGroupSettings]
    }
  }

  /**
    * Multiplex MediaConnect output destination settings.
    */
  @js.native
  trait MultiplexMediaConnectOutputDestinationSettings extends js.Object {
    var EntitlementArn: js.UndefOr[__stringMin1]
  }

  object MultiplexMediaConnectOutputDestinationSettings {
    @inline
    def apply(
        EntitlementArn: js.UndefOr[__stringMin1] = js.undefined
    ): MultiplexMediaConnectOutputDestinationSettings = {
      val __obj = js.Dynamic.literal()
      EntitlementArn.foreach(__v => __obj.updateDynamic("EntitlementArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MultiplexMediaConnectOutputDestinationSettings]
    }
  }

  /**
    * Multiplex output destination settings
    */
  @js.native
  trait MultiplexOutputDestination extends js.Object {
    var MediaConnectSettings: js.UndefOr[MultiplexMediaConnectOutputDestinationSettings]
  }

  object MultiplexOutputDestination {
    @inline
    def apply(
        MediaConnectSettings: js.UndefOr[MultiplexMediaConnectOutputDestinationSettings] = js.undefined
    ): MultiplexOutputDestination = {
      val __obj = js.Dynamic.literal()
      MediaConnectSettings.foreach(__v => __obj.updateDynamic("MediaConnectSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MultiplexOutputDestination]
    }
  }

  /**
    * Multiplex Output Settings
    */
  @js.native
  trait MultiplexOutputSettings extends js.Object {
    var Destination: OutputLocationRef
  }

  object MultiplexOutputSettings {
    @inline
    def apply(
        Destination: OutputLocationRef
    ): MultiplexOutputSettings = {
      val __obj = js.Dynamic.literal(
        "Destination" -> Destination.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MultiplexOutputSettings]
    }
  }

  /**
    * The multiplex program object.
    */
  @js.native
  trait MultiplexProgram extends js.Object {
    var ChannelId: js.UndefOr[__string]
    var MultiplexProgramSettings: js.UndefOr[MultiplexProgramSettings]
    var PacketIdentifiersMap: js.UndefOr[MultiplexProgramPacketIdentifiersMap]
    var ProgramName: js.UndefOr[__string]
  }

  object MultiplexProgram {
    @inline
    def apply(
        ChannelId: js.UndefOr[__string] = js.undefined,
        MultiplexProgramSettings: js.UndefOr[MultiplexProgramSettings] = js.undefined,
        PacketIdentifiersMap: js.UndefOr[MultiplexProgramPacketIdentifiersMap] = js.undefined,
        ProgramName: js.UndefOr[__string] = js.undefined
    ): MultiplexProgram = {
      val __obj = js.Dynamic.literal()
      ChannelId.foreach(__v => __obj.updateDynamic("ChannelId")(__v.asInstanceOf[js.Any]))
      MultiplexProgramSettings.foreach(__v => __obj.updateDynamic("MultiplexProgramSettings")(__v.asInstanceOf[js.Any]))
      PacketIdentifiersMap.foreach(__v => __obj.updateDynamic("PacketIdentifiersMap")(__v.asInstanceOf[js.Any]))
      ProgramName.foreach(__v => __obj.updateDynamic("ProgramName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MultiplexProgram]
    }
  }

  /**
    * Multiplex Program Input Destination Settings for outputting a Channel to a Multiplex
    */
  @js.native
  trait MultiplexProgramChannelDestinationSettings extends js.Object {
    var MultiplexId: js.UndefOr[__stringMin1]
    var ProgramName: js.UndefOr[__stringMin1]
  }

  object MultiplexProgramChannelDestinationSettings {
    @inline
    def apply(
        MultiplexId: js.UndefOr[__stringMin1] = js.undefined,
        ProgramName: js.UndefOr[__stringMin1] = js.undefined
    ): MultiplexProgramChannelDestinationSettings = {
      val __obj = js.Dynamic.literal()
      MultiplexId.foreach(__v => __obj.updateDynamic("MultiplexId")(__v.asInstanceOf[js.Any]))
      ProgramName.foreach(__v => __obj.updateDynamic("ProgramName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MultiplexProgramChannelDestinationSettings]
    }
  }

  /**
    * Packet identifiers map for a given Multiplex program.
    */
  @js.native
  trait MultiplexProgramPacketIdentifiersMap extends js.Object {
    var AudioPids: js.UndefOr[__listOf__integer]
    var DvbSubPids: js.UndefOr[__listOf__integer]
    var DvbTeletextPid: js.UndefOr[__integer]
    var EtvPlatformPid: js.UndefOr[__integer]
    var EtvSignalPid: js.UndefOr[__integer]
    var KlvDataPids: js.UndefOr[__listOf__integer]
    var PcrPid: js.UndefOr[__integer]
    var PmtPid: js.UndefOr[__integer]
    var PrivateMetadataPid: js.UndefOr[__integer]
    var Scte27Pids: js.UndefOr[__listOf__integer]
    var Scte35Pid: js.UndefOr[__integer]
    var TimedMetadataPid: js.UndefOr[__integer]
    var VideoPid: js.UndefOr[__integer]
  }

  object MultiplexProgramPacketIdentifiersMap {
    @inline
    def apply(
        AudioPids: js.UndefOr[__listOf__integer] = js.undefined,
        DvbSubPids: js.UndefOr[__listOf__integer] = js.undefined,
        DvbTeletextPid: js.UndefOr[__integer] = js.undefined,
        EtvPlatformPid: js.UndefOr[__integer] = js.undefined,
        EtvSignalPid: js.UndefOr[__integer] = js.undefined,
        KlvDataPids: js.UndefOr[__listOf__integer] = js.undefined,
        PcrPid: js.UndefOr[__integer] = js.undefined,
        PmtPid: js.UndefOr[__integer] = js.undefined,
        PrivateMetadataPid: js.UndefOr[__integer] = js.undefined,
        Scte27Pids: js.UndefOr[__listOf__integer] = js.undefined,
        Scte35Pid: js.UndefOr[__integer] = js.undefined,
        TimedMetadataPid: js.UndefOr[__integer] = js.undefined,
        VideoPid: js.UndefOr[__integer] = js.undefined
    ): MultiplexProgramPacketIdentifiersMap = {
      val __obj = js.Dynamic.literal()
      AudioPids.foreach(__v => __obj.updateDynamic("AudioPids")(__v.asInstanceOf[js.Any]))
      DvbSubPids.foreach(__v => __obj.updateDynamic("DvbSubPids")(__v.asInstanceOf[js.Any]))
      DvbTeletextPid.foreach(__v => __obj.updateDynamic("DvbTeletextPid")(__v.asInstanceOf[js.Any]))
      EtvPlatformPid.foreach(__v => __obj.updateDynamic("EtvPlatformPid")(__v.asInstanceOf[js.Any]))
      EtvSignalPid.foreach(__v => __obj.updateDynamic("EtvSignalPid")(__v.asInstanceOf[js.Any]))
      KlvDataPids.foreach(__v => __obj.updateDynamic("KlvDataPids")(__v.asInstanceOf[js.Any]))
      PcrPid.foreach(__v => __obj.updateDynamic("PcrPid")(__v.asInstanceOf[js.Any]))
      PmtPid.foreach(__v => __obj.updateDynamic("PmtPid")(__v.asInstanceOf[js.Any]))
      PrivateMetadataPid.foreach(__v => __obj.updateDynamic("PrivateMetadataPid")(__v.asInstanceOf[js.Any]))
      Scte27Pids.foreach(__v => __obj.updateDynamic("Scte27Pids")(__v.asInstanceOf[js.Any]))
      Scte35Pid.foreach(__v => __obj.updateDynamic("Scte35Pid")(__v.asInstanceOf[js.Any]))
      TimedMetadataPid.foreach(__v => __obj.updateDynamic("TimedMetadataPid")(__v.asInstanceOf[js.Any]))
      VideoPid.foreach(__v => __obj.updateDynamic("VideoPid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MultiplexProgramPacketIdentifiersMap]
    }
  }

  /**
    * Transport stream service descriptor configuration for the Multiplex program.
    */
  @js.native
  trait MultiplexProgramServiceDescriptor extends js.Object {
    var ProviderName: __stringMax256
    var ServiceName: __stringMax256
  }

  object MultiplexProgramServiceDescriptor {
    @inline
    def apply(
        ProviderName: __stringMax256,
        ServiceName: __stringMax256
    ): MultiplexProgramServiceDescriptor = {
      val __obj = js.Dynamic.literal(
        "ProviderName" -> ProviderName.asInstanceOf[js.Any],
        "ServiceName"  -> ServiceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MultiplexProgramServiceDescriptor]
    }
  }

  /**
    * Multiplex Program settings configuration.
    */
  @js.native
  trait MultiplexProgramSettings extends js.Object {
    var ProgramNumber: __integerMin0Max65535
    var PreferredChannelPipeline: js.UndefOr[PreferredChannelPipeline]
    var ServiceDescriptor: js.UndefOr[MultiplexProgramServiceDescriptor]
    var VideoSettings: js.UndefOr[MultiplexVideoSettings]
  }

  object MultiplexProgramSettings {
    @inline
    def apply(
        ProgramNumber: __integerMin0Max65535,
        PreferredChannelPipeline: js.UndefOr[PreferredChannelPipeline] = js.undefined,
        ServiceDescriptor: js.UndefOr[MultiplexProgramServiceDescriptor] = js.undefined,
        VideoSettings: js.UndefOr[MultiplexVideoSettings] = js.undefined
    ): MultiplexProgramSettings = {
      val __obj = js.Dynamic.literal(
        "ProgramNumber" -> ProgramNumber.asInstanceOf[js.Any]
      )

      PreferredChannelPipeline.foreach(__v => __obj.updateDynamic("PreferredChannelPipeline")(__v.asInstanceOf[js.Any]))
      ServiceDescriptor.foreach(__v => __obj.updateDynamic("ServiceDescriptor")(__v.asInstanceOf[js.Any]))
      VideoSettings.foreach(__v => __obj.updateDynamic("VideoSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MultiplexProgramSettings]
    }
  }

  /**
    * Placeholder documentation for MultiplexProgramSummary
    */
  @js.native
  trait MultiplexProgramSummary extends js.Object {
    var ChannelId: js.UndefOr[__string]
    var ProgramName: js.UndefOr[__string]
  }

  object MultiplexProgramSummary {
    @inline
    def apply(
        ChannelId: js.UndefOr[__string] = js.undefined,
        ProgramName: js.UndefOr[__string] = js.undefined
    ): MultiplexProgramSummary = {
      val __obj = js.Dynamic.literal()
      ChannelId.foreach(__v => __obj.updateDynamic("ChannelId")(__v.asInstanceOf[js.Any]))
      ProgramName.foreach(__v => __obj.updateDynamic("ProgramName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MultiplexProgramSummary]
    }
  }

  /**
    * Contains configuration for a Multiplex event
    */
  @js.native
  trait MultiplexSettings extends js.Object {
    var TransportStreamBitrate: __integerMin1000000Max100000000
    var TransportStreamId: __integerMin0Max65535
    var MaximumVideoBufferDelayMilliseconds: js.UndefOr[__integerMin1000Max3000]
    var TransportStreamReservedBitrate: js.UndefOr[__integerMin0Max100000000]
  }

  object MultiplexSettings {
    @inline
    def apply(
        TransportStreamBitrate: __integerMin1000000Max100000000,
        TransportStreamId: __integerMin0Max65535,
        MaximumVideoBufferDelayMilliseconds: js.UndefOr[__integerMin1000Max3000] = js.undefined,
        TransportStreamReservedBitrate: js.UndefOr[__integerMin0Max100000000] = js.undefined
    ): MultiplexSettings = {
      val __obj = js.Dynamic.literal(
        "TransportStreamBitrate" -> TransportStreamBitrate.asInstanceOf[js.Any],
        "TransportStreamId"      -> TransportStreamId.asInstanceOf[js.Any]
      )

      MaximumVideoBufferDelayMilliseconds.foreach(__v =>
        __obj.updateDynamic("MaximumVideoBufferDelayMilliseconds")(__v.asInstanceOf[js.Any])
      )
      TransportStreamReservedBitrate.foreach(__v =>
        __obj.updateDynamic("TransportStreamReservedBitrate")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[MultiplexSettings]
    }
  }

  /**
    * Contains summary configuration for a Multiplex event.
    */
  @js.native
  trait MultiplexSettingsSummary extends js.Object {
    var TransportStreamBitrate: js.UndefOr[__integerMin1000000Max100000000]
  }

  object MultiplexSettingsSummary {
    @inline
    def apply(
        TransportStreamBitrate: js.UndefOr[__integerMin1000000Max100000000] = js.undefined
    ): MultiplexSettingsSummary = {
      val __obj = js.Dynamic.literal()
      TransportStreamBitrate.foreach(__v => __obj.updateDynamic("TransportStreamBitrate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MultiplexSettingsSummary]
    }
  }

  /**
    * The current state of the multiplex.
    */
  @js.native
  sealed trait MultiplexState extends js.Any
  object MultiplexState extends js.Object {
    val CREATING      = "CREATING".asInstanceOf[MultiplexState]
    val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[MultiplexState]
    val IDLE          = "IDLE".asInstanceOf[MultiplexState]
    val STARTING      = "STARTING".asInstanceOf[MultiplexState]
    val RUNNING       = "RUNNING".asInstanceOf[MultiplexState]
    val RECOVERING    = "RECOVERING".asInstanceOf[MultiplexState]
    val STOPPING      = "STOPPING".asInstanceOf[MultiplexState]
    val DELETING      = "DELETING".asInstanceOf[MultiplexState]
    val DELETED       = "DELETED".asInstanceOf[MultiplexState]

    val values = js.Object.freeze(
      js.Array(CREATING, CREATE_FAILED, IDLE, STARTING, RUNNING, RECOVERING, STOPPING, DELETING, DELETED)
    )
  }

  /**
    * Statmux rate control settings
    */
  @js.native
  trait MultiplexStatmuxVideoSettings extends js.Object {
    var MaximumBitrate: js.UndefOr[__integerMin100000Max100000000]
    var MinimumBitrate: js.UndefOr[__integerMin100000Max100000000]
  }

  object MultiplexStatmuxVideoSettings {
    @inline
    def apply(
        MaximumBitrate: js.UndefOr[__integerMin100000Max100000000] = js.undefined,
        MinimumBitrate: js.UndefOr[__integerMin100000Max100000000] = js.undefined
    ): MultiplexStatmuxVideoSettings = {
      val __obj = js.Dynamic.literal()
      MaximumBitrate.foreach(__v => __obj.updateDynamic("MaximumBitrate")(__v.asInstanceOf[js.Any]))
      MinimumBitrate.foreach(__v => __obj.updateDynamic("MinimumBitrate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MultiplexStatmuxVideoSettings]
    }
  }

  /**
    * Placeholder documentation for MultiplexSummary
    */
  @js.native
  trait MultiplexSummary extends js.Object {
    var Arn: js.UndefOr[__string]
    var AvailabilityZones: js.UndefOr[__listOf__string]
    var Id: js.UndefOr[__string]
    var MultiplexSettings: js.UndefOr[MultiplexSettingsSummary]
    var Name: js.UndefOr[__string]
    var PipelinesRunningCount: js.UndefOr[__integer]
    var ProgramCount: js.UndefOr[__integer]
    var State: js.UndefOr[MultiplexState]
    var Tags: js.UndefOr[Tags]
  }

  object MultiplexSummary {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        AvailabilityZones: js.UndefOr[__listOf__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        MultiplexSettings: js.UndefOr[MultiplexSettingsSummary] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        PipelinesRunningCount: js.UndefOr[__integer] = js.undefined,
        ProgramCount: js.UndefOr[__integer] = js.undefined,
        State: js.UndefOr[MultiplexState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): MultiplexSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      MultiplexSettings.foreach(__v => __obj.updateDynamic("MultiplexSettings")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PipelinesRunningCount.foreach(__v => __obj.updateDynamic("PipelinesRunningCount")(__v.asInstanceOf[js.Any]))
      ProgramCount.foreach(__v => __obj.updateDynamic("ProgramCount")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MultiplexSummary]
    }
  }

  /**
    * The video configuration for each program in a multiplex.
    */
  @js.native
  trait MultiplexVideoSettings extends js.Object {
    var ConstantBitrate: js.UndefOr[__integerMin100000Max100000000]
    var StatmuxSettings: js.UndefOr[MultiplexStatmuxVideoSettings]
  }

  object MultiplexVideoSettings {
    @inline
    def apply(
        ConstantBitrate: js.UndefOr[__integerMin100000Max100000000] = js.undefined,
        StatmuxSettings: js.UndefOr[MultiplexStatmuxVideoSettings] = js.undefined
    ): MultiplexVideoSettings = {
      val __obj = js.Dynamic.literal()
      ConstantBitrate.foreach(__v => __obj.updateDynamic("ConstantBitrate")(__v.asInstanceOf[js.Any]))
      StatmuxSettings.foreach(__v => __obj.updateDynamic("StatmuxSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MultiplexVideoSettings]
    }
  }

  /**
    * Network Input Server Validation
    */
  @js.native
  sealed trait NetworkInputServerValidation extends js.Any
  object NetworkInputServerValidation extends js.Object {
    val CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME =
      "CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME".asInstanceOf[NetworkInputServerValidation]
    val CHECK_CRYPTOGRAPHY_ONLY = "CHECK_CRYPTOGRAPHY_ONLY".asInstanceOf[NetworkInputServerValidation]

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
    * Nielsen Configuration
    */
  @js.native
  trait NielsenConfiguration extends js.Object {
    var DistributorId: js.UndefOr[__string]
    var NielsenPcmToId3Tagging: js.UndefOr[NielsenPcmToId3TaggingState]
  }

  object NielsenConfiguration {
    @inline
    def apply(
        DistributorId: js.UndefOr[__string] = js.undefined,
        NielsenPcmToId3Tagging: js.UndefOr[NielsenPcmToId3TaggingState] = js.undefined
    ): NielsenConfiguration = {
      val __obj = js.Dynamic.literal()
      DistributorId.foreach(__v => __obj.updateDynamic("DistributorId")(__v.asInstanceOf[js.Any]))
      NielsenPcmToId3Tagging.foreach(__v => __obj.updateDynamic("NielsenPcmToId3Tagging")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NielsenConfiguration]
    }
  }

  /**
    * State of Nielsen PCM to ID3 tagging
    */
  @js.native
  sealed trait NielsenPcmToId3TaggingState extends js.Any
  object NielsenPcmToId3TaggingState extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[NielsenPcmToId3TaggingState]
    val ENABLED  = "ENABLED".asInstanceOf[NielsenPcmToId3TaggingState]

    val values = js.Object.freeze(js.Array(DISABLED, ENABLED))
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
  @js.native
  sealed trait OfferingDurationUnits extends js.Any
  object OfferingDurationUnits extends js.Object {
    val MONTHS = "MONTHS".asInstanceOf[OfferingDurationUnits]

    val values = js.Object.freeze(js.Array(MONTHS))
  }

  /**
    * Offering type, e.g. 'NO_UPFRONT'
    */
  @js.native
  sealed trait OfferingType extends js.Any
  object OfferingType extends js.Object {
    val NO_UPFRONT = "NO_UPFRONT".asInstanceOf[OfferingType]

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
    var MultiplexSettings: js.UndefOr[MultiplexProgramChannelDestinationSettings]
    var Settings: js.UndefOr[__listOfOutputDestinationSettings]
  }

  object OutputDestination {
    @inline
    def apply(
        Id: js.UndefOr[__string] = js.undefined,
        MediaPackageSettings: js.UndefOr[__listOfMediaPackageOutputDestinationSettings] = js.undefined,
        MultiplexSettings: js.UndefOr[MultiplexProgramChannelDestinationSettings] = js.undefined,
        Settings: js.UndefOr[__listOfOutputDestinationSettings] = js.undefined
    ): OutputDestination = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      MediaPackageSettings.foreach(__v => __obj.updateDynamic("MediaPackageSettings")(__v.asInstanceOf[js.Any]))
      MultiplexSettings.foreach(__v => __obj.updateDynamic("MultiplexSettings")(__v.asInstanceOf[js.Any]))
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
    var MultiplexGroupSettings: js.UndefOr[MultiplexGroupSettings]
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
        MultiplexGroupSettings: js.UndefOr[MultiplexGroupSettings] = js.undefined,
        RtmpGroupSettings: js.UndefOr[RtmpGroupSettings] = js.undefined,
        UdpGroupSettings: js.UndefOr[UdpGroupSettings] = js.undefined
    ): OutputGroupSettings = {
      val __obj = js.Dynamic.literal()
      ArchiveGroupSettings.foreach(__v => __obj.updateDynamic("ArchiveGroupSettings")(__v.asInstanceOf[js.Any]))
      FrameCaptureGroupSettings.foreach(__v =>
        __obj.updateDynamic("FrameCaptureGroupSettings")(__v.asInstanceOf[js.Any])
      )
      HlsGroupSettings.foreach(__v => __obj.updateDynamic("HlsGroupSettings")(__v.asInstanceOf[js.Any]))
      MediaPackageGroupSettings.foreach(__v =>
        __obj.updateDynamic("MediaPackageGroupSettings")(__v.asInstanceOf[js.Any])
      )
      MsSmoothGroupSettings.foreach(__v => __obj.updateDynamic("MsSmoothGroupSettings")(__v.asInstanceOf[js.Any]))
      MultiplexGroupSettings.foreach(__v => __obj.updateDynamic("MultiplexGroupSettings")(__v.asInstanceOf[js.Any]))
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
    var MultiplexOutputSettings: js.UndefOr[MultiplexOutputSettings]
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
        MultiplexOutputSettings: js.UndefOr[MultiplexOutputSettings] = js.undefined,
        RtmpOutputSettings: js.UndefOr[RtmpOutputSettings] = js.undefined,
        UdpOutputSettings: js.UndefOr[UdpOutputSettings] = js.undefined
    ): OutputSettings = {
      val __obj = js.Dynamic.literal()
      ArchiveOutputSettings.foreach(__v => __obj.updateDynamic("ArchiveOutputSettings")(__v.asInstanceOf[js.Any]))
      FrameCaptureOutputSettings.foreach(__v =>
        __obj.updateDynamic("FrameCaptureOutputSettings")(__v.asInstanceOf[js.Any])
      )
      HlsOutputSettings.foreach(__v => __obj.updateDynamic("HlsOutputSettings")(__v.asInstanceOf[js.Any]))
      MediaPackageOutputSettings.foreach(__v =>
        __obj.updateDynamic("MediaPackageOutputSettings")(__v.asInstanceOf[js.Any])
      )
      MsSmoothOutputSettings.foreach(__v => __obj.updateDynamic("MsSmoothOutputSettings")(__v.asInstanceOf[js.Any]))
      MultiplexOutputSettings.foreach(__v => __obj.updateDynamic("MultiplexOutputSettings")(__v.asInstanceOf[js.Any]))
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
      ActiveInputAttachmentName.foreach(__v =>
        __obj.updateDynamic("ActiveInputAttachmentName")(__v.asInstanceOf[js.Any])
      )
      ActiveInputSwitchActionName.foreach(__v =>
        __obj.updateDynamic("ActiveInputSwitchActionName")(__v.asInstanceOf[js.Any])
      )
      PipelineId.foreach(__v => __obj.updateDynamic("PipelineId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineDetail]
    }
  }

  /**
    * Pipeline ID
    */
  @js.native
  sealed trait PipelineId extends js.Any
  object PipelineId extends js.Object {
    val PIPELINE_0 = "PIPELINE_0".asInstanceOf[PipelineId]
    val PIPELINE_1 = "PIPELINE_1".asInstanceOf[PipelineId]

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
    * Indicates which pipeline is preferred by the multiplex for program ingest.
    * If set to \"PIPELINE_0\" or \"PIPELINE_1\" and an unhealthy ingest causes the multiplex to switch to the non-preferred pipeline,
    * it will switch back once that ingest is healthy again. If set to \"CURRENTLY_ACTIVE\",
    * it will not switch back to the other pipeline based on it recovering to a healthy state,
    * it will only switch if the active pipeline becomes unhealthy.
    */
  @js.native
  sealed trait PreferredChannelPipeline extends js.Any
  object PreferredChannelPipeline extends js.Object {
    val CURRENTLY_ACTIVE = "CURRENTLY_ACTIVE".asInstanceOf[PreferredChannelPipeline]
    val PIPELINE_0       = "PIPELINE_0".asInstanceOf[PreferredChannelPipeline]
    val PIPELINE_1       = "PIPELINE_1".asInstanceOf[PreferredChannelPipeline]

    val values = js.Object.freeze(js.Array(CURRENTLY_ACTIVE, PIPELINE_0, PIPELINE_1))
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
    * Rec601 Settings
    */
  @js.native
  trait Rec601Settings extends js.Object {}

  object Rec601Settings {
    @inline
    def apply(
    ): Rec601Settings = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[Rec601Settings]
    }
  }

  /**
    * Rec709 Settings
    */
  @js.native
  trait Rec709Settings extends js.Object {}

  object Rec709Settings {
    @inline
    def apply(
    ): Rec709Settings = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[Rec709Settings]
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
  @js.native
  sealed trait ReservationCodec extends js.Any
  object ReservationCodec extends js.Object {
    val MPEG2 = "MPEG2".asInstanceOf[ReservationCodec]
    val AVC   = "AVC".asInstanceOf[ReservationCodec]
    val HEVC  = "HEVC".asInstanceOf[ReservationCodec]
    val AUDIO = "AUDIO".asInstanceOf[ReservationCodec]

    val values = js.Object.freeze(js.Array(MPEG2, AVC, HEVC, AUDIO))
  }

  /**
    * Maximum bitrate in megabits per second
    */
  @js.native
  sealed trait ReservationMaximumBitrate extends js.Any
  object ReservationMaximumBitrate extends js.Object {
    val MAX_10_MBPS = "MAX_10_MBPS".asInstanceOf[ReservationMaximumBitrate]
    val MAX_20_MBPS = "MAX_20_MBPS".asInstanceOf[ReservationMaximumBitrate]
    val MAX_50_MBPS = "MAX_50_MBPS".asInstanceOf[ReservationMaximumBitrate]

    val values = js.Object.freeze(js.Array(MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS))
  }

  /**
    * Maximum framerate in frames per second (Outputs only)
    */
  @js.native
  sealed trait ReservationMaximumFramerate extends js.Any
  object ReservationMaximumFramerate extends js.Object {
    val MAX_30_FPS = "MAX_30_FPS".asInstanceOf[ReservationMaximumFramerate]
    val MAX_60_FPS = "MAX_60_FPS".asInstanceOf[ReservationMaximumFramerate]

    val values = js.Object.freeze(js.Array(MAX_30_FPS, MAX_60_FPS))
  }

  /**
    * Resolution based on lines of vertical resolution; SD is less than 720 lines, HD is 720 to 1080 lines, FHD is 1080 lines, UHD is greater than 1080 lines
    */
  @js.native
  sealed trait ReservationResolution extends js.Any
  object ReservationResolution extends js.Object {
    val SD  = "SD".asInstanceOf[ReservationResolution]
    val HD  = "HD".asInstanceOf[ReservationResolution]
    val FHD = "FHD".asInstanceOf[ReservationResolution]
    val UHD = "UHD".asInstanceOf[ReservationResolution]

    val values = js.Object.freeze(js.Array(SD, HD, FHD, UHD))
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
    * Resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
    */
  @js.native
  sealed trait ReservationResourceType extends js.Any
  object ReservationResourceType extends js.Object {
    val INPUT     = "INPUT".asInstanceOf[ReservationResourceType]
    val OUTPUT    = "OUTPUT".asInstanceOf[ReservationResourceType]
    val MULTIPLEX = "MULTIPLEX".asInstanceOf[ReservationResourceType]
    val CHANNEL   = "CHANNEL".asInstanceOf[ReservationResourceType]

    val values = js.Object.freeze(js.Array(INPUT, OUTPUT, MULTIPLEX, CHANNEL))
  }

  /**
    * Special features, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
    */
  @js.native
  sealed trait ReservationSpecialFeature extends js.Any
  object ReservationSpecialFeature extends js.Object {
    val ADVANCED_AUDIO      = "ADVANCED_AUDIO".asInstanceOf[ReservationSpecialFeature]
    val AUDIO_NORMALIZATION = "AUDIO_NORMALIZATION".asInstanceOf[ReservationSpecialFeature]

    val values = js.Object.freeze(js.Array(ADVANCED_AUDIO, AUDIO_NORMALIZATION))
  }

  /**
    * Current reservation state
    */
  @js.native
  sealed trait ReservationState extends js.Any
  object ReservationState extends js.Object {
    val ACTIVE   = "ACTIVE".asInstanceOf[ReservationState]
    val EXPIRED  = "EXPIRED".asInstanceOf[ReservationState]
    val CANCELED = "CANCELED".asInstanceOf[ReservationState]
    val DELETED  = "DELETED".asInstanceOf[ReservationState]

    val values = js.Object.freeze(js.Array(ACTIVE, EXPIRED, CANCELED, DELETED))
  }

  /**
    * Video quality, e.g. 'STANDARD' (Outputs only)
    */
  @js.native
  sealed trait ReservationVideoQuality extends js.Any
  object ReservationVideoQuality extends js.Object {
    val STANDARD = "STANDARD".asInstanceOf[ReservationVideoQuality]
    val ENHANCED = "ENHANCED".asInstanceOf[ReservationVideoQuality]
    val PREMIUM  = "PREMIUM".asInstanceOf[ReservationVideoQuality]

    val values = js.Object.freeze(js.Array(STANDARD, ENHANCED, PREMIUM))
  }

  /**
    * Rtmp Cache Full Behavior
    */
  @js.native
  sealed trait RtmpCacheFullBehavior extends js.Any
  object RtmpCacheFullBehavior extends js.Object {
    val DISCONNECT_IMMEDIATELY = "DISCONNECT_IMMEDIATELY".asInstanceOf[RtmpCacheFullBehavior]
    val WAIT_FOR_SERVER        = "WAIT_FOR_SERVER".asInstanceOf[RtmpCacheFullBehavior]

    val values = js.Object.freeze(js.Array(DISCONNECT_IMMEDIATELY, WAIT_FOR_SERVER))
  }

  /**
    * Rtmp Caption Data
    */
  @js.native
  sealed trait RtmpCaptionData extends js.Any
  object RtmpCaptionData extends js.Object {
    val ALL                   = "ALL".asInstanceOf[RtmpCaptionData]
    val FIELD1_608            = "FIELD1_608".asInstanceOf[RtmpCaptionData]
    val FIELD1_AND_FIELD2_608 = "FIELD1_AND_FIELD2_608".asInstanceOf[RtmpCaptionData]

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
  @js.native
  sealed trait RtmpOutputCertificateMode extends js.Any
  object RtmpOutputCertificateMode extends js.Object {
    val SELF_SIGNED         = "SELF_SIGNED".asInstanceOf[RtmpOutputCertificateMode]
    val VERIFY_AUTHENTICITY = "VERIFY_AUTHENTICITY".asInstanceOf[RtmpOutputCertificateMode]

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
    var HlsId3SegmentTaggingSettings: js.UndefOr[HlsId3SegmentTaggingScheduleActionSettings]
    var HlsTimedMetadataSettings: js.UndefOr[HlsTimedMetadataScheduleActionSettings]
    var InputPrepareSettings: js.UndefOr[InputPrepareScheduleActionSettings]
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
        HlsId3SegmentTaggingSettings: js.UndefOr[HlsId3SegmentTaggingScheduleActionSettings] = js.undefined,
        HlsTimedMetadataSettings: js.UndefOr[HlsTimedMetadataScheduleActionSettings] = js.undefined,
        InputPrepareSettings: js.UndefOr[InputPrepareScheduleActionSettings] = js.undefined,
        InputSwitchSettings: js.UndefOr[InputSwitchScheduleActionSettings] = js.undefined,
        PauseStateSettings: js.UndefOr[PauseStateScheduleActionSettings] = js.undefined,
        Scte35ReturnToNetworkSettings: js.UndefOr[Scte35ReturnToNetworkScheduleActionSettings] = js.undefined,
        Scte35SpliceInsertSettings: js.UndefOr[Scte35SpliceInsertScheduleActionSettings] = js.undefined,
        Scte35TimeSignalSettings: js.UndefOr[Scte35TimeSignalScheduleActionSettings] = js.undefined,
        StaticImageActivateSettings: js.UndefOr[StaticImageActivateScheduleActionSettings] = js.undefined,
        StaticImageDeactivateSettings: js.UndefOr[StaticImageDeactivateScheduleActionSettings] = js.undefined
    ): ScheduleActionSettings = {
      val __obj = js.Dynamic.literal()
      HlsId3SegmentTaggingSettings.foreach(__v =>
        __obj.updateDynamic("HlsId3SegmentTaggingSettings")(__v.asInstanceOf[js.Any])
      )
      HlsTimedMetadataSettings.foreach(__v => __obj.updateDynamic("HlsTimedMetadataSettings")(__v.asInstanceOf[js.Any]))
      InputPrepareSettings.foreach(__v => __obj.updateDynamic("InputPrepareSettings")(__v.asInstanceOf[js.Any]))
      InputSwitchSettings.foreach(__v => __obj.updateDynamic("InputSwitchSettings")(__v.asInstanceOf[js.Any]))
      PauseStateSettings.foreach(__v => __obj.updateDynamic("PauseStateSettings")(__v.asInstanceOf[js.Any]))
      Scte35ReturnToNetworkSettings.foreach(__v =>
        __obj.updateDynamic("Scte35ReturnToNetworkSettings")(__v.asInstanceOf[js.Any])
      )
      Scte35SpliceInsertSettings.foreach(__v =>
        __obj.updateDynamic("Scte35SpliceInsertSettings")(__v.asInstanceOf[js.Any])
      )
      Scte35TimeSignalSettings.foreach(__v => __obj.updateDynamic("Scte35TimeSignalSettings")(__v.asInstanceOf[js.Any]))
      StaticImageActivateSettings.foreach(__v =>
        __obj.updateDynamic("StaticImageActivateSettings")(__v.asInstanceOf[js.Any])
      )
      StaticImageDeactivateSettings.foreach(__v =>
        __obj.updateDynamic("StaticImageDeactivateSettings")(__v.asInstanceOf[js.Any])
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
      FixedModeScheduleActionStartSettings.foreach(__v =>
        __obj.updateDynamic("FixedModeScheduleActionStartSettings")(__v.asInstanceOf[js.Any])
      )
      FollowModeScheduleActionStartSettings.foreach(__v =>
        __obj.updateDynamic("FollowModeScheduleActionStartSettings")(__v.asInstanceOf[js.Any])
      )
      ImmediateModeScheduleActionStartSettings.foreach(__v =>
        __obj.updateDynamic("ImmediateModeScheduleActionStartSettings")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ScheduleActionStartSettings]
    }
  }

  /**
    * Scte20 Convert608 To708
    */
  @js.native
  sealed trait Scte20Convert608To708 extends js.Any
  object Scte20Convert608To708 extends js.Object {
    val DISABLED  = "DISABLED".asInstanceOf[Scte20Convert608To708]
    val UPCONVERT = "UPCONVERT".asInstanceOf[Scte20Convert608To708]

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
  @js.native
  sealed trait Scte35AposNoRegionalBlackoutBehavior extends js.Any
  object Scte35AposNoRegionalBlackoutBehavior extends js.Object {
    val FOLLOW = "FOLLOW".asInstanceOf[Scte35AposNoRegionalBlackoutBehavior]
    val IGNORE = "IGNORE".asInstanceOf[Scte35AposNoRegionalBlackoutBehavior]

    val values = js.Object.freeze(js.Array(FOLLOW, IGNORE))
  }

  /**
    * Scte35 Apos Web Delivery Allowed Behavior
    */
  @js.native
  sealed trait Scte35AposWebDeliveryAllowedBehavior extends js.Any
  object Scte35AposWebDeliveryAllowedBehavior extends js.Object {
    val FOLLOW = "FOLLOW".asInstanceOf[Scte35AposWebDeliveryAllowedBehavior]
    val IGNORE = "IGNORE".asInstanceOf[Scte35AposWebDeliveryAllowedBehavior]

    val values = js.Object.freeze(js.Array(FOLLOW, IGNORE))
  }

  /**
    * Corresponds to the archive_allowed parameter. A value of ARCHIVE_NOT_ALLOWED corresponds to 0 (false) in the SCTE-35 specification. If you include one of the "restriction" flags then you must include all four of them.
    */
  @js.native
  sealed trait Scte35ArchiveAllowedFlag extends js.Any
  object Scte35ArchiveAllowedFlag extends js.Object {
    val ARCHIVE_NOT_ALLOWED = "ARCHIVE_NOT_ALLOWED".asInstanceOf[Scte35ArchiveAllowedFlag]
    val ARCHIVE_ALLOWED     = "ARCHIVE_ALLOWED".asInstanceOf[Scte35ArchiveAllowedFlag]

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
  @js.native
  sealed trait Scte35DeviceRestrictions extends js.Any
  object Scte35DeviceRestrictions extends js.Object {
    val NONE            = "NONE".asInstanceOf[Scte35DeviceRestrictions]
    val RESTRICT_GROUP0 = "RESTRICT_GROUP0".asInstanceOf[Scte35DeviceRestrictions]
    val RESTRICT_GROUP1 = "RESTRICT_GROUP1".asInstanceOf[Scte35DeviceRestrictions]
    val RESTRICT_GROUP2 = "RESTRICT_GROUP2".asInstanceOf[Scte35DeviceRestrictions]

    val values = js.Object.freeze(js.Array(NONE, RESTRICT_GROUP0, RESTRICT_GROUP1, RESTRICT_GROUP2))
  }

  /**
    * Corresponds to the no_regional_blackout_flag parameter. A value of REGIONAL_BLACKOUT corresponds to 0 (false) in the SCTE-35 specification. If you include one of the "restriction" flags then you must include all four of them.
    */
  @js.native
  sealed trait Scte35NoRegionalBlackoutFlag extends js.Any
  object Scte35NoRegionalBlackoutFlag extends js.Object {
    val REGIONAL_BLACKOUT    = "REGIONAL_BLACKOUT".asInstanceOf[Scte35NoRegionalBlackoutFlag]
    val NO_REGIONAL_BLACKOUT = "NO_REGIONAL_BLACKOUT".asInstanceOf[Scte35NoRegionalBlackoutFlag]

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
  @js.native
  sealed trait Scte35SegmentationCancelIndicator extends js.Any
  object Scte35SegmentationCancelIndicator extends js.Object {
    val SEGMENTATION_EVENT_NOT_CANCELED =
      "SEGMENTATION_EVENT_NOT_CANCELED".asInstanceOf[Scte35SegmentationCancelIndicator]
    val SEGMENTATION_EVENT_CANCELED = "SEGMENTATION_EVENT_CANCELED".asInstanceOf[Scte35SegmentationCancelIndicator]

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
  @js.native
  sealed trait Scte35SpliceInsertNoRegionalBlackoutBehavior extends js.Any
  object Scte35SpliceInsertNoRegionalBlackoutBehavior extends js.Object {
    val FOLLOW = "FOLLOW".asInstanceOf[Scte35SpliceInsertNoRegionalBlackoutBehavior]
    val IGNORE = "IGNORE".asInstanceOf[Scte35SpliceInsertNoRegionalBlackoutBehavior]

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
  @js.native
  sealed trait Scte35SpliceInsertWebDeliveryAllowedBehavior extends js.Any
  object Scte35SpliceInsertWebDeliveryAllowedBehavior extends js.Object {
    val FOLLOW = "FOLLOW".asInstanceOf[Scte35SpliceInsertWebDeliveryAllowedBehavior]
    val IGNORE = "IGNORE".asInstanceOf[Scte35SpliceInsertWebDeliveryAllowedBehavior]

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
  @js.native
  sealed trait Scte35WebDeliveryAllowedFlag extends js.Any
  object Scte35WebDeliveryAllowedFlag extends js.Object {
    val WEB_DELIVERY_NOT_ALLOWED = "WEB_DELIVERY_NOT_ALLOWED".asInstanceOf[Scte35WebDeliveryAllowedFlag]
    val WEB_DELIVERY_ALLOWED     = "WEB_DELIVERY_ALLOWED".asInstanceOf[Scte35WebDeliveryAllowedFlag]

    val values = js.Object.freeze(js.Array(WEB_DELIVERY_NOT_ALLOWED, WEB_DELIVERY_ALLOWED))
  }

  /**
    * Smooth Group Audio Only Timecode Control
    */
  @js.native
  sealed trait SmoothGroupAudioOnlyTimecodeControl extends js.Any
  object SmoothGroupAudioOnlyTimecodeControl extends js.Object {
    val PASSTHROUGH          = "PASSTHROUGH".asInstanceOf[SmoothGroupAudioOnlyTimecodeControl]
    val USE_CONFIGURED_CLOCK = "USE_CONFIGURED_CLOCK".asInstanceOf[SmoothGroupAudioOnlyTimecodeControl]

    val values = js.Object.freeze(js.Array(PASSTHROUGH, USE_CONFIGURED_CLOCK))
  }

  /**
    * Smooth Group Certificate Mode
    */
  @js.native
  sealed trait SmoothGroupCertificateMode extends js.Any
  object SmoothGroupCertificateMode extends js.Object {
    val SELF_SIGNED         = "SELF_SIGNED".asInstanceOf[SmoothGroupCertificateMode]
    val VERIFY_AUTHENTICITY = "VERIFY_AUTHENTICITY".asInstanceOf[SmoothGroupCertificateMode]

    val values = js.Object.freeze(js.Array(SELF_SIGNED, VERIFY_AUTHENTICITY))
  }

  /**
    * Smooth Group Event Id Mode
    */
  @js.native
  sealed trait SmoothGroupEventIdMode extends js.Any
  object SmoothGroupEventIdMode extends js.Object {
    val NO_EVENT_ID    = "NO_EVENT_ID".asInstanceOf[SmoothGroupEventIdMode]
    val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[SmoothGroupEventIdMode]
    val USE_TIMESTAMP  = "USE_TIMESTAMP".asInstanceOf[SmoothGroupEventIdMode]

    val values = js.Object.freeze(js.Array(NO_EVENT_ID, USE_CONFIGURED, USE_TIMESTAMP))
  }

  /**
    * Smooth Group Event Stop Behavior
    */
  @js.native
  sealed trait SmoothGroupEventStopBehavior extends js.Any
  object SmoothGroupEventStopBehavior extends js.Object {
    val NONE     = "NONE".asInstanceOf[SmoothGroupEventStopBehavior]
    val SEND_EOS = "SEND_EOS".asInstanceOf[SmoothGroupEventStopBehavior]

    val values = js.Object.freeze(js.Array(NONE, SEND_EOS))
  }

  /**
    * Smooth Group Segmentation Mode
    */
  @js.native
  sealed trait SmoothGroupSegmentationMode extends js.Any
  object SmoothGroupSegmentationMode extends js.Object {
    val USE_INPUT_SEGMENTATION = "USE_INPUT_SEGMENTATION".asInstanceOf[SmoothGroupSegmentationMode]
    val USE_SEGMENT_DURATION   = "USE_SEGMENT_DURATION".asInstanceOf[SmoothGroupSegmentationMode]

    val values = js.Object.freeze(js.Array(USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION))
  }

  /**
    * Smooth Group Sparse Track Type
    */
  @js.native
  sealed trait SmoothGroupSparseTrackType extends js.Any
  object SmoothGroupSparseTrackType extends js.Object {
    val NONE                         = "NONE".asInstanceOf[SmoothGroupSparseTrackType]
    val SCTE_35                      = "SCTE_35".asInstanceOf[SmoothGroupSparseTrackType]
    val SCTE_35_WITHOUT_SEGMENTATION = "SCTE_35_WITHOUT_SEGMENTATION".asInstanceOf[SmoothGroupSparseTrackType]

    val values = js.Object.freeze(js.Array(NONE, SCTE_35, SCTE_35_WITHOUT_SEGMENTATION))
  }

  /**
    * Smooth Group Stream Manifest Behavior
    */
  @js.native
  sealed trait SmoothGroupStreamManifestBehavior extends js.Any
  object SmoothGroupStreamManifestBehavior extends js.Object {
    val DO_NOT_SEND = "DO_NOT_SEND".asInstanceOf[SmoothGroupStreamManifestBehavior]
    val SEND        = "SEND".asInstanceOf[SmoothGroupStreamManifestBehavior]

    val values = js.Object.freeze(js.Array(DO_NOT_SEND, SEND))
  }

  /**
    * Smooth Group Timestamp Offset Mode
    */
  @js.native
  sealed trait SmoothGroupTimestampOffsetMode extends js.Any
  object SmoothGroupTimestampOffsetMode extends js.Object {
    val USE_CONFIGURED_OFFSET = "USE_CONFIGURED_OFFSET".asInstanceOf[SmoothGroupTimestampOffsetMode]
    val USE_EVENT_START_DATE  = "USE_EVENT_START_DATE".asInstanceOf[SmoothGroupTimestampOffsetMode]

    val values = js.Object.freeze(js.Array(USE_CONFIGURED_OFFSET, USE_EVENT_START_DATE))
  }

  /**
    * Smpte2038 Data Preference
    */
  @js.native
  sealed trait Smpte2038DataPreference extends js.Any
  object Smpte2038DataPreference extends js.Object {
    val IGNORE = "IGNORE".asInstanceOf[Smpte2038DataPreference]
    val PREFER = "PREFER".asInstanceOf[Smpte2038DataPreference]

    val values = js.Object.freeze(js.Array(IGNORE, PREFER))
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
    * Placeholder documentation for StartMultiplexRequest
    */
  @js.native
  trait StartMultiplexRequest extends js.Object {
    var MultiplexId: __string
  }

  object StartMultiplexRequest {
    @inline
    def apply(
        MultiplexId: __string
    ): StartMultiplexRequest = {
      val __obj = js.Dynamic.literal(
        "MultiplexId" -> MultiplexId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartMultiplexRequest]
    }
  }

  /**
    * Placeholder documentation for StartMultiplexResponse
    */
  @js.native
  trait StartMultiplexResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var AvailabilityZones: js.UndefOr[__listOf__string]
    var Destinations: js.UndefOr[__listOfMultiplexOutputDestination]
    var Id: js.UndefOr[__string]
    var MultiplexSettings: js.UndefOr[MultiplexSettings]
    var Name: js.UndefOr[__string]
    var PipelinesRunningCount: js.UndefOr[__integer]
    var ProgramCount: js.UndefOr[__integer]
    var State: js.UndefOr[MultiplexState]
    var Tags: js.UndefOr[Tags]
  }

  object StartMultiplexResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        AvailabilityZones: js.UndefOr[__listOf__string] = js.undefined,
        Destinations: js.UndefOr[__listOfMultiplexOutputDestination] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        MultiplexSettings: js.UndefOr[MultiplexSettings] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        PipelinesRunningCount: js.UndefOr[__integer] = js.undefined,
        ProgramCount: js.UndefOr[__integer] = js.undefined,
        State: js.UndefOr[MultiplexState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): StartMultiplexResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      MultiplexSettings.foreach(__v => __obj.updateDynamic("MultiplexSettings")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PipelinesRunningCount.foreach(__v => __obj.updateDynamic("PipelinesRunningCount")(__v.asInstanceOf[js.Any]))
      ProgramCount.foreach(__v => __obj.updateDynamic("ProgramCount")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartMultiplexResponse]
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
    * Placeholder documentation for StopMultiplexRequest
    */
  @js.native
  trait StopMultiplexRequest extends js.Object {
    var MultiplexId: __string
  }

  object StopMultiplexRequest {
    @inline
    def apply(
        MultiplexId: __string
    ): StopMultiplexRequest = {
      val __obj = js.Dynamic.literal(
        "MultiplexId" -> MultiplexId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopMultiplexRequest]
    }
  }

  /**
    * Placeholder documentation for StopMultiplexResponse
    */
  @js.native
  trait StopMultiplexResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var AvailabilityZones: js.UndefOr[__listOf__string]
    var Destinations: js.UndefOr[__listOfMultiplexOutputDestination]
    var Id: js.UndefOr[__string]
    var MultiplexSettings: js.UndefOr[MultiplexSettings]
    var Name: js.UndefOr[__string]
    var PipelinesRunningCount: js.UndefOr[__integer]
    var ProgramCount: js.UndefOr[__integer]
    var State: js.UndefOr[MultiplexState]
    var Tags: js.UndefOr[Tags]
  }

  object StopMultiplexResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        AvailabilityZones: js.UndefOr[__listOf__string] = js.undefined,
        Destinations: js.UndefOr[__listOfMultiplexOutputDestination] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        MultiplexSettings: js.UndefOr[MultiplexSettings] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        PipelinesRunningCount: js.UndefOr[__integer] = js.undefined,
        ProgramCount: js.UndefOr[__integer] = js.undefined,
        State: js.UndefOr[MultiplexState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): StopMultiplexResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      MultiplexSettings.foreach(__v => __obj.updateDynamic("MultiplexSettings")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PipelinesRunningCount.foreach(__v => __obj.updateDynamic("PipelinesRunningCount")(__v.asInstanceOf[js.Any]))
      ProgramCount.foreach(__v => __obj.updateDynamic("ProgramCount")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopMultiplexResponse]
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
      LastFrameClippingBehavior.foreach(__v =>
        __obj.updateDynamic("LastFrameClippingBehavior")(__v.asInstanceOf[js.Any])
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
    * Temporal Filter Post Filter Sharpening
    */
  @js.native
  sealed trait TemporalFilterPostFilterSharpening extends js.Any
  object TemporalFilterPostFilterSharpening extends js.Object {
    val AUTO     = "AUTO".asInstanceOf[TemporalFilterPostFilterSharpening]
    val DISABLED = "DISABLED".asInstanceOf[TemporalFilterPostFilterSharpening]
    val ENABLED  = "ENABLED".asInstanceOf[TemporalFilterPostFilterSharpening]

    val values = js.Object.freeze(js.Array(AUTO, DISABLED, ENABLED))
  }

  /**
    * Temporal Filter Settings
    */
  @js.native
  trait TemporalFilterSettings extends js.Object {
    var PostFilterSharpening: js.UndefOr[TemporalFilterPostFilterSharpening]
    var Strength: js.UndefOr[TemporalFilterStrength]
  }

  object TemporalFilterSettings {
    @inline
    def apply(
        PostFilterSharpening: js.UndefOr[TemporalFilterPostFilterSharpening] = js.undefined,
        Strength: js.UndefOr[TemporalFilterStrength] = js.undefined
    ): TemporalFilterSettings = {
      val __obj = js.Dynamic.literal()
      PostFilterSharpening.foreach(__v => __obj.updateDynamic("PostFilterSharpening")(__v.asInstanceOf[js.Any]))
      Strength.foreach(__v => __obj.updateDynamic("Strength")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemporalFilterSettings]
    }
  }

  /**
    * Temporal Filter Strength
    */
  @js.native
  sealed trait TemporalFilterStrength extends js.Any
  object TemporalFilterStrength extends js.Object {
    val AUTO        = "AUTO".asInstanceOf[TemporalFilterStrength]
    val STRENGTH_1  = "STRENGTH_1".asInstanceOf[TemporalFilterStrength]
    val STRENGTH_2  = "STRENGTH_2".asInstanceOf[TemporalFilterStrength]
    val STRENGTH_3  = "STRENGTH_3".asInstanceOf[TemporalFilterStrength]
    val STRENGTH_4  = "STRENGTH_4".asInstanceOf[TemporalFilterStrength]
    val STRENGTH_5  = "STRENGTH_5".asInstanceOf[TemporalFilterStrength]
    val STRENGTH_6  = "STRENGTH_6".asInstanceOf[TemporalFilterStrength]
    val STRENGTH_7  = "STRENGTH_7".asInstanceOf[TemporalFilterStrength]
    val STRENGTH_8  = "STRENGTH_8".asInstanceOf[TemporalFilterStrength]
    val STRENGTH_9  = "STRENGTH_9".asInstanceOf[TemporalFilterStrength]
    val STRENGTH_10 = "STRENGTH_10".asInstanceOf[TemporalFilterStrength]
    val STRENGTH_11 = "STRENGTH_11".asInstanceOf[TemporalFilterStrength]
    val STRENGTH_12 = "STRENGTH_12".asInstanceOf[TemporalFilterStrength]
    val STRENGTH_13 = "STRENGTH_13".asInstanceOf[TemporalFilterStrength]
    val STRENGTH_14 = "STRENGTH_14".asInstanceOf[TemporalFilterStrength]
    val STRENGTH_15 = "STRENGTH_15".asInstanceOf[TemporalFilterStrength]
    val STRENGTH_16 = "STRENGTH_16".asInstanceOf[TemporalFilterStrength]

    val values = js.Object.freeze(
      js.Array(
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
    )
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
  @js.native
  sealed trait TimecodeConfigSource extends js.Any
  object TimecodeConfigSource extends js.Object {
    val EMBEDDED    = "EMBEDDED".asInstanceOf[TimecodeConfigSource]
    val SYSTEMCLOCK = "SYSTEMCLOCK".asInstanceOf[TimecodeConfigSource]
    val ZEROBASED   = "ZEROBASED".asInstanceOf[TimecodeConfigSource]

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
  @js.native
  sealed trait TtmlDestinationStyleControl extends js.Any
  object TtmlDestinationStyleControl extends js.Object {
    val PASSTHROUGH    = "PASSTHROUGH".asInstanceOf[TtmlDestinationStyleControl]
    val USE_CONFIGURED = "USE_CONFIGURED".asInstanceOf[TtmlDestinationStyleControl]

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
  @js.native
  sealed trait UdpTimedMetadataId3Frame extends js.Any
  object UdpTimedMetadataId3Frame extends js.Object {
    val NONE = "NONE".asInstanceOf[UdpTimedMetadataId3Frame]
    val PRIV = "PRIV".asInstanceOf[UdpTimedMetadataId3Frame]
    val TDRL = "TDRL".asInstanceOf[UdpTimedMetadataId3Frame]

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
    * A request to update an input device.
    */
  @js.native
  trait UpdateInputDeviceRequest extends js.Object {
    var InputDeviceId: __string
    var HdDeviceSettings: js.UndefOr[InputDeviceConfigurableSettings]
    var Name: js.UndefOr[__string]
  }

  object UpdateInputDeviceRequest {
    @inline
    def apply(
        InputDeviceId: __string,
        HdDeviceSettings: js.UndefOr[InputDeviceConfigurableSettings] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined
    ): UpdateInputDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "InputDeviceId" -> InputDeviceId.asInstanceOf[js.Any]
      )

      HdDeviceSettings.foreach(__v => __obj.updateDynamic("HdDeviceSettings")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateInputDeviceRequest]
    }
  }

  /**
    * Placeholder documentation for UpdateInputDeviceResponse
    */
  @js.native
  trait UpdateInputDeviceResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var ConnectionState: js.UndefOr[InputDeviceConnectionState]
    var DeviceSettingsSyncState: js.UndefOr[DeviceSettingsSyncState]
    var HdDeviceSettings: js.UndefOr[InputDeviceHdSettings]
    var Id: js.UndefOr[__string]
    var MacAddress: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var NetworkSettings: js.UndefOr[InputDeviceNetworkSettings]
    var SerialNumber: js.UndefOr[__string]
    var Type: js.UndefOr[InputDeviceType]
  }

  object UpdateInputDeviceResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        ConnectionState: js.UndefOr[InputDeviceConnectionState] = js.undefined,
        DeviceSettingsSyncState: js.UndefOr[DeviceSettingsSyncState] = js.undefined,
        HdDeviceSettings: js.UndefOr[InputDeviceHdSettings] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        MacAddress: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        NetworkSettings: js.UndefOr[InputDeviceNetworkSettings] = js.undefined,
        SerialNumber: js.UndefOr[__string] = js.undefined,
        Type: js.UndefOr[InputDeviceType] = js.undefined
    ): UpdateInputDeviceResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ConnectionState.foreach(__v => __obj.updateDynamic("ConnectionState")(__v.asInstanceOf[js.Any]))
      DeviceSettingsSyncState.foreach(__v => __obj.updateDynamic("DeviceSettingsSyncState")(__v.asInstanceOf[js.Any]))
      HdDeviceSettings.foreach(__v => __obj.updateDynamic("HdDeviceSettings")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      MacAddress.foreach(__v => __obj.updateDynamic("MacAddress")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NetworkSettings.foreach(__v => __obj.updateDynamic("NetworkSettings")(__v.asInstanceOf[js.Any]))
      SerialNumber.foreach(__v => __obj.updateDynamic("SerialNumber")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateInputDeviceResponse]
    }
  }

  /**
    * A request to update an input.
    */
  @js.native
  trait UpdateInputRequest extends js.Object {
    var InputId: __string
    var Destinations: js.UndefOr[__listOfInputDestinationRequest]
    var InputDevices: js.UndefOr[__listOfInputDeviceRequest]
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
        InputDevices: js.UndefOr[__listOfInputDeviceRequest] = js.undefined,
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
      InputDevices.foreach(__v => __obj.updateDynamic("InputDevices")(__v.asInstanceOf[js.Any]))
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
    * A request to update a program in a multiplex.
    */
  @js.native
  trait UpdateMultiplexProgramRequest extends js.Object {
    var MultiplexId: __string
    var ProgramName: __string
    var MultiplexProgramSettings: js.UndefOr[MultiplexProgramSettings]
  }

  object UpdateMultiplexProgramRequest {
    @inline
    def apply(
        MultiplexId: __string,
        ProgramName: __string,
        MultiplexProgramSettings: js.UndefOr[MultiplexProgramSettings] = js.undefined
    ): UpdateMultiplexProgramRequest = {
      val __obj = js.Dynamic.literal(
        "MultiplexId" -> MultiplexId.asInstanceOf[js.Any],
        "ProgramName" -> ProgramName.asInstanceOf[js.Any]
      )

      MultiplexProgramSettings.foreach(__v => __obj.updateDynamic("MultiplexProgramSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMultiplexProgramRequest]
    }
  }

  /**
    * Placeholder documentation for UpdateMultiplexProgramResponse
    */
  @js.native
  trait UpdateMultiplexProgramResponse extends js.Object {
    var MultiplexProgram: js.UndefOr[MultiplexProgram]
  }

  object UpdateMultiplexProgramResponse {
    @inline
    def apply(
        MultiplexProgram: js.UndefOr[MultiplexProgram] = js.undefined
    ): UpdateMultiplexProgramResponse = {
      val __obj = js.Dynamic.literal()
      MultiplexProgram.foreach(__v => __obj.updateDynamic("MultiplexProgram")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMultiplexProgramResponse]
    }
  }

  /**
    * A request to update a multiplex.
    */
  @js.native
  trait UpdateMultiplexRequest extends js.Object {
    var MultiplexId: __string
    var MultiplexSettings: js.UndefOr[MultiplexSettings]
    var Name: js.UndefOr[__string]
  }

  object UpdateMultiplexRequest {
    @inline
    def apply(
        MultiplexId: __string,
        MultiplexSettings: js.UndefOr[MultiplexSettings] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined
    ): UpdateMultiplexRequest = {
      val __obj = js.Dynamic.literal(
        "MultiplexId" -> MultiplexId.asInstanceOf[js.Any]
      )

      MultiplexSettings.foreach(__v => __obj.updateDynamic("MultiplexSettings")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMultiplexRequest]
    }
  }

  /**
    * Placeholder documentation for UpdateMultiplexResponse
    */
  @js.native
  trait UpdateMultiplexResponse extends js.Object {
    var Multiplex: js.UndefOr[Multiplex]
  }

  object UpdateMultiplexResponse {
    @inline
    def apply(
        Multiplex: js.UndefOr[Multiplex] = js.undefined
    ): UpdateMultiplexResponse = {
      val __obj = js.Dynamic.literal()
      Multiplex.foreach(__v => __obj.updateDynamic("Multiplex")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMultiplexResponse]
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
    var H265Settings: js.UndefOr[H265Settings]
  }

  object VideoCodecSettings {
    @inline
    def apply(
        FrameCaptureSettings: js.UndefOr[FrameCaptureSettings] = js.undefined,
        H264Settings: js.UndefOr[H264Settings] = js.undefined,
        H265Settings: js.UndefOr[H265Settings] = js.undefined
    ): VideoCodecSettings = {
      val __obj = js.Dynamic.literal()
      FrameCaptureSettings.foreach(__v => __obj.updateDynamic("FrameCaptureSettings")(__v.asInstanceOf[js.Any]))
      H264Settings.foreach(__v => __obj.updateDynamic("H264Settings")(__v.asInstanceOf[js.Any]))
      H265Settings.foreach(__v => __obj.updateDynamic("H265Settings")(__v.asInstanceOf[js.Any]))
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
  @js.native
  sealed trait VideoDescriptionRespondToAfd extends js.Any
  object VideoDescriptionRespondToAfd extends js.Object {
    val NONE        = "NONE".asInstanceOf[VideoDescriptionRespondToAfd]
    val PASSTHROUGH = "PASSTHROUGH".asInstanceOf[VideoDescriptionRespondToAfd]
    val RESPOND     = "RESPOND".asInstanceOf[VideoDescriptionRespondToAfd]

    val values = js.Object.freeze(js.Array(NONE, PASSTHROUGH, RESPOND))
  }

  /**
    * Video Description Scaling Behavior
    */
  @js.native
  sealed trait VideoDescriptionScalingBehavior extends js.Any
  object VideoDescriptionScalingBehavior extends js.Object {
    val DEFAULT           = "DEFAULT".asInstanceOf[VideoDescriptionScalingBehavior]
    val STRETCH_TO_OUTPUT = "STRETCH_TO_OUTPUT".asInstanceOf[VideoDescriptionScalingBehavior]

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
  @js.native
  sealed trait VideoSelectorColorSpace extends js.Any
  object VideoSelectorColorSpace extends js.Object {
    val FOLLOW  = "FOLLOW".asInstanceOf[VideoSelectorColorSpace]
    val REC_601 = "REC_601".asInstanceOf[VideoSelectorColorSpace]
    val REC_709 = "REC_709".asInstanceOf[VideoSelectorColorSpace]

    val values = js.Object.freeze(js.Array(FOLLOW, REC_601, REC_709))
  }

  /**
    * Video Selector Color Space Usage
    */
  @js.native
  sealed trait VideoSelectorColorSpaceUsage extends js.Any
  object VideoSelectorColorSpaceUsage extends js.Object {
    val FALLBACK = "FALLBACK".asInstanceOf[VideoSelectorColorSpaceUsage]
    val FORCE    = "FORCE".asInstanceOf[VideoSelectorColorSpaceUsage]

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
