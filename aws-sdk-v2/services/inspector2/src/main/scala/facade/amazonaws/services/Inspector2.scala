package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object inspector2 {
  type AccountId = String
  type AccountIdSet = js.Array[AccountId]
  type AccountList = js.Array[Account]
  type AccountStateList = js.Array[AccountState]
  type AggCounts = Double
  type AggregationResponseList = js.Array[AggregationResponse]
  type AmiId = String
  type ArchitectureList = js.Array[Architecture]
  type Arn = String
  type BatchGetFreeTrialInfoRequestAccountIdsList = js.Array[MeteringAccountId]
  type ClientToken = String
  type Component = String
  type ComponentType = String
  type CountsList = js.Array[Counts]
  type CoverageMapFilterList = js.Array[CoverageMapFilter]
  type CoverageStringFilterList = js.Array[CoverageStringFilter]
  type CoverageStringInput = String
  type CoveredResources = js.Array[CoveredResource]
  type CvssScoreAdjustmentList = js.Array[CvssScoreAdjustment]
  type CvssScoreList = js.Array[CvssScore]
  type DateFilterList = js.Array[DateFilter]
  type DateTimeTimestamp = js.Date
  type DelegatedAdminAccountList = js.Array[DelegatedAdminAccount]
  type DisableResourceTypeList = js.Array[ResourceScanType]
  type EnableResourceTypeList = js.Array[ResourceScanType]
  type ErrorMessage = String
  type ExecutionRoleArn = String
  type FailedAccountList = js.Array[FailedAccount]
  type FilePath = String
  type FilterArn = String
  type FilterArnList = js.Array[FilterArn]
  type FilterDescription = String
  type FilterList = js.Array[Filter]
  type FilterName = String
  type FilterReason = String
  type FindingArn = String
  type FindingDescription = String
  type FindingList = js.Array[Finding]
  type FindingTitle = String
  type FreeTrialAccountInfoList = js.Array[FreeTrialAccountInfo]
  type FreeTrialInfoErrorList = js.Array[FreeTrialInfoError]
  type FreeTrialInfoList = js.Array[FreeTrialInfo]
  type FunctionName = String
  type ImageHash = String
  type ImageTagList = js.Array[NonEmptyString]
  type IpV4Address = String
  type IpV4AddressList = js.Array[IpV4Address]
  type IpV6Address = String
  type IpV6AddressList = js.Array[IpV6Address]
  type LambdaLayerArn = String
  type LambdaLayerList = js.Array[String]
  type LayerList = js.Array[LambdaLayerArn]
  type ListAccountPermissionsMaxResults = Int
  type ListCoverageMaxResults = Int
  type ListDelegatedAdminMaxResults = Int
  type ListFilterMaxResults = Int
  type ListFindingAggregationsMaxResults = Int
  type ListFindingsMaxResults = Int
  type ListMembersMaxResults = Int
  type ListUsageTotalsMaxResults = Int
  type ListUsageTotalsNextToken = String
  type MapFilterList = js.Array[MapFilter]
  type MapKey = String
  type MapValue = String
  type MemberList = js.Array[Member]
  type MeteringAccountId = String
  type MonthlyCostEstimate = Double
  type NextToken = String
  type NonEmptyString = String
  type NonEmptyStringList = js.Array[NonEmptyString]
  type NumberFilterList = js.Array[NumberFilter]
  type OwnerId = String
  type PackageArchitecture = String
  type PackageEpoch = Int
  type PackageFilterList = js.Array[PackageFilter]
  type PackageName = String
  type PackageRelease = String
  type PackageVersion = String
  type Permissions = js.Array[Permission]
  type Platform = String
  type Port = Int
  type PortRangeFilterList = js.Array[PortRangeFilter]
  type ReportId = String
  type ResourceId = String
  type ResourceList = js.Array[Resource]
  type SecurityGroupId = String
  type SecurityGroupIdList = js.Array[SecurityGroupId]
  type SourceLayerHash = String
  type StepList = js.Array[Step]
  type StringFilterList = js.Array[StringFilter]
  type StringInput = String
  type StringList = js.Array[NonEmptyString]
  type SubnetId = String
  type SubnetIdList = js.Array[SubnetId]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[String]
  type TagMap = js.Dictionary[MapValue]
  type Timestamp = js.Date
  type UsageAccountId = String
  type UsageAccountIdList = js.Array[UsageAccountId]
  type UsageList = js.Array[Usage]
  type UsageTotalList = js.Array[UsageTotal]
  type UsageValue = Double
  type Version = String
  type VpcId = String
  type VulnerabilityId = String
  type VulnerabilityIdList = js.Array[VulnerabilityId]
  type VulnerablePackageList = js.Array[VulnerablePackage]
  type VulnerablePackageRemediation = String

  final class Inspector2Ops(private val service: Inspector2) extends AnyVal {

    @inline def associateMemberFuture(params: AssociateMemberRequest): Future[AssociateMemberResponse] = service.associateMember(params).promise().toFuture
    @inline def batchGetAccountStatusFuture(params: BatchGetAccountStatusRequest): Future[BatchGetAccountStatusResponse] = service.batchGetAccountStatus(params).promise().toFuture
    @inline def batchGetFreeTrialInfoFuture(params: BatchGetFreeTrialInfoRequest): Future[BatchGetFreeTrialInfoResponse] = service.batchGetFreeTrialInfo(params).promise().toFuture
    @inline def cancelFindingsReportFuture(params: CancelFindingsReportRequest): Future[CancelFindingsReportResponse] = service.cancelFindingsReport(params).promise().toFuture
    @inline def createFilterFuture(params: CreateFilterRequest): Future[CreateFilterResponse] = service.createFilter(params).promise().toFuture
    @inline def createFindingsReportFuture(params: CreateFindingsReportRequest): Future[CreateFindingsReportResponse] = service.createFindingsReport(params).promise().toFuture
    @inline def deleteFilterFuture(params: DeleteFilterRequest): Future[DeleteFilterResponse] = service.deleteFilter(params).promise().toFuture
    @inline def describeOrganizationConfigurationFuture(params: DescribeOrganizationConfigurationRequest): Future[DescribeOrganizationConfigurationResponse] = service.describeOrganizationConfiguration(params).promise().toFuture
    @inline def disableDelegatedAdminAccountFuture(params: DisableDelegatedAdminAccountRequest): Future[DisableDelegatedAdminAccountResponse] = service.disableDelegatedAdminAccount(params).promise().toFuture
    @inline def disableFuture(params: DisableRequest): Future[DisableResponse] = service.disable(params).promise().toFuture
    @inline def disassociateMemberFuture(params: DisassociateMemberRequest): Future[DisassociateMemberResponse] = service.disassociateMember(params).promise().toFuture
    @inline def enableDelegatedAdminAccountFuture(params: EnableDelegatedAdminAccountRequest): Future[EnableDelegatedAdminAccountResponse] = service.enableDelegatedAdminAccount(params).promise().toFuture
    @inline def enableFuture(params: EnableRequest): Future[EnableResponse] = service.enable(params).promise().toFuture
    @inline def getConfigurationFuture(params: GetConfigurationRequest): Future[GetConfigurationResponse] = service.getConfiguration(params).promise().toFuture
    @inline def getDelegatedAdminAccountFuture(params: GetDelegatedAdminAccountRequest): Future[GetDelegatedAdminAccountResponse] = service.getDelegatedAdminAccount(params).promise().toFuture
    @inline def getFindingsReportStatusFuture(params: GetFindingsReportStatusRequest): Future[GetFindingsReportStatusResponse] = service.getFindingsReportStatus(params).promise().toFuture
    @inline def getMemberFuture(params: GetMemberRequest): Future[GetMemberResponse] = service.getMember(params).promise().toFuture
    @inline def listAccountPermissionsFuture(params: ListAccountPermissionsRequest): Future[ListAccountPermissionsResponse] = service.listAccountPermissions(params).promise().toFuture
    @inline def listCoverageFuture(params: ListCoverageRequest): Future[ListCoverageResponse] = service.listCoverage(params).promise().toFuture
    @inline def listCoverageStatisticsFuture(params: ListCoverageStatisticsRequest): Future[ListCoverageStatisticsResponse] = service.listCoverageStatistics(params).promise().toFuture
    @inline def listDelegatedAdminAccountsFuture(params: ListDelegatedAdminAccountsRequest): Future[ListDelegatedAdminAccountsResponse] = service.listDelegatedAdminAccounts(params).promise().toFuture
    @inline def listFiltersFuture(params: ListFiltersRequest): Future[ListFiltersResponse] = service.listFilters(params).promise().toFuture
    @inline def listFindingAggregationsFuture(params: ListFindingAggregationsRequest): Future[ListFindingAggregationsResponse] = service.listFindingAggregations(params).promise().toFuture
    @inline def listFindingsFuture(params: ListFindingsRequest): Future[ListFindingsResponse] = service.listFindings(params).promise().toFuture
    @inline def listMembersFuture(params: ListMembersRequest): Future[ListMembersResponse] = service.listMembers(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listUsageTotalsFuture(params: ListUsageTotalsRequest): Future[ListUsageTotalsResponse] = service.listUsageTotals(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateConfigurationFuture(params: UpdateConfigurationRequest): Future[UpdateConfigurationResponse] = service.updateConfiguration(params).promise().toFuture
    @inline def updateFilterFuture(params: UpdateFilterRequest): Future[UpdateFilterResponse] = service.updateFilter(params).promise().toFuture
    @inline def updateOrganizationConfigurationFuture(params: UpdateOrganizationConfigurationRequest): Future[UpdateOrganizationConfigurationResponse] = service.updateOrganizationConfiguration(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/inspector2", JSImport.Namespace, "AWS.Inspector2")
  class Inspector2() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateMember(params: AssociateMemberRequest): Request[AssociateMemberResponse] = js.native
    def batchGetAccountStatus(params: BatchGetAccountStatusRequest): Request[BatchGetAccountStatusResponse] = js.native
    def batchGetFreeTrialInfo(params: BatchGetFreeTrialInfoRequest): Request[BatchGetFreeTrialInfoResponse] = js.native
    def cancelFindingsReport(params: CancelFindingsReportRequest): Request[CancelFindingsReportResponse] = js.native
    def createFilter(params: CreateFilterRequest): Request[CreateFilterResponse] = js.native
    def createFindingsReport(params: CreateFindingsReportRequest): Request[CreateFindingsReportResponse] = js.native
    def deleteFilter(params: DeleteFilterRequest): Request[DeleteFilterResponse] = js.native
    def describeOrganizationConfiguration(params: DescribeOrganizationConfigurationRequest): Request[DescribeOrganizationConfigurationResponse] = js.native
    def disable(params: DisableRequest): Request[DisableResponse] = js.native
    def disableDelegatedAdminAccount(params: DisableDelegatedAdminAccountRequest): Request[DisableDelegatedAdminAccountResponse] = js.native
    def disassociateMember(params: DisassociateMemberRequest): Request[DisassociateMemberResponse] = js.native
    def enable(params: EnableRequest): Request[EnableResponse] = js.native
    def enableDelegatedAdminAccount(params: EnableDelegatedAdminAccountRequest): Request[EnableDelegatedAdminAccountResponse] = js.native
    def getConfiguration(params: GetConfigurationRequest): Request[GetConfigurationResponse] = js.native
    def getDelegatedAdminAccount(params: GetDelegatedAdminAccountRequest): Request[GetDelegatedAdminAccountResponse] = js.native
    def getFindingsReportStatus(params: GetFindingsReportStatusRequest): Request[GetFindingsReportStatusResponse] = js.native
    def getMember(params: GetMemberRequest): Request[GetMemberResponse] = js.native
    def listAccountPermissions(params: ListAccountPermissionsRequest): Request[ListAccountPermissionsResponse] = js.native
    def listCoverage(params: ListCoverageRequest): Request[ListCoverageResponse] = js.native
    def listCoverageStatistics(params: ListCoverageStatisticsRequest): Request[ListCoverageStatisticsResponse] = js.native
    def listDelegatedAdminAccounts(params: ListDelegatedAdminAccountsRequest): Request[ListDelegatedAdminAccountsResponse] = js.native
    def listFilters(params: ListFiltersRequest): Request[ListFiltersResponse] = js.native
    def listFindingAggregations(params: ListFindingAggregationsRequest): Request[ListFindingAggregationsResponse] = js.native
    def listFindings(params: ListFindingsRequest): Request[ListFindingsResponse] = js.native
    def listMembers(params: ListMembersRequest): Request[ListMembersResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listUsageTotals(params: ListUsageTotalsRequest): Request[ListUsageTotalsResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateConfiguration(params: UpdateConfigurationRequest): Request[UpdateConfigurationResponse] = js.native
    def updateFilter(params: UpdateFilterRequest): Request[UpdateFilterResponse] = js.native
    def updateOrganizationConfiguration(params: UpdateOrganizationConfigurationRequest): Request[UpdateOrganizationConfigurationResponse] = js.native
  }
  object Inspector2 {
    @inline implicit def toOps(service: Inspector2): Inspector2Ops = {
      new Inspector2Ops(service)
    }
  }

  /** An Amazon Web Services account within your environment that Amazon Inspector has been enabled for.
    */
  @js.native
  trait Account extends js.Object {
    var accountId: AccountId
    var resourceStatus: ResourceStatus
    var status: Status
  }

  object Account {
    @inline
    def apply(
        accountId: AccountId,
        resourceStatus: ResourceStatus,
        status: Status
    ): Account = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "resourceStatus" -> resourceStatus.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Account]
    }
  }

  /** An object that contains details about an aggregation response based on Amazon Web Services accounts.
    */
  @js.native
  trait AccountAggregation extends js.Object {
    var findingType: js.UndefOr[AggregationFindingType]
    var resourceType: js.UndefOr[AggregationResourceType]
    var sortBy: js.UndefOr[AccountSortBy]
    var sortOrder: js.UndefOr[SortOrder]
  }

  object AccountAggregation {
    @inline
    def apply(
        findingType: js.UndefOr[AggregationFindingType] = js.undefined,
        resourceType: js.UndefOr[AggregationResourceType] = js.undefined,
        sortBy: js.UndefOr[AccountSortBy] = js.undefined,
        sortOrder: js.UndefOr[SortOrder] = js.undefined
    ): AccountAggregation = {
      val __obj = js.Dynamic.literal()
      findingType.foreach(__v => __obj.updateDynamic("findingType")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountAggregation]
    }
  }

  /** An aggregation of findings by Amazon Web Services account ID.
    */
  @js.native
  trait AccountAggregationResponse extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var severityCounts: js.UndefOr[SeverityCounts]
  }

  object AccountAggregationResponse {
    @inline
    def apply(
        accountId: js.UndefOr[AccountId] = js.undefined,
        severityCounts: js.UndefOr[SeverityCounts] = js.undefined
    ): AccountAggregationResponse = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      severityCounts.foreach(__v => __obj.updateDynamic("severityCounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountAggregationResponse]
    }
  }

  /** An object with details the status of an Amazon Web Services account within your Amazon Inspector environment.
    */
  @js.native
  trait AccountState extends js.Object {
    var accountId: AccountId
    var resourceState: ResourceState
    var state: State
  }

  object AccountState {
    @inline
    def apply(
        accountId: AccountId,
        resourceState: ResourceState,
        state: State
    ): AccountState = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "resourceState" -> resourceState.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AccountState]
    }
  }

  /** Contains details about an aggregation request.
    */
  @js.native
  trait AggregationRequest extends js.Object {
    var accountAggregation: js.UndefOr[AccountAggregation]
    var amiAggregation: js.UndefOr[AmiAggregation]
    var awsEcrContainerAggregation: js.UndefOr[AwsEcrContainerAggregation]
    var ec2InstanceAggregation: js.UndefOr[Ec2InstanceAggregation]
    var findingTypeAggregation: js.UndefOr[FindingTypeAggregation]
    var imageLayerAggregation: js.UndefOr[ImageLayerAggregation]
    var lambdaFunctionAggregation: js.UndefOr[LambdaFunctionAggregation]
    var lambdaLayerAggregation: js.UndefOr[LambdaLayerAggregation]
    var packageAggregation: js.UndefOr[PackageAggregation]
    var repositoryAggregation: js.UndefOr[RepositoryAggregation]
    var titleAggregation: js.UndefOr[TitleAggregation]
  }

  object AggregationRequest {
    @inline
    def apply(
        accountAggregation: js.UndefOr[AccountAggregation] = js.undefined,
        amiAggregation: js.UndefOr[AmiAggregation] = js.undefined,
        awsEcrContainerAggregation: js.UndefOr[AwsEcrContainerAggregation] = js.undefined,
        ec2InstanceAggregation: js.UndefOr[Ec2InstanceAggregation] = js.undefined,
        findingTypeAggregation: js.UndefOr[FindingTypeAggregation] = js.undefined,
        imageLayerAggregation: js.UndefOr[ImageLayerAggregation] = js.undefined,
        lambdaFunctionAggregation: js.UndefOr[LambdaFunctionAggregation] = js.undefined,
        lambdaLayerAggregation: js.UndefOr[LambdaLayerAggregation] = js.undefined,
        packageAggregation: js.UndefOr[PackageAggregation] = js.undefined,
        repositoryAggregation: js.UndefOr[RepositoryAggregation] = js.undefined,
        titleAggregation: js.UndefOr[TitleAggregation] = js.undefined
    ): AggregationRequest = {
      val __obj = js.Dynamic.literal()
      accountAggregation.foreach(__v => __obj.updateDynamic("accountAggregation")(__v.asInstanceOf[js.Any]))
      amiAggregation.foreach(__v => __obj.updateDynamic("amiAggregation")(__v.asInstanceOf[js.Any]))
      awsEcrContainerAggregation.foreach(__v => __obj.updateDynamic("awsEcrContainerAggregation")(__v.asInstanceOf[js.Any]))
      ec2InstanceAggregation.foreach(__v => __obj.updateDynamic("ec2InstanceAggregation")(__v.asInstanceOf[js.Any]))
      findingTypeAggregation.foreach(__v => __obj.updateDynamic("findingTypeAggregation")(__v.asInstanceOf[js.Any]))
      imageLayerAggregation.foreach(__v => __obj.updateDynamic("imageLayerAggregation")(__v.asInstanceOf[js.Any]))
      lambdaFunctionAggregation.foreach(__v => __obj.updateDynamic("lambdaFunctionAggregation")(__v.asInstanceOf[js.Any]))
      lambdaLayerAggregation.foreach(__v => __obj.updateDynamic("lambdaLayerAggregation")(__v.asInstanceOf[js.Any]))
      packageAggregation.foreach(__v => __obj.updateDynamic("packageAggregation")(__v.asInstanceOf[js.Any]))
      repositoryAggregation.foreach(__v => __obj.updateDynamic("repositoryAggregation")(__v.asInstanceOf[js.Any]))
      titleAggregation.foreach(__v => __obj.updateDynamic("titleAggregation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AggregationRequest]
    }
  }

  /** A structure that contains details about the results of an aggregation type.
    */
  @js.native
  trait AggregationResponse extends js.Object {
    var accountAggregation: js.UndefOr[AccountAggregationResponse]
    var amiAggregation: js.UndefOr[AmiAggregationResponse]
    var awsEcrContainerAggregation: js.UndefOr[AwsEcrContainerAggregationResponse]
    var ec2InstanceAggregation: js.UndefOr[Ec2InstanceAggregationResponse]
    var findingTypeAggregation: js.UndefOr[FindingTypeAggregationResponse]
    var imageLayerAggregation: js.UndefOr[ImageLayerAggregationResponse]
    var lambdaFunctionAggregation: js.UndefOr[LambdaFunctionAggregationResponse]
    var lambdaLayerAggregation: js.UndefOr[LambdaLayerAggregationResponse]
    var packageAggregation: js.UndefOr[PackageAggregationResponse]
    var repositoryAggregation: js.UndefOr[RepositoryAggregationResponse]
    var titleAggregation: js.UndefOr[TitleAggregationResponse]
  }

  object AggregationResponse {
    @inline
    def apply(
        accountAggregation: js.UndefOr[AccountAggregationResponse] = js.undefined,
        amiAggregation: js.UndefOr[AmiAggregationResponse] = js.undefined,
        awsEcrContainerAggregation: js.UndefOr[AwsEcrContainerAggregationResponse] = js.undefined,
        ec2InstanceAggregation: js.UndefOr[Ec2InstanceAggregationResponse] = js.undefined,
        findingTypeAggregation: js.UndefOr[FindingTypeAggregationResponse] = js.undefined,
        imageLayerAggregation: js.UndefOr[ImageLayerAggregationResponse] = js.undefined,
        lambdaFunctionAggregation: js.UndefOr[LambdaFunctionAggregationResponse] = js.undefined,
        lambdaLayerAggregation: js.UndefOr[LambdaLayerAggregationResponse] = js.undefined,
        packageAggregation: js.UndefOr[PackageAggregationResponse] = js.undefined,
        repositoryAggregation: js.UndefOr[RepositoryAggregationResponse] = js.undefined,
        titleAggregation: js.UndefOr[TitleAggregationResponse] = js.undefined
    ): AggregationResponse = {
      val __obj = js.Dynamic.literal()
      accountAggregation.foreach(__v => __obj.updateDynamic("accountAggregation")(__v.asInstanceOf[js.Any]))
      amiAggregation.foreach(__v => __obj.updateDynamic("amiAggregation")(__v.asInstanceOf[js.Any]))
      awsEcrContainerAggregation.foreach(__v => __obj.updateDynamic("awsEcrContainerAggregation")(__v.asInstanceOf[js.Any]))
      ec2InstanceAggregation.foreach(__v => __obj.updateDynamic("ec2InstanceAggregation")(__v.asInstanceOf[js.Any]))
      findingTypeAggregation.foreach(__v => __obj.updateDynamic("findingTypeAggregation")(__v.asInstanceOf[js.Any]))
      imageLayerAggregation.foreach(__v => __obj.updateDynamic("imageLayerAggregation")(__v.asInstanceOf[js.Any]))
      lambdaFunctionAggregation.foreach(__v => __obj.updateDynamic("lambdaFunctionAggregation")(__v.asInstanceOf[js.Any]))
      lambdaLayerAggregation.foreach(__v => __obj.updateDynamic("lambdaLayerAggregation")(__v.asInstanceOf[js.Any]))
      packageAggregation.foreach(__v => __obj.updateDynamic("packageAggregation")(__v.asInstanceOf[js.Any]))
      repositoryAggregation.foreach(__v => __obj.updateDynamic("repositoryAggregation")(__v.asInstanceOf[js.Any]))
      titleAggregation.foreach(__v => __obj.updateDynamic("titleAggregation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AggregationResponse]
    }
  }

  /** The details that define an aggregation based on Amazon machine images (AMIs).
    */
  @js.native
  trait AmiAggregation extends js.Object {
    var amis: js.UndefOr[StringFilterList]
    var sortBy: js.UndefOr[AmiSortBy]
    var sortOrder: js.UndefOr[SortOrder]
  }

  object AmiAggregation {
    @inline
    def apply(
        amis: js.UndefOr[StringFilterList] = js.undefined,
        sortBy: js.UndefOr[AmiSortBy] = js.undefined,
        sortOrder: js.UndefOr[SortOrder] = js.undefined
    ): AmiAggregation = {
      val __obj = js.Dynamic.literal()
      amis.foreach(__v => __obj.updateDynamic("amis")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AmiAggregation]
    }
  }

  /** A response that contains the results of a finding aggregation by AMI.
    */
  @js.native
  trait AmiAggregationResponse extends js.Object {
    var ami: AmiId
    var accountId: js.UndefOr[AccountId]
    var affectedInstances: js.UndefOr[Double]
    var severityCounts: js.UndefOr[SeverityCounts]
  }

  object AmiAggregationResponse {
    @inline
    def apply(
        ami: AmiId,
        accountId: js.UndefOr[AccountId] = js.undefined,
        affectedInstances: js.UndefOr[Double] = js.undefined,
        severityCounts: js.UndefOr[SeverityCounts] = js.undefined
    ): AmiAggregationResponse = {
      val __obj = js.Dynamic.literal(
        "ami" -> ami.asInstanceOf[js.Any]
      )

      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      affectedInstances.foreach(__v => __obj.updateDynamic("affectedInstances")(__v.asInstanceOf[js.Any]))
      severityCounts.foreach(__v => __obj.updateDynamic("severityCounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AmiAggregationResponse]
    }
  }

  @js.native
  trait AssociateMemberRequest extends js.Object {
    var accountId: AccountId
  }

  object AssociateMemberRequest {
    @inline
    def apply(
        accountId: AccountId
    ): AssociateMemberRequest = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateMemberRequest]
    }
  }

  @js.native
  trait AssociateMemberResponse extends js.Object {
    var accountId: AccountId
  }

  object AssociateMemberResponse {
    @inline
    def apply(
        accountId: AccountId
    ): AssociateMemberResponse = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateMemberResponse]
    }
  }

  /** Represents which scan types are automatically enabled for new members of your Amazon Inspector organization.
    */
  @js.native
  trait AutoEnable extends js.Object {
    var ec2: Boolean
    var ecr: Boolean
    var lambda: js.UndefOr[Boolean]
  }

  object AutoEnable {
    @inline
    def apply(
        ec2: Boolean,
        ecr: Boolean,
        lambda: js.UndefOr[Boolean] = js.undefined
    ): AutoEnable = {
      val __obj = js.Dynamic.literal(
        "ec2" -> ec2.asInstanceOf[js.Any],
        "ecr" -> ecr.asInstanceOf[js.Any]
      )

      lambda.foreach(__v => __obj.updateDynamic("lambda")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoEnable]
    }
  }

  /** Details of the Amazon EC2 instance involved in a finding.
    */
  @js.native
  trait AwsEc2InstanceDetails extends js.Object {
    var iamInstanceProfileArn: js.UndefOr[NonEmptyString]
    var imageId: js.UndefOr[NonEmptyString]
    var ipV4Addresses: js.UndefOr[IpV4AddressList]
    var ipV6Addresses: js.UndefOr[IpV6AddressList]
    var keyName: js.UndefOr[NonEmptyString]
    var launchedAt: js.UndefOr[DateTimeTimestamp]
    var platform: js.UndefOr[Platform]
    var subnetId: js.UndefOr[NonEmptyString]
    var `type`: js.UndefOr[NonEmptyString]
    var vpcId: js.UndefOr[NonEmptyString]
  }

  object AwsEc2InstanceDetails {
    @inline
    def apply(
        iamInstanceProfileArn: js.UndefOr[NonEmptyString] = js.undefined,
        imageId: js.UndefOr[NonEmptyString] = js.undefined,
        ipV4Addresses: js.UndefOr[IpV4AddressList] = js.undefined,
        ipV6Addresses: js.UndefOr[IpV6AddressList] = js.undefined,
        keyName: js.UndefOr[NonEmptyString] = js.undefined,
        launchedAt: js.UndefOr[DateTimeTimestamp] = js.undefined,
        platform: js.UndefOr[Platform] = js.undefined,
        subnetId: js.UndefOr[NonEmptyString] = js.undefined,
        `type`: js.UndefOr[NonEmptyString] = js.undefined,
        vpcId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2InstanceDetails = {
      val __obj = js.Dynamic.literal()
      iamInstanceProfileArn.foreach(__v => __obj.updateDynamic("iamInstanceProfileArn")(__v.asInstanceOf[js.Any]))
      imageId.foreach(__v => __obj.updateDynamic("imageId")(__v.asInstanceOf[js.Any]))
      ipV4Addresses.foreach(__v => __obj.updateDynamic("ipV4Addresses")(__v.asInstanceOf[js.Any]))
      ipV6Addresses.foreach(__v => __obj.updateDynamic("ipV6Addresses")(__v.asInstanceOf[js.Any]))
      keyName.foreach(__v => __obj.updateDynamic("keyName")(__v.asInstanceOf[js.Any]))
      launchedAt.foreach(__v => __obj.updateDynamic("launchedAt")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      subnetId.foreach(__v => __obj.updateDynamic("subnetId")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      vpcId.foreach(__v => __obj.updateDynamic("vpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2InstanceDetails]
    }
  }

  /** An aggregation of information about Amazon ECR containers.
    */
  @js.native
  trait AwsEcrContainerAggregation extends js.Object {
    var architectures: js.UndefOr[StringFilterList]
    var imageShas: js.UndefOr[StringFilterList]
    var imageTags: js.UndefOr[StringFilterList]
    var repositories: js.UndefOr[StringFilterList]
    var resourceIds: js.UndefOr[StringFilterList]
    var sortBy: js.UndefOr[AwsEcrContainerSortBy]
    var sortOrder: js.UndefOr[SortOrder]
  }

  object AwsEcrContainerAggregation {
    @inline
    def apply(
        architectures: js.UndefOr[StringFilterList] = js.undefined,
        imageShas: js.UndefOr[StringFilterList] = js.undefined,
        imageTags: js.UndefOr[StringFilterList] = js.undefined,
        repositories: js.UndefOr[StringFilterList] = js.undefined,
        resourceIds: js.UndefOr[StringFilterList] = js.undefined,
        sortBy: js.UndefOr[AwsEcrContainerSortBy] = js.undefined,
        sortOrder: js.UndefOr[SortOrder] = js.undefined
    ): AwsEcrContainerAggregation = {
      val __obj = js.Dynamic.literal()
      architectures.foreach(__v => __obj.updateDynamic("architectures")(__v.asInstanceOf[js.Any]))
      imageShas.foreach(__v => __obj.updateDynamic("imageShas")(__v.asInstanceOf[js.Any]))
      imageTags.foreach(__v => __obj.updateDynamic("imageTags")(__v.asInstanceOf[js.Any]))
      repositories.foreach(__v => __obj.updateDynamic("repositories")(__v.asInstanceOf[js.Any]))
      resourceIds.foreach(__v => __obj.updateDynamic("resourceIds")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcrContainerAggregation]
    }
  }

  /** An aggregation of information about Amazon ECR containers.
    */
  @js.native
  trait AwsEcrContainerAggregationResponse extends js.Object {
    var resourceId: NonEmptyString
    var accountId: js.UndefOr[AccountId]
    var architecture: js.UndefOr[String]
    var imageSha: js.UndefOr[String]
    var imageTags: js.UndefOr[StringList]
    var repository: js.UndefOr[String]
    var severityCounts: js.UndefOr[SeverityCounts]
  }

  object AwsEcrContainerAggregationResponse {
    @inline
    def apply(
        resourceId: NonEmptyString,
        accountId: js.UndefOr[AccountId] = js.undefined,
        architecture: js.UndefOr[String] = js.undefined,
        imageSha: js.UndefOr[String] = js.undefined,
        imageTags: js.UndefOr[StringList] = js.undefined,
        repository: js.UndefOr[String] = js.undefined,
        severityCounts: js.UndefOr[SeverityCounts] = js.undefined
    ): AwsEcrContainerAggregationResponse = {
      val __obj = js.Dynamic.literal(
        "resourceId" -> resourceId.asInstanceOf[js.Any]
      )

      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      architecture.foreach(__v => __obj.updateDynamic("architecture")(__v.asInstanceOf[js.Any]))
      imageSha.foreach(__v => __obj.updateDynamic("imageSha")(__v.asInstanceOf[js.Any]))
      imageTags.foreach(__v => __obj.updateDynamic("imageTags")(__v.asInstanceOf[js.Any]))
      repository.foreach(__v => __obj.updateDynamic("repository")(__v.asInstanceOf[js.Any]))
      severityCounts.foreach(__v => __obj.updateDynamic("severityCounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcrContainerAggregationResponse]
    }
  }

  /** The image details of the Amazon ECR container image.
    */
  @js.native
  trait AwsEcrContainerImageDetails extends js.Object {
    var imageHash: ImageHash
    var registry: NonEmptyString
    var repositoryName: NonEmptyString
    var architecture: js.UndefOr[NonEmptyString]
    var author: js.UndefOr[String]
    var imageTags: js.UndefOr[ImageTagList]
    var platform: js.UndefOr[Platform]
    var pushedAt: js.UndefOr[DateTimeTimestamp]
  }

  object AwsEcrContainerImageDetails {
    @inline
    def apply(
        imageHash: ImageHash,
        registry: NonEmptyString,
        repositoryName: NonEmptyString,
        architecture: js.UndefOr[NonEmptyString] = js.undefined,
        author: js.UndefOr[String] = js.undefined,
        imageTags: js.UndefOr[ImageTagList] = js.undefined,
        platform: js.UndefOr[Platform] = js.undefined,
        pushedAt: js.UndefOr[DateTimeTimestamp] = js.undefined
    ): AwsEcrContainerImageDetails = {
      val __obj = js.Dynamic.literal(
        "imageHash" -> imageHash.asInstanceOf[js.Any],
        "registry" -> registry.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any]
      )

      architecture.foreach(__v => __obj.updateDynamic("architecture")(__v.asInstanceOf[js.Any]))
      author.foreach(__v => __obj.updateDynamic("author")(__v.asInstanceOf[js.Any]))
      imageTags.foreach(__v => __obj.updateDynamic("imageTags")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      pushedAt.foreach(__v => __obj.updateDynamic("pushedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcrContainerImageDetails]
    }
  }

  /** A summary of information about the AWS Lambda function.
    */
  @js.native
  trait AwsLambdaFunctionDetails extends js.Object {
    var codeSha256: NonEmptyString
    var executionRoleArn: ExecutionRoleArn
    var functionName: FunctionName
    var runtime: Runtime
    var version: Version
    var architectures: js.UndefOr[ArchitectureList]
    var lastModifiedAt: js.UndefOr[Timestamp]
    var layers: js.UndefOr[LayerList]
    var packageType: js.UndefOr[PackageType]
    var vpcConfig: js.UndefOr[LambdaVpcConfig]
  }

  object AwsLambdaFunctionDetails {
    @inline
    def apply(
        codeSha256: NonEmptyString,
        executionRoleArn: ExecutionRoleArn,
        functionName: FunctionName,
        runtime: Runtime,
        version: Version,
        architectures: js.UndefOr[ArchitectureList] = js.undefined,
        lastModifiedAt: js.UndefOr[Timestamp] = js.undefined,
        layers: js.UndefOr[LayerList] = js.undefined,
        packageType: js.UndefOr[PackageType] = js.undefined,
        vpcConfig: js.UndefOr[LambdaVpcConfig] = js.undefined
    ): AwsLambdaFunctionDetails = {
      val __obj = js.Dynamic.literal(
        "codeSha256" -> codeSha256.asInstanceOf[js.Any],
        "executionRoleArn" -> executionRoleArn.asInstanceOf[js.Any],
        "functionName" -> functionName.asInstanceOf[js.Any],
        "runtime" -> runtime.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )

      architectures.foreach(__v => __obj.updateDynamic("architectures")(__v.asInstanceOf[js.Any]))
      lastModifiedAt.foreach(__v => __obj.updateDynamic("lastModifiedAt")(__v.asInstanceOf[js.Any]))
      layers.foreach(__v => __obj.updateDynamic("layers")(__v.asInstanceOf[js.Any]))
      packageType.foreach(__v => __obj.updateDynamic("packageType")(__v.asInstanceOf[js.Any]))
      vpcConfig.foreach(__v => __obj.updateDynamic("vpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsLambdaFunctionDetails]
    }
  }

  @js.native
  trait BatchGetAccountStatusRequest extends js.Object {
    var accountIds: js.UndefOr[AccountIdSet]
  }

  object BatchGetAccountStatusRequest {
    @inline
    def apply(
        accountIds: js.UndefOr[AccountIdSet] = js.undefined
    ): BatchGetAccountStatusRequest = {
      val __obj = js.Dynamic.literal()
      accountIds.foreach(__v => __obj.updateDynamic("accountIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetAccountStatusRequest]
    }
  }

  @js.native
  trait BatchGetAccountStatusResponse extends js.Object {
    var accounts: AccountStateList
    var failedAccounts: js.UndefOr[FailedAccountList]
  }

  object BatchGetAccountStatusResponse {
    @inline
    def apply(
        accounts: AccountStateList,
        failedAccounts: js.UndefOr[FailedAccountList] = js.undefined
    ): BatchGetAccountStatusResponse = {
      val __obj = js.Dynamic.literal(
        "accounts" -> accounts.asInstanceOf[js.Any]
      )

      failedAccounts.foreach(__v => __obj.updateDynamic("failedAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetAccountStatusResponse]
    }
  }

  @js.native
  trait BatchGetFreeTrialInfoRequest extends js.Object {
    var accountIds: BatchGetFreeTrialInfoRequestAccountIdsList
  }

  object BatchGetFreeTrialInfoRequest {
    @inline
    def apply(
        accountIds: BatchGetFreeTrialInfoRequestAccountIdsList
    ): BatchGetFreeTrialInfoRequest = {
      val __obj = js.Dynamic.literal(
        "accountIds" -> accountIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetFreeTrialInfoRequest]
    }
  }

  @js.native
  trait BatchGetFreeTrialInfoResponse extends js.Object {
    var accounts: FreeTrialAccountInfoList
    var failedAccounts: FreeTrialInfoErrorList
  }

  object BatchGetFreeTrialInfoResponse {
    @inline
    def apply(
        accounts: FreeTrialAccountInfoList,
        failedAccounts: FreeTrialInfoErrorList
    ): BatchGetFreeTrialInfoResponse = {
      val __obj = js.Dynamic.literal(
        "accounts" -> accounts.asInstanceOf[js.Any],
        "failedAccounts" -> failedAccounts.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetFreeTrialInfoResponse]
    }
  }

  @js.native
  trait CancelFindingsReportRequest extends js.Object {
    var reportId: ReportId
  }

  object CancelFindingsReportRequest {
    @inline
    def apply(
        reportId: ReportId
    ): CancelFindingsReportRequest = {
      val __obj = js.Dynamic.literal(
        "reportId" -> reportId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelFindingsReportRequest]
    }
  }

  @js.native
  trait CancelFindingsReportResponse extends js.Object {
    var reportId: ReportId
  }

  object CancelFindingsReportResponse {
    @inline
    def apply(
        reportId: ReportId
    ): CancelFindingsReportResponse = {
      val __obj = js.Dynamic.literal(
        "reportId" -> reportId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelFindingsReportResponse]
    }
  }

  /** a structure that contains information on the count of resources within a group.
    */
  @js.native
  trait Counts extends js.Object {
    var count: js.UndefOr[AggCounts]
    var groupKey: js.UndefOr[GroupKey]
  }

  object Counts {
    @inline
    def apply(
        count: js.UndefOr[AggCounts] = js.undefined,
        groupKey: js.UndefOr[GroupKey] = js.undefined
    ): Counts = {
      val __obj = js.Dynamic.literal()
      count.foreach(__v => __obj.updateDynamic("count")(__v.asInstanceOf[js.Any]))
      groupKey.foreach(__v => __obj.updateDynamic("groupKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Counts]
    }
  }

  /** A structure that identifies filter criteria for <code>GetCoverageStatistics</code>.
    */
  @js.native
  trait CoverageFilterCriteria extends js.Object {
    var accountId: js.UndefOr[CoverageStringFilterList]
    var ec2InstanceTags: js.UndefOr[CoverageMapFilterList]
    var ecrImageTags: js.UndefOr[CoverageStringFilterList]
    var ecrRepositoryName: js.UndefOr[CoverageStringFilterList]
    var lambdaFunctionName: js.UndefOr[CoverageStringFilterList]
    var lambdaFunctionRuntime: js.UndefOr[CoverageStringFilterList]
    var lambdaFunctionTags: js.UndefOr[CoverageMapFilterList]
    var resourceId: js.UndefOr[CoverageStringFilterList]
    var resourceType: js.UndefOr[CoverageStringFilterList]
    var scanStatusCode: js.UndefOr[CoverageStringFilterList]
    var scanStatusReason: js.UndefOr[CoverageStringFilterList]
    var scanType: js.UndefOr[CoverageStringFilterList]
  }

  object CoverageFilterCriteria {
    @inline
    def apply(
        accountId: js.UndefOr[CoverageStringFilterList] = js.undefined,
        ec2InstanceTags: js.UndefOr[CoverageMapFilterList] = js.undefined,
        ecrImageTags: js.UndefOr[CoverageStringFilterList] = js.undefined,
        ecrRepositoryName: js.UndefOr[CoverageStringFilterList] = js.undefined,
        lambdaFunctionName: js.UndefOr[CoverageStringFilterList] = js.undefined,
        lambdaFunctionRuntime: js.UndefOr[CoverageStringFilterList] = js.undefined,
        lambdaFunctionTags: js.UndefOr[CoverageMapFilterList] = js.undefined,
        resourceId: js.UndefOr[CoverageStringFilterList] = js.undefined,
        resourceType: js.UndefOr[CoverageStringFilterList] = js.undefined,
        scanStatusCode: js.UndefOr[CoverageStringFilterList] = js.undefined,
        scanStatusReason: js.UndefOr[CoverageStringFilterList] = js.undefined,
        scanType: js.UndefOr[CoverageStringFilterList] = js.undefined
    ): CoverageFilterCriteria = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      ec2InstanceTags.foreach(__v => __obj.updateDynamic("ec2InstanceTags")(__v.asInstanceOf[js.Any]))
      ecrImageTags.foreach(__v => __obj.updateDynamic("ecrImageTags")(__v.asInstanceOf[js.Any]))
      ecrRepositoryName.foreach(__v => __obj.updateDynamic("ecrRepositoryName")(__v.asInstanceOf[js.Any]))
      lambdaFunctionName.foreach(__v => __obj.updateDynamic("lambdaFunctionName")(__v.asInstanceOf[js.Any]))
      lambdaFunctionRuntime.foreach(__v => __obj.updateDynamic("lambdaFunctionRuntime")(__v.asInstanceOf[js.Any]))
      lambdaFunctionTags.foreach(__v => __obj.updateDynamic("lambdaFunctionTags")(__v.asInstanceOf[js.Any]))
      resourceId.foreach(__v => __obj.updateDynamic("resourceId")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      scanStatusCode.foreach(__v => __obj.updateDynamic("scanStatusCode")(__v.asInstanceOf[js.Any]))
      scanStatusReason.foreach(__v => __obj.updateDynamic("scanStatusReason")(__v.asInstanceOf[js.Any]))
      scanType.foreach(__v => __obj.updateDynamic("scanType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoverageFilterCriteria]
    }
  }

  /** Contains details of a coverage map filter.
    */
  @js.native
  trait CoverageMapFilter extends js.Object {
    var comparison: CoverageMapComparison
    var key: NonEmptyString
    var value: js.UndefOr[NonEmptyString]
  }

  object CoverageMapFilter {
    @inline
    def apply(
        comparison: CoverageMapComparison,
        key: NonEmptyString,
        value: js.UndefOr[NonEmptyString] = js.undefined
    ): CoverageMapFilter = {
      val __obj = js.Dynamic.literal(
        "comparison" -> comparison.asInstanceOf[js.Any],
        "key" -> key.asInstanceOf[js.Any]
      )

      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoverageMapFilter]
    }
  }

  /** Contains details of a coverage string filter.
    */
  @js.native
  trait CoverageStringFilter extends js.Object {
    var comparison: CoverageStringComparison
    var value: CoverageStringInput
  }

  object CoverageStringFilter {
    @inline
    def apply(
        comparison: CoverageStringComparison,
        value: CoverageStringInput
    ): CoverageStringFilter = {
      val __obj = js.Dynamic.literal(
        "comparison" -> comparison.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CoverageStringFilter]
    }
  }

  /** An object that contains details about a resource covered by Amazon Inspector.
    */
  @js.native
  trait CoveredResource extends js.Object {
    var accountId: AccountId
    var resourceId: ResourceId
    var resourceType: CoverageResourceType
    var scanType: ScanType
    var resourceMetadata: js.UndefOr[ResourceScanMetadata]
    var scanStatus: js.UndefOr[ScanStatus]
  }

  object CoveredResource {
    @inline
    def apply(
        accountId: AccountId,
        resourceId: ResourceId,
        resourceType: CoverageResourceType,
        scanType: ScanType,
        resourceMetadata: js.UndefOr[ResourceScanMetadata] = js.undefined,
        scanStatus: js.UndefOr[ScanStatus] = js.undefined
    ): CoveredResource = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any],
        "scanType" -> scanType.asInstanceOf[js.Any]
      )

      resourceMetadata.foreach(__v => __obj.updateDynamic("resourceMetadata")(__v.asInstanceOf[js.Any]))
      scanStatus.foreach(__v => __obj.updateDynamic("scanStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoveredResource]
    }
  }

  @js.native
  trait CreateFilterRequest extends js.Object {
    var action: FilterAction
    var filterCriteria: FilterCriteria
    var name: FilterName
    var description: js.UndefOr[FilterDescription]
    var reason: js.UndefOr[FilterReason]
    var tags: js.UndefOr[TagMap]
  }

  object CreateFilterRequest {
    @inline
    def apply(
        action: FilterAction,
        filterCriteria: FilterCriteria,
        name: FilterName,
        description: js.UndefOr[FilterDescription] = js.undefined,
        reason: js.UndefOr[FilterReason] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateFilterRequest = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any],
        "filterCriteria" -> filterCriteria.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFilterRequest]
    }
  }

  @js.native
  trait CreateFilterResponse extends js.Object {
    var arn: FilterArn
  }

  object CreateFilterResponse {
    @inline
    def apply(
        arn: FilterArn
    ): CreateFilterResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateFilterResponse]
    }
  }

  @js.native
  trait CreateFindingsReportRequest extends js.Object {
    var reportFormat: ReportFormat
    var s3Destination: Destination
    var filterCriteria: js.UndefOr[FilterCriteria]
  }

  object CreateFindingsReportRequest {
    @inline
    def apply(
        reportFormat: ReportFormat,
        s3Destination: Destination,
        filterCriteria: js.UndefOr[FilterCriteria] = js.undefined
    ): CreateFindingsReportRequest = {
      val __obj = js.Dynamic.literal(
        "reportFormat" -> reportFormat.asInstanceOf[js.Any],
        "s3Destination" -> s3Destination.asInstanceOf[js.Any]
      )

      filterCriteria.foreach(__v => __obj.updateDynamic("filterCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFindingsReportRequest]
    }
  }

  @js.native
  trait CreateFindingsReportResponse extends js.Object {
    var reportId: js.UndefOr[ReportId]
  }

  object CreateFindingsReportResponse {
    @inline
    def apply(
        reportId: js.UndefOr[ReportId] = js.undefined
    ): CreateFindingsReportResponse = {
      val __obj = js.Dynamic.literal()
      reportId.foreach(__v => __obj.updateDynamic("reportId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFindingsReportResponse]
    }
  }

  /** The CVSS score for a finding.
    */
  @js.native
  trait CvssScore extends js.Object {
    var baseScore: Double
    var scoringVector: NonEmptyString
    var source: NonEmptyString
    var version: NonEmptyString
  }

  object CvssScore {
    @inline
    def apply(
        baseScore: Double,
        scoringVector: NonEmptyString,
        source: NonEmptyString,
        version: NonEmptyString
    ): CvssScore = {
      val __obj = js.Dynamic.literal(
        "baseScore" -> baseScore.asInstanceOf[js.Any],
        "scoringVector" -> scoringVector.asInstanceOf[js.Any],
        "source" -> source.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CvssScore]
    }
  }

  /** Details on adjustments Amazon Inspector made to the CVSS score for a finding.
    */
  @js.native
  trait CvssScoreAdjustment extends js.Object {
    var metric: NonEmptyString
    var reason: NonEmptyString
  }

  object CvssScoreAdjustment {
    @inline
    def apply(
        metric: NonEmptyString,
        reason: NonEmptyString
    ): CvssScoreAdjustment = {
      val __obj = js.Dynamic.literal(
        "metric" -> metric.asInstanceOf[js.Any],
        "reason" -> reason.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CvssScoreAdjustment]
    }
  }

  /** Information about the CVSS score.
    */
  @js.native
  trait CvssScoreDetails extends js.Object {
    var score: Double
    var scoreSource: NonEmptyString
    var scoringVector: NonEmptyString
    var version: NonEmptyString
    var adjustments: js.UndefOr[CvssScoreAdjustmentList]
    var cvssSource: js.UndefOr[NonEmptyString]
  }

  object CvssScoreDetails {
    @inline
    def apply(
        score: Double,
        scoreSource: NonEmptyString,
        scoringVector: NonEmptyString,
        version: NonEmptyString,
        adjustments: js.UndefOr[CvssScoreAdjustmentList] = js.undefined,
        cvssSource: js.UndefOr[NonEmptyString] = js.undefined
    ): CvssScoreDetails = {
      val __obj = js.Dynamic.literal(
        "score" -> score.asInstanceOf[js.Any],
        "scoreSource" -> scoreSource.asInstanceOf[js.Any],
        "scoringVector" -> scoringVector.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )

      adjustments.foreach(__v => __obj.updateDynamic("adjustments")(__v.asInstanceOf[js.Any]))
      cvssSource.foreach(__v => __obj.updateDynamic("cvssSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CvssScoreDetails]
    }
  }

  /** Contains details on the time range used to filter findings.
    */
  @js.native
  trait DateFilter extends js.Object {
    var endInclusive: js.UndefOr[Timestamp]
    var startInclusive: js.UndefOr[Timestamp]
  }

  object DateFilter {
    @inline
    def apply(
        endInclusive: js.UndefOr[Timestamp] = js.undefined,
        startInclusive: js.UndefOr[Timestamp] = js.undefined
    ): DateFilter = {
      val __obj = js.Dynamic.literal()
      endInclusive.foreach(__v => __obj.updateDynamic("endInclusive")(__v.asInstanceOf[js.Any]))
      startInclusive.foreach(__v => __obj.updateDynamic("startInclusive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DateFilter]
    }
  }

  /** Details of the Amazon Inspector delegated administrator for your organization.
    */
  @js.native
  trait DelegatedAdmin extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var relationshipStatus: js.UndefOr[RelationshipStatus]
  }

  object DelegatedAdmin {
    @inline
    def apply(
        accountId: js.UndefOr[AccountId] = js.undefined,
        relationshipStatus: js.UndefOr[RelationshipStatus] = js.undefined
    ): DelegatedAdmin = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      relationshipStatus.foreach(__v => __obj.updateDynamic("relationshipStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DelegatedAdmin]
    }
  }

  /** Details of the Amazon Inspector delegated administrator for your organization.
    */
  @js.native
  trait DelegatedAdminAccount extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var status: js.UndefOr[DelegatedAdminStatus]
  }

  object DelegatedAdminAccount {
    @inline
    def apply(
        accountId: js.UndefOr[AccountId] = js.undefined,
        status: js.UndefOr[DelegatedAdminStatus] = js.undefined
    ): DelegatedAdminAccount = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DelegatedAdminAccount]
    }
  }

  @js.native
  trait DeleteFilterRequest extends js.Object {
    var arn: FilterArn
  }

  object DeleteFilterRequest {
    @inline
    def apply(
        arn: FilterArn
    ): DeleteFilterRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFilterRequest]
    }
  }

  @js.native
  trait DeleteFilterResponse extends js.Object {
    var arn: FilterArn
  }

  object DeleteFilterResponse {
    @inline
    def apply(
        arn: FilterArn
    ): DeleteFilterResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFilterResponse]
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
    var autoEnable: js.UndefOr[AutoEnable]
    var maxAccountLimitReached: js.UndefOr[Boolean]
  }

  object DescribeOrganizationConfigurationResponse {
    @inline
    def apply(
        autoEnable: js.UndefOr[AutoEnable] = js.undefined,
        maxAccountLimitReached: js.UndefOr[Boolean] = js.undefined
    ): DescribeOrganizationConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      autoEnable.foreach(__v => __obj.updateDynamic("autoEnable")(__v.asInstanceOf[js.Any]))
      maxAccountLimitReached.foreach(__v => __obj.updateDynamic("maxAccountLimitReached")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOrganizationConfigurationResponse]
    }
  }

  /** Contains details of the Amazon S3 bucket and KMS key used to export findings.
    */
  @js.native
  trait Destination extends js.Object {
    var bucketName: String
    var kmsKeyArn: String
    var keyPrefix: js.UndefOr[String]
  }

  object Destination {
    @inline
    def apply(
        bucketName: String,
        kmsKeyArn: String,
        keyPrefix: js.UndefOr[String] = js.undefined
    ): Destination = {
      val __obj = js.Dynamic.literal(
        "bucketName" -> bucketName.asInstanceOf[js.Any],
        "kmsKeyArn" -> kmsKeyArn.asInstanceOf[js.Any]
      )

      keyPrefix.foreach(__v => __obj.updateDynamic("keyPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Destination]
    }
  }

  @js.native
  trait DisableDelegatedAdminAccountRequest extends js.Object {
    var delegatedAdminAccountId: AccountId
  }

  object DisableDelegatedAdminAccountRequest {
    @inline
    def apply(
        delegatedAdminAccountId: AccountId
    ): DisableDelegatedAdminAccountRequest = {
      val __obj = js.Dynamic.literal(
        "delegatedAdminAccountId" -> delegatedAdminAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisableDelegatedAdminAccountRequest]
    }
  }

  @js.native
  trait DisableDelegatedAdminAccountResponse extends js.Object {
    var delegatedAdminAccountId: AccountId
  }

  object DisableDelegatedAdminAccountResponse {
    @inline
    def apply(
        delegatedAdminAccountId: AccountId
    ): DisableDelegatedAdminAccountResponse = {
      val __obj = js.Dynamic.literal(
        "delegatedAdminAccountId" -> delegatedAdminAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisableDelegatedAdminAccountResponse]
    }
  }

  @js.native
  trait DisableRequest extends js.Object {
    var accountIds: js.UndefOr[AccountIdSet]
    var resourceTypes: js.UndefOr[DisableResourceTypeList]
  }

  object DisableRequest {
    @inline
    def apply(
        accountIds: js.UndefOr[AccountIdSet] = js.undefined,
        resourceTypes: js.UndefOr[DisableResourceTypeList] = js.undefined
    ): DisableRequest = {
      val __obj = js.Dynamic.literal()
      accountIds.foreach(__v => __obj.updateDynamic("accountIds")(__v.asInstanceOf[js.Any]))
      resourceTypes.foreach(__v => __obj.updateDynamic("resourceTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisableRequest]
    }
  }

  @js.native
  trait DisableResponse extends js.Object {
    var accounts: AccountList
    var failedAccounts: js.UndefOr[FailedAccountList]
  }

  object DisableResponse {
    @inline
    def apply(
        accounts: AccountList,
        failedAccounts: js.UndefOr[FailedAccountList] = js.undefined
    ): DisableResponse = {
      val __obj = js.Dynamic.literal(
        "accounts" -> accounts.asInstanceOf[js.Any]
      )

      failedAccounts.foreach(__v => __obj.updateDynamic("failedAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisableResponse]
    }
  }

  @js.native
  trait DisassociateMemberRequest extends js.Object {
    var accountId: AccountId
  }

  object DisassociateMemberRequest {
    @inline
    def apply(
        accountId: AccountId
    ): DisassociateMemberRequest = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateMemberRequest]
    }
  }

  @js.native
  trait DisassociateMemberResponse extends js.Object {
    var accountId: AccountId
  }

  object DisassociateMemberResponse {
    @inline
    def apply(
        accountId: AccountId
    ): DisassociateMemberResponse = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateMemberResponse]
    }
  }

  /** The details that define an aggregation based on Amazon EC2 instances.
    */
  @js.native
  trait Ec2InstanceAggregation extends js.Object {
    var amis: js.UndefOr[StringFilterList]
    var instanceIds: js.UndefOr[StringFilterList]
    var instanceTags: js.UndefOr[MapFilterList]
    var operatingSystems: js.UndefOr[StringFilterList]
    var sortBy: js.UndefOr[Ec2InstanceSortBy]
    var sortOrder: js.UndefOr[SortOrder]
  }

  object Ec2InstanceAggregation {
    @inline
    def apply(
        amis: js.UndefOr[StringFilterList] = js.undefined,
        instanceIds: js.UndefOr[StringFilterList] = js.undefined,
        instanceTags: js.UndefOr[MapFilterList] = js.undefined,
        operatingSystems: js.UndefOr[StringFilterList] = js.undefined,
        sortBy: js.UndefOr[Ec2InstanceSortBy] = js.undefined,
        sortOrder: js.UndefOr[SortOrder] = js.undefined
    ): Ec2InstanceAggregation = {
      val __obj = js.Dynamic.literal()
      amis.foreach(__v => __obj.updateDynamic("amis")(__v.asInstanceOf[js.Any]))
      instanceIds.foreach(__v => __obj.updateDynamic("instanceIds")(__v.asInstanceOf[js.Any]))
      instanceTags.foreach(__v => __obj.updateDynamic("instanceTags")(__v.asInstanceOf[js.Any]))
      operatingSystems.foreach(__v => __obj.updateDynamic("operatingSystems")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Ec2InstanceAggregation]
    }
  }

  /** A response that contains the results of a finding aggregation by Amazon EC2 instance.
    */
  @js.native
  trait Ec2InstanceAggregationResponse extends js.Object {
    var instanceId: NonEmptyString
    var accountId: js.UndefOr[String]
    var ami: js.UndefOr[AmiId]
    var instanceTags: js.UndefOr[TagMap]
    var networkFindings: js.UndefOr[Double]
    var operatingSystem: js.UndefOr[String]
    var severityCounts: js.UndefOr[SeverityCounts]
  }

  object Ec2InstanceAggregationResponse {
    @inline
    def apply(
        instanceId: NonEmptyString,
        accountId: js.UndefOr[String] = js.undefined,
        ami: js.UndefOr[AmiId] = js.undefined,
        instanceTags: js.UndefOr[TagMap] = js.undefined,
        networkFindings: js.UndefOr[Double] = js.undefined,
        operatingSystem: js.UndefOr[String] = js.undefined,
        severityCounts: js.UndefOr[SeverityCounts] = js.undefined
    ): Ec2InstanceAggregationResponse = {
      val __obj = js.Dynamic.literal(
        "instanceId" -> instanceId.asInstanceOf[js.Any]
      )

      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      ami.foreach(__v => __obj.updateDynamic("ami")(__v.asInstanceOf[js.Any]))
      instanceTags.foreach(__v => __obj.updateDynamic("instanceTags")(__v.asInstanceOf[js.Any]))
      networkFindings.foreach(__v => __obj.updateDynamic("networkFindings")(__v.asInstanceOf[js.Any]))
      operatingSystem.foreach(__v => __obj.updateDynamic("operatingSystem")(__v.asInstanceOf[js.Any]))
      severityCounts.foreach(__v => __obj.updateDynamic("severityCounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Ec2InstanceAggregationResponse]
    }
  }

  /** Meta data details of an Amazon EC2 instance.
    */
  @js.native
  trait Ec2Metadata extends js.Object {
    var amiId: js.UndefOr[AmiId]
    var platform: js.UndefOr[Ec2Platform]
    var tags: js.UndefOr[TagMap]
  }

  object Ec2Metadata {
    @inline
    def apply(
        amiId: js.UndefOr[AmiId] = js.undefined,
        platform: js.UndefOr[Ec2Platform] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): Ec2Metadata = {
      val __obj = js.Dynamic.literal()
      amiId.foreach(__v => __obj.updateDynamic("amiId")(__v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.updateDynamic("platform")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Ec2Metadata]
    }
  }

  /** Details about the ECR automated re-scan duration setting for your environment.
    */
  @js.native
  trait EcrConfiguration extends js.Object {
    var rescanDuration: EcrRescanDuration
  }

  object EcrConfiguration {
    @inline
    def apply(
        rescanDuration: EcrRescanDuration
    ): EcrConfiguration = {
      val __obj = js.Dynamic.literal(
        "rescanDuration" -> rescanDuration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EcrConfiguration]
    }
  }

  /** Details about the state of the ECR scans for your environment.
    */
  @js.native
  trait EcrConfigurationState extends js.Object {
    var rescanDurationState: js.UndefOr[EcrRescanDurationState]
  }

  object EcrConfigurationState {
    @inline
    def apply(
        rescanDurationState: js.UndefOr[EcrRescanDurationState] = js.undefined
    ): EcrConfigurationState = {
      val __obj = js.Dynamic.literal()
      rescanDurationState.foreach(__v => __obj.updateDynamic("rescanDurationState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EcrConfigurationState]
    }
  }

  /** Information on the Amazon ECR image metadata associated with a finding.
    */
  @js.native
  trait EcrContainerImageMetadata extends js.Object {
    var tags: js.UndefOr[TagList]
  }

  object EcrContainerImageMetadata {
    @inline
    def apply(
        tags: js.UndefOr[TagList] = js.undefined
    ): EcrContainerImageMetadata = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EcrContainerImageMetadata]
    }
  }

  /** Information on the Amazon ECR repository metadata associated with a finding.
    */
  @js.native
  trait EcrRepositoryMetadata extends js.Object {
    var name: js.UndefOr[String]
    var scanFrequency: js.UndefOr[EcrScanFrequency]
  }

  object EcrRepositoryMetadata {
    @inline
    def apply(
        name: js.UndefOr[String] = js.undefined,
        scanFrequency: js.UndefOr[EcrScanFrequency] = js.undefined
    ): EcrRepositoryMetadata = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      scanFrequency.foreach(__v => __obj.updateDynamic("scanFrequency")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EcrRepositoryMetadata]
    }
  }

  /** Details about the state of any changes to the ECR automated re-scan duration setting.
    */
  @js.native
  trait EcrRescanDurationState extends js.Object {
    var rescanDuration: js.UndefOr[EcrRescanDuration]
    var status: js.UndefOr[EcrRescanDurationStatus]
    var updatedAt: js.UndefOr[DateTimeTimestamp]
  }

  object EcrRescanDurationState {
    @inline
    def apply(
        rescanDuration: js.UndefOr[EcrRescanDuration] = js.undefined,
        status: js.UndefOr[EcrRescanDurationStatus] = js.undefined,
        updatedAt: js.UndefOr[DateTimeTimestamp] = js.undefined
    ): EcrRescanDurationState = {
      val __obj = js.Dynamic.literal()
      rescanDuration.foreach(__v => __obj.updateDynamic("rescanDuration")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EcrRescanDurationState]
    }
  }

  @js.native
  trait EnableDelegatedAdminAccountRequest extends js.Object {
    var delegatedAdminAccountId: AccountId
    var clientToken: js.UndefOr[ClientToken]
  }

  object EnableDelegatedAdminAccountRequest {
    @inline
    def apply(
        delegatedAdminAccountId: AccountId,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): EnableDelegatedAdminAccountRequest = {
      val __obj = js.Dynamic.literal(
        "delegatedAdminAccountId" -> delegatedAdminAccountId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableDelegatedAdminAccountRequest]
    }
  }

  @js.native
  trait EnableDelegatedAdminAccountResponse extends js.Object {
    var delegatedAdminAccountId: AccountId
  }

  object EnableDelegatedAdminAccountResponse {
    @inline
    def apply(
        delegatedAdminAccountId: AccountId
    ): EnableDelegatedAdminAccountResponse = {
      val __obj = js.Dynamic.literal(
        "delegatedAdminAccountId" -> delegatedAdminAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EnableDelegatedAdminAccountResponse]
    }
  }

  @js.native
  trait EnableRequest extends js.Object {
    var resourceTypes: EnableResourceTypeList
    var accountIds: js.UndefOr[AccountIdSet]
    var clientToken: js.UndefOr[ClientToken]
  }

  object EnableRequest {
    @inline
    def apply(
        resourceTypes: EnableResourceTypeList,
        accountIds: js.UndefOr[AccountIdSet] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): EnableRequest = {
      val __obj = js.Dynamic.literal(
        "resourceTypes" -> resourceTypes.asInstanceOf[js.Any]
      )

      accountIds.foreach(__v => __obj.updateDynamic("accountIds")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableRequest]
    }
  }

  @js.native
  trait EnableResponse extends js.Object {
    var accounts: AccountList
    var failedAccounts: js.UndefOr[FailedAccountList]
  }

  object EnableResponse {
    @inline
    def apply(
        accounts: AccountList,
        failedAccounts: js.UndefOr[FailedAccountList] = js.undefined
    ): EnableResponse = {
      val __obj = js.Dynamic.literal(
        "accounts" -> accounts.asInstanceOf[js.Any]
      )

      failedAccounts.foreach(__v => __obj.updateDynamic("failedAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableResponse]
    }
  }

  /** The details of an exploit available for a finding discovered in your environment.
    */
  @js.native
  trait ExploitabilityDetails extends js.Object {
    var lastKnownExploitAt: js.UndefOr[DateTimeTimestamp]
  }

  object ExploitabilityDetails {
    @inline
    def apply(
        lastKnownExploitAt: js.UndefOr[DateTimeTimestamp] = js.undefined
    ): ExploitabilityDetails = {
      val __obj = js.Dynamic.literal()
      lastKnownExploitAt.foreach(__v => __obj.updateDynamic("lastKnownExploitAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExploitabilityDetails]
    }
  }

  /** An object with details on why an account failed to enable Amazon Inspector.
    */
  @js.native
  trait FailedAccount extends js.Object {
    var accountId: AccountId
    var errorCode: ErrorCode
    var errorMessage: NonEmptyString
    var resourceStatus: js.UndefOr[ResourceStatus]
    var status: js.UndefOr[Status]
  }

  object FailedAccount {
    @inline
    def apply(
        accountId: AccountId,
        errorCode: ErrorCode,
        errorMessage: NonEmptyString,
        resourceStatus: js.UndefOr[ResourceStatus] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): FailedAccount = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "errorCode" -> errorCode.asInstanceOf[js.Any],
        "errorMessage" -> errorMessage.asInstanceOf[js.Any]
      )

      resourceStatus.foreach(__v => __obj.updateDynamic("resourceStatus")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedAccount]
    }
  }

  /** Details about a filter.
    */
  @js.native
  trait Filter extends js.Object {
    var action: FilterAction
    var arn: FilterArn
    var createdAt: DateTimeTimestamp
    var criteria: FilterCriteria
    var name: FilterName
    var ownerId: OwnerId
    var updatedAt: DateTimeTimestamp
    var description: js.UndefOr[FilterDescription]
    var reason: js.UndefOr[FilterReason]
    var tags: js.UndefOr[TagMap]
  }

  object Filter {
    @inline
    def apply(
        action: FilterAction,
        arn: FilterArn,
        createdAt: DateTimeTimestamp,
        criteria: FilterCriteria,
        name: FilterName,
        ownerId: OwnerId,
        updatedAt: DateTimeTimestamp,
        description: js.UndefOr[FilterDescription] = js.undefined,
        reason: js.UndefOr[FilterReason] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): Filter = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any],
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "criteria" -> criteria.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "ownerId" -> ownerId.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
  }

  /** Details on the criteria used to define the filter.
    */
  @js.native
  trait FilterCriteria extends js.Object {
    var awsAccountId: js.UndefOr[StringFilterList]
    var componentId: js.UndefOr[StringFilterList]
    var componentType: js.UndefOr[StringFilterList]
    var ec2InstanceImageId: js.UndefOr[StringFilterList]
    var ec2InstanceSubnetId: js.UndefOr[StringFilterList]
    var ec2InstanceVpcId: js.UndefOr[StringFilterList]
    var ecrImageArchitecture: js.UndefOr[StringFilterList]
    var ecrImageHash: js.UndefOr[StringFilterList]
    var ecrImagePushedAt: js.UndefOr[DateFilterList]
    var ecrImageRegistry: js.UndefOr[StringFilterList]
    var ecrImageRepositoryName: js.UndefOr[StringFilterList]
    var ecrImageTags: js.UndefOr[StringFilterList]
    var exploitAvailable: js.UndefOr[StringFilterList]
    var findingArn: js.UndefOr[StringFilterList]
    var findingStatus: js.UndefOr[StringFilterList]
    var findingType: js.UndefOr[StringFilterList]
    var firstObservedAt: js.UndefOr[DateFilterList]
    var fixAvailable: js.UndefOr[StringFilterList]
    var inspectorScore: js.UndefOr[NumberFilterList]
    var lambdaFunctionExecutionRoleArn: js.UndefOr[StringFilterList]
    var lambdaFunctionLastModifiedAt: js.UndefOr[DateFilterList]
    var lambdaFunctionLayers: js.UndefOr[StringFilterList]
    var lambdaFunctionName: js.UndefOr[StringFilterList]
    var lambdaFunctionRuntime: js.UndefOr[StringFilterList]
    var lastObservedAt: js.UndefOr[DateFilterList]
    var networkProtocol: js.UndefOr[StringFilterList]
    var portRange: js.UndefOr[PortRangeFilterList]
    var relatedVulnerabilities: js.UndefOr[StringFilterList]
    var resourceId: js.UndefOr[StringFilterList]
    var resourceTags: js.UndefOr[MapFilterList]
    var resourceType: js.UndefOr[StringFilterList]
    var severity: js.UndefOr[StringFilterList]
    var title: js.UndefOr[StringFilterList]
    var updatedAt: js.UndefOr[DateFilterList]
    var vendorSeverity: js.UndefOr[StringFilterList]
    var vulnerabilityId: js.UndefOr[StringFilterList]
    var vulnerabilitySource: js.UndefOr[StringFilterList]
    var vulnerablePackages: js.UndefOr[PackageFilterList]
  }

  object FilterCriteria {
    @inline
    def apply(
        awsAccountId: js.UndefOr[StringFilterList] = js.undefined,
        componentId: js.UndefOr[StringFilterList] = js.undefined,
        componentType: js.UndefOr[StringFilterList] = js.undefined,
        ec2InstanceImageId: js.UndefOr[StringFilterList] = js.undefined,
        ec2InstanceSubnetId: js.UndefOr[StringFilterList] = js.undefined,
        ec2InstanceVpcId: js.UndefOr[StringFilterList] = js.undefined,
        ecrImageArchitecture: js.UndefOr[StringFilterList] = js.undefined,
        ecrImageHash: js.UndefOr[StringFilterList] = js.undefined,
        ecrImagePushedAt: js.UndefOr[DateFilterList] = js.undefined,
        ecrImageRegistry: js.UndefOr[StringFilterList] = js.undefined,
        ecrImageRepositoryName: js.UndefOr[StringFilterList] = js.undefined,
        ecrImageTags: js.UndefOr[StringFilterList] = js.undefined,
        exploitAvailable: js.UndefOr[StringFilterList] = js.undefined,
        findingArn: js.UndefOr[StringFilterList] = js.undefined,
        findingStatus: js.UndefOr[StringFilterList] = js.undefined,
        findingType: js.UndefOr[StringFilterList] = js.undefined,
        firstObservedAt: js.UndefOr[DateFilterList] = js.undefined,
        fixAvailable: js.UndefOr[StringFilterList] = js.undefined,
        inspectorScore: js.UndefOr[NumberFilterList] = js.undefined,
        lambdaFunctionExecutionRoleArn: js.UndefOr[StringFilterList] = js.undefined,
        lambdaFunctionLastModifiedAt: js.UndefOr[DateFilterList] = js.undefined,
        lambdaFunctionLayers: js.UndefOr[StringFilterList] = js.undefined,
        lambdaFunctionName: js.UndefOr[StringFilterList] = js.undefined,
        lambdaFunctionRuntime: js.UndefOr[StringFilterList] = js.undefined,
        lastObservedAt: js.UndefOr[DateFilterList] = js.undefined,
        networkProtocol: js.UndefOr[StringFilterList] = js.undefined,
        portRange: js.UndefOr[PortRangeFilterList] = js.undefined,
        relatedVulnerabilities: js.UndefOr[StringFilterList] = js.undefined,
        resourceId: js.UndefOr[StringFilterList] = js.undefined,
        resourceTags: js.UndefOr[MapFilterList] = js.undefined,
        resourceType: js.UndefOr[StringFilterList] = js.undefined,
        severity: js.UndefOr[StringFilterList] = js.undefined,
        title: js.UndefOr[StringFilterList] = js.undefined,
        updatedAt: js.UndefOr[DateFilterList] = js.undefined,
        vendorSeverity: js.UndefOr[StringFilterList] = js.undefined,
        vulnerabilityId: js.UndefOr[StringFilterList] = js.undefined,
        vulnerabilitySource: js.UndefOr[StringFilterList] = js.undefined,
        vulnerablePackages: js.UndefOr[PackageFilterList] = js.undefined
    ): FilterCriteria = {
      val __obj = js.Dynamic.literal()
      awsAccountId.foreach(__v => __obj.updateDynamic("awsAccountId")(__v.asInstanceOf[js.Any]))
      componentId.foreach(__v => __obj.updateDynamic("componentId")(__v.asInstanceOf[js.Any]))
      componentType.foreach(__v => __obj.updateDynamic("componentType")(__v.asInstanceOf[js.Any]))
      ec2InstanceImageId.foreach(__v => __obj.updateDynamic("ec2InstanceImageId")(__v.asInstanceOf[js.Any]))
      ec2InstanceSubnetId.foreach(__v => __obj.updateDynamic("ec2InstanceSubnetId")(__v.asInstanceOf[js.Any]))
      ec2InstanceVpcId.foreach(__v => __obj.updateDynamic("ec2InstanceVpcId")(__v.asInstanceOf[js.Any]))
      ecrImageArchitecture.foreach(__v => __obj.updateDynamic("ecrImageArchitecture")(__v.asInstanceOf[js.Any]))
      ecrImageHash.foreach(__v => __obj.updateDynamic("ecrImageHash")(__v.asInstanceOf[js.Any]))
      ecrImagePushedAt.foreach(__v => __obj.updateDynamic("ecrImagePushedAt")(__v.asInstanceOf[js.Any]))
      ecrImageRegistry.foreach(__v => __obj.updateDynamic("ecrImageRegistry")(__v.asInstanceOf[js.Any]))
      ecrImageRepositoryName.foreach(__v => __obj.updateDynamic("ecrImageRepositoryName")(__v.asInstanceOf[js.Any]))
      ecrImageTags.foreach(__v => __obj.updateDynamic("ecrImageTags")(__v.asInstanceOf[js.Any]))
      exploitAvailable.foreach(__v => __obj.updateDynamic("exploitAvailable")(__v.asInstanceOf[js.Any]))
      findingArn.foreach(__v => __obj.updateDynamic("findingArn")(__v.asInstanceOf[js.Any]))
      findingStatus.foreach(__v => __obj.updateDynamic("findingStatus")(__v.asInstanceOf[js.Any]))
      findingType.foreach(__v => __obj.updateDynamic("findingType")(__v.asInstanceOf[js.Any]))
      firstObservedAt.foreach(__v => __obj.updateDynamic("firstObservedAt")(__v.asInstanceOf[js.Any]))
      fixAvailable.foreach(__v => __obj.updateDynamic("fixAvailable")(__v.asInstanceOf[js.Any]))
      inspectorScore.foreach(__v => __obj.updateDynamic("inspectorScore")(__v.asInstanceOf[js.Any]))
      lambdaFunctionExecutionRoleArn.foreach(__v => __obj.updateDynamic("lambdaFunctionExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      lambdaFunctionLastModifiedAt.foreach(__v => __obj.updateDynamic("lambdaFunctionLastModifiedAt")(__v.asInstanceOf[js.Any]))
      lambdaFunctionLayers.foreach(__v => __obj.updateDynamic("lambdaFunctionLayers")(__v.asInstanceOf[js.Any]))
      lambdaFunctionName.foreach(__v => __obj.updateDynamic("lambdaFunctionName")(__v.asInstanceOf[js.Any]))
      lambdaFunctionRuntime.foreach(__v => __obj.updateDynamic("lambdaFunctionRuntime")(__v.asInstanceOf[js.Any]))
      lastObservedAt.foreach(__v => __obj.updateDynamic("lastObservedAt")(__v.asInstanceOf[js.Any]))
      networkProtocol.foreach(__v => __obj.updateDynamic("networkProtocol")(__v.asInstanceOf[js.Any]))
      portRange.foreach(__v => __obj.updateDynamic("portRange")(__v.asInstanceOf[js.Any]))
      relatedVulnerabilities.foreach(__v => __obj.updateDynamic("relatedVulnerabilities")(__v.asInstanceOf[js.Any]))
      resourceId.foreach(__v => __obj.updateDynamic("resourceId")(__v.asInstanceOf[js.Any]))
      resourceTags.foreach(__v => __obj.updateDynamic("resourceTags")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      severity.foreach(__v => __obj.updateDynamic("severity")(__v.asInstanceOf[js.Any]))
      title.foreach(__v => __obj.updateDynamic("title")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      vendorSeverity.foreach(__v => __obj.updateDynamic("vendorSeverity")(__v.asInstanceOf[js.Any]))
      vulnerabilityId.foreach(__v => __obj.updateDynamic("vulnerabilityId")(__v.asInstanceOf[js.Any]))
      vulnerabilitySource.foreach(__v => __obj.updateDynamic("vulnerabilitySource")(__v.asInstanceOf[js.Any]))
      vulnerablePackages.foreach(__v => __obj.updateDynamic("vulnerablePackages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterCriteria]
    }
  }

  /** Details about an Amazon Inspector finding.
    */
  @js.native
  trait Finding extends js.Object {
    var awsAccountId: AccountId
    var description: FindingDescription
    var findingArn: FindingArn
    var firstObservedAt: DateTimeTimestamp
    var lastObservedAt: DateTimeTimestamp
    var remediation: Remediation
    var resources: ResourceList
    var severity: Severity
    var status: FindingStatus
    var `type`: FindingType
    var exploitAvailable: js.UndefOr[ExploitAvailable]
    var exploitabilityDetails: js.UndefOr[ExploitabilityDetails]
    var fixAvailable: js.UndefOr[FixAvailable]
    var inspectorScore: js.UndefOr[Double]
    var inspectorScoreDetails: js.UndefOr[InspectorScoreDetails]
    var networkReachabilityDetails: js.UndefOr[NetworkReachabilityDetails]
    var packageVulnerabilityDetails: js.UndefOr[PackageVulnerabilityDetails]
    var title: js.UndefOr[FindingTitle]
    var updatedAt: js.UndefOr[DateTimeTimestamp]
  }

  object Finding {
    @inline
    def apply(
        awsAccountId: AccountId,
        description: FindingDescription,
        findingArn: FindingArn,
        firstObservedAt: DateTimeTimestamp,
        lastObservedAt: DateTimeTimestamp,
        remediation: Remediation,
        resources: ResourceList,
        severity: Severity,
        status: FindingStatus,
        `type`: FindingType,
        exploitAvailable: js.UndefOr[ExploitAvailable] = js.undefined,
        exploitabilityDetails: js.UndefOr[ExploitabilityDetails] = js.undefined,
        fixAvailable: js.UndefOr[FixAvailable] = js.undefined,
        inspectorScore: js.UndefOr[Double] = js.undefined,
        inspectorScoreDetails: js.UndefOr[InspectorScoreDetails] = js.undefined,
        networkReachabilityDetails: js.UndefOr[NetworkReachabilityDetails] = js.undefined,
        packageVulnerabilityDetails: js.UndefOr[PackageVulnerabilityDetails] = js.undefined,
        title: js.UndefOr[FindingTitle] = js.undefined,
        updatedAt: js.UndefOr[DateTimeTimestamp] = js.undefined
    ): Finding = {
      val __obj = js.Dynamic.literal(
        "awsAccountId" -> awsAccountId.asInstanceOf[js.Any],
        "description" -> description.asInstanceOf[js.Any],
        "findingArn" -> findingArn.asInstanceOf[js.Any],
        "firstObservedAt" -> firstObservedAt.asInstanceOf[js.Any],
        "lastObservedAt" -> lastObservedAt.asInstanceOf[js.Any],
        "remediation" -> remediation.asInstanceOf[js.Any],
        "resources" -> resources.asInstanceOf[js.Any],
        "severity" -> severity.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      exploitAvailable.foreach(__v => __obj.updateDynamic("exploitAvailable")(__v.asInstanceOf[js.Any]))
      exploitabilityDetails.foreach(__v => __obj.updateDynamic("exploitabilityDetails")(__v.asInstanceOf[js.Any]))
      fixAvailable.foreach(__v => __obj.updateDynamic("fixAvailable")(__v.asInstanceOf[js.Any]))
      inspectorScore.foreach(__v => __obj.updateDynamic("inspectorScore")(__v.asInstanceOf[js.Any]))
      inspectorScoreDetails.foreach(__v => __obj.updateDynamic("inspectorScoreDetails")(__v.asInstanceOf[js.Any]))
      networkReachabilityDetails.foreach(__v => __obj.updateDynamic("networkReachabilityDetails")(__v.asInstanceOf[js.Any]))
      packageVulnerabilityDetails.foreach(__v => __obj.updateDynamic("packageVulnerabilityDetails")(__v.asInstanceOf[js.Any]))
      title.foreach(__v => __obj.updateDynamic("title")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Finding]
    }
  }

  /** The details that define an aggregation based on finding type.
    */
  @js.native
  trait FindingTypeAggregation extends js.Object {
    var findingType: js.UndefOr[AggregationFindingType]
    var resourceType: js.UndefOr[AggregationResourceType]
    var sortBy: js.UndefOr[FindingTypeSortBy]
    var sortOrder: js.UndefOr[SortOrder]
  }

  object FindingTypeAggregation {
    @inline
    def apply(
        findingType: js.UndefOr[AggregationFindingType] = js.undefined,
        resourceType: js.UndefOr[AggregationResourceType] = js.undefined,
        sortBy: js.UndefOr[FindingTypeSortBy] = js.undefined,
        sortOrder: js.UndefOr[SortOrder] = js.undefined
    ): FindingTypeAggregation = {
      val __obj = js.Dynamic.literal()
      findingType.foreach(__v => __obj.updateDynamic("findingType")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingTypeAggregation]
    }
  }

  /** A response that contains the results of a finding type aggregation.
    */
  @js.native
  trait FindingTypeAggregationResponse extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var severityCounts: js.UndefOr[SeverityCounts]
  }

  object FindingTypeAggregationResponse {
    @inline
    def apply(
        accountId: js.UndefOr[AccountId] = js.undefined,
        severityCounts: js.UndefOr[SeverityCounts] = js.undefined
    ): FindingTypeAggregationResponse = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      severityCounts.foreach(__v => __obj.updateDynamic("severityCounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingTypeAggregationResponse]
    }
  }

  /** Information about the Amazon Inspector free trial for an account.
    */
  @js.native
  trait FreeTrialAccountInfo extends js.Object {
    var accountId: MeteringAccountId
    var freeTrialInfo: FreeTrialInfoList
  }

  object FreeTrialAccountInfo {
    @inline
    def apply(
        accountId: MeteringAccountId,
        freeTrialInfo: FreeTrialInfoList
    ): FreeTrialAccountInfo = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "freeTrialInfo" -> freeTrialInfo.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FreeTrialAccountInfo]
    }
  }

  /** An object that contains information about the Amazon Inspector free trial for an account.
    */
  @js.native
  trait FreeTrialInfo extends js.Object {
    var end: Timestamp
    var start: Timestamp
    var status: FreeTrialStatus
    var `type`: FreeTrialType
  }

  object FreeTrialInfo {
    @inline
    def apply(
        end: Timestamp,
        start: Timestamp,
        status: FreeTrialStatus,
        `type`: FreeTrialType
    ): FreeTrialInfo = {
      val __obj = js.Dynamic.literal(
        "end" -> end.asInstanceOf[js.Any],
        "start" -> start.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FreeTrialInfo]
    }
  }

  /** Information about an error received while accessing free trail data for an account.
    */
  @js.native
  trait FreeTrialInfoError extends js.Object {
    var accountId: MeteringAccountId
    var code: FreeTrialInfoErrorCode
    var message: String
  }

  object FreeTrialInfoError {
    @inline
    def apply(
        accountId: MeteringAccountId,
        code: FreeTrialInfoErrorCode,
        message: String
    ): FreeTrialInfoError = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "code" -> code.asInstanceOf[js.Any],
        "message" -> message.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FreeTrialInfoError]
    }
  }

  @js.native
  trait GetConfigurationRequest extends js.Object

  object GetConfigurationRequest {
    @inline
    def apply(): GetConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetConfigurationRequest]
    }
  }

  @js.native
  trait GetConfigurationResponse extends js.Object {
    var ecrConfiguration: js.UndefOr[EcrConfigurationState]
  }

  object GetConfigurationResponse {
    @inline
    def apply(
        ecrConfiguration: js.UndefOr[EcrConfigurationState] = js.undefined
    ): GetConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      ecrConfiguration.foreach(__v => __obj.updateDynamic("ecrConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConfigurationResponse]
    }
  }

  @js.native
  trait GetDelegatedAdminAccountRequest extends js.Object

  object GetDelegatedAdminAccountRequest {
    @inline
    def apply(): GetDelegatedAdminAccountRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetDelegatedAdminAccountRequest]
    }
  }

  @js.native
  trait GetDelegatedAdminAccountResponse extends js.Object {
    var delegatedAdmin: js.UndefOr[DelegatedAdmin]
  }

  object GetDelegatedAdminAccountResponse {
    @inline
    def apply(
        delegatedAdmin: js.UndefOr[DelegatedAdmin] = js.undefined
    ): GetDelegatedAdminAccountResponse = {
      val __obj = js.Dynamic.literal()
      delegatedAdmin.foreach(__v => __obj.updateDynamic("delegatedAdmin")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDelegatedAdminAccountResponse]
    }
  }

  @js.native
  trait GetFindingsReportStatusRequest extends js.Object {
    var reportId: js.UndefOr[ReportId]
  }

  object GetFindingsReportStatusRequest {
    @inline
    def apply(
        reportId: js.UndefOr[ReportId] = js.undefined
    ): GetFindingsReportStatusRequest = {
      val __obj = js.Dynamic.literal()
      reportId.foreach(__v => __obj.updateDynamic("reportId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFindingsReportStatusRequest]
    }
  }

  @js.native
  trait GetFindingsReportStatusResponse extends js.Object {
    var destination: js.UndefOr[Destination]
    var errorCode: js.UndefOr[ReportingErrorCode]
    var errorMessage: js.UndefOr[ErrorMessage]
    var filterCriteria: js.UndefOr[FilterCriteria]
    var reportId: js.UndefOr[ReportId]
    var status: js.UndefOr[ExternalReportStatus]
  }

  object GetFindingsReportStatusResponse {
    @inline
    def apply(
        destination: js.UndefOr[Destination] = js.undefined,
        errorCode: js.UndefOr[ReportingErrorCode] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        filterCriteria: js.UndefOr[FilterCriteria] = js.undefined,
        reportId: js.UndefOr[ReportId] = js.undefined,
        status: js.UndefOr[ExternalReportStatus] = js.undefined
    ): GetFindingsReportStatusResponse = {
      val __obj = js.Dynamic.literal()
      destination.foreach(__v => __obj.updateDynamic("destination")(__v.asInstanceOf[js.Any]))
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      filterCriteria.foreach(__v => __obj.updateDynamic("filterCriteria")(__v.asInstanceOf[js.Any]))
      reportId.foreach(__v => __obj.updateDynamic("reportId")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFindingsReportStatusResponse]
    }
  }

  @js.native
  trait GetMemberRequest extends js.Object {
    var accountId: AccountId
  }

  object GetMemberRequest {
    @inline
    def apply(
        accountId: AccountId
    ): GetMemberRequest = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMemberRequest]
    }
  }

  @js.native
  trait GetMemberResponse extends js.Object {
    var member: js.UndefOr[Member]
  }

  object GetMemberResponse {
    @inline
    def apply(
        member: js.UndefOr[Member] = js.undefined
    ): GetMemberResponse = {
      val __obj = js.Dynamic.literal()
      member.foreach(__v => __obj.updateDynamic("member")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMemberResponse]
    }
  }

  /** The details that define an aggregation based on container image layers.
    */
  @js.native
  trait ImageLayerAggregation extends js.Object {
    var layerHashes: js.UndefOr[StringFilterList]
    var repositories: js.UndefOr[StringFilterList]
    var resourceIds: js.UndefOr[StringFilterList]
    var sortBy: js.UndefOr[ImageLayerSortBy]
    var sortOrder: js.UndefOr[SortOrder]
  }

  object ImageLayerAggregation {
    @inline
    def apply(
        layerHashes: js.UndefOr[StringFilterList] = js.undefined,
        repositories: js.UndefOr[StringFilterList] = js.undefined,
        resourceIds: js.UndefOr[StringFilterList] = js.undefined,
        sortBy: js.UndefOr[ImageLayerSortBy] = js.undefined,
        sortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ImageLayerAggregation = {
      val __obj = js.Dynamic.literal()
      layerHashes.foreach(__v => __obj.updateDynamic("layerHashes")(__v.asInstanceOf[js.Any]))
      repositories.foreach(__v => __obj.updateDynamic("repositories")(__v.asInstanceOf[js.Any]))
      resourceIds.foreach(__v => __obj.updateDynamic("resourceIds")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageLayerAggregation]
    }
  }

  /** A response that contains the results of a finding aggregation by image layer.
    */
  @js.native
  trait ImageLayerAggregationResponse extends js.Object {
    var accountId: AccountId
    var layerHash: NonEmptyString
    var repository: NonEmptyString
    var resourceId: NonEmptyString
    var severityCounts: js.UndefOr[SeverityCounts]
  }

  object ImageLayerAggregationResponse {
    @inline
    def apply(
        accountId: AccountId,
        layerHash: NonEmptyString,
        repository: NonEmptyString,
        resourceId: NonEmptyString,
        severityCounts: js.UndefOr[SeverityCounts] = js.undefined
    ): ImageLayerAggregationResponse = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "layerHash" -> layerHash.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any]
      )

      severityCounts.foreach(__v => __obj.updateDynamic("severityCounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageLayerAggregationResponse]
    }
  }

  /** Information about the Amazon Inspector score given to a finding.
    */
  @js.native
  trait InspectorScoreDetails extends js.Object {
    var adjustedCvss: js.UndefOr[CvssScoreDetails]
  }

  object InspectorScoreDetails {
    @inline
    def apply(
        adjustedCvss: js.UndefOr[CvssScoreDetails] = js.undefined
    ): InspectorScoreDetails = {
      val __obj = js.Dynamic.literal()
      adjustedCvss.foreach(__v => __obj.updateDynamic("adjustedCvss")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InspectorScoreDetails]
    }
  }

  /** The details that define a findings aggregation based on AWS Lambda functions.
    */
  @js.native
  trait LambdaFunctionAggregation extends js.Object {
    var functionNames: js.UndefOr[StringFilterList]
    var functionTags: js.UndefOr[MapFilterList]
    var resourceIds: js.UndefOr[StringFilterList]
    var runtimes: js.UndefOr[StringFilterList]
    var sortBy: js.UndefOr[LambdaFunctionSortBy]
    var sortOrder: js.UndefOr[SortOrder]
  }

  object LambdaFunctionAggregation {
    @inline
    def apply(
        functionNames: js.UndefOr[StringFilterList] = js.undefined,
        functionTags: js.UndefOr[MapFilterList] = js.undefined,
        resourceIds: js.UndefOr[StringFilterList] = js.undefined,
        runtimes: js.UndefOr[StringFilterList] = js.undefined,
        sortBy: js.UndefOr[LambdaFunctionSortBy] = js.undefined,
        sortOrder: js.UndefOr[SortOrder] = js.undefined
    ): LambdaFunctionAggregation = {
      val __obj = js.Dynamic.literal()
      functionNames.foreach(__v => __obj.updateDynamic("functionNames")(__v.asInstanceOf[js.Any]))
      functionTags.foreach(__v => __obj.updateDynamic("functionTags")(__v.asInstanceOf[js.Any]))
      resourceIds.foreach(__v => __obj.updateDynamic("resourceIds")(__v.asInstanceOf[js.Any]))
      runtimes.foreach(__v => __obj.updateDynamic("runtimes")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionAggregation]
    }
  }

  /** A response that contains the results of an AWS Lambda function finding aggregation.
    */
  @js.native
  trait LambdaFunctionAggregationResponse extends js.Object {
    var resourceId: NonEmptyString
    var accountId: js.UndefOr[AccountId]
    var functionName: js.UndefOr[String]
    var lambdaTags: js.UndefOr[TagMap]
    var lastModifiedAt: js.UndefOr[DateTimeTimestamp]
    var runtime: js.UndefOr[String]
    var severityCounts: js.UndefOr[SeverityCounts]
  }

  object LambdaFunctionAggregationResponse {
    @inline
    def apply(
        resourceId: NonEmptyString,
        accountId: js.UndefOr[AccountId] = js.undefined,
        functionName: js.UndefOr[String] = js.undefined,
        lambdaTags: js.UndefOr[TagMap] = js.undefined,
        lastModifiedAt: js.UndefOr[DateTimeTimestamp] = js.undefined,
        runtime: js.UndefOr[String] = js.undefined,
        severityCounts: js.UndefOr[SeverityCounts] = js.undefined
    ): LambdaFunctionAggregationResponse = {
      val __obj = js.Dynamic.literal(
        "resourceId" -> resourceId.asInstanceOf[js.Any]
      )

      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      functionName.foreach(__v => __obj.updateDynamic("functionName")(__v.asInstanceOf[js.Any]))
      lambdaTags.foreach(__v => __obj.updateDynamic("lambdaTags")(__v.asInstanceOf[js.Any]))
      lastModifiedAt.foreach(__v => __obj.updateDynamic("lastModifiedAt")(__v.asInstanceOf[js.Any]))
      runtime.foreach(__v => __obj.updateDynamic("runtime")(__v.asInstanceOf[js.Any]))
      severityCounts.foreach(__v => __obj.updateDynamic("severityCounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionAggregationResponse]
    }
  }

  /** The AWS Lambda function metadata.
    */
  @js.native
  trait LambdaFunctionMetadata extends js.Object {
    var functionName: js.UndefOr[String]
    var functionTags: js.UndefOr[TagMap]
    var layers: js.UndefOr[LambdaLayerList]
    var runtime: js.UndefOr[Runtime]
  }

  object LambdaFunctionMetadata {
    @inline
    def apply(
        functionName: js.UndefOr[String] = js.undefined,
        functionTags: js.UndefOr[TagMap] = js.undefined,
        layers: js.UndefOr[LambdaLayerList] = js.undefined,
        runtime: js.UndefOr[Runtime] = js.undefined
    ): LambdaFunctionMetadata = {
      val __obj = js.Dynamic.literal()
      functionName.foreach(__v => __obj.updateDynamic("functionName")(__v.asInstanceOf[js.Any]))
      functionTags.foreach(__v => __obj.updateDynamic("functionTags")(__v.asInstanceOf[js.Any]))
      layers.foreach(__v => __obj.updateDynamic("layers")(__v.asInstanceOf[js.Any]))
      runtime.foreach(__v => __obj.updateDynamic("runtime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionMetadata]
    }
  }

  /** The details that define a findings aggregation based on an AWS Lambda function's layers.
    */
  @js.native
  trait LambdaLayerAggregation extends js.Object {
    var functionNames: js.UndefOr[StringFilterList]
    var layerArns: js.UndefOr[StringFilterList]
    var resourceIds: js.UndefOr[StringFilterList]
    var sortBy: js.UndefOr[LambdaLayerSortBy]
    var sortOrder: js.UndefOr[SortOrder]
  }

  object LambdaLayerAggregation {
    @inline
    def apply(
        functionNames: js.UndefOr[StringFilterList] = js.undefined,
        layerArns: js.UndefOr[StringFilterList] = js.undefined,
        resourceIds: js.UndefOr[StringFilterList] = js.undefined,
        sortBy: js.UndefOr[LambdaLayerSortBy] = js.undefined,
        sortOrder: js.UndefOr[SortOrder] = js.undefined
    ): LambdaLayerAggregation = {
      val __obj = js.Dynamic.literal()
      functionNames.foreach(__v => __obj.updateDynamic("functionNames")(__v.asInstanceOf[js.Any]))
      layerArns.foreach(__v => __obj.updateDynamic("layerArns")(__v.asInstanceOf[js.Any]))
      resourceIds.foreach(__v => __obj.updateDynamic("resourceIds")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaLayerAggregation]
    }
  }

  /** A response that contains the results of an AWS Lambda function layer finding aggregation.
    */
  @js.native
  trait LambdaLayerAggregationResponse extends js.Object {
    var accountId: AccountId
    var functionName: NonEmptyString
    var layerArn: NonEmptyString
    var resourceId: NonEmptyString
    var severityCounts: js.UndefOr[SeverityCounts]
  }

  object LambdaLayerAggregationResponse {
    @inline
    def apply(
        accountId: AccountId,
        functionName: NonEmptyString,
        layerArn: NonEmptyString,
        resourceId: NonEmptyString,
        severityCounts: js.UndefOr[SeverityCounts] = js.undefined
    ): LambdaLayerAggregationResponse = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "functionName" -> functionName.asInstanceOf[js.Any],
        "layerArn" -> layerArn.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any]
      )

      severityCounts.foreach(__v => __obj.updateDynamic("severityCounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaLayerAggregationResponse]
    }
  }

  /** The VPC security groups and subnets that are attached to an AWS Lambda function. For more information, see [[https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html|VPC Settings]].
    */
  @js.native
  trait LambdaVpcConfig extends js.Object {
    var securityGroupIds: js.UndefOr[SecurityGroupIdList]
    var subnetIds: js.UndefOr[SubnetIdList]
    var vpcId: js.UndefOr[VpcId]
  }

  object LambdaVpcConfig {
    @inline
    def apply(
        securityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined,
        subnetIds: js.UndefOr[SubnetIdList] = js.undefined,
        vpcId: js.UndefOr[VpcId] = js.undefined
    ): LambdaVpcConfig = {
      val __obj = js.Dynamic.literal()
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.updateDynamic("subnetIds")(__v.asInstanceOf[js.Any]))
      vpcId.foreach(__v => __obj.updateDynamic("vpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaVpcConfig]
    }
  }

  @js.native
  trait ListAccountPermissionsRequest extends js.Object {
    var maxResults: js.UndefOr[ListAccountPermissionsMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var service: js.UndefOr[Service]
  }

  object ListAccountPermissionsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListAccountPermissionsMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        service: js.UndefOr[Service] = js.undefined
    ): ListAccountPermissionsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      service.foreach(__v => __obj.updateDynamic("service")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountPermissionsRequest]
    }
  }

  @js.native
  trait ListAccountPermissionsResponse extends js.Object {
    var permissions: Permissions
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAccountPermissionsResponse {
    @inline
    def apply(
        permissions: Permissions,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAccountPermissionsResponse = {
      val __obj = js.Dynamic.literal(
        "permissions" -> permissions.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountPermissionsResponse]
    }
  }

  @js.native
  trait ListCoverageRequest extends js.Object {
    var filterCriteria: js.UndefOr[CoverageFilterCriteria]
    var maxResults: js.UndefOr[ListCoverageMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListCoverageRequest {
    @inline
    def apply(
        filterCriteria: js.UndefOr[CoverageFilterCriteria] = js.undefined,
        maxResults: js.UndefOr[ListCoverageMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCoverageRequest = {
      val __obj = js.Dynamic.literal()
      filterCriteria.foreach(__v => __obj.updateDynamic("filterCriteria")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCoverageRequest]
    }
  }

  @js.native
  trait ListCoverageResponse extends js.Object {
    var coveredResources: js.UndefOr[CoveredResources]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListCoverageResponse {
    @inline
    def apply(
        coveredResources: js.UndefOr[CoveredResources] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCoverageResponse = {
      val __obj = js.Dynamic.literal()
      coveredResources.foreach(__v => __obj.updateDynamic("coveredResources")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCoverageResponse]
    }
  }

  @js.native
  trait ListCoverageStatisticsRequest extends js.Object {
    var filterCriteria: js.UndefOr[CoverageFilterCriteria]
    var groupBy: js.UndefOr[GroupKey]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListCoverageStatisticsRequest {
    @inline
    def apply(
        filterCriteria: js.UndefOr[CoverageFilterCriteria] = js.undefined,
        groupBy: js.UndefOr[GroupKey] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCoverageStatisticsRequest = {
      val __obj = js.Dynamic.literal()
      filterCriteria.foreach(__v => __obj.updateDynamic("filterCriteria")(__v.asInstanceOf[js.Any]))
      groupBy.foreach(__v => __obj.updateDynamic("groupBy")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCoverageStatisticsRequest]
    }
  }

  @js.native
  trait ListCoverageStatisticsResponse extends js.Object {
    var totalCounts: Double
    var countsByGroup: js.UndefOr[CountsList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListCoverageStatisticsResponse {
    @inline
    def apply(
        totalCounts: Double,
        countsByGroup: js.UndefOr[CountsList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCoverageStatisticsResponse = {
      val __obj = js.Dynamic.literal(
        "totalCounts" -> totalCounts.asInstanceOf[js.Any]
      )

      countsByGroup.foreach(__v => __obj.updateDynamic("countsByGroup")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCoverageStatisticsResponse]
    }
  }

  @js.native
  trait ListDelegatedAdminAccountsRequest extends js.Object {
    var maxResults: js.UndefOr[ListDelegatedAdminMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDelegatedAdminAccountsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListDelegatedAdminMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDelegatedAdminAccountsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDelegatedAdminAccountsRequest]
    }
  }

  @js.native
  trait ListDelegatedAdminAccountsResponse extends js.Object {
    var delegatedAdminAccounts: js.UndefOr[DelegatedAdminAccountList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDelegatedAdminAccountsResponse {
    @inline
    def apply(
        delegatedAdminAccounts: js.UndefOr[DelegatedAdminAccountList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDelegatedAdminAccountsResponse = {
      val __obj = js.Dynamic.literal()
      delegatedAdminAccounts.foreach(__v => __obj.updateDynamic("delegatedAdminAccounts")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDelegatedAdminAccountsResponse]
    }
  }

  @js.native
  trait ListFiltersRequest extends js.Object {
    var action: js.UndefOr[FilterAction]
    var arns: js.UndefOr[FilterArnList]
    var maxResults: js.UndefOr[ListFilterMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListFiltersRequest {
    @inline
    def apply(
        action: js.UndefOr[FilterAction] = js.undefined,
        arns: js.UndefOr[FilterArnList] = js.undefined,
        maxResults: js.UndefOr[ListFilterMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFiltersRequest = {
      val __obj = js.Dynamic.literal()
      action.foreach(__v => __obj.updateDynamic("action")(__v.asInstanceOf[js.Any]))
      arns.foreach(__v => __obj.updateDynamic("arns")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFiltersRequest]
    }
  }

  @js.native
  trait ListFiltersResponse extends js.Object {
    var filters: FilterList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListFiltersResponse {
    @inline
    def apply(
        filters: FilterList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFiltersResponse = {
      val __obj = js.Dynamic.literal(
        "filters" -> filters.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFiltersResponse]
    }
  }

  @js.native
  trait ListFindingAggregationsRequest extends js.Object {
    var aggregationType: AggregationType
    var accountIds: js.UndefOr[StringFilterList]
    var aggregationRequest: js.UndefOr[AggregationRequest]
    var maxResults: js.UndefOr[ListFindingAggregationsMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListFindingAggregationsRequest {
    @inline
    def apply(
        aggregationType: AggregationType,
        accountIds: js.UndefOr[StringFilterList] = js.undefined,
        aggregationRequest: js.UndefOr[AggregationRequest] = js.undefined,
        maxResults: js.UndefOr[ListFindingAggregationsMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFindingAggregationsRequest = {
      val __obj = js.Dynamic.literal(
        "aggregationType" -> aggregationType.asInstanceOf[js.Any]
      )

      accountIds.foreach(__v => __obj.updateDynamic("accountIds")(__v.asInstanceOf[js.Any]))
      aggregationRequest.foreach(__v => __obj.updateDynamic("aggregationRequest")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingAggregationsRequest]
    }
  }

  @js.native
  trait ListFindingAggregationsResponse extends js.Object {
    var aggregationType: AggregationType
    var nextToken: js.UndefOr[NextToken]
    var responses: js.UndefOr[AggregationResponseList]
  }

  object ListFindingAggregationsResponse {
    @inline
    def apply(
        aggregationType: AggregationType,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        responses: js.UndefOr[AggregationResponseList] = js.undefined
    ): ListFindingAggregationsResponse = {
      val __obj = js.Dynamic.literal(
        "aggregationType" -> aggregationType.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      responses.foreach(__v => __obj.updateDynamic("responses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingAggregationsResponse]
    }
  }

  @js.native
  trait ListFindingsRequest extends js.Object {
    var filterCriteria: js.UndefOr[FilterCriteria]
    var maxResults: js.UndefOr[ListFindingsMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var sortCriteria: js.UndefOr[SortCriteria]
  }

  object ListFindingsRequest {
    @inline
    def apply(
        filterCriteria: js.UndefOr[FilterCriteria] = js.undefined,
        maxResults: js.UndefOr[ListFindingsMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        sortCriteria: js.UndefOr[SortCriteria] = js.undefined
    ): ListFindingsRequest = {
      val __obj = js.Dynamic.literal()
      filterCriteria.foreach(__v => __obj.updateDynamic("filterCriteria")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortCriteria.foreach(__v => __obj.updateDynamic("sortCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingsRequest]
    }
  }

  @js.native
  trait ListFindingsResponse extends js.Object {
    var findings: js.UndefOr[FindingList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListFindingsResponse {
    @inline
    def apply(
        findings: js.UndefOr[FindingList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFindingsResponse = {
      val __obj = js.Dynamic.literal()
      findings.foreach(__v => __obj.updateDynamic("findings")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingsResponse]
    }
  }

  @js.native
  trait ListMembersRequest extends js.Object {
    var maxResults: js.UndefOr[ListMembersMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var onlyAssociated: js.UndefOr[Boolean]
  }

  object ListMembersRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListMembersMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        onlyAssociated: js.UndefOr[Boolean] = js.undefined
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
    var members: js.UndefOr[MemberList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListMembersResponse {
    @inline
    def apply(
        members: js.UndefOr[MemberList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMembersResponse = {
      val __obj = js.Dynamic.literal()
      members.foreach(__v => __obj.updateDynamic("members")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMembersResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: Arn
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

  @js.native
  trait ListUsageTotalsRequest extends js.Object {
    var accountIds: js.UndefOr[UsageAccountIdList]
    var maxResults: js.UndefOr[ListUsageTotalsMaxResults]
    var nextToken: js.UndefOr[ListUsageTotalsNextToken]
  }

  object ListUsageTotalsRequest {
    @inline
    def apply(
        accountIds: js.UndefOr[UsageAccountIdList] = js.undefined,
        maxResults: js.UndefOr[ListUsageTotalsMaxResults] = js.undefined,
        nextToken: js.UndefOr[ListUsageTotalsNextToken] = js.undefined
    ): ListUsageTotalsRequest = {
      val __obj = js.Dynamic.literal()
      accountIds.foreach(__v => __obj.updateDynamic("accountIds")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsageTotalsRequest]
    }
  }

  @js.native
  trait ListUsageTotalsResponse extends js.Object {
    var nextToken: js.UndefOr[ListUsageTotalsNextToken]
    var totals: js.UndefOr[UsageTotalList]
  }

  object ListUsageTotalsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[ListUsageTotalsNextToken] = js.undefined,
        totals: js.UndefOr[UsageTotalList] = js.undefined
    ): ListUsageTotalsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      totals.foreach(__v => __obj.updateDynamic("totals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsageTotalsResponse]
    }
  }

  /** An object that describes details of a map filter.
    */
  @js.native
  trait MapFilter extends js.Object {
    var comparison: MapComparison
    var key: MapKey
    var value: js.UndefOr[MapValue]
  }

  object MapFilter {
    @inline
    def apply(
        comparison: MapComparison,
        key: MapKey,
        value: js.UndefOr[MapValue] = js.undefined
    ): MapFilter = {
      val __obj = js.Dynamic.literal(
        "comparison" -> comparison.asInstanceOf[js.Any],
        "key" -> key.asInstanceOf[js.Any]
      )

      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MapFilter]
    }
  }

  /** Details on a member account in your organization.
    */
  @js.native
  trait Member extends js.Object {
    var accountId: js.UndefOr[AccountId]
    var delegatedAdminAccountId: js.UndefOr[AccountId]
    var relationshipStatus: js.UndefOr[RelationshipStatus]
    var updatedAt: js.UndefOr[DateTimeTimestamp]
  }

  object Member {
    @inline
    def apply(
        accountId: js.UndefOr[AccountId] = js.undefined,
        delegatedAdminAccountId: js.UndefOr[AccountId] = js.undefined,
        relationshipStatus: js.UndefOr[RelationshipStatus] = js.undefined,
        updatedAt: js.UndefOr[DateTimeTimestamp] = js.undefined
    ): Member = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      delegatedAdminAccountId.foreach(__v => __obj.updateDynamic("delegatedAdminAccountId")(__v.asInstanceOf[js.Any]))
      relationshipStatus.foreach(__v => __obj.updateDynamic("relationshipStatus")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Member]
    }
  }

  /** Information on the network path associated with a finding.
    */
  @js.native
  trait NetworkPath extends js.Object {
    var steps: js.UndefOr[StepList]
  }

  object NetworkPath {
    @inline
    def apply(
        steps: js.UndefOr[StepList] = js.undefined
    ): NetworkPath = {
      val __obj = js.Dynamic.literal()
      steps.foreach(__v => __obj.updateDynamic("steps")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkPath]
    }
  }

  /** Contains the details of a network reachability finding.
    */
  @js.native
  trait NetworkReachabilityDetails extends js.Object {
    var networkPath: NetworkPath
    var openPortRange: PortRange
    var protocol: NetworkProtocol
  }

  object NetworkReachabilityDetails {
    @inline
    def apply(
        networkPath: NetworkPath,
        openPortRange: PortRange,
        protocol: NetworkProtocol
    ): NetworkReachabilityDetails = {
      val __obj = js.Dynamic.literal(
        "networkPath" -> networkPath.asInstanceOf[js.Any],
        "openPortRange" -> openPortRange.asInstanceOf[js.Any],
        "protocol" -> protocol.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NetworkReachabilityDetails]
    }
  }

  /** An object that describes the details of a number filter.
    */
  @js.native
  trait NumberFilter extends js.Object {
    var lowerInclusive: js.UndefOr[Double]
    var upperInclusive: js.UndefOr[Double]
  }

  object NumberFilter {
    @inline
    def apply(
        lowerInclusive: js.UndefOr[Double] = js.undefined,
        upperInclusive: js.UndefOr[Double] = js.undefined
    ): NumberFilter = {
      val __obj = js.Dynamic.literal()
      lowerInclusive.foreach(__v => __obj.updateDynamic("lowerInclusive")(__v.asInstanceOf[js.Any]))
      upperInclusive.foreach(__v => __obj.updateDynamic("upperInclusive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NumberFilter]
    }
  }

  /** The details that define an aggregation based on operating system package type.
    */
  @js.native
  trait PackageAggregation extends js.Object {
    var packageNames: js.UndefOr[StringFilterList]
    var sortBy: js.UndefOr[PackageSortBy]
    var sortOrder: js.UndefOr[SortOrder]
  }

  object PackageAggregation {
    @inline
    def apply(
        packageNames: js.UndefOr[StringFilterList] = js.undefined,
        sortBy: js.UndefOr[PackageSortBy] = js.undefined,
        sortOrder: js.UndefOr[SortOrder] = js.undefined
    ): PackageAggregation = {
      val __obj = js.Dynamic.literal()
      packageNames.foreach(__v => __obj.updateDynamic("packageNames")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackageAggregation]
    }
  }

  /** A response that contains the results of a finding aggregation by image layer.
    */
  @js.native
  trait PackageAggregationResponse extends js.Object {
    var packageName: NonEmptyString
    var accountId: js.UndefOr[AccountId]
    var severityCounts: js.UndefOr[SeverityCounts]
  }

  object PackageAggregationResponse {
    @inline
    def apply(
        packageName: NonEmptyString,
        accountId: js.UndefOr[AccountId] = js.undefined,
        severityCounts: js.UndefOr[SeverityCounts] = js.undefined
    ): PackageAggregationResponse = {
      val __obj = js.Dynamic.literal(
        "packageName" -> packageName.asInstanceOf[js.Any]
      )

      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      severityCounts.foreach(__v => __obj.updateDynamic("severityCounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackageAggregationResponse]
    }
  }

  /** Contains information on the details of a package filter.
    */
  @js.native
  trait PackageFilter extends js.Object {
    var architecture: js.UndefOr[StringFilter]
    var epoch: js.UndefOr[NumberFilter]
    var name: js.UndefOr[StringFilter]
    var release: js.UndefOr[StringFilter]
    var sourceLambdaLayerArn: js.UndefOr[StringFilter]
    var sourceLayerHash: js.UndefOr[StringFilter]
    var version: js.UndefOr[StringFilter]
  }

  object PackageFilter {
    @inline
    def apply(
        architecture: js.UndefOr[StringFilter] = js.undefined,
        epoch: js.UndefOr[NumberFilter] = js.undefined,
        name: js.UndefOr[StringFilter] = js.undefined,
        release: js.UndefOr[StringFilter] = js.undefined,
        sourceLambdaLayerArn: js.UndefOr[StringFilter] = js.undefined,
        sourceLayerHash: js.UndefOr[StringFilter] = js.undefined,
        version: js.UndefOr[StringFilter] = js.undefined
    ): PackageFilter = {
      val __obj = js.Dynamic.literal()
      architecture.foreach(__v => __obj.updateDynamic("architecture")(__v.asInstanceOf[js.Any]))
      epoch.foreach(__v => __obj.updateDynamic("epoch")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      release.foreach(__v => __obj.updateDynamic("release")(__v.asInstanceOf[js.Any]))
      sourceLambdaLayerArn.foreach(__v => __obj.updateDynamic("sourceLambdaLayerArn")(__v.asInstanceOf[js.Any]))
      sourceLayerHash.foreach(__v => __obj.updateDynamic("sourceLayerHash")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackageFilter]
    }
  }

  /** Information about a package vulnerability finding.
    */
  @js.native
  trait PackageVulnerabilityDetails extends js.Object {
    var source: NonEmptyString
    var vulnerabilityId: VulnerabilityId
    var cvss: js.UndefOr[CvssScoreList]
    var referenceUrls: js.UndefOr[NonEmptyStringList]
    var relatedVulnerabilities: js.UndefOr[VulnerabilityIdList]
    var sourceUrl: js.UndefOr[NonEmptyString]
    var vendorCreatedAt: js.UndefOr[DateTimeTimestamp]
    var vendorSeverity: js.UndefOr[NonEmptyString]
    var vendorUpdatedAt: js.UndefOr[DateTimeTimestamp]
    var vulnerablePackages: js.UndefOr[VulnerablePackageList]
  }

  object PackageVulnerabilityDetails {
    @inline
    def apply(
        source: NonEmptyString,
        vulnerabilityId: VulnerabilityId,
        cvss: js.UndefOr[CvssScoreList] = js.undefined,
        referenceUrls: js.UndefOr[NonEmptyStringList] = js.undefined,
        relatedVulnerabilities: js.UndefOr[VulnerabilityIdList] = js.undefined,
        sourceUrl: js.UndefOr[NonEmptyString] = js.undefined,
        vendorCreatedAt: js.UndefOr[DateTimeTimestamp] = js.undefined,
        vendorSeverity: js.UndefOr[NonEmptyString] = js.undefined,
        vendorUpdatedAt: js.UndefOr[DateTimeTimestamp] = js.undefined,
        vulnerablePackages: js.UndefOr[VulnerablePackageList] = js.undefined
    ): PackageVulnerabilityDetails = {
      val __obj = js.Dynamic.literal(
        "source" -> source.asInstanceOf[js.Any],
        "vulnerabilityId" -> vulnerabilityId.asInstanceOf[js.Any]
      )

      cvss.foreach(__v => __obj.updateDynamic("cvss")(__v.asInstanceOf[js.Any]))
      referenceUrls.foreach(__v => __obj.updateDynamic("referenceUrls")(__v.asInstanceOf[js.Any]))
      relatedVulnerabilities.foreach(__v => __obj.updateDynamic("relatedVulnerabilities")(__v.asInstanceOf[js.Any]))
      sourceUrl.foreach(__v => __obj.updateDynamic("sourceUrl")(__v.asInstanceOf[js.Any]))
      vendorCreatedAt.foreach(__v => __obj.updateDynamic("vendorCreatedAt")(__v.asInstanceOf[js.Any]))
      vendorSeverity.foreach(__v => __obj.updateDynamic("vendorSeverity")(__v.asInstanceOf[js.Any]))
      vendorUpdatedAt.foreach(__v => __obj.updateDynamic("vendorUpdatedAt")(__v.asInstanceOf[js.Any]))
      vulnerablePackages.foreach(__v => __obj.updateDynamic("vulnerablePackages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackageVulnerabilityDetails]
    }
  }

  /** Contains information on the permissions an account has within Amazon Inspector.
    */
  @js.native
  trait Permission extends js.Object {
    var operation: Operation
    var service: Service
  }

  object Permission {
    @inline
    def apply(
        operation: Operation,
        service: Service
    ): Permission = {
      val __obj = js.Dynamic.literal(
        "operation" -> operation.asInstanceOf[js.Any],
        "service" -> service.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Permission]
    }
  }

  /** Details about the port range associated with a finding.
    */
  @js.native
  trait PortRange extends js.Object {
    var begin: Port
    var end: Port
  }

  object PortRange {
    @inline
    def apply(
        begin: Port,
        end: Port
    ): PortRange = {
      val __obj = js.Dynamic.literal(
        "begin" -> begin.asInstanceOf[js.Any],
        "end" -> end.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PortRange]
    }
  }

  /** An object that describes the details of a port range filter.
    */
  @js.native
  trait PortRangeFilter extends js.Object {
    var beginInclusive: js.UndefOr[Port]
    var endInclusive: js.UndefOr[Port]
  }

  object PortRangeFilter {
    @inline
    def apply(
        beginInclusive: js.UndefOr[Port] = js.undefined,
        endInclusive: js.UndefOr[Port] = js.undefined
    ): PortRangeFilter = {
      val __obj = js.Dynamic.literal()
      beginInclusive.foreach(__v => __obj.updateDynamic("beginInclusive")(__v.asInstanceOf[js.Any]))
      endInclusive.foreach(__v => __obj.updateDynamic("endInclusive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortRangeFilter]
    }
  }

  /** Details about the recommended course of action to remediate the finding.
    */
  @js.native
  trait Recommendation extends js.Object {
    var Url: js.UndefOr[NonEmptyString]
    var text: js.UndefOr[NonEmptyString]
  }

  object Recommendation {
    @inline
    def apply(
        Url: js.UndefOr[NonEmptyString] = js.undefined,
        text: js.UndefOr[NonEmptyString] = js.undefined
    ): Recommendation = {
      val __obj = js.Dynamic.literal()
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      text.foreach(__v => __obj.updateDynamic("text")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Recommendation]
    }
  }

  /** Information on how to remediate a finding.
    */
  @js.native
  trait Remediation extends js.Object {
    var recommendation: js.UndefOr[Recommendation]
  }

  object Remediation {
    @inline
    def apply(
        recommendation: js.UndefOr[Recommendation] = js.undefined
    ): Remediation = {
      val __obj = js.Dynamic.literal()
      recommendation.foreach(__v => __obj.updateDynamic("recommendation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Remediation]
    }
  }

  /** The details that define an aggregation based on repository.
    */
  @js.native
  trait RepositoryAggregation extends js.Object {
    var repositories: js.UndefOr[StringFilterList]
    var sortBy: js.UndefOr[RepositorySortBy]
    var sortOrder: js.UndefOr[SortOrder]
  }

  object RepositoryAggregation {
    @inline
    def apply(
        repositories: js.UndefOr[StringFilterList] = js.undefined,
        sortBy: js.UndefOr[RepositorySortBy] = js.undefined,
        sortOrder: js.UndefOr[SortOrder] = js.undefined
    ): RepositoryAggregation = {
      val __obj = js.Dynamic.literal()
      repositories.foreach(__v => __obj.updateDynamic("repositories")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryAggregation]
    }
  }

  /** A response that contains details on the results of a finding aggregation by repository.
    */
  @js.native
  trait RepositoryAggregationResponse extends js.Object {
    var repository: NonEmptyString
    var accountId: js.UndefOr[AccountId]
    var affectedImages: js.UndefOr[Double]
    var severityCounts: js.UndefOr[SeverityCounts]
  }

  object RepositoryAggregationResponse {
    @inline
    def apply(
        repository: NonEmptyString,
        accountId: js.UndefOr[AccountId] = js.undefined,
        affectedImages: js.UndefOr[Double] = js.undefined,
        severityCounts: js.UndefOr[SeverityCounts] = js.undefined
    ): RepositoryAggregationResponse = {
      val __obj = js.Dynamic.literal(
        "repository" -> repository.asInstanceOf[js.Any]
      )

      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      affectedImages.foreach(__v => __obj.updateDynamic("affectedImages")(__v.asInstanceOf[js.Any]))
      severityCounts.foreach(__v => __obj.updateDynamic("severityCounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryAggregationResponse]
    }
  }

  /** Details about the resource involved in a finding.
    */
  @js.native
  trait Resource extends js.Object {
    var id: NonEmptyString
    var `type`: ResourceType
    var details: js.UndefOr[ResourceDetails]
    var partition: js.UndefOr[NonEmptyString]
    var region: js.UndefOr[NonEmptyString]
    var tags: js.UndefOr[TagMap]
  }

  object Resource {
    @inline
    def apply(
        id: NonEmptyString,
        `type`: ResourceType,
        details: js.UndefOr[ResourceDetails] = js.undefined,
        partition: js.UndefOr[NonEmptyString] = js.undefined,
        region: js.UndefOr[NonEmptyString] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): Resource = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      partition.foreach(__v => __obj.updateDynamic("partition")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  /** Contains details about the resource involved in the finding.
    */
  @js.native
  trait ResourceDetails extends js.Object {
    var awsEc2Instance: js.UndefOr[AwsEc2InstanceDetails]
    var awsEcrContainerImage: js.UndefOr[AwsEcrContainerImageDetails]
    var awsLambdaFunction: js.UndefOr[AwsLambdaFunctionDetails]
  }

  object ResourceDetails {
    @inline
    def apply(
        awsEc2Instance: js.UndefOr[AwsEc2InstanceDetails] = js.undefined,
        awsEcrContainerImage: js.UndefOr[AwsEcrContainerImageDetails] = js.undefined,
        awsLambdaFunction: js.UndefOr[AwsLambdaFunctionDetails] = js.undefined
    ): ResourceDetails = {
      val __obj = js.Dynamic.literal()
      awsEc2Instance.foreach(__v => __obj.updateDynamic("awsEc2Instance")(__v.asInstanceOf[js.Any]))
      awsEcrContainerImage.foreach(__v => __obj.updateDynamic("awsEcrContainerImage")(__v.asInstanceOf[js.Any]))
      awsLambdaFunction.foreach(__v => __obj.updateDynamic("awsLambdaFunction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceDetails]
    }
  }

  /** An object that contains details about the metadata for an Amazon ECR resource.
    */
  @js.native
  trait ResourceScanMetadata extends js.Object {
    var ec2: js.UndefOr[Ec2Metadata]
    var ecrImage: js.UndefOr[EcrContainerImageMetadata]
    var ecrRepository: js.UndefOr[EcrRepositoryMetadata]
    var lambdaFunction: js.UndefOr[LambdaFunctionMetadata]
  }

  object ResourceScanMetadata {
    @inline
    def apply(
        ec2: js.UndefOr[Ec2Metadata] = js.undefined,
        ecrImage: js.UndefOr[EcrContainerImageMetadata] = js.undefined,
        ecrRepository: js.UndefOr[EcrRepositoryMetadata] = js.undefined,
        lambdaFunction: js.UndefOr[LambdaFunctionMetadata] = js.undefined
    ): ResourceScanMetadata = {
      val __obj = js.Dynamic.literal()
      ec2.foreach(__v => __obj.updateDynamic("ec2")(__v.asInstanceOf[js.Any]))
      ecrImage.foreach(__v => __obj.updateDynamic("ecrImage")(__v.asInstanceOf[js.Any]))
      ecrRepository.foreach(__v => __obj.updateDynamic("ecrRepository")(__v.asInstanceOf[js.Any]))
      lambdaFunction.foreach(__v => __obj.updateDynamic("lambdaFunction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceScanMetadata]
    }
  }

  /** Details the state of Amazon Inspector for each resource type Amazon Inspector scans.
    */
  @js.native
  trait ResourceState extends js.Object {
    var ec2: State
    var ecr: State
    var lambda: js.UndefOr[State]
  }

  object ResourceState {
    @inline
    def apply(
        ec2: State,
        ecr: State,
        lambda: js.UndefOr[State] = js.undefined
    ): ResourceState = {
      val __obj = js.Dynamic.literal(
        "ec2" -> ec2.asInstanceOf[js.Any],
        "ecr" -> ecr.asInstanceOf[js.Any]
      )

      lambda.foreach(__v => __obj.updateDynamic("lambda")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceState]
    }
  }

  /** Details the status of Amazon Inspector for each resource type Amazon Inspector scans.
    */
  @js.native
  trait ResourceStatus extends js.Object {
    var ec2: Status
    var ecr: Status
    var lambda: js.UndefOr[Status]
  }

  object ResourceStatus {
    @inline
    def apply(
        ec2: Status,
        ecr: Status,
        lambda: js.UndefOr[Status] = js.undefined
    ): ResourceStatus = {
      val __obj = js.Dynamic.literal(
        "ec2" -> ec2.asInstanceOf[js.Any],
        "ecr" -> ecr.asInstanceOf[js.Any]
      )

      lambda.foreach(__v => __obj.updateDynamic("lambda")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceStatus]
    }
  }

  /** The status of the scan.
    */
  @js.native
  trait ScanStatus extends js.Object {
    var reason: ScanStatusReason
    var statusCode: ScanStatusCode
  }

  object ScanStatus {
    @inline
    def apply(
        reason: ScanStatusReason,
        statusCode: ScanStatusCode
    ): ScanStatus = {
      val __obj = js.Dynamic.literal(
        "reason" -> reason.asInstanceOf[js.Any],
        "statusCode" -> statusCode.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ScanStatus]
    }
  }

  /** An object that contains the counts of aggregated finding per severity.
    */
  @js.native
  trait SeverityCounts extends js.Object {
    var all: js.UndefOr[Double]
    var critical: js.UndefOr[Double]
    var high: js.UndefOr[Double]
    var medium: js.UndefOr[Double]
  }

  object SeverityCounts {
    @inline
    def apply(
        all: js.UndefOr[Double] = js.undefined,
        critical: js.UndefOr[Double] = js.undefined,
        high: js.UndefOr[Double] = js.undefined,
        medium: js.UndefOr[Double] = js.undefined
    ): SeverityCounts = {
      val __obj = js.Dynamic.literal()
      all.foreach(__v => __obj.updateDynamic("all")(__v.asInstanceOf[js.Any]))
      critical.foreach(__v => __obj.updateDynamic("critical")(__v.asInstanceOf[js.Any]))
      high.foreach(__v => __obj.updateDynamic("high")(__v.asInstanceOf[js.Any]))
      medium.foreach(__v => __obj.updateDynamic("medium")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SeverityCounts]
    }
  }

  /** Details about the criteria used to sort finding results.
    */
  @js.native
  trait SortCriteria extends js.Object {
    var field: SortField
    var sortOrder: SortOrder
  }

  object SortCriteria {
    @inline
    def apply(
        field: SortField,
        sortOrder: SortOrder
    ): SortCriteria = {
      val __obj = js.Dynamic.literal(
        "field" -> field.asInstanceOf[js.Any],
        "sortOrder" -> sortOrder.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SortCriteria]
    }
  }

  /** An object that described the state of Amazon Inspector scans for an account.
    */
  @js.native
  trait State extends js.Object {
    var errorCode: ErrorCode
    var errorMessage: NonEmptyString
    var status: Status
  }

  object State {
    @inline
    def apply(
        errorCode: ErrorCode,
        errorMessage: NonEmptyString,
        status: Status
    ): State = {
      val __obj = js.Dynamic.literal(
        "errorCode" -> errorCode.asInstanceOf[js.Any],
        "errorMessage" -> errorMessage.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[State]
    }
  }

  /** Details about the step associated with a finding.
    */
  @js.native
  trait Step extends js.Object {
    var componentId: Component
    var componentType: ComponentType
  }

  object Step {
    @inline
    def apply(
        componentId: Component,
        componentType: ComponentType
    ): Step = {
      val __obj = js.Dynamic.literal(
        "componentId" -> componentId.asInstanceOf[js.Any],
        "componentType" -> componentType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Step]
    }
  }

  /** An object that describes the details of a string filter.
    */
  @js.native
  trait StringFilter extends js.Object {
    var comparison: StringComparison
    var value: StringInput
  }

  object StringFilter {
    @inline
    def apply(
        comparison: StringComparison,
        value: StringInput
    ): StringFilter = {
      val __obj = js.Dynamic.literal(
        "comparison" -> comparison.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StringFilter]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
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

  /** The details that define an aggregation based on finding title.
    */
  @js.native
  trait TitleAggregation extends js.Object {
    var resourceType: js.UndefOr[AggregationResourceType]
    var sortBy: js.UndefOr[TitleSortBy]
    var sortOrder: js.UndefOr[SortOrder]
    var titles: js.UndefOr[StringFilterList]
    var vulnerabilityIds: js.UndefOr[StringFilterList]
  }

  object TitleAggregation {
    @inline
    def apply(
        resourceType: js.UndefOr[AggregationResourceType] = js.undefined,
        sortBy: js.UndefOr[TitleSortBy] = js.undefined,
        sortOrder: js.UndefOr[SortOrder] = js.undefined,
        titles: js.UndefOr[StringFilterList] = js.undefined,
        vulnerabilityIds: js.UndefOr[StringFilterList] = js.undefined
    ): TitleAggregation = {
      val __obj = js.Dynamic.literal()
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      sortOrder.foreach(__v => __obj.updateDynamic("sortOrder")(__v.asInstanceOf[js.Any]))
      titles.foreach(__v => __obj.updateDynamic("titles")(__v.asInstanceOf[js.Any]))
      vulnerabilityIds.foreach(__v => __obj.updateDynamic("vulnerabilityIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TitleAggregation]
    }
  }

  /** A response that contains details on the results of a finding aggregation by title.
    */
  @js.native
  trait TitleAggregationResponse extends js.Object {
    var title: NonEmptyString
    var accountId: js.UndefOr[AccountId]
    var severityCounts: js.UndefOr[SeverityCounts]
    var vulnerabilityId: js.UndefOr[String]
  }

  object TitleAggregationResponse {
    @inline
    def apply(
        title: NonEmptyString,
        accountId: js.UndefOr[AccountId] = js.undefined,
        severityCounts: js.UndefOr[SeverityCounts] = js.undefined,
        vulnerabilityId: js.UndefOr[String] = js.undefined
    ): TitleAggregationResponse = {
      val __obj = js.Dynamic.literal(
        "title" -> title.asInstanceOf[js.Any]
      )

      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      severityCounts.foreach(__v => __obj.updateDynamic("severityCounts")(__v.asInstanceOf[js.Any]))
      vulnerabilityId.foreach(__v => __obj.updateDynamic("vulnerabilityId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TitleAggregationResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
        tagKeys: TagKeyList
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
  trait UpdateConfigurationRequest extends js.Object {
    var ecrConfiguration: EcrConfiguration
  }

  object UpdateConfigurationRequest {
    @inline
    def apply(
        ecrConfiguration: EcrConfiguration
    ): UpdateConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "ecrConfiguration" -> ecrConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateConfigurationRequest]
    }
  }

  @js.native
  trait UpdateConfigurationResponse extends js.Object

  object UpdateConfigurationResponse {
    @inline
    def apply(): UpdateConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateConfigurationResponse]
    }
  }

  @js.native
  trait UpdateFilterRequest extends js.Object {
    var filterArn: FilterArn
    var action: js.UndefOr[FilterAction]
    var description: js.UndefOr[FilterDescription]
    var filterCriteria: js.UndefOr[FilterCriteria]
    var name: js.UndefOr[FilterName]
    var reason: js.UndefOr[FilterReason]
  }

  object UpdateFilterRequest {
    @inline
    def apply(
        filterArn: FilterArn,
        action: js.UndefOr[FilterAction] = js.undefined,
        description: js.UndefOr[FilterDescription] = js.undefined,
        filterCriteria: js.UndefOr[FilterCriteria] = js.undefined,
        name: js.UndefOr[FilterName] = js.undefined,
        reason: js.UndefOr[FilterReason] = js.undefined
    ): UpdateFilterRequest = {
      val __obj = js.Dynamic.literal(
        "filterArn" -> filterArn.asInstanceOf[js.Any]
      )

      action.foreach(__v => __obj.updateDynamic("action")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      filterCriteria.foreach(__v => __obj.updateDynamic("filterCriteria")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFilterRequest]
    }
  }

  @js.native
  trait UpdateFilterResponse extends js.Object {
    var arn: FilterArn
  }

  object UpdateFilterResponse {
    @inline
    def apply(
        arn: FilterArn
    ): UpdateFilterResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateFilterResponse]
    }
  }

  @js.native
  trait UpdateOrganizationConfigurationRequest extends js.Object {
    var autoEnable: AutoEnable
  }

  object UpdateOrganizationConfigurationRequest {
    @inline
    def apply(
        autoEnable: AutoEnable
    ): UpdateOrganizationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "autoEnable" -> autoEnable.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateOrganizationConfigurationRequest]
    }
  }

  @js.native
  trait UpdateOrganizationConfigurationResponse extends js.Object {
    var autoEnable: AutoEnable
  }

  object UpdateOrganizationConfigurationResponse {
    @inline
    def apply(
        autoEnable: AutoEnable
    ): UpdateOrganizationConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "autoEnable" -> autoEnable.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateOrganizationConfigurationResponse]
    }
  }

  /** Contains usage information about the cost of Amazon Inspector operation.
    */
  @js.native
  trait Usage extends js.Object {
    var currency: js.UndefOr[Currency]
    var estimatedMonthlyCost: js.UndefOr[MonthlyCostEstimate]
    var total: js.UndefOr[UsageValue]
    var `type`: js.UndefOr[UsageType]
  }

  object Usage {
    @inline
    def apply(
        currency: js.UndefOr[Currency] = js.undefined,
        estimatedMonthlyCost: js.UndefOr[MonthlyCostEstimate] = js.undefined,
        total: js.UndefOr[UsageValue] = js.undefined,
        `type`: js.UndefOr[UsageType] = js.undefined
    ): Usage = {
      val __obj = js.Dynamic.literal()
      currency.foreach(__v => __obj.updateDynamic("currency")(__v.asInstanceOf[js.Any]))
      estimatedMonthlyCost.foreach(__v => __obj.updateDynamic("estimatedMonthlyCost")(__v.asInstanceOf[js.Any]))
      total.foreach(__v => __obj.updateDynamic("total")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Usage]
    }
  }

  /** The total of usage for an account ID.
    */
  @js.native
  trait UsageTotal extends js.Object {
    var accountId: js.UndefOr[MeteringAccountId]
    var usage: js.UndefOr[UsageList]
  }

  object UsageTotal {
    @inline
    def apply(
        accountId: js.UndefOr[MeteringAccountId] = js.undefined,
        usage: js.UndefOr[UsageList] = js.undefined
    ): UsageTotal = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      usage.foreach(__v => __obj.updateDynamic("usage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageTotal]
    }
  }

  /** Information on the vulnerable package identified by a finding.
    */
  @js.native
  trait VulnerablePackage extends js.Object {
    var name: PackageName
    var version: PackageVersion
    var arch: js.UndefOr[PackageArchitecture]
    var epoch: js.UndefOr[PackageEpoch]
    var filePath: js.UndefOr[FilePath]
    var fixedInVersion: js.UndefOr[PackageVersion]
    var packageManager: js.UndefOr[PackageManager]
    var release: js.UndefOr[PackageRelease]
    var remediation: js.UndefOr[VulnerablePackageRemediation]
    var sourceLambdaLayerArn: js.UndefOr[LambdaLayerArn]
    var sourceLayerHash: js.UndefOr[SourceLayerHash]
  }

  object VulnerablePackage {
    @inline
    def apply(
        name: PackageName,
        version: PackageVersion,
        arch: js.UndefOr[PackageArchitecture] = js.undefined,
        epoch: js.UndefOr[PackageEpoch] = js.undefined,
        filePath: js.UndefOr[FilePath] = js.undefined,
        fixedInVersion: js.UndefOr[PackageVersion] = js.undefined,
        packageManager: js.UndefOr[PackageManager] = js.undefined,
        release: js.UndefOr[PackageRelease] = js.undefined,
        remediation: js.UndefOr[VulnerablePackageRemediation] = js.undefined,
        sourceLambdaLayerArn: js.UndefOr[LambdaLayerArn] = js.undefined,
        sourceLayerHash: js.UndefOr[SourceLayerHash] = js.undefined
    ): VulnerablePackage = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )

      arch.foreach(__v => __obj.updateDynamic("arch")(__v.asInstanceOf[js.Any]))
      epoch.foreach(__v => __obj.updateDynamic("epoch")(__v.asInstanceOf[js.Any]))
      filePath.foreach(__v => __obj.updateDynamic("filePath")(__v.asInstanceOf[js.Any]))
      fixedInVersion.foreach(__v => __obj.updateDynamic("fixedInVersion")(__v.asInstanceOf[js.Any]))
      packageManager.foreach(__v => __obj.updateDynamic("packageManager")(__v.asInstanceOf[js.Any]))
      release.foreach(__v => __obj.updateDynamic("release")(__v.asInstanceOf[js.Any]))
      remediation.foreach(__v => __obj.updateDynamic("remediation")(__v.asInstanceOf[js.Any]))
      sourceLambdaLayerArn.foreach(__v => __obj.updateDynamic("sourceLambdaLayerArn")(__v.asInstanceOf[js.Any]))
      sourceLayerHash.foreach(__v => __obj.updateDynamic("sourceLayerHash")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VulnerablePackage]
    }
  }
}
