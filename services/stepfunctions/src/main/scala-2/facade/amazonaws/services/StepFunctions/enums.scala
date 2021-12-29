package facade.amazonaws.services.stepfunctions

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ExecutionStatus extends js.Any
object ExecutionStatus {
  val RUNNING = "RUNNING".asInstanceOf[ExecutionStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[ExecutionStatus]
  val FAILED = "FAILED".asInstanceOf[ExecutionStatus]
  val TIMED_OUT = "TIMED_OUT".asInstanceOf[ExecutionStatus]
  val ABORTED = "ABORTED".asInstanceOf[ExecutionStatus]

  @inline def values = js.Array(RUNNING, SUCCEEDED, FAILED, TIMED_OUT, ABORTED)
}

@js.native
sealed trait HistoryEventType extends js.Any
object HistoryEventType {
  val ActivityFailed = "ActivityFailed".asInstanceOf[HistoryEventType]
  val ActivityScheduled = "ActivityScheduled".asInstanceOf[HistoryEventType]
  val ActivityScheduleFailed = "ActivityScheduleFailed".asInstanceOf[HistoryEventType]
  val ActivityStarted = "ActivityStarted".asInstanceOf[HistoryEventType]
  val ActivitySucceeded = "ActivitySucceeded".asInstanceOf[HistoryEventType]
  val ActivityTimedOut = "ActivityTimedOut".asInstanceOf[HistoryEventType]
  val ChoiceStateEntered = "ChoiceStateEntered".asInstanceOf[HistoryEventType]
  val ChoiceStateExited = "ChoiceStateExited".asInstanceOf[HistoryEventType]
  val ExecutionAborted = "ExecutionAborted".asInstanceOf[HistoryEventType]
  val ExecutionFailed = "ExecutionFailed".asInstanceOf[HistoryEventType]
  val ExecutionStarted = "ExecutionStarted".asInstanceOf[HistoryEventType]
  val ExecutionSucceeded = "ExecutionSucceeded".asInstanceOf[HistoryEventType]
  val ExecutionTimedOut = "ExecutionTimedOut".asInstanceOf[HistoryEventType]
  val FailStateEntered = "FailStateEntered".asInstanceOf[HistoryEventType]
  val LambdaFunctionFailed = "LambdaFunctionFailed".asInstanceOf[HistoryEventType]
  val LambdaFunctionScheduled = "LambdaFunctionScheduled".asInstanceOf[HistoryEventType]
  val LambdaFunctionScheduleFailed = "LambdaFunctionScheduleFailed".asInstanceOf[HistoryEventType]
  val LambdaFunctionStarted = "LambdaFunctionStarted".asInstanceOf[HistoryEventType]
  val LambdaFunctionStartFailed = "LambdaFunctionStartFailed".asInstanceOf[HistoryEventType]
  val LambdaFunctionSucceeded = "LambdaFunctionSucceeded".asInstanceOf[HistoryEventType]
  val LambdaFunctionTimedOut = "LambdaFunctionTimedOut".asInstanceOf[HistoryEventType]
  val MapIterationAborted = "MapIterationAborted".asInstanceOf[HistoryEventType]
  val MapIterationFailed = "MapIterationFailed".asInstanceOf[HistoryEventType]
  val MapIterationStarted = "MapIterationStarted".asInstanceOf[HistoryEventType]
  val MapIterationSucceeded = "MapIterationSucceeded".asInstanceOf[HistoryEventType]
  val MapStateAborted = "MapStateAborted".asInstanceOf[HistoryEventType]
  val MapStateEntered = "MapStateEntered".asInstanceOf[HistoryEventType]
  val MapStateExited = "MapStateExited".asInstanceOf[HistoryEventType]
  val MapStateFailed = "MapStateFailed".asInstanceOf[HistoryEventType]
  val MapStateStarted = "MapStateStarted".asInstanceOf[HistoryEventType]
  val MapStateSucceeded = "MapStateSucceeded".asInstanceOf[HistoryEventType]
  val ParallelStateAborted = "ParallelStateAborted".asInstanceOf[HistoryEventType]
  val ParallelStateEntered = "ParallelStateEntered".asInstanceOf[HistoryEventType]
  val ParallelStateExited = "ParallelStateExited".asInstanceOf[HistoryEventType]
  val ParallelStateFailed = "ParallelStateFailed".asInstanceOf[HistoryEventType]
  val ParallelStateStarted = "ParallelStateStarted".asInstanceOf[HistoryEventType]
  val ParallelStateSucceeded = "ParallelStateSucceeded".asInstanceOf[HistoryEventType]
  val PassStateEntered = "PassStateEntered".asInstanceOf[HistoryEventType]
  val PassStateExited = "PassStateExited".asInstanceOf[HistoryEventType]
  val SucceedStateEntered = "SucceedStateEntered".asInstanceOf[HistoryEventType]
  val SucceedStateExited = "SucceedStateExited".asInstanceOf[HistoryEventType]
  val TaskFailed = "TaskFailed".asInstanceOf[HistoryEventType]
  val TaskScheduled = "TaskScheduled".asInstanceOf[HistoryEventType]
  val TaskStarted = "TaskStarted".asInstanceOf[HistoryEventType]
  val TaskStartFailed = "TaskStartFailed".asInstanceOf[HistoryEventType]
  val TaskStateAborted = "TaskStateAborted".asInstanceOf[HistoryEventType]
  val TaskStateEntered = "TaskStateEntered".asInstanceOf[HistoryEventType]
  val TaskStateExited = "TaskStateExited".asInstanceOf[HistoryEventType]
  val TaskSubmitFailed = "TaskSubmitFailed".asInstanceOf[HistoryEventType]
  val TaskSubmitted = "TaskSubmitted".asInstanceOf[HistoryEventType]
  val TaskSucceeded = "TaskSucceeded".asInstanceOf[HistoryEventType]
  val TaskTimedOut = "TaskTimedOut".asInstanceOf[HistoryEventType]
  val WaitStateAborted = "WaitStateAborted".asInstanceOf[HistoryEventType]
  val WaitStateEntered = "WaitStateEntered".asInstanceOf[HistoryEventType]
  val WaitStateExited = "WaitStateExited".asInstanceOf[HistoryEventType]

  @inline def values = js.Array(ActivityFailed, ActivityScheduled, ActivityScheduleFailed, ActivityStarted, ActivitySucceeded, ActivityTimedOut, ChoiceStateEntered, ChoiceStateExited, ExecutionAborted, ExecutionFailed, ExecutionStarted, ExecutionSucceeded, ExecutionTimedOut, FailStateEntered, LambdaFunctionFailed, LambdaFunctionScheduled, LambdaFunctionScheduleFailed, LambdaFunctionStarted, LambdaFunctionStartFailed, LambdaFunctionSucceeded, LambdaFunctionTimedOut, MapIterationAborted, MapIterationFailed, MapIterationStarted, MapIterationSucceeded, MapStateAborted, MapStateEntered, MapStateExited, MapStateFailed, MapStateStarted, MapStateSucceeded, ParallelStateAborted, ParallelStateEntered, ParallelStateExited, ParallelStateFailed, ParallelStateStarted, ParallelStateSucceeded, PassStateEntered, PassStateExited, SucceedStateEntered, SucceedStateExited, TaskFailed, TaskScheduled, TaskStarted, TaskStartFailed, TaskStateAborted, TaskStateEntered, TaskStateExited, TaskSubmitFailed, TaskSubmitted, TaskSucceeded, TaskTimedOut, WaitStateAborted, WaitStateEntered, WaitStateExited)
}

@js.native
sealed trait LogLevel extends js.Any
object LogLevel {
  val ALL = "ALL".asInstanceOf[LogLevel]
  val ERROR = "ERROR".asInstanceOf[LogLevel]
  val FATAL = "FATAL".asInstanceOf[LogLevel]
  val OFF = "OFF".asInstanceOf[LogLevel]

  @inline def values = js.Array(ALL, ERROR, FATAL, OFF)
}

@js.native
sealed trait StateMachineStatus extends js.Any
object StateMachineStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[StateMachineStatus]
  val DELETING = "DELETING".asInstanceOf[StateMachineStatus]

  @inline def values = js.Array(ACTIVE, DELETING)
}

@js.native
sealed trait StateMachineType extends js.Any
object StateMachineType {
  val STANDARD = "STANDARD".asInstanceOf[StateMachineType]
  val EXPRESS = "EXPRESS".asInstanceOf[StateMachineType]

  @inline def values = js.Array(STANDARD, EXPRESS)
}

@js.native
sealed trait SyncExecutionStatus extends js.Any
object SyncExecutionStatus {
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[SyncExecutionStatus]
  val FAILED = "FAILED".asInstanceOf[SyncExecutionStatus]
  val TIMED_OUT = "TIMED_OUT".asInstanceOf[SyncExecutionStatus]

  @inline def values = js.Array(SUCCEEDED, FAILED, TIMED_OUT)
}

