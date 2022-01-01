package facade.amazonaws.services.rds

import scalajs.js

type ActivityStreamMode = "sync" | "async"
object ActivityStreamMode {
  inline val sync: "sync" = "sync"
  inline val async: "async" = "async"

  inline def values: js.Array[ActivityStreamMode] = js.Array(sync, async)
}

type ActivityStreamStatus = "stopped" | "starting" | "started" | "stopping"
object ActivityStreamStatus {
  inline val stopped: "stopped" = "stopped"
  inline val starting: "starting" = "starting"
  inline val started: "started" = "started"
  inline val stopping: "stopping" = "stopping"

  inline def values: js.Array[ActivityStreamStatus] = js.Array(stopped, starting, started, stopping)
}

type ApplyMethod = "immediate" | "pending-reboot"
object ApplyMethod {
  inline val immediate: "immediate" = "immediate"
  inline val `pending-reboot`: "pending-reboot" = "pending-reboot"

  inline def values: js.Array[ApplyMethod] = js.Array(immediate, `pending-reboot`)
}

type AuthScheme = "SECRETS"
object AuthScheme {
  inline val SECRETS: "SECRETS" = "SECRETS"

  inline def values: js.Array[AuthScheme] = js.Array(SECRETS)
}

type AutomationMode = "full" | "all-paused"
object AutomationMode {
  inline val full: "full" = "full"
  inline val `all-paused`: "all-paused" = "all-paused"

  inline def values: js.Array[AutomationMode] = js.Array(full, `all-paused`)
}

type CustomEngineVersionStatus = "available" | "inactive" | "inactive-except-restore"
object CustomEngineVersionStatus {
  inline val available: "available" = "available"
  inline val inactive: "inactive" = "inactive"
  inline val `inactive-except-restore`: "inactive-except-restore" = "inactive-except-restore"

  inline def values: js.Array[CustomEngineVersionStatus] = js.Array(available, inactive, `inactive-except-restore`)
}

type DBProxyEndpointStatus = "available" | "modifying" | "incompatible-network" | "insufficient-resource-limits" | "creating" | "deleting"
object DBProxyEndpointStatus {
  inline val available: "available" = "available"
  inline val modifying: "modifying" = "modifying"
  inline val `incompatible-network`: "incompatible-network" = "incompatible-network"
  inline val `insufficient-resource-limits`: "insufficient-resource-limits" = "insufficient-resource-limits"
  inline val creating: "creating" = "creating"
  inline val deleting: "deleting" = "deleting"

  inline def values: js.Array[DBProxyEndpointStatus] = js.Array(available, modifying, `incompatible-network`, `insufficient-resource-limits`, creating, deleting)
}

type DBProxyEndpointTargetRole = "READ_WRITE" | "READ_ONLY"
object DBProxyEndpointTargetRole {
  inline val READ_WRITE: "READ_WRITE" = "READ_WRITE"
  inline val READ_ONLY: "READ_ONLY" = "READ_ONLY"

  inline def values: js.Array[DBProxyEndpointTargetRole] = js.Array(READ_WRITE, READ_ONLY)
}

type DBProxyStatus = "available" | "modifying" | "incompatible-network" | "insufficient-resource-limits" | "creating" | "deleting" | "suspended" | "suspending" | "reactivating"
object DBProxyStatus {
  inline val available: "available" = "available"
  inline val modifying: "modifying" = "modifying"
  inline val `incompatible-network`: "incompatible-network" = "incompatible-network"
  inline val `insufficient-resource-limits`: "insufficient-resource-limits" = "insufficient-resource-limits"
  inline val creating: "creating" = "creating"
  inline val deleting: "deleting" = "deleting"
  inline val suspended: "suspended" = "suspended"
  inline val suspending: "suspending" = "suspending"
  inline val reactivating: "reactivating" = "reactivating"

  inline def values: js.Array[DBProxyStatus] = js.Array(available, modifying, `incompatible-network`, `insufficient-resource-limits`, creating, deleting, suspended, suspending, reactivating)
}

type EngineFamily = "MYSQL" | "POSTGRESQL"
object EngineFamily {
  inline val MYSQL: "MYSQL" = "MYSQL"
  inline val POSTGRESQL: "POSTGRESQL" = "POSTGRESQL"

  inline def values: js.Array[EngineFamily] = js.Array(MYSQL, POSTGRESQL)
}

type FailoverStatus = "pending" | "failing-over" | "cancelling"
object FailoverStatus {
  inline val pending: "pending" = "pending"
  inline val `failing-over`: "failing-over" = "failing-over"
  inline val cancelling: "cancelling" = "cancelling"

  inline def values: js.Array[FailoverStatus] = js.Array(pending, `failing-over`, cancelling)
}

type IAMAuthMode = "DISABLED" | "REQUIRED"
object IAMAuthMode {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val REQUIRED: "REQUIRED" = "REQUIRED"

  inline def values: js.Array[IAMAuthMode] = js.Array(DISABLED, REQUIRED)
}

type ReplicaMode = "open-read-only" | "mounted"
object ReplicaMode {
  inline val `open-read-only`: "open-read-only" = "open-read-only"
  inline val mounted: "mounted" = "mounted"

  inline def values: js.Array[ReplicaMode] = js.Array(`open-read-only`, mounted)
}

type SourceType = "db-instance" | "db-parameter-group" | "db-security-group" | "db-snapshot" | "db-cluster" | "db-cluster-snapshot" | "custom-engine-version"
object SourceType {
  inline val `db-instance`: "db-instance" = "db-instance"
  inline val `db-parameter-group`: "db-parameter-group" = "db-parameter-group"
  inline val `db-security-group`: "db-security-group" = "db-security-group"
  inline val `db-snapshot`: "db-snapshot" = "db-snapshot"
  inline val `db-cluster`: "db-cluster" = "db-cluster"
  inline val `db-cluster-snapshot`: "db-cluster-snapshot" = "db-cluster-snapshot"
  inline val `custom-engine-version`: "custom-engine-version" = "custom-engine-version"

  inline def values: js.Array[SourceType] = js.Array(`db-instance`, `db-parameter-group`, `db-security-group`, `db-snapshot`, `db-cluster`, `db-cluster-snapshot`, `custom-engine-version`)
}

type TargetHealthReason = "UNREACHABLE" | "CONNECTION_FAILED" | "AUTH_FAILURE" | "PENDING_PROXY_CAPACITY" | "INVALID_REPLICATION_STATE"
object TargetHealthReason {
  inline val UNREACHABLE: "UNREACHABLE" = "UNREACHABLE"
  inline val CONNECTION_FAILED: "CONNECTION_FAILED" = "CONNECTION_FAILED"
  inline val AUTH_FAILURE: "AUTH_FAILURE" = "AUTH_FAILURE"
  inline val PENDING_PROXY_CAPACITY: "PENDING_PROXY_CAPACITY" = "PENDING_PROXY_CAPACITY"
  inline val INVALID_REPLICATION_STATE: "INVALID_REPLICATION_STATE" = "INVALID_REPLICATION_STATE"

  inline def values: js.Array[TargetHealthReason] = js.Array(UNREACHABLE, CONNECTION_FAILED, AUTH_FAILURE, PENDING_PROXY_CAPACITY, INVALID_REPLICATION_STATE)
}

type TargetRole = "READ_WRITE" | "READ_ONLY" | "UNKNOWN"
object TargetRole {
  inline val READ_WRITE: "READ_WRITE" = "READ_WRITE"
  inline val READ_ONLY: "READ_ONLY" = "READ_ONLY"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[TargetRole] = js.Array(READ_WRITE, READ_ONLY, UNKNOWN)
}

type TargetState = "REGISTERING" | "AVAILABLE" | "UNAVAILABLE"
object TargetState {
  inline val REGISTERING: "REGISTERING" = "REGISTERING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val UNAVAILABLE: "UNAVAILABLE" = "UNAVAILABLE"

  inline def values: js.Array[TargetState] = js.Array(REGISTERING, AVAILABLE, UNAVAILABLE)
}

type TargetType = "RDS_INSTANCE" | "RDS_SERVERLESS_ENDPOINT" | "TRACKED_CLUSTER"
object TargetType {
  inline val RDS_INSTANCE: "RDS_INSTANCE" = "RDS_INSTANCE"
  inline val RDS_SERVERLESS_ENDPOINT: "RDS_SERVERLESS_ENDPOINT" = "RDS_SERVERLESS_ENDPOINT"
  inline val TRACKED_CLUSTER: "TRACKED_CLUSTER" = "TRACKED_CLUSTER"

  inline def values: js.Array[TargetType] = js.Array(RDS_INSTANCE, RDS_SERVERLESS_ENDPOINT, TRACKED_CLUSTER)
}

type WriteForwardingStatus = "enabled" | "disabled" | "enabling" | "disabling" | "unknown"
object WriteForwardingStatus {
  inline val enabled: "enabled" = "enabled"
  inline val disabled: "disabled" = "disabled"
  inline val enabling: "enabling" = "enabling"
  inline val disabling: "disabling" = "disabling"
  inline val unknown: "unknown" = "unknown"

  inline def values: js.Array[WriteForwardingStatus] = js.Array(enabled, disabled, enabling, disabling, unknown)
}
