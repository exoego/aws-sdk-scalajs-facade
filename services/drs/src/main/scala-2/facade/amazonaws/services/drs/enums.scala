package facade.amazonaws.services.drs

import scalajs.js

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
    FAILED_TO_START_DATA_TRANSFER
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

  @inline def values: js.Array[DataReplicationState] = js.Array(STOPPED, INITIATING, INITIAL_SYNC, BACKLOG, CREATING_SNAPSHOT, CONTINUOUS, PAUSED, RESCAN, STALLED, DISCONNECTED)
}

@js.native
sealed trait EC2InstanceState extends js.Any
object EC2InstanceState {
  val PENDING = "PENDING".asInstanceOf[EC2InstanceState]
  val RUNNING = "RUNNING".asInstanceOf[EC2InstanceState]
  val STOPPING = "STOPPING".asInstanceOf[EC2InstanceState]
  val STOPPED = "STOPPED".asInstanceOf[EC2InstanceState]
  val `SHUTTING-DOWN` = "SHUTTING-DOWN".asInstanceOf[EC2InstanceState]
  val TERMINATED = "TERMINATED".asInstanceOf[EC2InstanceState]
  val NOT_FOUND = "NOT_FOUND".asInstanceOf[EC2InstanceState]

  @inline def values: js.Array[EC2InstanceState] = js.Array(PENDING, RUNNING, STOPPING, STOPPED, `SHUTTING-DOWN`, TERMINATED, NOT_FOUND)
}

@js.native
sealed trait FailbackReplicationError extends js.Any
object FailbackReplicationError {
  val AGENT_NOT_SEEN = "AGENT_NOT_SEEN".asInstanceOf[FailbackReplicationError]
  val FAILBACK_CLIENT_NOT_SEEN = "FAILBACK_CLIENT_NOT_SEEN".asInstanceOf[FailbackReplicationError]
  val NOT_CONVERGING = "NOT_CONVERGING".asInstanceOf[FailbackReplicationError]
  val UNSTABLE_NETWORK = "UNSTABLE_NETWORK".asInstanceOf[FailbackReplicationError]
  val FAILED_TO_ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION = "FAILED_TO_ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION".asInstanceOf[FailbackReplicationError]
  val FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT = "FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT".asInstanceOf[FailbackReplicationError]
  val FAILED_TO_CONFIGURE_REPLICATION_SOFTWARE = "FAILED_TO_CONFIGURE_REPLICATION_SOFTWARE".asInstanceOf[FailbackReplicationError]
  val FAILED_TO_PAIR_AGENT_WITH_REPLICATION_SOFTWARE = "FAILED_TO_PAIR_AGENT_WITH_REPLICATION_SOFTWARE".asInstanceOf[FailbackReplicationError]
  val FAILED_TO_ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION = "FAILED_TO_ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION".asInstanceOf[FailbackReplicationError]

  @inline def values: js.Array[FailbackReplicationError] = js.Array(
    AGENT_NOT_SEEN,
    FAILBACK_CLIENT_NOT_SEEN,
    NOT_CONVERGING,
    UNSTABLE_NETWORK,
    FAILED_TO_ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION,
    FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT,
    FAILED_TO_CONFIGURE_REPLICATION_SOFTWARE,
    FAILED_TO_PAIR_AGENT_WITH_REPLICATION_SOFTWARE,
    FAILED_TO_ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION
  )
}

@js.native
sealed trait FailbackState extends js.Any
object FailbackState {
  val FAILBACK_NOT_STARTED = "FAILBACK_NOT_STARTED".asInstanceOf[FailbackState]
  val FAILBACK_IN_PROGRESS = "FAILBACK_IN_PROGRESS".asInstanceOf[FailbackState]
  val FAILBACK_READY_FOR_LAUNCH = "FAILBACK_READY_FOR_LAUNCH".asInstanceOf[FailbackState]
  val FAILBACK_COMPLETED = "FAILBACK_COMPLETED".asInstanceOf[FailbackState]
  val FAILBACK_ERROR = "FAILBACK_ERROR".asInstanceOf[FailbackState]

  @inline def values: js.Array[FailbackState] = js.Array(FAILBACK_NOT_STARTED, FAILBACK_IN_PROGRESS, FAILBACK_READY_FOR_LAUNCH, FAILBACK_COMPLETED, FAILBACK_ERROR)
}

@js.native
sealed trait InitiatedBy extends js.Any
object InitiatedBy {
  val START_RECOVERY = "START_RECOVERY".asInstanceOf[InitiatedBy]
  val START_DRILL = "START_DRILL".asInstanceOf[InitiatedBy]
  val FAILBACK = "FAILBACK".asInstanceOf[InitiatedBy]
  val DIAGNOSTIC = "DIAGNOSTIC".asInstanceOf[InitiatedBy]
  val TERMINATE_RECOVERY_INSTANCES = "TERMINATE_RECOVERY_INSTANCES".asInstanceOf[InitiatedBy]

  @inline def values: js.Array[InitiatedBy] = js.Array(START_RECOVERY, START_DRILL, FAILBACK, DIAGNOSTIC, TERMINATE_RECOVERY_INSTANCES)
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
  val USING_PREVIOUS_SNAPSHOT_FAILED = "USING_PREVIOUS_SNAPSHOT_FAILED".asInstanceOf[JobLogEvent]
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
    USING_PREVIOUS_SNAPSHOT_FAILED,
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
sealed trait LastLaunchResult extends js.Any
object LastLaunchResult {
  val NOT_STARTED = "NOT_STARTED".asInstanceOf[LastLaunchResult]
  val PENDING = "PENDING".asInstanceOf[LastLaunchResult]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[LastLaunchResult]
  val FAILED = "FAILED".asInstanceOf[LastLaunchResult]

  @inline def values: js.Array[LastLaunchResult] = js.Array(NOT_STARTED, PENDING, SUCCEEDED, FAILED)
}

@js.native
sealed trait LastLaunchType extends js.Any
object LastLaunchType {
  val RECOVERY = "RECOVERY".asInstanceOf[LastLaunchType]
  val DRILL = "DRILL".asInstanceOf[LastLaunchType]

  @inline def values: js.Array[LastLaunchType] = js.Array(RECOVERY, DRILL)
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
sealed trait PITPolicyRuleUnits extends js.Any
object PITPolicyRuleUnits {
  val MINUTE = "MINUTE".asInstanceOf[PITPolicyRuleUnits]
  val HOUR = "HOUR".asInstanceOf[PITPolicyRuleUnits]
  val DAY = "DAY".asInstanceOf[PITPolicyRuleUnits]

  @inline def values: js.Array[PITPolicyRuleUnits] = js.Array(MINUTE, HOUR, DAY)
}

@js.native
sealed trait RecoveryInstanceDataReplicationInitiationStepName extends js.Any
object RecoveryInstanceDataReplicationInitiationStepName {
  val LINK_FAILBACK_CLIENT_WITH_RECOVERY_INSTANCE = "LINK_FAILBACK_CLIENT_WITH_RECOVERY_INSTANCE".asInstanceOf[RecoveryInstanceDataReplicationInitiationStepName]
  val COMPLETE_VOLUME_MAPPING = "COMPLETE_VOLUME_MAPPING".asInstanceOf[RecoveryInstanceDataReplicationInitiationStepName]
  val ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION = "ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION".asInstanceOf[RecoveryInstanceDataReplicationInitiationStepName]
  val DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT = "DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT".asInstanceOf[RecoveryInstanceDataReplicationInitiationStepName]
  val CONFIGURE_REPLICATION_SOFTWARE = "CONFIGURE_REPLICATION_SOFTWARE".asInstanceOf[RecoveryInstanceDataReplicationInitiationStepName]
  val PAIR_AGENT_WITH_REPLICATION_SOFTWARE = "PAIR_AGENT_WITH_REPLICATION_SOFTWARE".asInstanceOf[RecoveryInstanceDataReplicationInitiationStepName]
  val ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION = "ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION".asInstanceOf[RecoveryInstanceDataReplicationInitiationStepName]

  @inline def values: js.Array[RecoveryInstanceDataReplicationInitiationStepName] = js.Array(
    LINK_FAILBACK_CLIENT_WITH_RECOVERY_INSTANCE,
    COMPLETE_VOLUME_MAPPING,
    ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION,
    DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT,
    CONFIGURE_REPLICATION_SOFTWARE,
    PAIR_AGENT_WITH_REPLICATION_SOFTWARE,
    ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION
  )
}

@js.native
sealed trait RecoveryInstanceDataReplicationInitiationStepStatus extends js.Any
object RecoveryInstanceDataReplicationInitiationStepStatus {
  val NOT_STARTED = "NOT_STARTED".asInstanceOf[RecoveryInstanceDataReplicationInitiationStepStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[RecoveryInstanceDataReplicationInitiationStepStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[RecoveryInstanceDataReplicationInitiationStepStatus]
  val FAILED = "FAILED".asInstanceOf[RecoveryInstanceDataReplicationInitiationStepStatus]
  val SKIPPED = "SKIPPED".asInstanceOf[RecoveryInstanceDataReplicationInitiationStepStatus]

  @inline def values: js.Array[RecoveryInstanceDataReplicationInitiationStepStatus] = js.Array(NOT_STARTED, IN_PROGRESS, SUCCEEDED, FAILED, SKIPPED)
}

@js.native
sealed trait RecoveryInstanceDataReplicationState extends js.Any
object RecoveryInstanceDataReplicationState {
  val STOPPED = "STOPPED".asInstanceOf[RecoveryInstanceDataReplicationState]
  val INITIATING = "INITIATING".asInstanceOf[RecoveryInstanceDataReplicationState]
  val INITIAL_SYNC = "INITIAL_SYNC".asInstanceOf[RecoveryInstanceDataReplicationState]
  val BACKLOG = "BACKLOG".asInstanceOf[RecoveryInstanceDataReplicationState]
  val CREATING_SNAPSHOT = "CREATING_SNAPSHOT".asInstanceOf[RecoveryInstanceDataReplicationState]
  val CONTINUOUS = "CONTINUOUS".asInstanceOf[RecoveryInstanceDataReplicationState]
  val PAUSED = "PAUSED".asInstanceOf[RecoveryInstanceDataReplicationState]
  val RESCAN = "RESCAN".asInstanceOf[RecoveryInstanceDataReplicationState]
  val STALLED = "STALLED".asInstanceOf[RecoveryInstanceDataReplicationState]
  val DISCONNECTED = "DISCONNECTED".asInstanceOf[RecoveryInstanceDataReplicationState]

  @inline def values: js.Array[RecoveryInstanceDataReplicationState] = js.Array(STOPPED, INITIATING, INITIAL_SYNC, BACKLOG, CREATING_SNAPSHOT, CONTINUOUS, PAUSED, RESCAN, STALLED, DISCONNECTED)
}

@js.native
sealed trait RecoverySnapshotsOrder extends js.Any
object RecoverySnapshotsOrder {
  val ASC = "ASC".asInstanceOf[RecoverySnapshotsOrder]
  val DESC = "DESC".asInstanceOf[RecoverySnapshotsOrder]

  @inline def values: js.Array[RecoverySnapshotsOrder] = js.Array(ASC, DESC)
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
  val GP3 = "GP3".asInstanceOf[ReplicationConfigurationDefaultLargeStagingDiskType]
  val ST1 = "ST1".asInstanceOf[ReplicationConfigurationDefaultLargeStagingDiskType]

  @inline def values: js.Array[ReplicationConfigurationDefaultLargeStagingDiskType] = js.Array(GP2, GP3, ST1)
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
  val GP3 = "GP3".asInstanceOf[ReplicationConfigurationReplicatedDiskStagingDiskType]
  val IO1 = "IO1".asInstanceOf[ReplicationConfigurationReplicatedDiskStagingDiskType]
  val SC1 = "SC1".asInstanceOf[ReplicationConfigurationReplicatedDiskStagingDiskType]
  val ST1 = "ST1".asInstanceOf[ReplicationConfigurationReplicatedDiskStagingDiskType]
  val STANDARD = "STANDARD".asInstanceOf[ReplicationConfigurationReplicatedDiskStagingDiskType]

  @inline def values: js.Array[ReplicationConfigurationReplicatedDiskStagingDiskType] = js.Array(AUTO, GP2, GP3, IO1, SC1, ST1, STANDARD)
}

@js.native
sealed trait TargetInstanceTypeRightSizingMethod extends js.Any
object TargetInstanceTypeRightSizingMethod {
  val NONE = "NONE".asInstanceOf[TargetInstanceTypeRightSizingMethod]
  val BASIC = "BASIC".asInstanceOf[TargetInstanceTypeRightSizingMethod]

  @inline def values: js.Array[TargetInstanceTypeRightSizingMethod] = js.Array(NONE, BASIC)
}
