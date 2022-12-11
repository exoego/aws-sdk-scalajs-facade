package facade.amazonaws.services.keyspaces

import scalajs.js

type EncryptionType = "CUSTOMER_MANAGED_KMS_KEY" | "AWS_OWNED_KMS_KEY"
object EncryptionType {
  inline val CUSTOMER_MANAGED_KMS_KEY: "CUSTOMER_MANAGED_KMS_KEY" = "CUSTOMER_MANAGED_KMS_KEY"
  inline val AWS_OWNED_KMS_KEY: "AWS_OWNED_KMS_KEY" = "AWS_OWNED_KMS_KEY"

  inline def values: js.Array[EncryptionType] = js.Array(CUSTOMER_MANAGED_KMS_KEY, AWS_OWNED_KMS_KEY)
}

type PointInTimeRecoveryStatus = "ENABLED" | "DISABLED"
object PointInTimeRecoveryStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[PointInTimeRecoveryStatus] = js.Array(ENABLED, DISABLED)
}

type SortOrder = "ASC" | "DESC"
object SortOrder {
  inline val ASC: "ASC" = "ASC"
  inline val DESC: "DESC" = "DESC"

  inline def values: js.Array[SortOrder] = js.Array(ASC, DESC)
}

type TableStatus = "ACTIVE" | "CREATING" | "UPDATING" | "DELETING" | "DELETED" | "RESTORING" | "INACCESSIBLE_ENCRYPTION_CREDENTIALS"
object TableStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val CREATING: "CREATING" = "CREATING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val RESTORING: "RESTORING" = "RESTORING"
  inline val INACCESSIBLE_ENCRYPTION_CREDENTIALS: "INACCESSIBLE_ENCRYPTION_CREDENTIALS" = "INACCESSIBLE_ENCRYPTION_CREDENTIALS"

  inline def values: js.Array[TableStatus] = js.Array(ACTIVE, CREATING, UPDATING, DELETING, DELETED, RESTORING, INACCESSIBLE_ENCRYPTION_CREDENTIALS)
}

type ThroughputMode = "PAY_PER_REQUEST" | "PROVISIONED"
object ThroughputMode {
  inline val PAY_PER_REQUEST: "PAY_PER_REQUEST" = "PAY_PER_REQUEST"
  inline val PROVISIONED: "PROVISIONED" = "PROVISIONED"

  inline def values: js.Array[ThroughputMode] = js.Array(PAY_PER_REQUEST, PROVISIONED)
}

type TimeToLiveStatus = "ENABLED"
object TimeToLiveStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[TimeToLiveStatus] = js.Array(ENABLED)
}
