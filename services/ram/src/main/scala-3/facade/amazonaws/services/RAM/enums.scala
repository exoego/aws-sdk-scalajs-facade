package facade.amazonaws.services.ram

import scalajs._

type ResourceOwner = "SELF" | "OTHER-ACCOUNTS"
object ResourceOwner {
  inline val SELF: "SELF" = "SELF"
  inline val `OTHER-ACCOUNTS`: "OTHER-ACCOUNTS" = "OTHER-ACCOUNTS"

  inline def values: js.Array[ResourceOwner] = js.Array(SELF, `OTHER-ACCOUNTS`)
}

type ResourceShareAssociationStatus = "ASSOCIATING" | "ASSOCIATED" | "FAILED" | "DISASSOCIATING" | "DISASSOCIATED"
object ResourceShareAssociationStatus {
  inline val ASSOCIATING: "ASSOCIATING" = "ASSOCIATING"
  inline val ASSOCIATED: "ASSOCIATED" = "ASSOCIATED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val DISASSOCIATING: "DISASSOCIATING" = "DISASSOCIATING"
  inline val DISASSOCIATED: "DISASSOCIATED" = "DISASSOCIATED"

  inline def values: js.Array[ResourceShareAssociationStatus] = js.Array(ASSOCIATING, ASSOCIATED, FAILED, DISASSOCIATING, DISASSOCIATED)
}

type ResourceShareAssociationType = "PRINCIPAL" | "RESOURCE"
object ResourceShareAssociationType {
  inline val PRINCIPAL: "PRINCIPAL" = "PRINCIPAL"
  inline val RESOURCE: "RESOURCE" = "RESOURCE"

  inline def values: js.Array[ResourceShareAssociationType] = js.Array(PRINCIPAL, RESOURCE)
}

type ResourceShareFeatureSet = "CREATED_FROM_POLICY" | "PROMOTING_TO_STANDARD" | "STANDARD"
object ResourceShareFeatureSet {
  inline val CREATED_FROM_POLICY: "CREATED_FROM_POLICY" = "CREATED_FROM_POLICY"
  inline val PROMOTING_TO_STANDARD: "PROMOTING_TO_STANDARD" = "PROMOTING_TO_STANDARD"
  inline val STANDARD: "STANDARD" = "STANDARD"

  inline def values: js.Array[ResourceShareFeatureSet] = js.Array(CREATED_FROM_POLICY, PROMOTING_TO_STANDARD, STANDARD)
}

type ResourceShareInvitationStatus = "PENDING" | "ACCEPTED" | "REJECTED" | "EXPIRED"
object ResourceShareInvitationStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val ACCEPTED: "ACCEPTED" = "ACCEPTED"
  inline val REJECTED: "REJECTED" = "REJECTED"
  inline val EXPIRED: "EXPIRED" = "EXPIRED"

  inline def values: js.Array[ResourceShareInvitationStatus] = js.Array(PENDING, ACCEPTED, REJECTED, EXPIRED)
}

type ResourceShareStatus = "PENDING" | "ACTIVE" | "FAILED" | "DELETING" | "DELETED"
object ResourceShareStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val FAILED: "FAILED" = "FAILED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[ResourceShareStatus] = js.Array(PENDING, ACTIVE, FAILED, DELETING, DELETED)
}

type ResourceStatus = "AVAILABLE" | "ZONAL_RESOURCE_INACCESSIBLE" | "LIMIT_EXCEEDED" | "UNAVAILABLE" | "PENDING"
object ResourceStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val ZONAL_RESOURCE_INACCESSIBLE: "ZONAL_RESOURCE_INACCESSIBLE" = "ZONAL_RESOURCE_INACCESSIBLE"
  inline val LIMIT_EXCEEDED: "LIMIT_EXCEEDED" = "LIMIT_EXCEEDED"
  inline val UNAVAILABLE: "UNAVAILABLE" = "UNAVAILABLE"
  inline val PENDING: "PENDING" = "PENDING"

  inline def values: js.Array[ResourceStatus] = js.Array(AVAILABLE, ZONAL_RESOURCE_INACCESSIBLE, LIMIT_EXCEEDED, UNAVAILABLE, PENDING)
}
