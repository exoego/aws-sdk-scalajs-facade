package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object chime {
  type AccountList                      = js.Array[Account]
  type AccountName                      = String
  type Arn                              = String
  type AttendeeList                     = js.Array[Attendee]
  type BatchCreateAttendeeErrorList     = js.Array[CreateAttendeeError]
  type BotList                          = js.Array[Bot]
  type CallingName                      = String
  type CallingRegion                    = String
  type CallingRegionList                = js.Array[CallingRegion]
  type ClientRequestToken               = String
  type CpsLimit                         = Int
  type CreateAttendeeRequestItemList    = js.Array[CreateAttendeeRequestItem]
  type CredentialList                   = js.Array[Credential]
  type DataRetentionInHours             = Int
  type E164PhoneNumber                  = String
  type E164PhoneNumberList              = js.Array[E164PhoneNumber]
  type EmailAddress                     = String
  type ExternalUserIdType               = String
  type GuidString                       = String
  type InviteList                       = js.Array[Invite]
  type Iso8601Timestamp                 = js.Date
  type JoinTokenString                  = String
  type LicenseList                      = js.Array[License]
  type MeetingList                      = js.Array[Meeting]
  type MemberErrorList                  = js.Array[MemberError]
  type MembershipItemList               = js.Array[MembershipItem]
  type NonEmptyString                   = String
  type NonEmptyStringList               = js.Array[String]
  type NullableBoolean                  = Boolean
  type OrderedPhoneNumberList           = js.Array[OrderedPhoneNumber]
  type OriginationRouteList             = js.Array[OriginationRoute]
  type OriginationRoutePriority         = Int
  type OriginationRouteWeight           = Int
  type PhoneNumberAssociationList       = js.Array[PhoneNumberAssociation]
  type PhoneNumberErrorList             = js.Array[PhoneNumberError]
  type PhoneNumberList                  = js.Array[PhoneNumber]
  type PhoneNumberMaxResults            = Int
  type PhoneNumberOrderList             = js.Array[PhoneNumberOrder]
  type Port                             = Int
  type ProfileServiceMaxResults         = Int
  type ResultMax                        = Int
  type RoomList                         = js.Array[Room]
  type RoomMembershipList               = js.Array[RoomMembership]
  type SensitiveString                  = String
  type SensitiveStringList              = js.Array[SensitiveString]
  type SigninDelegateGroupList          = js.Array[SigninDelegateGroup]
  type StringList                       = js.Array[String]
  type TollFreePrefix                   = String
  type UpdatePhoneNumberRequestItemList = js.Array[UpdatePhoneNumberRequestItem]
  type UpdateUserRequestItemList        = js.Array[UpdateUserRequestItem]
  type UriType                          = String
  type UserEmailList                    = js.Array[EmailAddress]
  type UserErrorList                    = js.Array[UserError]
  type UserIdList                       = js.Array[NonEmptyString]
  type UserList                         = js.Array[User]
  type VoiceConnectorGroupList          = js.Array[VoiceConnectorGroup]
  type VoiceConnectorGroupName          = String
  type VoiceConnectorItemList           = js.Array[VoiceConnectorItem]
  type VoiceConnectorItemPriority       = Int
  type VoiceConnectorList               = js.Array[VoiceConnector]
  type VoiceConnectorName               = String

  implicit final class ChimeOps(private val service: Chime) extends AnyVal {

    @inline def associatePhoneNumberWithUserFuture(
        params: AssociatePhoneNumberWithUserRequest
    ): Future[AssociatePhoneNumberWithUserResponse] = service.associatePhoneNumberWithUser(params).promise().toFuture
    @inline def associatePhoneNumbersWithVoiceConnectorFuture(
        params: AssociatePhoneNumbersWithVoiceConnectorRequest
    ): Future[AssociatePhoneNumbersWithVoiceConnectorResponse] =
      service.associatePhoneNumbersWithVoiceConnector(params).promise().toFuture
    @inline def associatePhoneNumbersWithVoiceConnectorGroupFuture(
        params: AssociatePhoneNumbersWithVoiceConnectorGroupRequest
    ): Future[AssociatePhoneNumbersWithVoiceConnectorGroupResponse] =
      service.associatePhoneNumbersWithVoiceConnectorGroup(params).promise().toFuture
    @inline def associateSigninDelegateGroupsWithAccountFuture(
        params: AssociateSigninDelegateGroupsWithAccountRequest
    ): Future[AssociateSigninDelegateGroupsWithAccountResponse] =
      service.associateSigninDelegateGroupsWithAccount(params).promise().toFuture
    @inline def batchCreateAttendeeFuture(params: BatchCreateAttendeeRequest): Future[BatchCreateAttendeeResponse] =
      service.batchCreateAttendee(params).promise().toFuture
    @inline def batchCreateRoomMembershipFuture(
        params: BatchCreateRoomMembershipRequest
    ): Future[BatchCreateRoomMembershipResponse] = service.batchCreateRoomMembership(params).promise().toFuture
    @inline def batchDeletePhoneNumberFuture(
        params: BatchDeletePhoneNumberRequest
    ): Future[BatchDeletePhoneNumberResponse] = service.batchDeletePhoneNumber(params).promise().toFuture
    @inline def batchSuspendUserFuture(params: BatchSuspendUserRequest): Future[BatchSuspendUserResponse] =
      service.batchSuspendUser(params).promise().toFuture
    @inline def batchUnsuspendUserFuture(params: BatchUnsuspendUserRequest): Future[BatchUnsuspendUserResponse] =
      service.batchUnsuspendUser(params).promise().toFuture
    @inline def batchUpdatePhoneNumberFuture(
        params: BatchUpdatePhoneNumberRequest
    ): Future[BatchUpdatePhoneNumberResponse] = service.batchUpdatePhoneNumber(params).promise().toFuture
    @inline def batchUpdateUserFuture(params: BatchUpdateUserRequest): Future[BatchUpdateUserResponse] =
      service.batchUpdateUser(params).promise().toFuture
    @inline def createAccountFuture(params: CreateAccountRequest): Future[CreateAccountResponse] =
      service.createAccount(params).promise().toFuture
    @inline def createAttendeeFuture(params: CreateAttendeeRequest): Future[CreateAttendeeResponse] =
      service.createAttendee(params).promise().toFuture
    @inline def createBotFuture(params: CreateBotRequest): Future[CreateBotResponse] =
      service.createBot(params).promise().toFuture
    @inline def createMeetingFuture(params: CreateMeetingRequest): Future[CreateMeetingResponse] =
      service.createMeeting(params).promise().toFuture
    @inline def createPhoneNumberOrderFuture(
        params: CreatePhoneNumberOrderRequest
    ): Future[CreatePhoneNumberOrderResponse] = service.createPhoneNumberOrder(params).promise().toFuture
    @inline def createRoomFuture(params: CreateRoomRequest): Future[CreateRoomResponse] =
      service.createRoom(params).promise().toFuture
    @inline def createRoomMembershipFuture(params: CreateRoomMembershipRequest): Future[CreateRoomMembershipResponse] =
      service.createRoomMembership(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] =
      service.createUser(params).promise().toFuture
    @inline def createVoiceConnectorFuture(params: CreateVoiceConnectorRequest): Future[CreateVoiceConnectorResponse] =
      service.createVoiceConnector(params).promise().toFuture
    @inline def createVoiceConnectorGroupFuture(
        params: CreateVoiceConnectorGroupRequest
    ): Future[CreateVoiceConnectorGroupResponse] = service.createVoiceConnectorGroup(params).promise().toFuture
    @inline def deleteAccountFuture(params: DeleteAccountRequest): Future[DeleteAccountResponse] =
      service.deleteAccount(params).promise().toFuture
    @inline def deleteAttendeeFuture(params: DeleteAttendeeRequest): Future[js.Object] =
      service.deleteAttendee(params).promise().toFuture
    @inline def deleteEventsConfigurationFuture(params: DeleteEventsConfigurationRequest): Future[js.Object] =
      service.deleteEventsConfiguration(params).promise().toFuture
    @inline def deleteMeetingFuture(params: DeleteMeetingRequest): Future[js.Object] =
      service.deleteMeeting(params).promise().toFuture
    @inline def deletePhoneNumberFuture(params: DeletePhoneNumberRequest): Future[js.Object] =
      service.deletePhoneNumber(params).promise().toFuture
    @inline def deleteRoomFuture(params: DeleteRoomRequest): Future[js.Object] =
      service.deleteRoom(params).promise().toFuture
    @inline def deleteRoomMembershipFuture(params: DeleteRoomMembershipRequest): Future[js.Object] =
      service.deleteRoomMembership(params).promise().toFuture
    @inline def deleteVoiceConnectorFuture(params: DeleteVoiceConnectorRequest): Future[js.Object] =
      service.deleteVoiceConnector(params).promise().toFuture
    @inline def deleteVoiceConnectorGroupFuture(params: DeleteVoiceConnectorGroupRequest): Future[js.Object] =
      service.deleteVoiceConnectorGroup(params).promise().toFuture
    @inline def deleteVoiceConnectorOriginationFuture(
        params: DeleteVoiceConnectorOriginationRequest
    ): Future[js.Object] = service.deleteVoiceConnectorOrigination(params).promise().toFuture
    @inline def deleteVoiceConnectorStreamingConfigurationFuture(
        params: DeleteVoiceConnectorStreamingConfigurationRequest
    ): Future[js.Object] = service.deleteVoiceConnectorStreamingConfiguration(params).promise().toFuture
    @inline def deleteVoiceConnectorTerminationCredentialsFuture(
        params: DeleteVoiceConnectorTerminationCredentialsRequest
    ): Future[js.Object] = service.deleteVoiceConnectorTerminationCredentials(params).promise().toFuture
    @inline def deleteVoiceConnectorTerminationFuture(
        params: DeleteVoiceConnectorTerminationRequest
    ): Future[js.Object] = service.deleteVoiceConnectorTermination(params).promise().toFuture
    @inline def disassociatePhoneNumberFromUserFuture(
        params: DisassociatePhoneNumberFromUserRequest
    ): Future[DisassociatePhoneNumberFromUserResponse] =
      service.disassociatePhoneNumberFromUser(params).promise().toFuture
    @inline def disassociatePhoneNumbersFromVoiceConnectorFuture(
        params: DisassociatePhoneNumbersFromVoiceConnectorRequest
    ): Future[DisassociatePhoneNumbersFromVoiceConnectorResponse] =
      service.disassociatePhoneNumbersFromVoiceConnector(params).promise().toFuture
    @inline def disassociatePhoneNumbersFromVoiceConnectorGroupFuture(
        params: DisassociatePhoneNumbersFromVoiceConnectorGroupRequest
    ): Future[DisassociatePhoneNumbersFromVoiceConnectorGroupResponse] =
      service.disassociatePhoneNumbersFromVoiceConnectorGroup(params).promise().toFuture
    @inline def disassociateSigninDelegateGroupsFromAccountFuture(
        params: DisassociateSigninDelegateGroupsFromAccountRequest
    ): Future[DisassociateSigninDelegateGroupsFromAccountResponse] =
      service.disassociateSigninDelegateGroupsFromAccount(params).promise().toFuture
    @inline def getAccountFuture(params: GetAccountRequest): Future[GetAccountResponse] =
      service.getAccount(params).promise().toFuture
    @inline def getAccountSettingsFuture(params: GetAccountSettingsRequest): Future[GetAccountSettingsResponse] =
      service.getAccountSettings(params).promise().toFuture
    @inline def getAttendeeFuture(params: GetAttendeeRequest): Future[GetAttendeeResponse] =
      service.getAttendee(params).promise().toFuture
    @inline def getBotFuture(params: GetBotRequest): Future[GetBotResponse] = service.getBot(params).promise().toFuture
    @inline def getEventsConfigurationFuture(
        params: GetEventsConfigurationRequest
    ): Future[GetEventsConfigurationResponse] = service.getEventsConfiguration(params).promise().toFuture
    @inline def getGlobalSettingsFuture(): Future[GetGlobalSettingsResponse] =
      service.getGlobalSettings().promise().toFuture
    @inline def getMeetingFuture(params: GetMeetingRequest): Future[GetMeetingResponse] =
      service.getMeeting(params).promise().toFuture
    @inline def getPhoneNumberFuture(params: GetPhoneNumberRequest): Future[GetPhoneNumberResponse] =
      service.getPhoneNumber(params).promise().toFuture
    @inline def getPhoneNumberOrderFuture(params: GetPhoneNumberOrderRequest): Future[GetPhoneNumberOrderResponse] =
      service.getPhoneNumberOrder(params).promise().toFuture
    @inline def getPhoneNumberSettingsFuture(): Future[GetPhoneNumberSettingsResponse] =
      service.getPhoneNumberSettings().promise().toFuture
    @inline def getRoomFuture(params: GetRoomRequest): Future[GetRoomResponse] =
      service.getRoom(params).promise().toFuture
    @inline def getUserFuture(params: GetUserRequest): Future[GetUserResponse] =
      service.getUser(params).promise().toFuture
    @inline def getUserSettingsFuture(params: GetUserSettingsRequest): Future[GetUserSettingsResponse] =
      service.getUserSettings(params).promise().toFuture
    @inline def getVoiceConnectorFuture(params: GetVoiceConnectorRequest): Future[GetVoiceConnectorResponse] =
      service.getVoiceConnector(params).promise().toFuture
    @inline def getVoiceConnectorGroupFuture(
        params: GetVoiceConnectorGroupRequest
    ): Future[GetVoiceConnectorGroupResponse] = service.getVoiceConnectorGroup(params).promise().toFuture
    @inline def getVoiceConnectorLoggingConfigurationFuture(
        params: GetVoiceConnectorLoggingConfigurationRequest
    ): Future[GetVoiceConnectorLoggingConfigurationResponse] =
      service.getVoiceConnectorLoggingConfiguration(params).promise().toFuture
    @inline def getVoiceConnectorOriginationFuture(
        params: GetVoiceConnectorOriginationRequest
    ): Future[GetVoiceConnectorOriginationResponse] = service.getVoiceConnectorOrigination(params).promise().toFuture
    @inline def getVoiceConnectorStreamingConfigurationFuture(
        params: GetVoiceConnectorStreamingConfigurationRequest
    ): Future[GetVoiceConnectorStreamingConfigurationResponse] =
      service.getVoiceConnectorStreamingConfiguration(params).promise().toFuture
    @inline def getVoiceConnectorTerminationFuture(
        params: GetVoiceConnectorTerminationRequest
    ): Future[GetVoiceConnectorTerminationResponse] = service.getVoiceConnectorTermination(params).promise().toFuture
    @inline def getVoiceConnectorTerminationHealthFuture(
        params: GetVoiceConnectorTerminationHealthRequest
    ): Future[GetVoiceConnectorTerminationHealthResponse] =
      service.getVoiceConnectorTerminationHealth(params).promise().toFuture
    @inline def inviteUsersFuture(params: InviteUsersRequest): Future[InviteUsersResponse] =
      service.inviteUsers(params).promise().toFuture
    @inline def listAccountsFuture(params: ListAccountsRequest): Future[ListAccountsResponse] =
      service.listAccounts(params).promise().toFuture
    @inline def listAttendeesFuture(params: ListAttendeesRequest): Future[ListAttendeesResponse] =
      service.listAttendees(params).promise().toFuture
    @inline def listBotsFuture(params: ListBotsRequest): Future[ListBotsResponse] =
      service.listBots(params).promise().toFuture
    @inline def listMeetingsFuture(params: ListMeetingsRequest): Future[ListMeetingsResponse] =
      service.listMeetings(params).promise().toFuture
    @inline def listPhoneNumberOrdersFuture(
        params: ListPhoneNumberOrdersRequest
    ): Future[ListPhoneNumberOrdersResponse] = service.listPhoneNumberOrders(params).promise().toFuture
    @inline def listPhoneNumbersFuture(params: ListPhoneNumbersRequest): Future[ListPhoneNumbersResponse] =
      service.listPhoneNumbers(params).promise().toFuture
    @inline def listRoomMembershipsFuture(params: ListRoomMembershipsRequest): Future[ListRoomMembershipsResponse] =
      service.listRoomMemberships(params).promise().toFuture
    @inline def listRoomsFuture(params: ListRoomsRequest): Future[ListRoomsResponse] =
      service.listRooms(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] =
      service.listUsers(params).promise().toFuture
    @inline def listVoiceConnectorGroupsFuture(
        params: ListVoiceConnectorGroupsRequest
    ): Future[ListVoiceConnectorGroupsResponse] = service.listVoiceConnectorGroups(params).promise().toFuture
    @inline def listVoiceConnectorTerminationCredentialsFuture(
        params: ListVoiceConnectorTerminationCredentialsRequest
    ): Future[ListVoiceConnectorTerminationCredentialsResponse] =
      service.listVoiceConnectorTerminationCredentials(params).promise().toFuture
    @inline def listVoiceConnectorsFuture(params: ListVoiceConnectorsRequest): Future[ListVoiceConnectorsResponse] =
      service.listVoiceConnectors(params).promise().toFuture
    @inline def logoutUserFuture(params: LogoutUserRequest): Future[LogoutUserResponse] =
      service.logoutUser(params).promise().toFuture
    @inline def putEventsConfigurationFuture(
        params: PutEventsConfigurationRequest
    ): Future[PutEventsConfigurationResponse] = service.putEventsConfiguration(params).promise().toFuture
    @inline def putVoiceConnectorLoggingConfigurationFuture(
        params: PutVoiceConnectorLoggingConfigurationRequest
    ): Future[PutVoiceConnectorLoggingConfigurationResponse] =
      service.putVoiceConnectorLoggingConfiguration(params).promise().toFuture
    @inline def putVoiceConnectorOriginationFuture(
        params: PutVoiceConnectorOriginationRequest
    ): Future[PutVoiceConnectorOriginationResponse] = service.putVoiceConnectorOrigination(params).promise().toFuture
    @inline def putVoiceConnectorStreamingConfigurationFuture(
        params: PutVoiceConnectorStreamingConfigurationRequest
    ): Future[PutVoiceConnectorStreamingConfigurationResponse] =
      service.putVoiceConnectorStreamingConfiguration(params).promise().toFuture
    @inline def putVoiceConnectorTerminationCredentialsFuture(
        params: PutVoiceConnectorTerminationCredentialsRequest
    ): Future[js.Object] = service.putVoiceConnectorTerminationCredentials(params).promise().toFuture
    @inline def putVoiceConnectorTerminationFuture(
        params: PutVoiceConnectorTerminationRequest
    ): Future[PutVoiceConnectorTerminationResponse] = service.putVoiceConnectorTermination(params).promise().toFuture
    @inline def regenerateSecurityTokenFuture(
        params: RegenerateSecurityTokenRequest
    ): Future[RegenerateSecurityTokenResponse] = service.regenerateSecurityToken(params).promise().toFuture
    @inline def resetPersonalPINFuture(params: ResetPersonalPINRequest): Future[ResetPersonalPINResponse] =
      service.resetPersonalPIN(params).promise().toFuture
    @inline def restorePhoneNumberFuture(params: RestorePhoneNumberRequest): Future[RestorePhoneNumberResponse] =
      service.restorePhoneNumber(params).promise().toFuture
    @inline def searchAvailablePhoneNumbersFuture(
        params: SearchAvailablePhoneNumbersRequest
    ): Future[SearchAvailablePhoneNumbersResponse] = service.searchAvailablePhoneNumbers(params).promise().toFuture
    @inline def updateAccountFuture(params: UpdateAccountRequest): Future[UpdateAccountResponse] =
      service.updateAccount(params).promise().toFuture
    @inline def updateAccountSettingsFuture(
        params: UpdateAccountSettingsRequest
    ): Future[UpdateAccountSettingsResponse] = service.updateAccountSettings(params).promise().toFuture
    @inline def updateBotFuture(params: UpdateBotRequest): Future[UpdateBotResponse] =
      service.updateBot(params).promise().toFuture
    @inline def updateGlobalSettingsFuture(params: UpdateGlobalSettingsRequest): Future[js.Object] =
      service.updateGlobalSettings(params).promise().toFuture
    @inline def updatePhoneNumberFuture(params: UpdatePhoneNumberRequest): Future[UpdatePhoneNumberResponse] =
      service.updatePhoneNumber(params).promise().toFuture
    @inline def updatePhoneNumberSettingsFuture(params: UpdatePhoneNumberSettingsRequest): Future[js.Object] =
      service.updatePhoneNumberSettings(params).promise().toFuture
    @inline def updateRoomFuture(params: UpdateRoomRequest): Future[UpdateRoomResponse] =
      service.updateRoom(params).promise().toFuture
    @inline def updateRoomMembershipFuture(params: UpdateRoomMembershipRequest): Future[UpdateRoomMembershipResponse] =
      service.updateRoomMembership(params).promise().toFuture
    @inline def updateUserFuture(params: UpdateUserRequest): Future[UpdateUserResponse] =
      service.updateUser(params).promise().toFuture
    @inline def updateUserSettingsFuture(params: UpdateUserSettingsRequest): Future[js.Object] =
      service.updateUserSettings(params).promise().toFuture
    @inline def updateVoiceConnectorFuture(params: UpdateVoiceConnectorRequest): Future[UpdateVoiceConnectorResponse] =
      service.updateVoiceConnector(params).promise().toFuture
    @inline def updateVoiceConnectorGroupFuture(
        params: UpdateVoiceConnectorGroupRequest
    ): Future[UpdateVoiceConnectorGroupResponse] = service.updateVoiceConnectorGroup(params).promise().toFuture
  }
}

package chime {
  @js.native
  @JSImport("aws-sdk", "Chime")
  class Chime() extends js.Object {
    def this(config: AWSConfig) = this()

    def associatePhoneNumberWithUser(
        params: AssociatePhoneNumberWithUserRequest
    ): Request[AssociatePhoneNumberWithUserResponse] = js.native
    def associatePhoneNumbersWithVoiceConnector(
        params: AssociatePhoneNumbersWithVoiceConnectorRequest
    ): Request[AssociatePhoneNumbersWithVoiceConnectorResponse] = js.native
    def associatePhoneNumbersWithVoiceConnectorGroup(
        params: AssociatePhoneNumbersWithVoiceConnectorGroupRequest
    ): Request[AssociatePhoneNumbersWithVoiceConnectorGroupResponse] = js.native
    def associateSigninDelegateGroupsWithAccount(
        params: AssociateSigninDelegateGroupsWithAccountRequest
    ): Request[AssociateSigninDelegateGroupsWithAccountResponse]                                      = js.native
    def batchCreateAttendee(params: BatchCreateAttendeeRequest): Request[BatchCreateAttendeeResponse] = js.native
    def batchCreateRoomMembership(
        params: BatchCreateRoomMembershipRequest
    ): Request[BatchCreateRoomMembershipResponse] = js.native
    def batchDeletePhoneNumber(params: BatchDeletePhoneNumberRequest): Request[BatchDeletePhoneNumberResponse] =
      js.native
    def batchSuspendUser(params: BatchSuspendUserRequest): Request[BatchSuspendUserResponse]       = js.native
    def batchUnsuspendUser(params: BatchUnsuspendUserRequest): Request[BatchUnsuspendUserResponse] = js.native
    def batchUpdatePhoneNumber(params: BatchUpdatePhoneNumberRequest): Request[BatchUpdatePhoneNumberResponse] =
      js.native
    def batchUpdateUser(params: BatchUpdateUserRequest): Request[BatchUpdateUserResponse] = js.native
    def createAccount(params: CreateAccountRequest): Request[CreateAccountResponse]       = js.native
    def createAttendee(params: CreateAttendeeRequest): Request[CreateAttendeeResponse]    = js.native
    def createBot(params: CreateBotRequest): Request[CreateBotResponse]                   = js.native
    def createMeeting(params: CreateMeetingRequest): Request[CreateMeetingResponse]       = js.native
    def createPhoneNumberOrder(params: CreatePhoneNumberOrderRequest): Request[CreatePhoneNumberOrderResponse] =
      js.native
    def createRoom(params: CreateRoomRequest): Request[CreateRoomResponse]                               = js.native
    def createRoomMembership(params: CreateRoomMembershipRequest): Request[CreateRoomMembershipResponse] = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse]                               = js.native
    def createVoiceConnector(params: CreateVoiceConnectorRequest): Request[CreateVoiceConnectorResponse] = js.native
    def createVoiceConnectorGroup(
        params: CreateVoiceConnectorGroupRequest
    ): Request[CreateVoiceConnectorGroupResponse]                                                           = js.native
    def deleteAccount(params: DeleteAccountRequest): Request[DeleteAccountResponse]                         = js.native
    def deleteAttendee(params: DeleteAttendeeRequest): Request[js.Object]                                   = js.native
    def deleteEventsConfiguration(params: DeleteEventsConfigurationRequest): Request[js.Object]             = js.native
    def deleteMeeting(params: DeleteMeetingRequest): Request[js.Object]                                     = js.native
    def deletePhoneNumber(params: DeletePhoneNumberRequest): Request[js.Object]                             = js.native
    def deleteRoom(params: DeleteRoomRequest): Request[js.Object]                                           = js.native
    def deleteRoomMembership(params: DeleteRoomMembershipRequest): Request[js.Object]                       = js.native
    def deleteVoiceConnector(params: DeleteVoiceConnectorRequest): Request[js.Object]                       = js.native
    def deleteVoiceConnectorGroup(params: DeleteVoiceConnectorGroupRequest): Request[js.Object]             = js.native
    def deleteVoiceConnectorOrigination(params: DeleteVoiceConnectorOriginationRequest): Request[js.Object] = js.native
    def deleteVoiceConnectorStreamingConfiguration(
        params: DeleteVoiceConnectorStreamingConfigurationRequest
    ): Request[js.Object]                                                                                   = js.native
    def deleteVoiceConnectorTermination(params: DeleteVoiceConnectorTerminationRequest): Request[js.Object] = js.native
    def deleteVoiceConnectorTerminationCredentials(
        params: DeleteVoiceConnectorTerminationCredentialsRequest
    ): Request[js.Object] = js.native
    def disassociatePhoneNumberFromUser(
        params: DisassociatePhoneNumberFromUserRequest
    ): Request[DisassociatePhoneNumberFromUserResponse] = js.native
    def disassociatePhoneNumbersFromVoiceConnector(
        params: DisassociatePhoneNumbersFromVoiceConnectorRequest
    ): Request[DisassociatePhoneNumbersFromVoiceConnectorResponse] = js.native
    def disassociatePhoneNumbersFromVoiceConnectorGroup(
        params: DisassociatePhoneNumbersFromVoiceConnectorGroupRequest
    ): Request[DisassociatePhoneNumbersFromVoiceConnectorGroupResponse] = js.native
    def disassociateSigninDelegateGroupsFromAccount(
        params: DisassociateSigninDelegateGroupsFromAccountRequest
    ): Request[DisassociateSigninDelegateGroupsFromAccountResponse]                                = js.native
    def getAccount(params: GetAccountRequest): Request[GetAccountResponse]                         = js.native
    def getAccountSettings(params: GetAccountSettingsRequest): Request[GetAccountSettingsResponse] = js.native
    def getAttendee(params: GetAttendeeRequest): Request[GetAttendeeResponse]                      = js.native
    def getBot(params: GetBotRequest): Request[GetBotResponse]                                     = js.native
    def getEventsConfiguration(params: GetEventsConfigurationRequest): Request[GetEventsConfigurationResponse] =
      js.native
    def getGlobalSettings(): Request[GetGlobalSettingsResponse]                                       = js.native
    def getMeeting(params: GetMeetingRequest): Request[GetMeetingResponse]                            = js.native
    def getPhoneNumber(params: GetPhoneNumberRequest): Request[GetPhoneNumberResponse]                = js.native
    def getPhoneNumberOrder(params: GetPhoneNumberOrderRequest): Request[GetPhoneNumberOrderResponse] = js.native
    def getPhoneNumberSettings(): Request[GetPhoneNumberSettingsResponse]                             = js.native
    def getRoom(params: GetRoomRequest): Request[GetRoomResponse]                                     = js.native
    def getUser(params: GetUserRequest): Request[GetUserResponse]                                     = js.native
    def getUserSettings(params: GetUserSettingsRequest): Request[GetUserSettingsResponse]             = js.native
    def getVoiceConnector(params: GetVoiceConnectorRequest): Request[GetVoiceConnectorResponse]       = js.native
    def getVoiceConnectorGroup(params: GetVoiceConnectorGroupRequest): Request[GetVoiceConnectorGroupResponse] =
      js.native
    def getVoiceConnectorLoggingConfiguration(
        params: GetVoiceConnectorLoggingConfigurationRequest
    ): Request[GetVoiceConnectorLoggingConfigurationResponse] = js.native
    def getVoiceConnectorOrigination(
        params: GetVoiceConnectorOriginationRequest
    ): Request[GetVoiceConnectorOriginationResponse] = js.native
    def getVoiceConnectorStreamingConfiguration(
        params: GetVoiceConnectorStreamingConfigurationRequest
    ): Request[GetVoiceConnectorStreamingConfigurationResponse] = js.native
    def getVoiceConnectorTermination(
        params: GetVoiceConnectorTerminationRequest
    ): Request[GetVoiceConnectorTerminationResponse] = js.native
    def getVoiceConnectorTerminationHealth(
        params: GetVoiceConnectorTerminationHealthRequest
    ): Request[GetVoiceConnectorTerminationHealthResponse]                                                  = js.native
    def inviteUsers(params: InviteUsersRequest): Request[InviteUsersResponse]                               = js.native
    def listAccounts(params: ListAccountsRequest): Request[ListAccountsResponse]                            = js.native
    def listAttendees(params: ListAttendeesRequest): Request[ListAttendeesResponse]                         = js.native
    def listBots(params: ListBotsRequest): Request[ListBotsResponse]                                        = js.native
    def listMeetings(params: ListMeetingsRequest): Request[ListMeetingsResponse]                            = js.native
    def listPhoneNumberOrders(params: ListPhoneNumberOrdersRequest): Request[ListPhoneNumberOrdersResponse] = js.native
    def listPhoneNumbers(params: ListPhoneNumbersRequest): Request[ListPhoneNumbersResponse]                = js.native
    def listRoomMemberships(params: ListRoomMembershipsRequest): Request[ListRoomMembershipsResponse]       = js.native
    def listRooms(params: ListRoomsRequest): Request[ListRoomsResponse]                                     = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse]                                     = js.native
    def listVoiceConnectorGroups(params: ListVoiceConnectorGroupsRequest): Request[ListVoiceConnectorGroupsResponse] =
      js.native
    def listVoiceConnectorTerminationCredentials(
        params: ListVoiceConnectorTerminationCredentialsRequest
    ): Request[ListVoiceConnectorTerminationCredentialsResponse]                                      = js.native
    def listVoiceConnectors(params: ListVoiceConnectorsRequest): Request[ListVoiceConnectorsResponse] = js.native
    def logoutUser(params: LogoutUserRequest): Request[LogoutUserResponse]                            = js.native
    def putEventsConfiguration(params: PutEventsConfigurationRequest): Request[PutEventsConfigurationResponse] =
      js.native
    def putVoiceConnectorLoggingConfiguration(
        params: PutVoiceConnectorLoggingConfigurationRequest
    ): Request[PutVoiceConnectorLoggingConfigurationResponse] = js.native
    def putVoiceConnectorOrigination(
        params: PutVoiceConnectorOriginationRequest
    ): Request[PutVoiceConnectorOriginationResponse] = js.native
    def putVoiceConnectorStreamingConfiguration(
        params: PutVoiceConnectorStreamingConfigurationRequest
    ): Request[PutVoiceConnectorStreamingConfigurationResponse] = js.native
    def putVoiceConnectorTermination(
        params: PutVoiceConnectorTerminationRequest
    ): Request[PutVoiceConnectorTerminationResponse] = js.native
    def putVoiceConnectorTerminationCredentials(
        params: PutVoiceConnectorTerminationCredentialsRequest
    ): Request[js.Object] = js.native
    def regenerateSecurityToken(params: RegenerateSecurityTokenRequest): Request[RegenerateSecurityTokenResponse] =
      js.native
    def resetPersonalPIN(params: ResetPersonalPINRequest): Request[ResetPersonalPINResponse]       = js.native
    def restorePhoneNumber(params: RestorePhoneNumberRequest): Request[RestorePhoneNumberResponse] = js.native
    def searchAvailablePhoneNumbers(
        params: SearchAvailablePhoneNumbersRequest
    ): Request[SearchAvailablePhoneNumbersResponse]                                                         = js.native
    def updateAccount(params: UpdateAccountRequest): Request[UpdateAccountResponse]                         = js.native
    def updateAccountSettings(params: UpdateAccountSettingsRequest): Request[UpdateAccountSettingsResponse] = js.native
    def updateBot(params: UpdateBotRequest): Request[UpdateBotResponse]                                     = js.native
    def updateGlobalSettings(params: UpdateGlobalSettingsRequest): Request[js.Object]                       = js.native
    def updatePhoneNumber(params: UpdatePhoneNumberRequest): Request[UpdatePhoneNumberResponse]             = js.native
    def updatePhoneNumberSettings(params: UpdatePhoneNumberSettingsRequest): Request[js.Object]             = js.native
    def updateRoom(params: UpdateRoomRequest): Request[UpdateRoomResponse]                                  = js.native
    def updateRoomMembership(params: UpdateRoomMembershipRequest): Request[UpdateRoomMembershipResponse]    = js.native
    def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse]                                  = js.native
    def updateUserSettings(params: UpdateUserSettingsRequest): Request[js.Object]                           = js.native
    def updateVoiceConnector(params: UpdateVoiceConnectorRequest): Request[UpdateVoiceConnectorResponse]    = js.native
    def updateVoiceConnectorGroup(
        params: UpdateVoiceConnectorGroupRequest
    ): Request[UpdateVoiceConnectorGroupResponse] = js.native
  }

  /**
    * The Amazon Chime account details. An AWS account can have multiple Amazon Chime accounts.
    */
  @js.native
  @Factory
  trait Account extends js.Object {
    var AccountId: String
    var AwsAccountId: String
    var Name: String
    var AccountType: js.UndefOr[AccountType]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var DefaultLicense: js.UndefOr[License]
    var SigninDelegateGroups: js.UndefOr[SigninDelegateGroupList]
    var SupportedLicenses: js.UndefOr[LicenseList]
  }

  /**
    * Settings related to the Amazon Chime account. This includes settings that start or stop remote control of shared screens, or start or stop the dial-out option in the Amazon Chime web application. For more information about these settings, see [[https://docs.aws.amazon.com/chime/latest/ag/policies.html|Use the Policies Page]] in the <i>Amazon Chime Administration Guide</i>.
    */
  @js.native
  @Factory
  trait AccountSettings extends js.Object {
    var DisableRemoteControl: js.UndefOr[Boolean]
    var EnableDialOut: js.UndefOr[Boolean]
  }

  @js.native
  sealed trait AccountType extends js.Any
  object AccountType extends js.Object {
    val Team                = "Team".asInstanceOf[AccountType]
    val EnterpriseDirectory = "EnterpriseDirectory".asInstanceOf[AccountType]
    val EnterpriseLWA       = "EnterpriseLWA".asInstanceOf[AccountType]
    val EnterpriseOIDC      = "EnterpriseOIDC".asInstanceOf[AccountType]

    val values = js.Object.freeze(js.Array(Team, EnterpriseDirectory, EnterpriseLWA, EnterpriseOIDC))
  }

  /**
    * The Alexa for Business metadata associated with an Amazon Chime user, used to integrate Alexa for Business with a device.
    */
  @js.native
  @Factory
  trait AlexaForBusinessMetadata extends js.Object {
    var AlexaForBusinessRoomArn: js.UndefOr[SensitiveString]
    var IsAlexaForBusinessEnabled: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait AssociatePhoneNumberWithUserRequest extends js.Object {
    var AccountId: String
    var E164PhoneNumber: E164PhoneNumber
    var UserId: String
  }

  @js.native
  @Factory
  trait AssociatePhoneNumberWithUserResponse extends js.Object {}

  @js.native
  @Factory
  trait AssociatePhoneNumbersWithVoiceConnectorGroupRequest extends js.Object {
    var VoiceConnectorGroupId: NonEmptyString
    var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList]
    var ForceAssociate: js.UndefOr[NullableBoolean]
  }

  @js.native
  @Factory
  trait AssociatePhoneNumbersWithVoiceConnectorGroupResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  @js.native
  @Factory
  trait AssociatePhoneNumbersWithVoiceConnectorRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
    var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList]
    var ForceAssociate: js.UndefOr[NullableBoolean]
  }

  @js.native
  @Factory
  trait AssociatePhoneNumbersWithVoiceConnectorResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  @js.native
  @Factory
  trait AssociateSigninDelegateGroupsWithAccountRequest extends js.Object {
    var AccountId: NonEmptyString
    var SigninDelegateGroups: SigninDelegateGroupList
  }

  @js.native
  @Factory
  trait AssociateSigninDelegateGroupsWithAccountResponse extends js.Object {}

  /**
    * An Amazon Chime SDK meeting attendee. Includes a unique <code>AttendeeId</code> and <code>JoinToken</code>. The <code>JoinToken</code> allows a client to authenticate and join as the specified attendee. The <code>JoinToken</code> expires when the meeting ends or when <a>DeleteAttendee</a> is called. After that, the attendee is unable to join the meeting.
    *  We recommend securely transferring each <code>JoinToken</code> from your server application to the client so that no other client has access to the token except for the one authorized to represent the attendee.
    */
  @js.native
  @Factory
  trait Attendee extends js.Object {
    var AttendeeId: js.UndefOr[GuidString]
    var ExternalUserId: js.UndefOr[ExternalUserIdType]
    var JoinToken: js.UndefOr[JoinTokenString]
  }

  @js.native
  @Factory
  trait BatchCreateAttendeeRequest extends js.Object {
    var Attendees: CreateAttendeeRequestItemList
    var MeetingId: GuidString
  }

  @js.native
  @Factory
  trait BatchCreateAttendeeResponse extends js.Object {
    var Attendees: js.UndefOr[AttendeeList]
    var Errors: js.UndefOr[BatchCreateAttendeeErrorList]
  }

  @js.native
  @Factory
  trait BatchCreateRoomMembershipRequest extends js.Object {
    var AccountId: NonEmptyString
    var MembershipItemList: MembershipItemList
    var RoomId: NonEmptyString
  }

  @js.native
  @Factory
  trait BatchCreateRoomMembershipResponse extends js.Object {
    var Errors: js.UndefOr[MemberErrorList]
  }

  @js.native
  @Factory
  trait BatchDeletePhoneNumberRequest extends js.Object {
    var PhoneNumberIds: NonEmptyStringList
  }

  @js.native
  @Factory
  trait BatchDeletePhoneNumberResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  @js.native
  @Factory
  trait BatchSuspendUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserIdList: UserIdList
  }

  @js.native
  @Factory
  trait BatchSuspendUserResponse extends js.Object {
    var UserErrors: js.UndefOr[UserErrorList]
  }

  @js.native
  @Factory
  trait BatchUnsuspendUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserIdList: UserIdList
  }

  @js.native
  @Factory
  trait BatchUnsuspendUserResponse extends js.Object {
    var UserErrors: js.UndefOr[UserErrorList]
  }

  @js.native
  @Factory
  trait BatchUpdatePhoneNumberRequest extends js.Object {
    var UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList
  }

  @js.native
  @Factory
  trait BatchUpdatePhoneNumberResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  @js.native
  @Factory
  trait BatchUpdateUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UpdateUserRequestItems: UpdateUserRequestItemList
  }

  @js.native
  @Factory
  trait BatchUpdateUserResponse extends js.Object {
    var UserErrors: js.UndefOr[UserErrorList]
  }

  /**
    * A resource that allows Enterprise account administrators to configure an interface to receive events from Amazon Chime.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait BotType extends js.Any
  object BotType extends js.Object {
    val ChatBot = "ChatBot".asInstanceOf[BotType]

    val values = js.Object.freeze(js.Array(ChatBot))
  }

  /**
    * The Amazon Chime Business Calling settings for the administrator's AWS account. Includes any Amazon S3 buckets designated for storing call detail records.
    */
  @js.native
  @Factory
  trait BusinessCallingSettings extends js.Object {
    var CdrBucket: js.UndefOr[String]
  }

  @js.native
  sealed trait CallingNameStatus extends js.Any
  object CallingNameStatus extends js.Object {
    val Unassigned       = "Unassigned".asInstanceOf[CallingNameStatus]
    val UpdateInProgress = "UpdateInProgress".asInstanceOf[CallingNameStatus]
    val UpdateSucceeded  = "UpdateSucceeded".asInstanceOf[CallingNameStatus]
    val UpdateFailed     = "UpdateFailed".asInstanceOf[CallingNameStatus]

    val values = js.Object.freeze(js.Array(Unassigned, UpdateInProgress, UpdateSucceeded, UpdateFailed))
  }

  @js.native
  @Factory
  trait CreateAccountRequest extends js.Object {
    var Name: AccountName
  }

  @js.native
  @Factory
  trait CreateAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  /**
    * The list of errors returned when errors are encountered during the BatchCreateAttendee and CreateAttendee actions. This includes external user IDs, error codes, and error messages.
    */
  @js.native
  @Factory
  trait CreateAttendeeError extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
    var ExternalUserId: js.UndefOr[ExternalUserIdType]
  }

  @js.native
  @Factory
  trait CreateAttendeeRequest extends js.Object {
    var ExternalUserId: ExternalUserIdType
    var MeetingId: GuidString
  }

  /**
    * The Amazon Chime SDK attendee fields to create, used with the BatchCreateAttendee action.
    */
  @js.native
  @Factory
  trait CreateAttendeeRequestItem extends js.Object {
    var ExternalUserId: ExternalUserIdType
  }

  @js.native
  @Factory
  trait CreateAttendeeResponse extends js.Object {
    var Attendee: js.UndefOr[Attendee]
  }

  @js.native
  @Factory
  trait CreateBotRequest extends js.Object {
    var AccountId: NonEmptyString
    var DisplayName: SensitiveString
    var Domain: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait CreateBotResponse extends js.Object {
    var Bot: js.UndefOr[Bot]
  }

  @js.native
  @Factory
  trait CreateMeetingRequest extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var MediaRegion: js.UndefOr[String]
    var MeetingHostId: js.UndefOr[ExternalUserIdType]
    var NotificationsConfiguration: js.UndefOr[MeetingNotificationConfiguration]
  }

  @js.native
  @Factory
  trait CreateMeetingResponse extends js.Object {
    var Meeting: js.UndefOr[Meeting]
  }

  @js.native
  @Factory
  trait CreatePhoneNumberOrderRequest extends js.Object {
    var E164PhoneNumbers: E164PhoneNumberList
    var ProductType: PhoneNumberProductType
  }

  @js.native
  @Factory
  trait CreatePhoneNumberOrderResponse extends js.Object {
    var PhoneNumberOrder: js.UndefOr[PhoneNumberOrder]
  }

  @js.native
  @Factory
  trait CreateRoomMembershipRequest extends js.Object {
    var AccountId: NonEmptyString
    var MemberId: NonEmptyString
    var RoomId: NonEmptyString
    var Role: js.UndefOr[RoomMembershipRole]
  }

  @js.native
  @Factory
  trait CreateRoomMembershipResponse extends js.Object {
    var RoomMembership: js.UndefOr[RoomMembership]
  }

  @js.native
  @Factory
  trait CreateRoomRequest extends js.Object {
    var AccountId: NonEmptyString
    var Name: SensitiveString
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  @js.native
  @Factory
  trait CreateRoomResponse extends js.Object {
    var Room: js.UndefOr[Room]
  }

  @js.native
  @Factory
  trait CreateUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var Email: js.UndefOr[EmailAddress]
    var UserType: js.UndefOr[UserType]
    var Username: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  @js.native
  @Factory
  trait CreateVoiceConnectorGroupRequest extends js.Object {
    var Name: VoiceConnectorGroupName
    var VoiceConnectorItems: js.UndefOr[VoiceConnectorItemList]
  }

  @js.native
  @Factory
  trait CreateVoiceConnectorGroupResponse extends js.Object {
    var VoiceConnectorGroup: js.UndefOr[VoiceConnectorGroup]
  }

  @js.native
  @Factory
  trait CreateVoiceConnectorRequest extends js.Object {
    var Name: VoiceConnectorName
    var RequireEncryption: Boolean
    var AwsRegion: js.UndefOr[VoiceConnectorAwsRegion]
  }

  @js.native
  @Factory
  trait CreateVoiceConnectorResponse extends js.Object {
    var VoiceConnector: js.UndefOr[VoiceConnector]
  }

  /**
    * The SIP credentials used to authenticate requests to your Amazon Chime Voice Connector.
    */
  @js.native
  @Factory
  trait Credential extends js.Object {
    var Password: js.UndefOr[SensitiveString]
    var Username: js.UndefOr[SensitiveString]
  }

  @js.native
  @Factory
  trait DeleteAccountRequest extends js.Object {
    var AccountId: NonEmptyString
  }

  @js.native
  @Factory
  trait DeleteAccountResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteAttendeeRequest extends js.Object {
    var AttendeeId: GuidString
    var MeetingId: GuidString
  }

  @js.native
  @Factory
  trait DeleteEventsConfigurationRequest extends js.Object {
    var AccountId: NonEmptyString
    var BotId: NonEmptyString
  }

  @js.native
  @Factory
  trait DeleteMeetingRequest extends js.Object {
    var MeetingId: GuidString
  }

  @js.native
  @Factory
  trait DeletePhoneNumberRequest extends js.Object {
    var PhoneNumberId: String
  }

  @js.native
  @Factory
  trait DeleteRoomMembershipRequest extends js.Object {
    var AccountId: NonEmptyString
    var MemberId: NonEmptyString
    var RoomId: NonEmptyString
  }

  @js.native
  @Factory
  trait DeleteRoomRequest extends js.Object {
    var AccountId: NonEmptyString
    var RoomId: NonEmptyString
  }

  @js.native
  @Factory
  trait DeleteVoiceConnectorGroupRequest extends js.Object {
    var VoiceConnectorGroupId: NonEmptyString
  }

  @js.native
  @Factory
  trait DeleteVoiceConnectorOriginationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  @js.native
  @Factory
  trait DeleteVoiceConnectorRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  @js.native
  @Factory
  trait DeleteVoiceConnectorStreamingConfigurationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  @js.native
  @Factory
  trait DeleteVoiceConnectorTerminationCredentialsRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
    var Usernames: js.UndefOr[SensitiveStringList]
  }

  @js.native
  @Factory
  trait DeleteVoiceConnectorTerminationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  @js.native
  @Factory
  trait DisassociatePhoneNumberFromUserRequest extends js.Object {
    var AccountId: String
    var UserId: String
  }

  @js.native
  @Factory
  trait DisassociatePhoneNumberFromUserResponse extends js.Object {}

  @js.native
  @Factory
  trait DisassociatePhoneNumbersFromVoiceConnectorGroupRequest extends js.Object {
    var VoiceConnectorGroupId: NonEmptyString
    var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList]
  }

  @js.native
  @Factory
  trait DisassociatePhoneNumbersFromVoiceConnectorGroupResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  @js.native
  @Factory
  trait DisassociatePhoneNumbersFromVoiceConnectorRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
    var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList]
  }

  @js.native
  @Factory
  trait DisassociatePhoneNumbersFromVoiceConnectorResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  @js.native
  @Factory
  trait DisassociateSigninDelegateGroupsFromAccountRequest extends js.Object {
    var AccountId: NonEmptyString
    var GroupNames: NonEmptyStringList
  }

  @js.native
  @Factory
  trait DisassociateSigninDelegateGroupsFromAccountResponse extends js.Object {}

  @js.native
  sealed trait EmailStatus extends js.Any
  object EmailStatus extends js.Object {
    val NotSent = "NotSent".asInstanceOf[EmailStatus]
    val Sent    = "Sent".asInstanceOf[EmailStatus]
    val Failed  = "Failed".asInstanceOf[EmailStatus]

    val values = js.Object.freeze(js.Array(NotSent, Sent, Failed))
  }

  @js.native
  sealed trait ErrorCode extends js.Any
  object ErrorCode extends js.Object {
    val BadRequest                           = "BadRequest".asInstanceOf[ErrorCode]
    val Conflict                             = "Conflict".asInstanceOf[ErrorCode]
    val Forbidden                            = "Forbidden".asInstanceOf[ErrorCode]
    val NotFound                             = "NotFound".asInstanceOf[ErrorCode]
    val PreconditionFailed                   = "PreconditionFailed".asInstanceOf[ErrorCode]
    val ResourceLimitExceeded                = "ResourceLimitExceeded".asInstanceOf[ErrorCode]
    val ServiceFailure                       = "ServiceFailure".asInstanceOf[ErrorCode]
    val AccessDenied                         = "AccessDenied".asInstanceOf[ErrorCode]
    val ServiceUnavailable                   = "ServiceUnavailable".asInstanceOf[ErrorCode]
    val Throttled                            = "Throttled".asInstanceOf[ErrorCode]
    val Unauthorized                         = "Unauthorized".asInstanceOf[ErrorCode]
    val Unprocessable                        = "Unprocessable".asInstanceOf[ErrorCode]
    val VoiceConnectorGroupAssociationsExist = "VoiceConnectorGroupAssociationsExist".asInstanceOf[ErrorCode]
    val PhoneNumberAssociationsExist         = "PhoneNumberAssociationsExist".asInstanceOf[ErrorCode]

    val values = js.Object.freeze(
      js.Array(
        BadRequest,
        Conflict,
        Forbidden,
        NotFound,
        PreconditionFailed,
        ResourceLimitExceeded,
        ServiceFailure,
        AccessDenied,
        ServiceUnavailable,
        Throttled,
        Unauthorized,
        Unprocessable,
        VoiceConnectorGroupAssociationsExist,
        PhoneNumberAssociationsExist
      )
    )
  }

  /**
    * The configuration that allows a bot to receive outgoing events. Can be either an HTTPS endpoint or a Lambda function ARN.
    */
  @js.native
  @Factory
  trait EventsConfiguration extends js.Object {
    var BotId: js.UndefOr[String]
    var LambdaFunctionArn: js.UndefOr[SensitiveString]
    var OutboundEventsHTTPSEndpoint: js.UndefOr[SensitiveString]
  }

  @js.native
  @Factory
  trait GetAccountRequest extends js.Object {
    var AccountId: NonEmptyString
  }

  @js.native
  @Factory
  trait GetAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  @js.native
  @Factory
  trait GetAccountSettingsRequest extends js.Object {
    var AccountId: NonEmptyString
  }

  @js.native
  @Factory
  trait GetAccountSettingsResponse extends js.Object {
    var AccountSettings: js.UndefOr[AccountSettings]
  }

  @js.native
  @Factory
  trait GetAttendeeRequest extends js.Object {
    var AttendeeId: GuidString
    var MeetingId: GuidString
  }

  @js.native
  @Factory
  trait GetAttendeeResponse extends js.Object {
    var Attendee: js.UndefOr[Attendee]
  }

  @js.native
  @Factory
  trait GetBotRequest extends js.Object {
    var AccountId: NonEmptyString
    var BotId: NonEmptyString
  }

  @js.native
  @Factory
  trait GetBotResponse extends js.Object {
    var Bot: js.UndefOr[Bot]
  }

  @js.native
  @Factory
  trait GetEventsConfigurationRequest extends js.Object {
    var AccountId: NonEmptyString
    var BotId: NonEmptyString
  }

  @js.native
  @Factory
  trait GetEventsConfigurationResponse extends js.Object {
    var EventsConfiguration: js.UndefOr[EventsConfiguration]
  }

  @js.native
  @Factory
  trait GetGlobalSettingsResponse extends js.Object {
    var BusinessCalling: js.UndefOr[BusinessCallingSettings]
    var VoiceConnector: js.UndefOr[VoiceConnectorSettings]
  }

  @js.native
  @Factory
  trait GetMeetingRequest extends js.Object {
    var MeetingId: GuidString
  }

  @js.native
  @Factory
  trait GetMeetingResponse extends js.Object {
    var Meeting: js.UndefOr[Meeting]
  }

  @js.native
  @Factory
  trait GetPhoneNumberOrderRequest extends js.Object {
    var PhoneNumberOrderId: GuidString
  }

  @js.native
  @Factory
  trait GetPhoneNumberOrderResponse extends js.Object {
    var PhoneNumberOrder: js.UndefOr[PhoneNumberOrder]
  }

  @js.native
  @Factory
  trait GetPhoneNumberRequest extends js.Object {
    var PhoneNumberId: String
  }

  @js.native
  @Factory
  trait GetPhoneNumberResponse extends js.Object {
    var PhoneNumber: js.UndefOr[PhoneNumber]
  }

  @js.native
  @Factory
  trait GetPhoneNumberSettingsResponse extends js.Object {
    var CallingName: js.UndefOr[CallingName]
    var CallingNameUpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  @js.native
  @Factory
  trait GetRoomRequest extends js.Object {
    var AccountId: NonEmptyString
    var RoomId: NonEmptyString
  }

  @js.native
  @Factory
  trait GetRoomResponse extends js.Object {
    var Room: js.UndefOr[Room]
  }

  @js.native
  @Factory
  trait GetUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserId: NonEmptyString
  }

  @js.native
  @Factory
  trait GetUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  @js.native
  @Factory
  trait GetUserSettingsRequest extends js.Object {
    var AccountId: String
    var UserId: String
  }

  @js.native
  @Factory
  trait GetUserSettingsResponse extends js.Object {
    var UserSettings: js.UndefOr[UserSettings]
  }

  @js.native
  @Factory
  trait GetVoiceConnectorGroupRequest extends js.Object {
    var VoiceConnectorGroupId: NonEmptyString
  }

  @js.native
  @Factory
  trait GetVoiceConnectorGroupResponse extends js.Object {
    var VoiceConnectorGroup: js.UndefOr[VoiceConnectorGroup]
  }

  @js.native
  @Factory
  trait GetVoiceConnectorLoggingConfigurationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  @js.native
  @Factory
  trait GetVoiceConnectorLoggingConfigurationResponse extends js.Object {
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration]
  }

  @js.native
  @Factory
  trait GetVoiceConnectorOriginationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  @js.native
  @Factory
  trait GetVoiceConnectorOriginationResponse extends js.Object {
    var Origination: js.UndefOr[Origination]
  }

  @js.native
  @Factory
  trait GetVoiceConnectorRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  @js.native
  @Factory
  trait GetVoiceConnectorResponse extends js.Object {
    var VoiceConnector: js.UndefOr[VoiceConnector]
  }

  @js.native
  @Factory
  trait GetVoiceConnectorStreamingConfigurationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  @js.native
  @Factory
  trait GetVoiceConnectorStreamingConfigurationResponse extends js.Object {
    var StreamingConfiguration: js.UndefOr[StreamingConfiguration]
  }

  @js.native
  @Factory
  trait GetVoiceConnectorTerminationHealthRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  @js.native
  @Factory
  trait GetVoiceConnectorTerminationHealthResponse extends js.Object {
    var TerminationHealth: js.UndefOr[TerminationHealth]
  }

  @js.native
  @Factory
  trait GetVoiceConnectorTerminationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  @js.native
  @Factory
  trait GetVoiceConnectorTerminationResponse extends js.Object {
    var Termination: js.UndefOr[Termination]
  }

  /**
    * Invitation object returned after emailing users to invite them to join the Amazon Chime <code>Team</code> account.
    */
  @js.native
  @Factory
  trait Invite extends js.Object {
    var EmailAddress: js.UndefOr[EmailAddress]
    var EmailStatus: js.UndefOr[EmailStatus]
    var InviteId: js.UndefOr[String]
    var Status: js.UndefOr[InviteStatus]
  }

  @js.native
  sealed trait InviteStatus extends js.Any
  object InviteStatus extends js.Object {
    val Pending  = "Pending".asInstanceOf[InviteStatus]
    val Accepted = "Accepted".asInstanceOf[InviteStatus]
    val Failed   = "Failed".asInstanceOf[InviteStatus]

    val values = js.Object.freeze(js.Array(Pending, Accepted, Failed))
  }

  @js.native
  @Factory
  trait InviteUsersRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserEmailList: UserEmailList
    var UserType: js.UndefOr[UserType]
  }

  @js.native
  @Factory
  trait InviteUsersResponse extends js.Object {
    var Invites: js.UndefOr[InviteList]
  }

  @js.native
  sealed trait License extends js.Any
  object License extends js.Object {
    val Basic    = "Basic".asInstanceOf[License]
    val Plus     = "Plus".asInstanceOf[License]
    val Pro      = "Pro".asInstanceOf[License]
    val ProTrial = "ProTrial".asInstanceOf[License]

    val values = js.Object.freeze(js.Array(Basic, Plus, Pro, ProTrial))
  }

  @js.native
  @Factory
  trait ListAccountsRequest extends js.Object {
    var MaxResults: js.UndefOr[ProfileServiceMaxResults]
    var Name: js.UndefOr[AccountName]
    var NextToken: js.UndefOr[String]
    var UserEmail: js.UndefOr[EmailAddress]
  }

  @js.native
  @Factory
  trait ListAccountsResponse extends js.Object {
    var Accounts: js.UndefOr[AccountList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListAttendeesRequest extends js.Object {
    var MeetingId: GuidString
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListAttendeesResponse extends js.Object {
    var Attendees: js.UndefOr[AttendeeList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListBotsRequest extends js.Object {
    var AccountId: NonEmptyString
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListBotsResponse extends js.Object {
    var Bots: js.UndefOr[BotList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListMeetingsRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListMeetingsResponse extends js.Object {
    var Meetings: js.UndefOr[MeetingList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListPhoneNumberOrdersRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListPhoneNumberOrdersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PhoneNumberOrders: js.UndefOr[PhoneNumberOrderList]
  }

  @js.native
  @Factory
  trait ListPhoneNumbersRequest extends js.Object {
    var FilterName: js.UndefOr[PhoneNumberAssociationName]
    var FilterValue: js.UndefOr[String]
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
    var ProductType: js.UndefOr[PhoneNumberProductType]
    var Status: js.UndefOr[PhoneNumberStatus]
  }

  @js.native
  @Factory
  trait ListPhoneNumbersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PhoneNumbers: js.UndefOr[PhoneNumberList]
  }

  @js.native
  @Factory
  trait ListRoomMembershipsRequest extends js.Object {
    var AccountId: NonEmptyString
    var RoomId: NonEmptyString
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListRoomMembershipsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var RoomMemberships: js.UndefOr[RoomMembershipList]
  }

  @js.native
  @Factory
  trait ListRoomsRequest extends js.Object {
    var AccountId: NonEmptyString
    var MaxResults: js.UndefOr[ResultMax]
    var MemberId: js.UndefOr[String]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListRoomsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Rooms: js.UndefOr[RoomList]
  }

  @js.native
  @Factory
  trait ListUsersRequest extends js.Object {
    var AccountId: NonEmptyString
    var MaxResults: js.UndefOr[ProfileServiceMaxResults]
    var NextToken: js.UndefOr[String]
    var UserEmail: js.UndefOr[EmailAddress]
    var UserType: js.UndefOr[UserType]
  }

  @js.native
  @Factory
  trait ListUsersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Users: js.UndefOr[UserList]
  }

  @js.native
  @Factory
  trait ListVoiceConnectorGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListVoiceConnectorGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var VoiceConnectorGroups: js.UndefOr[VoiceConnectorGroupList]
  }

  @js.native
  @Factory
  trait ListVoiceConnectorTerminationCredentialsRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  @js.native
  @Factory
  trait ListVoiceConnectorTerminationCredentialsResponse extends js.Object {
    var Usernames: js.UndefOr[SensitiveStringList]
  }

  @js.native
  @Factory
  trait ListVoiceConnectorsRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListVoiceConnectorsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var VoiceConnectors: js.UndefOr[VoiceConnectorList]
  }

  /**
    * The logging configuration associated with an Amazon Chime Voice Connector. Specifies whether SIP message logs are enabled for sending to Amazon CloudWatch Logs.
    */
  @js.native
  @Factory
  trait LoggingConfiguration extends js.Object {
    var EnableSIPLogs: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait LogoutUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserId: NonEmptyString
  }

  @js.native
  @Factory
  trait LogoutUserResponse extends js.Object {}

  /**
    * A set of endpoints used by clients to connect to the media service group for a Amazon Chime SDK meeting.
    */
  @js.native
  @Factory
  trait MediaPlacement extends js.Object {
    var AudioFallbackUrl: js.UndefOr[UriType]
    var AudioHostUrl: js.UndefOr[UriType]
    var ScreenDataUrl: js.UndefOr[UriType]
    var ScreenSharingUrl: js.UndefOr[UriType]
    var ScreenViewingUrl: js.UndefOr[UriType]
    var SignalingUrl: js.UndefOr[UriType]
    var TurnControlUrl: js.UndefOr[UriType]
  }

  /**
    * A meeting created using the Amazon Chime SDK.
    */
  @js.native
  @Factory
  trait Meeting extends js.Object {
    var MediaPlacement: js.UndefOr[MediaPlacement]
    var MediaRegion: js.UndefOr[String]
    var MeetingId: js.UndefOr[GuidString]
  }

  /**
    * The configuration for resource targets to receive notifications when Amazon Chime SDK meeting and attendee events occur.
    */
  @js.native
  @Factory
  trait MeetingNotificationConfiguration extends js.Object {
    var SnsTopicArn: js.UndefOr[Arn]
    var SqsQueueArn: js.UndefOr[Arn]
  }

  /**
    * The member details, such as email address, name, member ID, and member type.
    */
  @js.native
  @Factory
  trait Member extends js.Object {
    var AccountId: js.UndefOr[NonEmptyString]
    var Email: js.UndefOr[SensitiveString]
    var FullName: js.UndefOr[SensitiveString]
    var MemberId: js.UndefOr[NonEmptyString]
    var MemberType: js.UndefOr[MemberType]
  }

  /**
    * The list of errors returned when a member action results in an error.
    */
  @js.native
  @Factory
  trait MemberError extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[String]
    var MemberId: js.UndefOr[NonEmptyString]
  }

  @js.native
  sealed trait MemberType extends js.Any
  object MemberType extends js.Object {
    val User    = "User".asInstanceOf[MemberType]
    val Bot     = "Bot".asInstanceOf[MemberType]
    val Webhook = "Webhook".asInstanceOf[MemberType]

    val values = js.Object.freeze(js.Array(User, Bot, Webhook))
  }

  /**
    * Membership details, such as member ID and member role.
    */
  @js.native
  @Factory
  trait MembershipItem extends js.Object {
    var MemberId: js.UndefOr[NonEmptyString]
    var Role: js.UndefOr[RoomMembershipRole]
  }

  /**
    * A phone number for which an order has been placed.
    */
  @js.native
  @Factory
  trait OrderedPhoneNumber extends js.Object {
    var E164PhoneNumber: js.UndefOr[E164PhoneNumber]
    var Status: js.UndefOr[OrderedPhoneNumberStatus]
  }

  @js.native
  sealed trait OrderedPhoneNumberStatus extends js.Any
  object OrderedPhoneNumberStatus extends js.Object {
    val Processing = "Processing".asInstanceOf[OrderedPhoneNumberStatus]
    val Acquired   = "Acquired".asInstanceOf[OrderedPhoneNumberStatus]
    val Failed     = "Failed".asInstanceOf[OrderedPhoneNumberStatus]

    val values = js.Object.freeze(js.Array(Processing, Acquired, Failed))
  }

  /**
    * Origination settings enable your SIP hosts to receive inbound calls using your Amazon Chime Voice Connector.
    */
  @js.native
  @Factory
  trait Origination extends js.Object {
    var Disabled: js.UndefOr[Boolean]
    var Routes: js.UndefOr[OriginationRouteList]
  }

  /**
    * Origination routes define call distribution properties for your SIP hosts to receive inbound calls using your Amazon Chime Voice Connector. Limit: Ten origination routes for each Amazon Chime Voice Connector.
    */
  @js.native
  @Factory
  trait OriginationRoute extends js.Object {
    var Host: js.UndefOr[String]
    var Port: js.UndefOr[Port]
    var Priority: js.UndefOr[OriginationRoutePriority]
    var Protocol: js.UndefOr[OriginationRouteProtocol]
    var Weight: js.UndefOr[OriginationRouteWeight]
  }

  @js.native
  sealed trait OriginationRouteProtocol extends js.Any
  object OriginationRouteProtocol extends js.Object {
    val TCP = "TCP".asInstanceOf[OriginationRouteProtocol]
    val UDP = "UDP".asInstanceOf[OriginationRouteProtocol]

    val values = js.Object.freeze(js.Array(TCP, UDP))
  }

  /**
    * A phone number used for Amazon Chime Business Calling or an Amazon Chime Voice Connector.
    */
  @js.native
  @Factory
  trait PhoneNumber extends js.Object {
    var Associations: js.UndefOr[PhoneNumberAssociationList]
    var CallingName: js.UndefOr[CallingName]
    var CallingNameStatus: js.UndefOr[CallingNameStatus]
    var Capabilities: js.UndefOr[PhoneNumberCapabilities]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var DeletionTimestamp: js.UndefOr[Iso8601Timestamp]
    var E164PhoneNumber: js.UndefOr[E164PhoneNumber]
    var PhoneNumberId: js.UndefOr[String]
    var ProductType: js.UndefOr[PhoneNumberProductType]
    var Status: js.UndefOr[PhoneNumberStatus]
    var Type: js.UndefOr[PhoneNumberType]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  /**
    * The phone number associations, such as Amazon Chime account ID, Amazon Chime user ID, Amazon Chime Voice Connector ID, or Amazon Chime Voice Connector group ID.
    */
  @js.native
  @Factory
  trait PhoneNumberAssociation extends js.Object {
    var AssociatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var Name: js.UndefOr[PhoneNumberAssociationName]
    var Value: js.UndefOr[String]
  }

  @js.native
  sealed trait PhoneNumberAssociationName extends js.Any
  object PhoneNumberAssociationName extends js.Object {
    val AccountId             = "AccountId".asInstanceOf[PhoneNumberAssociationName]
    val UserId                = "UserId".asInstanceOf[PhoneNumberAssociationName]
    val VoiceConnectorId      = "VoiceConnectorId".asInstanceOf[PhoneNumberAssociationName]
    val VoiceConnectorGroupId = "VoiceConnectorGroupId".asInstanceOf[PhoneNumberAssociationName]

    val values = js.Object.freeze(js.Array(AccountId, UserId, VoiceConnectorId, VoiceConnectorGroupId))
  }

  /**
    * The phone number capabilities for Amazon Chime Business Calling phone numbers, such as enabled inbound and outbound calling and text messaging.
    */
  @js.native
  @Factory
  trait PhoneNumberCapabilities extends js.Object {
    var InboundCall: js.UndefOr[NullableBoolean]
    var InboundMMS: js.UndefOr[NullableBoolean]
    var InboundSMS: js.UndefOr[NullableBoolean]
    var OutboundCall: js.UndefOr[NullableBoolean]
    var OutboundMMS: js.UndefOr[NullableBoolean]
    var OutboundSMS: js.UndefOr[NullableBoolean]
  }

  /**
    * If the phone number action fails for one or more of the phone numbers in the request, a list of the phone numbers is returned, along with error codes and error messages.
    */
  @js.native
  @Factory
  trait PhoneNumberError extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[String]
    var PhoneNumberId: js.UndefOr[NonEmptyString]
  }

  /**
    * The details of a phone number order created for Amazon Chime.
    */
  @js.native
  @Factory
  trait PhoneNumberOrder extends js.Object {
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var OrderedPhoneNumbers: js.UndefOr[OrderedPhoneNumberList]
    var PhoneNumberOrderId: js.UndefOr[GuidString]
    var ProductType: js.UndefOr[PhoneNumberProductType]
    var Status: js.UndefOr[PhoneNumberOrderStatus]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  @js.native
  sealed trait PhoneNumberOrderStatus extends js.Any
  object PhoneNumberOrderStatus extends js.Object {
    val Processing = "Processing".asInstanceOf[PhoneNumberOrderStatus]
    val Successful = "Successful".asInstanceOf[PhoneNumberOrderStatus]
    val Failed     = "Failed".asInstanceOf[PhoneNumberOrderStatus]
    val Partial    = "Partial".asInstanceOf[PhoneNumberOrderStatus]

    val values = js.Object.freeze(js.Array(Processing, Successful, Failed, Partial))
  }

  @js.native
  sealed trait PhoneNumberProductType extends js.Any
  object PhoneNumberProductType extends js.Object {
    val BusinessCalling = "BusinessCalling".asInstanceOf[PhoneNumberProductType]
    val VoiceConnector  = "VoiceConnector".asInstanceOf[PhoneNumberProductType]

    val values = js.Object.freeze(js.Array(BusinessCalling, VoiceConnector))
  }

  @js.native
  sealed trait PhoneNumberStatus extends js.Any
  object PhoneNumberStatus extends js.Object {
    val AcquireInProgress = "AcquireInProgress".asInstanceOf[PhoneNumberStatus]
    val AcquireFailed     = "AcquireFailed".asInstanceOf[PhoneNumberStatus]
    val Unassigned        = "Unassigned".asInstanceOf[PhoneNumberStatus]
    val Assigned          = "Assigned".asInstanceOf[PhoneNumberStatus]
    val ReleaseInProgress = "ReleaseInProgress".asInstanceOf[PhoneNumberStatus]
    val DeleteInProgress  = "DeleteInProgress".asInstanceOf[PhoneNumberStatus]
    val ReleaseFailed     = "ReleaseFailed".asInstanceOf[PhoneNumberStatus]
    val DeleteFailed      = "DeleteFailed".asInstanceOf[PhoneNumberStatus]

    val values = js.Object.freeze(
      js.Array(
        AcquireInProgress,
        AcquireFailed,
        Unassigned,
        Assigned,
        ReleaseInProgress,
        DeleteInProgress,
        ReleaseFailed,
        DeleteFailed
      )
    )
  }

  @js.native
  sealed trait PhoneNumberType extends js.Any
  object PhoneNumberType extends js.Object {
    val Local    = "Local".asInstanceOf[PhoneNumberType]
    val TollFree = "TollFree".asInstanceOf[PhoneNumberType]

    val values = js.Object.freeze(js.Array(Local, TollFree))
  }

  @js.native
  @Factory
  trait PutEventsConfigurationRequest extends js.Object {
    var AccountId: NonEmptyString
    var BotId: NonEmptyString
    var LambdaFunctionArn: js.UndefOr[SensitiveString]
    var OutboundEventsHTTPSEndpoint: js.UndefOr[SensitiveString]
  }

  @js.native
  @Factory
  trait PutEventsConfigurationResponse extends js.Object {
    var EventsConfiguration: js.UndefOr[EventsConfiguration]
  }

  @js.native
  @Factory
  trait PutVoiceConnectorLoggingConfigurationRequest extends js.Object {
    var LoggingConfiguration: LoggingConfiguration
    var VoiceConnectorId: NonEmptyString
  }

  @js.native
  @Factory
  trait PutVoiceConnectorLoggingConfigurationResponse extends js.Object {
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration]
  }

  @js.native
  @Factory
  trait PutVoiceConnectorOriginationRequest extends js.Object {
    var Origination: Origination
    var VoiceConnectorId: NonEmptyString
  }

  @js.native
  @Factory
  trait PutVoiceConnectorOriginationResponse extends js.Object {
    var Origination: js.UndefOr[Origination]
  }

  @js.native
  @Factory
  trait PutVoiceConnectorStreamingConfigurationRequest extends js.Object {
    var StreamingConfiguration: StreamingConfiguration
    var VoiceConnectorId: NonEmptyString
  }

  @js.native
  @Factory
  trait PutVoiceConnectorStreamingConfigurationResponse extends js.Object {
    var StreamingConfiguration: js.UndefOr[StreamingConfiguration]
  }

  @js.native
  @Factory
  trait PutVoiceConnectorTerminationCredentialsRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
    var Credentials: js.UndefOr[CredentialList]
  }

  @js.native
  @Factory
  trait PutVoiceConnectorTerminationRequest extends js.Object {
    var Termination: Termination
    var VoiceConnectorId: NonEmptyString
  }

  @js.native
  @Factory
  trait PutVoiceConnectorTerminationResponse extends js.Object {
    var Termination: js.UndefOr[Termination]
  }

  @js.native
  @Factory
  trait RegenerateSecurityTokenRequest extends js.Object {
    var AccountId: NonEmptyString
    var BotId: NonEmptyString
  }

  @js.native
  @Factory
  trait RegenerateSecurityTokenResponse extends js.Object {
    var Bot: js.UndefOr[Bot]
  }

  @js.native
  sealed trait RegistrationStatus extends js.Any
  object RegistrationStatus extends js.Object {
    val Unregistered = "Unregistered".asInstanceOf[RegistrationStatus]
    val Registered   = "Registered".asInstanceOf[RegistrationStatus]
    val Suspended    = "Suspended".asInstanceOf[RegistrationStatus]

    val values = js.Object.freeze(js.Array(Unregistered, Registered, Suspended))
  }

  @js.native
  @Factory
  trait ResetPersonalPINRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserId: NonEmptyString
  }

  @js.native
  @Factory
  trait ResetPersonalPINResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  @js.native
  @Factory
  trait RestorePhoneNumberRequest extends js.Object {
    var PhoneNumberId: NonEmptyString
  }

  @js.native
  @Factory
  trait RestorePhoneNumberResponse extends js.Object {
    var PhoneNumber: js.UndefOr[PhoneNumber]
  }

  /**
    * The Amazon Chime chat room details.
    */
  @js.native
  @Factory
  trait Room extends js.Object {
    var AccountId: js.UndefOr[NonEmptyString]
    var CreatedBy: js.UndefOr[NonEmptyString]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var Name: js.UndefOr[SensitiveString]
    var RoomId: js.UndefOr[NonEmptyString]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  /**
    * The room membership details.
    */
  @js.native
  @Factory
  trait RoomMembership extends js.Object {
    var InvitedBy: js.UndefOr[NonEmptyString]
    var Member: js.UndefOr[Member]
    var Role: js.UndefOr[RoomMembershipRole]
    var RoomId: js.UndefOr[NonEmptyString]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  @js.native
  sealed trait RoomMembershipRole extends js.Any
  object RoomMembershipRole extends js.Object {
    val Administrator = "Administrator".asInstanceOf[RoomMembershipRole]
    val Member        = "Member".asInstanceOf[RoomMembershipRole]

    val values = js.Object.freeze(js.Array(Administrator, Member))
  }

  @js.native
  @Factory
  trait SearchAvailablePhoneNumbersRequest extends js.Object {
    var AreaCode: js.UndefOr[String]
    var City: js.UndefOr[String]
    var Country: js.UndefOr[String]
    var MaxResults: js.UndefOr[PhoneNumberMaxResults]
    var NextToken: js.UndefOr[String]
    var State: js.UndefOr[String]
    var TollFreePrefix: js.UndefOr[TollFreePrefix]
  }

  @js.native
  @Factory
  trait SearchAvailablePhoneNumbersResponse extends js.Object {
    var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList]
  }

  /**
    * An Active Directory (AD) group whose members are granted permission to act as delegates.
    */
  @js.native
  @Factory
  trait SigninDelegateGroup extends js.Object {
    var GroupName: js.UndefOr[NonEmptyString]
  }

  /**
    * The streaming configuration associated with an Amazon Chime Voice Connector. Specifies whether media streaming is enabled for sending to Amazon Kinesis, and shows the retention period for the Amazon Kinesis data, in hours.
    */
  @js.native
  @Factory
  trait StreamingConfiguration extends js.Object {
    var DataRetentionInHours: DataRetentionInHours
    var Disabled: js.UndefOr[Boolean]
  }

  /**
    * Settings that allow management of telephony permissions for an Amazon Chime user, such as inbound and outbound calling and text messaging.
    */
  @js.native
  @Factory
  trait TelephonySettings extends js.Object {
    var InboundCalling: Boolean
    var OutboundCalling: Boolean
    var SMS: Boolean
  }

  /**
    * Termination settings enable your SIP hosts to make outbound calls using your Amazon Chime Voice Connector.
    */
  @js.native
  @Factory
  trait Termination extends js.Object {
    var CallingRegions: js.UndefOr[CallingRegionList]
    var CidrAllowedList: js.UndefOr[StringList]
    var CpsLimit: js.UndefOr[CpsLimit]
    var DefaultPhoneNumber: js.UndefOr[E164PhoneNumber]
    var Disabled: js.UndefOr[Boolean]
  }

  /**
    * The termination health details, including the source IP address and timestamp of the last successful SIP <code>OPTIONS</code> message from your SIP infrastructure.
    */
  @js.native
  @Factory
  trait TerminationHealth extends js.Object {
    var Source: js.UndefOr[String]
    var Timestamp: js.UndefOr[Iso8601Timestamp]
  }

  @js.native
  @Factory
  trait UpdateAccountRequest extends js.Object {
    var AccountId: NonEmptyString
    var Name: js.UndefOr[AccountName]
  }

  @js.native
  @Factory
  trait UpdateAccountResponse extends js.Object {
    var Account: js.UndefOr[Account]
  }

  @js.native
  @Factory
  trait UpdateAccountSettingsRequest extends js.Object {
    var AccountId: NonEmptyString
    var AccountSettings: AccountSettings
  }

  @js.native
  @Factory
  trait UpdateAccountSettingsResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateBotRequest extends js.Object {
    var AccountId: NonEmptyString
    var BotId: NonEmptyString
    var Disabled: js.UndefOr[NullableBoolean]
  }

  @js.native
  @Factory
  trait UpdateBotResponse extends js.Object {
    var Bot: js.UndefOr[Bot]
  }

  @js.native
  @Factory
  trait UpdateGlobalSettingsRequest extends js.Object {
    var BusinessCalling: BusinessCallingSettings
    var VoiceConnector: VoiceConnectorSettings
  }

  @js.native
  @Factory
  trait UpdatePhoneNumberRequest extends js.Object {
    var PhoneNumberId: String
    var CallingName: js.UndefOr[CallingName]
    var ProductType: js.UndefOr[PhoneNumberProductType]
  }

  /**
    * The phone number ID, product type, or calling name fields to update, used with the <a>BatchUpdatePhoneNumber</a> and <a>UpdatePhoneNumber</a> actions.
    */
  @js.native
  @Factory
  trait UpdatePhoneNumberRequestItem extends js.Object {
    var PhoneNumberId: NonEmptyString
    var CallingName: js.UndefOr[CallingName]
    var ProductType: js.UndefOr[PhoneNumberProductType]
  }

  @js.native
  @Factory
  trait UpdatePhoneNumberResponse extends js.Object {
    var PhoneNumber: js.UndefOr[PhoneNumber]
  }

  @js.native
  @Factory
  trait UpdatePhoneNumberSettingsRequest extends js.Object {
    var CallingName: CallingName
  }

  @js.native
  @Factory
  trait UpdateRoomMembershipRequest extends js.Object {
    var AccountId: NonEmptyString
    var MemberId: NonEmptyString
    var RoomId: NonEmptyString
    var Role: js.UndefOr[RoomMembershipRole]
  }

  @js.native
  @Factory
  trait UpdateRoomMembershipResponse extends js.Object {
    var RoomMembership: js.UndefOr[RoomMembership]
  }

  @js.native
  @Factory
  trait UpdateRoomRequest extends js.Object {
    var AccountId: NonEmptyString
    var RoomId: NonEmptyString
    var Name: js.UndefOr[SensitiveString]
  }

  @js.native
  @Factory
  trait UpdateRoomResponse extends js.Object {
    var Room: js.UndefOr[Room]
  }

  @js.native
  @Factory
  trait UpdateUserRequest extends js.Object {
    var AccountId: NonEmptyString
    var UserId: NonEmptyString
    var AlexaForBusinessMetadata: js.UndefOr[AlexaForBusinessMetadata]
    var LicenseType: js.UndefOr[License]
    var UserType: js.UndefOr[UserType]
  }

  /**
    * The user ID and user fields to update, used with the <a>BatchUpdateUser</a> action.
    */
  @js.native
  @Factory
  trait UpdateUserRequestItem extends js.Object {
    var UserId: NonEmptyString
    var AlexaForBusinessMetadata: js.UndefOr[AlexaForBusinessMetadata]
    var LicenseType: js.UndefOr[License]
    var UserType: js.UndefOr[UserType]
  }

  @js.native
  @Factory
  trait UpdateUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  @js.native
  @Factory
  trait UpdateUserSettingsRequest extends js.Object {
    var AccountId: String
    var UserId: String
    var UserSettings: UserSettings
  }

  @js.native
  @Factory
  trait UpdateVoiceConnectorGroupRequest extends js.Object {
    var Name: VoiceConnectorGroupName
    var VoiceConnectorGroupId: NonEmptyString
    var VoiceConnectorItems: VoiceConnectorItemList
  }

  @js.native
  @Factory
  trait UpdateVoiceConnectorGroupResponse extends js.Object {
    var VoiceConnectorGroup: js.UndefOr[VoiceConnectorGroup]
  }

  @js.native
  @Factory
  trait UpdateVoiceConnectorRequest extends js.Object {
    var Name: VoiceConnectorName
    var RequireEncryption: Boolean
    var VoiceConnectorId: NonEmptyString
  }

  @js.native
  @Factory
  trait UpdateVoiceConnectorResponse extends js.Object {
    var VoiceConnector: js.UndefOr[VoiceConnector]
  }

  /**
    * The user on the Amazon Chime account.
    */
  @js.native
  @Factory
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

  /**
    * The list of errors returned when errors are encountered during the <a>BatchSuspendUser</a>, <a>BatchUnsuspendUser</a>, or <a>BatchUpdateUser</a> actions. This includes user IDs, error codes, and error messages.
    */
  @js.native
  @Factory
  trait UserError extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[String]
    var UserId: js.UndefOr[NonEmptyString]
  }

  /**
    * Settings associated with an Amazon Chime user, including inbound and outbound calling and text messaging.
    */
  @js.native
  @Factory
  trait UserSettings extends js.Object {
    var Telephony: TelephonySettings
  }

  @js.native
  sealed trait UserType extends js.Any
  object UserType extends js.Object {
    val PrivateUser  = "PrivateUser".asInstanceOf[UserType]
    val SharedDevice = "SharedDevice".asInstanceOf[UserType]

    val values = js.Object.freeze(js.Array(PrivateUser, SharedDevice))
  }

  /**
    * The Amazon Chime Voice Connector configuration, including outbound host name and encryption settings.
    */
  @js.native
  @Factory
  trait VoiceConnector extends js.Object {
    var AwsRegion: js.UndefOr[VoiceConnectorAwsRegion]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var Name: js.UndefOr[VoiceConnectorName]
    var OutboundHostName: js.UndefOr[String]
    var RequireEncryption: js.UndefOr[Boolean]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var VoiceConnectorId: js.UndefOr[NonEmptyString]
  }

  @js.native
  sealed trait VoiceConnectorAwsRegion extends js.Any
  object VoiceConnectorAwsRegion extends js.Object {
    val `us-east-1` = "us-east-1".asInstanceOf[VoiceConnectorAwsRegion]
    val `us-west-2` = "us-west-2".asInstanceOf[VoiceConnectorAwsRegion]

    val values = js.Object.freeze(js.Array(`us-east-1`, `us-west-2`))
  }

  /**
    * The Amazon Chime Voice Connector group configuration, including associated Amazon Chime Voice Connectors. You can include Amazon Chime Voice Connectors from different AWS Regions in your group. This creates a fault tolerant mechanism for fallback in case of availability events.
    */
  @js.native
  @Factory
  trait VoiceConnectorGroup extends js.Object {
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var Name: js.UndefOr[VoiceConnectorGroupName]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var VoiceConnectorGroupId: js.UndefOr[NonEmptyString]
    var VoiceConnectorItems: js.UndefOr[VoiceConnectorItemList]
  }

  /**
    * For Amazon Chime Voice Connector groups, the Amazon Chime Voice Connectors to which to route inbound calls. Includes priority configuration settings. Limit: 3 <code>VoiceConnectorItems</code> per Amazon Chime Voice Connector group.
    */
  @js.native
  @Factory
  trait VoiceConnectorItem extends js.Object {
    var Priority: VoiceConnectorItemPriority
    var VoiceConnectorId: NonEmptyString
  }

  /**
    * The Amazon Chime Voice Connector settings. Includes any Amazon S3 buckets designated for storing call detail records.
    */
  @js.native
  @Factory
  trait VoiceConnectorSettings extends js.Object {
    var CdrBucket: js.UndefOr[String]
  }
}
