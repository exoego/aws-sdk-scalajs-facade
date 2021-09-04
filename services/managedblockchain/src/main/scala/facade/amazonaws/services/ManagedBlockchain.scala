package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object managedblockchain {
  type ArnString = String
  type AvailabilityZoneString = String
  type ClientRequestTokenString = String
  type DescriptionString = String
  type Enabled = Boolean
  type FrameworkVersionString = String
  type InputTagMap = js.Dictionary[TagValue]
  type InstanceTypeString = String
  type InvitationList = js.Array[Invitation]
  type InviteActionList = js.Array[InviteAction]
  type IsOwned = Boolean
  type MemberListMaxResults = Int
  type MemberSummaryList = js.Array[MemberSummary]
  type NameString = String
  type NetworkListMaxResults = Int
  type NetworkMemberNameString = String
  type NetworkSummaryList = js.Array[NetworkSummary]
  type NodeListMaxResults = Int
  type NodeSummaryList = js.Array[NodeSummary]
  type OutputTagMap = js.Dictionary[TagValue]
  type PaginationToken = String
  type PasswordString = String
  type PrincipalString = String
  type ProposalDurationInt = Int
  type ProposalListMaxResults = Int
  type ProposalSummaryList = js.Array[ProposalSummary]
  type ProposalVoteList = js.Array[VoteSummary]
  type RemoveActionList = js.Array[RemoveAction]
  type ResourceIdString = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagValue = String
  type ThresholdPercentageInt = Int
  type Timestamp = js.Date
  type UsernameString = String
  type VoteCount = Int

  implicit final class ManagedBlockchainOps(private val service: ManagedBlockchain) extends AnyVal {

    @inline def createMemberFuture(params: CreateMemberInput): Future[CreateMemberOutput] = service.createMember(params).promise().toFuture
    @inline def createNetworkFuture(params: CreateNetworkInput): Future[CreateNetworkOutput] = service.createNetwork(params).promise().toFuture
    @inline def createNodeFuture(params: CreateNodeInput): Future[CreateNodeOutput] = service.createNode(params).promise().toFuture
    @inline def createProposalFuture(params: CreateProposalInput): Future[CreateProposalOutput] = service.createProposal(params).promise().toFuture
    @inline def deleteMemberFuture(params: DeleteMemberInput): Future[DeleteMemberOutput] = service.deleteMember(params).promise().toFuture
    @inline def deleteNodeFuture(params: DeleteNodeInput): Future[DeleteNodeOutput] = service.deleteNode(params).promise().toFuture
    @inline def getMemberFuture(params: GetMemberInput): Future[GetMemberOutput] = service.getMember(params).promise().toFuture
    @inline def getNetworkFuture(params: GetNetworkInput): Future[GetNetworkOutput] = service.getNetwork(params).promise().toFuture
    @inline def getNodeFuture(params: GetNodeInput): Future[GetNodeOutput] = service.getNode(params).promise().toFuture
    @inline def getProposalFuture(params: GetProposalInput): Future[GetProposalOutput] = service.getProposal(params).promise().toFuture
    @inline def listInvitationsFuture(params: ListInvitationsInput): Future[ListInvitationsOutput] = service.listInvitations(params).promise().toFuture
    @inline def listMembersFuture(params: ListMembersInput): Future[ListMembersOutput] = service.listMembers(params).promise().toFuture
    @inline def listNetworksFuture(params: ListNetworksInput): Future[ListNetworksOutput] = service.listNetworks(params).promise().toFuture
    @inline def listNodesFuture(params: ListNodesInput): Future[ListNodesOutput] = service.listNodes(params).promise().toFuture
    @inline def listProposalVotesFuture(params: ListProposalVotesInput): Future[ListProposalVotesOutput] = service.listProposalVotes(params).promise().toFuture
    @inline def listProposalsFuture(params: ListProposalsInput): Future[ListProposalsOutput] = service.listProposals(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def rejectInvitationFuture(params: RejectInvitationInput): Future[RejectInvitationOutput] = service.rejectInvitation(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateMemberFuture(params: UpdateMemberInput): Future[UpdateMemberOutput] = service.updateMember(params).promise().toFuture
    @inline def updateNodeFuture(params: UpdateNodeInput): Future[UpdateNodeOutput] = service.updateNode(params).promise().toFuture
    @inline def voteOnProposalFuture(params: VoteOnProposalInput): Future[VoteOnProposalOutput] = service.voteOnProposal(params).promise().toFuture

  }
}

package managedblockchain {
  @js.native
  @JSImport("aws-sdk/clients/managedblockchain", JSImport.Namespace, "AWS.ManagedBlockchain")
  class ManagedBlockchain() extends js.Object {
    def this(config: AWSConfig) = this()

    def createMember(params: CreateMemberInput): Request[CreateMemberOutput] = js.native
    def createNetwork(params: CreateNetworkInput): Request[CreateNetworkOutput] = js.native
    def createNode(params: CreateNodeInput): Request[CreateNodeOutput] = js.native
    def createProposal(params: CreateProposalInput): Request[CreateProposalOutput] = js.native
    def deleteMember(params: DeleteMemberInput): Request[DeleteMemberOutput] = js.native
    def deleteNode(params: DeleteNodeInput): Request[DeleteNodeOutput] = js.native
    def getMember(params: GetMemberInput): Request[GetMemberOutput] = js.native
    def getNetwork(params: GetNetworkInput): Request[GetNetworkOutput] = js.native
    def getNode(params: GetNodeInput): Request[GetNodeOutput] = js.native
    def getProposal(params: GetProposalInput): Request[GetProposalOutput] = js.native
    def listInvitations(params: ListInvitationsInput): Request[ListInvitationsOutput] = js.native
    def listMembers(params: ListMembersInput): Request[ListMembersOutput] = js.native
    def listNetworks(params: ListNetworksInput): Request[ListNetworksOutput] = js.native
    def listNodes(params: ListNodesInput): Request[ListNodesOutput] = js.native
    def listProposalVotes(params: ListProposalVotesInput): Request[ListProposalVotesOutput] = js.native
    def listProposals(params: ListProposalsInput): Request[ListProposalsOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def rejectInvitation(params: RejectInvitationInput): Request[RejectInvitationOutput] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateMember(params: UpdateMemberInput): Request[UpdateMemberOutput] = js.native
    def updateNode(params: UpdateNodeInput): Request[UpdateNodeOutput] = js.native
    def voteOnProposal(params: VoteOnProposalInput): Request[VoteOnProposalOutput] = js.native
  }

  /** A policy type that defines the voting rules for the network. The rules decide if a proposal is approved. Approval may be based on criteria such as the percentage of <code>YES</code> votes and the duration of the proposal. The policy applies to all proposals and is specified when the network is created. Applies only to Hyperledger Fabric.
    */
  @js.native
  trait ApprovalThresholdPolicy extends js.Object {
    var ProposalDurationInHours: js.UndefOr[ProposalDurationInt]
    var ThresholdComparator: js.UndefOr[ThresholdComparator]
    var ThresholdPercentage: js.UndefOr[ThresholdPercentageInt]
  }

  object ApprovalThresholdPolicy {
    @inline
    def apply(
        ProposalDurationInHours: js.UndefOr[ProposalDurationInt] = js.undefined,
        ThresholdComparator: js.UndefOr[ThresholdComparator] = js.undefined,
        ThresholdPercentage: js.UndefOr[ThresholdPercentageInt] = js.undefined
    ): ApprovalThresholdPolicy = {
      val __obj = js.Dynamic.literal()
      ProposalDurationInHours.foreach(__v => __obj.updateDynamic("ProposalDurationInHours")(__v.asInstanceOf[js.Any]))
      ThresholdComparator.foreach(__v => __obj.updateDynamic("ThresholdComparator")(__v.asInstanceOf[js.Any]))
      ThresholdPercentage.foreach(__v => __obj.updateDynamic("ThresholdPercentage")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ClientRequestToken: ClientRequestTokenString,
        InvitationId: ResourceIdString,
        MemberConfiguration: MemberConfiguration,
        NetworkId: ResourceIdString
    ): CreateMemberInput = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "InvitationId" -> InvitationId.asInstanceOf[js.Any],
        "MemberConfiguration" -> MemberConfiguration.asInstanceOf[js.Any],
        "NetworkId" -> NetworkId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateMemberInput]
    }
  }

  @js.native
  trait CreateMemberOutput extends js.Object {
    var MemberId: js.UndefOr[ResourceIdString]
  }

  object CreateMemberOutput {
    @inline
    def apply(
        MemberId: js.UndefOr[ResourceIdString] = js.undefined
    ): CreateMemberOutput = {
      val __obj = js.Dynamic.literal()
      MemberId.foreach(__v => __obj.updateDynamic("MemberId")(__v.asInstanceOf[js.Any]))
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
    var Tags: js.UndefOr[InputTagMap]
  }

  object CreateNetworkInput {
    @inline
    def apply(
        ClientRequestToken: ClientRequestTokenString,
        Framework: Framework,
        FrameworkVersion: FrameworkVersionString,
        MemberConfiguration: MemberConfiguration,
        Name: NameString,
        VotingPolicy: VotingPolicy,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        FrameworkConfiguration: js.UndefOr[NetworkFrameworkConfiguration] = js.undefined,
        Tags: js.UndefOr[InputTagMap] = js.undefined
    ): CreateNetworkInput = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "Framework" -> Framework.asInstanceOf[js.Any],
        "FrameworkVersion" -> FrameworkVersion.asInstanceOf[js.Any],
        "MemberConfiguration" -> MemberConfiguration.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "VotingPolicy" -> VotingPolicy.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FrameworkConfiguration.foreach(__v => __obj.updateDynamic("FrameworkConfiguration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNetworkInput]
    }
  }

  @js.native
  trait CreateNetworkOutput extends js.Object {
    var MemberId: js.UndefOr[ResourceIdString]
    var NetworkId: js.UndefOr[ResourceIdString]
  }

  object CreateNetworkOutput {
    @inline
    def apply(
        MemberId: js.UndefOr[ResourceIdString] = js.undefined,
        NetworkId: js.UndefOr[ResourceIdString] = js.undefined
    ): CreateNetworkOutput = {
      val __obj = js.Dynamic.literal()
      MemberId.foreach(__v => __obj.updateDynamic("MemberId")(__v.asInstanceOf[js.Any]))
      NetworkId.foreach(__v => __obj.updateDynamic("NetworkId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNetworkOutput]
    }
  }

  @js.native
  trait CreateNodeInput extends js.Object {
    var ClientRequestToken: ClientRequestTokenString
    var NetworkId: ResourceIdString
    var NodeConfiguration: NodeConfiguration
    var MemberId: js.UndefOr[ResourceIdString]
    var Tags: js.UndefOr[InputTagMap]
  }

  object CreateNodeInput {
    @inline
    def apply(
        ClientRequestToken: ClientRequestTokenString,
        NetworkId: ResourceIdString,
        NodeConfiguration: NodeConfiguration,
        MemberId: js.UndefOr[ResourceIdString] = js.undefined,
        Tags: js.UndefOr[InputTagMap] = js.undefined
    ): CreateNodeInput = {
      val __obj = js.Dynamic.literal(
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "NetworkId" -> NetworkId.asInstanceOf[js.Any],
        "NodeConfiguration" -> NodeConfiguration.asInstanceOf[js.Any]
      )

      MemberId.foreach(__v => __obj.updateDynamic("MemberId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNodeInput]
    }
  }

  @js.native
  trait CreateNodeOutput extends js.Object {
    var NodeId: js.UndefOr[ResourceIdString]
  }

  object CreateNodeOutput {
    @inline
    def apply(
        NodeId: js.UndefOr[ResourceIdString] = js.undefined
    ): CreateNodeOutput = {
      val __obj = js.Dynamic.literal()
      NodeId.foreach(__v => __obj.updateDynamic("NodeId")(__v.asInstanceOf[js.Any]))
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
    var Tags: js.UndefOr[InputTagMap]
  }

  object CreateProposalInput {
    @inline
    def apply(
        Actions: ProposalActions,
        ClientRequestToken: ClientRequestTokenString,
        MemberId: ResourceIdString,
        NetworkId: ResourceIdString,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Tags: js.UndefOr[InputTagMap] = js.undefined
    ): CreateProposalInput = {
      val __obj = js.Dynamic.literal(
        "Actions" -> Actions.asInstanceOf[js.Any],
        "ClientRequestToken" -> ClientRequestToken.asInstanceOf[js.Any],
        "MemberId" -> MemberId.asInstanceOf[js.Any],
        "NetworkId" -> NetworkId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProposalInput]
    }
  }

  @js.native
  trait CreateProposalOutput extends js.Object {
    var ProposalId: js.UndefOr[ResourceIdString]
  }

  object CreateProposalOutput {
    @inline
    def apply(
        ProposalId: js.UndefOr[ResourceIdString] = js.undefined
    ): CreateProposalOutput = {
      val __obj = js.Dynamic.literal()
      ProposalId.foreach(__v => __obj.updateDynamic("ProposalId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProposalOutput]
    }
  }

  @js.native
  trait DeleteMemberInput extends js.Object {
    var MemberId: ResourceIdString
    var NetworkId: ResourceIdString
  }

  object DeleteMemberInput {
    @inline
    def apply(
        MemberId: ResourceIdString,
        NetworkId: ResourceIdString
    ): DeleteMemberInput = {
      val __obj = js.Dynamic.literal(
        "MemberId" -> MemberId.asInstanceOf[js.Any],
        "NetworkId" -> NetworkId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMemberInput]
    }
  }

  @js.native
  trait DeleteMemberOutput extends js.Object

  object DeleteMemberOutput {
    @inline
    def apply(): DeleteMemberOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteMemberOutput]
    }
  }

  @js.native
  trait DeleteNodeInput extends js.Object {
    var NetworkId: ResourceIdString
    var NodeId: ResourceIdString
    var MemberId: js.UndefOr[ResourceIdString]
  }

  object DeleteNodeInput {
    @inline
    def apply(
        NetworkId: ResourceIdString,
        NodeId: ResourceIdString,
        MemberId: js.UndefOr[ResourceIdString] = js.undefined
    ): DeleteNodeInput = {
      val __obj = js.Dynamic.literal(
        "NetworkId" -> NetworkId.asInstanceOf[js.Any],
        "NodeId" -> NodeId.asInstanceOf[js.Any]
      )

      MemberId.foreach(__v => __obj.updateDynamic("MemberId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteNodeInput]
    }
  }

  @js.native
  trait DeleteNodeOutput extends js.Object

  object DeleteNodeOutput {
    @inline
    def apply(): DeleteNodeOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteNodeOutput]
    }
  }

  @js.native
  sealed trait Edition extends js.Any
  object Edition {
    val STARTER = "STARTER".asInstanceOf[Edition]
    val STANDARD = "STANDARD".asInstanceOf[Edition]

    @inline def values = js.Array(STARTER, STANDARD)
  }

  @js.native
  sealed trait Framework extends js.Any
  object Framework {
    val HYPERLEDGER_FABRIC = "HYPERLEDGER_FABRIC".asInstanceOf[Framework]
    val ETHEREUM = "ETHEREUM".asInstanceOf[Framework]

    @inline def values = js.Array(HYPERLEDGER_FABRIC, ETHEREUM)
  }

  @js.native
  trait GetMemberInput extends js.Object {
    var MemberId: ResourceIdString
    var NetworkId: ResourceIdString
  }

  object GetMemberInput {
    @inline
    def apply(
        MemberId: ResourceIdString,
        NetworkId: ResourceIdString
    ): GetMemberInput = {
      val __obj = js.Dynamic.literal(
        "MemberId" -> MemberId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        Member: js.UndefOr[Member] = js.undefined
    ): GetMemberOutput = {
      val __obj = js.Dynamic.literal()
      Member.foreach(__v => __obj.updateDynamic("Member")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMemberOutput]
    }
  }

  @js.native
  trait GetNetworkInput extends js.Object {
    var NetworkId: ResourceIdString
  }

  object GetNetworkInput {
    @inline
    def apply(
        NetworkId: ResourceIdString
    ): GetNetworkInput = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Network: js.UndefOr[Network] = js.undefined
    ): GetNetworkOutput = {
      val __obj = js.Dynamic.literal()
      Network.foreach(__v => __obj.updateDynamic("Network")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNetworkOutput]
    }
  }

  @js.native
  trait GetNodeInput extends js.Object {
    var NetworkId: ResourceIdString
    var NodeId: ResourceIdString
    var MemberId: js.UndefOr[ResourceIdString]
  }

  object GetNodeInput {
    @inline
    def apply(
        NetworkId: ResourceIdString,
        NodeId: ResourceIdString,
        MemberId: js.UndefOr[ResourceIdString] = js.undefined
    ): GetNodeInput = {
      val __obj = js.Dynamic.literal(
        "NetworkId" -> NetworkId.asInstanceOf[js.Any],
        "NodeId" -> NodeId.asInstanceOf[js.Any]
      )

      MemberId.foreach(__v => __obj.updateDynamic("MemberId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNodeInput]
    }
  }

  @js.native
  trait GetNodeOutput extends js.Object {
    var Node: js.UndefOr[Node]
  }

  object GetNodeOutput {
    @inline
    def apply(
        Node: js.UndefOr[Node] = js.undefined
    ): GetNodeOutput = {
      val __obj = js.Dynamic.literal()
      Node.foreach(__v => __obj.updateDynamic("Node")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNodeOutput]
    }
  }

  @js.native
  trait GetProposalInput extends js.Object {
    var NetworkId: ResourceIdString
    var ProposalId: ResourceIdString
  }

  object GetProposalInput {
    @inline
    def apply(
        NetworkId: ResourceIdString,
        ProposalId: ResourceIdString
    ): GetProposalInput = {
      val __obj = js.Dynamic.literal(
        "NetworkId" -> NetworkId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        Proposal: js.UndefOr[Proposal] = js.undefined
    ): GetProposalOutput = {
      val __obj = js.Dynamic.literal()
      Proposal.foreach(__v => __obj.updateDynamic("Proposal")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProposalOutput]
    }
  }

  /** An invitation to an AWS account to create a member and join the network. Applies only to Hyperledger Fabric.
    */
  @js.native
  trait Invitation extends js.Object {
    var Arn: js.UndefOr[ArnString]
    var CreationDate: js.UndefOr[Timestamp]
    var ExpirationDate: js.UndefOr[Timestamp]
    var InvitationId: js.UndefOr[ResourceIdString]
    var NetworkSummary: js.UndefOr[NetworkSummary]
    var Status: js.UndefOr[InvitationStatus]
  }

  object Invitation {
    @inline
    def apply(
        Arn: js.UndefOr[ArnString] = js.undefined,
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        ExpirationDate: js.UndefOr[Timestamp] = js.undefined,
        InvitationId: js.UndefOr[ResourceIdString] = js.undefined,
        NetworkSummary: js.UndefOr[NetworkSummary] = js.undefined,
        Status: js.UndefOr[InvitationStatus] = js.undefined
    ): Invitation = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      ExpirationDate.foreach(__v => __obj.updateDynamic("ExpirationDate")(__v.asInstanceOf[js.Any]))
      InvitationId.foreach(__v => __obj.updateDynamic("InvitationId")(__v.asInstanceOf[js.Any]))
      NetworkSummary.foreach(__v => __obj.updateDynamic("NetworkSummary")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Invitation]
    }
  }

  @js.native
  sealed trait InvitationStatus extends js.Any
  object InvitationStatus {
    val PENDING = "PENDING".asInstanceOf[InvitationStatus]
    val ACCEPTED = "ACCEPTED".asInstanceOf[InvitationStatus]
    val ACCEPTING = "ACCEPTING".asInstanceOf[InvitationStatus]
    val REJECTED = "REJECTED".asInstanceOf[InvitationStatus]
    val EXPIRED = "EXPIRED".asInstanceOf[InvitationStatus]

    @inline def values = js.Array(PENDING, ACCEPTED, ACCEPTING, REJECTED, EXPIRED)
  }

  /** An action to invite a specific AWS account to create a member and join the network. The <code>InviteAction</code> is carried out when a <code>Proposal</code> is <code>APPROVED</code>. Applies only to Hyperledger Fabric.
    */
  @js.native
  trait InviteAction extends js.Object {
    var Principal: PrincipalString
  }

  object InviteAction {
    @inline
    def apply(
        Principal: PrincipalString
    ): InviteAction = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        MaxResults: js.UndefOr[ProposalListMaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListInvitationsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInvitationsInput]
    }
  }

  @js.native
  trait ListInvitationsOutput extends js.Object {
    var Invitations: js.UndefOr[InvitationList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListInvitationsOutput {
    @inline
    def apply(
        Invitations: js.UndefOr[InvitationList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListInvitationsOutput = {
      val __obj = js.Dynamic.literal()
      Invitations.foreach(__v => __obj.updateDynamic("Invitations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        NetworkId: ResourceIdString,
        IsOwned: js.UndefOr[IsOwned] = js.undefined,
        MaxResults: js.UndefOr[MemberListMaxResults] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Status: js.UndefOr[MemberStatus] = js.undefined
    ): ListMembersInput = {
      val __obj = js.Dynamic.literal(
        "NetworkId" -> NetworkId.asInstanceOf[js.Any]
      )

      IsOwned.foreach(__v => __obj.updateDynamic("IsOwned")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMembersInput]
    }
  }

  @js.native
  trait ListMembersOutput extends js.Object {
    var Members: js.UndefOr[MemberSummaryList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListMembersOutput {
    @inline
    def apply(
        Members: js.UndefOr[MemberSummaryList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListMembersOutput = {
      val __obj = js.Dynamic.literal()
      Members.foreach(__v => __obj.updateDynamic("Members")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Framework: js.UndefOr[Framework] = js.undefined,
        MaxResults: js.UndefOr[NetworkListMaxResults] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Status: js.UndefOr[NetworkStatus] = js.undefined
    ): ListNetworksInput = {
      val __obj = js.Dynamic.literal()
      Framework.foreach(__v => __obj.updateDynamic("Framework")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNetworksInput]
    }
  }

  @js.native
  trait ListNetworksOutput extends js.Object {
    var Networks: js.UndefOr[NetworkSummaryList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListNetworksOutput {
    @inline
    def apply(
        Networks: js.UndefOr[NetworkSummaryList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListNetworksOutput = {
      val __obj = js.Dynamic.literal()
      Networks.foreach(__v => __obj.updateDynamic("Networks")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNetworksOutput]
    }
  }

  @js.native
  trait ListNodesInput extends js.Object {
    var NetworkId: ResourceIdString
    var MaxResults: js.UndefOr[NodeListMaxResults]
    var MemberId: js.UndefOr[ResourceIdString]
    var NextToken: js.UndefOr[PaginationToken]
    var Status: js.UndefOr[NodeStatus]
  }

  object ListNodesInput {
    @inline
    def apply(
        NetworkId: ResourceIdString,
        MaxResults: js.UndefOr[NodeListMaxResults] = js.undefined,
        MemberId: js.UndefOr[ResourceIdString] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Status: js.UndefOr[NodeStatus] = js.undefined
    ): ListNodesInput = {
      val __obj = js.Dynamic.literal(
        "NetworkId" -> NetworkId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      MemberId.foreach(__v => __obj.updateDynamic("MemberId")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNodesInput]
    }
  }

  @js.native
  trait ListNodesOutput extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var Nodes: js.UndefOr[NodeSummaryList]
  }

  object ListNodesOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Nodes: js.UndefOr[NodeSummaryList] = js.undefined
    ): ListNodesOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Nodes.foreach(__v => __obj.updateDynamic("Nodes")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        NetworkId: ResourceIdString,
        ProposalId: ResourceIdString,
        MaxResults: js.UndefOr[ProposalListMaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListProposalVotesInput = {
      val __obj = js.Dynamic.literal(
        "NetworkId" -> NetworkId.asInstanceOf[js.Any],
        "ProposalId" -> ProposalId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProposalVotesInput]
    }
  }

  @js.native
  trait ListProposalVotesOutput extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var ProposalVotes: js.UndefOr[ProposalVoteList]
  }

  object ListProposalVotesOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        ProposalVotes: js.UndefOr[ProposalVoteList] = js.undefined
    ): ListProposalVotesOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProposalVotes.foreach(__v => __obj.updateDynamic("ProposalVotes")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        NetworkId: ResourceIdString,
        MaxResults: js.UndefOr[ProposalListMaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListProposalsInput = {
      val __obj = js.Dynamic.literal(
        "NetworkId" -> NetworkId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProposalsInput]
    }
  }

  @js.native
  trait ListProposalsOutput extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var Proposals: js.UndefOr[ProposalSummaryList]
  }

  object ListProposalsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Proposals: js.UndefOr[ProposalSummaryList] = js.undefined
    ): ListProposalsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Proposals.foreach(__v => __obj.updateDynamic("Proposals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProposalsOutput]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: ArnString
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: ArnString
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[OutputTagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[OutputTagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** A configuration for logging events.
    */
  @js.native
  trait LogConfiguration extends js.Object {
    var Enabled: js.UndefOr[Enabled]
  }

  object LogConfiguration {
    @inline
    def apply(
        Enabled: js.UndefOr[Enabled] = js.undefined
    ): LogConfiguration = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogConfiguration]
    }
  }

  /** A collection of log configurations.
    */
  @js.native
  trait LogConfigurations extends js.Object {
    var Cloudwatch: js.UndefOr[LogConfiguration]
  }

  object LogConfigurations {
    @inline
    def apply(
        Cloudwatch: js.UndefOr[LogConfiguration] = js.undefined
    ): LogConfigurations = {
      val __obj = js.Dynamic.literal()
      Cloudwatch.foreach(__v => __obj.updateDynamic("Cloudwatch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogConfigurations]
    }
  }

  /** Member configuration properties. Applies only to Hyperledger Fabric.
    */
  @js.native
  trait Member extends js.Object {
    var Arn: js.UndefOr[ArnString]
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var FrameworkAttributes: js.UndefOr[MemberFrameworkAttributes]
    var Id: js.UndefOr[ResourceIdString]
    var LogPublishingConfiguration: js.UndefOr[MemberLogPublishingConfiguration]
    var Name: js.UndefOr[NetworkMemberNameString]
    var NetworkId: js.UndefOr[ResourceIdString]
    var Status: js.UndefOr[MemberStatus]
    var Tags: js.UndefOr[OutputTagMap]
  }

  object Member {
    @inline
    def apply(
        Arn: js.UndefOr[ArnString] = js.undefined,
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        FrameworkAttributes: js.UndefOr[MemberFrameworkAttributes] = js.undefined,
        Id: js.UndefOr[ResourceIdString] = js.undefined,
        LogPublishingConfiguration: js.UndefOr[MemberLogPublishingConfiguration] = js.undefined,
        Name: js.UndefOr[NetworkMemberNameString] = js.undefined,
        NetworkId: js.UndefOr[ResourceIdString] = js.undefined,
        Status: js.UndefOr[MemberStatus] = js.undefined,
        Tags: js.UndefOr[OutputTagMap] = js.undefined
    ): Member = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FrameworkAttributes.foreach(__v => __obj.updateDynamic("FrameworkAttributes")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LogPublishingConfiguration.foreach(__v => __obj.updateDynamic("LogPublishingConfiguration")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NetworkId.foreach(__v => __obj.updateDynamic("NetworkId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Member]
    }
  }

  /** Configuration properties of the member. Applies only to Hyperledger Fabric.
    */
  @js.native
  trait MemberConfiguration extends js.Object {
    var FrameworkConfiguration: MemberFrameworkConfiguration
    var Name: NetworkMemberNameString
    var Description: js.UndefOr[DescriptionString]
    var LogPublishingConfiguration: js.UndefOr[MemberLogPublishingConfiguration]
    var Tags: js.UndefOr[InputTagMap]
  }

  object MemberConfiguration {
    @inline
    def apply(
        FrameworkConfiguration: MemberFrameworkConfiguration,
        Name: NetworkMemberNameString,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        LogPublishingConfiguration: js.UndefOr[MemberLogPublishingConfiguration] = js.undefined,
        Tags: js.UndefOr[InputTagMap] = js.undefined
    ): MemberConfiguration = {
      val __obj = js.Dynamic.literal(
        "FrameworkConfiguration" -> FrameworkConfiguration.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LogPublishingConfiguration.foreach(__v => __obj.updateDynamic("LogPublishingConfiguration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberConfiguration]
    }
  }

  /** Attributes of Hyperledger Fabric for a member in a Managed Blockchain network using the Hyperledger Fabric framework.
    */
  @js.native
  trait MemberFabricAttributes extends js.Object {
    var AdminUsername: js.UndefOr[UsernameString]
    var CaEndpoint: js.UndefOr[String]
  }

  object MemberFabricAttributes {
    @inline
    def apply(
        AdminUsername: js.UndefOr[UsernameString] = js.undefined,
        CaEndpoint: js.UndefOr[String] = js.undefined
    ): MemberFabricAttributes = {
      val __obj = js.Dynamic.literal()
      AdminUsername.foreach(__v => __obj.updateDynamic("AdminUsername")(__v.asInstanceOf[js.Any]))
      CaEndpoint.foreach(__v => __obj.updateDynamic("CaEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberFabricAttributes]
    }
  }

  /** Configuration properties for Hyperledger Fabric for a member in a Managed Blockchain network using the Hyperledger Fabric framework.
    */
  @js.native
  trait MemberFabricConfiguration extends js.Object {
    var AdminPassword: PasswordString
    var AdminUsername: UsernameString
  }

  object MemberFabricConfiguration {
    @inline
    def apply(
        AdminPassword: PasswordString,
        AdminUsername: UsernameString
    ): MemberFabricConfiguration = {
      val __obj = js.Dynamic.literal(
        "AdminPassword" -> AdminPassword.asInstanceOf[js.Any],
        "AdminUsername" -> AdminUsername.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MemberFabricConfiguration]
    }
  }

  /** Configuration properties for logging events associated with a member of a Managed Blockchain network using the Hyperledger Fabric framework.
    */
  @js.native
  trait MemberFabricLogPublishingConfiguration extends js.Object {
    var CaLogs: js.UndefOr[LogConfigurations]
  }

  object MemberFabricLogPublishingConfiguration {
    @inline
    def apply(
        CaLogs: js.UndefOr[LogConfigurations] = js.undefined
    ): MemberFabricLogPublishingConfiguration = {
      val __obj = js.Dynamic.literal()
      CaLogs.foreach(__v => __obj.updateDynamic("CaLogs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberFabricLogPublishingConfiguration]
    }
  }

  /** Attributes relevant to a member for the blockchain framework that the Managed Blockchain network uses.
    */
  @js.native
  trait MemberFrameworkAttributes extends js.Object {
    var Fabric: js.UndefOr[MemberFabricAttributes]
  }

  object MemberFrameworkAttributes {
    @inline
    def apply(
        Fabric: js.UndefOr[MemberFabricAttributes] = js.undefined
    ): MemberFrameworkAttributes = {
      val __obj = js.Dynamic.literal()
      Fabric.foreach(__v => __obj.updateDynamic("Fabric")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberFrameworkAttributes]
    }
  }

  /** Configuration properties relevant to a member for the blockchain framework that the Managed Blockchain network uses.
    */
  @js.native
  trait MemberFrameworkConfiguration extends js.Object {
    var Fabric: js.UndefOr[MemberFabricConfiguration]
  }

  object MemberFrameworkConfiguration {
    @inline
    def apply(
        Fabric: js.UndefOr[MemberFabricConfiguration] = js.undefined
    ): MemberFrameworkConfiguration = {
      val __obj = js.Dynamic.literal()
      Fabric.foreach(__v => __obj.updateDynamic("Fabric")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberFrameworkConfiguration]
    }
  }

  /** Configuration properties for logging events associated with a member of a Managed Blockchain network.
    */
  @js.native
  trait MemberLogPublishingConfiguration extends js.Object {
    var Fabric: js.UndefOr[MemberFabricLogPublishingConfiguration]
  }

  object MemberLogPublishingConfiguration {
    @inline
    def apply(
        Fabric: js.UndefOr[MemberFabricLogPublishingConfiguration] = js.undefined
    ): MemberLogPublishingConfiguration = {
      val __obj = js.Dynamic.literal()
      Fabric.foreach(__v => __obj.updateDynamic("Fabric")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberLogPublishingConfiguration]
    }
  }

  @js.native
  sealed trait MemberStatus extends js.Any
  object MemberStatus {
    val CREATING = "CREATING".asInstanceOf[MemberStatus]
    val AVAILABLE = "AVAILABLE".asInstanceOf[MemberStatus]
    val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[MemberStatus]
    val UPDATING = "UPDATING".asInstanceOf[MemberStatus]
    val DELETING = "DELETING".asInstanceOf[MemberStatus]
    val DELETED = "DELETED".asInstanceOf[MemberStatus]

    @inline def values = js.Array(CREATING, AVAILABLE, CREATE_FAILED, UPDATING, DELETING, DELETED)
  }

  /** A summary of configuration properties for a member. Applies only to Hyperledger Fabric.
    */
  @js.native
  trait MemberSummary extends js.Object {
    var Arn: js.UndefOr[ArnString]
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var Id: js.UndefOr[ResourceIdString]
    var IsOwned: js.UndefOr[IsOwned]
    var Name: js.UndefOr[NetworkMemberNameString]
    var Status: js.UndefOr[MemberStatus]
  }

  object MemberSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ArnString] = js.undefined,
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Id: js.UndefOr[ResourceIdString] = js.undefined,
        IsOwned: js.UndefOr[IsOwned] = js.undefined,
        Name: js.UndefOr[NetworkMemberNameString] = js.undefined,
        Status: js.UndefOr[MemberStatus] = js.undefined
    ): MemberSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IsOwned.foreach(__v => __obj.updateDynamic("IsOwned")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberSummary]
    }
  }

  /** Network configuration properties.
    */
  @js.native
  trait Network extends js.Object {
    var Arn: js.UndefOr[ArnString]
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var Framework: js.UndefOr[Framework]
    var FrameworkAttributes: js.UndefOr[NetworkFrameworkAttributes]
    var FrameworkVersion: js.UndefOr[FrameworkVersionString]
    var Id: js.UndefOr[ResourceIdString]
    var Name: js.UndefOr[NameString]
    var Status: js.UndefOr[NetworkStatus]
    var Tags: js.UndefOr[OutputTagMap]
    var VotingPolicy: js.UndefOr[VotingPolicy]
    var VpcEndpointServiceName: js.UndefOr[String]
  }

  object Network {
    @inline
    def apply(
        Arn: js.UndefOr[ArnString] = js.undefined,
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Framework: js.UndefOr[Framework] = js.undefined,
        FrameworkAttributes: js.UndefOr[NetworkFrameworkAttributes] = js.undefined,
        FrameworkVersion: js.UndefOr[FrameworkVersionString] = js.undefined,
        Id: js.UndefOr[ResourceIdString] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        Status: js.UndefOr[NetworkStatus] = js.undefined,
        Tags: js.UndefOr[OutputTagMap] = js.undefined,
        VotingPolicy: js.UndefOr[VotingPolicy] = js.undefined,
        VpcEndpointServiceName: js.UndefOr[String] = js.undefined
    ): Network = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Framework.foreach(__v => __obj.updateDynamic("Framework")(__v.asInstanceOf[js.Any]))
      FrameworkAttributes.foreach(__v => __obj.updateDynamic("FrameworkAttributes")(__v.asInstanceOf[js.Any]))
      FrameworkVersion.foreach(__v => __obj.updateDynamic("FrameworkVersion")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VotingPolicy.foreach(__v => __obj.updateDynamic("VotingPolicy")(__v.asInstanceOf[js.Any]))
      VpcEndpointServiceName.foreach(__v => __obj.updateDynamic("VpcEndpointServiceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Network]
    }
  }

  /** Attributes of Ethereum for a network.
    */
  @js.native
  trait NetworkEthereumAttributes extends js.Object {
    var ChainId: js.UndefOr[String]
  }

  object NetworkEthereumAttributes {
    @inline
    def apply(
        ChainId: js.UndefOr[String] = js.undefined
    ): NetworkEthereumAttributes = {
      val __obj = js.Dynamic.literal()
      ChainId.foreach(__v => __obj.updateDynamic("ChainId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkEthereumAttributes]
    }
  }

  /** Attributes of Hyperledger Fabric for a network.
    */
  @js.native
  trait NetworkFabricAttributes extends js.Object {
    var Edition: js.UndefOr[Edition]
    var OrderingServiceEndpoint: js.UndefOr[String]
  }

  object NetworkFabricAttributes {
    @inline
    def apply(
        Edition: js.UndefOr[Edition] = js.undefined,
        OrderingServiceEndpoint: js.UndefOr[String] = js.undefined
    ): NetworkFabricAttributes = {
      val __obj = js.Dynamic.literal()
      Edition.foreach(__v => __obj.updateDynamic("Edition")(__v.asInstanceOf[js.Any]))
      OrderingServiceEndpoint.foreach(__v => __obj.updateDynamic("OrderingServiceEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkFabricAttributes]
    }
  }

  /** Hyperledger Fabric configuration properties for the network.
    */
  @js.native
  trait NetworkFabricConfiguration extends js.Object {
    var Edition: Edition
  }

  object NetworkFabricConfiguration {
    @inline
    def apply(
        Edition: Edition
    ): NetworkFabricConfiguration = {
      val __obj = js.Dynamic.literal(
        "Edition" -> Edition.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NetworkFabricConfiguration]
    }
  }

  /** Attributes relevant to the network for the blockchain framework that the network uses.
    */
  @js.native
  trait NetworkFrameworkAttributes extends js.Object {
    var Ethereum: js.UndefOr[NetworkEthereumAttributes]
    var Fabric: js.UndefOr[NetworkFabricAttributes]
  }

  object NetworkFrameworkAttributes {
    @inline
    def apply(
        Ethereum: js.UndefOr[NetworkEthereumAttributes] = js.undefined,
        Fabric: js.UndefOr[NetworkFabricAttributes] = js.undefined
    ): NetworkFrameworkAttributes = {
      val __obj = js.Dynamic.literal()
      Ethereum.foreach(__v => __obj.updateDynamic("Ethereum")(__v.asInstanceOf[js.Any]))
      Fabric.foreach(__v => __obj.updateDynamic("Fabric")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkFrameworkAttributes]
    }
  }

  /** Configuration properties relevant to the network for the blockchain framework that the network uses.
    */
  @js.native
  trait NetworkFrameworkConfiguration extends js.Object {
    var Fabric: js.UndefOr[NetworkFabricConfiguration]
  }

  object NetworkFrameworkConfiguration {
    @inline
    def apply(
        Fabric: js.UndefOr[NetworkFabricConfiguration] = js.undefined
    ): NetworkFrameworkConfiguration = {
      val __obj = js.Dynamic.literal()
      Fabric.foreach(__v => __obj.updateDynamic("Fabric")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkFrameworkConfiguration]
    }
  }

  @js.native
  sealed trait NetworkStatus extends js.Any
  object NetworkStatus {
    val CREATING = "CREATING".asInstanceOf[NetworkStatus]
    val AVAILABLE = "AVAILABLE".asInstanceOf[NetworkStatus]
    val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[NetworkStatus]
    val DELETING = "DELETING".asInstanceOf[NetworkStatus]
    val DELETED = "DELETED".asInstanceOf[NetworkStatus]

    @inline def values = js.Array(CREATING, AVAILABLE, CREATE_FAILED, DELETING, DELETED)
  }

  /** A summary of network configuration properties.
    */
  @js.native
  trait NetworkSummary extends js.Object {
    var Arn: js.UndefOr[ArnString]
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var Framework: js.UndefOr[Framework]
    var FrameworkVersion: js.UndefOr[FrameworkVersionString]
    var Id: js.UndefOr[ResourceIdString]
    var Name: js.UndefOr[NameString]
    var Status: js.UndefOr[NetworkStatus]
  }

  object NetworkSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ArnString] = js.undefined,
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        Framework: js.UndefOr[Framework] = js.undefined,
        FrameworkVersion: js.UndefOr[FrameworkVersionString] = js.undefined,
        Id: js.UndefOr[ResourceIdString] = js.undefined,
        Name: js.UndefOr[NameString] = js.undefined,
        Status: js.UndefOr[NetworkStatus] = js.undefined
    ): NetworkSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Framework.foreach(__v => __obj.updateDynamic("Framework")(__v.asInstanceOf[js.Any]))
      FrameworkVersion.foreach(__v => __obj.updateDynamic("FrameworkVersion")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkSummary]
    }
  }

  /** Configuration properties of a node.
    */
  @js.native
  trait Node extends js.Object {
    var Arn: js.UndefOr[ArnString]
    var AvailabilityZone: js.UndefOr[AvailabilityZoneString]
    var CreationDate: js.UndefOr[Timestamp]
    var FrameworkAttributes: js.UndefOr[NodeFrameworkAttributes]
    var Id: js.UndefOr[ResourceIdString]
    var InstanceType: js.UndefOr[InstanceTypeString]
    var LogPublishingConfiguration: js.UndefOr[NodeLogPublishingConfiguration]
    var MemberId: js.UndefOr[ResourceIdString]
    var NetworkId: js.UndefOr[ResourceIdString]
    var StateDB: js.UndefOr[StateDBType]
    var Status: js.UndefOr[NodeStatus]
    var Tags: js.UndefOr[OutputTagMap]
  }

  object Node {
    @inline
    def apply(
        Arn: js.UndefOr[ArnString] = js.undefined,
        AvailabilityZone: js.UndefOr[AvailabilityZoneString] = js.undefined,
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        FrameworkAttributes: js.UndefOr[NodeFrameworkAttributes] = js.undefined,
        Id: js.UndefOr[ResourceIdString] = js.undefined,
        InstanceType: js.UndefOr[InstanceTypeString] = js.undefined,
        LogPublishingConfiguration: js.UndefOr[NodeLogPublishingConfiguration] = js.undefined,
        MemberId: js.UndefOr[ResourceIdString] = js.undefined,
        NetworkId: js.UndefOr[ResourceIdString] = js.undefined,
        StateDB: js.UndefOr[StateDBType] = js.undefined,
        Status: js.UndefOr[NodeStatus] = js.undefined,
        Tags: js.UndefOr[OutputTagMap] = js.undefined
    ): Node = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      FrameworkAttributes.foreach(__v => __obj.updateDynamic("FrameworkAttributes")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      LogPublishingConfiguration.foreach(__v => __obj.updateDynamic("LogPublishingConfiguration")(__v.asInstanceOf[js.Any]))
      MemberId.foreach(__v => __obj.updateDynamic("MemberId")(__v.asInstanceOf[js.Any]))
      NetworkId.foreach(__v => __obj.updateDynamic("NetworkId")(__v.asInstanceOf[js.Any]))
      StateDB.foreach(__v => __obj.updateDynamic("StateDB")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Node]
    }
  }

  /** Configuration properties of a node.
    */
  @js.native
  trait NodeConfiguration extends js.Object {
    var InstanceType: InstanceTypeString
    var AvailabilityZone: js.UndefOr[AvailabilityZoneString]
    var LogPublishingConfiguration: js.UndefOr[NodeLogPublishingConfiguration]
    var StateDB: js.UndefOr[StateDBType]
  }

  object NodeConfiguration {
    @inline
    def apply(
        InstanceType: InstanceTypeString,
        AvailabilityZone: js.UndefOr[AvailabilityZoneString] = js.undefined,
        LogPublishingConfiguration: js.UndefOr[NodeLogPublishingConfiguration] = js.undefined,
        StateDB: js.UndefOr[StateDBType] = js.undefined
    ): NodeConfiguration = {
      val __obj = js.Dynamic.literal(
        "InstanceType" -> InstanceType.asInstanceOf[js.Any]
      )

      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      LogPublishingConfiguration.foreach(__v => __obj.updateDynamic("LogPublishingConfiguration")(__v.asInstanceOf[js.Any]))
      StateDB.foreach(__v => __obj.updateDynamic("StateDB")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeConfiguration]
    }
  }

  /** Attributes of an Ethereum node.
    */
  @js.native
  trait NodeEthereumAttributes extends js.Object {
    var HttpEndpoint: js.UndefOr[String]
    var WebSocketEndpoint: js.UndefOr[String]
  }

  object NodeEthereumAttributes {
    @inline
    def apply(
        HttpEndpoint: js.UndefOr[String] = js.undefined,
        WebSocketEndpoint: js.UndefOr[String] = js.undefined
    ): NodeEthereumAttributes = {
      val __obj = js.Dynamic.literal()
      HttpEndpoint.foreach(__v => __obj.updateDynamic("HttpEndpoint")(__v.asInstanceOf[js.Any]))
      WebSocketEndpoint.foreach(__v => __obj.updateDynamic("WebSocketEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeEthereumAttributes]
    }
  }

  /** Attributes of Hyperledger Fabric for a peer node on a Hyperledger Fabric network on Managed Blockchain.
    */
  @js.native
  trait NodeFabricAttributes extends js.Object {
    var PeerEndpoint: js.UndefOr[String]
    var PeerEventEndpoint: js.UndefOr[String]
  }

  object NodeFabricAttributes {
    @inline
    def apply(
        PeerEndpoint: js.UndefOr[String] = js.undefined,
        PeerEventEndpoint: js.UndefOr[String] = js.undefined
    ): NodeFabricAttributes = {
      val __obj = js.Dynamic.literal()
      PeerEndpoint.foreach(__v => __obj.updateDynamic("PeerEndpoint")(__v.asInstanceOf[js.Any]))
      PeerEventEndpoint.foreach(__v => __obj.updateDynamic("PeerEventEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeFabricAttributes]
    }
  }

  /** Configuration properties for logging events associated with a peer node owned by a member in a Managed Blockchain network.
    */
  @js.native
  trait NodeFabricLogPublishingConfiguration extends js.Object {
    var ChaincodeLogs: js.UndefOr[LogConfigurations]
    var PeerLogs: js.UndefOr[LogConfigurations]
  }

  object NodeFabricLogPublishingConfiguration {
    @inline
    def apply(
        ChaincodeLogs: js.UndefOr[LogConfigurations] = js.undefined,
        PeerLogs: js.UndefOr[LogConfigurations] = js.undefined
    ): NodeFabricLogPublishingConfiguration = {
      val __obj = js.Dynamic.literal()
      ChaincodeLogs.foreach(__v => __obj.updateDynamic("ChaincodeLogs")(__v.asInstanceOf[js.Any]))
      PeerLogs.foreach(__v => __obj.updateDynamic("PeerLogs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeFabricLogPublishingConfiguration]
    }
  }

  /** Attributes relevant to a node on a Managed Blockchain network for the blockchain framework that the network uses.
    */
  @js.native
  trait NodeFrameworkAttributes extends js.Object {
    var Ethereum: js.UndefOr[NodeEthereumAttributes]
    var Fabric: js.UndefOr[NodeFabricAttributes]
  }

  object NodeFrameworkAttributes {
    @inline
    def apply(
        Ethereum: js.UndefOr[NodeEthereumAttributes] = js.undefined,
        Fabric: js.UndefOr[NodeFabricAttributes] = js.undefined
    ): NodeFrameworkAttributes = {
      val __obj = js.Dynamic.literal()
      Ethereum.foreach(__v => __obj.updateDynamic("Ethereum")(__v.asInstanceOf[js.Any]))
      Fabric.foreach(__v => __obj.updateDynamic("Fabric")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeFrameworkAttributes]
    }
  }

  /** Configuration properties for logging events associated with a peer node on a Hyperledger Fabric network on Managed Blockchain.
    */
  @js.native
  trait NodeLogPublishingConfiguration extends js.Object {
    var Fabric: js.UndefOr[NodeFabricLogPublishingConfiguration]
  }

  object NodeLogPublishingConfiguration {
    @inline
    def apply(
        Fabric: js.UndefOr[NodeFabricLogPublishingConfiguration] = js.undefined
    ): NodeLogPublishingConfiguration = {
      val __obj = js.Dynamic.literal()
      Fabric.foreach(__v => __obj.updateDynamic("Fabric")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeLogPublishingConfiguration]
    }
  }

  @js.native
  sealed trait NodeStatus extends js.Any
  object NodeStatus {
    val CREATING = "CREATING".asInstanceOf[NodeStatus]
    val AVAILABLE = "AVAILABLE".asInstanceOf[NodeStatus]
    val UNHEALTHY = "UNHEALTHY".asInstanceOf[NodeStatus]
    val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[NodeStatus]
    val UPDATING = "UPDATING".asInstanceOf[NodeStatus]
    val DELETING = "DELETING".asInstanceOf[NodeStatus]
    val DELETED = "DELETED".asInstanceOf[NodeStatus]
    val FAILED = "FAILED".asInstanceOf[NodeStatus]

    @inline def values = js.Array(CREATING, AVAILABLE, UNHEALTHY, CREATE_FAILED, UPDATING, DELETING, DELETED, FAILED)
  }

  /** A summary of configuration properties for a node.
    */
  @js.native
  trait NodeSummary extends js.Object {
    var Arn: js.UndefOr[ArnString]
    var AvailabilityZone: js.UndefOr[AvailabilityZoneString]
    var CreationDate: js.UndefOr[Timestamp]
    var Id: js.UndefOr[ResourceIdString]
    var InstanceType: js.UndefOr[InstanceTypeString]
    var Status: js.UndefOr[NodeStatus]
  }

  object NodeSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ArnString] = js.undefined,
        AvailabilityZone: js.UndefOr[AvailabilityZoneString] = js.undefined,
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        Id: js.UndefOr[ResourceIdString] = js.undefined,
        InstanceType: js.UndefOr[InstanceTypeString] = js.undefined,
        Status: js.UndefOr[NodeStatus] = js.undefined
    ): NodeSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeSummary]
    }
  }

  /** Properties of a proposal on a Managed Blockchain network. Applies only to Hyperledger Fabric.
    */
  @js.native
  trait Proposal extends js.Object {
    var Actions: js.UndefOr[ProposalActions]
    var Arn: js.UndefOr[ArnString]
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
    var Tags: js.UndefOr[OutputTagMap]
    var YesVoteCount: js.UndefOr[VoteCount]
  }

  object Proposal {
    @inline
    def apply(
        Actions: js.UndefOr[ProposalActions] = js.undefined,
        Arn: js.UndefOr[ArnString] = js.undefined,
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
        Tags: js.UndefOr[OutputTagMap] = js.undefined,
        YesVoteCount: js.UndefOr[VoteCount] = js.undefined
    ): Proposal = {
      val __obj = js.Dynamic.literal()
      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ExpirationDate.foreach(__v => __obj.updateDynamic("ExpirationDate")(__v.asInstanceOf[js.Any]))
      NetworkId.foreach(__v => __obj.updateDynamic("NetworkId")(__v.asInstanceOf[js.Any]))
      NoVoteCount.foreach(__v => __obj.updateDynamic("NoVoteCount")(__v.asInstanceOf[js.Any]))
      OutstandingVoteCount.foreach(__v => __obj.updateDynamic("OutstandingVoteCount")(__v.asInstanceOf[js.Any]))
      ProposalId.foreach(__v => __obj.updateDynamic("ProposalId")(__v.asInstanceOf[js.Any]))
      ProposedByMemberId.foreach(__v => __obj.updateDynamic("ProposedByMemberId")(__v.asInstanceOf[js.Any]))
      ProposedByMemberName.foreach(__v => __obj.updateDynamic("ProposedByMemberName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      YesVoteCount.foreach(__v => __obj.updateDynamic("YesVoteCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Proposal]
    }
  }

  /** The actions to carry out if a proposal is <code>APPROVED</code>. Applies only to Hyperledger Fabric.
    */
  @js.native
  trait ProposalActions extends js.Object {
    var Invitations: js.UndefOr[InviteActionList]
    var Removals: js.UndefOr[RemoveActionList]
  }

  object ProposalActions {
    @inline
    def apply(
        Invitations: js.UndefOr[InviteActionList] = js.undefined,
        Removals: js.UndefOr[RemoveActionList] = js.undefined
    ): ProposalActions = {
      val __obj = js.Dynamic.literal()
      Invitations.foreach(__v => __obj.updateDynamic("Invitations")(__v.asInstanceOf[js.Any]))
      Removals.foreach(__v => __obj.updateDynamic("Removals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProposalActions]
    }
  }

  @js.native
  sealed trait ProposalStatus extends js.Any
  object ProposalStatus {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ProposalStatus]
    val APPROVED = "APPROVED".asInstanceOf[ProposalStatus]
    val REJECTED = "REJECTED".asInstanceOf[ProposalStatus]
    val EXPIRED = "EXPIRED".asInstanceOf[ProposalStatus]
    val ACTION_FAILED = "ACTION_FAILED".asInstanceOf[ProposalStatus]

    @inline def values = js.Array(IN_PROGRESS, APPROVED, REJECTED, EXPIRED, ACTION_FAILED)
  }

  /** Properties of a proposal. Applies only to Hyperledger Fabric.
    */
  @js.native
  trait ProposalSummary extends js.Object {
    var Arn: js.UndefOr[ArnString]
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[DescriptionString]
    var ExpirationDate: js.UndefOr[Timestamp]
    var ProposalId: js.UndefOr[ResourceIdString]
    var ProposedByMemberId: js.UndefOr[ResourceIdString]
    var ProposedByMemberName: js.UndefOr[NetworkMemberNameString]
    var Status: js.UndefOr[ProposalStatus]
  }

  object ProposalSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ArnString] = js.undefined,
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[DescriptionString] = js.undefined,
        ExpirationDate: js.UndefOr[Timestamp] = js.undefined,
        ProposalId: js.UndefOr[ResourceIdString] = js.undefined,
        ProposedByMemberId: js.UndefOr[ResourceIdString] = js.undefined,
        ProposedByMemberName: js.UndefOr[NetworkMemberNameString] = js.undefined,
        Status: js.UndefOr[ProposalStatus] = js.undefined
    ): ProposalSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ExpirationDate.foreach(__v => __obj.updateDynamic("ExpirationDate")(__v.asInstanceOf[js.Any]))
      ProposalId.foreach(__v => __obj.updateDynamic("ProposalId")(__v.asInstanceOf[js.Any]))
      ProposedByMemberId.foreach(__v => __obj.updateDynamic("ProposedByMemberId")(__v.asInstanceOf[js.Any]))
      ProposedByMemberName.foreach(__v => __obj.updateDynamic("ProposedByMemberName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProposalSummary]
    }
  }

  @js.native
  trait RejectInvitationInput extends js.Object {
    var InvitationId: ResourceIdString
  }

  object RejectInvitationInput {
    @inline
    def apply(
        InvitationId: ResourceIdString
    ): RejectInvitationInput = {
      val __obj = js.Dynamic.literal(
        "InvitationId" -> InvitationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RejectInvitationInput]
    }
  }

  @js.native
  trait RejectInvitationOutput extends js.Object

  object RejectInvitationOutput {
    @inline
    def apply(): RejectInvitationOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RejectInvitationOutput]
    }
  }

  /** An action to remove a member from a Managed Blockchain network as the result of a removal proposal that is <code>APPROVED</code>. The member and all associated resources are deleted from the network. Applies only to Hyperledger Fabric.
    */
  @js.native
  trait RemoveAction extends js.Object {
    var MemberId: ResourceIdString
  }

  object RemoveAction {
    @inline
    def apply(
        MemberId: ResourceIdString
    ): RemoveAction = {
      val __obj = js.Dynamic.literal(
        "MemberId" -> MemberId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RemoveAction]
    }
  }

  @js.native
  sealed trait StateDBType extends js.Any
  object StateDBType {
    val LevelDB = "LevelDB".asInstanceOf[StateDBType]
    val CouchDB = "CouchDB".asInstanceOf[StateDBType]

    @inline def values = js.Array(LevelDB, CouchDB)
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: ArnString
    var Tags: InputTagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: ArnString,
        Tags: InputTagMap
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

  @js.native
  sealed trait ThresholdComparator extends js.Any
  object ThresholdComparator {
    val GREATER_THAN = "GREATER_THAN".asInstanceOf[ThresholdComparator]
    val GREATER_THAN_OR_EQUAL_TO = "GREATER_THAN_OR_EQUAL_TO".asInstanceOf[ThresholdComparator]

    @inline def values = js.Array(GREATER_THAN, GREATER_THAN_OR_EQUAL_TO)
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: ArnString
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: ArnString,
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
  trait UpdateMemberInput extends js.Object {
    var MemberId: ResourceIdString
    var NetworkId: ResourceIdString
    var LogPublishingConfiguration: js.UndefOr[MemberLogPublishingConfiguration]
  }

  object UpdateMemberInput {
    @inline
    def apply(
        MemberId: ResourceIdString,
        NetworkId: ResourceIdString,
        LogPublishingConfiguration: js.UndefOr[MemberLogPublishingConfiguration] = js.undefined
    ): UpdateMemberInput = {
      val __obj = js.Dynamic.literal(
        "MemberId" -> MemberId.asInstanceOf[js.Any],
        "NetworkId" -> NetworkId.asInstanceOf[js.Any]
      )

      LogPublishingConfiguration.foreach(__v => __obj.updateDynamic("LogPublishingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMemberInput]
    }
  }

  @js.native
  trait UpdateMemberOutput extends js.Object

  object UpdateMemberOutput {
    @inline
    def apply(): UpdateMemberOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateMemberOutput]
    }
  }

  @js.native
  trait UpdateNodeInput extends js.Object {
    var NetworkId: ResourceIdString
    var NodeId: ResourceIdString
    var LogPublishingConfiguration: js.UndefOr[NodeLogPublishingConfiguration]
    var MemberId: js.UndefOr[ResourceIdString]
  }

  object UpdateNodeInput {
    @inline
    def apply(
        NetworkId: ResourceIdString,
        NodeId: ResourceIdString,
        LogPublishingConfiguration: js.UndefOr[NodeLogPublishingConfiguration] = js.undefined,
        MemberId: js.UndefOr[ResourceIdString] = js.undefined
    ): UpdateNodeInput = {
      val __obj = js.Dynamic.literal(
        "NetworkId" -> NetworkId.asInstanceOf[js.Any],
        "NodeId" -> NodeId.asInstanceOf[js.Any]
      )

      LogPublishingConfiguration.foreach(__v => __obj.updateDynamic("LogPublishingConfiguration")(__v.asInstanceOf[js.Any]))
      MemberId.foreach(__v => __obj.updateDynamic("MemberId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNodeInput]
    }
  }

  @js.native
  trait UpdateNodeOutput extends js.Object

  object UpdateNodeOutput {
    @inline
    def apply(): UpdateNodeOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateNodeOutput]
    }
  }

  @js.native
  trait VoteOnProposalInput extends js.Object {
    var NetworkId: ResourceIdString
    var ProposalId: ResourceIdString
    var Vote: VoteValue
    var VoterMemberId: ResourceIdString
  }

  object VoteOnProposalInput {
    @inline
    def apply(
        NetworkId: ResourceIdString,
        ProposalId: ResourceIdString,
        Vote: VoteValue,
        VoterMemberId: ResourceIdString
    ): VoteOnProposalInput = {
      val __obj = js.Dynamic.literal(
        "NetworkId" -> NetworkId.asInstanceOf[js.Any],
        "ProposalId" -> ProposalId.asInstanceOf[js.Any],
        "Vote" -> Vote.asInstanceOf[js.Any],
        "VoterMemberId" -> VoterMemberId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VoteOnProposalInput]
    }
  }

  @js.native
  trait VoteOnProposalOutput extends js.Object

  object VoteOnProposalOutput {
    @inline
    def apply(): VoteOnProposalOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VoteOnProposalOutput]
    }
  }

  /** Properties of an individual vote that a member cast for a proposal. Applies only to Hyperledger Fabric.
    */
  @js.native
  trait VoteSummary extends js.Object {
    var MemberId: js.UndefOr[ResourceIdString]
    var MemberName: js.UndefOr[NetworkMemberNameString]
    var Vote: js.UndefOr[VoteValue]
  }

  object VoteSummary {
    @inline
    def apply(
        MemberId: js.UndefOr[ResourceIdString] = js.undefined,
        MemberName: js.UndefOr[NetworkMemberNameString] = js.undefined,
        Vote: js.UndefOr[VoteValue] = js.undefined
    ): VoteSummary = {
      val __obj = js.Dynamic.literal()
      MemberId.foreach(__v => __obj.updateDynamic("MemberId")(__v.asInstanceOf[js.Any]))
      MemberName.foreach(__v => __obj.updateDynamic("MemberName")(__v.asInstanceOf[js.Any]))
      Vote.foreach(__v => __obj.updateDynamic("Vote")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VoteSummary]
    }
  }

  @js.native
  sealed trait VoteValue extends js.Any
  object VoteValue {
    val YES = "YES".asInstanceOf[VoteValue]
    val NO = "NO".asInstanceOf[VoteValue]

    @inline def values = js.Array(YES, NO)
  }

  /** The voting rules for the network to decide if a proposal is accepted Applies only to Hyperledger Fabric.
    */
  @js.native
  trait VotingPolicy extends js.Object {
    var ApprovalThresholdPolicy: js.UndefOr[ApprovalThresholdPolicy]
  }

  object VotingPolicy {
    @inline
    def apply(
        ApprovalThresholdPolicy: js.UndefOr[ApprovalThresholdPolicy] = js.undefined
    ): VotingPolicy = {
      val __obj = js.Dynamic.literal()
      ApprovalThresholdPolicy.foreach(__v => __obj.updateDynamic("ApprovalThresholdPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VotingPolicy]
    }
  }
}
