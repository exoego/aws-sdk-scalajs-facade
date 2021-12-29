package facade.amazonaws.services.ecs

import scalajs._

type AgentUpdateStatus = "PENDING" | "STAGING" | "STAGED" | "UPDATING" | "UPDATED" | "FAILED"
object AgentUpdateStatus {
  val PENDING: "PENDING" = "PENDING"
  val STAGING: "STAGING" = "STAGING"
  val STAGED: "STAGED" = "STAGED"
  val UPDATING: "UPDATING" = "UPDATING"
  val UPDATED: "UPDATED" = "UPDATED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[AgentUpdateStatus](PENDING, STAGING, STAGED, UPDATING, UPDATED, FAILED)
}

type AssignPublicIp = "ENABLED" | "DISABLED"
object AssignPublicIp {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[AssignPublicIp](ENABLED, DISABLED)
}

type CapacityProviderField = "TAGS"
object CapacityProviderField {
  val TAGS: "TAGS" = "TAGS"

  @inline def values = js.Array[CapacityProviderField](TAGS)
}

type CapacityProviderStatus = "ACTIVE" | "INACTIVE"
object CapacityProviderStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"

  @inline def values = js.Array[CapacityProviderStatus](ACTIVE, INACTIVE)
}

type CapacityProviderUpdateStatus = "DELETE_IN_PROGRESS" | "DELETE_COMPLETE" | "DELETE_FAILED" | "UPDATE_IN_PROGRESS" | "UPDATE_COMPLETE" | "UPDATE_FAILED"
object CapacityProviderUpdateStatus {
  val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  val DELETE_COMPLETE: "DELETE_COMPLETE" = "DELETE_COMPLETE"
  val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"
  val UPDATE_COMPLETE: "UPDATE_COMPLETE" = "UPDATE_COMPLETE"
  val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  @inline def values = js.Array[CapacityProviderUpdateStatus](DELETE_IN_PROGRESS, DELETE_COMPLETE, DELETE_FAILED, UPDATE_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_FAILED)
}

type ClusterField = "ATTACHMENTS" | "CONFIGURATIONS" | "SETTINGS" | "STATISTICS" | "TAGS"
object ClusterField {
  val ATTACHMENTS: "ATTACHMENTS" = "ATTACHMENTS"
  val CONFIGURATIONS: "CONFIGURATIONS" = "CONFIGURATIONS"
  val SETTINGS: "SETTINGS" = "SETTINGS"
  val STATISTICS: "STATISTICS" = "STATISTICS"
  val TAGS: "TAGS" = "TAGS"

  @inline def values = js.Array[ClusterField](ATTACHMENTS, CONFIGURATIONS, SETTINGS, STATISTICS, TAGS)
}

type ClusterSettingName = "containerInsights"
object ClusterSettingName {
  val containerInsights: "containerInsights" = "containerInsights"

  @inline def values = js.Array[ClusterSettingName](containerInsights)
}

type Compatibility = "EC2" | "FARGATE"
object Compatibility {
  val EC2: "EC2" = "EC2"
  val FARGATE: "FARGATE" = "FARGATE"

  @inline def values = js.Array[Compatibility](EC2, FARGATE)
}

type Connectivity = "CONNECTED" | "DISCONNECTED"
object Connectivity {
  val CONNECTED: "CONNECTED" = "CONNECTED"
  val DISCONNECTED: "DISCONNECTED" = "DISCONNECTED"

  @inline def values = js.Array[Connectivity](CONNECTED, DISCONNECTED)
}

type ContainerCondition = "START" | "COMPLETE" | "SUCCESS" | "HEALTHY"
object ContainerCondition {
  val START: "START" = "START"
  val COMPLETE: "COMPLETE" = "COMPLETE"
  val SUCCESS: "SUCCESS" = "SUCCESS"
  val HEALTHY: "HEALTHY" = "HEALTHY"

  @inline def values = js.Array[ContainerCondition](START, COMPLETE, SUCCESS, HEALTHY)
}

type ContainerInstanceField = "TAGS"
object ContainerInstanceField {
  val TAGS: "TAGS" = "TAGS"

  @inline def values = js.Array[ContainerInstanceField](TAGS)
}

type ContainerInstanceStatus = "ACTIVE" | "DRAINING" | "REGISTERING" | "DEREGISTERING" | "REGISTRATION_FAILED"
object ContainerInstanceStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DRAINING: "DRAINING" = "DRAINING"
  val REGISTERING: "REGISTERING" = "REGISTERING"
  val DEREGISTERING: "DEREGISTERING" = "DEREGISTERING"
  val REGISTRATION_FAILED: "REGISTRATION_FAILED" = "REGISTRATION_FAILED"

  @inline def values = js.Array[ContainerInstanceStatus](ACTIVE, DRAINING, REGISTERING, DEREGISTERING, REGISTRATION_FAILED)
}

type DeploymentControllerType = "ECS" | "CODE_DEPLOY" | "EXTERNAL"
object DeploymentControllerType {
  val ECS: "ECS" = "ECS"
  val CODE_DEPLOY: "CODE_DEPLOY" = "CODE_DEPLOY"
  val EXTERNAL: "EXTERNAL" = "EXTERNAL"

  @inline def values = js.Array[DeploymentControllerType](ECS, CODE_DEPLOY, EXTERNAL)
}

type DeploymentRolloutState = "COMPLETED" | "FAILED" | "IN_PROGRESS"
object DeploymentRolloutState {
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"

  @inline def values = js.Array[DeploymentRolloutState](COMPLETED, FAILED, IN_PROGRESS)
}

type DesiredStatus = "RUNNING" | "PENDING" | "STOPPED"
object DesiredStatus {
  val RUNNING: "RUNNING" = "RUNNING"
  val PENDING: "PENDING" = "PENDING"
  val STOPPED: "STOPPED" = "STOPPED"

  @inline def values = js.Array[DesiredStatus](RUNNING, PENDING, STOPPED)
}

type DeviceCgroupPermission = "read" | "write" | "mknod"
object DeviceCgroupPermission {
  val read: "read" = "read"
  val write: "write" = "write"
  val mknod: "mknod" = "mknod"

  @inline def values = js.Array[DeviceCgroupPermission](read, write, mknod)
}

type EFSAuthorizationConfigIAM = "ENABLED" | "DISABLED"
object EFSAuthorizationConfigIAM {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[EFSAuthorizationConfigIAM](ENABLED, DISABLED)
}

type EFSTransitEncryption = "ENABLED" | "DISABLED"
object EFSTransitEncryption {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[EFSTransitEncryption](ENABLED, DISABLED)
}

type EnvironmentFileType = "s3"
object EnvironmentFileType {
  val s3: "s3" = "s3"

  @inline def values = js.Array[EnvironmentFileType](s3)
}

type ExecuteCommandLogging = "NONE" | "DEFAULT" | "OVERRIDE"
object ExecuteCommandLogging {
  val NONE: "NONE" = "NONE"
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val OVERRIDE: "OVERRIDE" = "OVERRIDE"

  @inline def values = js.Array[ExecuteCommandLogging](NONE, DEFAULT, OVERRIDE)
}

type FirelensConfigurationType = "fluentd" | "fluentbit"
object FirelensConfigurationType {
  val fluentd: "fluentd" = "fluentd"
  val fluentbit: "fluentbit" = "fluentbit"

  @inline def values = js.Array[FirelensConfigurationType](fluentd, fluentbit)
}

type HealthStatus = "HEALTHY" | "UNHEALTHY" | "UNKNOWN"
object HealthStatus {
  val HEALTHY: "HEALTHY" = "HEALTHY"
  val UNHEALTHY: "UNHEALTHY" = "UNHEALTHY"
  val UNKNOWN: "UNKNOWN" = "UNKNOWN"

  @inline def values = js.Array[HealthStatus](HEALTHY, UNHEALTHY, UNKNOWN)
}

type IpcMode = "host" | "task" | "none"
object IpcMode {
  val host: "host" = "host"
  val task: "task" = "task"
  val none: "none" = "none"

  @inline def values = js.Array[IpcMode](host, task, none)
}

type LaunchType = "EC2" | "FARGATE"
object LaunchType {
  val EC2: "EC2" = "EC2"
  val FARGATE: "FARGATE" = "FARGATE"

  @inline def values = js.Array[LaunchType](EC2, FARGATE)
}

type LogDriver = "json-file" | "syslog" | "journald" | "gelf" | "fluentd" | "awslogs" | "splunk" | "awsfirelens"
object LogDriver {
  val `json-file`: "json-file" = "json-file"
  val syslog: "syslog" = "syslog"
  val journald: "journald" = "journald"
  val gelf: "gelf" = "gelf"
  val fluentd: "fluentd" = "fluentd"
  val awslogs: "awslogs" = "awslogs"
  val splunk: "splunk" = "splunk"
  val awsfirelens: "awsfirelens" = "awsfirelens"

  @inline def values = js.Array[LogDriver](`json-file`, syslog, journald, gelf, fluentd, awslogs, splunk, awsfirelens)
}

type ManagedAgentName = "ExecuteCommandAgent"
object ManagedAgentName {
  val ExecuteCommandAgent: "ExecuteCommandAgent" = "ExecuteCommandAgent"

  @inline def values = js.Array[ManagedAgentName](ExecuteCommandAgent)
}

type ManagedScalingStatus = "ENABLED" | "DISABLED"
object ManagedScalingStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[ManagedScalingStatus](ENABLED, DISABLED)
}

type ManagedTerminationProtection = "ENABLED" | "DISABLED"
object ManagedTerminationProtection {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[ManagedTerminationProtection](ENABLED, DISABLED)
}

type NetworkMode = "bridge" | "host" | "awsvpc" | "none"
object NetworkMode {
  val bridge: "bridge" = "bridge"
  val host: "host" = "host"
  val awsvpc: "awsvpc" = "awsvpc"
  val none: "none" = "none"

  @inline def values = js.Array[NetworkMode](bridge, host, awsvpc, none)
}

type PidMode = "host" | "task"
object PidMode {
  val host: "host" = "host"
  val task: "task" = "task"

  @inline def values = js.Array[PidMode](host, task)
}

type PlacementConstraintType = "distinctInstance" | "memberOf"
object PlacementConstraintType {
  val distinctInstance: "distinctInstance" = "distinctInstance"
  val memberOf: "memberOf" = "memberOf"

  @inline def values = js.Array[PlacementConstraintType](distinctInstance, memberOf)
}

type PlacementStrategyType = "random" | "spread" | "binpack"
object PlacementStrategyType {
  val random: "random" = "random"
  val spread: "spread" = "spread"
  val binpack: "binpack" = "binpack"

  @inline def values = js.Array[PlacementStrategyType](random, spread, binpack)
}

type PlatformDeviceType = "GPU"
object PlatformDeviceType {
  val GPU: "GPU" = "GPU"

  @inline def values = js.Array[PlatformDeviceType](GPU)
}

type PropagateTags = "TASK_DEFINITION" | "SERVICE"
object PropagateTags {
  val TASK_DEFINITION: "TASK_DEFINITION" = "TASK_DEFINITION"
  val SERVICE: "SERVICE" = "SERVICE"

  @inline def values = js.Array[PropagateTags](TASK_DEFINITION, SERVICE)
}

type ProxyConfigurationType = "APPMESH"
object ProxyConfigurationType {
  val APPMESH: "APPMESH" = "APPMESH"

  @inline def values = js.Array[ProxyConfigurationType](APPMESH)
}

type ResourceType = "GPU" | "InferenceAccelerator"
object ResourceType {
  val GPU: "GPU" = "GPU"
  val InferenceAccelerator: "InferenceAccelerator" = "InferenceAccelerator"

  @inline def values = js.Array[ResourceType](GPU, InferenceAccelerator)
}

type ScaleUnit = "PERCENT"
object ScaleUnit {
  val PERCENT: "PERCENT" = "PERCENT"

  @inline def values = js.Array[ScaleUnit](PERCENT)
}

type SchedulingStrategy = "REPLICA" | "DAEMON"
object SchedulingStrategy {
  val REPLICA: "REPLICA" = "REPLICA"
  val DAEMON: "DAEMON" = "DAEMON"

  @inline def values = js.Array[SchedulingStrategy](REPLICA, DAEMON)
}

type Scope = "task" | "shared"
object Scope {
  val task: "task" = "task"
  val shared: "shared" = "shared"

  @inline def values = js.Array[Scope](task, shared)
}

type ServiceField = "TAGS"
object ServiceField {
  val TAGS: "TAGS" = "TAGS"

  @inline def values = js.Array[ServiceField](TAGS)
}

type SettingName = "serviceLongArnFormat" | "taskLongArnFormat" | "containerInstanceLongArnFormat" | "awsvpcTrunking" | "containerInsights"
object SettingName {
  val serviceLongArnFormat: "serviceLongArnFormat" = "serviceLongArnFormat"
  val taskLongArnFormat: "taskLongArnFormat" = "taskLongArnFormat"
  val containerInstanceLongArnFormat: "containerInstanceLongArnFormat" = "containerInstanceLongArnFormat"
  val awsvpcTrunking: "awsvpcTrunking" = "awsvpcTrunking"
  val containerInsights: "containerInsights" = "containerInsights"

  @inline def values = js.Array[SettingName](serviceLongArnFormat, taskLongArnFormat, containerInstanceLongArnFormat, awsvpcTrunking, containerInsights)
}

type SortOrder = "ASC" | "DESC"
object SortOrder {
  val ASC: "ASC" = "ASC"
  val DESC: "DESC" = "DESC"

  @inline def values = js.Array[SortOrder](ASC, DESC)
}

type StabilityStatus = "STEADY_STATE" | "STABILIZING"
object StabilityStatus {
  val STEADY_STATE: "STEADY_STATE" = "STEADY_STATE"
  val STABILIZING: "STABILIZING" = "STABILIZING"

  @inline def values = js.Array[StabilityStatus](STEADY_STATE, STABILIZING)
}

type TargetType = "container-instance"
object TargetType {
  val `container-instance`: "container-instance" = "container-instance"

  @inline def values = js.Array[TargetType](`container-instance`)
}

type TaskDefinitionFamilyStatus = "ACTIVE" | "INACTIVE" | "ALL"
object TaskDefinitionFamilyStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"
  val ALL: "ALL" = "ALL"

  @inline def values = js.Array[TaskDefinitionFamilyStatus](ACTIVE, INACTIVE, ALL)
}

type TaskDefinitionField = "TAGS"
object TaskDefinitionField {
  val TAGS: "TAGS" = "TAGS"

  @inline def values = js.Array[TaskDefinitionField](TAGS)
}

type TaskDefinitionPlacementConstraintType = "memberOf"
object TaskDefinitionPlacementConstraintType {
  val memberOf: "memberOf" = "memberOf"

  @inline def values = js.Array[TaskDefinitionPlacementConstraintType](memberOf)
}

type TaskDefinitionStatus = "ACTIVE" | "INACTIVE"
object TaskDefinitionStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val INACTIVE: "INACTIVE" = "INACTIVE"

  @inline def values = js.Array[TaskDefinitionStatus](ACTIVE, INACTIVE)
}

type TaskField = "TAGS"
object TaskField {
  val TAGS: "TAGS" = "TAGS"

  @inline def values = js.Array[TaskField](TAGS)
}

type TaskSetField = "TAGS"
object TaskSetField {
  val TAGS: "TAGS" = "TAGS"

  @inline def values = js.Array[TaskSetField](TAGS)
}

type TaskStopCode = "TaskFailedToStart" | "EssentialContainerExited" | "UserInitiated"
object TaskStopCode {
  val TaskFailedToStart: "TaskFailedToStart" = "TaskFailedToStart"
  val EssentialContainerExited: "EssentialContainerExited" = "EssentialContainerExited"
  val UserInitiated: "UserInitiated" = "UserInitiated"

  @inline def values = js.Array[TaskStopCode](TaskFailedToStart, EssentialContainerExited, UserInitiated)
}

type TransportProtocol = "tcp" | "udp"
object TransportProtocol {
  val tcp: "tcp" = "tcp"
  val udp: "udp" = "udp"

  @inline def values = js.Array[TransportProtocol](tcp, udp)
}

type UlimitName = "core" | "cpu" | "data" | "fsize" | "locks" | "memlock" | "msgqueue" | "nice" | "nofile" | "nproc" | "rss" | "rtprio" | "rttime" | "sigpending" | "stack"
object UlimitName {
  val core: "core" = "core"
  val cpu: "cpu" = "cpu"
  val data: "data" = "data"
  val fsize: "fsize" = "fsize"
  val locks: "locks" = "locks"
  val memlock: "memlock" = "memlock"
  val msgqueue: "msgqueue" = "msgqueue"
  val nice: "nice" = "nice"
  val nofile: "nofile" = "nofile"
  val nproc: "nproc" = "nproc"
  val rss: "rss" = "rss"
  val rtprio: "rtprio" = "rtprio"
  val rttime: "rttime" = "rttime"
  val sigpending: "sigpending" = "sigpending"
  val stack: "stack" = "stack"

  @inline def values = js.Array[UlimitName](core, cpu, data, fsize, locks, memlock, msgqueue, nice, nofile, nproc, rss, rtprio, rttime, sigpending, stack)
}
