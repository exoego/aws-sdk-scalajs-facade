package facade.amazonaws.services.ram

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ResourceOwner extends js.Any
object ResourceOwner {
  val SELF = "SELF".asInstanceOf[ResourceOwner]
  val `OTHER-ACCOUNTS` = "OTHER-ACCOUNTS".asInstanceOf[ResourceOwner]

  @inline def values = js.Array(SELF, `OTHER-ACCOUNTS`)
}

@js.native
sealed trait ResourceShareAssociationStatus extends js.Any
object ResourceShareAssociationStatus {
  val ASSOCIATING = "ASSOCIATING".asInstanceOf[ResourceShareAssociationStatus]
  val ASSOCIATED = "ASSOCIATED".asInstanceOf[ResourceShareAssociationStatus]
  val FAILED = "FAILED".asInstanceOf[ResourceShareAssociationStatus]
  val DISASSOCIATING = "DISASSOCIATING".asInstanceOf[ResourceShareAssociationStatus]
  val DISASSOCIATED = "DISASSOCIATED".asInstanceOf[ResourceShareAssociationStatus]

  @inline def values = js.Array(ASSOCIATING, ASSOCIATED, FAILED, DISASSOCIATING, DISASSOCIATED)
}

@js.native
sealed trait ResourceShareAssociationType extends js.Any
object ResourceShareAssociationType {
  val PRINCIPAL = "PRINCIPAL".asInstanceOf[ResourceShareAssociationType]
  val RESOURCE = "RESOURCE".asInstanceOf[ResourceShareAssociationType]

  @inline def values = js.Array(PRINCIPAL, RESOURCE)
}

@js.native
sealed trait ResourceShareFeatureSet extends js.Any
object ResourceShareFeatureSet {
  val CREATED_FROM_POLICY = "CREATED_FROM_POLICY".asInstanceOf[ResourceShareFeatureSet]
  val PROMOTING_TO_STANDARD = "PROMOTING_TO_STANDARD".asInstanceOf[ResourceShareFeatureSet]
  val STANDARD = "STANDARD".asInstanceOf[ResourceShareFeatureSet]

  @inline def values = js.Array(CREATED_FROM_POLICY, PROMOTING_TO_STANDARD, STANDARD)
}

@js.native
sealed trait ResourceShareInvitationStatus extends js.Any
object ResourceShareInvitationStatus {
  val PENDING = "PENDING".asInstanceOf[ResourceShareInvitationStatus]
  val ACCEPTED = "ACCEPTED".asInstanceOf[ResourceShareInvitationStatus]
  val REJECTED = "REJECTED".asInstanceOf[ResourceShareInvitationStatus]
  val EXPIRED = "EXPIRED".asInstanceOf[ResourceShareInvitationStatus]

  @inline def values = js.Array(PENDING, ACCEPTED, REJECTED, EXPIRED)
}

@js.native
sealed trait ResourceShareStatus extends js.Any
object ResourceShareStatus {
  val PENDING = "PENDING".asInstanceOf[ResourceShareStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[ResourceShareStatus]
  val FAILED = "FAILED".asInstanceOf[ResourceShareStatus]
  val DELETING = "DELETING".asInstanceOf[ResourceShareStatus]
  val DELETED = "DELETED".asInstanceOf[ResourceShareStatus]

  @inline def values = js.Array(PENDING, ACTIVE, FAILED, DELETING, DELETED)
}

@js.native
sealed trait ResourceStatus extends js.Any
object ResourceStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[ResourceStatus]
  val ZONAL_RESOURCE_INACCESSIBLE = "ZONAL_RESOURCE_INACCESSIBLE".asInstanceOf[ResourceStatus]
  val LIMIT_EXCEEDED = "LIMIT_EXCEEDED".asInstanceOf[ResourceStatus]
  val UNAVAILABLE = "UNAVAILABLE".asInstanceOf[ResourceStatus]
  val PENDING = "PENDING".asInstanceOf[ResourceStatus]

  @inline def values = js.Array(AVAILABLE, ZONAL_RESOURCE_INACCESSIBLE, LIMIT_EXCEEDED, UNAVAILABLE, PENDING)
}
