package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object directconnect {
  type ASN                 = Int
  type AddressFamily       = String
  type AmazonAddress       = String
  type AssociatedGatewayId = String
  type AvailablePortSpeeds = js.Array[PortSpeed]
  @deprecated("Deprecated in AWS SDK", "forever")
  type AwsDevice                                    = String
  type AwsDeviceV2                                  = String
  type BGPAuthKey                                   = String
  type BGPPeerId                                    = String
  type BGPPeerList                                  = js.Array[BGPPeer]
  type BGPPeerState                                 = String
  type BGPStatus                                    = String
  type Bandwidth                                    = String
  type BooleanFlag                                  = Boolean
  type CIDR                                         = String
  type ConnectionId                                 = String
  type ConnectionList                               = js.Array[Connection]
  type ConnectionName                               = String
  type ConnectionState                              = String
  type Count                                        = Int
  type CustomerAddress                              = String
  type DirectConnectGatewayAssociationId            = String
  type DirectConnectGatewayAssociationList          = js.Array[DirectConnectGatewayAssociation]
  type DirectConnectGatewayAssociationProposalId    = String
  type DirectConnectGatewayAssociationProposalList  = js.Array[DirectConnectGatewayAssociationProposal]
  type DirectConnectGatewayAssociationProposalState = String
  type DirectConnectGatewayAssociationState         = String
  type DirectConnectGatewayAttachmentList           = js.Array[DirectConnectGatewayAttachment]
  type DirectConnectGatewayAttachmentState          = String
  type DirectConnectGatewayAttachmentType           = String
  type DirectConnectGatewayId                       = String
  type DirectConnectGatewayList                     = js.Array[DirectConnectGateway]
  type DirectConnectGatewayName                     = String
  type DirectConnectGatewayState                    = String
  type GatewayIdToAssociate                         = String
  type GatewayIdentifier                            = String
  type GatewayType                                  = String
  type HasLogicalRedundancy                         = String
  type InterconnectId                               = String
  type InterconnectList                             = js.Array[Interconnect]
  type InterconnectName                             = String
  type InterconnectState                            = String
  type JumboFrameCapable                            = Boolean
  type LagId                                        = String
  type LagList                                      = js.Array[Lag]
  type LagName                                      = String
  type LagState                                     = String
  type LoaContent =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type LoaContentType        = String
  type LoaIssueTime          = js.Date
  type LocationCode          = String
  type LocationList          = js.Array[Location]
  type LocationName          = String
  type LongAsn               = Double
  type MTU                   = Int
  type MaxResultSetSize      = Int
  type OwnerAccount          = String
  type PaginationToken       = String
  type PartnerName           = String
  type PortSpeed             = String
  type ProviderName          = String
  type Region                = String
  type ResourceArn           = String
  type ResourceArnList       = js.Array[ResourceArn]
  type ResourceTagList       = js.Array[ResourceTag]
  type RouteFilterPrefixList = js.Array[RouteFilterPrefix]
  type RouterConfig          = String
  type StateChangeError      = String
  type TagKey                = String
  type TagKeyList            = js.Array[TagKey]
  type TagList               = js.Array[Tag]
  type TagValue              = String
  type VLAN                  = Int
  @deprecated("Deprecated in AWS SDK", "forever")
  type VirtualGatewayId   = String
  type VirtualGatewayList = js.Array[VirtualGateway]
  @deprecated("Deprecated in AWS SDK", "forever")
  type VirtualGatewayRegion   = String
  type VirtualGatewayState    = String
  type VirtualInterfaceId     = String
  type VirtualInterfaceList   = js.Array[VirtualInterface]
  type VirtualInterfaceName   = String
  type VirtualInterfaceRegion = String
  type VirtualInterfaceState  = String
  type VirtualInterfaceType   = String

  implicit final class DirectConnectOps(private val service: DirectConnect) extends AnyVal {

    def acceptDirectConnectGatewayAssociationProposalFuture(
        params: AcceptDirectConnectGatewayAssociationProposalRequest
    ): Future[AcceptDirectConnectGatewayAssociationProposalResult] =
      service.acceptDirectConnectGatewayAssociationProposal(params).promise.toFuture
    def allocateHostedConnectionFuture(params: AllocateHostedConnectionRequest): Future[Connection] =
      service.allocateHostedConnection(params).promise.toFuture
    def allocatePrivateVirtualInterfaceFuture(
        params: AllocatePrivateVirtualInterfaceRequest
    ): Future[VirtualInterface] = service.allocatePrivateVirtualInterface(params).promise.toFuture
    def allocatePublicVirtualInterfaceFuture(params: AllocatePublicVirtualInterfaceRequest): Future[VirtualInterface] =
      service.allocatePublicVirtualInterface(params).promise.toFuture
    def allocateTransitVirtualInterfaceFuture(
        params: AllocateTransitVirtualInterfaceRequest
    ): Future[AllocateTransitVirtualInterfaceResult] = service.allocateTransitVirtualInterface(params).promise.toFuture
    def associateConnectionWithLagFuture(params: AssociateConnectionWithLagRequest): Future[Connection] =
      service.associateConnectionWithLag(params).promise.toFuture
    def associateHostedConnectionFuture(params: AssociateHostedConnectionRequest): Future[Connection] =
      service.associateHostedConnection(params).promise.toFuture
    def associateVirtualInterfaceFuture(params: AssociateVirtualInterfaceRequest): Future[VirtualInterface] =
      service.associateVirtualInterface(params).promise.toFuture
    def confirmConnectionFuture(params: ConfirmConnectionRequest): Future[ConfirmConnectionResponse] =
      service.confirmConnection(params).promise.toFuture
    def confirmPrivateVirtualInterfaceFuture(
        params: ConfirmPrivateVirtualInterfaceRequest
    ): Future[ConfirmPrivateVirtualInterfaceResponse] = service.confirmPrivateVirtualInterface(params).promise.toFuture
    def confirmPublicVirtualInterfaceFuture(
        params: ConfirmPublicVirtualInterfaceRequest
    ): Future[ConfirmPublicVirtualInterfaceResponse] = service.confirmPublicVirtualInterface(params).promise.toFuture
    def confirmTransitVirtualInterfaceFuture(
        params: ConfirmTransitVirtualInterfaceRequest
    ): Future[ConfirmTransitVirtualInterfaceResponse] = service.confirmTransitVirtualInterface(params).promise.toFuture
    def createBGPPeerFuture(params: CreateBGPPeerRequest): Future[CreateBGPPeerResponse] =
      service.createBGPPeer(params).promise.toFuture
    def createConnectionFuture(params: CreateConnectionRequest): Future[Connection] =
      service.createConnection(params).promise.toFuture
    def createDirectConnectGatewayAssociationFuture(
        params: CreateDirectConnectGatewayAssociationRequest
    ): Future[CreateDirectConnectGatewayAssociationResult] =
      service.createDirectConnectGatewayAssociation(params).promise.toFuture
    def createDirectConnectGatewayAssociationProposalFuture(
        params: CreateDirectConnectGatewayAssociationProposalRequest
    ): Future[CreateDirectConnectGatewayAssociationProposalResult] =
      service.createDirectConnectGatewayAssociationProposal(params).promise.toFuture
    def createDirectConnectGatewayFuture(
        params: CreateDirectConnectGatewayRequest
    ): Future[CreateDirectConnectGatewayResult] = service.createDirectConnectGateway(params).promise.toFuture
    def createInterconnectFuture(params: CreateInterconnectRequest): Future[Interconnect] =
      service.createInterconnect(params).promise.toFuture
    def createLagFuture(params: CreateLagRequest): Future[Lag] = service.createLag(params).promise.toFuture
    def createPrivateVirtualInterfaceFuture(params: CreatePrivateVirtualInterfaceRequest): Future[VirtualInterface] =
      service.createPrivateVirtualInterface(params).promise.toFuture
    def createPublicVirtualInterfaceFuture(params: CreatePublicVirtualInterfaceRequest): Future[VirtualInterface] =
      service.createPublicVirtualInterface(params).promise.toFuture
    def createTransitVirtualInterfaceFuture(
        params: CreateTransitVirtualInterfaceRequest
    ): Future[CreateTransitVirtualInterfaceResult] = service.createTransitVirtualInterface(params).promise.toFuture
    def deleteBGPPeerFuture(params: DeleteBGPPeerRequest): Future[DeleteBGPPeerResponse] =
      service.deleteBGPPeer(params).promise.toFuture
    def deleteConnectionFuture(params: DeleteConnectionRequest): Future[Connection] =
      service.deleteConnection(params).promise.toFuture
    def deleteDirectConnectGatewayAssociationFuture(
        params: DeleteDirectConnectGatewayAssociationRequest
    ): Future[DeleteDirectConnectGatewayAssociationResult] =
      service.deleteDirectConnectGatewayAssociation(params).promise.toFuture
    def deleteDirectConnectGatewayAssociationProposalFuture(
        params: DeleteDirectConnectGatewayAssociationProposalRequest
    ): Future[DeleteDirectConnectGatewayAssociationProposalResult] =
      service.deleteDirectConnectGatewayAssociationProposal(params).promise.toFuture
    def deleteDirectConnectGatewayFuture(
        params: DeleteDirectConnectGatewayRequest
    ): Future[DeleteDirectConnectGatewayResult] = service.deleteDirectConnectGateway(params).promise.toFuture
    def deleteInterconnectFuture(params: DeleteInterconnectRequest): Future[DeleteInterconnectResponse] =
      service.deleteInterconnect(params).promise.toFuture
    def deleteLagFuture(params: DeleteLagRequest): Future[Lag] = service.deleteLag(params).promise.toFuture
    def deleteVirtualInterfaceFuture(params: DeleteVirtualInterfaceRequest): Future[DeleteVirtualInterfaceResponse] =
      service.deleteVirtualInterface(params).promise.toFuture
    def describeConnectionsFuture(params: DescribeConnectionsRequest): Future[Connections] =
      service.describeConnections(params).promise.toFuture
    def describeDirectConnectGatewayAssociationProposalsFuture(
        params: DescribeDirectConnectGatewayAssociationProposalsRequest
    ): Future[DescribeDirectConnectGatewayAssociationProposalsResult] =
      service.describeDirectConnectGatewayAssociationProposals(params).promise.toFuture
    def describeDirectConnectGatewayAssociationsFuture(
        params: DescribeDirectConnectGatewayAssociationsRequest
    ): Future[DescribeDirectConnectGatewayAssociationsResult] =
      service.describeDirectConnectGatewayAssociations(params).promise.toFuture
    def describeDirectConnectGatewayAttachmentsFuture(
        params: DescribeDirectConnectGatewayAttachmentsRequest
    ): Future[DescribeDirectConnectGatewayAttachmentsResult] =
      service.describeDirectConnectGatewayAttachments(params).promise.toFuture
    def describeDirectConnectGatewaysFuture(
        params: DescribeDirectConnectGatewaysRequest
    ): Future[DescribeDirectConnectGatewaysResult] = service.describeDirectConnectGateways(params).promise.toFuture
    def describeHostedConnectionsFuture(params: DescribeHostedConnectionsRequest): Future[Connections] =
      service.describeHostedConnections(params).promise.toFuture
    def describeInterconnectsFuture(params: DescribeInterconnectsRequest): Future[Interconnects] =
      service.describeInterconnects(params).promise.toFuture
    def describeLagsFuture(params: DescribeLagsRequest): Future[Lags] = service.describeLags(params).promise.toFuture
    def describeLoaFuture(params: DescribeLoaRequest): Future[Loa]    = service.describeLoa(params).promise.toFuture
    def describeLocationsFuture(): Future[Locations]                  = service.describeLocations().promise.toFuture
    def describeTagsFuture(params: DescribeTagsRequest): Future[DescribeTagsResponse] =
      service.describeTags(params).promise.toFuture
    def describeVirtualGatewaysFuture(): Future[VirtualGateways] = service.describeVirtualGateways().promise.toFuture
    def describeVirtualInterfacesFuture(params: DescribeVirtualInterfacesRequest): Future[VirtualInterfaces] =
      service.describeVirtualInterfaces(params).promise.toFuture
    def disassociateConnectionFromLagFuture(params: DisassociateConnectionFromLagRequest): Future[Connection] =
      service.disassociateConnectionFromLag(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updateDirectConnectGatewayAssociationFuture(
        params: UpdateDirectConnectGatewayAssociationRequest
    ): Future[UpdateDirectConnectGatewayAssociationResult] =
      service.updateDirectConnectGatewayAssociation(params).promise.toFuture
    def updateLagFuture(params: UpdateLagRequest): Future[Lag] = service.updateLag(params).promise.toFuture
    def updateVirtualInterfaceAttributesFuture(
        params: UpdateVirtualInterfaceAttributesRequest
    ): Future[VirtualInterface] = service.updateVirtualInterfaceAttributes(params).promise.toFuture
  }
}

package directconnect {
  @js.native
  @JSImport("aws-sdk", "DirectConnect")
  class DirectConnect() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptDirectConnectGatewayAssociationProposal(
        params: AcceptDirectConnectGatewayAssociationProposalRequest
    ): Request[AcceptDirectConnectGatewayAssociationProposalResult]                            = js.native
    def allocateHostedConnection(params: AllocateHostedConnectionRequest): Request[Connection] = js.native
    def allocatePrivateVirtualInterface(params: AllocatePrivateVirtualInterfaceRequest): Request[VirtualInterface] =
      js.native
    def allocatePublicVirtualInterface(params: AllocatePublicVirtualInterfaceRequest): Request[VirtualInterface] =
      js.native
    def allocateTransitVirtualInterface(
        params: AllocateTransitVirtualInterfaceRequest
    ): Request[AllocateTransitVirtualInterfaceResult]                                                  = js.native
    def associateConnectionWithLag(params: AssociateConnectionWithLagRequest): Request[Connection]     = js.native
    def associateHostedConnection(params: AssociateHostedConnectionRequest): Request[Connection]       = js.native
    def associateVirtualInterface(params: AssociateVirtualInterfaceRequest): Request[VirtualInterface] = js.native
    def confirmConnection(params: ConfirmConnectionRequest): Request[ConfirmConnectionResponse]        = js.native
    def confirmPrivateVirtualInterface(
        params: ConfirmPrivateVirtualInterfaceRequest
    ): Request[ConfirmPrivateVirtualInterfaceResponse] = js.native
    def confirmPublicVirtualInterface(
        params: ConfirmPublicVirtualInterfaceRequest
    ): Request[ConfirmPublicVirtualInterfaceResponse] = js.native
    def confirmTransitVirtualInterface(
        params: ConfirmTransitVirtualInterfaceRequest
    ): Request[ConfirmTransitVirtualInterfaceResponse]                              = js.native
    def createBGPPeer(params: CreateBGPPeerRequest): Request[CreateBGPPeerResponse] = js.native
    def createConnection(params: CreateConnectionRequest): Request[Connection]      = js.native
    def createDirectConnectGateway(
        params: CreateDirectConnectGatewayRequest
    ): Request[CreateDirectConnectGatewayResult] = js.native
    def createDirectConnectGatewayAssociation(
        params: CreateDirectConnectGatewayAssociationRequest
    ): Request[CreateDirectConnectGatewayAssociationResult] = js.native
    def createDirectConnectGatewayAssociationProposal(
        params: CreateDirectConnectGatewayAssociationProposalRequest
    ): Request[CreateDirectConnectGatewayAssociationProposalResult]                  = js.native
    def createInterconnect(params: CreateInterconnectRequest): Request[Interconnect] = js.native
    def createLag(params: CreateLagRequest): Request[Lag]                            = js.native
    def createPrivateVirtualInterface(params: CreatePrivateVirtualInterfaceRequest): Request[VirtualInterface] =
      js.native
    def createPublicVirtualInterface(params: CreatePublicVirtualInterfaceRequest): Request[VirtualInterface] = js.native
    def createTransitVirtualInterface(
        params: CreateTransitVirtualInterfaceRequest
    ): Request[CreateTransitVirtualInterfaceResult]                                 = js.native
    def deleteBGPPeer(params: DeleteBGPPeerRequest): Request[DeleteBGPPeerResponse] = js.native
    def deleteConnection(params: DeleteConnectionRequest): Request[Connection]      = js.native
    def deleteDirectConnectGateway(
        params: DeleteDirectConnectGatewayRequest
    ): Request[DeleteDirectConnectGatewayResult] = js.native
    def deleteDirectConnectGatewayAssociation(
        params: DeleteDirectConnectGatewayAssociationRequest
    ): Request[DeleteDirectConnectGatewayAssociationResult] = js.native
    def deleteDirectConnectGatewayAssociationProposal(
        params: DeleteDirectConnectGatewayAssociationProposalRequest
    ): Request[DeleteDirectConnectGatewayAssociationProposalResult]                                = js.native
    def deleteInterconnect(params: DeleteInterconnectRequest): Request[DeleteInterconnectResponse] = js.native
    def deleteLag(params: DeleteLagRequest): Request[Lag]                                          = js.native
    def deleteVirtualInterface(params: DeleteVirtualInterfaceRequest): Request[DeleteVirtualInterfaceResponse] =
      js.native
    def describeConnections(params: DescribeConnectionsRequest): Request[Connections] = js.native
    def describeDirectConnectGatewayAssociationProposals(
        params: DescribeDirectConnectGatewayAssociationProposalsRequest
    ): Request[DescribeDirectConnectGatewayAssociationProposalsResult] = js.native
    def describeDirectConnectGatewayAssociations(
        params: DescribeDirectConnectGatewayAssociationsRequest
    ): Request[DescribeDirectConnectGatewayAssociationsResult] = js.native
    def describeDirectConnectGatewayAttachments(
        params: DescribeDirectConnectGatewayAttachmentsRequest
    ): Request[DescribeDirectConnectGatewayAttachmentsResult] = js.native
    def describeDirectConnectGateways(
        params: DescribeDirectConnectGatewaysRequest
    ): Request[DescribeDirectConnectGatewaysResult]                                                      = js.native
    def describeHostedConnections(params: DescribeHostedConnectionsRequest): Request[Connections]        = js.native
    def describeInterconnects(params: DescribeInterconnectsRequest): Request[Interconnects]              = js.native
    def describeLags(params: DescribeLagsRequest): Request[Lags]                                         = js.native
    def describeLoa(params: DescribeLoaRequest): Request[Loa]                                            = js.native
    def describeLocations(): Request[Locations]                                                          = js.native
    def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResponse]                         = js.native
    def describeVirtualGateways(): Request[VirtualGateways]                                              = js.native
    def describeVirtualInterfaces(params: DescribeVirtualInterfacesRequest): Request[VirtualInterfaces]  = js.native
    def disassociateConnectionFromLag(params: DisassociateConnectionFromLagRequest): Request[Connection] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                            = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                      = js.native
    def updateDirectConnectGatewayAssociation(
        params: UpdateDirectConnectGatewayAssociationRequest
    ): Request[UpdateDirectConnectGatewayAssociationResult] = js.native
    def updateLag(params: UpdateLagRequest): Request[Lag]   = js.native
    def updateVirtualInterfaceAttributes(params: UpdateVirtualInterfaceAttributesRequest): Request[VirtualInterface] =
      js.native
    @deprecated("Deprecated in AWS SDK", "forever") def allocateConnectionOnInterconnect(
        params: AllocateConnectionOnInterconnectRequest
    ): Request[Connection] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def describeConnectionLoa(
        params: DescribeConnectionLoaRequest
    ): Request[DescribeConnectionLoaResponse] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def describeConnectionsOnInterconnect(
        params: DescribeConnectionsOnInterconnectRequest
    ): Request[Connections] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def describeInterconnectLoa(
        params: DescribeInterconnectLoaRequest
    ): Request[DescribeInterconnectLoaResponse] = js.native
  }

  @js.native
  trait AcceptDirectConnectGatewayAssociationProposalRequest extends js.Object {
    var associatedGatewayOwnerAccount: OwnerAccount
    var directConnectGatewayId: DirectConnectGatewayId
    var proposalId: DirectConnectGatewayAssociationProposalId
    var overrideAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList]
  }

  object AcceptDirectConnectGatewayAssociationProposalRequest {
    @inline
    def apply(
        associatedGatewayOwnerAccount: OwnerAccount,
        directConnectGatewayId: DirectConnectGatewayId,
        proposalId: DirectConnectGatewayAssociationProposalId,
        overrideAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
    ): AcceptDirectConnectGatewayAssociationProposalRequest = {
      val __obj = js.Dynamic.literal(
        "associatedGatewayOwnerAccount" -> associatedGatewayOwnerAccount.asInstanceOf[js.Any],
        "directConnectGatewayId"        -> directConnectGatewayId.asInstanceOf[js.Any],
        "proposalId"                    -> proposalId.asInstanceOf[js.Any]
      )

      overrideAllowedPrefixesToDirectConnectGateway.foreach(
        __v => __obj.updateDynamic("overrideAllowedPrefixesToDirectConnectGateway")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[AcceptDirectConnectGatewayAssociationProposalRequest]
    }
  }

  @js.native
  trait AcceptDirectConnectGatewayAssociationProposalResult extends js.Object {
    var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation]
  }

  object AcceptDirectConnectGatewayAssociationProposalResult {
    @inline
    def apply(
        directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.undefined
    ): AcceptDirectConnectGatewayAssociationProposalResult = {
      val __obj = js.Dynamic.literal()
      directConnectGatewayAssociation.foreach(
        __v => __obj.updateDynamic("directConnectGatewayAssociation")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[AcceptDirectConnectGatewayAssociationProposalResult]
    }
  }

  object AddressFamilyEnum {
    val ipv4 = "ipv4"
    val ipv6 = "ipv6"

    val values = js.Object.freeze(js.Array(ipv4, ipv6))
  }

  @js.native
  trait AllocateConnectionOnInterconnectRequest extends js.Object {
    var bandwidth: Bandwidth
    var connectionName: ConnectionName
    var interconnectId: InterconnectId
    var ownerAccount: OwnerAccount
    var vlan: VLAN
  }

  object AllocateConnectionOnInterconnectRequest {
    @inline
    def apply(
        bandwidth: Bandwidth,
        connectionName: ConnectionName,
        interconnectId: InterconnectId,
        ownerAccount: OwnerAccount,
        vlan: VLAN
    ): AllocateConnectionOnInterconnectRequest = {
      val __obj = js.Dynamic.literal(
        "bandwidth"      -> bandwidth.asInstanceOf[js.Any],
        "connectionName" -> connectionName.asInstanceOf[js.Any],
        "interconnectId" -> interconnectId.asInstanceOf[js.Any],
        "ownerAccount"   -> ownerAccount.asInstanceOf[js.Any],
        "vlan"           -> vlan.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AllocateConnectionOnInterconnectRequest]
    }
  }

  @js.native
  trait AllocateHostedConnectionRequest extends js.Object {
    var bandwidth: Bandwidth
    var connectionId: ConnectionId
    var connectionName: ConnectionName
    var ownerAccount: OwnerAccount
    var vlan: VLAN
    var tags: js.UndefOr[TagList]
  }

  object AllocateHostedConnectionRequest {
    @inline
    def apply(
        bandwidth: Bandwidth,
        connectionId: ConnectionId,
        connectionName: ConnectionName,
        ownerAccount: OwnerAccount,
        vlan: VLAN,
        tags: js.UndefOr[TagList] = js.undefined
    ): AllocateHostedConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "bandwidth"      -> bandwidth.asInstanceOf[js.Any],
        "connectionId"   -> connectionId.asInstanceOf[js.Any],
        "connectionName" -> connectionName.asInstanceOf[js.Any],
        "ownerAccount"   -> ownerAccount.asInstanceOf[js.Any],
        "vlan"           -> vlan.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AllocateHostedConnectionRequest]
    }
  }

  @js.native
  trait AllocatePrivateVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var newPrivateVirtualInterfaceAllocation: NewPrivateVirtualInterfaceAllocation
    var ownerAccount: OwnerAccount
  }

  object AllocatePrivateVirtualInterfaceRequest {
    @inline
    def apply(
        connectionId: ConnectionId,
        newPrivateVirtualInterfaceAllocation: NewPrivateVirtualInterfaceAllocation,
        ownerAccount: OwnerAccount
    ): AllocatePrivateVirtualInterfaceRequest = {
      val __obj = js.Dynamic.literal(
        "connectionId"                         -> connectionId.asInstanceOf[js.Any],
        "newPrivateVirtualInterfaceAllocation" -> newPrivateVirtualInterfaceAllocation.asInstanceOf[js.Any],
        "ownerAccount"                         -> ownerAccount.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AllocatePrivateVirtualInterfaceRequest]
    }
  }

  @js.native
  trait AllocatePublicVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var newPublicVirtualInterfaceAllocation: NewPublicVirtualInterfaceAllocation
    var ownerAccount: OwnerAccount
  }

  object AllocatePublicVirtualInterfaceRequest {
    @inline
    def apply(
        connectionId: ConnectionId,
        newPublicVirtualInterfaceAllocation: NewPublicVirtualInterfaceAllocation,
        ownerAccount: OwnerAccount
    ): AllocatePublicVirtualInterfaceRequest = {
      val __obj = js.Dynamic.literal(
        "connectionId"                        -> connectionId.asInstanceOf[js.Any],
        "newPublicVirtualInterfaceAllocation" -> newPublicVirtualInterfaceAllocation.asInstanceOf[js.Any],
        "ownerAccount"                        -> ownerAccount.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AllocatePublicVirtualInterfaceRequest]
    }
  }

  @js.native
  trait AllocateTransitVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var newTransitVirtualInterfaceAllocation: NewTransitVirtualInterfaceAllocation
    var ownerAccount: OwnerAccount
  }

  object AllocateTransitVirtualInterfaceRequest {
    @inline
    def apply(
        connectionId: ConnectionId,
        newTransitVirtualInterfaceAllocation: NewTransitVirtualInterfaceAllocation,
        ownerAccount: OwnerAccount
    ): AllocateTransitVirtualInterfaceRequest = {
      val __obj = js.Dynamic.literal(
        "connectionId"                         -> connectionId.asInstanceOf[js.Any],
        "newTransitVirtualInterfaceAllocation" -> newTransitVirtualInterfaceAllocation.asInstanceOf[js.Any],
        "ownerAccount"                         -> ownerAccount.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AllocateTransitVirtualInterfaceRequest]
    }
  }

  @js.native
  trait AllocateTransitVirtualInterfaceResult extends js.Object {
    var virtualInterface: js.UndefOr[VirtualInterface]
  }

  object AllocateTransitVirtualInterfaceResult {
    @inline
    def apply(
        virtualInterface: js.UndefOr[VirtualInterface] = js.undefined
    ): AllocateTransitVirtualInterfaceResult = {
      val __obj = js.Dynamic.literal()
      virtualInterface.foreach(__v => __obj.updateDynamic("virtualInterface")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AllocateTransitVirtualInterfaceResult]
    }
  }

  @js.native
  trait AssociateConnectionWithLagRequest extends js.Object {
    var connectionId: ConnectionId
    var lagId: LagId
  }

  object AssociateConnectionWithLagRequest {
    @inline
    def apply(
        connectionId: ConnectionId,
        lagId: LagId
    ): AssociateConnectionWithLagRequest = {
      val __obj = js.Dynamic.literal(
        "connectionId" -> connectionId.asInstanceOf[js.Any],
        "lagId"        -> lagId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateConnectionWithLagRequest]
    }
  }

  @js.native
  trait AssociateHostedConnectionRequest extends js.Object {
    var connectionId: ConnectionId
    var parentConnectionId: ConnectionId
  }

  object AssociateHostedConnectionRequest {
    @inline
    def apply(
        connectionId: ConnectionId,
        parentConnectionId: ConnectionId
    ): AssociateHostedConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "connectionId"       -> connectionId.asInstanceOf[js.Any],
        "parentConnectionId" -> parentConnectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateHostedConnectionRequest]
    }
  }

  @js.native
  trait AssociateVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var virtualInterfaceId: VirtualInterfaceId
  }

  object AssociateVirtualInterfaceRequest {
    @inline
    def apply(
        connectionId: ConnectionId,
        virtualInterfaceId: VirtualInterfaceId
    ): AssociateVirtualInterfaceRequest = {
      val __obj = js.Dynamic.literal(
        "connectionId"       -> connectionId.asInstanceOf[js.Any],
        "virtualInterfaceId" -> virtualInterfaceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateVirtualInterfaceRequest]
    }
  }

  /**
    * Information about the associated gateway.
    */
  @js.native
  trait AssociatedGateway extends js.Object {
    var id: js.UndefOr[GatewayIdentifier]
    var ownerAccount: js.UndefOr[OwnerAccount]
    var region: js.UndefOr[Region]
    var `type`: js.UndefOr[GatewayType]
  }

  object AssociatedGateway {
    @inline
    def apply(
        id: js.UndefOr[GatewayIdentifier] = js.undefined,
        ownerAccount: js.UndefOr[OwnerAccount] = js.undefined,
        region: js.UndefOr[Region] = js.undefined,
        `type`: js.UndefOr[GatewayType] = js.undefined
    ): AssociatedGateway = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      ownerAccount.foreach(__v => __obj.updateDynamic("ownerAccount")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociatedGateway]
    }
  }

  /**
    * Information about a BGP peer.
    */
  @js.native
  trait BGPPeer extends js.Object {
    var addressFamily: js.UndefOr[AddressFamily]
    var amazonAddress: js.UndefOr[AmazonAddress]
    var asn: js.UndefOr[ASN]
    var authKey: js.UndefOr[BGPAuthKey]
    var awsDeviceV2: js.UndefOr[AwsDeviceV2]
    var bgpPeerId: js.UndefOr[BGPPeerId]
    var bgpPeerState: js.UndefOr[BGPPeerState]
    var bgpStatus: js.UndefOr[BGPStatus]
    var customerAddress: js.UndefOr[CustomerAddress]
  }

  object BGPPeer {
    @inline
    def apply(
        addressFamily: js.UndefOr[AddressFamily] = js.undefined,
        amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
        asn: js.UndefOr[ASN] = js.undefined,
        authKey: js.UndefOr[BGPAuthKey] = js.undefined,
        awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined,
        bgpPeerId: js.UndefOr[BGPPeerId] = js.undefined,
        bgpPeerState: js.UndefOr[BGPPeerState] = js.undefined,
        bgpStatus: js.UndefOr[BGPStatus] = js.undefined,
        customerAddress: js.UndefOr[CustomerAddress] = js.undefined
    ): BGPPeer = {
      val __obj = js.Dynamic.literal()
      addressFamily.foreach(__v => __obj.updateDynamic("addressFamily")(__v.asInstanceOf[js.Any]))
      amazonAddress.foreach(__v => __obj.updateDynamic("amazonAddress")(__v.asInstanceOf[js.Any]))
      asn.foreach(__v => __obj.updateDynamic("asn")(__v.asInstanceOf[js.Any]))
      authKey.foreach(__v => __obj.updateDynamic("authKey")(__v.asInstanceOf[js.Any]))
      awsDeviceV2.foreach(__v => __obj.updateDynamic("awsDeviceV2")(__v.asInstanceOf[js.Any]))
      bgpPeerId.foreach(__v => __obj.updateDynamic("bgpPeerId")(__v.asInstanceOf[js.Any]))
      bgpPeerState.foreach(__v => __obj.updateDynamic("bgpPeerState")(__v.asInstanceOf[js.Any]))
      bgpStatus.foreach(__v => __obj.updateDynamic("bgpStatus")(__v.asInstanceOf[js.Any]))
      customerAddress.foreach(__v => __obj.updateDynamic("customerAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BGPPeer]
    }
  }

  object BGPPeerStateEnum {
    val verifying = "verifying"
    val pending   = "pending"
    val available = "available"
    val deleting  = "deleting"
    val deleted   = "deleted"

    val values = js.Object.freeze(js.Array(verifying, pending, available, deleting, deleted))
  }

  object BGPStatusEnum {
    val up      = "up"
    val down    = "down"
    val unknown = "unknown"

    val values = js.Object.freeze(js.Array(up, down, unknown))
  }

  @js.native
  trait ConfirmConnectionRequest extends js.Object {
    var connectionId: ConnectionId
  }

  object ConfirmConnectionRequest {
    @inline
    def apply(
        connectionId: ConnectionId
    ): ConfirmConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "connectionId" -> connectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ConfirmConnectionRequest]
    }
  }

  @js.native
  trait ConfirmConnectionResponse extends js.Object {
    var connectionState: js.UndefOr[ConnectionState]
  }

  object ConfirmConnectionResponse {
    @inline
    def apply(
        connectionState: js.UndefOr[ConnectionState] = js.undefined
    ): ConfirmConnectionResponse = {
      val __obj = js.Dynamic.literal()
      connectionState.foreach(__v => __obj.updateDynamic("connectionState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfirmConnectionResponse]
    }
  }

  @js.native
  trait ConfirmPrivateVirtualInterfaceRequest extends js.Object {
    var virtualInterfaceId: VirtualInterfaceId
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
  }

  object ConfirmPrivateVirtualInterfaceRequest {
    @inline
    def apply(
        virtualInterfaceId: VirtualInterfaceId,
        directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
        virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
    ): ConfirmPrivateVirtualInterfaceRequest = {
      val __obj = js.Dynamic.literal(
        "virtualInterfaceId" -> virtualInterfaceId.asInstanceOf[js.Any]
      )

      directConnectGatewayId.foreach(__v => __obj.updateDynamic("directConnectGatewayId")(__v.asInstanceOf[js.Any]))
      virtualGatewayId.foreach(__v => __obj.updateDynamic("virtualGatewayId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfirmPrivateVirtualInterfaceRequest]
    }
  }

  @js.native
  trait ConfirmPrivateVirtualInterfaceResponse extends js.Object {
    var virtualInterfaceState: js.UndefOr[VirtualInterfaceState]
  }

  object ConfirmPrivateVirtualInterfaceResponse {
    @inline
    def apply(
        virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.undefined
    ): ConfirmPrivateVirtualInterfaceResponse = {
      val __obj = js.Dynamic.literal()
      virtualInterfaceState.foreach(__v => __obj.updateDynamic("virtualInterfaceState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfirmPrivateVirtualInterfaceResponse]
    }
  }

  @js.native
  trait ConfirmPublicVirtualInterfaceRequest extends js.Object {
    var virtualInterfaceId: VirtualInterfaceId
  }

  object ConfirmPublicVirtualInterfaceRequest {
    @inline
    def apply(
        virtualInterfaceId: VirtualInterfaceId
    ): ConfirmPublicVirtualInterfaceRequest = {
      val __obj = js.Dynamic.literal(
        "virtualInterfaceId" -> virtualInterfaceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ConfirmPublicVirtualInterfaceRequest]
    }
  }

  @js.native
  trait ConfirmPublicVirtualInterfaceResponse extends js.Object {
    var virtualInterfaceState: js.UndefOr[VirtualInterfaceState]
  }

  object ConfirmPublicVirtualInterfaceResponse {
    @inline
    def apply(
        virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.undefined
    ): ConfirmPublicVirtualInterfaceResponse = {
      val __obj = js.Dynamic.literal()
      virtualInterfaceState.foreach(__v => __obj.updateDynamic("virtualInterfaceState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfirmPublicVirtualInterfaceResponse]
    }
  }

  @js.native
  trait ConfirmTransitVirtualInterfaceRequest extends js.Object {
    var directConnectGatewayId: DirectConnectGatewayId
    var virtualInterfaceId: VirtualInterfaceId
  }

  object ConfirmTransitVirtualInterfaceRequest {
    @inline
    def apply(
        directConnectGatewayId: DirectConnectGatewayId,
        virtualInterfaceId: VirtualInterfaceId
    ): ConfirmTransitVirtualInterfaceRequest = {
      val __obj = js.Dynamic.literal(
        "directConnectGatewayId" -> directConnectGatewayId.asInstanceOf[js.Any],
        "virtualInterfaceId"     -> virtualInterfaceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ConfirmTransitVirtualInterfaceRequest]
    }
  }

  @js.native
  trait ConfirmTransitVirtualInterfaceResponse extends js.Object {
    var virtualInterfaceState: js.UndefOr[VirtualInterfaceState]
  }

  object ConfirmTransitVirtualInterfaceResponse {
    @inline
    def apply(
        virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.undefined
    ): ConfirmTransitVirtualInterfaceResponse = {
      val __obj = js.Dynamic.literal()
      virtualInterfaceState.foreach(__v => __obj.updateDynamic("virtualInterfaceState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfirmTransitVirtualInterfaceResponse]
    }
  }

  /**
    * Information about an AWS Direct Connect connection.
    */
  @js.native
  trait Connection extends js.Object {
    var awsDevice: js.UndefOr[AwsDevice]
    var awsDeviceV2: js.UndefOr[AwsDeviceV2]
    var bandwidth: js.UndefOr[Bandwidth]
    var connectionId: js.UndefOr[ConnectionId]
    var connectionName: js.UndefOr[ConnectionName]
    var connectionState: js.UndefOr[ConnectionState]
    var hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy]
    var jumboFrameCapable: js.UndefOr[JumboFrameCapable]
    var lagId: js.UndefOr[LagId]
    var loaIssueTime: js.UndefOr[LoaIssueTime]
    var location: js.UndefOr[LocationCode]
    var ownerAccount: js.UndefOr[OwnerAccount]
    var partnerName: js.UndefOr[PartnerName]
    var region: js.UndefOr[Region]
    var tags: js.UndefOr[TagList]
    var vlan: js.UndefOr[VLAN]
  }

  object Connection {
    @inline
    def apply(
        awsDevice: js.UndefOr[AwsDevice] = js.undefined,
        awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined,
        bandwidth: js.UndefOr[Bandwidth] = js.undefined,
        connectionId: js.UndefOr[ConnectionId] = js.undefined,
        connectionName: js.UndefOr[ConnectionName] = js.undefined,
        connectionState: js.UndefOr[ConnectionState] = js.undefined,
        hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy] = js.undefined,
        jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined,
        lagId: js.UndefOr[LagId] = js.undefined,
        loaIssueTime: js.UndefOr[LoaIssueTime] = js.undefined,
        location: js.UndefOr[LocationCode] = js.undefined,
        ownerAccount: js.UndefOr[OwnerAccount] = js.undefined,
        partnerName: js.UndefOr[PartnerName] = js.undefined,
        region: js.UndefOr[Region] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        vlan: js.UndefOr[VLAN] = js.undefined
    ): Connection = {
      val __obj = js.Dynamic.literal()
      awsDevice.foreach(__v => __obj.updateDynamic("awsDevice")(__v.asInstanceOf[js.Any]))
      awsDeviceV2.foreach(__v => __obj.updateDynamic("awsDeviceV2")(__v.asInstanceOf[js.Any]))
      bandwidth.foreach(__v => __obj.updateDynamic("bandwidth")(__v.asInstanceOf[js.Any]))
      connectionId.foreach(__v => __obj.updateDynamic("connectionId")(__v.asInstanceOf[js.Any]))
      connectionName.foreach(__v => __obj.updateDynamic("connectionName")(__v.asInstanceOf[js.Any]))
      connectionState.foreach(__v => __obj.updateDynamic("connectionState")(__v.asInstanceOf[js.Any]))
      hasLogicalRedundancy.foreach(__v => __obj.updateDynamic("hasLogicalRedundancy")(__v.asInstanceOf[js.Any]))
      jumboFrameCapable.foreach(__v => __obj.updateDynamic("jumboFrameCapable")(__v.asInstanceOf[js.Any]))
      lagId.foreach(__v => __obj.updateDynamic("lagId")(__v.asInstanceOf[js.Any]))
      loaIssueTime.foreach(__v => __obj.updateDynamic("loaIssueTime")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      ownerAccount.foreach(__v => __obj.updateDynamic("ownerAccount")(__v.asInstanceOf[js.Any]))
      partnerName.foreach(__v => __obj.updateDynamic("partnerName")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      vlan.foreach(__v => __obj.updateDynamic("vlan")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Connection]
    }
  }

  object ConnectionStateEnum {
    val ordering  = "ordering"
    val requested = "requested"
    val pending   = "pending"
    val available = "available"
    val down      = "down"
    val deleting  = "deleting"
    val deleted   = "deleted"
    val rejected  = "rejected"
    val unknown   = "unknown"

    val values =
      js.Object.freeze(js.Array(ordering, requested, pending, available, down, deleting, deleted, rejected, unknown))
  }

  @js.native
  trait Connections extends js.Object {
    var connections: js.UndefOr[ConnectionList]
  }

  object Connections {
    @inline
    def apply(
        connections: js.UndefOr[ConnectionList] = js.undefined
    ): Connections = {
      val __obj = js.Dynamic.literal()
      connections.foreach(__v => __obj.updateDynamic("connections")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Connections]
    }
  }

  @js.native
  trait CreateBGPPeerRequest extends js.Object {
    var newBGPPeer: js.UndefOr[NewBGPPeer]
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
  }

  object CreateBGPPeerRequest {
    @inline
    def apply(
        newBGPPeer: js.UndefOr[NewBGPPeer] = js.undefined,
        virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
    ): CreateBGPPeerRequest = {
      val __obj = js.Dynamic.literal()
      newBGPPeer.foreach(__v => __obj.updateDynamic("newBGPPeer")(__v.asInstanceOf[js.Any]))
      virtualInterfaceId.foreach(__v => __obj.updateDynamic("virtualInterfaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBGPPeerRequest]
    }
  }

  @js.native
  trait CreateBGPPeerResponse extends js.Object {
    var virtualInterface: js.UndefOr[VirtualInterface]
  }

  object CreateBGPPeerResponse {
    @inline
    def apply(
        virtualInterface: js.UndefOr[VirtualInterface] = js.undefined
    ): CreateBGPPeerResponse = {
      val __obj = js.Dynamic.literal()
      virtualInterface.foreach(__v => __obj.updateDynamic("virtualInterface")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBGPPeerResponse]
    }
  }

  @js.native
  trait CreateConnectionRequest extends js.Object {
    var bandwidth: Bandwidth
    var connectionName: ConnectionName
    var location: LocationCode
    var lagId: js.UndefOr[LagId]
    var tags: js.UndefOr[TagList]
  }

  object CreateConnectionRequest {
    @inline
    def apply(
        bandwidth: Bandwidth,
        connectionName: ConnectionName,
        location: LocationCode,
        lagId: js.UndefOr[LagId] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "bandwidth"      -> bandwidth.asInstanceOf[js.Any],
        "connectionName" -> connectionName.asInstanceOf[js.Any],
        "location"       -> location.asInstanceOf[js.Any]
      )

      lagId.foreach(__v => __obj.updateDynamic("lagId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectionRequest]
    }
  }

  @js.native
  trait CreateDirectConnectGatewayAssociationProposalRequest extends js.Object {
    var directConnectGatewayId: DirectConnectGatewayId
    var directConnectGatewayOwnerAccount: OwnerAccount
    var gatewayId: GatewayIdToAssociate
    var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList]
    var removeAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList]
  }

  object CreateDirectConnectGatewayAssociationProposalRequest {
    @inline
    def apply(
        directConnectGatewayId: DirectConnectGatewayId,
        directConnectGatewayOwnerAccount: OwnerAccount,
        gatewayId: GatewayIdToAssociate,
        addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined,
        removeAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
    ): CreateDirectConnectGatewayAssociationProposalRequest = {
      val __obj = js.Dynamic.literal(
        "directConnectGatewayId"           -> directConnectGatewayId.asInstanceOf[js.Any],
        "directConnectGatewayOwnerAccount" -> directConnectGatewayOwnerAccount.asInstanceOf[js.Any],
        "gatewayId"                        -> gatewayId.asInstanceOf[js.Any]
      )

      addAllowedPrefixesToDirectConnectGateway.foreach(
        __v => __obj.updateDynamic("addAllowedPrefixesToDirectConnectGateway")(__v.asInstanceOf[js.Any])
      )
      removeAllowedPrefixesToDirectConnectGateway.foreach(
        __v => __obj.updateDynamic("removeAllowedPrefixesToDirectConnectGateway")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CreateDirectConnectGatewayAssociationProposalRequest]
    }
  }

  @js.native
  trait CreateDirectConnectGatewayAssociationProposalResult extends js.Object {
    var directConnectGatewayAssociationProposal: js.UndefOr[DirectConnectGatewayAssociationProposal]
  }

  object CreateDirectConnectGatewayAssociationProposalResult {
    @inline
    def apply(
        directConnectGatewayAssociationProposal: js.UndefOr[DirectConnectGatewayAssociationProposal] = js.undefined
    ): CreateDirectConnectGatewayAssociationProposalResult = {
      val __obj = js.Dynamic.literal()
      directConnectGatewayAssociationProposal.foreach(
        __v => __obj.updateDynamic("directConnectGatewayAssociationProposal")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CreateDirectConnectGatewayAssociationProposalResult]
    }
  }

  @js.native
  trait CreateDirectConnectGatewayAssociationRequest extends js.Object {
    var directConnectGatewayId: DirectConnectGatewayId
    var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList]
    var gatewayId: js.UndefOr[GatewayIdToAssociate]
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
  }

  object CreateDirectConnectGatewayAssociationRequest {
    @inline
    def apply(
        directConnectGatewayId: DirectConnectGatewayId,
        addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined,
        gatewayId: js.UndefOr[GatewayIdToAssociate] = js.undefined,
        virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
    ): CreateDirectConnectGatewayAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "directConnectGatewayId" -> directConnectGatewayId.asInstanceOf[js.Any]
      )

      addAllowedPrefixesToDirectConnectGateway.foreach(
        __v => __obj.updateDynamic("addAllowedPrefixesToDirectConnectGateway")(__v.asInstanceOf[js.Any])
      )
      gatewayId.foreach(__v => __obj.updateDynamic("gatewayId")(__v.asInstanceOf[js.Any]))
      virtualGatewayId.foreach(__v => __obj.updateDynamic("virtualGatewayId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDirectConnectGatewayAssociationRequest]
    }
  }

  @js.native
  trait CreateDirectConnectGatewayAssociationResult extends js.Object {
    var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation]
  }

  object CreateDirectConnectGatewayAssociationResult {
    @inline
    def apply(
        directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.undefined
    ): CreateDirectConnectGatewayAssociationResult = {
      val __obj = js.Dynamic.literal()
      directConnectGatewayAssociation.foreach(
        __v => __obj.updateDynamic("directConnectGatewayAssociation")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CreateDirectConnectGatewayAssociationResult]
    }
  }

  @js.native
  trait CreateDirectConnectGatewayRequest extends js.Object {
    var directConnectGatewayName: DirectConnectGatewayName
    var amazonSideAsn: js.UndefOr[LongAsn]
  }

  object CreateDirectConnectGatewayRequest {
    @inline
    def apply(
        directConnectGatewayName: DirectConnectGatewayName,
        amazonSideAsn: js.UndefOr[LongAsn] = js.undefined
    ): CreateDirectConnectGatewayRequest = {
      val __obj = js.Dynamic.literal(
        "directConnectGatewayName" -> directConnectGatewayName.asInstanceOf[js.Any]
      )

      amazonSideAsn.foreach(__v => __obj.updateDynamic("amazonSideAsn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDirectConnectGatewayRequest]
    }
  }

  @js.native
  trait CreateDirectConnectGatewayResult extends js.Object {
    var directConnectGateway: js.UndefOr[DirectConnectGateway]
  }

  object CreateDirectConnectGatewayResult {
    @inline
    def apply(
        directConnectGateway: js.UndefOr[DirectConnectGateway] = js.undefined
    ): CreateDirectConnectGatewayResult = {
      val __obj = js.Dynamic.literal()
      directConnectGateway.foreach(__v => __obj.updateDynamic("directConnectGateway")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDirectConnectGatewayResult]
    }
  }

  @js.native
  trait CreateInterconnectRequest extends js.Object {
    var bandwidth: Bandwidth
    var interconnectName: InterconnectName
    var location: LocationCode
    var lagId: js.UndefOr[LagId]
    var tags: js.UndefOr[TagList]
  }

  object CreateInterconnectRequest {
    @inline
    def apply(
        bandwidth: Bandwidth,
        interconnectName: InterconnectName,
        location: LocationCode,
        lagId: js.UndefOr[LagId] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateInterconnectRequest = {
      val __obj = js.Dynamic.literal(
        "bandwidth"        -> bandwidth.asInstanceOf[js.Any],
        "interconnectName" -> interconnectName.asInstanceOf[js.Any],
        "location"         -> location.asInstanceOf[js.Any]
      )

      lagId.foreach(__v => __obj.updateDynamic("lagId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInterconnectRequest]
    }
  }

  @js.native
  trait CreateLagRequest extends js.Object {
    var connectionsBandwidth: Bandwidth
    var lagName: LagName
    var location: LocationCode
    var numberOfConnections: Count
    var childConnectionTags: js.UndefOr[TagList]
    var connectionId: js.UndefOr[ConnectionId]
    var tags: js.UndefOr[TagList]
  }

  object CreateLagRequest {
    @inline
    def apply(
        connectionsBandwidth: Bandwidth,
        lagName: LagName,
        location: LocationCode,
        numberOfConnections: Count,
        childConnectionTags: js.UndefOr[TagList] = js.undefined,
        connectionId: js.UndefOr[ConnectionId] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateLagRequest = {
      val __obj = js.Dynamic.literal(
        "connectionsBandwidth" -> connectionsBandwidth.asInstanceOf[js.Any],
        "lagName"              -> lagName.asInstanceOf[js.Any],
        "location"             -> location.asInstanceOf[js.Any],
        "numberOfConnections"  -> numberOfConnections.asInstanceOf[js.Any]
      )

      childConnectionTags.foreach(__v => __obj.updateDynamic("childConnectionTags")(__v.asInstanceOf[js.Any]))
      connectionId.foreach(__v => __obj.updateDynamic("connectionId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLagRequest]
    }
  }

  @js.native
  trait CreatePrivateVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var newPrivateVirtualInterface: NewPrivateVirtualInterface
  }

  object CreatePrivateVirtualInterfaceRequest {
    @inline
    def apply(
        connectionId: ConnectionId,
        newPrivateVirtualInterface: NewPrivateVirtualInterface
    ): CreatePrivateVirtualInterfaceRequest = {
      val __obj = js.Dynamic.literal(
        "connectionId"               -> connectionId.asInstanceOf[js.Any],
        "newPrivateVirtualInterface" -> newPrivateVirtualInterface.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreatePrivateVirtualInterfaceRequest]
    }
  }

  @js.native
  trait CreatePublicVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var newPublicVirtualInterface: NewPublicVirtualInterface
  }

  object CreatePublicVirtualInterfaceRequest {
    @inline
    def apply(
        connectionId: ConnectionId,
        newPublicVirtualInterface: NewPublicVirtualInterface
    ): CreatePublicVirtualInterfaceRequest = {
      val __obj = js.Dynamic.literal(
        "connectionId"              -> connectionId.asInstanceOf[js.Any],
        "newPublicVirtualInterface" -> newPublicVirtualInterface.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreatePublicVirtualInterfaceRequest]
    }
  }

  @js.native
  trait CreateTransitVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var newTransitVirtualInterface: NewTransitVirtualInterface
  }

  object CreateTransitVirtualInterfaceRequest {
    @inline
    def apply(
        connectionId: ConnectionId,
        newTransitVirtualInterface: NewTransitVirtualInterface
    ): CreateTransitVirtualInterfaceRequest = {
      val __obj = js.Dynamic.literal(
        "connectionId"               -> connectionId.asInstanceOf[js.Any],
        "newTransitVirtualInterface" -> newTransitVirtualInterface.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateTransitVirtualInterfaceRequest]
    }
  }

  @js.native
  trait CreateTransitVirtualInterfaceResult extends js.Object {
    var virtualInterface: js.UndefOr[VirtualInterface]
  }

  object CreateTransitVirtualInterfaceResult {
    @inline
    def apply(
        virtualInterface: js.UndefOr[VirtualInterface] = js.undefined
    ): CreateTransitVirtualInterfaceResult = {
      val __obj = js.Dynamic.literal()
      virtualInterface.foreach(__v => __obj.updateDynamic("virtualInterface")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTransitVirtualInterfaceResult]
    }
  }

  @js.native
  trait DeleteBGPPeerRequest extends js.Object {
    var asn: js.UndefOr[ASN]
    var bgpPeerId: js.UndefOr[BGPPeerId]
    var customerAddress: js.UndefOr[CustomerAddress]
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
  }

  object DeleteBGPPeerRequest {
    @inline
    def apply(
        asn: js.UndefOr[ASN] = js.undefined,
        bgpPeerId: js.UndefOr[BGPPeerId] = js.undefined,
        customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
        virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
    ): DeleteBGPPeerRequest = {
      val __obj = js.Dynamic.literal()
      asn.foreach(__v => __obj.updateDynamic("asn")(__v.asInstanceOf[js.Any]))
      bgpPeerId.foreach(__v => __obj.updateDynamic("bgpPeerId")(__v.asInstanceOf[js.Any]))
      customerAddress.foreach(__v => __obj.updateDynamic("customerAddress")(__v.asInstanceOf[js.Any]))
      virtualInterfaceId.foreach(__v => __obj.updateDynamic("virtualInterfaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBGPPeerRequest]
    }
  }

  @js.native
  trait DeleteBGPPeerResponse extends js.Object {
    var virtualInterface: js.UndefOr[VirtualInterface]
  }

  object DeleteBGPPeerResponse {
    @inline
    def apply(
        virtualInterface: js.UndefOr[VirtualInterface] = js.undefined
    ): DeleteBGPPeerResponse = {
      val __obj = js.Dynamic.literal()
      virtualInterface.foreach(__v => __obj.updateDynamic("virtualInterface")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBGPPeerResponse]
    }
  }

  @js.native
  trait DeleteConnectionRequest extends js.Object {
    var connectionId: ConnectionId
  }

  object DeleteConnectionRequest {
    @inline
    def apply(
        connectionId: ConnectionId
    ): DeleteConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "connectionId" -> connectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteConnectionRequest]
    }
  }

  @js.native
  trait DeleteDirectConnectGatewayAssociationProposalRequest extends js.Object {
    var proposalId: DirectConnectGatewayAssociationProposalId
  }

  object DeleteDirectConnectGatewayAssociationProposalRequest {
    @inline
    def apply(
        proposalId: DirectConnectGatewayAssociationProposalId
    ): DeleteDirectConnectGatewayAssociationProposalRequest = {
      val __obj = js.Dynamic.literal(
        "proposalId" -> proposalId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationProposalRequest]
    }
  }

  @js.native
  trait DeleteDirectConnectGatewayAssociationProposalResult extends js.Object {
    var directConnectGatewayAssociationProposal: js.UndefOr[DirectConnectGatewayAssociationProposal]
  }

  object DeleteDirectConnectGatewayAssociationProposalResult {
    @inline
    def apply(
        directConnectGatewayAssociationProposal: js.UndefOr[DirectConnectGatewayAssociationProposal] = js.undefined
    ): DeleteDirectConnectGatewayAssociationProposalResult = {
      val __obj = js.Dynamic.literal()
      directConnectGatewayAssociationProposal.foreach(
        __v => __obj.updateDynamic("directConnectGatewayAssociationProposal")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationProposalResult]
    }
  }

  @js.native
  trait DeleteDirectConnectGatewayAssociationRequest extends js.Object {
    var associationId: js.UndefOr[DirectConnectGatewayAssociationId]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
  }

  object DeleteDirectConnectGatewayAssociationRequest {
    @inline
    def apply(
        associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.undefined,
        directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
        virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
    ): DeleteDirectConnectGatewayAssociationRequest = {
      val __obj = js.Dynamic.literal()
      associationId.foreach(__v => __obj.updateDynamic("associationId")(__v.asInstanceOf[js.Any]))
      directConnectGatewayId.foreach(__v => __obj.updateDynamic("directConnectGatewayId")(__v.asInstanceOf[js.Any]))
      virtualGatewayId.foreach(__v => __obj.updateDynamic("virtualGatewayId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationRequest]
    }
  }

  @js.native
  trait DeleteDirectConnectGatewayAssociationResult extends js.Object {
    var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation]
  }

  object DeleteDirectConnectGatewayAssociationResult {
    @inline
    def apply(
        directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.undefined
    ): DeleteDirectConnectGatewayAssociationResult = {
      val __obj = js.Dynamic.literal()
      directConnectGatewayAssociation.foreach(
        __v => __obj.updateDynamic("directConnectGatewayAssociation")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationResult]
    }
  }

  @js.native
  trait DeleteDirectConnectGatewayRequest extends js.Object {
    var directConnectGatewayId: DirectConnectGatewayId
  }

  object DeleteDirectConnectGatewayRequest {
    @inline
    def apply(
        directConnectGatewayId: DirectConnectGatewayId
    ): DeleteDirectConnectGatewayRequest = {
      val __obj = js.Dynamic.literal(
        "directConnectGatewayId" -> directConnectGatewayId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDirectConnectGatewayRequest]
    }
  }

  @js.native
  trait DeleteDirectConnectGatewayResult extends js.Object {
    var directConnectGateway: js.UndefOr[DirectConnectGateway]
  }

  object DeleteDirectConnectGatewayResult {
    @inline
    def apply(
        directConnectGateway: js.UndefOr[DirectConnectGateway] = js.undefined
    ): DeleteDirectConnectGatewayResult = {
      val __obj = js.Dynamic.literal()
      directConnectGateway.foreach(__v => __obj.updateDynamic("directConnectGateway")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDirectConnectGatewayResult]
    }
  }

  @js.native
  trait DeleteInterconnectRequest extends js.Object {
    var interconnectId: InterconnectId
  }

  object DeleteInterconnectRequest {
    @inline
    def apply(
        interconnectId: InterconnectId
    ): DeleteInterconnectRequest = {
      val __obj = js.Dynamic.literal(
        "interconnectId" -> interconnectId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteInterconnectRequest]
    }
  }

  @js.native
  trait DeleteInterconnectResponse extends js.Object {
    var interconnectState: js.UndefOr[InterconnectState]
  }

  object DeleteInterconnectResponse {
    @inline
    def apply(
        interconnectState: js.UndefOr[InterconnectState] = js.undefined
    ): DeleteInterconnectResponse = {
      val __obj = js.Dynamic.literal()
      interconnectState.foreach(__v => __obj.updateDynamic("interconnectState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteInterconnectResponse]
    }
  }

  @js.native
  trait DeleteLagRequest extends js.Object {
    var lagId: LagId
  }

  object DeleteLagRequest {
    @inline
    def apply(
        lagId: LagId
    ): DeleteLagRequest = {
      val __obj = js.Dynamic.literal(
        "lagId" -> lagId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteLagRequest]
    }
  }

  @js.native
  trait DeleteVirtualInterfaceRequest extends js.Object {
    var virtualInterfaceId: VirtualInterfaceId
  }

  object DeleteVirtualInterfaceRequest {
    @inline
    def apply(
        virtualInterfaceId: VirtualInterfaceId
    ): DeleteVirtualInterfaceRequest = {
      val __obj = js.Dynamic.literal(
        "virtualInterfaceId" -> virtualInterfaceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVirtualInterfaceRequest]
    }
  }

  @js.native
  trait DeleteVirtualInterfaceResponse extends js.Object {
    var virtualInterfaceState: js.UndefOr[VirtualInterfaceState]
  }

  object DeleteVirtualInterfaceResponse {
    @inline
    def apply(
        virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.undefined
    ): DeleteVirtualInterfaceResponse = {
      val __obj = js.Dynamic.literal()
      virtualInterfaceState.foreach(__v => __obj.updateDynamic("virtualInterfaceState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVirtualInterfaceResponse]
    }
  }

  @js.native
  trait DescribeConnectionLoaRequest extends js.Object {
    var connectionId: ConnectionId
    var loaContentType: js.UndefOr[LoaContentType]
    var providerName: js.UndefOr[ProviderName]
  }

  object DescribeConnectionLoaRequest {
    @inline
    def apply(
        connectionId: ConnectionId,
        loaContentType: js.UndefOr[LoaContentType] = js.undefined,
        providerName: js.UndefOr[ProviderName] = js.undefined
    ): DescribeConnectionLoaRequest = {
      val __obj = js.Dynamic.literal(
        "connectionId" -> connectionId.asInstanceOf[js.Any]
      )

      loaContentType.foreach(__v => __obj.updateDynamic("loaContentType")(__v.asInstanceOf[js.Any]))
      providerName.foreach(__v => __obj.updateDynamic("providerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConnectionLoaRequest]
    }
  }

  @js.native
  trait DescribeConnectionLoaResponse extends js.Object {
    var loa: js.UndefOr[Loa]
  }

  object DescribeConnectionLoaResponse {
    @inline
    def apply(
        loa: js.UndefOr[Loa] = js.undefined
    ): DescribeConnectionLoaResponse = {
      val __obj = js.Dynamic.literal()
      loa.foreach(__v => __obj.updateDynamic("loa")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConnectionLoaResponse]
    }
  }

  @js.native
  trait DescribeConnectionsOnInterconnectRequest extends js.Object {
    var interconnectId: InterconnectId
  }

  object DescribeConnectionsOnInterconnectRequest {
    @inline
    def apply(
        interconnectId: InterconnectId
    ): DescribeConnectionsOnInterconnectRequest = {
      val __obj = js.Dynamic.literal(
        "interconnectId" -> interconnectId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeConnectionsOnInterconnectRequest]
    }
  }

  @js.native
  trait DescribeConnectionsRequest extends js.Object {
    var connectionId: js.UndefOr[ConnectionId]
  }

  object DescribeConnectionsRequest {
    @inline
    def apply(
        connectionId: js.UndefOr[ConnectionId] = js.undefined
    ): DescribeConnectionsRequest = {
      val __obj = js.Dynamic.literal()
      connectionId.foreach(__v => __obj.updateDynamic("connectionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConnectionsRequest]
    }
  }

  @js.native
  trait DescribeDirectConnectGatewayAssociationProposalsRequest extends js.Object {
    var associatedGatewayId: js.UndefOr[AssociatedGatewayId]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var maxResults: js.UndefOr[MaxResultSetSize]
    var nextToken: js.UndefOr[PaginationToken]
    var proposalId: js.UndefOr[DirectConnectGatewayAssociationProposalId]
  }

  object DescribeDirectConnectGatewayAssociationProposalsRequest {
    @inline
    def apply(
        associatedGatewayId: js.UndefOr[AssociatedGatewayId] = js.undefined,
        directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
        maxResults: js.UndefOr[MaxResultSetSize] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        proposalId: js.UndefOr[DirectConnectGatewayAssociationProposalId] = js.undefined
    ): DescribeDirectConnectGatewayAssociationProposalsRequest = {
      val __obj = js.Dynamic.literal()
      associatedGatewayId.foreach(__v => __obj.updateDynamic("associatedGatewayId")(__v.asInstanceOf[js.Any]))
      directConnectGatewayId.foreach(__v => __obj.updateDynamic("directConnectGatewayId")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      proposalId.foreach(__v => __obj.updateDynamic("proposalId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDirectConnectGatewayAssociationProposalsRequest]
    }
  }

  @js.native
  trait DescribeDirectConnectGatewayAssociationProposalsResult extends js.Object {
    var directConnectGatewayAssociationProposals: js.UndefOr[DirectConnectGatewayAssociationProposalList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeDirectConnectGatewayAssociationProposalsResult {
    @inline
    def apply(
        directConnectGatewayAssociationProposals: js.UndefOr[DirectConnectGatewayAssociationProposalList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeDirectConnectGatewayAssociationProposalsResult = {
      val __obj = js.Dynamic.literal()
      directConnectGatewayAssociationProposals.foreach(
        __v => __obj.updateDynamic("directConnectGatewayAssociationProposals")(__v.asInstanceOf[js.Any])
      )
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDirectConnectGatewayAssociationProposalsResult]
    }
  }

  @js.native
  trait DescribeDirectConnectGatewayAssociationsRequest extends js.Object {
    var associatedGatewayId: js.UndefOr[AssociatedGatewayId]
    var associationId: js.UndefOr[DirectConnectGatewayAssociationId]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var maxResults: js.UndefOr[MaxResultSetSize]
    var nextToken: js.UndefOr[PaginationToken]
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
  }

  object DescribeDirectConnectGatewayAssociationsRequest {
    @inline
    def apply(
        associatedGatewayId: js.UndefOr[AssociatedGatewayId] = js.undefined,
        associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.undefined,
        directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
        maxResults: js.UndefOr[MaxResultSetSize] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
    ): DescribeDirectConnectGatewayAssociationsRequest = {
      val __obj = js.Dynamic.literal()
      associatedGatewayId.foreach(__v => __obj.updateDynamic("associatedGatewayId")(__v.asInstanceOf[js.Any]))
      associationId.foreach(__v => __obj.updateDynamic("associationId")(__v.asInstanceOf[js.Any]))
      directConnectGatewayId.foreach(__v => __obj.updateDynamic("directConnectGatewayId")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      virtualGatewayId.foreach(__v => __obj.updateDynamic("virtualGatewayId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDirectConnectGatewayAssociationsRequest]
    }
  }

  @js.native
  trait DescribeDirectConnectGatewayAssociationsResult extends js.Object {
    var directConnectGatewayAssociations: js.UndefOr[DirectConnectGatewayAssociationList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeDirectConnectGatewayAssociationsResult {
    @inline
    def apply(
        directConnectGatewayAssociations: js.UndefOr[DirectConnectGatewayAssociationList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeDirectConnectGatewayAssociationsResult = {
      val __obj = js.Dynamic.literal()
      directConnectGatewayAssociations.foreach(
        __v => __obj.updateDynamic("directConnectGatewayAssociations")(__v.asInstanceOf[js.Any])
      )
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDirectConnectGatewayAssociationsResult]
    }
  }

  @js.native
  trait DescribeDirectConnectGatewayAttachmentsRequest extends js.Object {
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var maxResults: js.UndefOr[MaxResultSetSize]
    var nextToken: js.UndefOr[PaginationToken]
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
  }

  object DescribeDirectConnectGatewayAttachmentsRequest {
    @inline
    def apply(
        directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
        maxResults: js.UndefOr[MaxResultSetSize] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
    ): DescribeDirectConnectGatewayAttachmentsRequest = {
      val __obj = js.Dynamic.literal()
      directConnectGatewayId.foreach(__v => __obj.updateDynamic("directConnectGatewayId")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      virtualInterfaceId.foreach(__v => __obj.updateDynamic("virtualInterfaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDirectConnectGatewayAttachmentsRequest]
    }
  }

  @js.native
  trait DescribeDirectConnectGatewayAttachmentsResult extends js.Object {
    var directConnectGatewayAttachments: js.UndefOr[DirectConnectGatewayAttachmentList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeDirectConnectGatewayAttachmentsResult {
    @inline
    def apply(
        directConnectGatewayAttachments: js.UndefOr[DirectConnectGatewayAttachmentList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeDirectConnectGatewayAttachmentsResult = {
      val __obj = js.Dynamic.literal()
      directConnectGatewayAttachments.foreach(
        __v => __obj.updateDynamic("directConnectGatewayAttachments")(__v.asInstanceOf[js.Any])
      )
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDirectConnectGatewayAttachmentsResult]
    }
  }

  @js.native
  trait DescribeDirectConnectGatewaysRequest extends js.Object {
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var maxResults: js.UndefOr[MaxResultSetSize]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeDirectConnectGatewaysRequest {
    @inline
    def apply(
        directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
        maxResults: js.UndefOr[MaxResultSetSize] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeDirectConnectGatewaysRequest = {
      val __obj = js.Dynamic.literal()
      directConnectGatewayId.foreach(__v => __obj.updateDynamic("directConnectGatewayId")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDirectConnectGatewaysRequest]
    }
  }

  @js.native
  trait DescribeDirectConnectGatewaysResult extends js.Object {
    var directConnectGateways: js.UndefOr[DirectConnectGatewayList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeDirectConnectGatewaysResult {
    @inline
    def apply(
        directConnectGateways: js.UndefOr[DirectConnectGatewayList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeDirectConnectGatewaysResult = {
      val __obj = js.Dynamic.literal()
      directConnectGateways.foreach(__v => __obj.updateDynamic("directConnectGateways")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDirectConnectGatewaysResult]
    }
  }

  @js.native
  trait DescribeHostedConnectionsRequest extends js.Object {
    var connectionId: ConnectionId
  }

  object DescribeHostedConnectionsRequest {
    @inline
    def apply(
        connectionId: ConnectionId
    ): DescribeHostedConnectionsRequest = {
      val __obj = js.Dynamic.literal(
        "connectionId" -> connectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeHostedConnectionsRequest]
    }
  }

  @js.native
  trait DescribeInterconnectLoaRequest extends js.Object {
    var interconnectId: InterconnectId
    var loaContentType: js.UndefOr[LoaContentType]
    var providerName: js.UndefOr[ProviderName]
  }

  object DescribeInterconnectLoaRequest {
    @inline
    def apply(
        interconnectId: InterconnectId,
        loaContentType: js.UndefOr[LoaContentType] = js.undefined,
        providerName: js.UndefOr[ProviderName] = js.undefined
    ): DescribeInterconnectLoaRequest = {
      val __obj = js.Dynamic.literal(
        "interconnectId" -> interconnectId.asInstanceOf[js.Any]
      )

      loaContentType.foreach(__v => __obj.updateDynamic("loaContentType")(__v.asInstanceOf[js.Any]))
      providerName.foreach(__v => __obj.updateDynamic("providerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInterconnectLoaRequest]
    }
  }

  @js.native
  trait DescribeInterconnectLoaResponse extends js.Object {
    var loa: js.UndefOr[Loa]
  }

  object DescribeInterconnectLoaResponse {
    @inline
    def apply(
        loa: js.UndefOr[Loa] = js.undefined
    ): DescribeInterconnectLoaResponse = {
      val __obj = js.Dynamic.literal()
      loa.foreach(__v => __obj.updateDynamic("loa")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInterconnectLoaResponse]
    }
  }

  @js.native
  trait DescribeInterconnectsRequest extends js.Object {
    var interconnectId: js.UndefOr[InterconnectId]
  }

  object DescribeInterconnectsRequest {
    @inline
    def apply(
        interconnectId: js.UndefOr[InterconnectId] = js.undefined
    ): DescribeInterconnectsRequest = {
      val __obj = js.Dynamic.literal()
      interconnectId.foreach(__v => __obj.updateDynamic("interconnectId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInterconnectsRequest]
    }
  }

  @js.native
  trait DescribeLagsRequest extends js.Object {
    var lagId: js.UndefOr[LagId]
  }

  object DescribeLagsRequest {
    @inline
    def apply(
        lagId: js.UndefOr[LagId] = js.undefined
    ): DescribeLagsRequest = {
      val __obj = js.Dynamic.literal()
      lagId.foreach(__v => __obj.updateDynamic("lagId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLagsRequest]
    }
  }

  @js.native
  trait DescribeLoaRequest extends js.Object {
    var connectionId: ConnectionId
    var loaContentType: js.UndefOr[LoaContentType]
    var providerName: js.UndefOr[ProviderName]
  }

  object DescribeLoaRequest {
    @inline
    def apply(
        connectionId: ConnectionId,
        loaContentType: js.UndefOr[LoaContentType] = js.undefined,
        providerName: js.UndefOr[ProviderName] = js.undefined
    ): DescribeLoaRequest = {
      val __obj = js.Dynamic.literal(
        "connectionId" -> connectionId.asInstanceOf[js.Any]
      )

      loaContentType.foreach(__v => __obj.updateDynamic("loaContentType")(__v.asInstanceOf[js.Any]))
      providerName.foreach(__v => __obj.updateDynamic("providerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoaRequest]
    }
  }

  @js.native
  trait DescribeTagsRequest extends js.Object {
    var resourceArns: ResourceArnList
  }

  object DescribeTagsRequest {
    @inline
    def apply(
        resourceArns: ResourceArnList
    ): DescribeTagsRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArns" -> resourceArns.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeTagsRequest]
    }
  }

  @js.native
  trait DescribeTagsResponse extends js.Object {
    var resourceTags: js.UndefOr[ResourceTagList]
  }

  object DescribeTagsResponse {
    @inline
    def apply(
        resourceTags: js.UndefOr[ResourceTagList] = js.undefined
    ): DescribeTagsResponse = {
      val __obj = js.Dynamic.literal()
      resourceTags.foreach(__v => __obj.updateDynamic("resourceTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTagsResponse]
    }
  }

  @js.native
  trait DescribeVirtualInterfacesRequest extends js.Object {
    var connectionId: js.UndefOr[ConnectionId]
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
  }

  object DescribeVirtualInterfacesRequest {
    @inline
    def apply(
        connectionId: js.UndefOr[ConnectionId] = js.undefined,
        virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
    ): DescribeVirtualInterfacesRequest = {
      val __obj = js.Dynamic.literal()
      connectionId.foreach(__v => __obj.updateDynamic("connectionId")(__v.asInstanceOf[js.Any]))
      virtualInterfaceId.foreach(__v => __obj.updateDynamic("virtualInterfaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVirtualInterfacesRequest]
    }
  }

  /**
    * Information about a Direct Connect gateway, which enables you to connect virtual interfaces and virtual private gateway or transit gateways.
    */
  @js.native
  trait DirectConnectGateway extends js.Object {
    var amazonSideAsn: js.UndefOr[LongAsn]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var directConnectGatewayName: js.UndefOr[DirectConnectGatewayName]
    var directConnectGatewayState: js.UndefOr[DirectConnectGatewayState]
    var ownerAccount: js.UndefOr[OwnerAccount]
    var stateChangeError: js.UndefOr[StateChangeError]
  }

  object DirectConnectGateway {
    @inline
    def apply(
        amazonSideAsn: js.UndefOr[LongAsn] = js.undefined,
        directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
        directConnectGatewayName: js.UndefOr[DirectConnectGatewayName] = js.undefined,
        directConnectGatewayState: js.UndefOr[DirectConnectGatewayState] = js.undefined,
        ownerAccount: js.UndefOr[OwnerAccount] = js.undefined,
        stateChangeError: js.UndefOr[StateChangeError] = js.undefined
    ): DirectConnectGateway = {
      val __obj = js.Dynamic.literal()
      amazonSideAsn.foreach(__v => __obj.updateDynamic("amazonSideAsn")(__v.asInstanceOf[js.Any]))
      directConnectGatewayId.foreach(__v => __obj.updateDynamic("directConnectGatewayId")(__v.asInstanceOf[js.Any]))
      directConnectGatewayName.foreach(__v => __obj.updateDynamic("directConnectGatewayName")(__v.asInstanceOf[js.Any]))
      directConnectGatewayState.foreach(
        __v => __obj.updateDynamic("directConnectGatewayState")(__v.asInstanceOf[js.Any])
      )
      ownerAccount.foreach(__v => __obj.updateDynamic("ownerAccount")(__v.asInstanceOf[js.Any]))
      stateChangeError.foreach(__v => __obj.updateDynamic("stateChangeError")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DirectConnectGateway]
    }
  }

  /**
    * Information about an association between a Direct Connect gateway and a virtual private gateway or transit gateway.
    */
  @js.native
  trait DirectConnectGatewayAssociation extends js.Object {
    var allowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList]
    var associatedGateway: js.UndefOr[AssociatedGateway]
    var associationId: js.UndefOr[DirectConnectGatewayAssociationId]
    var associationState: js.UndefOr[DirectConnectGatewayAssociationState]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var directConnectGatewayOwnerAccount: js.UndefOr[OwnerAccount]
    var stateChangeError: js.UndefOr[StateChangeError]
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
    var virtualGatewayOwnerAccount: js.UndefOr[OwnerAccount]
    var virtualGatewayRegion: js.UndefOr[VirtualGatewayRegion]
  }

  object DirectConnectGatewayAssociation {
    @inline
    def apply(
        allowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined,
        associatedGateway: js.UndefOr[AssociatedGateway] = js.undefined,
        associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.undefined,
        associationState: js.UndefOr[DirectConnectGatewayAssociationState] = js.undefined,
        directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
        directConnectGatewayOwnerAccount: js.UndefOr[OwnerAccount] = js.undefined,
        stateChangeError: js.UndefOr[StateChangeError] = js.undefined,
        virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined,
        virtualGatewayOwnerAccount: js.UndefOr[OwnerAccount] = js.undefined,
        virtualGatewayRegion: js.UndefOr[VirtualGatewayRegion] = js.undefined
    ): DirectConnectGatewayAssociation = {
      val __obj = js.Dynamic.literal()
      allowedPrefixesToDirectConnectGateway.foreach(
        __v => __obj.updateDynamic("allowedPrefixesToDirectConnectGateway")(__v.asInstanceOf[js.Any])
      )
      associatedGateway.foreach(__v => __obj.updateDynamic("associatedGateway")(__v.asInstanceOf[js.Any]))
      associationId.foreach(__v => __obj.updateDynamic("associationId")(__v.asInstanceOf[js.Any]))
      associationState.foreach(__v => __obj.updateDynamic("associationState")(__v.asInstanceOf[js.Any]))
      directConnectGatewayId.foreach(__v => __obj.updateDynamic("directConnectGatewayId")(__v.asInstanceOf[js.Any]))
      directConnectGatewayOwnerAccount.foreach(
        __v => __obj.updateDynamic("directConnectGatewayOwnerAccount")(__v.asInstanceOf[js.Any])
      )
      stateChangeError.foreach(__v => __obj.updateDynamic("stateChangeError")(__v.asInstanceOf[js.Any]))
      virtualGatewayId.foreach(__v => __obj.updateDynamic("virtualGatewayId")(__v.asInstanceOf[js.Any]))
      virtualGatewayOwnerAccount.foreach(
        __v => __obj.updateDynamic("virtualGatewayOwnerAccount")(__v.asInstanceOf[js.Any])
      )
      virtualGatewayRegion.foreach(__v => __obj.updateDynamic("virtualGatewayRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DirectConnectGatewayAssociation]
    }
  }

  /**
    * Information about the proposal request to attach a virtual private gateway to a Direct Connect gateway.
    */
  @js.native
  trait DirectConnectGatewayAssociationProposal extends js.Object {
    var associatedGateway: js.UndefOr[AssociatedGateway]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var directConnectGatewayOwnerAccount: js.UndefOr[OwnerAccount]
    var existingAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList]
    var proposalId: js.UndefOr[DirectConnectGatewayAssociationProposalId]
    var proposalState: js.UndefOr[DirectConnectGatewayAssociationProposalState]
    var requestedAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList]
  }

  object DirectConnectGatewayAssociationProposal {
    @inline
    def apply(
        associatedGateway: js.UndefOr[AssociatedGateway] = js.undefined,
        directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
        directConnectGatewayOwnerAccount: js.UndefOr[OwnerAccount] = js.undefined,
        existingAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined,
        proposalId: js.UndefOr[DirectConnectGatewayAssociationProposalId] = js.undefined,
        proposalState: js.UndefOr[DirectConnectGatewayAssociationProposalState] = js.undefined,
        requestedAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
    ): DirectConnectGatewayAssociationProposal = {
      val __obj = js.Dynamic.literal()
      associatedGateway.foreach(__v => __obj.updateDynamic("associatedGateway")(__v.asInstanceOf[js.Any]))
      directConnectGatewayId.foreach(__v => __obj.updateDynamic("directConnectGatewayId")(__v.asInstanceOf[js.Any]))
      directConnectGatewayOwnerAccount.foreach(
        __v => __obj.updateDynamic("directConnectGatewayOwnerAccount")(__v.asInstanceOf[js.Any])
      )
      existingAllowedPrefixesToDirectConnectGateway.foreach(
        __v => __obj.updateDynamic("existingAllowedPrefixesToDirectConnectGateway")(__v.asInstanceOf[js.Any])
      )
      proposalId.foreach(__v => __obj.updateDynamic("proposalId")(__v.asInstanceOf[js.Any]))
      proposalState.foreach(__v => __obj.updateDynamic("proposalState")(__v.asInstanceOf[js.Any]))
      requestedAllowedPrefixesToDirectConnectGateway.foreach(
        __v => __obj.updateDynamic("requestedAllowedPrefixesToDirectConnectGateway")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DirectConnectGatewayAssociationProposal]
    }
  }

  object DirectConnectGatewayAssociationProposalStateEnum {
    val requested = "requested"
    val accepted  = "accepted"
    val deleted   = "deleted"

    val values = js.Object.freeze(js.Array(requested, accepted, deleted))
  }

  object DirectConnectGatewayAssociationStateEnum {
    val associating    = "associating"
    val associated     = "associated"
    val disassociating = "disassociating"
    val disassociated  = "disassociated"
    val updating       = "updating"

    val values = js.Object.freeze(js.Array(associating, associated, disassociating, disassociated, updating))
  }

  /**
    * Information about an attachment between a Direct Connect gateway and a virtual interface.
    */
  @js.native
  trait DirectConnectGatewayAttachment extends js.Object {
    var attachmentState: js.UndefOr[DirectConnectGatewayAttachmentState]
    var attachmentType: js.UndefOr[DirectConnectGatewayAttachmentType]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var stateChangeError: js.UndefOr[StateChangeError]
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
    var virtualInterfaceOwnerAccount: js.UndefOr[OwnerAccount]
    var virtualInterfaceRegion: js.UndefOr[VirtualInterfaceRegion]
  }

  object DirectConnectGatewayAttachment {
    @inline
    def apply(
        attachmentState: js.UndefOr[DirectConnectGatewayAttachmentState] = js.undefined,
        attachmentType: js.UndefOr[DirectConnectGatewayAttachmentType] = js.undefined,
        directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
        stateChangeError: js.UndefOr[StateChangeError] = js.undefined,
        virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined,
        virtualInterfaceOwnerAccount: js.UndefOr[OwnerAccount] = js.undefined,
        virtualInterfaceRegion: js.UndefOr[VirtualInterfaceRegion] = js.undefined
    ): DirectConnectGatewayAttachment = {
      val __obj = js.Dynamic.literal()
      attachmentState.foreach(__v => __obj.updateDynamic("attachmentState")(__v.asInstanceOf[js.Any]))
      attachmentType.foreach(__v => __obj.updateDynamic("attachmentType")(__v.asInstanceOf[js.Any]))
      directConnectGatewayId.foreach(__v => __obj.updateDynamic("directConnectGatewayId")(__v.asInstanceOf[js.Any]))
      stateChangeError.foreach(__v => __obj.updateDynamic("stateChangeError")(__v.asInstanceOf[js.Any]))
      virtualInterfaceId.foreach(__v => __obj.updateDynamic("virtualInterfaceId")(__v.asInstanceOf[js.Any]))
      virtualInterfaceOwnerAccount.foreach(
        __v => __obj.updateDynamic("virtualInterfaceOwnerAccount")(__v.asInstanceOf[js.Any])
      )
      virtualInterfaceRegion.foreach(__v => __obj.updateDynamic("virtualInterfaceRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DirectConnectGatewayAttachment]
    }
  }

  object DirectConnectGatewayAttachmentStateEnum {
    val attaching = "attaching"
    val attached  = "attached"
    val detaching = "detaching"
    val detached  = "detached"

    val values = js.Object.freeze(js.Array(attaching, attached, detaching, detached))
  }

  object DirectConnectGatewayAttachmentTypeEnum {
    val TransitVirtualInterface = "TransitVirtualInterface"
    val PrivateVirtualInterface = "PrivateVirtualInterface"

    val values = js.Object.freeze(js.Array(TransitVirtualInterface, PrivateVirtualInterface))
  }

  object DirectConnectGatewayStateEnum {
    val pending   = "pending"
    val available = "available"
    val deleting  = "deleting"
    val deleted   = "deleted"

    val values = js.Object.freeze(js.Array(pending, available, deleting, deleted))
  }

  @js.native
  trait DisassociateConnectionFromLagRequest extends js.Object {
    var connectionId: ConnectionId
    var lagId: LagId
  }

  object DisassociateConnectionFromLagRequest {
    @inline
    def apply(
        connectionId: ConnectionId,
        lagId: LagId
    ): DisassociateConnectionFromLagRequest = {
      val __obj = js.Dynamic.literal(
        "connectionId" -> connectionId.asInstanceOf[js.Any],
        "lagId"        -> lagId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateConnectionFromLagRequest]
    }
  }

  object GatewayTypeEnum {
    val virtualPrivateGateway = "virtualPrivateGateway"
    val transitGateway        = "transitGateway"

    val values = js.Object.freeze(js.Array(virtualPrivateGateway, transitGateway))
  }

  object HasLogicalRedundancyEnum {
    val unknown = "unknown"
    val yes     = "yes"
    val no      = "no"

    val values = js.Object.freeze(js.Array(unknown, yes, no))
  }

  /**
    * Information about an interconnect.
    */
  @js.native
  trait Interconnect extends js.Object {
    var awsDevice: js.UndefOr[AwsDevice]
    var awsDeviceV2: js.UndefOr[AwsDeviceV2]
    var bandwidth: js.UndefOr[Bandwidth]
    var hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy]
    var interconnectId: js.UndefOr[InterconnectId]
    var interconnectName: js.UndefOr[InterconnectName]
    var interconnectState: js.UndefOr[InterconnectState]
    var jumboFrameCapable: js.UndefOr[JumboFrameCapable]
    var lagId: js.UndefOr[LagId]
    var loaIssueTime: js.UndefOr[LoaIssueTime]
    var location: js.UndefOr[LocationCode]
    var region: js.UndefOr[Region]
    var tags: js.UndefOr[TagList]
  }

  object Interconnect {
    @inline
    def apply(
        awsDevice: js.UndefOr[AwsDevice] = js.undefined,
        awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined,
        bandwidth: js.UndefOr[Bandwidth] = js.undefined,
        hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy] = js.undefined,
        interconnectId: js.UndefOr[InterconnectId] = js.undefined,
        interconnectName: js.UndefOr[InterconnectName] = js.undefined,
        interconnectState: js.UndefOr[InterconnectState] = js.undefined,
        jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined,
        lagId: js.UndefOr[LagId] = js.undefined,
        loaIssueTime: js.UndefOr[LoaIssueTime] = js.undefined,
        location: js.UndefOr[LocationCode] = js.undefined,
        region: js.UndefOr[Region] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): Interconnect = {
      val __obj = js.Dynamic.literal()
      awsDevice.foreach(__v => __obj.updateDynamic("awsDevice")(__v.asInstanceOf[js.Any]))
      awsDeviceV2.foreach(__v => __obj.updateDynamic("awsDeviceV2")(__v.asInstanceOf[js.Any]))
      bandwidth.foreach(__v => __obj.updateDynamic("bandwidth")(__v.asInstanceOf[js.Any]))
      hasLogicalRedundancy.foreach(__v => __obj.updateDynamic("hasLogicalRedundancy")(__v.asInstanceOf[js.Any]))
      interconnectId.foreach(__v => __obj.updateDynamic("interconnectId")(__v.asInstanceOf[js.Any]))
      interconnectName.foreach(__v => __obj.updateDynamic("interconnectName")(__v.asInstanceOf[js.Any]))
      interconnectState.foreach(__v => __obj.updateDynamic("interconnectState")(__v.asInstanceOf[js.Any]))
      jumboFrameCapable.foreach(__v => __obj.updateDynamic("jumboFrameCapable")(__v.asInstanceOf[js.Any]))
      lagId.foreach(__v => __obj.updateDynamic("lagId")(__v.asInstanceOf[js.Any]))
      loaIssueTime.foreach(__v => __obj.updateDynamic("loaIssueTime")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Interconnect]
    }
  }

  object InterconnectStateEnum {
    val requested = "requested"
    val pending   = "pending"
    val available = "available"
    val down      = "down"
    val deleting  = "deleting"
    val deleted   = "deleted"
    val unknown   = "unknown"

    val values = js.Object.freeze(js.Array(requested, pending, available, down, deleting, deleted, unknown))
  }

  @js.native
  trait Interconnects extends js.Object {
    var interconnects: js.UndefOr[InterconnectList]
  }

  object Interconnects {
    @inline
    def apply(
        interconnects: js.UndefOr[InterconnectList] = js.undefined
    ): Interconnects = {
      val __obj = js.Dynamic.literal()
      interconnects.foreach(__v => __obj.updateDynamic("interconnects")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Interconnects]
    }
  }

  /**
    * Information about a link aggregation group (LAG).
    */
  @js.native
  trait Lag extends js.Object {
    var allowsHostedConnections: js.UndefOr[BooleanFlag]
    var awsDevice: js.UndefOr[AwsDevice]
    var awsDeviceV2: js.UndefOr[AwsDeviceV2]
    var connections: js.UndefOr[ConnectionList]
    var connectionsBandwidth: js.UndefOr[Bandwidth]
    var hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy]
    var jumboFrameCapable: js.UndefOr[JumboFrameCapable]
    var lagId: js.UndefOr[LagId]
    var lagName: js.UndefOr[LagName]
    var lagState: js.UndefOr[LagState]
    var location: js.UndefOr[LocationCode]
    var minimumLinks: js.UndefOr[Count]
    var numberOfConnections: js.UndefOr[Count]
    var ownerAccount: js.UndefOr[OwnerAccount]
    var region: js.UndefOr[Region]
    var tags: js.UndefOr[TagList]
  }

  object Lag {
    @inline
    def apply(
        allowsHostedConnections: js.UndefOr[BooleanFlag] = js.undefined,
        awsDevice: js.UndefOr[AwsDevice] = js.undefined,
        awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined,
        connections: js.UndefOr[ConnectionList] = js.undefined,
        connectionsBandwidth: js.UndefOr[Bandwidth] = js.undefined,
        hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy] = js.undefined,
        jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined,
        lagId: js.UndefOr[LagId] = js.undefined,
        lagName: js.UndefOr[LagName] = js.undefined,
        lagState: js.UndefOr[LagState] = js.undefined,
        location: js.UndefOr[LocationCode] = js.undefined,
        minimumLinks: js.UndefOr[Count] = js.undefined,
        numberOfConnections: js.UndefOr[Count] = js.undefined,
        ownerAccount: js.UndefOr[OwnerAccount] = js.undefined,
        region: js.UndefOr[Region] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): Lag = {
      val __obj = js.Dynamic.literal()
      allowsHostedConnections.foreach(__v => __obj.updateDynamic("allowsHostedConnections")(__v.asInstanceOf[js.Any]))
      awsDevice.foreach(__v => __obj.updateDynamic("awsDevice")(__v.asInstanceOf[js.Any]))
      awsDeviceV2.foreach(__v => __obj.updateDynamic("awsDeviceV2")(__v.asInstanceOf[js.Any]))
      connections.foreach(__v => __obj.updateDynamic("connections")(__v.asInstanceOf[js.Any]))
      connectionsBandwidth.foreach(__v => __obj.updateDynamic("connectionsBandwidth")(__v.asInstanceOf[js.Any]))
      hasLogicalRedundancy.foreach(__v => __obj.updateDynamic("hasLogicalRedundancy")(__v.asInstanceOf[js.Any]))
      jumboFrameCapable.foreach(__v => __obj.updateDynamic("jumboFrameCapable")(__v.asInstanceOf[js.Any]))
      lagId.foreach(__v => __obj.updateDynamic("lagId")(__v.asInstanceOf[js.Any]))
      lagName.foreach(__v => __obj.updateDynamic("lagName")(__v.asInstanceOf[js.Any]))
      lagState.foreach(__v => __obj.updateDynamic("lagState")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      minimumLinks.foreach(__v => __obj.updateDynamic("minimumLinks")(__v.asInstanceOf[js.Any]))
      numberOfConnections.foreach(__v => __obj.updateDynamic("numberOfConnections")(__v.asInstanceOf[js.Any]))
      ownerAccount.foreach(__v => __obj.updateDynamic("ownerAccount")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Lag]
    }
  }

  object LagStateEnum {
    val requested = "requested"
    val pending   = "pending"
    val available = "available"
    val down      = "down"
    val deleting  = "deleting"
    val deleted   = "deleted"
    val unknown   = "unknown"

    val values = js.Object.freeze(js.Array(requested, pending, available, down, deleting, deleted, unknown))
  }

  @js.native
  trait Lags extends js.Object {
    var lags: js.UndefOr[LagList]
  }

  object Lags {
    @inline
    def apply(
        lags: js.UndefOr[LagList] = js.undefined
    ): Lags = {
      val __obj = js.Dynamic.literal()
      lags.foreach(__v => __obj.updateDynamic("lags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Lags]
    }
  }

  /**
    * Information about a Letter of Authorization - Connecting Facility Assignment (LOA-CFA) for a connection.
    */
  @js.native
  trait Loa extends js.Object {
    var loaContent: js.UndefOr[LoaContent]
    var loaContentType: js.UndefOr[LoaContentType]
  }

  object Loa {
    @inline
    def apply(
        loaContent: js.UndefOr[LoaContent] = js.undefined,
        loaContentType: js.UndefOr[LoaContentType] = js.undefined
    ): Loa = {
      val __obj = js.Dynamic.literal()
      loaContent.foreach(__v => __obj.updateDynamic("loaContent")(__v.asInstanceOf[js.Any]))
      loaContentType.foreach(__v => __obj.updateDynamic("loaContentType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Loa]
    }
  }

  object LoaContentTypeEnum {
    val `application/pdf` = "application/pdf"

    val values = js.Object.freeze(js.Array(`application/pdf`))
  }

  /**
    * Information about an AWS Direct Connect location.
    */
  @js.native
  trait Location extends js.Object {
    var availablePortSpeeds: js.UndefOr[AvailablePortSpeeds]
    var locationCode: js.UndefOr[LocationCode]
    var locationName: js.UndefOr[LocationName]
    var region: js.UndefOr[Region]
  }

  object Location {
    @inline
    def apply(
        availablePortSpeeds: js.UndefOr[AvailablePortSpeeds] = js.undefined,
        locationCode: js.UndefOr[LocationCode] = js.undefined,
        locationName: js.UndefOr[LocationName] = js.undefined,
        region: js.UndefOr[Region] = js.undefined
    ): Location = {
      val __obj = js.Dynamic.literal()
      availablePortSpeeds.foreach(__v => __obj.updateDynamic("availablePortSpeeds")(__v.asInstanceOf[js.Any]))
      locationCode.foreach(__v => __obj.updateDynamic("locationCode")(__v.asInstanceOf[js.Any]))
      locationName.foreach(__v => __obj.updateDynamic("locationName")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Location]
    }
  }

  @js.native
  trait Locations extends js.Object {
    var locations: js.UndefOr[LocationList]
  }

  object Locations {
    @inline
    def apply(
        locations: js.UndefOr[LocationList] = js.undefined
    ): Locations = {
      val __obj = js.Dynamic.literal()
      locations.foreach(__v => __obj.updateDynamic("locations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Locations]
    }
  }

  /**
    * Information about a new BGP peer.
    */
  @js.native
  trait NewBGPPeer extends js.Object {
    var addressFamily: js.UndefOr[AddressFamily]
    var amazonAddress: js.UndefOr[AmazonAddress]
    var asn: js.UndefOr[ASN]
    var authKey: js.UndefOr[BGPAuthKey]
    var customerAddress: js.UndefOr[CustomerAddress]
  }

  object NewBGPPeer {
    @inline
    def apply(
        addressFamily: js.UndefOr[AddressFamily] = js.undefined,
        amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
        asn: js.UndefOr[ASN] = js.undefined,
        authKey: js.UndefOr[BGPAuthKey] = js.undefined,
        customerAddress: js.UndefOr[CustomerAddress] = js.undefined
    ): NewBGPPeer = {
      val __obj = js.Dynamic.literal()
      addressFamily.foreach(__v => __obj.updateDynamic("addressFamily")(__v.asInstanceOf[js.Any]))
      amazonAddress.foreach(__v => __obj.updateDynamic("amazonAddress")(__v.asInstanceOf[js.Any]))
      asn.foreach(__v => __obj.updateDynamic("asn")(__v.asInstanceOf[js.Any]))
      authKey.foreach(__v => __obj.updateDynamic("authKey")(__v.asInstanceOf[js.Any]))
      customerAddress.foreach(__v => __obj.updateDynamic("customerAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NewBGPPeer]
    }
  }

  /**
    * Information about a private virtual interface.
    */
  @js.native
  trait NewPrivateVirtualInterface extends js.Object {
    var asn: ASN
    var virtualInterfaceName: VirtualInterfaceName
    var vlan: VLAN
    var addressFamily: js.UndefOr[AddressFamily]
    var amazonAddress: js.UndefOr[AmazonAddress]
    var authKey: js.UndefOr[BGPAuthKey]
    var customerAddress: js.UndefOr[CustomerAddress]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var mtu: js.UndefOr[MTU]
    var tags: js.UndefOr[TagList]
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
  }

  object NewPrivateVirtualInterface {
    @inline
    def apply(
        asn: ASN,
        virtualInterfaceName: VirtualInterfaceName,
        vlan: VLAN,
        addressFamily: js.UndefOr[AddressFamily] = js.undefined,
        amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
        authKey: js.UndefOr[BGPAuthKey] = js.undefined,
        customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
        directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
        mtu: js.UndefOr[MTU] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
    ): NewPrivateVirtualInterface = {
      val __obj = js.Dynamic.literal(
        "asn"                  -> asn.asInstanceOf[js.Any],
        "virtualInterfaceName" -> virtualInterfaceName.asInstanceOf[js.Any],
        "vlan"                 -> vlan.asInstanceOf[js.Any]
      )

      addressFamily.foreach(__v => __obj.updateDynamic("addressFamily")(__v.asInstanceOf[js.Any]))
      amazonAddress.foreach(__v => __obj.updateDynamic("amazonAddress")(__v.asInstanceOf[js.Any]))
      authKey.foreach(__v => __obj.updateDynamic("authKey")(__v.asInstanceOf[js.Any]))
      customerAddress.foreach(__v => __obj.updateDynamic("customerAddress")(__v.asInstanceOf[js.Any]))
      directConnectGatewayId.foreach(__v => __obj.updateDynamic("directConnectGatewayId")(__v.asInstanceOf[js.Any]))
      mtu.foreach(__v => __obj.updateDynamic("mtu")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      virtualGatewayId.foreach(__v => __obj.updateDynamic("virtualGatewayId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NewPrivateVirtualInterface]
    }
  }

  /**
    * Information about a private virtual interface to be provisioned on a connection.
    */
  @js.native
  trait NewPrivateVirtualInterfaceAllocation extends js.Object {
    var asn: ASN
    var virtualInterfaceName: VirtualInterfaceName
    var vlan: VLAN
    var addressFamily: js.UndefOr[AddressFamily]
    var amazonAddress: js.UndefOr[AmazonAddress]
    var authKey: js.UndefOr[BGPAuthKey]
    var customerAddress: js.UndefOr[CustomerAddress]
    var mtu: js.UndefOr[MTU]
    var tags: js.UndefOr[TagList]
  }

  object NewPrivateVirtualInterfaceAllocation {
    @inline
    def apply(
        asn: ASN,
        virtualInterfaceName: VirtualInterfaceName,
        vlan: VLAN,
        addressFamily: js.UndefOr[AddressFamily] = js.undefined,
        amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
        authKey: js.UndefOr[BGPAuthKey] = js.undefined,
        customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
        mtu: js.UndefOr[MTU] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): NewPrivateVirtualInterfaceAllocation = {
      val __obj = js.Dynamic.literal(
        "asn"                  -> asn.asInstanceOf[js.Any],
        "virtualInterfaceName" -> virtualInterfaceName.asInstanceOf[js.Any],
        "vlan"                 -> vlan.asInstanceOf[js.Any]
      )

      addressFamily.foreach(__v => __obj.updateDynamic("addressFamily")(__v.asInstanceOf[js.Any]))
      amazonAddress.foreach(__v => __obj.updateDynamic("amazonAddress")(__v.asInstanceOf[js.Any]))
      authKey.foreach(__v => __obj.updateDynamic("authKey")(__v.asInstanceOf[js.Any]))
      customerAddress.foreach(__v => __obj.updateDynamic("customerAddress")(__v.asInstanceOf[js.Any]))
      mtu.foreach(__v => __obj.updateDynamic("mtu")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NewPrivateVirtualInterfaceAllocation]
    }
  }

  /**
    * Information about a public virtual interface.
    */
  @js.native
  trait NewPublicVirtualInterface extends js.Object {
    var asn: ASN
    var virtualInterfaceName: VirtualInterfaceName
    var vlan: VLAN
    var addressFamily: js.UndefOr[AddressFamily]
    var amazonAddress: js.UndefOr[AmazonAddress]
    var authKey: js.UndefOr[BGPAuthKey]
    var customerAddress: js.UndefOr[CustomerAddress]
    var routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList]
    var tags: js.UndefOr[TagList]
  }

  object NewPublicVirtualInterface {
    @inline
    def apply(
        asn: ASN,
        virtualInterfaceName: VirtualInterfaceName,
        vlan: VLAN,
        addressFamily: js.UndefOr[AddressFamily] = js.undefined,
        amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
        authKey: js.UndefOr[BGPAuthKey] = js.undefined,
        customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
        routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): NewPublicVirtualInterface = {
      val __obj = js.Dynamic.literal(
        "asn"                  -> asn.asInstanceOf[js.Any],
        "virtualInterfaceName" -> virtualInterfaceName.asInstanceOf[js.Any],
        "vlan"                 -> vlan.asInstanceOf[js.Any]
      )

      addressFamily.foreach(__v => __obj.updateDynamic("addressFamily")(__v.asInstanceOf[js.Any]))
      amazonAddress.foreach(__v => __obj.updateDynamic("amazonAddress")(__v.asInstanceOf[js.Any]))
      authKey.foreach(__v => __obj.updateDynamic("authKey")(__v.asInstanceOf[js.Any]))
      customerAddress.foreach(__v => __obj.updateDynamic("customerAddress")(__v.asInstanceOf[js.Any]))
      routeFilterPrefixes.foreach(__v => __obj.updateDynamic("routeFilterPrefixes")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NewPublicVirtualInterface]
    }
  }

  /**
    * Information about a public virtual interface to be provisioned on a connection.
    */
  @js.native
  trait NewPublicVirtualInterfaceAllocation extends js.Object {
    var asn: ASN
    var virtualInterfaceName: VirtualInterfaceName
    var vlan: VLAN
    var addressFamily: js.UndefOr[AddressFamily]
    var amazonAddress: js.UndefOr[AmazonAddress]
    var authKey: js.UndefOr[BGPAuthKey]
    var customerAddress: js.UndefOr[CustomerAddress]
    var routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList]
    var tags: js.UndefOr[TagList]
  }

  object NewPublicVirtualInterfaceAllocation {
    @inline
    def apply(
        asn: ASN,
        virtualInterfaceName: VirtualInterfaceName,
        vlan: VLAN,
        addressFamily: js.UndefOr[AddressFamily] = js.undefined,
        amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
        authKey: js.UndefOr[BGPAuthKey] = js.undefined,
        customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
        routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): NewPublicVirtualInterfaceAllocation = {
      val __obj = js.Dynamic.literal(
        "asn"                  -> asn.asInstanceOf[js.Any],
        "virtualInterfaceName" -> virtualInterfaceName.asInstanceOf[js.Any],
        "vlan"                 -> vlan.asInstanceOf[js.Any]
      )

      addressFamily.foreach(__v => __obj.updateDynamic("addressFamily")(__v.asInstanceOf[js.Any]))
      amazonAddress.foreach(__v => __obj.updateDynamic("amazonAddress")(__v.asInstanceOf[js.Any]))
      authKey.foreach(__v => __obj.updateDynamic("authKey")(__v.asInstanceOf[js.Any]))
      customerAddress.foreach(__v => __obj.updateDynamic("customerAddress")(__v.asInstanceOf[js.Any]))
      routeFilterPrefixes.foreach(__v => __obj.updateDynamic("routeFilterPrefixes")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NewPublicVirtualInterfaceAllocation]
    }
  }

  /**
    * Information about the transit virtual interface.
    */
  @js.native
  trait NewTransitVirtualInterface extends js.Object {
    var addressFamily: js.UndefOr[AddressFamily]
    var amazonAddress: js.UndefOr[AmazonAddress]
    var asn: js.UndefOr[ASN]
    var authKey: js.UndefOr[BGPAuthKey]
    var customerAddress: js.UndefOr[CustomerAddress]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var mtu: js.UndefOr[MTU]
    var tags: js.UndefOr[TagList]
    var virtualInterfaceName: js.UndefOr[VirtualInterfaceName]
    var vlan: js.UndefOr[VLAN]
  }

  object NewTransitVirtualInterface {
    @inline
    def apply(
        addressFamily: js.UndefOr[AddressFamily] = js.undefined,
        amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
        asn: js.UndefOr[ASN] = js.undefined,
        authKey: js.UndefOr[BGPAuthKey] = js.undefined,
        customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
        directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
        mtu: js.UndefOr[MTU] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.undefined,
        vlan: js.UndefOr[VLAN] = js.undefined
    ): NewTransitVirtualInterface = {
      val __obj = js.Dynamic.literal()
      addressFamily.foreach(__v => __obj.updateDynamic("addressFamily")(__v.asInstanceOf[js.Any]))
      amazonAddress.foreach(__v => __obj.updateDynamic("amazonAddress")(__v.asInstanceOf[js.Any]))
      asn.foreach(__v => __obj.updateDynamic("asn")(__v.asInstanceOf[js.Any]))
      authKey.foreach(__v => __obj.updateDynamic("authKey")(__v.asInstanceOf[js.Any]))
      customerAddress.foreach(__v => __obj.updateDynamic("customerAddress")(__v.asInstanceOf[js.Any]))
      directConnectGatewayId.foreach(__v => __obj.updateDynamic("directConnectGatewayId")(__v.asInstanceOf[js.Any]))
      mtu.foreach(__v => __obj.updateDynamic("mtu")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      virtualInterfaceName.foreach(__v => __obj.updateDynamic("virtualInterfaceName")(__v.asInstanceOf[js.Any]))
      vlan.foreach(__v => __obj.updateDynamic("vlan")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NewTransitVirtualInterface]
    }
  }

  /**
    * Information about a transit virtual interface.
    */
  @js.native
  trait NewTransitVirtualInterfaceAllocation extends js.Object {
    var addressFamily: js.UndefOr[AddressFamily]
    var amazonAddress: js.UndefOr[AmazonAddress]
    var asn: js.UndefOr[ASN]
    var authKey: js.UndefOr[BGPAuthKey]
    var customerAddress: js.UndefOr[CustomerAddress]
    var mtu: js.UndefOr[MTU]
    var tags: js.UndefOr[TagList]
    var virtualInterfaceName: js.UndefOr[VirtualInterfaceName]
    var vlan: js.UndefOr[VLAN]
  }

  object NewTransitVirtualInterfaceAllocation {
    @inline
    def apply(
        addressFamily: js.UndefOr[AddressFamily] = js.undefined,
        amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
        asn: js.UndefOr[ASN] = js.undefined,
        authKey: js.UndefOr[BGPAuthKey] = js.undefined,
        customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
        mtu: js.UndefOr[MTU] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.undefined,
        vlan: js.UndefOr[VLAN] = js.undefined
    ): NewTransitVirtualInterfaceAllocation = {
      val __obj = js.Dynamic.literal()
      addressFamily.foreach(__v => __obj.updateDynamic("addressFamily")(__v.asInstanceOf[js.Any]))
      amazonAddress.foreach(__v => __obj.updateDynamic("amazonAddress")(__v.asInstanceOf[js.Any]))
      asn.foreach(__v => __obj.updateDynamic("asn")(__v.asInstanceOf[js.Any]))
      authKey.foreach(__v => __obj.updateDynamic("authKey")(__v.asInstanceOf[js.Any]))
      customerAddress.foreach(__v => __obj.updateDynamic("customerAddress")(__v.asInstanceOf[js.Any]))
      mtu.foreach(__v => __obj.updateDynamic("mtu")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      virtualInterfaceName.foreach(__v => __obj.updateDynamic("virtualInterfaceName")(__v.asInstanceOf[js.Any]))
      vlan.foreach(__v => __obj.updateDynamic("vlan")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NewTransitVirtualInterfaceAllocation]
    }
  }

  /**
    * Information about a tag associated with an AWS Direct Connect resource.
    */
  @js.native
  trait ResourceTag extends js.Object {
    var resourceArn: js.UndefOr[ResourceArn]
    var tags: js.UndefOr[TagList]
  }

  object ResourceTag {
    @inline
    def apply(
        resourceArn: js.UndefOr[ResourceArn] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): ResourceTag = {
      val __obj = js.Dynamic.literal()
      resourceArn.foreach(__v => __obj.updateDynamic("resourceArn")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceTag]
    }
  }

  /**
    * Information about a route filter prefix that a customer can advertise through Border Gateway Protocol (BGP) over a public virtual interface.
    */
  @js.native
  trait RouteFilterPrefix extends js.Object {
    var cidr: js.UndefOr[CIDR]
  }

  object RouteFilterPrefix {
    @inline
    def apply(
        cidr: js.UndefOr[CIDR] = js.undefined
    ): RouteFilterPrefix = {
      val __obj = js.Dynamic.literal()
      cidr.foreach(__v => __obj.updateDynamic("cidr")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RouteFilterPrefix]
    }
  }

  /**
    * Information about a tag.
    */
  @js.native
  trait Tag extends js.Object {
    var key: TagKey
    var value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        key: TagKey,
        value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any]
      )

      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags"        -> tags.asInstanceOf[js.Any]
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

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
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
  trait UpdateDirectConnectGatewayAssociationRequest extends js.Object {
    var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList]
    var associationId: js.UndefOr[DirectConnectGatewayAssociationId]
    var removeAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList]
  }

  object UpdateDirectConnectGatewayAssociationRequest {
    @inline
    def apply(
        addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined,
        associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.undefined,
        removeAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
    ): UpdateDirectConnectGatewayAssociationRequest = {
      val __obj = js.Dynamic.literal()
      addAllowedPrefixesToDirectConnectGateway.foreach(
        __v => __obj.updateDynamic("addAllowedPrefixesToDirectConnectGateway")(__v.asInstanceOf[js.Any])
      )
      associationId.foreach(__v => __obj.updateDynamic("associationId")(__v.asInstanceOf[js.Any]))
      removeAllowedPrefixesToDirectConnectGateway.foreach(
        __v => __obj.updateDynamic("removeAllowedPrefixesToDirectConnectGateway")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[UpdateDirectConnectGatewayAssociationRequest]
    }
  }

  @js.native
  trait UpdateDirectConnectGatewayAssociationResult extends js.Object {
    var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation]
  }

  object UpdateDirectConnectGatewayAssociationResult {
    @inline
    def apply(
        directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.undefined
    ): UpdateDirectConnectGatewayAssociationResult = {
      val __obj = js.Dynamic.literal()
      directConnectGatewayAssociation.foreach(
        __v => __obj.updateDynamic("directConnectGatewayAssociation")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[UpdateDirectConnectGatewayAssociationResult]
    }
  }

  @js.native
  trait UpdateLagRequest extends js.Object {
    var lagId: LagId
    var lagName: js.UndefOr[LagName]
    var minimumLinks: js.UndefOr[Count]
  }

  object UpdateLagRequest {
    @inline
    def apply(
        lagId: LagId,
        lagName: js.UndefOr[LagName] = js.undefined,
        minimumLinks: js.UndefOr[Count] = js.undefined
    ): UpdateLagRequest = {
      val __obj = js.Dynamic.literal(
        "lagId" -> lagId.asInstanceOf[js.Any]
      )

      lagName.foreach(__v => __obj.updateDynamic("lagName")(__v.asInstanceOf[js.Any]))
      minimumLinks.foreach(__v => __obj.updateDynamic("minimumLinks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLagRequest]
    }
  }

  @js.native
  trait UpdateVirtualInterfaceAttributesRequest extends js.Object {
    var virtualInterfaceId: VirtualInterfaceId
    var mtu: js.UndefOr[MTU]
  }

  object UpdateVirtualInterfaceAttributesRequest {
    @inline
    def apply(
        virtualInterfaceId: VirtualInterfaceId,
        mtu: js.UndefOr[MTU] = js.undefined
    ): UpdateVirtualInterfaceAttributesRequest = {
      val __obj = js.Dynamic.literal(
        "virtualInterfaceId" -> virtualInterfaceId.asInstanceOf[js.Any]
      )

      mtu.foreach(__v => __obj.updateDynamic("mtu")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVirtualInterfaceAttributesRequest]
    }
  }

  /**
    * Information about a virtual private gateway for a private virtual interface.
    */
  @js.native
  trait VirtualGateway extends js.Object {
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
    var virtualGatewayState: js.UndefOr[VirtualGatewayState]
  }

  object VirtualGateway {
    @inline
    def apply(
        virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined,
        virtualGatewayState: js.UndefOr[VirtualGatewayState] = js.undefined
    ): VirtualGateway = {
      val __obj = js.Dynamic.literal()
      virtualGatewayId.foreach(__v => __obj.updateDynamic("virtualGatewayId")(__v.asInstanceOf[js.Any]))
      virtualGatewayState.foreach(__v => __obj.updateDynamic("virtualGatewayState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualGateway]
    }
  }

  @js.native
  trait VirtualGateways extends js.Object {
    var virtualGateways: js.UndefOr[VirtualGatewayList]
  }

  object VirtualGateways {
    @inline
    def apply(
        virtualGateways: js.UndefOr[VirtualGatewayList] = js.undefined
    ): VirtualGateways = {
      val __obj = js.Dynamic.literal()
      virtualGateways.foreach(__v => __obj.updateDynamic("virtualGateways")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualGateways]
    }
  }

  /**
    * Information about a virtual interface.
    */
  @js.native
  trait VirtualInterface extends js.Object {
    var addressFamily: js.UndefOr[AddressFamily]
    var amazonAddress: js.UndefOr[AmazonAddress]
    var amazonSideAsn: js.UndefOr[LongAsn]
    var asn: js.UndefOr[ASN]
    var authKey: js.UndefOr[BGPAuthKey]
    var awsDeviceV2: js.UndefOr[AwsDeviceV2]
    var bgpPeers: js.UndefOr[BGPPeerList]
    var connectionId: js.UndefOr[ConnectionId]
    var customerAddress: js.UndefOr[CustomerAddress]
    var customerRouterConfig: js.UndefOr[RouterConfig]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var jumboFrameCapable: js.UndefOr[JumboFrameCapable]
    var location: js.UndefOr[LocationCode]
    var mtu: js.UndefOr[MTU]
    var ownerAccount: js.UndefOr[OwnerAccount]
    var region: js.UndefOr[Region]
    var routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList]
    var tags: js.UndefOr[TagList]
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
    var virtualInterfaceName: js.UndefOr[VirtualInterfaceName]
    var virtualInterfaceState: js.UndefOr[VirtualInterfaceState]
    var virtualInterfaceType: js.UndefOr[VirtualInterfaceType]
    var vlan: js.UndefOr[VLAN]
  }

  object VirtualInterface {
    @inline
    def apply(
        addressFamily: js.UndefOr[AddressFamily] = js.undefined,
        amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
        amazonSideAsn: js.UndefOr[LongAsn] = js.undefined,
        asn: js.UndefOr[ASN] = js.undefined,
        authKey: js.UndefOr[BGPAuthKey] = js.undefined,
        awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined,
        bgpPeers: js.UndefOr[BGPPeerList] = js.undefined,
        connectionId: js.UndefOr[ConnectionId] = js.undefined,
        customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
        customerRouterConfig: js.UndefOr[RouterConfig] = js.undefined,
        directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
        jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined,
        location: js.UndefOr[LocationCode] = js.undefined,
        mtu: js.UndefOr[MTU] = js.undefined,
        ownerAccount: js.UndefOr[OwnerAccount] = js.undefined,
        region: js.UndefOr[Region] = js.undefined,
        routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined,
        virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined,
        virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.undefined,
        virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.undefined,
        virtualInterfaceType: js.UndefOr[VirtualInterfaceType] = js.undefined,
        vlan: js.UndefOr[VLAN] = js.undefined
    ): VirtualInterface = {
      val __obj = js.Dynamic.literal()
      addressFamily.foreach(__v => __obj.updateDynamic("addressFamily")(__v.asInstanceOf[js.Any]))
      amazonAddress.foreach(__v => __obj.updateDynamic("amazonAddress")(__v.asInstanceOf[js.Any]))
      amazonSideAsn.foreach(__v => __obj.updateDynamic("amazonSideAsn")(__v.asInstanceOf[js.Any]))
      asn.foreach(__v => __obj.updateDynamic("asn")(__v.asInstanceOf[js.Any]))
      authKey.foreach(__v => __obj.updateDynamic("authKey")(__v.asInstanceOf[js.Any]))
      awsDeviceV2.foreach(__v => __obj.updateDynamic("awsDeviceV2")(__v.asInstanceOf[js.Any]))
      bgpPeers.foreach(__v => __obj.updateDynamic("bgpPeers")(__v.asInstanceOf[js.Any]))
      connectionId.foreach(__v => __obj.updateDynamic("connectionId")(__v.asInstanceOf[js.Any]))
      customerAddress.foreach(__v => __obj.updateDynamic("customerAddress")(__v.asInstanceOf[js.Any]))
      customerRouterConfig.foreach(__v => __obj.updateDynamic("customerRouterConfig")(__v.asInstanceOf[js.Any]))
      directConnectGatewayId.foreach(__v => __obj.updateDynamic("directConnectGatewayId")(__v.asInstanceOf[js.Any]))
      jumboFrameCapable.foreach(__v => __obj.updateDynamic("jumboFrameCapable")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      mtu.foreach(__v => __obj.updateDynamic("mtu")(__v.asInstanceOf[js.Any]))
      ownerAccount.foreach(__v => __obj.updateDynamic("ownerAccount")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      routeFilterPrefixes.foreach(__v => __obj.updateDynamic("routeFilterPrefixes")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      virtualGatewayId.foreach(__v => __obj.updateDynamic("virtualGatewayId")(__v.asInstanceOf[js.Any]))
      virtualInterfaceId.foreach(__v => __obj.updateDynamic("virtualInterfaceId")(__v.asInstanceOf[js.Any]))
      virtualInterfaceName.foreach(__v => __obj.updateDynamic("virtualInterfaceName")(__v.asInstanceOf[js.Any]))
      virtualInterfaceState.foreach(__v => __obj.updateDynamic("virtualInterfaceState")(__v.asInstanceOf[js.Any]))
      virtualInterfaceType.foreach(__v => __obj.updateDynamic("virtualInterfaceType")(__v.asInstanceOf[js.Any]))
      vlan.foreach(__v => __obj.updateDynamic("vlan")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualInterface]
    }
  }

  object VirtualInterfaceStateEnum {
    val confirming = "confirming"
    val verifying  = "verifying"
    val pending    = "pending"
    val available  = "available"
    val down       = "down"
    val deleting   = "deleting"
    val deleted    = "deleted"
    val rejected   = "rejected"
    val unknown    = "unknown"

    val values =
      js.Object.freeze(js.Array(confirming, verifying, pending, available, down, deleting, deleted, rejected, unknown))
  }

  @js.native
  trait VirtualInterfaces extends js.Object {
    var virtualInterfaces: js.UndefOr[VirtualInterfaceList]
  }

  object VirtualInterfaces {
    @inline
    def apply(
        virtualInterfaces: js.UndefOr[VirtualInterfaceList] = js.undefined
    ): VirtualInterfaces = {
      val __obj = js.Dynamic.literal()
      virtualInterfaces.foreach(__v => __obj.updateDynamic("virtualInterfaces")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualInterfaces]
    }
  }
}
