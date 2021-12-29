package facade.amazonaws.services.emr

import scalajs._

type ActionOnFailure = "TERMINATE_JOB_FLOW" | "TERMINATE_CLUSTER" | "CANCEL_AND_WAIT" | "CONTINUE"
object ActionOnFailure {
  val TERMINATE_JOB_FLOW: "TERMINATE_JOB_FLOW" = "TERMINATE_JOB_FLOW"
  val TERMINATE_CLUSTER: "TERMINATE_CLUSTER" = "TERMINATE_CLUSTER"
  val CANCEL_AND_WAIT: "CANCEL_AND_WAIT" = "CANCEL_AND_WAIT"
  val CONTINUE: "CONTINUE" = "CONTINUE"

  @inline def values = js.Array[ActionOnFailure](TERMINATE_JOB_FLOW, TERMINATE_CLUSTER, CANCEL_AND_WAIT, CONTINUE)
}

type AdjustmentType = "CHANGE_IN_CAPACITY" | "PERCENT_CHANGE_IN_CAPACITY" | "EXACT_CAPACITY"
object AdjustmentType {
  val CHANGE_IN_CAPACITY: "CHANGE_IN_CAPACITY" = "CHANGE_IN_CAPACITY"
  val PERCENT_CHANGE_IN_CAPACITY: "PERCENT_CHANGE_IN_CAPACITY" = "PERCENT_CHANGE_IN_CAPACITY"
  val EXACT_CAPACITY: "EXACT_CAPACITY" = "EXACT_CAPACITY"

  @inline def values = js.Array[AdjustmentType](CHANGE_IN_CAPACITY, PERCENT_CHANGE_IN_CAPACITY, EXACT_CAPACITY)
}

type AuthMode = "SSO" | "IAM"
object AuthMode {
  val SSO: "SSO" = "SSO"
  val IAM: "IAM" = "IAM"

  @inline def values = js.Array[AuthMode](SSO, IAM)
}

type AutoScalingPolicyState = "PENDING" | "ATTACHING" | "ATTACHED" | "DETACHING" | "DETACHED" | "FAILED"
object AutoScalingPolicyState {
  val PENDING: "PENDING" = "PENDING"
  val ATTACHING: "ATTACHING" = "ATTACHING"
  val ATTACHED: "ATTACHED" = "ATTACHED"
  val DETACHING: "DETACHING" = "DETACHING"
  val DETACHED: "DETACHED" = "DETACHED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[AutoScalingPolicyState](PENDING, ATTACHING, ATTACHED, DETACHING, DETACHED, FAILED)
}

type AutoScalingPolicyStateChangeReasonCode = "USER_REQUEST" | "PROVISION_FAILURE" | "CLEANUP_FAILURE"
object AutoScalingPolicyStateChangeReasonCode {
  val USER_REQUEST: "USER_REQUEST" = "USER_REQUEST"
  val PROVISION_FAILURE: "PROVISION_FAILURE" = "PROVISION_FAILURE"
  val CLEANUP_FAILURE: "CLEANUP_FAILURE" = "CLEANUP_FAILURE"

  @inline def values = js.Array[AutoScalingPolicyStateChangeReasonCode](USER_REQUEST, PROVISION_FAILURE, CLEANUP_FAILURE)
}

type CancelStepsRequestStatus = "SUBMITTED" | "FAILED"
object CancelStepsRequestStatus {
  val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[CancelStepsRequestStatus](SUBMITTED, FAILED)
}

type ClusterState = "STARTING" | "BOOTSTRAPPING" | "RUNNING" | "WAITING" | "TERMINATING" | "TERMINATED" | "TERMINATED_WITH_ERRORS"
object ClusterState {
  val STARTING: "STARTING" = "STARTING"
  val BOOTSTRAPPING: "BOOTSTRAPPING" = "BOOTSTRAPPING"
  val RUNNING: "RUNNING" = "RUNNING"
  val WAITING: "WAITING" = "WAITING"
  val TERMINATING: "TERMINATING" = "TERMINATING"
  val TERMINATED: "TERMINATED" = "TERMINATED"
  val TERMINATED_WITH_ERRORS: "TERMINATED_WITH_ERRORS" = "TERMINATED_WITH_ERRORS"

  @inline def values = js.Array[ClusterState](STARTING, BOOTSTRAPPING, RUNNING, WAITING, TERMINATING, TERMINATED, TERMINATED_WITH_ERRORS)
}

type ClusterStateChangeReasonCode = "INTERNAL_ERROR" | "VALIDATION_ERROR" | "INSTANCE_FAILURE" | "INSTANCE_FLEET_TIMEOUT" | "BOOTSTRAP_FAILURE" | "USER_REQUEST" | "STEP_FAILURE" | "ALL_STEPS_COMPLETED"
object ClusterStateChangeReasonCode {
  val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  val VALIDATION_ERROR: "VALIDATION_ERROR" = "VALIDATION_ERROR"
  val INSTANCE_FAILURE: "INSTANCE_FAILURE" = "INSTANCE_FAILURE"
  val INSTANCE_FLEET_TIMEOUT: "INSTANCE_FLEET_TIMEOUT" = "INSTANCE_FLEET_TIMEOUT"
  val BOOTSTRAP_FAILURE: "BOOTSTRAP_FAILURE" = "BOOTSTRAP_FAILURE"
  val USER_REQUEST: "USER_REQUEST" = "USER_REQUEST"
  val STEP_FAILURE: "STEP_FAILURE" = "STEP_FAILURE"
  val ALL_STEPS_COMPLETED: "ALL_STEPS_COMPLETED" = "ALL_STEPS_COMPLETED"

  @inline def values = js.Array[ClusterStateChangeReasonCode](INTERNAL_ERROR, VALIDATION_ERROR, INSTANCE_FAILURE, INSTANCE_FLEET_TIMEOUT, BOOTSTRAP_FAILURE, USER_REQUEST, STEP_FAILURE, ALL_STEPS_COMPLETED)
}

type ComparisonOperator = "GREATER_THAN_OR_EQUAL" | "GREATER_THAN" | "LESS_THAN" | "LESS_THAN_OR_EQUAL"
object ComparisonOperator {
  val GREATER_THAN_OR_EQUAL: "GREATER_THAN_OR_EQUAL" = "GREATER_THAN_OR_EQUAL"
  val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"
  val LESS_THAN: "LESS_THAN" = "LESS_THAN"
  val LESS_THAN_OR_EQUAL: "LESS_THAN_OR_EQUAL" = "LESS_THAN_OR_EQUAL"

  @inline def values = js.Array[ComparisonOperator](GREATER_THAN_OR_EQUAL, GREATER_THAN, LESS_THAN, LESS_THAN_OR_EQUAL)
}

type ComputeLimitsUnitType = "InstanceFleetUnits" | "Instances" | "VCPU"
object ComputeLimitsUnitType {
  val InstanceFleetUnits: "InstanceFleetUnits" = "InstanceFleetUnits"
  val Instances: "Instances" = "Instances"
  val VCPU: "VCPU" = "VCPU"

  @inline def values = js.Array[ComputeLimitsUnitType](InstanceFleetUnits, Instances, VCPU)
}

type ExecutionEngineType = "EMR"
object ExecutionEngineType {
  val EMR: "EMR" = "EMR"

  @inline def values = js.Array[ExecutionEngineType](EMR)
}

type IdentityType = "USER" | "GROUP"
object IdentityType {
  val USER: "USER" = "USER"
  val GROUP: "GROUP" = "GROUP"

  @inline def values = js.Array[IdentityType](USER, GROUP)
}

type InstanceCollectionType = "INSTANCE_FLEET" | "INSTANCE_GROUP"
object InstanceCollectionType {
  val INSTANCE_FLEET: "INSTANCE_FLEET" = "INSTANCE_FLEET"
  val INSTANCE_GROUP: "INSTANCE_GROUP" = "INSTANCE_GROUP"

  @inline def values = js.Array[InstanceCollectionType](INSTANCE_FLEET, INSTANCE_GROUP)
}

type InstanceFleetState = "PROVISIONING" | "BOOTSTRAPPING" | "RUNNING" | "RESIZING" | "SUSPENDED" | "TERMINATING" | "TERMINATED"
object InstanceFleetState {
  val PROVISIONING: "PROVISIONING" = "PROVISIONING"
  val BOOTSTRAPPING: "BOOTSTRAPPING" = "BOOTSTRAPPING"
  val RUNNING: "RUNNING" = "RUNNING"
  val RESIZING: "RESIZING" = "RESIZING"
  val SUSPENDED: "SUSPENDED" = "SUSPENDED"
  val TERMINATING: "TERMINATING" = "TERMINATING"
  val TERMINATED: "TERMINATED" = "TERMINATED"

  @inline def values = js.Array[InstanceFleetState](PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING, SUSPENDED, TERMINATING, TERMINATED)
}

type InstanceFleetStateChangeReasonCode = "INTERNAL_ERROR" | "VALIDATION_ERROR" | "INSTANCE_FAILURE" | "CLUSTER_TERMINATED"
object InstanceFleetStateChangeReasonCode {
  val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  val VALIDATION_ERROR: "VALIDATION_ERROR" = "VALIDATION_ERROR"
  val INSTANCE_FAILURE: "INSTANCE_FAILURE" = "INSTANCE_FAILURE"
  val CLUSTER_TERMINATED: "CLUSTER_TERMINATED" = "CLUSTER_TERMINATED"

  @inline def values = js.Array[InstanceFleetStateChangeReasonCode](INTERNAL_ERROR, VALIDATION_ERROR, INSTANCE_FAILURE, CLUSTER_TERMINATED)
}

type InstanceFleetType = "MASTER" | "CORE" | "TASK"
object InstanceFleetType {
  val MASTER: "MASTER" = "MASTER"
  val CORE: "CORE" = "CORE"
  val TASK: "TASK" = "TASK"

  @inline def values = js.Array[InstanceFleetType](MASTER, CORE, TASK)
}

type InstanceGroupState = "PROVISIONING" | "BOOTSTRAPPING" | "RUNNING" | "RECONFIGURING" | "RESIZING" | "SUSPENDED" | "TERMINATING" | "TERMINATED" | "ARRESTED" | "SHUTTING_DOWN" | "ENDED"
object InstanceGroupState {
  val PROVISIONING: "PROVISIONING" = "PROVISIONING"
  val BOOTSTRAPPING: "BOOTSTRAPPING" = "BOOTSTRAPPING"
  val RUNNING: "RUNNING" = "RUNNING"
  val RECONFIGURING: "RECONFIGURING" = "RECONFIGURING"
  val RESIZING: "RESIZING" = "RESIZING"
  val SUSPENDED: "SUSPENDED" = "SUSPENDED"
  val TERMINATING: "TERMINATING" = "TERMINATING"
  val TERMINATED: "TERMINATED" = "TERMINATED"
  val ARRESTED: "ARRESTED" = "ARRESTED"
  val SHUTTING_DOWN: "SHUTTING_DOWN" = "SHUTTING_DOWN"
  val ENDED: "ENDED" = "ENDED"

  @inline def values = js.Array[InstanceGroupState](PROVISIONING, BOOTSTRAPPING, RUNNING, RECONFIGURING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED, SHUTTING_DOWN, ENDED)
}

type InstanceGroupStateChangeReasonCode = "INTERNAL_ERROR" | "VALIDATION_ERROR" | "INSTANCE_FAILURE" | "CLUSTER_TERMINATED"
object InstanceGroupStateChangeReasonCode {
  val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  val VALIDATION_ERROR: "VALIDATION_ERROR" = "VALIDATION_ERROR"
  val INSTANCE_FAILURE: "INSTANCE_FAILURE" = "INSTANCE_FAILURE"
  val CLUSTER_TERMINATED: "CLUSTER_TERMINATED" = "CLUSTER_TERMINATED"

  @inline def values = js.Array[InstanceGroupStateChangeReasonCode](INTERNAL_ERROR, VALIDATION_ERROR, INSTANCE_FAILURE, CLUSTER_TERMINATED)
}

type InstanceGroupType = "MASTER" | "CORE" | "TASK"
object InstanceGroupType {
  val MASTER: "MASTER" = "MASTER"
  val CORE: "CORE" = "CORE"
  val TASK: "TASK" = "TASK"

  @inline def values = js.Array[InstanceGroupType](MASTER, CORE, TASK)
}

type InstanceRoleType = "MASTER" | "CORE" | "TASK"
object InstanceRoleType {
  val MASTER: "MASTER" = "MASTER"
  val CORE: "CORE" = "CORE"
  val TASK: "TASK" = "TASK"

  @inline def values = js.Array[InstanceRoleType](MASTER, CORE, TASK)
}

type InstanceState = "AWAITING_FULFILLMENT" | "PROVISIONING" | "BOOTSTRAPPING" | "RUNNING" | "TERMINATED"
object InstanceState {
  val AWAITING_FULFILLMENT: "AWAITING_FULFILLMENT" = "AWAITING_FULFILLMENT"
  val PROVISIONING: "PROVISIONING" = "PROVISIONING"
  val BOOTSTRAPPING: "BOOTSTRAPPING" = "BOOTSTRAPPING"
  val RUNNING: "RUNNING" = "RUNNING"
  val TERMINATED: "TERMINATED" = "TERMINATED"

  @inline def values = js.Array[InstanceState](AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING, TERMINATED)
}

type InstanceStateChangeReasonCode = "INTERNAL_ERROR" | "VALIDATION_ERROR" | "INSTANCE_FAILURE" | "BOOTSTRAP_FAILURE" | "CLUSTER_TERMINATED"
object InstanceStateChangeReasonCode {
  val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  val VALIDATION_ERROR: "VALIDATION_ERROR" = "VALIDATION_ERROR"
  val INSTANCE_FAILURE: "INSTANCE_FAILURE" = "INSTANCE_FAILURE"
  val BOOTSTRAP_FAILURE: "BOOTSTRAP_FAILURE" = "BOOTSTRAP_FAILURE"
  val CLUSTER_TERMINATED: "CLUSTER_TERMINATED" = "CLUSTER_TERMINATED"

  @inline def values = js.Array[InstanceStateChangeReasonCode](INTERNAL_ERROR, VALIDATION_ERROR, INSTANCE_FAILURE, BOOTSTRAP_FAILURE, CLUSTER_TERMINATED)
}

/** The type of instance.
  */
type JobFlowExecutionState = "STARTING" | "BOOTSTRAPPING" | "RUNNING" | "WAITING" | "SHUTTING_DOWN" | "TERMINATED" | "COMPLETED" | "FAILED"
object JobFlowExecutionState {
  val STARTING: "STARTING" = "STARTING"
  val BOOTSTRAPPING: "BOOTSTRAPPING" = "BOOTSTRAPPING"
  val RUNNING: "RUNNING" = "RUNNING"
  val WAITING: "WAITING" = "WAITING"
  val SHUTTING_DOWN: "SHUTTING_DOWN" = "SHUTTING_DOWN"
  val TERMINATED: "TERMINATED" = "TERMINATED"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[JobFlowExecutionState](STARTING, BOOTSTRAPPING, RUNNING, WAITING, SHUTTING_DOWN, TERMINATED, COMPLETED, FAILED)
}

type MarketType = "ON_DEMAND" | "SPOT"
object MarketType {
  val ON_DEMAND: "ON_DEMAND" = "ON_DEMAND"
  val SPOT: "SPOT" = "SPOT"

  @inline def values = js.Array[MarketType](ON_DEMAND, SPOT)
}

type NotebookExecutionStatus = "START_PENDING" | "STARTING" | "RUNNING" | "FINISHING" | "FINISHED" | "FAILING" | "FAILED" | "STOP_PENDING" | "STOPPING" | "STOPPED"
object NotebookExecutionStatus {
  val START_PENDING: "START_PENDING" = "START_PENDING"
  val STARTING: "STARTING" = "STARTING"
  val RUNNING: "RUNNING" = "RUNNING"
  val FINISHING: "FINISHING" = "FINISHING"
  val FINISHED: "FINISHED" = "FINISHED"
  val FAILING: "FAILING" = "FAILING"
  val FAILED: "FAILED" = "FAILED"
  val STOP_PENDING: "STOP_PENDING" = "STOP_PENDING"
  val STOPPING: "STOPPING" = "STOPPING"
  val STOPPED: "STOPPED" = "STOPPED"

  @inline def values = js.Array[NotebookExecutionStatus](START_PENDING, STARTING, RUNNING, FINISHING, FINISHED, FAILING, FAILED, STOP_PENDING, STOPPING, STOPPED)
}

type OnDemandCapacityReservationPreference = "open" | "none"
object OnDemandCapacityReservationPreference {
  val open: "open" = "open"
  val none: "none" = "none"

  @inline def values = js.Array[OnDemandCapacityReservationPreference](open, none)
}

type OnDemandCapacityReservationUsageStrategy = "use-capacity-reservations-first"
object OnDemandCapacityReservationUsageStrategy {
  val `use-capacity-reservations-first`: "use-capacity-reservations-first" = "use-capacity-reservations-first"

  @inline def values = js.Array[OnDemandCapacityReservationUsageStrategy](`use-capacity-reservations-first`)
}

type OnDemandProvisioningAllocationStrategy = "lowest-price"
object OnDemandProvisioningAllocationStrategy {
  val `lowest-price`: "lowest-price" = "lowest-price"

  @inline def values = js.Array[OnDemandProvisioningAllocationStrategy](`lowest-price`)
}

type PlacementGroupStrategy = "SPREAD" | "PARTITION" | "CLUSTER" | "NONE"
object PlacementGroupStrategy {
  val SPREAD: "SPREAD" = "SPREAD"
  val PARTITION: "PARTITION" = "PARTITION"
  val CLUSTER: "CLUSTER" = "CLUSTER"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[PlacementGroupStrategy](SPREAD, PARTITION, CLUSTER, NONE)
}

type RepoUpgradeOnBoot = "SECURITY" | "NONE"
object RepoUpgradeOnBoot {
  val SECURITY: "SECURITY" = "SECURITY"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[RepoUpgradeOnBoot](SECURITY, NONE)
}

type ScaleDownBehavior = "TERMINATE_AT_INSTANCE_HOUR" | "TERMINATE_AT_TASK_COMPLETION"
object ScaleDownBehavior {
  val TERMINATE_AT_INSTANCE_HOUR: "TERMINATE_AT_INSTANCE_HOUR" = "TERMINATE_AT_INSTANCE_HOUR"
  val TERMINATE_AT_TASK_COMPLETION: "TERMINATE_AT_TASK_COMPLETION" = "TERMINATE_AT_TASK_COMPLETION"

  @inline def values = js.Array[ScaleDownBehavior](TERMINATE_AT_INSTANCE_HOUR, TERMINATE_AT_TASK_COMPLETION)
}

type SpotProvisioningAllocationStrategy = "capacity-optimized"
object SpotProvisioningAllocationStrategy {
  val `capacity-optimized`: "capacity-optimized" = "capacity-optimized"

  @inline def values = js.Array[SpotProvisioningAllocationStrategy](`capacity-optimized`)
}

type SpotProvisioningTimeoutAction = "SWITCH_TO_ON_DEMAND" | "TERMINATE_CLUSTER"
object SpotProvisioningTimeoutAction {
  val SWITCH_TO_ON_DEMAND: "SWITCH_TO_ON_DEMAND" = "SWITCH_TO_ON_DEMAND"
  val TERMINATE_CLUSTER: "TERMINATE_CLUSTER" = "TERMINATE_CLUSTER"

  @inline def values = js.Array[SpotProvisioningTimeoutAction](SWITCH_TO_ON_DEMAND, TERMINATE_CLUSTER)
}

type Statistic = "SAMPLE_COUNT" | "AVERAGE" | "SUM" | "MINIMUM" | "MAXIMUM"
object Statistic {
  val SAMPLE_COUNT: "SAMPLE_COUNT" = "SAMPLE_COUNT"
  val AVERAGE: "AVERAGE" = "AVERAGE"
  val SUM: "SUM" = "SUM"
  val MINIMUM: "MINIMUM" = "MINIMUM"
  val MAXIMUM: "MAXIMUM" = "MAXIMUM"

  @inline def values = js.Array[Statistic](SAMPLE_COUNT, AVERAGE, SUM, MINIMUM, MAXIMUM)
}

type StepCancellationOption = "SEND_INTERRUPT" | "TERMINATE_PROCESS"
object StepCancellationOption {
  val SEND_INTERRUPT: "SEND_INTERRUPT" = "SEND_INTERRUPT"
  val TERMINATE_PROCESS: "TERMINATE_PROCESS" = "TERMINATE_PROCESS"

  @inline def values = js.Array[StepCancellationOption](SEND_INTERRUPT, TERMINATE_PROCESS)
}

type StepExecutionState = "PENDING" | "RUNNING" | "CONTINUE" | "COMPLETED" | "CANCELLED" | "FAILED" | "INTERRUPTED"
object StepExecutionState {
  val PENDING: "PENDING" = "PENDING"
  val RUNNING: "RUNNING" = "RUNNING"
  val CONTINUE: "CONTINUE" = "CONTINUE"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val CANCELLED: "CANCELLED" = "CANCELLED"
  val FAILED: "FAILED" = "FAILED"
  val INTERRUPTED: "INTERRUPTED" = "INTERRUPTED"

  @inline def values = js.Array[StepExecutionState](PENDING, RUNNING, CONTINUE, COMPLETED, CANCELLED, FAILED, INTERRUPTED)
}

type StepState = "PENDING" | "CANCEL_PENDING" | "RUNNING" | "COMPLETED" | "CANCELLED" | "FAILED" | "INTERRUPTED"
object StepState {
  val PENDING: "PENDING" = "PENDING"
  val CANCEL_PENDING: "CANCEL_PENDING" = "CANCEL_PENDING"
  val RUNNING: "RUNNING" = "RUNNING"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val CANCELLED: "CANCELLED" = "CANCELLED"
  val FAILED: "FAILED" = "FAILED"
  val INTERRUPTED: "INTERRUPTED" = "INTERRUPTED"

  @inline def values = js.Array[StepState](PENDING, CANCEL_PENDING, RUNNING, COMPLETED, CANCELLED, FAILED, INTERRUPTED)
}

type StepStateChangeReasonCode = "NONE"
object StepStateChangeReasonCode {
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[StepStateChangeReasonCode](NONE)
}

type Unit = "NONE" | "SECONDS" | "MICRO_SECONDS" | "MILLI_SECONDS" | "BYTES" | "KILO_BYTES" | "MEGA_BYTES" | "GIGA_BYTES" | "TERA_BYTES" | "BITS" | "KILO_BITS" | "MEGA_BITS" | "GIGA_BITS" | "TERA_BITS" | "PERCENT" | "COUNT" | "BYTES_PER_SECOND" | "KILO_BYTES_PER_SECOND" | "MEGA_BYTES_PER_SECOND" | "GIGA_BYTES_PER_SECOND" | "TERA_BYTES_PER_SECOND" | "BITS_PER_SECOND" | "KILO_BITS_PER_SECOND" | "MEGA_BITS_PER_SECOND" | "GIGA_BITS_PER_SECOND" | "TERA_BITS_PER_SECOND" | "COUNT_PER_SECOND"
object Unit {
  val NONE: "NONE" = "NONE"
  val SECONDS: "SECONDS" = "SECONDS"
  val MICRO_SECONDS: "MICRO_SECONDS" = "MICRO_SECONDS"
  val MILLI_SECONDS: "MILLI_SECONDS" = "MILLI_SECONDS"
  val BYTES: "BYTES" = "BYTES"
  val KILO_BYTES: "KILO_BYTES" = "KILO_BYTES"
  val MEGA_BYTES: "MEGA_BYTES" = "MEGA_BYTES"
  val GIGA_BYTES: "GIGA_BYTES" = "GIGA_BYTES"
  val TERA_BYTES: "TERA_BYTES" = "TERA_BYTES"
  val BITS: "BITS" = "BITS"
  val KILO_BITS: "KILO_BITS" = "KILO_BITS"
  val MEGA_BITS: "MEGA_BITS" = "MEGA_BITS"
  val GIGA_BITS: "GIGA_BITS" = "GIGA_BITS"
  val TERA_BITS: "TERA_BITS" = "TERA_BITS"
  val PERCENT: "PERCENT" = "PERCENT"
  val COUNT: "COUNT" = "COUNT"
  val BYTES_PER_SECOND: "BYTES_PER_SECOND" = "BYTES_PER_SECOND"
  val KILO_BYTES_PER_SECOND: "KILO_BYTES_PER_SECOND" = "KILO_BYTES_PER_SECOND"
  val MEGA_BYTES_PER_SECOND: "MEGA_BYTES_PER_SECOND" = "MEGA_BYTES_PER_SECOND"
  val GIGA_BYTES_PER_SECOND: "GIGA_BYTES_PER_SECOND" = "GIGA_BYTES_PER_SECOND"
  val TERA_BYTES_PER_SECOND: "TERA_BYTES_PER_SECOND" = "TERA_BYTES_PER_SECOND"
  val BITS_PER_SECOND: "BITS_PER_SECOND" = "BITS_PER_SECOND"
  val KILO_BITS_PER_SECOND: "KILO_BITS_PER_SECOND" = "KILO_BITS_PER_SECOND"
  val MEGA_BITS_PER_SECOND: "MEGA_BITS_PER_SECOND" = "MEGA_BITS_PER_SECOND"
  val GIGA_BITS_PER_SECOND: "GIGA_BITS_PER_SECOND" = "GIGA_BITS_PER_SECOND"
  val TERA_BITS_PER_SECOND: "TERA_BITS_PER_SECOND" = "TERA_BITS_PER_SECOND"
  val COUNT_PER_SECOND: "COUNT_PER_SECOND" = "COUNT_PER_SECOND"

  @inline def values = js.Array[Unit](
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
