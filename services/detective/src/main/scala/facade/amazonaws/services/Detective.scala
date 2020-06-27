package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object detective {
  type AccountId              = String
  type AccountIdList          = js.Array[AccountId]
  type AccountList            = js.Array[Account]
  type EmailAddress           = String
  type EmailMessage           = String
  type GraphArn               = String
  type GraphList              = js.Array[Graph]
  type MemberDetailList       = js.Array[MemberDetail]
  type MemberResultsLimit     = Int
  type PaginationToken        = String
  type Timestamp              = js.Date
  type UnprocessedAccountList = js.Array[UnprocessedAccount]
  type UnprocessedReason      = String

  implicit final class DetectiveOps(private val service: Detective) extends AnyVal {

    @inline def acceptInvitationFuture(params: AcceptInvitationRequest): Future[js.Object] =
      service.acceptInvitation(params).promise().toFuture
    @inline def createGraphFuture(): Future[CreateGraphResponse] = service.createGraph().promise().toFuture
    @inline def createMembersFuture(params: CreateMembersRequest): Future[CreateMembersResponse] =
      service.createMembers(params).promise().toFuture
    @inline def deleteGraphFuture(params: DeleteGraphRequest): Future[js.Object] =
      service.deleteGraph(params).promise().toFuture
    @inline def deleteMembersFuture(params: DeleteMembersRequest): Future[DeleteMembersResponse] =
      service.deleteMembers(params).promise().toFuture
    @inline def disassociateMembershipFuture(params: DisassociateMembershipRequest): Future[js.Object] =
      service.disassociateMembership(params).promise().toFuture
    @inline def getMembersFuture(params: GetMembersRequest): Future[GetMembersResponse] =
      service.getMembers(params).promise().toFuture
    @inline def listGraphsFuture(params: ListGraphsRequest): Future[ListGraphsResponse] =
      service.listGraphs(params).promise().toFuture
    @inline def listInvitationsFuture(params: ListInvitationsRequest): Future[ListInvitationsResponse] =
      service.listInvitations(params).promise().toFuture
    @inline def listMembersFuture(params: ListMembersRequest): Future[ListMembersResponse] =
      service.listMembers(params).promise().toFuture
    @inline def rejectInvitationFuture(params: RejectInvitationRequest): Future[js.Object] =
      service.rejectInvitation(params).promise().toFuture
  }
}

package detective {
  @js.native
  @JSImport("aws-sdk", "Detective")
  class Detective() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptInvitation(params: AcceptInvitationRequest): Request[js.Object]             = js.native
    def createGraph(): Request[CreateGraphResponse]                                       = js.native
    def createMembers(params: CreateMembersRequest): Request[CreateMembersResponse]       = js.native
    def deleteGraph(params: DeleteGraphRequest): Request[js.Object]                       = js.native
    def deleteMembers(params: DeleteMembersRequest): Request[DeleteMembersResponse]       = js.native
    def disassociateMembership(params: DisassociateMembershipRequest): Request[js.Object] = js.native
    def getMembers(params: GetMembersRequest): Request[GetMembersResponse]                = js.native
    def listGraphs(params: ListGraphsRequest): Request[ListGraphsResponse]                = js.native
    def listInvitations(params: ListInvitationsRequest): Request[ListInvitationsResponse] = js.native
    def listMembers(params: ListMembersRequest): Request[ListMembersResponse]             = js.native
    def rejectInvitation(params: RejectInvitationRequest): Request[js.Object]             = js.native
  }

  @js.native
  @Factory
  trait AcceptInvitationRequest extends js.Object {
    var GraphArn: GraphArn
  }

  /**
    * Amazon Detective is currently in preview.
    *  An AWS account that is the master of or a member of a behavior graph.
    */
  @js.native
  @Factory
  trait Account extends js.Object {
    var AccountId: AccountId
    var EmailAddress: EmailAddress
  }

  @js.native
  @Factory
  trait CreateGraphResponse extends js.Object {
    var GraphArn: js.UndefOr[GraphArn]
  }

  @js.native
  @Factory
  trait CreateMembersRequest extends js.Object {
    var Accounts: AccountList
    var GraphArn: GraphArn
    var Message: js.UndefOr[EmailMessage]
  }

  @js.native
  @Factory
  trait CreateMembersResponse extends js.Object {
    var Members: js.UndefOr[MemberDetailList]
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccountList]
  }

  @js.native
  @Factory
  trait DeleteGraphRequest extends js.Object {
    var GraphArn: GraphArn
  }

  @js.native
  @Factory
  trait DeleteMembersRequest extends js.Object {
    var AccountIds: AccountIdList
    var GraphArn: GraphArn
  }

  @js.native
  @Factory
  trait DeleteMembersResponse extends js.Object {
    var AccountIds: js.UndefOr[AccountIdList]
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccountList]
  }

  @js.native
  @Factory
  trait DisassociateMembershipRequest extends js.Object {
    var GraphArn: GraphArn
  }

  @js.native
  @Factory
  trait GetMembersRequest extends js.Object {
    var AccountIds: AccountIdList
    var GraphArn: GraphArn
  }

  @js.native
  @Factory
  trait GetMembersResponse extends js.Object {
    var MemberDetails: js.UndefOr[MemberDetailList]
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccountList]
  }

  /**
    * Amazon Detective is currently in preview.
    *  A behavior graph in Detective.
    */
  @js.native
  @Factory
  trait Graph extends js.Object {
    var Arn: js.UndefOr[GraphArn]
    var CreatedTime: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait ListGraphsRequest extends js.Object {
    var MaxResults: js.UndefOr[MemberResultsLimit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListGraphsResponse extends js.Object {
    var GraphList: js.UndefOr[GraphList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListInvitationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MemberResultsLimit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListInvitationsResponse extends js.Object {
    var Invitations: js.UndefOr[MemberDetailList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListMembersRequest extends js.Object {
    var GraphArn: GraphArn
    var MaxResults: js.UndefOr[MemberResultsLimit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListMembersResponse extends js.Object {
    var MemberDetails: js.UndefOr[MemberDetailList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Amazon Detective is currently in preview.
    *  Details about a member account that was invited to contribute to a behavior graph.
    */
  @js.native
  @Factory
  trait MemberDetail extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var EmailAddress: js.UndefOr[EmailAddress]
    var GraphArn: js.UndefOr[GraphArn]
    var InvitedTime: js.UndefOr[Timestamp]
    var MasterId: js.UndefOr[AccountId]
    var Status: js.UndefOr[MemberStatus]
    var UpdatedTime: js.UndefOr[Timestamp]
  }

  @js.native
  sealed trait MemberStatus extends js.Any
  object MemberStatus extends js.Object {
    val INVITED                  = "INVITED".asInstanceOf[MemberStatus]
    val VERIFICATION_IN_PROGRESS = "VERIFICATION_IN_PROGRESS".asInstanceOf[MemberStatus]
    val VERIFICATION_FAILED      = "VERIFICATION_FAILED".asInstanceOf[MemberStatus]
    val ENABLED                  = "ENABLED".asInstanceOf[MemberStatus]

    val values = js.Object.freeze(js.Array(INVITED, VERIFICATION_IN_PROGRESS, VERIFICATION_FAILED, ENABLED))
  }

  @js.native
  @Factory
  trait RejectInvitationRequest extends js.Object {
    var GraphArn: GraphArn
  }

  /**
    * Amazon Detective is currently in preview.
    *  A member account that was included in a request but for which the request could not be processed.
    */
  @js.native
  @Factory
  trait UnprocessedAccount extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var Reason: js.UndefOr[UnprocessedReason]
  }
}
