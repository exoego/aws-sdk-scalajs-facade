package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

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
      service.approveSkill(params).promise.toFuture
    @inline def associateContactWithAddressBookFuture(
        params: AssociateContactWithAddressBookRequest
    ): Future[AssociateContactWithAddressBookResponse] =
      service.associateContactWithAddressBook(params).promise.toFuture
    @inline def associateDeviceWithNetworkProfileFuture(
        params: AssociateDeviceWithNetworkProfileRequest
    ): Future[AssociateDeviceWithNetworkProfileResponse] =
      service.associateDeviceWithNetworkProfile(params).promise.toFuture
    @inline def associateDeviceWithRoomFuture(
        params: AssociateDeviceWithRoomRequest
    ): Future[AssociateDeviceWithRoomResponse] = service.associateDeviceWithRoom(params).promise.toFuture
    @inline def associateSkillGroupWithRoomFuture(
        params: AssociateSkillGroupWithRoomRequest
    ): Future[AssociateSkillGroupWithRoomResponse] = service.associateSkillGroupWithRoom(params).promise.toFuture
    @inline def associateSkillWithSkillGroupFuture(
        params: AssociateSkillWithSkillGroupRequest
    ): Future[AssociateSkillWithSkillGroupResponse] = service.associateSkillWithSkillGroup(params).promise.toFuture
    @inline def associateSkillWithUsersFuture(
        params: AssociateSkillWithUsersRequest
    ): Future[AssociateSkillWithUsersResponse] = service.associateSkillWithUsers(params).promise.toFuture
    @inline def createAddressBookFuture(params: CreateAddressBookRequest): Future[CreateAddressBookResponse] =
      service.createAddressBook(params).promise.toFuture
    @inline def createBusinessReportScheduleFuture(
        params: CreateBusinessReportScheduleRequest
    ): Future[CreateBusinessReportScheduleResponse] = service.createBusinessReportSchedule(params).promise.toFuture
    @inline def createConferenceProviderFuture(
        params: CreateConferenceProviderRequest
    ): Future[CreateConferenceProviderResponse] = service.createConferenceProvider(params).promise.toFuture
    @inline def createContactFuture(params: CreateContactRequest): Future[CreateContactResponse] =
      service.createContact(params).promise.toFuture
    @inline def createGatewayGroupFuture(params: CreateGatewayGroupRequest): Future[CreateGatewayGroupResponse] =
      service.createGatewayGroup(params).promise.toFuture
    @inline def createNetworkProfileFuture(params: CreateNetworkProfileRequest): Future[CreateNetworkProfileResponse] =
      service.createNetworkProfile(params).promise.toFuture
    @inline def createProfileFuture(params: CreateProfileRequest): Future[CreateProfileResponse] =
      service.createProfile(params).promise.toFuture
    @inline def createRoomFuture(params: CreateRoomRequest): Future[CreateRoomResponse] =
      service.createRoom(params).promise.toFuture
    @inline def createSkillGroupFuture(params: CreateSkillGroupRequest): Future[CreateSkillGroupResponse] =
      service.createSkillGroup(params).promise.toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] =
      service.createUser(params).promise.toFuture
    @inline def deleteAddressBookFuture(params: DeleteAddressBookRequest): Future[DeleteAddressBookResponse] =
      service.deleteAddressBook(params).promise.toFuture
    @inline def deleteBusinessReportScheduleFuture(
        params: DeleteBusinessReportScheduleRequest
    ): Future[DeleteBusinessReportScheduleResponse] = service.deleteBusinessReportSchedule(params).promise.toFuture
    @inline def deleteConferenceProviderFuture(
        params: DeleteConferenceProviderRequest
    ): Future[DeleteConferenceProviderResponse] = service.deleteConferenceProvider(params).promise.toFuture
    @inline def deleteContactFuture(params: DeleteContactRequest): Future[DeleteContactResponse] =
      service.deleteContact(params).promise.toFuture
    @inline def deleteDeviceFuture(params: DeleteDeviceRequest): Future[DeleteDeviceResponse] =
      service.deleteDevice(params).promise.toFuture
    @inline def deleteDeviceUsageDataFuture(
        params: DeleteDeviceUsageDataRequest
    ): Future[DeleteDeviceUsageDataResponse] = service.deleteDeviceUsageData(params).promise.toFuture
    @inline def deleteGatewayGroupFuture(params: DeleteGatewayGroupRequest): Future[DeleteGatewayGroupResponse] =
      service.deleteGatewayGroup(params).promise.toFuture
    @inline def deleteNetworkProfileFuture(params: DeleteNetworkProfileRequest): Future[DeleteNetworkProfileResponse] =
      service.deleteNetworkProfile(params).promise.toFuture
    @inline def deleteProfileFuture(params: DeleteProfileRequest): Future[DeleteProfileResponse] =
      service.deleteProfile(params).promise.toFuture
    @inline def deleteRoomFuture(params: DeleteRoomRequest): Future[DeleteRoomResponse] =
      service.deleteRoom(params).promise.toFuture
    @inline def deleteRoomSkillParameterFuture(
        params: DeleteRoomSkillParameterRequest
    ): Future[DeleteRoomSkillParameterResponse] = service.deleteRoomSkillParameter(params).promise.toFuture
    @inline def deleteSkillAuthorizationFuture(
        params: DeleteSkillAuthorizationRequest
    ): Future[DeleteSkillAuthorizationResponse] = service.deleteSkillAuthorization(params).promise.toFuture
    @inline def deleteSkillGroupFuture(params: DeleteSkillGroupRequest): Future[DeleteSkillGroupResponse] =
      service.deleteSkillGroup(params).promise.toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[DeleteUserResponse] =
      service.deleteUser(params).promise.toFuture
    @inline def disassociateContactFromAddressBookFuture(
        params: DisassociateContactFromAddressBookRequest
    ): Future[DisassociateContactFromAddressBookResponse] =
      service.disassociateContactFromAddressBook(params).promise.toFuture
    @inline def disassociateDeviceFromRoomFuture(
        params: DisassociateDeviceFromRoomRequest
    ): Future[DisassociateDeviceFromRoomResponse] = service.disassociateDeviceFromRoom(params).promise.toFuture
    @inline def disassociateSkillFromSkillGroupFuture(
        params: DisassociateSkillFromSkillGroupRequest
    ): Future[DisassociateSkillFromSkillGroupResponse] =
      service.disassociateSkillFromSkillGroup(params).promise.toFuture
    @inline def disassociateSkillFromUsersFuture(
        params: DisassociateSkillFromUsersRequest
    ): Future[DisassociateSkillFromUsersResponse] = service.disassociateSkillFromUsers(params).promise.toFuture
    @inline def disassociateSkillGroupFromRoomFuture(
        params: DisassociateSkillGroupFromRoomRequest
    ): Future[DisassociateSkillGroupFromRoomResponse] = service.disassociateSkillGroupFromRoom(params).promise.toFuture
    @inline def forgetSmartHomeAppliancesFuture(
        params: ForgetSmartHomeAppliancesRequest
    ): Future[ForgetSmartHomeAppliancesResponse] = service.forgetSmartHomeAppliances(params).promise.toFuture
    @inline def getAddressBookFuture(params: GetAddressBookRequest): Future[GetAddressBookResponse] =
      service.getAddressBook(params).promise.toFuture
    @inline def getConferencePreferenceFuture(
        params: GetConferencePreferenceRequest
    ): Future[GetConferencePreferenceResponse] = service.getConferencePreference(params).promise.toFuture
    @inline def getConferenceProviderFuture(
        params: GetConferenceProviderRequest
    ): Future[GetConferenceProviderResponse] = service.getConferenceProvider(params).promise.toFuture
    @inline def getContactFuture(params: GetContactRequest): Future[GetContactResponse] =
      service.getContact(params).promise.toFuture
    @inline def getDeviceFuture(params: GetDeviceRequest): Future[GetDeviceResponse] =
      service.getDevice(params).promise.toFuture
    @inline def getGatewayFuture(params: GetGatewayRequest): Future[GetGatewayResponse] =
      service.getGateway(params).promise.toFuture
    @inline def getGatewayGroupFuture(params: GetGatewayGroupRequest): Future[GetGatewayGroupResponse] =
      service.getGatewayGroup(params).promise.toFuture
    @inline def getInvitationConfigurationFuture(
        params: GetInvitationConfigurationRequest
    ): Future[GetInvitationConfigurationResponse] = service.getInvitationConfiguration(params).promise.toFuture
    @inline def getNetworkProfileFuture(params: GetNetworkProfileRequest): Future[GetNetworkProfileResponse] =
      service.getNetworkProfile(params).promise.toFuture
    @inline def getProfileFuture(params: GetProfileRequest): Future[GetProfileResponse] =
      service.getProfile(params).promise.toFuture
    @inline def getRoomFuture(params: GetRoomRequest): Future[GetRoomResponse] =
      service.getRoom(params).promise.toFuture
    @inline def getRoomSkillParameterFuture(
        params: GetRoomSkillParameterRequest
    ): Future[GetRoomSkillParameterResponse] = service.getRoomSkillParameter(params).promise.toFuture
    @inline def getSkillGroupFuture(params: GetSkillGroupRequest): Future[GetSkillGroupResponse] =
      service.getSkillGroup(params).promise.toFuture
    @inline def listBusinessReportSchedulesFuture(
        params: ListBusinessReportSchedulesRequest
    ): Future[ListBusinessReportSchedulesResponse] = service.listBusinessReportSchedules(params).promise.toFuture
    @inline def listConferenceProvidersFuture(
        params: ListConferenceProvidersRequest
    ): Future[ListConferenceProvidersResponse] = service.listConferenceProviders(params).promise.toFuture
    @inline def listDeviceEventsFuture(params: ListDeviceEventsRequest): Future[ListDeviceEventsResponse] =
      service.listDeviceEvents(params).promise.toFuture
    @inline def listGatewayGroupsFuture(params: ListGatewayGroupsRequest): Future[ListGatewayGroupsResponse] =
      service.listGatewayGroups(params).promise.toFuture
    @inline def listGatewaysFuture(params: ListGatewaysRequest): Future[ListGatewaysResponse] =
      service.listGateways(params).promise.toFuture
    @inline def listSkillsFuture(params: ListSkillsRequest): Future[ListSkillsResponse] =
      service.listSkills(params).promise.toFuture
    @inline def listSkillsStoreCategoriesFuture(
        params: ListSkillsStoreCategoriesRequest
    ): Future[ListSkillsStoreCategoriesResponse] = service.listSkillsStoreCategories(params).promise.toFuture
    @inline def listSkillsStoreSkillsByCategoryFuture(
        params: ListSkillsStoreSkillsByCategoryRequest
    ): Future[ListSkillsStoreSkillsByCategoryResponse] =
      service.listSkillsStoreSkillsByCategory(params).promise.toFuture
    @inline def listSmartHomeAppliancesFuture(
        params: ListSmartHomeAppliancesRequest
    ): Future[ListSmartHomeAppliancesResponse] = service.listSmartHomeAppliances(params).promise.toFuture
    @inline def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] =
      service.listTags(params).promise.toFuture
    @inline def putConferencePreferenceFuture(
        params: PutConferencePreferenceRequest
    ): Future[PutConferencePreferenceResponse] = service.putConferencePreference(params).promise.toFuture
    @inline def putInvitationConfigurationFuture(
        params: PutInvitationConfigurationRequest
    ): Future[PutInvitationConfigurationResponse] = service.putInvitationConfiguration(params).promise.toFuture
    @inline def putRoomSkillParameterFuture(
        params: PutRoomSkillParameterRequest
    ): Future[PutRoomSkillParameterResponse] = service.putRoomSkillParameter(params).promise.toFuture
    @inline def putSkillAuthorizationFuture(
        params: PutSkillAuthorizationRequest
    ): Future[PutSkillAuthorizationResponse] = service.putSkillAuthorization(params).promise.toFuture
    @inline def registerAVSDeviceFuture(params: RegisterAVSDeviceRequest): Future[RegisterAVSDeviceResponse] =
      service.registerAVSDevice(params).promise.toFuture
    @inline def rejectSkillFuture(params: RejectSkillRequest): Future[RejectSkillResponse] =
      service.rejectSkill(params).promise.toFuture
    @inline def resolveRoomFuture(params: ResolveRoomRequest): Future[ResolveRoomResponse] =
      service.resolveRoom(params).promise.toFuture
    @inline def revokeInvitationFuture(params: RevokeInvitationRequest): Future[RevokeInvitationResponse] =
      service.revokeInvitation(params).promise.toFuture
    @inline def searchAddressBooksFuture(params: SearchAddressBooksRequest): Future[SearchAddressBooksResponse] =
      service.searchAddressBooks(params).promise.toFuture
    @inline def searchContactsFuture(params: SearchContactsRequest): Future[SearchContactsResponse] =
      service.searchContacts(params).promise.toFuture
    @inline def searchDevicesFuture(params: SearchDevicesRequest): Future[SearchDevicesResponse] =
      service.searchDevices(params).promise.toFuture
    @inline def searchNetworkProfilesFuture(
        params: SearchNetworkProfilesRequest
    ): Future[SearchNetworkProfilesResponse] = service.searchNetworkProfiles(params).promise.toFuture
    @inline def searchProfilesFuture(params: SearchProfilesRequest): Future[SearchProfilesResponse] =
      service.searchProfiles(params).promise.toFuture
    @inline def searchRoomsFuture(params: SearchRoomsRequest): Future[SearchRoomsResponse] =
      service.searchRooms(params).promise.toFuture
    @inline def searchSkillGroupsFuture(params: SearchSkillGroupsRequest): Future[SearchSkillGroupsResponse] =
      service.searchSkillGroups(params).promise.toFuture
    @inline def searchUsersFuture(params: SearchUsersRequest): Future[SearchUsersResponse] =
      service.searchUsers(params).promise.toFuture
    @inline def sendAnnouncementFuture(params: SendAnnouncementRequest): Future[SendAnnouncementResponse] =
      service.sendAnnouncement(params).promise.toFuture
    @inline def sendInvitationFuture(params: SendInvitationRequest): Future[SendInvitationResponse] =
      service.sendInvitation(params).promise.toFuture
    @inline def startDeviceSyncFuture(params: StartDeviceSyncRequest): Future[StartDeviceSyncResponse] =
      service.startDeviceSync(params).promise.toFuture
    @inline def startSmartHomeApplianceDiscoveryFuture(
        params: StartSmartHomeApplianceDiscoveryRequest
    ): Future[StartSmartHomeApplianceDiscoveryResponse] =
      service.startSmartHomeApplianceDiscovery(params).promise.toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    @inline def updateAddressBookFuture(params: UpdateAddressBookRequest): Future[UpdateAddressBookResponse] =
      service.updateAddressBook(params).promise.toFuture
    @inline def updateBusinessReportScheduleFuture(
        params: UpdateBusinessReportScheduleRequest
    ): Future[UpdateBusinessReportScheduleResponse] = service.updateBusinessReportSchedule(params).promise.toFuture
    @inline def updateConferenceProviderFuture(
        params: UpdateConferenceProviderRequest
    ): Future[UpdateConferenceProviderResponse] = service.updateConferenceProvider(params).promise.toFuture
    @inline def updateContactFuture(params: UpdateContactRequest): Future[UpdateContactResponse] =
      service.updateContact(params).promise.toFuture
    @inline def updateDeviceFuture(params: UpdateDeviceRequest): Future[UpdateDeviceResponse] =
      service.updateDevice(params).promise.toFuture
    @inline def updateGatewayFuture(params: UpdateGatewayRequest): Future[UpdateGatewayResponse] =
      service.updateGateway(params).promise.toFuture
    @inline def updateGatewayGroupFuture(params: UpdateGatewayGroupRequest): Future[UpdateGatewayGroupResponse] =
      service.updateGatewayGroup(params).promise.toFuture
    @inline def updateNetworkProfileFuture(params: UpdateNetworkProfileRequest): Future[UpdateNetworkProfileResponse] =
      service.updateNetworkProfile(params).promise.toFuture
    @inline def updateProfileFuture(params: UpdateProfileRequest): Future[UpdateProfileResponse] =
      service.updateProfile(params).promise.toFuture
    @inline def updateRoomFuture(params: UpdateRoomRequest): Future[UpdateRoomResponse] =
      service.updateRoom(params).promise.toFuture
    @inline def updateSkillGroupFuture(params: UpdateSkillGroupRequest): Future[UpdateSkillGroupResponse] =
      service.updateSkillGroup(params).promise.toFuture
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
  trait AddressBook extends js.Object {
    var AddressBookArn: js.UndefOr[Arn]
    var Description: js.UndefOr[AddressBookDescription]
    var Name: js.UndefOr[AddressBookName]
  }

  object AddressBook {
    @inline
    def apply(
        AddressBookArn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[AddressBookDescription] = js.undefined,
        Name: js.UndefOr[AddressBookName] = js.undefined
    ): AddressBook = {
      val __obj = js.Dynamic.literal()
      AddressBookArn.foreach(__v => __obj.updateDynamic("AddressBookArn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddressBook]
    }
  }

  /**
    * Information related to an address book.
    */
  @js.native
  trait AddressBookData extends js.Object {
    var AddressBookArn: js.UndefOr[Arn]
    var Description: js.UndefOr[AddressBookDescription]
    var Name: js.UndefOr[AddressBookName]
  }

  object AddressBookData {
    @inline
    def apply(
        AddressBookArn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[AddressBookDescription] = js.undefined,
        Name: js.UndefOr[AddressBookName] = js.undefined
    ): AddressBookData = {
      val __obj = js.Dynamic.literal()
      AddressBookArn.foreach(__v => __obj.updateDynamic("AddressBookArn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddressBookData]
    }
  }

  @js.native
  trait ApproveSkillRequest extends js.Object {
    var SkillId: SkillId
  }

  object ApproveSkillRequest {
    @inline
    def apply(
        SkillId: SkillId
    ): ApproveSkillRequest = {
      val __obj = js.Dynamic.literal(
        "SkillId" -> SkillId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ApproveSkillRequest]
    }
  }

  @js.native
  trait ApproveSkillResponse extends js.Object {}

  object ApproveSkillResponse {
    @inline
    def apply(
    ): ApproveSkillResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ApproveSkillResponse]
    }
  }

  @js.native
  trait AssociateContactWithAddressBookRequest extends js.Object {
    var AddressBookArn: Arn
    var ContactArn: Arn
  }

  object AssociateContactWithAddressBookRequest {
    @inline
    def apply(
        AddressBookArn: Arn,
        ContactArn: Arn
    ): AssociateContactWithAddressBookRequest = {
      val __obj = js.Dynamic.literal(
        "AddressBookArn" -> AddressBookArn.asInstanceOf[js.Any],
        "ContactArn"     -> ContactArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateContactWithAddressBookRequest]
    }
  }

  @js.native
  trait AssociateContactWithAddressBookResponse extends js.Object {}

  object AssociateContactWithAddressBookResponse {
    @inline
    def apply(
    ): AssociateContactWithAddressBookResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateContactWithAddressBookResponse]
    }
  }

  @js.native
  trait AssociateDeviceWithNetworkProfileRequest extends js.Object {
    var DeviceArn: Arn
    var NetworkProfileArn: Arn
  }

  object AssociateDeviceWithNetworkProfileRequest {
    @inline
    def apply(
        DeviceArn: Arn,
        NetworkProfileArn: Arn
    ): AssociateDeviceWithNetworkProfileRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceArn"         -> DeviceArn.asInstanceOf[js.Any],
        "NetworkProfileArn" -> NetworkProfileArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateDeviceWithNetworkProfileRequest]
    }
  }

  @js.native
  trait AssociateDeviceWithNetworkProfileResponse extends js.Object {}

  object AssociateDeviceWithNetworkProfileResponse {
    @inline
    def apply(
    ): AssociateDeviceWithNetworkProfileResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateDeviceWithNetworkProfileResponse]
    }
  }

  @js.native
  trait AssociateDeviceWithRoomRequest extends js.Object {
    var DeviceArn: js.UndefOr[Arn]
    var RoomArn: js.UndefOr[Arn]
  }

  object AssociateDeviceWithRoomRequest {
    @inline
    def apply(
        DeviceArn: js.UndefOr[Arn] = js.undefined,
        RoomArn: js.UndefOr[Arn] = js.undefined
    ): AssociateDeviceWithRoomRequest = {
      val __obj = js.Dynamic.literal()
      DeviceArn.foreach(__v => __obj.updateDynamic("DeviceArn")(__v.asInstanceOf[js.Any]))
      RoomArn.foreach(__v => __obj.updateDynamic("RoomArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateDeviceWithRoomRequest]
    }
  }

  @js.native
  trait AssociateDeviceWithRoomResponse extends js.Object {}

  object AssociateDeviceWithRoomResponse {
    @inline
    def apply(
    ): AssociateDeviceWithRoomResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateDeviceWithRoomResponse]
    }
  }

  @js.native
  trait AssociateSkillGroupWithRoomRequest extends js.Object {
    var RoomArn: js.UndefOr[Arn]
    var SkillGroupArn: js.UndefOr[Arn]
  }

  object AssociateSkillGroupWithRoomRequest {
    @inline
    def apply(
        RoomArn: js.UndefOr[Arn] = js.undefined,
        SkillGroupArn: js.UndefOr[Arn] = js.undefined
    ): AssociateSkillGroupWithRoomRequest = {
      val __obj = js.Dynamic.literal()
      RoomArn.foreach(__v => __obj.updateDynamic("RoomArn")(__v.asInstanceOf[js.Any]))
      SkillGroupArn.foreach(__v => __obj.updateDynamic("SkillGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateSkillGroupWithRoomRequest]
    }
  }

  @js.native
  trait AssociateSkillGroupWithRoomResponse extends js.Object {}

  object AssociateSkillGroupWithRoomResponse {
    @inline
    def apply(
    ): AssociateSkillGroupWithRoomResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateSkillGroupWithRoomResponse]
    }
  }

  @js.native
  trait AssociateSkillWithSkillGroupRequest extends js.Object {
    var SkillId: SkillId
    var SkillGroupArn: js.UndefOr[Arn]
  }

  object AssociateSkillWithSkillGroupRequest {
    @inline
    def apply(
        SkillId: SkillId,
        SkillGroupArn: js.UndefOr[Arn] = js.undefined
    ): AssociateSkillWithSkillGroupRequest = {
      val __obj = js.Dynamic.literal(
        "SkillId" -> SkillId.asInstanceOf[js.Any]
      )

      SkillGroupArn.foreach(__v => __obj.updateDynamic("SkillGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateSkillWithSkillGroupRequest]
    }
  }

  @js.native
  trait AssociateSkillWithSkillGroupResponse extends js.Object {}

  object AssociateSkillWithSkillGroupResponse {
    @inline
    def apply(
    ): AssociateSkillWithSkillGroupResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateSkillWithSkillGroupResponse]
    }
  }

  @js.native
  trait AssociateSkillWithUsersRequest extends js.Object {
    var SkillId: SkillId
  }

  object AssociateSkillWithUsersRequest {
    @inline
    def apply(
        SkillId: SkillId
    ): AssociateSkillWithUsersRequest = {
      val __obj = js.Dynamic.literal(
        "SkillId" -> SkillId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateSkillWithUsersRequest]
    }
  }

  @js.native
  trait AssociateSkillWithUsersResponse extends js.Object {}

  object AssociateSkillWithUsersResponse {
    @inline
    def apply(
    ): AssociateSkillWithUsersResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AssociateSkillWithUsersResponse]
    }
  }

  /**
    * The audio message. There is a 1 MB limit on the audio file input and the only supported format is MP3. To convert your MP3 audio files to an Alexa-friendly,
    *  required codec version (MPEG version 2) and bit rate (48 kbps), you might use converter software. One option for this is a command-line tool, FFmpeg. For more information, see [[https://www.ffmpeg.org/|FFmpeg]]. The following command converts the provided &lt;input-file&gt; to an MP3 file that is played in the announcement:
    *  <code>ffmpeg -i &lt;input-file&gt; -ac 2 -codec:a libmp3lame -b:a 48k -ar 16000 &lt;output-file.mp3&gt;</code>
    */
  @js.native
  trait Audio extends js.Object {
    var Locale: Locale
    var Location: AudioLocation
  }

  object Audio {
    @inline
    def apply(
        Locale: Locale,
        Location: AudioLocation
    ): Audio = {
      val __obj = js.Dynamic.literal(
        "Locale"   -> Locale.asInstanceOf[js.Any],
        "Location" -> Location.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Audio]
    }
  }

  /**
    * Usage report with specified parameters.
    */
  @js.native
  trait BusinessReport extends js.Object {
    var DeliveryTime: js.UndefOr[BusinessReportDeliveryTime]
    var DownloadUrl: js.UndefOr[BusinessReportDownloadUrl]
    var FailureCode: js.UndefOr[BusinessReportFailureCode]
    var S3Location: js.UndefOr[BusinessReportS3Location]
    var Status: js.UndefOr[BusinessReportStatus]
  }

  object BusinessReport {
    @inline
    def apply(
        DeliveryTime: js.UndefOr[BusinessReportDeliveryTime] = js.undefined,
        DownloadUrl: js.UndefOr[BusinessReportDownloadUrl] = js.undefined,
        FailureCode: js.UndefOr[BusinessReportFailureCode] = js.undefined,
        S3Location: js.UndefOr[BusinessReportS3Location] = js.undefined,
        Status: js.UndefOr[BusinessReportStatus] = js.undefined
    ): BusinessReport = {
      val __obj = js.Dynamic.literal()
      DeliveryTime.foreach(__v => __obj.updateDynamic("DeliveryTime")(__v.asInstanceOf[js.Any]))
      DownloadUrl.foreach(__v => __obj.updateDynamic("DownloadUrl")(__v.asInstanceOf[js.Any]))
      FailureCode.foreach(__v => __obj.updateDynamic("FailureCode")(__v.asInstanceOf[js.Any]))
      S3Location.foreach(__v => __obj.updateDynamic("S3Location")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BusinessReport]
    }
  }

  /**
    * The content range of the report.
    */
  @js.native
  trait BusinessReportContentRange extends js.Object {
    var Interval: js.UndefOr[BusinessReportInterval]
  }

  object BusinessReportContentRange {
    @inline
    def apply(
        Interval: js.UndefOr[BusinessReportInterval] = js.undefined
    ): BusinessReportContentRange = {
      val __obj = js.Dynamic.literal()
      Interval.foreach(__v => __obj.updateDynamic("Interval")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BusinessReportContentRange]
    }
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
  trait BusinessReportRecurrence extends js.Object {
    var StartDate: js.UndefOr[Date]
  }

  object BusinessReportRecurrence {
    @inline
    def apply(
        StartDate: js.UndefOr[Date] = js.undefined
    ): BusinessReportRecurrence = {
      val __obj = js.Dynamic.literal()
      StartDate.foreach(__v => __obj.updateDynamic("StartDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BusinessReportRecurrence]
    }
  }

  /**
    * The S3 location of the output reports.
    */
  @js.native
  trait BusinessReportS3Location extends js.Object {
    var BucketName: js.UndefOr[CustomerS3BucketName]
    var Path: js.UndefOr[BusinessReportS3Path]
  }

  object BusinessReportS3Location {
    @inline
    def apply(
        BucketName: js.UndefOr[CustomerS3BucketName] = js.undefined,
        Path: js.UndefOr[BusinessReportS3Path] = js.undefined
    ): BusinessReportS3Location = {
      val __obj = js.Dynamic.literal()
      BucketName.foreach(__v => __obj.updateDynamic("BucketName")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BusinessReportS3Location]
    }
  }

  /**
    * The schedule of the usage report.
    */
  @js.native
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

  object BusinessReportSchedule {
    @inline
    def apply(
        ContentRange: js.UndefOr[BusinessReportContentRange] = js.undefined,
        Format: js.UndefOr[BusinessReportFormat] = js.undefined,
        LastBusinessReport: js.UndefOr[BusinessReport] = js.undefined,
        Recurrence: js.UndefOr[BusinessReportRecurrence] = js.undefined,
        S3BucketName: js.UndefOr[CustomerS3BucketName] = js.undefined,
        S3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
        ScheduleArn: js.UndefOr[Arn] = js.undefined,
        ScheduleName: js.UndefOr[BusinessReportScheduleName] = js.undefined
    ): BusinessReportSchedule = {
      val __obj = js.Dynamic.literal()
      ContentRange.foreach(__v => __obj.updateDynamic("ContentRange")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      LastBusinessReport.foreach(__v => __obj.updateDynamic("LastBusinessReport")(__v.asInstanceOf[js.Any]))
      Recurrence.foreach(__v => __obj.updateDynamic("Recurrence")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.updateDynamic("S3KeyPrefix")(__v.asInstanceOf[js.Any]))
      ScheduleArn.foreach(__v => __obj.updateDynamic("ScheduleArn")(__v.asInstanceOf[js.Any]))
      ScheduleName.foreach(__v => __obj.updateDynamic("ScheduleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BusinessReportSchedule]
    }
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
  trait Category extends js.Object {
    var CategoryId: js.UndefOr[CategoryId]
    var CategoryName: js.UndefOr[CategoryName]
  }

  object Category {
    @inline
    def apply(
        CategoryId: js.UndefOr[CategoryId] = js.undefined,
        CategoryName: js.UndefOr[CategoryName] = js.undefined
    ): Category = {
      val __obj = js.Dynamic.literal()
      CategoryId.foreach(__v => __obj.updateDynamic("CategoryId")(__v.asInstanceOf[js.Any]))
      CategoryName.foreach(__v => __obj.updateDynamic("CategoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Category]
    }
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
  trait ConferencePreference extends js.Object {
    var DefaultConferenceProviderArn: js.UndefOr[Arn]
  }

  object ConferencePreference {
    @inline
    def apply(
        DefaultConferenceProviderArn: js.UndefOr[Arn] = js.undefined
    ): ConferencePreference = {
      val __obj = js.Dynamic.literal()
      DefaultConferenceProviderArn.foreach(__v =>
        __obj.updateDynamic("DefaultConferenceProviderArn")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ConferencePreference]
    }
  }

  /**
    * An entity that provides a conferencing solution. Alexa for Business acts as the voice interface and mediator that connects users to their preferred conference provider. Examples of conference providers include Amazon Chime, Zoom, Cisco, and Polycom.
    */
  @js.native
  trait ConferenceProvider extends js.Object {
    var Arn: js.UndefOr[Arn]
    var IPDialIn: js.UndefOr[IPDialIn]
    var MeetingSetting: js.UndefOr[MeetingSetting]
    var Name: js.UndefOr[ConferenceProviderName]
    var PSTNDialIn: js.UndefOr[PSTNDialIn]
    var Type: js.UndefOr[ConferenceProviderType]
  }

  object ConferenceProvider {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        IPDialIn: js.UndefOr[IPDialIn] = js.undefined,
        MeetingSetting: js.UndefOr[MeetingSetting] = js.undefined,
        Name: js.UndefOr[ConferenceProviderName] = js.undefined,
        PSTNDialIn: js.UndefOr[PSTNDialIn] = js.undefined,
        Type: js.UndefOr[ConferenceProviderType] = js.undefined
    ): ConferenceProvider = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      IPDialIn.foreach(__v => __obj.updateDynamic("IPDialIn")(__v.asInstanceOf[js.Any]))
      MeetingSetting.foreach(__v => __obj.updateDynamic("MeetingSetting")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PSTNDialIn.foreach(__v => __obj.updateDynamic("PSTNDialIn")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConferenceProvider]
    }
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
  trait Contact extends js.Object {
    var ContactArn: js.UndefOr[Arn]
    var DisplayName: js.UndefOr[ContactName]
    var FirstName: js.UndefOr[ContactName]
    var LastName: js.UndefOr[ContactName]
    var PhoneNumber: js.UndefOr[RawPhoneNumber]
    var PhoneNumbers: js.UndefOr[PhoneNumberList]
    var SipAddresses: js.UndefOr[SipAddressList]
  }

  object Contact {
    @inline
    def apply(
        ContactArn: js.UndefOr[Arn] = js.undefined,
        DisplayName: js.UndefOr[ContactName] = js.undefined,
        FirstName: js.UndefOr[ContactName] = js.undefined,
        LastName: js.UndefOr[ContactName] = js.undefined,
        PhoneNumber: js.UndefOr[RawPhoneNumber] = js.undefined,
        PhoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined,
        SipAddresses: js.UndefOr[SipAddressList] = js.undefined
    ): Contact = {
      val __obj = js.Dynamic.literal()
      ContactArn.foreach(__v => __obj.updateDynamic("ContactArn")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.updateDynamic("FirstName")(__v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.updateDynamic("LastName")(__v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      PhoneNumbers.foreach(__v => __obj.updateDynamic("PhoneNumbers")(__v.asInstanceOf[js.Any]))
      SipAddresses.foreach(__v => __obj.updateDynamic("SipAddresses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Contact]
    }
  }

  /**
    * Information related to a contact.
    */
  @js.native
  trait ContactData extends js.Object {
    var ContactArn: js.UndefOr[Arn]
    var DisplayName: js.UndefOr[ContactName]
    var FirstName: js.UndefOr[ContactName]
    var LastName: js.UndefOr[ContactName]
    var PhoneNumber: js.UndefOr[RawPhoneNumber]
    var PhoneNumbers: js.UndefOr[PhoneNumberList]
    var SipAddresses: js.UndefOr[SipAddressList]
  }

  object ContactData {
    @inline
    def apply(
        ContactArn: js.UndefOr[Arn] = js.undefined,
        DisplayName: js.UndefOr[ContactName] = js.undefined,
        FirstName: js.UndefOr[ContactName] = js.undefined,
        LastName: js.UndefOr[ContactName] = js.undefined,
        PhoneNumber: js.UndefOr[RawPhoneNumber] = js.undefined,
        PhoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined,
        SipAddresses: js.UndefOr[SipAddressList] = js.undefined
    ): ContactData = {
      val __obj = js.Dynamic.literal()
      ContactArn.foreach(__v => __obj.updateDynamic("ContactArn")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.updateDynamic("FirstName")(__v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.updateDynamic("LastName")(__v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      PhoneNumbers.foreach(__v => __obj.updateDynamic("PhoneNumbers")(__v.asInstanceOf[js.Any]))
      SipAddresses.foreach(__v => __obj.updateDynamic("SipAddresses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactData]
    }
  }

  /**
    * The content definition. This can contain only one text, SSML, or audio list object.
    */
  @js.native
  trait Content extends js.Object {
    var AudioList: js.UndefOr[AudioList]
    var SsmlList: js.UndefOr[SsmlList]
    var TextList: js.UndefOr[TextList]
  }

  object Content {
    @inline
    def apply(
        AudioList: js.UndefOr[AudioList] = js.undefined,
        SsmlList: js.UndefOr[SsmlList] = js.undefined,
        TextList: js.UndefOr[TextList] = js.undefined
    ): Content = {
      val __obj = js.Dynamic.literal()
      AudioList.foreach(__v => __obj.updateDynamic("AudioList")(__v.asInstanceOf[js.Any]))
      SsmlList.foreach(__v => __obj.updateDynamic("SsmlList")(__v.asInstanceOf[js.Any]))
      TextList.foreach(__v => __obj.updateDynamic("TextList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Content]
    }
  }

  @js.native
  trait CreateAddressBookRequest extends js.Object {
    var Name: AddressBookName
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Description: js.UndefOr[AddressBookDescription]
  }

  object CreateAddressBookRequest {
    @inline
    def apply(
        Name: AddressBookName,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Description: js.UndefOr[AddressBookDescription] = js.undefined
    ): CreateAddressBookRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAddressBookRequest]
    }
  }

  @js.native
  trait CreateAddressBookResponse extends js.Object {
    var AddressBookArn: js.UndefOr[Arn]
  }

  object CreateAddressBookResponse {
    @inline
    def apply(
        AddressBookArn: js.UndefOr[Arn] = js.undefined
    ): CreateAddressBookResponse = {
      val __obj = js.Dynamic.literal()
      AddressBookArn.foreach(__v => __obj.updateDynamic("AddressBookArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAddressBookResponse]
    }
  }

  @js.native
  trait CreateBusinessReportScheduleRequest extends js.Object {
    var ContentRange: BusinessReportContentRange
    var Format: BusinessReportFormat
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Recurrence: js.UndefOr[BusinessReportRecurrence]
    var S3BucketName: js.UndefOr[CustomerS3BucketName]
    var S3KeyPrefix: js.UndefOr[S3KeyPrefix]
    var ScheduleName: js.UndefOr[BusinessReportScheduleName]
  }

  object CreateBusinessReportScheduleRequest {
    @inline
    def apply(
        ContentRange: BusinessReportContentRange,
        Format: BusinessReportFormat,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Recurrence: js.UndefOr[BusinessReportRecurrence] = js.undefined,
        S3BucketName: js.UndefOr[CustomerS3BucketName] = js.undefined,
        S3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
        ScheduleName: js.UndefOr[BusinessReportScheduleName] = js.undefined
    ): CreateBusinessReportScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "ContentRange" -> ContentRange.asInstanceOf[js.Any],
        "Format"       -> Format.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Recurrence.foreach(__v => __obj.updateDynamic("Recurrence")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.updateDynamic("S3KeyPrefix")(__v.asInstanceOf[js.Any]))
      ScheduleName.foreach(__v => __obj.updateDynamic("ScheduleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBusinessReportScheduleRequest]
    }
  }

  @js.native
  trait CreateBusinessReportScheduleResponse extends js.Object {
    var ScheduleArn: js.UndefOr[Arn]
  }

  object CreateBusinessReportScheduleResponse {
    @inline
    def apply(
        ScheduleArn: js.UndefOr[Arn] = js.undefined
    ): CreateBusinessReportScheduleResponse = {
      val __obj = js.Dynamic.literal()
      ScheduleArn.foreach(__v => __obj.updateDynamic("ScheduleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBusinessReportScheduleResponse]
    }
  }

  @js.native
  trait CreateConferenceProviderRequest extends js.Object {
    var ConferenceProviderName: ConferenceProviderName
    var ConferenceProviderType: ConferenceProviderType
    var MeetingSetting: MeetingSetting
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var IPDialIn: js.UndefOr[IPDialIn]
    var PSTNDialIn: js.UndefOr[PSTNDialIn]
  }

  object CreateConferenceProviderRequest {
    @inline
    def apply(
        ConferenceProviderName: ConferenceProviderName,
        ConferenceProviderType: ConferenceProviderType,
        MeetingSetting: MeetingSetting,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        IPDialIn: js.UndefOr[IPDialIn] = js.undefined,
        PSTNDialIn: js.UndefOr[PSTNDialIn] = js.undefined
    ): CreateConferenceProviderRequest = {
      val __obj = js.Dynamic.literal(
        "ConferenceProviderName" -> ConferenceProviderName.asInstanceOf[js.Any],
        "ConferenceProviderType" -> ConferenceProviderType.asInstanceOf[js.Any],
        "MeetingSetting"         -> MeetingSetting.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      IPDialIn.foreach(__v => __obj.updateDynamic("IPDialIn")(__v.asInstanceOf[js.Any]))
      PSTNDialIn.foreach(__v => __obj.updateDynamic("PSTNDialIn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConferenceProviderRequest]
    }
  }

  @js.native
  trait CreateConferenceProviderResponse extends js.Object {
    var ConferenceProviderArn: js.UndefOr[Arn]
  }

  object CreateConferenceProviderResponse {
    @inline
    def apply(
        ConferenceProviderArn: js.UndefOr[Arn] = js.undefined
    ): CreateConferenceProviderResponse = {
      val __obj = js.Dynamic.literal()
      ConferenceProviderArn.foreach(__v => __obj.updateDynamic("ConferenceProviderArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConferenceProviderResponse]
    }
  }

  @js.native
  trait CreateContactRequest extends js.Object {
    var FirstName: ContactName
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var DisplayName: js.UndefOr[ContactName]
    var LastName: js.UndefOr[ContactName]
    var PhoneNumber: js.UndefOr[RawPhoneNumber]
    var PhoneNumbers: js.UndefOr[PhoneNumberList]
    var SipAddresses: js.UndefOr[SipAddressList]
  }

  object CreateContactRequest {
    @inline
    def apply(
        FirstName: ContactName,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        DisplayName: js.UndefOr[ContactName] = js.undefined,
        LastName: js.UndefOr[ContactName] = js.undefined,
        PhoneNumber: js.UndefOr[RawPhoneNumber] = js.undefined,
        PhoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined,
        SipAddresses: js.UndefOr[SipAddressList] = js.undefined
    ): CreateContactRequest = {
      val __obj = js.Dynamic.literal(
        "FirstName" -> FirstName.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.updateDynamic("LastName")(__v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      PhoneNumbers.foreach(__v => __obj.updateDynamic("PhoneNumbers")(__v.asInstanceOf[js.Any]))
      SipAddresses.foreach(__v => __obj.updateDynamic("SipAddresses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateContactRequest]
    }
  }

  @js.native
  trait CreateContactResponse extends js.Object {
    var ContactArn: js.UndefOr[Arn]
  }

  object CreateContactResponse {
    @inline
    def apply(
        ContactArn: js.UndefOr[Arn] = js.undefined
    ): CreateContactResponse = {
      val __obj = js.Dynamic.literal()
      ContactArn.foreach(__v => __obj.updateDynamic("ContactArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateContactResponse]
    }
  }

  /**
    * Creates settings for the end of meeting reminder feature that are applied to a room profile. The end of meeting reminder enables Alexa to remind users when a meeting is ending.
    */
  @js.native
  trait CreateEndOfMeetingReminder extends js.Object {
    var Enabled: Boolean
    var ReminderAtMinutes: EndOfMeetingReminderMinutesList
    var ReminderType: EndOfMeetingReminderType
  }

  object CreateEndOfMeetingReminder {
    @inline
    def apply(
        Enabled: Boolean,
        ReminderAtMinutes: EndOfMeetingReminderMinutesList,
        ReminderType: EndOfMeetingReminderType
    ): CreateEndOfMeetingReminder = {
      val __obj = js.Dynamic.literal(
        "Enabled"           -> Enabled.asInstanceOf[js.Any],
        "ReminderAtMinutes" -> ReminderAtMinutes.asInstanceOf[js.Any],
        "ReminderType"      -> ReminderType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateEndOfMeetingReminder]
    }
  }

  @js.native
  trait CreateGatewayGroupRequest extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var Name: GatewayGroupName
    var Description: js.UndefOr[GatewayGroupDescription]
  }

  object CreateGatewayGroupRequest {
    @inline
    def apply(
        ClientRequestToken: ClientRequestToken,
        Name: GatewayGroupName,
        Description: js.UndefOr[GatewayGroupDescription] = js.undefined
    ): CreateGatewayGroupRequest = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "Name"               -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGatewayGroupRequest]
    }
  }

  @js.native
  trait CreateGatewayGroupResponse extends js.Object {
    var GatewayGroupArn: js.UndefOr[Arn]
  }

  object CreateGatewayGroupResponse {
    @inline
    def apply(
        GatewayGroupArn: js.UndefOr[Arn] = js.undefined
    ): CreateGatewayGroupResponse = {
      val __obj = js.Dynamic.literal()
      GatewayGroupArn.foreach(__v => __obj.updateDynamic("GatewayGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGatewayGroupResponse]
    }
  }

  /**
    * Creates settings for the instant booking feature that are applied to a room profile. When users start their meeting with Alexa, Alexa automatically books the room for the configured duration if the room is available.
    */
  @js.native
  trait CreateInstantBooking extends js.Object {
    var DurationInMinutes: Minutes
    var Enabled: Boolean
  }

  object CreateInstantBooking {
    @inline
    def apply(
        DurationInMinutes: Minutes,
        Enabled: Boolean
    ): CreateInstantBooking = {
      val __obj = js.Dynamic.literal(
        "DurationInMinutes" -> DurationInMinutes.asInstanceOf[js.Any],
        "Enabled"           -> Enabled.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateInstantBooking]
    }
  }

  /**
    * Creates meeting room settings of a room profile.
    */
  @js.native
  trait CreateMeetingRoomConfiguration extends js.Object {
    var EndOfMeetingReminder: js.UndefOr[CreateEndOfMeetingReminder]
    var InstantBooking: js.UndefOr[CreateInstantBooking]
    var RequireCheckIn: js.UndefOr[CreateRequireCheckIn]
    var RoomUtilizationMetricsEnabled: js.UndefOr[Boolean]
  }

  object CreateMeetingRoomConfiguration {
    @inline
    def apply(
        EndOfMeetingReminder: js.UndefOr[CreateEndOfMeetingReminder] = js.undefined,
        InstantBooking: js.UndefOr[CreateInstantBooking] = js.undefined,
        RequireCheckIn: js.UndefOr[CreateRequireCheckIn] = js.undefined,
        RoomUtilizationMetricsEnabled: js.UndefOr[Boolean] = js.undefined
    ): CreateMeetingRoomConfiguration = {
      val __obj = js.Dynamic.literal()
      EndOfMeetingReminder.foreach(__v => __obj.updateDynamic("EndOfMeetingReminder")(__v.asInstanceOf[js.Any]))
      InstantBooking.foreach(__v => __obj.updateDynamic("InstantBooking")(__v.asInstanceOf[js.Any]))
      RequireCheckIn.foreach(__v => __obj.updateDynamic("RequireCheckIn")(__v.asInstanceOf[js.Any]))
      RoomUtilizationMetricsEnabled.foreach(__v =>
        __obj.updateDynamic("RoomUtilizationMetricsEnabled")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CreateMeetingRoomConfiguration]
    }
  }

  @js.native
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

  object CreateNetworkProfileRequest {
    @inline
    def apply(
        ClientRequestToken: ClientRequestToken,
        NetworkProfileName: NetworkProfileName,
        SecurityType: NetworkSecurityType,
        Ssid: NetworkSsid,
        CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
        CurrentPassword: js.UndefOr[CurrentWiFiPassword] = js.undefined,
        Description: js.UndefOr[NetworkProfileDescription] = js.undefined,
        EapMethod: js.UndefOr[NetworkEapMethod] = js.undefined,
        NextPassword: js.UndefOr[NextWiFiPassword] = js.undefined,
        TrustAnchors: js.UndefOr[TrustAnchorList] = js.undefined
    ): CreateNetworkProfileRequest = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "NetworkProfileName" -> NetworkProfileName.asInstanceOf[js.Any],
        "SecurityType"       -> SecurityType.asInstanceOf[js.Any],
        "Ssid"               -> Ssid.asInstanceOf[js.Any]
      )

      CertificateAuthorityArn.foreach(__v => __obj.updateDynamic("CertificateAuthorityArn")(__v.asInstanceOf[js.Any]))
      CurrentPassword.foreach(__v => __obj.updateDynamic("CurrentPassword")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EapMethod.foreach(__v => __obj.updateDynamic("EapMethod")(__v.asInstanceOf[js.Any]))
      NextPassword.foreach(__v => __obj.updateDynamic("NextPassword")(__v.asInstanceOf[js.Any]))
      TrustAnchors.foreach(__v => __obj.updateDynamic("TrustAnchors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNetworkProfileRequest]
    }
  }

  @js.native
  trait CreateNetworkProfileResponse extends js.Object {
    var NetworkProfileArn: js.UndefOr[Arn]
  }

  object CreateNetworkProfileResponse {
    @inline
    def apply(
        NetworkProfileArn: js.UndefOr[Arn] = js.undefined
    ): CreateNetworkProfileResponse = {
      val __obj = js.Dynamic.literal()
      NetworkProfileArn.foreach(__v => __obj.updateDynamic("NetworkProfileArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNetworkProfileResponse]
    }
  }

  @js.native
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

  object CreateProfileRequest {
    @inline
    def apply(
        Address: Address,
        DistanceUnit: DistanceUnit,
        ProfileName: ProfileName,
        TemperatureUnit: TemperatureUnit,
        Timezone: Timezone,
        WakeWord: WakeWord,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Locale: js.UndefOr[DeviceLocale] = js.undefined,
        MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined,
        MeetingRoomConfiguration: js.UndefOr[CreateMeetingRoomConfiguration] = js.undefined,
        PSTNEnabled: js.UndefOr[Boolean] = js.undefined,
        SetupModeDisabled: js.UndefOr[Boolean] = js.undefined
    ): CreateProfileRequest = {
      val __obj = js.Dynamic.literal(
        "Address"         -> Address.asInstanceOf[js.Any],
        "DistanceUnit"    -> DistanceUnit.asInstanceOf[js.Any],
        "ProfileName"     -> ProfileName.asInstanceOf[js.Any],
        "TemperatureUnit" -> TemperatureUnit.asInstanceOf[js.Any],
        "Timezone"        -> Timezone.asInstanceOf[js.Any],
        "WakeWord"        -> WakeWord.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Locale.foreach(__v => __obj.updateDynamic("Locale")(__v.asInstanceOf[js.Any]))
      MaxVolumeLimit.foreach(__v => __obj.updateDynamic("MaxVolumeLimit")(__v.asInstanceOf[js.Any]))
      MeetingRoomConfiguration.foreach(__v => __obj.updateDynamic("MeetingRoomConfiguration")(__v.asInstanceOf[js.Any]))
      PSTNEnabled.foreach(__v => __obj.updateDynamic("PSTNEnabled")(__v.asInstanceOf[js.Any]))
      SetupModeDisabled.foreach(__v => __obj.updateDynamic("SetupModeDisabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProfileRequest]
    }
  }

  @js.native
  trait CreateProfileResponse extends js.Object {
    var ProfileArn: js.UndefOr[Arn]
  }

  object CreateProfileResponse {
    @inline
    def apply(
        ProfileArn: js.UndefOr[Arn] = js.undefined
    ): CreateProfileResponse = {
      val __obj = js.Dynamic.literal()
      ProfileArn.foreach(__v => __obj.updateDynamic("ProfileArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProfileResponse]
    }
  }

  /**
    * Creates settings for the require check in feature that are applied to a room profile. Require check in allows a meeting room’s Alexa or AVS device to prompt the user to check in; otherwise, the room will be released.
    */
  @js.native
  trait CreateRequireCheckIn extends js.Object {
    var Enabled: Boolean
    var ReleaseAfterMinutes: Minutes
  }

  object CreateRequireCheckIn {
    @inline
    def apply(
        Enabled: Boolean,
        ReleaseAfterMinutes: Minutes
    ): CreateRequireCheckIn = {
      val __obj = js.Dynamic.literal(
        "Enabled"             -> Enabled.asInstanceOf[js.Any],
        "ReleaseAfterMinutes" -> ReleaseAfterMinutes.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateRequireCheckIn]
    }
  }

  @js.native
  trait CreateRoomRequest extends js.Object {
    var RoomName: RoomName
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Description: js.UndefOr[RoomDescription]
    var ProfileArn: js.UndefOr[Arn]
    var ProviderCalendarId: js.UndefOr[ProviderCalendarId]
    var Tags: js.UndefOr[TagList]
  }

  object CreateRoomRequest {
    @inline
    def apply(
        RoomName: RoomName,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Description: js.UndefOr[RoomDescription] = js.undefined,
        ProfileArn: js.UndefOr[Arn] = js.undefined,
        ProviderCalendarId: js.UndefOr[ProviderCalendarId] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateRoomRequest = {
      val __obj = js.Dynamic.literal(
        "RoomName" -> RoomName.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ProfileArn.foreach(__v => __obj.updateDynamic("ProfileArn")(__v.asInstanceOf[js.Any]))
      ProviderCalendarId.foreach(__v => __obj.updateDynamic("ProviderCalendarId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRoomRequest]
    }
  }

  @js.native
  trait CreateRoomResponse extends js.Object {
    var RoomArn: js.UndefOr[Arn]
  }

  object CreateRoomResponse {
    @inline
    def apply(
        RoomArn: js.UndefOr[Arn] = js.undefined
    ): CreateRoomResponse = {
      val __obj = js.Dynamic.literal()
      RoomArn.foreach(__v => __obj.updateDynamic("RoomArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRoomResponse]
    }
  }

  @js.native
  trait CreateSkillGroupRequest extends js.Object {
    var SkillGroupName: SkillGroupName
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Description: js.UndefOr[SkillGroupDescription]
  }

  object CreateSkillGroupRequest {
    @inline
    def apply(
        SkillGroupName: SkillGroupName,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Description: js.UndefOr[SkillGroupDescription] = js.undefined
    ): CreateSkillGroupRequest = {
      val __obj = js.Dynamic.literal(
        "SkillGroupName" -> SkillGroupName.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSkillGroupRequest]
    }
  }

  @js.native
  trait CreateSkillGroupResponse extends js.Object {
    var SkillGroupArn: js.UndefOr[Arn]
  }

  object CreateSkillGroupResponse {
    @inline
    def apply(
        SkillGroupArn: js.UndefOr[Arn] = js.undefined
    ): CreateSkillGroupResponse = {
      val __obj = js.Dynamic.literal()
      SkillGroupArn.foreach(__v => __obj.updateDynamic("SkillGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSkillGroupResponse]
    }
  }

  @js.native
  trait CreateUserRequest extends js.Object {
    var UserId: user_UserId
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Email: js.UndefOr[Email]
    var FirstName: js.UndefOr[user_FirstName]
    var LastName: js.UndefOr[user_LastName]
    var Tags: js.UndefOr[TagList]
  }

  object CreateUserRequest {
    @inline
    def apply(
        UserId: user_UserId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Email: js.UndefOr[Email] = js.undefined,
        FirstName: js.UndefOr[user_FirstName] = js.undefined,
        LastName: js.UndefOr[user_LastName] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateUserRequest = {
      val __obj = js.Dynamic.literal(
        "UserId" -> UserId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.updateDynamic("FirstName")(__v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.updateDynamic("LastName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object {
    var UserArn: js.UndefOr[Arn]
  }

  object CreateUserResponse {
    @inline
    def apply(
        UserArn: js.UndefOr[Arn] = js.undefined
    ): CreateUserResponse = {
      val __obj = js.Dynamic.literal()
      UserArn.foreach(__v => __obj.updateDynamic("UserArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserResponse]
    }
  }

  @js.native
  trait DeleteAddressBookRequest extends js.Object {
    var AddressBookArn: Arn
  }

  object DeleteAddressBookRequest {
    @inline
    def apply(
        AddressBookArn: Arn
    ): DeleteAddressBookRequest = {
      val __obj = js.Dynamic.literal(
        "AddressBookArn" -> AddressBookArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAddressBookRequest]
    }
  }

  @js.native
  trait DeleteAddressBookResponse extends js.Object {}

  object DeleteAddressBookResponse {
    @inline
    def apply(
    ): DeleteAddressBookResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteAddressBookResponse]
    }
  }

  @js.native
  trait DeleteBusinessReportScheduleRequest extends js.Object {
    var ScheduleArn: Arn
  }

  object DeleteBusinessReportScheduleRequest {
    @inline
    def apply(
        ScheduleArn: Arn
    ): DeleteBusinessReportScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "ScheduleArn" -> ScheduleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBusinessReportScheduleRequest]
    }
  }

  @js.native
  trait DeleteBusinessReportScheduleResponse extends js.Object {}

  object DeleteBusinessReportScheduleResponse {
    @inline
    def apply(
    ): DeleteBusinessReportScheduleResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteBusinessReportScheduleResponse]
    }
  }

  @js.native
  trait DeleteConferenceProviderRequest extends js.Object {
    var ConferenceProviderArn: Arn
  }

  object DeleteConferenceProviderRequest {
    @inline
    def apply(
        ConferenceProviderArn: Arn
    ): DeleteConferenceProviderRequest = {
      val __obj = js.Dynamic.literal(
        "ConferenceProviderArn" -> ConferenceProviderArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteConferenceProviderRequest]
    }
  }

  @js.native
  trait DeleteConferenceProviderResponse extends js.Object {}

  object DeleteConferenceProviderResponse {
    @inline
    def apply(
    ): DeleteConferenceProviderResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteConferenceProviderResponse]
    }
  }

  @js.native
  trait DeleteContactRequest extends js.Object {
    var ContactArn: Arn
  }

  object DeleteContactRequest {
    @inline
    def apply(
        ContactArn: Arn
    ): DeleteContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactArn" -> ContactArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteContactRequest]
    }
  }

  @js.native
  trait DeleteContactResponse extends js.Object {}

  object DeleteContactResponse {
    @inline
    def apply(
    ): DeleteContactResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteContactResponse]
    }
  }

  @js.native
  trait DeleteDeviceRequest extends js.Object {
    var DeviceArn: Arn
  }

  object DeleteDeviceRequest {
    @inline
    def apply(
        DeviceArn: Arn
    ): DeleteDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceArn" -> DeviceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDeviceRequest]
    }
  }

  @js.native
  trait DeleteDeviceResponse extends js.Object {}

  object DeleteDeviceResponse {
    @inline
    def apply(
    ): DeleteDeviceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteDeviceResponse]
    }
  }

  @js.native
  trait DeleteDeviceUsageDataRequest extends js.Object {
    var DeviceArn: Arn
    var DeviceUsageType: DeviceUsageType
  }

  object DeleteDeviceUsageDataRequest {
    @inline
    def apply(
        DeviceArn: Arn,
        DeviceUsageType: DeviceUsageType
    ): DeleteDeviceUsageDataRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceArn"       -> DeviceArn.asInstanceOf[js.Any],
        "DeviceUsageType" -> DeviceUsageType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDeviceUsageDataRequest]
    }
  }

  @js.native
  trait DeleteDeviceUsageDataResponse extends js.Object {}

  object DeleteDeviceUsageDataResponse {
    @inline
    def apply(
    ): DeleteDeviceUsageDataResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteDeviceUsageDataResponse]
    }
  }

  @js.native
  trait DeleteGatewayGroupRequest extends js.Object {
    var GatewayGroupArn: Arn
  }

  object DeleteGatewayGroupRequest {
    @inline
    def apply(
        GatewayGroupArn: Arn
    ): DeleteGatewayGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GatewayGroupArn" -> GatewayGroupArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteGatewayGroupRequest]
    }
  }

  @js.native
  trait DeleteGatewayGroupResponse extends js.Object {}

  object DeleteGatewayGroupResponse {
    @inline
    def apply(
    ): DeleteGatewayGroupResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteGatewayGroupResponse]
    }
  }

  @js.native
  trait DeleteNetworkProfileRequest extends js.Object {
    var NetworkProfileArn: Arn
  }

  object DeleteNetworkProfileRequest {
    @inline
    def apply(
        NetworkProfileArn: Arn
    ): DeleteNetworkProfileRequest = {
      val __obj = js.Dynamic.literal(
        "NetworkProfileArn" -> NetworkProfileArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteNetworkProfileRequest]
    }
  }

  @js.native
  trait DeleteNetworkProfileResponse extends js.Object {}

  object DeleteNetworkProfileResponse {
    @inline
    def apply(
    ): DeleteNetworkProfileResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteNetworkProfileResponse]
    }
  }

  @js.native
  trait DeleteProfileRequest extends js.Object {
    var ProfileArn: js.UndefOr[Arn]
  }

  object DeleteProfileRequest {
    @inline
    def apply(
        ProfileArn: js.UndefOr[Arn] = js.undefined
    ): DeleteProfileRequest = {
      val __obj = js.Dynamic.literal()
      ProfileArn.foreach(__v => __obj.updateDynamic("ProfileArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProfileRequest]
    }
  }

  @js.native
  trait DeleteProfileResponse extends js.Object {}

  object DeleteProfileResponse {
    @inline
    def apply(
    ): DeleteProfileResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteProfileResponse]
    }
  }

  @js.native
  trait DeleteRoomRequest extends js.Object {
    var RoomArn: js.UndefOr[Arn]
  }

  object DeleteRoomRequest {
    @inline
    def apply(
        RoomArn: js.UndefOr[Arn] = js.undefined
    ): DeleteRoomRequest = {
      val __obj = js.Dynamic.literal()
      RoomArn.foreach(__v => __obj.updateDynamic("RoomArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRoomRequest]
    }
  }

  @js.native
  trait DeleteRoomResponse extends js.Object {}

  object DeleteRoomResponse {
    @inline
    def apply(
    ): DeleteRoomResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteRoomResponse]
    }
  }

  @js.native
  trait DeleteRoomSkillParameterRequest extends js.Object {
    var ParameterKey: RoomSkillParameterKey
    var SkillId: SkillId
    var RoomArn: js.UndefOr[Arn]
  }

  object DeleteRoomSkillParameterRequest {
    @inline
    def apply(
        ParameterKey: RoomSkillParameterKey,
        SkillId: SkillId,
        RoomArn: js.UndefOr[Arn] = js.undefined
    ): DeleteRoomSkillParameterRequest = {
      val __obj = js.Dynamic.literal(
        "ParameterKey" -> ParameterKey.asInstanceOf[js.Any],
        "SkillId"      -> SkillId.asInstanceOf[js.Any]
      )

      RoomArn.foreach(__v => __obj.updateDynamic("RoomArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRoomSkillParameterRequest]
    }
  }

  @js.native
  trait DeleteRoomSkillParameterResponse extends js.Object {}

  object DeleteRoomSkillParameterResponse {
    @inline
    def apply(
    ): DeleteRoomSkillParameterResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteRoomSkillParameterResponse]
    }
  }

  @js.native
  trait DeleteSkillAuthorizationRequest extends js.Object {
    var SkillId: SkillId
    var RoomArn: js.UndefOr[Arn]
  }

  object DeleteSkillAuthorizationRequest {
    @inline
    def apply(
        SkillId: SkillId,
        RoomArn: js.UndefOr[Arn] = js.undefined
    ): DeleteSkillAuthorizationRequest = {
      val __obj = js.Dynamic.literal(
        "SkillId" -> SkillId.asInstanceOf[js.Any]
      )

      RoomArn.foreach(__v => __obj.updateDynamic("RoomArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSkillAuthorizationRequest]
    }
  }

  @js.native
  trait DeleteSkillAuthorizationResponse extends js.Object {}

  object DeleteSkillAuthorizationResponse {
    @inline
    def apply(
    ): DeleteSkillAuthorizationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteSkillAuthorizationResponse]
    }
  }

  @js.native
  trait DeleteSkillGroupRequest extends js.Object {
    var SkillGroupArn: js.UndefOr[Arn]
  }

  object DeleteSkillGroupRequest {
    @inline
    def apply(
        SkillGroupArn: js.UndefOr[Arn] = js.undefined
    ): DeleteSkillGroupRequest = {
      val __obj = js.Dynamic.literal()
      SkillGroupArn.foreach(__v => __obj.updateDynamic("SkillGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSkillGroupRequest]
    }
  }

  @js.native
  trait DeleteSkillGroupResponse extends js.Object {}

  object DeleteSkillGroupResponse {
    @inline
    def apply(
    ): DeleteSkillGroupResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteSkillGroupResponse]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var EnrollmentId: EnrollmentId
    var UserArn: js.UndefOr[Arn]
  }

  object DeleteUserRequest {
    @inline
    def apply(
        EnrollmentId: EnrollmentId,
        UserArn: js.UndefOr[Arn] = js.undefined
    ): DeleteUserRequest = {
      val __obj = js.Dynamic.literal(
        "EnrollmentId" -> EnrollmentId.asInstanceOf[js.Any]
      )

      UserArn.foreach(__v => __obj.updateDynamic("UserArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DeleteUserResponse extends js.Object {}

  object DeleteUserResponse {
    @inline
    def apply(
    ): DeleteUserResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteUserResponse]
    }
  }

  /**
    * The details about the developer that published the skill.
    */
  @js.native
  trait DeveloperInfo extends js.Object {
    var DeveloperName: js.UndefOr[DeveloperName]
    var Email: js.UndefOr[Email]
    var PrivacyPolicy: js.UndefOr[PrivacyPolicy]
    var Url: js.UndefOr[Url]
  }

  object DeveloperInfo {
    @inline
    def apply(
        DeveloperName: js.UndefOr[DeveloperName] = js.undefined,
        Email: js.UndefOr[Email] = js.undefined,
        PrivacyPolicy: js.UndefOr[PrivacyPolicy] = js.undefined,
        Url: js.UndefOr[Url] = js.undefined
    ): DeveloperInfo = {
      val __obj = js.Dynamic.literal()
      DeveloperName.foreach(__v => __obj.updateDynamic("DeveloperName")(__v.asInstanceOf[js.Any]))
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      PrivacyPolicy.foreach(__v => __obj.updateDynamic("PrivacyPolicy")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeveloperInfo]
    }
  }

  /**
    * A device with attributes.
    */
  @js.native
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

  object Device {
    @inline
    def apply(
        DeviceArn: js.UndefOr[Arn] = js.undefined,
        DeviceName: js.UndefOr[DeviceName] = js.undefined,
        DeviceSerialNumber: js.UndefOr[DeviceSerialNumber] = js.undefined,
        DeviceStatus: js.UndefOr[DeviceStatus] = js.undefined,
        DeviceStatusInfo: js.UndefOr[DeviceStatusInfo] = js.undefined,
        DeviceType: js.UndefOr[DeviceType] = js.undefined,
        MacAddress: js.UndefOr[MacAddress] = js.undefined,
        NetworkProfileInfo: js.UndefOr[DeviceNetworkProfileInfo] = js.undefined,
        RoomArn: js.UndefOr[Arn] = js.undefined,
        SoftwareVersion: js.UndefOr[SoftwareVersion] = js.undefined
    ): Device = {
      val __obj = js.Dynamic.literal()
      DeviceArn.foreach(__v => __obj.updateDynamic("DeviceArn")(__v.asInstanceOf[js.Any]))
      DeviceName.foreach(__v => __obj.updateDynamic("DeviceName")(__v.asInstanceOf[js.Any]))
      DeviceSerialNumber.foreach(__v => __obj.updateDynamic("DeviceSerialNumber")(__v.asInstanceOf[js.Any]))
      DeviceStatus.foreach(__v => __obj.updateDynamic("DeviceStatus")(__v.asInstanceOf[js.Any]))
      DeviceStatusInfo.foreach(__v => __obj.updateDynamic("DeviceStatusInfo")(__v.asInstanceOf[js.Any]))
      DeviceType.foreach(__v => __obj.updateDynamic("DeviceType")(__v.asInstanceOf[js.Any]))
      MacAddress.foreach(__v => __obj.updateDynamic("MacAddress")(__v.asInstanceOf[js.Any]))
      NetworkProfileInfo.foreach(__v => __obj.updateDynamic("NetworkProfileInfo")(__v.asInstanceOf[js.Any]))
      RoomArn.foreach(__v => __obj.updateDynamic("RoomArn")(__v.asInstanceOf[js.Any]))
      SoftwareVersion.foreach(__v => __obj.updateDynamic("SoftwareVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Device]
    }
  }

  /**
    * Device attributes.
    */
  @js.native
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

  object DeviceData {
    @inline
    def apply(
        CreatedTime: js.UndefOr[DeviceDataCreatedTime] = js.undefined,
        DeviceArn: js.UndefOr[Arn] = js.undefined,
        DeviceName: js.UndefOr[DeviceName] = js.undefined,
        DeviceSerialNumber: js.UndefOr[DeviceSerialNumber] = js.undefined,
        DeviceStatus: js.UndefOr[DeviceStatus] = js.undefined,
        DeviceStatusInfo: js.UndefOr[DeviceStatusInfo] = js.undefined,
        DeviceType: js.UndefOr[DeviceType] = js.undefined,
        MacAddress: js.UndefOr[MacAddress] = js.undefined,
        NetworkProfileArn: js.UndefOr[Arn] = js.undefined,
        NetworkProfileName: js.UndefOr[NetworkProfileName] = js.undefined,
        RoomArn: js.UndefOr[Arn] = js.undefined,
        RoomName: js.UndefOr[RoomName] = js.undefined,
        SoftwareVersion: js.UndefOr[SoftwareVersion] = js.undefined
    ): DeviceData = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DeviceArn.foreach(__v => __obj.updateDynamic("DeviceArn")(__v.asInstanceOf[js.Any]))
      DeviceName.foreach(__v => __obj.updateDynamic("DeviceName")(__v.asInstanceOf[js.Any]))
      DeviceSerialNumber.foreach(__v => __obj.updateDynamic("DeviceSerialNumber")(__v.asInstanceOf[js.Any]))
      DeviceStatus.foreach(__v => __obj.updateDynamic("DeviceStatus")(__v.asInstanceOf[js.Any]))
      DeviceStatusInfo.foreach(__v => __obj.updateDynamic("DeviceStatusInfo")(__v.asInstanceOf[js.Any]))
      DeviceType.foreach(__v => __obj.updateDynamic("DeviceType")(__v.asInstanceOf[js.Any]))
      MacAddress.foreach(__v => __obj.updateDynamic("MacAddress")(__v.asInstanceOf[js.Any]))
      NetworkProfileArn.foreach(__v => __obj.updateDynamic("NetworkProfileArn")(__v.asInstanceOf[js.Any]))
      NetworkProfileName.foreach(__v => __obj.updateDynamic("NetworkProfileName")(__v.asInstanceOf[js.Any]))
      RoomArn.foreach(__v => __obj.updateDynamic("RoomArn")(__v.asInstanceOf[js.Any]))
      RoomName.foreach(__v => __obj.updateDynamic("RoomName")(__v.asInstanceOf[js.Any]))
      SoftwareVersion.foreach(__v => __obj.updateDynamic("SoftwareVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceData]
    }
  }

  /**
    * The list of device events.
    */
  @js.native
  trait DeviceEvent extends js.Object {
    var Timestamp: js.UndefOr[DeviceEventTime]
    var Type: js.UndefOr[DeviceEventType]
    var Value: js.UndefOr[DeviceEventValue]
  }

  object DeviceEvent {
    @inline
    def apply(
        Timestamp: js.UndefOr[DeviceEventTime] = js.undefined,
        Type: js.UndefOr[DeviceEventType] = js.undefined,
        Value: js.UndefOr[DeviceEventValue] = js.undefined
    ): DeviceEvent = {
      val __obj = js.Dynamic.literal()
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceEvent]
    }
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
  trait DeviceNetworkProfileInfo extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
    var CertificateExpirationTime: js.UndefOr[CertificateTime]
    var NetworkProfileArn: js.UndefOr[Arn]
  }

  object DeviceNetworkProfileInfo {
    @inline
    def apply(
        CertificateArn: js.UndefOr[Arn] = js.undefined,
        CertificateExpirationTime: js.UndefOr[CertificateTime] = js.undefined,
        NetworkProfileArn: js.UndefOr[Arn] = js.undefined
    ): DeviceNetworkProfileInfo = {
      val __obj = js.Dynamic.literal()
      CertificateArn.foreach(__v => __obj.updateDynamic("CertificateArn")(__v.asInstanceOf[js.Any]))
      CertificateExpirationTime.foreach(__v =>
        __obj.updateDynamic("CertificateExpirationTime")(__v.asInstanceOf[js.Any])
      )
      NetworkProfileArn.foreach(__v => __obj.updateDynamic("NetworkProfileArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceNetworkProfileInfo]
    }
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
  trait DeviceStatusDetail extends js.Object {
    var Code: js.UndefOr[DeviceStatusDetailCode]
    var Feature: js.UndefOr[Feature]
  }

  object DeviceStatusDetail {
    @inline
    def apply(
        Code: js.UndefOr[DeviceStatusDetailCode] = js.undefined,
        Feature: js.UndefOr[Feature] = js.undefined
    ): DeviceStatusDetail = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Feature.foreach(__v => __obj.updateDynamic("Feature")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceStatusDetail]
    }
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
  trait DeviceStatusInfo extends js.Object {
    var ConnectionStatus: js.UndefOr[ConnectionStatus]
    var ConnectionStatusUpdatedTime: js.UndefOr[ConnectionStatusUpdatedTime]
    var DeviceStatusDetails: js.UndefOr[DeviceStatusDetails]
  }

  object DeviceStatusInfo {
    @inline
    def apply(
        ConnectionStatus: js.UndefOr[ConnectionStatus] = js.undefined,
        ConnectionStatusUpdatedTime: js.UndefOr[ConnectionStatusUpdatedTime] = js.undefined,
        DeviceStatusDetails: js.UndefOr[DeviceStatusDetails] = js.undefined
    ): DeviceStatusInfo = {
      val __obj = js.Dynamic.literal()
      ConnectionStatus.foreach(__v => __obj.updateDynamic("ConnectionStatus")(__v.asInstanceOf[js.Any]))
      ConnectionStatusUpdatedTime.foreach(__v =>
        __obj.updateDynamic("ConnectionStatusUpdatedTime")(__v.asInstanceOf[js.Any])
      )
      DeviceStatusDetails.foreach(__v => __obj.updateDynamic("DeviceStatusDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceStatusInfo]
    }
  }

  @js.native
  sealed trait DeviceUsageType extends js.Any
  object DeviceUsageType extends js.Object {
    val VOICE = "VOICE".asInstanceOf[DeviceUsageType]

    val values = js.Object.freeze(js.Array(VOICE))
  }

  @js.native
  trait DisassociateContactFromAddressBookRequest extends js.Object {
    var AddressBookArn: Arn
    var ContactArn: Arn
  }

  object DisassociateContactFromAddressBookRequest {
    @inline
    def apply(
        AddressBookArn: Arn,
        ContactArn: Arn
    ): DisassociateContactFromAddressBookRequest = {
      val __obj = js.Dynamic.literal(
        "AddressBookArn" -> AddressBookArn.asInstanceOf[js.Any],
        "ContactArn"     -> ContactArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateContactFromAddressBookRequest]
    }
  }

  @js.native
  trait DisassociateContactFromAddressBookResponse extends js.Object {}

  object DisassociateContactFromAddressBookResponse {
    @inline
    def apply(
    ): DisassociateContactFromAddressBookResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateContactFromAddressBookResponse]
    }
  }

  @js.native
  trait DisassociateDeviceFromRoomRequest extends js.Object {
    var DeviceArn: js.UndefOr[Arn]
  }

  object DisassociateDeviceFromRoomRequest {
    @inline
    def apply(
        DeviceArn: js.UndefOr[Arn] = js.undefined
    ): DisassociateDeviceFromRoomRequest = {
      val __obj = js.Dynamic.literal()
      DeviceArn.foreach(__v => __obj.updateDynamic("DeviceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateDeviceFromRoomRequest]
    }
  }

  @js.native
  trait DisassociateDeviceFromRoomResponse extends js.Object {}

  object DisassociateDeviceFromRoomResponse {
    @inline
    def apply(
    ): DisassociateDeviceFromRoomResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateDeviceFromRoomResponse]
    }
  }

  @js.native
  trait DisassociateSkillFromSkillGroupRequest extends js.Object {
    var SkillId: SkillId
    var SkillGroupArn: js.UndefOr[Arn]
  }

  object DisassociateSkillFromSkillGroupRequest {
    @inline
    def apply(
        SkillId: SkillId,
        SkillGroupArn: js.UndefOr[Arn] = js.undefined
    ): DisassociateSkillFromSkillGroupRequest = {
      val __obj = js.Dynamic.literal(
        "SkillId" -> SkillId.asInstanceOf[js.Any]
      )

      SkillGroupArn.foreach(__v => __obj.updateDynamic("SkillGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateSkillFromSkillGroupRequest]
    }
  }

  @js.native
  trait DisassociateSkillFromSkillGroupResponse extends js.Object {}

  object DisassociateSkillFromSkillGroupResponse {
    @inline
    def apply(
    ): DisassociateSkillFromSkillGroupResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateSkillFromSkillGroupResponse]
    }
  }

  @js.native
  trait DisassociateSkillFromUsersRequest extends js.Object {
    var SkillId: SkillId
  }

  object DisassociateSkillFromUsersRequest {
    @inline
    def apply(
        SkillId: SkillId
    ): DisassociateSkillFromUsersRequest = {
      val __obj = js.Dynamic.literal(
        "SkillId" -> SkillId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateSkillFromUsersRequest]
    }
  }

  @js.native
  trait DisassociateSkillFromUsersResponse extends js.Object {}

  object DisassociateSkillFromUsersResponse {
    @inline
    def apply(
    ): DisassociateSkillFromUsersResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateSkillFromUsersResponse]
    }
  }

  @js.native
  trait DisassociateSkillGroupFromRoomRequest extends js.Object {
    var RoomArn: js.UndefOr[Arn]
    var SkillGroupArn: js.UndefOr[Arn]
  }

  object DisassociateSkillGroupFromRoomRequest {
    @inline
    def apply(
        RoomArn: js.UndefOr[Arn] = js.undefined,
        SkillGroupArn: js.UndefOr[Arn] = js.undefined
    ): DisassociateSkillGroupFromRoomRequest = {
      val __obj = js.Dynamic.literal()
      RoomArn.foreach(__v => __obj.updateDynamic("RoomArn")(__v.asInstanceOf[js.Any]))
      SkillGroupArn.foreach(__v => __obj.updateDynamic("SkillGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateSkillGroupFromRoomRequest]
    }
  }

  @js.native
  trait DisassociateSkillGroupFromRoomResponse extends js.Object {}

  object DisassociateSkillGroupFromRoomResponse {
    @inline
    def apply(
    ): DisassociateSkillGroupFromRoomResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateSkillGroupFromRoomResponse]
    }
  }

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
  trait EndOfMeetingReminder extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var ReminderAtMinutes: js.UndefOr[EndOfMeetingReminderMinutesList]
    var ReminderType: js.UndefOr[EndOfMeetingReminderType]
  }

  object EndOfMeetingReminder {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined,
        ReminderAtMinutes: js.UndefOr[EndOfMeetingReminderMinutesList] = js.undefined,
        ReminderType: js.UndefOr[EndOfMeetingReminderType] = js.undefined
    ): EndOfMeetingReminder = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      ReminderAtMinutes.foreach(__v => __obj.updateDynamic("ReminderAtMinutes")(__v.asInstanceOf[js.Any]))
      ReminderType.foreach(__v => __obj.updateDynamic("ReminderType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndOfMeetingReminder]
    }
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
  trait Filter extends js.Object {
    var Key: FilterKey
    var Values: FilterValueList
  }

  object Filter {
    @inline
    def apply(
        Key: FilterKey,
        Values: FilterValueList
    ): Filter = {
      val __obj = js.Dynamic.literal(
        "Key"    -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Filter]
    }
  }

  @js.native
  trait ForgetSmartHomeAppliancesRequest extends js.Object {
    var RoomArn: Arn
  }

  object ForgetSmartHomeAppliancesRequest {
    @inline
    def apply(
        RoomArn: Arn
    ): ForgetSmartHomeAppliancesRequest = {
      val __obj = js.Dynamic.literal(
        "RoomArn" -> RoomArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ForgetSmartHomeAppliancesRequest]
    }
  }

  @js.native
  trait ForgetSmartHomeAppliancesResponse extends js.Object {}

  object ForgetSmartHomeAppliancesResponse {
    @inline
    def apply(
    ): ForgetSmartHomeAppliancesResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ForgetSmartHomeAppliancesResponse]
    }
  }

  /**
    * The details of the gateway.
    */
  @js.native
  trait Gateway extends js.Object {
    var Arn: js.UndefOr[Arn]
    var Description: js.UndefOr[GatewayDescription]
    var GatewayGroupArn: js.UndefOr[Arn]
    var Name: js.UndefOr[GatewayName]
    var SoftwareVersion: js.UndefOr[GatewayVersion]
  }

  object Gateway {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[GatewayDescription] = js.undefined,
        GatewayGroupArn: js.UndefOr[Arn] = js.undefined,
        Name: js.UndefOr[GatewayName] = js.undefined,
        SoftwareVersion: js.UndefOr[GatewayVersion] = js.undefined
    ): Gateway = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      GatewayGroupArn.foreach(__v => __obj.updateDynamic("GatewayGroupArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SoftwareVersion.foreach(__v => __obj.updateDynamic("SoftwareVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Gateway]
    }
  }

  /**
    * The details of the gateway group.
    */
  @js.native
  trait GatewayGroup extends js.Object {
    var Arn: js.UndefOr[Arn]
    var Description: js.UndefOr[GatewayGroupDescription]
    var Name: js.UndefOr[GatewayGroupName]
  }

  object GatewayGroup {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[GatewayGroupDescription] = js.undefined,
        Name: js.UndefOr[GatewayGroupName] = js.undefined
    ): GatewayGroup = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GatewayGroup]
    }
  }

  /**
    * The summary of a gateway group.
    */
  @js.native
  trait GatewayGroupSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var Description: js.UndefOr[GatewayGroupDescription]
    var Name: js.UndefOr[GatewayGroupName]
  }

  object GatewayGroupSummary {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[GatewayGroupDescription] = js.undefined,
        Name: js.UndefOr[GatewayGroupName] = js.undefined
    ): GatewayGroupSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GatewayGroupSummary]
    }
  }

  /**
    * The summary of a gateway.
    */
  @js.native
  trait GatewaySummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var Description: js.UndefOr[GatewayDescription]
    var GatewayGroupArn: js.UndefOr[Arn]
    var Name: js.UndefOr[GatewayName]
    var SoftwareVersion: js.UndefOr[GatewayVersion]
  }

  object GatewaySummary {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[GatewayDescription] = js.undefined,
        GatewayGroupArn: js.UndefOr[Arn] = js.undefined,
        Name: js.UndefOr[GatewayName] = js.undefined,
        SoftwareVersion: js.UndefOr[GatewayVersion] = js.undefined
    ): GatewaySummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      GatewayGroupArn.foreach(__v => __obj.updateDynamic("GatewayGroupArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SoftwareVersion.foreach(__v => __obj.updateDynamic("SoftwareVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GatewaySummary]
    }
  }

  @js.native
  trait GetAddressBookRequest extends js.Object {
    var AddressBookArn: Arn
  }

  object GetAddressBookRequest {
    @inline
    def apply(
        AddressBookArn: Arn
    ): GetAddressBookRequest = {
      val __obj = js.Dynamic.literal(
        "AddressBookArn" -> AddressBookArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAddressBookRequest]
    }
  }

  @js.native
  trait GetAddressBookResponse extends js.Object {
    var AddressBook: js.UndefOr[AddressBook]
  }

  object GetAddressBookResponse {
    @inline
    def apply(
        AddressBook: js.UndefOr[AddressBook] = js.undefined
    ): GetAddressBookResponse = {
      val __obj = js.Dynamic.literal()
      AddressBook.foreach(__v => __obj.updateDynamic("AddressBook")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAddressBookResponse]
    }
  }

  @js.native
  trait GetConferencePreferenceRequest extends js.Object {}

  object GetConferencePreferenceRequest {
    @inline
    def apply(
    ): GetConferencePreferenceRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GetConferencePreferenceRequest]
    }
  }

  @js.native
  trait GetConferencePreferenceResponse extends js.Object {
    var Preference: js.UndefOr[ConferencePreference]
  }

  object GetConferencePreferenceResponse {
    @inline
    def apply(
        Preference: js.UndefOr[ConferencePreference] = js.undefined
    ): GetConferencePreferenceResponse = {
      val __obj = js.Dynamic.literal()
      Preference.foreach(__v => __obj.updateDynamic("Preference")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConferencePreferenceResponse]
    }
  }

  @js.native
  trait GetConferenceProviderRequest extends js.Object {
    var ConferenceProviderArn: Arn
  }

  object GetConferenceProviderRequest {
    @inline
    def apply(
        ConferenceProviderArn: Arn
    ): GetConferenceProviderRequest = {
      val __obj = js.Dynamic.literal(
        "ConferenceProviderArn" -> ConferenceProviderArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetConferenceProviderRequest]
    }
  }

  @js.native
  trait GetConferenceProviderResponse extends js.Object {
    var ConferenceProvider: js.UndefOr[ConferenceProvider]
  }

  object GetConferenceProviderResponse {
    @inline
    def apply(
        ConferenceProvider: js.UndefOr[ConferenceProvider] = js.undefined
    ): GetConferenceProviderResponse = {
      val __obj = js.Dynamic.literal()
      ConferenceProvider.foreach(__v => __obj.updateDynamic("ConferenceProvider")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConferenceProviderResponse]
    }
  }

  @js.native
  trait GetContactRequest extends js.Object {
    var ContactArn: Arn
  }

  object GetContactRequest {
    @inline
    def apply(
        ContactArn: Arn
    ): GetContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactArn" -> ContactArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetContactRequest]
    }
  }

  @js.native
  trait GetContactResponse extends js.Object {
    var Contact: js.UndefOr[Contact]
  }

  object GetContactResponse {
    @inline
    def apply(
        Contact: js.UndefOr[Contact] = js.undefined
    ): GetContactResponse = {
      val __obj = js.Dynamic.literal()
      Contact.foreach(__v => __obj.updateDynamic("Contact")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetContactResponse]
    }
  }

  @js.native
  trait GetDeviceRequest extends js.Object {
    var DeviceArn: js.UndefOr[Arn]
  }

  object GetDeviceRequest {
    @inline
    def apply(
        DeviceArn: js.UndefOr[Arn] = js.undefined
    ): GetDeviceRequest = {
      val __obj = js.Dynamic.literal()
      DeviceArn.foreach(__v => __obj.updateDynamic("DeviceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeviceRequest]
    }
  }

  @js.native
  trait GetDeviceResponse extends js.Object {
    var Device: js.UndefOr[Device]
  }

  object GetDeviceResponse {
    @inline
    def apply(
        Device: js.UndefOr[Device] = js.undefined
    ): GetDeviceResponse = {
      val __obj = js.Dynamic.literal()
      Device.foreach(__v => __obj.updateDynamic("Device")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeviceResponse]
    }
  }

  @js.native
  trait GetGatewayGroupRequest extends js.Object {
    var GatewayGroupArn: Arn
  }

  object GetGatewayGroupRequest {
    @inline
    def apply(
        GatewayGroupArn: Arn
    ): GetGatewayGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GatewayGroupArn" -> GatewayGroupArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetGatewayGroupRequest]
    }
  }

  @js.native
  trait GetGatewayGroupResponse extends js.Object {
    var GatewayGroup: js.UndefOr[GatewayGroup]
  }

  object GetGatewayGroupResponse {
    @inline
    def apply(
        GatewayGroup: js.UndefOr[GatewayGroup] = js.undefined
    ): GetGatewayGroupResponse = {
      val __obj = js.Dynamic.literal()
      GatewayGroup.foreach(__v => __obj.updateDynamic("GatewayGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGatewayGroupResponse]
    }
  }

  @js.native
  trait GetGatewayRequest extends js.Object {
    var GatewayArn: Arn
  }

  object GetGatewayRequest {
    @inline
    def apply(
        GatewayArn: Arn
    ): GetGatewayRequest = {
      val __obj = js.Dynamic.literal(
        "GatewayArn" -> GatewayArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetGatewayRequest]
    }
  }

  @js.native
  trait GetGatewayResponse extends js.Object {
    var Gateway: js.UndefOr[Gateway]
  }

  object GetGatewayResponse {
    @inline
    def apply(
        Gateway: js.UndefOr[Gateway] = js.undefined
    ): GetGatewayResponse = {
      val __obj = js.Dynamic.literal()
      Gateway.foreach(__v => __obj.updateDynamic("Gateway")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGatewayResponse]
    }
  }

  @js.native
  trait GetInvitationConfigurationRequest extends js.Object {}

  object GetInvitationConfigurationRequest {
    @inline
    def apply(
    ): GetInvitationConfigurationRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GetInvitationConfigurationRequest]
    }
  }

  @js.native
  trait GetInvitationConfigurationResponse extends js.Object {
    var ContactEmail: js.UndefOr[Email]
    var OrganizationName: js.UndefOr[OrganizationName]
    var PrivateSkillIds: js.UndefOr[ShortSkillIdList]
  }

  object GetInvitationConfigurationResponse {
    @inline
    def apply(
        ContactEmail: js.UndefOr[Email] = js.undefined,
        OrganizationName: js.UndefOr[OrganizationName] = js.undefined,
        PrivateSkillIds: js.UndefOr[ShortSkillIdList] = js.undefined
    ): GetInvitationConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      ContactEmail.foreach(__v => __obj.updateDynamic("ContactEmail")(__v.asInstanceOf[js.Any]))
      OrganizationName.foreach(__v => __obj.updateDynamic("OrganizationName")(__v.asInstanceOf[js.Any]))
      PrivateSkillIds.foreach(__v => __obj.updateDynamic("PrivateSkillIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInvitationConfigurationResponse]
    }
  }

  @js.native
  trait GetNetworkProfileRequest extends js.Object {
    var NetworkProfileArn: Arn
  }

  object GetNetworkProfileRequest {
    @inline
    def apply(
        NetworkProfileArn: Arn
    ): GetNetworkProfileRequest = {
      val __obj = js.Dynamic.literal(
        "NetworkProfileArn" -> NetworkProfileArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetNetworkProfileRequest]
    }
  }

  @js.native
  trait GetNetworkProfileResponse extends js.Object {
    var NetworkProfile: js.UndefOr[NetworkProfile]
  }

  object GetNetworkProfileResponse {
    @inline
    def apply(
        NetworkProfile: js.UndefOr[NetworkProfile] = js.undefined
    ): GetNetworkProfileResponse = {
      val __obj = js.Dynamic.literal()
      NetworkProfile.foreach(__v => __obj.updateDynamic("NetworkProfile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNetworkProfileResponse]
    }
  }

  @js.native
  trait GetProfileRequest extends js.Object {
    var ProfileArn: js.UndefOr[Arn]
  }

  object GetProfileRequest {
    @inline
    def apply(
        ProfileArn: js.UndefOr[Arn] = js.undefined
    ): GetProfileRequest = {
      val __obj = js.Dynamic.literal()
      ProfileArn.foreach(__v => __obj.updateDynamic("ProfileArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProfileRequest]
    }
  }

  @js.native
  trait GetProfileResponse extends js.Object {
    var Profile: js.UndefOr[Profile]
  }

  object GetProfileResponse {
    @inline
    def apply(
        Profile: js.UndefOr[Profile] = js.undefined
    ): GetProfileResponse = {
      val __obj = js.Dynamic.literal()
      Profile.foreach(__v => __obj.updateDynamic("Profile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProfileResponse]
    }
  }

  @js.native
  trait GetRoomRequest extends js.Object {
    var RoomArn: js.UndefOr[Arn]
  }

  object GetRoomRequest {
    @inline
    def apply(
        RoomArn: js.UndefOr[Arn] = js.undefined
    ): GetRoomRequest = {
      val __obj = js.Dynamic.literal()
      RoomArn.foreach(__v => __obj.updateDynamic("RoomArn")(__v.asInstanceOf[js.Any]))
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
  trait GetRoomSkillParameterRequest extends js.Object {
    var ParameterKey: RoomSkillParameterKey
    var SkillId: SkillId
    var RoomArn: js.UndefOr[Arn]
  }

  object GetRoomSkillParameterRequest {
    @inline
    def apply(
        ParameterKey: RoomSkillParameterKey,
        SkillId: SkillId,
        RoomArn: js.UndefOr[Arn] = js.undefined
    ): GetRoomSkillParameterRequest = {
      val __obj = js.Dynamic.literal(
        "ParameterKey" -> ParameterKey.asInstanceOf[js.Any],
        "SkillId"      -> SkillId.asInstanceOf[js.Any]
      )

      RoomArn.foreach(__v => __obj.updateDynamic("RoomArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRoomSkillParameterRequest]
    }
  }

  @js.native
  trait GetRoomSkillParameterResponse extends js.Object {
    var RoomSkillParameter: js.UndefOr[RoomSkillParameter]
  }

  object GetRoomSkillParameterResponse {
    @inline
    def apply(
        RoomSkillParameter: js.UndefOr[RoomSkillParameter] = js.undefined
    ): GetRoomSkillParameterResponse = {
      val __obj = js.Dynamic.literal()
      RoomSkillParameter.foreach(__v => __obj.updateDynamic("RoomSkillParameter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRoomSkillParameterResponse]
    }
  }

  @js.native
  trait GetSkillGroupRequest extends js.Object {
    var SkillGroupArn: js.UndefOr[Arn]
  }

  object GetSkillGroupRequest {
    @inline
    def apply(
        SkillGroupArn: js.UndefOr[Arn] = js.undefined
    ): GetSkillGroupRequest = {
      val __obj = js.Dynamic.literal()
      SkillGroupArn.foreach(__v => __obj.updateDynamic("SkillGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSkillGroupRequest]
    }
  }

  @js.native
  trait GetSkillGroupResponse extends js.Object {
    var SkillGroup: js.UndefOr[SkillGroup]
  }

  object GetSkillGroupResponse {
    @inline
    def apply(
        SkillGroup: js.UndefOr[SkillGroup] = js.undefined
    ): GetSkillGroupResponse = {
      val __obj = js.Dynamic.literal()
      SkillGroup.foreach(__v => __obj.updateDynamic("SkillGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSkillGroupResponse]
    }
  }

  /**
    * The IP endpoint and protocol for calling.
    */
  @js.native
  trait IPDialIn extends js.Object {
    var CommsProtocol: CommsProtocol
    var Endpoint: Endpoint
  }

  object IPDialIn {
    @inline
    def apply(
        CommsProtocol: CommsProtocol,
        Endpoint: Endpoint
    ): IPDialIn = {
      val __obj = js.Dynamic.literal(
        "CommsProtocol" -> CommsProtocol.asInstanceOf[js.Any],
        "Endpoint"      -> Endpoint.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[IPDialIn]
    }
  }

  /**
    * Settings for the instant booking feature that are applied to a room profile. When users start their meeting with Alexa, Alexa automatically books the room for the configured duration if the room is available.
    */
  @js.native
  trait InstantBooking extends js.Object {
    var DurationInMinutes: js.UndefOr[Minutes]
    var Enabled: js.UndefOr[Boolean]
  }

  object InstantBooking {
    @inline
    def apply(
        DurationInMinutes: js.UndefOr[Minutes] = js.undefined,
        Enabled: js.UndefOr[Boolean] = js.undefined
    ): InstantBooking = {
      val __obj = js.Dynamic.literal()
      DurationInMinutes.foreach(__v => __obj.updateDynamic("DurationInMinutes")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstantBooking]
    }
  }

  @js.native
  trait ListBusinessReportSchedulesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListBusinessReportSchedulesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBusinessReportSchedulesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBusinessReportSchedulesRequest]
    }
  }

  @js.native
  trait ListBusinessReportSchedulesResponse extends js.Object {
    var BusinessReportSchedules: js.UndefOr[BusinessReportScheduleList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListBusinessReportSchedulesResponse {
    @inline
    def apply(
        BusinessReportSchedules: js.UndefOr[BusinessReportScheduleList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBusinessReportSchedulesResponse = {
      val __obj = js.Dynamic.literal()
      BusinessReportSchedules.foreach(__v => __obj.updateDynamic("BusinessReportSchedules")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBusinessReportSchedulesResponse]
    }
  }

  @js.native
  trait ListConferenceProvidersRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConferenceProvidersRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConferenceProvidersRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConferenceProvidersRequest]
    }
  }

  @js.native
  trait ListConferenceProvidersResponse extends js.Object {
    var ConferenceProviders: js.UndefOr[ConferenceProvidersList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConferenceProvidersResponse {
    @inline
    def apply(
        ConferenceProviders: js.UndefOr[ConferenceProvidersList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConferenceProvidersResponse = {
      val __obj = js.Dynamic.literal()
      ConferenceProviders.foreach(__v => __obj.updateDynamic("ConferenceProviders")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConferenceProvidersResponse]
    }
  }

  @js.native
  trait ListDeviceEventsRequest extends js.Object {
    var DeviceArn: Arn
    var EventType: js.UndefOr[DeviceEventType]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDeviceEventsRequest {
    @inline
    def apply(
        DeviceArn: Arn,
        EventType: js.UndefOr[DeviceEventType] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeviceEventsRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceArn" -> DeviceArn.asInstanceOf[js.Any]
      )

      EventType.foreach(__v => __obj.updateDynamic("EventType")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeviceEventsRequest]
    }
  }

  @js.native
  trait ListDeviceEventsResponse extends js.Object {
    var DeviceEvents: js.UndefOr[DeviceEventList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDeviceEventsResponse {
    @inline
    def apply(
        DeviceEvents: js.UndefOr[DeviceEventList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeviceEventsResponse = {
      val __obj = js.Dynamic.literal()
      DeviceEvents.foreach(__v => __obj.updateDynamic("DeviceEvents")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeviceEventsResponse]
    }
  }

  @js.native
  trait ListGatewayGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGatewayGroupsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGatewayGroupsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGatewayGroupsRequest]
    }
  }

  @js.native
  trait ListGatewayGroupsResponse extends js.Object {
    var GatewayGroups: js.UndefOr[GatewayGroupSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGatewayGroupsResponse {
    @inline
    def apply(
        GatewayGroups: js.UndefOr[GatewayGroupSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGatewayGroupsResponse = {
      val __obj = js.Dynamic.literal()
      GatewayGroups.foreach(__v => __obj.updateDynamic("GatewayGroups")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGatewayGroupsResponse]
    }
  }

  @js.native
  trait ListGatewaysRequest extends js.Object {
    var GatewayGroupArn: js.UndefOr[Arn]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGatewaysRequest {
    @inline
    def apply(
        GatewayGroupArn: js.UndefOr[Arn] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGatewaysRequest = {
      val __obj = js.Dynamic.literal()
      GatewayGroupArn.foreach(__v => __obj.updateDynamic("GatewayGroupArn")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGatewaysRequest]
    }
  }

  @js.native
  trait ListGatewaysResponse extends js.Object {
    var Gateways: js.UndefOr[GatewaySummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGatewaysResponse {
    @inline
    def apply(
        Gateways: js.UndefOr[GatewaySummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGatewaysResponse = {
      val __obj = js.Dynamic.literal()
      Gateways.foreach(__v => __obj.updateDynamic("Gateways")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGatewaysResponse]
    }
  }

  @js.native
  trait ListSkillsRequest extends js.Object {
    var EnablementType: js.UndefOr[EnablementTypeFilter]
    var MaxResults: js.UndefOr[SkillListMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SkillGroupArn: js.UndefOr[Arn]
    var SkillType: js.UndefOr[SkillTypeFilter]
  }

  object ListSkillsRequest {
    @inline
    def apply(
        EnablementType: js.UndefOr[EnablementTypeFilter] = js.undefined,
        MaxResults: js.UndefOr[SkillListMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SkillGroupArn: js.UndefOr[Arn] = js.undefined,
        SkillType: js.UndefOr[SkillTypeFilter] = js.undefined
    ): ListSkillsRequest = {
      val __obj = js.Dynamic.literal()
      EnablementType.foreach(__v => __obj.updateDynamic("EnablementType")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SkillGroupArn.foreach(__v => __obj.updateDynamic("SkillGroupArn")(__v.asInstanceOf[js.Any]))
      SkillType.foreach(__v => __obj.updateDynamic("SkillType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSkillsRequest]
    }
  }

  @js.native
  trait ListSkillsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SkillSummaries: js.UndefOr[SkillSummaryList]
  }

  object ListSkillsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SkillSummaries: js.UndefOr[SkillSummaryList] = js.undefined
    ): ListSkillsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SkillSummaries.foreach(__v => __obj.updateDynamic("SkillSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSkillsResponse]
    }
  }

  @js.native
  trait ListSkillsStoreCategoriesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSkillsStoreCategoriesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSkillsStoreCategoriesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSkillsStoreCategoriesRequest]
    }
  }

  @js.native
  trait ListSkillsStoreCategoriesResponse extends js.Object {
    var CategoryList: js.UndefOr[CategoryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSkillsStoreCategoriesResponse {
    @inline
    def apply(
        CategoryList: js.UndefOr[CategoryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSkillsStoreCategoriesResponse = {
      val __obj = js.Dynamic.literal()
      CategoryList.foreach(__v => __obj.updateDynamic("CategoryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSkillsStoreCategoriesResponse]
    }
  }

  @js.native
  trait ListSkillsStoreSkillsByCategoryRequest extends js.Object {
    var CategoryId: CategoryId
    var MaxResults: js.UndefOr[SkillListMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSkillsStoreSkillsByCategoryRequest {
    @inline
    def apply(
        CategoryId: CategoryId,
        MaxResults: js.UndefOr[SkillListMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSkillsStoreSkillsByCategoryRequest = {
      val __obj = js.Dynamic.literal(
        "CategoryId" -> CategoryId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSkillsStoreSkillsByCategoryRequest]
    }
  }

  @js.native
  trait ListSkillsStoreSkillsByCategoryResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SkillsStoreSkills: js.UndefOr[SkillsStoreSkillList]
  }

  object ListSkillsStoreSkillsByCategoryResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SkillsStoreSkills: js.UndefOr[SkillsStoreSkillList] = js.undefined
    ): ListSkillsStoreSkillsByCategoryResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SkillsStoreSkills.foreach(__v => __obj.updateDynamic("SkillsStoreSkills")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSkillsStoreSkillsByCategoryResponse]
    }
  }

  @js.native
  trait ListSmartHomeAppliancesRequest extends js.Object {
    var RoomArn: Arn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSmartHomeAppliancesRequest {
    @inline
    def apply(
        RoomArn: Arn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSmartHomeAppliancesRequest = {
      val __obj = js.Dynamic.literal(
        "RoomArn" -> RoomArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSmartHomeAppliancesRequest]
    }
  }

  @js.native
  trait ListSmartHomeAppliancesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SmartHomeAppliances: js.UndefOr[SmartHomeApplianceList]
  }

  object ListSmartHomeAppliancesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SmartHomeAppliances: js.UndefOr[SmartHomeApplianceList] = js.undefined
    ): ListSmartHomeAppliancesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SmartHomeAppliances.foreach(__v => __obj.updateDynamic("SmartHomeAppliances")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSmartHomeAppliancesResponse]
    }
  }

  @js.native
  trait ListTagsRequest extends js.Object {
    var Arn: Arn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsRequest {
    @inline
    def apply(
        Arn: Arn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsRequest]
    }
  }

  @js.native
  trait ListTagsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsResponse]
    }
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
  trait MeetingRoomConfiguration extends js.Object {
    var EndOfMeetingReminder: js.UndefOr[EndOfMeetingReminder]
    var InstantBooking: js.UndefOr[InstantBooking]
    var RequireCheckIn: js.UndefOr[RequireCheckIn]
    var RoomUtilizationMetricsEnabled: js.UndefOr[Boolean]
  }

  object MeetingRoomConfiguration {
    @inline
    def apply(
        EndOfMeetingReminder: js.UndefOr[EndOfMeetingReminder] = js.undefined,
        InstantBooking: js.UndefOr[InstantBooking] = js.undefined,
        RequireCheckIn: js.UndefOr[RequireCheckIn] = js.undefined,
        RoomUtilizationMetricsEnabled: js.UndefOr[Boolean] = js.undefined
    ): MeetingRoomConfiguration = {
      val __obj = js.Dynamic.literal()
      EndOfMeetingReminder.foreach(__v => __obj.updateDynamic("EndOfMeetingReminder")(__v.asInstanceOf[js.Any]))
      InstantBooking.foreach(__v => __obj.updateDynamic("InstantBooking")(__v.asInstanceOf[js.Any]))
      RequireCheckIn.foreach(__v => __obj.updateDynamic("RequireCheckIn")(__v.asInstanceOf[js.Any]))
      RoomUtilizationMetricsEnabled.foreach(__v =>
        __obj.updateDynamic("RoomUtilizationMetricsEnabled")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[MeetingRoomConfiguration]
    }
  }

  /**
    * The values that indicate whether a pin is always required (YES), never required (NO), or OPTIONAL.
    * * If YES, Alexa will always ask for a meeting pin.
    *  * If NO, Alexa will never ask for a meeting pin.
    *  * If OPTIONAL, Alexa will ask if you have a meeting pin and if the customer responds with yes, it will ask for the meeting pin.
    */
  @js.native
  trait MeetingSetting extends js.Object {
    var RequirePin: RequirePin
  }

  object MeetingSetting {
    @inline
    def apply(
        RequirePin: RequirePin
    ): MeetingSetting = {
      val __obj = js.Dynamic.literal(
        "RequirePin" -> RequirePin.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MeetingSetting]
    }
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

  object NetworkProfile {
    @inline
    def apply(
        CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
        CurrentPassword: js.UndefOr[CurrentWiFiPassword] = js.undefined,
        Description: js.UndefOr[NetworkProfileDescription] = js.undefined,
        EapMethod: js.UndefOr[NetworkEapMethod] = js.undefined,
        NetworkProfileArn: js.UndefOr[Arn] = js.undefined,
        NetworkProfileName: js.UndefOr[NetworkProfileName] = js.undefined,
        NextPassword: js.UndefOr[NextWiFiPassword] = js.undefined,
        SecurityType: js.UndefOr[NetworkSecurityType] = js.undefined,
        Ssid: js.UndefOr[NetworkSsid] = js.undefined,
        TrustAnchors: js.UndefOr[TrustAnchorList] = js.undefined
    ): NetworkProfile = {
      val __obj = js.Dynamic.literal()
      CertificateAuthorityArn.foreach(__v => __obj.updateDynamic("CertificateAuthorityArn")(__v.asInstanceOf[js.Any]))
      CurrentPassword.foreach(__v => __obj.updateDynamic("CurrentPassword")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EapMethod.foreach(__v => __obj.updateDynamic("EapMethod")(__v.asInstanceOf[js.Any]))
      NetworkProfileArn.foreach(__v => __obj.updateDynamic("NetworkProfileArn")(__v.asInstanceOf[js.Any]))
      NetworkProfileName.foreach(__v => __obj.updateDynamic("NetworkProfileName")(__v.asInstanceOf[js.Any]))
      NextPassword.foreach(__v => __obj.updateDynamic("NextPassword")(__v.asInstanceOf[js.Any]))
      SecurityType.foreach(__v => __obj.updateDynamic("SecurityType")(__v.asInstanceOf[js.Any]))
      Ssid.foreach(__v => __obj.updateDynamic("Ssid")(__v.asInstanceOf[js.Any]))
      TrustAnchors.foreach(__v => __obj.updateDynamic("TrustAnchors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkProfile]
    }
  }

  /**
    * The data associated with a network profile.
    */
  @js.native
  trait NetworkProfileData extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var Description: js.UndefOr[NetworkProfileDescription]
    var EapMethod: js.UndefOr[NetworkEapMethod]
    var NetworkProfileArn: js.UndefOr[Arn]
    var NetworkProfileName: js.UndefOr[NetworkProfileName]
    var SecurityType: js.UndefOr[NetworkSecurityType]
    var Ssid: js.UndefOr[NetworkSsid]
  }

  object NetworkProfileData {
    @inline
    def apply(
        CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[NetworkProfileDescription] = js.undefined,
        EapMethod: js.UndefOr[NetworkEapMethod] = js.undefined,
        NetworkProfileArn: js.UndefOr[Arn] = js.undefined,
        NetworkProfileName: js.UndefOr[NetworkProfileName] = js.undefined,
        SecurityType: js.UndefOr[NetworkSecurityType] = js.undefined,
        Ssid: js.UndefOr[NetworkSsid] = js.undefined
    ): NetworkProfileData = {
      val __obj = js.Dynamic.literal()
      CertificateAuthorityArn.foreach(__v => __obj.updateDynamic("CertificateAuthorityArn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EapMethod.foreach(__v => __obj.updateDynamic("EapMethod")(__v.asInstanceOf[js.Any]))
      NetworkProfileArn.foreach(__v => __obj.updateDynamic("NetworkProfileArn")(__v.asInstanceOf[js.Any]))
      NetworkProfileName.foreach(__v => __obj.updateDynamic("NetworkProfileName")(__v.asInstanceOf[js.Any]))
      SecurityType.foreach(__v => __obj.updateDynamic("SecurityType")(__v.asInstanceOf[js.Any]))
      Ssid.foreach(__v => __obj.updateDynamic("Ssid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkProfileData]
    }
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
  trait PSTNDialIn extends js.Object {
    var CountryCode: CountryCode
    var OneClickIdDelay: OneClickIdDelay
    var OneClickPinDelay: OneClickPinDelay
    var PhoneNumber: OutboundPhoneNumber
  }

  object PSTNDialIn {
    @inline
    def apply(
        CountryCode: CountryCode,
        OneClickIdDelay: OneClickIdDelay,
        OneClickPinDelay: OneClickPinDelay,
        PhoneNumber: OutboundPhoneNumber
    ): PSTNDialIn = {
      val __obj = js.Dynamic.literal(
        "CountryCode"      -> CountryCode.asInstanceOf[js.Any],
        "OneClickIdDelay"  -> OneClickIdDelay.asInstanceOf[js.Any],
        "OneClickPinDelay" -> OneClickPinDelay.asInstanceOf[js.Any],
        "PhoneNumber"      -> PhoneNumber.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PSTNDialIn]
    }
  }

  /**
    * The phone number for the contact containing the raw number and phone number type.
    */
  @js.native
  trait PhoneNumber extends js.Object {
    var Number: RawPhoneNumber
    var Type: PhoneNumberType
  }

  object PhoneNumber {
    @inline
    def apply(
        Number: RawPhoneNumber,
        Type: PhoneNumberType
    ): PhoneNumber = {
      val __obj = js.Dynamic.literal(
        "Number" -> Number.asInstanceOf[js.Any],
        "Type"   -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PhoneNumber]
    }
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

  object Profile {
    @inline
    def apply(
        Address: js.UndefOr[Address] = js.undefined,
        AddressBookArn: js.UndefOr[Arn] = js.undefined,
        DistanceUnit: js.UndefOr[DistanceUnit] = js.undefined,
        IsDefault: js.UndefOr[Boolean] = js.undefined,
        Locale: js.UndefOr[DeviceLocale] = js.undefined,
        MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined,
        MeetingRoomConfiguration: js.UndefOr[MeetingRoomConfiguration] = js.undefined,
        PSTNEnabled: js.UndefOr[Boolean] = js.undefined,
        ProfileArn: js.UndefOr[Arn] = js.undefined,
        ProfileName: js.UndefOr[ProfileName] = js.undefined,
        SetupModeDisabled: js.UndefOr[Boolean] = js.undefined,
        TemperatureUnit: js.UndefOr[TemperatureUnit] = js.undefined,
        Timezone: js.UndefOr[Timezone] = js.undefined,
        WakeWord: js.UndefOr[WakeWord] = js.undefined
    ): Profile = {
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      AddressBookArn.foreach(__v => __obj.updateDynamic("AddressBookArn")(__v.asInstanceOf[js.Any]))
      DistanceUnit.foreach(__v => __obj.updateDynamic("DistanceUnit")(__v.asInstanceOf[js.Any]))
      IsDefault.foreach(__v => __obj.updateDynamic("IsDefault")(__v.asInstanceOf[js.Any]))
      Locale.foreach(__v => __obj.updateDynamic("Locale")(__v.asInstanceOf[js.Any]))
      MaxVolumeLimit.foreach(__v => __obj.updateDynamic("MaxVolumeLimit")(__v.asInstanceOf[js.Any]))
      MeetingRoomConfiguration.foreach(__v => __obj.updateDynamic("MeetingRoomConfiguration")(__v.asInstanceOf[js.Any]))
      PSTNEnabled.foreach(__v => __obj.updateDynamic("PSTNEnabled")(__v.asInstanceOf[js.Any]))
      ProfileArn.foreach(__v => __obj.updateDynamic("ProfileArn")(__v.asInstanceOf[js.Any]))
      ProfileName.foreach(__v => __obj.updateDynamic("ProfileName")(__v.asInstanceOf[js.Any]))
      SetupModeDisabled.foreach(__v => __obj.updateDynamic("SetupModeDisabled")(__v.asInstanceOf[js.Any]))
      TemperatureUnit.foreach(__v => __obj.updateDynamic("TemperatureUnit")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      WakeWord.foreach(__v => __obj.updateDynamic("WakeWord")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Profile]
    }
  }

  /**
    * The data of a room profile.
    */
  @js.native
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

  object ProfileData {
    @inline
    def apply(
        Address: js.UndefOr[Address] = js.undefined,
        DistanceUnit: js.UndefOr[DistanceUnit] = js.undefined,
        IsDefault: js.UndefOr[Boolean] = js.undefined,
        Locale: js.UndefOr[DeviceLocale] = js.undefined,
        ProfileArn: js.UndefOr[Arn] = js.undefined,
        ProfileName: js.UndefOr[ProfileName] = js.undefined,
        TemperatureUnit: js.UndefOr[TemperatureUnit] = js.undefined,
        Timezone: js.UndefOr[Timezone] = js.undefined,
        WakeWord: js.UndefOr[WakeWord] = js.undefined
    ): ProfileData = {
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      DistanceUnit.foreach(__v => __obj.updateDynamic("DistanceUnit")(__v.asInstanceOf[js.Any]))
      IsDefault.foreach(__v => __obj.updateDynamic("IsDefault")(__v.asInstanceOf[js.Any]))
      Locale.foreach(__v => __obj.updateDynamic("Locale")(__v.asInstanceOf[js.Any]))
      ProfileArn.foreach(__v => __obj.updateDynamic("ProfileArn")(__v.asInstanceOf[js.Any]))
      ProfileName.foreach(__v => __obj.updateDynamic("ProfileName")(__v.asInstanceOf[js.Any]))
      TemperatureUnit.foreach(__v => __obj.updateDynamic("TemperatureUnit")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      WakeWord.foreach(__v => __obj.updateDynamic("WakeWord")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProfileData]
    }
  }

  @js.native
  trait PutConferencePreferenceRequest extends js.Object {
    var ConferencePreference: ConferencePreference
  }

  object PutConferencePreferenceRequest {
    @inline
    def apply(
        ConferencePreference: ConferencePreference
    ): PutConferencePreferenceRequest = {
      val __obj = js.Dynamic.literal(
        "ConferencePreference" -> ConferencePreference.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutConferencePreferenceRequest]
    }
  }

  @js.native
  trait PutConferencePreferenceResponse extends js.Object {}

  object PutConferencePreferenceResponse {
    @inline
    def apply(
    ): PutConferencePreferenceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutConferencePreferenceResponse]
    }
  }

  @js.native
  trait PutInvitationConfigurationRequest extends js.Object {
    var OrganizationName: OrganizationName
    var ContactEmail: js.UndefOr[Email]
    var PrivateSkillIds: js.UndefOr[ShortSkillIdList]
  }

  object PutInvitationConfigurationRequest {
    @inline
    def apply(
        OrganizationName: OrganizationName,
        ContactEmail: js.UndefOr[Email] = js.undefined,
        PrivateSkillIds: js.UndefOr[ShortSkillIdList] = js.undefined
    ): PutInvitationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "OrganizationName" -> OrganizationName.asInstanceOf[js.Any]
      )

      ContactEmail.foreach(__v => __obj.updateDynamic("ContactEmail")(__v.asInstanceOf[js.Any]))
      PrivateSkillIds.foreach(__v => __obj.updateDynamic("PrivateSkillIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutInvitationConfigurationRequest]
    }
  }

  @js.native
  trait PutInvitationConfigurationResponse extends js.Object {}

  object PutInvitationConfigurationResponse {
    @inline
    def apply(
    ): PutInvitationConfigurationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutInvitationConfigurationResponse]
    }
  }

  @js.native
  trait PutRoomSkillParameterRequest extends js.Object {
    var RoomSkillParameter: RoomSkillParameter
    var SkillId: SkillId
    var RoomArn: js.UndefOr[Arn]
  }

  object PutRoomSkillParameterRequest {
    @inline
    def apply(
        RoomSkillParameter: RoomSkillParameter,
        SkillId: SkillId,
        RoomArn: js.UndefOr[Arn] = js.undefined
    ): PutRoomSkillParameterRequest = {
      val __obj = js.Dynamic.literal(
        "RoomSkillParameter" -> RoomSkillParameter.asInstanceOf[js.Any],
        "SkillId"            -> SkillId.asInstanceOf[js.Any]
      )

      RoomArn.foreach(__v => __obj.updateDynamic("RoomArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRoomSkillParameterRequest]
    }
  }

  @js.native
  trait PutRoomSkillParameterResponse extends js.Object {}

  object PutRoomSkillParameterResponse {
    @inline
    def apply(
    ): PutRoomSkillParameterResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutRoomSkillParameterResponse]
    }
  }

  @js.native
  trait PutSkillAuthorizationRequest extends js.Object {
    var AuthorizationResult: AuthorizationResult
    var SkillId: SkillId
    var RoomArn: js.UndefOr[Arn]
  }

  object PutSkillAuthorizationRequest {
    @inline
    def apply(
        AuthorizationResult: AuthorizationResult,
        SkillId: SkillId,
        RoomArn: js.UndefOr[Arn] = js.undefined
    ): PutSkillAuthorizationRequest = {
      val __obj = js.Dynamic.literal(
        "AuthorizationResult" -> AuthorizationResult.asInstanceOf[js.Any],
        "SkillId"             -> SkillId.asInstanceOf[js.Any]
      )

      RoomArn.foreach(__v => __obj.updateDynamic("RoomArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSkillAuthorizationRequest]
    }
  }

  @js.native
  trait PutSkillAuthorizationResponse extends js.Object {}

  object PutSkillAuthorizationResponse {
    @inline
    def apply(
    ): PutSkillAuthorizationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutSkillAuthorizationResponse]
    }
  }

  @js.native
  trait RegisterAVSDeviceRequest extends js.Object {
    var AmazonId: AmazonId
    var ClientId: ClientId
    var DeviceSerialNumber: DeviceSerialNumberForAVS
    var ProductId: ProductId
    var UserCode: UserCode
  }

  object RegisterAVSDeviceRequest {
    @inline
    def apply(
        AmazonId: AmazonId,
        ClientId: ClientId,
        DeviceSerialNumber: DeviceSerialNumberForAVS,
        ProductId: ProductId,
        UserCode: UserCode
    ): RegisterAVSDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "AmazonId"           -> AmazonId.asInstanceOf[js.Any],
        "ClientId"           -> ClientId.asInstanceOf[js.Any],
        "DeviceSerialNumber" -> DeviceSerialNumber.asInstanceOf[js.Any],
        "ProductId"          -> ProductId.asInstanceOf[js.Any],
        "UserCode"           -> UserCode.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RegisterAVSDeviceRequest]
    }
  }

  @js.native
  trait RegisterAVSDeviceResponse extends js.Object {
    var DeviceArn: js.UndefOr[Arn]
  }

  object RegisterAVSDeviceResponse {
    @inline
    def apply(
        DeviceArn: js.UndefOr[Arn] = js.undefined
    ): RegisterAVSDeviceResponse = {
      val __obj = js.Dynamic.literal()
      DeviceArn.foreach(__v => __obj.updateDynamic("DeviceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterAVSDeviceResponse]
    }
  }

  @js.native
  trait RejectSkillRequest extends js.Object {
    var SkillId: SkillId
  }

  object RejectSkillRequest {
    @inline
    def apply(
        SkillId: SkillId
    ): RejectSkillRequest = {
      val __obj = js.Dynamic.literal(
        "SkillId" -> SkillId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RejectSkillRequest]
    }
  }

  @js.native
  trait RejectSkillResponse extends js.Object {}

  object RejectSkillResponse {
    @inline
    def apply(
    ): RejectSkillResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RejectSkillResponse]
    }
  }

  /**
    * Settings for the require check in feature that are applied to a room profile. Require check in allows a meeting room’s Alexa or AVS device to prompt the user to check in; otherwise, the room will be released.
    */
  @js.native
  trait RequireCheckIn extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var ReleaseAfterMinutes: js.UndefOr[Minutes]
  }

  object RequireCheckIn {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined,
        ReleaseAfterMinutes: js.UndefOr[Minutes] = js.undefined
    ): RequireCheckIn = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      ReleaseAfterMinutes.foreach(__v => __obj.updateDynamic("ReleaseAfterMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequireCheckIn]
    }
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
  trait ResolveRoomRequest extends js.Object {
    var SkillId: SkillId
    var UserId: UserId
  }

  object ResolveRoomRequest {
    @inline
    def apply(
        SkillId: SkillId,
        UserId: UserId
    ): ResolveRoomRequest = {
      val __obj = js.Dynamic.literal(
        "SkillId" -> SkillId.asInstanceOf[js.Any],
        "UserId"  -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResolveRoomRequest]
    }
  }

  @js.native
  trait ResolveRoomResponse extends js.Object {
    var RoomArn: js.UndefOr[Arn]
    var RoomName: js.UndefOr[RoomName]
    var RoomSkillParameters: js.UndefOr[RoomSkillParameters]
  }

  object ResolveRoomResponse {
    @inline
    def apply(
        RoomArn: js.UndefOr[Arn] = js.undefined,
        RoomName: js.UndefOr[RoomName] = js.undefined,
        RoomSkillParameters: js.UndefOr[RoomSkillParameters] = js.undefined
    ): ResolveRoomResponse = {
      val __obj = js.Dynamic.literal()
      RoomArn.foreach(__v => __obj.updateDynamic("RoomArn")(__v.asInstanceOf[js.Any]))
      RoomName.foreach(__v => __obj.updateDynamic("RoomName")(__v.asInstanceOf[js.Any]))
      RoomSkillParameters.foreach(__v => __obj.updateDynamic("RoomSkillParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolveRoomResponse]
    }
  }

  @js.native
  trait RevokeInvitationRequest extends js.Object {
    var EnrollmentId: js.UndefOr[EnrollmentId]
    var UserArn: js.UndefOr[Arn]
  }

  object RevokeInvitationRequest {
    @inline
    def apply(
        EnrollmentId: js.UndefOr[EnrollmentId] = js.undefined,
        UserArn: js.UndefOr[Arn] = js.undefined
    ): RevokeInvitationRequest = {
      val __obj = js.Dynamic.literal()
      EnrollmentId.foreach(__v => __obj.updateDynamic("EnrollmentId")(__v.asInstanceOf[js.Any]))
      UserArn.foreach(__v => __obj.updateDynamic("UserArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RevokeInvitationRequest]
    }
  }

  @js.native
  trait RevokeInvitationResponse extends js.Object {}

  object RevokeInvitationResponse {
    @inline
    def apply(
    ): RevokeInvitationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RevokeInvitationResponse]
    }
  }

  /**
    * A room with attributes.
    */
  @js.native
  trait Room extends js.Object {
    var Description: js.UndefOr[RoomDescription]
    var ProfileArn: js.UndefOr[Arn]
    var ProviderCalendarId: js.UndefOr[ProviderCalendarId]
    var RoomArn: js.UndefOr[Arn]
    var RoomName: js.UndefOr[RoomName]
  }

  object Room {
    @inline
    def apply(
        Description: js.UndefOr[RoomDescription] = js.undefined,
        ProfileArn: js.UndefOr[Arn] = js.undefined,
        ProviderCalendarId: js.UndefOr[ProviderCalendarId] = js.undefined,
        RoomArn: js.UndefOr[Arn] = js.undefined,
        RoomName: js.UndefOr[RoomName] = js.undefined
    ): Room = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ProfileArn.foreach(__v => __obj.updateDynamic("ProfileArn")(__v.asInstanceOf[js.Any]))
      ProviderCalendarId.foreach(__v => __obj.updateDynamic("ProviderCalendarId")(__v.asInstanceOf[js.Any]))
      RoomArn.foreach(__v => __obj.updateDynamic("RoomArn")(__v.asInstanceOf[js.Any]))
      RoomName.foreach(__v => __obj.updateDynamic("RoomName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Room]
    }
  }

  /**
    * The data of a room.
    */
  @js.native
  trait RoomData extends js.Object {
    var Description: js.UndefOr[RoomDescription]
    var ProfileArn: js.UndefOr[Arn]
    var ProfileName: js.UndefOr[ProfileName]
    var ProviderCalendarId: js.UndefOr[ProviderCalendarId]
    var RoomArn: js.UndefOr[Arn]
    var RoomName: js.UndefOr[RoomName]
  }

  object RoomData {
    @inline
    def apply(
        Description: js.UndefOr[RoomDescription] = js.undefined,
        ProfileArn: js.UndefOr[Arn] = js.undefined,
        ProfileName: js.UndefOr[ProfileName] = js.undefined,
        ProviderCalendarId: js.UndefOr[ProviderCalendarId] = js.undefined,
        RoomArn: js.UndefOr[Arn] = js.undefined,
        RoomName: js.UndefOr[RoomName] = js.undefined
    ): RoomData = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ProfileArn.foreach(__v => __obj.updateDynamic("ProfileArn")(__v.asInstanceOf[js.Any]))
      ProfileName.foreach(__v => __obj.updateDynamic("ProfileName")(__v.asInstanceOf[js.Any]))
      ProviderCalendarId.foreach(__v => __obj.updateDynamic("ProviderCalendarId")(__v.asInstanceOf[js.Any]))
      RoomArn.foreach(__v => __obj.updateDynamic("RoomArn")(__v.asInstanceOf[js.Any]))
      RoomName.foreach(__v => __obj.updateDynamic("RoomName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoomData]
    }
  }

  /**
    * A skill parameter associated with a room.
    */
  @js.native
  trait RoomSkillParameter extends js.Object {
    var ParameterKey: RoomSkillParameterKey
    var ParameterValue: RoomSkillParameterValue
  }

  object RoomSkillParameter {
    @inline
    def apply(
        ParameterKey: RoomSkillParameterKey,
        ParameterValue: RoomSkillParameterValue
    ): RoomSkillParameter = {
      val __obj = js.Dynamic.literal(
        "ParameterKey"   -> ParameterKey.asInstanceOf[js.Any],
        "ParameterValue" -> ParameterValue.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RoomSkillParameter]
    }
  }

  @js.native
  trait SearchAddressBooksRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortCriteria: js.UndefOr[SortList]
  }

  object SearchAddressBooksRequest {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortCriteria: js.UndefOr[SortList] = js.undefined
    ): SearchAddressBooksRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.updateDynamic("SortCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchAddressBooksRequest]
    }
  }

  @js.native
  trait SearchAddressBooksResponse extends js.Object {
    var AddressBooks: js.UndefOr[AddressBookDataList]
    var NextToken: js.UndefOr[NextToken]
    var TotalCount: js.UndefOr[TotalCount]
  }

  object SearchAddressBooksResponse {
    @inline
    def apply(
        AddressBooks: js.UndefOr[AddressBookDataList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TotalCount: js.UndefOr[TotalCount] = js.undefined
    ): SearchAddressBooksResponse = {
      val __obj = js.Dynamic.literal()
      AddressBooks.foreach(__v => __obj.updateDynamic("AddressBooks")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.updateDynamic("TotalCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchAddressBooksResponse]
    }
  }

  @js.native
  trait SearchContactsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortCriteria: js.UndefOr[SortList]
  }

  object SearchContactsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortCriteria: js.UndefOr[SortList] = js.undefined
    ): SearchContactsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.updateDynamic("SortCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchContactsRequest]
    }
  }

  @js.native
  trait SearchContactsResponse extends js.Object {
    var Contacts: js.UndefOr[ContactDataList]
    var NextToken: js.UndefOr[NextToken]
    var TotalCount: js.UndefOr[TotalCount]
  }

  object SearchContactsResponse {
    @inline
    def apply(
        Contacts: js.UndefOr[ContactDataList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TotalCount: js.UndefOr[TotalCount] = js.undefined
    ): SearchContactsResponse = {
      val __obj = js.Dynamic.literal()
      Contacts.foreach(__v => __obj.updateDynamic("Contacts")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.updateDynamic("TotalCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchContactsResponse]
    }
  }

  @js.native
  trait SearchDevicesRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortCriteria: js.UndefOr[SortList]
  }

  object SearchDevicesRequest {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortCriteria: js.UndefOr[SortList] = js.undefined
    ): SearchDevicesRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.updateDynamic("SortCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchDevicesRequest]
    }
  }

  @js.native
  trait SearchDevicesResponse extends js.Object {
    var Devices: js.UndefOr[DeviceDataList]
    var NextToken: js.UndefOr[NextToken]
    var TotalCount: js.UndefOr[TotalCount]
  }

  object SearchDevicesResponse {
    @inline
    def apply(
        Devices: js.UndefOr[DeviceDataList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TotalCount: js.UndefOr[TotalCount] = js.undefined
    ): SearchDevicesResponse = {
      val __obj = js.Dynamic.literal()
      Devices.foreach(__v => __obj.updateDynamic("Devices")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.updateDynamic("TotalCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchDevicesResponse]
    }
  }

  @js.native
  trait SearchNetworkProfilesRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortCriteria: js.UndefOr[SortList]
  }

  object SearchNetworkProfilesRequest {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortCriteria: js.UndefOr[SortList] = js.undefined
    ): SearchNetworkProfilesRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.updateDynamic("SortCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchNetworkProfilesRequest]
    }
  }

  @js.native
  trait SearchNetworkProfilesResponse extends js.Object {
    var NetworkProfiles: js.UndefOr[NetworkProfileDataList]
    var NextToken: js.UndefOr[NextToken]
    var TotalCount: js.UndefOr[TotalCount]
  }

  object SearchNetworkProfilesResponse {
    @inline
    def apply(
        NetworkProfiles: js.UndefOr[NetworkProfileDataList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TotalCount: js.UndefOr[TotalCount] = js.undefined
    ): SearchNetworkProfilesResponse = {
      val __obj = js.Dynamic.literal()
      NetworkProfiles.foreach(__v => __obj.updateDynamic("NetworkProfiles")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.updateDynamic("TotalCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchNetworkProfilesResponse]
    }
  }

  @js.native
  trait SearchProfilesRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortCriteria: js.UndefOr[SortList]
  }

  object SearchProfilesRequest {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortCriteria: js.UndefOr[SortList] = js.undefined
    ): SearchProfilesRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.updateDynamic("SortCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchProfilesRequest]
    }
  }

  @js.native
  trait SearchProfilesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Profiles: js.UndefOr[ProfileDataList]
    var TotalCount: js.UndefOr[TotalCount]
  }

  object SearchProfilesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Profiles: js.UndefOr[ProfileDataList] = js.undefined,
        TotalCount: js.UndefOr[TotalCount] = js.undefined
    ): SearchProfilesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Profiles.foreach(__v => __obj.updateDynamic("Profiles")(__v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.updateDynamic("TotalCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchProfilesResponse]
    }
  }

  @js.native
  trait SearchRoomsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortCriteria: js.UndefOr[SortList]
  }

  object SearchRoomsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortCriteria: js.UndefOr[SortList] = js.undefined
    ): SearchRoomsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.updateDynamic("SortCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchRoomsRequest]
    }
  }

  @js.native
  trait SearchRoomsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Rooms: js.UndefOr[RoomDataList]
    var TotalCount: js.UndefOr[TotalCount]
  }

  object SearchRoomsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Rooms: js.UndefOr[RoomDataList] = js.undefined,
        TotalCount: js.UndefOr[TotalCount] = js.undefined
    ): SearchRoomsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Rooms.foreach(__v => __obj.updateDynamic("Rooms")(__v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.updateDynamic("TotalCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchRoomsResponse]
    }
  }

  @js.native
  trait SearchSkillGroupsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortCriteria: js.UndefOr[SortList]
  }

  object SearchSkillGroupsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortCriteria: js.UndefOr[SortList] = js.undefined
    ): SearchSkillGroupsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.updateDynamic("SortCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchSkillGroupsRequest]
    }
  }

  @js.native
  trait SearchSkillGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SkillGroups: js.UndefOr[SkillGroupDataList]
    var TotalCount: js.UndefOr[TotalCount]
  }

  object SearchSkillGroupsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SkillGroups: js.UndefOr[SkillGroupDataList] = js.undefined,
        TotalCount: js.UndefOr[TotalCount] = js.undefined
    ): SearchSkillGroupsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SkillGroups.foreach(__v => __obj.updateDynamic("SkillGroups")(__v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.updateDynamic("TotalCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchSkillGroupsResponse]
    }
  }

  @js.native
  trait SearchUsersRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortCriteria: js.UndefOr[SortList]
  }

  object SearchUsersRequest {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortCriteria: js.UndefOr[SortList] = js.undefined
    ): SearchUsersRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.updateDynamic("SortCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchUsersRequest]
    }
  }

  @js.native
  trait SearchUsersResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TotalCount: js.UndefOr[TotalCount]
    var Users: js.UndefOr[UserDataList]
  }

  object SearchUsersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TotalCount: js.UndefOr[TotalCount] = js.undefined,
        Users: js.UndefOr[UserDataList] = js.undefined
    ): SearchUsersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.updateDynamic("TotalCount")(__v.asInstanceOf[js.Any]))
      Users.foreach(__v => __obj.updateDynamic("Users")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchUsersResponse]
    }
  }

  @js.native
  trait SendAnnouncementRequest extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var Content: Content
    var RoomFilters: FilterList
    var TimeToLiveInSeconds: js.UndefOr[TimeToLiveInSeconds]
  }

  object SendAnnouncementRequest {
    @inline
    def apply(
        ClientRequestToken: ClientRequestToken,
        Content: Content,
        RoomFilters: FilterList,
        TimeToLiveInSeconds: js.UndefOr[TimeToLiveInSeconds] = js.undefined
    ): SendAnnouncementRequest = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "Content"            -> Content.asInstanceOf[js.Any],
        "RoomFilters"        -> RoomFilters.asInstanceOf[js.Any]
      )

      TimeToLiveInSeconds.foreach(__v => __obj.updateDynamic("TimeToLiveInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendAnnouncementRequest]
    }
  }

  @js.native
  trait SendAnnouncementResponse extends js.Object {
    var AnnouncementArn: js.UndefOr[Arn]
  }

  object SendAnnouncementResponse {
    @inline
    def apply(
        AnnouncementArn: js.UndefOr[Arn] = js.undefined
    ): SendAnnouncementResponse = {
      val __obj = js.Dynamic.literal()
      AnnouncementArn.foreach(__v => __obj.updateDynamic("AnnouncementArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendAnnouncementResponse]
    }
  }

  @js.native
  trait SendInvitationRequest extends js.Object {
    var UserArn: js.UndefOr[Arn]
  }

  object SendInvitationRequest {
    @inline
    def apply(
        UserArn: js.UndefOr[Arn] = js.undefined
    ): SendInvitationRequest = {
      val __obj = js.Dynamic.literal()
      UserArn.foreach(__v => __obj.updateDynamic("UserArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendInvitationRequest]
    }
  }

  @js.native
  trait SendInvitationResponse extends js.Object {}

  object SendInvitationResponse {
    @inline
    def apply(
    ): SendInvitationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[SendInvitationResponse]
    }
  }

  /**
    * The SIP address for the contact containing the URI and SIP address type.
    */
  @js.native
  trait SipAddress extends js.Object {
    var Type: SipType
    var Uri: SipUri
  }

  object SipAddress {
    @inline
    def apply(
        Type: SipType,
        Uri: SipUri
    ): SipAddress = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any],
        "Uri"  -> Uri.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SipAddress]
    }
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

  object SkillDetails {
    @inline
    def apply(
        BulletPoints: js.UndefOr[BulletPoints] = js.undefined,
        DeveloperInfo: js.UndefOr[DeveloperInfo] = js.undefined,
        EndUserLicenseAgreement: js.UndefOr[EndUserLicenseAgreement] = js.undefined,
        GenericKeywords: js.UndefOr[GenericKeywords] = js.undefined,
        InvocationPhrase: js.UndefOr[InvocationPhrase] = js.undefined,
        NewInThisVersionBulletPoints: js.UndefOr[NewInThisVersionBulletPoints] = js.undefined,
        ProductDescription: js.UndefOr[ProductDescription] = js.undefined,
        ReleaseDate: js.UndefOr[ReleaseDate] = js.undefined,
        Reviews: js.UndefOr[Reviews] = js.undefined,
        SkillTypes: js.UndefOr[SkillTypes] = js.undefined
    ): SkillDetails = {
      val __obj = js.Dynamic.literal()
      BulletPoints.foreach(__v => __obj.updateDynamic("BulletPoints")(__v.asInstanceOf[js.Any]))
      DeveloperInfo.foreach(__v => __obj.updateDynamic("DeveloperInfo")(__v.asInstanceOf[js.Any]))
      EndUserLicenseAgreement.foreach(__v => __obj.updateDynamic("EndUserLicenseAgreement")(__v.asInstanceOf[js.Any]))
      GenericKeywords.foreach(__v => __obj.updateDynamic("GenericKeywords")(__v.asInstanceOf[js.Any]))
      InvocationPhrase.foreach(__v => __obj.updateDynamic("InvocationPhrase")(__v.asInstanceOf[js.Any]))
      NewInThisVersionBulletPoints.foreach(__v =>
        __obj.updateDynamic("NewInThisVersionBulletPoints")(__v.asInstanceOf[js.Any])
      )
      ProductDescription.foreach(__v => __obj.updateDynamic("ProductDescription")(__v.asInstanceOf[js.Any]))
      ReleaseDate.foreach(__v => __obj.updateDynamic("ReleaseDate")(__v.asInstanceOf[js.Any]))
      Reviews.foreach(__v => __obj.updateDynamic("Reviews")(__v.asInstanceOf[js.Any]))
      SkillTypes.foreach(__v => __obj.updateDynamic("SkillTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SkillDetails]
    }
  }

  /**
    * A skill group with attributes.
    */
  @js.native
  trait SkillGroup extends js.Object {
    var Description: js.UndefOr[SkillGroupDescription]
    var SkillGroupArn: js.UndefOr[Arn]
    var SkillGroupName: js.UndefOr[SkillGroupName]
  }

  object SkillGroup {
    @inline
    def apply(
        Description: js.UndefOr[SkillGroupDescription] = js.undefined,
        SkillGroupArn: js.UndefOr[Arn] = js.undefined,
        SkillGroupName: js.UndefOr[SkillGroupName] = js.undefined
    ): SkillGroup = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      SkillGroupArn.foreach(__v => __obj.updateDynamic("SkillGroupArn")(__v.asInstanceOf[js.Any]))
      SkillGroupName.foreach(__v => __obj.updateDynamic("SkillGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SkillGroup]
    }
  }

  /**
    * The attributes of a skill group.
    */
  @js.native
  trait SkillGroupData extends js.Object {
    var Description: js.UndefOr[SkillGroupDescription]
    var SkillGroupArn: js.UndefOr[Arn]
    var SkillGroupName: js.UndefOr[SkillGroupName]
  }

  object SkillGroupData {
    @inline
    def apply(
        Description: js.UndefOr[SkillGroupDescription] = js.undefined,
        SkillGroupArn: js.UndefOr[Arn] = js.undefined,
        SkillGroupName: js.UndefOr[SkillGroupName] = js.undefined
    ): SkillGroupData = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      SkillGroupArn.foreach(__v => __obj.updateDynamic("SkillGroupArn")(__v.asInstanceOf[js.Any]))
      SkillGroupName.foreach(__v => __obj.updateDynamic("SkillGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SkillGroupData]
    }
  }

  /**
    * The summary of skills.
    */
  @js.native
  trait SkillSummary extends js.Object {
    var EnablementType: js.UndefOr[EnablementType]
    var SkillId: js.UndefOr[SkillId]
    var SkillName: js.UndefOr[SkillName]
    var SkillType: js.UndefOr[SkillType]
    var SupportsLinking: js.UndefOr[Boolean]
  }

  object SkillSummary {
    @inline
    def apply(
        EnablementType: js.UndefOr[EnablementType] = js.undefined,
        SkillId: js.UndefOr[SkillId] = js.undefined,
        SkillName: js.UndefOr[SkillName] = js.undefined,
        SkillType: js.UndefOr[SkillType] = js.undefined,
        SupportsLinking: js.UndefOr[Boolean] = js.undefined
    ): SkillSummary = {
      val __obj = js.Dynamic.literal()
      EnablementType.foreach(__v => __obj.updateDynamic("EnablementType")(__v.asInstanceOf[js.Any]))
      SkillId.foreach(__v => __obj.updateDynamic("SkillId")(__v.asInstanceOf[js.Any]))
      SkillName.foreach(__v => __obj.updateDynamic("SkillName")(__v.asInstanceOf[js.Any]))
      SkillType.foreach(__v => __obj.updateDynamic("SkillType")(__v.asInstanceOf[js.Any]))
      SupportsLinking.foreach(__v => __obj.updateDynamic("SupportsLinking")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SkillSummary]
    }
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
  trait SkillsStoreSkill extends js.Object {
    var IconUrl: js.UndefOr[IconUrl]
    var SampleUtterances: js.UndefOr[SampleUtterances]
    var ShortDescription: js.UndefOr[ShortDescription]
    var SkillDetails: js.UndefOr[SkillDetails]
    var SkillId: js.UndefOr[SkillId]
    var SkillName: js.UndefOr[SkillName]
    var SupportsLinking: js.UndefOr[Boolean]
  }

  object SkillsStoreSkill {
    @inline
    def apply(
        IconUrl: js.UndefOr[IconUrl] = js.undefined,
        SampleUtterances: js.UndefOr[SampleUtterances] = js.undefined,
        ShortDescription: js.UndefOr[ShortDescription] = js.undefined,
        SkillDetails: js.UndefOr[SkillDetails] = js.undefined,
        SkillId: js.UndefOr[SkillId] = js.undefined,
        SkillName: js.UndefOr[SkillName] = js.undefined,
        SupportsLinking: js.UndefOr[Boolean] = js.undefined
    ): SkillsStoreSkill = {
      val __obj = js.Dynamic.literal()
      IconUrl.foreach(__v => __obj.updateDynamic("IconUrl")(__v.asInstanceOf[js.Any]))
      SampleUtterances.foreach(__v => __obj.updateDynamic("SampleUtterances")(__v.asInstanceOf[js.Any]))
      ShortDescription.foreach(__v => __obj.updateDynamic("ShortDescription")(__v.asInstanceOf[js.Any]))
      SkillDetails.foreach(__v => __obj.updateDynamic("SkillDetails")(__v.asInstanceOf[js.Any]))
      SkillId.foreach(__v => __obj.updateDynamic("SkillId")(__v.asInstanceOf[js.Any]))
      SkillName.foreach(__v => __obj.updateDynamic("SkillName")(__v.asInstanceOf[js.Any]))
      SupportsLinking.foreach(__v => __obj.updateDynamic("SupportsLinking")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SkillsStoreSkill]
    }
  }

  /**
    * A smart home appliance that can connect to a central system. Any domestic device can be a smart appliance.
    */
  @js.native
  trait SmartHomeAppliance extends js.Object {
    var Description: js.UndefOr[ApplianceDescription]
    var FriendlyName: js.UndefOr[ApplianceFriendlyName]
    var ManufacturerName: js.UndefOr[ApplianceManufacturerName]
  }

  object SmartHomeAppliance {
    @inline
    def apply(
        Description: js.UndefOr[ApplianceDescription] = js.undefined,
        FriendlyName: js.UndefOr[ApplianceFriendlyName] = js.undefined,
        ManufacturerName: js.UndefOr[ApplianceManufacturerName] = js.undefined
    ): SmartHomeAppliance = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FriendlyName.foreach(__v => __obj.updateDynamic("FriendlyName")(__v.asInstanceOf[js.Any]))
      ManufacturerName.foreach(__v => __obj.updateDynamic("ManufacturerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SmartHomeAppliance]
    }
  }

  /**
    * An object representing a sort criteria.
    */
  @js.native
  trait Sort extends js.Object {
    var Key: SortKey
    var Value: SortValue
  }

  object Sort {
    @inline
    def apply(
        Key: SortKey,
        Value: SortValue
    ): Sort = {
      val __obj = js.Dynamic.literal(
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Sort]
    }
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
  trait Ssml extends js.Object {
    var Locale: Locale
    var Value: SsmlValue
  }

  object Ssml {
    @inline
    def apply(
        Locale: Locale,
        Value: SsmlValue
    ): Ssml = {
      val __obj = js.Dynamic.literal(
        "Locale" -> Locale.asInstanceOf[js.Any],
        "Value"  -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Ssml]
    }
  }

  @js.native
  trait StartDeviceSyncRequest extends js.Object {
    var Features: Features
    var DeviceArn: js.UndefOr[Arn]
    var RoomArn: js.UndefOr[Arn]
  }

  object StartDeviceSyncRequest {
    @inline
    def apply(
        Features: Features,
        DeviceArn: js.UndefOr[Arn] = js.undefined,
        RoomArn: js.UndefOr[Arn] = js.undefined
    ): StartDeviceSyncRequest = {
      val __obj = js.Dynamic.literal(
        "Features" -> Features.asInstanceOf[js.Any]
      )

      DeviceArn.foreach(__v => __obj.updateDynamic("DeviceArn")(__v.asInstanceOf[js.Any]))
      RoomArn.foreach(__v => __obj.updateDynamic("RoomArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDeviceSyncRequest]
    }
  }

  @js.native
  trait StartDeviceSyncResponse extends js.Object {}

  object StartDeviceSyncResponse {
    @inline
    def apply(
    ): StartDeviceSyncResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[StartDeviceSyncResponse]
    }
  }

  @js.native
  trait StartSmartHomeApplianceDiscoveryRequest extends js.Object {
    var RoomArn: Arn
  }

  object StartSmartHomeApplianceDiscoveryRequest {
    @inline
    def apply(
        RoomArn: Arn
    ): StartSmartHomeApplianceDiscoveryRequest = {
      val __obj = js.Dynamic.literal(
        "RoomArn" -> RoomArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartSmartHomeApplianceDiscoveryRequest]
    }
  }

  @js.native
  trait StartSmartHomeApplianceDiscoveryResponse extends js.Object {}

  object StartSmartHomeApplianceDiscoveryResponse {
    @inline
    def apply(
    ): StartSmartHomeApplianceDiscoveryResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[StartSmartHomeApplianceDiscoveryResponse]
    }
  }

  /**
    * A key-value pair that can be associated with a resource.
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
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var Arn: Arn
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        Arn: Arn,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Arn"  -> Arn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

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
  trait Text extends js.Object {
    var Locale: Locale
    var Value: TextValue
  }

  object Text {
    @inline
    def apply(
        Locale: Locale,
        Value: TextValue
    ): Text = {
      val __obj = js.Dynamic.literal(
        "Locale" -> Locale.asInstanceOf[js.Any],
        "Value"  -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Text]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var Arn: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        Arn: Arn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Arn"     -> Arn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateAddressBookRequest extends js.Object {
    var AddressBookArn: Arn
    var Description: js.UndefOr[AddressBookDescription]
    var Name: js.UndefOr[AddressBookName]
  }

  object UpdateAddressBookRequest {
    @inline
    def apply(
        AddressBookArn: Arn,
        Description: js.UndefOr[AddressBookDescription] = js.undefined,
        Name: js.UndefOr[AddressBookName] = js.undefined
    ): UpdateAddressBookRequest = {
      val __obj = js.Dynamic.literal(
        "AddressBookArn" -> AddressBookArn.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAddressBookRequest]
    }
  }

  @js.native
  trait UpdateAddressBookResponse extends js.Object {}

  object UpdateAddressBookResponse {
    @inline
    def apply(
    ): UpdateAddressBookResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateAddressBookResponse]
    }
  }

  @js.native
  trait UpdateBusinessReportScheduleRequest extends js.Object {
    var ScheduleArn: Arn
    var Format: js.UndefOr[BusinessReportFormat]
    var Recurrence: js.UndefOr[BusinessReportRecurrence]
    var S3BucketName: js.UndefOr[CustomerS3BucketName]
    var S3KeyPrefix: js.UndefOr[S3KeyPrefix]
    var ScheduleName: js.UndefOr[BusinessReportScheduleName]
  }

  object UpdateBusinessReportScheduleRequest {
    @inline
    def apply(
        ScheduleArn: Arn,
        Format: js.UndefOr[BusinessReportFormat] = js.undefined,
        Recurrence: js.UndefOr[BusinessReportRecurrence] = js.undefined,
        S3BucketName: js.UndefOr[CustomerS3BucketName] = js.undefined,
        S3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
        ScheduleName: js.UndefOr[BusinessReportScheduleName] = js.undefined
    ): UpdateBusinessReportScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "ScheduleArn" -> ScheduleArn.asInstanceOf[js.Any]
      )

      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      Recurrence.foreach(__v => __obj.updateDynamic("Recurrence")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.updateDynamic("S3KeyPrefix")(__v.asInstanceOf[js.Any]))
      ScheduleName.foreach(__v => __obj.updateDynamic("ScheduleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBusinessReportScheduleRequest]
    }
  }

  @js.native
  trait UpdateBusinessReportScheduleResponse extends js.Object {}

  object UpdateBusinessReportScheduleResponse {
    @inline
    def apply(
    ): UpdateBusinessReportScheduleResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateBusinessReportScheduleResponse]
    }
  }

  @js.native
  trait UpdateConferenceProviderRequest extends js.Object {
    var ConferenceProviderArn: Arn
    var ConferenceProviderType: ConferenceProviderType
    var MeetingSetting: MeetingSetting
    var IPDialIn: js.UndefOr[IPDialIn]
    var PSTNDialIn: js.UndefOr[PSTNDialIn]
  }

  object UpdateConferenceProviderRequest {
    @inline
    def apply(
        ConferenceProviderArn: Arn,
        ConferenceProviderType: ConferenceProviderType,
        MeetingSetting: MeetingSetting,
        IPDialIn: js.UndefOr[IPDialIn] = js.undefined,
        PSTNDialIn: js.UndefOr[PSTNDialIn] = js.undefined
    ): UpdateConferenceProviderRequest = {
      val __obj = js.Dynamic.literal(
        "ConferenceProviderArn"  -> ConferenceProviderArn.asInstanceOf[js.Any],
        "ConferenceProviderType" -> ConferenceProviderType.asInstanceOf[js.Any],
        "MeetingSetting"         -> MeetingSetting.asInstanceOf[js.Any]
      )

      IPDialIn.foreach(__v => __obj.updateDynamic("IPDialIn")(__v.asInstanceOf[js.Any]))
      PSTNDialIn.foreach(__v => __obj.updateDynamic("PSTNDialIn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConferenceProviderRequest]
    }
  }

  @js.native
  trait UpdateConferenceProviderResponse extends js.Object {}

  object UpdateConferenceProviderResponse {
    @inline
    def apply(
    ): UpdateConferenceProviderResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateConferenceProviderResponse]
    }
  }

  @js.native
  trait UpdateContactRequest extends js.Object {
    var ContactArn: Arn
    var DisplayName: js.UndefOr[ContactName]
    var FirstName: js.UndefOr[ContactName]
    var LastName: js.UndefOr[ContactName]
    var PhoneNumber: js.UndefOr[RawPhoneNumber]
    var PhoneNumbers: js.UndefOr[PhoneNumberList]
    var SipAddresses: js.UndefOr[SipAddressList]
  }

  object UpdateContactRequest {
    @inline
    def apply(
        ContactArn: Arn,
        DisplayName: js.UndefOr[ContactName] = js.undefined,
        FirstName: js.UndefOr[ContactName] = js.undefined,
        LastName: js.UndefOr[ContactName] = js.undefined,
        PhoneNumber: js.UndefOr[RawPhoneNumber] = js.undefined,
        PhoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined,
        SipAddresses: js.UndefOr[SipAddressList] = js.undefined
    ): UpdateContactRequest = {
      val __obj = js.Dynamic.literal(
        "ContactArn" -> ContactArn.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.updateDynamic("FirstName")(__v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.updateDynamic("LastName")(__v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      PhoneNumbers.foreach(__v => __obj.updateDynamic("PhoneNumbers")(__v.asInstanceOf[js.Any]))
      SipAddresses.foreach(__v => __obj.updateDynamic("SipAddresses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateContactRequest]
    }
  }

  @js.native
  trait UpdateContactResponse extends js.Object {}

  object UpdateContactResponse {
    @inline
    def apply(
    ): UpdateContactResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateContactResponse]
    }
  }

  @js.native
  trait UpdateDeviceRequest extends js.Object {
    var DeviceArn: js.UndefOr[Arn]
    var DeviceName: js.UndefOr[DeviceName]
  }

  object UpdateDeviceRequest {
    @inline
    def apply(
        DeviceArn: js.UndefOr[Arn] = js.undefined,
        DeviceName: js.UndefOr[DeviceName] = js.undefined
    ): UpdateDeviceRequest = {
      val __obj = js.Dynamic.literal()
      DeviceArn.foreach(__v => __obj.updateDynamic("DeviceArn")(__v.asInstanceOf[js.Any]))
      DeviceName.foreach(__v => __obj.updateDynamic("DeviceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeviceRequest]
    }
  }

  @js.native
  trait UpdateDeviceResponse extends js.Object {}

  object UpdateDeviceResponse {
    @inline
    def apply(
    ): UpdateDeviceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateDeviceResponse]
    }
  }

  /**
    * Settings for the end of meeting reminder feature that are applied to a room profile. The end of meeting reminder enables Alexa to remind users when a meeting is ending.
    */
  @js.native
  trait UpdateEndOfMeetingReminder extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var ReminderAtMinutes: js.UndefOr[EndOfMeetingReminderMinutesList]
    var ReminderType: js.UndefOr[EndOfMeetingReminderType]
  }

  object UpdateEndOfMeetingReminder {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined,
        ReminderAtMinutes: js.UndefOr[EndOfMeetingReminderMinutesList] = js.undefined,
        ReminderType: js.UndefOr[EndOfMeetingReminderType] = js.undefined
    ): UpdateEndOfMeetingReminder = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      ReminderAtMinutes.foreach(__v => __obj.updateDynamic("ReminderAtMinutes")(__v.asInstanceOf[js.Any]))
      ReminderType.foreach(__v => __obj.updateDynamic("ReminderType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEndOfMeetingReminder]
    }
  }

  @js.native
  trait UpdateGatewayGroupRequest extends js.Object {
    var GatewayGroupArn: Arn
    var Description: js.UndefOr[GatewayGroupDescription]
    var Name: js.UndefOr[GatewayGroupName]
  }

  object UpdateGatewayGroupRequest {
    @inline
    def apply(
        GatewayGroupArn: Arn,
        Description: js.UndefOr[GatewayGroupDescription] = js.undefined,
        Name: js.UndefOr[GatewayGroupName] = js.undefined
    ): UpdateGatewayGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GatewayGroupArn" -> GatewayGroupArn.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGatewayGroupRequest]
    }
  }

  @js.native
  trait UpdateGatewayGroupResponse extends js.Object {}

  object UpdateGatewayGroupResponse {
    @inline
    def apply(
    ): UpdateGatewayGroupResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateGatewayGroupResponse]
    }
  }

  @js.native
  trait UpdateGatewayRequest extends js.Object {
    var GatewayArn: Arn
    var Description: js.UndefOr[GatewayDescription]
    var Name: js.UndefOr[GatewayName]
    var SoftwareVersion: js.UndefOr[GatewayVersion]
  }

  object UpdateGatewayRequest {
    @inline
    def apply(
        GatewayArn: Arn,
        Description: js.UndefOr[GatewayDescription] = js.undefined,
        Name: js.UndefOr[GatewayName] = js.undefined,
        SoftwareVersion: js.UndefOr[GatewayVersion] = js.undefined
    ): UpdateGatewayRequest = {
      val __obj = js.Dynamic.literal(
        "GatewayArn" -> GatewayArn.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SoftwareVersion.foreach(__v => __obj.updateDynamic("SoftwareVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGatewayRequest]
    }
  }

  @js.native
  trait UpdateGatewayResponse extends js.Object {}

  object UpdateGatewayResponse {
    @inline
    def apply(
    ): UpdateGatewayResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateGatewayResponse]
    }
  }

  /**
    * Updates settings for the instant booking feature that are applied to a room profile. If instant booking is enabled, Alexa automatically reserves a room if it is free when a user joins a meeting with Alexa.
    */
  @js.native
  trait UpdateInstantBooking extends js.Object {
    var DurationInMinutes: js.UndefOr[Minutes]
    var Enabled: js.UndefOr[Boolean]
  }

  object UpdateInstantBooking {
    @inline
    def apply(
        DurationInMinutes: js.UndefOr[Minutes] = js.undefined,
        Enabled: js.UndefOr[Boolean] = js.undefined
    ): UpdateInstantBooking = {
      val __obj = js.Dynamic.literal()
      DurationInMinutes.foreach(__v => __obj.updateDynamic("DurationInMinutes")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateInstantBooking]
    }
  }

  /**
    * Updates meeting room settings of a room profile.
    */
  @js.native
  trait UpdateMeetingRoomConfiguration extends js.Object {
    var EndOfMeetingReminder: js.UndefOr[UpdateEndOfMeetingReminder]
    var InstantBooking: js.UndefOr[UpdateInstantBooking]
    var RequireCheckIn: js.UndefOr[UpdateRequireCheckIn]
    var RoomUtilizationMetricsEnabled: js.UndefOr[Boolean]
  }

  object UpdateMeetingRoomConfiguration {
    @inline
    def apply(
        EndOfMeetingReminder: js.UndefOr[UpdateEndOfMeetingReminder] = js.undefined,
        InstantBooking: js.UndefOr[UpdateInstantBooking] = js.undefined,
        RequireCheckIn: js.UndefOr[UpdateRequireCheckIn] = js.undefined,
        RoomUtilizationMetricsEnabled: js.UndefOr[Boolean] = js.undefined
    ): UpdateMeetingRoomConfiguration = {
      val __obj = js.Dynamic.literal()
      EndOfMeetingReminder.foreach(__v => __obj.updateDynamic("EndOfMeetingReminder")(__v.asInstanceOf[js.Any]))
      InstantBooking.foreach(__v => __obj.updateDynamic("InstantBooking")(__v.asInstanceOf[js.Any]))
      RequireCheckIn.foreach(__v => __obj.updateDynamic("RequireCheckIn")(__v.asInstanceOf[js.Any]))
      RoomUtilizationMetricsEnabled.foreach(__v =>
        __obj.updateDynamic("RoomUtilizationMetricsEnabled")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[UpdateMeetingRoomConfiguration]
    }
  }

  @js.native
  trait UpdateNetworkProfileRequest extends js.Object {
    var NetworkProfileArn: Arn
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var CurrentPassword: js.UndefOr[CurrentWiFiPassword]
    var Description: js.UndefOr[NetworkProfileDescription]
    var NetworkProfileName: js.UndefOr[NetworkProfileName]
    var NextPassword: js.UndefOr[NextWiFiPassword]
    var TrustAnchors: js.UndefOr[TrustAnchorList]
  }

  object UpdateNetworkProfileRequest {
    @inline
    def apply(
        NetworkProfileArn: Arn,
        CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
        CurrentPassword: js.UndefOr[CurrentWiFiPassword] = js.undefined,
        Description: js.UndefOr[NetworkProfileDescription] = js.undefined,
        NetworkProfileName: js.UndefOr[NetworkProfileName] = js.undefined,
        NextPassword: js.UndefOr[NextWiFiPassword] = js.undefined,
        TrustAnchors: js.UndefOr[TrustAnchorList] = js.undefined
    ): UpdateNetworkProfileRequest = {
      val __obj = js.Dynamic.literal(
        "NetworkProfileArn" -> NetworkProfileArn.asInstanceOf[js.Any]
      )

      CertificateAuthorityArn.foreach(__v => __obj.updateDynamic("CertificateAuthorityArn")(__v.asInstanceOf[js.Any]))
      CurrentPassword.foreach(__v => __obj.updateDynamic("CurrentPassword")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      NetworkProfileName.foreach(__v => __obj.updateDynamic("NetworkProfileName")(__v.asInstanceOf[js.Any]))
      NextPassword.foreach(__v => __obj.updateDynamic("NextPassword")(__v.asInstanceOf[js.Any]))
      TrustAnchors.foreach(__v => __obj.updateDynamic("TrustAnchors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNetworkProfileRequest]
    }
  }

  @js.native
  trait UpdateNetworkProfileResponse extends js.Object {}

  object UpdateNetworkProfileResponse {
    @inline
    def apply(
    ): UpdateNetworkProfileResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateNetworkProfileResponse]
    }
  }

  @js.native
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

  object UpdateProfileRequest {
    @inline
    def apply(
        Address: js.UndefOr[Address] = js.undefined,
        DistanceUnit: js.UndefOr[DistanceUnit] = js.undefined,
        IsDefault: js.UndefOr[Boolean] = js.undefined,
        Locale: js.UndefOr[DeviceLocale] = js.undefined,
        MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined,
        MeetingRoomConfiguration: js.UndefOr[UpdateMeetingRoomConfiguration] = js.undefined,
        PSTNEnabled: js.UndefOr[Boolean] = js.undefined,
        ProfileArn: js.UndefOr[Arn] = js.undefined,
        ProfileName: js.UndefOr[ProfileName] = js.undefined,
        SetupModeDisabled: js.UndefOr[Boolean] = js.undefined,
        TemperatureUnit: js.UndefOr[TemperatureUnit] = js.undefined,
        Timezone: js.UndefOr[Timezone] = js.undefined,
        WakeWord: js.UndefOr[WakeWord] = js.undefined
    ): UpdateProfileRequest = {
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      DistanceUnit.foreach(__v => __obj.updateDynamic("DistanceUnit")(__v.asInstanceOf[js.Any]))
      IsDefault.foreach(__v => __obj.updateDynamic("IsDefault")(__v.asInstanceOf[js.Any]))
      Locale.foreach(__v => __obj.updateDynamic("Locale")(__v.asInstanceOf[js.Any]))
      MaxVolumeLimit.foreach(__v => __obj.updateDynamic("MaxVolumeLimit")(__v.asInstanceOf[js.Any]))
      MeetingRoomConfiguration.foreach(__v => __obj.updateDynamic("MeetingRoomConfiguration")(__v.asInstanceOf[js.Any]))
      PSTNEnabled.foreach(__v => __obj.updateDynamic("PSTNEnabled")(__v.asInstanceOf[js.Any]))
      ProfileArn.foreach(__v => __obj.updateDynamic("ProfileArn")(__v.asInstanceOf[js.Any]))
      ProfileName.foreach(__v => __obj.updateDynamic("ProfileName")(__v.asInstanceOf[js.Any]))
      SetupModeDisabled.foreach(__v => __obj.updateDynamic("SetupModeDisabled")(__v.asInstanceOf[js.Any]))
      TemperatureUnit.foreach(__v => __obj.updateDynamic("TemperatureUnit")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      WakeWord.foreach(__v => __obj.updateDynamic("WakeWord")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProfileRequest]
    }
  }

  @js.native
  trait UpdateProfileResponse extends js.Object {}

  object UpdateProfileResponse {
    @inline
    def apply(
    ): UpdateProfileResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateProfileResponse]
    }
  }

  /**
    * Updates settings for the require check in feature that are applied to a room profile. Require check in allows a meeting room’s Alexa or AVS device to prompt the user to check in; otherwise, the room will be released.
    */
  @js.native
  trait UpdateRequireCheckIn extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var ReleaseAfterMinutes: js.UndefOr[Minutes]
  }

  object UpdateRequireCheckIn {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined,
        ReleaseAfterMinutes: js.UndefOr[Minutes] = js.undefined
    ): UpdateRequireCheckIn = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      ReleaseAfterMinutes.foreach(__v => __obj.updateDynamic("ReleaseAfterMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRequireCheckIn]
    }
  }

  @js.native
  trait UpdateRoomRequest extends js.Object {
    var Description: js.UndefOr[RoomDescription]
    var ProfileArn: js.UndefOr[Arn]
    var ProviderCalendarId: js.UndefOr[ProviderCalendarId]
    var RoomArn: js.UndefOr[Arn]
    var RoomName: js.UndefOr[RoomName]
  }

  object UpdateRoomRequest {
    @inline
    def apply(
        Description: js.UndefOr[RoomDescription] = js.undefined,
        ProfileArn: js.UndefOr[Arn] = js.undefined,
        ProviderCalendarId: js.UndefOr[ProviderCalendarId] = js.undefined,
        RoomArn: js.UndefOr[Arn] = js.undefined,
        RoomName: js.UndefOr[RoomName] = js.undefined
    ): UpdateRoomRequest = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ProfileArn.foreach(__v => __obj.updateDynamic("ProfileArn")(__v.asInstanceOf[js.Any]))
      ProviderCalendarId.foreach(__v => __obj.updateDynamic("ProviderCalendarId")(__v.asInstanceOf[js.Any]))
      RoomArn.foreach(__v => __obj.updateDynamic("RoomArn")(__v.asInstanceOf[js.Any]))
      RoomName.foreach(__v => __obj.updateDynamic("RoomName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRoomRequest]
    }
  }

  @js.native
  trait UpdateRoomResponse extends js.Object {}

  object UpdateRoomResponse {
    @inline
    def apply(
    ): UpdateRoomResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateRoomResponse]
    }
  }

  @js.native
  trait UpdateSkillGroupRequest extends js.Object {
    var Description: js.UndefOr[SkillGroupDescription]
    var SkillGroupArn: js.UndefOr[Arn]
    var SkillGroupName: js.UndefOr[SkillGroupName]
  }

  object UpdateSkillGroupRequest {
    @inline
    def apply(
        Description: js.UndefOr[SkillGroupDescription] = js.undefined,
        SkillGroupArn: js.UndefOr[Arn] = js.undefined,
        SkillGroupName: js.UndefOr[SkillGroupName] = js.undefined
    ): UpdateSkillGroupRequest = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      SkillGroupArn.foreach(__v => __obj.updateDynamic("SkillGroupArn")(__v.asInstanceOf[js.Any]))
      SkillGroupName.foreach(__v => __obj.updateDynamic("SkillGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSkillGroupRequest]
    }
  }

  @js.native
  trait UpdateSkillGroupResponse extends js.Object {}

  object UpdateSkillGroupResponse {
    @inline
    def apply(
    ): UpdateSkillGroupResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateSkillGroupResponse]
    }
  }

  /**
    * Information related to a user.
    */
  @js.native
  trait UserData extends js.Object {
    var Email: js.UndefOr[Email]
    var EnrollmentId: js.UndefOr[EnrollmentId]
    var EnrollmentStatus: js.UndefOr[EnrollmentStatus]
    var FirstName: js.UndefOr[user_FirstName]
    var LastName: js.UndefOr[user_LastName]
    var UserArn: js.UndefOr[Arn]
  }

  object UserData {
    @inline
    def apply(
        Email: js.UndefOr[Email] = js.undefined,
        EnrollmentId: js.UndefOr[EnrollmentId] = js.undefined,
        EnrollmentStatus: js.UndefOr[EnrollmentStatus] = js.undefined,
        FirstName: js.UndefOr[user_FirstName] = js.undefined,
        LastName: js.UndefOr[user_LastName] = js.undefined,
        UserArn: js.UndefOr[Arn] = js.undefined
    ): UserData = {
      val __obj = js.Dynamic.literal()
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      EnrollmentId.foreach(__v => __obj.updateDynamic("EnrollmentId")(__v.asInstanceOf[js.Any]))
      EnrollmentStatus.foreach(__v => __obj.updateDynamic("EnrollmentStatus")(__v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.updateDynamic("FirstName")(__v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.updateDynamic("LastName")(__v.asInstanceOf[js.Any]))
      UserArn.foreach(__v => __obj.updateDynamic("UserArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserData]
    }
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
