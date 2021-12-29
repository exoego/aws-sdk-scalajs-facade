package facade.amazonaws.services.networkmanager

import scalajs._

type ConnectionState = "PENDING" | "AVAILABLE" | "DELETING" | "UPDATING"
object ConnectionState {
  val PENDING: "PENDING" = "PENDING"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val DELETING: "DELETING" = "DELETING"
  val UPDATING: "UPDATING" = "UPDATING"

  @inline def values = js.Array[ConnectionState](PENDING, AVAILABLE, DELETING, UPDATING)
}

type CustomerGatewayAssociationState = "PENDING" | "AVAILABLE" | "DELETING" | "DELETED"
object CustomerGatewayAssociationState {
  val PENDING: "PENDING" = "PENDING"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val DELETING: "DELETING" = "DELETING"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[CustomerGatewayAssociationState](PENDING, AVAILABLE, DELETING, DELETED)
}

type DeviceState = "PENDING" | "AVAILABLE" | "DELETING" | "UPDATING"
object DeviceState {
  val PENDING: "PENDING" = "PENDING"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val DELETING: "DELETING" = "DELETING"
  val UPDATING: "UPDATING" = "UPDATING"

  @inline def values = js.Array[DeviceState](PENDING, AVAILABLE, DELETING, UPDATING)
}

type GlobalNetworkState = "PENDING" | "AVAILABLE" | "DELETING" | "UPDATING"
object GlobalNetworkState {
  val PENDING: "PENDING" = "PENDING"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val DELETING: "DELETING" = "DELETING"
  val UPDATING: "UPDATING" = "UPDATING"

  @inline def values = js.Array[GlobalNetworkState](PENDING, AVAILABLE, DELETING, UPDATING)
}

type LinkAssociationState = "PENDING" | "AVAILABLE" | "DELETING" | "DELETED"
object LinkAssociationState {
  val PENDING: "PENDING" = "PENDING"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val DELETING: "DELETING" = "DELETING"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[LinkAssociationState](PENDING, AVAILABLE, DELETING, DELETED)
}

type LinkState = "PENDING" | "AVAILABLE" | "DELETING" | "UPDATING"
object LinkState {
  val PENDING: "PENDING" = "PENDING"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val DELETING: "DELETING" = "DELETING"
  val UPDATING: "UPDATING" = "UPDATING"

  @inline def values = js.Array[LinkState](PENDING, AVAILABLE, DELETING, UPDATING)
}

type SiteState = "PENDING" | "AVAILABLE" | "DELETING" | "UPDATING"
object SiteState {
  val PENDING: "PENDING" = "PENDING"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val DELETING: "DELETING" = "DELETING"
  val UPDATING: "UPDATING" = "UPDATING"

  @inline def values = js.Array[SiteState](PENDING, AVAILABLE, DELETING, UPDATING)
}

type TransitGatewayConnectPeerAssociationState = "PENDING" | "AVAILABLE" | "DELETING" | "DELETED"
object TransitGatewayConnectPeerAssociationState {
  val PENDING: "PENDING" = "PENDING"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val DELETING: "DELETING" = "DELETING"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[TransitGatewayConnectPeerAssociationState](PENDING, AVAILABLE, DELETING, DELETED)
}

type TransitGatewayRegistrationState = "PENDING" | "AVAILABLE" | "DELETING" | "DELETED" | "FAILED"
object TransitGatewayRegistrationState {
  val PENDING: "PENDING" = "PENDING"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val DELETING: "DELETING" = "DELETING"
  val DELETED: "DELETED" = "DELETED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[TransitGatewayRegistrationState](PENDING, AVAILABLE, DELETING, DELETED, FAILED)
}
