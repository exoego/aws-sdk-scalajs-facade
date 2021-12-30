package facade.amazonaws.services.directconnect

import scalajs.js

type AddressFamily = "ipv4" | "ipv6"
object AddressFamily {
  inline val ipv4: "ipv4" = "ipv4"
  inline val ipv6: "ipv6" = "ipv6"

  inline def values: js.Array[AddressFamily] = js.Array(ipv4, ipv6)
}

type BGPPeerState = "verifying" | "pending" | "available" | "deleting" | "deleted"
object BGPPeerState {
  inline val verifying: "verifying" = "verifying"
  inline val pending: "pending" = "pending"
  inline val available: "available" = "available"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"

  inline def values: js.Array[BGPPeerState] = js.Array(verifying, pending, available, deleting, deleted)
}

type BGPStatus = "up" | "down" | "unknown"
object BGPStatus {
  inline val up: "up" = "up"
  inline val down: "down" = "down"
  inline val unknown: "unknown" = "unknown"

  inline def values: js.Array[BGPStatus] = js.Array(up, down, unknown)
}

type ConnectionState = "ordering" | "requested" | "pending" | "available" | "down" | "deleting" | "deleted" | "rejected" | "unknown"
object ConnectionState {
  inline val ordering: "ordering" = "ordering"
  inline val requested: "requested" = "requested"
  inline val pending: "pending" = "pending"
  inline val available: "available" = "available"
  inline val down: "down" = "down"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"
  inline val rejected: "rejected" = "rejected"
  inline val unknown: "unknown" = "unknown"

  inline def values: js.Array[ConnectionState] = js.Array(ordering, requested, pending, available, down, deleting, deleted, rejected, unknown)
}

type DirectConnectGatewayAssociationProposalState = "requested" | "accepted" | "deleted"
object DirectConnectGatewayAssociationProposalState {
  inline val requested: "requested" = "requested"
  inline val accepted: "accepted" = "accepted"
  inline val deleted: "deleted" = "deleted"

  inline def values: js.Array[DirectConnectGatewayAssociationProposalState] = js.Array(requested, accepted, deleted)
}

type DirectConnectGatewayAssociationState = "associating" | "associated" | "disassociating" | "disassociated" | "updating"
object DirectConnectGatewayAssociationState {
  inline val associating: "associating" = "associating"
  inline val associated: "associated" = "associated"
  inline val disassociating: "disassociating" = "disassociating"
  inline val disassociated: "disassociated" = "disassociated"
  inline val updating: "updating" = "updating"

  inline def values: js.Array[DirectConnectGatewayAssociationState] = js.Array(associating, associated, disassociating, disassociated, updating)
}

type DirectConnectGatewayAttachmentState = "attaching" | "attached" | "detaching" | "detached"
object DirectConnectGatewayAttachmentState {
  inline val attaching: "attaching" = "attaching"
  inline val attached: "attached" = "attached"
  inline val detaching: "detaching" = "detaching"
  inline val detached: "detached" = "detached"

  inline def values: js.Array[DirectConnectGatewayAttachmentState] = js.Array(attaching, attached, detaching, detached)
}

type DirectConnectGatewayAttachmentType = "TransitVirtualInterface" | "PrivateVirtualInterface"
object DirectConnectGatewayAttachmentType {
  inline val TransitVirtualInterface: "TransitVirtualInterface" = "TransitVirtualInterface"
  inline val PrivateVirtualInterface: "PrivateVirtualInterface" = "PrivateVirtualInterface"

  inline def values: js.Array[DirectConnectGatewayAttachmentType] = js.Array(TransitVirtualInterface, PrivateVirtualInterface)
}

type DirectConnectGatewayState = "pending" | "available" | "deleting" | "deleted"
object DirectConnectGatewayState {
  inline val pending: "pending" = "pending"
  inline val available: "available" = "available"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"

  inline def values: js.Array[DirectConnectGatewayState] = js.Array(pending, available, deleting, deleted)
}

type GatewayType = "virtualPrivateGateway" | "transitGateway"
object GatewayType {
  inline val virtualPrivateGateway: "virtualPrivateGateway" = "virtualPrivateGateway"
  inline val transitGateway: "transitGateway" = "transitGateway"

  inline def values: js.Array[GatewayType] = js.Array(virtualPrivateGateway, transitGateway)
}

type HasLogicalRedundancy = "unknown" | "yes" | "no"
object HasLogicalRedundancy {
  inline val unknown: "unknown" = "unknown"
  inline val yes: "yes" = "yes"
  inline val no: "no" = "no"

  inline def values: js.Array[HasLogicalRedundancy] = js.Array(unknown, yes, no)
}

type InterconnectState = "requested" | "pending" | "available" | "down" | "deleting" | "deleted" | "unknown"
object InterconnectState {
  inline val requested: "requested" = "requested"
  inline val pending: "pending" = "pending"
  inline val available: "available" = "available"
  inline val down: "down" = "down"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"
  inline val unknown: "unknown" = "unknown"

  inline def values: js.Array[InterconnectState] = js.Array(requested, pending, available, down, deleting, deleted, unknown)
}

type LagState = "requested" | "pending" | "available" | "down" | "deleting" | "deleted" | "unknown"
object LagState {
  inline val requested: "requested" = "requested"
  inline val pending: "pending" = "pending"
  inline val available: "available" = "available"
  inline val down: "down" = "down"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"
  inline val unknown: "unknown" = "unknown"

  inline def values: js.Array[LagState] = js.Array(requested, pending, available, down, deleting, deleted, unknown)
}

type LoaContentType = "application/pdf"
object LoaContentType {
  inline val `application/pdf`: "application/pdf" = "application/pdf"

  inline def values: js.Array[LoaContentType] = js.Array(`application/pdf`)
}

type VirtualInterfaceState = "confirming" | "verifying" | "pending" | "available" | "down" | "deleting" | "deleted" | "rejected" | "unknown"
object VirtualInterfaceState {
  inline val confirming: "confirming" = "confirming"
  inline val verifying: "verifying" = "verifying"
  inline val pending: "pending" = "pending"
  inline val available: "available" = "available"
  inline val down: "down" = "down"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"
  inline val rejected: "rejected" = "rejected"
  inline val unknown: "unknown" = "unknown"

  inline def values: js.Array[VirtualInterfaceState] = js.Array(confirming, verifying, pending, available, down, deleting, deleted, rejected, unknown)
}
