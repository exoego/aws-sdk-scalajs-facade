package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object detective {
  type AccountId = String
  type AccountIdList = js.Array[AccountId]
  type AccountList = js.Array[Account]
  type EmailAddress = String
  type EmailMessage = String
  type GraphArn = String
  type GraphList = js.Array[Graph]
  type MemberDetailList = js.Array[MemberDetail]
  type MemberResultsLimit = Int
  type PaginationToken = String
  type Percentage = Double
  type Timestamp = js.Date
  type UnprocessedAccountList = js.Array[UnprocessedAccount]
  type UnprocessedReason = String

  implicit final class DetectiveOps(private val service: Detective) extends AnyVal {

    @inline def acceptInvitationFuture(params: AcceptInvitationRequest): Future[js.Object] = service.acceptInvitation(params).promise().toFuture
    @inline def createGraphFuture(): Future[CreateGraphResponse] = service.createGraph().promise().toFuture
    @inline def createMembersFuture(params: CreateMembersRequest): Future[CreateMembersResponse] = service.createMembers(params).promise().toFuture
    @inline def deleteGraphFuture(params: DeleteGraphRequest): Future[js.Object] = service.deleteGraph(params).promise().toFuture
    @inline def deleteMembersFuture(params: DeleteMembersRequest): Future[DeleteMembersResponse] = service.deleteMembers(params).promise().toFuture
    @inline def disassociateMembershipFuture(params: DisassociateMembershipRequest): Future[js.Object] = service.disassociateMembership(params).promise().toFuture
    @inline def getMembersFuture(params: GetMembersRequest): Future[GetMembersResponse] = service.getMembers(params).promise().toFuture
    @inline def listGraphsFuture(params: ListGraphsRequest): Future[ListGraphsResponse] = service.listGraphs(params).promise().toFuture
    @inline def listInvitationsFuture(params: ListInvitationsRequest): Future[ListInvitationsResponse] = service.listInvitations(params).promise().toFuture
    @inline def listMembersFuture(params: ListMembersRequest): Future[ListMembersResponse] = service.listMembers(params).promise().toFuture
    @inline def rejectInvitationFuture(params: RejectInvitationRequest): Future[js.Object] = service.rejectInvitation(params).promise().toFuture
    @inline def startMonitoringMemberFuture(params: StartMonitoringMemberRequest): Future[js.Object] = service.startMonitoringMember(params).promise().toFuture
  }
}

package detective {
  @js.native
  @JSImport("aws-sdk", "Detective", "AWS.Detective")
  class Detective() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptInvitation(params: AcceptInvitationRequest): Request[js.Object] = js.native
    def createGraph(): Request[CreateGraphResponse] = js.native
    def createMembers(params: CreateMembersRequest): Request[CreateMembersResponse] = js.native
    def deleteGraph(params: DeleteGraphRequest): Request[js.Object] = js.native
    def deleteMembers(params: DeleteMembersRequest): Request[DeleteMembersResponse] = js.native
    def disassociateMembership(params: DisassociateMembershipRequest): Request[js.Object] = js.native
    def getMembers(params: GetMembersRequest): Request[GetMembersResponse] = js.native
    def listGraphs(params: ListGraphsRequest): Request[ListGraphsResponse] = js.native
    def listInvitations(params: ListInvitationsRequest): Request[ListInvitationsResponse] = js.native
    def listMembers(params: ListMembersRequest): Request[ListMembersResponse] = js.native
    def rejectInvitation(params: RejectInvitationRequest): Request[js.Object] = js.native
    def startMonitoringMember(params: StartMonitoringMemberRequest): Request[js.Object] = js.native
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

  /**
    * An AWS account that is the master of or a member of a behavior graph.
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
    var Message: js.UndefOr[EmailMessage]
  }

  object CreateMembersRequest {
    @inline
    def apply(
        Accounts: AccountList,
        GraphArn: GraphArn,
        Message: js.UndefOr[EmailMessage] = js.undefined
    ): CreateMembersRequest = {
      val __obj = js.Dynamic.literal(
        "Accounts" -> Accounts.asInstanceOf[js.Any],
        "GraphArn" -> GraphArn.asInstanceOf[js.Any]
      )

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

  /**
    * A behavior graph in Detective.
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

  /**
    * Details about a member account that was invited to contribute to a behavior graph.
    */
  @js.native
  trait MemberDetail extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var DisabledReason: js.UndefOr[MemberDisabledReason]
    var EmailAddress: js.UndefOr[EmailAddress]
    var GraphArn: js.UndefOr[GraphArn]
    var InvitedTime: js.UndefOr[Timestamp]
    var MasterId: js.UndefOr[AccountId]
    var PercentOfGraphUtilization: js.UndefOr[Percentage]
    var PercentOfGraphUtilizationUpdatedTime: js.UndefOr[Timestamp]
    var Status: js.UndefOr[MemberStatus]
    var UpdatedTime: js.UndefOr[Timestamp]
  }

  object MemberDetail {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        DisabledReason: js.UndefOr[MemberDisabledReason] = js.undefined,
        EmailAddress: js.UndefOr[EmailAddress] = js.undefined,
        GraphArn: js.UndefOr[GraphArn] = js.undefined,
        InvitedTime: js.UndefOr[Timestamp] = js.undefined,
        MasterId: js.UndefOr[AccountId] = js.undefined,
        PercentOfGraphUtilization: js.UndefOr[Percentage] = js.undefined,
        PercentOfGraphUtilizationUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[MemberStatus] = js.undefined,
        UpdatedTime: js.UndefOr[Timestamp] = js.undefined
    ): MemberDetail = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      DisabledReason.foreach(__v => __obj.updateDynamic("DisabledReason")(__v.asInstanceOf[js.Any]))
      EmailAddress.foreach(__v => __obj.updateDynamic("EmailAddress")(__v.asInstanceOf[js.Any]))
      GraphArn.foreach(__v => __obj.updateDynamic("GraphArn")(__v.asInstanceOf[js.Any]))
      InvitedTime.foreach(__v => __obj.updateDynamic("InvitedTime")(__v.asInstanceOf[js.Any]))
      MasterId.foreach(__v => __obj.updateDynamic("MasterId")(__v.asInstanceOf[js.Any]))
      PercentOfGraphUtilization.foreach(__v => __obj.updateDynamic("PercentOfGraphUtilization")(__v.asInstanceOf[js.Any]))
      PercentOfGraphUtilizationUpdatedTime.foreach(__v => __obj.updateDynamic("PercentOfGraphUtilizationUpdatedTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedTime.foreach(__v => __obj.updateDynamic("UpdatedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberDetail]
    }
  }

  @js.native
  sealed trait MemberDisabledReason extends js.Any
  object MemberDisabledReason {
    val VOLUME_TOO_HIGH = "VOLUME_TOO_HIGH".asInstanceOf[MemberDisabledReason]
    val VOLUME_UNKNOWN = "VOLUME_UNKNOWN".asInstanceOf[MemberDisabledReason]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(VOLUME_TOO_HIGH, VOLUME_UNKNOWN))
  }

  @js.native
  sealed trait MemberStatus extends js.Any
  object MemberStatus {
    val INVITED = "INVITED".asInstanceOf[MemberStatus]
    val VERIFICATION_IN_PROGRESS = "VERIFICATION_IN_PROGRESS".asInstanceOf[MemberStatus]
    val VERIFICATION_FAILED = "VERIFICATION_FAILED".asInstanceOf[MemberStatus]
    val ENABLED = "ENABLED".asInstanceOf[MemberStatus]
    val ACCEPTED_BUT_DISABLED = "ACCEPTED_BUT_DISABLED".asInstanceOf[MemberStatus]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INVITED, VERIFICATION_IN_PROGRESS, VERIFICATION_FAILED, ENABLED, ACCEPTED_BUT_DISABLED))
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

  /**
    * A member account that was included in a request but for which the request could not be processed.
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
}
