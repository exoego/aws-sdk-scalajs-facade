package facade.amazonaws.services.rds

import scalajs._

type ActivityStreamMode = "sync" | "async"
object ActivityStreamMode {
  val sync: "sync" = "sync"
  val async: "async" = "async"

  @inline def values = js.Array[ActivityStreamMode](sync, async)
}

type ActivityStreamStatus = "stopped" | "starting" | "started" | "stopping"
object ActivityStreamStatus {
  val stopped: "stopped" = "stopped"
  val starting: "starting" = "starting"
  val started: "started" = "started"
  val stopping: "stopping" = "stopping"

  @inline def values = js.Array[ActivityStreamStatus](stopped, starting, started, stopping)
}

type ApplyMethod = "immediate" | "pending-reboot"
object ApplyMethod {
  val immediate: "immediate" = "immediate"
  val `pending-reboot`: "pending-reboot" = "pending-reboot"

  @inline def values = js.Array[ApplyMethod](immediate, `pending-reboot`)
}

type AuthScheme = "SECRETS"
object AuthScheme {
  val SECRETS: "SECRETS" = "SECRETS"

  @inline def values = js.Array[AuthScheme](SECRETS)
}

type DBProxyEndpointStatus = "available" | "modifying" | "incompatible-network" | "insufficient-resource-limits" | "creating" | "deleting"
object DBProxyEndpointStatus {
  val available: "available" = "available"
  val modifying: "modifying" = "modifying"
  val `incompatible-network`: "incompatible-network" = "incompatible-network"
  val `insufficient-resource-limits`: "insufficient-resource-limits" = "insufficient-resource-limits"
  val creating: "creating" = "creating"
  val deleting: "deleting" = "deleting"

  @inline def values = js.Array[DBProxyEndpointStatus](available, modifying, `incompatible-network`, `insufficient-resource-limits`, creating, deleting)
}

type DBProxyEndpointTargetRole = "READ_WRITE" | "READ_ONLY"
object DBProxyEndpointTargetRole {
  val READ_WRITE: "READ_WRITE" = "READ_WRITE"
  val READ_ONLY: "READ_ONLY" = "READ_ONLY"

  @inline def values = js.Array[DBProxyEndpointTargetRole](READ_WRITE, READ_ONLY)
}

type DBProxyStatus = "available" | "modifying" | "incompatible-network" | "insufficient-resource-limits" | "creating" | "deleting" | "suspended" | "suspending" | "reactivating"
object DBProxyStatus {
  val available: "available" = "available"
  val modifying: "modifying" = "modifying"
  val `incompatible-network`: "incompatible-network" = "incompatible-network"
  val `insufficient-resource-limits`: "insufficient-resource-limits" = "insufficient-resource-limits"
  val creating: "creating" = "creating"
  val deleting: "deleting" = "deleting"
  val suspended: "suspended" = "suspended"
  val suspending: "suspending" = "suspending"
  val reactivating: "reactivating" = "reactivating"

  @inline def values = js.Array[DBProxyStatus](available, modifying, `incompatible-network`, `insufficient-resource-limits`, creating, deleting, suspended, suspending, reactivating)
}

type EngineFamily = "MYSQL" | "POSTGRESQL"
object EngineFamily {
  val MYSQL: "MYSQL" = "MYSQL"
  val POSTGRESQL: "POSTGRESQL" = "POSTGRESQL"

  @inline def values = js.Array[EngineFamily](MYSQL, POSTGRESQL)
}

type FailoverStatus = "pending" | "failing-over" | "cancelling"
object FailoverStatus {
  val pending: "pending" = "pending"
  val `failing-over`: "failing-over" = "failing-over"
  val cancelling: "cancelling" = "cancelling"

  @inline def values = js.Array[FailoverStatus](pending, `failing-over`, cancelling)
}

type IAMAuthMode = "DISABLED" | "REQUIRED"
object IAMAuthMode {
  val DISABLED: "DISABLED" = "DISABLED"
  val REQUIRED: "REQUIRED" = "REQUIRED"

  @inline def values = js.Array[IAMAuthMode](DISABLED, REQUIRED)
}

type ReplicaMode = "open-read-only" | "mounted"
object ReplicaMode {
  val `open-read-only`: "open-read-only" = "open-read-only"
  val mounted: "mounted" = "mounted"

  @inline def values = js.Array[ReplicaMode](`open-read-only`, mounted)
}

type SourceType = "db-instance" | "db-parameter-group" | "db-security-group" | "db-snapshot" | "db-cluster" | "db-cluster-snapshot"
object SourceType {
  val `db-instance`: "db-instance" = "db-instance"
  val `db-parameter-group`: "db-parameter-group" = "db-parameter-group"
  val `db-security-group`: "db-security-group" = "db-security-group"
  val `db-snapshot`: "db-snapshot" = "db-snapshot"
  val `db-cluster`: "db-cluster" = "db-cluster"
  val `db-cluster-snapshot`: "db-cluster-snapshot" = "db-cluster-snapshot"

  @inline def values = js.Array[SourceType](`db-instance`, `db-parameter-group`, `db-security-group`, `db-snapshot`, `db-cluster`, `db-cluster-snapshot`)
}

type TargetHealthReason = "UNREACHABLE" | "CONNECTION_FAILED" | "AUTH_FAILURE" | "PENDING_PROXY_CAPACITY" | "INVALID_REPLICATION_STATE"
object TargetHealthReason {
  val UNREACHABLE: "UNREACHABLE" = "UNREACHABLE"
  val CONNECTION_FAILED: "CONNECTION_FAILED" = "CONNECTION_FAILED"
  val AUTH_FAILURE: "AUTH_FAILURE" = "AUTH_FAILURE"
  val PENDING_PROXY_CAPACITY: "PENDING_PROXY_CAPACITY" = "PENDING_PROXY_CAPACITY"
  val INVALID_REPLICATION_STATE: "INVALID_REPLICATION_STATE" = "INVALID_REPLICATION_STATE"

  @inline def values = js.Array[TargetHealthReason](UNREACHABLE, CONNECTION_FAILED, AUTH_FAILURE, PENDING_PROXY_CAPACITY, INVALID_REPLICATION_STATE)
}

type TargetRole = "READ_WRITE" | "READ_ONLY" | "UNKNOWN"
object TargetRole {
  val READ_WRITE: "READ_WRITE" = "READ_WRITE"
  val READ_ONLY: "READ_ONLY" = "READ_ONLY"
  val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  @inline def values = js.Array[TargetRole](READ_WRITE, READ_ONLY, UNKNOWN)
}

type TargetState = "REGISTERING" | "AVAILABLE" | "UNAVAILABLE"
object TargetState {
  val REGISTERING: "REGISTERING" = "REGISTERING"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val UNAVAILABLE: "UNAVAILABLE" = "UNAVAILABLE"

  @inline def values = js.Array[TargetState](REGISTERING, AVAILABLE, UNAVAILABLE)
}

type TargetType = "RDS_INSTANCE" | "RDS_SERVERLESS_ENDPOINT" | "TRACKED_CLUSTER"
object TargetType {
  val RDS_INSTANCE: "RDS_INSTANCE" = "RDS_INSTANCE"
  val RDS_SERVERLESS_ENDPOINT: "RDS_SERVERLESS_ENDPOINT" = "RDS_SERVERLESS_ENDPOINT"
  val TRACKED_CLUSTER: "TRACKED_CLUSTER" = "TRACKED_CLUSTER"

  @inline def values = js.Array[TargetType](RDS_INSTANCE, RDS_SERVERLESS_ENDPOINT, TRACKED_CLUSTER)
}

type WriteForwardingStatus = "enabled" | "disabled" | "enabling" | "disabling" | "unknown"
object WriteForwardingStatus {
  val enabled: "enabled" = "enabled"
  val disabled: "disabled" = "disabled"
  val enabling: "enabling" = "enabling"
  val disabling: "disabling" = "disabling"
  val unknown: "unknown" = "unknown"

  @inline def values = js.Array[WriteForwardingStatus](enabled, disabled, enabling, disabling, unknown)
}
