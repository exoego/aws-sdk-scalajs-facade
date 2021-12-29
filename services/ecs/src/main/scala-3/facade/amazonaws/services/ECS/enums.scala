package facade.amazonaws.services.ecs

import scalajs._

type AgentUpdateStatus = "PENDING" | "STAGING" | "STAGED" | "UPDATING" | "UPDATED" | "FAILED"
object AgentUpdateStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val STAGING: "STAGING" = "STAGING"
  inline val STAGED: "STAGED" = "STAGED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val UPDATED: "UPDATED" = "UPDATED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[AgentUpdateStatus] = js.Array(PENDING, STAGING, STAGED, UPDATING, UPDATED, FAILED)
}

type AssignPublicIp = "ENABLED" | "DISABLED"
object AssignPublicIp {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[AssignPublicIp] = js.Array(ENABLED, DISABLED)
}

type CapacityProviderField = "TAGS"
object CapacityProviderField {
  inline val TAGS: "TAGS" = "TAGS"

  inline def values: js.Array[CapacityProviderField] = js.Array(TAGS)
}

type CapacityProviderStatus = "ACTIVE" | "INACTIVE"
object CapacityProviderStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[CapacityProviderStatus] = js.Array(ACTIVE, INACTIVE)
}

type CapacityProviderUpdateStatus = "DELETE_IN_PROGRESS" | "DELETE_COMPLETE" | "DELETE_FAILED" | "UPDATE_IN_PROGRESS" | "UPDATE_COMPLETE" | "UPDATE_FAILED"
object CapacityProviderUpdateStatus {
  inline val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  inline val DELETE_COMPLETE: "DELETE_COMPLETE" = "DELETE_COMPLETE"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  inline val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"
  inline val UPDATE_COMPLETE: "UPDATE_COMPLETE" = "UPDATE_COMPLETE"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  inline def values: js.Array[CapacityProviderUpdateStatus] = js.Array(DELETE_IN_PROGRESS, DELETE_COMPLETE, DELETE_FAILED, UPDATE_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_FAILED)
}

type ClusterField = "ATTACHMENTS" | "CONFIGURATIONS" | "SETTINGS" | "STATISTICS" | "TAGS"
object ClusterField {
  inline val ATTACHMENTS: "ATTACHMENTS" = "ATTACHMENTS"
  inline val CONFIGURATIONS: "CONFIGURATIONS" = "CONFIGURATIONS"
  inline val SETTINGS: "SETTINGS" = "SETTINGS"
  inline val STATISTICS: "STATISTICS" = "STATISTICS"
  inline val TAGS: "TAGS" = "TAGS"

  inline def values: js.Array[ClusterField] = js.Array(ATTACHMENTS, CONFIGURATIONS, SETTINGS, STATISTICS, TAGS)
}

type ClusterSettingName = "containerInsights"
object ClusterSettingName {
  inline val containerInsights: "containerInsights" = "containerInsights"

  inline def values: js.Array[ClusterSettingName] = js.Array(containerInsights)
}

type Compatibility = "EC2" | "FARGATE"
object Compatibility {
  inline val EC2: "EC2" = "EC2"
  inline val FARGATE: "FARGATE" = "FARGATE"

  inline def values: js.Array[Compatibility] = js.Array(EC2, FARGATE)
}

type Connectivity = "CONNECTED" | "DISCONNECTED"
object Connectivity {
  inline val CONNECTED: "CONNECTED" = "CONNECTED"
  inline val DISCONNECTED: "DISCONNECTED" = "DISCONNECTED"

  inline def values: js.Array[Connectivity] = js.Array(CONNECTED, DISCONNECTED)
}

type ContainerCondition = "START" | "COMPLETE" | "SUCCESS" | "HEALTHY"
object ContainerCondition {
  inline val START: "START" = "START"
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val HEALTHY: "HEALTHY" = "HEALTHY"

  inline def values: js.Array[ContainerCondition] = js.Array(START, COMPLETE, SUCCESS, HEALTHY)
}

type ContainerInstanceField = "TAGS"
object ContainerInstanceField {
  inline val TAGS: "TAGS" = "TAGS"

  inline def values: js.Array[ContainerInstanceField] = js.Array(TAGS)
}

type ContainerInstanceStatus = "ACTIVE" | "DRAINING" | "REGISTERING" | "DEREGISTERING" | "REGISTRATION_FAILED"
object ContainerInstanceStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DRAINING: "DRAINING" = "DRAINING"
  inline val REGISTERING: "REGISTERING" = "REGISTERING"
  inline val DEREGISTERING: "DEREGISTERING" = "DEREGISTERING"
  inline val REGISTRATION_FAILED: "REGISTRATION_FAILED" = "REGISTRATION_FAILED"

  inline def values: js.Array[ContainerInstanceStatus] = js.Array(ACTIVE, DRAINING, REGISTERING, DEREGISTERING, REGISTRATION_FAILED)
}

type DeploymentControllerType = "ECS" | "CODE_DEPLOY" | "EXTERNAL"
object DeploymentControllerType {
  inline val ECS: "ECS" = "ECS"
  inline val CODE_DEPLOY: "CODE_DEPLOY" = "CODE_DEPLOY"
  inline val EXTERNAL: "EXTERNAL" = "EXTERNAL"

  inline def values: js.Array[DeploymentControllerType] = js.Array(ECS, CODE_DEPLOY, EXTERNAL)
}

type DeploymentRolloutState = "COMPLETED" | "FAILED" | "IN_PROGRESS"
object DeploymentRolloutState {
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"

  inline def values: js.Array[DeploymentRolloutState] = js.Array(COMPLETED, FAILED, IN_PROGRESS)
}

type DesiredStatus = "RUNNING" | "PENDING" | "STOPPED"
object DesiredStatus {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val PENDING: "PENDING" = "PENDING"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[DesiredStatus] = js.Array(RUNNING, PENDING, STOPPED)
}

type DeviceCgroupPermission = "read" | "write" | "mknod"
object DeviceCgroupPermission {
  inline val read: "read" = "read"
  inline val write: "write" = "write"
  inline val mknod: "mknod" = "mknod"

  inline def values: js.Array[DeviceCgroupPermission] = js.Array(read, write, mknod)
}

type EFSAuthorizationConfigIAM = "ENABLED" | "DISABLED"
object EFSAuthorizationConfigIAM {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[EFSAuthorizationConfigIAM] = js.Array(ENABLED, DISABLED)
}

type EFSTransitEncryption = "ENABLED" | "DISABLED"
object EFSTransitEncryption {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[EFSTransitEncryption] = js.Array(ENABLED, DISABLED)
}

type EnvironmentFileType = "s3"
object EnvironmentFileType {
  inline val s3: "s3" = "s3"

  inline def values: js.Array[EnvironmentFileType] = js.Array(s3)
}

type ExecuteCommandLogging = "NONE" | "DEFAULT" | "OVERRIDE"
object ExecuteCommandLogging {
  inline val NONE: "NONE" = "NONE"
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val OVERRIDE: "OVERRIDE" = "OVERRIDE"

  inline def values: js.Array[ExecuteCommandLogging] = js.Array(NONE, DEFAULT, OVERRIDE)
}

type FirelensConfigurationType = "fluentd" | "fluentbit"
object FirelensConfigurationType {
  inline val fluentd: "fluentd" = "fluentd"
  inline val fluentbit: "fluentbit" = "fluentbit"

  inline def values: js.Array[FirelensConfigurationType] = js.Array(fluentd, fluentbit)
}

type HealthStatus = "HEALTHY" | "UNHEALTHY" | "UNKNOWN"
object HealthStatus {
  inline val HEALTHY: "HEALTHY" = "HEALTHY"
  inline val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  inline def values: js.Array[HealthStatus] = js.Array(HEALTHY, UNHEALTHY, UNKNOWN)
}

type IpcMode = "host" | "task" | "none"
object IpcMode {
  inline val host: "host" = "host"
  inline val task: "task" = "task"
  inline val none: "none" = "none"

  inline def values: js.Array[IpcMode] = js.Array(host, task, none)
}

type LaunchType = "EC2" | "FARGATE"
object LaunchType {
  inline val EC2: "EC2" = "EC2"
  inline val FARGATE: "FARGATE" = "FARGATE"

  inline def values: js.Array[LaunchType] = js.Array(EC2, FARGATE)
}

type LogDriver = "json-file" | "syslog" | "journald" | "gelf" | "fluentd" | "awslogs" | "splunk" | "awsfirelens"
object LogDriver {
  inline val `json-file`: "json-file" = "json-file"
  inline val syslog: "syslog" = "syslog"
  inline val journald: "journald" = "journald"
  inline val gelf: "gelf" = "gelf"
  inline val fluentd: "fluentd" = "fluentd"
  inline val awslogs: "awslogs" = "awslogs"
  inline val splunk: "splunk" = "splunk"
  inline val awsfirelens: "awsfirelens" = "awsfirelens"

  inline def values: js.Array[LogDriver] = js.Array(`json-file`, syslog, journald, gelf, fluentd, awslogs, splunk, awsfirelens)
}

type ManagedAgentName = "ExecuteCommandAgent"
object ManagedAgentName {
  inline val ExecuteCommandAgent: "ExecuteCommandAgent" = "ExecuteCommandAgent"

  inline def values: js.Array[ManagedAgentName] = js.Array(ExecuteCommandAgent)
}

type ManagedScalingStatus = "ENABLED" | "DISABLED"
object ManagedScalingStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[ManagedScalingStatus] = js.Array(ENABLED, DISABLED)
}

type ManagedTerminationProtection = "ENABLED" | "DISABLED"
object ManagedTerminationProtection {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[ManagedTerminationProtection] = js.Array(ENABLED, DISABLED)
}

type NetworkMode = "bridge" | "host" | "awsvpc" | "none"
object NetworkMode {
  inline val bridge: "bridge" = "bridge"
  inline val host: "host" = "host"
  inline val awsvpc: "awsvpc" = "awsvpc"
  inline val none: "none" = "none"

  inline def values: js.Array[NetworkMode] = js.Array(bridge, host, awsvpc, none)
}

type PidMode = "host" | "task"
object PidMode {
  inline val host: "host" = "host"
  inline val task: "task" = "task"

  inline def values: js.Array[PidMode] = js.Array(host, task)
}

type PlacementConstraintType = "distinctInstance" | "memberOf"
object PlacementConstraintType {
  inline val distinctInstance: "distinctInstance" = "distinctInstance"
  inline val memberOf: "memberOf" = "memberOf"

  inline def values: js.Array[PlacementConstraintType] = js.Array(distinctInstance, memberOf)
}

type PlacementStrategyType = "random" | "spread" | "binpack"
object PlacementStrategyType {
  inline val random: "random" = "random"
  inline val spread: "spread" = "spread"
  inline val binpack: "binpack" = "binpack"

  inline def values: js.Array[PlacementStrategyType] = js.Array(random, spread, binpack)
}

type PlatformDeviceType = "GPU"
object PlatformDeviceType {
  inline val GPU: "GPU" = "GPU"

  inline def values: js.Array[PlatformDeviceType] = js.Array(GPU)
}

type PropagateTags = "TASK_DEFINITION" | "SERVICE"
object PropagateTags {
  inline val TASK_DEFINITION: "TASK_DEFINITION" = "TASK_DEFINITION"
  inline val SERVICE: "SERVICE" = "SERVICE"

  inline def values: js.Array[PropagateTags] = js.Array(TASK_DEFINITION, SERVICE)
}

type ProxyConfigurationType = "APPMESH"
object ProxyConfigurationType {
  inline val APPMESH: "APPMESH" = "APPMESH"

  inline def values: js.Array[ProxyConfigurationType] = js.Array(APPMESH)
}

type ResourceType = "GPU" | "InferenceAccelerator"
object ResourceType {
  inline val GPU: "GPU" = "GPU"
  inline val InferenceAccelerator: "InferenceAccelerator" = "InferenceAccelerator"

  inline def values: js.Array[ResourceType] = js.Array(GPU, InferenceAccelerator)
}

type ScaleUnit = "PERCENT"
object ScaleUnit {
  inline val PERCENT: "PERCENT" = "PERCENT"

  inline def values: js.Array[ScaleUnit] = js.Array(PERCENT)
}

type SchedulingStrategy = "REPLICA" | "DAEMON"
object SchedulingStrategy {
  inline val REPLICA: "REPLICA" = "REPLICA"
  inline val DAEMON: "DAEMON" = "DAEMON"

  inline def values: js.Array[SchedulingStrategy] = js.Array(REPLICA, DAEMON)
}

type Scope = "task" | "shared"
object Scope {
  inline val task: "task" = "task"
  inline val shared: "shared" = "shared"

  inline def values: js.Array[Scope] = js.Array(task, shared)
}

type ServiceField = "TAGS"
object ServiceField {
  inline val TAGS: "TAGS" = "TAGS"

  inline def values: js.Array[ServiceField] = js.Array(TAGS)
}

type SettingName = "serviceLongArnFormat" | "taskLongArnFormat" | "containerInstanceLongArnFormat" | "awsvpcTrunking" | "containerInsights"
object SettingName {
  inline val serviceLongArnFormat: "serviceLongArnFormat" = "serviceLongArnFormat"
  inline val taskLongArnFormat: "taskLongArnFormat" = "taskLongArnFormat"
  inline val containerInstanceLongArnFormat: "containerInstanceLongArnFormat" = "containerInstanceLongArnFormat"
  inline val awsvpcTrunking: "awsvpcTrunking" = "awsvpcTrunking"
  inline val containerInsights: "containerInsights" = "containerInsights"

  inline def values: js.Array[SettingName] = js.Array(serviceLongArnFormat, taskLongArnFormat, containerInstanceLongArnFormat, awsvpcTrunking, containerInsights)
}

type SortOrder = "ASC" | "DESC"
object SortOrder {
  inline val ASC: "ASC" = "ASC"
  inline val DESC: "DESC" = "DESC"

  inline def values: js.Array[SortOrder] = js.Array(ASC, DESC)
}

type StabilityStatus = "STEADY_STATE" | "STABILIZING"
object StabilityStatus {
  inline val STEADY_STATE: "STEADY_STATE" = "STEADY_STATE"
  inline val STABILIZING: "STABILIZING" = "STABILIZING"

  inline def values: js.Array[StabilityStatus] = js.Array(STEADY_STATE, STABILIZING)
}

type TargetType = "container-instance"
object TargetType {
  inline val `container-instance`: "container-instance" = "container-instance"

  inline def values: js.Array[TargetType] = js.Array(`container-instance`)
}

type TaskDefinitionFamilyStatus = "ACTIVE" | "INACTIVE" | "ALL"
object TaskDefinitionFamilyStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[TaskDefinitionFamilyStatus] = js.Array(ACTIVE, INACTIVE, ALL)
}

type TaskDefinitionField = "TAGS"
object TaskDefinitionField {
  inline val TAGS: "TAGS" = "TAGS"

  inline def values: js.Array[TaskDefinitionField] = js.Array(TAGS)
}

type TaskDefinitionPlacementConstraintType = "memberOf"
object TaskDefinitionPlacementConstraintType {
  inline val memberOf: "memberOf" = "memberOf"

  inline def values: js.Array[TaskDefinitionPlacementConstraintType] = js.Array(memberOf)
}

type TaskDefinitionStatus = "ACTIVE" | "INACTIVE"
object TaskDefinitionStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[TaskDefinitionStatus] = js.Array(ACTIVE, INACTIVE)
}

type TaskField = "TAGS"
object TaskField {
  inline val TAGS: "TAGS" = "TAGS"

  inline def values: js.Array[TaskField] = js.Array(TAGS)
}

type TaskSetField = "TAGS"
object TaskSetField {
  inline val TAGS: "TAGS" = "TAGS"

  inline def values: js.Array[TaskSetField] = js.Array(TAGS)
}

type TaskStopCode = "TaskFailedToStart" | "EssentialContainerExited" | "UserInitiated"
object TaskStopCode {
  inline val TaskFailedToStart: "TaskFailedToStart" = "TaskFailedToStart"
  inline val EssentialContainerExited: "EssentialContainerExited" = "EssentialContainerExited"
  inline val UserInitiated: "UserInitiated" = "UserInitiated"

  inline def values: js.Array[TaskStopCode] = js.Array(TaskFailedToStart, EssentialContainerExited, UserInitiated)
}

type TransportProtocol = "tcp" | "udp"
object TransportProtocol {
  inline val tcp: "tcp" = "tcp"
  inline val udp: "udp" = "udp"

  inline def values: js.Array[TransportProtocol] = js.Array(tcp, udp)
}

type UlimitName = "core" | "cpu" | "data" | "fsize" | "locks" | "memlock" | "msgqueue" | "nice" | "nofile" | "nproc" | "rss" | "rtprio" | "rttime" | "sigpending" | "stack"
object UlimitName {
  inline val core: "core" = "core"
  inline val cpu: "cpu" = "cpu"
  inline val data: "data" = "data"
  inline val fsize: "fsize" = "fsize"
  inline val locks: "locks" = "locks"
  inline val memlock: "memlock" = "memlock"
  inline val msgqueue: "msgqueue" = "msgqueue"
  inline val nice: "nice" = "nice"
  inline val nofile: "nofile" = "nofile"
  inline val nproc: "nproc" = "nproc"
  inline val rss: "rss" = "rss"
  inline val rtprio: "rtprio" = "rtprio"
  inline val rttime: "rttime" = "rttime"
  inline val sigpending: "sigpending" = "sigpending"
  inline val stack: "stack" = "stack"

  inline def values: js.Array[UlimitName] = js.Array(core, cpu, data, fsize, locks, memlock, msgqueue, nice, nofile, nproc, rss, rtprio, rttime, sigpending, stack)
}
