package facade.amazonaws.services.elasticache

import scalajs._

type AZMode = "single-az" | "cross-az"
object AZMode {
  val `single-az`: "single-az" = "single-az"
  val `cross-az`: "cross-az" = "cross-az"

  @inline def values = js.Array[AZMode](`single-az`, `cross-az`)
}

type AuthTokenUpdateStatus = "SETTING" | "ROTATING"
object AuthTokenUpdateStatus {
  val SETTING: "SETTING" = "SETTING"
  val ROTATING: "ROTATING" = "ROTATING"

  @inline def values = js.Array[AuthTokenUpdateStatus](SETTING, ROTATING)
}

type AuthTokenUpdateStrategyType = "SET" | "ROTATE" | "DELETE"
object AuthTokenUpdateStrategyType {
  val SET: "SET" = "SET"
  val ROTATE: "ROTATE" = "ROTATE"
  val DELETE: "DELETE" = "DELETE"

  @inline def values = js.Array[AuthTokenUpdateStrategyType](SET, ROTATE, DELETE)
}

type AuthenticationType = "password" | "no-password"
object AuthenticationType {
  val password: "password" = "password"
  val `no-password`: "no-password" = "no-password"

  @inline def values = js.Array[AuthenticationType](password, `no-password`)
}

type AutomaticFailoverStatus = "enabled" | "disabled" | "enabling" | "disabling"
object AutomaticFailoverStatus {
  val enabled: "enabled" = "enabled"
  val disabled: "disabled" = "disabled"
  val enabling: "enabling" = "enabling"
  val disabling: "disabling" = "disabling"

  @inline def values = js.Array[AutomaticFailoverStatus](enabled, disabled, enabling, disabling)
}

type ChangeType = "immediate" | "requires-reboot"
object ChangeType {
  val immediate: "immediate" = "immediate"
  val `requires-reboot`: "requires-reboot" = "requires-reboot"

  @inline def values = js.Array[ChangeType](immediate, `requires-reboot`)
}

type DestinationType = "cloudwatch-logs" | "kinesis-firehose"
object DestinationType {
  val `cloudwatch-logs`: "cloudwatch-logs" = "cloudwatch-logs"
  val `kinesis-firehose`: "kinesis-firehose" = "kinesis-firehose"

  @inline def values = js.Array[DestinationType](`cloudwatch-logs`, `kinesis-firehose`)
}

type LogDeliveryConfigurationStatus = "active" | "enabling" | "modifying" | "disabling" | "error"
object LogDeliveryConfigurationStatus {
  val active: "active" = "active"
  val enabling: "enabling" = "enabling"
  val modifying: "modifying" = "modifying"
  val disabling: "disabling" = "disabling"
  val error: "error" = "error"

  @inline def values = js.Array[LogDeliveryConfigurationStatus](active, enabling, modifying, disabling, error)
}

type LogFormat = "text" | "json"
object LogFormat {
  val text: "text" = "text"
  val json: "json" = "json"

  @inline def values = js.Array[LogFormat](text, json)
}

type LogType = "slow-log"
object LogType {
  val `slow-log`: "slow-log" = "slow-log"

  @inline def values = js.Array[LogType](`slow-log`)
}

type MultiAZStatus = "enabled" | "disabled"
object MultiAZStatus {
  val enabled: "enabled" = "enabled"
  val disabled: "disabled" = "disabled"

  @inline def values = js.Array[MultiAZStatus](enabled, disabled)
}

type NodeUpdateInitiatedBy = "system" | "customer"
object NodeUpdateInitiatedBy {
  val system: "system" = "system"
  val customer: "customer" = "customer"

  @inline def values = js.Array[NodeUpdateInitiatedBy](system, customer)
}

type NodeUpdateStatus = "not-applied" | "waiting-to-start" | "in-progress" | "stopping" | "stopped" | "complete"
object NodeUpdateStatus {
  val `not-applied`: "not-applied" = "not-applied"
  val `waiting-to-start`: "waiting-to-start" = "waiting-to-start"
  val `in-progress`: "in-progress" = "in-progress"
  val stopping: "stopping" = "stopping"
  val stopped: "stopped" = "stopped"
  val complete: "complete" = "complete"

  @inline def values = js.Array[NodeUpdateStatus](`not-applied`, `waiting-to-start`, `in-progress`, stopping, stopped, complete)
}

type OutpostMode = "single-outpost" | "cross-outpost"
object OutpostMode {
  val `single-outpost`: "single-outpost" = "single-outpost"
  val `cross-outpost`: "cross-outpost" = "cross-outpost"

  @inline def values = js.Array[OutpostMode](`single-outpost`, `cross-outpost`)
}

type PendingAutomaticFailoverStatus = "enabled" | "disabled"
object PendingAutomaticFailoverStatus {
  val enabled: "enabled" = "enabled"
  val disabled: "disabled" = "disabled"

  @inline def values = js.Array[PendingAutomaticFailoverStatus](enabled, disabled)
}

type ServiceUpdateSeverity = "critical" | "important" | "medium" | "low"
object ServiceUpdateSeverity {
  val critical: "critical" = "critical"
  val important: "important" = "important"
  val medium: "medium" = "medium"
  val low: "low" = "low"

  @inline def values = js.Array[ServiceUpdateSeverity](critical, important, medium, low)
}

type ServiceUpdateStatus = "available" | "cancelled" | "expired"
object ServiceUpdateStatus {
  val available: "available" = "available"
  val cancelled: "cancelled" = "cancelled"
  val expired: "expired" = "expired"

  @inline def values = js.Array[ServiceUpdateStatus](available, cancelled, expired)
}

type ServiceUpdateType = "security-update"
object ServiceUpdateType {
  val `security-update`: "security-update" = "security-update"

  @inline def values = js.Array[ServiceUpdateType](`security-update`)
}

type SlaMet = "yes" | "no" | "n/a"
object SlaMet {
  val yes: "yes" = "yes"
  val no: "no" = "no"
  val `n/a`: "n/a" = "n/a"

  @inline def values = js.Array[SlaMet](yes, no, `n/a`)
}

type SourceType = "cache-cluster" | "cache-parameter-group" | "cache-security-group" | "cache-subnet-group" | "replication-group" | "user" | "user-group"
object SourceType {
  val `cache-cluster`: "cache-cluster" = "cache-cluster"
  val `cache-parameter-group`: "cache-parameter-group" = "cache-parameter-group"
  val `cache-security-group`: "cache-security-group" = "cache-security-group"
  val `cache-subnet-group`: "cache-subnet-group" = "cache-subnet-group"
  val `replication-group`: "replication-group" = "replication-group"
  val user: "user" = "user"
  val `user-group`: "user-group" = "user-group"

  @inline def values = js.Array[SourceType](`cache-cluster`, `cache-parameter-group`, `cache-security-group`, `cache-subnet-group`, `replication-group`, user, `user-group`)
}

type UpdateActionStatus = "not-applied" | "waiting-to-start" | "in-progress" | "stopping" | "stopped" | "complete" | "scheduling" | "scheduled" | "not-applicable"
object UpdateActionStatus {
  val `not-applied`: "not-applied" = "not-applied"
  val `waiting-to-start`: "waiting-to-start" = "waiting-to-start"
  val `in-progress`: "in-progress" = "in-progress"
  val stopping: "stopping" = "stopping"
  val stopped: "stopped" = "stopped"
  val complete: "complete" = "complete"
  val scheduling: "scheduling" = "scheduling"
  val scheduled: "scheduled" = "scheduled"
  val `not-applicable`: "not-applicable" = "not-applicable"

  @inline def values = js.Array[UpdateActionStatus](`not-applied`, `waiting-to-start`, `in-progress`, stopping, stopped, complete, scheduling, scheduled, `not-applicable`)
}
