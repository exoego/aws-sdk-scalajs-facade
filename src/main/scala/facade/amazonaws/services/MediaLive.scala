package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
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
  type InputState                                    = String
  type InputType                                     = String
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
  type __integerMin0Max1099511627775                 = Double
  type __integerMin0Max128                           = Int
  type __integerMin0Max15                            = Int
  type __integerMin0Max255                           = Int
  type __integerMin0Max30                            = Int
  type __integerMin0Max3600                          = Int
  type __integerMin0Max4294967295                    = Double
  type __integerMin0Max500                           = Int
  type __integerMin0Max600                           = Int
  type __integerMin0Max65535                         = Int
  type __integerMin0Max65536                         = Int
  type __integerMin0Max7                             = Int
  type __integerMin0Max8191                          = Int
  type __integerMin0Max8589934591                    = Double
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
  type __listOfPipelinePauseStateSettings            = js.Array[PipelinePauseStateSettings]
  type __listOfReservation                           = js.Array[Reservation]
  type __listOfScheduleAction                        = js.Array[ScheduleAction]
  type __listOfScte35Descriptor                      = js.Array[Scte35Descriptor]
  type __listOfVideoDescription                      = js.Array[VideoDescription]
  type __listOf__string                              = js.Array[__string]
  type __string                                      = String
  type __stringMax32                                 = String
  type __stringMin1                                  = String
  type __stringMin1Max255                            = String
  type __stringMin1Max256                            = String
  type __stringMin32Max32                            = String
  type __stringMin34Max34                            = String
  type __stringMin3Max3                              = String
  type __stringMin6Max6                              = String
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

    val values = IndexedSeq(AD_RECEIVER_MIX, CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0, CODING_MODE_5_1)
  }

  /**
    * Aac Input Type
    */
  object AacInputTypeEnum {
    val BROADCASTER_MIXED_AD = "BROADCASTER_MIXED_AD"
    val NORMAL               = "NORMAL"

    val values = IndexedSeq(BROADCASTER_MIXED_AD, NORMAL)
  }

  /**
    * Aac Profile
    */
  object AacProfileEnum {
    val HEV1 = "HEV1"
    val HEV2 = "HEV2"
    val LC   = "LC"

    val values = IndexedSeq(HEV1, HEV2, LC)
  }

  /**
    * Aac Rate Control Mode
    */
  object AacRateControlModeEnum {
    val CBR = "CBR"
    val VBR = "VBR"

    val values = IndexedSeq(CBR, VBR)
  }

  /**
    * Aac Raw Format
    */
  object AacRawFormatEnum {
    val LATM_LOAS = "LATM_LOAS"
    val NONE      = "NONE"

    val values = IndexedSeq(LATM_LOAS, NONE)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Bitrate" -> Bitrate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CodingMode" -> CodingMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputType" -> InputType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Profile" -> Profile.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RateControlMode" -> RateControlMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RawFormat" -> RawFormat.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SampleRate" -> SampleRate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Spec" -> Spec.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VbrQuality" -> VbrQuality.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AacSettings]
    }
  }

  /**
    * Aac Spec
    */
  object AacSpecEnum {
    val MPEG2 = "MPEG2"
    val MPEG4 = "MPEG4"

    val values = IndexedSeq(MPEG2, MPEG4)
  }

  /**
    * Aac Vbr Quality
    */
  object AacVbrQualityEnum {
    val HIGH        = "HIGH"
    val LOW         = "LOW"
    val MEDIUM_HIGH = "MEDIUM_HIGH"
    val MEDIUM_LOW  = "MEDIUM_LOW"

    val values = IndexedSeq(HIGH, LOW, MEDIUM_HIGH, MEDIUM_LOW)
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

    val values = IndexedSeq(
      COMMENTARY,
      COMPLETE_MAIN,
      DIALOGUE,
      EMERGENCY,
      HEARING_IMPAIRED,
      MUSIC_AND_EFFECTS,
      VISUALLY_IMPAIRED,
      VOICE_OVER
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

    val values = IndexedSeq(CODING_MODE_1_0, CODING_MODE_1_1, CODING_MODE_2_0, CODING_MODE_3_2_LFE)
  }

  /**
    * Ac3 Drc Profile
    */
  object Ac3DrcProfileEnum {
    val FILM_STANDARD = "FILM_STANDARD"
    val NONE          = "NONE"

    val values = IndexedSeq(FILM_STANDARD, NONE)
  }

  /**
    * Ac3 Lfe Filter
    */
  object Ac3LfeFilterEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
    * Ac3 Metadata Control
    */
  object Ac3MetadataControlEnum {
    val FOLLOW_INPUT   = "FOLLOW_INPUT"
    val USE_CONFIGURED = "USE_CONFIGURED"

    val values = IndexedSeq(FOLLOW_INPUT, USE_CONFIGURED)
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
    def apply(
        Bitrate: js.UndefOr[__double] = js.undefined,
        BitstreamMode: js.UndefOr[Ac3BitstreamMode] = js.undefined,
        CodingMode: js.UndefOr[Ac3CodingMode] = js.undefined,
        Dialnorm: js.UndefOr[__integerMin1Max31] = js.undefined,
        DrcProfile: js.UndefOr[Ac3DrcProfile] = js.undefined,
        LfeFilter: js.UndefOr[Ac3LfeFilter] = js.undefined,
        MetadataControl: js.UndefOr[Ac3MetadataControl] = js.undefined
    ): Ac3Settings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bitrate" -> Bitrate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BitstreamMode" -> BitstreamMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CodingMode" -> CodingMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Dialnorm" -> Dialnorm.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DrcProfile" -> DrcProfile.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LfeFilter" -> LfeFilter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MetadataControl" -> MetadataControl.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Ac3Settings]
    }
  }

  /**
    * Afd Signaling
    */
  object AfdSignalingEnum {
    val AUTO  = "AUTO"
    val FIXED = "FIXED"
    val NONE  = "NONE"

    val values = IndexedSeq(AUTO, FIXED, NONE)
  }

  /**
    * Archive Container Settings
    */
  @js.native
  trait ArchiveContainerSettings extends js.Object {
    var M2tsSettings: js.UndefOr[M2tsSettings]
  }

  object ArchiveContainerSettings {
    def apply(
        M2tsSettings: js.UndefOr[M2tsSettings] = js.undefined
    ): ArchiveContainerSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "M2tsSettings" -> M2tsSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ArchiveContainerSettings]
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
    def apply(
        Destination: OutputLocationRef,
        RolloverInterval: js.UndefOr[__integerMin1] = js.undefined
    ): ArchiveGroupSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Destination" -> Destination.asInstanceOf[js.Any],
        "RolloverInterval" -> RolloverInterval.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ArchiveGroupSettings]
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
    def apply(
        ContainerSettings: ArchiveContainerSettings,
        Extension: js.UndefOr[__string] = js.undefined,
        NameModifier: js.UndefOr[__string] = js.undefined
    ): ArchiveOutputSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContainerSettings" -> ContainerSettings.asInstanceOf[js.Any],
        "Extension" -> Extension.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NameModifier" -> NameModifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ArchiveOutputSettings]
    }
  }

  /**
    * Arib Destination Settings
    */
  @js.native
  trait AribDestinationSettings extends js.Object {}

  object AribDestinationSettings {
    def apply(
        ): AribDestinationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AribDestinationSettings]
    }
  }

  /**
    * Arib Source Settings
    */
  @js.native
  trait AribSourceSettings extends js.Object {}

  object AribSourceSettings {
    def apply(
        ): AribSourceSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AribSourceSettings]
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
    def apply(
        InputChannelLevels: __listOfInputChannelLevel,
        OutputChannel: __integerMin0Max7
    ): AudioChannelMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputChannelLevels" -> InputChannelLevels.asInstanceOf[js.Any],
        "OutputChannel"      -> OutputChannel.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AudioChannelMapping]
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
    def apply(
        AacSettings: js.UndefOr[AacSettings] = js.undefined,
        Ac3Settings: js.UndefOr[Ac3Settings] = js.undefined,
        Eac3Settings: js.UndefOr[Eac3Settings] = js.undefined,
        Mp2Settings: js.UndefOr[Mp2Settings] = js.undefined,
        PassThroughSettings: js.UndefOr[PassThroughSettings] = js.undefined
    ): AudioCodecSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AacSettings" -> AacSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Ac3Settings" -> Ac3Settings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Eac3Settings" -> Eac3Settings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Mp2Settings" -> Mp2Settings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PassThroughSettings" -> PassThroughSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AudioCodecSettings]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AudioSelectorName" -> AudioSelectorName.asInstanceOf[js.Any],
        "Name"              -> Name.asInstanceOf[js.Any],
        "AudioNormalizationSettings" -> AudioNormalizationSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AudioType" -> AudioType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AudioTypeControl" -> AudioTypeControl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CodecSettings" -> CodecSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LanguageCode" -> LanguageCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LanguageCodeControl" -> LanguageCodeControl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RemixSettings" -> RemixSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StreamName" -> StreamName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AudioDescription]
    }
  }

  /**
    * Audio Description Audio Type Control
    */
  object AudioDescriptionAudioTypeControlEnum {
    val FOLLOW_INPUT   = "FOLLOW_INPUT"
    val USE_CONFIGURED = "USE_CONFIGURED"

    val values = IndexedSeq(FOLLOW_INPUT, USE_CONFIGURED)
  }

  /**
    * Audio Description Language Code Control
    */
  object AudioDescriptionLanguageCodeControlEnum {
    val FOLLOW_INPUT   = "FOLLOW_INPUT"
    val USE_CONFIGURED = "USE_CONFIGURED"

    val values = IndexedSeq(FOLLOW_INPUT, USE_CONFIGURED)
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
    def apply(
        LanguageCode: __string,
        LanguageSelectionPolicy: js.UndefOr[AudioLanguageSelectionPolicy] = js.undefined
    ): AudioLanguageSelection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "LanguageSelectionPolicy" -> LanguageSelectionPolicy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AudioLanguageSelection]
    }
  }

  /**
    * Audio Language Selection Policy
    */
  object AudioLanguageSelectionPolicyEnum {
    val LOOSE  = "LOOSE"
    val STRICT = "STRICT"

    val values = IndexedSeq(LOOSE, STRICT)
  }

  /**
    * Audio Normalization Algorithm
    */
  object AudioNormalizationAlgorithmEnum {
    val ITU_1770_1 = "ITU_1770_1"
    val ITU_1770_2 = "ITU_1770_2"

    val values = IndexedSeq(ITU_1770_1, ITU_1770_2)
  }

  /**
    * Audio Normalization Algorithm Control
    */
  object AudioNormalizationAlgorithmControlEnum {
    val CORRECT_AUDIO = "CORRECT_AUDIO"

    val values = IndexedSeq(CORRECT_AUDIO)
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
    def apply(
        Algorithm: js.UndefOr[AudioNormalizationAlgorithm] = js.undefined,
        AlgorithmControl: js.UndefOr[AudioNormalizationAlgorithmControl] = js.undefined,
        TargetLkfs: js.UndefOr[__doubleMinNegative59Max0] = js.undefined
    ): AudioNormalizationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Algorithm" -> Algorithm.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AlgorithmControl" -> AlgorithmControl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetLkfs" -> TargetLkfs.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AudioNormalizationSettings]
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
    def apply(
        AudioGroupId: js.UndefOr[__string] = js.undefined,
        AudioOnlyImage: js.UndefOr[InputLocation] = js.undefined,
        AudioTrackType: js.UndefOr[AudioOnlyHlsTrackType] = js.undefined
    ): AudioOnlyHlsSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AudioGroupId" -> AudioGroupId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AudioOnlyImage" -> AudioOnlyImage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AudioTrackType" -> AudioTrackType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AudioOnlyHlsSettings]
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

    val values = IndexedSeq(
      ALTERNATE_AUDIO_AUTO_SELECT,
      ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT,
      ALTERNATE_AUDIO_NOT_AUTO_SELECT,
      AUDIO_ONLY_VARIANT_STREAM
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
    def apply(
        Pid: __integerMin0Max8191
    ): AudioPidSelection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Pid" -> Pid.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AudioPidSelection]
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
    def apply(
        Name: __stringMin1,
        SelectorSettings: js.UndefOr[AudioSelectorSettings] = js.undefined
    ): AudioSelector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "SelectorSettings" -> SelectorSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AudioSelector]
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
    def apply(
        AudioLanguageSelection: js.UndefOr[AudioLanguageSelection] = js.undefined,
        AudioPidSelection: js.UndefOr[AudioPidSelection] = js.undefined
    ): AudioSelectorSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AudioLanguageSelection" -> AudioLanguageSelection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AudioPidSelection" -> AudioPidSelection.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AudioSelectorSettings]
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

    val values = IndexedSeq(CLEAN_EFFECTS, HEARING_IMPAIRED, UNDEFINED, VISUAL_IMPAIRED_COMMENTARY)
  }

  /**
    * Authentication Scheme
    */
  object AuthenticationSchemeEnum {
    val AKAMAI = "AKAMAI"
    val COMMON = "COMMON"

    val values = IndexedSeq(AKAMAI, COMMON)
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
    def apply(
        AvailBlankingImage: js.UndefOr[InputLocation] = js.undefined,
        State: js.UndefOr[AvailBlankingState] = js.undefined
    ): AvailBlanking = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailBlankingImage" -> AvailBlankingImage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailBlanking]
    }
  }

  /**
    * Avail Blanking State
    */
  object AvailBlankingStateEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
    * Avail Configuration
    */
  @js.native
  trait AvailConfiguration extends js.Object {
    var AvailSettings: js.UndefOr[AvailSettings]
  }

  object AvailConfiguration {
    def apply(
        AvailSettings: js.UndefOr[AvailSettings] = js.undefined
    ): AvailConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailSettings" -> AvailSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailConfiguration]
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
    def apply(
        Scte35SpliceInsert: js.UndefOr[Scte35SpliceInsert] = js.undefined,
        Scte35TimeSignalApos: js.UndefOr[Scte35TimeSignalApos] = js.undefined
    ): AvailSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Scte35SpliceInsert" -> Scte35SpliceInsert.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Scte35TimeSignalApos" -> Scte35TimeSignalApos.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailSettings]
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
    def apply(
        ScheduleActions: __listOfScheduleAction
    ): BatchScheduleActionCreateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScheduleActions" -> ScheduleActions.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchScheduleActionCreateRequest]
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
    def apply(
        ScheduleActions: __listOfScheduleAction
    ): BatchScheduleActionCreateResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScheduleActions" -> ScheduleActions.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchScheduleActionCreateResult]
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
    def apply(
        ActionNames: __listOf__string
    ): BatchScheduleActionDeleteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActionNames" -> ActionNames.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchScheduleActionDeleteRequest]
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
    def apply(
        ScheduleActions: __listOfScheduleAction
    ): BatchScheduleActionDeleteResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScheduleActions" -> ScheduleActions.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchScheduleActionDeleteResult]
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
    def apply(
        ChannelId: __string,
        Creates: js.UndefOr[BatchScheduleActionCreateRequest] = js.undefined,
        Deletes: js.UndefOr[BatchScheduleActionDeleteRequest] = js.undefined
    ): BatchUpdateScheduleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChannelId" -> ChannelId.asInstanceOf[js.Any],
        "Creates" -> Creates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Deletes" -> Deletes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUpdateScheduleRequest]
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
    def apply(
        Creates: js.UndefOr[BatchScheduleActionCreateResult] = js.undefined,
        Deletes: js.UndefOr[BatchScheduleActionDeleteResult] = js.undefined
    ): BatchUpdateScheduleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Creates" -> Creates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Deletes" -> Deletes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchUpdateScheduleResponse]
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
    def apply(
        BlackoutSlateImage: js.UndefOr[InputLocation] = js.undefined,
        NetworkEndBlackout: js.UndefOr[BlackoutSlateNetworkEndBlackout] = js.undefined,
        NetworkEndBlackoutImage: js.UndefOr[InputLocation] = js.undefined,
        NetworkId: js.UndefOr[__stringMin34Max34] = js.undefined,
        State: js.UndefOr[BlackoutSlateState] = js.undefined
    ): BlackoutSlate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BlackoutSlateImage" -> BlackoutSlateImage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NetworkEndBlackout" -> NetworkEndBlackout.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NetworkEndBlackoutImage" -> NetworkEndBlackoutImage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NetworkId" -> NetworkId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BlackoutSlate]
    }
  }

  /**
    * Blackout Slate Network End Blackout
    */
  object BlackoutSlateNetworkEndBlackoutEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
    * Blackout Slate State
    */
  object BlackoutSlateStateEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
    * Burn In Alignment
    */
  object BurnInAlignmentEnum {
    val CENTERED = "CENTERED"
    val LEFT     = "LEFT"
    val SMART    = "SMART"

    val values = IndexedSeq(CENTERED, LEFT, SMART)
  }

  /**
    * Burn In Background Color
    */
  object BurnInBackgroundColorEnum {
    val BLACK = "BLACK"
    val NONE  = "NONE"
    val WHITE = "WHITE"

    val values = IndexedSeq(BLACK, NONE, WHITE)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Alignment" -> Alignment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackgroundColor" -> BackgroundColor.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackgroundOpacity" -> BackgroundOpacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Font" -> Font.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FontColor" -> FontColor.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FontOpacity" -> FontOpacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FontResolution" -> FontResolution.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FontSize" -> FontSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutlineColor" -> OutlineColor.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutlineSize" -> OutlineSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ShadowColor" -> ShadowColor.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ShadowOpacity" -> ShadowOpacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ShadowXOffset" -> ShadowXOffset.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ShadowYOffset" -> ShadowYOffset.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TeletextGridControl" -> TeletextGridControl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "XPosition" -> XPosition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "YPosition" -> YPosition.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BurnInDestinationSettings]
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

    val values = IndexedSeq(BLACK, BLUE, GREEN, RED, WHITE, YELLOW)
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

    val values = IndexedSeq(BLACK, BLUE, GREEN, RED, WHITE, YELLOW)
  }

  /**
    * Burn In Shadow Color
    */
  object BurnInShadowColorEnum {
    val BLACK = "BLACK"
    val NONE  = "NONE"
    val WHITE = "WHITE"

    val values = IndexedSeq(BLACK, NONE, WHITE)
  }

  /**
    * Burn In Teletext Grid Control
    */
  object BurnInTeletextGridControlEnum {
    val FIXED  = "FIXED"
    val SCALED = "SCALED"

    val values = IndexedSeq(FIXED, SCALED)
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
    def apply(
        CaptionSelectorName: __string,
        Name: __string,
        DestinationSettings: js.UndefOr[CaptionDestinationSettings] = js.undefined,
        LanguageCode: js.UndefOr[__string] = js.undefined,
        LanguageDescription: js.UndefOr[__string] = js.undefined
    ): CaptionDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CaptionSelectorName" -> CaptionSelectorName.asInstanceOf[js.Any],
        "Name"                -> Name.asInstanceOf[js.Any],
        "DestinationSettings" -> DestinationSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LanguageCode" -> LanguageCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LanguageDescription" -> LanguageDescription.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CaptionDescription]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AribDestinationSettings" -> AribDestinationSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BurnInDestinationSettings" -> BurnInDestinationSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DvbSubDestinationSettings" -> DvbSubDestinationSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmbeddedDestinationSettings" -> EmbeddedDestinationSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmbeddedPlusScte20DestinationSettings" -> EmbeddedPlusScte20DestinationSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RtmpCaptionInfoDestinationSettings" -> RtmpCaptionInfoDestinationSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Scte20PlusEmbeddedDestinationSettings" -> Scte20PlusEmbeddedDestinationSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Scte27DestinationSettings" -> Scte27DestinationSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SmpteTtDestinationSettings" -> SmpteTtDestinationSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TeletextDestinationSettings" -> TeletextDestinationSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TtmlDestinationSettings" -> TtmlDestinationSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WebvttDestinationSettings" -> WebvttDestinationSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CaptionDestinationSettings]
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
    def apply(
        CaptionChannel: __integerMin1Max4,
        LanguageCode: __stringMin3Max3,
        LanguageDescription: __stringMin1
    ): CaptionLanguageMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CaptionChannel"      -> CaptionChannel.asInstanceOf[js.Any],
        "LanguageCode"        -> LanguageCode.asInstanceOf[js.Any],
        "LanguageDescription" -> LanguageDescription.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CaptionLanguageMapping]
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
    def apply(
        Name: __stringMin1,
        LanguageCode: js.UndefOr[__string] = js.undefined,
        SelectorSettings: js.UndefOr[CaptionSelectorSettings] = js.undefined
    ): CaptionSelector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "LanguageCode" -> LanguageCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SelectorSettings" -> SelectorSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CaptionSelector]
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
    def apply(
        AribSourceSettings: js.UndefOr[AribSourceSettings] = js.undefined,
        DvbSubSourceSettings: js.UndefOr[DvbSubSourceSettings] = js.undefined,
        EmbeddedSourceSettings: js.UndefOr[EmbeddedSourceSettings] = js.undefined,
        Scte20SourceSettings: js.UndefOr[Scte20SourceSettings] = js.undefined,
        Scte27SourceSettings: js.UndefOr[Scte27SourceSettings] = js.undefined,
        TeletextSourceSettings: js.UndefOr[TeletextSourceSettings] = js.undefined
    ): CaptionSelectorSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AribSourceSettings" -> AribSourceSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DvbSubSourceSettings" -> DvbSubSourceSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EmbeddedSourceSettings" -> EmbeddedSourceSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Scte20SourceSettings" -> Scte20SourceSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Scte27SourceSettings" -> Scte27SourceSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TeletextSourceSettings" -> TeletextSourceSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CaptionSelectorSettings]
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
    var PipelinesRunningCount: js.UndefOr[__integer]
    var RoleArn: js.UndefOr[__string]
    var State: js.UndefOr[ChannelState]
    var Tags: js.UndefOr[Tags]
  }

  object Channel {
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
        PipelinesRunningCount: js.UndefOr[__integer] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ChannelState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): Channel = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChannelClass" -> ChannelClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Destinations" -> Destinations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EgressEndpoints" -> EgressEndpoints.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EncoderSettings" -> EncoderSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputAttachments" -> InputAttachments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputSpecification" -> InputSpecification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogLevel" -> LogLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PipelinesRunningCount" -> PipelinesRunningCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Channel]
    }
  }

  /**
    * A standard channel has two encoding pipelines and a single pipeline channel only has one.
    */
  object ChannelClassEnum {
    val STANDARD        = "STANDARD"
    val SINGLE_PIPELINE = "SINGLE_PIPELINE"

    val values = IndexedSeq(STANDARD, SINGLE_PIPELINE)
  }

  /**
    * Placeholder documentation for ChannelEgressEndpoint
    */
  @js.native
  trait ChannelEgressEndpoint extends js.Object {
    var SourceIp: js.UndefOr[__string]
  }

  object ChannelEgressEndpoint {
    def apply(
        SourceIp: js.UndefOr[__string] = js.undefined
    ): ChannelEgressEndpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceIp" -> SourceIp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChannelEgressEndpoint]
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

    val values = IndexedSeq(CREATING, CREATE_FAILED, IDLE, STARTING, RUNNING, RECOVERING, STOPPING, DELETING, DELETED)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChannelClass" -> ChannelClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Destinations" -> Destinations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EgressEndpoints" -> EgressEndpoints.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputAttachments" -> InputAttachments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputSpecification" -> InputSpecification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogLevel" -> LogLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PipelinesRunningCount" -> PipelinesRunningCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChannelSummary]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ChannelClass" -> ChannelClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Destinations" -> Destinations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EncoderSettings" -> EncoderSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputAttachments" -> InputAttachments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputSpecification" -> InputSpecification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogLevel" -> LogLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestId" -> RequestId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Reserved" -> Reserved.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateChannelRequest]
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
    def apply(
        Channel: js.UndefOr[Channel] = js.undefined
    ): CreateChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Channel" -> Channel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateChannelResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Destinations" -> Destinations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputSecurityGroups" -> InputSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MediaConnectFlows" -> MediaConnectFlows.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestId" -> RequestId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Sources" -> Sources.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Vpc" -> Vpc.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInputRequest]
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
    def apply(
        Input: js.UndefOr[Input] = js.undefined
    ): CreateInputResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Input" -> Input.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInputResponse]
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
    def apply(
        Tags: js.UndefOr[Tags] = js.undefined,
        WhitelistRules: js.UndefOr[__listOfInputWhitelistRuleCidr] = js.undefined
    ): CreateInputSecurityGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WhitelistRules" -> WhitelistRules.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInputSecurityGroupRequest]
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
    def apply(
        SecurityGroup: js.UndefOr[InputSecurityGroup] = js.undefined
    ): CreateInputSecurityGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecurityGroup" -> SecurityGroup.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInputSecurityGroupResponse]
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
    def apply(
        ResourceArn: __string,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagsRequest]
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
    def apply(
        ChannelId: __string
    ): DeleteChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChannelId" -> ChannelId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteChannelRequest]
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
    var PipelinesRunningCount: js.UndefOr[__integer]
    var RoleArn: js.UndefOr[__string]
    var State: js.UndefOr[ChannelState]
    var Tags: js.UndefOr[Tags]
  }

  object DeleteChannelResponse {
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
        PipelinesRunningCount: js.UndefOr[__integer] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ChannelState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DeleteChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChannelClass" -> ChannelClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Destinations" -> Destinations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EgressEndpoints" -> EgressEndpoints.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EncoderSettings" -> EncoderSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputAttachments" -> InputAttachments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputSpecification" -> InputSpecification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogLevel" -> LogLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PipelinesRunningCount" -> PipelinesRunningCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteChannelResponse]
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
    def apply(
        InputId: __string
    ): DeleteInputRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputId" -> InputId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInputRequest]
    }
  }

  /**
    * Placeholder documentation for DeleteInputResponse
    */
  @js.native
  trait DeleteInputResponse extends js.Object {}

  object DeleteInputResponse {
    def apply(
        ): DeleteInputResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInputResponse]
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
    def apply(
        InputSecurityGroupId: __string
    ): DeleteInputSecurityGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputSecurityGroupId" -> InputSecurityGroupId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInputSecurityGroupRequest]
    }
  }

  /**
    * Placeholder documentation for DeleteInputSecurityGroupResponse
    */
  @js.native
  trait DeleteInputSecurityGroupResponse extends js.Object {}

  object DeleteInputSecurityGroupResponse {
    def apply(
        ): DeleteInputSecurityGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInputSecurityGroupResponse]
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
    def apply(
        ReservationId: __string
    ): DeleteReservationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservationId" -> ReservationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReservationRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Count" -> Count.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CurrencyCode" -> CurrencyCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Duration" -> Duration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DurationUnits" -> DurationUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "End" -> End.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FixedPrice" -> FixedPrice.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingDescription" -> OfferingDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingId" -> OfferingId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingType" -> OfferingType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Region" -> Region.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReservationId" -> ReservationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceSpecification" -> ResourceSpecification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Start" -> Start.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UsagePrice" -> UsagePrice.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReservationResponse]
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
    def apply(
        ResourceArn: __string,
        TagKeys: __listOf__string
    ): DeleteTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsRequest]
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
    def apply(
        ChannelId: __string
    ): DescribeChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChannelId" -> ChannelId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeChannelRequest]
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
    var PipelinesRunningCount: js.UndefOr[__integer]
    var RoleArn: js.UndefOr[__string]
    var State: js.UndefOr[ChannelState]
    var Tags: js.UndefOr[Tags]
  }

  object DescribeChannelResponse {
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
        PipelinesRunningCount: js.UndefOr[__integer] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ChannelState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DescribeChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChannelClass" -> ChannelClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Destinations" -> Destinations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EgressEndpoints" -> EgressEndpoints.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EncoderSettings" -> EncoderSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputAttachments" -> InputAttachments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputSpecification" -> InputSpecification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogLevel" -> LogLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PipelinesRunningCount" -> PipelinesRunningCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeChannelResponse]
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
    def apply(
        InputId: __string
    ): DescribeInputRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputId" -> InputId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInputRequest]
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
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        AttachedChannels: js.UndefOr[__listOf__string] = js.undefined,
        Destinations: js.UndefOr[__listOfInputDestination] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        InputClass: js.UndefOr[InputClass] = js.undefined,
        MediaConnectFlows: js.UndefOr[__listOfMediaConnectFlow] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        SecurityGroups: js.UndefOr[__listOf__string] = js.undefined,
        Sources: js.UndefOr[__listOfInputSource] = js.undefined,
        State: js.UndefOr[InputState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Type: js.UndefOr[InputType] = js.undefined
    ): DescribeInputResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttachedChannels" -> AttachedChannels.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Destinations" -> Destinations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputClass" -> InputClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MediaConnectFlows" -> MediaConnectFlows.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityGroups" -> SecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Sources" -> Sources.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInputResponse]
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
    def apply(
        InputSecurityGroupId: __string
    ): DescribeInputSecurityGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputSecurityGroupId" -> InputSecurityGroupId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInputSecurityGroupRequest]
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
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Inputs: js.UndefOr[__listOf__string] = js.undefined,
        State: js.UndefOr[InputSecurityGroupState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        WhitelistRules: js.UndefOr[__listOfInputWhitelistRule] = js.undefined
    ): DescribeInputSecurityGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Inputs" -> Inputs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WhitelistRules" -> WhitelistRules.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInputSecurityGroupResponse]
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
    def apply(
        OfferingId: __string
    ): DescribeOfferingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OfferingId" -> OfferingId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOfferingRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CurrencyCode" -> CurrencyCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Duration" -> Duration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DurationUnits" -> DurationUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FixedPrice" -> FixedPrice.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingDescription" -> OfferingDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingId" -> OfferingId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingType" -> OfferingType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Region" -> Region.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceSpecification" -> ResourceSpecification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UsagePrice" -> UsagePrice.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOfferingResponse]
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
    def apply(
        ReservationId: __string
    ): DescribeReservationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservationId" -> ReservationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservationRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Count" -> Count.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CurrencyCode" -> CurrencyCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Duration" -> Duration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DurationUnits" -> DurationUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "End" -> End.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FixedPrice" -> FixedPrice.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingDescription" -> OfferingDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingId" -> OfferingId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingType" -> OfferingType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Region" -> Region.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReservationId" -> ReservationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceSpecification" -> ResourceSpecification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Start" -> Start.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UsagePrice" -> UsagePrice.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservationResponse]
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
    def apply(
        ChannelId: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): DescribeScheduleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChannelId" -> ChannelId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScheduleRequest]
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
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        ScheduleActions: js.UndefOr[__listOfScheduleAction] = js.undefined
    ): DescribeScheduleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScheduleActions" -> ScheduleActions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScheduleResponse]
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
    def apply(
        NetworkId: __integerMin0Max65536,
        NetworkName: __stringMin1Max256,
        RepInterval: js.UndefOr[__integerMin25Max10000] = js.undefined
    ): DvbNitSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NetworkId"   -> NetworkId.asInstanceOf[js.Any],
        "NetworkName" -> NetworkName.asInstanceOf[js.Any],
        "RepInterval" -> RepInterval.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DvbNitSettings]
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

    val values = IndexedSeq(SDT_FOLLOW, SDT_FOLLOW_IF_PRESENT, SDT_MANUAL, SDT_NONE)
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
    def apply(
        OutputSdt: js.UndefOr[DvbSdtOutputSdt] = js.undefined,
        RepInterval: js.UndefOr[__integerMin25Max2000] = js.undefined,
        ServiceName: js.UndefOr[__stringMin1Max256] = js.undefined,
        ServiceProviderName: js.UndefOr[__stringMin1Max256] = js.undefined
    ): DvbSdtSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OutputSdt" -> OutputSdt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RepInterval" -> RepInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServiceName" -> ServiceName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServiceProviderName" -> ServiceProviderName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DvbSdtSettings]
    }
  }

  /**
    * Dvb Sub Destination Alignment
    */
  object DvbSubDestinationAlignmentEnum {
    val CENTERED = "CENTERED"
    val LEFT     = "LEFT"
    val SMART    = "SMART"

    val values = IndexedSeq(CENTERED, LEFT, SMART)
  }

  /**
    * Dvb Sub Destination Background Color
    */
  object DvbSubDestinationBackgroundColorEnum {
    val BLACK = "BLACK"
    val NONE  = "NONE"
    val WHITE = "WHITE"

    val values = IndexedSeq(BLACK, NONE, WHITE)
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

    val values = IndexedSeq(BLACK, BLUE, GREEN, RED, WHITE, YELLOW)
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

    val values = IndexedSeq(BLACK, BLUE, GREEN, RED, WHITE, YELLOW)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Alignment" -> Alignment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackgroundColor" -> BackgroundColor.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BackgroundOpacity" -> BackgroundOpacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Font" -> Font.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FontColor" -> FontColor.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FontOpacity" -> FontOpacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FontResolution" -> FontResolution.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FontSize" -> FontSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutlineColor" -> OutlineColor.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutlineSize" -> OutlineSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ShadowColor" -> ShadowColor.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ShadowOpacity" -> ShadowOpacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ShadowXOffset" -> ShadowXOffset.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ShadowYOffset" -> ShadowYOffset.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TeletextGridControl" -> TeletextGridControl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "XPosition" -> XPosition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "YPosition" -> YPosition.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DvbSubDestinationSettings]
    }
  }

  /**
    * Dvb Sub Destination Shadow Color
    */
  object DvbSubDestinationShadowColorEnum {
    val BLACK = "BLACK"
    val NONE  = "NONE"
    val WHITE = "WHITE"

    val values = IndexedSeq(BLACK, NONE, WHITE)
  }

  /**
    * Dvb Sub Destination Teletext Grid Control
    */
  object DvbSubDestinationTeletextGridControlEnum {
    val FIXED  = "FIXED"
    val SCALED = "SCALED"

    val values = IndexedSeq(FIXED, SCALED)
  }

  /**
    * Dvb Sub Source Settings
    */
  @js.native
  trait DvbSubSourceSettings extends js.Object {
    var Pid: js.UndefOr[__integerMin1]
  }

  object DvbSubSourceSettings {
    def apply(
        Pid: js.UndefOr[__integerMin1] = js.undefined
    ): DvbSubSourceSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Pid" -> Pid.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DvbSubSourceSettings]
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
    def apply(
        RepInterval: js.UndefOr[__integerMin1000Max30000] = js.undefined
    ): DvbTdtSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RepInterval" -> RepInterval.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DvbTdtSettings]
    }
  }

  /**
    * Eac3 Attenuation Control
    */
  object Eac3AttenuationControlEnum {
    val ATTENUATE_3_DB = "ATTENUATE_3_DB"
    val NONE           = "NONE"

    val values = IndexedSeq(ATTENUATE_3_DB, NONE)
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

    val values = IndexedSeq(COMMENTARY, COMPLETE_MAIN, EMERGENCY, HEARING_IMPAIRED, VISUALLY_IMPAIRED)
  }

  /**
    * Eac3 Coding Mode
    */
  object Eac3CodingModeEnum {
    val CODING_MODE_1_0 = "CODING_MODE_1_0"
    val CODING_MODE_2_0 = "CODING_MODE_2_0"
    val CODING_MODE_3_2 = "CODING_MODE_3_2"

    val values = IndexedSeq(CODING_MODE_1_0, CODING_MODE_2_0, CODING_MODE_3_2)
  }

  /**
    * Eac3 Dc Filter
    */
  object Eac3DcFilterEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
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

    val values = IndexedSeq(FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT, MUSIC_STANDARD, NONE, SPEECH)
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

    val values = IndexedSeq(FILM_LIGHT, FILM_STANDARD, MUSIC_LIGHT, MUSIC_STANDARD, NONE, SPEECH)
  }

  /**
    * Eac3 Lfe Control
    */
  object Eac3LfeControlEnum {
    val LFE    = "LFE"
    val NO_LFE = "NO_LFE"

    val values = IndexedSeq(LFE, NO_LFE)
  }

  /**
    * Eac3 Lfe Filter
    */
  object Eac3LfeFilterEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
    * Eac3 Metadata Control
    */
  object Eac3MetadataControlEnum {
    val FOLLOW_INPUT   = "FOLLOW_INPUT"
    val USE_CONFIGURED = "USE_CONFIGURED"

    val values = IndexedSeq(FOLLOW_INPUT, USE_CONFIGURED)
  }

  /**
    * Eac3 Passthrough Control
    */
  object Eac3PassthroughControlEnum {
    val NO_PASSTHROUGH = "NO_PASSTHROUGH"
    val WHEN_POSSIBLE  = "WHEN_POSSIBLE"

    val values = IndexedSeq(NO_PASSTHROUGH, WHEN_POSSIBLE)
  }

  /**
    * Eac3 Phase Control
    */
  object Eac3PhaseControlEnum {
    val NO_SHIFT         = "NO_SHIFT"
    val SHIFT_90_DEGREES = "SHIFT_90_DEGREES"

    val values = IndexedSeq(NO_SHIFT, SHIFT_90_DEGREES)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AttenuationControl" -> AttenuationControl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Bitrate" -> Bitrate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BitstreamMode" -> BitstreamMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CodingMode" -> CodingMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DcFilter" -> DcFilter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Dialnorm" -> Dialnorm.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DrcLine" -> DrcLine.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DrcRf" -> DrcRf.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LfeControl" -> LfeControl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LfeFilter" -> LfeFilter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LoRoCenterMixLevel" -> LoRoCenterMixLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LoRoSurroundMixLevel" -> LoRoSurroundMixLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LtRtCenterMixLevel" -> LtRtCenterMixLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LtRtSurroundMixLevel" -> LtRtSurroundMixLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MetadataControl" -> MetadataControl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PassthroughControl" -> PassthroughControl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PhaseControl" -> PhaseControl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StereoDownmix" -> StereoDownmix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SurroundExMode" -> SurroundExMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SurroundMode" -> SurroundMode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Eac3Settings]
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

    val values = IndexedSeq(DPL2, LO_RO, LT_RT, NOT_INDICATED)
  }

  /**
    * Eac3 Surround Ex Mode
    */
  object Eac3SurroundExModeEnum {
    val DISABLED      = "DISABLED"
    val ENABLED       = "ENABLED"
    val NOT_INDICATED = "NOT_INDICATED"

    val values = IndexedSeq(DISABLED, ENABLED, NOT_INDICATED)
  }

  /**
    * Eac3 Surround Mode
    */
  object Eac3SurroundModeEnum {
    val DISABLED      = "DISABLED"
    val ENABLED       = "ENABLED"
    val NOT_INDICATED = "NOT_INDICATED"

    val values = IndexedSeq(DISABLED, ENABLED, NOT_INDICATED)
  }

  /**
    * Embedded Convert608 To708
    */
  object EmbeddedConvert608To708Enum {
    val DISABLED  = "DISABLED"
    val UPCONVERT = "UPCONVERT"

    val values = IndexedSeq(DISABLED, UPCONVERT)
  }

  /**
    * Embedded Destination Settings
    */
  @js.native
  trait EmbeddedDestinationSettings extends js.Object {}

  object EmbeddedDestinationSettings {
    def apply(
        ): EmbeddedDestinationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EmbeddedDestinationSettings]
    }
  }

  /**
    * Embedded Plus Scte20 Destination Settings
    */
  @js.native
  trait EmbeddedPlusScte20DestinationSettings extends js.Object {}

  object EmbeddedPlusScte20DestinationSettings {
    def apply(
        ): EmbeddedPlusScte20DestinationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EmbeddedPlusScte20DestinationSettings]
    }
  }

  /**
    * Embedded Scte20 Detection
    */
  object EmbeddedScte20DetectionEnum {
    val AUTO = "AUTO"
    val OFF  = "OFF"

    val values = IndexedSeq(AUTO, OFF)
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
    def apply(
        Convert608To708: js.UndefOr[EmbeddedConvert608To708] = js.undefined,
        Scte20Detection: js.UndefOr[EmbeddedScte20Detection] = js.undefined,
        Source608ChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined,
        Source608TrackNumber: js.UndefOr[__integerMin1Max5] = js.undefined
    ): EmbeddedSourceSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Convert608To708" -> Convert608To708.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Scte20Detection" -> Scte20Detection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Source608ChannelNumber" -> Source608ChannelNumber.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Source608TrackNumber" -> Source608TrackNumber.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EmbeddedSourceSettings]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AudioDescriptions" -> AudioDescriptions.asInstanceOf[js.Any],
        "OutputGroups"      -> OutputGroups.asInstanceOf[js.Any],
        "TimecodeConfig"    -> TimecodeConfig.asInstanceOf[js.Any],
        "VideoDescriptions" -> VideoDescriptions.asInstanceOf[js.Any],
        "AvailBlanking" -> AvailBlanking.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailConfiguration" -> AvailConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BlackoutSlate" -> BlackoutSlate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CaptionDescriptions" -> CaptionDescriptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GlobalConfiguration" -> GlobalConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncoderSettings]
    }
  }

  /**
    * Fec Output Include Fec
    */
  object FecOutputIncludeFecEnum {
    val COLUMN         = "COLUMN"
    val COLUMN_AND_ROW = "COLUMN_AND_ROW"

    val values = IndexedSeq(COLUMN, COLUMN_AND_ROW)
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
    def apply(
        ColumnDepth: js.UndefOr[__integerMin4Max20] = js.undefined,
        IncludeFec: js.UndefOr[FecOutputIncludeFec] = js.undefined,
        RowLength: js.UndefOr[__integerMin1Max20] = js.undefined
    ): FecOutputSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ColumnDepth" -> ColumnDepth.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeFec" -> IncludeFec.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RowLength" -> RowLength.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FecOutputSettings]
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

    val values = IndexedSeq(
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
  }

  /**
    * Start time for the action.
    */
  @js.native
  trait FixedModeScheduleActionStartSettings extends js.Object {
    var Time: __string
  }

  object FixedModeScheduleActionStartSettings {
    def apply(
        Time: __string
    ): FixedModeScheduleActionStartSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Time" -> Time.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FixedModeScheduleActionStartSettings]
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
    def apply(
        FollowPoint: FollowPoint,
        ReferenceActionName: __string
    ): FollowModeScheduleActionStartSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FollowPoint"         -> FollowPoint.asInstanceOf[js.Any],
        "ReferenceActionName" -> ReferenceActionName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FollowModeScheduleActionStartSettings]
    }
  }

  /**
    * Follow reference point.
    */
  object FollowPointEnum {
    val END   = "END"
    val START = "START"

    val values = IndexedSeq(END, START)
  }

  /**
    * Frame Capture Group Settings
    */
  @js.native
  trait FrameCaptureGroupSettings extends js.Object {
    var Destination: OutputLocationRef
  }

  object FrameCaptureGroupSettings {
    def apply(
        Destination: OutputLocationRef
    ): FrameCaptureGroupSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Destination" -> Destination.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FrameCaptureGroupSettings]
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
    def apply(
        NameModifier: js.UndefOr[__string] = js.undefined
    ): FrameCaptureOutputSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NameModifier" -> NameModifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FrameCaptureOutputSettings]
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
    def apply(
        CaptureInterval: __integerMin1Max3600
    ): FrameCaptureSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CaptureInterval" -> CaptureInterval.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FrameCaptureSettings]
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
    def apply(
        InitialAudioGain: js.UndefOr[__integerMinNegative60Max60] = js.undefined,
        InputEndAction: js.UndefOr[GlobalConfigurationInputEndAction] = js.undefined,
        InputLossBehavior: js.UndefOr[InputLossBehavior] = js.undefined,
        OutputLockingMode: js.UndefOr[GlobalConfigurationOutputLockingMode] = js.undefined,
        OutputTimingSource: js.UndefOr[GlobalConfigurationOutputTimingSource] = js.undefined,
        SupportLowFramerateInputs: js.UndefOr[GlobalConfigurationLowFramerateInputs] = js.undefined
    ): GlobalConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InitialAudioGain" -> InitialAudioGain.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputEndAction" -> InputEndAction.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputLossBehavior" -> InputLossBehavior.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutputLockingMode" -> OutputLockingMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutputTimingSource" -> OutputTimingSource.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportLowFramerateInputs" -> SupportLowFramerateInputs.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GlobalConfiguration]
    }
  }

  /**
    * Global Configuration Input End Action
    */
  object GlobalConfigurationInputEndActionEnum {
    val NONE                   = "NONE"
    val SWITCH_AND_LOOP_INPUTS = "SWITCH_AND_LOOP_INPUTS"

    val values = IndexedSeq(NONE, SWITCH_AND_LOOP_INPUTS)
  }

  /**
    * Global Configuration Low Framerate Inputs
    */
  object GlobalConfigurationLowFramerateInputsEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
    * Global Configuration Output Locking Mode
    */
  object GlobalConfigurationOutputLockingModeEnum {
    val EPOCH_LOCKING    = "EPOCH_LOCKING"
    val PIPELINE_LOCKING = "PIPELINE_LOCKING"

    val values = IndexedSeq(EPOCH_LOCKING, PIPELINE_LOCKING)
  }

  /**
    * Global Configuration Output Timing Source
    */
  object GlobalConfigurationOutputTimingSourceEnum {
    val INPUT_CLOCK  = "INPUT_CLOCK"
    val SYSTEM_CLOCK = "SYSTEM_CLOCK"

    val values = IndexedSeq(INPUT_CLOCK, SYSTEM_CLOCK)
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

    val values = IndexedSeq(HIGH, HIGHER, LOW, MAX, MEDIUM, OFF)
  }

  /**
    * H264 Color Metadata
    */
  object H264ColorMetadataEnum {
    val IGNORE = "IGNORE"
    val INSERT = "INSERT"

    val values = IndexedSeq(IGNORE, INSERT)
  }

  /**
    * H264 Entropy Encoding
    */
  object H264EntropyEncodingEnum {
    val CABAC = "CABAC"
    val CAVLC = "CAVLC"

    val values = IndexedSeq(CABAC, CAVLC)
  }

  /**
    * H264 Flicker Aq
    */
  object H264FlickerAqEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
    * H264 Framerate Control
    */
  object H264FramerateControlEnum {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE"
    val SPECIFIED              = "SPECIFIED"

    val values = IndexedSeq(INITIALIZE_FROM_SOURCE, SPECIFIED)
  }

  /**
    * H264 Gop BReference
    */
  object H264GopBReferenceEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
    * H264 Gop Size Units
    */
  object H264GopSizeUnitsEnum {
    val FRAMES  = "FRAMES"
    val SECONDS = "SECONDS"

    val values = IndexedSeq(FRAMES, SECONDS)
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

    val values = IndexedSeq(
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
  }

  /**
    * H264 Look Ahead Rate Control
    */
  object H264LookAheadRateControlEnum {
    val HIGH   = "HIGH"
    val LOW    = "LOW"
    val MEDIUM = "MEDIUM"

    val values = IndexedSeq(HIGH, LOW, MEDIUM)
  }

  /**
    * H264 Par Control
    */
  object H264ParControlEnum {
    val INITIALIZE_FROM_SOURCE = "INITIALIZE_FROM_SOURCE"
    val SPECIFIED              = "SPECIFIED"

    val values = IndexedSeq(INITIALIZE_FROM_SOURCE, SPECIFIED)
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

    val values = IndexedSeq(BASELINE, HIGH, HIGH_10BIT, HIGH_422, HIGH_422_10BIT, MAIN)
  }

  /**
    * H264 Rate Control Mode
    */
  object H264RateControlModeEnum {
    val CBR  = "CBR"
    val QVBR = "QVBR"
    val VBR  = "VBR"

    val values = IndexedSeq(CBR, QVBR, VBR)
  }

  /**
    * H264 Scan Type
    */
  object H264ScanTypeEnum {
    val INTERLACED  = "INTERLACED"
    val PROGRESSIVE = "PROGRESSIVE"

    val values = IndexedSeq(INTERLACED, PROGRESSIVE)
  }

  /**
    * H264 Scene Change Detect
    */
  object H264SceneChangeDetectEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AdaptiveQuantization" -> AdaptiveQuantization.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AfdSignaling" -> AfdSignaling.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Bitrate" -> Bitrate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BufFillPct" -> BufFillPct.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BufSize" -> BufSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ColorMetadata" -> ColorMetadata.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EntropyEncoding" -> EntropyEncoding.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FixedAfd" -> FixedAfd.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FlickerAq" -> FlickerAq.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FramerateControl" -> FramerateControl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FramerateDenominator" -> FramerateDenominator.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FramerateNumerator" -> FramerateNumerator.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GopBReference" -> GopBReference.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GopClosedCadence" -> GopClosedCadence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GopNumBFrames" -> GopNumBFrames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GopSize" -> GopSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GopSizeUnits" -> GopSizeUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Level" -> Level.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LookAheadRateControl" -> LookAheadRateControl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxBitrate" -> MaxBitrate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinIInterval" -> MinIInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumRefFrames" -> NumRefFrames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParControl" -> ParControl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParDenominator" -> ParDenominator.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ParNumerator" -> ParNumerator.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Profile" -> Profile.map { x =>
          x.asInstanceOf[js.Any]
        },
        "QvbrQualityLevel" -> QvbrQualityLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RateControlMode" -> RateControlMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScanType" -> ScanType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SceneChangeDetect" -> SceneChangeDetect.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Slices" -> Slices.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Softness" -> Softness.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SpatialAq" -> SpatialAq.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubgopLength" -> SubgopLength.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Syntax" -> Syntax.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TemporalAq" -> TemporalAq.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimecodeInsertion" -> TimecodeInsertion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[H264Settings]
    }
  }

  /**
    * H264 Spatial Aq
    */
  object H264SpatialAqEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
    * H264 Sub Gop Length
    */
  object H264SubGopLengthEnum {
    val DYNAMIC = "DYNAMIC"
    val FIXED   = "FIXED"

    val values = IndexedSeq(DYNAMIC, FIXED)
  }

  /**
    * H264 Syntax
    */
  object H264SyntaxEnum {
    val DEFAULT = "DEFAULT"
    val RP2027  = "RP2027"

    val values = IndexedSeq(DEFAULT, RP2027)
  }

  /**
    * H264 Temporal Aq
    */
  object H264TemporalAqEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
    * H264 Timecode Insertion Behavior
    */
  object H264TimecodeInsertionBehaviorEnum {
    val DISABLED       = "DISABLED"
    val PIC_TIMING_SEI = "PIC_TIMING_SEI"

    val values = IndexedSeq(DISABLED, PIC_TIMING_SEI)
  }

  /**
    * Hls Ad Markers
    */
  object HlsAdMarkersEnum {
    val ADOBE            = "ADOBE"
    val ELEMENTAL        = "ELEMENTAL"
    val ELEMENTAL_SCTE35 = "ELEMENTAL_SCTE35"

    val values = IndexedSeq(ADOBE, ELEMENTAL, ELEMENTAL_SCTE35)
  }

  /**
    * Hls Akamai Http Transfer Mode
    */
  object HlsAkamaiHttpTransferModeEnum {
    val CHUNKED     = "CHUNKED"
    val NON_CHUNKED = "NON_CHUNKED"

    val values = IndexedSeq(CHUNKED, NON_CHUNKED)
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
    def apply(
        ConnectionRetryInterval: js.UndefOr[__integerMin0] = js.undefined,
        FilecacheDuration: js.UndefOr[__integerMin0Max600] = js.undefined,
        HttpTransferMode: js.UndefOr[HlsAkamaiHttpTransferMode] = js.undefined,
        NumRetries: js.UndefOr[__integerMin0] = js.undefined,
        RestartDelay: js.UndefOr[__integerMin0Max15] = js.undefined,
        Salt: js.UndefOr[__string] = js.undefined,
        Token: js.UndefOr[__string] = js.undefined
    ): HlsAkamaiSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectionRetryInterval" -> ConnectionRetryInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FilecacheDuration" -> FilecacheDuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HttpTransferMode" -> HttpTransferMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumRetries" -> NumRetries.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RestartDelay" -> RestartDelay.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Salt" -> Salt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Token" -> Token.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsAkamaiSettings]
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
    def apply(
        ConnectionRetryInterval: js.UndefOr[__integerMin0] = js.undefined,
        FilecacheDuration: js.UndefOr[__integerMin0Max600] = js.undefined,
        NumRetries: js.UndefOr[__integerMin0] = js.undefined,
        RestartDelay: js.UndefOr[__integerMin0Max15] = js.undefined
    ): HlsBasicPutSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectionRetryInterval" -> ConnectionRetryInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FilecacheDuration" -> FilecacheDuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumRetries" -> NumRetries.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RestartDelay" -> RestartDelay.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsBasicPutSettings]
    }
  }

  /**
    * Hls Caption Language Setting
    */
  object HlsCaptionLanguageSettingEnum {
    val INSERT = "INSERT"
    val NONE   = "NONE"
    val OMIT   = "OMIT"

    val values = IndexedSeq(INSERT, NONE, OMIT)
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
    def apply(
        HlsAkamaiSettings: js.UndefOr[HlsAkamaiSettings] = js.undefined,
        HlsBasicPutSettings: js.UndefOr[HlsBasicPutSettings] = js.undefined,
        HlsMediaStoreSettings: js.UndefOr[HlsMediaStoreSettings] = js.undefined,
        HlsWebdavSettings: js.UndefOr[HlsWebdavSettings] = js.undefined
    ): HlsCdnSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HlsAkamaiSettings" -> HlsAkamaiSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsBasicPutSettings" -> HlsBasicPutSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsMediaStoreSettings" -> HlsMediaStoreSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsWebdavSettings" -> HlsWebdavSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsCdnSettings]
    }
  }

  /**
    * Hls Client Cache
    */
  object HlsClientCacheEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
    * Hls Codec Specification
    */
  object HlsCodecSpecificationEnum {
    val RFC_4281 = "RFC_4281"
    val RFC_6381 = "RFC_6381"

    val values = IndexedSeq(RFC_4281, RFC_6381)
  }

  /**
    * Hls Directory Structure
    */
  object HlsDirectoryStructureEnum {
    val SINGLE_DIRECTORY        = "SINGLE_DIRECTORY"
    val SUBDIRECTORY_PER_STREAM = "SUBDIRECTORY_PER_STREAM"

    val values = IndexedSeq(SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM)
  }

  /**
    * Hls Encryption Type
    */
  object HlsEncryptionTypeEnum {
    val AES128     = "AES128"
    val SAMPLE_AES = "SAMPLE_AES"

    val values = IndexedSeq(AES128, SAMPLE_AES)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Destination" -> Destination.asInstanceOf[js.Any],
        "AdMarkers" -> AdMarkers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BaseUrlContent" -> BaseUrlContent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BaseUrlManifest" -> BaseUrlManifest.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CaptionLanguageMappings" -> CaptionLanguageMappings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CaptionLanguageSetting" -> CaptionLanguageSetting.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClientCache" -> ClientCache.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CodecSpecification" -> CodecSpecification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConstantIv" -> ConstantIv.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DirectoryStructure" -> DirectoryStructure.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EncryptionType" -> EncryptionType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsCdnSettings" -> HlsCdnSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IFrameOnlyPlaylists" -> IFrameOnlyPlaylists.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IndexNSegments" -> IndexNSegments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputLossAction" -> InputLossAction.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IvInManifest" -> IvInManifest.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IvSource" -> IvSource.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KeepSegments" -> KeepSegments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KeyFormat" -> KeyFormat.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KeyFormatVersions" -> KeyFormatVersions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KeyProviderSettings" -> KeyProviderSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManifestCompression" -> ManifestCompression.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManifestDurationFormat" -> ManifestDurationFormat.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinSegmentLength" -> MinSegmentLength.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Mode" -> Mode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutputSelection" -> OutputSelection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProgramDateTime" -> ProgramDateTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProgramDateTimePeriod" -> ProgramDateTimePeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RedundantManifest" -> RedundantManifest.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentLength" -> SegmentLength.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentationMode" -> SegmentationMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentsPerSubdirectory" -> SegmentsPerSubdirectory.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StreamInfResolution" -> StreamInfResolution.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimedMetadataId3Frame" -> TimedMetadataId3Frame.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimedMetadataId3Period" -> TimedMetadataId3Period.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimestampDeltaMilliseconds" -> TimestampDeltaMilliseconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TsFileMode" -> TsFileMode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsGroupSettings]
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
    def apply(
        Bandwidth: js.UndefOr[__integerMin0] = js.undefined,
        BufferSegments: js.UndefOr[__integerMin0] = js.undefined,
        Retries: js.UndefOr[__integerMin0] = js.undefined,
        RetryInterval: js.UndefOr[__integerMin0] = js.undefined
    ): HlsInputSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bandwidth" -> Bandwidth.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BufferSegments" -> BufferSegments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Retries" -> Retries.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RetryInterval" -> RetryInterval.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsInputSettings]
    }
  }

  /**
    * Hls Iv In Manifest
    */
  object HlsIvInManifestEnum {
    val EXCLUDE = "EXCLUDE"
    val INCLUDE = "INCLUDE"

    val values = IndexedSeq(EXCLUDE, INCLUDE)
  }

  /**
    * Hls Iv Source
    */
  object HlsIvSourceEnum {
    val EXPLICIT               = "EXPLICIT"
    val FOLLOWS_SEGMENT_NUMBER = "FOLLOWS_SEGMENT_NUMBER"

    val values = IndexedSeq(EXPLICIT, FOLLOWS_SEGMENT_NUMBER)
  }

  /**
    * Hls Manifest Compression
    */
  object HlsManifestCompressionEnum {
    val GZIP = "GZIP"
    val NONE = "NONE"

    val values = IndexedSeq(GZIP, NONE)
  }

  /**
    * Hls Manifest Duration Format
    */
  object HlsManifestDurationFormatEnum {
    val FLOATING_POINT = "FLOATING_POINT"
    val INTEGER        = "INTEGER"

    val values = IndexedSeq(FLOATING_POINT, INTEGER)
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
    def apply(
        ConnectionRetryInterval: js.UndefOr[__integerMin0] = js.undefined,
        FilecacheDuration: js.UndefOr[__integerMin0Max600] = js.undefined,
        MediaStoreStorageClass: js.UndefOr[HlsMediaStoreStorageClass] = js.undefined,
        NumRetries: js.UndefOr[__integerMin0] = js.undefined,
        RestartDelay: js.UndefOr[__integerMin0Max15] = js.undefined
    ): HlsMediaStoreSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectionRetryInterval" -> ConnectionRetryInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FilecacheDuration" -> FilecacheDuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MediaStoreStorageClass" -> MediaStoreStorageClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumRetries" -> NumRetries.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RestartDelay" -> RestartDelay.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsMediaStoreSettings]
    }
  }

  /**
    * Hls Media Store Storage Class
    */
  object HlsMediaStoreStorageClassEnum {
    val TEMPORAL = "TEMPORAL"

    val values = IndexedSeq(TEMPORAL)
  }

  /**
    * Hls Mode
    */
  object HlsModeEnum {
    val LIVE = "LIVE"
    val VOD  = "VOD"

    val values = IndexedSeq(LIVE, VOD)
  }

  /**
    * Hls Output Selection
    */
  object HlsOutputSelectionEnum {
    val MANIFESTS_AND_SEGMENTS = "MANIFESTS_AND_SEGMENTS"
    val SEGMENTS_ONLY          = "SEGMENTS_ONLY"

    val values = IndexedSeq(MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY)
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
    def apply(
        HlsSettings: HlsSettings,
        NameModifier: js.UndefOr[__stringMin1] = js.undefined,
        SegmentModifier: js.UndefOr[__string] = js.undefined
    ): HlsOutputSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HlsSettings" -> HlsSettings.asInstanceOf[js.Any],
        "NameModifier" -> NameModifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentModifier" -> SegmentModifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsOutputSettings]
    }
  }

  /**
    * Hls Program Date Time
    */
  object HlsProgramDateTimeEnum {
    val EXCLUDE = "EXCLUDE"
    val INCLUDE = "INCLUDE"

    val values = IndexedSeq(EXCLUDE, INCLUDE)
  }

  /**
    * Hls Redundant Manifest
    */
  object HlsRedundantManifestEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
    * Hls Segmentation Mode
    */
  object HlsSegmentationModeEnum {
    val USE_INPUT_SEGMENTATION = "USE_INPUT_SEGMENTATION"
    val USE_SEGMENT_DURATION   = "USE_SEGMENT_DURATION"

    val values = IndexedSeq(USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION)
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
    def apply(
        AudioOnlyHlsSettings: js.UndefOr[AudioOnlyHlsSettings] = js.undefined,
        StandardHlsSettings: js.UndefOr[StandardHlsSettings] = js.undefined
    ): HlsSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AudioOnlyHlsSettings" -> AudioOnlyHlsSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StandardHlsSettings" -> StandardHlsSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsSettings]
    }
  }

  /**
    * Hls Stream Inf Resolution
    */
  object HlsStreamInfResolutionEnum {
    val EXCLUDE = "EXCLUDE"
    val INCLUDE = "INCLUDE"

    val values = IndexedSeq(EXCLUDE, INCLUDE)
  }

  /**
    * Hls Timed Metadata Id3 Frame
    */
  object HlsTimedMetadataId3FrameEnum {
    val NONE = "NONE"
    val PRIV = "PRIV"
    val TDRL = "TDRL"

    val values = IndexedSeq(NONE, PRIV, TDRL)
  }

  /**
    * Settings for the action to emit HLS metadata
    */
  @js.native
  trait HlsTimedMetadataScheduleActionSettings extends js.Object {
    var Id3: __string
  }

  object HlsTimedMetadataScheduleActionSettings {
    def apply(
        Id3: __string
    ): HlsTimedMetadataScheduleActionSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id3" -> Id3.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsTimedMetadataScheduleActionSettings]
    }
  }

  /**
    * Hls Ts File Mode
    */
  object HlsTsFileModeEnum {
    val SEGMENTED_FILES = "SEGMENTED_FILES"
    val SINGLE_FILE     = "SINGLE_FILE"

    val values = IndexedSeq(SEGMENTED_FILES, SINGLE_FILE)
  }

  /**
    * Hls Webdav Http Transfer Mode
    */
  object HlsWebdavHttpTransferModeEnum {
    val CHUNKED     = "CHUNKED"
    val NON_CHUNKED = "NON_CHUNKED"

    val values = IndexedSeq(CHUNKED, NON_CHUNKED)
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
    def apply(
        ConnectionRetryInterval: js.UndefOr[__integerMin0] = js.undefined,
        FilecacheDuration: js.UndefOr[__integerMin0Max600] = js.undefined,
        HttpTransferMode: js.UndefOr[HlsWebdavHttpTransferMode] = js.undefined,
        NumRetries: js.UndefOr[__integerMin0] = js.undefined,
        RestartDelay: js.UndefOr[__integerMin0Max15] = js.undefined
    ): HlsWebdavSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectionRetryInterval" -> ConnectionRetryInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FilecacheDuration" -> FilecacheDuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HttpTransferMode" -> HttpTransferMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumRetries" -> NumRetries.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RestartDelay" -> RestartDelay.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HlsWebdavSettings]
    }
  }

  /**
    * When set to "standard", an I-Frame only playlist will be written out for each video output in the output group. This I-Frame only playlist will contain byte range offsets pointing to the I-frame(s) in each segment.
    */
  object IFrameOnlyPlaylistTypeEnum {
    val DISABLED = "DISABLED"
    val STANDARD = "STANDARD"

    val values = IndexedSeq(DISABLED, STANDARD)
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
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        AttachedChannels: js.UndefOr[__listOf__string] = js.undefined,
        Destinations: js.UndefOr[__listOfInputDestination] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        InputClass: js.UndefOr[InputClass] = js.undefined,
        MediaConnectFlows: js.UndefOr[__listOfMediaConnectFlow] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        SecurityGroups: js.UndefOr[__listOf__string] = js.undefined,
        Sources: js.UndefOr[__listOfInputSource] = js.undefined,
        State: js.UndefOr[InputState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Type: js.UndefOr[InputType] = js.undefined
    ): Input = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttachedChannels" -> AttachedChannels.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Destinations" -> Destinations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputClass" -> InputClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MediaConnectFlows" -> MediaConnectFlows.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityGroups" -> SecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Sources" -> Sources.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Input]
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
    def apply(
        InputAttachmentName: js.UndefOr[__string] = js.undefined,
        InputId: js.UndefOr[__string] = js.undefined,
        InputSettings: js.UndefOr[InputSettings] = js.undefined
    ): InputAttachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputAttachmentName" -> InputAttachmentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputId" -> InputId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputSettings" -> InputSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputAttachment]
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
    def apply(
        Gain: __integerMinNegative60Max6,
        InputChannel: __integerMin0Max15
    ): InputChannelLevel = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Gain"         -> Gain.asInstanceOf[js.Any],
        "InputChannel" -> InputChannel.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputChannelLevel]
    }
  }

  /**
    * A standard input has two sources and a single pipeline input only has one.
    */
  object InputClassEnum {
    val STANDARD        = "STANDARD"
    val SINGLE_PIPELINE = "SINGLE_PIPELINE"

    val values = IndexedSeq(STANDARD, SINGLE_PIPELINE)
  }

  /**
    * codec in increasing order of complexity
    */
  object InputCodecEnum {
    val MPEG2 = "MPEG2"
    val AVC   = "AVC"
    val HEVC  = "HEVC"

    val values = IndexedSeq(MPEG2, AVC, HEVC)
  }

  /**
    * Input Deblock Filter
    */
  object InputDeblockFilterEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
    * Input Denoise Filter
    */
  object InputDenoiseFilterEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
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
    def apply(
        Ip: js.UndefOr[__string] = js.undefined,
        Port: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined,
        Vpc: js.UndefOr[InputDestinationVpc] = js.undefined
    ): InputDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ip" -> Ip.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Url" -> Url.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Vpc" -> Vpc.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputDestination]
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
    def apply(
        StreamName: js.UndefOr[__string] = js.undefined
    ): InputDestinationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputDestinationRequest]
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
    def apply(
        AvailabilityZone: js.UndefOr[__string] = js.undefined,
        NetworkInterfaceId: js.UndefOr[__string] = js.undefined
    ): InputDestinationVpc = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputDestinationVpc]
    }
  }

  /**
    * Input Filter
    */
  object InputFilterEnum {
    val AUTO     = "AUTO"
    val DISABLED = "DISABLED"
    val FORCED   = "FORCED"

    val values = IndexedSeq(AUTO, DISABLED, FORCED)
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
    def apply(
        Uri: __string,
        PasswordParam: js.UndefOr[__string] = js.undefined,
        Username: js.UndefOr[__string] = js.undefined
    ): InputLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Uri" -> Uri.asInstanceOf[js.Any],
        "PasswordParam" -> PasswordParam.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Username" -> Username.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputLocation]
    }
  }

  /**
    * Input Loss Action For Hls Out
    */
  object InputLossActionForHlsOutEnum {
    val EMIT_OUTPUT  = "EMIT_OUTPUT"
    val PAUSE_OUTPUT = "PAUSE_OUTPUT"

    val values = IndexedSeq(EMIT_OUTPUT, PAUSE_OUTPUT)
  }

  /**
    * Input Loss Action For Ms Smooth Out
    */
  object InputLossActionForMsSmoothOutEnum {
    val EMIT_OUTPUT  = "EMIT_OUTPUT"
    val PAUSE_OUTPUT = "PAUSE_OUTPUT"

    val values = IndexedSeq(EMIT_OUTPUT, PAUSE_OUTPUT)
  }

  /**
    * Input Loss Action For Rtmp Out
    */
  object InputLossActionForRtmpOutEnum {
    val EMIT_OUTPUT  = "EMIT_OUTPUT"
    val PAUSE_OUTPUT = "PAUSE_OUTPUT"

    val values = IndexedSeq(EMIT_OUTPUT, PAUSE_OUTPUT)
  }

  /**
    * Input Loss Action For Udp Out
    */
  object InputLossActionForUdpOutEnum {
    val DROP_PROGRAM = "DROP_PROGRAM"
    val DROP_TS      = "DROP_TS"
    val EMIT_PROGRAM = "EMIT_PROGRAM"

    val values = IndexedSeq(DROP_PROGRAM, DROP_TS, EMIT_PROGRAM)
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
    def apply(
        BlackFrameMsec: js.UndefOr[__integerMin0Max1000000] = js.undefined,
        InputLossImageColor: js.UndefOr[__stringMin6Max6] = js.undefined,
        InputLossImageSlate: js.UndefOr[InputLocation] = js.undefined,
        InputLossImageType: js.UndefOr[InputLossImageType] = js.undefined,
        RepeatFrameMsec: js.UndefOr[__integerMin0Max1000000] = js.undefined
    ): InputLossBehavior = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BlackFrameMsec" -> BlackFrameMsec.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputLossImageColor" -> InputLossImageColor.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputLossImageSlate" -> InputLossImageSlate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputLossImageType" -> InputLossImageType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RepeatFrameMsec" -> RepeatFrameMsec.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputLossBehavior]
    }
  }

  /**
    * Input Loss Image Type
    */
  object InputLossImageTypeEnum {
    val COLOR = "COLOR"
    val SLATE = "SLATE"

    val values = IndexedSeq(COLOR, SLATE)
  }

  /**
    * Maximum input bitrate in megabits per second. Bitrates up to 50 Mbps are supported currently.
    */
  object InputMaximumBitrateEnum {
    val MAX_10_MBPS = "MAX_10_MBPS"
    val MAX_20_MBPS = "MAX_20_MBPS"
    val MAX_50_MBPS = "MAX_50_MBPS"

    val values = IndexedSeq(MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS)
  }

  /**
    * Input resolution based on lines of vertical resolution in the input; SD is less than 720 lines, HD is 720 to 1080 lines, UHD is greater than 1080 lines
    */
  object InputResolutionEnum {
    val SD  = "SD"
    val HD  = "HD"
    val UHD = "UHD"

    val values = IndexedSeq(SD, HD, UHD)
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
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Inputs: js.UndefOr[__listOf__string] = js.undefined,
        State: js.UndefOr[InputSecurityGroupState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        WhitelistRules: js.UndefOr[__listOfInputWhitelistRule] = js.undefined
    ): InputSecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Inputs" -> Inputs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WhitelistRules" -> WhitelistRules.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputSecurityGroup]
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

    val values = IndexedSeq(IDLE, IN_USE, UPDATING, DELETED)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AudioSelectors" -> AudioSelectors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CaptionSelectors" -> CaptionSelectors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeblockFilter" -> DeblockFilter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DenoiseFilter" -> DenoiseFilter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FilterStrength" -> FilterStrength.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputFilter" -> InputFilter.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NetworkInputSettings" -> NetworkInputSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceEndBehavior" -> SourceEndBehavior.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VideoSelector" -> VideoSelector.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputSettings]
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
    def apply(
        PasswordParam: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined,
        Username: js.UndefOr[__string] = js.undefined
    ): InputSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PasswordParam" -> PasswordParam.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Url" -> Url.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Username" -> Username.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputSource]
    }
  }

  /**
    * Input Source End Behavior
    */
  object InputSourceEndBehaviorEnum {
    val CONTINUE = "CONTINUE"
    val LOOP     = "LOOP"

    val values = IndexedSeq(CONTINUE, LOOP)
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
    def apply(
        PasswordParam: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined,
        Username: js.UndefOr[__string] = js.undefined
    ): InputSourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PasswordParam" -> PasswordParam.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Url" -> Url.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Username" -> Username.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputSourceRequest]
    }
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
    def apply(
        Codec: js.UndefOr[InputCodec] = js.undefined,
        MaximumBitrate: js.UndefOr[InputMaximumBitrate] = js.undefined,
        Resolution: js.UndefOr[InputResolution] = js.undefined
    ): InputSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Codec" -> Codec.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaximumBitrate" -> MaximumBitrate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Resolution" -> Resolution.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputSpecification]
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

    val values = IndexedSeq(CREATING, DETACHED, ATTACHED, DELETING, DELETED)
  }

  /**
    * Settings for the action to switch an input.
    */
  @js.native
  trait InputSwitchScheduleActionSettings extends js.Object {
    var InputAttachmentNameReference: __string
  }

  object InputSwitchScheduleActionSettings {
    def apply(
        InputAttachmentNameReference: __string
    ): InputSwitchScheduleActionSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputAttachmentNameReference" -> InputAttachmentNameReference.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputSwitchScheduleActionSettings]
    }
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

    val values = IndexedSeq(UDP_PUSH, RTP_PUSH, RTMP_PUSH, RTMP_PULL, URL_PULL, MP4_FILE, MEDIACONNECT)
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
    def apply(
        SubnetIds: __listOf__string,
        SecurityGroupIds: js.UndefOr[__listOf__string] = js.undefined
    ): InputVpcRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any],
        "SecurityGroupIds" -> SecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputVpcRequest]
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
    def apply(
        Cidr: js.UndefOr[__string] = js.undefined
    ): InputWhitelistRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cidr" -> Cidr.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputWhitelistRule]
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
    def apply(
        Cidr: js.UndefOr[__string] = js.undefined
    ): InputWhitelistRuleCidr = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Cidr" -> Cidr.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputWhitelistRuleCidr]
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
    def apply(
        StaticKeySettings: js.UndefOr[StaticKeySettings] = js.undefined
    ): KeyProviderSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StaticKeySettings" -> StaticKeySettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyProviderSettings]
    }
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
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListChannelsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListChannelsRequest]
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
    def apply(
        Channels: js.UndefOr[__listOfChannelSummary] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListChannelsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Channels" -> Channels.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListChannelsResponse]
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
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListInputSecurityGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInputSecurityGroupsRequest]
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
    def apply(
        InputSecurityGroups: js.UndefOr[__listOfInputSecurityGroup] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListInputSecurityGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputSecurityGroups" -> InputSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInputSecurityGroupsResponse]
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
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListInputsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInputsRequest]
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
    def apply(
        Inputs: js.UndefOr[__listOfInput] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListInputsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Inputs" -> Inputs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInputsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ChannelClass" -> ChannelClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChannelConfiguration" -> ChannelConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Codec" -> Codec.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaximumBitrate" -> MaximumBitrate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaximumFramerate" -> MaximumFramerate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Resolution" -> Resolution.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceType" -> ResourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SpecialFeature" -> SpecialFeature.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VideoQuality" -> VideoQuality.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOfferingsRequest]
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
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Offerings: js.UndefOr[__listOfOffering] = js.undefined
    ): ListOfferingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Offerings" -> Offerings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOfferingsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ChannelClass" -> ChannelClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Codec" -> Codec.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaximumBitrate" -> MaximumBitrate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaximumFramerate" -> MaximumFramerate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Resolution" -> Resolution.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceType" -> ResourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SpecialFeature" -> SpecialFeature.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VideoQuality" -> VideoQuality.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReservationsRequest]
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
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Reservations: js.UndefOr[__listOfReservation] = js.undefined
    ): ListReservationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Reservations" -> Reservations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReservationsResponse]
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
    def apply(
        ResourceArn: __string
    ): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
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
    def apply(
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
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

    val values = IndexedSeq(ERROR, WARNING, INFO, DEBUG, DISABLED)
  }

  /**
    * M2ts Absent Input Audio Behavior
    */
  object M2tsAbsentInputAudioBehaviorEnum {
    val DROP           = "DROP"
    val ENCODE_SILENCE = "ENCODE_SILENCE"

    val values = IndexedSeq(DROP, ENCODE_SILENCE)
  }

  /**
    * M2ts Arib
    */
  object M2tsAribEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
    * M2ts Arib Captions Pid Control
    */
  object M2tsAribCaptionsPidControlEnum {
    val AUTO           = "AUTO"
    val USE_CONFIGURED = "USE_CONFIGURED"

    val values = IndexedSeq(AUTO, USE_CONFIGURED)
  }

  /**
    * M2ts Audio Buffer Model
    */
  object M2tsAudioBufferModelEnum {
    val ATSC = "ATSC"
    val DVB  = "DVB"

    val values = IndexedSeq(ATSC, DVB)
  }

  /**
    * M2ts Audio Interval
    */
  object M2tsAudioIntervalEnum {
    val VIDEO_AND_FIXED_INTERVALS = "VIDEO_AND_FIXED_INTERVALS"
    val VIDEO_INTERVAL            = "VIDEO_INTERVAL"

    val values = IndexedSeq(VIDEO_AND_FIXED_INTERVALS, VIDEO_INTERVAL)
  }

  /**
    * M2ts Audio Stream Type
    */
  object M2tsAudioStreamTypeEnum {
    val ATSC = "ATSC"
    val DVB  = "DVB"

    val values = IndexedSeq(ATSC, DVB)
  }

  /**
    * M2ts Buffer Model
    */
  object M2tsBufferModelEnum {
    val MULTIPLEX = "MULTIPLEX"
    val NONE      = "NONE"

    val values = IndexedSeq(MULTIPLEX, NONE)
  }

  /**
    * M2ts Cc Descriptor
    */
  object M2tsCcDescriptorEnum {
    val DISABLED = "DISABLED"
    val ENABLED  = "ENABLED"

    val values = IndexedSeq(DISABLED, ENABLED)
  }

  /**
    * M2ts Ebif Control
    */
  object M2tsEbifControlEnum {
    val NONE        = "NONE"
    val PASSTHROUGH = "PASSTHROUGH"

    val values = IndexedSeq(NONE, PASSTHROUGH)
  }

  /**
    * M2ts Ebp Placement
    */
  object M2tsEbpPlacementEnum {
    val VIDEO_AND_AUDIO_PIDS = "VIDEO_AND_AUDIO_PIDS"
    val VIDEO_PID            = "VIDEO_PID"

    val values = IndexedSeq(VIDEO_AND_AUDIO_PIDS, VIDEO_PID)
  }

  /**
    * M2ts Es Rate In Pes
    */
  object M2tsEsRateInPesEnum {
    val EXCLUDE = "EXCLUDE"
    val INCLUDE = "INCLUDE"

    val values = IndexedSeq(EXCLUDE, INCLUDE)
  }

  /**
    * M2ts Klv
    */
  object M2tsKlvEnum {
    val NONE        = "NONE"
    val PASSTHROUGH = "PASSTHROUGH"

    val values = IndexedSeq(NONE, PASSTHROUGH)
  }

  /**
    * M2ts Pcr Control
    */
  object M2tsPcrControlEnum {
    val CONFIGURED_PCR_PERIOD = "CONFIGURED_PCR_PERIOD"
    val PCR_EVERY_PES_PACKET  = "PCR_EVERY_PES_PACKET"

    val values = IndexedSeq(CONFIGURED_PCR_PERIOD, PCR_EVERY_PES_PACKET)
  }

  /**
    * M2ts Rate Mode
    */
  object M2tsRateModeEnum {
    val CBR = "CBR"
    val VBR = "VBR"

    val values = IndexedSeq(CBR, VBR)
  }

  /**
    * M2ts Scte35 Control
    */
  object M2tsScte35ControlEnum {
    val NONE        = "NONE"
    val PASSTHROUGH = "PASSTHROUGH"

    val values = IndexedSeq(NONE, PASSTHROUGH)
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

    val values = IndexedSeq(EBP, EBP_LEGACY, NONE, PSI_SEGSTART, RAI_ADAPT, RAI_SEGSTART)
  }

  /**
    * M2ts Segmentation Style
    */
  object M2tsSegmentationStyleEnum {
    val MAINTAIN_CADENCE = "MAINTAIN_CADENCE"
    val RESET_CADENCE    = "RESET_CADENCE"

    val values = IndexedSeq(MAINTAIN_CADENCE, RESET_CADENCE)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AbsentInputAudioBehavior" -> AbsentInputAudioBehavior.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Arib" -> Arib.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AribCaptionsPid" -> AribCaptionsPid.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AribCaptionsPidControl" -> AribCaptionsPidControl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AudioBufferModel" -> AudioBufferModel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AudioFramesPerPes" -> AudioFramesPerPes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AudioPids" -> AudioPids.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AudioStreamType" -> AudioStreamType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Bitrate" -> Bitrate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BufferModel" -> BufferModel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CcDescriptor" -> CcDescriptor.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DvbNitSettings" -> DvbNitSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DvbSdtSettings" -> DvbSdtSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DvbSubPids" -> DvbSubPids.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DvbTdtSettings" -> DvbTdtSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DvbTeletextPid" -> DvbTeletextPid.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Ebif" -> Ebif.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EbpAudioInterval" -> EbpAudioInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EbpLookaheadMs" -> EbpLookaheadMs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EbpPlacement" -> EbpPlacement.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EcmPid" -> EcmPid.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EsRateInPes" -> EsRateInPes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EtvPlatformPid" -> EtvPlatformPid.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EtvSignalPid" -> EtvSignalPid.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FragmentTime" -> FragmentTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Klv" -> Klv.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KlvDataPids" -> KlvDataPids.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NullPacketBitrate" -> NullPacketBitrate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PatInterval" -> PatInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PcrControl" -> PcrControl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PcrPeriod" -> PcrPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PcrPid" -> PcrPid.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PmtInterval" -> PmtInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PmtPid" -> PmtPid.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProgramNum" -> ProgramNum.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RateMode" -> RateMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Scte27Pids" -> Scte27Pids.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Scte35Control" -> Scte35Control.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Scte35Pid" -> Scte35Pid.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentationMarkers" -> SegmentationMarkers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentationStyle" -> SegmentationStyle.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentationTime" -> SegmentationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimedMetadataBehavior" -> TimedMetadataBehavior.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimedMetadataPid" -> TimedMetadataPid.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TransportStreamId" -> TransportStreamId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VideoPid" -> VideoPid.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[M2tsSettings]
    }
  }

  /**
    * M2ts Timed Metadata Behavior
    */
  object M2tsTimedMetadataBehaviorEnum {
    val NO_PASSTHROUGH = "NO_PASSTHROUGH"
    val PASSTHROUGH    = "PASSTHROUGH"

    val values = IndexedSeq(NO_PASSTHROUGH, PASSTHROUGH)
  }

  /**
    * M3u8 Pcr Control
    */
  object M3u8PcrControlEnum {
    val CONFIGURED_PCR_PERIOD = "CONFIGURED_PCR_PERIOD"
    val PCR_EVERY_PES_PACKET  = "PCR_EVERY_PES_PACKET"

    val values = IndexedSeq(CONFIGURED_PCR_PERIOD, PCR_EVERY_PES_PACKET)
  }

  /**
    * M3u8 Scte35 Behavior
    */
  object M3u8Scte35BehaviorEnum {
    val NO_PASSTHROUGH = "NO_PASSTHROUGH"
    val PASSTHROUGH    = "PASSTHROUGH"

    val values = IndexedSeq(NO_PASSTHROUGH, PASSTHROUGH)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AudioFramesPerPes" -> AudioFramesPerPes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AudioPids" -> AudioPids.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EcmPid" -> EcmPid.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PatInterval" -> PatInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PcrControl" -> PcrControl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PcrPeriod" -> PcrPeriod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PcrPid" -> PcrPid.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PmtInterval" -> PmtInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PmtPid" -> PmtPid.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProgramNum" -> ProgramNum.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Scte35Behavior" -> Scte35Behavior.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Scte35Pid" -> Scte35Pid.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimedMetadataBehavior" -> TimedMetadataBehavior.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimedMetadataPid" -> TimedMetadataPid.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TransportStreamId" -> TransportStreamId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VideoPid" -> VideoPid.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[M3u8Settings]
    }
  }

  /**
    * M3u8 Timed Metadata Behavior
    */
  object M3u8TimedMetadataBehaviorEnum {
    val NO_PASSTHROUGH = "NO_PASSTHROUGH"
    val PASSTHROUGH    = "PASSTHROUGH"

    val values = IndexedSeq(NO_PASSTHROUGH, PASSTHROUGH)
  }

  /**
    * The settings for a MediaConnect Flow.
    */
  @js.native
  trait MediaConnectFlow extends js.Object {
    var FlowArn: js.UndefOr[__string]
  }

  object MediaConnectFlow {
    def apply(
        FlowArn: js.UndefOr[__string] = js.undefined
    ): MediaConnectFlow = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlowArn" -> FlowArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MediaConnectFlow]
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
    def apply(
        FlowArn: js.UndefOr[__string] = js.undefined
    ): MediaConnectFlowRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlowArn" -> FlowArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MediaConnectFlowRequest]
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
    def apply(
        Destination: OutputLocationRef
    ): MediaPackageGroupSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Destination" -> Destination.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MediaPackageGroupSettings]
    }
  }

  /**
    * Media Package Output Destination Settings
    */
  @js.native
  trait MediaPackageOutputDestinationSettings extends js.Object {
    var ChannelId: js.UndefOr[__stringMin1]
  }

  object MediaPackageOutputDestinationSettings {
    def apply(
        ChannelId: js.UndefOr[__stringMin1] = js.undefined
    ): MediaPackageOutputDestinationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChannelId" -> ChannelId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MediaPackageOutputDestinationSettings]
    }
  }

  /**
    * Media Package Output Settings
    */
  @js.native
  trait MediaPackageOutputSettings extends js.Object {}

  object MediaPackageOutputSettings {
    def apply(
        ): MediaPackageOutputSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MediaPackageOutputSettings]
    }
  }

  /**
    * Mp2 Coding Mode
    */
  object Mp2CodingModeEnum {
    val CODING_MODE_1_0 = "CODING_MODE_1_0"
    val CODING_MODE_2_0 = "CODING_MODE_2_0"

    val values = IndexedSeq(CODING_MODE_1_0, CODING_MODE_2_0)
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
    def apply(
        Bitrate: js.UndefOr[__double] = js.undefined,
        CodingMode: js.UndefOr[Mp2CodingMode] = js.undefined,
        SampleRate: js.UndefOr[__double] = js.undefined
    ): Mp2Settings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bitrate" -> Bitrate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CodingMode" -> CodingMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SampleRate" -> SampleRate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Mp2Settings]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Destination" -> Destination.asInstanceOf[js.Any],
        "AcquisitionPointId" -> AcquisitionPointId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AudioOnlyTimecodeControl" -> AudioOnlyTimecodeControl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CertificateMode" -> CertificateMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConnectionRetryInterval" -> ConnectionRetryInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventId" -> EventId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventIdMode" -> EventIdMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventStopBehavior" -> EventStopBehavior.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FilecacheDuration" -> FilecacheDuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FragmentLength" -> FragmentLength.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputLossAction" -> InputLossAction.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumRetries" -> NumRetries.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RestartDelay" -> RestartDelay.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentationMode" -> SegmentationMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SendDelayMs" -> SendDelayMs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SparseTrackType" -> SparseTrackType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StreamManifestBehavior" -> StreamManifestBehavior.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimestampOffset" -> TimestampOffset.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimestampOffsetMode" -> TimestampOffsetMode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MsSmoothGroupSettings]
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
    def apply(
        NameModifier: js.UndefOr[__string] = js.undefined
    ): MsSmoothOutputSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NameModifier" -> NameModifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MsSmoothOutputSettings]
    }
  }

  /**
    * Network Input Server Validation
    */
  object NetworkInputServerValidationEnum {
    val CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME = "CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME"
    val CHECK_CRYPTOGRAPHY_ONLY              = "CHECK_CRYPTOGRAPHY_ONLY"

    val values = IndexedSeq(CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME, CHECK_CRYPTOGRAPHY_ONLY)
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
    def apply(
        HlsInputSettings: js.UndefOr[HlsInputSettings] = js.undefined,
        ServerValidation: js.UndefOr[NetworkInputServerValidation] = js.undefined
    ): NetworkInputSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HlsInputSettings" -> HlsInputSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServerValidation" -> ServerValidation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInputSettings]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CurrencyCode" -> CurrencyCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Duration" -> Duration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DurationUnits" -> DurationUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FixedPrice" -> FixedPrice.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingDescription" -> OfferingDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingId" -> OfferingId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingType" -> OfferingType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Region" -> Region.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceSpecification" -> ResourceSpecification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UsagePrice" -> UsagePrice.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Offering]
    }
  }

  /**
    * Units for duration, e.g. 'MONTHS'
    */
  object OfferingDurationUnitsEnum {
    val MONTHS = "MONTHS"

    val values = IndexedSeq(MONTHS)
  }

  /**
    * Offering type, e.g. 'NO_UPFRONT'
    */
  object OfferingTypeEnum {
    val NO_UPFRONT = "NO_UPFRONT"

    val values = IndexedSeq(NO_UPFRONT)
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
    def apply(
        OutputSettings: OutputSettings,
        AudioDescriptionNames: js.UndefOr[__listOf__string] = js.undefined,
        CaptionDescriptionNames: js.UndefOr[__listOf__string] = js.undefined,
        OutputName: js.UndefOr[__stringMin1Max255] = js.undefined,
        VideoDescriptionName: js.UndefOr[__string] = js.undefined
    ): Output = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OutputSettings" -> OutputSettings.asInstanceOf[js.Any],
        "AudioDescriptionNames" -> AudioDescriptionNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CaptionDescriptionNames" -> CaptionDescriptionNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OutputName" -> OutputName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VideoDescriptionName" -> VideoDescriptionName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Output]
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
    def apply(
        Id: js.UndefOr[__string] = js.undefined,
        MediaPackageSettings: js.UndefOr[__listOfMediaPackageOutputDestinationSettings] = js.undefined,
        Settings: js.UndefOr[__listOfOutputDestinationSettings] = js.undefined
    ): OutputDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MediaPackageSettings" -> MediaPackageSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Settings" -> Settings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputDestination]
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
    def apply(
        PasswordParam: js.UndefOr[__string] = js.undefined,
        StreamName: js.UndefOr[__string] = js.undefined,
        Url: js.UndefOr[__string] = js.undefined,
        Username: js.UndefOr[__string] = js.undefined
    ): OutputDestinationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PasswordParam" -> PasswordParam.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StreamName" -> StreamName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Url" -> Url.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Username" -> Username.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputDestinationSettings]
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
    def apply(
        OutputGroupSettings: OutputGroupSettings,
        Outputs: __listOfOutput,
        Name: js.UndefOr[__stringMax32] = js.undefined
    ): OutputGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OutputGroupSettings" -> OutputGroupSettings.asInstanceOf[js.Any],
        "Outputs"             -> Outputs.asInstanceOf[js.Any],
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputGroup]
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
    def apply(
        ArchiveGroupSettings: js.UndefOr[ArchiveGroupSettings] = js.undefined,
        FrameCaptureGroupSettings: js.UndefOr[FrameCaptureGroupSettings] = js.undefined,
        HlsGroupSettings: js.UndefOr[HlsGroupSettings] = js.undefined,
        MediaPackageGroupSettings: js.UndefOr[MediaPackageGroupSettings] = js.undefined,
        MsSmoothGroupSettings: js.UndefOr[MsSmoothGroupSettings] = js.undefined,
        RtmpGroupSettings: js.UndefOr[RtmpGroupSettings] = js.undefined,
        UdpGroupSettings: js.UndefOr[UdpGroupSettings] = js.undefined
    ): OutputGroupSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ArchiveGroupSettings" -> ArchiveGroupSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FrameCaptureGroupSettings" -> FrameCaptureGroupSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsGroupSettings" -> HlsGroupSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MediaPackageGroupSettings" -> MediaPackageGroupSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MsSmoothGroupSettings" -> MsSmoothGroupSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RtmpGroupSettings" -> RtmpGroupSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UdpGroupSettings" -> UdpGroupSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputGroupSettings]
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
    def apply(
        DestinationRefId: js.UndefOr[__string] = js.undefined
    ): OutputLocationRef = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationRefId" -> DestinationRefId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputLocationRef]
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
    def apply(
        ArchiveOutputSettings: js.UndefOr[ArchiveOutputSettings] = js.undefined,
        FrameCaptureOutputSettings: js.UndefOr[FrameCaptureOutputSettings] = js.undefined,
        HlsOutputSettings: js.UndefOr[HlsOutputSettings] = js.undefined,
        MediaPackageOutputSettings: js.UndefOr[MediaPackageOutputSettings] = js.undefined,
        MsSmoothOutputSettings: js.UndefOr[MsSmoothOutputSettings] = js.undefined,
        RtmpOutputSettings: js.UndefOr[RtmpOutputSettings] = js.undefined,
        UdpOutputSettings: js.UndefOr[UdpOutputSettings] = js.undefined
    ): OutputSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ArchiveOutputSettings" -> ArchiveOutputSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FrameCaptureOutputSettings" -> FrameCaptureOutputSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HlsOutputSettings" -> HlsOutputSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MediaPackageOutputSettings" -> MediaPackageOutputSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MsSmoothOutputSettings" -> MsSmoothOutputSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RtmpOutputSettings" -> RtmpOutputSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UdpOutputSettings" -> UdpOutputSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputSettings]
    }
  }

  /**
    * Pass Through Settings
    */
  @js.native
  trait PassThroughSettings extends js.Object {}

  object PassThroughSettings {
    def apply(
        ): PassThroughSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PassThroughSettings]
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
    def apply(
        Pipelines: js.UndefOr[__listOfPipelinePauseStateSettings] = js.undefined
    ): PauseStateScheduleActionSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Pipelines" -> Pipelines.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PauseStateScheduleActionSettings]
    }
  }

  /**
    * Pipeline ID
    */
  object PipelineIdEnum {
    val PIPELINE_0 = "PIPELINE_0"
    val PIPELINE_1 = "PIPELINE_1"

    val values = IndexedSeq(PIPELINE_0, PIPELINE_1)
  }

  /**
    * Settings for pausing a pipeline.
    */
  @js.native
  trait PipelinePauseStateSettings extends js.Object {
    var PipelineId: PipelineId
  }

  object PipelinePauseStateSettings {
    def apply(
        PipelineId: PipelineId
    ): PipelinePauseStateSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PipelineId" -> PipelineId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PipelinePauseStateSettings]
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
    def apply(
        Count: __integerMin1,
        OfferingId: __string,
        Name: js.UndefOr[__string] = js.undefined,
        RequestId: js.UndefOr[__string] = js.undefined,
        Start: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): PurchaseOfferingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Count"      -> Count.asInstanceOf[js.Any],
        "OfferingId" -> OfferingId.asInstanceOf[js.Any],
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestId" -> RequestId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Start" -> Start.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseOfferingRequest]
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
    def apply(
        Reservation: js.UndefOr[Reservation] = js.undefined
    ): PurchaseOfferingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Reservation" -> Reservation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseOfferingResponse]
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
    def apply(
        ChannelMappings: __listOfAudioChannelMapping,
        ChannelsIn: js.UndefOr[__integerMin1Max16] = js.undefined,
        ChannelsOut: js.UndefOr[__integerMin1Max8] = js.undefined
    ): RemixSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChannelMappings" -> ChannelMappings.asInstanceOf[js.Any],
        "ChannelsIn" -> ChannelsIn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChannelsOut" -> ChannelsOut.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemixSettings]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Count" -> Count.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CurrencyCode" -> CurrencyCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Duration" -> Duration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DurationUnits" -> DurationUnits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "End" -> End.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FixedPrice" -> FixedPrice.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingDescription" -> OfferingDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingId" -> OfferingId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OfferingType" -> OfferingType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Region" -> Region.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReservationId" -> ReservationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceSpecification" -> ResourceSpecification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Start" -> Start.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UsagePrice" -> UsagePrice.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Reservation]
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

    val values = IndexedSeq(MPEG2, AVC, HEVC, AUDIO)
  }

  /**
    * Maximum bitrate in megabits per second
    */
  object ReservationMaximumBitrateEnum {
    val MAX_10_MBPS = "MAX_10_MBPS"
    val MAX_20_MBPS = "MAX_20_MBPS"
    val MAX_50_MBPS = "MAX_50_MBPS"

    val values = IndexedSeq(MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS)
  }

  /**
    * Maximum framerate in frames per second (Outputs only)
    */
  object ReservationMaximumFramerateEnum {
    val MAX_30_FPS = "MAX_30_FPS"
    val MAX_60_FPS = "MAX_60_FPS"

    val values = IndexedSeq(MAX_30_FPS, MAX_60_FPS)
  }

  /**
    * Resolution based on lines of vertical resolution; SD is less than 720 lines, HD is 720 to 1080 lines, UHD is greater than 1080 lines
    */
  object ReservationResolutionEnum {
    val SD  = "SD"
    val HD  = "HD"
    val UHD = "UHD"

    val values = IndexedSeq(SD, HD, UHD)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ChannelClass" -> ChannelClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Codec" -> Codec.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaximumBitrate" -> MaximumBitrate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaximumFramerate" -> MaximumFramerate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Resolution" -> Resolution.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceType" -> ResourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SpecialFeature" -> SpecialFeature.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VideoQuality" -> VideoQuality.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservationResourceSpecification]
    }
  }

  /**
    * Resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
    */
  object ReservationResourceTypeEnum {
    val INPUT   = "INPUT"
    val OUTPUT  = "OUTPUT"
    val CHANNEL = "CHANNEL"

    val values = IndexedSeq(INPUT, OUTPUT, CHANNEL)
  }

  /**
    * Special features, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
    */
  object ReservationSpecialFeatureEnum {
    val ADVANCED_AUDIO      = "ADVANCED_AUDIO"
    val AUDIO_NORMALIZATION = "AUDIO_NORMALIZATION"

    val values = IndexedSeq(ADVANCED_AUDIO, AUDIO_NORMALIZATION)
  }

  /**
    * Current reservation state
    */
  object ReservationStateEnum {
    val ACTIVE   = "ACTIVE"
    val EXPIRED  = "EXPIRED"
    val CANCELED = "CANCELED"
    val DELETED  = "DELETED"

    val values = IndexedSeq(ACTIVE, EXPIRED, CANCELED, DELETED)
  }

  /**
    * Video quality, e.g. 'STANDARD' (Outputs only)
    */
  object ReservationVideoQualityEnum {
    val STANDARD = "STANDARD"
    val ENHANCED = "ENHANCED"
    val PREMIUM  = "PREMIUM"

    val values = IndexedSeq(STANDARD, ENHANCED, PREMIUM)
  }

  /**
    * Rtmp Cache Full Behavior
    */
  object RtmpCacheFullBehaviorEnum {
    val DISCONNECT_IMMEDIATELY = "DISCONNECT_IMMEDIATELY"
    val WAIT_FOR_SERVER        = "WAIT_FOR_SERVER"

    val values = IndexedSeq(DISCONNECT_IMMEDIATELY, WAIT_FOR_SERVER)
  }

  /**
    * Rtmp Caption Data
    */
  object RtmpCaptionDataEnum {
    val ALL                   = "ALL"
    val FIELD1_608            = "FIELD1_608"
    val FIELD1_AND_FIELD2_608 = "FIELD1_AND_FIELD2_608"

    val values = IndexedSeq(ALL, FIELD1_608, FIELD1_AND_FIELD2_608)
  }

  /**
    * Rtmp Caption Info Destination Settings
    */
  @js.native
  trait RtmpCaptionInfoDestinationSettings extends js.Object {}

  object RtmpCaptionInfoDestinationSettings {
    def apply(
        ): RtmpCaptionInfoDestinationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RtmpCaptionInfoDestinationSettings]
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
    def apply(
        AuthenticationScheme: js.UndefOr[AuthenticationScheme] = js.undefined,
        CacheFullBehavior: js.UndefOr[RtmpCacheFullBehavior] = js.undefined,
        CacheLength: js.UndefOr[__integerMin30] = js.undefined,
        CaptionData: js.UndefOr[RtmpCaptionData] = js.undefined,
        InputLossAction: js.UndefOr[InputLossActionForRtmpOut] = js.undefined,
        RestartDelay: js.UndefOr[__integerMin0] = js.undefined
    ): RtmpGroupSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthenticationScheme" -> AuthenticationScheme.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CacheFullBehavior" -> CacheFullBehavior.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CacheLength" -> CacheLength.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CaptionData" -> CaptionData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputLossAction" -> InputLossAction.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RestartDelay" -> RestartDelay.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RtmpGroupSettings]
    }
  }

  /**
    * Rtmp Output Certificate Mode
    */
  object RtmpOutputCertificateModeEnum {
    val SELF_SIGNED         = "SELF_SIGNED"
    val VERIFY_AUTHENTICITY = "VERIFY_AUTHENTICITY"

    val values = IndexedSeq(SELF_SIGNED, VERIFY_AUTHENTICITY)
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
    def apply(
        Destination: OutputLocationRef,
        CertificateMode: js.UndefOr[RtmpOutputCertificateMode] = js.undefined,
        ConnectionRetryInterval: js.UndefOr[__integerMin1] = js.undefined,
        NumRetries: js.UndefOr[__integerMin0] = js.undefined
    ): RtmpOutputSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Destination" -> Destination.asInstanceOf[js.Any],
        "CertificateMode" -> CertificateMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConnectionRetryInterval" -> ConnectionRetryInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NumRetries" -> NumRetries.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RtmpOutputSettings]
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
    def apply(
        ActionName: __string,
        ScheduleActionSettings: ScheduleActionSettings,
        ScheduleActionStartSettings: ScheduleActionStartSettings
    ): ScheduleAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActionName"                  -> ActionName.asInstanceOf[js.Any],
        "ScheduleActionSettings"      -> ScheduleActionSettings.asInstanceOf[js.Any],
        "ScheduleActionStartSettings" -> ScheduleActionStartSettings.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleAction]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "HlsTimedMetadataSettings" -> HlsTimedMetadataSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputSwitchSettings" -> InputSwitchSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PauseStateSettings" -> PauseStateSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Scte35ReturnToNetworkSettings" -> Scte35ReturnToNetworkSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Scte35SpliceInsertSettings" -> Scte35SpliceInsertSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Scte35TimeSignalSettings" -> Scte35TimeSignalSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StaticImageActivateSettings" -> StaticImageActivateSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StaticImageDeactivateSettings" -> StaticImageDeactivateSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleActionSettings]
    }
  }

  /**
    * Settings to specify the start time for an action.
    */
  @js.native
  trait ScheduleActionStartSettings extends js.Object {
    var FixedModeScheduleActionStartSettings: js.UndefOr[FixedModeScheduleActionStartSettings]
    var FollowModeScheduleActionStartSettings: js.UndefOr[FollowModeScheduleActionStartSettings]
  }

  object ScheduleActionStartSettings {
    def apply(
        FixedModeScheduleActionStartSettings: js.UndefOr[FixedModeScheduleActionStartSettings] = js.undefined,
        FollowModeScheduleActionStartSettings: js.UndefOr[FollowModeScheduleActionStartSettings] = js.undefined
    ): ScheduleActionStartSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FixedModeScheduleActionStartSettings" -> FixedModeScheduleActionStartSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FollowModeScheduleActionStartSettings" -> FollowModeScheduleActionStartSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleActionStartSettings]
    }
  }

  /**
    * Scte20 Convert608 To708
    */
  object Scte20Convert608To708Enum {
    val DISABLED  = "DISABLED"
    val UPCONVERT = "UPCONVERT"

    val values = IndexedSeq(DISABLED, UPCONVERT)
  }

  /**
    * Scte20 Plus Embedded Destination Settings
    */
  @js.native
  trait Scte20PlusEmbeddedDestinationSettings extends js.Object {}

  object Scte20PlusEmbeddedDestinationSettings {
    def apply(
        ): Scte20PlusEmbeddedDestinationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Scte20PlusEmbeddedDestinationSettings]
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
    def apply(
        Convert608To708: js.UndefOr[Scte20Convert608To708] = js.undefined,
        Source608ChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined
    ): Scte20SourceSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Convert608To708" -> Convert608To708.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Source608ChannelNumber" -> Source608ChannelNumber.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Scte20SourceSettings]
    }
  }

  /**
    * Scte27 Destination Settings
    */
  @js.native
  trait Scte27DestinationSettings extends js.Object {}

  object Scte27DestinationSettings {
    def apply(
        ): Scte27DestinationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Scte27DestinationSettings]
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
    def apply(
        Pid: js.UndefOr[__integerMin1] = js.undefined
    ): Scte27SourceSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Pid" -> Pid.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Scte27SourceSettings]
    }
  }

  /**
    * Scte35 Apos No Regional Blackout Behavior
    */
  object Scte35AposNoRegionalBlackoutBehaviorEnum {
    val FOLLOW = "FOLLOW"
    val IGNORE = "IGNORE"

    val values = IndexedSeq(FOLLOW, IGNORE)
  }

  /**
    * Scte35 Apos Web Delivery Allowed Behavior
    */
  object Scte35AposWebDeliveryAllowedBehaviorEnum {
    val FOLLOW = "FOLLOW"
    val IGNORE = "IGNORE"

    val values = IndexedSeq(FOLLOW, IGNORE)
  }

  /**
    * Corresponds to the archive_allowed parameter. A value of ARCHIVE_NOT_ALLOWED corresponds to 0 (false) in the SCTE-35 specification. If you include one of the "restriction" flags then you must include all four of them.
    */
  object Scte35ArchiveAllowedFlagEnum {
    val ARCHIVE_NOT_ALLOWED = "ARCHIVE_NOT_ALLOWED"
    val ARCHIVE_ALLOWED     = "ARCHIVE_ALLOWED"

    val values = IndexedSeq(ARCHIVE_NOT_ALLOWED, ARCHIVE_ALLOWED)
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
    def apply(
        ArchiveAllowedFlag: Scte35ArchiveAllowedFlag,
        DeviceRestrictions: Scte35DeviceRestrictions,
        NoRegionalBlackoutFlag: Scte35NoRegionalBlackoutFlag,
        WebDeliveryAllowedFlag: Scte35WebDeliveryAllowedFlag
    ): Scte35DeliveryRestrictions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ArchiveAllowedFlag"     -> ArchiveAllowedFlag.asInstanceOf[js.Any],
        "DeviceRestrictions"     -> DeviceRestrictions.asInstanceOf[js.Any],
        "NoRegionalBlackoutFlag" -> NoRegionalBlackoutFlag.asInstanceOf[js.Any],
        "WebDeliveryAllowedFlag" -> WebDeliveryAllowedFlag.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Scte35DeliveryRestrictions]
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
    def apply(
        Scte35DescriptorSettings: Scte35DescriptorSettings
    ): Scte35Descriptor = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Scte35DescriptorSettings" -> Scte35DescriptorSettings.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Scte35Descriptor]
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
    def apply(
        SegmentationDescriptorScte35DescriptorSettings: Scte35SegmentationDescriptor
    ): Scte35DescriptorSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SegmentationDescriptorScte35DescriptorSettings" -> SegmentationDescriptorScte35DescriptorSettings
          .asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Scte35DescriptorSettings]
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

    val values = IndexedSeq(NONE, RESTRICT_GROUP0, RESTRICT_GROUP1, RESTRICT_GROUP2)
  }

  /**
    * Corresponds to the no_regional_blackout_flag parameter. A value of REGIONAL_BLACKOUT corresponds to 0 (false) in the SCTE-35 specification. If you include one of the "restriction" flags then you must include all four of them.
    */
  object Scte35NoRegionalBlackoutFlagEnum {
    val REGIONAL_BLACKOUT    = "REGIONAL_BLACKOUT"
    val NO_REGIONAL_BLACKOUT = "NO_REGIONAL_BLACKOUT"

    val values = IndexedSeq(REGIONAL_BLACKOUT, NO_REGIONAL_BLACKOUT)
  }

  /**
    * Settings for a SCTE-35 return_to_network message.
    */
  @js.native
  trait Scte35ReturnToNetworkScheduleActionSettings extends js.Object {
    var SpliceEventId: __integerMin0Max4294967295
  }

  object Scte35ReturnToNetworkScheduleActionSettings {
    def apply(
        SpliceEventId: __integerMin0Max4294967295
    ): Scte35ReturnToNetworkScheduleActionSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SpliceEventId" -> SpliceEventId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[Scte35ReturnToNetworkScheduleActionSettings]
    }
  }

  /**
    * Corresponds to SCTE-35 segmentation_event_cancel_indicator. SEGMENTATION_EVENT_NOT_CANCELED corresponds to 0 in the SCTE-35 specification and indicates that this is an insertion request. SEGMENTATION_EVENT_CANCELED corresponds to 1 in the SCTE-35 specification and indicates that this is a cancelation request, in which case complete this field and the existing event ID to cancel.
    */
  object Scte35SegmentationCancelIndicatorEnum {
    val SEGMENTATION_EVENT_NOT_CANCELED = "SEGMENTATION_EVENT_NOT_CANCELED"
    val SEGMENTATION_EVENT_CANCELED     = "SEGMENTATION_EVENT_CANCELED"

    val values = IndexedSeq(SEGMENTATION_EVENT_NOT_CANCELED, SEGMENTATION_EVENT_CANCELED)
  }

  /**
    * Corresponds to SCTE-35 segmentation_descriptor.
    */
  @js.native
  trait Scte35SegmentationDescriptor extends js.Object {
    var SegmentationCancelIndicator: Scte35SegmentationCancelIndicator
    var SegmentationEventId: __integerMin0Max4294967295
    var DeliveryRestrictions: js.UndefOr[Scte35DeliveryRestrictions]
    var SegmentNum: js.UndefOr[__integerMin0Max255]
    var SegmentationDuration: js.UndefOr[__integerMin0Max1099511627775]
    var SegmentationTypeId: js.UndefOr[__integerMin0Max255]
    var SegmentationUpid: js.UndefOr[__string]
    var SegmentationUpidType: js.UndefOr[__integerMin0Max255]
    var SegmentsExpected: js.UndefOr[__integerMin0Max255]
    var SubSegmentNum: js.UndefOr[__integerMin0Max255]
    var SubSegmentsExpected: js.UndefOr[__integerMin0Max255]
  }

  object Scte35SegmentationDescriptor {
    def apply(
        SegmentationCancelIndicator: Scte35SegmentationCancelIndicator,
        SegmentationEventId: __integerMin0Max4294967295,
        DeliveryRestrictions: js.UndefOr[Scte35DeliveryRestrictions] = js.undefined,
        SegmentNum: js.UndefOr[__integerMin0Max255] = js.undefined,
        SegmentationDuration: js.UndefOr[__integerMin0Max1099511627775] = js.undefined,
        SegmentationTypeId: js.UndefOr[__integerMin0Max255] = js.undefined,
        SegmentationUpid: js.UndefOr[__string] = js.undefined,
        SegmentationUpidType: js.UndefOr[__integerMin0Max255] = js.undefined,
        SegmentsExpected: js.UndefOr[__integerMin0Max255] = js.undefined,
        SubSegmentNum: js.UndefOr[__integerMin0Max255] = js.undefined,
        SubSegmentsExpected: js.UndefOr[__integerMin0Max255] = js.undefined
    ): Scte35SegmentationDescriptor = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SegmentationCancelIndicator" -> SegmentationCancelIndicator.asInstanceOf[js.Any],
        "SegmentationEventId"         -> SegmentationEventId.asInstanceOf[js.Any],
        "DeliveryRestrictions" -> DeliveryRestrictions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentNum" -> SegmentNum.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentationDuration" -> SegmentationDuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentationTypeId" -> SegmentationTypeId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentationUpid" -> SegmentationUpid.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentationUpidType" -> SegmentationUpidType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SegmentsExpected" -> SegmentsExpected.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubSegmentNum" -> SubSegmentNum.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubSegmentsExpected" -> SubSegmentsExpected.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Scte35SegmentationDescriptor]
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
    def apply(
        AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000] = js.undefined,
        NoRegionalBlackoutFlag: js.UndefOr[Scte35SpliceInsertNoRegionalBlackoutBehavior] = js.undefined,
        WebDeliveryAllowedFlag: js.UndefOr[Scte35SpliceInsertWebDeliveryAllowedBehavior] = js.undefined
    ): Scte35SpliceInsert = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdAvailOffset" -> AdAvailOffset.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NoRegionalBlackoutFlag" -> NoRegionalBlackoutFlag.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WebDeliveryAllowedFlag" -> WebDeliveryAllowedFlag.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Scte35SpliceInsert]
    }
  }

  /**
    * Scte35 Splice Insert No Regional Blackout Behavior
    */
  object Scte35SpliceInsertNoRegionalBlackoutBehaviorEnum {
    val FOLLOW = "FOLLOW"
    val IGNORE = "IGNORE"

    val values = IndexedSeq(FOLLOW, IGNORE)
  }

  /**
    * Settings for a SCTE-35 splice_insert message.
    */
  @js.native
  trait Scte35SpliceInsertScheduleActionSettings extends js.Object {
    var SpliceEventId: __integerMin0Max4294967295
    var Duration: js.UndefOr[__integerMin0Max8589934591]
  }

  object Scte35SpliceInsertScheduleActionSettings {
    def apply(
        SpliceEventId: __integerMin0Max4294967295,
        Duration: js.UndefOr[__integerMin0Max8589934591] = js.undefined
    ): Scte35SpliceInsertScheduleActionSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SpliceEventId" -> SpliceEventId.asInstanceOf[js.Any],
        "Duration" -> Duration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Scte35SpliceInsertScheduleActionSettings]
    }
  }

  /**
    * Scte35 Splice Insert Web Delivery Allowed Behavior
    */
  object Scte35SpliceInsertWebDeliveryAllowedBehaviorEnum {
    val FOLLOW = "FOLLOW"
    val IGNORE = "IGNORE"

    val values = IndexedSeq(FOLLOW, IGNORE)
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
    def apply(
        AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000] = js.undefined,
        NoRegionalBlackoutFlag: js.UndefOr[Scte35AposNoRegionalBlackoutBehavior] = js.undefined,
        WebDeliveryAllowedFlag: js.UndefOr[Scte35AposWebDeliveryAllowedBehavior] = js.undefined
    ): Scte35TimeSignalApos = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdAvailOffset" -> AdAvailOffset.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NoRegionalBlackoutFlag" -> NoRegionalBlackoutFlag.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WebDeliveryAllowedFlag" -> WebDeliveryAllowedFlag.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Scte35TimeSignalApos]
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
    def apply(
        Scte35Descriptors: __listOfScte35Descriptor
    ): Scte35TimeSignalScheduleActionSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Scte35Descriptors" -> Scte35Descriptors.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Scte35TimeSignalScheduleActionSettings]
    }
  }

  /**
    * Corresponds to the web_delivery_allowed_flag parameter. A value of WEB_DELIVERY_NOT_ALLOWED corresponds to 0 (false) in the SCTE-35 specification. If you include one of the "restriction" flags then you must include all four of them.
    */
  object Scte35WebDeliveryAllowedFlagEnum {
    val WEB_DELIVERY_NOT_ALLOWED = "WEB_DELIVERY_NOT_ALLOWED"
    val WEB_DELIVERY_ALLOWED     = "WEB_DELIVERY_ALLOWED"

    val values = IndexedSeq(WEB_DELIVERY_NOT_ALLOWED, WEB_DELIVERY_ALLOWED)
  }

  /**
    * Smooth Group Audio Only Timecode Control
    */
  object SmoothGroupAudioOnlyTimecodeControlEnum {
    val PASSTHROUGH          = "PASSTHROUGH"
    val USE_CONFIGURED_CLOCK = "USE_CONFIGURED_CLOCK"

    val values = IndexedSeq(PASSTHROUGH, USE_CONFIGURED_CLOCK)
  }

  /**
    * Smooth Group Certificate Mode
    */
  object SmoothGroupCertificateModeEnum {
    val SELF_SIGNED         = "SELF_SIGNED"
    val VERIFY_AUTHENTICITY = "VERIFY_AUTHENTICITY"

    val values = IndexedSeq(SELF_SIGNED, VERIFY_AUTHENTICITY)
  }

  /**
    * Smooth Group Event Id Mode
    */
  object SmoothGroupEventIdModeEnum {
    val NO_EVENT_ID    = "NO_EVENT_ID"
    val USE_CONFIGURED = "USE_CONFIGURED"
    val USE_TIMESTAMP  = "USE_TIMESTAMP"

    val values = IndexedSeq(NO_EVENT_ID, USE_CONFIGURED, USE_TIMESTAMP)
  }

  /**
    * Smooth Group Event Stop Behavior
    */
  object SmoothGroupEventStopBehaviorEnum {
    val NONE     = "NONE"
    val SEND_EOS = "SEND_EOS"

    val values = IndexedSeq(NONE, SEND_EOS)
  }

  /**
    * Smooth Group Segmentation Mode
    */
  object SmoothGroupSegmentationModeEnum {
    val USE_INPUT_SEGMENTATION = "USE_INPUT_SEGMENTATION"
    val USE_SEGMENT_DURATION   = "USE_SEGMENT_DURATION"

    val values = IndexedSeq(USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION)
  }

  /**
    * Smooth Group Sparse Track Type
    */
  object SmoothGroupSparseTrackTypeEnum {
    val NONE    = "NONE"
    val SCTE_35 = "SCTE_35"

    val values = IndexedSeq(NONE, SCTE_35)
  }

  /**
    * Smooth Group Stream Manifest Behavior
    */
  object SmoothGroupStreamManifestBehaviorEnum {
    val DO_NOT_SEND = "DO_NOT_SEND"
    val SEND        = "SEND"

    val values = IndexedSeq(DO_NOT_SEND, SEND)
  }

  /**
    * Smooth Group Timestamp Offset Mode
    */
  object SmoothGroupTimestampOffsetModeEnum {
    val USE_CONFIGURED_OFFSET = "USE_CONFIGURED_OFFSET"
    val USE_EVENT_START_DATE  = "USE_EVENT_START_DATE"

    val values = IndexedSeq(USE_CONFIGURED_OFFSET, USE_EVENT_START_DATE)
  }

  /**
    * Smpte Tt Destination Settings
    */
  @js.native
  trait SmpteTtDestinationSettings extends js.Object {}

  object SmpteTtDestinationSettings {
    def apply(
        ): SmpteTtDestinationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SmpteTtDestinationSettings]
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
    def apply(
        M3u8Settings: M3u8Settings,
        AudioRenditionSets: js.UndefOr[__string] = js.undefined
    ): StandardHlsSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "M3u8Settings" -> M3u8Settings.asInstanceOf[js.Any],
        "AudioRenditionSets" -> AudioRenditionSets.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StandardHlsSettings]
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
    def apply(
        ChannelId: __string
    ): StartChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChannelId" -> ChannelId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartChannelRequest]
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
    var PipelinesRunningCount: js.UndefOr[__integer]
    var RoleArn: js.UndefOr[__string]
    var State: js.UndefOr[ChannelState]
    var Tags: js.UndefOr[Tags]
  }

  object StartChannelResponse {
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
        PipelinesRunningCount: js.UndefOr[__integer] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ChannelState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): StartChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChannelClass" -> ChannelClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Destinations" -> Destinations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EgressEndpoints" -> EgressEndpoints.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EncoderSettings" -> EncoderSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputAttachments" -> InputAttachments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputSpecification" -> InputSpecification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogLevel" -> LogLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PipelinesRunningCount" -> PipelinesRunningCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartChannelResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Image" -> Image.asInstanceOf[js.Any],
        "Duration" -> Duration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FadeIn" -> FadeIn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FadeOut" -> FadeOut.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Height" -> Height.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageX" -> ImageX.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageY" -> ImageY.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Layer" -> Layer.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Opacity" -> Opacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Width" -> Width.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StaticImageActivateScheduleActionSettings]
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
    def apply(
        FadeOut: js.UndefOr[__integerMin0] = js.undefined,
        Layer: js.UndefOr[__integerMin0Max7] = js.undefined
    ): StaticImageDeactivateScheduleActionSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FadeOut" -> FadeOut.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Layer" -> Layer.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[StaticImageDeactivateScheduleActionSettings]
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
    def apply(
        StaticKeyValue: __stringMin32Max32,
        KeyProviderServer: js.UndefOr[InputLocation] = js.undefined
    ): StaticKeySettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StaticKeyValue" -> StaticKeyValue.asInstanceOf[js.Any],
        "KeyProviderServer" -> KeyProviderServer.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StaticKeySettings]
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
    def apply(
        ChannelId: __string
    ): StopChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChannelId" -> ChannelId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopChannelRequest]
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
    var PipelinesRunningCount: js.UndefOr[__integer]
    var RoleArn: js.UndefOr[__string]
    var State: js.UndefOr[ChannelState]
    var Tags: js.UndefOr[Tags]
  }

  object StopChannelResponse {
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
        PipelinesRunningCount: js.UndefOr[__integer] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[ChannelState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): StopChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChannelClass" -> ChannelClass.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Destinations" -> Destinations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EgressEndpoints" -> EgressEndpoints.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EncoderSettings" -> EncoderSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputAttachments" -> InputAttachments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputSpecification" -> InputSpecification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogLevel" -> LogLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PipelinesRunningCount" -> PipelinesRunningCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopChannelResponse]
    }
  }

  /**
    * Teletext Destination Settings
    */
  @js.native
  trait TeletextDestinationSettings extends js.Object {}

  object TeletextDestinationSettings {
    def apply(
        ): TeletextDestinationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TeletextDestinationSettings]
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
    def apply(
        PageNumber: js.UndefOr[__string] = js.undefined
    ): TeletextSourceSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PageNumber" -> PageNumber.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TeletextSourceSettings]
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
    def apply(
        Source: TimecodeConfigSource,
        SyncThreshold: js.UndefOr[__integerMin1Max1000000] = js.undefined
    ): TimecodeConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Source" -> Source.asInstanceOf[js.Any],
        "SyncThreshold" -> SyncThreshold.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimecodeConfig]
    }
  }

  /**
    * Timecode Config Source
    */
  object TimecodeConfigSourceEnum {
    val EMBEDDED    = "EMBEDDED"
    val SYSTEMCLOCK = "SYSTEMCLOCK"
    val ZEROBASED   = "ZEROBASED"

    val values = IndexedSeq(EMBEDDED, SYSTEMCLOCK, ZEROBASED)
  }

  /**
    * Ttml Destination Settings
    */
  @js.native
  trait TtmlDestinationSettings extends js.Object {
    var StyleControl: js.UndefOr[TtmlDestinationStyleControl]
  }

  object TtmlDestinationSettings {
    def apply(
        StyleControl: js.UndefOr[TtmlDestinationStyleControl] = js.undefined
    ): TtmlDestinationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StyleControl" -> StyleControl.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TtmlDestinationSettings]
    }
  }

  /**
    * Ttml Destination Style Control
    */
  object TtmlDestinationStyleControlEnum {
    val PASSTHROUGH    = "PASSTHROUGH"
    val USE_CONFIGURED = "USE_CONFIGURED"

    val values = IndexedSeq(PASSTHROUGH, USE_CONFIGURED)
  }

  /**
    * Udp Container Settings
    */
  @js.native
  trait UdpContainerSettings extends js.Object {
    var M2tsSettings: js.UndefOr[M2tsSettings]
  }

  object UdpContainerSettings {
    def apply(
        M2tsSettings: js.UndefOr[M2tsSettings] = js.undefined
    ): UdpContainerSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "M2tsSettings" -> M2tsSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UdpContainerSettings]
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
    def apply(
        InputLossAction: js.UndefOr[InputLossActionForUdpOut] = js.undefined,
        TimedMetadataId3Frame: js.UndefOr[UdpTimedMetadataId3Frame] = js.undefined,
        TimedMetadataId3Period: js.UndefOr[__integerMin0] = js.undefined
    ): UdpGroupSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputLossAction" -> InputLossAction.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimedMetadataId3Frame" -> TimedMetadataId3Frame.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimedMetadataId3Period" -> TimedMetadataId3Period.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UdpGroupSettings]
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
    def apply(
        ContainerSettings: UdpContainerSettings,
        Destination: OutputLocationRef,
        BufferMsec: js.UndefOr[__integerMin0Max10000] = js.undefined,
        FecOutputSettings: js.UndefOr[FecOutputSettings] = js.undefined
    ): UdpOutputSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContainerSettings" -> ContainerSettings.asInstanceOf[js.Any],
        "Destination"       -> Destination.asInstanceOf[js.Any],
        "BufferMsec" -> BufferMsec.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FecOutputSettings" -> FecOutputSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UdpOutputSettings]
    }
  }

  /**
    * Udp Timed Metadata Id3 Frame
    */
  object UdpTimedMetadataId3FrameEnum {
    val NONE = "NONE"
    val PRIV = "PRIV"
    val TDRL = "TDRL"

    val values = IndexedSeq(NONE, PRIV, TDRL)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ChannelId" -> ChannelId.asInstanceOf[js.Any],
        "Destinations" -> Destinations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EncoderSettings" -> EncoderSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputAttachments" -> InputAttachments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputSpecification" -> InputSpecification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogLevel" -> LogLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateChannelRequest]
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
    def apply(
        Channel: js.UndefOr[Channel] = js.undefined
    ): UpdateChannelResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Channel" -> Channel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateChannelResponse]
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
    def apply(
        InputId: __string,
        Destinations: js.UndefOr[__listOfInputDestinationRequest] = js.undefined,
        InputSecurityGroups: js.UndefOr[__listOf__string] = js.undefined,
        MediaConnectFlows: js.UndefOr[__listOfMediaConnectFlowRequest] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined,
        Sources: js.UndefOr[__listOfInputSourceRequest] = js.undefined
    ): UpdateInputRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputId" -> InputId.asInstanceOf[js.Any],
        "Destinations" -> Destinations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputSecurityGroups" -> InputSecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MediaConnectFlows" -> MediaConnectFlows.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Sources" -> Sources.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateInputRequest]
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
    def apply(
        Input: js.UndefOr[Input] = js.undefined
    ): UpdateInputResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Input" -> Input.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateInputResponse]
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
    def apply(
        InputSecurityGroupId: __string,
        Tags: js.UndefOr[Tags] = js.undefined,
        WhitelistRules: js.UndefOr[__listOfInputWhitelistRuleCidr] = js.undefined
    ): UpdateInputSecurityGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InputSecurityGroupId" -> InputSecurityGroupId.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WhitelistRules" -> WhitelistRules.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateInputSecurityGroupRequest]
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
    def apply(
        SecurityGroup: js.UndefOr[InputSecurityGroup] = js.undefined
    ): UpdateInputSecurityGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecurityGroup" -> SecurityGroup.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateInputSecurityGroupResponse]
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
    def apply(
        ReservationId: __string,
        Name: js.UndefOr[__string] = js.undefined
    ): UpdateReservationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservationId" -> ReservationId.asInstanceOf[js.Any],
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateReservationRequest]
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
    def apply(
        Reservation: js.UndefOr[Reservation] = js.undefined
    ): UpdateReservationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Reservation" -> Reservation.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateReservationResponse]
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
    def apply(
        FrameCaptureSettings: js.UndefOr[FrameCaptureSettings] = js.undefined,
        H264Settings: js.UndefOr[H264Settings] = js.undefined
    ): VideoCodecSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FrameCaptureSettings" -> FrameCaptureSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "H264Settings" -> H264Settings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VideoCodecSettings]
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
    def apply(
        Name: __string,
        CodecSettings: js.UndefOr[VideoCodecSettings] = js.undefined,
        Height: js.UndefOr[__integer] = js.undefined,
        RespondToAfd: js.UndefOr[VideoDescriptionRespondToAfd] = js.undefined,
        ScalingBehavior: js.UndefOr[VideoDescriptionScalingBehavior] = js.undefined,
        Sharpness: js.UndefOr[__integerMin0Max100] = js.undefined,
        Width: js.UndefOr[__integer] = js.undefined
    ): VideoDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "CodecSettings" -> CodecSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Height" -> Height.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RespondToAfd" -> RespondToAfd.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScalingBehavior" -> ScalingBehavior.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Sharpness" -> Sharpness.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Width" -> Width.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VideoDescription]
    }
  }

  /**
    * Video Description Respond To Afd
    */
  object VideoDescriptionRespondToAfdEnum {
    val NONE        = "NONE"
    val PASSTHROUGH = "PASSTHROUGH"
    val RESPOND     = "RESPOND"

    val values = IndexedSeq(NONE, PASSTHROUGH, RESPOND)
  }

  /**
    * Video Description Scaling Behavior
    */
  object VideoDescriptionScalingBehaviorEnum {
    val DEFAULT           = "DEFAULT"
    val STRETCH_TO_OUTPUT = "STRETCH_TO_OUTPUT"

    val values = IndexedSeq(DEFAULT, STRETCH_TO_OUTPUT)
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
    def apply(
        ColorSpace: js.UndefOr[VideoSelectorColorSpace] = js.undefined,
        ColorSpaceUsage: js.UndefOr[VideoSelectorColorSpaceUsage] = js.undefined,
        SelectorSettings: js.UndefOr[VideoSelectorSettings] = js.undefined
    ): VideoSelector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ColorSpace" -> ColorSpace.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ColorSpaceUsage" -> ColorSpaceUsage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SelectorSettings" -> SelectorSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VideoSelector]
    }
  }

  /**
    * Video Selector Color Space
    */
  object VideoSelectorColorSpaceEnum {
    val FOLLOW  = "FOLLOW"
    val REC_601 = "REC_601"
    val REC_709 = "REC_709"

    val values = IndexedSeq(FOLLOW, REC_601, REC_709)
  }

  /**
    * Video Selector Color Space Usage
    */
  object VideoSelectorColorSpaceUsageEnum {
    val FALLBACK = "FALLBACK"
    val FORCE    = "FORCE"

    val values = IndexedSeq(FALLBACK, FORCE)
  }

  /**
    * Video Selector Pid
    */
  @js.native
  trait VideoSelectorPid extends js.Object {
    var Pid: js.UndefOr[__integerMin0Max8191]
  }

  object VideoSelectorPid {
    def apply(
        Pid: js.UndefOr[__integerMin0Max8191] = js.undefined
    ): VideoSelectorPid = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Pid" -> Pid.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VideoSelectorPid]
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
    def apply(
        ProgramId: js.UndefOr[__integerMin0Max65536] = js.undefined
    ): VideoSelectorProgramId = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProgramId" -> ProgramId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VideoSelectorProgramId]
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
    def apply(
        VideoSelectorPid: js.UndefOr[VideoSelectorPid] = js.undefined,
        VideoSelectorProgramId: js.UndefOr[VideoSelectorProgramId] = js.undefined
    ): VideoSelectorSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VideoSelectorPid" -> VideoSelectorPid.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VideoSelectorProgramId" -> VideoSelectorProgramId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VideoSelectorSettings]
    }
  }

  /**
    * Webvtt Destination Settings
    */
  @js.native
  trait WebvttDestinationSettings extends js.Object {}

  object WebvttDestinationSettings {
    def apply(
        ): WebvttDestinationSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WebvttDestinationSettings]
    }
  }
}
