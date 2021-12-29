package facade.amazonaws.services.swf

import scalajs._

type ActivityTaskTimeoutType = "START_TO_CLOSE" | "SCHEDULE_TO_START" | "SCHEDULE_TO_CLOSE" | "HEARTBEAT"
object ActivityTaskTimeoutType {
  val START_TO_CLOSE: "START_TO_CLOSE" = "START_TO_CLOSE"
  val SCHEDULE_TO_START: "SCHEDULE_TO_START" = "SCHEDULE_TO_START"
  val SCHEDULE_TO_CLOSE: "SCHEDULE_TO_CLOSE" = "SCHEDULE_TO_CLOSE"
  val HEARTBEAT: "HEARTBEAT" = "HEARTBEAT"

  @inline def values = js.Array[ActivityTaskTimeoutType](START_TO_CLOSE, SCHEDULE_TO_START, SCHEDULE_TO_CLOSE, HEARTBEAT)
}

type CancelTimerFailedCause = "TIMER_ID_UNKNOWN" | "OPERATION_NOT_PERMITTED"
object CancelTimerFailedCause {
  val TIMER_ID_UNKNOWN: "TIMER_ID_UNKNOWN" = "TIMER_ID_UNKNOWN"
  val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  @inline def values = js.Array[CancelTimerFailedCause](TIMER_ID_UNKNOWN, OPERATION_NOT_PERMITTED)
}

type CancelWorkflowExecutionFailedCause = "UNHANDLED_DECISION" | "OPERATION_NOT_PERMITTED"
object CancelWorkflowExecutionFailedCause {
  val UNHANDLED_DECISION: "UNHANDLED_DECISION" = "UNHANDLED_DECISION"
  val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  @inline def values = js.Array[CancelWorkflowExecutionFailedCause](UNHANDLED_DECISION, OPERATION_NOT_PERMITTED)
}

type ChildPolicy = "TERMINATE" | "REQUEST_CANCEL" | "ABANDON"
object ChildPolicy {
  val TERMINATE: "TERMINATE" = "TERMINATE"
  val REQUEST_CANCEL: "REQUEST_CANCEL" = "REQUEST_CANCEL"
  val ABANDON: "ABANDON" = "ABANDON"

  @inline def values = js.Array[ChildPolicy](TERMINATE, REQUEST_CANCEL, ABANDON)
}

type CloseStatus = "COMPLETED" | "FAILED" | "CANCELED" | "TERMINATED" | "CONTINUED_AS_NEW" | "TIMED_OUT"
object CloseStatus {
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"
  val CANCELED: "CANCELED" = "CANCELED"
  val TERMINATED: "TERMINATED" = "TERMINATED"
  val CONTINUED_AS_NEW: "CONTINUED_AS_NEW" = "CONTINUED_AS_NEW"
  val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"

  @inline def values = js.Array[CloseStatus](COMPLETED, FAILED, CANCELED, TERMINATED, CONTINUED_AS_NEW, TIMED_OUT)
}

type CompleteWorkflowExecutionFailedCause = "UNHANDLED_DECISION" | "OPERATION_NOT_PERMITTED"
object CompleteWorkflowExecutionFailedCause {
  val UNHANDLED_DECISION: "UNHANDLED_DECISION" = "UNHANDLED_DECISION"
  val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  @inline def values = js.Array[CompleteWorkflowExecutionFailedCause](UNHANDLED_DECISION, OPERATION_NOT_PERMITTED)
}

type ContinueAsNewWorkflowExecutionFailedCause = "UNHANDLED_DECISION" | "WORKFLOW_TYPE_DEPRECATED" | "WORKFLOW_TYPE_DOES_NOT_EXIST" | "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED" | "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED" | "DEFAULT_TASK_LIST_UNDEFINED" | "DEFAULT_CHILD_POLICY_UNDEFINED" | "CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED" | "OPERATION_NOT_PERMITTED"
object ContinueAsNewWorkflowExecutionFailedCause {
  val UNHANDLED_DECISION: "UNHANDLED_DECISION" = "UNHANDLED_DECISION"
  val WORKFLOW_TYPE_DEPRECATED: "WORKFLOW_TYPE_DEPRECATED" = "WORKFLOW_TYPE_DEPRECATED"
  val WORKFLOW_TYPE_DOES_NOT_EXIST: "WORKFLOW_TYPE_DOES_NOT_EXIST" = "WORKFLOW_TYPE_DOES_NOT_EXIST"
  val DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED: "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED" = "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED"
  val DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED: "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED" = "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED"
  val DEFAULT_TASK_LIST_UNDEFINED: "DEFAULT_TASK_LIST_UNDEFINED" = "DEFAULT_TASK_LIST_UNDEFINED"
  val DEFAULT_CHILD_POLICY_UNDEFINED: "DEFAULT_CHILD_POLICY_UNDEFINED" = "DEFAULT_CHILD_POLICY_UNDEFINED"
  val CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED: "CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED" = "CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED"
  val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  @inline def values = js.Array[ContinueAsNewWorkflowExecutionFailedCause](
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

type DecisionTaskTimeoutType = "START_TO_CLOSE"
object DecisionTaskTimeoutType {
  val START_TO_CLOSE: "START_TO_CLOSE" = "START_TO_CLOSE"

  @inline def values = js.Array[DecisionTaskTimeoutType](START_TO_CLOSE)
}

type DecisionType = "ScheduleActivityTask" | "RequestCancelActivityTask" | "CompleteWorkflowExecution" | "FailWorkflowExecution" | "CancelWorkflowExecution" | "ContinueAsNewWorkflowExecution" | "RecordMarker" | "StartTimer" | "CancelTimer" | "SignalExternalWorkflowExecution" | "RequestCancelExternalWorkflowExecution" | "StartChildWorkflowExecution" | "ScheduleLambdaFunction"
object DecisionType {
  val ScheduleActivityTask: "ScheduleActivityTask" = "ScheduleActivityTask"
  val RequestCancelActivityTask: "RequestCancelActivityTask" = "RequestCancelActivityTask"
  val CompleteWorkflowExecution: "CompleteWorkflowExecution" = "CompleteWorkflowExecution"
  val FailWorkflowExecution: "FailWorkflowExecution" = "FailWorkflowExecution"
  val CancelWorkflowExecution: "CancelWorkflowExecution" = "CancelWorkflowExecution"
  val ContinueAsNewWorkflowExecution: "ContinueAsNewWorkflowExecution" = "ContinueAsNewWorkflowExecution"
  val RecordMarker: "RecordMarker" = "RecordMarker"
  val StartTimer: "StartTimer" = "StartTimer"
  val CancelTimer: "CancelTimer" = "CancelTimer"
  val SignalExternalWorkflowExecution: "SignalExternalWorkflowExecution" = "SignalExternalWorkflowExecution"
  val RequestCancelExternalWorkflowExecution: "RequestCancelExternalWorkflowExecution" = "RequestCancelExternalWorkflowExecution"
  val StartChildWorkflowExecution: "StartChildWorkflowExecution" = "StartChildWorkflowExecution"
  val ScheduleLambdaFunction: "ScheduleLambdaFunction" = "ScheduleLambdaFunction"

  @inline def values = js.Array[DecisionType](
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

type EventType = "WorkflowExecutionStarted" | "WorkflowExecutionCancelRequested" | "WorkflowExecutionCompleted" | "CompleteWorkflowExecutionFailed" | "WorkflowExecutionFailed" | "FailWorkflowExecutionFailed" | "WorkflowExecutionTimedOut" | "WorkflowExecutionCanceled" | "CancelWorkflowExecutionFailed" | "WorkflowExecutionContinuedAsNew" | "ContinueAsNewWorkflowExecutionFailed" | "WorkflowExecutionTerminated" | "DecisionTaskScheduled" | "DecisionTaskStarted" | "DecisionTaskCompleted" | "DecisionTaskTimedOut" | "ActivityTaskScheduled" | "ScheduleActivityTaskFailed" | "ActivityTaskStarted" | "ActivityTaskCompleted" | "ActivityTaskFailed" | "ActivityTaskTimedOut" | "ActivityTaskCanceled" | "ActivityTaskCancelRequested" | "RequestCancelActivityTaskFailed" | "WorkflowExecutionSignaled" | "MarkerRecorded" | "RecordMarkerFailed" | "TimerStarted" | "StartTimerFailed" | "TimerFired" | "TimerCanceled" | "CancelTimerFailed" | "StartChildWorkflowExecutionInitiated" |
  "StartChildWorkflowExecutionFailed" | "ChildWorkflowExecutionStarted" | "ChildWorkflowExecutionCompleted" | "ChildWorkflowExecutionFailed" | "ChildWorkflowExecutionTimedOut" | "ChildWorkflowExecutionCanceled" | "ChildWorkflowExecutionTerminated" | "SignalExternalWorkflowExecutionInitiated" | "SignalExternalWorkflowExecutionFailed" | "ExternalWorkflowExecutionSignaled" | "RequestCancelExternalWorkflowExecutionInitiated" | "RequestCancelExternalWorkflowExecutionFailed" | "ExternalWorkflowExecutionCancelRequested" | "LambdaFunctionScheduled" | "LambdaFunctionStarted" | "LambdaFunctionCompleted" | "LambdaFunctionFailed" | "LambdaFunctionTimedOut" | "ScheduleLambdaFunctionFailed" | "StartLambdaFunctionFailed"
object EventType {
  val WorkflowExecutionStarted: "WorkflowExecutionStarted" = "WorkflowExecutionStarted"
  val WorkflowExecutionCancelRequested: "WorkflowExecutionCancelRequested" = "WorkflowExecutionCancelRequested"
  val WorkflowExecutionCompleted: "WorkflowExecutionCompleted" = "WorkflowExecutionCompleted"
  val CompleteWorkflowExecutionFailed: "CompleteWorkflowExecutionFailed" = "CompleteWorkflowExecutionFailed"
  val WorkflowExecutionFailed: "WorkflowExecutionFailed" = "WorkflowExecutionFailed"
  val FailWorkflowExecutionFailed: "FailWorkflowExecutionFailed" = "FailWorkflowExecutionFailed"
  val WorkflowExecutionTimedOut: "WorkflowExecutionTimedOut" = "WorkflowExecutionTimedOut"
  val WorkflowExecutionCanceled: "WorkflowExecutionCanceled" = "WorkflowExecutionCanceled"
  val CancelWorkflowExecutionFailed: "CancelWorkflowExecutionFailed" = "CancelWorkflowExecutionFailed"
  val WorkflowExecutionContinuedAsNew: "WorkflowExecutionContinuedAsNew" = "WorkflowExecutionContinuedAsNew"
  val ContinueAsNewWorkflowExecutionFailed: "ContinueAsNewWorkflowExecutionFailed" = "ContinueAsNewWorkflowExecutionFailed"
  val WorkflowExecutionTerminated: "WorkflowExecutionTerminated" = "WorkflowExecutionTerminated"
  val DecisionTaskScheduled: "DecisionTaskScheduled" = "DecisionTaskScheduled"
  val DecisionTaskStarted: "DecisionTaskStarted" = "DecisionTaskStarted"
  val DecisionTaskCompleted: "DecisionTaskCompleted" = "DecisionTaskCompleted"
  val DecisionTaskTimedOut: "DecisionTaskTimedOut" = "DecisionTaskTimedOut"
  val ActivityTaskScheduled: "ActivityTaskScheduled" = "ActivityTaskScheduled"
  val ScheduleActivityTaskFailed: "ScheduleActivityTaskFailed" = "ScheduleActivityTaskFailed"
  val ActivityTaskStarted: "ActivityTaskStarted" = "ActivityTaskStarted"
  val ActivityTaskCompleted: "ActivityTaskCompleted" = "ActivityTaskCompleted"
  val ActivityTaskFailed: "ActivityTaskFailed" = "ActivityTaskFailed"
  val ActivityTaskTimedOut: "ActivityTaskTimedOut" = "ActivityTaskTimedOut"
  val ActivityTaskCanceled: "ActivityTaskCanceled" = "ActivityTaskCanceled"
  val ActivityTaskCancelRequested: "ActivityTaskCancelRequested" = "ActivityTaskCancelRequested"
  val RequestCancelActivityTaskFailed: "RequestCancelActivityTaskFailed" = "RequestCancelActivityTaskFailed"
  val WorkflowExecutionSignaled: "WorkflowExecutionSignaled" = "WorkflowExecutionSignaled"
  val MarkerRecorded: "MarkerRecorded" = "MarkerRecorded"
  val RecordMarkerFailed: "RecordMarkerFailed" = "RecordMarkerFailed"
  val TimerStarted: "TimerStarted" = "TimerStarted"
  val StartTimerFailed: "StartTimerFailed" = "StartTimerFailed"
  val TimerFired: "TimerFired" = "TimerFired"
  val TimerCanceled: "TimerCanceled" = "TimerCanceled"
  val CancelTimerFailed: "CancelTimerFailed" = "CancelTimerFailed"
  val StartChildWorkflowExecutionInitiated: "StartChildWorkflowExecutionInitiated" = "StartChildWorkflowExecutionInitiated"
  val StartChildWorkflowExecutionFailed: "StartChildWorkflowExecutionFailed" = "StartChildWorkflowExecutionFailed"
  val ChildWorkflowExecutionStarted: "ChildWorkflowExecutionStarted" = "ChildWorkflowExecutionStarted"
  val ChildWorkflowExecutionCompleted: "ChildWorkflowExecutionCompleted" = "ChildWorkflowExecutionCompleted"
  val ChildWorkflowExecutionFailed: "ChildWorkflowExecutionFailed" = "ChildWorkflowExecutionFailed"
  val ChildWorkflowExecutionTimedOut: "ChildWorkflowExecutionTimedOut" = "ChildWorkflowExecutionTimedOut"
  val ChildWorkflowExecutionCanceled: "ChildWorkflowExecutionCanceled" = "ChildWorkflowExecutionCanceled"
  val ChildWorkflowExecutionTerminated: "ChildWorkflowExecutionTerminated" = "ChildWorkflowExecutionTerminated"
  val SignalExternalWorkflowExecutionInitiated: "SignalExternalWorkflowExecutionInitiated" = "SignalExternalWorkflowExecutionInitiated"
  val SignalExternalWorkflowExecutionFailed: "SignalExternalWorkflowExecutionFailed" = "SignalExternalWorkflowExecutionFailed"
  val ExternalWorkflowExecutionSignaled: "ExternalWorkflowExecutionSignaled" = "ExternalWorkflowExecutionSignaled"
  val RequestCancelExternalWorkflowExecutionInitiated: "RequestCancelExternalWorkflowExecutionInitiated" = "RequestCancelExternalWorkflowExecutionInitiated"
  val RequestCancelExternalWorkflowExecutionFailed: "RequestCancelExternalWorkflowExecutionFailed" = "RequestCancelExternalWorkflowExecutionFailed"
  val ExternalWorkflowExecutionCancelRequested: "ExternalWorkflowExecutionCancelRequested" = "ExternalWorkflowExecutionCancelRequested"
  val LambdaFunctionScheduled: "LambdaFunctionScheduled" = "LambdaFunctionScheduled"
  val LambdaFunctionStarted: "LambdaFunctionStarted" = "LambdaFunctionStarted"
  val LambdaFunctionCompleted: "LambdaFunctionCompleted" = "LambdaFunctionCompleted"
  val LambdaFunctionFailed: "LambdaFunctionFailed" = "LambdaFunctionFailed"
  val LambdaFunctionTimedOut: "LambdaFunctionTimedOut" = "LambdaFunctionTimedOut"
  val ScheduleLambdaFunctionFailed: "ScheduleLambdaFunctionFailed" = "ScheduleLambdaFunctionFailed"
  val StartLambdaFunctionFailed: "StartLambdaFunctionFailed" = "StartLambdaFunctionFailed"

  @inline def values = js.Array[EventType](
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

type ExecutionStatus = "OPEN" | "CLOSED"
object ExecutionStatus {
  val OPEN: "OPEN" = "OPEN"
  val CLOSED: "CLOSED" = "CLOSED"

  @inline def values = js.Array[ExecutionStatus](OPEN, CLOSED)
}

type FailWorkflowExecutionFailedCause = "UNHANDLED_DECISION" | "OPERATION_NOT_PERMITTED"
object FailWorkflowExecutionFailedCause {
  val UNHANDLED_DECISION: "UNHANDLED_DECISION" = "UNHANDLED_DECISION"
  val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  @inline def values = js.Array[FailWorkflowExecutionFailedCause](UNHANDLED_DECISION, OPERATION_NOT_PERMITTED)
}

type LambdaFunctionTimeoutType = "START_TO_CLOSE"
object LambdaFunctionTimeoutType {
  val START_TO_CLOSE: "START_TO_CLOSE" = "START_TO_CLOSE"

  @inline def values = js.Array[LambdaFunctionTimeoutType](START_TO_CLOSE)
}

type RecordMarkerFailedCause = "OPERATION_NOT_PERMITTED"
object RecordMarkerFailedCause {
  val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  @inline def values = js.Array[RecordMarkerFailedCause](OPERATION_NOT_PERMITTED)
}

type RegistrationStatus = "REGISTERED" | "DEPRECATED"
object RegistrationStatus {
  val REGISTERED: "REGISTERED" = "REGISTERED"
  val DEPRECATED: "DEPRECATED" = "DEPRECATED"

  @inline def values = js.Array[RegistrationStatus](REGISTERED, DEPRECATED)
}

type RequestCancelActivityTaskFailedCause = "ACTIVITY_ID_UNKNOWN" | "OPERATION_NOT_PERMITTED"
object RequestCancelActivityTaskFailedCause {
  val ACTIVITY_ID_UNKNOWN: "ACTIVITY_ID_UNKNOWN" = "ACTIVITY_ID_UNKNOWN"
  val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  @inline def values = js.Array[RequestCancelActivityTaskFailedCause](ACTIVITY_ID_UNKNOWN, OPERATION_NOT_PERMITTED)
}

type RequestCancelExternalWorkflowExecutionFailedCause = "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION" | "REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED" | "OPERATION_NOT_PERMITTED"
object RequestCancelExternalWorkflowExecutionFailedCause {
  val UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION: "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION" = "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION"
  val REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED: "REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED" = "REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED"
  val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  @inline def values = js.Array[RequestCancelExternalWorkflowExecutionFailedCause](UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION, REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED)
}

type ScheduleActivityTaskFailedCause = "ACTIVITY_TYPE_DEPRECATED" | "ACTIVITY_TYPE_DOES_NOT_EXIST" | "ACTIVITY_ID_ALREADY_IN_USE" | "OPEN_ACTIVITIES_LIMIT_EXCEEDED" | "ACTIVITY_CREATION_RATE_EXCEEDED" | "DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED" | "DEFAULT_TASK_LIST_UNDEFINED" | "DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED" | "DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED" | "DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED" | "OPERATION_NOT_PERMITTED"
object ScheduleActivityTaskFailedCause {
  val ACTIVITY_TYPE_DEPRECATED: "ACTIVITY_TYPE_DEPRECATED" = "ACTIVITY_TYPE_DEPRECATED"
  val ACTIVITY_TYPE_DOES_NOT_EXIST: "ACTIVITY_TYPE_DOES_NOT_EXIST" = "ACTIVITY_TYPE_DOES_NOT_EXIST"
  val ACTIVITY_ID_ALREADY_IN_USE: "ACTIVITY_ID_ALREADY_IN_USE" = "ACTIVITY_ID_ALREADY_IN_USE"
  val OPEN_ACTIVITIES_LIMIT_EXCEEDED: "OPEN_ACTIVITIES_LIMIT_EXCEEDED" = "OPEN_ACTIVITIES_LIMIT_EXCEEDED"
  val ACTIVITY_CREATION_RATE_EXCEEDED: "ACTIVITY_CREATION_RATE_EXCEEDED" = "ACTIVITY_CREATION_RATE_EXCEEDED"
  val DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED: "DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED" = "DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED"
  val DEFAULT_TASK_LIST_UNDEFINED: "DEFAULT_TASK_LIST_UNDEFINED" = "DEFAULT_TASK_LIST_UNDEFINED"
  val DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED: "DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED" = "DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED"
  val DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED: "DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED" = "DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED"
  val DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED: "DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED" = "DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED"
  val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  @inline def values = js.Array[ScheduleActivityTaskFailedCause](
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

type ScheduleLambdaFunctionFailedCause = "ID_ALREADY_IN_USE" | "OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED" | "LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED" | "LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION"
object ScheduleLambdaFunctionFailedCause {
  val ID_ALREADY_IN_USE: "ID_ALREADY_IN_USE" = "ID_ALREADY_IN_USE"
  val OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED: "OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED" = "OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED"
  val LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED: "LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED" = "LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED"
  val LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION: "LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION" = "LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION"

  @inline def values = js.Array[ScheduleLambdaFunctionFailedCause](ID_ALREADY_IN_USE, OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED, LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED, LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION)
}

type SignalExternalWorkflowExecutionFailedCause = "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION" | "SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED" | "OPERATION_NOT_PERMITTED"
object SignalExternalWorkflowExecutionFailedCause {
  val UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION: "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION" = "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION"
  val SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED: "SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED" = "SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED"
  val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  @inline def values = js.Array[SignalExternalWorkflowExecutionFailedCause](UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION, SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED)
}

type StartChildWorkflowExecutionFailedCause = "WORKFLOW_TYPE_DOES_NOT_EXIST" | "WORKFLOW_TYPE_DEPRECATED" | "OPEN_CHILDREN_LIMIT_EXCEEDED" | "OPEN_WORKFLOWS_LIMIT_EXCEEDED" | "CHILD_CREATION_RATE_EXCEEDED" | "WORKFLOW_ALREADY_RUNNING" | "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED" | "DEFAULT_TASK_LIST_UNDEFINED" | "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED" | "DEFAULT_CHILD_POLICY_UNDEFINED" | "OPERATION_NOT_PERMITTED"
object StartChildWorkflowExecutionFailedCause {
  val WORKFLOW_TYPE_DOES_NOT_EXIST: "WORKFLOW_TYPE_DOES_NOT_EXIST" = "WORKFLOW_TYPE_DOES_NOT_EXIST"
  val WORKFLOW_TYPE_DEPRECATED: "WORKFLOW_TYPE_DEPRECATED" = "WORKFLOW_TYPE_DEPRECATED"
  val OPEN_CHILDREN_LIMIT_EXCEEDED: "OPEN_CHILDREN_LIMIT_EXCEEDED" = "OPEN_CHILDREN_LIMIT_EXCEEDED"
  val OPEN_WORKFLOWS_LIMIT_EXCEEDED: "OPEN_WORKFLOWS_LIMIT_EXCEEDED" = "OPEN_WORKFLOWS_LIMIT_EXCEEDED"
  val CHILD_CREATION_RATE_EXCEEDED: "CHILD_CREATION_RATE_EXCEEDED" = "CHILD_CREATION_RATE_EXCEEDED"
  val WORKFLOW_ALREADY_RUNNING: "WORKFLOW_ALREADY_RUNNING" = "WORKFLOW_ALREADY_RUNNING"
  val DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED: "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED" = "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED"
  val DEFAULT_TASK_LIST_UNDEFINED: "DEFAULT_TASK_LIST_UNDEFINED" = "DEFAULT_TASK_LIST_UNDEFINED"
  val DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED: "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED" = "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED"
  val DEFAULT_CHILD_POLICY_UNDEFINED: "DEFAULT_CHILD_POLICY_UNDEFINED" = "DEFAULT_CHILD_POLICY_UNDEFINED"
  val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  @inline def values = js.Array[StartChildWorkflowExecutionFailedCause](
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

type StartLambdaFunctionFailedCause = "ASSUME_ROLE_FAILED"
object StartLambdaFunctionFailedCause {
  val ASSUME_ROLE_FAILED: "ASSUME_ROLE_FAILED" = "ASSUME_ROLE_FAILED"

  @inline def values = js.Array[StartLambdaFunctionFailedCause](ASSUME_ROLE_FAILED)
}

type StartTimerFailedCause = "TIMER_ID_ALREADY_IN_USE" | "OPEN_TIMERS_LIMIT_EXCEEDED" | "TIMER_CREATION_RATE_EXCEEDED" | "OPERATION_NOT_PERMITTED"
object StartTimerFailedCause {
  val TIMER_ID_ALREADY_IN_USE: "TIMER_ID_ALREADY_IN_USE" = "TIMER_ID_ALREADY_IN_USE"
  val OPEN_TIMERS_LIMIT_EXCEEDED: "OPEN_TIMERS_LIMIT_EXCEEDED" = "OPEN_TIMERS_LIMIT_EXCEEDED"
  val TIMER_CREATION_RATE_EXCEEDED: "TIMER_CREATION_RATE_EXCEEDED" = "TIMER_CREATION_RATE_EXCEEDED"
  val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  @inline def values = js.Array[StartTimerFailedCause](TIMER_ID_ALREADY_IN_USE, OPEN_TIMERS_LIMIT_EXCEEDED, TIMER_CREATION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED)
}

type WorkflowExecutionCancelRequestedCause = "CHILD_POLICY_APPLIED"
object WorkflowExecutionCancelRequestedCause {
  val CHILD_POLICY_APPLIED: "CHILD_POLICY_APPLIED" = "CHILD_POLICY_APPLIED"

  @inline def values = js.Array[WorkflowExecutionCancelRequestedCause](CHILD_POLICY_APPLIED)
}

type WorkflowExecutionTerminatedCause = "CHILD_POLICY_APPLIED" | "EVENT_LIMIT_EXCEEDED" | "OPERATOR_INITIATED"
object WorkflowExecutionTerminatedCause {
  val CHILD_POLICY_APPLIED: "CHILD_POLICY_APPLIED" = "CHILD_POLICY_APPLIED"
  val EVENT_LIMIT_EXCEEDED: "EVENT_LIMIT_EXCEEDED" = "EVENT_LIMIT_EXCEEDED"
  val OPERATOR_INITIATED: "OPERATOR_INITIATED" = "OPERATOR_INITIATED"

  @inline def values = js.Array[WorkflowExecutionTerminatedCause](CHILD_POLICY_APPLIED, EVENT_LIMIT_EXCEEDED, OPERATOR_INITIATED)
}

type WorkflowExecutionTimeoutType = "START_TO_CLOSE"
object WorkflowExecutionTimeoutType {
  val START_TO_CLOSE: "START_TO_CLOSE" = "START_TO_CLOSE"

  @inline def values = js.Array[WorkflowExecutionTimeoutType](START_TO_CLOSE)
}
