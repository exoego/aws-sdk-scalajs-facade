package facade.amazonaws.services.ssmsap

import scalajs.js

type ApplicationStatus = "ACTIVATED" | "STARTING" | "STOPPED" | "STOPPING" | "FAILED" | "REGISTERING" | "DELETING" | "UNKNOWN"
object ApplicationStatus {
  inline val ACTIVATED: "ACTIVATED" = "ACTIVATED"
  inline val STARTING: "STARTING" = "STARTING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val REGISTERING: "REGISTERING" = "REGISTERING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[ApplicationStatus] = js.Array(ACTIVATED, STARTING, STOPPED, STOPPING, FAILED, REGISTERING, DELETING, UNKNOWN)
}

type ApplicationType = "HANA"
object ApplicationType {
  inline val HANA: "HANA" = "HANA"

  inline def values: js.Array[ApplicationType] = js.Array(HANA)
}

type ComponentStatus = "ACTIVATED"
object ComponentStatus {
  inline val ACTIVATED: "ACTIVATED" = "ACTIVATED"

  inline def values: js.Array[ComponentStatus] = js.Array(ACTIVATED)
}

type ComponentType = "HANA"
object ComponentType {
  inline val HANA: "HANA" = "HANA"

  inline def values: js.Array[ComponentType] = js.Array(HANA)
}

type CredentialType = "ADMIN"
object CredentialType {
  inline val ADMIN: "ADMIN" = "ADMIN"

  inline def values: js.Array[CredentialType] = js.Array(ADMIN)
}

type DatabaseStatus = "RUNNING" | "STARTING" | "STOPPED" | "WARNING" | "UNKNOWN"
object DatabaseStatus {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STARTING: "STARTING" = "STARTING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val WARNING: "WARNING" = "WARNING"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[DatabaseStatus] = js.Array(RUNNING, STARTING, STOPPED, WARNING, UNKNOWN)
}

type DatabaseType = "SYSTEM" | "TENANT"
object DatabaseType {
  inline val SYSTEM: "SYSTEM" = "SYSTEM"
  inline val TENANT: "TENANT" = "TENANT"

  inline def values: js.Array[DatabaseType] = js.Array(SYSTEM, TENANT)
}

type HostRole = "LEADER" | "WORKER" | "STANDBY" | "UNKNOWN"
object HostRole {
  inline val LEADER: "LEADER" = "LEADER"
  inline val WORKER: "WORKER" = "WORKER"
  inline val STANDBY: "STANDBY" = "STANDBY"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[HostRole] = js.Array(LEADER, WORKER, STANDBY, UNKNOWN)
}

type OperationStatus = "INPROGRESS" | "SUCCESS" | "ERROR"
object OperationStatus {
  inline val INPROGRESS: "INPROGRESS" = "INPROGRESS"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[OperationStatus] = js.Array(INPROGRESS, SUCCESS, ERROR)
}

type PermissionActionType = "RESTORE"
object PermissionActionType {
  inline val RESTORE: "RESTORE" = "RESTORE"

  inline def values: js.Array[PermissionActionType] = js.Array(RESTORE)
}
