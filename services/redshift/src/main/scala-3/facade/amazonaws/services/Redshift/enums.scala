package facade.amazonaws.services.redshift

import scalajs.js

type ActionType = "restore-cluster" | "recommend-node-config" | "resize-cluster"
object ActionType {
  inline val `restore-cluster`: "restore-cluster" = "restore-cluster"
  inline val `recommend-node-config`: "recommend-node-config" = "recommend-node-config"
  inline val `resize-cluster`: "resize-cluster" = "resize-cluster"

  inline def values: js.Array[ActionType] = js.Array(`restore-cluster`, `recommend-node-config`, `resize-cluster`)
}

type AquaConfigurationStatus = "enabled" | "disabled" | "auto"
object AquaConfigurationStatus {
  inline val enabled: "enabled" = "enabled"
  inline val disabled: "disabled" = "disabled"
  inline val auto: "auto" = "auto"

  inline def values: js.Array[AquaConfigurationStatus] = js.Array(enabled, disabled, auto)
}

type AquaStatus = "enabled" | "disabled" | "applying"
object AquaStatus {
  inline val enabled: "enabled" = "enabled"
  inline val disabled: "disabled" = "disabled"
  inline val applying: "applying" = "applying"

  inline def values: js.Array[AquaStatus] = js.Array(enabled, disabled, applying)
}

type AuthorizationStatus = "Authorized" | "Revoking"
object AuthorizationStatus {
  inline val Authorized: "Authorized" = "Authorized"
  inline val Revoking: "Revoking" = "Revoking"

  inline def values: js.Array[AuthorizationStatus] = js.Array(Authorized, Revoking)
}

type Mode = "standard" | "high-performance"
object Mode {
  inline val standard: "standard" = "standard"
  inline val `high-performance`: "high-performance" = "high-performance"

  inline def values: js.Array[Mode] = js.Array(standard, `high-performance`)
}

type NodeConfigurationOptionsFilterName = "NodeType" | "NumberOfNodes" | "EstimatedDiskUtilizationPercent" | "Mode"
object NodeConfigurationOptionsFilterName {
  inline val NodeType: "NodeType" = "NodeType"
  inline val NumberOfNodes: "NumberOfNodes" = "NumberOfNodes"
  inline val EstimatedDiskUtilizationPercent: "EstimatedDiskUtilizationPercent" = "EstimatedDiskUtilizationPercent"
  inline val Mode: "Mode" = "Mode"

  inline def values: js.Array[NodeConfigurationOptionsFilterName] = js.Array(NodeType, NumberOfNodes, EstimatedDiskUtilizationPercent, Mode)
}

type OperatorType = "eq" | "lt" | "gt" | "le" | "ge" | "in" | "between"
object OperatorType {
  inline val eq: "eq" = "eq"
  inline val lt: "lt" = "lt"
  inline val gt: "gt" = "gt"
  inline val le: "le" = "le"
  inline val ge: "ge" = "ge"
  inline val in: "in" = "in"
  inline val between: "between" = "between"

  inline def values: js.Array[OperatorType] = js.Array(eq, lt, gt, le, ge, in, between)
}

type ParameterApplyType = "static" | "dynamic"
object ParameterApplyType {
  inline val static: "static" = "static"
  inline val dynamic: "dynamic" = "dynamic"

  inline def values: js.Array[ParameterApplyType] = js.Array(static, dynamic)
}

type PartnerIntegrationStatus = "Active" | "Inactive" | "RuntimeFailure" | "ConnectionFailure"
object PartnerIntegrationStatus {
  inline val Active: "Active" = "Active"
  inline val Inactive: "Inactive" = "Inactive"
  inline val RuntimeFailure: "RuntimeFailure" = "RuntimeFailure"
  inline val ConnectionFailure: "ConnectionFailure" = "ConnectionFailure"

  inline def values: js.Array[PartnerIntegrationStatus] = js.Array(Active, Inactive, RuntimeFailure, ConnectionFailure)
}

type ReservedNodeOfferingType = "Regular" | "Upgradable"
object ReservedNodeOfferingType {
  inline val Regular: "Regular" = "Regular"
  inline val Upgradable: "Upgradable" = "Upgradable"

  inline def values: js.Array[ReservedNodeOfferingType] = js.Array(Regular, Upgradable)
}

type ScheduleState = "MODIFYING" | "ACTIVE" | "FAILED"
object ScheduleState {
  inline val MODIFYING: "MODIFYING" = "MODIFYING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ScheduleState] = js.Array(MODIFYING, ACTIVE, FAILED)
}

type ScheduledActionFilterName = "cluster-identifier" | "iam-role"
object ScheduledActionFilterName {
  inline val `cluster-identifier`: "cluster-identifier" = "cluster-identifier"
  inline val `iam-role`: "iam-role" = "iam-role"

  inline def values: js.Array[ScheduledActionFilterName] = js.Array(`cluster-identifier`, `iam-role`)
}

type ScheduledActionState = "ACTIVE" | "DISABLED"
object ScheduledActionState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[ScheduledActionState] = js.Array(ACTIVE, DISABLED)
}

type ScheduledActionTypeValues = "ResizeCluster" | "PauseCluster" | "ResumeCluster"
object ScheduledActionTypeValues {
  inline val ResizeCluster: "ResizeCluster" = "ResizeCluster"
  inline val PauseCluster: "PauseCluster" = "PauseCluster"
  inline val ResumeCluster: "ResumeCluster" = "ResumeCluster"

  inline def values: js.Array[ScheduledActionTypeValues] = js.Array(ResizeCluster, PauseCluster, ResumeCluster)
}

type SnapshotAttributeToSortBy = "SOURCE_TYPE" | "TOTAL_SIZE" | "CREATE_TIME"
object SnapshotAttributeToSortBy {
  inline val SOURCE_TYPE: "SOURCE_TYPE" = "SOURCE_TYPE"
  inline val TOTAL_SIZE: "TOTAL_SIZE" = "TOTAL_SIZE"
  inline val CREATE_TIME: "CREATE_TIME" = "CREATE_TIME"

  inline def values: js.Array[SnapshotAttributeToSortBy] = js.Array(SOURCE_TYPE, TOTAL_SIZE, CREATE_TIME)
}

type SortByOrder = "ASC" | "DESC"
object SortByOrder {
  inline val ASC: "ASC" = "ASC"
  inline val DESC: "DESC" = "DESC"

  inline def values: js.Array[SortByOrder] = js.Array(ASC, DESC)
}

type SourceType = "cluster" | "cluster-parameter-group" | "cluster-security-group" | "cluster-snapshot" | "scheduled-action"
object SourceType {
  inline val cluster: "cluster" = "cluster"
  inline val `cluster-parameter-group`: "cluster-parameter-group" = "cluster-parameter-group"
  inline val `cluster-security-group`: "cluster-security-group" = "cluster-security-group"
  inline val `cluster-snapshot`: "cluster-snapshot" = "cluster-snapshot"
  inline val `scheduled-action`: "scheduled-action" = "scheduled-action"

  inline def values: js.Array[SourceType] = js.Array(cluster, `cluster-parameter-group`, `cluster-security-group`, `cluster-snapshot`, `scheduled-action`)
}

type TableRestoreStatusType = "PENDING" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "CANCELED"
object TableRestoreStatusType {
  inline val PENDING: "PENDING" = "PENDING"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val CANCELED: "CANCELED" = "CANCELED"

  inline def values: js.Array[TableRestoreStatusType] = js.Array(PENDING, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED)
}

type UsageLimitBreachAction = "log" | "emit-metric" | "disable"
object UsageLimitBreachAction {
  inline val log: "log" = "log"
  inline val `emit-metric`: "emit-metric" = "emit-metric"
  inline val disable: "disable" = "disable"

  inline def values: js.Array[UsageLimitBreachAction] = js.Array(log, `emit-metric`, disable)
}

type UsageLimitFeatureType = "spectrum" | "concurrency-scaling"
object UsageLimitFeatureType {
  inline val spectrum: "spectrum" = "spectrum"
  inline val `concurrency-scaling`: "concurrency-scaling" = "concurrency-scaling"

  inline def values: js.Array[UsageLimitFeatureType] = js.Array(spectrum, `concurrency-scaling`)
}

type UsageLimitLimitType = "time" | "data-scanned"
object UsageLimitLimitType {
  inline val time: "time" = "time"
  inline val `data-scanned`: "data-scanned" = "data-scanned"

  inline def values: js.Array[UsageLimitLimitType] = js.Array(time, `data-scanned`)
}

type UsageLimitPeriod = "daily" | "weekly" | "monthly"
object UsageLimitPeriod {
  inline val daily: "daily" = "daily"
  inline val weekly: "weekly" = "weekly"
  inline val monthly: "monthly" = "monthly"

  inline def values: js.Array[UsageLimitPeriod] = js.Array(daily, weekly, monthly)
}
