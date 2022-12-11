package facade.amazonaws.services.emr

import scalajs.js

type ActionOnFailure = "TERMINATE_JOB_FLOW" | "TERMINATE_CLUSTER" | "CANCEL_AND_WAIT" | "CONTINUE"
object ActionOnFailure {
  inline val TERMINATE_JOB_FLOW: "TERMINATE_JOB_FLOW" = "TERMINATE_JOB_FLOW"
  inline val TERMINATE_CLUSTER: "TERMINATE_CLUSTER" = "TERMINATE_CLUSTER"
  inline val CANCEL_AND_WAIT: "CANCEL_AND_WAIT" = "CANCEL_AND_WAIT"
  inline val CONTINUE: "CONTINUE" = "CONTINUE"

  inline def values: js.Array[ActionOnFailure] = js.Array(TERMINATE_JOB_FLOW, TERMINATE_CLUSTER, CANCEL_AND_WAIT, CONTINUE)
}

type AdjustmentType = "CHANGE_IN_CAPACITY" | "PERCENT_CHANGE_IN_CAPACITY" | "EXACT_CAPACITY"
object AdjustmentType {
  inline val CHANGE_IN_CAPACITY: "CHANGE_IN_CAPACITY" = "CHANGE_IN_CAPACITY"
  inline val PERCENT_CHANGE_IN_CAPACITY: "PERCENT_CHANGE_IN_CAPACITY" = "PERCENT_CHANGE_IN_CAPACITY"
  inline val EXACT_CAPACITY: "EXACT_CAPACITY" = "EXACT_CAPACITY"

  inline def values: js.Array[AdjustmentType] = js.Array(CHANGE_IN_CAPACITY, PERCENT_CHANGE_IN_CAPACITY, EXACT_CAPACITY)
}

type AuthMode = "SSO" | "IAM"
object AuthMode {
  inline val SSO: "SSO" = "SSO"
  inline val IAM: "IAM" = "IAM"

  inline def values: js.Array[AuthMode] = js.Array(SSO, IAM)
}

type AutoScalingPolicyState = "PENDING" | "ATTACHING" | "ATTACHED" | "DETACHING" | "DETACHED" | "FAILED"
object AutoScalingPolicyState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val ATTACHING: "ATTACHING" = "ATTACHING"
  inline val ATTACHED: "ATTACHED" = "ATTACHED"
  inline val DETACHING: "DETACHING" = "DETACHING"
  inline val DETACHED: "DETACHED" = "DETACHED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[AutoScalingPolicyState] = js.Array(PENDING, ATTACHING, ATTACHED, DETACHING, DETACHED, FAILED)
}

type AutoScalingPolicyStateChangeReasonCode = "USER_REQUEST" | "PROVISION_FAILURE" | "CLEANUP_FAILURE"
object AutoScalingPolicyStateChangeReasonCode {
  inline val USER_REQUEST: "USER_REQUEST" = "USER_REQUEST"
  inline val PROVISION_FAILURE: "PROVISION_FAILURE" = "PROVISION_FAILURE"
  inline val CLEANUP_FAILURE: "CLEANUP_FAILURE" = "CLEANUP_FAILURE"

  inline def values: js.Array[AutoScalingPolicyStateChangeReasonCode] = js.Array(USER_REQUEST, PROVISION_FAILURE, CLEANUP_FAILURE)
}

type CancelStepsRequestStatus = "SUBMITTED" | "FAILED"
object CancelStepsRequestStatus {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[CancelStepsRequestStatus] = js.Array(SUBMITTED, FAILED)
}

type ClusterState = "STARTING" | "BOOTSTRAPPING" | "RUNNING" | "WAITING" | "TERMINATING" | "TERMINATED" | "TERMINATED_WITH_ERRORS"
object ClusterState {
  inline val STARTING: "STARTING" = "STARTING"
  inline val BOOTSTRAPPING: "BOOTSTRAPPING" = "BOOTSTRAPPING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val WAITING: "WAITING" = "WAITING"
  inline val TERMINATING: "TERMINATING" = "TERMINATING"
  inline val TERMINATED: "TERMINATED" = "TERMINATED"
  inline val TERMINATED_WITH_ERRORS: "TERMINATED_WITH_ERRORS" = "TERMINATED_WITH_ERRORS"

  inline def values: js.Array[ClusterState] = js.Array(STARTING, BOOTSTRAPPING, RUNNING, WAITING, TERMINATING, TERMINATED, TERMINATED_WITH_ERRORS)
}

type ClusterStateChangeReasonCode = "INTERNAL_ERROR" | "VALIDATION_ERROR" | "INSTANCE_FAILURE" | "INSTANCE_FLEET_TIMEOUT" | "BOOTSTRAP_FAILURE" | "USER_REQUEST" | "STEP_FAILURE" | "ALL_STEPS_COMPLETED"
object ClusterStateChangeReasonCode {
  inline val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  inline val VALIDATION_ERROR: "VALIDATION_ERROR" = "VALIDATION_ERROR"
  inline val INSTANCE_FAILURE: "INSTANCE_FAILURE" = "INSTANCE_FAILURE"
  inline val INSTANCE_FLEET_TIMEOUT: "INSTANCE_FLEET_TIMEOUT" = "INSTANCE_FLEET_TIMEOUT"
  inline val BOOTSTRAP_FAILURE: "BOOTSTRAP_FAILURE" = "BOOTSTRAP_FAILURE"
  inline val USER_REQUEST: "USER_REQUEST" = "USER_REQUEST"
  inline val STEP_FAILURE: "STEP_FAILURE" = "STEP_FAILURE"
  inline val ALL_STEPS_COMPLETED: "ALL_STEPS_COMPLETED" = "ALL_STEPS_COMPLETED"

  inline def values: js.Array[ClusterStateChangeReasonCode] = js.Array(INTERNAL_ERROR, VALIDATION_ERROR, INSTANCE_FAILURE, INSTANCE_FLEET_TIMEOUT, BOOTSTRAP_FAILURE, USER_REQUEST, STEP_FAILURE, ALL_STEPS_COMPLETED)
}

type ComparisonOperator = "GREATER_THAN_OR_EQUAL" | "GREATER_THAN" | "LESS_THAN" | "LESS_THAN_OR_EQUAL"
object ComparisonOperator {
  inline val GREATER_THAN_OR_EQUAL: "GREATER_THAN_OR_EQUAL" = "GREATER_THAN_OR_EQUAL"
  inline val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"
  inline val LESS_THAN: "LESS_THAN" = "LESS_THAN"
  inline val LESS_THAN_OR_EQUAL: "LESS_THAN_OR_EQUAL" = "LESS_THAN_OR_EQUAL"

  inline def values: js.Array[ComparisonOperator] = js.Array(GREATER_THAN_OR_EQUAL, GREATER_THAN, LESS_THAN, LESS_THAN_OR_EQUAL)
}

type ComputeLimitsUnitType = "InstanceFleetUnits" | "Instances" | "VCPU"
object ComputeLimitsUnitType {
  inline val InstanceFleetUnits: "InstanceFleetUnits" = "InstanceFleetUnits"
  inline val Instances: "Instances" = "Instances"
  inline val VCPU: "VCPU" = "VCPU"

  inline def values: js.Array[ComputeLimitsUnitType] = js.Array(InstanceFleetUnits, Instances, VCPU)
}

type ExecutionEngineType = "EMR"
object ExecutionEngineType {
  inline val EMR: "EMR" = "EMR"

  inline def values: js.Array[ExecutionEngineType] = js.Array(EMR)
}

type IdentityType = "USER" | "GROUP"
object IdentityType {
  inline val USER: "USER" = "USER"
  inline val GROUP: "GROUP" = "GROUP"

  inline def values: js.Array[IdentityType] = js.Array(USER, GROUP)
}

type InstanceCollectionType = "INSTANCE_FLEET" | "INSTANCE_GROUP"
object InstanceCollectionType {
  inline val INSTANCE_FLEET: "INSTANCE_FLEET" = "INSTANCE_FLEET"
  inline val INSTANCE_GROUP: "INSTANCE_GROUP" = "INSTANCE_GROUP"

  inline def values: js.Array[InstanceCollectionType] = js.Array(INSTANCE_FLEET, INSTANCE_GROUP)
}

type InstanceFleetState = "PROVISIONING" | "BOOTSTRAPPING" | "RUNNING" | "RESIZING" | "SUSPENDED" | "TERMINATING" | "TERMINATED"
object InstanceFleetState {
  inline val PROVISIONING: "PROVISIONING" = "PROVISIONING"
  inline val BOOTSTRAPPING: "BOOTSTRAPPING" = "BOOTSTRAPPING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val RESIZING: "RESIZING" = "RESIZING"
  inline val SUSPENDED: "SUSPENDED" = "SUSPENDED"
  inline val TERMINATING: "TERMINATING" = "TERMINATING"
  inline val TERMINATED: "TERMINATED" = "TERMINATED"

  inline def values: js.Array[InstanceFleetState] = js.Array(PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING, SUSPENDED, TERMINATING, TERMINATED)
}

type InstanceFleetStateChangeReasonCode = "INTERNAL_ERROR" | "VALIDATION_ERROR" | "INSTANCE_FAILURE" | "CLUSTER_TERMINATED"
object InstanceFleetStateChangeReasonCode {
  inline val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  inline val VALIDATION_ERROR: "VALIDATION_ERROR" = "VALIDATION_ERROR"
  inline val INSTANCE_FAILURE: "INSTANCE_FAILURE" = "INSTANCE_FAILURE"
  inline val CLUSTER_TERMINATED: "CLUSTER_TERMINATED" = "CLUSTER_TERMINATED"

  inline def values: js.Array[InstanceFleetStateChangeReasonCode] = js.Array(INTERNAL_ERROR, VALIDATION_ERROR, INSTANCE_FAILURE, CLUSTER_TERMINATED)
}

type InstanceFleetType = "MASTER" | "CORE" | "TASK"
object InstanceFleetType {
  inline val MASTER: "MASTER" = "MASTER"
  inline val CORE: "CORE" = "CORE"
  inline val TASK: "TASK" = "TASK"

  inline def values: js.Array[InstanceFleetType] = js.Array(MASTER, CORE, TASK)
}

type InstanceGroupState = "PROVISIONING" | "BOOTSTRAPPING" | "RUNNING" | "RECONFIGURING" | "RESIZING" | "SUSPENDED" | "TERMINATING" | "TERMINATED" | "ARRESTED" | "SHUTTING_DOWN" | "ENDED"
object InstanceGroupState {
  inline val PROVISIONING: "PROVISIONING" = "PROVISIONING"
  inline val BOOTSTRAPPING: "BOOTSTRAPPING" = "BOOTSTRAPPING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val RECONFIGURING: "RECONFIGURING" = "RECONFIGURING"
  inline val RESIZING: "RESIZING" = "RESIZING"
  inline val SUSPENDED: "SUSPENDED" = "SUSPENDED"
  inline val TERMINATING: "TERMINATING" = "TERMINATING"
  inline val TERMINATED: "TERMINATED" = "TERMINATED"
  inline val ARRESTED: "ARRESTED" = "ARRESTED"
  inline val SHUTTING_DOWN: "SHUTTING_DOWN" = "SHUTTING_DOWN"
  inline val ENDED: "ENDED" = "ENDED"

  inline def values: js.Array[InstanceGroupState] = js.Array(PROVISIONING, BOOTSTRAPPING, RUNNING, RECONFIGURING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED, SHUTTING_DOWN, ENDED)
}

type InstanceGroupStateChangeReasonCode = "INTERNAL_ERROR" | "VALIDATION_ERROR" | "INSTANCE_FAILURE" | "CLUSTER_TERMINATED"
object InstanceGroupStateChangeReasonCode {
  inline val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  inline val VALIDATION_ERROR: "VALIDATION_ERROR" = "VALIDATION_ERROR"
  inline val INSTANCE_FAILURE: "INSTANCE_FAILURE" = "INSTANCE_FAILURE"
  inline val CLUSTER_TERMINATED: "CLUSTER_TERMINATED" = "CLUSTER_TERMINATED"

  inline def values: js.Array[InstanceGroupStateChangeReasonCode] = js.Array(INTERNAL_ERROR, VALIDATION_ERROR, INSTANCE_FAILURE, CLUSTER_TERMINATED)
}

type InstanceGroupType = "MASTER" | "CORE" | "TASK"
object InstanceGroupType {
  inline val MASTER: "MASTER" = "MASTER"
  inline val CORE: "CORE" = "CORE"
  inline val TASK: "TASK" = "TASK"

  inline def values: js.Array[InstanceGroupType] = js.Array(MASTER, CORE, TASK)
}

type InstanceRoleType = "MASTER" | "CORE" | "TASK"
object InstanceRoleType {
  inline val MASTER: "MASTER" = "MASTER"
  inline val CORE: "CORE" = "CORE"
  inline val TASK: "TASK" = "TASK"

  inline def values: js.Array[InstanceRoleType] = js.Array(MASTER, CORE, TASK)
}

type InstanceState = "AWAITING_FULFILLMENT" | "PROVISIONING" | "BOOTSTRAPPING" | "RUNNING" | "TERMINATED"
object InstanceState {
  inline val AWAITING_FULFILLMENT: "AWAITING_FULFILLMENT" = "AWAITING_FULFILLMENT"
  inline val PROVISIONING: "PROVISIONING" = "PROVISIONING"
  inline val BOOTSTRAPPING: "BOOTSTRAPPING" = "BOOTSTRAPPING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val TERMINATED: "TERMINATED" = "TERMINATED"

  inline def values: js.Array[InstanceState] = js.Array(AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING, TERMINATED)
}

type InstanceStateChangeReasonCode = "INTERNAL_ERROR" | "VALIDATION_ERROR" | "INSTANCE_FAILURE" | "BOOTSTRAP_FAILURE" | "CLUSTER_TERMINATED"
object InstanceStateChangeReasonCode {
  inline val INTERNAL_ERROR: "INTERNAL_ERROR" = "INTERNAL_ERROR"
  inline val VALIDATION_ERROR: "VALIDATION_ERROR" = "VALIDATION_ERROR"
  inline val INSTANCE_FAILURE: "INSTANCE_FAILURE" = "INSTANCE_FAILURE"
  inline val BOOTSTRAP_FAILURE: "BOOTSTRAP_FAILURE" = "BOOTSTRAP_FAILURE"
  inline val CLUSTER_TERMINATED: "CLUSTER_TERMINATED" = "CLUSTER_TERMINATED"

  inline def values: js.Array[InstanceStateChangeReasonCode] = js.Array(INTERNAL_ERROR, VALIDATION_ERROR, INSTANCE_FAILURE, BOOTSTRAP_FAILURE, CLUSTER_TERMINATED)
}

/** The type of instance.
  */
type JobFlowExecutionState = "STARTING" | "BOOTSTRAPPING" | "RUNNING" | "WAITING" | "SHUTTING_DOWN" | "TERMINATED" | "COMPLETED" | "FAILED"
object JobFlowExecutionState {
  inline val STARTING: "STARTING" = "STARTING"
  inline val BOOTSTRAPPING: "BOOTSTRAPPING" = "BOOTSTRAPPING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val WAITING: "WAITING" = "WAITING"
  inline val SHUTTING_DOWN: "SHUTTING_DOWN" = "SHUTTING_DOWN"
  inline val TERMINATED: "TERMINATED" = "TERMINATED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[JobFlowExecutionState] = js.Array(STARTING, BOOTSTRAPPING, RUNNING, WAITING, SHUTTING_DOWN, TERMINATED, COMPLETED, FAILED)
}

type MarketType = "ON_DEMAND" | "SPOT"
object MarketType {
  inline val ON_DEMAND: "ON_DEMAND" = "ON_DEMAND"
  inline val SPOT: "SPOT" = "SPOT"

  inline def values: js.Array[MarketType] = js.Array(ON_DEMAND, SPOT)
}

type NotebookExecutionStatus = "START_PENDING" | "STARTING" | "RUNNING" | "FINISHING" | "FINISHED" | "FAILING" | "FAILED" | "STOP_PENDING" | "STOPPING" | "STOPPED"
object NotebookExecutionStatus {
  inline val START_PENDING: "START_PENDING" = "START_PENDING"
  inline val STARTING: "STARTING" = "STARTING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val FINISHING: "FINISHING" = "FINISHING"
  inline val FINISHED: "FINISHED" = "FINISHED"
  inline val FAILING: "FAILING" = "FAILING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val STOP_PENDING: "STOP_PENDING" = "STOP_PENDING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[NotebookExecutionStatus] = js.Array(START_PENDING, STARTING, RUNNING, FINISHING, FINISHED, FAILING, FAILED, STOP_PENDING, STOPPING, STOPPED)
}

type OnDemandCapacityReservationPreference = "open" | "none"
object OnDemandCapacityReservationPreference {
  inline val open: "open" = "open"
  inline val none: "none" = "none"

  inline def values: js.Array[OnDemandCapacityReservationPreference] = js.Array(open, none)
}

type OnDemandCapacityReservationUsageStrategy = "use-capacity-reservations-first"
object OnDemandCapacityReservationUsageStrategy {
  inline val `use-capacity-reservations-first`: "use-capacity-reservations-first" = "use-capacity-reservations-first"

  inline def values: js.Array[OnDemandCapacityReservationUsageStrategy] = js.Array(`use-capacity-reservations-first`)
}

type OnDemandProvisioningAllocationStrategy = "lowest-price"
object OnDemandProvisioningAllocationStrategy {
  inline val `lowest-price`: "lowest-price" = "lowest-price"

  inline def values: js.Array[OnDemandProvisioningAllocationStrategy] = js.Array(`lowest-price`)
}

type PlacementGroupStrategy = "SPREAD" | "PARTITION" | "CLUSTER" | "NONE"
object PlacementGroupStrategy {
  inline val SPREAD: "SPREAD" = "SPREAD"
  inline val PARTITION: "PARTITION" = "PARTITION"
  inline val CLUSTER: "CLUSTER" = "CLUSTER"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[PlacementGroupStrategy] = js.Array(SPREAD, PARTITION, CLUSTER, NONE)
}

type ReconfigurationType = "OVERWRITE" | "MERGE"
object ReconfigurationType {
  inline val OVERWRITE: "OVERWRITE" = "OVERWRITE"
  inline val MERGE: "MERGE" = "MERGE"

  inline def values: js.Array[ReconfigurationType] = js.Array(OVERWRITE, MERGE)
}

type RepoUpgradeOnBoot = "SECURITY" | "NONE"
object RepoUpgradeOnBoot {
  inline val SECURITY: "SECURITY" = "SECURITY"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[RepoUpgradeOnBoot] = js.Array(SECURITY, NONE)
}

type ScaleDownBehavior = "TERMINATE_AT_INSTANCE_HOUR" | "TERMINATE_AT_TASK_COMPLETION"
object ScaleDownBehavior {
  inline val TERMINATE_AT_INSTANCE_HOUR: "TERMINATE_AT_INSTANCE_HOUR" = "TERMINATE_AT_INSTANCE_HOUR"
  inline val TERMINATE_AT_TASK_COMPLETION: "TERMINATE_AT_TASK_COMPLETION" = "TERMINATE_AT_TASK_COMPLETION"

  inline def values: js.Array[ScaleDownBehavior] = js.Array(TERMINATE_AT_INSTANCE_HOUR, TERMINATE_AT_TASK_COMPLETION)
}

type SpotProvisioningAllocationStrategy = "capacity-optimized"
object SpotProvisioningAllocationStrategy {
  inline val `capacity-optimized`: "capacity-optimized" = "capacity-optimized"

  inline def values: js.Array[SpotProvisioningAllocationStrategy] = js.Array(`capacity-optimized`)
}

type SpotProvisioningTimeoutAction = "SWITCH_TO_ON_DEMAND" | "TERMINATE_CLUSTER"
object SpotProvisioningTimeoutAction {
  inline val SWITCH_TO_ON_DEMAND: "SWITCH_TO_ON_DEMAND" = "SWITCH_TO_ON_DEMAND"
  inline val TERMINATE_CLUSTER: "TERMINATE_CLUSTER" = "TERMINATE_CLUSTER"

  inline def values: js.Array[SpotProvisioningTimeoutAction] = js.Array(SWITCH_TO_ON_DEMAND, TERMINATE_CLUSTER)
}

type Statistic = "SAMPLE_COUNT" | "AVERAGE" | "SUM" | "MINIMUM" | "MAXIMUM"
object Statistic {
  inline val SAMPLE_COUNT: "SAMPLE_COUNT" = "SAMPLE_COUNT"
  inline val AVERAGE: "AVERAGE" = "AVERAGE"
  inline val SUM: "SUM" = "SUM"
  inline val MINIMUM: "MINIMUM" = "MINIMUM"
  inline val MAXIMUM: "MAXIMUM" = "MAXIMUM"

  inline def values: js.Array[Statistic] = js.Array(SAMPLE_COUNT, AVERAGE, SUM, MINIMUM, MAXIMUM)
}

type StepCancellationOption = "SEND_INTERRUPT" | "TERMINATE_PROCESS"
object StepCancellationOption {
  inline val SEND_INTERRUPT: "SEND_INTERRUPT" = "SEND_INTERRUPT"
  inline val TERMINATE_PROCESS: "TERMINATE_PROCESS" = "TERMINATE_PROCESS"

  inline def values: js.Array[StepCancellationOption] = js.Array(SEND_INTERRUPT, TERMINATE_PROCESS)
}

type StepExecutionState = "PENDING" | "RUNNING" | "CONTINUE" | "COMPLETED" | "CANCELLED" | "FAILED" | "INTERRUPTED"
object StepExecutionState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val CONTINUE: "CONTINUE" = "CONTINUE"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val INTERRUPTED: "INTERRUPTED" = "INTERRUPTED"

  inline def values: js.Array[StepExecutionState] = js.Array(PENDING, RUNNING, CONTINUE, COMPLETED, CANCELLED, FAILED, INTERRUPTED)
}

type StepState = "PENDING" | "CANCEL_PENDING" | "RUNNING" | "COMPLETED" | "CANCELLED" | "FAILED" | "INTERRUPTED"
object StepState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val CANCEL_PENDING: "CANCEL_PENDING" = "CANCEL_PENDING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val INTERRUPTED: "INTERRUPTED" = "INTERRUPTED"

  inline def values: js.Array[StepState] = js.Array(PENDING, CANCEL_PENDING, RUNNING, COMPLETED, CANCELLED, FAILED, INTERRUPTED)
}

type StepStateChangeReasonCode = "NONE"
object StepStateChangeReasonCode {
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[StepStateChangeReasonCode] = js.Array(NONE)
}

type Unit = "NONE" | "SECONDS" | "MICRO_SECONDS" | "MILLI_SECONDS" | "BYTES" | "KILO_BYTES" | "MEGA_BYTES" | "GIGA_BYTES" | "TERA_BYTES" | "BITS" | "KILO_BITS" | "MEGA_BITS" | "GIGA_BITS" | "TERA_BITS" | "PERCENT" | "COUNT" | "BYTES_PER_SECOND" | "KILO_BYTES_PER_SECOND" | "MEGA_BYTES_PER_SECOND" | "GIGA_BYTES_PER_SECOND" | "TERA_BYTES_PER_SECOND" | "BITS_PER_SECOND" | "KILO_BITS_PER_SECOND" | "MEGA_BITS_PER_SECOND" | "GIGA_BITS_PER_SECOND" | "TERA_BITS_PER_SECOND" | "COUNT_PER_SECOND"
object Unit {
  inline val NONE: "NONE" = "NONE"
  inline val SECONDS: "SECONDS" = "SECONDS"
  inline val MICRO_SECONDS: "MICRO_SECONDS" = "MICRO_SECONDS"
  inline val MILLI_SECONDS: "MILLI_SECONDS" = "MILLI_SECONDS"
  inline val BYTES: "BYTES" = "BYTES"
  inline val KILO_BYTES: "KILO_BYTES" = "KILO_BYTES"
  inline val MEGA_BYTES: "MEGA_BYTES" = "MEGA_BYTES"
  inline val GIGA_BYTES: "GIGA_BYTES" = "GIGA_BYTES"
  inline val TERA_BYTES: "TERA_BYTES" = "TERA_BYTES"
  inline val BITS: "BITS" = "BITS"
  inline val KILO_BITS: "KILO_BITS" = "KILO_BITS"
  inline val MEGA_BITS: "MEGA_BITS" = "MEGA_BITS"
  inline val GIGA_BITS: "GIGA_BITS" = "GIGA_BITS"
  inline val TERA_BITS: "TERA_BITS" = "TERA_BITS"
  inline val PERCENT: "PERCENT" = "PERCENT"
  inline val COUNT: "COUNT" = "COUNT"
  inline val BYTES_PER_SECOND: "BYTES_PER_SECOND" = "BYTES_PER_SECOND"
  inline val KILO_BYTES_PER_SECOND: "KILO_BYTES_PER_SECOND" = "KILO_BYTES_PER_SECOND"
  inline val MEGA_BYTES_PER_SECOND: "MEGA_BYTES_PER_SECOND" = "MEGA_BYTES_PER_SECOND"
  inline val GIGA_BYTES_PER_SECOND: "GIGA_BYTES_PER_SECOND" = "GIGA_BYTES_PER_SECOND"
  inline val TERA_BYTES_PER_SECOND: "TERA_BYTES_PER_SECOND" = "TERA_BYTES_PER_SECOND"
  inline val BITS_PER_SECOND: "BITS_PER_SECOND" = "BITS_PER_SECOND"
  inline val KILO_BITS_PER_SECOND: "KILO_BITS_PER_SECOND" = "KILO_BITS_PER_SECOND"
  inline val MEGA_BITS_PER_SECOND: "MEGA_BITS_PER_SECOND" = "MEGA_BITS_PER_SECOND"
  inline val GIGA_BITS_PER_SECOND: "GIGA_BITS_PER_SECOND" = "GIGA_BITS_PER_SECOND"
  inline val TERA_BITS_PER_SECOND: "TERA_BITS_PER_SECOND" = "TERA_BITS_PER_SECOND"
  inline val COUNT_PER_SECOND: "COUNT_PER_SECOND" = "COUNT_PER_SECOND"

  inline def values: js.Array[Unit] = js.Array(
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
