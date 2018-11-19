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
    var connectionName: js.UndefOr[ConnectionName]
    var interconnectId: js.UndefOr[InterconnectId]
    var bandwidth: js.UndefOr[Bandwidth]
    var vlan: js.UndefOr[VLAN]
    var ownerAccount: js.UndefOr[OwnerAccount]
  }

  object AllocateConnectionOnInterconnectRequest {
    def apply(
      connectionName: js.UndefOr[ConnectionName] = js.undefined,
      interconnectId: js.UndefOr[InterconnectId] = js.undefined,
      bandwidth: js.UndefOr[Bandwidth] = js.undefined,
      vlan: js.UndefOr[VLAN] = js.undefined,
      ownerAccount: js.UndefOr[OwnerAccount] = js.undefined): AllocateConnectionOnInterconnectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionName" -> connectionName.map { x => x.asInstanceOf[js.Any] },
        "interconnectId" -> interconnectId.map { x => x.asInstanceOf[js.Any] },
        "bandwidth" -> bandwidth.map { x => x.asInstanceOf[js.Any] },
        "vlan" -> vlan.map { x => x.asInstanceOf[js.Any] },
        "ownerAccount" -> ownerAccount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocateConnectionOnInterconnectRequest]
    }
  }

  @js.native
  trait AllocateHostedConnectionRequest extends js.Object {
    var connectionName: js.UndefOr[ConnectionName]
    var bandwidth: js.UndefOr[Bandwidth]
    var vlan: js.UndefOr[VLAN]
    var connectionId: js.UndefOr[ConnectionId]
    var ownerAccount: js.UndefOr[OwnerAccount]
  }

  object AllocateHostedConnectionRequest {
    def apply(
      connectionName: js.UndefOr[ConnectionName] = js.undefined,
      bandwidth: js.UndefOr[Bandwidth] = js.undefined,
      vlan: js.UndefOr[VLAN] = js.undefined,
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      ownerAccount: js.UndefOr[OwnerAccount] = js.undefined): AllocateHostedConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionName" -> connectionName.map { x => x.asInstanceOf[js.Any] },
        "bandwidth" -> bandwidth.map { x => x.asInstanceOf[js.Any] },
        "vlan" -> vlan.map { x => x.asInstanceOf[js.Any] },
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] },
        "ownerAccount" -> ownerAccount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocateHostedConnectionRequest]
    }
  }

  @js.native
  trait AllocatePrivateVirtualInterfaceRequest extends js.Object {
    var connectionId: js.UndefOr[ConnectionId]
    var ownerAccount: js.UndefOr[OwnerAccount]
    var newPrivateVirtualInterfaceAllocation: js.UndefOr[NewPrivateVirtualInterfaceAllocation]
  }

  object AllocatePrivateVirtualInterfaceRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      ownerAccount: js.UndefOr[OwnerAccount] = js.undefined,
      newPrivateVirtualInterfaceAllocation: js.UndefOr[NewPrivateVirtualInterfaceAllocation] = js.undefined): AllocatePrivateVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] },
        "ownerAccount" -> ownerAccount.map { x => x.asInstanceOf[js.Any] },
        "newPrivateVirtualInterfaceAllocation" -> newPrivateVirtualInterfaceAllocation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocatePrivateVirtualInterfaceRequest]
    }
  }

  @js.native
  trait AllocatePublicVirtualInterfaceRequest extends js.Object {
    var connectionId: js.UndefOr[ConnectionId]
    var ownerAccount: js.UndefOr[OwnerAccount]
    var newPublicVirtualInterfaceAllocation: js.UndefOr[NewPublicVirtualInterfaceAllocation]
  }

  object AllocatePublicVirtualInterfaceRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      ownerAccount: js.UndefOr[OwnerAccount] = js.undefined,
      newPublicVirtualInterfaceAllocation: js.UndefOr[NewPublicVirtualInterfaceAllocation] = js.undefined): AllocatePublicVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] },
        "ownerAccount" -> ownerAccount.map { x => x.asInstanceOf[js.Any] },
        "newPublicVirtualInterfaceAllocation" -> newPublicVirtualInterfaceAllocation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocatePublicVirtualInterfaceRequest]
    }
  }

  @js.native
  trait AssociateConnectionWithLagRequest extends js.Object {
    var connectionId: js.UndefOr[ConnectionId]
    var lagId: js.UndefOr[LagId]
  }

  object AssociateConnectionWithLagRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      lagId: js.UndefOr[LagId] = js.undefined): AssociateConnectionWithLagRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] },
        "lagId" -> lagId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateConnectionWithLagRequest]
    }
  }

  @js.native
  trait AssociateHostedConnectionRequest extends js.Object {
    var connectionId: js.UndefOr[ConnectionId]
    var parentConnectionId: js.UndefOr[ConnectionId]
  }

  object AssociateHostedConnectionRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      parentConnectionId: js.UndefOr[ConnectionId] = js.undefined): AssociateHostedConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] },
        "parentConnectionId" -> parentConnectionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateHostedConnectionRequest]
    }
  }

  @js.native
  trait AssociateVirtualInterfaceRequest extends js.Object {
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
    var connectionId: js.UndefOr[ConnectionId]
  }

  object AssociateVirtualInterfaceRequest {
    def apply(
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined,
      connectionId: js.UndefOr[ConnectionId] = js.undefined): AssociateVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualInterfaceId" -> virtualInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateVirtualInterfaceRequest]
    }
  }

  /**
   * <p>Information about a BGP peer.</p>
   */
  @js.native
  trait BGPPeer extends js.Object {
    var bgpStatus: js.UndefOr[BGPStatus]
    var authKey: js.UndefOr[BGPAuthKey]
    var bgpPeerState: js.UndefOr[BGPPeerState]
    var addressFamily: js.UndefOr[AddressFamily]
    var amazonAddress: js.UndefOr[AmazonAddress]
    var customerAddress: js.UndefOr[CustomerAddress]
    var awsDeviceV2: js.UndefOr[AwsDeviceV2]
    var bgpPeerId: js.UndefOr[BGPPeerId]
    var asn: js.UndefOr[ASN]
  }

  object BGPPeer {
    def apply(
      bgpStatus: js.UndefOr[BGPStatus] = js.undefined,
      authKey: js.UndefOr[BGPAuthKey] = js.undefined,
      bgpPeerState: js.UndefOr[BGPPeerState] = js.undefined,
      addressFamily: js.UndefOr[AddressFamily] = js.undefined,
      amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
      customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
      awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined,
      bgpPeerId: js.UndefOr[BGPPeerId] = js.undefined,
      asn: js.UndefOr[ASN] = js.undefined): BGPPeer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bgpStatus" -> bgpStatus.map { x => x.asInstanceOf[js.Any] },
        "authKey" -> authKey.map { x => x.asInstanceOf[js.Any] },
        "bgpPeerState" -> bgpPeerState.map { x => x.asInstanceOf[js.Any] },
        "addressFamily" -> addressFamily.map { x => x.asInstanceOf[js.Any] },
        "amazonAddress" -> amazonAddress.map { x => x.asInstanceOf[js.Any] },
        "customerAddress" -> customerAddress.map { x => x.asInstanceOf[js.Any] },
        "awsDeviceV2" -> awsDeviceV2.map { x => x.asInstanceOf[js.Any] },
        "bgpPeerId" -> bgpPeerId.map { x => x.asInstanceOf[js.Any] },
        "asn" -> asn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var connectionId: js.UndefOr[ConnectionId]
  }

  object ConfirmConnectionRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined): ConfirmConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
  }

  object ConfirmPrivateVirtualInterfaceRequest {
    def apply(
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined,
      virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined,
      directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined): ConfirmPrivateVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualInterfaceId" -> virtualInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "virtualGatewayId" -> virtualGatewayId.map { x => x.asInstanceOf[js.Any] },
        "directConnectGatewayId" -> directConnectGatewayId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
  }

  object ConfirmPublicVirtualInterfaceRequest {
    def apply(
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined): ConfirmPublicVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualInterfaceId" -> virtualInterfaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Information about an AWS Direct Connect connection.</p>
   */
  @js.native
  trait Connection extends js.Object {
    var connectionName: js.UndefOr[ConnectionName]
    var location: js.UndefOr[LocationCode]
    var partnerName: js.UndefOr[PartnerName]
    var loaIssueTime: js.UndefOr[LoaIssueTime]
    var bandwidth: js.UndefOr[Bandwidth]
    var lagId: js.UndefOr[LagId]
    var awsDeviceV2: js.UndefOr[AwsDeviceV2]
    var connectionState: js.UndefOr[ConnectionState]
    var awsDevice: js.UndefOr[AwsDevice]
    var vlan: js.UndefOr[VLAN]
    var connectionId: js.UndefOr[ConnectionId]
    var region: js.UndefOr[Region]
    var jumboFrameCapable: js.UndefOr[JumboFrameCapable]
    var ownerAccount: js.UndefOr[OwnerAccount]
    var hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy]
  }

  object Connection {
    def apply(
      connectionName: js.UndefOr[ConnectionName] = js.undefined,
      location: js.UndefOr[LocationCode] = js.undefined,
      partnerName: js.UndefOr[PartnerName] = js.undefined,
      loaIssueTime: js.UndefOr[LoaIssueTime] = js.undefined,
      bandwidth: js.UndefOr[Bandwidth] = js.undefined,
      lagId: js.UndefOr[LagId] = js.undefined,
      awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined,
      connectionState: js.UndefOr[ConnectionState] = js.undefined,
      awsDevice: js.UndefOr[AwsDevice] = js.undefined,
      vlan: js.UndefOr[VLAN] = js.undefined,
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      region: js.UndefOr[Region] = js.undefined,
      jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined,
      ownerAccount: js.UndefOr[OwnerAccount] = js.undefined,
      hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy] = js.undefined): Connection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionName" -> connectionName.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "partnerName" -> partnerName.map { x => x.asInstanceOf[js.Any] },
        "loaIssueTime" -> loaIssueTime.map { x => x.asInstanceOf[js.Any] },
        "bandwidth" -> bandwidth.map { x => x.asInstanceOf[js.Any] },
        "lagId" -> lagId.map { x => x.asInstanceOf[js.Any] },
        "awsDeviceV2" -> awsDeviceV2.map { x => x.asInstanceOf[js.Any] },
        "connectionState" -> connectionState.map { x => x.asInstanceOf[js.Any] },
        "awsDevice" -> awsDevice.map { x => x.asInstanceOf[js.Any] },
        "vlan" -> vlan.map { x => x.asInstanceOf[js.Any] },
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] },
        "region" -> region.map { x => x.asInstanceOf[js.Any] },
        "jumboFrameCapable" -> jumboFrameCapable.map { x => x.asInstanceOf[js.Any] },
        "ownerAccount" -> ownerAccount.map { x => x.asInstanceOf[js.Any] },
        "hasLogicalRedundancy" -> hasLogicalRedundancy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
    var newBGPPeer: js.UndefOr[NewBGPPeer]
  }

  object CreateBGPPeerRequest {
    def apply(
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined,
      newBGPPeer: js.UndefOr[NewBGPPeer] = js.undefined): CreateBGPPeerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualInterfaceId" -> virtualInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "newBGPPeer" -> newBGPPeer.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var location: js.UndefOr[LocationCode]
    var bandwidth: js.UndefOr[Bandwidth]
    var connectionName: js.UndefOr[ConnectionName]
    var lagId: js.UndefOr[LagId]
  }

  object CreateConnectionRequest {
    def apply(
      location: js.UndefOr[LocationCode] = js.undefined,
      bandwidth: js.UndefOr[Bandwidth] = js.undefined,
      connectionName: js.UndefOr[ConnectionName] = js.undefined,
      lagId: js.UndefOr[LagId] = js.undefined): CreateConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "bandwidth" -> bandwidth.map { x => x.asInstanceOf[js.Any] },
        "connectionName" -> connectionName.map { x => x.asInstanceOf[js.Any] },
        "lagId" -> lagId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConnectionRequest]
    }
  }

  @js.native
  trait CreateDirectConnectGatewayAssociationRequest extends js.Object {
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
  }

  object CreateDirectConnectGatewayAssociationRequest {
    def apply(
      directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
      virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined): CreateDirectConnectGatewayAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGatewayId" -> directConnectGatewayId.map { x => x.asInstanceOf[js.Any] },
        "virtualGatewayId" -> virtualGatewayId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var directConnectGatewayName: js.UndefOr[DirectConnectGatewayName]
    var amazonSideAsn: js.UndefOr[LongAsn]
  }

  object CreateDirectConnectGatewayRequest {
    def apply(
      directConnectGatewayName: js.UndefOr[DirectConnectGatewayName] = js.undefined,
      amazonSideAsn: js.UndefOr[LongAsn] = js.undefined): CreateDirectConnectGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGatewayName" -> directConnectGatewayName.map { x => x.asInstanceOf[js.Any] },
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
    var interconnectName: js.UndefOr[InterconnectName]
    var bandwidth: js.UndefOr[Bandwidth]
    var location: js.UndefOr[LocationCode]
    var lagId: js.UndefOr[LagId]
  }

  object CreateInterconnectRequest {
    def apply(
      interconnectName: js.UndefOr[InterconnectName] = js.undefined,
      bandwidth: js.UndefOr[Bandwidth] = js.undefined,
      location: js.UndefOr[LocationCode] = js.undefined,
      lagId: js.UndefOr[LagId] = js.undefined): CreateInterconnectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "interconnectName" -> interconnectName.map { x => x.asInstanceOf[js.Any] },
        "bandwidth" -> bandwidth.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "lagId" -> lagId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInterconnectRequest]
    }
  }

  @js.native
  trait CreateLagRequest extends js.Object {
    var location: js.UndefOr[LocationCode]
    var connectionsBandwidth: js.UndefOr[Bandwidth]
    var lagName: js.UndefOr[LagName]
    var connectionId: js.UndefOr[ConnectionId]
    var numberOfConnections: js.UndefOr[Count]
  }

  object CreateLagRequest {
    def apply(
      location: js.UndefOr[LocationCode] = js.undefined,
      connectionsBandwidth: js.UndefOr[Bandwidth] = js.undefined,
      lagName: js.UndefOr[LagName] = js.undefined,
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      numberOfConnections: js.UndefOr[Count] = js.undefined): CreateLagRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "connectionsBandwidth" -> connectionsBandwidth.map { x => x.asInstanceOf[js.Any] },
        "lagName" -> lagName.map { x => x.asInstanceOf[js.Any] },
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] },
        "numberOfConnections" -> numberOfConnections.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLagRequest]
    }
  }

  @js.native
  trait CreatePrivateVirtualInterfaceRequest extends js.Object {
    var connectionId: js.UndefOr[ConnectionId]
    var newPrivateVirtualInterface: js.UndefOr[NewPrivateVirtualInterface]
  }

  object CreatePrivateVirtualInterfaceRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      newPrivateVirtualInterface: js.UndefOr[NewPrivateVirtualInterface] = js.undefined): CreatePrivateVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] },
        "newPrivateVirtualInterface" -> newPrivateVirtualInterface.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePrivateVirtualInterfaceRequest]
    }
  }

  @js.native
  trait CreatePublicVirtualInterfaceRequest extends js.Object {
    var connectionId: js.UndefOr[ConnectionId]
    var newPublicVirtualInterface: js.UndefOr[NewPublicVirtualInterface]
  }

  object CreatePublicVirtualInterfaceRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      newPublicVirtualInterface: js.UndefOr[NewPublicVirtualInterface] = js.undefined): CreatePublicVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] },
        "newPublicVirtualInterface" -> newPublicVirtualInterface.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePublicVirtualInterfaceRequest]
    }
  }

  @js.native
  trait DeleteBGPPeerRequest extends js.Object {
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
    var asn: js.UndefOr[ASN]
    var customerAddress: js.UndefOr[CustomerAddress]
    var bgpPeerId: js.UndefOr[BGPPeerId]
  }

  object DeleteBGPPeerRequest {
    def apply(
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined,
      asn: js.UndefOr[ASN] = js.undefined,
      customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
      bgpPeerId: js.UndefOr[BGPPeerId] = js.undefined): DeleteBGPPeerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualInterfaceId" -> virtualInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "asn" -> asn.map { x => x.asInstanceOf[js.Any] },
        "customerAddress" -> customerAddress.map { x => x.asInstanceOf[js.Any] },
        "bgpPeerId" -> bgpPeerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var connectionId: js.UndefOr[ConnectionId]
  }

  object DeleteConnectionRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined): DeleteConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConnectionRequest]
    }
  }

  @js.native
  trait DeleteDirectConnectGatewayAssociationRequest extends js.Object {
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
  }

  object DeleteDirectConnectGatewayAssociationRequest {
    def apply(
      directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
      virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined): DeleteDirectConnectGatewayAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGatewayId" -> directConnectGatewayId.map { x => x.asInstanceOf[js.Any] },
        "virtualGatewayId" -> virtualGatewayId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
  }

  object DeleteDirectConnectGatewayRequest {
    def apply(
      directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined): DeleteDirectConnectGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGatewayId" -> directConnectGatewayId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var interconnectId: js.UndefOr[InterconnectId]
  }

  object DeleteInterconnectRequest {
    def apply(
      interconnectId: js.UndefOr[InterconnectId] = js.undefined): DeleteInterconnectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "interconnectId" -> interconnectId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var lagId: js.UndefOr[LagId]
  }

  object DeleteLagRequest {
    def apply(
      lagId: js.UndefOr[LagId] = js.undefined): DeleteLagRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lagId" -> lagId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLagRequest]
    }
  }

  @js.native
  trait DeleteVirtualInterfaceRequest extends js.Object {
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
  }

  object DeleteVirtualInterfaceRequest {
    def apply(
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined): DeleteVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualInterfaceId" -> virtualInterfaceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var connectionId: js.UndefOr[ConnectionId]
    var providerName: js.UndefOr[ProviderName]
    var loaContentType: js.UndefOr[LoaContentType]
  }

  object DescribeConnectionLoaRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      providerName: js.UndefOr[ProviderName] = js.undefined,
      loaContentType: js.UndefOr[LoaContentType] = js.undefined): DescribeConnectionLoaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] },
        "providerName" -> providerName.map { x => x.asInstanceOf[js.Any] },
        "loaContentType" -> loaContentType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var interconnectId: js.UndefOr[InterconnectId]
  }

  object DescribeConnectionsOnInterconnectRequest {
    def apply(
      interconnectId: js.UndefOr[InterconnectId] = js.undefined): DescribeConnectionsOnInterconnectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "interconnectId" -> interconnectId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
    var maxResults: js.UndefOr[MaxResultSetSize]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeDirectConnectGatewayAssociationsRequest {
    def apply(
      directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
      virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined,
      maxResults: js.UndefOr[MaxResultSetSize] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): DescribeDirectConnectGatewayAssociationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGatewayId" -> directConnectGatewayId.map { x => x.asInstanceOf[js.Any] },
        "virtualGatewayId" -> virtualGatewayId.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
    var maxResults: js.UndefOr[MaxResultSetSize]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeDirectConnectGatewayAttachmentsRequest {
    def apply(
      directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined,
      maxResults: js.UndefOr[MaxResultSetSize] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): DescribeDirectConnectGatewayAttachmentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGatewayId" -> directConnectGatewayId.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceId" -> virtualInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var connectionId: js.UndefOr[ConnectionId]
  }

  object DescribeHostedConnectionsRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined): DescribeHostedConnectionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHostedConnectionsRequest]
    }
  }

  @js.native
  trait DescribeInterconnectLoaRequest extends js.Object {
    var interconnectId: js.UndefOr[InterconnectId]
    var providerName: js.UndefOr[ProviderName]
    var loaContentType: js.UndefOr[LoaContentType]
  }

  object DescribeInterconnectLoaRequest {
    def apply(
      interconnectId: js.UndefOr[InterconnectId] = js.undefined,
      providerName: js.UndefOr[ProviderName] = js.undefined,
      loaContentType: js.UndefOr[LoaContentType] = js.undefined): DescribeInterconnectLoaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "interconnectId" -> interconnectId.map { x => x.asInstanceOf[js.Any] },
        "providerName" -> providerName.map { x => x.asInstanceOf[js.Any] },
        "loaContentType" -> loaContentType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var connectionId: js.UndefOr[ConnectionId]
    var providerName: js.UndefOr[ProviderName]
    var loaContentType: js.UndefOr[LoaContentType]
  }

  object DescribeLoaRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      providerName: js.UndefOr[ProviderName] = js.undefined,
      loaContentType: js.UndefOr[LoaContentType] = js.undefined): DescribeLoaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] },
        "providerName" -> providerName.map { x => x.asInstanceOf[js.Any] },
        "loaContentType" -> loaContentType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoaRequest]
    }
  }

  @js.native
  trait DescribeTagsRequest extends js.Object {
    var resourceArns: js.UndefOr[ResourceArnList]
  }

  object DescribeTagsRequest {
    def apply(
      resourceArns: js.UndefOr[ResourceArnList] = js.undefined): DescribeTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArns" -> resourceArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Information about a Direct Connect gateway, which enables you to connect virtual interfaces and virtual private gateways.</p>
   */
  @js.native
  trait DirectConnectGateway extends js.Object {
    var directConnectGatewayName: js.UndefOr[DirectConnectGatewayName]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var directConnectGatewayState: js.UndefOr[DirectConnectGatewayState]
    var ownerAccount: js.UndefOr[OwnerAccount]
    var stateChangeError: js.UndefOr[StateChangeError]
    var amazonSideAsn: js.UndefOr[LongAsn]
  }

  object DirectConnectGateway {
    def apply(
      directConnectGatewayName: js.UndefOr[DirectConnectGatewayName] = js.undefined,
      directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
      directConnectGatewayState: js.UndefOr[DirectConnectGatewayState] = js.undefined,
      ownerAccount: js.UndefOr[OwnerAccount] = js.undefined,
      stateChangeError: js.UndefOr[StateChangeError] = js.undefined,
      amazonSideAsn: js.UndefOr[LongAsn] = js.undefined): DirectConnectGateway = {
      val _fields = IndexedSeq[(String, js.Any)](
        "directConnectGatewayName" -> directConnectGatewayName.map { x => x.asInstanceOf[js.Any] },
        "directConnectGatewayId" -> directConnectGatewayId.map { x => x.asInstanceOf[js.Any] },
        "directConnectGatewayState" -> directConnectGatewayState.map { x => x.asInstanceOf[js.Any] },
        "ownerAccount" -> ownerAccount.map { x => x.asInstanceOf[js.Any] },
        "stateChangeError" -> stateChangeError.map { x => x.asInstanceOf[js.Any] },
        "amazonSideAsn" -> amazonSideAsn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DirectConnectGateway]
    }
  }

  /**
   * <p>Information about an association between a Direct Connect gateway and a virtual private gateway.</p>
   */
  @js.native
  trait DirectConnectGatewayAssociation extends js.Object {
    var virtualGatewayOwnerAccount: js.UndefOr[OwnerAccount]
    var associationState: js.UndefOr[DirectConnectGatewayAssociationState]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var virtualGatewayRegion: js.UndefOr[VirtualGatewayRegion]
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
    var stateChangeError: js.UndefOr[StateChangeError]
  }

  object DirectConnectGatewayAssociation {
    def apply(
      virtualGatewayOwnerAccount: js.UndefOr[OwnerAccount] = js.undefined,
      associationState: js.UndefOr[DirectConnectGatewayAssociationState] = js.undefined,
      directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
      virtualGatewayRegion: js.UndefOr[VirtualGatewayRegion] = js.undefined,
      virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined,
      stateChangeError: js.UndefOr[StateChangeError] = js.undefined): DirectConnectGatewayAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualGatewayOwnerAccount" -> virtualGatewayOwnerAccount.map { x => x.asInstanceOf[js.Any] },
        "associationState" -> associationState.map { x => x.asInstanceOf[js.Any] },
        "directConnectGatewayId" -> directConnectGatewayId.map { x => x.asInstanceOf[js.Any] },
        "virtualGatewayRegion" -> virtualGatewayRegion.map { x => x.asInstanceOf[js.Any] },
        "virtualGatewayId" -> virtualGatewayId.map { x => x.asInstanceOf[js.Any] },
        "stateChangeError" -> stateChangeError.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Information about an attachment between a Direct Connect gateway and a virtual interface.</p>
   */
  @js.native
  trait DirectConnectGatewayAttachment extends js.Object {
    var virtualInterfaceRegion: js.UndefOr[VirtualInterfaceRegion]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var attachmentState: js.UndefOr[DirectConnectGatewayAttachmentState]
    var virtualInterfaceOwnerAccount: js.UndefOr[OwnerAccount]
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
    var stateChangeError: js.UndefOr[StateChangeError]
  }

  object DirectConnectGatewayAttachment {
    def apply(
      virtualInterfaceRegion: js.UndefOr[VirtualInterfaceRegion] = js.undefined,
      directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
      attachmentState: js.UndefOr[DirectConnectGatewayAttachmentState] = js.undefined,
      virtualInterfaceOwnerAccount: js.UndefOr[OwnerAccount] = js.undefined,
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined,
      stateChangeError: js.UndefOr[StateChangeError] = js.undefined): DirectConnectGatewayAttachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualInterfaceRegion" -> virtualInterfaceRegion.map { x => x.asInstanceOf[js.Any] },
        "directConnectGatewayId" -> directConnectGatewayId.map { x => x.asInstanceOf[js.Any] },
        "attachmentState" -> attachmentState.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceOwnerAccount" -> virtualInterfaceOwnerAccount.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceId" -> virtualInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "stateChangeError" -> stateChangeError.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var connectionId: js.UndefOr[ConnectionId]
    var lagId: js.UndefOr[LagId]
  }

  object DisassociateConnectionFromLagRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      lagId: js.UndefOr[LagId] = js.undefined): DisassociateConnectionFromLagRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] },
        "lagId" -> lagId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Information about an interconnect.</p>
   */
  @js.native
  trait Interconnect extends js.Object {
    var location: js.UndefOr[LocationCode]
    var interconnectId: js.UndefOr[InterconnectId]
    var interconnectState: js.UndefOr[InterconnectState]
    var loaIssueTime: js.UndefOr[LoaIssueTime]
    var bandwidth: js.UndefOr[Bandwidth]
    var lagId: js.UndefOr[LagId]
    var awsDeviceV2: js.UndefOr[AwsDeviceV2]
    var awsDevice: js.UndefOr[AwsDevice]
    var region: js.UndefOr[Region]
    var jumboFrameCapable: js.UndefOr[JumboFrameCapable]
    var interconnectName: js.UndefOr[InterconnectName]
    var hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy]
  }

  object Interconnect {
    def apply(
      location: js.UndefOr[LocationCode] = js.undefined,
      interconnectId: js.UndefOr[InterconnectId] = js.undefined,
      interconnectState: js.UndefOr[InterconnectState] = js.undefined,
      loaIssueTime: js.UndefOr[LoaIssueTime] = js.undefined,
      bandwidth: js.UndefOr[Bandwidth] = js.undefined,
      lagId: js.UndefOr[LagId] = js.undefined,
      awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined,
      awsDevice: js.UndefOr[AwsDevice] = js.undefined,
      region: js.UndefOr[Region] = js.undefined,
      jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined,
      interconnectName: js.UndefOr[InterconnectName] = js.undefined,
      hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy] = js.undefined): Interconnect = {
      val _fields = IndexedSeq[(String, js.Any)](
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "interconnectId" -> interconnectId.map { x => x.asInstanceOf[js.Any] },
        "interconnectState" -> interconnectState.map { x => x.asInstanceOf[js.Any] },
        "loaIssueTime" -> loaIssueTime.map { x => x.asInstanceOf[js.Any] },
        "bandwidth" -> bandwidth.map { x => x.asInstanceOf[js.Any] },
        "lagId" -> lagId.map { x => x.asInstanceOf[js.Any] },
        "awsDeviceV2" -> awsDeviceV2.map { x => x.asInstanceOf[js.Any] },
        "awsDevice" -> awsDevice.map { x => x.asInstanceOf[js.Any] },
        "region" -> region.map { x => x.asInstanceOf[js.Any] },
        "jumboFrameCapable" -> jumboFrameCapable.map { x => x.asInstanceOf[js.Any] },
        "interconnectName" -> interconnectName.map { x => x.asInstanceOf[js.Any] },
        "hasLogicalRedundancy" -> hasLogicalRedundancy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Information about a link aggregation group (LAG).</p>
   */
  @js.native
  trait Lag extends js.Object {
    var allowsHostedConnections: js.UndefOr[BooleanFlag]
    var location: js.UndefOr[LocationCode]
    var lagId: js.UndefOr[LagId]
    var awsDeviceV2: js.UndefOr[AwsDeviceV2]
    var connectionsBandwidth: js.UndefOr[Bandwidth]
    var lagName: js.UndefOr[LagName]
    var minimumLinks: js.UndefOr[Count]
    var awsDevice: js.UndefOr[AwsDevice]
    var region: js.UndefOr[Region]
    var jumboFrameCapable: js.UndefOr[JumboFrameCapable]
    var lagState: js.UndefOr[LagState]
    var ownerAccount: js.UndefOr[OwnerAccount]
    var hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy]
    var numberOfConnections: js.UndefOr[Count]
    var connections: js.UndefOr[ConnectionList]
  }

  object Lag {
    def apply(
      allowsHostedConnections: js.UndefOr[BooleanFlag] = js.undefined,
      location: js.UndefOr[LocationCode] = js.undefined,
      lagId: js.UndefOr[LagId] = js.undefined,
      awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined,
      connectionsBandwidth: js.UndefOr[Bandwidth] = js.undefined,
      lagName: js.UndefOr[LagName] = js.undefined,
      minimumLinks: js.UndefOr[Count] = js.undefined,
      awsDevice: js.UndefOr[AwsDevice] = js.undefined,
      region: js.UndefOr[Region] = js.undefined,
      jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined,
      lagState: js.UndefOr[LagState] = js.undefined,
      ownerAccount: js.UndefOr[OwnerAccount] = js.undefined,
      hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy] = js.undefined,
      numberOfConnections: js.UndefOr[Count] = js.undefined,
      connections: js.UndefOr[ConnectionList] = js.undefined): Lag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "allowsHostedConnections" -> allowsHostedConnections.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "lagId" -> lagId.map { x => x.asInstanceOf[js.Any] },
        "awsDeviceV2" -> awsDeviceV2.map { x => x.asInstanceOf[js.Any] },
        "connectionsBandwidth" -> connectionsBandwidth.map { x => x.asInstanceOf[js.Any] },
        "lagName" -> lagName.map { x => x.asInstanceOf[js.Any] },
        "minimumLinks" -> minimumLinks.map { x => x.asInstanceOf[js.Any] },
        "awsDevice" -> awsDevice.map { x => x.asInstanceOf[js.Any] },
        "region" -> region.map { x => x.asInstanceOf[js.Any] },
        "jumboFrameCapable" -> jumboFrameCapable.map { x => x.asInstanceOf[js.Any] },
        "lagState" -> lagState.map { x => x.asInstanceOf[js.Any] },
        "ownerAccount" -> ownerAccount.map { x => x.asInstanceOf[js.Any] },
        "hasLogicalRedundancy" -> hasLogicalRedundancy.map { x => x.asInstanceOf[js.Any] },
        "numberOfConnections" -> numberOfConnections.map { x => x.asInstanceOf[js.Any] },
        "connections" -> connections.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Information about a Letter of Authorization - Connecting Facility Assignment (LOA-CFA) for a connection.</p>
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
   * <p>Information about an AWS Direct Connect location.</p>
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
   * <p>Information about a new BGP peer.</p>
   */
  @js.native
  trait NewBGPPeer extends js.Object {
    var authKey: js.UndefOr[BGPAuthKey]
    var addressFamily: js.UndefOr[AddressFamily]
    var amazonAddress: js.UndefOr[AmazonAddress]
    var customerAddress: js.UndefOr[CustomerAddress]
    var asn: js.UndefOr[ASN]
  }

  object NewBGPPeer {
    def apply(
      authKey: js.UndefOr[BGPAuthKey] = js.undefined,
      addressFamily: js.UndefOr[AddressFamily] = js.undefined,
      amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
      customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
      asn: js.UndefOr[ASN] = js.undefined): NewBGPPeer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authKey" -> authKey.map { x => x.asInstanceOf[js.Any] },
        "addressFamily" -> addressFamily.map { x => x.asInstanceOf[js.Any] },
        "amazonAddress" -> amazonAddress.map { x => x.asInstanceOf[js.Any] },
        "customerAddress" -> customerAddress.map { x => x.asInstanceOf[js.Any] },
        "asn" -> asn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NewBGPPeer]
    }
  }

  /**
   * <p>Information about a private virtual interface.</p>
   */
  @js.native
  trait NewPrivateVirtualInterface extends js.Object {
    var authKey: js.UndefOr[BGPAuthKey]
    var addressFamily: js.UndefOr[AddressFamily]
    var amazonAddress: js.UndefOr[AmazonAddress]
    var customerAddress: js.UndefOr[CustomerAddress]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var asn: js.UndefOr[ASN]
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
    var vlan: js.UndefOr[VLAN]
    var mtu: js.UndefOr[MTU]
    var virtualInterfaceName: js.UndefOr[VirtualInterfaceName]
  }

  object NewPrivateVirtualInterface {
    def apply(
      authKey: js.UndefOr[BGPAuthKey] = js.undefined,
      addressFamily: js.UndefOr[AddressFamily] = js.undefined,
      amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
      customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
      directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
      asn: js.UndefOr[ASN] = js.undefined,
      virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined,
      vlan: js.UndefOr[VLAN] = js.undefined,
      mtu: js.UndefOr[MTU] = js.undefined,
      virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.undefined): NewPrivateVirtualInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authKey" -> authKey.map { x => x.asInstanceOf[js.Any] },
        "addressFamily" -> addressFamily.map { x => x.asInstanceOf[js.Any] },
        "amazonAddress" -> amazonAddress.map { x => x.asInstanceOf[js.Any] },
        "customerAddress" -> customerAddress.map { x => x.asInstanceOf[js.Any] },
        "directConnectGatewayId" -> directConnectGatewayId.map { x => x.asInstanceOf[js.Any] },
        "asn" -> asn.map { x => x.asInstanceOf[js.Any] },
        "virtualGatewayId" -> virtualGatewayId.map { x => x.asInstanceOf[js.Any] },
        "vlan" -> vlan.map { x => x.asInstanceOf[js.Any] },
        "mtu" -> mtu.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceName" -> virtualInterfaceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NewPrivateVirtualInterface]
    }
  }

  /**
   * <p>Information about a private virtual interface to be provisioned on a connection.</p>
   */
  @js.native
  trait NewPrivateVirtualInterfaceAllocation extends js.Object {
    var authKey: js.UndefOr[BGPAuthKey]
    var addressFamily: js.UndefOr[AddressFamily]
    var amazonAddress: js.UndefOr[AmazonAddress]
    var customerAddress: js.UndefOr[CustomerAddress]
    var asn: js.UndefOr[ASN]
    var vlan: js.UndefOr[VLAN]
    var mtu: js.UndefOr[MTU]
    var virtualInterfaceName: js.UndefOr[VirtualInterfaceName]
  }

  object NewPrivateVirtualInterfaceAllocation {
    def apply(
      authKey: js.UndefOr[BGPAuthKey] = js.undefined,
      addressFamily: js.UndefOr[AddressFamily] = js.undefined,
      amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
      customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
      asn: js.UndefOr[ASN] = js.undefined,
      vlan: js.UndefOr[VLAN] = js.undefined,
      mtu: js.UndefOr[MTU] = js.undefined,
      virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.undefined): NewPrivateVirtualInterfaceAllocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authKey" -> authKey.map { x => x.asInstanceOf[js.Any] },
        "addressFamily" -> addressFamily.map { x => x.asInstanceOf[js.Any] },
        "amazonAddress" -> amazonAddress.map { x => x.asInstanceOf[js.Any] },
        "customerAddress" -> customerAddress.map { x => x.asInstanceOf[js.Any] },
        "asn" -> asn.map { x => x.asInstanceOf[js.Any] },
        "vlan" -> vlan.map { x => x.asInstanceOf[js.Any] },
        "mtu" -> mtu.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceName" -> virtualInterfaceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NewPrivateVirtualInterfaceAllocation]
    }
  }

  /**
   * <p>Information about a public virtual interface.</p>
   */
  @js.native
  trait NewPublicVirtualInterface extends js.Object {
    var authKey: js.UndefOr[BGPAuthKey]
    var addressFamily: js.UndefOr[AddressFamily]
    var amazonAddress: js.UndefOr[AmazonAddress]
    var routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList]
    var customerAddress: js.UndefOr[CustomerAddress]
    var asn: js.UndefOr[ASN]
    var vlan: js.UndefOr[VLAN]
    var virtualInterfaceName: js.UndefOr[VirtualInterfaceName]
  }

  object NewPublicVirtualInterface {
    def apply(
      authKey: js.UndefOr[BGPAuthKey] = js.undefined,
      addressFamily: js.UndefOr[AddressFamily] = js.undefined,
      amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
      routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList] = js.undefined,
      customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
      asn: js.UndefOr[ASN] = js.undefined,
      vlan: js.UndefOr[VLAN] = js.undefined,
      virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.undefined): NewPublicVirtualInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authKey" -> authKey.map { x => x.asInstanceOf[js.Any] },
        "addressFamily" -> addressFamily.map { x => x.asInstanceOf[js.Any] },
        "amazonAddress" -> amazonAddress.map { x => x.asInstanceOf[js.Any] },
        "routeFilterPrefixes" -> routeFilterPrefixes.map { x => x.asInstanceOf[js.Any] },
        "customerAddress" -> customerAddress.map { x => x.asInstanceOf[js.Any] },
        "asn" -> asn.map { x => x.asInstanceOf[js.Any] },
        "vlan" -> vlan.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceName" -> virtualInterfaceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NewPublicVirtualInterface]
    }
  }

  /**
   * <p>Information about a public virtual interface to be provisioned on a connection.</p>
   */
  @js.native
  trait NewPublicVirtualInterfaceAllocation extends js.Object {
    var authKey: js.UndefOr[BGPAuthKey]
    var addressFamily: js.UndefOr[AddressFamily]
    var amazonAddress: js.UndefOr[AmazonAddress]
    var routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList]
    var customerAddress: js.UndefOr[CustomerAddress]
    var asn: js.UndefOr[ASN]
    var vlan: js.UndefOr[VLAN]
    var virtualInterfaceName: js.UndefOr[VirtualInterfaceName]
  }

  object NewPublicVirtualInterfaceAllocation {
    def apply(
      authKey: js.UndefOr[BGPAuthKey] = js.undefined,
      addressFamily: js.UndefOr[AddressFamily] = js.undefined,
      amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
      routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList] = js.undefined,
      customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
      asn: js.UndefOr[ASN] = js.undefined,
      vlan: js.UndefOr[VLAN] = js.undefined,
      virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.undefined): NewPublicVirtualInterfaceAllocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authKey" -> authKey.map { x => x.asInstanceOf[js.Any] },
        "addressFamily" -> addressFamily.map { x => x.asInstanceOf[js.Any] },
        "amazonAddress" -> amazonAddress.map { x => x.asInstanceOf[js.Any] },
        "routeFilterPrefixes" -> routeFilterPrefixes.map { x => x.asInstanceOf[js.Any] },
        "customerAddress" -> customerAddress.map { x => x.asInstanceOf[js.Any] },
        "asn" -> asn.map { x => x.asInstanceOf[js.Any] },
        "vlan" -> vlan.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceName" -> virtualInterfaceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NewPublicVirtualInterfaceAllocation]
    }
  }

  /**
   * <p>Information about a tag associated with an AWS Direct Connect resource.</p>
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
   * <p>Information about a route filter prefix that a customer can advertise through Border Gateway Protocol (BGP) over a public virtual interface.</p>
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
   * <p>Information about a tag.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var key: js.UndefOr[TagKey]
    var value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      key: js.UndefOr[TagKey] = js.undefined,
      value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: js.UndefOr[ResourceArn]
    var tags: js.UndefOr[TagList]
  }

  object TagResourceRequest {
    def apply(
      resourceArn: js.UndefOr[ResourceArn] = js.undefined,
      tags: js.UndefOr[TagList] = js.undefined): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var resourceArn: js.UndefOr[ResourceArn]
    var tagKeys: js.UndefOr[TagKeyList]
  }

  object UntagResourceRequest {
    def apply(
      resourceArn: js.UndefOr[ResourceArn] = js.undefined,
      tagKeys: js.UndefOr[TagKeyList] = js.undefined): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] },
        "tagKeys" -> tagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var lagId: js.UndefOr[LagId]
    var lagName: js.UndefOr[LagName]
    var minimumLinks: js.UndefOr[Count]
  }

  object UpdateLagRequest {
    def apply(
      lagId: js.UndefOr[LagId] = js.undefined,
      lagName: js.UndefOr[LagName] = js.undefined,
      minimumLinks: js.UndefOr[Count] = js.undefined): UpdateLagRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lagId" -> lagId.map { x => x.asInstanceOf[js.Any] },
        "lagName" -> lagName.map { x => x.asInstanceOf[js.Any] },
        "minimumLinks" -> minimumLinks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLagRequest]
    }
  }

  @js.native
  trait UpdateVirtualInterfaceAttributesRequest extends js.Object {
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
    var mtu: js.UndefOr[MTU]
  }

  object UpdateVirtualInterfaceAttributesRequest {
    def apply(
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined,
      mtu: js.UndefOr[MTU] = js.undefined): UpdateVirtualInterfaceAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualInterfaceId" -> virtualInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "mtu" -> mtu.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateVirtualInterfaceAttributesRequest]
    }
  }

  /**
   * <p>Information about a virtual private gateway for a private virtual interface.</p>
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
   * <p>Information about a virtual interface.</p>
   */
  @js.native
  trait VirtualInterface extends js.Object {
    var authKey: js.UndefOr[BGPAuthKey]
    var virtualInterfaceType: js.UndefOr[VirtualInterfaceType]
    var location: js.UndefOr[LocationCode]
    var addressFamily: js.UndefOr[AddressFamily]
    var amazonAddress: js.UndefOr[AmazonAddress]
    var routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList]
    var customerAddress: js.UndefOr[CustomerAddress]
    var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId]
    var awsDeviceV2: js.UndefOr[AwsDeviceV2]
    var asn: js.UndefOr[ASN]
    var virtualGatewayId: js.UndefOr[VirtualGatewayId]
    var vlan: js.UndefOr[VLAN]
    var connectionId: js.UndefOr[ConnectionId]
    var customerRouterConfig: js.UndefOr[RouterConfig]
    var region: js.UndefOr[Region]
    var mtu: js.UndefOr[MTU]
    var virtualInterfaceId: js.UndefOr[VirtualInterfaceId]
    var jumboFrameCapable: js.UndefOr[JumboFrameCapable]
    var ownerAccount: js.UndefOr[OwnerAccount]
    var bgpPeers: js.UndefOr[BGPPeerList]
    var amazonSideAsn: js.UndefOr[LongAsn]
    var virtualInterfaceState: js.UndefOr[VirtualInterfaceState]
    var virtualInterfaceName: js.UndefOr[VirtualInterfaceName]
  }

  object VirtualInterface {
    def apply(
      authKey: js.UndefOr[BGPAuthKey] = js.undefined,
      virtualInterfaceType: js.UndefOr[VirtualInterfaceType] = js.undefined,
      location: js.UndefOr[LocationCode] = js.undefined,
      addressFamily: js.UndefOr[AddressFamily] = js.undefined,
      amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
      routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList] = js.undefined,
      customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
      directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined,
      awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined,
      asn: js.UndefOr[ASN] = js.undefined,
      virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined,
      vlan: js.UndefOr[VLAN] = js.undefined,
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      customerRouterConfig: js.UndefOr[RouterConfig] = js.undefined,
      region: js.UndefOr[Region] = js.undefined,
      mtu: js.UndefOr[MTU] = js.undefined,
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined,
      jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined,
      ownerAccount: js.UndefOr[OwnerAccount] = js.undefined,
      bgpPeers: js.UndefOr[BGPPeerList] = js.undefined,
      amazonSideAsn: js.UndefOr[LongAsn] = js.undefined,
      virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.undefined,
      virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.undefined): VirtualInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authKey" -> authKey.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceType" -> virtualInterfaceType.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "addressFamily" -> addressFamily.map { x => x.asInstanceOf[js.Any] },
        "amazonAddress" -> amazonAddress.map { x => x.asInstanceOf[js.Any] },
        "routeFilterPrefixes" -> routeFilterPrefixes.map { x => x.asInstanceOf[js.Any] },
        "customerAddress" -> customerAddress.map { x => x.asInstanceOf[js.Any] },
        "directConnectGatewayId" -> directConnectGatewayId.map { x => x.asInstanceOf[js.Any] },
        "awsDeviceV2" -> awsDeviceV2.map { x => x.asInstanceOf[js.Any] },
        "asn" -> asn.map { x => x.asInstanceOf[js.Any] },
        "virtualGatewayId" -> virtualGatewayId.map { x => x.asInstanceOf[js.Any] },
        "vlan" -> vlan.map { x => x.asInstanceOf[js.Any] },
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] },
        "customerRouterConfig" -> customerRouterConfig.map { x => x.asInstanceOf[js.Any] },
        "region" -> region.map { x => x.asInstanceOf[js.Any] },
        "mtu" -> mtu.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceId" -> virtualInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "jumboFrameCapable" -> jumboFrameCapable.map { x => x.asInstanceOf[js.Any] },
        "ownerAccount" -> ownerAccount.map { x => x.asInstanceOf[js.Any] },
        "bgpPeers" -> bgpPeers.map { x => x.asInstanceOf[js.Any] },
        "amazonSideAsn" -> amazonSideAsn.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceState" -> virtualInterfaceState.map { x => x.asInstanceOf[js.Any] },
        "virtualInterfaceName" -> virtualInterfaceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
