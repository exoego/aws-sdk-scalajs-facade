package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object directconnect {
  type ASN = Int
  type AddressFamily = String
  type AmazonAddress = String
  type AwsDevice = String
  type AwsDeviceV2 = String
  type BGPAuthKey = String
  type BGPPeerId = String
  type BGPPeerList = js.Array[BGPPeer]
  type BGPPeerState = String
  type BGPStatus = String
  type Bandwidth = String
  type BooleanFlag = Boolean
  type CIDR = String
  type ConnectionId = String
  type ConnectionList = js.Array[Connection]
  type ConnectionName = String
  type ConnectionState = String
  type Count = Int
  type CustomerAddress = String
  type DirectConnectGatewayAssociationList = js.Array[DirectConnectGatewayAssociation]
  type DirectConnectGatewayAssociationState = String
  type DirectConnectGatewayAttachmentList = js.Array[DirectConnectGatewayAttachment]
  type DirectConnectGatewayAttachmentState = String
  type DirectConnectGatewayId = String
  type DirectConnectGatewayList = js.Array[DirectConnectGateway]
  type DirectConnectGatewayName = String
  type DirectConnectGatewayState = String
  type HasLogicalRedundancy = String
  type InterconnectId = String
  type InterconnectList = js.Array[Interconnect]
  type InterconnectName = String
  type InterconnectState = String
  type JumboFrameCapable = Boolean
  type LagId = String
  type LagList = js.Array[Lag]
  type LagName = String
  type LagState = String
  type LoaContent = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type LoaContentType = String
  type LoaIssueTime = js.Date
  type LocationCode = String
  type LocationList = js.Array[Location]
  type LocationName = String
  type LongAsn = Double
  type MTU = Int
  type MaxResultSetSize = Int
  type OwnerAccount = String
  type PaginationToken = String
  type PartnerName = String
  type ProviderName = String
  type Region = String
  type ResourceArn = String
  type ResourceArnList = js.Array[ResourceArn]
  type ResourceTagList = js.Array[ResourceTag]
  type RouteFilterPrefixList = js.Array[RouteFilterPrefix]
  type RouterConfig = String
  type StateChangeError = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type VLAN = Int
  type VirtualGatewayId = String
  type VirtualGatewayList = js.Array[VirtualGateway]
  type VirtualGatewayRegion = String
  type VirtualGatewayState = String
  type VirtualInterfaceId = String
  type VirtualInterfaceList = js.Array[VirtualInterface]
  type VirtualInterfaceName = String
  type VirtualInterfaceRegion = String
  type VirtualInterfaceState = String
  type VirtualInterfaceType = String
}

package directconnect {
  @js.native
  @JSImport("aws-sdk", "DirectConnect")
  class DirectConnect(config: AWSConfig) extends js.Object {
    def allocateConnectionOnInterconnect(params: AllocateConnectionOnInterconnectRequest): Request[Connection] = js.native
    def allocateHostedConnection(params: AllocateHostedConnectionRequest): Request[Connection] = js.native
    def allocatePrivateVirtualInterface(params: AllocatePrivateVirtualInterfaceRequest): Request[VirtualInterface] = js.native
    def allocatePublicVirtualInterface(params: AllocatePublicVirtualInterfaceRequest): Request[VirtualInterface] = js.native
    def associateConnectionWithLag(params: AssociateConnectionWithLagRequest): Request[Connection] = js.native
    def associateHostedConnection(params: AssociateHostedConnectionRequest): Request[Connection] = js.native
    def associateVirtualInterface(params: AssociateVirtualInterfaceRequest): Request[VirtualInterface] = js.native
    def confirmConnection(params: ConfirmConnectionRequest): Request[ConfirmConnectionResponse] = js.native
    def confirmPrivateVirtualInterface(params: ConfirmPrivateVirtualInterfaceRequest): Request[ConfirmPrivateVirtualInterfaceResponse] = js.native
    def confirmPublicVirtualInterface(params: ConfirmPublicVirtualInterfaceRequest): Request[ConfirmPublicVirtualInterfaceResponse] = js.native
    def createBGPPeer(params: CreateBGPPeerRequest): Request[CreateBGPPeerResponse] = js.native
    def createConnection(params: CreateConnectionRequest): Request[Connection] = js.native
    def createDirectConnectGateway(params: CreateDirectConnectGatewayRequest): Request[CreateDirectConnectGatewayResult] = js.native
    def createDirectConnectGatewayAssociation(params: CreateDirectConnectGatewayAssociationRequest): Request[CreateDirectConnectGatewayAssociationResult] = js.native
    def createInterconnect(params: CreateInterconnectRequest): Request[Interconnect] = js.native
    def createLag(params: CreateLagRequest): Request[Lag] = js.native
    def createPrivateVirtualInterface(params: CreatePrivateVirtualInterfaceRequest): Request[VirtualInterface] = js.native
    def createPublicVirtualInterface(params: CreatePublicVirtualInterfaceRequest): Request[VirtualInterface] = js.native
    def deleteBGPPeer(params: DeleteBGPPeerRequest): Request[DeleteBGPPeerResponse] = js.native
    def deleteConnection(params: DeleteConnectionRequest): Request[Connection] = js.native
    def deleteDirectConnectGateway(params: DeleteDirectConnectGatewayRequest): Request[DeleteDirectConnectGatewayResult] = js.native
    def deleteDirectConnectGatewayAssociation(params: DeleteDirectConnectGatewayAssociationRequest): Request[DeleteDirectConnectGatewayAssociationResult] = js.native
    def deleteInterconnect(params: DeleteInterconnectRequest): Request[DeleteInterconnectResponse] = js.native
    def deleteLag(params: DeleteLagRequest): Request[Lag] = js.native
    def deleteVirtualInterface(params: DeleteVirtualInterfaceRequest): Request[DeleteVirtualInterfaceResponse] = js.native
    def describeConnectionLoa(params: DescribeConnectionLoaRequest): Request[DescribeConnectionLoaResponse] = js.native
    def describeConnections(params: DescribeConnectionsRequest): Request[Connections] = js.native
    def describeConnectionsOnInterconnect(params: DescribeConnectionsOnInterconnectRequest): Request[Connections] = js.native
    def describeDirectConnectGatewayAssociations(params: DescribeDirectConnectGatewayAssociationsRequest): Request[DescribeDirectConnectGatewayAssociationsResult] = js.native
    def describeDirectConnectGatewayAttachments(params: DescribeDirectConnectGatewayAttachmentsRequest): Request[DescribeDirectConnectGatewayAttachmentsResult] = js.native
    def describeDirectConnectGateways(params: DescribeDirectConnectGatewaysRequest): Request[DescribeDirectConnectGatewaysResult] = js.native
    def describeHostedConnections(params: DescribeHostedConnectionsRequest): Request[Connections] = js.native
    def describeInterconnectLoa(params: DescribeInterconnectLoaRequest): Request[DescribeInterconnectLoaResponse] = js.native
    def describeInterconnects(params: DescribeInterconnectsRequest): Request[Interconnects] = js.native
    def describeLags(params: DescribeLagsRequest): Request[Lags] = js.native
    def describeLoa(params: DescribeLoaRequest): Request[Loa] = js.native
    def describeLocations(): Request[Locations] = js.native
    def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResponse] = js.native
    def describeVirtualGateways(): Request[VirtualGateways] = js.native
    def describeVirtualInterfaces(params: DescribeVirtualInterfacesRequest): Request[VirtualInterfaces] = js.native
    def disassociateConnectionFromLag(params: DisassociateConnectionFromLagRequest): Request[Connection] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateLag(params: UpdateLagRequest): Request[Lag] = js.native
    def updateVirtualInterfaceAttributes(params: UpdateVirtualInterfaceAttributesRequest): Request[VirtualInterface] = js.native
  }

  object AddressFamilyEnum {
    val ipv4 = "ipv4"
    val ipv6 = "ipv6"

    val values = IndexedSeq(ipv4, ipv6)
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
    def apply(
      bandwidth: Bandwidth,
      connectionName: ConnectionName,
      interconnectId: InterconnectId,
      ownerAccount: OwnerAccount,
      vlan: VLAN): AllocateConnectionOnInterconnectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bandwidth" -> bandwidth.asInstanceOf[js.Any],
        "connectionName" -> connectionName.asInstanceOf[js.Any],
        "interconnectId" -> interconnectId.asInstanceOf[js.Any],
        "ownerAccount" -> ownerAccount.asInstanceOf[js.Any],
        "vlan" -> vlan.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocateConnectionOnInterconnectRequest]
    }
  }

  @js.native
  trait AllocateHostedConnectionRequest extends js.Object {
    var bandwidth: Bandwidth
    var connectionId: ConnectionId
    var connectionName: ConnectionName
    var ownerAccount: OwnerAccount
    var vlan: VLAN
  }

  object AllocateHostedConnectionRequest {
    def apply(
      bandwidth: Bandwidth,
      connectionId: ConnectionId,
      connectionName: ConnectionName,
      ownerAccount: OwnerAccount,
      vlan: VLAN): AllocateHostedConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bandwidth" -> bandwidth.asInstanceOf[js.Any],
        "connectionId" -> connectionId.asInstanceOf[js.Any],
        "connectionName" -> connectionName.asInstanceOf[js.Any],
        "ownerAccount" -> ownerAccount.asInstanceOf[js.Any],
        "vlan" -> vlan.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocateHostedConnectionRequest]
    }
  }

  @js.native
  trait AllocatePrivateVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var newPrivateVirtualInterfaceAllocation: NewPrivateVirtualInterfaceAllocation
    var ownerAccount: OwnerAccount
  }

  object AllocatePrivateVirtualInterfaceRequest {
    def apply(
      connectionId: ConnectionId,
      newPrivateVirtualInterfaceAllocation: NewPrivateVirtualInterfaceAllocation,
      ownerAccount: OwnerAccount): AllocatePrivateVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.asInstanceOf[js.Any],
        "newPrivateVirtualInterfaceAllocation" -> newPrivateVirtualInterfaceAllocation.asInstanceOf[js.Any],
        "ownerAccount" -> ownerAccount.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocatePrivateVirtualInterfaceRequest]
    }
  }

  @js.native
  trait AllocatePublicVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var newPublicVirtualInterfaceAllocation: NewPublicVirtualInterfaceAllocation
    var ownerAccount: OwnerAccount
  }

  object AllocatePublicVirtualInterfaceRequest {
    def apply(
      connectionId: ConnectionId,
      newPublicVirtualInterfaceAllocation: NewPublicVirtualInterfaceAllocation,
      ownerAccount: OwnerAccount): AllocatePublicVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.asInstanceOf[js.Any],
        "newPublicVirtualInterfaceAllocation" -> newPublicVirtualInterfaceAllocation.asInstanceOf[js.Any],
        "ownerAccount" -> ownerAccount.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocatePublicVirtualInterfaceRequest]
    }
  }

  @js.native
  trait AssociateConnectionWithLagRequest extends js.Object {
    var connectionId: ConnectionId
    var lagId: LagId
  }

  object AssociateConnectionWithLagRequest {
    def apply(
      connectionId: ConnectionId,
      lagId: LagId): AssociateConnectionWithLagRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.asInstanceOf[js.Any],
        "lagId" -> lagId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateConnectionWithLagRequest]
    }
  }

  @js.native
  trait AssociateHostedConnectionRequest extends js.Object {
    var connectionId: ConnectionId
    var parentConnectionId: ConnectionId
  }

  object AssociateHostedConnectionRequest {
    def apply(
      connectionId: ConnectionId,
      parentConnectionId: ConnectionId): AssociateHostedConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.asInstanceOf[js.Any],
        "parentConnectionId" -> parentConnectionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateHostedConnectionRequest]
    }
  }

  @js.native
  trait AssociateVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var virtualInterfaceId: VirtualInterfaceId
  }

  object AssociateVirtualInterfaceRequest {
    def apply(
      connectionId: ConnectionId,
      virtualInterfaceId: VirtualInterfaceId): AssociateVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.asInstanceOf[js.Any],
        "virtualInterfaceId" -> virtualInterfaceId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateVirtualInterfaceRequest]
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
    def apply(
      addressFamily: js.UndefOr[AddressFamily] = js.undefined,
      amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
      asn: js.UndefOr[ASN] = js.undefined,
      authKey: js.UndefOr[BGPAuthKey] = js.undefined,
      awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined,
      bgpPeerId: js.UndefOr[BGPPeerId] = js.undefined,
      bgpPeerState: js.UndefOr[BGPPeerState] = js.undefined,
      bgpStatus: js.UndefOr[BGPStatus] = js.undefined,
      customerAddress: js.UndefOr[CustomerAddress] = js.undefined): BGPPeer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "addressFamily" -> addressFamily.map { x => x.asInstanceOf[js.Any] },
        "amazonAddress" -> amazonAddress.map { x => x.asInstanceOf[js.Any] },
        "asn" -> asn.map { x => x.asInstanceOf[js.Any] },
        "authKey" -> authKey.map { x => x.asInstanceOf[js.Any] },
        "awsDeviceV2" -> awsDeviceV2.map { x => x.asInstanceOf[js.Any] },
        "bgpPeerId" -> bgpPeerId.map { x => x.asInstanceOf[js.Any] },
        "bgpPeerState" -> bgpPeerState.map { x => x.asInstanceOf[js.Any] },
        "bgpStatus" -> bgpStatus.map { x => x.asInstanceOf[js.Any] },
        "customerAddress" -> customerAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BGPPeer]
    }
  }

  object BGPPeerStateEnum {
    val verifying = "verifying"
    val pending = "pending"
    val available = "available"
    val deleting = "deleting"
    val deleted = "deleted"

    val values = IndexedSeq(verifying, pending, available, deleting, deleted)
  }

  object BGPStatusEnum {
    val up = "up"
    val down = "down"

    val values = IndexedSeq(up, down)
  }

  @js.native
  trait ConfirmConnectionRequest extends js.Object {
    var connectionId: ConnectionId
  }

  object ConfirmConnectionRequest {
    def apply(
      connectionId: ConnectionId): ConfirmConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmConnectionRequest]
    }
  }

  @js.native
  trait ConfirmConnectionResponse extends js.Object {
    var connectionState: js.UndefOr[ConnectionState]
  }

  object ConfirmConnectionResponse {
    def apply(
      connectionState: js.UndefOr[ConnectionState] = js.undefined): ConfirmConnectionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionState" -> connectionState.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmConnectionResponse]
    }
  }

  @js.native
  trait ConfirmPrivateVirtualInterfaceRequest extends js.Object {
    var virtualInterfaceId: VirtualInterfaceId
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
  }

  object ConfirmPrivateVirtualInterfaceRequest {
    def apply(
      virtualInterfaceId: VirtualInterfaceId,
      directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
      virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined): ConfirmPrivateVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualInterfaceId" -> virtualInterfaceId.asInstanceOf[js.Any],
        "directConnectGatewayId" -> directConnectGatewayId.map { x => x.asInstanceOf[js.Any] },
        "virtualGatewayId" -> virtualGatewayId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmPrivateVirtualInterfaceRequest]
    }
  }

  @js.native
  trait ConfirmPrivateVirtualInterfaceResponse extends js.Object {
    var virtualInterfaceState: js.UndefOr[VirtualInterfaceState]
  }

  object ConfirmPrivateVirtualInterfaceResponse {
    def apply(
      virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.undefined): ConfirmPrivateVirtualInterfaceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualInterfaceState" -> virtualInterfaceState.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmPrivateVirtualInterfaceResponse]
    }
  }

  @js.native
  trait ConfirmPublicVirtualInterfaceRequest extends js.Object {
    var virtualInterfaceId: VirtualInterfaceId
  }

  object ConfirmPublicVirtualInterfaceRequest {
    def apply(
      virtualInterfaceId: VirtualInterfaceId): ConfirmPublicVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualInterfaceId" -> virtualInterfaceId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmPublicVirtualInterfaceRequest]
    }
  }

  @js.native
  trait ConfirmPublicVirtualInterfaceResponse extends js.Object {
    var virtualInterfaceState: js.UndefOr[VirtualInterfaceState]
  }

  object ConfirmPublicVirtualInterfaceResponse {
    def apply(
      virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.undefined): ConfirmPublicVirtualInterfaceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualInterfaceState" -> virtualInterfaceState.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmPublicVirtualInterfaceResponse]
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
    var vlan: js.UndefOr[VLAN]
  }

  object Connection {
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
      vlan: js.UndefOr[VLAN] = js.undefined): Connection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "awsDevice" -> awsDevice.map { x => x.asInstanceOf[js.Any] },
        "awsDeviceV2" -> awsDeviceV2.map { x => x.asInstanceOf[js.Any] },
        "bandwidth" -> bandwidth.map { x => x.asInstanceOf[js.Any] },
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] },
        "connectionName" -> connectionName.map { x => x.asInstanceOf[js.Any] },
        "connectionState" -> connectionState.map { x => x.asInstanceOf[js.Any] },
        "hasLogicalRedundancy" -> hasLogicalRedundancy.map { x => x.asInstanceOf[js.Any] },
        "jumboFrameCapable" -> jumboFrameCapable.map { x => x.asInstanceOf[js.Any] },
        "lagId" -> lagId.map { x => x.asInstanceOf[js.Any] },
        "loaIssueTime" -> loaIssueTime.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "ownerAccount" -> ownerAccount.map { x => x.asInstanceOf[js.Any] },
        "partnerName" -> partnerName.map { x => x.asInstanceOf[js.Any] },
        "region" -> region.map { x => x.asInstanceOf[js.Any] },
        "vlan" -> vlan.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Connection]
    }
  }

  object ConnectionStateEnum {
    val ordering = "ordering"
    val requested = "requested"
    val pending = "pending"
    val available = "available"
    val down = "down"
    val deleting = "deleting"
    val deleted = "deleted"
    val rejected = "rejected"

    val values = IndexedSeq(ordering, requested, pending, available, down, deleting, deleted, rejected)
  }

  @js.native
  trait Connections extends js.Object {
    var connections: js.UndefOr[ConnectionList]
  }

  object Connections {
    def apply(
      connections: js.UndefOr[ConnectionList] = js.undefined): Connections = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connections" -> connections.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Connections]
    }
  }

  @js.native
  trait CreateBGPPeerRequest extends js.Object {
    var newBGPPeer: js.UndefOr[NewBGPPeer]
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
  }

  object CreateBGPPeerRequest {
    def apply(
      newBGPPeer: js.UndefOr[NewBGPPeer] = js.undefined,
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined): CreateBGPPeerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "newBGPPeer" -> newBGPPeer.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceId" -> virtualInterfaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBGPPeerRequest]
    }
  }

  @js.native
  trait CreateBGPPeerResponse extends js.Object {
    var virtualInterface: js.UndefOr[VirtualInterface]
  }

  object CreateBGPPeerResponse {
    def apply(
      virtualInterface: js.UndefOr[VirtualInterface] = js.undefined): CreateBGPPeerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualInterface" -> virtualInterface.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBGPPeerResponse]
    }
  }

  @js.native
  trait CreateConnectionRequest extends js.Object {
    var bandwidth: Bandwidth
    var connectionName: ConnectionName
    var location: LocationCode
    var lagId: js.UndefOr[LagId]
  }

  object CreateConnectionRequest {
    def apply(
      bandwidth: Bandwidth,
      connectionName: ConnectionName,
      location: LocationCode,
      lagId: js.UndefOr[LagId] = js.undefined): CreateConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bandwidth" -> bandwidth.asInstanceOf[js.Any],
        "connectionName" -> connectionName.asInstanceOf[js.Any],
        "location" -> location.asInstanceOf[js.Any],
        "lagId" -> lagId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConnectionRequest]
    }
  }

  @js.native
  trait CreateDirectConnectGatewayAssociationRequest extends js.Object {
    var directConnectGatewayId: DirectConnectGatewayId
    var virtualGatewayId: VirtualGatewayId
  }

  object CreateDirectConnectGatewayAssociationRequest {
    def apply(
      directConnectGatewayId: DirectConnectGatewayId,
      virtualGatewayId: VirtualGatewayId): CreateDirectConnectGatewayAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGatewayId" -> directConnectGatewayId.asInstanceOf[js.Any],
        "virtualGatewayId" -> virtualGatewayId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDirectConnectGatewayAssociationRequest]
    }
  }

  @js.native
  trait CreateDirectConnectGatewayAssociationResult extends js.Object {
    var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation]
  }

  object CreateDirectConnectGatewayAssociationResult {
    def apply(
      directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.undefined): CreateDirectConnectGatewayAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGatewayAssociation" -> directConnectGatewayAssociation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDirectConnectGatewayAssociationResult]
    }
  }

  @js.native
  trait CreateDirectConnectGatewayRequest extends js.Object {
    var directConnectGatewayName: DirectConnectGatewayName
    var amazonSideAsn: js.UndefOr[LongAsn]
  }

  object CreateDirectConnectGatewayRequest {
    def apply(
      directConnectGatewayName: DirectConnectGatewayName,
      amazonSideAsn: js.UndefOr[LongAsn] = js.undefined): CreateDirectConnectGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGatewayName" -> directConnectGatewayName.asInstanceOf[js.Any],
        "amazonSideAsn" -> amazonSideAsn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDirectConnectGatewayRequest]
    }
  }

  @js.native
  trait CreateDirectConnectGatewayResult extends js.Object {
    var directConnectGateway: js.UndefOr[DirectConnectGateway]
  }

  object CreateDirectConnectGatewayResult {
    def apply(
      directConnectGateway: js.UndefOr[DirectConnectGateway] = js.undefined): CreateDirectConnectGatewayResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGateway" -> directConnectGateway.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDirectConnectGatewayResult]
    }
  }

  @js.native
  trait CreateInterconnectRequest extends js.Object {
    var bandwidth: Bandwidth
    var interconnectName: InterconnectName
    var location: LocationCode
    var lagId: js.UndefOr[LagId]
  }

  object CreateInterconnectRequest {
    def apply(
      bandwidth: Bandwidth,
      interconnectName: InterconnectName,
      location: LocationCode,
      lagId: js.UndefOr[LagId] = js.undefined): CreateInterconnectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bandwidth" -> bandwidth.asInstanceOf[js.Any],
        "interconnectName" -> interconnectName.asInstanceOf[js.Any],
        "location" -> location.asInstanceOf[js.Any],
        "lagId" -> lagId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInterconnectRequest]
    }
  }

  @js.native
  trait CreateLagRequest extends js.Object {
    var connectionsBandwidth: Bandwidth
    var lagName: LagName
    var location: LocationCode
    var numberOfConnections: Count
    var connectionId: js.UndefOr[ConnectionId]
  }

  object CreateLagRequest {
    def apply(
      connectionsBandwidth: Bandwidth,
      lagName: LagName,
      location: LocationCode,
      numberOfConnections: Count,
      connectionId: js.UndefOr[ConnectionId] = js.undefined): CreateLagRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionsBandwidth" -> connectionsBandwidth.asInstanceOf[js.Any],
        "lagName" -> lagName.asInstanceOf[js.Any],
        "location" -> location.asInstanceOf[js.Any],
        "numberOfConnections" -> numberOfConnections.asInstanceOf[js.Any],
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLagRequest]
    }
  }

  @js.native
  trait CreatePrivateVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var newPrivateVirtualInterface: NewPrivateVirtualInterface
  }

  object CreatePrivateVirtualInterfaceRequest {
    def apply(
      connectionId: ConnectionId,
      newPrivateVirtualInterface: NewPrivateVirtualInterface): CreatePrivateVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.asInstanceOf[js.Any],
        "newPrivateVirtualInterface" -> newPrivateVirtualInterface.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePrivateVirtualInterfaceRequest]
    }
  }

  @js.native
  trait CreatePublicVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var newPublicVirtualInterface: NewPublicVirtualInterface
  }

  object CreatePublicVirtualInterfaceRequest {
    def apply(
      connectionId: ConnectionId,
      newPublicVirtualInterface: NewPublicVirtualInterface): CreatePublicVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.asInstanceOf[js.Any],
        "newPublicVirtualInterface" -> newPublicVirtualInterface.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePublicVirtualInterfaceRequest]
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
    def apply(
      asn: js.UndefOr[ASN] = js.undefined,
      bgpPeerId: js.UndefOr[BGPPeerId] = js.undefined,
      customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined): DeleteBGPPeerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "asn" -> asn.map { x => x.asInstanceOf[js.Any] },
        "bgpPeerId" -> bgpPeerId.map { x => x.asInstanceOf[js.Any] },
        "customerAddress" -> customerAddress.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceId" -> virtualInterfaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBGPPeerRequest]
    }
  }

  @js.native
  trait DeleteBGPPeerResponse extends js.Object {
    var virtualInterface: js.UndefOr[VirtualInterface]
  }

  object DeleteBGPPeerResponse {
    def apply(
      virtualInterface: js.UndefOr[VirtualInterface] = js.undefined): DeleteBGPPeerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualInterface" -> virtualInterface.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBGPPeerResponse]
    }
  }

  @js.native
  trait DeleteConnectionRequest extends js.Object {
    var connectionId: ConnectionId
  }

  object DeleteConnectionRequest {
    def apply(
      connectionId: ConnectionId): DeleteConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConnectionRequest]
    }
  }

  @js.native
  trait DeleteDirectConnectGatewayAssociationRequest extends js.Object {
    var directConnectGatewayId: DirectConnectGatewayId
    var virtualGatewayId: VirtualGatewayId
  }

  object DeleteDirectConnectGatewayAssociationRequest {
    def apply(
      directConnectGatewayId: DirectConnectGatewayId,
      virtualGatewayId: VirtualGatewayId): DeleteDirectConnectGatewayAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGatewayId" -> directConnectGatewayId.asInstanceOf[js.Any],
        "virtualGatewayId" -> virtualGatewayId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDirectConnectGatewayAssociationRequest]
    }
  }

  @js.native
  trait DeleteDirectConnectGatewayAssociationResult extends js.Object {
    var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation]
  }

  object DeleteDirectConnectGatewayAssociationResult {
    def apply(
      directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.undefined): DeleteDirectConnectGatewayAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGatewayAssociation" -> directConnectGatewayAssociation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDirectConnectGatewayAssociationResult]
    }
  }

  @js.native
  trait DeleteDirectConnectGatewayRequest extends js.Object {
    var directConnectGatewayId: DirectConnectGatewayId
  }

  object DeleteDirectConnectGatewayRequest {
    def apply(
      directConnectGatewayId: DirectConnectGatewayId): DeleteDirectConnectGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGatewayId" -> directConnectGatewayId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDirectConnectGatewayRequest]
    }
  }

  @js.native
  trait DeleteDirectConnectGatewayResult extends js.Object {
    var directConnectGateway: js.UndefOr[DirectConnectGateway]
  }

  object DeleteDirectConnectGatewayResult {
    def apply(
      directConnectGateway: js.UndefOr[DirectConnectGateway] = js.undefined): DeleteDirectConnectGatewayResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGateway" -> directConnectGateway.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDirectConnectGatewayResult]
    }
  }

  @js.native
  trait DeleteInterconnectRequest extends js.Object {
    var interconnectId: InterconnectId
  }

  object DeleteInterconnectRequest {
    def apply(
      interconnectId: InterconnectId): DeleteInterconnectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "interconnectId" -> interconnectId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInterconnectRequest]
    }
  }

  @js.native
  trait DeleteInterconnectResponse extends js.Object {
    var interconnectState: js.UndefOr[InterconnectState]
  }

  object DeleteInterconnectResponse {
    def apply(
      interconnectState: js.UndefOr[InterconnectState] = js.undefined): DeleteInterconnectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "interconnectState" -> interconnectState.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInterconnectResponse]
    }
  }

  @js.native
  trait DeleteLagRequest extends js.Object {
    var lagId: LagId
  }

  object DeleteLagRequest {
    def apply(
      lagId: LagId): DeleteLagRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lagId" -> lagId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLagRequest]
    }
  }

  @js.native
  trait DeleteVirtualInterfaceRequest extends js.Object {
    var virtualInterfaceId: VirtualInterfaceId
  }

  object DeleteVirtualInterfaceRequest {
    def apply(
      virtualInterfaceId: VirtualInterfaceId): DeleteVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualInterfaceId" -> virtualInterfaceId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVirtualInterfaceRequest]
    }
  }

  @js.native
  trait DeleteVirtualInterfaceResponse extends js.Object {
    var virtualInterfaceState: js.UndefOr[VirtualInterfaceState]
  }

  object DeleteVirtualInterfaceResponse {
    def apply(
      virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.undefined): DeleteVirtualInterfaceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualInterfaceState" -> virtualInterfaceState.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVirtualInterfaceResponse]
    }
  }

  @js.native
  trait DescribeConnectionLoaRequest extends js.Object {
    var connectionId: ConnectionId
    var loaContentType: js.UndefOr[LoaContentType]
    var providerName: js.UndefOr[ProviderName]
  }

  object DescribeConnectionLoaRequest {
    def apply(
      connectionId: ConnectionId,
      loaContentType: js.UndefOr[LoaContentType] = js.undefined,
      providerName: js.UndefOr[ProviderName] = js.undefined): DescribeConnectionLoaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.asInstanceOf[js.Any],
        "loaContentType" -> loaContentType.map { x => x.asInstanceOf[js.Any] },
        "providerName" -> providerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConnectionLoaRequest]
    }
  }

  @js.native
  trait DescribeConnectionLoaResponse extends js.Object {
    var loa: js.UndefOr[Loa]
  }

  object DescribeConnectionLoaResponse {
    def apply(
      loa: js.UndefOr[Loa] = js.undefined): DescribeConnectionLoaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loa" -> loa.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConnectionLoaResponse]
    }
  }

  @js.native
  trait DescribeConnectionsOnInterconnectRequest extends js.Object {
    var interconnectId: InterconnectId
  }

  object DescribeConnectionsOnInterconnectRequest {
    def apply(
      interconnectId: InterconnectId): DescribeConnectionsOnInterconnectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "interconnectId" -> interconnectId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConnectionsOnInterconnectRequest]
    }
  }

  @js.native
  trait DescribeConnectionsRequest extends js.Object {
    var connectionId: js.UndefOr[ConnectionId]
  }

  object DescribeConnectionsRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined): DescribeConnectionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConnectionsRequest]
    }
  }

  @js.native
  trait DescribeDirectConnectGatewayAssociationsRequest extends js.Object {
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var maxResults: js.UndefOr[MaxResultSetSize]
    var nextToken: js.UndefOr[PaginationToken]
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
  }

  object DescribeDirectConnectGatewayAssociationsRequest {
    def apply(
      directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
      maxResults: js.UndefOr[MaxResultSetSize] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined): DescribeDirectConnectGatewayAssociationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGatewayId" -> directConnectGatewayId.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "virtualGatewayId" -> virtualGatewayId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDirectConnectGatewayAssociationsRequest]
    }
  }

  @js.native
  trait DescribeDirectConnectGatewayAssociationsResult extends js.Object {
    var directConnectGatewayAssociations: js.UndefOr[DirectConnectGatewayAssociationList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeDirectConnectGatewayAssociationsResult {
    def apply(
      directConnectGatewayAssociations: js.UndefOr[DirectConnectGatewayAssociationList] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): DescribeDirectConnectGatewayAssociationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGatewayAssociations" -> directConnectGatewayAssociations.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDirectConnectGatewayAssociationsResult]
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
    def apply(
      directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
      maxResults: js.UndefOr[MaxResultSetSize] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined): DescribeDirectConnectGatewayAttachmentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGatewayId" -> directConnectGatewayId.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceId" -> virtualInterfaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDirectConnectGatewayAttachmentsRequest]
    }
  }

  @js.native
  trait DescribeDirectConnectGatewayAttachmentsResult extends js.Object {
    var directConnectGatewayAttachments: js.UndefOr[DirectConnectGatewayAttachmentList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeDirectConnectGatewayAttachmentsResult {
    def apply(
      directConnectGatewayAttachments: js.UndefOr[DirectConnectGatewayAttachmentList] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): DescribeDirectConnectGatewayAttachmentsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGatewayAttachments" -> directConnectGatewayAttachments.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDirectConnectGatewayAttachmentsResult]
    }
  }

  @js.native
  trait DescribeDirectConnectGatewaysRequest extends js.Object {
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var maxResults: js.UndefOr[MaxResultSetSize]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeDirectConnectGatewaysRequest {
    def apply(
      directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
      maxResults: js.UndefOr[MaxResultSetSize] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): DescribeDirectConnectGatewaysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGatewayId" -> directConnectGatewayId.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDirectConnectGatewaysRequest]
    }
  }

  @js.native
  trait DescribeDirectConnectGatewaysResult extends js.Object {
    var directConnectGateways: js.UndefOr[DirectConnectGatewayList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeDirectConnectGatewaysResult {
    def apply(
      directConnectGateways: js.UndefOr[DirectConnectGatewayList] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): DescribeDirectConnectGatewaysResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGateways" -> directConnectGateways.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDirectConnectGatewaysResult]
    }
  }

  @js.native
  trait DescribeHostedConnectionsRequest extends js.Object {
    var connectionId: ConnectionId
  }

  object DescribeHostedConnectionsRequest {
    def apply(
      connectionId: ConnectionId): DescribeHostedConnectionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHostedConnectionsRequest]
    }
  }

  @js.native
  trait DescribeInterconnectLoaRequest extends js.Object {
    var interconnectId: InterconnectId
    var loaContentType: js.UndefOr[LoaContentType]
    var providerName: js.UndefOr[ProviderName]
  }

  object DescribeInterconnectLoaRequest {
    def apply(
      interconnectId: InterconnectId,
      loaContentType: js.UndefOr[LoaContentType] = js.undefined,
      providerName: js.UndefOr[ProviderName] = js.undefined): DescribeInterconnectLoaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "interconnectId" -> interconnectId.asInstanceOf[js.Any],
        "loaContentType" -> loaContentType.map { x => x.asInstanceOf[js.Any] },
        "providerName" -> providerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInterconnectLoaRequest]
    }
  }

  @js.native
  trait DescribeInterconnectLoaResponse extends js.Object {
    var loa: js.UndefOr[Loa]
  }

  object DescribeInterconnectLoaResponse {
    def apply(
      loa: js.UndefOr[Loa] = js.undefined): DescribeInterconnectLoaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loa" -> loa.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInterconnectLoaResponse]
    }
  }

  @js.native
  trait DescribeInterconnectsRequest extends js.Object {
    var interconnectId: js.UndefOr[InterconnectId]
  }

  object DescribeInterconnectsRequest {
    def apply(
      interconnectId: js.UndefOr[InterconnectId] = js.undefined): DescribeInterconnectsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "interconnectId" -> interconnectId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInterconnectsRequest]
    }
  }

  @js.native
  trait DescribeLagsRequest extends js.Object {
    var lagId: js.UndefOr[LagId]
  }

  object DescribeLagsRequest {
    def apply(
      lagId: js.UndefOr[LagId] = js.undefined): DescribeLagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lagId" -> lagId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLagsRequest]
    }
  }

  @js.native
  trait DescribeLoaRequest extends js.Object {
    var connectionId: ConnectionId
    var loaContentType: js.UndefOr[LoaContentType]
    var providerName: js.UndefOr[ProviderName]
  }

  object DescribeLoaRequest {
    def apply(
      connectionId: ConnectionId,
      loaContentType: js.UndefOr[LoaContentType] = js.undefined,
      providerName: js.UndefOr[ProviderName] = js.undefined): DescribeLoaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.asInstanceOf[js.Any],
        "loaContentType" -> loaContentType.map { x => x.asInstanceOf[js.Any] },
        "providerName" -> providerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoaRequest]
    }
  }

  @js.native
  trait DescribeTagsRequest extends js.Object {
    var resourceArns: ResourceArnList
  }

  object DescribeTagsRequest {
    def apply(
      resourceArns: ResourceArnList): DescribeTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArns" -> resourceArns.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsRequest]
    }
  }

  @js.native
  trait DescribeTagsResponse extends js.Object {
    var resourceTags: js.UndefOr[ResourceTagList]
  }

  object DescribeTagsResponse {
    def apply(
      resourceTags: js.UndefOr[ResourceTagList] = js.undefined): DescribeTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceTags" -> resourceTags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsResponse]
    }
  }

  @js.native
  trait DescribeVirtualInterfacesRequest extends js.Object {
    var connectionId: js.UndefOr[ConnectionId]
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
  }

  object DescribeVirtualInterfacesRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined): DescribeVirtualInterfacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceId" -> virtualInterfaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVirtualInterfacesRequest]
    }
  }

  /**
   * Information about a Direct Connect gateway, which enables you to connect virtual interfaces and virtual private gateways.
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
    def apply(
      amazonSideAsn: js.UndefOr[LongAsn] = js.undefined,
      directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
      directConnectGatewayName: js.UndefOr[DirectConnectGatewayName] = js.undefined,
      directConnectGatewayState: js.UndefOr[DirectConnectGatewayState] = js.undefined,
      ownerAccount: js.UndefOr[OwnerAccount] = js.undefined,
      stateChangeError: js.UndefOr[StateChangeError] = js.undefined): DirectConnectGateway = {
      val _fields = IndexedSeq[(String, js.Any)](
        "amazonSideAsn" -> amazonSideAsn.map { x => x.asInstanceOf[js.Any] },
        "directConnectGatewayId" -> directConnectGatewayId.map { x => x.asInstanceOf[js.Any] },
        "directConnectGatewayName" -> directConnectGatewayName.map { x => x.asInstanceOf[js.Any] },
        "directConnectGatewayState" -> directConnectGatewayState.map { x => x.asInstanceOf[js.Any] },
        "ownerAccount" -> ownerAccount.map { x => x.asInstanceOf[js.Any] },
        "stateChangeError" -> stateChangeError.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DirectConnectGateway]
    }
  }

  /**
   * Information about an association between a Direct Connect gateway and a virtual private gateway.
   */
  @js.native
  trait DirectConnectGatewayAssociation extends js.Object {
    var associationState: js.UndefOr[DirectConnectGatewayAssociationState]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var stateChangeError: js.UndefOr[StateChangeError]
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
    var virtualGatewayOwnerAccount: js.UndefOr[OwnerAccount]
    var virtualGatewayRegion: js.UndefOr[VirtualGatewayRegion]
  }

  object DirectConnectGatewayAssociation {
    def apply(
      associationState: js.UndefOr[DirectConnectGatewayAssociationState] = js.undefined,
      directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
      stateChangeError: js.UndefOr[StateChangeError] = js.undefined,
      virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined,
      virtualGatewayOwnerAccount: js.UndefOr[OwnerAccount] = js.undefined,
      virtualGatewayRegion: js.UndefOr[VirtualGatewayRegion] = js.undefined): DirectConnectGatewayAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "associationState" -> associationState.map { x => x.asInstanceOf[js.Any] },
        "directConnectGatewayId" -> directConnectGatewayId.map { x => x.asInstanceOf[js.Any] },
        "stateChangeError" -> stateChangeError.map { x => x.asInstanceOf[js.Any] },
        "virtualGatewayId" -> virtualGatewayId.map { x => x.asInstanceOf[js.Any] },
        "virtualGatewayOwnerAccount" -> virtualGatewayOwnerAccount.map { x => x.asInstanceOf[js.Any] },
        "virtualGatewayRegion" -> virtualGatewayRegion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DirectConnectGatewayAssociation]
    }
  }

  object DirectConnectGatewayAssociationStateEnum {
    val associating = "associating"
    val associated = "associated"
    val disassociating = "disassociating"
    val disassociated = "disassociated"

    val values = IndexedSeq(associating, associated, disassociating, disassociated)
  }

  /**
   * Information about an attachment between a Direct Connect gateway and a virtual interface.
   */
  @js.native
  trait DirectConnectGatewayAttachment extends js.Object {
    var attachmentState: js.UndefOr[DirectConnectGatewayAttachmentState]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var stateChangeError: js.UndefOr[StateChangeError]
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
    var virtualInterfaceOwnerAccount: js.UndefOr[OwnerAccount]
    var virtualInterfaceRegion: js.UndefOr[VirtualInterfaceRegion]
  }

  object DirectConnectGatewayAttachment {
    def apply(
      attachmentState: js.UndefOr[DirectConnectGatewayAttachmentState] = js.undefined,
      directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
      stateChangeError: js.UndefOr[StateChangeError] = js.undefined,
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined,
      virtualInterfaceOwnerAccount: js.UndefOr[OwnerAccount] = js.undefined,
      virtualInterfaceRegion: js.UndefOr[VirtualInterfaceRegion] = js.undefined): DirectConnectGatewayAttachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attachmentState" -> attachmentState.map { x => x.asInstanceOf[js.Any] },
        "directConnectGatewayId" -> directConnectGatewayId.map { x => x.asInstanceOf[js.Any] },
        "stateChangeError" -> stateChangeError.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceId" -> virtualInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceOwnerAccount" -> virtualInterfaceOwnerAccount.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceRegion" -> virtualInterfaceRegion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DirectConnectGatewayAttachment]
    }
  }

  object DirectConnectGatewayAttachmentStateEnum {
    val attaching = "attaching"
    val attached = "attached"
    val detaching = "detaching"
    val detached = "detached"

    val values = IndexedSeq(attaching, attached, detaching, detached)
  }

  object DirectConnectGatewayStateEnum {
    val pending = "pending"
    val available = "available"
    val deleting = "deleting"
    val deleted = "deleted"

    val values = IndexedSeq(pending, available, deleting, deleted)
  }

  @js.native
  trait DisassociateConnectionFromLagRequest extends js.Object {
    var connectionId: ConnectionId
    var lagId: LagId
  }

  object DisassociateConnectionFromLagRequest {
    def apply(
      connectionId: ConnectionId,
      lagId: LagId): DisassociateConnectionFromLagRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.asInstanceOf[js.Any],
        "lagId" -> lagId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateConnectionFromLagRequest]
    }
  }

  object HasLogicalRedundancyEnum {
    val unknown = "unknown"
    val yes = "yes"
    val no = "no"

    val values = IndexedSeq(unknown, yes, no)
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
  }

  object Interconnect {
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
      region: js.UndefOr[Region] = js.undefined): Interconnect = {
      val _fields = IndexedSeq[(String, js.Any)](
        "awsDevice" -> awsDevice.map { x => x.asInstanceOf[js.Any] },
        "awsDeviceV2" -> awsDeviceV2.map { x => x.asInstanceOf[js.Any] },
        "bandwidth" -> bandwidth.map { x => x.asInstanceOf[js.Any] },
        "hasLogicalRedundancy" -> hasLogicalRedundancy.map { x => x.asInstanceOf[js.Any] },
        "interconnectId" -> interconnectId.map { x => x.asInstanceOf[js.Any] },
        "interconnectName" -> interconnectName.map { x => x.asInstanceOf[js.Any] },
        "interconnectState" -> interconnectState.map { x => x.asInstanceOf[js.Any] },
        "jumboFrameCapable" -> jumboFrameCapable.map { x => x.asInstanceOf[js.Any] },
        "lagId" -> lagId.map { x => x.asInstanceOf[js.Any] },
        "loaIssueTime" -> loaIssueTime.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "region" -> region.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Interconnect]
    }
  }

  object InterconnectStateEnum {
    val requested = "requested"
    val pending = "pending"
    val available = "available"
    val down = "down"
    val deleting = "deleting"
    val deleted = "deleted"

    val values = IndexedSeq(requested, pending, available, down, deleting, deleted)
  }

  @js.native
  trait Interconnects extends js.Object {
    var interconnects: js.UndefOr[InterconnectList]
  }

  object Interconnects {
    def apply(
      interconnects: js.UndefOr[InterconnectList] = js.undefined): Interconnects = {
      val _fields = IndexedSeq[(String, js.Any)](
        "interconnects" -> interconnects.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Interconnects]
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
  }

  object Lag {
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
      region: js.UndefOr[Region] = js.undefined): Lag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "allowsHostedConnections" -> allowsHostedConnections.map { x => x.asInstanceOf[js.Any] },
        "awsDevice" -> awsDevice.map { x => x.asInstanceOf[js.Any] },
        "awsDeviceV2" -> awsDeviceV2.map { x => x.asInstanceOf[js.Any] },
        "connections" -> connections.map { x => x.asInstanceOf[js.Any] },
        "connectionsBandwidth" -> connectionsBandwidth.map { x => x.asInstanceOf[js.Any] },
        "hasLogicalRedundancy" -> hasLogicalRedundancy.map { x => x.asInstanceOf[js.Any] },
        "jumboFrameCapable" -> jumboFrameCapable.map { x => x.asInstanceOf[js.Any] },
        "lagId" -> lagId.map { x => x.asInstanceOf[js.Any] },
        "lagName" -> lagName.map { x => x.asInstanceOf[js.Any] },
        "lagState" -> lagState.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "minimumLinks" -> minimumLinks.map { x => x.asInstanceOf[js.Any] },
        "numberOfConnections" -> numberOfConnections.map { x => x.asInstanceOf[js.Any] },
        "ownerAccount" -> ownerAccount.map { x => x.asInstanceOf[js.Any] },
        "region" -> region.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Lag]
    }
  }

  object LagStateEnum {
    val requested = "requested"
    val pending = "pending"
    val available = "available"
    val down = "down"
    val deleting = "deleting"
    val deleted = "deleted"

    val values = IndexedSeq(requested, pending, available, down, deleting, deleted)
  }

  @js.native
  trait Lags extends js.Object {
    var lags: js.UndefOr[LagList]
  }

  object Lags {
    def apply(
      lags: js.UndefOr[LagList] = js.undefined): Lags = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lags" -> lags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Lags]
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
    def apply(
      loaContent: js.UndefOr[LoaContent] = js.undefined,
      loaContentType: js.UndefOr[LoaContentType] = js.undefined): Loa = {
      val _fields = IndexedSeq[(String, js.Any)](
        "loaContent" -> loaContent.map { x => x.asInstanceOf[js.Any] },
        "loaContentType" -> loaContentType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Loa]
    }
  }

  object LoaContentTypeEnum {
    val `application/pdf` = "application/pdf"

    val values = IndexedSeq(`application/pdf`)
  }

  /**
   * Information about an AWS Direct Connect location.
   */
  @js.native
  trait Location extends js.Object {
    var locationCode: js.UndefOr[LocationCode]
    var locationName: js.UndefOr[LocationName]
    var region: js.UndefOr[Region]
  }

  object Location {
    def apply(
      locationCode: js.UndefOr[LocationCode] = js.undefined,
      locationName: js.UndefOr[LocationName] = js.undefined,
      region: js.UndefOr[Region] = js.undefined): Location = {
      val _fields = IndexedSeq[(String, js.Any)](
        "locationCode" -> locationCode.map { x => x.asInstanceOf[js.Any] },
        "locationName" -> locationName.map { x => x.asInstanceOf[js.Any] },
        "region" -> region.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Location]
    }
  }

  @js.native
  trait Locations extends js.Object {
    var locations: js.UndefOr[LocationList]
  }

  object Locations {
    def apply(
      locations: js.UndefOr[LocationList] = js.undefined): Locations = {
      val _fields = IndexedSeq[(String, js.Any)](
        "locations" -> locations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Locations]
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
    def apply(
      addressFamily: js.UndefOr[AddressFamily] = js.undefined,
      amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
      asn: js.UndefOr[ASN] = js.undefined,
      authKey: js.UndefOr[BGPAuthKey] = js.undefined,
      customerAddress: js.UndefOr[CustomerAddress] = js.undefined): NewBGPPeer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "addressFamily" -> addressFamily.map { x => x.asInstanceOf[js.Any] },
        "amazonAddress" -> amazonAddress.map { x => x.asInstanceOf[js.Any] },
        "asn" -> asn.map { x => x.asInstanceOf[js.Any] },
        "authKey" -> authKey.map { x => x.asInstanceOf[js.Any] },
        "customerAddress" -> customerAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NewBGPPeer]
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
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
  }

  object NewPrivateVirtualInterface {
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
      virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined): NewPrivateVirtualInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        "asn" -> asn.asInstanceOf[js.Any],
        "virtualInterfaceName" -> virtualInterfaceName.asInstanceOf[js.Any],
        "vlan" -> vlan.asInstanceOf[js.Any],
        "addressFamily" -> addressFamily.map { x => x.asInstanceOf[js.Any] },
        "amazonAddress" -> amazonAddress.map { x => x.asInstanceOf[js.Any] },
        "authKey" -> authKey.map { x => x.asInstanceOf[js.Any] },
        "customerAddress" -> customerAddress.map { x => x.asInstanceOf[js.Any] },
        "directConnectGatewayId" -> directConnectGatewayId.map { x => x.asInstanceOf[js.Any] },
        "mtu" -> mtu.map { x => x.asInstanceOf[js.Any] },
        "virtualGatewayId" -> virtualGatewayId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NewPrivateVirtualInterface]
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
  }

  object NewPrivateVirtualInterfaceAllocation {
    def apply(
      asn: ASN,
      virtualInterfaceName: VirtualInterfaceName,
      vlan: VLAN,
      addressFamily: js.UndefOr[AddressFamily] = js.undefined,
      amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
      authKey: js.UndefOr[BGPAuthKey] = js.undefined,
      customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
      mtu: js.UndefOr[MTU] = js.undefined): NewPrivateVirtualInterfaceAllocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "asn" -> asn.asInstanceOf[js.Any],
        "virtualInterfaceName" -> virtualInterfaceName.asInstanceOf[js.Any],
        "vlan" -> vlan.asInstanceOf[js.Any],
        "addressFamily" -> addressFamily.map { x => x.asInstanceOf[js.Any] },
        "amazonAddress" -> amazonAddress.map { x => x.asInstanceOf[js.Any] },
        "authKey" -> authKey.map { x => x.asInstanceOf[js.Any] },
        "customerAddress" -> customerAddress.map { x => x.asInstanceOf[js.Any] },
        "mtu" -> mtu.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NewPrivateVirtualInterfaceAllocation]
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
  }

  object NewPublicVirtualInterface {
    def apply(
      asn: ASN,
      virtualInterfaceName: VirtualInterfaceName,
      vlan: VLAN,
      addressFamily: js.UndefOr[AddressFamily] = js.undefined,
      amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
      authKey: js.UndefOr[BGPAuthKey] = js.undefined,
      customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
      routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList] = js.undefined): NewPublicVirtualInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        "asn" -> asn.asInstanceOf[js.Any],
        "virtualInterfaceName" -> virtualInterfaceName.asInstanceOf[js.Any],
        "vlan" -> vlan.asInstanceOf[js.Any],
        "addressFamily" -> addressFamily.map { x => x.asInstanceOf[js.Any] },
        "amazonAddress" -> amazonAddress.map { x => x.asInstanceOf[js.Any] },
        "authKey" -> authKey.map { x => x.asInstanceOf[js.Any] },
        "customerAddress" -> customerAddress.map { x => x.asInstanceOf[js.Any] },
        "routeFilterPrefixes" -> routeFilterPrefixes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NewPublicVirtualInterface]
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
  }

  object NewPublicVirtualInterfaceAllocation {
    def apply(
      asn: ASN,
      virtualInterfaceName: VirtualInterfaceName,
      vlan: VLAN,
      addressFamily: js.UndefOr[AddressFamily] = js.undefined,
      amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
      authKey: js.UndefOr[BGPAuthKey] = js.undefined,
      customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
      routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList] = js.undefined): NewPublicVirtualInterfaceAllocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "asn" -> asn.asInstanceOf[js.Any],
        "virtualInterfaceName" -> virtualInterfaceName.asInstanceOf[js.Any],
        "vlan" -> vlan.asInstanceOf[js.Any],
        "addressFamily" -> addressFamily.map { x => x.asInstanceOf[js.Any] },
        "amazonAddress" -> amazonAddress.map { x => x.asInstanceOf[js.Any] },
        "authKey" -> authKey.map { x => x.asInstanceOf[js.Any] },
        "customerAddress" -> customerAddress.map { x => x.asInstanceOf[js.Any] },
        "routeFilterPrefixes" -> routeFilterPrefixes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NewPublicVirtualInterfaceAllocation]
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
    def apply(
      resourceArn: js.UndefOr[ResourceArn] = js.undefined,
      tags: js.UndefOr[TagList] = js.undefined): ResourceTag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceTag]
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
    def apply(
      cidr: js.UndefOr[CIDR] = js.undefined): RouteFilterPrefix = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cidr" -> cidr.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RouteFilterPrefix]
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
    def apply(
      key: TagKey,
      value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagList
  }

  object TagResourceRequest {
    def apply(
      resourceArn: ResourceArn,
      tags: TagList): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {

  }

  object TagResourceResponse {
    def apply(): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    def apply(
      resourceArn: ResourceArn,
      tagKeys: TagKeyList): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {

  }

  object UntagResourceResponse {
    def apply(): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateLagRequest extends js.Object {
    var lagId: LagId
    var lagName: js.UndefOr[LagName]
    var minimumLinks: js.UndefOr[Count]
  }

  object UpdateLagRequest {
    def apply(
      lagId: LagId,
      lagName: js.UndefOr[LagName] = js.undefined,
      minimumLinks: js.UndefOr[Count] = js.undefined): UpdateLagRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lagId" -> lagId.asInstanceOf[js.Any],
        "lagName" -> lagName.map { x => x.asInstanceOf[js.Any] },
        "minimumLinks" -> minimumLinks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLagRequest]
    }
  }

  @js.native
  trait UpdateVirtualInterfaceAttributesRequest extends js.Object {
    var virtualInterfaceId: VirtualInterfaceId
    var mtu: js.UndefOr[MTU]
  }

  object UpdateVirtualInterfaceAttributesRequest {
    def apply(
      virtualInterfaceId: VirtualInterfaceId,
      mtu: js.UndefOr[MTU] = js.undefined): UpdateVirtualInterfaceAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualInterfaceId" -> virtualInterfaceId.asInstanceOf[js.Any],
        "mtu" -> mtu.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateVirtualInterfaceAttributesRequest]
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
    def apply(
      virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined,
      virtualGatewayState: js.UndefOr[VirtualGatewayState] = js.undefined): VirtualGateway = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualGatewayId" -> virtualGatewayId.map { x => x.asInstanceOf[js.Any] },
        "virtualGatewayState" -> virtualGatewayState.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VirtualGateway]
    }
  }

  @js.native
  trait VirtualGateways extends js.Object {
    var virtualGateways: js.UndefOr[VirtualGatewayList]
  }

  object VirtualGateways {
    def apply(
      virtualGateways: js.UndefOr[VirtualGatewayList] = js.undefined): VirtualGateways = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualGateways" -> virtualGateways.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VirtualGateways]
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
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
    var virtualInterfaceName: js.UndefOr[VirtualInterfaceName]
    var virtualInterfaceState: js.UndefOr[VirtualInterfaceState]
    var virtualInterfaceType: js.UndefOr[VirtualInterfaceType]
    var vlan: js.UndefOr[VLAN]
  }

  object VirtualInterface {
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
      virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined,
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined,
      virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.undefined,
      virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.undefined,
      virtualInterfaceType: js.UndefOr[VirtualInterfaceType] = js.undefined,
      vlan: js.UndefOr[VLAN] = js.undefined): VirtualInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        "addressFamily" -> addressFamily.map { x => x.asInstanceOf[js.Any] },
        "amazonAddress" -> amazonAddress.map { x => x.asInstanceOf[js.Any] },
        "amazonSideAsn" -> amazonSideAsn.map { x => x.asInstanceOf[js.Any] },
        "asn" -> asn.map { x => x.asInstanceOf[js.Any] },
        "authKey" -> authKey.map { x => x.asInstanceOf[js.Any] },
        "awsDeviceV2" -> awsDeviceV2.map { x => x.asInstanceOf[js.Any] },
        "bgpPeers" -> bgpPeers.map { x => x.asInstanceOf[js.Any] },
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] },
        "customerAddress" -> customerAddress.map { x => x.asInstanceOf[js.Any] },
        "customerRouterConfig" -> customerRouterConfig.map { x => x.asInstanceOf[js.Any] },
        "directConnectGatewayId" -> directConnectGatewayId.map { x => x.asInstanceOf[js.Any] },
        "jumboFrameCapable" -> jumboFrameCapable.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "mtu" -> mtu.map { x => x.asInstanceOf[js.Any] },
        "ownerAccount" -> ownerAccount.map { x => x.asInstanceOf[js.Any] },
        "region" -> region.map { x => x.asInstanceOf[js.Any] },
        "routeFilterPrefixes" -> routeFilterPrefixes.map { x => x.asInstanceOf[js.Any] },
        "virtualGatewayId" -> virtualGatewayId.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceId" -> virtualInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceName" -> virtualInterfaceName.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceState" -> virtualInterfaceState.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceType" -> virtualInterfaceType.map { x => x.asInstanceOf[js.Any] },
        "vlan" -> vlan.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VirtualInterface]
    }
  }

  object VirtualInterfaceStateEnum {
    val confirming = "confirming"
    val verifying = "verifying"
    val pending = "pending"
    val available = "available"
    val down = "down"
    val deleting = "deleting"
    val deleted = "deleted"
    val rejected = "rejected"

    val values = IndexedSeq(confirming, verifying, pending, available, down, deleting, deleted, rejected)
  }

  @js.native
  trait VirtualInterfaces extends js.Object {
    var virtualInterfaces: js.UndefOr[VirtualInterfaceList]
  }

  object VirtualInterfaces {
    def apply(
      virtualInterfaces: js.UndefOr[VirtualInterfaceList] = js.undefined): VirtualInterfaces = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualInterfaces" -> virtualInterfaces.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VirtualInterfaces]
    }
  }
}
