package facade.amazonaws.services.worklink

import scalajs._

type AuthorizationProviderType = "SAML"
object AuthorizationProviderType {
  val SAML: "SAML" = "SAML"

  @inline def values = js.Array[AuthorizationProviderType](SAML)
}

type DeviceStatus = "ACTIVE" | "SIGNED_OUT"
object DeviceStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val SIGNED_OUT: "SIGNED_OUT" = "SIGNED_OUT"

  @inline def values = js.Array[DeviceStatus](ACTIVE, SIGNED_OUT)
}

type DomainStatus = "PENDING_VALIDATION" | "ASSOCIATING" | "ACTIVE" | "INACTIVE" | "DISASSOCIATING" | "DISASSOCIATED" | "FAILED_TO_ASSOCIATE" | "FAILED_TO_DISASSOCIATE"
object DomainStatus {
  val PENDING_VALIDATION: "PENDING_VALIDATION" = "PENDING_VALIDATION"
  val ASSOCIATING: "ASSOCIATING" = "ASSOCIATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val DISASSOCIATING: "DISASSOCIATING" = "DISASSOCIATING"
  val DISASSOCIATED: "DISASSOCIATED" = "DISASSOCIATED"
  val FAILED_TO_ASSOCIATE: "FAILED_TO_ASSOCIATE" = "FAILED_TO_ASSOCIATE"
  val FAILED_TO_DISASSOCIATE: "FAILED_TO_DISASSOCIATE" = "FAILED_TO_DISASSOCIATE"

  @inline def values = js.Array[DomainStatus](PENDING_VALIDATION, ASSOCIATING, ACTIVE, INACTIVE, DISASSOCIATING, DISASSOCIATED, FAILED_TO_ASSOCIATE, FAILED_TO_DISASSOCIATE)
}

type FleetStatus = "CREATING" | "ACTIVE" | "DELETING" | "DELETED" | "FAILED_TO_CREATE" | "FAILED_TO_DELETE"
object FleetStatus {
  val CREATING: "CREATING" = "CREATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"
  val DELETED: "DELETED" = "DELETED"
  val FAILED_TO_CREATE: "FAILED_TO_CREATE" = "FAILED_TO_CREATE"
  val FAILED_TO_DELETE: "FAILED_TO_DELETE" = "FAILED_TO_DELETE"

  @inline def values = js.Array[FleetStatus](CREATING, ACTIVE, DELETING, DELETED, FAILED_TO_CREATE, FAILED_TO_DELETE)
}

type IdentityProviderType = "SAML"
object IdentityProviderType {
  val SAML: "SAML" = "SAML"

  @inline def values = js.Array[IdentityProviderType](SAML)
}
