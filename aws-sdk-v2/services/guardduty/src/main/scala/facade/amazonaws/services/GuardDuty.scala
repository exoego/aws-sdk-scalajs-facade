package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object guardduty {
  type AccountDetails = js.Array[AccountDetail]
  type AccountFreeTrialInfos = js.Array[AccountFreeTrialInfo]
  type AccountId = String
  type AccountIds = js.Array[AccountId]
  type AdminAccounts = js.Array[AdminAccount]
  type AffectedResources = js.Dictionary[String]
  type ClientToken = String
  type Containers = js.Array[Container]
  type CountBySeverity = js.Dictionary[Int]
  type Criterion = js.Dictionary[Condition]
  type DataSourceList = js.Array[DataSource]
  type Destinations = js.Array[Destination]
  type DetectorId = String
  type DetectorIds = js.Array[DetectorId]
  type Email = String
  type Eq = js.Array[String]
  type Equals = js.Array[String]
  type FilePaths = js.Array[ScanFilePath]
  type FilterCriterionList = js.Array[FilterCriterion]
  type FilterDescription = String
  type FilterName = String
  type FilterNames = js.Array[FilterName]
  type FilterRank = Int
  type FindingId = String
  type FindingIds = js.Array[FindingId]
  type FindingStatisticTypes = js.Array[FindingStatisticType]
  type FindingType = String
  type FindingTypes = js.Array[FindingType]
  type Findings = js.Array[Finding]
  type Groups = js.Array[String]
  type GuardDutyArn = String
  type InstanceArn = String
  type IntegerValueWithMax = Int
  type Invitations = js.Array[Invitation]
  type IpSetIds = js.Array[String]
  type Ipv6Addresses = js.Array[String]
  type Location = String
  type LongValue = Double
  type MapEquals = js.Array[ScanConditionPair]
  type MaxResults = Int
  type MemberDataSourceConfigurations = js.Array[MemberDataSourceConfiguration]
  type Members = js.Array[Member]
  type Name = String
  type Neq = js.Array[String]
  type NetworkInterfaces = js.Array[NetworkInterface]
  type NonEmptyString = String
  type NotEquals = js.Array[String]
  type PortProbeDetails = js.Array[PortProbeDetail]
  type PositiveLong = Double
  type PrivateIpAddresses = js.Array[PrivateIpAddressDetails]
  type ProductCodes = js.Array[ProductCode]
  type ResourceList = js.Array[String]
  type S3BucketDetails = js.Array[S3BucketDetail]
  type ScanCriterion = js.Dictionary[ScanCondition]
  type ScanThreatNames = js.Array[ScanThreatName]
  type Scans = js.Array[Scan]
  type SecurityGroups = js.Array[SecurityGroup]
  type SourceIps = js.Array[String]
  type Sources = js.Array[String]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Tags = js.Array[Tag]
  type ThreatIntelSetIds = js.Array[String]
  type ThreatIntelligenceDetails = js.Array[ThreatIntelligenceDetail]
  type ThreatNames = js.Array[String]
  type Timestamp = js.Date
  type UnprocessedAccounts = js.Array[UnprocessedAccount]
  type UsageAccountResultList = js.Array[UsageAccountResult]
  type UsageDataSourceResultList = js.Array[UsageDataSourceResult]
  type UsageResourceResultList = js.Array[UsageResourceResult]
  type VolumeDetails = js.Array[VolumeDetail]
  type VolumeMounts = js.Array[VolumeMount]
  type Volumes = js.Array[Volume]

  final class GuardDutyOps(private val service: GuardDuty) extends AnyVal {

    @inline def acceptAdministratorInvitationFuture(params: AcceptAdministratorInvitationRequest): Future[AcceptAdministratorInvitationResponse] = service.acceptAdministratorInvitation(params).promise().toFuture
    @inline def archiveFindingsFuture(params: ArchiveFindingsRequest): Future[ArchiveFindingsResponse] = service.archiveFindings(params).promise().toFuture
    @inline def createDetectorFuture(params: CreateDetectorRequest): Future[CreateDetectorResponse] = service.createDetector(params).promise().toFuture
    @inline def createFilterFuture(params: CreateFilterRequest): Future[CreateFilterResponse] = service.createFilter(params).promise().toFuture
    @inline def createIPSetFuture(params: CreateIPSetRequest): Future[CreateIPSetResponse] = service.createIPSet(params).promise().toFuture
    @inline def createMembersFuture(params: CreateMembersRequest): Future[CreateMembersResponse] = service.createMembers(params).promise().toFuture
    @inline def createPublishingDestinationFuture(params: CreatePublishingDestinationRequest): Future[CreatePublishingDestinationResponse] = service.createPublishingDestination(params).promise().toFuture
    @inline def createSampleFindingsFuture(params: CreateSampleFindingsRequest): Future[CreateSampleFindingsResponse] = service.createSampleFindings(params).promise().toFuture
    @inline def createThreatIntelSetFuture(params: CreateThreatIntelSetRequest): Future[CreateThreatIntelSetResponse] = service.createThreatIntelSet(params).promise().toFuture
    @inline def declineInvitationsFuture(params: DeclineInvitationsRequest): Future[DeclineInvitationsResponse] = service.declineInvitations(params).promise().toFuture
    @inline def deleteDetectorFuture(params: DeleteDetectorRequest): Future[DeleteDetectorResponse] = service.deleteDetector(params).promise().toFuture
    @inline def deleteFilterFuture(params: DeleteFilterRequest): Future[DeleteFilterResponse] = service.deleteFilter(params).promise().toFuture
    @inline def deleteIPSetFuture(params: DeleteIPSetRequest): Future[DeleteIPSetResponse] = service.deleteIPSet(params).promise().toFuture
    @inline def deleteInvitationsFuture(params: DeleteInvitationsRequest): Future[DeleteInvitationsResponse] = service.deleteInvitations(params).promise().toFuture
    @inline def deleteMembersFuture(params: DeleteMembersRequest): Future[DeleteMembersResponse] = service.deleteMembers(params).promise().toFuture
    @inline def deletePublishingDestinationFuture(params: DeletePublishingDestinationRequest): Future[DeletePublishingDestinationResponse] = service.deletePublishingDestination(params).promise().toFuture
    @inline def deleteThreatIntelSetFuture(params: DeleteThreatIntelSetRequest): Future[DeleteThreatIntelSetResponse] = service.deleteThreatIntelSet(params).promise().toFuture
    @inline def describeMalwareScansFuture(params: DescribeMalwareScansRequest): Future[DescribeMalwareScansResponse] = service.describeMalwareScans(params).promise().toFuture
    @inline def describeOrganizationConfigurationFuture(params: DescribeOrganizationConfigurationRequest): Future[DescribeOrganizationConfigurationResponse] = service.describeOrganizationConfiguration(params).promise().toFuture
    @inline def describePublishingDestinationFuture(params: DescribePublishingDestinationRequest): Future[DescribePublishingDestinationResponse] = service.describePublishingDestination(params).promise().toFuture
    @inline def disableOrganizationAdminAccountFuture(params: DisableOrganizationAdminAccountRequest): Future[DisableOrganizationAdminAccountResponse] = service.disableOrganizationAdminAccount(params).promise().toFuture
    @inline def disassociateFromAdministratorAccountFuture(params: DisassociateFromAdministratorAccountRequest): Future[DisassociateFromAdministratorAccountResponse] = service.disassociateFromAdministratorAccount(params).promise().toFuture
    @inline def disassociateMembersFuture(params: DisassociateMembersRequest): Future[DisassociateMembersResponse] = service.disassociateMembers(params).promise().toFuture
    @inline def enableOrganizationAdminAccountFuture(params: EnableOrganizationAdminAccountRequest): Future[EnableOrganizationAdminAccountResponse] = service.enableOrganizationAdminAccount(params).promise().toFuture
    @inline def getAdministratorAccountFuture(params: GetAdministratorAccountRequest): Future[GetAdministratorAccountResponse] = service.getAdministratorAccount(params).promise().toFuture
    @inline def getDetectorFuture(params: GetDetectorRequest): Future[GetDetectorResponse] = service.getDetector(params).promise().toFuture
    @inline def getFilterFuture(params: GetFilterRequest): Future[GetFilterResponse] = service.getFilter(params).promise().toFuture
    @inline def getFindingsFuture(params: GetFindingsRequest): Future[GetFindingsResponse] = service.getFindings(params).promise().toFuture
    @inline def getFindingsStatisticsFuture(params: GetFindingsStatisticsRequest): Future[GetFindingsStatisticsResponse] = service.getFindingsStatistics(params).promise().toFuture
    @inline def getIPSetFuture(params: GetIPSetRequest): Future[GetIPSetResponse] = service.getIPSet(params).promise().toFuture
    @inline def getInvitationsCountFuture(params: GetInvitationsCountRequest): Future[GetInvitationsCountResponse] = service.getInvitationsCount(params).promise().toFuture
    @inline def getMalwareScanSettingsFuture(params: GetMalwareScanSettingsRequest): Future[GetMalwareScanSettingsResponse] = service.getMalwareScanSettings(params).promise().toFuture
    @inline def getMemberDetectorsFuture(params: GetMemberDetectorsRequest): Future[GetMemberDetectorsResponse] = service.getMemberDetectors(params).promise().toFuture
    @inline def getMembersFuture(params: GetMembersRequest): Future[GetMembersResponse] = service.getMembers(params).promise().toFuture
    @inline def getRemainingFreeTrialDaysFuture(params: GetRemainingFreeTrialDaysRequest): Future[GetRemainingFreeTrialDaysResponse] = service.getRemainingFreeTrialDays(params).promise().toFuture
    @inline def getThreatIntelSetFuture(params: GetThreatIntelSetRequest): Future[GetThreatIntelSetResponse] = service.getThreatIntelSet(params).promise().toFuture
    @inline def getUsageStatisticsFuture(params: GetUsageStatisticsRequest): Future[GetUsageStatisticsResponse] = service.getUsageStatistics(params).promise().toFuture
    @inline def inviteMembersFuture(params: InviteMembersRequest): Future[InviteMembersResponse] = service.inviteMembers(params).promise().toFuture
    @inline def listDetectorsFuture(params: ListDetectorsRequest): Future[ListDetectorsResponse] = service.listDetectors(params).promise().toFuture
    @inline def listFiltersFuture(params: ListFiltersRequest): Future[ListFiltersResponse] = service.listFilters(params).promise().toFuture
    @inline def listFindingsFuture(params: ListFindingsRequest): Future[ListFindingsResponse] = service.listFindings(params).promise().toFuture
    @inline def listIPSetsFuture(params: ListIPSetsRequest): Future[ListIPSetsResponse] = service.listIPSets(params).promise().toFuture
    @inline def listInvitationsFuture(params: ListInvitationsRequest): Future[ListInvitationsResponse] = service.listInvitations(params).promise().toFuture
    @inline def listMembersFuture(params: ListMembersRequest): Future[ListMembersResponse] = service.listMembers(params).promise().toFuture
    @inline def listOrganizationAdminAccountsFuture(params: ListOrganizationAdminAccountsRequest): Future[ListOrganizationAdminAccountsResponse] = service.listOrganizationAdminAccounts(params).promise().toFuture
    @inline def listPublishingDestinationsFuture(params: ListPublishingDestinationsRequest): Future[ListPublishingDestinationsResponse] = service.listPublishingDestinations(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listThreatIntelSetsFuture(params: ListThreatIntelSetsRequest): Future[ListThreatIntelSetsResponse] = service.listThreatIntelSets(params).promise().toFuture
    @inline def startMonitoringMembersFuture(params: StartMonitoringMembersRequest): Future[StartMonitoringMembersResponse] = service.startMonitoringMembers(params).promise().toFuture
    @inline def stopMonitoringMembersFuture(params: StopMonitoringMembersRequest): Future[StopMonitoringMembersResponse] = service.stopMonitoringMembers(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def unarchiveFindingsFuture(params: UnarchiveFindingsRequest): Future[UnarchiveFindingsResponse] = service.unarchiveFindings(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateDetectorFuture(params: UpdateDetectorRequest): Future[UpdateDetectorResponse] = service.updateDetector(params).promise().toFuture
    @inline def updateFilterFuture(params: UpdateFilterRequest): Future[UpdateFilterResponse] = service.updateFilter(params).promise().toFuture
    @inline def updateFindingsFeedbackFuture(params: UpdateFindingsFeedbackRequest): Future[UpdateFindingsFeedbackResponse] = service.updateFindingsFeedback(params).promise().toFuture
    @inline def updateIPSetFuture(params: UpdateIPSetRequest): Future[UpdateIPSetResponse] = service.updateIPSet(params).promise().toFuture
    @inline def updateMalwareScanSettingsFuture(params: UpdateMalwareScanSettingsRequest): Future[UpdateMalwareScanSettingsResponse] = service.updateMalwareScanSettings(params).promise().toFuture
    @inline def updateMemberDetectorsFuture(params: UpdateMemberDetectorsRequest): Future[UpdateMemberDetectorsResponse] = service.updateMemberDetectors(params).promise().toFuture
    @inline def updateOrganizationConfigurationFuture(params: UpdateOrganizationConfigurationRequest): Future[UpdateOrganizationConfigurationResponse] = service.updateOrganizationConfiguration(params).promise().toFuture
    @inline def updatePublishingDestinationFuture(params: UpdatePublishingDestinationRequest): Future[UpdatePublishingDestinationResponse] = service.updatePublishingDestination(params).promise().toFuture
    @inline def updateThreatIntelSetFuture(params: UpdateThreatIntelSetRequest): Future[UpdateThreatIntelSetResponse] = service.updateThreatIntelSet(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/guardduty", JSImport.Namespace, "AWS.GuardDuty")
  class GuardDuty() extends js.Object {
    def this(config: AWSConfig) = this()

    @deprecated("This operation is deprecated, use AcceptAdministratorInvitation instead", "forever") def acceptInvitation(params: AcceptInvitationRequest): Request[AcceptInvitationResponse] = js.native
    @deprecated("This operation is deprecated, use DisassociateFromAdministratorAccount instead", "forever") def disassociateFromMasterAccount(params: DisassociateFromMasterAccountRequest): Request[DisassociateFromMasterAccountResponse] = js.native
    @deprecated("This operation is deprecated, use GetAdministratorAccount instead", "forever") def getMasterAccount(params: GetMasterAccountRequest): Request[GetMasterAccountResponse] = js.native
    def acceptAdministratorInvitation(params: AcceptAdministratorInvitationRequest): Request[AcceptAdministratorInvitationResponse] = js.native
    def archiveFindings(params: ArchiveFindingsRequest): Request[ArchiveFindingsResponse] = js.native
    def createDetector(params: CreateDetectorRequest): Request[CreateDetectorResponse] = js.native
    def createFilter(params: CreateFilterRequest): Request[CreateFilterResponse] = js.native
    def createIPSet(params: CreateIPSetRequest): Request[CreateIPSetResponse] = js.native
    def createMembers(params: CreateMembersRequest): Request[CreateMembersResponse] = js.native
    def createPublishingDestination(params: CreatePublishingDestinationRequest): Request[CreatePublishingDestinationResponse] = js.native
    def createSampleFindings(params: CreateSampleFindingsRequest): Request[CreateSampleFindingsResponse] = js.native
    def createThreatIntelSet(params: CreateThreatIntelSetRequest): Request[CreateThreatIntelSetResponse] = js.native
    def declineInvitations(params: DeclineInvitationsRequest): Request[DeclineInvitationsResponse] = js.native
    def deleteDetector(params: DeleteDetectorRequest): Request[DeleteDetectorResponse] = js.native
    def deleteFilter(params: DeleteFilterRequest): Request[DeleteFilterResponse] = js.native
    def deleteIPSet(params: DeleteIPSetRequest): Request[DeleteIPSetResponse] = js.native
    def deleteInvitations(params: DeleteInvitationsRequest): Request[DeleteInvitationsResponse] = js.native
    def deleteMembers(params: DeleteMembersRequest): Request[DeleteMembersResponse] = js.native
    def deletePublishingDestination(params: DeletePublishingDestinationRequest): Request[DeletePublishingDestinationResponse] = js.native
    def deleteThreatIntelSet(params: DeleteThreatIntelSetRequest): Request[DeleteThreatIntelSetResponse] = js.native
    def describeMalwareScans(params: DescribeMalwareScansRequest): Request[DescribeMalwareScansResponse] = js.native
    def describeOrganizationConfiguration(params: DescribeOrganizationConfigurationRequest): Request[DescribeOrganizationConfigurationResponse] = js.native
    def describePublishingDestination(params: DescribePublishingDestinationRequest): Request[DescribePublishingDestinationResponse] = js.native
    def disableOrganizationAdminAccount(params: DisableOrganizationAdminAccountRequest): Request[DisableOrganizationAdminAccountResponse] = js.native
    def disassociateFromAdministratorAccount(params: DisassociateFromAdministratorAccountRequest): Request[DisassociateFromAdministratorAccountResponse] = js.native
    def disassociateMembers(params: DisassociateMembersRequest): Request[DisassociateMembersResponse] = js.native
    def enableOrganizationAdminAccount(params: EnableOrganizationAdminAccountRequest): Request[EnableOrganizationAdminAccountResponse] = js.native
    def getAdministratorAccount(params: GetAdministratorAccountRequest): Request[GetAdministratorAccountResponse] = js.native
    def getDetector(params: GetDetectorRequest): Request[GetDetectorResponse] = js.native
    def getFilter(params: GetFilterRequest): Request[GetFilterResponse] = js.native
    def getFindings(params: GetFindingsRequest): Request[GetFindingsResponse] = js.native
    def getFindingsStatistics(params: GetFindingsStatisticsRequest): Request[GetFindingsStatisticsResponse] = js.native
    def getIPSet(params: GetIPSetRequest): Request[GetIPSetResponse] = js.native
    def getInvitationsCount(params: GetInvitationsCountRequest): Request[GetInvitationsCountResponse] = js.native
    def getMalwareScanSettings(params: GetMalwareScanSettingsRequest): Request[GetMalwareScanSettingsResponse] = js.native
    def getMemberDetectors(params: GetMemberDetectorsRequest): Request[GetMemberDetectorsResponse] = js.native
    def getMembers(params: GetMembersRequest): Request[GetMembersResponse] = js.native
    def getRemainingFreeTrialDays(params: GetRemainingFreeTrialDaysRequest): Request[GetRemainingFreeTrialDaysResponse] = js.native
    def getThreatIntelSet(params: GetThreatIntelSetRequest): Request[GetThreatIntelSetResponse] = js.native
    def getUsageStatistics(params: GetUsageStatisticsRequest): Request[GetUsageStatisticsResponse] = js.native
    def inviteMembers(params: InviteMembersRequest): Request[InviteMembersResponse] = js.native
    def listDetectors(params: ListDetectorsRequest): Request[ListDetectorsResponse] = js.native
    def listFilters(params: ListFiltersRequest): Request[ListFiltersResponse] = js.native
    def listFindings(params: ListFindingsRequest): Request[ListFindingsResponse] = js.native
    def listIPSets(params: ListIPSetsRequest): Request[ListIPSetsResponse] = js.native
    def listInvitations(params: ListInvitationsRequest): Request[ListInvitationsResponse] = js.native
    def listMembers(params: ListMembersRequest): Request[ListMembersResponse] = js.native
    def listOrganizationAdminAccounts(params: ListOrganizationAdminAccountsRequest): Request[ListOrganizationAdminAccountsResponse] = js.native
    def listPublishingDestinations(params: ListPublishingDestinationsRequest): Request[ListPublishingDestinationsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listThreatIntelSets(params: ListThreatIntelSetsRequest): Request[ListThreatIntelSetsResponse] = js.native
    def startMonitoringMembers(params: StartMonitoringMembersRequest): Request[StartMonitoringMembersResponse] = js.native
    def stopMonitoringMembers(params: StopMonitoringMembersRequest): Request[StopMonitoringMembersResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def unarchiveFindings(params: UnarchiveFindingsRequest): Request[UnarchiveFindingsResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateDetector(params: UpdateDetectorRequest): Request[UpdateDetectorResponse] = js.native
    def updateFilter(params: UpdateFilterRequest): Request[UpdateFilterResponse] = js.native
    def updateFindingsFeedback(params: UpdateFindingsFeedbackRequest): Request[UpdateFindingsFeedbackResponse] = js.native
    def updateIPSet(params: UpdateIPSetRequest): Request[UpdateIPSetResponse] = js.native
    def updateMalwareScanSettings(params: UpdateMalwareScanSettingsRequest): Request[UpdateMalwareScanSettingsResponse] = js.native
    def updateMemberDetectors(params: UpdateMemberDetectorsRequest): Request[UpdateMemberDetectorsResponse] = js.native
    def updateOrganizationConfiguration(params: UpdateOrganizationConfigurationRequest): Request[UpdateOrganizationConfigurationResponse] = js.native
    def updatePublishingDestination(params: UpdatePublishingDestinationRequest): Request[UpdatePublishingDestinationResponse] = js.native
    def updateThreatIntelSet(params: UpdateThreatIntelSetRequest): Request[UpdateThreatIntelSetResponse] = js.native
  }
  object GuardDuty {
    @inline implicit def toOps(service: GuardDuty): GuardDutyOps = {
      new GuardDutyOps(service)
    }
  }

  @js.native
  trait AcceptAdministratorInvitationRequest extends js.Object {
    var AdministratorId: String
    var DetectorId: DetectorId
    var InvitationId: String
  }

  object AcceptAdministratorInvitationRequest {
    @inline
    def apply(
        AdministratorId: String,
        DetectorId: DetectorId,
        InvitationId: String
    ): AcceptAdministratorInvitationRequest = {
      val __obj = js.Dynamic.literal(
        "AdministratorId" -> AdministratorId.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "InvitationId" -> InvitationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AcceptAdministratorInvitationRequest]
    }
  }

  @js.native
  trait AcceptAdministratorInvitationResponse extends js.Object

  object AcceptAdministratorInvitationResponse {
    @inline
    def apply(): AcceptAdministratorInvitationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AcceptAdministratorInvitationResponse]
    }
  }

  @deprecated("This input is deprecated, use AcceptAdministratorInvitationRequest instead", "forever")
  @js.native
  trait AcceptInvitationRequest extends js.Object {
    var DetectorId: DetectorId
    var InvitationId: String
    var MasterId: String
  }

  object AcceptInvitationRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        InvitationId: String,
        MasterId: String
    ): AcceptInvitationRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "InvitationId" -> InvitationId.asInstanceOf[js.Any],
        "MasterId" -> MasterId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AcceptInvitationRequest]
    }
  }

  @deprecated("This output is deprecated, use AcceptAdministratorInvitationResponse instead", "forever")
  @js.native
  trait AcceptInvitationResponse extends js.Object

  object AcceptInvitationResponse {
    @inline
    def apply(): AcceptInvitationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AcceptInvitationResponse]
    }
  }

  /** Contains information on the current access control policies for the bucket.
    */
  @js.native
  trait AccessControlList extends js.Object {
    var AllowsPublicReadAccess: js.UndefOr[Boolean]
    var AllowsPublicWriteAccess: js.UndefOr[Boolean]
  }

  object AccessControlList {
    @inline
    def apply(
        AllowsPublicReadAccess: js.UndefOr[Boolean] = js.undefined,
        AllowsPublicWriteAccess: js.UndefOr[Boolean] = js.undefined
    ): AccessControlList = {
      val __obj = js.Dynamic.literal()
      AllowsPublicReadAccess.foreach(__v => __obj.updateDynamic("AllowsPublicReadAccess")(__v.asInstanceOf[js.Any]))
      AllowsPublicWriteAccess.foreach(__v => __obj.updateDynamic("AllowsPublicWriteAccess")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessControlList]
    }
  }

  /** Contains information about the access keys.
    */
  @js.native
  trait AccessKeyDetails extends js.Object {
    var AccessKeyId: js.UndefOr[String]
    var PrincipalId: js.UndefOr[String]
    var UserName: js.UndefOr[String]
    var UserType: js.UndefOr[String]
  }

  object AccessKeyDetails {
    @inline
    def apply(
        AccessKeyId: js.UndefOr[String] = js.undefined,
        PrincipalId: js.UndefOr[String] = js.undefined,
        UserName: js.UndefOr[String] = js.undefined,
        UserType: js.UndefOr[String] = js.undefined
    ): AccessKeyDetails = {
      val __obj = js.Dynamic.literal()
      AccessKeyId.foreach(__v => __obj.updateDynamic("AccessKeyId")(__v.asInstanceOf[js.Any]))
      PrincipalId.foreach(__v => __obj.updateDynamic("PrincipalId")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      UserType.foreach(__v => __obj.updateDynamic("UserType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessKeyDetails]
    }
  }

  /** Contains information about the account.
    */
  @js.native
  trait AccountDetail extends js.Object {
    var AccountId: AccountId
    var Email: Email
  }

  object AccountDetail {
    @inline
    def apply(
        AccountId: AccountId,
        Email: Email
    ): AccountDetail = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Email" -> Email.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AccountDetail]
    }
  }

  /** Provides details of the GuardDuty member account that uses a free trial service.
    */
  @js.native
  trait AccountFreeTrialInfo extends js.Object {
    var AccountId: js.UndefOr[String]
    var DataSources: js.UndefOr[DataSourcesFreeTrial]
  }

  object AccountFreeTrialInfo {
    @inline
    def apply(
        AccountId: js.UndefOr[String] = js.undefined,
        DataSources: js.UndefOr[DataSourcesFreeTrial] = js.undefined
    ): AccountFreeTrialInfo = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      DataSources.foreach(__v => __obj.updateDynamic("DataSources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountFreeTrialInfo]
    }
  }

  /** Contains information about the account level permissions on the S3 bucket.
    */
  @js.native
  trait AccountLevelPermissions extends js.Object {
    var BlockPublicAccess: js.UndefOr[BlockPublicAccess]
  }

  object AccountLevelPermissions {
    @inline
    def apply(
        BlockPublicAccess: js.UndefOr[BlockPublicAccess] = js.undefined
    ): AccountLevelPermissions = {
      val __obj = js.Dynamic.literal()
      BlockPublicAccess.foreach(__v => __obj.updateDynamic("BlockPublicAccess")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountLevelPermissions]
    }
  }

  /** Contains information about actions.
    */
  @js.native
  trait Action extends js.Object {
    var ActionType: js.UndefOr[String]
    var AwsApiCallAction: js.UndefOr[AwsApiCallAction]
    var DnsRequestAction: js.UndefOr[DnsRequestAction]
    var KubernetesApiCallAction: js.UndefOr[KubernetesApiCallAction]
    var NetworkConnectionAction: js.UndefOr[NetworkConnectionAction]
    var PortProbeAction: js.UndefOr[PortProbeAction]
  }

  object Action {
    @inline
    def apply(
        ActionType: js.UndefOr[String] = js.undefined,
        AwsApiCallAction: js.UndefOr[AwsApiCallAction] = js.undefined,
        DnsRequestAction: js.UndefOr[DnsRequestAction] = js.undefined,
        KubernetesApiCallAction: js.UndefOr[KubernetesApiCallAction] = js.undefined,
        NetworkConnectionAction: js.UndefOr[NetworkConnectionAction] = js.undefined,
        PortProbeAction: js.UndefOr[PortProbeAction] = js.undefined
    ): Action = {
      val __obj = js.Dynamic.literal()
      ActionType.foreach(__v => __obj.updateDynamic("ActionType")(__v.asInstanceOf[js.Any]))
      AwsApiCallAction.foreach(__v => __obj.updateDynamic("AwsApiCallAction")(__v.asInstanceOf[js.Any]))
      DnsRequestAction.foreach(__v => __obj.updateDynamic("DnsRequestAction")(__v.asInstanceOf[js.Any]))
      KubernetesApiCallAction.foreach(__v => __obj.updateDynamic("KubernetesApiCallAction")(__v.asInstanceOf[js.Any]))
      NetworkConnectionAction.foreach(__v => __obj.updateDynamic("NetworkConnectionAction")(__v.asInstanceOf[js.Any]))
      PortProbeAction.foreach(__v => __obj.updateDynamic("PortProbeAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Action]
    }
  }

  /** The account within the organization specified as the GuardDuty delegated administrator.
    */
  @js.native
  trait AdminAccount extends js.Object {
    var AdminAccountId: js.UndefOr[String]
    var AdminStatus: js.UndefOr[AdminStatus]
  }

  object AdminAccount {
    @inline
    def apply(
        AdminAccountId: js.UndefOr[String] = js.undefined,
        AdminStatus: js.UndefOr[AdminStatus] = js.undefined
    ): AdminAccount = {
      val __obj = js.Dynamic.literal()
      AdminAccountId.foreach(__v => __obj.updateDynamic("AdminAccountId")(__v.asInstanceOf[js.Any]))
      AdminStatus.foreach(__v => __obj.updateDynamic("AdminStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminAccount]
    }
  }

  /** Contains information about the administrator account and invitation.
    */
  @js.native
  trait Administrator extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var InvitationId: js.UndefOr[String]
    var InvitedAt: js.UndefOr[String]
    var RelationshipStatus: js.UndefOr[String]
  }

  object Administrator {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        InvitationId: js.UndefOr[String] = js.undefined,
        InvitedAt: js.UndefOr[String] = js.undefined,
        RelationshipStatus: js.UndefOr[String] = js.undefined
    ): Administrator = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      InvitationId.foreach(__v => __obj.updateDynamic("InvitationId")(__v.asInstanceOf[js.Any]))
      InvitedAt.foreach(__v => __obj.updateDynamic("InvitedAt")(__v.asInstanceOf[js.Any]))
      RelationshipStatus.foreach(__v => __obj.updateDynamic("RelationshipStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Administrator]
    }
  }

  @js.native
  trait ArchiveFindingsRequest extends js.Object {
    var DetectorId: DetectorId
    var FindingIds: FindingIds
  }

  object ArchiveFindingsRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        FindingIds: FindingIds
    ): ArchiveFindingsRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FindingIds" -> FindingIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ArchiveFindingsRequest]
    }
  }

  @js.native
  trait ArchiveFindingsResponse extends js.Object

  object ArchiveFindingsResponse {
    @inline
    def apply(): ArchiveFindingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArchiveFindingsResponse]
    }
  }

  /** Contains information about the API action.
    */
  @js.native
  trait AwsApiCallAction extends js.Object {
    var AffectedResources: js.UndefOr[AffectedResources]
    var Api: js.UndefOr[String]
    var CallerType: js.UndefOr[String]
    var DomainDetails: js.UndefOr[DomainDetails]
    var ErrorCode: js.UndefOr[String]
    var RemoteAccountDetails: js.UndefOr[RemoteAccountDetails]
    var RemoteIpDetails: js.UndefOr[RemoteIpDetails]
    var ServiceName: js.UndefOr[String]
    var UserAgent: js.UndefOr[String]
  }

  object AwsApiCallAction {
    @inline
    def apply(
        AffectedResources: js.UndefOr[AffectedResources] = js.undefined,
        Api: js.UndefOr[String] = js.undefined,
        CallerType: js.UndefOr[String] = js.undefined,
        DomainDetails: js.UndefOr[DomainDetails] = js.undefined,
        ErrorCode: js.UndefOr[String] = js.undefined,
        RemoteAccountDetails: js.UndefOr[RemoteAccountDetails] = js.undefined,
        RemoteIpDetails: js.UndefOr[RemoteIpDetails] = js.undefined,
        ServiceName: js.UndefOr[String] = js.undefined,
        UserAgent: js.UndefOr[String] = js.undefined
    ): AwsApiCallAction = {
      val __obj = js.Dynamic.literal()
      AffectedResources.foreach(__v => __obj.updateDynamic("AffectedResources")(__v.asInstanceOf[js.Any]))
      Api.foreach(__v => __obj.updateDynamic("Api")(__v.asInstanceOf[js.Any]))
      CallerType.foreach(__v => __obj.updateDynamic("CallerType")(__v.asInstanceOf[js.Any]))
      DomainDetails.foreach(__v => __obj.updateDynamic("DomainDetails")(__v.asInstanceOf[js.Any]))
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      RemoteAccountDetails.foreach(__v => __obj.updateDynamic("RemoteAccountDetails")(__v.asInstanceOf[js.Any]))
      RemoteIpDetails.foreach(__v => __obj.updateDynamic("RemoteIpDetails")(__v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.updateDynamic("ServiceName")(__v.asInstanceOf[js.Any]))
      UserAgent.foreach(__v => __obj.updateDynamic("UserAgent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsApiCallAction]
    }
  }

  /** Contains information on how the bucker owner's S3 Block Public Access settings are being applied to the S3 bucket. See [[https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html|S3 Block Public Access]] for more information.
    */
  @js.native
  trait BlockPublicAccess extends js.Object {
    var BlockPublicAcls: js.UndefOr[Boolean]
    var BlockPublicPolicy: js.UndefOr[Boolean]
    var IgnorePublicAcls: js.UndefOr[Boolean]
    var RestrictPublicBuckets: js.UndefOr[Boolean]
  }

  object BlockPublicAccess {
    @inline
    def apply(
        BlockPublicAcls: js.UndefOr[Boolean] = js.undefined,
        BlockPublicPolicy: js.UndefOr[Boolean] = js.undefined,
        IgnorePublicAcls: js.UndefOr[Boolean] = js.undefined,
        RestrictPublicBuckets: js.UndefOr[Boolean] = js.undefined
    ): BlockPublicAccess = {
      val __obj = js.Dynamic.literal()
      BlockPublicAcls.foreach(__v => __obj.updateDynamic("BlockPublicAcls")(__v.asInstanceOf[js.Any]))
      BlockPublicPolicy.foreach(__v => __obj.updateDynamic("BlockPublicPolicy")(__v.asInstanceOf[js.Any]))
      IgnorePublicAcls.foreach(__v => __obj.updateDynamic("IgnorePublicAcls")(__v.asInstanceOf[js.Any]))
      RestrictPublicBuckets.foreach(__v => __obj.updateDynamic("RestrictPublicBuckets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BlockPublicAccess]
    }
  }

  /** Contains information about the bucket level permissions for the S3 bucket.
    */
  @js.native
  trait BucketLevelPermissions extends js.Object {
    var AccessControlList: js.UndefOr[AccessControlList]
    var BlockPublicAccess: js.UndefOr[BlockPublicAccess]
    var BucketPolicy: js.UndefOr[BucketPolicy]
  }

  object BucketLevelPermissions {
    @inline
    def apply(
        AccessControlList: js.UndefOr[AccessControlList] = js.undefined,
        BlockPublicAccess: js.UndefOr[BlockPublicAccess] = js.undefined,
        BucketPolicy: js.UndefOr[BucketPolicy] = js.undefined
    ): BucketLevelPermissions = {
      val __obj = js.Dynamic.literal()
      AccessControlList.foreach(__v => __obj.updateDynamic("AccessControlList")(__v.asInstanceOf[js.Any]))
      BlockPublicAccess.foreach(__v => __obj.updateDynamic("BlockPublicAccess")(__v.asInstanceOf[js.Any]))
      BucketPolicy.foreach(__v => __obj.updateDynamic("BucketPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketLevelPermissions]
    }
  }

  /** Contains information on the current bucket policies for the S3 bucket.
    */
  @js.native
  trait BucketPolicy extends js.Object {
    var AllowsPublicReadAccess: js.UndefOr[Boolean]
    var AllowsPublicWriteAccess: js.UndefOr[Boolean]
  }

  object BucketPolicy {
    @inline
    def apply(
        AllowsPublicReadAccess: js.UndefOr[Boolean] = js.undefined,
        AllowsPublicWriteAccess: js.UndefOr[Boolean] = js.undefined
    ): BucketPolicy = {
      val __obj = js.Dynamic.literal()
      AllowsPublicReadAccess.foreach(__v => __obj.updateDynamic("AllowsPublicReadAccess")(__v.asInstanceOf[js.Any]))
      AllowsPublicWriteAccess.foreach(__v => __obj.updateDynamic("AllowsPublicWriteAccess")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketPolicy]
    }
  }

  /** Contains information about the city associated with the IP address.
    */
  @js.native
  trait City extends js.Object {
    var CityName: js.UndefOr[String]
  }

  object City {
    @inline
    def apply(
        CityName: js.UndefOr[String] = js.undefined
    ): City = {
      val __obj = js.Dynamic.literal()
      CityName.foreach(__v => __obj.updateDynamic("CityName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[City]
    }
  }

  /** Contains information on the status of CloudTrail as a data source for the detector.
    */
  @js.native
  trait CloudTrailConfigurationResult extends js.Object {
    var Status: DataSourceStatus
  }

  object CloudTrailConfigurationResult {
    @inline
    def apply(
        Status: DataSourceStatus
    ): CloudTrailConfigurationResult = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CloudTrailConfigurationResult]
    }
  }

  /** Contains information about the condition.
    */
  @js.native
  trait Condition extends js.Object {
    var Eq: js.UndefOr[Eq]
    var Equals: js.UndefOr[Equals]
    var GreaterThan: js.UndefOr[Double]
    var GreaterThanOrEqual: js.UndefOr[Double]
    var Gt: js.UndefOr[Int]
    var Gte: js.UndefOr[Int]
    var LessThan: js.UndefOr[Double]
    var LessThanOrEqual: js.UndefOr[Double]
    var Lt: js.UndefOr[Int]
    var Lte: js.UndefOr[Int]
    var Neq: js.UndefOr[Neq]
    var NotEquals: js.UndefOr[NotEquals]
  }

  object Condition {
    @inline
    def apply(
        Eq: js.UndefOr[Eq] = js.undefined,
        Equals: js.UndefOr[Equals] = js.undefined,
        GreaterThan: js.UndefOr[Double] = js.undefined,
        GreaterThanOrEqual: js.UndefOr[Double] = js.undefined,
        Gt: js.UndefOr[Int] = js.undefined,
        Gte: js.UndefOr[Int] = js.undefined,
        LessThan: js.UndefOr[Double] = js.undefined,
        LessThanOrEqual: js.UndefOr[Double] = js.undefined,
        Lt: js.UndefOr[Int] = js.undefined,
        Lte: js.UndefOr[Int] = js.undefined,
        Neq: js.UndefOr[Neq] = js.undefined,
        NotEquals: js.UndefOr[NotEquals] = js.undefined
    ): Condition = {
      val __obj = js.Dynamic.literal()
      Eq.foreach(__v => __obj.updateDynamic("Eq")(__v.asInstanceOf[js.Any]))
      Equals.foreach(__v => __obj.updateDynamic("Equals")(__v.asInstanceOf[js.Any]))
      GreaterThan.foreach(__v => __obj.updateDynamic("GreaterThan")(__v.asInstanceOf[js.Any]))
      GreaterThanOrEqual.foreach(__v => __obj.updateDynamic("GreaterThanOrEqual")(__v.asInstanceOf[js.Any]))
      Gt.foreach(__v => __obj.updateDynamic("Gt")(__v.asInstanceOf[js.Any]))
      Gte.foreach(__v => __obj.updateDynamic("Gte")(__v.asInstanceOf[js.Any]))
      LessThan.foreach(__v => __obj.updateDynamic("LessThan")(__v.asInstanceOf[js.Any]))
      LessThanOrEqual.foreach(__v => __obj.updateDynamic("LessThanOrEqual")(__v.asInstanceOf[js.Any]))
      Lt.foreach(__v => __obj.updateDynamic("Lt")(__v.asInstanceOf[js.Any]))
      Lte.foreach(__v => __obj.updateDynamic("Lte")(__v.asInstanceOf[js.Any]))
      Neq.foreach(__v => __obj.updateDynamic("Neq")(__v.asInstanceOf[js.Any]))
      NotEquals.foreach(__v => __obj.updateDynamic("NotEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Condition]
    }
  }

  /** Details of a container.
    */
  @js.native
  trait Container extends js.Object {
    var ContainerRuntime: js.UndefOr[String]
    var Id: js.UndefOr[String]
    var Image: js.UndefOr[String]
    var ImagePrefix: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var SecurityContext: js.UndefOr[SecurityContext]
    var VolumeMounts: js.UndefOr[VolumeMounts]
  }

  object Container {
    @inline
    def apply(
        ContainerRuntime: js.UndefOr[String] = js.undefined,
        Id: js.UndefOr[String] = js.undefined,
        Image: js.UndefOr[String] = js.undefined,
        ImagePrefix: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        SecurityContext: js.UndefOr[SecurityContext] = js.undefined,
        VolumeMounts: js.UndefOr[VolumeMounts] = js.undefined
    ): Container = {
      val __obj = js.Dynamic.literal()
      ContainerRuntime.foreach(__v => __obj.updateDynamic("ContainerRuntime")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Image.foreach(__v => __obj.updateDynamic("Image")(__v.asInstanceOf[js.Any]))
      ImagePrefix.foreach(__v => __obj.updateDynamic("ImagePrefix")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SecurityContext.foreach(__v => __obj.updateDynamic("SecurityContext")(__v.asInstanceOf[js.Any]))
      VolumeMounts.foreach(__v => __obj.updateDynamic("VolumeMounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Container]
    }
  }

  /** Contains information about the country where the remote IP address is located.
    */
  @js.native
  trait Country extends js.Object {
    var CountryCode: js.UndefOr[String]
    var CountryName: js.UndefOr[String]
  }

  object Country {
    @inline
    def apply(
        CountryCode: js.UndefOr[String] = js.undefined,
        CountryName: js.UndefOr[String] = js.undefined
    ): Country = {
      val __obj = js.Dynamic.literal()
      CountryCode.foreach(__v => __obj.updateDynamic("CountryCode")(__v.asInstanceOf[js.Any]))
      CountryName.foreach(__v => __obj.updateDynamic("CountryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Country]
    }
  }

  @js.native
  trait CreateDetectorRequest extends js.Object {
    var Enable: Boolean
    var ClientToken: js.UndefOr[ClientToken]
    var DataSources: js.UndefOr[DataSourceConfigurations]
    var FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateDetectorRequest {
    @inline
    def apply(
        Enable: Boolean,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        DataSources: js.UndefOr[DataSourceConfigurations] = js.undefined,
        FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateDetectorRequest = {
      val __obj = js.Dynamic.literal(
        "Enable" -> Enable.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      DataSources.foreach(__v => __obj.updateDynamic("DataSources")(__v.asInstanceOf[js.Any]))
      FindingPublishingFrequency.foreach(__v => __obj.updateDynamic("FindingPublishingFrequency")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDetectorRequest]
    }
  }

  @js.native
  trait CreateDetectorResponse extends js.Object {
    var DetectorId: js.UndefOr[DetectorId]
    var UnprocessedDataSources: js.UndefOr[UnprocessedDataSourcesResult]
  }

  object CreateDetectorResponse {
    @inline
    def apply(
        DetectorId: js.UndefOr[DetectorId] = js.undefined,
        UnprocessedDataSources: js.UndefOr[UnprocessedDataSourcesResult] = js.undefined
    ): CreateDetectorResponse = {
      val __obj = js.Dynamic.literal()
      DetectorId.foreach(__v => __obj.updateDynamic("DetectorId")(__v.asInstanceOf[js.Any]))
      UnprocessedDataSources.foreach(__v => __obj.updateDynamic("UnprocessedDataSources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDetectorResponse]
    }
  }

  @js.native
  trait CreateFilterRequest extends js.Object {
    var DetectorId: DetectorId
    var FindingCriteria: FindingCriteria
    var Name: FilterName
    var Action: js.UndefOr[FilterAction]
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[FilterDescription]
    var Rank: js.UndefOr[FilterRank]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateFilterRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        FindingCriteria: FindingCriteria,
        Name: FilterName,
        Action: js.UndefOr[FilterAction] = js.undefined,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[FilterDescription] = js.undefined,
        Rank: js.UndefOr[FilterRank] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateFilterRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FindingCriteria" -> FindingCriteria.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Rank.foreach(__v => __obj.updateDynamic("Rank")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFilterRequest]
    }
  }

  @js.native
  trait CreateFilterResponse extends js.Object {
    var Name: FilterName
  }

  object CreateFilterResponse {
    @inline
    def apply(
        Name: FilterName
    ): CreateFilterResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateFilterResponse]
    }
  }

  @js.native
  trait CreateIPSetRequest extends js.Object {
    var Activate: Boolean
    var DetectorId: DetectorId
    var Format: IpSetFormat
    var Location: Location
    var Name: Name
    var ClientToken: js.UndefOr[ClientToken]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateIPSetRequest {
    @inline
    def apply(
        Activate: Boolean,
        DetectorId: DetectorId,
        Format: IpSetFormat,
        Location: Location,
        Name: Name,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateIPSetRequest = {
      val __obj = js.Dynamic.literal(
        "Activate" -> Activate.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "Format" -> Format.asInstanceOf[js.Any],
        "Location" -> Location.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIPSetRequest]
    }
  }

  @js.native
  trait CreateIPSetResponse extends js.Object {
    var IpSetId: String
  }

  object CreateIPSetResponse {
    @inline
    def apply(
        IpSetId: String
    ): CreateIPSetResponse = {
      val __obj = js.Dynamic.literal(
        "IpSetId" -> IpSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateIPSetResponse]
    }
  }

  @js.native
  trait CreateMembersRequest extends js.Object {
    var AccountDetails: AccountDetails
    var DetectorId: DetectorId
  }

  object CreateMembersRequest {
    @inline
    def apply(
        AccountDetails: AccountDetails,
        DetectorId: DetectorId
    ): CreateMembersRequest = {
      val __obj = js.Dynamic.literal(
        "AccountDetails" -> AccountDetails.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateMembersRequest]
    }
  }

  @js.native
  trait CreateMembersResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  object CreateMembersResponse {
    @inline
    def apply(
        UnprocessedAccounts: UnprocessedAccounts
    ): CreateMembersResponse = {
      val __obj = js.Dynamic.literal(
        "UnprocessedAccounts" -> UnprocessedAccounts.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateMembersResponse]
    }
  }

  @js.native
  trait CreatePublishingDestinationRequest extends js.Object {
    var DestinationProperties: DestinationProperties
    var DestinationType: DestinationType
    var DetectorId: DetectorId
    var ClientToken: js.UndefOr[ClientToken]
  }

  object CreatePublishingDestinationRequest {
    @inline
    def apply(
        DestinationProperties: DestinationProperties,
        DestinationType: DestinationType,
        DetectorId: DetectorId,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): CreatePublishingDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "DestinationProperties" -> DestinationProperties.asInstanceOf[js.Any],
        "DestinationType" -> DestinationType.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePublishingDestinationRequest]
    }
  }

  @js.native
  trait CreatePublishingDestinationResponse extends js.Object {
    var DestinationId: String
  }

  object CreatePublishingDestinationResponse {
    @inline
    def apply(
        DestinationId: String
    ): CreatePublishingDestinationResponse = {
      val __obj = js.Dynamic.literal(
        "DestinationId" -> DestinationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreatePublishingDestinationResponse]
    }
  }

  @js.native
  trait CreateSampleFindingsRequest extends js.Object {
    var DetectorId: DetectorId
    var FindingTypes: js.UndefOr[FindingTypes]
  }

  object CreateSampleFindingsRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        FindingTypes: js.UndefOr[FindingTypes] = js.undefined
    ): CreateSampleFindingsRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      FindingTypes.foreach(__v => __obj.updateDynamic("FindingTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSampleFindingsRequest]
    }
  }

  @js.native
  trait CreateSampleFindingsResponse extends js.Object

  object CreateSampleFindingsResponse {
    @inline
    def apply(): CreateSampleFindingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateSampleFindingsResponse]
    }
  }

  @js.native
  trait CreateThreatIntelSetRequest extends js.Object {
    var Activate: Boolean
    var DetectorId: DetectorId
    var Format: ThreatIntelSetFormat
    var Location: Location
    var Name: Name
    var ClientToken: js.UndefOr[ClientToken]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateThreatIntelSetRequest {
    @inline
    def apply(
        Activate: Boolean,
        DetectorId: DetectorId,
        Format: ThreatIntelSetFormat,
        Location: Location,
        Name: Name,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateThreatIntelSetRequest = {
      val __obj = js.Dynamic.literal(
        "Activate" -> Activate.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "Format" -> Format.asInstanceOf[js.Any],
        "Location" -> Location.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateThreatIntelSetRequest]
    }
  }

  @js.native
  trait CreateThreatIntelSetResponse extends js.Object {
    var ThreatIntelSetId: String
  }

  object CreateThreatIntelSetResponse {
    @inline
    def apply(
        ThreatIntelSetId: String
    ): CreateThreatIntelSetResponse = {
      val __obj = js.Dynamic.literal(
        "ThreatIntelSetId" -> ThreatIntelSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateThreatIntelSetResponse]
    }
  }

  /** Contains information on the status of DNS logs as a data source.
    */
  @js.native
  trait DNSLogsConfigurationResult extends js.Object {
    var Status: DataSourceStatus
  }

  object DNSLogsConfigurationResult {
    @inline
    def apply(
        Status: DataSourceStatus
    ): DNSLogsConfigurationResult = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DNSLogsConfigurationResult]
    }
  }

  /** Contains information about which data sources are enabled.
    */
  @js.native
  trait DataSourceConfigurations extends js.Object {
    var Kubernetes: js.UndefOr[KubernetesConfiguration]
    var MalwareProtection: js.UndefOr[MalwareProtectionConfiguration]
    var S3Logs: js.UndefOr[S3LogsConfiguration]
  }

  object DataSourceConfigurations {
    @inline
    def apply(
        Kubernetes: js.UndefOr[KubernetesConfiguration] = js.undefined,
        MalwareProtection: js.UndefOr[MalwareProtectionConfiguration] = js.undefined,
        S3Logs: js.UndefOr[S3LogsConfiguration] = js.undefined
    ): DataSourceConfigurations = {
      val __obj = js.Dynamic.literal()
      Kubernetes.foreach(__v => __obj.updateDynamic("Kubernetes")(__v.asInstanceOf[js.Any]))
      MalwareProtection.foreach(__v => __obj.updateDynamic("MalwareProtection")(__v.asInstanceOf[js.Any]))
      S3Logs.foreach(__v => __obj.updateDynamic("S3Logs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSourceConfigurations]
    }
  }

  /** Contains information on the status of data sources for the detector.
    */
  @js.native
  trait DataSourceConfigurationsResult extends js.Object {
    var CloudTrail: CloudTrailConfigurationResult
    var DNSLogs: DNSLogsConfigurationResult
    var FlowLogs: FlowLogsConfigurationResult
    var S3Logs: S3LogsConfigurationResult
    var Kubernetes: js.UndefOr[KubernetesConfigurationResult]
    var MalwareProtection: js.UndefOr[MalwareProtectionConfigurationResult]
  }

  object DataSourceConfigurationsResult {
    @inline
    def apply(
        CloudTrail: CloudTrailConfigurationResult,
        DNSLogs: DNSLogsConfigurationResult,
        FlowLogs: FlowLogsConfigurationResult,
        S3Logs: S3LogsConfigurationResult,
        Kubernetes: js.UndefOr[KubernetesConfigurationResult] = js.undefined,
        MalwareProtection: js.UndefOr[MalwareProtectionConfigurationResult] = js.undefined
    ): DataSourceConfigurationsResult = {
      val __obj = js.Dynamic.literal(
        "CloudTrail" -> CloudTrail.asInstanceOf[js.Any],
        "DNSLogs" -> DNSLogs.asInstanceOf[js.Any],
        "FlowLogs" -> FlowLogs.asInstanceOf[js.Any],
        "S3Logs" -> S3Logs.asInstanceOf[js.Any]
      )

      Kubernetes.foreach(__v => __obj.updateDynamic("Kubernetes")(__v.asInstanceOf[js.Any]))
      MalwareProtection.foreach(__v => __obj.updateDynamic("MalwareProtection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSourceConfigurationsResult]
    }
  }

  /** Contains information about which data sources are enabled for the GuardDuty member account.
    */
  @js.native
  trait DataSourceFreeTrial extends js.Object {
    var FreeTrialDaysRemaining: js.UndefOr[Int]
  }

  object DataSourceFreeTrial {
    @inline
    def apply(
        FreeTrialDaysRemaining: js.UndefOr[Int] = js.undefined
    ): DataSourceFreeTrial = {
      val __obj = js.Dynamic.literal()
      FreeTrialDaysRemaining.foreach(__v => __obj.updateDynamic("FreeTrialDaysRemaining")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSourceFreeTrial]
    }
  }

  /** Contains information about which data sources are enabled for the GuardDuty member account.
    */
  @js.native
  trait DataSourcesFreeTrial extends js.Object {
    var CloudTrail: js.UndefOr[DataSourceFreeTrial]
    var DnsLogs: js.UndefOr[DataSourceFreeTrial]
    var FlowLogs: js.UndefOr[DataSourceFreeTrial]
    var Kubernetes: js.UndefOr[KubernetesDataSourceFreeTrial]
    var MalwareProtection: js.UndefOr[MalwareProtectionDataSourceFreeTrial]
    var S3Logs: js.UndefOr[DataSourceFreeTrial]
  }

  object DataSourcesFreeTrial {
    @inline
    def apply(
        CloudTrail: js.UndefOr[DataSourceFreeTrial] = js.undefined,
        DnsLogs: js.UndefOr[DataSourceFreeTrial] = js.undefined,
        FlowLogs: js.UndefOr[DataSourceFreeTrial] = js.undefined,
        Kubernetes: js.UndefOr[KubernetesDataSourceFreeTrial] = js.undefined,
        MalwareProtection: js.UndefOr[MalwareProtectionDataSourceFreeTrial] = js.undefined,
        S3Logs: js.UndefOr[DataSourceFreeTrial] = js.undefined
    ): DataSourcesFreeTrial = {
      val __obj = js.Dynamic.literal()
      CloudTrail.foreach(__v => __obj.updateDynamic("CloudTrail")(__v.asInstanceOf[js.Any]))
      DnsLogs.foreach(__v => __obj.updateDynamic("DnsLogs")(__v.asInstanceOf[js.Any]))
      FlowLogs.foreach(__v => __obj.updateDynamic("FlowLogs")(__v.asInstanceOf[js.Any]))
      Kubernetes.foreach(__v => __obj.updateDynamic("Kubernetes")(__v.asInstanceOf[js.Any]))
      MalwareProtection.foreach(__v => __obj.updateDynamic("MalwareProtection")(__v.asInstanceOf[js.Any]))
      S3Logs.foreach(__v => __obj.updateDynamic("S3Logs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSourcesFreeTrial]
    }
  }

  @js.native
  trait DeclineInvitationsRequest extends js.Object {
    var AccountIds: AccountIds
  }

  object DeclineInvitationsRequest {
    @inline
    def apply(
        AccountIds: AccountIds
    ): DeclineInvitationsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeclineInvitationsRequest]
    }
  }

  @js.native
  trait DeclineInvitationsResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  object DeclineInvitationsResponse {
    @inline
    def apply(
        UnprocessedAccounts: UnprocessedAccounts
    ): DeclineInvitationsResponse = {
      val __obj = js.Dynamic.literal(
        "UnprocessedAccounts" -> UnprocessedAccounts.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeclineInvitationsResponse]
    }
  }

  /** Contains information on the server side encryption method used in the S3 bucket. See [[https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html|S3 Server-Side Encryption]] for more information.
    */
  @js.native
  trait DefaultServerSideEncryption extends js.Object {
    var EncryptionType: js.UndefOr[String]
    var KmsMasterKeyArn: js.UndefOr[String]
  }

  object DefaultServerSideEncryption {
    @inline
    def apply(
        EncryptionType: js.UndefOr[String] = js.undefined,
        KmsMasterKeyArn: js.UndefOr[String] = js.undefined
    ): DefaultServerSideEncryption = {
      val __obj = js.Dynamic.literal()
      EncryptionType.foreach(__v => __obj.updateDynamic("EncryptionType")(__v.asInstanceOf[js.Any]))
      KmsMasterKeyArn.foreach(__v => __obj.updateDynamic("KmsMasterKeyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultServerSideEncryption]
    }
  }

  @js.native
  trait DeleteDetectorRequest extends js.Object {
    var DetectorId: DetectorId
  }

  object DeleteDetectorRequest {
    @inline
    def apply(
        DetectorId: DetectorId
    ): DeleteDetectorRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDetectorRequest]
    }
  }

  @js.native
  trait DeleteDetectorResponse extends js.Object

  object DeleteDetectorResponse {
    @inline
    def apply(): DeleteDetectorResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDetectorResponse]
    }
  }

  @js.native
  trait DeleteFilterRequest extends js.Object {
    var DetectorId: DetectorId
    var FilterName: String
  }

  object DeleteFilterRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        FilterName: String
    ): DeleteFilterRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FilterName" -> FilterName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFilterRequest]
    }
  }

  @js.native
  trait DeleteFilterResponse extends js.Object

  object DeleteFilterResponse {
    @inline
    def apply(): DeleteFilterResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteFilterResponse]
    }
  }

  @js.native
  trait DeleteIPSetRequest extends js.Object {
    var DetectorId: DetectorId
    var IpSetId: String
  }

  object DeleteIPSetRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        IpSetId: String
    ): DeleteIPSetRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "IpSetId" -> IpSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteIPSetRequest]
    }
  }

  @js.native
  trait DeleteIPSetResponse extends js.Object

  object DeleteIPSetResponse {
    @inline
    def apply(): DeleteIPSetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteIPSetResponse]
    }
  }

  @js.native
  trait DeleteInvitationsRequest extends js.Object {
    var AccountIds: AccountIds
  }

  object DeleteInvitationsRequest {
    @inline
    def apply(
        AccountIds: AccountIds
    ): DeleteInvitationsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteInvitationsRequest]
    }
  }

  @js.native
  trait DeleteInvitationsResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  object DeleteInvitationsResponse {
    @inline
    def apply(
        UnprocessedAccounts: UnprocessedAccounts
    ): DeleteInvitationsResponse = {
      val __obj = js.Dynamic.literal(
        "UnprocessedAccounts" -> UnprocessedAccounts.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteInvitationsResponse]
    }
  }

  @js.native
  trait DeleteMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: DetectorId
  }

  object DeleteMembersRequest {
    @inline
    def apply(
        AccountIds: AccountIds,
        DetectorId: DetectorId
    ): DeleteMembersRequest = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMembersRequest]
    }
  }

  @js.native
  trait DeleteMembersResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  object DeleteMembersResponse {
    @inline
    def apply(
        UnprocessedAccounts: UnprocessedAccounts
    ): DeleteMembersResponse = {
      val __obj = js.Dynamic.literal(
        "UnprocessedAccounts" -> UnprocessedAccounts.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMembersResponse]
    }
  }

  @js.native
  trait DeletePublishingDestinationRequest extends js.Object {
    var DestinationId: String
    var DetectorId: DetectorId
  }

  object DeletePublishingDestinationRequest {
    @inline
    def apply(
        DestinationId: String,
        DetectorId: DetectorId
    ): DeletePublishingDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "DestinationId" -> DestinationId.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePublishingDestinationRequest]
    }
  }

  @js.native
  trait DeletePublishingDestinationResponse extends js.Object

  object DeletePublishingDestinationResponse {
    @inline
    def apply(): DeletePublishingDestinationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeletePublishingDestinationResponse]
    }
  }

  @js.native
  trait DeleteThreatIntelSetRequest extends js.Object {
    var DetectorId: DetectorId
    var ThreatIntelSetId: String
  }

  object DeleteThreatIntelSetRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        ThreatIntelSetId: String
    ): DeleteThreatIntelSetRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "ThreatIntelSetId" -> ThreatIntelSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteThreatIntelSetRequest]
    }
  }

  @js.native
  trait DeleteThreatIntelSetResponse extends js.Object

  object DeleteThreatIntelSetResponse {
    @inline
    def apply(): DeleteThreatIntelSetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteThreatIntelSetResponse]
    }
  }

  @js.native
  trait DescribeMalwareScansRequest extends js.Object {
    var DetectorId: DetectorId
    var FilterCriteria: js.UndefOr[FilterCriteria]
    var MaxResults: js.UndefOr[IntegerValueWithMax]
    var NextToken: js.UndefOr[String]
    var SortCriteria: js.UndefOr[SortCriteria]
  }

  object DescribeMalwareScansRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        FilterCriteria: js.UndefOr[FilterCriteria] = js.undefined,
        MaxResults: js.UndefOr[IntegerValueWithMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        SortCriteria: js.UndefOr[SortCriteria] = js.undefined
    ): DescribeMalwareScansRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      FilterCriteria.foreach(__v => __obj.updateDynamic("FilterCriteria")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.updateDynamic("SortCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMalwareScansRequest]
    }
  }

  @js.native
  trait DescribeMalwareScansResponse extends js.Object {
    var Scans: Scans
    var NextToken: js.UndefOr[String]
  }

  object DescribeMalwareScansResponse {
    @inline
    def apply(
        Scans: Scans,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeMalwareScansResponse = {
      val __obj = js.Dynamic.literal(
        "Scans" -> Scans.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMalwareScansResponse]
    }
  }

  @js.native
  trait DescribeOrganizationConfigurationRequest extends js.Object {
    var DetectorId: DetectorId
  }

  object DescribeOrganizationConfigurationRequest {
    @inline
    def apply(
        DetectorId: DetectorId
    ): DescribeOrganizationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeOrganizationConfigurationRequest]
    }
  }

  @js.native
  trait DescribeOrganizationConfigurationResponse extends js.Object {
    var AutoEnable: Boolean
    var MemberAccountLimitReached: Boolean
    var DataSources: js.UndefOr[OrganizationDataSourceConfigurationsResult]
  }

  object DescribeOrganizationConfigurationResponse {
    @inline
    def apply(
        AutoEnable: Boolean,
        MemberAccountLimitReached: Boolean,
        DataSources: js.UndefOr[OrganizationDataSourceConfigurationsResult] = js.undefined
    ): DescribeOrganizationConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "AutoEnable" -> AutoEnable.asInstanceOf[js.Any],
        "MemberAccountLimitReached" -> MemberAccountLimitReached.asInstanceOf[js.Any]
      )

      DataSources.foreach(__v => __obj.updateDynamic("DataSources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOrganizationConfigurationResponse]
    }
  }

  @js.native
  trait DescribePublishingDestinationRequest extends js.Object {
    var DestinationId: String
    var DetectorId: DetectorId
  }

  object DescribePublishingDestinationRequest {
    @inline
    def apply(
        DestinationId: String,
        DetectorId: DetectorId
    ): DescribePublishingDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "DestinationId" -> DestinationId.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePublishingDestinationRequest]
    }
  }

  @js.native
  trait DescribePublishingDestinationResponse extends js.Object {
    var DestinationId: String
    var DestinationProperties: DestinationProperties
    var DestinationType: DestinationType
    var PublishingFailureStartTimestamp: Double
    var Status: PublishingStatus
  }

  object DescribePublishingDestinationResponse {
    @inline
    def apply(
        DestinationId: String,
        DestinationProperties: DestinationProperties,
        DestinationType: DestinationType,
        PublishingFailureStartTimestamp: Double,
        Status: PublishingStatus
    ): DescribePublishingDestinationResponse = {
      val __obj = js.Dynamic.literal(
        "DestinationId" -> DestinationId.asInstanceOf[js.Any],
        "DestinationProperties" -> DestinationProperties.asInstanceOf[js.Any],
        "DestinationType" -> DestinationType.asInstanceOf[js.Any],
        "PublishingFailureStartTimestamp" -> PublishingFailureStartTimestamp.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePublishingDestinationResponse]
    }
  }

  /** Contains information about the publishing destination, including the ID, type, and status.
    */
  @js.native
  trait Destination extends js.Object {
    var DestinationId: String
    var DestinationType: DestinationType
    var Status: PublishingStatus
  }

  object Destination {
    @inline
    def apply(
        DestinationId: String,
        DestinationType: DestinationType,
        Status: PublishingStatus
    ): Destination = {
      val __obj = js.Dynamic.literal(
        "DestinationId" -> DestinationId.asInstanceOf[js.Any],
        "DestinationType" -> DestinationType.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Destination]
    }
  }

  /** Contains the Amazon Resource Name (ARN) of the resource to publish to, such as an S3 bucket, and the ARN of the KMS key to use to encrypt published findings.
    */
  @js.native
  trait DestinationProperties extends js.Object {
    var DestinationArn: js.UndefOr[String]
    var KmsKeyArn: js.UndefOr[String]
  }

  object DestinationProperties {
    @inline
    def apply(
        DestinationArn: js.UndefOr[String] = js.undefined,
        KmsKeyArn: js.UndefOr[String] = js.undefined
    ): DestinationProperties = {
      val __obj = js.Dynamic.literal()
      DestinationArn.foreach(__v => __obj.updateDynamic("DestinationArn")(__v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DestinationProperties]
    }
  }

  @js.native
  trait DisableOrganizationAdminAccountRequest extends js.Object {
    var AdminAccountId: String
  }

  object DisableOrganizationAdminAccountRequest {
    @inline
    def apply(
        AdminAccountId: String
    ): DisableOrganizationAdminAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AdminAccountId" -> AdminAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisableOrganizationAdminAccountRequest]
    }
  }

  @js.native
  trait DisableOrganizationAdminAccountResponse extends js.Object

  object DisableOrganizationAdminAccountResponse {
    @inline
    def apply(): DisableOrganizationAdminAccountResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableOrganizationAdminAccountResponse]
    }
  }

  @js.native
  trait DisassociateFromAdministratorAccountRequest extends js.Object {
    var DetectorId: DetectorId
  }

  object DisassociateFromAdministratorAccountRequest {
    @inline
    def apply(
        DetectorId: DetectorId
    ): DisassociateFromAdministratorAccountRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateFromAdministratorAccountRequest]
    }
  }

  @js.native
  trait DisassociateFromAdministratorAccountResponse extends js.Object

  object DisassociateFromAdministratorAccountResponse {
    @inline
    def apply(): DisassociateFromAdministratorAccountResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateFromAdministratorAccountResponse]
    }
  }

  @deprecated("This input is deprecated, use DisassociateFromAdministratorAccountRequest instead", "forever")
  @js.native
  trait DisassociateFromMasterAccountRequest extends js.Object {
    var DetectorId: DetectorId
  }

  object DisassociateFromMasterAccountRequest {
    @inline
    def apply(
        DetectorId: DetectorId
    ): DisassociateFromMasterAccountRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateFromMasterAccountRequest]
    }
  }

  @deprecated("This output is deprecated, use DisassociateFromAdministratorAccountResponse instead", "forever")
  @js.native
  trait DisassociateFromMasterAccountResponse extends js.Object

  object DisassociateFromMasterAccountResponse {
    @inline
    def apply(): DisassociateFromMasterAccountResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateFromMasterAccountResponse]
    }
  }

  @js.native
  trait DisassociateMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: DetectorId
  }

  object DisassociateMembersRequest {
    @inline
    def apply(
        AccountIds: AccountIds,
        DetectorId: DetectorId
    ): DisassociateMembersRequest = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateMembersRequest]
    }
  }

  @js.native
  trait DisassociateMembersResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  object DisassociateMembersResponse {
    @inline
    def apply(
        UnprocessedAccounts: UnprocessedAccounts
    ): DisassociateMembersResponse = {
      val __obj = js.Dynamic.literal(
        "UnprocessedAccounts" -> UnprocessedAccounts.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateMembersResponse]
    }
  }

  /** Contains information about the DNS_REQUEST action described in this finding.
    */
  @js.native
  trait DnsRequestAction extends js.Object {
    var Blocked: js.UndefOr[Boolean]
    var Domain: js.UndefOr[String]
    var Protocol: js.UndefOr[String]
  }

  object DnsRequestAction {
    @inline
    def apply(
        Blocked: js.UndefOr[Boolean] = js.undefined,
        Domain: js.UndefOr[String] = js.undefined,
        Protocol: js.UndefOr[String] = js.undefined
    ): DnsRequestAction = {
      val __obj = js.Dynamic.literal()
      Blocked.foreach(__v => __obj.updateDynamic("Blocked")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DnsRequestAction]
    }
  }

  /** Contains information about the domain.
    */
  @js.native
  trait DomainDetails extends js.Object {
    var Domain: js.UndefOr[String]
  }

  object DomainDetails {
    @inline
    def apply(
        Domain: js.UndefOr[String] = js.undefined
    ): DomainDetails = {
      val __obj = js.Dynamic.literal()
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainDetails]
    }
  }

  /** Contains list of scanned and skipped EBS volumes with details.
    */
  @js.native
  trait EbsVolumeDetails extends js.Object {
    var ScannedVolumeDetails: js.UndefOr[VolumeDetails]
    var SkippedVolumeDetails: js.UndefOr[VolumeDetails]
  }

  object EbsVolumeDetails {
    @inline
    def apply(
        ScannedVolumeDetails: js.UndefOr[VolumeDetails] = js.undefined,
        SkippedVolumeDetails: js.UndefOr[VolumeDetails] = js.undefined
    ): EbsVolumeDetails = {
      val __obj = js.Dynamic.literal()
      ScannedVolumeDetails.foreach(__v => __obj.updateDynamic("ScannedVolumeDetails")(__v.asInstanceOf[js.Any]))
      SkippedVolumeDetails.foreach(__v => __obj.updateDynamic("SkippedVolumeDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EbsVolumeDetails]
    }
  }

  /** Contains details from the malware scan that created a finding.
    */
  @js.native
  trait EbsVolumeScanDetails extends js.Object {
    var ScanCompletedAt: js.UndefOr[Timestamp]
    var ScanDetections: js.UndefOr[ScanDetections]
    var ScanId: js.UndefOr[String]
    var ScanStartedAt: js.UndefOr[Timestamp]
    var Sources: js.UndefOr[Sources]
    var TriggerFindingId: js.UndefOr[String]
  }

  object EbsVolumeScanDetails {
    @inline
    def apply(
        ScanCompletedAt: js.UndefOr[Timestamp] = js.undefined,
        ScanDetections: js.UndefOr[ScanDetections] = js.undefined,
        ScanId: js.UndefOr[String] = js.undefined,
        ScanStartedAt: js.UndefOr[Timestamp] = js.undefined,
        Sources: js.UndefOr[Sources] = js.undefined,
        TriggerFindingId: js.UndefOr[String] = js.undefined
    ): EbsVolumeScanDetails = {
      val __obj = js.Dynamic.literal()
      ScanCompletedAt.foreach(__v => __obj.updateDynamic("ScanCompletedAt")(__v.asInstanceOf[js.Any]))
      ScanDetections.foreach(__v => __obj.updateDynamic("ScanDetections")(__v.asInstanceOf[js.Any]))
      ScanId.foreach(__v => __obj.updateDynamic("ScanId")(__v.asInstanceOf[js.Any]))
      ScanStartedAt.foreach(__v => __obj.updateDynamic("ScanStartedAt")(__v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.updateDynamic("Sources")(__v.asInstanceOf[js.Any]))
      TriggerFindingId.foreach(__v => __obj.updateDynamic("TriggerFindingId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EbsVolumeScanDetails]
    }
  }

  /** Describes the configuration of scanning EBS volumes as a data source.
    */
  @js.native
  trait EbsVolumesResult extends js.Object {
    var Reason: js.UndefOr[String]
    var Status: js.UndefOr[DataSourceStatus]
  }

  object EbsVolumesResult {
    @inline
    def apply(
        Reason: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[DataSourceStatus] = js.undefined
    ): EbsVolumesResult = {
      val __obj = js.Dynamic.literal()
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EbsVolumesResult]
    }
  }

  /** Contains information about the details of the ECS Cluster.
    */
  @js.native
  trait EcsClusterDetails extends js.Object {
    var ActiveServicesCount: js.UndefOr[Int]
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var RegisteredContainerInstancesCount: js.UndefOr[Int]
    var RunningTasksCount: js.UndefOr[Int]
    var Status: js.UndefOr[String]
    var Tags: js.UndefOr[Tags]
    var TaskDetails: js.UndefOr[EcsTaskDetails]
  }

  object EcsClusterDetails {
    @inline
    def apply(
        ActiveServicesCount: js.UndefOr[Int] = js.undefined,
        Arn: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        RegisteredContainerInstancesCount: js.UndefOr[Int] = js.undefined,
        RunningTasksCount: js.UndefOr[Int] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TaskDetails: js.UndefOr[EcsTaskDetails] = js.undefined
    ): EcsClusterDetails = {
      val __obj = js.Dynamic.literal()
      ActiveServicesCount.foreach(__v => __obj.updateDynamic("ActiveServicesCount")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RegisteredContainerInstancesCount.foreach(__v => __obj.updateDynamic("RegisteredContainerInstancesCount")(__v.asInstanceOf[js.Any]))
      RunningTasksCount.foreach(__v => __obj.updateDynamic("RunningTasksCount")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TaskDetails.foreach(__v => __obj.updateDynamic("TaskDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EcsClusterDetails]
    }
  }

  /** Contains information about the task in an ECS cluster.
    */
  @js.native
  trait EcsTaskDetails extends js.Object {
    var Arn: js.UndefOr[String]
    var Containers: js.UndefOr[Containers]
    var DefinitionArn: js.UndefOr[String]
    var Group: js.UndefOr[String]
    var StartedAt: js.UndefOr[Timestamp]
    var StartedBy: js.UndefOr[String]
    var Tags: js.UndefOr[Tags]
    var TaskCreatedAt: js.UndefOr[Timestamp]
    var Version: js.UndefOr[String]
    var Volumes: js.UndefOr[Volumes]
  }

  object EcsTaskDetails {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Containers: js.UndefOr[Containers] = js.undefined,
        DefinitionArn: js.UndefOr[String] = js.undefined,
        Group: js.UndefOr[String] = js.undefined,
        StartedAt: js.UndefOr[Timestamp] = js.undefined,
        StartedBy: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TaskCreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Version: js.UndefOr[String] = js.undefined,
        Volumes: js.UndefOr[Volumes] = js.undefined
    ): EcsTaskDetails = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Containers.foreach(__v => __obj.updateDynamic("Containers")(__v.asInstanceOf[js.Any]))
      DefinitionArn.foreach(__v => __obj.updateDynamic("DefinitionArn")(__v.asInstanceOf[js.Any]))
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      StartedAt.foreach(__v => __obj.updateDynamic("StartedAt")(__v.asInstanceOf[js.Any]))
      StartedBy.foreach(__v => __obj.updateDynamic("StartedBy")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TaskCreatedAt.foreach(__v => __obj.updateDynamic("TaskCreatedAt")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      Volumes.foreach(__v => __obj.updateDynamic("Volumes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EcsTaskDetails]
    }
  }

  /** Details about the EKS cluster involved in a Kubernetes finding.
    */
  @js.native
  trait EksClusterDetails extends js.Object {
    var Arn: js.UndefOr[String]
    var CreatedAt: js.UndefOr[Timestamp]
    var Name: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var Tags: js.UndefOr[Tags]
    var VpcId: js.UndefOr[String]
  }

  object EksClusterDetails {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): EksClusterDetails = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksClusterDetails]
    }
  }

  @js.native
  trait EnableOrganizationAdminAccountRequest extends js.Object {
    var AdminAccountId: String
  }

  object EnableOrganizationAdminAccountRequest {
    @inline
    def apply(
        AdminAccountId: String
    ): EnableOrganizationAdminAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AdminAccountId" -> AdminAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EnableOrganizationAdminAccountRequest]
    }
  }

  @js.native
  trait EnableOrganizationAdminAccountResponse extends js.Object

  object EnableOrganizationAdminAccountResponse {
    @inline
    def apply(): EnableOrganizationAdminAccountResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableOrganizationAdminAccountResponse]
    }
  }

  /** Contains information about the reason that the finding was generated.
    */
  @js.native
  trait Evidence extends js.Object {
    var ThreatIntelligenceDetails: js.UndefOr[ThreatIntelligenceDetails]
  }

  object Evidence {
    @inline
    def apply(
        ThreatIntelligenceDetails: js.UndefOr[ThreatIntelligenceDetails] = js.undefined
    ): Evidence = {
      val __obj = js.Dynamic.literal()
      ThreatIntelligenceDetails.foreach(__v => __obj.updateDynamic("ThreatIntelligenceDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Evidence]
    }
  }

  /** Contains information about the condition.
    */
  @js.native
  trait FilterCondition extends js.Object {
    var EqualsValue: js.UndefOr[NonEmptyString]
    var GreaterThan: js.UndefOr[LongValue]
    var LessThan: js.UndefOr[LongValue]
  }

  object FilterCondition {
    @inline
    def apply(
        EqualsValue: js.UndefOr[NonEmptyString] = js.undefined,
        GreaterThan: js.UndefOr[LongValue] = js.undefined,
        LessThan: js.UndefOr[LongValue] = js.undefined
    ): FilterCondition = {
      val __obj = js.Dynamic.literal()
      EqualsValue.foreach(__v => __obj.updateDynamic("EqualsValue")(__v.asInstanceOf[js.Any]))
      GreaterThan.foreach(__v => __obj.updateDynamic("GreaterThan")(__v.asInstanceOf[js.Any]))
      LessThan.foreach(__v => __obj.updateDynamic("LessThan")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterCondition]
    }
  }

  /** Represents the criteria to be used in the filter for describing scan entries.
    */
  @js.native
  trait FilterCriteria extends js.Object {
    var FilterCriterion: js.UndefOr[FilterCriterionList]
  }

  object FilterCriteria {
    @inline
    def apply(
        FilterCriterion: js.UndefOr[FilterCriterionList] = js.undefined
    ): FilterCriteria = {
      val __obj = js.Dynamic.literal()
      FilterCriterion.foreach(__v => __obj.updateDynamic("FilterCriterion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterCriteria]
    }
  }

  /** Represents a condition that when matched will be added to the response of the operation. Irrespective of using any filter criteria, an administrator account can view the scan entries for all of its member accounts. However, each member account can view the scan entries only for their own account.
    */
  @js.native
  trait FilterCriterion extends js.Object {
    var CriterionKey: js.UndefOr[CriterionKey]
    var FilterCondition: js.UndefOr[FilterCondition]
  }

  object FilterCriterion {
    @inline
    def apply(
        CriterionKey: js.UndefOr[CriterionKey] = js.undefined,
        FilterCondition: js.UndefOr[FilterCondition] = js.undefined
    ): FilterCriterion = {
      val __obj = js.Dynamic.literal()
      CriterionKey.foreach(__v => __obj.updateDynamic("CriterionKey")(__v.asInstanceOf[js.Any]))
      FilterCondition.foreach(__v => __obj.updateDynamic("FilterCondition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterCriterion]
    }
  }

  /** Contains information about the finding, which is generated when abnormal or suspicious activity is detected.
    */
  @js.native
  trait Finding extends js.Object {
    var AccountId: String
    var Arn: String
    var CreatedAt: String
    var Id: String
    var Region: String
    var Resource: Resource
    var SchemaVersion: String
    var Severity: Double
    var Type: FindingType
    var UpdatedAt: String
    var Confidence: js.UndefOr[Double]
    var Description: js.UndefOr[String]
    var Partition: js.UndefOr[String]
    var Service: js.UndefOr[Service]
    var Title: js.UndefOr[String]
  }

  object Finding {
    @inline
    def apply(
        AccountId: String,
        Arn: String,
        CreatedAt: String,
        Id: String,
        Region: String,
        Resource: Resource,
        SchemaVersion: String,
        Severity: Double,
        Type: FindingType,
        UpdatedAt: String,
        Confidence: js.UndefOr[Double] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        Partition: js.UndefOr[String] = js.undefined,
        Service: js.UndefOr[Service] = js.undefined,
        Title: js.UndefOr[String] = js.undefined
    ): Finding = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Arn" -> Arn.asInstanceOf[js.Any],
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Region" -> Region.asInstanceOf[js.Any],
        "Resource" -> Resource.asInstanceOf[js.Any],
        "SchemaVersion" -> SchemaVersion.asInstanceOf[js.Any],
        "Severity" -> Severity.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any],
        "UpdatedAt" -> UpdatedAt.asInstanceOf[js.Any]
      )

      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Partition.foreach(__v => __obj.updateDynamic("Partition")(__v.asInstanceOf[js.Any]))
      Service.foreach(__v => __obj.updateDynamic("Service")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Finding]
    }
  }

  /** Contains information about the criteria used for querying findings.
    */
  @js.native
  trait FindingCriteria extends js.Object {
    var Criterion: js.UndefOr[Criterion]
  }

  object FindingCriteria {
    @inline
    def apply(
        Criterion: js.UndefOr[Criterion] = js.undefined
    ): FindingCriteria = {
      val __obj = js.Dynamic.literal()
      Criterion.foreach(__v => __obj.updateDynamic("Criterion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingCriteria]
    }
  }

  /** Contains information about finding statistics.
    */
  @js.native
  trait FindingStatistics extends js.Object {
    var CountBySeverity: js.UndefOr[CountBySeverity]
  }

  object FindingStatistics {
    @inline
    def apply(
        CountBySeverity: js.UndefOr[CountBySeverity] = js.undefined
    ): FindingStatistics = {
      val __obj = js.Dynamic.literal()
      CountBySeverity.foreach(__v => __obj.updateDynamic("CountBySeverity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingStatistics]
    }
  }

  /** Contains information on the status of VPC flow logs as a data source.
    */
  @js.native
  trait FlowLogsConfigurationResult extends js.Object {
    var Status: DataSourceStatus
  }

  object FlowLogsConfigurationResult {
    @inline
    def apply(
        Status: DataSourceStatus
    ): FlowLogsConfigurationResult = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FlowLogsConfigurationResult]
    }
  }

  /** Contains information about the location of the remote IP address.
    */
  @js.native
  trait GeoLocation extends js.Object {
    var Lat: js.UndefOr[Double]
    var Lon: js.UndefOr[Double]
  }

  object GeoLocation {
    @inline
    def apply(
        Lat: js.UndefOr[Double] = js.undefined,
        Lon: js.UndefOr[Double] = js.undefined
    ): GeoLocation = {
      val __obj = js.Dynamic.literal()
      Lat.foreach(__v => __obj.updateDynamic("Lat")(__v.asInstanceOf[js.Any]))
      Lon.foreach(__v => __obj.updateDynamic("Lon")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeoLocation]
    }
  }

  @js.native
  trait GetAdministratorAccountRequest extends js.Object {
    var DetectorId: DetectorId
  }

  object GetAdministratorAccountRequest {
    @inline
    def apply(
        DetectorId: DetectorId
    ): GetAdministratorAccountRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAdministratorAccountRequest]
    }
  }

  @js.native
  trait GetAdministratorAccountResponse extends js.Object {
    var Administrator: Administrator
  }

  object GetAdministratorAccountResponse {
    @inline
    def apply(
        Administrator: Administrator
    ): GetAdministratorAccountResponse = {
      val __obj = js.Dynamic.literal(
        "Administrator" -> Administrator.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAdministratorAccountResponse]
    }
  }

  @js.native
  trait GetDetectorRequest extends js.Object {
    var DetectorId: DetectorId
  }

  object GetDetectorRequest {
    @inline
    def apply(
        DetectorId: DetectorId
    ): GetDetectorRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDetectorRequest]
    }
  }

  @js.native
  trait GetDetectorResponse extends js.Object {
    var ServiceRole: String
    var Status: DetectorStatus
    var CreatedAt: js.UndefOr[String]
    var DataSources: js.UndefOr[DataSourceConfigurationsResult]
    var FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency]
    var Tags: js.UndefOr[TagMap]
    var UpdatedAt: js.UndefOr[String]
  }

  object GetDetectorResponse {
    @inline
    def apply(
        ServiceRole: String,
        Status: DetectorStatus,
        CreatedAt: js.UndefOr[String] = js.undefined,
        DataSources: js.UndefOr[DataSourceConfigurationsResult] = js.undefined,
        FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        UpdatedAt: js.UndefOr[String] = js.undefined
    ): GetDetectorResponse = {
      val __obj = js.Dynamic.literal(
        "ServiceRole" -> ServiceRole.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DataSources.foreach(__v => __obj.updateDynamic("DataSources")(__v.asInstanceOf[js.Any]))
      FindingPublishingFrequency.foreach(__v => __obj.updateDynamic("FindingPublishingFrequency")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDetectorResponse]
    }
  }

  @js.native
  trait GetFilterRequest extends js.Object {
    var DetectorId: DetectorId
    var FilterName: String
  }

  object GetFilterRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        FilterName: String
    ): GetFilterRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FilterName" -> FilterName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFilterRequest]
    }
  }

  @js.native
  trait GetFilterResponse extends js.Object {
    var Action: FilterAction
    var FindingCriteria: FindingCriteria
    var Name: FilterName
    var Description: js.UndefOr[FilterDescription]
    var Rank: js.UndefOr[FilterRank]
    var Tags: js.UndefOr[TagMap]
  }

  object GetFilterResponse {
    @inline
    def apply(
        Action: FilterAction,
        FindingCriteria: FindingCriteria,
        Name: FilterName,
        Description: js.UndefOr[FilterDescription] = js.undefined,
        Rank: js.UndefOr[FilterRank] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): GetFilterResponse = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "FindingCriteria" -> FindingCriteria.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Rank.foreach(__v => __obj.updateDynamic("Rank")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFilterResponse]
    }
  }

  @js.native
  trait GetFindingsRequest extends js.Object {
    var DetectorId: DetectorId
    var FindingIds: FindingIds
    var SortCriteria: js.UndefOr[SortCriteria]
  }

  object GetFindingsRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        FindingIds: FindingIds,
        SortCriteria: js.UndefOr[SortCriteria] = js.undefined
    ): GetFindingsRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FindingIds" -> FindingIds.asInstanceOf[js.Any]
      )

      SortCriteria.foreach(__v => __obj.updateDynamic("SortCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFindingsRequest]
    }
  }

  @js.native
  trait GetFindingsResponse extends js.Object {
    var Findings: Findings
  }

  object GetFindingsResponse {
    @inline
    def apply(
        Findings: Findings
    ): GetFindingsResponse = {
      val __obj = js.Dynamic.literal(
        "Findings" -> Findings.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFindingsResponse]
    }
  }

  @js.native
  trait GetFindingsStatisticsRequest extends js.Object {
    var DetectorId: DetectorId
    var FindingStatisticTypes: FindingStatisticTypes
    var FindingCriteria: js.UndefOr[FindingCriteria]
  }

  object GetFindingsStatisticsRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        FindingStatisticTypes: FindingStatisticTypes,
        FindingCriteria: js.UndefOr[FindingCriteria] = js.undefined
    ): GetFindingsStatisticsRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FindingStatisticTypes" -> FindingStatisticTypes.asInstanceOf[js.Any]
      )

      FindingCriteria.foreach(__v => __obj.updateDynamic("FindingCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFindingsStatisticsRequest]
    }
  }

  @js.native
  trait GetFindingsStatisticsResponse extends js.Object {
    var FindingStatistics: FindingStatistics
  }

  object GetFindingsStatisticsResponse {
    @inline
    def apply(
        FindingStatistics: FindingStatistics
    ): GetFindingsStatisticsResponse = {
      val __obj = js.Dynamic.literal(
        "FindingStatistics" -> FindingStatistics.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFindingsStatisticsResponse]
    }
  }

  @js.native
  trait GetIPSetRequest extends js.Object {
    var DetectorId: DetectorId
    var IpSetId: String
  }

  object GetIPSetRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        IpSetId: String
    ): GetIPSetRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "IpSetId" -> IpSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetIPSetRequest]
    }
  }

  @js.native
  trait GetIPSetResponse extends js.Object {
    var Format: IpSetFormat
    var Location: Location
    var Name: Name
    var Status: IpSetStatus
    var Tags: js.UndefOr[TagMap]
  }

  object GetIPSetResponse {
    @inline
    def apply(
        Format: IpSetFormat,
        Location: Location,
        Name: Name,
        Status: IpSetStatus,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): GetIPSetResponse = {
      val __obj = js.Dynamic.literal(
        "Format" -> Format.asInstanceOf[js.Any],
        "Location" -> Location.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIPSetResponse]
    }
  }

  @js.native
  trait GetInvitationsCountRequest extends js.Object

  object GetInvitationsCountRequest {
    @inline
    def apply(): GetInvitationsCountRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetInvitationsCountRequest]
    }
  }

  @js.native
  trait GetInvitationsCountResponse extends js.Object {
    var InvitationsCount: js.UndefOr[Int]
  }

  object GetInvitationsCountResponse {
    @inline
    def apply(
        InvitationsCount: js.UndefOr[Int] = js.undefined
    ): GetInvitationsCountResponse = {
      val __obj = js.Dynamic.literal()
      InvitationsCount.foreach(__v => __obj.updateDynamic("InvitationsCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInvitationsCountResponse]
    }
  }

  @js.native
  trait GetMalwareScanSettingsRequest extends js.Object {
    var DetectorId: DetectorId
  }

  object GetMalwareScanSettingsRequest {
    @inline
    def apply(
        DetectorId: DetectorId
    ): GetMalwareScanSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMalwareScanSettingsRequest]
    }
  }

  @js.native
  trait GetMalwareScanSettingsResponse extends js.Object {
    var EbsSnapshotPreservation: js.UndefOr[EbsSnapshotPreservation]
    var ScanResourceCriteria: js.UndefOr[ScanResourceCriteria]
  }

  object GetMalwareScanSettingsResponse {
    @inline
    def apply(
        EbsSnapshotPreservation: js.UndefOr[EbsSnapshotPreservation] = js.undefined,
        ScanResourceCriteria: js.UndefOr[ScanResourceCriteria] = js.undefined
    ): GetMalwareScanSettingsResponse = {
      val __obj = js.Dynamic.literal()
      EbsSnapshotPreservation.foreach(__v => __obj.updateDynamic("EbsSnapshotPreservation")(__v.asInstanceOf[js.Any]))
      ScanResourceCriteria.foreach(__v => __obj.updateDynamic("ScanResourceCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMalwareScanSettingsResponse]
    }
  }

  @deprecated("This input is deprecated, use GetAdministratorAccountRequest instead", "forever")
  @js.native
  trait GetMasterAccountRequest extends js.Object {
    var DetectorId: DetectorId
  }

  object GetMasterAccountRequest {
    @inline
    def apply(
        DetectorId: DetectorId
    ): GetMasterAccountRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMasterAccountRequest]
    }
  }

  @deprecated("This output is deprecated, use GetAdministratorAccountResponse instead", "forever")
  @js.native
  trait GetMasterAccountResponse extends js.Object {
    var Master: Master
  }

  object GetMasterAccountResponse {
    @inline
    def apply(
        Master: Master
    ): GetMasterAccountResponse = {
      val __obj = js.Dynamic.literal(
        "Master" -> Master.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMasterAccountResponse]
    }
  }

  @js.native
  trait GetMemberDetectorsRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: DetectorId
  }

  object GetMemberDetectorsRequest {
    @inline
    def apply(
        AccountIds: AccountIds,
        DetectorId: DetectorId
    ): GetMemberDetectorsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMemberDetectorsRequest]
    }
  }

  @js.native
  trait GetMemberDetectorsResponse extends js.Object {
    var MemberDataSourceConfigurations: MemberDataSourceConfigurations
    var UnprocessedAccounts: UnprocessedAccounts
  }

  object GetMemberDetectorsResponse {
    @inline
    def apply(
        MemberDataSourceConfigurations: MemberDataSourceConfigurations,
        UnprocessedAccounts: UnprocessedAccounts
    ): GetMemberDetectorsResponse = {
      val __obj = js.Dynamic.literal(
        "MemberDataSourceConfigurations" -> MemberDataSourceConfigurations.asInstanceOf[js.Any],
        "UnprocessedAccounts" -> UnprocessedAccounts.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMemberDetectorsResponse]
    }
  }

  @js.native
  trait GetMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: DetectorId
  }

  object GetMembersRequest {
    @inline
    def apply(
        AccountIds: AccountIds,
        DetectorId: DetectorId
    ): GetMembersRequest = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMembersRequest]
    }
  }

  @js.native
  trait GetMembersResponse extends js.Object {
    var Members: Members
    var UnprocessedAccounts: UnprocessedAccounts
  }

  object GetMembersResponse {
    @inline
    def apply(
        Members: Members,
        UnprocessedAccounts: UnprocessedAccounts
    ): GetMembersResponse = {
      val __obj = js.Dynamic.literal(
        "Members" -> Members.asInstanceOf[js.Any],
        "UnprocessedAccounts" -> UnprocessedAccounts.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMembersResponse]
    }
  }

  @js.native
  trait GetRemainingFreeTrialDaysRequest extends js.Object {
    var DetectorId: DetectorId
    var AccountIds: js.UndefOr[AccountIds]
  }

  object GetRemainingFreeTrialDaysRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        AccountIds: js.UndefOr[AccountIds] = js.undefined
    ): GetRemainingFreeTrialDaysRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      AccountIds.foreach(__v => __obj.updateDynamic("AccountIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRemainingFreeTrialDaysRequest]
    }
  }

  @js.native
  trait GetRemainingFreeTrialDaysResponse extends js.Object {
    var Accounts: js.UndefOr[AccountFreeTrialInfos]
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts]
  }

  object GetRemainingFreeTrialDaysResponse {
    @inline
    def apply(
        Accounts: js.UndefOr[AccountFreeTrialInfos] = js.undefined,
        UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined
    ): GetRemainingFreeTrialDaysResponse = {
      val __obj = js.Dynamic.literal()
      Accounts.foreach(__v => __obj.updateDynamic("Accounts")(__v.asInstanceOf[js.Any]))
      UnprocessedAccounts.foreach(__v => __obj.updateDynamic("UnprocessedAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRemainingFreeTrialDaysResponse]
    }
  }

  @js.native
  trait GetThreatIntelSetRequest extends js.Object {
    var DetectorId: DetectorId
    var ThreatIntelSetId: String
  }

  object GetThreatIntelSetRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        ThreatIntelSetId: String
    ): GetThreatIntelSetRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "ThreatIntelSetId" -> ThreatIntelSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetThreatIntelSetRequest]
    }
  }

  @js.native
  trait GetThreatIntelSetResponse extends js.Object {
    var Format: ThreatIntelSetFormat
    var Location: Location
    var Name: Name
    var Status: ThreatIntelSetStatus
    var Tags: js.UndefOr[TagMap]
  }

  object GetThreatIntelSetResponse {
    @inline
    def apply(
        Format: ThreatIntelSetFormat,
        Location: Location,
        Name: Name,
        Status: ThreatIntelSetStatus,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): GetThreatIntelSetResponse = {
      val __obj = js.Dynamic.literal(
        "Format" -> Format.asInstanceOf[js.Any],
        "Location" -> Location.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetThreatIntelSetResponse]
    }
  }

  @js.native
  trait GetUsageStatisticsRequest extends js.Object {
    var DetectorId: DetectorId
    var UsageCriteria: UsageCriteria
    var UsageStatisticType: UsageStatisticType
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var Unit: js.UndefOr[String]
  }

  object GetUsageStatisticsRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        UsageCriteria: UsageCriteria,
        UsageStatisticType: UsageStatisticType,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        Unit: js.UndefOr[String] = js.undefined
    ): GetUsageStatisticsRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "UsageCriteria" -> UsageCriteria.asInstanceOf[js.Any],
        "UsageStatisticType" -> UsageStatisticType.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUsageStatisticsRequest]
    }
  }

  @js.native
  trait GetUsageStatisticsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var UsageStatistics: js.UndefOr[UsageStatistics]
  }

  object GetUsageStatisticsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        UsageStatistics: js.UndefOr[UsageStatistics] = js.undefined
    ): GetUsageStatisticsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UsageStatistics.foreach(__v => __obj.updateDynamic("UsageStatistics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUsageStatisticsResponse]
    }
  }

  /** Contains details of the highest severity threat detected during scan and number of infected files.
    */
  @js.native
  trait HighestSeverityThreatDetails extends js.Object {
    var Count: js.UndefOr[Int]
    var Severity: js.UndefOr[String]
    var ThreatName: js.UndefOr[String]
  }

  object HighestSeverityThreatDetails {
    @inline
    def apply(
        Count: js.UndefOr[Int] = js.undefined,
        Severity: js.UndefOr[String] = js.undefined,
        ThreatName: js.UndefOr[String] = js.undefined
    ): HighestSeverityThreatDetails = {
      val __obj = js.Dynamic.literal()
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      ThreatName.foreach(__v => __obj.updateDynamic("ThreatName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HighestSeverityThreatDetails]
    }
  }

  /** Represents a pre-existing file or directory on the host machine that the volume maps to.
    */
  @js.native
  trait HostPath extends js.Object {
    var Path: js.UndefOr[String]
  }

  object HostPath {
    @inline
    def apply(
        Path: js.UndefOr[String] = js.undefined
    ): HostPath = {
      val __obj = js.Dynamic.literal()
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HostPath]
    }
  }

  /** Contains information about the EC2 instance profile.
    */
  @js.native
  trait IamInstanceProfile extends js.Object {
    var Arn: js.UndefOr[String]
    var Id: js.UndefOr[String]
  }

  object IamInstanceProfile {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Id: js.UndefOr[String] = js.undefined
    ): IamInstanceProfile = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IamInstanceProfile]
    }
  }

  /** Contains information about the details of an instance.
    */
  @js.native
  trait InstanceDetails extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var IamInstanceProfile: js.UndefOr[IamInstanceProfile]
    var ImageDescription: js.UndefOr[String]
    var ImageId: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var InstanceState: js.UndefOr[String]
    var InstanceType: js.UndefOr[String]
    var LaunchTime: js.UndefOr[String]
    var NetworkInterfaces: js.UndefOr[NetworkInterfaces]
    var OutpostArn: js.UndefOr[String]
    var Platform: js.UndefOr[String]
    var ProductCodes: js.UndefOr[ProductCodes]
    var Tags: js.UndefOr[Tags]
  }

  object InstanceDetails {
    @inline
    def apply(
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        IamInstanceProfile: js.UndefOr[IamInstanceProfile] = js.undefined,
        ImageDescription: js.UndefOr[String] = js.undefined,
        ImageId: js.UndefOr[String] = js.undefined,
        InstanceId: js.UndefOr[String] = js.undefined,
        InstanceState: js.UndefOr[String] = js.undefined,
        InstanceType: js.UndefOr[String] = js.undefined,
        LaunchTime: js.UndefOr[String] = js.undefined,
        NetworkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined,
        OutpostArn: js.UndefOr[String] = js.undefined,
        Platform: js.UndefOr[String] = js.undefined,
        ProductCodes: js.UndefOr[ProductCodes] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): InstanceDetails = {
      val __obj = js.Dynamic.literal()
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      IamInstanceProfile.foreach(__v => __obj.updateDynamic("IamInstanceProfile")(__v.asInstanceOf[js.Any]))
      ImageDescription.foreach(__v => __obj.updateDynamic("ImageDescription")(__v.asInstanceOf[js.Any]))
      ImageId.foreach(__v => __obj.updateDynamic("ImageId")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      InstanceState.foreach(__v => __obj.updateDynamic("InstanceState")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      LaunchTime.foreach(__v => __obj.updateDynamic("LaunchTime")(__v.asInstanceOf[js.Any]))
      NetworkInterfaces.foreach(__v => __obj.updateDynamic("NetworkInterfaces")(__v.asInstanceOf[js.Any]))
      OutpostArn.foreach(__v => __obj.updateDynamic("OutpostArn")(__v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.updateDynamic("Platform")(__v.asInstanceOf[js.Any]))
      ProductCodes.foreach(__v => __obj.updateDynamic("ProductCodes")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceDetails]
    }
  }

  /** Contains information about the invitation to become a member account.
    */
  @js.native
  trait Invitation extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var InvitationId: js.UndefOr[String]
    var InvitedAt: js.UndefOr[String]
    var RelationshipStatus: js.UndefOr[String]
  }

  object Invitation {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        InvitationId: js.UndefOr[String] = js.undefined,
        InvitedAt: js.UndefOr[String] = js.undefined,
        RelationshipStatus: js.UndefOr[String] = js.undefined
    ): Invitation = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      InvitationId.foreach(__v => __obj.updateDynamic("InvitationId")(__v.asInstanceOf[js.Any]))
      InvitedAt.foreach(__v => __obj.updateDynamic("InvitedAt")(__v.asInstanceOf[js.Any]))
      RelationshipStatus.foreach(__v => __obj.updateDynamic("RelationshipStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Invitation]
    }
  }

  @js.native
  trait InviteMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: DetectorId
    var DisableEmailNotification: js.UndefOr[Boolean]
    var Message: js.UndefOr[String]
  }

  object InviteMembersRequest {
    @inline
    def apply(
        AccountIds: AccountIds,
        DetectorId: DetectorId,
        DisableEmailNotification: js.UndefOr[Boolean] = js.undefined,
        Message: js.UndefOr[String] = js.undefined
    ): InviteMembersRequest = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      DisableEmailNotification.foreach(__v => __obj.updateDynamic("DisableEmailNotification")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InviteMembersRequest]
    }
  }

  @js.native
  trait InviteMembersResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  object InviteMembersResponse {
    @inline
    def apply(
        UnprocessedAccounts: UnprocessedAccounts
    ): InviteMembersResponse = {
      val __obj = js.Dynamic.literal(
        "UnprocessedAccounts" -> UnprocessedAccounts.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InviteMembersResponse]
    }
  }

  /** Information about the Kubernetes API call action described in this finding.
    */
  @js.native
  trait KubernetesApiCallAction extends js.Object {
    var Parameters: js.UndefOr[String]
    var RemoteIpDetails: js.UndefOr[RemoteIpDetails]
    var RequestUri: js.UndefOr[String]
    var SourceIps: js.UndefOr[SourceIps]
    var StatusCode: js.UndefOr[Int]
    var UserAgent: js.UndefOr[String]
    var Verb: js.UndefOr[String]
  }

  object KubernetesApiCallAction {
    @inline
    def apply(
        Parameters: js.UndefOr[String] = js.undefined,
        RemoteIpDetails: js.UndefOr[RemoteIpDetails] = js.undefined,
        RequestUri: js.UndefOr[String] = js.undefined,
        SourceIps: js.UndefOr[SourceIps] = js.undefined,
        StatusCode: js.UndefOr[Int] = js.undefined,
        UserAgent: js.UndefOr[String] = js.undefined,
        Verb: js.UndefOr[String] = js.undefined
    ): KubernetesApiCallAction = {
      val __obj = js.Dynamic.literal()
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      RemoteIpDetails.foreach(__v => __obj.updateDynamic("RemoteIpDetails")(__v.asInstanceOf[js.Any]))
      RequestUri.foreach(__v => __obj.updateDynamic("RequestUri")(__v.asInstanceOf[js.Any]))
      SourceIps.foreach(__v => __obj.updateDynamic("SourceIps")(__v.asInstanceOf[js.Any]))
      StatusCode.foreach(__v => __obj.updateDynamic("StatusCode")(__v.asInstanceOf[js.Any]))
      UserAgent.foreach(__v => __obj.updateDynamic("UserAgent")(__v.asInstanceOf[js.Any]))
      Verb.foreach(__v => __obj.updateDynamic("Verb")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KubernetesApiCallAction]
    }
  }

  /** Describes whether Kubernetes audit logs are enabled as a data source.
    */
  @js.native
  trait KubernetesAuditLogsConfiguration extends js.Object {
    var Enable: Boolean
  }

  object KubernetesAuditLogsConfiguration {
    @inline
    def apply(
        Enable: Boolean
    ): KubernetesAuditLogsConfiguration = {
      val __obj = js.Dynamic.literal(
        "Enable" -> Enable.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KubernetesAuditLogsConfiguration]
    }
  }

  /** Describes whether Kubernetes audit logs are enabled as a data source.
    */
  @js.native
  trait KubernetesAuditLogsConfigurationResult extends js.Object {
    var Status: DataSourceStatus
  }

  object KubernetesAuditLogsConfigurationResult {
    @inline
    def apply(
        Status: DataSourceStatus
    ): KubernetesAuditLogsConfigurationResult = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KubernetesAuditLogsConfigurationResult]
    }
  }

  /** Describes whether any Kubernetes data sources are enabled.
    */
  @js.native
  trait KubernetesConfiguration extends js.Object {
    var AuditLogs: KubernetesAuditLogsConfiguration
  }

  object KubernetesConfiguration {
    @inline
    def apply(
        AuditLogs: KubernetesAuditLogsConfiguration
    ): KubernetesConfiguration = {
      val __obj = js.Dynamic.literal(
        "AuditLogs" -> AuditLogs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KubernetesConfiguration]
    }
  }

  /** Describes whether any Kubernetes logs will be enabled as a data source.
    */
  @js.native
  trait KubernetesConfigurationResult extends js.Object {
    var AuditLogs: KubernetesAuditLogsConfigurationResult
  }

  object KubernetesConfigurationResult {
    @inline
    def apply(
        AuditLogs: KubernetesAuditLogsConfigurationResult
    ): KubernetesConfigurationResult = {
      val __obj = js.Dynamic.literal(
        "AuditLogs" -> AuditLogs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KubernetesConfigurationResult]
    }
  }

  /** Provides details about the Kubernetes resources when it is enabled as a data source.
    */
  @js.native
  trait KubernetesDataSourceFreeTrial extends js.Object {
    var AuditLogs: js.UndefOr[DataSourceFreeTrial]
  }

  object KubernetesDataSourceFreeTrial {
    @inline
    def apply(
        AuditLogs: js.UndefOr[DataSourceFreeTrial] = js.undefined
    ): KubernetesDataSourceFreeTrial = {
      val __obj = js.Dynamic.literal()
      AuditLogs.foreach(__v => __obj.updateDynamic("AuditLogs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KubernetesDataSourceFreeTrial]
    }
  }

  /** Details about Kubernetes resources such as a Kubernetes user or workload resource involved in a Kubernetes finding.
    */
  @js.native
  trait KubernetesDetails extends js.Object {
    var KubernetesUserDetails: js.UndefOr[KubernetesUserDetails]
    var KubernetesWorkloadDetails: js.UndefOr[KubernetesWorkloadDetails]
  }

  object KubernetesDetails {
    @inline
    def apply(
        KubernetesUserDetails: js.UndefOr[KubernetesUserDetails] = js.undefined,
        KubernetesWorkloadDetails: js.UndefOr[KubernetesWorkloadDetails] = js.undefined
    ): KubernetesDetails = {
      val __obj = js.Dynamic.literal()
      KubernetesUserDetails.foreach(__v => __obj.updateDynamic("KubernetesUserDetails")(__v.asInstanceOf[js.Any]))
      KubernetesWorkloadDetails.foreach(__v => __obj.updateDynamic("KubernetesWorkloadDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KubernetesDetails]
    }
  }

  /** Details about the Kubernetes user involved in a Kubernetes finding.
    */
  @js.native
  trait KubernetesUserDetails extends js.Object {
    var Groups: js.UndefOr[Groups]
    var Uid: js.UndefOr[String]
    var Username: js.UndefOr[String]
  }

  object KubernetesUserDetails {
    @inline
    def apply(
        Groups: js.UndefOr[Groups] = js.undefined,
        Uid: js.UndefOr[String] = js.undefined,
        Username: js.UndefOr[String] = js.undefined
    ): KubernetesUserDetails = {
      val __obj = js.Dynamic.literal()
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      Uid.foreach(__v => __obj.updateDynamic("Uid")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KubernetesUserDetails]
    }
  }

  /** Details about the Kubernetes workload involved in a Kubernetes finding.
    */
  @js.native
  trait KubernetesWorkloadDetails extends js.Object {
    var Containers: js.UndefOr[Containers]
    var HostNetwork: js.UndefOr[Boolean]
    var Name: js.UndefOr[String]
    var Namespace: js.UndefOr[String]
    var Type: js.UndefOr[String]
    var Uid: js.UndefOr[String]
    var Volumes: js.UndefOr[Volumes]
  }

  object KubernetesWorkloadDetails {
    @inline
    def apply(
        Containers: js.UndefOr[Containers] = js.undefined,
        HostNetwork: js.UndefOr[Boolean] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Namespace: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[String] = js.undefined,
        Uid: js.UndefOr[String] = js.undefined,
        Volumes: js.UndefOr[Volumes] = js.undefined
    ): KubernetesWorkloadDetails = {
      val __obj = js.Dynamic.literal()
      Containers.foreach(__v => __obj.updateDynamic("Containers")(__v.asInstanceOf[js.Any]))
      HostNetwork.foreach(__v => __obj.updateDynamic("HostNetwork")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Uid.foreach(__v => __obj.updateDynamic("Uid")(__v.asInstanceOf[js.Any]))
      Volumes.foreach(__v => __obj.updateDynamic("Volumes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KubernetesWorkloadDetails]
    }
  }

  @js.native
  trait ListDetectorsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListDetectorsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDetectorsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectorsRequest]
    }
  }

  @js.native
  trait ListDetectorsResponse extends js.Object {
    var DetectorIds: DetectorIds
    var NextToken: js.UndefOr[String]
  }

  object ListDetectorsResponse {
    @inline
    def apply(
        DetectorIds: DetectorIds,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDetectorsResponse = {
      val __obj = js.Dynamic.literal(
        "DetectorIds" -> DetectorIds.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectorsResponse]
    }
  }

  @js.native
  trait ListFiltersRequest extends js.Object {
    var DetectorId: DetectorId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListFiltersRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListFiltersRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFiltersRequest]
    }
  }

  @js.native
  trait ListFiltersResponse extends js.Object {
    var FilterNames: FilterNames
    var NextToken: js.UndefOr[String]
  }

  object ListFiltersResponse {
    @inline
    def apply(
        FilterNames: FilterNames,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListFiltersResponse = {
      val __obj = js.Dynamic.literal(
        "FilterNames" -> FilterNames.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFiltersResponse]
    }
  }

  @js.native
  trait ListFindingsRequest extends js.Object {
    var DetectorId: DetectorId
    var FindingCriteria: js.UndefOr[FindingCriteria]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var SortCriteria: js.UndefOr[SortCriteria]
  }

  object ListFindingsRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        FindingCriteria: js.UndefOr[FindingCriteria] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        SortCriteria: js.UndefOr[SortCriteria] = js.undefined
    ): ListFindingsRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      FindingCriteria.foreach(__v => __obj.updateDynamic("FindingCriteria")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.updateDynamic("SortCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingsRequest]
    }
  }

  @js.native
  trait ListFindingsResponse extends js.Object {
    var FindingIds: FindingIds
    var NextToken: js.UndefOr[String]
  }

  object ListFindingsResponse {
    @inline
    def apply(
        FindingIds: FindingIds,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListFindingsResponse = {
      val __obj = js.Dynamic.literal(
        "FindingIds" -> FindingIds.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingsResponse]
    }
  }

  @js.native
  trait ListIPSetsRequest extends js.Object {
    var DetectorId: DetectorId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListIPSetsRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListIPSetsRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIPSetsRequest]
    }
  }

  @js.native
  trait ListIPSetsResponse extends js.Object {
    var IpSetIds: IpSetIds
    var NextToken: js.UndefOr[String]
  }

  object ListIPSetsResponse {
    @inline
    def apply(
        IpSetIds: IpSetIds,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListIPSetsResponse = {
      val __obj = js.Dynamic.literal(
        "IpSetIds" -> IpSetIds.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIPSetsResponse]
    }
  }

  @js.native
  trait ListInvitationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListInvitationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListInvitationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInvitationsRequest]
    }
  }

  @js.native
  trait ListInvitationsResponse extends js.Object {
    var Invitations: js.UndefOr[Invitations]
    var NextToken: js.UndefOr[String]
  }

  object ListInvitationsResponse {
    @inline
    def apply(
        Invitations: js.UndefOr[Invitations] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListInvitationsResponse = {
      val __obj = js.Dynamic.literal()
      Invitations.foreach(__v => __obj.updateDynamic("Invitations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInvitationsResponse]
    }
  }

  @js.native
  trait ListMembersRequest extends js.Object {
    var DetectorId: DetectorId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var OnlyAssociated: js.UndefOr[String]
  }

  object ListMembersRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        OnlyAssociated: js.UndefOr[String] = js.undefined
    ): ListMembersRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OnlyAssociated.foreach(__v => __obj.updateDynamic("OnlyAssociated")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMembersRequest]
    }
  }

  @js.native
  trait ListMembersResponse extends js.Object {
    var Members: js.UndefOr[Members]
    var NextToken: js.UndefOr[String]
  }

  object ListMembersResponse {
    @inline
    def apply(
        Members: js.UndefOr[Members] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListMembersResponse = {
      val __obj = js.Dynamic.literal()
      Members.foreach(__v => __obj.updateDynamic("Members")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMembersResponse]
    }
  }

  @js.native
  trait ListOrganizationAdminAccountsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListOrganizationAdminAccountsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListOrganizationAdminAccountsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrganizationAdminAccountsRequest]
    }
  }

  @js.native
  trait ListOrganizationAdminAccountsResponse extends js.Object {
    var AdminAccounts: js.UndefOr[AdminAccounts]
    var NextToken: js.UndefOr[String]
  }

  object ListOrganizationAdminAccountsResponse {
    @inline
    def apply(
        AdminAccounts: js.UndefOr[AdminAccounts] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListOrganizationAdminAccountsResponse = {
      val __obj = js.Dynamic.literal()
      AdminAccounts.foreach(__v => __obj.updateDynamic("AdminAccounts")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrganizationAdminAccountsResponse]
    }
  }

  @js.native
  trait ListPublishingDestinationsRequest extends js.Object {
    var DetectorId: DetectorId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListPublishingDestinationsRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListPublishingDestinationsRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPublishingDestinationsRequest]
    }
  }

  @js.native
  trait ListPublishingDestinationsResponse extends js.Object {
    var Destinations: Destinations
    var NextToken: js.UndefOr[String]
  }

  object ListPublishingDestinationsResponse {
    @inline
    def apply(
        Destinations: Destinations,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListPublishingDestinationsResponse = {
      val __obj = js.Dynamic.literal(
        "Destinations" -> Destinations.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPublishingDestinationsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: GuardDutyArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: GuardDutyArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListThreatIntelSetsRequest extends js.Object {
    var DetectorId: DetectorId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListThreatIntelSetsRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListThreatIntelSetsRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThreatIntelSetsRequest]
    }
  }

  @js.native
  trait ListThreatIntelSetsResponse extends js.Object {
    var ThreatIntelSetIds: ThreatIntelSetIds
    var NextToken: js.UndefOr[String]
  }

  object ListThreatIntelSetsResponse {
    @inline
    def apply(
        ThreatIntelSetIds: ThreatIntelSetIds,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListThreatIntelSetsResponse = {
      val __obj = js.Dynamic.literal(
        "ThreatIntelSetIds" -> ThreatIntelSetIds.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThreatIntelSetsResponse]
    }
  }

  /** Contains information about the local IP address of the connection.
    */
  @js.native
  trait LocalIpDetails extends js.Object {
    var IpAddressV4: js.UndefOr[String]
  }

  object LocalIpDetails {
    @inline
    def apply(
        IpAddressV4: js.UndefOr[String] = js.undefined
    ): LocalIpDetails = {
      val __obj = js.Dynamic.literal()
      IpAddressV4.foreach(__v => __obj.updateDynamic("IpAddressV4")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LocalIpDetails]
    }
  }

  /** Contains information about the port for the local connection.
    */
  @js.native
  trait LocalPortDetails extends js.Object {
    var Port: js.UndefOr[Int]
    var PortName: js.UndefOr[String]
  }

  object LocalPortDetails {
    @inline
    def apply(
        Port: js.UndefOr[Int] = js.undefined,
        PortName: js.UndefOr[String] = js.undefined
    ): LocalPortDetails = {
      val __obj = js.Dynamic.literal()
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      PortName.foreach(__v => __obj.updateDynamic("PortName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LocalPortDetails]
    }
  }

  /** Describes whether Malware Protection will be enabled as a data source.
    */
  @js.native
  trait MalwareProtectionConfiguration extends js.Object {
    var ScanEc2InstanceWithFindings: js.UndefOr[ScanEc2InstanceWithFindings]
  }

  object MalwareProtectionConfiguration {
    @inline
    def apply(
        ScanEc2InstanceWithFindings: js.UndefOr[ScanEc2InstanceWithFindings] = js.undefined
    ): MalwareProtectionConfiguration = {
      val __obj = js.Dynamic.literal()
      ScanEc2InstanceWithFindings.foreach(__v => __obj.updateDynamic("ScanEc2InstanceWithFindings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MalwareProtectionConfiguration]
    }
  }

  /** An object that contains information on the status of all Malware Protection data sources.
    */
  @js.native
  trait MalwareProtectionConfigurationResult extends js.Object {
    var ScanEc2InstanceWithFindings: js.UndefOr[ScanEc2InstanceWithFindingsResult]
    var ServiceRole: js.UndefOr[String]
  }

  object MalwareProtectionConfigurationResult {
    @inline
    def apply(
        ScanEc2InstanceWithFindings: js.UndefOr[ScanEc2InstanceWithFindingsResult] = js.undefined,
        ServiceRole: js.UndefOr[String] = js.undefined
    ): MalwareProtectionConfigurationResult = {
      val __obj = js.Dynamic.literal()
      ScanEc2InstanceWithFindings.foreach(__v => __obj.updateDynamic("ScanEc2InstanceWithFindings")(__v.asInstanceOf[js.Any]))
      ServiceRole.foreach(__v => __obj.updateDynamic("ServiceRole")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MalwareProtectionConfigurationResult]
    }
  }

  /** Provides details about Malware Protection when it is enabled as a data source.
    */
  @js.native
  trait MalwareProtectionDataSourceFreeTrial extends js.Object {
    var ScanEc2InstanceWithFindings: js.UndefOr[DataSourceFreeTrial]
  }

  object MalwareProtectionDataSourceFreeTrial {
    @inline
    def apply(
        ScanEc2InstanceWithFindings: js.UndefOr[DataSourceFreeTrial] = js.undefined
    ): MalwareProtectionDataSourceFreeTrial = {
      val __obj = js.Dynamic.literal()
      ScanEc2InstanceWithFindings.foreach(__v => __obj.updateDynamic("ScanEc2InstanceWithFindings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MalwareProtectionDataSourceFreeTrial]
    }
  }

  /** Contains information about the administrator account and invitation.
    */
  @js.native
  trait Master extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var InvitationId: js.UndefOr[String]
    var InvitedAt: js.UndefOr[String]
    var RelationshipStatus: js.UndefOr[String]
  }

  object Master {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        InvitationId: js.UndefOr[String] = js.undefined,
        InvitedAt: js.UndefOr[String] = js.undefined,
        RelationshipStatus: js.UndefOr[String] = js.undefined
    ): Master = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      InvitationId.foreach(__v => __obj.updateDynamic("InvitationId")(__v.asInstanceOf[js.Any]))
      InvitedAt.foreach(__v => __obj.updateDynamic("InvitedAt")(__v.asInstanceOf[js.Any]))
      RelationshipStatus.foreach(__v => __obj.updateDynamic("RelationshipStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Master]
    }
  }

  /** Contains information about the member account.
    */
  @js.native
  trait Member extends js.Object {
    var AccountId: AccountId
    var Email: Email
    var MasterId: String
    var RelationshipStatus: String
    var UpdatedAt: String
    var AdministratorId: js.UndefOr[String]
    var DetectorId: js.UndefOr[DetectorId]
    var InvitedAt: js.UndefOr[String]
  }

  object Member {
    @inline
    def apply(
        AccountId: AccountId,
        Email: Email,
        MasterId: String,
        RelationshipStatus: String,
        UpdatedAt: String,
        AdministratorId: js.UndefOr[String] = js.undefined,
        DetectorId: js.UndefOr[DetectorId] = js.undefined,
        InvitedAt: js.UndefOr[String] = js.undefined
    ): Member = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Email" -> Email.asInstanceOf[js.Any],
        "MasterId" -> MasterId.asInstanceOf[js.Any],
        "RelationshipStatus" -> RelationshipStatus.asInstanceOf[js.Any],
        "UpdatedAt" -> UpdatedAt.asInstanceOf[js.Any]
      )

      AdministratorId.foreach(__v => __obj.updateDynamic("AdministratorId")(__v.asInstanceOf[js.Any]))
      DetectorId.foreach(__v => __obj.updateDynamic("DetectorId")(__v.asInstanceOf[js.Any]))
      InvitedAt.foreach(__v => __obj.updateDynamic("InvitedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Member]
    }
  }

  /** Contains information on which data sources are enabled for a member account.
    */
  @js.native
  trait MemberDataSourceConfiguration extends js.Object {
    var AccountId: AccountId
    var DataSources: DataSourceConfigurationsResult
  }

  object MemberDataSourceConfiguration {
    @inline
    def apply(
        AccountId: AccountId,
        DataSources: DataSourceConfigurationsResult
    ): MemberDataSourceConfiguration = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "DataSources" -> DataSources.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MemberDataSourceConfiguration]
    }
  }

  /** Contains information about the NETWORK_CONNECTION action described in the finding.
    */
  @js.native
  trait NetworkConnectionAction extends js.Object {
    var Blocked: js.UndefOr[Boolean]
    var ConnectionDirection: js.UndefOr[String]
    var LocalIpDetails: js.UndefOr[LocalIpDetails]
    var LocalPortDetails: js.UndefOr[LocalPortDetails]
    var Protocol: js.UndefOr[String]
    var RemoteIpDetails: js.UndefOr[RemoteIpDetails]
    var RemotePortDetails: js.UndefOr[RemotePortDetails]
  }

  object NetworkConnectionAction {
    @inline
    def apply(
        Blocked: js.UndefOr[Boolean] = js.undefined,
        ConnectionDirection: js.UndefOr[String] = js.undefined,
        LocalIpDetails: js.UndefOr[LocalIpDetails] = js.undefined,
        LocalPortDetails: js.UndefOr[LocalPortDetails] = js.undefined,
        Protocol: js.UndefOr[String] = js.undefined,
        RemoteIpDetails: js.UndefOr[RemoteIpDetails] = js.undefined,
        RemotePortDetails: js.UndefOr[RemotePortDetails] = js.undefined
    ): NetworkConnectionAction = {
      val __obj = js.Dynamic.literal()
      Blocked.foreach(__v => __obj.updateDynamic("Blocked")(__v.asInstanceOf[js.Any]))
      ConnectionDirection.foreach(__v => __obj.updateDynamic("ConnectionDirection")(__v.asInstanceOf[js.Any]))
      LocalIpDetails.foreach(__v => __obj.updateDynamic("LocalIpDetails")(__v.asInstanceOf[js.Any]))
      LocalPortDetails.foreach(__v => __obj.updateDynamic("LocalPortDetails")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      RemoteIpDetails.foreach(__v => __obj.updateDynamic("RemoteIpDetails")(__v.asInstanceOf[js.Any]))
      RemotePortDetails.foreach(__v => __obj.updateDynamic("RemotePortDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkConnectionAction]
    }
  }

  /** Contains information about the elastic network interface of the EC2 instance.
    */
  @js.native
  trait NetworkInterface extends js.Object {
    var Ipv6Addresses: js.UndefOr[Ipv6Addresses]
    var NetworkInterfaceId: js.UndefOr[String]
    var PrivateDnsName: js.UndefOr[String]
    var PrivateIpAddress: js.UndefOr[String]
    var PrivateIpAddresses: js.UndefOr[PrivateIpAddresses]
    var PublicDnsName: js.UndefOr[String]
    var PublicIp: js.UndefOr[String]
    var SecurityGroups: js.UndefOr[SecurityGroups]
    var SubnetId: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object NetworkInterface {
    @inline
    def apply(
        Ipv6Addresses: js.UndefOr[Ipv6Addresses] = js.undefined,
        NetworkInterfaceId: js.UndefOr[String] = js.undefined,
        PrivateDnsName: js.UndefOr[String] = js.undefined,
        PrivateIpAddress: js.UndefOr[String] = js.undefined,
        PrivateIpAddresses: js.UndefOr[PrivateIpAddresses] = js.undefined,
        PublicDnsName: js.UndefOr[String] = js.undefined,
        PublicIp: js.UndefOr[String] = js.undefined,
        SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined,
        SubnetId: js.UndefOr[String] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): NetworkInterface = {
      val __obj = js.Dynamic.literal()
      Ipv6Addresses.foreach(__v => __obj.updateDynamic("Ipv6Addresses")(__v.asInstanceOf[js.Any]))
      NetworkInterfaceId.foreach(__v => __obj.updateDynamic("NetworkInterfaceId")(__v.asInstanceOf[js.Any]))
      PrivateDnsName.foreach(__v => __obj.updateDynamic("PrivateDnsName")(__v.asInstanceOf[js.Any]))
      PrivateIpAddress.foreach(__v => __obj.updateDynamic("PrivateIpAddress")(__v.asInstanceOf[js.Any]))
      PrivateIpAddresses.foreach(__v => __obj.updateDynamic("PrivateIpAddresses")(__v.asInstanceOf[js.Any]))
      PublicDnsName.foreach(__v => __obj.updateDynamic("PublicDnsName")(__v.asInstanceOf[js.Any]))
      PublicIp.foreach(__v => __obj.updateDynamic("PublicIp")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkInterface]
    }
  }

  /** Contains information about the ISP organization of the remote IP address.
    */
  @js.native
  trait Organization extends js.Object {
    var Asn: js.UndefOr[String]
    var AsnOrg: js.UndefOr[String]
    var Isp: js.UndefOr[String]
    var Org: js.UndefOr[String]
  }

  object Organization {
    @inline
    def apply(
        Asn: js.UndefOr[String] = js.undefined,
        AsnOrg: js.UndefOr[String] = js.undefined,
        Isp: js.UndefOr[String] = js.undefined,
        Org: js.UndefOr[String] = js.undefined
    ): Organization = {
      val __obj = js.Dynamic.literal()
      Asn.foreach(__v => __obj.updateDynamic("Asn")(__v.asInstanceOf[js.Any]))
      AsnOrg.foreach(__v => __obj.updateDynamic("AsnOrg")(__v.asInstanceOf[js.Any]))
      Isp.foreach(__v => __obj.updateDynamic("Isp")(__v.asInstanceOf[js.Any]))
      Org.foreach(__v => __obj.updateDynamic("Org")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Organization]
    }
  }

  /** An object that contains information on which data sources will be configured to be automatically enabled for new members within the organization.
    */
  @js.native
  trait OrganizationDataSourceConfigurations extends js.Object {
    var Kubernetes: js.UndefOr[OrganizationKubernetesConfiguration]
    var MalwareProtection: js.UndefOr[OrganizationMalwareProtectionConfiguration]
    var S3Logs: js.UndefOr[OrganizationS3LogsConfiguration]
  }

  object OrganizationDataSourceConfigurations {
    @inline
    def apply(
        Kubernetes: js.UndefOr[OrganizationKubernetesConfiguration] = js.undefined,
        MalwareProtection: js.UndefOr[OrganizationMalwareProtectionConfiguration] = js.undefined,
        S3Logs: js.UndefOr[OrganizationS3LogsConfiguration] = js.undefined
    ): OrganizationDataSourceConfigurations = {
      val __obj = js.Dynamic.literal()
      Kubernetes.foreach(__v => __obj.updateDynamic("Kubernetes")(__v.asInstanceOf[js.Any]))
      MalwareProtection.foreach(__v => __obj.updateDynamic("MalwareProtection")(__v.asInstanceOf[js.Any]))
      S3Logs.foreach(__v => __obj.updateDynamic("S3Logs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrganizationDataSourceConfigurations]
    }
  }

  /** An object that contains information on which data sources are automatically enabled for new members within the organization.
    */
  @js.native
  trait OrganizationDataSourceConfigurationsResult extends js.Object {
    var S3Logs: OrganizationS3LogsConfigurationResult
    var Kubernetes: js.UndefOr[OrganizationKubernetesConfigurationResult]
    var MalwareProtection: js.UndefOr[OrganizationMalwareProtectionConfigurationResult]
  }

  object OrganizationDataSourceConfigurationsResult {
    @inline
    def apply(
        S3Logs: OrganizationS3LogsConfigurationResult,
        Kubernetes: js.UndefOr[OrganizationKubernetesConfigurationResult] = js.undefined,
        MalwareProtection: js.UndefOr[OrganizationMalwareProtectionConfigurationResult] = js.undefined
    ): OrganizationDataSourceConfigurationsResult = {
      val __obj = js.Dynamic.literal(
        "S3Logs" -> S3Logs.asInstanceOf[js.Any]
      )

      Kubernetes.foreach(__v => __obj.updateDynamic("Kubernetes")(__v.asInstanceOf[js.Any]))
      MalwareProtection.foreach(__v => __obj.updateDynamic("MalwareProtection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrganizationDataSourceConfigurationsResult]
    }
  }

  /** Organization-wide EBS volumes scan configuration.
    */
  @js.native
  trait OrganizationEbsVolumes extends js.Object {
    var AutoEnable: js.UndefOr[Boolean]
  }

  object OrganizationEbsVolumes {
    @inline
    def apply(
        AutoEnable: js.UndefOr[Boolean] = js.undefined
    ): OrganizationEbsVolumes = {
      val __obj = js.Dynamic.literal()
      AutoEnable.foreach(__v => __obj.updateDynamic("AutoEnable")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrganizationEbsVolumes]
    }
  }

  /** An object that contains information on the status of whether EBS volumes scanning will be enabled as a data source for an organization.
    */
  @js.native
  trait OrganizationEbsVolumesResult extends js.Object {
    var AutoEnable: js.UndefOr[Boolean]
  }

  object OrganizationEbsVolumesResult {
    @inline
    def apply(
        AutoEnable: js.UndefOr[Boolean] = js.undefined
    ): OrganizationEbsVolumesResult = {
      val __obj = js.Dynamic.literal()
      AutoEnable.foreach(__v => __obj.updateDynamic("AutoEnable")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrganizationEbsVolumesResult]
    }
  }

  /** Organization-wide Kubernetes audit logs configuration.
    */
  @js.native
  trait OrganizationKubernetesAuditLogsConfiguration extends js.Object {
    var AutoEnable: Boolean
  }

  object OrganizationKubernetesAuditLogsConfiguration {
    @inline
    def apply(
        AutoEnable: Boolean
    ): OrganizationKubernetesAuditLogsConfiguration = {
      val __obj = js.Dynamic.literal(
        "AutoEnable" -> AutoEnable.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OrganizationKubernetesAuditLogsConfiguration]
    }
  }

  /** The current configuration of Kubernetes audit logs as a data source for the organization.
    */
  @js.native
  trait OrganizationKubernetesAuditLogsConfigurationResult extends js.Object {
    var AutoEnable: Boolean
  }

  object OrganizationKubernetesAuditLogsConfigurationResult {
    @inline
    def apply(
        AutoEnable: Boolean
    ): OrganizationKubernetesAuditLogsConfigurationResult = {
      val __obj = js.Dynamic.literal(
        "AutoEnable" -> AutoEnable.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OrganizationKubernetesAuditLogsConfigurationResult]
    }
  }

  /** Organization-wide Kubernetes data sources configurations.
    */
  @js.native
  trait OrganizationKubernetesConfiguration extends js.Object {
    var AuditLogs: OrganizationKubernetesAuditLogsConfiguration
  }

  object OrganizationKubernetesConfiguration {
    @inline
    def apply(
        AuditLogs: OrganizationKubernetesAuditLogsConfiguration
    ): OrganizationKubernetesConfiguration = {
      val __obj = js.Dynamic.literal(
        "AuditLogs" -> AuditLogs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OrganizationKubernetesConfiguration]
    }
  }

  /** The current configuration of all Kubernetes data sources for the organization.
    */
  @js.native
  trait OrganizationKubernetesConfigurationResult extends js.Object {
    var AuditLogs: OrganizationKubernetesAuditLogsConfigurationResult
  }

  object OrganizationKubernetesConfigurationResult {
    @inline
    def apply(
        AuditLogs: OrganizationKubernetesAuditLogsConfigurationResult
    ): OrganizationKubernetesConfigurationResult = {
      val __obj = js.Dynamic.literal(
        "AuditLogs" -> AuditLogs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OrganizationKubernetesConfigurationResult]
    }
  }

  /** Organization-wide Malware Protection configurations.
    */
  @js.native
  trait OrganizationMalwareProtectionConfiguration extends js.Object {
    var ScanEc2InstanceWithFindings: js.UndefOr[OrganizationScanEc2InstanceWithFindings]
  }

  object OrganizationMalwareProtectionConfiguration {
    @inline
    def apply(
        ScanEc2InstanceWithFindings: js.UndefOr[OrganizationScanEc2InstanceWithFindings] = js.undefined
    ): OrganizationMalwareProtectionConfiguration = {
      val __obj = js.Dynamic.literal()
      ScanEc2InstanceWithFindings.foreach(__v => __obj.updateDynamic("ScanEc2InstanceWithFindings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrganizationMalwareProtectionConfiguration]
    }
  }

  /** An object that contains information on the status of all Malware Protection data source for an organization.
    */
  @js.native
  trait OrganizationMalwareProtectionConfigurationResult extends js.Object {
    var ScanEc2InstanceWithFindings: js.UndefOr[OrganizationScanEc2InstanceWithFindingsResult]
  }

  object OrganizationMalwareProtectionConfigurationResult {
    @inline
    def apply(
        ScanEc2InstanceWithFindings: js.UndefOr[OrganizationScanEc2InstanceWithFindingsResult] = js.undefined
    ): OrganizationMalwareProtectionConfigurationResult = {
      val __obj = js.Dynamic.literal()
      ScanEc2InstanceWithFindings.foreach(__v => __obj.updateDynamic("ScanEc2InstanceWithFindings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrganizationMalwareProtectionConfigurationResult]
    }
  }

  /** Describes whether S3 data event logs will be automatically enabled for new members of the organization.
    */
  @js.native
  trait OrganizationS3LogsConfiguration extends js.Object {
    var AutoEnable: Boolean
  }

  object OrganizationS3LogsConfiguration {
    @inline
    def apply(
        AutoEnable: Boolean
    ): OrganizationS3LogsConfiguration = {
      val __obj = js.Dynamic.literal(
        "AutoEnable" -> AutoEnable.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OrganizationS3LogsConfiguration]
    }
  }

  /** The current configuration of S3 data event logs as a data source for the organization.
    */
  @js.native
  trait OrganizationS3LogsConfigurationResult extends js.Object {
    var AutoEnable: Boolean
  }

  object OrganizationS3LogsConfigurationResult {
    @inline
    def apply(
        AutoEnable: Boolean
    ): OrganizationS3LogsConfigurationResult = {
      val __obj = js.Dynamic.literal(
        "AutoEnable" -> AutoEnable.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OrganizationS3LogsConfigurationResult]
    }
  }

  /** Organization-wide EC2 instances with findings scan configuration.
    */
  @js.native
  trait OrganizationScanEc2InstanceWithFindings extends js.Object {
    var EbsVolumes: js.UndefOr[OrganizationEbsVolumes]
  }

  object OrganizationScanEc2InstanceWithFindings {
    @inline
    def apply(
        EbsVolumes: js.UndefOr[OrganizationEbsVolumes] = js.undefined
    ): OrganizationScanEc2InstanceWithFindings = {
      val __obj = js.Dynamic.literal()
      EbsVolumes.foreach(__v => __obj.updateDynamic("EbsVolumes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrganizationScanEc2InstanceWithFindings]
    }
  }

  /** An object that contains information on the status of scanning EC2 instances with findings for an organization.
    */
  @js.native
  trait OrganizationScanEc2InstanceWithFindingsResult extends js.Object {
    var EbsVolumes: js.UndefOr[OrganizationEbsVolumesResult]
  }

  object OrganizationScanEc2InstanceWithFindingsResult {
    @inline
    def apply(
        EbsVolumes: js.UndefOr[OrganizationEbsVolumesResult] = js.undefined
    ): OrganizationScanEc2InstanceWithFindingsResult = {
      val __obj = js.Dynamic.literal()
      EbsVolumes.foreach(__v => __obj.updateDynamic("EbsVolumes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrganizationScanEc2InstanceWithFindingsResult]
    }
  }

  /** Contains information on the owner of the bucket.
    */
  @js.native
  trait Owner extends js.Object {
    var Id: js.UndefOr[String]
  }

  object Owner {
    @inline
    def apply(
        Id: js.UndefOr[String] = js.undefined
    ): Owner = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Owner]
    }
  }

  /** Contains information about how permissions are configured for the S3 bucket.
    */
  @js.native
  trait PermissionConfiguration extends js.Object {
    var AccountLevelPermissions: js.UndefOr[AccountLevelPermissions]
    var BucketLevelPermissions: js.UndefOr[BucketLevelPermissions]
  }

  object PermissionConfiguration {
    @inline
    def apply(
        AccountLevelPermissions: js.UndefOr[AccountLevelPermissions] = js.undefined,
        BucketLevelPermissions: js.UndefOr[BucketLevelPermissions] = js.undefined
    ): PermissionConfiguration = {
      val __obj = js.Dynamic.literal()
      AccountLevelPermissions.foreach(__v => __obj.updateDynamic("AccountLevelPermissions")(__v.asInstanceOf[js.Any]))
      BucketLevelPermissions.foreach(__v => __obj.updateDynamic("BucketLevelPermissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PermissionConfiguration]
    }
  }

  /** Contains information about the PORT_PROBE action described in the finding.
    */
  @js.native
  trait PortProbeAction extends js.Object {
    var Blocked: js.UndefOr[Boolean]
    var PortProbeDetails: js.UndefOr[PortProbeDetails]
  }

  object PortProbeAction {
    @inline
    def apply(
        Blocked: js.UndefOr[Boolean] = js.undefined,
        PortProbeDetails: js.UndefOr[PortProbeDetails] = js.undefined
    ): PortProbeAction = {
      val __obj = js.Dynamic.literal()
      Blocked.foreach(__v => __obj.updateDynamic("Blocked")(__v.asInstanceOf[js.Any]))
      PortProbeDetails.foreach(__v => __obj.updateDynamic("PortProbeDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortProbeAction]
    }
  }

  /** Contains information about the port probe details.
    */
  @js.native
  trait PortProbeDetail extends js.Object {
    var LocalIpDetails: js.UndefOr[LocalIpDetails]
    var LocalPortDetails: js.UndefOr[LocalPortDetails]
    var RemoteIpDetails: js.UndefOr[RemoteIpDetails]
  }

  object PortProbeDetail {
    @inline
    def apply(
        LocalIpDetails: js.UndefOr[LocalIpDetails] = js.undefined,
        LocalPortDetails: js.UndefOr[LocalPortDetails] = js.undefined,
        RemoteIpDetails: js.UndefOr[RemoteIpDetails] = js.undefined
    ): PortProbeDetail = {
      val __obj = js.Dynamic.literal()
      LocalIpDetails.foreach(__v => __obj.updateDynamic("LocalIpDetails")(__v.asInstanceOf[js.Any]))
      LocalPortDetails.foreach(__v => __obj.updateDynamic("LocalPortDetails")(__v.asInstanceOf[js.Any]))
      RemoteIpDetails.foreach(__v => __obj.updateDynamic("RemoteIpDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortProbeDetail]
    }
  }

  /** Contains other private IP address information of the EC2 instance.
    */
  @js.native
  trait PrivateIpAddressDetails extends js.Object {
    var PrivateDnsName: js.UndefOr[String]
    var PrivateIpAddress: js.UndefOr[String]
  }

  object PrivateIpAddressDetails {
    @inline
    def apply(
        PrivateDnsName: js.UndefOr[String] = js.undefined,
        PrivateIpAddress: js.UndefOr[String] = js.undefined
    ): PrivateIpAddressDetails = {
      val __obj = js.Dynamic.literal()
      PrivateDnsName.foreach(__v => __obj.updateDynamic("PrivateDnsName")(__v.asInstanceOf[js.Any]))
      PrivateIpAddress.foreach(__v => __obj.updateDynamic("PrivateIpAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PrivateIpAddressDetails]
    }
  }

  /** Contains information about the product code for the EC2 instance.
    */
  @js.native
  trait ProductCode extends js.Object {
    var Code: js.UndefOr[String]
    var ProductType: js.UndefOr[String]
  }

  object ProductCode {
    @inline
    def apply(
        Code: js.UndefOr[String] = js.undefined,
        ProductType: js.UndefOr[String] = js.undefined
    ): ProductCode = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      ProductType.foreach(__v => __obj.updateDynamic("ProductType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProductCode]
    }
  }

  /** Describes the public access policies that apply to the S3 bucket.
    */
  @js.native
  trait PublicAccess extends js.Object {
    var EffectivePermission: js.UndefOr[String]
    var PermissionConfiguration: js.UndefOr[PermissionConfiguration]
  }

  object PublicAccess {
    @inline
    def apply(
        EffectivePermission: js.UndefOr[String] = js.undefined,
        PermissionConfiguration: js.UndefOr[PermissionConfiguration] = js.undefined
    ): PublicAccess = {
      val __obj = js.Dynamic.literal()
      EffectivePermission.foreach(__v => __obj.updateDynamic("EffectivePermission")(__v.asInstanceOf[js.Any]))
      PermissionConfiguration.foreach(__v => __obj.updateDynamic("PermissionConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublicAccess]
    }
  }

  /** Contains details about the remote Amazon Web Services account that made the API call.
    */
  @js.native
  trait RemoteAccountDetails extends js.Object {
    var AccountId: js.UndefOr[String]
    var Affiliated: js.UndefOr[Boolean]
  }

  object RemoteAccountDetails {
    @inline
    def apply(
        AccountId: js.UndefOr[String] = js.undefined,
        Affiliated: js.UndefOr[Boolean] = js.undefined
    ): RemoteAccountDetails = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Affiliated.foreach(__v => __obj.updateDynamic("Affiliated")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoteAccountDetails]
    }
  }

  /** Contains information about the remote IP address of the connection.
    */
  @js.native
  trait RemoteIpDetails extends js.Object {
    var City: js.UndefOr[City]
    var Country: js.UndefOr[Country]
    var GeoLocation: js.UndefOr[GeoLocation]
    var IpAddressV4: js.UndefOr[String]
    var Organization: js.UndefOr[Organization]
  }

  object RemoteIpDetails {
    @inline
    def apply(
        City: js.UndefOr[City] = js.undefined,
        Country: js.UndefOr[Country] = js.undefined,
        GeoLocation: js.UndefOr[GeoLocation] = js.undefined,
        IpAddressV4: js.UndefOr[String] = js.undefined,
        Organization: js.UndefOr[Organization] = js.undefined
    ): RemoteIpDetails = {
      val __obj = js.Dynamic.literal()
      City.foreach(__v => __obj.updateDynamic("City")(__v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.updateDynamic("Country")(__v.asInstanceOf[js.Any]))
      GeoLocation.foreach(__v => __obj.updateDynamic("GeoLocation")(__v.asInstanceOf[js.Any]))
      IpAddressV4.foreach(__v => __obj.updateDynamic("IpAddressV4")(__v.asInstanceOf[js.Any]))
      Organization.foreach(__v => __obj.updateDynamic("Organization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoteIpDetails]
    }
  }

  /** Contains information about the remote port.
    */
  @js.native
  trait RemotePortDetails extends js.Object {
    var Port: js.UndefOr[Int]
    var PortName: js.UndefOr[String]
  }

  object RemotePortDetails {
    @inline
    def apply(
        Port: js.UndefOr[Int] = js.undefined,
        PortName: js.UndefOr[String] = js.undefined
    ): RemotePortDetails = {
      val __obj = js.Dynamic.literal()
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      PortName.foreach(__v => __obj.updateDynamic("PortName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemotePortDetails]
    }
  }

  /** Contains information about the Amazon Web Services resource associated with the activity that prompted GuardDuty to generate a finding.
    */
  @js.native
  trait Resource extends js.Object {
    var AccessKeyDetails: js.UndefOr[AccessKeyDetails]
    var ContainerDetails: js.UndefOr[Container]
    var EbsVolumeDetails: js.UndefOr[EbsVolumeDetails]
    var EcsClusterDetails: js.UndefOr[EcsClusterDetails]
    var EksClusterDetails: js.UndefOr[EksClusterDetails]
    var InstanceDetails: js.UndefOr[InstanceDetails]
    var KubernetesDetails: js.UndefOr[KubernetesDetails]
    var ResourceType: js.UndefOr[String]
    var S3BucketDetails: js.UndefOr[S3BucketDetails]
  }

  object Resource {
    @inline
    def apply(
        AccessKeyDetails: js.UndefOr[AccessKeyDetails] = js.undefined,
        ContainerDetails: js.UndefOr[Container] = js.undefined,
        EbsVolumeDetails: js.UndefOr[EbsVolumeDetails] = js.undefined,
        EcsClusterDetails: js.UndefOr[EcsClusterDetails] = js.undefined,
        EksClusterDetails: js.UndefOr[EksClusterDetails] = js.undefined,
        InstanceDetails: js.UndefOr[InstanceDetails] = js.undefined,
        KubernetesDetails: js.UndefOr[KubernetesDetails] = js.undefined,
        ResourceType: js.UndefOr[String] = js.undefined,
        S3BucketDetails: js.UndefOr[S3BucketDetails] = js.undefined
    ): Resource = {
      val __obj = js.Dynamic.literal()
      AccessKeyDetails.foreach(__v => __obj.updateDynamic("AccessKeyDetails")(__v.asInstanceOf[js.Any]))
      ContainerDetails.foreach(__v => __obj.updateDynamic("ContainerDetails")(__v.asInstanceOf[js.Any]))
      EbsVolumeDetails.foreach(__v => __obj.updateDynamic("EbsVolumeDetails")(__v.asInstanceOf[js.Any]))
      EcsClusterDetails.foreach(__v => __obj.updateDynamic("EcsClusterDetails")(__v.asInstanceOf[js.Any]))
      EksClusterDetails.foreach(__v => __obj.updateDynamic("EksClusterDetails")(__v.asInstanceOf[js.Any]))
      InstanceDetails.foreach(__v => __obj.updateDynamic("InstanceDetails")(__v.asInstanceOf[js.Any]))
      KubernetesDetails.foreach(__v => __obj.updateDynamic("KubernetesDetails")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      S3BucketDetails.foreach(__v => __obj.updateDynamic("S3BucketDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  /** Represents the resources that were scanned in the scan entry.
    */
  @js.native
  trait ResourceDetails extends js.Object {
    var InstanceArn: js.UndefOr[InstanceArn]
  }

  object ResourceDetails {
    @inline
    def apply(
        InstanceArn: js.UndefOr[InstanceArn] = js.undefined
    ): ResourceDetails = {
      val __obj = js.Dynamic.literal()
      InstanceArn.foreach(__v => __obj.updateDynamic("InstanceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceDetails]
    }
  }

  /** Contains information on the S3 bucket.
    */
  @js.native
  trait S3BucketDetail extends js.Object {
    var Arn: js.UndefOr[String]
    var CreatedAt: js.UndefOr[Timestamp]
    var DefaultServerSideEncryption: js.UndefOr[DefaultServerSideEncryption]
    var Name: js.UndefOr[String]
    var Owner: js.UndefOr[Owner]
    var PublicAccess: js.UndefOr[PublicAccess]
    var Tags: js.UndefOr[Tags]
    var Type: js.UndefOr[String]
  }

  object S3BucketDetail {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DefaultServerSideEncryption: js.UndefOr[DefaultServerSideEncryption] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Owner: js.UndefOr[Owner] = js.undefined,
        PublicAccess: js.UndefOr[PublicAccess] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): S3BucketDetail = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DefaultServerSideEncryption.foreach(__v => __obj.updateDynamic("DefaultServerSideEncryption")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      PublicAccess.foreach(__v => __obj.updateDynamic("PublicAccess")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3BucketDetail]
    }
  }

  /** Describes whether S3 data event logs will be enabled as a data source.
    */
  @js.native
  trait S3LogsConfiguration extends js.Object {
    var Enable: Boolean
  }

  object S3LogsConfiguration {
    @inline
    def apply(
        Enable: Boolean
    ): S3LogsConfiguration = {
      val __obj = js.Dynamic.literal(
        "Enable" -> Enable.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3LogsConfiguration]
    }
  }

  /** Describes whether S3 data event logs will be enabled as a data source.
    */
  @js.native
  trait S3LogsConfigurationResult extends js.Object {
    var Status: DataSourceStatus
  }

  object S3LogsConfigurationResult {
    @inline
    def apply(
        Status: DataSourceStatus
    ): S3LogsConfigurationResult = {
      val __obj = js.Dynamic.literal(
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3LogsConfigurationResult]
    }
  }

  /** Contains information about a malware scan.
    */
  @js.native
  trait Scan extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var AdminDetectorId: js.UndefOr[DetectorId]
    var AttachedVolumes: js.UndefOr[VolumeDetails]
    var DetectorId: js.UndefOr[DetectorId]
    var FailureReason: js.UndefOr[NonEmptyString]
    var FileCount: js.UndefOr[PositiveLong]
    var ResourceDetails: js.UndefOr[ResourceDetails]
    var ScanEndTime: js.UndefOr[Timestamp]
    var ScanId: js.UndefOr[NonEmptyString]
    var ScanResultDetails: js.UndefOr[ScanResultDetails]
    var ScanStartTime: js.UndefOr[Timestamp]
    var ScanStatus: js.UndefOr[ScanStatus]
    var TotalBytes: js.UndefOr[PositiveLong]
    var TriggerDetails: js.UndefOr[TriggerDetails]
  }

  object Scan {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        AdminDetectorId: js.UndefOr[DetectorId] = js.undefined,
        AttachedVolumes: js.UndefOr[VolumeDetails] = js.undefined,
        DetectorId: js.UndefOr[DetectorId] = js.undefined,
        FailureReason: js.UndefOr[NonEmptyString] = js.undefined,
        FileCount: js.UndefOr[PositiveLong] = js.undefined,
        ResourceDetails: js.UndefOr[ResourceDetails] = js.undefined,
        ScanEndTime: js.UndefOr[Timestamp] = js.undefined,
        ScanId: js.UndefOr[NonEmptyString] = js.undefined,
        ScanResultDetails: js.UndefOr[ScanResultDetails] = js.undefined,
        ScanStartTime: js.UndefOr[Timestamp] = js.undefined,
        ScanStatus: js.UndefOr[ScanStatus] = js.undefined,
        TotalBytes: js.UndefOr[PositiveLong] = js.undefined,
        TriggerDetails: js.UndefOr[TriggerDetails] = js.undefined
    ): Scan = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      AdminDetectorId.foreach(__v => __obj.updateDynamic("AdminDetectorId")(__v.asInstanceOf[js.Any]))
      AttachedVolumes.foreach(__v => __obj.updateDynamic("AttachedVolumes")(__v.asInstanceOf[js.Any]))
      DetectorId.foreach(__v => __obj.updateDynamic("DetectorId")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      FileCount.foreach(__v => __obj.updateDynamic("FileCount")(__v.asInstanceOf[js.Any]))
      ResourceDetails.foreach(__v => __obj.updateDynamic("ResourceDetails")(__v.asInstanceOf[js.Any]))
      ScanEndTime.foreach(__v => __obj.updateDynamic("ScanEndTime")(__v.asInstanceOf[js.Any]))
      ScanId.foreach(__v => __obj.updateDynamic("ScanId")(__v.asInstanceOf[js.Any]))
      ScanResultDetails.foreach(__v => __obj.updateDynamic("ScanResultDetails")(__v.asInstanceOf[js.Any]))
      ScanStartTime.foreach(__v => __obj.updateDynamic("ScanStartTime")(__v.asInstanceOf[js.Any]))
      ScanStatus.foreach(__v => __obj.updateDynamic("ScanStatus")(__v.asInstanceOf[js.Any]))
      TotalBytes.foreach(__v => __obj.updateDynamic("TotalBytes")(__v.asInstanceOf[js.Any]))
      TriggerDetails.foreach(__v => __obj.updateDynamic("TriggerDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Scan]
    }
  }

  /** Contains information about the condition.
    */
  @js.native
  trait ScanCondition extends js.Object {
    var MapEquals: MapEquals
  }

  object ScanCondition {
    @inline
    def apply(
        MapEquals: MapEquals
    ): ScanCondition = {
      val __obj = js.Dynamic.literal(
        "MapEquals" -> MapEquals.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ScanCondition]
    }
  }

  /** Represents key, value pair to be matched against given resource property.
    */
  @js.native
  trait ScanConditionPair extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  object ScanConditionPair {
    @inline
    def apply(
        Key: TagKey,
        Value: js.UndefOr[TagValue] = js.undefined
    ): ScanConditionPair = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScanConditionPair]
    }
  }

  /** Contains a complete view providing malware scan result details.
    */
  @js.native
  trait ScanDetections extends js.Object {
    var HighestSeverityThreatDetails: js.UndefOr[HighestSeverityThreatDetails]
    var ScannedItemCount: js.UndefOr[ScannedItemCount]
    var ThreatDetectedByName: js.UndefOr[ThreatDetectedByName]
    var ThreatsDetectedItemCount: js.UndefOr[ThreatsDetectedItemCount]
  }

  object ScanDetections {
    @inline
    def apply(
        HighestSeverityThreatDetails: js.UndefOr[HighestSeverityThreatDetails] = js.undefined,
        ScannedItemCount: js.UndefOr[ScannedItemCount] = js.undefined,
        ThreatDetectedByName: js.UndefOr[ThreatDetectedByName] = js.undefined,
        ThreatsDetectedItemCount: js.UndefOr[ThreatsDetectedItemCount] = js.undefined
    ): ScanDetections = {
      val __obj = js.Dynamic.literal()
      HighestSeverityThreatDetails.foreach(__v => __obj.updateDynamic("HighestSeverityThreatDetails")(__v.asInstanceOf[js.Any]))
      ScannedItemCount.foreach(__v => __obj.updateDynamic("ScannedItemCount")(__v.asInstanceOf[js.Any]))
      ThreatDetectedByName.foreach(__v => __obj.updateDynamic("ThreatDetectedByName")(__v.asInstanceOf[js.Any]))
      ThreatsDetectedItemCount.foreach(__v => __obj.updateDynamic("ThreatsDetectedItemCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScanDetections]
    }
  }

  /** Describes whether Malware Protection for EC2 instances with findings will be enabled as a data source.
    */
  @js.native
  trait ScanEc2InstanceWithFindings extends js.Object {
    var EbsVolumes: js.UndefOr[Boolean]
  }

  object ScanEc2InstanceWithFindings {
    @inline
    def apply(
        EbsVolumes: js.UndefOr[Boolean] = js.undefined
    ): ScanEc2InstanceWithFindings = {
      val __obj = js.Dynamic.literal()
      EbsVolumes.foreach(__v => __obj.updateDynamic("EbsVolumes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScanEc2InstanceWithFindings]
    }
  }

  /** An object that contains information on the status of whether Malware Protection for EC2 instances with findings will be enabled as a data source.
    */
  @js.native
  trait ScanEc2InstanceWithFindingsResult extends js.Object {
    var EbsVolumes: js.UndefOr[EbsVolumesResult]
  }

  object ScanEc2InstanceWithFindingsResult {
    @inline
    def apply(
        EbsVolumes: js.UndefOr[EbsVolumesResult] = js.undefined
    ): ScanEc2InstanceWithFindingsResult = {
      val __obj = js.Dynamic.literal()
      EbsVolumes.foreach(__v => __obj.updateDynamic("EbsVolumes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScanEc2InstanceWithFindingsResult]
    }
  }

  /** Contains details of infected file including name, file path and hash.
    */
  @js.native
  trait ScanFilePath extends js.Object {
    var FileName: js.UndefOr[String]
    var FilePath: js.UndefOr[String]
    var Hash: js.UndefOr[String]
    var VolumeArn: js.UndefOr[String]
  }

  object ScanFilePath {
    @inline
    def apply(
        FileName: js.UndefOr[String] = js.undefined,
        FilePath: js.UndefOr[String] = js.undefined,
        Hash: js.UndefOr[String] = js.undefined,
        VolumeArn: js.UndefOr[String] = js.undefined
    ): ScanFilePath = {
      val __obj = js.Dynamic.literal()
      FileName.foreach(__v => __obj.updateDynamic("FileName")(__v.asInstanceOf[js.Any]))
      FilePath.foreach(__v => __obj.updateDynamic("FilePath")(__v.asInstanceOf[js.Any]))
      Hash.foreach(__v => __obj.updateDynamic("Hash")(__v.asInstanceOf[js.Any]))
      VolumeArn.foreach(__v => __obj.updateDynamic("VolumeArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScanFilePath]
    }
  }

  /** Contains information about criteria used to filter resources before triggering malware scan.
    */
  @js.native
  trait ScanResourceCriteria extends js.Object {
    var Exclude: js.UndefOr[ScanCriterion]
    var Include: js.UndefOr[ScanCriterion]
  }

  object ScanResourceCriteria {
    @inline
    def apply(
        Exclude: js.UndefOr[ScanCriterion] = js.undefined,
        Include: js.UndefOr[ScanCriterion] = js.undefined
    ): ScanResourceCriteria = {
      val __obj = js.Dynamic.literal()
      Exclude.foreach(__v => __obj.updateDynamic("Exclude")(__v.asInstanceOf[js.Any]))
      Include.foreach(__v => __obj.updateDynamic("Include")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScanResourceCriteria]
    }
  }

  /** Represents the result of the scan.
    */
  @js.native
  trait ScanResultDetails extends js.Object {
    var ScanResult: js.UndefOr[ScanResult]
  }

  object ScanResultDetails {
    @inline
    def apply(
        ScanResult: js.UndefOr[ScanResult] = js.undefined
    ): ScanResultDetails = {
      val __obj = js.Dynamic.literal()
      ScanResult.foreach(__v => __obj.updateDynamic("ScanResult")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScanResultDetails]
    }
  }

  /** Contains files infected with the given threat providing details of malware name and severity.
    */
  @js.native
  trait ScanThreatName extends js.Object {
    var FilePaths: js.UndefOr[FilePaths]
    var ItemCount: js.UndefOr[Int]
    var Name: js.UndefOr[String]
    var Severity: js.UndefOr[String]
  }

  object ScanThreatName {
    @inline
    def apply(
        FilePaths: js.UndefOr[FilePaths] = js.undefined,
        ItemCount: js.UndefOr[Int] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Severity: js.UndefOr[String] = js.undefined
    ): ScanThreatName = {
      val __obj = js.Dynamic.literal()
      FilePaths.foreach(__v => __obj.updateDynamic("FilePaths")(__v.asInstanceOf[js.Any]))
      ItemCount.foreach(__v => __obj.updateDynamic("ItemCount")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScanThreatName]
    }
  }

  /** Total number of scanned files.
    */
  @js.native
  trait ScannedItemCount extends js.Object {
    var Files: js.UndefOr[Int]
    var TotalGb: js.UndefOr[Int]
    var Volumes: js.UndefOr[Int]
  }

  object ScannedItemCount {
    @inline
    def apply(
        Files: js.UndefOr[Int] = js.undefined,
        TotalGb: js.UndefOr[Int] = js.undefined,
        Volumes: js.UndefOr[Int] = js.undefined
    ): ScannedItemCount = {
      val __obj = js.Dynamic.literal()
      Files.foreach(__v => __obj.updateDynamic("Files")(__v.asInstanceOf[js.Any]))
      TotalGb.foreach(__v => __obj.updateDynamic("TotalGb")(__v.asInstanceOf[js.Any]))
      Volumes.foreach(__v => __obj.updateDynamic("Volumes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScannedItemCount]
    }
  }

  /** Container security context.
    */
  @js.native
  trait SecurityContext extends js.Object {
    var Privileged: js.UndefOr[Boolean]
  }

  object SecurityContext {
    @inline
    def apply(
        Privileged: js.UndefOr[Boolean] = js.undefined
    ): SecurityContext = {
      val __obj = js.Dynamic.literal()
      Privileged.foreach(__v => __obj.updateDynamic("Privileged")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityContext]
    }
  }

  /** Contains information about the security groups associated with the EC2 instance.
    */
  @js.native
  trait SecurityGroup extends js.Object {
    var GroupId: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
  }

  object SecurityGroup {
    @inline
    def apply(
        GroupId: js.UndefOr[String] = js.undefined,
        GroupName: js.UndefOr[String] = js.undefined
    ): SecurityGroup = {
      val __obj = js.Dynamic.literal()
      GroupId.foreach(__v => __obj.updateDynamic("GroupId")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityGroup]
    }
  }

  /** Contains additional information about the generated finding.
    */
  @js.native
  trait Service extends js.Object {
    var Action: js.UndefOr[Action]
    var AdditionalInfo: js.UndefOr[ServiceAdditionalInfo]
    var Archived: js.UndefOr[Boolean]
    var Count: js.UndefOr[Int]
    var DetectorId: js.UndefOr[DetectorId]
    var EbsVolumeScanDetails: js.UndefOr[EbsVolumeScanDetails]
    var EventFirstSeen: js.UndefOr[String]
    var EventLastSeen: js.UndefOr[String]
    var Evidence: js.UndefOr[Evidence]
    var FeatureName: js.UndefOr[String]
    var ResourceRole: js.UndefOr[String]
    var ServiceName: js.UndefOr[String]
    var UserFeedback: js.UndefOr[String]
  }

  object Service {
    @inline
    def apply(
        Action: js.UndefOr[Action] = js.undefined,
        AdditionalInfo: js.UndefOr[ServiceAdditionalInfo] = js.undefined,
        Archived: js.UndefOr[Boolean] = js.undefined,
        Count: js.UndefOr[Int] = js.undefined,
        DetectorId: js.UndefOr[DetectorId] = js.undefined,
        EbsVolumeScanDetails: js.UndefOr[EbsVolumeScanDetails] = js.undefined,
        EventFirstSeen: js.UndefOr[String] = js.undefined,
        EventLastSeen: js.UndefOr[String] = js.undefined,
        Evidence: js.UndefOr[Evidence] = js.undefined,
        FeatureName: js.UndefOr[String] = js.undefined,
        ResourceRole: js.UndefOr[String] = js.undefined,
        ServiceName: js.UndefOr[String] = js.undefined,
        UserFeedback: js.UndefOr[String] = js.undefined
    ): Service = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      AdditionalInfo.foreach(__v => __obj.updateDynamic("AdditionalInfo")(__v.asInstanceOf[js.Any]))
      Archived.foreach(__v => __obj.updateDynamic("Archived")(__v.asInstanceOf[js.Any]))
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      DetectorId.foreach(__v => __obj.updateDynamic("DetectorId")(__v.asInstanceOf[js.Any]))
      EbsVolumeScanDetails.foreach(__v => __obj.updateDynamic("EbsVolumeScanDetails")(__v.asInstanceOf[js.Any]))
      EventFirstSeen.foreach(__v => __obj.updateDynamic("EventFirstSeen")(__v.asInstanceOf[js.Any]))
      EventLastSeen.foreach(__v => __obj.updateDynamic("EventLastSeen")(__v.asInstanceOf[js.Any]))
      Evidence.foreach(__v => __obj.updateDynamic("Evidence")(__v.asInstanceOf[js.Any]))
      FeatureName.foreach(__v => __obj.updateDynamic("FeatureName")(__v.asInstanceOf[js.Any]))
      ResourceRole.foreach(__v => __obj.updateDynamic("ResourceRole")(__v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.updateDynamic("ServiceName")(__v.asInstanceOf[js.Any]))
      UserFeedback.foreach(__v => __obj.updateDynamic("UserFeedback")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Service]
    }
  }

  /** Additional information about the generated finding.
    */
  @js.native
  trait ServiceAdditionalInfo extends js.Object {
    var Type: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object ServiceAdditionalInfo {
    @inline
    def apply(
        Type: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): ServiceAdditionalInfo = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceAdditionalInfo]
    }
  }

  /** Contains information about the criteria used for sorting findings.
    */
  @js.native
  trait SortCriteria extends js.Object {
    var AttributeName: js.UndefOr[String]
    var OrderBy: js.UndefOr[OrderBy]
  }

  object SortCriteria {
    @inline
    def apply(
        AttributeName: js.UndefOr[String] = js.undefined,
        OrderBy: js.UndefOr[OrderBy] = js.undefined
    ): SortCriteria = {
      val __obj = js.Dynamic.literal()
      AttributeName.foreach(__v => __obj.updateDynamic("AttributeName")(__v.asInstanceOf[js.Any]))
      OrderBy.foreach(__v => __obj.updateDynamic("OrderBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SortCriteria]
    }
  }

  @js.native
  trait StartMonitoringMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: DetectorId
  }

  object StartMonitoringMembersRequest {
    @inline
    def apply(
        AccountIds: AccountIds,
        DetectorId: DetectorId
    ): StartMonitoringMembersRequest = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartMonitoringMembersRequest]
    }
  }

  @js.native
  trait StartMonitoringMembersResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  object StartMonitoringMembersResponse {
    @inline
    def apply(
        UnprocessedAccounts: UnprocessedAccounts
    ): StartMonitoringMembersResponse = {
      val __obj = js.Dynamic.literal(
        "UnprocessedAccounts" -> UnprocessedAccounts.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartMonitoringMembersResponse]
    }
  }

  @js.native
  trait StopMonitoringMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: DetectorId
  }

  object StopMonitoringMembersRequest {
    @inline
    def apply(
        AccountIds: AccountIds,
        DetectorId: DetectorId
    ): StopMonitoringMembersRequest = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopMonitoringMembersRequest]
    }
  }

  @js.native
  trait StopMonitoringMembersResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  object StopMonitoringMembersResponse {
    @inline
    def apply(
        UnprocessedAccounts: UnprocessedAccounts
    ): StopMonitoringMembersResponse = {
      val __obj = js.Dynamic.literal(
        "UnprocessedAccounts" -> UnprocessedAccounts.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopMonitoringMembersResponse]
    }
  }

  /** Contains information about a tag associated with the EC2 instance.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: GuardDutyArn
    var Tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: GuardDutyArn,
        Tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** Contains details about identified threats organized by threat name.
    */
  @js.native
  trait ThreatDetectedByName extends js.Object {
    var ItemCount: js.UndefOr[Int]
    var Shortened: js.UndefOr[Boolean]
    var ThreatNames: js.UndefOr[ScanThreatNames]
    var UniqueThreatNameCount: js.UndefOr[Int]
  }

  object ThreatDetectedByName {
    @inline
    def apply(
        ItemCount: js.UndefOr[Int] = js.undefined,
        Shortened: js.UndefOr[Boolean] = js.undefined,
        ThreatNames: js.UndefOr[ScanThreatNames] = js.undefined,
        UniqueThreatNameCount: js.UndefOr[Int] = js.undefined
    ): ThreatDetectedByName = {
      val __obj = js.Dynamic.literal()
      ItemCount.foreach(__v => __obj.updateDynamic("ItemCount")(__v.asInstanceOf[js.Any]))
      Shortened.foreach(__v => __obj.updateDynamic("Shortened")(__v.asInstanceOf[js.Any]))
      ThreatNames.foreach(__v => __obj.updateDynamic("ThreatNames")(__v.asInstanceOf[js.Any]))
      UniqueThreatNameCount.foreach(__v => __obj.updateDynamic("UniqueThreatNameCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThreatDetectedByName]
    }
  }

  /** An instance of a threat intelligence detail that constitutes evidence for the finding.
    */
  @js.native
  trait ThreatIntelligenceDetail extends js.Object {
    var ThreatListName: js.UndefOr[String]
    var ThreatNames: js.UndefOr[ThreatNames]
  }

  object ThreatIntelligenceDetail {
    @inline
    def apply(
        ThreatListName: js.UndefOr[String] = js.undefined,
        ThreatNames: js.UndefOr[ThreatNames] = js.undefined
    ): ThreatIntelligenceDetail = {
      val __obj = js.Dynamic.literal()
      ThreatListName.foreach(__v => __obj.updateDynamic("ThreatListName")(__v.asInstanceOf[js.Any]))
      ThreatNames.foreach(__v => __obj.updateDynamic("ThreatNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThreatIntelligenceDetail]
    }
  }

  /** Contains total number of infected files.
    */
  @js.native
  trait ThreatsDetectedItemCount extends js.Object {
    var Files: js.UndefOr[Int]
  }

  object ThreatsDetectedItemCount {
    @inline
    def apply(
        Files: js.UndefOr[Int] = js.undefined
    ): ThreatsDetectedItemCount = {
      val __obj = js.Dynamic.literal()
      Files.foreach(__v => __obj.updateDynamic("Files")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThreatsDetectedItemCount]
    }
  }

  /** Contains the total usage with the corresponding currency unit for that value.
    */
  @js.native
  trait Total extends js.Object {
    var Amount: js.UndefOr[String]
    var Unit: js.UndefOr[String]
  }

  object Total {
    @inline
    def apply(
        Amount: js.UndefOr[String] = js.undefined,
        Unit: js.UndefOr[String] = js.undefined
    ): Total = {
      val __obj = js.Dynamic.literal()
      Amount.foreach(__v => __obj.updateDynamic("Amount")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Total]
    }
  }

  /** Represents the reason the scan was triggered.
    */
  @js.native
  trait TriggerDetails extends js.Object {
    var Description: js.UndefOr[NonEmptyString]
    var GuardDutyFindingId: js.UndefOr[NonEmptyString]
  }

  object TriggerDetails {
    @inline
    def apply(
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        GuardDutyFindingId: js.UndefOr[NonEmptyString] = js.undefined
    ): TriggerDetails = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      GuardDutyFindingId.foreach(__v => __obj.updateDynamic("GuardDutyFindingId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TriggerDetails]
    }
  }

  @js.native
  trait UnarchiveFindingsRequest extends js.Object {
    var DetectorId: DetectorId
    var FindingIds: FindingIds
  }

  object UnarchiveFindingsRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        FindingIds: FindingIds
    ): UnarchiveFindingsRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FindingIds" -> FindingIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UnarchiveFindingsRequest]
    }
  }

  @js.native
  trait UnarchiveFindingsResponse extends js.Object

  object UnarchiveFindingsResponse {
    @inline
    def apply(): UnarchiveFindingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnarchiveFindingsResponse]
    }
  }

  /** Contains information about the accounts that weren't processed.
    */
  @js.native
  trait UnprocessedAccount extends js.Object {
    var AccountId: AccountId
    var Result: String
  }

  object UnprocessedAccount {
    @inline
    def apply(
        AccountId: AccountId,
        Result: String
    ): UnprocessedAccount = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Result" -> Result.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UnprocessedAccount]
    }
  }

  /** Specifies the names of the data sources that couldn't be enabled.
    */
  @js.native
  trait UnprocessedDataSourcesResult extends js.Object {
    var MalwareProtection: js.UndefOr[MalwareProtectionConfigurationResult]
  }

  object UnprocessedDataSourcesResult {
    @inline
    def apply(
        MalwareProtection: js.UndefOr[MalwareProtectionConfigurationResult] = js.undefined
    ): UnprocessedDataSourcesResult = {
      val __obj = js.Dynamic.literal()
      MalwareProtection.foreach(__v => __obj.updateDynamic("MalwareProtection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnprocessedDataSourcesResult]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: GuardDutyArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: GuardDutyArn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateDetectorRequest extends js.Object {
    var DetectorId: DetectorId
    var DataSources: js.UndefOr[DataSourceConfigurations]
    var Enable: js.UndefOr[Boolean]
    var FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency]
  }

  object UpdateDetectorRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        DataSources: js.UndefOr[DataSourceConfigurations] = js.undefined,
        Enable: js.UndefOr[Boolean] = js.undefined,
        FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined
    ): UpdateDetectorRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      DataSources.foreach(__v => __obj.updateDynamic("DataSources")(__v.asInstanceOf[js.Any]))
      Enable.foreach(__v => __obj.updateDynamic("Enable")(__v.asInstanceOf[js.Any]))
      FindingPublishingFrequency.foreach(__v => __obj.updateDynamic("FindingPublishingFrequency")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDetectorRequest]
    }
  }

  @js.native
  trait UpdateDetectorResponse extends js.Object

  object UpdateDetectorResponse {
    @inline
    def apply(): UpdateDetectorResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDetectorResponse]
    }
  }

  @js.native
  trait UpdateFilterRequest extends js.Object {
    var DetectorId: DetectorId
    var FilterName: String
    var Action: js.UndefOr[FilterAction]
    var Description: js.UndefOr[FilterDescription]
    var FindingCriteria: js.UndefOr[FindingCriteria]
    var Rank: js.UndefOr[FilterRank]
  }

  object UpdateFilterRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        FilterName: String,
        Action: js.UndefOr[FilterAction] = js.undefined,
        Description: js.UndefOr[FilterDescription] = js.undefined,
        FindingCriteria: js.UndefOr[FindingCriteria] = js.undefined,
        Rank: js.UndefOr[FilterRank] = js.undefined
    ): UpdateFilterRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FilterName" -> FilterName.asInstanceOf[js.Any]
      )

      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FindingCriteria.foreach(__v => __obj.updateDynamic("FindingCriteria")(__v.asInstanceOf[js.Any]))
      Rank.foreach(__v => __obj.updateDynamic("Rank")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFilterRequest]
    }
  }

  @js.native
  trait UpdateFilterResponse extends js.Object {
    var Name: FilterName
  }

  object UpdateFilterResponse {
    @inline
    def apply(
        Name: FilterName
    ): UpdateFilterResponse = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateFilterResponse]
    }
  }

  @js.native
  trait UpdateFindingsFeedbackRequest extends js.Object {
    var DetectorId: DetectorId
    var Feedback: Feedback
    var FindingIds: FindingIds
    var Comments: js.UndefOr[String]
  }

  object UpdateFindingsFeedbackRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        Feedback: Feedback,
        FindingIds: FindingIds,
        Comments: js.UndefOr[String] = js.undefined
    ): UpdateFindingsFeedbackRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "Feedback" -> Feedback.asInstanceOf[js.Any],
        "FindingIds" -> FindingIds.asInstanceOf[js.Any]
      )

      Comments.foreach(__v => __obj.updateDynamic("Comments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFindingsFeedbackRequest]
    }
  }

  @js.native
  trait UpdateFindingsFeedbackResponse extends js.Object

  object UpdateFindingsFeedbackResponse {
    @inline
    def apply(): UpdateFindingsFeedbackResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateFindingsFeedbackResponse]
    }
  }

  @js.native
  trait UpdateIPSetRequest extends js.Object {
    var DetectorId: DetectorId
    var IpSetId: String
    var Activate: js.UndefOr[Boolean]
    var Location: js.UndefOr[Location]
    var Name: js.UndefOr[Name]
  }

  object UpdateIPSetRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        IpSetId: String,
        Activate: js.UndefOr[Boolean] = js.undefined,
        Location: js.UndefOr[Location] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined
    ): UpdateIPSetRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "IpSetId" -> IpSetId.asInstanceOf[js.Any]
      )

      Activate.foreach(__v => __obj.updateDynamic("Activate")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIPSetRequest]
    }
  }

  @js.native
  trait UpdateIPSetResponse extends js.Object

  object UpdateIPSetResponse {
    @inline
    def apply(): UpdateIPSetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateIPSetResponse]
    }
  }

  @js.native
  trait UpdateMalwareScanSettingsRequest extends js.Object {
    var DetectorId: DetectorId
    var EbsSnapshotPreservation: js.UndefOr[EbsSnapshotPreservation]
    var ScanResourceCriteria: js.UndefOr[ScanResourceCriteria]
  }

  object UpdateMalwareScanSettingsRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        EbsSnapshotPreservation: js.UndefOr[EbsSnapshotPreservation] = js.undefined,
        ScanResourceCriteria: js.UndefOr[ScanResourceCriteria] = js.undefined
    ): UpdateMalwareScanSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      EbsSnapshotPreservation.foreach(__v => __obj.updateDynamic("EbsSnapshotPreservation")(__v.asInstanceOf[js.Any]))
      ScanResourceCriteria.foreach(__v => __obj.updateDynamic("ScanResourceCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMalwareScanSettingsRequest]
    }
  }

  @js.native
  trait UpdateMalwareScanSettingsResponse extends js.Object

  object UpdateMalwareScanSettingsResponse {
    @inline
    def apply(): UpdateMalwareScanSettingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateMalwareScanSettingsResponse]
    }
  }

  @js.native
  trait UpdateMemberDetectorsRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: DetectorId
    var DataSources: js.UndefOr[DataSourceConfigurations]
  }

  object UpdateMemberDetectorsRequest {
    @inline
    def apply(
        AccountIds: AccountIds,
        DetectorId: DetectorId,
        DataSources: js.UndefOr[DataSourceConfigurations] = js.undefined
    ): UpdateMemberDetectorsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      DataSources.foreach(__v => __obj.updateDynamic("DataSources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMemberDetectorsRequest]
    }
  }

  @js.native
  trait UpdateMemberDetectorsResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  object UpdateMemberDetectorsResponse {
    @inline
    def apply(
        UnprocessedAccounts: UnprocessedAccounts
    ): UpdateMemberDetectorsResponse = {
      val __obj = js.Dynamic.literal(
        "UnprocessedAccounts" -> UnprocessedAccounts.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateMemberDetectorsResponse]
    }
  }

  @js.native
  trait UpdateOrganizationConfigurationRequest extends js.Object {
    var AutoEnable: Boolean
    var DetectorId: DetectorId
    var DataSources: js.UndefOr[OrganizationDataSourceConfigurations]
  }

  object UpdateOrganizationConfigurationRequest {
    @inline
    def apply(
        AutoEnable: Boolean,
        DetectorId: DetectorId,
        DataSources: js.UndefOr[OrganizationDataSourceConfigurations] = js.undefined
    ): UpdateOrganizationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "AutoEnable" -> AutoEnable.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      DataSources.foreach(__v => __obj.updateDynamic("DataSources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateOrganizationConfigurationRequest]
    }
  }

  @js.native
  trait UpdateOrganizationConfigurationResponse extends js.Object

  object UpdateOrganizationConfigurationResponse {
    @inline
    def apply(): UpdateOrganizationConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateOrganizationConfigurationResponse]
    }
  }

  @js.native
  trait UpdatePublishingDestinationRequest extends js.Object {
    var DestinationId: String
    var DetectorId: DetectorId
    var DestinationProperties: js.UndefOr[DestinationProperties]
  }

  object UpdatePublishingDestinationRequest {
    @inline
    def apply(
        DestinationId: String,
        DetectorId: DetectorId,
        DestinationProperties: js.UndefOr[DestinationProperties] = js.undefined
    ): UpdatePublishingDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "DestinationId" -> DestinationId.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      DestinationProperties.foreach(__v => __obj.updateDynamic("DestinationProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePublishingDestinationRequest]
    }
  }

  @js.native
  trait UpdatePublishingDestinationResponse extends js.Object

  object UpdatePublishingDestinationResponse {
    @inline
    def apply(): UpdatePublishingDestinationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdatePublishingDestinationResponse]
    }
  }

  @js.native
  trait UpdateThreatIntelSetRequest extends js.Object {
    var DetectorId: DetectorId
    var ThreatIntelSetId: String
    var Activate: js.UndefOr[Boolean]
    var Location: js.UndefOr[Location]
    var Name: js.UndefOr[Name]
  }

  object UpdateThreatIntelSetRequest {
    @inline
    def apply(
        DetectorId: DetectorId,
        ThreatIntelSetId: String,
        Activate: js.UndefOr[Boolean] = js.undefined,
        Location: js.UndefOr[Location] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined
    ): UpdateThreatIntelSetRequest = {
      val __obj = js.Dynamic.literal(
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "ThreatIntelSetId" -> ThreatIntelSetId.asInstanceOf[js.Any]
      )

      Activate.foreach(__v => __obj.updateDynamic("Activate")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateThreatIntelSetRequest]
    }
  }

  @js.native
  trait UpdateThreatIntelSetResponse extends js.Object

  object UpdateThreatIntelSetResponse {
    @inline
    def apply(): UpdateThreatIntelSetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateThreatIntelSetResponse]
    }
  }

  /** Contains information on the total of usage based on account IDs.
    */
  @js.native
  trait UsageAccountResult extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var Total: js.UndefOr[Total]
  }

  object UsageAccountResult {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        Total: js.UndefOr[Total] = js.undefined
    ): UsageAccountResult = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.updateDynamic("Total")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageAccountResult]
    }
  }

  /** Contains information about the criteria used to query usage statistics.
    */
  @js.native
  trait UsageCriteria extends js.Object {
    var DataSources: DataSourceList
    var AccountIds: js.UndefOr[AccountIds]
    var Resources: js.UndefOr[ResourceList]
  }

  object UsageCriteria {
    @inline
    def apply(
        DataSources: DataSourceList,
        AccountIds: js.UndefOr[AccountIds] = js.undefined,
        Resources: js.UndefOr[ResourceList] = js.undefined
    ): UsageCriteria = {
      val __obj = js.Dynamic.literal(
        "DataSources" -> DataSources.asInstanceOf[js.Any]
      )

      AccountIds.foreach(__v => __obj.updateDynamic("AccountIds")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageCriteria]
    }
  }

  /** Contains information on the result of usage based on data source type.
    */
  @js.native
  trait UsageDataSourceResult extends js.Object {
    var DataSource: js.UndefOr[DataSource]
    var Total: js.UndefOr[Total]
  }

  object UsageDataSourceResult {
    @inline
    def apply(
        DataSource: js.UndefOr[DataSource] = js.undefined,
        Total: js.UndefOr[Total] = js.undefined
    ): UsageDataSourceResult = {
      val __obj = js.Dynamic.literal()
      DataSource.foreach(__v => __obj.updateDynamic("DataSource")(__v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.updateDynamic("Total")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageDataSourceResult]
    }
  }

  /** Contains information on the sum of usage based on an Amazon Web Services resource.
    */
  @js.native
  trait UsageResourceResult extends js.Object {
    var Resource: js.UndefOr[String]
    var Total: js.UndefOr[Total]
  }

  object UsageResourceResult {
    @inline
    def apply(
        Resource: js.UndefOr[String] = js.undefined,
        Total: js.UndefOr[Total] = js.undefined
    ): UsageResourceResult = {
      val __obj = js.Dynamic.literal()
      Resource.foreach(__v => __obj.updateDynamic("Resource")(__v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.updateDynamic("Total")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageResourceResult]
    }
  }

  /** Contains the result of GuardDuty usage. If a UsageStatisticType is provided the result for other types will be null.
    */
  @js.native
  trait UsageStatistics extends js.Object {
    var SumByAccount: js.UndefOr[UsageAccountResultList]
    var SumByDataSource: js.UndefOr[UsageDataSourceResultList]
    var SumByResource: js.UndefOr[UsageResourceResultList]
    var TopResources: js.UndefOr[UsageResourceResultList]
  }

  object UsageStatistics {
    @inline
    def apply(
        SumByAccount: js.UndefOr[UsageAccountResultList] = js.undefined,
        SumByDataSource: js.UndefOr[UsageDataSourceResultList] = js.undefined,
        SumByResource: js.UndefOr[UsageResourceResultList] = js.undefined,
        TopResources: js.UndefOr[UsageResourceResultList] = js.undefined
    ): UsageStatistics = {
      val __obj = js.Dynamic.literal()
      SumByAccount.foreach(__v => __obj.updateDynamic("SumByAccount")(__v.asInstanceOf[js.Any]))
      SumByDataSource.foreach(__v => __obj.updateDynamic("SumByDataSource")(__v.asInstanceOf[js.Any]))
      SumByResource.foreach(__v => __obj.updateDynamic("SumByResource")(__v.asInstanceOf[js.Any]))
      TopResources.foreach(__v => __obj.updateDynamic("TopResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageStatistics]
    }
  }

  /** Volume used by the Kubernetes workload.
    */
  @js.native
  trait Volume extends js.Object {
    var HostPath: js.UndefOr[HostPath]
    var Name: js.UndefOr[String]
  }

  object Volume {
    @inline
    def apply(
        HostPath: js.UndefOr[HostPath] = js.undefined,
        Name: js.UndefOr[String] = js.undefined
    ): Volume = {
      val __obj = js.Dynamic.literal()
      HostPath.foreach(__v => __obj.updateDynamic("HostPath")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Volume]
    }
  }

  /** Contains EBS volume details.
    */
  @js.native
  trait VolumeDetail extends js.Object {
    var DeviceName: js.UndefOr[String]
    var EncryptionType: js.UndefOr[String]
    var KmsKeyArn: js.UndefOr[String]
    var SnapshotArn: js.UndefOr[String]
    var VolumeArn: js.UndefOr[String]
    var VolumeSizeInGB: js.UndefOr[Int]
    var VolumeType: js.UndefOr[String]
  }

  object VolumeDetail {
    @inline
    def apply(
        DeviceName: js.UndefOr[String] = js.undefined,
        EncryptionType: js.UndefOr[String] = js.undefined,
        KmsKeyArn: js.UndefOr[String] = js.undefined,
        SnapshotArn: js.UndefOr[String] = js.undefined,
        VolumeArn: js.UndefOr[String] = js.undefined,
        VolumeSizeInGB: js.UndefOr[Int] = js.undefined,
        VolumeType: js.UndefOr[String] = js.undefined
    ): VolumeDetail = {
      val __obj = js.Dynamic.literal()
      DeviceName.foreach(__v => __obj.updateDynamic("DeviceName")(__v.asInstanceOf[js.Any]))
      EncryptionType.foreach(__v => __obj.updateDynamic("EncryptionType")(__v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      SnapshotArn.foreach(__v => __obj.updateDynamic("SnapshotArn")(__v.asInstanceOf[js.Any]))
      VolumeArn.foreach(__v => __obj.updateDynamic("VolumeArn")(__v.asInstanceOf[js.Any]))
      VolumeSizeInGB.foreach(__v => __obj.updateDynamic("VolumeSizeInGB")(__v.asInstanceOf[js.Any]))
      VolumeType.foreach(__v => __obj.updateDynamic("VolumeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VolumeDetail]
    }
  }

  /** Container volume mount.
    */
  @js.native
  trait VolumeMount extends js.Object {
    var MountPath: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object VolumeMount {
    @inline
    def apply(
        MountPath: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined
    ): VolumeMount = {
      val __obj = js.Dynamic.literal()
      MountPath.foreach(__v => __obj.updateDynamic("MountPath")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VolumeMount]
    }
  }
}
