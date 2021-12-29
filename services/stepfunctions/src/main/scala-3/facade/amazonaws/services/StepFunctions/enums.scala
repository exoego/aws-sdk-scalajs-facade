package facade.amazonaws.services.stepfunctions

import scalajs._

type ExecutionStatus = "RUNNING" | "SUCCEEDED" | "FAILED" | "TIMED_OUT" | "ABORTED"
object ExecutionStatus {
  val RUNNING: "RUNNING" = "RUNNING"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"
  val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  val ABORTED: "ABORTED" = "ABORTED"

  @inline def values = js.Array[ExecutionStatus](RUNNING, SUCCEEDED, FAILED, TIMED_OUT, ABORTED)
}

type HistoryEventType = "ActivityFailed" | "ActivityScheduled" | "ActivityScheduleFailed" | "ActivityStarted" | "ActivitySucceeded" | "ActivityTimedOut" | "ChoiceStateEntered" | "ChoiceStateExited" | "ExecutionAborted" | "ExecutionFailed" | "ExecutionStarted" | "ExecutionSucceeded" | "ExecutionTimedOut" | "FailStateEntered" | "LambdaFunctionFailed" | "LambdaFunctionScheduled" | "LambdaFunctionScheduleFailed" | "LambdaFunctionStarted" | "LambdaFunctionStartFailed" | "LambdaFunctionSucceeded" | "LambdaFunctionTimedOut" | "MapIterationAborted" | "MapIterationFailed" | "MapIterationStarted" | "MapIterationSucceeded" | "MapStateAborted" | "MapStateEntered" | "MapStateExited" | "MapStateFailed" | "MapStateStarted" | "MapStateSucceeded" | "ParallelStateAborted" | "ParallelStateEntered" | "ParallelStateExited" | "ParallelStateFailed" | "ParallelStateStarted" | "ParallelStateSucceeded" | "PassStateEntered" | "PassStateExited" | "SucceedStateEntered" | "SucceedStateExited" | "TaskFailed" |
  "TaskScheduled" | "TaskStarted" | "TaskStartFailed" | "TaskStateAborted" | "TaskStateEntered" | "TaskStateExited" | "TaskSubmitFailed" | "TaskSubmitted" | "TaskSucceeded" | "TaskTimedOut" | "WaitStateAborted" | "WaitStateEntered" | "WaitStateExited"
object HistoryEventType {
  val ActivityFailed: "ActivityFailed" = "ActivityFailed"
  val ActivityScheduled: "ActivityScheduled" = "ActivityScheduled"
  val ActivityScheduleFailed: "ActivityScheduleFailed" = "ActivityScheduleFailed"
  val ActivityStarted: "ActivityStarted" = "ActivityStarted"
  val ActivitySucceeded: "ActivitySucceeded" = "ActivitySucceeded"
  val ActivityTimedOut: "ActivityTimedOut" = "ActivityTimedOut"
  val ChoiceStateEntered: "ChoiceStateEntered" = "ChoiceStateEntered"
  val ChoiceStateExited: "ChoiceStateExited" = "ChoiceStateExited"
  val ExecutionAborted: "ExecutionAborted" = "ExecutionAborted"
  val ExecutionFailed: "ExecutionFailed" = "ExecutionFailed"
  val ExecutionStarted: "ExecutionStarted" = "ExecutionStarted"
  val ExecutionSucceeded: "ExecutionSucceeded" = "ExecutionSucceeded"
  val ExecutionTimedOut: "ExecutionTimedOut" = "ExecutionTimedOut"
  val FailStateEntered: "FailStateEntered" = "FailStateEntered"
  val LambdaFunctionFailed: "LambdaFunctionFailed" = "LambdaFunctionFailed"
  val LambdaFunctionScheduled: "LambdaFunctionScheduled" = "LambdaFunctionScheduled"
  val LambdaFunctionScheduleFailed: "LambdaFunctionScheduleFailed" = "LambdaFunctionScheduleFailed"
  val LambdaFunctionStarted: "LambdaFunctionStarted" = "LambdaFunctionStarted"
  val LambdaFunctionStartFailed: "LambdaFunctionStartFailed" = "LambdaFunctionStartFailed"
  val LambdaFunctionSucceeded: "LambdaFunctionSucceeded" = "LambdaFunctionSucceeded"
  val LambdaFunctionTimedOut: "LambdaFunctionTimedOut" = "LambdaFunctionTimedOut"
  val MapIterationAborted: "MapIterationAborted" = "MapIterationAborted"
  val MapIterationFailed: "MapIterationFailed" = "MapIterationFailed"
  val MapIterationStarted: "MapIterationStarted" = "MapIterationStarted"
  val MapIterationSucceeded: "MapIterationSucceeded" = "MapIterationSucceeded"
  val MapStateAborted: "MapStateAborted" = "MapStateAborted"
  val MapStateEntered: "MapStateEntered" = "MapStateEntered"
  val MapStateExited: "MapStateExited" = "MapStateExited"
  val MapStateFailed: "MapStateFailed" = "MapStateFailed"
  val MapStateStarted: "MapStateStarted" = "MapStateStarted"
  val MapStateSucceeded: "MapStateSucceeded" = "MapStateSucceeded"
  val ParallelStateAborted: "ParallelStateAborted" = "ParallelStateAborted"
  val ParallelStateEntered: "ParallelStateEntered" = "ParallelStateEntered"
  val ParallelStateExited: "ParallelStateExited" = "ParallelStateExited"
  val ParallelStateFailed: "ParallelStateFailed" = "ParallelStateFailed"
  val ParallelStateStarted: "ParallelStateStarted" = "ParallelStateStarted"
  val ParallelStateSucceeded: "ParallelStateSucceeded" = "ParallelStateSucceeded"
  val PassStateEntered: "PassStateEntered" = "PassStateEntered"
  val PassStateExited: "PassStateExited" = "PassStateExited"
  val SucceedStateEntered: "SucceedStateEntered" = "SucceedStateEntered"
  val SucceedStateExited: "SucceedStateExited" = "SucceedStateExited"
  val TaskFailed: "TaskFailed" = "TaskFailed"
  val TaskScheduled: "TaskScheduled" = "TaskScheduled"
  val TaskStarted: "TaskStarted" = "TaskStarted"
  val TaskStartFailed: "TaskStartFailed" = "TaskStartFailed"
  val TaskStateAborted: "TaskStateAborted" = "TaskStateAborted"
  val TaskStateEntered: "TaskStateEntered" = "TaskStateEntered"
  val TaskStateExited: "TaskStateExited" = "TaskStateExited"
  val TaskSubmitFailed: "TaskSubmitFailed" = "TaskSubmitFailed"
  val TaskSubmitted: "TaskSubmitted" = "TaskSubmitted"
  val TaskSucceeded: "TaskSucceeded" = "TaskSucceeded"
  val TaskTimedOut: "TaskTimedOut" = "TaskTimedOut"
  val WaitStateAborted: "WaitStateAborted" = "WaitStateAborted"
  val WaitStateEntered: "WaitStateEntered" = "WaitStateEntered"
  val WaitStateExited: "WaitStateExited" = "WaitStateExited"

  @inline def values = js.Array[HistoryEventType](
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
  val ALL: "ALL" = "ALL"
  val ERROR: "ERROR" = "ERROR"
  val FATAL: "FATAL" = "FATAL"
  val OFF: "OFF" = "OFF"

  @inline def values = js.Array[LogLevel](ALL, ERROR, FATAL, OFF)
}

type StateMachineStatus = "ACTIVE" | "DELETING"
object StateMachineStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[StateMachineStatus](ACTIVE, DELETING)
}

type StateMachineType = "STANDARD" | "EXPRESS"
object StateMachineType {
  val STANDARD: "STANDARD" = "STANDARD"
  val EXPRESS: "EXPRESS" = "EXPRESS"

  @inline def values = js.Array[StateMachineType](STANDARD, EXPRESS)
}

type SyncExecutionStatus = "SUCCEEDED" | "FAILED" | "TIMED_OUT"
object SyncExecutionStatus {
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"
  val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"

  @inline def values = js.Array[SyncExecutionStatus](SUCCEEDED, FAILED, TIMED_OUT)
}
