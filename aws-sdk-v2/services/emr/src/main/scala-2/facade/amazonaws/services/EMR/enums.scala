package facade.amazonaws.services.emr

import scalajs.js

@js.native
sealed trait ActionOnFailure extends js.Any
object ActionOnFailure {
  val TERMINATE_JOB_FLOW = "TERMINATE_JOB_FLOW".asInstanceOf[ActionOnFailure]
  val TERMINATE_CLUSTER = "TERMINATE_CLUSTER".asInstanceOf[ActionOnFailure]
  val CANCEL_AND_WAIT = "CANCEL_AND_WAIT".asInstanceOf[ActionOnFailure]
  val CONTINUE = "CONTINUE".asInstanceOf[ActionOnFailure]

  @inline def values: js.Array[ActionOnFailure] = js.Array(TERMINATE_JOB_FLOW, TERMINATE_CLUSTER, CANCEL_AND_WAIT, CONTINUE)
}

@js.native
sealed trait AdjustmentType extends js.Any
object AdjustmentType {
  val CHANGE_IN_CAPACITY = "CHANGE_IN_CAPACITY".asInstanceOf[AdjustmentType]
  val PERCENT_CHANGE_IN_CAPACITY = "PERCENT_CHANGE_IN_CAPACITY".asInstanceOf[AdjustmentType]
  val EXACT_CAPACITY = "EXACT_CAPACITY".asInstanceOf[AdjustmentType]

  @inline def values: js.Array[AdjustmentType] = js.Array(CHANGE_IN_CAPACITY, PERCENT_CHANGE_IN_CAPACITY, EXACT_CAPACITY)
}

@js.native
sealed trait AuthMode extends js.Any
object AuthMode {
  val SSO = "SSO".asInstanceOf[AuthMode]
  val IAM = "IAM".asInstanceOf[AuthMode]

  @inline def values: js.Array[AuthMode] = js.Array(SSO, IAM)
}

@js.native
sealed trait AutoScalingPolicyState extends js.Any
object AutoScalingPolicyState {
  val PENDING = "PENDING".asInstanceOf[AutoScalingPolicyState]
  val ATTACHING = "ATTACHING".asInstanceOf[AutoScalingPolicyState]
  val ATTACHED = "ATTACHED".asInstanceOf[AutoScalingPolicyState]
  val DETACHING = "DETACHING".asInstanceOf[AutoScalingPolicyState]
  val DETACHED = "DETACHED".asInstanceOf[AutoScalingPolicyState]
  val FAILED = "FAILED".asInstanceOf[AutoScalingPolicyState]

  @inline def values: js.Array[AutoScalingPolicyState] = js.Array(PENDING, ATTACHING, ATTACHED, DETACHING, DETACHED, FAILED)
}

@js.native
sealed trait AutoScalingPolicyStateChangeReasonCode extends js.Any
object AutoScalingPolicyStateChangeReasonCode {
  val USER_REQUEST = "USER_REQUEST".asInstanceOf[AutoScalingPolicyStateChangeReasonCode]
  val PROVISION_FAILURE = "PROVISION_FAILURE".asInstanceOf[AutoScalingPolicyStateChangeReasonCode]
  val CLEANUP_FAILURE = "CLEANUP_FAILURE".asInstanceOf[AutoScalingPolicyStateChangeReasonCode]

  @inline def values: js.Array[AutoScalingPolicyStateChangeReasonCode] = js.Array(USER_REQUEST, PROVISION_FAILURE, CLEANUP_FAILURE)
}

@js.native
sealed trait CancelStepsRequestStatus extends js.Any
object CancelStepsRequestStatus {
  val SUBMITTED = "SUBMITTED".asInstanceOf[CancelStepsRequestStatus]
  val FAILED = "FAILED".asInstanceOf[CancelStepsRequestStatus]

  @inline def values: js.Array[CancelStepsRequestStatus] = js.Array(SUBMITTED, FAILED)
}

@js.native
sealed trait ClusterState extends js.Any
object ClusterState {
  val STARTING = "STARTING".asInstanceOf[ClusterState]
  val BOOTSTRAPPING = "BOOTSTRAPPING".asInstanceOf[ClusterState]
  val RUNNING = "RUNNING".asInstanceOf[ClusterState]
  val WAITING = "WAITING".asInstanceOf[ClusterState]
  val TERMINATING = "TERMINATING".asInstanceOf[ClusterState]
  val TERMINATED = "TERMINATED".asInstanceOf[ClusterState]
  val TERMINATED_WITH_ERRORS = "TERMINATED_WITH_ERRORS".asInstanceOf[ClusterState]

  @inline def values: js.Array[ClusterState] = js.Array(STARTING, BOOTSTRAPPING, RUNNING, WAITING, TERMINATING, TERMINATED, TERMINATED_WITH_ERRORS)
}

@js.native
sealed trait ClusterStateChangeReasonCode extends js.Any
object ClusterStateChangeReasonCode {
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[ClusterStateChangeReasonCode]
  val VALIDATION_ERROR = "VALIDATION_ERROR".asInstanceOf[ClusterStateChangeReasonCode]
  val INSTANCE_FAILURE = "INSTANCE_FAILURE".asInstanceOf[ClusterStateChangeReasonCode]
  val INSTANCE_FLEET_TIMEOUT = "INSTANCE_FLEET_TIMEOUT".asInstanceOf[ClusterStateChangeReasonCode]
  val BOOTSTRAP_FAILURE = "BOOTSTRAP_FAILURE".asInstanceOf[ClusterStateChangeReasonCode]
  val USER_REQUEST = "USER_REQUEST".asInstanceOf[ClusterStateChangeReasonCode]
  val STEP_FAILURE = "STEP_FAILURE".asInstanceOf[ClusterStateChangeReasonCode]
  val ALL_STEPS_COMPLETED = "ALL_STEPS_COMPLETED".asInstanceOf[ClusterStateChangeReasonCode]

  @inline def values: js.Array[ClusterStateChangeReasonCode] = js.Array(INTERNAL_ERROR, VALIDATION_ERROR, INSTANCE_FAILURE, INSTANCE_FLEET_TIMEOUT, BOOTSTRAP_FAILURE, USER_REQUEST, STEP_FAILURE, ALL_STEPS_COMPLETED)
}

@js.native
sealed trait ComparisonOperator extends js.Any
object ComparisonOperator {
  val GREATER_THAN_OR_EQUAL = "GREATER_THAN_OR_EQUAL".asInstanceOf[ComparisonOperator]
  val GREATER_THAN = "GREATER_THAN".asInstanceOf[ComparisonOperator]
  val LESS_THAN = "LESS_THAN".asInstanceOf[ComparisonOperator]
  val LESS_THAN_OR_EQUAL = "LESS_THAN_OR_EQUAL".asInstanceOf[ComparisonOperator]

  @inline def values: js.Array[ComparisonOperator] = js.Array(GREATER_THAN_OR_EQUAL, GREATER_THAN, LESS_THAN, LESS_THAN_OR_EQUAL)
}

@js.native
sealed trait ComputeLimitsUnitType extends js.Any
object ComputeLimitsUnitType {
  val InstanceFleetUnits = "InstanceFleetUnits".asInstanceOf[ComputeLimitsUnitType]
  val Instances = "Instances".asInstanceOf[ComputeLimitsUnitType]
  val VCPU = "VCPU".asInstanceOf[ComputeLimitsUnitType]

  @inline def values: js.Array[ComputeLimitsUnitType] = js.Array(InstanceFleetUnits, Instances, VCPU)
}

@js.native
sealed trait ExecutionEngineType extends js.Any
object ExecutionEngineType {
  val EMR = "EMR".asInstanceOf[ExecutionEngineType]

  @inline def values: js.Array[ExecutionEngineType] = js.Array(EMR)
}

@js.native
sealed trait IdentityType extends js.Any
object IdentityType {
  val USER = "USER".asInstanceOf[IdentityType]
  val GROUP = "GROUP".asInstanceOf[IdentityType]

  @inline def values: js.Array[IdentityType] = js.Array(USER, GROUP)
}

@js.native
sealed trait InstanceCollectionType extends js.Any
object InstanceCollectionType {
  val INSTANCE_FLEET = "INSTANCE_FLEET".asInstanceOf[InstanceCollectionType]
  val INSTANCE_GROUP = "INSTANCE_GROUP".asInstanceOf[InstanceCollectionType]

  @inline def values: js.Array[InstanceCollectionType] = js.Array(INSTANCE_FLEET, INSTANCE_GROUP)
}

@js.native
sealed trait InstanceFleetState extends js.Any
object InstanceFleetState {
  val PROVISIONING = "PROVISIONING".asInstanceOf[InstanceFleetState]
  val BOOTSTRAPPING = "BOOTSTRAPPING".asInstanceOf[InstanceFleetState]
  val RUNNING = "RUNNING".asInstanceOf[InstanceFleetState]
  val RESIZING = "RESIZING".asInstanceOf[InstanceFleetState]
  val SUSPENDED = "SUSPENDED".asInstanceOf[InstanceFleetState]
  val TERMINATING = "TERMINATING".asInstanceOf[InstanceFleetState]
  val TERMINATED = "TERMINATED".asInstanceOf[InstanceFleetState]

  @inline def values: js.Array[InstanceFleetState] = js.Array(PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING, SUSPENDED, TERMINATING, TERMINATED)
}

@js.native
sealed trait InstanceFleetStateChangeReasonCode extends js.Any
object InstanceFleetStateChangeReasonCode {
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[InstanceFleetStateChangeReasonCode]
  val VALIDATION_ERROR = "VALIDATION_ERROR".asInstanceOf[InstanceFleetStateChangeReasonCode]
  val INSTANCE_FAILURE = "INSTANCE_FAILURE".asInstanceOf[InstanceFleetStateChangeReasonCode]
  val CLUSTER_TERMINATED = "CLUSTER_TERMINATED".asInstanceOf[InstanceFleetStateChangeReasonCode]

  @inline def values: js.Array[InstanceFleetStateChangeReasonCode] = js.Array(INTERNAL_ERROR, VALIDATION_ERROR, INSTANCE_FAILURE, CLUSTER_TERMINATED)
}

@js.native
sealed trait InstanceFleetType extends js.Any
object InstanceFleetType {
  val MASTER = "MASTER".asInstanceOf[InstanceFleetType]
  val CORE = "CORE".asInstanceOf[InstanceFleetType]
  val TASK = "TASK".asInstanceOf[InstanceFleetType]

  @inline def values: js.Array[InstanceFleetType] = js.Array(MASTER, CORE, TASK)
}

@js.native
sealed trait InstanceGroupState extends js.Any
object InstanceGroupState {
  val PROVISIONING = "PROVISIONING".asInstanceOf[InstanceGroupState]
  val BOOTSTRAPPING = "BOOTSTRAPPING".asInstanceOf[InstanceGroupState]
  val RUNNING = "RUNNING".asInstanceOf[InstanceGroupState]
  val RECONFIGURING = "RECONFIGURING".asInstanceOf[InstanceGroupState]
  val RESIZING = "RESIZING".asInstanceOf[InstanceGroupState]
  val SUSPENDED = "SUSPENDED".asInstanceOf[InstanceGroupState]
  val TERMINATING = "TERMINATING".asInstanceOf[InstanceGroupState]
  val TERMINATED = "TERMINATED".asInstanceOf[InstanceGroupState]
  val ARRESTED = "ARRESTED".asInstanceOf[InstanceGroupState]
  val SHUTTING_DOWN = "SHUTTING_DOWN".asInstanceOf[InstanceGroupState]
  val ENDED = "ENDED".asInstanceOf[InstanceGroupState]

  @inline def values: js.Array[InstanceGroupState] = js.Array(PROVISIONING, BOOTSTRAPPING, RUNNING, RECONFIGURING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED, SHUTTING_DOWN, ENDED)
}

@js.native
sealed trait InstanceGroupStateChangeReasonCode extends js.Any
object InstanceGroupStateChangeReasonCode {
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[InstanceGroupStateChangeReasonCode]
  val VALIDATION_ERROR = "VALIDATION_ERROR".asInstanceOf[InstanceGroupStateChangeReasonCode]
  val INSTANCE_FAILURE = "INSTANCE_FAILURE".asInstanceOf[InstanceGroupStateChangeReasonCode]
  val CLUSTER_TERMINATED = "CLUSTER_TERMINATED".asInstanceOf[InstanceGroupStateChangeReasonCode]

  @inline def values: js.Array[InstanceGroupStateChangeReasonCode] = js.Array(INTERNAL_ERROR, VALIDATION_ERROR, INSTANCE_FAILURE, CLUSTER_TERMINATED)
}

@js.native
sealed trait InstanceGroupType extends js.Any
object InstanceGroupType {
  val MASTER = "MASTER".asInstanceOf[InstanceGroupType]
  val CORE = "CORE".asInstanceOf[InstanceGroupType]
  val TASK = "TASK".asInstanceOf[InstanceGroupType]

  @inline def values: js.Array[InstanceGroupType] = js.Array(MASTER, CORE, TASK)
}

@js.native
sealed trait InstanceRoleType extends js.Any
object InstanceRoleType {
  val MASTER = "MASTER".asInstanceOf[InstanceRoleType]
  val CORE = "CORE".asInstanceOf[InstanceRoleType]
  val TASK = "TASK".asInstanceOf[InstanceRoleType]

  @inline def values: js.Array[InstanceRoleType] = js.Array(MASTER, CORE, TASK)
}

@js.native
sealed trait InstanceState extends js.Any
object InstanceState {
  val AWAITING_FULFILLMENT = "AWAITING_FULFILLMENT".asInstanceOf[InstanceState]
  val PROVISIONING = "PROVISIONING".asInstanceOf[InstanceState]
  val BOOTSTRAPPING = "BOOTSTRAPPING".asInstanceOf[InstanceState]
  val RUNNING = "RUNNING".asInstanceOf[InstanceState]
  val TERMINATED = "TERMINATED".asInstanceOf[InstanceState]

  @inline def values: js.Array[InstanceState] = js.Array(AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING, TERMINATED)
}

@js.native
sealed trait InstanceStateChangeReasonCode extends js.Any
object InstanceStateChangeReasonCode {
  val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[InstanceStateChangeReasonCode]
  val VALIDATION_ERROR = "VALIDATION_ERROR".asInstanceOf[InstanceStateChangeReasonCode]
  val INSTANCE_FAILURE = "INSTANCE_FAILURE".asInstanceOf[InstanceStateChangeReasonCode]
  val BOOTSTRAP_FAILURE = "BOOTSTRAP_FAILURE".asInstanceOf[InstanceStateChangeReasonCode]
  val CLUSTER_TERMINATED = "CLUSTER_TERMINATED".asInstanceOf[InstanceStateChangeReasonCode]

  @inline def values: js.Array[InstanceStateChangeReasonCode] = js.Array(INTERNAL_ERROR, VALIDATION_ERROR, INSTANCE_FAILURE, BOOTSTRAP_FAILURE, CLUSTER_TERMINATED)
}

/** The type of instance.
  */
@js.native
sealed trait JobFlowExecutionState extends js.Any
object JobFlowExecutionState {
  val STARTING = "STARTING".asInstanceOf[JobFlowExecutionState]
  val BOOTSTRAPPING = "BOOTSTRAPPING".asInstanceOf[JobFlowExecutionState]
  val RUNNING = "RUNNING".asInstanceOf[JobFlowExecutionState]
  val WAITING = "WAITING".asInstanceOf[JobFlowExecutionState]
  val SHUTTING_DOWN = "SHUTTING_DOWN".asInstanceOf[JobFlowExecutionState]
  val TERMINATED = "TERMINATED".asInstanceOf[JobFlowExecutionState]
  val COMPLETED = "COMPLETED".asInstanceOf[JobFlowExecutionState]
  val FAILED = "FAILED".asInstanceOf[JobFlowExecutionState]

  @inline def values: js.Array[JobFlowExecutionState] = js.Array(STARTING, BOOTSTRAPPING, RUNNING, WAITING, SHUTTING_DOWN, TERMINATED, COMPLETED, FAILED)
}

@js.native
sealed trait MarketType extends js.Any
object MarketType {
  val ON_DEMAND = "ON_DEMAND".asInstanceOf[MarketType]
  val SPOT = "SPOT".asInstanceOf[MarketType]

  @inline def values: js.Array[MarketType] = js.Array(ON_DEMAND, SPOT)
}

@js.native
sealed trait NotebookExecutionStatus extends js.Any
object NotebookExecutionStatus {
  val START_PENDING = "START_PENDING".asInstanceOf[NotebookExecutionStatus]
  val STARTING = "STARTING".asInstanceOf[NotebookExecutionStatus]
  val RUNNING = "RUNNING".asInstanceOf[NotebookExecutionStatus]
  val FINISHING = "FINISHING".asInstanceOf[NotebookExecutionStatus]
  val FINISHED = "FINISHED".asInstanceOf[NotebookExecutionStatus]
  val FAILING = "FAILING".asInstanceOf[NotebookExecutionStatus]
  val FAILED = "FAILED".asInstanceOf[NotebookExecutionStatus]
  val STOP_PENDING = "STOP_PENDING".asInstanceOf[NotebookExecutionStatus]
  val STOPPING = "STOPPING".asInstanceOf[NotebookExecutionStatus]
  val STOPPED = "STOPPED".asInstanceOf[NotebookExecutionStatus]

  @inline def values: js.Array[NotebookExecutionStatus] = js.Array(START_PENDING, STARTING, RUNNING, FINISHING, FINISHED, FAILING, FAILED, STOP_PENDING, STOPPING, STOPPED)
}

@js.native
sealed trait OnDemandCapacityReservationPreference extends js.Any
object OnDemandCapacityReservationPreference {
  val open = "open".asInstanceOf[OnDemandCapacityReservationPreference]
  val none = "none".asInstanceOf[OnDemandCapacityReservationPreference]

  @inline def values: js.Array[OnDemandCapacityReservationPreference] = js.Array(open, none)
}

@js.native
sealed trait OnDemandCapacityReservationUsageStrategy extends js.Any
object OnDemandCapacityReservationUsageStrategy {
  val `use-capacity-reservations-first` = "use-capacity-reservations-first".asInstanceOf[OnDemandCapacityReservationUsageStrategy]

  @inline def values: js.Array[OnDemandCapacityReservationUsageStrategy] = js.Array(`use-capacity-reservations-first`)
}

@js.native
sealed trait OnDemandProvisioningAllocationStrategy extends js.Any
object OnDemandProvisioningAllocationStrategy {
  val `lowest-price` = "lowest-price".asInstanceOf[OnDemandProvisioningAllocationStrategy]

  @inline def values: js.Array[OnDemandProvisioningAllocationStrategy] = js.Array(`lowest-price`)
}

@js.native
sealed trait PlacementGroupStrategy extends js.Any
object PlacementGroupStrategy {
  val SPREAD = "SPREAD".asInstanceOf[PlacementGroupStrategy]
  val PARTITION = "PARTITION".asInstanceOf[PlacementGroupStrategy]
  val CLUSTER = "CLUSTER".asInstanceOf[PlacementGroupStrategy]
  val NONE = "NONE".asInstanceOf[PlacementGroupStrategy]

  @inline def values: js.Array[PlacementGroupStrategy] = js.Array(SPREAD, PARTITION, CLUSTER, NONE)
}

@js.native
sealed trait ReconfigurationType extends js.Any
object ReconfigurationType {
  val OVERWRITE = "OVERWRITE".asInstanceOf[ReconfigurationType]
  val MERGE = "MERGE".asInstanceOf[ReconfigurationType]

  @inline def values: js.Array[ReconfigurationType] = js.Array(OVERWRITE, MERGE)
}

@js.native
sealed trait RepoUpgradeOnBoot extends js.Any
object RepoUpgradeOnBoot {
  val SECURITY = "SECURITY".asInstanceOf[RepoUpgradeOnBoot]
  val NONE = "NONE".asInstanceOf[RepoUpgradeOnBoot]

  @inline def values: js.Array[RepoUpgradeOnBoot] = js.Array(SECURITY, NONE)
}

@js.native
sealed trait ScaleDownBehavior extends js.Any
object ScaleDownBehavior {
  val TERMINATE_AT_INSTANCE_HOUR = "TERMINATE_AT_INSTANCE_HOUR".asInstanceOf[ScaleDownBehavior]
  val TERMINATE_AT_TASK_COMPLETION = "TERMINATE_AT_TASK_COMPLETION".asInstanceOf[ScaleDownBehavior]

  @inline def values: js.Array[ScaleDownBehavior] = js.Array(TERMINATE_AT_INSTANCE_HOUR, TERMINATE_AT_TASK_COMPLETION)
}

@js.native
sealed trait SpotProvisioningAllocationStrategy extends js.Any
object SpotProvisioningAllocationStrategy {
  val `capacity-optimized` = "capacity-optimized".asInstanceOf[SpotProvisioningAllocationStrategy]

  @inline def values: js.Array[SpotProvisioningAllocationStrategy] = js.Array(`capacity-optimized`)
}

@js.native
sealed trait SpotProvisioningTimeoutAction extends js.Any
object SpotProvisioningTimeoutAction {
  val SWITCH_TO_ON_DEMAND = "SWITCH_TO_ON_DEMAND".asInstanceOf[SpotProvisioningTimeoutAction]
  val TERMINATE_CLUSTER = "TERMINATE_CLUSTER".asInstanceOf[SpotProvisioningTimeoutAction]

  @inline def values: js.Array[SpotProvisioningTimeoutAction] = js.Array(SWITCH_TO_ON_DEMAND, TERMINATE_CLUSTER)
}

@js.native
sealed trait Statistic extends js.Any
object Statistic {
  val SAMPLE_COUNT = "SAMPLE_COUNT".asInstanceOf[Statistic]
  val AVERAGE = "AVERAGE".asInstanceOf[Statistic]
  val SUM = "SUM".asInstanceOf[Statistic]
  val MINIMUM = "MINIMUM".asInstanceOf[Statistic]
  val MAXIMUM = "MAXIMUM".asInstanceOf[Statistic]

  @inline def values: js.Array[Statistic] = js.Array(SAMPLE_COUNT, AVERAGE, SUM, MINIMUM, MAXIMUM)
}

@js.native
sealed trait StepCancellationOption extends js.Any
object StepCancellationOption {
  val SEND_INTERRUPT = "SEND_INTERRUPT".asInstanceOf[StepCancellationOption]
  val TERMINATE_PROCESS = "TERMINATE_PROCESS".asInstanceOf[StepCancellationOption]

  @inline def values: js.Array[StepCancellationOption] = js.Array(SEND_INTERRUPT, TERMINATE_PROCESS)
}

@js.native
sealed trait StepExecutionState extends js.Any
object StepExecutionState {
  val PENDING = "PENDING".asInstanceOf[StepExecutionState]
  val RUNNING = "RUNNING".asInstanceOf[StepExecutionState]
  val CONTINUE = "CONTINUE".asInstanceOf[StepExecutionState]
  val COMPLETED = "COMPLETED".asInstanceOf[StepExecutionState]
  val CANCELLED = "CANCELLED".asInstanceOf[StepExecutionState]
  val FAILED = "FAILED".asInstanceOf[StepExecutionState]
  val INTERRUPTED = "INTERRUPTED".asInstanceOf[StepExecutionState]

  @inline def values: js.Array[StepExecutionState] = js.Array(PENDING, RUNNING, CONTINUE, COMPLETED, CANCELLED, FAILED, INTERRUPTED)
}

@js.native
sealed trait StepState extends js.Any
object StepState {
  val PENDING = "PENDING".asInstanceOf[StepState]
  val CANCEL_PENDING = "CANCEL_PENDING".asInstanceOf[StepState]
  val RUNNING = "RUNNING".asInstanceOf[StepState]
  val COMPLETED = "COMPLETED".asInstanceOf[StepState]
  val CANCELLED = "CANCELLED".asInstanceOf[StepState]
  val FAILED = "FAILED".asInstanceOf[StepState]
  val INTERRUPTED = "INTERRUPTED".asInstanceOf[StepState]

  @inline def values: js.Array[StepState] = js.Array(PENDING, CANCEL_PENDING, RUNNING, COMPLETED, CANCELLED, FAILED, INTERRUPTED)
}

@js.native
sealed trait StepStateChangeReasonCode extends js.Any
object StepStateChangeReasonCode {
  val NONE = "NONE".asInstanceOf[StepStateChangeReasonCode]

  @inline def values: js.Array[StepStateChangeReasonCode] = js.Array(NONE)
}

@js.native
sealed trait Unit extends js.Any
object Unit {
  val NONE = "NONE".asInstanceOf[Unit]
  val SECONDS = "SECONDS".asInstanceOf[Unit]
  val MICRO_SECONDS = "MICRO_SECONDS".asInstanceOf[Unit]
  val MILLI_SECONDS = "MILLI_SECONDS".asInstanceOf[Unit]
  val BYTES = "BYTES".asInstanceOf[Unit]
  val KILO_BYTES = "KILO_BYTES".asInstanceOf[Unit]
  val MEGA_BYTES = "MEGA_BYTES".asInstanceOf[Unit]
  val GIGA_BYTES = "GIGA_BYTES".asInstanceOf[Unit]
  val TERA_BYTES = "TERA_BYTES".asInstanceOf[Unit]
  val BITS = "BITS".asInstanceOf[Unit]
  val KILO_BITS = "KILO_BITS".asInstanceOf[Unit]
  val MEGA_BITS = "MEGA_BITS".asInstanceOf[Unit]
  val GIGA_BITS = "GIGA_BITS".asInstanceOf[Unit]
  val TERA_BITS = "TERA_BITS".asInstanceOf[Unit]
  val PERCENT = "PERCENT".asInstanceOf[Unit]
  val COUNT = "COUNT".asInstanceOf[Unit]
  val BYTES_PER_SECOND = "BYTES_PER_SECOND".asInstanceOf[Unit]
  val KILO_BYTES_PER_SECOND = "KILO_BYTES_PER_SECOND".asInstanceOf[Unit]
  val MEGA_BYTES_PER_SECOND = "MEGA_BYTES_PER_SECOND".asInstanceOf[Unit]
  val GIGA_BYTES_PER_SECOND = "GIGA_BYTES_PER_SECOND".asInstanceOf[Unit]
  val TERA_BYTES_PER_SECOND = "TERA_BYTES_PER_SECOND".asInstanceOf[Unit]
  val BITS_PER_SECOND = "BITS_PER_SECOND".asInstanceOf[Unit]
  val KILO_BITS_PER_SECOND = "KILO_BITS_PER_SECOND".asInstanceOf[Unit]
  val MEGA_BITS_PER_SECOND = "MEGA_BITS_PER_SECOND".asInstanceOf[Unit]
  val GIGA_BITS_PER_SECOND = "GIGA_BITS_PER_SECOND".asInstanceOf[Unit]
  val TERA_BITS_PER_SECOND = "TERA_BITS_PER_SECOND".asInstanceOf[Unit]
  val COUNT_PER_SECOND = "COUNT_PER_SECOND".asInstanceOf[Unit]

  @inline def values: js.Array[Unit] = js.Array(
    NONE,
    SECONDS,
    MICRO_SECONDS,
    MILLI_SECONDS,
    BYTES,
    KILO_BYTES,
    MEGA_BYTES,
    GIGA_BYTES,
    TERA_BYTES,
    BITS,
    KILO_BITS,
    MEGA_BITS,
    GIGA_BITS,
    TERA_BITS,
    PERCENT,
    COUNT,
    BYTES_PER_SECOND,
    KILO_BYTES_PER_SECOND,
    MEGA_BYTES_PER_SECOND,
    GIGA_BYTES_PER_SECOND,
    TERA_BYTES_PER_SECOND,
    BITS_PER_SECOND,
    KILO_BITS_PER_SECOND,
    MEGA_BITS_PER_SECOND,
    GIGA_BITS_PER_SECOND,
    TERA_BITS_PER_SECOND,
    COUNT_PER_SECOND
  )
}
