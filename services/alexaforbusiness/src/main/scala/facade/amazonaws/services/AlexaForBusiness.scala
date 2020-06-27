package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object alexaforbusiness {
  type Address                         = String
  type AddressBookDataList             = js.Array[AddressBookData]
  type AddressBookDescription          = String
  type AddressBookName                 = String
  type AmazonId                        = String
  type ApplianceDescription            = String
  type ApplianceFriendlyName           = String
  type ApplianceManufacturerName       = String
  type Arn                             = String
  type AudioList                       = js.Array[Audio]
  type AudioLocation                   = String
  type AuthorizationResult             = js.Dictionary[Value]
  type BulletPoint                     = String
  type BulletPoints                    = js.Array[BulletPoint]
  type BusinessReportDeliveryTime      = js.Date
  type BusinessReportDownloadUrl       = String
  type BusinessReportS3Path            = String
  type BusinessReportScheduleList      = js.Array[BusinessReportSchedule]
  type BusinessReportScheduleName      = String
  type CategoryId                      = Double
  type CategoryList                    = js.Array[Category]
  type CategoryName                    = String
  type CertificateTime                 = js.Date
  type ClientId                        = String
  type ClientRequestToken              = String
  type ConferenceProviderName          = String
  type ConferenceProvidersList         = js.Array[ConferenceProvider]
  type ConnectionStatusUpdatedTime     = js.Date
  type ContactDataList                 = js.Array[ContactData]
  type ContactName                     = String
  type CountryCode                     = String
  type CurrentWiFiPassword             = String
  type CustomerS3BucketName            = String
  type Date                            = String
  type DeveloperName                   = String
  type DeviceDataCreatedTime           = js.Date
  type DeviceDataList                  = js.Array[DeviceData]
  type DeviceEventList                 = js.Array[DeviceEvent]
  type DeviceEventTime                 = js.Date
  type DeviceEventValue                = String
  type DeviceLocale                    = String
  type DeviceName                      = String
  type DeviceSerialNumber              = String
  type DeviceSerialNumberForAVS        = String
  type DeviceStatusDetails             = js.Array[DeviceStatusDetail]
  type DeviceType                      = String
  type Email                           = String
  type EndOfMeetingReminderMinutesList = js.Array[Minutes]
  type EndUserLicenseAgreement         = String
  type Endpoint                        = String
  type EnrollmentId                    = String
  type Features                        = js.Array[Feature]
  type FilterKey                       = String
  type FilterList                      = js.Array[Filter]
  type FilterValue                     = String
  type FilterValueList                 = js.Array[FilterValue]
  type GatewayDescription              = String
  type GatewayGroupDescription         = String
  type GatewayGroupName                = String
  type GatewayGroupSummaries           = js.Array[GatewayGroupSummary]
  type GatewayName                     = String
  type GatewaySummaries                = js.Array[GatewaySummary]
  type GatewayVersion                  = String
  type GenericKeyword                  = String
  type GenericKeywords                 = js.Array[GenericKeyword]
  type IconUrl                         = String
  type InvocationPhrase                = String
  type Key                             = String
  type MacAddress                      = String
  type MaxResults                      = Int
  type MaxVolumeLimit                  = Int
  type Minutes                         = Int
  type NetworkProfileDataList          = js.Array[NetworkProfileData]
  type NetworkProfileDescription       = String
  type NetworkProfileName              = String
  type NetworkSsid                     = String
  type NewInThisVersionBulletPoints    = js.Array[BulletPoint]
  type NextToken                       = String
  type NextWiFiPassword                = String
  type OneClickIdDelay                 = String
  type OneClickPinDelay                = String
  type OrganizationName                = String
  type OutboundPhoneNumber             = String
  type PhoneNumberList                 = js.Array[PhoneNumber]
  type PrivacyPolicy                   = String
  type ProductDescription              = String
  type ProductId                       = String
  type ProfileDataList                 = js.Array[ProfileData]
  type ProfileName                     = String
  type ProviderCalendarId              = String
  type RawPhoneNumber                  = String
  type ReleaseDate                     = String
  type ReviewKey                       = String
  type ReviewValue                     = String
  type Reviews                         = js.Dictionary[ReviewValue]
  type RoomDataList                    = js.Array[RoomData]
  type RoomDescription                 = String
  type RoomName                        = String
  type RoomSkillParameterKey           = String
  type RoomSkillParameterValue         = String
  type RoomSkillParameters             = js.Array[RoomSkillParameter]
  type S3KeyPrefix                     = String
  type SampleUtterances                = js.Array[Utterance]
  type ShortDescription                = String
  type ShortSkillIdList                = js.Array[SkillId]
  type SipAddressList                  = js.Array[SipAddress]
  type SipUri                          = String
  type SkillGroupDataList              = js.Array[SkillGroupData]
  type SkillGroupDescription           = String
  type SkillGroupName                  = String
  type SkillId                         = String
  type SkillListMaxResults             = Int
  type SkillName                       = String
  type SkillStoreType                  = String
  type SkillSummaryList                = js.Array[SkillSummary]
  type SkillTypes                      = js.Array[SkillStoreType]
  type SkillsStoreSkillList            = js.Array[SkillsStoreSkill]
  type SmartHomeApplianceList          = js.Array[SmartHomeAppliance]
  type SoftwareVersion                 = String
  type SortKey                         = String
  type SortList                        = js.Array[Sort]
  type SsmlList                        = js.Array[Ssml]
  type SsmlValue                       = String
  type TagKey                          = String
  type TagKeyList                      = js.Array[TagKey]
  type TagList                         = js.Array[Tag]
  type TagValue                        = String
  type TextList                        = js.Array[Text]
  type TextValue                       = String
  type TimeToLiveInSeconds             = Int
  type Timezone                        = String
  type TotalCount                      = Int
  type TrustAnchor                     = String
  type TrustAnchorList                 = js.Array[TrustAnchor]
  type Url                             = String
  type UserCode                        = String
  type UserDataList                    = js.Array[UserData]
  type UserId                          = String
  type Utterance                       = String
  type Value                           = String
  type user_FirstName                  = String
  type user_LastName                   = String
  type user_UserId                     = String

  implicit final class AlexaForBusinessOps(private val service: AlexaForBusiness) extends AnyVal {

    @inline def approveSkillFuture(params: ApproveSkillRequest): Future[ApproveSkillResponse] =
      service.approveSkill(params).promise().toFuture
    @inline def associateContactWithAddressBookFuture(
        params: AssociateContactWithAddressBookRequest
    ): Future[AssociateContactWithAddressBookResponse] =
      service.associateContactWithAddressBook(params).promise().toFuture
    @inline def associateDeviceWithNetworkProfileFuture(
        params: AssociateDeviceWithNetworkProfileRequest
    ): Future[AssociateDeviceWithNetworkProfileResponse] =
      service.associateDeviceWithNetworkProfile(params).promise().toFuture
    @inline def associateDeviceWithRoomFuture(
        params: AssociateDeviceWithRoomRequest
    ): Future[AssociateDeviceWithRoomResponse] = service.associateDeviceWithRoom(params).promise().toFuture
    @inline def associateSkillGroupWithRoomFuture(
        params: AssociateSkillGroupWithRoomRequest
    ): Future[AssociateSkillGroupWithRoomResponse] = service.associateSkillGroupWithRoom(params).promise().toFuture
    @inline def associateSkillWithSkillGroupFuture(
        params: AssociateSkillWithSkillGroupRequest
    ): Future[AssociateSkillWithSkillGroupResponse] = service.associateSkillWithSkillGroup(params).promise().toFuture
    @inline def associateSkillWithUsersFuture(
        params: AssociateSkillWithUsersRequest
    ): Future[AssociateSkillWithUsersResponse] = service.associateSkillWithUsers(params).promise().toFuture
    @inline def createAddressBookFuture(params: CreateAddressBookRequest): Future[CreateAddressBookResponse] =
      service.createAddressBook(params).promise().toFuture
    @inline def createBusinessReportScheduleFuture(
        params: CreateBusinessReportScheduleRequest
    ): Future[CreateBusinessReportScheduleResponse] = service.createBusinessReportSchedule(params).promise().toFuture
    @inline def createConferenceProviderFuture(
        params: CreateConferenceProviderRequest
    ): Future[CreateConferenceProviderResponse] = service.createConferenceProvider(params).promise().toFuture
    @inline def createContactFuture(params: CreateContactRequest): Future[CreateContactResponse] =
      service.createContact(params).promise().toFuture
    @inline def createGatewayGroupFuture(params: CreateGatewayGroupRequest): Future[CreateGatewayGroupResponse] =
      service.createGatewayGroup(params).promise().toFuture
    @inline def createNetworkProfileFuture(params: CreateNetworkProfileRequest): Future[CreateNetworkProfileResponse] =
      service.createNetworkProfile(params).promise().toFuture
    @inline def createProfileFuture(params: CreateProfileRequest): Future[CreateProfileResponse] =
      service.createProfile(params).promise().toFuture
    @inline def createRoomFuture(params: CreateRoomRequest): Future[CreateRoomResponse] =
      service.createRoom(params).promise().toFuture
    @inline def createSkillGroupFuture(params: CreateSkillGroupRequest): Future[CreateSkillGroupResponse] =
      service.createSkillGroup(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] =
      service.createUser(params).promise().toFuture
    @inline def deleteAddressBookFuture(params: DeleteAddressBookRequest): Future[DeleteAddressBookResponse] =
      service.deleteAddressBook(params).promise().toFuture
    @inline def deleteBusinessReportScheduleFuture(
        params: DeleteBusinessReportScheduleRequest
    ): Future[DeleteBusinessReportScheduleResponse] = service.deleteBusinessReportSchedule(params).promise().toFuture
    @inline def deleteConferenceProviderFuture(
        params: DeleteConferenceProviderRequest
    ): Future[DeleteConferenceProviderResponse] = service.deleteConferenceProvider(params).promise().toFuture
    @inline def deleteContactFuture(params: DeleteContactRequest): Future[DeleteContactResponse] =
      service.deleteContact(params).promise().toFuture
    @inline def deleteDeviceFuture(params: DeleteDeviceRequest): Future[DeleteDeviceResponse] =
      service.deleteDevice(params).promise().toFuture
    @inline def deleteDeviceUsageDataFuture(
        params: DeleteDeviceUsageDataRequest
    ): Future[DeleteDeviceUsageDataResponse] = service.deleteDeviceUsageData(params).promise().toFuture
    @inline def deleteGatewayGroupFuture(params: DeleteGatewayGroupRequest): Future[DeleteGatewayGroupResponse] =
      service.deleteGatewayGroup(params).promise().toFuture
    @inline def deleteNetworkProfileFuture(params: DeleteNetworkProfileRequest): Future[DeleteNetworkProfileResponse] =
      service.deleteNetworkProfile(params).promise().toFuture
    @inline def deleteProfileFuture(params: DeleteProfileRequest): Future[DeleteProfileResponse] =
      service.deleteProfile(params).promise().toFuture
    @inline def deleteRoomFuture(params: DeleteRoomRequest): Future[DeleteRoomResponse] =
      service.deleteRoom(params).promise().toFuture
    @inline def deleteRoomSkillParameterFuture(
        params: DeleteRoomSkillParameterRequest
    ): Future[DeleteRoomSkillParameterResponse] = service.deleteRoomSkillParameter(params).promise().toFuture
    @inline def deleteSkillAuthorizationFuture(
        params: DeleteSkillAuthorizationRequest
    ): Future[DeleteSkillAuthorizationResponse] = service.deleteSkillAuthorization(params).promise().toFuture
    @inline def deleteSkillGroupFuture(params: DeleteSkillGroupRequest): Future[DeleteSkillGroupResponse] =
      service.deleteSkillGroup(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[DeleteUserResponse] =
      service.deleteUser(params).promise().toFuture
    @inline def disassociateContactFromAddressBookFuture(
        params: DisassociateContactFromAddressBookRequest
    ): Future[DisassociateContactFromAddressBookResponse] =
      service.disassociateContactFromAddressBook(params).promise().toFuture
    @inline def disassociateDeviceFromRoomFuture(
        params: DisassociateDeviceFromRoomRequest
    ): Future[DisassociateDeviceFromRoomResponse] = service.disassociateDeviceFromRoom(params).promise().toFuture
    @inline def disassociateSkillFromSkillGroupFuture(
        params: DisassociateSkillFromSkillGroupRequest
    ): Future[DisassociateSkillFromSkillGroupResponse] =
      service.disassociateSkillFromSkillGroup(params).promise().toFuture
    @inline def disassociateSkillFromUsersFuture(
        params: DisassociateSkillFromUsersRequest
    ): Future[DisassociateSkillFromUsersResponse] = service.disassociateSkillFromUsers(params).promise().toFuture
    @inline def disassociateSkillGroupFromRoomFuture(
        params: DisassociateSkillGroupFromRoomRequest
    ): Future[DisassociateSkillGroupFromRoomResponse] =
      service.disassociateSkillGroupFromRoom(params).promise().toFuture
    @inline def forgetSmartHomeAppliancesFuture(
        params: ForgetSmartHomeAppliancesRequest
    ): Future[ForgetSmartHomeAppliancesResponse] = service.forgetSmartHomeAppliances(params).promise().toFuture
    @inline def getAddressBookFuture(params: GetAddressBookRequest): Future[GetAddressBookResponse] =
      service.getAddressBook(params).promise().toFuture
    @inline def getConferencePreferenceFuture(
        params: GetConferencePreferenceRequest
    ): Future[GetConferencePreferenceResponse] = service.getConferencePreference(params).promise().toFuture
    @inline def getConferenceProviderFuture(
        params: GetConferenceProviderRequest
    ): Future[GetConferenceProviderResponse] = service.getConferenceProvider(params).promise().toFuture
    @inline def getContactFuture(params: GetContactRequest): Future[GetContactResponse] =
      service.getContact(params).promise().toFuture
    @inline def getDeviceFuture(params: GetDeviceRequest): Future[GetDeviceResponse] =
      service.getDevice(params).promise().toFuture
    @inline def getGatewayFuture(params: GetGatewayRequest): Future[GetGatewayResponse] =
      service.getGateway(params).promise().toFuture
    @inline def getGatewayGroupFuture(params: GetGatewayGroupRequest): Future[GetGatewayGroupResponse] =
      service.getGatewayGroup(params).promise().toFuture
    @inline def getInvitationConfigurationFuture(
        params: GetInvitationConfigurationRequest
    ): Future[GetInvitationConfigurationResponse] = service.getInvitationConfiguration(params).promise().toFuture
    @inline def getNetworkProfileFuture(params: GetNetworkProfileRequest): Future[GetNetworkProfileResponse] =
      service.getNetworkProfile(params).promise().toFuture
    @inline def getProfileFuture(params: GetProfileRequest): Future[GetProfileResponse] =
      service.getProfile(params).promise().toFuture
    @inline def getRoomFuture(params: GetRoomRequest): Future[GetRoomResponse] =
      service.getRoom(params).promise().toFuture
    @inline def getRoomSkillParameterFuture(
        params: GetRoomSkillParameterRequest
    ): Future[GetRoomSkillParameterResponse] = service.getRoomSkillParameter(params).promise().toFuture
    @inline def getSkillGroupFuture(params: GetSkillGroupRequest): Future[GetSkillGroupResponse] =
      service.getSkillGroup(params).promise().toFuture
    @inline def listBusinessReportSchedulesFuture(
        params: ListBusinessReportSchedulesRequest
    ): Future[ListBusinessReportSchedulesResponse] = service.listBusinessReportSchedules(params).promise().toFuture
    @inline def listConferenceProvidersFuture(
        params: ListConferenceProvidersRequest
    ): Future[ListConferenceProvidersResponse] = service.listConferenceProviders(params).promise().toFuture
    @inline def listDeviceEventsFuture(params: ListDeviceEventsRequest): Future[ListDeviceEventsResponse] =
      service.listDeviceEvents(params).promise().toFuture
    @inline def listGatewayGroupsFuture(params: ListGatewayGroupsRequest): Future[ListGatewayGroupsResponse] =
      service.listGatewayGroups(params).promise().toFuture
    @inline def listGatewaysFuture(params: ListGatewaysRequest): Future[ListGatewaysResponse] =
      service.listGateways(params).promise().toFuture
    @inline def listSkillsFuture(params: ListSkillsRequest): Future[ListSkillsResponse] =
      service.listSkills(params).promise().toFuture
    @inline def listSkillsStoreCategoriesFuture(
        params: ListSkillsStoreCategoriesRequest
    ): Future[ListSkillsStoreCategoriesResponse] = service.listSkillsStoreCategories(params).promise().toFuture
    @inline def listSkillsStoreSkillsByCategoryFuture(
        params: ListSkillsStoreSkillsByCategoryRequest
    ): Future[ListSkillsStoreSkillsByCategoryResponse] =
      service.listSkillsStoreSkillsByCategory(params).promise().toFuture
    @inline def listSmartHomeAppliancesFuture(
        params: ListSmartHomeAppliancesRequest
    ): Future[ListSmartHomeAppliancesResponse] = service.listSmartHomeAppliances(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] =
      service.listTags(params).promise().toFuture
    @inline def putConferencePreferenceFuture(
        params: PutConferencePreferenceRequest
    ): Future[PutConferencePreferenceResponse] = service.putConferencePreference(params).promise().toFuture
    @inline def putInvitationConfigurationFuture(
        params: PutInvitationConfigurationRequest
    ): Future[PutInvitationConfigurationResponse] = service.putInvitationConfiguration(params).promise().toFuture
    @inline def putRoomSkillParameterFuture(
        params: PutRoomSkillParameterRequest
    ): Future[PutRoomSkillParameterResponse] = service.putRoomSkillParameter(params).promise().toFuture
    @inline def putSkillAuthorizationFuture(
        params: PutSkillAuthorizationRequest
    ): Future[PutSkillAuthorizationResponse] = service.putSkillAuthorization(params).promise().toFuture
    @inline def registerAVSDeviceFuture(params: RegisterAVSDeviceRequest): Future[RegisterAVSDeviceResponse] =
      service.registerAVSDevice(params).promise().toFuture
    @inline def rejectSkillFuture(params: RejectSkillRequest): Future[RejectSkillResponse] =
      service.rejectSkill(params).promise().toFuture
    @inline def resolveRoomFuture(params: ResolveRoomRequest): Future[ResolveRoomResponse] =
      service.resolveRoom(params).promise().toFuture
    @inline def revokeInvitationFuture(params: RevokeInvitationRequest): Future[RevokeInvitationResponse] =
      service.revokeInvitation(params).promise().toFuture
    @inline def searchAddressBooksFuture(params: SearchAddressBooksRequest): Future[SearchAddressBooksResponse] =
      service.searchAddressBooks(params).promise().toFuture
    @inline def searchContactsFuture(params: SearchContactsRequest): Future[SearchContactsResponse] =
      service.searchContacts(params).promise().toFuture
    @inline def searchDevicesFuture(params: SearchDevicesRequest): Future[SearchDevicesResponse] =
      service.searchDevices(params).promise().toFuture
    @inline def searchNetworkProfilesFuture(
        params: SearchNetworkProfilesRequest
    ): Future[SearchNetworkProfilesResponse] = service.searchNetworkProfiles(params).promise().toFuture
    @inline def searchProfilesFuture(params: SearchProfilesRequest): Future[SearchProfilesResponse] =
      service.searchProfiles(params).promise().toFuture
    @inline def searchRoomsFuture(params: SearchRoomsRequest): Future[SearchRoomsResponse] =
      service.searchRooms(params).promise().toFuture
    @inline def searchSkillGroupsFuture(params: SearchSkillGroupsRequest): Future[SearchSkillGroupsResponse] =
      service.searchSkillGroups(params).promise().toFuture
    @inline def searchUsersFuture(params: SearchUsersRequest): Future[SearchUsersResponse] =
      service.searchUsers(params).promise().toFuture
    @inline def sendAnnouncementFuture(params: SendAnnouncementRequest): Future[SendAnnouncementResponse] =
      service.sendAnnouncement(params).promise().toFuture
    @inline def sendInvitationFuture(params: SendInvitationRequest): Future[SendInvitationResponse] =
      service.sendInvitation(params).promise().toFuture
    @inline def startDeviceSyncFuture(params: StartDeviceSyncRequest): Future[StartDeviceSyncResponse] =
      service.startDeviceSync(params).promise().toFuture
    @inline def startSmartHomeApplianceDiscoveryFuture(
        params: StartSmartHomeApplianceDiscoveryRequest
    ): Future[StartSmartHomeApplianceDiscoveryResponse] =
      service.startSmartHomeApplianceDiscovery(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateAddressBookFuture(params: UpdateAddressBookRequest): Future[UpdateAddressBookResponse] =
      service.updateAddressBook(params).promise().toFuture
    @inline def updateBusinessReportScheduleFuture(
        params: UpdateBusinessReportScheduleRequest
    ): Future[UpdateBusinessReportScheduleResponse] = service.updateBusinessReportSchedule(params).promise().toFuture
    @inline def updateConferenceProviderFuture(
        params: UpdateConferenceProviderRequest
    ): Future[UpdateConferenceProviderResponse] = service.updateConferenceProvider(params).promise().toFuture
    @inline def updateContactFuture(params: UpdateContactRequest): Future[UpdateContactResponse] =
      service.updateContact(params).promise().toFuture
    @inline def updateDeviceFuture(params: UpdateDeviceRequest): Future[UpdateDeviceResponse] =
      service.updateDevice(params).promise().toFuture
    @inline def updateGatewayFuture(params: UpdateGatewayRequest): Future[UpdateGatewayResponse] =
      service.updateGateway(params).promise().toFuture
    @inline def updateGatewayGroupFuture(params: UpdateGatewayGroupRequest): Future[UpdateGatewayGroupResponse] =
      service.updateGatewayGroup(params).promise().toFuture
    @inline def updateNetworkProfileFuture(params: UpdateNetworkProfileRequest): Future[UpdateNetworkProfileResponse] =
      service.updateNetworkProfile(params).promise().toFuture
    @inline def updateProfileFuture(params: UpdateProfileRequest): Future[UpdateProfileResponse] =
      service.updateProfile(params).promise().toFuture
    @inline def updateRoomFuture(params: UpdateRoomRequest): Future[UpdateRoomResponse] =
      service.updateRoom(params).promise().toFuture
    @inline def updateSkillGroupFuture(params: UpdateSkillGroupRequest): Future[UpdateSkillGroupResponse] =
      service.updateSkillGroup(params).promise().toFuture
  }
}

package alexaforbusiness {
  @js.native
  @JSImport("aws-sdk", "AlexaForBusiness")
  class AlexaForBusiness() extends js.Object {
    def this(config: AWSConfig) = this()

    def approveSkill(params: ApproveSkillRequest): Request[ApproveSkillResponse] = js.native
    def associateContactWithAddressBook(
        params: AssociateContactWithAddressBookRequest
    ): Request[AssociateContactWithAddressBookResponse] = js.native
    def associateDeviceWithNetworkProfile(
        params: AssociateDeviceWithNetworkProfileRequest
    ): Request[AssociateDeviceWithNetworkProfileResponse] = js.native
    def associateDeviceWithRoom(params: AssociateDeviceWithRoomRequest): Request[AssociateDeviceWithRoomResponse] =
      js.native
    def associateSkillGroupWithRoom(
        params: AssociateSkillGroupWithRoomRequest
    ): Request[AssociateSkillGroupWithRoomResponse] = js.native
    def associateSkillWithSkillGroup(
        params: AssociateSkillWithSkillGroupRequest
    ): Request[AssociateSkillWithSkillGroupResponse] = js.native
    def associateSkillWithUsers(params: AssociateSkillWithUsersRequest): Request[AssociateSkillWithUsersResponse] =
      js.native
    def createAddressBook(params: CreateAddressBookRequest): Request[CreateAddressBookResponse] = js.native
    def createBusinessReportSchedule(
        params: CreateBusinessReportScheduleRequest
    ): Request[CreateBusinessReportScheduleResponse] = js.native
    def createConferenceProvider(params: CreateConferenceProviderRequest): Request[CreateConferenceProviderResponse] =
      js.native
    def createContact(params: CreateContactRequest): Request[CreateContactResponse]                      = js.native
    def createGatewayGroup(params: CreateGatewayGroupRequest): Request[CreateGatewayGroupResponse]       = js.native
    def createNetworkProfile(params: CreateNetworkProfileRequest): Request[CreateNetworkProfileResponse] = js.native
    def createProfile(params: CreateProfileRequest): Request[CreateProfileResponse]                      = js.native
    def createRoom(params: CreateRoomRequest): Request[CreateRoomResponse]                               = js.native
    def createSkillGroup(params: CreateSkillGroupRequest): Request[CreateSkillGroupResponse]             = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse]                               = js.native
    def deleteAddressBook(params: DeleteAddressBookRequest): Request[DeleteAddressBookResponse]          = js.native
    def deleteBusinessReportSchedule(
        params: DeleteBusinessReportScheduleRequest
    ): Request[DeleteBusinessReportScheduleResponse] = js.native
    def deleteConferenceProvider(params: DeleteConferenceProviderRequest): Request[DeleteConferenceProviderResponse] =
      js.native
    def deleteContact(params: DeleteContactRequest): Request[DeleteContactResponse]                         = js.native
    def deleteDevice(params: DeleteDeviceRequest): Request[DeleteDeviceResponse]                            = js.native
    def deleteDeviceUsageData(params: DeleteDeviceUsageDataRequest): Request[DeleteDeviceUsageDataResponse] = js.native
    def deleteGatewayGroup(params: DeleteGatewayGroupRequest): Request[DeleteGatewayGroupResponse]          = js.native
    def deleteNetworkProfile(params: DeleteNetworkProfileRequest): Request[DeleteNetworkProfileResponse]    = js.native
    def deleteProfile(params: DeleteProfileRequest): Request[DeleteProfileResponse]                         = js.native
    def deleteRoom(params: DeleteRoomRequest): Request[DeleteRoomResponse]                                  = js.native
    def deleteRoomSkillParameter(params: DeleteRoomSkillParameterRequest): Request[DeleteRoomSkillParameterResponse] =
      js.native
    def deleteSkillAuthorization(params: DeleteSkillAuthorizationRequest): Request[DeleteSkillAuthorizationResponse] =
      js.native
    def deleteSkillGroup(params: DeleteSkillGroupRequest): Request[DeleteSkillGroupResponse] = js.native
    def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse]                   = js.native
    def disassociateContactFromAddressBook(
        params: DisassociateContactFromAddressBookRequest
    ): Request[DisassociateContactFromAddressBookResponse] = js.native
    def disassociateDeviceFromRoom(
        params: DisassociateDeviceFromRoomRequest
    ): Request[DisassociateDeviceFromRoomResponse] = js.native
    def disassociateSkillFromSkillGroup(
        params: DisassociateSkillFromSkillGroupRequest
    ): Request[DisassociateSkillFromSkillGroupResponse] = js.native
    def disassociateSkillFromUsers(
        params: DisassociateSkillFromUsersRequest
    ): Request[DisassociateSkillFromUsersResponse] = js.native
    def disassociateSkillGroupFromRoom(
        params: DisassociateSkillGroupFromRoomRequest
    ): Request[DisassociateSkillGroupFromRoomResponse] = js.native
    def forgetSmartHomeAppliances(
        params: ForgetSmartHomeAppliancesRequest
    ): Request[ForgetSmartHomeAppliancesResponse]                                      = js.native
    def getAddressBook(params: GetAddressBookRequest): Request[GetAddressBookResponse] = js.native
    def getConferencePreference(params: GetConferencePreferenceRequest): Request[GetConferencePreferenceResponse] =
      js.native
    def getConferenceProvider(params: GetConferenceProviderRequest): Request[GetConferenceProviderResponse] = js.native
    def getContact(params: GetContactRequest): Request[GetContactResponse]                                  = js.native
    def getDevice(params: GetDeviceRequest): Request[GetDeviceResponse]                                     = js.native
    def getGateway(params: GetGatewayRequest): Request[GetGatewayResponse]                                  = js.native
    def getGatewayGroup(params: GetGatewayGroupRequest): Request[GetGatewayGroupResponse]                   = js.native
    def getInvitationConfiguration(
        params: GetInvitationConfigurationRequest
    ): Request[GetInvitationConfigurationResponse]                                                          = js.native
    def getNetworkProfile(params: GetNetworkProfileRequest): Request[GetNetworkProfileResponse]             = js.native
    def getProfile(params: GetProfileRequest): Request[GetProfileResponse]                                  = js.native
    def getRoom(params: GetRoomRequest): Request[GetRoomResponse]                                           = js.native
    def getRoomSkillParameter(params: GetRoomSkillParameterRequest): Request[GetRoomSkillParameterResponse] = js.native
    def getSkillGroup(params: GetSkillGroupRequest): Request[GetSkillGroupResponse]                         = js.native
    def listBusinessReportSchedules(
        params: ListBusinessReportSchedulesRequest
    ): Request[ListBusinessReportSchedulesResponse] = js.native
    def listConferenceProviders(params: ListConferenceProvidersRequest): Request[ListConferenceProvidersResponse] =
      js.native
    def listDeviceEvents(params: ListDeviceEventsRequest): Request[ListDeviceEventsResponse]    = js.native
    def listGatewayGroups(params: ListGatewayGroupsRequest): Request[ListGatewayGroupsResponse] = js.native
    def listGateways(params: ListGatewaysRequest): Request[ListGatewaysResponse]                = js.native
    def listSkills(params: ListSkillsRequest): Request[ListSkillsResponse]                      = js.native
    def listSkillsStoreCategories(
        params: ListSkillsStoreCategoriesRequest
    ): Request[ListSkillsStoreCategoriesResponse] = js.native
    def listSkillsStoreSkillsByCategory(
        params: ListSkillsStoreSkillsByCategoryRequest
    ): Request[ListSkillsStoreSkillsByCategoryResponse] = js.native
    def listSmartHomeAppliances(params: ListSmartHomeAppliancesRequest): Request[ListSmartHomeAppliancesResponse] =
      js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse] = js.native
    def putConferencePreference(params: PutConferencePreferenceRequest): Request[PutConferencePreferenceResponse] =
      js.native
    def putInvitationConfiguration(
        params: PutInvitationConfigurationRequest
    ): Request[PutInvitationConfigurationResponse]                                                          = js.native
    def putRoomSkillParameter(params: PutRoomSkillParameterRequest): Request[PutRoomSkillParameterResponse] = js.native
    def putSkillAuthorization(params: PutSkillAuthorizationRequest): Request[PutSkillAuthorizationResponse] = js.native
    def registerAVSDevice(params: RegisterAVSDeviceRequest): Request[RegisterAVSDeviceResponse]             = js.native
    def rejectSkill(params: RejectSkillRequest): Request[RejectSkillResponse]                               = js.native
    def resolveRoom(params: ResolveRoomRequest): Request[ResolveRoomResponse]                               = js.native
    def revokeInvitation(params: RevokeInvitationRequest): Request[RevokeInvitationResponse]                = js.native
    def searchAddressBooks(params: SearchAddressBooksRequest): Request[SearchAddressBooksResponse]          = js.native
    def searchContacts(params: SearchContactsRequest): Request[SearchContactsResponse]                      = js.native
    def searchDevices(params: SearchDevicesRequest): Request[SearchDevicesResponse]                         = js.native
    def searchNetworkProfiles(params: SearchNetworkProfilesRequest): Request[SearchNetworkProfilesResponse] = js.native
    def searchProfiles(params: SearchProfilesRequest): Request[SearchProfilesResponse]                      = js.native
    def searchRooms(params: SearchRoomsRequest): Request[SearchRoomsResponse]                               = js.native
    def searchSkillGroups(params: SearchSkillGroupsRequest): Request[SearchSkillGroupsResponse]             = js.native
    def searchUsers(params: SearchUsersRequest): Request[SearchUsersResponse]                               = js.native
    def sendAnnouncement(params: SendAnnouncementRequest): Request[SendAnnouncementResponse]                = js.native
    def sendInvitation(params: SendInvitationRequest): Request[SendInvitationResponse]                      = js.native
    def startDeviceSync(params: StartDeviceSyncRequest): Request[StartDeviceSyncResponse]                   = js.native
    def startSmartHomeApplianceDiscovery(
        params: StartSmartHomeApplianceDiscoveryRequest
    ): Request[StartSmartHomeApplianceDiscoveryResponse]                                        = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                   = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]             = js.native
    def updateAddressBook(params: UpdateAddressBookRequest): Request[UpdateAddressBookResponse] = js.native
    def updateBusinessReportSchedule(
        params: UpdateBusinessReportScheduleRequest
    ): Request[UpdateBusinessReportScheduleResponse] = js.native
    def updateConferenceProvider(params: UpdateConferenceProviderRequest): Request[UpdateConferenceProviderResponse] =
      js.native
    def updateContact(params: UpdateContactRequest): Request[UpdateContactResponse]                      = js.native
    def updateDevice(params: UpdateDeviceRequest): Request[UpdateDeviceResponse]                         = js.native
    def updateGateway(params: UpdateGatewayRequest): Request[UpdateGatewayResponse]                      = js.native
    def updateGatewayGroup(params: UpdateGatewayGroupRequest): Request[UpdateGatewayGroupResponse]       = js.native
    def updateNetworkProfile(params: UpdateNetworkProfileRequest): Request[UpdateNetworkProfileResponse] = js.native
    def updateProfile(params: UpdateProfileRequest): Request[UpdateProfileResponse]                      = js.native
    def updateRoom(params: UpdateRoomRequest): Request[UpdateRoomResponse]                               = js.native
    def updateSkillGroup(params: UpdateSkillGroupRequest): Request[UpdateSkillGroupResponse]             = js.native
  }

  /**
    * An address book with attributes.
    */
  @js.native
  @Factory
  trait AddressBook extends js.Object {
    var AddressBookArn: js.UndefOr[Arn]
    var Description: js.UndefOr[AddressBookDescription]
    var Name: js.UndefOr[AddressBookName]
  }

  /**
    * Information related to an address book.
    */
  @js.native
  @Factory
  trait AddressBookData extends js.Object {
    var AddressBookArn: js.UndefOr[Arn]
    var Description: js.UndefOr[AddressBookDescription]
    var Name: js.UndefOr[AddressBookName]
  }

  @js.native
  @Factory
  trait ApproveSkillRequest extends js.Object {
    var SkillId: SkillId
  }

  @js.native
  @Factory
  trait ApproveSkillResponse extends js.Object {}

  @js.native
  @Factory
  trait AssociateContactWithAddressBookRequest extends js.Object {
    var AddressBookArn: Arn
    var ContactArn: Arn
  }

  @js.native
  @Factory
  trait AssociateContactWithAddressBookResponse extends js.Object {}

  @js.native
  @Factory
  trait AssociateDeviceWithNetworkProfileRequest extends js.Object {
    var DeviceArn: Arn
    var NetworkProfileArn: Arn
  }

  @js.native
  @Factory
  trait AssociateDeviceWithNetworkProfileResponse extends js.Object {}

  @js.native
  @Factory
  trait AssociateDeviceWithRoomRequest extends js.Object {
    var DeviceArn: js.UndefOr[Arn]
    var RoomArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait AssociateDeviceWithRoomResponse extends js.Object {}

  @js.native
  @Factory
  trait AssociateSkillGroupWithRoomRequest extends js.Object {
    var RoomArn: js.UndefOr[Arn]
    var SkillGroupArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait AssociateSkillGroupWithRoomResponse extends js.Object {}

  @js.native
  @Factory
  trait AssociateSkillWithSkillGroupRequest extends js.Object {
    var SkillId: SkillId
    var SkillGroupArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait AssociateSkillWithSkillGroupResponse extends js.Object {}

  @js.native
  @Factory
  trait AssociateSkillWithUsersRequest extends js.Object {
    var SkillId: SkillId
  }

  @js.native
  @Factory
  trait AssociateSkillWithUsersResponse extends js.Object {}

  /**
    * The audio message. There is a 1 MB limit on the audio file input and the only supported format is MP3. To convert your MP3 audio files to an Alexa-friendly,
    *  required codec version (MPEG version 2) and bit rate (48 kbps), you might use converter software. One option for this is a command-line tool, FFmpeg. For more information, see [[https://www.ffmpeg.org/|FFmpeg]]. The following command converts the provided &lt;input-file&gt; to an MP3 file that is played in the announcement:
    *  <code>ffmpeg -i &lt;input-file&gt; -ac 2 -codec:a libmp3lame -b:a 48k -ar 16000 &lt;output-file.mp3&gt;</code>
    */
  @js.native
  @Factory
  trait Audio extends js.Object {
    var Locale: Locale
    var Location: AudioLocation
  }

  /**
    * Usage report with specified parameters.
    */
  @js.native
  @Factory
  trait BusinessReport extends js.Object {
    var DeliveryTime: js.UndefOr[BusinessReportDeliveryTime]
    var DownloadUrl: js.UndefOr[BusinessReportDownloadUrl]
    var FailureCode: js.UndefOr[BusinessReportFailureCode]
    var S3Location: js.UndefOr[BusinessReportS3Location]
    var Status: js.UndefOr[BusinessReportStatus]
  }

  /**
    * The content range of the report.
    */
  @js.native
  @Factory
  trait BusinessReportContentRange extends js.Object {
    var Interval: js.UndefOr[BusinessReportInterval]
  }

  @js.native
  sealed trait BusinessReportFailureCode extends js.Any
  object BusinessReportFailureCode extends js.Object {
    val ACCESS_DENIED    = "ACCESS_DENIED".asInstanceOf[BusinessReportFailureCode]
    val NO_SUCH_BUCKET   = "NO_SUCH_BUCKET".asInstanceOf[BusinessReportFailureCode]
    val INTERNAL_FAILURE = "INTERNAL_FAILURE".asInstanceOf[BusinessReportFailureCode]

    val values = js.Object.freeze(js.Array(ACCESS_DENIED, NO_SUCH_BUCKET, INTERNAL_FAILURE))
  }

  @js.native
  sealed trait BusinessReportFormat extends js.Any
  object BusinessReportFormat extends js.Object {
    val CSV     = "CSV".asInstanceOf[BusinessReportFormat]
    val CSV_ZIP = "CSV_ZIP".asInstanceOf[BusinessReportFormat]

    val values = js.Object.freeze(js.Array(CSV, CSV_ZIP))
  }

  @js.native
  sealed trait BusinessReportInterval extends js.Any
  object BusinessReportInterval extends js.Object {
    val ONE_DAY     = "ONE_DAY".asInstanceOf[BusinessReportInterval]
    val ONE_WEEK    = "ONE_WEEK".asInstanceOf[BusinessReportInterval]
    val THIRTY_DAYS = "THIRTY_DAYS".asInstanceOf[BusinessReportInterval]

    val values = js.Object.freeze(js.Array(ONE_DAY, ONE_WEEK, THIRTY_DAYS))
  }

  /**
    * The recurrence of the reports.
    */
  @js.native
  @Factory
  trait BusinessReportRecurrence extends js.Object {
    var StartDate: js.UndefOr[Date]
  }

  /**
    * The S3 location of the output reports.
    */
  @js.native
  @Factory
  trait BusinessReportS3Location extends js.Object {
    var BucketName: js.UndefOr[CustomerS3BucketName]
    var Path: js.UndefOr[BusinessReportS3Path]
  }

  /**
    * The schedule of the usage report.
    */
  @js.native
  @Factory
  trait BusinessReportSchedule extends js.Object {
    var ContentRange: js.UndefOr[BusinessReportContentRange]
    var Format: js.UndefOr[BusinessReportFormat]
    var LastBusinessReport: js.UndefOr[BusinessReport]
    var Recurrence: js.UndefOr[BusinessReportRecurrence]
    var S3BucketName: js.UndefOr[CustomerS3BucketName]
    var S3KeyPrefix: js.UndefOr[S3KeyPrefix]
    var ScheduleArn: js.UndefOr[Arn]
    var ScheduleName: js.UndefOr[BusinessReportScheduleName]
  }

  @js.native
  sealed trait BusinessReportStatus extends js.Any
  object BusinessReportStatus extends js.Object {
    val RUNNING   = "RUNNING".asInstanceOf[BusinessReportStatus]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[BusinessReportStatus]
    val FAILED    = "FAILED".asInstanceOf[BusinessReportStatus]

    val values = js.Object.freeze(js.Array(RUNNING, SUCCEEDED, FAILED))
  }

  /**
    * The skill store category that is shown. Alexa skills are assigned a specific skill category during creation, such as News, Social, and Sports.
    */
  @js.native
  @Factory
  trait Category extends js.Object {
    var CategoryId: js.UndefOr[CategoryId]
    var CategoryName: js.UndefOr[CategoryName]
  }

  @js.native
  sealed trait CommsProtocol extends js.Any
  object CommsProtocol extends js.Object {
    val SIP  = "SIP".asInstanceOf[CommsProtocol]
    val SIPS = "SIPS".asInstanceOf[CommsProtocol]
    val H323 = "H323".asInstanceOf[CommsProtocol]

    val values = js.Object.freeze(js.Array(SIP, SIPS, H323))
  }

  /**
    * The default conference provider that is used if no other scheduled meetings are detected.
    */
  @js.native
  @Factory
  trait ConferencePreference extends js.Object {
    var DefaultConferenceProviderArn: js.UndefOr[Arn]
  }

  /**
    * An entity that provides a conferencing solution. Alexa for Business acts as the voice interface and mediator that connects users to their preferred conference provider. Examples of conference providers include Amazon Chime, Zoom, Cisco, and Polycom.
    */
  @js.native
  @Factory
  trait ConferenceProvider extends js.Object {
    var Arn: js.UndefOr[Arn]
    var IPDialIn: js.UndefOr[IPDialIn]
    var MeetingSetting: js.UndefOr[MeetingSetting]
    var Name: js.UndefOr[ConferenceProviderName]
    var PSTNDialIn: js.UndefOr[PSTNDialIn]
    var Type: js.UndefOr[ConferenceProviderType]
  }

  @js.native
  sealed trait ConferenceProviderType extends js.Any
  object ConferenceProviderType extends js.Object {
    val CHIME              = "CHIME".asInstanceOf[ConferenceProviderType]
    val BLUEJEANS          = "BLUEJEANS".asInstanceOf[ConferenceProviderType]
    val FUZE               = "FUZE".asInstanceOf[ConferenceProviderType]
    val GOOGLE_HANGOUTS    = "GOOGLE_HANGOUTS".asInstanceOf[ConferenceProviderType]
    val POLYCOM            = "POLYCOM".asInstanceOf[ConferenceProviderType]
    val RINGCENTRAL        = "RINGCENTRAL".asInstanceOf[ConferenceProviderType]
    val SKYPE_FOR_BUSINESS = "SKYPE_FOR_BUSINESS".asInstanceOf[ConferenceProviderType]
    val WEBEX              = "WEBEX".asInstanceOf[ConferenceProviderType]
    val ZOOM               = "ZOOM".asInstanceOf[ConferenceProviderType]
    val CUSTOM             = "CUSTOM".asInstanceOf[ConferenceProviderType]

    val values = js.Object.freeze(
      js.Array(CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM, RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM)
    )
  }

  @js.native
  sealed trait ConnectionStatus extends js.Any
  object ConnectionStatus extends js.Object {
    val ONLINE  = "ONLINE".asInstanceOf[ConnectionStatus]
    val OFFLINE = "OFFLINE".asInstanceOf[ConnectionStatus]

    val values = js.Object.freeze(js.Array(ONLINE, OFFLINE))
  }

  /**
    * A contact with attributes.
    */
  @js.native
  @Factory
  trait Contact extends js.Object {
    var ContactArn: js.UndefOr[Arn]
    var DisplayName: js.UndefOr[ContactName]
    var FirstName: js.UndefOr[ContactName]
    var LastName: js.UndefOr[ContactName]
    var PhoneNumber: js.UndefOr[RawPhoneNumber]
    var PhoneNumbers: js.UndefOr[PhoneNumberList]
    var SipAddresses: js.UndefOr[SipAddressList]
  }

  /**
    * Information related to a contact.
    */
  @js.native
  @Factory
  trait ContactData extends js.Object {
    var ContactArn: js.UndefOr[Arn]
    var DisplayName: js.UndefOr[ContactName]
    var FirstName: js.UndefOr[ContactName]
    var LastName: js.UndefOr[ContactName]
    var PhoneNumber: js.UndefOr[RawPhoneNumber]
    var PhoneNumbers: js.UndefOr[PhoneNumberList]
    var SipAddresses: js.UndefOr[SipAddressList]
  }

  /**
    * The content definition. This can contain only one text, SSML, or audio list object.
    */
  @js.native
  @Factory
  trait Content extends js.Object {
    var AudioList: js.UndefOr[AudioList]
    var SsmlList: js.UndefOr[SsmlList]
    var TextList: js.UndefOr[TextList]
  }

  @js.native
  @Factory
  trait CreateAddressBookRequest extends js.Object {
    var Name: AddressBookName
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Description: js.UndefOr[AddressBookDescription]
  }

  @js.native
  @Factory
  trait CreateAddressBookResponse extends js.Object {
    var AddressBookArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateBusinessReportScheduleRequest extends js.Object {
    var ContentRange: BusinessReportContentRange
    var Format: BusinessReportFormat
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Recurrence: js.UndefOr[BusinessReportRecurrence]
    var S3BucketName: js.UndefOr[CustomerS3BucketName]
    var S3KeyPrefix: js.UndefOr[S3KeyPrefix]
    var ScheduleName: js.UndefOr[BusinessReportScheduleName]
  }

  @js.native
  @Factory
  trait CreateBusinessReportScheduleResponse extends js.Object {
    var ScheduleArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateConferenceProviderRequest extends js.Object {
    var ConferenceProviderName: ConferenceProviderName
    var ConferenceProviderType: ConferenceProviderType
    var MeetingSetting: MeetingSetting
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var IPDialIn: js.UndefOr[IPDialIn]
    var PSTNDialIn: js.UndefOr[PSTNDialIn]
  }

  @js.native
  @Factory
  trait CreateConferenceProviderResponse extends js.Object {
    var ConferenceProviderArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateContactRequest extends js.Object {
    var FirstName: ContactName
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var DisplayName: js.UndefOr[ContactName]
    var LastName: js.UndefOr[ContactName]
    var PhoneNumber: js.UndefOr[RawPhoneNumber]
    var PhoneNumbers: js.UndefOr[PhoneNumberList]
    var SipAddresses: js.UndefOr[SipAddressList]
  }

  @js.native
  @Factory
  trait CreateContactResponse extends js.Object {
    var ContactArn: js.UndefOr[Arn]
  }

  /**
    * Creates settings for the end of meeting reminder feature that are applied to a room profile. The end of meeting reminder enables Alexa to remind users when a meeting is ending.
    */
  @js.native
  @Factory
  trait CreateEndOfMeetingReminder extends js.Object {
    var Enabled: Boolean
    var ReminderAtMinutes: EndOfMeetingReminderMinutesList
    var ReminderType: EndOfMeetingReminderType
  }

  @js.native
  @Factory
  trait CreateGatewayGroupRequest extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var Name: GatewayGroupName
    var Description: js.UndefOr[GatewayGroupDescription]
  }

  @js.native
  @Factory
  trait CreateGatewayGroupResponse extends js.Object {
    var GatewayGroupArn: js.UndefOr[Arn]
  }

  /**
    * Creates settings for the instant booking feature that are applied to a room profile. When users start their meeting with Alexa, Alexa automatically books the room for the configured duration if the room is available.
    */
  @js.native
  @Factory
  trait CreateInstantBooking extends js.Object {
    var DurationInMinutes: Minutes
    var Enabled: Boolean
  }

  /**
    * Creates meeting room settings of a room profile.
    */
  @js.native
  @Factory
  trait CreateMeetingRoomConfiguration extends js.Object {
    var EndOfMeetingReminder: js.UndefOr[CreateEndOfMeetingReminder]
    var InstantBooking: js.UndefOr[CreateInstantBooking]
    var RequireCheckIn: js.UndefOr[CreateRequireCheckIn]
    var RoomUtilizationMetricsEnabled: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateNetworkProfileRequest extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var NetworkProfileName: NetworkProfileName
    var SecurityType: NetworkSecurityType
    var Ssid: NetworkSsid
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var CurrentPassword: js.UndefOr[CurrentWiFiPassword]
    var Description: js.UndefOr[NetworkProfileDescription]
    var EapMethod: js.UndefOr[NetworkEapMethod]
    var NextPassword: js.UndefOr[NextWiFiPassword]
    var TrustAnchors: js.UndefOr[TrustAnchorList]
  }

  @js.native
  @Factory
  trait CreateNetworkProfileResponse extends js.Object {
    var NetworkProfileArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateProfileRequest extends js.Object {
    var Address: Address
    var DistanceUnit: DistanceUnit
    var ProfileName: ProfileName
    var TemperatureUnit: TemperatureUnit
    var Timezone: Timezone
    var WakeWord: WakeWord
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Locale: js.UndefOr[DeviceLocale]
    var MaxVolumeLimit: js.UndefOr[MaxVolumeLimit]
    var MeetingRoomConfiguration: js.UndefOr[CreateMeetingRoomConfiguration]
    var PSTNEnabled: js.UndefOr[Boolean]
    var SetupModeDisabled: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateProfileResponse extends js.Object {
    var ProfileArn: js.UndefOr[Arn]
  }

  /**
    * Creates settings for the require check in feature that are applied to a room profile. Require check in allows a meeting room’s Alexa or AVS device to prompt the user to check in; otherwise, the room will be released.
    */
  @js.native
  @Factory
  trait CreateRequireCheckIn extends js.Object {
    var Enabled: Boolean
    var ReleaseAfterMinutes: Minutes
  }

  @js.native
  @Factory
  trait CreateRoomRequest extends js.Object {
    var RoomName: RoomName
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Description: js.UndefOr[RoomDescription]
    var ProfileArn: js.UndefOr[Arn]
    var ProviderCalendarId: js.UndefOr[ProviderCalendarId]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateRoomResponse extends js.Object {
    var RoomArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateSkillGroupRequest extends js.Object {
    var SkillGroupName: SkillGroupName
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Description: js.UndefOr[SkillGroupDescription]
  }

  @js.native
  @Factory
  trait CreateSkillGroupResponse extends js.Object {
    var SkillGroupArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateUserRequest extends js.Object {
    var UserId: user_UserId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Email: js.UndefOr[Email]
    var FirstName: js.UndefOr[user_FirstName]
    var LastName: js.UndefOr[user_LastName]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateUserResponse extends js.Object {
    var UserArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait DeleteAddressBookRequest extends js.Object {
    var AddressBookArn: Arn
  }

  @js.native
  @Factory
  trait DeleteAddressBookResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteBusinessReportScheduleRequest extends js.Object {
    var ScheduleArn: Arn
  }

  @js.native
  @Factory
  trait DeleteBusinessReportScheduleResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteConferenceProviderRequest extends js.Object {
    var ConferenceProviderArn: Arn
  }

  @js.native
  @Factory
  trait DeleteConferenceProviderResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteContactRequest extends js.Object {
    var ContactArn: Arn
  }

  @js.native
  @Factory
  trait DeleteContactResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteDeviceRequest extends js.Object {
    var DeviceArn: Arn
  }

  @js.native
  @Factory
  trait DeleteDeviceResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteDeviceUsageDataRequest extends js.Object {
    var DeviceArn: Arn
    var DeviceUsageType: DeviceUsageType
  }

  @js.native
  @Factory
  trait DeleteDeviceUsageDataResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteGatewayGroupRequest extends js.Object {
    var GatewayGroupArn: Arn
  }

  @js.native
  @Factory
  trait DeleteGatewayGroupResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteNetworkProfileRequest extends js.Object {
    var NetworkProfileArn: Arn
  }

  @js.native
  @Factory
  trait DeleteNetworkProfileResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteProfileRequest extends js.Object {
    var ProfileArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait DeleteProfileResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteRoomRequest extends js.Object {
    var RoomArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait DeleteRoomResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteRoomSkillParameterRequest extends js.Object {
    var ParameterKey: RoomSkillParameterKey
    var SkillId: SkillId
    var RoomArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait DeleteRoomSkillParameterResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteSkillAuthorizationRequest extends js.Object {
    var SkillId: SkillId
    var RoomArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait DeleteSkillAuthorizationResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteSkillGroupRequest extends js.Object {
    var SkillGroupArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait DeleteSkillGroupResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteUserRequest extends js.Object {
    var EnrollmentId: EnrollmentId
    var UserArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait DeleteUserResponse extends js.Object {}

  /**
    * The details about the developer that published the skill.
    */
  @js.native
  @Factory
  trait DeveloperInfo extends js.Object {
    var DeveloperName: js.UndefOr[DeveloperName]
    var Email: js.UndefOr[Email]
    var PrivacyPolicy: js.UndefOr[PrivacyPolicy]
    var Url: js.UndefOr[Url]
  }

  /**
    * A device with attributes.
    */
  @js.native
  @Factory
  trait Device extends js.Object {
    var DeviceArn: js.UndefOr[Arn]
    var DeviceName: js.UndefOr[DeviceName]
    var DeviceSerialNumber: js.UndefOr[DeviceSerialNumber]
    var DeviceStatus: js.UndefOr[DeviceStatus]
    var DeviceStatusInfo: js.UndefOr[DeviceStatusInfo]
    var DeviceType: js.UndefOr[DeviceType]
    var MacAddress: js.UndefOr[MacAddress]
    var NetworkProfileInfo: js.UndefOr[DeviceNetworkProfileInfo]
    var RoomArn: js.UndefOr[Arn]
    var SoftwareVersion: js.UndefOr[SoftwareVersion]
  }

  /**
    * Device attributes.
    */
  @js.native
  @Factory
  trait DeviceData extends js.Object {
    var CreatedTime: js.UndefOr[DeviceDataCreatedTime]
    var DeviceArn: js.UndefOr[Arn]
    var DeviceName: js.UndefOr[DeviceName]
    var DeviceSerialNumber: js.UndefOr[DeviceSerialNumber]
    var DeviceStatus: js.UndefOr[DeviceStatus]
    var DeviceStatusInfo: js.UndefOr[DeviceStatusInfo]
    var DeviceType: js.UndefOr[DeviceType]
    var MacAddress: js.UndefOr[MacAddress]
    var NetworkProfileArn: js.UndefOr[Arn]
    var NetworkProfileName: js.UndefOr[NetworkProfileName]
    var RoomArn: js.UndefOr[Arn]
    var RoomName: js.UndefOr[RoomName]
    var SoftwareVersion: js.UndefOr[SoftwareVersion]
  }

  /**
    * The list of device events.
    */
  @js.native
  @Factory
  trait DeviceEvent extends js.Object {
    var Timestamp: js.UndefOr[DeviceEventTime]
    var Type: js.UndefOr[DeviceEventType]
    var Value: js.UndefOr[DeviceEventValue]
  }

  @js.native
  sealed trait DeviceEventType extends js.Any
  object DeviceEventType extends js.Object {
    val CONNECTION_STATUS = "CONNECTION_STATUS".asInstanceOf[DeviceEventType]
    val DEVICE_STATUS     = "DEVICE_STATUS".asInstanceOf[DeviceEventType]

    val values = js.Object.freeze(js.Array(CONNECTION_STATUS, DEVICE_STATUS))
  }

  /**
    * Detailed information about a device's network profile.
    */
  @js.native
  @Factory
  trait DeviceNetworkProfileInfo extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
    var CertificateExpirationTime: js.UndefOr[CertificateTime]
    var NetworkProfileArn: js.UndefOr[Arn]
  }

  @js.native
  sealed trait DeviceStatus extends js.Any
  object DeviceStatus extends js.Object {
    val READY        = "READY".asInstanceOf[DeviceStatus]
    val PENDING      = "PENDING".asInstanceOf[DeviceStatus]
    val WAS_OFFLINE  = "WAS_OFFLINE".asInstanceOf[DeviceStatus]
    val DEREGISTERED = "DEREGISTERED".asInstanceOf[DeviceStatus]
    val FAILED       = "FAILED".asInstanceOf[DeviceStatus]

    val values = js.Object.freeze(js.Array(READY, PENDING, WAS_OFFLINE, DEREGISTERED, FAILED))
  }

  /**
    * Details of a device’s status.
    */
  @js.native
  @Factory
  trait DeviceStatusDetail extends js.Object {
    var Code: js.UndefOr[DeviceStatusDetailCode]
    var Feature: js.UndefOr[Feature]
  }

  @js.native
  sealed trait DeviceStatusDetailCode extends js.Any
  object DeviceStatusDetailCode extends js.Object {
    val DEVICE_SOFTWARE_UPDATE_NEEDED      = "DEVICE_SOFTWARE_UPDATE_NEEDED".asInstanceOf[DeviceStatusDetailCode]
    val DEVICE_WAS_OFFLINE                 = "DEVICE_WAS_OFFLINE".asInstanceOf[DeviceStatusDetailCode]
    val CREDENTIALS_ACCESS_FAILURE         = "CREDENTIALS_ACCESS_FAILURE".asInstanceOf[DeviceStatusDetailCode]
    val TLS_VERSION_MISMATCH               = "TLS_VERSION_MISMATCH".asInstanceOf[DeviceStatusDetailCode]
    val ASSOCIATION_REJECTION              = "ASSOCIATION_REJECTION".asInstanceOf[DeviceStatusDetailCode]
    val AUTHENTICATION_FAILURE             = "AUTHENTICATION_FAILURE".asInstanceOf[DeviceStatusDetailCode]
    val DHCP_FAILURE                       = "DHCP_FAILURE".asInstanceOf[DeviceStatusDetailCode]
    val INTERNET_UNAVAILABLE               = "INTERNET_UNAVAILABLE".asInstanceOf[DeviceStatusDetailCode]
    val DNS_FAILURE                        = "DNS_FAILURE".asInstanceOf[DeviceStatusDetailCode]
    val UNKNOWN_FAILURE                    = "UNKNOWN_FAILURE".asInstanceOf[DeviceStatusDetailCode]
    val CERTIFICATE_ISSUING_LIMIT_EXCEEDED = "CERTIFICATE_ISSUING_LIMIT_EXCEEDED".asInstanceOf[DeviceStatusDetailCode]
    val INVALID_CERTIFICATE_AUTHORITY      = "INVALID_CERTIFICATE_AUTHORITY".asInstanceOf[DeviceStatusDetailCode]
    val NETWORK_PROFILE_NOT_FOUND          = "NETWORK_PROFILE_NOT_FOUND".asInstanceOf[DeviceStatusDetailCode]
    val INVALID_PASSWORD_STATE             = "INVALID_PASSWORD_STATE".asInstanceOf[DeviceStatusDetailCode]
    val PASSWORD_NOT_FOUND                 = "PASSWORD_NOT_FOUND".asInstanceOf[DeviceStatusDetailCode]

    val values = js.Object.freeze(
      js.Array(
        DEVICE_SOFTWARE_UPDATE_NEEDED,
        DEVICE_WAS_OFFLINE,
        CREDENTIALS_ACCESS_FAILURE,
        TLS_VERSION_MISMATCH,
        ASSOCIATION_REJECTION,
        AUTHENTICATION_FAILURE,
        DHCP_FAILURE,
        INTERNET_UNAVAILABLE,
        DNS_FAILURE,
        UNKNOWN_FAILURE,
        CERTIFICATE_ISSUING_LIMIT_EXCEEDED,
        INVALID_CERTIFICATE_AUTHORITY,
        NETWORK_PROFILE_NOT_FOUND,
        INVALID_PASSWORD_STATE,
        PASSWORD_NOT_FOUND
      )
    )
  }

  /**
    * Detailed information about a device's status.
    */
  @js.native
  @Factory
  trait DeviceStatusInfo extends js.Object {
    var ConnectionStatus: js.UndefOr[ConnectionStatus]
    var ConnectionStatusUpdatedTime: js.UndefOr[ConnectionStatusUpdatedTime]
    var DeviceStatusDetails: js.UndefOr[DeviceStatusDetails]
  }

  @js.native
  sealed trait DeviceUsageType extends js.Any
  object DeviceUsageType extends js.Object {
    val VOICE = "VOICE".asInstanceOf[DeviceUsageType]

    val values = js.Object.freeze(js.Array(VOICE))
  }

  @js.native
  @Factory
  trait DisassociateContactFromAddressBookRequest extends js.Object {
    var AddressBookArn: Arn
    var ContactArn: Arn
  }

  @js.native
  @Factory
  trait DisassociateContactFromAddressBookResponse extends js.Object {}

  @js.native
  @Factory
  trait DisassociateDeviceFromRoomRequest extends js.Object {
    var DeviceArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait DisassociateDeviceFromRoomResponse extends js.Object {}

  @js.native
  @Factory
  trait DisassociateSkillFromSkillGroupRequest extends js.Object {
    var SkillId: SkillId
    var SkillGroupArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait DisassociateSkillFromSkillGroupResponse extends js.Object {}

  @js.native
  @Factory
  trait DisassociateSkillFromUsersRequest extends js.Object {
    var SkillId: SkillId
  }

  @js.native
  @Factory
  trait DisassociateSkillFromUsersResponse extends js.Object {}

  @js.native
  @Factory
  trait DisassociateSkillGroupFromRoomRequest extends js.Object {
    var RoomArn: js.UndefOr[Arn]
    var SkillGroupArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait DisassociateSkillGroupFromRoomResponse extends js.Object {}

  @js.native
  sealed trait DistanceUnit extends js.Any
  object DistanceUnit extends js.Object {
    val METRIC   = "METRIC".asInstanceOf[DistanceUnit]
    val IMPERIAL = "IMPERIAL".asInstanceOf[DistanceUnit]

    val values = js.Object.freeze(js.Array(METRIC, IMPERIAL))
  }

  @js.native
  sealed trait EnablementType extends js.Any
  object EnablementType extends js.Object {
    val ENABLED = "ENABLED".asInstanceOf[EnablementType]
    val PENDING = "PENDING".asInstanceOf[EnablementType]

    val values = js.Object.freeze(js.Array(ENABLED, PENDING))
  }

  @js.native
  sealed trait EnablementTypeFilter extends js.Any
  object EnablementTypeFilter extends js.Object {
    val ENABLED = "ENABLED".asInstanceOf[EnablementTypeFilter]
    val PENDING = "PENDING".asInstanceOf[EnablementTypeFilter]

    val values = js.Object.freeze(js.Array(ENABLED, PENDING))
  }

  /**
    * Settings for the end of meeting reminder feature that are applied to a room profile. The end of meeting reminder enables Alexa to remind users when a meeting is ending.
    */
  @js.native
  @Factory
  trait EndOfMeetingReminder extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var ReminderAtMinutes: js.UndefOr[EndOfMeetingReminderMinutesList]
    var ReminderType: js.UndefOr[EndOfMeetingReminderType]
  }

  @js.native
  sealed trait EndOfMeetingReminderType extends js.Any
  object EndOfMeetingReminderType extends js.Object {
    val ANNOUNCEMENT_TIME_CHECK         = "ANNOUNCEMENT_TIME_CHECK".asInstanceOf[EndOfMeetingReminderType]
    val ANNOUNCEMENT_VARIABLE_TIME_LEFT = "ANNOUNCEMENT_VARIABLE_TIME_LEFT".asInstanceOf[EndOfMeetingReminderType]
    val CHIME                           = "CHIME".asInstanceOf[EndOfMeetingReminderType]
    val KNOCK                           = "KNOCK".asInstanceOf[EndOfMeetingReminderType]

    val values = js.Object.freeze(js.Array(ANNOUNCEMENT_TIME_CHECK, ANNOUNCEMENT_VARIABLE_TIME_LEFT, CHIME, KNOCK))
  }

  @js.native
  sealed trait EnrollmentStatus extends js.Any
  object EnrollmentStatus extends js.Object {
    val INITIALIZED    = "INITIALIZED".asInstanceOf[EnrollmentStatus]
    val PENDING        = "PENDING".asInstanceOf[EnrollmentStatus]
    val REGISTERED     = "REGISTERED".asInstanceOf[EnrollmentStatus]
    val DISASSOCIATING = "DISASSOCIATING".asInstanceOf[EnrollmentStatus]
    val DEREGISTERING  = "DEREGISTERING".asInstanceOf[EnrollmentStatus]

    val values = js.Object.freeze(js.Array(INITIALIZED, PENDING, REGISTERED, DISASSOCIATING, DEREGISTERING))
  }

  @js.native
  sealed trait Feature extends js.Any
  object Feature extends js.Object {
    val BLUETOOTH       = "BLUETOOTH".asInstanceOf[Feature]
    val VOLUME          = "VOLUME".asInstanceOf[Feature]
    val NOTIFICATIONS   = "NOTIFICATIONS".asInstanceOf[Feature]
    val LISTS           = "LISTS".asInstanceOf[Feature]
    val SKILLS          = "SKILLS".asInstanceOf[Feature]
    val NETWORK_PROFILE = "NETWORK_PROFILE".asInstanceOf[Feature]
    val SETTINGS        = "SETTINGS".asInstanceOf[Feature]
    val ALL             = "ALL".asInstanceOf[Feature]

    val values =
      js.Object.freeze(js.Array(BLUETOOTH, VOLUME, NOTIFICATIONS, LISTS, SKILLS, NETWORK_PROFILE, SETTINGS, ALL))
  }

  /**
    * A filter name and value pair that is used to return a more specific list of results. Filters can be used to match a set of resources by various criteria.
    */
  @js.native
  @Factory
  trait Filter extends js.Object {
    var Key: FilterKey
    var Values: FilterValueList
  }

  @js.native
  @Factory
  trait ForgetSmartHomeAppliancesRequest extends js.Object {
    var RoomArn: Arn
  }

  @js.native
  @Factory
  trait ForgetSmartHomeAppliancesResponse extends js.Object {}

  /**
    * The details of the gateway.
    */
  @js.native
  @Factory
  trait Gateway extends js.Object {
    var Arn: js.UndefOr[Arn]
    var Description: js.UndefOr[GatewayDescription]
    var GatewayGroupArn: js.UndefOr[Arn]
    var Name: js.UndefOr[GatewayName]
    var SoftwareVersion: js.UndefOr[GatewayVersion]
  }

  /**
    * The details of the gateway group.
    */
  @js.native
  @Factory
  trait GatewayGroup extends js.Object {
    var Arn: js.UndefOr[Arn]
    var Description: js.UndefOr[GatewayGroupDescription]
    var Name: js.UndefOr[GatewayGroupName]
  }

  /**
    * The summary of a gateway group.
    */
  @js.native
  @Factory
  trait GatewayGroupSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var Description: js.UndefOr[GatewayGroupDescription]
    var Name: js.UndefOr[GatewayGroupName]
  }

  /**
    * The summary of a gateway.
    */
  @js.native
  @Factory
  trait GatewaySummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var Description: js.UndefOr[GatewayDescription]
    var GatewayGroupArn: js.UndefOr[Arn]
    var Name: js.UndefOr[GatewayName]
    var SoftwareVersion: js.UndefOr[GatewayVersion]
  }

  @js.native
  @Factory
  trait GetAddressBookRequest extends js.Object {
    var AddressBookArn: Arn
  }

  @js.native
  @Factory
  trait GetAddressBookResponse extends js.Object {
    var AddressBook: js.UndefOr[AddressBook]
  }

  @js.native
  @Factory
  trait GetConferencePreferenceRequest extends js.Object {}

  @js.native
  @Factory
  trait GetConferencePreferenceResponse extends js.Object {
    var Preference: js.UndefOr[ConferencePreference]
  }

  @js.native
  @Factory
  trait GetConferenceProviderRequest extends js.Object {
    var ConferenceProviderArn: Arn
  }

  @js.native
  @Factory
  trait GetConferenceProviderResponse extends js.Object {
    var ConferenceProvider: js.UndefOr[ConferenceProvider]
  }

  @js.native
  @Factory
  trait GetContactRequest extends js.Object {
    var ContactArn: Arn
  }

  @js.native
  @Factory
  trait GetContactResponse extends js.Object {
    var Contact: js.UndefOr[Contact]
  }

  @js.native
  @Factory
  trait GetDeviceRequest extends js.Object {
    var DeviceArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait GetDeviceResponse extends js.Object {
    var Device: js.UndefOr[Device]
  }

  @js.native
  @Factory
  trait GetGatewayGroupRequest extends js.Object {
    var GatewayGroupArn: Arn
  }

  @js.native
  @Factory
  trait GetGatewayGroupResponse extends js.Object {
    var GatewayGroup: js.UndefOr[GatewayGroup]
  }

  @js.native
  @Factory
  trait GetGatewayRequest extends js.Object {
    var GatewayArn: Arn
  }

  @js.native
  @Factory
  trait GetGatewayResponse extends js.Object {
    var Gateway: js.UndefOr[Gateway]
  }

  @js.native
  @Factory
  trait GetInvitationConfigurationRequest extends js.Object {}

  @js.native
  @Factory
  trait GetInvitationConfigurationResponse extends js.Object {
    var ContactEmail: js.UndefOr[Email]
    var OrganizationName: js.UndefOr[OrganizationName]
    var PrivateSkillIds: js.UndefOr[ShortSkillIdList]
  }

  @js.native
  @Factory
  trait GetNetworkProfileRequest extends js.Object {
    var NetworkProfileArn: Arn
  }

  @js.native
  @Factory
  trait GetNetworkProfileResponse extends js.Object {
    var NetworkProfile: js.UndefOr[NetworkProfile]
  }

  @js.native
  @Factory
  trait GetProfileRequest extends js.Object {
    var ProfileArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait GetProfileResponse extends js.Object {
    var Profile: js.UndefOr[Profile]
  }

  @js.native
  @Factory
  trait GetRoomRequest extends js.Object {
    var RoomArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait GetRoomResponse extends js.Object {
    var Room: js.UndefOr[Room]
  }

  @js.native
  @Factory
  trait GetRoomSkillParameterRequest extends js.Object {
    var ParameterKey: RoomSkillParameterKey
    var SkillId: SkillId
    var RoomArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait GetRoomSkillParameterResponse extends js.Object {
    var RoomSkillParameter: js.UndefOr[RoomSkillParameter]
  }

  @js.native
  @Factory
  trait GetSkillGroupRequest extends js.Object {
    var SkillGroupArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait GetSkillGroupResponse extends js.Object {
    var SkillGroup: js.UndefOr[SkillGroup]
  }

  /**
    * The IP endpoint and protocol for calling.
    */
  @js.native
  @Factory
  trait IPDialIn extends js.Object {
    var CommsProtocol: CommsProtocol
    var Endpoint: Endpoint
  }

  /**
    * Settings for the instant booking feature that are applied to a room profile. When users start their meeting with Alexa, Alexa automatically books the room for the configured duration if the room is available.
    */
  @js.native
  @Factory
  trait InstantBooking extends js.Object {
    var DurationInMinutes: js.UndefOr[Minutes]
    var Enabled: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ListBusinessReportSchedulesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListBusinessReportSchedulesResponse extends js.Object {
    var BusinessReportSchedules: js.UndefOr[BusinessReportScheduleList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListConferenceProvidersRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListConferenceProvidersResponse extends js.Object {
    var ConferenceProviders: js.UndefOr[ConferenceProvidersList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDeviceEventsRequest extends js.Object {
    var DeviceArn: Arn
    var EventType: js.UndefOr[DeviceEventType]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDeviceEventsResponse extends js.Object {
    var DeviceEvents: js.UndefOr[DeviceEventList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListGatewayGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListGatewayGroupsResponse extends js.Object {
    var GatewayGroups: js.UndefOr[GatewayGroupSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListGatewaysRequest extends js.Object {
    var GatewayGroupArn: js.UndefOr[Arn]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListGatewaysResponse extends js.Object {
    var Gateways: js.UndefOr[GatewaySummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListSkillsRequest extends js.Object {
    var EnablementType: js.UndefOr[EnablementTypeFilter]
    var MaxResults: js.UndefOr[SkillListMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SkillGroupArn: js.UndefOr[Arn]
    var SkillType: js.UndefOr[SkillTypeFilter]
  }

  @js.native
  @Factory
  trait ListSkillsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SkillSummaries: js.UndefOr[SkillSummaryList]
  }

  @js.native
  @Factory
  trait ListSkillsStoreCategoriesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListSkillsStoreCategoriesResponse extends js.Object {
    var CategoryList: js.UndefOr[CategoryList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListSkillsStoreSkillsByCategoryRequest extends js.Object {
    var CategoryId: CategoryId
    var MaxResults: js.UndefOr[SkillListMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListSkillsStoreSkillsByCategoryResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SkillsStoreSkills: js.UndefOr[SkillsStoreSkillList]
  }

  @js.native
  @Factory
  trait ListSmartHomeAppliancesRequest extends js.Object {
    var RoomArn: Arn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListSmartHomeAppliancesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SmartHomeAppliances: js.UndefOr[SmartHomeApplianceList]
  }

  @js.native
  @Factory
  trait ListTagsRequest extends js.Object {
    var Arn: Arn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  sealed trait Locale extends js.Any
  object Locale extends js.Object {
    val `en-US` = "en-US".asInstanceOf[Locale]

    val values = js.Object.freeze(js.Array(`en-US`))
  }

  /**
    * Meeting room settings of a room profile.
    */
  @js.native
  @Factory
  trait MeetingRoomConfiguration extends js.Object {
    var EndOfMeetingReminder: js.UndefOr[EndOfMeetingReminder]
    var InstantBooking: js.UndefOr[InstantBooking]
    var RequireCheckIn: js.UndefOr[RequireCheckIn]
    var RoomUtilizationMetricsEnabled: js.UndefOr[Boolean]
  }

  /**
    * The values that indicate whether a pin is always required (YES), never required (NO), or OPTIONAL.
    * * If YES, Alexa will always ask for a meeting pin.
    *  * If NO, Alexa will never ask for a meeting pin.
    *  * If OPTIONAL, Alexa will ask if you have a meeting pin and if the customer responds with yes, it will ask for the meeting pin.
    */
  @js.native
  @Factory
  trait MeetingSetting extends js.Object {
    var RequirePin: RequirePin
  }

  @js.native
  sealed trait NetworkEapMethod extends js.Any
  object NetworkEapMethod extends js.Object {
    val EAP_TLS = "EAP_TLS".asInstanceOf[NetworkEapMethod]

    val values = js.Object.freeze(js.Array(EAP_TLS))
  }

  /**
    * The network profile associated with a device.
    */
  @js.native
  @Factory
  trait NetworkProfile extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var CurrentPassword: js.UndefOr[CurrentWiFiPassword]
    var Description: js.UndefOr[NetworkProfileDescription]
    var EapMethod: js.UndefOr[NetworkEapMethod]
    var NetworkProfileArn: js.UndefOr[Arn]
    var NetworkProfileName: js.UndefOr[NetworkProfileName]
    var NextPassword: js.UndefOr[NextWiFiPassword]
    var SecurityType: js.UndefOr[NetworkSecurityType]
    var Ssid: js.UndefOr[NetworkSsid]
    var TrustAnchors: js.UndefOr[TrustAnchorList]
  }

  /**
    * The data associated with a network profile.
    */
  @js.native
  @Factory
  trait NetworkProfileData extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var Description: js.UndefOr[NetworkProfileDescription]
    var EapMethod: js.UndefOr[NetworkEapMethod]
    var NetworkProfileArn: js.UndefOr[Arn]
    var NetworkProfileName: js.UndefOr[NetworkProfileName]
    var SecurityType: js.UndefOr[NetworkSecurityType]
    var Ssid: js.UndefOr[NetworkSsid]
  }

  @js.native
  sealed trait NetworkSecurityType extends js.Any
  object NetworkSecurityType extends js.Object {
    val OPEN            = "OPEN".asInstanceOf[NetworkSecurityType]
    val WEP             = "WEP".asInstanceOf[NetworkSecurityType]
    val WPA_PSK         = "WPA_PSK".asInstanceOf[NetworkSecurityType]
    val WPA2_PSK        = "WPA2_PSK".asInstanceOf[NetworkSecurityType]
    val WPA2_ENTERPRISE = "WPA2_ENTERPRISE".asInstanceOf[NetworkSecurityType]

    val values = js.Object.freeze(js.Array(OPEN, WEP, WPA_PSK, WPA2_PSK, WPA2_ENTERPRISE))
  }

  /**
    * The information for public switched telephone network (PSTN) conferencing.
    */
  @js.native
  @Factory
  trait PSTNDialIn extends js.Object {
    var CountryCode: CountryCode
    var OneClickIdDelay: OneClickIdDelay
    var OneClickPinDelay: OneClickPinDelay
    var PhoneNumber: OutboundPhoneNumber
  }

  /**
    * The phone number for the contact containing the raw number and phone number type.
    */
  @js.native
  @Factory
  trait PhoneNumber extends js.Object {
    var Number: RawPhoneNumber
    var Type: PhoneNumberType
  }

  @js.native
  sealed trait PhoneNumberType extends js.Any
  object PhoneNumberType extends js.Object {
    val MOBILE = "MOBILE".asInstanceOf[PhoneNumberType]
    val WORK   = "WORK".asInstanceOf[PhoneNumberType]
    val HOME   = "HOME".asInstanceOf[PhoneNumberType]

    val values = js.Object.freeze(js.Array(MOBILE, WORK, HOME))
  }

  /**
    * A room profile with attributes.
    */
  @js.native
  @Factory
  trait Profile extends js.Object {
    var Address: js.UndefOr[Address]
    var AddressBookArn: js.UndefOr[Arn]
    var DistanceUnit: js.UndefOr[DistanceUnit]
    var IsDefault: js.UndefOr[Boolean]
    var Locale: js.UndefOr[DeviceLocale]
    var MaxVolumeLimit: js.UndefOr[MaxVolumeLimit]
    var MeetingRoomConfiguration: js.UndefOr[MeetingRoomConfiguration]
    var PSTNEnabled: js.UndefOr[Boolean]
    var ProfileArn: js.UndefOr[Arn]
    var ProfileName: js.UndefOr[ProfileName]
    var SetupModeDisabled: js.UndefOr[Boolean]
    var TemperatureUnit: js.UndefOr[TemperatureUnit]
    var Timezone: js.UndefOr[Timezone]
    var WakeWord: js.UndefOr[WakeWord]
  }

  /**
    * The data of a room profile.
    */
  @js.native
  @Factory
  trait ProfileData extends js.Object {
    var Address: js.UndefOr[Address]
    var DistanceUnit: js.UndefOr[DistanceUnit]
    var IsDefault: js.UndefOr[Boolean]
    var Locale: js.UndefOr[DeviceLocale]
    var ProfileArn: js.UndefOr[Arn]
    var ProfileName: js.UndefOr[ProfileName]
    var TemperatureUnit: js.UndefOr[TemperatureUnit]
    var Timezone: js.UndefOr[Timezone]
    var WakeWord: js.UndefOr[WakeWord]
  }

  @js.native
  @Factory
  trait PutConferencePreferenceRequest extends js.Object {
    var ConferencePreference: ConferencePreference
  }

  @js.native
  @Factory
  trait PutConferencePreferenceResponse extends js.Object {}

  @js.native
  @Factory
  trait PutInvitationConfigurationRequest extends js.Object {
    var OrganizationName: OrganizationName
    var ContactEmail: js.UndefOr[Email]
    var PrivateSkillIds: js.UndefOr[ShortSkillIdList]
  }

  @js.native
  @Factory
  trait PutInvitationConfigurationResponse extends js.Object {}

  @js.native
  @Factory
  trait PutRoomSkillParameterRequest extends js.Object {
    var RoomSkillParameter: RoomSkillParameter
    var SkillId: SkillId
    var RoomArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait PutRoomSkillParameterResponse extends js.Object {}

  @js.native
  @Factory
  trait PutSkillAuthorizationRequest extends js.Object {
    var AuthorizationResult: AuthorizationResult
    var SkillId: SkillId
    var RoomArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait PutSkillAuthorizationResponse extends js.Object {}

  @js.native
  @Factory
  trait RegisterAVSDeviceRequest extends js.Object {
    var AmazonId: AmazonId
    var ClientId: ClientId
    var DeviceSerialNumber: DeviceSerialNumberForAVS
    var ProductId: ProductId
    var UserCode: UserCode
  }

  @js.native
  @Factory
  trait RegisterAVSDeviceResponse extends js.Object {
    var DeviceArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait RejectSkillRequest extends js.Object {
    var SkillId: SkillId
  }

  @js.native
  @Factory
  trait RejectSkillResponse extends js.Object {}

  /**
    * Settings for the require check in feature that are applied to a room profile. Require check in allows a meeting room’s Alexa or AVS device to prompt the user to check in; otherwise, the room will be released.
    */
  @js.native
  @Factory
  trait RequireCheckIn extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var ReleaseAfterMinutes: js.UndefOr[Minutes]
  }

  @js.native
  sealed trait RequirePin extends js.Any
  object RequirePin extends js.Object {
    val YES      = "YES".asInstanceOf[RequirePin]
    val NO       = "NO".asInstanceOf[RequirePin]
    val OPTIONAL = "OPTIONAL".asInstanceOf[RequirePin]

    val values = js.Object.freeze(js.Array(YES, NO, OPTIONAL))
  }

  @js.native
  @Factory
  trait ResolveRoomRequest extends js.Object {
    var SkillId: SkillId
    var UserId: UserId
  }

  @js.native
  @Factory
  trait ResolveRoomResponse extends js.Object {
    var RoomArn: js.UndefOr[Arn]
    var RoomName: js.UndefOr[RoomName]
    var RoomSkillParameters: js.UndefOr[RoomSkillParameters]
  }

  @js.native
  @Factory
  trait RevokeInvitationRequest extends js.Object {
    var EnrollmentId: js.UndefOr[EnrollmentId]
    var UserArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait RevokeInvitationResponse extends js.Object {}

  /**
    * A room with attributes.
    */
  @js.native
  @Factory
  trait Room extends js.Object {
    var Description: js.UndefOr[RoomDescription]
    var ProfileArn: js.UndefOr[Arn]
    var ProviderCalendarId: js.UndefOr[ProviderCalendarId]
    var RoomArn: js.UndefOr[Arn]
    var RoomName: js.UndefOr[RoomName]
  }

  /**
    * The data of a room.
    */
  @js.native
  @Factory
  trait RoomData extends js.Object {
    var Description: js.UndefOr[RoomDescription]
    var ProfileArn: js.UndefOr[Arn]
    var ProfileName: js.UndefOr[ProfileName]
    var ProviderCalendarId: js.UndefOr[ProviderCalendarId]
    var RoomArn: js.UndefOr[Arn]
    var RoomName: js.UndefOr[RoomName]
  }

  /**
    * A skill parameter associated with a room.
    */
  @js.native
  @Factory
  trait RoomSkillParameter extends js.Object {
    var ParameterKey: RoomSkillParameterKey
    var ParameterValue: RoomSkillParameterValue
  }

  @js.native
  @Factory
  trait SearchAddressBooksRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortCriteria: js.UndefOr[SortList]
  }

  @js.native
  @Factory
  trait SearchAddressBooksResponse extends js.Object {
    var AddressBooks: js.UndefOr[AddressBookDataList]
    var NextToken: js.UndefOr[NextToken]
    var TotalCount: js.UndefOr[TotalCount]
  }

  @js.native
  @Factory
  trait SearchContactsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortCriteria: js.UndefOr[SortList]
  }

  @js.native
  @Factory
  trait SearchContactsResponse extends js.Object {
    var Contacts: js.UndefOr[ContactDataList]
    var NextToken: js.UndefOr[NextToken]
    var TotalCount: js.UndefOr[TotalCount]
  }

  @js.native
  @Factory
  trait SearchDevicesRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortCriteria: js.UndefOr[SortList]
  }

  @js.native
  @Factory
  trait SearchDevicesResponse extends js.Object {
    var Devices: js.UndefOr[DeviceDataList]
    var NextToken: js.UndefOr[NextToken]
    var TotalCount: js.UndefOr[TotalCount]
  }

  @js.native
  @Factory
  trait SearchNetworkProfilesRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortCriteria: js.UndefOr[SortList]
  }

  @js.native
  @Factory
  trait SearchNetworkProfilesResponse extends js.Object {
    var NetworkProfiles: js.UndefOr[NetworkProfileDataList]
    var NextToken: js.UndefOr[NextToken]
    var TotalCount: js.UndefOr[TotalCount]
  }

  @js.native
  @Factory
  trait SearchProfilesRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortCriteria: js.UndefOr[SortList]
  }

  @js.native
  @Factory
  trait SearchProfilesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Profiles: js.UndefOr[ProfileDataList]
    var TotalCount: js.UndefOr[TotalCount]
  }

  @js.native
  @Factory
  trait SearchRoomsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortCriteria: js.UndefOr[SortList]
  }

  @js.native
  @Factory
  trait SearchRoomsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Rooms: js.UndefOr[RoomDataList]
    var TotalCount: js.UndefOr[TotalCount]
  }

  @js.native
  @Factory
  trait SearchSkillGroupsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortCriteria: js.UndefOr[SortList]
  }

  @js.native
  @Factory
  trait SearchSkillGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SkillGroups: js.UndefOr[SkillGroupDataList]
    var TotalCount: js.UndefOr[TotalCount]
  }

  @js.native
  @Factory
  trait SearchUsersRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortCriteria: js.UndefOr[SortList]
  }

  @js.native
  @Factory
  trait SearchUsersResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TotalCount: js.UndefOr[TotalCount]
    var Users: js.UndefOr[UserDataList]
  }

  @js.native
  @Factory
  trait SendAnnouncementRequest extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var Content: Content
    var RoomFilters: FilterList
    var TimeToLiveInSeconds: js.UndefOr[TimeToLiveInSeconds]
  }

  @js.native
  @Factory
  trait SendAnnouncementResponse extends js.Object {
    var AnnouncementArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait SendInvitationRequest extends js.Object {
    var UserArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait SendInvitationResponse extends js.Object {}

  /**
    * The SIP address for the contact containing the URI and SIP address type.
    */
  @js.native
  @Factory
  trait SipAddress extends js.Object {
    var Type: SipType
    var Uri: SipUri
  }

  @js.native
  sealed trait SipType extends js.Any
  object SipType extends js.Object {
    val WORK = "WORK".asInstanceOf[SipType]

    val values = js.Object.freeze(js.Array(WORK))
  }

  /**
    * Granular information about the skill.
    */
  @js.native
  @Factory
  trait SkillDetails extends js.Object {
    var BulletPoints: js.UndefOr[BulletPoints]
    var DeveloperInfo: js.UndefOr[DeveloperInfo]
    var EndUserLicenseAgreement: js.UndefOr[EndUserLicenseAgreement]
    var GenericKeywords: js.UndefOr[GenericKeywords]
    var InvocationPhrase: js.UndefOr[InvocationPhrase]
    var NewInThisVersionBulletPoints: js.UndefOr[NewInThisVersionBulletPoints]
    var ProductDescription: js.UndefOr[ProductDescription]
    var ReleaseDate: js.UndefOr[ReleaseDate]
    var Reviews: js.UndefOr[Reviews]
    var SkillTypes: js.UndefOr[SkillTypes]
  }

  /**
    * A skill group with attributes.
    */
  @js.native
  @Factory
  trait SkillGroup extends js.Object {
    var Description: js.UndefOr[SkillGroupDescription]
    var SkillGroupArn: js.UndefOr[Arn]
    var SkillGroupName: js.UndefOr[SkillGroupName]
  }

  /**
    * The attributes of a skill group.
    */
  @js.native
  @Factory
  trait SkillGroupData extends js.Object {
    var Description: js.UndefOr[SkillGroupDescription]
    var SkillGroupArn: js.UndefOr[Arn]
    var SkillGroupName: js.UndefOr[SkillGroupName]
  }

  /**
    * The summary of skills.
    */
  @js.native
  @Factory
  trait SkillSummary extends js.Object {
    var EnablementType: js.UndefOr[EnablementType]
    var SkillId: js.UndefOr[SkillId]
    var SkillName: js.UndefOr[SkillName]
    var SkillType: js.UndefOr[SkillType]
    var SupportsLinking: js.UndefOr[Boolean]
  }

  @js.native
  sealed trait SkillType extends js.Any
  object SkillType extends js.Object {
    val PUBLIC  = "PUBLIC".asInstanceOf[SkillType]
    val PRIVATE = "PRIVATE".asInstanceOf[SkillType]

    val values = js.Object.freeze(js.Array(PUBLIC, PRIVATE))
  }

  @js.native
  sealed trait SkillTypeFilter extends js.Any
  object SkillTypeFilter extends js.Object {
    val PUBLIC  = "PUBLIC".asInstanceOf[SkillTypeFilter]
    val PRIVATE = "PRIVATE".asInstanceOf[SkillTypeFilter]
    val ALL     = "ALL".asInstanceOf[SkillTypeFilter]

    val values = js.Object.freeze(js.Array(PUBLIC, PRIVATE, ALL))
  }

  /**
    * The detailed information about an Alexa skill.
    */
  @js.native
  @Factory
  trait SkillsStoreSkill extends js.Object {
    var IconUrl: js.UndefOr[IconUrl]
    var SampleUtterances: js.UndefOr[SampleUtterances]
    var ShortDescription: js.UndefOr[ShortDescription]
    var SkillDetails: js.UndefOr[SkillDetails]
    var SkillId: js.UndefOr[SkillId]
    var SkillName: js.UndefOr[SkillName]
    var SupportsLinking: js.UndefOr[Boolean]
  }

  /**
    * A smart home appliance that can connect to a central system. Any domestic device can be a smart appliance.
    */
  @js.native
  @Factory
  trait SmartHomeAppliance extends js.Object {
    var Description: js.UndefOr[ApplianceDescription]
    var FriendlyName: js.UndefOr[ApplianceFriendlyName]
    var ManufacturerName: js.UndefOr[ApplianceManufacturerName]
  }

  /**
    * An object representing a sort criteria.
    */
  @js.native
  @Factory
  trait Sort extends js.Object {
    var Key: SortKey
    var Value: SortValue
  }

  @js.native
  sealed trait SortValue extends js.Any
  object SortValue extends js.Object {
    val ASC  = "ASC".asInstanceOf[SortValue]
    val DESC = "DESC".asInstanceOf[SortValue]

    val values = js.Object.freeze(js.Array(ASC, DESC))
  }

  /**
    * The SSML message. For more information, see [[https://developer.amazon.com/docs/custom-skills/speech-synthesis-markup-language-ssml-reference.html|SSML Reference]].
    */
  @js.native
  @Factory
  trait Ssml extends js.Object {
    var Locale: Locale
    var Value: SsmlValue
  }

  @js.native
  @Factory
  trait StartDeviceSyncRequest extends js.Object {
    var Features: Features
    var DeviceArn: js.UndefOr[Arn]
    var RoomArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait StartDeviceSyncResponse extends js.Object {}

  @js.native
  @Factory
  trait StartSmartHomeApplianceDiscoveryRequest extends js.Object {
    var RoomArn: Arn
  }

  @js.native
  @Factory
  trait StartSmartHomeApplianceDiscoveryResponse extends js.Object {}

  /**
    * A key-value pair that can be associated with a resource.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var Arn: Arn
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  sealed trait TemperatureUnit extends js.Any
  object TemperatureUnit extends js.Object {
    val FAHRENHEIT = "FAHRENHEIT".asInstanceOf[TemperatureUnit]
    val CELSIUS    = "CELSIUS".asInstanceOf[TemperatureUnit]

    val values = js.Object.freeze(js.Array(FAHRENHEIT, CELSIUS))
  }

  /**
    * The text message.
    */
  @js.native
  @Factory
  trait Text extends js.Object {
    var Locale: Locale
    var Value: TextValue
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var Arn: Arn
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateAddressBookRequest extends js.Object {
    var AddressBookArn: Arn
    var Description: js.UndefOr[AddressBookDescription]
    var Name: js.UndefOr[AddressBookName]
  }

  @js.native
  @Factory
  trait UpdateAddressBookResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateBusinessReportScheduleRequest extends js.Object {
    var ScheduleArn: Arn
    var Format: js.UndefOr[BusinessReportFormat]
    var Recurrence: js.UndefOr[BusinessReportRecurrence]
    var S3BucketName: js.UndefOr[CustomerS3BucketName]
    var S3KeyPrefix: js.UndefOr[S3KeyPrefix]
    var ScheduleName: js.UndefOr[BusinessReportScheduleName]
  }

  @js.native
  @Factory
  trait UpdateBusinessReportScheduleResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateConferenceProviderRequest extends js.Object {
    var ConferenceProviderArn: Arn
    var ConferenceProviderType: ConferenceProviderType
    var MeetingSetting: MeetingSetting
    var IPDialIn: js.UndefOr[IPDialIn]
    var PSTNDialIn: js.UndefOr[PSTNDialIn]
  }

  @js.native
  @Factory
  trait UpdateConferenceProviderResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateContactRequest extends js.Object {
    var ContactArn: Arn
    var DisplayName: js.UndefOr[ContactName]
    var FirstName: js.UndefOr[ContactName]
    var LastName: js.UndefOr[ContactName]
    var PhoneNumber: js.UndefOr[RawPhoneNumber]
    var PhoneNumbers: js.UndefOr[PhoneNumberList]
    var SipAddresses: js.UndefOr[SipAddressList]
  }

  @js.native
  @Factory
  trait UpdateContactResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateDeviceRequest extends js.Object {
    var DeviceArn: js.UndefOr[Arn]
    var DeviceName: js.UndefOr[DeviceName]
  }

  @js.native
  @Factory
  trait UpdateDeviceResponse extends js.Object {}

  /**
    * Settings for the end of meeting reminder feature that are applied to a room profile. The end of meeting reminder enables Alexa to remind users when a meeting is ending.
    */
  @js.native
  @Factory
  trait UpdateEndOfMeetingReminder extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var ReminderAtMinutes: js.UndefOr[EndOfMeetingReminderMinutesList]
    var ReminderType: js.UndefOr[EndOfMeetingReminderType]
  }

  @js.native
  @Factory
  trait UpdateGatewayGroupRequest extends js.Object {
    var GatewayGroupArn: Arn
    var Description: js.UndefOr[GatewayGroupDescription]
    var Name: js.UndefOr[GatewayGroupName]
  }

  @js.native
  @Factory
  trait UpdateGatewayGroupResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateGatewayRequest extends js.Object {
    var GatewayArn: Arn
    var Description: js.UndefOr[GatewayDescription]
    var Name: js.UndefOr[GatewayName]
    var SoftwareVersion: js.UndefOr[GatewayVersion]
  }

  @js.native
  @Factory
  trait UpdateGatewayResponse extends js.Object {}

  /**
    * Updates settings for the instant booking feature that are applied to a room profile. If instant booking is enabled, Alexa automatically reserves a room if it is free when a user joins a meeting with Alexa.
    */
  @js.native
  @Factory
  trait UpdateInstantBooking extends js.Object {
    var DurationInMinutes: js.UndefOr[Minutes]
    var Enabled: js.UndefOr[Boolean]
  }

  /**
    * Updates meeting room settings of a room profile.
    */
  @js.native
  @Factory
  trait UpdateMeetingRoomConfiguration extends js.Object {
    var EndOfMeetingReminder: js.UndefOr[UpdateEndOfMeetingReminder]
    var InstantBooking: js.UndefOr[UpdateInstantBooking]
    var RequireCheckIn: js.UndefOr[UpdateRequireCheckIn]
    var RoomUtilizationMetricsEnabled: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait UpdateNetworkProfileRequest extends js.Object {
    var NetworkProfileArn: Arn
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var CurrentPassword: js.UndefOr[CurrentWiFiPassword]
    var Description: js.UndefOr[NetworkProfileDescription]
    var NetworkProfileName: js.UndefOr[NetworkProfileName]
    var NextPassword: js.UndefOr[NextWiFiPassword]
    var TrustAnchors: js.UndefOr[TrustAnchorList]
  }

  @js.native
  @Factory
  trait UpdateNetworkProfileResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateProfileRequest extends js.Object {
    var Address: js.UndefOr[Address]
    var DistanceUnit: js.UndefOr[DistanceUnit]
    var IsDefault: js.UndefOr[Boolean]
    var Locale: js.UndefOr[DeviceLocale]
    var MaxVolumeLimit: js.UndefOr[MaxVolumeLimit]
    var MeetingRoomConfiguration: js.UndefOr[UpdateMeetingRoomConfiguration]
    var PSTNEnabled: js.UndefOr[Boolean]
    var ProfileArn: js.UndefOr[Arn]
    var ProfileName: js.UndefOr[ProfileName]
    var SetupModeDisabled: js.UndefOr[Boolean]
    var TemperatureUnit: js.UndefOr[TemperatureUnit]
    var Timezone: js.UndefOr[Timezone]
    var WakeWord: js.UndefOr[WakeWord]
  }

  @js.native
  @Factory
  trait UpdateProfileResponse extends js.Object {}

  /**
    * Updates settings for the require check in feature that are applied to a room profile. Require check in allows a meeting room’s Alexa or AVS device to prompt the user to check in; otherwise, the room will be released.
    */
  @js.native
  @Factory
  trait UpdateRequireCheckIn extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var ReleaseAfterMinutes: js.UndefOr[Minutes]
  }

  @js.native
  @Factory
  trait UpdateRoomRequest extends js.Object {
    var Description: js.UndefOr[RoomDescription]
    var ProfileArn: js.UndefOr[Arn]
    var ProviderCalendarId: js.UndefOr[ProviderCalendarId]
    var RoomArn: js.UndefOr[Arn]
    var RoomName: js.UndefOr[RoomName]
  }

  @js.native
  @Factory
  trait UpdateRoomResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateSkillGroupRequest extends js.Object {
    var Description: js.UndefOr[SkillGroupDescription]
    var SkillGroupArn: js.UndefOr[Arn]
    var SkillGroupName: js.UndefOr[SkillGroupName]
  }

  @js.native
  @Factory
  trait UpdateSkillGroupResponse extends js.Object {}

  /**
    * Information related to a user.
    */
  @js.native
  @Factory
  trait UserData extends js.Object {
    var Email: js.UndefOr[Email]
    var EnrollmentId: js.UndefOr[EnrollmentId]
    var EnrollmentStatus: js.UndefOr[EnrollmentStatus]
    var FirstName: js.UndefOr[user_FirstName]
    var LastName: js.UndefOr[user_LastName]
    var UserArn: js.UndefOr[Arn]
  }

  @js.native
  sealed trait WakeWord extends js.Any
  object WakeWord extends js.Object {
    val ALEXA    = "ALEXA".asInstanceOf[WakeWord]
    val AMAZON   = "AMAZON".asInstanceOf[WakeWord]
    val ECHO     = "ECHO".asInstanceOf[WakeWord]
    val COMPUTER = "COMPUTER".asInstanceOf[WakeWord]

    val values = js.Object.freeze(js.Array(ALEXA, AMAZON, ECHO, COMPUTER))
  }
}
