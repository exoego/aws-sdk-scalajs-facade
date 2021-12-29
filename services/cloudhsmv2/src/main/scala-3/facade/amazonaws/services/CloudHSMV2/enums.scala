package facade.amazonaws.services.cloudhsmv2

import scalajs._

type BackupPolicy = "DEFAULT"
object BackupPolicy {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"

  inline def values: js.Array[BackupPolicy] = js.Array(DEFAULT)
}

type BackupRetentionType = "DAYS"
object BackupRetentionType {
  inline val DAYS: "DAYS" = "DAYS"

  inline def values: js.Array[BackupRetentionType] = js.Array(DAYS)
}

type BackupState = "CREATE_IN_PROGRESS" | "READY" | "DELETED" | "PENDING_DELETION"
object BackupState {
  inline val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  inline val READY: "READY" = "READY"
  inline val DELETED: "DELETED" = "DELETED"
  inline val PENDING_DELETION: "PENDING_DELETION" = "PENDING_DELETION"

  inline def values: js.Array[BackupState] = js.Array(CREATE_IN_PROGRESS, READY, DELETED, PENDING_DELETION)
}

type ClusterState = "CREATE_IN_PROGRESS" | "UNINITIALIZED" | "INITIALIZE_IN_PROGRESS" | "INITIALIZED" | "ACTIVE" | "UPDATE_IN_PROGRESS" | "DELETE_IN_PROGRESS" | "DELETED" | "DEGRADED"
object ClusterState {
  inline val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  inline val UNINITIALIZED: "UNINITIALIZED" = "UNINITIALIZED"
  inline val INITIALIZE_IN_PROGRESS: "INITIALIZE_IN_PROGRESS" = "INITIALIZE_IN_PROGRESS"
  inline val INITIALIZED: "INITIALIZED" = "INITIALIZED"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"
  inline val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  inline val DELETED: "DELETED" = "DELETED"
  inline val DEGRADED: "DEGRADED" = "DEGRADED"

  inline def values: js.Array[ClusterState] = js.Array(CREATE_IN_PROGRESS, UNINITIALIZED, INITIALIZE_IN_PROGRESS, INITIALIZED, ACTIVE, UPDATE_IN_PROGRESS, DELETE_IN_PROGRESS, DELETED, DEGRADED)
}

type HsmState = "CREATE_IN_PROGRESS" | "ACTIVE" | "DEGRADED" | "DELETE_IN_PROGRESS" | "DELETED"
object HsmState {
  inline val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DEGRADED: "DEGRADED" = "DEGRADED"
  inline val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[HsmState] = js.Array(CREATE_IN_PROGRESS, ACTIVE, DEGRADED, DELETE_IN_PROGRESS, DELETED)
}
