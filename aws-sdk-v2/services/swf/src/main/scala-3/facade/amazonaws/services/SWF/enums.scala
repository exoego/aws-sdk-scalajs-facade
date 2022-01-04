package facade.amazonaws.services.swf

import scalajs.js

type ActivityTaskTimeoutType = "START_TO_CLOSE" | "SCHEDULE_TO_START" | "SCHEDULE_TO_CLOSE" | "HEARTBEAT"
object ActivityTaskTimeoutType {
  inline val START_TO_CLOSE: "START_TO_CLOSE" = "START_TO_CLOSE"
  inline val SCHEDULE_TO_START: "SCHEDULE_TO_START" = "SCHEDULE_TO_START"
  inline val SCHEDULE_TO_CLOSE: "SCHEDULE_TO_CLOSE" = "SCHEDULE_TO_CLOSE"
  inline val HEARTBEAT: "HEARTBEAT" = "HEARTBEAT"

  inline def values: js.Array[ActivityTaskTimeoutType] = js.Array(START_TO_CLOSE, SCHEDULE_TO_START, SCHEDULE_TO_CLOSE, HEARTBEAT)
}

type CancelTimerFailedCause = "TIMER_ID_UNKNOWN" | "OPERATION_NOT_PERMITTED"
object CancelTimerFailedCause {
  inline val TIMER_ID_UNKNOWN: "TIMER_ID_UNKNOWN" = "TIMER_ID_UNKNOWN"
  inline val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  inline def values: js.Array[CancelTimerFailedCause] = js.Array(TIMER_ID_UNKNOWN, OPERATION_NOT_PERMITTED)
}

type CancelWorkflowExecutionFailedCause = "UNHANDLED_DECISION" | "OPERATION_NOT_PERMITTED"
object CancelWorkflowExecutionFailedCause {
  inline val UNHANDLED_DECISION: "UNHANDLED_DECISION" = "UNHANDLED_DECISION"
  inline val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  inline def values: js.Array[CancelWorkflowExecutionFailedCause] = js.Array(UNHANDLED_DECISION, OPERATION_NOT_PERMITTED)
}

type ChildPolicy = "TERMINATE" | "REQUEST_CANCEL" | "ABANDON"
object ChildPolicy {
  inline val TERMINATE: "TERMINATE" = "TERMINATE"
  inline val REQUEST_CANCEL: "REQUEST_CANCEL" = "REQUEST_CANCEL"
  inline val ABANDON: "ABANDON" = "ABANDON"

  inline def values: js.Array[ChildPolicy] = js.Array(TERMINATE, REQUEST_CANCEL, ABANDON)
}

type CloseStatus = "COMPLETED" | "FAILED" | "CANCELED" | "TERMINATED" | "CONTINUED_AS_NEW" | "TIMED_OUT"
object CloseStatus {
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val CANCELED: "CANCELED" = "CANCELED"
  inline val TERMINATED: "TERMINATED" = "TERMINATED"
  inline val CONTINUED_AS_NEW: "CONTINUED_AS_NEW" = "CONTINUED_AS_NEW"
  inline val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"

  inline def values: js.Array[CloseStatus] = js.Array(COMPLETED, FAILED, CANCELED, TERMINATED, CONTINUED_AS_NEW, TIMED_OUT)
}

type CompleteWorkflowExecutionFailedCause = "UNHANDLED_DECISION" | "OPERATION_NOT_PERMITTED"
object CompleteWorkflowExecutionFailedCause {
  inline val UNHANDLED_DECISION: "UNHANDLED_DECISION" = "UNHANDLED_DECISION"
  inline val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  inline def values: js.Array[CompleteWorkflowExecutionFailedCause] = js.Array(UNHANDLED_DECISION, OPERATION_NOT_PERMITTED)
}

type ContinueAsNewWorkflowExecutionFailedCause = "UNHANDLED_DECISION" | "WORKFLOW_TYPE_DEPRECATED" | "WORKFLOW_TYPE_DOES_NOT_EXIST" | "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED" | "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED" | "DEFAULT_TASK_LIST_UNDEFINED" | "DEFAULT_CHILD_POLICY_UNDEFINED" | "CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED" | "OPERATION_NOT_PERMITTED"
object ContinueAsNewWorkflowExecutionFailedCause {
  inline val UNHANDLED_DECISION: "UNHANDLED_DECISION" = "UNHANDLED_DECISION"
  inline val WORKFLOW_TYPE_DEPRECATED: "WORKFLOW_TYPE_DEPRECATED" = "WORKFLOW_TYPE_DEPRECATED"
  inline val WORKFLOW_TYPE_DOES_NOT_EXIST: "WORKFLOW_TYPE_DOES_NOT_EXIST" = "WORKFLOW_TYPE_DOES_NOT_EXIST"
  inline val DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED: "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED" = "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED"
  inline val DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED: "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED" = "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED"
  inline val DEFAULT_TASK_LIST_UNDEFINED: "DEFAULT_TASK_LIST_UNDEFINED" = "DEFAULT_TASK_LIST_UNDEFINED"
  inline val DEFAULT_CHILD_POLICY_UNDEFINED: "DEFAULT_CHILD_POLICY_UNDEFINED" = "DEFAULT_CHILD_POLICY_UNDEFINED"
  inline val CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED: "CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED" = "CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED"
  inline val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  inline def values: js.Array[ContinueAsNewWorkflowExecutionFailedCause] = js.Array(
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
  inline val START_TO_CLOSE: "START_TO_CLOSE" = "START_TO_CLOSE"

  inline def values: js.Array[DecisionTaskTimeoutType] = js.Array(START_TO_CLOSE)
}

type DecisionType = "ScheduleActivityTask" | "RequestCancelActivityTask" | "CompleteWorkflowExecution" | "FailWorkflowExecution" | "CancelWorkflowExecution" | "ContinueAsNewWorkflowExecution" | "RecordMarker" | "StartTimer" | "CancelTimer" | "SignalExternalWorkflowExecution" | "RequestCancelExternalWorkflowExecution" | "StartChildWorkflowExecution" | "ScheduleLambdaFunction"
object DecisionType {
  inline val ScheduleActivityTask: "ScheduleActivityTask" = "ScheduleActivityTask"
  inline val RequestCancelActivityTask: "RequestCancelActivityTask" = "RequestCancelActivityTask"
  inline val CompleteWorkflowExecution: "CompleteWorkflowExecution" = "CompleteWorkflowExecution"
  inline val FailWorkflowExecution: "FailWorkflowExecution" = "FailWorkflowExecution"
  inline val CancelWorkflowExecution: "CancelWorkflowExecution" = "CancelWorkflowExecution"
  inline val ContinueAsNewWorkflowExecution: "ContinueAsNewWorkflowExecution" = "ContinueAsNewWorkflowExecution"
  inline val RecordMarker: "RecordMarker" = "RecordMarker"
  inline val StartTimer: "StartTimer" = "StartTimer"
  inline val CancelTimer: "CancelTimer" = "CancelTimer"
  inline val SignalExternalWorkflowExecution: "SignalExternalWorkflowExecution" = "SignalExternalWorkflowExecution"
  inline val RequestCancelExternalWorkflowExecution: "RequestCancelExternalWorkflowExecution" = "RequestCancelExternalWorkflowExecution"
  inline val StartChildWorkflowExecution: "StartChildWorkflowExecution" = "StartChildWorkflowExecution"
  inline val ScheduleLambdaFunction: "ScheduleLambdaFunction" = "ScheduleLambdaFunction"

  inline def values: js.Array[DecisionType] = js.Array(
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
  inline val WorkflowExecutionStarted: "WorkflowExecutionStarted" = "WorkflowExecutionStarted"
  inline val WorkflowExecutionCancelRequested: "WorkflowExecutionCancelRequested" = "WorkflowExecutionCancelRequested"
  inline val WorkflowExecutionCompleted: "WorkflowExecutionCompleted" = "WorkflowExecutionCompleted"
  inline val CompleteWorkflowExecutionFailed: "CompleteWorkflowExecutionFailed" = "CompleteWorkflowExecutionFailed"
  inline val WorkflowExecutionFailed: "WorkflowExecutionFailed" = "WorkflowExecutionFailed"
  inline val FailWorkflowExecutionFailed: "FailWorkflowExecutionFailed" = "FailWorkflowExecutionFailed"
  inline val WorkflowExecutionTimedOut: "WorkflowExecutionTimedOut" = "WorkflowExecutionTimedOut"
  inline val WorkflowExecutionCanceled: "WorkflowExecutionCanceled" = "WorkflowExecutionCanceled"
  inline val CancelWorkflowExecutionFailed: "CancelWorkflowExecutionFailed" = "CancelWorkflowExecutionFailed"
  inline val WorkflowExecutionContinuedAsNew: "WorkflowExecutionContinuedAsNew" = "WorkflowExecutionContinuedAsNew"
  inline val ContinueAsNewWorkflowExecutionFailed: "ContinueAsNewWorkflowExecutionFailed" = "ContinueAsNewWorkflowExecutionFailed"
  inline val WorkflowExecutionTerminated: "WorkflowExecutionTerminated" = "WorkflowExecutionTerminated"
  inline val DecisionTaskScheduled: "DecisionTaskScheduled" = "DecisionTaskScheduled"
  inline val DecisionTaskStarted: "DecisionTaskStarted" = "DecisionTaskStarted"
  inline val DecisionTaskCompleted: "DecisionTaskCompleted" = "DecisionTaskCompleted"
  inline val DecisionTaskTimedOut: "DecisionTaskTimedOut" = "DecisionTaskTimedOut"
  inline val ActivityTaskScheduled: "ActivityTaskScheduled" = "ActivityTaskScheduled"
  inline val ScheduleActivityTaskFailed: "ScheduleActivityTaskFailed" = "ScheduleActivityTaskFailed"
  inline val ActivityTaskStarted: "ActivityTaskStarted" = "ActivityTaskStarted"
  inline val ActivityTaskCompleted: "ActivityTaskCompleted" = "ActivityTaskCompleted"
  inline val ActivityTaskFailed: "ActivityTaskFailed" = "ActivityTaskFailed"
  inline val ActivityTaskTimedOut: "ActivityTaskTimedOut" = "ActivityTaskTimedOut"
  inline val ActivityTaskCanceled: "ActivityTaskCanceled" = "ActivityTaskCanceled"
  inline val ActivityTaskCancelRequested: "ActivityTaskCancelRequested" = "ActivityTaskCancelRequested"
  inline val RequestCancelActivityTaskFailed: "RequestCancelActivityTaskFailed" = "RequestCancelActivityTaskFailed"
  inline val WorkflowExecutionSignaled: "WorkflowExecutionSignaled" = "WorkflowExecutionSignaled"
  inline val MarkerRecorded: "MarkerRecorded" = "MarkerRecorded"
  inline val RecordMarkerFailed: "RecordMarkerFailed" = "RecordMarkerFailed"
  inline val TimerStarted: "TimerStarted" = "TimerStarted"
  inline val StartTimerFailed: "StartTimerFailed" = "StartTimerFailed"
  inline val TimerFired: "TimerFired" = "TimerFired"
  inline val TimerCanceled: "TimerCanceled" = "TimerCanceled"
  inline val CancelTimerFailed: "CancelTimerFailed" = "CancelTimerFailed"
  inline val StartChildWorkflowExecutionInitiated: "StartChildWorkflowExecutionInitiated" = "StartChildWorkflowExecutionInitiated"
  inline val StartChildWorkflowExecutionFailed: "StartChildWorkflowExecutionFailed" = "StartChildWorkflowExecutionFailed"
  inline val ChildWorkflowExecutionStarted: "ChildWorkflowExecutionStarted" = "ChildWorkflowExecutionStarted"
  inline val ChildWorkflowExecutionCompleted: "ChildWorkflowExecutionCompleted" = "ChildWorkflowExecutionCompleted"
  inline val ChildWorkflowExecutionFailed: "ChildWorkflowExecutionFailed" = "ChildWorkflowExecutionFailed"
  inline val ChildWorkflowExecutionTimedOut: "ChildWorkflowExecutionTimedOut" = "ChildWorkflowExecutionTimedOut"
  inline val ChildWorkflowExecutionCanceled: "ChildWorkflowExecutionCanceled" = "ChildWorkflowExecutionCanceled"
  inline val ChildWorkflowExecutionTerminated: "ChildWorkflowExecutionTerminated" = "ChildWorkflowExecutionTerminated"
  inline val SignalExternalWorkflowExecutionInitiated: "SignalExternalWorkflowExecutionInitiated" = "SignalExternalWorkflowExecutionInitiated"
  inline val SignalExternalWorkflowExecutionFailed: "SignalExternalWorkflowExecutionFailed" = "SignalExternalWorkflowExecutionFailed"
  inline val ExternalWorkflowExecutionSignaled: "ExternalWorkflowExecutionSignaled" = "ExternalWorkflowExecutionSignaled"
  inline val RequestCancelExternalWorkflowExecutionInitiated: "RequestCancelExternalWorkflowExecutionInitiated" = "RequestCancelExternalWorkflowExecutionInitiated"
  inline val RequestCancelExternalWorkflowExecutionFailed: "RequestCancelExternalWorkflowExecutionFailed" = "RequestCancelExternalWorkflowExecutionFailed"
  inline val ExternalWorkflowExecutionCancelRequested: "ExternalWorkflowExecutionCancelRequested" = "ExternalWorkflowExecutionCancelRequested"
  inline val LambdaFunctionScheduled: "LambdaFunctionScheduled" = "LambdaFunctionScheduled"
  inline val LambdaFunctionStarted: "LambdaFunctionStarted" = "LambdaFunctionStarted"
  inline val LambdaFunctionCompleted: "LambdaFunctionCompleted" = "LambdaFunctionCompleted"
  inline val LambdaFunctionFailed: "LambdaFunctionFailed" = "LambdaFunctionFailed"
  inline val LambdaFunctionTimedOut: "LambdaFunctionTimedOut" = "LambdaFunctionTimedOut"
  inline val ScheduleLambdaFunctionFailed: "ScheduleLambdaFunctionFailed" = "ScheduleLambdaFunctionFailed"
  inline val StartLambdaFunctionFailed: "StartLambdaFunctionFailed" = "StartLambdaFunctionFailed"

  inline def values: js.Array[EventType] = js.Array(
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
  inline val OPEN: "OPEN" = "OPEN"
  inline val CLOSED: "CLOSED" = "CLOSED"

  inline def values: js.Array[ExecutionStatus] = js.Array(OPEN, CLOSED)
}

type FailWorkflowExecutionFailedCause = "UNHANDLED_DECISION" | "OPERATION_NOT_PERMITTED"
object FailWorkflowExecutionFailedCause {
  inline val UNHANDLED_DECISION: "UNHANDLED_DECISION" = "UNHANDLED_DECISION"
  inline val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  inline def values: js.Array[FailWorkflowExecutionFailedCause] = js.Array(UNHANDLED_DECISION, OPERATION_NOT_PERMITTED)
}

type LambdaFunctionTimeoutType = "START_TO_CLOSE"
object LambdaFunctionTimeoutType {
  inline val START_TO_CLOSE: "START_TO_CLOSE" = "START_TO_CLOSE"

  inline def values: js.Array[LambdaFunctionTimeoutType] = js.Array(START_TO_CLOSE)
}

type RecordMarkerFailedCause = "OPERATION_NOT_PERMITTED"
object RecordMarkerFailedCause {
  inline val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  inline def values: js.Array[RecordMarkerFailedCause] = js.Array(OPERATION_NOT_PERMITTED)
}

type RegistrationStatus = "REGISTERED" | "DEPRECATED"
object RegistrationStatus {
  inline val REGISTERED: "REGISTERED" = "REGISTERED"
  inline val DEPRECATED: "DEPRECATED" = "DEPRECATED"

  inline def values: js.Array[RegistrationStatus] = js.Array(REGISTERED, DEPRECATED)
}

type RequestCancelActivityTaskFailedCause = "ACTIVITY_ID_UNKNOWN" | "OPERATION_NOT_PERMITTED"
object RequestCancelActivityTaskFailedCause {
  inline val ACTIVITY_ID_UNKNOWN: "ACTIVITY_ID_UNKNOWN" = "ACTIVITY_ID_UNKNOWN"
  inline val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  inline def values: js.Array[RequestCancelActivityTaskFailedCause] = js.Array(ACTIVITY_ID_UNKNOWN, OPERATION_NOT_PERMITTED)
}

type RequestCancelExternalWorkflowExecutionFailedCause = "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION" | "REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED" | "OPERATION_NOT_PERMITTED"
object RequestCancelExternalWorkflowExecutionFailedCause {
  inline val UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION: "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION" = "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION"
  inline val REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED: "REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED" = "REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED"
  inline val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  inline def values: js.Array[RequestCancelExternalWorkflowExecutionFailedCause] = js.Array(UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION, REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED)
}

type ScheduleActivityTaskFailedCause = "ACTIVITY_TYPE_DEPRECATED" | "ACTIVITY_TYPE_DOES_NOT_EXIST" | "ACTIVITY_ID_ALREADY_IN_USE" | "OPEN_ACTIVITIES_LIMIT_EXCEEDED" | "ACTIVITY_CREATION_RATE_EXCEEDED" | "DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED" | "DEFAULT_TASK_LIST_UNDEFINED" | "DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED" | "DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED" | "DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED" | "OPERATION_NOT_PERMITTED"
object ScheduleActivityTaskFailedCause {
  inline val ACTIVITY_TYPE_DEPRECATED: "ACTIVITY_TYPE_DEPRECATED" = "ACTIVITY_TYPE_DEPRECATED"
  inline val ACTIVITY_TYPE_DOES_NOT_EXIST: "ACTIVITY_TYPE_DOES_NOT_EXIST" = "ACTIVITY_TYPE_DOES_NOT_EXIST"
  inline val ACTIVITY_ID_ALREADY_IN_USE: "ACTIVITY_ID_ALREADY_IN_USE" = "ACTIVITY_ID_ALREADY_IN_USE"
  inline val OPEN_ACTIVITIES_LIMIT_EXCEEDED: "OPEN_ACTIVITIES_LIMIT_EXCEEDED" = "OPEN_ACTIVITIES_LIMIT_EXCEEDED"
  inline val ACTIVITY_CREATION_RATE_EXCEEDED: "ACTIVITY_CREATION_RATE_EXCEEDED" = "ACTIVITY_CREATION_RATE_EXCEEDED"
  inline val DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED: "DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED" = "DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED"
  inline val DEFAULT_TASK_LIST_UNDEFINED: "DEFAULT_TASK_LIST_UNDEFINED" = "DEFAULT_TASK_LIST_UNDEFINED"
  inline val DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED: "DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED" = "DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED"
  inline val DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED: "DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED" = "DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED"
  inline val DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED: "DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED" = "DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED"
  inline val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  inline def values: js.Array[ScheduleActivityTaskFailedCause] = js.Array(
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
  inline val ID_ALREADY_IN_USE: "ID_ALREADY_IN_USE" = "ID_ALREADY_IN_USE"
  inline val OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED: "OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED" = "OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED"
  inline val LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED: "LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED" = "LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED"
  inline val LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION: "LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION" = "LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION"

  inline def values: js.Array[ScheduleLambdaFunctionFailedCause] = js.Array(ID_ALREADY_IN_USE, OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED, LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED, LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION)
}

type SignalExternalWorkflowExecutionFailedCause = "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION" | "SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED" | "OPERATION_NOT_PERMITTED"
object SignalExternalWorkflowExecutionFailedCause {
  inline val UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION: "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION" = "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION"
  inline val SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED: "SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED" = "SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED"
  inline val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  inline def values: js.Array[SignalExternalWorkflowExecutionFailedCause] = js.Array(UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION, SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED)
}

type StartChildWorkflowExecutionFailedCause = "WORKFLOW_TYPE_DOES_NOT_EXIST" | "WORKFLOW_TYPE_DEPRECATED" | "OPEN_CHILDREN_LIMIT_EXCEEDED" | "OPEN_WORKFLOWS_LIMIT_EXCEEDED" | "CHILD_CREATION_RATE_EXCEEDED" | "WORKFLOW_ALREADY_RUNNING" | "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED" | "DEFAULT_TASK_LIST_UNDEFINED" | "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED" | "DEFAULT_CHILD_POLICY_UNDEFINED" | "OPERATION_NOT_PERMITTED"
object StartChildWorkflowExecutionFailedCause {
  inline val WORKFLOW_TYPE_DOES_NOT_EXIST: "WORKFLOW_TYPE_DOES_NOT_EXIST" = "WORKFLOW_TYPE_DOES_NOT_EXIST"
  inline val WORKFLOW_TYPE_DEPRECATED: "WORKFLOW_TYPE_DEPRECATED" = "WORKFLOW_TYPE_DEPRECATED"
  inline val OPEN_CHILDREN_LIMIT_EXCEEDED: "OPEN_CHILDREN_LIMIT_EXCEEDED" = "OPEN_CHILDREN_LIMIT_EXCEEDED"
  inline val OPEN_WORKFLOWS_LIMIT_EXCEEDED: "OPEN_WORKFLOWS_LIMIT_EXCEEDED" = "OPEN_WORKFLOWS_LIMIT_EXCEEDED"
  inline val CHILD_CREATION_RATE_EXCEEDED: "CHILD_CREATION_RATE_EXCEEDED" = "CHILD_CREATION_RATE_EXCEEDED"
  inline val WORKFLOW_ALREADY_RUNNING: "WORKFLOW_ALREADY_RUNNING" = "WORKFLOW_ALREADY_RUNNING"
  inline val DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED: "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED" = "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED"
  inline val DEFAULT_TASK_LIST_UNDEFINED: "DEFAULT_TASK_LIST_UNDEFINED" = "DEFAULT_TASK_LIST_UNDEFINED"
  inline val DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED: "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED" = "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED"
  inline val DEFAULT_CHILD_POLICY_UNDEFINED: "DEFAULT_CHILD_POLICY_UNDEFINED" = "DEFAULT_CHILD_POLICY_UNDEFINED"
  inline val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  inline def values: js.Array[StartChildWorkflowExecutionFailedCause] = js.Array(
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
  inline val ASSUME_ROLE_FAILED: "ASSUME_ROLE_FAILED" = "ASSUME_ROLE_FAILED"

  inline def values: js.Array[StartLambdaFunctionFailedCause] = js.Array(ASSUME_ROLE_FAILED)
}

type StartTimerFailedCause = "TIMER_ID_ALREADY_IN_USE" | "OPEN_TIMERS_LIMIT_EXCEEDED" | "TIMER_CREATION_RATE_EXCEEDED" | "OPERATION_NOT_PERMITTED"
object StartTimerFailedCause {
  inline val TIMER_ID_ALREADY_IN_USE: "TIMER_ID_ALREADY_IN_USE" = "TIMER_ID_ALREADY_IN_USE"
  inline val OPEN_TIMERS_LIMIT_EXCEEDED: "OPEN_TIMERS_LIMIT_EXCEEDED" = "OPEN_TIMERS_LIMIT_EXCEEDED"
  inline val TIMER_CREATION_RATE_EXCEEDED: "TIMER_CREATION_RATE_EXCEEDED" = "TIMER_CREATION_RATE_EXCEEDED"
  inline val OPERATION_NOT_PERMITTED: "OPERATION_NOT_PERMITTED" = "OPERATION_NOT_PERMITTED"

  inline def values: js.Array[StartTimerFailedCause] = js.Array(TIMER_ID_ALREADY_IN_USE, OPEN_TIMERS_LIMIT_EXCEEDED, TIMER_CREATION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED)
}

type WorkflowExecutionCancelRequestedCause = "CHILD_POLICY_APPLIED"
object WorkflowExecutionCancelRequestedCause {
  inline val CHILD_POLICY_APPLIED: "CHILD_POLICY_APPLIED" = "CHILD_POLICY_APPLIED"

  inline def values: js.Array[WorkflowExecutionCancelRequestedCause] = js.Array(CHILD_POLICY_APPLIED)
}

type WorkflowExecutionTerminatedCause = "CHILD_POLICY_APPLIED" | "EVENT_LIMIT_EXCEEDED" | "OPERATOR_INITIATED"
object WorkflowExecutionTerminatedCause {
  inline val CHILD_POLICY_APPLIED: "CHILD_POLICY_APPLIED" = "CHILD_POLICY_APPLIED"
  inline val EVENT_LIMIT_EXCEEDED: "EVENT_LIMIT_EXCEEDED" = "EVENT_LIMIT_EXCEEDED"
  inline val OPERATOR_INITIATED: "OPERATOR_INITIATED" = "OPERATOR_INITIATED"

  inline def values: js.Array[WorkflowExecutionTerminatedCause] = js.Array(CHILD_POLICY_APPLIED, EVENT_LIMIT_EXCEEDED, OPERATOR_INITIATED)
}

type WorkflowExecutionTimeoutType = "START_TO_CLOSE"
object WorkflowExecutionTimeoutType {
  inline val START_TO_CLOSE: "START_TO_CLOSE" = "START_TO_CLOSE"

  inline def values: js.Array[WorkflowExecutionTimeoutType] = js.Array(START_TO_CLOSE)
}
