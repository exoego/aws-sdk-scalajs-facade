package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object alexaforbusiness {
  type Address = String
  type AddressBookDataList = js.Array[AddressBookData]
  type AddressBookDescription = String
  type AddressBookName = String
  type AmazonId = String
  type ApplianceDescription = String
  type ApplianceFriendlyName = String
  type ApplianceManufacturerName = String
  type Arn = String
  type AuthorizationResult = js.Dictionary[Value]
  type BulletPoint = String
  type BulletPoints = js.Array[BulletPoint]
  type BusinessReportDownloadUrl = String
  type BusinessReportFailureCode = String
  type BusinessReportFormat = String
  type BusinessReportInterval = String
  type BusinessReportS3Path = String
  type BusinessReportScheduleList = js.Array[BusinessReportSchedule]
  type BusinessReportScheduleName = String
  type BusinessReportStatus = String
  type CategoryId = Double
  type CategoryList = js.Array[Category]
  type CategoryName = String
  type ClientId = String
  type ClientRequestToken = String
  type CommsProtocol = String
  type ConferenceProviderName = String
  type ConferenceProviderType = String
  type ConferenceProvidersList = js.Array[ConferenceProvider]
  type ConnectionStatus = String
  type ContactDataList = js.Array[ContactData]
  type ContactName = String
  type CountryCode = String
  type CustomerS3BucketName = String
  type Date = String
  type DeveloperName = String
  type DeviceDataList = js.Array[DeviceData]
  type DeviceEventList = js.Array[DeviceEvent]
  type DeviceEventType = String
  type DeviceEventValue = String
  type DeviceName = String
  type DeviceSerialNumber = String
  type DeviceSerialNumberForAVS = String
  type DeviceStatus = String
  type DeviceStatusDetailCode = String
  type DeviceStatusDetails = js.Array[DeviceStatusDetail]
  type DeviceType = String
  type DistanceUnit = String
  type E164PhoneNumber = String
  type Email = String
  type EnablementType = String
  type EnablementTypeFilter = String
  type EndUserLicenseAgreement = String
  type Endpoint = String
  type EnrollmentId = String
  type EnrollmentStatus = String
  type Feature = String
  type Features = js.Array[Feature]
  type FilterKey = String
  type FilterList = js.Array[Filter]
  type FilterValue = String
  type FilterValueList = js.Array[FilterValue]
  type GenericKeyword = String
  type GenericKeywords = js.Array[GenericKeyword]
  type IconUrl = String
  type InvocationPhrase = String
  type Key = String
  type MacAddress = String
  type MaxResults = Int
  type MaxVolumeLimit = Int
  type NewInThisVersionBulletPoints = js.Array[BulletPoint]
  type NextToken = String
  type OneClickIdDelay = String
  type OneClickPinDelay = String
  type OutboundPhoneNumber = String
  type PrivacyPolicy = String
  type ProductDescription = String
  type ProductId = String
  type ProfileDataList = js.Array[ProfileData]
  type ProfileName = String
  type ProviderCalendarId = String
  type ReleaseDate = String
  type RequirePin = String
  type ReviewKey = String
  type ReviewValue = String
  type Reviews = js.Dictionary[ReviewValue]
  type RoomDataList = js.Array[RoomData]
  type RoomDescription = String
  type RoomName = String
  type RoomSkillParameterKey = String
  type RoomSkillParameterValue = String
  type RoomSkillParameters = js.Array[RoomSkillParameter]
  type S3KeyPrefix = String
  type SampleUtterances = js.Array[Utterance]
  type ShortDescription = String
  type SkillGroupDataList = js.Array[SkillGroupData]
  type SkillGroupDescription = String
  type SkillGroupName = String
  type SkillId = String
  type SkillListMaxResults = Int
  type SkillName = String
  type SkillStoreType = String
  type SkillSummaryList = js.Array[SkillSummary]
  type SkillType = String
  type SkillTypeFilter = String
  type SkillTypes = js.Array[SkillStoreType]
  type SkillsStoreSkillList = js.Array[SkillsStoreSkill]
  type SmartHomeApplianceList = js.Array[SmartHomeAppliance]
  type SoftwareVersion = String
  type SortKey = String
  type SortList = js.Array[Sort]
  type SortValue = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TemperatureUnit = String
  type Timestamp = js.Date
  type Timezone = String
  type TotalCount = Int
  type Url = String
  type UserCode = String
  type UserDataList = js.Array[UserData]
  type UserId = String
  type Utterance = String
  type Value = String
  type WakeWord = String
  type boolean = Boolean
  type user_FirstName = String
  type user_LastName = String
  type user_UserId = String
}

package alexaforbusiness {
  @js.native
  @JSImport("aws-sdk", "AlexaForBusiness")
  class AlexaForBusiness() extends js.Object {
    def this(config: AWSConfig) = this()

    def approveSkill(params: ApproveSkillRequest): Request[ApproveSkillResponse] = js.native
    def associateContactWithAddressBook(params: AssociateContactWithAddressBookRequest): Request[AssociateContactWithAddressBookResponse] = js.native
    def associateDeviceWithRoom(params: AssociateDeviceWithRoomRequest): Request[AssociateDeviceWithRoomResponse] = js.native
    def associateSkillGroupWithRoom(params: AssociateSkillGroupWithRoomRequest): Request[AssociateSkillGroupWithRoomResponse] = js.native
    def associateSkillWithSkillGroup(params: AssociateSkillWithSkillGroupRequest): Request[AssociateSkillWithSkillGroupResponse] = js.native
    def associateSkillWithUsers(params: AssociateSkillWithUsersRequest): Request[AssociateSkillWithUsersResponse] = js.native
    def createAddressBook(params: CreateAddressBookRequest): Request[CreateAddressBookResponse] = js.native
    def createBusinessReportSchedule(params: CreateBusinessReportScheduleRequest): Request[CreateBusinessReportScheduleResponse] = js.native
    def createConferenceProvider(params: CreateConferenceProviderRequest): Request[CreateConferenceProviderResponse] = js.native
    def createContact(params: CreateContactRequest): Request[CreateContactResponse] = js.native
    def createProfile(params: CreateProfileRequest): Request[CreateProfileResponse] = js.native
    def createRoom(params: CreateRoomRequest): Request[CreateRoomResponse] = js.native
    def createSkillGroup(params: CreateSkillGroupRequest): Request[CreateSkillGroupResponse] = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse] = js.native
    def deleteAddressBook(params: DeleteAddressBookRequest): Request[DeleteAddressBookResponse] = js.native
    def deleteBusinessReportSchedule(params: DeleteBusinessReportScheduleRequest): Request[DeleteBusinessReportScheduleResponse] = js.native
    def deleteConferenceProvider(params: DeleteConferenceProviderRequest): Request[DeleteConferenceProviderResponse] = js.native
    def deleteContact(params: DeleteContactRequest): Request[DeleteContactResponse] = js.native
    def deleteDevice(params: DeleteDeviceRequest): Request[DeleteDeviceResponse] = js.native
    def deleteProfile(params: DeleteProfileRequest): Request[DeleteProfileResponse] = js.native
    def deleteRoom(params: DeleteRoomRequest): Request[DeleteRoomResponse] = js.native
    def deleteRoomSkillParameter(params: DeleteRoomSkillParameterRequest): Request[DeleteRoomSkillParameterResponse] = js.native
    def deleteSkillAuthorization(params: DeleteSkillAuthorizationRequest): Request[DeleteSkillAuthorizationResponse] = js.native
    def deleteSkillGroup(params: DeleteSkillGroupRequest): Request[DeleteSkillGroupResponse] = js.native
    def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse] = js.native
    def disassociateContactFromAddressBook(params: DisassociateContactFromAddressBookRequest): Request[DisassociateContactFromAddressBookResponse] = js.native
    def disassociateDeviceFromRoom(params: DisassociateDeviceFromRoomRequest): Request[DisassociateDeviceFromRoomResponse] = js.native
    def disassociateSkillFromSkillGroup(params: DisassociateSkillFromSkillGroupRequest): Request[DisassociateSkillFromSkillGroupResponse] = js.native
    def disassociateSkillFromUsers(params: DisassociateSkillFromUsersRequest): Request[DisassociateSkillFromUsersResponse] = js.native
    def disassociateSkillGroupFromRoom(params: DisassociateSkillGroupFromRoomRequest): Request[DisassociateSkillGroupFromRoomResponse] = js.native
    def forgetSmartHomeAppliances(params: ForgetSmartHomeAppliancesRequest): Request[ForgetSmartHomeAppliancesResponse] = js.native
    def getAddressBook(params: GetAddressBookRequest): Request[GetAddressBookResponse] = js.native
    def getConferencePreference(params: GetConferencePreferenceRequest): Request[GetConferencePreferenceResponse] = js.native
    def getConferenceProvider(params: GetConferenceProviderRequest): Request[GetConferenceProviderResponse] = js.native
    def getContact(params: GetContactRequest): Request[GetContactResponse] = js.native
    def getDevice(params: GetDeviceRequest): Request[GetDeviceResponse] = js.native
    def getProfile(params: GetProfileRequest): Request[GetProfileResponse] = js.native
    def getRoom(params: GetRoomRequest): Request[GetRoomResponse] = js.native
    def getRoomSkillParameter(params: GetRoomSkillParameterRequest): Request[GetRoomSkillParameterResponse] = js.native
    def getSkillGroup(params: GetSkillGroupRequest): Request[GetSkillGroupResponse] = js.native
    def listBusinessReportSchedules(params: ListBusinessReportSchedulesRequest): Request[ListBusinessReportSchedulesResponse] = js.native
    def listConferenceProviders(params: ListConferenceProvidersRequest): Request[ListConferenceProvidersResponse] = js.native
    def listDeviceEvents(params: ListDeviceEventsRequest): Request[ListDeviceEventsResponse] = js.native
    def listSkills(params: ListSkillsRequest): Request[ListSkillsResponse] = js.native
    def listSkillsStoreCategories(params: ListSkillsStoreCategoriesRequest): Request[ListSkillsStoreCategoriesResponse] = js.native
    def listSkillsStoreSkillsByCategory(params: ListSkillsStoreSkillsByCategoryRequest): Request[ListSkillsStoreSkillsByCategoryResponse] = js.native
    def listSmartHomeAppliances(params: ListSmartHomeAppliancesRequest): Request[ListSmartHomeAppliancesResponse] = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse] = js.native
    def putConferencePreference(params: PutConferencePreferenceRequest): Request[PutConferencePreferenceResponse] = js.native
    def putRoomSkillParameter(params: PutRoomSkillParameterRequest): Request[PutRoomSkillParameterResponse] = js.native
    def putSkillAuthorization(params: PutSkillAuthorizationRequest): Request[PutSkillAuthorizationResponse] = js.native
    def registerAVSDevice(params: RegisterAVSDeviceRequest): Request[RegisterAVSDeviceResponse] = js.native
    def rejectSkill(params: RejectSkillRequest): Request[RejectSkillResponse] = js.native
    def resolveRoom(params: ResolveRoomRequest): Request[ResolveRoomResponse] = js.native
    def revokeInvitation(params: RevokeInvitationRequest): Request[RevokeInvitationResponse] = js.native
    def searchAddressBooks(params: SearchAddressBooksRequest): Request[SearchAddressBooksResponse] = js.native
    def searchContacts(params: SearchContactsRequest): Request[SearchContactsResponse] = js.native
    def searchDevices(params: SearchDevicesRequest): Request[SearchDevicesResponse] = js.native
    def searchProfiles(params: SearchProfilesRequest): Request[SearchProfilesResponse] = js.native
    def searchRooms(params: SearchRoomsRequest): Request[SearchRoomsResponse] = js.native
    def searchSkillGroups(params: SearchSkillGroupsRequest): Request[SearchSkillGroupsResponse] = js.native
    def searchUsers(params: SearchUsersRequest): Request[SearchUsersResponse] = js.native
    def sendInvitation(params: SendInvitationRequest): Request[SendInvitationResponse] = js.native
    def startDeviceSync(params: StartDeviceSyncRequest): Request[StartDeviceSyncResponse] = js.native
    def startSmartHomeApplianceDiscovery(params: StartSmartHomeApplianceDiscoveryRequest): Request[StartSmartHomeApplianceDiscoveryResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateAddressBook(params: UpdateAddressBookRequest): Request[UpdateAddressBookResponse] = js.native
    def updateBusinessReportSchedule(params: UpdateBusinessReportScheduleRequest): Request[UpdateBusinessReportScheduleResponse] = js.native
    def updateConferenceProvider(params: UpdateConferenceProviderRequest): Request[UpdateConferenceProviderResponse] = js.native
    def updateContact(params: UpdateContactRequest): Request[UpdateContactResponse] = js.native
    def updateDevice(params: UpdateDeviceRequest): Request[UpdateDeviceResponse] = js.native
    def updateProfile(params: UpdateProfileRequest): Request[UpdateProfileResponse] = js.native
    def updateRoom(params: UpdateRoomRequest): Request[UpdateRoomResponse] = js.native
    def updateSkillGroup(params: UpdateSkillGroupRequest): Request[UpdateSkillGroupResponse] = js.native
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
      Name: js.UndefOr[AddressBookName] = js.undefined): AddressBook = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AddressBookArn" -> AddressBookArn.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddressBook]
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
      Name: js.UndefOr[AddressBookName] = js.undefined): AddressBookData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AddressBookArn" -> AddressBookArn.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddressBookData]
    }
  }

  @js.native
  trait ApproveSkillRequest extends js.Object {
    var SkillId: SkillId
  }

  object ApproveSkillRequest {
    def apply(
      SkillId: SkillId): ApproveSkillRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SkillId" -> SkillId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApproveSkillRequest]
    }
  }

  @js.native
  trait ApproveSkillResponse extends js.Object {

  }

  object ApproveSkillResponse {
    def apply(): ApproveSkillResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApproveSkillResponse]
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
      ContactArn: Arn): AssociateContactWithAddressBookRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AddressBookArn" -> AddressBookArn.asInstanceOf[js.Any],
        "ContactArn" -> ContactArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateContactWithAddressBookRequest]
    }
  }

  @js.native
  trait AssociateContactWithAddressBookResponse extends js.Object {

  }

  object AssociateContactWithAddressBookResponse {
    def apply(): AssociateContactWithAddressBookResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateContactWithAddressBookResponse]
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
      RoomArn: js.UndefOr[Arn] = js.undefined): AssociateDeviceWithRoomRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceArn" -> DeviceArn.map { x => x.asInstanceOf[js.Any] },
        "RoomArn" -> RoomArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateDeviceWithRoomRequest]
    }
  }

  @js.native
  trait AssociateDeviceWithRoomResponse extends js.Object {

  }

  object AssociateDeviceWithRoomResponse {
    def apply(): AssociateDeviceWithRoomResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateDeviceWithRoomResponse]
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
      SkillGroupArn: js.UndefOr[Arn] = js.undefined): AssociateSkillGroupWithRoomRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoomArn" -> RoomArn.map { x => x.asInstanceOf[js.Any] },
        "SkillGroupArn" -> SkillGroupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateSkillGroupWithRoomRequest]
    }
  }

  @js.native
  trait AssociateSkillGroupWithRoomResponse extends js.Object {

  }

  object AssociateSkillGroupWithRoomResponse {
    def apply(): AssociateSkillGroupWithRoomResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateSkillGroupWithRoomResponse]
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
      SkillGroupArn: js.UndefOr[Arn] = js.undefined): AssociateSkillWithSkillGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SkillId" -> SkillId.asInstanceOf[js.Any],
        "SkillGroupArn" -> SkillGroupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateSkillWithSkillGroupRequest]
    }
  }

  @js.native
  trait AssociateSkillWithSkillGroupResponse extends js.Object {

  }

  object AssociateSkillWithSkillGroupResponse {
    def apply(): AssociateSkillWithSkillGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateSkillWithSkillGroupResponse]
    }
  }

  @js.native
  trait AssociateSkillWithUsersRequest extends js.Object {
    var SkillId: SkillId
    var OrganizationArn: js.UndefOr[Arn]
  }

  object AssociateSkillWithUsersRequest {
    def apply(
      SkillId: SkillId,
      OrganizationArn: js.UndefOr[Arn] = js.undefined): AssociateSkillWithUsersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SkillId" -> SkillId.asInstanceOf[js.Any],
        "OrganizationArn" -> OrganizationArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateSkillWithUsersRequest]
    }
  }

  @js.native
  trait AssociateSkillWithUsersResponse extends js.Object {

  }

  object AssociateSkillWithUsersResponse {
    def apply(): AssociateSkillWithUsersResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateSkillWithUsersResponse]
    }
  }

  /**
   * Usage report with specified parameters.
   */
  @js.native
  trait BusinessReport extends js.Object {
    var DeliveryTime: js.UndefOr[Timestamp]
    var DownloadUrl: js.UndefOr[BusinessReportDownloadUrl]
    var FailureCode: js.UndefOr[BusinessReportFailureCode]
    var S3Location: js.UndefOr[BusinessReportS3Location]
    var Status: js.UndefOr[BusinessReportStatus]
  }

  object BusinessReport {
    def apply(
      DeliveryTime: js.UndefOr[Timestamp] = js.undefined,
      DownloadUrl: js.UndefOr[BusinessReportDownloadUrl] = js.undefined,
      FailureCode: js.UndefOr[BusinessReportFailureCode] = js.undefined,
      S3Location: js.UndefOr[BusinessReportS3Location] = js.undefined,
      Status: js.UndefOr[BusinessReportStatus] = js.undefined): BusinessReport = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryTime" -> DeliveryTime.map { x => x.asInstanceOf[js.Any] },
        "DownloadUrl" -> DownloadUrl.map { x => x.asInstanceOf[js.Any] },
        "FailureCode" -> FailureCode.map { x => x.asInstanceOf[js.Any] },
        "S3Location" -> S3Location.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BusinessReport]
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
      Interval: js.UndefOr[BusinessReportInterval] = js.undefined): BusinessReportContentRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Interval" -> Interval.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BusinessReportContentRange]
    }
  }

  object BusinessReportFailureCodeEnum {
    val ACCESS_DENIED = "ACCESS_DENIED"
    val NO_SUCH_BUCKET = "NO_SUCH_BUCKET"
    val INTERNAL_FAILURE = "INTERNAL_FAILURE"

    val values = IndexedSeq(ACCESS_DENIED, NO_SUCH_BUCKET, INTERNAL_FAILURE)
  }

  object BusinessReportFormatEnum {
    val CSV = "CSV"
    val CSV_ZIP = "CSV_ZIP"

    val values = IndexedSeq(CSV, CSV_ZIP)
  }

  object BusinessReportIntervalEnum {
    val ONE_DAY = "ONE_DAY"
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
      StartDate: js.UndefOr[Date] = js.undefined): BusinessReportRecurrence = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartDate" -> StartDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BusinessReportRecurrence]
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
      Path: js.UndefOr[BusinessReportS3Path] = js.undefined): BusinessReportS3Location = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketName" -> BucketName.map { x => x.asInstanceOf[js.Any] },
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BusinessReportS3Location]
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
      ScheduleName: js.UndefOr[BusinessReportScheduleName] = js.undefined): BusinessReportSchedule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContentRange" -> ContentRange.map { x => x.asInstanceOf[js.Any] },
        "Format" -> Format.map { x => x.asInstanceOf[js.Any] },
        "LastBusinessReport" -> LastBusinessReport.map { x => x.asInstanceOf[js.Any] },
        "Recurrence" -> Recurrence.map { x => x.asInstanceOf[js.Any] },
        "S3BucketName" -> S3BucketName.map { x => x.asInstanceOf[js.Any] },
        "S3KeyPrefix" -> S3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "ScheduleArn" -> ScheduleArn.map { x => x.asInstanceOf[js.Any] },
        "ScheduleName" -> ScheduleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BusinessReportSchedule]
    }
  }

  object BusinessReportStatusEnum {
    val RUNNING = "RUNNING"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED = "FAILED"

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
      CategoryName: js.UndefOr[CategoryName] = js.undefined): Category = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CategoryId" -> CategoryId.map { x => x.asInstanceOf[js.Any] },
        "CategoryName" -> CategoryName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Category]
    }
  }

  object CommsProtocolEnum {
    val SIP = "SIP"
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
      DefaultConferenceProviderArn: js.UndefOr[Arn] = js.undefined): ConferencePreference = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefaultConferenceProviderArn" -> DefaultConferenceProviderArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConferencePreference]
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
      Type: js.UndefOr[ConferenceProviderType] = js.undefined): ConferenceProvider = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "IPDialIn" -> IPDialIn.map { x => x.asInstanceOf[js.Any] },
        "MeetingSetting" -> MeetingSetting.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "PSTNDialIn" -> PSTNDialIn.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConferenceProvider]
    }
  }

  object ConferenceProviderTypeEnum {
    val CHIME = "CHIME"
    val BLUEJEANS = "BLUEJEANS"
    val FUZE = "FUZE"
    val GOOGLE_HANGOUTS = "GOOGLE_HANGOUTS"
    val POLYCOM = "POLYCOM"
    val RINGCENTRAL = "RINGCENTRAL"
    val SKYPE_FOR_BUSINESS = "SKYPE_FOR_BUSINESS"
    val WEBEX = "WEBEX"
    val ZOOM = "ZOOM"
    val CUSTOM = "CUSTOM"

    val values = IndexedSeq(CHIME, BLUEJEANS, FUZE, GOOGLE_HANGOUTS, POLYCOM, RINGCENTRAL, SKYPE_FOR_BUSINESS, WEBEX, ZOOM, CUSTOM)
  }

  object ConnectionStatusEnum {
    val ONLINE = "ONLINE"
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
    var PhoneNumber: js.UndefOr[E164PhoneNumber]
  }

  object Contact {
    def apply(
      ContactArn: js.UndefOr[Arn] = js.undefined,
      DisplayName: js.UndefOr[ContactName] = js.undefined,
      FirstName: js.UndefOr[ContactName] = js.undefined,
      LastName: js.UndefOr[ContactName] = js.undefined,
      PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined): Contact = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContactArn" -> ContactArn.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] },
        "FirstName" -> FirstName.map { x => x.asInstanceOf[js.Any] },
        "LastName" -> LastName.map { x => x.asInstanceOf[js.Any] },
        "PhoneNumber" -> PhoneNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Contact]
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
    var PhoneNumber: js.UndefOr[E164PhoneNumber]
  }

  object ContactData {
    def apply(
      ContactArn: js.UndefOr[Arn] = js.undefined,
      DisplayName: js.UndefOr[ContactName] = js.undefined,
      FirstName: js.UndefOr[ContactName] = js.undefined,
      LastName: js.UndefOr[ContactName] = js.undefined,
      PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined): ContactData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContactArn" -> ContactArn.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] },
        "FirstName" -> FirstName.map { x => x.asInstanceOf[js.Any] },
        "LastName" -> LastName.map { x => x.asInstanceOf[js.Any] },
        "PhoneNumber" -> PhoneNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContactData]
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
      Description: js.UndefOr[AddressBookDescription] = js.undefined): CreateAddressBookRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAddressBookRequest]
    }
  }

  @js.native
  trait CreateAddressBookResponse extends js.Object {
    var AddressBookArn: js.UndefOr[Arn]
  }

  object CreateAddressBookResponse {
    def apply(
      AddressBookArn: js.UndefOr[Arn] = js.undefined): CreateAddressBookResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AddressBookArn" -> AddressBookArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAddressBookResponse]
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
      ScheduleName: js.UndefOr[BusinessReportScheduleName] = js.undefined): CreateBusinessReportScheduleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContentRange" -> ContentRange.asInstanceOf[js.Any],
        "Format" -> Format.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "Recurrence" -> Recurrence.map { x => x.asInstanceOf[js.Any] },
        "S3BucketName" -> S3BucketName.map { x => x.asInstanceOf[js.Any] },
        "S3KeyPrefix" -> S3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "ScheduleName" -> ScheduleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBusinessReportScheduleRequest]
    }
  }

  @js.native
  trait CreateBusinessReportScheduleResponse extends js.Object {
    var ScheduleArn: js.UndefOr[Arn]
  }

  object CreateBusinessReportScheduleResponse {
    def apply(
      ScheduleArn: js.UndefOr[Arn] = js.undefined): CreateBusinessReportScheduleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScheduleArn" -> ScheduleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBusinessReportScheduleResponse]
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
      PSTNDialIn: js.UndefOr[PSTNDialIn] = js.undefined): CreateConferenceProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConferenceProviderName" -> ConferenceProviderName.asInstanceOf[js.Any],
        "ConferenceProviderType" -> ConferenceProviderType.asInstanceOf[js.Any],
        "MeetingSetting" -> MeetingSetting.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "IPDialIn" -> IPDialIn.map { x => x.asInstanceOf[js.Any] },
        "PSTNDialIn" -> PSTNDialIn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConferenceProviderRequest]
    }
  }

  @js.native
  trait CreateConferenceProviderResponse extends js.Object {
    var ConferenceProviderArn: js.UndefOr[Arn]
  }

  object CreateConferenceProviderResponse {
    def apply(
      ConferenceProviderArn: js.UndefOr[Arn] = js.undefined): CreateConferenceProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConferenceProviderArn" -> ConferenceProviderArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConferenceProviderResponse]
    }
  }

  @js.native
  trait CreateContactRequest extends js.Object {
    var FirstName: ContactName
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var DisplayName: js.UndefOr[ContactName]
    var LastName: js.UndefOr[ContactName]
    var PhoneNumber: js.UndefOr[E164PhoneNumber]
  }

  object CreateContactRequest {
    def apply(
      FirstName: ContactName,
      ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
      DisplayName: js.UndefOr[ContactName] = js.undefined,
      LastName: js.UndefOr[ContactName] = js.undefined,
      PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined): CreateContactRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FirstName" -> FirstName.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] },
        "LastName" -> LastName.map { x => x.asInstanceOf[js.Any] },
        "PhoneNumber" -> PhoneNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateContactRequest]
    }
  }

  @js.native
  trait CreateContactResponse extends js.Object {
    var ContactArn: js.UndefOr[Arn]
  }

  object CreateContactResponse {
    def apply(
      ContactArn: js.UndefOr[Arn] = js.undefined): CreateContactResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContactArn" -> ContactArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateContactResponse]
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
      MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined,
      PSTNEnabled: js.UndefOr[Boolean] = js.undefined,
      SetupModeDisabled: js.UndefOr[Boolean] = js.undefined): CreateProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Address" -> Address.asInstanceOf[js.Any],
        "DistanceUnit" -> DistanceUnit.asInstanceOf[js.Any],
        "ProfileName" -> ProfileName.asInstanceOf[js.Any],
        "TemperatureUnit" -> TemperatureUnit.asInstanceOf[js.Any],
        "Timezone" -> Timezone.asInstanceOf[js.Any],
        "WakeWord" -> WakeWord.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "MaxVolumeLimit" -> MaxVolumeLimit.map { x => x.asInstanceOf[js.Any] },
        "PSTNEnabled" -> PSTNEnabled.map { x => x.asInstanceOf[js.Any] },
        "SetupModeDisabled" -> SetupModeDisabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProfileRequest]
    }
  }

  @js.native
  trait CreateProfileResponse extends js.Object {
    var ProfileArn: js.UndefOr[Arn]
  }

  object CreateProfileResponse {
    def apply(
      ProfileArn: js.UndefOr[Arn] = js.undefined): CreateProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProfileArn" -> ProfileArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProfileResponse]
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
      Tags: js.UndefOr[TagList] = js.undefined): CreateRoomRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoomName" -> RoomName.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ProfileArn" -> ProfileArn.map { x => x.asInstanceOf[js.Any] },
        "ProviderCalendarId" -> ProviderCalendarId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRoomRequest]
    }
  }

  @js.native
  trait CreateRoomResponse extends js.Object {
    var RoomArn: js.UndefOr[Arn]
  }

  object CreateRoomResponse {
    def apply(
      RoomArn: js.UndefOr[Arn] = js.undefined): CreateRoomResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoomArn" -> RoomArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRoomResponse]
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
      Description: js.UndefOr[SkillGroupDescription] = js.undefined): CreateSkillGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SkillGroupName" -> SkillGroupName.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSkillGroupRequest]
    }
  }

  @js.native
  trait CreateSkillGroupResponse extends js.Object {
    var SkillGroupArn: js.UndefOr[Arn]
  }

  object CreateSkillGroupResponse {
    def apply(
      SkillGroupArn: js.UndefOr[Arn] = js.undefined): CreateSkillGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SkillGroupArn" -> SkillGroupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSkillGroupResponse]
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
      Tags: js.UndefOr[TagList] = js.undefined): CreateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserId" -> UserId.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "Email" -> Email.map { x => x.asInstanceOf[js.Any] },
        "FirstName" -> FirstName.map { x => x.asInstanceOf[js.Any] },
        "LastName" -> LastName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object {
    var UserArn: js.UndefOr[Arn]
  }

  object CreateUserResponse {
    def apply(
      UserArn: js.UndefOr[Arn] = js.undefined): CreateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserArn" -> UserArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserResponse]
    }
  }

  @js.native
  trait DeleteAddressBookRequest extends js.Object {
    var AddressBookArn: Arn
  }

  object DeleteAddressBookRequest {
    def apply(
      AddressBookArn: Arn): DeleteAddressBookRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AddressBookArn" -> AddressBookArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAddressBookRequest]
    }
  }

  @js.native
  trait DeleteAddressBookResponse extends js.Object {

  }

  object DeleteAddressBookResponse {
    def apply(): DeleteAddressBookResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAddressBookResponse]
    }
  }

  @js.native
  trait DeleteBusinessReportScheduleRequest extends js.Object {
    var ScheduleArn: Arn
  }

  object DeleteBusinessReportScheduleRequest {
    def apply(
      ScheduleArn: Arn): DeleteBusinessReportScheduleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScheduleArn" -> ScheduleArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBusinessReportScheduleRequest]
    }
  }

  @js.native
  trait DeleteBusinessReportScheduleResponse extends js.Object {

  }

  object DeleteBusinessReportScheduleResponse {
    def apply(): DeleteBusinessReportScheduleResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBusinessReportScheduleResponse]
    }
  }

  @js.native
  trait DeleteConferenceProviderRequest extends js.Object {
    var ConferenceProviderArn: Arn
  }

  object DeleteConferenceProviderRequest {
    def apply(
      ConferenceProviderArn: Arn): DeleteConferenceProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConferenceProviderArn" -> ConferenceProviderArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConferenceProviderRequest]
    }
  }

  @js.native
  trait DeleteConferenceProviderResponse extends js.Object {

  }

  object DeleteConferenceProviderResponse {
    def apply(): DeleteConferenceProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConferenceProviderResponse]
    }
  }

  @js.native
  trait DeleteContactRequest extends js.Object {
    var ContactArn: Arn
  }

  object DeleteContactRequest {
    def apply(
      ContactArn: Arn): DeleteContactRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContactArn" -> ContactArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteContactRequest]
    }
  }

  @js.native
  trait DeleteContactResponse extends js.Object {

  }

  object DeleteContactResponse {
    def apply(): DeleteContactResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteContactResponse]
    }
  }

  @js.native
  trait DeleteDeviceRequest extends js.Object {
    var DeviceArn: Arn
  }

  object DeleteDeviceRequest {
    def apply(
      DeviceArn: Arn): DeleteDeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceArn" -> DeviceArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDeviceRequest]
    }
  }

  @js.native
  trait DeleteDeviceResponse extends js.Object {

  }

  object DeleteDeviceResponse {
    def apply(): DeleteDeviceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDeviceResponse]
    }
  }

  @js.native
  trait DeleteProfileRequest extends js.Object {
    var ProfileArn: js.UndefOr[Arn]
  }

  object DeleteProfileRequest {
    def apply(
      ProfileArn: js.UndefOr[Arn] = js.undefined): DeleteProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProfileArn" -> ProfileArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProfileRequest]
    }
  }

  @js.native
  trait DeleteProfileResponse extends js.Object {

  }

  object DeleteProfileResponse {
    def apply(): DeleteProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProfileResponse]
    }
  }

  @js.native
  trait DeleteRoomRequest extends js.Object {
    var RoomArn: js.UndefOr[Arn]
  }

  object DeleteRoomRequest {
    def apply(
      RoomArn: js.UndefOr[Arn] = js.undefined): DeleteRoomRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoomArn" -> RoomArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRoomRequest]
    }
  }

  @js.native
  trait DeleteRoomResponse extends js.Object {

  }

  object DeleteRoomResponse {
    def apply(): DeleteRoomResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRoomResponse]
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
      RoomArn: js.UndefOr[Arn] = js.undefined): DeleteRoomSkillParameterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterKey" -> ParameterKey.asInstanceOf[js.Any],
        "SkillId" -> SkillId.asInstanceOf[js.Any],
        "RoomArn" -> RoomArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRoomSkillParameterRequest]
    }
  }

  @js.native
  trait DeleteRoomSkillParameterResponse extends js.Object {

  }

  object DeleteRoomSkillParameterResponse {
    def apply(): DeleteRoomSkillParameterResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRoomSkillParameterResponse]
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
      RoomArn: js.UndefOr[Arn] = js.undefined): DeleteSkillAuthorizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SkillId" -> SkillId.asInstanceOf[js.Any],
        "RoomArn" -> RoomArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSkillAuthorizationRequest]
    }
  }

  @js.native
  trait DeleteSkillAuthorizationResponse extends js.Object {

  }

  object DeleteSkillAuthorizationResponse {
    def apply(): DeleteSkillAuthorizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSkillAuthorizationResponse]
    }
  }

  @js.native
  trait DeleteSkillGroupRequest extends js.Object {
    var SkillGroupArn: js.UndefOr[Arn]
  }

  object DeleteSkillGroupRequest {
    def apply(
      SkillGroupArn: js.UndefOr[Arn] = js.undefined): DeleteSkillGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SkillGroupArn" -> SkillGroupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSkillGroupRequest]
    }
  }

  @js.native
  trait DeleteSkillGroupResponse extends js.Object {

  }

  object DeleteSkillGroupResponse {
    def apply(): DeleteSkillGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSkillGroupResponse]
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
      UserArn: js.UndefOr[Arn] = js.undefined): DeleteUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EnrollmentId" -> EnrollmentId.asInstanceOf[js.Any],
        "UserArn" -> UserArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DeleteUserResponse extends js.Object {

  }

  object DeleteUserResponse {
    def apply(): DeleteUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserResponse]
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
      Url: js.UndefOr[Url] = js.undefined): DeveloperInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeveloperName" -> DeveloperName.map { x => x.asInstanceOf[js.Any] },
        "Email" -> Email.map { x => x.asInstanceOf[js.Any] },
        "PrivacyPolicy" -> PrivacyPolicy.map { x => x.asInstanceOf[js.Any] },
        "Url" -> Url.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeveloperInfo]
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
      RoomArn: js.UndefOr[Arn] = js.undefined,
      SoftwareVersion: js.UndefOr[SoftwareVersion] = js.undefined): Device = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceArn" -> DeviceArn.map { x => x.asInstanceOf[js.Any] },
        "DeviceName" -> DeviceName.map { x => x.asInstanceOf[js.Any] },
        "DeviceSerialNumber" -> DeviceSerialNumber.map { x => x.asInstanceOf[js.Any] },
        "DeviceStatus" -> DeviceStatus.map { x => x.asInstanceOf[js.Any] },
        "DeviceStatusInfo" -> DeviceStatusInfo.map { x => x.asInstanceOf[js.Any] },
        "DeviceType" -> DeviceType.map { x => x.asInstanceOf[js.Any] },
        "MacAddress" -> MacAddress.map { x => x.asInstanceOf[js.Any] },
        "RoomArn" -> RoomArn.map { x => x.asInstanceOf[js.Any] },
        "SoftwareVersion" -> SoftwareVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Device]
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
      RoomArn: js.UndefOr[Arn] = js.undefined,
      RoomName: js.UndefOr[RoomName] = js.undefined,
      SoftwareVersion: js.UndefOr[SoftwareVersion] = js.undefined): DeviceData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceArn" -> DeviceArn.map { x => x.asInstanceOf[js.Any] },
        "DeviceName" -> DeviceName.map { x => x.asInstanceOf[js.Any] },
        "DeviceSerialNumber" -> DeviceSerialNumber.map { x => x.asInstanceOf[js.Any] },
        "DeviceStatus" -> DeviceStatus.map { x => x.asInstanceOf[js.Any] },
        "DeviceStatusInfo" -> DeviceStatusInfo.map { x => x.asInstanceOf[js.Any] },
        "DeviceType" -> DeviceType.map { x => x.asInstanceOf[js.Any] },
        "MacAddress" -> MacAddress.map { x => x.asInstanceOf[js.Any] },
        "RoomArn" -> RoomArn.map { x => x.asInstanceOf[js.Any] },
        "RoomName" -> RoomName.map { x => x.asInstanceOf[js.Any] },
        "SoftwareVersion" -> SoftwareVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceData]
    }
  }

  /**
   * The list of device events.
   */
  @js.native
  trait DeviceEvent extends js.Object {
    var Timestamp: js.UndefOr[Timestamp]
    var Type: js.UndefOr[DeviceEventType]
    var Value: js.UndefOr[DeviceEventValue]
  }

  object DeviceEvent {
    def apply(
      Timestamp: js.UndefOr[Timestamp] = js.undefined,
      Type: js.UndefOr[DeviceEventType] = js.undefined,
      Value: js.UndefOr[DeviceEventValue] = js.undefined): DeviceEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceEvent]
    }
  }

  object DeviceEventTypeEnum {
    val CONNECTION_STATUS = "CONNECTION_STATUS"
    val DEVICE_STATUS = "DEVICE_STATUS"

    val values = IndexedSeq(CONNECTION_STATUS, DEVICE_STATUS)
  }

  object DeviceStatusEnum {
    val READY = "READY"
    val PENDING = "PENDING"
    val WAS_OFFLINE = "WAS_OFFLINE"
    val DEREGISTERED = "DEREGISTERED"

    val values = IndexedSeq(READY, PENDING, WAS_OFFLINE, DEREGISTERED)
  }

  /**
   * Details of a device�fs status.
   */
  @js.native
  trait DeviceStatusDetail extends js.Object {
    var Code: js.UndefOr[DeviceStatusDetailCode]
  }

  object DeviceStatusDetail {
    def apply(
      Code: js.UndefOr[DeviceStatusDetailCode] = js.undefined): DeviceStatusDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceStatusDetail]
    }
  }

  object DeviceStatusDetailCodeEnum {
    val DEVICE_SOFTWARE_UPDATE_NEEDED = "DEVICE_SOFTWARE_UPDATE_NEEDED"
    val DEVICE_WAS_OFFLINE = "DEVICE_WAS_OFFLINE"

    val values = IndexedSeq(DEVICE_SOFTWARE_UPDATE_NEEDED, DEVICE_WAS_OFFLINE)
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
      DeviceStatusDetails: js.UndefOr[DeviceStatusDetails] = js.undefined): DeviceStatusInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectionStatus" -> ConnectionStatus.map { x => x.asInstanceOf[js.Any] },
        "DeviceStatusDetails" -> DeviceStatusDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceStatusInfo]
    }
  }

  @js.native
  trait DisassociateContactFromAddressBookRequest extends js.Object {
    var AddressBookArn: Arn
    var ContactArn: Arn
  }

  object DisassociateContactFromAddressBookRequest {
    def apply(
      AddressBookArn: Arn,
      ContactArn: Arn): DisassociateContactFromAddressBookRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AddressBookArn" -> AddressBookArn.asInstanceOf[js.Any],
        "ContactArn" -> ContactArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateContactFromAddressBookRequest]
    }
  }

  @js.native
  trait DisassociateContactFromAddressBookResponse extends js.Object {

  }

  object DisassociateContactFromAddressBookResponse {
    def apply(): DisassociateContactFromAddressBookResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateContactFromAddressBookResponse]
    }
  }

  @js.native
  trait DisassociateDeviceFromRoomRequest extends js.Object {
    var DeviceArn: js.UndefOr[Arn]
  }

  object DisassociateDeviceFromRoomRequest {
    def apply(
      DeviceArn: js.UndefOr[Arn] = js.undefined): DisassociateDeviceFromRoomRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceArn" -> DeviceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateDeviceFromRoomRequest]
    }
  }

  @js.native
  trait DisassociateDeviceFromRoomResponse extends js.Object {

  }

  object DisassociateDeviceFromRoomResponse {
    def apply(): DisassociateDeviceFromRoomResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateDeviceFromRoomResponse]
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
      SkillGroupArn: js.UndefOr[Arn] = js.undefined): DisassociateSkillFromSkillGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SkillId" -> SkillId.asInstanceOf[js.Any],
        "SkillGroupArn" -> SkillGroupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateSkillFromSkillGroupRequest]
    }
  }

  @js.native
  trait DisassociateSkillFromSkillGroupResponse extends js.Object {

  }

  object DisassociateSkillFromSkillGroupResponse {
    def apply(): DisassociateSkillFromSkillGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateSkillFromSkillGroupResponse]
    }
  }

  @js.native
  trait DisassociateSkillFromUsersRequest extends js.Object {
    var SkillId: SkillId
    var OrganizationArn: js.UndefOr[Arn]
  }

  object DisassociateSkillFromUsersRequest {
    def apply(
      SkillId: SkillId,
      OrganizationArn: js.UndefOr[Arn] = js.undefined): DisassociateSkillFromUsersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SkillId" -> SkillId.asInstanceOf[js.Any],
        "OrganizationArn" -> OrganizationArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateSkillFromUsersRequest]
    }
  }

  @js.native
  trait DisassociateSkillFromUsersResponse extends js.Object {

  }

  object DisassociateSkillFromUsersResponse {
    def apply(): DisassociateSkillFromUsersResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateSkillFromUsersResponse]
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
      SkillGroupArn: js.UndefOr[Arn] = js.undefined): DisassociateSkillGroupFromRoomRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoomArn" -> RoomArn.map { x => x.asInstanceOf[js.Any] },
        "SkillGroupArn" -> SkillGroupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateSkillGroupFromRoomRequest]
    }
  }

  @js.native
  trait DisassociateSkillGroupFromRoomResponse extends js.Object {

  }

  object DisassociateSkillGroupFromRoomResponse {
    def apply(): DisassociateSkillGroupFromRoomResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateSkillGroupFromRoomResponse]
    }
  }

  object DistanceUnitEnum {
    val METRIC = "METRIC"
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
    val INITIALIZED = "INITIALIZED"
    val PENDING = "PENDING"
    val REGISTERED = "REGISTERED"
    val DISASSOCIATING = "DISASSOCIATING"
    val DEREGISTERING = "DEREGISTERING"

    val values = IndexedSeq(INITIALIZED, PENDING, REGISTERED, DISASSOCIATING, DEREGISTERING)
  }

  object FeatureEnum {
    val BLUETOOTH = "BLUETOOTH"
    val VOLUME = "VOLUME"
    val NOTIFICATIONS = "NOTIFICATIONS"
    val LISTS = "LISTS"
    val SKILLS = "SKILLS"
    val ALL = "ALL"

    val values = IndexedSeq(BLUETOOTH, VOLUME, NOTIFICATIONS, LISTS, SKILLS, ALL)
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
      Values: FilterValueList): Filter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filter]
    }
  }

  @js.native
  trait ForgetSmartHomeAppliancesRequest extends js.Object {
    var RoomArn: Arn
  }

  object ForgetSmartHomeAppliancesRequest {
    def apply(
      RoomArn: Arn): ForgetSmartHomeAppliancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoomArn" -> RoomArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ForgetSmartHomeAppliancesRequest]
    }
  }

  @js.native
  trait ForgetSmartHomeAppliancesResponse extends js.Object {

  }

  object ForgetSmartHomeAppliancesResponse {
    def apply(): ForgetSmartHomeAppliancesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ForgetSmartHomeAppliancesResponse]
    }
  }

  @js.native
  trait GetAddressBookRequest extends js.Object {
    var AddressBookArn: Arn
  }

  object GetAddressBookRequest {
    def apply(
      AddressBookArn: Arn): GetAddressBookRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AddressBookArn" -> AddressBookArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAddressBookRequest]
    }
  }

  @js.native
  trait GetAddressBookResponse extends js.Object {
    var AddressBook: js.UndefOr[AddressBook]
  }

  object GetAddressBookResponse {
    def apply(
      AddressBook: js.UndefOr[AddressBook] = js.undefined): GetAddressBookResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AddressBook" -> AddressBook.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAddressBookResponse]
    }
  }

  @js.native
  trait GetConferencePreferenceRequest extends js.Object {

  }

  object GetConferencePreferenceRequest {
    def apply(): GetConferencePreferenceRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConferencePreferenceRequest]
    }
  }

  @js.native
  trait GetConferencePreferenceResponse extends js.Object {
    var Preference: js.UndefOr[ConferencePreference]
  }

  object GetConferencePreferenceResponse {
    def apply(
      Preference: js.UndefOr[ConferencePreference] = js.undefined): GetConferencePreferenceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Preference" -> Preference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConferencePreferenceResponse]
    }
  }

  @js.native
  trait GetConferenceProviderRequest extends js.Object {
    var ConferenceProviderArn: Arn
  }

  object GetConferenceProviderRequest {
    def apply(
      ConferenceProviderArn: Arn): GetConferenceProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConferenceProviderArn" -> ConferenceProviderArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConferenceProviderRequest]
    }
  }

  @js.native
  trait GetConferenceProviderResponse extends js.Object {
    var ConferenceProvider: js.UndefOr[ConferenceProvider]
  }

  object GetConferenceProviderResponse {
    def apply(
      ConferenceProvider: js.UndefOr[ConferenceProvider] = js.undefined): GetConferenceProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConferenceProvider" -> ConferenceProvider.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConferenceProviderResponse]
    }
  }

  @js.native
  trait GetContactRequest extends js.Object {
    var ContactArn: Arn
  }

  object GetContactRequest {
    def apply(
      ContactArn: Arn): GetContactRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContactArn" -> ContactArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetContactRequest]
    }
  }

  @js.native
  trait GetContactResponse extends js.Object {
    var Contact: js.UndefOr[Contact]
  }

  object GetContactResponse {
    def apply(
      Contact: js.UndefOr[Contact] = js.undefined): GetContactResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Contact" -> Contact.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetContactResponse]
    }
  }

  @js.native
  trait GetDeviceRequest extends js.Object {
    var DeviceArn: js.UndefOr[Arn]
  }

  object GetDeviceRequest {
    def apply(
      DeviceArn: js.UndefOr[Arn] = js.undefined): GetDeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceArn" -> DeviceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeviceRequest]
    }
  }

  @js.native
  trait GetDeviceResponse extends js.Object {
    var Device: js.UndefOr[Device]
  }

  object GetDeviceResponse {
    def apply(
      Device: js.UndefOr[Device] = js.undefined): GetDeviceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Device" -> Device.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeviceResponse]
    }
  }

  @js.native
  trait GetProfileRequest extends js.Object {
    var ProfileArn: js.UndefOr[Arn]
  }

  object GetProfileRequest {
    def apply(
      ProfileArn: js.UndefOr[Arn] = js.undefined): GetProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProfileArn" -> ProfileArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetProfileRequest]
    }
  }

  @js.native
  trait GetProfileResponse extends js.Object {
    var Profile: js.UndefOr[Profile]
  }

  object GetProfileResponse {
    def apply(
      Profile: js.UndefOr[Profile] = js.undefined): GetProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Profile" -> Profile.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetProfileResponse]
    }
  }

  @js.native
  trait GetRoomRequest extends js.Object {
    var RoomArn: js.UndefOr[Arn]
  }

  object GetRoomRequest {
    def apply(
      RoomArn: js.UndefOr[Arn] = js.undefined): GetRoomRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoomArn" -> RoomArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRoomRequest]
    }
  }

  @js.native
  trait GetRoomResponse extends js.Object {
    var Room: js.UndefOr[Room]
  }

  object GetRoomResponse {
    def apply(
      Room: js.UndefOr[Room] = js.undefined): GetRoomResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Room" -> Room.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRoomResponse]
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
      RoomArn: js.UndefOr[Arn] = js.undefined): GetRoomSkillParameterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterKey" -> ParameterKey.asInstanceOf[js.Any],
        "SkillId" -> SkillId.asInstanceOf[js.Any],
        "RoomArn" -> RoomArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRoomSkillParameterRequest]
    }
  }

  @js.native
  trait GetRoomSkillParameterResponse extends js.Object {
    var RoomSkillParameter: js.UndefOr[RoomSkillParameter]
  }

  object GetRoomSkillParameterResponse {
    def apply(
      RoomSkillParameter: js.UndefOr[RoomSkillParameter] = js.undefined): GetRoomSkillParameterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoomSkillParameter" -> RoomSkillParameter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRoomSkillParameterResponse]
    }
  }

  @js.native
  trait GetSkillGroupRequest extends js.Object {
    var SkillGroupArn: js.UndefOr[Arn]
  }

  object GetSkillGroupRequest {
    def apply(
      SkillGroupArn: js.UndefOr[Arn] = js.undefined): GetSkillGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SkillGroupArn" -> SkillGroupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSkillGroupRequest]
    }
  }

  @js.native
  trait GetSkillGroupResponse extends js.Object {
    var SkillGroup: js.UndefOr[SkillGroup]
  }

  object GetSkillGroupResponse {
    def apply(
      SkillGroup: js.UndefOr[SkillGroup] = js.undefined): GetSkillGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SkillGroup" -> SkillGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSkillGroupResponse]
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
      Endpoint: Endpoint): IPDialIn = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CommsProtocol" -> CommsProtocol.asInstanceOf[js.Any],
        "Endpoint" -> Endpoint.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IPDialIn]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): ListBusinessReportSchedulesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBusinessReportSchedulesRequest]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): ListBusinessReportSchedulesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BusinessReportSchedules" -> BusinessReportSchedules.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBusinessReportSchedulesResponse]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): ListConferenceProvidersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConferenceProvidersRequest]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): ListConferenceProvidersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConferenceProviders" -> ConferenceProviders.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConferenceProvidersResponse]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): ListDeviceEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceArn" -> DeviceArn.asInstanceOf[js.Any],
        "EventType" -> EventType.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeviceEventsRequest]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): ListDeviceEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceEvents" -> DeviceEvents.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeviceEventsResponse]
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
      SkillType: js.UndefOr[SkillTypeFilter] = js.undefined): ListSkillsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EnablementType" -> EnablementType.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SkillGroupArn" -> SkillGroupArn.map { x => x.asInstanceOf[js.Any] },
        "SkillType" -> SkillType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSkillsRequest]
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
      SkillSummaries: js.UndefOr[SkillSummaryList] = js.undefined): ListSkillsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SkillSummaries" -> SkillSummaries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSkillsResponse]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): ListSkillsStoreCategoriesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSkillsStoreCategoriesRequest]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): ListSkillsStoreCategoriesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CategoryList" -> CategoryList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSkillsStoreCategoriesResponse]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): ListSkillsStoreSkillsByCategoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CategoryId" -> CategoryId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSkillsStoreSkillsByCategoryRequest]
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
      SkillsStoreSkills: js.UndefOr[SkillsStoreSkillList] = js.undefined): ListSkillsStoreSkillsByCategoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SkillsStoreSkills" -> SkillsStoreSkills.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSkillsStoreSkillsByCategoryResponse]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): ListSmartHomeAppliancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoomArn" -> RoomArn.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSmartHomeAppliancesRequest]
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
      SmartHomeAppliances: js.UndefOr[SmartHomeApplianceList] = js.undefined): ListSmartHomeAppliancesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SmartHomeAppliances" -> SmartHomeAppliances.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSmartHomeAppliancesResponse]
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
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsRequest]
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
      Tags: js.UndefOr[TagList] = js.undefined): ListTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsResponse]
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
    def apply(
      RequirePin: RequirePin): MeetingSetting = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RequirePin" -> RequirePin.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MeetingSetting]
    }
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
      PhoneNumber: OutboundPhoneNumber): PSTNDialIn = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CountryCode" -> CountryCode.asInstanceOf[js.Any],
        "OneClickIdDelay" -> OneClickIdDelay.asInstanceOf[js.Any],
        "OneClickPinDelay" -> OneClickPinDelay.asInstanceOf[js.Any],
        "PhoneNumber" -> PhoneNumber.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PSTNDialIn]
    }
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
      MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined,
      PSTNEnabled: js.UndefOr[Boolean] = js.undefined,
      ProfileArn: js.UndefOr[Arn] = js.undefined,
      ProfileName: js.UndefOr[ProfileName] = js.undefined,
      SetupModeDisabled: js.UndefOr[Boolean] = js.undefined,
      TemperatureUnit: js.UndefOr[TemperatureUnit] = js.undefined,
      Timezone: js.UndefOr[Timezone] = js.undefined,
      WakeWord: js.UndefOr[WakeWord] = js.undefined): Profile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Address" -> Address.map { x => x.asInstanceOf[js.Any] },
        "AddressBookArn" -> AddressBookArn.map { x => x.asInstanceOf[js.Any] },
        "DistanceUnit" -> DistanceUnit.map { x => x.asInstanceOf[js.Any] },
        "IsDefault" -> IsDefault.map { x => x.asInstanceOf[js.Any] },
        "MaxVolumeLimit" -> MaxVolumeLimit.map { x => x.asInstanceOf[js.Any] },
        "PSTNEnabled" -> PSTNEnabled.map { x => x.asInstanceOf[js.Any] },
        "ProfileArn" -> ProfileArn.map { x => x.asInstanceOf[js.Any] },
        "ProfileName" -> ProfileName.map { x => x.asInstanceOf[js.Any] },
        "SetupModeDisabled" -> SetupModeDisabled.map { x => x.asInstanceOf[js.Any] },
        "TemperatureUnit" -> TemperatureUnit.map { x => x.asInstanceOf[js.Any] },
        "Timezone" -> Timezone.map { x => x.asInstanceOf[js.Any] },
        "WakeWord" -> WakeWord.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Profile]
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
      ProfileArn: js.UndefOr[Arn] = js.undefined,
      ProfileName: js.UndefOr[ProfileName] = js.undefined,
      TemperatureUnit: js.UndefOr[TemperatureUnit] = js.undefined,
      Timezone: js.UndefOr[Timezone] = js.undefined,
      WakeWord: js.UndefOr[WakeWord] = js.undefined): ProfileData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Address" -> Address.map { x => x.asInstanceOf[js.Any] },
        "DistanceUnit" -> DistanceUnit.map { x => x.asInstanceOf[js.Any] },
        "IsDefault" -> IsDefault.map { x => x.asInstanceOf[js.Any] },
        "ProfileArn" -> ProfileArn.map { x => x.asInstanceOf[js.Any] },
        "ProfileName" -> ProfileName.map { x => x.asInstanceOf[js.Any] },
        "TemperatureUnit" -> TemperatureUnit.map { x => x.asInstanceOf[js.Any] },
        "Timezone" -> Timezone.map { x => x.asInstanceOf[js.Any] },
        "WakeWord" -> WakeWord.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProfileData]
    }
  }

  @js.native
  trait PutConferencePreferenceRequest extends js.Object {
    var ConferencePreference: ConferencePreference
  }

  object PutConferencePreferenceRequest {
    def apply(
      ConferencePreference: ConferencePreference): PutConferencePreferenceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConferencePreference" -> ConferencePreference.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConferencePreferenceRequest]
    }
  }

  @js.native
  trait PutConferencePreferenceResponse extends js.Object {

  }

  object PutConferencePreferenceResponse {
    def apply(): PutConferencePreferenceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConferencePreferenceResponse]
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
      RoomArn: js.UndefOr[Arn] = js.undefined): PutRoomSkillParameterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoomSkillParameter" -> RoomSkillParameter.asInstanceOf[js.Any],
        "SkillId" -> SkillId.asInstanceOf[js.Any],
        "RoomArn" -> RoomArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRoomSkillParameterRequest]
    }
  }

  @js.native
  trait PutRoomSkillParameterResponse extends js.Object {

  }

  object PutRoomSkillParameterResponse {
    def apply(): PutRoomSkillParameterResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRoomSkillParameterResponse]
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
      RoomArn: js.UndefOr[Arn] = js.undefined): PutSkillAuthorizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthorizationResult" -> AuthorizationResult.asInstanceOf[js.Any],
        "SkillId" -> SkillId.asInstanceOf[js.Any],
        "RoomArn" -> RoomArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutSkillAuthorizationRequest]
    }
  }

  @js.native
  trait PutSkillAuthorizationResponse extends js.Object {

  }

  object PutSkillAuthorizationResponse {
    def apply(): PutSkillAuthorizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutSkillAuthorizationResponse]
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
      UserCode: UserCode): RegisterAVSDeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AmazonId" -> AmazonId.asInstanceOf[js.Any],
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "DeviceSerialNumber" -> DeviceSerialNumber.asInstanceOf[js.Any],
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "UserCode" -> UserCode.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterAVSDeviceRequest]
    }
  }

  @js.native
  trait RegisterAVSDeviceResponse extends js.Object {
    var DeviceArn: js.UndefOr[Arn]
  }

  object RegisterAVSDeviceResponse {
    def apply(
      DeviceArn: js.UndefOr[Arn] = js.undefined): RegisterAVSDeviceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceArn" -> DeviceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterAVSDeviceResponse]
    }
  }

  @js.native
  trait RejectSkillRequest extends js.Object {
    var SkillId: SkillId
  }

  object RejectSkillRequest {
    def apply(
      SkillId: SkillId): RejectSkillRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SkillId" -> SkillId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectSkillRequest]
    }
  }

  @js.native
  trait RejectSkillResponse extends js.Object {

  }

  object RejectSkillResponse {
    def apply(): RejectSkillResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectSkillResponse]
    }
  }

  object RequirePinEnum {
    val YES = "YES"
    val NO = "NO"
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
      UserId: UserId): ResolveRoomRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SkillId" -> SkillId.asInstanceOf[js.Any],
        "UserId" -> UserId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResolveRoomRequest]
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
      RoomSkillParameters: js.UndefOr[RoomSkillParameters] = js.undefined): ResolveRoomResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoomArn" -> RoomArn.map { x => x.asInstanceOf[js.Any] },
        "RoomName" -> RoomName.map { x => x.asInstanceOf[js.Any] },
        "RoomSkillParameters" -> RoomSkillParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResolveRoomResponse]
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
      UserArn: js.UndefOr[Arn] = js.undefined): RevokeInvitationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EnrollmentId" -> EnrollmentId.map { x => x.asInstanceOf[js.Any] },
        "UserArn" -> UserArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeInvitationRequest]
    }
  }

  @js.native
  trait RevokeInvitationResponse extends js.Object {

  }

  object RevokeInvitationResponse {
    def apply(): RevokeInvitationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeInvitationResponse]
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
      RoomName: js.UndefOr[RoomName] = js.undefined): Room = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ProfileArn" -> ProfileArn.map { x => x.asInstanceOf[js.Any] },
        "ProviderCalendarId" -> ProviderCalendarId.map { x => x.asInstanceOf[js.Any] },
        "RoomArn" -> RoomArn.map { x => x.asInstanceOf[js.Any] },
        "RoomName" -> RoomName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Room]
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
      RoomName: js.UndefOr[RoomName] = js.undefined): RoomData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ProfileArn" -> ProfileArn.map { x => x.asInstanceOf[js.Any] },
        "ProfileName" -> ProfileName.map { x => x.asInstanceOf[js.Any] },
        "ProviderCalendarId" -> ProviderCalendarId.map { x => x.asInstanceOf[js.Any] },
        "RoomArn" -> RoomArn.map { x => x.asInstanceOf[js.Any] },
        "RoomName" -> RoomName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RoomData]
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
      ParameterValue: RoomSkillParameterValue): RoomSkillParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ParameterKey" -> ParameterKey.asInstanceOf[js.Any],
        "ParameterValue" -> ParameterValue.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RoomSkillParameter]
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
      SortCriteria: js.UndefOr[SortList] = js.undefined): SearchAddressBooksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortCriteria" -> SortCriteria.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchAddressBooksRequest]
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
      TotalCount: js.UndefOr[TotalCount] = js.undefined): SearchAddressBooksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AddressBooks" -> AddressBooks.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "TotalCount" -> TotalCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchAddressBooksResponse]
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
      SortCriteria: js.UndefOr[SortList] = js.undefined): SearchContactsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortCriteria" -> SortCriteria.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchContactsRequest]
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
      TotalCount: js.UndefOr[TotalCount] = js.undefined): SearchContactsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Contacts" -> Contacts.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "TotalCount" -> TotalCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchContactsResponse]
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
      SortCriteria: js.UndefOr[SortList] = js.undefined): SearchDevicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortCriteria" -> SortCriteria.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchDevicesRequest]
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
      TotalCount: js.UndefOr[TotalCount] = js.undefined): SearchDevicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Devices" -> Devices.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "TotalCount" -> TotalCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchDevicesResponse]
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
      SortCriteria: js.UndefOr[SortList] = js.undefined): SearchProfilesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortCriteria" -> SortCriteria.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchProfilesRequest]
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
      TotalCount: js.UndefOr[TotalCount] = js.undefined): SearchProfilesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Profiles" -> Profiles.map { x => x.asInstanceOf[js.Any] },
        "TotalCount" -> TotalCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchProfilesResponse]
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
      SortCriteria: js.UndefOr[SortList] = js.undefined): SearchRoomsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortCriteria" -> SortCriteria.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchRoomsRequest]
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
      TotalCount: js.UndefOr[TotalCount] = js.undefined): SearchRoomsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Rooms" -> Rooms.map { x => x.asInstanceOf[js.Any] },
        "TotalCount" -> TotalCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchRoomsResponse]
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
      SortCriteria: js.UndefOr[SortList] = js.undefined): SearchSkillGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortCriteria" -> SortCriteria.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchSkillGroupsRequest]
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
      TotalCount: js.UndefOr[TotalCount] = js.undefined): SearchSkillGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SkillGroups" -> SkillGroups.map { x => x.asInstanceOf[js.Any] },
        "TotalCount" -> TotalCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchSkillGroupsResponse]
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
      SortCriteria: js.UndefOr[SortList] = js.undefined): SearchUsersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "SortCriteria" -> SortCriteria.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchUsersRequest]
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
      Users: js.UndefOr[UserDataList] = js.undefined): SearchUsersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "TotalCount" -> TotalCount.map { x => x.asInstanceOf[js.Any] },
        "Users" -> Users.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchUsersResponse]
    }
  }

  @js.native
  trait SendInvitationRequest extends js.Object {
    var UserArn: js.UndefOr[Arn]
  }

  object SendInvitationRequest {
    def apply(
      UserArn: js.UndefOr[Arn] = js.undefined): SendInvitationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserArn" -> UserArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendInvitationRequest]
    }
  }

  @js.native
  trait SendInvitationResponse extends js.Object {

  }

  object SendInvitationResponse {
    def apply(): SendInvitationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendInvitationResponse]
    }
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
      SkillTypes: js.UndefOr[SkillTypes] = js.undefined): SkillDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BulletPoints" -> BulletPoints.map { x => x.asInstanceOf[js.Any] },
        "DeveloperInfo" -> DeveloperInfo.map { x => x.asInstanceOf[js.Any] },
        "EndUserLicenseAgreement" -> EndUserLicenseAgreement.map { x => x.asInstanceOf[js.Any] },
        "GenericKeywords" -> GenericKeywords.map { x => x.asInstanceOf[js.Any] },
        "InvocationPhrase" -> InvocationPhrase.map { x => x.asInstanceOf[js.Any] },
        "NewInThisVersionBulletPoints" -> NewInThisVersionBulletPoints.map { x => x.asInstanceOf[js.Any] },
        "ProductDescription" -> ProductDescription.map { x => x.asInstanceOf[js.Any] },
        "ReleaseDate" -> ReleaseDate.map { x => x.asInstanceOf[js.Any] },
        "Reviews" -> Reviews.map { x => x.asInstanceOf[js.Any] },
        "SkillTypes" -> SkillTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SkillDetails]
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
      SkillGroupName: js.UndefOr[SkillGroupName] = js.undefined): SkillGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "SkillGroupArn" -> SkillGroupArn.map { x => x.asInstanceOf[js.Any] },
        "SkillGroupName" -> SkillGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SkillGroup]
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
      SkillGroupName: js.UndefOr[SkillGroupName] = js.undefined): SkillGroupData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "SkillGroupArn" -> SkillGroupArn.map { x => x.asInstanceOf[js.Any] },
        "SkillGroupName" -> SkillGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SkillGroupData]
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
    var SupportsLinking: js.UndefOr[boolean]
  }

  object SkillSummary {
    def apply(
      EnablementType: js.UndefOr[EnablementType] = js.undefined,
      SkillId: js.UndefOr[SkillId] = js.undefined,
      SkillName: js.UndefOr[SkillName] = js.undefined,
      SkillType: js.UndefOr[SkillType] = js.undefined,
      SupportsLinking: js.UndefOr[boolean] = js.undefined): SkillSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EnablementType" -> EnablementType.map { x => x.asInstanceOf[js.Any] },
        "SkillId" -> SkillId.map { x => x.asInstanceOf[js.Any] },
        "SkillName" -> SkillName.map { x => x.asInstanceOf[js.Any] },
        "SkillType" -> SkillType.map { x => x.asInstanceOf[js.Any] },
        "SupportsLinking" -> SupportsLinking.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SkillSummary]
    }
  }

  object SkillTypeEnum {
    val PUBLIC = "PUBLIC"
    val PRIVATE = "PRIVATE"

    val values = IndexedSeq(PUBLIC, PRIVATE)
  }

  object SkillTypeFilterEnum {
    val PUBLIC = "PUBLIC"
    val PRIVATE = "PRIVATE"
    val ALL = "ALL"

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
    var SupportsLinking: js.UndefOr[boolean]
  }

  object SkillsStoreSkill {
    def apply(
      IconUrl: js.UndefOr[IconUrl] = js.undefined,
      SampleUtterances: js.UndefOr[SampleUtterances] = js.undefined,
      ShortDescription: js.UndefOr[ShortDescription] = js.undefined,
      SkillDetails: js.UndefOr[SkillDetails] = js.undefined,
      SkillId: js.UndefOr[SkillId] = js.undefined,
      SkillName: js.UndefOr[SkillName] = js.undefined,
      SupportsLinking: js.UndefOr[boolean] = js.undefined): SkillsStoreSkill = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IconUrl" -> IconUrl.map { x => x.asInstanceOf[js.Any] },
        "SampleUtterances" -> SampleUtterances.map { x => x.asInstanceOf[js.Any] },
        "ShortDescription" -> ShortDescription.map { x => x.asInstanceOf[js.Any] },
        "SkillDetails" -> SkillDetails.map { x => x.asInstanceOf[js.Any] },
        "SkillId" -> SkillId.map { x => x.asInstanceOf[js.Any] },
        "SkillName" -> SkillName.map { x => x.asInstanceOf[js.Any] },
        "SupportsLinking" -> SupportsLinking.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SkillsStoreSkill]
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
      ManufacturerName: js.UndefOr[ApplianceManufacturerName] = js.undefined): SmartHomeAppliance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "FriendlyName" -> FriendlyName.map { x => x.asInstanceOf[js.Any] },
        "ManufacturerName" -> ManufacturerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SmartHomeAppliance]
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
      Value: SortValue): Sort = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Sort]
    }
  }

  object SortValueEnum {
    val ASC = "ASC"
    val DESC = "DESC"

    val values = IndexedSeq(ASC, DESC)
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
      RoomArn: js.UndefOr[Arn] = js.undefined): StartDeviceSyncRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Features" -> Features.asInstanceOf[js.Any],
        "DeviceArn" -> DeviceArn.map { x => x.asInstanceOf[js.Any] },
        "RoomArn" -> RoomArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartDeviceSyncRequest]
    }
  }

  @js.native
  trait StartDeviceSyncResponse extends js.Object {

  }

  object StartDeviceSyncResponse {
    def apply(): StartDeviceSyncResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartDeviceSyncResponse]
    }
  }

  @js.native
  trait StartSmartHomeApplianceDiscoveryRequest extends js.Object {
    var RoomArn: Arn
  }

  object StartSmartHomeApplianceDiscoveryRequest {
    def apply(
      RoomArn: Arn): StartSmartHomeApplianceDiscoveryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoomArn" -> RoomArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSmartHomeApplianceDiscoveryRequest]
    }
  }

  @js.native
  trait StartSmartHomeApplianceDiscoveryResponse extends js.Object {

  }

  object StartSmartHomeApplianceDiscoveryResponse {
    def apply(): StartSmartHomeApplianceDiscoveryResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSmartHomeApplianceDiscoveryResponse]
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
      Value: TagValue): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
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
      Tags: TagList): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {

  }

  object TagResourceResponse {
    def apply(): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
    }
  }

  object TemperatureUnitEnum {
    val FAHRENHEIT = "FAHRENHEIT"
    val CELSIUS = "CELSIUS"

    val values = IndexedSeq(FAHRENHEIT, CELSIUS)
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var Arn: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    def apply(
      Arn: Arn,
      TagKeys: TagKeyList): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {

  }

  object UntagResourceResponse {
    def apply(): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
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
      Name: js.UndefOr[AddressBookName] = js.undefined): UpdateAddressBookRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AddressBookArn" -> AddressBookArn.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAddressBookRequest]
    }
  }

  @js.native
  trait UpdateAddressBookResponse extends js.Object {

  }

  object UpdateAddressBookResponse {
    def apply(): UpdateAddressBookResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAddressBookResponse]
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
      ScheduleName: js.UndefOr[BusinessReportScheduleName] = js.undefined): UpdateBusinessReportScheduleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ScheduleArn" -> ScheduleArn.asInstanceOf[js.Any],
        "Format" -> Format.map { x => x.asInstanceOf[js.Any] },
        "Recurrence" -> Recurrence.map { x => x.asInstanceOf[js.Any] },
        "S3BucketName" -> S3BucketName.map { x => x.asInstanceOf[js.Any] },
        "S3KeyPrefix" -> S3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "ScheduleName" -> ScheduleName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBusinessReportScheduleRequest]
    }
  }

  @js.native
  trait UpdateBusinessReportScheduleResponse extends js.Object {

  }

  object UpdateBusinessReportScheduleResponse {
    def apply(): UpdateBusinessReportScheduleResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBusinessReportScheduleResponse]
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
      PSTNDialIn: js.UndefOr[PSTNDialIn] = js.undefined): UpdateConferenceProviderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConferenceProviderArn" -> ConferenceProviderArn.asInstanceOf[js.Any],
        "ConferenceProviderType" -> ConferenceProviderType.asInstanceOf[js.Any],
        "MeetingSetting" -> MeetingSetting.asInstanceOf[js.Any],
        "IPDialIn" -> IPDialIn.map { x => x.asInstanceOf[js.Any] },
        "PSTNDialIn" -> PSTNDialIn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConferenceProviderRequest]
    }
  }

  @js.native
  trait UpdateConferenceProviderResponse extends js.Object {

  }

  object UpdateConferenceProviderResponse {
    def apply(): UpdateConferenceProviderResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConferenceProviderResponse]
    }
  }

  @js.native
  trait UpdateContactRequest extends js.Object {
    var ContactArn: Arn
    var DisplayName: js.UndefOr[ContactName]
    var FirstName: js.UndefOr[ContactName]
    var LastName: js.UndefOr[ContactName]
    var PhoneNumber: js.UndefOr[E164PhoneNumber]
  }

  object UpdateContactRequest {
    def apply(
      ContactArn: Arn,
      DisplayName: js.UndefOr[ContactName] = js.undefined,
      FirstName: js.UndefOr[ContactName] = js.undefined,
      LastName: js.UndefOr[ContactName] = js.undefined,
      PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined): UpdateContactRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContactArn" -> ContactArn.asInstanceOf[js.Any],
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] },
        "FirstName" -> FirstName.map { x => x.asInstanceOf[js.Any] },
        "LastName" -> LastName.map { x => x.asInstanceOf[js.Any] },
        "PhoneNumber" -> PhoneNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateContactRequest]
    }
  }

  @js.native
  trait UpdateContactResponse extends js.Object {

  }

  object UpdateContactResponse {
    def apply(): UpdateContactResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateContactResponse]
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
      DeviceName: js.UndefOr[DeviceName] = js.undefined): UpdateDeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceArn" -> DeviceArn.map { x => x.asInstanceOf[js.Any] },
        "DeviceName" -> DeviceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDeviceRequest]
    }
  }

  @js.native
  trait UpdateDeviceResponse extends js.Object {

  }

  object UpdateDeviceResponse {
    def apply(): UpdateDeviceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDeviceResponse]
    }
  }

  @js.native
  trait UpdateProfileRequest extends js.Object {
    var Address: js.UndefOr[Address]
    var DistanceUnit: js.UndefOr[DistanceUnit]
    var IsDefault: js.UndefOr[Boolean]
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
      MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined,
      PSTNEnabled: js.UndefOr[Boolean] = js.undefined,
      ProfileArn: js.UndefOr[Arn] = js.undefined,
      ProfileName: js.UndefOr[ProfileName] = js.undefined,
      SetupModeDisabled: js.UndefOr[Boolean] = js.undefined,
      TemperatureUnit: js.UndefOr[TemperatureUnit] = js.undefined,
      Timezone: js.UndefOr[Timezone] = js.undefined,
      WakeWord: js.UndefOr[WakeWord] = js.undefined): UpdateProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Address" -> Address.map { x => x.asInstanceOf[js.Any] },
        "DistanceUnit" -> DistanceUnit.map { x => x.asInstanceOf[js.Any] },
        "IsDefault" -> IsDefault.map { x => x.asInstanceOf[js.Any] },
        "MaxVolumeLimit" -> MaxVolumeLimit.map { x => x.asInstanceOf[js.Any] },
        "PSTNEnabled" -> PSTNEnabled.map { x => x.asInstanceOf[js.Any] },
        "ProfileArn" -> ProfileArn.map { x => x.asInstanceOf[js.Any] },
        "ProfileName" -> ProfileName.map { x => x.asInstanceOf[js.Any] },
        "SetupModeDisabled" -> SetupModeDisabled.map { x => x.asInstanceOf[js.Any] },
        "TemperatureUnit" -> TemperatureUnit.map { x => x.asInstanceOf[js.Any] },
        "Timezone" -> Timezone.map { x => x.asInstanceOf[js.Any] },
        "WakeWord" -> WakeWord.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateProfileRequest]
    }
  }

  @js.native
  trait UpdateProfileResponse extends js.Object {

  }

  object UpdateProfileResponse {
    def apply(): UpdateProfileResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateProfileResponse]
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
      RoomName: js.UndefOr[RoomName] = js.undefined): UpdateRoomRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ProfileArn" -> ProfileArn.map { x => x.asInstanceOf[js.Any] },
        "ProviderCalendarId" -> ProviderCalendarId.map { x => x.asInstanceOf[js.Any] },
        "RoomArn" -> RoomArn.map { x => x.asInstanceOf[js.Any] },
        "RoomName" -> RoomName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRoomRequest]
    }
  }

  @js.native
  trait UpdateRoomResponse extends js.Object {

  }

  object UpdateRoomResponse {
    def apply(): UpdateRoomResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRoomResponse]
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
      SkillGroupName: js.UndefOr[SkillGroupName] = js.undefined): UpdateSkillGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "SkillGroupArn" -> SkillGroupArn.map { x => x.asInstanceOf[js.Any] },
        "SkillGroupName" -> SkillGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSkillGroupRequest]
    }
  }

  @js.native
  trait UpdateSkillGroupResponse extends js.Object {

  }

  object UpdateSkillGroupResponse {
    def apply(): UpdateSkillGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSkillGroupResponse]
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
      UserArn: js.UndefOr[Arn] = js.undefined): UserData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Email" -> Email.map { x => x.asInstanceOf[js.Any] },
        "EnrollmentId" -> EnrollmentId.map { x => x.asInstanceOf[js.Any] },
        "EnrollmentStatus" -> EnrollmentStatus.map { x => x.asInstanceOf[js.Any] },
        "FirstName" -> FirstName.map { x => x.asInstanceOf[js.Any] },
        "LastName" -> LastName.map { x => x.asInstanceOf[js.Any] },
        "UserArn" -> UserArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserData]
    }
  }

  object WakeWordEnum {
    val ALEXA = "ALEXA"
    val AMAZON = "AMAZON"
    val ECHO = "ECHO"
    val COMPUTER = "COMPUTER"

    val values = IndexedSeq(ALEXA, AMAZON, ECHO, COMPUTER)
  }
}
