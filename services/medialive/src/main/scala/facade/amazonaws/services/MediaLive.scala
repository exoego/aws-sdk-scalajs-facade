package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
    def deleteReservation(params: DeleteReservationRequest): Request[DeleteReservationResponse] = js.native
    def deleteSchedule(params: DeleteScheduleRequest): Request[DeleteScheduleResponse]          = js.native
    def deleteTags(params: DeleteTagsRequest): Request[js.Object]                               = js.native
    def describeChannel(params: DescribeChannelRequest): Request[DescribeChannelResponse]       = js.native
    def describeInput(params: DescribeInputRequest): Request[DescribeInputResponse]             = js.native
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
  @Factory
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
  @Factory
  trait Ac3Settings extends js.Object {
    var Bitrate: js.UndefOr[__double]
    var BitstreamMode: js.UndefOr[Ac3BitstreamMode]
    var CodingMode: js.UndefOr[Ac3CodingMode]
    var Dialnorm: js.UndefOr[__integerMin1Max31]
    var DrcProfile: js.UndefOr[Ac3DrcProfile]
    var LfeFilter: js.UndefOr[Ac3LfeFilter]
    var MetadataControl: js.UndefOr[Ac3MetadataControl]
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
  @Factory
  trait ArchiveContainerSettings extends js.Object {
    var M2tsSettings: js.UndefOr[M2tsSettings]
  }

  /**
    * Archive Group Settings
    */
  @js.native
  @Factory
  trait ArchiveGroupSettings extends js.Object {
    var Destination: OutputLocationRef
    var RolloverInterval: js.UndefOr[__integerMin1]
  }

  /**
    * Archive Output Settings
    */
  @js.native
  @Factory
  trait ArchiveOutputSettings extends js.Object {
    var ContainerSettings: ArchiveContainerSettings
    var Extension: js.UndefOr[__string]
    var NameModifier: js.UndefOr[__string]
  }

  /**
    * Arib Destination Settings
    */
  @js.native
  @Factory
  trait AribDestinationSettings extends js.Object {}

  /**
    * Arib Source Settings
    */
  @js.native
  @Factory
  trait AribSourceSettings extends js.Object {}

  /**
    * Audio Channel Mapping
    */
  @js.native
  @Factory
  trait AudioChannelMapping extends js.Object {
    var InputChannelLevels: __listOfInputChannelLevel
    var OutputChannel: __integerMin0Max7
  }

  /**
    * Audio Codec Settings
    */
  @js.native
  @Factory
  trait AudioCodecSettings extends js.Object {
    var AacSettings: js.UndefOr[AacSettings]
    var Ac3Settings: js.UndefOr[Ac3Settings]
    var Eac3Settings: js.UndefOr[Eac3Settings]
    var Mp2Settings: js.UndefOr[Mp2Settings]
    var PassThroughSettings: js.UndefOr[PassThroughSettings]
  }

  /**
    * Audio Description
    */
  @js.native
  @Factory
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
  @Factory
  trait AudioLanguageSelection extends js.Object {
    var LanguageCode: __string
    var LanguageSelectionPolicy: js.UndefOr[AudioLanguageSelectionPolicy]
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
  @Factory
  trait AudioNormalizationSettings extends js.Object {
    var Algorithm: js.UndefOr[AudioNormalizationAlgorithm]
    var AlgorithmControl: js.UndefOr[AudioNormalizationAlgorithmControl]
    var TargetLkfs: js.UndefOr[__doubleMinNegative59Max0]
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
  @Factory
  trait AudioOnlyHlsSettings extends js.Object {
    var AudioGroupId: js.UndefOr[__string]
    var AudioOnlyImage: js.UndefOr[InputLocation]
    var AudioTrackType: js.UndefOr[AudioOnlyHlsTrackType]
    var SegmentType: js.UndefOr[AudioOnlyHlsSegmentType]
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
  @Factory
  trait AudioPidSelection extends js.Object {
    var Pid: __integerMin0Max8191
  }

  /**
    * Audio Selector
    */
  @js.native
  @Factory
  trait AudioSelector extends js.Object {
    var Name: __stringMin1
    var SelectorSettings: js.UndefOr[AudioSelectorSettings]
  }

  /**
    * Audio Selector Settings
    */
  @js.native
  @Factory
  trait AudioSelectorSettings extends js.Object {
    var AudioLanguageSelection: js.UndefOr[AudioLanguageSelection]
    var AudioPidSelection: js.UndefOr[AudioPidSelection]
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
    * Avail Blanking
    */
  @js.native
  @Factory
  trait AvailBlanking extends js.Object {
    var AvailBlankingImage: js.UndefOr[InputLocation]
    var State: js.UndefOr[AvailBlankingState]
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
  @Factory
  trait AvailConfiguration extends js.Object {
    var AvailSettings: js.UndefOr[AvailSettings]
  }

  /**
    * Avail Settings
    */
  @js.native
  @Factory
  trait AvailSettings extends js.Object {
    var Scte35SpliceInsert: js.UndefOr[Scte35SpliceInsert]
    var Scte35TimeSignalApos: js.UndefOr[Scte35TimeSignalApos]
  }

  /**
    * A list of schedule actions to create (in a request) or that have been created (in a response).
    */
  @js.native
  @Factory
  trait BatchScheduleActionCreateRequest extends js.Object {
    var ScheduleActions: __listOfScheduleAction
  }

  /**
    * List of actions that have been created in the schedule.
    */
  @js.native
  @Factory
  trait BatchScheduleActionCreateResult extends js.Object {
    var ScheduleActions: __listOfScheduleAction
  }

  /**
    * A list of schedule actions to delete.
    */
  @js.native
  @Factory
  trait BatchScheduleActionDeleteRequest extends js.Object {
    var ActionNames: __listOf__string
  }

  /**
    * List of actions that have been deleted from the schedule.
    */
  @js.native
  @Factory
  trait BatchScheduleActionDeleteResult extends js.Object {
    var ScheduleActions: __listOfScheduleAction
  }

  /**
    * List of actions to create and list of actions to delete.
    */
  @js.native
  @Factory
  trait BatchUpdateScheduleRequest extends js.Object {
    var ChannelId: __string
    var Creates: js.UndefOr[BatchScheduleActionCreateRequest]
    var Deletes: js.UndefOr[BatchScheduleActionDeleteRequest]
  }

  /**
    * Placeholder documentation for BatchUpdateScheduleResponse
    */
  @js.native
  @Factory
  trait BatchUpdateScheduleResponse extends js.Object {
    var Creates: js.UndefOr[BatchScheduleActionCreateResult]
    var Deletes: js.UndefOr[BatchScheduleActionDeleteResult]
  }

  /**
    * Blackout Slate
    */
  @js.native
  @Factory
  trait BlackoutSlate extends js.Object {
    var BlackoutSlateImage: js.UndefOr[InputLocation]
    var NetworkEndBlackout: js.UndefOr[BlackoutSlateNetworkEndBlackout]
    var NetworkEndBlackoutImage: js.UndefOr[InputLocation]
    var NetworkId: js.UndefOr[__stringMin34Max34]
    var State: js.UndefOr[BlackoutSlateState]
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
  @Factory
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
  @Factory
  trait CaptionDescription extends js.Object {
    var CaptionSelectorName: __string
    var Name: __string
    var DestinationSettings: js.UndefOr[CaptionDestinationSettings]
    var LanguageCode: js.UndefOr[__string]
    var LanguageDescription: js.UndefOr[__string]
  }

  /**
    * Caption Destination Settings
    */
  @js.native
  @Factory
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

  /**
    * Maps a caption channel to an ISO 693-2 language code (http://www.loc.gov/standards/iso639-2), with an optional description.
    */
  @js.native
  @Factory
  trait CaptionLanguageMapping extends js.Object {
    var CaptionChannel: __integerMin1Max4
    var LanguageCode: __stringMin3Max3
    var LanguageDescription: __stringMin1
  }

  /**
    * Output groups for this Live Event. Output groups contain information about where streams should be distributed.
    */
  @js.native
  @Factory
  trait CaptionSelector extends js.Object {
    var Name: __stringMin1
    var LanguageCode: js.UndefOr[__string]
    var SelectorSettings: js.UndefOr[CaptionSelectorSettings]
  }

  /**
    * Caption Selector Settings
    */
  @js.native
  @Factory
  trait CaptionSelectorSettings extends js.Object {
    var AribSourceSettings: js.UndefOr[AribSourceSettings]
    var DvbSubSourceSettings: js.UndefOr[DvbSubSourceSettings]
    var EmbeddedSourceSettings: js.UndefOr[EmbeddedSourceSettings]
    var Scte20SourceSettings: js.UndefOr[Scte20SourceSettings]
    var Scte27SourceSettings: js.UndefOr[Scte27SourceSettings]
    var TeletextSourceSettings: js.UndefOr[TeletextSourceSettings]
  }

  /**
    * Placeholder documentation for Channel
    */
  @js.native
  @Factory
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
  @Factory
  trait ChannelEgressEndpoint extends js.Object {
    var SourceIp: js.UndefOr[__string]
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
  @Factory
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

  /**
    * Passthrough applies no color space conversion to the output
    */
  @js.native
  @Factory
  trait ColorSpacePassthroughSettings extends js.Object {}

  /**
    * A request to create a channel
    */
  @js.native
  @Factory
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

  /**
    * Placeholder documentation for CreateChannelResponse
    */
  @js.native
  @Factory
  trait CreateChannelResponse extends js.Object {
    var Channel: js.UndefOr[Channel]
  }

  /**
    * The name of the input
    */
  @js.native
  @Factory
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

  /**
    * Placeholder documentation for CreateInputResponse
    */
  @js.native
  @Factory
  trait CreateInputResponse extends js.Object {
    var Input: js.UndefOr[Input]
  }

  /**
    * The IPv4 CIDRs to whitelist for this Input Security Group
    */
  @js.native
  @Factory
  trait CreateInputSecurityGroupRequest extends js.Object {
    var Tags: js.UndefOr[Tags]
    var WhitelistRules: js.UndefOr[__listOfInputWhitelistRuleCidr]
  }

  /**
    * Placeholder documentation for CreateInputSecurityGroupResponse
    */
  @js.native
  @Factory
  trait CreateInputSecurityGroupResponse extends js.Object {
    var SecurityGroup: js.UndefOr[InputSecurityGroup]
  }

  /**
    * A request to create a program in a multiplex.
    */
  @js.native
  @Factory
  trait CreateMultiplexProgramRequest extends js.Object {
    var MultiplexId: __string
    var MultiplexProgramSettings: MultiplexProgramSettings
    var ProgramName: __string
    var RequestId: __string
  }

  /**
    * Placeholder documentation for CreateMultiplexProgramResponse
    */
  @js.native
  @Factory
  trait CreateMultiplexProgramResponse extends js.Object {
    var MultiplexProgram: js.UndefOr[MultiplexProgram]
  }

  /**
    * A request to create a multiplex.
    */
  @js.native
  @Factory
  trait CreateMultiplexRequest extends js.Object {
    var AvailabilityZones: __listOf__string
    var MultiplexSettings: MultiplexSettings
    var Name: __string
    var RequestId: __string
    var Tags: js.UndefOr[Tags]
  }

  /**
    * Placeholder documentation for CreateMultiplexResponse
    */
  @js.native
  @Factory
  trait CreateMultiplexResponse extends js.Object {
    var Multiplex: js.UndefOr[Multiplex]
  }

  /**
    * Placeholder documentation for CreateTagsRequest
    */
  @js.native
  @Factory
  trait CreateTagsRequest extends js.Object {
    var ResourceArn: __string
    var Tags: js.UndefOr[Tags]
  }

  /**
    * Placeholder documentation for DeleteChannelRequest
    */
  @js.native
  @Factory
  trait DeleteChannelRequest extends js.Object {
    var ChannelId: __string
  }

  /**
    * Placeholder documentation for DeleteChannelResponse
    */
  @js.native
  @Factory
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

  /**
    * Placeholder documentation for DeleteInputRequest
    */
  @js.native
  @Factory
  trait DeleteInputRequest extends js.Object {
    var InputId: __string
  }

  /**
    * Placeholder documentation for DeleteInputResponse
    */
  @js.native
  @Factory
  trait DeleteInputResponse extends js.Object {}

  /**
    * Placeholder documentation for DeleteInputSecurityGroupRequest
    */
  @js.native
  @Factory
  trait DeleteInputSecurityGroupRequest extends js.Object {
    var InputSecurityGroupId: __string
  }

  /**
    * Placeholder documentation for DeleteInputSecurityGroupResponse
    */
  @js.native
  @Factory
  trait DeleteInputSecurityGroupResponse extends js.Object {}

  /**
    * Placeholder documentation for DeleteMultiplexProgramRequest
    */
  @js.native
  @Factory
  trait DeleteMultiplexProgramRequest extends js.Object {
    var MultiplexId: __string
    var ProgramName: __string
  }

  /**
    * Placeholder documentation for DeleteMultiplexProgramResponse
    */
  @js.native
  @Factory
  trait DeleteMultiplexProgramResponse extends js.Object {
    var ChannelId: js.UndefOr[__string]
    var MultiplexProgramSettings: js.UndefOr[MultiplexProgramSettings]
    var PacketIdentifiersMap: js.UndefOr[MultiplexProgramPacketIdentifiersMap]
    var ProgramName: js.UndefOr[__string]
  }

  /**
    * Placeholder documentation for DeleteMultiplexRequest
    */
  @js.native
  @Factory
  trait DeleteMultiplexRequest extends js.Object {
    var MultiplexId: __string
  }

  /**
    * Placeholder documentation for DeleteMultiplexResponse
    */
  @js.native
  @Factory
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

  /**
    * Placeholder documentation for DeleteReservationRequest
    */
  @js.native
  @Factory
  trait DeleteReservationRequest extends js.Object {
    var ReservationId: __string
  }

  /**
    * Placeholder documentation for DeleteReservationResponse
    */
  @js.native
  @Factory
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

  /**
    * Placeholder documentation for DeleteScheduleRequest
    */
  @js.native
  @Factory
  trait DeleteScheduleRequest extends js.Object {
    var ChannelId: __string
  }

  /**
    * Placeholder documentation for DeleteScheduleResponse
    */
  @js.native
  @Factory
  trait DeleteScheduleResponse extends js.Object {}

  /**
    * Placeholder documentation for DeleteTagsRequest
    */
  @js.native
  @Factory
  trait DeleteTagsRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  /**
    * Placeholder documentation for DescribeChannelRequest
    */
  @js.native
  @Factory
  trait DescribeChannelRequest extends js.Object {
    var ChannelId: __string
  }

  /**
    * Placeholder documentation for DescribeChannelResponse
    */
  @js.native
  @Factory
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

  /**
    * Placeholder documentation for DescribeInputRequest
    */
  @js.native
  @Factory
  trait DescribeInputRequest extends js.Object {
    var InputId: __string
  }

  /**
    * Placeholder documentation for DescribeInputResponse
    */
  @js.native
  @Factory
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

  /**
    * Placeholder documentation for DescribeInputSecurityGroupRequest
    */
  @js.native
  @Factory
  trait DescribeInputSecurityGroupRequest extends js.Object {
    var InputSecurityGroupId: __string
  }

  /**
    * Placeholder documentation for DescribeInputSecurityGroupResponse
    */
  @js.native
  @Factory
  trait DescribeInputSecurityGroupResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Inputs: js.UndefOr[__listOf__string]
    var State: js.UndefOr[InputSecurityGroupState]
    var Tags: js.UndefOr[Tags]
    var WhitelistRules: js.UndefOr[__listOfInputWhitelistRule]
  }

  /**
    * Placeholder documentation for DescribeMultiplexProgramRequest
    */
  @js.native
  @Factory
  trait DescribeMultiplexProgramRequest extends js.Object {
    var MultiplexId: __string
    var ProgramName: __string
  }

  /**
    * Placeholder documentation for DescribeMultiplexProgramResponse
    */
  @js.native
  @Factory
  trait DescribeMultiplexProgramResponse extends js.Object {
    var ChannelId: js.UndefOr[__string]
    var MultiplexProgramSettings: js.UndefOr[MultiplexProgramSettings]
    var PacketIdentifiersMap: js.UndefOr[MultiplexProgramPacketIdentifiersMap]
    var ProgramName: js.UndefOr[__string]
  }

  /**
    * Placeholder documentation for DescribeMultiplexRequest
    */
  @js.native
  @Factory
  trait DescribeMultiplexRequest extends js.Object {
    var MultiplexId: __string
  }

  /**
    * Placeholder documentation for DescribeMultiplexResponse
    */
  @js.native
  @Factory
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

  /**
    * Placeholder documentation for DescribeOfferingRequest
    */
  @js.native
  @Factory
  trait DescribeOfferingRequest extends js.Object {
    var OfferingId: __string
  }

  /**
    * Placeholder documentation for DescribeOfferingResponse
    */
  @js.native
  @Factory
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

  /**
    * Placeholder documentation for DescribeReservationRequest
    */
  @js.native
  @Factory
  trait DescribeReservationRequest extends js.Object {
    var ReservationId: __string
  }

  /**
    * Placeholder documentation for DescribeReservationResponse
    */
  @js.native
  @Factory
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

  /**
    * Placeholder documentation for DescribeScheduleRequest
    */
  @js.native
  @Factory
  trait DescribeScheduleRequest extends js.Object {
    var ChannelId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  /**
    * Placeholder documentation for DescribeScheduleResponse
    */
  @js.native
  @Factory
  trait DescribeScheduleResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var ScheduleActions: js.UndefOr[__listOfScheduleAction]
  }

  /**
    * DVB Network Information Table (NIT)
    */
  @js.native
  @Factory
  trait DvbNitSettings extends js.Object {
    var NetworkId: __integerMin0Max65536
    var NetworkName: __stringMin1Max256
    var RepInterval: js.UndefOr[__integerMin25Max10000]
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
  @Factory
  trait DvbSdtSettings extends js.Object {
    var OutputSdt: js.UndefOr[DvbSdtOutputSdt]
    var RepInterval: js.UndefOr[__integerMin25Max2000]
    var ServiceName: js.UndefOr[__stringMin1Max256]
    var ServiceProviderName: js.UndefOr[__stringMin1Max256]
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
  @Factory
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
  @Factory
  trait DvbSubSourceSettings extends js.Object {
    var Pid: js.UndefOr[__integerMin1]
  }

  /**
    * DVB Time and Date Table (SDT)
    */
  @js.native
  @Factory
  trait DvbTdtSettings extends js.Object {
    var RepInterval: js.UndefOr[__integerMin1000Max30000]
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
  @Factory
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
  @Factory
  trait EmbeddedDestinationSettings extends js.Object {}

  /**
    * Embedded Plus Scte20 Destination Settings
    */
  @js.native
  @Factory
  trait EmbeddedPlusScte20DestinationSettings extends js.Object {}

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
  @Factory
  trait EmbeddedSourceSettings extends js.Object {
    var Convert608To708: js.UndefOr[EmbeddedConvert608To708]
    var Scte20Detection: js.UndefOr[EmbeddedScte20Detection]
    var Source608ChannelNumber: js.UndefOr[__integerMin1Max4]
    var Source608TrackNumber: js.UndefOr[__integerMin1Max5]
  }

  /**
    * Encoder Settings
    */
  @js.native
  @Factory
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
    var NielsenConfiguration: js.UndefOr[NielsenConfiguration]
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
  @Factory
  trait FecOutputSettings extends js.Object {
    var ColumnDepth: js.UndefOr[__integerMin4Max20]
    var IncludeFec: js.UndefOr[FecOutputIncludeFec]
    var RowLength: js.UndefOr[__integerMin1Max20]
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
  @Factory
  trait FixedModeScheduleActionStartSettings extends js.Object {
    var Time: __string
  }

  /**
    * Fmp4 Hls Settings
    */
  @js.native
  @Factory
  trait Fmp4HlsSettings extends js.Object {
    var AudioRenditionSets: js.UndefOr[__string]
  }

  /**
    * Settings to specify if an action follows another.
    */
  @js.native
  @Factory
  trait FollowModeScheduleActionStartSettings extends js.Object {
    var FollowPoint: FollowPoint
    var ReferenceActionName: __string
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
  @Factory
  trait FrameCaptureGroupSettings extends js.Object {
    var Destination: OutputLocationRef
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
  @Factory
  trait FrameCaptureOutputSettings extends js.Object {
    var NameModifier: js.UndefOr[__string]
  }

  /**
    * Frame Capture Settings
    */
  @js.native
  @Factory
  trait FrameCaptureSettings extends js.Object {
    var CaptureInterval: __integerMin1Max3600000
    var CaptureIntervalUnits: js.UndefOr[FrameCaptureIntervalUnit]
  }

  /**
    * Global Configuration
    */
  @js.native
  @Factory
  trait GlobalConfiguration extends js.Object {
    var InitialAudioGain: js.UndefOr[__integerMinNegative60Max60]
    var InputEndAction: js.UndefOr[GlobalConfigurationInputEndAction]
    var InputLossBehavior: js.UndefOr[InputLossBehavior]
    var OutputLockingMode: js.UndefOr[GlobalConfigurationOutputLockingMode]
    var OutputTimingSource: js.UndefOr[GlobalConfigurationOutputTimingSource]
    var SupportLowFramerateInputs: js.UndefOr[GlobalConfigurationLowFramerateInputs]
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
  @Factory
  trait H264ColorSpaceSettings extends js.Object {
    var ColorSpacePassthroughSettings: js.UndefOr[ColorSpacePassthroughSettings]
    var Rec601Settings: js.UndefOr[Rec601Settings]
    var Rec709Settings: js.UndefOr[Rec709Settings]
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
  @Factory
  trait H264Settings extends js.Object {
    var AdaptiveQuantization: js.UndefOr[H264AdaptiveQuantization]
    var AfdSignaling: js.UndefOr[AfdSignaling]
    var Bitrate: js.UndefOr[__integerMin1000]
    var BufFillPct: js.UndefOr[__integerMin0Max100]
    var BufSize: js.UndefOr[__integerMin0]
    var ColorMetadata: js.UndefOr[H264ColorMetadata]
    var ColorSpaceSettings: js.UndefOr[H264ColorSpaceSettings]
    var EntropyEncoding: js.UndefOr[H264EntropyEncoding]
    var FixedAfd: js.UndefOr[FixedAfd]
    var FlickerAq: js.UndefOr[H264FlickerAq]
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
  @Factory
  trait H265ColorSpaceSettings extends js.Object {
    var ColorSpacePassthroughSettings: js.UndefOr[ColorSpacePassthroughSettings]
    var Hdr10Settings: js.UndefOr[Hdr10Settings]
    var Rec601Settings: js.UndefOr[Rec601Settings]
    var Rec709Settings: js.UndefOr[Rec709Settings]
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
  @Factory
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
  @Factory
  trait Hdr10Settings extends js.Object {
    var MaxCll: js.UndefOr[__integerMin0Max32768]
    var MaxFall: js.UndefOr[__integerMin0Max32768]
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
  @Factory
  trait HlsAkamaiSettings extends js.Object {
    var ConnectionRetryInterval: js.UndefOr[__integerMin0]
    var FilecacheDuration: js.UndefOr[__integerMin0Max600]
    var HttpTransferMode: js.UndefOr[HlsAkamaiHttpTransferMode]
    var NumRetries: js.UndefOr[__integerMin0]
    var RestartDelay: js.UndefOr[__integerMin0Max15]
    var Salt: js.UndefOr[__string]
    var Token: js.UndefOr[__string]
  }

  /**
    * Hls Basic Put Settings
    */
  @js.native
  @Factory
  trait HlsBasicPutSettings extends js.Object {
    var ConnectionRetryInterval: js.UndefOr[__integerMin0]
    var FilecacheDuration: js.UndefOr[__integerMin0Max600]
    var NumRetries: js.UndefOr[__integerMin0]
    var RestartDelay: js.UndefOr[__integerMin0Max15]
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
  @Factory
  trait HlsCdnSettings extends js.Object {
    var HlsAkamaiSettings: js.UndefOr[HlsAkamaiSettings]
    var HlsBasicPutSettings: js.UndefOr[HlsBasicPutSettings]
    var HlsMediaStoreSettings: js.UndefOr[HlsMediaStoreSettings]
    var HlsWebdavSettings: js.UndefOr[HlsWebdavSettings]
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
  @Factory
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
  @Factory
  trait HlsId3SegmentTaggingScheduleActionSettings extends js.Object {
    var Tag: __string
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
  @Factory
  trait HlsInputSettings extends js.Object {
    var Bandwidth: js.UndefOr[__integerMin0]
    var BufferSegments: js.UndefOr[__integerMin0]
    var Retries: js.UndefOr[__integerMin0]
    var RetryInterval: js.UndefOr[__integerMin0]
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
  @Factory
  trait HlsMediaStoreSettings extends js.Object {
    var ConnectionRetryInterval: js.UndefOr[__integerMin0]
    var FilecacheDuration: js.UndefOr[__integerMin0Max600]
    var MediaStoreStorageClass: js.UndefOr[HlsMediaStoreStorageClass]
    var NumRetries: js.UndefOr[__integerMin0]
    var RestartDelay: js.UndefOr[__integerMin0Max15]
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
  @Factory
  trait HlsOutputSettings extends js.Object {
    var HlsSettings: HlsSettings
    var H265PackagingType: js.UndefOr[HlsH265PackagingType]
    var NameModifier: js.UndefOr[__stringMin1]
    var SegmentModifier: js.UndefOr[__string]
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
  @Factory
  trait HlsSettings extends js.Object {
    var AudioOnlyHlsSettings: js.UndefOr[AudioOnlyHlsSettings]
    var Fmp4HlsSettings: js.UndefOr[Fmp4HlsSettings]
    var StandardHlsSettings: js.UndefOr[StandardHlsSettings]
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
  @Factory
  trait HlsTimedMetadataScheduleActionSettings extends js.Object {
    var Id3: __string
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
  @Factory
  trait HlsWebdavSettings extends js.Object {
    var ConnectionRetryInterval: js.UndefOr[__integerMin0]
    var FilecacheDuration: js.UndefOr[__integerMin0Max600]
    var HttpTransferMode: js.UndefOr[HlsWebdavHttpTransferMode]
    var NumRetries: js.UndefOr[__integerMin0]
    var RestartDelay: js.UndefOr[__integerMin0Max15]
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
    * Settings to configure an action so that it occurs immediately. This is only supported for input switch actions currently.
    */
  @js.native
  @Factory
  trait ImmediateModeScheduleActionStartSettings extends js.Object {}

  /**
    * Placeholder documentation for Input
    */
  @js.native
  @Factory
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

  /**
    * Placeholder documentation for InputAttachment
    */
  @js.native
  @Factory
  trait InputAttachment extends js.Object {
    var InputAttachmentName: js.UndefOr[__string]
    var InputId: js.UndefOr[__string]
    var InputSettings: js.UndefOr[InputSettings]
  }

  /**
    * Input Channel Level
    */
  @js.native
  @Factory
  trait InputChannelLevel extends js.Object {
    var Gain: __integerMinNegative60Max6
    var InputChannel: __integerMin0Max15
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
  @Factory
  trait InputClippingSettings extends js.Object {
    var InputTimecodeSource: InputTimecodeSource
    var StartTimecode: js.UndefOr[StartTimecode]
    var StopTimecode: js.UndefOr[StopTimecode]
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
  @Factory
  trait InputDestination extends js.Object {
    var Ip: js.UndefOr[__string]
    var Port: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
    var Vpc: js.UndefOr[InputDestinationVpc]
  }

  /**
    * Endpoint settings for a PUSH type input.
    */
  @js.native
  @Factory
  trait InputDestinationRequest extends js.Object {
    var StreamName: js.UndefOr[__string]
  }

  /**
    * The properties for a VPC type input destination.
    */
  @js.native
  @Factory
  trait InputDestinationVpc extends js.Object {
    var AvailabilityZone: js.UndefOr[__string]
    var NetworkInterfaceId: js.UndefOr[__string]
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
  @Factory
  trait InputLocation extends js.Object {
    var Uri: __string
    var PasswordParam: js.UndefOr[__string]
    var Username: js.UndefOr[__string]
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
  @Factory
  trait InputLossBehavior extends js.Object {
    var BlackFrameMsec: js.UndefOr[__integerMin0Max1000000]
    var InputLossImageColor: js.UndefOr[__stringMin6Max6]
    var InputLossImageSlate: js.UndefOr[InputLocation]
    var InputLossImageType: js.UndefOr[InputLossImageType]
    var RepeatFrameMsec: js.UndefOr[__integerMin0Max1000000]
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
  @Factory
  trait InputSecurityGroup extends js.Object {
    var Arn: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Inputs: js.UndefOr[__listOf__string]
    var State: js.UndefOr[InputSecurityGroupState]
    var Tags: js.UndefOr[Tags]
    var WhitelistRules: js.UndefOr[__listOfInputWhitelistRule]
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
  @Factory
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

  /**
    * The settings for a PULL type input.
    */
  @js.native
  @Factory
  trait InputSource extends js.Object {
    var PasswordParam: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
    var Username: js.UndefOr[__string]
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
  @Factory
  trait InputSourceRequest extends js.Object {
    var PasswordParam: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
    var Username: js.UndefOr[__string]
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
  @Factory
  trait InputSpecification extends js.Object {
    var Codec: js.UndefOr[InputCodec]
    var MaximumBitrate: js.UndefOr[InputMaximumBitrate]
    var Resolution: js.UndefOr[InputResolution]
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
  @Factory
  trait InputSwitchScheduleActionSettings extends js.Object {
    var InputAttachmentNameReference: __string
    var InputClippingSettings: js.UndefOr[InputClippingSettings]
    var UrlPath: js.UndefOr[__listOf__string]
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

    val values = js.Object.freeze(js.Array(UDP_PUSH, RTP_PUSH, RTMP_PUSH, RTMP_PULL, URL_PULL, MP4_FILE, MEDIACONNECT))
  }

  /**
    * Settings for a private VPC Input.
    * When this property is specified, the input destination addresses will be created in a VPC rather than with public Internet addresses.
    * This property requires setting the roleArn property on Input creation.
    * Not compatible with the inputSecurityGroups property.
    */
  @js.native
  @Factory
  trait InputVpcRequest extends js.Object {
    var SubnetIds: __listOf__string
    var SecurityGroupIds: js.UndefOr[__listOf__string]
  }

  /**
    * Whitelist rule
    */
  @js.native
  @Factory
  trait InputWhitelistRule extends js.Object {
    var Cidr: js.UndefOr[__string]
  }

  /**
    * An IPv4 CIDR to whitelist.
    */
  @js.native
  @Factory
  trait InputWhitelistRuleCidr extends js.Object {
    var Cidr: js.UndefOr[__string]
  }

  /**
    * Key Provider Settings
    */
  @js.native
  @Factory
  trait KeyProviderSettings extends js.Object {
    var StaticKeySettings: js.UndefOr[StaticKeySettings]
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
  @Factory
  trait ListChannelsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  /**
    * Placeholder documentation for ListChannelsResponse
    */
  @js.native
  @Factory
  trait ListChannelsResponse extends js.Object {
    var Channels: js.UndefOr[__listOfChannelSummary]
    var NextToken: js.UndefOr[__string]
  }

  /**
    * Placeholder documentation for ListInputSecurityGroupsRequest
    */
  @js.native
  @Factory
  trait ListInputSecurityGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  /**
    * Placeholder documentation for ListInputSecurityGroupsResponse
    */
  @js.native
  @Factory
  trait ListInputSecurityGroupsResponse extends js.Object {
    var InputSecurityGroups: js.UndefOr[__listOfInputSecurityGroup]
    var NextToken: js.UndefOr[__string]
  }

  /**
    * Placeholder documentation for ListInputsRequest
    */
  @js.native
  @Factory
  trait ListInputsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  /**
    * Placeholder documentation for ListInputsResponse
    */
  @js.native
  @Factory
  trait ListInputsResponse extends js.Object {
    var Inputs: js.UndefOr[__listOfInput]
    var NextToken: js.UndefOr[__string]
  }

  /**
    * Placeholder documentation for ListMultiplexProgramsRequest
    */
  @js.native
  @Factory
  trait ListMultiplexProgramsRequest extends js.Object {
    var MultiplexId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  /**
    * Placeholder documentation for ListMultiplexProgramsResponse
    */
  @js.native
  @Factory
  trait ListMultiplexProgramsResponse extends js.Object {
    var MultiplexPrograms: js.UndefOr[__listOfMultiplexProgramSummary]
    var NextToken: js.UndefOr[__string]
  }

  /**
    * Placeholder documentation for ListMultiplexesRequest
    */
  @js.native
  @Factory
  trait ListMultiplexesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  /**
    * Placeholder documentation for ListMultiplexesResponse
    */
  @js.native
  @Factory
  trait ListMultiplexesResponse extends js.Object {
    var Multiplexes: js.UndefOr[__listOfMultiplexSummary]
    var NextToken: js.UndefOr[__string]
  }

  /**
    * Placeholder documentation for ListOfferingsRequest
    */
  @js.native
  @Factory
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

  /**
    * Placeholder documentation for ListOfferingsResponse
    */
  @js.native
  @Factory
  trait ListOfferingsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Offerings: js.UndefOr[__listOfOffering]
  }

  /**
    * Placeholder documentation for ListReservationsRequest
    */
  @js.native
  @Factory
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

  /**
    * Placeholder documentation for ListReservationsResponse
    */
  @js.native
  @Factory
  trait ListReservationsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Reservations: js.UndefOr[__listOfReservation]
  }

  /**
    * Placeholder documentation for ListTagsForResourceRequest
    */
  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  /**
    * Placeholder documentation for ListTagsForResourceResponse
    */
  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[Tags]
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
  @Factory
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
  @Factory
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
  @Factory
  trait MediaConnectFlow extends js.Object {
    var FlowArn: js.UndefOr[__string]
  }

  /**
    * The settings for a MediaConnect Flow.
    */
  @js.native
  @Factory
  trait MediaConnectFlowRequest extends js.Object {
    var FlowArn: js.UndefOr[__string]
  }

  /**
    * Media Package Group Settings
    */
  @js.native
  @Factory
  trait MediaPackageGroupSettings extends js.Object {
    var Destination: OutputLocationRef
  }

  /**
    * MediaPackage Output Destination Settings
    */
  @js.native
  @Factory
  trait MediaPackageOutputDestinationSettings extends js.Object {
    var ChannelId: js.UndefOr[__stringMin1]
  }

  /**
    * Media Package Output Settings
    */
  @js.native
  @Factory
  trait MediaPackageOutputSettings extends js.Object {}

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
  @Factory
  trait Mp2Settings extends js.Object {
    var Bitrate: js.UndefOr[__double]
    var CodingMode: js.UndefOr[Mp2CodingMode]
    var SampleRate: js.UndefOr[__double]
  }

  /**
    * Ms Smooth Group Settings
    */
  @js.native
  @Factory
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
  @Factory
  trait MsSmoothOutputSettings extends js.Object {
    var H265PackagingType: js.UndefOr[MsSmoothH265PackagingType]
    var NameModifier: js.UndefOr[__string]
  }

  /**
    * The multiplex object.
    */
  @js.native
  @Factory
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

  /**
    * Multiplex Group Settings
    */
  @js.native
  @Factory
  trait MultiplexGroupSettings extends js.Object {}

  /**
    * Multiplex MediaConnect output destination settings.
    */
  @js.native
  @Factory
  trait MultiplexMediaConnectOutputDestinationSettings extends js.Object {
    var EntitlementArn: js.UndefOr[__stringMin1]
  }

  /**
    * Multiplex output destination settings
    */
  @js.native
  @Factory
  trait MultiplexOutputDestination extends js.Object {
    var MediaConnectSettings: js.UndefOr[MultiplexMediaConnectOutputDestinationSettings]
  }

  /**
    * Multiplex Output Settings
    */
  @js.native
  @Factory
  trait MultiplexOutputSettings extends js.Object {
    var Destination: OutputLocationRef
  }

  /**
    * The multiplex program object.
    */
  @js.native
  @Factory
  trait MultiplexProgram extends js.Object {
    var ChannelId: js.UndefOr[__string]
    var MultiplexProgramSettings: js.UndefOr[MultiplexProgramSettings]
    var PacketIdentifiersMap: js.UndefOr[MultiplexProgramPacketIdentifiersMap]
    var ProgramName: js.UndefOr[__string]
  }

  /**
    * Multiplex Program Input Destination Settings for outputting a Channel to a Multiplex
    */
  @js.native
  @Factory
  trait MultiplexProgramChannelDestinationSettings extends js.Object {
    var MultiplexId: js.UndefOr[__stringMin1]
    var ProgramName: js.UndefOr[__stringMin1]
  }

  /**
    * Packet identifiers map for a given Multiplex program.
    */
  @js.native
  @Factory
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

  /**
    * Transport stream service descriptor configuration for the Multiplex program.
    */
  @js.native
  @Factory
  trait MultiplexProgramServiceDescriptor extends js.Object {
    var ProviderName: __stringMax256
    var ServiceName: __stringMax256
  }

  /**
    * Multiplex Program settings configuration.
    */
  @js.native
  @Factory
  trait MultiplexProgramSettings extends js.Object {
    var ProgramNumber: __integerMin0Max65535
    var ServiceDescriptor: js.UndefOr[MultiplexProgramServiceDescriptor]
    var VideoSettings: js.UndefOr[MultiplexVideoSettings]
  }

  /**
    * Placeholder documentation for MultiplexProgramSummary
    */
  @js.native
  @Factory
  trait MultiplexProgramSummary extends js.Object {
    var ChannelId: js.UndefOr[__string]
    var ProgramName: js.UndefOr[__string]
  }

  /**
    * Contains configuration for a Multiplex event
    */
  @js.native
  @Factory
  trait MultiplexSettings extends js.Object {
    var TransportStreamBitrate: __integerMin1000000Max100000000
    var TransportStreamId: __integerMin0Max65535
    var MaximumVideoBufferDelayMilliseconds: js.UndefOr[__integerMin1000Max3000]
    var TransportStreamReservedBitrate: js.UndefOr[__integerMin0Max100000000]
  }

  /**
    * Contains summary configuration for a Multiplex event.
    */
  @js.native
  @Factory
  trait MultiplexSettingsSummary extends js.Object {
    var TransportStreamBitrate: js.UndefOr[__integerMin1000000Max100000000]
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
  @Factory
  trait MultiplexStatmuxVideoSettings extends js.Object {
    var MaximumBitrate: js.UndefOr[__integerMin100000Max100000000]
    var MinimumBitrate: js.UndefOr[__integerMin100000Max100000000]
  }

  /**
    * Placeholder documentation for MultiplexSummary
    */
  @js.native
  @Factory
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

  /**
    * The video configuration for each program in a multiplex.
    */
  @js.native
  @Factory
  trait MultiplexVideoSettings extends js.Object {
    var ConstantBitrate: js.UndefOr[__integerMin100000Max100000000]
    var StatmuxSettings: js.UndefOr[MultiplexStatmuxVideoSettings]
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
  @Factory
  trait NetworkInputSettings extends js.Object {
    var HlsInputSettings: js.UndefOr[HlsInputSettings]
    var ServerValidation: js.UndefOr[NetworkInputServerValidation]
  }

  /**
    * Nielsen Configuration
    */
  @js.native
  @Factory
  trait NielsenConfiguration extends js.Object {
    var DistributorId: js.UndefOr[__string]
    var NielsenPcmToId3Tagging: js.UndefOr[NielsenPcmToId3TaggingState]
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
  @Factory
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
  @Factory
  trait Output extends js.Object {
    var OutputSettings: OutputSettings
    var AudioDescriptionNames: js.UndefOr[__listOf__string]
    var CaptionDescriptionNames: js.UndefOr[__listOf__string]
    var OutputName: js.UndefOr[__stringMin1Max255]
    var VideoDescriptionName: js.UndefOr[__string]
  }

  /**
    * Placeholder documentation for OutputDestination
    */
  @js.native
  @Factory
  trait OutputDestination extends js.Object {
    var Id: js.UndefOr[__string]
    var MediaPackageSettings: js.UndefOr[__listOfMediaPackageOutputDestinationSettings]
    var MultiplexSettings: js.UndefOr[MultiplexProgramChannelDestinationSettings]
    var Settings: js.UndefOr[__listOfOutputDestinationSettings]
  }

  /**
    * Placeholder documentation for OutputDestinationSettings
    */
  @js.native
  @Factory
  trait OutputDestinationSettings extends js.Object {
    var PasswordParam: js.UndefOr[__string]
    var StreamName: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
    var Username: js.UndefOr[__string]
  }

  /**
    * Output groups for this Live Event. Output groups contain information about where streams should be distributed.
    */
  @js.native
  @Factory
  trait OutputGroup extends js.Object {
    var OutputGroupSettings: OutputGroupSettings
    var Outputs: __listOfOutput
    var Name: js.UndefOr[__stringMax32]
  }

  /**
    * Output Group Settings
    */
  @js.native
  @Factory
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

  /**
    * Reference to an OutputDestination ID defined in the channel
    */
  @js.native
  @Factory
  trait OutputLocationRef extends js.Object {
    var DestinationRefId: js.UndefOr[__string]
  }

  /**
    * Output Settings
    */
  @js.native
  @Factory
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

  /**
    * Pass Through Settings
    */
  @js.native
  @Factory
  trait PassThroughSettings extends js.Object {}

  /**
    * Settings for the action to set pause state of a channel.
    */
  @js.native
  @Factory
  trait PauseStateScheduleActionSettings extends js.Object {
    var Pipelines: js.UndefOr[__listOfPipelinePauseStateSettings]
  }

  /**
    * Runtime details of a pipeline when a channel is running.
    */
  @js.native
  @Factory
  trait PipelineDetail extends js.Object {
    var ActiveInputAttachmentName: js.UndefOr[__string]
    var ActiveInputSwitchActionName: js.UndefOr[__string]
    var PipelineId: js.UndefOr[__string]
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
  @Factory
  trait PipelinePauseStateSettings extends js.Object {
    var PipelineId: PipelineId
  }

  /**
    * Placeholder documentation for PurchaseOfferingRequest
    */
  @js.native
  @Factory
  trait PurchaseOfferingRequest extends js.Object {
    var Count: __integerMin1
    var OfferingId: __string
    var Name: js.UndefOr[__string]
    var RequestId: js.UndefOr[__string]
    var Start: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * Placeholder documentation for PurchaseOfferingResponse
    */
  @js.native
  @Factory
  trait PurchaseOfferingResponse extends js.Object {
    var Reservation: js.UndefOr[Reservation]
  }

  /**
    * Rec601 Settings
    */
  @js.native
  @Factory
  trait Rec601Settings extends js.Object {}

  /**
    * Rec709 Settings
    */
  @js.native
  @Factory
  trait Rec709Settings extends js.Object {}

  /**
    * Remix Settings
    */
  @js.native
  @Factory
  trait RemixSettings extends js.Object {
    var ChannelMappings: __listOfAudioChannelMapping
    var ChannelsIn: js.UndefOr[__integerMin1Max16]
    var ChannelsOut: js.UndefOr[__integerMin1Max8]
  }

  /**
    * Reserved resources available to use
    */
  @js.native
  @Factory
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
  @Factory
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
  @Factory
  trait RtmpCaptionInfoDestinationSettings extends js.Object {}

  /**
    * Rtmp Group Settings
    */
  @js.native
  @Factory
  trait RtmpGroupSettings extends js.Object {
    var AuthenticationScheme: js.UndefOr[AuthenticationScheme]
    var CacheFullBehavior: js.UndefOr[RtmpCacheFullBehavior]
    var CacheLength: js.UndefOr[__integerMin30]
    var CaptionData: js.UndefOr[RtmpCaptionData]
    var InputLossAction: js.UndefOr[InputLossActionForRtmpOut]
    var RestartDelay: js.UndefOr[__integerMin0]
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
  @Factory
  trait RtmpOutputSettings extends js.Object {
    var Destination: OutputLocationRef
    var CertificateMode: js.UndefOr[RtmpOutputCertificateMode]
    var ConnectionRetryInterval: js.UndefOr[__integerMin1]
    var NumRetries: js.UndefOr[__integerMin0]
  }

  /**
    * Contains information on a single schedule action.
    */
  @js.native
  @Factory
  trait ScheduleAction extends js.Object {
    var ActionName: __string
    var ScheduleActionSettings: ScheduleActionSettings
    var ScheduleActionStartSettings: ScheduleActionStartSettings
  }

  /**
    * Holds the settings for a single schedule action.
    */
  @js.native
  @Factory
  trait ScheduleActionSettings extends js.Object {
    var HlsId3SegmentTaggingSettings: js.UndefOr[HlsId3SegmentTaggingScheduleActionSettings]
    var HlsTimedMetadataSettings: js.UndefOr[HlsTimedMetadataScheduleActionSettings]
    var InputSwitchSettings: js.UndefOr[InputSwitchScheduleActionSettings]
    var PauseStateSettings: js.UndefOr[PauseStateScheduleActionSettings]
    var Scte35ReturnToNetworkSettings: js.UndefOr[Scte35ReturnToNetworkScheduleActionSettings]
    var Scte35SpliceInsertSettings: js.UndefOr[Scte35SpliceInsertScheduleActionSettings]
    var Scte35TimeSignalSettings: js.UndefOr[Scte35TimeSignalScheduleActionSettings]
    var StaticImageActivateSettings: js.UndefOr[StaticImageActivateScheduleActionSettings]
    var StaticImageDeactivateSettings: js.UndefOr[StaticImageDeactivateScheduleActionSettings]
  }

  /**
    * Settings to specify when an action should occur. Only one of the options must be selected.
    */
  @js.native
  @Factory
  trait ScheduleActionStartSettings extends js.Object {
    var FixedModeScheduleActionStartSettings: js.UndefOr[FixedModeScheduleActionStartSettings]
    var FollowModeScheduleActionStartSettings: js.UndefOr[FollowModeScheduleActionStartSettings]
    var ImmediateModeScheduleActionStartSettings: js.UndefOr[ImmediateModeScheduleActionStartSettings]
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
  @Factory
  trait Scte20PlusEmbeddedDestinationSettings extends js.Object {}

  /**
    * Scte20 Source Settings
    */
  @js.native
  @Factory
  trait Scte20SourceSettings extends js.Object {
    var Convert608To708: js.UndefOr[Scte20Convert608To708]
    var Source608ChannelNumber: js.UndefOr[__integerMin1Max4]
  }

  /**
    * Scte27 Destination Settings
    */
  @js.native
  @Factory
  trait Scte27DestinationSettings extends js.Object {}

  /**
    * Scte27 Source Settings
    */
  @js.native
  @Factory
  trait Scte27SourceSettings extends js.Object {
    var Pid: js.UndefOr[__integerMin1]
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
  @Factory
  trait Scte35DeliveryRestrictions extends js.Object {
    var ArchiveAllowedFlag: Scte35ArchiveAllowedFlag
    var DeviceRestrictions: Scte35DeviceRestrictions
    var NoRegionalBlackoutFlag: Scte35NoRegionalBlackoutFlag
    var WebDeliveryAllowedFlag: Scte35WebDeliveryAllowedFlag
  }

  /**
    * Holds one set of SCTE-35 Descriptor Settings.
    */
  @js.native
  @Factory
  trait Scte35Descriptor extends js.Object {
    var Scte35DescriptorSettings: Scte35DescriptorSettings
  }

  /**
    * SCTE-35 Descriptor settings.
    */
  @js.native
  @Factory
  trait Scte35DescriptorSettings extends js.Object {
    var SegmentationDescriptorScte35DescriptorSettings: Scte35SegmentationDescriptor
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
  @Factory
  trait Scte35ReturnToNetworkScheduleActionSettings extends js.Object {
    var SpliceEventId: __longMin0Max4294967295
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
  @Factory
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

  /**
    * Scte35 Splice Insert
    */
  @js.native
  @Factory
  trait Scte35SpliceInsert extends js.Object {
    var AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000]
    var NoRegionalBlackoutFlag: js.UndefOr[Scte35SpliceInsertNoRegionalBlackoutBehavior]
    var WebDeliveryAllowedFlag: js.UndefOr[Scte35SpliceInsertWebDeliveryAllowedBehavior]
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
  @Factory
  trait Scte35SpliceInsertScheduleActionSettings extends js.Object {
    var SpliceEventId: __longMin0Max4294967295
    var Duration: js.UndefOr[__longMin0Max8589934591]
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
  @Factory
  trait Scte35TimeSignalApos extends js.Object {
    var AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000]
    var NoRegionalBlackoutFlag: js.UndefOr[Scte35AposNoRegionalBlackoutBehavior]
    var WebDeliveryAllowedFlag: js.UndefOr[Scte35AposWebDeliveryAllowedBehavior]
  }

  /**
    * Settings for a SCTE-35 time_signal.
    */
  @js.native
  @Factory
  trait Scte35TimeSignalScheduleActionSettings extends js.Object {
    var Scte35Descriptors: __listOfScte35Descriptor
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
    val NONE    = "NONE".asInstanceOf[SmoothGroupSparseTrackType]
    val SCTE_35 = "SCTE_35".asInstanceOf[SmoothGroupSparseTrackType]

    val values = js.Object.freeze(js.Array(NONE, SCTE_35))
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
    * Smpte Tt Destination Settings
    */
  @js.native
  @Factory
  trait SmpteTtDestinationSettings extends js.Object {}

  /**
    * Standard Hls Settings
    */
  @js.native
  @Factory
  trait StandardHlsSettings extends js.Object {
    var M3u8Settings: M3u8Settings
    var AudioRenditionSets: js.UndefOr[__string]
  }

  /**
    * Placeholder documentation for StartChannelRequest
    */
  @js.native
  @Factory
  trait StartChannelRequest extends js.Object {
    var ChannelId: __string
  }

  /**
    * Placeholder documentation for StartChannelResponse
    */
  @js.native
  @Factory
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

  /**
    * Placeholder documentation for StartMultiplexRequest
    */
  @js.native
  @Factory
  trait StartMultiplexRequest extends js.Object {
    var MultiplexId: __string
  }

  /**
    * Placeholder documentation for StartMultiplexResponse
    */
  @js.native
  @Factory
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

  /**
    * Settings to identify the start of the clip.
    */
  @js.native
  @Factory
  trait StartTimecode extends js.Object {
    var Timecode: js.UndefOr[__string]
  }

  /**
    * Settings for the action to activate a static image.
    */
  @js.native
  @Factory
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

  /**
    * Settings for the action to deactivate the image in a specific layer.
    */
  @js.native
  @Factory
  trait StaticImageDeactivateScheduleActionSettings extends js.Object {
    var FadeOut: js.UndefOr[__integerMin0]
    var Layer: js.UndefOr[__integerMin0Max7]
  }

  /**
    * Static Key Settings
    */
  @js.native
  @Factory
  trait StaticKeySettings extends js.Object {
    var StaticKeyValue: __stringMin32Max32
    var KeyProviderServer: js.UndefOr[InputLocation]
  }

  /**
    * Placeholder documentation for StopChannelRequest
    */
  @js.native
  @Factory
  trait StopChannelRequest extends js.Object {
    var ChannelId: __string
  }

  /**
    * Placeholder documentation for StopChannelResponse
    */
  @js.native
  @Factory
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

  /**
    * Placeholder documentation for StopMultiplexRequest
    */
  @js.native
  @Factory
  trait StopMultiplexRequest extends js.Object {
    var MultiplexId: __string
  }

  /**
    * Placeholder documentation for StopMultiplexResponse
    */
  @js.native
  @Factory
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

  /**
    * Settings to identify the end of the clip.
    */
  @js.native
  @Factory
  trait StopTimecode extends js.Object {
    var LastFrameClippingBehavior: js.UndefOr[LastFrameClippingBehavior]
    var Timecode: js.UndefOr[__string]
  }

  /**
    * Teletext Destination Settings
    */
  @js.native
  @Factory
  trait TeletextDestinationSettings extends js.Object {}

  /**
    * Teletext Source Settings
    */
  @js.native
  @Factory
  trait TeletextSourceSettings extends js.Object {
    var PageNumber: js.UndefOr[__string]
  }

  /**
    * Timecode Config
    */
  @js.native
  @Factory
  trait TimecodeConfig extends js.Object {
    var Source: TimecodeConfigSource
    var SyncThreshold: js.UndefOr[__integerMin1Max1000000]
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
  @Factory
  trait TtmlDestinationSettings extends js.Object {
    var StyleControl: js.UndefOr[TtmlDestinationStyleControl]
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
  @Factory
  trait UdpContainerSettings extends js.Object {
    var M2tsSettings: js.UndefOr[M2tsSettings]
  }

  /**
    * Udp Group Settings
    */
  @js.native
  @Factory
  trait UdpGroupSettings extends js.Object {
    var InputLossAction: js.UndefOr[InputLossActionForUdpOut]
    var TimedMetadataId3Frame: js.UndefOr[UdpTimedMetadataId3Frame]
    var TimedMetadataId3Period: js.UndefOr[__integerMin0]
  }

  /**
    * Udp Output Settings
    */
  @js.native
  @Factory
  trait UdpOutputSettings extends js.Object {
    var ContainerSettings: UdpContainerSettings
    var Destination: OutputLocationRef
    var BufferMsec: js.UndefOr[__integerMin0Max10000]
    var FecOutputSettings: js.UndefOr[FecOutputSettings]
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
  @Factory
  trait UpdateChannelClassRequest extends js.Object {
    var ChannelClass: ChannelClass
    var ChannelId: __string
    var Destinations: js.UndefOr[__listOfOutputDestination]
  }

  /**
    * Placeholder documentation for UpdateChannelClassResponse
    */
  @js.native
  @Factory
  trait UpdateChannelClassResponse extends js.Object {
    var Channel: js.UndefOr[Channel]
  }

  /**
    * A request to update a channel.
    */
  @js.native
  @Factory
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

  /**
    * Placeholder documentation for UpdateChannelResponse
    */
  @js.native
  @Factory
  trait UpdateChannelResponse extends js.Object {
    var Channel: js.UndefOr[Channel]
  }

  /**
    * A request to update an input.
    */
  @js.native
  @Factory
  trait UpdateInputRequest extends js.Object {
    var InputId: __string
    var Destinations: js.UndefOr[__listOfInputDestinationRequest]
    var InputSecurityGroups: js.UndefOr[__listOf__string]
    var MediaConnectFlows: js.UndefOr[__listOfMediaConnectFlowRequest]
    var Name: js.UndefOr[__string]
    var RoleArn: js.UndefOr[__string]
    var Sources: js.UndefOr[__listOfInputSourceRequest]
  }

  /**
    * Placeholder documentation for UpdateInputResponse
    */
  @js.native
  @Factory
  trait UpdateInputResponse extends js.Object {
    var Input: js.UndefOr[Input]
  }

  /**
    * The request to update some combination of the Input Security Group name and the IPv4 CIDRs the Input Security Group should allow.
    */
  @js.native
  @Factory
  trait UpdateInputSecurityGroupRequest extends js.Object {
    var InputSecurityGroupId: __string
    var Tags: js.UndefOr[Tags]
    var WhitelistRules: js.UndefOr[__listOfInputWhitelistRuleCidr]
  }

  /**
    * Placeholder documentation for UpdateInputSecurityGroupResponse
    */
  @js.native
  @Factory
  trait UpdateInputSecurityGroupResponse extends js.Object {
    var SecurityGroup: js.UndefOr[InputSecurityGroup]
  }

  /**
    * A request to update a program in a multiplex.
    */
  @js.native
  @Factory
  trait UpdateMultiplexProgramRequest extends js.Object {
    var MultiplexId: __string
    var ProgramName: __string
    var MultiplexProgramSettings: js.UndefOr[MultiplexProgramSettings]
  }

  /**
    * Placeholder documentation for UpdateMultiplexProgramResponse
    */
  @js.native
  @Factory
  trait UpdateMultiplexProgramResponse extends js.Object {
    var MultiplexProgram: js.UndefOr[MultiplexProgram]
  }

  /**
    * A request to update a multiplex.
    */
  @js.native
  @Factory
  trait UpdateMultiplexRequest extends js.Object {
    var MultiplexId: __string
    var MultiplexSettings: js.UndefOr[MultiplexSettings]
    var Name: js.UndefOr[__string]
  }

  /**
    * Placeholder documentation for UpdateMultiplexResponse
    */
  @js.native
  @Factory
  trait UpdateMultiplexResponse extends js.Object {
    var Multiplex: js.UndefOr[Multiplex]
  }

  /**
    * Request to update a reservation
    */
  @js.native
  @Factory
  trait UpdateReservationRequest extends js.Object {
    var ReservationId: __string
    var Name: js.UndefOr[__string]
  }

  /**
    * Placeholder documentation for UpdateReservationResponse
    */
  @js.native
  @Factory
  trait UpdateReservationResponse extends js.Object {
    var Reservation: js.UndefOr[Reservation]
  }

  /**
    * Video Codec Settings
    */
  @js.native
  @Factory
  trait VideoCodecSettings extends js.Object {
    var FrameCaptureSettings: js.UndefOr[FrameCaptureSettings]
    var H264Settings: js.UndefOr[H264Settings]
    var H265Settings: js.UndefOr[H265Settings]
  }

  /**
    * Video settings for this stream.
    */
  @js.native
  @Factory
  trait VideoDescription extends js.Object {
    var Name: __string
    var CodecSettings: js.UndefOr[VideoCodecSettings]
    var Height: js.UndefOr[__integer]
    var RespondToAfd: js.UndefOr[VideoDescriptionRespondToAfd]
    var ScalingBehavior: js.UndefOr[VideoDescriptionScalingBehavior]
    var Sharpness: js.UndefOr[__integerMin0Max100]
    var Width: js.UndefOr[__integer]
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
  @Factory
  trait VideoSelector extends js.Object {
    var ColorSpace: js.UndefOr[VideoSelectorColorSpace]
    var ColorSpaceUsage: js.UndefOr[VideoSelectorColorSpaceUsage]
    var SelectorSettings: js.UndefOr[VideoSelectorSettings]
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
  @Factory
  trait VideoSelectorPid extends js.Object {
    var Pid: js.UndefOr[__integerMin0Max8191]
  }

  /**
    * Video Selector Program Id
    */
  @js.native
  @Factory
  trait VideoSelectorProgramId extends js.Object {
    var ProgramId: js.UndefOr[__integerMin0Max65536]
  }

  /**
    * Video Selector Settings
    */
  @js.native
  @Factory
  trait VideoSelectorSettings extends js.Object {
    var VideoSelectorPid: js.UndefOr[VideoSelectorPid]
    var VideoSelectorProgramId: js.UndefOr[VideoSelectorProgramId]
  }

  /**
    * Webvtt Destination Settings
    */
  @js.native
  @Factory
  trait WebvttDestinationSettings extends js.Object {}
}
