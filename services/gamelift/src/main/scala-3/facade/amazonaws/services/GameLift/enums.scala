package facade.amazonaws.services.gamelift

import scalajs._

type AcceptanceType = "ACCEPT" | "REJECT"
object AcceptanceType {
  val ACCEPT: "ACCEPT" = "ACCEPT"
  val REJECT: "REJECT" = "REJECT"

  @inline def values = js.Array[AcceptanceType](ACCEPT, REJECT)
}

type BackfillMode = "AUTOMATIC" | "MANUAL"
object BackfillMode {
  val AUTOMATIC: "AUTOMATIC" = "AUTOMATIC"
  val MANUAL: "MANUAL" = "MANUAL"

  @inline def values = js.Array[BackfillMode](AUTOMATIC, MANUAL)
}

type BalancingStrategy = "SPOT_ONLY" | "SPOT_PREFERRED" | "ON_DEMAND_ONLY"
object BalancingStrategy {
  val SPOT_ONLY: "SPOT_ONLY" = "SPOT_ONLY"
  val SPOT_PREFERRED: "SPOT_PREFERRED" = "SPOT_PREFERRED"
  val ON_DEMAND_ONLY: "ON_DEMAND_ONLY" = "ON_DEMAND_ONLY"

  @inline def values = js.Array[BalancingStrategy](SPOT_ONLY, SPOT_PREFERRED, ON_DEMAND_ONLY)
}

type BuildStatus = "INITIALIZED" | "READY" | "FAILED"
object BuildStatus {
  val INITIALIZED: "INITIALIZED" = "INITIALIZED"
  val READY: "READY" = "READY"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[BuildStatus](INITIALIZED, READY, FAILED)
}

type CertificateType = "DISABLED" | "GENERATED"
object CertificateType {
  val DISABLED: "DISABLED" = "DISABLED"
  val GENERATED: "GENERATED" = "GENERATED"

  @inline def values = js.Array[CertificateType](DISABLED, GENERATED)
}

type ComparisonOperatorType = "GreaterThanOrEqualToThreshold" | "GreaterThanThreshold" | "LessThanThreshold" | "LessThanOrEqualToThreshold"
object ComparisonOperatorType {
  val GreaterThanOrEqualToThreshold: "GreaterThanOrEqualToThreshold" = "GreaterThanOrEqualToThreshold"
  val GreaterThanThreshold: "GreaterThanThreshold" = "GreaterThanThreshold"
  val LessThanThreshold: "LessThanThreshold" = "LessThanThreshold"
  val LessThanOrEqualToThreshold: "LessThanOrEqualToThreshold" = "LessThanOrEqualToThreshold"

  @inline def values = js.Array[ComparisonOperatorType](GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold)
}

type EC2InstanceType = "t2.micro" | "t2.small" | "t2.medium" | "t2.large" | "c3.large" | "c3.xlarge" | "c3.2xlarge" | "c3.4xlarge" | "c3.8xlarge" | "c4.large" | "c4.xlarge" | "c4.2xlarge" | "c4.4xlarge" | "c4.8xlarge" | "c5.large" | "c5.xlarge" | "c5.2xlarge" | "c5.4xlarge" | "c5.9xlarge" | "c5.12xlarge" | "c5.18xlarge" | "c5.24xlarge" | "c5a.large" | "c5a.xlarge" | "c5a.2xlarge" | "c5a.4xlarge" | "c5a.8xlarge" | "c5a.12xlarge" | "c5a.16xlarge" | "c5a.24xlarge" | "r3.large" | "r3.xlarge" | "r3.2xlarge" | "r3.4xlarge" | "r3.8xlarge" | "r4.large" | "r4.xlarge" | "r4.2xlarge" | "r4.4xlarge" | "r4.8xlarge" | "r4.16xlarge" | "r5.large" | "r5.xlarge" | "r5.2xlarge" | "r5.4xlarge" | "r5.8xlarge" | "r5.12xlarge" | "r5.16xlarge" | "r5.24xlarge" | "r5a.large" | "r5a.xlarge" | "r5a.2xlarge" | "r5a.4xlarge" | "r5a.8xlarge" | "r5a.12xlarge" | "r5a.16xlarge" | "r5a.24xlarge" | "m3.medium" | "m3.large" | "m3.xlarge" | "m3.2xlarge" | "m4.large" | "m4.xlarge" | "m4.2xlarge" | "m4.4xlarge" |
  "m4.10xlarge" | "m5.large" | "m5.xlarge" | "m5.2xlarge" | "m5.4xlarge" | "m5.8xlarge" | "m5.12xlarge" | "m5.16xlarge" | "m5.24xlarge" | "m5a.large" | "m5a.xlarge" | "m5a.2xlarge" | "m5a.4xlarge" | "m5a.8xlarge" | "m5a.12xlarge" | "m5a.16xlarge" | "m5a.24xlarge"
object EC2InstanceType {
  val `t2.micro`: "t2.micro" = "t2.micro"
  val `t2.small`: "t2.small" = "t2.small"
  val `t2.medium`: "t2.medium" = "t2.medium"
  val `t2.large`: "t2.large" = "t2.large"
  val `c3.large`: "c3.large" = "c3.large"
  val `c3.xlarge`: "c3.xlarge" = "c3.xlarge"
  val `c3.2xlarge`: "c3.2xlarge" = "c3.2xlarge"
  val `c3.4xlarge`: "c3.4xlarge" = "c3.4xlarge"
  val `c3.8xlarge`: "c3.8xlarge" = "c3.8xlarge"
  val `c4.large`: "c4.large" = "c4.large"
  val `c4.xlarge`: "c4.xlarge" = "c4.xlarge"
  val `c4.2xlarge`: "c4.2xlarge" = "c4.2xlarge"
  val `c4.4xlarge`: "c4.4xlarge" = "c4.4xlarge"
  val `c4.8xlarge`: "c4.8xlarge" = "c4.8xlarge"
  val `c5.large`: "c5.large" = "c5.large"
  val `c5.xlarge`: "c5.xlarge" = "c5.xlarge"
  val `c5.2xlarge`: "c5.2xlarge" = "c5.2xlarge"
  val `c5.4xlarge`: "c5.4xlarge" = "c5.4xlarge"
  val `c5.9xlarge`: "c5.9xlarge" = "c5.9xlarge"
  val `c5.12xlarge`: "c5.12xlarge" = "c5.12xlarge"
  val `c5.18xlarge`: "c5.18xlarge" = "c5.18xlarge"
  val `c5.24xlarge`: "c5.24xlarge" = "c5.24xlarge"
  val `c5a.large`: "c5a.large" = "c5a.large"
  val `c5a.xlarge`: "c5a.xlarge" = "c5a.xlarge"
  val `c5a.2xlarge`: "c5a.2xlarge" = "c5a.2xlarge"
  val `c5a.4xlarge`: "c5a.4xlarge" = "c5a.4xlarge"
  val `c5a.8xlarge`: "c5a.8xlarge" = "c5a.8xlarge"
  val `c5a.12xlarge`: "c5a.12xlarge" = "c5a.12xlarge"
  val `c5a.16xlarge`: "c5a.16xlarge" = "c5a.16xlarge"
  val `c5a.24xlarge`: "c5a.24xlarge" = "c5a.24xlarge"
  val `r3.large`: "r3.large" = "r3.large"
  val `r3.xlarge`: "r3.xlarge" = "r3.xlarge"
  val `r3.2xlarge`: "r3.2xlarge" = "r3.2xlarge"
  val `r3.4xlarge`: "r3.4xlarge" = "r3.4xlarge"
  val `r3.8xlarge`: "r3.8xlarge" = "r3.8xlarge"
  val `r4.large`: "r4.large" = "r4.large"
  val `r4.xlarge`: "r4.xlarge" = "r4.xlarge"
  val `r4.2xlarge`: "r4.2xlarge" = "r4.2xlarge"
  val `r4.4xlarge`: "r4.4xlarge" = "r4.4xlarge"
  val `r4.8xlarge`: "r4.8xlarge" = "r4.8xlarge"
  val `r4.16xlarge`: "r4.16xlarge" = "r4.16xlarge"
  val `r5.large`: "r5.large" = "r5.large"
  val `r5.xlarge`: "r5.xlarge" = "r5.xlarge"
  val `r5.2xlarge`: "r5.2xlarge" = "r5.2xlarge"
  val `r5.4xlarge`: "r5.4xlarge" = "r5.4xlarge"
  val `r5.8xlarge`: "r5.8xlarge" = "r5.8xlarge"
  val `r5.12xlarge`: "r5.12xlarge" = "r5.12xlarge"
  val `r5.16xlarge`: "r5.16xlarge" = "r5.16xlarge"
  val `r5.24xlarge`: "r5.24xlarge" = "r5.24xlarge"
  val `r5a.large`: "r5a.large" = "r5a.large"
  val `r5a.xlarge`: "r5a.xlarge" = "r5a.xlarge"
  val `r5a.2xlarge`: "r5a.2xlarge" = "r5a.2xlarge"
  val `r5a.4xlarge`: "r5a.4xlarge" = "r5a.4xlarge"
  val `r5a.8xlarge`: "r5a.8xlarge" = "r5a.8xlarge"
  val `r5a.12xlarge`: "r5a.12xlarge" = "r5a.12xlarge"
  val `r5a.16xlarge`: "r5a.16xlarge" = "r5a.16xlarge"
  val `r5a.24xlarge`: "r5a.24xlarge" = "r5a.24xlarge"
  val `m3.medium`: "m3.medium" = "m3.medium"
  val `m3.large`: "m3.large" = "m3.large"
  val `m3.xlarge`: "m3.xlarge" = "m3.xlarge"
  val `m3.2xlarge`: "m3.2xlarge" = "m3.2xlarge"
  val `m4.large`: "m4.large" = "m4.large"
  val `m4.xlarge`: "m4.xlarge" = "m4.xlarge"
  val `m4.2xlarge`: "m4.2xlarge" = "m4.2xlarge"
  val `m4.4xlarge`: "m4.4xlarge" = "m4.4xlarge"
  val `m4.10xlarge`: "m4.10xlarge" = "m4.10xlarge"
  val `m5.large`: "m5.large" = "m5.large"
  val `m5.xlarge`: "m5.xlarge" = "m5.xlarge"
  val `m5.2xlarge`: "m5.2xlarge" = "m5.2xlarge"
  val `m5.4xlarge`: "m5.4xlarge" = "m5.4xlarge"
  val `m5.8xlarge`: "m5.8xlarge" = "m5.8xlarge"
  val `m5.12xlarge`: "m5.12xlarge" = "m5.12xlarge"
  val `m5.16xlarge`: "m5.16xlarge" = "m5.16xlarge"
  val `m5.24xlarge`: "m5.24xlarge" = "m5.24xlarge"
  val `m5a.large`: "m5a.large" = "m5a.large"
  val `m5a.xlarge`: "m5a.xlarge" = "m5a.xlarge"
  val `m5a.2xlarge`: "m5a.2xlarge" = "m5a.2xlarge"
  val `m5a.4xlarge`: "m5a.4xlarge" = "m5a.4xlarge"
  val `m5a.8xlarge`: "m5a.8xlarge" = "m5a.8xlarge"
  val `m5a.12xlarge`: "m5a.12xlarge" = "m5a.12xlarge"
  val `m5a.16xlarge`: "m5a.16xlarge" = "m5a.16xlarge"
  val `m5a.24xlarge`: "m5a.24xlarge" = "m5a.24xlarge"

  @inline def values = js.Array[EC2InstanceType](
    `t2.micro`,
    `t2.small`,
    `t2.medium`,
    `t2.large`,
    `c3.large`,
    `c3.xlarge`,
    `c3.2xlarge`,
    `c3.4xlarge`,
    `c3.8xlarge`,
    `c4.large`,
    `c4.xlarge`,
    `c4.2xlarge`,
    `c4.4xlarge`,
    `c4.8xlarge`,
    `c5.large`,
    `c5.xlarge`,
    `c5.2xlarge`,
    `c5.4xlarge`,
    `c5.9xlarge`,
    `c5.12xlarge`,
    `c5.18xlarge`,
    `c5.24xlarge`,
    `c5a.large`,
    `c5a.xlarge`,
    `c5a.2xlarge`,
    `c5a.4xlarge`,
    `c5a.8xlarge`,
    `c5a.12xlarge`,
    `c5a.16xlarge`,
    `c5a.24xlarge`,
    `r3.large`,
    `r3.xlarge`,
    `r3.2xlarge`,
    `r3.4xlarge`,
    `r3.8xlarge`,
    `r4.large`,
    `r4.xlarge`,
    `r4.2xlarge`,
    `r4.4xlarge`,
    `r4.8xlarge`,
    `r4.16xlarge`,
    `r5.large`,
    `r5.xlarge`,
    `r5.2xlarge`,
    `r5.4xlarge`,
    `r5.8xlarge`,
    `r5.12xlarge`,
    `r5.16xlarge`,
    `r5.24xlarge`,
    `r5a.large`,
    `r5a.xlarge`,
    `r5a.2xlarge`,
    `r5a.4xlarge`,
    `r5a.8xlarge`,
    `r5a.12xlarge`,
    `r5a.16xlarge`,
    `r5a.24xlarge`,
    `m3.medium`,
    `m3.large`,
    `m3.xlarge`,
    `m3.2xlarge`,
    `m4.large`,
    `m4.xlarge`,
    `m4.2xlarge`,
    `m4.4xlarge`,
    `m4.10xlarge`,
    `m5.large`,
    `m5.xlarge`,
    `m5.2xlarge`,
    `m5.4xlarge`,
    `m5.8xlarge`,
    `m5.12xlarge`,
    `m5.16xlarge`,
    `m5.24xlarge`,
    `m5a.large`,
    `m5a.xlarge`,
    `m5a.2xlarge`,
    `m5a.4xlarge`,
    `m5a.8xlarge`,
    `m5a.12xlarge`,
    `m5a.16xlarge`,
    `m5a.24xlarge`
  )
}

type EventCode = "GENERIC_EVENT" | "FLEET_CREATED" | "FLEET_DELETED" | "FLEET_SCALING_EVENT" | "FLEET_STATE_DOWNLOADING" | "FLEET_STATE_VALIDATING" | "FLEET_STATE_BUILDING" | "FLEET_STATE_ACTIVATING" | "FLEET_STATE_ACTIVE" | "FLEET_STATE_ERROR" | "FLEET_INITIALIZATION_FAILED" | "FLEET_BINARY_DOWNLOAD_FAILED" | "FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND" | "FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE" | "FLEET_VALIDATION_TIMED_OUT" | "FLEET_ACTIVATION_FAILED" | "FLEET_ACTIVATION_FAILED_NO_INSTANCES" | "FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED" | "SERVER_PROCESS_INVALID_PATH" | "SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT" | "SERVER_PROCESS_PROCESS_READY_TIMEOUT" | "SERVER_PROCESS_CRASHED" | "SERVER_PROCESS_TERMINATED_UNHEALTHY" | "SERVER_PROCESS_FORCE_TERMINATED" | "SERVER_PROCESS_PROCESS_EXIT_TIMEOUT" | "GAME_SESSION_ACTIVATION_TIMEOUT" | "FLEET_CREATION_EXTRACTING_BUILD" | "FLEET_CREATION_RUNNING_INSTALLER" | "FLEET_CREATION_VALIDATING_RUNTIME_CONFIG" |
  "FLEET_VPC_PEERING_SUCCEEDED" | "FLEET_VPC_PEERING_FAILED" | "FLEET_VPC_PEERING_DELETED" | "INSTANCE_INTERRUPTED"
object EventCode {
  val GENERIC_EVENT: "GENERIC_EVENT" = "GENERIC_EVENT"
  val FLEET_CREATED: "FLEET_CREATED" = "FLEET_CREATED"
  val FLEET_DELETED: "FLEET_DELETED" = "FLEET_DELETED"
  val FLEET_SCALING_EVENT: "FLEET_SCALING_EVENT" = "FLEET_SCALING_EVENT"
  val FLEET_STATE_DOWNLOADING: "FLEET_STATE_DOWNLOADING" = "FLEET_STATE_DOWNLOADING"
  val FLEET_STATE_VALIDATING: "FLEET_STATE_VALIDATING" = "FLEET_STATE_VALIDATING"
  val FLEET_STATE_BUILDING: "FLEET_STATE_BUILDING" = "FLEET_STATE_BUILDING"
  val FLEET_STATE_ACTIVATING: "FLEET_STATE_ACTIVATING" = "FLEET_STATE_ACTIVATING"
  val FLEET_STATE_ACTIVE: "FLEET_STATE_ACTIVE" = "FLEET_STATE_ACTIVE"
  val FLEET_STATE_ERROR: "FLEET_STATE_ERROR" = "FLEET_STATE_ERROR"
  val FLEET_INITIALIZATION_FAILED: "FLEET_INITIALIZATION_FAILED" = "FLEET_INITIALIZATION_FAILED"
  val FLEET_BINARY_DOWNLOAD_FAILED: "FLEET_BINARY_DOWNLOAD_FAILED" = "FLEET_BINARY_DOWNLOAD_FAILED"
  val FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND: "FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND" = "FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND"
  val FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE: "FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE" = "FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE"
  val FLEET_VALIDATION_TIMED_OUT: "FLEET_VALIDATION_TIMED_OUT" = "FLEET_VALIDATION_TIMED_OUT"
  val FLEET_ACTIVATION_FAILED: "FLEET_ACTIVATION_FAILED" = "FLEET_ACTIVATION_FAILED"
  val FLEET_ACTIVATION_FAILED_NO_INSTANCES: "FLEET_ACTIVATION_FAILED_NO_INSTANCES" = "FLEET_ACTIVATION_FAILED_NO_INSTANCES"
  val FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED: "FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED" = "FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED"
  val SERVER_PROCESS_INVALID_PATH: "SERVER_PROCESS_INVALID_PATH" = "SERVER_PROCESS_INVALID_PATH"
  val SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT: "SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT" = "SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT"
  val SERVER_PROCESS_PROCESS_READY_TIMEOUT: "SERVER_PROCESS_PROCESS_READY_TIMEOUT" = "SERVER_PROCESS_PROCESS_READY_TIMEOUT"
  val SERVER_PROCESS_CRASHED: "SERVER_PROCESS_CRASHED" = "SERVER_PROCESS_CRASHED"
  val SERVER_PROCESS_TERMINATED_UNHEALTHY: "SERVER_PROCESS_TERMINATED_UNHEALTHY" = "SERVER_PROCESS_TERMINATED_UNHEALTHY"
  val SERVER_PROCESS_FORCE_TERMINATED: "SERVER_PROCESS_FORCE_TERMINATED" = "SERVER_PROCESS_FORCE_TERMINATED"
  val SERVER_PROCESS_PROCESS_EXIT_TIMEOUT: "SERVER_PROCESS_PROCESS_EXIT_TIMEOUT" = "SERVER_PROCESS_PROCESS_EXIT_TIMEOUT"
  val GAME_SESSION_ACTIVATION_TIMEOUT: "GAME_SESSION_ACTIVATION_TIMEOUT" = "GAME_SESSION_ACTIVATION_TIMEOUT"
  val FLEET_CREATION_EXTRACTING_BUILD: "FLEET_CREATION_EXTRACTING_BUILD" = "FLEET_CREATION_EXTRACTING_BUILD"
  val FLEET_CREATION_RUNNING_INSTALLER: "FLEET_CREATION_RUNNING_INSTALLER" = "FLEET_CREATION_RUNNING_INSTALLER"
  val FLEET_CREATION_VALIDATING_RUNTIME_CONFIG: "FLEET_CREATION_VALIDATING_RUNTIME_CONFIG" = "FLEET_CREATION_VALIDATING_RUNTIME_CONFIG"
  val FLEET_VPC_PEERING_SUCCEEDED: "FLEET_VPC_PEERING_SUCCEEDED" = "FLEET_VPC_PEERING_SUCCEEDED"
  val FLEET_VPC_PEERING_FAILED: "FLEET_VPC_PEERING_FAILED" = "FLEET_VPC_PEERING_FAILED"
  val FLEET_VPC_PEERING_DELETED: "FLEET_VPC_PEERING_DELETED" = "FLEET_VPC_PEERING_DELETED"
  val INSTANCE_INTERRUPTED: "INSTANCE_INTERRUPTED" = "INSTANCE_INTERRUPTED"

  @inline def values = js.Array[EventCode](
    GENERIC_EVENT,
    FLEET_CREATED,
    FLEET_DELETED,
    FLEET_SCALING_EVENT,
    FLEET_STATE_DOWNLOADING,
    FLEET_STATE_VALIDATING,
    FLEET_STATE_BUILDING,
    FLEET_STATE_ACTIVATING,
    FLEET_STATE_ACTIVE,
    FLEET_STATE_ERROR,
    FLEET_INITIALIZATION_FAILED,
    FLEET_BINARY_DOWNLOAD_FAILED,
    FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND,
    FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE,
    FLEET_VALIDATION_TIMED_OUT,
    FLEET_ACTIVATION_FAILED,
    FLEET_ACTIVATION_FAILED_NO_INSTANCES,
    FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED,
    SERVER_PROCESS_INVALID_PATH,
    SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT,
    SERVER_PROCESS_PROCESS_READY_TIMEOUT,
    SERVER_PROCESS_CRASHED,
    SERVER_PROCESS_TERMINATED_UNHEALTHY,
    SERVER_PROCESS_FORCE_TERMINATED,
    SERVER_PROCESS_PROCESS_EXIT_TIMEOUT,
    GAME_SESSION_ACTIVATION_TIMEOUT,
    FLEET_CREATION_EXTRACTING_BUILD,
    FLEET_CREATION_RUNNING_INSTALLER,
    FLEET_CREATION_VALIDATING_RUNTIME_CONFIG,
    FLEET_VPC_PEERING_SUCCEEDED,
    FLEET_VPC_PEERING_FAILED,
    FLEET_VPC_PEERING_DELETED,
    INSTANCE_INTERRUPTED
  )
}

type FleetAction = "AUTO_SCALING"
object FleetAction {
  val AUTO_SCALING: "AUTO_SCALING" = "AUTO_SCALING"

  @inline def values = js.Array[FleetAction](AUTO_SCALING)
}

type FleetStatus = "NEW" | "DOWNLOADING" | "VALIDATING" | "BUILDING" | "ACTIVATING" | "ACTIVE" | "DELETING" | "ERROR" | "TERMINATED"
object FleetStatus {
  val NEW: "NEW" = "NEW"
  val DOWNLOADING: "DOWNLOADING" = "DOWNLOADING"
  val VALIDATING: "VALIDATING" = "VALIDATING"
  val BUILDING: "BUILDING" = "BUILDING"
  val ACTIVATING: "ACTIVATING" = "ACTIVATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"
  val ERROR: "ERROR" = "ERROR"
  val TERMINATED: "TERMINATED" = "TERMINATED"

  @inline def values = js.Array[FleetStatus](NEW, DOWNLOADING, VALIDATING, BUILDING, ACTIVATING, ACTIVE, DELETING, ERROR, TERMINATED)
}

type FleetType = "ON_DEMAND" | "SPOT"
object FleetType {
  val ON_DEMAND: "ON_DEMAND" = "ON_DEMAND"
  val SPOT: "SPOT" = "SPOT"

  @inline def values = js.Array[FleetType](ON_DEMAND, SPOT)
}

type FlexMatchMode = "STANDALONE" | "WITH_QUEUE"
object FlexMatchMode {
  val STANDALONE: "STANDALONE" = "STANDALONE"
  val WITH_QUEUE: "WITH_QUEUE" = "WITH_QUEUE"

  @inline def values = js.Array[FlexMatchMode](STANDALONE, WITH_QUEUE)
}

type GameServerClaimStatus = "CLAIMED"
object GameServerClaimStatus {
  val CLAIMED: "CLAIMED" = "CLAIMED"

  @inline def values = js.Array[GameServerClaimStatus](CLAIMED)
}

type GameServerGroupAction = "REPLACE_INSTANCE_TYPES"
object GameServerGroupAction {
  val REPLACE_INSTANCE_TYPES: "REPLACE_INSTANCE_TYPES" = "REPLACE_INSTANCE_TYPES"

  @inline def values = js.Array[GameServerGroupAction](REPLACE_INSTANCE_TYPES)
}

type GameServerGroupDeleteOption = "SAFE_DELETE" | "FORCE_DELETE" | "RETAIN"
object GameServerGroupDeleteOption {
  val SAFE_DELETE: "SAFE_DELETE" = "SAFE_DELETE"
  val FORCE_DELETE: "FORCE_DELETE" = "FORCE_DELETE"
  val RETAIN: "RETAIN" = "RETAIN"

  @inline def values = js.Array[GameServerGroupDeleteOption](SAFE_DELETE, FORCE_DELETE, RETAIN)
}

type GameServerGroupInstanceType =
  "c4.large" | "c4.xlarge" | "c4.2xlarge" | "c4.4xlarge" | "c4.8xlarge" | "c5.large" | "c5.xlarge" | "c5.2xlarge" | "c5.4xlarge" | "c5.9xlarge" | "c5.12xlarge" | "c5.18xlarge" | "c5.24xlarge" | "c5a.large" | "c5a.xlarge" | "c5a.2xlarge" | "c5a.4xlarge" | "c5a.8xlarge" | "c5a.12xlarge" | "c5a.16xlarge" | "c5a.24xlarge" | "r4.large" | "r4.xlarge" | "r4.2xlarge" | "r4.4xlarge" | "r4.8xlarge" | "r4.16xlarge" | "r5.large" | "r5.xlarge" | "r5.2xlarge" | "r5.4xlarge" | "r5.8xlarge" | "r5.12xlarge" | "r5.16xlarge" | "r5.24xlarge" | "r5a.large" | "r5a.xlarge" | "r5a.2xlarge" | "r5a.4xlarge" | "r5a.8xlarge" | "r5a.12xlarge" | "r5a.16xlarge" | "r5a.24xlarge" | "m4.large" | "m4.xlarge" | "m4.2xlarge" | "m4.4xlarge" | "m4.10xlarge" | "m5.large" | "m5.xlarge" | "m5.2xlarge" | "m5.4xlarge" | "m5.8xlarge" | "m5.12xlarge" | "m5.16xlarge" | "m5.24xlarge" | "m5a.large" | "m5a.xlarge" | "m5a.2xlarge" | "m5a.4xlarge" | "m5a.8xlarge" | "m5a.12xlarge" | "m5a.16xlarge" | "m5a.24xlarge"
object GameServerGroupInstanceType {
  val `c4.large`: "c4.large" = "c4.large"
  val `c4.xlarge`: "c4.xlarge" = "c4.xlarge"
  val `c4.2xlarge`: "c4.2xlarge" = "c4.2xlarge"
  val `c4.4xlarge`: "c4.4xlarge" = "c4.4xlarge"
  val `c4.8xlarge`: "c4.8xlarge" = "c4.8xlarge"
  val `c5.large`: "c5.large" = "c5.large"
  val `c5.xlarge`: "c5.xlarge" = "c5.xlarge"
  val `c5.2xlarge`: "c5.2xlarge" = "c5.2xlarge"
  val `c5.4xlarge`: "c5.4xlarge" = "c5.4xlarge"
  val `c5.9xlarge`: "c5.9xlarge" = "c5.9xlarge"
  val `c5.12xlarge`: "c5.12xlarge" = "c5.12xlarge"
  val `c5.18xlarge`: "c5.18xlarge" = "c5.18xlarge"
  val `c5.24xlarge`: "c5.24xlarge" = "c5.24xlarge"
  val `c5a.large`: "c5a.large" = "c5a.large"
  val `c5a.xlarge`: "c5a.xlarge" = "c5a.xlarge"
  val `c5a.2xlarge`: "c5a.2xlarge" = "c5a.2xlarge"
  val `c5a.4xlarge`: "c5a.4xlarge" = "c5a.4xlarge"
  val `c5a.8xlarge`: "c5a.8xlarge" = "c5a.8xlarge"
  val `c5a.12xlarge`: "c5a.12xlarge" = "c5a.12xlarge"
  val `c5a.16xlarge`: "c5a.16xlarge" = "c5a.16xlarge"
  val `c5a.24xlarge`: "c5a.24xlarge" = "c5a.24xlarge"
  val `r4.large`: "r4.large" = "r4.large"
  val `r4.xlarge`: "r4.xlarge" = "r4.xlarge"
  val `r4.2xlarge`: "r4.2xlarge" = "r4.2xlarge"
  val `r4.4xlarge`: "r4.4xlarge" = "r4.4xlarge"
  val `r4.8xlarge`: "r4.8xlarge" = "r4.8xlarge"
  val `r4.16xlarge`: "r4.16xlarge" = "r4.16xlarge"
  val `r5.large`: "r5.large" = "r5.large"
  val `r5.xlarge`: "r5.xlarge" = "r5.xlarge"
  val `r5.2xlarge`: "r5.2xlarge" = "r5.2xlarge"
  val `r5.4xlarge`: "r5.4xlarge" = "r5.4xlarge"
  val `r5.8xlarge`: "r5.8xlarge" = "r5.8xlarge"
  val `r5.12xlarge`: "r5.12xlarge" = "r5.12xlarge"
  val `r5.16xlarge`: "r5.16xlarge" = "r5.16xlarge"
  val `r5.24xlarge`: "r5.24xlarge" = "r5.24xlarge"
  val `r5a.large`: "r5a.large" = "r5a.large"
  val `r5a.xlarge`: "r5a.xlarge" = "r5a.xlarge"
  val `r5a.2xlarge`: "r5a.2xlarge" = "r5a.2xlarge"
  val `r5a.4xlarge`: "r5a.4xlarge" = "r5a.4xlarge"
  val `r5a.8xlarge`: "r5a.8xlarge" = "r5a.8xlarge"
  val `r5a.12xlarge`: "r5a.12xlarge" = "r5a.12xlarge"
  val `r5a.16xlarge`: "r5a.16xlarge" = "r5a.16xlarge"
  val `r5a.24xlarge`: "r5a.24xlarge" = "r5a.24xlarge"
  val `m4.large`: "m4.large" = "m4.large"
  val `m4.xlarge`: "m4.xlarge" = "m4.xlarge"
  val `m4.2xlarge`: "m4.2xlarge" = "m4.2xlarge"
  val `m4.4xlarge`: "m4.4xlarge" = "m4.4xlarge"
  val `m4.10xlarge`: "m4.10xlarge" = "m4.10xlarge"
  val `m5.large`: "m5.large" = "m5.large"
  val `m5.xlarge`: "m5.xlarge" = "m5.xlarge"
  val `m5.2xlarge`: "m5.2xlarge" = "m5.2xlarge"
  val `m5.4xlarge`: "m5.4xlarge" = "m5.4xlarge"
  val `m5.8xlarge`: "m5.8xlarge" = "m5.8xlarge"
  val `m5.12xlarge`: "m5.12xlarge" = "m5.12xlarge"
  val `m5.16xlarge`: "m5.16xlarge" = "m5.16xlarge"
  val `m5.24xlarge`: "m5.24xlarge" = "m5.24xlarge"
  val `m5a.large`: "m5a.large" = "m5a.large"
  val `m5a.xlarge`: "m5a.xlarge" = "m5a.xlarge"
  val `m5a.2xlarge`: "m5a.2xlarge" = "m5a.2xlarge"
  val `m5a.4xlarge`: "m5a.4xlarge" = "m5a.4xlarge"
  val `m5a.8xlarge`: "m5a.8xlarge" = "m5a.8xlarge"
  val `m5a.12xlarge`: "m5a.12xlarge" = "m5a.12xlarge"
  val `m5a.16xlarge`: "m5a.16xlarge" = "m5a.16xlarge"
  val `m5a.24xlarge`: "m5a.24xlarge" = "m5a.24xlarge"

  @inline def values = js.Array[GameServerGroupInstanceType](
    `c4.large`,
    `c4.xlarge`,
    `c4.2xlarge`,
    `c4.4xlarge`,
    `c4.8xlarge`,
    `c5.large`,
    `c5.xlarge`,
    `c5.2xlarge`,
    `c5.4xlarge`,
    `c5.9xlarge`,
    `c5.12xlarge`,
    `c5.18xlarge`,
    `c5.24xlarge`,
    `c5a.large`,
    `c5a.xlarge`,
    `c5a.2xlarge`,
    `c5a.4xlarge`,
    `c5a.8xlarge`,
    `c5a.12xlarge`,
    `c5a.16xlarge`,
    `c5a.24xlarge`,
    `r4.large`,
    `r4.xlarge`,
    `r4.2xlarge`,
    `r4.4xlarge`,
    `r4.8xlarge`,
    `r4.16xlarge`,
    `r5.large`,
    `r5.xlarge`,
    `r5.2xlarge`,
    `r5.4xlarge`,
    `r5.8xlarge`,
    `r5.12xlarge`,
    `r5.16xlarge`,
    `r5.24xlarge`,
    `r5a.large`,
    `r5a.xlarge`,
    `r5a.2xlarge`,
    `r5a.4xlarge`,
    `r5a.8xlarge`,
    `r5a.12xlarge`,
    `r5a.16xlarge`,
    `r5a.24xlarge`,
    `m4.large`,
    `m4.xlarge`,
    `m4.2xlarge`,
    `m4.4xlarge`,
    `m4.10xlarge`,
    `m5.large`,
    `m5.xlarge`,
    `m5.2xlarge`,
    `m5.4xlarge`,
    `m5.8xlarge`,
    `m5.12xlarge`,
    `m5.16xlarge`,
    `m5.24xlarge`,
    `m5a.large`,
    `m5a.xlarge`,
    `m5a.2xlarge`,
    `m5a.4xlarge`,
    `m5a.8xlarge`,
    `m5a.12xlarge`,
    `m5a.16xlarge`,
    `m5a.24xlarge`
  )
}

type GameServerGroupStatus = "NEW" | "ACTIVATING" | "ACTIVE" | "DELETE_SCHEDULED" | "DELETING" | "DELETED" | "ERROR"
object GameServerGroupStatus {
  val NEW: "NEW" = "NEW"
  val ACTIVATING: "ACTIVATING" = "ACTIVATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETE_SCHEDULED: "DELETE_SCHEDULED" = "DELETE_SCHEDULED"
  val DELETING: "DELETING" = "DELETING"
  val DELETED: "DELETED" = "DELETED"
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[GameServerGroupStatus](NEW, ACTIVATING, ACTIVE, DELETE_SCHEDULED, DELETING, DELETED, ERROR)
}

type GameServerHealthCheck = "HEALTHY"
object GameServerHealthCheck {
  val HEALTHY: "HEALTHY" = "HEALTHY"

  @inline def values = js.Array[GameServerHealthCheck](HEALTHY)
}

type GameServerInstanceStatus = "ACTIVE" | "DRAINING" | "SPOT_TERMINATING"
object GameServerInstanceStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DRAINING: "DRAINING" = "DRAINING"
  val SPOT_TERMINATING: "SPOT_TERMINATING" = "SPOT_TERMINATING"

  @inline def values = js.Array[GameServerInstanceStatus](ACTIVE, DRAINING, SPOT_TERMINATING)
}

type GameServerProtectionPolicy = "NO_PROTECTION" | "FULL_PROTECTION"
object GameServerProtectionPolicy {
  val NO_PROTECTION: "NO_PROTECTION" = "NO_PROTECTION"
  val FULL_PROTECTION: "FULL_PROTECTION" = "FULL_PROTECTION"

  @inline def values = js.Array[GameServerProtectionPolicy](NO_PROTECTION, FULL_PROTECTION)
}

type GameServerUtilizationStatus = "AVAILABLE" | "UTILIZED"
object GameServerUtilizationStatus {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val UTILIZED: "UTILIZED" = "UTILIZED"

  @inline def values = js.Array[GameServerUtilizationStatus](AVAILABLE, UTILIZED)
}

type GameSessionPlacementState = "PENDING" | "FULFILLED" | "CANCELLED" | "TIMED_OUT" | "FAILED"
object GameSessionPlacementState {
  val PENDING: "PENDING" = "PENDING"
  val FULFILLED: "FULFILLED" = "FULFILLED"
  val CANCELLED: "CANCELLED" = "CANCELLED"
  val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[GameSessionPlacementState](PENDING, FULFILLED, CANCELLED, TIMED_OUT, FAILED)
}

type GameSessionStatus = "ACTIVE" | "ACTIVATING" | "TERMINATED" | "TERMINATING" | "ERROR"
object GameSessionStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val ACTIVATING: "ACTIVATING" = "ACTIVATING"
  val TERMINATED: "TERMINATED" = "TERMINATED"
  val TERMINATING: "TERMINATING" = "TERMINATING"
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[GameSessionStatus](ACTIVE, ACTIVATING, TERMINATED, TERMINATING, ERROR)
}

type GameSessionStatusReason = "INTERRUPTED"
object GameSessionStatusReason {
  val INTERRUPTED: "INTERRUPTED" = "INTERRUPTED"

  @inline def values = js.Array[GameSessionStatusReason](INTERRUPTED)
}

type InstanceStatus = "PENDING" | "ACTIVE" | "TERMINATING"
object InstanceStatus {
  val PENDING: "PENDING" = "PENDING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val TERMINATING: "TERMINATING" = "TERMINATING"

  @inline def values = js.Array[InstanceStatus](PENDING, ACTIVE, TERMINATING)
}

type IpProtocol = "TCP" | "UDP"
object IpProtocol {
  val TCP: "TCP" = "TCP"
  val UDP: "UDP" = "UDP"

  @inline def values = js.Array[IpProtocol](TCP, UDP)
}

type LocationUpdateStatus = "PENDING_UPDATE"
object LocationUpdateStatus {
  val PENDING_UPDATE: "PENDING_UPDATE" = "PENDING_UPDATE"

  @inline def values = js.Array[LocationUpdateStatus](PENDING_UPDATE)
}

type MatchmakingConfigurationStatus = "CANCELLED" | "COMPLETED" | "FAILED" | "PLACING" | "QUEUED" | "REQUIRES_ACCEPTANCE" | "SEARCHING" | "TIMED_OUT"
object MatchmakingConfigurationStatus {
  val CANCELLED: "CANCELLED" = "CANCELLED"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"
  val PLACING: "PLACING" = "PLACING"
  val QUEUED: "QUEUED" = "QUEUED"
  val REQUIRES_ACCEPTANCE: "REQUIRES_ACCEPTANCE" = "REQUIRES_ACCEPTANCE"
  val SEARCHING: "SEARCHING" = "SEARCHING"
  val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"

  @inline def values = js.Array[MatchmakingConfigurationStatus](CANCELLED, COMPLETED, FAILED, PLACING, QUEUED, REQUIRES_ACCEPTANCE, SEARCHING, TIMED_OUT)
}

type MetricName = "ActivatingGameSessions" | "ActiveGameSessions" | "ActiveInstances" | "AvailableGameSessions" | "AvailablePlayerSessions" | "CurrentPlayerSessions" | "IdleInstances" | "PercentAvailableGameSessions" | "PercentIdleInstances" | "QueueDepth" | "WaitTime"
object MetricName {
  val ActivatingGameSessions: "ActivatingGameSessions" = "ActivatingGameSessions"
  val ActiveGameSessions: "ActiveGameSessions" = "ActiveGameSessions"
  val ActiveInstances: "ActiveInstances" = "ActiveInstances"
  val AvailableGameSessions: "AvailableGameSessions" = "AvailableGameSessions"
  val AvailablePlayerSessions: "AvailablePlayerSessions" = "AvailablePlayerSessions"
  val CurrentPlayerSessions: "CurrentPlayerSessions" = "CurrentPlayerSessions"
  val IdleInstances: "IdleInstances" = "IdleInstances"
  val PercentAvailableGameSessions: "PercentAvailableGameSessions" = "PercentAvailableGameSessions"
  val PercentIdleInstances: "PercentIdleInstances" = "PercentIdleInstances"
  val QueueDepth: "QueueDepth" = "QueueDepth"
  val WaitTime: "WaitTime" = "WaitTime"

  @inline def values = js.Array[MetricName](
    ActivatingGameSessions,
    ActiveGameSessions,
    ActiveInstances,
    AvailableGameSessions,
    AvailablePlayerSessions,
    CurrentPlayerSessions,
    IdleInstances,
    PercentAvailableGameSessions,
    PercentIdleInstances,
    QueueDepth,
    WaitTime
  )
}

type OperatingSystem = "WINDOWS_2012" | "AMAZON_LINUX" | "AMAZON_LINUX_2"
object OperatingSystem {
  val WINDOWS_2012: "WINDOWS_2012" = "WINDOWS_2012"
  val AMAZON_LINUX: "AMAZON_LINUX" = "AMAZON_LINUX"
  val AMAZON_LINUX_2: "AMAZON_LINUX_2" = "AMAZON_LINUX_2"

  @inline def values = js.Array[OperatingSystem](WINDOWS_2012, AMAZON_LINUX, AMAZON_LINUX_2)
}

type PlayerSessionCreationPolicy = "ACCEPT_ALL" | "DENY_ALL"
object PlayerSessionCreationPolicy {
  val ACCEPT_ALL: "ACCEPT_ALL" = "ACCEPT_ALL"
  val DENY_ALL: "DENY_ALL" = "DENY_ALL"

  @inline def values = js.Array[PlayerSessionCreationPolicy](ACCEPT_ALL, DENY_ALL)
}

type PlayerSessionStatus = "RESERVED" | "ACTIVE" | "COMPLETED" | "TIMEDOUT"
object PlayerSessionStatus {
  val RESERVED: "RESERVED" = "RESERVED"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val TIMEDOUT: "TIMEDOUT" = "TIMEDOUT"

  @inline def values = js.Array[PlayerSessionStatus](RESERVED, ACTIVE, COMPLETED, TIMEDOUT)
}

type PolicyType = "RuleBased" | "TargetBased"
object PolicyType {
  val RuleBased: "RuleBased" = "RuleBased"
  val TargetBased: "TargetBased" = "TargetBased"

  @inline def values = js.Array[PolicyType](RuleBased, TargetBased)
}

type PriorityType = "LATENCY" | "COST" | "DESTINATION" | "LOCATION"
object PriorityType {
  val LATENCY: "LATENCY" = "LATENCY"
  val COST: "COST" = "COST"
  val DESTINATION: "DESTINATION" = "DESTINATION"
  val LOCATION: "LOCATION" = "LOCATION"

  @inline def values = js.Array[PriorityType](LATENCY, COST, DESTINATION, LOCATION)
}

type ProtectionPolicy = "NoProtection" | "FullProtection"
object ProtectionPolicy {
  val NoProtection: "NoProtection" = "NoProtection"
  val FullProtection: "FullProtection" = "FullProtection"

  @inline def values = js.Array[ProtectionPolicy](NoProtection, FullProtection)
}

type RoutingStrategyType = "SIMPLE" | "TERMINAL"
object RoutingStrategyType {
  val SIMPLE: "SIMPLE" = "SIMPLE"
  val TERMINAL: "TERMINAL" = "TERMINAL"

  @inline def values = js.Array[RoutingStrategyType](SIMPLE, TERMINAL)
}

type ScalingAdjustmentType = "ChangeInCapacity" | "ExactCapacity" | "PercentChangeInCapacity"
object ScalingAdjustmentType {
  val ChangeInCapacity: "ChangeInCapacity" = "ChangeInCapacity"
  val ExactCapacity: "ExactCapacity" = "ExactCapacity"
  val PercentChangeInCapacity: "PercentChangeInCapacity" = "PercentChangeInCapacity"

  @inline def values = js.Array[ScalingAdjustmentType](ChangeInCapacity, ExactCapacity, PercentChangeInCapacity)
}

type ScalingStatusType = "ACTIVE" | "UPDATE_REQUESTED" | "UPDATING" | "DELETE_REQUESTED" | "DELETING" | "DELETED" | "ERROR"
object ScalingStatusType {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val UPDATE_REQUESTED: "UPDATE_REQUESTED" = "UPDATE_REQUESTED"
  val UPDATING: "UPDATING" = "UPDATING"
  val DELETE_REQUESTED: "DELETE_REQUESTED" = "DELETE_REQUESTED"
  val DELETING: "DELETING" = "DELETING"
  val DELETED: "DELETED" = "DELETED"
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[ScalingStatusType](ACTIVE, UPDATE_REQUESTED, UPDATING, DELETE_REQUESTED, DELETING, DELETED, ERROR)
}

type SortOrder = "ASCENDING" | "DESCENDING"
object SortOrder {
  val ASCENDING: "ASCENDING" = "ASCENDING"
  val DESCENDING: "DESCENDING" = "DESCENDING"

  @inline def values = js.Array[SortOrder](ASCENDING, DESCENDING)
}
