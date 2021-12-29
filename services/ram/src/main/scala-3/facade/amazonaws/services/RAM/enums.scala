package facade.amazonaws.services.ram

import scalajs._

type ResourceOwner = "SELF" | "OTHER-ACCOUNTS"
object ResourceOwner {
  val SELF: "SELF" = "SELF"
  val `OTHER-ACCOUNTS`: "OTHER-ACCOUNTS" = "OTHER-ACCOUNTS"

  @inline def values = js.Array[ResourceOwner](SELF, `OTHER-ACCOUNTS`)
}

type ResourceShareAssociationStatus = "ASSOCIATING" | "ASSOCIATED" | "FAILED" | "DISASSOCIATING" | "DISASSOCIATED"
object ResourceShareAssociationStatus {
  val ASSOCIATING: "ASSOCIATING" = "ASSOCIATING"
  val ASSOCIATED: "ASSOCIATED" = "ASSOCIATED"
  val FAILED: "FAILED" = "FAILED"
  val DISASSOCIATING: "DISASSOCIATING" = "DISASSOCIATING"
  val DISASSOCIATED: "DISASSOCIATED" = "DISASSOCIATED"

  @inline def values = js.Array[ResourceShareAssociationStatus](ASSOCIATING, ASSOCIATED, FAILED, DISASSOCIATING, DISASSOCIATED)
}

type ResourceShareAssociationType = "PRINCIPAL" | "RESOURCE"
object ResourceShareAssociationType {
  val PRINCIPAL: "PRINCIPAL" = "PRINCIPAL"
  val RESOURCE: "RESOURCE" = "RESOURCE"

  @inline def values = js.Array[ResourceShareAssociationType](PRINCIPAL, RESOURCE)
}

type ResourceShareFeatureSet = "CREATED_FROM_POLICY" | "PROMOTING_TO_STANDARD" | "STANDARD"
object ResourceShareFeatureSet {
  val CREATED_FROM_POLICY: "CREATED_FROM_POLICY" = "CREATED_FROM_POLICY"
  val PROMOTING_TO_STANDARD: "PROMOTING_TO_STANDARD" = "PROMOTING_TO_STANDARD"
  val STANDARD: "STANDARD" = "STANDARD"

  @inline def values = js.Array[ResourceShareFeatureSet](CREATED_FROM_POLICY, PROMOTING_TO_STANDARD, STANDARD)
}

type ResourceShareInvitationStatus = "PENDING" | "ACCEPTED" | "REJECTED" | "EXPIRED"
object ResourceShareInvitationStatus {
  val PENDING: "PENDING" = "PENDING"
  val ACCEPTED: "ACCEPTED" = "ACCEPTED"
  val REJECTED: "REJECTED" = "REJECTED"
  val EXPIRED: "EXPIRED" = "EXPIRED"

  @inline def values = js.Array[ResourceShareInvitationStatus](PENDING, ACCEPTED, REJECTED, EXPIRED)
}

type ResourceShareStatus = "PENDING" | "ACTIVE" | "FAILED" | "DELETING" | "DELETED"
object ResourceShareStatus {
  val PENDING: "PENDING" = "PENDING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val FAILED: "FAILED" = "FAILED"
  val DELETING: "DELETING" = "DELETING"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[ResourceShareStatus](PENDING, ACTIVE, FAILED, DELETING, DELETED)
}

type ResourceStatus = "AVAILABLE" | "ZONAL_RESOURCE_INACCESSIBLE" | "LIMIT_EXCEEDED" | "UNAVAILABLE" | "PENDING"
object ResourceStatus {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val ZONAL_RESOURCE_INACCESSIBLE: "ZONAL_RESOURCE_INACCESSIBLE" = "ZONAL_RESOURCE_INACCESSIBLE"
  val LIMIT_EXCEEDED: "LIMIT_EXCEEDED" = "LIMIT_EXCEEDED"
  val UNAVAILABLE: "UNAVAILABLE" = "UNAVAILABLE"
  val PENDING: "PENDING" = "PENDING"

  @inline def values = js.Array[ResourceStatus](AVAILABLE, ZONAL_RESOURCE_INACCESSIBLE, LIMIT_EXCEEDED, UNAVAILABLE, PENDING)
}
