package facade.amazonaws.services.gamelift

import scalajs.js

type AcceptanceType = "ACCEPT" | "REJECT"
object AcceptanceType {
  inline val ACCEPT: "ACCEPT" = "ACCEPT"
  inline val REJECT: "REJECT" = "REJECT"

  inline def values: js.Array[AcceptanceType] = js.Array(ACCEPT, REJECT)
}

type BackfillMode = "AUTOMATIC" | "MANUAL"
object BackfillMode {
  inline val AUTOMATIC: "AUTOMATIC" = "AUTOMATIC"
  inline val MANUAL: "MANUAL" = "MANUAL"

  inline def values: js.Array[BackfillMode] = js.Array(AUTOMATIC, MANUAL)
}

type BalancingStrategy = "SPOT_ONLY" | "SPOT_PREFERRED" | "ON_DEMAND_ONLY"
object BalancingStrategy {
  inline val SPOT_ONLY: "SPOT_ONLY" = "SPOT_ONLY"
  inline val SPOT_PREFERRED: "SPOT_PREFERRED" = "SPOT_PREFERRED"
  inline val ON_DEMAND_ONLY: "ON_DEMAND_ONLY" = "ON_DEMAND_ONLY"

  inline def values: js.Array[BalancingStrategy] = js.Array(SPOT_ONLY, SPOT_PREFERRED, ON_DEMAND_ONLY)
}

type BuildStatus = "INITIALIZED" | "READY" | "FAILED"
object BuildStatus {
  inline val INITIALIZED: "INITIALIZED" = "INITIALIZED"
  inline val READY: "READY" = "READY"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[BuildStatus] = js.Array(INITIALIZED, READY, FAILED)
}

type CertificateType = "DISABLED" | "GENERATED"
object CertificateType {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val GENERATED: "GENERATED" = "GENERATED"

  inline def values: js.Array[CertificateType] = js.Array(DISABLED, GENERATED)
}

type ComparisonOperatorType = "GreaterThanOrEqualToThreshold" | "GreaterThanThreshold" | "LessThanThreshold" | "LessThanOrEqualToThreshold"
object ComparisonOperatorType {
  inline val GreaterThanOrEqualToThreshold: "GreaterThanOrEqualToThreshold" = "GreaterThanOrEqualToThreshold"
  inline val GreaterThanThreshold: "GreaterThanThreshold" = "GreaterThanThreshold"
  inline val LessThanThreshold: "LessThanThreshold" = "LessThanThreshold"
  inline val LessThanOrEqualToThreshold: "LessThanOrEqualToThreshold" = "LessThanOrEqualToThreshold"

  inline def values: js.Array[ComparisonOperatorType] = js.Array(GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold)
}

type EC2InstanceType = "t2.micro" | "t2.small" | "t2.medium" | "t2.large" | "c3.large" | "c3.xlarge" | "c3.2xlarge" | "c3.4xlarge" | "c3.8xlarge" | "c4.large" | "c4.xlarge" | "c4.2xlarge" | "c4.4xlarge" | "c4.8xlarge" | "c5.large" | "c5.xlarge" | "c5.2xlarge" | "c5.4xlarge" | "c5.9xlarge" | "c5.12xlarge" | "c5.18xlarge" | "c5.24xlarge" | "c5a.large" | "c5a.xlarge" | "c5a.2xlarge" | "c5a.4xlarge" | "c5a.8xlarge" | "c5a.12xlarge" | "c5a.16xlarge" | "c5a.24xlarge" | "r3.large" | "r3.xlarge" | "r3.2xlarge" | "r3.4xlarge" | "r3.8xlarge" | "r4.large" | "r4.xlarge" | "r4.2xlarge" | "r4.4xlarge" | "r4.8xlarge" | "r4.16xlarge" | "r5.large" | "r5.xlarge" | "r5.2xlarge" | "r5.4xlarge" | "r5.8xlarge" | "r5.12xlarge" | "r5.16xlarge" | "r5.24xlarge" | "r5a.large" | "r5a.xlarge" | "r5a.2xlarge" | "r5a.4xlarge" | "r5a.8xlarge" | "r5a.12xlarge" | "r5a.16xlarge" | "r5a.24xlarge" | "m3.medium" | "m3.large" | "m3.xlarge" | "m3.2xlarge" | "m4.large" | "m4.xlarge" | "m4.2xlarge" | "m4.4xlarge" |
  "m4.10xlarge" | "m5.large" | "m5.xlarge" | "m5.2xlarge" | "m5.4xlarge" | "m5.8xlarge" | "m5.12xlarge" | "m5.16xlarge" | "m5.24xlarge" | "m5a.large" | "m5a.xlarge" | "m5a.2xlarge" | "m5a.4xlarge" | "m5a.8xlarge" | "m5a.12xlarge" | "m5a.16xlarge" | "m5a.24xlarge"
object EC2InstanceType {
  inline val `t2.micro`: "t2.micro" = "t2.micro"
  inline val `t2.small`: "t2.small" = "t2.small"
  inline val `t2.medium`: "t2.medium" = "t2.medium"
  inline val `t2.large`: "t2.large" = "t2.large"
  inline val `c3.large`: "c3.large" = "c3.large"
  inline val `c3.xlarge`: "c3.xlarge" = "c3.xlarge"
  inline val `c3.2xlarge`: "c3.2xlarge" = "c3.2xlarge"
  inline val `c3.4xlarge`: "c3.4xlarge" = "c3.4xlarge"
  inline val `c3.8xlarge`: "c3.8xlarge" = "c3.8xlarge"
  inline val `c4.large`: "c4.large" = "c4.large"
  inline val `c4.xlarge`: "c4.xlarge" = "c4.xlarge"
  inline val `c4.2xlarge`: "c4.2xlarge" = "c4.2xlarge"
  inline val `c4.4xlarge`: "c4.4xlarge" = "c4.4xlarge"
  inline val `c4.8xlarge`: "c4.8xlarge" = "c4.8xlarge"
  inline val `c5.large`: "c5.large" = "c5.large"
  inline val `c5.xlarge`: "c5.xlarge" = "c5.xlarge"
  inline val `c5.2xlarge`: "c5.2xlarge" = "c5.2xlarge"
  inline val `c5.4xlarge`: "c5.4xlarge" = "c5.4xlarge"
  inline val `c5.9xlarge`: "c5.9xlarge" = "c5.9xlarge"
  inline val `c5.12xlarge`: "c5.12xlarge" = "c5.12xlarge"
  inline val `c5.18xlarge`: "c5.18xlarge" = "c5.18xlarge"
  inline val `c5.24xlarge`: "c5.24xlarge" = "c5.24xlarge"
  inline val `c5a.large`: "c5a.large" = "c5a.large"
  inline val `c5a.xlarge`: "c5a.xlarge" = "c5a.xlarge"
  inline val `c5a.2xlarge`: "c5a.2xlarge" = "c5a.2xlarge"
  inline val `c5a.4xlarge`: "c5a.4xlarge" = "c5a.4xlarge"
  inline val `c5a.8xlarge`: "c5a.8xlarge" = "c5a.8xlarge"
  inline val `c5a.12xlarge`: "c5a.12xlarge" = "c5a.12xlarge"
  inline val `c5a.16xlarge`: "c5a.16xlarge" = "c5a.16xlarge"
  inline val `c5a.24xlarge`: "c5a.24xlarge" = "c5a.24xlarge"
  inline val `r3.large`: "r3.large" = "r3.large"
  inline val `r3.xlarge`: "r3.xlarge" = "r3.xlarge"
  inline val `r3.2xlarge`: "r3.2xlarge" = "r3.2xlarge"
  inline val `r3.4xlarge`: "r3.4xlarge" = "r3.4xlarge"
  inline val `r3.8xlarge`: "r3.8xlarge" = "r3.8xlarge"
  inline val `r4.large`: "r4.large" = "r4.large"
  inline val `r4.xlarge`: "r4.xlarge" = "r4.xlarge"
  inline val `r4.2xlarge`: "r4.2xlarge" = "r4.2xlarge"
  inline val `r4.4xlarge`: "r4.4xlarge" = "r4.4xlarge"
  inline val `r4.8xlarge`: "r4.8xlarge" = "r4.8xlarge"
  inline val `r4.16xlarge`: "r4.16xlarge" = "r4.16xlarge"
  inline val `r5.large`: "r5.large" = "r5.large"
  inline val `r5.xlarge`: "r5.xlarge" = "r5.xlarge"
  inline val `r5.2xlarge`: "r5.2xlarge" = "r5.2xlarge"
  inline val `r5.4xlarge`: "r5.4xlarge" = "r5.4xlarge"
  inline val `r5.8xlarge`: "r5.8xlarge" = "r5.8xlarge"
  inline val `r5.12xlarge`: "r5.12xlarge" = "r5.12xlarge"
  inline val `r5.16xlarge`: "r5.16xlarge" = "r5.16xlarge"
  inline val `r5.24xlarge`: "r5.24xlarge" = "r5.24xlarge"
  inline val `r5a.large`: "r5a.large" = "r5a.large"
  inline val `r5a.xlarge`: "r5a.xlarge" = "r5a.xlarge"
  inline val `r5a.2xlarge`: "r5a.2xlarge" = "r5a.2xlarge"
  inline val `r5a.4xlarge`: "r5a.4xlarge" = "r5a.4xlarge"
  inline val `r5a.8xlarge`: "r5a.8xlarge" = "r5a.8xlarge"
  inline val `r5a.12xlarge`: "r5a.12xlarge" = "r5a.12xlarge"
  inline val `r5a.16xlarge`: "r5a.16xlarge" = "r5a.16xlarge"
  inline val `r5a.24xlarge`: "r5a.24xlarge" = "r5a.24xlarge"
  inline val `m3.medium`: "m3.medium" = "m3.medium"
  inline val `m3.large`: "m3.large" = "m3.large"
  inline val `m3.xlarge`: "m3.xlarge" = "m3.xlarge"
  inline val `m3.2xlarge`: "m3.2xlarge" = "m3.2xlarge"
  inline val `m4.large`: "m4.large" = "m4.large"
  inline val `m4.xlarge`: "m4.xlarge" = "m4.xlarge"
  inline val `m4.2xlarge`: "m4.2xlarge" = "m4.2xlarge"
  inline val `m4.4xlarge`: "m4.4xlarge" = "m4.4xlarge"
  inline val `m4.10xlarge`: "m4.10xlarge" = "m4.10xlarge"
  inline val `m5.large`: "m5.large" = "m5.large"
  inline val `m5.xlarge`: "m5.xlarge" = "m5.xlarge"
  inline val `m5.2xlarge`: "m5.2xlarge" = "m5.2xlarge"
  inline val `m5.4xlarge`: "m5.4xlarge" = "m5.4xlarge"
  inline val `m5.8xlarge`: "m5.8xlarge" = "m5.8xlarge"
  inline val `m5.12xlarge`: "m5.12xlarge" = "m5.12xlarge"
  inline val `m5.16xlarge`: "m5.16xlarge" = "m5.16xlarge"
  inline val `m5.24xlarge`: "m5.24xlarge" = "m5.24xlarge"
  inline val `m5a.large`: "m5a.large" = "m5a.large"
  inline val `m5a.xlarge`: "m5a.xlarge" = "m5a.xlarge"
  inline val `m5a.2xlarge`: "m5a.2xlarge" = "m5a.2xlarge"
  inline val `m5a.4xlarge`: "m5a.4xlarge" = "m5a.4xlarge"
  inline val `m5a.8xlarge`: "m5a.8xlarge" = "m5a.8xlarge"
  inline val `m5a.12xlarge`: "m5a.12xlarge" = "m5a.12xlarge"
  inline val `m5a.16xlarge`: "m5a.16xlarge" = "m5a.16xlarge"
  inline val `m5a.24xlarge`: "m5a.24xlarge" = "m5a.24xlarge"

  inline def values: js.Array[EC2InstanceType] = js.Array(
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
  inline val GENERIC_EVENT: "GENERIC_EVENT" = "GENERIC_EVENT"
  inline val FLEET_CREATED: "FLEET_CREATED" = "FLEET_CREATED"
  inline val FLEET_DELETED: "FLEET_DELETED" = "FLEET_DELETED"
  inline val FLEET_SCALING_EVENT: "FLEET_SCALING_EVENT" = "FLEET_SCALING_EVENT"
  inline val FLEET_STATE_DOWNLOADING: "FLEET_STATE_DOWNLOADING" = "FLEET_STATE_DOWNLOADING"
  inline val FLEET_STATE_VALIDATING: "FLEET_STATE_VALIDATING" = "FLEET_STATE_VALIDATING"
  inline val FLEET_STATE_BUILDING: "FLEET_STATE_BUILDING" = "FLEET_STATE_BUILDING"
  inline val FLEET_STATE_ACTIVATING: "FLEET_STATE_ACTIVATING" = "FLEET_STATE_ACTIVATING"
  inline val FLEET_STATE_ACTIVE: "FLEET_STATE_ACTIVE" = "FLEET_STATE_ACTIVE"
  inline val FLEET_STATE_ERROR: "FLEET_STATE_ERROR" = "FLEET_STATE_ERROR"
  inline val FLEET_INITIALIZATION_FAILED: "FLEET_INITIALIZATION_FAILED" = "FLEET_INITIALIZATION_FAILED"
  inline val FLEET_BINARY_DOWNLOAD_FAILED: "FLEET_BINARY_DOWNLOAD_FAILED" = "FLEET_BINARY_DOWNLOAD_FAILED"
  inline val FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND: "FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND" = "FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND"
  inline val FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE: "FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE" = "FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE"
  inline val FLEET_VALIDATION_TIMED_OUT: "FLEET_VALIDATION_TIMED_OUT" = "FLEET_VALIDATION_TIMED_OUT"
  inline val FLEET_ACTIVATION_FAILED: "FLEET_ACTIVATION_FAILED" = "FLEET_ACTIVATION_FAILED"
  inline val FLEET_ACTIVATION_FAILED_NO_INSTANCES: "FLEET_ACTIVATION_FAILED_NO_INSTANCES" = "FLEET_ACTIVATION_FAILED_NO_INSTANCES"
  inline val FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED: "FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED" = "FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED"
  inline val SERVER_PROCESS_INVALID_PATH: "SERVER_PROCESS_INVALID_PATH" = "SERVER_PROCESS_INVALID_PATH"
  inline val SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT: "SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT" = "SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT"
  inline val SERVER_PROCESS_PROCESS_READY_TIMEOUT: "SERVER_PROCESS_PROCESS_READY_TIMEOUT" = "SERVER_PROCESS_PROCESS_READY_TIMEOUT"
  inline val SERVER_PROCESS_CRASHED: "SERVER_PROCESS_CRASHED" = "SERVER_PROCESS_CRASHED"
  inline val SERVER_PROCESS_TERMINATED_UNHEALTHY: "SERVER_PROCESS_TERMINATED_UNHEALTHY" = "SERVER_PROCESS_TERMINATED_UNHEALTHY"
  inline val SERVER_PROCESS_FORCE_TERMINATED: "SERVER_PROCESS_FORCE_TERMINATED" = "SERVER_PROCESS_FORCE_TERMINATED"
  inline val SERVER_PROCESS_PROCESS_EXIT_TIMEOUT: "SERVER_PROCESS_PROCESS_EXIT_TIMEOUT" = "SERVER_PROCESS_PROCESS_EXIT_TIMEOUT"
  inline val GAME_SESSION_ACTIVATION_TIMEOUT: "GAME_SESSION_ACTIVATION_TIMEOUT" = "GAME_SESSION_ACTIVATION_TIMEOUT"
  inline val FLEET_CREATION_EXTRACTING_BUILD: "FLEET_CREATION_EXTRACTING_BUILD" = "FLEET_CREATION_EXTRACTING_BUILD"
  inline val FLEET_CREATION_RUNNING_INSTALLER: "FLEET_CREATION_RUNNING_INSTALLER" = "FLEET_CREATION_RUNNING_INSTALLER"
  inline val FLEET_CREATION_VALIDATING_RUNTIME_CONFIG: "FLEET_CREATION_VALIDATING_RUNTIME_CONFIG" = "FLEET_CREATION_VALIDATING_RUNTIME_CONFIG"
  inline val FLEET_VPC_PEERING_SUCCEEDED: "FLEET_VPC_PEERING_SUCCEEDED" = "FLEET_VPC_PEERING_SUCCEEDED"
  inline val FLEET_VPC_PEERING_FAILED: "FLEET_VPC_PEERING_FAILED" = "FLEET_VPC_PEERING_FAILED"
  inline val FLEET_VPC_PEERING_DELETED: "FLEET_VPC_PEERING_DELETED" = "FLEET_VPC_PEERING_DELETED"
  inline val INSTANCE_INTERRUPTED: "INSTANCE_INTERRUPTED" = "INSTANCE_INTERRUPTED"

  inline def values: js.Array[EventCode] = js.Array(
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
  inline val AUTO_SCALING: "AUTO_SCALING" = "AUTO_SCALING"

  inline def values: js.Array[FleetAction] = js.Array(AUTO_SCALING)
}

type FleetStatus = "NEW" | "DOWNLOADING" | "VALIDATING" | "BUILDING" | "ACTIVATING" | "ACTIVE" | "DELETING" | "ERROR" | "TERMINATED"
object FleetStatus {
  inline val NEW: "NEW" = "NEW"
  inline val DOWNLOADING: "DOWNLOADING" = "DOWNLOADING"
  inline val VALIDATING: "VALIDATING" = "VALIDATING"
  inline val BUILDING: "BUILDING" = "BUILDING"
  inline val ACTIVATING: "ACTIVATING" = "ACTIVATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val ERROR: "ERROR" = "ERROR"
  inline val TERMINATED: "TERMINATED" = "TERMINATED"

  inline def values: js.Array[FleetStatus] = js.Array(NEW, DOWNLOADING, VALIDATING, BUILDING, ACTIVATING, ACTIVE, DELETING, ERROR, TERMINATED)
}

type FleetType = "ON_DEMAND" | "SPOT"
object FleetType {
  inline val ON_DEMAND: "ON_DEMAND" = "ON_DEMAND"
  inline val SPOT: "SPOT" = "SPOT"

  inline def values: js.Array[FleetType] = js.Array(ON_DEMAND, SPOT)
}

type FlexMatchMode = "STANDALONE" | "WITH_QUEUE"
object FlexMatchMode {
  inline val STANDALONE: "STANDALONE" = "STANDALONE"
  inline val WITH_QUEUE: "WITH_QUEUE" = "WITH_QUEUE"

  inline def values: js.Array[FlexMatchMode] = js.Array(STANDALONE, WITH_QUEUE)
}

type GameServerClaimStatus = "CLAIMED"
object GameServerClaimStatus {
  inline val CLAIMED: "CLAIMED" = "CLAIMED"

  inline def values: js.Array[GameServerClaimStatus] = js.Array(CLAIMED)
}

type GameServerGroupAction = "REPLACE_INSTANCE_TYPES"
object GameServerGroupAction {
  inline val REPLACE_INSTANCE_TYPES: "REPLACE_INSTANCE_TYPES" = "REPLACE_INSTANCE_TYPES"

  inline def values: js.Array[GameServerGroupAction] = js.Array(REPLACE_INSTANCE_TYPES)
}

type GameServerGroupDeleteOption = "SAFE_DELETE" | "FORCE_DELETE" | "RETAIN"
object GameServerGroupDeleteOption {
  inline val SAFE_DELETE: "SAFE_DELETE" = "SAFE_DELETE"
  inline val FORCE_DELETE: "FORCE_DELETE" = "FORCE_DELETE"
  inline val RETAIN: "RETAIN" = "RETAIN"

  inline def values: js.Array[GameServerGroupDeleteOption] = js.Array(SAFE_DELETE, FORCE_DELETE, RETAIN)
}

type GameServerGroupInstanceType =
  "c4.large" | "c4.xlarge" | "c4.2xlarge" | "c4.4xlarge" | "c4.8xlarge" | "c5.large" | "c5.xlarge" | "c5.2xlarge" | "c5.4xlarge" | "c5.9xlarge" | "c5.12xlarge" | "c5.18xlarge" | "c5.24xlarge" | "c5a.large" | "c5a.xlarge" | "c5a.2xlarge" | "c5a.4xlarge" | "c5a.8xlarge" | "c5a.12xlarge" | "c5a.16xlarge" | "c5a.24xlarge" | "r4.large" | "r4.xlarge" | "r4.2xlarge" | "r4.4xlarge" | "r4.8xlarge" | "r4.16xlarge" | "r5.large" | "r5.xlarge" | "r5.2xlarge" | "r5.4xlarge" | "r5.8xlarge" | "r5.12xlarge" | "r5.16xlarge" | "r5.24xlarge" | "r5a.large" | "r5a.xlarge" | "r5a.2xlarge" | "r5a.4xlarge" | "r5a.8xlarge" | "r5a.12xlarge" | "r5a.16xlarge" | "r5a.24xlarge" | "m4.large" | "m4.xlarge" | "m4.2xlarge" | "m4.4xlarge" | "m4.10xlarge" | "m5.large" | "m5.xlarge" | "m5.2xlarge" | "m5.4xlarge" | "m5.8xlarge" | "m5.12xlarge" | "m5.16xlarge" | "m5.24xlarge" | "m5a.large" | "m5a.xlarge" | "m5a.2xlarge" | "m5a.4xlarge" | "m5a.8xlarge" | "m5a.12xlarge" | "m5a.16xlarge" | "m5a.24xlarge"
object GameServerGroupInstanceType {
  inline val `c4.large`: "c4.large" = "c4.large"
  inline val `c4.xlarge`: "c4.xlarge" = "c4.xlarge"
  inline val `c4.2xlarge`: "c4.2xlarge" = "c4.2xlarge"
  inline val `c4.4xlarge`: "c4.4xlarge" = "c4.4xlarge"
  inline val `c4.8xlarge`: "c4.8xlarge" = "c4.8xlarge"
  inline val `c5.large`: "c5.large" = "c5.large"
  inline val `c5.xlarge`: "c5.xlarge" = "c5.xlarge"
  inline val `c5.2xlarge`: "c5.2xlarge" = "c5.2xlarge"
  inline val `c5.4xlarge`: "c5.4xlarge" = "c5.4xlarge"
  inline val `c5.9xlarge`: "c5.9xlarge" = "c5.9xlarge"
  inline val `c5.12xlarge`: "c5.12xlarge" = "c5.12xlarge"
  inline val `c5.18xlarge`: "c5.18xlarge" = "c5.18xlarge"
  inline val `c5.24xlarge`: "c5.24xlarge" = "c5.24xlarge"
  inline val `c5a.large`: "c5a.large" = "c5a.large"
  inline val `c5a.xlarge`: "c5a.xlarge" = "c5a.xlarge"
  inline val `c5a.2xlarge`: "c5a.2xlarge" = "c5a.2xlarge"
  inline val `c5a.4xlarge`: "c5a.4xlarge" = "c5a.4xlarge"
  inline val `c5a.8xlarge`: "c5a.8xlarge" = "c5a.8xlarge"
  inline val `c5a.12xlarge`: "c5a.12xlarge" = "c5a.12xlarge"
  inline val `c5a.16xlarge`: "c5a.16xlarge" = "c5a.16xlarge"
  inline val `c5a.24xlarge`: "c5a.24xlarge" = "c5a.24xlarge"
  inline val `r4.large`: "r4.large" = "r4.large"
  inline val `r4.xlarge`: "r4.xlarge" = "r4.xlarge"
  inline val `r4.2xlarge`: "r4.2xlarge" = "r4.2xlarge"
  inline val `r4.4xlarge`: "r4.4xlarge" = "r4.4xlarge"
  inline val `r4.8xlarge`: "r4.8xlarge" = "r4.8xlarge"
  inline val `r4.16xlarge`: "r4.16xlarge" = "r4.16xlarge"
  inline val `r5.large`: "r5.large" = "r5.large"
  inline val `r5.xlarge`: "r5.xlarge" = "r5.xlarge"
  inline val `r5.2xlarge`: "r5.2xlarge" = "r5.2xlarge"
  inline val `r5.4xlarge`: "r5.4xlarge" = "r5.4xlarge"
  inline val `r5.8xlarge`: "r5.8xlarge" = "r5.8xlarge"
  inline val `r5.12xlarge`: "r5.12xlarge" = "r5.12xlarge"
  inline val `r5.16xlarge`: "r5.16xlarge" = "r5.16xlarge"
  inline val `r5.24xlarge`: "r5.24xlarge" = "r5.24xlarge"
  inline val `r5a.large`: "r5a.large" = "r5a.large"
  inline val `r5a.xlarge`: "r5a.xlarge" = "r5a.xlarge"
  inline val `r5a.2xlarge`: "r5a.2xlarge" = "r5a.2xlarge"
  inline val `r5a.4xlarge`: "r5a.4xlarge" = "r5a.4xlarge"
  inline val `r5a.8xlarge`: "r5a.8xlarge" = "r5a.8xlarge"
  inline val `r5a.12xlarge`: "r5a.12xlarge" = "r5a.12xlarge"
  inline val `r5a.16xlarge`: "r5a.16xlarge" = "r5a.16xlarge"
  inline val `r5a.24xlarge`: "r5a.24xlarge" = "r5a.24xlarge"
  inline val `m4.large`: "m4.large" = "m4.large"
  inline val `m4.xlarge`: "m4.xlarge" = "m4.xlarge"
  inline val `m4.2xlarge`: "m4.2xlarge" = "m4.2xlarge"
  inline val `m4.4xlarge`: "m4.4xlarge" = "m4.4xlarge"
  inline val `m4.10xlarge`: "m4.10xlarge" = "m4.10xlarge"
  inline val `m5.large`: "m5.large" = "m5.large"
  inline val `m5.xlarge`: "m5.xlarge" = "m5.xlarge"
  inline val `m5.2xlarge`: "m5.2xlarge" = "m5.2xlarge"
  inline val `m5.4xlarge`: "m5.4xlarge" = "m5.4xlarge"
  inline val `m5.8xlarge`: "m5.8xlarge" = "m5.8xlarge"
  inline val `m5.12xlarge`: "m5.12xlarge" = "m5.12xlarge"
  inline val `m5.16xlarge`: "m5.16xlarge" = "m5.16xlarge"
  inline val `m5.24xlarge`: "m5.24xlarge" = "m5.24xlarge"
  inline val `m5a.large`: "m5a.large" = "m5a.large"
  inline val `m5a.xlarge`: "m5a.xlarge" = "m5a.xlarge"
  inline val `m5a.2xlarge`: "m5a.2xlarge" = "m5a.2xlarge"
  inline val `m5a.4xlarge`: "m5a.4xlarge" = "m5a.4xlarge"
  inline val `m5a.8xlarge`: "m5a.8xlarge" = "m5a.8xlarge"
  inline val `m5a.12xlarge`: "m5a.12xlarge" = "m5a.12xlarge"
  inline val `m5a.16xlarge`: "m5a.16xlarge" = "m5a.16xlarge"
  inline val `m5a.24xlarge`: "m5a.24xlarge" = "m5a.24xlarge"

  inline def values: js.Array[GameServerGroupInstanceType] = js.Array(
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
  inline val NEW: "NEW" = "NEW"
  inline val ACTIVATING: "ACTIVATING" = "ACTIVATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETE_SCHEDULED: "DELETE_SCHEDULED" = "DELETE_SCHEDULED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[GameServerGroupStatus] = js.Array(NEW, ACTIVATING, ACTIVE, DELETE_SCHEDULED, DELETING, DELETED, ERROR)
}

type GameServerHealthCheck = "HEALTHY"
object GameServerHealthCheck {
  inline val HEALTHY: "HEALTHY" = "HEALTHY"

  inline def values: js.Array[GameServerHealthCheck] = js.Array(HEALTHY)
}

type GameServerInstanceStatus = "ACTIVE" | "DRAINING" | "SPOT_TERMINATING"
object GameServerInstanceStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DRAINING: "DRAINING" = "DRAINING"
  inline val SPOT_TERMINATING: "SPOT_TERMINATING" = "SPOT_TERMINATING"

  inline def values: js.Array[GameServerInstanceStatus] = js.Array(ACTIVE, DRAINING, SPOT_TERMINATING)
}

type GameServerProtectionPolicy = "NO_PROTECTION" | "FULL_PROTECTION"
object GameServerProtectionPolicy {
  inline val NO_PROTECTION: "NO_PROTECTION" = "NO_PROTECTION"
  inline val FULL_PROTECTION: "FULL_PROTECTION" = "FULL_PROTECTION"

  inline def values: js.Array[GameServerProtectionPolicy] = js.Array(NO_PROTECTION, FULL_PROTECTION)
}

type GameServerUtilizationStatus = "AVAILABLE" | "UTILIZED"
object GameServerUtilizationStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val UTILIZED: "UTILIZED" = "UTILIZED"

  inline def values: js.Array[GameServerUtilizationStatus] = js.Array(AVAILABLE, UTILIZED)
}

type GameSessionPlacementState = "PENDING" | "FULFILLED" | "CANCELLED" | "TIMED_OUT" | "FAILED"
object GameSessionPlacementState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val FULFILLED: "FULFILLED" = "FULFILLED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[GameSessionPlacementState] = js.Array(PENDING, FULFILLED, CANCELLED, TIMED_OUT, FAILED)
}

type GameSessionStatus = "ACTIVE" | "ACTIVATING" | "TERMINATED" | "TERMINATING" | "ERROR"
object GameSessionStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val ACTIVATING: "ACTIVATING" = "ACTIVATING"
  inline val TERMINATED: "TERMINATED" = "TERMINATED"
  inline val TERMINATING: "TERMINATING" = "TERMINATING"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[GameSessionStatus] = js.Array(ACTIVE, ACTIVATING, TERMINATED, TERMINATING, ERROR)
}

type GameSessionStatusReason = "INTERRUPTED"
object GameSessionStatusReason {
  inline val INTERRUPTED: "INTERRUPTED" = "INTERRUPTED"

  inline def values: js.Array[GameSessionStatusReason] = js.Array(INTERRUPTED)
}

type InstanceStatus = "PENDING" | "ACTIVE" | "TERMINATING"
object InstanceStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val TERMINATING: "TERMINATING" = "TERMINATING"

  inline def values: js.Array[InstanceStatus] = js.Array(PENDING, ACTIVE, TERMINATING)
}

type IpProtocol = "TCP" | "UDP"
object IpProtocol {
  inline val TCP: "TCP" = "TCP"
  inline val UDP: "UDP" = "UDP"

  inline def values: js.Array[IpProtocol] = js.Array(TCP, UDP)
}

type LocationUpdateStatus = "PENDING_UPDATE"
object LocationUpdateStatus {
  inline val PENDING_UPDATE: "PENDING_UPDATE" = "PENDING_UPDATE"

  inline def values: js.Array[LocationUpdateStatus] = js.Array(PENDING_UPDATE)
}

type MatchmakingConfigurationStatus = "CANCELLED" | "COMPLETED" | "FAILED" | "PLACING" | "QUEUED" | "REQUIRES_ACCEPTANCE" | "SEARCHING" | "TIMED_OUT"
object MatchmakingConfigurationStatus {
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val PLACING: "PLACING" = "PLACING"
  inline val QUEUED: "QUEUED" = "QUEUED"
  inline val REQUIRES_ACCEPTANCE: "REQUIRES_ACCEPTANCE" = "REQUIRES_ACCEPTANCE"
  inline val SEARCHING: "SEARCHING" = "SEARCHING"
  inline val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"

  inline def values: js.Array[MatchmakingConfigurationStatus] = js.Array(CANCELLED, COMPLETED, FAILED, PLACING, QUEUED, REQUIRES_ACCEPTANCE, SEARCHING, TIMED_OUT)
}

type MetricName = "ActivatingGameSessions" | "ActiveGameSessions" | "ActiveInstances" | "AvailableGameSessions" | "AvailablePlayerSessions" | "CurrentPlayerSessions" | "IdleInstances" | "PercentAvailableGameSessions" | "PercentIdleInstances" | "QueueDepth" | "WaitTime"
object MetricName {
  inline val ActivatingGameSessions: "ActivatingGameSessions" = "ActivatingGameSessions"
  inline val ActiveGameSessions: "ActiveGameSessions" = "ActiveGameSessions"
  inline val ActiveInstances: "ActiveInstances" = "ActiveInstances"
  inline val AvailableGameSessions: "AvailableGameSessions" = "AvailableGameSessions"
  inline val AvailablePlayerSessions: "AvailablePlayerSessions" = "AvailablePlayerSessions"
  inline val CurrentPlayerSessions: "CurrentPlayerSessions" = "CurrentPlayerSessions"
  inline val IdleInstances: "IdleInstances" = "IdleInstances"
  inline val PercentAvailableGameSessions: "PercentAvailableGameSessions" = "PercentAvailableGameSessions"
  inline val PercentIdleInstances: "PercentIdleInstances" = "PercentIdleInstances"
  inline val QueueDepth: "QueueDepth" = "QueueDepth"
  inline val WaitTime: "WaitTime" = "WaitTime"

  inline def values: js.Array[MetricName] = js.Array(
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
  inline val WINDOWS_2012: "WINDOWS_2012" = "WINDOWS_2012"
  inline val AMAZON_LINUX: "AMAZON_LINUX" = "AMAZON_LINUX"
  inline val AMAZON_LINUX_2: "AMAZON_LINUX_2" = "AMAZON_LINUX_2"

  inline def values: js.Array[OperatingSystem] = js.Array(WINDOWS_2012, AMAZON_LINUX, AMAZON_LINUX_2)
}

type PlayerSessionCreationPolicy = "ACCEPT_ALL" | "DENY_ALL"
object PlayerSessionCreationPolicy {
  inline val ACCEPT_ALL: "ACCEPT_ALL" = "ACCEPT_ALL"
  inline val DENY_ALL: "DENY_ALL" = "DENY_ALL"

  inline def values: js.Array[PlayerSessionCreationPolicy] = js.Array(ACCEPT_ALL, DENY_ALL)
}

type PlayerSessionStatus = "RESERVED" | "ACTIVE" | "COMPLETED" | "TIMEDOUT"
object PlayerSessionStatus {
  inline val RESERVED: "RESERVED" = "RESERVED"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val TIMEDOUT: "TIMEDOUT" = "TIMEDOUT"

  inline def values: js.Array[PlayerSessionStatus] = js.Array(RESERVED, ACTIVE, COMPLETED, TIMEDOUT)
}

type PolicyType = "RuleBased" | "TargetBased"
object PolicyType {
  inline val RuleBased: "RuleBased" = "RuleBased"
  inline val TargetBased: "TargetBased" = "TargetBased"

  inline def values: js.Array[PolicyType] = js.Array(RuleBased, TargetBased)
}

type PriorityType = "LATENCY" | "COST" | "DESTINATION" | "LOCATION"
object PriorityType {
  inline val LATENCY: "LATENCY" = "LATENCY"
  inline val COST: "COST" = "COST"
  inline val DESTINATION: "DESTINATION" = "DESTINATION"
  inline val LOCATION: "LOCATION" = "LOCATION"

  inline def values: js.Array[PriorityType] = js.Array(LATENCY, COST, DESTINATION, LOCATION)
}

type ProtectionPolicy = "NoProtection" | "FullProtection"
object ProtectionPolicy {
  inline val NoProtection: "NoProtection" = "NoProtection"
  inline val FullProtection: "FullProtection" = "FullProtection"

  inline def values: js.Array[ProtectionPolicy] = js.Array(NoProtection, FullProtection)
}

type RoutingStrategyType = "SIMPLE" | "TERMINAL"
object RoutingStrategyType {
  inline val SIMPLE: "SIMPLE" = "SIMPLE"
  inline val TERMINAL: "TERMINAL" = "TERMINAL"

  inline def values: js.Array[RoutingStrategyType] = js.Array(SIMPLE, TERMINAL)
}

type ScalingAdjustmentType = "ChangeInCapacity" | "ExactCapacity" | "PercentChangeInCapacity"
object ScalingAdjustmentType {
  inline val ChangeInCapacity: "ChangeInCapacity" = "ChangeInCapacity"
  inline val ExactCapacity: "ExactCapacity" = "ExactCapacity"
  inline val PercentChangeInCapacity: "PercentChangeInCapacity" = "PercentChangeInCapacity"

  inline def values: js.Array[ScalingAdjustmentType] = js.Array(ChangeInCapacity, ExactCapacity, PercentChangeInCapacity)
}

type ScalingStatusType = "ACTIVE" | "UPDATE_REQUESTED" | "UPDATING" | "DELETE_REQUESTED" | "DELETING" | "DELETED" | "ERROR"
object ScalingStatusType {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val UPDATE_REQUESTED: "UPDATE_REQUESTED" = "UPDATE_REQUESTED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETE_REQUESTED: "DELETE_REQUESTED" = "DELETE_REQUESTED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[ScalingStatusType] = js.Array(ACTIVE, UPDATE_REQUESTED, UPDATING, DELETE_REQUESTED, DELETING, DELETED, ERROR)
}

type SortOrder = "ASCENDING" | "DESCENDING"
object SortOrder {
  inline val ASCENDING: "ASCENDING" = "ASCENDING"
  inline val DESCENDING: "DESCENDING" = "DESCENDING"

  inline def values: js.Array[SortOrder] = js.Array(ASCENDING, DESCENDING)
}
