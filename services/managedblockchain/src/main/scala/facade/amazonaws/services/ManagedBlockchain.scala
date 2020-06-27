package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object managedblockchain {
  type AvailabilityZoneString   = String
  type ClientRequestTokenString = String
  type DescriptionString        = String
  type FrameworkVersionString   = String
  type InstanceTypeString       = String
  type InvitationList           = js.Array[Invitation]
  type InviteActionList         = js.Array[InviteAction]
  type IsOwned                  = Boolean
  type MemberListMaxResults     = Int
  type MemberSummaryList        = js.Array[MemberSummary]
  type NameString               = String
  type NetworkListMaxResults    = Int
  type NetworkMemberNameString  = String
  type NetworkSummaryList       = js.Array[NetworkSummary]
  type NodeListMaxResults       = Int
  type NodeSummaryList          = js.Array[NodeSummary]
  type PaginationToken          = String
  type PasswordString           = String
  type PrincipalString          = String
  type ProposalDurationInt      = Int
  type ProposalListMaxResults   = Int
  type ProposalSummaryList      = js.Array[ProposalSummary]
  type ProposalVoteList         = js.Array[VoteSummary]
  type RemoveActionList         = js.Array[RemoveAction]
  type ResourceIdString         = String
  type ThresholdPercentageInt   = Int
  type Timestamp                = js.Date
  type UsernameString           = String
  type VoteCount                = Int

  implicit final class ManagedBlockchainOps(private val service: ManagedBlockchain) extends AnyVal {

    @inline def createMemberFuture(params: CreateMemberInput): Future[CreateMemberOutput] =
      service.createMember(params).promise().toFuture
    @inline def createNetworkFuture(params: CreateNetworkInput): Future[CreateNetworkOutput] =
      service.createNetwork(params).promise().toFuture
    @inline def createNodeFuture(params: CreateNodeInput): Future[CreateNodeOutput] =
      service.createNode(params).promise().toFuture
    @inline def createProposalFuture(params: CreateProposalInput): Future[CreateProposalOutput] =
      service.createProposal(params).promise().toFuture
    @inline def deleteMemberFuture(params: DeleteMemberInput): Future[DeleteMemberOutput] =
      service.deleteMember(params).promise().toFuture
    @inline def deleteNodeFuture(params: DeleteNodeInput): Future[DeleteNodeOutput] =
      service.deleteNode(params).promise().toFuture
    @inline def getMemberFuture(params: GetMemberInput): Future[GetMemberOutput] =
      service.getMember(params).promise().toFuture
    @inline def getNetworkFuture(params: GetNetworkInput): Future[GetNetworkOutput] =
      service.getNetwork(params).promise().toFuture
    @inline def getNodeFuture(params: GetNodeInput): Future[GetNodeOutput] = service.getNode(params).promise().toFuture
    @inline def getProposalFuture(params: GetProposalInput): Future[GetProposalOutput] =
      service.getProposal(params).promise().toFuture
    @inline def listInvitationsFuture(params: ListInvitationsInput): Future[ListInvitationsOutput] =
      service.listInvitations(params).promise().toFuture
    @inline def listMembersFuture(params: ListMembersInput): Future[ListMembersOutput] =
      service.listMembers(params).promise().toFuture
    @inline def listNetworksFuture(params: ListNetworksInput): Future[ListNetworksOutput] =
      service.listNetworks(params).promise().toFuture
    @inline def listNodesFuture(params: ListNodesInput): Future[ListNodesOutput] =
      service.listNodes(params).promise().toFuture
    @inline def listProposalVotesFuture(params: ListProposalVotesInput): Future[ListProposalVotesOutput] =
      service.listProposalVotes(params).promise().toFuture
    @inline def listProposalsFuture(params: ListProposalsInput): Future[ListProposalsOutput] =
      service.listProposals(params).promise().toFuture
    @inline def rejectInvitationFuture(params: RejectInvitationInput): Future[RejectInvitationOutput] =
      service.rejectInvitation(params).promise().toFuture
    @inline def voteOnProposalFuture(params: VoteOnProposalInput): Future[VoteOnProposalOutput] =
      service.voteOnProposal(params).promise().toFuture
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
  @Factory
  trait ApprovalThresholdPolicy extends js.Object {
    var ProposalDurationInHours: js.UndefOr[ProposalDurationInt]
    var ThresholdComparator: js.UndefOr[ThresholdComparator]
    var ThresholdPercentage: js.UndefOr[ThresholdPercentageInt]
  }

  @js.native
  @Factory
  trait CreateMemberInput extends js.Object {
    var ClientRequestToken: ClientRequestTokenString
    var InvitationId: ResourceIdString
    var MemberConfiguration: MemberConfiguration
    var NetworkId: ResourceIdString
  }

  @js.native
  @Factory
  trait CreateMemberOutput extends js.Object {
    var MemberId: js.UndefOr[ResourceIdString]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateNetworkOutput extends js.Object {
    var MemberId: js.UndefOr[ResourceIdString]
    var NetworkId: js.UndefOr[ResourceIdString]
  }

  @js.native
  @Factory
  trait CreateNodeInput extends js.Object {
    var ClientRequestToken: ClientRequestTokenString
    var MemberId: ResourceIdString
    var NetworkId: ResourceIdString
    var NodeConfiguration: NodeConfiguration
  }

  @js.native
  @Factory
  trait CreateNodeOutput extends js.Object {
    var NodeId: js.UndefOr[ResourceIdString]
  }

  @js.native
  @Factory
  trait CreateProposalInput extends js.Object {
    var Actions: ProposalActions
    var ClientRequestToken: ClientRequestTokenString
    var MemberId: ResourceIdString
    var NetworkId: ResourceIdString
    var Description: js.UndefOr[DescriptionString]
  }

  @js.native
  @Factory
  trait CreateProposalOutput extends js.Object {
    var ProposalId: js.UndefOr[ResourceIdString]
  }

  @js.native
  @Factory
  trait DeleteMemberInput extends js.Object {
    var MemberId: ResourceIdString
    var NetworkId: ResourceIdString
  }

  @js.native
  @Factory
  trait DeleteMemberOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteNodeInput extends js.Object {
    var MemberId: ResourceIdString
    var NetworkId: ResourceIdString
    var NodeId: ResourceIdString
  }

  @js.native
  @Factory
  trait DeleteNodeOutput extends js.Object {}

  @js.native
  sealed trait Edition extends js.Any
  object Edition extends js.Object {
    val STARTER  = "STARTER".asInstanceOf[Edition]
    val STANDARD = "STANDARD".asInstanceOf[Edition]

    val values = js.Object.freeze(js.Array(STARTER, STANDARD))
  }

  @js.native
  sealed trait Framework extends js.Any
  object Framework extends js.Object {
    val HYPERLEDGER_FABRIC = "HYPERLEDGER_FABRIC".asInstanceOf[Framework]

    val values = js.Object.freeze(js.Array(HYPERLEDGER_FABRIC))
  }

  @js.native
  @Factory
  trait GetMemberInput extends js.Object {
    var MemberId: ResourceIdString
    var NetworkId: ResourceIdString
  }

  @js.native
  @Factory
  trait GetMemberOutput extends js.Object {
    var Member: js.UndefOr[Member]
  }

  @js.native
  @Factory
  trait GetNetworkInput extends js.Object {
    var NetworkId: ResourceIdString
  }

  @js.native
  @Factory
  trait GetNetworkOutput extends js.Object {
    var Network: js.UndefOr[Network]
  }

  @js.native
  @Factory
  trait GetNodeInput extends js.Object {
    var MemberId: ResourceIdString
    var NetworkId: ResourceIdString
    var NodeId: ResourceIdString
  }

  @js.native
  @Factory
  trait GetNodeOutput extends js.Object {
    var Node: js.UndefOr[Node]
  }

  @js.native
  @Factory
  trait GetProposalInput extends js.Object {
    var NetworkId: ResourceIdString
    var ProposalId: ResourceIdString
  }

  @js.native
  @Factory
  trait GetProposalOutput extends js.Object {
    var Proposal: js.UndefOr[Proposal]
  }

  /**
    * An invitation to an AWS account to create a member and join the network.
    */
  @js.native
  @Factory
  trait Invitation extends js.Object {
    var CreationDate: js.UndefOr[Timestamp]
    var ExpirationDate: js.UndefOr[Timestamp]
    var InvitationId: js.UndefOr[ResourceIdString]
    var NetworkSummary: js.UndefOr[NetworkSummary]
    var Status: js.UndefOr[InvitationStatus]
  }

  @js.native
  sealed trait InvitationStatus extends js.Any
  object InvitationStatus extends js.Object {
    val PENDING   = "PENDING".asInstanceOf[InvitationStatus]
    val ACCEPTED  = "ACCEPTED".asInstanceOf[InvitationStatus]
    val ACCEPTING = "ACCEPTING".asInstanceOf[InvitationStatus]
    val REJECTED  = "REJECTED".asInstanceOf[InvitationStatus]
    val EXPIRED   = "EXPIRED".asInstanceOf[InvitationStatus]

    val values = js.Object.freeze(js.Array(PENDING, ACCEPTED, ACCEPTING, REJECTED, EXPIRED))
  }

  /**
    * An action to invite a specific AWS account to create a member and join the network. The <code>InviteAction</code> is carried out when a <code>Proposal</code> is <code>APPROVED</code>.
    */
  @js.native
  @Factory
  trait InviteAction extends js.Object {
    var Principal: PrincipalString
  }

  @js.native
  @Factory
  trait ListInvitationsInput extends js.Object {
    var MaxResults: js.UndefOr[ProposalListMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListInvitationsOutput extends js.Object {
    var Invitations: js.UndefOr[InvitationList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListMembersInput extends js.Object {
    var NetworkId: ResourceIdString
    var IsOwned: js.UndefOr[IsOwned]
    var MaxResults: js.UndefOr[MemberListMaxResults]
    var Name: js.UndefOr[String]
    var NextToken: js.UndefOr[PaginationToken]
    var Status: js.UndefOr[MemberStatus]
  }

  @js.native
  @Factory
  trait ListMembersOutput extends js.Object {
    var Members: js.UndefOr[MemberSummaryList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListNetworksInput extends js.Object {
    var Framework: js.UndefOr[Framework]
    var MaxResults: js.UndefOr[NetworkListMaxResults]
    var Name: js.UndefOr[String]
    var NextToken: js.UndefOr[PaginationToken]
    var Status: js.UndefOr[NetworkStatus]
  }

  @js.native
  @Factory
  trait ListNetworksOutput extends js.Object {
    var Networks: js.UndefOr[NetworkSummaryList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListNodesInput extends js.Object {
    var MemberId: ResourceIdString
    var NetworkId: ResourceIdString
    var MaxResults: js.UndefOr[NodeListMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
    var Status: js.UndefOr[NodeStatus]
  }

  @js.native
  @Factory
  trait ListNodesOutput extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var Nodes: js.UndefOr[NodeSummaryList]
  }

  @js.native
  @Factory
  trait ListProposalVotesInput extends js.Object {
    var NetworkId: ResourceIdString
    var ProposalId: ResourceIdString
    var MaxResults: js.UndefOr[ProposalListMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListProposalVotesOutput extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var ProposalVotes: js.UndefOr[ProposalVoteList]
  }

  @js.native
  @Factory
  trait ListProposalsInput extends js.Object {
    var NetworkId: ResourceIdString
    var MaxResults: js.UndefOr[ProposalListMaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListProposalsOutput extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var Proposals: js.UndefOr[ProposalSummaryList]
  }

  /**
    * Member configuration properties.
    */
  @js.native
  @Factory
  trait Member extends js.Object {
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var FrameworkAttributes: js.UndefOr[MemberFrameworkAttributes]
    var Id: js.UndefOr[ResourceIdString]
    var Name: js.UndefOr[NetworkMemberNameString]
    var NetworkId: js.UndefOr[ResourceIdString]
    var Status: js.UndefOr[MemberStatus]
  }

  /**
    * Configuration properties of the member.
    */
  @js.native
  @Factory
  trait MemberConfiguration extends js.Object {
    var FrameworkConfiguration: MemberFrameworkConfiguration
    var Name: NetworkMemberNameString
    var Description: js.UndefOr[DescriptionString]
  }

  /**
    * Attributes of Hyperledger Fabric for a member in a Managed Blockchain network using the Hyperledger Fabric framework.
    */
  @js.native
  @Factory
  trait MemberFabricAttributes extends js.Object {
    var AdminUsername: js.UndefOr[UsernameString]
    var CaEndpoint: js.UndefOr[String]
  }

  /**
    * Configuration properties for Hyperledger Fabric for a member in a Managed Blockchain network using the Hyperledger Fabric framework.
    */
  @js.native
  @Factory
  trait MemberFabricConfiguration extends js.Object {
    var AdminPassword: PasswordString
    var AdminUsername: UsernameString
  }

  /**
    * Attributes relevant to a member for the blockchain framework that the Managed Blockchain network uses.
    */
  @js.native
  @Factory
  trait MemberFrameworkAttributes extends js.Object {
    var Fabric: js.UndefOr[MemberFabricAttributes]
  }

  /**
    * Configuration properties relevant to a member for the blockchain framework that the Managed Blockchain network uses.
    */
  @js.native
  @Factory
  trait MemberFrameworkConfiguration extends js.Object {
    var Fabric: js.UndefOr[MemberFabricConfiguration]
  }

  @js.native
  sealed trait MemberStatus extends js.Any
  object MemberStatus extends js.Object {
    val CREATING      = "CREATING".asInstanceOf[MemberStatus]
    val AVAILABLE     = "AVAILABLE".asInstanceOf[MemberStatus]
    val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[MemberStatus]
    val DELETING      = "DELETING".asInstanceOf[MemberStatus]
    val DELETED       = "DELETED".asInstanceOf[MemberStatus]

    val values = js.Object.freeze(js.Array(CREATING, AVAILABLE, CREATE_FAILED, DELETING, DELETED))
  }

  /**
    * A summary of configuration properties for a member.
    */
  @js.native
  @Factory
  trait MemberSummary extends js.Object {
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var Id: js.UndefOr[ResourceIdString]
    var IsOwned: js.UndefOr[IsOwned]
    var Name: js.UndefOr[NetworkMemberNameString]
    var Status: js.UndefOr[MemberStatus]
  }

  /**
    * Network configuration properties.
    */
  @js.native
  @Factory
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

  /**
    * Attributes of Hyperledger Fabric for a network.
    */
  @js.native
  @Factory
  trait NetworkFabricAttributes extends js.Object {
    var Edition: js.UndefOr[Edition]
    var OrderingServiceEndpoint: js.UndefOr[String]
  }

  /**
    * Hyperledger Fabric configuration properties for the network.
    */
  @js.native
  @Factory
  trait NetworkFabricConfiguration extends js.Object {
    var Edition: Edition
  }

  /**
    * Attributes relevant to the network for the blockchain framework that the network uses.
    */
  @js.native
  @Factory
  trait NetworkFrameworkAttributes extends js.Object {
    var Fabric: js.UndefOr[NetworkFabricAttributes]
  }

  /**
    * Configuration properties relevant to the network for the blockchain framework that the network uses.
    */
  @js.native
  @Factory
  trait NetworkFrameworkConfiguration extends js.Object {
    var Fabric: js.UndefOr[NetworkFabricConfiguration]
  }

  @js.native
  sealed trait NetworkStatus extends js.Any
  object NetworkStatus extends js.Object {
    val CREATING      = "CREATING".asInstanceOf[NetworkStatus]
    val AVAILABLE     = "AVAILABLE".asInstanceOf[NetworkStatus]
    val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[NetworkStatus]
    val DELETING      = "DELETING".asInstanceOf[NetworkStatus]
    val DELETED       = "DELETED".asInstanceOf[NetworkStatus]

    val values = js.Object.freeze(js.Array(CREATING, AVAILABLE, CREATE_FAILED, DELETING, DELETED))
  }

  /**
    * A summary of network configuration properties.
    */
  @js.native
  @Factory
  trait NetworkSummary extends js.Object {
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var Framework: js.UndefOr[Framework]
    var FrameworkVersion: js.UndefOr[FrameworkVersionString]
    var Id: js.UndefOr[ResourceIdString]
    var Name: js.UndefOr[NameString]
    var Status: js.UndefOr[NetworkStatus]
  }

  /**
    * Configuration properties of a peer node.
    */
  @js.native
  @Factory
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

  /**
    * Configuration properties of a peer node.
    */
  @js.native
  @Factory
  trait NodeConfiguration extends js.Object {
    var AvailabilityZone: AvailabilityZoneString
    var InstanceType: InstanceTypeString
  }

  /**
    * Attributes of Hyperledger Fabric for a peer node on a Managed Blockchain network that uses Hyperledger Fabric.
    */
  @js.native
  @Factory
  trait NodeFabricAttributes extends js.Object {
    var PeerEndpoint: js.UndefOr[String]
    var PeerEventEndpoint: js.UndefOr[String]
  }

  /**
    * Attributes relevant to a peer node on a Managed Blockchain network for the blockchain framework that the network uses.
    */
  @js.native
  @Factory
  trait NodeFrameworkAttributes extends js.Object {
    var Fabric: js.UndefOr[NodeFabricAttributes]
  }

  @js.native
  sealed trait NodeStatus extends js.Any
  object NodeStatus extends js.Object {
    val CREATING      = "CREATING".asInstanceOf[NodeStatus]
    val AVAILABLE     = "AVAILABLE".asInstanceOf[NodeStatus]
    val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[NodeStatus]
    val DELETING      = "DELETING".asInstanceOf[NodeStatus]
    val DELETED       = "DELETED".asInstanceOf[NodeStatus]
    val FAILED        = "FAILED".asInstanceOf[NodeStatus]

    val values = js.Object.freeze(js.Array(CREATING, AVAILABLE, CREATE_FAILED, DELETING, DELETED, FAILED))
  }

  /**
    * A summary of configuration properties for a peer node.
    */
  @js.native
  @Factory
  trait NodeSummary extends js.Object {
    var AvailabilityZone: js.UndefOr[AvailabilityZoneString]
    var CreationDate: js.UndefOr[Timestamp]
    var Id: js.UndefOr[ResourceIdString]
    var InstanceType: js.UndefOr[InstanceTypeString]
    var Status: js.UndefOr[NodeStatus]
  }

  /**
    * Properties of a proposal on a Managed Blockchain network.
    */
  @js.native
  @Factory
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

  /**
    * The actions to carry out if a proposal is <code>APPROVED</code>.
    */
  @js.native
  @Factory
  trait ProposalActions extends js.Object {
    var Invitations: js.UndefOr[InviteActionList]
    var Removals: js.UndefOr[RemoveActionList]
  }

  @js.native
  sealed trait ProposalStatus extends js.Any
  object ProposalStatus extends js.Object {
    val IN_PROGRESS   = "IN_PROGRESS".asInstanceOf[ProposalStatus]
    val APPROVED      = "APPROVED".asInstanceOf[ProposalStatus]
    val REJECTED      = "REJECTED".asInstanceOf[ProposalStatus]
    val EXPIRED       = "EXPIRED".asInstanceOf[ProposalStatus]
    val ACTION_FAILED = "ACTION_FAILED".asInstanceOf[ProposalStatus]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, APPROVED, REJECTED, EXPIRED, ACTION_FAILED))
  }

  /**
    * Properties of a proposal.
    */
  @js.native
  @Factory
  trait ProposalSummary extends js.Object {
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var ExpirationDate: js.UndefOr[Timestamp]
    var ProposalId: js.UndefOr[ResourceIdString]
    var ProposedByMemberId: js.UndefOr[ResourceIdString]
    var ProposedByMemberName: js.UndefOr[NetworkMemberNameString]
    var Status: js.UndefOr[ProposalStatus]
  }

  @js.native
  @Factory
  trait RejectInvitationInput extends js.Object {
    var InvitationId: ResourceIdString
  }

  @js.native
  @Factory
  trait RejectInvitationOutput extends js.Object {}

  /**
    * An action to remove a member from a Managed Blockchain network as the result of a removal proposal that is <code>APPROVED</code>. The member and all associated resources are deleted from the network.
    */
  @js.native
  @Factory
  trait RemoveAction extends js.Object {
    var MemberId: ResourceIdString
  }

  @js.native
  sealed trait ThresholdComparator extends js.Any
  object ThresholdComparator extends js.Object {
    val GREATER_THAN             = "GREATER_THAN".asInstanceOf[ThresholdComparator]
    val GREATER_THAN_OR_EQUAL_TO = "GREATER_THAN_OR_EQUAL_TO".asInstanceOf[ThresholdComparator]

    val values = js.Object.freeze(js.Array(GREATER_THAN, GREATER_THAN_OR_EQUAL_TO))
  }

  @js.native
  @Factory
  trait VoteOnProposalInput extends js.Object {
    var NetworkId: ResourceIdString
    var ProposalId: ResourceIdString
    var Vote: VoteValue
    var VoterMemberId: ResourceIdString
  }

  @js.native
  @Factory
  trait VoteOnProposalOutput extends js.Object {}

  /**
    * Properties of an individual vote that a member cast for a proposal.
    */
  @js.native
  @Factory
  trait VoteSummary extends js.Object {
    var MemberId: js.UndefOr[ResourceIdString]
    var MemberName: js.UndefOr[NetworkMemberNameString]
    var Vote: js.UndefOr[VoteValue]
  }

  @js.native
  sealed trait VoteValue extends js.Any
  object VoteValue extends js.Object {
    val YES = "YES".asInstanceOf[VoteValue]
    val NO  = "NO".asInstanceOf[VoteValue]

    val values = js.Object.freeze(js.Array(YES, NO))
  }

  /**
    * The voting rules for the network to decide if a proposal is accepted
    */
  @js.native
  @Factory
  trait VotingPolicy extends js.Object {
    var ApprovalThresholdPolicy: js.UndefOr[ApprovalThresholdPolicy]
  }
}
