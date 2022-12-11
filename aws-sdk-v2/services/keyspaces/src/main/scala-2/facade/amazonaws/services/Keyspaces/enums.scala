package facade.amazonaws.services.keyspaces

import scalajs.js

@js.native
sealed trait EncryptionType extends js.Any
object EncryptionType {
  val CUSTOMER_MANAGED_KMS_KEY = "CUSTOMER_MANAGED_KMS_KEY".asInstanceOf[EncryptionType]
  val AWS_OWNED_KMS_KEY = "AWS_OWNED_KMS_KEY".asInstanceOf[EncryptionType]

  @inline def values: js.Array[EncryptionType] = js.Array(CUSTOMER_MANAGED_KMS_KEY, AWS_OWNED_KMS_KEY)
}

@js.native
sealed trait PointInTimeRecoveryStatus extends js.Any
object PointInTimeRecoveryStatus {
  val ENABLED = "ENABLED".asInstanceOf[PointInTimeRecoveryStatus]
  val DISABLED = "DISABLED".asInstanceOf[PointInTimeRecoveryStatus]

  @inline def values: js.Array[PointInTimeRecoveryStatus] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val ASC = "ASC".asInstanceOf[SortOrder]
  val DESC = "DESC".asInstanceOf[SortOrder]

  @inline def values: js.Array[SortOrder] = js.Array(ASC, DESC)
}

@js.native
sealed trait TableStatus extends js.Any
object TableStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[TableStatus]
  val CREATING = "CREATING".asInstanceOf[TableStatus]
  val UPDATING = "UPDATING".asInstanceOf[TableStatus]
  val DELETING = "DELETING".asInstanceOf[TableStatus]
  val DELETED = "DELETED".asInstanceOf[TableStatus]
  val RESTORING = "RESTORING".asInstanceOf[TableStatus]
  val INACCESSIBLE_ENCRYPTION_CREDENTIALS = "INACCESSIBLE_ENCRYPTION_CREDENTIALS".asInstanceOf[TableStatus]

  @inline def values: js.Array[TableStatus] = js.Array(ACTIVE, CREATING, UPDATING, DELETING, DELETED, RESTORING, INACCESSIBLE_ENCRYPTION_CREDENTIALS)
}

@js.native
sealed trait ThroughputMode extends js.Any
object ThroughputMode {
  val PAY_PER_REQUEST = "PAY_PER_REQUEST".asInstanceOf[ThroughputMode]
  val PROVISIONED = "PROVISIONED".asInstanceOf[ThroughputMode]

  @inline def values: js.Array[ThroughputMode] = js.Array(PAY_PER_REQUEST, PROVISIONED)
}

@js.native
sealed trait TimeToLiveStatus extends js.Any
object TimeToLiveStatus {
  val ENABLED = "ENABLED".asInstanceOf[TimeToLiveStatus]

  @inline def values: js.Array[TimeToLiveStatus] = js.Array(ENABLED)
}
