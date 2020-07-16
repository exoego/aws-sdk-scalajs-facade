package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object macie2 {
  type BucketCriteria = js.Dictionary[BucketCriteriaAdditionalProperties]
  type Criterion = js.Dictionary[CriterionAdditionalProperties]
  type CustomDetections = js.Array[CustomDetection]
  type DefaultDetections = js.Array[DefaultDetection]
  type KeyValuePairList = js.Array[KeyValuePair]
  type MaxResults = Int
  type SensitiveData = js.Array[SensitiveDataItem]
  type TagMap = js.Dictionary[__string]
  type __boolean = Boolean
  type __double = Double
  type __integer = Int
  type __listOfAdminAccount = js.Array[AdminAccount]
  type __listOfBatchGetCustomDataIdentifierSummary = js.Array[BatchGetCustomDataIdentifierSummary]
  type __listOfBucketMetadata = js.Array[BucketMetadata]
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
  type __listOfMember = js.Array[Member]
  type __listOfS3BucketDefinitionForJob = js.Array[S3BucketDefinitionForJob]
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

  implicit final class Macie2Ops(private val service: Macie2) extends AnyVal {

    @inline def acceptInvitationFuture(params: AcceptInvitationRequest): Future[AcceptInvitationResponse] =
      service.acceptInvitation(params).promise().toFuture
    @inline def batchGetCustomDataIdentifiersFuture(
        params: BatchGetCustomDataIdentifiersRequest
    ): Future[BatchGetCustomDataIdentifiersResponse] = service.batchGetCustomDataIdentifiers(params).promise().toFuture
    @inline def createClassificationJobFuture(
        params: CreateClassificationJobRequest
    ): Future[CreateClassificationJobResponse] = service.createClassificationJob(params).promise().toFuture
    @inline def createCustomDataIdentifierFuture(
        params: CreateCustomDataIdentifierRequest
    ): Future[CreateCustomDataIdentifierResponse] = service.createCustomDataIdentifier(params).promise().toFuture
    @inline def createFindingsFilterFuture(params: CreateFindingsFilterRequest): Future[CreateFindingsFilterResponse] =
      service.createFindingsFilter(params).promise().toFuture
    @inline def createInvitationsFuture(params: CreateInvitationsRequest): Future[CreateInvitationsResponse] =
      service.createInvitations(params).promise().toFuture
    @inline def createMemberFuture(params: CreateMemberRequest): Future[CreateMemberResponse] =
      service.createMember(params).promise().toFuture
    @inline def createSampleFindingsFuture(params: CreateSampleFindingsRequest): Future[CreateSampleFindingsResponse] =
      service.createSampleFindings(params).promise().toFuture
    @inline def declineInvitationsFuture(params: DeclineInvitationsRequest): Future[DeclineInvitationsResponse] =
      service.declineInvitations(params).promise().toFuture
    @inline def deleteCustomDataIdentifierFuture(
        params: DeleteCustomDataIdentifierRequest
    ): Future[DeleteCustomDataIdentifierResponse] = service.deleteCustomDataIdentifier(params).promise().toFuture
    @inline def deleteFindingsFilterFuture(params: DeleteFindingsFilterRequest): Future[DeleteFindingsFilterResponse] =
      service.deleteFindingsFilter(params).promise().toFuture
    @inline def deleteInvitationsFuture(params: DeleteInvitationsRequest): Future[DeleteInvitationsResponse] =
      service.deleteInvitations(params).promise().toFuture
    @inline def deleteMemberFuture(params: DeleteMemberRequest): Future[DeleteMemberResponse] =
      service.deleteMember(params).promise().toFuture
    @inline def describeBucketsFuture(params: DescribeBucketsRequest): Future[DescribeBucketsResponse] =
      service.describeBuckets(params).promise().toFuture
    @inline def describeClassificationJobFuture(
        params: DescribeClassificationJobRequest
    ): Future[DescribeClassificationJobResponse] = service.describeClassificationJob(params).promise().toFuture
    @inline def describeOrganizationConfigurationFuture(
        params: DescribeOrganizationConfigurationRequest
    ): Future[DescribeOrganizationConfigurationResponse] =
      service.describeOrganizationConfiguration(params).promise().toFuture
    @inline def disableMacieFuture(params: DisableMacieRequest): Future[DisableMacieResponse] =
      service.disableMacie(params).promise().toFuture
    @inline def disableOrganizationAdminAccountFuture(
        params: DisableOrganizationAdminAccountRequest
    ): Future[DisableOrganizationAdminAccountResponse] =
      service.disableOrganizationAdminAccount(params).promise().toFuture
    @inline def disassociateFromMasterAccountFuture(
        params: DisassociateFromMasterAccountRequest
    ): Future[DisassociateFromMasterAccountResponse] = service.disassociateFromMasterAccount(params).promise().toFuture
    @inline def disassociateMemberFuture(params: DisassociateMemberRequest): Future[DisassociateMemberResponse] =
      service.disassociateMember(params).promise().toFuture
    @inline def enableMacieFuture(params: EnableMacieRequest): Future[EnableMacieResponse] =
      service.enableMacie(params).promise().toFuture
    @inline def enableOrganizationAdminAccountFuture(
        params: EnableOrganizationAdminAccountRequest
    ): Future[EnableOrganizationAdminAccountResponse] =
      service.enableOrganizationAdminAccount(params).promise().toFuture
    @inline def getBucketStatisticsFuture(params: GetBucketStatisticsRequest): Future[GetBucketStatisticsResponse] =
      service.getBucketStatistics(params).promise().toFuture
    @inline def getClassificationExportConfigurationFuture(
        params: GetClassificationExportConfigurationRequest
    ): Future[GetClassificationExportConfigurationResponse] =
      service.getClassificationExportConfiguration(params).promise().toFuture
    @inline def getCustomDataIdentifierFuture(
        params: GetCustomDataIdentifierRequest
    ): Future[GetCustomDataIdentifierResponse] = service.getCustomDataIdentifier(params).promise().toFuture
    @inline def getFindingStatisticsFuture(params: GetFindingStatisticsRequest): Future[GetFindingStatisticsResponse] =
      service.getFindingStatistics(params).promise().toFuture
    @inline def getFindingsFilterFuture(params: GetFindingsFilterRequest): Future[GetFindingsFilterResponse] =
      service.getFindingsFilter(params).promise().toFuture
    @inline def getFindingsFuture(params: GetFindingsRequest): Future[GetFindingsResponse] =
      service.getFindings(params).promise().toFuture
    @inline def getInvitationsCountFuture(params: GetInvitationsCountRequest): Future[GetInvitationsCountResponse] =
      service.getInvitationsCount(params).promise().toFuture
    @inline def getMacieSessionFuture(params: GetMacieSessionRequest): Future[GetMacieSessionResponse] =
      service.getMacieSession(params).promise().toFuture
    @inline def getMasterAccountFuture(params: GetMasterAccountRequest): Future[GetMasterAccountResponse] =
      service.getMasterAccount(params).promise().toFuture
    @inline def getMemberFuture(params: GetMemberRequest): Future[GetMemberResponse] =
      service.getMember(params).promise().toFuture
    @inline def getUsageStatisticsFuture(params: GetUsageStatisticsRequest): Future[GetUsageStatisticsResponse] =
      service.getUsageStatistics(params).promise().toFuture
    @inline def getUsageTotalsFuture(params: GetUsageTotalsRequest): Future[GetUsageTotalsResponse] =
      service.getUsageTotals(params).promise().toFuture
    @inline def listClassificationJobsFuture(
        params: ListClassificationJobsRequest
    ): Future[ListClassificationJobsResponse] = service.listClassificationJobs(params).promise().toFuture
    @inline def listCustomDataIdentifiersFuture(
        params: ListCustomDataIdentifiersRequest
    ): Future[ListCustomDataIdentifiersResponse] = service.listCustomDataIdentifiers(params).promise().toFuture
    @inline def listFindingsFiltersFuture(params: ListFindingsFiltersRequest): Future[ListFindingsFiltersResponse] =
      service.listFindingsFilters(params).promise().toFuture
    @inline def listFindingsFuture(params: ListFindingsRequest): Future[ListFindingsResponse] =
      service.listFindings(params).promise().toFuture
    @inline def listInvitationsFuture(params: ListInvitationsRequest): Future[ListInvitationsResponse] =
      service.listInvitations(params).promise().toFuture
    @inline def listMembersFuture(params: ListMembersRequest): Future[ListMembersResponse] =
      service.listMembers(params).promise().toFuture
    @inline def listOrganizationAdminAccountsFuture(
        params: ListOrganizationAdminAccountsRequest
    ): Future[ListOrganizationAdminAccountsResponse] = service.listOrganizationAdminAccounts(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def putClassificationExportConfigurationFuture(
        params: PutClassificationExportConfigurationRequest
    ): Future[PutClassificationExportConfigurationResponse] =
      service.putClassificationExportConfiguration(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def testCustomDataIdentifierFuture(
        params: TestCustomDataIdentifierRequest
    ): Future[TestCustomDataIdentifierResponse] = service.testCustomDataIdentifier(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateClassificationJobFuture(
        params: UpdateClassificationJobRequest
    ): Future[UpdateClassificationJobResponse] = service.updateClassificationJob(params).promise().toFuture
    @inline def updateFindingsFilterFuture(params: UpdateFindingsFilterRequest): Future[UpdateFindingsFilterResponse] =
      service.updateFindingsFilter(params).promise().toFuture
    @inline def updateMacieSessionFuture(params: UpdateMacieSessionRequest): Future[UpdateMacieSessionResponse] =
      service.updateMacieSession(params).promise().toFuture
    @inline def updateMemberSessionFuture(params: UpdateMemberSessionRequest): Future[UpdateMemberSessionResponse] =
      service.updateMemberSession(params).promise().toFuture
    @inline def updateOrganizationConfigurationFuture(
        params: UpdateOrganizationConfigurationRequest
    ): Future[UpdateOrganizationConfigurationResponse] =
      service.updateOrganizationConfiguration(params).promise().toFuture
  }
}

package macie2 {
  @js.native
  @JSImport("aws-sdk", "Macie2", "AWS.Macie2")
  class Macie2() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptInvitation(params: AcceptInvitationRequest): Request[AcceptInvitationResponse] = js.native
    def batchGetCustomDataIdentifiers(
        params: BatchGetCustomDataIdentifiersRequest
    ): Request[BatchGetCustomDataIdentifiersResponse] = js.native
    def createClassificationJob(params: CreateClassificationJobRequest): Request[CreateClassificationJobResponse] =
      js.native
    def createCustomDataIdentifier(
        params: CreateCustomDataIdentifierRequest
    ): Request[CreateCustomDataIdentifierResponse] = js.native
    def createFindingsFilter(params: CreateFindingsFilterRequest): Request[CreateFindingsFilterResponse] = js.native
    def createInvitations(params: CreateInvitationsRequest): Request[CreateInvitationsResponse] = js.native
    def createMember(params: CreateMemberRequest): Request[CreateMemberResponse] = js.native
    def createSampleFindings(params: CreateSampleFindingsRequest): Request[CreateSampleFindingsResponse] = js.native
    def declineInvitations(params: DeclineInvitationsRequest): Request[DeclineInvitationsResponse] = js.native
    def deleteCustomDataIdentifier(
        params: DeleteCustomDataIdentifierRequest
    ): Request[DeleteCustomDataIdentifierResponse] = js.native
    def deleteFindingsFilter(params: DeleteFindingsFilterRequest): Request[DeleteFindingsFilterResponse] = js.native
    def deleteInvitations(params: DeleteInvitationsRequest): Request[DeleteInvitationsResponse] = js.native
    def deleteMember(params: DeleteMemberRequest): Request[DeleteMemberResponse] = js.native
    def describeBuckets(params: DescribeBucketsRequest): Request[DescribeBucketsResponse] = js.native
    def describeClassificationJob(
        params: DescribeClassificationJobRequest
    ): Request[DescribeClassificationJobResponse] = js.native
    def describeOrganizationConfiguration(
        params: DescribeOrganizationConfigurationRequest
    ): Request[DescribeOrganizationConfigurationResponse] = js.native
    def disableMacie(params: DisableMacieRequest): Request[DisableMacieResponse] = js.native
    def disableOrganizationAdminAccount(
        params: DisableOrganizationAdminAccountRequest
    ): Request[DisableOrganizationAdminAccountResponse] = js.native
    def disassociateFromMasterAccount(
        params: DisassociateFromMasterAccountRequest
    ): Request[DisassociateFromMasterAccountResponse] = js.native
    def disassociateMember(params: DisassociateMemberRequest): Request[DisassociateMemberResponse] = js.native
    def enableMacie(params: EnableMacieRequest): Request[EnableMacieResponse] = js.native
    def enableOrganizationAdminAccount(
        params: EnableOrganizationAdminAccountRequest
    ): Request[EnableOrganizationAdminAccountResponse] = js.native
    def getBucketStatistics(params: GetBucketStatisticsRequest): Request[GetBucketStatisticsResponse] = js.native
    def getClassificationExportConfiguration(
        params: GetClassificationExportConfigurationRequest
    ): Request[GetClassificationExportConfigurationResponse] = js.native
    def getCustomDataIdentifier(params: GetCustomDataIdentifierRequest): Request[GetCustomDataIdentifierResponse] =
      js.native
    def getFindingStatistics(params: GetFindingStatisticsRequest): Request[GetFindingStatisticsResponse] = js.native
    def getFindings(params: GetFindingsRequest): Request[GetFindingsResponse] = js.native
    def getFindingsFilter(params: GetFindingsFilterRequest): Request[GetFindingsFilterResponse] = js.native
    def getInvitationsCount(params: GetInvitationsCountRequest): Request[GetInvitationsCountResponse] = js.native
    def getMacieSession(params: GetMacieSessionRequest): Request[GetMacieSessionResponse] = js.native
    def getMasterAccount(params: GetMasterAccountRequest): Request[GetMasterAccountResponse] = js.native
    def getMember(params: GetMemberRequest): Request[GetMemberResponse] = js.native
    def getUsageStatistics(params: GetUsageStatisticsRequest): Request[GetUsageStatisticsResponse] = js.native
    def getUsageTotals(params: GetUsageTotalsRequest): Request[GetUsageTotalsResponse] = js.native
    def listClassificationJobs(params: ListClassificationJobsRequest): Request[ListClassificationJobsResponse] =
      js.native
    def listCustomDataIdentifiers(
        params: ListCustomDataIdentifiersRequest
    ): Request[ListCustomDataIdentifiersResponse] = js.native
    def listFindings(params: ListFindingsRequest): Request[ListFindingsResponse] = js.native
    def listFindingsFilters(params: ListFindingsFiltersRequest): Request[ListFindingsFiltersResponse] = js.native
    def listInvitations(params: ListInvitationsRequest): Request[ListInvitationsResponse] = js.native
    def listMembers(params: ListMembersRequest): Request[ListMembersResponse] = js.native
    def listOrganizationAdminAccounts(
        params: ListOrganizationAdminAccountsRequest
    ): Request[ListOrganizationAdminAccountsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putClassificationExportConfiguration(
        params: PutClassificationExportConfigurationRequest
    ): Request[PutClassificationExportConfigurationResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def testCustomDataIdentifier(params: TestCustomDataIdentifierRequest): Request[TestCustomDataIdentifierResponse] =
      js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateClassificationJob(params: UpdateClassificationJobRequest): Request[UpdateClassificationJobResponse] =
      js.native
    def updateFindingsFilter(params: UpdateFindingsFilterRequest): Request[UpdateFindingsFilterResponse] = js.native
    def updateMacieSession(params: UpdateMacieSessionRequest): Request[UpdateMacieSessionResponse] = js.native
    def updateMemberSession(params: UpdateMemberSessionRequest): Request[UpdateMemberSessionResponse] = js.native
    def updateOrganizationConfiguration(
        params: UpdateOrganizationConfigurationRequest
    ): Request[UpdateOrganizationConfigurationResponse] = js.native
  }

  @js.native
  trait AcceptInvitationRequest extends js.Object {
    var invitationId: __string
    var masterAccount: __string
  }

  object AcceptInvitationRequest {
    @inline
    def apply(
        invitationId: __string,
        masterAccount: __string
    ): AcceptInvitationRequest = {
      val __obj = js.Dynamic.literal(
        "invitationId" -> invitationId.asInstanceOf[js.Any],
        "masterAccount" -> masterAccount.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AcceptInvitationRequest]
    }
  }

  @js.native
  trait AcceptInvitationResponse extends js.Object {}

  object AcceptInvitationResponse {
    @inline
    def apply(
    ): AcceptInvitationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AcceptInvitationResponse]
    }
  }

  /**
    * Provides information about the permissions settings of the bucket-level access control list (ACL) for an S3 bucket.
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

  /**
    * Specifies details for an account to associate with an Amazon Macie master account.
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

  /**
    * Provides information about account-level permissions settings that apply to an S3 bucket.
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

  /**
    * Provides information about an account that's designated as a delegated administrator of Amazon Macie for an AWS organization.
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

  /**
    * The current status of an account as a delegated administrator of Amazon Macie for an AWS organization.
    */
  @js.native
  sealed trait AdminStatus extends js.Any
  object AdminStatus extends js.Object {
    val ENABLED = "ENABLED".asInstanceOf[AdminStatus]
    val DISABLING_IN_PROGRESS = "DISABLING_IN_PROGRESS".asInstanceOf[AdminStatus]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLING_IN_PROGRESS))
  }

  /**
    * Reserved for future use.
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

  /**
    * Reserved for future use.
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

  /**
    * Reserved for future use.
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

  /**
    * Reserved for future use.
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

  /**
    * Provides information about a custom data identifier.
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

  /**
    * Provides information about the block public access settings for an S3 bucket. These settings can apply to a bucket at the account level or bucket level. For detailed information about each setting, see [[https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html|Using Amazon S3 block public access]] in the <i>Amazon Simple Storage Service Developer Guide</i>.
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

  /**
    * The total number of buckets that are publicly accessible, based on a combination of permissions settings for each bucket.
    */
  @js.native
  trait BucketCountByEffectivePermission extends js.Object {
    var publiclyAccessible: js.UndefOr[__long]
    var publiclyReadable: js.UndefOr[__long]
    var publiclyWritable: js.UndefOr[__long]
  }

  object BucketCountByEffectivePermission {
    @inline
    def apply(
        publiclyAccessible: js.UndefOr[__long] = js.undefined,
        publiclyReadable: js.UndefOr[__long] = js.undefined,
        publiclyWritable: js.UndefOr[__long] = js.undefined
    ): BucketCountByEffectivePermission = {
      val __obj = js.Dynamic.literal()
      publiclyAccessible.foreach(__v => __obj.updateDynamic("publiclyAccessible")(__v.asInstanceOf[js.Any]))
      publiclyReadable.foreach(__v => __obj.updateDynamic("publiclyReadable")(__v.asInstanceOf[js.Any]))
      publiclyWritable.foreach(__v => __obj.updateDynamic("publiclyWritable")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketCountByEffectivePermission]
    }
  }

  /**
    * The total number of buckets, grouped by server-side encryption type. This object also reports the total number of buckets that aren't encrypted.
    */
  @js.native
  trait BucketCountByEncryptionType extends js.Object {
    var kmsManaged: js.UndefOr[__long]
    var s3Managed: js.UndefOr[__long]
    var unencrypted: js.UndefOr[__long]
  }

  object BucketCountByEncryptionType {
    @inline
    def apply(
        kmsManaged: js.UndefOr[__long] = js.undefined,
        s3Managed: js.UndefOr[__long] = js.undefined,
        unencrypted: js.UndefOr[__long] = js.undefined
    ): BucketCountByEncryptionType = {
      val __obj = js.Dynamic.literal()
      kmsManaged.foreach(__v => __obj.updateDynamic("kmsManaged")(__v.asInstanceOf[js.Any]))
      s3Managed.foreach(__v => __obj.updateDynamic("s3Managed")(__v.asInstanceOf[js.Any]))
      unencrypted.foreach(__v => __obj.updateDynamic("unencrypted")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketCountByEncryptionType]
    }
  }

  /**
    * The total number of buckets that are shared with another AWS account or configured to support cross-origin resource sharing (CORS).
    */
  @js.native
  trait BucketCountBySharedAccessType extends js.Object {
    var external: js.UndefOr[__long]
    var internal: js.UndefOr[__long]
    var notShared: js.UndefOr[__long]
  }

  object BucketCountBySharedAccessType {
    @inline
    def apply(
        external: js.UndefOr[__long] = js.undefined,
        internal: js.UndefOr[__long] = js.undefined,
        notShared: js.UndefOr[__long] = js.undefined
    ): BucketCountBySharedAccessType = {
      val __obj = js.Dynamic.literal()
      external.foreach(__v => __obj.updateDynamic("external")(__v.asInstanceOf[js.Any]))
      internal.foreach(__v => __obj.updateDynamic("internal")(__v.asInstanceOf[js.Any]))
      notShared.foreach(__v => __obj.updateDynamic("notShared")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketCountBySharedAccessType]
    }
  }

  /**
    * Specifies the operator to use in an attribute-based condition that filters the results of a query for information about S3 buckets.
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

  /**
    * Provides information about bucket-level permissions settings for an S3 bucket.
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

  /**
    * Provides information about an S3 bucket that Amazon Macie monitors and analyzes.
    */
  @js.native
  trait BucketMetadata extends js.Object {
    var accountId: js.UndefOr[__string]
    var bucketArn: js.UndefOr[__string]
    var bucketCreatedAt: js.UndefOr[__timestampIso8601]
    var bucketName: js.UndefOr[__string]
    var classifiableObjectCount: js.UndefOr[__long]
    var lastUpdated: js.UndefOr[__timestampIso8601]
    var objectCount: js.UndefOr[__long]
    var objectCountByEncryptionType: js.UndefOr[ObjectCountByEncryptionType]
    var publicAccess: js.UndefOr[BucketPublicAccess]
    var region: js.UndefOr[__string]
    var replicationDetails: js.UndefOr[ReplicationDetails]
    var sharedAccess: js.UndefOr[SharedAccess]
    var sizeInBytes: js.UndefOr[__long]
    var sizeInBytesCompressed: js.UndefOr[__long]
    var tags: js.UndefOr[__listOfKeyValuePair]
    var versioning: js.UndefOr[__boolean]
  }

  object BucketMetadata {
    @inline
    def apply(
        accountId: js.UndefOr[__string] = js.undefined,
        bucketArn: js.UndefOr[__string] = js.undefined,
        bucketCreatedAt: js.UndefOr[__timestampIso8601] = js.undefined,
        bucketName: js.UndefOr[__string] = js.undefined,
        classifiableObjectCount: js.UndefOr[__long] = js.undefined,
        lastUpdated: js.UndefOr[__timestampIso8601] = js.undefined,
        objectCount: js.UndefOr[__long] = js.undefined,
        objectCountByEncryptionType: js.UndefOr[ObjectCountByEncryptionType] = js.undefined,
        publicAccess: js.UndefOr[BucketPublicAccess] = js.undefined,
        region: js.UndefOr[__string] = js.undefined,
        replicationDetails: js.UndefOr[ReplicationDetails] = js.undefined,
        sharedAccess: js.UndefOr[SharedAccess] = js.undefined,
        sizeInBytes: js.UndefOr[__long] = js.undefined,
        sizeInBytesCompressed: js.UndefOr[__long] = js.undefined,
        tags: js.UndefOr[__listOfKeyValuePair] = js.undefined,
        versioning: js.UndefOr[__boolean] = js.undefined
    ): BucketMetadata = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      bucketArn.foreach(__v => __obj.updateDynamic("bucketArn")(__v.asInstanceOf[js.Any]))
      bucketCreatedAt.foreach(__v => __obj.updateDynamic("bucketCreatedAt")(__v.asInstanceOf[js.Any]))
      bucketName.foreach(__v => __obj.updateDynamic("bucketName")(__v.asInstanceOf[js.Any]))
      classifiableObjectCount.foreach(__v => __obj.updateDynamic("classifiableObjectCount")(__v.asInstanceOf[js.Any]))
      lastUpdated.foreach(__v => __obj.updateDynamic("lastUpdated")(__v.asInstanceOf[js.Any]))
      objectCount.foreach(__v => __obj.updateDynamic("objectCount")(__v.asInstanceOf[js.Any]))
      objectCountByEncryptionType.foreach(__v =>
        __obj.updateDynamic("objectCountByEncryptionType")(__v.asInstanceOf[js.Any])
      )
      publicAccess.foreach(__v => __obj.updateDynamic("publicAccess")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      replicationDetails.foreach(__v => __obj.updateDynamic("replicationDetails")(__v.asInstanceOf[js.Any]))
      sharedAccess.foreach(__v => __obj.updateDynamic("sharedAccess")(__v.asInstanceOf[js.Any]))
      sizeInBytes.foreach(__v => __obj.updateDynamic("sizeInBytes")(__v.asInstanceOf[js.Any]))
      sizeInBytesCompressed.foreach(__v => __obj.updateDynamic("sizeInBytesCompressed")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      versioning.foreach(__v => __obj.updateDynamic("versioning")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BucketMetadata]
    }
  }

  /**
    * The account-level and bucket-level permissions settings for an S3 bucket, or the bucket that contains an object.
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

  /**
    * Provides information about the permissions settings of a bucket policy for an S3 bucket.
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

  /**
    * Provides information about permissions settings that determine whether an S3 bucket is publicly accessible.
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

  /**
    * Specifies criteria for sorting the results of a query for information about S3 buckets.
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

  /**
    * Provides information about a sensitive data finding, including the classification job that produced the finding.
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

  /**
    * Specifies where to store data classification results, and the encryption settings to use when storing results in that location. Currently, you can store classification results only in an S3 bucket.
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

  /**
    * Provides detailed information about a sensitive data finding, including the types and number of occurrences of the data that was found.
    */
  @js.native
  trait ClassificationResult extends js.Object {
    var customDataIdentifiers: js.UndefOr[CustomDataIdentifiers]
    var mimeType: js.UndefOr[__string]
    var sensitiveData: js.UndefOr[SensitiveData]
    var sizeClassified: js.UndefOr[__long]
    var status: js.UndefOr[ClassificationResultStatus]
  }

  object ClassificationResult {
    @inline
    def apply(
        customDataIdentifiers: js.UndefOr[CustomDataIdentifiers] = js.undefined,
        mimeType: js.UndefOr[__string] = js.undefined,
        sensitiveData: js.UndefOr[SensitiveData] = js.undefined,
        sizeClassified: js.UndefOr[__long] = js.undefined,
        status: js.UndefOr[ClassificationResultStatus] = js.undefined
    ): ClassificationResult = {
      val __obj = js.Dynamic.literal()
      customDataIdentifiers.foreach(__v => __obj.updateDynamic("customDataIdentifiers")(__v.asInstanceOf[js.Any]))
      mimeType.foreach(__v => __obj.updateDynamic("mimeType")(__v.asInstanceOf[js.Any]))
      sensitiveData.foreach(__v => __obj.updateDynamic("sensitiveData")(__v.asInstanceOf[js.Any]))
      sizeClassified.foreach(__v => __obj.updateDynamic("sizeClassified")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClassificationResult]
    }
  }

  /**
    * Provides information about the status of a sensitive data finding.
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
  trait CreateSampleFindingsResponse extends js.Object {}

  object CreateSampleFindingsResponse {
    @inline
    def apply(
    ): CreateSampleFindingsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateSampleFindingsResponse]
    }
  }

  /**
    * Specifies the operator to use in a property-based condition that filters the results of a query for findings.
    */
  @js.native
  trait CriterionAdditionalProperties extends js.Object {
    var eq: js.UndefOr[__listOf__string]
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
        gt: js.UndefOr[__long] = js.undefined,
        gte: js.UndefOr[__long] = js.undefined,
        lt: js.UndefOr[__long] = js.undefined,
        lte: js.UndefOr[__long] = js.undefined,
        neq: js.UndefOr[__listOf__string] = js.undefined
    ): CriterionAdditionalProperties = {
      val __obj = js.Dynamic.literal()
      eq.foreach(__v => __obj.updateDynamic("eq")(__v.asInstanceOf[js.Any]))
      gt.foreach(__v => __obj.updateDynamic("gt")(__v.asInstanceOf[js.Any]))
      gte.foreach(__v => __obj.updateDynamic("gte")(__v.asInstanceOf[js.Any]))
      lt.foreach(__v => __obj.updateDynamic("lt")(__v.asInstanceOf[js.Any]))
      lte.foreach(__v => __obj.updateDynamic("lte")(__v.asInstanceOf[js.Any]))
      neq.foreach(__v => __obj.updateDynamic("neq")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CriterionAdditionalProperties]
    }
  }

  /**
    * The type of currency that data for a usage metric is reported in. Possible values are:
    */
  @js.native
  sealed trait Currency extends js.Any
  object Currency extends js.Object {
    val USD = "USD".asInstanceOf[Currency]

    val values = js.Object.freeze(js.Array(USD))
  }

  /**
    * Provides information about a custom data identifier.
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

  /**
    * Provides information about the number of occurrences of the data that produced a sensitive data finding, and the custom data identifiers that detected the data for the finding.
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

  /**
    * Provides information about a custom data identifier that produced a sensitive data finding, and the number of occurrences of the data that it detected for the finding.
    */
  @js.native
  trait CustomDetection extends js.Object {
    var arn: js.UndefOr[__string]
    var count: js.UndefOr[__long]
    var name: js.UndefOr[__string]
  }

  object CustomDetection {
    @inline
    def apply(
        arn: js.UndefOr[__string] = js.undefined,
        count: js.UndefOr[__long] = js.undefined,
        name: js.UndefOr[__string] = js.undefined
    ): CustomDetection = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      count.foreach(__v => __obj.updateDynamic("count")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomDetection]
    }
  }

  /**
    * Run the job once a day, every day. If specified, this is an empty object.
    */
  @js.native
  trait DailySchedule extends js.Object {}

  object DailySchedule {
    @inline
    def apply(
    ): DailySchedule = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DailySchedule]
    }
  }

  @js.native
  sealed trait DayOfWeek extends js.Any
  object DayOfWeek extends js.Object {
    val SUNDAY = "SUNDAY".asInstanceOf[DayOfWeek]
    val MONDAY = "MONDAY".asInstanceOf[DayOfWeek]
    val TUESDAY = "TUESDAY".asInstanceOf[DayOfWeek]
    val WEDNESDAY = "WEDNESDAY".asInstanceOf[DayOfWeek]
    val THURSDAY = "THURSDAY".asInstanceOf[DayOfWeek]
    val FRIDAY = "FRIDAY".asInstanceOf[DayOfWeek]
    val SATURDAY = "SATURDAY".asInstanceOf[DayOfWeek]

    val values = js.Object.freeze(js.Array(SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY))
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

  /**
    * Provides information about sensitive data that was detected by managed data identifiers and produced a finding.
    */
  @js.native
  trait DefaultDetection extends js.Object {
    var count: js.UndefOr[__long]
    var `type`: js.UndefOr[__string]
  }

  object DefaultDetection {
    @inline
    def apply(
        count: js.UndefOr[__long] = js.undefined,
        `type`: js.UndefOr[__string] = js.undefined
    ): DefaultDetection = {
      val __obj = js.Dynamic.literal()
      count.foreach(__v => __obj.updateDynamic("count")(__v.asInstanceOf[js.Any]))
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
  trait DeleteCustomDataIdentifierResponse extends js.Object {}

  object DeleteCustomDataIdentifierResponse {
    @inline
    def apply(
    ): DeleteCustomDataIdentifierResponse = {
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
  trait DeleteFindingsFilterResponse extends js.Object {}

  object DeleteFindingsFilterResponse {
    @inline
    def apply(
    ): DeleteFindingsFilterResponse = {
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
  trait DeleteMemberResponse extends js.Object {}

  object DeleteMemberResponse {
    @inline
    def apply(
    ): DeleteMemberResponse = {
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
    var lastRunTime: js.UndefOr[__timestampIso8601]
    var name: js.UndefOr[__string]
    var s3JobDefinition: js.UndefOr[S3JobDefinition]
    var samplingPercentage: js.UndefOr[__integer]
    var scheduleFrequency: js.UndefOr[JobScheduleFrequency]
    var statistics: js.UndefOr[Statistics]
    var tags: js.UndefOr[TagMap]
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
        lastRunTime: js.UndefOr[__timestampIso8601] = js.undefined,
        name: js.UndefOr[__string] = js.undefined,
        s3JobDefinition: js.UndefOr[S3JobDefinition] = js.undefined,
        samplingPercentage: js.UndefOr[__integer] = js.undefined,
        scheduleFrequency: js.UndefOr[JobScheduleFrequency] = js.undefined,
        statistics: js.UndefOr[Statistics] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
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
      lastRunTime.foreach(__v => __obj.updateDynamic("lastRunTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      s3JobDefinition.foreach(__v => __obj.updateDynamic("s3JobDefinition")(__v.asInstanceOf[js.Any]))
      samplingPercentage.foreach(__v => __obj.updateDynamic("samplingPercentage")(__v.asInstanceOf[js.Any]))
      scheduleFrequency.foreach(__v => __obj.updateDynamic("scheduleFrequency")(__v.asInstanceOf[js.Any]))
      statistics.foreach(__v => __obj.updateDynamic("statistics")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClassificationJobResponse]
    }
  }

  @js.native
  trait DescribeOrganizationConfigurationRequest extends js.Object {}

  object DescribeOrganizationConfigurationRequest {
    @inline
    def apply(
    ): DescribeOrganizationConfigurationRequest = {
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
  trait DisableMacieRequest extends js.Object {}

  object DisableMacieRequest {
    @inline
    def apply(
    ): DisableMacieRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisableMacieRequest]
    }
  }

  @js.native
  trait DisableMacieResponse extends js.Object {}

  object DisableMacieResponse {
    @inline
    def apply(
    ): DisableMacieResponse = {
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
  trait DisableOrganizationAdminAccountResponse extends js.Object {}

  object DisableOrganizationAdminAccountResponse {
    @inline
    def apply(
    ): DisableOrganizationAdminAccountResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisableOrganizationAdminAccountResponse]
    }
  }

  @js.native
  trait DisassociateFromMasterAccountRequest extends js.Object {}

  object DisassociateFromMasterAccountRequest {
    @inline
    def apply(
    ): DisassociateFromMasterAccountRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateFromMasterAccountRequest]
    }
  }

  @js.native
  trait DisassociateFromMasterAccountResponse extends js.Object {}

  object DisassociateFromMasterAccountResponse {
    @inline
    def apply(
    ): DisassociateFromMasterAccountResponse = {
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
  trait DisassociateMemberResponse extends js.Object {}

  object DisassociateMemberResponse {
    @inline
    def apply(
    ): DisassociateMemberResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisassociateMemberResponse]
    }
  }

  /**
    * The DNS name of the entity that performed the action on the affected resource.
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
  sealed trait EffectivePermission extends js.Any
  object EffectivePermission extends js.Object {
    val PUBLIC = "PUBLIC".asInstanceOf[EffectivePermission]
    val NOT_PUBLIC = "NOT_PUBLIC".asInstanceOf[EffectivePermission]

    val values = js.Object.freeze(js.Array(PUBLIC, NOT_PUBLIC))
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
      findingPublishingFrequency.foreach(__v =>
        __obj.updateDynamic("findingPublishingFrequency")(__v.asInstanceOf[js.Any])
      )
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableMacieRequest]
    }
  }

  @js.native
  trait EnableMacieResponse extends js.Object {}

  object EnableMacieResponse {
    @inline
    def apply(
    ): EnableMacieResponse = {
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
  trait EnableOrganizationAdminAccountResponse extends js.Object {}

  object EnableOrganizationAdminAccountResponse {
    @inline
    def apply(
    ): EnableOrganizationAdminAccountResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[EnableOrganizationAdminAccountResponse]
    }
  }

  /**
    * The server-side encryption algorithm that's used when storing the S3 bucket or object. Valid values are:
    */
  @js.native
  sealed trait EncryptionType extends js.Any
  object EncryptionType extends js.Object {
    val NONE = "NONE".asInstanceOf[EncryptionType]
    val AES256 = "AES256".asInstanceOf[EncryptionType]
    val `aws:kms` = "aws:kms".asInstanceOf[EncryptionType]
    val UNKNOWN = "UNKNOWN".asInstanceOf[EncryptionType]

    val values = js.Object.freeze(js.Array(NONE, AES256, `aws:kms`, UNKNOWN))
  }

  /**
    * The source of an error, issue, or delay. Possible values are:
    */
  @js.native
  sealed trait ErrorCode extends js.Any
  object ErrorCode extends js.Object {
    val ClientError = "ClientError".asInstanceOf[ErrorCode]
    val InternalError = "InternalError".asInstanceOf[ErrorCode]

    val values = js.Object.freeze(js.Array(ClientError, InternalError))
  }

  /**
    * Reserved for future use.
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

  /**
    * Provides information about a finding.
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

  /**
    * Provides information about an action that occurred for a resource and produced a policy finding.
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

  /**
    * The type of action that occurred for the resource and produced the policy finding.
    */
  @js.native
  sealed trait FindingActionType extends js.Any
  object FindingActionType extends js.Object {
    val AWS_API_CALL = "AWS_API_CALL".asInstanceOf[FindingActionType]

    val values = js.Object.freeze(js.Array(AWS_API_CALL))
  }

  /**
    * Provides information about an entity that performed an action that produced a policy finding for a resource.
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

  /**
    * The category of the finding. Valid values are:
    */
  @js.native
  sealed trait FindingCategory extends js.Any
  object FindingCategory extends js.Object {
    val CLASSIFICATION = "CLASSIFICATION".asInstanceOf[FindingCategory]
    val POLICY = "POLICY".asInstanceOf[FindingCategory]

    val values = js.Object.freeze(js.Array(CLASSIFICATION, POLICY))
  }

  /**
    * Specifies, as a map, one or more property-based conditions that filter the results of a query for findings.
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

  /**
    * The frequency with which Amazon Macie publishes updates to policy findings for an account. This includes publishing updates to AWS Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events). Valid values are:
    */
  @js.native
  sealed trait FindingPublishingFrequency extends js.Any
  object FindingPublishingFrequency extends js.Object {
    val FIFTEEN_MINUTES = "FIFTEEN_MINUTES".asInstanceOf[FindingPublishingFrequency]
    val ONE_HOUR = "ONE_HOUR".asInstanceOf[FindingPublishingFrequency]
    val SIX_HOURS = "SIX_HOURS".asInstanceOf[FindingPublishingFrequency]

    val values = js.Object.freeze(js.Array(FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS))
  }

  /**
    * The grouping to sort the results by. Valid values are:
    */
  @js.native
  sealed trait FindingStatisticsSortAttributeName extends js.Any
  object FindingStatisticsSortAttributeName extends js.Object {
    val groupKey = "groupKey".asInstanceOf[FindingStatisticsSortAttributeName]
    val count = "count".asInstanceOf[FindingStatisticsSortAttributeName]

    val values = js.Object.freeze(js.Array(groupKey, count))
  }

  /**
    * Specifies criteria for sorting the results of a query for information about findings.
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

  /**
    * The type of finding. Valid values are:
    */
  @js.native
  sealed trait FindingType extends js.Any
  object FindingType extends js.Object {
    val `SensitiveData:S3Object/Multiple` = "SensitiveData:S3Object/Multiple".asInstanceOf[FindingType]
    val `SensitiveData:S3Object/Financial` = "SensitiveData:S3Object/Financial".asInstanceOf[FindingType]
    val `SensitiveData:S3Object/Personal` = "SensitiveData:S3Object/Personal".asInstanceOf[FindingType]
    val `SensitiveData:S3Object/Credentials` = "SensitiveData:S3Object/Credentials".asInstanceOf[FindingType]
    val `SensitiveData:S3Object/CustomIdentifier` = "SensitiveData:S3Object/CustomIdentifier".asInstanceOf[FindingType]
    val `Policy:IAMUser/S3BucketPublic` = "Policy:IAMUser/S3BucketPublic".asInstanceOf[FindingType]
    val `Policy:IAMUser/S3BucketSharedExternally` = "Policy:IAMUser/S3BucketSharedExternally".asInstanceOf[FindingType]
    val `Policy:IAMUser/S3BucketReplicatedExternally` =
      "Policy:IAMUser/S3BucketReplicatedExternally".asInstanceOf[FindingType]
    val `Policy:IAMUser/S3BucketEncryptionDisabled` =
      "Policy:IAMUser/S3BucketEncryptionDisabled".asInstanceOf[FindingType]
    val `Policy:IAMUser/S3BlockPublicAccessDisabled` =
      "Policy:IAMUser/S3BlockPublicAccessDisabled".asInstanceOf[FindingType]

    val values = js.Object.freeze(
      js.Array(
        `SensitiveData:S3Object/Multiple`,
        `SensitiveData:S3Object/Financial`,
        `SensitiveData:S3Object/Personal`,
        `SensitiveData:S3Object/Credentials`,
        `SensitiveData:S3Object/CustomIdentifier`,
        `Policy:IAMUser/S3BucketPublic`,
        `Policy:IAMUser/S3BucketSharedExternally`,
        `Policy:IAMUser/S3BucketReplicatedExternally`,
        `Policy:IAMUser/S3BucketEncryptionDisabled`,
        `Policy:IAMUser/S3BlockPublicAccessDisabled`
      )
    )
  }

  /**
    * The action to perform on findings that meet the filter criteria. To suppress (automatically archive) findings that meet the criteria, set this value to ARCHIVE. Valid values are:
    */
  @js.native
  sealed trait FindingsFilterAction extends js.Any
  object FindingsFilterAction extends js.Object {
    val ARCHIVE = "ARCHIVE".asInstanceOf[FindingsFilterAction]
    val NOOP = "NOOP".asInstanceOf[FindingsFilterAction]

    val values = js.Object.freeze(js.Array(ARCHIVE, NOOP))
  }

  /**
    * Provides information about a findings filter.
    */
  @js.native
  trait FindingsFilterListItem extends js.Object {
    var arn: js.UndefOr[__string]
    var id: js.UndefOr[__string]
    var name: js.UndefOr[__string]
    var tags: js.UndefOr[TagMap]
  }

  object FindingsFilterListItem {
    @inline
    def apply(
        arn: js.UndefOr[__string] = js.undefined,
        id: js.UndefOr[__string] = js.undefined,
        name: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): FindingsFilterListItem = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingsFilterListItem]
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
    var bucketCountBySharedAccessType: js.UndefOr[BucketCountBySharedAccessType]
    var classifiableObjectCount: js.UndefOr[__long]
    var lastUpdated: js.UndefOr[__timestampIso8601]
    var objectCount: js.UndefOr[__long]
    var sizeInBytes: js.UndefOr[__long]
    var sizeInBytesCompressed: js.UndefOr[__long]
  }

  object GetBucketStatisticsResponse {
    @inline
    def apply(
        bucketCount: js.UndefOr[__long] = js.undefined,
        bucketCountByEffectivePermission: js.UndefOr[BucketCountByEffectivePermission] = js.undefined,
        bucketCountByEncryptionType: js.UndefOr[BucketCountByEncryptionType] = js.undefined,
        bucketCountBySharedAccessType: js.UndefOr[BucketCountBySharedAccessType] = js.undefined,
        classifiableObjectCount: js.UndefOr[__long] = js.undefined,
        lastUpdated: js.UndefOr[__timestampIso8601] = js.undefined,
        objectCount: js.UndefOr[__long] = js.undefined,
        sizeInBytes: js.UndefOr[__long] = js.undefined,
        sizeInBytesCompressed: js.UndefOr[__long] = js.undefined
    ): GetBucketStatisticsResponse = {
      val __obj = js.Dynamic.literal()
      bucketCount.foreach(__v => __obj.updateDynamic("bucketCount")(__v.asInstanceOf[js.Any]))
      bucketCountByEffectivePermission.foreach(__v =>
        __obj.updateDynamic("bucketCountByEffectivePermission")(__v.asInstanceOf[js.Any])
      )
      bucketCountByEncryptionType.foreach(__v =>
        __obj.updateDynamic("bucketCountByEncryptionType")(__v.asInstanceOf[js.Any])
      )
      bucketCountBySharedAccessType.foreach(__v =>
        __obj.updateDynamic("bucketCountBySharedAccessType")(__v.asInstanceOf[js.Any])
      )
      classifiableObjectCount.foreach(__v => __obj.updateDynamic("classifiableObjectCount")(__v.asInstanceOf[js.Any]))
      lastUpdated.foreach(__v => __obj.updateDynamic("lastUpdated")(__v.asInstanceOf[js.Any]))
      objectCount.foreach(__v => __obj.updateDynamic("objectCount")(__v.asInstanceOf[js.Any]))
      sizeInBytes.foreach(__v => __obj.updateDynamic("sizeInBytes")(__v.asInstanceOf[js.Any]))
      sizeInBytesCompressed.foreach(__v => __obj.updateDynamic("sizeInBytesCompressed")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBucketStatisticsResponse]
    }
  }

  @js.native
  trait GetClassificationExportConfigurationRequest extends js.Object {}

  object GetClassificationExportConfigurationRequest {
    @inline
    def apply(
    ): GetClassificationExportConfigurationRequest = {
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
  trait GetInvitationsCountRequest extends js.Object {}

  object GetInvitationsCountRequest {
    @inline
    def apply(
    ): GetInvitationsCountRequest = {
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
  trait GetMacieSessionRequest extends js.Object {}

  object GetMacieSessionRequest {
    @inline
    def apply(
    ): GetMacieSessionRequest = {
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
      findingPublishingFrequency.foreach(__v =>
        __obj.updateDynamic("findingPublishingFrequency")(__v.asInstanceOf[js.Any])
      )
      serviceRole.foreach(__v => __obj.updateDynamic("serviceRole")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMacieSessionResponse]
    }
  }

  @js.native
  trait GetMasterAccountRequest extends js.Object {}

  object GetMasterAccountRequest {
    @inline
    def apply(
    ): GetMasterAccountRequest = {
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
  }

  object GetUsageStatisticsRequest {
    @inline
    def apply(
        filterBy: js.UndefOr[__listOfUsageStatisticsFilter] = js.undefined,
        maxResults: js.UndefOr[__integer] = js.undefined,
        nextToken: js.UndefOr[__string] = js.undefined,
        sortBy: js.UndefOr[UsageStatisticsSortBy] = js.undefined
    ): GetUsageStatisticsRequest = {
      val __obj = js.Dynamic.literal()
      filterBy.foreach(__v => __obj.updateDynamic("filterBy")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUsageStatisticsRequest]
    }
  }

  @js.native
  trait GetUsageStatisticsResponse extends js.Object {
    var nextToken: js.UndefOr[__string]
    var records: js.UndefOr[__listOfUsageRecord]
  }

  object GetUsageStatisticsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[__string] = js.undefined,
        records: js.UndefOr[__listOfUsageRecord] = js.undefined
    ): GetUsageStatisticsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      records.foreach(__v => __obj.updateDynamic("records")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUsageStatisticsResponse]
    }
  }

  @js.native
  trait GetUsageTotalsRequest extends js.Object {}

  object GetUsageTotalsRequest {
    @inline
    def apply(
    ): GetUsageTotalsRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GetUsageTotalsRequest]
    }
  }

  @js.native
  trait GetUsageTotalsResponse extends js.Object {
    var usageTotals: js.UndefOr[__listOfUsageTotal]
  }

  object GetUsageTotalsResponse {
    @inline
    def apply(
        usageTotals: js.UndefOr[__listOfUsageTotal] = js.undefined
    ): GetUsageTotalsResponse = {
      val __obj = js.Dynamic.literal()
      usageTotals.foreach(__v => __obj.updateDynamic("usageTotals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUsageTotalsResponse]
    }
  }

  @js.native
  sealed trait GroupBy extends js.Any
  object GroupBy extends js.Object {
    val `resourcesAffected.s3Bucket.name` = "resourcesAffected.s3Bucket.name".asInstanceOf[GroupBy]
    val `type` = "type".asInstanceOf[GroupBy]
    val `classificationDetails.jobId` = "classificationDetails.jobId".asInstanceOf[GroupBy]
    val `severity.description` = "severity.description".asInstanceOf[GroupBy]

    val values = js.Object.freeze(
      js.Array(`resourcesAffected.s3Bucket.name`, `type`, `classificationDetails.jobId`, `severity.description`)
    )
  }

  /**
    * Provides a group of results for a query that retrieved information about findings.
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

  /**
    * Reserved for future use.
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

  /**
    * Provides information about an Amazon Macie membership invitation that was received by an account.
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

  /**
    * The IP address of the device that the entity used to perform the action on the affected resource. This object also provides information such as the owner and geographical location for the IP address.
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

  /**
    * Reserved for future use.
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

  /**
    * Reserved for future use.
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

  /**
    * Reserved for future use.
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

  /**
    * Reserved for future use.
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

  /**
    * The operator to use in a condition. Valid values are:
    */
  @js.native
  sealed trait JobComparator extends js.Any
  object JobComparator extends js.Object {
    val EQ = "EQ".asInstanceOf[JobComparator]
    val GT = "GT".asInstanceOf[JobComparator]
    val GTE = "GTE".asInstanceOf[JobComparator]
    val LT = "LT".asInstanceOf[JobComparator]
    val LTE = "LTE".asInstanceOf[JobComparator]
    val NE = "NE".asInstanceOf[JobComparator]
    val CONTAINS = "CONTAINS".asInstanceOf[JobComparator]

    val values = js.Object.freeze(js.Array(EQ, GT, GTE, LT, LTE, NE, CONTAINS))
  }

  /**
    * Specifies the recurrence pattern for running a classification job.
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

  /**
    * Specifies one or more conditions that determine which objects a classification job analyzes.
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

  /**
    * Reserved for future use.
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

  /**
    * The current status of a classification job. Valid values are:
    */
  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus extends js.Object {
    val RUNNING = "RUNNING".asInstanceOf[JobStatus]
    val PAUSED = "PAUSED".asInstanceOf[JobStatus]
    val CANCELLED = "CANCELLED".asInstanceOf[JobStatus]
    val COMPLETE = "COMPLETE".asInstanceOf[JobStatus]
    val IDLE = "IDLE".asInstanceOf[JobStatus]

    val values = js.Object.freeze(js.Array(RUNNING, PAUSED, CANCELLED, COMPLETE, IDLE))
  }

  /**
    * Provides information about a classification job, including the current status of the job.
    */
  @js.native
  trait JobSummary extends js.Object {
    var bucketDefinitions: js.UndefOr[__listOfS3BucketDefinitionForJob]
    var createdAt: js.UndefOr[__timestampIso8601]
    var jobId: js.UndefOr[__string]
    var jobStatus: js.UndefOr[JobStatus]
    var jobType: js.UndefOr[JobType]
    var name: js.UndefOr[__string]
  }

  object JobSummary {
    @inline
    def apply(
        bucketDefinitions: js.UndefOr[__listOfS3BucketDefinitionForJob] = js.undefined,
        createdAt: js.UndefOr[__timestampIso8601] = js.undefined,
        jobId: js.UndefOr[__string] = js.undefined,
        jobStatus: js.UndefOr[JobStatus] = js.undefined,
        jobType: js.UndefOr[JobType] = js.undefined,
        name: js.UndefOr[__string] = js.undefined
    ): JobSummary = {
      val __obj = js.Dynamic.literal()
      bucketDefinitions.foreach(__v => __obj.updateDynamic("bucketDefinitions")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      jobStatus.foreach(__v => __obj.updateDynamic("jobStatus")(__v.asInstanceOf[js.Any]))
      jobType.foreach(__v => __obj.updateDynamic("jobType")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobSummary]
    }
  }

  /**
    * The schedule for running a classification job. Valid values are:
    */
  @js.native
  sealed trait JobType extends js.Any
  object JobType extends js.Object {
    val ONE_TIME = "ONE_TIME".asInstanceOf[JobType]
    val SCHEDULED = "SCHEDULED".asInstanceOf[JobType]

    val values = js.Object.freeze(js.Array(ONE_TIME, SCHEDULED))
  }

  /**
    * Provides information about the tags that are associated with an S3 bucket or object. Each tag consists of a required tag key and an associated tag value.
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

  /**
    * Specifies criteria for filtering the results of a request for information about classification jobs.
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

  /**
    * The property to use to filter the results. Valid values are:
    */
  @js.native
  sealed trait ListJobsFilterKey extends js.Any
  object ListJobsFilterKey extends js.Object {
    val jobType = "jobType".asInstanceOf[ListJobsFilterKey]
    val jobStatus = "jobStatus".asInstanceOf[ListJobsFilterKey]
    val createdAt = "createdAt".asInstanceOf[ListJobsFilterKey]
    val name = "name".asInstanceOf[ListJobsFilterKey]

    val values = js.Object.freeze(js.Array(jobType, jobStatus, createdAt, name))
  }

  /**
    * Specifies a condition that filters the results of a request for information about classification jobs. Each condition consists of a property, an operator, and one or more values.
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

  /**
    * The property to sort the results by. Valid values are:
    */
  @js.native
  sealed trait ListJobsSortAttributeName extends js.Any
  object ListJobsSortAttributeName extends js.Object {
    val createdAt = "createdAt".asInstanceOf[ListJobsSortAttributeName]
    val jobStatus = "jobStatus".asInstanceOf[ListJobsSortAttributeName]
    val name = "name".asInstanceOf[ListJobsSortAttributeName]
    val jobType = "jobType".asInstanceOf[ListJobsSortAttributeName]

    val values = js.Object.freeze(js.Array(createdAt, jobStatus, name, jobType))
  }

  /**
    * Specifies criteria for sorting the results of a request for information about classification jobs.
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

  /**
    * The status of an Amazon Macie account. Valid values are:
    */
  @js.native
  sealed trait MacieStatus extends js.Any
  object MacieStatus extends js.Object {
    val PAUSED = "PAUSED".asInstanceOf[MacieStatus]
    val ENABLED = "ENABLED".asInstanceOf[MacieStatus]

    val values = js.Object.freeze(js.Array(PAUSED, ENABLED))
  }

  /**
    * Provides information about an account that's associated with an Amazon Macie master account.
    */
  @js.native
  trait Member extends js.Object {
    var accountId: js.UndefOr[__string]
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

  /**
    * Run the job once a month, on a specific day of the month. This value can be an integer from 1 through 30.
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

  /**
    * The total number of objects that are in the bucket, grouped by server-side encryption type. This includes a grouping that reports the total number of objects that aren't encrypted.
    */
  @js.native
  trait ObjectCountByEncryptionType extends js.Object {
    var customerManaged: js.UndefOr[__long]
    var kmsManaged: js.UndefOr[__long]
    var s3Managed: js.UndefOr[__long]
    var unencrypted: js.UndefOr[__long]
  }

  object ObjectCountByEncryptionType {
    @inline
    def apply(
        customerManaged: js.UndefOr[__long] = js.undefined,
        kmsManaged: js.UndefOr[__long] = js.undefined,
        s3Managed: js.UndefOr[__long] = js.undefined,
        unencrypted: js.UndefOr[__long] = js.undefined
    ): ObjectCountByEncryptionType = {
      val __obj = js.Dynamic.literal()
      customerManaged.foreach(__v => __obj.updateDynamic("customerManaged")(__v.asInstanceOf[js.Any]))
      kmsManaged.foreach(__v => __obj.updateDynamic("kmsManaged")(__v.asInstanceOf[js.Any]))
      s3Managed.foreach(__v => __obj.updateDynamic("s3Managed")(__v.asInstanceOf[js.Any]))
      unencrypted.foreach(__v => __obj.updateDynamic("unencrypted")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ObjectCountByEncryptionType]
    }
  }

  @js.native
  sealed trait OrderBy extends js.Any
  object OrderBy extends js.Object {
    val ASC = "ASC".asInstanceOf[OrderBy]
    val DESC = "DESC".asInstanceOf[OrderBy]

    val values = js.Object.freeze(js.Array(ASC, DESC))
  }

  /**
    * Provides detailed information about a policy finding.
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

  /**
    * The current status of the relationship between an account and an associated Amazon Macie master account (<i>inviter account</i>). Possible values are:
    */
  @js.native
  sealed trait RelationshipStatus extends js.Any
  object RelationshipStatus extends js.Object {
    val Enabled = "Enabled".asInstanceOf[RelationshipStatus]
    val Paused = "Paused".asInstanceOf[RelationshipStatus]
    val Invited = "Invited".asInstanceOf[RelationshipStatus]
    val Created = "Created".asInstanceOf[RelationshipStatus]
    val Removed = "Removed".asInstanceOf[RelationshipStatus]
    val Resigned = "Resigned".asInstanceOf[RelationshipStatus]
    val EmailVerificationInProgress = "EmailVerificationInProgress".asInstanceOf[RelationshipStatus]
    val EmailVerificationFailed = "EmailVerificationFailed".asInstanceOf[RelationshipStatus]

    val values = js.Object.freeze(
      js.Array(
        Enabled,
        Paused,
        Invited,
        Created,
        Removed,
        Resigned,
        EmailVerificationInProgress,
        EmailVerificationFailed
      )
    )
  }

  /**
    * Provides information about settings that define whether one or more objects in an S3 bucket are replicated to S3 buckets for other AWS accounts and, if so, which accounts.
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

  /**
    * Provides information about the resources that a finding applies to.
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

  /**
    * Provides information about an S3 bucket that a finding applies to.
    */
  @js.native
  trait S3Bucket extends js.Object {
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
        arn: js.UndefOr[__string] = js.undefined,
        createdAt: js.UndefOr[__timestampIso8601] = js.undefined,
        defaultServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined,
        name: js.UndefOr[__string] = js.undefined,
        owner: js.UndefOr[S3BucketOwner] = js.undefined,
        publicAccess: js.UndefOr[BucketPublicAccess] = js.undefined,
        tags: js.UndefOr[KeyValuePairList] = js.undefined
    ): S3Bucket = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      defaultServerSideEncryption.foreach(__v =>
        __obj.updateDynamic("defaultServerSideEncryption")(__v.asInstanceOf[js.Any])
      )
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      owner.foreach(__v => __obj.updateDynamic("owner")(__v.asInstanceOf[js.Any]))
      publicAccess.foreach(__v => __obj.updateDynamic("publicAccess")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Bucket]
    }
  }

  /**
    * Specifies which S3 buckets contain the objects that a classification job analyzes.
    */
  @js.native
  trait S3BucketDefinitionForJob extends js.Object {
    var accountId: js.UndefOr[__string]
    var buckets: js.UndefOr[__listOf__string]
  }

  object S3BucketDefinitionForJob {
    @inline
    def apply(
        accountId: js.UndefOr[__string] = js.undefined,
        buckets: js.UndefOr[__listOf__string] = js.undefined
    ): S3BucketDefinitionForJob = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      buckets.foreach(__v => __obj.updateDynamic("buckets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3BucketDefinitionForJob]
    }
  }

  /**
    * Provides information about the user who owns an S3 bucket.
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

  /**
    * Specifies an S3 bucket to store data classification results in, and the encryption settings to use when storing results in that bucket.
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

  /**
    * Specifies which S3 buckets contain the objects that a classification job analyzes, and the scope of that analysis.
    */
  @js.native
  trait S3JobDefinition extends js.Object {
    var bucketDefinitions: js.UndefOr[__listOfS3BucketDefinitionForJob]
    var scoping: js.UndefOr[Scoping]
  }

  object S3JobDefinition {
    @inline
    def apply(
        bucketDefinitions: js.UndefOr[__listOfS3BucketDefinitionForJob] = js.undefined,
        scoping: js.UndefOr[Scoping] = js.undefined
    ): S3JobDefinition = {
      val __obj = js.Dynamic.literal()
      bucketDefinitions.foreach(__v => __obj.updateDynamic("bucketDefinitions")(__v.asInstanceOf[js.Any]))
      scoping.foreach(__v => __obj.updateDynamic("scoping")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3JobDefinition]
    }
  }

  /**
    * Provides information about an S3 object that a finding applies to.
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

  /**
    * The property to use in a condition that determines which objects are analyzed by a classification job. Valid values are:
    */
  @js.native
  sealed trait ScopeFilterKey extends js.Any
  object ScopeFilterKey extends js.Object {
    val BUCKET_CREATION_DATE = "BUCKET_CREATION_DATE".asInstanceOf[ScopeFilterKey]
    val OBJECT_EXTENSION = "OBJECT_EXTENSION".asInstanceOf[ScopeFilterKey]
    val OBJECT_LAST_MODIFIED_DATE = "OBJECT_LAST_MODIFIED_DATE".asInstanceOf[ScopeFilterKey]
    val OBJECT_SIZE = "OBJECT_SIZE".asInstanceOf[ScopeFilterKey]
    val TAG = "TAG".asInstanceOf[ScopeFilterKey]

    val values =
      js.Object.freeze(js.Array(BUCKET_CREATION_DATE, OBJECT_EXTENSION, OBJECT_LAST_MODIFIED_DATE, OBJECT_SIZE, TAG))
  }

  /**
    * An object that specifies conditions for including or excluding objects from the job.
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

  /**
    * Provides information about the category, type, and number of occurrences of sensitive data that produced a finding.
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

  /**
    * The category of sensitive data that was detected and produced the finding.
    */
  @js.native
  sealed trait SensitiveDataItemCategory extends js.Any
  object SensitiveDataItemCategory extends js.Object {
    val FINANCIAL_INFORMATION = "FINANCIAL_INFORMATION".asInstanceOf[SensitiveDataItemCategory]
    val PERSONAL_INFORMATION = "PERSONAL_INFORMATION".asInstanceOf[SensitiveDataItemCategory]
    val CREDENTIALS = "CREDENTIALS".asInstanceOf[SensitiveDataItemCategory]
    val CUSTOM_IDENTIFIER = "CUSTOM_IDENTIFIER".asInstanceOf[SensitiveDataItemCategory]

    val values = js.Object.freeze(js.Array(FINANCIAL_INFORMATION, PERSONAL_INFORMATION, CREDENTIALS, CUSTOM_IDENTIFIER))
  }

  /**
    * Provides information about the server-side encryption settings for an S3 bucket or object.
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

  /**
    * Specifies a current quota for an account.
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

  /**
    * Provides information about a session that was created for an entity that performed an action by using temporary security credentials.
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

  /**
    * Provides information about the context in which temporary security credentials were issued to an entity.
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

  /**
    * Provides information about the source and type of temporary security credentials that were issued to an entity.
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

  /**
    * Provides the numeric score and textual representation of a severity value.
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

  /**
    * The textual representation of the finding's severity. Valid values are:
    */
  @js.native
  sealed trait SeverityDescription extends js.Any
  object SeverityDescription extends js.Object {
    val Low = "Low".asInstanceOf[SeverityDescription]
    val Medium = "Medium".asInstanceOf[SeverityDescription]
    val High = "High".asInstanceOf[SeverityDescription]

    val values = js.Object.freeze(js.Array(Low, Medium, High))
  }

  @js.native
  sealed trait SharedAccess extends js.Any
  object SharedAccess extends js.Object {
    val EXTERNAL = "EXTERNAL".asInstanceOf[SharedAccess]
    val INTERNAL = "INTERNAL".asInstanceOf[SharedAccess]
    val NOT_SHARED = "NOT_SHARED".asInstanceOf[SharedAccess]

    val values = js.Object.freeze(js.Array(EXTERNAL, INTERNAL, NOT_SHARED))
  }

  /**
    * Specifies a property-based condition that determines whether an object is included or excluded from a classification job.
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

  /**
    * Specifies criteria for sorting the results of a request for information about findings.
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

  /**
    * Provides processing statistics for a classification job.
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
      approximateNumberOfObjectsToProcess.foreach(__v =>
        __obj.updateDynamic("approximateNumberOfObjectsToProcess")(__v.asInstanceOf[js.Any])
      )
      numberOfRuns.foreach(__v => __obj.updateDynamic("numberOfRuns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Statistics]
    }
  }

  /**
    * The storage class of the S3 bucket or object. Valid values are:
    */
  @js.native
  sealed trait StorageClass extends js.Any
  object StorageClass extends js.Object {
    val STANDARD = "STANDARD".asInstanceOf[StorageClass]
    val REDUCED_REDUNDANCY = "REDUCED_REDUNDANCY".asInstanceOf[StorageClass]
    val STANDARD_IA = "STANDARD_IA".asInstanceOf[StorageClass]
    val INTELLIGENT_TIERING = "INTELLIGENT_TIERING".asInstanceOf[StorageClass]
    val DEEP_ARCHIVE = "DEEP_ARCHIVE".asInstanceOf[StorageClass]
    val ONEZONE_IA = "ONEZONE_IA".asInstanceOf[StorageClass]
    val GLACIER = "GLACIER".asInstanceOf[StorageClass]

    val values = js.Object.freeze(
      js.Array(STANDARD, REDUCED_REDUNDANCY, STANDARD_IA, INTELLIGENT_TIERING, DEEP_ARCHIVE, ONEZONE_IA, GLACIER)
    )
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
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /**
    * Specifies a tag-based condition that determines whether an object is included or excluded from a classification job.
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

  /**
    * The type of object to apply a tag-based condition to. Valid values are:
    */
  @js.native
  sealed trait TagTarget extends js.Any
  object TagTarget extends js.Object {
    val S3_OBJECT = "S3_OBJECT".asInstanceOf[TagTarget]

    val values = js.Object.freeze(js.Array(S3_OBJECT))
  }

  /**
    * Specifies a tag key and value, as a pair, to use in a tag-based condition for a classification job.
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

  @js.native
  sealed trait Unit extends js.Any
  object Unit extends js.Object {
    val TERABYTES = "TERABYTES".asInstanceOf[Unit]

    val values = js.Object.freeze(js.Array(TERABYTES))
  }

  /**
    *  Provides information about an account-related request that hasn't been processed.
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
  trait UpdateClassificationJobResponse extends js.Object {}

  object UpdateClassificationJobResponse {
    @inline
    def apply(
    ): UpdateClassificationJobResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateClassificationJobResponse]
    }
  }

  @js.native
  trait UpdateFindingsFilterRequest extends js.Object {
    var id: __string
    var action: js.UndefOr[FindingsFilterAction]
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
        description: js.UndefOr[__string] = js.undefined,
        findingCriteria: js.UndefOr[FindingCriteria] = js.undefined,
        name: js.UndefOr[__string] = js.undefined,
        position: js.UndefOr[__integer] = js.undefined
    ): UpdateFindingsFilterRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      action.foreach(__v => __obj.updateDynamic("action")(__v.asInstanceOf[js.Any]))
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
      findingPublishingFrequency.foreach(__v =>
        __obj.updateDynamic("findingPublishingFrequency")(__v.asInstanceOf[js.Any])
      )
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMacieSessionRequest]
    }
  }

  @js.native
  trait UpdateMacieSessionResponse extends js.Object {}

  object UpdateMacieSessionResponse {
    @inline
    def apply(
    ): UpdateMacieSessionResponse = {
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
  trait UpdateMemberSessionResponse extends js.Object {}

  object UpdateMemberSessionResponse {
    @inline
    def apply(
    ): UpdateMemberSessionResponse = {
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
  trait UpdateOrganizationConfigurationResponse extends js.Object {}

  object UpdateOrganizationConfigurationResponse {
    @inline
    def apply(
    ): UpdateOrganizationConfigurationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateOrganizationConfigurationResponse]
    }
  }

  /**
    * Provides data for a specific usage metric and the corresponding quota for an account. The value for the metric is an aggregated value that reports usage during the past 30 days.
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

  /**
    * Provides quota and aggregated usage data for an account.
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

  /**
    * Specifies criteria for filtering the results of a query for account quotas and usage data.
    */
  @js.native
  trait UsageStatisticsFilter extends js.Object {
    var key: js.UndefOr[UsageStatisticsFilterKey]
    var values: js.UndefOr[__listOf__string]
  }

  object UsageStatisticsFilter {
    @inline
    def apply(
        key: js.UndefOr[UsageStatisticsFilterKey] = js.undefined,
        values: js.UndefOr[__listOf__string] = js.undefined
    ): UsageStatisticsFilter = {
      val __obj = js.Dynamic.literal()
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageStatisticsFilter]
    }
  }

  /**
    * The field to use to filter the results of a query for account quotas and usage data.
    */
  @js.native
  sealed trait UsageStatisticsFilterKey extends js.Any
  object UsageStatisticsFilterKey extends js.Object {
    val accountId = "accountId".asInstanceOf[UsageStatisticsFilterKey]

    val values = js.Object.freeze(js.Array(accountId))
  }

  /**
    * Specifies criteria for sorting the results of a query for account quotas and usage data.
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

  /**
    * The field to use to sort the results of a query for account quotas and usage data.
    */
  @js.native
  sealed trait UsageStatisticsSortKey extends js.Any
  object UsageStatisticsSortKey extends js.Object {
    val accountId = "accountId".asInstanceOf[UsageStatisticsSortKey]
    val total = "total".asInstanceOf[UsageStatisticsSortKey]

    val values = js.Object.freeze(js.Array(accountId, total))
  }

  /**
    * Provides aggregated data for a usage metric. The value for the metric reports usage data for an account during the past 30 days.
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

  /**
    * The name of a usage metric for an account. Possible values are:
    */
  @js.native
  sealed trait UsageType extends js.Any
  object UsageType extends js.Object {
    val DATA_INVENTORY_EVALUATION = "DATA_INVENTORY_EVALUATION".asInstanceOf[UsageType]
    val SENSITIVE_DATA_DISCOVERY = "SENSITIVE_DATA_DISCOVERY".asInstanceOf[UsageType]

    val values = js.Object.freeze(js.Array(DATA_INVENTORY_EVALUATION, SENSITIVE_DATA_DISCOVERY))
  }

  /**
    * The name and type of entity who performed the action on the affected resource.
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

  /**
    * Reserved for future use.
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

  /**
    * Reserved for future use.
    */
  @js.native
  sealed trait UserIdentityType extends js.Any
  object UserIdentityType extends js.Object {
    val AssumedRole = "AssumedRole".asInstanceOf[UserIdentityType]
    val IAMUser = "IAMUser".asInstanceOf[UserIdentityType]
    val FederatedUser = "FederatedUser".asInstanceOf[UserIdentityType]
    val Root = "Root".asInstanceOf[UserIdentityType]
    val AWSAccount = "AWSAccount".asInstanceOf[UserIdentityType]
    val AWSService = "AWSService".asInstanceOf[UserIdentityType]

    val values = js.Object.freeze(js.Array(AssumedRole, IAMUser, FederatedUser, Root, AWSAccount, AWSService))
  }

  /**
    * Reserved for future use.
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
