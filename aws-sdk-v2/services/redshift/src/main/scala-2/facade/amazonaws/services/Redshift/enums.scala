package facade.amazonaws.services.redshift

import scalajs.js

@js.native
sealed trait ActionType extends js.Any
object ActionType {
  val `restore-cluster` = "restore-cluster".asInstanceOf[ActionType]
  val `recommend-node-config` = "recommend-node-config".asInstanceOf[ActionType]
  val `resize-cluster` = "resize-cluster".asInstanceOf[ActionType]

  @inline def values: js.Array[ActionType] = js.Array(`restore-cluster`, `recommend-node-config`, `resize-cluster`)
}

@js.native
sealed trait AquaConfigurationStatus extends js.Any
object AquaConfigurationStatus {
  val enabled = "enabled".asInstanceOf[AquaConfigurationStatus]
  val disabled = "disabled".asInstanceOf[AquaConfigurationStatus]
  val auto = "auto".asInstanceOf[AquaConfigurationStatus]

  @inline def values: js.Array[AquaConfigurationStatus] = js.Array(enabled, disabled, auto)
}

@js.native
sealed trait AquaStatus extends js.Any
object AquaStatus {
  val enabled = "enabled".asInstanceOf[AquaStatus]
  val disabled = "disabled".asInstanceOf[AquaStatus]
  val applying = "applying".asInstanceOf[AquaStatus]

  @inline def values: js.Array[AquaStatus] = js.Array(enabled, disabled, applying)
}

@js.native
sealed trait AuthorizationStatus extends js.Any
object AuthorizationStatus {
  val Authorized = "Authorized".asInstanceOf[AuthorizationStatus]
  val Revoking = "Revoking".asInstanceOf[AuthorizationStatus]

  @inline def values: js.Array[AuthorizationStatus] = js.Array(Authorized, Revoking)
}

@js.native
sealed trait DataShareStatus extends js.Any
object DataShareStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[DataShareStatus]
  val PENDING_AUTHORIZATION = "PENDING_AUTHORIZATION".asInstanceOf[DataShareStatus]
  val AUTHORIZED = "AUTHORIZED".asInstanceOf[DataShareStatus]
  val DEAUTHORIZED = "DEAUTHORIZED".asInstanceOf[DataShareStatus]
  val REJECTED = "REJECTED".asInstanceOf[DataShareStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[DataShareStatus]

  @inline def values: js.Array[DataShareStatus] = js.Array(ACTIVE, PENDING_AUTHORIZATION, AUTHORIZED, DEAUTHORIZED, REJECTED, AVAILABLE)
}

@js.native
sealed trait DataShareStatusForConsumer extends js.Any
object DataShareStatusForConsumer {
  val ACTIVE = "ACTIVE".asInstanceOf[DataShareStatusForConsumer]
  val AVAILABLE = "AVAILABLE".asInstanceOf[DataShareStatusForConsumer]

  @inline def values: js.Array[DataShareStatusForConsumer] = js.Array(ACTIVE, AVAILABLE)
}

@js.native
sealed trait DataShareStatusForProducer extends js.Any
object DataShareStatusForProducer {
  val ACTIVE = "ACTIVE".asInstanceOf[DataShareStatusForProducer]
  val AUTHORIZED = "AUTHORIZED".asInstanceOf[DataShareStatusForProducer]
  val PENDING_AUTHORIZATION = "PENDING_AUTHORIZATION".asInstanceOf[DataShareStatusForProducer]
  val DEAUTHORIZED = "DEAUTHORIZED".asInstanceOf[DataShareStatusForProducer]
  val REJECTED = "REJECTED".asInstanceOf[DataShareStatusForProducer]

  @inline def values: js.Array[DataShareStatusForProducer] = js.Array(ACTIVE, AUTHORIZED, PENDING_AUTHORIZATION, DEAUTHORIZED, REJECTED)
}

@js.native
sealed trait LogDestinationType extends js.Any
object LogDestinationType {
  val s3 = "s3".asInstanceOf[LogDestinationType]
  val cloudwatch = "cloudwatch".asInstanceOf[LogDestinationType]

  @inline def values: js.Array[LogDestinationType] = js.Array(s3, cloudwatch)
}

@js.native
sealed trait Mode extends js.Any
object Mode {
  val standard = "standard".asInstanceOf[Mode]
  val `high-performance` = "high-performance".asInstanceOf[Mode]

  @inline def values: js.Array[Mode] = js.Array(standard, `high-performance`)
}

@js.native
sealed trait NodeConfigurationOptionsFilterName extends js.Any
object NodeConfigurationOptionsFilterName {
  val NodeType = "NodeType".asInstanceOf[NodeConfigurationOptionsFilterName]
  val NumberOfNodes = "NumberOfNodes".asInstanceOf[NodeConfigurationOptionsFilterName]
  val EstimatedDiskUtilizationPercent = "EstimatedDiskUtilizationPercent".asInstanceOf[NodeConfigurationOptionsFilterName]
  val Mode = "Mode".asInstanceOf[NodeConfigurationOptionsFilterName]

  @inline def values: js.Array[NodeConfigurationOptionsFilterName] = js.Array(NodeType, NumberOfNodes, EstimatedDiskUtilizationPercent, Mode)
}

@js.native
sealed trait OperatorType extends js.Any
object OperatorType {
  val eq = "eq".asInstanceOf[OperatorType]
  val lt = "lt".asInstanceOf[OperatorType]
  val gt = "gt".asInstanceOf[OperatorType]
  val le = "le".asInstanceOf[OperatorType]
  val ge = "ge".asInstanceOf[OperatorType]
  val in = "in".asInstanceOf[OperatorType]
  val between = "between".asInstanceOf[OperatorType]

  @inline def values: js.Array[OperatorType] = js.Array(eq, lt, gt, le, ge, in, between)
}

@js.native
sealed trait ParameterApplyType extends js.Any
object ParameterApplyType {
  val static = "static".asInstanceOf[ParameterApplyType]
  val dynamic = "dynamic".asInstanceOf[ParameterApplyType]

  @inline def values: js.Array[ParameterApplyType] = js.Array(static, dynamic)
}

@js.native
sealed trait PartnerIntegrationStatus extends js.Any
object PartnerIntegrationStatus {
  val Active = "Active".asInstanceOf[PartnerIntegrationStatus]
  val Inactive = "Inactive".asInstanceOf[PartnerIntegrationStatus]
  val RuntimeFailure = "RuntimeFailure".asInstanceOf[PartnerIntegrationStatus]
  val ConnectionFailure = "ConnectionFailure".asInstanceOf[PartnerIntegrationStatus]

  @inline def values: js.Array[PartnerIntegrationStatus] = js.Array(Active, Inactive, RuntimeFailure, ConnectionFailure)
}

@js.native
sealed trait ReservedNodeExchangeActionType extends js.Any
object ReservedNodeExchangeActionType {
  val `restore-cluster` = "restore-cluster".asInstanceOf[ReservedNodeExchangeActionType]
  val `resize-cluster` = "resize-cluster".asInstanceOf[ReservedNodeExchangeActionType]

  @inline def values: js.Array[ReservedNodeExchangeActionType] = js.Array(`restore-cluster`, `resize-cluster`)
}

@js.native
sealed trait ReservedNodeExchangeStatusType extends js.Any
object ReservedNodeExchangeStatusType {
  val REQUESTED = "REQUESTED".asInstanceOf[ReservedNodeExchangeStatusType]
  val PENDING = "PENDING".asInstanceOf[ReservedNodeExchangeStatusType]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ReservedNodeExchangeStatusType]
  val RETRYING = "RETRYING".asInstanceOf[ReservedNodeExchangeStatusType]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[ReservedNodeExchangeStatusType]
  val FAILED = "FAILED".asInstanceOf[ReservedNodeExchangeStatusType]

  @inline def values: js.Array[ReservedNodeExchangeStatusType] = js.Array(REQUESTED, PENDING, IN_PROGRESS, RETRYING, SUCCEEDED, FAILED)
}

@js.native
sealed trait ReservedNodeOfferingType extends js.Any
object ReservedNodeOfferingType {
  val Regular = "Regular".asInstanceOf[ReservedNodeOfferingType]
  val Upgradable = "Upgradable".asInstanceOf[ReservedNodeOfferingType]

  @inline def values: js.Array[ReservedNodeOfferingType] = js.Array(Regular, Upgradable)
}

@js.native
sealed trait ScheduleState extends js.Any
object ScheduleState {
  val MODIFYING = "MODIFYING".asInstanceOf[ScheduleState]
  val ACTIVE = "ACTIVE".asInstanceOf[ScheduleState]
  val FAILED = "FAILED".asInstanceOf[ScheduleState]

  @inline def values: js.Array[ScheduleState] = js.Array(MODIFYING, ACTIVE, FAILED)
}

@js.native
sealed trait ScheduledActionFilterName extends js.Any
object ScheduledActionFilterName {
  val `cluster-identifier` = "cluster-identifier".asInstanceOf[ScheduledActionFilterName]
  val `iam-role` = "iam-role".asInstanceOf[ScheduledActionFilterName]

  @inline def values: js.Array[ScheduledActionFilterName] = js.Array(`cluster-identifier`, `iam-role`)
}

@js.native
sealed trait ScheduledActionState extends js.Any
object ScheduledActionState {
  val ACTIVE = "ACTIVE".asInstanceOf[ScheduledActionState]
  val DISABLED = "DISABLED".asInstanceOf[ScheduledActionState]

  @inline def values: js.Array[ScheduledActionState] = js.Array(ACTIVE, DISABLED)
}

@js.native
sealed trait ScheduledActionTypeValues extends js.Any
object ScheduledActionTypeValues {
  val ResizeCluster = "ResizeCluster".asInstanceOf[ScheduledActionTypeValues]
  val PauseCluster = "PauseCluster".asInstanceOf[ScheduledActionTypeValues]
  val ResumeCluster = "ResumeCluster".asInstanceOf[ScheduledActionTypeValues]

  @inline def values: js.Array[ScheduledActionTypeValues] = js.Array(ResizeCluster, PauseCluster, ResumeCluster)
}

@js.native
sealed trait SnapshotAttributeToSortBy extends js.Any
object SnapshotAttributeToSortBy {
  val SOURCE_TYPE = "SOURCE_TYPE".asInstanceOf[SnapshotAttributeToSortBy]
  val TOTAL_SIZE = "TOTAL_SIZE".asInstanceOf[SnapshotAttributeToSortBy]
  val CREATE_TIME = "CREATE_TIME".asInstanceOf[SnapshotAttributeToSortBy]

  @inline def values: js.Array[SnapshotAttributeToSortBy] = js.Array(SOURCE_TYPE, TOTAL_SIZE, CREATE_TIME)
}

@js.native
sealed trait SortByOrder extends js.Any
object SortByOrder {
  val ASC = "ASC".asInstanceOf[SortByOrder]
  val DESC = "DESC".asInstanceOf[SortByOrder]

  @inline def values: js.Array[SortByOrder] = js.Array(ASC, DESC)
}

@js.native
sealed trait SourceType extends js.Any
object SourceType {
  val cluster = "cluster".asInstanceOf[SourceType]
  val `cluster-parameter-group` = "cluster-parameter-group".asInstanceOf[SourceType]
  val `cluster-security-group` = "cluster-security-group".asInstanceOf[SourceType]
  val `cluster-snapshot` = "cluster-snapshot".asInstanceOf[SourceType]
  val `scheduled-action` = "scheduled-action".asInstanceOf[SourceType]

  @inline def values: js.Array[SourceType] = js.Array(cluster, `cluster-parameter-group`, `cluster-security-group`, `cluster-snapshot`, `scheduled-action`)
}

@js.native
sealed trait TableRestoreStatusType extends js.Any
object TableRestoreStatusType {
  val PENDING = "PENDING".asInstanceOf[TableRestoreStatusType]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[TableRestoreStatusType]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[TableRestoreStatusType]
  val FAILED = "FAILED".asInstanceOf[TableRestoreStatusType]
  val CANCELED = "CANCELED".asInstanceOf[TableRestoreStatusType]

  @inline def values: js.Array[TableRestoreStatusType] = js.Array(PENDING, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED)
}

@js.native
sealed trait UsageLimitBreachAction extends js.Any
object UsageLimitBreachAction {
  val log = "log".asInstanceOf[UsageLimitBreachAction]
  val `emit-metric` = "emit-metric".asInstanceOf[UsageLimitBreachAction]
  val disable = "disable".asInstanceOf[UsageLimitBreachAction]

  @inline def values: js.Array[UsageLimitBreachAction] = js.Array(log, `emit-metric`, disable)
}

@js.native
sealed trait UsageLimitFeatureType extends js.Any
object UsageLimitFeatureType {
  val spectrum = "spectrum".asInstanceOf[UsageLimitFeatureType]
  val `concurrency-scaling` = "concurrency-scaling".asInstanceOf[UsageLimitFeatureType]
  val `cross-region-datasharing` = "cross-region-datasharing".asInstanceOf[UsageLimitFeatureType]

  @inline def values: js.Array[UsageLimitFeatureType] = js.Array(spectrum, `concurrency-scaling`, `cross-region-datasharing`)
}

@js.native
sealed trait UsageLimitLimitType extends js.Any
object UsageLimitLimitType {
  val time = "time".asInstanceOf[UsageLimitLimitType]
  val `data-scanned` = "data-scanned".asInstanceOf[UsageLimitLimitType]

  @inline def values: js.Array[UsageLimitLimitType] = js.Array(time, `data-scanned`)
}

@js.native
sealed trait UsageLimitPeriod extends js.Any
object UsageLimitPeriod {
  val daily = "daily".asInstanceOf[UsageLimitPeriod]
  val weekly = "weekly".asInstanceOf[UsageLimitPeriod]
  val monthly = "monthly".asInstanceOf[UsageLimitPeriod]

  @inline def values: js.Array[UsageLimitPeriod] = js.Array(daily, weekly, monthly)
}
