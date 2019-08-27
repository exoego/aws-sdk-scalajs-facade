package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object alexaforbusiness {
  type Address                      = String
  type AddressBookDataList          = js.Array[AddressBookData]
  type AddressBookDescription       = String
  type AddressBookName              = String
  type AmazonId                     = String
  type ApplianceDescription         = String
  type ApplianceFriendlyName        = String
  type ApplianceManufacturerName    = String
  type Arn                          = String
  type AudioList                    = js.Array[Audio]
  type AudioLocation                = String
  type AuthorizationResult          = js.Dictionary[Value]
  type BulletPoint                  = String
  type BulletPoints                 = js.Array[BulletPoint]
  type BusinessReportDeliveryTime   = js.Date
  type BusinessReportDownloadUrl    = String
  type BusinessReportFailureCode    = String
  type BusinessReportFormat         = String
  type BusinessReportInterval       = String
  type BusinessReportS3Path         = String
  type BusinessReportScheduleList   = js.Array[BusinessReportSchedule]
  type BusinessReportScheduleName   = String
  type BusinessReportStatus         = String
  type CategoryId                   = Double
  type CategoryList                 = js.Array[Category]
  type CategoryName                 = String
  type CertificateTime              = js.Date
  type ClientId                     = String
  type ClientRequestToken           = String
  type CommsProtocol                = String
  type ConferenceProviderName       = String
  type ConferenceProviderType       = String
  type ConferenceProvidersList      = js.Array[ConferenceProvider]
  type ConnectionStatus             = String
  type ContactDataList              = js.Array[ContactData]
  type ContactName                  = String
  type CountryCode                  = String
  type CurrentWiFiPassword          = String
  type CustomerS3BucketName         = String
  type Date                         = String
  type DeveloperName                = String
  type DeviceDataList               = js.Array[DeviceData]
  type DeviceEventList              = js.Array[DeviceEvent]
  type DeviceEventTime              = js.Date
  type DeviceEventType              = String
  type DeviceEventValue             = String
  type DeviceLocale                 = String
  type DeviceName                   = String
  type DeviceSerialNumber           = String
  type DeviceSerialNumberForAVS     = String
  type DeviceStatus                 = String
  type DeviceStatusDetailCode       = String
  type DeviceStatusDetails          = js.Array[DeviceStatusDetail]
  type DeviceType                   = String
  type DeviceUsageType              = String
  type DistanceUnit                 = String
  type Email                        = String
  type EnablementType               = String
  type EnablementTypeFilter         = String
  type EndUserLicenseAgreement      = String
  type Endpoint                     = String
  type EnrollmentId                 = String
  type EnrollmentStatus             = String
  type Feature                      = String
  type Features                     = js.Array[Feature]
  type FilterKey                    = String
  type FilterList                   = js.Array[Filter]
  type FilterValue                  = String
  type FilterValueList              = js.Array[FilterValue]
  type GatewayDescription           = String
  type GatewayGroupDescription      = String
  type GatewayGroupName             = String
  type GatewayGroupSummaries        = js.Array[GatewayGroupSummary]
  type GatewayName                  = String
  type GatewaySummaries             = js.Array[GatewaySummary]
  type GatewayVersion               = String
  type GenericKeyword               = String
  type GenericKeywords              = js.Array[GenericKeyword]
  type IconUrl                      = String
  type InvocationPhrase             = String
  type Key                          = String
  type Locale                       = String
  type MacAddress                   = String
  type MaxResults                   = Int
  type MaxVolumeLimit               = Int
  type NetworkEapMethod             = String
  type NetworkProfileDataList       = js.Array[NetworkProfileData]
  type NetworkProfileDescription    = String
  type NetworkProfileName           = String
  type NetworkSecurityType          = String
  type NetworkSsid                  = String
  type NewInThisVersionBulletPoints = js.Array[BulletPoint]
  type NextToken                    = String
  type NextWiFiPassword             = String
  type OneClickIdDelay              = String
  type OneClickPinDelay             = String
  type OrganizationName             = String
  type OutboundPhoneNumber          = String
  type PhoneNumberList              = js.Array[PhoneNumber]
  type PhoneNumberType              = String
  type PrivacyPolicy                = String
  type ProductDescription           = String
  type ProductId                    = String
  type ProfileDataList              = js.Array[ProfileData]
  type ProfileName                  = String
  type ProviderCalendarId           = String
  type RawPhoneNumber               = String
  type ReleaseDate                  = String
  type RequirePin                   = String
  type ReviewKey                    = String
  type ReviewValue                  = String
  type Reviews                      = js.Dictionary[ReviewValue]
  type RoomDataList                 = js.Array[RoomData]
  type RoomDescription              = String
  type RoomName                     = String
  type RoomSkillParameterKey        = String
  type RoomSkillParameterValue      = String
  type RoomSkillParameters          = js.Array[RoomSkillParameter]
  type S3KeyPrefix                  = String
  type SampleUtterances             = js.Array[Utterance]
  type ShortDescription             = String
  type ShortSkillIdList             = js.Array[SkillId]
  type SipAddressList               = js.Array[SipAddress]
  type SipType                      = String
  type SipUri                       = String
  type SkillGroupDataList           = js.Array[SkillGroupData]
  type SkillGroupDescription        = String
  type SkillGroupName               = String
  type SkillId                      = String
  type SkillListMaxResults          = Int
  type SkillName                    = String
  type SkillStoreType               = String
  type SkillSummaryList             = js.Array[SkillSummary]
  type SkillType                    = String
  type SkillTypeFilter              = String
  type SkillTypes                   = js.Array[SkillStoreType]
  type SkillsStoreSkillList         = js.Array[SkillsStoreSkill]
  type SmartHomeApplianceList       = js.Array[SmartHomeAppliance]
  type SoftwareVersion              = String
  type SortKey                      = String
  type SortList                     = js.Array[Sort]
  type SortValue                    = String
  type SsmlList                     = js.Array[Ssml]
  type SsmlValue                    = String
  type TagKey                       = String
  type TagKeyList                   = js.Array[TagKey]
  type TagList                      = js.Array[Tag]
  type TagValue                     = String
  type TemperatureUnit              = String
  type TextList                     = js.Array[Text]
  type TextValue                    = String
  type TimeToLiveInSeconds          = Int
  type Timezone                     = String
  type TotalCount                   = Int
  type TrustAnchor                  = String
  type TrustAnchorList              = js.Array[TrustAnchor]
  type Url                          = String
  type UserCode                     = String
  type UserDataList                 = js.Array[UserData]
  type UserId                       = String
  type Utterance                    = String
  type Value                        = String
  type WakeWord                     = String
  type user_FirstName               = String
  type user_LastName                = String
  type user_UserId                  = String

  implicit final class AlexaForBusinessOps(val service: AlexaForBusiness) extends AnyVal {

    def approveSkillFuture(params: ApproveSkillRequest): Future[ApproveSkillResponse] =
      service.approveSkill(params).promise.toFuture
    def associateContactWithAddressBookFuture(
        params: AssociateContactWithAddressBookRequest
    ): Future[AssociateContactWithAddressBookResponse] =
      service.associateContactWithAddressBook(params).promise.toFuture
    def associateDeviceWithNetworkProfileFuture(
        params: AssociateDeviceWithNetworkProfileRequest
    ): Future[AssociateDeviceWithNetworkProfileResponse] =
      service.associateDeviceWithNetworkProfile(params).promise.toFuture
    def associateDeviceWithRoomFuture(params: AssociateDeviceWithRoomRequest): Future[AssociateDeviceWithRoomResponse] =
      service.associateDeviceWithRoom(params).promise.toFuture
    def associateSkillGroupWithRoomFuture(
        params: AssociateSkillGroupWithRoomRequest
    ): Future[AssociateSkillGroupWithRoomResponse] = service.associateSkillGroupWithRoom(params).promise.toFuture
    def associateSkillWithSkillGroupFuture(
        params: AssociateSkillWithSkillGroupRequest
    ): Future[AssociateSkillWithSkillGroupResponse] = service.associateSkillWithSkillGroup(params).promise.toFuture
    def associateSkillWithUsersFuture(params: AssociateSkillWithUsersRequest): Future[AssociateSkillWithUsersResponse] =
      service.associateSkillWithUsers(params).promise.toFuture
    def createAddressBookFuture(params: CreateAddressBookRequest): Future[CreateAddressBookResponse] =
      service.createAddressBook(params).promise.toFuture
    def createBusinessReportScheduleFuture(
        params: CreateBusinessReportScheduleRequest
    ): Future[CreateBusinessReportScheduleResponse] = service.createBusinessReportSchedule(params).promise.toFuture
    def createConferenceProviderFuture(
        params: CreateConferenceProviderRequest
    ): Future[CreateConferenceProviderResponse] = service.createConferenceProvider(params).promise.toFuture
    def createContactFuture(params: CreateContactRequest): Future[CreateContactResponse] =
      service.createContact(params).promise.toFuture
    def createGatewayGroupFuture(params: CreateGatewayGroupRequest): Future[CreateGatewayGroupResponse] =
      service.createGatewayGroup(params).promise.toFuture
    def createNetworkProfileFuture(params: CreateNetworkProfileRequest): Future[CreateNetworkProfileResponse] =
      service.createNetworkProfile(params).promise.toFuture
    def createProfileFuture(params: CreateProfileRequest): Future[CreateProfileResponse] =
      service.createProfile(params).promise.toFuture
    def createRoomFuture(params: CreateRoomRequest): Future[CreateRoomResponse] =
      service.createRoom(params).promise.toFuture
    def createSkillGroupFuture(params: CreateSkillGroupRequest): Future[CreateSkillGroupResponse] =
      service.createSkillGroup(params).promise.toFuture
    def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] =
      service.createUser(params).promise.toFuture
    def deleteAddressBookFuture(params: DeleteAddressBookRequest): Future[DeleteAddressBookResponse] =
      service.deleteAddressBook(params).promise.toFuture
    def deleteBusinessReportScheduleFuture(
        params: DeleteBusinessReportScheduleRequest
    ): Future[DeleteBusinessReportScheduleResponse] = service.deleteBusinessReportSchedule(params).promise.toFuture
    def deleteConferenceProviderFuture(
        params: DeleteConferenceProviderRequest
    ): Future[DeleteConferenceProviderResponse] = service.deleteConferenceProvider(params).promise.toFuture
    def deleteContactFuture(params: DeleteContactRequest): Future[DeleteContactResponse] =
      service.deleteContact(params).promise.toFuture
    def deleteDeviceFuture(params: DeleteDeviceRequest): Future[DeleteDeviceResponse] =
      service.deleteDevice(params).promise.toFuture
    def deleteDeviceUsageDataFuture(params: DeleteDeviceUsageDataRequest): Future[DeleteDeviceUsageDataResponse] =
      service.deleteDeviceUsageData(params).promise.toFuture
    def deleteGatewayGroupFuture(params: DeleteGatewayGroupRequest): Future[DeleteGatewayGroupResponse] =
      service.deleteGatewayGroup(params).promise.toFuture
    def deleteNetworkProfileFuture(params: DeleteNetworkProfileRequest): Future[DeleteNetworkProfileResponse] =
      service.deleteNetworkProfile(params).promise.toFuture
    def deleteProfileFuture(params: DeleteProfileRequest): Future[DeleteProfileResponse] =
      service.deleteProfile(params).promise.toFuture
    def deleteRoomFuture(params: DeleteRoomRequest): Future[DeleteRoomResponse] =
      service.deleteRoom(params).promise.toFuture
    def deleteRoomSkillParameterFuture(
        params: DeleteRoomSkillParameterRequest
    ): Future[DeleteRoomSkillParameterResponse] = service.deleteRoomSkillParameter(params).promise.toFuture
    def deleteSkillAuthorizationFuture(
        params: DeleteSkillAuthorizationRequest
    ): Future[DeleteSkillAuthorizationResponse] = service.deleteSkillAuthorization(params).promise.toFuture
    def deleteSkillGroupFuture(params: DeleteSkillGroupRequest): Future[DeleteSkillGroupResponse] =
      service.deleteSkillGroup(params).promise.toFuture
    def deleteUserFuture(params: DeleteUserRequest): Future[DeleteUserResponse] =
      service.deleteUser(params).promise.toFuture
    def disassociateContactFromAddressBookFuture(
        params: DisassociateContactFromAddressBookRequest
    ): Future[DisassociateContactFromAddressBookResponse] =
      service.disassociateContactFromAddressBook(params).promise.toFuture
    def disassociateDeviceFromRoomFuture(
        params: DisassociateDeviceFromRoomRequest
    ): Future[DisassociateDeviceFromRoomResponse] = service.disassociateDeviceFromRoom(params).promise.toFuture
    def disassociateSkillFromSkillGroupFuture(
        params: DisassociateSkillFromSkillGroupRequest
    ): Future[DisassociateSkillFromSkillGroupResponse] =
      service.disassociateSkillFromSkillGroup(params).promise.toFuture
    def disassociateSkillFromUsersFuture(
        params: DisassociateSkillFromUsersRequest
    ): Future[DisassociateSkillFromUsersResponse] = service.disassociateSkillFromUsers(params).promise.toFuture
    def disassociateSkillGroupFromRoomFuture(
        params: DisassociateSkillGroupFromRoomRequest
    ): Future[DisassociateSkillGroupFromRoomResponse] = service.disassociateSkillGroupFromRoom(params).promise.toFuture
    def forgetSmartHomeAppliancesFuture(
        params: ForgetSmartHomeAppliancesRequest
    ): Future[ForgetSmartHomeAppliancesResponse] = service.forgetSmartHomeAppliances(params).promise.toFuture
    def getAddressBookFuture(params: GetAddressBookRequest): Future[GetAddressBookResponse] =
      service.getAddressBook(params).promise.toFuture
    def getConferencePreferenceFuture(params: GetConferencePreferenceRequest): Future[GetConferencePreferenceResponse] =
      service.getConferencePreference(params).promise.toFuture
    def getConferenceProviderFuture(params: GetConferenceProviderRequest): Future[GetConferenceProviderResponse] =
      service.getConferenceProvider(params).promise.toFuture
    def getContactFuture(params: GetContactRequest): Future[GetContactResponse] =
      service.getContact(params).promise.toFuture
    def getDeviceFuture(params: GetDeviceRequest): Future[GetDeviceResponse] =
      service.getDevice(params).promise.toFuture
    def getGatewayFuture(params: GetGatewayRequest): Future[GetGatewayResponse] =
      service.getGateway(params).promise.toFuture
    def getGatewayGroupFuture(params: GetGatewayGroupRequest): Future[GetGatewayGroupResponse] =
      service.getGatewayGroup(params).promise.toFuture
    def getInvitationConfigurationFuture(
        params: GetInvitationConfigurationRequest
    ): Future[GetInvitationConfigurationResponse] = service.getInvitationConfiguration(params).promise.toFuture
    def getNetworkProfileFuture(params: GetNetworkProfileRequest): Future[GetNetworkProfileResponse] =
      service.getNetworkProfile(params).promise.toFuture
    def getProfileFuture(params: GetProfileRequest): Future[GetProfileResponse] =
      service.getProfile(params).promise.toFuture
    def getRoomFuture(params: GetRoomRequest): Future[GetRoomResponse] = service.getRoom(params).promise.toFuture
    def getRoomSkillParameterFuture(params: GetRoomSkillParameterRequest): Future[GetRoomSkillParameterResponse] =
      service.getRoomSkillParameter(params).promise.toFuture
    def getSkillGroupFuture(params: GetSkillGroupRequest): Future[GetSkillGroupResponse] =
      service.getSkillGroup(params).promise.toFuture
    def listBusinessReportSchedulesFuture(
        params: ListBusinessReportSchedulesRequest
    ): Future[ListBusinessReportSchedulesResponse] = service.listBusinessReportSchedules(params).promise.toFuture
    def listConferenceProvidersFuture(params: ListConferenceProvidersRequest): Future[ListConferenceProvidersResponse] =
      service.listConferenceProviders(params).promise.toFuture
    def listDeviceEventsFuture(params: ListDeviceEventsRequest): Future[ListDeviceEventsResponse] =
      service.listDeviceEvents(params).promise.toFuture
    def listGatewayGroupsFuture(params: ListGatewayGroupsRequest): Future[ListGatewayGroupsResponse] =
      service.listGatewayGroups(params).promise.toFuture
    def listGatewaysFuture(params: ListGatewaysRequest): Future[ListGatewaysResponse] =
      service.listGateways(params).promise.toFuture
    def listSkillsFuture(params: ListSkillsRequest): Future[ListSkillsResponse] =
      service.listSkills(params).promise.toFuture
    def listSkillsStoreCategoriesFuture(
        params: ListSkillsStoreCategoriesRequest
    ): Future[ListSkillsStoreCategoriesResponse] = service.listSkillsStoreCategories(params).promise.toFuture
    def listSkillsStoreSkillsByCategoryFuture(
        params: ListSkillsStoreSkillsByCategoryRequest
    ): Future[ListSkillsStoreSkillsByCategoryResponse] =
      service.listSkillsStoreSkillsByCategory(params).promise.toFuture
    def listSmartHomeAppliancesFuture(params: ListSmartHomeAppliancesRequest): Future[ListSmartHomeAppliancesResponse] =
      service.listSmartHomeAppliances(params).promise.toFuture
    def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] = service.listTags(params).promise.toFuture
    def putConferencePreferenceFuture(params: PutConferencePreferenceRequest): Future[PutConferencePreferenceResponse] =
      service.putConferencePreference(params).promise.toFuture
    def putInvitationConfigurationFuture(
        params: PutInvitationConfigurationRequest
    ): Future[PutInvitationConfigurationResponse] = service.putInvitationConfiguration(params).promise.toFuture
    def putRoomSkillParameterFuture(params: PutRoomSkillParameterRequest): Future[PutRoomSkillParameterResponse] =
      service.putRoomSkillParameter(params).promise.toFuture
    def putSkillAuthorizationFuture(params: PutSkillAuthorizationRequest): Future[PutSkillAuthorizationResponse] =
      service.putSkillAuthorization(params).promise.toFuture
    def registerAVSDeviceFuture(params: RegisterAVSDeviceRequest): Future[RegisterAVSDeviceResponse] =
      service.registerAVSDevice(params).promise.toFuture
    def rejectSkillFuture(params: RejectSkillRequest): Future[RejectSkillResponse] =
      service.rejectSkill(params).promise.toFuture
    def resolveRoomFuture(params: ResolveRoomRequest): Future[ResolveRoomResponse] =
      service.resolveRoom(params).promise.toFuture
    def revokeInvitationFuture(params: RevokeInvitationRequest): Future[RevokeInvitationResponse] =
      service.revokeInvitation(params).promise.toFuture
    def searchAddressBooksFuture(params: SearchAddressBooksRequest): Future[SearchAddressBooksResponse] =
      service.searchAddressBooks(params).promise.toFuture
    def searchContactsFuture(params: SearchContactsRequest): Future[SearchContactsResponse] =
      service.searchContacts(params).promise.toFuture
    def searchDevicesFuture(params: SearchDevicesRequest): Future[SearchDevicesResponse] =
      service.searchDevices(params).promise.toFuture
    def searchNetworkProfilesFuture(params: SearchNetworkProfilesRequest): Future[SearchNetworkProfilesResponse] =
      service.searchNetworkProfiles(params).promise.toFuture
    def searchProfilesFuture(params: SearchProfilesRequest): Future[SearchProfilesResponse] =
      service.searchProfiles(params).promise.toFuture
    def searchRoomsFuture(params: SearchRoomsRequest): Future[SearchRoomsResponse] =
      service.searchRooms(params).promise.toFuture
    def searchSkillGroupsFuture(params: SearchSkillGroupsRequest): Future[SearchSkillGroupsResponse] =
      service.searchSkillGroups(params).promise.toFuture
    def searchUsersFuture(params: SearchUsersRequest): Future[SearchUsersResponse] =
      service.searchUsers(params).promise.toFuture
    def sendAnnouncementFuture(params: SendAnnouncementRequest): Future[SendAnnouncementResponse] =
      service.sendAnnouncement(params).promise.toFuture
    def sendInvitationFuture(params: SendInvitationRequest): Future[SendInvitationResponse] =
      service.sendInvitation(params).promise.toFuture
    def startDeviceSyncFuture(params: StartDeviceSyncRequest): Future[StartDeviceSyncResponse] =
      service.startDeviceSync(params).promise.toFuture
    def startSmartHomeApplianceDiscoveryFuture(
        params: StartSmartHomeApplianceDiscoveryRequest
    ): Future[StartSmartHomeApplianceDiscoveryResponse] =
      service.startSmartHomeApplianceDiscovery(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updateAddressBookFuture(params: UpdateAddressBookRequest): Future[UpdateAddressBookResponse] =
      service.updateAddressBook(params).promise.toFuture
    def updateBusinessReportScheduleFuture(
        params: UpdateBusinessReportScheduleRequest
    ): Future[UpdateBusinessReportScheduleResponse] = service.updateBusinessReportSchedule(params).promise.toFuture
    def updateConferenceProviderFuture(
        params: UpdateConferenceProviderRequest
    ): Future[UpdateConferenceProviderResponse] = service.updateConferenceProvider(params).promise.toFuture
    def updateContactFuture(params: UpdateContactRequest): Future[UpdateContactResponse] =
      service.updateContact(params).promise.toFuture
    def updateDeviceFuture(params: UpdateDeviceRequest): Future[UpdateDeviceResponse] =
      service.updateDevice(params).promise.toFuture
    def updateGatewayFuture(params: UpdateGatewayRequest): Future[UpdateGatewayResponse] =
      service.updateGateway(params).promise.toFuture
    def updateGatewayGroupFuture(params: UpdateGatewayGroupRequest): Future[UpdateGatewayGroupResponse] =
      service.updateGatewayGroup(params).promise.toFuture
    def updateNetworkProfileFuture(params: UpdateNetworkProfileRequest): Future[UpdateNetworkProfileResponse] =
      service.updateNetworkProfile(params).promise.toFuture
    def updateProfileFuture(params: UpdateProfileRequest): Future[UpdateProfileResponse] =
      service.updateProfile(params).promise.toFuture
    def updateRoomFuture(params: UpdateRoomRequest): Future[UpdateRoomResponse] =
      service.updateRoom(params).promise.toFuture
    def updateSkillGroupFuture(params: UpdateSkillGroupRequest): Future[UpdateSkillGroupResponse] =
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
    def apply(
        AddressBookArn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[AddressBookDescription] = js.undefined,
        Name: js.UndefOr[AddressBookName] = js.undefined
    ): AddressBook = {
      val __obj = js.Dictionary.empty[js.Any]
      AddressBookArn.foreach(__v => __obj.update("AddressBookArn", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
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
    def apply(
        AddressBookArn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[AddressBookDescription] = js.undefined,
        Name: js.UndefOr[AddressBookName] = js.undefined
    ): AddressBookData = {
      val __obj = js.Dictionary.empty[js.Any]
      AddressBookArn.foreach(__v => __obj.update("AddressBookArn", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddressBookData]
    }
  }

  @js.native
  trait ApproveSkillRequest extends js.Object {
    var SkillId: SkillId
  }

  object ApproveSkillRequest {
    def apply(
        SkillId: SkillId
    ): ApproveSkillRequest = {
      val __obj = js.Dictionary[js.Any](
        "SkillId" -> SkillId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ApproveSkillRequest]
    }
  }

  @js.native
  trait ApproveSkillResponse extends js.Object {}

  object ApproveSkillResponse {
    def apply(
        ): ApproveSkillResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[ApproveSkillResponse]
    }
  }

  @js.native
  trait AssociateContactWithAddressBookRequest extends js.Object {
    var AddressBookArn: Arn
    var ContactArn: Arn
  }

  object AssociateContactWithAddressBookRequest {
    def apply(
        AddressBookArn: Arn,
        ContactArn: Arn
    ): AssociateContactWithAddressBookRequest = {
      val __obj = js.Dictionary[js.Any](
        "AddressBookArn" -> AddressBookArn.asInstanceOf[js.Any],
        "ContactArn"     -> ContactArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateContactWithAddressBookRequest]
    }
  }

  @js.native
  trait AssociateContactWithAddressBookResponse extends js.Object {}

  object AssociateContactWithAddressBookResponse {
    def apply(
        ): AssociateContactWithAddressBookResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AssociateContactWithAddressBookResponse]
    }
  }

  @js.native
  trait AssociateDeviceWithNetworkProfileRequest extends js.Object {
    var DeviceArn: Arn
    var NetworkProfileArn: Arn
  }

  object AssociateDeviceWithNetworkProfileRequest {
    def apply(
        DeviceArn: Arn,
        NetworkProfileArn: Arn
    ): AssociateDeviceWithNetworkProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "DeviceArn"         -> DeviceArn.asInstanceOf[js.Any],
        "NetworkProfileArn" -> NetworkProfileArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateDeviceWithNetworkProfileRequest]
    }
  }

  @js.native
  trait AssociateDeviceWithNetworkProfileResponse extends js.Object {}

  object AssociateDeviceWithNetworkProfileResponse {
    def apply(
        ): AssociateDeviceWithNetworkProfileResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AssociateDeviceWithNetworkProfileResponse]
    }
  }

  @js.native
  trait AssociateDeviceWithRoomRequest extends js.Object {
    var DeviceArn: js.UndefOr[Arn]
    var RoomArn: js.UndefOr[Arn]
  }

  object AssociateDeviceWithRoomRequest {
    def apply(
        DeviceArn: js.UndefOr[Arn] = js.undefined,
        RoomArn: js.UndefOr[Arn] = js.undefined
    ): AssociateDeviceWithRoomRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      DeviceArn.foreach(__v => __obj.update("DeviceArn", __v.asInstanceOf[js.Any]))
      RoomArn.foreach(__v => __obj.update("RoomArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateDeviceWithRoomRequest]
    }
  }

  @js.native
  trait AssociateDeviceWithRoomResponse extends js.Object {}

  object AssociateDeviceWithRoomResponse {
    def apply(
        ): AssociateDeviceWithRoomResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AssociateDeviceWithRoomResponse]
    }
  }

  @js.native
  trait AssociateSkillGroupWithRoomRequest extends js.Object {
    var RoomArn: js.UndefOr[Arn]
    var SkillGroupArn: js.UndefOr[Arn]
  }

  object AssociateSkillGroupWithRoomRequest {
    def apply(
        RoomArn: js.UndefOr[Arn] = js.undefined,
        SkillGroupArn: js.UndefOr[Arn] = js.undefined
    ): AssociateSkillGroupWithRoomRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      RoomArn.foreach(__v => __obj.update("RoomArn", __v.asInstanceOf[js.Any]))
      SkillGroupArn.foreach(__v => __obj.update("SkillGroupArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateSkillGroupWithRoomRequest]
    }
  }

  @js.native
  trait AssociateSkillGroupWithRoomResponse extends js.Object {}

  object AssociateSkillGroupWithRoomResponse {
    def apply(
        ): AssociateSkillGroupWithRoomResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AssociateSkillGroupWithRoomResponse]
    }
  }

  @js.native
  trait AssociateSkillWithSkillGroupRequest extends js.Object {
    var SkillId: SkillId
    var SkillGroupArn: js.UndefOr[Arn]
  }

  object AssociateSkillWithSkillGroupRequest {
    def apply(
        SkillId: SkillId,
        SkillGroupArn: js.UndefOr[Arn] = js.undefined
    ): AssociateSkillWithSkillGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "SkillId" -> SkillId.asInstanceOf[js.Any]
      )

      SkillGroupArn.foreach(__v => __obj.update("SkillGroupArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateSkillWithSkillGroupRequest]
    }
  }

  @js.native
  trait AssociateSkillWithSkillGroupResponse extends js.Object {}

  object AssociateSkillWithSkillGroupResponse {
    def apply(
        ): AssociateSkillWithSkillGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AssociateSkillWithSkillGroupResponse]
    }
  }

  @js.native
  trait AssociateSkillWithUsersRequest extends js.Object {
    var SkillId: SkillId
  }

  object AssociateSkillWithUsersRequest {
    def apply(
        SkillId: SkillId
    ): AssociateSkillWithUsersRequest = {
      val __obj = js.Dictionary[js.Any](
        "SkillId" -> SkillId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateSkillWithUsersRequest]
    }
  }

  @js.native
  trait AssociateSkillWithUsersResponse extends js.Object {}

  object AssociateSkillWithUsersResponse {
    def apply(
        ): AssociateSkillWithUsersResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        Locale: Locale,
        Location: AudioLocation
    ): Audio = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        DeliveryTime: js.UndefOr[BusinessReportDeliveryTime] = js.undefined,
        DownloadUrl: js.UndefOr[BusinessReportDownloadUrl] = js.undefined,
        FailureCode: js.UndefOr[BusinessReportFailureCode] = js.undefined,
        S3Location: js.UndefOr[BusinessReportS3Location] = js.undefined,
        Status: js.UndefOr[BusinessReportStatus] = js.undefined
    ): BusinessReport = {
      val __obj = js.Dictionary.empty[js.Any]
      DeliveryTime.foreach(__v => __obj.update("DeliveryTime", __v.asInstanceOf[js.Any]))
      DownloadUrl.foreach(__v => __obj.update("DownloadUrl", __v.asInstanceOf[js.Any]))
      FailureCode.foreach(__v => __obj.update("FailureCode", __v.asInstanceOf[js.Any]))
      S3Location.foreach(__v => __obj.update("S3Location", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
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
    def apply(
        Interval: js.UndefOr[BusinessReportInterval] = js.undefined
    ): BusinessReportContentRange = {
      val __obj = js.Dictionary.empty[js.Any]
      Interval.foreach(__v => __obj.update("Interval", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BusinessReportContentRange]
    }
  }

  object BusinessReportFailureCodeEnum {
    val ACCESS_DENIED    = "ACCESS_DENIED"
    val NO_SUCH_BUCKET   = "NO_SUCH_BUCKET"
    val INTERNAL_FAILURE = "INTERNAL_FAILURE"

    val values = IndexedSeq(ACCESS_DENIED, NO_SUCH_BUCKET, INTERNAL_FAILURE)
  }

  object BusinessReportFormatEnum {
    val CSV     = "CSV"
    val CSV_ZIP = "CSV_ZIP"

    val values = IndexedSeq(CSV, CSV_ZIP)
  }

  object BusinessReportIntervalEnum {
    val ONE_DAY  = "ONE_DAY"
    val ONE_WEEK = "ONE_WEEK"

    val values = IndexedSeq(ONE_DAY, ONE_WEEK)
  }

  /**
    * The recurrence of the reports.
    */
  @js.native
  trait BusinessReportRecurrence extends js.Object {
    var StartDate: js.UndefOr[Date]
  }

  object BusinessReportRecurrence {
    def apply(
        StartDate: js.UndefOr[Date] = js.undefined
    ): BusinessReportRecurrence = {
      val __obj = js.Dictionary.empty[js.Any]
      StartDate.foreach(__v => __obj.update("StartDate", __v.asInstanceOf[js.Any]))
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
    def apply(
        BucketName: js.UndefOr[CustomerS3BucketName] = js.undefined,
        Path: js.UndefOr[BusinessReportS3Path] = js.undefined
    ): BusinessReportS3Location = {
      val __obj = js.Dictionary.empty[js.Any]
      BucketName.foreach(__v => __obj.update("BucketName", __v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.update("Path", __v.asInstanceOf[js.Any]))
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
      val __obj = js.Dictionary.empty[js.Any]
      ContentRange.foreach(__v => __obj.update("ContentRange", __v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.update("Format", __v.asInstanceOf[js.Any]))
      LastBusinessReport.foreach(__v => __obj.update("LastBusinessReport", __v.asInstanceOf[js.Any]))
      Recurrence.foreach(__v => __obj.update("Recurrence", __v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.update("S3BucketName", __v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.update("S3KeyPrefix", __v.asInstanceOf[js.Any]))
      ScheduleArn.foreach(__v => __obj.update("ScheduleArn", __v.asInstanceOf[js.Any]))
      ScheduleName.foreach(__v => __obj.update("ScheduleName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BusinessReportSchedule]
    }
  }

  object BusinessReportStatusEnum {
    val RUNNING   = "RUNNING"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED    = "FAILED"

    val values = IndexedSeq(RUNNING, SUCCEEDED, FAILED)
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
    def apply(
        CategoryId: js.UndefOr[CategoryId] = js.undefined,
        CategoryName: js.UndefOr[CategoryName] = js.undefined
    ): Category = {
      val __obj = js.Dictionary.empty[js.Any]
      CategoryId.foreach(__v => __obj.update("CategoryId", __v.asInstanceOf[js.Any]))
      CategoryName.foreach(__v => __obj.update("CategoryName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Category]
    }
  }

  object CommsProtocolEnum {
    val SIP  = "SIP"
    val SIPS = "SIPS"
    val H323 = "H323"

    val values = IndexedSeq(SIP, SIPS, H323)
  }

  /**
    * The default conference provider that is used if no other scheduled meetings are detected.
    */
  @js.native
  trait ConferencePreference extends js.Object {
    var DefaultConferenceProviderArn: js.UndefOr[Arn]
  }

  object ConferencePreference {
    def apply(
        DefaultConferenceProviderArn: js.UndefOr[Arn] = js.undefined
    ): ConferencePreference = {
      val __obj = js.Dictionary.empty[js.Any]
      DefaultConferenceProviderArn.foreach(
        __v => __obj.update("DefaultConferenceProviderArn", __v.asInstanceOf[js.Any])
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
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        IPDialIn: js.UndefOr[IPDialIn] = js.undefined,
        MeetingSetting: js.UndefOr[MeetingSetting] = js.undefined,
        Name: js.UndefOr[ConferenceProviderName] = js.undefined,
        PSTNDialIn: js.UndefOr[PSTNDialIn] = js.undefined,
        Type: js.UndefOr[ConferenceProviderType] = js.undefined
    ): ConferenceProvider = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      IPDialIn.foreach(__v => __obj.update("IPDialIn", __v.asInstanceOf[js.Any]))
      MeetingSetting.foreach(__v => __obj.update("MeetingSetting", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      PSTNDialIn.foreach(__v => __obj.update("PSTNDialIn", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConferenceProvider]
    }
  }

  object ConferenceProviderTypeEnum {
    val CHIME              = "CHIME"
    val BLUEJEANS          = "BLUEJEANS"
    val FUZE               = "FUZE"
    val GOOGLE_HANGOUTS    = "GOOGLE_HANGOUTS"
    val POLYCOM            = "POLYCOM"
    val RINGCENTRAL        = "RINGCENTRAL"
    val SKYPE_FOR_BUSINESS = "SKYPE_FOR_BUSINESS"
    val WEBEX              = "WEBEX"
    val ZOOM               = "ZOOM"
    val CUSTOM             = "CUSTOM"

    val values =
      IndexedSeq(CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM, RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM)
  }

  object ConnectionStatusEnum {
    val ONLINE  = "ONLINE"
    val OFFLINE = "OFFLINE"

    val values = IndexedSeq(ONLINE, OFFLINE)
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
    def apply(
        ContactArn: js.UndefOr[Arn] = js.undefined,
        DisplayName: js.UndefOr[ContactName] = js.undefined,
        FirstName: js.UndefOr[ContactName] = js.undefined,
        LastName: js.UndefOr[ContactName] = js.undefined,
        PhoneNumber: js.UndefOr[RawPhoneNumber] = js.undefined,
        PhoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined,
        SipAddresses: js.UndefOr[SipAddressList] = js.undefined
    ): Contact = {
      val __obj = js.Dictionary.empty[js.Any]
      ContactArn.foreach(__v => __obj.update("ContactArn", __v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.update("DisplayName", __v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.update("FirstName", __v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.update("LastName", __v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.update("PhoneNumber", __v.asInstanceOf[js.Any]))
      PhoneNumbers.foreach(__v => __obj.update("PhoneNumbers", __v.asInstanceOf[js.Any]))
      SipAddresses.foreach(__v => __obj.update("SipAddresses", __v.asInstanceOf[js.Any]))
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
    def apply(
        ContactArn: js.UndefOr[Arn] = js.undefined,
        DisplayName: js.UndefOr[ContactName] = js.undefined,
        FirstName: js.UndefOr[ContactName] = js.undefined,
        LastName: js.UndefOr[ContactName] = js.undefined,
        PhoneNumber: js.UndefOr[RawPhoneNumber] = js.undefined,
        PhoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined,
        SipAddresses: js.UndefOr[SipAddressList] = js.undefined
    ): ContactData = {
      val __obj = js.Dictionary.empty[js.Any]
      ContactArn.foreach(__v => __obj.update("ContactArn", __v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.update("DisplayName", __v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.update("FirstName", __v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.update("LastName", __v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.update("PhoneNumber", __v.asInstanceOf[js.Any]))
      PhoneNumbers.foreach(__v => __obj.update("PhoneNumbers", __v.asInstanceOf[js.Any]))
      SipAddresses.foreach(__v => __obj.update("SipAddresses", __v.asInstanceOf[js.Any]))
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
    def apply(
        AudioList: js.UndefOr[AudioList] = js.undefined,
        SsmlList: js.UndefOr[SsmlList] = js.undefined,
        TextList: js.UndefOr[TextList] = js.undefined
    ): Content = {
      val __obj = js.Dictionary.empty[js.Any]
      AudioList.foreach(__v => __obj.update("AudioList", __v.asInstanceOf[js.Any]))
      SsmlList.foreach(__v => __obj.update("SsmlList", __v.asInstanceOf[js.Any]))
      TextList.foreach(__v => __obj.update("TextList", __v.asInstanceOf[js.Any]))
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
    def apply(
        Name: AddressBookName,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Description: js.UndefOr[AddressBookDescription] = js.undefined
    ): CreateAddressBookRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.update("ClientRequestToken", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAddressBookRequest]
    }
  }

  @js.native
  trait CreateAddressBookResponse extends js.Object {
    var AddressBookArn: js.UndefOr[Arn]
  }

  object CreateAddressBookResponse {
    def apply(
        AddressBookArn: js.UndefOr[Arn] = js.undefined
    ): CreateAddressBookResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AddressBookArn.foreach(__v => __obj.update("AddressBookArn", __v.asInstanceOf[js.Any]))
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
    def apply(
        ContentRange: BusinessReportContentRange,
        Format: BusinessReportFormat,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Recurrence: js.UndefOr[BusinessReportRecurrence] = js.undefined,
        S3BucketName: js.UndefOr[CustomerS3BucketName] = js.undefined,
        S3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
        ScheduleName: js.UndefOr[BusinessReportScheduleName] = js.undefined
    ): CreateBusinessReportScheduleRequest = {
      val __obj = js.Dictionary[js.Any](
        "ContentRange" -> ContentRange.asInstanceOf[js.Any],
        "Format"       -> Format.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.update("ClientRequestToken", __v.asInstanceOf[js.Any]))
      Recurrence.foreach(__v => __obj.update("Recurrence", __v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.update("S3BucketName", __v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.update("S3KeyPrefix", __v.asInstanceOf[js.Any]))
      ScheduleName.foreach(__v => __obj.update("ScheduleName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBusinessReportScheduleRequest]
    }
  }

  @js.native
  trait CreateBusinessReportScheduleResponse extends js.Object {
    var ScheduleArn: js.UndefOr[Arn]
  }

  object CreateBusinessReportScheduleResponse {
    def apply(
        ScheduleArn: js.UndefOr[Arn] = js.undefined
    ): CreateBusinessReportScheduleResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ScheduleArn.foreach(__v => __obj.update("ScheduleArn", __v.asInstanceOf[js.Any]))
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
    def apply(
        ConferenceProviderName: ConferenceProviderName,
        ConferenceProviderType: ConferenceProviderType,
        MeetingSetting: MeetingSetting,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        IPDialIn: js.UndefOr[IPDialIn] = js.undefined,
        PSTNDialIn: js.UndefOr[PSTNDialIn] = js.undefined
    ): CreateConferenceProviderRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConferenceProviderName" -> ConferenceProviderName.asInstanceOf[js.Any],
        "ConferenceProviderType" -> ConferenceProviderType.asInstanceOf[js.Any],
        "MeetingSetting"         -> MeetingSetting.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.update("ClientRequestToken", __v.asInstanceOf[js.Any]))
      IPDialIn.foreach(__v => __obj.update("IPDialIn", __v.asInstanceOf[js.Any]))
      PSTNDialIn.foreach(__v => __obj.update("PSTNDialIn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConferenceProviderRequest]
    }
  }

  @js.native
  trait CreateConferenceProviderResponse extends js.Object {
    var ConferenceProviderArn: js.UndefOr[Arn]
  }

  object CreateConferenceProviderResponse {
    def apply(
        ConferenceProviderArn: js.UndefOr[Arn] = js.undefined
    ): CreateConferenceProviderResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ConferenceProviderArn.foreach(__v => __obj.update("ConferenceProviderArn", __v.asInstanceOf[js.Any]))
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
    def apply(
        FirstName: ContactName,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        DisplayName: js.UndefOr[ContactName] = js.undefined,
        LastName: js.UndefOr[ContactName] = js.undefined,
        PhoneNumber: js.UndefOr[RawPhoneNumber] = js.undefined,
        PhoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined,
        SipAddresses: js.UndefOr[SipAddressList] = js.undefined
    ): CreateContactRequest = {
      val __obj = js.Dictionary[js.Any](
        "FirstName" -> FirstName.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.update("ClientRequestToken", __v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.update("DisplayName", __v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.update("LastName", __v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.update("PhoneNumber", __v.asInstanceOf[js.Any]))
      PhoneNumbers.foreach(__v => __obj.update("PhoneNumbers", __v.asInstanceOf[js.Any]))
      SipAddresses.foreach(__v => __obj.update("SipAddresses", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateContactRequest]
    }
  }

  @js.native
  trait CreateContactResponse extends js.Object {
    var ContactArn: js.UndefOr[Arn]
  }

  object CreateContactResponse {
    def apply(
        ContactArn: js.UndefOr[Arn] = js.undefined
    ): CreateContactResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ContactArn.foreach(__v => __obj.update("ContactArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateContactResponse]
    }
  }

  @js.native
  trait CreateGatewayGroupRequest extends js.Object {
    var ClientRequestToken: ClientRequestToken
    var Name: GatewayGroupName
    var Description: js.UndefOr[GatewayGroupDescription]
  }

  object CreateGatewayGroupRequest {
    def apply(
        ClientRequestToken: ClientRequestToken,
        Name: GatewayGroupName,
        Description: js.UndefOr[GatewayGroupDescription] = js.undefined
    ): CreateGatewayGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "Name"               -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGatewayGroupRequest]
    }
  }

  @js.native
  trait CreateGatewayGroupResponse extends js.Object {
    var GatewayGroupArn: js.UndefOr[Arn]
  }

  object CreateGatewayGroupResponse {
    def apply(
        GatewayGroupArn: js.UndefOr[Arn] = js.undefined
    ): CreateGatewayGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayGroupArn.foreach(__v => __obj.update("GatewayGroupArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGatewayGroupResponse]
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
      val __obj = js.Dictionary[js.Any](
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "NetworkProfileName" -> NetworkProfileName.asInstanceOf[js.Any],
        "SecurityType"       -> SecurityType.asInstanceOf[js.Any],
        "Ssid"               -> Ssid.asInstanceOf[js.Any]
      )

      CertificateAuthorityArn.foreach(__v => __obj.update("CertificateAuthorityArn", __v.asInstanceOf[js.Any]))
      CurrentPassword.foreach(__v => __obj.update("CurrentPassword", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      EapMethod.foreach(__v => __obj.update("EapMethod", __v.asInstanceOf[js.Any]))
      NextPassword.foreach(__v => __obj.update("NextPassword", __v.asInstanceOf[js.Any]))
      TrustAnchors.foreach(__v => __obj.update("TrustAnchors", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNetworkProfileRequest]
    }
  }

  @js.native
  trait CreateNetworkProfileResponse extends js.Object {
    var NetworkProfileArn: js.UndefOr[Arn]
  }

  object CreateNetworkProfileResponse {
    def apply(
        NetworkProfileArn: js.UndefOr[Arn] = js.undefined
    ): CreateNetworkProfileResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NetworkProfileArn.foreach(__v => __obj.update("NetworkProfileArn", __v.asInstanceOf[js.Any]))
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
    var PSTNEnabled: js.UndefOr[Boolean]
    var SetupModeDisabled: js.UndefOr[Boolean]
  }

  object CreateProfileRequest {
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
        PSTNEnabled: js.UndefOr[Boolean] = js.undefined,
        SetupModeDisabled: js.UndefOr[Boolean] = js.undefined
    ): CreateProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "Address"         -> Address.asInstanceOf[js.Any],
        "DistanceUnit"    -> DistanceUnit.asInstanceOf[js.Any],
        "ProfileName"     -> ProfileName.asInstanceOf[js.Any],
        "TemperatureUnit" -> TemperatureUnit.asInstanceOf[js.Any],
        "Timezone"        -> Timezone.asInstanceOf[js.Any],
        "WakeWord"        -> WakeWord.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.update("ClientRequestToken", __v.asInstanceOf[js.Any]))
      Locale.foreach(__v => __obj.update("Locale", __v.asInstanceOf[js.Any]))
      MaxVolumeLimit.foreach(__v => __obj.update("MaxVolumeLimit", __v.asInstanceOf[js.Any]))
      PSTNEnabled.foreach(__v => __obj.update("PSTNEnabled", __v.asInstanceOf[js.Any]))
      SetupModeDisabled.foreach(__v => __obj.update("SetupModeDisabled", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProfileRequest]
    }
  }

  @js.native
  trait CreateProfileResponse extends js.Object {
    var ProfileArn: js.UndefOr[Arn]
  }

  object CreateProfileResponse {
    def apply(
        ProfileArn: js.UndefOr[Arn] = js.undefined
    ): CreateProfileResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ProfileArn.foreach(__v => __obj.update("ProfileArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProfileResponse]
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
    def apply(
        RoomName: RoomName,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Description: js.UndefOr[RoomDescription] = js.undefined,
        ProfileArn: js.UndefOr[Arn] = js.undefined,
        ProviderCalendarId: js.UndefOr[ProviderCalendarId] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateRoomRequest = {
      val __obj = js.Dictionary[js.Any](
        "RoomName" -> RoomName.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.update("ClientRequestToken", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ProfileArn.foreach(__v => __obj.update("ProfileArn", __v.asInstanceOf[js.Any]))
      ProviderCalendarId.foreach(__v => __obj.update("ProviderCalendarId", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRoomRequest]
    }
  }

  @js.native
  trait CreateRoomResponse extends js.Object {
    var RoomArn: js.UndefOr[Arn]
  }

  object CreateRoomResponse {
    def apply(
        RoomArn: js.UndefOr[Arn] = js.undefined
    ): CreateRoomResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      RoomArn.foreach(__v => __obj.update("RoomArn", __v.asInstanceOf[js.Any]))
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
    def apply(
        SkillGroupName: SkillGroupName,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Description: js.UndefOr[SkillGroupDescription] = js.undefined
    ): CreateSkillGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "SkillGroupName" -> SkillGroupName.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.update("ClientRequestToken", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSkillGroupRequest]
    }
  }

  @js.native
  trait CreateSkillGroupResponse extends js.Object {
    var SkillGroupArn: js.UndefOr[Arn]
  }

  object CreateSkillGroupResponse {
    def apply(
        SkillGroupArn: js.UndefOr[Arn] = js.undefined
    ): CreateSkillGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      SkillGroupArn.foreach(__v => __obj.update("SkillGroupArn", __v.asInstanceOf[js.Any]))
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
    def apply(
        UserId: user_UserId,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Email: js.UndefOr[Email] = js.undefined,
        FirstName: js.UndefOr[user_FirstName] = js.undefined,
        LastName: js.UndefOr[user_LastName] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateUserRequest = {
      val __obj = js.Dictionary[js.Any](
        "UserId" -> UserId.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.update("ClientRequestToken", __v.asInstanceOf[js.Any]))
      Email.foreach(__v => __obj.update("Email", __v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.update("FirstName", __v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.update("LastName", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object {
    var UserArn: js.UndefOr[Arn]
  }

  object CreateUserResponse {
    def apply(
        UserArn: js.UndefOr[Arn] = js.undefined
    ): CreateUserResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      UserArn.foreach(__v => __obj.update("UserArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserResponse]
    }
  }

  @js.native
  trait DeleteAddressBookRequest extends js.Object {
    var AddressBookArn: Arn
  }

  object DeleteAddressBookRequest {
    def apply(
        AddressBookArn: Arn
    ): DeleteAddressBookRequest = {
      val __obj = js.Dictionary[js.Any](
        "AddressBookArn" -> AddressBookArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAddressBookRequest]
    }
  }

  @js.native
  trait DeleteAddressBookResponse extends js.Object {}

  object DeleteAddressBookResponse {
    def apply(
        ): DeleteAddressBookResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteAddressBookResponse]
    }
  }

  @js.native
  trait DeleteBusinessReportScheduleRequest extends js.Object {
    var ScheduleArn: Arn
  }

  object DeleteBusinessReportScheduleRequest {
    def apply(
        ScheduleArn: Arn
    ): DeleteBusinessReportScheduleRequest = {
      val __obj = js.Dictionary[js.Any](
        "ScheduleArn" -> ScheduleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBusinessReportScheduleRequest]
    }
  }

  @js.native
  trait DeleteBusinessReportScheduleResponse extends js.Object {}

  object DeleteBusinessReportScheduleResponse {
    def apply(
        ): DeleteBusinessReportScheduleResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteBusinessReportScheduleResponse]
    }
  }

  @js.native
  trait DeleteConferenceProviderRequest extends js.Object {
    var ConferenceProviderArn: Arn
  }

  object DeleteConferenceProviderRequest {
    def apply(
        ConferenceProviderArn: Arn
    ): DeleteConferenceProviderRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConferenceProviderArn" -> ConferenceProviderArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteConferenceProviderRequest]
    }
  }

  @js.native
  trait DeleteConferenceProviderResponse extends js.Object {}

  object DeleteConferenceProviderResponse {
    def apply(
        ): DeleteConferenceProviderResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteConferenceProviderResponse]
    }
  }

  @js.native
  trait DeleteContactRequest extends js.Object {
    var ContactArn: Arn
  }

  object DeleteContactRequest {
    def apply(
        ContactArn: Arn
    ): DeleteContactRequest = {
      val __obj = js.Dictionary[js.Any](
        "ContactArn" -> ContactArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteContactRequest]
    }
  }

  @js.native
  trait DeleteContactResponse extends js.Object {}

  object DeleteContactResponse {
    def apply(
        ): DeleteContactResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteContactResponse]
    }
  }

  @js.native
  trait DeleteDeviceRequest extends js.Object {
    var DeviceArn: Arn
  }

  object DeleteDeviceRequest {
    def apply(
        DeviceArn: Arn
    ): DeleteDeviceRequest = {
      val __obj = js.Dictionary[js.Any](
        "DeviceArn" -> DeviceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDeviceRequest]
    }
  }

  @js.native
  trait DeleteDeviceResponse extends js.Object {}

  object DeleteDeviceResponse {
    def apply(
        ): DeleteDeviceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteDeviceResponse]
    }
  }

  @js.native
  trait DeleteDeviceUsageDataRequest extends js.Object {
    var DeviceArn: Arn
    var DeviceUsageType: DeviceUsageType
  }

  object DeleteDeviceUsageDataRequest {
    def apply(
        DeviceArn: Arn,
        DeviceUsageType: DeviceUsageType
    ): DeleteDeviceUsageDataRequest = {
      val __obj = js.Dictionary[js.Any](
        "DeviceArn"       -> DeviceArn.asInstanceOf[js.Any],
        "DeviceUsageType" -> DeviceUsageType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDeviceUsageDataRequest]
    }
  }

  @js.native
  trait DeleteDeviceUsageDataResponse extends js.Object {}

  object DeleteDeviceUsageDataResponse {
    def apply(
        ): DeleteDeviceUsageDataResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteDeviceUsageDataResponse]
    }
  }

  @js.native
  trait DeleteGatewayGroupRequest extends js.Object {
    var GatewayGroupArn: Arn
  }

  object DeleteGatewayGroupRequest {
    def apply(
        GatewayGroupArn: Arn
    ): DeleteGatewayGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "GatewayGroupArn" -> GatewayGroupArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteGatewayGroupRequest]
    }
  }

  @js.native
  trait DeleteGatewayGroupResponse extends js.Object {}

  object DeleteGatewayGroupResponse {
    def apply(
        ): DeleteGatewayGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteGatewayGroupResponse]
    }
  }

  @js.native
  trait DeleteNetworkProfileRequest extends js.Object {
    var NetworkProfileArn: Arn
  }

  object DeleteNetworkProfileRequest {
    def apply(
        NetworkProfileArn: Arn
    ): DeleteNetworkProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "NetworkProfileArn" -> NetworkProfileArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteNetworkProfileRequest]
    }
  }

  @js.native
  trait DeleteNetworkProfileResponse extends js.Object {}

  object DeleteNetworkProfileResponse {
    def apply(
        ): DeleteNetworkProfileResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteNetworkProfileResponse]
    }
  }

  @js.native
  trait DeleteProfileRequest extends js.Object {
    var ProfileArn: js.UndefOr[Arn]
  }

  object DeleteProfileRequest {
    def apply(
        ProfileArn: js.UndefOr[Arn] = js.undefined
    ): DeleteProfileRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      ProfileArn.foreach(__v => __obj.update("ProfileArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProfileRequest]
    }
  }

  @js.native
  trait DeleteProfileResponse extends js.Object {}

  object DeleteProfileResponse {
    def apply(
        ): DeleteProfileResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteProfileResponse]
    }
  }

  @js.native
  trait DeleteRoomRequest extends js.Object {
    var RoomArn: js.UndefOr[Arn]
  }

  object DeleteRoomRequest {
    def apply(
        RoomArn: js.UndefOr[Arn] = js.undefined
    ): DeleteRoomRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      RoomArn.foreach(__v => __obj.update("RoomArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRoomRequest]
    }
  }

  @js.native
  trait DeleteRoomResponse extends js.Object {}

  object DeleteRoomResponse {
    def apply(
        ): DeleteRoomResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        ParameterKey: RoomSkillParameterKey,
        SkillId: SkillId,
        RoomArn: js.UndefOr[Arn] = js.undefined
    ): DeleteRoomSkillParameterRequest = {
      val __obj = js.Dictionary[js.Any](
        "ParameterKey" -> ParameterKey.asInstanceOf[js.Any],
        "SkillId"      -> SkillId.asInstanceOf[js.Any]
      )

      RoomArn.foreach(__v => __obj.update("RoomArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRoomSkillParameterRequest]
    }
  }

  @js.native
  trait DeleteRoomSkillParameterResponse extends js.Object {}

  object DeleteRoomSkillParameterResponse {
    def apply(
        ): DeleteRoomSkillParameterResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteRoomSkillParameterResponse]
    }
  }

  @js.native
  trait DeleteSkillAuthorizationRequest extends js.Object {
    var SkillId: SkillId
    var RoomArn: js.UndefOr[Arn]
  }

  object DeleteSkillAuthorizationRequest {
    def apply(
        SkillId: SkillId,
        RoomArn: js.UndefOr[Arn] = js.undefined
    ): DeleteSkillAuthorizationRequest = {
      val __obj = js.Dictionary[js.Any](
        "SkillId" -> SkillId.asInstanceOf[js.Any]
      )

      RoomArn.foreach(__v => __obj.update("RoomArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSkillAuthorizationRequest]
    }
  }

  @js.native
  trait DeleteSkillAuthorizationResponse extends js.Object {}

  object DeleteSkillAuthorizationResponse {
    def apply(
        ): DeleteSkillAuthorizationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteSkillAuthorizationResponse]
    }
  }

  @js.native
  trait DeleteSkillGroupRequest extends js.Object {
    var SkillGroupArn: js.UndefOr[Arn]
  }

  object DeleteSkillGroupRequest {
    def apply(
        SkillGroupArn: js.UndefOr[Arn] = js.undefined
    ): DeleteSkillGroupRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      SkillGroupArn.foreach(__v => __obj.update("SkillGroupArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSkillGroupRequest]
    }
  }

  @js.native
  trait DeleteSkillGroupResponse extends js.Object {}

  object DeleteSkillGroupResponse {
    def apply(
        ): DeleteSkillGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteSkillGroupResponse]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var EnrollmentId: EnrollmentId
    var UserArn: js.UndefOr[Arn]
  }

  object DeleteUserRequest {
    def apply(
        EnrollmentId: EnrollmentId,
        UserArn: js.UndefOr[Arn] = js.undefined
    ): DeleteUserRequest = {
      val __obj = js.Dictionary[js.Any](
        "EnrollmentId" -> EnrollmentId.asInstanceOf[js.Any]
      )

      UserArn.foreach(__v => __obj.update("UserArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DeleteUserResponse extends js.Object {}

  object DeleteUserResponse {
    def apply(
        ): DeleteUserResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        DeveloperName: js.UndefOr[DeveloperName] = js.undefined,
        Email: js.UndefOr[Email] = js.undefined,
        PrivacyPolicy: js.UndefOr[PrivacyPolicy] = js.undefined,
        Url: js.UndefOr[Url] = js.undefined
    ): DeveloperInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      DeveloperName.foreach(__v => __obj.update("DeveloperName", __v.asInstanceOf[js.Any]))
      Email.foreach(__v => __obj.update("Email", __v.asInstanceOf[js.Any]))
      PrivacyPolicy.foreach(__v => __obj.update("PrivacyPolicy", __v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.update("Url", __v.asInstanceOf[js.Any]))
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
      val __obj = js.Dictionary.empty[js.Any]
      DeviceArn.foreach(__v => __obj.update("DeviceArn", __v.asInstanceOf[js.Any]))
      DeviceName.foreach(__v => __obj.update("DeviceName", __v.asInstanceOf[js.Any]))
      DeviceSerialNumber.foreach(__v => __obj.update("DeviceSerialNumber", __v.asInstanceOf[js.Any]))
      DeviceStatus.foreach(__v => __obj.update("DeviceStatus", __v.asInstanceOf[js.Any]))
      DeviceStatusInfo.foreach(__v => __obj.update("DeviceStatusInfo", __v.asInstanceOf[js.Any]))
      DeviceType.foreach(__v => __obj.update("DeviceType", __v.asInstanceOf[js.Any]))
      MacAddress.foreach(__v => __obj.update("MacAddress", __v.asInstanceOf[js.Any]))
      NetworkProfileInfo.foreach(__v => __obj.update("NetworkProfileInfo", __v.asInstanceOf[js.Any]))
      RoomArn.foreach(__v => __obj.update("RoomArn", __v.asInstanceOf[js.Any]))
      SoftwareVersion.foreach(__v => __obj.update("SoftwareVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Device]
    }
  }

  /**
    * Device attributes.
    */
  @js.native
  trait DeviceData extends js.Object {
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
    def apply(
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
      val __obj = js.Dictionary.empty[js.Any]
      DeviceArn.foreach(__v => __obj.update("DeviceArn", __v.asInstanceOf[js.Any]))
      DeviceName.foreach(__v => __obj.update("DeviceName", __v.asInstanceOf[js.Any]))
      DeviceSerialNumber.foreach(__v => __obj.update("DeviceSerialNumber", __v.asInstanceOf[js.Any]))
      DeviceStatus.foreach(__v => __obj.update("DeviceStatus", __v.asInstanceOf[js.Any]))
      DeviceStatusInfo.foreach(__v => __obj.update("DeviceStatusInfo", __v.asInstanceOf[js.Any]))
      DeviceType.foreach(__v => __obj.update("DeviceType", __v.asInstanceOf[js.Any]))
      MacAddress.foreach(__v => __obj.update("MacAddress", __v.asInstanceOf[js.Any]))
      NetworkProfileArn.foreach(__v => __obj.update("NetworkProfileArn", __v.asInstanceOf[js.Any]))
      NetworkProfileName.foreach(__v => __obj.update("NetworkProfileName", __v.asInstanceOf[js.Any]))
      RoomArn.foreach(__v => __obj.update("RoomArn", __v.asInstanceOf[js.Any]))
      RoomName.foreach(__v => __obj.update("RoomName", __v.asInstanceOf[js.Any]))
      SoftwareVersion.foreach(__v => __obj.update("SoftwareVersion", __v.asInstanceOf[js.Any]))
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
    def apply(
        Timestamp: js.UndefOr[DeviceEventTime] = js.undefined,
        Type: js.UndefOr[DeviceEventType] = js.undefined,
        Value: js.UndefOr[DeviceEventValue] = js.undefined
    ): DeviceEvent = {
      val __obj = js.Dictionary.empty[js.Any]
      Timestamp.foreach(__v => __obj.update("Timestamp", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceEvent]
    }
  }

  object DeviceEventTypeEnum {
    val CONNECTION_STATUS = "CONNECTION_STATUS"
    val DEVICE_STATUS     = "DEVICE_STATUS"

    val values = IndexedSeq(CONNECTION_STATUS, DEVICE_STATUS)
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
    def apply(
        CertificateArn: js.UndefOr[Arn] = js.undefined,
        CertificateExpirationTime: js.UndefOr[CertificateTime] = js.undefined,
        NetworkProfileArn: js.UndefOr[Arn] = js.undefined
    ): DeviceNetworkProfileInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      CertificateArn.foreach(__v => __obj.update("CertificateArn", __v.asInstanceOf[js.Any]))
      CertificateExpirationTime.foreach(__v => __obj.update("CertificateExpirationTime", __v.asInstanceOf[js.Any]))
      NetworkProfileArn.foreach(__v => __obj.update("NetworkProfileArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceNetworkProfileInfo]
    }
  }

  object DeviceStatusEnum {
    val READY        = "READY"
    val PENDING      = "PENDING"
    val WAS_OFFLINE  = "WAS_OFFLINE"
    val DEREGISTERED = "DEREGISTERED"
    val FAILED       = "FAILED"

    val values = IndexedSeq(READY, PENDING, WAS_OFFLINE, DEREGISTERED, FAILED)
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
    def apply(
        Code: js.UndefOr[DeviceStatusDetailCode] = js.undefined,
        Feature: js.UndefOr[Feature] = js.undefined
    ): DeviceStatusDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      Code.foreach(__v => __obj.update("Code", __v.asInstanceOf[js.Any]))
      Feature.foreach(__v => __obj.update("Feature", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceStatusDetail]
    }
  }

  object DeviceStatusDetailCodeEnum {
    val DEVICE_SOFTWARE_UPDATE_NEEDED      = "DEVICE_SOFTWARE_UPDATE_NEEDED"
    val DEVICE_WAS_OFFLINE                 = "DEVICE_WAS_OFFLINE"
    val CREDENTIALS_ACCESS_FAILURE         = "CREDENTIALS_ACCESS_FAILURE"
    val TLS_VERSION_MISMATCH               = "TLS_VERSION_MISMATCH"
    val ASSOCIATION_REJECTION              = "ASSOCIATION_REJECTION"
    val AUTHENTICATION_FAILURE             = "AUTHENTICATION_FAILURE"
    val DHCP_FAILURE                       = "DHCP_FAILURE"
    val INTERNET_UNAVAILABLE               = "INTERNET_UNAVAILABLE"
    val DNS_FAILURE                        = "DNS_FAILURE"
    val UNKNOWN_FAILURE                    = "UNKNOWN_FAILURE"
    val CERTIFICATE_ISSUING_LIMIT_EXCEEDED = "CERTIFICATE_ISSUING_LIMIT_EXCEEDED"
    val INVALID_CERTIFICATE_AUTHORITY      = "INVALID_CERTIFICATE_AUTHORITY"
    val NETWORK_PROFILE_NOT_FOUND          = "NETWORK_PROFILE_NOT_FOUND"
    val INVALID_PASSWORD_STATE             = "INVALID_PASSWORD_STATE"
    val PASSWORD_NOT_FOUND                 = "PASSWORD_NOT_FOUND"

    val values = IndexedSeq(
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
  }

  /**
    * Detailed information about a device's status.
    */
  @js.native
  trait DeviceStatusInfo extends js.Object {
    var ConnectionStatus: js.UndefOr[ConnectionStatus]
    var DeviceStatusDetails: js.UndefOr[DeviceStatusDetails]
  }

  object DeviceStatusInfo {
    def apply(
        ConnectionStatus: js.UndefOr[ConnectionStatus] = js.undefined,
        DeviceStatusDetails: js.UndefOr[DeviceStatusDetails] = js.undefined
    ): DeviceStatusInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      ConnectionStatus.foreach(__v => __obj.update("ConnectionStatus", __v.asInstanceOf[js.Any]))
      DeviceStatusDetails.foreach(__v => __obj.update("DeviceStatusDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceStatusInfo]
    }
  }

  object DeviceUsageTypeEnum {
    val VOICE = "VOICE"

    val values = IndexedSeq(VOICE)
  }

  @js.native
  trait DisassociateContactFromAddressBookRequest extends js.Object {
    var AddressBookArn: Arn
    var ContactArn: Arn
  }

  object DisassociateContactFromAddressBookRequest {
    def apply(
        AddressBookArn: Arn,
        ContactArn: Arn
    ): DisassociateContactFromAddressBookRequest = {
      val __obj = js.Dictionary[js.Any](
        "AddressBookArn" -> AddressBookArn.asInstanceOf[js.Any],
        "ContactArn"     -> ContactArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateContactFromAddressBookRequest]
    }
  }

  @js.native
  trait DisassociateContactFromAddressBookResponse extends js.Object {}

  object DisassociateContactFromAddressBookResponse {
    def apply(
        ): DisassociateContactFromAddressBookResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DisassociateContactFromAddressBookResponse]
    }
  }

  @js.native
  trait DisassociateDeviceFromRoomRequest extends js.Object {
    var DeviceArn: js.UndefOr[Arn]
  }

  object DisassociateDeviceFromRoomRequest {
    def apply(
        DeviceArn: js.UndefOr[Arn] = js.undefined
    ): DisassociateDeviceFromRoomRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      DeviceArn.foreach(__v => __obj.update("DeviceArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateDeviceFromRoomRequest]
    }
  }

  @js.native
  trait DisassociateDeviceFromRoomResponse extends js.Object {}

  object DisassociateDeviceFromRoomResponse {
    def apply(
        ): DisassociateDeviceFromRoomResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DisassociateDeviceFromRoomResponse]
    }
  }

  @js.native
  trait DisassociateSkillFromSkillGroupRequest extends js.Object {
    var SkillId: SkillId
    var SkillGroupArn: js.UndefOr[Arn]
  }

  object DisassociateSkillFromSkillGroupRequest {
    def apply(
        SkillId: SkillId,
        SkillGroupArn: js.UndefOr[Arn] = js.undefined
    ): DisassociateSkillFromSkillGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "SkillId" -> SkillId.asInstanceOf[js.Any]
      )

      SkillGroupArn.foreach(__v => __obj.update("SkillGroupArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateSkillFromSkillGroupRequest]
    }
  }

  @js.native
  trait DisassociateSkillFromSkillGroupResponse extends js.Object {}

  object DisassociateSkillFromSkillGroupResponse {
    def apply(
        ): DisassociateSkillFromSkillGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DisassociateSkillFromSkillGroupResponse]
    }
  }

  @js.native
  trait DisassociateSkillFromUsersRequest extends js.Object {
    var SkillId: SkillId
  }

  object DisassociateSkillFromUsersRequest {
    def apply(
        SkillId: SkillId
    ): DisassociateSkillFromUsersRequest = {
      val __obj = js.Dictionary[js.Any](
        "SkillId" -> SkillId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateSkillFromUsersRequest]
    }
  }

  @js.native
  trait DisassociateSkillFromUsersResponse extends js.Object {}

  object DisassociateSkillFromUsersResponse {
    def apply(
        ): DisassociateSkillFromUsersResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DisassociateSkillFromUsersResponse]
    }
  }

  @js.native
  trait DisassociateSkillGroupFromRoomRequest extends js.Object {
    var RoomArn: js.UndefOr[Arn]
    var SkillGroupArn: js.UndefOr[Arn]
  }

  object DisassociateSkillGroupFromRoomRequest {
    def apply(
        RoomArn: js.UndefOr[Arn] = js.undefined,
        SkillGroupArn: js.UndefOr[Arn] = js.undefined
    ): DisassociateSkillGroupFromRoomRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      RoomArn.foreach(__v => __obj.update("RoomArn", __v.asInstanceOf[js.Any]))
      SkillGroupArn.foreach(__v => __obj.update("SkillGroupArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateSkillGroupFromRoomRequest]
    }
  }

  @js.native
  trait DisassociateSkillGroupFromRoomResponse extends js.Object {}

  object DisassociateSkillGroupFromRoomResponse {
    def apply(
        ): DisassociateSkillGroupFromRoomResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DisassociateSkillGroupFromRoomResponse]
    }
  }

  object DistanceUnitEnum {
    val METRIC   = "METRIC"
    val IMPERIAL = "IMPERIAL"

    val values = IndexedSeq(METRIC, IMPERIAL)
  }

  object EnablementTypeEnum {
    val ENABLED = "ENABLED"
    val PENDING = "PENDING"

    val values = IndexedSeq(ENABLED, PENDING)
  }

  object EnablementTypeFilterEnum {
    val ENABLED = "ENABLED"
    val PENDING = "PENDING"

    val values = IndexedSeq(ENABLED, PENDING)
  }

  object EnrollmentStatusEnum {
    val INITIALIZED    = "INITIALIZED"
    val PENDING        = "PENDING"
    val REGISTERED     = "REGISTERED"
    val DISASSOCIATING = "DISASSOCIATING"
    val DEREGISTERING  = "DEREGISTERING"

    val values = IndexedSeq(INITIALIZED, PENDING, REGISTERED, DISASSOCIATING, DEREGISTERING)
  }

  object FeatureEnum {
    val BLUETOOTH       = "BLUETOOTH"
    val VOLUME          = "VOLUME"
    val NOTIFICATIONS   = "NOTIFICATIONS"
    val LISTS           = "LISTS"
    val SKILLS          = "SKILLS"
    val NETWORK_PROFILE = "NETWORK_PROFILE"
    val SETTINGS        = "SETTINGS"
    val ALL             = "ALL"

    val values = IndexedSeq(BLUETOOTH, VOLUME, NOTIFICATIONS, LISTS, SKILLS, NETWORK_PROFILE, SETTINGS, ALL)
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
    def apply(
        Key: FilterKey,
        Values: FilterValueList
    ): Filter = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        RoomArn: Arn
    ): ForgetSmartHomeAppliancesRequest = {
      val __obj = js.Dictionary[js.Any](
        "RoomArn" -> RoomArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ForgetSmartHomeAppliancesRequest]
    }
  }

  @js.native
  trait ForgetSmartHomeAppliancesResponse extends js.Object {}

  object ForgetSmartHomeAppliancesResponse {
    def apply(
        ): ForgetSmartHomeAppliancesResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[GatewayDescription] = js.undefined,
        GatewayGroupArn: js.UndefOr[Arn] = js.undefined,
        Name: js.UndefOr[GatewayName] = js.undefined,
        SoftwareVersion: js.UndefOr[GatewayVersion] = js.undefined
    ): Gateway = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      GatewayGroupArn.foreach(__v => __obj.update("GatewayGroupArn", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      SoftwareVersion.foreach(__v => __obj.update("SoftwareVersion", __v.asInstanceOf[js.Any]))
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
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[GatewayGroupDescription] = js.undefined,
        Name: js.UndefOr[GatewayGroupName] = js.undefined
    ): GatewayGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
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
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[GatewayGroupDescription] = js.undefined,
        Name: js.UndefOr[GatewayGroupName] = js.undefined
    ): GatewayGroupSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
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
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[GatewayDescription] = js.undefined,
        GatewayGroupArn: js.UndefOr[Arn] = js.undefined,
        Name: js.UndefOr[GatewayName] = js.undefined,
        SoftwareVersion: js.UndefOr[GatewayVersion] = js.undefined
    ): GatewaySummary = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      GatewayGroupArn.foreach(__v => __obj.update("GatewayGroupArn", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      SoftwareVersion.foreach(__v => __obj.update("SoftwareVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GatewaySummary]
    }
  }

  @js.native
  trait GetAddressBookRequest extends js.Object {
    var AddressBookArn: Arn
  }

  object GetAddressBookRequest {
    def apply(
        AddressBookArn: Arn
    ): GetAddressBookRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        AddressBook: js.UndefOr[AddressBook] = js.undefined
    ): GetAddressBookResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AddressBook.foreach(__v => __obj.update("AddressBook", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAddressBookResponse]
    }
  }

  @js.native
  trait GetConferencePreferenceRequest extends js.Object {}

  object GetConferencePreferenceRequest {
    def apply(
        ): GetConferencePreferenceRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[GetConferencePreferenceRequest]
    }
  }

  @js.native
  trait GetConferencePreferenceResponse extends js.Object {
    var Preference: js.UndefOr[ConferencePreference]
  }

  object GetConferencePreferenceResponse {
    def apply(
        Preference: js.UndefOr[ConferencePreference] = js.undefined
    ): GetConferencePreferenceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Preference.foreach(__v => __obj.update("Preference", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConferencePreferenceResponse]
    }
  }

  @js.native
  trait GetConferenceProviderRequest extends js.Object {
    var ConferenceProviderArn: Arn
  }

  object GetConferenceProviderRequest {
    def apply(
        ConferenceProviderArn: Arn
    ): GetConferenceProviderRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        ConferenceProvider: js.UndefOr[ConferenceProvider] = js.undefined
    ): GetConferenceProviderResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ConferenceProvider.foreach(__v => __obj.update("ConferenceProvider", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConferenceProviderResponse]
    }
  }

  @js.native
  trait GetContactRequest extends js.Object {
    var ContactArn: Arn
  }

  object GetContactRequest {
    def apply(
        ContactArn: Arn
    ): GetContactRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        Contact: js.UndefOr[Contact] = js.undefined
    ): GetContactResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Contact.foreach(__v => __obj.update("Contact", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetContactResponse]
    }
  }

  @js.native
  trait GetDeviceRequest extends js.Object {
    var DeviceArn: js.UndefOr[Arn]
  }

  object GetDeviceRequest {
    def apply(
        DeviceArn: js.UndefOr[Arn] = js.undefined
    ): GetDeviceRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      DeviceArn.foreach(__v => __obj.update("DeviceArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeviceRequest]
    }
  }

  @js.native
  trait GetDeviceResponse extends js.Object {
    var Device: js.UndefOr[Device]
  }

  object GetDeviceResponse {
    def apply(
        Device: js.UndefOr[Device] = js.undefined
    ): GetDeviceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Device.foreach(__v => __obj.update("Device", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeviceResponse]
    }
  }

  @js.native
  trait GetGatewayGroupRequest extends js.Object {
    var GatewayGroupArn: Arn
  }

  object GetGatewayGroupRequest {
    def apply(
        GatewayGroupArn: Arn
    ): GetGatewayGroupRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        GatewayGroup: js.UndefOr[GatewayGroup] = js.undefined
    ): GetGatewayGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayGroup.foreach(__v => __obj.update("GatewayGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGatewayGroupResponse]
    }
  }

  @js.native
  trait GetGatewayRequest extends js.Object {
    var GatewayArn: Arn
  }

  object GetGatewayRequest {
    def apply(
        GatewayArn: Arn
    ): GetGatewayRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        Gateway: js.UndefOr[Gateway] = js.undefined
    ): GetGatewayResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Gateway.foreach(__v => __obj.update("Gateway", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGatewayResponse]
    }
  }

  @js.native
  trait GetInvitationConfigurationRequest extends js.Object {}

  object GetInvitationConfigurationRequest {
    def apply(
        ): GetInvitationConfigurationRequest = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        ContactEmail: js.UndefOr[Email] = js.undefined,
        OrganizationName: js.UndefOr[OrganizationName] = js.undefined,
        PrivateSkillIds: js.UndefOr[ShortSkillIdList] = js.undefined
    ): GetInvitationConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ContactEmail.foreach(__v => __obj.update("ContactEmail", __v.asInstanceOf[js.Any]))
      OrganizationName.foreach(__v => __obj.update("OrganizationName", __v.asInstanceOf[js.Any]))
      PrivateSkillIds.foreach(__v => __obj.update("PrivateSkillIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInvitationConfigurationResponse]
    }
  }

  @js.native
  trait GetNetworkProfileRequest extends js.Object {
    var NetworkProfileArn: Arn
  }

  object GetNetworkProfileRequest {
    def apply(
        NetworkProfileArn: Arn
    ): GetNetworkProfileRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        NetworkProfile: js.UndefOr[NetworkProfile] = js.undefined
    ): GetNetworkProfileResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NetworkProfile.foreach(__v => __obj.update("NetworkProfile", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNetworkProfileResponse]
    }
  }

  @js.native
  trait GetProfileRequest extends js.Object {
    var ProfileArn: js.UndefOr[Arn]
  }

  object GetProfileRequest {
    def apply(
        ProfileArn: js.UndefOr[Arn] = js.undefined
    ): GetProfileRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      ProfileArn.foreach(__v => __obj.update("ProfileArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProfileRequest]
    }
  }

  @js.native
  trait GetProfileResponse extends js.Object {
    var Profile: js.UndefOr[Profile]
  }

  object GetProfileResponse {
    def apply(
        Profile: js.UndefOr[Profile] = js.undefined
    ): GetProfileResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Profile.foreach(__v => __obj.update("Profile", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProfileResponse]
    }
  }

  @js.native
  trait GetRoomRequest extends js.Object {
    var RoomArn: js.UndefOr[Arn]
  }

  object GetRoomRequest {
    def apply(
        RoomArn: js.UndefOr[Arn] = js.undefined
    ): GetRoomRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      RoomArn.foreach(__v => __obj.update("RoomArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRoomRequest]
    }
  }

  @js.native
  trait GetRoomResponse extends js.Object {
    var Room: js.UndefOr[Room]
  }

  object GetRoomResponse {
    def apply(
        Room: js.UndefOr[Room] = js.undefined
    ): GetRoomResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Room.foreach(__v => __obj.update("Room", __v.asInstanceOf[js.Any]))
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
    def apply(
        ParameterKey: RoomSkillParameterKey,
        SkillId: SkillId,
        RoomArn: js.UndefOr[Arn] = js.undefined
    ): GetRoomSkillParameterRequest = {
      val __obj = js.Dictionary[js.Any](
        "ParameterKey" -> ParameterKey.asInstanceOf[js.Any],
        "SkillId"      -> SkillId.asInstanceOf[js.Any]
      )

      RoomArn.foreach(__v => __obj.update("RoomArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRoomSkillParameterRequest]
    }
  }

  @js.native
  trait GetRoomSkillParameterResponse extends js.Object {
    var RoomSkillParameter: js.UndefOr[RoomSkillParameter]
  }

  object GetRoomSkillParameterResponse {
    def apply(
        RoomSkillParameter: js.UndefOr[RoomSkillParameter] = js.undefined
    ): GetRoomSkillParameterResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      RoomSkillParameter.foreach(__v => __obj.update("RoomSkillParameter", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRoomSkillParameterResponse]
    }
  }

  @js.native
  trait GetSkillGroupRequest extends js.Object {
    var SkillGroupArn: js.UndefOr[Arn]
  }

  object GetSkillGroupRequest {
    def apply(
        SkillGroupArn: js.UndefOr[Arn] = js.undefined
    ): GetSkillGroupRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      SkillGroupArn.foreach(__v => __obj.update("SkillGroupArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSkillGroupRequest]
    }
  }

  @js.native
  trait GetSkillGroupResponse extends js.Object {
    var SkillGroup: js.UndefOr[SkillGroup]
  }

  object GetSkillGroupResponse {
    def apply(
        SkillGroup: js.UndefOr[SkillGroup] = js.undefined
    ): GetSkillGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      SkillGroup.foreach(__v => __obj.update("SkillGroup", __v.asInstanceOf[js.Any]))
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
    def apply(
        CommsProtocol: CommsProtocol,
        Endpoint: Endpoint
    ): IPDialIn = {
      val __obj = js.Dictionary[js.Any](
        "CommsProtocol" -> CommsProtocol.asInstanceOf[js.Any],
        "Endpoint"      -> Endpoint.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[IPDialIn]
    }
  }

  @js.native
  trait ListBusinessReportSchedulesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListBusinessReportSchedulesRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBusinessReportSchedulesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBusinessReportSchedulesRequest]
    }
  }

  @js.native
  trait ListBusinessReportSchedulesResponse extends js.Object {
    var BusinessReportSchedules: js.UndefOr[BusinessReportScheduleList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListBusinessReportSchedulesResponse {
    def apply(
        BusinessReportSchedules: js.UndefOr[BusinessReportScheduleList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBusinessReportSchedulesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      BusinessReportSchedules.foreach(__v => __obj.update("BusinessReportSchedules", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBusinessReportSchedulesResponse]
    }
  }

  @js.native
  trait ListConferenceProvidersRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConferenceProvidersRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConferenceProvidersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConferenceProvidersRequest]
    }
  }

  @js.native
  trait ListConferenceProvidersResponse extends js.Object {
    var ConferenceProviders: js.UndefOr[ConferenceProvidersList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConferenceProvidersResponse {
    def apply(
        ConferenceProviders: js.UndefOr[ConferenceProvidersList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConferenceProvidersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ConferenceProviders.foreach(__v => __obj.update("ConferenceProviders", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        DeviceArn: Arn,
        EventType: js.UndefOr[DeviceEventType] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeviceEventsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DeviceArn" -> DeviceArn.asInstanceOf[js.Any]
      )

      EventType.foreach(__v => __obj.update("EventType", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeviceEventsRequest]
    }
  }

  @js.native
  trait ListDeviceEventsResponse extends js.Object {
    var DeviceEvents: js.UndefOr[DeviceEventList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDeviceEventsResponse {
    def apply(
        DeviceEvents: js.UndefOr[DeviceEventList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeviceEventsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DeviceEvents.foreach(__v => __obj.update("DeviceEvents", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeviceEventsResponse]
    }
  }

  @js.native
  trait ListGatewayGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGatewayGroupsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGatewayGroupsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGatewayGroupsRequest]
    }
  }

  @js.native
  trait ListGatewayGroupsResponse extends js.Object {
    var GatewayGroups: js.UndefOr[GatewayGroupSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGatewayGroupsResponse {
    def apply(
        GatewayGroups: js.UndefOr[GatewayGroupSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGatewayGroupsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayGroups.foreach(__v => __obj.update("GatewayGroups", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        GatewayGroupArn: js.UndefOr[Arn] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGatewaysRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayGroupArn.foreach(__v => __obj.update("GatewayGroupArn", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGatewaysRequest]
    }
  }

  @js.native
  trait ListGatewaysResponse extends js.Object {
    var Gateways: js.UndefOr[GatewaySummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGatewaysResponse {
    def apply(
        Gateways: js.UndefOr[GatewaySummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGatewaysResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Gateways.foreach(__v => __obj.update("Gateways", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        EnablementType: js.UndefOr[EnablementTypeFilter] = js.undefined,
        MaxResults: js.UndefOr[SkillListMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SkillGroupArn: js.UndefOr[Arn] = js.undefined,
        SkillType: js.UndefOr[SkillTypeFilter] = js.undefined
    ): ListSkillsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      EnablementType.foreach(__v => __obj.update("EnablementType", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SkillGroupArn.foreach(__v => __obj.update("SkillGroupArn", __v.asInstanceOf[js.Any]))
      SkillType.foreach(__v => __obj.update("SkillType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSkillsRequest]
    }
  }

  @js.native
  trait ListSkillsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SkillSummaries: js.UndefOr[SkillSummaryList]
  }

  object ListSkillsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SkillSummaries: js.UndefOr[SkillSummaryList] = js.undefined
    ): ListSkillsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SkillSummaries.foreach(__v => __obj.update("SkillSummaries", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSkillsResponse]
    }
  }

  @js.native
  trait ListSkillsStoreCategoriesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSkillsStoreCategoriesRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSkillsStoreCategoriesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSkillsStoreCategoriesRequest]
    }
  }

  @js.native
  trait ListSkillsStoreCategoriesResponse extends js.Object {
    var CategoryList: js.UndefOr[CategoryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSkillsStoreCategoriesResponse {
    def apply(
        CategoryList: js.UndefOr[CategoryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSkillsStoreCategoriesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CategoryList.foreach(__v => __obj.update("CategoryList", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        CategoryId: CategoryId,
        MaxResults: js.UndefOr[SkillListMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSkillsStoreSkillsByCategoryRequest = {
      val __obj = js.Dictionary[js.Any](
        "CategoryId" -> CategoryId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSkillsStoreSkillsByCategoryRequest]
    }
  }

  @js.native
  trait ListSkillsStoreSkillsByCategoryResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SkillsStoreSkills: js.UndefOr[SkillsStoreSkillList]
  }

  object ListSkillsStoreSkillsByCategoryResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SkillsStoreSkills: js.UndefOr[SkillsStoreSkillList] = js.undefined
    ): ListSkillsStoreSkillsByCategoryResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SkillsStoreSkills.foreach(__v => __obj.update("SkillsStoreSkills", __v.asInstanceOf[js.Any]))
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
    def apply(
        RoomArn: Arn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSmartHomeAppliancesRequest = {
      val __obj = js.Dictionary[js.Any](
        "RoomArn" -> RoomArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSmartHomeAppliancesRequest]
    }
  }

  @js.native
  trait ListSmartHomeAppliancesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SmartHomeAppliances: js.UndefOr[SmartHomeApplianceList]
  }

  object ListSmartHomeAppliancesResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SmartHomeAppliances: js.UndefOr[SmartHomeApplianceList] = js.undefined
    ): ListSmartHomeAppliancesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SmartHomeAppliances.foreach(__v => __obj.update("SmartHomeAppliances", __v.asInstanceOf[js.Any]))
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
    def apply(
        Arn: Arn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsRequest = {
      val __obj = js.Dictionary[js.Any](
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsRequest]
    }
  }

  @js.native
  trait ListTagsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsResponse]
    }
  }

  object LocaleEnum {
    val `en-US` = "en-US"

    val values = IndexedSeq(`en-US`)
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
    def apply(
        RequirePin: RequirePin
    ): MeetingSetting = {
      val __obj = js.Dictionary[js.Any](
        "RequirePin" -> RequirePin.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MeetingSetting]
    }
  }

  object NetworkEapMethodEnum {
    val EAP_TLS = "EAP_TLS"

    val values = IndexedSeq(EAP_TLS)
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
      val __obj = js.Dictionary.empty[js.Any]
      CertificateAuthorityArn.foreach(__v => __obj.update("CertificateAuthorityArn", __v.asInstanceOf[js.Any]))
      CurrentPassword.foreach(__v => __obj.update("CurrentPassword", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      EapMethod.foreach(__v => __obj.update("EapMethod", __v.asInstanceOf[js.Any]))
      NetworkProfileArn.foreach(__v => __obj.update("NetworkProfileArn", __v.asInstanceOf[js.Any]))
      NetworkProfileName.foreach(__v => __obj.update("NetworkProfileName", __v.asInstanceOf[js.Any]))
      NextPassword.foreach(__v => __obj.update("NextPassword", __v.asInstanceOf[js.Any]))
      SecurityType.foreach(__v => __obj.update("SecurityType", __v.asInstanceOf[js.Any]))
      Ssid.foreach(__v => __obj.update("Ssid", __v.asInstanceOf[js.Any]))
      TrustAnchors.foreach(__v => __obj.update("TrustAnchors", __v.asInstanceOf[js.Any]))
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
    def apply(
        CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[NetworkProfileDescription] = js.undefined,
        EapMethod: js.UndefOr[NetworkEapMethod] = js.undefined,
        NetworkProfileArn: js.UndefOr[Arn] = js.undefined,
        NetworkProfileName: js.UndefOr[NetworkProfileName] = js.undefined,
        SecurityType: js.UndefOr[NetworkSecurityType] = js.undefined,
        Ssid: js.UndefOr[NetworkSsid] = js.undefined
    ): NetworkProfileData = {
      val __obj = js.Dictionary.empty[js.Any]
      CertificateAuthorityArn.foreach(__v => __obj.update("CertificateAuthorityArn", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      EapMethod.foreach(__v => __obj.update("EapMethod", __v.asInstanceOf[js.Any]))
      NetworkProfileArn.foreach(__v => __obj.update("NetworkProfileArn", __v.asInstanceOf[js.Any]))
      NetworkProfileName.foreach(__v => __obj.update("NetworkProfileName", __v.asInstanceOf[js.Any]))
      SecurityType.foreach(__v => __obj.update("SecurityType", __v.asInstanceOf[js.Any]))
      Ssid.foreach(__v => __obj.update("Ssid", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkProfileData]
    }
  }

  object NetworkSecurityTypeEnum {
    val OPEN            = "OPEN"
    val WEP             = "WEP"
    val WPA_PSK         = "WPA_PSK"
    val WPA2_PSK        = "WPA2_PSK"
    val WPA2_ENTERPRISE = "WPA2_ENTERPRISE"

    val values = IndexedSeq(OPEN, WEP, WPA_PSK, WPA2_PSK, WPA2_ENTERPRISE)
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
    def apply(
        CountryCode: CountryCode,
        OneClickIdDelay: OneClickIdDelay,
        OneClickPinDelay: OneClickPinDelay,
        PhoneNumber: OutboundPhoneNumber
    ): PSTNDialIn = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        Number: RawPhoneNumber,
        Type: PhoneNumberType
    ): PhoneNumber = {
      val __obj = js.Dictionary[js.Any](
        "Number" -> Number.asInstanceOf[js.Any],
        "Type"   -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PhoneNumber]
    }
  }

  object PhoneNumberTypeEnum {
    val MOBILE = "MOBILE"
    val WORK   = "WORK"
    val HOME   = "HOME"

    val values = IndexedSeq(MOBILE, WORK, HOME)
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
    var PSTNEnabled: js.UndefOr[Boolean]
    var ProfileArn: js.UndefOr[Arn]
    var ProfileName: js.UndefOr[ProfileName]
    var SetupModeDisabled: js.UndefOr[Boolean]
    var TemperatureUnit: js.UndefOr[TemperatureUnit]
    var Timezone: js.UndefOr[Timezone]
    var WakeWord: js.UndefOr[WakeWord]
  }

  object Profile {
    def apply(
        Address: js.UndefOr[Address] = js.undefined,
        AddressBookArn: js.UndefOr[Arn] = js.undefined,
        DistanceUnit: js.UndefOr[DistanceUnit] = js.undefined,
        IsDefault: js.UndefOr[Boolean] = js.undefined,
        Locale: js.UndefOr[DeviceLocale] = js.undefined,
        MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined,
        PSTNEnabled: js.UndefOr[Boolean] = js.undefined,
        ProfileArn: js.UndefOr[Arn] = js.undefined,
        ProfileName: js.UndefOr[ProfileName] = js.undefined,
        SetupModeDisabled: js.UndefOr[Boolean] = js.undefined,
        TemperatureUnit: js.UndefOr[TemperatureUnit] = js.undefined,
        Timezone: js.UndefOr[Timezone] = js.undefined,
        WakeWord: js.UndefOr[WakeWord] = js.undefined
    ): Profile = {
      val __obj = js.Dictionary.empty[js.Any]
      Address.foreach(__v => __obj.update("Address", __v.asInstanceOf[js.Any]))
      AddressBookArn.foreach(__v => __obj.update("AddressBookArn", __v.asInstanceOf[js.Any]))
      DistanceUnit.foreach(__v => __obj.update("DistanceUnit", __v.asInstanceOf[js.Any]))
      IsDefault.foreach(__v => __obj.update("IsDefault", __v.asInstanceOf[js.Any]))
      Locale.foreach(__v => __obj.update("Locale", __v.asInstanceOf[js.Any]))
      MaxVolumeLimit.foreach(__v => __obj.update("MaxVolumeLimit", __v.asInstanceOf[js.Any]))
      PSTNEnabled.foreach(__v => __obj.update("PSTNEnabled", __v.asInstanceOf[js.Any]))
      ProfileArn.foreach(__v => __obj.update("ProfileArn", __v.asInstanceOf[js.Any]))
      ProfileName.foreach(__v => __obj.update("ProfileName", __v.asInstanceOf[js.Any]))
      SetupModeDisabled.foreach(__v => __obj.update("SetupModeDisabled", __v.asInstanceOf[js.Any]))
      TemperatureUnit.foreach(__v => __obj.update("TemperatureUnit", __v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.update("Timezone", __v.asInstanceOf[js.Any]))
      WakeWord.foreach(__v => __obj.update("WakeWord", __v.asInstanceOf[js.Any]))
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
      val __obj = js.Dictionary.empty[js.Any]
      Address.foreach(__v => __obj.update("Address", __v.asInstanceOf[js.Any]))
      DistanceUnit.foreach(__v => __obj.update("DistanceUnit", __v.asInstanceOf[js.Any]))
      IsDefault.foreach(__v => __obj.update("IsDefault", __v.asInstanceOf[js.Any]))
      Locale.foreach(__v => __obj.update("Locale", __v.asInstanceOf[js.Any]))
      ProfileArn.foreach(__v => __obj.update("ProfileArn", __v.asInstanceOf[js.Any]))
      ProfileName.foreach(__v => __obj.update("ProfileName", __v.asInstanceOf[js.Any]))
      TemperatureUnit.foreach(__v => __obj.update("TemperatureUnit", __v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.update("Timezone", __v.asInstanceOf[js.Any]))
      WakeWord.foreach(__v => __obj.update("WakeWord", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProfileData]
    }
  }

  @js.native
  trait PutConferencePreferenceRequest extends js.Object {
    var ConferencePreference: ConferencePreference
  }

  object PutConferencePreferenceRequest {
    def apply(
        ConferencePreference: ConferencePreference
    ): PutConferencePreferenceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConferencePreference" -> ConferencePreference.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutConferencePreferenceRequest]
    }
  }

  @js.native
  trait PutConferencePreferenceResponse extends js.Object {}

  object PutConferencePreferenceResponse {
    def apply(
        ): PutConferencePreferenceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        OrganizationName: OrganizationName,
        ContactEmail: js.UndefOr[Email] = js.undefined,
        PrivateSkillIds: js.UndefOr[ShortSkillIdList] = js.undefined
    ): PutInvitationConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "OrganizationName" -> OrganizationName.asInstanceOf[js.Any]
      )

      ContactEmail.foreach(__v => __obj.update("ContactEmail", __v.asInstanceOf[js.Any]))
      PrivateSkillIds.foreach(__v => __obj.update("PrivateSkillIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutInvitationConfigurationRequest]
    }
  }

  @js.native
  trait PutInvitationConfigurationResponse extends js.Object {}

  object PutInvitationConfigurationResponse {
    def apply(
        ): PutInvitationConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        RoomSkillParameter: RoomSkillParameter,
        SkillId: SkillId,
        RoomArn: js.UndefOr[Arn] = js.undefined
    ): PutRoomSkillParameterRequest = {
      val __obj = js.Dictionary[js.Any](
        "RoomSkillParameter" -> RoomSkillParameter.asInstanceOf[js.Any],
        "SkillId"            -> SkillId.asInstanceOf[js.Any]
      )

      RoomArn.foreach(__v => __obj.update("RoomArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRoomSkillParameterRequest]
    }
  }

  @js.native
  trait PutRoomSkillParameterResponse extends js.Object {}

  object PutRoomSkillParameterResponse {
    def apply(
        ): PutRoomSkillParameterResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        AuthorizationResult: AuthorizationResult,
        SkillId: SkillId,
        RoomArn: js.UndefOr[Arn] = js.undefined
    ): PutSkillAuthorizationRequest = {
      val __obj = js.Dictionary[js.Any](
        "AuthorizationResult" -> AuthorizationResult.asInstanceOf[js.Any],
        "SkillId"             -> SkillId.asInstanceOf[js.Any]
      )

      RoomArn.foreach(__v => __obj.update("RoomArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSkillAuthorizationRequest]
    }
  }

  @js.native
  trait PutSkillAuthorizationResponse extends js.Object {}

  object PutSkillAuthorizationResponse {
    def apply(
        ): PutSkillAuthorizationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        AmazonId: AmazonId,
        ClientId: ClientId,
        DeviceSerialNumber: DeviceSerialNumberForAVS,
        ProductId: ProductId,
        UserCode: UserCode
    ): RegisterAVSDeviceRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        DeviceArn: js.UndefOr[Arn] = js.undefined
    ): RegisterAVSDeviceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DeviceArn.foreach(__v => __obj.update("DeviceArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterAVSDeviceResponse]
    }
  }

  @js.native
  trait RejectSkillRequest extends js.Object {
    var SkillId: SkillId
  }

  object RejectSkillRequest {
    def apply(
        SkillId: SkillId
    ): RejectSkillRequest = {
      val __obj = js.Dictionary[js.Any](
        "SkillId" -> SkillId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RejectSkillRequest]
    }
  }

  @js.native
  trait RejectSkillResponse extends js.Object {}

  object RejectSkillResponse {
    def apply(
        ): RejectSkillResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[RejectSkillResponse]
    }
  }

  object RequirePinEnum {
    val YES      = "YES"
    val NO       = "NO"
    val OPTIONAL = "OPTIONAL"

    val values = IndexedSeq(YES, NO, OPTIONAL)
  }

  @js.native
  trait ResolveRoomRequest extends js.Object {
    var SkillId: SkillId
    var UserId: UserId
  }

  object ResolveRoomRequest {
    def apply(
        SkillId: SkillId,
        UserId: UserId
    ): ResolveRoomRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        RoomArn: js.UndefOr[Arn] = js.undefined,
        RoomName: js.UndefOr[RoomName] = js.undefined,
        RoomSkillParameters: js.UndefOr[RoomSkillParameters] = js.undefined
    ): ResolveRoomResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      RoomArn.foreach(__v => __obj.update("RoomArn", __v.asInstanceOf[js.Any]))
      RoomName.foreach(__v => __obj.update("RoomName", __v.asInstanceOf[js.Any]))
      RoomSkillParameters.foreach(__v => __obj.update("RoomSkillParameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolveRoomResponse]
    }
  }

  @js.native
  trait RevokeInvitationRequest extends js.Object {
    var EnrollmentId: js.UndefOr[EnrollmentId]
    var UserArn: js.UndefOr[Arn]
  }

  object RevokeInvitationRequest {
    def apply(
        EnrollmentId: js.UndefOr[EnrollmentId] = js.undefined,
        UserArn: js.UndefOr[Arn] = js.undefined
    ): RevokeInvitationRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      EnrollmentId.foreach(__v => __obj.update("EnrollmentId", __v.asInstanceOf[js.Any]))
      UserArn.foreach(__v => __obj.update("UserArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RevokeInvitationRequest]
    }
  }

  @js.native
  trait RevokeInvitationResponse extends js.Object {}

  object RevokeInvitationResponse {
    def apply(
        ): RevokeInvitationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        Description: js.UndefOr[RoomDescription] = js.undefined,
        ProfileArn: js.UndefOr[Arn] = js.undefined,
        ProviderCalendarId: js.UndefOr[ProviderCalendarId] = js.undefined,
        RoomArn: js.UndefOr[Arn] = js.undefined,
        RoomName: js.UndefOr[RoomName] = js.undefined
    ): Room = {
      val __obj = js.Dictionary.empty[js.Any]
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ProfileArn.foreach(__v => __obj.update("ProfileArn", __v.asInstanceOf[js.Any]))
      ProviderCalendarId.foreach(__v => __obj.update("ProviderCalendarId", __v.asInstanceOf[js.Any]))
      RoomArn.foreach(__v => __obj.update("RoomArn", __v.asInstanceOf[js.Any]))
      RoomName.foreach(__v => __obj.update("RoomName", __v.asInstanceOf[js.Any]))
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
    def apply(
        Description: js.UndefOr[RoomDescription] = js.undefined,
        ProfileArn: js.UndefOr[Arn] = js.undefined,
        ProfileName: js.UndefOr[ProfileName] = js.undefined,
        ProviderCalendarId: js.UndefOr[ProviderCalendarId] = js.undefined,
        RoomArn: js.UndefOr[Arn] = js.undefined,
        RoomName: js.UndefOr[RoomName] = js.undefined
    ): RoomData = {
      val __obj = js.Dictionary.empty[js.Any]
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ProfileArn.foreach(__v => __obj.update("ProfileArn", __v.asInstanceOf[js.Any]))
      ProfileName.foreach(__v => __obj.update("ProfileName", __v.asInstanceOf[js.Any]))
      ProviderCalendarId.foreach(__v => __obj.update("ProviderCalendarId", __v.asInstanceOf[js.Any]))
      RoomArn.foreach(__v => __obj.update("RoomArn", __v.asInstanceOf[js.Any]))
      RoomName.foreach(__v => __obj.update("RoomName", __v.asInstanceOf[js.Any]))
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
    def apply(
        ParameterKey: RoomSkillParameterKey,
        ParameterValue: RoomSkillParameterValue
    ): RoomSkillParameter = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortCriteria: js.UndefOr[SortList] = js.undefined
    ): SearchAddressBooksRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.update("SortCriteria", __v.asInstanceOf[js.Any]))
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
    def apply(
        AddressBooks: js.UndefOr[AddressBookDataList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TotalCount: js.UndefOr[TotalCount] = js.undefined
    ): SearchAddressBooksResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AddressBooks.foreach(__v => __obj.update("AddressBooks", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.update("TotalCount", __v.asInstanceOf[js.Any]))
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
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortCriteria: js.UndefOr[SortList] = js.undefined
    ): SearchContactsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.update("SortCriteria", __v.asInstanceOf[js.Any]))
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
    def apply(
        Contacts: js.UndefOr[ContactDataList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TotalCount: js.UndefOr[TotalCount] = js.undefined
    ): SearchContactsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Contacts.foreach(__v => __obj.update("Contacts", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.update("TotalCount", __v.asInstanceOf[js.Any]))
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
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortCriteria: js.UndefOr[SortList] = js.undefined
    ): SearchDevicesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.update("SortCriteria", __v.asInstanceOf[js.Any]))
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
    def apply(
        Devices: js.UndefOr[DeviceDataList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TotalCount: js.UndefOr[TotalCount] = js.undefined
    ): SearchDevicesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Devices.foreach(__v => __obj.update("Devices", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.update("TotalCount", __v.asInstanceOf[js.Any]))
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
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortCriteria: js.UndefOr[SortList] = js.undefined
    ): SearchNetworkProfilesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.update("SortCriteria", __v.asInstanceOf[js.Any]))
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
    def apply(
        NetworkProfiles: js.UndefOr[NetworkProfileDataList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TotalCount: js.UndefOr[TotalCount] = js.undefined
    ): SearchNetworkProfilesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NetworkProfiles.foreach(__v => __obj.update("NetworkProfiles", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.update("TotalCount", __v.asInstanceOf[js.Any]))
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
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortCriteria: js.UndefOr[SortList] = js.undefined
    ): SearchProfilesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.update("SortCriteria", __v.asInstanceOf[js.Any]))
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
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Profiles: js.UndefOr[ProfileDataList] = js.undefined,
        TotalCount: js.UndefOr[TotalCount] = js.undefined
    ): SearchProfilesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Profiles.foreach(__v => __obj.update("Profiles", __v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.update("TotalCount", __v.asInstanceOf[js.Any]))
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
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortCriteria: js.UndefOr[SortList] = js.undefined
    ): SearchRoomsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.update("SortCriteria", __v.asInstanceOf[js.Any]))
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
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Rooms: js.UndefOr[RoomDataList] = js.undefined,
        TotalCount: js.UndefOr[TotalCount] = js.undefined
    ): SearchRoomsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Rooms.foreach(__v => __obj.update("Rooms", __v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.update("TotalCount", __v.asInstanceOf[js.Any]))
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
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortCriteria: js.UndefOr[SortList] = js.undefined
    ): SearchSkillGroupsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.update("SortCriteria", __v.asInstanceOf[js.Any]))
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
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SkillGroups: js.UndefOr[SkillGroupDataList] = js.undefined,
        TotalCount: js.UndefOr[TotalCount] = js.undefined
    ): SearchSkillGroupsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SkillGroups.foreach(__v => __obj.update("SkillGroups", __v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.update("TotalCount", __v.asInstanceOf[js.Any]))
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
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortCriteria: js.UndefOr[SortList] = js.undefined
    ): SearchUsersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.update("SortCriteria", __v.asInstanceOf[js.Any]))
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
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TotalCount: js.UndefOr[TotalCount] = js.undefined,
        Users: js.UndefOr[UserDataList] = js.undefined
    ): SearchUsersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.update("TotalCount", __v.asInstanceOf[js.Any]))
      Users.foreach(__v => __obj.update("Users", __v.asInstanceOf[js.Any]))
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
    def apply(
        ClientRequestToken: ClientRequestToken,
        Content: Content,
        RoomFilters: FilterList,
        TimeToLiveInSeconds: js.UndefOr[TimeToLiveInSeconds] = js.undefined
    ): SendAnnouncementRequest = {
      val __obj = js.Dictionary[js.Any](
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "Content"            -> Content.asInstanceOf[js.Any],
        "RoomFilters"        -> RoomFilters.asInstanceOf[js.Any]
      )

      TimeToLiveInSeconds.foreach(__v => __obj.update("TimeToLiveInSeconds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendAnnouncementRequest]
    }
  }

  @js.native
  trait SendAnnouncementResponse extends js.Object {
    var AnnouncementArn: js.UndefOr[Arn]
  }

  object SendAnnouncementResponse {
    def apply(
        AnnouncementArn: js.UndefOr[Arn] = js.undefined
    ): SendAnnouncementResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AnnouncementArn.foreach(__v => __obj.update("AnnouncementArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendAnnouncementResponse]
    }
  }

  @js.native
  trait SendInvitationRequest extends js.Object {
    var UserArn: js.UndefOr[Arn]
  }

  object SendInvitationRequest {
    def apply(
        UserArn: js.UndefOr[Arn] = js.undefined
    ): SendInvitationRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      UserArn.foreach(__v => __obj.update("UserArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendInvitationRequest]
    }
  }

  @js.native
  trait SendInvitationResponse extends js.Object {}

  object SendInvitationResponse {
    def apply(
        ): SendInvitationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        Type: SipType,
        Uri: SipUri
    ): SipAddress = {
      val __obj = js.Dictionary[js.Any](
        "Type" -> Type.asInstanceOf[js.Any],
        "Uri"  -> Uri.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SipAddress]
    }
  }

  object SipTypeEnum {
    val WORK = "WORK"

    val values = IndexedSeq(WORK)
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
      val __obj = js.Dictionary.empty[js.Any]
      BulletPoints.foreach(__v => __obj.update("BulletPoints", __v.asInstanceOf[js.Any]))
      DeveloperInfo.foreach(__v => __obj.update("DeveloperInfo", __v.asInstanceOf[js.Any]))
      EndUserLicenseAgreement.foreach(__v => __obj.update("EndUserLicenseAgreement", __v.asInstanceOf[js.Any]))
      GenericKeywords.foreach(__v => __obj.update("GenericKeywords", __v.asInstanceOf[js.Any]))
      InvocationPhrase.foreach(__v => __obj.update("InvocationPhrase", __v.asInstanceOf[js.Any]))
      NewInThisVersionBulletPoints.foreach(
        __v => __obj.update("NewInThisVersionBulletPoints", __v.asInstanceOf[js.Any])
      )
      ProductDescription.foreach(__v => __obj.update("ProductDescription", __v.asInstanceOf[js.Any]))
      ReleaseDate.foreach(__v => __obj.update("ReleaseDate", __v.asInstanceOf[js.Any]))
      Reviews.foreach(__v => __obj.update("Reviews", __v.asInstanceOf[js.Any]))
      SkillTypes.foreach(__v => __obj.update("SkillTypes", __v.asInstanceOf[js.Any]))
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
    def apply(
        Description: js.UndefOr[SkillGroupDescription] = js.undefined,
        SkillGroupArn: js.UndefOr[Arn] = js.undefined,
        SkillGroupName: js.UndefOr[SkillGroupName] = js.undefined
    ): SkillGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      SkillGroupArn.foreach(__v => __obj.update("SkillGroupArn", __v.asInstanceOf[js.Any]))
      SkillGroupName.foreach(__v => __obj.update("SkillGroupName", __v.asInstanceOf[js.Any]))
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
    def apply(
        Description: js.UndefOr[SkillGroupDescription] = js.undefined,
        SkillGroupArn: js.UndefOr[Arn] = js.undefined,
        SkillGroupName: js.UndefOr[SkillGroupName] = js.undefined
    ): SkillGroupData = {
      val __obj = js.Dictionary.empty[js.Any]
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      SkillGroupArn.foreach(__v => __obj.update("SkillGroupArn", __v.asInstanceOf[js.Any]))
      SkillGroupName.foreach(__v => __obj.update("SkillGroupName", __v.asInstanceOf[js.Any]))
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
    def apply(
        EnablementType: js.UndefOr[EnablementType] = js.undefined,
        SkillId: js.UndefOr[SkillId] = js.undefined,
        SkillName: js.UndefOr[SkillName] = js.undefined,
        SkillType: js.UndefOr[SkillType] = js.undefined,
        SupportsLinking: js.UndefOr[Boolean] = js.undefined
    ): SkillSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      EnablementType.foreach(__v => __obj.update("EnablementType", __v.asInstanceOf[js.Any]))
      SkillId.foreach(__v => __obj.update("SkillId", __v.asInstanceOf[js.Any]))
      SkillName.foreach(__v => __obj.update("SkillName", __v.asInstanceOf[js.Any]))
      SkillType.foreach(__v => __obj.update("SkillType", __v.asInstanceOf[js.Any]))
      SupportsLinking.foreach(__v => __obj.update("SupportsLinking", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SkillSummary]
    }
  }

  object SkillTypeEnum {
    val PUBLIC  = "PUBLIC"
    val PRIVATE = "PRIVATE"

    val values = IndexedSeq(PUBLIC, PRIVATE)
  }

  object SkillTypeFilterEnum {
    val PUBLIC  = "PUBLIC"
    val PRIVATE = "PRIVATE"
    val ALL     = "ALL"

    val values = IndexedSeq(PUBLIC, PRIVATE, ALL)
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
    def apply(
        IconUrl: js.UndefOr[IconUrl] = js.undefined,
        SampleUtterances: js.UndefOr[SampleUtterances] = js.undefined,
        ShortDescription: js.UndefOr[ShortDescription] = js.undefined,
        SkillDetails: js.UndefOr[SkillDetails] = js.undefined,
        SkillId: js.UndefOr[SkillId] = js.undefined,
        SkillName: js.UndefOr[SkillName] = js.undefined,
        SupportsLinking: js.UndefOr[Boolean] = js.undefined
    ): SkillsStoreSkill = {
      val __obj = js.Dictionary.empty[js.Any]
      IconUrl.foreach(__v => __obj.update("IconUrl", __v.asInstanceOf[js.Any]))
      SampleUtterances.foreach(__v => __obj.update("SampleUtterances", __v.asInstanceOf[js.Any]))
      ShortDescription.foreach(__v => __obj.update("ShortDescription", __v.asInstanceOf[js.Any]))
      SkillDetails.foreach(__v => __obj.update("SkillDetails", __v.asInstanceOf[js.Any]))
      SkillId.foreach(__v => __obj.update("SkillId", __v.asInstanceOf[js.Any]))
      SkillName.foreach(__v => __obj.update("SkillName", __v.asInstanceOf[js.Any]))
      SupportsLinking.foreach(__v => __obj.update("SupportsLinking", __v.asInstanceOf[js.Any]))
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
    def apply(
        Description: js.UndefOr[ApplianceDescription] = js.undefined,
        FriendlyName: js.UndefOr[ApplianceFriendlyName] = js.undefined,
        ManufacturerName: js.UndefOr[ApplianceManufacturerName] = js.undefined
    ): SmartHomeAppliance = {
      val __obj = js.Dictionary.empty[js.Any]
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      FriendlyName.foreach(__v => __obj.update("FriendlyName", __v.asInstanceOf[js.Any]))
      ManufacturerName.foreach(__v => __obj.update("ManufacturerName", __v.asInstanceOf[js.Any]))
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
    def apply(
        Key: SortKey,
        Value: SortValue
    ): Sort = {
      val __obj = js.Dictionary[js.Any](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Sort]
    }
  }

  object SortValueEnum {
    val ASC  = "ASC"
    val DESC = "DESC"

    val values = IndexedSeq(ASC, DESC)
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
    def apply(
        Locale: Locale,
        Value: SsmlValue
    ): Ssml = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        Features: Features,
        DeviceArn: js.UndefOr[Arn] = js.undefined,
        RoomArn: js.UndefOr[Arn] = js.undefined
    ): StartDeviceSyncRequest = {
      val __obj = js.Dictionary[js.Any](
        "Features" -> Features.asInstanceOf[js.Any]
      )

      DeviceArn.foreach(__v => __obj.update("DeviceArn", __v.asInstanceOf[js.Any]))
      RoomArn.foreach(__v => __obj.update("RoomArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDeviceSyncRequest]
    }
  }

  @js.native
  trait StartDeviceSyncResponse extends js.Object {}

  object StartDeviceSyncResponse {
    def apply(
        ): StartDeviceSyncResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[StartDeviceSyncResponse]
    }
  }

  @js.native
  trait StartSmartHomeApplianceDiscoveryRequest extends js.Object {
    var RoomArn: Arn
  }

  object StartSmartHomeApplianceDiscoveryRequest {
    def apply(
        RoomArn: Arn
    ): StartSmartHomeApplianceDiscoveryRequest = {
      val __obj = js.Dictionary[js.Any](
        "RoomArn" -> RoomArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartSmartHomeApplianceDiscoveryRequest]
    }
  }

  @js.native
  trait StartSmartHomeApplianceDiscoveryResponse extends js.Object {}

  object StartSmartHomeApplianceDiscoveryResponse {
    def apply(
        ): StartSmartHomeApplianceDiscoveryResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        Arn: Arn,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Arn"  -> Arn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  object TemperatureUnitEnum {
    val FAHRENHEIT = "FAHRENHEIT"
    val CELSIUS    = "CELSIUS"

    val values = IndexedSeq(FAHRENHEIT, CELSIUS)
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
    def apply(
        Locale: Locale,
        Value: TextValue
    ): Text = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        Arn: Arn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Arn"     -> Arn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        AddressBookArn: Arn,
        Description: js.UndefOr[AddressBookDescription] = js.undefined,
        Name: js.UndefOr[AddressBookName] = js.undefined
    ): UpdateAddressBookRequest = {
      val __obj = js.Dictionary[js.Any](
        "AddressBookArn" -> AddressBookArn.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAddressBookRequest]
    }
  }

  @js.native
  trait UpdateAddressBookResponse extends js.Object {}

  object UpdateAddressBookResponse {
    def apply(
        ): UpdateAddressBookResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        ScheduleArn: Arn,
        Format: js.UndefOr[BusinessReportFormat] = js.undefined,
        Recurrence: js.UndefOr[BusinessReportRecurrence] = js.undefined,
        S3BucketName: js.UndefOr[CustomerS3BucketName] = js.undefined,
        S3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined,
        ScheduleName: js.UndefOr[BusinessReportScheduleName] = js.undefined
    ): UpdateBusinessReportScheduleRequest = {
      val __obj = js.Dictionary[js.Any](
        "ScheduleArn" -> ScheduleArn.asInstanceOf[js.Any]
      )

      Format.foreach(__v => __obj.update("Format", __v.asInstanceOf[js.Any]))
      Recurrence.foreach(__v => __obj.update("Recurrence", __v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.update("S3BucketName", __v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.update("S3KeyPrefix", __v.asInstanceOf[js.Any]))
      ScheduleName.foreach(__v => __obj.update("ScheduleName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBusinessReportScheduleRequest]
    }
  }

  @js.native
  trait UpdateBusinessReportScheduleResponse extends js.Object {}

  object UpdateBusinessReportScheduleResponse {
    def apply(
        ): UpdateBusinessReportScheduleResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        ConferenceProviderArn: Arn,
        ConferenceProviderType: ConferenceProviderType,
        MeetingSetting: MeetingSetting,
        IPDialIn: js.UndefOr[IPDialIn] = js.undefined,
        PSTNDialIn: js.UndefOr[PSTNDialIn] = js.undefined
    ): UpdateConferenceProviderRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConferenceProviderArn"  -> ConferenceProviderArn.asInstanceOf[js.Any],
        "ConferenceProviderType" -> ConferenceProviderType.asInstanceOf[js.Any],
        "MeetingSetting"         -> MeetingSetting.asInstanceOf[js.Any]
      )

      IPDialIn.foreach(__v => __obj.update("IPDialIn", __v.asInstanceOf[js.Any]))
      PSTNDialIn.foreach(__v => __obj.update("PSTNDialIn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConferenceProviderRequest]
    }
  }

  @js.native
  trait UpdateConferenceProviderResponse extends js.Object {}

  object UpdateConferenceProviderResponse {
    def apply(
        ): UpdateConferenceProviderResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        ContactArn: Arn,
        DisplayName: js.UndefOr[ContactName] = js.undefined,
        FirstName: js.UndefOr[ContactName] = js.undefined,
        LastName: js.UndefOr[ContactName] = js.undefined,
        PhoneNumber: js.UndefOr[RawPhoneNumber] = js.undefined,
        PhoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined,
        SipAddresses: js.UndefOr[SipAddressList] = js.undefined
    ): UpdateContactRequest = {
      val __obj = js.Dictionary[js.Any](
        "ContactArn" -> ContactArn.asInstanceOf[js.Any]
      )

      DisplayName.foreach(__v => __obj.update("DisplayName", __v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.update("FirstName", __v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.update("LastName", __v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.update("PhoneNumber", __v.asInstanceOf[js.Any]))
      PhoneNumbers.foreach(__v => __obj.update("PhoneNumbers", __v.asInstanceOf[js.Any]))
      SipAddresses.foreach(__v => __obj.update("SipAddresses", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateContactRequest]
    }
  }

  @js.native
  trait UpdateContactResponse extends js.Object {}

  object UpdateContactResponse {
    def apply(
        ): UpdateContactResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateContactResponse]
    }
  }

  @js.native
  trait UpdateDeviceRequest extends js.Object {
    var DeviceArn: js.UndefOr[Arn]
    var DeviceName: js.UndefOr[DeviceName]
  }

  object UpdateDeviceRequest {
    def apply(
        DeviceArn: js.UndefOr[Arn] = js.undefined,
        DeviceName: js.UndefOr[DeviceName] = js.undefined
    ): UpdateDeviceRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      DeviceArn.foreach(__v => __obj.update("DeviceArn", __v.asInstanceOf[js.Any]))
      DeviceName.foreach(__v => __obj.update("DeviceName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeviceRequest]
    }
  }

  @js.native
  trait UpdateDeviceResponse extends js.Object {}

  object UpdateDeviceResponse {
    def apply(
        ): UpdateDeviceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateDeviceResponse]
    }
  }

  @js.native
  trait UpdateGatewayGroupRequest extends js.Object {
    var GatewayGroupArn: Arn
    var Description: js.UndefOr[GatewayGroupDescription]
    var Name: js.UndefOr[GatewayGroupName]
  }

  object UpdateGatewayGroupRequest {
    def apply(
        GatewayGroupArn: Arn,
        Description: js.UndefOr[GatewayGroupDescription] = js.undefined,
        Name: js.UndefOr[GatewayGroupName] = js.undefined
    ): UpdateGatewayGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "GatewayGroupArn" -> GatewayGroupArn.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGatewayGroupRequest]
    }
  }

  @js.native
  trait UpdateGatewayGroupResponse extends js.Object {}

  object UpdateGatewayGroupResponse {
    def apply(
        ): UpdateGatewayGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        GatewayArn: Arn,
        Description: js.UndefOr[GatewayDescription] = js.undefined,
        Name: js.UndefOr[GatewayName] = js.undefined,
        SoftwareVersion: js.UndefOr[GatewayVersion] = js.undefined
    ): UpdateGatewayRequest = {
      val __obj = js.Dictionary[js.Any](
        "GatewayArn" -> GatewayArn.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      SoftwareVersion.foreach(__v => __obj.update("SoftwareVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGatewayRequest]
    }
  }

  @js.native
  trait UpdateGatewayResponse extends js.Object {}

  object UpdateGatewayResponse {
    def apply(
        ): UpdateGatewayResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateGatewayResponse]
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
    def apply(
        NetworkProfileArn: Arn,
        CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
        CurrentPassword: js.UndefOr[CurrentWiFiPassword] = js.undefined,
        Description: js.UndefOr[NetworkProfileDescription] = js.undefined,
        NetworkProfileName: js.UndefOr[NetworkProfileName] = js.undefined,
        NextPassword: js.UndefOr[NextWiFiPassword] = js.undefined,
        TrustAnchors: js.UndefOr[TrustAnchorList] = js.undefined
    ): UpdateNetworkProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "NetworkProfileArn" -> NetworkProfileArn.asInstanceOf[js.Any]
      )

      CertificateAuthorityArn.foreach(__v => __obj.update("CertificateAuthorityArn", __v.asInstanceOf[js.Any]))
      CurrentPassword.foreach(__v => __obj.update("CurrentPassword", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      NetworkProfileName.foreach(__v => __obj.update("NetworkProfileName", __v.asInstanceOf[js.Any]))
      NextPassword.foreach(__v => __obj.update("NextPassword", __v.asInstanceOf[js.Any]))
      TrustAnchors.foreach(__v => __obj.update("TrustAnchors", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNetworkProfileRequest]
    }
  }

  @js.native
  trait UpdateNetworkProfileResponse extends js.Object {}

  object UpdateNetworkProfileResponse {
    def apply(
        ): UpdateNetworkProfileResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    var PSTNEnabled: js.UndefOr[Boolean]
    var ProfileArn: js.UndefOr[Arn]
    var ProfileName: js.UndefOr[ProfileName]
    var SetupModeDisabled: js.UndefOr[Boolean]
    var TemperatureUnit: js.UndefOr[TemperatureUnit]
    var Timezone: js.UndefOr[Timezone]
    var WakeWord: js.UndefOr[WakeWord]
  }

  object UpdateProfileRequest {
    def apply(
        Address: js.UndefOr[Address] = js.undefined,
        DistanceUnit: js.UndefOr[DistanceUnit] = js.undefined,
        IsDefault: js.UndefOr[Boolean] = js.undefined,
        Locale: js.UndefOr[DeviceLocale] = js.undefined,
        MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined,
        PSTNEnabled: js.UndefOr[Boolean] = js.undefined,
        ProfileArn: js.UndefOr[Arn] = js.undefined,
        ProfileName: js.UndefOr[ProfileName] = js.undefined,
        SetupModeDisabled: js.UndefOr[Boolean] = js.undefined,
        TemperatureUnit: js.UndefOr[TemperatureUnit] = js.undefined,
        Timezone: js.UndefOr[Timezone] = js.undefined,
        WakeWord: js.UndefOr[WakeWord] = js.undefined
    ): UpdateProfileRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Address.foreach(__v => __obj.update("Address", __v.asInstanceOf[js.Any]))
      DistanceUnit.foreach(__v => __obj.update("DistanceUnit", __v.asInstanceOf[js.Any]))
      IsDefault.foreach(__v => __obj.update("IsDefault", __v.asInstanceOf[js.Any]))
      Locale.foreach(__v => __obj.update("Locale", __v.asInstanceOf[js.Any]))
      MaxVolumeLimit.foreach(__v => __obj.update("MaxVolumeLimit", __v.asInstanceOf[js.Any]))
      PSTNEnabled.foreach(__v => __obj.update("PSTNEnabled", __v.asInstanceOf[js.Any]))
      ProfileArn.foreach(__v => __obj.update("ProfileArn", __v.asInstanceOf[js.Any]))
      ProfileName.foreach(__v => __obj.update("ProfileName", __v.asInstanceOf[js.Any]))
      SetupModeDisabled.foreach(__v => __obj.update("SetupModeDisabled", __v.asInstanceOf[js.Any]))
      TemperatureUnit.foreach(__v => __obj.update("TemperatureUnit", __v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.update("Timezone", __v.asInstanceOf[js.Any]))
      WakeWord.foreach(__v => __obj.update("WakeWord", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProfileRequest]
    }
  }

  @js.native
  trait UpdateProfileResponse extends js.Object {}

  object UpdateProfileResponse {
    def apply(
        ): UpdateProfileResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateProfileResponse]
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
    def apply(
        Description: js.UndefOr[RoomDescription] = js.undefined,
        ProfileArn: js.UndefOr[Arn] = js.undefined,
        ProviderCalendarId: js.UndefOr[ProviderCalendarId] = js.undefined,
        RoomArn: js.UndefOr[Arn] = js.undefined,
        RoomName: js.UndefOr[RoomName] = js.undefined
    ): UpdateRoomRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ProfileArn.foreach(__v => __obj.update("ProfileArn", __v.asInstanceOf[js.Any]))
      ProviderCalendarId.foreach(__v => __obj.update("ProviderCalendarId", __v.asInstanceOf[js.Any]))
      RoomArn.foreach(__v => __obj.update("RoomArn", __v.asInstanceOf[js.Any]))
      RoomName.foreach(__v => __obj.update("RoomName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRoomRequest]
    }
  }

  @js.native
  trait UpdateRoomResponse extends js.Object {}

  object UpdateRoomResponse {
    def apply(
        ): UpdateRoomResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        Description: js.UndefOr[SkillGroupDescription] = js.undefined,
        SkillGroupArn: js.UndefOr[Arn] = js.undefined,
        SkillGroupName: js.UndefOr[SkillGroupName] = js.undefined
    ): UpdateSkillGroupRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      SkillGroupArn.foreach(__v => __obj.update("SkillGroupArn", __v.asInstanceOf[js.Any]))
      SkillGroupName.foreach(__v => __obj.update("SkillGroupName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSkillGroupRequest]
    }
  }

  @js.native
  trait UpdateSkillGroupResponse extends js.Object {}

  object UpdateSkillGroupResponse {
    def apply(
        ): UpdateSkillGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        Email: js.UndefOr[Email] = js.undefined,
        EnrollmentId: js.UndefOr[EnrollmentId] = js.undefined,
        EnrollmentStatus: js.UndefOr[EnrollmentStatus] = js.undefined,
        FirstName: js.UndefOr[user_FirstName] = js.undefined,
        LastName: js.UndefOr[user_LastName] = js.undefined,
        UserArn: js.UndefOr[Arn] = js.undefined
    ): UserData = {
      val __obj = js.Dictionary.empty[js.Any]
      Email.foreach(__v => __obj.update("Email", __v.asInstanceOf[js.Any]))
      EnrollmentId.foreach(__v => __obj.update("EnrollmentId", __v.asInstanceOf[js.Any]))
      EnrollmentStatus.foreach(__v => __obj.update("EnrollmentStatus", __v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.update("FirstName", __v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.update("LastName", __v.asInstanceOf[js.Any]))
      UserArn.foreach(__v => __obj.update("UserArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserData]
    }
  }

  object WakeWordEnum {
    val ALEXA    = "ALEXA"
    val AMAZON   = "AMAZON"
    val ECHO     = "ECHO"
    val COMPUTER = "COMPUTER"

    val values = IndexedSeq(ALEXA, AMAZON, ECHO, COMPUTER)
  }
}
