package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object chimesdkmessaging {
  type BatchCreateChannelMembershipErrors = js.Array[BatchCreateChannelMembershipError]
  type CallbackIdType = String
  type ChannelAssociatedWithFlowSummaryList = js.Array[ChannelAssociatedWithFlowSummary]
  type ChannelBanSummaryList = js.Array[ChannelBanSummary]
  type ChannelFlowExecutionOrder = Int
  type ChannelFlowSummaryList = js.Array[ChannelFlowSummary]
  type ChannelMembershipForAppInstanceUserSummaryList = js.Array[ChannelMembershipForAppInstanceUserSummary]
  type ChannelMembershipSummaryList = js.Array[ChannelMembershipSummary]
  type ChannelMessageSummaryList = js.Array[ChannelMessageSummary]
  type ChannelModeratedByAppInstanceUserSummaryList = js.Array[ChannelModeratedByAppInstanceUserSummary]
  type ChannelModeratorSummaryList = js.Array[ChannelModeratorSummary]
  type ChannelSummaryList = js.Array[ChannelSummary]
  type ChimeArn = String
  type ClientRequestToken = String
  type Content = String
  type FilterRule = String
  type LambdaFunctionArn = String
  type MaxResults = Int
  type MemberArns = js.Array[ChimeArn]
  type Members = js.Array[Identity]
  type MessageAttributeMap = js.Dictionary[MessageAttributeValue]
  type MessageAttributeName = String
  type MessageAttributeStringValue = String
  type MessageAttributeStringValues = js.Array[MessageAttributeStringValue]
  type MessageId = String
  type Metadata = String
  type NextToken = String
  type NonEmptyContent = String
  type NonEmptyResourceName = String
  type NonNullableBoolean = Boolean
  type ProcessorList = js.Array[Processor]
  type PushNotificationBody = String
  type PushNotificationTitle = String
  type ResourceName = String
  type StatusDetail = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = js.Date
  type UrlType = String

  final class ChimeSDKMessagingOps(private val service: ChimeSDKMessaging) extends AnyVal {

    @inline def associateChannelFlowFuture(params: AssociateChannelFlowRequest): Future[js.Object] = service.associateChannelFlow(params).promise().toFuture
    @inline def batchCreateChannelMembershipFuture(params: BatchCreateChannelMembershipRequest): Future[BatchCreateChannelMembershipResponse] = service.batchCreateChannelMembership(params).promise().toFuture
    @inline def channelFlowCallbackFuture(params: ChannelFlowCallbackRequest): Future[ChannelFlowCallbackResponse] = service.channelFlowCallback(params).promise().toFuture
    @inline def createChannelBanFuture(params: CreateChannelBanRequest): Future[CreateChannelBanResponse] = service.createChannelBan(params).promise().toFuture
    @inline def createChannelFlowFuture(params: CreateChannelFlowRequest): Future[CreateChannelFlowResponse] = service.createChannelFlow(params).promise().toFuture
    @inline def createChannelFuture(params: CreateChannelRequest): Future[CreateChannelResponse] = service.createChannel(params).promise().toFuture
    @inline def createChannelMembershipFuture(params: CreateChannelMembershipRequest): Future[CreateChannelMembershipResponse] = service.createChannelMembership(params).promise().toFuture
    @inline def createChannelModeratorFuture(params: CreateChannelModeratorRequest): Future[CreateChannelModeratorResponse] = service.createChannelModerator(params).promise().toFuture
    @inline def deleteChannelBanFuture(params: DeleteChannelBanRequest): Future[js.Object] = service.deleteChannelBan(params).promise().toFuture
    @inline def deleteChannelFlowFuture(params: DeleteChannelFlowRequest): Future[js.Object] = service.deleteChannelFlow(params).promise().toFuture
    @inline def deleteChannelFuture(params: DeleteChannelRequest): Future[js.Object] = service.deleteChannel(params).promise().toFuture
    @inline def deleteChannelMembershipFuture(params: DeleteChannelMembershipRequest): Future[js.Object] = service.deleteChannelMembership(params).promise().toFuture
    @inline def deleteChannelMessageFuture(params: DeleteChannelMessageRequest): Future[js.Object] = service.deleteChannelMessage(params).promise().toFuture
    @inline def deleteChannelModeratorFuture(params: DeleteChannelModeratorRequest): Future[js.Object] = service.deleteChannelModerator(params).promise().toFuture
    @inline def describeChannelBanFuture(params: DescribeChannelBanRequest): Future[DescribeChannelBanResponse] = service.describeChannelBan(params).promise().toFuture
    @inline def describeChannelFlowFuture(params: DescribeChannelFlowRequest): Future[DescribeChannelFlowResponse] = service.describeChannelFlow(params).promise().toFuture
    @inline def describeChannelFuture(params: DescribeChannelRequest): Future[DescribeChannelResponse] = service.describeChannel(params).promise().toFuture
    @inline def describeChannelMembershipForAppInstanceUserFuture(params: DescribeChannelMembershipForAppInstanceUserRequest): Future[DescribeChannelMembershipForAppInstanceUserResponse] = service.describeChannelMembershipForAppInstanceUser(params).promise().toFuture
    @inline def describeChannelMembershipFuture(params: DescribeChannelMembershipRequest): Future[DescribeChannelMembershipResponse] = service.describeChannelMembership(params).promise().toFuture
    @inline def describeChannelModeratedByAppInstanceUserFuture(params: DescribeChannelModeratedByAppInstanceUserRequest): Future[DescribeChannelModeratedByAppInstanceUserResponse] = service.describeChannelModeratedByAppInstanceUser(params).promise().toFuture
    @inline def describeChannelModeratorFuture(params: DescribeChannelModeratorRequest): Future[DescribeChannelModeratorResponse] = service.describeChannelModerator(params).promise().toFuture
    @inline def disassociateChannelFlowFuture(params: DisassociateChannelFlowRequest): Future[js.Object] = service.disassociateChannelFlow(params).promise().toFuture
    @inline def getChannelMembershipPreferencesFuture(params: GetChannelMembershipPreferencesRequest): Future[GetChannelMembershipPreferencesResponse] = service.getChannelMembershipPreferences(params).promise().toFuture
    @inline def getChannelMessageFuture(params: GetChannelMessageRequest): Future[GetChannelMessageResponse] = service.getChannelMessage(params).promise().toFuture
    @inline def getChannelMessageStatusFuture(params: GetChannelMessageStatusRequest): Future[GetChannelMessageStatusResponse] = service.getChannelMessageStatus(params).promise().toFuture
    @inline def getMessagingSessionEndpointFuture(params: GetMessagingSessionEndpointRequest): Future[GetMessagingSessionEndpointResponse] = service.getMessagingSessionEndpoint(params).promise().toFuture
    @inline def listChannelBansFuture(params: ListChannelBansRequest): Future[ListChannelBansResponse] = service.listChannelBans(params).promise().toFuture
    @inline def listChannelFlowsFuture(params: ListChannelFlowsRequest): Future[ListChannelFlowsResponse] = service.listChannelFlows(params).promise().toFuture
    @inline def listChannelMembershipsForAppInstanceUserFuture(params: ListChannelMembershipsForAppInstanceUserRequest): Future[ListChannelMembershipsForAppInstanceUserResponse] = service.listChannelMembershipsForAppInstanceUser(params).promise().toFuture
    @inline def listChannelMembershipsFuture(params: ListChannelMembershipsRequest): Future[ListChannelMembershipsResponse] = service.listChannelMemberships(params).promise().toFuture
    @inline def listChannelMessagesFuture(params: ListChannelMessagesRequest): Future[ListChannelMessagesResponse] = service.listChannelMessages(params).promise().toFuture
    @inline def listChannelModeratorsFuture(params: ListChannelModeratorsRequest): Future[ListChannelModeratorsResponse] = service.listChannelModerators(params).promise().toFuture
    @inline def listChannelsAssociatedWithChannelFlowFuture(params: ListChannelsAssociatedWithChannelFlowRequest): Future[ListChannelsAssociatedWithChannelFlowResponse] = service.listChannelsAssociatedWithChannelFlow(params).promise().toFuture
    @inline def listChannelsFuture(params: ListChannelsRequest): Future[ListChannelsResponse] = service.listChannels(params).promise().toFuture
    @inline def listChannelsModeratedByAppInstanceUserFuture(params: ListChannelsModeratedByAppInstanceUserRequest): Future[ListChannelsModeratedByAppInstanceUserResponse] = service.listChannelsModeratedByAppInstanceUser(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putChannelMembershipPreferencesFuture(params: PutChannelMembershipPreferencesRequest): Future[PutChannelMembershipPreferencesResponse] = service.putChannelMembershipPreferences(params).promise().toFuture
    @inline def redactChannelMessageFuture(params: RedactChannelMessageRequest): Future[RedactChannelMessageResponse] = service.redactChannelMessage(params).promise().toFuture
    @inline def sendChannelMessageFuture(params: SendChannelMessageRequest): Future[SendChannelMessageResponse] = service.sendChannelMessage(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateChannelFlowFuture(params: UpdateChannelFlowRequest): Future[UpdateChannelFlowResponse] = service.updateChannelFlow(params).promise().toFuture
    @inline def updateChannelFuture(params: UpdateChannelRequest): Future[UpdateChannelResponse] = service.updateChannel(params).promise().toFuture
    @inline def updateChannelMessageFuture(params: UpdateChannelMessageRequest): Future[UpdateChannelMessageResponse] = service.updateChannelMessage(params).promise().toFuture
    @inline def updateChannelReadMarkerFuture(params: UpdateChannelReadMarkerRequest): Future[UpdateChannelReadMarkerResponse] = service.updateChannelReadMarker(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/chimesdkmessaging", JSImport.Namespace, "AWS.ChimeSDKMessaging")
  class ChimeSDKMessaging() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateChannelFlow(params: AssociateChannelFlowRequest): Request[js.Object] = js.native
    def batchCreateChannelMembership(params: BatchCreateChannelMembershipRequest): Request[BatchCreateChannelMembershipResponse] = js.native
    def channelFlowCallback(params: ChannelFlowCallbackRequest): Request[ChannelFlowCallbackResponse] = js.native
    def createChannel(params: CreateChannelRequest): Request[CreateChannelResponse] = js.native
    def createChannelBan(params: CreateChannelBanRequest): Request[CreateChannelBanResponse] = js.native
    def createChannelFlow(params: CreateChannelFlowRequest): Request[CreateChannelFlowResponse] = js.native
    def createChannelMembership(params: CreateChannelMembershipRequest): Request[CreateChannelMembershipResponse] = js.native
    def createChannelModerator(params: CreateChannelModeratorRequest): Request[CreateChannelModeratorResponse] = js.native
    def deleteChannel(params: DeleteChannelRequest): Request[js.Object] = js.native
    def deleteChannelBan(params: DeleteChannelBanRequest): Request[js.Object] = js.native
    def deleteChannelFlow(params: DeleteChannelFlowRequest): Request[js.Object] = js.native
    def deleteChannelMembership(params: DeleteChannelMembershipRequest): Request[js.Object] = js.native
    def deleteChannelMessage(params: DeleteChannelMessageRequest): Request[js.Object] = js.native
    def deleteChannelModerator(params: DeleteChannelModeratorRequest): Request[js.Object] = js.native
    def describeChannel(params: DescribeChannelRequest): Request[DescribeChannelResponse] = js.native
    def describeChannelBan(params: DescribeChannelBanRequest): Request[DescribeChannelBanResponse] = js.native
    def describeChannelFlow(params: DescribeChannelFlowRequest): Request[DescribeChannelFlowResponse] = js.native
    def describeChannelMembership(params: DescribeChannelMembershipRequest): Request[DescribeChannelMembershipResponse] = js.native
    def describeChannelMembershipForAppInstanceUser(params: DescribeChannelMembershipForAppInstanceUserRequest): Request[DescribeChannelMembershipForAppInstanceUserResponse] = js.native
    def describeChannelModeratedByAppInstanceUser(params: DescribeChannelModeratedByAppInstanceUserRequest): Request[DescribeChannelModeratedByAppInstanceUserResponse] = js.native
    def describeChannelModerator(params: DescribeChannelModeratorRequest): Request[DescribeChannelModeratorResponse] = js.native
    def disassociateChannelFlow(params: DisassociateChannelFlowRequest): Request[js.Object] = js.native
    def getChannelMembershipPreferences(params: GetChannelMembershipPreferencesRequest): Request[GetChannelMembershipPreferencesResponse] = js.native
    def getChannelMessage(params: GetChannelMessageRequest): Request[GetChannelMessageResponse] = js.native
    def getChannelMessageStatus(params: GetChannelMessageStatusRequest): Request[GetChannelMessageStatusResponse] = js.native
    def getMessagingSessionEndpoint(params: GetMessagingSessionEndpointRequest): Request[GetMessagingSessionEndpointResponse] = js.native
    def listChannelBans(params: ListChannelBansRequest): Request[ListChannelBansResponse] = js.native
    def listChannelFlows(params: ListChannelFlowsRequest): Request[ListChannelFlowsResponse] = js.native
    def listChannelMemberships(params: ListChannelMembershipsRequest): Request[ListChannelMembershipsResponse] = js.native
    def listChannelMembershipsForAppInstanceUser(params: ListChannelMembershipsForAppInstanceUserRequest): Request[ListChannelMembershipsForAppInstanceUserResponse] = js.native
    def listChannelMessages(params: ListChannelMessagesRequest): Request[ListChannelMessagesResponse] = js.native
    def listChannelModerators(params: ListChannelModeratorsRequest): Request[ListChannelModeratorsResponse] = js.native
    def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse] = js.native
    def listChannelsAssociatedWithChannelFlow(params: ListChannelsAssociatedWithChannelFlowRequest): Request[ListChannelsAssociatedWithChannelFlowResponse] = js.native
    def listChannelsModeratedByAppInstanceUser(params: ListChannelsModeratedByAppInstanceUserRequest): Request[ListChannelsModeratedByAppInstanceUserResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putChannelMembershipPreferences(params: PutChannelMembershipPreferencesRequest): Request[PutChannelMembershipPreferencesResponse] = js.native
    def redactChannelMessage(params: RedactChannelMessageRequest): Request[RedactChannelMessageResponse] = js.native
    def sendChannelMessage(params: SendChannelMessageRequest): Request[SendChannelMessageResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateChannel(params: UpdateChannelRequest): Request[UpdateChannelResponse] = js.native
    def updateChannelFlow(params: UpdateChannelFlowRequest): Request[UpdateChannelFlowResponse] = js.native
    def updateChannelMessage(params: UpdateChannelMessageRequest): Request[UpdateChannelMessageResponse] = js.native
    def updateChannelReadMarker(params: UpdateChannelReadMarkerRequest): Request[UpdateChannelReadMarkerResponse] = js.native
  }
  object ChimeSDKMessaging {
    @inline implicit def toOps(service: ChimeSDKMessaging): ChimeSDKMessagingOps = {
      new ChimeSDKMessagingOps(service)
    }
  }

  /** Summary of the membership details of an <code>AppInstanceUser</code>.
    */
  @js.native
  trait AppInstanceUserMembershipSummary extends js.Object {
    var ReadMarkerTimestamp: js.UndefOr[Timestamp]
    var Type: js.UndefOr[ChannelMembershipType]
  }

  object AppInstanceUserMembershipSummary {
    @inline
    def apply(
        ReadMarkerTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Type: js.UndefOr[ChannelMembershipType] = js.undefined
    ): AppInstanceUserMembershipSummary = {
      val __obj = js.Dynamic.literal()
      ReadMarkerTimestamp.foreach(__v => __obj.updateDynamic("ReadMarkerTimestamp")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppInstanceUserMembershipSummary]
    }
  }

  @js.native
  trait AssociateChannelFlowRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChannelFlowArn: ChimeArn
    var ChimeBearer: ChimeArn
  }

  object AssociateChannelFlowRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChannelFlowArn: ChimeArn,
        ChimeBearer: ChimeArn
    ): AssociateChannelFlowRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChannelFlowArn" -> ChannelFlowArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateChannelFlowRequest]
    }
  }

  /** The membership information, including member ARNs, the channel ARN, and membership types.
    */
  @js.native
  trait BatchChannelMemberships extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var InvitedBy: js.UndefOr[Identity]
    var Members: js.UndefOr[Members]
    var Type: js.UndefOr[ChannelMembershipType]
  }

  object BatchChannelMemberships {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        InvitedBy: js.UndefOr[Identity] = js.undefined,
        Members: js.UndefOr[Members] = js.undefined,
        Type: js.UndefOr[ChannelMembershipType] = js.undefined
    ): BatchChannelMemberships = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      InvitedBy.foreach(__v => __obj.updateDynamic("InvitedBy")(__v.asInstanceOf[js.Any]))
      Members.foreach(__v => __obj.updateDynamic("Members")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchChannelMemberships]
    }
  }

  /** A list of failed member ARNs, error codes, and error messages.
    */
  @js.native
  trait BatchCreateChannelMembershipError extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[String]
    var MemberArn: js.UndefOr[ChimeArn]
  }

  object BatchCreateChannelMembershipError {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        MemberArn: js.UndefOr[ChimeArn] = js.undefined
    ): BatchCreateChannelMembershipError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      MemberArn.foreach(__v => __obj.updateDynamic("MemberArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreateChannelMembershipError]
    }
  }

  @js.native
  trait BatchCreateChannelMembershipRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
    var MemberArns: MemberArns
    var Type: js.UndefOr[ChannelMembershipType]
  }

  object BatchCreateChannelMembershipRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn,
        MemberArns: MemberArns,
        Type: js.UndefOr[ChannelMembershipType] = js.undefined
    ): BatchCreateChannelMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any],
        "MemberArns" -> MemberArns.asInstanceOf[js.Any]
      )

      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreateChannelMembershipRequest]
    }
  }

  @js.native
  trait BatchCreateChannelMembershipResponse extends js.Object {
    var BatchChannelMemberships: js.UndefOr[BatchChannelMemberships]
    var Errors: js.UndefOr[BatchCreateChannelMembershipErrors]
  }

  object BatchCreateChannelMembershipResponse {
    @inline
    def apply(
        BatchChannelMemberships: js.UndefOr[BatchChannelMemberships] = js.undefined,
        Errors: js.UndefOr[BatchCreateChannelMembershipErrors] = js.undefined
    ): BatchCreateChannelMembershipResponse = {
      val __obj = js.Dynamic.literal()
      BatchChannelMemberships.foreach(__v => __obj.updateDynamic("BatchChannelMemberships")(__v.asInstanceOf[js.Any]))
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreateChannelMembershipResponse]
    }
  }

  /** The details of a channel.
    */
  @js.native
  trait Channel extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var ChannelFlowArn: js.UndefOr[ChimeArn]
    var CreatedBy: js.UndefOr[Identity]
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var LastMessageTimestamp: js.UndefOr[Timestamp]
    var LastUpdatedTimestamp: js.UndefOr[Timestamp]
    var Metadata: js.UndefOr[Metadata]
    var Mode: js.UndefOr[ChannelMode]
    var Name: js.UndefOr[NonEmptyResourceName]
    var Privacy: js.UndefOr[ChannelPrivacy]
  }

  object Channel {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        ChannelFlowArn: js.UndefOr[ChimeArn] = js.undefined,
        CreatedBy: js.UndefOr[Identity] = js.undefined,
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        LastMessageTimestamp: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Mode: js.UndefOr[ChannelMode] = js.undefined,
        Name: js.UndefOr[NonEmptyResourceName] = js.undefined,
        Privacy: js.UndefOr[ChannelPrivacy] = js.undefined
    ): Channel = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      ChannelFlowArn.foreach(__v => __obj.updateDynamic("ChannelFlowArn")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      LastMessageTimestamp.foreach(__v => __obj.updateDynamic("LastMessageTimestamp")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Privacy.foreach(__v => __obj.updateDynamic("Privacy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Channel]
    }
  }

  /** Summary of details of a channel associated with channel flow.
    */
  @js.native
  trait ChannelAssociatedWithFlowSummary extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var Metadata: js.UndefOr[Metadata]
    var Mode: js.UndefOr[ChannelMode]
    var Name: js.UndefOr[NonEmptyResourceName]
    var Privacy: js.UndefOr[ChannelPrivacy]
  }

  object ChannelAssociatedWithFlowSummary {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Mode: js.UndefOr[ChannelMode] = js.undefined,
        Name: js.UndefOr[NonEmptyResourceName] = js.undefined,
        Privacy: js.UndefOr[ChannelPrivacy] = js.undefined
    ): ChannelAssociatedWithFlowSummary = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Privacy.foreach(__v => __obj.updateDynamic("Privacy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelAssociatedWithFlowSummary]
    }
  }

  /** The details of a channel ban.
    */
  @js.native
  trait ChannelBan extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var CreatedBy: js.UndefOr[Identity]
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var Member: js.UndefOr[Identity]
  }

  object ChannelBan {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        CreatedBy: js.UndefOr[Identity] = js.undefined,
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Member: js.UndefOr[Identity] = js.undefined
    ): ChannelBan = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Member.foreach(__v => __obj.updateDynamic("Member")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelBan]
    }
  }

  /** Summary of the details of a <code>ChannelBan</code>.
    */
  @js.native
  trait ChannelBanSummary extends js.Object {
    var Member: js.UndefOr[Identity]
  }

  object ChannelBanSummary {
    @inline
    def apply(
        Member: js.UndefOr[Identity] = js.undefined
    ): ChannelBanSummary = {
      val __obj = js.Dynamic.literal()
      Member.foreach(__v => __obj.updateDynamic("Member")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelBanSummary]
    }
  }

  /** The details of a channel flow.
    */
  @js.native
  trait ChannelFlow extends js.Object {
    var ChannelFlowArn: js.UndefOr[ChimeArn]
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var LastUpdatedTimestamp: js.UndefOr[Timestamp]
    var Name: js.UndefOr[NonEmptyResourceName]
    var Processors: js.UndefOr[ProcessorList]
  }

  object ChannelFlow {
    @inline
    def apply(
        ChannelFlowArn: js.UndefOr[ChimeArn] = js.undefined,
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[NonEmptyResourceName] = js.undefined,
        Processors: js.UndefOr[ProcessorList] = js.undefined
    ): ChannelFlow = {
      val __obj = js.Dynamic.literal()
      ChannelFlowArn.foreach(__v => __obj.updateDynamic("ChannelFlowArn")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Processors.foreach(__v => __obj.updateDynamic("Processors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelFlow]
    }
  }

  @js.native
  trait ChannelFlowCallbackRequest extends js.Object {
    var CallbackId: CallbackIdType
    var ChannelArn: ChimeArn
    var ChannelMessage: ChannelMessageCallback
    var DeleteResource: js.UndefOr[NonNullableBoolean]
  }

  object ChannelFlowCallbackRequest {
    @inline
    def apply(
        CallbackId: CallbackIdType,
        ChannelArn: ChimeArn,
        ChannelMessage: ChannelMessageCallback,
        DeleteResource: js.UndefOr[NonNullableBoolean] = js.undefined
    ): ChannelFlowCallbackRequest = {
      val __obj = js.Dynamic.literal(
        "CallbackId" -> CallbackId.asInstanceOf[js.Any],
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChannelMessage" -> ChannelMessage.asInstanceOf[js.Any]
      )

      DeleteResource.foreach(__v => __obj.updateDynamic("DeleteResource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelFlowCallbackRequest]
    }
  }

  @js.native
  trait ChannelFlowCallbackResponse extends js.Object {
    var CallbackId: js.UndefOr[CallbackIdType]
    var ChannelArn: js.UndefOr[ChimeArn]
  }

  object ChannelFlowCallbackResponse {
    @inline
    def apply(
        CallbackId: js.UndefOr[CallbackIdType] = js.undefined,
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined
    ): ChannelFlowCallbackResponse = {
      val __obj = js.Dynamic.literal()
      CallbackId.foreach(__v => __obj.updateDynamic("CallbackId")(__v.asInstanceOf[js.Any]))
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelFlowCallbackResponse]
    }
  }

  /** Summary of details of a channel flow.
    */
  @js.native
  trait ChannelFlowSummary extends js.Object {
    var ChannelFlowArn: js.UndefOr[ChimeArn]
    var Name: js.UndefOr[NonEmptyResourceName]
    var Processors: js.UndefOr[ProcessorList]
  }

  object ChannelFlowSummary {
    @inline
    def apply(
        ChannelFlowArn: js.UndefOr[ChimeArn] = js.undefined,
        Name: js.UndefOr[NonEmptyResourceName] = js.undefined,
        Processors: js.UndefOr[ProcessorList] = js.undefined
    ): ChannelFlowSummary = {
      val __obj = js.Dynamic.literal()
      ChannelFlowArn.foreach(__v => __obj.updateDynamic("ChannelFlowArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Processors.foreach(__v => __obj.updateDynamic("Processors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelFlowSummary]
    }
  }

  /** The details of a channel member.
    */
  @js.native
  trait ChannelMembership extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var InvitedBy: js.UndefOr[Identity]
    var LastUpdatedTimestamp: js.UndefOr[Timestamp]
    var Member: js.UndefOr[Identity]
    var Type: js.UndefOr[ChannelMembershipType]
  }

  object ChannelMembership {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        InvitedBy: js.UndefOr[Identity] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Member: js.UndefOr[Identity] = js.undefined,
        Type: js.UndefOr[ChannelMembershipType] = js.undefined
    ): ChannelMembership = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      InvitedBy.foreach(__v => __obj.updateDynamic("InvitedBy")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      Member.foreach(__v => __obj.updateDynamic("Member")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelMembership]
    }
  }

  /** Summary of the channel membership details of an <code>AppInstanceUser</code>.
    */
  @js.native
  trait ChannelMembershipForAppInstanceUserSummary extends js.Object {
    var AppInstanceUserMembershipSummary: js.UndefOr[AppInstanceUserMembershipSummary]
    var ChannelSummary: js.UndefOr[ChannelSummary]
  }

  object ChannelMembershipForAppInstanceUserSummary {
    @inline
    def apply(
        AppInstanceUserMembershipSummary: js.UndefOr[AppInstanceUserMembershipSummary] = js.undefined,
        ChannelSummary: js.UndefOr[ChannelSummary] = js.undefined
    ): ChannelMembershipForAppInstanceUserSummary = {
      val __obj = js.Dynamic.literal()
      AppInstanceUserMembershipSummary.foreach(__v => __obj.updateDynamic("AppInstanceUserMembershipSummary")(__v.asInstanceOf[js.Any]))
      ChannelSummary.foreach(__v => __obj.updateDynamic("ChannelSummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelMembershipForAppInstanceUserSummary]
    }
  }

  /** The channel membership preferences for an <code>AppInstanceUser</code>.
    */
  @js.native
  trait ChannelMembershipPreferences extends js.Object {
    var PushNotifications: js.UndefOr[PushNotificationPreferences]
  }

  object ChannelMembershipPreferences {
    @inline
    def apply(
        PushNotifications: js.UndefOr[PushNotificationPreferences] = js.undefined
    ): ChannelMembershipPreferences = {
      val __obj = js.Dynamic.literal()
      PushNotifications.foreach(__v => __obj.updateDynamic("PushNotifications")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelMembershipPreferences]
    }
  }

  /** Summary of the details of a <code>ChannelMembership</code>.
    */
  @js.native
  trait ChannelMembershipSummary extends js.Object {
    var Member: js.UndefOr[Identity]
  }

  object ChannelMembershipSummary {
    @inline
    def apply(
        Member: js.UndefOr[Identity] = js.undefined
    ): ChannelMembershipSummary = {
      val __obj = js.Dynamic.literal()
      Member.foreach(__v => __obj.updateDynamic("Member")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelMembershipSummary]
    }
  }

  /** The details of a message in a channel.
    */
  @js.native
  trait ChannelMessage extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var Content: js.UndefOr[Content]
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var LastEditedTimestamp: js.UndefOr[Timestamp]
    var LastUpdatedTimestamp: js.UndefOr[Timestamp]
    var MessageAttributes: js.UndefOr[MessageAttributeMap]
    var MessageId: js.UndefOr[MessageId]
    var Metadata: js.UndefOr[Metadata]
    var Persistence: js.UndefOr[ChannelMessagePersistenceType]
    var Redacted: js.UndefOr[NonNullableBoolean]
    var Sender: js.UndefOr[Identity]
    var Status: js.UndefOr[ChannelMessageStatusStructure]
    var Type: js.UndefOr[ChannelMessageType]
  }

  object ChannelMessage {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        Content: js.UndefOr[Content] = js.undefined,
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        LastEditedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        MessageAttributes: js.UndefOr[MessageAttributeMap] = js.undefined,
        MessageId: js.UndefOr[MessageId] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Persistence: js.UndefOr[ChannelMessagePersistenceType] = js.undefined,
        Redacted: js.UndefOr[NonNullableBoolean] = js.undefined,
        Sender: js.UndefOr[Identity] = js.undefined,
        Status: js.UndefOr[ChannelMessageStatusStructure] = js.undefined,
        Type: js.UndefOr[ChannelMessageType] = js.undefined
    ): ChannelMessage = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      LastEditedTimestamp.foreach(__v => __obj.updateDynamic("LastEditedTimestamp")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      MessageAttributes.foreach(__v => __obj.updateDynamic("MessageAttributes")(__v.asInstanceOf[js.Any]))
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Persistence.foreach(__v => __obj.updateDynamic("Persistence")(__v.asInstanceOf[js.Any]))
      Redacted.foreach(__v => __obj.updateDynamic("Redacted")(__v.asInstanceOf[js.Any]))
      Sender.foreach(__v => __obj.updateDynamic("Sender")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelMessage]
    }
  }

  /** Stores information about a callback.
    */
  @js.native
  trait ChannelMessageCallback extends js.Object {
    var MessageId: MessageId
    var Content: js.UndefOr[NonEmptyContent]
    var MessageAttributes: js.UndefOr[MessageAttributeMap]
    var Metadata: js.UndefOr[Metadata]
    var PushNotification: js.UndefOr[PushNotificationConfiguration]
  }

  object ChannelMessageCallback {
    @inline
    def apply(
        MessageId: MessageId,
        Content: js.UndefOr[NonEmptyContent] = js.undefined,
        MessageAttributes: js.UndefOr[MessageAttributeMap] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        PushNotification: js.UndefOr[PushNotificationConfiguration] = js.undefined
    ): ChannelMessageCallback = {
      val __obj = js.Dynamic.literal(
        "MessageId" -> MessageId.asInstanceOf[js.Any]
      )

      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      MessageAttributes.foreach(__v => __obj.updateDynamic("MessageAttributes")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      PushNotification.foreach(__v => __obj.updateDynamic("PushNotification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelMessageCallback]
    }
  }

  /** Stores information about a message status.
    */
  @js.native
  trait ChannelMessageStatusStructure extends js.Object {
    var Detail: js.UndefOr[StatusDetail]
    var Value: js.UndefOr[ChannelMessageStatus]
  }

  object ChannelMessageStatusStructure {
    @inline
    def apply(
        Detail: js.UndefOr[StatusDetail] = js.undefined,
        Value: js.UndefOr[ChannelMessageStatus] = js.undefined
    ): ChannelMessageStatusStructure = {
      val __obj = js.Dynamic.literal()
      Detail.foreach(__v => __obj.updateDynamic("Detail")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelMessageStatusStructure]
    }
  }

  /** Summary of the messages in a <code>Channel</code>.
    */
  @js.native
  trait ChannelMessageSummary extends js.Object {
    var Content: js.UndefOr[Content]
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var LastEditedTimestamp: js.UndefOr[Timestamp]
    var LastUpdatedTimestamp: js.UndefOr[Timestamp]
    var MessageAttributes: js.UndefOr[MessageAttributeMap]
    var MessageId: js.UndefOr[MessageId]
    var Metadata: js.UndefOr[Metadata]
    var Redacted: js.UndefOr[NonNullableBoolean]
    var Sender: js.UndefOr[Identity]
    var Status: js.UndefOr[ChannelMessageStatusStructure]
    var Type: js.UndefOr[ChannelMessageType]
  }

  object ChannelMessageSummary {
    @inline
    def apply(
        Content: js.UndefOr[Content] = js.undefined,
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        LastEditedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        MessageAttributes: js.UndefOr[MessageAttributeMap] = js.undefined,
        MessageId: js.UndefOr[MessageId] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Redacted: js.UndefOr[NonNullableBoolean] = js.undefined,
        Sender: js.UndefOr[Identity] = js.undefined,
        Status: js.UndefOr[ChannelMessageStatusStructure] = js.undefined,
        Type: js.UndefOr[ChannelMessageType] = js.undefined
    ): ChannelMessageSummary = {
      val __obj = js.Dynamic.literal()
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      LastEditedTimestamp.foreach(__v => __obj.updateDynamic("LastEditedTimestamp")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      MessageAttributes.foreach(__v => __obj.updateDynamic("MessageAttributes")(__v.asInstanceOf[js.Any]))
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Redacted.foreach(__v => __obj.updateDynamic("Redacted")(__v.asInstanceOf[js.Any]))
      Sender.foreach(__v => __obj.updateDynamic("Sender")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelMessageSummary]
    }
  }

  /** Summary of the details of a moderated channel.
    */
  @js.native
  trait ChannelModeratedByAppInstanceUserSummary extends js.Object {
    var ChannelSummary: js.UndefOr[ChannelSummary]
  }

  object ChannelModeratedByAppInstanceUserSummary {
    @inline
    def apply(
        ChannelSummary: js.UndefOr[ChannelSummary] = js.undefined
    ): ChannelModeratedByAppInstanceUserSummary = {
      val __obj = js.Dynamic.literal()
      ChannelSummary.foreach(__v => __obj.updateDynamic("ChannelSummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelModeratedByAppInstanceUserSummary]
    }
  }

  /** The details of a channel moderator.
    */
  @js.native
  trait ChannelModerator extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var CreatedBy: js.UndefOr[Identity]
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var Moderator: js.UndefOr[Identity]
  }

  object ChannelModerator {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        CreatedBy: js.UndefOr[Identity] = js.undefined,
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Moderator: js.UndefOr[Identity] = js.undefined
    ): ChannelModerator = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Moderator.foreach(__v => __obj.updateDynamic("Moderator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelModerator]
    }
  }

  /** Summary of the details of a <code>ChannelModerator</code>.
    */
  @js.native
  trait ChannelModeratorSummary extends js.Object {
    var Moderator: js.UndefOr[Identity]
  }

  object ChannelModeratorSummary {
    @inline
    def apply(
        Moderator: js.UndefOr[Identity] = js.undefined
    ): ChannelModeratorSummary = {
      val __obj = js.Dynamic.literal()
      Moderator.foreach(__v => __obj.updateDynamic("Moderator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelModeratorSummary]
    }
  }

  /** Summary of the details of a <code>Channel</code>.
    */
  @js.native
  trait ChannelSummary extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var LastMessageTimestamp: js.UndefOr[Timestamp]
    var Metadata: js.UndefOr[Metadata]
    var Mode: js.UndefOr[ChannelMode]
    var Name: js.UndefOr[NonEmptyResourceName]
    var Privacy: js.UndefOr[ChannelPrivacy]
  }

  object ChannelSummary {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        LastMessageTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Mode: js.UndefOr[ChannelMode] = js.undefined,
        Name: js.UndefOr[NonEmptyResourceName] = js.undefined,
        Privacy: js.UndefOr[ChannelPrivacy] = js.undefined
    ): ChannelSummary = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      LastMessageTimestamp.foreach(__v => __obj.updateDynamic("LastMessageTimestamp")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Privacy.foreach(__v => __obj.updateDynamic("Privacy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelSummary]
    }
  }

  @js.native
  trait CreateChannelBanRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
    var MemberArn: ChimeArn
  }

  object CreateChannelBanRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn,
        MemberArn: ChimeArn
    ): CreateChannelBanRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any],
        "MemberArn" -> MemberArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateChannelBanRequest]
    }
  }

  @js.native
  trait CreateChannelBanResponse extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var Member: js.UndefOr[Identity]
  }

  object CreateChannelBanResponse {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        Member: js.UndefOr[Identity] = js.undefined
    ): CreateChannelBanResponse = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      Member.foreach(__v => __obj.updateDynamic("Member")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChannelBanResponse]
    }
  }

  @js.native
  trait CreateChannelFlowRequest extends js.Object {
    var AppInstanceArn: ChimeArn
    var ClientRequestToken: ClientRequestToken
    var Name: NonEmptyResourceName
    var Processors: ProcessorList
    var Tags: js.UndefOr[TagList]
  }

  object CreateChannelFlowRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn,
        ClientRequestToken: ClientRequestToken,
        Name: NonEmptyResourceName,
        Processors: ProcessorList,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateChannelFlowRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Processors" -> Processors.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChannelFlowRequest]
    }
  }

  @js.native
  trait CreateChannelFlowResponse extends js.Object {
    var ChannelFlowArn: js.UndefOr[ChimeArn]
  }

  object CreateChannelFlowResponse {
    @inline
    def apply(
        ChannelFlowArn: js.UndefOr[ChimeArn] = js.undefined
    ): CreateChannelFlowResponse = {
      val __obj = js.Dynamic.literal()
      ChannelFlowArn.foreach(__v => __obj.updateDynamic("ChannelFlowArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChannelFlowResponse]
    }
  }

  @js.native
  trait CreateChannelMembershipRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
    var MemberArn: ChimeArn
    var Type: ChannelMembershipType
  }

  object CreateChannelMembershipRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn,
        MemberArn: ChimeArn,
        Type: ChannelMembershipType
    ): CreateChannelMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any],
        "MemberArn" -> MemberArn.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateChannelMembershipRequest]
    }
  }

  @js.native
  trait CreateChannelMembershipResponse extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var Member: js.UndefOr[Identity]
  }

  object CreateChannelMembershipResponse {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        Member: js.UndefOr[Identity] = js.undefined
    ): CreateChannelMembershipResponse = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      Member.foreach(__v => __obj.updateDynamic("Member")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChannelMembershipResponse]
    }
  }

  @js.native
  trait CreateChannelModeratorRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChannelModeratorArn: ChimeArn
    var ChimeBearer: ChimeArn
  }

  object CreateChannelModeratorRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChannelModeratorArn: ChimeArn,
        ChimeBearer: ChimeArn
    ): CreateChannelModeratorRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChannelModeratorArn" -> ChannelModeratorArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateChannelModeratorRequest]
    }
  }

  @js.native
  trait CreateChannelModeratorResponse extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var ChannelModerator: js.UndefOr[Identity]
  }

  object CreateChannelModeratorResponse {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        ChannelModerator: js.UndefOr[Identity] = js.undefined
    ): CreateChannelModeratorResponse = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      ChannelModerator.foreach(__v => __obj.updateDynamic("ChannelModerator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChannelModeratorResponse]
    }
  }

  @js.native
  trait CreateChannelRequest extends js.Object {
    var AppInstanceArn: ChimeArn
    var ChimeBearer: ChimeArn
    var ClientRequestToken: ClientRequestToken
    var Name: NonEmptyResourceName
    var Metadata: js.UndefOr[Metadata]
    var Mode: js.UndefOr[ChannelMode]
    var Privacy: js.UndefOr[ChannelPrivacy]
    var Tags: js.UndefOr[TagList]
  }

  object CreateChannelRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn,
        ChimeBearer: ChimeArn,
        ClientRequestToken: ClientRequestToken,
        Name: NonEmptyResourceName,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Mode: js.UndefOr[ChannelMode] = js.undefined,
        Privacy: js.UndefOr[ChannelPrivacy] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateChannelRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      Privacy.foreach(__v => __obj.updateDynamic("Privacy")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChannelRequest]
    }
  }

  @js.native
  trait CreateChannelResponse extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
  }

  object CreateChannelResponse {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined
    ): CreateChannelResponse = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChannelResponse]
    }
  }

  @js.native
  trait DeleteChannelBanRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
    var MemberArn: ChimeArn
  }

  object DeleteChannelBanRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn,
        MemberArn: ChimeArn
    ): DeleteChannelBanRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any],
        "MemberArn" -> MemberArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteChannelBanRequest]
    }
  }

  @js.native
  trait DeleteChannelFlowRequest extends js.Object {
    var ChannelFlowArn: ChimeArn
  }

  object DeleteChannelFlowRequest {
    @inline
    def apply(
        ChannelFlowArn: ChimeArn
    ): DeleteChannelFlowRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelFlowArn" -> ChannelFlowArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteChannelFlowRequest]
    }
  }

  @js.native
  trait DeleteChannelMembershipRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
    var MemberArn: ChimeArn
  }

  object DeleteChannelMembershipRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn,
        MemberArn: ChimeArn
    ): DeleteChannelMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any],
        "MemberArn" -> MemberArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteChannelMembershipRequest]
    }
  }

  @js.native
  trait DeleteChannelMessageRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
    var MessageId: MessageId
  }

  object DeleteChannelMessageRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn,
        MessageId: MessageId
    ): DeleteChannelMessageRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any],
        "MessageId" -> MessageId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteChannelMessageRequest]
    }
  }

  @js.native
  trait DeleteChannelModeratorRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChannelModeratorArn: ChimeArn
    var ChimeBearer: ChimeArn
  }

  object DeleteChannelModeratorRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChannelModeratorArn: ChimeArn,
        ChimeBearer: ChimeArn
    ): DeleteChannelModeratorRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChannelModeratorArn" -> ChannelModeratorArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteChannelModeratorRequest]
    }
  }

  @js.native
  trait DeleteChannelRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
  }

  object DeleteChannelRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn
    ): DeleteChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteChannelRequest]
    }
  }

  @js.native
  trait DescribeChannelBanRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
    var MemberArn: ChimeArn
  }

  object DescribeChannelBanRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn,
        MemberArn: ChimeArn
    ): DescribeChannelBanRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any],
        "MemberArn" -> MemberArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeChannelBanRequest]
    }
  }

  @js.native
  trait DescribeChannelBanResponse extends js.Object {
    var ChannelBan: js.UndefOr[ChannelBan]
  }

  object DescribeChannelBanResponse {
    @inline
    def apply(
        ChannelBan: js.UndefOr[ChannelBan] = js.undefined
    ): DescribeChannelBanResponse = {
      val __obj = js.Dynamic.literal()
      ChannelBan.foreach(__v => __obj.updateDynamic("ChannelBan")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeChannelBanResponse]
    }
  }

  @js.native
  trait DescribeChannelFlowRequest extends js.Object {
    var ChannelFlowArn: ChimeArn
  }

  object DescribeChannelFlowRequest {
    @inline
    def apply(
        ChannelFlowArn: ChimeArn
    ): DescribeChannelFlowRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelFlowArn" -> ChannelFlowArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeChannelFlowRequest]
    }
  }

  @js.native
  trait DescribeChannelFlowResponse extends js.Object {
    var ChannelFlow: js.UndefOr[ChannelFlow]
  }

  object DescribeChannelFlowResponse {
    @inline
    def apply(
        ChannelFlow: js.UndefOr[ChannelFlow] = js.undefined
    ): DescribeChannelFlowResponse = {
      val __obj = js.Dynamic.literal()
      ChannelFlow.foreach(__v => __obj.updateDynamic("ChannelFlow")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeChannelFlowResponse]
    }
  }

  @js.native
  trait DescribeChannelMembershipForAppInstanceUserRequest extends js.Object {
    var AppInstanceUserArn: ChimeArn
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
  }

  object DescribeChannelMembershipForAppInstanceUserRequest {
    @inline
    def apply(
        AppInstanceUserArn: ChimeArn,
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn
    ): DescribeChannelMembershipForAppInstanceUserRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceUserArn" -> AppInstanceUserArn.asInstanceOf[js.Any],
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeChannelMembershipForAppInstanceUserRequest]
    }
  }

  @js.native
  trait DescribeChannelMembershipForAppInstanceUserResponse extends js.Object {
    var ChannelMembership: js.UndefOr[ChannelMembershipForAppInstanceUserSummary]
  }

  object DescribeChannelMembershipForAppInstanceUserResponse {
    @inline
    def apply(
        ChannelMembership: js.UndefOr[ChannelMembershipForAppInstanceUserSummary] = js.undefined
    ): DescribeChannelMembershipForAppInstanceUserResponse = {
      val __obj = js.Dynamic.literal()
      ChannelMembership.foreach(__v => __obj.updateDynamic("ChannelMembership")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeChannelMembershipForAppInstanceUserResponse]
    }
  }

  @js.native
  trait DescribeChannelMembershipRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
    var MemberArn: ChimeArn
  }

  object DescribeChannelMembershipRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn,
        MemberArn: ChimeArn
    ): DescribeChannelMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any],
        "MemberArn" -> MemberArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeChannelMembershipRequest]
    }
  }

  @js.native
  trait DescribeChannelMembershipResponse extends js.Object {
    var ChannelMembership: js.UndefOr[ChannelMembership]
  }

  object DescribeChannelMembershipResponse {
    @inline
    def apply(
        ChannelMembership: js.UndefOr[ChannelMembership] = js.undefined
    ): DescribeChannelMembershipResponse = {
      val __obj = js.Dynamic.literal()
      ChannelMembership.foreach(__v => __obj.updateDynamic("ChannelMembership")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeChannelMembershipResponse]
    }
  }

  @js.native
  trait DescribeChannelModeratedByAppInstanceUserRequest extends js.Object {
    var AppInstanceUserArn: ChimeArn
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
  }

  object DescribeChannelModeratedByAppInstanceUserRequest {
    @inline
    def apply(
        AppInstanceUserArn: ChimeArn,
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn
    ): DescribeChannelModeratedByAppInstanceUserRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceUserArn" -> AppInstanceUserArn.asInstanceOf[js.Any],
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeChannelModeratedByAppInstanceUserRequest]
    }
  }

  @js.native
  trait DescribeChannelModeratedByAppInstanceUserResponse extends js.Object {
    var Channel: js.UndefOr[ChannelModeratedByAppInstanceUserSummary]
  }

  object DescribeChannelModeratedByAppInstanceUserResponse {
    @inline
    def apply(
        Channel: js.UndefOr[ChannelModeratedByAppInstanceUserSummary] = js.undefined
    ): DescribeChannelModeratedByAppInstanceUserResponse = {
      val __obj = js.Dynamic.literal()
      Channel.foreach(__v => __obj.updateDynamic("Channel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeChannelModeratedByAppInstanceUserResponse]
    }
  }

  @js.native
  trait DescribeChannelModeratorRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChannelModeratorArn: ChimeArn
    var ChimeBearer: ChimeArn
  }

  object DescribeChannelModeratorRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChannelModeratorArn: ChimeArn,
        ChimeBearer: ChimeArn
    ): DescribeChannelModeratorRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChannelModeratorArn" -> ChannelModeratorArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeChannelModeratorRequest]
    }
  }

  @js.native
  trait DescribeChannelModeratorResponse extends js.Object {
    var ChannelModerator: js.UndefOr[ChannelModerator]
  }

  object DescribeChannelModeratorResponse {
    @inline
    def apply(
        ChannelModerator: js.UndefOr[ChannelModerator] = js.undefined
    ): DescribeChannelModeratorResponse = {
      val __obj = js.Dynamic.literal()
      ChannelModerator.foreach(__v => __obj.updateDynamic("ChannelModerator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeChannelModeratorResponse]
    }
  }

  @js.native
  trait DescribeChannelRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
  }

  object DescribeChannelRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn
    ): DescribeChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeChannelRequest]
    }
  }

  @js.native
  trait DescribeChannelResponse extends js.Object {
    var Channel: js.UndefOr[Channel]
  }

  object DescribeChannelResponse {
    @inline
    def apply(
        Channel: js.UndefOr[Channel] = js.undefined
    ): DescribeChannelResponse = {
      val __obj = js.Dynamic.literal()
      Channel.foreach(__v => __obj.updateDynamic("Channel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeChannelResponse]
    }
  }

  @js.native
  trait DisassociateChannelFlowRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChannelFlowArn: ChimeArn
    var ChimeBearer: ChimeArn
  }

  object DisassociateChannelFlowRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChannelFlowArn: ChimeArn,
        ChimeBearer: ChimeArn
    ): DisassociateChannelFlowRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChannelFlowArn" -> ChannelFlowArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateChannelFlowRequest]
    }
  }

  @js.native
  trait GetChannelMembershipPreferencesRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
    var MemberArn: ChimeArn
  }

  object GetChannelMembershipPreferencesRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn,
        MemberArn: ChimeArn
    ): GetChannelMembershipPreferencesRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any],
        "MemberArn" -> MemberArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetChannelMembershipPreferencesRequest]
    }
  }

  @js.native
  trait GetChannelMembershipPreferencesResponse extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var Member: js.UndefOr[Identity]
    var Preferences: js.UndefOr[ChannelMembershipPreferences]
  }

  object GetChannelMembershipPreferencesResponse {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        Member: js.UndefOr[Identity] = js.undefined,
        Preferences: js.UndefOr[ChannelMembershipPreferences] = js.undefined
    ): GetChannelMembershipPreferencesResponse = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      Member.foreach(__v => __obj.updateDynamic("Member")(__v.asInstanceOf[js.Any]))
      Preferences.foreach(__v => __obj.updateDynamic("Preferences")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetChannelMembershipPreferencesResponse]
    }
  }

  @js.native
  trait GetChannelMessageRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
    var MessageId: MessageId
  }

  object GetChannelMessageRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn,
        MessageId: MessageId
    ): GetChannelMessageRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any],
        "MessageId" -> MessageId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetChannelMessageRequest]
    }
  }

  @js.native
  trait GetChannelMessageResponse extends js.Object {
    var ChannelMessage: js.UndefOr[ChannelMessage]
  }

  object GetChannelMessageResponse {
    @inline
    def apply(
        ChannelMessage: js.UndefOr[ChannelMessage] = js.undefined
    ): GetChannelMessageResponse = {
      val __obj = js.Dynamic.literal()
      ChannelMessage.foreach(__v => __obj.updateDynamic("ChannelMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetChannelMessageResponse]
    }
  }

  @js.native
  trait GetChannelMessageStatusRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
    var MessageId: MessageId
  }

  object GetChannelMessageStatusRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn,
        MessageId: MessageId
    ): GetChannelMessageStatusRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any],
        "MessageId" -> MessageId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetChannelMessageStatusRequest]
    }
  }

  @js.native
  trait GetChannelMessageStatusResponse extends js.Object {
    var Status: js.UndefOr[ChannelMessageStatusStructure]
  }

  object GetChannelMessageStatusResponse {
    @inline
    def apply(
        Status: js.UndefOr[ChannelMessageStatusStructure] = js.undefined
    ): GetChannelMessageStatusResponse = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetChannelMessageStatusResponse]
    }
  }

  @js.native
  trait GetMessagingSessionEndpointRequest extends js.Object

  object GetMessagingSessionEndpointRequest {
    @inline
    def apply(): GetMessagingSessionEndpointRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetMessagingSessionEndpointRequest]
    }
  }

  @js.native
  trait GetMessagingSessionEndpointResponse extends js.Object {
    var Endpoint: js.UndefOr[MessagingSessionEndpoint]
  }

  object GetMessagingSessionEndpointResponse {
    @inline
    def apply(
        Endpoint: js.UndefOr[MessagingSessionEndpoint] = js.undefined
    ): GetMessagingSessionEndpointResponse = {
      val __obj = js.Dynamic.literal()
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMessagingSessionEndpointResponse]
    }
  }

  /** The details of a user.
    */
  @js.native
  trait Identity extends js.Object {
    var Arn: js.UndefOr[ChimeArn]
    var Name: js.UndefOr[ResourceName]
  }

  object Identity {
    @inline
    def apply(
        Arn: js.UndefOr[ChimeArn] = js.undefined,
        Name: js.UndefOr[ResourceName] = js.undefined
    ): Identity = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Identity]
    }
  }

  /** Stores metadata about a Lambda processor.
    */
  @js.native
  trait LambdaConfiguration extends js.Object {
    var InvocationType: InvocationType
    var ResourceArn: LambdaFunctionArn
  }

  object LambdaConfiguration {
    @inline
    def apply(
        InvocationType: InvocationType,
        ResourceArn: LambdaFunctionArn
    ): LambdaConfiguration = {
      val __obj = js.Dynamic.literal(
        "InvocationType" -> InvocationType.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LambdaConfiguration]
    }
  }

  @js.native
  trait ListChannelBansRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChannelBansRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelBansRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelBansRequest]
    }
  }

  @js.native
  trait ListChannelBansResponse extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var ChannelBans: js.UndefOr[ChannelBanSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChannelBansResponse {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        ChannelBans: js.UndefOr[ChannelBanSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelBansResponse = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      ChannelBans.foreach(__v => __obj.updateDynamic("ChannelBans")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelBansResponse]
    }
  }

  @js.native
  trait ListChannelFlowsRequest extends js.Object {
    var AppInstanceArn: ChimeArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChannelFlowsRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelFlowsRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelFlowsRequest]
    }
  }

  @js.native
  trait ListChannelFlowsResponse extends js.Object {
    var ChannelFlows: js.UndefOr[ChannelFlowSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChannelFlowsResponse {
    @inline
    def apply(
        ChannelFlows: js.UndefOr[ChannelFlowSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelFlowsResponse = {
      val __obj = js.Dynamic.literal()
      ChannelFlows.foreach(__v => __obj.updateDynamic("ChannelFlows")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelFlowsResponse]
    }
  }

  @js.native
  trait ListChannelMembershipsForAppInstanceUserRequest extends js.Object {
    var ChimeBearer: ChimeArn
    var AppInstanceUserArn: js.UndefOr[ChimeArn]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChannelMembershipsForAppInstanceUserRequest {
    @inline
    def apply(
        ChimeBearer: ChimeArn,
        AppInstanceUserArn: js.UndefOr[ChimeArn] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelMembershipsForAppInstanceUserRequest = {
      val __obj = js.Dynamic.literal(
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any]
      )

      AppInstanceUserArn.foreach(__v => __obj.updateDynamic("AppInstanceUserArn")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelMembershipsForAppInstanceUserRequest]
    }
  }

  @js.native
  trait ListChannelMembershipsForAppInstanceUserResponse extends js.Object {
    var ChannelMemberships: js.UndefOr[ChannelMembershipForAppInstanceUserSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChannelMembershipsForAppInstanceUserResponse {
    @inline
    def apply(
        ChannelMemberships: js.UndefOr[ChannelMembershipForAppInstanceUserSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelMembershipsForAppInstanceUserResponse = {
      val __obj = js.Dynamic.literal()
      ChannelMemberships.foreach(__v => __obj.updateDynamic("ChannelMemberships")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelMembershipsForAppInstanceUserResponse]
    }
  }

  @js.native
  trait ListChannelMembershipsRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Type: js.UndefOr[ChannelMembershipType]
  }

  object ListChannelMembershipsRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Type: js.UndefOr[ChannelMembershipType] = js.undefined
    ): ListChannelMembershipsRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelMembershipsRequest]
    }
  }

  @js.native
  trait ListChannelMembershipsResponse extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var ChannelMemberships: js.UndefOr[ChannelMembershipSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChannelMembershipsResponse {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        ChannelMemberships: js.UndefOr[ChannelMembershipSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelMembershipsResponse = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      ChannelMemberships.foreach(__v => __obj.updateDynamic("ChannelMemberships")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelMembershipsResponse]
    }
  }

  @js.native
  trait ListChannelMessagesRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var NotAfter: js.UndefOr[Timestamp]
    var NotBefore: js.UndefOr[Timestamp]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListChannelMessagesRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        NotAfter: js.UndefOr[Timestamp] = js.undefined,
        NotBefore: js.UndefOr[Timestamp] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListChannelMessagesRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NotAfter.foreach(__v => __obj.updateDynamic("NotAfter")(__v.asInstanceOf[js.Any]))
      NotBefore.foreach(__v => __obj.updateDynamic("NotBefore")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelMessagesRequest]
    }
  }

  @js.native
  trait ListChannelMessagesResponse extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var ChannelMessages: js.UndefOr[ChannelMessageSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChannelMessagesResponse {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        ChannelMessages: js.UndefOr[ChannelMessageSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelMessagesResponse = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      ChannelMessages.foreach(__v => __obj.updateDynamic("ChannelMessages")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelMessagesResponse]
    }
  }

  @js.native
  trait ListChannelModeratorsRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChannelModeratorsRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelModeratorsRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelModeratorsRequest]
    }
  }

  @js.native
  trait ListChannelModeratorsResponse extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var ChannelModerators: js.UndefOr[ChannelModeratorSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChannelModeratorsResponse {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        ChannelModerators: js.UndefOr[ChannelModeratorSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelModeratorsResponse = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      ChannelModerators.foreach(__v => __obj.updateDynamic("ChannelModerators")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelModeratorsResponse]
    }
  }

  @js.native
  trait ListChannelsAssociatedWithChannelFlowRequest extends js.Object {
    var ChannelFlowArn: ChimeArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChannelsAssociatedWithChannelFlowRequest {
    @inline
    def apply(
        ChannelFlowArn: ChimeArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelsAssociatedWithChannelFlowRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelFlowArn" -> ChannelFlowArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelsAssociatedWithChannelFlowRequest]
    }
  }

  @js.native
  trait ListChannelsAssociatedWithChannelFlowResponse extends js.Object {
    var Channels: js.UndefOr[ChannelAssociatedWithFlowSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChannelsAssociatedWithChannelFlowResponse {
    @inline
    def apply(
        Channels: js.UndefOr[ChannelAssociatedWithFlowSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelsAssociatedWithChannelFlowResponse = {
      val __obj = js.Dynamic.literal()
      Channels.foreach(__v => __obj.updateDynamic("Channels")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelsAssociatedWithChannelFlowResponse]
    }
  }

  @js.native
  trait ListChannelsModeratedByAppInstanceUserRequest extends js.Object {
    var ChimeBearer: ChimeArn
    var AppInstanceUserArn: js.UndefOr[ChimeArn]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChannelsModeratedByAppInstanceUserRequest {
    @inline
    def apply(
        ChimeBearer: ChimeArn,
        AppInstanceUserArn: js.UndefOr[ChimeArn] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelsModeratedByAppInstanceUserRequest = {
      val __obj = js.Dynamic.literal(
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any]
      )

      AppInstanceUserArn.foreach(__v => __obj.updateDynamic("AppInstanceUserArn")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelsModeratedByAppInstanceUserRequest]
    }
  }

  @js.native
  trait ListChannelsModeratedByAppInstanceUserResponse extends js.Object {
    var Channels: js.UndefOr[ChannelModeratedByAppInstanceUserSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChannelsModeratedByAppInstanceUserResponse {
    @inline
    def apply(
        Channels: js.UndefOr[ChannelModeratedByAppInstanceUserSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelsModeratedByAppInstanceUserResponse = {
      val __obj = js.Dynamic.literal()
      Channels.foreach(__v => __obj.updateDynamic("Channels")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelsModeratedByAppInstanceUserResponse]
    }
  }

  @js.native
  trait ListChannelsRequest extends js.Object {
    var AppInstanceArn: ChimeArn
    var ChimeBearer: ChimeArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Privacy: js.UndefOr[ChannelPrivacy]
  }

  object ListChannelsRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn,
        ChimeBearer: ChimeArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Privacy: js.UndefOr[ChannelPrivacy] = js.undefined
    ): ListChannelsRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Privacy.foreach(__v => __obj.updateDynamic("Privacy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelsRequest]
    }
  }

  @js.native
  trait ListChannelsResponse extends js.Object {
    var Channels: js.UndefOr[ChannelSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChannelsResponse {
    @inline
    def apply(
        Channels: js.UndefOr[ChannelSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelsResponse = {
      val __obj = js.Dynamic.literal()
      Channels.foreach(__v => __obj.updateDynamic("Channels")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: ChimeArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: ChimeArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** A list of message attribute values.
    */
  @js.native
  trait MessageAttributeValue extends js.Object {
    var StringValues: js.UndefOr[MessageAttributeStringValues]
  }

  object MessageAttributeValue {
    @inline
    def apply(
        StringValues: js.UndefOr[MessageAttributeStringValues] = js.undefined
    ): MessageAttributeValue = {
      val __obj = js.Dynamic.literal()
      StringValues.foreach(__v => __obj.updateDynamic("StringValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageAttributeValue]
    }
  }

  /** The websocket endpoint used to connect to Amazon Chime SDK messaging.
    */
  @js.native
  trait MessagingSessionEndpoint extends js.Object {
    var Url: js.UndefOr[UrlType]
  }

  object MessagingSessionEndpoint {
    @inline
    def apply(
        Url: js.UndefOr[UrlType] = js.undefined
    ): MessagingSessionEndpoint = {
      val __obj = js.Dynamic.literal()
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessagingSessionEndpoint]
    }
  }

  /** The information about a processor in a channel flow.
    */
  @js.native
  trait Processor extends js.Object {
    var Configuration: ProcessorConfiguration
    var ExecutionOrder: ChannelFlowExecutionOrder
    var FallbackAction: FallbackAction
    var Name: NonEmptyResourceName
  }

  object Processor {
    @inline
    def apply(
        Configuration: ProcessorConfiguration,
        ExecutionOrder: ChannelFlowExecutionOrder,
        FallbackAction: FallbackAction,
        Name: NonEmptyResourceName
    ): Processor = {
      val __obj = js.Dynamic.literal(
        "Configuration" -> Configuration.asInstanceOf[js.Any],
        "ExecutionOrder" -> ExecutionOrder.asInstanceOf[js.Any],
        "FallbackAction" -> FallbackAction.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Processor]
    }
  }

  /** A processor's metadata.
    */
  @js.native
  trait ProcessorConfiguration extends js.Object {
    var Lambda: LambdaConfiguration
  }

  object ProcessorConfiguration {
    @inline
    def apply(
        Lambda: LambdaConfiguration
    ): ProcessorConfiguration = {
      val __obj = js.Dynamic.literal(
        "Lambda" -> Lambda.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProcessorConfiguration]
    }
  }

  /** The push notification configuration of the message.
    */
  @js.native
  trait PushNotificationConfiguration extends js.Object {
    var Body: js.UndefOr[PushNotificationBody]
    var Title: js.UndefOr[PushNotificationTitle]
    var Type: js.UndefOr[PushNotificationType]
  }

  object PushNotificationConfiguration {
    @inline
    def apply(
        Body: js.UndefOr[PushNotificationBody] = js.undefined,
        Title: js.UndefOr[PushNotificationTitle] = js.undefined,
        Type: js.UndefOr[PushNotificationType] = js.undefined
    ): PushNotificationConfiguration = {
      val __obj = js.Dynamic.literal()
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PushNotificationConfiguration]
    }
  }

  /** The channel membership preferences for push notification.
    */
  @js.native
  trait PushNotificationPreferences extends js.Object {
    var AllowNotifications: AllowNotifications
    var FilterRule: js.UndefOr[FilterRule]
  }

  object PushNotificationPreferences {
    @inline
    def apply(
        AllowNotifications: AllowNotifications,
        FilterRule: js.UndefOr[FilterRule] = js.undefined
    ): PushNotificationPreferences = {
      val __obj = js.Dynamic.literal(
        "AllowNotifications" -> AllowNotifications.asInstanceOf[js.Any]
      )

      FilterRule.foreach(__v => __obj.updateDynamic("FilterRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PushNotificationPreferences]
    }
  }

  @js.native
  trait PutChannelMembershipPreferencesRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
    var MemberArn: ChimeArn
    var Preferences: ChannelMembershipPreferences
  }

  object PutChannelMembershipPreferencesRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn,
        MemberArn: ChimeArn,
        Preferences: ChannelMembershipPreferences
    ): PutChannelMembershipPreferencesRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any],
        "MemberArn" -> MemberArn.asInstanceOf[js.Any],
        "Preferences" -> Preferences.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutChannelMembershipPreferencesRequest]
    }
  }

  @js.native
  trait PutChannelMembershipPreferencesResponse extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var Member: js.UndefOr[Identity]
    var Preferences: js.UndefOr[ChannelMembershipPreferences]
  }

  object PutChannelMembershipPreferencesResponse {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        Member: js.UndefOr[Identity] = js.undefined,
        Preferences: js.UndefOr[ChannelMembershipPreferences] = js.undefined
    ): PutChannelMembershipPreferencesResponse = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      Member.foreach(__v => __obj.updateDynamic("Member")(__v.asInstanceOf[js.Any]))
      Preferences.foreach(__v => __obj.updateDynamic("Preferences")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutChannelMembershipPreferencesResponse]
    }
  }

  @js.native
  trait RedactChannelMessageRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
    var MessageId: MessageId
  }

  object RedactChannelMessageRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn,
        MessageId: MessageId
    ): RedactChannelMessageRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any],
        "MessageId" -> MessageId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RedactChannelMessageRequest]
    }
  }

  @js.native
  trait RedactChannelMessageResponse extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var MessageId: js.UndefOr[MessageId]
  }

  object RedactChannelMessageResponse {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        MessageId: js.UndefOr[MessageId] = js.undefined
    ): RedactChannelMessageResponse = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RedactChannelMessageResponse]
    }
  }

  @js.native
  trait SendChannelMessageRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
    var ClientRequestToken: ClientRequestToken
    var Content: NonEmptyContent
    var Persistence: ChannelMessagePersistenceType
    var Type: ChannelMessageType
    var MessageAttributes: js.UndefOr[MessageAttributeMap]
    var Metadata: js.UndefOr[Metadata]
    var PushNotification: js.UndefOr[PushNotificationConfiguration]
  }

  object SendChannelMessageRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn,
        ClientRequestToken: ClientRequestToken,
        Content: NonEmptyContent,
        Persistence: ChannelMessagePersistenceType,
        Type: ChannelMessageType,
        MessageAttributes: js.UndefOr[MessageAttributeMap] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        PushNotification: js.UndefOr[PushNotificationConfiguration] = js.undefined
    ): SendChannelMessageRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "Content" -> Content.asInstanceOf[js.Any],
        "Persistence" -> Persistence.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      MessageAttributes.foreach(__v => __obj.updateDynamic("MessageAttributes")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      PushNotification.foreach(__v => __obj.updateDynamic("PushNotification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendChannelMessageRequest]
    }
  }

  @js.native
  trait SendChannelMessageResponse extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var MessageId: js.UndefOr[MessageId]
    var Status: js.UndefOr[ChannelMessageStatusStructure]
  }

  object SendChannelMessageResponse {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        MessageId: js.UndefOr[MessageId] = js.undefined,
        Status: js.UndefOr[ChannelMessageStatusStructure] = js.undefined
    ): SendChannelMessageResponse = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendChannelMessageResponse]
    }
  }

  /** A tag object containing a key-value pair.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: ChimeArn
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: ChimeArn,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: ChimeArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: ChimeArn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateChannelFlowRequest extends js.Object {
    var ChannelFlowArn: ChimeArn
    var Name: NonEmptyResourceName
    var Processors: ProcessorList
  }

  object UpdateChannelFlowRequest {
    @inline
    def apply(
        ChannelFlowArn: ChimeArn,
        Name: NonEmptyResourceName,
        Processors: ProcessorList
    ): UpdateChannelFlowRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelFlowArn" -> ChannelFlowArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Processors" -> Processors.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateChannelFlowRequest]
    }
  }

  @js.native
  trait UpdateChannelFlowResponse extends js.Object {
    var ChannelFlowArn: js.UndefOr[ChimeArn]
  }

  object UpdateChannelFlowResponse {
    @inline
    def apply(
        ChannelFlowArn: js.UndefOr[ChimeArn] = js.undefined
    ): UpdateChannelFlowResponse = {
      val __obj = js.Dynamic.literal()
      ChannelFlowArn.foreach(__v => __obj.updateDynamic("ChannelFlowArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChannelFlowResponse]
    }
  }

  @js.native
  trait UpdateChannelMessageRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
    var MessageId: MessageId
    var Content: js.UndefOr[Content]
    var Metadata: js.UndefOr[Metadata]
  }

  object UpdateChannelMessageRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn,
        MessageId: MessageId,
        Content: js.UndefOr[Content] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined
    ): UpdateChannelMessageRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any],
        "MessageId" -> MessageId.asInstanceOf[js.Any]
      )

      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChannelMessageRequest]
    }
  }

  @js.native
  trait UpdateChannelMessageResponse extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var MessageId: js.UndefOr[MessageId]
    var Status: js.UndefOr[ChannelMessageStatusStructure]
  }

  object UpdateChannelMessageResponse {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        MessageId: js.UndefOr[MessageId] = js.undefined,
        Status: js.UndefOr[ChannelMessageStatusStructure] = js.undefined
    ): UpdateChannelMessageResponse = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChannelMessageResponse]
    }
  }

  @js.native
  trait UpdateChannelReadMarkerRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
  }

  object UpdateChannelReadMarkerRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn
    ): UpdateChannelReadMarkerRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateChannelReadMarkerRequest]
    }
  }

  @js.native
  trait UpdateChannelReadMarkerResponse extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
  }

  object UpdateChannelReadMarkerResponse {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined
    ): UpdateChannelReadMarkerResponse = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChannelReadMarkerResponse]
    }
  }

  @js.native
  trait UpdateChannelRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: ChimeArn
    var Mode: ChannelMode
    var Name: NonEmptyResourceName
    var Metadata: js.UndefOr[Metadata]
  }

  object UpdateChannelRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: ChimeArn,
        Mode: ChannelMode,
        Name: NonEmptyResourceName,
        Metadata: js.UndefOr[Metadata] = js.undefined
    ): UpdateChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChimeBearer" -> ChimeBearer.asInstanceOf[js.Any],
        "Mode" -> Mode.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChannelRequest]
    }
  }

  @js.native
  trait UpdateChannelResponse extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
  }

  object UpdateChannelResponse {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined
    ): UpdateChannelResponse = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChannelResponse]
    }
  }
}
