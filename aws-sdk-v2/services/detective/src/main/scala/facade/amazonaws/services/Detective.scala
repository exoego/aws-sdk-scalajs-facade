package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object detective {
  type AccountId = String
  type AccountIdExtendedList = js.Array[AccountId]
  type AccountIdList = js.Array[AccountId]
  type AccountList = js.Array[Account]
  type AdministratorList = js.Array[Administrator]
  type ByteValue = Double
  type DatasourcePackageIngestDetails = js.Dictionary[DatasourcePackageIngestDetail]
  type DatasourcePackageIngestHistory = js.Dictionary[LastIngestStateChangeDates]
  type DatasourcePackageIngestStates = js.Dictionary[DatasourcePackageIngestState]
  type DatasourcePackageList = js.Array[DatasourcePackage]
  type EmailAddress = String
  type EmailMessage = String
  type GraphArn = String
  type GraphArnList = js.Array[GraphArn]
  type GraphList = js.Array[Graph]
  type LastIngestStateChangeDates = js.Dictionary[TimestampForCollection]
  type MemberDetailList = js.Array[MemberDetail]
  type MemberResultsLimit = Int
  type MembershipDatasourcesList = js.Array[MembershipDatasources]
  type PaginationToken = String
  type Percentage = Double
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Timestamp = js.Date
  type UnprocessedAccountList = js.Array[UnprocessedAccount]
  type UnprocessedGraphList = js.Array[UnprocessedGraph]
  type UnprocessedReason = String
  type VolumeUsageByDatasourcePackage = js.Dictionary[DatasourcePackageUsageInfo]

  final class DetectiveOps(private val service: Detective) extends AnyVal {

    @inline def acceptInvitationFuture(params: AcceptInvitationRequest): Future[js.Object] = service.acceptInvitation(params).promise().toFuture
    @inline def batchGetGraphMemberDatasourcesFuture(params: BatchGetGraphMemberDatasourcesRequest): Future[BatchGetGraphMemberDatasourcesResponse] = service.batchGetGraphMemberDatasources(params).promise().toFuture
    @inline def batchGetMembershipDatasourcesFuture(params: BatchGetMembershipDatasourcesRequest): Future[BatchGetMembershipDatasourcesResponse] = service.batchGetMembershipDatasources(params).promise().toFuture
    @inline def createGraphFuture(params: CreateGraphRequest): Future[CreateGraphResponse] = service.createGraph(params).promise().toFuture
    @inline def createMembersFuture(params: CreateMembersRequest): Future[CreateMembersResponse] = service.createMembers(params).promise().toFuture
    @inline def deleteGraphFuture(params: DeleteGraphRequest): Future[js.Object] = service.deleteGraph(params).promise().toFuture
    @inline def deleteMembersFuture(params: DeleteMembersRequest): Future[DeleteMembersResponse] = service.deleteMembers(params).promise().toFuture
    @inline def describeOrganizationConfigurationFuture(params: DescribeOrganizationConfigurationRequest): Future[DescribeOrganizationConfigurationResponse] = service.describeOrganizationConfiguration(params).promise().toFuture
    @inline def disableOrganizationAdminAccountFuture(): Future[js.Object] = service.disableOrganizationAdminAccount().promise().toFuture
    @inline def disassociateMembershipFuture(params: DisassociateMembershipRequest): Future[js.Object] = service.disassociateMembership(params).promise().toFuture
    @inline def enableOrganizationAdminAccountFuture(params: EnableOrganizationAdminAccountRequest): Future[js.Object] = service.enableOrganizationAdminAccount(params).promise().toFuture
    @inline def getMembersFuture(params: GetMembersRequest): Future[GetMembersResponse] = service.getMembers(params).promise().toFuture
    @inline def listDatasourcePackagesFuture(params: ListDatasourcePackagesRequest): Future[ListDatasourcePackagesResponse] = service.listDatasourcePackages(params).promise().toFuture
    @inline def listGraphsFuture(params: ListGraphsRequest): Future[ListGraphsResponse] = service.listGraphs(params).promise().toFuture
    @inline def listInvitationsFuture(params: ListInvitationsRequest): Future[ListInvitationsResponse] = service.listInvitations(params).promise().toFuture
    @inline def listMembersFuture(params: ListMembersRequest): Future[ListMembersResponse] = service.listMembers(params).promise().toFuture
    @inline def listOrganizationAdminAccountsFuture(params: ListOrganizationAdminAccountsRequest): Future[ListOrganizationAdminAccountsResponse] = service.listOrganizationAdminAccounts(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def rejectInvitationFuture(params: RejectInvitationRequest): Future[js.Object] = service.rejectInvitation(params).promise().toFuture
    @inline def startMonitoringMemberFuture(params: StartMonitoringMemberRequest): Future[js.Object] = service.startMonitoringMember(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateDatasourcePackagesFuture(params: UpdateDatasourcePackagesRequest): Future[js.Object] = service.updateDatasourcePackages(params).promise().toFuture
    @inline def updateOrganizationConfigurationFuture(params: UpdateOrganizationConfigurationRequest): Future[js.Object] = service.updateOrganizationConfiguration(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/detective", JSImport.Namespace, "AWS.Detective")
  class Detective() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptInvitation(params: AcceptInvitationRequest): Request[js.Object] = js.native
    def batchGetGraphMemberDatasources(params: BatchGetGraphMemberDatasourcesRequest): Request[BatchGetGraphMemberDatasourcesResponse] = js.native
    def batchGetMembershipDatasources(params: BatchGetMembershipDatasourcesRequest): Request[BatchGetMembershipDatasourcesResponse] = js.native
    def createGraph(params: CreateGraphRequest): Request[CreateGraphResponse] = js.native
    def createMembers(params: CreateMembersRequest): Request[CreateMembersResponse] = js.native
    def deleteGraph(params: DeleteGraphRequest): Request[js.Object] = js.native
    def deleteMembers(params: DeleteMembersRequest): Request[DeleteMembersResponse] = js.native
    def describeOrganizationConfiguration(params: DescribeOrganizationConfigurationRequest): Request[DescribeOrganizationConfigurationResponse] = js.native
    def disableOrganizationAdminAccount(): Request[js.Object] = js.native
    def disassociateMembership(params: DisassociateMembershipRequest): Request[js.Object] = js.native
    def enableOrganizationAdminAccount(params: EnableOrganizationAdminAccountRequest): Request[js.Object] = js.native
    def getMembers(params: GetMembersRequest): Request[GetMembersResponse] = js.native
    def listDatasourcePackages(params: ListDatasourcePackagesRequest): Request[ListDatasourcePackagesResponse] = js.native
    def listGraphs(params: ListGraphsRequest): Request[ListGraphsResponse] = js.native
    def listInvitations(params: ListInvitationsRequest): Request[ListInvitationsResponse] = js.native
    def listMembers(params: ListMembersRequest): Request[ListMembersResponse] = js.native
    def listOrganizationAdminAccounts(params: ListOrganizationAdminAccountsRequest): Request[ListOrganizationAdminAccountsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def rejectInvitation(params: RejectInvitationRequest): Request[js.Object] = js.native
    def startMonitoringMember(params: StartMonitoringMemberRequest): Request[js.Object] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateDatasourcePackages(params: UpdateDatasourcePackagesRequest): Request[js.Object] = js.native
    def updateOrganizationConfiguration(params: UpdateOrganizationConfigurationRequest): Request[js.Object] = js.native
  }
  object Detective {
    @inline implicit def toOps(service: Detective): DetectiveOps = {
      new DetectiveOps(service)
    }
  }

  @js.native
  trait AcceptInvitationRequest extends js.Object {
    var GraphArn: GraphArn
  }

  object AcceptInvitationRequest {
    @inline
    def apply(
        GraphArn: GraphArn
    ): AcceptInvitationRequest = {
      val __obj = js.Dynamic.literal(
        "GraphArn" -> GraphArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AcceptInvitationRequest]
    }
  }

  /** An Amazon Web Services account that is the administrator account of or a member of a behavior graph.
    */
  @js.native
  trait Account extends js.Object {
    var AccountId: AccountId
    var EmailAddress: EmailAddress
  }

  object Account {
    @inline
    def apply(
        AccountId: AccountId,
        EmailAddress: EmailAddress
    ): Account = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "EmailAddress" -> EmailAddress.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Account]
    }
  }

  /** Information about the Detective administrator account for an organization.
    */
  @js.native
  trait Administrator extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var DelegationTime: js.UndefOr[Timestamp]
    var GraphArn: js.UndefOr[GraphArn]
  }

  object Administrator {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        DelegationTime: js.UndefOr[Timestamp] = js.undefined,
        GraphArn: js.UndefOr[GraphArn] = js.undefined
    ): Administrator = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      DelegationTime.foreach(__v => __obj.updateDynamic("DelegationTime")(__v.asInstanceOf[js.Any]))
      GraphArn.foreach(__v => __obj.updateDynamic("GraphArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Administrator]
    }
  }

  @js.native
  trait BatchGetGraphMemberDatasourcesRequest extends js.Object {
    var AccountIds: AccountIdExtendedList
    var GraphArn: GraphArn
  }

  object BatchGetGraphMemberDatasourcesRequest {
    @inline
    def apply(
        AccountIds: AccountIdExtendedList,
        GraphArn: GraphArn
    ): BatchGetGraphMemberDatasourcesRequest = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "GraphArn" -> GraphArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetGraphMemberDatasourcesRequest]
    }
  }

  @js.native
  trait BatchGetGraphMemberDatasourcesResponse extends js.Object {
    var MemberDatasources: js.UndefOr[MembershipDatasourcesList]
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccountList]
  }

  object BatchGetGraphMemberDatasourcesResponse {
    @inline
    def apply(
        MemberDatasources: js.UndefOr[MembershipDatasourcesList] = js.undefined,
        UnprocessedAccounts: js.UndefOr[UnprocessedAccountList] = js.undefined
    ): BatchGetGraphMemberDatasourcesResponse = {
      val __obj = js.Dynamic.literal()
      MemberDatasources.foreach(__v => __obj.updateDynamic("MemberDatasources")(__v.asInstanceOf[js.Any]))
      UnprocessedAccounts.foreach(__v => __obj.updateDynamic("UnprocessedAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetGraphMemberDatasourcesResponse]
    }
  }

  @js.native
  trait BatchGetMembershipDatasourcesRequest extends js.Object {
    var GraphArns: GraphArnList
  }

  object BatchGetMembershipDatasourcesRequest {
    @inline
    def apply(
        GraphArns: GraphArnList
    ): BatchGetMembershipDatasourcesRequest = {
      val __obj = js.Dynamic.literal(
        "GraphArns" -> GraphArns.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetMembershipDatasourcesRequest]
    }
  }

  @js.native
  trait BatchGetMembershipDatasourcesResponse extends js.Object {
    var MembershipDatasources: js.UndefOr[MembershipDatasourcesList]
    var UnprocessedGraphs: js.UndefOr[UnprocessedGraphList]
  }

  object BatchGetMembershipDatasourcesResponse {
    @inline
    def apply(
        MembershipDatasources: js.UndefOr[MembershipDatasourcesList] = js.undefined,
        UnprocessedGraphs: js.UndefOr[UnprocessedGraphList] = js.undefined
    ): BatchGetMembershipDatasourcesResponse = {
      val __obj = js.Dynamic.literal()
      MembershipDatasources.foreach(__v => __obj.updateDynamic("MembershipDatasources")(__v.asInstanceOf[js.Any]))
      UnprocessedGraphs.foreach(__v => __obj.updateDynamic("UnprocessedGraphs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetMembershipDatasourcesResponse]
    }
  }

  @js.native
  trait CreateGraphRequest extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object CreateGraphRequest {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateGraphRequest = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGraphRequest]
    }
  }

  @js.native
  trait CreateGraphResponse extends js.Object {
    var GraphArn: js.UndefOr[GraphArn]
  }

  object CreateGraphResponse {
    @inline
    def apply(
        GraphArn: js.UndefOr[GraphArn] = js.undefined
    ): CreateGraphResponse = {
      val __obj = js.Dynamic.literal()
      GraphArn.foreach(__v => __obj.updateDynamic("GraphArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGraphResponse]
    }
  }

  @js.native
  trait CreateMembersRequest extends js.Object {
    var Accounts: AccountList
    var GraphArn: GraphArn
    var DisableEmailNotification: js.UndefOr[Boolean]
    var Message: js.UndefOr[EmailMessage]
  }

  object CreateMembersRequest {
    @inline
    def apply(
        Accounts: AccountList,
        GraphArn: GraphArn,
        DisableEmailNotification: js.UndefOr[Boolean] = js.undefined,
        Message: js.UndefOr[EmailMessage] = js.undefined
    ): CreateMembersRequest = {
      val __obj = js.Dynamic.literal(
        "Accounts" -> Accounts.asInstanceOf[js.Any],
        "GraphArn" -> GraphArn.asInstanceOf[js.Any]
      )

      DisableEmailNotification.foreach(__v => __obj.updateDynamic("DisableEmailNotification")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMembersRequest]
    }
  }

  @js.native
  trait CreateMembersResponse extends js.Object {
    var Members: js.UndefOr[MemberDetailList]
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccountList]
  }

  object CreateMembersResponse {
    @inline
    def apply(
        Members: js.UndefOr[MemberDetailList] = js.undefined,
        UnprocessedAccounts: js.UndefOr[UnprocessedAccountList] = js.undefined
    ): CreateMembersResponse = {
      val __obj = js.Dynamic.literal()
      Members.foreach(__v => __obj.updateDynamic("Members")(__v.asInstanceOf[js.Any]))
      UnprocessedAccounts.foreach(__v => __obj.updateDynamic("UnprocessedAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMembersResponse]
    }
  }

  /** Details about the data source packages ingested by your behavior graph.
    */
  @js.native
  trait DatasourcePackageIngestDetail extends js.Object {
    var DatasourcePackageIngestState: js.UndefOr[DatasourcePackageIngestState]
    var LastIngestStateChange: js.UndefOr[LastIngestStateChangeDates]
  }

  object DatasourcePackageIngestDetail {
    @inline
    def apply(
        DatasourcePackageIngestState: js.UndefOr[DatasourcePackageIngestState] = js.undefined,
        LastIngestStateChange: js.UndefOr[LastIngestStateChangeDates] = js.undefined
    ): DatasourcePackageIngestDetail = {
      val __obj = js.Dynamic.literal()
      DatasourcePackageIngestState.foreach(__v => __obj.updateDynamic("DatasourcePackageIngestState")(__v.asInstanceOf[js.Any]))
      LastIngestStateChange.foreach(__v => __obj.updateDynamic("LastIngestStateChange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasourcePackageIngestDetail]
    }
  }

  /** Information on the usage of a data source package in the behavior graph.
    */
  @js.native
  trait DatasourcePackageUsageInfo extends js.Object {
    var VolumeUsageInBytes: js.UndefOr[ByteValue]
    var VolumeUsageUpdateTime: js.UndefOr[Timestamp]
  }

  object DatasourcePackageUsageInfo {
    @inline
    def apply(
        VolumeUsageInBytes: js.UndefOr[ByteValue] = js.undefined,
        VolumeUsageUpdateTime: js.UndefOr[Timestamp] = js.undefined
    ): DatasourcePackageUsageInfo = {
      val __obj = js.Dynamic.literal()
      VolumeUsageInBytes.foreach(__v => __obj.updateDynamic("VolumeUsageInBytes")(__v.asInstanceOf[js.Any]))
      VolumeUsageUpdateTime.foreach(__v => __obj.updateDynamic("VolumeUsageUpdateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasourcePackageUsageInfo]
    }
  }

  @js.native
  trait DeleteGraphRequest extends js.Object {
    var GraphArn: GraphArn
  }

  object DeleteGraphRequest {
    @inline
    def apply(
        GraphArn: GraphArn
    ): DeleteGraphRequest = {
      val __obj = js.Dynamic.literal(
        "GraphArn" -> GraphArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteGraphRequest]
    }
  }

  @js.native
  trait DeleteMembersRequest extends js.Object {
    var AccountIds: AccountIdList
    var GraphArn: GraphArn
  }

  object DeleteMembersRequest {
    @inline
    def apply(
        AccountIds: AccountIdList,
        GraphArn: GraphArn
    ): DeleteMembersRequest = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "GraphArn" -> GraphArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMembersRequest]
    }
  }

  @js.native
  trait DeleteMembersResponse extends js.Object {
    var AccountIds: js.UndefOr[AccountIdList]
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccountList]
  }

  object DeleteMembersResponse {
    @inline
    def apply(
        AccountIds: js.UndefOr[AccountIdList] = js.undefined,
        UnprocessedAccounts: js.UndefOr[UnprocessedAccountList] = js.undefined
    ): DeleteMembersResponse = {
      val __obj = js.Dynamic.literal()
      AccountIds.foreach(__v => __obj.updateDynamic("AccountIds")(__v.asInstanceOf[js.Any]))
      UnprocessedAccounts.foreach(__v => __obj.updateDynamic("UnprocessedAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteMembersResponse]
    }
  }

  @js.native
  trait DescribeOrganizationConfigurationRequest extends js.Object {
    var GraphArn: GraphArn
  }

  object DescribeOrganizationConfigurationRequest {
    @inline
    def apply(
        GraphArn: GraphArn
    ): DescribeOrganizationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "GraphArn" -> GraphArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeOrganizationConfigurationRequest]
    }
  }

  @js.native
  trait DescribeOrganizationConfigurationResponse extends js.Object {
    var AutoEnable: js.UndefOr[Boolean]
  }

  object DescribeOrganizationConfigurationResponse {
    @inline
    def apply(
        AutoEnable: js.UndefOr[Boolean] = js.undefined
    ): DescribeOrganizationConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      AutoEnable.foreach(__v => __obj.updateDynamic("AutoEnable")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOrganizationConfigurationResponse]
    }
  }

  @js.native
  trait DisassociateMembershipRequest extends js.Object {
    var GraphArn: GraphArn
  }

  object DisassociateMembershipRequest {
    @inline
    def apply(
        GraphArn: GraphArn
    ): DisassociateMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "GraphArn" -> GraphArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateMembershipRequest]
    }
  }

  @js.native
  trait EnableOrganizationAdminAccountRequest extends js.Object {
    var AccountId: AccountId
  }

  object EnableOrganizationAdminAccountRequest {
    @inline
    def apply(
        AccountId: AccountId
    ): EnableOrganizationAdminAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EnableOrganizationAdminAccountRequest]
    }
  }

  @js.native
  trait GetMembersRequest extends js.Object {
    var AccountIds: AccountIdList
    var GraphArn: GraphArn
  }

  object GetMembersRequest {
    @inline
    def apply(
        AccountIds: AccountIdList,
        GraphArn: GraphArn
    ): GetMembersRequest = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "GraphArn" -> GraphArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMembersRequest]
    }
  }

  @js.native
  trait GetMembersResponse extends js.Object {
    var MemberDetails: js.UndefOr[MemberDetailList]
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccountList]
  }

  object GetMembersResponse {
    @inline
    def apply(
        MemberDetails: js.UndefOr[MemberDetailList] = js.undefined,
        UnprocessedAccounts: js.UndefOr[UnprocessedAccountList] = js.undefined
    ): GetMembersResponse = {
      val __obj = js.Dynamic.literal()
      MemberDetails.foreach(__v => __obj.updateDynamic("MemberDetails")(__v.asInstanceOf[js.Any]))
      UnprocessedAccounts.foreach(__v => __obj.updateDynamic("UnprocessedAccounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMembersResponse]
    }
  }

  /** A behavior graph in Detective.
    */
  @js.native
  trait Graph extends js.Object {
    var Arn: js.UndefOr[GraphArn]
    var CreatedTime: js.UndefOr[Timestamp]
  }

  object Graph {
    @inline
    def apply(
        Arn: js.UndefOr[GraphArn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined
    ): Graph = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Graph]
    }
  }

  @js.native
  trait ListDatasourcePackagesRequest extends js.Object {
    var GraphArn: GraphArn
    var MaxResults: js.UndefOr[MemberResultsLimit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListDatasourcePackagesRequest {
    @inline
    def apply(
        GraphArn: GraphArn,
        MaxResults: js.UndefOr[MemberResultsLimit] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDatasourcePackagesRequest = {
      val __obj = js.Dynamic.literal(
        "GraphArn" -> GraphArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasourcePackagesRequest]
    }
  }

  @js.native
  trait ListDatasourcePackagesResponse extends js.Object {
    var DatasourcePackages: js.UndefOr[DatasourcePackageIngestDetails]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListDatasourcePackagesResponse {
    @inline
    def apply(
        DatasourcePackages: js.UndefOr[DatasourcePackageIngestDetails] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDatasourcePackagesResponse = {
      val __obj = js.Dynamic.literal()
      DatasourcePackages.foreach(__v => __obj.updateDynamic("DatasourcePackages")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasourcePackagesResponse]
    }
  }

  @js.native
  trait ListGraphsRequest extends js.Object {
    var MaxResults: js.UndefOr[MemberResultsLimit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListGraphsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MemberResultsLimit] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListGraphsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGraphsRequest]
    }
  }

  @js.native
  trait ListGraphsResponse extends js.Object {
    var GraphList: js.UndefOr[GraphList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListGraphsResponse {
    @inline
    def apply(
        GraphList: js.UndefOr[GraphList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListGraphsResponse = {
      val __obj = js.Dynamic.literal()
      GraphList.foreach(__v => __obj.updateDynamic("GraphList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGraphsResponse]
    }
  }

  @js.native
  trait ListInvitationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MemberResultsLimit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListInvitationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MemberResultsLimit] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListInvitationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInvitationsRequest]
    }
  }

  @js.native
  trait ListInvitationsResponse extends js.Object {
    var Invitations: js.UndefOr[MemberDetailList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListInvitationsResponse {
    @inline
    def apply(
        Invitations: js.UndefOr[MemberDetailList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListInvitationsResponse = {
      val __obj = js.Dynamic.literal()
      Invitations.foreach(__v => __obj.updateDynamic("Invitations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInvitationsResponse]
    }
  }

  @js.native
  trait ListMembersRequest extends js.Object {
    var GraphArn: GraphArn
    var MaxResults: js.UndefOr[MemberResultsLimit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListMembersRequest {
    @inline
    def apply(
        GraphArn: GraphArn,
        MaxResults: js.UndefOr[MemberResultsLimit] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListMembersRequest = {
      val __obj = js.Dynamic.literal(
        "GraphArn" -> GraphArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMembersRequest]
    }
  }

  @js.native
  trait ListMembersResponse extends js.Object {
    var MemberDetails: js.UndefOr[MemberDetailList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListMembersResponse {
    @inline
    def apply(
        MemberDetails: js.UndefOr[MemberDetailList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListMembersResponse = {
      val __obj = js.Dynamic.literal()
      MemberDetails.foreach(__v => __obj.updateDynamic("MemberDetails")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMembersResponse]
    }
  }

  @js.native
  trait ListOrganizationAdminAccountsRequest extends js.Object {
    var MaxResults: js.UndefOr[MemberResultsLimit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListOrganizationAdminAccountsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MemberResultsLimit] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListOrganizationAdminAccountsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrganizationAdminAccountsRequest]
    }
  }

  @js.native
  trait ListOrganizationAdminAccountsResponse extends js.Object {
    var Administrators: js.UndefOr[AdministratorList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListOrganizationAdminAccountsResponse {
    @inline
    def apply(
        Administrators: js.UndefOr[AdministratorList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListOrganizationAdminAccountsResponse = {
      val __obj = js.Dynamic.literal()
      Administrators.foreach(__v => __obj.updateDynamic("Administrators")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrganizationAdminAccountsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: GraphArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: GraphArn
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

  /** Details about a member account in a behavior graph.
    */
  @js.native
  trait MemberDetail extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var AdministratorId: js.UndefOr[AccountId]
    var DatasourcePackageIngestStates: js.UndefOr[DatasourcePackageIngestStates]
    var DisabledReason: js.UndefOr[MemberDisabledReason]
    var EmailAddress: js.UndefOr[EmailAddress]
    var GraphArn: js.UndefOr[GraphArn]
    var InvitationType: js.UndefOr[InvitationType]
    var InvitedTime: js.UndefOr[Timestamp]
    var MasterId: js.UndefOr[AccountId]
    var PercentOfGraphUtilization: js.UndefOr[Percentage]
    var PercentOfGraphUtilizationUpdatedTime: js.UndefOr[Timestamp]
    var Status: js.UndefOr[MemberStatus]
    var UpdatedTime: js.UndefOr[Timestamp]
    var VolumeUsageByDatasourcePackage: js.UndefOr[VolumeUsageByDatasourcePackage]
    var VolumeUsageInBytes: js.UndefOr[ByteValue]
    var VolumeUsageUpdatedTime: js.UndefOr[Timestamp]
  }

  object MemberDetail {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        AdministratorId: js.UndefOr[AccountId] = js.undefined,
        DatasourcePackageIngestStates: js.UndefOr[DatasourcePackageIngestStates] = js.undefined,
        DisabledReason: js.UndefOr[MemberDisabledReason] = js.undefined,
        EmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        GraphArn: js.UndefOr[GraphArn] = js.undefined,
        InvitationType: js.UndefOr[InvitationType] = js.undefined,
        InvitedTime: js.UndefOr[Timestamp] = js.undefined,
        MasterId: js.UndefOr[AccountId] = js.undefined,
        PercentOfGraphUtilization: js.UndefOr[Percentage] = js.undefined,
        PercentOfGraphUtilizationUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[MemberStatus] = js.undefined,
        UpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        VolumeUsageByDatasourcePackage: js.UndefOr[VolumeUsageByDatasourcePackage] = js.undefined,
        VolumeUsageInBytes: js.UndefOr[ByteValue] = js.undefined,
        VolumeUsageUpdatedTime: js.UndefOr[Timestamp] = js.undefined
    ): MemberDetail = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      AdministratorId.foreach(__v => __obj.updateDynamic("AdministratorId")(__v.asInstanceOf[js.Any]))
      DatasourcePackageIngestStates.foreach(__v => __obj.updateDynamic("DatasourcePackageIngestStates")(__v.asInstanceOf[js.Any]))
      DisabledReason.foreach(__v => __obj.updateDynamic("DisabledReason")(__v.asInstanceOf[js.Any]))
      EmailAddress.foreach(__v => __obj.updateDynamic("EmailAddress")(__v.asInstanceOf[js.Any]))
      GraphArn.foreach(__v => __obj.updateDynamic("GraphArn")(__v.asInstanceOf[js.Any]))
      InvitationType.foreach(__v => __obj.updateDynamic("InvitationType")(__v.asInstanceOf[js.Any]))
      InvitedTime.foreach(__v => __obj.updateDynamic("InvitedTime")(__v.asInstanceOf[js.Any]))
      MasterId.foreach(__v => __obj.updateDynamic("MasterId")(__v.asInstanceOf[js.Any]))
      PercentOfGraphUtilization.foreach(__v => __obj.updateDynamic("PercentOfGraphUtilization")(__v.asInstanceOf[js.Any]))
      PercentOfGraphUtilizationUpdatedTime.foreach(__v => __obj.updateDynamic("PercentOfGraphUtilizationUpdatedTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedTime.foreach(__v => __obj.updateDynamic("UpdatedTime")(__v.asInstanceOf[js.Any]))
      VolumeUsageByDatasourcePackage.foreach(__v => __obj.updateDynamic("VolumeUsageByDatasourcePackage")(__v.asInstanceOf[js.Any]))
      VolumeUsageInBytes.foreach(__v => __obj.updateDynamic("VolumeUsageInBytes")(__v.asInstanceOf[js.Any]))
      VolumeUsageUpdatedTime.foreach(__v => __obj.updateDynamic("VolumeUsageUpdatedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberDetail]
    }
  }

  /** Details on data source packages for members of the behavior graph.
    */
  @js.native
  trait MembershipDatasources extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var DatasourcePackageIngestHistory: js.UndefOr[DatasourcePackageIngestHistory]
    var GraphArn: js.UndefOr[GraphArn]
  }

  object MembershipDatasources {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        DatasourcePackageIngestHistory: js.UndefOr[DatasourcePackageIngestHistory] = js.undefined,
        GraphArn: js.UndefOr[GraphArn] = js.undefined
    ): MembershipDatasources = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      DatasourcePackageIngestHistory.foreach(__v => __obj.updateDynamic("DatasourcePackageIngestHistory")(__v.asInstanceOf[js.Any]))
      GraphArn.foreach(__v => __obj.updateDynamic("GraphArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MembershipDatasources]
    }
  }

  @js.native
  trait RejectInvitationRequest extends js.Object {
    var GraphArn: GraphArn
  }

  object RejectInvitationRequest {
    @inline
    def apply(
        GraphArn: GraphArn
    ): RejectInvitationRequest = {
      val __obj = js.Dynamic.literal(
        "GraphArn" -> GraphArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RejectInvitationRequest]
    }
  }

  @js.native
  trait StartMonitoringMemberRequest extends js.Object {
    var AccountId: AccountId
    var GraphArn: GraphArn
  }

  object StartMonitoringMemberRequest {
    @inline
    def apply(
        AccountId: AccountId,
        GraphArn: GraphArn
    ): StartMonitoringMemberRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "GraphArn" -> GraphArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartMonitoringMemberRequest]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: GraphArn
    var Tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: GraphArn,
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

  /** Details on when data collection began for a source package.
    */
  @js.native
  trait TimestampForCollection extends js.Object {
    var Timestamp: js.UndefOr[Timestamp]
  }

  object TimestampForCollection {
    @inline
    def apply(
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): TimestampForCollection = {
      val __obj = js.Dynamic.literal()
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimestampForCollection]
    }
  }

  /** A member account that was included in a request but for which the request could not be processed.
    */
  @js.native
  trait UnprocessedAccount extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var Reason: js.UndefOr[UnprocessedReason]
  }

  object UnprocessedAccount {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        Reason: js.UndefOr[UnprocessedReason] = js.undefined
    ): UnprocessedAccount = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnprocessedAccount]
    }
  }

  /** Behavior graphs that could not be processed in the request.
    */
  @js.native
  trait UnprocessedGraph extends js.Object {
    var GraphArn: js.UndefOr[GraphArn]
    var Reason: js.UndefOr[UnprocessedReason]
  }

  object UnprocessedGraph {
    @inline
    def apply(
        GraphArn: js.UndefOr[GraphArn] = js.undefined,
        Reason: js.UndefOr[UnprocessedReason] = js.undefined
    ): UnprocessedGraph = {
      val __obj = js.Dynamic.literal()
      GraphArn.foreach(__v => __obj.updateDynamic("GraphArn")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnprocessedGraph]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: GraphArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: GraphArn,
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
  trait UpdateDatasourcePackagesRequest extends js.Object {
    var DatasourcePackages: DatasourcePackageList
    var GraphArn: GraphArn
  }

  object UpdateDatasourcePackagesRequest {
    @inline
    def apply(
        DatasourcePackages: DatasourcePackageList,
        GraphArn: GraphArn
    ): UpdateDatasourcePackagesRequest = {
      val __obj = js.Dynamic.literal(
        "DatasourcePackages" -> DatasourcePackages.asInstanceOf[js.Any],
        "GraphArn" -> GraphArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDatasourcePackagesRequest]
    }
  }

  @js.native
  trait UpdateOrganizationConfigurationRequest extends js.Object {
    var GraphArn: GraphArn
    var AutoEnable: js.UndefOr[Boolean]
  }

  object UpdateOrganizationConfigurationRequest {
    @inline
    def apply(
        GraphArn: GraphArn,
        AutoEnable: js.UndefOr[Boolean] = js.undefined
    ): UpdateOrganizationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "GraphArn" -> GraphArn.asInstanceOf[js.Any]
      )

      AutoEnable.foreach(__v => __obj.updateDynamic("AutoEnable")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateOrganizationConfigurationRequest]
    }
  }
}
