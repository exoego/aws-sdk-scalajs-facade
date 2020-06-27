package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object directconnect {
  type ASN                 = Int
  type AmazonAddress       = String
  type AssociatedGatewayId = String
  type AvailablePortSpeeds = js.Array[PortSpeed]
  @deprecated("Deprecated in AWS SDK", "forever")
  type AwsDevice                                   = String
  type AwsDeviceV2                                 = String
  type BGPAuthKey                                  = String
  type BGPPeerId                                   = String
  type BGPPeerList                                 = js.Array[BGPPeer]
  type Bandwidth                                   = String
  type BooleanFlag                                 = Boolean
  type CIDR                                        = String
  type ConnectionId                                = String
  type ConnectionList                              = js.Array[Connection]
  type ConnectionName                              = String
  type Count                                       = Int
  type CustomerAddress                             = String
  type DirectConnectGatewayAssociationId           = String
  type DirectConnectGatewayAssociationList         = js.Array[DirectConnectGatewayAssociation]
  type DirectConnectGatewayAssociationProposalId   = String
  type DirectConnectGatewayAssociationProposalList = js.Array[DirectConnectGatewayAssociationProposal]
  type DirectConnectGatewayAttachmentList          = js.Array[DirectConnectGatewayAttachment]
  type DirectConnectGatewayId                      = String
  type DirectConnectGatewayList                    = js.Array[DirectConnectGateway]
  type DirectConnectGatewayName                    = String
  type GatewayIdToAssociate                        = String
  type GatewayIdentifier                           = String
  type InterconnectId                              = String
  type InterconnectList                            = js.Array[Interconnect]
  type InterconnectName                            = String
  type JumboFrameCapable                           = Boolean
  type LagId                                       = String
  type LagList                                     = js.Array[Lag]
  type LagName                                     = String
  type LoaContent                                  = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type LoaIssueTime                                = js.Date
  type LocationCode                                = String
  type LocationList                                = js.Array[Location]
  type LocationName                                = String
  type LongAsn                                     = Double
  type MTU                                         = Int
  type MaxResultSetSize                            = Int
  type OwnerAccount                                = String
  type PaginationToken                             = String
  type PartnerName                                 = String
  type PortSpeed                                   = String
  type ProviderList                                = js.Array[ProviderName]
  type ProviderName                                = String
  type Region                                      = String
  type ResourceArn                                 = String
  type ResourceArnList                             = js.Array[ResourceArn]
  type ResourceTagList                             = js.Array[ResourceTag]
  type RouteFilterPrefixList                       = js.Array[RouteFilterPrefix]
  type RouterConfig                                = String
  type StateChangeError                            = String
  type TagKey                                      = String
  type TagKeyList                                  = js.Array[TagKey]
  type TagList                                     = js.Array[Tag]
  type TagValue                                    = String
  type VLAN                                        = Int
  type VirtualGatewayId                            = String
  type VirtualGatewayList                          = js.Array[VirtualGateway]
  @deprecated("Deprecated in AWS SDK", "forever")
  type VirtualGatewayRegion   = String
  type VirtualGatewayState    = String
  type VirtualInterfaceId     = String
  type VirtualInterfaceList   = js.Array[VirtualInterface]
  type VirtualInterfaceName   = String
  type VirtualInterfaceRegion = String
  type VirtualInterfaceType   = String

  implicit final class DirectConnectOps(private val service: DirectConnect) extends AnyVal {

    @inline def acceptDirectConnectGatewayAssociationProposalFuture(
        params: AcceptDirectConnectGatewayAssociationProposalRequest
    ): Future[AcceptDirectConnectGatewayAssociationProposalResult] =
      service.acceptDirectConnectGatewayAssociationProposal(params).promise().toFuture
    @inline def allocateHostedConnectionFuture(params: AllocateHostedConnectionRequest): Future[Connection] =
      service.allocateHostedConnection(params).promise().toFuture
    @inline def allocatePrivateVirtualInterfaceFuture(
        params: AllocatePrivateVirtualInterfaceRequest
    ): Future[VirtualInterface] = service.allocatePrivateVirtualInterface(params).promise().toFuture
    @inline def allocatePublicVirtualInterfaceFuture(
        params: AllocatePublicVirtualInterfaceRequest
    ): Future[VirtualInterface] = service.allocatePublicVirtualInterface(params).promise().toFuture
    @inline def allocateTransitVirtualInterfaceFuture(
        params: AllocateTransitVirtualInterfaceRequest
    ): Future[AllocateTransitVirtualInterfaceResult] =
      service.allocateTransitVirtualInterface(params).promise().toFuture
    @inline def associateConnectionWithLagFuture(params: AssociateConnectionWithLagRequest): Future[Connection] =
      service.associateConnectionWithLag(params).promise().toFuture
    @inline def associateHostedConnectionFuture(params: AssociateHostedConnectionRequest): Future[Connection] =
      service.associateHostedConnection(params).promise().toFuture
    @inline def associateVirtualInterfaceFuture(params: AssociateVirtualInterfaceRequest): Future[VirtualInterface] =
      service.associateVirtualInterface(params).promise().toFuture
    @inline def confirmConnectionFuture(params: ConfirmConnectionRequest): Future[ConfirmConnectionResponse] =
      service.confirmConnection(params).promise().toFuture
    @inline def confirmPrivateVirtualInterfaceFuture(
        params: ConfirmPrivateVirtualInterfaceRequest
    ): Future[ConfirmPrivateVirtualInterfaceResponse] =
      service.confirmPrivateVirtualInterface(params).promise().toFuture
    @inline def confirmPublicVirtualInterfaceFuture(
        params: ConfirmPublicVirtualInterfaceRequest
    ): Future[ConfirmPublicVirtualInterfaceResponse] = service.confirmPublicVirtualInterface(params).promise().toFuture
    @inline def confirmTransitVirtualInterfaceFuture(
        params: ConfirmTransitVirtualInterfaceRequest
    ): Future[ConfirmTransitVirtualInterfaceResponse] =
      service.confirmTransitVirtualInterface(params).promise().toFuture
    @inline def createBGPPeerFuture(params: CreateBGPPeerRequest): Future[CreateBGPPeerResponse] =
      service.createBGPPeer(params).promise().toFuture
    @inline def createConnectionFuture(params: CreateConnectionRequest): Future[Connection] =
      service.createConnection(params).promise().toFuture
    @inline def createDirectConnectGatewayAssociationFuture(
        params: CreateDirectConnectGatewayAssociationRequest
    ): Future[CreateDirectConnectGatewayAssociationResult] =
      service.createDirectConnectGatewayAssociation(params).promise().toFuture
    @inline def createDirectConnectGatewayAssociationProposalFuture(
        params: CreateDirectConnectGatewayAssociationProposalRequest
    ): Future[CreateDirectConnectGatewayAssociationProposalResult] =
      service.createDirectConnectGatewayAssociationProposal(params).promise().toFuture
    @inline def createDirectConnectGatewayFuture(
        params: CreateDirectConnectGatewayRequest
    ): Future[CreateDirectConnectGatewayResult] = service.createDirectConnectGateway(params).promise().toFuture
    @inline def createInterconnectFuture(params: CreateInterconnectRequest): Future[Interconnect] =
      service.createInterconnect(params).promise().toFuture
    @inline def createLagFuture(params: CreateLagRequest): Future[Lag] = service.createLag(params).promise().toFuture
    @inline def createPrivateVirtualInterfaceFuture(
        params: CreatePrivateVirtualInterfaceRequest
    ): Future[VirtualInterface] = service.createPrivateVirtualInterface(params).promise().toFuture
    @inline def createPublicVirtualInterfaceFuture(
        params: CreatePublicVirtualInterfaceRequest
    ): Future[VirtualInterface] = service.createPublicVirtualInterface(params).promise().toFuture
    @inline def createTransitVirtualInterfaceFuture(
        params: CreateTransitVirtualInterfaceRequest
    ): Future[CreateTransitVirtualInterfaceResult] = service.createTransitVirtualInterface(params).promise().toFuture
    @inline def deleteBGPPeerFuture(params: DeleteBGPPeerRequest): Future[DeleteBGPPeerResponse] =
      service.deleteBGPPeer(params).promise().toFuture
    @inline def deleteConnectionFuture(params: DeleteConnectionRequest): Future[Connection] =
      service.deleteConnection(params).promise().toFuture
    @inline def deleteDirectConnectGatewayAssociationFuture(
        params: DeleteDirectConnectGatewayAssociationRequest
    ): Future[DeleteDirectConnectGatewayAssociationResult] =
      service.deleteDirectConnectGatewayAssociation(params).promise().toFuture
    @inline def deleteDirectConnectGatewayAssociationProposalFuture(
        params: DeleteDirectConnectGatewayAssociationProposalRequest
    ): Future[DeleteDirectConnectGatewayAssociationProposalResult] =
      service.deleteDirectConnectGatewayAssociationProposal(params).promise().toFuture
    @inline def deleteDirectConnectGatewayFuture(
        params: DeleteDirectConnectGatewayRequest
    ): Future[DeleteDirectConnectGatewayResult] = service.deleteDirectConnectGateway(params).promise().toFuture
    @inline def deleteInterconnectFuture(params: DeleteInterconnectRequest): Future[DeleteInterconnectResponse] =
      service.deleteInterconnect(params).promise().toFuture
    @inline def deleteLagFuture(params: DeleteLagRequest): Future[Lag] = service.deleteLag(params).promise().toFuture
    @inline def deleteVirtualInterfaceFuture(
        params: DeleteVirtualInterfaceRequest
    ): Future[DeleteVirtualInterfaceResponse] = service.deleteVirtualInterface(params).promise().toFuture
    @inline def describeConnectionsFuture(params: DescribeConnectionsRequest): Future[Connections] =
      service.describeConnections(params).promise().toFuture
    @inline def describeDirectConnectGatewayAssociationProposalsFuture(
        params: DescribeDirectConnectGatewayAssociationProposalsRequest
    ): Future[DescribeDirectConnectGatewayAssociationProposalsResult] =
      service.describeDirectConnectGatewayAssociationProposals(params).promise().toFuture
    @inline def describeDirectConnectGatewayAssociationsFuture(
        params: DescribeDirectConnectGatewayAssociationsRequest
    ): Future[DescribeDirectConnectGatewayAssociationsResult] =
      service.describeDirectConnectGatewayAssociations(params).promise().toFuture
    @inline def describeDirectConnectGatewayAttachmentsFuture(
        params: DescribeDirectConnectGatewayAttachmentsRequest
    ): Future[DescribeDirectConnectGatewayAttachmentsResult] =
      service.describeDirectConnectGatewayAttachments(params).promise().toFuture
    @inline def describeDirectConnectGatewaysFuture(
        params: DescribeDirectConnectGatewaysRequest
    ): Future[DescribeDirectConnectGatewaysResult] = service.describeDirectConnectGateways(params).promise().toFuture
    @inline def describeHostedConnectionsFuture(params: DescribeHostedConnectionsRequest): Future[Connections] =
      service.describeHostedConnections(params).promise().toFuture
    @inline def describeInterconnectsFuture(params: DescribeInterconnectsRequest): Future[Interconnects] =
      service.describeInterconnects(params).promise().toFuture
    @inline def describeLagsFuture(params: DescribeLagsRequest): Future[Lags] =
      service.describeLags(params).promise().toFuture
    @inline def describeLoaFuture(params: DescribeLoaRequest): Future[Loa] =
      service.describeLoa(params).promise().toFuture
    @inline def describeLocationsFuture(): Future[Locations] = service.describeLocations().promise().toFuture
    @inline def describeTagsFuture(params: DescribeTagsRequest): Future[DescribeTagsResponse] =
      service.describeTags(params).promise().toFuture
    @inline def describeVirtualGatewaysFuture(): Future[VirtualGateways] =
      service.describeVirtualGateways().promise().toFuture
    @inline def describeVirtualInterfacesFuture(params: DescribeVirtualInterfacesRequest): Future[VirtualInterfaces] =
      service.describeVirtualInterfaces(params).promise().toFuture
    @inline def disassociateConnectionFromLagFuture(params: DisassociateConnectionFromLagRequest): Future[Connection] =
      service.disassociateConnectionFromLag(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateDirectConnectGatewayAssociationFuture(
        params: UpdateDirectConnectGatewayAssociationRequest
    ): Future[UpdateDirectConnectGatewayAssociationResult] =
      service.updateDirectConnectGatewayAssociation(params).promise().toFuture
    @inline def updateLagFuture(params: UpdateLagRequest): Future[Lag] = service.updateLag(params).promise().toFuture
    @inline def updateVirtualInterfaceAttributesFuture(
        params: UpdateVirtualInterfaceAttributesRequest
    ): Future[VirtualInterface] = service.updateVirtualInterfaceAttributes(params).promise().toFuture
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
  @Factory
  trait AcceptDirectConnectGatewayAssociationProposalRequest extends js.Object {
    var associatedGatewayOwnerAccount: OwnerAccount
    var directConnectGatewayId: DirectConnectGatewayId
    var proposalId: DirectConnectGatewayAssociationProposalId
    var overrideAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList]
  }

  @js.native
  @Factory
  trait AcceptDirectConnectGatewayAssociationProposalResult extends js.Object {
    var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation]
  }

  @js.native
  sealed trait AddressFamily extends js.Any
  object AddressFamily extends js.Object {
    val ipv4 = "ipv4".asInstanceOf[AddressFamily]
    val ipv6 = "ipv6".asInstanceOf[AddressFamily]

    val values = js.Object.freeze(js.Array(ipv4, ipv6))
  }

  @js.native
  @Factory
  trait AllocateConnectionOnInterconnectRequest extends js.Object {
    var bandwidth: Bandwidth
    var connectionName: ConnectionName
    var interconnectId: InterconnectId
    var ownerAccount: OwnerAccount
    var vlan: VLAN
  }

  @js.native
  @Factory
  trait AllocateHostedConnectionRequest extends js.Object {
    var bandwidth: Bandwidth
    var connectionId: ConnectionId
    var connectionName: ConnectionName
    var ownerAccount: OwnerAccount
    var vlan: VLAN
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait AllocatePrivateVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var newPrivateVirtualInterfaceAllocation: NewPrivateVirtualInterfaceAllocation
    var ownerAccount: OwnerAccount
  }

  @js.native
  @Factory
  trait AllocatePublicVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var newPublicVirtualInterfaceAllocation: NewPublicVirtualInterfaceAllocation
    var ownerAccount: OwnerAccount
  }

  @js.native
  @Factory
  trait AllocateTransitVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var newTransitVirtualInterfaceAllocation: NewTransitVirtualInterfaceAllocation
    var ownerAccount: OwnerAccount
  }

  @js.native
  @Factory
  trait AllocateTransitVirtualInterfaceResult extends js.Object {
    var virtualInterface: js.UndefOr[VirtualInterface]
  }

  @js.native
  @Factory
  trait AssociateConnectionWithLagRequest extends js.Object {
    var connectionId: ConnectionId
    var lagId: LagId
  }

  @js.native
  @Factory
  trait AssociateHostedConnectionRequest extends js.Object {
    var connectionId: ConnectionId
    var parentConnectionId: ConnectionId
  }

  @js.native
  @Factory
  trait AssociateVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var virtualInterfaceId: VirtualInterfaceId
  }

  /**
    * Information about the associated gateway.
    */
  @js.native
  @Factory
  trait AssociatedGateway extends js.Object {
    var id: js.UndefOr[GatewayIdentifier]
    var ownerAccount: js.UndefOr[OwnerAccount]
    var region: js.UndefOr[Region]
    var `type`: js.UndefOr[GatewayType]
  }

  /**
    * Information about a BGP peer.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait BGPPeerState extends js.Any
  object BGPPeerState extends js.Object {
    val verifying = "verifying".asInstanceOf[BGPPeerState]
    val pending   = "pending".asInstanceOf[BGPPeerState]
    val available = "available".asInstanceOf[BGPPeerState]
    val deleting  = "deleting".asInstanceOf[BGPPeerState]
    val deleted   = "deleted".asInstanceOf[BGPPeerState]

    val values = js.Object.freeze(js.Array(verifying, pending, available, deleting, deleted))
  }

  @js.native
  sealed trait BGPStatus extends js.Any
  object BGPStatus extends js.Object {
    val up      = "up".asInstanceOf[BGPStatus]
    val down    = "down".asInstanceOf[BGPStatus]
    val unknown = "unknown".asInstanceOf[BGPStatus]

    val values = js.Object.freeze(js.Array(up, down, unknown))
  }

  @js.native
  @Factory
  trait ConfirmConnectionRequest extends js.Object {
    var connectionId: ConnectionId
  }

  @js.native
  @Factory
  trait ConfirmConnectionResponse extends js.Object {
    var connectionState: js.UndefOr[ConnectionState]
  }

  @js.native
  @Factory
  trait ConfirmPrivateVirtualInterfaceRequest extends js.Object {
    var virtualInterfaceId: VirtualInterfaceId
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
  }

  @js.native
  @Factory
  trait ConfirmPrivateVirtualInterfaceResponse extends js.Object {
    var virtualInterfaceState: js.UndefOr[VirtualInterfaceState]
  }

  @js.native
  @Factory
  trait ConfirmPublicVirtualInterfaceRequest extends js.Object {
    var virtualInterfaceId: VirtualInterfaceId
  }

  @js.native
  @Factory
  trait ConfirmPublicVirtualInterfaceResponse extends js.Object {
    var virtualInterfaceState: js.UndefOr[VirtualInterfaceState]
  }

  @js.native
  @Factory
  trait ConfirmTransitVirtualInterfaceRequest extends js.Object {
    var directConnectGatewayId: DirectConnectGatewayId
    var virtualInterfaceId: VirtualInterfaceId
  }

  @js.native
  @Factory
  trait ConfirmTransitVirtualInterfaceResponse extends js.Object {
    var virtualInterfaceState: js.UndefOr[VirtualInterfaceState]
  }

  /**
    * Information about an AWS Direct Connect connection.
    */
  @js.native
  @Factory
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
    var providerName: js.UndefOr[ProviderName]
    var region: js.UndefOr[Region]
    var tags: js.UndefOr[TagList]
    var vlan: js.UndefOr[VLAN]
  }

  @js.native
  sealed trait ConnectionState extends js.Any
  object ConnectionState extends js.Object {
    val ordering  = "ordering".asInstanceOf[ConnectionState]
    val requested = "requested".asInstanceOf[ConnectionState]
    val pending   = "pending".asInstanceOf[ConnectionState]
    val available = "available".asInstanceOf[ConnectionState]
    val down      = "down".asInstanceOf[ConnectionState]
    val deleting  = "deleting".asInstanceOf[ConnectionState]
    val deleted   = "deleted".asInstanceOf[ConnectionState]
    val rejected  = "rejected".asInstanceOf[ConnectionState]
    val unknown   = "unknown".asInstanceOf[ConnectionState]

    val values =
      js.Object.freeze(js.Array(ordering, requested, pending, available, down, deleting, deleted, rejected, unknown))
  }

  @js.native
  @Factory
  trait Connections extends js.Object {
    var connections: js.UndefOr[ConnectionList]
  }

  @js.native
  @Factory
  trait CreateBGPPeerRequest extends js.Object {
    var newBGPPeer: js.UndefOr[NewBGPPeer]
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
  }

  @js.native
  @Factory
  trait CreateBGPPeerResponse extends js.Object {
    var virtualInterface: js.UndefOr[VirtualInterface]
  }

  @js.native
  @Factory
  trait CreateConnectionRequest extends js.Object {
    var bandwidth: Bandwidth
    var connectionName: ConnectionName
    var location: LocationCode
    var lagId: js.UndefOr[LagId]
    var providerName: js.UndefOr[ProviderName]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateDirectConnectGatewayAssociationProposalRequest extends js.Object {
    var directConnectGatewayId: DirectConnectGatewayId
    var directConnectGatewayOwnerAccount: OwnerAccount
    var gatewayId: GatewayIdToAssociate
    var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList]
    var removeAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList]
  }

  @js.native
  @Factory
  trait CreateDirectConnectGatewayAssociationProposalResult extends js.Object {
    var directConnectGatewayAssociationProposal: js.UndefOr[DirectConnectGatewayAssociationProposal]
  }

  @js.native
  @Factory
  trait CreateDirectConnectGatewayAssociationRequest extends js.Object {
    var directConnectGatewayId: DirectConnectGatewayId
    var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList]
    var gatewayId: js.UndefOr[GatewayIdToAssociate]
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
  }

  @js.native
  @Factory
  trait CreateDirectConnectGatewayAssociationResult extends js.Object {
    var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation]
  }

  @js.native
  @Factory
  trait CreateDirectConnectGatewayRequest extends js.Object {
    var directConnectGatewayName: DirectConnectGatewayName
    var amazonSideAsn: js.UndefOr[LongAsn]
  }

  @js.native
  @Factory
  trait CreateDirectConnectGatewayResult extends js.Object {
    var directConnectGateway: js.UndefOr[DirectConnectGateway]
  }

  @js.native
  @Factory
  trait CreateInterconnectRequest extends js.Object {
    var bandwidth: Bandwidth
    var interconnectName: InterconnectName
    var location: LocationCode
    var lagId: js.UndefOr[LagId]
    var providerName: js.UndefOr[ProviderName]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateLagRequest extends js.Object {
    var connectionsBandwidth: Bandwidth
    var lagName: LagName
    var location: LocationCode
    var numberOfConnections: Count
    var childConnectionTags: js.UndefOr[TagList]
    var connectionId: js.UndefOr[ConnectionId]
    var providerName: js.UndefOr[ProviderName]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreatePrivateVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var newPrivateVirtualInterface: NewPrivateVirtualInterface
  }

  @js.native
  @Factory
  trait CreatePublicVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var newPublicVirtualInterface: NewPublicVirtualInterface
  }

  @js.native
  @Factory
  trait CreateTransitVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var newTransitVirtualInterface: NewTransitVirtualInterface
  }

  @js.native
  @Factory
  trait CreateTransitVirtualInterfaceResult extends js.Object {
    var virtualInterface: js.UndefOr[VirtualInterface]
  }

  @js.native
  @Factory
  trait DeleteBGPPeerRequest extends js.Object {
    var asn: js.UndefOr[ASN]
    var bgpPeerId: js.UndefOr[BGPPeerId]
    var customerAddress: js.UndefOr[CustomerAddress]
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
  }

  @js.native
  @Factory
  trait DeleteBGPPeerResponse extends js.Object {
    var virtualInterface: js.UndefOr[VirtualInterface]
  }

  @js.native
  @Factory
  trait DeleteConnectionRequest extends js.Object {
    var connectionId: ConnectionId
  }

  @js.native
  @Factory
  trait DeleteDirectConnectGatewayAssociationProposalRequest extends js.Object {
    var proposalId: DirectConnectGatewayAssociationProposalId
  }

  @js.native
  @Factory
  trait DeleteDirectConnectGatewayAssociationProposalResult extends js.Object {
    var directConnectGatewayAssociationProposal: js.UndefOr[DirectConnectGatewayAssociationProposal]
  }

  @js.native
  @Factory
  trait DeleteDirectConnectGatewayAssociationRequest extends js.Object {
    var associationId: js.UndefOr[DirectConnectGatewayAssociationId]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
  }

  @js.native
  @Factory
  trait DeleteDirectConnectGatewayAssociationResult extends js.Object {
    var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation]
  }

  @js.native
  @Factory
  trait DeleteDirectConnectGatewayRequest extends js.Object {
    var directConnectGatewayId: DirectConnectGatewayId
  }

  @js.native
  @Factory
  trait DeleteDirectConnectGatewayResult extends js.Object {
    var directConnectGateway: js.UndefOr[DirectConnectGateway]
  }

  @js.native
  @Factory
  trait DeleteInterconnectRequest extends js.Object {
    var interconnectId: InterconnectId
  }

  @js.native
  @Factory
  trait DeleteInterconnectResponse extends js.Object {
    var interconnectState: js.UndefOr[InterconnectState]
  }

  @js.native
  @Factory
  trait DeleteLagRequest extends js.Object {
    var lagId: LagId
  }

  @js.native
  @Factory
  trait DeleteVirtualInterfaceRequest extends js.Object {
    var virtualInterfaceId: VirtualInterfaceId
  }

  @js.native
  @Factory
  trait DeleteVirtualInterfaceResponse extends js.Object {
    var virtualInterfaceState: js.UndefOr[VirtualInterfaceState]
  }

  @js.native
  @Factory
  trait DescribeConnectionLoaRequest extends js.Object {
    var connectionId: ConnectionId
    var loaContentType: js.UndefOr[LoaContentType]
    var providerName: js.UndefOr[ProviderName]
  }

  @js.native
  @Factory
  trait DescribeConnectionLoaResponse extends js.Object {
    var loa: js.UndefOr[Loa]
  }

  @js.native
  @Factory
  trait DescribeConnectionsOnInterconnectRequest extends js.Object {
    var interconnectId: InterconnectId
  }

  @js.native
  @Factory
  trait DescribeConnectionsRequest extends js.Object {
    var connectionId: js.UndefOr[ConnectionId]
  }

  @js.native
  @Factory
  trait DescribeDirectConnectGatewayAssociationProposalsRequest extends js.Object {
    var associatedGatewayId: js.UndefOr[AssociatedGatewayId]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var maxResults: js.UndefOr[MaxResultSetSize]
    var nextToken: js.UndefOr[PaginationToken]
    var proposalId: js.UndefOr[DirectConnectGatewayAssociationProposalId]
  }

  @js.native
  @Factory
  trait DescribeDirectConnectGatewayAssociationProposalsResult extends js.Object {
    var directConnectGatewayAssociationProposals: js.UndefOr[DirectConnectGatewayAssociationProposalList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait DescribeDirectConnectGatewayAssociationsRequest extends js.Object {
    var associatedGatewayId: js.UndefOr[AssociatedGatewayId]
    var associationId: js.UndefOr[DirectConnectGatewayAssociationId]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var maxResults: js.UndefOr[MaxResultSetSize]
    var nextToken: js.UndefOr[PaginationToken]
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
  }

  @js.native
  @Factory
  trait DescribeDirectConnectGatewayAssociationsResult extends js.Object {
    var directConnectGatewayAssociations: js.UndefOr[DirectConnectGatewayAssociationList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait DescribeDirectConnectGatewayAttachmentsRequest extends js.Object {
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var maxResults: js.UndefOr[MaxResultSetSize]
    var nextToken: js.UndefOr[PaginationToken]
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
  }

  @js.native
  @Factory
  trait DescribeDirectConnectGatewayAttachmentsResult extends js.Object {
    var directConnectGatewayAttachments: js.UndefOr[DirectConnectGatewayAttachmentList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait DescribeDirectConnectGatewaysRequest extends js.Object {
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var maxResults: js.UndefOr[MaxResultSetSize]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait DescribeDirectConnectGatewaysResult extends js.Object {
    var directConnectGateways: js.UndefOr[DirectConnectGatewayList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait DescribeHostedConnectionsRequest extends js.Object {
    var connectionId: ConnectionId
  }

  @js.native
  @Factory
  trait DescribeInterconnectLoaRequest extends js.Object {
    var interconnectId: InterconnectId
    var loaContentType: js.UndefOr[LoaContentType]
    var providerName: js.UndefOr[ProviderName]
  }

  @js.native
  @Factory
  trait DescribeInterconnectLoaResponse extends js.Object {
    var loa: js.UndefOr[Loa]
  }

  @js.native
  @Factory
  trait DescribeInterconnectsRequest extends js.Object {
    var interconnectId: js.UndefOr[InterconnectId]
  }

  @js.native
  @Factory
  trait DescribeLagsRequest extends js.Object {
    var lagId: js.UndefOr[LagId]
  }

  @js.native
  @Factory
  trait DescribeLoaRequest extends js.Object {
    var connectionId: ConnectionId
    var loaContentType: js.UndefOr[LoaContentType]
    var providerName: js.UndefOr[ProviderName]
  }

  @js.native
  @Factory
  trait DescribeTagsRequest extends js.Object {
    var resourceArns: ResourceArnList
  }

  @js.native
  @Factory
  trait DescribeTagsResponse extends js.Object {
    var resourceTags: js.UndefOr[ResourceTagList]
  }

  @js.native
  @Factory
  trait DescribeVirtualInterfacesRequest extends js.Object {
    var connectionId: js.UndefOr[ConnectionId]
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
  }

  /**
    * Information about a Direct Connect gateway, which enables you to connect virtual interfaces and virtual private gateway or transit gateways.
    */
  @js.native
  @Factory
  trait DirectConnectGateway extends js.Object {
    var amazonSideAsn: js.UndefOr[LongAsn]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var directConnectGatewayName: js.UndefOr[DirectConnectGatewayName]
    var directConnectGatewayState: js.UndefOr[DirectConnectGatewayState]
    var ownerAccount: js.UndefOr[OwnerAccount]
    var stateChangeError: js.UndefOr[StateChangeError]
  }

  /**
    * Information about an association between a Direct Connect gateway and a virtual private gateway or transit gateway.
    */
  @js.native
  @Factory
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

  /**
    * Information about the proposal request to attach a virtual private gateway to a Direct Connect gateway.
    */
  @js.native
  @Factory
  trait DirectConnectGatewayAssociationProposal extends js.Object {
    var associatedGateway: js.UndefOr[AssociatedGateway]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var directConnectGatewayOwnerAccount: js.UndefOr[OwnerAccount]
    var existingAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList]
    var proposalId: js.UndefOr[DirectConnectGatewayAssociationProposalId]
    var proposalState: js.UndefOr[DirectConnectGatewayAssociationProposalState]
    var requestedAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList]
  }

  @js.native
  sealed trait DirectConnectGatewayAssociationProposalState extends js.Any
  object DirectConnectGatewayAssociationProposalState extends js.Object {
    val requested = "requested".asInstanceOf[DirectConnectGatewayAssociationProposalState]
    val accepted  = "accepted".asInstanceOf[DirectConnectGatewayAssociationProposalState]
    val deleted   = "deleted".asInstanceOf[DirectConnectGatewayAssociationProposalState]

    val values = js.Object.freeze(js.Array(requested, accepted, deleted))
  }

  @js.native
  sealed trait DirectConnectGatewayAssociationState extends js.Any
  object DirectConnectGatewayAssociationState extends js.Object {
    val associating    = "associating".asInstanceOf[DirectConnectGatewayAssociationState]
    val associated     = "associated".asInstanceOf[DirectConnectGatewayAssociationState]
    val disassociating = "disassociating".asInstanceOf[DirectConnectGatewayAssociationState]
    val disassociated  = "disassociated".asInstanceOf[DirectConnectGatewayAssociationState]
    val updating       = "updating".asInstanceOf[DirectConnectGatewayAssociationState]

    val values = js.Object.freeze(js.Array(associating, associated, disassociating, disassociated, updating))
  }

  /**
    * Information about an attachment between a Direct Connect gateway and a virtual interface.
    */
  @js.native
  @Factory
  trait DirectConnectGatewayAttachment extends js.Object {
    var attachmentState: js.UndefOr[DirectConnectGatewayAttachmentState]
    var attachmentType: js.UndefOr[DirectConnectGatewayAttachmentType]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var stateChangeError: js.UndefOr[StateChangeError]
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
    var virtualInterfaceOwnerAccount: js.UndefOr[OwnerAccount]
    var virtualInterfaceRegion: js.UndefOr[VirtualInterfaceRegion]
  }

  @js.native
  sealed trait DirectConnectGatewayAttachmentState extends js.Any
  object DirectConnectGatewayAttachmentState extends js.Object {
    val attaching = "attaching".asInstanceOf[DirectConnectGatewayAttachmentState]
    val attached  = "attached".asInstanceOf[DirectConnectGatewayAttachmentState]
    val detaching = "detaching".asInstanceOf[DirectConnectGatewayAttachmentState]
    val detached  = "detached".asInstanceOf[DirectConnectGatewayAttachmentState]

    val values = js.Object.freeze(js.Array(attaching, attached, detaching, detached))
  }

  @js.native
  sealed trait DirectConnectGatewayAttachmentType extends js.Any
  object DirectConnectGatewayAttachmentType extends js.Object {
    val TransitVirtualInterface = "TransitVirtualInterface".asInstanceOf[DirectConnectGatewayAttachmentType]
    val PrivateVirtualInterface = "PrivateVirtualInterface".asInstanceOf[DirectConnectGatewayAttachmentType]

    val values = js.Object.freeze(js.Array(TransitVirtualInterface, PrivateVirtualInterface))
  }

  @js.native
  sealed trait DirectConnectGatewayState extends js.Any
  object DirectConnectGatewayState extends js.Object {
    val pending   = "pending".asInstanceOf[DirectConnectGatewayState]
    val available = "available".asInstanceOf[DirectConnectGatewayState]
    val deleting  = "deleting".asInstanceOf[DirectConnectGatewayState]
    val deleted   = "deleted".asInstanceOf[DirectConnectGatewayState]

    val values = js.Object.freeze(js.Array(pending, available, deleting, deleted))
  }

  @js.native
  @Factory
  trait DisassociateConnectionFromLagRequest extends js.Object {
    var connectionId: ConnectionId
    var lagId: LagId
  }

  @js.native
  sealed trait GatewayType extends js.Any
  object GatewayType extends js.Object {
    val virtualPrivateGateway = "virtualPrivateGateway".asInstanceOf[GatewayType]
    val transitGateway        = "transitGateway".asInstanceOf[GatewayType]

    val values = js.Object.freeze(js.Array(virtualPrivateGateway, transitGateway))
  }

  @js.native
  sealed trait HasLogicalRedundancy extends js.Any
  object HasLogicalRedundancy extends js.Object {
    val unknown = "unknown".asInstanceOf[HasLogicalRedundancy]
    val yes     = "yes".asInstanceOf[HasLogicalRedundancy]
    val no      = "no".asInstanceOf[HasLogicalRedundancy]

    val values = js.Object.freeze(js.Array(unknown, yes, no))
  }

  /**
    * Information about an interconnect.
    */
  @js.native
  @Factory
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
    var providerName: js.UndefOr[ProviderName]
    var region: js.UndefOr[Region]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  sealed trait InterconnectState extends js.Any
  object InterconnectState extends js.Object {
    val requested = "requested".asInstanceOf[InterconnectState]
    val pending   = "pending".asInstanceOf[InterconnectState]
    val available = "available".asInstanceOf[InterconnectState]
    val down      = "down".asInstanceOf[InterconnectState]
    val deleting  = "deleting".asInstanceOf[InterconnectState]
    val deleted   = "deleted".asInstanceOf[InterconnectState]
    val unknown   = "unknown".asInstanceOf[InterconnectState]

    val values = js.Object.freeze(js.Array(requested, pending, available, down, deleting, deleted, unknown))
  }

  @js.native
  @Factory
  trait Interconnects extends js.Object {
    var interconnects: js.UndefOr[InterconnectList]
  }

  /**
    * Information about a link aggregation group (LAG).
    */
  @js.native
  @Factory
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
    var providerName: js.UndefOr[ProviderName]
    var region: js.UndefOr[Region]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  sealed trait LagState extends js.Any
  object LagState extends js.Object {
    val requested = "requested".asInstanceOf[LagState]
    val pending   = "pending".asInstanceOf[LagState]
    val available = "available".asInstanceOf[LagState]
    val down      = "down".asInstanceOf[LagState]
    val deleting  = "deleting".asInstanceOf[LagState]
    val deleted   = "deleted".asInstanceOf[LagState]
    val unknown   = "unknown".asInstanceOf[LagState]

    val values = js.Object.freeze(js.Array(requested, pending, available, down, deleting, deleted, unknown))
  }

  @js.native
  @Factory
  trait Lags extends js.Object {
    var lags: js.UndefOr[LagList]
  }

  /**
    * Information about a Letter of Authorization - Connecting Facility Assignment (LOA-CFA) for a connection.
    */
  @js.native
  @Factory
  trait Loa extends js.Object {
    var loaContent: js.UndefOr[LoaContent]
    var loaContentType: js.UndefOr[LoaContentType]
  }

  @js.native
  sealed trait LoaContentType extends js.Any
  object LoaContentType extends js.Object {
    val `application/pdf` = "application/pdf".asInstanceOf[LoaContentType]

    val values = js.Object.freeze(js.Array(`application/pdf`))
  }

  /**
    * Information about an AWS Direct Connect location.
    */
  @js.native
  @Factory
  trait Location extends js.Object {
    var availablePortSpeeds: js.UndefOr[AvailablePortSpeeds]
    var availableProviders: js.UndefOr[ProviderList]
    var locationCode: js.UndefOr[LocationCode]
    var locationName: js.UndefOr[LocationName]
    var region: js.UndefOr[Region]
  }

  @js.native
  @Factory
  trait Locations extends js.Object {
    var locations: js.UndefOr[LocationList]
  }

  /**
    * Information about a new BGP peer.
    */
  @js.native
  @Factory
  trait NewBGPPeer extends js.Object {
    var addressFamily: js.UndefOr[AddressFamily]
    var amazonAddress: js.UndefOr[AmazonAddress]
    var asn: js.UndefOr[ASN]
    var authKey: js.UndefOr[BGPAuthKey]
    var customerAddress: js.UndefOr[CustomerAddress]
  }

  /**
    * Information about a private virtual interface.
    */
  @js.native
  @Factory
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

  /**
    * Information about a private virtual interface to be provisioned on a connection.
    */
  @js.native
  @Factory
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

  /**
    * Information about a public virtual interface.
    */
  @js.native
  @Factory
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

  /**
    * Information about a public virtual interface to be provisioned on a connection.
    */
  @js.native
  @Factory
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

  /**
    * Information about a transit virtual interface.
    */
  @js.native
  @Factory
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

  /**
    * Information about a transit virtual interface to be provisioned on a connection.
    */
  @js.native
  @Factory
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

  /**
    * Information about a tag associated with an AWS Direct Connect resource.
    */
  @js.native
  @Factory
  trait ResourceTag extends js.Object {
    var resourceArn: js.UndefOr[ResourceArn]
    var tags: js.UndefOr[TagList]
  }

  /**
    * Information about a route filter prefix that a customer can advertise through Border Gateway Protocol (BGP) over a public virtual interface.
    */
  @js.native
  @Factory
  trait RouteFilterPrefix extends js.Object {
    var cidr: js.UndefOr[CIDR]
  }

  /**
    * Information about a tag.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var key: TagKey
    var value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateDirectConnectGatewayAssociationRequest extends js.Object {
    var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList]
    var associationId: js.UndefOr[DirectConnectGatewayAssociationId]
    var removeAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList]
  }

  @js.native
  @Factory
  trait UpdateDirectConnectGatewayAssociationResult extends js.Object {
    var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation]
  }

  @js.native
  @Factory
  trait UpdateLagRequest extends js.Object {
    var lagId: LagId
    var lagName: js.UndefOr[LagName]
    var minimumLinks: js.UndefOr[Count]
  }

  @js.native
  @Factory
  trait UpdateVirtualInterfaceAttributesRequest extends js.Object {
    var virtualInterfaceId: VirtualInterfaceId
    var mtu: js.UndefOr[MTU]
  }

  /**
    * Information about a virtual private gateway for a private virtual interface.
    */
  @js.native
  @Factory
  trait VirtualGateway extends js.Object {
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
    var virtualGatewayState: js.UndefOr[VirtualGatewayState]
  }

  @js.native
  @Factory
  trait VirtualGateways extends js.Object {
    var virtualGateways: js.UndefOr[VirtualGatewayList]
  }

  /**
    * Information about a virtual interface.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait VirtualInterfaceState extends js.Any
  object VirtualInterfaceState extends js.Object {
    val confirming = "confirming".asInstanceOf[VirtualInterfaceState]
    val verifying  = "verifying".asInstanceOf[VirtualInterfaceState]
    val pending    = "pending".asInstanceOf[VirtualInterfaceState]
    val available  = "available".asInstanceOf[VirtualInterfaceState]
    val down       = "down".asInstanceOf[VirtualInterfaceState]
    val deleting   = "deleting".asInstanceOf[VirtualInterfaceState]
    val deleted    = "deleted".asInstanceOf[VirtualInterfaceState]
    val rejected   = "rejected".asInstanceOf[VirtualInterfaceState]
    val unknown    = "unknown".asInstanceOf[VirtualInterfaceState]

    val values =
      js.Object.freeze(js.Array(confirming, verifying, pending, available, down, deleting, deleted, rejected, unknown))
  }

  @js.native
  @Factory
  trait VirtualInterfaces extends js.Object {
    var virtualInterfaces: js.UndefOr[VirtualInterfaceList]
  }
}
