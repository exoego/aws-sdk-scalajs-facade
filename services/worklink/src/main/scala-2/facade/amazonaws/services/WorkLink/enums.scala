package facade.amazonaws.services.worklink

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AuthorizationProviderType extends js.Any
object AuthorizationProviderType {
  val SAML = "SAML".asInstanceOf[AuthorizationProviderType]

  @inline def values = js.Array(SAML)
}

@js.native
sealed trait DeviceStatus extends js.Any
object DeviceStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[DeviceStatus]
  val SIGNED_OUT = "SIGNED_OUT".asInstanceOf[DeviceStatus]

  @inline def values = js.Array(ACTIVE, SIGNED_OUT)
}

@js.native
sealed trait DomainStatus extends js.Any
object DomainStatus {
  val PENDING_VALIDATION = "PENDING_VALIDATION".asInstanceOf[DomainStatus]
  val ASSOCIATING = "ASSOCIATING".asInstanceOf[DomainStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[DomainStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[DomainStatus]
  val DISASSOCIATING = "DISASSOCIATING".asInstanceOf[DomainStatus]
  val DISASSOCIATED = "DISASSOCIATED".asInstanceOf[DomainStatus]
  val FAILED_TO_ASSOCIATE = "FAILED_TO_ASSOCIATE".asInstanceOf[DomainStatus]
  val FAILED_TO_DISASSOCIATE = "FAILED_TO_DISASSOCIATE".asInstanceOf[DomainStatus]

  @inline def values = js.Array(PENDING_VALIDATION, ASSOCIATING, ACTIVE, INACTIVE, DISASSOCIATING, DISASSOCIATED, FAILED_TO_ASSOCIATE, FAILED_TO_DISASSOCIATE)
}

@js.native
sealed trait FleetStatus extends js.Any
object FleetStatus {
  val CREATING = "CREATING".asInstanceOf[FleetStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[FleetStatus]
  val DELETING = "DELETING".asInstanceOf[FleetStatus]
  val DELETED = "DELETED".asInstanceOf[FleetStatus]
  val FAILED_TO_CREATE = "FAILED_TO_CREATE".asInstanceOf[FleetStatus]
  val FAILED_TO_DELETE = "FAILED_TO_DELETE".asInstanceOf[FleetStatus]

  @inline def values = js.Array(CREATING, ACTIVE, DELETING, DELETED, FAILED_TO_CREATE, FAILED_TO_DELETE)
}

@js.native
sealed trait IdentityProviderType extends js.Any
object IdentityProviderType {
  val SAML = "SAML".asInstanceOf[IdentityProviderType]

  @inline def values = js.Array(SAML)
}

