package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object directconnect {
  type ASN = Integer
  type AmazonAddress = String
  type BGPAuthKey = String
  type Bandwidth = String
  type CIDR = String
  type ConnectionId = String
  type ConnectionList = js.Array[Connection]
  type ConnectionName = String
  type ConnectionState = String
  type CustomerAddress = String
  type ErrorMessage = String
  type InterconnectId = String
  type InterconnectList = js.Array[Interconnect]
  type InterconnectName = String
  type InterconnectState = String
  type LocationCode = String
  type LocationList = js.Array[Location]
  type LocationName = String
  type OwnerAccount = String
  type PartnerName = String
  type Region = String
  type RouteFilterPrefixList = js.Array[RouteFilterPrefix]
  type RouterConfig = String
  type VLAN = Integer
  type VirtualGatewayId = String
  type VirtualGatewayList = js.Array[VirtualGateway]
  type VirtualGatewayState = String
  type VirtualInterfaceId = String
  type VirtualInterfaceList = js.Array[VirtualInterface]
  type VirtualInterfaceName = String
  type VirtualInterfaceState = String
  type VirtualInterfaceType = String
}

package directconnect {
  @js.native
  trait Directconnect extends js.Object {
    def allocateConnectionOnInterconnect(params: AllocateConnectionOnInterconnectRequest, callback: Callback[Connection]): Unit = js.native
    def allocateConnectionOnInterconnect(params: AllocateConnectionOnInterconnectRequest): Request[Connection] = js.native
    def allocatePrivateVirtualInterface(params: AllocatePrivateVirtualInterfaceRequest, callback: Callback[VirtualInterface]): Unit = js.native
    def allocatePrivateVirtualInterface(params: AllocatePrivateVirtualInterfaceRequest): Request[VirtualInterface] = js.native
    def allocatePublicVirtualInterface(params: AllocatePublicVirtualInterfaceRequest, callback: Callback[VirtualInterface]): Unit = js.native
    def allocatePublicVirtualInterface(params: AllocatePublicVirtualInterfaceRequest): Request[VirtualInterface] = js.native
    def confirmConnection(params: ConfirmConnectionRequest, callback: Callback[ConfirmConnectionResponse]): Unit = js.native
    def confirmConnection(params: ConfirmConnectionRequest): Request[ConfirmConnectionResponse] = js.native
    def confirmPrivateVirtualInterface(params: ConfirmPrivateVirtualInterfaceRequest, callback: Callback[ConfirmPrivateVirtualInterfaceResponse]): Unit = js.native
    def confirmPrivateVirtualInterface(params: ConfirmPrivateVirtualInterfaceRequest): Request[ConfirmPrivateVirtualInterfaceResponse] = js.native
    def confirmPublicVirtualInterface(params: ConfirmPublicVirtualInterfaceRequest, callback: Callback[ConfirmPublicVirtualInterfaceResponse]): Unit = js.native
    def confirmPublicVirtualInterface(params: ConfirmPublicVirtualInterfaceRequest): Request[ConfirmPublicVirtualInterfaceResponse] = js.native
    def createConnection(params: CreateConnectionRequest, callback: Callback[Connection]): Unit = js.native
    def createConnection(params: CreateConnectionRequest): Request[Connection] = js.native
    def createInterconnect(params: CreateInterconnectRequest, callback: Callback[Interconnect]): Unit = js.native
    def createInterconnect(params: CreateInterconnectRequest): Request[Interconnect] = js.native
    def createPrivateVirtualInterface(params: CreatePrivateVirtualInterfaceRequest, callback: Callback[VirtualInterface]): Unit = js.native
    def createPrivateVirtualInterface(params: CreatePrivateVirtualInterfaceRequest): Request[VirtualInterface] = js.native
    def createPublicVirtualInterface(params: CreatePublicVirtualInterfaceRequest, callback: Callback[VirtualInterface]): Unit = js.native
    def createPublicVirtualInterface(params: CreatePublicVirtualInterfaceRequest): Request[VirtualInterface] = js.native
    def deleteConnection(params: DeleteConnectionRequest, callback: Callback[Connection]): Unit = js.native
    def deleteConnection(params: DeleteConnectionRequest): Request[Connection] = js.native
    def deleteInterconnect(params: DeleteInterconnectRequest, callback: Callback[DeleteInterconnectResponse]): Unit = js.native
    def deleteInterconnect(params: DeleteInterconnectRequest): Request[DeleteInterconnectResponse] = js.native
    def deleteVirtualInterface(params: DeleteVirtualInterfaceRequest, callback: Callback[DeleteVirtualInterfaceResponse]): Unit = js.native
    def deleteVirtualInterface(params: DeleteVirtualInterfaceRequest): Request[DeleteVirtualInterfaceResponse] = js.native
    def describeConnections(params: DescribeConnectionsRequest, callback: Callback[Connections]): Unit = js.native
    def describeConnections(params: DescribeConnectionsRequest): Request[Connections] = js.native
    def describeConnectionsOnInterconnect(params: DescribeConnectionsOnInterconnectRequest, callback: Callback[Connections]): Unit = js.native
    def describeConnectionsOnInterconnect(params: DescribeConnectionsOnInterconnectRequest): Request[Connections] = js.native
    def describeInterconnects(params: DescribeInterconnectsRequest, callback: Callback[Interconnects]): Unit = js.native
    def describeInterconnects(params: DescribeInterconnectsRequest): Request[Interconnects] = js.native
    def describeLocations(callback: Callback[Locations]): Unit = js.native
    def describeLocations(): Request[Locations] = js.native
    def describeVirtualGateways(callback: Callback[VirtualGateways]): Unit = js.native
    def describeVirtualGateways(): Request[VirtualGateways] = js.native
    def describeVirtualInterfaces(params: DescribeVirtualInterfacesRequest, callback: Callback[VirtualInterfaces]): Unit = js.native
    def describeVirtualInterfaces(params: DescribeVirtualInterfacesRequest): Request[VirtualInterfaces] = js.native
  }

  /**
   * <p>Container for the parameters to the AllocateConnectionOnInterconnect operation.</p>
   */
  @js.native
  trait AllocateConnectionOnInterconnectRequest extends js.Object {
    var connectionName: ConnectionName
    var interconnectId: InterconnectId
    var bandwidth: Bandwidth
    var vlan: VLAN
    var ownerAccount: OwnerAccount
  }

  object AllocateConnectionOnInterconnectRequest {
    def apply(
      connectionName: js.UndefOr[ConnectionName] = js.undefined,
      interconnectId: js.UndefOr[InterconnectId] = js.undefined,
      bandwidth: js.UndefOr[Bandwidth] = js.undefined,
      vlan: js.UndefOr[VLAN] = js.undefined,
      ownerAccount: js.UndefOr[OwnerAccount] = js.undefined
    ): AllocateConnectionOnInterconnectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("connectionName" -> connectionName.map { x => x: js.Any }),
        ("interconnectId" -> interconnectId.map { x => x: js.Any }),
        ("bandwidth" -> bandwidth.map { x => x: js.Any }),
        ("vlan" -> vlan.map { x => x: js.Any }),
        ("ownerAccount" -> ownerAccount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocateConnectionOnInterconnectRequest]
    }
  }

  /**
   * <p>Container for the parameters to the AllocatePrivateVirtualInterface operation.</p>
   */
  @js.native
  trait AllocatePrivateVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var ownerAccount: OwnerAccount
    var newPrivateVirtualInterfaceAllocation: NewPrivateVirtualInterfaceAllocation
  }

  object AllocatePrivateVirtualInterfaceRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      ownerAccount: js.UndefOr[OwnerAccount] = js.undefined,
      newPrivateVirtualInterfaceAllocation: js.UndefOr[NewPrivateVirtualInterfaceAllocation] = js.undefined
    ): AllocatePrivateVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("connectionId" -> connectionId.map { x => x: js.Any }),
        ("ownerAccount" -> ownerAccount.map { x => x: js.Any }),
        ("newPrivateVirtualInterfaceAllocation" -> newPrivateVirtualInterfaceAllocation.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocatePrivateVirtualInterfaceRequest]
    }
  }

  /**
   * <p>Container for the parameters to the AllocatePublicVirtualInterface operation.</p>
   */
  @js.native
  trait AllocatePublicVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var ownerAccount: OwnerAccount
    var newPublicVirtualInterfaceAllocation: NewPublicVirtualInterfaceAllocation
  }

  object AllocatePublicVirtualInterfaceRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      ownerAccount: js.UndefOr[OwnerAccount] = js.undefined,
      newPublicVirtualInterfaceAllocation: js.UndefOr[NewPublicVirtualInterfaceAllocation] = js.undefined
    ): AllocatePublicVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("connectionId" -> connectionId.map { x => x: js.Any }),
        ("ownerAccount" -> ownerAccount.map { x => x: js.Any }),
        ("newPublicVirtualInterfaceAllocation" -> newPublicVirtualInterfaceAllocation.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocatePublicVirtualInterfaceRequest]
    }
  }

  /**
   * <p>Container for the parameters to the ConfirmConnection operation.</p>
   */
  @js.native
  trait ConfirmConnectionRequest extends js.Object {
    var connectionId: ConnectionId
  }

  object ConfirmConnectionRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined
    ): ConfirmConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("connectionId" -> connectionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmConnectionRequest]
    }
  }

  /**
   * <p>The response received when ConfirmConnection is called.</p>
   */
  @js.native
  trait ConfirmConnectionResponse extends js.Object {
    var connectionState: ConnectionState
  }

  object ConfirmConnectionResponse {
    def apply(
      connectionState: js.UndefOr[ConnectionState] = js.undefined
    ): ConfirmConnectionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("connectionState" -> connectionState.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmConnectionResponse]
    }
  }

  /**
   * <p>Container for the parameters to the ConfirmPrivateVirtualInterface operation.</p>
   */
  @js.native
  trait ConfirmPrivateVirtualInterfaceRequest extends js.Object {
    var virtualInterfaceId: VirtualInterfaceId
    var virtualGatewayId: VirtualGatewayId
  }

  object ConfirmPrivateVirtualInterfaceRequest {
    def apply(
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined,
      virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
    ): ConfirmPrivateVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("virtualInterfaceId" -> virtualInterfaceId.map { x => x: js.Any }),
        ("virtualGatewayId" -> virtualGatewayId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmPrivateVirtualInterfaceRequest]
    }
  }

  /**
   * <p>The response received when ConfirmPrivateVirtualInterface is called.</p>
   */
  @js.native
  trait ConfirmPrivateVirtualInterfaceResponse extends js.Object {
    var virtualInterfaceState: VirtualInterfaceState
  }

  object ConfirmPrivateVirtualInterfaceResponse {
    def apply(
      virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.undefined
    ): ConfirmPrivateVirtualInterfaceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("virtualInterfaceState" -> virtualInterfaceState.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmPrivateVirtualInterfaceResponse]
    }
  }

  /**
   * <p>Container for the parameters to the ConfirmPublicVirtualInterface operation.</p>
   */
  @js.native
  trait ConfirmPublicVirtualInterfaceRequest extends js.Object {
    var virtualInterfaceId: VirtualInterfaceId
  }

  object ConfirmPublicVirtualInterfaceRequest {
    def apply(
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
    ): ConfirmPublicVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("virtualInterfaceId" -> virtualInterfaceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmPublicVirtualInterfaceRequest]
    }
  }

  /**
   * <p>The response received when ConfirmPublicVirtualInterface is called.</p>
   */
  @js.native
  trait ConfirmPublicVirtualInterfaceResponse extends js.Object {
    var virtualInterfaceState: VirtualInterfaceState
  }

  object ConfirmPublicVirtualInterfaceResponse {
    def apply(
      virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.undefined
    ): ConfirmPublicVirtualInterfaceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("virtualInterfaceState" -> virtualInterfaceState.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmPublicVirtualInterfaceResponse]
    }
  }

  /**
   * <p>A connection represents the physical network connection between the AWS Direct Connect location and the customer.</p>
   */
  @js.native
  trait Connection extends js.Object {
    var connectionName: ConnectionName
    var location: LocationCode
    var partnerName: PartnerName
    var bandwidth: Bandwidth
    var connectionState: ConnectionState
    var vlan: VLAN
    var connectionId: ConnectionId
    var region: Region
    var ownerAccount: OwnerAccount
  }

  object Connection {
    def apply(
      connectionName: js.UndefOr[ConnectionName] = js.undefined,
      location: js.UndefOr[LocationCode] = js.undefined,
      partnerName: js.UndefOr[PartnerName] = js.undefined,
      bandwidth: js.UndefOr[Bandwidth] = js.undefined,
      connectionState: js.UndefOr[ConnectionState] = js.undefined,
      vlan: js.UndefOr[VLAN] = js.undefined,
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      region: js.UndefOr[Region] = js.undefined,
      ownerAccount: js.UndefOr[OwnerAccount] = js.undefined
    ): Connection = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("connectionName" -> connectionName.map { x => x: js.Any }),
        ("location" -> location.map { x => x: js.Any }),
        ("partnerName" -> partnerName.map { x => x: js.Any }),
        ("bandwidth" -> bandwidth.map { x => x: js.Any }),
        ("connectionState" -> connectionState.map { x => x: js.Any }),
        ("vlan" -> vlan.map { x => x: js.Any }),
        ("connectionId" -> connectionId.map { x => x: js.Any }),
        ("region" -> region.map { x => x: js.Any }),
        ("ownerAccount" -> ownerAccount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Connection]
    }
  }

  /**
   * State of the connection. <ul> <li> <b>Ordering</b>: The initial state of a hosted connection provisioned on an interconnect. The connection stays in the ordering state until the owner of the hosted connection confirms or declines the connection order.</li> <li> <b>Requested</b>: The initial state of a standard connection. The connection stays in the requested state until the Letter of Authorization (LOA) is sent to the customer.</li> <li> <b>Pending</b>: The connection has been approved, and is being initialized.</li> <li> <b>Available</b>: The network link is up, and the connection is ready for use.</li> <li> <b>Down</b>: The network link is down.</li> <li> <b>Deleted</b>: The connection has been deleted.</li> <li> <b>Rejected</b>: A hosted connection in the 'Ordering' state will enter the 'Rejected' state if it is deleted by the end customer.</li> </ul>
   */
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

  /**
   * <p>A structure containing a list of connections.</p>
   */
  @js.native
  trait Connections extends js.Object {
    var connections: ConnectionList
  }

  object Connections {
    def apply(
      connections: js.UndefOr[ConnectionList] = js.undefined
    ): Connections = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("connections" -> connections.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Connections]
    }
  }

  /**
   * <p>Container for the parameters to the CreateConnection operation.</p>
   */
  @js.native
  trait CreateConnectionRequest extends js.Object {
    var location: LocationCode
    var bandwidth: Bandwidth
    var connectionName: ConnectionName
  }

  object CreateConnectionRequest {
    def apply(
      location: js.UndefOr[LocationCode] = js.undefined,
      bandwidth: js.UndefOr[Bandwidth] = js.undefined,
      connectionName: js.UndefOr[ConnectionName] = js.undefined
    ): CreateConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("location" -> location.map { x => x: js.Any }),
        ("bandwidth" -> bandwidth.map { x => x: js.Any }),
        ("connectionName" -> connectionName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConnectionRequest]
    }
  }

  /**
   * <p>Container for the parameters to the CreateInterconnect operation.</p>
   */
  @js.native
  trait CreateInterconnectRequest extends js.Object {
    var interconnectName: InterconnectName
    var bandwidth: Bandwidth
    var location: LocationCode
  }

  object CreateInterconnectRequest {
    def apply(
      interconnectName: js.UndefOr[InterconnectName] = js.undefined,
      bandwidth: js.UndefOr[Bandwidth] = js.undefined,
      location: js.UndefOr[LocationCode] = js.undefined
    ): CreateInterconnectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("interconnectName" -> interconnectName.map { x => x: js.Any }),
        ("bandwidth" -> bandwidth.map { x => x: js.Any }),
        ("location" -> location.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInterconnectRequest]
    }
  }

  /**
   * <p>Container for the parameters to the CreatePrivateVirtualInterface operation.</p>
   */
  @js.native
  trait CreatePrivateVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var newPrivateVirtualInterface: NewPrivateVirtualInterface
  }

  object CreatePrivateVirtualInterfaceRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      newPrivateVirtualInterface: js.UndefOr[NewPrivateVirtualInterface] = js.undefined
    ): CreatePrivateVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("connectionId" -> connectionId.map { x => x: js.Any }),
        ("newPrivateVirtualInterface" -> newPrivateVirtualInterface.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePrivateVirtualInterfaceRequest]
    }
  }

  /**
   * <p>Container for the parameters to the CreatePublicVirtualInterface operation.</p>
   */
  @js.native
  trait CreatePublicVirtualInterfaceRequest extends js.Object {
    var connectionId: ConnectionId
    var newPublicVirtualInterface: NewPublicVirtualInterface
  }

  object CreatePublicVirtualInterfaceRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      newPublicVirtualInterface: js.UndefOr[NewPublicVirtualInterface] = js.undefined
    ): CreatePublicVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("connectionId" -> connectionId.map { x => x: js.Any }),
        ("newPublicVirtualInterface" -> newPublicVirtualInterface.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePublicVirtualInterfaceRequest]
    }
  }

  /**
   * <p>Container for the parameters to the DeleteConnection operation.</p>
   */
  @js.native
  trait DeleteConnectionRequest extends js.Object {
    var connectionId: ConnectionId
  }

  object DeleteConnectionRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined
    ): DeleteConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("connectionId" -> connectionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConnectionRequest]
    }
  }

  /**
   * <p>Container for the parameters to the DeleteInterconnect operation.</p>
   */
  @js.native
  trait DeleteInterconnectRequest extends js.Object {
    var interconnectId: InterconnectId
  }

  object DeleteInterconnectRequest {
    def apply(
      interconnectId: js.UndefOr[InterconnectId] = js.undefined
    ): DeleteInterconnectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("interconnectId" -> interconnectId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInterconnectRequest]
    }
  }

  /**
   * <p>The response received when DeleteInterconnect is called.</p>
   */
  @js.native
  trait DeleteInterconnectResponse extends js.Object {
    var interconnectState: InterconnectState
  }

  object DeleteInterconnectResponse {
    def apply(
      interconnectState: js.UndefOr[InterconnectState] = js.undefined
    ): DeleteInterconnectResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("interconnectState" -> interconnectState.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInterconnectResponse]
    }
  }

  /**
   * <p>Container for the parameters to the DeleteVirtualInterface operation.</p>
   */
  @js.native
  trait DeleteVirtualInterfaceRequest extends js.Object {
    var virtualInterfaceId: VirtualInterfaceId
  }

  object DeleteVirtualInterfaceRequest {
    def apply(
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
    ): DeleteVirtualInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("virtualInterfaceId" -> virtualInterfaceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVirtualInterfaceRequest]
    }
  }

  /**
   * <p>The response received when DeleteVirtualInterface is called.</p>
   */
  @js.native
  trait DeleteVirtualInterfaceResponse extends js.Object {
    var virtualInterfaceState: VirtualInterfaceState
  }

  object DeleteVirtualInterfaceResponse {
    def apply(
      virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.undefined
    ): DeleteVirtualInterfaceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("virtualInterfaceState" -> virtualInterfaceState.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVirtualInterfaceResponse]
    }
  }

  /**
   * <p>Container for the parameters to the DescribeConnectionsOnInterconnect operation.</p>
   */
  @js.native
  trait DescribeConnectionsOnInterconnectRequest extends js.Object {
    var interconnectId: InterconnectId
  }

  object DescribeConnectionsOnInterconnectRequest {
    def apply(
      interconnectId: js.UndefOr[InterconnectId] = js.undefined
    ): DescribeConnectionsOnInterconnectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("interconnectId" -> interconnectId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConnectionsOnInterconnectRequest]
    }
  }

  /**
   * <p>Container for the parameters to the DescribeConnections operation.</p>
   */
  @js.native
  trait DescribeConnectionsRequest extends js.Object {
    var connectionId: ConnectionId
  }

  object DescribeConnectionsRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined
    ): DescribeConnectionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("connectionId" -> connectionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConnectionsRequest]
    }
  }

  /**
   * <p>Container for the parameters to the DescribeInterconnects operation.</p>
   */
  @js.native
  trait DescribeInterconnectsRequest extends js.Object {
    var interconnectId: InterconnectId
  }

  object DescribeInterconnectsRequest {
    def apply(
      interconnectId: js.UndefOr[InterconnectId] = js.undefined
    ): DescribeInterconnectsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("interconnectId" -> interconnectId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInterconnectsRequest]
    }
  }

  /**
   * <p>Container for the parameters to the DescribeVirtualInterfaces operation.</p>
   */
  @js.native
  trait DescribeVirtualInterfacesRequest extends js.Object {
    var connectionId: ConnectionId
    var virtualInterfaceId: VirtualInterfaceId
  }

  object DescribeVirtualInterfacesRequest {
    def apply(
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
    ): DescribeVirtualInterfacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("connectionId" -> connectionId.map { x => x: js.Any }),
        ("virtualInterfaceId" -> virtualInterfaceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVirtualInterfacesRequest]
    }
  }

  /**
   * <p>The API was called with invalid parameters. The error message will contain additional details about the cause.</p>
   */
  @js.native
  trait DirectConnectClientExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>A server-side error occurred during the API call. The error message will contain additional details about the cause.</p>
   */
  @js.native
  trait DirectConnectServerExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>An interconnect is a connection that can host other connections.</p> <p>Like a standard AWS Direct Connect connection, an interconnect represents the physical connection between an AWS Direct Connect partner's network and a specific Direct Connect location. An AWS Direct Connect partner who owns an interconnect can provision hosted connections on the interconnect for their end customers, thereby providing the end customers with connectivity to AWS services.</p> <p>The resources of the interconnect, including bandwidth and VLAN numbers, are shared by all of the hosted connections on the interconnect, and the owner of the interconnect determines how these resources are assigned.</p>
   */
  @js.native
  trait Interconnect extends js.Object {
    var location: LocationCode
    var interconnectId: InterconnectId
    var interconnectState: InterconnectState
    var bandwidth: Bandwidth
    var region: Region
    var interconnectName: InterconnectName
  }

  object Interconnect {
    def apply(
      location: js.UndefOr[LocationCode] = js.undefined,
      interconnectId: js.UndefOr[InterconnectId] = js.undefined,
      interconnectState: js.UndefOr[InterconnectState] = js.undefined,
      bandwidth: js.UndefOr[Bandwidth] = js.undefined,
      region: js.UndefOr[Region] = js.undefined,
      interconnectName: js.UndefOr[InterconnectName] = js.undefined
    ): Interconnect = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("location" -> location.map { x => x: js.Any }),
        ("interconnectId" -> interconnectId.map { x => x: js.Any }),
        ("interconnectState" -> interconnectState.map { x => x: js.Any }),
        ("bandwidth" -> bandwidth.map { x => x: js.Any }),
        ("region" -> region.map { x => x: js.Any }),
        ("interconnectName" -> interconnectName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Interconnect]
    }
  }

  /**
   * State of the interconnect. <ul> <li> <b>Requested</b>: The initial state of an interconnect. The interconnect stays in the requested state until the Letter of Authorization (LOA) is sent to the customer.</li> <li> <b>Pending</b>: The interconnect has been approved, and is being initialized.</li> <li> <b>Available</b>: The network link is up, and the interconnect is ready for use.</li> <li> <b>Down</b>: The network link is down.</li> <li> <b>Deleted</b>: The interconnect has been deleted.</li> </ul>
   */
  object InterconnectStateEnum {
    val requested = "requested"
    val pending = "pending"
    val available = "available"
    val down = "down"
    val deleting = "deleting"
    val deleted = "deleted"

    val values = IndexedSeq(requested, pending, available, down, deleting, deleted)
  }

  /**
   * <p>A structure containing a list of interconnects.</p>
   */
  @js.native
  trait Interconnects extends js.Object {
    var interconnects: InterconnectList
  }

  object Interconnects {
    def apply(
      interconnects: js.UndefOr[InterconnectList] = js.undefined
    ): Interconnects = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("interconnects" -> interconnects.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Interconnects]
    }
  }

  /**
   * <p>An AWS Direct Connect location where connections and interconnects can be requested.</p>
   */
  @js.native
  trait Location extends js.Object {
    var locationCode: LocationCode
    var locationName: LocationName
  }

  object Location {
    def apply(
      locationCode: js.UndefOr[LocationCode] = js.undefined,
      locationName: js.UndefOr[LocationName] = js.undefined
    ): Location = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("locationCode" -> locationCode.map { x => x: js.Any }),
        ("locationName" -> locationName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Location]
    }
  }

  @js.native
  trait Locations extends js.Object {
    var locations: LocationList
  }

  object Locations {
    def apply(
      locations: js.UndefOr[LocationList] = js.undefined
    ): Locations = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("locations" -> locations.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Locations]
    }
  }

  /**
   * <p>A structure containing information about a new private virtual interface.</p>
   */
  @js.native
  trait NewPrivateVirtualInterface extends js.Object {
    var authKey: BGPAuthKey
    var amazonAddress: AmazonAddress
    var customerAddress: CustomerAddress
    var asn: ASN
    var virtualGatewayId: VirtualGatewayId
    var vlan: VLAN
    var virtualInterfaceName: VirtualInterfaceName
  }

  object NewPrivateVirtualInterface {
    def apply(
      authKey: js.UndefOr[BGPAuthKey] = js.undefined,
      amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
      customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
      asn: js.UndefOr[ASN] = js.undefined,
      virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined,
      vlan: js.UndefOr[VLAN] = js.undefined,
      virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.undefined
    ): NewPrivateVirtualInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("authKey" -> authKey.map { x => x: js.Any }),
        ("amazonAddress" -> amazonAddress.map { x => x: js.Any }),
        ("customerAddress" -> customerAddress.map { x => x: js.Any }),
        ("asn" -> asn.map { x => x: js.Any }),
        ("virtualGatewayId" -> virtualGatewayId.map { x => x: js.Any }),
        ("vlan" -> vlan.map { x => x: js.Any }),
        ("virtualInterfaceName" -> virtualInterfaceName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NewPrivateVirtualInterface]
    }
  }

  /**
   * <p>A structure containing information about a private virtual interface that will be provisioned on a connection.</p>
   */
  @js.native
  trait NewPrivateVirtualInterfaceAllocation extends js.Object {
    var authKey: BGPAuthKey
    var amazonAddress: AmazonAddress
    var customerAddress: CustomerAddress
    var asn: ASN
    var vlan: VLAN
    var virtualInterfaceName: VirtualInterfaceName
  }

  object NewPrivateVirtualInterfaceAllocation {
    def apply(
      authKey: js.UndefOr[BGPAuthKey] = js.undefined,
      amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
      customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
      asn: js.UndefOr[ASN] = js.undefined,
      vlan: js.UndefOr[VLAN] = js.undefined,
      virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.undefined
    ): NewPrivateVirtualInterfaceAllocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("authKey" -> authKey.map { x => x: js.Any }),
        ("amazonAddress" -> amazonAddress.map { x => x: js.Any }),
        ("customerAddress" -> customerAddress.map { x => x: js.Any }),
        ("asn" -> asn.map { x => x: js.Any }),
        ("vlan" -> vlan.map { x => x: js.Any }),
        ("virtualInterfaceName" -> virtualInterfaceName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NewPrivateVirtualInterfaceAllocation]
    }
  }

  /**
   * <p>A structure containing information about a new public virtual interface.</p>
   */
  @js.native
  trait NewPublicVirtualInterface extends js.Object {
    var authKey: BGPAuthKey
    var amazonAddress: AmazonAddress
    var routeFilterPrefixes: RouteFilterPrefixList
    var customerAddress: CustomerAddress
    var asn: ASN
    var vlan: VLAN
    var virtualInterfaceName: VirtualInterfaceName
  }

  object NewPublicVirtualInterface {
    def apply(
      authKey: js.UndefOr[BGPAuthKey] = js.undefined,
      amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
      routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList] = js.undefined,
      customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
      asn: js.UndefOr[ASN] = js.undefined,
      vlan: js.UndefOr[VLAN] = js.undefined,
      virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.undefined
    ): NewPublicVirtualInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("authKey" -> authKey.map { x => x: js.Any }),
        ("amazonAddress" -> amazonAddress.map { x => x: js.Any }),
        ("routeFilterPrefixes" -> routeFilterPrefixes.map { x => x: js.Any }),
        ("customerAddress" -> customerAddress.map { x => x: js.Any }),
        ("asn" -> asn.map { x => x: js.Any }),
        ("vlan" -> vlan.map { x => x: js.Any }),
        ("virtualInterfaceName" -> virtualInterfaceName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NewPublicVirtualInterface]
    }
  }

  /**
   * <p>A structure containing information about a public virtual interface that will be provisioned on a connection.</p>
   */
  @js.native
  trait NewPublicVirtualInterfaceAllocation extends js.Object {
    var authKey: BGPAuthKey
    var amazonAddress: AmazonAddress
    var routeFilterPrefixes: RouteFilterPrefixList
    var customerAddress: CustomerAddress
    var asn: ASN
    var vlan: VLAN
    var virtualInterfaceName: VirtualInterfaceName
  }

  object NewPublicVirtualInterfaceAllocation {
    def apply(
      authKey: js.UndefOr[BGPAuthKey] = js.undefined,
      amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
      routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList] = js.undefined,
      customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
      asn: js.UndefOr[ASN] = js.undefined,
      vlan: js.UndefOr[VLAN] = js.undefined,
      virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.undefined
    ): NewPublicVirtualInterfaceAllocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("authKey" -> authKey.map { x => x: js.Any }),
        ("amazonAddress" -> amazonAddress.map { x => x: js.Any }),
        ("routeFilterPrefixes" -> routeFilterPrefixes.map { x => x: js.Any }),
        ("customerAddress" -> customerAddress.map { x => x: js.Any }),
        ("asn" -> asn.map { x => x: js.Any }),
        ("vlan" -> vlan.map { x => x: js.Any }),
        ("virtualInterfaceName" -> virtualInterfaceName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NewPublicVirtualInterfaceAllocation]
    }
  }

  /**
   * <p>A route filter prefix that the customer can advertise through Border Gateway Protocol (BGP) over a public virtual interface.</p>
   */
  @js.native
  trait RouteFilterPrefix extends js.Object {
    var cidr: CIDR
  }

  object RouteFilterPrefix {
    def apply(
      cidr: js.UndefOr[CIDR] = js.undefined
    ): RouteFilterPrefix = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cidr" -> cidr.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RouteFilterPrefix]
    }
  }

  /**
   * <p>You can create one or more AWS Direct Connect private virtual interfaces linking to your virtual private gateway.</p> <p>Virtual private gateways can be managed using the Amazon Virtual Private Cloud (Amazon VPC) console or the <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">Amazon EC2 CreateVpnGateway action</a>.</p>
   */
  @js.native
  trait VirtualGateway extends js.Object {
    var virtualGatewayId: VirtualGatewayId
    var virtualGatewayState: VirtualGatewayState
  }

  object VirtualGateway {
    def apply(
      virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined,
      virtualGatewayState: js.UndefOr[VirtualGatewayState] = js.undefined
    ): VirtualGateway = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("virtualGatewayId" -> virtualGatewayId.map { x => x: js.Any }),
        ("virtualGatewayState" -> virtualGatewayState.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VirtualGateway]
    }
  }

  /**
   * <p>A structure containing a list of virtual private gateways.</p>
   */
  @js.native
  trait VirtualGateways extends js.Object {
    var virtualGateways: VirtualGatewayList
  }

  object VirtualGateways {
    def apply(
      virtualGateways: js.UndefOr[VirtualGatewayList] = js.undefined
    ): VirtualGateways = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("virtualGateways" -> virtualGateways.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VirtualGateways]
    }
  }

  /**
   * <p>A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer.</p>
   */
  @js.native
  trait VirtualInterface extends js.Object {
    var authKey: BGPAuthKey
    var virtualInterfaceType: VirtualInterfaceType
    var location: LocationCode
    var amazonAddress: AmazonAddress
    var routeFilterPrefixes: RouteFilterPrefixList
    var customerAddress: CustomerAddress
    var asn: ASN
    var virtualGatewayId: VirtualGatewayId
    var vlan: VLAN
    var connectionId: ConnectionId
    var customerRouterConfig: RouterConfig
    var virtualInterfaceId: VirtualInterfaceId
    var ownerAccount: OwnerAccount
    var virtualInterfaceState: VirtualInterfaceState
    var virtualInterfaceName: VirtualInterfaceName
  }

  object VirtualInterface {
    def apply(
      authKey: js.UndefOr[BGPAuthKey] = js.undefined,
      virtualInterfaceType: js.UndefOr[VirtualInterfaceType] = js.undefined,
      location: js.UndefOr[LocationCode] = js.undefined,
      amazonAddress: js.UndefOr[AmazonAddress] = js.undefined,
      routeFilterPrefixes: js.UndefOr[RouteFilterPrefixList] = js.undefined,
      customerAddress: js.UndefOr[CustomerAddress] = js.undefined,
      asn: js.UndefOr[ASN] = js.undefined,
      virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined,
      vlan: js.UndefOr[VLAN] = js.undefined,
      connectionId: js.UndefOr[ConnectionId] = js.undefined,
      customerRouterConfig: js.UndefOr[RouterConfig] = js.undefined,
      virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined,
      ownerAccount: js.UndefOr[OwnerAccount] = js.undefined,
      virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.undefined,
      virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.undefined
    ): VirtualInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("authKey" -> authKey.map { x => x: js.Any }),
        ("virtualInterfaceType" -> virtualInterfaceType.map { x => x: js.Any }),
        ("location" -> location.map { x => x: js.Any }),
        ("amazonAddress" -> amazonAddress.map { x => x: js.Any }),
        ("routeFilterPrefixes" -> routeFilterPrefixes.map { x => x: js.Any }),
        ("customerAddress" -> customerAddress.map { x => x: js.Any }),
        ("asn" -> asn.map { x => x: js.Any }),
        ("virtualGatewayId" -> virtualGatewayId.map { x => x: js.Any }),
        ("vlan" -> vlan.map { x => x: js.Any }),
        ("connectionId" -> connectionId.map { x => x: js.Any }),
        ("customerRouterConfig" -> customerRouterConfig.map { x => x: js.Any }),
        ("virtualInterfaceId" -> virtualInterfaceId.map { x => x: js.Any }),
        ("ownerAccount" -> ownerAccount.map { x => x: js.Any }),
        ("virtualInterfaceState" -> virtualInterfaceState.map { x => x: js.Any }),
        ("virtualInterfaceName" -> virtualInterfaceName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VirtualInterface]
    }
  }

  /**
   * State of the virtual interface. <ul> <li> <b>Confirming</b>: The creation of the virtual interface is pending confirmation from the virtual interface owner. If the owner of the virtual interface is different from the owner of the connection on which it is provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface owner.</li> <li> <b>Verifying</b>: This state only applies to public virtual interfaces. Each public virtual interface needs validation before the virtual interface can be created.</li> <li> <b>Pending</b>: A virtual interface is in this state from the time that it is created until the virtual interface is ready to forward traffic.</li> <li> <b>Available</b>: A virtual interface that is able to forward traffic.</li> <li> <b>Deleting</b>: A virtual interface is in this state immediately after calling <i>DeleteVirtualInterface</i> until it can no longer forward traffic.</li> <li> <b>Deleted</b>: A virtual interface that cannot forward traffic.</li> <li> <b>Rejected</b>: The virtual interface owner has declined creation of the virtual interface. If a virtual interface in the 'Confirming' state is deleted by the virtual interface owner, the virtual interface will enter the 'Rejected' state.</li> </ul>
   */
  object VirtualInterfaceStateEnum {
    val confirming = "confirming"
    val verifying = "verifying"
    val pending = "pending"
    val available = "available"
    val deleting = "deleting"
    val deleted = "deleted"
    val rejected = "rejected"

    val values = IndexedSeq(confirming, verifying, pending, available, deleting, deleted, rejected)
  }

  /**
   * <p>A structure containing a list of virtual interfaces.</p>
   */
  @js.native
  trait VirtualInterfaces extends js.Object {
    var virtualInterfaces: VirtualInterfaceList
  }

  object VirtualInterfaces {
    def apply(
      virtualInterfaces: js.UndefOr[VirtualInterfaceList] = js.undefined
    ): VirtualInterfaces = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("virtualInterfaces" -> virtualInterfaces.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VirtualInterfaces]
    }
  }
}
