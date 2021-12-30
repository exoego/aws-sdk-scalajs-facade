package facade.amazonaws.services.elasticache

import scalajs.js

@js.native
sealed trait AZMode extends js.Any
object AZMode {
  val `single-az` = "single-az".asInstanceOf[AZMode]
  val `cross-az` = "cross-az".asInstanceOf[AZMode]

  @inline def values: js.Array[AZMode] = js.Array(`single-az`, `cross-az`)
}

@js.native
sealed trait AuthTokenUpdateStatus extends js.Any
object AuthTokenUpdateStatus {
  val SETTING = "SETTING".asInstanceOf[AuthTokenUpdateStatus]
  val ROTATING = "ROTATING".asInstanceOf[AuthTokenUpdateStatus]

  @inline def values: js.Array[AuthTokenUpdateStatus] = js.Array(SETTING, ROTATING)
}

@js.native
sealed trait AuthTokenUpdateStrategyType extends js.Any
object AuthTokenUpdateStrategyType {
  val SET = "SET".asInstanceOf[AuthTokenUpdateStrategyType]
  val ROTATE = "ROTATE".asInstanceOf[AuthTokenUpdateStrategyType]
  val DELETE = "DELETE".asInstanceOf[AuthTokenUpdateStrategyType]

  @inline def values: js.Array[AuthTokenUpdateStrategyType] = js.Array(SET, ROTATE, DELETE)
}

@js.native
sealed trait AuthenticationType extends js.Any
object AuthenticationType {
  val password = "password".asInstanceOf[AuthenticationType]
  val `no-password` = "no-password".asInstanceOf[AuthenticationType]

  @inline def values: js.Array[AuthenticationType] = js.Array(password, `no-password`)
}

@js.native
sealed trait AutomaticFailoverStatus extends js.Any
object AutomaticFailoverStatus {
  val enabled = "enabled".asInstanceOf[AutomaticFailoverStatus]
  val disabled = "disabled".asInstanceOf[AutomaticFailoverStatus]
  val enabling = "enabling".asInstanceOf[AutomaticFailoverStatus]
  val disabling = "disabling".asInstanceOf[AutomaticFailoverStatus]

  @inline def values: js.Array[AutomaticFailoverStatus] = js.Array(enabled, disabled, enabling, disabling)
}

@js.native
sealed trait ChangeType extends js.Any
object ChangeType {
  val immediate = "immediate".asInstanceOf[ChangeType]
  val `requires-reboot` = "requires-reboot".asInstanceOf[ChangeType]

  @inline def values: js.Array[ChangeType] = js.Array(immediate, `requires-reboot`)
}

@js.native
sealed trait DestinationType extends js.Any
object DestinationType {
  val `cloudwatch-logs` = "cloudwatch-logs".asInstanceOf[DestinationType]
  val `kinesis-firehose` = "kinesis-firehose".asInstanceOf[DestinationType]

  @inline def values: js.Array[DestinationType] = js.Array(`cloudwatch-logs`, `kinesis-firehose`)
}

@js.native
sealed trait LogDeliveryConfigurationStatus extends js.Any
object LogDeliveryConfigurationStatus {
  val active = "active".asInstanceOf[LogDeliveryConfigurationStatus]
  val enabling = "enabling".asInstanceOf[LogDeliveryConfigurationStatus]
  val modifying = "modifying".asInstanceOf[LogDeliveryConfigurationStatus]
  val disabling = "disabling".asInstanceOf[LogDeliveryConfigurationStatus]
  val error = "error".asInstanceOf[LogDeliveryConfigurationStatus]

  @inline def values: js.Array[LogDeliveryConfigurationStatus] = js.Array(active, enabling, modifying, disabling, error)
}

@js.native
sealed trait LogFormat extends js.Any
object LogFormat {
  val text = "text".asInstanceOf[LogFormat]
  val json = "json".asInstanceOf[LogFormat]

  @inline def values: js.Array[LogFormat] = js.Array(text, json)
}

@js.native
sealed trait LogType extends js.Any
object LogType {
  val `slow-log` = "slow-log".asInstanceOf[LogType]

  @inline def values: js.Array[LogType] = js.Array(`slow-log`)
}

@js.native
sealed trait MultiAZStatus extends js.Any
object MultiAZStatus {
  val enabled = "enabled".asInstanceOf[MultiAZStatus]
  val disabled = "disabled".asInstanceOf[MultiAZStatus]

  @inline def values: js.Array[MultiAZStatus] = js.Array(enabled, disabled)
}

@js.native
sealed trait NodeUpdateInitiatedBy extends js.Any
object NodeUpdateInitiatedBy {
  val system = "system".asInstanceOf[NodeUpdateInitiatedBy]
  val customer = "customer".asInstanceOf[NodeUpdateInitiatedBy]

  @inline def values: js.Array[NodeUpdateInitiatedBy] = js.Array(system, customer)
}

@js.native
sealed trait NodeUpdateStatus extends js.Any
object NodeUpdateStatus {
  val `not-applied` = "not-applied".asInstanceOf[NodeUpdateStatus]
  val `waiting-to-start` = "waiting-to-start".asInstanceOf[NodeUpdateStatus]
  val `in-progress` = "in-progress".asInstanceOf[NodeUpdateStatus]
  val stopping = "stopping".asInstanceOf[NodeUpdateStatus]
  val stopped = "stopped".asInstanceOf[NodeUpdateStatus]
  val complete = "complete".asInstanceOf[NodeUpdateStatus]

  @inline def values: js.Array[NodeUpdateStatus] = js.Array(`not-applied`, `waiting-to-start`, `in-progress`, stopping, stopped, complete)
}

@js.native
sealed trait OutpostMode extends js.Any
object OutpostMode {
  val `single-outpost` = "single-outpost".asInstanceOf[OutpostMode]
  val `cross-outpost` = "cross-outpost".asInstanceOf[OutpostMode]

  @inline def values: js.Array[OutpostMode] = js.Array(`single-outpost`, `cross-outpost`)
}

@js.native
sealed trait PendingAutomaticFailoverStatus extends js.Any
object PendingAutomaticFailoverStatus {
  val enabled = "enabled".asInstanceOf[PendingAutomaticFailoverStatus]
  val disabled = "disabled".asInstanceOf[PendingAutomaticFailoverStatus]

  @inline def values: js.Array[PendingAutomaticFailoverStatus] = js.Array(enabled, disabled)
}

@js.native
sealed trait ServiceUpdateSeverity extends js.Any
object ServiceUpdateSeverity {
  val critical = "critical".asInstanceOf[ServiceUpdateSeverity]
  val important = "important".asInstanceOf[ServiceUpdateSeverity]
  val medium = "medium".asInstanceOf[ServiceUpdateSeverity]
  val low = "low".asInstanceOf[ServiceUpdateSeverity]

  @inline def values: js.Array[ServiceUpdateSeverity] = js.Array(critical, important, medium, low)
}

@js.native
sealed trait ServiceUpdateStatus extends js.Any
object ServiceUpdateStatus {
  val available = "available".asInstanceOf[ServiceUpdateStatus]
  val cancelled = "cancelled".asInstanceOf[ServiceUpdateStatus]
  val expired = "expired".asInstanceOf[ServiceUpdateStatus]

  @inline def values: js.Array[ServiceUpdateStatus] = js.Array(available, cancelled, expired)
}

@js.native
sealed trait ServiceUpdateType extends js.Any
object ServiceUpdateType {
  val `security-update` = "security-update".asInstanceOf[ServiceUpdateType]

  @inline def values: js.Array[ServiceUpdateType] = js.Array(`security-update`)
}

@js.native
sealed trait SlaMet extends js.Any
object SlaMet {
  val yes = "yes".asInstanceOf[SlaMet]
  val no = "no".asInstanceOf[SlaMet]
  val `n/a` = "n/a".asInstanceOf[SlaMet]

  @inline def values: js.Array[SlaMet] = js.Array(yes, no, `n/a`)
}

@js.native
sealed trait SourceType extends js.Any
object SourceType {
  val `cache-cluster` = "cache-cluster".asInstanceOf[SourceType]
  val `cache-parameter-group` = "cache-parameter-group".asInstanceOf[SourceType]
  val `cache-security-group` = "cache-security-group".asInstanceOf[SourceType]
  val `cache-subnet-group` = "cache-subnet-group".asInstanceOf[SourceType]
  val `replication-group` = "replication-group".asInstanceOf[SourceType]
  val user = "user".asInstanceOf[SourceType]
  val `user-group` = "user-group".asInstanceOf[SourceType]

  @inline def values: js.Array[SourceType] = js.Array(`cache-cluster`, `cache-parameter-group`, `cache-security-group`, `cache-subnet-group`, `replication-group`, user, `user-group`)
}

@js.native
sealed trait UpdateActionStatus extends js.Any
object UpdateActionStatus {
  val `not-applied` = "not-applied".asInstanceOf[UpdateActionStatus]
  val `waiting-to-start` = "waiting-to-start".asInstanceOf[UpdateActionStatus]
  val `in-progress` = "in-progress".asInstanceOf[UpdateActionStatus]
  val stopping = "stopping".asInstanceOf[UpdateActionStatus]
  val stopped = "stopped".asInstanceOf[UpdateActionStatus]
  val complete = "complete".asInstanceOf[UpdateActionStatus]
  val scheduling = "scheduling".asInstanceOf[UpdateActionStatus]
  val scheduled = "scheduled".asInstanceOf[UpdateActionStatus]
  val `not-applicable` = "not-applicable".asInstanceOf[UpdateActionStatus]

  @inline def values: js.Array[UpdateActionStatus] = js.Array(`not-applied`, `waiting-to-start`, `in-progress`, stopping, stopped, complete, scheduling, scheduled, `not-applicable`)
}
