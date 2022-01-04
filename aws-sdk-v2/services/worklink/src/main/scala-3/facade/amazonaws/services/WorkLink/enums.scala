package facade.amazonaws.services.worklink

import scalajs.js

type AuthorizationProviderType = "SAML"
object AuthorizationProviderType {
  inline val SAML: "SAML" = "SAML"

  inline def values: js.Array[AuthorizationProviderType] = js.Array(SAML)
}

type DeviceStatus = "ACTIVE" | "SIGNED_OUT"
object DeviceStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val SIGNED_OUT: "SIGNED_OUT" = "SIGNED_OUT"

  inline def values: js.Array[DeviceStatus] = js.Array(ACTIVE, SIGNED_OUT)
}

type DomainStatus = "PENDING_VALIDATION" | "ASSOCIATING" | "ACTIVE" | "INACTIVE" | "DISASSOCIATING" | "DISASSOCIATED" | "FAILED_TO_ASSOCIATE" | "FAILED_TO_DISASSOCIATE"
object DomainStatus {
  inline val PENDING_VALIDATION: "PENDING_VALIDATION" = "PENDING_VALIDATION"
  inline val ASSOCIATING: "ASSOCIATING" = "ASSOCIATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val DISASSOCIATING: "DISASSOCIATING" = "DISASSOCIATING"
  inline val DISASSOCIATED: "DISASSOCIATED" = "DISASSOCIATED"
  inline val FAILED_TO_ASSOCIATE: "FAILED_TO_ASSOCIATE" = "FAILED_TO_ASSOCIATE"
  inline val FAILED_TO_DISASSOCIATE: "FAILED_TO_DISASSOCIATE" = "FAILED_TO_DISASSOCIATE"

  inline def values: js.Array[DomainStatus] = js.Array(PENDING_VALIDATION, ASSOCIATING, ACTIVE, INACTIVE, DISASSOCIATING, DISASSOCIATED, FAILED_TO_ASSOCIATE, FAILED_TO_DISASSOCIATE)
}

type FleetStatus = "CREATING" | "ACTIVE" | "DELETING" | "DELETED" | "FAILED_TO_CREATE" | "FAILED_TO_DELETE"
object FleetStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val FAILED_TO_CREATE: "FAILED_TO_CREATE" = "FAILED_TO_CREATE"
  inline val FAILED_TO_DELETE: "FAILED_TO_DELETE" = "FAILED_TO_DELETE"

  inline def values: js.Array[FleetStatus] = js.Array(CREATING, ACTIVE, DELETING, DELETED, FAILED_TO_CREATE, FAILED_TO_DELETE)
}

type IdentityProviderType = "SAML"
object IdentityProviderType {
  inline val SAML: "SAML" = "SAML"

  inline def values: js.Array[IdentityProviderType] = js.Array(SAML)
}
