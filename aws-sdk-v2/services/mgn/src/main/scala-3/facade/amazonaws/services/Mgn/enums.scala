package facade.amazonaws.services.mgn

import scalajs.js

type ApplicationHealthStatus = "HEALTHY" | "LAGGING" | "ERROR"
object ApplicationHealthStatus {
  inline val HEALTHY: "HEALTHY" = "HEALTHY"
  inline val LAGGING: "LAGGING" = "LAGGING"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[ApplicationHealthStatus] = js.Array(HEALTHY, LAGGING, ERROR)
}

type ApplicationProgressStatus = "NOT_STARTED" | "IN_PROGRESS" | "COMPLETED"
object ApplicationProgressStatus {
  inline val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"

  inline def values: js.Array[ApplicationProgressStatus] = js.Array(NOT_STARTED, IN_PROGRESS, COMPLETED)
}

type BootMode = "LEGACY_BIOS" | "UEFI"
object BootMode {
  inline val LEGACY_BIOS: "LEGACY_BIOS" = "LEGACY_BIOS"
  inline val UEFI: "UEFI" = "UEFI"

  inline def values: js.Array[BootMode] = js.Array(LEGACY_BIOS, UEFI)
}

type ChangeServerLifeCycleStateSourceServerLifecycleState = "READY_FOR_TEST" | "READY_FOR_CUTOVER" | "CUTOVER"
object ChangeServerLifeCycleStateSourceServerLifecycleState {
  inline val READY_FOR_TEST: "READY_FOR_TEST" = "READY_FOR_TEST"
  inline val READY_FOR_CUTOVER: "READY_FOR_CUTOVER" = "READY_FOR_CUTOVER"
  inline val CUTOVER: "CUTOVER" = "CUTOVER"

  inline def values: js.Array[ChangeServerLifeCycleStateSourceServerLifecycleState] = js.Array(READY_FOR_TEST, READY_FOR_CUTOVER, CUTOVER)
}

type DataReplicationErrorString = "AGENT_NOT_SEEN" | "SNAPSHOTS_FAILURE" | "NOT_CONVERGING" | "UNSTABLE_NETWORK" | "FAILED_TO_CREATE_SECURITY_GROUP" | "FAILED_TO_LAUNCH_REPLICATION_SERVER" | "FAILED_TO_BOOT_REPLICATION_SERVER" | "FAILED_TO_AUTHENTICATE_WITH_SERVICE" | "FAILED_TO_DOWNLOAD_REPLICATION_SOFTWARE" | "FAILED_TO_CREATE_STAGING_DISKS" | "FAILED_TO_ATTACH_STAGING_DISKS" | "FAILED_TO_PAIR_REPLICATION_SERVER_WITH_AGENT" | "FAILED_TO_CONNECT_AGENT_TO_REPLICATION_SERVER" | "FAILED_TO_START_DATA_TRANSFER" | "UNSUPPORTED_VM_CONFIGURATION" | "LAST_SNAPSHOT_JOB_FAILED"
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
  inline val UNSUPPORTED_VM_CONFIGURATION: "UNSUPPORTED_VM_CONFIGURATION" = "UNSUPPORTED_VM_CONFIGURATION"
  inline val LAST_SNAPSHOT_JOB_FAILED: "LAST_SNAPSHOT_JOB_FAILED" = "LAST_SNAPSHOT_JOB_FAILED"

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
    FAILED_TO_START_DATA_TRANSFER,
    UNSUPPORTED_VM_CONFIGURATION,
    LAST_SNAPSHOT_JOB_FAILED
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

type DataReplicationState = "STOPPED" | "INITIATING" | "INITIAL_SYNC" | "BACKLOG" | "CREATING_SNAPSHOT" | "CONTINUOUS" | "PAUSED" | "RESCAN" | "STALLED" | "DISCONNECTED" | "PENDING_SNAPSHOT_SHIPPING" | "SHIPPING_SNAPSHOT"
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
  inline val PENDING_SNAPSHOT_SHIPPING: "PENDING_SNAPSHOT_SHIPPING" = "PENDING_SNAPSHOT_SHIPPING"
  inline val SHIPPING_SNAPSHOT: "SHIPPING_SNAPSHOT" = "SHIPPING_SNAPSHOT"

  inline def values: js.Array[DataReplicationState] = js.Array(STOPPED, INITIATING, INITIAL_SYNC, BACKLOG, CREATING_SNAPSHOT, CONTINUOUS, PAUSED, RESCAN, STALLED, DISCONNECTED, PENDING_SNAPSHOT_SHIPPING, SHIPPING_SNAPSHOT)
}

type FirstBoot = "WAITING" | "SUCCEEDED" | "UNKNOWN" | "STOPPED"
object FirstBoot {
  inline val WAITING: "WAITING" = "WAITING"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val UNKNOWN: "UNKNOWN" = "UNKNOWN"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[FirstBoot] = js.Array(WAITING, SUCCEEDED, UNKNOWN, STOPPED)
}

type InitiatedBy = "START_TEST" | "START_CUTOVER" | "DIAGNOSTIC" | "TERMINATE"
object InitiatedBy {
  inline val START_TEST: "START_TEST" = "START_TEST"
  inline val START_CUTOVER: "START_CUTOVER" = "START_CUTOVER"
  inline val DIAGNOSTIC: "DIAGNOSTIC" = "DIAGNOSTIC"
  inline val TERMINATE: "TERMINATE" = "TERMINATE"

  inline def values: js.Array[InitiatedBy] = js.Array(START_TEST, START_CUTOVER, DIAGNOSTIC, TERMINATE)
}

type JobLogEvent = "JOB_START" | "SERVER_SKIPPED" | "CLEANUP_START" | "CLEANUP_END" | "CLEANUP_FAIL" | "SNAPSHOT_START" | "SNAPSHOT_END" | "SNAPSHOT_FAIL" | "USING_PREVIOUS_SNAPSHOT" | "CONVERSION_START" | "CONVERSION_END" | "CONVERSION_FAIL" | "LAUNCH_START" | "LAUNCH_FAILED" | "JOB_CANCEL" | "JOB_END"
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

type LifeCycleState = "STOPPED" | "NOT_READY" | "READY_FOR_TEST" | "TESTING" | "READY_FOR_CUTOVER" | "CUTTING_OVER" | "CUTOVER" | "DISCONNECTED" | "DISCOVERED"
object LifeCycleState {
  inline val STOPPED: "STOPPED" = "STOPPED"
  inline val NOT_READY: "NOT_READY" = "NOT_READY"
  inline val READY_FOR_TEST: "READY_FOR_TEST" = "READY_FOR_TEST"
  inline val TESTING: "TESTING" = "TESTING"
  inline val READY_FOR_CUTOVER: "READY_FOR_CUTOVER" = "READY_FOR_CUTOVER"
  inline val CUTTING_OVER: "CUTTING_OVER" = "CUTTING_OVER"
  inline val CUTOVER: "CUTOVER" = "CUTOVER"
  inline val DISCONNECTED: "DISCONNECTED" = "DISCONNECTED"
  inline val DISCOVERED: "DISCOVERED" = "DISCOVERED"

  inline def values: js.Array[LifeCycleState] = js.Array(STOPPED, NOT_READY, READY_FOR_TEST, TESTING, READY_FOR_CUTOVER, CUTTING_OVER, CUTOVER, DISCONNECTED, DISCOVERED)
}

type PostLaunchActionExecutionStatus = "IN_PROGRESS" | "SUCCESS" | "FAILED"
object PostLaunchActionExecutionStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[PostLaunchActionExecutionStatus] = js.Array(IN_PROGRESS, SUCCESS, FAILED)
}

type PostLaunchActionsDeploymentType = "TEST_AND_CUTOVER" | "CUTOVER_ONLY" | "TEST_ONLY"
object PostLaunchActionsDeploymentType {
  inline val TEST_AND_CUTOVER: "TEST_AND_CUTOVER" = "TEST_AND_CUTOVER"
  inline val CUTOVER_ONLY: "CUTOVER_ONLY" = "CUTOVER_ONLY"
  inline val TEST_ONLY: "TEST_ONLY" = "TEST_ONLY"

  inline def values: js.Array[PostLaunchActionsDeploymentType] = js.Array(TEST_AND_CUTOVER, CUTOVER_ONLY, TEST_ONLY)
}

type ReplicationConfigurationDataPlaneRouting = "PRIVATE_IP" | "PUBLIC_IP"
object ReplicationConfigurationDataPlaneRouting {
  inline val PRIVATE_IP: "PRIVATE_IP" = "PRIVATE_IP"
  inline val PUBLIC_IP: "PUBLIC_IP" = "PUBLIC_IP"

  inline def values: js.Array[ReplicationConfigurationDataPlaneRouting] = js.Array(PRIVATE_IP, PUBLIC_IP)
}

type ReplicationConfigurationDefaultLargeStagingDiskType = "GP2" | "ST1" | "GP3"
object ReplicationConfigurationDefaultLargeStagingDiskType {
  inline val GP2: "GP2" = "GP2"
  inline val ST1: "ST1" = "ST1"
  inline val GP3: "GP3" = "GP3"

  inline def values: js.Array[ReplicationConfigurationDefaultLargeStagingDiskType] = js.Array(GP2, ST1, GP3)
}

type ReplicationConfigurationEbsEncryption = "DEFAULT" | "CUSTOM"
object ReplicationConfigurationEbsEncryption {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val CUSTOM: "CUSTOM" = "CUSTOM"

  inline def values: js.Array[ReplicationConfigurationEbsEncryption] = js.Array(DEFAULT, CUSTOM)
}

type ReplicationConfigurationReplicatedDiskStagingDiskType = "AUTO" | "GP2" | "IO1" | "SC1" | "ST1" | "STANDARD" | "GP3" | "IO2"
object ReplicationConfigurationReplicatedDiskStagingDiskType {
  inline val AUTO: "AUTO" = "AUTO"
  inline val GP2: "GP2" = "GP2"
  inline val IO1: "IO1" = "IO1"
  inline val SC1: "SC1" = "SC1"
  inline val ST1: "ST1" = "ST1"
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val GP3: "GP3" = "GP3"
  inline val IO2: "IO2" = "IO2"

  inline def values: js.Array[ReplicationConfigurationReplicatedDiskStagingDiskType] = js.Array(AUTO, GP2, IO1, SC1, ST1, STANDARD, GP3, IO2)
}

type ReplicationType = "AGENT_BASED" | "SNAPSHOT_SHIPPING"
object ReplicationType {
  inline val AGENT_BASED: "AGENT_BASED" = "AGENT_BASED"
  inline val SNAPSHOT_SHIPPING: "SNAPSHOT_SHIPPING" = "SNAPSHOT_SHIPPING"

  inline def values: js.Array[ReplicationType] = js.Array(AGENT_BASED, SNAPSHOT_SHIPPING)
}

type SsmDocumentType = "AUTOMATION" | "COMMAND"
object SsmDocumentType {
  inline val AUTOMATION: "AUTOMATION" = "AUTOMATION"
  inline val COMMAND: "COMMAND" = "COMMAND"

  inline def values: js.Array[SsmDocumentType] = js.Array(AUTOMATION, COMMAND)
}

type SsmParameterStoreParameterType = "STRING"
object SsmParameterStoreParameterType {
  inline val STRING: "STRING" = "STRING"

  inline def values: js.Array[SsmParameterStoreParameterType] = js.Array(STRING)
}

type TargetInstanceTypeRightSizingMethod = "NONE" | "BASIC"
object TargetInstanceTypeRightSizingMethod {
  inline val NONE: "NONE" = "NONE"
  inline val BASIC: "BASIC" = "BASIC"

  inline def values: js.Array[TargetInstanceTypeRightSizingMethod] = js.Array(NONE, BASIC)
}

type VolumeType = "io1" | "io2" | "gp3" | "gp2" | "st1" | "sc1" | "standard"
object VolumeType {
  inline val io1: "io1" = "io1"
  inline val io2: "io2" = "io2"
  inline val gp3: "gp3" = "gp3"
  inline val gp2: "gp2" = "gp2"
  inline val st1: "st1" = "st1"
  inline val sc1: "sc1" = "sc1"
  inline val standard: "standard" = "standard"

  inline def values: js.Array[VolumeType] = js.Array(io1, io2, gp3, gp2, st1, sc1, standard)
}

type WaveHealthStatus = "HEALTHY" | "LAGGING" | "ERROR"
object WaveHealthStatus {
  inline val HEALTHY: "HEALTHY" = "HEALTHY"
  inline val LAGGING: "LAGGING" = "LAGGING"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[WaveHealthStatus] = js.Array(HEALTHY, LAGGING, ERROR)
}

type WaveProgressStatus = "NOT_STARTED" | "IN_PROGRESS" | "COMPLETED"
object WaveProgressStatus {
  inline val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"

  inline def values: js.Array[WaveProgressStatus] = js.Array(NOT_STARTED, IN_PROGRESS, COMPLETED)
}
