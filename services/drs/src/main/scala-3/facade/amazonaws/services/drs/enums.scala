package facade.amazonaws.services.drs

import scalajs.js

type DataReplicationErrorString = "AGENT_NOT_SEEN" | "SNAPSHOTS_FAILURE" | "NOT_CONVERGING" | "UNSTABLE_NETWORK" | "FAILED_TO_CREATE_SECURITY_GROUP" | "FAILED_TO_LAUNCH_REPLICATION_SERVER" | "FAILED_TO_BOOT_REPLICATION_SERVER" | "FAILED_TO_AUTHENTICATE_WITH_SERVICE" | "FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE" | "FAILED_TO_CREATE_STAGING_DISKS" | "FAILED_TO_ATTACH_STAGING_DISKS" | "FAILED_TO_PAIR_REPLICATION_SERVER_WITH_AGENT" | "FAILED_TO_CONNECT_AGENT_TO_REPLICATION_SERVER" | "FAILED_TO_START_DATA_TRANSFER"
object DataReplicationErrorString {
  inline val AGENT_NOT_SEEN: "AGENT_NOT_SEEN" = "AGENT_NOT_SEEN"
  inline val SNAPSHOTS_FAILURE: "SNAPSHOTS_FAILURE" = "SNAPSHOTS_FAILURE"
  inline val NOT_CONVERGING: "NOT_CONVERGING" = "NOT_CONVERGING"
  inline val UNSTABLE_NETWORK: "UNSTABLE_NETWORK" = "UNSTABLE_NETWORK"
  inline val FAILED_TO_CREATE_SECURITY_GROUP: "FAILED_TO_CREATE_SECURITY_GROUP" = "FAILED_TO_CREATE_SECURITY_GROUP"
  inline val FAILED_TO_LAUNCH_REPLICATION_SERVER: "FAILED_TO_LAUNCH_REPLICATION_SERVER" = "FAILED_TO_LAUNCH_REPLICATION_SERVER"
  inline val FAILED_TO_BOOT_REPLICATION_SERVER: "FAILED_TO_BOOT_REPLICATION_SERVER" = "FAILED_TO_BOOT_REPLICATION_SERVER"
  inline val FAILED_TO_AUTHENTICATE_WITH_SERVICE: "FAILED_TO_AUTHENTICATE_WITH_SERVICE" = "FAILED_TO_AUTHENTICATE_WITH_SERVICE"
  inline val FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE: "FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE" = "FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE"
  inline val FAILED_TO_CREATE_STAGING_DISKS: "FAILED_TO_CREATE_STAGING_DISKS" = "FAILED_TO_CREATE_STAGING_DISKS"
  inline val FAILED_TO_ATTACH_STAGING_DISKS: "FAILED_TO_ATTACH_STAGING_DISKS" = "FAILED_TO_ATTACH_STAGING_DISKS"
  inline val FAILED_TO_PAIR_REPLICATION_SERVER_WITH_AGENT: "FAILED_TO_PAIR_REPLICATION_SERVER_WITH_AGENT" = "FAILED_TO_PAIR_REPLICATION_SERVER_WITH_AGENT"
  inline val FAILED_TO_CONNECT_AGENT_TO_REPLICATION_SERVER: "FAILED_TO_CONNECT_AGENT_TO_REPLICATION_SERVER" = "FAILED_TO_CONNECT_AGENT_TO_REPLICATION_SERVER"
  inline val FAILED_TO_START_DATA_TRANSFER: "FAILED_TO_START_DATA_TRANSFER" = "FAILED_TO_START_DATA_TRANSFER"

  inline def values: js.Array[DataReplicationErrorString] = js.Array(
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

type DataReplicationInitiationStepName = "WAIT" | "CREATE_SECURITY_GROUP" | "LAUNCH_REPLICATION_SERVER" | "BOOT_REPLICATION_SERVER" | "AUTHENTICATE_WITH_SERVICE" | "DOWNLOAD_REPLICATION_SOFTWARE" | "CREATE_STAGING_DISKS" | "ATTACH_STAGING_DISKS" | "PAIR_REPLICATION_SERVER_WITH_AGENT" | "CONNECT_AGENT_TO_REPLICATION_SERVER" | "START_DATA_TRANSFER"
object DataReplicationInitiationStepName {
  inline val WAIT: "WAIT" = "WAIT"
  inline val CREATE_SECURITY_GROUP: "CREATE_SECURITY_GROUP" = "CREATE_SECURITY_GROUP"
  inline val LAUNCH_REPLICATION_SERVER: "LAUNCH_REPLICATION_SERVER" = "LAUNCH_REPLICATION_SERVER"
  inline val BOOT_REPLICATION_SERVER: "BOOT_REPLICATION_SERVER" = "BOOT_REPLICATION_SERVER"
  inline val AUTHENTICATE_WITH_SERVICE: "AUTHENTICATE_WITH_SERVICE" = "AUTHENTICATE_WITH_SERVICE"
  inline val DOWNLOAD_REPLICATION_SOFTWARE: "DOWNLOAD_REPLICATION_SOFTWARE" = "DOWNLOAD_REPLICATION_SOFTWARE"
  inline val CREATE_STAGING_DISKS: "CREATE_STAGING_DISKS" = "CREATE_STAGING_DISKS"
  inline val ATTACH_STAGING_DISKS: "ATTACH_STAGING_DISKS" = "ATTACH_STAGING_DISKS"
  inline val PAIR_REPLICATION_SERVER_WITH_AGENT: "PAIR_REPLICATION_SERVER_WITH_AGENT" = "PAIR_REPLICATION_SERVER_WITH_AGENT"
  inline val CONNECT_AGENT_TO_REPLICATION_SERVER: "CONNECT_AGENT_TO_REPLICATION_SERVER" = "CONNECT_AGENT_TO_REPLICATION_SERVER"
  inline val START_DATA_TRANSFER: "START_DATA_TRANSFER" = "START_DATA_TRANSFER"

  inline def values: js.Array[DataReplicationInitiationStepName] = js.Array(
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

type DataReplicationInitiationStepStatus = "NOT_STARTED" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "SKIPPED"
object DataReplicationInitiationStepStatus {
  inline val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val SKIPPED: "SKIPPED" = "SKIPPED"

  inline def values: js.Array[DataReplicationInitiationStepStatus] = js.Array(NOT_STARTED, IN_PROGRESS, SUCCEEDED, FAILED, SKIPPED)
}

type DataReplicationState = "STOPPED" | "INITIATING" | "INITIAL_SYNC" | "BACKLOG" | "CREATING_SNAPSHOT" | "CONTINUOUS" | "PAUSED" | "RESCAN" | "STALLED" | "DISCONNECTED"
object DataReplicationState {
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val INITIATING: "INITIATING" = "INITIATING"
  inline val INITIAL_SYNC: "INITIAL_SYNC" = "INITIAL_SYNC"
  inline val BACKLOG: "BACKLOG" = "BACKLOG"
  inline val CREATING_SNAPSHOT: "CREATING_SNAPSHOT" = "CREATING_SNAPSHOT"
  inline val CONTINUOUS: "CONTINUOUS" = "CONTINUOUS"
  inline val PAUSED: "PAUSED" = "PAUSED"
  inline val RESCAN: "RESCAN" = "RESCAN"
  inline val STALLED: "STALLED" = "STALLED"
  inline val DISCONNECTED: "DISCONNECTED" = "DISCONNECTED"

  inline def values: js.Array[DataReplicationState] = js.Array(STOPPED, INITIATING, INITIAL_SYNC, BACKLOG, CREATING_SNAPSHOT, CONTINUOUS, PAUSED, RESCAN, STALLED, DISCONNECTED)
}

type EC2InstanceState = "PENDING" | "RUNNING" | "STOPPING" | "STOPPED" | "SHUTTING-DOWN" | "TERMINATED" | "NOT_FOUND"
object EC2InstanceState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val `SHUTTING-DOWN`: "SHUTTING-DOWN" = "SHUTTING-DOWN"
  inline val TERMINATED: "TERMINATED" = "TERMINATED"
  inline val NOT_FOUND: "NOT_FOUND" = "NOT_FOUND"

  inline def values: js.Array[EC2InstanceState] = js.Array(PENDING, RUNNING, STOPPING, STOPPED, `SHUTTING-DOWN`, TERMINATED, NOT_FOUND)
}

type FailbackReplicationError = "AGENT_NOT_SEEN" | "FAILBACK_CLIENT_NOT_SEEN" | "NOT_CONVERGING" | "UNSTABLE_NETWORK" | "FAILED_TO_ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION" | "FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT" | "FAILED_TO_CONFIGURE_REPLICATION_SOFTWARE" | "FAILED_TO_PAIR_AGENT_WITH_REPLICATION_SOFTWARE" | "FAILED_TO_ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION"
object FailbackReplicationError {
  inline val AGENT_NOT_SEEN: "AGENT_NOT_SEEN" = "AGENT_NOT_SEEN"
  inline val FAILBACK_CLIENT_NOT_SEEN: "FAILBACK_CLIENT_NOT_SEEN" = "FAILBACK_CLIENT_NOT_SEEN"
  inline val NOT_CONVERGING: "NOT_CONVERGING" = "NOT_CONVERGING"
  inline val UNSTABLE_NETWORK: "UNSTABLE_NETWORK" = "UNSTABLE_NETWORK"
  inline val FAILED_TO_ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION: "FAILED_TO_ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION" = "FAILED_TO_ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION"
  inline val FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT: "FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT" = "FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT"
  inline val FAILED_TO_CONFIGURE_REPLICATION_SOFTWARE: "FAILED_TO_CONFIGURE_REPLICATION_SOFTWARE" = "FAILED_TO_CONFIGURE_REPLICATION_SOFTWARE"
  inline val FAILED_TO_PAIR_AGENT_WITH_REPLICATION_SOFTWARE: "FAILED_TO_PAIR_AGENT_WITH_REPLICATION_SOFTWARE" = "FAILED_TO_PAIR_AGENT_WITH_REPLICATION_SOFTWARE"
  inline val FAILED_TO_ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION: "FAILED_TO_ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION" = "FAILED_TO_ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION"

  inline def values: js.Array[FailbackReplicationError] = js.Array(
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

type FailbackState = "FAILBACK_NOT_STARTED" | "FAILBACK_IN_PROGRESS" | "FAILBACK_READY_FOR_LAUNCH" | "FAILBACK_COMPLETED" | "FAILBACK_ERROR"
object FailbackState {
  inline val FAILBACK_NOT_STARTED: "FAILBACK_NOT_STARTED" = "FAILBACK_NOT_STARTED"
  inline val FAILBACK_IN_PROGRESS: "FAILBACK_IN_PROGRESS" = "FAILBACK_IN_PROGRESS"
  inline val FAILBACK_READY_FOR_LAUNCH: "FAILBACK_READY_FOR_LAUNCH" = "FAILBACK_READY_FOR_LAUNCH"
  inline val FAILBACK_COMPLETED: "FAILBACK_COMPLETED" = "FAILBACK_COMPLETED"
  inline val FAILBACK_ERROR: "FAILBACK_ERROR" = "FAILBACK_ERROR"

  inline def values: js.Array[FailbackState] = js.Array(FAILBACK_NOT_STARTED, FAILBACK_IN_PROGRESS, FAILBACK_READY_FOR_LAUNCH, FAILBACK_COMPLETED, FAILBACK_ERROR)
}

type InitiatedBy = "START_RECOVERY" | "START_DRILL" | "FAILBACK" | "DIAGNOSTIC" | "TERMINATE_RECOVERY_INSTANCES"
object InitiatedBy {
  inline val START_RECOVERY: "START_RECOVERY" = "START_RECOVERY"
  inline val START_DRILL: "START_DRILL" = "START_DRILL"
  inline val FAILBACK: "FAILBACK" = "FAILBACK"
  inline val DIAGNOSTIC: "DIAGNOSTIC" = "DIAGNOSTIC"
  inline val TERMINATE_RECOVERY_INSTANCES: "TERMINATE_RECOVERY_INSTANCES" = "TERMINATE_RECOVERY_INSTANCES"

  inline def values: js.Array[InitiatedBy] = js.Array(START_RECOVERY, START_DRILL, FAILBACK, DIAGNOSTIC, TERMINATE_RECOVERY_INSTANCES)
}

type JobLogEvent = "JOB_START" | "SERVER_SKIPPED" | "CLEANUP_START" | "CLEANUP_END" | "CLEANUP_FAIL" | "SNAPSHOT_START" | "SNAPSHOT_END" | "SNAPSHOT_FAIL" | "USING_PREVIOUS_SNAPSHOT" | "USING_PREVIOUS_SNAPSHOT_FAILED" | "CONVERSION_START" | "CONVERSION_END" | "CONVERSION_FAIL" | "LAUNCH_START" | "LAUNCH_FAILED" | "JOB_CANCEL" | "JOB_END"
object JobLogEvent {
  inline val JOB_START: "JOB_START" = "JOB_START"
  inline val SERVER_SKIPPED: "SERVER_SKIPPED" = "SERVER_SKIPPED"
  inline val CLEANUP_START: "CLEANUP_START" = "CLEANUP_START"
  inline val CLEANUP_END: "CLEANUP_END" = "CLEANUP_END"
  inline val CLEANUP_FAIL: "CLEANUP_FAIL" = "CLEANUP_FAIL"
  inline val SNAPSHOT_START: "SNAPSHOT_START" = "SNAPSHOT_START"
  inline val SNAPSHOT_END: "SNAPSHOT_END" = "SNAPSHOT_END"
  inline val SNAPSHOT_FAIL: "SNAPSHOT_FAIL" = "SNAPSHOT_FAIL"
  inline val USING_PREVIOUS_SNAPSHOT: "USING_PREVIOUS_SNAPSHOT" = "USING_PREVIOUS_SNAPSHOT"
  inline val USING_PREVIOUS_SNAPSHOT_FAILED: "USING_PREVIOUS_SNAPSHOT_FAILED" = "USING_PREVIOUS_SNAPSHOT_FAILED"
  inline val CONVERSION_START: "CONVERSION_START" = "CONVERSION_START"
  inline val CONVERSION_END: "CONVERSION_END" = "CONVERSION_END"
  inline val CONVERSION_FAIL: "CONVERSION_FAIL" = "CONVERSION_FAIL"
  inline val LAUNCH_START: "LAUNCH_START" = "LAUNCH_START"
  inline val LAUNCH_FAILED: "LAUNCH_FAILED" = "LAUNCH_FAILED"
  inline val JOB_CANCEL: "JOB_CANCEL" = "JOB_CANCEL"
  inline val JOB_END: "JOB_END" = "JOB_END"

  inline def values: js.Array[JobLogEvent] = js.Array(
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

type JobStatus = "PENDING" | "STARTED" | "COMPLETED"
object JobStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val STARTED: "STARTED" = "STARTED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"

  inline def values: js.Array[JobStatus] = js.Array(PENDING, STARTED, COMPLETED)
}

type JobType = "LAUNCH" | "TERMINATE"
object JobType {
  inline val LAUNCH: "LAUNCH" = "LAUNCH"
  inline val TERMINATE: "TERMINATE" = "TERMINATE"

  inline def values: js.Array[JobType] = js.Array(LAUNCH, TERMINATE)
}

type LastLaunchResult = "NOT_STARTED" | "PENDING" | "SUCCEEDED" | "FAILED"
object LastLaunchResult {
  inline val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[LastLaunchResult] = js.Array(NOT_STARTED, PENDING, SUCCEEDED, FAILED)
}

type LastLaunchType = "RECOVERY" | "DRILL"
object LastLaunchType {
  inline val RECOVERY: "RECOVERY" = "RECOVERY"
  inline val DRILL: "DRILL" = "DRILL"

  inline def values: js.Array[LastLaunchType] = js.Array(RECOVERY, DRILL)
}

type LaunchDisposition = "STOPPED" | "STARTED"
object LaunchDisposition {
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val STARTED: "STARTED" = "STARTED"

  inline def values: js.Array[LaunchDisposition] = js.Array(STOPPED, STARTED)
}

type LaunchStatus = "PENDING" | "IN_PROGRESS" | "LAUNCHED" | "FAILED" | "TERMINATED"
object LaunchStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val LAUNCHED: "LAUNCHED" = "LAUNCHED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val TERMINATED: "TERMINATED" = "TERMINATED"

  inline def values: js.Array[LaunchStatus] = js.Array(PENDING, IN_PROGRESS, LAUNCHED, FAILED, TERMINATED)
}

type PITPolicyRuleUnits = "MINUTE" | "HOUR" | "DAY"
object PITPolicyRuleUnits {
  inline val MINUTE: "MINUTE" = "MINUTE"
  inline val HOUR: "HOUR" = "HOUR"
  inline val DAY: "DAY" = "DAY"

  inline def values: js.Array[PITPolicyRuleUnits] = js.Array(MINUTE, HOUR, DAY)
}

type RecoveryInstanceDataReplicationInitiationStepName = "LINK_FAILBACK_CLIENT_WITH_RECOVERY_INSTANCE" | "COMPLETE_VOLUME_MAPPING" | "ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION" | "DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT" | "CONFIGURE_REPLICATION_SOFTWARE" | "PAIR_AGENT_WITH_REPLICATION_SOFTWARE" | "ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION"
object RecoveryInstanceDataReplicationInitiationStepName {
  inline val LINK_FAILBACK_CLIENT_WITH_RECOVERY_INSTANCE: "LINK_FAILBACK_CLIENT_WITH_RECOVERY_INSTANCE" = "LINK_FAILBACK_CLIENT_WITH_RECOVERY_INSTANCE"
  inline val COMPLETE_VOLUME_MAPPING: "COMPLETE_VOLUME_MAPPING" = "COMPLETE_VOLUME_MAPPING"
  inline val ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION: "ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION" = "ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION"
  inline val DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT: "DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT" = "DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT"
  inline val CONFIGURE_REPLICATION_SOFTWARE: "CONFIGURE_REPLICATION_SOFTWARE" = "CONFIGURE_REPLICATION_SOFTWARE"
  inline val PAIR_AGENT_WITH_REPLICATION_SOFTWARE: "PAIR_AGENT_WITH_REPLICATION_SOFTWARE" = "PAIR_AGENT_WITH_REPLICATION_SOFTWARE"
  inline val ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION: "ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION" = "ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION"

  inline def values: js.Array[RecoveryInstanceDataReplicationInitiationStepName] = js.Array(
    LINK_FAILBACK_CLIENT_WITH_RECOVERY_INSTANCE,
    COMPLETE_VOLUME_MAPPING,
    ESTABLISH_RECOVERY_INSTANCE_COMMUNICATION,
    DOWNLOAD_REPLICATION_SOFTWARE_TO_FAILBACK_CLIENT,
    CONFIGURE_REPLICATION_SOFTWARE,
    PAIR_AGENT_WITH_REPLICATION_SOFTWARE,
    ESTABLISH_AGENT_REPLICATOR_SOFTWARE_COMMUNICATION
  )
}

type RecoveryInstanceDataReplicationInitiationStepStatus = "NOT_STARTED" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "SKIPPED"
object RecoveryInstanceDataReplicationInitiationStepStatus {
  inline val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val SKIPPED: "SKIPPED" = "SKIPPED"

  inline def values: js.Array[RecoveryInstanceDataReplicationInitiationStepStatus] = js.Array(NOT_STARTED, IN_PROGRESS, SUCCEEDED, FAILED, SKIPPED)
}

type RecoveryInstanceDataReplicationState = "STOPPED" | "INITIATING" | "INITIAL_SYNC" | "BACKLOG" | "CREATING_SNAPSHOT" | "CONTINUOUS" | "PAUSED" | "RESCAN" | "STALLED" | "DISCONNECTED"
object RecoveryInstanceDataReplicationState {
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val INITIATING: "INITIATING" = "INITIATING"
  inline val INITIAL_SYNC: "INITIAL_SYNC" = "INITIAL_SYNC"
  inline val BACKLOG: "BACKLOG" = "BACKLOG"
  inline val CREATING_SNAPSHOT: "CREATING_SNAPSHOT" = "CREATING_SNAPSHOT"
  inline val CONTINUOUS: "CONTINUOUS" = "CONTINUOUS"
  inline val PAUSED: "PAUSED" = "PAUSED"
  inline val RESCAN: "RESCAN" = "RESCAN"
  inline val STALLED: "STALLED" = "STALLED"
  inline val DISCONNECTED: "DISCONNECTED" = "DISCONNECTED"

  inline def values: js.Array[RecoveryInstanceDataReplicationState] = js.Array(STOPPED, INITIATING, INITIAL_SYNC, BACKLOG, CREATING_SNAPSHOT, CONTINUOUS, PAUSED, RESCAN, STALLED, DISCONNECTED)
}

type RecoverySnapshotsOrder = "ASC" | "DESC"
object RecoverySnapshotsOrder {
  inline val ASC: "ASC" = "ASC"
  inline val DESC: "DESC" = "DESC"

  inline def values: js.Array[RecoverySnapshotsOrder] = js.Array(ASC, DESC)
}

type ReplicationConfigurationDataPlaneRouting = "PRIVATE_IP" | "PUBLIC_IP"
object ReplicationConfigurationDataPlaneRouting {
  inline val PRIVATE_IP: "PRIVATE_IP" = "PRIVATE_IP"
  inline val PUBLIC_IP: "PUBLIC_IP" = "PUBLIC_IP"

  inline def values: js.Array[ReplicationConfigurationDataPlaneRouting] = js.Array(PRIVATE_IP, PUBLIC_IP)
}

type ReplicationConfigurationDefaultLargeStagingDiskType = "GP2" | "GP3" | "ST1"
object ReplicationConfigurationDefaultLargeStagingDiskType {
  inline val GP2: "GP2" = "GP2"
  inline val GP3: "GP3" = "GP3"
  inline val ST1: "ST1" = "ST1"

  inline def values: js.Array[ReplicationConfigurationDefaultLargeStagingDiskType] = js.Array(GP2, GP3, ST1)
}

type ReplicationConfigurationEbsEncryption = "DEFAULT" | "CUSTOM"
object ReplicationConfigurationEbsEncryption {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val CUSTOM: "CUSTOM" = "CUSTOM"

  inline def values: js.Array[ReplicationConfigurationEbsEncryption] = js.Array(DEFAULT, CUSTOM)
}

type ReplicationConfigurationReplicatedDiskStagingDiskType = "AUTO" | "GP2" | "GP3" | "IO1" | "SC1" | "ST1" | "STANDARD"
object ReplicationConfigurationReplicatedDiskStagingDiskType {
  inline val AUTO: "AUTO" = "AUTO"
  inline val GP2: "GP2" = "GP2"
  inline val GP3: "GP3" = "GP3"
  inline val IO1: "IO1" = "IO1"
  inline val SC1: "SC1" = "SC1"
  inline val ST1: "ST1" = "ST1"
  inline val STANDARD: "STANDARD" = "STANDARD"

  inline def values: js.Array[ReplicationConfigurationReplicatedDiskStagingDiskType] = js.Array(AUTO, GP2, GP3, IO1, SC1, ST1, STANDARD)
}

type TargetInstanceTypeRightSizingMethod = "NONE" | "BASIC"
object TargetInstanceTypeRightSizingMethod {
  inline val NONE: "NONE" = "NONE"
  inline val BASIC: "BASIC" = "BASIC"

  inline def values: js.Array[TargetInstanceTypeRightSizingMethod] = js.Array(NONE, BASIC)
}
