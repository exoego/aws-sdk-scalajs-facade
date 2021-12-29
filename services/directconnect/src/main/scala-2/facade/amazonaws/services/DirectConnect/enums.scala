package facade.amazonaws.services.directconnect

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AddressFamily extends js.Any
object AddressFamily {
  val ipv4 = "ipv4".asInstanceOf[AddressFamily]
  val ipv6 = "ipv6".asInstanceOf[AddressFamily]

  @inline def values = js.Array(ipv4, ipv6)
}

@js.native
sealed trait BGPPeerState extends js.Any
object BGPPeerState {
  val verifying = "verifying".asInstanceOf[BGPPeerState]
  val pending = "pending".asInstanceOf[BGPPeerState]
  val available = "available".asInstanceOf[BGPPeerState]
  val deleting = "deleting".asInstanceOf[BGPPeerState]
  val deleted = "deleted".asInstanceOf[BGPPeerState]

  @inline def values = js.Array(verifying, pending, available, deleting, deleted)
}

@js.native
sealed trait BGPStatus extends js.Any
object BGPStatus {
  val up = "up".asInstanceOf[BGPStatus]
  val down = "down".asInstanceOf[BGPStatus]
  val unknown = "unknown".asInstanceOf[BGPStatus]

  @inline def values = js.Array(up, down, unknown)
}

@js.native
sealed trait ConnectionState extends js.Any
object ConnectionState {
  val ordering = "ordering".asInstanceOf[ConnectionState]
  val requested = "requested".asInstanceOf[ConnectionState]
  val pending = "pending".asInstanceOf[ConnectionState]
  val available = "available".asInstanceOf[ConnectionState]
  val down = "down".asInstanceOf[ConnectionState]
  val deleting = "deleting".asInstanceOf[ConnectionState]
  val deleted = "deleted".asInstanceOf[ConnectionState]
  val rejected = "rejected".asInstanceOf[ConnectionState]
  val unknown = "unknown".asInstanceOf[ConnectionState]

  @inline def values = js.Array(ordering, requested, pending, available, down, deleting, deleted, rejected, unknown)
}

@js.native
sealed trait DirectConnectGatewayAssociationProposalState extends js.Any
object DirectConnectGatewayAssociationProposalState {
  val requested = "requested".asInstanceOf[DirectConnectGatewayAssociationProposalState]
  val accepted = "accepted".asInstanceOf[DirectConnectGatewayAssociationProposalState]
  val deleted = "deleted".asInstanceOf[DirectConnectGatewayAssociationProposalState]

  @inline def values = js.Array(requested, accepted, deleted)
}

@js.native
sealed trait DirectConnectGatewayAssociationState extends js.Any
object DirectConnectGatewayAssociationState {
  val associating = "associating".asInstanceOf[DirectConnectGatewayAssociationState]
  val associated = "associated".asInstanceOf[DirectConnectGatewayAssociationState]
  val disassociating = "disassociating".asInstanceOf[DirectConnectGatewayAssociationState]
  val disassociated = "disassociated".asInstanceOf[DirectConnectGatewayAssociationState]
  val updating = "updating".asInstanceOf[DirectConnectGatewayAssociationState]

  @inline def values = js.Array(associating, associated, disassociating, disassociated, updating)
}

@js.native
sealed trait DirectConnectGatewayAttachmentState extends js.Any
object DirectConnectGatewayAttachmentState {
  val attaching = "attaching".asInstanceOf[DirectConnectGatewayAttachmentState]
  val attached = "attached".asInstanceOf[DirectConnectGatewayAttachmentState]
  val detaching = "detaching".asInstanceOf[DirectConnectGatewayAttachmentState]
  val detached = "detached".asInstanceOf[DirectConnectGatewayAttachmentState]

  @inline def values = js.Array(attaching, attached, detaching, detached)
}

@js.native
sealed trait DirectConnectGatewayAttachmentType extends js.Any
object DirectConnectGatewayAttachmentType {
  val TransitVirtualInterface = "TransitVirtualInterface".asInstanceOf[DirectConnectGatewayAttachmentType]
  val PrivateVirtualInterface = "PrivateVirtualInterface".asInstanceOf[DirectConnectGatewayAttachmentType]

  @inline def values = js.Array(TransitVirtualInterface, PrivateVirtualInterface)
}

@js.native
sealed trait DirectConnectGatewayState extends js.Any
object DirectConnectGatewayState {
  val pending = "pending".asInstanceOf[DirectConnectGatewayState]
  val available = "available".asInstanceOf[DirectConnectGatewayState]
  val deleting = "deleting".asInstanceOf[DirectConnectGatewayState]
  val deleted = "deleted".asInstanceOf[DirectConnectGatewayState]

  @inline def values = js.Array(pending, available, deleting, deleted)
}

@js.native
sealed trait GatewayType extends js.Any
object GatewayType {
  val virtualPrivateGateway = "virtualPrivateGateway".asInstanceOf[GatewayType]
  val transitGateway = "transitGateway".asInstanceOf[GatewayType]

  @inline def values = js.Array(virtualPrivateGateway, transitGateway)
}

@js.native
sealed trait HasLogicalRedundancy extends js.Any
object HasLogicalRedundancy {
  val unknown = "unknown".asInstanceOf[HasLogicalRedundancy]
  val yes = "yes".asInstanceOf[HasLogicalRedundancy]
  val no = "no".asInstanceOf[HasLogicalRedundancy]

  @inline def values = js.Array(unknown, yes, no)
}

@js.native
sealed trait InterconnectState extends js.Any
object InterconnectState {
  val requested = "requested".asInstanceOf[InterconnectState]
  val pending = "pending".asInstanceOf[InterconnectState]
  val available = "available".asInstanceOf[InterconnectState]
  val down = "down".asInstanceOf[InterconnectState]
  val deleting = "deleting".asInstanceOf[InterconnectState]
  val deleted = "deleted".asInstanceOf[InterconnectState]
  val unknown = "unknown".asInstanceOf[InterconnectState]

  @inline def values = js.Array(requested, pending, available, down, deleting, deleted, unknown)
}

@js.native
sealed trait LagState extends js.Any
object LagState {
  val requested = "requested".asInstanceOf[LagState]
  val pending = "pending".asInstanceOf[LagState]
  val available = "available".asInstanceOf[LagState]
  val down = "down".asInstanceOf[LagState]
  val deleting = "deleting".asInstanceOf[LagState]
  val deleted = "deleted".asInstanceOf[LagState]
  val unknown = "unknown".asInstanceOf[LagState]

  @inline def values = js.Array(requested, pending, available, down, deleting, deleted, unknown)
}

@js.native
sealed trait LoaContentType extends js.Any
object LoaContentType {
  val `application/pdf` = "application/pdf".asInstanceOf[LoaContentType]

  @inline def values = js.Array(`application/pdf`)
}

@js.native
sealed trait VirtualInterfaceState extends js.Any
object VirtualInterfaceState {
  val confirming = "confirming".asInstanceOf[VirtualInterfaceState]
  val verifying = "verifying".asInstanceOf[VirtualInterfaceState]
  val pending = "pending".asInstanceOf[VirtualInterfaceState]
  val available = "available".asInstanceOf[VirtualInterfaceState]
  val down = "down".asInstanceOf[VirtualInterfaceState]
  val deleting = "deleting".asInstanceOf[VirtualInterfaceState]
  val deleted = "deleted".asInstanceOf[VirtualInterfaceState]
  val rejected = "rejected".asInstanceOf[VirtualInterfaceState]
  val unknown = "unknown".asInstanceOf[VirtualInterfaceState]

  @inline def values = js.Array(confirming, verifying, pending, available, down, deleting, deleted, rejected, unknown)
}

