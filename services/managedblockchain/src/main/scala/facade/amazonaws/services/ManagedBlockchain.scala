package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object managedblockchain {
  type AvailabilityZoneString   = String
  type ClientRequestTokenString = String
  type DescriptionString        = String
  type Edition                  = String
  type Framework                = String
  type FrameworkVersionString   = String
  type InstanceTypeString       = String
  type InvitationList           = js.Array[Invitation]
  type InvitationStatus         = String
  type InviteActionList         = js.Array[InviteAction]
  type IsOwned                  = Boolean
  type MemberListMaxResults     = Int
  type MemberStatus             = String
  type MemberSummaryList        = js.Array[MemberSummary]
  type NameString               = String
  type NetworkListMaxResults    = Int
  type NetworkMemberNameString  = String
  type NetworkStatus            = String
  type NetworkSummaryList       = js.Array[NetworkSummary]
  type NodeListMaxResults       = Int
  type NodeStatus               = String
  type NodeSummaryList          = js.Array[NodeSummary]
  type PaginationToken          = String
  type PasswordString           = String
  type PrincipalString          = String
  type ProposalDurationInt      = Int
  type ProposalListMaxResults   = Int
  type ProposalStatus           = String
  type ProposalSummaryList      = js.Array[ProposalSummary]
  type ProposalVoteList         = js.Array[VoteSummary]
  type RemoveActionList         = js.Array[RemoveAction]
  type ResourceIdString         = String
  type ThresholdComparator      = String
  type ThresholdPercentageInt   = Int
  type Timestamp                = js.Date
  type UsernameString           = String
  type VoteCount                = Int
  type VoteValue                = String

  implicit final class ManagedBlockchainOps(val service: ManagedBlockchain) extends AnyVal {

    def createMemberFuture(params: CreateMemberInput): Future[CreateMemberOutput] =
      service.createMember(params).promise.toFuture
    def createNetworkFuture(params: CreateNetworkInput): Future[CreateNetworkOutput] =
      service.createNetwork(params).promise.toFuture
    def createNodeFuture(params: CreateNodeInput): Future[CreateNodeOutput] =
      service.createNode(params).promise.toFuture
    def createProposalFuture(params: CreateProposalInput): Future[CreateProposalOutput] =
      service.createProposal(params).promise.toFuture
    def deleteMemberFuture(params: DeleteMemberInput): Future[DeleteMemberOutput] =
      service.deleteMember(params).promise.toFuture
    def deleteNodeFuture(params: DeleteNodeInput): Future[DeleteNodeOutput] =
      service.deleteNode(params).promise.toFuture
    def getMemberFuture(params: GetMemberInput): Future[GetMemberOutput] = service.getMember(params).promise.toFuture
    def getNetworkFuture(params: GetNetworkInput): Future[GetNetworkOutput] =
      service.getNetwork(params).promise.toFuture
    def getNodeFuture(params: GetNodeInput): Future[GetNodeOutput] = service.getNode(params).promise.toFuture
    def getProposalFuture(params: GetProposalInput): Future[GetProposalOutput] =
      service.getProposal(params).promise.toFuture
    def listInvitationsFuture(params: ListInvitationsInput): Future[ListInvitationsOutput] =
      service.listInvitations(params).promise.toFuture
    def listMembersFuture(params: ListMembersInput): Future[ListMembersOutput] =
      service.listMembers(params).promise.toFuture
    def listNetworksFuture(params: ListNetworksInput): Future[ListNetworksOutput] =
      service.listNetworks(params).promise.toFuture
    def listNodesFuture(params: ListNodesInput): Future[ListNodesOutput] = service.listNodes(params).promise.toFuture
    def listProposalVotesFuture(params: ListProposalVotesInput): Future[ListProposalVotesOutput] =
      service.listProposalVotes(params).promise.toFuture
    def listProposalsFuture(params: ListProposalsInput): Future[ListProposalsOutput] =
      service.listProposals(params).promise.toFuture
    def rejectInvitationFuture(params: RejectInvitationInput): Future[RejectInvitationOutput] =
      service.rejectInvitation(params).promise.toFuture
    def voteOnProposalFuture(params: VoteOnProposalInput): Future[VoteOnProposalOutput] =
      service.voteOnProposal(params).promise.toFuture
  }
}

package managedblockchain {
  @js.native
  @JSImport("aws-sdk", "ManagedBlockchain")
  class ManagedBlockchain() extends js.Object {
    def this(config: AWSConfig) = this()

    def createMember(params: CreateMemberInput): Request[CreateMemberOutput]                = js.native
    def createNetwork(params: CreateNetworkInput): Request[CreateNetworkOutput]             = js.native
    def createNode(params: CreateNodeInput): Request[CreateNodeOutput]                      = js.native
    def createProposal(params: CreateProposalInput): Request[CreateProposalOutput]          = js.native
    def deleteMember(params: DeleteMemberInput): Request[DeleteMemberOutput]                = js.native
    def deleteNode(params: DeleteNodeInput): Request[DeleteNodeOutput]                      = js.native
    def getMember(params: GetMemberInput): Request[GetMemberOutput]                         = js.native
    def getNetwork(params: GetNetworkInput): Request[GetNetworkOutput]                      = js.native
    def getNode(params: GetNodeInput): Request[GetNodeOutput]                               = js.native
    def getProposal(params: GetProposalInput): Request[GetProposalOutput]                   = js.native
    def listInvitations(params: ListInvitationsInput): Request[ListInvitationsOutput]       = js.native
    def listMembers(params: ListMembersInput): Request[ListMembersOutput]                   = js.native
    def listNetworks(params: ListNetworksInput): Request[ListNetworksOutput]                = js.native
    def listNodes(params: ListNodesInput): Request[ListNodesOutput]                         = js.native
    def listProposalVotes(params: ListProposalVotesInput): Request[ListProposalVotesOutput] = js.native
    def listProposals(params: ListProposalsInput): Request[ListProposalsOutput]             = js.native
    def rejectInvitation(params: RejectInvitationInput): Request[RejectInvitationOutput]    = js.native
    def voteOnProposal(params: VoteOnProposalInput): Request[VoteOnProposalOutput]          = js.native
  }

  /**
    * A policy type that defines the voting rules for the network. The rules decide if a proposal is approved. Approval may be based on criteria such as the percentage of <code>YES</code> votes and the duration of the proposal. The policy applies to all proposals and is specified when the network is created.
    */
  @js.native
  trait ApprovalThresholdPolicy extends js.Object {
    var ProposalDurationInHours: js.UndefOr[ProposalDurationInt]
    var ThresholdComparator: js.UndefOr[ThresholdComparator]
    var ThresholdPercentage: js.UndefOr[ThresholdPercentageInt]
  }

  object ApprovalThresholdPolicy {
    def apply(
        ProposalDurationInHours: js.UndefOr[ProposalDurationInt] = js.undefined,
        ThresholdComparator: js.UndefOr[ThresholdComparator] = js.undefined,
        ThresholdPercentage: js.UndefOr[ThresholdPercentageInt] = js.undefined
    ): ApprovalThresholdPolicy = {
      val __obj = js.Dictionary.empty[js.Any]
      ProposalDurationInHours.foreach(__v => __obj.update("ProposalDurationInHours", __v.asInstanceOf[js.Any]))
      ThresholdComparator.foreach(__v => __obj.update("ThresholdComparator", __v.asInstanceOf[js.Any]))
      ThresholdPercentage.foreach(__v => __obj.update("ThresholdPercentage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApprovalThresholdPolicy]
    }
  }

  @js.native
  trait CreateMemberInput extends js.Object {
    var ClientRequestToken: ClientRequestTokenString
    var InvitationId: ResourceIdString
    var MemberConfiguration: MemberConfiguration
    var NetworkId: ResourceIdString
  }

  object CreateMemberInput {
    def apply(
        ClientRequestToken: ClientRequestTokenString,
        InvitationId: ResourceIdString,
        MemberConfiguration: MemberConfiguration,
        NetworkId: ResourceIdString
    ): CreateMemberInput = {
      val __obj = js.Dictionary[js.Any](
        "ClientRequestToken"  -> ClientRequestToken.asInstanceOf[js.Any],
        "InvitationId"        -> InvitationId.asInstanceOf[js.Any],
        "MemberConfiguration" -> MemberConfiguration.asInstanceOf[js.Any],
        "NetworkId"           -> NetworkId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateMemberInput]
    }
  }

  @js.native
  trait CreateMemberOutput extends js.Object {
    var MemberId: js.UndefOr[ResourceIdString]
  }

  object CreateMemberOutput {
    def apply(
        MemberId: js.UndefOr[ResourceIdString] = js.undefined
    ): CreateMemberOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      MemberId.foreach(__v => __obj.update("MemberId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMemberOutput]
    }
  }

  @js.native
  trait CreateNetworkInput extends js.Object {
    var ClientRequestToken: ClientRequestTokenString
    var Framework: Framework
    var FrameworkVersion: FrameworkVersionString
    var MemberConfiguration: MemberConfiguration
    var Name: NameString
    var VotingPolicy: VotingPolicy
    var Description: js.UndefOr[DescriptionString]
    var FrameworkConfiguration: js.UndefOr[NetworkFrameworkConfiguration]
  }

  object CreateNetworkInput {
    def apply(
        ClientRequestToken: ClientRequestTokenString,
        Framework: Framework,
        FrameworkVersion: FrameworkVersionString,
        MemberConfiguration: MemberConfiguration,
        Name: NameString,
        VotingPolicy: VotingPolicy,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        FrameworkConfiguration: js.UndefOr[NetworkFrameworkConfiguration] = js.undefined
    ): CreateNetworkInput = {
      val __obj = js.Dictionary[js.Any](
        "ClientRequestToken"  -> ClientRequestToken.asInstanceOf[js.Any],
        "Framework"           -> Framework.asInstanceOf[js.Any],
        "FrameworkVersion"    -> FrameworkVersion.asInstanceOf[js.Any],
        "MemberConfiguration" -> MemberConfiguration.asInstanceOf[js.Any],
        "Name"                -> Name.asInstanceOf[js.Any],
        "VotingPolicy"        -> VotingPolicy.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      FrameworkConfiguration.foreach(__v => __obj.update("FrameworkConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNetworkInput]
    }
  }

  @js.native
  trait CreateNetworkOutput extends js.Object {
    var MemberId: js.UndefOr[ResourceIdString]
    var NetworkId: js.UndefOr[ResourceIdString]
  }

  object CreateNetworkOutput {
    def apply(
        MemberId: js.UndefOr[ResourceIdString] = js.undefined,
        NetworkId: js.UndefOr[ResourceIdString] = js.undefined
    ): CreateNetworkOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      MemberId.foreach(__v => __obj.update("MemberId", __v.asInstanceOf[js.Any]))
      NetworkId.foreach(__v => __obj.update("NetworkId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNetworkOutput]
    }
  }

  @js.native
  trait CreateNodeInput extends js.Object {
    var ClientRequestToken: ClientRequestTokenString
    var MemberId: ResourceIdString
    var NetworkId: ResourceIdString
    var NodeConfiguration: NodeConfiguration
  }

  object CreateNodeInput {
    def apply(
        ClientRequestToken: ClientRequestTokenString,
        MemberId: ResourceIdString,
        NetworkId: ResourceIdString,
        NodeConfiguration: NodeConfiguration
    ): CreateNodeInput = {
      val __obj = js.Dictionary[js.Any](
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "MemberId"           -> MemberId.asInstanceOf[js.Any],
        "NetworkId"          -> NetworkId.asInstanceOf[js.Any],
        "NodeConfiguration"  -> NodeConfiguration.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateNodeInput]
    }
  }

  @js.native
  trait CreateNodeOutput extends js.Object {
    var NodeId: js.UndefOr[ResourceIdString]
  }

  object CreateNodeOutput {
    def apply(
        NodeId: js.UndefOr[ResourceIdString] = js.undefined
    ): CreateNodeOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NodeId.foreach(__v => __obj.update("NodeId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNodeOutput]
    }
  }

  @js.native
  trait CreateProposalInput extends js.Object {
    var Actions: ProposalActions
    var ClientRequestToken: ClientRequestTokenString
    var MemberId: ResourceIdString
    var NetworkId: ResourceIdString
    var Description: js.UndefOr[DescriptionString]
  }

  object CreateProposalInput {
    def apply(
        Actions: ProposalActions,
        ClientRequestToken: ClientRequestTokenString,
        MemberId: ResourceIdString,
        NetworkId: ResourceIdString,
        Description: js.UndefOr[DescriptionString] = js.undefined
    ): CreateProposalInput = {
      val __obj = js.Dictionary[js.Any](
        "Actions"            -> Actions.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "MemberId"           -> MemberId.asInstanceOf[js.Any],
        "NetworkId"          -> NetworkId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProposalInput]
    }
  }

  @js.native
  trait CreateProposalOutput extends js.Object {
    var ProposalId: js.UndefOr[ResourceIdString]
  }

  object CreateProposalOutput {
    def apply(
        ProposalId: js.UndefOr[ResourceIdString] = js.undefined
    ): CreateProposalOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ProposalId.foreach(__v => __obj.update("ProposalId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProposalOutput]
    }
  }

  @js.native
  trait DeleteMemberInput extends js.Object {
    var MemberId: ResourceIdString
    var NetworkId: ResourceIdString
  }

  object DeleteMemberInput {
    def apply(
        MemberId: ResourceIdString,
        NetworkId: ResourceIdString
    ): DeleteMemberInput = {
      val __obj = js.Dictionary[js.Any](
        "MemberId"  -> MemberId.asInstanceOf[js.Any],
        "NetworkId" -> NetworkId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteMemberInput]
    }
  }

  @js.native
  trait DeleteMemberOutput extends js.Object {}

  object DeleteMemberOutput {
    def apply(
        ): DeleteMemberOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteMemberOutput]
    }
  }

  @js.native
  trait DeleteNodeInput extends js.Object {
    var MemberId: ResourceIdString
    var NetworkId: ResourceIdString
    var NodeId: ResourceIdString
  }

  object DeleteNodeInput {
    def apply(
        MemberId: ResourceIdString,
        NetworkId: ResourceIdString,
        NodeId: ResourceIdString
    ): DeleteNodeInput = {
      val __obj = js.Dictionary[js.Any](
        "MemberId"  -> MemberId.asInstanceOf[js.Any],
        "NetworkId" -> NetworkId.asInstanceOf[js.Any],
        "NodeId"    -> NodeId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteNodeInput]
    }
  }

  @js.native
  trait DeleteNodeOutput extends js.Object {}

  object DeleteNodeOutput {
    def apply(
        ): DeleteNodeOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteNodeOutput]
    }
  }

  object EditionEnum {
    val STARTER  = "STARTER"
    val STANDARD = "STANDARD"

    val values = IndexedSeq(STARTER, STANDARD)
  }

  object FrameworkEnum {
    val HYPERLEDGER_FABRIC = "HYPERLEDGER_FABRIC"

    val values = IndexedSeq(HYPERLEDGER_FABRIC)
  }

  @js.native
  trait GetMemberInput extends js.Object {
    var MemberId: ResourceIdString
    var NetworkId: ResourceIdString
  }

  object GetMemberInput {
    def apply(
        MemberId: ResourceIdString,
        NetworkId: ResourceIdString
    ): GetMemberInput = {
      val __obj = js.Dictionary[js.Any](
        "MemberId"  -> MemberId.asInstanceOf[js.Any],
        "NetworkId" -> NetworkId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetMemberInput]
    }
  }

  @js.native
  trait GetMemberOutput extends js.Object {
    var Member: js.UndefOr[Member]
  }

  object GetMemberOutput {
    def apply(
        Member: js.UndefOr[Member] = js.undefined
    ): GetMemberOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Member.foreach(__v => __obj.update("Member", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMemberOutput]
    }
  }

  @js.native
  trait GetNetworkInput extends js.Object {
    var NetworkId: ResourceIdString
  }

  object GetNetworkInput {
    def apply(
        NetworkId: ResourceIdString
    ): GetNetworkInput = {
      val __obj = js.Dictionary[js.Any](
        "NetworkId" -> NetworkId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetNetworkInput]
    }
  }

  @js.native
  trait GetNetworkOutput extends js.Object {
    var Network: js.UndefOr[Network]
  }

  object GetNetworkOutput {
    def apply(
        Network: js.UndefOr[Network] = js.undefined
    ): GetNetworkOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Network.foreach(__v => __obj.update("Network", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNetworkOutput]
    }
  }

  @js.native
  trait GetNodeInput extends js.Object {
    var MemberId: ResourceIdString
    var NetworkId: ResourceIdString
    var NodeId: ResourceIdString
  }

  object GetNodeInput {
    def apply(
        MemberId: ResourceIdString,
        NetworkId: ResourceIdString,
        NodeId: ResourceIdString
    ): GetNodeInput = {
      val __obj = js.Dictionary[js.Any](
        "MemberId"  -> MemberId.asInstanceOf[js.Any],
        "NetworkId" -> NetworkId.asInstanceOf[js.Any],
        "NodeId"    -> NodeId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetNodeInput]
    }
  }

  @js.native
  trait GetNodeOutput extends js.Object {
    var Node: js.UndefOr[Node]
  }

  object GetNodeOutput {
    def apply(
        Node: js.UndefOr[Node] = js.undefined
    ): GetNodeOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Node.foreach(__v => __obj.update("Node", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNodeOutput]
    }
  }

  @js.native
  trait GetProposalInput extends js.Object {
    var NetworkId: ResourceIdString
    var ProposalId: ResourceIdString
  }

  object GetProposalInput {
    def apply(
        NetworkId: ResourceIdString,
        ProposalId: ResourceIdString
    ): GetProposalInput = {
      val __obj = js.Dictionary[js.Any](
        "NetworkId"  -> NetworkId.asInstanceOf[js.Any],
        "ProposalId" -> ProposalId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetProposalInput]
    }
  }

  @js.native
  trait GetProposalOutput extends js.Object {
    var Proposal: js.UndefOr[Proposal]
  }

  object GetProposalOutput {
    def apply(
        Proposal: js.UndefOr[Proposal] = js.undefined
    ): GetProposalOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Proposal.foreach(__v => __obj.update("Proposal", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProposalOutput]
    }
  }

  /**
    * An invitation to an AWS account to create a member and join the network.
    */
  @js.native
  trait Invitation extends js.Object {
    var CreationDate: js.UndefOr[Timestamp]
    var ExpirationDate: js.UndefOr[Timestamp]
    var InvitationId: js.UndefOr[ResourceIdString]
    var NetworkSummary: js.UndefOr[NetworkSummary]
    var Status: js.UndefOr[InvitationStatus]
  }

  object Invitation {
    def apply(
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        ExpirationDate: js.UndefOr[Timestamp] = js.undefined,
        InvitationId: js.UndefOr[ResourceIdString] = js.undefined,
        NetworkSummary: js.UndefOr[NetworkSummary] = js.undefined,
        Status: js.UndefOr[InvitationStatus] = js.undefined
    ): Invitation = {
      val __obj = js.Dictionary.empty[js.Any]
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      ExpirationDate.foreach(__v => __obj.update("ExpirationDate", __v.asInstanceOf[js.Any]))
      InvitationId.foreach(__v => __obj.update("InvitationId", __v.asInstanceOf[js.Any]))
      NetworkSummary.foreach(__v => __obj.update("NetworkSummary", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Invitation]
    }
  }

  object InvitationStatusEnum {
    val PENDING   = "PENDING"
    val ACCEPTED  = "ACCEPTED"
    val ACCEPTING = "ACCEPTING"
    val REJECTED  = "REJECTED"
    val EXPIRED   = "EXPIRED"

    val values = IndexedSeq(PENDING, ACCEPTED, ACCEPTING, REJECTED, EXPIRED)
  }

  /**
    * An action to invite a specific AWS account to create a member and join the network. The <code>InviteAction</code> is carried out when a <code>Proposal</code> is <code>APPROVED</code>.
    */
  @js.native
  trait InviteAction extends js.Object {
    var Principal: PrincipalString
  }

  object InviteAction {
    def apply(
        Principal: PrincipalString
    ): InviteAction = {
      val __obj = js.Dictionary[js.Any](
        "Principal" -> Principal.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InviteAction]
    }
  }

  @js.native
  trait ListInvitationsInput extends js.Object {
    var MaxResults: js.UndefOr[ProposalListMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListInvitationsInput {
    def apply(
        MaxResults: js.UndefOr[ProposalListMaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListInvitationsInput = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInvitationsInput]
    }
  }

  @js.native
  trait ListInvitationsOutput extends js.Object {
    var Invitations: js.UndefOr[InvitationList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListInvitationsOutput {
    def apply(
        Invitations: js.UndefOr[InvitationList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListInvitationsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Invitations.foreach(__v => __obj.update("Invitations", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInvitationsOutput]
    }
  }

  @js.native
  trait ListMembersInput extends js.Object {
    var NetworkId: ResourceIdString
    var IsOwned: js.UndefOr[IsOwned]
    var MaxResults: js.UndefOr[MemberListMaxResults]
    var Name: js.UndefOr[String]
    var NextToken: js.UndefOr[PaginationToken]
    var Status: js.UndefOr[MemberStatus]
  }

  object ListMembersInput {
    def apply(
        NetworkId: ResourceIdString,
        IsOwned: js.UndefOr[IsOwned] = js.undefined,
        MaxResults: js.UndefOr[MemberListMaxResults] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Status: js.UndefOr[MemberStatus] = js.undefined
    ): ListMembersInput = {
      val __obj = js.Dictionary[js.Any](
        "NetworkId" -> NetworkId.asInstanceOf[js.Any]
      )

      IsOwned.foreach(__v => __obj.update("IsOwned", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMembersInput]
    }
  }

  @js.native
  trait ListMembersOutput extends js.Object {
    var Members: js.UndefOr[MemberSummaryList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListMembersOutput {
    def apply(
        Members: js.UndefOr[MemberSummaryList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListMembersOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Members.foreach(__v => __obj.update("Members", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMembersOutput]
    }
  }

  @js.native
  trait ListNetworksInput extends js.Object {
    var Framework: js.UndefOr[Framework]
    var MaxResults: js.UndefOr[NetworkListMaxResults]
    var Name: js.UndefOr[String]
    var NextToken: js.UndefOr[PaginationToken]
    var Status: js.UndefOr[NetworkStatus]
  }

  object ListNetworksInput {
    def apply(
        Framework: js.UndefOr[Framework] = js.undefined,
        MaxResults: js.UndefOr[NetworkListMaxResults] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Status: js.UndefOr[NetworkStatus] = js.undefined
    ): ListNetworksInput = {
      val __obj = js.Dictionary.empty[js.Any]
      Framework.foreach(__v => __obj.update("Framework", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNetworksInput]
    }
  }

  @js.native
  trait ListNetworksOutput extends js.Object {
    var Networks: js.UndefOr[NetworkSummaryList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListNetworksOutput {
    def apply(
        Networks: js.UndefOr[NetworkSummaryList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListNetworksOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Networks.foreach(__v => __obj.update("Networks", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNetworksOutput]
    }
  }

  @js.native
  trait ListNodesInput extends js.Object {
    var MemberId: ResourceIdString
    var NetworkId: ResourceIdString
    var MaxResults: js.UndefOr[NodeListMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
    var Status: js.UndefOr[NodeStatus]
  }

  object ListNodesInput {
    def apply(
        MemberId: ResourceIdString,
        NetworkId: ResourceIdString,
        MaxResults: js.UndefOr[NodeListMaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Status: js.UndefOr[NodeStatus] = js.undefined
    ): ListNodesInput = {
      val __obj = js.Dictionary[js.Any](
        "MemberId"  -> MemberId.asInstanceOf[js.Any],
        "NetworkId" -> NetworkId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNodesInput]
    }
  }

  @js.native
  trait ListNodesOutput extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var Nodes: js.UndefOr[NodeSummaryList]
  }

  object ListNodesOutput {
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Nodes: js.UndefOr[NodeSummaryList] = js.undefined
    ): ListNodesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Nodes.foreach(__v => __obj.update("Nodes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNodesOutput]
    }
  }

  @js.native
  trait ListProposalVotesInput extends js.Object {
    var NetworkId: ResourceIdString
    var ProposalId: ResourceIdString
    var MaxResults: js.UndefOr[ProposalListMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListProposalVotesInput {
    def apply(
        NetworkId: ResourceIdString,
        ProposalId: ResourceIdString,
        MaxResults: js.UndefOr[ProposalListMaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListProposalVotesInput = {
      val __obj = js.Dictionary[js.Any](
        "NetworkId"  -> NetworkId.asInstanceOf[js.Any],
        "ProposalId" -> ProposalId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProposalVotesInput]
    }
  }

  @js.native
  trait ListProposalVotesOutput extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var ProposalVotes: js.UndefOr[ProposalVoteList]
  }

  object ListProposalVotesOutput {
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        ProposalVotes: js.UndefOr[ProposalVoteList] = js.undefined
    ): ListProposalVotesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ProposalVotes.foreach(__v => __obj.update("ProposalVotes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProposalVotesOutput]
    }
  }

  @js.native
  trait ListProposalsInput extends js.Object {
    var NetworkId: ResourceIdString
    var MaxResults: js.UndefOr[ProposalListMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListProposalsInput {
    def apply(
        NetworkId: ResourceIdString,
        MaxResults: js.UndefOr[ProposalListMaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListProposalsInput = {
      val __obj = js.Dictionary[js.Any](
        "NetworkId" -> NetworkId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProposalsInput]
    }
  }

  @js.native
  trait ListProposalsOutput extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var Proposals: js.UndefOr[ProposalSummaryList]
  }

  object ListProposalsOutput {
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Proposals: js.UndefOr[ProposalSummaryList] = js.undefined
    ): ListProposalsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Proposals.foreach(__v => __obj.update("Proposals", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProposalsOutput]
    }
  }

  /**
    * Member configuration properties.
    */
  @js.native
  trait Member extends js.Object {
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var FrameworkAttributes: js.UndefOr[MemberFrameworkAttributes]
    var Id: js.UndefOr[ResourceIdString]
    var Name: js.UndefOr[NetworkMemberNameString]
    var NetworkId: js.UndefOr[ResourceIdString]
    var Status: js.UndefOr[MemberStatus]
  }

  object Member {
    def apply(
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        FrameworkAttributes: js.UndefOr[MemberFrameworkAttributes] = js.undefined,
        Id: js.UndefOr[ResourceIdString] = js.undefined,
        Name: js.UndefOr[NetworkMemberNameString] = js.undefined,
        NetworkId: js.UndefOr[ResourceIdString] = js.undefined,
        Status: js.UndefOr[MemberStatus] = js.undefined
    ): Member = {
      val __obj = js.Dictionary.empty[js.Any]
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      FrameworkAttributes.foreach(__v => __obj.update("FrameworkAttributes", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      NetworkId.foreach(__v => __obj.update("NetworkId", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Member]
    }
  }

  /**
    * Configuration properties of the member.
    */
  @js.native
  trait MemberConfiguration extends js.Object {
    var FrameworkConfiguration: MemberFrameworkConfiguration
    var Name: NetworkMemberNameString
    var Description: js.UndefOr[DescriptionString]
  }

  object MemberConfiguration {
    def apply(
        FrameworkConfiguration: MemberFrameworkConfiguration,
        Name: NetworkMemberNameString,
        Description: js.UndefOr[DescriptionString] = js.undefined
    ): MemberConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "FrameworkConfiguration" -> FrameworkConfiguration.asInstanceOf[js.Any],
        "Name"                   -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberConfiguration]
    }
  }

  /**
    * Attributes of Hyperledger Fabric for a member in a Managed Blockchain network using the Hyperledger Fabric framework.
    */
  @js.native
  trait MemberFabricAttributes extends js.Object {
    var AdminUsername: js.UndefOr[UsernameString]
    var CaEndpoint: js.UndefOr[String]
  }

  object MemberFabricAttributes {
    def apply(
        AdminUsername: js.UndefOr[UsernameString] = js.undefined,
        CaEndpoint: js.UndefOr[String] = js.undefined
    ): MemberFabricAttributes = {
      val __obj = js.Dictionary.empty[js.Any]
      AdminUsername.foreach(__v => __obj.update("AdminUsername", __v.asInstanceOf[js.Any]))
      CaEndpoint.foreach(__v => __obj.update("CaEndpoint", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberFabricAttributes]
    }
  }

  /**
    * Configuration properties for Hyperledger Fabric for a member in a Managed Blockchain network using the Hyperledger Fabric framework.
    */
  @js.native
  trait MemberFabricConfiguration extends js.Object {
    var AdminPassword: PasswordString
    var AdminUsername: UsernameString
  }

  object MemberFabricConfiguration {
    def apply(
        AdminPassword: PasswordString,
        AdminUsername: UsernameString
    ): MemberFabricConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "AdminPassword" -> AdminPassword.asInstanceOf[js.Any],
        "AdminUsername" -> AdminUsername.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MemberFabricConfiguration]
    }
  }

  /**
    * Attributes relevant to a member for the blockchain framework that the Managed Blockchain network uses.
    */
  @js.native
  trait MemberFrameworkAttributes extends js.Object {
    var Fabric: js.UndefOr[MemberFabricAttributes]
  }

  object MemberFrameworkAttributes {
    def apply(
        Fabric: js.UndefOr[MemberFabricAttributes] = js.undefined
    ): MemberFrameworkAttributes = {
      val __obj = js.Dictionary.empty[js.Any]
      Fabric.foreach(__v => __obj.update("Fabric", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberFrameworkAttributes]
    }
  }

  /**
    * Configuration properties relevant to a member for the blockchain framework that the Managed Blockchain network uses.
    */
  @js.native
  trait MemberFrameworkConfiguration extends js.Object {
    var Fabric: js.UndefOr[MemberFabricConfiguration]
  }

  object MemberFrameworkConfiguration {
    def apply(
        Fabric: js.UndefOr[MemberFabricConfiguration] = js.undefined
    ): MemberFrameworkConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      Fabric.foreach(__v => __obj.update("Fabric", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberFrameworkConfiguration]
    }
  }

  object MemberStatusEnum {
    val CREATING      = "CREATING"
    val AVAILABLE     = "AVAILABLE"
    val CREATE_FAILED = "CREATE_FAILED"
    val DELETING      = "DELETING"
    val DELETED       = "DELETED"

    val values = IndexedSeq(CREATING, AVAILABLE, CREATE_FAILED, DELETING, DELETED)
  }

  /**
    * A summary of configuration properties for a member.
    */
  @js.native
  trait MemberSummary extends js.Object {
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var Id: js.UndefOr[ResourceIdString]
    var IsOwned: js.UndefOr[IsOwned]
    var Name: js.UndefOr[NetworkMemberNameString]
    var Status: js.UndefOr[MemberStatus]
  }

  object MemberSummary {
    def apply(
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Id: js.UndefOr[ResourceIdString] = js.undefined,
        IsOwned: js.UndefOr[IsOwned] = js.undefined,
        Name: js.UndefOr[NetworkMemberNameString] = js.undefined,
        Status: js.UndefOr[MemberStatus] = js.undefined
    ): MemberSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      IsOwned.foreach(__v => __obj.update("IsOwned", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberSummary]
    }
  }

  /**
    * Network configuration properties.
    */
  @js.native
  trait Network extends js.Object {
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var Framework: js.UndefOr[Framework]
    var FrameworkAttributes: js.UndefOr[NetworkFrameworkAttributes]
    var FrameworkVersion: js.UndefOr[FrameworkVersionString]
    var Id: js.UndefOr[ResourceIdString]
    var Name: js.UndefOr[NameString]
    var Status: js.UndefOr[NetworkStatus]
    var VotingPolicy: js.UndefOr[VotingPolicy]
    var VpcEndpointServiceName: js.UndefOr[String]
  }

  object Network {
    def apply(
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Framework: js.UndefOr[Framework] = js.undefined,
        FrameworkAttributes: js.UndefOr[NetworkFrameworkAttributes] = js.undefined,
        FrameworkVersion: js.UndefOr[FrameworkVersionString] = js.undefined,
        Id: js.UndefOr[ResourceIdString] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        Status: js.UndefOr[NetworkStatus] = js.undefined,
        VotingPolicy: js.UndefOr[VotingPolicy] = js.undefined,
        VpcEndpointServiceName: js.UndefOr[String] = js.undefined
    ): Network = {
      val __obj = js.Dictionary.empty[js.Any]
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Framework.foreach(__v => __obj.update("Framework", __v.asInstanceOf[js.Any]))
      FrameworkAttributes.foreach(__v => __obj.update("FrameworkAttributes", __v.asInstanceOf[js.Any]))
      FrameworkVersion.foreach(__v => __obj.update("FrameworkVersion", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      VotingPolicy.foreach(__v => __obj.update("VotingPolicy", __v.asInstanceOf[js.Any]))
      VpcEndpointServiceName.foreach(__v => __obj.update("VpcEndpointServiceName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Network]
    }
  }

  /**
    * Attributes of Hyperledger Fabric for a network.
    */
  @js.native
  trait NetworkFabricAttributes extends js.Object {
    var Edition: js.UndefOr[Edition]
    var OrderingServiceEndpoint: js.UndefOr[String]
  }

  object NetworkFabricAttributes {
    def apply(
        Edition: js.UndefOr[Edition] = js.undefined,
        OrderingServiceEndpoint: js.UndefOr[String] = js.undefined
    ): NetworkFabricAttributes = {
      val __obj = js.Dictionary.empty[js.Any]
      Edition.foreach(__v => __obj.update("Edition", __v.asInstanceOf[js.Any]))
      OrderingServiceEndpoint.foreach(__v => __obj.update("OrderingServiceEndpoint", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkFabricAttributes]
    }
  }

  /**
    * Hyperledger Fabric configuration properties for the network.
    */
  @js.native
  trait NetworkFabricConfiguration extends js.Object {
    var Edition: Edition
  }

  object NetworkFabricConfiguration {
    def apply(
        Edition: Edition
    ): NetworkFabricConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "Edition" -> Edition.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[NetworkFabricConfiguration]
    }
  }

  /**
    * Attributes relevant to the network for the blockchain framework that the network uses.
    */
  @js.native
  trait NetworkFrameworkAttributes extends js.Object {
    var Fabric: js.UndefOr[NetworkFabricAttributes]
  }

  object NetworkFrameworkAttributes {
    def apply(
        Fabric: js.UndefOr[NetworkFabricAttributes] = js.undefined
    ): NetworkFrameworkAttributes = {
      val __obj = js.Dictionary.empty[js.Any]
      Fabric.foreach(__v => __obj.update("Fabric", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkFrameworkAttributes]
    }
  }

  /**
    * Configuration properties relevant to the network for the blockchain framework that the network uses.
    */
  @js.native
  trait NetworkFrameworkConfiguration extends js.Object {
    var Fabric: js.UndefOr[NetworkFabricConfiguration]
  }

  object NetworkFrameworkConfiguration {
    def apply(
        Fabric: js.UndefOr[NetworkFabricConfiguration] = js.undefined
    ): NetworkFrameworkConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      Fabric.foreach(__v => __obj.update("Fabric", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkFrameworkConfiguration]
    }
  }

  object NetworkStatusEnum {
    val CREATING      = "CREATING"
    val AVAILABLE     = "AVAILABLE"
    val CREATE_FAILED = "CREATE_FAILED"
    val DELETING      = "DELETING"
    val DELETED       = "DELETED"

    val values = IndexedSeq(CREATING, AVAILABLE, CREATE_FAILED, DELETING, DELETED)
  }

  /**
    * A summary of network configuration properties.
    */
  @js.native
  trait NetworkSummary extends js.Object {
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var Framework: js.UndefOr[Framework]
    var FrameworkVersion: js.UndefOr[FrameworkVersionString]
    var Id: js.UndefOr[ResourceIdString]
    var Name: js.UndefOr[NameString]
    var Status: js.UndefOr[NetworkStatus]
  }

  object NetworkSummary {
    def apply(
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Framework: js.UndefOr[Framework] = js.undefined,
        FrameworkVersion: js.UndefOr[FrameworkVersionString] = js.undefined,
        Id: js.UndefOr[ResourceIdString] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        Status: js.UndefOr[NetworkStatus] = js.undefined
    ): NetworkSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Framework.foreach(__v => __obj.update("Framework", __v.asInstanceOf[js.Any]))
      FrameworkVersion.foreach(__v => __obj.update("FrameworkVersion", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkSummary]
    }
  }

  /**
    * Configuration properties of a peer node.
    */
  @js.native
  trait Node extends js.Object {
    var AvailabilityZone: js.UndefOr[AvailabilityZoneString]
    var CreationDate: js.UndefOr[Timestamp]
    var FrameworkAttributes: js.UndefOr[NodeFrameworkAttributes]
    var Id: js.UndefOr[ResourceIdString]
    var InstanceType: js.UndefOr[InstanceTypeString]
    var MemberId: js.UndefOr[ResourceIdString]
    var NetworkId: js.UndefOr[ResourceIdString]
    var Status: js.UndefOr[NodeStatus]
  }

  object Node {
    def apply(
        AvailabilityZone: js.UndefOr[AvailabilityZoneString] = js.undefined,
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        FrameworkAttributes: js.UndefOr[NodeFrameworkAttributes] = js.undefined,
        Id: js.UndefOr[ResourceIdString] = js.undefined,
        InstanceType: js.UndefOr[InstanceTypeString] = js.undefined,
        MemberId: js.UndefOr[ResourceIdString] = js.undefined,
        NetworkId: js.UndefOr[ResourceIdString] = js.undefined,
        Status: js.UndefOr[NodeStatus] = js.undefined
    ): Node = {
      val __obj = js.Dictionary.empty[js.Any]
      AvailabilityZone.foreach(__v => __obj.update("AvailabilityZone", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      FrameworkAttributes.foreach(__v => __obj.update("FrameworkAttributes", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.update("InstanceType", __v.asInstanceOf[js.Any]))
      MemberId.foreach(__v => __obj.update("MemberId", __v.asInstanceOf[js.Any]))
      NetworkId.foreach(__v => __obj.update("NetworkId", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Node]
    }
  }

  /**
    * Configuration properties of a peer node.
    */
  @js.native
  trait NodeConfiguration extends js.Object {
    var AvailabilityZone: AvailabilityZoneString
    var InstanceType: InstanceTypeString
  }

  object NodeConfiguration {
    def apply(
        AvailabilityZone: AvailabilityZoneString,
        InstanceType: InstanceTypeString
    ): NodeConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "AvailabilityZone" -> AvailabilityZone.asInstanceOf[js.Any],
        "InstanceType"     -> InstanceType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[NodeConfiguration]
    }
  }

  /**
    * Attributes of Hyperledger Fabric for a peer node on a Managed Blockchain network that uses Hyperledger Fabric.
    */
  @js.native
  trait NodeFabricAttributes extends js.Object {
    var PeerEndpoint: js.UndefOr[String]
    var PeerEventEndpoint: js.UndefOr[String]
  }

  object NodeFabricAttributes {
    def apply(
        PeerEndpoint: js.UndefOr[String] = js.undefined,
        PeerEventEndpoint: js.UndefOr[String] = js.undefined
    ): NodeFabricAttributes = {
      val __obj = js.Dictionary.empty[js.Any]
      PeerEndpoint.foreach(__v => __obj.update("PeerEndpoint", __v.asInstanceOf[js.Any]))
      PeerEventEndpoint.foreach(__v => __obj.update("PeerEventEndpoint", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeFabricAttributes]
    }
  }

  /**
    * Attributes relevant to a peer node on a Managed Blockchain network for the blockchain framework that the network uses.
    */
  @js.native
  trait NodeFrameworkAttributes extends js.Object {
    var Fabric: js.UndefOr[NodeFabricAttributes]
  }

  object NodeFrameworkAttributes {
    def apply(
        Fabric: js.UndefOr[NodeFabricAttributes] = js.undefined
    ): NodeFrameworkAttributes = {
      val __obj = js.Dictionary.empty[js.Any]
      Fabric.foreach(__v => __obj.update("Fabric", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeFrameworkAttributes]
    }
  }

  object NodeStatusEnum {
    val CREATING      = "CREATING"
    val AVAILABLE     = "AVAILABLE"
    val CREATE_FAILED = "CREATE_FAILED"
    val DELETING      = "DELETING"
    val DELETED       = "DELETED"
    val FAILED        = "FAILED"

    val values = IndexedSeq(CREATING, AVAILABLE, CREATE_FAILED, DELETING, DELETED, FAILED)
  }

  /**
    * A summary of configuration properties for a peer node.
    */
  @js.native
  trait NodeSummary extends js.Object {
    var AvailabilityZone: js.UndefOr[AvailabilityZoneString]
    var CreationDate: js.UndefOr[Timestamp]
    var Id: js.UndefOr[ResourceIdString]
    var InstanceType: js.UndefOr[InstanceTypeString]
    var Status: js.UndefOr[NodeStatus]
  }

  object NodeSummary {
    def apply(
        AvailabilityZone: js.UndefOr[AvailabilityZoneString] = js.undefined,
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        Id: js.UndefOr[ResourceIdString] = js.undefined,
        InstanceType: js.UndefOr[InstanceTypeString] = js.undefined,
        Status: js.UndefOr[NodeStatus] = js.undefined
    ): NodeSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      AvailabilityZone.foreach(__v => __obj.update("AvailabilityZone", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.update("InstanceType", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeSummary]
    }
  }

  /**
    * Properties of a proposal on a Managed Blockchain network.
    */
  @js.native
  trait Proposal extends js.Object {
    var Actions: js.UndefOr[ProposalActions]
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var ExpirationDate: js.UndefOr[Timestamp]
    var NetworkId: js.UndefOr[ResourceIdString]
    var NoVoteCount: js.UndefOr[VoteCount]
    var OutstandingVoteCount: js.UndefOr[VoteCount]
    var ProposalId: js.UndefOr[ResourceIdString]
    var ProposedByMemberId: js.UndefOr[ResourceIdString]
    var ProposedByMemberName: js.UndefOr[NetworkMemberNameString]
    var Status: js.UndefOr[ProposalStatus]
    var YesVoteCount: js.UndefOr[VoteCount]
  }

  object Proposal {
    def apply(
        Actions: js.UndefOr[ProposalActions] = js.undefined,
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        ExpirationDate: js.UndefOr[Timestamp] = js.undefined,
        NetworkId: js.UndefOr[ResourceIdString] = js.undefined,
        NoVoteCount: js.UndefOr[VoteCount] = js.undefined,
        OutstandingVoteCount: js.UndefOr[VoteCount] = js.undefined,
        ProposalId: js.UndefOr[ResourceIdString] = js.undefined,
        ProposedByMemberId: js.UndefOr[ResourceIdString] = js.undefined,
        ProposedByMemberName: js.UndefOr[NetworkMemberNameString] = js.undefined,
        Status: js.UndefOr[ProposalStatus] = js.undefined,
        YesVoteCount: js.UndefOr[VoteCount] = js.undefined
    ): Proposal = {
      val __obj = js.Dictionary.empty[js.Any]
      Actions.foreach(__v => __obj.update("Actions", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ExpirationDate.foreach(__v => __obj.update("ExpirationDate", __v.asInstanceOf[js.Any]))
      NetworkId.foreach(__v => __obj.update("NetworkId", __v.asInstanceOf[js.Any]))
      NoVoteCount.foreach(__v => __obj.update("NoVoteCount", __v.asInstanceOf[js.Any]))
      OutstandingVoteCount.foreach(__v => __obj.update("OutstandingVoteCount", __v.asInstanceOf[js.Any]))
      ProposalId.foreach(__v => __obj.update("ProposalId", __v.asInstanceOf[js.Any]))
      ProposedByMemberId.foreach(__v => __obj.update("ProposedByMemberId", __v.asInstanceOf[js.Any]))
      ProposedByMemberName.foreach(__v => __obj.update("ProposedByMemberName", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      YesVoteCount.foreach(__v => __obj.update("YesVoteCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Proposal]
    }
  }

  /**
    * The actions to carry out if a proposal is <code>APPROVED</code>.
    */
  @js.native
  trait ProposalActions extends js.Object {
    var Invitations: js.UndefOr[InviteActionList]
    var Removals: js.UndefOr[RemoveActionList]
  }

  object ProposalActions {
    def apply(
        Invitations: js.UndefOr[InviteActionList] = js.undefined,
        Removals: js.UndefOr[RemoveActionList] = js.undefined
    ): ProposalActions = {
      val __obj = js.Dictionary.empty[js.Any]
      Invitations.foreach(__v => __obj.update("Invitations", __v.asInstanceOf[js.Any]))
      Removals.foreach(__v => __obj.update("Removals", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProposalActions]
    }
  }

  object ProposalStatusEnum {
    val IN_PROGRESS   = "IN_PROGRESS"
    val APPROVED      = "APPROVED"
    val REJECTED      = "REJECTED"
    val EXPIRED       = "EXPIRED"
    val ACTION_FAILED = "ACTION_FAILED"

    val values = IndexedSeq(IN_PROGRESS, APPROVED, REJECTED, EXPIRED, ACTION_FAILED)
  }

  /**
    * Properties of a proposal.
    */
  @js.native
  trait ProposalSummary extends js.Object {
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var ExpirationDate: js.UndefOr[Timestamp]
    var ProposalId: js.UndefOr[ResourceIdString]
    var ProposedByMemberId: js.UndefOr[ResourceIdString]
    var ProposedByMemberName: js.UndefOr[NetworkMemberNameString]
    var Status: js.UndefOr[ProposalStatus]
  }

  object ProposalSummary {
    def apply(
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        ExpirationDate: js.UndefOr[Timestamp] = js.undefined,
        ProposalId: js.UndefOr[ResourceIdString] = js.undefined,
        ProposedByMemberId: js.UndefOr[ResourceIdString] = js.undefined,
        ProposedByMemberName: js.UndefOr[NetworkMemberNameString] = js.undefined,
        Status: js.UndefOr[ProposalStatus] = js.undefined
    ): ProposalSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ExpirationDate.foreach(__v => __obj.update("ExpirationDate", __v.asInstanceOf[js.Any]))
      ProposalId.foreach(__v => __obj.update("ProposalId", __v.asInstanceOf[js.Any]))
      ProposedByMemberId.foreach(__v => __obj.update("ProposedByMemberId", __v.asInstanceOf[js.Any]))
      ProposedByMemberName.foreach(__v => __obj.update("ProposedByMemberName", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProposalSummary]
    }
  }

  @js.native
  trait RejectInvitationInput extends js.Object {
    var InvitationId: ResourceIdString
  }

  object RejectInvitationInput {
    def apply(
        InvitationId: ResourceIdString
    ): RejectInvitationInput = {
      val __obj = js.Dictionary[js.Any](
        "InvitationId" -> InvitationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RejectInvitationInput]
    }
  }

  @js.native
  trait RejectInvitationOutput extends js.Object {}

  object RejectInvitationOutput {
    def apply(
        ): RejectInvitationOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[RejectInvitationOutput]
    }
  }

  /**
    * An action to remove a member from a Managed Blockchain network as the result of a removal proposal that is <code>APPROVED</code>. The member and all associated resources are deleted from the network.
    */
  @js.native
  trait RemoveAction extends js.Object {
    var MemberId: ResourceIdString
  }

  object RemoveAction {
    def apply(
        MemberId: ResourceIdString
    ): RemoveAction = {
      val __obj = js.Dictionary[js.Any](
        "MemberId" -> MemberId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveAction]
    }
  }

  object ThresholdComparatorEnum {
    val GREATER_THAN             = "GREATER_THAN"
    val GREATER_THAN_OR_EQUAL_TO = "GREATER_THAN_OR_EQUAL_TO"

    val values = IndexedSeq(GREATER_THAN, GREATER_THAN_OR_EQUAL_TO)
  }

  @js.native
  trait VoteOnProposalInput extends js.Object {
    var NetworkId: ResourceIdString
    var ProposalId: ResourceIdString
    var Vote: VoteValue
    var VoterMemberId: ResourceIdString
  }

  object VoteOnProposalInput {
    def apply(
        NetworkId: ResourceIdString,
        ProposalId: ResourceIdString,
        Vote: VoteValue,
        VoterMemberId: ResourceIdString
    ): VoteOnProposalInput = {
      val __obj = js.Dictionary[js.Any](
        "NetworkId"     -> NetworkId.asInstanceOf[js.Any],
        "ProposalId"    -> ProposalId.asInstanceOf[js.Any],
        "Vote"          -> Vote.asInstanceOf[js.Any],
        "VoterMemberId" -> VoterMemberId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VoteOnProposalInput]
    }
  }

  @js.native
  trait VoteOnProposalOutput extends js.Object {}

  object VoteOnProposalOutput {
    def apply(
        ): VoteOnProposalOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[VoteOnProposalOutput]
    }
  }

  /**
    * Properties of an individual vote that a member cast for a proposal.
    */
  @js.native
  trait VoteSummary extends js.Object {
    var MemberId: js.UndefOr[ResourceIdString]
    var MemberName: js.UndefOr[NetworkMemberNameString]
    var Vote: js.UndefOr[VoteValue]
  }

  object VoteSummary {
    def apply(
        MemberId: js.UndefOr[ResourceIdString] = js.undefined,
        MemberName: js.UndefOr[NetworkMemberNameString] = js.undefined,
        Vote: js.UndefOr[VoteValue] = js.undefined
    ): VoteSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      MemberId.foreach(__v => __obj.update("MemberId", __v.asInstanceOf[js.Any]))
      MemberName.foreach(__v => __obj.update("MemberName", __v.asInstanceOf[js.Any]))
      Vote.foreach(__v => __obj.update("Vote", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VoteSummary]
    }
  }

  object VoteValueEnum {
    val YES = "YES"
    val NO  = "NO"

    val values = IndexedSeq(YES, NO)
  }

  /**
    * The voting rules for the network to decide if a proposal is accepted
    */
  @js.native
  trait VotingPolicy extends js.Object {
    var ApprovalThresholdPolicy: js.UndefOr[ApprovalThresholdPolicy]
  }

  object VotingPolicy {
    def apply(
        ApprovalThresholdPolicy: js.UndefOr[ApprovalThresholdPolicy] = js.undefined
    ): VotingPolicy = {
      val __obj = js.Dictionary.empty[js.Any]
      ApprovalThresholdPolicy.foreach(__v => __obj.update("ApprovalThresholdPolicy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VotingPolicy]
    }
  }
}
