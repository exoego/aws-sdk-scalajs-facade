package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object chime {
  type AccountList = js.Array[Account]
  type AccountName = String
  type Alpha2CountryCode = String
  type AppInstanceAdminList = js.Array[AppInstanceAdminSummary]
  type AppInstanceList = js.Array[AppInstanceSummary]
  type AppInstanceStreamingConfigurationList = js.Array[AppInstanceStreamingConfiguration]
  type AppInstanceUserList = js.Array[AppInstanceUserSummary]
  type AreaCode = String
  type Arn = String
  type AttendeeIdList = js.Array[GuidString]
  type AttendeeList = js.Array[Attendee]
  type AttendeeTagKeyList = js.Array[TagKey]
  type AttendeeTagList = js.Array[Tag]
  type BatchCreateAttendeeErrorList = js.Array[CreateAttendeeError]
  type BatchCreateChannelMembershipErrors = js.Array[BatchCreateChannelMembershipError]
  type BotList = js.Array[Bot]
  type CallingName = String
  type CallingRegion = String
  type CallingRegionList = js.Array[CallingRegion]
  type CapabilityList = js.Array[Capability]
  type ChannelBanSummaryList = js.Array[ChannelBanSummary]
  type ChannelMembershipForAppInstanceUserSummaryList = js.Array[ChannelMembershipForAppInstanceUserSummary]
  type ChannelMembershipSummaryList = js.Array[ChannelMembershipSummary]
  type ChannelMessageSummaryList = js.Array[ChannelMessageSummary]
  type ChannelModeratedByAppInstanceUserSummaryList = js.Array[ChannelModeratedByAppInstanceUserSummary]
  type ChannelModeratorSummaryList = js.Array[ChannelModeratorSummary]
  type ChannelSummaryList = js.Array[ChannelSummary]
  type ChimeArn = String
  type ClientRequestToken = String
  type Content = String
  type Country = String
  type CountryList = js.Array[Country]
  type CpsLimit = Int
  type CreateAttendeeRequestItemList = js.Array[CreateAttendeeRequestItem]
  type CreateMeetingWithAttendeesRequestItemList = js.Array[CreateAttendeeRequestItem]
  type CredentialList = js.Array[Credential]
  type DNISEmergencyCallingConfigurationList = js.Array[DNISEmergencyCallingConfiguration]
  type DataRetentionInHours = Int
  type E164PhoneNumber = String
  type E164PhoneNumberList = js.Array[E164PhoneNumber]
  type EmailAddress = String
  type ExternalMeetingIdType = String
  type ExternalUserIdList = js.Array[ExternalUserIdType]
  type ExternalUserIdType = String
  type FunctionArn = String
  type GuidString = String
  type InviteList = js.Array[Invite]
  type Iso8601Timestamp = js.Date
  type JoinTokenString = String
  type LicenseList = js.Array[License]
  type MaxResults = Int
  type MediaCapturePipelineList = js.Array[MediaCapturePipeline]
  type MeetingList = js.Array[Meeting]
  type MeetingTagKeyList = js.Array[TagKey]
  type MeetingTagList = js.Array[Tag]
  type MemberArns = js.Array[ChimeArn]
  type MemberErrorList = js.Array[MemberError]
  type Members = js.Array[Identity]
  type MembershipItemList = js.Array[MembershipItem]
  type MessageId = String
  type Metadata = String
  type NextToken = String
  type NextTokenString = String
  type NonEmptyContent = String
  type NonEmptyResourceName = String
  type NonEmptyString = String
  type NonEmptyString128 = String
  type NonEmptyStringList = js.Array[String]
  type NonNullableBoolean = Boolean
  type NullableBoolean = Boolean
  type OrderedPhoneNumberList = js.Array[OrderedPhoneNumber]
  type OriginationRouteList = js.Array[OriginationRoute]
  type OriginationRoutePriority = Int
  type OriginationRouteWeight = Int
  type ParticipantPhoneNumberList = js.Array[E164PhoneNumber]
  type Participants = js.Array[Participant]
  type PhoneNumberAssociationList = js.Array[PhoneNumberAssociation]
  type PhoneNumberCountriesList = js.Array[PhoneNumberCountry]
  type PhoneNumberErrorList = js.Array[PhoneNumberError]
  type PhoneNumberList = js.Array[PhoneNumber]
  type PhoneNumberMaxResults = Int
  type PhoneNumberOrderList = js.Array[PhoneNumberOrder]
  type PhoneNumberTypeList = js.Array[PhoneNumberType]
  type Port = Int
  type PositiveInteger = Int
  type ProfileServiceMaxResults = Int
  type ProxySessionNameString = String
  type ProxySessions = js.Array[ProxySession]
  type ResourceName = String
  type ResultMax = Int
  type RetentionDays = Int
  type RoomList = js.Array[Room]
  type RoomMembershipList = js.Array[RoomMembership]
  type SMAUpdateCallArgumentsMap = js.Dictionary[SensitiveString]
  type SensitiveString = String
  type SensitiveStringList = js.Array[SensitiveString]
  type SigninDelegateGroupList = js.Array[SigninDelegateGroup]
  type SipApplicationPriority = Int
  type SipHeadersMap = js.Dictionary[SensitiveString]
  type SipMediaApplicationEndpointList = js.Array[SipMediaApplicationEndpoint]
  type SipMediaApplicationList = js.Array[SipMediaApplication]
  type SipMediaApplicationName = String
  type SipRuleList = js.Array[SipRule]
  type SipRuleName = String
  type SipRuleTargetApplicationList = js.Array[SipRuleTargetApplication]
  type StreamingNotificationTargetList = js.Array[StreamingNotificationTarget]
  type String128 = String
  type StringList = js.Array[String]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = js.Date
  type TollFreePrefix = String
  type TranscribeLanguageModelName = String
  type TranscribePiiEntityTypes = String
  type UpdatePhoneNumberRequestItemList = js.Array[UpdatePhoneNumberRequestItem]
  type UpdateUserRequestItemList = js.Array[UpdateUserRequestItem]
  type UriType = String
  type UrlType = String
  type UserEmailList = js.Array[EmailAddress]
  type UserErrorList = js.Array[UserError]
  type UserId = String
  type UserIdList = js.Array[NonEmptyString]
  type UserList = js.Array[User]
  type UserName = String
  type VoiceConnectorGroupList = js.Array[VoiceConnectorGroup]
  type VoiceConnectorGroupName = String
  type VoiceConnectorItemList = js.Array[VoiceConnectorItem]
  type VoiceConnectorItemPriority = Int
  type VoiceConnectorList = js.Array[VoiceConnector]
  type VoiceConnectorName = String

  final class ChimeOps(private val service: Chime) extends AnyVal {

    @inline def associatePhoneNumberWithUserFuture(params: AssociatePhoneNumberWithUserRequest): Future[AssociatePhoneNumberWithUserResponse] = service.associatePhoneNumberWithUser(params).promise().toFuture
    @inline def associatePhoneNumbersWithVoiceConnectorFuture(params: AssociatePhoneNumbersWithVoiceConnectorRequest): Future[AssociatePhoneNumbersWithVoiceConnectorResponse] = service.associatePhoneNumbersWithVoiceConnector(params).promise().toFuture
    @inline def associatePhoneNumbersWithVoiceConnectorGroupFuture(params: AssociatePhoneNumbersWithVoiceConnectorGroupRequest): Future[AssociatePhoneNumbersWithVoiceConnectorGroupResponse] = service.associatePhoneNumbersWithVoiceConnectorGroup(params).promise().toFuture
    @inline def associateSigninDelegateGroupsWithAccountFuture(params: AssociateSigninDelegateGroupsWithAccountRequest): Future[AssociateSigninDelegateGroupsWithAccountResponse] = service.associateSigninDelegateGroupsWithAccount(params).promise().toFuture
    @inline def batchCreateAttendeeFuture(params: BatchCreateAttendeeRequest): Future[BatchCreateAttendeeResponse] = service.batchCreateAttendee(params).promise().toFuture
    @inline def batchCreateChannelMembershipFuture(params: BatchCreateChannelMembershipRequest): Future[BatchCreateChannelMembershipResponse] = service.batchCreateChannelMembership(params).promise().toFuture
    @inline def batchCreateRoomMembershipFuture(params: BatchCreateRoomMembershipRequest): Future[BatchCreateRoomMembershipResponse] = service.batchCreateRoomMembership(params).promise().toFuture
    @inline def batchDeletePhoneNumberFuture(params: BatchDeletePhoneNumberRequest): Future[BatchDeletePhoneNumberResponse] = service.batchDeletePhoneNumber(params).promise().toFuture
    @inline def batchSuspendUserFuture(params: BatchSuspendUserRequest): Future[BatchSuspendUserResponse] = service.batchSuspendUser(params).promise().toFuture
    @inline def batchUnsuspendUserFuture(params: BatchUnsuspendUserRequest): Future[BatchUnsuspendUserResponse] = service.batchUnsuspendUser(params).promise().toFuture
    @inline def batchUpdatePhoneNumberFuture(params: BatchUpdatePhoneNumberRequest): Future[BatchUpdatePhoneNumberResponse] = service.batchUpdatePhoneNumber(params).promise().toFuture
    @inline def batchUpdateUserFuture(params: BatchUpdateUserRequest): Future[BatchUpdateUserResponse] = service.batchUpdateUser(params).promise().toFuture
    @inline def createAccountFuture(params: CreateAccountRequest): Future[CreateAccountResponse] = service.createAccount(params).promise().toFuture
    @inline def createAppInstanceAdminFuture(params: CreateAppInstanceAdminRequest): Future[CreateAppInstanceAdminResponse] = service.createAppInstanceAdmin(params).promise().toFuture
    @inline def createAppInstanceFuture(params: CreateAppInstanceRequest): Future[CreateAppInstanceResponse] = service.createAppInstance(params).promise().toFuture
    @inline def createAppInstanceUserFuture(params: CreateAppInstanceUserRequest): Future[CreateAppInstanceUserResponse] = service.createAppInstanceUser(params).promise().toFuture
    @inline def createAttendeeFuture(params: CreateAttendeeRequest): Future[CreateAttendeeResponse] = service.createAttendee(params).promise().toFuture
    @inline def createBotFuture(params: CreateBotRequest): Future[CreateBotResponse] = service.createBot(params).promise().toFuture
    @inline def createChannelBanFuture(params: CreateChannelBanRequest): Future[CreateChannelBanResponse] = service.createChannelBan(params).promise().toFuture
    @inline def createChannelFuture(params: CreateChannelRequest): Future[CreateChannelResponse] = service.createChannel(params).promise().toFuture
    @inline def createChannelMembershipFuture(params: CreateChannelMembershipRequest): Future[CreateChannelMembershipResponse] = service.createChannelMembership(params).promise().toFuture
    @inline def createChannelModeratorFuture(params: CreateChannelModeratorRequest): Future[CreateChannelModeratorResponse] = service.createChannelModerator(params).promise().toFuture
    @inline def createMediaCapturePipelineFuture(params: CreateMediaCapturePipelineRequest): Future[CreateMediaCapturePipelineResponse] = service.createMediaCapturePipeline(params).promise().toFuture
    @inline def createMeetingDialOutFuture(params: CreateMeetingDialOutRequest): Future[CreateMeetingDialOutResponse] = service.createMeetingDialOut(params).promise().toFuture
    @inline def createMeetingFuture(params: CreateMeetingRequest): Future[CreateMeetingResponse] = service.createMeeting(params).promise().toFuture
    @inline def createMeetingWithAttendeesFuture(params: CreateMeetingWithAttendeesRequest): Future[CreateMeetingWithAttendeesResponse] = service.createMeetingWithAttendees(params).promise().toFuture
    @inline def createPhoneNumberOrderFuture(params: CreatePhoneNumberOrderRequest): Future[CreatePhoneNumberOrderResponse] = service.createPhoneNumberOrder(params).promise().toFuture
    @inline def createProxySessionFuture(params: CreateProxySessionRequest): Future[CreateProxySessionResponse] = service.createProxySession(params).promise().toFuture
    @inline def createRoomFuture(params: CreateRoomRequest): Future[CreateRoomResponse] = service.createRoom(params).promise().toFuture
    @inline def createRoomMembershipFuture(params: CreateRoomMembershipRequest): Future[CreateRoomMembershipResponse] = service.createRoomMembership(params).promise().toFuture
    @inline def createSipMediaApplicationCallFuture(params: CreateSipMediaApplicationCallRequest): Future[CreateSipMediaApplicationCallResponse] = service.createSipMediaApplicationCall(params).promise().toFuture
    @inline def createSipMediaApplicationFuture(params: CreateSipMediaApplicationRequest): Future[CreateSipMediaApplicationResponse] = service.createSipMediaApplication(params).promise().toFuture
    @inline def createSipRuleFuture(params: CreateSipRuleRequest): Future[CreateSipRuleResponse] = service.createSipRule(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] = service.createUser(params).promise().toFuture
    @inline def createVoiceConnectorFuture(params: CreateVoiceConnectorRequest): Future[CreateVoiceConnectorResponse] = service.createVoiceConnector(params).promise().toFuture
    @inline def createVoiceConnectorGroupFuture(params: CreateVoiceConnectorGroupRequest): Future[CreateVoiceConnectorGroupResponse] = service.createVoiceConnectorGroup(params).promise().toFuture
    @inline def deleteAccountFuture(params: DeleteAccountRequest): Future[DeleteAccountResponse] = service.deleteAccount(params).promise().toFuture
    @inline def deleteAppInstanceAdminFuture(params: DeleteAppInstanceAdminRequest): Future[js.Object] = service.deleteAppInstanceAdmin(params).promise().toFuture
    @inline def deleteAppInstanceFuture(params: DeleteAppInstanceRequest): Future[js.Object] = service.deleteAppInstance(params).promise().toFuture
    @inline def deleteAppInstanceStreamingConfigurationsFuture(params: DeleteAppInstanceStreamingConfigurationsRequest): Future[js.Object] = service.deleteAppInstanceStreamingConfigurations(params).promise().toFuture
    @inline def deleteAppInstanceUserFuture(params: DeleteAppInstanceUserRequest): Future[js.Object] = service.deleteAppInstanceUser(params).promise().toFuture
    @inline def deleteAttendeeFuture(params: DeleteAttendeeRequest): Future[js.Object] = service.deleteAttendee(params).promise().toFuture
    @inline def deleteChannelBanFuture(params: DeleteChannelBanRequest): Future[js.Object] = service.deleteChannelBan(params).promise().toFuture
    @inline def deleteChannelFuture(params: DeleteChannelRequest): Future[js.Object] = service.deleteChannel(params).promise().toFuture
    @inline def deleteChannelMembershipFuture(params: DeleteChannelMembershipRequest): Future[js.Object] = service.deleteChannelMembership(params).promise().toFuture
    @inline def deleteChannelMessageFuture(params: DeleteChannelMessageRequest): Future[js.Object] = service.deleteChannelMessage(params).promise().toFuture
    @inline def deleteChannelModeratorFuture(params: DeleteChannelModeratorRequest): Future[js.Object] = service.deleteChannelModerator(params).promise().toFuture
    @inline def deleteEventsConfigurationFuture(params: DeleteEventsConfigurationRequest): Future[js.Object] = service.deleteEventsConfiguration(params).promise().toFuture
    @inline def deleteMediaCapturePipelineFuture(params: DeleteMediaCapturePipelineRequest): Future[js.Object] = service.deleteMediaCapturePipeline(params).promise().toFuture
    @inline def deleteMeetingFuture(params: DeleteMeetingRequest): Future[js.Object] = service.deleteMeeting(params).promise().toFuture
    @inline def deletePhoneNumberFuture(params: DeletePhoneNumberRequest): Future[js.Object] = service.deletePhoneNumber(params).promise().toFuture
    @inline def deleteProxySessionFuture(params: DeleteProxySessionRequest): Future[js.Object] = service.deleteProxySession(params).promise().toFuture
    @inline def deleteRoomFuture(params: DeleteRoomRequest): Future[js.Object] = service.deleteRoom(params).promise().toFuture
    @inline def deleteRoomMembershipFuture(params: DeleteRoomMembershipRequest): Future[js.Object] = service.deleteRoomMembership(params).promise().toFuture
    @inline def deleteSipMediaApplicationFuture(params: DeleteSipMediaApplicationRequest): Future[js.Object] = service.deleteSipMediaApplication(params).promise().toFuture
    @inline def deleteSipRuleFuture(params: DeleteSipRuleRequest): Future[js.Object] = service.deleteSipRule(params).promise().toFuture
    @inline def deleteVoiceConnectorEmergencyCallingConfigurationFuture(params: DeleteVoiceConnectorEmergencyCallingConfigurationRequest): Future[js.Object] = service.deleteVoiceConnectorEmergencyCallingConfiguration(params).promise().toFuture
    @inline def deleteVoiceConnectorFuture(params: DeleteVoiceConnectorRequest): Future[js.Object] = service.deleteVoiceConnector(params).promise().toFuture
    @inline def deleteVoiceConnectorGroupFuture(params: DeleteVoiceConnectorGroupRequest): Future[js.Object] = service.deleteVoiceConnectorGroup(params).promise().toFuture
    @inline def deleteVoiceConnectorOriginationFuture(params: DeleteVoiceConnectorOriginationRequest): Future[js.Object] = service.deleteVoiceConnectorOrigination(params).promise().toFuture
    @inline def deleteVoiceConnectorProxyFuture(params: DeleteVoiceConnectorProxyRequest): Future[js.Object] = service.deleteVoiceConnectorProxy(params).promise().toFuture
    @inline def deleteVoiceConnectorStreamingConfigurationFuture(params: DeleteVoiceConnectorStreamingConfigurationRequest): Future[js.Object] = service.deleteVoiceConnectorStreamingConfiguration(params).promise().toFuture
    @inline def deleteVoiceConnectorTerminationCredentialsFuture(params: DeleteVoiceConnectorTerminationCredentialsRequest): Future[js.Object] = service.deleteVoiceConnectorTerminationCredentials(params).promise().toFuture
    @inline def deleteVoiceConnectorTerminationFuture(params: DeleteVoiceConnectorTerminationRequest): Future[js.Object] = service.deleteVoiceConnectorTermination(params).promise().toFuture
    @inline def describeAppInstanceAdminFuture(params: DescribeAppInstanceAdminRequest): Future[DescribeAppInstanceAdminResponse] = service.describeAppInstanceAdmin(params).promise().toFuture
    @inline def describeAppInstanceFuture(params: DescribeAppInstanceRequest): Future[DescribeAppInstanceResponse] = service.describeAppInstance(params).promise().toFuture
    @inline def describeAppInstanceUserFuture(params: DescribeAppInstanceUserRequest): Future[DescribeAppInstanceUserResponse] = service.describeAppInstanceUser(params).promise().toFuture
    @inline def describeChannelBanFuture(params: DescribeChannelBanRequest): Future[DescribeChannelBanResponse] = service.describeChannelBan(params).promise().toFuture
    @inline def describeChannelFuture(params: DescribeChannelRequest): Future[DescribeChannelResponse] = service.describeChannel(params).promise().toFuture
    @inline def describeChannelMembershipForAppInstanceUserFuture(params: DescribeChannelMembershipForAppInstanceUserRequest): Future[DescribeChannelMembershipForAppInstanceUserResponse] = service.describeChannelMembershipForAppInstanceUser(params).promise().toFuture
    @inline def describeChannelMembershipFuture(params: DescribeChannelMembershipRequest): Future[DescribeChannelMembershipResponse] = service.describeChannelMembership(params).promise().toFuture
    @inline def describeChannelModeratedByAppInstanceUserFuture(params: DescribeChannelModeratedByAppInstanceUserRequest): Future[DescribeChannelModeratedByAppInstanceUserResponse] = service.describeChannelModeratedByAppInstanceUser(params).promise().toFuture
    @inline def describeChannelModeratorFuture(params: DescribeChannelModeratorRequest): Future[DescribeChannelModeratorResponse] = service.describeChannelModerator(params).promise().toFuture
    @inline def disassociatePhoneNumberFromUserFuture(params: DisassociatePhoneNumberFromUserRequest): Future[DisassociatePhoneNumberFromUserResponse] = service.disassociatePhoneNumberFromUser(params).promise().toFuture
    @inline def disassociatePhoneNumbersFromVoiceConnectorFuture(params: DisassociatePhoneNumbersFromVoiceConnectorRequest): Future[DisassociatePhoneNumbersFromVoiceConnectorResponse] = service.disassociatePhoneNumbersFromVoiceConnector(params).promise().toFuture
    @inline def disassociatePhoneNumbersFromVoiceConnectorGroupFuture(params: DisassociatePhoneNumbersFromVoiceConnectorGroupRequest): Future[DisassociatePhoneNumbersFromVoiceConnectorGroupResponse] = service.disassociatePhoneNumbersFromVoiceConnectorGroup(params).promise().toFuture
    @inline def disassociateSigninDelegateGroupsFromAccountFuture(params: DisassociateSigninDelegateGroupsFromAccountRequest): Future[DisassociateSigninDelegateGroupsFromAccountResponse] = service.disassociateSigninDelegateGroupsFromAccount(params).promise().toFuture
    @inline def getAccountFuture(params: GetAccountRequest): Future[GetAccountResponse] = service.getAccount(params).promise().toFuture
    @inline def getAccountSettingsFuture(params: GetAccountSettingsRequest): Future[GetAccountSettingsResponse] = service.getAccountSettings(params).promise().toFuture
    @inline def getAppInstanceRetentionSettingsFuture(params: GetAppInstanceRetentionSettingsRequest): Future[GetAppInstanceRetentionSettingsResponse] = service.getAppInstanceRetentionSettings(params).promise().toFuture
    @inline def getAppInstanceStreamingConfigurationsFuture(params: GetAppInstanceStreamingConfigurationsRequest): Future[GetAppInstanceStreamingConfigurationsResponse] = service.getAppInstanceStreamingConfigurations(params).promise().toFuture
    @inline def getAttendeeFuture(params: GetAttendeeRequest): Future[GetAttendeeResponse] = service.getAttendee(params).promise().toFuture
    @inline def getBotFuture(params: GetBotRequest): Future[GetBotResponse] = service.getBot(params).promise().toFuture
    @inline def getChannelMessageFuture(params: GetChannelMessageRequest): Future[GetChannelMessageResponse] = service.getChannelMessage(params).promise().toFuture
    @inline def getEventsConfigurationFuture(params: GetEventsConfigurationRequest): Future[GetEventsConfigurationResponse] = service.getEventsConfiguration(params).promise().toFuture
    @inline def getGlobalSettingsFuture(): Future[GetGlobalSettingsResponse] = service.getGlobalSettings().promise().toFuture
    @inline def getMediaCapturePipelineFuture(params: GetMediaCapturePipelineRequest): Future[GetMediaCapturePipelineResponse] = service.getMediaCapturePipeline(params).promise().toFuture
    @inline def getMeetingFuture(params: GetMeetingRequest): Future[GetMeetingResponse] = service.getMeeting(params).promise().toFuture
    @inline def getMessagingSessionEndpointFuture(params: GetMessagingSessionEndpointRequest): Future[GetMessagingSessionEndpointResponse] = service.getMessagingSessionEndpoint(params).promise().toFuture
    @inline def getPhoneNumberFuture(params: GetPhoneNumberRequest): Future[GetPhoneNumberResponse] = service.getPhoneNumber(params).promise().toFuture
    @inline def getPhoneNumberOrderFuture(params: GetPhoneNumberOrderRequest): Future[GetPhoneNumberOrderResponse] = service.getPhoneNumberOrder(params).promise().toFuture
    @inline def getPhoneNumberSettingsFuture(): Future[GetPhoneNumberSettingsResponse] = service.getPhoneNumberSettings().promise().toFuture
    @inline def getProxySessionFuture(params: GetProxySessionRequest): Future[GetProxySessionResponse] = service.getProxySession(params).promise().toFuture
    @inline def getRetentionSettingsFuture(params: GetRetentionSettingsRequest): Future[GetRetentionSettingsResponse] = service.getRetentionSettings(params).promise().toFuture
    @inline def getRoomFuture(params: GetRoomRequest): Future[GetRoomResponse] = service.getRoom(params).promise().toFuture
    @inline def getSipMediaApplicationFuture(params: GetSipMediaApplicationRequest): Future[GetSipMediaApplicationResponse] = service.getSipMediaApplication(params).promise().toFuture
    @inline def getSipMediaApplicationLoggingConfigurationFuture(params: GetSipMediaApplicationLoggingConfigurationRequest): Future[GetSipMediaApplicationLoggingConfigurationResponse] = service.getSipMediaApplicationLoggingConfiguration(params).promise().toFuture
    @inline def getSipRuleFuture(params: GetSipRuleRequest): Future[GetSipRuleResponse] = service.getSipRule(params).promise().toFuture
    @inline def getUserFuture(params: GetUserRequest): Future[GetUserResponse] = service.getUser(params).promise().toFuture
    @inline def getUserSettingsFuture(params: GetUserSettingsRequest): Future[GetUserSettingsResponse] = service.getUserSettings(params).promise().toFuture
    @inline def getVoiceConnectorEmergencyCallingConfigurationFuture(params: GetVoiceConnectorEmergencyCallingConfigurationRequest): Future[GetVoiceConnectorEmergencyCallingConfigurationResponse] = service.getVoiceConnectorEmergencyCallingConfiguration(params).promise().toFuture
    @inline def getVoiceConnectorFuture(params: GetVoiceConnectorRequest): Future[GetVoiceConnectorResponse] = service.getVoiceConnector(params).promise().toFuture
    @inline def getVoiceConnectorGroupFuture(params: GetVoiceConnectorGroupRequest): Future[GetVoiceConnectorGroupResponse] = service.getVoiceConnectorGroup(params).promise().toFuture
    @inline def getVoiceConnectorLoggingConfigurationFuture(params: GetVoiceConnectorLoggingConfigurationRequest): Future[GetVoiceConnectorLoggingConfigurationResponse] = service.getVoiceConnectorLoggingConfiguration(params).promise().toFuture
    @inline def getVoiceConnectorOriginationFuture(params: GetVoiceConnectorOriginationRequest): Future[GetVoiceConnectorOriginationResponse] = service.getVoiceConnectorOrigination(params).promise().toFuture
    @inline def getVoiceConnectorProxyFuture(params: GetVoiceConnectorProxyRequest): Future[GetVoiceConnectorProxyResponse] = service.getVoiceConnectorProxy(params).promise().toFuture
    @inline def getVoiceConnectorStreamingConfigurationFuture(params: GetVoiceConnectorStreamingConfigurationRequest): Future[GetVoiceConnectorStreamingConfigurationResponse] = service.getVoiceConnectorStreamingConfiguration(params).promise().toFuture
    @inline def getVoiceConnectorTerminationFuture(params: GetVoiceConnectorTerminationRequest): Future[GetVoiceConnectorTerminationResponse] = service.getVoiceConnectorTermination(params).promise().toFuture
    @inline def getVoiceConnectorTerminationHealthFuture(params: GetVoiceConnectorTerminationHealthRequest): Future[GetVoiceConnectorTerminationHealthResponse] = service.getVoiceConnectorTerminationHealth(params).promise().toFuture
    @inline def inviteUsersFuture(params: InviteUsersRequest): Future[InviteUsersResponse] = service.inviteUsers(params).promise().toFuture
    @inline def listAccountsFuture(params: ListAccountsRequest): Future[ListAccountsResponse] = service.listAccounts(params).promise().toFuture
    @inline def listAppInstanceAdminsFuture(params: ListAppInstanceAdminsRequest): Future[ListAppInstanceAdminsResponse] = service.listAppInstanceAdmins(params).promise().toFuture
    @inline def listAppInstanceUsersFuture(params: ListAppInstanceUsersRequest): Future[ListAppInstanceUsersResponse] = service.listAppInstanceUsers(params).promise().toFuture
    @inline def listAppInstancesFuture(params: ListAppInstancesRequest): Future[ListAppInstancesResponse] = service.listAppInstances(params).promise().toFuture
    @inline def listAttendeeTagsFuture(params: ListAttendeeTagsRequest): Future[ListAttendeeTagsResponse] = service.listAttendeeTags(params).promise().toFuture
    @inline def listAttendeesFuture(params: ListAttendeesRequest): Future[ListAttendeesResponse] = service.listAttendees(params).promise().toFuture
    @inline def listBotsFuture(params: ListBotsRequest): Future[ListBotsResponse] = service.listBots(params).promise().toFuture
    @inline def listChannelBansFuture(params: ListChannelBansRequest): Future[ListChannelBansResponse] = service.listChannelBans(params).promise().toFuture
    @inline def listChannelMembershipsForAppInstanceUserFuture(params: ListChannelMembershipsForAppInstanceUserRequest): Future[ListChannelMembershipsForAppInstanceUserResponse] = service.listChannelMembershipsForAppInstanceUser(params).promise().toFuture
    @inline def listChannelMembershipsFuture(params: ListChannelMembershipsRequest): Future[ListChannelMembershipsResponse] = service.listChannelMemberships(params).promise().toFuture
    @inline def listChannelMessagesFuture(params: ListChannelMessagesRequest): Future[ListChannelMessagesResponse] = service.listChannelMessages(params).promise().toFuture
    @inline def listChannelModeratorsFuture(params: ListChannelModeratorsRequest): Future[ListChannelModeratorsResponse] = service.listChannelModerators(params).promise().toFuture
    @inline def listChannelsFuture(params: ListChannelsRequest): Future[ListChannelsResponse] = service.listChannels(params).promise().toFuture
    @inline def listChannelsModeratedByAppInstanceUserFuture(params: ListChannelsModeratedByAppInstanceUserRequest): Future[ListChannelsModeratedByAppInstanceUserResponse] = service.listChannelsModeratedByAppInstanceUser(params).promise().toFuture
    @inline def listMediaCapturePipelinesFuture(params: ListMediaCapturePipelinesRequest): Future[ListMediaCapturePipelinesResponse] = service.listMediaCapturePipelines(params).promise().toFuture
    @inline def listMeetingTagsFuture(params: ListMeetingTagsRequest): Future[ListMeetingTagsResponse] = service.listMeetingTags(params).promise().toFuture
    @inline def listMeetingsFuture(params: ListMeetingsRequest): Future[ListMeetingsResponse] = service.listMeetings(params).promise().toFuture
    @inline def listPhoneNumberOrdersFuture(params: ListPhoneNumberOrdersRequest): Future[ListPhoneNumberOrdersResponse] = service.listPhoneNumberOrders(params).promise().toFuture
    @inline def listPhoneNumbersFuture(params: ListPhoneNumbersRequest): Future[ListPhoneNumbersResponse] = service.listPhoneNumbers(params).promise().toFuture
    @inline def listProxySessionsFuture(params: ListProxySessionsRequest): Future[ListProxySessionsResponse] = service.listProxySessions(params).promise().toFuture
    @inline def listRoomMembershipsFuture(params: ListRoomMembershipsRequest): Future[ListRoomMembershipsResponse] = service.listRoomMemberships(params).promise().toFuture
    @inline def listRoomsFuture(params: ListRoomsRequest): Future[ListRoomsResponse] = service.listRooms(params).promise().toFuture
    @inline def listSipMediaApplicationsFuture(params: ListSipMediaApplicationsRequest): Future[ListSipMediaApplicationsResponse] = service.listSipMediaApplications(params).promise().toFuture
    @inline def listSipRulesFuture(params: ListSipRulesRequest): Future[ListSipRulesResponse] = service.listSipRules(params).promise().toFuture
    @inline def listSupportedPhoneNumberCountriesFuture(params: ListSupportedPhoneNumberCountriesRequest): Future[ListSupportedPhoneNumberCountriesResponse] = service.listSupportedPhoneNumberCountries(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] = service.listUsers(params).promise().toFuture
    @inline def listVoiceConnectorGroupsFuture(params: ListVoiceConnectorGroupsRequest): Future[ListVoiceConnectorGroupsResponse] = service.listVoiceConnectorGroups(params).promise().toFuture
    @inline def listVoiceConnectorTerminationCredentialsFuture(params: ListVoiceConnectorTerminationCredentialsRequest): Future[ListVoiceConnectorTerminationCredentialsResponse] = service.listVoiceConnectorTerminationCredentials(params).promise().toFuture
    @inline def listVoiceConnectorsFuture(params: ListVoiceConnectorsRequest): Future[ListVoiceConnectorsResponse] = service.listVoiceConnectors(params).promise().toFuture
    @inline def logoutUserFuture(params: LogoutUserRequest): Future[LogoutUserResponse] = service.logoutUser(params).promise().toFuture
    @inline def putAppInstanceRetentionSettingsFuture(params: PutAppInstanceRetentionSettingsRequest): Future[PutAppInstanceRetentionSettingsResponse] = service.putAppInstanceRetentionSettings(params).promise().toFuture
    @inline def putAppInstanceStreamingConfigurationsFuture(params: PutAppInstanceStreamingConfigurationsRequest): Future[PutAppInstanceStreamingConfigurationsResponse] = service.putAppInstanceStreamingConfigurations(params).promise().toFuture
    @inline def putEventsConfigurationFuture(params: PutEventsConfigurationRequest): Future[PutEventsConfigurationResponse] = service.putEventsConfiguration(params).promise().toFuture
    @inline def putRetentionSettingsFuture(params: PutRetentionSettingsRequest): Future[PutRetentionSettingsResponse] = service.putRetentionSettings(params).promise().toFuture
    @inline def putSipMediaApplicationLoggingConfigurationFuture(params: PutSipMediaApplicationLoggingConfigurationRequest): Future[PutSipMediaApplicationLoggingConfigurationResponse] = service.putSipMediaApplicationLoggingConfiguration(params).promise().toFuture
    @inline def putVoiceConnectorEmergencyCallingConfigurationFuture(params: PutVoiceConnectorEmergencyCallingConfigurationRequest): Future[PutVoiceConnectorEmergencyCallingConfigurationResponse] = service.putVoiceConnectorEmergencyCallingConfiguration(params).promise().toFuture
    @inline def putVoiceConnectorLoggingConfigurationFuture(params: PutVoiceConnectorLoggingConfigurationRequest): Future[PutVoiceConnectorLoggingConfigurationResponse] = service.putVoiceConnectorLoggingConfiguration(params).promise().toFuture
    @inline def putVoiceConnectorOriginationFuture(params: PutVoiceConnectorOriginationRequest): Future[PutVoiceConnectorOriginationResponse] = service.putVoiceConnectorOrigination(params).promise().toFuture
    @inline def putVoiceConnectorProxyFuture(params: PutVoiceConnectorProxyRequest): Future[PutVoiceConnectorProxyResponse] = service.putVoiceConnectorProxy(params).promise().toFuture
    @inline def putVoiceConnectorStreamingConfigurationFuture(params: PutVoiceConnectorStreamingConfigurationRequest): Future[PutVoiceConnectorStreamingConfigurationResponse] = service.putVoiceConnectorStreamingConfiguration(params).promise().toFuture
    @inline def putVoiceConnectorTerminationCredentialsFuture(params: PutVoiceConnectorTerminationCredentialsRequest): Future[js.Object] = service.putVoiceConnectorTerminationCredentials(params).promise().toFuture
    @inline def putVoiceConnectorTerminationFuture(params: PutVoiceConnectorTerminationRequest): Future[PutVoiceConnectorTerminationResponse] = service.putVoiceConnectorTermination(params).promise().toFuture
    @inline def redactChannelMessageFuture(params: RedactChannelMessageRequest): Future[RedactChannelMessageResponse] = service.redactChannelMessage(params).promise().toFuture
    @inline def redactConversationMessageFuture(params: RedactConversationMessageRequest): Future[RedactConversationMessageResponse] = service.redactConversationMessage(params).promise().toFuture
    @inline def redactRoomMessageFuture(params: RedactRoomMessageRequest): Future[RedactRoomMessageResponse] = service.redactRoomMessage(params).promise().toFuture
    @inline def regenerateSecurityTokenFuture(params: RegenerateSecurityTokenRequest): Future[RegenerateSecurityTokenResponse] = service.regenerateSecurityToken(params).promise().toFuture
    @inline def resetPersonalPINFuture(params: ResetPersonalPINRequest): Future[ResetPersonalPINResponse] = service.resetPersonalPIN(params).promise().toFuture
    @inline def restorePhoneNumberFuture(params: RestorePhoneNumberRequest): Future[RestorePhoneNumberResponse] = service.restorePhoneNumber(params).promise().toFuture
    @inline def searchAvailablePhoneNumbersFuture(params: SearchAvailablePhoneNumbersRequest): Future[SearchAvailablePhoneNumbersResponse] = service.searchAvailablePhoneNumbers(params).promise().toFuture
    @inline def sendChannelMessageFuture(params: SendChannelMessageRequest): Future[SendChannelMessageResponse] = service.sendChannelMessage(params).promise().toFuture
    @inline def startMeetingTranscriptionFuture(params: StartMeetingTranscriptionRequest): Future[StartMeetingTranscriptionResponse] = service.startMeetingTranscription(params).promise().toFuture
    @inline def stopMeetingTranscriptionFuture(params: StopMeetingTranscriptionRequest): Future[StopMeetingTranscriptionResponse] = service.stopMeetingTranscription(params).promise().toFuture
    @inline def tagAttendeeFuture(params: TagAttendeeRequest): Future[js.Object] = service.tagAttendee(params).promise().toFuture
    @inline def tagMeetingFuture(params: TagMeetingRequest): Future[js.Object] = service.tagMeeting(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagAttendeeFuture(params: UntagAttendeeRequest): Future[js.Object] = service.untagAttendee(params).promise().toFuture
    @inline def untagMeetingFuture(params: UntagMeetingRequest): Future[js.Object] = service.untagMeeting(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateAccountFuture(params: UpdateAccountRequest): Future[UpdateAccountResponse] = service.updateAccount(params).promise().toFuture
    @inline def updateAccountSettingsFuture(params: UpdateAccountSettingsRequest): Future[UpdateAccountSettingsResponse] = service.updateAccountSettings(params).promise().toFuture
    @inline def updateAppInstanceFuture(params: UpdateAppInstanceRequest): Future[UpdateAppInstanceResponse] = service.updateAppInstance(params).promise().toFuture
    @inline def updateAppInstanceUserFuture(params: UpdateAppInstanceUserRequest): Future[UpdateAppInstanceUserResponse] = service.updateAppInstanceUser(params).promise().toFuture
    @inline def updateBotFuture(params: UpdateBotRequest): Future[UpdateBotResponse] = service.updateBot(params).promise().toFuture
    @inline def updateChannelFuture(params: UpdateChannelRequest): Future[UpdateChannelResponse] = service.updateChannel(params).promise().toFuture
    @inline def updateChannelMessageFuture(params: UpdateChannelMessageRequest): Future[UpdateChannelMessageResponse] = service.updateChannelMessage(params).promise().toFuture
    @inline def updateChannelReadMarkerFuture(params: UpdateChannelReadMarkerRequest): Future[UpdateChannelReadMarkerResponse] = service.updateChannelReadMarker(params).promise().toFuture
    @inline def updateGlobalSettingsFuture(params: UpdateGlobalSettingsRequest): Future[js.Object] = service.updateGlobalSettings(params).promise().toFuture
    @inline def updatePhoneNumberFuture(params: UpdatePhoneNumberRequest): Future[UpdatePhoneNumberResponse] = service.updatePhoneNumber(params).promise().toFuture
    @inline def updatePhoneNumberSettingsFuture(params: UpdatePhoneNumberSettingsRequest): Future[js.Object] = service.updatePhoneNumberSettings(params).promise().toFuture
    @inline def updateProxySessionFuture(params: UpdateProxySessionRequest): Future[UpdateProxySessionResponse] = service.updateProxySession(params).promise().toFuture
    @inline def updateRoomFuture(params: UpdateRoomRequest): Future[UpdateRoomResponse] = service.updateRoom(params).promise().toFuture
    @inline def updateRoomMembershipFuture(params: UpdateRoomMembershipRequest): Future[UpdateRoomMembershipResponse] = service.updateRoomMembership(params).promise().toFuture
    @inline def updateSipMediaApplicationCallFuture(params: UpdateSipMediaApplicationCallRequest): Future[UpdateSipMediaApplicationCallResponse] = service.updateSipMediaApplicationCall(params).promise().toFuture
    @inline def updateSipMediaApplicationFuture(params: UpdateSipMediaApplicationRequest): Future[UpdateSipMediaApplicationResponse] = service.updateSipMediaApplication(params).promise().toFuture
    @inline def updateSipRuleFuture(params: UpdateSipRuleRequest): Future[UpdateSipRuleResponse] = service.updateSipRule(params).promise().toFuture
    @inline def updateUserFuture(params: UpdateUserRequest): Future[UpdateUserResponse] = service.updateUser(params).promise().toFuture
    @inline def updateUserSettingsFuture(params: UpdateUserSettingsRequest): Future[js.Object] = service.updateUserSettings(params).promise().toFuture
    @inline def updateVoiceConnectorFuture(params: UpdateVoiceConnectorRequest): Future[UpdateVoiceConnectorResponse] = service.updateVoiceConnector(params).promise().toFuture
    @inline def updateVoiceConnectorGroupFuture(params: UpdateVoiceConnectorGroupRequest): Future[UpdateVoiceConnectorGroupResponse] = service.updateVoiceConnectorGroup(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/chime", JSImport.Namespace, "AWS.Chime")
  class Chime() extends js.Object {
    def this(config: AWSConfig) = this()

    def associatePhoneNumberWithUser(params: AssociatePhoneNumberWithUserRequest): Request[AssociatePhoneNumberWithUserResponse] = js.native
    def associatePhoneNumbersWithVoiceConnector(params: AssociatePhoneNumbersWithVoiceConnectorRequest): Request[AssociatePhoneNumbersWithVoiceConnectorResponse] = js.native
    def associatePhoneNumbersWithVoiceConnectorGroup(params: AssociatePhoneNumbersWithVoiceConnectorGroupRequest): Request[AssociatePhoneNumbersWithVoiceConnectorGroupResponse] = js.native
    def associateSigninDelegateGroupsWithAccount(params: AssociateSigninDelegateGroupsWithAccountRequest): Request[AssociateSigninDelegateGroupsWithAccountResponse] = js.native
    def batchCreateAttendee(params: BatchCreateAttendeeRequest): Request[BatchCreateAttendeeResponse] = js.native
    def batchCreateChannelMembership(params: BatchCreateChannelMembershipRequest): Request[BatchCreateChannelMembershipResponse] = js.native
    def batchCreateRoomMembership(params: BatchCreateRoomMembershipRequest): Request[BatchCreateRoomMembershipResponse] = js.native
    def batchDeletePhoneNumber(params: BatchDeletePhoneNumberRequest): Request[BatchDeletePhoneNumberResponse] = js.native
    def batchSuspendUser(params: BatchSuspendUserRequest): Request[BatchSuspendUserResponse] = js.native
    def batchUnsuspendUser(params: BatchUnsuspendUserRequest): Request[BatchUnsuspendUserResponse] = js.native
    def batchUpdatePhoneNumber(params: BatchUpdatePhoneNumberRequest): Request[BatchUpdatePhoneNumberResponse] = js.native
    def batchUpdateUser(params: BatchUpdateUserRequest): Request[BatchUpdateUserResponse] = js.native
    def createAccount(params: CreateAccountRequest): Request[CreateAccountResponse] = js.native
    def createAppInstance(params: CreateAppInstanceRequest): Request[CreateAppInstanceResponse] = js.native
    def createAppInstanceAdmin(params: CreateAppInstanceAdminRequest): Request[CreateAppInstanceAdminResponse] = js.native
    def createAppInstanceUser(params: CreateAppInstanceUserRequest): Request[CreateAppInstanceUserResponse] = js.native
    def createAttendee(params: CreateAttendeeRequest): Request[CreateAttendeeResponse] = js.native
    def createBot(params: CreateBotRequest): Request[CreateBotResponse] = js.native
    def createChannel(params: CreateChannelRequest): Request[CreateChannelResponse] = js.native
    def createChannelBan(params: CreateChannelBanRequest): Request[CreateChannelBanResponse] = js.native
    def createChannelMembership(params: CreateChannelMembershipRequest): Request[CreateChannelMembershipResponse] = js.native
    def createChannelModerator(params: CreateChannelModeratorRequest): Request[CreateChannelModeratorResponse] = js.native
    def createMediaCapturePipeline(params: CreateMediaCapturePipelineRequest): Request[CreateMediaCapturePipelineResponse] = js.native
    def createMeeting(params: CreateMeetingRequest): Request[CreateMeetingResponse] = js.native
    def createMeetingDialOut(params: CreateMeetingDialOutRequest): Request[CreateMeetingDialOutResponse] = js.native
    def createMeetingWithAttendees(params: CreateMeetingWithAttendeesRequest): Request[CreateMeetingWithAttendeesResponse] = js.native
    def createPhoneNumberOrder(params: CreatePhoneNumberOrderRequest): Request[CreatePhoneNumberOrderResponse] = js.native
    def createProxySession(params: CreateProxySessionRequest): Request[CreateProxySessionResponse] = js.native
    def createRoom(params: CreateRoomRequest): Request[CreateRoomResponse] = js.native
    def createRoomMembership(params: CreateRoomMembershipRequest): Request[CreateRoomMembershipResponse] = js.native
    def createSipMediaApplication(params: CreateSipMediaApplicationRequest): Request[CreateSipMediaApplicationResponse] = js.native
    def createSipMediaApplicationCall(params: CreateSipMediaApplicationCallRequest): Request[CreateSipMediaApplicationCallResponse] = js.native
    def createSipRule(params: CreateSipRuleRequest): Request[CreateSipRuleResponse] = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse] = js.native
    def createVoiceConnector(params: CreateVoiceConnectorRequest): Request[CreateVoiceConnectorResponse] = js.native
    def createVoiceConnectorGroup(params: CreateVoiceConnectorGroupRequest): Request[CreateVoiceConnectorGroupResponse] = js.native
    def deleteAccount(params: DeleteAccountRequest): Request[DeleteAccountResponse] = js.native
    def deleteAppInstance(params: DeleteAppInstanceRequest): Request[js.Object] = js.native
    def deleteAppInstanceAdmin(params: DeleteAppInstanceAdminRequest): Request[js.Object] = js.native
    def deleteAppInstanceStreamingConfigurations(params: DeleteAppInstanceStreamingConfigurationsRequest): Request[js.Object] = js.native
    def deleteAppInstanceUser(params: DeleteAppInstanceUserRequest): Request[js.Object] = js.native
    def deleteAttendee(params: DeleteAttendeeRequest): Request[js.Object] = js.native
    def deleteChannel(params: DeleteChannelRequest): Request[js.Object] = js.native
    def deleteChannelBan(params: DeleteChannelBanRequest): Request[js.Object] = js.native
    def deleteChannelMembership(params: DeleteChannelMembershipRequest): Request[js.Object] = js.native
    def deleteChannelMessage(params: DeleteChannelMessageRequest): Request[js.Object] = js.native
    def deleteChannelModerator(params: DeleteChannelModeratorRequest): Request[js.Object] = js.native
    def deleteEventsConfiguration(params: DeleteEventsConfigurationRequest): Request[js.Object] = js.native
    def deleteMediaCapturePipeline(params: DeleteMediaCapturePipelineRequest): Request[js.Object] = js.native
    def deleteMeeting(params: DeleteMeetingRequest): Request[js.Object] = js.native
    def deletePhoneNumber(params: DeletePhoneNumberRequest): Request[js.Object] = js.native
    def deleteProxySession(params: DeleteProxySessionRequest): Request[js.Object] = js.native
    def deleteRoom(params: DeleteRoomRequest): Request[js.Object] = js.native
    def deleteRoomMembership(params: DeleteRoomMembershipRequest): Request[js.Object] = js.native
    def deleteSipMediaApplication(params: DeleteSipMediaApplicationRequest): Request[js.Object] = js.native
    def deleteSipRule(params: DeleteSipRuleRequest): Request[js.Object] = js.native
    def deleteVoiceConnector(params: DeleteVoiceConnectorRequest): Request[js.Object] = js.native
    def deleteVoiceConnectorEmergencyCallingConfiguration(params: DeleteVoiceConnectorEmergencyCallingConfigurationRequest): Request[js.Object] = js.native
    def deleteVoiceConnectorGroup(params: DeleteVoiceConnectorGroupRequest): Request[js.Object] = js.native
    def deleteVoiceConnectorOrigination(params: DeleteVoiceConnectorOriginationRequest): Request[js.Object] = js.native
    def deleteVoiceConnectorProxy(params: DeleteVoiceConnectorProxyRequest): Request[js.Object] = js.native
    def deleteVoiceConnectorStreamingConfiguration(params: DeleteVoiceConnectorStreamingConfigurationRequest): Request[js.Object] = js.native
    def deleteVoiceConnectorTermination(params: DeleteVoiceConnectorTerminationRequest): Request[js.Object] = js.native
    def deleteVoiceConnectorTerminationCredentials(params: DeleteVoiceConnectorTerminationCredentialsRequest): Request[js.Object] = js.native
    def describeAppInstance(params: DescribeAppInstanceRequest): Request[DescribeAppInstanceResponse] = js.native
    def describeAppInstanceAdmin(params: DescribeAppInstanceAdminRequest): Request[DescribeAppInstanceAdminResponse] = js.native
    def describeAppInstanceUser(params: DescribeAppInstanceUserRequest): Request[DescribeAppInstanceUserResponse] = js.native
    def describeChannel(params: DescribeChannelRequest): Request[DescribeChannelResponse] = js.native
    def describeChannelBan(params: DescribeChannelBanRequest): Request[DescribeChannelBanResponse] = js.native
    def describeChannelMembership(params: DescribeChannelMembershipRequest): Request[DescribeChannelMembershipResponse] = js.native
    def describeChannelMembershipForAppInstanceUser(params: DescribeChannelMembershipForAppInstanceUserRequest): Request[DescribeChannelMembershipForAppInstanceUserResponse] = js.native
    def describeChannelModeratedByAppInstanceUser(params: DescribeChannelModeratedByAppInstanceUserRequest): Request[DescribeChannelModeratedByAppInstanceUserResponse] = js.native
    def describeChannelModerator(params: DescribeChannelModeratorRequest): Request[DescribeChannelModeratorResponse] = js.native
    def disassociatePhoneNumberFromUser(params: DisassociatePhoneNumberFromUserRequest): Request[DisassociatePhoneNumberFromUserResponse] = js.native
    def disassociatePhoneNumbersFromVoiceConnector(params: DisassociatePhoneNumbersFromVoiceConnectorRequest): Request[DisassociatePhoneNumbersFromVoiceConnectorResponse] = js.native
    def disassociatePhoneNumbersFromVoiceConnectorGroup(params: DisassociatePhoneNumbersFromVoiceConnectorGroupRequest): Request[DisassociatePhoneNumbersFromVoiceConnectorGroupResponse] = js.native
    def disassociateSigninDelegateGroupsFromAccount(params: DisassociateSigninDelegateGroupsFromAccountRequest): Request[DisassociateSigninDelegateGroupsFromAccountResponse] = js.native
    def getAccount(params: GetAccountRequest): Request[GetAccountResponse] = js.native
    def getAccountSettings(params: GetAccountSettingsRequest): Request[GetAccountSettingsResponse] = js.native
    def getAppInstanceRetentionSettings(params: GetAppInstanceRetentionSettingsRequest): Request[GetAppInstanceRetentionSettingsResponse] = js.native
    def getAppInstanceStreamingConfigurations(params: GetAppInstanceStreamingConfigurationsRequest): Request[GetAppInstanceStreamingConfigurationsResponse] = js.native
    def getAttendee(params: GetAttendeeRequest): Request[GetAttendeeResponse] = js.native
    def getBot(params: GetBotRequest): Request[GetBotResponse] = js.native
    def getChannelMessage(params: GetChannelMessageRequest): Request[GetChannelMessageResponse] = js.native
    def getEventsConfiguration(params: GetEventsConfigurationRequest): Request[GetEventsConfigurationResponse] = js.native
    def getGlobalSettings(): Request[GetGlobalSettingsResponse] = js.native
    def getMediaCapturePipeline(params: GetMediaCapturePipelineRequest): Request[GetMediaCapturePipelineResponse] = js.native
    def getMeeting(params: GetMeetingRequest): Request[GetMeetingResponse] = js.native
    def getMessagingSessionEndpoint(params: GetMessagingSessionEndpointRequest): Request[GetMessagingSessionEndpointResponse] = js.native
    def getPhoneNumber(params: GetPhoneNumberRequest): Request[GetPhoneNumberResponse] = js.native
    def getPhoneNumberOrder(params: GetPhoneNumberOrderRequest): Request[GetPhoneNumberOrderResponse] = js.native
    def getPhoneNumberSettings(): Request[GetPhoneNumberSettingsResponse] = js.native
    def getProxySession(params: GetProxySessionRequest): Request[GetProxySessionResponse] = js.native
    def getRetentionSettings(params: GetRetentionSettingsRequest): Request[GetRetentionSettingsResponse] = js.native
    def getRoom(params: GetRoomRequest): Request[GetRoomResponse] = js.native
    def getSipMediaApplication(params: GetSipMediaApplicationRequest): Request[GetSipMediaApplicationResponse] = js.native
    def getSipMediaApplicationLoggingConfiguration(params: GetSipMediaApplicationLoggingConfigurationRequest): Request[GetSipMediaApplicationLoggingConfigurationResponse] = js.native
    def getSipRule(params: GetSipRuleRequest): Request[GetSipRuleResponse] = js.native
    def getUser(params: GetUserRequest): Request[GetUserResponse] = js.native
    def getUserSettings(params: GetUserSettingsRequest): Request[GetUserSettingsResponse] = js.native
    def getVoiceConnector(params: GetVoiceConnectorRequest): Request[GetVoiceConnectorResponse] = js.native
    def getVoiceConnectorEmergencyCallingConfiguration(params: GetVoiceConnectorEmergencyCallingConfigurationRequest): Request[GetVoiceConnectorEmergencyCallingConfigurationResponse] = js.native
    def getVoiceConnectorGroup(params: GetVoiceConnectorGroupRequest): Request[GetVoiceConnectorGroupResponse] = js.native
    def getVoiceConnectorLoggingConfiguration(params: GetVoiceConnectorLoggingConfigurationRequest): Request[GetVoiceConnectorLoggingConfigurationResponse] = js.native
    def getVoiceConnectorOrigination(params: GetVoiceConnectorOriginationRequest): Request[GetVoiceConnectorOriginationResponse] = js.native
    def getVoiceConnectorProxy(params: GetVoiceConnectorProxyRequest): Request[GetVoiceConnectorProxyResponse] = js.native
    def getVoiceConnectorStreamingConfiguration(params: GetVoiceConnectorStreamingConfigurationRequest): Request[GetVoiceConnectorStreamingConfigurationResponse] = js.native
    def getVoiceConnectorTermination(params: GetVoiceConnectorTerminationRequest): Request[GetVoiceConnectorTerminationResponse] = js.native
    def getVoiceConnectorTerminationHealth(params: GetVoiceConnectorTerminationHealthRequest): Request[GetVoiceConnectorTerminationHealthResponse] = js.native
    def inviteUsers(params: InviteUsersRequest): Request[InviteUsersResponse] = js.native
    def listAccounts(params: ListAccountsRequest): Request[ListAccountsResponse] = js.native
    def listAppInstanceAdmins(params: ListAppInstanceAdminsRequest): Request[ListAppInstanceAdminsResponse] = js.native
    def listAppInstanceUsers(params: ListAppInstanceUsersRequest): Request[ListAppInstanceUsersResponse] = js.native
    def listAppInstances(params: ListAppInstancesRequest): Request[ListAppInstancesResponse] = js.native
    def listAttendeeTags(params: ListAttendeeTagsRequest): Request[ListAttendeeTagsResponse] = js.native
    def listAttendees(params: ListAttendeesRequest): Request[ListAttendeesResponse] = js.native
    def listBots(params: ListBotsRequest): Request[ListBotsResponse] = js.native
    def listChannelBans(params: ListChannelBansRequest): Request[ListChannelBansResponse] = js.native
    def listChannelMemberships(params: ListChannelMembershipsRequest): Request[ListChannelMembershipsResponse] = js.native
    def listChannelMembershipsForAppInstanceUser(params: ListChannelMembershipsForAppInstanceUserRequest): Request[ListChannelMembershipsForAppInstanceUserResponse] = js.native
    def listChannelMessages(params: ListChannelMessagesRequest): Request[ListChannelMessagesResponse] = js.native
    def listChannelModerators(params: ListChannelModeratorsRequest): Request[ListChannelModeratorsResponse] = js.native
    def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse] = js.native
    def listChannelsModeratedByAppInstanceUser(params: ListChannelsModeratedByAppInstanceUserRequest): Request[ListChannelsModeratedByAppInstanceUserResponse] = js.native
    def listMediaCapturePipelines(params: ListMediaCapturePipelinesRequest): Request[ListMediaCapturePipelinesResponse] = js.native
    def listMeetingTags(params: ListMeetingTagsRequest): Request[ListMeetingTagsResponse] = js.native
    def listMeetings(params: ListMeetingsRequest): Request[ListMeetingsResponse] = js.native
    def listPhoneNumberOrders(params: ListPhoneNumberOrdersRequest): Request[ListPhoneNumberOrdersResponse] = js.native
    def listPhoneNumbers(params: ListPhoneNumbersRequest): Request[ListPhoneNumbersResponse] = js.native
    def listProxySessions(params: ListProxySessionsRequest): Request[ListProxySessionsResponse] = js.native
    def listRoomMemberships(params: ListRoomMembershipsRequest): Request[ListRoomMembershipsResponse] = js.native
    def listRooms(params: ListRoomsRequest): Request[ListRoomsResponse] = js.native
    def listSipMediaApplications(params: ListSipMediaApplicationsRequest): Request[ListSipMediaApplicationsResponse] = js.native
    def listSipRules(params: ListSipRulesRequest): Request[ListSipRulesResponse] = js.native
    def listSupportedPhoneNumberCountries(params: ListSupportedPhoneNumberCountriesRequest): Request[ListSupportedPhoneNumberCountriesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse] = js.native
    def listVoiceConnectorGroups(params: ListVoiceConnectorGroupsRequest): Request[ListVoiceConnectorGroupsResponse] = js.native
    def listVoiceConnectorTerminationCredentials(params: ListVoiceConnectorTerminationCredentialsRequest): Request[ListVoiceConnectorTerminationCredentialsResponse] = js.native
    def listVoiceConnectors(params: ListVoiceConnectorsRequest): Request[ListVoiceConnectorsResponse] = js.native
    def logoutUser(params: LogoutUserRequest): Request[LogoutUserResponse] = js.native
    def putAppInstanceRetentionSettings(params: PutAppInstanceRetentionSettingsRequest): Request[PutAppInstanceRetentionSettingsResponse] = js.native
    def putAppInstanceStreamingConfigurations(params: PutAppInstanceStreamingConfigurationsRequest): Request[PutAppInstanceStreamingConfigurationsResponse] = js.native
    def putEventsConfiguration(params: PutEventsConfigurationRequest): Request[PutEventsConfigurationResponse] = js.native
    def putRetentionSettings(params: PutRetentionSettingsRequest): Request[PutRetentionSettingsResponse] = js.native
    def putSipMediaApplicationLoggingConfiguration(params: PutSipMediaApplicationLoggingConfigurationRequest): Request[PutSipMediaApplicationLoggingConfigurationResponse] = js.native
    def putVoiceConnectorEmergencyCallingConfiguration(params: PutVoiceConnectorEmergencyCallingConfigurationRequest): Request[PutVoiceConnectorEmergencyCallingConfigurationResponse] = js.native
    def putVoiceConnectorLoggingConfiguration(params: PutVoiceConnectorLoggingConfigurationRequest): Request[PutVoiceConnectorLoggingConfigurationResponse] = js.native
    def putVoiceConnectorOrigination(params: PutVoiceConnectorOriginationRequest): Request[PutVoiceConnectorOriginationResponse] = js.native
    def putVoiceConnectorProxy(params: PutVoiceConnectorProxyRequest): Request[PutVoiceConnectorProxyResponse] = js.native
    def putVoiceConnectorStreamingConfiguration(params: PutVoiceConnectorStreamingConfigurationRequest): Request[PutVoiceConnectorStreamingConfigurationResponse] = js.native
    def putVoiceConnectorTermination(params: PutVoiceConnectorTerminationRequest): Request[PutVoiceConnectorTerminationResponse] = js.native
    def putVoiceConnectorTerminationCredentials(params: PutVoiceConnectorTerminationCredentialsRequest): Request[js.Object] = js.native
    def redactChannelMessage(params: RedactChannelMessageRequest): Request[RedactChannelMessageResponse] = js.native
    def redactConversationMessage(params: RedactConversationMessageRequest): Request[RedactConversationMessageResponse] = js.native
    def redactRoomMessage(params: RedactRoomMessageRequest): Request[RedactRoomMessageResponse] = js.native
    def regenerateSecurityToken(params: RegenerateSecurityTokenRequest): Request[RegenerateSecurityTokenResponse] = js.native
    def resetPersonalPIN(params: ResetPersonalPINRequest): Request[ResetPersonalPINResponse] = js.native
    def restorePhoneNumber(params: RestorePhoneNumberRequest): Request[RestorePhoneNumberResponse] = js.native
    def searchAvailablePhoneNumbers(params: SearchAvailablePhoneNumbersRequest): Request[SearchAvailablePhoneNumbersResponse] = js.native
    def sendChannelMessage(params: SendChannelMessageRequest): Request[SendChannelMessageResponse] = js.native
    def startMeetingTranscription(params: StartMeetingTranscriptionRequest): Request[StartMeetingTranscriptionResponse] = js.native
    def stopMeetingTranscription(params: StopMeetingTranscriptionRequest): Request[StopMeetingTranscriptionResponse] = js.native
    def tagAttendee(params: TagAttendeeRequest): Request[js.Object] = js.native
    def tagMeeting(params: TagMeetingRequest): Request[js.Object] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagAttendee(params: UntagAttendeeRequest): Request[js.Object] = js.native
    def untagMeeting(params: UntagMeetingRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateAccount(params: UpdateAccountRequest): Request[UpdateAccountResponse] = js.native
    def updateAccountSettings(params: UpdateAccountSettingsRequest): Request[UpdateAccountSettingsResponse] = js.native
    def updateAppInstance(params: UpdateAppInstanceRequest): Request[UpdateAppInstanceResponse] = js.native
    def updateAppInstanceUser(params: UpdateAppInstanceUserRequest): Request[UpdateAppInstanceUserResponse] = js.native
    def updateBot(params: UpdateBotRequest): Request[UpdateBotResponse] = js.native
    def updateChannel(params: UpdateChannelRequest): Request[UpdateChannelResponse] = js.native
    def updateChannelMessage(params: UpdateChannelMessageRequest): Request[UpdateChannelMessageResponse] = js.native
    def updateChannelReadMarker(params: UpdateChannelReadMarkerRequest): Request[UpdateChannelReadMarkerResponse] = js.native
    def updateGlobalSettings(params: UpdateGlobalSettingsRequest): Request[js.Object] = js.native
    def updatePhoneNumber(params: UpdatePhoneNumberRequest): Request[UpdatePhoneNumberResponse] = js.native
    def updatePhoneNumberSettings(params: UpdatePhoneNumberSettingsRequest): Request[js.Object] = js.native
    def updateProxySession(params: UpdateProxySessionRequest): Request[UpdateProxySessionResponse] = js.native
    def updateRoom(params: UpdateRoomRequest): Request[UpdateRoomResponse] = js.native
    def updateRoomMembership(params: UpdateRoomMembershipRequest): Request[UpdateRoomMembershipResponse] = js.native
    def updateSipMediaApplication(params: UpdateSipMediaApplicationRequest): Request[UpdateSipMediaApplicationResponse] = js.native
    def updateSipMediaApplicationCall(params: UpdateSipMediaApplicationCallRequest): Request[UpdateSipMediaApplicationCallResponse] = js.native
    def updateSipRule(params: UpdateSipRuleRequest): Request[UpdateSipRuleResponse] = js.native
    def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse] = js.native
    def updateUserSettings(params: UpdateUserSettingsRequest): Request[js.Object] = js.native
    def updateVoiceConnector(params: UpdateVoiceConnectorRequest): Request[UpdateVoiceConnectorResponse] = js.native
    def updateVoiceConnectorGroup(params: UpdateVoiceConnectorGroupRequest): Request[UpdateVoiceConnectorGroupResponse] = js.native
  }
  object Chime {
    @inline implicit def toOps(service: Chime): ChimeOps = {
      new ChimeOps(service)
    }
  }

  /** The Amazon Chime account details. An AWS account can have multiple Amazon Chime accounts.
    */
  @js.native
  trait Account extends js.Object {
    var AccountId: String
    var AwsAccountId: String
    var Name: String
    var AccountStatus: js.UndefOr[AccountStatus]
    var AccountType: js.UndefOr[AccountType]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var DefaultLicense: js.UndefOr[License]
    var SigninDelegateGroups: js.UndefOr[SigninDelegateGroupList]
    var SupportedLicenses: js.UndefOr[LicenseList]
  }

  object Account {
    @inline
    def apply(
        AccountId: String,
        AwsAccountId: String,
        Name: String,
        AccountStatus: js.UndefOr[AccountStatus] = js.undefined,
        AccountType: js.UndefOr[AccountType] = js.undefined,
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        DefaultLicense: js.UndefOr[License] = js.undefined,
        SigninDelegateGroups: js.UndefOr[SigninDelegateGroupList] = js.undefined,
        SupportedLicenses: js.UndefOr[LicenseList] = js.undefined
    ): Account = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AccountStatus.foreach(__v => __obj.updateDynamic("AccountStatus")(__v.asInstanceOf[js.Any]))
      AccountType.foreach(__v => __obj.updateDynamic("AccountType")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      DefaultLicense.foreach(__v => __obj.updateDynamic("DefaultLicense")(__v.asInstanceOf[js.Any]))
      SigninDelegateGroups.foreach(__v => __obj.updateDynamic("SigninDelegateGroups")(__v.asInstanceOf[js.Any]))
      SupportedLicenses.foreach(__v => __obj.updateDynamic("SupportedLicenses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Account]
    }
  }

  /** Settings related to the Amazon Chime account. This includes settings that start or stop remote control of shared screens, or start or stop the dial-out option in the Amazon Chime web application. For more information about these settings, see [[https://docs.aws.amazon.com/chime/latest/ag/policies.html|Use the Policies Page]] in the <i>Amazon Chime Administration Guide</i>.
    */
  @js.native
  trait AccountSettings extends js.Object {
    var DisableRemoteControl: js.UndefOr[Boolean]
    var EnableDialOut: js.UndefOr[Boolean]
  }

  object AccountSettings {
    @inline
    def apply(
        DisableRemoteControl: js.UndefOr[Boolean] = js.undefined,
        EnableDialOut: js.UndefOr[Boolean] = js.undefined
    ): AccountSettings = {
      val __obj = js.Dynamic.literal()
      DisableRemoteControl.foreach(__v => __obj.updateDynamic("DisableRemoteControl")(__v.asInstanceOf[js.Any]))
      EnableDialOut.foreach(__v => __obj.updateDynamic("EnableDialOut")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountSettings]
    }
  }

  /** The Alexa for Business metadata associated with an Amazon Chime user, used to integrate Alexa for Business with a device.
    */
  @js.native
  trait AlexaForBusinessMetadata extends js.Object {
    var AlexaForBusinessRoomArn: js.UndefOr[SensitiveString]
    var IsAlexaForBusinessEnabled: js.UndefOr[Boolean]
  }

  object AlexaForBusinessMetadata {
    @inline
    def apply(
        AlexaForBusinessRoomArn: js.UndefOr[SensitiveString] = js.undefined,
        IsAlexaForBusinessEnabled: js.UndefOr[Boolean] = js.undefined
    ): AlexaForBusinessMetadata = {
      val __obj = js.Dynamic.literal()
      AlexaForBusinessRoomArn.foreach(__v => __obj.updateDynamic("AlexaForBusinessRoomArn")(__v.asInstanceOf[js.Any]))
      IsAlexaForBusinessEnabled.foreach(__v => __obj.updateDynamic("IsAlexaForBusinessEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlexaForBusinessMetadata]
    }
  }

  /** The details of an <code>AppInstance</code>, an instance of an Amazon Chime SDK messaging application.
    */
  @js.native
  trait AppInstance extends js.Object {
    var AppInstanceArn: js.UndefOr[ChimeArn]
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var LastUpdatedTimestamp: js.UndefOr[Timestamp]
    var Metadata: js.UndefOr[Metadata]
    var Name: js.UndefOr[NonEmptyResourceName]
  }

  object AppInstance {
    @inline
    def apply(
        AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined,
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Name: js.UndefOr[NonEmptyResourceName] = js.undefined
    ): AppInstance = {
      val __obj = js.Dynamic.literal()
      AppInstanceArn.foreach(__v => __obj.updateDynamic("AppInstanceArn")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppInstance]
    }
  }

  /** The details of an <code>AppInstanceAdmin</code>.
    */
  @js.native
  trait AppInstanceAdmin extends js.Object {
    var Admin: js.UndefOr[Identity]
    var AppInstanceArn: js.UndefOr[ChimeArn]
    var CreatedTimestamp: js.UndefOr[Timestamp]
  }

  object AppInstanceAdmin {
    @inline
    def apply(
        Admin: js.UndefOr[Identity] = js.undefined,
        AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined,
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): AppInstanceAdmin = {
      val __obj = js.Dynamic.literal()
      Admin.foreach(__v => __obj.updateDynamic("Admin")(__v.asInstanceOf[js.Any]))
      AppInstanceArn.foreach(__v => __obj.updateDynamic("AppInstanceArn")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppInstanceAdmin]
    }
  }

  /** Summary of the details of an <code>AppInstanceAdmin</code>.
    */
  @js.native
  trait AppInstanceAdminSummary extends js.Object {
    var Admin: js.UndefOr[Identity]
  }

  object AppInstanceAdminSummary {
    @inline
    def apply(
        Admin: js.UndefOr[Identity] = js.undefined
    ): AppInstanceAdminSummary = {
      val __obj = js.Dynamic.literal()
      Admin.foreach(__v => __obj.updateDynamic("Admin")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppInstanceAdminSummary]
    }
  }

  /** The details of the data-retention settings for an <code>AppInstance</code>.
    */
  @js.native
  trait AppInstanceRetentionSettings extends js.Object {
    var ChannelRetentionSettings: js.UndefOr[ChannelRetentionSettings]
  }

  object AppInstanceRetentionSettings {
    @inline
    def apply(
        ChannelRetentionSettings: js.UndefOr[ChannelRetentionSettings] = js.undefined
    ): AppInstanceRetentionSettings = {
      val __obj = js.Dynamic.literal()
      ChannelRetentionSettings.foreach(__v => __obj.updateDynamic("ChannelRetentionSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppInstanceRetentionSettings]
    }
  }

  /** The details of the streaming configuration of an <code>AppInstance</code>.
    */
  @js.native
  trait AppInstanceStreamingConfiguration extends js.Object {
    var AppInstanceDataType: AppInstanceDataType
    var ResourceArn: Arn
  }

  object AppInstanceStreamingConfiguration {
    @inline
    def apply(
        AppInstanceDataType: AppInstanceDataType,
        ResourceArn: Arn
    ): AppInstanceStreamingConfiguration = {
      val __obj = js.Dynamic.literal(
        "AppInstanceDataType" -> AppInstanceDataType.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AppInstanceStreamingConfiguration]
    }
  }

  /** Summary of the data for an <code>AppInstance</code>.
    */
  @js.native
  trait AppInstanceSummary extends js.Object {
    var AppInstanceArn: js.UndefOr[ChimeArn]
    var Metadata: js.UndefOr[Metadata]
    var Name: js.UndefOr[NonEmptyResourceName]
  }

  object AppInstanceSummary {
    @inline
    def apply(
        AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Name: js.UndefOr[NonEmptyResourceName] = js.undefined
    ): AppInstanceSummary = {
      val __obj = js.Dynamic.literal()
      AppInstanceArn.foreach(__v => __obj.updateDynamic("AppInstanceArn")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppInstanceSummary]
    }
  }

  /** The details of an <code>AppInstanceUser</code>.
    */
  @js.native
  trait AppInstanceUser extends js.Object {
    var AppInstanceUserArn: js.UndefOr[ChimeArn]
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var LastUpdatedTimestamp: js.UndefOr[Timestamp]
    var Metadata: js.UndefOr[Metadata]
    var Name: js.UndefOr[UserName]
  }

  object AppInstanceUser {
    @inline
    def apply(
        AppInstanceUserArn: js.UndefOr[ChimeArn] = js.undefined,
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Name: js.UndefOr[UserName] = js.undefined
    ): AppInstanceUser = {
      val __obj = js.Dynamic.literal()
      AppInstanceUserArn.foreach(__v => __obj.updateDynamic("AppInstanceUserArn")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppInstanceUser]
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

  /** Summary of the details of an <code>AppInstanceUser</code>.
    */
  @js.native
  trait AppInstanceUserSummary extends js.Object {
    var AppInstanceUserArn: js.UndefOr[ChimeArn]
    var Metadata: js.UndefOr[Metadata]
    var Name: js.UndefOr[UserName]
  }

  object AppInstanceUserSummary {
    @inline
    def apply(
        AppInstanceUserArn: js.UndefOr[ChimeArn] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Name: js.UndefOr[UserName] = js.undefined
    ): AppInstanceUserSummary = {
      val __obj = js.Dynamic.literal()
      AppInstanceUserArn.foreach(__v => __obj.updateDynamic("AppInstanceUserArn")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppInstanceUserSummary]
    }
  }

  /** The configuration for the artifacts.
    */
  @js.native
  trait ArtifactsConfiguration extends js.Object {
    var Audio: AudioArtifactsConfiguration
    var Content: ContentArtifactsConfiguration
    var Video: VideoArtifactsConfiguration
  }

  object ArtifactsConfiguration {
    @inline
    def apply(
        Audio: AudioArtifactsConfiguration,
        Content: ContentArtifactsConfiguration,
        Video: VideoArtifactsConfiguration
    ): ArtifactsConfiguration = {
      val __obj = js.Dynamic.literal(
        "Audio" -> Audio.asInstanceOf[js.Any],
        "Content" -> Content.asInstanceOf[js.Any],
        "Video" -> Video.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ArtifactsConfiguration]
    }
  }

  @js.native
  trait AssociatePhoneNumberWithUserRequest extends js.Object {
    var AccountId: String
    var E164PhoneNumber: E164PhoneNumber
    var UserId: String
  }

  object AssociatePhoneNumberWithUserRequest {
    @inline
    def apply(
        AccountId: String,
        E164PhoneNumber: E164PhoneNumber,
        UserId: String
    ): AssociatePhoneNumberWithUserRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "E164PhoneNumber" -> E164PhoneNumber.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociatePhoneNumberWithUserRequest]
    }
  }

  @js.native
  trait AssociatePhoneNumberWithUserResponse extends js.Object

  object AssociatePhoneNumberWithUserResponse {
    @inline
    def apply(): AssociatePhoneNumberWithUserResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociatePhoneNumberWithUserResponse]
    }
  }

  @js.native
  trait AssociatePhoneNumbersWithVoiceConnectorGroupRequest extends js.Object {
    var E164PhoneNumbers: E164PhoneNumberList
    var VoiceConnectorGroupId: NonEmptyString
    var ForceAssociate: js.UndefOr[NullableBoolean]
  }

  object AssociatePhoneNumbersWithVoiceConnectorGroupRequest {
    @inline
    def apply(
        E164PhoneNumbers: E164PhoneNumberList,
        VoiceConnectorGroupId: NonEmptyString,
        ForceAssociate: js.UndefOr[NullableBoolean] = js.undefined
    ): AssociatePhoneNumbersWithVoiceConnectorGroupRequest = {
      val __obj = js.Dynamic.literal(
        "E164PhoneNumbers" -> E164PhoneNumbers.asInstanceOf[js.Any],
        "VoiceConnectorGroupId" -> VoiceConnectorGroupId.asInstanceOf[js.Any]
      )

      ForceAssociate.foreach(__v => __obj.updateDynamic("ForceAssociate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociatePhoneNumbersWithVoiceConnectorGroupRequest]
    }
  }

  @js.native
  trait AssociatePhoneNumbersWithVoiceConnectorGroupResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  object AssociatePhoneNumbersWithVoiceConnectorGroupResponse {
    @inline
    def apply(
        PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
    ): AssociatePhoneNumbersWithVoiceConnectorGroupResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberErrors.foreach(__v => __obj.updateDynamic("PhoneNumberErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociatePhoneNumbersWithVoiceConnectorGroupResponse]
    }
  }

  @js.native
  trait AssociatePhoneNumbersWithVoiceConnectorRequest extends js.Object {
    var E164PhoneNumbers: E164PhoneNumberList
    var VoiceConnectorId: NonEmptyString
    var ForceAssociate: js.UndefOr[NullableBoolean]
  }

  object AssociatePhoneNumbersWithVoiceConnectorRequest {
    @inline
    def apply(
        E164PhoneNumbers: E164PhoneNumberList,
        VoiceConnectorId: NonEmptyString,
        ForceAssociate: js.UndefOr[NullableBoolean] = js.undefined
    ): AssociatePhoneNumbersWithVoiceConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "E164PhoneNumbers" -> E164PhoneNumbers.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      ForceAssociate.foreach(__v => __obj.updateDynamic("ForceAssociate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociatePhoneNumbersWithVoiceConnectorRequest]
    }
  }

  @js.native
  trait AssociatePhoneNumbersWithVoiceConnectorResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  object AssociatePhoneNumbersWithVoiceConnectorResponse {
    @inline
    def apply(
        PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
    ): AssociatePhoneNumbersWithVoiceConnectorResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberErrors.foreach(__v => __obj.updateDynamic("PhoneNumberErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociatePhoneNumbersWithVoiceConnectorResponse]
    }
  }

  @js.native
  trait AssociateSigninDelegateGroupsWithAccountRequest extends js.Object {
    var AccountId: NonEmptyString
    var SigninDelegateGroups: SigninDelegateGroupList
  }

  object AssociateSigninDelegateGroupsWithAccountRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        SigninDelegateGroups: SigninDelegateGroupList
    ): AssociateSigninDelegateGroupsWithAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "SigninDelegateGroups" -> SigninDelegateGroups.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateSigninDelegateGroupsWithAccountRequest]
    }
  }

  @js.native
  trait AssociateSigninDelegateGroupsWithAccountResponse extends js.Object

  object AssociateSigninDelegateGroupsWithAccountResponse {
    @inline
    def apply(): AssociateSigninDelegateGroupsWithAccountResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateSigninDelegateGroupsWithAccountResponse]
    }
  }

  /** An Amazon Chime SDK meeting attendee. Includes a unique <code>AttendeeId</code> and <code>JoinToken</code> . The <code>JoinToken</code> allows a client to authenticate and join as the specified attendee. The <code>JoinToken</code> expires when the meeting ends or when <a>DeleteAttendee</a> is called. After that, the attendee is unable to join the meeting. We recommend securely transferring each <code>JoinToken</code> from your server application to the client so that no other client has access to the token except for the one authorized to represent the attendee.
    */
  @js.native
  trait Attendee extends js.Object {
    var AttendeeId: js.UndefOr[GuidString]
    var ExternalUserId: js.UndefOr[ExternalUserIdType]
    var JoinToken: js.UndefOr[JoinTokenString]
  }

  object Attendee {
    @inline
    def apply(
        AttendeeId: js.UndefOr[GuidString] = js.undefined,
        ExternalUserId: js.UndefOr[ExternalUserIdType] = js.undefined,
        JoinToken: js.UndefOr[JoinTokenString] = js.undefined
    ): Attendee = {
      val __obj = js.Dynamic.literal()
      AttendeeId.foreach(__v => __obj.updateDynamic("AttendeeId")(__v.asInstanceOf[js.Any]))
      ExternalUserId.foreach(__v => __obj.updateDynamic("ExternalUserId")(__v.asInstanceOf[js.Any]))
      JoinToken.foreach(__v => __obj.updateDynamic("JoinToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Attendee]
    }
  }

  /** The audio artifact configuration object.
    */
  @js.native
  trait AudioArtifactsConfiguration extends js.Object {
    var MuxType: AudioMuxType
  }

  object AudioArtifactsConfiguration {
    @inline
    def apply(
        MuxType: AudioMuxType
    ): AudioArtifactsConfiguration = {
      val __obj = js.Dynamic.literal(
        "MuxType" -> MuxType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AudioArtifactsConfiguration]
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

  @js.native
  trait BatchCreateAttendeeRequest extends js.Object {
    var Attendees: CreateAttendeeRequestItemList
    var MeetingId: GuidString
  }

  object BatchCreateAttendeeRequest {
    @inline
    def apply(
        Attendees: CreateAttendeeRequestItemList,
        MeetingId: GuidString
    ): BatchCreateAttendeeRequest = {
      val __obj = js.Dynamic.literal(
        "Attendees" -> Attendees.asInstanceOf[js.Any],
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchCreateAttendeeRequest]
    }
  }

  @js.native
  trait BatchCreateAttendeeResponse extends js.Object {
    var Attendees: js.UndefOr[AttendeeList]
    var Errors: js.UndefOr[BatchCreateAttendeeErrorList]
  }

  object BatchCreateAttendeeResponse {
    @inline
    def apply(
        Attendees: js.UndefOr[AttendeeList] = js.undefined,
        Errors: js.UndefOr[BatchCreateAttendeeErrorList] = js.undefined
    ): BatchCreateAttendeeResponse = {
      val __obj = js.Dynamic.literal()
      Attendees.foreach(__v => __obj.updateDynamic("Attendees")(__v.asInstanceOf[js.Any]))
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreateAttendeeResponse]
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
    var MemberArns: MemberArns
    var ChimeBearer: js.UndefOr[ChimeArn]
    var Type: js.UndefOr[ChannelMembershipType]
  }

  object BatchCreateChannelMembershipRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        MemberArns: MemberArns,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined,
        Type: js.UndefOr[ChannelMembershipType] = js.undefined
    ): BatchCreateChannelMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "MemberArns" -> MemberArns.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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

  @js.native
  trait BatchCreateRoomMembershipRequest extends js.Object {
    var AccountId: NonEmptyString
    var MembershipItemList: MembershipItemList
    var RoomId: NonEmptyString
  }

  object BatchCreateRoomMembershipRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        MembershipItemList: MembershipItemList,
        RoomId: NonEmptyString
    ): BatchCreateRoomMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "MembershipItemList" -> MembershipItemList.asInstanceOf[js.Any],
        "RoomId" -> RoomId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchCreateRoomMembershipRequest]
    }
  }

  @js.native
  trait BatchCreateRoomMembershipResponse extends js.Object {
    var Errors: js.UndefOr[MemberErrorList]
  }

  object BatchCreateRoomMembershipResponse {
    @inline
    def apply(
        Errors: js.UndefOr[MemberErrorList] = js.undefined
    ): BatchCreateRoomMembershipResponse = {
      val __obj = js.Dynamic.literal()
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreateRoomMembershipResponse]
    }
  }

  @js.native
  trait BatchDeletePhoneNumberRequest extends js.Object {
    var PhoneNumberIds: NonEmptyStringList
  }

  object BatchDeletePhoneNumberRequest {
    @inline
    def apply(
        PhoneNumberIds: NonEmptyStringList
    ): BatchDeletePhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberIds" -> PhoneNumberIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDeletePhoneNumberRequest]
    }
  }

  @js.native
  trait BatchDeletePhoneNumberResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  object BatchDeletePhoneNumberResponse {
    @inline
    def apply(
        PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
    ): BatchDeletePhoneNumberResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberErrors.foreach(__v => __obj.updateDynamic("PhoneNumberErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeletePhoneNumberResponse]
    }
  }

  @js.native
  trait BatchSuspendUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserIdList: UserIdList
  }

  object BatchSuspendUserRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        UserIdList: UserIdList
    ): BatchSuspendUserRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserIdList" -> UserIdList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchSuspendUserRequest]
    }
  }

  @js.native
  trait BatchSuspendUserResponse extends js.Object {
    var UserErrors: js.UndefOr[UserErrorList]
  }

  object BatchSuspendUserResponse {
    @inline
    def apply(
        UserErrors: js.UndefOr[UserErrorList] = js.undefined
    ): BatchSuspendUserResponse = {
      val __obj = js.Dynamic.literal()
      UserErrors.foreach(__v => __obj.updateDynamic("UserErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchSuspendUserResponse]
    }
  }

  @js.native
  trait BatchUnsuspendUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserIdList: UserIdList
  }

  object BatchUnsuspendUserRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        UserIdList: UserIdList
    ): BatchUnsuspendUserRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserIdList" -> UserIdList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchUnsuspendUserRequest]
    }
  }

  @js.native
  trait BatchUnsuspendUserResponse extends js.Object {
    var UserErrors: js.UndefOr[UserErrorList]
  }

  object BatchUnsuspendUserResponse {
    @inline
    def apply(
        UserErrors: js.UndefOr[UserErrorList] = js.undefined
    ): BatchUnsuspendUserResponse = {
      val __obj = js.Dynamic.literal()
      UserErrors.foreach(__v => __obj.updateDynamic("UserErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUnsuspendUserResponse]
    }
  }

  @js.native
  trait BatchUpdatePhoneNumberRequest extends js.Object {
    var UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList
  }

  object BatchUpdatePhoneNumberRequest {
    @inline
    def apply(
        UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList
    ): BatchUpdatePhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "UpdatePhoneNumberRequestItems" -> UpdatePhoneNumberRequestItems.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchUpdatePhoneNumberRequest]
    }
  }

  @js.native
  trait BatchUpdatePhoneNumberResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  object BatchUpdatePhoneNumberResponse {
    @inline
    def apply(
        PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
    ): BatchUpdatePhoneNumberResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberErrors.foreach(__v => __obj.updateDynamic("PhoneNumberErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpdatePhoneNumberResponse]
    }
  }

  @js.native
  trait BatchUpdateUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UpdateUserRequestItems: UpdateUserRequestItemList
  }

  object BatchUpdateUserRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        UpdateUserRequestItems: UpdateUserRequestItemList
    ): BatchUpdateUserRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UpdateUserRequestItems" -> UpdateUserRequestItems.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchUpdateUserRequest]
    }
  }

  @js.native
  trait BatchUpdateUserResponse extends js.Object {
    var UserErrors: js.UndefOr[UserErrorList]
  }

  object BatchUpdateUserResponse {
    @inline
    def apply(
        UserErrors: js.UndefOr[UserErrorList] = js.undefined
    ): BatchUpdateUserResponse = {
      val __obj = js.Dynamic.literal()
      UserErrors.foreach(__v => __obj.updateDynamic("UserErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpdateUserResponse]
    }
  }

  /** A resource that allows Enterprise account administrators to configure an interface to receive events from Amazon Chime.
    */
  @js.native
  trait Bot extends js.Object {
    var BotEmail: js.UndefOr[SensitiveString]
    var BotId: js.UndefOr[String]
    var BotType: js.UndefOr[BotType]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var Disabled: js.UndefOr[NullableBoolean]
    var DisplayName: js.UndefOr[SensitiveString]
    var SecurityToken: js.UndefOr[SensitiveString]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var UserId: js.UndefOr[String]
  }

  object Bot {
    @inline
    def apply(
        BotEmail: js.UndefOr[SensitiveString] = js.undefined,
        BotId: js.UndefOr[String] = js.undefined,
        BotType: js.UndefOr[BotType] = js.undefined,
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        Disabled: js.UndefOr[NullableBoolean] = js.undefined,
        DisplayName: js.UndefOr[SensitiveString] = js.undefined,
        SecurityToken: js.UndefOr[SensitiveString] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        UserId: js.UndefOr[String] = js.undefined
    ): Bot = {
      val __obj = js.Dynamic.literal()
      BotEmail.foreach(__v => __obj.updateDynamic("BotEmail")(__v.asInstanceOf[js.Any]))
      BotId.foreach(__v => __obj.updateDynamic("BotId")(__v.asInstanceOf[js.Any]))
      BotType.foreach(__v => __obj.updateDynamic("BotType")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      SecurityToken.foreach(__v => __obj.updateDynamic("SecurityToken")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Bot]
    }
  }

  /** The Amazon Chime Business Calling settings for the administrator's AWS account. Includes any Amazon S3 buckets designated for storing call detail records.
    */
  @js.native
  trait BusinessCallingSettings extends js.Object {
    var CdrBucket: js.UndefOr[String]
  }

  object BusinessCallingSettings {
    @inline
    def apply(
        CdrBucket: js.UndefOr[String] = js.undefined
    ): BusinessCallingSettings = {
      val __obj = js.Dynamic.literal()
      CdrBucket.foreach(__v => __obj.updateDynamic("CdrBucket")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BusinessCallingSettings]
    }
  }

  /** The details of a channel.
    */
  @js.native
  trait Channel extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
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
    var MessageId: js.UndefOr[MessageId]
    var Metadata: js.UndefOr[Metadata]
    var Persistence: js.UndefOr[ChannelMessagePersistenceType]
    var Redacted: js.UndefOr[NonNullableBoolean]
    var Sender: js.UndefOr[Identity]
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
        MessageId: js.UndefOr[MessageId] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Persistence: js.UndefOr[ChannelMessagePersistenceType] = js.undefined,
        Redacted: js.UndefOr[NonNullableBoolean] = js.undefined,
        Sender: js.UndefOr[Identity] = js.undefined,
        Type: js.UndefOr[ChannelMessageType] = js.undefined
    ): ChannelMessage = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      LastEditedTimestamp.foreach(__v => __obj.updateDynamic("LastEditedTimestamp")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Persistence.foreach(__v => __obj.updateDynamic("Persistence")(__v.asInstanceOf[js.Any]))
      Redacted.foreach(__v => __obj.updateDynamic("Redacted")(__v.asInstanceOf[js.Any]))
      Sender.foreach(__v => __obj.updateDynamic("Sender")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelMessage]
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
    var MessageId: js.UndefOr[MessageId]
    var Metadata: js.UndefOr[Metadata]
    var Redacted: js.UndefOr[NonNullableBoolean]
    var Sender: js.UndefOr[Identity]
    var Type: js.UndefOr[ChannelMessageType]
  }

  object ChannelMessageSummary {
    @inline
    def apply(
        Content: js.UndefOr[Content] = js.undefined,
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        LastEditedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        MessageId: js.UndefOr[MessageId] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Redacted: js.UndefOr[NonNullableBoolean] = js.undefined,
        Sender: js.UndefOr[Identity] = js.undefined,
        Type: js.UndefOr[ChannelMessageType] = js.undefined
    ): ChannelMessageSummary = {
      val __obj = js.Dynamic.literal()
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      LastEditedTimestamp.foreach(__v => __obj.updateDynamic("LastEditedTimestamp")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Redacted.foreach(__v => __obj.updateDynamic("Redacted")(__v.asInstanceOf[js.Any]))
      Sender.foreach(__v => __obj.updateDynamic("Sender")(__v.asInstanceOf[js.Any]))
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

  /** The details of the retention settings for a channel.
    */
  @js.native
  trait ChannelRetentionSettings extends js.Object {
    var RetentionDays: js.UndefOr[RetentionDays]
  }

  object ChannelRetentionSettings {
    @inline
    def apply(
        RetentionDays: js.UndefOr[RetentionDays] = js.undefined
    ): ChannelRetentionSettings = {
      val __obj = js.Dynamic.literal()
      RetentionDays.foreach(__v => __obj.updateDynamic("RetentionDays")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelRetentionSettings]
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

  /** The configuration object of the Amazon Chime SDK meeting for a specified media capture pipeline. <code>SourceType</code> must be <code>ChimeSdkMeeting</code>.
    */
  @js.native
  trait ChimeSdkMeetingConfiguration extends js.Object {
    var ArtifactsConfiguration: js.UndefOr[ArtifactsConfiguration]
    var SourceConfiguration: js.UndefOr[SourceConfiguration]
  }

  object ChimeSdkMeetingConfiguration {
    @inline
    def apply(
        ArtifactsConfiguration: js.UndefOr[ArtifactsConfiguration] = js.undefined,
        SourceConfiguration: js.UndefOr[SourceConfiguration] = js.undefined
    ): ChimeSdkMeetingConfiguration = {
      val __obj = js.Dynamic.literal()
      ArtifactsConfiguration.foreach(__v => __obj.updateDynamic("ArtifactsConfiguration")(__v.asInstanceOf[js.Any]))
      SourceConfiguration.foreach(__v => __obj.updateDynamic("SourceConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChimeSdkMeetingConfiguration]
    }
  }

  /** The content artifact object.
    */
  @js.native
  trait ContentArtifactsConfiguration extends js.Object {
    var State: ArtifactsState
    var MuxType: js.UndefOr[ContentMuxType]
  }

  object ContentArtifactsConfiguration {
    @inline
    def apply(
        State: ArtifactsState,
        MuxType: js.UndefOr[ContentMuxType] = js.undefined
    ): ContentArtifactsConfiguration = {
      val __obj = js.Dynamic.literal(
        "State" -> State.asInstanceOf[js.Any]
      )

      MuxType.foreach(__v => __obj.updateDynamic("MuxType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContentArtifactsConfiguration]
    }
  }

  /** The retention settings that determine how long to retain conversation messages for an Amazon Chime Enterprise account.
    */
  @js.native
  trait ConversationRetentionSettings extends js.Object {
    var RetentionDays: js.UndefOr[RetentionDays]
  }

  object ConversationRetentionSettings {
    @inline
    def apply(
        RetentionDays: js.UndefOr[RetentionDays] = js.undefined
    ): ConversationRetentionSettings = {
      val __obj = js.Dynamic.literal()
      RetentionDays.foreach(__v => __obj.updateDynamic("RetentionDays")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConversationRetentionSettings]
    }
  }

  @js.native
  trait CreateAccountRequest extends js.Object {
    var Name: AccountName
  }

  object CreateAccountRequest {
    @inline
    def apply(
        Name: AccountName
    ): CreateAccountRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAccountRequest]
    }
  }

  @js.native
  trait CreateAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  object CreateAccountResponse {
    @inline
    def apply(
        Account: js.UndefOr[Account] = js.undefined
    ): CreateAccountResponse = {
      val __obj = js.Dynamic.literal()
      Account.foreach(__v => __obj.updateDynamic("Account")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccountResponse]
    }
  }

  @js.native
  trait CreateAppInstanceAdminRequest extends js.Object {
    var AppInstanceAdminArn: ChimeArn
    var AppInstanceArn: ChimeArn
  }

  object CreateAppInstanceAdminRequest {
    @inline
    def apply(
        AppInstanceAdminArn: ChimeArn,
        AppInstanceArn: ChimeArn
    ): CreateAppInstanceAdminRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceAdminArn" -> AppInstanceAdminArn.asInstanceOf[js.Any],
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAppInstanceAdminRequest]
    }
  }

  @js.native
  trait CreateAppInstanceAdminResponse extends js.Object {
    var AppInstanceAdmin: js.UndefOr[Identity]
    var AppInstanceArn: js.UndefOr[ChimeArn]
  }

  object CreateAppInstanceAdminResponse {
    @inline
    def apply(
        AppInstanceAdmin: js.UndefOr[Identity] = js.undefined,
        AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined
    ): CreateAppInstanceAdminResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceAdmin.foreach(__v => __obj.updateDynamic("AppInstanceAdmin")(__v.asInstanceOf[js.Any]))
      AppInstanceArn.foreach(__v => __obj.updateDynamic("AppInstanceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppInstanceAdminResponse]
    }
  }

  @js.native
  trait CreateAppInstanceRequest extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var Name: NonEmptyResourceName
    var Metadata: js.UndefOr[Metadata]
    var Tags: js.UndefOr[TagList]
  }

  object CreateAppInstanceRequest {
    @inline
    def apply(
        ClientRequestToken: ClientRequestToken,
        Name: NonEmptyResourceName,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateAppInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppInstanceRequest]
    }
  }

  @js.native
  trait CreateAppInstanceResponse extends js.Object {
    var AppInstanceArn: js.UndefOr[ChimeArn]
  }

  object CreateAppInstanceResponse {
    @inline
    def apply(
        AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined
    ): CreateAppInstanceResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceArn.foreach(__v => __obj.updateDynamic("AppInstanceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppInstanceResponse]
    }
  }

  @js.native
  trait CreateAppInstanceUserRequest extends js.Object {
    var AppInstanceArn: ChimeArn
    var AppInstanceUserId: UserId
    var ClientRequestToken: ClientRequestToken
    var Name: UserName
    var Metadata: js.UndefOr[Metadata]
    var Tags: js.UndefOr[TagList]
  }

  object CreateAppInstanceUserRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn,
        AppInstanceUserId: UserId,
        ClientRequestToken: ClientRequestToken,
        Name: UserName,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateAppInstanceUserRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any],
        "AppInstanceUserId" -> AppInstanceUserId.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppInstanceUserRequest]
    }
  }

  @js.native
  trait CreateAppInstanceUserResponse extends js.Object {
    var AppInstanceUserArn: js.UndefOr[ChimeArn]
  }

  object CreateAppInstanceUserResponse {
    @inline
    def apply(
        AppInstanceUserArn: js.UndefOr[ChimeArn] = js.undefined
    ): CreateAppInstanceUserResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceUserArn.foreach(__v => __obj.updateDynamic("AppInstanceUserArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppInstanceUserResponse]
    }
  }

  /** The list of errors returned when errors are encountered during the BatchCreateAttendee and CreateAttendee actions. This includes external user IDs, error codes, and error messages.
    */
  @js.native
  trait CreateAttendeeError extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
    var ExternalUserId: js.UndefOr[ExternalUserIdType]
  }

  object CreateAttendeeError {
    @inline
    def apply(
        ErrorCode: js.UndefOr[String] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        ExternalUserId: js.UndefOr[ExternalUserIdType] = js.undefined
    ): CreateAttendeeError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      ExternalUserId.foreach(__v => __obj.updateDynamic("ExternalUserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAttendeeError]
    }
  }

  @js.native
  trait CreateAttendeeRequest extends js.Object {
    var ExternalUserId: ExternalUserIdType
    var MeetingId: GuidString
    var Tags: js.UndefOr[AttendeeTagList]
  }

  object CreateAttendeeRequest {
    @inline
    def apply(
        ExternalUserId: ExternalUserIdType,
        MeetingId: GuidString,
        Tags: js.UndefOr[AttendeeTagList] = js.undefined
    ): CreateAttendeeRequest = {
      val __obj = js.Dynamic.literal(
        "ExternalUserId" -> ExternalUserId.asInstanceOf[js.Any],
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAttendeeRequest]
    }
  }

  /** The Amazon Chime SDK attendee fields to create, used with the BatchCreateAttendee action.
    */
  @js.native
  trait CreateAttendeeRequestItem extends js.Object {
    var ExternalUserId: ExternalUserIdType
    var Tags: js.UndefOr[AttendeeTagList]
  }

  object CreateAttendeeRequestItem {
    @inline
    def apply(
        ExternalUserId: ExternalUserIdType,
        Tags: js.UndefOr[AttendeeTagList] = js.undefined
    ): CreateAttendeeRequestItem = {
      val __obj = js.Dynamic.literal(
        "ExternalUserId" -> ExternalUserId.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAttendeeRequestItem]
    }
  }

  @js.native
  trait CreateAttendeeResponse extends js.Object {
    var Attendee: js.UndefOr[Attendee]
  }

  object CreateAttendeeResponse {
    @inline
    def apply(
        Attendee: js.UndefOr[Attendee] = js.undefined
    ): CreateAttendeeResponse = {
      val __obj = js.Dynamic.literal()
      Attendee.foreach(__v => __obj.updateDynamic("Attendee")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAttendeeResponse]
    }
  }

  @js.native
  trait CreateBotRequest extends js.Object {
    var AccountId: NonEmptyString
    var DisplayName: SensitiveString
    var Domain: js.UndefOr[NonEmptyString]
  }

  object CreateBotRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        DisplayName: SensitiveString,
        Domain: js.UndefOr[NonEmptyString] = js.undefined
    ): CreateBotRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "DisplayName" -> DisplayName.asInstanceOf[js.Any]
      )

      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBotRequest]
    }
  }

  @js.native
  trait CreateBotResponse extends js.Object {
    var Bot: js.UndefOr[Bot]
  }

  object CreateBotResponse {
    @inline
    def apply(
        Bot: js.UndefOr[Bot] = js.undefined
    ): CreateBotResponse = {
      val __obj = js.Dynamic.literal()
      Bot.foreach(__v => __obj.updateDynamic("Bot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBotResponse]
    }
  }

  @js.native
  trait CreateChannelBanRequest extends js.Object {
    var ChannelArn: ChimeArn
    var MemberArn: ChimeArn
    var ChimeBearer: js.UndefOr[ChimeArn]
  }

  object CreateChannelBanRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        MemberArn: ChimeArn,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
    ): CreateChannelBanRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "MemberArn" -> MemberArn.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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
  trait CreateChannelMembershipRequest extends js.Object {
    var ChannelArn: ChimeArn
    var MemberArn: ChimeArn
    var Type: ChannelMembershipType
    var ChimeBearer: js.UndefOr[ChimeArn]
  }

  object CreateChannelMembershipRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        MemberArn: ChimeArn,
        Type: ChannelMembershipType,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
    ): CreateChannelMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "MemberArn" -> MemberArn.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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
    var ChimeBearer: js.UndefOr[ChimeArn]
  }

  object CreateChannelModeratorRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChannelModeratorArn: ChimeArn,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
    ): CreateChannelModeratorRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChannelModeratorArn" -> ChannelModeratorArn.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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
    var ClientRequestToken: ClientRequestToken
    var Name: NonEmptyResourceName
    var ChimeBearer: js.UndefOr[ChimeArn]
    var Metadata: js.UndefOr[Metadata]
    var Mode: js.UndefOr[ChannelMode]
    var Privacy: js.UndefOr[ChannelPrivacy]
    var Tags: js.UndefOr[TagList]
  }

  object CreateChannelRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn,
        ClientRequestToken: ClientRequestToken,
        Name: NonEmptyResourceName,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined,
        Mode: js.UndefOr[ChannelMode] = js.undefined,
        Privacy: js.UndefOr[ChannelPrivacy] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateChannelRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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
  trait CreateMediaCapturePipelineRequest extends js.Object {
    var SinkArn: Arn
    var SinkType: MediaPipelineSinkType
    var SourceArn: Arn
    var SourceType: MediaPipelineSourceType
    var ChimeSdkMeetingConfiguration: js.UndefOr[ChimeSdkMeetingConfiguration]
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object CreateMediaCapturePipelineRequest {
    @inline
    def apply(
        SinkArn: Arn,
        SinkType: MediaPipelineSinkType,
        SourceArn: Arn,
        SourceType: MediaPipelineSourceType,
        ChimeSdkMeetingConfiguration: js.UndefOr[ChimeSdkMeetingConfiguration] = js.undefined,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): CreateMediaCapturePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "SinkArn" -> SinkArn.asInstanceOf[js.Any],
        "SinkType" -> SinkType.asInstanceOf[js.Any],
        "SourceArn" -> SourceArn.asInstanceOf[js.Any],
        "SourceType" -> SourceType.asInstanceOf[js.Any]
      )

      ChimeSdkMeetingConfiguration.foreach(__v => __obj.updateDynamic("ChimeSdkMeetingConfiguration")(__v.asInstanceOf[js.Any]))
      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMediaCapturePipelineRequest]
    }
  }

  @js.native
  trait CreateMediaCapturePipelineResponse extends js.Object {
    var MediaCapturePipeline: js.UndefOr[MediaCapturePipeline]
  }

  object CreateMediaCapturePipelineResponse {
    @inline
    def apply(
        MediaCapturePipeline: js.UndefOr[MediaCapturePipeline] = js.undefined
    ): CreateMediaCapturePipelineResponse = {
      val __obj = js.Dynamic.literal()
      MediaCapturePipeline.foreach(__v => __obj.updateDynamic("MediaCapturePipeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMediaCapturePipelineResponse]
    }
  }

  @js.native
  trait CreateMeetingDialOutRequest extends js.Object {
    var FromPhoneNumber: E164PhoneNumber
    var JoinToken: JoinTokenString
    var MeetingId: GuidString
    var ToPhoneNumber: E164PhoneNumber
  }

  object CreateMeetingDialOutRequest {
    @inline
    def apply(
        FromPhoneNumber: E164PhoneNumber,
        JoinToken: JoinTokenString,
        MeetingId: GuidString,
        ToPhoneNumber: E164PhoneNumber
    ): CreateMeetingDialOutRequest = {
      val __obj = js.Dynamic.literal(
        "FromPhoneNumber" -> FromPhoneNumber.asInstanceOf[js.Any],
        "JoinToken" -> JoinToken.asInstanceOf[js.Any],
        "MeetingId" -> MeetingId.asInstanceOf[js.Any],
        "ToPhoneNumber" -> ToPhoneNumber.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateMeetingDialOutRequest]
    }
  }

  @js.native
  trait CreateMeetingDialOutResponse extends js.Object {
    var TransactionId: js.UndefOr[GuidString]
  }

  object CreateMeetingDialOutResponse {
    @inline
    def apply(
        TransactionId: js.UndefOr[GuidString] = js.undefined
    ): CreateMeetingDialOutResponse = {
      val __obj = js.Dynamic.literal()
      TransactionId.foreach(__v => __obj.updateDynamic("TransactionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMeetingDialOutResponse]
    }
  }

  @js.native
  trait CreateMeetingRequest extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var ExternalMeetingId: js.UndefOr[ExternalMeetingIdType]
    var MediaRegion: js.UndefOr[String]
    var MeetingHostId: js.UndefOr[ExternalUserIdType]
    var NotificationsConfiguration: js.UndefOr[MeetingNotificationConfiguration]
    var Tags: js.UndefOr[MeetingTagList]
  }

  object CreateMeetingRequest {
    @inline
    def apply(
        ClientRequestToken: ClientRequestToken,
        ExternalMeetingId: js.UndefOr[ExternalMeetingIdType] = js.undefined,
        MediaRegion: js.UndefOr[String] = js.undefined,
        MeetingHostId: js.UndefOr[ExternalUserIdType] = js.undefined,
        NotificationsConfiguration: js.UndefOr[MeetingNotificationConfiguration] = js.undefined,
        Tags: js.UndefOr[MeetingTagList] = js.undefined
    ): CreateMeetingRequest = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any]
      )

      ExternalMeetingId.foreach(__v => __obj.updateDynamic("ExternalMeetingId")(__v.asInstanceOf[js.Any]))
      MediaRegion.foreach(__v => __obj.updateDynamic("MediaRegion")(__v.asInstanceOf[js.Any]))
      MeetingHostId.foreach(__v => __obj.updateDynamic("MeetingHostId")(__v.asInstanceOf[js.Any]))
      NotificationsConfiguration.foreach(__v => __obj.updateDynamic("NotificationsConfiguration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMeetingRequest]
    }
  }

  @js.native
  trait CreateMeetingResponse extends js.Object {
    var Meeting: js.UndefOr[Meeting]
  }

  object CreateMeetingResponse {
    @inline
    def apply(
        Meeting: js.UndefOr[Meeting] = js.undefined
    ): CreateMeetingResponse = {
      val __obj = js.Dynamic.literal()
      Meeting.foreach(__v => __obj.updateDynamic("Meeting")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMeetingResponse]
    }
  }

  @js.native
  trait CreateMeetingWithAttendeesRequest extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var Attendees: js.UndefOr[CreateMeetingWithAttendeesRequestItemList]
    var ExternalMeetingId: js.UndefOr[ExternalMeetingIdType]
    var MediaRegion: js.UndefOr[String]
    var MeetingHostId: js.UndefOr[ExternalUserIdType]
    var NotificationsConfiguration: js.UndefOr[MeetingNotificationConfiguration]
    var Tags: js.UndefOr[MeetingTagList]
  }

  object CreateMeetingWithAttendeesRequest {
    @inline
    def apply(
        ClientRequestToken: ClientRequestToken,
        Attendees: js.UndefOr[CreateMeetingWithAttendeesRequestItemList] = js.undefined,
        ExternalMeetingId: js.UndefOr[ExternalMeetingIdType] = js.undefined,
        MediaRegion: js.UndefOr[String] = js.undefined,
        MeetingHostId: js.UndefOr[ExternalUserIdType] = js.undefined,
        NotificationsConfiguration: js.UndefOr[MeetingNotificationConfiguration] = js.undefined,
        Tags: js.UndefOr[MeetingTagList] = js.undefined
    ): CreateMeetingWithAttendeesRequest = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any]
      )

      Attendees.foreach(__v => __obj.updateDynamic("Attendees")(__v.asInstanceOf[js.Any]))
      ExternalMeetingId.foreach(__v => __obj.updateDynamic("ExternalMeetingId")(__v.asInstanceOf[js.Any]))
      MediaRegion.foreach(__v => __obj.updateDynamic("MediaRegion")(__v.asInstanceOf[js.Any]))
      MeetingHostId.foreach(__v => __obj.updateDynamic("MeetingHostId")(__v.asInstanceOf[js.Any]))
      NotificationsConfiguration.foreach(__v => __obj.updateDynamic("NotificationsConfiguration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMeetingWithAttendeesRequest]
    }
  }

  @js.native
  trait CreateMeetingWithAttendeesResponse extends js.Object {
    var Attendees: js.UndefOr[AttendeeList]
    var Errors: js.UndefOr[BatchCreateAttendeeErrorList]
    var Meeting: js.UndefOr[Meeting]
  }

  object CreateMeetingWithAttendeesResponse {
    @inline
    def apply(
        Attendees: js.UndefOr[AttendeeList] = js.undefined,
        Errors: js.UndefOr[BatchCreateAttendeeErrorList] = js.undefined,
        Meeting: js.UndefOr[Meeting] = js.undefined
    ): CreateMeetingWithAttendeesResponse = {
      val __obj = js.Dynamic.literal()
      Attendees.foreach(__v => __obj.updateDynamic("Attendees")(__v.asInstanceOf[js.Any]))
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      Meeting.foreach(__v => __obj.updateDynamic("Meeting")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMeetingWithAttendeesResponse]
    }
  }

  @js.native
  trait CreatePhoneNumberOrderRequest extends js.Object {
    var E164PhoneNumbers: E164PhoneNumberList
    var ProductType: PhoneNumberProductType
  }

  object CreatePhoneNumberOrderRequest {
    @inline
    def apply(
        E164PhoneNumbers: E164PhoneNumberList,
        ProductType: PhoneNumberProductType
    ): CreatePhoneNumberOrderRequest = {
      val __obj = js.Dynamic.literal(
        "E164PhoneNumbers" -> E164PhoneNumbers.asInstanceOf[js.Any],
        "ProductType" -> ProductType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreatePhoneNumberOrderRequest]
    }
  }

  @js.native
  trait CreatePhoneNumberOrderResponse extends js.Object {
    var PhoneNumberOrder: js.UndefOr[PhoneNumberOrder]
  }

  object CreatePhoneNumberOrderResponse {
    @inline
    def apply(
        PhoneNumberOrder: js.UndefOr[PhoneNumberOrder] = js.undefined
    ): CreatePhoneNumberOrderResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberOrder.foreach(__v => __obj.updateDynamic("PhoneNumberOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePhoneNumberOrderResponse]
    }
  }

  @js.native
  trait CreateProxySessionRequest extends js.Object {
    var Capabilities: CapabilityList
    var ParticipantPhoneNumbers: ParticipantPhoneNumberList
    var VoiceConnectorId: NonEmptyString128
    var ExpiryMinutes: js.UndefOr[PositiveInteger]
    var GeoMatchLevel: js.UndefOr[GeoMatchLevel]
    var GeoMatchParams: js.UndefOr[GeoMatchParams]
    var Name: js.UndefOr[ProxySessionNameString]
    var NumberSelectionBehavior: js.UndefOr[NumberSelectionBehavior]
  }

  object CreateProxySessionRequest {
    @inline
    def apply(
        Capabilities: CapabilityList,
        ParticipantPhoneNumbers: ParticipantPhoneNumberList,
        VoiceConnectorId: NonEmptyString128,
        ExpiryMinutes: js.UndefOr[PositiveInteger] = js.undefined,
        GeoMatchLevel: js.UndefOr[GeoMatchLevel] = js.undefined,
        GeoMatchParams: js.UndefOr[GeoMatchParams] = js.undefined,
        Name: js.UndefOr[ProxySessionNameString] = js.undefined,
        NumberSelectionBehavior: js.UndefOr[NumberSelectionBehavior] = js.undefined
    ): CreateProxySessionRequest = {
      val __obj = js.Dynamic.literal(
        "Capabilities" -> Capabilities.asInstanceOf[js.Any],
        "ParticipantPhoneNumbers" -> ParticipantPhoneNumbers.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      ExpiryMinutes.foreach(__v => __obj.updateDynamic("ExpiryMinutes")(__v.asInstanceOf[js.Any]))
      GeoMatchLevel.foreach(__v => __obj.updateDynamic("GeoMatchLevel")(__v.asInstanceOf[js.Any]))
      GeoMatchParams.foreach(__v => __obj.updateDynamic("GeoMatchParams")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NumberSelectionBehavior.foreach(__v => __obj.updateDynamic("NumberSelectionBehavior")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProxySessionRequest]
    }
  }

  @js.native
  trait CreateProxySessionResponse extends js.Object {
    var ProxySession: js.UndefOr[ProxySession]
  }

  object CreateProxySessionResponse {
    @inline
    def apply(
        ProxySession: js.UndefOr[ProxySession] = js.undefined
    ): CreateProxySessionResponse = {
      val __obj = js.Dynamic.literal()
      ProxySession.foreach(__v => __obj.updateDynamic("ProxySession")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProxySessionResponse]
    }
  }

  @js.native
  trait CreateRoomMembershipRequest extends js.Object {
    var AccountId: NonEmptyString
    var MemberId: NonEmptyString
    var RoomId: NonEmptyString
    var Role: js.UndefOr[RoomMembershipRole]
  }

  object CreateRoomMembershipRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        MemberId: NonEmptyString,
        RoomId: NonEmptyString,
        Role: js.UndefOr[RoomMembershipRole] = js.undefined
    ): CreateRoomMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "MemberId" -> MemberId.asInstanceOf[js.Any],
        "RoomId" -> RoomId.asInstanceOf[js.Any]
      )

      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRoomMembershipRequest]
    }
  }

  @js.native
  trait CreateRoomMembershipResponse extends js.Object {
    var RoomMembership: js.UndefOr[RoomMembership]
  }

  object CreateRoomMembershipResponse {
    @inline
    def apply(
        RoomMembership: js.UndefOr[RoomMembership] = js.undefined
    ): CreateRoomMembershipResponse = {
      val __obj = js.Dynamic.literal()
      RoomMembership.foreach(__v => __obj.updateDynamic("RoomMembership")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRoomMembershipResponse]
    }
  }

  @js.native
  trait CreateRoomRequest extends js.Object {
    var AccountId: NonEmptyString
    var Name: SensitiveString
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object CreateRoomRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        Name: SensitiveString,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): CreateRoomRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRoomRequest]
    }
  }

  @js.native
  trait CreateRoomResponse extends js.Object {
    var Room: js.UndefOr[Room]
  }

  object CreateRoomResponse {
    @inline
    def apply(
        Room: js.UndefOr[Room] = js.undefined
    ): CreateRoomResponse = {
      val __obj = js.Dynamic.literal()
      Room.foreach(__v => __obj.updateDynamic("Room")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRoomResponse]
    }
  }

  @js.native
  trait CreateSipMediaApplicationCallRequest extends js.Object {
    var FromPhoneNumber: E164PhoneNumber
    var SipMediaApplicationId: NonEmptyString
    var ToPhoneNumber: E164PhoneNumber
    var SipHeaders: js.UndefOr[SipHeadersMap]
  }

  object CreateSipMediaApplicationCallRequest {
    @inline
    def apply(
        FromPhoneNumber: E164PhoneNumber,
        SipMediaApplicationId: NonEmptyString,
        ToPhoneNumber: E164PhoneNumber,
        SipHeaders: js.UndefOr[SipHeadersMap] = js.undefined
    ): CreateSipMediaApplicationCallRequest = {
      val __obj = js.Dynamic.literal(
        "FromPhoneNumber" -> FromPhoneNumber.asInstanceOf[js.Any],
        "SipMediaApplicationId" -> SipMediaApplicationId.asInstanceOf[js.Any],
        "ToPhoneNumber" -> ToPhoneNumber.asInstanceOf[js.Any]
      )

      SipHeaders.foreach(__v => __obj.updateDynamic("SipHeaders")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSipMediaApplicationCallRequest]
    }
  }

  @js.native
  trait CreateSipMediaApplicationCallResponse extends js.Object {
    var SipMediaApplicationCall: js.UndefOr[SipMediaApplicationCall]
  }

  object CreateSipMediaApplicationCallResponse {
    @inline
    def apply(
        SipMediaApplicationCall: js.UndefOr[SipMediaApplicationCall] = js.undefined
    ): CreateSipMediaApplicationCallResponse = {
      val __obj = js.Dynamic.literal()
      SipMediaApplicationCall.foreach(__v => __obj.updateDynamic("SipMediaApplicationCall")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSipMediaApplicationCallResponse]
    }
  }

  @js.native
  trait CreateSipMediaApplicationRequest extends js.Object {
    var AwsRegion: String
    var Endpoints: SipMediaApplicationEndpointList
    var Name: SipMediaApplicationName
  }

  object CreateSipMediaApplicationRequest {
    @inline
    def apply(
        AwsRegion: String,
        Endpoints: SipMediaApplicationEndpointList,
        Name: SipMediaApplicationName
    ): CreateSipMediaApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "AwsRegion" -> AwsRegion.asInstanceOf[js.Any],
        "Endpoints" -> Endpoints.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateSipMediaApplicationRequest]
    }
  }

  @js.native
  trait CreateSipMediaApplicationResponse extends js.Object {
    var SipMediaApplication: js.UndefOr[SipMediaApplication]
  }

  object CreateSipMediaApplicationResponse {
    @inline
    def apply(
        SipMediaApplication: js.UndefOr[SipMediaApplication] = js.undefined
    ): CreateSipMediaApplicationResponse = {
      val __obj = js.Dynamic.literal()
      SipMediaApplication.foreach(__v => __obj.updateDynamic("SipMediaApplication")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSipMediaApplicationResponse]
    }
  }

  @js.native
  trait CreateSipRuleRequest extends js.Object {
    var Name: SipRuleName
    var TargetApplications: SipRuleTargetApplicationList
    var TriggerType: SipRuleTriggerType
    var TriggerValue: NonEmptyString
    var Disabled: js.UndefOr[NullableBoolean]
  }

  object CreateSipRuleRequest {
    @inline
    def apply(
        Name: SipRuleName,
        TargetApplications: SipRuleTargetApplicationList,
        TriggerType: SipRuleTriggerType,
        TriggerValue: NonEmptyString,
        Disabled: js.UndefOr[NullableBoolean] = js.undefined
    ): CreateSipRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "TargetApplications" -> TargetApplications.asInstanceOf[js.Any],
        "TriggerType" -> TriggerType.asInstanceOf[js.Any],
        "TriggerValue" -> TriggerValue.asInstanceOf[js.Any]
      )

      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSipRuleRequest]
    }
  }

  @js.native
  trait CreateSipRuleResponse extends js.Object {
    var SipRule: js.UndefOr[SipRule]
  }

  object CreateSipRuleResponse {
    @inline
    def apply(
        SipRule: js.UndefOr[SipRule] = js.undefined
    ): CreateSipRuleResponse = {
      val __obj = js.Dynamic.literal()
      SipRule.foreach(__v => __obj.updateDynamic("SipRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSipRuleResponse]
    }
  }

  @js.native
  trait CreateUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var Email: js.UndefOr[EmailAddress]
    var UserType: js.UndefOr[UserType]
    var Username: js.UndefOr[String]
  }

  object CreateUserRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        Email: js.UndefOr[EmailAddress] = js.undefined,
        UserType: js.UndefOr[UserType] = js.undefined,
        Username: js.UndefOr[String] = js.undefined
    ): CreateUserRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      UserType.foreach(__v => __obj.updateDynamic("UserType")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object CreateUserResponse {
    @inline
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): CreateUserResponse = {
      val __obj = js.Dynamic.literal()
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserResponse]
    }
  }

  @js.native
  trait CreateVoiceConnectorGroupRequest extends js.Object {
    var Name: VoiceConnectorGroupName
    var VoiceConnectorItems: js.UndefOr[VoiceConnectorItemList]
  }

  object CreateVoiceConnectorGroupRequest {
    @inline
    def apply(
        Name: VoiceConnectorGroupName,
        VoiceConnectorItems: js.UndefOr[VoiceConnectorItemList] = js.undefined
    ): CreateVoiceConnectorGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      VoiceConnectorItems.foreach(__v => __obj.updateDynamic("VoiceConnectorItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVoiceConnectorGroupRequest]
    }
  }

  @js.native
  trait CreateVoiceConnectorGroupResponse extends js.Object {
    var VoiceConnectorGroup: js.UndefOr[VoiceConnectorGroup]
  }

  object CreateVoiceConnectorGroupResponse {
    @inline
    def apply(
        VoiceConnectorGroup: js.UndefOr[VoiceConnectorGroup] = js.undefined
    ): CreateVoiceConnectorGroupResponse = {
      val __obj = js.Dynamic.literal()
      VoiceConnectorGroup.foreach(__v => __obj.updateDynamic("VoiceConnectorGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVoiceConnectorGroupResponse]
    }
  }

  @js.native
  trait CreateVoiceConnectorRequest extends js.Object {
    var Name: VoiceConnectorName
    var RequireEncryption: Boolean
    var AwsRegion: js.UndefOr[VoiceConnectorAwsRegion]
  }

  object CreateVoiceConnectorRequest {
    @inline
    def apply(
        Name: VoiceConnectorName,
        RequireEncryption: Boolean,
        AwsRegion: js.UndefOr[VoiceConnectorAwsRegion] = js.undefined
    ): CreateVoiceConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RequireEncryption" -> RequireEncryption.asInstanceOf[js.Any]
      )

      AwsRegion.foreach(__v => __obj.updateDynamic("AwsRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVoiceConnectorRequest]
    }
  }

  @js.native
  trait CreateVoiceConnectorResponse extends js.Object {
    var VoiceConnector: js.UndefOr[VoiceConnector]
  }

  object CreateVoiceConnectorResponse {
    @inline
    def apply(
        VoiceConnector: js.UndefOr[VoiceConnector] = js.undefined
    ): CreateVoiceConnectorResponse = {
      val __obj = js.Dynamic.literal()
      VoiceConnector.foreach(__v => __obj.updateDynamic("VoiceConnector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVoiceConnectorResponse]
    }
  }

  /** The SIP credentials used to authenticate requests to your Amazon Chime Voice Connector.
    */
  @js.native
  trait Credential extends js.Object {
    var Password: js.UndefOr[SensitiveString]
    var Username: js.UndefOr[SensitiveString]
  }

  object Credential {
    @inline
    def apply(
        Password: js.UndefOr[SensitiveString] = js.undefined,
        Username: js.UndefOr[SensitiveString] = js.undefined
    ): Credential = {
      val __obj = js.Dynamic.literal()
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Credential]
    }
  }

  /** The Dialed Number Identification Service (DNIS) emergency calling configuration details associated with an Amazon Chime Voice Connector's emergency calling configuration.
    */
  @js.native
  trait DNISEmergencyCallingConfiguration extends js.Object {
    var CallingCountry: Alpha2CountryCode
    var EmergencyPhoneNumber: E164PhoneNumber
    var TestPhoneNumber: js.UndefOr[E164PhoneNumber]
  }

  object DNISEmergencyCallingConfiguration {
    @inline
    def apply(
        CallingCountry: Alpha2CountryCode,
        EmergencyPhoneNumber: E164PhoneNumber,
        TestPhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
    ): DNISEmergencyCallingConfiguration = {
      val __obj = js.Dynamic.literal(
        "CallingCountry" -> CallingCountry.asInstanceOf[js.Any],
        "EmergencyPhoneNumber" -> EmergencyPhoneNumber.asInstanceOf[js.Any]
      )

      TestPhoneNumber.foreach(__v => __obj.updateDynamic("TestPhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DNISEmergencyCallingConfiguration]
    }
  }

  @js.native
  trait DeleteAccountRequest extends js.Object {
    var AccountId: NonEmptyString
  }

  object DeleteAccountRequest {
    @inline
    def apply(
        AccountId: NonEmptyString
    ): DeleteAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAccountRequest]
    }
  }

  @js.native
  trait DeleteAccountResponse extends js.Object

  object DeleteAccountResponse {
    @inline
    def apply(): DeleteAccountResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAccountResponse]
    }
  }

  @js.native
  trait DeleteAppInstanceAdminRequest extends js.Object {
    var AppInstanceAdminArn: ChimeArn
    var AppInstanceArn: ChimeArn
  }

  object DeleteAppInstanceAdminRequest {
    @inline
    def apply(
        AppInstanceAdminArn: ChimeArn,
        AppInstanceArn: ChimeArn
    ): DeleteAppInstanceAdminRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceAdminArn" -> AppInstanceAdminArn.asInstanceOf[js.Any],
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAppInstanceAdminRequest]
    }
  }

  @js.native
  trait DeleteAppInstanceRequest extends js.Object {
    var AppInstanceArn: ChimeArn
  }

  object DeleteAppInstanceRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn
    ): DeleteAppInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAppInstanceRequest]
    }
  }

  @js.native
  trait DeleteAppInstanceStreamingConfigurationsRequest extends js.Object {
    var AppInstanceArn: ChimeArn
  }

  object DeleteAppInstanceStreamingConfigurationsRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn
    ): DeleteAppInstanceStreamingConfigurationsRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAppInstanceStreamingConfigurationsRequest]
    }
  }

  @js.native
  trait DeleteAppInstanceUserRequest extends js.Object {
    var AppInstanceUserArn: ChimeArn
  }

  object DeleteAppInstanceUserRequest {
    @inline
    def apply(
        AppInstanceUserArn: ChimeArn
    ): DeleteAppInstanceUserRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceUserArn" -> AppInstanceUserArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAppInstanceUserRequest]
    }
  }

  @js.native
  trait DeleteAttendeeRequest extends js.Object {
    var AttendeeId: GuidString
    var MeetingId: GuidString
  }

  object DeleteAttendeeRequest {
    @inline
    def apply(
        AttendeeId: GuidString,
        MeetingId: GuidString
    ): DeleteAttendeeRequest = {
      val __obj = js.Dynamic.literal(
        "AttendeeId" -> AttendeeId.asInstanceOf[js.Any],
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAttendeeRequest]
    }
  }

  @js.native
  trait DeleteChannelBanRequest extends js.Object {
    var ChannelArn: ChimeArn
    var MemberArn: ChimeArn
    var ChimeBearer: js.UndefOr[ChimeArn]
  }

  object DeleteChannelBanRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        MemberArn: ChimeArn,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
    ): DeleteChannelBanRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "MemberArn" -> MemberArn.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteChannelBanRequest]
    }
  }

  @js.native
  trait DeleteChannelMembershipRequest extends js.Object {
    var ChannelArn: ChimeArn
    var MemberArn: ChimeArn
    var ChimeBearer: js.UndefOr[ChimeArn]
  }

  object DeleteChannelMembershipRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        MemberArn: ChimeArn,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
    ): DeleteChannelMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "MemberArn" -> MemberArn.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteChannelMembershipRequest]
    }
  }

  @js.native
  trait DeleteChannelMessageRequest extends js.Object {
    var ChannelArn: ChimeArn
    var MessageId: MessageId
    var ChimeBearer: js.UndefOr[ChimeArn]
  }

  object DeleteChannelMessageRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        MessageId: MessageId,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
    ): DeleteChannelMessageRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "MessageId" -> MessageId.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteChannelMessageRequest]
    }
  }

  @js.native
  trait DeleteChannelModeratorRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChannelModeratorArn: ChimeArn
    var ChimeBearer: js.UndefOr[ChimeArn]
  }

  object DeleteChannelModeratorRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChannelModeratorArn: ChimeArn,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
    ): DeleteChannelModeratorRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChannelModeratorArn" -> ChannelModeratorArn.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteChannelModeratorRequest]
    }
  }

  @js.native
  trait DeleteChannelRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: js.UndefOr[ChimeArn]
  }

  object DeleteChannelRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
    ): DeleteChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteChannelRequest]
    }
  }

  @js.native
  trait DeleteEventsConfigurationRequest extends js.Object {
    var AccountId: NonEmptyString
    var BotId: NonEmptyString
  }

  object DeleteEventsConfigurationRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        BotId: NonEmptyString
    ): DeleteEventsConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BotId" -> BotId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEventsConfigurationRequest]
    }
  }

  @js.native
  trait DeleteMediaCapturePipelineRequest extends js.Object {
    var MediaPipelineId: GuidString
  }

  object DeleteMediaCapturePipelineRequest {
    @inline
    def apply(
        MediaPipelineId: GuidString
    ): DeleteMediaCapturePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "MediaPipelineId" -> MediaPipelineId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMediaCapturePipelineRequest]
    }
  }

  @js.native
  trait DeleteMeetingRequest extends js.Object {
    var MeetingId: GuidString
  }

  object DeleteMeetingRequest {
    @inline
    def apply(
        MeetingId: GuidString
    ): DeleteMeetingRequest = {
      val __obj = js.Dynamic.literal(
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMeetingRequest]
    }
  }

  @js.native
  trait DeletePhoneNumberRequest extends js.Object {
    var PhoneNumberId: String
  }

  object DeletePhoneNumberRequest {
    @inline
    def apply(
        PhoneNumberId: String
    ): DeletePhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePhoneNumberRequest]
    }
  }

  @js.native
  trait DeleteProxySessionRequest extends js.Object {
    var ProxySessionId: NonEmptyString128
    var VoiceConnectorId: NonEmptyString128
  }

  object DeleteProxySessionRequest {
    @inline
    def apply(
        ProxySessionId: NonEmptyString128,
        VoiceConnectorId: NonEmptyString128
    ): DeleteProxySessionRequest = {
      val __obj = js.Dynamic.literal(
        "ProxySessionId" -> ProxySessionId.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteProxySessionRequest]
    }
  }

  @js.native
  trait DeleteRoomMembershipRequest extends js.Object {
    var AccountId: NonEmptyString
    var MemberId: NonEmptyString
    var RoomId: NonEmptyString
  }

  object DeleteRoomMembershipRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        MemberId: NonEmptyString,
        RoomId: NonEmptyString
    ): DeleteRoomMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "MemberId" -> MemberId.asInstanceOf[js.Any],
        "RoomId" -> RoomId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRoomMembershipRequest]
    }
  }

  @js.native
  trait DeleteRoomRequest extends js.Object {
    var AccountId: NonEmptyString
    var RoomId: NonEmptyString
  }

  object DeleteRoomRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        RoomId: NonEmptyString
    ): DeleteRoomRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "RoomId" -> RoomId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRoomRequest]
    }
  }

  @js.native
  trait DeleteSipMediaApplicationRequest extends js.Object {
    var SipMediaApplicationId: NonEmptyString
  }

  object DeleteSipMediaApplicationRequest {
    @inline
    def apply(
        SipMediaApplicationId: NonEmptyString
    ): DeleteSipMediaApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "SipMediaApplicationId" -> SipMediaApplicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSipMediaApplicationRequest]
    }
  }

  @js.native
  trait DeleteSipRuleRequest extends js.Object {
    var SipRuleId: NonEmptyString
  }

  object DeleteSipRuleRequest {
    @inline
    def apply(
        SipRuleId: NonEmptyString
    ): DeleteSipRuleRequest = {
      val __obj = js.Dynamic.literal(
        "SipRuleId" -> SipRuleId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSipRuleRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorEmergencyCallingConfigurationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object DeleteVoiceConnectorEmergencyCallingConfigurationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): DeleteVoiceConnectorEmergencyCallingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVoiceConnectorEmergencyCallingConfigurationRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorGroupRequest extends js.Object {
    var VoiceConnectorGroupId: NonEmptyString
  }

  object DeleteVoiceConnectorGroupRequest {
    @inline
    def apply(
        VoiceConnectorGroupId: NonEmptyString
    ): DeleteVoiceConnectorGroupRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorGroupId" -> VoiceConnectorGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVoiceConnectorGroupRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorOriginationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object DeleteVoiceConnectorOriginationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): DeleteVoiceConnectorOriginationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVoiceConnectorOriginationRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorProxyRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString128
  }

  object DeleteVoiceConnectorProxyRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString128
    ): DeleteVoiceConnectorProxyRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVoiceConnectorProxyRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object DeleteVoiceConnectorRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): DeleteVoiceConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVoiceConnectorRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorStreamingConfigurationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object DeleteVoiceConnectorStreamingConfigurationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): DeleteVoiceConnectorStreamingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVoiceConnectorStreamingConfigurationRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorTerminationCredentialsRequest extends js.Object {
    var Usernames: SensitiveStringList
    var VoiceConnectorId: NonEmptyString
  }

  object DeleteVoiceConnectorTerminationCredentialsRequest {
    @inline
    def apply(
        Usernames: SensitiveStringList,
        VoiceConnectorId: NonEmptyString
    ): DeleteVoiceConnectorTerminationCredentialsRequest = {
      val __obj = js.Dynamic.literal(
        "Usernames" -> Usernames.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVoiceConnectorTerminationCredentialsRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorTerminationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object DeleteVoiceConnectorTerminationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): DeleteVoiceConnectorTerminationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVoiceConnectorTerminationRequest]
    }
  }

  @js.native
  trait DescribeAppInstanceAdminRequest extends js.Object {
    var AppInstanceAdminArn: ChimeArn
    var AppInstanceArn: ChimeArn
  }

  object DescribeAppInstanceAdminRequest {
    @inline
    def apply(
        AppInstanceAdminArn: ChimeArn,
        AppInstanceArn: ChimeArn
    ): DescribeAppInstanceAdminRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceAdminArn" -> AppInstanceAdminArn.asInstanceOf[js.Any],
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAppInstanceAdminRequest]
    }
  }

  @js.native
  trait DescribeAppInstanceAdminResponse extends js.Object {
    var AppInstanceAdmin: js.UndefOr[AppInstanceAdmin]
  }

  object DescribeAppInstanceAdminResponse {
    @inline
    def apply(
        AppInstanceAdmin: js.UndefOr[AppInstanceAdmin] = js.undefined
    ): DescribeAppInstanceAdminResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceAdmin.foreach(__v => __obj.updateDynamic("AppInstanceAdmin")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAppInstanceAdminResponse]
    }
  }

  @js.native
  trait DescribeAppInstanceRequest extends js.Object {
    var AppInstanceArn: ChimeArn
  }

  object DescribeAppInstanceRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn
    ): DescribeAppInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAppInstanceRequest]
    }
  }

  @js.native
  trait DescribeAppInstanceResponse extends js.Object {
    var AppInstance: js.UndefOr[AppInstance]
  }

  object DescribeAppInstanceResponse {
    @inline
    def apply(
        AppInstance: js.UndefOr[AppInstance] = js.undefined
    ): DescribeAppInstanceResponse = {
      val __obj = js.Dynamic.literal()
      AppInstance.foreach(__v => __obj.updateDynamic("AppInstance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAppInstanceResponse]
    }
  }

  @js.native
  trait DescribeAppInstanceUserRequest extends js.Object {
    var AppInstanceUserArn: ChimeArn
  }

  object DescribeAppInstanceUserRequest {
    @inline
    def apply(
        AppInstanceUserArn: ChimeArn
    ): DescribeAppInstanceUserRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceUserArn" -> AppInstanceUserArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAppInstanceUserRequest]
    }
  }

  @js.native
  trait DescribeAppInstanceUserResponse extends js.Object {
    var AppInstanceUser: js.UndefOr[AppInstanceUser]
  }

  object DescribeAppInstanceUserResponse {
    @inline
    def apply(
        AppInstanceUser: js.UndefOr[AppInstanceUser] = js.undefined
    ): DescribeAppInstanceUserResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceUser.foreach(__v => __obj.updateDynamic("AppInstanceUser")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAppInstanceUserResponse]
    }
  }

  @js.native
  trait DescribeChannelBanRequest extends js.Object {
    var ChannelArn: ChimeArn
    var MemberArn: ChimeArn
    var ChimeBearer: js.UndefOr[ChimeArn]
  }

  object DescribeChannelBanRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        MemberArn: ChimeArn,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
    ): DescribeChannelBanRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "MemberArn" -> MemberArn.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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
  trait DescribeChannelMembershipForAppInstanceUserRequest extends js.Object {
    var AppInstanceUserArn: ChimeArn
    var ChannelArn: ChimeArn
    var ChimeBearer: js.UndefOr[ChimeArn]
  }

  object DescribeChannelMembershipForAppInstanceUserRequest {
    @inline
    def apply(
        AppInstanceUserArn: ChimeArn,
        ChannelArn: ChimeArn,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
    ): DescribeChannelMembershipForAppInstanceUserRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceUserArn" -> AppInstanceUserArn.asInstanceOf[js.Any],
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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
    var MemberArn: ChimeArn
    var ChimeBearer: js.UndefOr[ChimeArn]
  }

  object DescribeChannelMembershipRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        MemberArn: ChimeArn,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
    ): DescribeChannelMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "MemberArn" -> MemberArn.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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
    var ChimeBearer: js.UndefOr[ChimeArn]
  }

  object DescribeChannelModeratedByAppInstanceUserRequest {
    @inline
    def apply(
        AppInstanceUserArn: ChimeArn,
        ChannelArn: ChimeArn,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
    ): DescribeChannelModeratedByAppInstanceUserRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceUserArn" -> AppInstanceUserArn.asInstanceOf[js.Any],
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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
    var ChimeBearer: js.UndefOr[ChimeArn]
  }

  object DescribeChannelModeratorRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChannelModeratorArn: ChimeArn,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
    ): DescribeChannelModeratorRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ChannelModeratorArn" -> ChannelModeratorArn.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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
    var ChimeBearer: js.UndefOr[ChimeArn]
  }

  object DescribeChannelRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
    ): DescribeChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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
  trait DisassociatePhoneNumberFromUserRequest extends js.Object {
    var AccountId: String
    var UserId: String
  }

  object DisassociatePhoneNumberFromUserRequest {
    @inline
    def apply(
        AccountId: String,
        UserId: String
    ): DisassociatePhoneNumberFromUserRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociatePhoneNumberFromUserRequest]
    }
  }

  @js.native
  trait DisassociatePhoneNumberFromUserResponse extends js.Object

  object DisassociatePhoneNumberFromUserResponse {
    @inline
    def apply(): DisassociatePhoneNumberFromUserResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociatePhoneNumberFromUserResponse]
    }
  }

  @js.native
  trait DisassociatePhoneNumbersFromVoiceConnectorGroupRequest extends js.Object {
    var E164PhoneNumbers: E164PhoneNumberList
    var VoiceConnectorGroupId: NonEmptyString
  }

  object DisassociatePhoneNumbersFromVoiceConnectorGroupRequest {
    @inline
    def apply(
        E164PhoneNumbers: E164PhoneNumberList,
        VoiceConnectorGroupId: NonEmptyString
    ): DisassociatePhoneNumbersFromVoiceConnectorGroupRequest = {
      val __obj = js.Dynamic.literal(
        "E164PhoneNumbers" -> E164PhoneNumbers.asInstanceOf[js.Any],
        "VoiceConnectorGroupId" -> VoiceConnectorGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociatePhoneNumbersFromVoiceConnectorGroupRequest]
    }
  }

  @js.native
  trait DisassociatePhoneNumbersFromVoiceConnectorGroupResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  object DisassociatePhoneNumbersFromVoiceConnectorGroupResponse {
    @inline
    def apply(
        PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
    ): DisassociatePhoneNumbersFromVoiceConnectorGroupResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberErrors.foreach(__v => __obj.updateDynamic("PhoneNumberErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociatePhoneNumbersFromVoiceConnectorGroupResponse]
    }
  }

  @js.native
  trait DisassociatePhoneNumbersFromVoiceConnectorRequest extends js.Object {
    var E164PhoneNumbers: E164PhoneNumberList
    var VoiceConnectorId: NonEmptyString
  }

  object DisassociatePhoneNumbersFromVoiceConnectorRequest {
    @inline
    def apply(
        E164PhoneNumbers: E164PhoneNumberList,
        VoiceConnectorId: NonEmptyString
    ): DisassociatePhoneNumbersFromVoiceConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "E164PhoneNumbers" -> E164PhoneNumbers.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociatePhoneNumbersFromVoiceConnectorRequest]
    }
  }

  @js.native
  trait DisassociatePhoneNumbersFromVoiceConnectorResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  object DisassociatePhoneNumbersFromVoiceConnectorResponse {
    @inline
    def apply(
        PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
    ): DisassociatePhoneNumbersFromVoiceConnectorResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberErrors.foreach(__v => __obj.updateDynamic("PhoneNumberErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociatePhoneNumbersFromVoiceConnectorResponse]
    }
  }

  @js.native
  trait DisassociateSigninDelegateGroupsFromAccountRequest extends js.Object {
    var AccountId: NonEmptyString
    var GroupNames: NonEmptyStringList
  }

  object DisassociateSigninDelegateGroupsFromAccountRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        GroupNames: NonEmptyStringList
    ): DisassociateSigninDelegateGroupsFromAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "GroupNames" -> GroupNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateSigninDelegateGroupsFromAccountRequest]
    }
  }

  @js.native
  trait DisassociateSigninDelegateGroupsFromAccountResponse extends js.Object

  object DisassociateSigninDelegateGroupsFromAccountResponse {
    @inline
    def apply(): DisassociateSigninDelegateGroupsFromAccountResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateSigninDelegateGroupsFromAccountResponse]
    }
  }

  /** The emergency calling configuration details associated with an Amazon Chime Voice Connector.
    */
  @js.native
  trait EmergencyCallingConfiguration extends js.Object {
    var DNIS: js.UndefOr[DNISEmergencyCallingConfigurationList]
  }

  object EmergencyCallingConfiguration {
    @inline
    def apply(
        DNIS: js.UndefOr[DNISEmergencyCallingConfigurationList] = js.undefined
    ): EmergencyCallingConfiguration = {
      val __obj = js.Dynamic.literal()
      DNIS.foreach(__v => __obj.updateDynamic("DNIS")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmergencyCallingConfiguration]
    }
  }

  /** Settings specific to the Amazon Transcribe Medical engine.
    */
  @js.native
  trait EngineTranscribeMedicalSettings extends js.Object {
    var LanguageCode: TranscribeMedicalLanguageCode
    var Specialty: TranscribeMedicalSpecialty
    var Type: TranscribeMedicalType
    var ContentIdentificationType: js.UndefOr[TranscribeMedicalContentIdentificationType]
    var Region: js.UndefOr[TranscribeMedicalRegion]
    var VocabularyName: js.UndefOr[String]
  }

  object EngineTranscribeMedicalSettings {
    @inline
    def apply(
        LanguageCode: TranscribeMedicalLanguageCode,
        Specialty: TranscribeMedicalSpecialty,
        Type: TranscribeMedicalType,
        ContentIdentificationType: js.UndefOr[TranscribeMedicalContentIdentificationType] = js.undefined,
        Region: js.UndefOr[TranscribeMedicalRegion] = js.undefined,
        VocabularyName: js.UndefOr[String] = js.undefined
    ): EngineTranscribeMedicalSettings = {
      val __obj = js.Dynamic.literal(
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any],
        "Specialty" -> Specialty.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      ContentIdentificationType.foreach(__v => __obj.updateDynamic("ContentIdentificationType")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      VocabularyName.foreach(__v => __obj.updateDynamic("VocabularyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EngineTranscribeMedicalSettings]
    }
  }

  /** Settings specific to the Amazon Transcribe engine.
    */
  @js.native
  trait EngineTranscribeSettings extends js.Object {
    var LanguageCode: TranscribeLanguageCode
    var ContentIdentificationType: js.UndefOr[TranscribeContentIdentificationType]
    var ContentRedactionType: js.UndefOr[TranscribeContentRedactionType]
    var EnablePartialResultsStabilization: js.UndefOr[Boolean]
    var LanguageModelName: js.UndefOr[TranscribeLanguageModelName]
    var PartialResultsStability: js.UndefOr[TranscribePartialResultsStability]
    var PiiEntityTypes: js.UndefOr[TranscribePiiEntityTypes]
    var Region: js.UndefOr[TranscribeRegion]
    var VocabularyFilterMethod: js.UndefOr[TranscribeVocabularyFilterMethod]
    var VocabularyFilterName: js.UndefOr[String]
    var VocabularyName: js.UndefOr[String]
  }

  object EngineTranscribeSettings {
    @inline
    def apply(
        LanguageCode: TranscribeLanguageCode,
        ContentIdentificationType: js.UndefOr[TranscribeContentIdentificationType] = js.undefined,
        ContentRedactionType: js.UndefOr[TranscribeContentRedactionType] = js.undefined,
        EnablePartialResultsStabilization: js.UndefOr[Boolean] = js.undefined,
        LanguageModelName: js.UndefOr[TranscribeLanguageModelName] = js.undefined,
        PartialResultsStability: js.UndefOr[TranscribePartialResultsStability] = js.undefined,
        PiiEntityTypes: js.UndefOr[TranscribePiiEntityTypes] = js.undefined,
        Region: js.UndefOr[TranscribeRegion] = js.undefined,
        VocabularyFilterMethod: js.UndefOr[TranscribeVocabularyFilterMethod] = js.undefined,
        VocabularyFilterName: js.UndefOr[String] = js.undefined,
        VocabularyName: js.UndefOr[String] = js.undefined
    ): EngineTranscribeSettings = {
      val __obj = js.Dynamic.literal(
        "LanguageCode" -> LanguageCode.asInstanceOf[js.Any]
      )

      ContentIdentificationType.foreach(__v => __obj.updateDynamic("ContentIdentificationType")(__v.asInstanceOf[js.Any]))
      ContentRedactionType.foreach(__v => __obj.updateDynamic("ContentRedactionType")(__v.asInstanceOf[js.Any]))
      EnablePartialResultsStabilization.foreach(__v => __obj.updateDynamic("EnablePartialResultsStabilization")(__v.asInstanceOf[js.Any]))
      LanguageModelName.foreach(__v => __obj.updateDynamic("LanguageModelName")(__v.asInstanceOf[js.Any]))
      PartialResultsStability.foreach(__v => __obj.updateDynamic("PartialResultsStability")(__v.asInstanceOf[js.Any]))
      PiiEntityTypes.foreach(__v => __obj.updateDynamic("PiiEntityTypes")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      VocabularyFilterMethod.foreach(__v => __obj.updateDynamic("VocabularyFilterMethod")(__v.asInstanceOf[js.Any]))
      VocabularyFilterName.foreach(__v => __obj.updateDynamic("VocabularyFilterName")(__v.asInstanceOf[js.Any]))
      VocabularyName.foreach(__v => __obj.updateDynamic("VocabularyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EngineTranscribeSettings]
    }
  }

  /** The configuration that allows a bot to receive outgoing events. Can be either an HTTPS endpoint or a Lambda function ARN.
    */
  @js.native
  trait EventsConfiguration extends js.Object {
    var BotId: js.UndefOr[String]
    var LambdaFunctionArn: js.UndefOr[SensitiveString]
    var OutboundEventsHTTPSEndpoint: js.UndefOr[SensitiveString]
  }

  object EventsConfiguration {
    @inline
    def apply(
        BotId: js.UndefOr[String] = js.undefined,
        LambdaFunctionArn: js.UndefOr[SensitiveString] = js.undefined,
        OutboundEventsHTTPSEndpoint: js.UndefOr[SensitiveString] = js.undefined
    ): EventsConfiguration = {
      val __obj = js.Dynamic.literal()
      BotId.foreach(__v => __obj.updateDynamic("BotId")(__v.asInstanceOf[js.Any]))
      LambdaFunctionArn.foreach(__v => __obj.updateDynamic("LambdaFunctionArn")(__v.asInstanceOf[js.Any]))
      OutboundEventsHTTPSEndpoint.foreach(__v => __obj.updateDynamic("OutboundEventsHTTPSEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventsConfiguration]
    }
  }

  /** The country and area code for a proxy phone number in a proxy phone session.
    */
  @js.native
  trait GeoMatchParams extends js.Object {
    var AreaCode: AreaCode
    var Country: Country
  }

  object GeoMatchParams {
    @inline
    def apply(
        AreaCode: AreaCode,
        Country: Country
    ): GeoMatchParams = {
      val __obj = js.Dynamic.literal(
        "AreaCode" -> AreaCode.asInstanceOf[js.Any],
        "Country" -> Country.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GeoMatchParams]
    }
  }

  @js.native
  trait GetAccountRequest extends js.Object {
    var AccountId: NonEmptyString
  }

  object GetAccountRequest {
    @inline
    def apply(
        AccountId: NonEmptyString
    ): GetAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAccountRequest]
    }
  }

  @js.native
  trait GetAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  object GetAccountResponse {
    @inline
    def apply(
        Account: js.UndefOr[Account] = js.undefined
    ): GetAccountResponse = {
      val __obj = js.Dynamic.literal()
      Account.foreach(__v => __obj.updateDynamic("Account")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccountResponse]
    }
  }

  @js.native
  trait GetAccountSettingsRequest extends js.Object {
    var AccountId: NonEmptyString
  }

  object GetAccountSettingsRequest {
    @inline
    def apply(
        AccountId: NonEmptyString
    ): GetAccountSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAccountSettingsRequest]
    }
  }

  @js.native
  trait GetAccountSettingsResponse extends js.Object {
    var AccountSettings: js.UndefOr[AccountSettings]
  }

  object GetAccountSettingsResponse {
    @inline
    def apply(
        AccountSettings: js.UndefOr[AccountSettings] = js.undefined
    ): GetAccountSettingsResponse = {
      val __obj = js.Dynamic.literal()
      AccountSettings.foreach(__v => __obj.updateDynamic("AccountSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccountSettingsResponse]
    }
  }

  @js.native
  trait GetAppInstanceRetentionSettingsRequest extends js.Object {
    var AppInstanceArn: ChimeArn
  }

  object GetAppInstanceRetentionSettingsRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn
    ): GetAppInstanceRetentionSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAppInstanceRetentionSettingsRequest]
    }
  }

  @js.native
  trait GetAppInstanceRetentionSettingsResponse extends js.Object {
    var AppInstanceRetentionSettings: js.UndefOr[AppInstanceRetentionSettings]
    var InitiateDeletionTimestamp: js.UndefOr[Timestamp]
  }

  object GetAppInstanceRetentionSettingsResponse {
    @inline
    def apply(
        AppInstanceRetentionSettings: js.UndefOr[AppInstanceRetentionSettings] = js.undefined,
        InitiateDeletionTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): GetAppInstanceRetentionSettingsResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceRetentionSettings.foreach(__v => __obj.updateDynamic("AppInstanceRetentionSettings")(__v.asInstanceOf[js.Any]))
      InitiateDeletionTimestamp.foreach(__v => __obj.updateDynamic("InitiateDeletionTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppInstanceRetentionSettingsResponse]
    }
  }

  @js.native
  trait GetAppInstanceStreamingConfigurationsRequest extends js.Object {
    var AppInstanceArn: ChimeArn
  }

  object GetAppInstanceStreamingConfigurationsRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn
    ): GetAppInstanceStreamingConfigurationsRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAppInstanceStreamingConfigurationsRequest]
    }
  }

  @js.native
  trait GetAppInstanceStreamingConfigurationsResponse extends js.Object {
    var AppInstanceStreamingConfigurations: js.UndefOr[AppInstanceStreamingConfigurationList]
  }

  object GetAppInstanceStreamingConfigurationsResponse {
    @inline
    def apply(
        AppInstanceStreamingConfigurations: js.UndefOr[AppInstanceStreamingConfigurationList] = js.undefined
    ): GetAppInstanceStreamingConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceStreamingConfigurations.foreach(__v => __obj.updateDynamic("AppInstanceStreamingConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAppInstanceStreamingConfigurationsResponse]
    }
  }

  @js.native
  trait GetAttendeeRequest extends js.Object {
    var AttendeeId: GuidString
    var MeetingId: GuidString
  }

  object GetAttendeeRequest {
    @inline
    def apply(
        AttendeeId: GuidString,
        MeetingId: GuidString
    ): GetAttendeeRequest = {
      val __obj = js.Dynamic.literal(
        "AttendeeId" -> AttendeeId.asInstanceOf[js.Any],
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAttendeeRequest]
    }
  }

  @js.native
  trait GetAttendeeResponse extends js.Object {
    var Attendee: js.UndefOr[Attendee]
  }

  object GetAttendeeResponse {
    @inline
    def apply(
        Attendee: js.UndefOr[Attendee] = js.undefined
    ): GetAttendeeResponse = {
      val __obj = js.Dynamic.literal()
      Attendee.foreach(__v => __obj.updateDynamic("Attendee")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAttendeeResponse]
    }
  }

  @js.native
  trait GetBotRequest extends js.Object {
    var AccountId: NonEmptyString
    var BotId: NonEmptyString
  }

  object GetBotRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        BotId: NonEmptyString
    ): GetBotRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BotId" -> BotId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBotRequest]
    }
  }

  @js.native
  trait GetBotResponse extends js.Object {
    var Bot: js.UndefOr[Bot]
  }

  object GetBotResponse {
    @inline
    def apply(
        Bot: js.UndefOr[Bot] = js.undefined
    ): GetBotResponse = {
      val __obj = js.Dynamic.literal()
      Bot.foreach(__v => __obj.updateDynamic("Bot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBotResponse]
    }
  }

  @js.native
  trait GetChannelMessageRequest extends js.Object {
    var ChannelArn: ChimeArn
    var MessageId: MessageId
    var ChimeBearer: js.UndefOr[ChimeArn]
  }

  object GetChannelMessageRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        MessageId: MessageId,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
    ): GetChannelMessageRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "MessageId" -> MessageId.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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
  trait GetEventsConfigurationRequest extends js.Object {
    var AccountId: NonEmptyString
    var BotId: NonEmptyString
  }

  object GetEventsConfigurationRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        BotId: NonEmptyString
    ): GetEventsConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BotId" -> BotId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEventsConfigurationRequest]
    }
  }

  @js.native
  trait GetEventsConfigurationResponse extends js.Object {
    var EventsConfiguration: js.UndefOr[EventsConfiguration]
  }

  object GetEventsConfigurationResponse {
    @inline
    def apply(
        EventsConfiguration: js.UndefOr[EventsConfiguration] = js.undefined
    ): GetEventsConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      EventsConfiguration.foreach(__v => __obj.updateDynamic("EventsConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEventsConfigurationResponse]
    }
  }

  @js.native
  trait GetGlobalSettingsResponse extends js.Object {
    var BusinessCalling: js.UndefOr[BusinessCallingSettings]
    var VoiceConnector: js.UndefOr[VoiceConnectorSettings]
  }

  object GetGlobalSettingsResponse {
    @inline
    def apply(
        BusinessCalling: js.UndefOr[BusinessCallingSettings] = js.undefined,
        VoiceConnector: js.UndefOr[VoiceConnectorSettings] = js.undefined
    ): GetGlobalSettingsResponse = {
      val __obj = js.Dynamic.literal()
      BusinessCalling.foreach(__v => __obj.updateDynamic("BusinessCalling")(__v.asInstanceOf[js.Any]))
      VoiceConnector.foreach(__v => __obj.updateDynamic("VoiceConnector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGlobalSettingsResponse]
    }
  }

  @js.native
  trait GetMediaCapturePipelineRequest extends js.Object {
    var MediaPipelineId: GuidString
  }

  object GetMediaCapturePipelineRequest {
    @inline
    def apply(
        MediaPipelineId: GuidString
    ): GetMediaCapturePipelineRequest = {
      val __obj = js.Dynamic.literal(
        "MediaPipelineId" -> MediaPipelineId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMediaCapturePipelineRequest]
    }
  }

  @js.native
  trait GetMediaCapturePipelineResponse extends js.Object {
    var MediaCapturePipeline: js.UndefOr[MediaCapturePipeline]
  }

  object GetMediaCapturePipelineResponse {
    @inline
    def apply(
        MediaCapturePipeline: js.UndefOr[MediaCapturePipeline] = js.undefined
    ): GetMediaCapturePipelineResponse = {
      val __obj = js.Dynamic.literal()
      MediaCapturePipeline.foreach(__v => __obj.updateDynamic("MediaCapturePipeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMediaCapturePipelineResponse]
    }
  }

  @js.native
  trait GetMeetingRequest extends js.Object {
    var MeetingId: GuidString
  }

  object GetMeetingRequest {
    @inline
    def apply(
        MeetingId: GuidString
    ): GetMeetingRequest = {
      val __obj = js.Dynamic.literal(
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMeetingRequest]
    }
  }

  @js.native
  trait GetMeetingResponse extends js.Object {
    var Meeting: js.UndefOr[Meeting]
  }

  object GetMeetingResponse {
    @inline
    def apply(
        Meeting: js.UndefOr[Meeting] = js.undefined
    ): GetMeetingResponse = {
      val __obj = js.Dynamic.literal()
      Meeting.foreach(__v => __obj.updateDynamic("Meeting")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMeetingResponse]
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

  @js.native
  trait GetPhoneNumberOrderRequest extends js.Object {
    var PhoneNumberOrderId: GuidString
  }

  object GetPhoneNumberOrderRequest {
    @inline
    def apply(
        PhoneNumberOrderId: GuidString
    ): GetPhoneNumberOrderRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberOrderId" -> PhoneNumberOrderId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPhoneNumberOrderRequest]
    }
  }

  @js.native
  trait GetPhoneNumberOrderResponse extends js.Object {
    var PhoneNumberOrder: js.UndefOr[PhoneNumberOrder]
  }

  object GetPhoneNumberOrderResponse {
    @inline
    def apply(
        PhoneNumberOrder: js.UndefOr[PhoneNumberOrder] = js.undefined
    ): GetPhoneNumberOrderResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberOrder.foreach(__v => __obj.updateDynamic("PhoneNumberOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPhoneNumberOrderResponse]
    }
  }

  @js.native
  trait GetPhoneNumberRequest extends js.Object {
    var PhoneNumberId: String
  }

  object GetPhoneNumberRequest {
    @inline
    def apply(
        PhoneNumberId: String
    ): GetPhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPhoneNumberRequest]
    }
  }

  @js.native
  trait GetPhoneNumberResponse extends js.Object {
    var PhoneNumber: js.UndefOr[PhoneNumber]
  }

  object GetPhoneNumberResponse {
    @inline
    def apply(
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): GetPhoneNumberResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPhoneNumberResponse]
    }
  }

  @js.native
  trait GetPhoneNumberSettingsResponse extends js.Object {
    var CallingName: js.UndefOr[CallingName]
    var CallingNameUpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  object GetPhoneNumberSettingsResponse {
    @inline
    def apply(
        CallingName: js.UndefOr[CallingName] = js.undefined,
        CallingNameUpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): GetPhoneNumberSettingsResponse = {
      val __obj = js.Dynamic.literal()
      CallingName.foreach(__v => __obj.updateDynamic("CallingName")(__v.asInstanceOf[js.Any]))
      CallingNameUpdatedTimestamp.foreach(__v => __obj.updateDynamic("CallingNameUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPhoneNumberSettingsResponse]
    }
  }

  @js.native
  trait GetProxySessionRequest extends js.Object {
    var ProxySessionId: NonEmptyString128
    var VoiceConnectorId: NonEmptyString128
  }

  object GetProxySessionRequest {
    @inline
    def apply(
        ProxySessionId: NonEmptyString128,
        VoiceConnectorId: NonEmptyString128
    ): GetProxySessionRequest = {
      val __obj = js.Dynamic.literal(
        "ProxySessionId" -> ProxySessionId.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetProxySessionRequest]
    }
  }

  @js.native
  trait GetProxySessionResponse extends js.Object {
    var ProxySession: js.UndefOr[ProxySession]
  }

  object GetProxySessionResponse {
    @inline
    def apply(
        ProxySession: js.UndefOr[ProxySession] = js.undefined
    ): GetProxySessionResponse = {
      val __obj = js.Dynamic.literal()
      ProxySession.foreach(__v => __obj.updateDynamic("ProxySession")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProxySessionResponse]
    }
  }

  @js.native
  trait GetRetentionSettingsRequest extends js.Object {
    var AccountId: NonEmptyString
  }

  object GetRetentionSettingsRequest {
    @inline
    def apply(
        AccountId: NonEmptyString
    ): GetRetentionSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRetentionSettingsRequest]
    }
  }

  @js.native
  trait GetRetentionSettingsResponse extends js.Object {
    var InitiateDeletionTimestamp: js.UndefOr[Iso8601Timestamp]
    var RetentionSettings: js.UndefOr[RetentionSettings]
  }

  object GetRetentionSettingsResponse {
    @inline
    def apply(
        InitiateDeletionTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        RetentionSettings: js.UndefOr[RetentionSettings] = js.undefined
    ): GetRetentionSettingsResponse = {
      val __obj = js.Dynamic.literal()
      InitiateDeletionTimestamp.foreach(__v => __obj.updateDynamic("InitiateDeletionTimestamp")(__v.asInstanceOf[js.Any]))
      RetentionSettings.foreach(__v => __obj.updateDynamic("RetentionSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRetentionSettingsResponse]
    }
  }

  @js.native
  trait GetRoomRequest extends js.Object {
    var AccountId: NonEmptyString
    var RoomId: NonEmptyString
  }

  object GetRoomRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        RoomId: NonEmptyString
    ): GetRoomRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "RoomId" -> RoomId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRoomRequest]
    }
  }

  @js.native
  trait GetRoomResponse extends js.Object {
    var Room: js.UndefOr[Room]
  }

  object GetRoomResponse {
    @inline
    def apply(
        Room: js.UndefOr[Room] = js.undefined
    ): GetRoomResponse = {
      val __obj = js.Dynamic.literal()
      Room.foreach(__v => __obj.updateDynamic("Room")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRoomResponse]
    }
  }

  @js.native
  trait GetSipMediaApplicationLoggingConfigurationRequest extends js.Object {
    var SipMediaApplicationId: NonEmptyString
  }

  object GetSipMediaApplicationLoggingConfigurationRequest {
    @inline
    def apply(
        SipMediaApplicationId: NonEmptyString
    ): GetSipMediaApplicationLoggingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "SipMediaApplicationId" -> SipMediaApplicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSipMediaApplicationLoggingConfigurationRequest]
    }
  }

  @js.native
  trait GetSipMediaApplicationLoggingConfigurationResponse extends js.Object {
    var SipMediaApplicationLoggingConfiguration: js.UndefOr[SipMediaApplicationLoggingConfiguration]
  }

  object GetSipMediaApplicationLoggingConfigurationResponse {
    @inline
    def apply(
        SipMediaApplicationLoggingConfiguration: js.UndefOr[SipMediaApplicationLoggingConfiguration] = js.undefined
    ): GetSipMediaApplicationLoggingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      SipMediaApplicationLoggingConfiguration.foreach(__v => __obj.updateDynamic("SipMediaApplicationLoggingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSipMediaApplicationLoggingConfigurationResponse]
    }
  }

  @js.native
  trait GetSipMediaApplicationRequest extends js.Object {
    var SipMediaApplicationId: NonEmptyString
  }

  object GetSipMediaApplicationRequest {
    @inline
    def apply(
        SipMediaApplicationId: NonEmptyString
    ): GetSipMediaApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "SipMediaApplicationId" -> SipMediaApplicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSipMediaApplicationRequest]
    }
  }

  @js.native
  trait GetSipMediaApplicationResponse extends js.Object {
    var SipMediaApplication: js.UndefOr[SipMediaApplication]
  }

  object GetSipMediaApplicationResponse {
    @inline
    def apply(
        SipMediaApplication: js.UndefOr[SipMediaApplication] = js.undefined
    ): GetSipMediaApplicationResponse = {
      val __obj = js.Dynamic.literal()
      SipMediaApplication.foreach(__v => __obj.updateDynamic("SipMediaApplication")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSipMediaApplicationResponse]
    }
  }

  @js.native
  trait GetSipRuleRequest extends js.Object {
    var SipRuleId: NonEmptyString
  }

  object GetSipRuleRequest {
    @inline
    def apply(
        SipRuleId: NonEmptyString
    ): GetSipRuleRequest = {
      val __obj = js.Dynamic.literal(
        "SipRuleId" -> SipRuleId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSipRuleRequest]
    }
  }

  @js.native
  trait GetSipRuleResponse extends js.Object {
    var SipRule: js.UndefOr[SipRule]
  }

  object GetSipRuleResponse {
    @inline
    def apply(
        SipRule: js.UndefOr[SipRule] = js.undefined
    ): GetSipRuleResponse = {
      val __obj = js.Dynamic.literal()
      SipRule.foreach(__v => __obj.updateDynamic("SipRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSipRuleResponse]
    }
  }

  @js.native
  trait GetUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserId: NonEmptyString
  }

  object GetUserRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        UserId: NonEmptyString
    ): GetUserRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetUserRequest]
    }
  }

  @js.native
  trait GetUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object GetUserResponse {
    @inline
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): GetUserResponse = {
      val __obj = js.Dynamic.literal()
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserResponse]
    }
  }

  @js.native
  trait GetUserSettingsRequest extends js.Object {
    var AccountId: String
    var UserId: String
  }

  object GetUserSettingsRequest {
    @inline
    def apply(
        AccountId: String,
        UserId: String
    ): GetUserSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetUserSettingsRequest]
    }
  }

  @js.native
  trait GetUserSettingsResponse extends js.Object {
    var UserSettings: js.UndefOr[UserSettings]
  }

  object GetUserSettingsResponse {
    @inline
    def apply(
        UserSettings: js.UndefOr[UserSettings] = js.undefined
    ): GetUserSettingsResponse = {
      val __obj = js.Dynamic.literal()
      UserSettings.foreach(__v => __obj.updateDynamic("UserSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUserSettingsResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorEmergencyCallingConfigurationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorEmergencyCallingConfigurationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorEmergencyCallingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVoiceConnectorEmergencyCallingConfigurationRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorEmergencyCallingConfigurationResponse extends js.Object {
    var EmergencyCallingConfiguration: js.UndefOr[EmergencyCallingConfiguration]
  }

  object GetVoiceConnectorEmergencyCallingConfigurationResponse {
    @inline
    def apply(
        EmergencyCallingConfiguration: js.UndefOr[EmergencyCallingConfiguration] = js.undefined
    ): GetVoiceConnectorEmergencyCallingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      EmergencyCallingConfiguration.foreach(__v => __obj.updateDynamic("EmergencyCallingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorEmergencyCallingConfigurationResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorGroupRequest extends js.Object {
    var VoiceConnectorGroupId: NonEmptyString
  }

  object GetVoiceConnectorGroupRequest {
    @inline
    def apply(
        VoiceConnectorGroupId: NonEmptyString
    ): GetVoiceConnectorGroupRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorGroupId" -> VoiceConnectorGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVoiceConnectorGroupRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorGroupResponse extends js.Object {
    var VoiceConnectorGroup: js.UndefOr[VoiceConnectorGroup]
  }

  object GetVoiceConnectorGroupResponse {
    @inline
    def apply(
        VoiceConnectorGroup: js.UndefOr[VoiceConnectorGroup] = js.undefined
    ): GetVoiceConnectorGroupResponse = {
      val __obj = js.Dynamic.literal()
      VoiceConnectorGroup.foreach(__v => __obj.updateDynamic("VoiceConnectorGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorGroupResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorLoggingConfigurationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorLoggingConfigurationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorLoggingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVoiceConnectorLoggingConfigurationRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorLoggingConfigurationResponse extends js.Object {
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration]
  }

  object GetVoiceConnectorLoggingConfigurationResponse {
    @inline
    def apply(
        LoggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined
    ): GetVoiceConnectorLoggingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      LoggingConfiguration.foreach(__v => __obj.updateDynamic("LoggingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorLoggingConfigurationResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorOriginationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorOriginationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorOriginationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVoiceConnectorOriginationRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorOriginationResponse extends js.Object {
    var Origination: js.UndefOr[Origination]
  }

  object GetVoiceConnectorOriginationResponse {
    @inline
    def apply(
        Origination: js.UndefOr[Origination] = js.undefined
    ): GetVoiceConnectorOriginationResponse = {
      val __obj = js.Dynamic.literal()
      Origination.foreach(__v => __obj.updateDynamic("Origination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorOriginationResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorProxyRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString128
  }

  object GetVoiceConnectorProxyRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString128
    ): GetVoiceConnectorProxyRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVoiceConnectorProxyRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorProxyResponse extends js.Object {
    var Proxy: js.UndefOr[Proxy]
  }

  object GetVoiceConnectorProxyResponse {
    @inline
    def apply(
        Proxy: js.UndefOr[Proxy] = js.undefined
    ): GetVoiceConnectorProxyResponse = {
      val __obj = js.Dynamic.literal()
      Proxy.foreach(__v => __obj.updateDynamic("Proxy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorProxyResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVoiceConnectorRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorResponse extends js.Object {
    var VoiceConnector: js.UndefOr[VoiceConnector]
  }

  object GetVoiceConnectorResponse {
    @inline
    def apply(
        VoiceConnector: js.UndefOr[VoiceConnector] = js.undefined
    ): GetVoiceConnectorResponse = {
      val __obj = js.Dynamic.literal()
      VoiceConnector.foreach(__v => __obj.updateDynamic("VoiceConnector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorStreamingConfigurationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorStreamingConfigurationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorStreamingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVoiceConnectorStreamingConfigurationRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorStreamingConfigurationResponse extends js.Object {
    var StreamingConfiguration: js.UndefOr[StreamingConfiguration]
  }

  object GetVoiceConnectorStreamingConfigurationResponse {
    @inline
    def apply(
        StreamingConfiguration: js.UndefOr[StreamingConfiguration] = js.undefined
    ): GetVoiceConnectorStreamingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      StreamingConfiguration.foreach(__v => __obj.updateDynamic("StreamingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorStreamingConfigurationResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorTerminationHealthRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorTerminationHealthRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorTerminationHealthRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVoiceConnectorTerminationHealthRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorTerminationHealthResponse extends js.Object {
    var TerminationHealth: js.UndefOr[TerminationHealth]
  }

  object GetVoiceConnectorTerminationHealthResponse {
    @inline
    def apply(
        TerminationHealth: js.UndefOr[TerminationHealth] = js.undefined
    ): GetVoiceConnectorTerminationHealthResponse = {
      val __obj = js.Dynamic.literal()
      TerminationHealth.foreach(__v => __obj.updateDynamic("TerminationHealth")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorTerminationHealthResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorTerminationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorTerminationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorTerminationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVoiceConnectorTerminationRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorTerminationResponse extends js.Object {
    var Termination: js.UndefOr[Termination]
  }

  object GetVoiceConnectorTerminationResponse {
    @inline
    def apply(
        Termination: js.UndefOr[Termination] = js.undefined
    ): GetVoiceConnectorTerminationResponse = {
      val __obj = js.Dynamic.literal()
      Termination.foreach(__v => __obj.updateDynamic("Termination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorTerminationResponse]
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

  /** Invitation object returned after emailing users to invite them to join the Amazon Chime <code>Team</code> account.
    */
  @js.native
  trait Invite extends js.Object {
    var EmailAddress: js.UndefOr[EmailAddress]
    var EmailStatus: js.UndefOr[EmailStatus]
    var InviteId: js.UndefOr[String]
    var Status: js.UndefOr[InviteStatus]
  }

  object Invite {
    @inline
    def apply(
        EmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        EmailStatus: js.UndefOr[EmailStatus] = js.undefined,
        InviteId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[InviteStatus] = js.undefined
    ): Invite = {
      val __obj = js.Dynamic.literal()
      EmailAddress.foreach(__v => __obj.updateDynamic("EmailAddress")(__v.asInstanceOf[js.Any]))
      EmailStatus.foreach(__v => __obj.updateDynamic("EmailStatus")(__v.asInstanceOf[js.Any]))
      InviteId.foreach(__v => __obj.updateDynamic("InviteId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Invite]
    }
  }

  @js.native
  trait InviteUsersRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserEmailList: UserEmailList
    var UserType: js.UndefOr[UserType]
  }

  object InviteUsersRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        UserEmailList: UserEmailList,
        UserType: js.UndefOr[UserType] = js.undefined
    ): InviteUsersRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserEmailList" -> UserEmailList.asInstanceOf[js.Any]
      )

      UserType.foreach(__v => __obj.updateDynamic("UserType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InviteUsersRequest]
    }
  }

  @js.native
  trait InviteUsersResponse extends js.Object {
    var Invites: js.UndefOr[InviteList]
  }

  object InviteUsersResponse {
    @inline
    def apply(
        Invites: js.UndefOr[InviteList] = js.undefined
    ): InviteUsersResponse = {
      val __obj = js.Dynamic.literal()
      Invites.foreach(__v => __obj.updateDynamic("Invites")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InviteUsersResponse]
    }
  }

  @js.native
  trait ListAccountsRequest extends js.Object {
    var MaxResults: js.UndefOr[ProfileServiceMaxResults]
    var Name: js.UndefOr[AccountName]
    var NextToken: js.UndefOr[String]
    var UserEmail: js.UndefOr[EmailAddress]
  }

  object ListAccountsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined,
        Name: js.UndefOr[AccountName] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        UserEmail: js.UndefOr[EmailAddress] = js.undefined
    ): ListAccountsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UserEmail.foreach(__v => __obj.updateDynamic("UserEmail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountsRequest]
    }
  }

  @js.native
  trait ListAccountsResponse extends js.Object {
    var Accounts: js.UndefOr[AccountList]
    var NextToken: js.UndefOr[String]
  }

  object ListAccountsResponse {
    @inline
    def apply(
        Accounts: js.UndefOr[AccountList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListAccountsResponse = {
      val __obj = js.Dynamic.literal()
      Accounts.foreach(__v => __obj.updateDynamic("Accounts")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountsResponse]
    }
  }

  @js.native
  trait ListAppInstanceAdminsRequest extends js.Object {
    var AppInstanceArn: ChimeArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAppInstanceAdminsRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppInstanceAdminsRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppInstanceAdminsRequest]
    }
  }

  @js.native
  trait ListAppInstanceAdminsResponse extends js.Object {
    var AppInstanceAdmins: js.UndefOr[AppInstanceAdminList]
    var AppInstanceArn: js.UndefOr[ChimeArn]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAppInstanceAdminsResponse {
    @inline
    def apply(
        AppInstanceAdmins: js.UndefOr[AppInstanceAdminList] = js.undefined,
        AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppInstanceAdminsResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceAdmins.foreach(__v => __obj.updateDynamic("AppInstanceAdmins")(__v.asInstanceOf[js.Any]))
      AppInstanceArn.foreach(__v => __obj.updateDynamic("AppInstanceArn")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppInstanceAdminsResponse]
    }
  }

  @js.native
  trait ListAppInstanceUsersRequest extends js.Object {
    var AppInstanceArn: ChimeArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAppInstanceUsersRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppInstanceUsersRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppInstanceUsersRequest]
    }
  }

  @js.native
  trait ListAppInstanceUsersResponse extends js.Object {
    var AppInstanceArn: js.UndefOr[ChimeArn]
    var AppInstanceUsers: js.UndefOr[AppInstanceUserList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAppInstanceUsersResponse {
    @inline
    def apply(
        AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined,
        AppInstanceUsers: js.UndefOr[AppInstanceUserList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppInstanceUsersResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceArn.foreach(__v => __obj.updateDynamic("AppInstanceArn")(__v.asInstanceOf[js.Any]))
      AppInstanceUsers.foreach(__v => __obj.updateDynamic("AppInstanceUsers")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppInstanceUsersResponse]
    }
  }

  @js.native
  trait ListAppInstancesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAppInstancesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppInstancesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppInstancesRequest]
    }
  }

  @js.native
  trait ListAppInstancesResponse extends js.Object {
    var AppInstances: js.UndefOr[AppInstanceList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAppInstancesResponse {
    @inline
    def apply(
        AppInstances: js.UndefOr[AppInstanceList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppInstancesResponse = {
      val __obj = js.Dynamic.literal()
      AppInstances.foreach(__v => __obj.updateDynamic("AppInstances")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppInstancesResponse]
    }
  }

  @js.native
  trait ListAttendeeTagsRequest extends js.Object {
    var AttendeeId: GuidString
    var MeetingId: GuidString
  }

  object ListAttendeeTagsRequest {
    @inline
    def apply(
        AttendeeId: GuidString,
        MeetingId: GuidString
    ): ListAttendeeTagsRequest = {
      val __obj = js.Dynamic.literal(
        "AttendeeId" -> AttendeeId.asInstanceOf[js.Any],
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListAttendeeTagsRequest]
    }
  }

  @js.native
  trait ListAttendeeTagsResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListAttendeeTagsResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListAttendeeTagsResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttendeeTagsResponse]
    }
  }

  @js.native
  trait ListAttendeesRequest extends js.Object {
    var MeetingId: GuidString
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  object ListAttendeesRequest {
    @inline
    def apply(
        MeetingId: GuidString,
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListAttendeesRequest = {
      val __obj = js.Dynamic.literal(
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttendeesRequest]
    }
  }

  @js.native
  trait ListAttendeesResponse extends js.Object {
    var Attendees: js.UndefOr[AttendeeList]
    var NextToken: js.UndefOr[String]
  }

  object ListAttendeesResponse {
    @inline
    def apply(
        Attendees: js.UndefOr[AttendeeList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListAttendeesResponse = {
      val __obj = js.Dynamic.literal()
      Attendees.foreach(__v => __obj.updateDynamic("Attendees")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttendeesResponse]
    }
  }

  @js.native
  trait ListBotsRequest extends js.Object {
    var AccountId: NonEmptyString
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  object ListBotsRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListBotsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBotsRequest]
    }
  }

  @js.native
  trait ListBotsResponse extends js.Object {
    var Bots: js.UndefOr[BotList]
    var NextToken: js.UndefOr[String]
  }

  object ListBotsResponse {
    @inline
    def apply(
        Bots: js.UndefOr[BotList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListBotsResponse = {
      val __obj = js.Dynamic.literal()
      Bots.foreach(__v => __obj.updateDynamic("Bots")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBotsResponse]
    }
  }

  @js.native
  trait ListChannelBansRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: js.UndefOr[ChimeArn]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChannelBansRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelBansRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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
  trait ListChannelMembershipsForAppInstanceUserRequest extends js.Object {
    var AppInstanceUserArn: js.UndefOr[ChimeArn]
    var ChimeBearer: js.UndefOr[ChimeArn]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChannelMembershipsForAppInstanceUserRequest {
    @inline
    def apply(
        AppInstanceUserArn: js.UndefOr[ChimeArn] = js.undefined,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelMembershipsForAppInstanceUserRequest = {
      val __obj = js.Dynamic.literal()
      AppInstanceUserArn.foreach(__v => __obj.updateDynamic("AppInstanceUserArn")(__v.asInstanceOf[js.Any]))
      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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
    var ChimeBearer: js.UndefOr[ChimeArn]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Type: js.UndefOr[ChannelMembershipType]
  }

  object ListChannelMembershipsRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Type: js.UndefOr[ChannelMembershipType] = js.undefined
    ): ListChannelMembershipsRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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
    var ChimeBearer: js.UndefOr[ChimeArn]
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
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        NotAfter: js.UndefOr[Timestamp] = js.undefined,
        NotBefore: js.UndefOr[Timestamp] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListChannelMessagesRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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
    var ChimeBearer: js.UndefOr[ChimeArn]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChannelModeratorsRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelModeratorsRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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
  trait ListChannelsModeratedByAppInstanceUserRequest extends js.Object {
    var AppInstanceUserArn: js.UndefOr[ChimeArn]
    var ChimeBearer: js.UndefOr[ChimeArn]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListChannelsModeratedByAppInstanceUserRequest {
    @inline
    def apply(
        AppInstanceUserArn: js.UndefOr[ChimeArn] = js.undefined,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListChannelsModeratedByAppInstanceUserRequest = {
      val __obj = js.Dynamic.literal()
      AppInstanceUserArn.foreach(__v => __obj.updateDynamic("AppInstanceUserArn")(__v.asInstanceOf[js.Any]))
      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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
    var ChimeBearer: js.UndefOr[ChimeArn]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Privacy: js.UndefOr[ChannelPrivacy]
  }

  object ListChannelsRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Privacy: js.UndefOr[ChannelPrivacy] = js.undefined
    ): ListChannelsRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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
  trait ListMediaCapturePipelinesRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  object ListMediaCapturePipelinesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListMediaCapturePipelinesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMediaCapturePipelinesRequest]
    }
  }

  @js.native
  trait ListMediaCapturePipelinesResponse extends js.Object {
    var MediaCapturePipelines: js.UndefOr[MediaCapturePipelineList]
    var NextToken: js.UndefOr[String]
  }

  object ListMediaCapturePipelinesResponse {
    @inline
    def apply(
        MediaCapturePipelines: js.UndefOr[MediaCapturePipelineList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListMediaCapturePipelinesResponse = {
      val __obj = js.Dynamic.literal()
      MediaCapturePipelines.foreach(__v => __obj.updateDynamic("MediaCapturePipelines")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMediaCapturePipelinesResponse]
    }
  }

  @js.native
  trait ListMeetingTagsRequest extends js.Object {
    var MeetingId: GuidString
  }

  object ListMeetingTagsRequest {
    @inline
    def apply(
        MeetingId: GuidString
    ): ListMeetingTagsRequest = {
      val __obj = js.Dynamic.literal(
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListMeetingTagsRequest]
    }
  }

  @js.native
  trait ListMeetingTagsResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListMeetingTagsResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListMeetingTagsResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMeetingTagsResponse]
    }
  }

  @js.native
  trait ListMeetingsRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  object ListMeetingsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListMeetingsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMeetingsRequest]
    }
  }

  @js.native
  trait ListMeetingsResponse extends js.Object {
    var Meetings: js.UndefOr[MeetingList]
    var NextToken: js.UndefOr[String]
  }

  object ListMeetingsResponse {
    @inline
    def apply(
        Meetings: js.UndefOr[MeetingList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListMeetingsResponse = {
      val __obj = js.Dynamic.literal()
      Meetings.foreach(__v => __obj.updateDynamic("Meetings")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMeetingsResponse]
    }
  }

  @js.native
  trait ListPhoneNumberOrdersRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  object ListPhoneNumberOrdersRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListPhoneNumberOrdersRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumberOrdersRequest]
    }
  }

  @js.native
  trait ListPhoneNumberOrdersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PhoneNumberOrders: js.UndefOr[PhoneNumberOrderList]
  }

  object ListPhoneNumberOrdersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        PhoneNumberOrders: js.UndefOr[PhoneNumberOrderList] = js.undefined
    ): ListPhoneNumberOrdersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PhoneNumberOrders.foreach(__v => __obj.updateDynamic("PhoneNumberOrders")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumberOrdersResponse]
    }
  }

  @js.native
  trait ListPhoneNumbersRequest extends js.Object {
    var FilterName: js.UndefOr[PhoneNumberAssociationName]
    var FilterValue: js.UndefOr[String]
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
    var ProductType: js.UndefOr[PhoneNumberProductType]
    var Status: js.UndefOr[PhoneNumberStatus]
  }

  object ListPhoneNumbersRequest {
    @inline
    def apply(
        FilterName: js.UndefOr[PhoneNumberAssociationName] = js.undefined,
        FilterValue: js.UndefOr[String] = js.undefined,
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined,
        Status: js.UndefOr[PhoneNumberStatus] = js.undefined
    ): ListPhoneNumbersRequest = {
      val __obj = js.Dynamic.literal()
      FilterName.foreach(__v => __obj.updateDynamic("FilterName")(__v.asInstanceOf[js.Any]))
      FilterValue.foreach(__v => __obj.updateDynamic("FilterValue")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProductType.foreach(__v => __obj.updateDynamic("ProductType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumbersRequest]
    }
  }

  @js.native
  trait ListPhoneNumbersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PhoneNumbers: js.UndefOr[PhoneNumberList]
  }

  object ListPhoneNumbersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        PhoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined
    ): ListPhoneNumbersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PhoneNumbers.foreach(__v => __obj.updateDynamic("PhoneNumbers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumbersResponse]
    }
  }

  @js.native
  trait ListProxySessionsRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString128
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[NextTokenString]
    var Status: js.UndefOr[ProxySessionStatus]
  }

  object ListProxySessionsRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString128,
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[NextTokenString] = js.undefined,
        Status: js.UndefOr[ProxySessionStatus] = js.undefined
    ): ListProxySessionsRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProxySessionsRequest]
    }
  }

  @js.native
  trait ListProxySessionsResponse extends js.Object {
    var NextToken: js.UndefOr[NextTokenString]
    var ProxySessions: js.UndefOr[ProxySessions]
  }

  object ListProxySessionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextTokenString] = js.undefined,
        ProxySessions: js.UndefOr[ProxySessions] = js.undefined
    ): ListProxySessionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProxySessions.foreach(__v => __obj.updateDynamic("ProxySessions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProxySessionsResponse]
    }
  }

  @js.native
  trait ListRoomMembershipsRequest extends js.Object {
    var AccountId: NonEmptyString
    var RoomId: NonEmptyString
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  object ListRoomMembershipsRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        RoomId: NonEmptyString,
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListRoomMembershipsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "RoomId" -> RoomId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoomMembershipsRequest]
    }
  }

  @js.native
  trait ListRoomMembershipsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var RoomMemberships: js.UndefOr[RoomMembershipList]
  }

  object ListRoomMembershipsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        RoomMemberships: js.UndefOr[RoomMembershipList] = js.undefined
    ): ListRoomMembershipsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RoomMemberships.foreach(__v => __obj.updateDynamic("RoomMemberships")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoomMembershipsResponse]
    }
  }

  @js.native
  trait ListRoomsRequest extends js.Object {
    var AccountId: NonEmptyString
    var MaxResults: js.UndefOr[ResultMax]
    var MemberId: js.UndefOr[String]
    var NextToken: js.UndefOr[String]
  }

  object ListRoomsRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        MemberId: js.UndefOr[String] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListRoomsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      MemberId.foreach(__v => __obj.updateDynamic("MemberId")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoomsRequest]
    }
  }

  @js.native
  trait ListRoomsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Rooms: js.UndefOr[RoomList]
  }

  object ListRoomsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Rooms: js.UndefOr[RoomList] = js.undefined
    ): ListRoomsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Rooms.foreach(__v => __obj.updateDynamic("Rooms")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoomsResponse]
    }
  }

  @js.native
  trait ListSipMediaApplicationsRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[NextTokenString]
  }

  object ListSipMediaApplicationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[NextTokenString] = js.undefined
    ): ListSipMediaApplicationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSipMediaApplicationsRequest]
    }
  }

  @js.native
  trait ListSipMediaApplicationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextTokenString]
    var SipMediaApplications: js.UndefOr[SipMediaApplicationList]
  }

  object ListSipMediaApplicationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextTokenString] = js.undefined,
        SipMediaApplications: js.UndefOr[SipMediaApplicationList] = js.undefined
    ): ListSipMediaApplicationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SipMediaApplications.foreach(__v => __obj.updateDynamic("SipMediaApplications")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSipMediaApplicationsResponse]
    }
  }

  @js.native
  trait ListSipRulesRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[NextTokenString]
    var SipMediaApplicationId: js.UndefOr[NonEmptyString]
  }

  object ListSipRulesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[NextTokenString] = js.undefined,
        SipMediaApplicationId: js.UndefOr[NonEmptyString] = js.undefined
    ): ListSipRulesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SipMediaApplicationId.foreach(__v => __obj.updateDynamic("SipMediaApplicationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSipRulesRequest]
    }
  }

  @js.native
  trait ListSipRulesResponse extends js.Object {
    var NextToken: js.UndefOr[NextTokenString]
    var SipRules: js.UndefOr[SipRuleList]
  }

  object ListSipRulesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextTokenString] = js.undefined,
        SipRules: js.UndefOr[SipRuleList] = js.undefined
    ): ListSipRulesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SipRules.foreach(__v => __obj.updateDynamic("SipRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSipRulesResponse]
    }
  }

  @js.native
  trait ListSupportedPhoneNumberCountriesRequest extends js.Object {
    var ProductType: PhoneNumberProductType
  }

  object ListSupportedPhoneNumberCountriesRequest {
    @inline
    def apply(
        ProductType: PhoneNumberProductType
    ): ListSupportedPhoneNumberCountriesRequest = {
      val __obj = js.Dynamic.literal(
        "ProductType" -> ProductType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListSupportedPhoneNumberCountriesRequest]
    }
  }

  @js.native
  trait ListSupportedPhoneNumberCountriesResponse extends js.Object {
    var PhoneNumberCountries: js.UndefOr[PhoneNumberCountriesList]
  }

  object ListSupportedPhoneNumberCountriesResponse {
    @inline
    def apply(
        PhoneNumberCountries: js.UndefOr[PhoneNumberCountriesList] = js.undefined
    ): ListSupportedPhoneNumberCountriesResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberCountries.foreach(__v => __obj.updateDynamic("PhoneNumberCountries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSupportedPhoneNumberCountriesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: Arn
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

  @js.native
  trait ListUsersRequest extends js.Object {
    var AccountId: NonEmptyString
    var MaxResults: js.UndefOr[ProfileServiceMaxResults]
    var NextToken: js.UndefOr[String]
    var UserEmail: js.UndefOr[EmailAddress]
    var UserType: js.UndefOr[UserType]
  }

  object ListUsersRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        UserEmail: js.UndefOr[EmailAddress] = js.undefined,
        UserType: js.UndefOr[UserType] = js.undefined
    ): ListUsersRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UserEmail.foreach(__v => __obj.updateDynamic("UserEmail")(__v.asInstanceOf[js.Any]))
      UserType.foreach(__v => __obj.updateDynamic("UserType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersRequest]
    }
  }

  @js.native
  trait ListUsersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Users: js.UndefOr[UserList]
  }

  object ListUsersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Users: js.UndefOr[UserList] = js.undefined
    ): ListUsersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Users.foreach(__v => __obj.updateDynamic("Users")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersResponse]
    }
  }

  @js.native
  trait ListVoiceConnectorGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  object ListVoiceConnectorGroupsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListVoiceConnectorGroupsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVoiceConnectorGroupsRequest]
    }
  }

  @js.native
  trait ListVoiceConnectorGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var VoiceConnectorGroups: js.UndefOr[VoiceConnectorGroupList]
  }

  object ListVoiceConnectorGroupsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        VoiceConnectorGroups: js.UndefOr[VoiceConnectorGroupList] = js.undefined
    ): ListVoiceConnectorGroupsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      VoiceConnectorGroups.foreach(__v => __obj.updateDynamic("VoiceConnectorGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVoiceConnectorGroupsResponse]
    }
  }

  @js.native
  trait ListVoiceConnectorTerminationCredentialsRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object ListVoiceConnectorTerminationCredentialsRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): ListVoiceConnectorTerminationCredentialsRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListVoiceConnectorTerminationCredentialsRequest]
    }
  }

  @js.native
  trait ListVoiceConnectorTerminationCredentialsResponse extends js.Object {
    var Usernames: js.UndefOr[SensitiveStringList]
  }

  object ListVoiceConnectorTerminationCredentialsResponse {
    @inline
    def apply(
        Usernames: js.UndefOr[SensitiveStringList] = js.undefined
    ): ListVoiceConnectorTerminationCredentialsResponse = {
      val __obj = js.Dynamic.literal()
      Usernames.foreach(__v => __obj.updateDynamic("Usernames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVoiceConnectorTerminationCredentialsResponse]
    }
  }

  @js.native
  trait ListVoiceConnectorsRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  object ListVoiceConnectorsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListVoiceConnectorsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVoiceConnectorsRequest]
    }
  }

  @js.native
  trait ListVoiceConnectorsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var VoiceConnectors: js.UndefOr[VoiceConnectorList]
  }

  object ListVoiceConnectorsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        VoiceConnectors: js.UndefOr[VoiceConnectorList] = js.undefined
    ): ListVoiceConnectorsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      VoiceConnectors.foreach(__v => __obj.updateDynamic("VoiceConnectors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVoiceConnectorsResponse]
    }
  }

  /** The logging configuration associated with an Amazon Chime Voice Connector. Specifies whether SIP message logs are enabled for sending to Amazon CloudWatch Logs.
    */
  @js.native
  trait LoggingConfiguration extends js.Object {
    var EnableSIPLogs: js.UndefOr[Boolean]
  }

  object LoggingConfiguration {
    @inline
    def apply(
        EnableSIPLogs: js.UndefOr[Boolean] = js.undefined
    ): LoggingConfiguration = {
      val __obj = js.Dynamic.literal()
      EnableSIPLogs.foreach(__v => __obj.updateDynamic("EnableSIPLogs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoggingConfiguration]
    }
  }

  @js.native
  trait LogoutUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserId: NonEmptyString
  }

  object LogoutUserRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        UserId: NonEmptyString
    ): LogoutUserRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LogoutUserRequest]
    }
  }

  @js.native
  trait LogoutUserResponse extends js.Object

  object LogoutUserResponse {
    @inline
    def apply(): LogoutUserResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogoutUserResponse]
    }
  }

  /** A media capture pipeline object consisting of an ID, source type, source ARN, a sink type, a sink ARN, and a configuration object.
    */
  @js.native
  trait MediaCapturePipeline extends js.Object {
    var ChimeSdkMeetingConfiguration: js.UndefOr[ChimeSdkMeetingConfiguration]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var MediaPipelineId: js.UndefOr[GuidString]
    var SinkArn: js.UndefOr[Arn]
    var SinkType: js.UndefOr[MediaPipelineSinkType]
    var SourceArn: js.UndefOr[Arn]
    var SourceType: js.UndefOr[MediaPipelineSourceType]
    var Status: js.UndefOr[MediaPipelineStatus]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  object MediaCapturePipeline {
    @inline
    def apply(
        ChimeSdkMeetingConfiguration: js.UndefOr[ChimeSdkMeetingConfiguration] = js.undefined,
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        MediaPipelineId: js.UndefOr[GuidString] = js.undefined,
        SinkArn: js.UndefOr[Arn] = js.undefined,
        SinkType: js.UndefOr[MediaPipelineSinkType] = js.undefined,
        SourceArn: js.UndefOr[Arn] = js.undefined,
        SourceType: js.UndefOr[MediaPipelineSourceType] = js.undefined,
        Status: js.UndefOr[MediaPipelineStatus] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): MediaCapturePipeline = {
      val __obj = js.Dynamic.literal()
      ChimeSdkMeetingConfiguration.foreach(__v => __obj.updateDynamic("ChimeSdkMeetingConfiguration")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      MediaPipelineId.foreach(__v => __obj.updateDynamic("MediaPipelineId")(__v.asInstanceOf[js.Any]))
      SinkArn.foreach(__v => __obj.updateDynamic("SinkArn")(__v.asInstanceOf[js.Any]))
      SinkType.foreach(__v => __obj.updateDynamic("SinkType")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MediaCapturePipeline]
    }
  }

  /** A set of endpoints used by clients to connect to the media service group for an Amazon Chime SDK meeting.
    */
  @js.native
  trait MediaPlacement extends js.Object {
    var AudioFallbackUrl: js.UndefOr[UriType]
    var AudioHostUrl: js.UndefOr[UriType]
    var EventIngestionUrl: js.UndefOr[UriType]
    var ScreenDataUrl: js.UndefOr[UriType]
    var ScreenSharingUrl: js.UndefOr[UriType]
    var ScreenViewingUrl: js.UndefOr[UriType]
    var SignalingUrl: js.UndefOr[UriType]
    var TurnControlUrl: js.UndefOr[UriType]
  }

  object MediaPlacement {
    @inline
    def apply(
        AudioFallbackUrl: js.UndefOr[UriType] = js.undefined,
        AudioHostUrl: js.UndefOr[UriType] = js.undefined,
        EventIngestionUrl: js.UndefOr[UriType] = js.undefined,
        ScreenDataUrl: js.UndefOr[UriType] = js.undefined,
        ScreenSharingUrl: js.UndefOr[UriType] = js.undefined,
        ScreenViewingUrl: js.UndefOr[UriType] = js.undefined,
        SignalingUrl: js.UndefOr[UriType] = js.undefined,
        TurnControlUrl: js.UndefOr[UriType] = js.undefined
    ): MediaPlacement = {
      val __obj = js.Dynamic.literal()
      AudioFallbackUrl.foreach(__v => __obj.updateDynamic("AudioFallbackUrl")(__v.asInstanceOf[js.Any]))
      AudioHostUrl.foreach(__v => __obj.updateDynamic("AudioHostUrl")(__v.asInstanceOf[js.Any]))
      EventIngestionUrl.foreach(__v => __obj.updateDynamic("EventIngestionUrl")(__v.asInstanceOf[js.Any]))
      ScreenDataUrl.foreach(__v => __obj.updateDynamic("ScreenDataUrl")(__v.asInstanceOf[js.Any]))
      ScreenSharingUrl.foreach(__v => __obj.updateDynamic("ScreenSharingUrl")(__v.asInstanceOf[js.Any]))
      ScreenViewingUrl.foreach(__v => __obj.updateDynamic("ScreenViewingUrl")(__v.asInstanceOf[js.Any]))
      SignalingUrl.foreach(__v => __obj.updateDynamic("SignalingUrl")(__v.asInstanceOf[js.Any]))
      TurnControlUrl.foreach(__v => __obj.updateDynamic("TurnControlUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MediaPlacement]
    }
  }

  /** A meeting created using the Amazon Chime SDK.
    */
  @js.native
  trait Meeting extends js.Object {
    var ExternalMeetingId: js.UndefOr[ExternalMeetingIdType]
    var MediaPlacement: js.UndefOr[MediaPlacement]
    var MediaRegion: js.UndefOr[String]
    var MeetingId: js.UndefOr[GuidString]
  }

  object Meeting {
    @inline
    def apply(
        ExternalMeetingId: js.UndefOr[ExternalMeetingIdType] = js.undefined,
        MediaPlacement: js.UndefOr[MediaPlacement] = js.undefined,
        MediaRegion: js.UndefOr[String] = js.undefined,
        MeetingId: js.UndefOr[GuidString] = js.undefined
    ): Meeting = {
      val __obj = js.Dynamic.literal()
      ExternalMeetingId.foreach(__v => __obj.updateDynamic("ExternalMeetingId")(__v.asInstanceOf[js.Any]))
      MediaPlacement.foreach(__v => __obj.updateDynamic("MediaPlacement")(__v.asInstanceOf[js.Any]))
      MediaRegion.foreach(__v => __obj.updateDynamic("MediaRegion")(__v.asInstanceOf[js.Any]))
      MeetingId.foreach(__v => __obj.updateDynamic("MeetingId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Meeting]
    }
  }

  /** The resource target configurations for receiving Amazon Chime SDK meeting and attendee event notifications. The Amazon Chime SDK supports resource targets located in the US East (N. Virginia) AWS Region (<code>us-east-1</code>).
    */
  @js.native
  trait MeetingNotificationConfiguration extends js.Object {
    var SnsTopicArn: js.UndefOr[Arn]
    var SqsQueueArn: js.UndefOr[Arn]
  }

  object MeetingNotificationConfiguration {
    @inline
    def apply(
        SnsTopicArn: js.UndefOr[Arn] = js.undefined,
        SqsQueueArn: js.UndefOr[Arn] = js.undefined
    ): MeetingNotificationConfiguration = {
      val __obj = js.Dynamic.literal()
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      SqsQueueArn.foreach(__v => __obj.updateDynamic("SqsQueueArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MeetingNotificationConfiguration]
    }
  }

  /** The member details, such as email address, name, member ID, and member type.
    */
  @js.native
  trait Member extends js.Object {
    var AccountId: js.UndefOr[NonEmptyString]
    var Email: js.UndefOr[SensitiveString]
    var FullName: js.UndefOr[SensitiveString]
    var MemberId: js.UndefOr[NonEmptyString]
    var MemberType: js.UndefOr[MemberType]
  }

  object Member {
    @inline
    def apply(
        AccountId: js.UndefOr[NonEmptyString] = js.undefined,
        Email: js.UndefOr[SensitiveString] = js.undefined,
        FullName: js.UndefOr[SensitiveString] = js.undefined,
        MemberId: js.UndefOr[NonEmptyString] = js.undefined,
        MemberType: js.UndefOr[MemberType] = js.undefined
    ): Member = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      FullName.foreach(__v => __obj.updateDynamic("FullName")(__v.asInstanceOf[js.Any]))
      MemberId.foreach(__v => __obj.updateDynamic("MemberId")(__v.asInstanceOf[js.Any]))
      MemberType.foreach(__v => __obj.updateDynamic("MemberType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Member]
    }
  }

  /** The list of errors returned when a member action results in an error.
    */
  @js.native
  trait MemberError extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[String]
    var MemberId: js.UndefOr[NonEmptyString]
  }

  object MemberError {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        MemberId: js.UndefOr[NonEmptyString] = js.undefined
    ): MemberError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      MemberId.foreach(__v => __obj.updateDynamic("MemberId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberError]
    }
  }

  /** Membership details, such as member ID and member role.
    */
  @js.native
  trait MembershipItem extends js.Object {
    var MemberId: js.UndefOr[NonEmptyString]
    var Role: js.UndefOr[RoomMembershipRole]
  }

  object MembershipItem {
    @inline
    def apply(
        MemberId: js.UndefOr[NonEmptyString] = js.undefined,
        Role: js.UndefOr[RoomMembershipRole] = js.undefined
    ): MembershipItem = {
      val __obj = js.Dynamic.literal()
      MemberId.foreach(__v => __obj.updateDynamic("MemberId")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MembershipItem]
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

  /** A phone number for which an order has been placed.
    */
  @js.native
  trait OrderedPhoneNumber extends js.Object {
    var E164PhoneNumber: js.UndefOr[E164PhoneNumber]
    var Status: js.UndefOr[OrderedPhoneNumberStatus]
  }

  object OrderedPhoneNumber {
    @inline
    def apply(
        E164PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined,
        Status: js.UndefOr[OrderedPhoneNumberStatus] = js.undefined
    ): OrderedPhoneNumber = {
      val __obj = js.Dynamic.literal()
      E164PhoneNumber.foreach(__v => __obj.updateDynamic("E164PhoneNumber")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrderedPhoneNumber]
    }
  }

  /** Origination settings enable your SIP hosts to receive inbound calls using your Amazon Chime Voice Connector.
    *
    * '''Note:'''The parameters listed below are not required, but you must use at least one.
    */
  @js.native
  trait Origination extends js.Object {
    var Disabled: js.UndefOr[Boolean]
    var Routes: js.UndefOr[OriginationRouteList]
  }

  object Origination {
    @inline
    def apply(
        Disabled: js.UndefOr[Boolean] = js.undefined,
        Routes: js.UndefOr[OriginationRouteList] = js.undefined
    ): Origination = {
      val __obj = js.Dynamic.literal()
      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      Routes.foreach(__v => __obj.updateDynamic("Routes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Origination]
    }
  }

  /** Origination routes define call distribution properties for your SIP hosts to receive inbound calls using your Amazon Chime Voice Connector. Limit: Ten origination routes for each Amazon Chime Voice Connector.
    *
    * '''Note:'''The parameters listed below are not required, but you must use at least one.
    */
  @js.native
  trait OriginationRoute extends js.Object {
    var Host: js.UndefOr[String]
    var Port: js.UndefOr[Port]
    var Priority: js.UndefOr[OriginationRoutePriority]
    var Protocol: js.UndefOr[OriginationRouteProtocol]
    var Weight: js.UndefOr[OriginationRouteWeight]
  }

  object OriginationRoute {
    @inline
    def apply(
        Host: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[Port] = js.undefined,
        Priority: js.UndefOr[OriginationRoutePriority] = js.undefined,
        Protocol: js.UndefOr[OriginationRouteProtocol] = js.undefined,
        Weight: js.UndefOr[OriginationRouteWeight] = js.undefined
    ): OriginationRoute = {
      val __obj = js.Dynamic.literal()
      Host.foreach(__v => __obj.updateDynamic("Host")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      Weight.foreach(__v => __obj.updateDynamic("Weight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OriginationRoute]
    }
  }

  /** The phone number and proxy phone number for a participant in an Amazon Chime Voice Connector proxy session.
    */
  @js.native
  trait Participant extends js.Object {
    var PhoneNumber: js.UndefOr[E164PhoneNumber]
    var ProxyPhoneNumber: js.UndefOr[E164PhoneNumber]
  }

  object Participant {
    @inline
    def apply(
        PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined,
        ProxyPhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
    ): Participant = {
      val __obj = js.Dynamic.literal()
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      ProxyPhoneNumber.foreach(__v => __obj.updateDynamic("ProxyPhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Participant]
    }
  }

  /** A phone number used for Amazon Chime Business Calling or an Amazon Chime Voice Connector.
    */
  @js.native
  trait PhoneNumber extends js.Object {
    var Associations: js.UndefOr[PhoneNumberAssociationList]
    var CallingName: js.UndefOr[CallingName]
    var CallingNameStatus: js.UndefOr[CallingNameStatus]
    var Capabilities: js.UndefOr[PhoneNumberCapabilities]
    var Country: js.UndefOr[Alpha2CountryCode]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var DeletionTimestamp: js.UndefOr[Iso8601Timestamp]
    var E164PhoneNumber: js.UndefOr[E164PhoneNumber]
    var PhoneNumberId: js.UndefOr[String]
    var ProductType: js.UndefOr[PhoneNumberProductType]
    var Status: js.UndefOr[PhoneNumberStatus]
    var Type: js.UndefOr[PhoneNumberType]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  object PhoneNumber {
    @inline
    def apply(
        Associations: js.UndefOr[PhoneNumberAssociationList] = js.undefined,
        CallingName: js.UndefOr[CallingName] = js.undefined,
        CallingNameStatus: js.UndefOr[CallingNameStatus] = js.undefined,
        Capabilities: js.UndefOr[PhoneNumberCapabilities] = js.undefined,
        Country: js.UndefOr[Alpha2CountryCode] = js.undefined,
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        DeletionTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        E164PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined,
        PhoneNumberId: js.UndefOr[String] = js.undefined,
        ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined,
        Status: js.UndefOr[PhoneNumberStatus] = js.undefined,
        Type: js.UndefOr[PhoneNumberType] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): PhoneNumber = {
      val __obj = js.Dynamic.literal()
      Associations.foreach(__v => __obj.updateDynamic("Associations")(__v.asInstanceOf[js.Any]))
      CallingName.foreach(__v => __obj.updateDynamic("CallingName")(__v.asInstanceOf[js.Any]))
      CallingNameStatus.foreach(__v => __obj.updateDynamic("CallingNameStatus")(__v.asInstanceOf[js.Any]))
      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.updateDynamic("Country")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      DeletionTimestamp.foreach(__v => __obj.updateDynamic("DeletionTimestamp")(__v.asInstanceOf[js.Any]))
      E164PhoneNumber.foreach(__v => __obj.updateDynamic("E164PhoneNumber")(__v.asInstanceOf[js.Any]))
      PhoneNumberId.foreach(__v => __obj.updateDynamic("PhoneNumberId")(__v.asInstanceOf[js.Any]))
      ProductType.foreach(__v => __obj.updateDynamic("ProductType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumber]
    }
  }

  /** The phone number associations, such as Amazon Chime account ID, Amazon Chime user ID, Amazon Chime Voice Connector ID, or Amazon Chime Voice Connector group ID.
    */
  @js.native
  trait PhoneNumberAssociation extends js.Object {
    var AssociatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var Name: js.UndefOr[PhoneNumberAssociationName]
    var Value: js.UndefOr[String]
  }

  object PhoneNumberAssociation {
    @inline
    def apply(
        AssociatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        Name: js.UndefOr[PhoneNumberAssociationName] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): PhoneNumberAssociation = {
      val __obj = js.Dynamic.literal()
      AssociatedTimestamp.foreach(__v => __obj.updateDynamic("AssociatedTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumberAssociation]
    }
  }

  /** The phone number capabilities for Amazon Chime Business Calling phone numbers, such as enabled inbound and outbound calling and text messaging.
    */
  @js.native
  trait PhoneNumberCapabilities extends js.Object {
    var InboundCall: js.UndefOr[NullableBoolean]
    var InboundMMS: js.UndefOr[NullableBoolean]
    var InboundSMS: js.UndefOr[NullableBoolean]
    var OutboundCall: js.UndefOr[NullableBoolean]
    var OutboundMMS: js.UndefOr[NullableBoolean]
    var OutboundSMS: js.UndefOr[NullableBoolean]
  }

  object PhoneNumberCapabilities {
    @inline
    def apply(
        InboundCall: js.UndefOr[NullableBoolean] = js.undefined,
        InboundMMS: js.UndefOr[NullableBoolean] = js.undefined,
        InboundSMS: js.UndefOr[NullableBoolean] = js.undefined,
        OutboundCall: js.UndefOr[NullableBoolean] = js.undefined,
        OutboundMMS: js.UndefOr[NullableBoolean] = js.undefined,
        OutboundSMS: js.UndefOr[NullableBoolean] = js.undefined
    ): PhoneNumberCapabilities = {
      val __obj = js.Dynamic.literal()
      InboundCall.foreach(__v => __obj.updateDynamic("InboundCall")(__v.asInstanceOf[js.Any]))
      InboundMMS.foreach(__v => __obj.updateDynamic("InboundMMS")(__v.asInstanceOf[js.Any]))
      InboundSMS.foreach(__v => __obj.updateDynamic("InboundSMS")(__v.asInstanceOf[js.Any]))
      OutboundCall.foreach(__v => __obj.updateDynamic("OutboundCall")(__v.asInstanceOf[js.Any]))
      OutboundMMS.foreach(__v => __obj.updateDynamic("OutboundMMS")(__v.asInstanceOf[js.Any]))
      OutboundSMS.foreach(__v => __obj.updateDynamic("OutboundSMS")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumberCapabilities]
    }
  }

  /** The phone number country.
    */
  @js.native
  trait PhoneNumberCountry extends js.Object {
    var CountryCode: js.UndefOr[Alpha2CountryCode]
    var SupportedPhoneNumberTypes: js.UndefOr[PhoneNumberTypeList]
  }

  object PhoneNumberCountry {
    @inline
    def apply(
        CountryCode: js.UndefOr[Alpha2CountryCode] = js.undefined,
        SupportedPhoneNumberTypes: js.UndefOr[PhoneNumberTypeList] = js.undefined
    ): PhoneNumberCountry = {
      val __obj = js.Dynamic.literal()
      CountryCode.foreach(__v => __obj.updateDynamic("CountryCode")(__v.asInstanceOf[js.Any]))
      SupportedPhoneNumberTypes.foreach(__v => __obj.updateDynamic("SupportedPhoneNumberTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumberCountry]
    }
  }

  /** If the phone number action fails for one or more of the phone numbers in the request, a list of the phone numbers is returned, along with error codes and error messages.
    */
  @js.native
  trait PhoneNumberError extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[String]
    var PhoneNumberId: js.UndefOr[NonEmptyString]
  }

  object PhoneNumberError {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        PhoneNumberId: js.UndefOr[NonEmptyString] = js.undefined
    ): PhoneNumberError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      PhoneNumberId.foreach(__v => __obj.updateDynamic("PhoneNumberId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumberError]
    }
  }

  /** The details of a phone number order created for Amazon Chime.
    */
  @js.native
  trait PhoneNumberOrder extends js.Object {
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var OrderedPhoneNumbers: js.UndefOr[OrderedPhoneNumberList]
    var PhoneNumberOrderId: js.UndefOr[GuidString]
    var ProductType: js.UndefOr[PhoneNumberProductType]
    var Status: js.UndefOr[PhoneNumberOrderStatus]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  object PhoneNumberOrder {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        OrderedPhoneNumbers: js.UndefOr[OrderedPhoneNumberList] = js.undefined,
        PhoneNumberOrderId: js.UndefOr[GuidString] = js.undefined,
        ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined,
        Status: js.UndefOr[PhoneNumberOrderStatus] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): PhoneNumberOrder = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      OrderedPhoneNumbers.foreach(__v => __obj.updateDynamic("OrderedPhoneNumbers")(__v.asInstanceOf[js.Any]))
      PhoneNumberOrderId.foreach(__v => __obj.updateDynamic("PhoneNumberOrderId")(__v.asInstanceOf[js.Any]))
      ProductType.foreach(__v => __obj.updateDynamic("ProductType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumberOrder]
    }
  }

  /** The proxy configuration for an Amazon Chime Voice Connector.
    */
  @js.native
  trait Proxy extends js.Object {
    var DefaultSessionExpiryMinutes: js.UndefOr[Int]
    var Disabled: js.UndefOr[Boolean]
    var FallBackPhoneNumber: js.UndefOr[E164PhoneNumber]
    var PhoneNumberCountries: js.UndefOr[StringList]
  }

  object Proxy {
    @inline
    def apply(
        DefaultSessionExpiryMinutes: js.UndefOr[Int] = js.undefined,
        Disabled: js.UndefOr[Boolean] = js.undefined,
        FallBackPhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined,
        PhoneNumberCountries: js.UndefOr[StringList] = js.undefined
    ): Proxy = {
      val __obj = js.Dynamic.literal()
      DefaultSessionExpiryMinutes.foreach(__v => __obj.updateDynamic("DefaultSessionExpiryMinutes")(__v.asInstanceOf[js.Any]))
      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      FallBackPhoneNumber.foreach(__v => __obj.updateDynamic("FallBackPhoneNumber")(__v.asInstanceOf[js.Any]))
      PhoneNumberCountries.foreach(__v => __obj.updateDynamic("PhoneNumberCountries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Proxy]
    }
  }

  /** The proxy session for an Amazon Chime Voice Connector.
    */
  @js.native
  trait ProxySession extends js.Object {
    var Capabilities: js.UndefOr[CapabilityList]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var EndedTimestamp: js.UndefOr[Iso8601Timestamp]
    var ExpiryMinutes: js.UndefOr[PositiveInteger]
    var GeoMatchLevel: js.UndefOr[GeoMatchLevel]
    var GeoMatchParams: js.UndefOr[GeoMatchParams]
    var Name: js.UndefOr[String128]
    var NumberSelectionBehavior: js.UndefOr[NumberSelectionBehavior]
    var Participants: js.UndefOr[Participants]
    var ProxySessionId: js.UndefOr[NonEmptyString128]
    var Status: js.UndefOr[ProxySessionStatus]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var VoiceConnectorId: js.UndefOr[NonEmptyString128]
  }

  object ProxySession {
    @inline
    def apply(
        Capabilities: js.UndefOr[CapabilityList] = js.undefined,
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        EndedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        ExpiryMinutes: js.UndefOr[PositiveInteger] = js.undefined,
        GeoMatchLevel: js.UndefOr[GeoMatchLevel] = js.undefined,
        GeoMatchParams: js.UndefOr[GeoMatchParams] = js.undefined,
        Name: js.UndefOr[String128] = js.undefined,
        NumberSelectionBehavior: js.UndefOr[NumberSelectionBehavior] = js.undefined,
        Participants: js.UndefOr[Participants] = js.undefined,
        ProxySessionId: js.UndefOr[NonEmptyString128] = js.undefined,
        Status: js.UndefOr[ProxySessionStatus] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        VoiceConnectorId: js.UndefOr[NonEmptyString128] = js.undefined
    ): ProxySession = {
      val __obj = js.Dynamic.literal()
      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      EndedTimestamp.foreach(__v => __obj.updateDynamic("EndedTimestamp")(__v.asInstanceOf[js.Any]))
      ExpiryMinutes.foreach(__v => __obj.updateDynamic("ExpiryMinutes")(__v.asInstanceOf[js.Any]))
      GeoMatchLevel.foreach(__v => __obj.updateDynamic("GeoMatchLevel")(__v.asInstanceOf[js.Any]))
      GeoMatchParams.foreach(__v => __obj.updateDynamic("GeoMatchParams")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NumberSelectionBehavior.foreach(__v => __obj.updateDynamic("NumberSelectionBehavior")(__v.asInstanceOf[js.Any]))
      Participants.foreach(__v => __obj.updateDynamic("Participants")(__v.asInstanceOf[js.Any]))
      ProxySessionId.foreach(__v => __obj.updateDynamic("ProxySessionId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      VoiceConnectorId.foreach(__v => __obj.updateDynamic("VoiceConnectorId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProxySession]
    }
  }

  @js.native
  trait PutAppInstanceRetentionSettingsRequest extends js.Object {
    var AppInstanceArn: ChimeArn
    var AppInstanceRetentionSettings: AppInstanceRetentionSettings
  }

  object PutAppInstanceRetentionSettingsRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn,
        AppInstanceRetentionSettings: AppInstanceRetentionSettings
    ): PutAppInstanceRetentionSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any],
        "AppInstanceRetentionSettings" -> AppInstanceRetentionSettings.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutAppInstanceRetentionSettingsRequest]
    }
  }

  @js.native
  trait PutAppInstanceRetentionSettingsResponse extends js.Object {
    var AppInstanceRetentionSettings: js.UndefOr[AppInstanceRetentionSettings]
    var InitiateDeletionTimestamp: js.UndefOr[Timestamp]
  }

  object PutAppInstanceRetentionSettingsResponse {
    @inline
    def apply(
        AppInstanceRetentionSettings: js.UndefOr[AppInstanceRetentionSettings] = js.undefined,
        InitiateDeletionTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): PutAppInstanceRetentionSettingsResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceRetentionSettings.foreach(__v => __obj.updateDynamic("AppInstanceRetentionSettings")(__v.asInstanceOf[js.Any]))
      InitiateDeletionTimestamp.foreach(__v => __obj.updateDynamic("InitiateDeletionTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAppInstanceRetentionSettingsResponse]
    }
  }

  @js.native
  trait PutAppInstanceStreamingConfigurationsRequest extends js.Object {
    var AppInstanceArn: ChimeArn
    var AppInstanceStreamingConfigurations: AppInstanceStreamingConfigurationList
  }

  object PutAppInstanceStreamingConfigurationsRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn,
        AppInstanceStreamingConfigurations: AppInstanceStreamingConfigurationList
    ): PutAppInstanceStreamingConfigurationsRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any],
        "AppInstanceStreamingConfigurations" -> AppInstanceStreamingConfigurations.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutAppInstanceStreamingConfigurationsRequest]
    }
  }

  @js.native
  trait PutAppInstanceStreamingConfigurationsResponse extends js.Object {
    var AppInstanceStreamingConfigurations: js.UndefOr[AppInstanceStreamingConfigurationList]
  }

  object PutAppInstanceStreamingConfigurationsResponse {
    @inline
    def apply(
        AppInstanceStreamingConfigurations: js.UndefOr[AppInstanceStreamingConfigurationList] = js.undefined
    ): PutAppInstanceStreamingConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceStreamingConfigurations.foreach(__v => __obj.updateDynamic("AppInstanceStreamingConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAppInstanceStreamingConfigurationsResponse]
    }
  }

  @js.native
  trait PutEventsConfigurationRequest extends js.Object {
    var AccountId: NonEmptyString
    var BotId: NonEmptyString
    var LambdaFunctionArn: js.UndefOr[SensitiveString]
    var OutboundEventsHTTPSEndpoint: js.UndefOr[SensitiveString]
  }

  object PutEventsConfigurationRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        BotId: NonEmptyString,
        LambdaFunctionArn: js.UndefOr[SensitiveString] = js.undefined,
        OutboundEventsHTTPSEndpoint: js.UndefOr[SensitiveString] = js.undefined
    ): PutEventsConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BotId" -> BotId.asInstanceOf[js.Any]
      )

      LambdaFunctionArn.foreach(__v => __obj.updateDynamic("LambdaFunctionArn")(__v.asInstanceOf[js.Any]))
      OutboundEventsHTTPSEndpoint.foreach(__v => __obj.updateDynamic("OutboundEventsHTTPSEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEventsConfigurationRequest]
    }
  }

  @js.native
  trait PutEventsConfigurationResponse extends js.Object {
    var EventsConfiguration: js.UndefOr[EventsConfiguration]
  }

  object PutEventsConfigurationResponse {
    @inline
    def apply(
        EventsConfiguration: js.UndefOr[EventsConfiguration] = js.undefined
    ): PutEventsConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      EventsConfiguration.foreach(__v => __obj.updateDynamic("EventsConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEventsConfigurationResponse]
    }
  }

  @js.native
  trait PutRetentionSettingsRequest extends js.Object {
    var AccountId: NonEmptyString
    var RetentionSettings: RetentionSettings
  }

  object PutRetentionSettingsRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        RetentionSettings: RetentionSettings
    ): PutRetentionSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "RetentionSettings" -> RetentionSettings.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutRetentionSettingsRequest]
    }
  }

  @js.native
  trait PutRetentionSettingsResponse extends js.Object {
    var InitiateDeletionTimestamp: js.UndefOr[Iso8601Timestamp]
    var RetentionSettings: js.UndefOr[RetentionSettings]
  }

  object PutRetentionSettingsResponse {
    @inline
    def apply(
        InitiateDeletionTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        RetentionSettings: js.UndefOr[RetentionSettings] = js.undefined
    ): PutRetentionSettingsResponse = {
      val __obj = js.Dynamic.literal()
      InitiateDeletionTimestamp.foreach(__v => __obj.updateDynamic("InitiateDeletionTimestamp")(__v.asInstanceOf[js.Any]))
      RetentionSettings.foreach(__v => __obj.updateDynamic("RetentionSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRetentionSettingsResponse]
    }
  }

  @js.native
  trait PutSipMediaApplicationLoggingConfigurationRequest extends js.Object {
    var SipMediaApplicationId: NonEmptyString
    var SipMediaApplicationLoggingConfiguration: js.UndefOr[SipMediaApplicationLoggingConfiguration]
  }

  object PutSipMediaApplicationLoggingConfigurationRequest {
    @inline
    def apply(
        SipMediaApplicationId: NonEmptyString,
        SipMediaApplicationLoggingConfiguration: js.UndefOr[SipMediaApplicationLoggingConfiguration] = js.undefined
    ): PutSipMediaApplicationLoggingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "SipMediaApplicationId" -> SipMediaApplicationId.asInstanceOf[js.Any]
      )

      SipMediaApplicationLoggingConfiguration.foreach(__v => __obj.updateDynamic("SipMediaApplicationLoggingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSipMediaApplicationLoggingConfigurationRequest]
    }
  }

  @js.native
  trait PutSipMediaApplicationLoggingConfigurationResponse extends js.Object {
    var SipMediaApplicationLoggingConfiguration: js.UndefOr[SipMediaApplicationLoggingConfiguration]
  }

  object PutSipMediaApplicationLoggingConfigurationResponse {
    @inline
    def apply(
        SipMediaApplicationLoggingConfiguration: js.UndefOr[SipMediaApplicationLoggingConfiguration] = js.undefined
    ): PutSipMediaApplicationLoggingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      SipMediaApplicationLoggingConfiguration.foreach(__v => __obj.updateDynamic("SipMediaApplicationLoggingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSipMediaApplicationLoggingConfigurationResponse]
    }
  }

  @js.native
  trait PutVoiceConnectorEmergencyCallingConfigurationRequest extends js.Object {
    var EmergencyCallingConfiguration: EmergencyCallingConfiguration
    var VoiceConnectorId: NonEmptyString
  }

  object PutVoiceConnectorEmergencyCallingConfigurationRequest {
    @inline
    def apply(
        EmergencyCallingConfiguration: EmergencyCallingConfiguration,
        VoiceConnectorId: NonEmptyString
    ): PutVoiceConnectorEmergencyCallingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "EmergencyCallingConfiguration" -> EmergencyCallingConfiguration.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutVoiceConnectorEmergencyCallingConfigurationRequest]
    }
  }

  @js.native
  trait PutVoiceConnectorEmergencyCallingConfigurationResponse extends js.Object {
    var EmergencyCallingConfiguration: js.UndefOr[EmergencyCallingConfiguration]
  }

  object PutVoiceConnectorEmergencyCallingConfigurationResponse {
    @inline
    def apply(
        EmergencyCallingConfiguration: js.UndefOr[EmergencyCallingConfiguration] = js.undefined
    ): PutVoiceConnectorEmergencyCallingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      EmergencyCallingConfiguration.foreach(__v => __obj.updateDynamic("EmergencyCallingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutVoiceConnectorEmergencyCallingConfigurationResponse]
    }
  }

  @js.native
  trait PutVoiceConnectorLoggingConfigurationRequest extends js.Object {
    var LoggingConfiguration: LoggingConfiguration
    var VoiceConnectorId: NonEmptyString
  }

  object PutVoiceConnectorLoggingConfigurationRequest {
    @inline
    def apply(
        LoggingConfiguration: LoggingConfiguration,
        VoiceConnectorId: NonEmptyString
    ): PutVoiceConnectorLoggingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "LoggingConfiguration" -> LoggingConfiguration.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutVoiceConnectorLoggingConfigurationRequest]
    }
  }

  @js.native
  trait PutVoiceConnectorLoggingConfigurationResponse extends js.Object {
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration]
  }

  object PutVoiceConnectorLoggingConfigurationResponse {
    @inline
    def apply(
        LoggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined
    ): PutVoiceConnectorLoggingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      LoggingConfiguration.foreach(__v => __obj.updateDynamic("LoggingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutVoiceConnectorLoggingConfigurationResponse]
    }
  }

  @js.native
  trait PutVoiceConnectorOriginationRequest extends js.Object {
    var Origination: Origination
    var VoiceConnectorId: NonEmptyString
  }

  object PutVoiceConnectorOriginationRequest {
    @inline
    def apply(
        Origination: Origination,
        VoiceConnectorId: NonEmptyString
    ): PutVoiceConnectorOriginationRequest = {
      val __obj = js.Dynamic.literal(
        "Origination" -> Origination.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutVoiceConnectorOriginationRequest]
    }
  }

  @js.native
  trait PutVoiceConnectorOriginationResponse extends js.Object {
    var Origination: js.UndefOr[Origination]
  }

  object PutVoiceConnectorOriginationResponse {
    @inline
    def apply(
        Origination: js.UndefOr[Origination] = js.undefined
    ): PutVoiceConnectorOriginationResponse = {
      val __obj = js.Dynamic.literal()
      Origination.foreach(__v => __obj.updateDynamic("Origination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutVoiceConnectorOriginationResponse]
    }
  }

  @js.native
  trait PutVoiceConnectorProxyRequest extends js.Object {
    var DefaultSessionExpiryMinutes: Int
    var PhoneNumberPoolCountries: CountryList
    var VoiceConnectorId: NonEmptyString128
    var Disabled: js.UndefOr[Boolean]
    var FallBackPhoneNumber: js.UndefOr[E164PhoneNumber]
  }

  object PutVoiceConnectorProxyRequest {
    @inline
    def apply(
        DefaultSessionExpiryMinutes: Int,
        PhoneNumberPoolCountries: CountryList,
        VoiceConnectorId: NonEmptyString128,
        Disabled: js.UndefOr[Boolean] = js.undefined,
        FallBackPhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
    ): PutVoiceConnectorProxyRequest = {
      val __obj = js.Dynamic.literal(
        "DefaultSessionExpiryMinutes" -> DefaultSessionExpiryMinutes.asInstanceOf[js.Any],
        "PhoneNumberPoolCountries" -> PhoneNumberPoolCountries.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      FallBackPhoneNumber.foreach(__v => __obj.updateDynamic("FallBackPhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutVoiceConnectorProxyRequest]
    }
  }

  @js.native
  trait PutVoiceConnectorProxyResponse extends js.Object {
    var Proxy: js.UndefOr[Proxy]
  }

  object PutVoiceConnectorProxyResponse {
    @inline
    def apply(
        Proxy: js.UndefOr[Proxy] = js.undefined
    ): PutVoiceConnectorProxyResponse = {
      val __obj = js.Dynamic.literal()
      Proxy.foreach(__v => __obj.updateDynamic("Proxy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutVoiceConnectorProxyResponse]
    }
  }

  @js.native
  trait PutVoiceConnectorStreamingConfigurationRequest extends js.Object {
    var StreamingConfiguration: StreamingConfiguration
    var VoiceConnectorId: NonEmptyString
  }

  object PutVoiceConnectorStreamingConfigurationRequest {
    @inline
    def apply(
        StreamingConfiguration: StreamingConfiguration,
        VoiceConnectorId: NonEmptyString
    ): PutVoiceConnectorStreamingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "StreamingConfiguration" -> StreamingConfiguration.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutVoiceConnectorStreamingConfigurationRequest]
    }
  }

  @js.native
  trait PutVoiceConnectorStreamingConfigurationResponse extends js.Object {
    var StreamingConfiguration: js.UndefOr[StreamingConfiguration]
  }

  object PutVoiceConnectorStreamingConfigurationResponse {
    @inline
    def apply(
        StreamingConfiguration: js.UndefOr[StreamingConfiguration] = js.undefined
    ): PutVoiceConnectorStreamingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      StreamingConfiguration.foreach(__v => __obj.updateDynamic("StreamingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutVoiceConnectorStreamingConfigurationResponse]
    }
  }

  @js.native
  trait PutVoiceConnectorTerminationCredentialsRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
    var Credentials: js.UndefOr[CredentialList]
  }

  object PutVoiceConnectorTerminationCredentialsRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString,
        Credentials: js.UndefOr[CredentialList] = js.undefined
    ): PutVoiceConnectorTerminationCredentialsRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      Credentials.foreach(__v => __obj.updateDynamic("Credentials")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutVoiceConnectorTerminationCredentialsRequest]
    }
  }

  @js.native
  trait PutVoiceConnectorTerminationRequest extends js.Object {
    var Termination: Termination
    var VoiceConnectorId: NonEmptyString
  }

  object PutVoiceConnectorTerminationRequest {
    @inline
    def apply(
        Termination: Termination,
        VoiceConnectorId: NonEmptyString
    ): PutVoiceConnectorTerminationRequest = {
      val __obj = js.Dynamic.literal(
        "Termination" -> Termination.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutVoiceConnectorTerminationRequest]
    }
  }

  @js.native
  trait PutVoiceConnectorTerminationResponse extends js.Object {
    var Termination: js.UndefOr[Termination]
  }

  object PutVoiceConnectorTerminationResponse {
    @inline
    def apply(
        Termination: js.UndefOr[Termination] = js.undefined
    ): PutVoiceConnectorTerminationResponse = {
      val __obj = js.Dynamic.literal()
      Termination.foreach(__v => __obj.updateDynamic("Termination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutVoiceConnectorTerminationResponse]
    }
  }

  @js.native
  trait RedactChannelMessageRequest extends js.Object {
    var ChannelArn: ChimeArn
    var MessageId: MessageId
    var ChimeBearer: js.UndefOr[ChimeArn]
  }

  object RedactChannelMessageRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        MessageId: MessageId,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
    ): RedactChannelMessageRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "MessageId" -> MessageId.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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
  trait RedactConversationMessageRequest extends js.Object {
    var AccountId: NonEmptyString
    var ConversationId: NonEmptyString
    var MessageId: NonEmptyString
  }

  object RedactConversationMessageRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        ConversationId: NonEmptyString,
        MessageId: NonEmptyString
    ): RedactConversationMessageRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "ConversationId" -> ConversationId.asInstanceOf[js.Any],
        "MessageId" -> MessageId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RedactConversationMessageRequest]
    }
  }

  @js.native
  trait RedactConversationMessageResponse extends js.Object

  object RedactConversationMessageResponse {
    @inline
    def apply(): RedactConversationMessageResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedactConversationMessageResponse]
    }
  }

  @js.native
  trait RedactRoomMessageRequest extends js.Object {
    var AccountId: NonEmptyString
    var MessageId: NonEmptyString
    var RoomId: NonEmptyString
  }

  object RedactRoomMessageRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        MessageId: NonEmptyString,
        RoomId: NonEmptyString
    ): RedactRoomMessageRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "MessageId" -> MessageId.asInstanceOf[js.Any],
        "RoomId" -> RoomId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RedactRoomMessageRequest]
    }
  }

  @js.native
  trait RedactRoomMessageResponse extends js.Object

  object RedactRoomMessageResponse {
    @inline
    def apply(): RedactRoomMessageResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedactRoomMessageResponse]
    }
  }

  @js.native
  trait RegenerateSecurityTokenRequest extends js.Object {
    var AccountId: NonEmptyString
    var BotId: NonEmptyString
  }

  object RegenerateSecurityTokenRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        BotId: NonEmptyString
    ): RegenerateSecurityTokenRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BotId" -> BotId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegenerateSecurityTokenRequest]
    }
  }

  @js.native
  trait RegenerateSecurityTokenResponse extends js.Object {
    var Bot: js.UndefOr[Bot]
  }

  object RegenerateSecurityTokenResponse {
    @inline
    def apply(
        Bot: js.UndefOr[Bot] = js.undefined
    ): RegenerateSecurityTokenResponse = {
      val __obj = js.Dynamic.literal()
      Bot.foreach(__v => __obj.updateDynamic("Bot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegenerateSecurityTokenResponse]
    }
  }

  @js.native
  trait ResetPersonalPINRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserId: NonEmptyString
  }

  object ResetPersonalPINRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        UserId: NonEmptyString
    ): ResetPersonalPINRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResetPersonalPINRequest]
    }
  }

  @js.native
  trait ResetPersonalPINResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object ResetPersonalPINResponse {
    @inline
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): ResetPersonalPINResponse = {
      val __obj = js.Dynamic.literal()
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetPersonalPINResponse]
    }
  }

  @js.native
  trait RestorePhoneNumberRequest extends js.Object {
    var PhoneNumberId: NonEmptyString
  }

  object RestorePhoneNumberRequest {
    @inline
    def apply(
        PhoneNumberId: NonEmptyString
    ): RestorePhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RestorePhoneNumberRequest]
    }
  }

  @js.native
  trait RestorePhoneNumberResponse extends js.Object {
    var PhoneNumber: js.UndefOr[PhoneNumber]
  }

  object RestorePhoneNumberResponse {
    @inline
    def apply(
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): RestorePhoneNumberResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestorePhoneNumberResponse]
    }
  }

  /** The retention settings for an Amazon Chime Enterprise account that determine how long to retain items such as chat-room messages and chat-conversation messages.
    */
  @js.native
  trait RetentionSettings extends js.Object {
    var ConversationRetentionSettings: js.UndefOr[ConversationRetentionSettings]
    var RoomRetentionSettings: js.UndefOr[RoomRetentionSettings]
  }

  object RetentionSettings {
    @inline
    def apply(
        ConversationRetentionSettings: js.UndefOr[ConversationRetentionSettings] = js.undefined,
        RoomRetentionSettings: js.UndefOr[RoomRetentionSettings] = js.undefined
    ): RetentionSettings = {
      val __obj = js.Dynamic.literal()
      ConversationRetentionSettings.foreach(__v => __obj.updateDynamic("ConversationRetentionSettings")(__v.asInstanceOf[js.Any]))
      RoomRetentionSettings.foreach(__v => __obj.updateDynamic("RoomRetentionSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetentionSettings]
    }
  }

  /** The Amazon Chime chat room details.
    */
  @js.native
  trait Room extends js.Object {
    var AccountId: js.UndefOr[NonEmptyString]
    var CreatedBy: js.UndefOr[NonEmptyString]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var Name: js.UndefOr[SensitiveString]
    var RoomId: js.UndefOr[NonEmptyString]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  object Room {
    @inline
    def apply(
        AccountId: js.UndefOr[NonEmptyString] = js.undefined,
        CreatedBy: js.UndefOr[NonEmptyString] = js.undefined,
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        Name: js.UndefOr[SensitiveString] = js.undefined,
        RoomId: js.UndefOr[NonEmptyString] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): Room = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoomId.foreach(__v => __obj.updateDynamic("RoomId")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Room]
    }
  }

  /** The room membership details.
    */
  @js.native
  trait RoomMembership extends js.Object {
    var InvitedBy: js.UndefOr[NonEmptyString]
    var Member: js.UndefOr[Member]
    var Role: js.UndefOr[RoomMembershipRole]
    var RoomId: js.UndefOr[NonEmptyString]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  object RoomMembership {
    @inline
    def apply(
        InvitedBy: js.UndefOr[NonEmptyString] = js.undefined,
        Member: js.UndefOr[Member] = js.undefined,
        Role: js.UndefOr[RoomMembershipRole] = js.undefined,
        RoomId: js.UndefOr[NonEmptyString] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): RoomMembership = {
      val __obj = js.Dynamic.literal()
      InvitedBy.foreach(__v => __obj.updateDynamic("InvitedBy")(__v.asInstanceOf[js.Any]))
      Member.foreach(__v => __obj.updateDynamic("Member")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      RoomId.foreach(__v => __obj.updateDynamic("RoomId")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoomMembership]
    }
  }

  /** The retention settings that determine how long to retain chat-room messages for an Amazon Chime Enterprise account.
    */
  @js.native
  trait RoomRetentionSettings extends js.Object {
    var RetentionDays: js.UndefOr[RetentionDays]
  }

  object RoomRetentionSettings {
    @inline
    def apply(
        RetentionDays: js.UndefOr[RetentionDays] = js.undefined
    ): RoomRetentionSettings = {
      val __obj = js.Dynamic.literal()
      RetentionDays.foreach(__v => __obj.updateDynamic("RetentionDays")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoomRetentionSettings]
    }
  }

  @js.native
  trait SearchAvailablePhoneNumbersRequest extends js.Object {
    var AreaCode: js.UndefOr[String]
    var City: js.UndefOr[String]
    var Country: js.UndefOr[Alpha2CountryCode]
    var MaxResults: js.UndefOr[PhoneNumberMaxResults]
    var NextToken: js.UndefOr[String]
    var PhoneNumberType: js.UndefOr[PhoneNumberType]
    var State: js.UndefOr[String]
    var TollFreePrefix: js.UndefOr[TollFreePrefix]
  }

  object SearchAvailablePhoneNumbersRequest {
    @inline
    def apply(
        AreaCode: js.UndefOr[String] = js.undefined,
        City: js.UndefOr[String] = js.undefined,
        Country: js.UndefOr[Alpha2CountryCode] = js.undefined,
        MaxResults: js.UndefOr[PhoneNumberMaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        PhoneNumberType: js.UndefOr[PhoneNumberType] = js.undefined,
        State: js.UndefOr[String] = js.undefined,
        TollFreePrefix: js.UndefOr[TollFreePrefix] = js.undefined
    ): SearchAvailablePhoneNumbersRequest = {
      val __obj = js.Dynamic.literal()
      AreaCode.foreach(__v => __obj.updateDynamic("AreaCode")(__v.asInstanceOf[js.Any]))
      City.foreach(__v => __obj.updateDynamic("City")(__v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.updateDynamic("Country")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PhoneNumberType.foreach(__v => __obj.updateDynamic("PhoneNumberType")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      TollFreePrefix.foreach(__v => __obj.updateDynamic("TollFreePrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchAvailablePhoneNumbersRequest]
    }
  }

  @js.native
  trait SearchAvailablePhoneNumbersResponse extends js.Object {
    var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList]
    var NextToken: js.UndefOr[String]
  }

  object SearchAvailablePhoneNumbersResponse {
    @inline
    def apply(
        E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): SearchAvailablePhoneNumbersResponse = {
      val __obj = js.Dynamic.literal()
      E164PhoneNumbers.foreach(__v => __obj.updateDynamic("E164PhoneNumbers")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchAvailablePhoneNumbersResponse]
    }
  }

  /** The video streams to capture for a specified media capture pipeline. The total number of video streams can't exceed 25.
    */
  @js.native
  trait SelectedVideoStreams extends js.Object {
    var AttendeeIds: js.UndefOr[AttendeeIdList]
    var ExternalUserIds: js.UndefOr[ExternalUserIdList]
  }

  object SelectedVideoStreams {
    @inline
    def apply(
        AttendeeIds: js.UndefOr[AttendeeIdList] = js.undefined,
        ExternalUserIds: js.UndefOr[ExternalUserIdList] = js.undefined
    ): SelectedVideoStreams = {
      val __obj = js.Dynamic.literal()
      AttendeeIds.foreach(__v => __obj.updateDynamic("AttendeeIds")(__v.asInstanceOf[js.Any]))
      ExternalUserIds.foreach(__v => __obj.updateDynamic("ExternalUserIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelectedVideoStreams]
    }
  }

  @js.native
  trait SendChannelMessageRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ClientRequestToken: ClientRequestToken
    var Content: NonEmptyContent
    var Persistence: ChannelMessagePersistenceType
    var Type: ChannelMessageType
    var ChimeBearer: js.UndefOr[ChimeArn]
    var Metadata: js.UndefOr[Metadata]
  }

  object SendChannelMessageRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ClientRequestToken: ClientRequestToken,
        Content: NonEmptyContent,
        Persistence: ChannelMessagePersistenceType,
        Type: ChannelMessageType,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined
    ): SendChannelMessageRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "Content" -> Content.asInstanceOf[js.Any],
        "Persistence" -> Persistence.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendChannelMessageRequest]
    }
  }

  @js.native
  trait SendChannelMessageResponse extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var MessageId: js.UndefOr[MessageId]
  }

  object SendChannelMessageResponse {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        MessageId: js.UndefOr[MessageId] = js.undefined
    ): SendChannelMessageResponse = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendChannelMessageResponse]
    }
  }

  /** An Active Directory (AD) group whose members are granted permission to act as delegates.
    */
  @js.native
  trait SigninDelegateGroup extends js.Object {
    var GroupName: js.UndefOr[NonEmptyString]
  }

  object SigninDelegateGroup {
    @inline
    def apply(
        GroupName: js.UndefOr[NonEmptyString] = js.undefined
    ): SigninDelegateGroup = {
      val __obj = js.Dynamic.literal()
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SigninDelegateGroup]
    }
  }

  /** The details of the SIP media application, including name and endpoints. An AWS account can have multiple SIP media applications.
    */
  @js.native
  trait SipMediaApplication extends js.Object {
    var AwsRegion: js.UndefOr[String]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var Endpoints: js.UndefOr[SipMediaApplicationEndpointList]
    var Name: js.UndefOr[SipMediaApplicationName]
    var SipMediaApplicationId: js.UndefOr[NonEmptyString]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  object SipMediaApplication {
    @inline
    def apply(
        AwsRegion: js.UndefOr[String] = js.undefined,
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        Endpoints: js.UndefOr[SipMediaApplicationEndpointList] = js.undefined,
        Name: js.UndefOr[SipMediaApplicationName] = js.undefined,
        SipMediaApplicationId: js.UndefOr[NonEmptyString] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): SipMediaApplication = {
      val __obj = js.Dynamic.literal()
      AwsRegion.foreach(__v => __obj.updateDynamic("AwsRegion")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SipMediaApplicationId.foreach(__v => __obj.updateDynamic("SipMediaApplicationId")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SipMediaApplication]
    }
  }

  /** A <code>Call</code> instance for a SIP media application.
    */
  @js.native
  trait SipMediaApplicationCall extends js.Object {
    var TransactionId: js.UndefOr[GuidString]
  }

  object SipMediaApplicationCall {
    @inline
    def apply(
        TransactionId: js.UndefOr[GuidString] = js.undefined
    ): SipMediaApplicationCall = {
      val __obj = js.Dynamic.literal()
      TransactionId.foreach(__v => __obj.updateDynamic("TransactionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SipMediaApplicationCall]
    }
  }

  /** The endpoint assigned to the SIP media application.
    */
  @js.native
  trait SipMediaApplicationEndpoint extends js.Object {
    var LambdaArn: js.UndefOr[FunctionArn]
  }

  object SipMediaApplicationEndpoint {
    @inline
    def apply(
        LambdaArn: js.UndefOr[FunctionArn] = js.undefined
    ): SipMediaApplicationEndpoint = {
      val __obj = js.Dynamic.literal()
      LambdaArn.foreach(__v => __obj.updateDynamic("LambdaArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SipMediaApplicationEndpoint]
    }
  }

  /** Logging configuration of the SIP media application.
    */
  @js.native
  trait SipMediaApplicationLoggingConfiguration extends js.Object {
    var EnableSipMediaApplicationMessageLogs: js.UndefOr[Boolean]
  }

  object SipMediaApplicationLoggingConfiguration {
    @inline
    def apply(
        EnableSipMediaApplicationMessageLogs: js.UndefOr[Boolean] = js.undefined
    ): SipMediaApplicationLoggingConfiguration = {
      val __obj = js.Dynamic.literal()
      EnableSipMediaApplicationMessageLogs.foreach(__v => __obj.updateDynamic("EnableSipMediaApplicationMessageLogs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SipMediaApplicationLoggingConfiguration]
    }
  }

  /** The SIP rule details, including name, triggers, and target applications. An AWS account can have multiple SIP rules.
    */
  @js.native
  trait SipRule extends js.Object {
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var Disabled: js.UndefOr[Boolean]
    var Name: js.UndefOr[SipRuleName]
    var SipRuleId: js.UndefOr[NonEmptyString]
    var TargetApplications: js.UndefOr[SipRuleTargetApplicationList]
    var TriggerType: js.UndefOr[SipRuleTriggerType]
    var TriggerValue: js.UndefOr[NonEmptyString]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  object SipRule {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        Disabled: js.UndefOr[Boolean] = js.undefined,
        Name: js.UndefOr[SipRuleName] = js.undefined,
        SipRuleId: js.UndefOr[NonEmptyString] = js.undefined,
        TargetApplications: js.UndefOr[SipRuleTargetApplicationList] = js.undefined,
        TriggerType: js.UndefOr[SipRuleTriggerType] = js.undefined,
        TriggerValue: js.UndefOr[NonEmptyString] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): SipRule = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SipRuleId.foreach(__v => __obj.updateDynamic("SipRuleId")(__v.asInstanceOf[js.Any]))
      TargetApplications.foreach(__v => __obj.updateDynamic("TargetApplications")(__v.asInstanceOf[js.Any]))
      TriggerType.foreach(__v => __obj.updateDynamic("TriggerType")(__v.asInstanceOf[js.Any]))
      TriggerValue.foreach(__v => __obj.updateDynamic("TriggerValue")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SipRule]
    }
  }

  /** Target SIP media application and other details, such as priority and AWS Region, to be specified in the SIP rule. Only one SIP rule per AWS Region can be provided.
    */
  @js.native
  trait SipRuleTargetApplication extends js.Object {
    var AwsRegion: js.UndefOr[String]
    var Priority: js.UndefOr[SipApplicationPriority]
    var SipMediaApplicationId: js.UndefOr[NonEmptyString]
  }

  object SipRuleTargetApplication {
    @inline
    def apply(
        AwsRegion: js.UndefOr[String] = js.undefined,
        Priority: js.UndefOr[SipApplicationPriority] = js.undefined,
        SipMediaApplicationId: js.UndefOr[NonEmptyString] = js.undefined
    ): SipRuleTargetApplication = {
      val __obj = js.Dynamic.literal()
      AwsRegion.foreach(__v => __obj.updateDynamic("AwsRegion")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      SipMediaApplicationId.foreach(__v => __obj.updateDynamic("SipMediaApplicationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SipRuleTargetApplication]
    }
  }

  /** Source configuration for a specified media capture pipeline.
    */
  @js.native
  trait SourceConfiguration extends js.Object {
    var SelectedVideoStreams: js.UndefOr[SelectedVideoStreams]
  }

  object SourceConfiguration {
    @inline
    def apply(
        SelectedVideoStreams: js.UndefOr[SelectedVideoStreams] = js.undefined
    ): SourceConfiguration = {
      val __obj = js.Dynamic.literal()
      SelectedVideoStreams.foreach(__v => __obj.updateDynamic("SelectedVideoStreams")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceConfiguration]
    }
  }

  @js.native
  trait StartMeetingTranscriptionRequest extends js.Object {
    var MeetingId: GuidString
    var TranscriptionConfiguration: TranscriptionConfiguration
  }

  object StartMeetingTranscriptionRequest {
    @inline
    def apply(
        MeetingId: GuidString,
        TranscriptionConfiguration: TranscriptionConfiguration
    ): StartMeetingTranscriptionRequest = {
      val __obj = js.Dynamic.literal(
        "MeetingId" -> MeetingId.asInstanceOf[js.Any],
        "TranscriptionConfiguration" -> TranscriptionConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartMeetingTranscriptionRequest]
    }
  }

  @js.native
  trait StartMeetingTranscriptionResponse extends js.Object

  object StartMeetingTranscriptionResponse {
    @inline
    def apply(): StartMeetingTranscriptionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartMeetingTranscriptionResponse]
    }
  }

  @js.native
  trait StopMeetingTranscriptionRequest extends js.Object {
    var MeetingId: GuidString
  }

  object StopMeetingTranscriptionRequest {
    @inline
    def apply(
        MeetingId: GuidString
    ): StopMeetingTranscriptionRequest = {
      val __obj = js.Dynamic.literal(
        "MeetingId" -> MeetingId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopMeetingTranscriptionRequest]
    }
  }

  @js.native
  trait StopMeetingTranscriptionResponse extends js.Object

  object StopMeetingTranscriptionResponse {
    @inline
    def apply(): StopMeetingTranscriptionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopMeetingTranscriptionResponse]
    }
  }

  /** The streaming configuration associated with an Amazon Chime Voice Connector. Specifies whether media streaming is enabled for sending to Amazon Kinesis, and shows the retention period for the Amazon Kinesis data, in hours.
    */
  @js.native
  trait StreamingConfiguration extends js.Object {
    var DataRetentionInHours: DataRetentionInHours
    var Disabled: js.UndefOr[Boolean]
    var StreamingNotificationTargets: js.UndefOr[StreamingNotificationTargetList]
  }

  object StreamingConfiguration {
    @inline
    def apply(
        DataRetentionInHours: DataRetentionInHours,
        Disabled: js.UndefOr[Boolean] = js.undefined,
        StreamingNotificationTargets: js.UndefOr[StreamingNotificationTargetList] = js.undefined
    ): StreamingConfiguration = {
      val __obj = js.Dynamic.literal(
        "DataRetentionInHours" -> DataRetentionInHours.asInstanceOf[js.Any]
      )

      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      StreamingNotificationTargets.foreach(__v => __obj.updateDynamic("StreamingNotificationTargets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamingConfiguration]
    }
  }

  /** The targeted recipient for a streaming configuration notification.
    */
  @js.native
  trait StreamingNotificationTarget extends js.Object {
    var NotificationTarget: NotificationTarget
  }

  object StreamingNotificationTarget {
    @inline
    def apply(
        NotificationTarget: NotificationTarget
    ): StreamingNotificationTarget = {
      val __obj = js.Dynamic.literal(
        "NotificationTarget" -> NotificationTarget.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StreamingNotificationTarget]
    }
  }

  /** Describes a tag applied to a resource.
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
  trait TagAttendeeRequest extends js.Object {
    var AttendeeId: GuidString
    var MeetingId: GuidString
    var Tags: AttendeeTagList
  }

  object TagAttendeeRequest {
    @inline
    def apply(
        AttendeeId: GuidString,
        MeetingId: GuidString,
        Tags: AttendeeTagList
    ): TagAttendeeRequest = {
      val __obj = js.Dynamic.literal(
        "AttendeeId" -> AttendeeId.asInstanceOf[js.Any],
        "MeetingId" -> MeetingId.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagAttendeeRequest]
    }
  }

  @js.native
  trait TagMeetingRequest extends js.Object {
    var MeetingId: GuidString
    var Tags: MeetingTagList
  }

  object TagMeetingRequest {
    @inline
    def apply(
        MeetingId: GuidString,
        Tags: MeetingTagList
    ): TagMeetingRequest = {
      val __obj = js.Dynamic.literal(
        "MeetingId" -> MeetingId.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagMeetingRequest]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: Arn
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: Arn,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  /** Settings that allow management of telephony permissions for an Amazon Chime user, such as inbound and outbound calling and text messaging.
    */
  @js.native
  trait TelephonySettings extends js.Object {
    var InboundCalling: Boolean
    var OutboundCalling: Boolean
    var SMS: Boolean
  }

  object TelephonySettings {
    @inline
    def apply(
        InboundCalling: Boolean,
        OutboundCalling: Boolean,
        SMS: Boolean
    ): TelephonySettings = {
      val __obj = js.Dynamic.literal(
        "InboundCalling" -> InboundCalling.asInstanceOf[js.Any],
        "OutboundCalling" -> OutboundCalling.asInstanceOf[js.Any],
        "SMS" -> SMS.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TelephonySettings]
    }
  }

  /** Termination settings enable your SIP hosts to make outbound calls using your Amazon Chime Voice Connector.
    */
  @js.native
  trait Termination extends js.Object {
    var CallingRegions: js.UndefOr[CallingRegionList]
    var CidrAllowedList: js.UndefOr[StringList]
    var CpsLimit: js.UndefOr[CpsLimit]
    var DefaultPhoneNumber: js.UndefOr[E164PhoneNumber]
    var Disabled: js.UndefOr[Boolean]
  }

  object Termination {
    @inline
    def apply(
        CallingRegions: js.UndefOr[CallingRegionList] = js.undefined,
        CidrAllowedList: js.UndefOr[StringList] = js.undefined,
        CpsLimit: js.UndefOr[CpsLimit] = js.undefined,
        DefaultPhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined,
        Disabled: js.UndefOr[Boolean] = js.undefined
    ): Termination = {
      val __obj = js.Dynamic.literal()
      CallingRegions.foreach(__v => __obj.updateDynamic("CallingRegions")(__v.asInstanceOf[js.Any]))
      CidrAllowedList.foreach(__v => __obj.updateDynamic("CidrAllowedList")(__v.asInstanceOf[js.Any]))
      CpsLimit.foreach(__v => __obj.updateDynamic("CpsLimit")(__v.asInstanceOf[js.Any]))
      DefaultPhoneNumber.foreach(__v => __obj.updateDynamic("DefaultPhoneNumber")(__v.asInstanceOf[js.Any]))
      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Termination]
    }
  }

  /** The termination health details, including the source IP address and timestamp of the last successful SIP <code>OPTIONS</code> message from your SIP infrastructure.
    */
  @js.native
  trait TerminationHealth extends js.Object {
    var Source: js.UndefOr[String]
    var Timestamp: js.UndefOr[Iso8601Timestamp]
  }

  object TerminationHealth {
    @inline
    def apply(
        Source: js.UndefOr[String] = js.undefined,
        Timestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): TerminationHealth = {
      val __obj = js.Dynamic.literal()
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminationHealth]
    }
  }

  /** The configuration for the current transcription operation. Must contain <code>EngineTranscribeSettings</code> or <code>EngineTranscribeMedicalSettings</code>.
    */
  @js.native
  trait TranscriptionConfiguration extends js.Object {
    var EngineTranscribeMedicalSettings: js.UndefOr[EngineTranscribeMedicalSettings]
    var EngineTranscribeSettings: js.UndefOr[EngineTranscribeSettings]
  }

  object TranscriptionConfiguration {
    @inline
    def apply(
        EngineTranscribeMedicalSettings: js.UndefOr[EngineTranscribeMedicalSettings] = js.undefined,
        EngineTranscribeSettings: js.UndefOr[EngineTranscribeSettings] = js.undefined
    ): TranscriptionConfiguration = {
      val __obj = js.Dynamic.literal()
      EngineTranscribeMedicalSettings.foreach(__v => __obj.updateDynamic("EngineTranscribeMedicalSettings")(__v.asInstanceOf[js.Any]))
      EngineTranscribeSettings.foreach(__v => __obj.updateDynamic("EngineTranscribeSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TranscriptionConfiguration]
    }
  }

  @js.native
  trait UntagAttendeeRequest extends js.Object {
    var AttendeeId: GuidString
    var MeetingId: GuidString
    var TagKeys: AttendeeTagKeyList
  }

  object UntagAttendeeRequest {
    @inline
    def apply(
        AttendeeId: GuidString,
        MeetingId: GuidString,
        TagKeys: AttendeeTagKeyList
    ): UntagAttendeeRequest = {
      val __obj = js.Dynamic.literal(
        "AttendeeId" -> AttendeeId.asInstanceOf[js.Any],
        "MeetingId" -> MeetingId.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagAttendeeRequest]
    }
  }

  @js.native
  trait UntagMeetingRequest extends js.Object {
    var MeetingId: GuidString
    var TagKeys: MeetingTagKeyList
  }

  object UntagMeetingRequest {
    @inline
    def apply(
        MeetingId: GuidString,
        TagKeys: MeetingTagKeyList
    ): UntagMeetingRequest = {
      val __obj = js.Dynamic.literal(
        "MeetingId" -> MeetingId.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagMeetingRequest]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: Arn,
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
  trait UpdateAccountRequest extends js.Object {
    var AccountId: NonEmptyString
    var DefaultLicense: js.UndefOr[License]
    var Name: js.UndefOr[AccountName]
  }

  object UpdateAccountRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        DefaultLicense: js.UndefOr[License] = js.undefined,
        Name: js.UndefOr[AccountName] = js.undefined
    ): UpdateAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      DefaultLicense.foreach(__v => __obj.updateDynamic("DefaultLicense")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccountRequest]
    }
  }

  @js.native
  trait UpdateAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  object UpdateAccountResponse {
    @inline
    def apply(
        Account: js.UndefOr[Account] = js.undefined
    ): UpdateAccountResponse = {
      val __obj = js.Dynamic.literal()
      Account.foreach(__v => __obj.updateDynamic("Account")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccountResponse]
    }
  }

  @js.native
  trait UpdateAccountSettingsRequest extends js.Object {
    var AccountId: NonEmptyString
    var AccountSettings: AccountSettings
  }

  object UpdateAccountSettingsRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        AccountSettings: AccountSettings
    ): UpdateAccountSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "AccountSettings" -> AccountSettings.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateAccountSettingsRequest]
    }
  }

  @js.native
  trait UpdateAccountSettingsResponse extends js.Object

  object UpdateAccountSettingsResponse {
    @inline
    def apply(): UpdateAccountSettingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateAccountSettingsResponse]
    }
  }

  @js.native
  trait UpdateAppInstanceRequest extends js.Object {
    var AppInstanceArn: ChimeArn
    var Name: NonEmptyResourceName
    var Metadata: js.UndefOr[Metadata]
  }

  object UpdateAppInstanceRequest {
    @inline
    def apply(
        AppInstanceArn: ChimeArn,
        Name: NonEmptyResourceName,
        Metadata: js.UndefOr[Metadata] = js.undefined
    ): UpdateAppInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceArn" -> AppInstanceArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAppInstanceRequest]
    }
  }

  @js.native
  trait UpdateAppInstanceResponse extends js.Object {
    var AppInstanceArn: js.UndefOr[ChimeArn]
  }

  object UpdateAppInstanceResponse {
    @inline
    def apply(
        AppInstanceArn: js.UndefOr[ChimeArn] = js.undefined
    ): UpdateAppInstanceResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceArn.foreach(__v => __obj.updateDynamic("AppInstanceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAppInstanceResponse]
    }
  }

  @js.native
  trait UpdateAppInstanceUserRequest extends js.Object {
    var AppInstanceUserArn: ChimeArn
    var Name: UserName
    var Metadata: js.UndefOr[Metadata]
  }

  object UpdateAppInstanceUserRequest {
    @inline
    def apply(
        AppInstanceUserArn: ChimeArn,
        Name: UserName,
        Metadata: js.UndefOr[Metadata] = js.undefined
    ): UpdateAppInstanceUserRequest = {
      val __obj = js.Dynamic.literal(
        "AppInstanceUserArn" -> AppInstanceUserArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAppInstanceUserRequest]
    }
  }

  @js.native
  trait UpdateAppInstanceUserResponse extends js.Object {
    var AppInstanceUserArn: js.UndefOr[ChimeArn]
  }

  object UpdateAppInstanceUserResponse {
    @inline
    def apply(
        AppInstanceUserArn: js.UndefOr[ChimeArn] = js.undefined
    ): UpdateAppInstanceUserResponse = {
      val __obj = js.Dynamic.literal()
      AppInstanceUserArn.foreach(__v => __obj.updateDynamic("AppInstanceUserArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAppInstanceUserResponse]
    }
  }

  @js.native
  trait UpdateBotRequest extends js.Object {
    var AccountId: NonEmptyString
    var BotId: NonEmptyString
    var Disabled: js.UndefOr[NullableBoolean]
  }

  object UpdateBotRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        BotId: NonEmptyString,
        Disabled: js.UndefOr[NullableBoolean] = js.undefined
    ): UpdateBotRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "BotId" -> BotId.asInstanceOf[js.Any]
      )

      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBotRequest]
    }
  }

  @js.native
  trait UpdateBotResponse extends js.Object {
    var Bot: js.UndefOr[Bot]
  }

  object UpdateBotResponse {
    @inline
    def apply(
        Bot: js.UndefOr[Bot] = js.undefined
    ): UpdateBotResponse = {
      val __obj = js.Dynamic.literal()
      Bot.foreach(__v => __obj.updateDynamic("Bot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBotResponse]
    }
  }

  @js.native
  trait UpdateChannelMessageRequest extends js.Object {
    var ChannelArn: ChimeArn
    var MessageId: MessageId
    var ChimeBearer: js.UndefOr[ChimeArn]
    var Content: js.UndefOr[Content]
    var Metadata: js.UndefOr[Metadata]
  }

  object UpdateChannelMessageRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        MessageId: MessageId,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined,
        Content: js.UndefOr[Content] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined
    ): UpdateChannelMessageRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "MessageId" -> MessageId.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChannelMessageRequest]
    }
  }

  @js.native
  trait UpdateChannelMessageResponse extends js.Object {
    var ChannelArn: js.UndefOr[ChimeArn]
    var MessageId: js.UndefOr[MessageId]
  }

  object UpdateChannelMessageResponse {
    @inline
    def apply(
        ChannelArn: js.UndefOr[ChimeArn] = js.undefined,
        MessageId: js.UndefOr[MessageId] = js.undefined
    ): UpdateChannelMessageResponse = {
      val __obj = js.Dynamic.literal()
      ChannelArn.foreach(__v => __obj.updateDynamic("ChannelArn")(__v.asInstanceOf[js.Any]))
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChannelMessageResponse]
    }
  }

  @js.native
  trait UpdateChannelReadMarkerRequest extends js.Object {
    var ChannelArn: ChimeArn
    var ChimeBearer: js.UndefOr[ChimeArn]
  }

  object UpdateChannelReadMarkerRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined
    ): UpdateChannelReadMarkerRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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
    var Mode: ChannelMode
    var Name: NonEmptyResourceName
    var ChimeBearer: js.UndefOr[ChimeArn]
    var Metadata: js.UndefOr[Metadata]
  }

  object UpdateChannelRequest {
    @inline
    def apply(
        ChannelArn: ChimeArn,
        Mode: ChannelMode,
        Name: NonEmptyResourceName,
        ChimeBearer: js.UndefOr[ChimeArn] = js.undefined,
        Metadata: js.UndefOr[Metadata] = js.undefined
    ): UpdateChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelArn" -> ChannelArn.asInstanceOf[js.Any],
        "Mode" -> Mode.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ChimeBearer.foreach(__v => __obj.updateDynamic("ChimeBearer")(__v.asInstanceOf[js.Any]))
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

  @js.native
  trait UpdateGlobalSettingsRequest extends js.Object {
    var BusinessCalling: js.UndefOr[BusinessCallingSettings]
    var VoiceConnector: js.UndefOr[VoiceConnectorSettings]
  }

  object UpdateGlobalSettingsRequest {
    @inline
    def apply(
        BusinessCalling: js.UndefOr[BusinessCallingSettings] = js.undefined,
        VoiceConnector: js.UndefOr[VoiceConnectorSettings] = js.undefined
    ): UpdateGlobalSettingsRequest = {
      val __obj = js.Dynamic.literal()
      BusinessCalling.foreach(__v => __obj.updateDynamic("BusinessCalling")(__v.asInstanceOf[js.Any]))
      VoiceConnector.foreach(__v => __obj.updateDynamic("VoiceConnector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGlobalSettingsRequest]
    }
  }

  @js.native
  trait UpdatePhoneNumberRequest extends js.Object {
    var PhoneNumberId: String
    var CallingName: js.UndefOr[CallingName]
    var ProductType: js.UndefOr[PhoneNumberProductType]
  }

  object UpdatePhoneNumberRequest {
    @inline
    def apply(
        PhoneNumberId: String,
        CallingName: js.UndefOr[CallingName] = js.undefined,
        ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
    ): UpdatePhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )

      CallingName.foreach(__v => __obj.updateDynamic("CallingName")(__v.asInstanceOf[js.Any]))
      ProductType.foreach(__v => __obj.updateDynamic("ProductType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePhoneNumberRequest]
    }
  }

  /** The phone number ID, product type, or calling name fields to update, used with the <a>BatchUpdatePhoneNumber</a> and <a>UpdatePhoneNumber</a> actions.
    */
  @js.native
  trait UpdatePhoneNumberRequestItem extends js.Object {
    var PhoneNumberId: NonEmptyString
    var CallingName: js.UndefOr[CallingName]
    var ProductType: js.UndefOr[PhoneNumberProductType]
  }

  object UpdatePhoneNumberRequestItem {
    @inline
    def apply(
        PhoneNumberId: NonEmptyString,
        CallingName: js.UndefOr[CallingName] = js.undefined,
        ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
    ): UpdatePhoneNumberRequestItem = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )

      CallingName.foreach(__v => __obj.updateDynamic("CallingName")(__v.asInstanceOf[js.Any]))
      ProductType.foreach(__v => __obj.updateDynamic("ProductType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePhoneNumberRequestItem]
    }
  }

  @js.native
  trait UpdatePhoneNumberResponse extends js.Object {
    var PhoneNumber: js.UndefOr[PhoneNumber]
  }

  object UpdatePhoneNumberResponse {
    @inline
    def apply(
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): UpdatePhoneNumberResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePhoneNumberResponse]
    }
  }

  @js.native
  trait UpdatePhoneNumberSettingsRequest extends js.Object {
    var CallingName: CallingName
  }

  object UpdatePhoneNumberSettingsRequest {
    @inline
    def apply(
        CallingName: CallingName
    ): UpdatePhoneNumberSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "CallingName" -> CallingName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdatePhoneNumberSettingsRequest]
    }
  }

  @js.native
  trait UpdateProxySessionRequest extends js.Object {
    var Capabilities: CapabilityList
    var ProxySessionId: NonEmptyString128
    var VoiceConnectorId: NonEmptyString128
    var ExpiryMinutes: js.UndefOr[PositiveInteger]
  }

  object UpdateProxySessionRequest {
    @inline
    def apply(
        Capabilities: CapabilityList,
        ProxySessionId: NonEmptyString128,
        VoiceConnectorId: NonEmptyString128,
        ExpiryMinutes: js.UndefOr[PositiveInteger] = js.undefined
    ): UpdateProxySessionRequest = {
      val __obj = js.Dynamic.literal(
        "Capabilities" -> Capabilities.asInstanceOf[js.Any],
        "ProxySessionId" -> ProxySessionId.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      ExpiryMinutes.foreach(__v => __obj.updateDynamic("ExpiryMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProxySessionRequest]
    }
  }

  @js.native
  trait UpdateProxySessionResponse extends js.Object {
    var ProxySession: js.UndefOr[ProxySession]
  }

  object UpdateProxySessionResponse {
    @inline
    def apply(
        ProxySession: js.UndefOr[ProxySession] = js.undefined
    ): UpdateProxySessionResponse = {
      val __obj = js.Dynamic.literal()
      ProxySession.foreach(__v => __obj.updateDynamic("ProxySession")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProxySessionResponse]
    }
  }

  @js.native
  trait UpdateRoomMembershipRequest extends js.Object {
    var AccountId: NonEmptyString
    var MemberId: NonEmptyString
    var RoomId: NonEmptyString
    var Role: js.UndefOr[RoomMembershipRole]
  }

  object UpdateRoomMembershipRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        MemberId: NonEmptyString,
        RoomId: NonEmptyString,
        Role: js.UndefOr[RoomMembershipRole] = js.undefined
    ): UpdateRoomMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "MemberId" -> MemberId.asInstanceOf[js.Any],
        "RoomId" -> RoomId.asInstanceOf[js.Any]
      )

      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRoomMembershipRequest]
    }
  }

  @js.native
  trait UpdateRoomMembershipResponse extends js.Object {
    var RoomMembership: js.UndefOr[RoomMembership]
  }

  object UpdateRoomMembershipResponse {
    @inline
    def apply(
        RoomMembership: js.UndefOr[RoomMembership] = js.undefined
    ): UpdateRoomMembershipResponse = {
      val __obj = js.Dynamic.literal()
      RoomMembership.foreach(__v => __obj.updateDynamic("RoomMembership")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRoomMembershipResponse]
    }
  }

  @js.native
  trait UpdateRoomRequest extends js.Object {
    var AccountId: NonEmptyString
    var RoomId: NonEmptyString
    var Name: js.UndefOr[SensitiveString]
  }

  object UpdateRoomRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        RoomId: NonEmptyString,
        Name: js.UndefOr[SensitiveString] = js.undefined
    ): UpdateRoomRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "RoomId" -> RoomId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRoomRequest]
    }
  }

  @js.native
  trait UpdateRoomResponse extends js.Object {
    var Room: js.UndefOr[Room]
  }

  object UpdateRoomResponse {
    @inline
    def apply(
        Room: js.UndefOr[Room] = js.undefined
    ): UpdateRoomResponse = {
      val __obj = js.Dynamic.literal()
      Room.foreach(__v => __obj.updateDynamic("Room")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRoomResponse]
    }
  }

  @js.native
  trait UpdateSipMediaApplicationCallRequest extends js.Object {
    var Arguments: SMAUpdateCallArgumentsMap
    var SipMediaApplicationId: NonEmptyString
    var TransactionId: NonEmptyString
  }

  object UpdateSipMediaApplicationCallRequest {
    @inline
    def apply(
        Arguments: SMAUpdateCallArgumentsMap,
        SipMediaApplicationId: NonEmptyString,
        TransactionId: NonEmptyString
    ): UpdateSipMediaApplicationCallRequest = {
      val __obj = js.Dynamic.literal(
        "Arguments" -> Arguments.asInstanceOf[js.Any],
        "SipMediaApplicationId" -> SipMediaApplicationId.asInstanceOf[js.Any],
        "TransactionId" -> TransactionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateSipMediaApplicationCallRequest]
    }
  }

  @js.native
  trait UpdateSipMediaApplicationCallResponse extends js.Object {
    var SipMediaApplicationCall: js.UndefOr[SipMediaApplicationCall]
  }

  object UpdateSipMediaApplicationCallResponse {
    @inline
    def apply(
        SipMediaApplicationCall: js.UndefOr[SipMediaApplicationCall] = js.undefined
    ): UpdateSipMediaApplicationCallResponse = {
      val __obj = js.Dynamic.literal()
      SipMediaApplicationCall.foreach(__v => __obj.updateDynamic("SipMediaApplicationCall")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSipMediaApplicationCallResponse]
    }
  }

  @js.native
  trait UpdateSipMediaApplicationRequest extends js.Object {
    var SipMediaApplicationId: NonEmptyString
    var Endpoints: js.UndefOr[SipMediaApplicationEndpointList]
    var Name: js.UndefOr[SipMediaApplicationName]
  }

  object UpdateSipMediaApplicationRequest {
    @inline
    def apply(
        SipMediaApplicationId: NonEmptyString,
        Endpoints: js.UndefOr[SipMediaApplicationEndpointList] = js.undefined,
        Name: js.UndefOr[SipMediaApplicationName] = js.undefined
    ): UpdateSipMediaApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "SipMediaApplicationId" -> SipMediaApplicationId.asInstanceOf[js.Any]
      )

      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSipMediaApplicationRequest]
    }
  }

  @js.native
  trait UpdateSipMediaApplicationResponse extends js.Object {
    var SipMediaApplication: js.UndefOr[SipMediaApplication]
  }

  object UpdateSipMediaApplicationResponse {
    @inline
    def apply(
        SipMediaApplication: js.UndefOr[SipMediaApplication] = js.undefined
    ): UpdateSipMediaApplicationResponse = {
      val __obj = js.Dynamic.literal()
      SipMediaApplication.foreach(__v => __obj.updateDynamic("SipMediaApplication")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSipMediaApplicationResponse]
    }
  }

  @js.native
  trait UpdateSipRuleRequest extends js.Object {
    var Name: SipRuleName
    var SipRuleId: NonEmptyString
    var Disabled: js.UndefOr[NullableBoolean]
    var TargetApplications: js.UndefOr[SipRuleTargetApplicationList]
  }

  object UpdateSipRuleRequest {
    @inline
    def apply(
        Name: SipRuleName,
        SipRuleId: NonEmptyString,
        Disabled: js.UndefOr[NullableBoolean] = js.undefined,
        TargetApplications: js.UndefOr[SipRuleTargetApplicationList] = js.undefined
    ): UpdateSipRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "SipRuleId" -> SipRuleId.asInstanceOf[js.Any]
      )

      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      TargetApplications.foreach(__v => __obj.updateDynamic("TargetApplications")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSipRuleRequest]
    }
  }

  @js.native
  trait UpdateSipRuleResponse extends js.Object {
    var SipRule: js.UndefOr[SipRule]
  }

  object UpdateSipRuleResponse {
    @inline
    def apply(
        SipRule: js.UndefOr[SipRule] = js.undefined
    ): UpdateSipRuleResponse = {
      val __obj = js.Dynamic.literal()
      SipRule.foreach(__v => __obj.updateDynamic("SipRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSipRuleResponse]
    }
  }

  @js.native
  trait UpdateUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserId: NonEmptyString
    var AlexaForBusinessMetadata: js.UndefOr[AlexaForBusinessMetadata]
    var LicenseType: js.UndefOr[License]
    var UserType: js.UndefOr[UserType]
  }

  object UpdateUserRequest {
    @inline
    def apply(
        AccountId: NonEmptyString,
        UserId: NonEmptyString,
        AlexaForBusinessMetadata: js.UndefOr[AlexaForBusinessMetadata] = js.undefined,
        LicenseType: js.UndefOr[License] = js.undefined,
        UserType: js.UndefOr[UserType] = js.undefined
    ): UpdateUserRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]
      )

      AlexaForBusinessMetadata.foreach(__v => __obj.updateDynamic("AlexaForBusinessMetadata")(__v.asInstanceOf[js.Any]))
      LicenseType.foreach(__v => __obj.updateDynamic("LicenseType")(__v.asInstanceOf[js.Any]))
      UserType.foreach(__v => __obj.updateDynamic("UserType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserRequest]
    }
  }

  /** The user ID and user fields to update, used with the <a>BatchUpdateUser</a> action.
    */
  @js.native
  trait UpdateUserRequestItem extends js.Object {
    var UserId: NonEmptyString
    var AlexaForBusinessMetadata: js.UndefOr[AlexaForBusinessMetadata]
    var LicenseType: js.UndefOr[License]
    var UserType: js.UndefOr[UserType]
  }

  object UpdateUserRequestItem {
    @inline
    def apply(
        UserId: NonEmptyString,
        AlexaForBusinessMetadata: js.UndefOr[AlexaForBusinessMetadata] = js.undefined,
        LicenseType: js.UndefOr[License] = js.undefined,
        UserType: js.UndefOr[UserType] = js.undefined
    ): UpdateUserRequestItem = {
      val __obj = js.Dynamic.literal(
        "UserId" -> UserId.asInstanceOf[js.Any]
      )

      AlexaForBusinessMetadata.foreach(__v => __obj.updateDynamic("AlexaForBusinessMetadata")(__v.asInstanceOf[js.Any]))
      LicenseType.foreach(__v => __obj.updateDynamic("LicenseType")(__v.asInstanceOf[js.Any]))
      UserType.foreach(__v => __obj.updateDynamic("UserType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserRequestItem]
    }
  }

  @js.native
  trait UpdateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object UpdateUserResponse {
    @inline
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): UpdateUserResponse = {
      val __obj = js.Dynamic.literal()
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserResponse]
    }
  }

  @js.native
  trait UpdateUserSettingsRequest extends js.Object {
    var AccountId: String
    var UserId: String
    var UserSettings: UserSettings
  }

  object UpdateUserSettingsRequest {
    @inline
    def apply(
        AccountId: String,
        UserId: String,
        UserSettings: UserSettings
    ): UpdateUserSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any],
        "UserSettings" -> UserSettings.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateUserSettingsRequest]
    }
  }

  @js.native
  trait UpdateVoiceConnectorGroupRequest extends js.Object {
    var Name: VoiceConnectorGroupName
    var VoiceConnectorGroupId: NonEmptyString
    var VoiceConnectorItems: VoiceConnectorItemList
  }

  object UpdateVoiceConnectorGroupRequest {
    @inline
    def apply(
        Name: VoiceConnectorGroupName,
        VoiceConnectorGroupId: NonEmptyString,
        VoiceConnectorItems: VoiceConnectorItemList
    ): UpdateVoiceConnectorGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "VoiceConnectorGroupId" -> VoiceConnectorGroupId.asInstanceOf[js.Any],
        "VoiceConnectorItems" -> VoiceConnectorItems.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateVoiceConnectorGroupRequest]
    }
  }

  @js.native
  trait UpdateVoiceConnectorGroupResponse extends js.Object {
    var VoiceConnectorGroup: js.UndefOr[VoiceConnectorGroup]
  }

  object UpdateVoiceConnectorGroupResponse {
    @inline
    def apply(
        VoiceConnectorGroup: js.UndefOr[VoiceConnectorGroup] = js.undefined
    ): UpdateVoiceConnectorGroupResponse = {
      val __obj = js.Dynamic.literal()
      VoiceConnectorGroup.foreach(__v => __obj.updateDynamic("VoiceConnectorGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVoiceConnectorGroupResponse]
    }
  }

  @js.native
  trait UpdateVoiceConnectorRequest extends js.Object {
    var Name: VoiceConnectorName
    var RequireEncryption: Boolean
    var VoiceConnectorId: NonEmptyString
  }

  object UpdateVoiceConnectorRequest {
    @inline
    def apply(
        Name: VoiceConnectorName,
        RequireEncryption: Boolean,
        VoiceConnectorId: NonEmptyString
    ): UpdateVoiceConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RequireEncryption" -> RequireEncryption.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateVoiceConnectorRequest]
    }
  }

  @js.native
  trait UpdateVoiceConnectorResponse extends js.Object {
    var VoiceConnector: js.UndefOr[VoiceConnector]
  }

  object UpdateVoiceConnectorResponse {
    @inline
    def apply(
        VoiceConnector: js.UndefOr[VoiceConnector] = js.undefined
    ): UpdateVoiceConnectorResponse = {
      val __obj = js.Dynamic.literal()
      VoiceConnector.foreach(__v => __obj.updateDynamic("VoiceConnector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVoiceConnectorResponse]
    }
  }

  /** The user on the Amazon Chime account.
    */
  @js.native
  trait User extends js.Object {
    var UserId: String
    var AccountId: js.UndefOr[String]
    var AlexaForBusinessMetadata: js.UndefOr[AlexaForBusinessMetadata]
    var DisplayName: js.UndefOr[SensitiveString]
    var InvitedOn: js.UndefOr[Iso8601Timestamp]
    var LicenseType: js.UndefOr[License]
    var PersonalPIN: js.UndefOr[String]
    var PrimaryEmail: js.UndefOr[EmailAddress]
    var PrimaryProvisionedNumber: js.UndefOr[SensitiveString]
    var RegisteredOn: js.UndefOr[Iso8601Timestamp]
    var UserInvitationStatus: js.UndefOr[InviteStatus]
    var UserRegistrationStatus: js.UndefOr[RegistrationStatus]
    var UserType: js.UndefOr[UserType]
  }

  object User {
    @inline
    def apply(
        UserId: String,
        AccountId: js.UndefOr[String] = js.undefined,
        AlexaForBusinessMetadata: js.UndefOr[AlexaForBusinessMetadata] = js.undefined,
        DisplayName: js.UndefOr[SensitiveString] = js.undefined,
        InvitedOn: js.UndefOr[Iso8601Timestamp] = js.undefined,
        LicenseType: js.UndefOr[License] = js.undefined,
        PersonalPIN: js.UndefOr[String] = js.undefined,
        PrimaryEmail: js.UndefOr[EmailAddress] = js.undefined,
        PrimaryProvisionedNumber: js.UndefOr[SensitiveString] = js.undefined,
        RegisteredOn: js.UndefOr[Iso8601Timestamp] = js.undefined,
        UserInvitationStatus: js.UndefOr[InviteStatus] = js.undefined,
        UserRegistrationStatus: js.UndefOr[RegistrationStatus] = js.undefined,
        UserType: js.UndefOr[UserType] = js.undefined
    ): User = {
      val __obj = js.Dynamic.literal(
        "UserId" -> UserId.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      AlexaForBusinessMetadata.foreach(__v => __obj.updateDynamic("AlexaForBusinessMetadata")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      InvitedOn.foreach(__v => __obj.updateDynamic("InvitedOn")(__v.asInstanceOf[js.Any]))
      LicenseType.foreach(__v => __obj.updateDynamic("LicenseType")(__v.asInstanceOf[js.Any]))
      PersonalPIN.foreach(__v => __obj.updateDynamic("PersonalPIN")(__v.asInstanceOf[js.Any]))
      PrimaryEmail.foreach(__v => __obj.updateDynamic("PrimaryEmail")(__v.asInstanceOf[js.Any]))
      PrimaryProvisionedNumber.foreach(__v => __obj.updateDynamic("PrimaryProvisionedNumber")(__v.asInstanceOf[js.Any]))
      RegisteredOn.foreach(__v => __obj.updateDynamic("RegisteredOn")(__v.asInstanceOf[js.Any]))
      UserInvitationStatus.foreach(__v => __obj.updateDynamic("UserInvitationStatus")(__v.asInstanceOf[js.Any]))
      UserRegistrationStatus.foreach(__v => __obj.updateDynamic("UserRegistrationStatus")(__v.asInstanceOf[js.Any]))
      UserType.foreach(__v => __obj.updateDynamic("UserType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[User]
    }
  }

  /** The list of errors returned when errors are encountered during the <a>BatchSuspendUser</a>, <a>BatchUnsuspendUser</a>, or <a>BatchUpdateUser</a> actions. This includes user IDs, error codes, and error messages.
    */
  @js.native
  trait UserError extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[String]
    var UserId: js.UndefOr[NonEmptyString]
  }

  object UserError {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        UserId: js.UndefOr[NonEmptyString] = js.undefined
    ): UserError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserError]
    }
  }

  /** Settings associated with an Amazon Chime user, including inbound and outbound calling and text messaging.
    */
  @js.native
  trait UserSettings extends js.Object {
    var Telephony: TelephonySettings
  }

  object UserSettings {
    @inline
    def apply(
        Telephony: TelephonySettings
    ): UserSettings = {
      val __obj = js.Dynamic.literal(
        "Telephony" -> Telephony.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UserSettings]
    }
  }

  /** The video artifact configuration object.
    */
  @js.native
  trait VideoArtifactsConfiguration extends js.Object {
    var State: ArtifactsState
    var MuxType: js.UndefOr[VideoMuxType]
  }

  object VideoArtifactsConfiguration {
    @inline
    def apply(
        State: ArtifactsState,
        MuxType: js.UndefOr[VideoMuxType] = js.undefined
    ): VideoArtifactsConfiguration = {
      val __obj = js.Dynamic.literal(
        "State" -> State.asInstanceOf[js.Any]
      )

      MuxType.foreach(__v => __obj.updateDynamic("MuxType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VideoArtifactsConfiguration]
    }
  }

  /** The Amazon Chime Voice Connector configuration, including outbound host name and encryption settings.
    */
  @js.native
  trait VoiceConnector extends js.Object {
    var AwsRegion: js.UndefOr[VoiceConnectorAwsRegion]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var Name: js.UndefOr[VoiceConnectorName]
    var OutboundHostName: js.UndefOr[String]
    var RequireEncryption: js.UndefOr[Boolean]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var VoiceConnectorArn: js.UndefOr[NonEmptyString]
    var VoiceConnectorId: js.UndefOr[NonEmptyString]
  }

  object VoiceConnector {
    @inline
    def apply(
        AwsRegion: js.UndefOr[VoiceConnectorAwsRegion] = js.undefined,
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        Name: js.UndefOr[VoiceConnectorName] = js.undefined,
        OutboundHostName: js.UndefOr[String] = js.undefined,
        RequireEncryption: js.UndefOr[Boolean] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        VoiceConnectorArn: js.UndefOr[NonEmptyString] = js.undefined,
        VoiceConnectorId: js.UndefOr[NonEmptyString] = js.undefined
    ): VoiceConnector = {
      val __obj = js.Dynamic.literal()
      AwsRegion.foreach(__v => __obj.updateDynamic("AwsRegion")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutboundHostName.foreach(__v => __obj.updateDynamic("OutboundHostName")(__v.asInstanceOf[js.Any]))
      RequireEncryption.foreach(__v => __obj.updateDynamic("RequireEncryption")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      VoiceConnectorArn.foreach(__v => __obj.updateDynamic("VoiceConnectorArn")(__v.asInstanceOf[js.Any]))
      VoiceConnectorId.foreach(__v => __obj.updateDynamic("VoiceConnectorId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VoiceConnector]
    }
  }

  /** The Amazon Chime Voice Connector group configuration, including associated Amazon Chime Voice Connectors. You can include Amazon Chime Voice Connectors from different AWS Regions in your group. This creates a fault tolerant mechanism for fallback in case of availability events.
    */
  @js.native
  trait VoiceConnectorGroup extends js.Object {
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var Name: js.UndefOr[VoiceConnectorGroupName]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var VoiceConnectorGroupArn: js.UndefOr[NonEmptyString]
    var VoiceConnectorGroupId: js.UndefOr[NonEmptyString]
    var VoiceConnectorItems: js.UndefOr[VoiceConnectorItemList]
  }

  object VoiceConnectorGroup {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        Name: js.UndefOr[VoiceConnectorGroupName] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        VoiceConnectorGroupArn: js.UndefOr[NonEmptyString] = js.undefined,
        VoiceConnectorGroupId: js.UndefOr[NonEmptyString] = js.undefined,
        VoiceConnectorItems: js.UndefOr[VoiceConnectorItemList] = js.undefined
    ): VoiceConnectorGroup = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      VoiceConnectorGroupArn.foreach(__v => __obj.updateDynamic("VoiceConnectorGroupArn")(__v.asInstanceOf[js.Any]))
      VoiceConnectorGroupId.foreach(__v => __obj.updateDynamic("VoiceConnectorGroupId")(__v.asInstanceOf[js.Any]))
      VoiceConnectorItems.foreach(__v => __obj.updateDynamic("VoiceConnectorItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VoiceConnectorGroup]
    }
  }

  /** For Amazon Chime Voice Connector groups, the Amazon Chime Voice Connectors to which to route inbound calls. Includes priority configuration settings. Limit: 3 <code>VoiceConnectorItems</code> per Amazon Chime Voice Connector group.
    */
  @js.native
  trait VoiceConnectorItem extends js.Object {
    var Priority: VoiceConnectorItemPriority
    var VoiceConnectorId: NonEmptyString
  }

  object VoiceConnectorItem {
    @inline
    def apply(
        Priority: VoiceConnectorItemPriority,
        VoiceConnectorId: NonEmptyString
    ): VoiceConnectorItem = {
      val __obj = js.Dynamic.literal(
        "Priority" -> Priority.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VoiceConnectorItem]
    }
  }

  /** The Amazon Chime Voice Connector settings. Includes any Amazon S3 buckets designated for storing call detail records.
    */
  @js.native
  trait VoiceConnectorSettings extends js.Object {
    var CdrBucket: js.UndefOr[String]
  }

  object VoiceConnectorSettings {
    @inline
    def apply(
        CdrBucket: js.UndefOr[String] = js.undefined
    ): VoiceConnectorSettings = {
      val __obj = js.Dynamic.literal()
      CdrBucket.foreach(__v => __obj.updateDynamic("CdrBucket")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VoiceConnectorSettings]
    }
  }
}
