package facade.amazonaws.services.elasticache

import scalajs.js

type AZMode = "single-az" | "cross-az"
object AZMode {
  inline val `single-az`: "single-az" = "single-az"
  inline val `cross-az`: "cross-az" = "cross-az"

  inline def values: js.Array[AZMode] = js.Array(`single-az`, `cross-az`)
}

type AuthTokenUpdateStatus = "SETTING" | "ROTATING"
object AuthTokenUpdateStatus {
  inline val SETTING: "SETTING" = "SETTING"
  inline val ROTATING: "ROTATING" = "ROTATING"

  inline def values: js.Array[AuthTokenUpdateStatus] = js.Array(SETTING, ROTATING)
}

type AuthTokenUpdateStrategyType = "SET" | "ROTATE" | "DELETE"
object AuthTokenUpdateStrategyType {
  inline val SET: "SET" = "SET"
  inline val ROTATE: "ROTATE" = "ROTATE"
  inline val DELETE: "DELETE" = "DELETE"

  inline def values: js.Array[AuthTokenUpdateStrategyType] = js.Array(SET, ROTATE, DELETE)
}

type AuthenticationType = "password" | "no-password"
object AuthenticationType {
  inline val password: "password" = "password"
  inline val `no-password`: "no-password" = "no-password"

  inline def values: js.Array[AuthenticationType] = js.Array(password, `no-password`)
}

type AutomaticFailoverStatus = "enabled" | "disabled" | "enabling" | "disabling"
object AutomaticFailoverStatus {
  inline val enabled: "enabled" = "enabled"
  inline val disabled: "disabled" = "disabled"
  inline val enabling: "enabling" = "enabling"
  inline val disabling: "disabling" = "disabling"

  inline def values: js.Array[AutomaticFailoverStatus] = js.Array(enabled, disabled, enabling, disabling)
}

type ChangeType = "immediate" | "requires-reboot"
object ChangeType {
  inline val immediate: "immediate" = "immediate"
  inline val `requires-reboot`: "requires-reboot" = "requires-reboot"

  inline def values: js.Array[ChangeType] = js.Array(immediate, `requires-reboot`)
}

type DestinationType = "cloudwatch-logs" | "kinesis-firehose"
object DestinationType {
  inline val `cloudwatch-logs`: "cloudwatch-logs" = "cloudwatch-logs"
  inline val `kinesis-firehose`: "kinesis-firehose" = "kinesis-firehose"

  inline def values: js.Array[DestinationType] = js.Array(`cloudwatch-logs`, `kinesis-firehose`)
}

type LogDeliveryConfigurationStatus = "active" | "enabling" | "modifying" | "disabling" | "error"
object LogDeliveryConfigurationStatus {
  inline val active: "active" = "active"
  inline val enabling: "enabling" = "enabling"
  inline val modifying: "modifying" = "modifying"
  inline val disabling: "disabling" = "disabling"
  inline val error: "error" = "error"

  inline def values: js.Array[LogDeliveryConfigurationStatus] = js.Array(active, enabling, modifying, disabling, error)
}

type LogFormat = "text" | "json"
object LogFormat {
  inline val text: "text" = "text"
  inline val json: "json" = "json"

  inline def values: js.Array[LogFormat] = js.Array(text, json)
}

type LogType = "slow-log"
object LogType {
  inline val `slow-log`: "slow-log" = "slow-log"

  inline def values: js.Array[LogType] = js.Array(`slow-log`)
}

type MultiAZStatus = "enabled" | "disabled"
object MultiAZStatus {
  inline val enabled: "enabled" = "enabled"
  inline val disabled: "disabled" = "disabled"

  inline def values: js.Array[MultiAZStatus] = js.Array(enabled, disabled)
}

type NodeUpdateInitiatedBy = "system" | "customer"
object NodeUpdateInitiatedBy {
  inline val system: "system" = "system"
  inline val customer: "customer" = "customer"

  inline def values: js.Array[NodeUpdateInitiatedBy] = js.Array(system, customer)
}

type NodeUpdateStatus = "not-applied" | "waiting-to-start" | "in-progress" | "stopping" | "stopped" | "complete"
object NodeUpdateStatus {
  inline val `not-applied`: "not-applied" = "not-applied"
  inline val `waiting-to-start`: "waiting-to-start" = "waiting-to-start"
  inline val `in-progress`: "in-progress" = "in-progress"
  inline val stopping: "stopping" = "stopping"
  inline val stopped: "stopped" = "stopped"
  inline val complete: "complete" = "complete"

  inline def values: js.Array[NodeUpdateStatus] = js.Array(`not-applied`, `waiting-to-start`, `in-progress`, stopping, stopped, complete)
}

type OutpostMode = "single-outpost" | "cross-outpost"
object OutpostMode {
  inline val `single-outpost`: "single-outpost" = "single-outpost"
  inline val `cross-outpost`: "cross-outpost" = "cross-outpost"

  inline def values: js.Array[OutpostMode] = js.Array(`single-outpost`, `cross-outpost`)
}

type PendingAutomaticFailoverStatus = "enabled" | "disabled"
object PendingAutomaticFailoverStatus {
  inline val enabled: "enabled" = "enabled"
  inline val disabled: "disabled" = "disabled"

  inline def values: js.Array[PendingAutomaticFailoverStatus] = js.Array(enabled, disabled)
}

type ServiceUpdateSeverity = "critical" | "important" | "medium" | "low"
object ServiceUpdateSeverity {
  inline val critical: "critical" = "critical"
  inline val important: "important" = "important"
  inline val medium: "medium" = "medium"
  inline val low: "low" = "low"

  inline def values: js.Array[ServiceUpdateSeverity] = js.Array(critical, important, medium, low)
}

type ServiceUpdateStatus = "available" | "cancelled" | "expired"
object ServiceUpdateStatus {
  inline val available: "available" = "available"
  inline val cancelled: "cancelled" = "cancelled"
  inline val expired: "expired" = "expired"

  inline def values: js.Array[ServiceUpdateStatus] = js.Array(available, cancelled, expired)
}

type ServiceUpdateType = "security-update"
object ServiceUpdateType {
  inline val `security-update`: "security-update" = "security-update"

  inline def values: js.Array[ServiceUpdateType] = js.Array(`security-update`)
}

type SlaMet = "yes" | "no" | "n/a"
object SlaMet {
  inline val yes: "yes" = "yes"
  inline val no: "no" = "no"
  inline val `n/a`: "n/a" = "n/a"

  inline def values: js.Array[SlaMet] = js.Array(yes, no, `n/a`)
}

type SourceType = "cache-cluster" | "cache-parameter-group" | "cache-security-group" | "cache-subnet-group" | "replication-group" | "user" | "user-group"
object SourceType {
  inline val `cache-cluster`: "cache-cluster" = "cache-cluster"
  inline val `cache-parameter-group`: "cache-parameter-group" = "cache-parameter-group"
  inline val `cache-security-group`: "cache-security-group" = "cache-security-group"
  inline val `cache-subnet-group`: "cache-subnet-group" = "cache-subnet-group"
  inline val `replication-group`: "replication-group" = "replication-group"
  inline val user: "user" = "user"
  inline val `user-group`: "user-group" = "user-group"

  inline def values: js.Array[SourceType] = js.Array(`cache-cluster`, `cache-parameter-group`, `cache-security-group`, `cache-subnet-group`, `replication-group`, user, `user-group`)
}

type UpdateActionStatus = "not-applied" | "waiting-to-start" | "in-progress" | "stopping" | "stopped" | "complete" | "scheduling" | "scheduled" | "not-applicable"
object UpdateActionStatus {
  inline val `not-applied`: "not-applied" = "not-applied"
  inline val `waiting-to-start`: "waiting-to-start" = "waiting-to-start"
  inline val `in-progress`: "in-progress" = "in-progress"
  inline val stopping: "stopping" = "stopping"
  inline val stopped: "stopped" = "stopped"
  inline val complete: "complete" = "complete"
  inline val scheduling: "scheduling" = "scheduling"
  inline val scheduled: "scheduled" = "scheduled"
  inline val `not-applicable`: "not-applicable" = "not-applicable"

  inline def values: js.Array[UpdateActionStatus] = js.Array(`not-applied`, `waiting-to-start`, `in-progress`, stopping, stopped, complete, scheduling, scheduled, `not-applicable`)
}
