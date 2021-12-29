package facade.amazonaws.services.redshift

import scalajs._

type ActionType = "restore-cluster" | "recommend-node-config" | "resize-cluster"
object ActionType {
  val `restore-cluster`: "restore-cluster" = "restore-cluster"
  val `recommend-node-config`: "recommend-node-config" = "recommend-node-config"
  val `resize-cluster`: "resize-cluster" = "resize-cluster"

  @inline def values = js.Array[ActionType](`restore-cluster`, `recommend-node-config`, `resize-cluster`)
}

type AquaConfigurationStatus = "enabled" | "disabled" | "auto"
object AquaConfigurationStatus {
  val enabled: "enabled" = "enabled"
  val disabled: "disabled" = "disabled"
  val auto: "auto" = "auto"

  @inline def values = js.Array[AquaConfigurationStatus](enabled, disabled, auto)
}

type AquaStatus = "enabled" | "disabled" | "applying"
object AquaStatus {
  val enabled: "enabled" = "enabled"
  val disabled: "disabled" = "disabled"
  val applying: "applying" = "applying"

  @inline def values = js.Array[AquaStatus](enabled, disabled, applying)
}

type AuthorizationStatus = "Authorized" | "Revoking"
object AuthorizationStatus {
  val Authorized: "Authorized" = "Authorized"
  val Revoking: "Revoking" = "Revoking"

  @inline def values = js.Array[AuthorizationStatus](Authorized, Revoking)
}

type Mode = "standard" | "high-performance"
object Mode {
  val standard: "standard" = "standard"
  val `high-performance`: "high-performance" = "high-performance"

  @inline def values = js.Array[Mode](standard, `high-performance`)
}

type NodeConfigurationOptionsFilterName = "NodeType" | "NumberOfNodes" | "EstimatedDiskUtilizationPercent" | "Mode"
object NodeConfigurationOptionsFilterName {
  val NodeType: "NodeType" = "NodeType"
  val NumberOfNodes: "NumberOfNodes" = "NumberOfNodes"
  val EstimatedDiskUtilizationPercent: "EstimatedDiskUtilizationPercent" = "EstimatedDiskUtilizationPercent"
  val Mode: "Mode" = "Mode"

  @inline def values = js.Array[NodeConfigurationOptionsFilterName](NodeType, NumberOfNodes, EstimatedDiskUtilizationPercent, Mode)
}

type OperatorType = "eq" | "lt" | "gt" | "le" | "ge" | "in" | "between"
object OperatorType {
  val eq: "eq" = "eq"
  val lt: "lt" = "lt"
  val gt: "gt" = "gt"
  val le: "le" = "le"
  val ge: "ge" = "ge"
  val in: "in" = "in"
  val between: "between" = "between"

  @inline def values = js.Array[OperatorType](eq, lt, gt, le, ge, in, between)
}

type ParameterApplyType = "static" | "dynamic"
object ParameterApplyType {
  val static: "static" = "static"
  val dynamic: "dynamic" = "dynamic"

  @inline def values = js.Array[ParameterApplyType](static, dynamic)
}

type PartnerIntegrationStatus = "Active" | "Inactive" | "RuntimeFailure" | "ConnectionFailure"
object PartnerIntegrationStatus {
  val Active: "Active" = "Active"
  val Inactive: "Inactive" = "Inactive"
  val RuntimeFailure: "RuntimeFailure" = "RuntimeFailure"
  val ConnectionFailure: "ConnectionFailure" = "ConnectionFailure"

  @inline def values = js.Array[PartnerIntegrationStatus](Active, Inactive, RuntimeFailure, ConnectionFailure)
}

type ReservedNodeOfferingType = "Regular" | "Upgradable"
object ReservedNodeOfferingType {
  val Regular: "Regular" = "Regular"
  val Upgradable: "Upgradable" = "Upgradable"

  @inline def values = js.Array[ReservedNodeOfferingType](Regular, Upgradable)
}

type ScheduleState = "MODIFYING" | "ACTIVE" | "FAILED"
object ScheduleState {
  val MODIFYING: "MODIFYING" = "MODIFYING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[ScheduleState](MODIFYING, ACTIVE, FAILED)
}

type ScheduledActionFilterName = "cluster-identifier" | "iam-role"
object ScheduledActionFilterName {
  val `cluster-identifier`: "cluster-identifier" = "cluster-identifier"
  val `iam-role`: "iam-role" = "iam-role"

  @inline def values = js.Array[ScheduledActionFilterName](`cluster-identifier`, `iam-role`)
}

type ScheduledActionState = "ACTIVE" | "DISABLED"
object ScheduledActionState {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[ScheduledActionState](ACTIVE, DISABLED)
}

type ScheduledActionTypeValues = "ResizeCluster" | "PauseCluster" | "ResumeCluster"
object ScheduledActionTypeValues {
  val ResizeCluster: "ResizeCluster" = "ResizeCluster"
  val PauseCluster: "PauseCluster" = "PauseCluster"
  val ResumeCluster: "ResumeCluster" = "ResumeCluster"

  @inline def values = js.Array[ScheduledActionTypeValues](ResizeCluster, PauseCluster, ResumeCluster)
}

type SnapshotAttributeToSortBy = "SOURCE_TYPE" | "TOTAL_SIZE" | "CREATE_TIME"
object SnapshotAttributeToSortBy {
  val SOURCE_TYPE: "SOURCE_TYPE" = "SOURCE_TYPE"
  val TOTAL_SIZE: "TOTAL_SIZE" = "TOTAL_SIZE"
  val CREATE_TIME: "CREATE_TIME" = "CREATE_TIME"

  @inline def values = js.Array[SnapshotAttributeToSortBy](SOURCE_TYPE, TOTAL_SIZE, CREATE_TIME)
}

type SortByOrder = "ASC" | "DESC"
object SortByOrder {
  val ASC: "ASC" = "ASC"
  val DESC: "DESC" = "DESC"

  @inline def values = js.Array[SortByOrder](ASC, DESC)
}

type SourceType = "cluster" | "cluster-parameter-group" | "cluster-security-group" | "cluster-snapshot" | "scheduled-action"
object SourceType {
  val cluster: "cluster" = "cluster"
  val `cluster-parameter-group`: "cluster-parameter-group" = "cluster-parameter-group"
  val `cluster-security-group`: "cluster-security-group" = "cluster-security-group"
  val `cluster-snapshot`: "cluster-snapshot" = "cluster-snapshot"
  val `scheduled-action`: "scheduled-action" = "scheduled-action"

  @inline def values = js.Array[SourceType](cluster, `cluster-parameter-group`, `cluster-security-group`, `cluster-snapshot`, `scheduled-action`)
}

type TableRestoreStatusType = "PENDING" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "CANCELED"
object TableRestoreStatusType {
  val PENDING: "PENDING" = "PENDING"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"
  val CANCELED: "CANCELED" = "CANCELED"

  @inline def values = js.Array[TableRestoreStatusType](PENDING, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED)
}

type UsageLimitBreachAction = "log" | "emit-metric" | "disable"
object UsageLimitBreachAction {
  val log: "log" = "log"
  val `emit-metric`: "emit-metric" = "emit-metric"
  val disable: "disable" = "disable"

  @inline def values = js.Array[UsageLimitBreachAction](log, `emit-metric`, disable)
}

type UsageLimitFeatureType = "spectrum" | "concurrency-scaling"
object UsageLimitFeatureType {
  val spectrum: "spectrum" = "spectrum"
  val `concurrency-scaling`: "concurrency-scaling" = "concurrency-scaling"

  @inline def values = js.Array[UsageLimitFeatureType](spectrum, `concurrency-scaling`)
}

type UsageLimitLimitType = "time" | "data-scanned"
object UsageLimitLimitType {
  val time: "time" = "time"
  val `data-scanned`: "data-scanned" = "data-scanned"

  @inline def values = js.Array[UsageLimitLimitType](time, `data-scanned`)
}

type UsageLimitPeriod = "daily" | "weekly" | "monthly"
object UsageLimitPeriod {
  val daily: "daily" = "daily"
  val weekly: "weekly" = "weekly"
  val monthly: "monthly" = "monthly"

  @inline def values = js.Array[UsageLimitPeriod](daily, weekly, monthly)
}
