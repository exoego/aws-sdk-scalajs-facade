package facade.amazonaws.services.networkmanager

import scalajs._

type ConnectionState = "PENDING" | "AVAILABLE" | "DELETING" | "UPDATING"
object ConnectionState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[ConnectionState] = js.Array(PENDING, AVAILABLE, DELETING, UPDATING)
}

type CustomerGatewayAssociationState = "PENDING" | "AVAILABLE" | "DELETING" | "DELETED"
object CustomerGatewayAssociationState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[CustomerGatewayAssociationState] = js.Array(PENDING, AVAILABLE, DELETING, DELETED)
}

type DeviceState = "PENDING" | "AVAILABLE" | "DELETING" | "UPDATING"
object DeviceState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[DeviceState] = js.Array(PENDING, AVAILABLE, DELETING, UPDATING)
}

type GlobalNetworkState = "PENDING" | "AVAILABLE" | "DELETING" | "UPDATING"
object GlobalNetworkState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[GlobalNetworkState] = js.Array(PENDING, AVAILABLE, DELETING, UPDATING)
}

type LinkAssociationState = "PENDING" | "AVAILABLE" | "DELETING" | "DELETED"
object LinkAssociationState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[LinkAssociationState] = js.Array(PENDING, AVAILABLE, DELETING, DELETED)
}

type LinkState = "PENDING" | "AVAILABLE" | "DELETING" | "UPDATING"
object LinkState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[LinkState] = js.Array(PENDING, AVAILABLE, DELETING, UPDATING)
}

type SiteState = "PENDING" | "AVAILABLE" | "DELETING" | "UPDATING"
object SiteState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[SiteState] = js.Array(PENDING, AVAILABLE, DELETING, UPDATING)
}

type TransitGatewayConnectPeerAssociationState = "PENDING" | "AVAILABLE" | "DELETING" | "DELETED"
object TransitGatewayConnectPeerAssociationState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[TransitGatewayConnectPeerAssociationState] = js.Array(PENDING, AVAILABLE, DELETING, DELETED)
}

type TransitGatewayRegistrationState = "PENDING" | "AVAILABLE" | "DELETING" | "DELETED" | "FAILED"
object TransitGatewayRegistrationState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[TransitGatewayRegistrationState] = js.Array(PENDING, AVAILABLE, DELETING, DELETED, FAILED)
}
