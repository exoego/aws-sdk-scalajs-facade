package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object stepfunctions {
  type ActivityList            = js.Array[ActivityListItem]
  type Arn                     = String
  type ConnectorParameters     = String
  type Definition              = String
  type EventId                 = Double
  type ExecutionList           = js.Array[ExecutionListItem]
  type HistoryEventList        = js.Array[HistoryEvent]
  type Identity                = String
  type IncludeExecutionData    = Boolean
  type ListExecutionsPageToken = String
  type LogDestinationList      = js.Array[LogDestination]
  type Name                    = String
  type PageSize                = Int
  type PageToken               = String
  type ReverseOrder            = Boolean
  type SensitiveCause          = String
  type SensitiveData           = String
  type SensitiveDataJobInput   = String
  type SensitiveError          = String
  type StateMachineList        = js.Array[StateMachineListItem]
  type TagKey                  = String
  type TagKeyList              = js.Array[TagKey]
  type TagList                 = js.Array[Tag]
  type TagValue                = String
  type TaskToken               = String
  type TimeoutInSeconds        = Double
  type Timestamp               = js.Date
  type UnsignedInteger         = Int

  implicit final class StepFunctionsOps(private val service: StepFunctions) extends AnyVal {

    @inline def createActivityFuture(params: CreateActivityInput): Future[CreateActivityOutput] =
      service.createActivity(params).promise().toFuture
    @inline def createStateMachineFuture(params: CreateStateMachineInput): Future[CreateStateMachineOutput] =
      service.createStateMachine(params).promise().toFuture
    @inline def deleteActivityFuture(params: DeleteActivityInput): Future[DeleteActivityOutput] =
      service.deleteActivity(params).promise().toFuture
    @inline def deleteStateMachineFuture(params: DeleteStateMachineInput): Future[DeleteStateMachineOutput] =
      service.deleteStateMachine(params).promise().toFuture
    @inline def describeActivityFuture(params: DescribeActivityInput): Future[DescribeActivityOutput] =
      service.describeActivity(params).promise().toFuture
    @inline def describeExecutionFuture(params: DescribeExecutionInput): Future[DescribeExecutionOutput] =
      service.describeExecution(params).promise().toFuture
    @inline def describeStateMachineForExecutionFuture(
        params: DescribeStateMachineForExecutionInput
    ): Future[DescribeStateMachineForExecutionOutput] =
      service.describeStateMachineForExecution(params).promise().toFuture
    @inline def describeStateMachineFuture(params: DescribeStateMachineInput): Future[DescribeStateMachineOutput] =
      service.describeStateMachine(params).promise().toFuture
    @inline def getActivityTaskFuture(params: GetActivityTaskInput): Future[GetActivityTaskOutput] =
      service.getActivityTask(params).promise().toFuture
    @inline def getExecutionHistoryFuture(params: GetExecutionHistoryInput): Future[GetExecutionHistoryOutput] =
      service.getExecutionHistory(params).promise().toFuture
    @inline def listActivitiesFuture(params: ListActivitiesInput): Future[ListActivitiesOutput] =
      service.listActivities(params).promise().toFuture
    @inline def listExecutionsFuture(params: ListExecutionsInput): Future[ListExecutionsOutput] =
      service.listExecutions(params).promise().toFuture
    @inline def listStateMachinesFuture(params: ListStateMachinesInput): Future[ListStateMachinesOutput] =
      service.listStateMachines(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] =
      service.listTagsForResource(params).promise().toFuture
    @inline def sendTaskFailureFuture(params: SendTaskFailureInput): Future[SendTaskFailureOutput] =
      service.sendTaskFailure(params).promise().toFuture
    @inline def sendTaskHeartbeatFuture(params: SendTaskHeartbeatInput): Future[SendTaskHeartbeatOutput] =
      service.sendTaskHeartbeat(params).promise().toFuture
    @inline def sendTaskSuccessFuture(params: SendTaskSuccessInput): Future[SendTaskSuccessOutput] =
      service.sendTaskSuccess(params).promise().toFuture
    @inline def startExecutionFuture(params: StartExecutionInput): Future[StartExecutionOutput] =
      service.startExecution(params).promise().toFuture
    @inline def stopExecutionFuture(params: StopExecutionInput): Future[StopExecutionOutput] =
      service.stopExecution(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] =
      service.untagResource(params).promise().toFuture
    @inline def updateStateMachineFuture(params: UpdateStateMachineInput): Future[UpdateStateMachineOutput] =
      service.updateStateMachine(params).promise().toFuture
  }
}

package stepfunctions {
  @js.native
  @JSImport("aws-sdk", "StepFunctions")
  class StepFunctions() extends js.Object {
    def this(config: AWSConfig) = this()

    def createActivity(params: CreateActivityInput): Request[CreateActivityOutput]                   = js.native
    def createStateMachine(params: CreateStateMachineInput): Request[CreateStateMachineOutput]       = js.native
    def deleteActivity(params: DeleteActivityInput): Request[DeleteActivityOutput]                   = js.native
    def deleteStateMachine(params: DeleteStateMachineInput): Request[DeleteStateMachineOutput]       = js.native
    def describeActivity(params: DescribeActivityInput): Request[DescribeActivityOutput]             = js.native
    def describeExecution(params: DescribeExecutionInput): Request[DescribeExecutionOutput]          = js.native
    def describeStateMachine(params: DescribeStateMachineInput): Request[DescribeStateMachineOutput] = js.native
    def describeStateMachineForExecution(
        params: DescribeStateMachineForExecutionInput
    ): Request[DescribeStateMachineForExecutionOutput]                                            = js.native
    def getActivityTask(params: GetActivityTaskInput): Request[GetActivityTaskOutput]             = js.native
    def getExecutionHistory(params: GetExecutionHistoryInput): Request[GetExecutionHistoryOutput] = js.native
    def listActivities(params: ListActivitiesInput): Request[ListActivitiesOutput]                = js.native
    def listExecutions(params: ListExecutionsInput): Request[ListExecutionsOutput]                = js.native
    def listStateMachines(params: ListStateMachinesInput): Request[ListStateMachinesOutput]       = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def sendTaskFailure(params: SendTaskFailureInput): Request[SendTaskFailureOutput]             = js.native
    def sendTaskHeartbeat(params: SendTaskHeartbeatInput): Request[SendTaskHeartbeatOutput]       = js.native
    def sendTaskSuccess(params: SendTaskSuccessInput): Request[SendTaskSuccessOutput]             = js.native
    def startExecution(params: StartExecutionInput): Request[StartExecutionOutput]                = js.native
    def stopExecution(params: StopExecutionInput): Request[StopExecutionOutput]                   = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput]                         = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput]                   = js.native
    def updateStateMachine(params: UpdateStateMachineInput): Request[UpdateStateMachineOutput]    = js.native
  }

  /**
    * Contains details about an activity that failed during an execution.
    */
  @js.native
  @Factory
  trait ActivityFailedEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  /**
    * Contains details about an activity.
    */
  @js.native
  @Factory
  trait ActivityListItem extends js.Object {
    var activityArn: Arn
    var creationDate: Timestamp
    var name: Name
  }

  /**
    * Contains details about an activity schedule failure that occurred during an execution.
    */
  @js.native
  @Factory
  trait ActivityScheduleFailedEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  /**
    * Contains details about an activity scheduled during an execution.
    */
  @js.native
  @Factory
  trait ActivityScheduledEventDetails extends js.Object {
    var resource: Arn
    var heartbeatInSeconds: js.UndefOr[TimeoutInSeconds]
    var input: js.UndefOr[SensitiveData]
    var timeoutInSeconds: js.UndefOr[TimeoutInSeconds]
  }

  /**
    * Contains details about the start of an activity during an execution.
    */
  @js.native
  @Factory
  trait ActivityStartedEventDetails extends js.Object {
    var workerName: js.UndefOr[Identity]
  }

  /**
    * Contains details about an activity that successfully terminated during an execution.
    */
  @js.native
  @Factory
  trait ActivitySucceededEventDetails extends js.Object {
    var output: js.UndefOr[SensitiveData]
  }

  /**
    * Contains details about an activity timeout that occurred during an execution.
    */
  @js.native
  @Factory
  trait ActivityTimedOutEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CloudWatchLogsLogGroup extends js.Object {
    var logGroupArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateActivityInput extends js.Object {
    var name: Name
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateActivityOutput extends js.Object {
    var activityArn: Arn
    var creationDate: Timestamp
  }

  @js.native
  @Factory
  trait CreateStateMachineInput extends js.Object {
    var definition: Definition
    var name: Name
    var roleArn: Arn
    var loggingConfiguration: js.UndefOr[LoggingConfiguration]
    var tags: js.UndefOr[TagList]
    var `type`: js.UndefOr[StateMachineType]
  }

  @js.native
  @Factory
  trait CreateStateMachineOutput extends js.Object {
    var creationDate: Timestamp
    var stateMachineArn: Arn
  }

  @js.native
  @Factory
  trait DeleteActivityInput extends js.Object {
    var activityArn: Arn
  }

  @js.native
  @Factory
  trait DeleteActivityOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteStateMachineInput extends js.Object {
    var stateMachineArn: Arn
  }

  @js.native
  @Factory
  trait DeleteStateMachineOutput extends js.Object {}

  @js.native
  @Factory
  trait DescribeActivityInput extends js.Object {
    var activityArn: Arn
  }

  @js.native
  @Factory
  trait DescribeActivityOutput extends js.Object {
    var activityArn: Arn
    var creationDate: Timestamp
    var name: Name
  }

  @js.native
  @Factory
  trait DescribeExecutionInput extends js.Object {
    var executionArn: Arn
  }

  @js.native
  @Factory
  trait DescribeExecutionOutput extends js.Object {
    var executionArn: Arn
    var input: SensitiveData
    var startDate: Timestamp
    var stateMachineArn: Arn
    var status: ExecutionStatus
    var name: js.UndefOr[Name]
    var output: js.UndefOr[SensitiveData]
    var stopDate: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait DescribeStateMachineForExecutionInput extends js.Object {
    var executionArn: Arn
  }

  @js.native
  @Factory
  trait DescribeStateMachineForExecutionOutput extends js.Object {
    var definition: Definition
    var name: Name
    var roleArn: Arn
    var stateMachineArn: Arn
    var updateDate: Timestamp
  }

  @js.native
  @Factory
  trait DescribeStateMachineInput extends js.Object {
    var stateMachineArn: Arn
  }

  @js.native
  @Factory
  trait DescribeStateMachineOutput extends js.Object {
    var creationDate: Timestamp
    var definition: Definition
    var name: Name
    var roleArn: Arn
    var stateMachineArn: Arn
    var `type`: StateMachineType
    var loggingConfiguration: js.UndefOr[LoggingConfiguration]
    var status: js.UndefOr[StateMachineStatus]
  }

  /**
    * Contains details about an abort of an execution.
    */
  @js.native
  @Factory
  trait ExecutionAbortedEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  /**
    * Contains details about an execution failure event.
    */
  @js.native
  @Factory
  trait ExecutionFailedEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  /**
    * Contains details about an execution.
    */
  @js.native
  @Factory
  trait ExecutionListItem extends js.Object {
    var executionArn: Arn
    var name: Name
    var startDate: Timestamp
    var stateMachineArn: Arn
    var status: ExecutionStatus
    var stopDate: js.UndefOr[Timestamp]
  }

  /**
    * Contains details about the start of the execution.
    */
  @js.native
  @Factory
  trait ExecutionStartedEventDetails extends js.Object {
    var input: js.UndefOr[SensitiveData]
    var roleArn: js.UndefOr[Arn]
  }

  @js.native
  sealed trait ExecutionStatus extends js.Any
  object ExecutionStatus extends js.Object {
    val RUNNING   = "RUNNING".asInstanceOf[ExecutionStatus]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[ExecutionStatus]
    val FAILED    = "FAILED".asInstanceOf[ExecutionStatus]
    val TIMED_OUT = "TIMED_OUT".asInstanceOf[ExecutionStatus]
    val ABORTED   = "ABORTED".asInstanceOf[ExecutionStatus]

    val values = js.Object.freeze(js.Array(RUNNING, SUCCEEDED, FAILED, TIMED_OUT, ABORTED))
  }

  /**
    * Contains details about the successful termination of the execution.
    */
  @js.native
  @Factory
  trait ExecutionSucceededEventDetails extends js.Object {
    var output: js.UndefOr[SensitiveData]
  }

  /**
    * Contains details about the execution timeout that occurred during the execution.
    */
  @js.native
  @Factory
  trait ExecutionTimedOutEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  @js.native
  @Factory
  trait GetActivityTaskInput extends js.Object {
    var activityArn: Arn
    var workerName: js.UndefOr[Name]
  }

  @js.native
  @Factory
  trait GetActivityTaskOutput extends js.Object {
    var input: js.UndefOr[SensitiveDataJobInput]
    var taskToken: js.UndefOr[TaskToken]
  }

  @js.native
  @Factory
  trait GetExecutionHistoryInput extends js.Object {
    var executionArn: Arn
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[PageToken]
    var reverseOrder: js.UndefOr[ReverseOrder]
  }

  @js.native
  @Factory
  trait GetExecutionHistoryOutput extends js.Object {
    var events: HistoryEventList
    var nextToken: js.UndefOr[PageToken]
  }

  /**
    * Contains details about the events of an execution.
    */
  @js.native
  @Factory
  trait HistoryEvent extends js.Object {
    var id: EventId
    var timestamp: Timestamp
    var `type`: HistoryEventType
    var activityFailedEventDetails: js.UndefOr[ActivityFailedEventDetails]
    var activityScheduleFailedEventDetails: js.UndefOr[ActivityScheduleFailedEventDetails]
    var activityScheduledEventDetails: js.UndefOr[ActivityScheduledEventDetails]
    var activityStartedEventDetails: js.UndefOr[ActivityStartedEventDetails]
    var activitySucceededEventDetails: js.UndefOr[ActivitySucceededEventDetails]
    var activityTimedOutEventDetails: js.UndefOr[ActivityTimedOutEventDetails]
    var executionAbortedEventDetails: js.UndefOr[ExecutionAbortedEventDetails]
    var executionFailedEventDetails: js.UndefOr[ExecutionFailedEventDetails]
    var executionStartedEventDetails: js.UndefOr[ExecutionStartedEventDetails]
    var executionSucceededEventDetails: js.UndefOr[ExecutionSucceededEventDetails]
    var executionTimedOutEventDetails: js.UndefOr[ExecutionTimedOutEventDetails]
    var lambdaFunctionFailedEventDetails: js.UndefOr[LambdaFunctionFailedEventDetails]
    var lambdaFunctionScheduleFailedEventDetails: js.UndefOr[LambdaFunctionScheduleFailedEventDetails]
    var lambdaFunctionScheduledEventDetails: js.UndefOr[LambdaFunctionScheduledEventDetails]
    var lambdaFunctionStartFailedEventDetails: js.UndefOr[LambdaFunctionStartFailedEventDetails]
    var lambdaFunctionSucceededEventDetails: js.UndefOr[LambdaFunctionSucceededEventDetails]
    var lambdaFunctionTimedOutEventDetails: js.UndefOr[LambdaFunctionTimedOutEventDetails]
    var mapIterationAbortedEventDetails: js.UndefOr[MapIterationEventDetails]
    var mapIterationFailedEventDetails: js.UndefOr[MapIterationEventDetails]
    var mapIterationStartedEventDetails: js.UndefOr[MapIterationEventDetails]
    var mapIterationSucceededEventDetails: js.UndefOr[MapIterationEventDetails]
    var mapStateStartedEventDetails: js.UndefOr[MapStateStartedEventDetails]
    var previousEventId: js.UndefOr[EventId]
    var stateEnteredEventDetails: js.UndefOr[StateEnteredEventDetails]
    var stateExitedEventDetails: js.UndefOr[StateExitedEventDetails]
    var taskFailedEventDetails: js.UndefOr[TaskFailedEventDetails]
    var taskScheduledEventDetails: js.UndefOr[TaskScheduledEventDetails]
    var taskStartFailedEventDetails: js.UndefOr[TaskStartFailedEventDetails]
    var taskStartedEventDetails: js.UndefOr[TaskStartedEventDetails]
    var taskSubmitFailedEventDetails: js.UndefOr[TaskSubmitFailedEventDetails]
    var taskSubmittedEventDetails: js.UndefOr[TaskSubmittedEventDetails]
    var taskSucceededEventDetails: js.UndefOr[TaskSucceededEventDetails]
    var taskTimedOutEventDetails: js.UndefOr[TaskTimedOutEventDetails]
  }

  @js.native
  sealed trait HistoryEventType extends js.Any
  object HistoryEventType extends js.Object {
    val ActivityFailed               = "ActivityFailed".asInstanceOf[HistoryEventType]
    val ActivityScheduled            = "ActivityScheduled".asInstanceOf[HistoryEventType]
    val ActivityScheduleFailed       = "ActivityScheduleFailed".asInstanceOf[HistoryEventType]
    val ActivityStarted              = "ActivityStarted".asInstanceOf[HistoryEventType]
    val ActivitySucceeded            = "ActivitySucceeded".asInstanceOf[HistoryEventType]
    val ActivityTimedOut             = "ActivityTimedOut".asInstanceOf[HistoryEventType]
    val ChoiceStateEntered           = "ChoiceStateEntered".asInstanceOf[HistoryEventType]
    val ChoiceStateExited            = "ChoiceStateExited".asInstanceOf[HistoryEventType]
    val ExecutionAborted             = "ExecutionAborted".asInstanceOf[HistoryEventType]
    val ExecutionFailed              = "ExecutionFailed".asInstanceOf[HistoryEventType]
    val ExecutionStarted             = "ExecutionStarted".asInstanceOf[HistoryEventType]
    val ExecutionSucceeded           = "ExecutionSucceeded".asInstanceOf[HistoryEventType]
    val ExecutionTimedOut            = "ExecutionTimedOut".asInstanceOf[HistoryEventType]
    val FailStateEntered             = "FailStateEntered".asInstanceOf[HistoryEventType]
    val LambdaFunctionFailed         = "LambdaFunctionFailed".asInstanceOf[HistoryEventType]
    val LambdaFunctionScheduled      = "LambdaFunctionScheduled".asInstanceOf[HistoryEventType]
    val LambdaFunctionScheduleFailed = "LambdaFunctionScheduleFailed".asInstanceOf[HistoryEventType]
    val LambdaFunctionStarted        = "LambdaFunctionStarted".asInstanceOf[HistoryEventType]
    val LambdaFunctionStartFailed    = "LambdaFunctionStartFailed".asInstanceOf[HistoryEventType]
    val LambdaFunctionSucceeded      = "LambdaFunctionSucceeded".asInstanceOf[HistoryEventType]
    val LambdaFunctionTimedOut       = "LambdaFunctionTimedOut".asInstanceOf[HistoryEventType]
    val MapIterationAborted          = "MapIterationAborted".asInstanceOf[HistoryEventType]
    val MapIterationFailed           = "MapIterationFailed".asInstanceOf[HistoryEventType]
    val MapIterationStarted          = "MapIterationStarted".asInstanceOf[HistoryEventType]
    val MapIterationSucceeded        = "MapIterationSucceeded".asInstanceOf[HistoryEventType]
    val MapStateAborted              = "MapStateAborted".asInstanceOf[HistoryEventType]
    val MapStateEntered              = "MapStateEntered".asInstanceOf[HistoryEventType]
    val MapStateExited               = "MapStateExited".asInstanceOf[HistoryEventType]
    val MapStateFailed               = "MapStateFailed".asInstanceOf[HistoryEventType]
    val MapStateStarted              = "MapStateStarted".asInstanceOf[HistoryEventType]
    val MapStateSucceeded            = "MapStateSucceeded".asInstanceOf[HistoryEventType]
    val ParallelStateAborted         = "ParallelStateAborted".asInstanceOf[HistoryEventType]
    val ParallelStateEntered         = "ParallelStateEntered".asInstanceOf[HistoryEventType]
    val ParallelStateExited          = "ParallelStateExited".asInstanceOf[HistoryEventType]
    val ParallelStateFailed          = "ParallelStateFailed".asInstanceOf[HistoryEventType]
    val ParallelStateStarted         = "ParallelStateStarted".asInstanceOf[HistoryEventType]
    val ParallelStateSucceeded       = "ParallelStateSucceeded".asInstanceOf[HistoryEventType]
    val PassStateEntered             = "PassStateEntered".asInstanceOf[HistoryEventType]
    val PassStateExited              = "PassStateExited".asInstanceOf[HistoryEventType]
    val SucceedStateEntered          = "SucceedStateEntered".asInstanceOf[HistoryEventType]
    val SucceedStateExited           = "SucceedStateExited".asInstanceOf[HistoryEventType]
    val TaskFailed                   = "TaskFailed".asInstanceOf[HistoryEventType]
    val TaskScheduled                = "TaskScheduled".asInstanceOf[HistoryEventType]
    val TaskStarted                  = "TaskStarted".asInstanceOf[HistoryEventType]
    val TaskStartFailed              = "TaskStartFailed".asInstanceOf[HistoryEventType]
    val TaskStateAborted             = "TaskStateAborted".asInstanceOf[HistoryEventType]
    val TaskStateEntered             = "TaskStateEntered".asInstanceOf[HistoryEventType]
    val TaskStateExited              = "TaskStateExited".asInstanceOf[HistoryEventType]
    val TaskSubmitFailed             = "TaskSubmitFailed".asInstanceOf[HistoryEventType]
    val TaskSubmitted                = "TaskSubmitted".asInstanceOf[HistoryEventType]
    val TaskSucceeded                = "TaskSucceeded".asInstanceOf[HistoryEventType]
    val TaskTimedOut                 = "TaskTimedOut".asInstanceOf[HistoryEventType]
    val WaitStateAborted             = "WaitStateAborted".asInstanceOf[HistoryEventType]
    val WaitStateEntered             = "WaitStateEntered".asInstanceOf[HistoryEventType]
    val WaitStateExited              = "WaitStateExited".asInstanceOf[HistoryEventType]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  /**
    * Contains details about a lambda function that failed during an execution.
    */
  @js.native
  @Factory
  trait LambdaFunctionFailedEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  /**
    * Contains details about a failed lambda function schedule event that occurred during an execution.
    */
  @js.native
  @Factory
  trait LambdaFunctionScheduleFailedEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  /**
    * Contains details about a lambda function scheduled during an execution.
    */
  @js.native
  @Factory
  trait LambdaFunctionScheduledEventDetails extends js.Object {
    var resource: Arn
    var input: js.UndefOr[SensitiveData]
    var timeoutInSeconds: js.UndefOr[TimeoutInSeconds]
  }

  /**
    * Contains details about a lambda function that failed to start during an execution.
    */
  @js.native
  @Factory
  trait LambdaFunctionStartFailedEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  /**
    * Contains details about a lambda function that successfully terminated during an execution.
    */
  @js.native
  @Factory
  trait LambdaFunctionSucceededEventDetails extends js.Object {
    var output: js.UndefOr[SensitiveData]
  }

  /**
    * Contains details about a lambda function timeout that occurred during an execution.
    */
  @js.native
  @Factory
  trait LambdaFunctionTimedOutEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  @js.native
  @Factory
  trait ListActivitiesInput extends js.Object {
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ListActivitiesOutput extends js.Object {
    var activities: ActivityList
    var nextToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ListExecutionsInput extends js.Object {
    var stateMachineArn: Arn
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[ListExecutionsPageToken]
    var statusFilter: js.UndefOr[ExecutionStatus]
  }

  @js.native
  @Factory
  trait ListExecutionsOutput extends js.Object {
    var executions: ExecutionList
    var nextToken: js.UndefOr[ListExecutionsPageToken]
  }

  @js.native
  @Factory
  trait ListStateMachinesInput extends js.Object {
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ListStateMachinesOutput extends js.Object {
    var stateMachines: StateMachineList
    var nextToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceInput extends js.Object {
    var resourceArn: Arn
  }

  @js.native
  @Factory
  trait ListTagsForResourceOutput extends js.Object {
    var tags: js.UndefOr[TagList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait LogDestination extends js.Object {
    var cloudWatchLogsLogGroup: js.UndefOr[CloudWatchLogsLogGroup]
  }

  @js.native
  sealed trait LogLevel extends js.Any
  object LogLevel extends js.Object {
    val ALL   = "ALL".asInstanceOf[LogLevel]
    val ERROR = "ERROR".asInstanceOf[LogLevel]
    val FATAL = "FATAL".asInstanceOf[LogLevel]
    val OFF   = "OFF".asInstanceOf[LogLevel]

    val values = js.Object.freeze(js.Array(ALL, ERROR, FATAL, OFF))
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait LoggingConfiguration extends js.Object {
    var destinations: js.UndefOr[LogDestinationList]
    var includeExecutionData: js.UndefOr[IncludeExecutionData]
    var level: js.UndefOr[LogLevel]
  }

  /**
    * Contains details about an iteration of a Map state.
    */
  @js.native
  @Factory
  trait MapIterationEventDetails extends js.Object {
    var index: js.UndefOr[UnsignedInteger]
    var name: js.UndefOr[Name]
  }

  /**
    * Details about a Map state that was started.
    */
  @js.native
  @Factory
  trait MapStateStartedEventDetails extends js.Object {
    var length: js.UndefOr[UnsignedInteger]
  }

  @js.native
  @Factory
  trait SendTaskFailureInput extends js.Object {
    var taskToken: TaskToken
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  @js.native
  @Factory
  trait SendTaskFailureOutput extends js.Object {}

  @js.native
  @Factory
  trait SendTaskHeartbeatInput extends js.Object {
    var taskToken: TaskToken
  }

  @js.native
  @Factory
  trait SendTaskHeartbeatOutput extends js.Object {}

  @js.native
  @Factory
  trait SendTaskSuccessInput extends js.Object {
    var output: SensitiveData
    var taskToken: TaskToken
  }

  @js.native
  @Factory
  trait SendTaskSuccessOutput extends js.Object {}

  @js.native
  @Factory
  trait StartExecutionInput extends js.Object {
    var stateMachineArn: Arn
    var input: js.UndefOr[SensitiveData]
    var name: js.UndefOr[Name]
  }

  @js.native
  @Factory
  trait StartExecutionOutput extends js.Object {
    var executionArn: Arn
    var startDate: Timestamp
  }

  /**
    * Contains details about a state entered during an execution.
    */
  @js.native
  @Factory
  trait StateEnteredEventDetails extends js.Object {
    var name: Name
    var input: js.UndefOr[SensitiveData]
  }

  /**
    * Contains details about an exit from a state during an execution.
    */
  @js.native
  @Factory
  trait StateExitedEventDetails extends js.Object {
    var name: Name
    var output: js.UndefOr[SensitiveData]
  }

  /**
    * Contains details about the state machine.
    */
  @js.native
  @Factory
  trait StateMachineListItem extends js.Object {
    var creationDate: Timestamp
    var name: Name
    var stateMachineArn: Arn
    var `type`: StateMachineType
  }

  @js.native
  sealed trait StateMachineStatus extends js.Any
  object StateMachineStatus extends js.Object {
    val ACTIVE   = "ACTIVE".asInstanceOf[StateMachineStatus]
    val DELETING = "DELETING".asInstanceOf[StateMachineStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, DELETING))
  }

  @js.native
  sealed trait StateMachineType extends js.Any
  object StateMachineType extends js.Object {
    val STANDARD = "STANDARD".asInstanceOf[StateMachineType]
    val EXPRESS  = "EXPRESS".asInstanceOf[StateMachineType]

    val values = js.Object.freeze(js.Array(STANDARD, EXPRESS))
  }

  @js.native
  @Factory
  trait StopExecutionInput extends js.Object {
    var executionArn: Arn
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  @js.native
  @Factory
  trait StopExecutionOutput extends js.Object {
    var stopDate: Timestamp
  }

  /**
    * Tags are key-value pairs that can be associated with Step Functions state machines and activities.
    *  An array of key-value pairs. For more information, see [[https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html|Using Cost Allocation Tags]] in the <i>AWS Billing and Cost Management User Guide</i>, and [[https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html|Controlling Access Using IAM Tags]].
    *  Tags may only contain Unicode letters, digits, white space, or these symbols: <code>_ . : / = + - @</code>.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var key: js.UndefOr[TagKey]
    var value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait TagResourceInput extends js.Object {
    var resourceArn: Arn
    var tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceOutput extends js.Object {}

  /**
    * Contains details about a task failure event.
    */
  @js.native
  @Factory
  trait TaskFailedEventDetails extends js.Object {
    var resource: Name
    var resourceType: Name
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  /**
    * Contains details about a task scheduled during an execution.
    */
  @js.native
  @Factory
  trait TaskScheduledEventDetails extends js.Object {
    var parameters: ConnectorParameters
    var region: Name
    var resource: Name
    var resourceType: Name
    var timeoutInSeconds: js.UndefOr[TimeoutInSeconds]
  }

  /**
    * Contains details about a task that failed to start during an execution.
    */
  @js.native
  @Factory
  trait TaskStartFailedEventDetails extends js.Object {
    var resource: Name
    var resourceType: Name
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  /**
    * Contains details about the start of a task during an execution.
    */
  @js.native
  @Factory
  trait TaskStartedEventDetails extends js.Object {
    var resource: Name
    var resourceType: Name
  }

  /**
    * Contains details about a task that failed to submit during an execution.
    */
  @js.native
  @Factory
  trait TaskSubmitFailedEventDetails extends js.Object {
    var resource: Name
    var resourceType: Name
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  /**
    * Contains details about a task submitted to a resource .
    */
  @js.native
  @Factory
  trait TaskSubmittedEventDetails extends js.Object {
    var resource: Name
    var resourceType: Name
    var output: js.UndefOr[SensitiveData]
  }

  /**
    * Contains details about the successful completion of a task state.
    */
  @js.native
  @Factory
  trait TaskSucceededEventDetails extends js.Object {
    var resource: Name
    var resourceType: Name
    var output: js.UndefOr[SensitiveData]
  }

  /**
    * Contains details about a resource timeout that occurred during an execution.
    */
  @js.native
  @Factory
  trait TaskTimedOutEventDetails extends js.Object {
    var resource: Name
    var resourceType: Name
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  @js.native
  @Factory
  trait UntagResourceInput extends js.Object {
    var resourceArn: Arn
    var tagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceOutput extends js.Object {}

  @js.native
  @Factory
  trait UpdateStateMachineInput extends js.Object {
    var stateMachineArn: Arn
    var definition: js.UndefOr[Definition]
    var loggingConfiguration: js.UndefOr[LoggingConfiguration]
    var roleArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait UpdateStateMachineOutput extends js.Object {
    var updateDate: Timestamp
  }
}
