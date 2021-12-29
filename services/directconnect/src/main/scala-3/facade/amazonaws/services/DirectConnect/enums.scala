package facade.amazonaws.services.directconnect

import scalajs._

type AddressFamily = "ipv4" | "ipv6"
object AddressFamily {
  val ipv4: "ipv4" = "ipv4"
  val ipv6: "ipv6" = "ipv6"

  @inline def values = js.Array[AddressFamily](ipv4, ipv6)
}

type BGPPeerState = "verifying" | "pending" | "available" | "deleting" | "deleted"
object BGPPeerState {
  val verifying: "verifying" = "verifying"
  val pending: "pending" = "pending"
  val available: "available" = "available"
  val deleting: "deleting" = "deleting"
  val deleted: "deleted" = "deleted"

  @inline def values = js.Array[BGPPeerState](verifying, pending, available, deleting, deleted)
}

type BGPStatus = "up" | "down" | "unknown"
object BGPStatus {
  val up: "up" = "up"
  val down: "down" = "down"
  val unknown: "unknown" = "unknown"

  @inline def values = js.Array[BGPStatus](up, down, unknown)
}

type ConnectionState = "ordering" | "requested" | "pending" | "available" | "down" | "deleting" | "deleted" | "rejected" | "unknown"
object ConnectionState {
  val ordering: "ordering" = "ordering"
  val requested: "requested" = "requested"
  val pending: "pending" = "pending"
  val available: "available" = "available"
  val down: "down" = "down"
  val deleting: "deleting" = "deleting"
  val deleted: "deleted" = "deleted"
  val rejected: "rejected" = "rejected"
  val unknown: "unknown" = "unknown"

  @inline def values = js.Array[ConnectionState](ordering, requested, pending, available, down, deleting, deleted, rejected, unknown)
}

type DirectConnectGatewayAssociationProposalState = "requested" | "accepted" | "deleted"
object DirectConnectGatewayAssociationProposalState {
  val requested: "requested" = "requested"
  val accepted: "accepted" = "accepted"
  val deleted: "deleted" = "deleted"

  @inline def values = js.Array[DirectConnectGatewayAssociationProposalState](requested, accepted, deleted)
}

type DirectConnectGatewayAssociationState = "associating" | "associated" | "disassociating" | "disassociated" | "updating"
object DirectConnectGatewayAssociationState {
  val associating: "associating" = "associating"
  val associated: "associated" = "associated"
  val disassociating: "disassociating" = "disassociating"
  val disassociated: "disassociated" = "disassociated"
  val updating: "updating" = "updating"

  @inline def values = js.Array[DirectConnectGatewayAssociationState](associating, associated, disassociating, disassociated, updating)
}

type DirectConnectGatewayAttachmentState = "attaching" | "attached" | "detaching" | "detached"
object DirectConnectGatewayAttachmentState {
  val attaching: "attaching" = "attaching"
  val attached: "attached" = "attached"
  val detaching: "detaching" = "detaching"
  val detached: "detached" = "detached"

  @inline def values = js.Array[DirectConnectGatewayAttachmentState](attaching, attached, detaching, detached)
}

type DirectConnectGatewayAttachmentType = "TransitVirtualInterface" | "PrivateVirtualInterface"
object DirectConnectGatewayAttachmentType {
  val TransitVirtualInterface: "TransitVirtualInterface" = "TransitVirtualInterface"
  val PrivateVirtualInterface: "PrivateVirtualInterface" = "PrivateVirtualInterface"

  @inline def values = js.Array[DirectConnectGatewayAttachmentType](TransitVirtualInterface, PrivateVirtualInterface)
}

type DirectConnectGatewayState = "pending" | "available" | "deleting" | "deleted"
object DirectConnectGatewayState {
  val pending: "pending" = "pending"
  val available: "available" = "available"
  val deleting: "deleting" = "deleting"
  val deleted: "deleted" = "deleted"

  @inline def values = js.Array[DirectConnectGatewayState](pending, available, deleting, deleted)
}

type GatewayType = "virtualPrivateGateway" | "transitGateway"
object GatewayType {
  val virtualPrivateGateway: "virtualPrivateGateway" = "virtualPrivateGateway"
  val transitGateway: "transitGateway" = "transitGateway"

  @inline def values = js.Array[GatewayType](virtualPrivateGateway, transitGateway)
}

type HasLogicalRedundancy = "unknown" | "yes" | "no"
object HasLogicalRedundancy {
  val unknown: "unknown" = "unknown"
  val yes: "yes" = "yes"
  val no: "no" = "no"

  @inline def values = js.Array[HasLogicalRedundancy](unknown, yes, no)
}

type InterconnectState = "requested" | "pending" | "available" | "down" | "deleting" | "deleted" | "unknown"
object InterconnectState {
  val requested: "requested" = "requested"
  val pending: "pending" = "pending"
  val available: "available" = "available"
  val down: "down" = "down"
  val deleting: "deleting" = "deleting"
  val deleted: "deleted" = "deleted"
  val unknown: "unknown" = "unknown"

  @inline def values = js.Array[InterconnectState](requested, pending, available, down, deleting, deleted, unknown)
}

type LagState = "requested" | "pending" | "available" | "down" | "deleting" | "deleted" | "unknown"
object LagState {
  val requested: "requested" = "requested"
  val pending: "pending" = "pending"
  val available: "available" = "available"
  val down: "down" = "down"
  val deleting: "deleting" = "deleting"
  val deleted: "deleted" = "deleted"
  val unknown: "unknown" = "unknown"

  @inline def values = js.Array[LagState](requested, pending, available, down, deleting, deleted, unknown)
}

type LoaContentType = "application/pdf"
object LoaContentType {
  val `application/pdf`: "application/pdf" = "application/pdf"

  @inline def values = js.Array[LoaContentType](`application/pdf`)
}

type VirtualInterfaceState = "confirming" | "verifying" | "pending" | "available" | "down" | "deleting" | "deleted" | "rejected" | "unknown"
object VirtualInterfaceState {
  val confirming: "confirming" = "confirming"
  val verifying: "verifying" = "verifying"
  val pending: "pending" = "pending"
  val available: "available" = "available"
  val down: "down" = "down"
  val deleting: "deleting" = "deleting"
  val deleted: "deleted" = "deleted"
  val rejected: "rejected" = "rejected"
  val unknown: "unknown" = "unknown"

  @inline def values = js.Array[VirtualInterfaceState](confirming, verifying, pending, available, down, deleting, deleted, rejected, unknown)
}
