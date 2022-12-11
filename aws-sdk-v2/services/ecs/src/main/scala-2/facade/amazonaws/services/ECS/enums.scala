package facade.amazonaws.services.ecs

import scalajs.js

@js.native
sealed trait AgentUpdateStatus extends js.Any
object AgentUpdateStatus {
  val PENDING = "PENDING".asInstanceOf[AgentUpdateStatus]
  val STAGING = "STAGING".asInstanceOf[AgentUpdateStatus]
  val STAGED = "STAGED".asInstanceOf[AgentUpdateStatus]
  val UPDATING = "UPDATING".asInstanceOf[AgentUpdateStatus]
  val UPDATED = "UPDATED".asInstanceOf[AgentUpdateStatus]
  val FAILED = "FAILED".asInstanceOf[AgentUpdateStatus]

  @inline def values: js.Array[AgentUpdateStatus] = js.Array(PENDING, STAGING, STAGED, UPDATING, UPDATED, FAILED)
}

@js.native
sealed trait ApplicationProtocol extends js.Any
object ApplicationProtocol {
  val http = "http".asInstanceOf[ApplicationProtocol]
  val http2 = "http2".asInstanceOf[ApplicationProtocol]
  val grpc = "grpc".asInstanceOf[ApplicationProtocol]

  @inline def values: js.Array[ApplicationProtocol] = js.Array(http, http2, grpc)
}

@js.native
sealed trait AssignPublicIp extends js.Any
object AssignPublicIp {
  val ENABLED = "ENABLED".asInstanceOf[AssignPublicIp]
  val DISABLED = "DISABLED".asInstanceOf[AssignPublicIp]

  @inline def values: js.Array[AssignPublicIp] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait CPUArchitecture extends js.Any
object CPUArchitecture {
  val X86_64 = "X86_64".asInstanceOf[CPUArchitecture]
  val ARM64 = "ARM64".asInstanceOf[CPUArchitecture]

  @inline def values: js.Array[CPUArchitecture] = js.Array(X86_64, ARM64)
}

@js.native
sealed trait CapacityProviderField extends js.Any
object CapacityProviderField {
  val TAGS = "TAGS".asInstanceOf[CapacityProviderField]

  @inline def values: js.Array[CapacityProviderField] = js.Array(TAGS)
}

@js.native
sealed trait CapacityProviderStatus extends js.Any
object CapacityProviderStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[CapacityProviderStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[CapacityProviderStatus]

  @inline def values: js.Array[CapacityProviderStatus] = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait CapacityProviderUpdateStatus extends js.Any
object CapacityProviderUpdateStatus {
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[CapacityProviderUpdateStatus]
  val DELETE_COMPLETE = "DELETE_COMPLETE".asInstanceOf[CapacityProviderUpdateStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[CapacityProviderUpdateStatus]
  val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[CapacityProviderUpdateStatus]
  val UPDATE_COMPLETE = "UPDATE_COMPLETE".asInstanceOf[CapacityProviderUpdateStatus]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[CapacityProviderUpdateStatus]

  @inline def values: js.Array[CapacityProviderUpdateStatus] = js.Array(DELETE_IN_PROGRESS, DELETE_COMPLETE, DELETE_FAILED, UPDATE_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_FAILED)
}

@js.native
sealed trait ClusterField extends js.Any
object ClusterField {
  val ATTACHMENTS = "ATTACHMENTS".asInstanceOf[ClusterField]
  val CONFIGURATIONS = "CONFIGURATIONS".asInstanceOf[ClusterField]
  val SETTINGS = "SETTINGS".asInstanceOf[ClusterField]
  val STATISTICS = "STATISTICS".asInstanceOf[ClusterField]
  val TAGS = "TAGS".asInstanceOf[ClusterField]

  @inline def values: js.Array[ClusterField] = js.Array(ATTACHMENTS, CONFIGURATIONS, SETTINGS, STATISTICS, TAGS)
}

@js.native
sealed trait ClusterSettingName extends js.Any
object ClusterSettingName {
  val containerInsights = "containerInsights".asInstanceOf[ClusterSettingName]

  @inline def values: js.Array[ClusterSettingName] = js.Array(containerInsights)
}

@js.native
sealed trait Compatibility extends js.Any
object Compatibility {
  val EC2 = "EC2".asInstanceOf[Compatibility]
  val FARGATE = "FARGATE".asInstanceOf[Compatibility]
  val EXTERNAL = "EXTERNAL".asInstanceOf[Compatibility]

  @inline def values: js.Array[Compatibility] = js.Array(EC2, FARGATE, EXTERNAL)
}

@js.native
sealed trait Connectivity extends js.Any
object Connectivity {
  val CONNECTED = "CONNECTED".asInstanceOf[Connectivity]
  val DISCONNECTED = "DISCONNECTED".asInstanceOf[Connectivity]

  @inline def values: js.Array[Connectivity] = js.Array(CONNECTED, DISCONNECTED)
}

@js.native
sealed trait ContainerCondition extends js.Any
object ContainerCondition {
  val START = "START".asInstanceOf[ContainerCondition]
  val COMPLETE = "COMPLETE".asInstanceOf[ContainerCondition]
  val SUCCESS = "SUCCESS".asInstanceOf[ContainerCondition]
  val HEALTHY = "HEALTHY".asInstanceOf[ContainerCondition]

  @inline def values: js.Array[ContainerCondition] = js.Array(START, COMPLETE, SUCCESS, HEALTHY)
}

@js.native
sealed trait ContainerInstanceField extends js.Any
object ContainerInstanceField {
  val TAGS = "TAGS".asInstanceOf[ContainerInstanceField]
  val CONTAINER_INSTANCE_HEALTH = "CONTAINER_INSTANCE_HEALTH".asInstanceOf[ContainerInstanceField]

  @inline def values: js.Array[ContainerInstanceField] = js.Array(TAGS, CONTAINER_INSTANCE_HEALTH)
}

@js.native
sealed trait ContainerInstanceStatus extends js.Any
object ContainerInstanceStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[ContainerInstanceStatus]
  val DRAINING = "DRAINING".asInstanceOf[ContainerInstanceStatus]
  val REGISTERING = "REGISTERING".asInstanceOf[ContainerInstanceStatus]
  val DEREGISTERING = "DEREGISTERING".asInstanceOf[ContainerInstanceStatus]
  val REGISTRATION_FAILED = "REGISTRATION_FAILED".asInstanceOf[ContainerInstanceStatus]

  @inline def values: js.Array[ContainerInstanceStatus] = js.Array(ACTIVE, DRAINING, REGISTERING, DEREGISTERING, REGISTRATION_FAILED)
}

@js.native
sealed trait DeploymentControllerType extends js.Any
object DeploymentControllerType {
  val ECS = "ECS".asInstanceOf[DeploymentControllerType]
  val CODE_DEPLOY = "CODE_DEPLOY".asInstanceOf[DeploymentControllerType]
  val EXTERNAL = "EXTERNAL".asInstanceOf[DeploymentControllerType]

  @inline def values: js.Array[DeploymentControllerType] = js.Array(ECS, CODE_DEPLOY, EXTERNAL)
}

@js.native
sealed trait DeploymentRolloutState extends js.Any
object DeploymentRolloutState {
  val COMPLETED = "COMPLETED".asInstanceOf[DeploymentRolloutState]
  val FAILED = "FAILED".asInstanceOf[DeploymentRolloutState]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[DeploymentRolloutState]

  @inline def values: js.Array[DeploymentRolloutState] = js.Array(COMPLETED, FAILED, IN_PROGRESS)
}

@js.native
sealed trait DesiredStatus extends js.Any
object DesiredStatus {
  val RUNNING = "RUNNING".asInstanceOf[DesiredStatus]
  val PENDING = "PENDING".asInstanceOf[DesiredStatus]
  val STOPPED = "STOPPED".asInstanceOf[DesiredStatus]

  @inline def values: js.Array[DesiredStatus] = js.Array(RUNNING, PENDING, STOPPED)
}

@js.native
sealed trait DeviceCgroupPermission extends js.Any
object DeviceCgroupPermission {
  val read = "read".asInstanceOf[DeviceCgroupPermission]
  val write = "write".asInstanceOf[DeviceCgroupPermission]
  val mknod = "mknod".asInstanceOf[DeviceCgroupPermission]

  @inline def values: js.Array[DeviceCgroupPermission] = js.Array(read, write, mknod)
}

@js.native
sealed trait EFSAuthorizationConfigIAM extends js.Any
object EFSAuthorizationConfigIAM {
  val ENABLED = "ENABLED".asInstanceOf[EFSAuthorizationConfigIAM]
  val DISABLED = "DISABLED".asInstanceOf[EFSAuthorizationConfigIAM]

  @inline def values: js.Array[EFSAuthorizationConfigIAM] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait EFSTransitEncryption extends js.Any
object EFSTransitEncryption {
  val ENABLED = "ENABLED".asInstanceOf[EFSTransitEncryption]
  val DISABLED = "DISABLED".asInstanceOf[EFSTransitEncryption]

  @inline def values: js.Array[EFSTransitEncryption] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait EnvironmentFileType extends js.Any
object EnvironmentFileType {
  val s3 = "s3".asInstanceOf[EnvironmentFileType]

  @inline def values: js.Array[EnvironmentFileType] = js.Array(s3)
}

@js.native
sealed trait ExecuteCommandLogging extends js.Any
object ExecuteCommandLogging {
  val NONE = "NONE".asInstanceOf[ExecuteCommandLogging]
  val DEFAULT = "DEFAULT".asInstanceOf[ExecuteCommandLogging]
  val OVERRIDE = "OVERRIDE".asInstanceOf[ExecuteCommandLogging]

  @inline def values: js.Array[ExecuteCommandLogging] = js.Array(NONE, DEFAULT, OVERRIDE)
}

@js.native
sealed trait FirelensConfigurationType extends js.Any
object FirelensConfigurationType {
  val fluentd = "fluentd".asInstanceOf[FirelensConfigurationType]
  val fluentbit = "fluentbit".asInstanceOf[FirelensConfigurationType]

  @inline def values: js.Array[FirelensConfigurationType] = js.Array(fluentd, fluentbit)
}

@js.native
sealed trait HealthStatus extends js.Any
object HealthStatus {
  val HEALTHY = "HEALTHY".asInstanceOf[HealthStatus]
  val UNHEALTHY = "UNHEALTHY".asInstanceOf[HealthStatus]
  val UNKNOWN = "UNKNOWN".asInstanceOf[HealthStatus]

  @inline def values: js.Array[HealthStatus] = js.Array(HEALTHY, UNHEALTHY, UNKNOWN)
}

@js.native
sealed trait InstanceHealthCheckState extends js.Any
object InstanceHealthCheckState {
  val OK = "OK".asInstanceOf[InstanceHealthCheckState]
  val IMPAIRED = "IMPAIRED".asInstanceOf[InstanceHealthCheckState]
  val INSUFFICIENT_DATA = "INSUFFICIENT_DATA".asInstanceOf[InstanceHealthCheckState]
  val INITIALIZING = "INITIALIZING".asInstanceOf[InstanceHealthCheckState]

  @inline def values: js.Array[InstanceHealthCheckState] = js.Array(OK, IMPAIRED, INSUFFICIENT_DATA, INITIALIZING)
}

@js.native
sealed trait InstanceHealthCheckType extends js.Any
object InstanceHealthCheckType {
  val CONTAINER_RUNTIME = "CONTAINER_RUNTIME".asInstanceOf[InstanceHealthCheckType]

  @inline def values: js.Array[InstanceHealthCheckType] = js.Array(CONTAINER_RUNTIME)
}

@js.native
sealed trait IpcMode extends js.Any
object IpcMode {
  val host = "host".asInstanceOf[IpcMode]
  val task = "task".asInstanceOf[IpcMode]
  val none = "none".asInstanceOf[IpcMode]

  @inline def values: js.Array[IpcMode] = js.Array(host, task, none)
}

@js.native
sealed trait LaunchType extends js.Any
object LaunchType {
  val EC2 = "EC2".asInstanceOf[LaunchType]
  val FARGATE = "FARGATE".asInstanceOf[LaunchType]
  val EXTERNAL = "EXTERNAL".asInstanceOf[LaunchType]

  @inline def values: js.Array[LaunchType] = js.Array(EC2, FARGATE, EXTERNAL)
}

@js.native
sealed trait LogDriver extends js.Any
object LogDriver {
  val `json-file` = "json-file".asInstanceOf[LogDriver]
  val syslog = "syslog".asInstanceOf[LogDriver]
  val journald = "journald".asInstanceOf[LogDriver]
  val gelf = "gelf".asInstanceOf[LogDriver]
  val fluentd = "fluentd".asInstanceOf[LogDriver]
  val awslogs = "awslogs".asInstanceOf[LogDriver]
  val splunk = "splunk".asInstanceOf[LogDriver]
  val awsfirelens = "awsfirelens".asInstanceOf[LogDriver]

  @inline def values: js.Array[LogDriver] = js.Array(`json-file`, syslog, journald, gelf, fluentd, awslogs, splunk, awsfirelens)
}

@js.native
sealed trait ManagedAgentName extends js.Any
object ManagedAgentName {
  val ExecuteCommandAgent = "ExecuteCommandAgent".asInstanceOf[ManagedAgentName]

  @inline def values: js.Array[ManagedAgentName] = js.Array(ExecuteCommandAgent)
}

@js.native
sealed trait ManagedScalingStatus extends js.Any
object ManagedScalingStatus {
  val ENABLED = "ENABLED".asInstanceOf[ManagedScalingStatus]
  val DISABLED = "DISABLED".asInstanceOf[ManagedScalingStatus]

  @inline def values: js.Array[ManagedScalingStatus] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait ManagedTerminationProtection extends js.Any
object ManagedTerminationProtection {
  val ENABLED = "ENABLED".asInstanceOf[ManagedTerminationProtection]
  val DISABLED = "DISABLED".asInstanceOf[ManagedTerminationProtection]

  @inline def values: js.Array[ManagedTerminationProtection] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait NetworkMode extends js.Any
object NetworkMode {
  val bridge = "bridge".asInstanceOf[NetworkMode]
  val host = "host".asInstanceOf[NetworkMode]
  val awsvpc = "awsvpc".asInstanceOf[NetworkMode]
  val none = "none".asInstanceOf[NetworkMode]

  @inline def values: js.Array[NetworkMode] = js.Array(bridge, host, awsvpc, none)
}

@js.native
sealed trait OSFamily extends js.Any
object OSFamily {
  val WINDOWS_SERVER_2019_FULL = "WINDOWS_SERVER_2019_FULL".asInstanceOf[OSFamily]
  val WINDOWS_SERVER_2019_CORE = "WINDOWS_SERVER_2019_CORE".asInstanceOf[OSFamily]
  val WINDOWS_SERVER_2016_FULL = "WINDOWS_SERVER_2016_FULL".asInstanceOf[OSFamily]
  val WINDOWS_SERVER_2004_CORE = "WINDOWS_SERVER_2004_CORE".asInstanceOf[OSFamily]
  val WINDOWS_SERVER_2022_CORE = "WINDOWS_SERVER_2022_CORE".asInstanceOf[OSFamily]
  val WINDOWS_SERVER_2022_FULL = "WINDOWS_SERVER_2022_FULL".asInstanceOf[OSFamily]
  val WINDOWS_SERVER_20H2_CORE = "WINDOWS_SERVER_20H2_CORE".asInstanceOf[OSFamily]
  val LINUX = "LINUX".asInstanceOf[OSFamily]

  @inline def values: js.Array[OSFamily] = js.Array(
    WINDOWS_SERVER_2019_FULL,
    WINDOWS_SERVER_2019_CORE,
    WINDOWS_SERVER_2016_FULL,
    WINDOWS_SERVER_2004_CORE,
    WINDOWS_SERVER_2022_CORE,
    WINDOWS_SERVER_2022_FULL,
    WINDOWS_SERVER_20H2_CORE,
    LINUX
  )
}

@js.native
sealed trait PidMode extends js.Any
object PidMode {
  val host = "host".asInstanceOf[PidMode]
  val task = "task".asInstanceOf[PidMode]

  @inline def values: js.Array[PidMode] = js.Array(host, task)
}

@js.native
sealed trait PlacementConstraintType extends js.Any
object PlacementConstraintType {
  val distinctInstance = "distinctInstance".asInstanceOf[PlacementConstraintType]
  val memberOf = "memberOf".asInstanceOf[PlacementConstraintType]

  @inline def values: js.Array[PlacementConstraintType] = js.Array(distinctInstance, memberOf)
}

@js.native
sealed trait PlacementStrategyType extends js.Any
object PlacementStrategyType {
  val random = "random".asInstanceOf[PlacementStrategyType]
  val spread = "spread".asInstanceOf[PlacementStrategyType]
  val binpack = "binpack".asInstanceOf[PlacementStrategyType]

  @inline def values: js.Array[PlacementStrategyType] = js.Array(random, spread, binpack)
}

@js.native
sealed trait PlatformDeviceType extends js.Any
object PlatformDeviceType {
  val GPU = "GPU".asInstanceOf[PlatformDeviceType]

  @inline def values: js.Array[PlatformDeviceType] = js.Array(GPU)
}

@js.native
sealed trait PropagateTags extends js.Any
object PropagateTags {
  val TASK_DEFINITION = "TASK_DEFINITION".asInstanceOf[PropagateTags]
  val SERVICE = "SERVICE".asInstanceOf[PropagateTags]
  val NONE = "NONE".asInstanceOf[PropagateTags]

  @inline def values: js.Array[PropagateTags] = js.Array(TASK_DEFINITION, SERVICE, NONE)
}

@js.native
sealed trait ProxyConfigurationType extends js.Any
object ProxyConfigurationType {
  val APPMESH = "APPMESH".asInstanceOf[ProxyConfigurationType]

  @inline def values: js.Array[ProxyConfigurationType] = js.Array(APPMESH)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val GPU = "GPU".asInstanceOf[ResourceType]
  val InferenceAccelerator = "InferenceAccelerator".asInstanceOf[ResourceType]

  @inline def values: js.Array[ResourceType] = js.Array(GPU, InferenceAccelerator)
}

@js.native
sealed trait ScaleUnit extends js.Any
object ScaleUnit {
  val PERCENT = "PERCENT".asInstanceOf[ScaleUnit]

  @inline def values: js.Array[ScaleUnit] = js.Array(PERCENT)
}

@js.native
sealed trait SchedulingStrategy extends js.Any
object SchedulingStrategy {
  val REPLICA = "REPLICA".asInstanceOf[SchedulingStrategy]
  val DAEMON = "DAEMON".asInstanceOf[SchedulingStrategy]

  @inline def values: js.Array[SchedulingStrategy] = js.Array(REPLICA, DAEMON)
}

@js.native
sealed trait Scope extends js.Any
object Scope {
  val task = "task".asInstanceOf[Scope]
  val shared = "shared".asInstanceOf[Scope]

  @inline def values: js.Array[Scope] = js.Array(task, shared)
}

@js.native
sealed trait ServiceField extends js.Any
object ServiceField {
  val TAGS = "TAGS".asInstanceOf[ServiceField]

  @inline def values: js.Array[ServiceField] = js.Array(TAGS)
}

@js.native
sealed trait SettingName extends js.Any
object SettingName {
  val serviceLongArnFormat = "serviceLongArnFormat".asInstanceOf[SettingName]
  val taskLongArnFormat = "taskLongArnFormat".asInstanceOf[SettingName]
  val containerInstanceLongArnFormat = "containerInstanceLongArnFormat".asInstanceOf[SettingName]
  val awsvpcTrunking = "awsvpcTrunking".asInstanceOf[SettingName]
  val containerInsights = "containerInsights".asInstanceOf[SettingName]

  @inline def values: js.Array[SettingName] = js.Array(serviceLongArnFormat, taskLongArnFormat, containerInstanceLongArnFormat, awsvpcTrunking, containerInsights)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val ASC = "ASC".asInstanceOf[SortOrder]
  val DESC = "DESC".asInstanceOf[SortOrder]

  @inline def values: js.Array[SortOrder] = js.Array(ASC, DESC)
}

@js.native
sealed trait StabilityStatus extends js.Any
object StabilityStatus {
  val STEADY_STATE = "STEADY_STATE".asInstanceOf[StabilityStatus]
  val STABILIZING = "STABILIZING".asInstanceOf[StabilityStatus]

  @inline def values: js.Array[StabilityStatus] = js.Array(STEADY_STATE, STABILIZING)
}

@js.native
sealed trait TargetType extends js.Any
object TargetType {
  val `container-instance` = "container-instance".asInstanceOf[TargetType]

  @inline def values: js.Array[TargetType] = js.Array(`container-instance`)
}

@js.native
sealed trait TaskDefinitionFamilyStatus extends js.Any
object TaskDefinitionFamilyStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[TaskDefinitionFamilyStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[TaskDefinitionFamilyStatus]
  val ALL = "ALL".asInstanceOf[TaskDefinitionFamilyStatus]

  @inline def values: js.Array[TaskDefinitionFamilyStatus] = js.Array(ACTIVE, INACTIVE, ALL)
}

@js.native
sealed trait TaskDefinitionField extends js.Any
object TaskDefinitionField {
  val TAGS = "TAGS".asInstanceOf[TaskDefinitionField]

  @inline def values: js.Array[TaskDefinitionField] = js.Array(TAGS)
}

@js.native
sealed trait TaskDefinitionPlacementConstraintType extends js.Any
object TaskDefinitionPlacementConstraintType {
  val memberOf = "memberOf".asInstanceOf[TaskDefinitionPlacementConstraintType]

  @inline def values: js.Array[TaskDefinitionPlacementConstraintType] = js.Array(memberOf)
}

@js.native
sealed trait TaskDefinitionStatus extends js.Any
object TaskDefinitionStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[TaskDefinitionStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[TaskDefinitionStatus]

  @inline def values: js.Array[TaskDefinitionStatus] = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait TaskField extends js.Any
object TaskField {
  val TAGS = "TAGS".asInstanceOf[TaskField]

  @inline def values: js.Array[TaskField] = js.Array(TAGS)
}

@js.native
sealed trait TaskSetField extends js.Any
object TaskSetField {
  val TAGS = "TAGS".asInstanceOf[TaskSetField]

  @inline def values: js.Array[TaskSetField] = js.Array(TAGS)
}

@js.native
sealed trait TaskStopCode extends js.Any
object TaskStopCode {
  val TaskFailedToStart = "TaskFailedToStart".asInstanceOf[TaskStopCode]
  val EssentialContainerExited = "EssentialContainerExited".asInstanceOf[TaskStopCode]
  val UserInitiated = "UserInitiated".asInstanceOf[TaskStopCode]
  val ServiceSchedulerInitiated = "ServiceSchedulerInitiated".asInstanceOf[TaskStopCode]
  val SpotInterruption = "SpotInterruption".asInstanceOf[TaskStopCode]
  val TerminationNotice = "TerminationNotice".asInstanceOf[TaskStopCode]

  @inline def values: js.Array[TaskStopCode] = js.Array(TaskFailedToStart, EssentialContainerExited, UserInitiated, ServiceSchedulerInitiated, SpotInterruption, TerminationNotice)
}

@js.native
sealed trait TransportProtocol extends js.Any
object TransportProtocol {
  val tcp = "tcp".asInstanceOf[TransportProtocol]
  val udp = "udp".asInstanceOf[TransportProtocol]

  @inline def values: js.Array[TransportProtocol] = js.Array(tcp, udp)
}

@js.native
sealed trait UlimitName extends js.Any
object UlimitName {
  val core = "core".asInstanceOf[UlimitName]
  val cpu = "cpu".asInstanceOf[UlimitName]
  val data = "data".asInstanceOf[UlimitName]
  val fsize = "fsize".asInstanceOf[UlimitName]
  val locks = "locks".asInstanceOf[UlimitName]
  val memlock = "memlock".asInstanceOf[UlimitName]
  val msgqueue = "msgqueue".asInstanceOf[UlimitName]
  val nice = "nice".asInstanceOf[UlimitName]
  val nofile = "nofile".asInstanceOf[UlimitName]
  val nproc = "nproc".asInstanceOf[UlimitName]
  val rss = "rss".asInstanceOf[UlimitName]
  val rtprio = "rtprio".asInstanceOf[UlimitName]
  val rttime = "rttime".asInstanceOf[UlimitName]
  val sigpending = "sigpending".asInstanceOf[UlimitName]
  val stack = "stack".asInstanceOf[UlimitName]

  @inline def values: js.Array[UlimitName] = js.Array(core, cpu, data, fsize, locks, memlock, msgqueue, nice, nofile, nproc, rss, rtprio, rttime, sigpending, stack)
}
