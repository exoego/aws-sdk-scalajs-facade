package facade.amazonaws.services.mgn

import scalajs.js

@js.native
sealed trait ApplicationHealthStatus extends js.Any
object ApplicationHealthStatus {
  val HEALTHY = "HEALTHY".asInstanceOf[ApplicationHealthStatus]
  val LAGGING = "LAGGING".asInstanceOf[ApplicationHealthStatus]
  val ERROR = "ERROR".asInstanceOf[ApplicationHealthStatus]

  @inline def values: js.Array[ApplicationHealthStatus] = js.Array(HEALTHY, LAGGING, ERROR)
}

@js.native
sealed trait ApplicationProgressStatus extends js.Any
object ApplicationProgressStatus {
  val NOT_STARTED = "NOT_STARTED".asInstanceOf[ApplicationProgressStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ApplicationProgressStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[ApplicationProgressStatus]

  @inline def values: js.Array[ApplicationProgressStatus] = js.Array(NOT_STARTED, IN_PROGRESS, COMPLETED)
}

@js.native
sealed trait BootMode extends js.Any
object BootMode {
  val LEGACY_BIOS = "LEGACY_BIOS".asInstanceOf[BootMode]
  val UEFI = "UEFI".asInstanceOf[BootMode]

  @inline def values: js.Array[BootMode] = js.Array(LEGACY_BIOS, UEFI)
}

@js.native
sealed trait ChangeServerLifeCycleStateSourceServerLifecycleState extends js.Any
object ChangeServerLifeCycleStateSourceServerLifecycleState {
  val READY_FOR_TEST = "READY_FOR_TEST".asInstanceOf[ChangeServerLifeCycleStateSourceServerLifecycleState]
  val READY_FOR_CUTOVER = "READY_FOR_CUTOVER".asInstanceOf[ChangeServerLifeCycleStateSourceServerLifecycleState]
  val CUTOVER = "CUTOVER".asInstanceOf[ChangeServerLifeCycleStateSourceServerLifecycleState]

  @inline def values: js.Array[ChangeServerLifeCycleStateSourceServerLifecycleState] = js.Array(READY_FOR_TEST, READY_FOR_CUTOVER, CUTOVER)
}

@js.native
sealed trait DataReplicationErrorString extends js.Any
object DataReplicationErrorString {
  val AGENT_NOT_SEEN = "AGENT_NOT_SEEN".asInstanceOf[DataReplicationErrorString]
  val SNAPSHOTS_FAILURE = "SNAPSHOTS_FAILURE".asInstanceOf[DataReplicationErrorString]
  val NOT_CONVERGING = "NOT_CONVERGING".asInstanceOf[DataReplicationErrorString]
  val UNSTABLE_NETWORK = "UNSTABLE_NETWORK".asInstanceOf[DataReplicationErrorString]
  val FAILED_TO_CREATE_SECURITY_GROUP = "FAILED_TO_CREATE_SECURITY_GROUP".asInstanceOf[DataReplicationErrorString]
  val FAILED_TO_LAUNCH_REPLICATION_SERVER = "FAILED_TO_LAUNCH_REPLICATION_SERVER".asInstanceOf[DataReplicationErrorString]
  val FAILED_TO_BOOT_REPLICATION_SERVER = "FAILED_TO_BOOT_REPLICATION_SERVER".asInstanceOf[DataReplicationErrorString]
  val FAILED_TO_AUTHENTICATE_WITH_SERVICE = "FAILED_TO_AUTHENTICATE_WITH_SERVICE".asInstanceOf[DataReplicationErrorString]
  val FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE = "FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE".asInstanceOf[DataReplicationErrorString]
  val FAILED_TO_CREATE_STAGING_DISKS = "FAILED_TO_CREATE_STAGING_DISKS".asInstanceOf[DataReplicationErrorString]
  val FAILED_TO_ATTACH_STAGING_DISKS = "FAILED_TO_ATTACH_STAGING_DISKS".asInstanceOf[DataReplicationErrorString]
  val FAILED_TO_PAIR_REPLICATION_SERVER_WITH_AGENT = "FAILED_TO_PAIR_REPLICATION_SERVER_WITH_AGENT".asInstanceOf[DataReplicationErrorString]
  val FAILED_TO_CONNECT_AGENT_TO_REPLICATION_SERVER = "FAILED_TO_CONNECT_AGENT_TO_REPLICATION_SERVER".asInstanceOf[DataReplicationErrorString]
  val FAILED_TO_START_DATA_TRANSFER = "FAILED_TO_START_DATA_TRANSFER".asInstanceOf[DataReplicationErrorString]
  val UNSUPPORTED_VM_CONFIGURATION = "UNSUPPORTED_VM_CONFIGURATION".asInstanceOf[DataReplicationErrorString]
  val LAST_SNAPSHOT_JOB_FAILED = "LAST_SNAPSHOT_JOB_FAILED".asInstanceOf[DataReplicationErrorString]

  @inline def values: js.Array[DataReplicationErrorString] = js.Array(
    AGENT_NOT_SEEN,
    SNAPSHOTS_FAILURE,
    NOT_CONVERGING,
    UNSTABLE_NETWORK,
    FAILED_TO_CREATE_SECURITY_GROUP,
    FAILED_TO_LAUNCH_REPLICATION_SERVER,
    FAILED_TO_BOOT_REPLICATION_SERVER,
    FAILED_TO_AUTHENTICATE_WITH_SERVICE,
    FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE,
    FAILED_TO_CREATE_STAGING_DISKS,
    FAILED_TO_ATTACH_STAGING_DISKS,
    FAILED_TO_PAIR_REPLICATION_SERVER_WITH_AGENT,
    FAILED_TO_CONNECT_AGENT_TO_REPLICATION_SERVER,
    FAILED_TO_START_DATA_TRANSFER,
    UNSUPPORTED_VM_CONFIGURATION,
    LAST_SNAPSHOT_JOB_FAILED
  )
}

@js.native
sealed trait DataReplicationInitiationStepName extends js.Any
object DataReplicationInitiationStepName {
  val WAIT = "WAIT".asInstanceOf[DataReplicationInitiationStepName]
  val CREATE_SECURITY_GROUP = "CREATE_SECURITY_GROUP".asInstanceOf[DataReplicationInitiationStepName]
  val LAUNCH_REPLICATION_SERVER = "LAUNCH_REPLICATION_SERVER".asInstanceOf[DataReplicationInitiationStepName]
  val BOOT_REPLICATION_SERVER = "BOOT_REPLICATION_SERVER".asInstanceOf[DataReplicationInitiationStepName]
  val AUTHENTICATE_WITH_SERVICE = "AUTHENTICATE_WITH_SERVICE".asInstanceOf[DataReplicationInitiationStepName]
  val DOWNLOAD_REPLICATION_SOFTWARE = "DOWNLOAD_REPLICATION_SOFTWARE".asInstanceOf[DataReplicationInitiationStepName]
  val CREATE_STAGING_DISKS = "CREATE_STAGING_DISKS".asInstanceOf[DataReplicationInitiationStepName]
  val ATTACH_STAGING_DISKS = "ATTACH_STAGING_DISKS".asInstanceOf[DataReplicationInitiationStepName]
  val PAIR_REPLICATION_SERVER_WITH_AGENT = "PAIR_REPLICATION_SERVER_WITH_AGENT".asInstanceOf[DataReplicationInitiationStepName]
  val CONNECT_AGENT_TO_REPLICATION_SERVER = "CONNECT_AGENT_TO_REPLICATION_SERVER".asInstanceOf[DataReplicationInitiationStepName]
  val START_DATA_TRANSFER = "START_DATA_TRANSFER".asInstanceOf[DataReplicationInitiationStepName]

  @inline def values: js.Array[DataReplicationInitiationStepName] = js.Array(
    WAIT,
    CREATE_SECURITY_GROUP,
    LAUNCH_REPLICATION_SERVER,
    BOOT_REPLICATION_SERVER,
    AUTHENTICATE_WITH_SERVICE,
    DOWNLOAD_REPLICATION_SOFTWARE,
    CREATE_STAGING_DISKS,
    ATTACH_STAGING_DISKS,
    PAIR_REPLICATION_SERVER_WITH_AGENT,
    CONNECT_AGENT_TO_REPLICATION_SERVER,
    START_DATA_TRANSFER
  )
}

@js.native
sealed trait DataReplicationInitiationStepStatus extends js.Any
object DataReplicationInitiationStepStatus {
  val NOT_STARTED = "NOT_STARTED".asInstanceOf[DataReplicationInitiationStepStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[DataReplicationInitiationStepStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[DataReplicationInitiationStepStatus]
  val FAILED = "FAILED".asInstanceOf[DataReplicationInitiationStepStatus]
  val SKIPPED = "SKIPPED".asInstanceOf[DataReplicationInitiationStepStatus]

  @inline def values: js.Array[DataReplicationInitiationStepStatus] = js.Array(NOT_STARTED, IN_PROGRESS, SUCCEEDED, FAILED, SKIPPED)
}

@js.native
sealed trait DataReplicationState extends js.Any
object DataReplicationState {
  val STOPPED = "STOPPED".asInstanceOf[DataReplicationState]
  val INITIATING = "INITIATING".asInstanceOf[DataReplicationState]
  val INITIAL_SYNC = "INITIAL_SYNC".asInstanceOf[DataReplicationState]
  val BACKLOG = "BACKLOG".asInstanceOf[DataReplicationState]
  val CREATING_SNAPSHOT = "CREATING_SNAPSHOT".asInstanceOf[DataReplicationState]
  val CONTINUOUS = "CONTINUOUS".asInstanceOf[DataReplicationState]
  val PAUSED = "PAUSED".asInstanceOf[DataReplicationState]
  val RESCAN = "RESCAN".asInstanceOf[DataReplicationState]
  val STALLED = "STALLED".asInstanceOf[DataReplicationState]
  val DISCONNECTED = "DISCONNECTED".asInstanceOf[DataReplicationState]
  val PENDING_SNAPSHOT_SHIPPING = "PENDING_SNAPSHOT_SHIPPING".asInstanceOf[DataReplicationState]
  val SHIPPING_SNAPSHOT = "SHIPPING_SNAPSHOT".asInstanceOf[DataReplicationState]

  @inline def values: js.Array[DataReplicationState] = js.Array(STOPPED, INITIATING, INITIAL_SYNC, BACKLOG, CREATING_SNAPSHOT, CONTINUOUS, PAUSED, RESCAN, STALLED, DISCONNECTED, PENDING_SNAPSHOT_SHIPPING, SHIPPING_SNAPSHOT)
}

@js.native
sealed trait FirstBoot extends js.Any
object FirstBoot {
  val WAITING = "WAITING".asInstanceOf[FirstBoot]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[FirstBoot]
  val UNKNOWN = "UNKNOWN".asInstanceOf[FirstBoot]
  val STOPPED = "STOPPED".asInstanceOf[FirstBoot]

  @inline def values: js.Array[FirstBoot] = js.Array(WAITING, SUCCEEDED, UNKNOWN, STOPPED)
}

@js.native
sealed trait InitiatedBy extends js.Any
object InitiatedBy {
  val START_TEST = "START_TEST".asInstanceOf[InitiatedBy]
  val START_CUTOVER = "START_CUTOVER".asInstanceOf[InitiatedBy]
  val DIAGNOSTIC = "DIAGNOSTIC".asInstanceOf[InitiatedBy]
  val TERMINATE = "TERMINATE".asInstanceOf[InitiatedBy]

  @inline def values: js.Array[InitiatedBy] = js.Array(START_TEST, START_CUTOVER, DIAGNOSTIC, TERMINATE)
}

@js.native
sealed trait JobLogEvent extends js.Any
object JobLogEvent {
  val JOB_START = "JOB_START".asInstanceOf[JobLogEvent]
  val SERVER_SKIPPED = "SERVER_SKIPPED".asInstanceOf[JobLogEvent]
  val CLEANUP_START = "CLEANUP_START".asInstanceOf[JobLogEvent]
  val CLEANUP_END = "CLEANUP_END".asInstanceOf[JobLogEvent]
  val CLEANUP_FAIL = "CLEANUP_FAIL".asInstanceOf[JobLogEvent]
  val SNAPSHOT_START = "SNAPSHOT_START".asInstanceOf[JobLogEvent]
  val SNAPSHOT_END = "SNAPSHOT_END".asInstanceOf[JobLogEvent]
  val SNAPSHOT_FAIL = "SNAPSHOT_FAIL".asInstanceOf[JobLogEvent]
  val USING_PREVIOUS_SNAPSHOT = "USING_PREVIOUS_SNAPSHOT".asInstanceOf[JobLogEvent]
  val CONVERSION_START = "CONVERSION_START".asInstanceOf[JobLogEvent]
  val CONVERSION_END = "CONVERSION_END".asInstanceOf[JobLogEvent]
  val CONVERSION_FAIL = "CONVERSION_FAIL".asInstanceOf[JobLogEvent]
  val LAUNCH_START = "LAUNCH_START".asInstanceOf[JobLogEvent]
  val LAUNCH_FAILED = "LAUNCH_FAILED".asInstanceOf[JobLogEvent]
  val JOB_CANCEL = "JOB_CANCEL".asInstanceOf[JobLogEvent]
  val JOB_END = "JOB_END".asInstanceOf[JobLogEvent]

  @inline def values: js.Array[JobLogEvent] = js.Array(
    JOB_START,
    SERVER_SKIPPED,
    CLEANUP_START,
    CLEANUP_END,
    CLEANUP_FAIL,
    SNAPSHOT_START,
    SNAPSHOT_END,
    SNAPSHOT_FAIL,
    USING_PREVIOUS_SNAPSHOT,
    CONVERSION_START,
    CONVERSION_END,
    CONVERSION_FAIL,
    LAUNCH_START,
    LAUNCH_FAILED,
    JOB_CANCEL,
    JOB_END
  )
}

@js.native
sealed trait JobStatus extends js.Any
object JobStatus {
  val PENDING = "PENDING".asInstanceOf[JobStatus]
  val STARTED = "STARTED".asInstanceOf[JobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[JobStatus]

  @inline def values: js.Array[JobStatus] = js.Array(PENDING, STARTED, COMPLETED)
}

@js.native
sealed trait JobType extends js.Any
object JobType {
  val LAUNCH = "LAUNCH".asInstanceOf[JobType]
  val TERMINATE = "TERMINATE".asInstanceOf[JobType]

  @inline def values: js.Array[JobType] = js.Array(LAUNCH, TERMINATE)
}

@js.native
sealed trait LaunchDisposition extends js.Any
object LaunchDisposition {
  val STOPPED = "STOPPED".asInstanceOf[LaunchDisposition]
  val STARTED = "STARTED".asInstanceOf[LaunchDisposition]

  @inline def values: js.Array[LaunchDisposition] = js.Array(STOPPED, STARTED)
}

@js.native
sealed trait LaunchStatus extends js.Any
object LaunchStatus {
  val PENDING = "PENDING".asInstanceOf[LaunchStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[LaunchStatus]
  val LAUNCHED = "LAUNCHED".asInstanceOf[LaunchStatus]
  val FAILED = "FAILED".asInstanceOf[LaunchStatus]
  val TERMINATED = "TERMINATED".asInstanceOf[LaunchStatus]

  @inline def values: js.Array[LaunchStatus] = js.Array(PENDING, IN_PROGRESS, LAUNCHED, FAILED, TERMINATED)
}

@js.native
sealed trait LifeCycleState extends js.Any
object LifeCycleState {
  val STOPPED = "STOPPED".asInstanceOf[LifeCycleState]
  val NOT_READY = "NOT_READY".asInstanceOf[LifeCycleState]
  val READY_FOR_TEST = "READY_FOR_TEST".asInstanceOf[LifeCycleState]
  val TESTING = "TESTING".asInstanceOf[LifeCycleState]
  val READY_FOR_CUTOVER = "READY_FOR_CUTOVER".asInstanceOf[LifeCycleState]
  val CUTTING_OVER = "CUTTING_OVER".asInstanceOf[LifeCycleState]
  val CUTOVER = "CUTOVER".asInstanceOf[LifeCycleState]
  val DISCONNECTED = "DISCONNECTED".asInstanceOf[LifeCycleState]
  val DISCOVERED = "DISCOVERED".asInstanceOf[LifeCycleState]

  @inline def values: js.Array[LifeCycleState] = js.Array(STOPPED, NOT_READY, READY_FOR_TEST, TESTING, READY_FOR_CUTOVER, CUTTING_OVER, CUTOVER, DISCONNECTED, DISCOVERED)
}

@js.native
sealed trait PostLaunchActionExecutionStatus extends js.Any
object PostLaunchActionExecutionStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[PostLaunchActionExecutionStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[PostLaunchActionExecutionStatus]
  val FAILED = "FAILED".asInstanceOf[PostLaunchActionExecutionStatus]

  @inline def values: js.Array[PostLaunchActionExecutionStatus] = js.Array(IN_PROGRESS, SUCCESS, FAILED)
}

@js.native
sealed trait PostLaunchActionsDeploymentType extends js.Any
object PostLaunchActionsDeploymentType {
  val TEST_AND_CUTOVER = "TEST_AND_CUTOVER".asInstanceOf[PostLaunchActionsDeploymentType]
  val CUTOVER_ONLY = "CUTOVER_ONLY".asInstanceOf[PostLaunchActionsDeploymentType]
  val TEST_ONLY = "TEST_ONLY".asInstanceOf[PostLaunchActionsDeploymentType]

  @inline def values: js.Array[PostLaunchActionsDeploymentType] = js.Array(TEST_AND_CUTOVER, CUTOVER_ONLY, TEST_ONLY)
}

@js.native
sealed trait ReplicationConfigurationDataPlaneRouting extends js.Any
object ReplicationConfigurationDataPlaneRouting {
  val PRIVATE_IP = "PRIVATE_IP".asInstanceOf[ReplicationConfigurationDataPlaneRouting]
  val PUBLIC_IP = "PUBLIC_IP".asInstanceOf[ReplicationConfigurationDataPlaneRouting]

  @inline def values: js.Array[ReplicationConfigurationDataPlaneRouting] = js.Array(PRIVATE_IP, PUBLIC_IP)
}

@js.native
sealed trait ReplicationConfigurationDefaultLargeStagingDiskType extends js.Any
object ReplicationConfigurationDefaultLargeStagingDiskType {
  val GP2 = "GP2".asInstanceOf[ReplicationConfigurationDefaultLargeStagingDiskType]
  val ST1 = "ST1".asInstanceOf[ReplicationConfigurationDefaultLargeStagingDiskType]
  val GP3 = "GP3".asInstanceOf[ReplicationConfigurationDefaultLargeStagingDiskType]

  @inline def values: js.Array[ReplicationConfigurationDefaultLargeStagingDiskType] = js.Array(GP2, ST1, GP3)
}

@js.native
sealed trait ReplicationConfigurationEbsEncryption extends js.Any
object ReplicationConfigurationEbsEncryption {
  val DEFAULT = "DEFAULT".asInstanceOf[ReplicationConfigurationEbsEncryption]
  val CUSTOM = "CUSTOM".asInstanceOf[ReplicationConfigurationEbsEncryption]

  @inline def values: js.Array[ReplicationConfigurationEbsEncryption] = js.Array(DEFAULT, CUSTOM)
}

@js.native
sealed trait ReplicationConfigurationReplicatedDiskStagingDiskType extends js.Any
object ReplicationConfigurationReplicatedDiskStagingDiskType {
  val AUTO = "AUTO".asInstanceOf[ReplicationConfigurationReplicatedDiskStagingDiskType]
  val GP2 = "GP2".asInstanceOf[ReplicationConfigurationReplicatedDiskStagingDiskType]
  val IO1 = "IO1".asInstanceOf[ReplicationConfigurationReplicatedDiskStagingDiskType]
  val SC1 = "SC1".asInstanceOf[ReplicationConfigurationReplicatedDiskStagingDiskType]
  val ST1 = "ST1".asInstanceOf[ReplicationConfigurationReplicatedDiskStagingDiskType]
  val STANDARD = "STANDARD".asInstanceOf[ReplicationConfigurationReplicatedDiskStagingDiskType]
  val GP3 = "GP3".asInstanceOf[ReplicationConfigurationReplicatedDiskStagingDiskType]
  val IO2 = "IO2".asInstanceOf[ReplicationConfigurationReplicatedDiskStagingDiskType]

  @inline def values: js.Array[ReplicationConfigurationReplicatedDiskStagingDiskType] = js.Array(AUTO, GP2, IO1, SC1, ST1, STANDARD, GP3, IO2)
}

@js.native
sealed trait ReplicationType extends js.Any
object ReplicationType {
  val AGENT_BASED = "AGENT_BASED".asInstanceOf[ReplicationType]
  val SNAPSHOT_SHIPPING = "SNAPSHOT_SHIPPING".asInstanceOf[ReplicationType]

  @inline def values: js.Array[ReplicationType] = js.Array(AGENT_BASED, SNAPSHOT_SHIPPING)
}

@js.native
sealed trait SsmDocumentType extends js.Any
object SsmDocumentType {
  val AUTOMATION = "AUTOMATION".asInstanceOf[SsmDocumentType]
  val COMMAND = "COMMAND".asInstanceOf[SsmDocumentType]

  @inline def values: js.Array[SsmDocumentType] = js.Array(AUTOMATION, COMMAND)
}

@js.native
sealed trait SsmParameterStoreParameterType extends js.Any
object SsmParameterStoreParameterType {
  val STRING = "STRING".asInstanceOf[SsmParameterStoreParameterType]

  @inline def values: js.Array[SsmParameterStoreParameterType] = js.Array(STRING)
}

@js.native
sealed trait TargetInstanceTypeRightSizingMethod extends js.Any
object TargetInstanceTypeRightSizingMethod {
  val NONE = "NONE".asInstanceOf[TargetInstanceTypeRightSizingMethod]
  val BASIC = "BASIC".asInstanceOf[TargetInstanceTypeRightSizingMethod]

  @inline def values: js.Array[TargetInstanceTypeRightSizingMethod] = js.Array(NONE, BASIC)
}

@js.native
sealed trait VolumeType extends js.Any
object VolumeType {
  val io1 = "io1".asInstanceOf[VolumeType]
  val io2 = "io2".asInstanceOf[VolumeType]
  val gp3 = "gp3".asInstanceOf[VolumeType]
  val gp2 = "gp2".asInstanceOf[VolumeType]
  val st1 = "st1".asInstanceOf[VolumeType]
  val sc1 = "sc1".asInstanceOf[VolumeType]
  val standard = "standard".asInstanceOf[VolumeType]

  @inline def values: js.Array[VolumeType] = js.Array(io1, io2, gp3, gp2, st1, sc1, standard)
}

@js.native
sealed trait WaveHealthStatus extends js.Any
object WaveHealthStatus {
  val HEALTHY = "HEALTHY".asInstanceOf[WaveHealthStatus]
  val LAGGING = "LAGGING".asInstanceOf[WaveHealthStatus]
  val ERROR = "ERROR".asInstanceOf[WaveHealthStatus]

  @inline def values: js.Array[WaveHealthStatus] = js.Array(HEALTHY, LAGGING, ERROR)
}

@js.native
sealed trait WaveProgressStatus extends js.Any
object WaveProgressStatus {
  val NOT_STARTED = "NOT_STARTED".asInstanceOf[WaveProgressStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[WaveProgressStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[WaveProgressStatus]

  @inline def values: js.Array[WaveProgressStatus] = js.Array(NOT_STARTED, IN_PROGRESS, COMPLETED)
}
