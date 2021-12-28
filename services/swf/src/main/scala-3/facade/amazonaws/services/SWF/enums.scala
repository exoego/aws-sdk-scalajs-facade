package facade.amazonaws.services.swf

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ActivityTaskTimeoutType extends js.Any
object ActivityTaskTimeoutType {
  val START_TO_CLOSE = "START_TO_CLOSE".asInstanceOf[ActivityTaskTimeoutType]
  val SCHEDULE_TO_START = "SCHEDULE_TO_START".asInstanceOf[ActivityTaskTimeoutType]
  val SCHEDULE_TO_CLOSE = "SCHEDULE_TO_CLOSE".asInstanceOf[ActivityTaskTimeoutType]
  val HEARTBEAT = "HEARTBEAT".asInstanceOf[ActivityTaskTimeoutType]

  @inline def values = js.Array(START_TO_CLOSE, SCHEDULE_TO_START, SCHEDULE_TO_CLOSE, HEARTBEAT)
}

@js.native
sealed trait CancelTimerFailedCause extends js.Any
object CancelTimerFailedCause {
  val TIMER_ID_UNKNOWN = "TIMER_ID_UNKNOWN".asInstanceOf[CancelTimerFailedCause]
  val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[CancelTimerFailedCause]

  @inline def values = js.Array(TIMER_ID_UNKNOWN, OPERATION_NOT_PERMITTED)
}

@js.native
sealed trait CancelWorkflowExecutionFailedCause extends js.Any
object CancelWorkflowExecutionFailedCause {
  val UNHANDLED_DECISION = "UNHANDLED_DECISION".asInstanceOf[CancelWorkflowExecutionFailedCause]
  val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[CancelWorkflowExecutionFailedCause]

  @inline def values = js.Array(UNHANDLED_DECISION, OPERATION_NOT_PERMITTED)
}

@js.native
sealed trait ChildPolicy extends js.Any
object ChildPolicy {
  val TERMINATE = "TERMINATE".asInstanceOf[ChildPolicy]
  val REQUEST_CANCEL = "REQUEST_CANCEL".asInstanceOf[ChildPolicy]
  val ABANDON = "ABANDON".asInstanceOf[ChildPolicy]

  @inline def values = js.Array(TERMINATE, REQUEST_CANCEL, ABANDON)
}

@js.native
sealed trait CloseStatus extends js.Any
object CloseStatus {
  val COMPLETED = "COMPLETED".asInstanceOf[CloseStatus]
  val FAILED = "FAILED".asInstanceOf[CloseStatus]
  val CANCELED = "CANCELED".asInstanceOf[CloseStatus]
  val TERMINATED = "TERMINATED".asInstanceOf[CloseStatus]
  val CONTINUED_AS_NEW = "CONTINUED_AS_NEW".asInstanceOf[CloseStatus]
  val TIMED_OUT = "TIMED_OUT".asInstanceOf[CloseStatus]

  @inline def values = js.Array(COMPLETED, FAILED, CANCELED, TERMINATED, CONTINUED_AS_NEW, TIMED_OUT)
}

@js.native
sealed trait CompleteWorkflowExecutionFailedCause extends js.Any
object CompleteWorkflowExecutionFailedCause {
  val UNHANDLED_DECISION = "UNHANDLED_DECISION".asInstanceOf[CompleteWorkflowExecutionFailedCause]
  val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[CompleteWorkflowExecutionFailedCause]

  @inline def values = js.Array(UNHANDLED_DECISION, OPERATION_NOT_PERMITTED)
}

@js.native
sealed trait ContinueAsNewWorkflowExecutionFailedCause extends js.Any
object ContinueAsNewWorkflowExecutionFailedCause {
  val UNHANDLED_DECISION = "UNHANDLED_DECISION".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
  val WORKFLOW_TYPE_DEPRECATED = "WORKFLOW_TYPE_DEPRECATED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
  val WORKFLOW_TYPE_DOES_NOT_EXIST = "WORKFLOW_TYPE_DOES_NOT_EXIST".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
  val DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED = "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
  val DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED = "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
  val DEFAULT_TASK_LIST_UNDEFINED = "DEFAULT_TASK_LIST_UNDEFINED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
  val DEFAULT_CHILD_POLICY_UNDEFINED = "DEFAULT_CHILD_POLICY_UNDEFINED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
  val CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED = "CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
  val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]

  @inline def values = js.Array(
    UNHANDLED_DECISION,
    WORKFLOW_TYPE_DEPRECATED,
    WORKFLOW_TYPE_DOES_NOT_EXIST,
    DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED,
    DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED,
    DEFAULT_TASK_LIST_UNDEFINED,
    DEFAULT_CHILD_POLICY_UNDEFINED,
    CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED,
    OPERATION_NOT_PERMITTED
  )
}

@js.native
sealed trait DecisionTaskTimeoutType extends js.Any
object DecisionTaskTimeoutType {
  val START_TO_CLOSE = "START_TO_CLOSE".asInstanceOf[DecisionTaskTimeoutType]

  @inline def values = js.Array(START_TO_CLOSE)
}

@js.native
sealed trait DecisionType extends js.Any
object DecisionType {
  val ScheduleActivityTask = "ScheduleActivityTask".asInstanceOf[DecisionType]
  val RequestCancelActivityTask = "RequestCancelActivityTask".asInstanceOf[DecisionType]
  val CompleteWorkflowExecution = "CompleteWorkflowExecution".asInstanceOf[DecisionType]
  val FailWorkflowExecution = "FailWorkflowExecution".asInstanceOf[DecisionType]
  val CancelWorkflowExecution = "CancelWorkflowExecution".asInstanceOf[DecisionType]
  val ContinueAsNewWorkflowExecution = "ContinueAsNewWorkflowExecution".asInstanceOf[DecisionType]
  val RecordMarker = "RecordMarker".asInstanceOf[DecisionType]
  val StartTimer = "StartTimer".asInstanceOf[DecisionType]
  val CancelTimer = "CancelTimer".asInstanceOf[DecisionType]
  val SignalExternalWorkflowExecution = "SignalExternalWorkflowExecution".asInstanceOf[DecisionType]
  val RequestCancelExternalWorkflowExecution = "RequestCancelExternalWorkflowExecution".asInstanceOf[DecisionType]
  val StartChildWorkflowExecution = "StartChildWorkflowExecution".asInstanceOf[DecisionType]
  val ScheduleLambdaFunction = "ScheduleLambdaFunction".asInstanceOf[DecisionType]

  @inline def values = js.Array(
    ScheduleActivityTask,
    RequestCancelActivityTask,
    CompleteWorkflowExecution,
    FailWorkflowExecution,
    CancelWorkflowExecution,
    ContinueAsNewWorkflowExecution,
    RecordMarker,
    StartTimer,
    CancelTimer,
    SignalExternalWorkflowExecution,
    RequestCancelExternalWorkflowExecution,
    StartChildWorkflowExecution,
    ScheduleLambdaFunction
  )
}

@js.native
sealed trait EventType extends js.Any
object EventType {
  val WorkflowExecutionStarted = "WorkflowExecutionStarted".asInstanceOf[EventType]
  val WorkflowExecutionCancelRequested = "WorkflowExecutionCancelRequested".asInstanceOf[EventType]
  val WorkflowExecutionCompleted = "WorkflowExecutionCompleted".asInstanceOf[EventType]
  val CompleteWorkflowExecutionFailed = "CompleteWorkflowExecutionFailed".asInstanceOf[EventType]
  val WorkflowExecutionFailed = "WorkflowExecutionFailed".asInstanceOf[EventType]
  val FailWorkflowExecutionFailed = "FailWorkflowExecutionFailed".asInstanceOf[EventType]
  val WorkflowExecutionTimedOut = "WorkflowExecutionTimedOut".asInstanceOf[EventType]
  val WorkflowExecutionCanceled = "WorkflowExecutionCanceled".asInstanceOf[EventType]
  val CancelWorkflowExecutionFailed = "CancelWorkflowExecutionFailed".asInstanceOf[EventType]
  val WorkflowExecutionContinuedAsNew = "WorkflowExecutionContinuedAsNew".asInstanceOf[EventType]
  val ContinueAsNewWorkflowExecutionFailed = "ContinueAsNewWorkflowExecutionFailed".asInstanceOf[EventType]
  val WorkflowExecutionTerminated = "WorkflowExecutionTerminated".asInstanceOf[EventType]
  val DecisionTaskScheduled = "DecisionTaskScheduled".asInstanceOf[EventType]
  val DecisionTaskStarted = "DecisionTaskStarted".asInstanceOf[EventType]
  val DecisionTaskCompleted = "DecisionTaskCompleted".asInstanceOf[EventType]
  val DecisionTaskTimedOut = "DecisionTaskTimedOut".asInstanceOf[EventType]
  val ActivityTaskScheduled = "ActivityTaskScheduled".asInstanceOf[EventType]
  val ScheduleActivityTaskFailed = "ScheduleActivityTaskFailed".asInstanceOf[EventType]
  val ActivityTaskStarted = "ActivityTaskStarted".asInstanceOf[EventType]
  val ActivityTaskCompleted = "ActivityTaskCompleted".asInstanceOf[EventType]
  val ActivityTaskFailed = "ActivityTaskFailed".asInstanceOf[EventType]
  val ActivityTaskTimedOut = "ActivityTaskTimedOut".asInstanceOf[EventType]
  val ActivityTaskCanceled = "ActivityTaskCanceled".asInstanceOf[EventType]
  val ActivityTaskCancelRequested = "ActivityTaskCancelRequested".asInstanceOf[EventType]
  val RequestCancelActivityTaskFailed = "RequestCancelActivityTaskFailed".asInstanceOf[EventType]
  val WorkflowExecutionSignaled = "WorkflowExecutionSignaled".asInstanceOf[EventType]
  val MarkerRecorded = "MarkerRecorded".asInstanceOf[EventType]
  val RecordMarkerFailed = "RecordMarkerFailed".asInstanceOf[EventType]
  val TimerStarted = "TimerStarted".asInstanceOf[EventType]
  val StartTimerFailed = "StartTimerFailed".asInstanceOf[EventType]
  val TimerFired = "TimerFired".asInstanceOf[EventType]
  val TimerCanceled = "TimerCanceled".asInstanceOf[EventType]
  val CancelTimerFailed = "CancelTimerFailed".asInstanceOf[EventType]
  val StartChildWorkflowExecutionInitiated = "StartChildWorkflowExecutionInitiated".asInstanceOf[EventType]
  val StartChildWorkflowExecutionFailed = "StartChildWorkflowExecutionFailed".asInstanceOf[EventType]
  val ChildWorkflowExecutionStarted = "ChildWorkflowExecutionStarted".asInstanceOf[EventType]
  val ChildWorkflowExecutionCompleted = "ChildWorkflowExecutionCompleted".asInstanceOf[EventType]
  val ChildWorkflowExecutionFailed = "ChildWorkflowExecutionFailed".asInstanceOf[EventType]
  val ChildWorkflowExecutionTimedOut = "ChildWorkflowExecutionTimedOut".asInstanceOf[EventType]
  val ChildWorkflowExecutionCanceled = "ChildWorkflowExecutionCanceled".asInstanceOf[EventType]
  val ChildWorkflowExecutionTerminated = "ChildWorkflowExecutionTerminated".asInstanceOf[EventType]
  val SignalExternalWorkflowExecutionInitiated = "SignalExternalWorkflowExecutionInitiated".asInstanceOf[EventType]
  val SignalExternalWorkflowExecutionFailed = "SignalExternalWorkflowExecutionFailed".asInstanceOf[EventType]
  val ExternalWorkflowExecutionSignaled = "ExternalWorkflowExecutionSignaled".asInstanceOf[EventType]
  val RequestCancelExternalWorkflowExecutionInitiated = "RequestCancelExternalWorkflowExecutionInitiated".asInstanceOf[EventType]
  val RequestCancelExternalWorkflowExecutionFailed = "RequestCancelExternalWorkflowExecutionFailed".asInstanceOf[EventType]
  val ExternalWorkflowExecutionCancelRequested = "ExternalWorkflowExecutionCancelRequested".asInstanceOf[EventType]
  val LambdaFunctionScheduled = "LambdaFunctionScheduled".asInstanceOf[EventType]
  val LambdaFunctionStarted = "LambdaFunctionStarted".asInstanceOf[EventType]
  val LambdaFunctionCompleted = "LambdaFunctionCompleted".asInstanceOf[EventType]
  val LambdaFunctionFailed = "LambdaFunctionFailed".asInstanceOf[EventType]
  val LambdaFunctionTimedOut = "LambdaFunctionTimedOut".asInstanceOf[EventType]
  val ScheduleLambdaFunctionFailed = "ScheduleLambdaFunctionFailed".asInstanceOf[EventType]
  val StartLambdaFunctionFailed = "StartLambdaFunctionFailed".asInstanceOf[EventType]

  @inline def values = js.Array(
    WorkflowExecutionStarted,
    WorkflowExecutionCancelRequested,
    WorkflowExecutionCompleted,
    CompleteWorkflowExecutionFailed,
    WorkflowExecutionFailed,
    FailWorkflowExecutionFailed,
    WorkflowExecutionTimedOut,
    WorkflowExecutionCanceled,
    CancelWorkflowExecutionFailed,
    WorkflowExecutionContinuedAsNew,
    ContinueAsNewWorkflowExecutionFailed,
    WorkflowExecutionTerminated,
    DecisionTaskScheduled,
    DecisionTaskStarted,
    DecisionTaskCompleted,
    DecisionTaskTimedOut,
    ActivityTaskScheduled,
    ScheduleActivityTaskFailed,
    ActivityTaskStarted,
    ActivityTaskCompleted,
    ActivityTaskFailed,
    ActivityTaskTimedOut,
    ActivityTaskCanceled,
    ActivityTaskCancelRequested,
    RequestCancelActivityTaskFailed,
    WorkflowExecutionSignaled,
    MarkerRecorded,
    RecordMarkerFailed,
    TimerStarted,
    StartTimerFailed,
    TimerFired,
    TimerCanceled,
    CancelTimerFailed,
    StartChildWorkflowExecutionInitiated,
    StartChildWorkflowExecutionFailed,
    ChildWorkflowExecutionStarted,
    ChildWorkflowExecutionCompleted,
    ChildWorkflowExecutionFailed,
    ChildWorkflowExecutionTimedOut,
    ChildWorkflowExecutionCanceled,
    ChildWorkflowExecutionTerminated,
    SignalExternalWorkflowExecutionInitiated,
    SignalExternalWorkflowExecutionFailed,
    ExternalWorkflowExecutionSignaled,
    RequestCancelExternalWorkflowExecutionInitiated,
    RequestCancelExternalWorkflowExecutionFailed,
    ExternalWorkflowExecutionCancelRequested,
    LambdaFunctionScheduled,
    LambdaFunctionStarted,
    LambdaFunctionCompleted,
    LambdaFunctionFailed,
    LambdaFunctionTimedOut,
    ScheduleLambdaFunctionFailed,
    StartLambdaFunctionFailed
  )
}

@js.native
sealed trait ExecutionStatus extends js.Any
object ExecutionStatus {
  val OPEN = "OPEN".asInstanceOf[ExecutionStatus]
  val CLOSED = "CLOSED".asInstanceOf[ExecutionStatus]

  @inline def values = js.Array(OPEN, CLOSED)
}

@js.native
sealed trait FailWorkflowExecutionFailedCause extends js.Any
object FailWorkflowExecutionFailedCause {
  val UNHANDLED_DECISION = "UNHANDLED_DECISION".asInstanceOf[FailWorkflowExecutionFailedCause]
  val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[FailWorkflowExecutionFailedCause]

  @inline def values = js.Array(UNHANDLED_DECISION, OPERATION_NOT_PERMITTED)
}

@js.native
sealed trait LambdaFunctionTimeoutType extends js.Any
object LambdaFunctionTimeoutType {
  val START_TO_CLOSE = "START_TO_CLOSE".asInstanceOf[LambdaFunctionTimeoutType]

  @inline def values = js.Array(START_TO_CLOSE)
}

@js.native
sealed trait RecordMarkerFailedCause extends js.Any
object RecordMarkerFailedCause {
  val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[RecordMarkerFailedCause]

  @inline def values = js.Array(OPERATION_NOT_PERMITTED)
}

@js.native
sealed trait RegistrationStatus extends js.Any
object RegistrationStatus {
  val REGISTERED = "REGISTERED".asInstanceOf[RegistrationStatus]
  val DEPRECATED = "DEPRECATED".asInstanceOf[RegistrationStatus]

  @inline def values = js.Array(REGISTERED, DEPRECATED)
}

@js.native
sealed trait RequestCancelActivityTaskFailedCause extends js.Any
object RequestCancelActivityTaskFailedCause {
  val ACTIVITY_ID_UNKNOWN = "ACTIVITY_ID_UNKNOWN".asInstanceOf[RequestCancelActivityTaskFailedCause]
  val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[RequestCancelActivityTaskFailedCause]

  @inline def values = js.Array(ACTIVITY_ID_UNKNOWN, OPERATION_NOT_PERMITTED)
}

@js.native
sealed trait RequestCancelExternalWorkflowExecutionFailedCause extends js.Any
object RequestCancelExternalWorkflowExecutionFailedCause {
  val UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION = "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION".asInstanceOf[RequestCancelExternalWorkflowExecutionFailedCause]
  val REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED = "REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED".asInstanceOf[RequestCancelExternalWorkflowExecutionFailedCause]
  val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[RequestCancelExternalWorkflowExecutionFailedCause]

  @inline def values = js.Array(UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION, REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED)
}

@js.native
sealed trait ScheduleActivityTaskFailedCause extends js.Any
object ScheduleActivityTaskFailedCause {
  val ACTIVITY_TYPE_DEPRECATED = "ACTIVITY_TYPE_DEPRECATED".asInstanceOf[ScheduleActivityTaskFailedCause]
  val ACTIVITY_TYPE_DOES_NOT_EXIST = "ACTIVITY_TYPE_DOES_NOT_EXIST".asInstanceOf[ScheduleActivityTaskFailedCause]
  val ACTIVITY_ID_ALREADY_IN_USE = "ACTIVITY_ID_ALREADY_IN_USE".asInstanceOf[ScheduleActivityTaskFailedCause]
  val OPEN_ACTIVITIES_LIMIT_EXCEEDED = "OPEN_ACTIVITIES_LIMIT_EXCEEDED".asInstanceOf[ScheduleActivityTaskFailedCause]
  val ACTIVITY_CREATION_RATE_EXCEEDED = "ACTIVITY_CREATION_RATE_EXCEEDED".asInstanceOf[ScheduleActivityTaskFailedCause]
  val DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED = "DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED".asInstanceOf[ScheduleActivityTaskFailedCause]
  val DEFAULT_TASK_LIST_UNDEFINED = "DEFAULT_TASK_LIST_UNDEFINED".asInstanceOf[ScheduleActivityTaskFailedCause]
  val DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED = "DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED".asInstanceOf[ScheduleActivityTaskFailedCause]
  val DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED = "DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED".asInstanceOf[ScheduleActivityTaskFailedCause]
  val DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED = "DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED".asInstanceOf[ScheduleActivityTaskFailedCause]
  val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[ScheduleActivityTaskFailedCause]

  @inline def values = js.Array(
    ACTIVITY_TYPE_DEPRECATED,
    ACTIVITY_TYPE_DOES_NOT_EXIST,
    ACTIVITY_ID_ALREADY_IN_USE,
    OPEN_ACTIVITIES_LIMIT_EXCEEDED,
    ACTIVITY_CREATION_RATE_EXCEEDED,
    DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED,
    DEFAULT_TASK_LIST_UNDEFINED,
    DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED,
    DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED,
    DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED,
    OPERATION_NOT_PERMITTED
  )
}

@js.native
sealed trait ScheduleLambdaFunctionFailedCause extends js.Any
object ScheduleLambdaFunctionFailedCause {
  val ID_ALREADY_IN_USE = "ID_ALREADY_IN_USE".asInstanceOf[ScheduleLambdaFunctionFailedCause]
  val OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED = "OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED".asInstanceOf[ScheduleLambdaFunctionFailedCause]
  val LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED = "LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED".asInstanceOf[ScheduleLambdaFunctionFailedCause]
  val LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION = "LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION".asInstanceOf[ScheduleLambdaFunctionFailedCause]

  @inline def values = js.Array(ID_ALREADY_IN_USE, OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED, LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED, LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION)
}

@js.native
sealed trait SignalExternalWorkflowExecutionFailedCause extends js.Any
object SignalExternalWorkflowExecutionFailedCause {
  val UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION = "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION".asInstanceOf[SignalExternalWorkflowExecutionFailedCause]
  val SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED = "SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED".asInstanceOf[SignalExternalWorkflowExecutionFailedCause]
  val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[SignalExternalWorkflowExecutionFailedCause]

  @inline def values = js.Array(UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION, SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED)
}

@js.native
sealed trait StartChildWorkflowExecutionFailedCause extends js.Any
object StartChildWorkflowExecutionFailedCause {
  val WORKFLOW_TYPE_DOES_NOT_EXIST = "WORKFLOW_TYPE_DOES_NOT_EXIST".asInstanceOf[StartChildWorkflowExecutionFailedCause]
  val WORKFLOW_TYPE_DEPRECATED = "WORKFLOW_TYPE_DEPRECATED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
  val OPEN_CHILDREN_LIMIT_EXCEEDED = "OPEN_CHILDREN_LIMIT_EXCEEDED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
  val OPEN_WORKFLOWS_LIMIT_EXCEEDED = "OPEN_WORKFLOWS_LIMIT_EXCEEDED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
  val CHILD_CREATION_RATE_EXCEEDED = "CHILD_CREATION_RATE_EXCEEDED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
  val WORKFLOW_ALREADY_RUNNING = "WORKFLOW_ALREADY_RUNNING".asInstanceOf[StartChildWorkflowExecutionFailedCause]
  val DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED = "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
  val DEFAULT_TASK_LIST_UNDEFINED = "DEFAULT_TASK_LIST_UNDEFINED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
  val DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED = "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
  val DEFAULT_CHILD_POLICY_UNDEFINED = "DEFAULT_CHILD_POLICY_UNDEFINED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
  val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[StartChildWorkflowExecutionFailedCause]

  @inline def values = js.Array(
    WORKFLOW_TYPE_DOES_NOT_EXIST,
    WORKFLOW_TYPE_DEPRECATED,
    OPEN_CHILDREN_LIMIT_EXCEEDED,
    OPEN_WORKFLOWS_LIMIT_EXCEEDED,
    CHILD_CREATION_RATE_EXCEEDED,
    WORKFLOW_ALREADY_RUNNING,
    DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED,
    DEFAULT_TASK_LIST_UNDEFINED,
    DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED,
    DEFAULT_CHILD_POLICY_UNDEFINED,
    OPERATION_NOT_PERMITTED
  )
}

@js.native
sealed trait StartLambdaFunctionFailedCause extends js.Any
object StartLambdaFunctionFailedCause {
  val ASSUME_ROLE_FAILED = "ASSUME_ROLE_FAILED".asInstanceOf[StartLambdaFunctionFailedCause]

  @inline def values = js.Array(ASSUME_ROLE_FAILED)
}

@js.native
sealed trait StartTimerFailedCause extends js.Any
object StartTimerFailedCause {
  val TIMER_ID_ALREADY_IN_USE = "TIMER_ID_ALREADY_IN_USE".asInstanceOf[StartTimerFailedCause]
  val OPEN_TIMERS_LIMIT_EXCEEDED = "OPEN_TIMERS_LIMIT_EXCEEDED".asInstanceOf[StartTimerFailedCause]
  val TIMER_CREATION_RATE_EXCEEDED = "TIMER_CREATION_RATE_EXCEEDED".asInstanceOf[StartTimerFailedCause]
  val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[StartTimerFailedCause]

  @inline def values = js.Array(TIMER_ID_ALREADY_IN_USE, OPEN_TIMERS_LIMIT_EXCEEDED, TIMER_CREATION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED)
}

@js.native
sealed trait WorkflowExecutionCancelRequestedCause extends js.Any
object WorkflowExecutionCancelRequestedCause {
  val CHILD_POLICY_APPLIED = "CHILD_POLICY_APPLIED".asInstanceOf[WorkflowExecutionCancelRequestedCause]

  @inline def values = js.Array(CHILD_POLICY_APPLIED)
}

@js.native
sealed trait WorkflowExecutionTerminatedCause extends js.Any
object WorkflowExecutionTerminatedCause {
  val CHILD_POLICY_APPLIED = "CHILD_POLICY_APPLIED".asInstanceOf[WorkflowExecutionTerminatedCause]
  val EVENT_LIMIT_EXCEEDED = "EVENT_LIMIT_EXCEEDED".asInstanceOf[WorkflowExecutionTerminatedCause]
  val OPERATOR_INITIATED = "OPERATOR_INITIATED".asInstanceOf[WorkflowExecutionTerminatedCause]

  @inline def values = js.Array(CHILD_POLICY_APPLIED, EVENT_LIMIT_EXCEEDED, OPERATOR_INITIATED)
}

@js.native
sealed trait WorkflowExecutionTimeoutType extends js.Any
object WorkflowExecutionTimeoutType {
  val START_TO_CLOSE = "START_TO_CLOSE".asInstanceOf[WorkflowExecutionTimeoutType]

  @inline def values = js.Array(START_TO_CLOSE)
}
