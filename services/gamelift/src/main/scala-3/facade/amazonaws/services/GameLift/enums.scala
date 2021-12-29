package facade.amazonaws.services.gamelift

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AcceptanceType extends js.Any
object AcceptanceType {
  val ACCEPT = "ACCEPT".asInstanceOf[AcceptanceType]
  val REJECT = "REJECT".asInstanceOf[AcceptanceType]

  @inline def values = js.Array(ACCEPT, REJECT)
}

@js.native
sealed trait BackfillMode extends js.Any
object BackfillMode {
  val AUTOMATIC = "AUTOMATIC".asInstanceOf[BackfillMode]
  val MANUAL = "MANUAL".asInstanceOf[BackfillMode]

  @inline def values = js.Array(AUTOMATIC, MANUAL)
}

@js.native
sealed trait BalancingStrategy extends js.Any
object BalancingStrategy {
  val SPOT_ONLY = "SPOT_ONLY".asInstanceOf[BalancingStrategy]
  val SPOT_PREFERRED = "SPOT_PREFERRED".asInstanceOf[BalancingStrategy]
  val ON_DEMAND_ONLY = "ON_DEMAND_ONLY".asInstanceOf[BalancingStrategy]

  @inline def values = js.Array(SPOT_ONLY, SPOT_PREFERRED, ON_DEMAND_ONLY)
}

@js.native
sealed trait BuildStatus extends js.Any
object BuildStatus {
  val INITIALIZED = "INITIALIZED".asInstanceOf[BuildStatus]
  val READY = "READY".asInstanceOf[BuildStatus]
  val FAILED = "FAILED".asInstanceOf[BuildStatus]

  @inline def values = js.Array(INITIALIZED, READY, FAILED)
}

@js.native
sealed trait CertificateType extends js.Any
object CertificateType {
  val DISABLED = "DISABLED".asInstanceOf[CertificateType]
  val GENERATED = "GENERATED".asInstanceOf[CertificateType]

  @inline def values = js.Array(DISABLED, GENERATED)
}

@js.native
sealed trait ComparisonOperatorType extends js.Any
object ComparisonOperatorType {
  val GreaterThanOrEqualToThreshold = "GreaterThanOrEqualToThreshold".asInstanceOf[ComparisonOperatorType]
  val GreaterThanThreshold = "GreaterThanThreshold".asInstanceOf[ComparisonOperatorType]
  val LessThanThreshold = "LessThanThreshold".asInstanceOf[ComparisonOperatorType]
  val LessThanOrEqualToThreshold = "LessThanOrEqualToThreshold".asInstanceOf[ComparisonOperatorType]

  @inline def values = js.Array(GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold)
}

@js.native
sealed trait EC2InstanceType extends js.Any
object EC2InstanceType {
  val `t2.micro` = "t2.micro".asInstanceOf[EC2InstanceType]
  val `t2.small` = "t2.small".asInstanceOf[EC2InstanceType]
  val `t2.medium` = "t2.medium".asInstanceOf[EC2InstanceType]
  val `t2.large` = "t2.large".asInstanceOf[EC2InstanceType]
  val `c3.large` = "c3.large".asInstanceOf[EC2InstanceType]
  val `c3.xlarge` = "c3.xlarge".asInstanceOf[EC2InstanceType]
  val `c3.2xlarge` = "c3.2xlarge".asInstanceOf[EC2InstanceType]
  val `c3.4xlarge` = "c3.4xlarge".asInstanceOf[EC2InstanceType]
  val `c3.8xlarge` = "c3.8xlarge".asInstanceOf[EC2InstanceType]
  val `c4.large` = "c4.large".asInstanceOf[EC2InstanceType]
  val `c4.xlarge` = "c4.xlarge".asInstanceOf[EC2InstanceType]
  val `c4.2xlarge` = "c4.2xlarge".asInstanceOf[EC2InstanceType]
  val `c4.4xlarge` = "c4.4xlarge".asInstanceOf[EC2InstanceType]
  val `c4.8xlarge` = "c4.8xlarge".asInstanceOf[EC2InstanceType]
  val `c5.large` = "c5.large".asInstanceOf[EC2InstanceType]
  val `c5.xlarge` = "c5.xlarge".asInstanceOf[EC2InstanceType]
  val `c5.2xlarge` = "c5.2xlarge".asInstanceOf[EC2InstanceType]
  val `c5.4xlarge` = "c5.4xlarge".asInstanceOf[EC2InstanceType]
  val `c5.9xlarge` = "c5.9xlarge".asInstanceOf[EC2InstanceType]
  val `c5.12xlarge` = "c5.12xlarge".asInstanceOf[EC2InstanceType]
  val `c5.18xlarge` = "c5.18xlarge".asInstanceOf[EC2InstanceType]
  val `c5.24xlarge` = "c5.24xlarge".asInstanceOf[EC2InstanceType]
  val `c5a.large` = "c5a.large".asInstanceOf[EC2InstanceType]
  val `c5a.xlarge` = "c5a.xlarge".asInstanceOf[EC2InstanceType]
  val `c5a.2xlarge` = "c5a.2xlarge".asInstanceOf[EC2InstanceType]
  val `c5a.4xlarge` = "c5a.4xlarge".asInstanceOf[EC2InstanceType]
  val `c5a.8xlarge` = "c5a.8xlarge".asInstanceOf[EC2InstanceType]
  val `c5a.12xlarge` = "c5a.12xlarge".asInstanceOf[EC2InstanceType]
  val `c5a.16xlarge` = "c5a.16xlarge".asInstanceOf[EC2InstanceType]
  val `c5a.24xlarge` = "c5a.24xlarge".asInstanceOf[EC2InstanceType]
  val `r3.large` = "r3.large".asInstanceOf[EC2InstanceType]
  val `r3.xlarge` = "r3.xlarge".asInstanceOf[EC2InstanceType]
  val `r3.2xlarge` = "r3.2xlarge".asInstanceOf[EC2InstanceType]
  val `r3.4xlarge` = "r3.4xlarge".asInstanceOf[EC2InstanceType]
  val `r3.8xlarge` = "r3.8xlarge".asInstanceOf[EC2InstanceType]
  val `r4.large` = "r4.large".asInstanceOf[EC2InstanceType]
  val `r4.xlarge` = "r4.xlarge".asInstanceOf[EC2InstanceType]
  val `r4.2xlarge` = "r4.2xlarge".asInstanceOf[EC2InstanceType]
  val `r4.4xlarge` = "r4.4xlarge".asInstanceOf[EC2InstanceType]
  val `r4.8xlarge` = "r4.8xlarge".asInstanceOf[EC2InstanceType]
  val `r4.16xlarge` = "r4.16xlarge".asInstanceOf[EC2InstanceType]
  val `r5.large` = "r5.large".asInstanceOf[EC2InstanceType]
  val `r5.xlarge` = "r5.xlarge".asInstanceOf[EC2InstanceType]
  val `r5.2xlarge` = "r5.2xlarge".asInstanceOf[EC2InstanceType]
  val `r5.4xlarge` = "r5.4xlarge".asInstanceOf[EC2InstanceType]
  val `r5.8xlarge` = "r5.8xlarge".asInstanceOf[EC2InstanceType]
  val `r5.12xlarge` = "r5.12xlarge".asInstanceOf[EC2InstanceType]
  val `r5.16xlarge` = "r5.16xlarge".asInstanceOf[EC2InstanceType]
  val `r5.24xlarge` = "r5.24xlarge".asInstanceOf[EC2InstanceType]
  val `r5a.large` = "r5a.large".asInstanceOf[EC2InstanceType]
  val `r5a.xlarge` = "r5a.xlarge".asInstanceOf[EC2InstanceType]
  val `r5a.2xlarge` = "r5a.2xlarge".asInstanceOf[EC2InstanceType]
  val `r5a.4xlarge` = "r5a.4xlarge".asInstanceOf[EC2InstanceType]
  val `r5a.8xlarge` = "r5a.8xlarge".asInstanceOf[EC2InstanceType]
  val `r5a.12xlarge` = "r5a.12xlarge".asInstanceOf[EC2InstanceType]
  val `r5a.16xlarge` = "r5a.16xlarge".asInstanceOf[EC2InstanceType]
  val `r5a.24xlarge` = "r5a.24xlarge".asInstanceOf[EC2InstanceType]
  val `m3.medium` = "m3.medium".asInstanceOf[EC2InstanceType]
  val `m3.large` = "m3.large".asInstanceOf[EC2InstanceType]
  val `m3.xlarge` = "m3.xlarge".asInstanceOf[EC2InstanceType]
  val `m3.2xlarge` = "m3.2xlarge".asInstanceOf[EC2InstanceType]
  val `m4.large` = "m4.large".asInstanceOf[EC2InstanceType]
  val `m4.xlarge` = "m4.xlarge".asInstanceOf[EC2InstanceType]
  val `m4.2xlarge` = "m4.2xlarge".asInstanceOf[EC2InstanceType]
  val `m4.4xlarge` = "m4.4xlarge".asInstanceOf[EC2InstanceType]
  val `m4.10xlarge` = "m4.10xlarge".asInstanceOf[EC2InstanceType]
  val `m5.large` = "m5.large".asInstanceOf[EC2InstanceType]
  val `m5.xlarge` = "m5.xlarge".asInstanceOf[EC2InstanceType]
  val `m5.2xlarge` = "m5.2xlarge".asInstanceOf[EC2InstanceType]
  val `m5.4xlarge` = "m5.4xlarge".asInstanceOf[EC2InstanceType]
  val `m5.8xlarge` = "m5.8xlarge".asInstanceOf[EC2InstanceType]
  val `m5.12xlarge` = "m5.12xlarge".asInstanceOf[EC2InstanceType]
  val `m5.16xlarge` = "m5.16xlarge".asInstanceOf[EC2InstanceType]
  val `m5.24xlarge` = "m5.24xlarge".asInstanceOf[EC2InstanceType]
  val `m5a.large` = "m5a.large".asInstanceOf[EC2InstanceType]
  val `m5a.xlarge` = "m5a.xlarge".asInstanceOf[EC2InstanceType]
  val `m5a.2xlarge` = "m5a.2xlarge".asInstanceOf[EC2InstanceType]
  val `m5a.4xlarge` = "m5a.4xlarge".asInstanceOf[EC2InstanceType]
  val `m5a.8xlarge` = "m5a.8xlarge".asInstanceOf[EC2InstanceType]
  val `m5a.12xlarge` = "m5a.12xlarge".asInstanceOf[EC2InstanceType]
  val `m5a.16xlarge` = "m5a.16xlarge".asInstanceOf[EC2InstanceType]
  val `m5a.24xlarge` = "m5a.24xlarge".asInstanceOf[EC2InstanceType]

  @inline def values = js.Array(
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

@js.native
sealed trait EventCode extends js.Any
object EventCode {
  val GENERIC_EVENT = "GENERIC_EVENT".asInstanceOf[EventCode]
  val FLEET_CREATED = "FLEET_CREATED".asInstanceOf[EventCode]
  val FLEET_DELETED = "FLEET_DELETED".asInstanceOf[EventCode]
  val FLEET_SCALING_EVENT = "FLEET_SCALING_EVENT".asInstanceOf[EventCode]
  val FLEET_STATE_DOWNLOADING = "FLEET_STATE_DOWNLOADING".asInstanceOf[EventCode]
  val FLEET_STATE_VALIDATING = "FLEET_STATE_VALIDATING".asInstanceOf[EventCode]
  val FLEET_STATE_BUILDING = "FLEET_STATE_BUILDING".asInstanceOf[EventCode]
  val FLEET_STATE_ACTIVATING = "FLEET_STATE_ACTIVATING".asInstanceOf[EventCode]
  val FLEET_STATE_ACTIVE = "FLEET_STATE_ACTIVE".asInstanceOf[EventCode]
  val FLEET_STATE_ERROR = "FLEET_STATE_ERROR".asInstanceOf[EventCode]
  val FLEET_INITIALIZATION_FAILED = "FLEET_INITIALIZATION_FAILED".asInstanceOf[EventCode]
  val FLEET_BINARY_DOWNLOAD_FAILED = "FLEET_BINARY_DOWNLOAD_FAILED".asInstanceOf[EventCode]
  val FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND = "FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND".asInstanceOf[EventCode]
  val FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE = "FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE".asInstanceOf[EventCode]
  val FLEET_VALIDATION_TIMED_OUT = "FLEET_VALIDATION_TIMED_OUT".asInstanceOf[EventCode]
  val FLEET_ACTIVATION_FAILED = "FLEET_ACTIVATION_FAILED".asInstanceOf[EventCode]
  val FLEET_ACTIVATION_FAILED_NO_INSTANCES = "FLEET_ACTIVATION_FAILED_NO_INSTANCES".asInstanceOf[EventCode]
  val FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED = "FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED".asInstanceOf[EventCode]
  val SERVER_PROCESS_INVALID_PATH = "SERVER_PROCESS_INVALID_PATH".asInstanceOf[EventCode]
  val SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT = "SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT".asInstanceOf[EventCode]
  val SERVER_PROCESS_PROCESS_READY_TIMEOUT = "SERVER_PROCESS_PROCESS_READY_TIMEOUT".asInstanceOf[EventCode]
  val SERVER_PROCESS_CRASHED = "SERVER_PROCESS_CRASHED".asInstanceOf[EventCode]
  val SERVER_PROCESS_TERMINATED_UNHEALTHY = "SERVER_PROCESS_TERMINATED_UNHEALTHY".asInstanceOf[EventCode]
  val SERVER_PROCESS_FORCE_TERMINATED = "SERVER_PROCESS_FORCE_TERMINATED".asInstanceOf[EventCode]
  val SERVER_PROCESS_PROCESS_EXIT_TIMEOUT = "SERVER_PROCESS_PROCESS_EXIT_TIMEOUT".asInstanceOf[EventCode]
  val GAME_SESSION_ACTIVATION_TIMEOUT = "GAME_SESSION_ACTIVATION_TIMEOUT".asInstanceOf[EventCode]
  val FLEET_CREATION_EXTRACTING_BUILD = "FLEET_CREATION_EXTRACTING_BUILD".asInstanceOf[EventCode]
  val FLEET_CREATION_RUNNING_INSTALLER = "FLEET_CREATION_RUNNING_INSTALLER".asInstanceOf[EventCode]
  val FLEET_CREATION_VALIDATING_RUNTIME_CONFIG = "FLEET_CREATION_VALIDATING_RUNTIME_CONFIG".asInstanceOf[EventCode]
  val FLEET_VPC_PEERING_SUCCEEDED = "FLEET_VPC_PEERING_SUCCEEDED".asInstanceOf[EventCode]
  val FLEET_VPC_PEERING_FAILED = "FLEET_VPC_PEERING_FAILED".asInstanceOf[EventCode]
  val FLEET_VPC_PEERING_DELETED = "FLEET_VPC_PEERING_DELETED".asInstanceOf[EventCode]
  val INSTANCE_INTERRUPTED = "INSTANCE_INTERRUPTED".asInstanceOf[EventCode]

  @inline def values = js.Array(
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

@js.native
sealed trait FleetAction extends js.Any
object FleetAction {
  val AUTO_SCALING = "AUTO_SCALING".asInstanceOf[FleetAction]

  @inline def values = js.Array(AUTO_SCALING)
}

@js.native
sealed trait FleetStatus extends js.Any
object FleetStatus {
  val NEW = "NEW".asInstanceOf[FleetStatus]
  val DOWNLOADING = "DOWNLOADING".asInstanceOf[FleetStatus]
  val VALIDATING = "VALIDATING".asInstanceOf[FleetStatus]
  val BUILDING = "BUILDING".asInstanceOf[FleetStatus]
  val ACTIVATING = "ACTIVATING".asInstanceOf[FleetStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[FleetStatus]
  val DELETING = "DELETING".asInstanceOf[FleetStatus]
  val ERROR = "ERROR".asInstanceOf[FleetStatus]
  val TERMINATED = "TERMINATED".asInstanceOf[FleetStatus]

  @inline def values = js.Array(NEW, DOWNLOADING, VALIDATING, BUILDING, ACTIVATING, ACTIVE, DELETING, ERROR, TERMINATED)
}

@js.native
sealed trait FleetType extends js.Any
object FleetType {
  val ON_DEMAND = "ON_DEMAND".asInstanceOf[FleetType]
  val SPOT = "SPOT".asInstanceOf[FleetType]

  @inline def values = js.Array(ON_DEMAND, SPOT)
}

@js.native
sealed trait FlexMatchMode extends js.Any
object FlexMatchMode {
  val STANDALONE = "STANDALONE".asInstanceOf[FlexMatchMode]
  val WITH_QUEUE = "WITH_QUEUE".asInstanceOf[FlexMatchMode]

  @inline def values = js.Array(STANDALONE, WITH_QUEUE)
}

@js.native
sealed trait GameServerClaimStatus extends js.Any
object GameServerClaimStatus {
  val CLAIMED = "CLAIMED".asInstanceOf[GameServerClaimStatus]

  @inline def values = js.Array(CLAIMED)
}

@js.native
sealed trait GameServerGroupAction extends js.Any
object GameServerGroupAction {
  val REPLACE_INSTANCE_TYPES = "REPLACE_INSTANCE_TYPES".asInstanceOf[GameServerGroupAction]

  @inline def values = js.Array(REPLACE_INSTANCE_TYPES)
}

@js.native
sealed trait GameServerGroupDeleteOption extends js.Any
object GameServerGroupDeleteOption {
  val SAFE_DELETE = "SAFE_DELETE".asInstanceOf[GameServerGroupDeleteOption]
  val FORCE_DELETE = "FORCE_DELETE".asInstanceOf[GameServerGroupDeleteOption]
  val RETAIN = "RETAIN".asInstanceOf[GameServerGroupDeleteOption]

  @inline def values = js.Array(SAFE_DELETE, FORCE_DELETE, RETAIN)
}

@js.native
sealed trait GameServerGroupInstanceType extends js.Any
object GameServerGroupInstanceType {
  val `c4.large` = "c4.large".asInstanceOf[GameServerGroupInstanceType]
  val `c4.xlarge` = "c4.xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `c4.2xlarge` = "c4.2xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `c4.4xlarge` = "c4.4xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `c4.8xlarge` = "c4.8xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `c5.large` = "c5.large".asInstanceOf[GameServerGroupInstanceType]
  val `c5.xlarge` = "c5.xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `c5.2xlarge` = "c5.2xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `c5.4xlarge` = "c5.4xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `c5.9xlarge` = "c5.9xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `c5.12xlarge` = "c5.12xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `c5.18xlarge` = "c5.18xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `c5.24xlarge` = "c5.24xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `c5a.large` = "c5a.large".asInstanceOf[GameServerGroupInstanceType]
  val `c5a.xlarge` = "c5a.xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `c5a.2xlarge` = "c5a.2xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `c5a.4xlarge` = "c5a.4xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `c5a.8xlarge` = "c5a.8xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `c5a.12xlarge` = "c5a.12xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `c5a.16xlarge` = "c5a.16xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `c5a.24xlarge` = "c5a.24xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `r4.large` = "r4.large".asInstanceOf[GameServerGroupInstanceType]
  val `r4.xlarge` = "r4.xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `r4.2xlarge` = "r4.2xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `r4.4xlarge` = "r4.4xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `r4.8xlarge` = "r4.8xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `r4.16xlarge` = "r4.16xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `r5.large` = "r5.large".asInstanceOf[GameServerGroupInstanceType]
  val `r5.xlarge` = "r5.xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `r5.2xlarge` = "r5.2xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `r5.4xlarge` = "r5.4xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `r5.8xlarge` = "r5.8xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `r5.12xlarge` = "r5.12xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `r5.16xlarge` = "r5.16xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `r5.24xlarge` = "r5.24xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `r5a.large` = "r5a.large".asInstanceOf[GameServerGroupInstanceType]
  val `r5a.xlarge` = "r5a.xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `r5a.2xlarge` = "r5a.2xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `r5a.4xlarge` = "r5a.4xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `r5a.8xlarge` = "r5a.8xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `r5a.12xlarge` = "r5a.12xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `r5a.16xlarge` = "r5a.16xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `r5a.24xlarge` = "r5a.24xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `m4.large` = "m4.large".asInstanceOf[GameServerGroupInstanceType]
  val `m4.xlarge` = "m4.xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `m4.2xlarge` = "m4.2xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `m4.4xlarge` = "m4.4xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `m4.10xlarge` = "m4.10xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `m5.large` = "m5.large".asInstanceOf[GameServerGroupInstanceType]
  val `m5.xlarge` = "m5.xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `m5.2xlarge` = "m5.2xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `m5.4xlarge` = "m5.4xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `m5.8xlarge` = "m5.8xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `m5.12xlarge` = "m5.12xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `m5.16xlarge` = "m5.16xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `m5.24xlarge` = "m5.24xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `m5a.large` = "m5a.large".asInstanceOf[GameServerGroupInstanceType]
  val `m5a.xlarge` = "m5a.xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `m5a.2xlarge` = "m5a.2xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `m5a.4xlarge` = "m5a.4xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `m5a.8xlarge` = "m5a.8xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `m5a.12xlarge` = "m5a.12xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `m5a.16xlarge` = "m5a.16xlarge".asInstanceOf[GameServerGroupInstanceType]
  val `m5a.24xlarge` = "m5a.24xlarge".asInstanceOf[GameServerGroupInstanceType]

  @inline def values = js.Array(
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

@js.native
sealed trait GameServerGroupStatus extends js.Any
object GameServerGroupStatus {
  val NEW = "NEW".asInstanceOf[GameServerGroupStatus]
  val ACTIVATING = "ACTIVATING".asInstanceOf[GameServerGroupStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[GameServerGroupStatus]
  val DELETE_SCHEDULED = "DELETE_SCHEDULED".asInstanceOf[GameServerGroupStatus]
  val DELETING = "DELETING".asInstanceOf[GameServerGroupStatus]
  val DELETED = "DELETED".asInstanceOf[GameServerGroupStatus]
  val ERROR = "ERROR".asInstanceOf[GameServerGroupStatus]

  @inline def values = js.Array(NEW, ACTIVATING, ACTIVE, DELETE_SCHEDULED, DELETING, DELETED, ERROR)
}

@js.native
sealed trait GameServerHealthCheck extends js.Any
object GameServerHealthCheck {
  val HEALTHY = "HEALTHY".asInstanceOf[GameServerHealthCheck]

  @inline def values = js.Array(HEALTHY)
}

@js.native
sealed trait GameServerInstanceStatus extends js.Any
object GameServerInstanceStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[GameServerInstanceStatus]
  val DRAINING = "DRAINING".asInstanceOf[GameServerInstanceStatus]
  val SPOT_TERMINATING = "SPOT_TERMINATING".asInstanceOf[GameServerInstanceStatus]

  @inline def values = js.Array(ACTIVE, DRAINING, SPOT_TERMINATING)
}

@js.native
sealed trait GameServerProtectionPolicy extends js.Any
object GameServerProtectionPolicy {
  val NO_PROTECTION = "NO_PROTECTION".asInstanceOf[GameServerProtectionPolicy]
  val FULL_PROTECTION = "FULL_PROTECTION".asInstanceOf[GameServerProtectionPolicy]

  @inline def values = js.Array(NO_PROTECTION, FULL_PROTECTION)
}

@js.native
sealed trait GameServerUtilizationStatus extends js.Any
object GameServerUtilizationStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[GameServerUtilizationStatus]
  val UTILIZED = "UTILIZED".asInstanceOf[GameServerUtilizationStatus]

  @inline def values = js.Array(AVAILABLE, UTILIZED)
}

@js.native
sealed trait GameSessionPlacementState extends js.Any
object GameSessionPlacementState {
  val PENDING = "PENDING".asInstanceOf[GameSessionPlacementState]
  val FULFILLED = "FULFILLED".asInstanceOf[GameSessionPlacementState]
  val CANCELLED = "CANCELLED".asInstanceOf[GameSessionPlacementState]
  val TIMED_OUT = "TIMED_OUT".asInstanceOf[GameSessionPlacementState]
  val FAILED = "FAILED".asInstanceOf[GameSessionPlacementState]

  @inline def values = js.Array(PENDING, FULFILLED, CANCELLED, TIMED_OUT, FAILED)
}

@js.native
sealed trait GameSessionStatus extends js.Any
object GameSessionStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[GameSessionStatus]
  val ACTIVATING = "ACTIVATING".asInstanceOf[GameSessionStatus]
  val TERMINATED = "TERMINATED".asInstanceOf[GameSessionStatus]
  val TERMINATING = "TERMINATING".asInstanceOf[GameSessionStatus]
  val ERROR = "ERROR".asInstanceOf[GameSessionStatus]

  @inline def values = js.Array(ACTIVE, ACTIVATING, TERMINATED, TERMINATING, ERROR)
}

@js.native
sealed trait GameSessionStatusReason extends js.Any
object GameSessionStatusReason {
  val INTERRUPTED = "INTERRUPTED".asInstanceOf[GameSessionStatusReason]

  @inline def values = js.Array(INTERRUPTED)
}

@js.native
sealed trait InstanceStatus extends js.Any
object InstanceStatus {
  val PENDING = "PENDING".asInstanceOf[InstanceStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[InstanceStatus]
  val TERMINATING = "TERMINATING".asInstanceOf[InstanceStatus]

  @inline def values = js.Array(PENDING, ACTIVE, TERMINATING)
}

@js.native
sealed trait IpProtocol extends js.Any
object IpProtocol {
  val TCP = "TCP".asInstanceOf[IpProtocol]
  val UDP = "UDP".asInstanceOf[IpProtocol]

  @inline def values = js.Array(TCP, UDP)
}

@js.native
sealed trait LocationUpdateStatus extends js.Any
object LocationUpdateStatus {
  val PENDING_UPDATE = "PENDING_UPDATE".asInstanceOf[LocationUpdateStatus]

  @inline def values = js.Array(PENDING_UPDATE)
}

@js.native
sealed trait MatchmakingConfigurationStatus extends js.Any
object MatchmakingConfigurationStatus {
  val CANCELLED = "CANCELLED".asInstanceOf[MatchmakingConfigurationStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[MatchmakingConfigurationStatus]
  val FAILED = "FAILED".asInstanceOf[MatchmakingConfigurationStatus]
  val PLACING = "PLACING".asInstanceOf[MatchmakingConfigurationStatus]
  val QUEUED = "QUEUED".asInstanceOf[MatchmakingConfigurationStatus]
  val REQUIRES_ACCEPTANCE = "REQUIRES_ACCEPTANCE".asInstanceOf[MatchmakingConfigurationStatus]
  val SEARCHING = "SEARCHING".asInstanceOf[MatchmakingConfigurationStatus]
  val TIMED_OUT = "TIMED_OUT".asInstanceOf[MatchmakingConfigurationStatus]

  @inline def values = js.Array(CANCELLED, COMPLETED, FAILED, PLACING, QUEUED, REQUIRES_ACCEPTANCE, SEARCHING, TIMED_OUT)
}

@js.native
sealed trait MetricName extends js.Any
object MetricName {
  val ActivatingGameSessions = "ActivatingGameSessions".asInstanceOf[MetricName]
  val ActiveGameSessions = "ActiveGameSessions".asInstanceOf[MetricName]
  val ActiveInstances = "ActiveInstances".asInstanceOf[MetricName]
  val AvailableGameSessions = "AvailableGameSessions".asInstanceOf[MetricName]
  val AvailablePlayerSessions = "AvailablePlayerSessions".asInstanceOf[MetricName]
  val CurrentPlayerSessions = "CurrentPlayerSessions".asInstanceOf[MetricName]
  val IdleInstances = "IdleInstances".asInstanceOf[MetricName]
  val PercentAvailableGameSessions = "PercentAvailableGameSessions".asInstanceOf[MetricName]
  val PercentIdleInstances = "PercentIdleInstances".asInstanceOf[MetricName]
  val QueueDepth = "QueueDepth".asInstanceOf[MetricName]
  val WaitTime = "WaitTime".asInstanceOf[MetricName]

  @inline def values = js.Array(
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

@js.native
sealed trait OperatingSystem extends js.Any
object OperatingSystem {
  val WINDOWS_2012 = "WINDOWS_2012".asInstanceOf[OperatingSystem]
  val AMAZON_LINUX = "AMAZON_LINUX".asInstanceOf[OperatingSystem]
  val AMAZON_LINUX_2 = "AMAZON_LINUX_2".asInstanceOf[OperatingSystem]

  @inline def values = js.Array(WINDOWS_2012, AMAZON_LINUX, AMAZON_LINUX_2)
}

@js.native
sealed trait PlayerSessionCreationPolicy extends js.Any
object PlayerSessionCreationPolicy {
  val ACCEPT_ALL = "ACCEPT_ALL".asInstanceOf[PlayerSessionCreationPolicy]
  val DENY_ALL = "DENY_ALL".asInstanceOf[PlayerSessionCreationPolicy]

  @inline def values = js.Array(ACCEPT_ALL, DENY_ALL)
}

@js.native
sealed trait PlayerSessionStatus extends js.Any
object PlayerSessionStatus {
  val RESERVED = "RESERVED".asInstanceOf[PlayerSessionStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[PlayerSessionStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[PlayerSessionStatus]
  val TIMEDOUT = "TIMEDOUT".asInstanceOf[PlayerSessionStatus]

  @inline def values = js.Array(RESERVED, ACTIVE, COMPLETED, TIMEDOUT)
}

@js.native
sealed trait PolicyType extends js.Any
object PolicyType {
  val RuleBased = "RuleBased".asInstanceOf[PolicyType]
  val TargetBased = "TargetBased".asInstanceOf[PolicyType]

  @inline def values = js.Array(RuleBased, TargetBased)
}

@js.native
sealed trait PriorityType extends js.Any
object PriorityType {
  val LATENCY = "LATENCY".asInstanceOf[PriorityType]
  val COST = "COST".asInstanceOf[PriorityType]
  val DESTINATION = "DESTINATION".asInstanceOf[PriorityType]
  val LOCATION = "LOCATION".asInstanceOf[PriorityType]

  @inline def values = js.Array(LATENCY, COST, DESTINATION, LOCATION)
}

@js.native
sealed trait ProtectionPolicy extends js.Any
object ProtectionPolicy {
  val NoProtection = "NoProtection".asInstanceOf[ProtectionPolicy]
  val FullProtection = "FullProtection".asInstanceOf[ProtectionPolicy]

  @inline def values = js.Array(NoProtection, FullProtection)
}

@js.native
sealed trait RoutingStrategyType extends js.Any
object RoutingStrategyType {
  val SIMPLE = "SIMPLE".asInstanceOf[RoutingStrategyType]
  val TERMINAL = "TERMINAL".asInstanceOf[RoutingStrategyType]

  @inline def values = js.Array(SIMPLE, TERMINAL)
}

@js.native
sealed trait ScalingAdjustmentType extends js.Any
object ScalingAdjustmentType {
  val ChangeInCapacity = "ChangeInCapacity".asInstanceOf[ScalingAdjustmentType]
  val ExactCapacity = "ExactCapacity".asInstanceOf[ScalingAdjustmentType]
  val PercentChangeInCapacity = "PercentChangeInCapacity".asInstanceOf[ScalingAdjustmentType]

  @inline def values = js.Array(ChangeInCapacity, ExactCapacity, PercentChangeInCapacity)
}

@js.native
sealed trait ScalingStatusType extends js.Any
object ScalingStatusType {
  val ACTIVE = "ACTIVE".asInstanceOf[ScalingStatusType]
  val UPDATE_REQUESTED = "UPDATE_REQUESTED".asInstanceOf[ScalingStatusType]
  val UPDATING = "UPDATING".asInstanceOf[ScalingStatusType]
  val DELETE_REQUESTED = "DELETE_REQUESTED".asInstanceOf[ScalingStatusType]
  val DELETING = "DELETING".asInstanceOf[ScalingStatusType]
  val DELETED = "DELETED".asInstanceOf[ScalingStatusType]
  val ERROR = "ERROR".asInstanceOf[ScalingStatusType]

  @inline def values = js.Array(ACTIVE, UPDATE_REQUESTED, UPDATING, DELETE_REQUESTED, DELETING, DELETED, ERROR)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val ASCENDING = "ASCENDING".asInstanceOf[SortOrder]
  val DESCENDING = "DESCENDING".asInstanceOf[SortOrder]

  @inline def values = js.Array(ASCENDING, DESCENDING)
}
