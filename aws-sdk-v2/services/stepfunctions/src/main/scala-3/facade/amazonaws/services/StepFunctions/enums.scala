package facade.amazonaws.services.stepfunctions

import scalajs.js

type ExecutionStatus = "RUNNING" | "SUCCEEDED" | "FAILED" | "TIMED_OUT" | "ABORTED"
object ExecutionStatus {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  inline val ABORTED: "ABORTED" = "ABORTED"

  inline def values: js.Array[ExecutionStatus] = js.Array(RUNNING, SUCCEEDED, FAILED, TIMED_OUT, ABORTED)
}

type HistoryEventType = "ActivityFailed" | "ActivityScheduled" | "ActivityScheduleFailed" | "ActivityStarted" | "ActivitySucceeded" | "ActivityTimedOut" | "ChoiceStateEntered" | "ChoiceStateExited" | "ExecutionAborted" | "ExecutionFailed" | "ExecutionStarted" | "ExecutionSucceeded" | "ExecutionTimedOut" | "FailStateEntered" | "LambdaFunctionFailed" | "LambdaFunctionScheduled" | "LambdaFunctionScheduleFailed" | "LambdaFunctionStarted" | "LambdaFunctionStartFailed" | "LambdaFunctionSucceeded" | "LambdaFunctionTimedOut" | "MapIterationAborted" | "MapIterationFailed" | "MapIterationStarted" | "MapIterationSucceeded" | "MapStateAborted" | "MapStateEntered" | "MapStateExited" | "MapStateFailed" | "MapStateStarted" | "MapStateSucceeded" | "ParallelStateAborted" | "ParallelStateEntered" | "ParallelStateExited" | "ParallelStateFailed" | "ParallelStateStarted" | "ParallelStateSucceeded" | "PassStateEntered" | "PassStateExited" | "SucceedStateEntered" | "SucceedStateExited" | "TaskFailed" |
  "TaskScheduled" | "TaskStarted" | "TaskStartFailed" | "TaskStateAborted" | "TaskStateEntered" | "TaskStateExited" | "TaskSubmitFailed" | "TaskSubmitted" | "TaskSucceeded" | "TaskTimedOut" | "WaitStateAborted" | "WaitStateEntered" | "WaitStateExited"
object HistoryEventType {
  inline val ActivityFailed: "ActivityFailed" = "ActivityFailed"
  inline val ActivityScheduled: "ActivityScheduled" = "ActivityScheduled"
  inline val ActivityScheduleFailed: "ActivityScheduleFailed" = "ActivityScheduleFailed"
  inline val ActivityStarted: "ActivityStarted" = "ActivityStarted"
  inline val ActivitySucceeded: "ActivitySucceeded" = "ActivitySucceeded"
  inline val ActivityTimedOut: "ActivityTimedOut" = "ActivityTimedOut"
  inline val ChoiceStateEntered: "ChoiceStateEntered" = "ChoiceStateEntered"
  inline val ChoiceStateExited: "ChoiceStateExited" = "ChoiceStateExited"
  inline val ExecutionAborted: "ExecutionAborted" = "ExecutionAborted"
  inline val ExecutionFailed: "ExecutionFailed" = "ExecutionFailed"
  inline val ExecutionStarted: "ExecutionStarted" = "ExecutionStarted"
  inline val ExecutionSucceeded: "ExecutionSucceeded" = "ExecutionSucceeded"
  inline val ExecutionTimedOut: "ExecutionTimedOut" = "ExecutionTimedOut"
  inline val FailStateEntered: "FailStateEntered" = "FailStateEntered"
  inline val LambdaFunctionFailed: "LambdaFunctionFailed" = "LambdaFunctionFailed"
  inline val LambdaFunctionScheduled: "LambdaFunctionScheduled" = "LambdaFunctionScheduled"
  inline val LambdaFunctionScheduleFailed: "LambdaFunctionScheduleFailed" = "LambdaFunctionScheduleFailed"
  inline val LambdaFunctionStarted: "LambdaFunctionStarted" = "LambdaFunctionStarted"
  inline val LambdaFunctionStartFailed: "LambdaFunctionStartFailed" = "LambdaFunctionStartFailed"
  inline val LambdaFunctionSucceeded: "LambdaFunctionSucceeded" = "LambdaFunctionSucceeded"
  inline val LambdaFunctionTimedOut: "LambdaFunctionTimedOut" = "LambdaFunctionTimedOut"
  inline val MapIterationAborted: "MapIterationAborted" = "MapIterationAborted"
  inline val MapIterationFailed: "MapIterationFailed" = "MapIterationFailed"
  inline val MapIterationStarted: "MapIterationStarted" = "MapIterationStarted"
  inline val MapIterationSucceeded: "MapIterationSucceeded" = "MapIterationSucceeded"
  inline val MapStateAborted: "MapStateAborted" = "MapStateAborted"
  inline val MapStateEntered: "MapStateEntered" = "MapStateEntered"
  inline val MapStateExited: "MapStateExited" = "MapStateExited"
  inline val MapStateFailed: "MapStateFailed" = "MapStateFailed"
  inline val MapStateStarted: "MapStateStarted" = "MapStateStarted"
  inline val MapStateSucceeded: "MapStateSucceeded" = "MapStateSucceeded"
  inline val ParallelStateAborted: "ParallelStateAborted" = "ParallelStateAborted"
  inline val ParallelStateEntered: "ParallelStateEntered" = "ParallelStateEntered"
  inline val ParallelStateExited: "ParallelStateExited" = "ParallelStateExited"
  inline val ParallelStateFailed: "ParallelStateFailed" = "ParallelStateFailed"
  inline val ParallelStateStarted: "ParallelStateStarted" = "ParallelStateStarted"
  inline val ParallelStateSucceeded: "ParallelStateSucceeded" = "ParallelStateSucceeded"
  inline val PassStateEntered: "PassStateEntered" = "PassStateEntered"
  inline val PassStateExited: "PassStateExited" = "PassStateExited"
  inline val SucceedStateEntered: "SucceedStateEntered" = "SucceedStateEntered"
  inline val SucceedStateExited: "SucceedStateExited" = "SucceedStateExited"
  inline val TaskFailed: "TaskFailed" = "TaskFailed"
  inline val TaskScheduled: "TaskScheduled" = "TaskScheduled"
  inline val TaskStarted: "TaskStarted" = "TaskStarted"
  inline val TaskStartFailed: "TaskStartFailed" = "TaskStartFailed"
  inline val TaskStateAborted: "TaskStateAborted" = "TaskStateAborted"
  inline val TaskStateEntered: "TaskStateEntered" = "TaskStateEntered"
  inline val TaskStateExited: "TaskStateExited" = "TaskStateExited"
  inline val TaskSubmitFailed: "TaskSubmitFailed" = "TaskSubmitFailed"
  inline val TaskSubmitted: "TaskSubmitted" = "TaskSubmitted"
  inline val TaskSucceeded: "TaskSucceeded" = "TaskSucceeded"
  inline val TaskTimedOut: "TaskTimedOut" = "TaskTimedOut"
  inline val WaitStateAborted: "WaitStateAborted" = "WaitStateAborted"
  inline val WaitStateEntered: "WaitStateEntered" = "WaitStateEntered"
  inline val WaitStateExited: "WaitStateExited" = "WaitStateExited"

  inline def values: js.Array[HistoryEventType] = js.Array(
    ActivityFailed,
    ActivityScheduled,
    ActivityScheduleFailed,
    ActivityStarted,
    ActivitySucceeded,
    ActivityTimedOut,
    ChoiceStateEntered,
    ChoiceStateExited,
    ExecutionAborted,
    ExecutionFailed,
    ExecutionStarted,
    ExecutionSucceeded,
    ExecutionTimedOut,
    FailStateEntered,
    LambdaFunctionFailed,
    LambdaFunctionScheduled,
    LambdaFunctionScheduleFailed,
    LambdaFunctionStarted,
    LambdaFunctionStartFailed,
    LambdaFunctionSucceeded,
    LambdaFunctionTimedOut,
    MapIterationAborted,
    MapIterationFailed,
    MapIterationStarted,
    MapIterationSucceeded,
    MapStateAborted,
    MapStateEntered,
    MapStateExited,
    MapStateFailed,
    MapStateStarted,
    MapStateSucceeded,
    ParallelStateAborted,
    ParallelStateEntered,
    ParallelStateExited,
    ParallelStateFailed,
    ParallelStateStarted,
    ParallelStateSucceeded,
    PassStateEntered,
    PassStateExited,
    SucceedStateEntered,
    SucceedStateExited,
    TaskFailed,
    TaskScheduled,
    TaskStarted,
    TaskStartFailed,
    TaskStateAborted,
    TaskStateEntered,
    TaskStateExited,
    TaskSubmitFailed,
    TaskSubmitted,
    TaskSucceeded,
    TaskTimedOut,
    WaitStateAborted,
    WaitStateEntered,
    WaitStateExited
  )
}

type LogLevel = "ALL" | "ERROR" | "FATAL" | "OFF"
object LogLevel {
  inline val ALL: "ALL" = "ALL"
  inline val ERROR: "ERROR" = "ERROR"
  inline val FATAL: "FATAL" = "FATAL"
  inline val OFF: "OFF" = "OFF"

  inline def values: js.Array[LogLevel] = js.Array(ALL, ERROR, FATAL, OFF)
}

type StateMachineStatus = "ACTIVE" | "DELETING"
object StateMachineStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[StateMachineStatus] = js.Array(ACTIVE, DELETING)
}

type StateMachineType = "STANDARD" | "EXPRESS"
object StateMachineType {
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val EXPRESS: "EXPRESS" = "EXPRESS"

  inline def values: js.Array[StateMachineType] = js.Array(STANDARD, EXPRESS)
}

type SyncExecutionStatus = "SUCCEEDED" | "FAILED" | "TIMED_OUT"
object SyncExecutionStatus {
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"

  inline def values: js.Array[SyncExecutionStatus] = js.Array(SUCCEEDED, FAILED, TIMED_OUT)
}
