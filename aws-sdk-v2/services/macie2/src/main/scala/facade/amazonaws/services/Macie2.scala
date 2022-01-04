package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object macie2 {
  type BucketCriteria = js.Dictionary[BucketCriteriaAdditionalProperties]
  type Cells = js.Array[Cell]
  type Criterion = js.Dictionary[CriterionAdditionalProperties]
  type CustomDetections = js.Array[CustomDetection]
  type DefaultDetections = js.Array[DefaultDetection]
  type KeyValuePairList = js.Array[KeyValuePair]
  type MaxResults = Int
  type Pages = js.Array[Page]
  type Ranges = js.Array[Range]
  type Records = js.Array[Record]
  type SensitiveData = js.Array[SensitiveDataItem]
  type SeverityLevelList = js.Array[SeverityLevel]
  type TagMap = js.Dictionary[__string]
  type __boolean = Boolean
  type __double = Double
  type __integer = Int
  type __listOfAdminAccount = js.Array[AdminAccount]
  type __listOfBatchGetCustomDataIdentifierSummary = js.Array[BatchGetCustomDataIdentifierSummary]
  type __listOfBucketMetadata = js.Array[BucketMetadata]
  type __listOfCriteriaForJob = js.Array[CriteriaForJob]
  type __listOfCustomDataIdentifierSummary = js.Array[CustomDataIdentifierSummary]
  type __listOfFinding = js.Array[Finding]
  type __listOfFindingType = js.Array[FindingType]
  type __listOfFindingsFilterListItem = js.Array[FindingsFilterListItem]
  type __listOfGroupCount = js.Array[GroupCount]
  type __listOfInvitation = js.Array[Invitation]
  type __listOfJobScopeTerm = js.Array[JobScopeTerm]
  type __listOfJobSummary = js.Array[JobSummary]
  type __listOfKeyValuePair = js.Array[KeyValuePair]
  type __listOfListJobsFilterTerm = js.Array[ListJobsFilterTerm]
  type __listOfManagedDataIdentifierSummary = js.Array[ManagedDataIdentifierSummary]
  type __listOfMatchingResource = js.Array[MatchingResource]
  type __listOfMember = js.Array[Member]
  type __listOfS3BucketDefinitionForJob = js.Array[S3BucketDefinitionForJob]
  type __listOfSearchResourcesCriteria = js.Array[SearchResourcesCriteria]
  type __listOfSearchResourcesTagCriterionPair = js.Array[SearchResourcesTagCriterionPair]
  type __listOfTagCriterionPairForJob = js.Array[TagCriterionPairForJob]
  type __listOfTagValuePair = js.Array[TagValuePair]
  type __listOfUnprocessedAccount = js.Array[UnprocessedAccount]
  type __listOfUsageByAccount = js.Array[UsageByAccount]
  type __listOfUsageRecord = js.Array[UsageRecord]
  type __listOfUsageStatisticsFilter = js.Array[UsageStatisticsFilter]
  type __listOfUsageTotal = js.Array[UsageTotal]
  type __listOf__string = js.Array[__string]
  type __long = Double
  type __string = String
  type __timestampIso8601 = js.Date

  final class Macie2Ops(private val service: Macie2) extends AnyVal {

    @inline def acceptInvitationFuture(params: AcceptInvitationRequest): Future[AcceptInvitationResponse] = service.acceptInvitation(params).promise().toFuture
    @inline def batchGetCustomDataIdentifiersFuture(params: BatchGetCustomDataIdentifiersRequest): Future[BatchGetCustomDataIdentifiersResponse] = service.batchGetCustomDataIdentifiers(params).promise().toFuture
    @inline def createClassificationJobFuture(params: CreateClassificationJobRequest): Future[CreateClassificationJobResponse] = service.createClassificationJob(params).promise().toFuture
    @inline def createCustomDataIdentifierFuture(params: CreateCustomDataIdentifierRequest): Future[CreateCustomDataIdentifierResponse] = service.createCustomDataIdentifier(params).promise().toFuture
    @inline def createFindingsFilterFuture(params: CreateFindingsFilterRequest): Future[CreateFindingsFilterResponse] = service.createFindingsFilter(params).promise().toFuture
    @inline def createInvitationsFuture(params: CreateInvitationsRequest): Future[CreateInvitationsResponse] = service.createInvitations(params).promise().toFuture
    @inline def createMemberFuture(params: CreateMemberRequest): Future[CreateMemberResponse] = service.createMember(params).promise().toFuture
    @inline def createSampleFindingsFuture(params: CreateSampleFindingsRequest): Future[CreateSampleFindingsResponse] = service.createSampleFindings(params).promise().toFuture
    @inline def declineInvitationsFuture(params: DeclineInvitationsRequest): Future[DeclineInvitationsResponse] = service.declineInvitations(params).promise().toFuture
    @inline def deleteCustomDataIdentifierFuture(params: DeleteCustomDataIdentifierRequest): Future[DeleteCustomDataIdentifierResponse] = service.deleteCustomDataIdentifier(params).promise().toFuture
    @inline def deleteFindingsFilterFuture(params: DeleteFindingsFilterRequest): Future[DeleteFindingsFilterResponse] = service.deleteFindingsFilter(params).promise().toFuture
    @inline def deleteInvitationsFuture(params: DeleteInvitationsRequest): Future[DeleteInvitationsResponse] = service.deleteInvitations(params).promise().toFuture
    @inline def deleteMemberFuture(params: DeleteMemberRequest): Future[DeleteMemberResponse] = service.deleteMember(params).promise().toFuture
    @inline def describeBucketsFuture(params: DescribeBucketsRequest): Future[DescribeBucketsResponse] = service.describeBuckets(params).promise().toFuture
    @inline def describeClassificationJobFuture(params: DescribeClassificationJobRequest): Future[DescribeClassificationJobResponse] = service.describeClassificationJob(params).promise().toFuture
    @inline def describeOrganizationConfigurationFuture(params: DescribeOrganizationConfigurationRequest): Future[DescribeOrganizationConfigurationResponse] = service.describeOrganizationConfiguration(params).promise().toFuture
    @inline def disableMacieFuture(params: DisableMacieRequest): Future[DisableMacieResponse] = service.disableMacie(params).promise().toFuture
    @inline def disableOrganizationAdminAccountFuture(params: DisableOrganizationAdminAccountRequest): Future[DisableOrganizationAdminAccountResponse] = service.disableOrganizationAdminAccount(params).promise().toFuture
    @inline def disassociateFromAdministratorAccountFuture(params: DisassociateFromAdministratorAccountRequest): Future[DisassociateFromAdministratorAccountResponse] = service.disassociateFromAdministratorAccount(params).promise().toFuture
    @inline def disassociateFromMasterAccountFuture(params: DisassociateFromMasterAccountRequest): Future[DisassociateFromMasterAccountResponse] = service.disassociateFromMasterAccount(params).promise().toFuture
    @inline def disassociateMemberFuture(params: DisassociateMemberRequest): Future[DisassociateMemberResponse] = service.disassociateMember(params).promise().toFuture
    @inline def enableMacieFuture(params: EnableMacieRequest): Future[EnableMacieResponse] = service.enableMacie(params).promise().toFuture
    @inline def enableOrganizationAdminAccountFuture(params: EnableOrganizationAdminAccountRequest): Future[EnableOrganizationAdminAccountResponse] = service.enableOrganizationAdminAccount(params).promise().toFuture
    @inline def getAdministratorAccountFuture(params: GetAdministratorAccountRequest): Future[GetAdministratorAccountResponse] = service.getAdministratorAccount(params).promise().toFuture
    @inline def getBucketStatisticsFuture(params: GetBucketStatisticsRequest): Future[GetBucketStatisticsResponse] = service.getBucketStatistics(params).promise().toFuture
    @inline def getClassificationExportConfigurationFuture(params: GetClassificationExportConfigurationRequest): Future[GetClassificationExportConfigurationResponse] = service.getClassificationExportConfiguration(params).promise().toFuture
    @inline def getCustomDataIdentifierFuture(params: GetCustomDataIdentifierRequest): Future[GetCustomDataIdentifierResponse] = service.getCustomDataIdentifier(params).promise().toFuture
    @inline def getFindingStatisticsFuture(params: GetFindingStatisticsRequest): Future[GetFindingStatisticsResponse] = service.getFindingStatistics(params).promise().toFuture
    @inline def getFindingsFilterFuture(params: GetFindingsFilterRequest): Future[GetFindingsFilterResponse] = service.getFindingsFilter(params).promise().toFuture
    @inline def getFindingsFuture(params: GetFindingsRequest): Future[GetFindingsResponse] = service.getFindings(params).promise().toFuture
    @inline def getFindingsPublicationConfigurationFuture(params: GetFindingsPublicationConfigurationRequest): Future[GetFindingsPublicationConfigurationResponse] = service.getFindingsPublicationConfiguration(params).promise().toFuture
    @inline def getInvitationsCountFuture(params: GetInvitationsCountRequest): Future[GetInvitationsCountResponse] = service.getInvitationsCount(params).promise().toFuture
    @inline def getMacieSessionFuture(params: GetMacieSessionRequest): Future[GetMacieSessionResponse] = service.getMacieSession(params).promise().toFuture
    @inline def getMasterAccountFuture(params: GetMasterAccountRequest): Future[GetMasterAccountResponse] = service.getMasterAccount(params).promise().toFuture
    @inline def getMemberFuture(params: GetMemberRequest): Future[GetMemberResponse] = service.getMember(params).promise().toFuture
    @inline def getUsageStatisticsFuture(params: GetUsageStatisticsRequest): Future[GetUsageStatisticsResponse] = service.getUsageStatistics(params).promise().toFuture
    @inline def getUsageTotalsFuture(params: GetUsageTotalsRequest): Future[GetUsageTotalsResponse] = service.getUsageTotals(params).promise().toFuture
    @inline def listClassificationJobsFuture(params: ListClassificationJobsRequest): Future[ListClassificationJobsResponse] = service.listClassificationJobs(params).promise().toFuture
    @inline def listCustomDataIdentifiersFuture(params: ListCustomDataIdentifiersRequest): Future[ListCustomDataIdentifiersResponse] = service.listCustomDataIdentifiers(params).promise().toFuture
    @inline def listFindingsFiltersFuture(params: ListFindingsFiltersRequest): Future[ListFindingsFiltersResponse] = service.listFindingsFilters(params).promise().toFuture
    @inline def listFindingsFuture(params: ListFindingsRequest): Future[ListFindingsResponse] = service.listFindings(params).promise().toFuture
    @inline def listInvitationsFuture(params: ListInvitationsRequest): Future[ListInvitationsResponse] = service.listInvitations(params).promise().toFuture
    @inline def listManagedDataIdentifiersFuture(params: ListManagedDataIdentifiersRequest): Future[ListManagedDataIdentifiersResponse] = service.listManagedDataIdentifiers(params).promise().toFuture
    @inline def listMembersFuture(params: ListMembersRequest): Future[ListMembersResponse] = service.listMembers(params).promise().toFuture
    @inline def listOrganizationAdminAccountsFuture(params: ListOrganizationAdminAccountsRequest): Future[ListOrganizationAdminAccountsResponse] = service.listOrganizationAdminAccounts(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putClassificationExportConfigurationFuture(params: PutClassificationExportConfigurationRequest): Future[PutClassificationExportConfigurationResponse] = service.putClassificationExportConfiguration(params).promise().toFuture
    @inline def putFindingsPublicationConfigurationFuture(params: PutFindingsPublicationConfigurationRequest): Future[PutFindingsPublicationConfigurationResponse] = service.putFindingsPublicationConfiguration(params).promise().toFuture
    @inline def searchResourcesFuture(params: SearchResourcesRequest): Future[SearchResourcesResponse] = service.searchResources(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def testCustomDataIdentifierFuture(params: TestCustomDataIdentifierRequest): Future[TestCustomDataIdentifierResponse] = service.testCustomDataIdentifier(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateClassificationJobFuture(params: UpdateClassificationJobRequest): Future[UpdateClassificationJobResponse] = service.updateClassificationJob(params).promise().toFuture
    @inline def updateFindingsFilterFuture(params: UpdateFindingsFilterRequest): Future[UpdateFindingsFilterResponse] = service.updateFindingsFilter(params).promise().toFuture
    @inline def updateMacieSessionFuture(params: UpdateMacieSessionRequest): Future[UpdateMacieSessionResponse] = service.updateMacieSession(params).promise().toFuture
    @inline def updateMemberSessionFuture(params: UpdateMemberSessionRequest): Future[UpdateMemberSessionResponse] = service.updateMemberSession(params).promise().toFuture
    @inline def updateOrganizationConfigurationFuture(params: UpdateOrganizationConfigurationRequest): Future[UpdateOrganizationConfigurationResponse] = service.updateOrganizationConfiguration(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/macie2", JSImport.Namespace, "AWS.Macie2")
  class Macie2() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptInvitation(params: AcceptInvitationRequest): Request[AcceptInvitationResponse] = js.native
    def batchGetCustomDataIdentifiers(params: BatchGetCustomDataIdentifiersRequest): Request[BatchGetCustomDataIdentifiersResponse] = js.native
    def createClassificationJob(params: CreateClassificationJobRequest): Request[CreateClassificationJobResponse] = js.native
    def createCustomDataIdentifier(params: CreateCustomDataIdentifierRequest): Request[CreateCustomDataIdentifierResponse] = js.native
    def createFindingsFilter(params: CreateFindingsFilterRequest): Request[CreateFindingsFilterResponse] = js.native
    def createInvitations(params: CreateInvitationsRequest): Request[CreateInvitationsResponse] = js.native
    def createMember(params: CreateMemberRequest): Request[CreateMemberResponse] = js.native
    def createSampleFindings(params: CreateSampleFindingsRequest): Request[CreateSampleFindingsResponse] = js.native
    def declineInvitations(params: DeclineInvitationsRequest): Request[DeclineInvitationsResponse] = js.native
    def deleteCustomDataIdentifier(params: DeleteCustomDataIdentifierRequest): Request[DeleteCustomDataIdentifierResponse] = js.native
    def deleteFindingsFilter(params: DeleteFindingsFilterRequest): Request[DeleteFindingsFilterResponse] = js.native
    def deleteInvitations(params: DeleteInvitationsRequest): Request[DeleteInvitationsResponse] = js.native
    def deleteMember(params: DeleteMemberRequest): Request[DeleteMemberResponse] = js.native
    def describeBuckets(params: DescribeBucketsRequest): Request[DescribeBucketsResponse] = js.native
    def describeClassificationJob(params: DescribeClassificationJobRequest): Request[DescribeClassificationJobResponse] = js.native
    def describeOrganizationConfiguration(params: DescribeOrganizationConfigurationRequest): Request[DescribeOrganizationConfigurationResponse] = js.native
    def disableMacie(params: DisableMacieRequest): Request[DisableMacieResponse] = js.native
    def disableOrganizationAdminAccount(params: DisableOrganizationAdminAccountRequest): Request[DisableOrganizationAdminAccountResponse] = js.native
    def disassociateFromAdministratorAccount(params: DisassociateFromAdministratorAccountRequest): Request[DisassociateFromAdministratorAccountResponse] = js.native
    def disassociateFromMasterAccount(params: DisassociateFromMasterAccountRequest): Request[DisassociateFromMasterAccountResponse] = js.native
    def disassociateMember(params: DisassociateMemberRequest): Request[DisassociateMemberResponse] = js.native
    def enableMacie(params: EnableMacieRequest): Request[EnableMacieResponse] = js.native
    def enableOrganizationAdminAccount(params: EnableOrganizationAdminAccountRequest): Request[EnableOrganizationAdminAccountResponse] = js.native
    def getAdministratorAccount(params: GetAdministratorAccountRequest): Request[GetAdministratorAccountResponse] = js.native
    def getBucketStatistics(params: GetBucketStatisticsRequest): Request[GetBucketStatisticsResponse] = js.native
    def getClassificationExportConfiguration(params: GetClassificationExportConfigurationRequest): Request[GetClassificationExportConfigurationResponse] = js.native
    def getCustomDataIdentifier(params: GetCustomDataIdentifierRequest): Request[GetCustomDataIdentifierResponse] = js.native
    def getFindingStatistics(params: GetFindingStatisticsRequest): Request[GetFindingStatisticsResponse] = js.native
    def getFindings(params: GetFindingsRequest): Request[GetFindingsResponse] = js.native
    def getFindingsFilter(params: GetFindingsFilterRequest): Request[GetFindingsFilterResponse] = js.native
    def getFindingsPublicationConfiguration(params: GetFindingsPublicationConfigurationRequest): Request[GetFindingsPublicationConfigurationResponse] = js.native
    def getInvitationsCount(params: GetInvitationsCountRequest): Request[GetInvitationsCountResponse] = js.native
    def getMacieSession(params: GetMacieSessionRequest): Request[GetMacieSessionResponse] = js.native
    def getMasterAccount(params: GetMasterAccountRequest): Request[GetMasterAccountResponse] = js.native
    def getMember(params: GetMemberRequest): Request[GetMemberResponse] = js.native
    def getUsageStatistics(params: GetUsageStatisticsRequest): Request[GetUsageStatisticsResponse] = js.native
    def getUsageTotals(params: GetUsageTotalsRequest): Request[GetUsageTotalsResponse] = js.native
    def listClassificationJobs(params: ListClassificationJobsRequest): Request[ListClassificationJobsResponse] = js.native
    def listCustomDataIdentifiers(params: ListCustomDataIdentifiersRequest): Request[ListCustomDataIdentifiersResponse] = js.native
    def listFindings(params: ListFindingsRequest): Request[ListFindingsResponse] = js.native
    def listFindingsFilters(params: ListFindingsFiltersRequest): Request[ListFindingsFiltersResponse] = js.native
    def listInvitations(params: ListInvitationsRequest): Request[ListInvitationsResponse] = js.native
    def listManagedDataIdentifiers(params: ListManagedDataIdentifiersRequest): Request[ListManagedDataIdentifiersResponse] = js.native
    def listMembers(params: ListMembersRequest): Request[ListMembersResponse] = js.native
    def listOrganizationAdminAccounts(params: ListOrganizationAdminAccountsRequest): Request[ListOrganizationAdminAccountsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putClassificationExportConfiguration(params: PutClassificationExportConfigurationRequest): Request[PutClassificationExportConfigurationResponse] = js.native
    def putFindingsPublicationConfiguration(params: PutFindingsPublicationConfigurationRequest): Request[PutFindingsPublicationConfigurationResponse] = js.native
    def searchResources(params: SearchResourcesRequest): Request[SearchResourcesResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def testCustomDataIdentifier(params: TestCustomDataIdentifierRequest): Request[TestCustomDataIdentifierResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateClassificationJob(params: UpdateClassificationJobRequest): Request[UpdateClassificationJobResponse] = js.native
    def updateFindingsFilter(params: UpdateFindingsFilterRequest): Request[UpdateFindingsFilterResponse] = js.native
    def updateMacieSession(params: UpdateMacieSessionRequest): Request[UpdateMacieSessionResponse] = js.native
    def updateMemberSession(params: UpdateMemberSessionRequest): Request[UpdateMemberSessionResponse] = js.native
    def updateOrganizationConfiguration(params: UpdateOrganizationConfigurationRequest): Request[UpdateOrganizationConfigurationResponse] = js.native
  }
  object Macie2 {
    @inline implicit def toOps(service: Macie2): Macie2Ops = {
      new Macie2Ops(service)
    }
  }

  @js.native
  trait AcceptInvitationRequest extends js.Object {
    var invitationId: __string
    var administratorAccountId: js.UndefOr[__string]
    var masterAccount: js.UndefOr[__string]
  }

  object AcceptInvitationRequest {
    @inline
    def apply(
        invitationId: __string,
        administratorAccountId: js.UndefOr[__string] = js.undefined,
        masterAccount: js.UndefOr[__string] = js.undefined
    ): AcceptInvitationRequest = {
      val __obj = js.Dynamic.literal(
        "invitationId" -> invitationId.asInstanceOf[js.Any]
      )

      administratorAccountId.foreach(__v => __obj.updateDynamic("administratorAccountId")(__v.asInstanceOf[js.Any]))
      masterAccount.foreach(__v => __obj.updateDynamic("masterAccount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceptInvitationRequest]
    }
  }

  @js.native
  trait AcceptInvitationResponse extends js.Object

  object AcceptInvitationResponse {
    @inline
    def apply(): AcceptInvitationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AcceptInvitationResponse]
    }
  }

  /** Provides information about the permissions settings of the bucket-level access control list (ACL) for an S3 bucket.
    */
  @js.native
  trait AccessControlList extends js.Object {
    var allowsPublicReadAccess: js.UndefOr[__boolean]
    var allowsPublicWriteAccess: js.UndefOr[__boolean]
  }

  object AccessControlList {
    @inline
    def apply(
        allowsPublicReadAccess: js.UndefOr[__boolean] = js.undefined,
        allowsPublicWriteAccess: js.UndefOr[__boolean] = js.undefined
    ): AccessControlList = {
      val __obj = js.Dynamic.literal()
      allowsPublicReadAccess.foreach(__v => __obj.updateDynamic("allowsPublicReadAccess")(__v.asInstanceOf[js.Any]))
      allowsPublicWriteAccess.foreach(__v => __obj.updateDynamic("allowsPublicWriteAccess")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessControlList]
    }
  }

  /** Specifies the details of an account to associate with an Amazon Macie administrator account.
    */
  @js.native
  trait AccountDetail extends js.Object {
    var accountId: __string
    var email: __string
  }

  object AccountDetail {
    @inline
    def apply(
        accountId: __string,
        email: __string
    ): AccountDetail = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "email" -> email.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AccountDetail]
    }
  }

  /** Provides information about the account-level permissions settings that apply to an S3 bucket.
    */
  @js.native
  trait AccountLevelPermissions extends js.Object {
    var blockPublicAccess: js.UndefOr[BlockPublicAccess]
  }

  object AccountLevelPermissions {
    @inline
    def apply(
        blockPublicAccess: js.UndefOr[BlockPublicAccess] = js.undefined
    ): AccountLevelPermissions = {
      val __obj = js.Dynamic.literal()
      blockPublicAccess.foreach(__v => __obj.updateDynamic("blockPublicAccess")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountLevelPermissions]
    }
  }

  /** Provides information about the delegated Amazon Macie administrator account for an organization in Organizations.
    */
  @js.native
  trait AdminAccount extends js.Object {
    var accountId: js.UndefOr[__string]
    var status: js.UndefOr[AdminStatus]
  }

  object AdminAccount {
    @inline
    def apply(
        accountId: js.UndefOr[__string] = js.undefined,
        status: js.UndefOr[AdminStatus] = js.undefined
    ): AdminAccount = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminAccount]
    }
  }

  /** Provides information about an API operation that an entity invoked for an affected resource.
    */
  @js.native
  trait ApiCallDetails extends js.Object {
    var api: js.UndefOr[__string]
    var apiServiceName: js.UndefOr[__string]
    var firstSeen: js.UndefOr[__timestampIso8601]
    var lastSeen: js.UndefOr[__timestampIso8601]
  }

  object ApiCallDetails {
    @inline
    def apply(
        api: js.UndefOr[__string] = js.undefined,
        apiServiceName: js.UndefOr[__string] = js.undefined,
        firstSeen: js.UndefOr[__timestampIso8601] = js.undefined,
        lastSeen: js.UndefOr[__timestampIso8601] = js.undefined
    ): ApiCallDetails = {
      val __obj = js.Dynamic.literal()
      api.foreach(__v => __obj.updateDynamic("api")(__v.asInstanceOf[js.Any]))
      apiServiceName.foreach(__v => __obj.updateDynamic("apiServiceName")(__v.asInstanceOf[js.Any]))
      firstSeen.foreach(__v => __obj.updateDynamic("firstSeen")(__v.asInstanceOf[js.Any]))
      lastSeen.foreach(__v => __obj.updateDynamic("lastSeen")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApiCallDetails]
    }
  }

  /** Provides information about an identity that performed an action on an affected resource by using temporary security credentials. The credentials were obtained using the AssumeRole operation of the Security Token Service (STS) API.
    */
  @js.native
  trait AssumedRole extends js.Object {
    var accessKeyId: js.UndefOr[__string]
    var accountId: js.UndefOr[__string]
    var arn: js.UndefOr[__string]
    var principalId: js.UndefOr[__string]
    var sessionContext: js.UndefOr[SessionContext]
  }

  object AssumedRole {
    @inline
    def apply(
        accessKeyId: js.UndefOr[__string] = js.undefined,
        accountId: js.UndefOr[__string] = js.undefined,
        arn: js.UndefOr[__string] = js.undefined,
        principalId: js.UndefOr[__string] = js.undefined,
        sessionContext: js.UndefOr[SessionContext] = js.undefined
    ): AssumedRole = {
      val __obj = js.Dynamic.literal()
      accessKeyId.foreach(__v => __obj.updateDynamic("accessKeyId")(__v.asInstanceOf[js.Any]))
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      principalId.foreach(__v => __obj.updateDynamic("principalId")(__v.asInstanceOf[js.Any]))
      sessionContext.foreach(__v => __obj.updateDynamic("sessionContext")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssumedRole]
    }
  }

  /** Provides information about an Amazon Web Services account and entity that performed an action on an affected resource. The action was performed using the credentials for an Amazon Web Services account other than your own account.
    */
  @js.native
  trait AwsAccount extends js.Object {
    var accountId: js.UndefOr[__string]
    var principalId: js.UndefOr[__string]
  }

  object AwsAccount {
    @inline
    def apply(
        accountId: js.UndefOr[__string] = js.undefined,
        principalId: js.UndefOr[__string] = js.undefined
    ): AwsAccount = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      principalId.foreach(__v => __obj.updateDynamic("principalId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsAccount]
    }
  }

  /** Provides information about an Amazon Web Service that performed an action on an affected resource.
    */
  @js.native
  trait AwsService extends js.Object {
    var invokedBy: js.UndefOr[__string]
  }

  object AwsService {
    @inline
    def apply(
        invokedBy: js.UndefOr[__string] = js.undefined
    ): AwsService = {
      val __obj = js.Dynamic.literal()
      invokedBy.foreach(__v => __obj.updateDynamic("invokedBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsService]
    }
  }

  /** Provides information about a custom data identifier.
    */
  @js.native
  trait BatchGetCustomDataIdentifierSummary extends js.Object {
    var arn: js.UndefOr[__string]
    var createdAt: js.UndefOr[__timestampIso8601]
    var deleted: js.UndefOr[__boolean]
    var description: js.UndefOr[__string]
    var id: js.UndefOr[__string]
    var name: js.UndefOr[__string]
  }

  object BatchGetCustomDataIdentifierSummary {
    @inline
    def apply(
        arn: js.UndefOr[__string] = js.undefined,
        createdAt: js.UndefOr[__timestampIso8601] = js.undefined,
        deleted: js.UndefOr[__boolean] = js.undefined,
        description: js.UndefOr[__string] = js.undefined,
        id: js.UndefOr[__string] = js.undefined,
        name: js.UndefOr[__string] = js.undefined
    ): BatchGetCustomDataIdentifierSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      deleted.foreach(__v => __obj.updateDynamic("deleted")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetCustomDataIdentifierSummary]
    }
  }

  @js.native
  trait BatchGetCustomDataIdentifiersRequest extends js.Object {
    var ids: js.UndefOr[__listOf__string]
  }

  object BatchGetCustomDataIdentifiersRequest {
    @inline
    def apply(
        ids: js.UndefOr[__listOf__string] = js.undefined
    ): BatchGetCustomDataIdentifiersRequest = {
      val __obj = js.Dynamic.literal()
      ids.foreach(__v => __obj.updateDynamic("ids")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetCustomDataIdentifiersRequest]
    }
  }

  @js.native
  trait BatchGetCustomDataIdentifiersResponse extends js.Object {
    var customDataIdentifiers: js.UndefOr[__listOfBatchGetCustomDataIdentifierSummary]
    var notFoundIdentifierIds: js.UndefOr[__listOf__string]
  }

  object BatchGetCustomDataIdentifiersResponse {
    @inline
    def apply(
        customDataIdentifiers: js.UndefOr[__listOfBatchGetCustomDataIdentifierSummary] = js.undefined,
        notFoundIdentifierIds: js.UndefOr[__listOf__string] = js.undefined
    ): BatchGetCustomDataIdentifiersResponse = {
      val __obj = js.Dynamic.literal()
      customDataIdentifiers.foreach(__v => __obj.updateDynamic("customDataIdentifiers")(__v.asInstanceOf[js.Any]))
      notFoundIdentifierIds.foreach(__v => __obj.updateDynamic("notFoundIdentifierIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetCustomDataIdentifiersResponse]
    }
  }

  /** Provides information about the block public access settings for an S3 bucket. These settings can apply to a bucket at the account level or bucket level. For detailed information about each setting, see [[https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-control-block-public-access.html|Blocking public access to your Amazon S3 storage]] in the <i>Amazon Simple Storage Service User Guide</i>.
    */
  @js.native
  trait BlockPublicAccess extends js.Object {
    var blockPublicAcls: js.UndefOr[__boolean]
    var blockPublicPolicy: js.UndefOr[__boolean]
    var ignorePublicAcls: js.UndefOr[__boolean]
    var restrictPublicBuckets: js.UndefOr[__boolean]
  }

  object BlockPublicAccess {
    @inline
    def apply(
        blockPublicAcls: js.UndefOr[__boolean] = js.undefined,
        blockPublicPolicy: js.UndefOr[__boolean] = js.undefined,
        ignorePublicAcls: js.UndefOr[__boolean] = js.undefined,
        restrictPublicBuckets: js.UndefOr[__boolean] = js.undefined
    ): BlockPublicAccess = {
      val __obj = js.Dynamic.literal()
      blockPublicAcls.foreach(__v => __obj.updateDynamic("blockPublicAcls")(__v.asInstanceOf[js.Any]))
      blockPublicPolicy.foreach(__v => __obj.updateDynamic("blockPublicPolicy")(__v.asInstanceOf[js.Any]))
      ignorePublicAcls.foreach(__v => __obj.updateDynamic("ignorePublicAcls")(__v.asInstanceOf[js.Any]))
      restrictPublicBuckets.foreach(__v => __obj.updateDynamic("restrictPublicBuckets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BlockPublicAccess]
    }
  }

  /** Provides information about the number of S3 buckets that are publicly accessible based on a combination of permissions settings for each bucket.
    */
  @js.native
  trait BucketCountByEffectivePermission extends js.Object {
    var publiclyAccessible: js.UndefOr[__long]
    var publiclyReadable: js.UndefOr[__long]
    var publiclyWritable: js.UndefOr[__long]
    var unknown: js.UndefOr[__long]
  }

  object BucketCountByEffectivePermission {
    @inline
    def apply(
        publiclyAccessible: js.UndefOr[__long] = js.undefined,
        publiclyReadable: js.UndefOr[__long] = js.undefined,
        publiclyWritable: js.UndefOr[__long] = js.undefined,
        unknown: js.UndefOr[__long] = js.undefined
    ): BucketCountByEffectivePermission = {
      val __obj = js.Dynamic.literal()
      publiclyAccessible.foreach(__v => __obj.updateDynamic("publiclyAccessible")(__v.asInstanceOf[js.Any]))
      publiclyReadable.foreach(__v => __obj.updateDynamic("publiclyReadable")(__v.asInstanceOf[js.Any]))
      publiclyWritable.foreach(__v => __obj.updateDynamic("publiclyWritable")(__v.asInstanceOf[js.Any]))
      unknown.foreach(__v => __obj.updateDynamic("unknown")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketCountByEffectivePermission]
    }
  }

  /** Provides information about the number of S3 buckets that use certain types of server-side encryption by default or don't encrypt new objects by default. For detailed information about these settings, see [[https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucket-encryption.html|Setting default server-side encryption behavior for Amazon S3 buckets]] in the <i>Amazon Simple Storage Service User Guide</i>.
    */
  @js.native
  trait BucketCountByEncryptionType extends js.Object {
    var kmsManaged: js.UndefOr[__long]
    var s3Managed: js.UndefOr[__long]
    var unencrypted: js.UndefOr[__long]
    var unknown: js.UndefOr[__long]
  }

  object BucketCountByEncryptionType {
    @inline
    def apply(
        kmsManaged: js.UndefOr[__long] = js.undefined,
        s3Managed: js.UndefOr[__long] = js.undefined,
        unencrypted: js.UndefOr[__long] = js.undefined,
        unknown: js.UndefOr[__long] = js.undefined
    ): BucketCountByEncryptionType = {
      val __obj = js.Dynamic.literal()
      kmsManaged.foreach(__v => __obj.updateDynamic("kmsManaged")(__v.asInstanceOf[js.Any]))
      s3Managed.foreach(__v => __obj.updateDynamic("s3Managed")(__v.asInstanceOf[js.Any]))
      unencrypted.foreach(__v => __obj.updateDynamic("unencrypted")(__v.asInstanceOf[js.Any]))
      unknown.foreach(__v => __obj.updateDynamic("unknown")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketCountByEncryptionType]
    }
  }

  /** Provides information about the number of S3 buckets that are or aren't shared with other Amazon Web Services accounts.
    */
  @js.native
  trait BucketCountBySharedAccessType extends js.Object {
    var external: js.UndefOr[__long]
    var internal: js.UndefOr[__long]
    var notShared: js.UndefOr[__long]
    var unknown: js.UndefOr[__long]
  }

  object BucketCountBySharedAccessType {
    @inline
    def apply(
        external: js.UndefOr[__long] = js.undefined,
        internal: js.UndefOr[__long] = js.undefined,
        notShared: js.UndefOr[__long] = js.undefined,
        unknown: js.UndefOr[__long] = js.undefined
    ): BucketCountBySharedAccessType = {
      val __obj = js.Dynamic.literal()
      external.foreach(__v => __obj.updateDynamic("external")(__v.asInstanceOf[js.Any]))
      internal.foreach(__v => __obj.updateDynamic("internal")(__v.asInstanceOf[js.Any]))
      notShared.foreach(__v => __obj.updateDynamic("notShared")(__v.asInstanceOf[js.Any]))
      unknown.foreach(__v => __obj.updateDynamic("unknown")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketCountBySharedAccessType]
    }
  }

  /** Provides information about the number of S3 buckets whose bucket policies do or don't require server-side encryption of objects when objects are uploaded to the buckets.
    */
  @js.native
  trait BucketCountPolicyAllowsUnencryptedObjectUploads extends js.Object {
    var allowsUnencryptedObjectUploads: js.UndefOr[__long]
    var deniesUnencryptedObjectUploads: js.UndefOr[__long]
    var unknown: js.UndefOr[__long]
  }

  object BucketCountPolicyAllowsUnencryptedObjectUploads {
    @inline
    def apply(
        allowsUnencryptedObjectUploads: js.UndefOr[__long] = js.undefined,
        deniesUnencryptedObjectUploads: js.UndefOr[__long] = js.undefined,
        unknown: js.UndefOr[__long] = js.undefined
    ): BucketCountPolicyAllowsUnencryptedObjectUploads = {
      val __obj = js.Dynamic.literal()
      allowsUnencryptedObjectUploads.foreach(__v => __obj.updateDynamic("allowsUnencryptedObjectUploads")(__v.asInstanceOf[js.Any]))
      deniesUnencryptedObjectUploads.foreach(__v => __obj.updateDynamic("deniesUnencryptedObjectUploads")(__v.asInstanceOf[js.Any]))
      unknown.foreach(__v => __obj.updateDynamic("unknown")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketCountPolicyAllowsUnencryptedObjectUploads]
    }
  }

  /** Specifies the operator to use in a property-based condition that filters the results of a query for information about S3 buckets.
    */
  @js.native
  trait BucketCriteriaAdditionalProperties extends js.Object {
    var eq: js.UndefOr[__listOf__string]
    var gt: js.UndefOr[__long]
    var gte: js.UndefOr[__long]
    var lt: js.UndefOr[__long]
    var lte: js.UndefOr[__long]
    var neq: js.UndefOr[__listOf__string]
    var prefix: js.UndefOr[__string]
  }

  object BucketCriteriaAdditionalProperties {
    @inline
    def apply(
        eq: js.UndefOr[__listOf__string] = js.undefined,
        gt: js.UndefOr[__long] = js.undefined,
        gte: js.UndefOr[__long] = js.undefined,
        lt: js.UndefOr[__long] = js.undefined,
        lte: js.UndefOr[__long] = js.undefined,
        neq: js.UndefOr[__listOf__string] = js.undefined,
        prefix: js.UndefOr[__string] = js.undefined
    ): BucketCriteriaAdditionalProperties = {
      val __obj = js.Dynamic.literal()
      eq.foreach(__v => __obj.updateDynamic("eq")(__v.asInstanceOf[js.Any]))
      gt.foreach(__v => __obj.updateDynamic("gt")(__v.asInstanceOf[js.Any]))
      gte.foreach(__v => __obj.updateDynamic("gte")(__v.asInstanceOf[js.Any]))
      lt.foreach(__v => __obj.updateDynamic("lt")(__v.asInstanceOf[js.Any]))
      lte.foreach(__v => __obj.updateDynamic("lte")(__v.asInstanceOf[js.Any]))
      neq.foreach(__v => __obj.updateDynamic("neq")(__v.asInstanceOf[js.Any]))
      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketCriteriaAdditionalProperties]
    }
  }

  /** Provides information about the bucket-level permissions settings for an S3 bucket.
    */
  @js.native
  trait BucketLevelPermissions extends js.Object {
    var accessControlList: js.UndefOr[AccessControlList]
    var blockPublicAccess: js.UndefOr[BlockPublicAccess]
    var bucketPolicy: js.UndefOr[BucketPolicy]
  }

  object BucketLevelPermissions {
    @inline
    def apply(
        accessControlList: js.UndefOr[AccessControlList] = js.undefined,
        blockPublicAccess: js.UndefOr[BlockPublicAccess] = js.undefined,
        bucketPolicy: js.UndefOr[BucketPolicy] = js.undefined
    ): BucketLevelPermissions = {
      val __obj = js.Dynamic.literal()
      accessControlList.foreach(__v => __obj.updateDynamic("accessControlList")(__v.asInstanceOf[js.Any]))
      blockPublicAccess.foreach(__v => __obj.updateDynamic("blockPublicAccess")(__v.asInstanceOf[js.Any]))
      bucketPolicy.foreach(__v => __obj.updateDynamic("bucketPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketLevelPermissions]
    }
  }

  /** Provides statistical data and other information about an S3 bucket that Amazon Macie monitors and analyzes for your account. If an error occurs when Macie attempts to retrieve and process information about the bucket or the bucket's objects, the value for the versioning property is false and the value for most other properties is null. Exceptions are accountId, bucketArn, bucketCreatedAt, bucketName, lastUpdated, and region. To identify the cause of the error, refer to the errorCode and errorMessage values.
    */
  @js.native
  trait BucketMetadata extends js.Object {
    var accountId: js.UndefOr[__string]
    var allowsUnencryptedObjectUploads: js.UndefOr[AllowsUnencryptedObjectUploads]
    var bucketArn: js.UndefOr[__string]
    var bucketCreatedAt: js.UndefOr[__timestampIso8601]
    var bucketName: js.UndefOr[__string]
    var classifiableObjectCount: js.UndefOr[__long]
    var classifiableSizeInBytes: js.UndefOr[__long]
    var errorCode: js.UndefOr[BucketMetadataErrorCode]
    var errorMessage: js.UndefOr[__string]
    var jobDetails: js.UndefOr[JobDetails]
    var lastUpdated: js.UndefOr[__timestampIso8601]
    var objectCount: js.UndefOr[__long]
    var objectCountByEncryptionType: js.UndefOr[ObjectCountByEncryptionType]
    var publicAccess: js.UndefOr[BucketPublicAccess]
    var region: js.UndefOr[__string]
    var replicationDetails: js.UndefOr[ReplicationDetails]
    var serverSideEncryption: js.UndefOr[BucketServerSideEncryption]
    var sharedAccess: js.UndefOr[SharedAccess]
    var sizeInBytes: js.UndefOr[__long]
    var sizeInBytesCompressed: js.UndefOr[__long]
    var tags: js.UndefOr[__listOfKeyValuePair]
    var unclassifiableObjectCount: js.UndefOr[ObjectLevelStatistics]
    var unclassifiableObjectSizeInBytes: js.UndefOr[ObjectLevelStatistics]
    var versioning: js.UndefOr[__boolean]
  }

  object BucketMetadata {
    @inline
    def apply(
        accountId: js.UndefOr[__string] = js.undefined,
        allowsUnencryptedObjectUploads: js.UndefOr[AllowsUnencryptedObjectUploads] = js.undefined,
        bucketArn: js.UndefOr[__string] = js.undefined,
        bucketCreatedAt: js.UndefOr[__timestampIso8601] = js.undefined,
        bucketName: js.UndefOr[__string] = js.undefined,
        classifiableObjectCount: js.UndefOr[__long] = js.undefined,
        classifiableSizeInBytes: js.UndefOr[__long] = js.undefined,
        errorCode: js.UndefOr[BucketMetadataErrorCode] = js.undefined,
        errorMessage: js.UndefOr[__string] = js.undefined,
        jobDetails: js.UndefOr[JobDetails] = js.undefined,
        lastUpdated: js.UndefOr[__timestampIso8601] = js.undefined,
        objectCount: js.UndefOr[__long] = js.undefined,
        objectCountByEncryptionType: js.UndefOr[ObjectCountByEncryptionType] = js.undefined,
        publicAccess: js.UndefOr[BucketPublicAccess] = js.undefined,
        region: js.UndefOr[__string] = js.undefined,
        replicationDetails: js.UndefOr[ReplicationDetails] = js.undefined,
        serverSideEncryption: js.UndefOr[BucketServerSideEncryption] = js.undefined,
        sharedAccess: js.UndefOr[SharedAccess] = js.undefined,
        sizeInBytes: js.UndefOr[__long] = js.undefined,
        sizeInBytesCompressed: js.UndefOr[__long] = js.undefined,
        tags: js.UndefOr[__listOfKeyValuePair] = js.undefined,
        unclassifiableObjectCount: js.UndefOr[ObjectLevelStatistics] = js.undefined,
        unclassifiableObjectSizeInBytes: js.UndefOr[ObjectLevelStatistics] = js.undefined,
        versioning: js.UndefOr[__boolean] = js.undefined
    ): BucketMetadata = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      allowsUnencryptedObjectUploads.foreach(__v => __obj.updateDynamic("allowsUnencryptedObjectUploads")(__v.asInstanceOf[js.Any]))
      bucketArn.foreach(__v => __obj.updateDynamic("bucketArn")(__v.asInstanceOf[js.Any]))
      bucketCreatedAt.foreach(__v => __obj.updateDynamic("bucketCreatedAt")(__v.asInstanceOf[js.Any]))
      bucketName.foreach(__v => __obj.updateDynamic("bucketName")(__v.asInstanceOf[js.Any]))
      classifiableObjectCount.foreach(__v => __obj.updateDynamic("classifiableObjectCount")(__v.asInstanceOf[js.Any]))
      classifiableSizeInBytes.foreach(__v => __obj.updateDynamic("classifiableSizeInBytes")(__v.asInstanceOf[js.Any]))
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      jobDetails.foreach(__v => __obj.updateDynamic("jobDetails")(__v.asInstanceOf[js.Any]))
      lastUpdated.foreach(__v => __obj.updateDynamic("lastUpdated")(__v.asInstanceOf[js.Any]))
      objectCount.foreach(__v => __obj.updateDynamic("objectCount")(__v.asInstanceOf[js.Any]))
      objectCountByEncryptionType.foreach(__v => __obj.updateDynamic("objectCountByEncryptionType")(__v.asInstanceOf[js.Any]))
      publicAccess.foreach(__v => __obj.updateDynamic("publicAccess")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      replicationDetails.foreach(__v => __obj.updateDynamic("replicationDetails")(__v.asInstanceOf[js.Any]))
      serverSideEncryption.foreach(__v => __obj.updateDynamic("serverSideEncryption")(__v.asInstanceOf[js.Any]))
      sharedAccess.foreach(__v => __obj.updateDynamic("sharedAccess")(__v.asInstanceOf[js.Any]))
      sizeInBytes.foreach(__v => __obj.updateDynamic("sizeInBytes")(__v.asInstanceOf[js.Any]))
      sizeInBytesCompressed.foreach(__v => __obj.updateDynamic("sizeInBytesCompressed")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      unclassifiableObjectCount.foreach(__v => __obj.updateDynamic("unclassifiableObjectCount")(__v.asInstanceOf[js.Any]))
      unclassifiableObjectSizeInBytes.foreach(__v => __obj.updateDynamic("unclassifiableObjectSizeInBytes")(__v.asInstanceOf[js.Any]))
      versioning.foreach(__v => __obj.updateDynamic("versioning")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketMetadata]
    }
  }

  /** Provides information about the account-level and bucket-level permissions settings for an S3 bucket.
    */
  @js.native
  trait BucketPermissionConfiguration extends js.Object {
    var accountLevelPermissions: js.UndefOr[AccountLevelPermissions]
    var bucketLevelPermissions: js.UndefOr[BucketLevelPermissions]
  }

  object BucketPermissionConfiguration {
    @inline
    def apply(
        accountLevelPermissions: js.UndefOr[AccountLevelPermissions] = js.undefined,
        bucketLevelPermissions: js.UndefOr[BucketLevelPermissions] = js.undefined
    ): BucketPermissionConfiguration = {
      val __obj = js.Dynamic.literal()
      accountLevelPermissions.foreach(__v => __obj.updateDynamic("accountLevelPermissions")(__v.asInstanceOf[js.Any]))
      bucketLevelPermissions.foreach(__v => __obj.updateDynamic("bucketLevelPermissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketPermissionConfiguration]
    }
  }

  /** Provides information about the permissions settings of the bucket policy for an S3 bucket.
    */
  @js.native
  trait BucketPolicy extends js.Object {
    var allowsPublicReadAccess: js.UndefOr[__boolean]
    var allowsPublicWriteAccess: js.UndefOr[__boolean]
  }

  object BucketPolicy {
    @inline
    def apply(
        allowsPublicReadAccess: js.UndefOr[__boolean] = js.undefined,
        allowsPublicWriteAccess: js.UndefOr[__boolean] = js.undefined
    ): BucketPolicy = {
      val __obj = js.Dynamic.literal()
      allowsPublicReadAccess.foreach(__v => __obj.updateDynamic("allowsPublicReadAccess")(__v.asInstanceOf[js.Any]))
      allowsPublicWriteAccess.foreach(__v => __obj.updateDynamic("allowsPublicWriteAccess")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketPolicy]
    }
  }

  /** Provides information about the permissions settings that determine whether an S3 bucket is publicly accessible.
    */
  @js.native
  trait BucketPublicAccess extends js.Object {
    var effectivePermission: js.UndefOr[EffectivePermission]
    var permissionConfiguration: js.UndefOr[BucketPermissionConfiguration]
  }

  object BucketPublicAccess {
    @inline
    def apply(
        effectivePermission: js.UndefOr[EffectivePermission] = js.undefined,
        permissionConfiguration: js.UndefOr[BucketPermissionConfiguration] = js.undefined
    ): BucketPublicAccess = {
      val __obj = js.Dynamic.literal()
      effectivePermission.foreach(__v => __obj.updateDynamic("effectivePermission")(__v.asInstanceOf[js.Any]))
      permissionConfiguration.foreach(__v => __obj.updateDynamic("permissionConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketPublicAccess]
    }
  }

  /** Provides information about the default server-side encryption settings for an S3 bucket. For detailed information about these settings, see [[https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucket-encryption.html|Setting default server-side encryption behavior for Amazon S3 buckets]] in the <i>Amazon Simple Storage Service User Guide</i>.
    */
  @js.native
  trait BucketServerSideEncryption extends js.Object {
    var kmsMasterKeyId: js.UndefOr[__string]
    var `type`: js.UndefOr[Type]
  }

  object BucketServerSideEncryption {
    @inline
    def apply(
        kmsMasterKeyId: js.UndefOr[__string] = js.undefined,
        `type`: js.UndefOr[Type] = js.undefined
    ): BucketServerSideEncryption = {
      val __obj = js.Dynamic.literal()
      kmsMasterKeyId.foreach(__v => __obj.updateDynamic("kmsMasterKeyId")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketServerSideEncryption]
    }
  }

  /** Specifies criteria for sorting the results of a query for information about S3 buckets.
    */
  @js.native
  trait BucketSortCriteria extends js.Object {
    var attributeName: js.UndefOr[__string]
    var orderBy: js.UndefOr[OrderBy]
  }

  object BucketSortCriteria {
    @inline
    def apply(
        attributeName: js.UndefOr[__string] = js.undefined,
        orderBy: js.UndefOr[OrderBy] = js.undefined
    ): BucketSortCriteria = {
      val __obj = js.Dynamic.literal()
      attributeName.foreach(__v => __obj.updateDynamic("attributeName")(__v.asInstanceOf[js.Any]))
      orderBy.foreach(__v => __obj.updateDynamic("orderBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketSortCriteria]
    }
  }

  /** Specifies the location of an occurrence of sensitive data in a Microsoft Excel workbook, CSV file, or TSV file.
    */
  @js.native
  trait Cell extends js.Object {
    var cellReference: js.UndefOr[__string]
    var column: js.UndefOr[__long]
    var columnName: js.UndefOr[__string]
    var row: js.UndefOr[__long]
  }

  object Cell {
    @inline
    def apply(
        cellReference: js.UndefOr[__string] = js.undefined,
        column: js.UndefOr[__long] = js.undefined,
        columnName: js.UndefOr[__string] = js.undefined,
        row: js.UndefOr[__long] = js.undefined
    ): Cell = {
      val __obj = js.Dynamic.literal()
      cellReference.foreach(__v => __obj.updateDynamic("cellReference")(__v.asInstanceOf[js.Any]))
      column.foreach(__v => __obj.updateDynamic("column")(__v.asInstanceOf[js.Any]))
      columnName.foreach(__v => __obj.updateDynamic("columnName")(__v.asInstanceOf[js.Any]))
      row.foreach(__v => __obj.updateDynamic("row")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Cell]
    }
  }

  /** Provides information about a sensitive data finding, including the classification job that produced the finding.
    */
  @js.native
  trait ClassificationDetails extends js.Object {
    var detailedResultsLocation: js.UndefOr[__string]
    var jobArn: js.UndefOr[__string]
    var jobId: js.UndefOr[__string]
    var result: js.UndefOr[ClassificationResult]
  }

  object ClassificationDetails {
    @inline
    def apply(
        detailedResultsLocation: js.UndefOr[__string] = js.undefined,
        jobArn: js.UndefOr[__string] = js.undefined,
        jobId: js.UndefOr[__string] = js.undefined,
        result: js.UndefOr[ClassificationResult] = js.undefined
    ): ClassificationDetails = {
      val __obj = js.Dynamic.literal()
      detailedResultsLocation.foreach(__v => __obj.updateDynamic("detailedResultsLocation")(__v.asInstanceOf[js.Any]))
      jobArn.foreach(__v => __obj.updateDynamic("jobArn")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      result.foreach(__v => __obj.updateDynamic("result")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClassificationDetails]
    }
  }

  /** Specifies where to store data classification results, and the encryption settings to use when storing results in that location. Currently, you can store classification results only in an S3 bucket.
    */
  @js.native
  trait ClassificationExportConfiguration extends js.Object {
    var s3Destination: js.UndefOr[S3Destination]
  }

  object ClassificationExportConfiguration {
    @inline
    def apply(
        s3Destination: js.UndefOr[S3Destination] = js.undefined
    ): ClassificationExportConfiguration = {
      val __obj = js.Dynamic.literal()
      s3Destination.foreach(__v => __obj.updateDynamic("s3Destination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClassificationExportConfiguration]
    }
  }

  /** Provides the details of a sensitive data finding, including the types, number of occurrences, and locations of the sensitive data that was detected.
    */
  @js.native
  trait ClassificationResult extends js.Object {
    var additionalOccurrences: js.UndefOr[__boolean]
    var customDataIdentifiers: js.UndefOr[CustomDataIdentifiers]
    var mimeType: js.UndefOr[__string]
    var sensitiveData: js.UndefOr[SensitiveData]
    var sizeClassified: js.UndefOr[__long]
    var status: js.UndefOr[ClassificationResultStatus]
  }

  object ClassificationResult {
    @inline
    def apply(
        additionalOccurrences: js.UndefOr[__boolean] = js.undefined,
        customDataIdentifiers: js.UndefOr[CustomDataIdentifiers] = js.undefined,
        mimeType: js.UndefOr[__string] = js.undefined,
        sensitiveData: js.UndefOr[SensitiveData] = js.undefined,
        sizeClassified: js.UndefOr[__long] = js.undefined,
        status: js.UndefOr[ClassificationResultStatus] = js.undefined
    ): ClassificationResult = {
      val __obj = js.Dynamic.literal()
      additionalOccurrences.foreach(__v => __obj.updateDynamic("additionalOccurrences")(__v.asInstanceOf[js.Any]))
      customDataIdentifiers.foreach(__v => __obj.updateDynamic("customDataIdentifiers")(__v.asInstanceOf[js.Any]))
      mimeType.foreach(__v => __obj.updateDynamic("mimeType")(__v.asInstanceOf[js.Any]))
      sensitiveData.foreach(__v => __obj.updateDynamic("sensitiveData")(__v.asInstanceOf[js.Any]))
      sizeClassified.foreach(__v => __obj.updateDynamic("sizeClassified")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClassificationResult]
    }
  }

  /** Provides information about the status of a sensitive data finding.
    */
  @js.native
  trait ClassificationResultStatus extends js.Object {
    var code: js.UndefOr[__string]
    var reason: js.UndefOr[__string]
  }

  object ClassificationResultStatus {
    @inline
    def apply(
        code: js.UndefOr[__string] = js.undefined,
        reason: js.UndefOr[__string] = js.undefined
    ): ClassificationResultStatus = {
      val __obj = js.Dynamic.literal()
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClassificationResultStatus]
    }
  }

  @js.native
  trait CreateClassificationJobRequest extends js.Object {
    var clientToken: __string
    var jobType: JobType
    var name: __string
    var s3JobDefinition: S3JobDefinition
    var customDataIdentifierIds: js.UndefOr[__listOf__string]
    var description: js.UndefOr[__string]
    var initialRun: js.UndefOr[__boolean]
    var managedDataIdentifierIds: js.UndefOr[__listOf__string]
    var managedDataIdentifierSelector: js.UndefOr[ManagedDataIdentifierSelector]
    var samplingPercentage: js.UndefOr[__integer]
    var scheduleFrequency: js.UndefOr[JobScheduleFrequency]
    var tags: js.UndefOr[TagMap]
  }

  object CreateClassificationJobRequest {
    @inline
    def apply(
        clientToken: __string,
        jobType: JobType,
        name: __string,
        s3JobDefinition: S3JobDefinition,
        customDataIdentifierIds: js.UndefOr[__listOf__string] = js.undefined,
        description: js.UndefOr[__string] = js.undefined,
        initialRun: js.UndefOr[__boolean] = js.undefined,
        managedDataIdentifierIds: js.UndefOr[__listOf__string] = js.undefined,
        managedDataIdentifierSelector: js.UndefOr[ManagedDataIdentifierSelector] = js.undefined,
        samplingPercentage: js.UndefOr[__integer] = js.undefined,
        scheduleFrequency: js.UndefOr[JobScheduleFrequency] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateClassificationJobRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "jobType" -> jobType.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "s3JobDefinition" -> s3JobDefinition.asInstanceOf[js.Any]
      )

      customDataIdentifierIds.foreach(__v => __obj.updateDynamic("customDataIdentifierIds")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      initialRun.foreach(__v => __obj.updateDynamic("initialRun")(__v.asInstanceOf[js.Any]))
      managedDataIdentifierIds.foreach(__v => __obj.updateDynamic("managedDataIdentifierIds")(__v.asInstanceOf[js.Any]))
      managedDataIdentifierSelector.foreach(__v => __obj.updateDynamic("managedDataIdentifierSelector")(__v.asInstanceOf[js.Any]))
      samplingPercentage.foreach(__v => __obj.updateDynamic("samplingPercentage")(__v.asInstanceOf[js.Any]))
      scheduleFrequency.foreach(__v => __obj.updateDynamic("scheduleFrequency")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClassificationJobRequest]
    }
  }

  @js.native
  trait CreateClassificationJobResponse extends js.Object {
    var jobArn: js.UndefOr[__string]
    var jobId: js.UndefOr[__string]
  }

  object CreateClassificationJobResponse {
    @inline
    def apply(
        jobArn: js.UndefOr[__string] = js.undefined,
        jobId: js.UndefOr[__string] = js.undefined
    ): CreateClassificationJobResponse = {
      val __obj = js.Dynamic.literal()
      jobArn.foreach(__v => __obj.updateDynamic("jobArn")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClassificationJobResponse]
    }
  }

  @js.native
  trait CreateCustomDataIdentifierRequest extends js.Object {
    var clientToken: js.UndefOr[__string]
    var description: js.UndefOr[__string]
    var ignoreWords: js.UndefOr[__listOf__string]
    var keywords: js.UndefOr[__listOf__string]
    var maximumMatchDistance: js.UndefOr[__integer]
    var name: js.UndefOr[__string]
    var regex: js.UndefOr[__string]
    var severityLevels: js.UndefOr[SeverityLevelList]
    var tags: js.UndefOr[TagMap]
  }

  object CreateCustomDataIdentifierRequest {
    @inline
    def apply(
        clientToken: js.UndefOr[__string] = js.undefined,
        description: js.UndefOr[__string] = js.undefined,
        ignoreWords: js.UndefOr[__listOf__string] = js.undefined,
        keywords: js.UndefOr[__listOf__string] = js.undefined,
        maximumMatchDistance: js.UndefOr[__integer] = js.undefined,
        name: js.UndefOr[__string] = js.undefined,
        regex: js.UndefOr[__string] = js.undefined,
        severityLevels: js.UndefOr[SeverityLevelList] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateCustomDataIdentifierRequest = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      ignoreWords.foreach(__v => __obj.updateDynamic("ignoreWords")(__v.asInstanceOf[js.Any]))
      keywords.foreach(__v => __obj.updateDynamic("keywords")(__v.asInstanceOf[js.Any]))
      maximumMatchDistance.foreach(__v => __obj.updateDynamic("maximumMatchDistance")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      regex.foreach(__v => __obj.updateDynamic("regex")(__v.asInstanceOf[js.Any]))
      severityLevels.foreach(__v => __obj.updateDynamic("severityLevels")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCustomDataIdentifierRequest]
    }
  }

  @js.native
  trait CreateCustomDataIdentifierResponse extends js.Object {
    var customDataIdentifierId: js.UndefOr[__string]
  }

  object CreateCustomDataIdentifierResponse {
    @inline
    def apply(
        customDataIdentifierId: js.UndefOr[__string] = js.undefined
    ): CreateCustomDataIdentifierResponse = {
      val __obj = js.Dynamic.literal()
      customDataIdentifierId.foreach(__v => __obj.updateDynamic("customDataIdentifierId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCustomDataIdentifierResponse]
    }
  }

  @js.native
  trait CreateFindingsFilterRequest extends js.Object {
    var action: FindingsFilterAction
    var findingCriteria: FindingCriteria
    var name: __string
    var clientToken: js.UndefOr[__string]
    var description: js.UndefOr[__string]
    var position: js.UndefOr[__integer]
    var tags: js.UndefOr[TagMap]
  }

  object CreateFindingsFilterRequest {
    @inline
    def apply(
        action: FindingsFilterAction,
        findingCriteria: FindingCriteria,
        name: __string,
        clientToken: js.UndefOr[__string] = js.undefined,
        description: js.UndefOr[__string] = js.undefined,
        position: js.UndefOr[__integer] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateFindingsFilterRequest = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any],
        "findingCriteria" -> findingCriteria.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.updateDynamic("position")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFindingsFilterRequest]
    }
  }

  @js.native
  trait CreateFindingsFilterResponse extends js.Object {
    var arn: js.UndefOr[__string]
    var id: js.UndefOr[__string]
  }

  object CreateFindingsFilterResponse {
    @inline
    def apply(
        arn: js.UndefOr[__string] = js.undefined,
        id: js.UndefOr[__string] = js.undefined
    ): CreateFindingsFilterResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFindingsFilterResponse]
    }
  }

  @js.native
  trait CreateInvitationsRequest extends js.Object {
    var accountIds: __listOf__string
    var disableEmailNotification: js.UndefOr[__boolean]
    var message: js.UndefOr[__string]
  }

  object CreateInvitationsRequest {
    @inline
    def apply(
        accountIds: __listOf__string,
        disableEmailNotification: js.UndefOr[__boolean] = js.undefined,
        message: js.UndefOr[__string] = js.undefined
    ): CreateInvitationsRequest = {
      val __obj = js.Dynamic.literal(
        "accountIds" -> accountIds.asInstanceOf[js.Any]
      )

      disableEmailNotification.foreach(__v => __obj.updateDynamic("disableEmailNotification")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInvitationsRequest]
    }
  }

  @js.native
  trait CreateInvitationsResponse extends js.Object {
    var unprocessedAccounts: js.UndefOr[__listOfUnprocessedAccount]
  }

  object CreateInvitationsResponse {
    @inline
    def apply(
        unprocessedAccounts: js.UndefOr[__listOfUnprocessedAccount] = js.undefined
    ): CreateInvitationsResponse = {
      val __obj = js.Dynamic.literal()
      unprocessedAccounts.foreach(__v => __obj.updateDynamic("unprocessedAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInvitationsResponse]
    }
  }

  @js.native
  trait CreateMemberRequest extends js.Object {
    var account: AccountDetail
    var tags: js.UndefOr[TagMap]
  }

  object CreateMemberRequest {
    @inline
    def apply(
        account: AccountDetail,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateMemberRequest = {
      val __obj = js.Dynamic.literal(
        "account" -> account.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMemberRequest]
    }
  }

  @js.native
  trait CreateMemberResponse extends js.Object {
    var arn: js.UndefOr[__string]
  }

  object CreateMemberResponse {
    @inline
    def apply(
        arn: js.UndefOr[__string] = js.undefined
    ): CreateMemberResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMemberResponse]
    }
  }

  @js.native
  trait CreateSampleFindingsRequest extends js.Object {
    var findingTypes: js.UndefOr[__listOfFindingType]
  }

  object CreateSampleFindingsRequest {
    @inline
    def apply(
        findingTypes: js.UndefOr[__listOfFindingType] = js.undefined
    ): CreateSampleFindingsRequest = {
      val __obj = js.Dynamic.literal()
      findingTypes.foreach(__v => __obj.updateDynamic("findingTypes")(__v.asInstanceOf[js.Any]))
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

  /** Specifies one or more property- and tag-based conditions that define criteria for including or excluding S3 buckets from a classification job.
    */
  @js.native
  trait CriteriaBlockForJob extends js.Object {
    var and: js.UndefOr[__listOfCriteriaForJob]
  }

  object CriteriaBlockForJob {
    @inline
    def apply(
        and: js.UndefOr[__listOfCriteriaForJob] = js.undefined
    ): CriteriaBlockForJob = {
      val __obj = js.Dynamic.literal()
      and.foreach(__v => __obj.updateDynamic("and")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CriteriaBlockForJob]
    }
  }

  /** Specifies a property- or tag-based condition that defines criteria for including or excluding S3 buckets from a classification job.
    */
  @js.native
  trait CriteriaForJob extends js.Object {
    var simpleCriterion: js.UndefOr[SimpleCriterionForJob]
    var tagCriterion: js.UndefOr[TagCriterionForJob]
  }

  object CriteriaForJob {
    @inline
    def apply(
        simpleCriterion: js.UndefOr[SimpleCriterionForJob] = js.undefined,
        tagCriterion: js.UndefOr[TagCriterionForJob] = js.undefined
    ): CriteriaForJob = {
      val __obj = js.Dynamic.literal()
      simpleCriterion.foreach(__v => __obj.updateDynamic("simpleCriterion")(__v.asInstanceOf[js.Any]))
      tagCriterion.foreach(__v => __obj.updateDynamic("tagCriterion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CriteriaForJob]
    }
  }

  /** Specifies the operator to use in a property-based condition that filters the results of a query for findings. For detailed information and examples of each operator, see [[https://docs.aws.amazon.com/macie/latest/user/findings-filter-basics.html|Fundamentals of filtering findings]] in the <i>Amazon Macie User Guide</i>.
    */
  @js.native
  trait CriterionAdditionalProperties extends js.Object {
    var eq: js.UndefOr[__listOf__string]
    var eqExactMatch: js.UndefOr[__listOf__string]
    var gt: js.UndefOr[__long]
    var gte: js.UndefOr[__long]
    var lt: js.UndefOr[__long]
    var lte: js.UndefOr[__long]
    var neq: js.UndefOr[__listOf__string]
  }

  object CriterionAdditionalProperties {
    @inline
    def apply(
        eq: js.UndefOr[__listOf__string] = js.undefined,
        eqExactMatch: js.UndefOr[__listOf__string] = js.undefined,
        gt: js.UndefOr[__long] = js.undefined,
        gte: js.UndefOr[__long] = js.undefined,
        lt: js.UndefOr[__long] = js.undefined,
        lte: js.UndefOr[__long] = js.undefined,
        neq: js.UndefOr[__listOf__string] = js.undefined
    ): CriterionAdditionalProperties = {
      val __obj = js.Dynamic.literal()
      eq.foreach(__v => __obj.updateDynamic("eq")(__v.asInstanceOf[js.Any]))
      eqExactMatch.foreach(__v => __obj.updateDynamic("eqExactMatch")(__v.asInstanceOf[js.Any]))
      gt.foreach(__v => __obj.updateDynamic("gt")(__v.asInstanceOf[js.Any]))
      gte.foreach(__v => __obj.updateDynamic("gte")(__v.asInstanceOf[js.Any]))
      lt.foreach(__v => __obj.updateDynamic("lt")(__v.asInstanceOf[js.Any]))
      lte.foreach(__v => __obj.updateDynamic("lte")(__v.asInstanceOf[js.Any]))
      neq.foreach(__v => __obj.updateDynamic("neq")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CriterionAdditionalProperties]
    }
  }

  /** Provides information about a custom data identifier.
    */
  @js.native
  trait CustomDataIdentifierSummary extends js.Object {
    var arn: js.UndefOr[__string]
    var createdAt: js.UndefOr[__timestampIso8601]
    var description: js.UndefOr[__string]
    var id: js.UndefOr[__string]
    var name: js.UndefOr[__string]
  }

  object CustomDataIdentifierSummary {
    @inline
    def apply(
        arn: js.UndefOr[__string] = js.undefined,
        createdAt: js.UndefOr[__timestampIso8601] = js.undefined,
        description: js.UndefOr[__string] = js.undefined,
        id: js.UndefOr[__string] = js.undefined,
        name: js.UndefOr[__string] = js.undefined
    ): CustomDataIdentifierSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomDataIdentifierSummary]
    }
  }

  /** Provides information about custom data identifiers that produced a sensitive data finding, and the number of occurrences of the data that they detected for the finding.
    */
  @js.native
  trait CustomDataIdentifiers extends js.Object {
    var detections: js.UndefOr[CustomDetections]
    var totalCount: js.UndefOr[__long]
  }

  object CustomDataIdentifiers {
    @inline
    def apply(
        detections: js.UndefOr[CustomDetections] = js.undefined,
        totalCount: js.UndefOr[__long] = js.undefined
    ): CustomDataIdentifiers = {
      val __obj = js.Dynamic.literal()
      detections.foreach(__v => __obj.updateDynamic("detections")(__v.asInstanceOf[js.Any]))
      totalCount.foreach(__v => __obj.updateDynamic("totalCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomDataIdentifiers]
    }
  }

  /** Provides information about a custom data identifier that produced a sensitive data finding, and the sensitive data that it detected for the finding.
    */
  @js.native
  trait CustomDetection extends js.Object {
    var arn: js.UndefOr[__string]
    var count: js.UndefOr[__long]
    var name: js.UndefOr[__string]
    var occurrences: js.UndefOr[Occurrences]
  }

  object CustomDetection {
    @inline
    def apply(
        arn: js.UndefOr[__string] = js.undefined,
        count: js.UndefOr[__long] = js.undefined,
        name: js.UndefOr[__string] = js.undefined,
        occurrences: js.UndefOr[Occurrences] = js.undefined
    ): CustomDetection = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      count.foreach(__v => __obj.updateDynamic("count")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      occurrences.foreach(__v => __obj.updateDynamic("occurrences")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomDetection]
    }
  }

  /** Specifies that a classification job runs once a day, every day. This is an empty object.
    */
  @js.native
  trait DailySchedule extends js.Object

  object DailySchedule {
    @inline
    def apply(): DailySchedule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DailySchedule]
    }
  }

  @js.native
  trait DeclineInvitationsRequest extends js.Object {
    var accountIds: __listOf__string
  }

  object DeclineInvitationsRequest {
    @inline
    def apply(
        accountIds: __listOf__string
    ): DeclineInvitationsRequest = {
      val __obj = js.Dynamic.literal(
        "accountIds" -> accountIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeclineInvitationsRequest]
    }
  }

  @js.native
  trait DeclineInvitationsResponse extends js.Object {
    var unprocessedAccounts: js.UndefOr[__listOfUnprocessedAccount]
  }

  object DeclineInvitationsResponse {
    @inline
    def apply(
        unprocessedAccounts: js.UndefOr[__listOfUnprocessedAccount] = js.undefined
    ): DeclineInvitationsResponse = {
      val __obj = js.Dynamic.literal()
      unprocessedAccounts.foreach(__v => __obj.updateDynamic("unprocessedAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeclineInvitationsResponse]
    }
  }

  /** Provides information about a type of sensitive data that was detected by a managed data identifier and produced a sensitive data finding.
    */
  @js.native
  trait DefaultDetection extends js.Object {
    var count: js.UndefOr[__long]
    var occurrences: js.UndefOr[Occurrences]
    var `type`: js.UndefOr[__string]
  }

  object DefaultDetection {
    @inline
    def apply(
        count: js.UndefOr[__long] = js.undefined,
        occurrences: js.UndefOr[Occurrences] = js.undefined,
        `type`: js.UndefOr[__string] = js.undefined
    ): DefaultDetection = {
      val __obj = js.Dynamic.literal()
      count.foreach(__v => __obj.updateDynamic("count")(__v.asInstanceOf[js.Any]))
      occurrences.foreach(__v => __obj.updateDynamic("occurrences")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultDetection]
    }
  }

  @js.native
  trait DeleteCustomDataIdentifierRequest extends js.Object {
    var id: __string
  }

  object DeleteCustomDataIdentifierRequest {
    @inline
    def apply(
        id: __string
    ): DeleteCustomDataIdentifierRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCustomDataIdentifierRequest]
    }
  }

  @js.native
  trait DeleteCustomDataIdentifierResponse extends js.Object

  object DeleteCustomDataIdentifierResponse {
    @inline
    def apply(): DeleteCustomDataIdentifierResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteCustomDataIdentifierResponse]
    }
  }

  @js.native
  trait DeleteFindingsFilterRequest extends js.Object {
    var id: __string
  }

  object DeleteFindingsFilterRequest {
    @inline
    def apply(
        id: __string
    ): DeleteFindingsFilterRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFindingsFilterRequest]
    }
  }

  @js.native
  trait DeleteFindingsFilterResponse extends js.Object

  object DeleteFindingsFilterResponse {
    @inline
    def apply(): DeleteFindingsFilterResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteFindingsFilterResponse]
    }
  }

  @js.native
  trait DeleteInvitationsRequest extends js.Object {
    var accountIds: __listOf__string
  }

  object DeleteInvitationsRequest {
    @inline
    def apply(
        accountIds: __listOf__string
    ): DeleteInvitationsRequest = {
      val __obj = js.Dynamic.literal(
        "accountIds" -> accountIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteInvitationsRequest]
    }
  }

  @js.native
  trait DeleteInvitationsResponse extends js.Object {
    var unprocessedAccounts: js.UndefOr[__listOfUnprocessedAccount]
  }

  object DeleteInvitationsResponse {
    @inline
    def apply(
        unprocessedAccounts: js.UndefOr[__listOfUnprocessedAccount] = js.undefined
    ): DeleteInvitationsResponse = {
      val __obj = js.Dynamic.literal()
      unprocessedAccounts.foreach(__v => __obj.updateDynamic("unprocessedAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteInvitationsResponse]
    }
  }

  @js.native
  trait DeleteMemberRequest extends js.Object {
    var id: __string
  }

  object DeleteMemberRequest {
    @inline
    def apply(
        id: __string
    ): DeleteMemberRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMemberRequest]
    }
  }

  @js.native
  trait DeleteMemberResponse extends js.Object

  object DeleteMemberResponse {
    @inline
    def apply(): DeleteMemberResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteMemberResponse]
    }
  }

  @js.native
  trait DescribeBucketsRequest extends js.Object {
    var criteria: js.UndefOr[BucketCriteria]
    var maxResults: js.UndefOr[__integer]
    var nextToken: js.UndefOr[__string]
    var sortCriteria: js.UndefOr[BucketSortCriteria]
  }

  object DescribeBucketsRequest {
    @inline
    def apply(
        criteria: js.UndefOr[BucketCriteria] = js.undefined,
        maxResults: js.UndefOr[__integer] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined,
        sortCriteria: js.UndefOr[BucketSortCriteria] = js.undefined
    ): DescribeBucketsRequest = {
      val __obj = js.Dynamic.literal()
      criteria.foreach(__v => __obj.updateDynamic("criteria")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortCriteria.foreach(__v => __obj.updateDynamic("sortCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBucketsRequest]
    }
  }

  @js.native
  trait DescribeBucketsResponse extends js.Object {
    var buckets: js.UndefOr[__listOfBucketMetadata]
    var nextToken: js.UndefOr[__string]
  }

  object DescribeBucketsResponse {
    @inline
    def apply(
        buckets: js.UndefOr[__listOfBucketMetadata] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined
    ): DescribeBucketsResponse = {
      val __obj = js.Dynamic.literal()
      buckets.foreach(__v => __obj.updateDynamic("buckets")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBucketsResponse]
    }
  }

  @js.native
  trait DescribeClassificationJobRequest extends js.Object {
    var jobId: __string
  }

  object DescribeClassificationJobRequest {
    @inline
    def apply(
        jobId: __string
    ): DescribeClassificationJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeClassificationJobRequest]
    }
  }

  @js.native
  trait DescribeClassificationJobResponse extends js.Object {
    var clientToken: js.UndefOr[__string]
    var createdAt: js.UndefOr[__timestampIso8601]
    var customDataIdentifierIds: js.UndefOr[__listOf__string]
    var description: js.UndefOr[__string]
    var initialRun: js.UndefOr[__boolean]
    var jobArn: js.UndefOr[__string]
    var jobId: js.UndefOr[__string]
    var jobStatus: js.UndefOr[JobStatus]
    var jobType: js.UndefOr[JobType]
    var lastRunErrorStatus: js.UndefOr[LastRunErrorStatus]
    var lastRunTime: js.UndefOr[__timestampIso8601]
    var managedDataIdentifierIds: js.UndefOr[__listOf__string]
    var managedDataIdentifierSelector: js.UndefOr[ManagedDataIdentifierSelector]
    var name: js.UndefOr[__string]
    var s3JobDefinition: js.UndefOr[S3JobDefinition]
    var samplingPercentage: js.UndefOr[__integer]
    var scheduleFrequency: js.UndefOr[JobScheduleFrequency]
    var statistics: js.UndefOr[Statistics]
    var tags: js.UndefOr[TagMap]
    var userPausedDetails: js.UndefOr[UserPausedDetails]
  }

  object DescribeClassificationJobResponse {
    @inline
    def apply(
        clientToken: js.UndefOr[__string] = js.undefined,
        createdAt: js.UndefOr[__timestampIso8601] = js.undefined,
        customDataIdentifierIds: js.UndefOr[__listOf__string] = js.undefined,
        description: js.UndefOr[__string] = js.undefined,
        initialRun: js.UndefOr[__boolean] = js.undefined,
        jobArn: js.UndefOr[__string] = js.undefined,
        jobId: js.UndefOr[__string] = js.undefined,
        jobStatus: js.UndefOr[JobStatus] = js.undefined,
        jobType: js.UndefOr[JobType] = js.undefined,
        lastRunErrorStatus: js.UndefOr[LastRunErrorStatus] = js.undefined,
        lastRunTime: js.UndefOr[__timestampIso8601] = js.undefined,
        managedDataIdentifierIds: js.UndefOr[__listOf__string] = js.undefined,
        managedDataIdentifierSelector: js.UndefOr[ManagedDataIdentifierSelector] = js.undefined,
        name: js.UndefOr[__string] = js.undefined,
        s3JobDefinition: js.UndefOr[S3JobDefinition] = js.undefined,
        samplingPercentage: js.UndefOr[__integer] = js.undefined,
        scheduleFrequency: js.UndefOr[JobScheduleFrequency] = js.undefined,
        statistics: js.UndefOr[Statistics] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        userPausedDetails: js.UndefOr[UserPausedDetails] = js.undefined
    ): DescribeClassificationJobResponse = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      customDataIdentifierIds.foreach(__v => __obj.updateDynamic("customDataIdentifierIds")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      initialRun.foreach(__v => __obj.updateDynamic("initialRun")(__v.asInstanceOf[js.Any]))
      jobArn.foreach(__v => __obj.updateDynamic("jobArn")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      jobStatus.foreach(__v => __obj.updateDynamic("jobStatus")(__v.asInstanceOf[js.Any]))
      jobType.foreach(__v => __obj.updateDynamic("jobType")(__v.asInstanceOf[js.Any]))
      lastRunErrorStatus.foreach(__v => __obj.updateDynamic("lastRunErrorStatus")(__v.asInstanceOf[js.Any]))
      lastRunTime.foreach(__v => __obj.updateDynamic("lastRunTime")(__v.asInstanceOf[js.Any]))
      managedDataIdentifierIds.foreach(__v => __obj.updateDynamic("managedDataIdentifierIds")(__v.asInstanceOf[js.Any]))
      managedDataIdentifierSelector.foreach(__v => __obj.updateDynamic("managedDataIdentifierSelector")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      s3JobDefinition.foreach(__v => __obj.updateDynamic("s3JobDefinition")(__v.asInstanceOf[js.Any]))
      samplingPercentage.foreach(__v => __obj.updateDynamic("samplingPercentage")(__v.asInstanceOf[js.Any]))
      scheduleFrequency.foreach(__v => __obj.updateDynamic("scheduleFrequency")(__v.asInstanceOf[js.Any]))
      statistics.foreach(__v => __obj.updateDynamic("statistics")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      userPausedDetails.foreach(__v => __obj.updateDynamic("userPausedDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClassificationJobResponse]
    }
  }

  @js.native
  trait DescribeOrganizationConfigurationRequest extends js.Object

  object DescribeOrganizationConfigurationRequest {
    @inline
    def apply(): DescribeOrganizationConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeOrganizationConfigurationRequest]
    }
  }

  @js.native
  trait DescribeOrganizationConfigurationResponse extends js.Object {
    var autoEnable: js.UndefOr[__boolean]
    var maxAccountLimitReached: js.UndefOr[__boolean]
  }

  object DescribeOrganizationConfigurationResponse {
    @inline
    def apply(
        autoEnable: js.UndefOr[__boolean] = js.undefined,
        maxAccountLimitReached: js.UndefOr[__boolean] = js.undefined
    ): DescribeOrganizationConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      autoEnable.foreach(__v => __obj.updateDynamic("autoEnable")(__v.asInstanceOf[js.Any]))
      maxAccountLimitReached.foreach(__v => __obj.updateDynamic("maxAccountLimitReached")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOrganizationConfigurationResponse]
    }
  }

  @js.native
  trait DisableMacieRequest extends js.Object

  object DisableMacieRequest {
    @inline
    def apply(): DisableMacieRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableMacieRequest]
    }
  }

  @js.native
  trait DisableMacieResponse extends js.Object

  object DisableMacieResponse {
    @inline
    def apply(): DisableMacieResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableMacieResponse]
    }
  }

  @js.native
  trait DisableOrganizationAdminAccountRequest extends js.Object {
    var adminAccountId: __string
  }

  object DisableOrganizationAdminAccountRequest {
    @inline
    def apply(
        adminAccountId: __string
    ): DisableOrganizationAdminAccountRequest = {
      val __obj = js.Dynamic.literal(
        "adminAccountId" -> adminAccountId.asInstanceOf[js.Any]
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
  trait DisassociateFromAdministratorAccountRequest extends js.Object

  object DisassociateFromAdministratorAccountRequest {
    @inline
    def apply(): DisassociateFromAdministratorAccountRequest = {
      val __obj = js.Dynamic.literal()
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

  @js.native
  trait DisassociateFromMasterAccountRequest extends js.Object

  object DisassociateFromMasterAccountRequest {
    @inline
    def apply(): DisassociateFromMasterAccountRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateFromMasterAccountRequest]
    }
  }

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
  trait DisassociateMemberRequest extends js.Object {
    var id: __string
  }

  object DisassociateMemberRequest {
    @inline
    def apply(
        id: __string
    ): DisassociateMemberRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateMemberRequest]
    }
  }

  @js.native
  trait DisassociateMemberResponse extends js.Object

  object DisassociateMemberResponse {
    @inline
    def apply(): DisassociateMemberResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateMemberResponse]
    }
  }

  /** Provides information about the domain name of the device that an entity used to perform an action on an affected resource.
    */
  @js.native
  trait DomainDetails extends js.Object {
    var domainName: js.UndefOr[__string]
  }

  object DomainDetails {
    @inline
    def apply(
        domainName: js.UndefOr[__string] = js.undefined
    ): DomainDetails = {
      val __obj = js.Dynamic.literal()
      domainName.foreach(__v => __obj.updateDynamic("domainName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainDetails]
    }
  }

  @js.native
  trait EnableMacieRequest extends js.Object {
    var clientToken: js.UndefOr[__string]
    var findingPublishingFrequency: js.UndefOr[FindingPublishingFrequency]
    var status: js.UndefOr[MacieStatus]
  }

  object EnableMacieRequest {
    @inline
    def apply(
        clientToken: js.UndefOr[__string] = js.undefined,
        findingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined,
        status: js.UndefOr[MacieStatus] = js.undefined
    ): EnableMacieRequest = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      findingPublishingFrequency.foreach(__v => __obj.updateDynamic("findingPublishingFrequency")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableMacieRequest]
    }
  }

  @js.native
  trait EnableMacieResponse extends js.Object

  object EnableMacieResponse {
    @inline
    def apply(): EnableMacieResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableMacieResponse]
    }
  }

  @js.native
  trait EnableOrganizationAdminAccountRequest extends js.Object {
    var adminAccountId: __string
    var clientToken: js.UndefOr[__string]
  }

  object EnableOrganizationAdminAccountRequest {
    @inline
    def apply(
        adminAccountId: __string,
        clientToken: js.UndefOr[__string] = js.undefined
    ): EnableOrganizationAdminAccountRequest = {
      val __obj = js.Dynamic.literal(
        "adminAccountId" -> adminAccountId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
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

  /** Provides information about an identity that performed an action on an affected resource by using temporary security credentials. The credentials were obtained using the GetFederationToken operation of the Security Token Service (STS) API.
    */
  @js.native
  trait FederatedUser extends js.Object {
    var accessKeyId: js.UndefOr[__string]
    var accountId: js.UndefOr[__string]
    var arn: js.UndefOr[__string]
    var principalId: js.UndefOr[__string]
    var sessionContext: js.UndefOr[SessionContext]
  }

  object FederatedUser {
    @inline
    def apply(
        accessKeyId: js.UndefOr[__string] = js.undefined,
        accountId: js.UndefOr[__string] = js.undefined,
        arn: js.UndefOr[__string] = js.undefined,
        principalId: js.UndefOr[__string] = js.undefined,
        sessionContext: js.UndefOr[SessionContext] = js.undefined
    ): FederatedUser = {
      val __obj = js.Dynamic.literal()
      accessKeyId.foreach(__v => __obj.updateDynamic("accessKeyId")(__v.asInstanceOf[js.Any]))
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      principalId.foreach(__v => __obj.updateDynamic("principalId")(__v.asInstanceOf[js.Any]))
      sessionContext.foreach(__v => __obj.updateDynamic("sessionContext")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FederatedUser]
    }
  }

  /** Provides the details of a finding.
    */
  @js.native
  trait Finding extends js.Object {
    var accountId: js.UndefOr[__string]
    var archived: js.UndefOr[__boolean]
    var category: js.UndefOr[FindingCategory]
    var classificationDetails: js.UndefOr[ClassificationDetails]
    var count: js.UndefOr[__long]
    var createdAt: js.UndefOr[__timestampIso8601]
    var description: js.UndefOr[__string]
    var id: js.UndefOr[__string]
    var partition: js.UndefOr[__string]
    var policyDetails: js.UndefOr[PolicyDetails]
    var region: js.UndefOr[__string]
    var resourcesAffected: js.UndefOr[ResourcesAffected]
    var sample: js.UndefOr[__boolean]
    var schemaVersion: js.UndefOr[__string]
    var severity: js.UndefOr[Severity]
    var title: js.UndefOr[__string]
    var `type`: js.UndefOr[FindingType]
    var updatedAt: js.UndefOr[__timestampIso8601]
  }

  object Finding {
    @inline
    def apply(
        accountId: js.UndefOr[__string] = js.undefined,
        archived: js.UndefOr[__boolean] = js.undefined,
        category: js.UndefOr[FindingCategory] = js.undefined,
        classificationDetails: js.UndefOr[ClassificationDetails] = js.undefined,
        count: js.UndefOr[__long] = js.undefined,
        createdAt: js.UndefOr[__timestampIso8601] = js.undefined,
        description: js.UndefOr[__string] = js.undefined,
        id: js.UndefOr[__string] = js.undefined,
        partition: js.UndefOr[__string] = js.undefined,
        policyDetails: js.UndefOr[PolicyDetails] = js.undefined,
        region: js.UndefOr[__string] = js.undefined,
        resourcesAffected: js.UndefOr[ResourcesAffected] = js.undefined,
        sample: js.UndefOr[__boolean] = js.undefined,
        schemaVersion: js.UndefOr[__string] = js.undefined,
        severity: js.UndefOr[Severity] = js.undefined,
        title: js.UndefOr[__string] = js.undefined,
        `type`: js.UndefOr[FindingType] = js.undefined,
        updatedAt: js.UndefOr[__timestampIso8601] = js.undefined
    ): Finding = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      archived.foreach(__v => __obj.updateDynamic("archived")(__v.asInstanceOf[js.Any]))
      category.foreach(__v => __obj.updateDynamic("category")(__v.asInstanceOf[js.Any]))
      classificationDetails.foreach(__v => __obj.updateDynamic("classificationDetails")(__v.asInstanceOf[js.Any]))
      count.foreach(__v => __obj.updateDynamic("count")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      partition.foreach(__v => __obj.updateDynamic("partition")(__v.asInstanceOf[js.Any]))
      policyDetails.foreach(__v => __obj.updateDynamic("policyDetails")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      resourcesAffected.foreach(__v => __obj.updateDynamic("resourcesAffected")(__v.asInstanceOf[js.Any]))
      sample.foreach(__v => __obj.updateDynamic("sample")(__v.asInstanceOf[js.Any]))
      schemaVersion.foreach(__v => __obj.updateDynamic("schemaVersion")(__v.asInstanceOf[js.Any]))
      severity.foreach(__v => __obj.updateDynamic("severity")(__v.asInstanceOf[js.Any]))
      title.foreach(__v => __obj.updateDynamic("title")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Finding]
    }
  }

  /** Provides information about an action that occurred for a resource and produced a policy finding.
    */
  @js.native
  trait FindingAction extends js.Object {
    var actionType: js.UndefOr[FindingActionType]
    var apiCallDetails: js.UndefOr[ApiCallDetails]
  }

  object FindingAction {
    @inline
    def apply(
        actionType: js.UndefOr[FindingActionType] = js.undefined,
        apiCallDetails: js.UndefOr[ApiCallDetails] = js.undefined
    ): FindingAction = {
      val __obj = js.Dynamic.literal()
      actionType.foreach(__v => __obj.updateDynamic("actionType")(__v.asInstanceOf[js.Any]))
      apiCallDetails.foreach(__v => __obj.updateDynamic("apiCallDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingAction]
    }
  }

  /** Provides information about an entity that performed an action that produced a policy finding for a resource.
    */
  @js.native
  trait FindingActor extends js.Object {
    var domainDetails: js.UndefOr[DomainDetails]
    var ipAddressDetails: js.UndefOr[IpAddressDetails]
    var userIdentity: js.UndefOr[UserIdentity]
  }

  object FindingActor {
    @inline
    def apply(
        domainDetails: js.UndefOr[DomainDetails] = js.undefined,
        ipAddressDetails: js.UndefOr[IpAddressDetails] = js.undefined,
        userIdentity: js.UndefOr[UserIdentity] = js.undefined
    ): FindingActor = {
      val __obj = js.Dynamic.literal()
      domainDetails.foreach(__v => __obj.updateDynamic("domainDetails")(__v.asInstanceOf[js.Any]))
      ipAddressDetails.foreach(__v => __obj.updateDynamic("ipAddressDetails")(__v.asInstanceOf[js.Any]))
      userIdentity.foreach(__v => __obj.updateDynamic("userIdentity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingActor]
    }
  }

  /** Specifies, as a map, one or more property-based conditions that filter the results of a query for findings.
    */
  @js.native
  trait FindingCriteria extends js.Object {
    var criterion: js.UndefOr[Criterion]
  }

  object FindingCriteria {
    @inline
    def apply(
        criterion: js.UndefOr[Criterion] = js.undefined
    ): FindingCriteria = {
      val __obj = js.Dynamic.literal()
      criterion.foreach(__v => __obj.updateDynamic("criterion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingCriteria]
    }
  }

  /** Specifies criteria for sorting the results of a query that retrieves aggregated statistical data about findings.
    */
  @js.native
  trait FindingStatisticsSortCriteria extends js.Object {
    var attributeName: js.UndefOr[FindingStatisticsSortAttributeName]
    var orderBy: js.UndefOr[OrderBy]
  }

  object FindingStatisticsSortCriteria {
    @inline
    def apply(
        attributeName: js.UndefOr[FindingStatisticsSortAttributeName] = js.undefined,
        orderBy: js.UndefOr[OrderBy] = js.undefined
    ): FindingStatisticsSortCriteria = {
      val __obj = js.Dynamic.literal()
      attributeName.foreach(__v => __obj.updateDynamic("attributeName")(__v.asInstanceOf[js.Any]))
      orderBy.foreach(__v => __obj.updateDynamic("orderBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingStatisticsSortCriteria]
    }
  }

  /** Provides information about a findings filter.
    */
  @js.native
  trait FindingsFilterListItem extends js.Object {
    var action: js.UndefOr[FindingsFilterAction]
    var arn: js.UndefOr[__string]
    var id: js.UndefOr[__string]
    var name: js.UndefOr[__string]
    var tags: js.UndefOr[TagMap]
  }

  object FindingsFilterListItem {
    @inline
    def apply(
        action: js.UndefOr[FindingsFilterAction] = js.undefined,
        arn: js.UndefOr[__string] = js.undefined,
        id: js.UndefOr[__string] = js.undefined,
        name: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): FindingsFilterListItem = {
      val __obj = js.Dynamic.literal()
      action.foreach(__v => __obj.updateDynamic("action")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingsFilterListItem]
    }
  }

  @js.native
  trait GetAdministratorAccountRequest extends js.Object

  object GetAdministratorAccountRequest {
    @inline
    def apply(): GetAdministratorAccountRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAdministratorAccountRequest]
    }
  }

  @js.native
  trait GetAdministratorAccountResponse extends js.Object {
    var administrator: js.UndefOr[Invitation]
  }

  object GetAdministratorAccountResponse {
    @inline
    def apply(
        administrator: js.UndefOr[Invitation] = js.undefined
    ): GetAdministratorAccountResponse = {
      val __obj = js.Dynamic.literal()
      administrator.foreach(__v => __obj.updateDynamic("administrator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAdministratorAccountResponse]
    }
  }

  @js.native
  trait GetBucketStatisticsRequest extends js.Object {
    var accountId: js.UndefOr[__string]
  }

  object GetBucketStatisticsRequest {
    @inline
    def apply(
        accountId: js.UndefOr[__string] = js.undefined
    ): GetBucketStatisticsRequest = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketStatisticsRequest]
    }
  }

  @js.native
  trait GetBucketStatisticsResponse extends js.Object {
    var bucketCount: js.UndefOr[__long]
    var bucketCountByEffectivePermission: js.UndefOr[BucketCountByEffectivePermission]
    var bucketCountByEncryptionType: js.UndefOr[BucketCountByEncryptionType]
    var bucketCountByObjectEncryptionRequirement: js.UndefOr[BucketCountPolicyAllowsUnencryptedObjectUploads]
    var bucketCountBySharedAccessType: js.UndefOr[BucketCountBySharedAccessType]
    var classifiableObjectCount: js.UndefOr[__long]
    var classifiableSizeInBytes: js.UndefOr[__long]
    var lastUpdated: js.UndefOr[__timestampIso8601]
    var objectCount: js.UndefOr[__long]
    var sizeInBytes: js.UndefOr[__long]
    var sizeInBytesCompressed: js.UndefOr[__long]
    var unclassifiableObjectCount: js.UndefOr[ObjectLevelStatistics]
    var unclassifiableObjectSizeInBytes: js.UndefOr[ObjectLevelStatistics]
  }

  object GetBucketStatisticsResponse {
    @inline
    def apply(
        bucketCount: js.UndefOr[__long] = js.undefined,
        bucketCountByEffectivePermission: js.UndefOr[BucketCountByEffectivePermission] = js.undefined,
        bucketCountByEncryptionType: js.UndefOr[BucketCountByEncryptionType] = js.undefined,
        bucketCountByObjectEncryptionRequirement: js.UndefOr[BucketCountPolicyAllowsUnencryptedObjectUploads] = js.undefined,
        bucketCountBySharedAccessType: js.UndefOr[BucketCountBySharedAccessType] = js.undefined,
        classifiableObjectCount: js.UndefOr[__long] = js.undefined,
        classifiableSizeInBytes: js.UndefOr[__long] = js.undefined,
        lastUpdated: js.UndefOr[__timestampIso8601] = js.undefined,
        objectCount: js.UndefOr[__long] = js.undefined,
        sizeInBytes: js.UndefOr[__long] = js.undefined,
        sizeInBytesCompressed: js.UndefOr[__long] = js.undefined,
        unclassifiableObjectCount: js.UndefOr[ObjectLevelStatistics] = js.undefined,
        unclassifiableObjectSizeInBytes: js.UndefOr[ObjectLevelStatistics] = js.undefined
    ): GetBucketStatisticsResponse = {
      val __obj = js.Dynamic.literal()
      bucketCount.foreach(__v => __obj.updateDynamic("bucketCount")(__v.asInstanceOf[js.Any]))
      bucketCountByEffectivePermission.foreach(__v => __obj.updateDynamic("bucketCountByEffectivePermission")(__v.asInstanceOf[js.Any]))
      bucketCountByEncryptionType.foreach(__v => __obj.updateDynamic("bucketCountByEncryptionType")(__v.asInstanceOf[js.Any]))
      bucketCountByObjectEncryptionRequirement.foreach(__v => __obj.updateDynamic("bucketCountByObjectEncryptionRequirement")(__v.asInstanceOf[js.Any]))
      bucketCountBySharedAccessType.foreach(__v => __obj.updateDynamic("bucketCountBySharedAccessType")(__v.asInstanceOf[js.Any]))
      classifiableObjectCount.foreach(__v => __obj.updateDynamic("classifiableObjectCount")(__v.asInstanceOf[js.Any]))
      classifiableSizeInBytes.foreach(__v => __obj.updateDynamic("classifiableSizeInBytes")(__v.asInstanceOf[js.Any]))
      lastUpdated.foreach(__v => __obj.updateDynamic("lastUpdated")(__v.asInstanceOf[js.Any]))
      objectCount.foreach(__v => __obj.updateDynamic("objectCount")(__v.asInstanceOf[js.Any]))
      sizeInBytes.foreach(__v => __obj.updateDynamic("sizeInBytes")(__v.asInstanceOf[js.Any]))
      sizeInBytesCompressed.foreach(__v => __obj.updateDynamic("sizeInBytesCompressed")(__v.asInstanceOf[js.Any]))
      unclassifiableObjectCount.foreach(__v => __obj.updateDynamic("unclassifiableObjectCount")(__v.asInstanceOf[js.Any]))
      unclassifiableObjectSizeInBytes.foreach(__v => __obj.updateDynamic("unclassifiableObjectSizeInBytes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketStatisticsResponse]
    }
  }

  @js.native
  trait GetClassificationExportConfigurationRequest extends js.Object

  object GetClassificationExportConfigurationRequest {
    @inline
    def apply(): GetClassificationExportConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetClassificationExportConfigurationRequest]
    }
  }

  @js.native
  trait GetClassificationExportConfigurationResponse extends js.Object {
    var configuration: js.UndefOr[ClassificationExportConfiguration]
  }

  object GetClassificationExportConfigurationResponse {
    @inline
    def apply(
        configuration: js.UndefOr[ClassificationExportConfiguration] = js.undefined
    ): GetClassificationExportConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      configuration.foreach(__v => __obj.updateDynamic("configuration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetClassificationExportConfigurationResponse]
    }
  }

  @js.native
  trait GetCustomDataIdentifierRequest extends js.Object {
    var id: __string
  }

  object GetCustomDataIdentifierRequest {
    @inline
    def apply(
        id: __string
    ): GetCustomDataIdentifierRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCustomDataIdentifierRequest]
    }
  }

  @js.native
  trait GetCustomDataIdentifierResponse extends js.Object {
    var arn: js.UndefOr[__string]
    var createdAt: js.UndefOr[__timestampIso8601]
    var deleted: js.UndefOr[__boolean]
    var description: js.UndefOr[__string]
    var id: js.UndefOr[__string]
    var ignoreWords: js.UndefOr[__listOf__string]
    var keywords: js.UndefOr[__listOf__string]
    var maximumMatchDistance: js.UndefOr[__integer]
    var name: js.UndefOr[__string]
    var regex: js.UndefOr[__string]
    var severityLevels: js.UndefOr[SeverityLevelList]
    var tags: js.UndefOr[TagMap]
  }

  object GetCustomDataIdentifierResponse {
    @inline
    def apply(
        arn: js.UndefOr[__string] = js.undefined,
        createdAt: js.UndefOr[__timestampIso8601] = js.undefined,
        deleted: js.UndefOr[__boolean] = js.undefined,
        description: js.UndefOr[__string] = js.undefined,
        id: js.UndefOr[__string] = js.undefined,
        ignoreWords: js.UndefOr[__listOf__string] = js.undefined,
        keywords: js.UndefOr[__listOf__string] = js.undefined,
        maximumMatchDistance: js.UndefOr[__integer] = js.undefined,
        name: js.UndefOr[__string] = js.undefined,
        regex: js.UndefOr[__string] = js.undefined,
        severityLevels: js.UndefOr[SeverityLevelList] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): GetCustomDataIdentifierResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      deleted.foreach(__v => __obj.updateDynamic("deleted")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      ignoreWords.foreach(__v => __obj.updateDynamic("ignoreWords")(__v.asInstanceOf[js.Any]))
      keywords.foreach(__v => __obj.updateDynamic("keywords")(__v.asInstanceOf[js.Any]))
      maximumMatchDistance.foreach(__v => __obj.updateDynamic("maximumMatchDistance")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      regex.foreach(__v => __obj.updateDynamic("regex")(__v.asInstanceOf[js.Any]))
      severityLevels.foreach(__v => __obj.updateDynamic("severityLevels")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCustomDataIdentifierResponse]
    }
  }

  @js.native
  trait GetFindingStatisticsRequest extends js.Object {
    var groupBy: GroupBy
    var findingCriteria: js.UndefOr[FindingCriteria]
    var size: js.UndefOr[__integer]
    var sortCriteria: js.UndefOr[FindingStatisticsSortCriteria]
  }

  object GetFindingStatisticsRequest {
    @inline
    def apply(
        groupBy: GroupBy,
        findingCriteria: js.UndefOr[FindingCriteria] = js.undefined,
        size: js.UndefOr[__integer] = js.undefined,
        sortCriteria: js.UndefOr[FindingStatisticsSortCriteria] = js.undefined
    ): GetFindingStatisticsRequest = {
      val __obj = js.Dynamic.literal(
        "groupBy" -> groupBy.asInstanceOf[js.Any]
      )

      findingCriteria.foreach(__v => __obj.updateDynamic("findingCriteria")(__v.asInstanceOf[js.Any]))
      size.foreach(__v => __obj.updateDynamic("size")(__v.asInstanceOf[js.Any]))
      sortCriteria.foreach(__v => __obj.updateDynamic("sortCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFindingStatisticsRequest]
    }
  }

  @js.native
  trait GetFindingStatisticsResponse extends js.Object {
    var countsByGroup: js.UndefOr[__listOfGroupCount]
  }

  object GetFindingStatisticsResponse {
    @inline
    def apply(
        countsByGroup: js.UndefOr[__listOfGroupCount] = js.undefined
    ): GetFindingStatisticsResponse = {
      val __obj = js.Dynamic.literal()
      countsByGroup.foreach(__v => __obj.updateDynamic("countsByGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFindingStatisticsResponse]
    }
  }

  @js.native
  trait GetFindingsFilterRequest extends js.Object {
    var id: __string
  }

  object GetFindingsFilterRequest {
    @inline
    def apply(
        id: __string
    ): GetFindingsFilterRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFindingsFilterRequest]
    }
  }

  @js.native
  trait GetFindingsFilterResponse extends js.Object {
    var action: js.UndefOr[FindingsFilterAction]
    var arn: js.UndefOr[__string]
    var description: js.UndefOr[__string]
    var findingCriteria: js.UndefOr[FindingCriteria]
    var id: js.UndefOr[__string]
    var name: js.UndefOr[__string]
    var position: js.UndefOr[__integer]
    var tags: js.UndefOr[TagMap]
  }

  object GetFindingsFilterResponse {
    @inline
    def apply(
        action: js.UndefOr[FindingsFilterAction] = js.undefined,
        arn: js.UndefOr[__string] = js.undefined,
        description: js.UndefOr[__string] = js.undefined,
        findingCriteria: js.UndefOr[FindingCriteria] = js.undefined,
        id: js.UndefOr[__string] = js.undefined,
        name: js.UndefOr[__string] = js.undefined,
        position: js.UndefOr[__integer] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): GetFindingsFilterResponse = {
      val __obj = js.Dynamic.literal()
      action.foreach(__v => __obj.updateDynamic("action")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      findingCriteria.foreach(__v => __obj.updateDynamic("findingCriteria")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.updateDynamic("position")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFindingsFilterResponse]
    }
  }

  @js.native
  trait GetFindingsPublicationConfigurationRequest extends js.Object

  object GetFindingsPublicationConfigurationRequest {
    @inline
    def apply(): GetFindingsPublicationConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetFindingsPublicationConfigurationRequest]
    }
  }

  @js.native
  trait GetFindingsPublicationConfigurationResponse extends js.Object {
    var securityHubConfiguration: js.UndefOr[SecurityHubConfiguration]
  }

  object GetFindingsPublicationConfigurationResponse {
    @inline
    def apply(
        securityHubConfiguration: js.UndefOr[SecurityHubConfiguration] = js.undefined
    ): GetFindingsPublicationConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      securityHubConfiguration.foreach(__v => __obj.updateDynamic("securityHubConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFindingsPublicationConfigurationResponse]
    }
  }

  @js.native
  trait GetFindingsRequest extends js.Object {
    var findingIds: __listOf__string
    var sortCriteria: js.UndefOr[SortCriteria]
  }

  object GetFindingsRequest {
    @inline
    def apply(
        findingIds: __listOf__string,
        sortCriteria: js.UndefOr[SortCriteria] = js.undefined
    ): GetFindingsRequest = {
      val __obj = js.Dynamic.literal(
        "findingIds" -> findingIds.asInstanceOf[js.Any]
      )

      sortCriteria.foreach(__v => __obj.updateDynamic("sortCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFindingsRequest]
    }
  }

  @js.native
  trait GetFindingsResponse extends js.Object {
    var findings: js.UndefOr[__listOfFinding]
  }

  object GetFindingsResponse {
    @inline
    def apply(
        findings: js.UndefOr[__listOfFinding] = js.undefined
    ): GetFindingsResponse = {
      val __obj = js.Dynamic.literal()
      findings.foreach(__v => __obj.updateDynamic("findings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFindingsResponse]
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
    var invitationsCount: js.UndefOr[__long]
  }

  object GetInvitationsCountResponse {
    @inline
    def apply(
        invitationsCount: js.UndefOr[__long] = js.undefined
    ): GetInvitationsCountResponse = {
      val __obj = js.Dynamic.literal()
      invitationsCount.foreach(__v => __obj.updateDynamic("invitationsCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInvitationsCountResponse]
    }
  }

  @js.native
  trait GetMacieSessionRequest extends js.Object

  object GetMacieSessionRequest {
    @inline
    def apply(): GetMacieSessionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetMacieSessionRequest]
    }
  }

  @js.native
  trait GetMacieSessionResponse extends js.Object {
    var createdAt: js.UndefOr[__timestampIso8601]
    var findingPublishingFrequency: js.UndefOr[FindingPublishingFrequency]
    var serviceRole: js.UndefOr[__string]
    var status: js.UndefOr[MacieStatus]
    var updatedAt: js.UndefOr[__timestampIso8601]
  }

  object GetMacieSessionResponse {
    @inline
    def apply(
        createdAt: js.UndefOr[__timestampIso8601] = js.undefined,
        findingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined,
        serviceRole: js.UndefOr[__string] = js.undefined,
        status: js.UndefOr[MacieStatus] = js.undefined,
        updatedAt: js.UndefOr[__timestampIso8601] = js.undefined
    ): GetMacieSessionResponse = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      findingPublishingFrequency.foreach(__v => __obj.updateDynamic("findingPublishingFrequency")(__v.asInstanceOf[js.Any]))
      serviceRole.foreach(__v => __obj.updateDynamic("serviceRole")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMacieSessionResponse]
    }
  }

  @js.native
  trait GetMasterAccountRequest extends js.Object

  object GetMasterAccountRequest {
    @inline
    def apply(): GetMasterAccountRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetMasterAccountRequest]
    }
  }

  @js.native
  trait GetMasterAccountResponse extends js.Object {
    var master: js.UndefOr[Invitation]
  }

  object GetMasterAccountResponse {
    @inline
    def apply(
        master: js.UndefOr[Invitation] = js.undefined
    ): GetMasterAccountResponse = {
      val __obj = js.Dynamic.literal()
      master.foreach(__v => __obj.updateDynamic("master")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMasterAccountResponse]
    }
  }

  @js.native
  trait GetMemberRequest extends js.Object {
    var id: __string
  }

  object GetMemberRequest {
    @inline
    def apply(
        id: __string
    ): GetMemberRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMemberRequest]
    }
  }

  @js.native
  trait GetMemberResponse extends js.Object {
    var accountId: js.UndefOr[__string]
    var administratorAccountId: js.UndefOr[__string]
    var arn: js.UndefOr[__string]
    var email: js.UndefOr[__string]
    var invitedAt: js.UndefOr[__timestampIso8601]
    var masterAccountId: js.UndefOr[__string]
    var relationshipStatus: js.UndefOr[RelationshipStatus]
    var tags: js.UndefOr[TagMap]
    var updatedAt: js.UndefOr[__timestampIso8601]
  }

  object GetMemberResponse {
    @inline
    def apply(
        accountId: js.UndefOr[__string] = js.undefined,
        administratorAccountId: js.UndefOr[__string] = js.undefined,
        arn: js.UndefOr[__string] = js.undefined,
        email: js.UndefOr[__string] = js.undefined,
        invitedAt: js.UndefOr[__timestampIso8601] = js.undefined,
        masterAccountId: js.UndefOr[__string] = js.undefined,
        relationshipStatus: js.UndefOr[RelationshipStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        updatedAt: js.UndefOr[__timestampIso8601] = js.undefined
    ): GetMemberResponse = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      administratorAccountId.foreach(__v => __obj.updateDynamic("administratorAccountId")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      email.foreach(__v => __obj.updateDynamic("email")(__v.asInstanceOf[js.Any]))
      invitedAt.foreach(__v => __obj.updateDynamic("invitedAt")(__v.asInstanceOf[js.Any]))
      masterAccountId.foreach(__v => __obj.updateDynamic("masterAccountId")(__v.asInstanceOf[js.Any]))
      relationshipStatus.foreach(__v => __obj.updateDynamic("relationshipStatus")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMemberResponse]
    }
  }

  @js.native
  trait GetUsageStatisticsRequest extends js.Object {
    var filterBy: js.UndefOr[__listOfUsageStatisticsFilter]
    var maxResults: js.UndefOr[__integer]
    var nextToken: js.UndefOr[__string]
    var sortBy: js.UndefOr[UsageStatisticsSortBy]
    var timeRange: js.UndefOr[TimeRange]
  }

  object GetUsageStatisticsRequest {
    @inline
    def apply(
        filterBy: js.UndefOr[__listOfUsageStatisticsFilter] = js.undefined,
        maxResults: js.UndefOr[__integer] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined,
        sortBy: js.UndefOr[UsageStatisticsSortBy] = js.undefined,
        timeRange: js.UndefOr[TimeRange] = js.undefined
    ): GetUsageStatisticsRequest = {
      val __obj = js.Dynamic.literal()
      filterBy.foreach(__v => __obj.updateDynamic("filterBy")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      timeRange.foreach(__v => __obj.updateDynamic("timeRange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUsageStatisticsRequest]
    }
  }

  @js.native
  trait GetUsageStatisticsResponse extends js.Object {
    var nextToken: js.UndefOr[__string]
    var records: js.UndefOr[__listOfUsageRecord]
    var timeRange: js.UndefOr[TimeRange]
  }

  object GetUsageStatisticsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[__string] = js.undefined,
        records: js.UndefOr[__listOfUsageRecord] = js.undefined,
        timeRange: js.UndefOr[TimeRange] = js.undefined
    ): GetUsageStatisticsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      records.foreach(__v => __obj.updateDynamic("records")(__v.asInstanceOf[js.Any]))
      timeRange.foreach(__v => __obj.updateDynamic("timeRange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUsageStatisticsResponse]
    }
  }

  @js.native
  trait GetUsageTotalsRequest extends js.Object {
    var timeRange: js.UndefOr[__string]
  }

  object GetUsageTotalsRequest {
    @inline
    def apply(
        timeRange: js.UndefOr[__string] = js.undefined
    ): GetUsageTotalsRequest = {
      val __obj = js.Dynamic.literal()
      timeRange.foreach(__v => __obj.updateDynamic("timeRange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUsageTotalsRequest]
    }
  }

  @js.native
  trait GetUsageTotalsResponse extends js.Object {
    var timeRange: js.UndefOr[TimeRange]
    var usageTotals: js.UndefOr[__listOfUsageTotal]
  }

  object GetUsageTotalsResponse {
    @inline
    def apply(
        timeRange: js.UndefOr[TimeRange] = js.undefined,
        usageTotals: js.UndefOr[__listOfUsageTotal] = js.undefined
    ): GetUsageTotalsResponse = {
      val __obj = js.Dynamic.literal()
      timeRange.foreach(__v => __obj.updateDynamic("timeRange")(__v.asInstanceOf[js.Any]))
      usageTotals.foreach(__v => __obj.updateDynamic("usageTotals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUsageTotalsResponse]
    }
  }

  /** Provides a group of results for a query that retrieved aggregated statistical data about findings.
    */
  @js.native
  trait GroupCount extends js.Object {
    var count: js.UndefOr[__long]
    var groupKey: js.UndefOr[__string]
  }

  object GroupCount {
    @inline
    def apply(
        count: js.UndefOr[__long] = js.undefined,
        groupKey: js.UndefOr[__string] = js.undefined
    ): GroupCount = {
      val __obj = js.Dynamic.literal()
      count.foreach(__v => __obj.updateDynamic("count")(__v.asInstanceOf[js.Any]))
      groupKey.foreach(__v => __obj.updateDynamic("groupKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupCount]
    }
  }

  /** Provides information about an Identity and Access Management (IAM) user who performed an action on an affected resource.
    */
  @js.native
  trait IamUser extends js.Object {
    var accountId: js.UndefOr[__string]
    var arn: js.UndefOr[__string]
    var principalId: js.UndefOr[__string]
    var userName: js.UndefOr[__string]
  }

  object IamUser {
    @inline
    def apply(
        accountId: js.UndefOr[__string] = js.undefined,
        arn: js.UndefOr[__string] = js.undefined,
        principalId: js.UndefOr[__string] = js.undefined,
        userName: js.UndefOr[__string] = js.undefined
    ): IamUser = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      principalId.foreach(__v => __obj.updateDynamic("principalId")(__v.asInstanceOf[js.Any]))
      userName.foreach(__v => __obj.updateDynamic("userName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IamUser]
    }
  }

  /** Provides information about an Amazon Macie membership invitation.
    */
  @js.native
  trait Invitation extends js.Object {
    var accountId: js.UndefOr[__string]
    var invitationId: js.UndefOr[__string]
    var invitedAt: js.UndefOr[__timestampIso8601]
    var relationshipStatus: js.UndefOr[RelationshipStatus]
  }

  object Invitation {
    @inline
    def apply(
        accountId: js.UndefOr[__string] = js.undefined,
        invitationId: js.UndefOr[__string] = js.undefined,
        invitedAt: js.UndefOr[__timestampIso8601] = js.undefined,
        relationshipStatus: js.UndefOr[RelationshipStatus] = js.undefined
    ): Invitation = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      invitationId.foreach(__v => __obj.updateDynamic("invitationId")(__v.asInstanceOf[js.Any]))
      invitedAt.foreach(__v => __obj.updateDynamic("invitedAt")(__v.asInstanceOf[js.Any]))
      relationshipStatus.foreach(__v => __obj.updateDynamic("relationshipStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Invitation]
    }
  }

  /** Provides information about the IP address of the device that an entity used to perform an action on an affected resource.
    */
  @js.native
  trait IpAddressDetails extends js.Object {
    var ipAddressV4: js.UndefOr[__string]
    var ipCity: js.UndefOr[IpCity]
    var ipCountry: js.UndefOr[IpCountry]
    var ipGeoLocation: js.UndefOr[IpGeoLocation]
    var ipOwner: js.UndefOr[IpOwner]
  }

  object IpAddressDetails {
    @inline
    def apply(
        ipAddressV4: js.UndefOr[__string] = js.undefined,
        ipCity: js.UndefOr[IpCity] = js.undefined,
        ipCountry: js.UndefOr[IpCountry] = js.undefined,
        ipGeoLocation: js.UndefOr[IpGeoLocation] = js.undefined,
        ipOwner: js.UndefOr[IpOwner] = js.undefined
    ): IpAddressDetails = {
      val __obj = js.Dynamic.literal()
      ipAddressV4.foreach(__v => __obj.updateDynamic("ipAddressV4")(__v.asInstanceOf[js.Any]))
      ipCity.foreach(__v => __obj.updateDynamic("ipCity")(__v.asInstanceOf[js.Any]))
      ipCountry.foreach(__v => __obj.updateDynamic("ipCountry")(__v.asInstanceOf[js.Any]))
      ipGeoLocation.foreach(__v => __obj.updateDynamic("ipGeoLocation")(__v.asInstanceOf[js.Any]))
      ipOwner.foreach(__v => __obj.updateDynamic("ipOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IpAddressDetails]
    }
  }

  /** Provides information about the city that an IP address originated from.
    */
  @js.native
  trait IpCity extends js.Object {
    var name: js.UndefOr[__string]
  }

  object IpCity {
    @inline
    def apply(
        name: js.UndefOr[__string] = js.undefined
    ): IpCity = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IpCity]
    }
  }

  /** Provides information about the country that an IP address originated from.
    */
  @js.native
  trait IpCountry extends js.Object {
    var code: js.UndefOr[__string]
    var name: js.UndefOr[__string]
  }

  object IpCountry {
    @inline
    def apply(
        code: js.UndefOr[__string] = js.undefined,
        name: js.UndefOr[__string] = js.undefined
    ): IpCountry = {
      val __obj = js.Dynamic.literal()
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IpCountry]
    }
  }

  /** Provides geographic coordinates that indicate where a specified IP address originated from.
    */
  @js.native
  trait IpGeoLocation extends js.Object {
    var lat: js.UndefOr[__double]
    var lon: js.UndefOr[__double]
  }

  object IpGeoLocation {
    @inline
    def apply(
        lat: js.UndefOr[__double] = js.undefined,
        lon: js.UndefOr[__double] = js.undefined
    ): IpGeoLocation = {
      val __obj = js.Dynamic.literal()
      lat.foreach(__v => __obj.updateDynamic("lat")(__v.asInstanceOf[js.Any]))
      lon.foreach(__v => __obj.updateDynamic("lon")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IpGeoLocation]
    }
  }

  /** Provides information about the registered owner of an IP address.
    */
  @js.native
  trait IpOwner extends js.Object {
    var asn: js.UndefOr[__string]
    var asnOrg: js.UndefOr[__string]
    var isp: js.UndefOr[__string]
    var org: js.UndefOr[__string]
  }

  object IpOwner {
    @inline
    def apply(
        asn: js.UndefOr[__string] = js.undefined,
        asnOrg: js.UndefOr[__string] = js.undefined,
        isp: js.UndefOr[__string] = js.undefined,
        org: js.UndefOr[__string] = js.undefined
    ): IpOwner = {
      val __obj = js.Dynamic.literal()
      asn.foreach(__v => __obj.updateDynamic("asn")(__v.asInstanceOf[js.Any]))
      asnOrg.foreach(__v => __obj.updateDynamic("asnOrg")(__v.asInstanceOf[js.Any]))
      isp.foreach(__v => __obj.updateDynamic("isp")(__v.asInstanceOf[js.Any]))
      org.foreach(__v => __obj.updateDynamic("org")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IpOwner]
    }
  }

  /** Specifies whether any one-time or recurring classification jobs are configured to analyze data in an S3 bucket, and, if so, the details of the job that ran most recently.
    */
  @js.native
  trait JobDetails extends js.Object {
    var isDefinedInJob: js.UndefOr[IsDefinedInJob]
    var isMonitoredByJob: js.UndefOr[IsMonitoredByJob]
    var lastJobId: js.UndefOr[__string]
    var lastJobRunTime: js.UndefOr[__timestampIso8601]
  }

  object JobDetails {
    @inline
    def apply(
        isDefinedInJob: js.UndefOr[IsDefinedInJob] = js.undefined,
        isMonitoredByJob: js.UndefOr[IsMonitoredByJob] = js.undefined,
        lastJobId: js.UndefOr[__string] = js.undefined,
        lastJobRunTime: js.UndefOr[__timestampIso8601] = js.undefined
    ): JobDetails = {
      val __obj = js.Dynamic.literal()
      isDefinedInJob.foreach(__v => __obj.updateDynamic("isDefinedInJob")(__v.asInstanceOf[js.Any]))
      isMonitoredByJob.foreach(__v => __obj.updateDynamic("isMonitoredByJob")(__v.asInstanceOf[js.Any]))
      lastJobId.foreach(__v => __obj.updateDynamic("lastJobId")(__v.asInstanceOf[js.Any]))
      lastJobRunTime.foreach(__v => __obj.updateDynamic("lastJobRunTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobDetails]
    }
  }

  /** Specifies the recurrence pattern for running a classification job.
    */
  @js.native
  trait JobScheduleFrequency extends js.Object {
    var dailySchedule: js.UndefOr[DailySchedule]
    var monthlySchedule: js.UndefOr[MonthlySchedule]
    var weeklySchedule: js.UndefOr[WeeklySchedule]
  }

  object JobScheduleFrequency {
    @inline
    def apply(
        dailySchedule: js.UndefOr[DailySchedule] = js.undefined,
        monthlySchedule: js.UndefOr[MonthlySchedule] = js.undefined,
        weeklySchedule: js.UndefOr[WeeklySchedule] = js.undefined
    ): JobScheduleFrequency = {
      val __obj = js.Dynamic.literal()
      dailySchedule.foreach(__v => __obj.updateDynamic("dailySchedule")(__v.asInstanceOf[js.Any]))
      monthlySchedule.foreach(__v => __obj.updateDynamic("monthlySchedule")(__v.asInstanceOf[js.Any]))
      weeklySchedule.foreach(__v => __obj.updateDynamic("weeklySchedule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobScheduleFrequency]
    }
  }

  /** Specifies a property- or tag-based condition that defines criteria for including or excluding S3 objects from a classification job. A JobScopeTerm object can contain only one simpleScopeTerm object or one tagScopeTerm object.
    */
  @js.native
  trait JobScopeTerm extends js.Object {
    var simpleScopeTerm: js.UndefOr[SimpleScopeTerm]
    var tagScopeTerm: js.UndefOr[TagScopeTerm]
  }

  object JobScopeTerm {
    @inline
    def apply(
        simpleScopeTerm: js.UndefOr[SimpleScopeTerm] = js.undefined,
        tagScopeTerm: js.UndefOr[TagScopeTerm] = js.undefined
    ): JobScopeTerm = {
      val __obj = js.Dynamic.literal()
      simpleScopeTerm.foreach(__v => __obj.updateDynamic("simpleScopeTerm")(__v.asInstanceOf[js.Any]))
      tagScopeTerm.foreach(__v => __obj.updateDynamic("tagScopeTerm")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobScopeTerm]
    }
  }

  /** Specifies one or more property- and tag-based conditions that define criteria for including or excluding S3 objects from a classification job.
    */
  @js.native
  trait JobScopingBlock extends js.Object {
    var and: js.UndefOr[__listOfJobScopeTerm]
  }

  object JobScopingBlock {
    @inline
    def apply(
        and: js.UndefOr[__listOfJobScopeTerm] = js.undefined
    ): JobScopingBlock = {
      val __obj = js.Dynamic.literal()
      and.foreach(__v => __obj.updateDynamic("and")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobScopingBlock]
    }
  }

  /** Provides information about a classification job, including the current status of the job.
    */
  @js.native
  trait JobSummary extends js.Object {
    var bucketCriteria: js.UndefOr[S3BucketCriteriaForJob]
    var bucketDefinitions: js.UndefOr[__listOfS3BucketDefinitionForJob]
    var createdAt: js.UndefOr[__timestampIso8601]
    var jobId: js.UndefOr[__string]
    var jobStatus: js.UndefOr[JobStatus]
    var jobType: js.UndefOr[JobType]
    var lastRunErrorStatus: js.UndefOr[LastRunErrorStatus]
    var name: js.UndefOr[__string]
    var userPausedDetails: js.UndefOr[UserPausedDetails]
  }

  object JobSummary {
    @inline
    def apply(
        bucketCriteria: js.UndefOr[S3BucketCriteriaForJob] = js.undefined,
        bucketDefinitions: js.UndefOr[__listOfS3BucketDefinitionForJob] = js.undefined,
        createdAt: js.UndefOr[__timestampIso8601] = js.undefined,
        jobId: js.UndefOr[__string] = js.undefined,
        jobStatus: js.UndefOr[JobStatus] = js.undefined,
        jobType: js.UndefOr[JobType] = js.undefined,
        lastRunErrorStatus: js.UndefOr[LastRunErrorStatus] = js.undefined,
        name: js.UndefOr[__string] = js.undefined,
        userPausedDetails: js.UndefOr[UserPausedDetails] = js.undefined
    ): JobSummary = {
      val __obj = js.Dynamic.literal()
      bucketCriteria.foreach(__v => __obj.updateDynamic("bucketCriteria")(__v.asInstanceOf[js.Any]))
      bucketDefinitions.foreach(__v => __obj.updateDynamic("bucketDefinitions")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      jobStatus.foreach(__v => __obj.updateDynamic("jobStatus")(__v.asInstanceOf[js.Any]))
      jobType.foreach(__v => __obj.updateDynamic("jobType")(__v.asInstanceOf[js.Any]))
      lastRunErrorStatus.foreach(__v => __obj.updateDynamic("lastRunErrorStatus")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      userPausedDetails.foreach(__v => __obj.updateDynamic("userPausedDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobSummary]
    }
  }

  /** Provides information about the tags that are associated with an S3 bucket or object. Each tag consists of a required tag key and an associated tag value.
    */
  @js.native
  trait KeyValuePair extends js.Object {
    var key: js.UndefOr[__string]
    var value: js.UndefOr[__string]
  }

  object KeyValuePair {
    @inline
    def apply(
        key: js.UndefOr[__string] = js.undefined,
        value: js.UndefOr[__string] = js.undefined
    ): KeyValuePair = {
      val __obj = js.Dynamic.literal()
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyValuePair]
    }
  }

  /** Specifies whether any account- or bucket-level access errors occurred when a classification job ran. For information about using logging data to investigate these errors, see [[https://docs.aws.amazon.com/macie/latest/user/discovery-jobs-monitor-cw-logs.html|Monitoring sensitive data discovery jobs]] in the <i>Amazon Macie User Guide</i>.
    */
  @js.native
  trait LastRunErrorStatus extends js.Object {
    var code: js.UndefOr[LastRunErrorStatusCode]
  }

  object LastRunErrorStatus {
    @inline
    def apply(
        code: js.UndefOr[LastRunErrorStatusCode] = js.undefined
    ): LastRunErrorStatus = {
      val __obj = js.Dynamic.literal()
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LastRunErrorStatus]
    }
  }

  @js.native
  trait ListClassificationJobsRequest extends js.Object {
    var filterCriteria: js.UndefOr[ListJobsFilterCriteria]
    var maxResults: js.UndefOr[__integer]
    var nextToken: js.UndefOr[__string]
    var sortCriteria: js.UndefOr[ListJobsSortCriteria]
  }

  object ListClassificationJobsRequest {
    @inline
    def apply(
        filterCriteria: js.UndefOr[ListJobsFilterCriteria] = js.undefined,
        maxResults: js.UndefOr[__integer] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined,
        sortCriteria: js.UndefOr[ListJobsSortCriteria] = js.undefined
    ): ListClassificationJobsRequest = {
      val __obj = js.Dynamic.literal()
      filterCriteria.foreach(__v => __obj.updateDynamic("filterCriteria")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortCriteria.foreach(__v => __obj.updateDynamic("sortCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClassificationJobsRequest]
    }
  }

  @js.native
  trait ListClassificationJobsResponse extends js.Object {
    var items: js.UndefOr[__listOfJobSummary]
    var nextToken: js.UndefOr[__string]
  }

  object ListClassificationJobsResponse {
    @inline
    def apply(
        items: js.UndefOr[__listOfJobSummary] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined
    ): ListClassificationJobsResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClassificationJobsResponse]
    }
  }

  @js.native
  trait ListCustomDataIdentifiersRequest extends js.Object {
    var maxResults: js.UndefOr[__integer]
    var nextToken: js.UndefOr[__string]
  }

  object ListCustomDataIdentifiersRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[__integer] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined
    ): ListCustomDataIdentifiersRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCustomDataIdentifiersRequest]
    }
  }

  @js.native
  trait ListCustomDataIdentifiersResponse extends js.Object {
    var items: js.UndefOr[__listOfCustomDataIdentifierSummary]
    var nextToken: js.UndefOr[__string]
  }

  object ListCustomDataIdentifiersResponse {
    @inline
    def apply(
        items: js.UndefOr[__listOfCustomDataIdentifierSummary] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined
    ): ListCustomDataIdentifiersResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCustomDataIdentifiersResponse]
    }
  }

  @js.native
  trait ListFindingsFiltersRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[__string]
  }

  object ListFindingsFiltersRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined
    ): ListFindingsFiltersRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingsFiltersRequest]
    }
  }

  @js.native
  trait ListFindingsFiltersResponse extends js.Object {
    var findingsFilterListItems: js.UndefOr[__listOfFindingsFilterListItem]
    var nextToken: js.UndefOr[__string]
  }

  object ListFindingsFiltersResponse {
    @inline
    def apply(
        findingsFilterListItems: js.UndefOr[__listOfFindingsFilterListItem] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined
    ): ListFindingsFiltersResponse = {
      val __obj = js.Dynamic.literal()
      findingsFilterListItems.foreach(__v => __obj.updateDynamic("findingsFilterListItems")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingsFiltersResponse]
    }
  }

  @js.native
  trait ListFindingsRequest extends js.Object {
    var findingCriteria: js.UndefOr[FindingCriteria]
    var maxResults: js.UndefOr[__integer]
    var nextToken: js.UndefOr[__string]
    var sortCriteria: js.UndefOr[SortCriteria]
  }

  object ListFindingsRequest {
    @inline
    def apply(
        findingCriteria: js.UndefOr[FindingCriteria] = js.undefined,
        maxResults: js.UndefOr[__integer] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined,
        sortCriteria: js.UndefOr[SortCriteria] = js.undefined
    ): ListFindingsRequest = {
      val __obj = js.Dynamic.literal()
      findingCriteria.foreach(__v => __obj.updateDynamic("findingCriteria")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortCriteria.foreach(__v => __obj.updateDynamic("sortCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingsRequest]
    }
  }

  @js.native
  trait ListFindingsResponse extends js.Object {
    var findingIds: js.UndefOr[__listOf__string]
    var nextToken: js.UndefOr[__string]
  }

  object ListFindingsResponse {
    @inline
    def apply(
        findingIds: js.UndefOr[__listOf__string] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined
    ): ListFindingsResponse = {
      val __obj = js.Dynamic.literal()
      findingIds.foreach(__v => __obj.updateDynamic("findingIds")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingsResponse]
    }
  }

  @js.native
  trait ListInvitationsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[__string]
  }

  object ListInvitationsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined
    ): ListInvitationsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInvitationsRequest]
    }
  }

  @js.native
  trait ListInvitationsResponse extends js.Object {
    var invitations: js.UndefOr[__listOfInvitation]
    var nextToken: js.UndefOr[__string]
  }

  object ListInvitationsResponse {
    @inline
    def apply(
        invitations: js.UndefOr[__listOfInvitation] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined
    ): ListInvitationsResponse = {
      val __obj = js.Dynamic.literal()
      invitations.foreach(__v => __obj.updateDynamic("invitations")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInvitationsResponse]
    }
  }

  /** Specifies criteria for filtering the results of a request for information about classification jobs.
    */
  @js.native
  trait ListJobsFilterCriteria extends js.Object {
    var excludes: js.UndefOr[__listOfListJobsFilterTerm]
    var includes: js.UndefOr[__listOfListJobsFilterTerm]
  }

  object ListJobsFilterCriteria {
    @inline
    def apply(
        excludes: js.UndefOr[__listOfListJobsFilterTerm] = js.undefined,
        includes: js.UndefOr[__listOfListJobsFilterTerm] = js.undefined
    ): ListJobsFilterCriteria = {
      val __obj = js.Dynamic.literal()
      excludes.foreach(__v => __obj.updateDynamic("excludes")(__v.asInstanceOf[js.Any]))
      includes.foreach(__v => __obj.updateDynamic("includes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsFilterCriteria]
    }
  }

  /** Specifies a condition that filters the results of a request for information about classification jobs. Each condition consists of a property, an operator, and one or more values.
    */
  @js.native
  trait ListJobsFilterTerm extends js.Object {
    var comparator: js.UndefOr[JobComparator]
    var key: js.UndefOr[ListJobsFilterKey]
    var values: js.UndefOr[__listOf__string]
  }

  object ListJobsFilterTerm {
    @inline
    def apply(
        comparator: js.UndefOr[JobComparator] = js.undefined,
        key: js.UndefOr[ListJobsFilterKey] = js.undefined,
        values: js.UndefOr[__listOf__string] = js.undefined
    ): ListJobsFilterTerm = {
      val __obj = js.Dynamic.literal()
      comparator.foreach(__v => __obj.updateDynamic("comparator")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsFilterTerm]
    }
  }

  /** Specifies criteria for sorting the results of a request for information about classification jobs.
    */
  @js.native
  trait ListJobsSortCriteria extends js.Object {
    var attributeName: js.UndefOr[ListJobsSortAttributeName]
    var orderBy: js.UndefOr[OrderBy]
  }

  object ListJobsSortCriteria {
    @inline
    def apply(
        attributeName: js.UndefOr[ListJobsSortAttributeName] = js.undefined,
        orderBy: js.UndefOr[OrderBy] = js.undefined
    ): ListJobsSortCriteria = {
      val __obj = js.Dynamic.literal()
      attributeName.foreach(__v => __obj.updateDynamic("attributeName")(__v.asInstanceOf[js.Any]))
      orderBy.foreach(__v => __obj.updateDynamic("orderBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsSortCriteria]
    }
  }

  @js.native
  trait ListManagedDataIdentifiersRequest extends js.Object {
    var nextToken: js.UndefOr[__string]
  }

  object ListManagedDataIdentifiersRequest {
    @inline
    def apply(
        nextToken: js.UndefOr[__string] = js.undefined
    ): ListManagedDataIdentifiersRequest = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListManagedDataIdentifiersRequest]
    }
  }

  @js.native
  trait ListManagedDataIdentifiersResponse extends js.Object {
    var items: js.UndefOr[__listOfManagedDataIdentifierSummary]
    var nextToken: js.UndefOr[__string]
  }

  object ListManagedDataIdentifiersResponse {
    @inline
    def apply(
        items: js.UndefOr[__listOfManagedDataIdentifierSummary] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined
    ): ListManagedDataIdentifiersResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListManagedDataIdentifiersResponse]
    }
  }

  @js.native
  trait ListMembersRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[__string]
    var onlyAssociated: js.UndefOr[__string]
  }

  object ListMembersRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined,
        onlyAssociated: js.UndefOr[__string] = js.undefined
    ): ListMembersRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      onlyAssociated.foreach(__v => __obj.updateDynamic("onlyAssociated")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMembersRequest]
    }
  }

  @js.native
  trait ListMembersResponse extends js.Object {
    var members: js.UndefOr[__listOfMember]
    var nextToken: js.UndefOr[__string]
  }

  object ListMembersResponse {
    @inline
    def apply(
        members: js.UndefOr[__listOfMember] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined
    ): ListMembersResponse = {
      val __obj = js.Dynamic.literal()
      members.foreach(__v => __obj.updateDynamic("members")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMembersResponse]
    }
  }

  @js.native
  trait ListOrganizationAdminAccountsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[__string]
  }

  object ListOrganizationAdminAccountsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined
    ): ListOrganizationAdminAccountsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrganizationAdminAccountsRequest]
    }
  }

  @js.native
  trait ListOrganizationAdminAccountsResponse extends js.Object {
    var adminAccounts: js.UndefOr[__listOfAdminAccount]
    var nextToken: js.UndefOr[__string]
  }

  object ListOrganizationAdminAccountsResponse {
    @inline
    def apply(
        adminAccounts: js.UndefOr[__listOfAdminAccount] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined
    ): ListOrganizationAdminAccountsResponse = {
      val __obj = js.Dynamic.literal()
      adminAccounts.foreach(__v => __obj.updateDynamic("adminAccounts")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrganizationAdminAccountsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: __string
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: __string
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Provides information about a managed data identifier. For additional information, see [[https://docs.aws.amazon.com/macie/latest/user/managed-data-identifiers.html|Using managed data identifiers]] in the <i>Amazon Macie User Guide</i>.
    */
  @js.native
  trait ManagedDataIdentifierSummary extends js.Object {
    var category: js.UndefOr[SensitiveDataItemCategory]
    var id: js.UndefOr[__string]
  }

  object ManagedDataIdentifierSummary {
    @inline
    def apply(
        category: js.UndefOr[SensitiveDataItemCategory] = js.undefined,
        id: js.UndefOr[__string] = js.undefined
    ): ManagedDataIdentifierSummary = {
      val __obj = js.Dynamic.literal()
      category.foreach(__v => __obj.updateDynamic("category")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManagedDataIdentifierSummary]
    }
  }

  /** Provides statistical data and other information about an S3 bucket that Amazon Macie monitors and analyzes for your account. If an error occurs when Macie attempts to retrieve and process information about the bucket or the bucket's objects, the value for most of these properties is null. Exceptions are accountId and bucketName. To identify the cause of the error, refer to the errorCode and errorMessage values.
    */
  @js.native
  trait MatchingBucket extends js.Object {
    var accountId: js.UndefOr[__string]
    var bucketName: js.UndefOr[__string]
    var classifiableObjectCount: js.UndefOr[__long]
    var classifiableSizeInBytes: js.UndefOr[__long]
    var errorCode: js.UndefOr[BucketMetadataErrorCode]
    var errorMessage: js.UndefOr[__string]
    var jobDetails: js.UndefOr[JobDetails]
    var objectCount: js.UndefOr[__long]
    var objectCountByEncryptionType: js.UndefOr[ObjectCountByEncryptionType]
    var sizeInBytes: js.UndefOr[__long]
    var sizeInBytesCompressed: js.UndefOr[__long]
    var unclassifiableObjectCount: js.UndefOr[ObjectLevelStatistics]
    var unclassifiableObjectSizeInBytes: js.UndefOr[ObjectLevelStatistics]
  }

  object MatchingBucket {
    @inline
    def apply(
        accountId: js.UndefOr[__string] = js.undefined,
        bucketName: js.UndefOr[__string] = js.undefined,
        classifiableObjectCount: js.UndefOr[__long] = js.undefined,
        classifiableSizeInBytes: js.UndefOr[__long] = js.undefined,
        errorCode: js.UndefOr[BucketMetadataErrorCode] = js.undefined,
        errorMessage: js.UndefOr[__string] = js.undefined,
        jobDetails: js.UndefOr[JobDetails] = js.undefined,
        objectCount: js.UndefOr[__long] = js.undefined,
        objectCountByEncryptionType: js.UndefOr[ObjectCountByEncryptionType] = js.undefined,
        sizeInBytes: js.UndefOr[__long] = js.undefined,
        sizeInBytesCompressed: js.UndefOr[__long] = js.undefined,
        unclassifiableObjectCount: js.UndefOr[ObjectLevelStatistics] = js.undefined,
        unclassifiableObjectSizeInBytes: js.UndefOr[ObjectLevelStatistics] = js.undefined
    ): MatchingBucket = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      bucketName.foreach(__v => __obj.updateDynamic("bucketName")(__v.asInstanceOf[js.Any]))
      classifiableObjectCount.foreach(__v => __obj.updateDynamic("classifiableObjectCount")(__v.asInstanceOf[js.Any]))
      classifiableSizeInBytes.foreach(__v => __obj.updateDynamic("classifiableSizeInBytes")(__v.asInstanceOf[js.Any]))
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      jobDetails.foreach(__v => __obj.updateDynamic("jobDetails")(__v.asInstanceOf[js.Any]))
      objectCount.foreach(__v => __obj.updateDynamic("objectCount")(__v.asInstanceOf[js.Any]))
      objectCountByEncryptionType.foreach(__v => __obj.updateDynamic("objectCountByEncryptionType")(__v.asInstanceOf[js.Any]))
      sizeInBytes.foreach(__v => __obj.updateDynamic("sizeInBytes")(__v.asInstanceOf[js.Any]))
      sizeInBytesCompressed.foreach(__v => __obj.updateDynamic("sizeInBytesCompressed")(__v.asInstanceOf[js.Any]))
      unclassifiableObjectCount.foreach(__v => __obj.updateDynamic("unclassifiableObjectCount")(__v.asInstanceOf[js.Any]))
      unclassifiableObjectSizeInBytes.foreach(__v => __obj.updateDynamic("unclassifiableObjectSizeInBytes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MatchingBucket]
    }
  }

  /** Provides statistical data and other information about an Amazon Web Services resource that Amazon Macie monitors and analyzes for your account.
    */
  @js.native
  trait MatchingResource extends js.Object {
    var matchingBucket: js.UndefOr[MatchingBucket]
  }

  object MatchingResource {
    @inline
    def apply(
        matchingBucket: js.UndefOr[MatchingBucket] = js.undefined
    ): MatchingResource = {
      val __obj = js.Dynamic.literal()
      matchingBucket.foreach(__v => __obj.updateDynamic("matchingBucket")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MatchingResource]
    }
  }

  /** Provides information about an account that's associated with an Amazon Macie administrator account.
    */
  @js.native
  trait Member extends js.Object {
    var accountId: js.UndefOr[__string]
    var administratorAccountId: js.UndefOr[__string]
    var arn: js.UndefOr[__string]
    var email: js.UndefOr[__string]
    var invitedAt: js.UndefOr[__timestampIso8601]
    var masterAccountId: js.UndefOr[__string]
    var relationshipStatus: js.UndefOr[RelationshipStatus]
    var tags: js.UndefOr[TagMap]
    var updatedAt: js.UndefOr[__timestampIso8601]
  }

  object Member {
    @inline
    def apply(
        accountId: js.UndefOr[__string] = js.undefined,
        administratorAccountId: js.UndefOr[__string] = js.undefined,
        arn: js.UndefOr[__string] = js.undefined,
        email: js.UndefOr[__string] = js.undefined,
        invitedAt: js.UndefOr[__timestampIso8601] = js.undefined,
        masterAccountId: js.UndefOr[__string] = js.undefined,
        relationshipStatus: js.UndefOr[RelationshipStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        updatedAt: js.UndefOr[__timestampIso8601] = js.undefined
    ): Member = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      administratorAccountId.foreach(__v => __obj.updateDynamic("administratorAccountId")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      email.foreach(__v => __obj.updateDynamic("email")(__v.asInstanceOf[js.Any]))
      invitedAt.foreach(__v => __obj.updateDynamic("invitedAt")(__v.asInstanceOf[js.Any]))
      masterAccountId.foreach(__v => __obj.updateDynamic("masterAccountId")(__v.asInstanceOf[js.Any]))
      relationshipStatus.foreach(__v => __obj.updateDynamic("relationshipStatus")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Member]
    }
  }

  /** Specifies a monthly recurrence pattern for running a classification job.
    */
  @js.native
  trait MonthlySchedule extends js.Object {
    var dayOfMonth: js.UndefOr[__integer]
  }

  object MonthlySchedule {
    @inline
    def apply(
        dayOfMonth: js.UndefOr[__integer] = js.undefined
    ): MonthlySchedule = {
      val __obj = js.Dynamic.literal()
      dayOfMonth.foreach(__v => __obj.updateDynamic("dayOfMonth")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonthlySchedule]
    }
  }

  /** Provides information about the number of objects that are in an S3 bucket and use certain types of server-side encryption, use client-side encryption, or aren't encrypted.
    */
  @js.native
  trait ObjectCountByEncryptionType extends js.Object {
    var customerManaged: js.UndefOr[__long]
    var kmsManaged: js.UndefOr[__long]
    var s3Managed: js.UndefOr[__long]
    var unencrypted: js.UndefOr[__long]
    var unknown: js.UndefOr[__long]
  }

  object ObjectCountByEncryptionType {
    @inline
    def apply(
        customerManaged: js.UndefOr[__long] = js.undefined,
        kmsManaged: js.UndefOr[__long] = js.undefined,
        s3Managed: js.UndefOr[__long] = js.undefined,
        unencrypted: js.UndefOr[__long] = js.undefined,
        unknown: js.UndefOr[__long] = js.undefined
    ): ObjectCountByEncryptionType = {
      val __obj = js.Dynamic.literal()
      customerManaged.foreach(__v => __obj.updateDynamic("customerManaged")(__v.asInstanceOf[js.Any]))
      kmsManaged.foreach(__v => __obj.updateDynamic("kmsManaged")(__v.asInstanceOf[js.Any]))
      s3Managed.foreach(__v => __obj.updateDynamic("s3Managed")(__v.asInstanceOf[js.Any]))
      unencrypted.foreach(__v => __obj.updateDynamic("unencrypted")(__v.asInstanceOf[js.Any]))
      unknown.foreach(__v => __obj.updateDynamic("unknown")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ObjectCountByEncryptionType]
    }
  }

  /** Provides information about the total storage size (in bytes) or number of objects that Amazon Macie can't analyze in one or more S3 buckets. In a BucketMetadata or MatchingBucket object, this data is for a specific bucket. In a GetBucketStatisticsResponse object, this data is aggregated for the buckets in the query results. If versioning is enabled for a bucket, total storage size values are based on the size of the latest version of each applicable object in the bucket.
    */
  @js.native
  trait ObjectLevelStatistics extends js.Object {
    var fileType: js.UndefOr[__long]
    var storageClass: js.UndefOr[__long]
    var total: js.UndefOr[__long]
  }

  object ObjectLevelStatistics {
    @inline
    def apply(
        fileType: js.UndefOr[__long] = js.undefined,
        storageClass: js.UndefOr[__long] = js.undefined,
        total: js.UndefOr[__long] = js.undefined
    ): ObjectLevelStatistics = {
      val __obj = js.Dynamic.literal()
      fileType.foreach(__v => __obj.updateDynamic("fileType")(__v.asInstanceOf[js.Any]))
      storageClass.foreach(__v => __obj.updateDynamic("storageClass")(__v.asInstanceOf[js.Any]))
      total.foreach(__v => __obj.updateDynamic("total")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ObjectLevelStatistics]
    }
  }

  /** Specifies the location of 1-15 occurrences of sensitive data that was detected by a managed data identifier or a custom data identifier and produced a sensitive data finding.
    */
  @js.native
  trait Occurrences extends js.Object {
    var cells: js.UndefOr[Cells]
    var lineRanges: js.UndefOr[Ranges]
    var offsetRanges: js.UndefOr[Ranges]
    var pages: js.UndefOr[Pages]
    var records: js.UndefOr[Records]
  }

  object Occurrences {
    @inline
    def apply(
        cells: js.UndefOr[Cells] = js.undefined,
        lineRanges: js.UndefOr[Ranges] = js.undefined,
        offsetRanges: js.UndefOr[Ranges] = js.undefined,
        pages: js.UndefOr[Pages] = js.undefined,
        records: js.UndefOr[Records] = js.undefined
    ): Occurrences = {
      val __obj = js.Dynamic.literal()
      cells.foreach(__v => __obj.updateDynamic("cells")(__v.asInstanceOf[js.Any]))
      lineRanges.foreach(__v => __obj.updateDynamic("lineRanges")(__v.asInstanceOf[js.Any]))
      offsetRanges.foreach(__v => __obj.updateDynamic("offsetRanges")(__v.asInstanceOf[js.Any]))
      pages.foreach(__v => __obj.updateDynamic("pages")(__v.asInstanceOf[js.Any]))
      records.foreach(__v => __obj.updateDynamic("records")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Occurrences]
    }
  }

  /** Specifies the location of an occurrence of sensitive data in an Adobe Portable Document Format file.
    */
  @js.native
  trait Page extends js.Object {
    var lineRange: js.UndefOr[Range]
    var offsetRange: js.UndefOr[Range]
    var pageNumber: js.UndefOr[__long]
  }

  object Page {
    @inline
    def apply(
        lineRange: js.UndefOr[Range] = js.undefined,
        offsetRange: js.UndefOr[Range] = js.undefined,
        pageNumber: js.UndefOr[__long] = js.undefined
    ): Page = {
      val __obj = js.Dynamic.literal()
      lineRange.foreach(__v => __obj.updateDynamic("lineRange")(__v.asInstanceOf[js.Any]))
      offsetRange.foreach(__v => __obj.updateDynamic("offsetRange")(__v.asInstanceOf[js.Any]))
      pageNumber.foreach(__v => __obj.updateDynamic("pageNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Page]
    }
  }

  /** Provides the details of a policy finding.
    */
  @js.native
  trait PolicyDetails extends js.Object {
    var action: js.UndefOr[FindingAction]
    var actor: js.UndefOr[FindingActor]
  }

  object PolicyDetails {
    @inline
    def apply(
        action: js.UndefOr[FindingAction] = js.undefined,
        actor: js.UndefOr[FindingActor] = js.undefined
    ): PolicyDetails = {
      val __obj = js.Dynamic.literal()
      action.foreach(__v => __obj.updateDynamic("action")(__v.asInstanceOf[js.Any]))
      actor.foreach(__v => __obj.updateDynamic("actor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyDetails]
    }
  }

  @js.native
  trait PutClassificationExportConfigurationRequest extends js.Object {
    var configuration: ClassificationExportConfiguration
  }

  object PutClassificationExportConfigurationRequest {
    @inline
    def apply(
        configuration: ClassificationExportConfiguration
    ): PutClassificationExportConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "configuration" -> configuration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutClassificationExportConfigurationRequest]
    }
  }

  @js.native
  trait PutClassificationExportConfigurationResponse extends js.Object {
    var configuration: js.UndefOr[ClassificationExportConfiguration]
  }

  object PutClassificationExportConfigurationResponse {
    @inline
    def apply(
        configuration: js.UndefOr[ClassificationExportConfiguration] = js.undefined
    ): PutClassificationExportConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      configuration.foreach(__v => __obj.updateDynamic("configuration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutClassificationExportConfigurationResponse]
    }
  }

  @js.native
  trait PutFindingsPublicationConfigurationRequest extends js.Object {
    var clientToken: js.UndefOr[__string]
    var securityHubConfiguration: js.UndefOr[SecurityHubConfiguration]
  }

  object PutFindingsPublicationConfigurationRequest {
    @inline
    def apply(
        clientToken: js.UndefOr[__string] = js.undefined,
        securityHubConfiguration: js.UndefOr[SecurityHubConfiguration] = js.undefined
    ): PutFindingsPublicationConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      securityHubConfiguration.foreach(__v => __obj.updateDynamic("securityHubConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutFindingsPublicationConfigurationRequest]
    }
  }

  @js.native
  trait PutFindingsPublicationConfigurationResponse extends js.Object

  object PutFindingsPublicationConfigurationResponse {
    @inline
    def apply(): PutFindingsPublicationConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutFindingsPublicationConfigurationResponse]
    }
  }

  /** Specifies the location of an occurrence of sensitive data in a non-binary text file, such as an HTML, TXT, or XML file.
    */
  @js.native
  trait Range extends js.Object {
    var end: js.UndefOr[__long]
    var start: js.UndefOr[__long]
    var startColumn: js.UndefOr[__long]
  }

  object Range {
    @inline
    def apply(
        end: js.UndefOr[__long] = js.undefined,
        start: js.UndefOr[__long] = js.undefined,
        startColumn: js.UndefOr[__long] = js.undefined
    ): Range = {
      val __obj = js.Dynamic.literal()
      end.foreach(__v => __obj.updateDynamic("end")(__v.asInstanceOf[js.Any]))
      start.foreach(__v => __obj.updateDynamic("start")(__v.asInstanceOf[js.Any]))
      startColumn.foreach(__v => __obj.updateDynamic("startColumn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Range]
    }
  }

  /** Specifies the location of an occurrence of sensitive data in an Apache Avro object container, Apache Parquet file, JSON file, or JSON Lines file.
    */
  @js.native
  trait Record extends js.Object {
    var jsonPath: js.UndefOr[__string]
    var recordIndex: js.UndefOr[__long]
  }

  object Record {
    @inline
    def apply(
        jsonPath: js.UndefOr[__string] = js.undefined,
        recordIndex: js.UndefOr[__long] = js.undefined
    ): Record = {
      val __obj = js.Dynamic.literal()
      jsonPath.foreach(__v => __obj.updateDynamic("jsonPath")(__v.asInstanceOf[js.Any]))
      recordIndex.foreach(__v => __obj.updateDynamic("recordIndex")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Record]
    }
  }

  /** Provides information about settings that define whether one or more objects in an S3 bucket are replicated to S3 buckets for other Amazon Web Services accounts and, if so, which accounts.
    */
  @js.native
  trait ReplicationDetails extends js.Object {
    var replicated: js.UndefOr[__boolean]
    var replicatedExternally: js.UndefOr[__boolean]
    var replicationAccounts: js.UndefOr[__listOf__string]
  }

  object ReplicationDetails {
    @inline
    def apply(
        replicated: js.UndefOr[__boolean] = js.undefined,
        replicatedExternally: js.UndefOr[__boolean] = js.undefined,
        replicationAccounts: js.UndefOr[__listOf__string] = js.undefined
    ): ReplicationDetails = {
      val __obj = js.Dynamic.literal()
      replicated.foreach(__v => __obj.updateDynamic("replicated")(__v.asInstanceOf[js.Any]))
      replicatedExternally.foreach(__v => __obj.updateDynamic("replicatedExternally")(__v.asInstanceOf[js.Any]))
      replicationAccounts.foreach(__v => __obj.updateDynamic("replicationAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationDetails]
    }
  }

  /** Provides information about the resources that a finding applies to.
    */
  @js.native
  trait ResourcesAffected extends js.Object {
    var s3Bucket: js.UndefOr[S3Bucket]
    var s3Object: js.UndefOr[S3Object]
  }

  object ResourcesAffected {
    @inline
    def apply(
        s3Bucket: js.UndefOr[S3Bucket] = js.undefined,
        s3Object: js.UndefOr[S3Object] = js.undefined
    ): ResourcesAffected = {
      val __obj = js.Dynamic.literal()
      s3Bucket.foreach(__v => __obj.updateDynamic("s3Bucket")(__v.asInstanceOf[js.Any]))
      s3Object.foreach(__v => __obj.updateDynamic("s3Object")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourcesAffected]
    }
  }

  /** Provides information about the S3 bucket that a finding applies to.
    */
  @js.native
  trait S3Bucket extends js.Object {
    var allowsUnencryptedObjectUploads: js.UndefOr[AllowsUnencryptedObjectUploads]
    var arn: js.UndefOr[__string]
    var createdAt: js.UndefOr[__timestampIso8601]
    var defaultServerSideEncryption: js.UndefOr[ServerSideEncryption]
    var name: js.UndefOr[__string]
    var owner: js.UndefOr[S3BucketOwner]
    var publicAccess: js.UndefOr[BucketPublicAccess]
    var tags: js.UndefOr[KeyValuePairList]
  }

  object S3Bucket {
    @inline
    def apply(
        allowsUnencryptedObjectUploads: js.UndefOr[AllowsUnencryptedObjectUploads] = js.undefined,
        arn: js.UndefOr[__string] = js.undefined,
        createdAt: js.UndefOr[__timestampIso8601] = js.undefined,
        defaultServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
        name: js.UndefOr[__string] = js.undefined,
        owner: js.UndefOr[S3BucketOwner] = js.undefined,
        publicAccess: js.UndefOr[BucketPublicAccess] = js.undefined,
        tags: js.UndefOr[KeyValuePairList] = js.undefined
    ): S3Bucket = {
      val __obj = js.Dynamic.literal()
      allowsUnencryptedObjectUploads.foreach(__v => __obj.updateDynamic("allowsUnencryptedObjectUploads")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      defaultServerSideEncryption.foreach(__v => __obj.updateDynamic("defaultServerSideEncryption")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      publicAccess.foreach(__v => __obj.updateDynamic("publicAccess")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Bucket]
    }
  }

  /** Specifies property- and tag-based conditions that define criteria for including or excluding S3 buckets from a classification job. Exclude conditions take precedence over include conditions.
    */
  @js.native
  trait S3BucketCriteriaForJob extends js.Object {
    var excludes: js.UndefOr[CriteriaBlockForJob]
    var includes: js.UndefOr[CriteriaBlockForJob]
  }

  object S3BucketCriteriaForJob {
    @inline
    def apply(
        excludes: js.UndefOr[CriteriaBlockForJob] = js.undefined,
        includes: js.UndefOr[CriteriaBlockForJob] = js.undefined
    ): S3BucketCriteriaForJob = {
      val __obj = js.Dynamic.literal()
      excludes.foreach(__v => __obj.updateDynamic("excludes")(__v.asInstanceOf[js.Any]))
      includes.foreach(__v => __obj.updateDynamic("includes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3BucketCriteriaForJob]
    }
  }

  /** Specifies an Amazon Web Services account that owns S3 buckets for a classification job to analyze, and one or more specific buckets to analyze for that account.
    */
  @js.native
  trait S3BucketDefinitionForJob extends js.Object {
    var accountId: __string
    var buckets: __listOf__string
  }

  object S3BucketDefinitionForJob {
    @inline
    def apply(
        accountId: __string,
        buckets: __listOf__string
    ): S3BucketDefinitionForJob = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "buckets" -> buckets.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3BucketDefinitionForJob]
    }
  }

  /** Provides information about the Amazon Web Services account that owns an S3 bucket.
    */
  @js.native
  trait S3BucketOwner extends js.Object {
    var displayName: js.UndefOr[__string]
    var id: js.UndefOr[__string]
  }

  object S3BucketOwner {
    @inline
    def apply(
        displayName: js.UndefOr[__string] = js.undefined,
        id: js.UndefOr[__string] = js.undefined
    ): S3BucketOwner = {
      val __obj = js.Dynamic.literal()
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3BucketOwner]
    }
  }

  /** Specifies an S3 bucket to store data classification results in, and the encryption settings to use when storing results in that bucket.
    */
  @js.native
  trait S3Destination extends js.Object {
    var bucketName: __string
    var kmsKeyArn: __string
    var keyPrefix: js.UndefOr[__string]
  }

  object S3Destination {
    @inline
    def apply(
        bucketName: __string,
        kmsKeyArn: __string,
        keyPrefix: js.UndefOr[__string] = js.undefined
    ): S3Destination = {
      val __obj = js.Dynamic.literal(
        "bucketName" -> bucketName.asInstanceOf[js.Any],
        "kmsKeyArn" -> kmsKeyArn.asInstanceOf[js.Any]
      )

      keyPrefix.foreach(__v => __obj.updateDynamic("keyPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Destination]
    }
  }

  /** Specifies which S3 buckets contain the objects that a classification job analyzes, and the scope of that analysis. The bucket specification can be static (bucketDefinitions) or dynamic (bucketCriteria). If it's static, the job analyzes objects in the same predefined set of buckets each time the job runs. If it's dynamic, the job analyzes objects in any buckets that match the specified criteria each time the job starts to run.
    */
  @js.native
  trait S3JobDefinition extends js.Object {
    var bucketCriteria: js.UndefOr[S3BucketCriteriaForJob]
    var bucketDefinitions: js.UndefOr[__listOfS3BucketDefinitionForJob]
    var scoping: js.UndefOr[Scoping]
  }

  object S3JobDefinition {
    @inline
    def apply(
        bucketCriteria: js.UndefOr[S3BucketCriteriaForJob] = js.undefined,
        bucketDefinitions: js.UndefOr[__listOfS3BucketDefinitionForJob] = js.undefined,
        scoping: js.UndefOr[Scoping] = js.undefined
    ): S3JobDefinition = {
      val __obj = js.Dynamic.literal()
      bucketCriteria.foreach(__v => __obj.updateDynamic("bucketCriteria")(__v.asInstanceOf[js.Any]))
      bucketDefinitions.foreach(__v => __obj.updateDynamic("bucketDefinitions")(__v.asInstanceOf[js.Any]))
      scoping.foreach(__v => __obj.updateDynamic("scoping")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3JobDefinition]
    }
  }

  /** Provides information about the S3 object that a finding applies to.
    */
  @js.native
  trait S3Object extends js.Object {
    var bucketArn: js.UndefOr[__string]
    var eTag: js.UndefOr[__string]
    var extension: js.UndefOr[__string]
    var key: js.UndefOr[__string]
    var lastModified: js.UndefOr[__timestampIso8601]
    var path: js.UndefOr[__string]
    var publicAccess: js.UndefOr[__boolean]
    var serverSideEncryption: js.UndefOr[ServerSideEncryption]
    var size: js.UndefOr[__long]
    var storageClass: js.UndefOr[StorageClass]
    var tags: js.UndefOr[KeyValuePairList]
    var versionId: js.UndefOr[__string]
  }

  object S3Object {
    @inline
    def apply(
        bucketArn: js.UndefOr[__string] = js.undefined,
        eTag: js.UndefOr[__string] = js.undefined,
        extension: js.UndefOr[__string] = js.undefined,
        key: js.UndefOr[__string] = js.undefined,
        lastModified: js.UndefOr[__timestampIso8601] = js.undefined,
        path: js.UndefOr[__string] = js.undefined,
        publicAccess: js.UndefOr[__boolean] = js.undefined,
        serverSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
        size: js.UndefOr[__long] = js.undefined,
        storageClass: js.UndefOr[StorageClass] = js.undefined,
        tags: js.UndefOr[KeyValuePairList] = js.undefined,
        versionId: js.UndefOr[__string] = js.undefined
    ): S3Object = {
      val __obj = js.Dynamic.literal()
      bucketArn.foreach(__v => __obj.updateDynamic("bucketArn")(__v.asInstanceOf[js.Any]))
      eTag.foreach(__v => __obj.updateDynamic("eTag")(__v.asInstanceOf[js.Any]))
      extension.foreach(__v => __obj.updateDynamic("extension")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      lastModified.foreach(__v => __obj.updateDynamic("lastModified")(__v.asInstanceOf[js.Any]))
      path.foreach(__v => __obj.updateDynamic("path")(__v.asInstanceOf[js.Any]))
      publicAccess.foreach(__v => __obj.updateDynamic("publicAccess")(__v.asInstanceOf[js.Any]))
      serverSideEncryption.foreach(__v => __obj.updateDynamic("serverSideEncryption")(__v.asInstanceOf[js.Any]))
      size.foreach(__v => __obj.updateDynamic("size")(__v.asInstanceOf[js.Any]))
      storageClass.foreach(__v => __obj.updateDynamic("storageClass")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      versionId.foreach(__v => __obj.updateDynamic("versionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Object]
    }
  }

  /** Specifies one or more property- and tag-based conditions that define criteria for including or excluding S3 objects from a classification job. Exclude conditions take precedence over include conditions.
    */
  @js.native
  trait Scoping extends js.Object {
    var excludes: js.UndefOr[JobScopingBlock]
    var includes: js.UndefOr[JobScopingBlock]
  }

  object Scoping {
    @inline
    def apply(
        excludes: js.UndefOr[JobScopingBlock] = js.undefined,
        includes: js.UndefOr[JobScopingBlock] = js.undefined
    ): Scoping = {
      val __obj = js.Dynamic.literal()
      excludes.foreach(__v => __obj.updateDynamic("excludes")(__v.asInstanceOf[js.Any]))
      includes.foreach(__v => __obj.updateDynamic("includes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Scoping]
    }
  }

  /** Specifies property- and tag-based conditions that define filter criteria for including or excluding S3 buckets from the query results. Exclude conditions take precedence over include conditions.
    */
  @js.native
  trait SearchResourcesBucketCriteria extends js.Object {
    var excludes: js.UndefOr[SearchResourcesCriteriaBlock]
    var includes: js.UndefOr[SearchResourcesCriteriaBlock]
  }

  object SearchResourcesBucketCriteria {
    @inline
    def apply(
        excludes: js.UndefOr[SearchResourcesCriteriaBlock] = js.undefined,
        includes: js.UndefOr[SearchResourcesCriteriaBlock] = js.undefined
    ): SearchResourcesBucketCriteria = {
      val __obj = js.Dynamic.literal()
      excludes.foreach(__v => __obj.updateDynamic("excludes")(__v.asInstanceOf[js.Any]))
      includes.foreach(__v => __obj.updateDynamic("includes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchResourcesBucketCriteria]
    }
  }

  /** Specifies a property- or tag-based filter condition for including or excluding Amazon Web Services resources from the query results.
    */
  @js.native
  trait SearchResourcesCriteria extends js.Object {
    var simpleCriterion: js.UndefOr[SearchResourcesSimpleCriterion]
    var tagCriterion: js.UndefOr[SearchResourcesTagCriterion]
  }

  object SearchResourcesCriteria {
    @inline
    def apply(
        simpleCriterion: js.UndefOr[SearchResourcesSimpleCriterion] = js.undefined,
        tagCriterion: js.UndefOr[SearchResourcesTagCriterion] = js.undefined
    ): SearchResourcesCriteria = {
      val __obj = js.Dynamic.literal()
      simpleCriterion.foreach(__v => __obj.updateDynamic("simpleCriterion")(__v.asInstanceOf[js.Any]))
      tagCriterion.foreach(__v => __obj.updateDynamic("tagCriterion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchResourcesCriteria]
    }
  }

  /** Specifies property- and tag-based conditions that define filter criteria for including or excluding Amazon Web Services resources from the query results.
    */
  @js.native
  trait SearchResourcesCriteriaBlock extends js.Object {
    var and: js.UndefOr[__listOfSearchResourcesCriteria]
  }

  object SearchResourcesCriteriaBlock {
    @inline
    def apply(
        and: js.UndefOr[__listOfSearchResourcesCriteria] = js.undefined
    ): SearchResourcesCriteriaBlock = {
      val __obj = js.Dynamic.literal()
      and.foreach(__v => __obj.updateDynamic("and")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchResourcesCriteriaBlock]
    }
  }

  @js.native
  trait SearchResourcesRequest extends js.Object {
    var bucketCriteria: js.UndefOr[SearchResourcesBucketCriteria]
    var maxResults: js.UndefOr[__integer]
    var nextToken: js.UndefOr[__string]
    var sortCriteria: js.UndefOr[SearchResourcesSortCriteria]
  }

  object SearchResourcesRequest {
    @inline
    def apply(
        bucketCriteria: js.UndefOr[SearchResourcesBucketCriteria] = js.undefined,
        maxResults: js.UndefOr[__integer] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined,
        sortCriteria: js.UndefOr[SearchResourcesSortCriteria] = js.undefined
    ): SearchResourcesRequest = {
      val __obj = js.Dynamic.literal()
      bucketCriteria.foreach(__v => __obj.updateDynamic("bucketCriteria")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortCriteria.foreach(__v => __obj.updateDynamic("sortCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchResourcesRequest]
    }
  }

  @js.native
  trait SearchResourcesResponse extends js.Object {
    var matchingResources: js.UndefOr[__listOfMatchingResource]
    var nextToken: js.UndefOr[__string]
  }

  object SearchResourcesResponse {
    @inline
    def apply(
        matchingResources: js.UndefOr[__listOfMatchingResource] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined
    ): SearchResourcesResponse = {
      val __obj = js.Dynamic.literal()
      matchingResources.foreach(__v => __obj.updateDynamic("matchingResources")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchResourcesResponse]
    }
  }

  /** Specifies a property-based filter condition that determines which Amazon Web Services resources are included or excluded from the query results.
    */
  @js.native
  trait SearchResourcesSimpleCriterion extends js.Object {
    var comparator: js.UndefOr[SearchResourcesComparator]
    var key: js.UndefOr[SearchResourcesSimpleCriterionKey]
    var values: js.UndefOr[__listOf__string]
  }

  object SearchResourcesSimpleCriterion {
    @inline
    def apply(
        comparator: js.UndefOr[SearchResourcesComparator] = js.undefined,
        key: js.UndefOr[SearchResourcesSimpleCriterionKey] = js.undefined,
        values: js.UndefOr[__listOf__string] = js.undefined
    ): SearchResourcesSimpleCriterion = {
      val __obj = js.Dynamic.literal()
      comparator.foreach(__v => __obj.updateDynamic("comparator")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchResourcesSimpleCriterion]
    }
  }

  /** Specifies criteria for sorting the results of a query for information about Amazon Web Services resources that Amazon Macie monitors and analyzes.
    */
  @js.native
  trait SearchResourcesSortCriteria extends js.Object {
    var attributeName: js.UndefOr[SearchResourcesSortAttributeName]
    var orderBy: js.UndefOr[OrderBy]
  }

  object SearchResourcesSortCriteria {
    @inline
    def apply(
        attributeName: js.UndefOr[SearchResourcesSortAttributeName] = js.undefined,
        orderBy: js.UndefOr[OrderBy] = js.undefined
    ): SearchResourcesSortCriteria = {
      val __obj = js.Dynamic.literal()
      attributeName.foreach(__v => __obj.updateDynamic("attributeName")(__v.asInstanceOf[js.Any]))
      orderBy.foreach(__v => __obj.updateDynamic("orderBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchResourcesSortCriteria]
    }
  }

  /** Specifies a tag-based filter condition that determines which Amazon Web Services resources are included or excluded from the query results.
    */
  @js.native
  trait SearchResourcesTagCriterion extends js.Object {
    var comparator: js.UndefOr[SearchResourcesComparator]
    var tagValues: js.UndefOr[__listOfSearchResourcesTagCriterionPair]
  }

  object SearchResourcesTagCriterion {
    @inline
    def apply(
        comparator: js.UndefOr[SearchResourcesComparator] = js.undefined,
        tagValues: js.UndefOr[__listOfSearchResourcesTagCriterionPair] = js.undefined
    ): SearchResourcesTagCriterion = {
      val __obj = js.Dynamic.literal()
      comparator.foreach(__v => __obj.updateDynamic("comparator")(__v.asInstanceOf[js.Any]))
      tagValues.foreach(__v => __obj.updateDynamic("tagValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchResourcesTagCriterion]
    }
  }

  /** Specifies a tag key, a tag value, or a tag key and value (as a pair) to use in a tag-based filter condition for a query. Tag keys and values are case sensitive. Also, Amazon Macie doesn't support use of partial values or wildcard characters in tag-based filter conditions.
    */
  @js.native
  trait SearchResourcesTagCriterionPair extends js.Object {
    var key: js.UndefOr[__string]
    var value: js.UndefOr[__string]
  }

  object SearchResourcesTagCriterionPair {
    @inline
    def apply(
        key: js.UndefOr[__string] = js.undefined,
        value: js.UndefOr[__string] = js.undefined
    ): SearchResourcesTagCriterionPair = {
      val __obj = js.Dynamic.literal()
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchResourcesTagCriterionPair]
    }
  }

  /** Specifies configuration settings that determine which findings are published to Security Hub automatically. For information about how Macie publishes findings to Security Hub, see [[https://docs.aws.amazon.com/macie/latest/user/securityhub-integration.html|Amazon Macie integration with Security Hub]] in the <i>Amazon Macie User Guide</i>.
    */
  @js.native
  trait SecurityHubConfiguration extends js.Object {
    var publishClassificationFindings: __boolean
    var publishPolicyFindings: __boolean
  }

  object SecurityHubConfiguration {
    @inline
    def apply(
        publishClassificationFindings: __boolean,
        publishPolicyFindings: __boolean
    ): SecurityHubConfiguration = {
      val __obj = js.Dynamic.literal(
        "publishClassificationFindings" -> publishClassificationFindings.asInstanceOf[js.Any],
        "publishPolicyFindings" -> publishPolicyFindings.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SecurityHubConfiguration]
    }
  }

  /** Provides information about the category, types, and occurrences of sensitive data that produced a sensitive data finding.
    */
  @js.native
  trait SensitiveDataItem extends js.Object {
    var category: js.UndefOr[SensitiveDataItemCategory]
    var detections: js.UndefOr[DefaultDetections]
    var totalCount: js.UndefOr[__long]
  }

  object SensitiveDataItem {
    @inline
    def apply(
        category: js.UndefOr[SensitiveDataItemCategory] = js.undefined,
        detections: js.UndefOr[DefaultDetections] = js.undefined,
        totalCount: js.UndefOr[__long] = js.undefined
    ): SensitiveDataItem = {
      val __obj = js.Dynamic.literal()
      category.foreach(__v => __obj.updateDynamic("category")(__v.asInstanceOf[js.Any]))
      detections.foreach(__v => __obj.updateDynamic("detections")(__v.asInstanceOf[js.Any]))
      totalCount.foreach(__v => __obj.updateDynamic("totalCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SensitiveDataItem]
    }
  }

  /** Provides information about the server-side encryption settings for an S3 bucket or S3 object.
    */
  @js.native
  trait ServerSideEncryption extends js.Object {
    var encryptionType: js.UndefOr[EncryptionType]
    var kmsMasterKeyId: js.UndefOr[__string]
  }

  object ServerSideEncryption {
    @inline
    def apply(
        encryptionType: js.UndefOr[EncryptionType] = js.undefined,
        kmsMasterKeyId: js.UndefOr[__string] = js.undefined
    ): ServerSideEncryption = {
      val __obj = js.Dynamic.literal()
      encryptionType.foreach(__v => __obj.updateDynamic("encryptionType")(__v.asInstanceOf[js.Any]))
      kmsMasterKeyId.foreach(__v => __obj.updateDynamic("kmsMasterKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerSideEncryption]
    }
  }

  /** Specifies a current quota for an Amazon Macie account.
    */
  @js.native
  trait ServiceLimit extends js.Object {
    var isServiceLimited: js.UndefOr[__boolean]
    var unit: js.UndefOr[Unit]
    var value: js.UndefOr[__long]
  }

  object ServiceLimit {
    @inline
    def apply(
        isServiceLimited: js.UndefOr[__boolean] = js.undefined,
        unit: js.UndefOr[Unit] = js.undefined,
        value: js.UndefOr[__long] = js.undefined
    ): ServiceLimit = {
      val __obj = js.Dynamic.literal()
      isServiceLimited.foreach(__v => __obj.updateDynamic("isServiceLimited")(__v.asInstanceOf[js.Any]))
      unit.foreach(__v => __obj.updateDynamic("unit")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceLimit]
    }
  }

  /** Provides information about a session that was created for an entity that performed an action by using temporary security credentials.
    */
  @js.native
  trait SessionContext extends js.Object {
    var attributes: js.UndefOr[SessionContextAttributes]
    var sessionIssuer: js.UndefOr[SessionIssuer]
  }

  object SessionContext {
    @inline
    def apply(
        attributes: js.UndefOr[SessionContextAttributes] = js.undefined,
        sessionIssuer: js.UndefOr[SessionIssuer] = js.undefined
    ): SessionContext = {
      val __obj = js.Dynamic.literal()
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      sessionIssuer.foreach(__v => __obj.updateDynamic("sessionIssuer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SessionContext]
    }
  }

  /** Provides information about the context in which temporary security credentials were issued to an entity.
    */
  @js.native
  trait SessionContextAttributes extends js.Object {
    var creationDate: js.UndefOr[__timestampIso8601]
    var mfaAuthenticated: js.UndefOr[__boolean]
  }

  object SessionContextAttributes {
    @inline
    def apply(
        creationDate: js.UndefOr[__timestampIso8601] = js.undefined,
        mfaAuthenticated: js.UndefOr[__boolean] = js.undefined
    ): SessionContextAttributes = {
      val __obj = js.Dynamic.literal()
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      mfaAuthenticated.foreach(__v => __obj.updateDynamic("mfaAuthenticated")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SessionContextAttributes]
    }
  }

  /** Provides information about the source and type of temporary security credentials that were issued to an entity.
    */
  @js.native
  trait SessionIssuer extends js.Object {
    var accountId: js.UndefOr[__string]
    var arn: js.UndefOr[__string]
    var principalId: js.UndefOr[__string]
    var `type`: js.UndefOr[__string]
    var userName: js.UndefOr[__string]
  }

  object SessionIssuer {
    @inline
    def apply(
        accountId: js.UndefOr[__string] = js.undefined,
        arn: js.UndefOr[__string] = js.undefined,
        principalId: js.UndefOr[__string] = js.undefined,
        `type`: js.UndefOr[__string] = js.undefined,
        userName: js.UndefOr[__string] = js.undefined
    ): SessionIssuer = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      principalId.foreach(__v => __obj.updateDynamic("principalId")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      userName.foreach(__v => __obj.updateDynamic("userName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SessionIssuer]
    }
  }

  /** Provides the numerical and qualitative representations of a finding's severity.
    */
  @js.native
  trait Severity extends js.Object {
    var description: js.UndefOr[SeverityDescription]
    var score: js.UndefOr[__long]
  }

  object Severity {
    @inline
    def apply(
        description: js.UndefOr[SeverityDescription] = js.undefined,
        score: js.UndefOr[__long] = js.undefined
    ): Severity = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      score.foreach(__v => __obj.updateDynamic("score")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Severity]
    }
  }

  /** Specifies a severity level for findings that a custom data identifier produces. A severity level determines which severity is assigned to the findings, based on the number of occurrences of text that matches the custom data identifier's detection criteria.
    */
  @js.native
  trait SeverityLevel extends js.Object {
    var occurrencesThreshold: __long
    var severity: DataIdentifierSeverity
  }

  object SeverityLevel {
    @inline
    def apply(
        occurrencesThreshold: __long,
        severity: DataIdentifierSeverity
    ): SeverityLevel = {
      val __obj = js.Dynamic.literal(
        "occurrencesThreshold" -> occurrencesThreshold.asInstanceOf[js.Any],
        "severity" -> severity.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SeverityLevel]
    }
  }

  /** Specifies a property-based condition that determines whether an S3 bucket is included or excluded from a classification job.
    */
  @js.native
  trait SimpleCriterionForJob extends js.Object {
    var comparator: js.UndefOr[JobComparator]
    var key: js.UndefOr[SimpleCriterionKeyForJob]
    var values: js.UndefOr[__listOf__string]
  }

  object SimpleCriterionForJob {
    @inline
    def apply(
        comparator: js.UndefOr[JobComparator] = js.undefined,
        key: js.UndefOr[SimpleCriterionKeyForJob] = js.undefined,
        values: js.UndefOr[__listOf__string] = js.undefined
    ): SimpleCriterionForJob = {
      val __obj = js.Dynamic.literal()
      comparator.foreach(__v => __obj.updateDynamic("comparator")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimpleCriterionForJob]
    }
  }

  /** Specifies a property-based condition that determines whether an S3 object is included or excluded from a classification job.
    */
  @js.native
  trait SimpleScopeTerm extends js.Object {
    var comparator: js.UndefOr[JobComparator]
    var key: js.UndefOr[ScopeFilterKey]
    var values: js.UndefOr[__listOf__string]
  }

  object SimpleScopeTerm {
    @inline
    def apply(
        comparator: js.UndefOr[JobComparator] = js.undefined,
        key: js.UndefOr[ScopeFilterKey] = js.undefined,
        values: js.UndefOr[__listOf__string] = js.undefined
    ): SimpleScopeTerm = {
      val __obj = js.Dynamic.literal()
      comparator.foreach(__v => __obj.updateDynamic("comparator")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimpleScopeTerm]
    }
  }

  /** Specifies criteria for sorting the results of a request for findings.
    */
  @js.native
  trait SortCriteria extends js.Object {
    var attributeName: js.UndefOr[__string]
    var orderBy: js.UndefOr[OrderBy]
  }

  object SortCriteria {
    @inline
    def apply(
        attributeName: js.UndefOr[__string] = js.undefined,
        orderBy: js.UndefOr[OrderBy] = js.undefined
    ): SortCriteria = {
      val __obj = js.Dynamic.literal()
      attributeName.foreach(__v => __obj.updateDynamic("attributeName")(__v.asInstanceOf[js.Any]))
      orderBy.foreach(__v => __obj.updateDynamic("orderBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SortCriteria]
    }
  }

  /** Provides processing statistics for a classification job.
    */
  @js.native
  trait Statistics extends js.Object {
    var approximateNumberOfObjectsToProcess: js.UndefOr[__double]
    var numberOfRuns: js.UndefOr[__double]
  }

  object Statistics {
    @inline
    def apply(
        approximateNumberOfObjectsToProcess: js.UndefOr[__double] = js.undefined,
        numberOfRuns: js.UndefOr[__double] = js.undefined
    ): Statistics = {
      val __obj = js.Dynamic.literal()
      approximateNumberOfObjectsToProcess.foreach(__v => __obj.updateDynamic("approximateNumberOfObjectsToProcess")(__v.asInstanceOf[js.Any]))
      numberOfRuns.foreach(__v => __obj.updateDynamic("numberOfRuns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Statistics]
    }
  }

  /** Specifies a tag-based condition that determines whether an S3 bucket is included or excluded from a classification job.
    */
  @js.native
  trait TagCriterionForJob extends js.Object {
    var comparator: js.UndefOr[JobComparator]
    var tagValues: js.UndefOr[__listOfTagCriterionPairForJob]
  }

  object TagCriterionForJob {
    @inline
    def apply(
        comparator: js.UndefOr[JobComparator] = js.undefined,
        tagValues: js.UndefOr[__listOfTagCriterionPairForJob] = js.undefined
    ): TagCriterionForJob = {
      val __obj = js.Dynamic.literal()
      comparator.foreach(__v => __obj.updateDynamic("comparator")(__v.asInstanceOf[js.Any]))
      tagValues.foreach(__v => __obj.updateDynamic("tagValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagCriterionForJob]
    }
  }

  /** Specifies a tag key, a tag value, or a tag key and value (as a pair) to use in a tag-based condition that determines whether an S3 bucket is included or excluded from a classification job. Tag keys and values are case sensitive. Also, Amazon Macie doesn't support use of partial values or wildcard characters in tag-based conditions.
    */
  @js.native
  trait TagCriterionPairForJob extends js.Object {
    var key: js.UndefOr[__string]
    var value: js.UndefOr[__string]
  }

  object TagCriterionPairForJob {
    @inline
    def apply(
        key: js.UndefOr[__string] = js.undefined,
        value: js.UndefOr[__string] = js.undefined
    ): TagCriterionPairForJob = {
      val __obj = js.Dynamic.literal()
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagCriterionPairForJob]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: __string
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: __string,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
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

  /** Specifies a tag-based condition that determines whether an S3 object is included or excluded from a classification job.
    */
  @js.native
  trait TagScopeTerm extends js.Object {
    var comparator: js.UndefOr[JobComparator]
    var key: js.UndefOr[__string]
    var tagValues: js.UndefOr[__listOfTagValuePair]
    var target: js.UndefOr[TagTarget]
  }

  object TagScopeTerm {
    @inline
    def apply(
        comparator: js.UndefOr[JobComparator] = js.undefined,
        key: js.UndefOr[__string] = js.undefined,
        tagValues: js.UndefOr[__listOfTagValuePair] = js.undefined,
        target: js.UndefOr[TagTarget] = js.undefined
    ): TagScopeTerm = {
      val __obj = js.Dynamic.literal()
      comparator.foreach(__v => __obj.updateDynamic("comparator")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      tagValues.foreach(__v => __obj.updateDynamic("tagValues")(__v.asInstanceOf[js.Any]))
      target.foreach(__v => __obj.updateDynamic("target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagScopeTerm]
    }
  }

  /** Specifies a tag key or tag key and value pair to use in a tag-based condition that determines whether an S3 object is included or excluded from a classification job. Tag keys and values are case sensitive. Also, Amazon Macie doesn't support use of partial values or wildcard characters in tag-based conditions.
    */
  @js.native
  trait TagValuePair extends js.Object {
    var key: js.UndefOr[__string]
    var value: js.UndefOr[__string]
  }

  object TagValuePair {
    @inline
    def apply(
        key: js.UndefOr[__string] = js.undefined,
        value: js.UndefOr[__string] = js.undefined
    ): TagValuePair = {
      val __obj = js.Dynamic.literal()
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagValuePair]
    }
  }

  @js.native
  trait TestCustomDataIdentifierRequest extends js.Object {
    var regex: __string
    var sampleText: __string
    var ignoreWords: js.UndefOr[__listOf__string]
    var keywords: js.UndefOr[__listOf__string]
    var maximumMatchDistance: js.UndefOr[__integer]
  }

  object TestCustomDataIdentifierRequest {
    @inline
    def apply(
        regex: __string,
        sampleText: __string,
        ignoreWords: js.UndefOr[__listOf__string] = js.undefined,
        keywords: js.UndefOr[__listOf__string] = js.undefined,
        maximumMatchDistance: js.UndefOr[__integer] = js.undefined
    ): TestCustomDataIdentifierRequest = {
      val __obj = js.Dynamic.literal(
        "regex" -> regex.asInstanceOf[js.Any],
        "sampleText" -> sampleText.asInstanceOf[js.Any]
      )

      ignoreWords.foreach(__v => __obj.updateDynamic("ignoreWords")(__v.asInstanceOf[js.Any]))
      keywords.foreach(__v => __obj.updateDynamic("keywords")(__v.asInstanceOf[js.Any]))
      maximumMatchDistance.foreach(__v => __obj.updateDynamic("maximumMatchDistance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestCustomDataIdentifierRequest]
    }
  }

  @js.native
  trait TestCustomDataIdentifierResponse extends js.Object {
    var matchCount: js.UndefOr[__integer]
  }

  object TestCustomDataIdentifierResponse {
    @inline
    def apply(
        matchCount: js.UndefOr[__integer] = js.undefined
    ): TestCustomDataIdentifierResponse = {
      val __obj = js.Dynamic.literal()
      matchCount.foreach(__v => __obj.updateDynamic("matchCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestCustomDataIdentifierResponse]
    }
  }

  /** Provides information about an account-related request that hasn't been processed.
    */
  @js.native
  trait UnprocessedAccount extends js.Object {
    var accountId: js.UndefOr[__string]
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[__string]
  }

  object UnprocessedAccount {
    @inline
    def apply(
        accountId: js.UndefOr[__string] = js.undefined,
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        errorMessage: js.UndefOr[__string] = js.undefined
    ): UnprocessedAccount = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnprocessedAccount]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: __string
    var tagKeys: __listOf__string
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: __string,
        tagKeys: __listOf__string
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
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
  trait UpdateClassificationJobRequest extends js.Object {
    var jobId: __string
    var jobStatus: JobStatus
  }

  object UpdateClassificationJobRequest {
    @inline
    def apply(
        jobId: __string,
        jobStatus: JobStatus
    ): UpdateClassificationJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any],
        "jobStatus" -> jobStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateClassificationJobRequest]
    }
  }

  @js.native
  trait UpdateClassificationJobResponse extends js.Object

  object UpdateClassificationJobResponse {
    @inline
    def apply(): UpdateClassificationJobResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateClassificationJobResponse]
    }
  }

  @js.native
  trait UpdateFindingsFilterRequest extends js.Object {
    var id: __string
    var action: js.UndefOr[FindingsFilterAction]
    var clientToken: js.UndefOr[__string]
    var description: js.UndefOr[__string]
    var findingCriteria: js.UndefOr[FindingCriteria]
    var name: js.UndefOr[__string]
    var position: js.UndefOr[__integer]
  }

  object UpdateFindingsFilterRequest {
    @inline
    def apply(
        id: __string,
        action: js.UndefOr[FindingsFilterAction] = js.undefined,
        clientToken: js.UndefOr[__string] = js.undefined,
        description: js.UndefOr[__string] = js.undefined,
        findingCriteria: js.UndefOr[FindingCriteria] = js.undefined,
        name: js.UndefOr[__string] = js.undefined,
        position: js.UndefOr[__integer] = js.undefined
    ): UpdateFindingsFilterRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      action.foreach(__v => __obj.updateDynamic("action")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      findingCriteria.foreach(__v => __obj.updateDynamic("findingCriteria")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.updateDynamic("position")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFindingsFilterRequest]
    }
  }

  @js.native
  trait UpdateFindingsFilterResponse extends js.Object {
    var arn: js.UndefOr[__string]
    var id: js.UndefOr[__string]
  }

  object UpdateFindingsFilterResponse {
    @inline
    def apply(
        arn: js.UndefOr[__string] = js.undefined,
        id: js.UndefOr[__string] = js.undefined
    ): UpdateFindingsFilterResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFindingsFilterResponse]
    }
  }

  @js.native
  trait UpdateMacieSessionRequest extends js.Object {
    var findingPublishingFrequency: js.UndefOr[FindingPublishingFrequency]
    var status: js.UndefOr[MacieStatus]
  }

  object UpdateMacieSessionRequest {
    @inline
    def apply(
        findingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined,
        status: js.UndefOr[MacieStatus] = js.undefined
    ): UpdateMacieSessionRequest = {
      val __obj = js.Dynamic.literal()
      findingPublishingFrequency.foreach(__v => __obj.updateDynamic("findingPublishingFrequency")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMacieSessionRequest]
    }
  }

  @js.native
  trait UpdateMacieSessionResponse extends js.Object

  object UpdateMacieSessionResponse {
    @inline
    def apply(): UpdateMacieSessionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateMacieSessionResponse]
    }
  }

  @js.native
  trait UpdateMemberSessionRequest extends js.Object {
    var id: __string
    var status: MacieStatus
  }

  object UpdateMemberSessionRequest {
    @inline
    def apply(
        id: __string,
        status: MacieStatus
    ): UpdateMemberSessionRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateMemberSessionRequest]
    }
  }

  @js.native
  trait UpdateMemberSessionResponse extends js.Object

  object UpdateMemberSessionResponse {
    @inline
    def apply(): UpdateMemberSessionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateMemberSessionResponse]
    }
  }

  @js.native
  trait UpdateOrganizationConfigurationRequest extends js.Object {
    var autoEnable: __boolean
  }

  object UpdateOrganizationConfigurationRequest {
    @inline
    def apply(
        autoEnable: __boolean
    ): UpdateOrganizationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "autoEnable" -> autoEnable.asInstanceOf[js.Any]
      )
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

  /** Provides data for a specific usage metric and the corresponding quota for an Amazon Macie account.
    */
  @js.native
  trait UsageByAccount extends js.Object {
    var currency: js.UndefOr[Currency]
    var estimatedCost: js.UndefOr[__string]
    var serviceLimit: js.UndefOr[ServiceLimit]
    var `type`: js.UndefOr[UsageType]
  }

  object UsageByAccount {
    @inline
    def apply(
        currency: js.UndefOr[Currency] = js.undefined,
        estimatedCost: js.UndefOr[__string] = js.undefined,
        serviceLimit: js.UndefOr[ServiceLimit] = js.undefined,
        `type`: js.UndefOr[UsageType] = js.undefined
    ): UsageByAccount = {
      val __obj = js.Dynamic.literal()
      currency.foreach(__v => __obj.updateDynamic("currency")(__v.asInstanceOf[js.Any]))
      estimatedCost.foreach(__v => __obj.updateDynamic("estimatedCost")(__v.asInstanceOf[js.Any]))
      serviceLimit.foreach(__v => __obj.updateDynamic("serviceLimit")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageByAccount]
    }
  }

  /** Provides quota and aggregated usage data for an Amazon Macie account.
    */
  @js.native
  trait UsageRecord extends js.Object {
    var accountId: js.UndefOr[__string]
    var freeTrialStartDate: js.UndefOr[__timestampIso8601]
    var usage: js.UndefOr[__listOfUsageByAccount]
  }

  object UsageRecord {
    @inline
    def apply(
        accountId: js.UndefOr[__string] = js.undefined,
        freeTrialStartDate: js.UndefOr[__timestampIso8601] = js.undefined,
        usage: js.UndefOr[__listOfUsageByAccount] = js.undefined
    ): UsageRecord = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      freeTrialStartDate.foreach(__v => __obj.updateDynamic("freeTrialStartDate")(__v.asInstanceOf[js.Any]))
      usage.foreach(__v => __obj.updateDynamic("usage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageRecord]
    }
  }

  /** Specifies a condition for filtering the results of a query for quota and usage data for one or more Amazon Macie accounts.
    */
  @js.native
  trait UsageStatisticsFilter extends js.Object {
    var comparator: js.UndefOr[UsageStatisticsFilterComparator]
    var key: js.UndefOr[UsageStatisticsFilterKey]
    var values: js.UndefOr[__listOf__string]
  }

  object UsageStatisticsFilter {
    @inline
    def apply(
        comparator: js.UndefOr[UsageStatisticsFilterComparator] = js.undefined,
        key: js.UndefOr[UsageStatisticsFilterKey] = js.undefined,
        values: js.UndefOr[__listOf__string] = js.undefined
    ): UsageStatisticsFilter = {
      val __obj = js.Dynamic.literal()
      comparator.foreach(__v => __obj.updateDynamic("comparator")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageStatisticsFilter]
    }
  }

  /** Specifies criteria for sorting the results of a query for Amazon Macie account quotas and usage data.
    */
  @js.native
  trait UsageStatisticsSortBy extends js.Object {
    var key: js.UndefOr[UsageStatisticsSortKey]
    var orderBy: js.UndefOr[OrderBy]
  }

  object UsageStatisticsSortBy {
    @inline
    def apply(
        key: js.UndefOr[UsageStatisticsSortKey] = js.undefined,
        orderBy: js.UndefOr[OrderBy] = js.undefined
    ): UsageStatisticsSortBy = {
      val __obj = js.Dynamic.literal()
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      orderBy.foreach(__v => __obj.updateDynamic("orderBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageStatisticsSortBy]
    }
  }

  /** Provides aggregated data for an Amazon Macie usage metric. The value for the metric reports estimated usage data for an account for the preceding 30 days or the current calendar month to date, depending on the time period (timeRange) specified in the request.
    */
  @js.native
  trait UsageTotal extends js.Object {
    var currency: js.UndefOr[Currency]
    var estimatedCost: js.UndefOr[__string]
    var `type`: js.UndefOr[UsageType]
  }

  object UsageTotal {
    @inline
    def apply(
        currency: js.UndefOr[Currency] = js.undefined,
        estimatedCost: js.UndefOr[__string] = js.undefined,
        `type`: js.UndefOr[UsageType] = js.undefined
    ): UsageTotal = {
      val __obj = js.Dynamic.literal()
      currency.foreach(__v => __obj.updateDynamic("currency")(__v.asInstanceOf[js.Any]))
      estimatedCost.foreach(__v => __obj.updateDynamic("estimatedCost")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageTotal]
    }
  }

  /** Provides information about the type and other characteristics of an entity that performed an action on an affected resource.
    */
  @js.native
  trait UserIdentity extends js.Object {
    var assumedRole: js.UndefOr[AssumedRole]
    var awsAccount: js.UndefOr[AwsAccount]
    var awsService: js.UndefOr[AwsService]
    var federatedUser: js.UndefOr[FederatedUser]
    var iamUser: js.UndefOr[IamUser]
    var root: js.UndefOr[UserIdentityRoot]
    var `type`: js.UndefOr[UserIdentityType]
  }

  object UserIdentity {
    @inline
    def apply(
        assumedRole: js.UndefOr[AssumedRole] = js.undefined,
        awsAccount: js.UndefOr[AwsAccount] = js.undefined,
        awsService: js.UndefOr[AwsService] = js.undefined,
        federatedUser: js.UndefOr[FederatedUser] = js.undefined,
        iamUser: js.UndefOr[IamUser] = js.undefined,
        root: js.UndefOr[UserIdentityRoot] = js.undefined,
        `type`: js.UndefOr[UserIdentityType] = js.undefined
    ): UserIdentity = {
      val __obj = js.Dynamic.literal()
      assumedRole.foreach(__v => __obj.updateDynamic("assumedRole")(__v.asInstanceOf[js.Any]))
      awsAccount.foreach(__v => __obj.updateDynamic("awsAccount")(__v.asInstanceOf[js.Any]))
      awsService.foreach(__v => __obj.updateDynamic("awsService")(__v.asInstanceOf[js.Any]))
      federatedUser.foreach(__v => __obj.updateDynamic("federatedUser")(__v.asInstanceOf[js.Any]))
      iamUser.foreach(__v => __obj.updateDynamic("iamUser")(__v.asInstanceOf[js.Any]))
      root.foreach(__v => __obj.updateDynamic("root")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserIdentity]
    }
  }

  /** Provides information about an Amazon Web Services account and entity that performed an action on an affected resource. The action was performed using the credentials for your Amazon Web Services account.
    */
  @js.native
  trait UserIdentityRoot extends js.Object {
    var accountId: js.UndefOr[__string]
    var arn: js.UndefOr[__string]
    var principalId: js.UndefOr[__string]
  }

  object UserIdentityRoot {
    @inline
    def apply(
        accountId: js.UndefOr[__string] = js.undefined,
        arn: js.UndefOr[__string] = js.undefined,
        principalId: js.UndefOr[__string] = js.undefined
    ): UserIdentityRoot = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      principalId.foreach(__v => __obj.updateDynamic("principalId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserIdentityRoot]
    }
  }

  /** Provides information about when a classification job was paused. For a one-time job, this object also specifies when the job will expire and be cancelled if it isn't resumed. For a recurring job, this object also specifies when the paused job run will expire and be cancelled if it isn't resumed. This object is present only if a job's current status (jobStatus) is USER_PAUSED. The information in this object applies only to a job that was paused while it had a status of RUNNING.
    */
  @js.native
  trait UserPausedDetails extends js.Object {
    var jobExpiresAt: js.UndefOr[__timestampIso8601]
    var jobImminentExpirationHealthEventArn: js.UndefOr[__string]
    var jobPausedAt: js.UndefOr[__timestampIso8601]
  }

  object UserPausedDetails {
    @inline
    def apply(
        jobExpiresAt: js.UndefOr[__timestampIso8601] = js.undefined,
        jobImminentExpirationHealthEventArn: js.UndefOr[__string] = js.undefined,
        jobPausedAt: js.UndefOr[__timestampIso8601] = js.undefined
    ): UserPausedDetails = {
      val __obj = js.Dynamic.literal()
      jobExpiresAt.foreach(__v => __obj.updateDynamic("jobExpiresAt")(__v.asInstanceOf[js.Any]))
      jobImminentExpirationHealthEventArn.foreach(__v => __obj.updateDynamic("jobImminentExpirationHealthEventArn")(__v.asInstanceOf[js.Any]))
      jobPausedAt.foreach(__v => __obj.updateDynamic("jobPausedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserPausedDetails]
    }
  }

  /** Specifies a weekly recurrence pattern for running a classification job.
    */
  @js.native
  trait WeeklySchedule extends js.Object {
    var dayOfWeek: js.UndefOr[DayOfWeek]
  }

  object WeeklySchedule {
    @inline
    def apply(
        dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
    ): WeeklySchedule = {
      val __obj = js.Dynamic.literal()
      dayOfWeek.foreach(__v => __obj.updateDynamic("dayOfWeek")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WeeklySchedule]
    }
  }
}
