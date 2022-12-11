package facade.amazonaws.services.rds

import scalajs.js

@js.native
sealed trait ActivityStreamMode extends js.Any
object ActivityStreamMode {
  val sync = "sync".asInstanceOf[ActivityStreamMode]
  val async = "async".asInstanceOf[ActivityStreamMode]

  @inline def values: js.Array[ActivityStreamMode] = js.Array(sync, async)
}

@js.native
sealed trait ActivityStreamPolicyStatus extends js.Any
object ActivityStreamPolicyStatus {
  val locked = "locked".asInstanceOf[ActivityStreamPolicyStatus]
  val unlocked = "unlocked".asInstanceOf[ActivityStreamPolicyStatus]
  val `locking-policy` = "locking-policy".asInstanceOf[ActivityStreamPolicyStatus]
  val `unlocking-policy` = "unlocking-policy".asInstanceOf[ActivityStreamPolicyStatus]

  @inline def values: js.Array[ActivityStreamPolicyStatus] = js.Array(locked, unlocked, `locking-policy`, `unlocking-policy`)
}

@js.native
sealed trait ActivityStreamStatus extends js.Any
object ActivityStreamStatus {
  val stopped = "stopped".asInstanceOf[ActivityStreamStatus]
  val starting = "starting".asInstanceOf[ActivityStreamStatus]
  val started = "started".asInstanceOf[ActivityStreamStatus]
  val stopping = "stopping".asInstanceOf[ActivityStreamStatus]

  @inline def values: js.Array[ActivityStreamStatus] = js.Array(stopped, starting, started, stopping)
}

@js.native
sealed trait ApplyMethod extends js.Any
object ApplyMethod {
  val immediate = "immediate".asInstanceOf[ApplyMethod]
  val `pending-reboot` = "pending-reboot".asInstanceOf[ApplyMethod]

  @inline def values: js.Array[ApplyMethod] = js.Array(immediate, `pending-reboot`)
}

@js.native
sealed trait AuditPolicyState extends js.Any
object AuditPolicyState {
  val locked = "locked".asInstanceOf[AuditPolicyState]
  val unlocked = "unlocked".asInstanceOf[AuditPolicyState]

  @inline def values: js.Array[AuditPolicyState] = js.Array(locked, unlocked)
}

@js.native
sealed trait AuthScheme extends js.Any
object AuthScheme {
  val SECRETS = "SECRETS".asInstanceOf[AuthScheme]

  @inline def values: js.Array[AuthScheme] = js.Array(SECRETS)
}

@js.native
sealed trait AutomationMode extends js.Any
object AutomationMode {
  val full = "full".asInstanceOf[AutomationMode]
  val `all-paused` = "all-paused".asInstanceOf[AutomationMode]

  @inline def values: js.Array[AutomationMode] = js.Array(full, `all-paused`)
}

@js.native
sealed trait CustomEngineVersionStatus extends js.Any
object CustomEngineVersionStatus {
  val available = "available".asInstanceOf[CustomEngineVersionStatus]
  val inactive = "inactive".asInstanceOf[CustomEngineVersionStatus]
  val `inactive-except-restore` = "inactive-except-restore".asInstanceOf[CustomEngineVersionStatus]

  @inline def values: js.Array[CustomEngineVersionStatus] = js.Array(available, inactive, `inactive-except-restore`)
}

@js.native
sealed trait DBProxyEndpointStatus extends js.Any
object DBProxyEndpointStatus {
  val available = "available".asInstanceOf[DBProxyEndpointStatus]
  val modifying = "modifying".asInstanceOf[DBProxyEndpointStatus]
  val `incompatible-network` = "incompatible-network".asInstanceOf[DBProxyEndpointStatus]
  val `insufficient-resource-limits` = "insufficient-resource-limits".asInstanceOf[DBProxyEndpointStatus]
  val creating = "creating".asInstanceOf[DBProxyEndpointStatus]
  val deleting = "deleting".asInstanceOf[DBProxyEndpointStatus]

  @inline def values: js.Array[DBProxyEndpointStatus] = js.Array(available, modifying, `incompatible-network`, `insufficient-resource-limits`, creating, deleting)
}

@js.native
sealed trait DBProxyEndpointTargetRole extends js.Any
object DBProxyEndpointTargetRole {
  val READ_WRITE = "READ_WRITE".asInstanceOf[DBProxyEndpointTargetRole]
  val READ_ONLY = "READ_ONLY".asInstanceOf[DBProxyEndpointTargetRole]

  @inline def values: js.Array[DBProxyEndpointTargetRole] = js.Array(READ_WRITE, READ_ONLY)
}

@js.native
sealed trait DBProxyStatus extends js.Any
object DBProxyStatus {
  val available = "available".asInstanceOf[DBProxyStatus]
  val modifying = "modifying".asInstanceOf[DBProxyStatus]
  val `incompatible-network` = "incompatible-network".asInstanceOf[DBProxyStatus]
  val `insufficient-resource-limits` = "insufficient-resource-limits".asInstanceOf[DBProxyStatus]
  val creating = "creating".asInstanceOf[DBProxyStatus]
  val deleting = "deleting".asInstanceOf[DBProxyStatus]
  val suspended = "suspended".asInstanceOf[DBProxyStatus]
  val suspending = "suspending".asInstanceOf[DBProxyStatus]
  val reactivating = "reactivating".asInstanceOf[DBProxyStatus]

  @inline def values: js.Array[DBProxyStatus] = js.Array(available, modifying, `incompatible-network`, `insufficient-resource-limits`, creating, deleting, suspended, suspending, reactivating)
}

@js.native
sealed trait EngineFamily extends js.Any
object EngineFamily {
  val MYSQL = "MYSQL".asInstanceOf[EngineFamily]
  val POSTGRESQL = "POSTGRESQL".asInstanceOf[EngineFamily]
  val SQLSERVER = "SQLSERVER".asInstanceOf[EngineFamily]

  @inline def values: js.Array[EngineFamily] = js.Array(MYSQL, POSTGRESQL, SQLSERVER)
}

@js.native
sealed trait ExportSourceType extends js.Any
object ExportSourceType {
  val SNAPSHOT = "SNAPSHOT".asInstanceOf[ExportSourceType]
  val CLUSTER = "CLUSTER".asInstanceOf[ExportSourceType]

  @inline def values: js.Array[ExportSourceType] = js.Array(SNAPSHOT, CLUSTER)
}

@js.native
sealed trait FailoverStatus extends js.Any
object FailoverStatus {
  val pending = "pending".asInstanceOf[FailoverStatus]
  val `failing-over` = "failing-over".asInstanceOf[FailoverStatus]
  val cancelling = "cancelling".asInstanceOf[FailoverStatus]

  @inline def values: js.Array[FailoverStatus] = js.Array(pending, `failing-over`, cancelling)
}

@js.native
sealed trait IAMAuthMode extends js.Any
object IAMAuthMode {
  val DISABLED = "DISABLED".asInstanceOf[IAMAuthMode]
  val REQUIRED = "REQUIRED".asInstanceOf[IAMAuthMode]
  val ENABLED = "ENABLED".asInstanceOf[IAMAuthMode]

  @inline def values: js.Array[IAMAuthMode] = js.Array(DISABLED, REQUIRED, ENABLED)
}

@js.native
sealed trait ReplicaMode extends js.Any
object ReplicaMode {
  val `open-read-only` = "open-read-only".asInstanceOf[ReplicaMode]
  val mounted = "mounted".asInstanceOf[ReplicaMode]

  @inline def values: js.Array[ReplicaMode] = js.Array(`open-read-only`, mounted)
}

@js.native
sealed trait SourceType extends js.Any
object SourceType {
  val `db-instance` = "db-instance".asInstanceOf[SourceType]
  val `db-parameter-group` = "db-parameter-group".asInstanceOf[SourceType]
  val `db-security-group` = "db-security-group".asInstanceOf[SourceType]
  val `db-snapshot` = "db-snapshot".asInstanceOf[SourceType]
  val `db-cluster` = "db-cluster".asInstanceOf[SourceType]
  val `db-cluster-snapshot` = "db-cluster-snapshot".asInstanceOf[SourceType]
  val `custom-engine-version` = "custom-engine-version".asInstanceOf[SourceType]
  val `db-proxy` = "db-proxy".asInstanceOf[SourceType]
  val `blue-green-deployment` = "blue-green-deployment".asInstanceOf[SourceType]

  @inline def values: js.Array[SourceType] = js.Array(
    `db-instance`,
    `db-parameter-group`,
    `db-security-group`,
    `db-snapshot`,
    `db-cluster`,
    `db-cluster-snapshot`,
    `custom-engine-version`,
    `db-proxy`,
    `blue-green-deployment`
  )
}

@js.native
sealed trait TargetHealthReason extends js.Any
object TargetHealthReason {
  val UNREACHABLE = "UNREACHABLE".asInstanceOf[TargetHealthReason]
  val CONNECTION_FAILED = "CONNECTION_FAILED".asInstanceOf[TargetHealthReason]
  val AUTH_FAILURE = "AUTH_FAILURE".asInstanceOf[TargetHealthReason]
  val PENDING_PROXY_CAPACITY = "PENDING_PROXY_CAPACITY".asInstanceOf[TargetHealthReason]
  val INVALID_REPLICATION_STATE = "INVALID_REPLICATION_STATE".asInstanceOf[TargetHealthReason]

  @inline def values: js.Array[TargetHealthReason] = js.Array(UNREACHABLE, CONNECTION_FAILED, AUTH_FAILURE, PENDING_PROXY_CAPACITY, INVALID_REPLICATION_STATE)
}

@js.native
sealed trait TargetRole extends js.Any
object TargetRole {
  val READ_WRITE = "READ_WRITE".asInstanceOf[TargetRole]
  val READ_ONLY = "READ_ONLY".asInstanceOf[TargetRole]
  val UNKNOWN = "UNKNOWN".asInstanceOf[TargetRole]

  @inline def values: js.Array[TargetRole] = js.Array(READ_WRITE, READ_ONLY, UNKNOWN)
}

@js.native
sealed trait TargetState extends js.Any
object TargetState {
  val REGISTERING = "REGISTERING".asInstanceOf[TargetState]
  val AVAILABLE = "AVAILABLE".asInstanceOf[TargetState]
  val UNAVAILABLE = "UNAVAILABLE".asInstanceOf[TargetState]

  @inline def values: js.Array[TargetState] = js.Array(REGISTERING, AVAILABLE, UNAVAILABLE)
}

@js.native
sealed trait TargetType extends js.Any
object TargetType {
  val RDS_INSTANCE = "RDS_INSTANCE".asInstanceOf[TargetType]
  val RDS_SERVERLESS_ENDPOINT = "RDS_SERVERLESS_ENDPOINT".asInstanceOf[TargetType]
  val TRACKED_CLUSTER = "TRACKED_CLUSTER".asInstanceOf[TargetType]

  @inline def values: js.Array[TargetType] = js.Array(RDS_INSTANCE, RDS_SERVERLESS_ENDPOINT, TRACKED_CLUSTER)
}

@js.native
sealed trait WriteForwardingStatus extends js.Any
object WriteForwardingStatus {
  val enabled = "enabled".asInstanceOf[WriteForwardingStatus]
  val disabled = "disabled".asInstanceOf[WriteForwardingStatus]
  val enabling = "enabling".asInstanceOf[WriteForwardingStatus]
  val disabling = "disabling".asInstanceOf[WriteForwardingStatus]
  val unknown = "unknown".asInstanceOf[WriteForwardingStatus]

  @inline def values: js.Array[WriteForwardingStatus] = js.Array(enabled, disabled, enabling, disabling, unknown)
}
