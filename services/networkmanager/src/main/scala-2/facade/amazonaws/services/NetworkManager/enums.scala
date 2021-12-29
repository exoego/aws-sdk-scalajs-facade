package facade.amazonaws.services.networkmanager

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ConnectionState extends js.Any
object ConnectionState {
  val PENDING = "PENDING".asInstanceOf[ConnectionState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[ConnectionState]
  val DELETING = "DELETING".asInstanceOf[ConnectionState]
  val UPDATING = "UPDATING".asInstanceOf[ConnectionState]

  @inline def values = js.Array(PENDING, AVAILABLE, DELETING, UPDATING)
}

@js.native
sealed trait CustomerGatewayAssociationState extends js.Any
object CustomerGatewayAssociationState {
  val PENDING = "PENDING".asInstanceOf[CustomerGatewayAssociationState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[CustomerGatewayAssociationState]
  val DELETING = "DELETING".asInstanceOf[CustomerGatewayAssociationState]
  val DELETED = "DELETED".asInstanceOf[CustomerGatewayAssociationState]

  @inline def values = js.Array(PENDING, AVAILABLE, DELETING, DELETED)
}

@js.native
sealed trait DeviceState extends js.Any
object DeviceState {
  val PENDING = "PENDING".asInstanceOf[DeviceState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[DeviceState]
  val DELETING = "DELETING".asInstanceOf[DeviceState]
  val UPDATING = "UPDATING".asInstanceOf[DeviceState]

  @inline def values = js.Array(PENDING, AVAILABLE, DELETING, UPDATING)
}

@js.native
sealed trait GlobalNetworkState extends js.Any
object GlobalNetworkState {
  val PENDING = "PENDING".asInstanceOf[GlobalNetworkState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[GlobalNetworkState]
  val DELETING = "DELETING".asInstanceOf[GlobalNetworkState]
  val UPDATING = "UPDATING".asInstanceOf[GlobalNetworkState]

  @inline def values = js.Array(PENDING, AVAILABLE, DELETING, UPDATING)
}

@js.native
sealed trait LinkAssociationState extends js.Any
object LinkAssociationState {
  val PENDING = "PENDING".asInstanceOf[LinkAssociationState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[LinkAssociationState]
  val DELETING = "DELETING".asInstanceOf[LinkAssociationState]
  val DELETED = "DELETED".asInstanceOf[LinkAssociationState]

  @inline def values = js.Array(PENDING, AVAILABLE, DELETING, DELETED)
}

@js.native
sealed trait LinkState extends js.Any
object LinkState {
  val PENDING = "PENDING".asInstanceOf[LinkState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[LinkState]
  val DELETING = "DELETING".asInstanceOf[LinkState]
  val UPDATING = "UPDATING".asInstanceOf[LinkState]

  @inline def values = js.Array(PENDING, AVAILABLE, DELETING, UPDATING)
}

@js.native
sealed trait SiteState extends js.Any
object SiteState {
  val PENDING = "PENDING".asInstanceOf[SiteState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[SiteState]
  val DELETING = "DELETING".asInstanceOf[SiteState]
  val UPDATING = "UPDATING".asInstanceOf[SiteState]

  @inline def values = js.Array(PENDING, AVAILABLE, DELETING, UPDATING)
}

@js.native
sealed trait TransitGatewayConnectPeerAssociationState extends js.Any
object TransitGatewayConnectPeerAssociationState {
  val PENDING = "PENDING".asInstanceOf[TransitGatewayConnectPeerAssociationState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[TransitGatewayConnectPeerAssociationState]
  val DELETING = "DELETING".asInstanceOf[TransitGatewayConnectPeerAssociationState]
  val DELETED = "DELETED".asInstanceOf[TransitGatewayConnectPeerAssociationState]

  @inline def values = js.Array(PENDING, AVAILABLE, DELETING, DELETED)
}

@js.native
sealed trait TransitGatewayRegistrationState extends js.Any
object TransitGatewayRegistrationState {
  val PENDING = "PENDING".asInstanceOf[TransitGatewayRegistrationState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[TransitGatewayRegistrationState]
  val DELETING = "DELETING".asInstanceOf[TransitGatewayRegistrationState]
  val DELETED = "DELETED".asInstanceOf[TransitGatewayRegistrationState]
  val FAILED = "FAILED".asInstanceOf[TransitGatewayRegistrationState]

  @inline def values = js.Array(PENDING, AVAILABLE, DELETING, DELETED, FAILED)
}

