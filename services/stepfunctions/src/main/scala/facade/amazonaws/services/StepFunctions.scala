package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object stepfunctions {
  type ActivityList = js.Array[ActivityListItem]
  type Arn = String
  type ConnectorParameters = String
  type Definition = String
  type EventId = Double
  type ExecutionList = js.Array[ExecutionListItem]
  type HistoryEventList = js.Array[HistoryEvent]
  type Identity = String
  type IncludeExecutionData = Boolean
  type ListExecutionsPageToken = String
  type LogDestinationList = js.Array[LogDestination]
  type Name = String
  type PageSize = Int
  type PageToken = String
  type ReverseOrder = Boolean
  type SensitiveCause = String
  type SensitiveData = String
  type SensitiveDataJobInput = String
  type SensitiveError = String
  type StateMachineList = js.Array[StateMachineListItem]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TaskToken = String
  type TimeoutInSeconds = Double
  type Timestamp = js.Date
  type UnsignedInteger = Int

  implicit final class StepFunctionsOps(private val service: StepFunctions) extends AnyVal {

    @inline def createActivityFuture(params: CreateActivityInput): Future[CreateActivityOutput] = service.createActivity(params).promise().toFuture
    @inline def createStateMachineFuture(params: CreateStateMachineInput): Future[CreateStateMachineOutput] = service.createStateMachine(params).promise().toFuture
    @inline def deleteActivityFuture(params: DeleteActivityInput): Future[DeleteActivityOutput] = service.deleteActivity(params).promise().toFuture
    @inline def deleteStateMachineFuture(params: DeleteStateMachineInput): Future[DeleteStateMachineOutput] = service.deleteStateMachine(params).promise().toFuture
    @inline def describeActivityFuture(params: DescribeActivityInput): Future[DescribeActivityOutput] = service.describeActivity(params).promise().toFuture
    @inline def describeExecutionFuture(params: DescribeExecutionInput): Future[DescribeExecutionOutput] = service.describeExecution(params).promise().toFuture
    @inline def describeStateMachineForExecutionFuture(params: DescribeStateMachineForExecutionInput): Future[DescribeStateMachineForExecutionOutput] = service.describeStateMachineForExecution(params).promise().toFuture
    @inline def describeStateMachineFuture(params: DescribeStateMachineInput): Future[DescribeStateMachineOutput] = service.describeStateMachine(params).promise().toFuture
    @inline def getActivityTaskFuture(params: GetActivityTaskInput): Future[GetActivityTaskOutput] = service.getActivityTask(params).promise().toFuture
    @inline def getExecutionHistoryFuture(params: GetExecutionHistoryInput): Future[GetExecutionHistoryOutput] = service.getExecutionHistory(params).promise().toFuture
    @inline def listActivitiesFuture(params: ListActivitiesInput): Future[ListActivitiesOutput] = service.listActivities(params).promise().toFuture
    @inline def listExecutionsFuture(params: ListExecutionsInput): Future[ListExecutionsOutput] = service.listExecutions(params).promise().toFuture
    @inline def listStateMachinesFuture(params: ListStateMachinesInput): Future[ListStateMachinesOutput] = service.listStateMachines(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] = service.listTagsForResource(params).promise().toFuture
    @inline def sendTaskFailureFuture(params: SendTaskFailureInput): Future[SendTaskFailureOutput] = service.sendTaskFailure(params).promise().toFuture
    @inline def sendTaskHeartbeatFuture(params: SendTaskHeartbeatInput): Future[SendTaskHeartbeatOutput] = service.sendTaskHeartbeat(params).promise().toFuture
    @inline def sendTaskSuccessFuture(params: SendTaskSuccessInput): Future[SendTaskSuccessOutput] = service.sendTaskSuccess(params).promise().toFuture
    @inline def startExecutionFuture(params: StartExecutionInput): Future[StartExecutionOutput] = service.startExecution(params).promise().toFuture
    @inline def stopExecutionFuture(params: StopExecutionInput): Future[StopExecutionOutput] = service.stopExecution(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] = service.untagResource(params).promise().toFuture
    @inline def updateStateMachineFuture(params: UpdateStateMachineInput): Future[UpdateStateMachineOutput] = service.updateStateMachine(params).promise().toFuture
  }
}

package stepfunctions {
  @js.native
  @JSImport("aws-sdk", "StepFunctions", "AWS.StepFunctions")
  class StepFunctions() extends js.Object {
    def this(config: AWSConfig) = this()

    def createActivity(params: CreateActivityInput): Request[CreateActivityOutput] = js.native
    def createStateMachine(params: CreateStateMachineInput): Request[CreateStateMachineOutput] = js.native
    def deleteActivity(params: DeleteActivityInput): Request[DeleteActivityOutput] = js.native
    def deleteStateMachine(params: DeleteStateMachineInput): Request[DeleteStateMachineOutput] = js.native
    def describeActivity(params: DescribeActivityInput): Request[DescribeActivityOutput] = js.native
    def describeExecution(params: DescribeExecutionInput): Request[DescribeExecutionOutput] = js.native
    def describeStateMachine(params: DescribeStateMachineInput): Request[DescribeStateMachineOutput] = js.native
    def describeStateMachineForExecution(params: DescribeStateMachineForExecutionInput): Request[DescribeStateMachineForExecutionOutput] = js.native
    def getActivityTask(params: GetActivityTaskInput): Request[GetActivityTaskOutput] = js.native
    def getExecutionHistory(params: GetExecutionHistoryInput): Request[GetExecutionHistoryOutput] = js.native
    def listActivities(params: ListActivitiesInput): Request[ListActivitiesOutput] = js.native
    def listExecutions(params: ListExecutionsInput): Request[ListExecutionsOutput] = js.native
    def listStateMachines(params: ListStateMachinesInput): Request[ListStateMachinesOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def sendTaskFailure(params: SendTaskFailureInput): Request[SendTaskFailureOutput] = js.native
    def sendTaskHeartbeat(params: SendTaskHeartbeatInput): Request[SendTaskHeartbeatOutput] = js.native
    def sendTaskSuccess(params: SendTaskSuccessInput): Request[SendTaskSuccessOutput] = js.native
    def startExecution(params: StartExecutionInput): Request[StartExecutionOutput] = js.native
    def stopExecution(params: StopExecutionInput): Request[StopExecutionOutput] = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput] = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput] = js.native
    def updateStateMachine(params: UpdateStateMachineInput): Request[UpdateStateMachineOutput] = js.native
  }

  /**
    * Contains details about an activity that failed during an execution.
    */
  @js.native
  trait ActivityFailedEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  object ActivityFailedEventDetails {
    @inline
    def apply(
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): ActivityFailedEventDetails = {
      val __obj = js.Dynamic.literal()
      cause.foreach(__v => __obj.updateDynamic("cause")(__v.asInstanceOf[js.Any]))
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivityFailedEventDetails]
    }
  }

  /**
    * Contains details about an activity.
    */
  @js.native
  trait ActivityListItem extends js.Object {
    var activityArn: Arn
    var creationDate: Timestamp
    var name: Name
  }

  object ActivityListItem {
    @inline
    def apply(
        activityArn: Arn,
        creationDate: Timestamp,
        name: Name
    ): ActivityListItem = {
      val __obj = js.Dynamic.literal(
        "activityArn" -> activityArn.asInstanceOf[js.Any],
        "creationDate" -> creationDate.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ActivityListItem]
    }
  }

  /**
    * Contains details about an activity schedule failure that occurred during an execution.
    */
  @js.native
  trait ActivityScheduleFailedEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  object ActivityScheduleFailedEventDetails {
    @inline
    def apply(
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): ActivityScheduleFailedEventDetails = {
      val __obj = js.Dynamic.literal()
      cause.foreach(__v => __obj.updateDynamic("cause")(__v.asInstanceOf[js.Any]))
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivityScheduleFailedEventDetails]
    }
  }

  /**
    * Contains details about an activity scheduled during an execution.
    */
  @js.native
  trait ActivityScheduledEventDetails extends js.Object {
    var resource: Arn
    var heartbeatInSeconds: js.UndefOr[TimeoutInSeconds]
    var input: js.UndefOr[SensitiveData]
    var timeoutInSeconds: js.UndefOr[TimeoutInSeconds]
  }

  object ActivityScheduledEventDetails {
    @inline
    def apply(
        resource: Arn,
        heartbeatInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined,
        input: js.UndefOr[SensitiveData] = js.undefined,
        timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
    ): ActivityScheduledEventDetails = {
      val __obj = js.Dynamic.literal(
        "resource" -> resource.asInstanceOf[js.Any]
      )

      heartbeatInSeconds.foreach(__v => __obj.updateDynamic("heartbeatInSeconds")(__v.asInstanceOf[js.Any]))
      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      timeoutInSeconds.foreach(__v => __obj.updateDynamic("timeoutInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivityScheduledEventDetails]
    }
  }

  /**
    * Contains details about the start of an activity during an execution.
    */
  @js.native
  trait ActivityStartedEventDetails extends js.Object {
    var workerName: js.UndefOr[Identity]
  }

  object ActivityStartedEventDetails {
    @inline
    def apply(
        workerName: js.UndefOr[Identity] = js.undefined
    ): ActivityStartedEventDetails = {
      val __obj = js.Dynamic.literal()
      workerName.foreach(__v => __obj.updateDynamic("workerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivityStartedEventDetails]
    }
  }

  /**
    * Contains details about an activity that successfully terminated during an execution.
    */
  @js.native
  trait ActivitySucceededEventDetails extends js.Object {
    var output: js.UndefOr[SensitiveData]
  }

  object ActivitySucceededEventDetails {
    @inline
    def apply(
        output: js.UndefOr[SensitiveData] = js.undefined
    ): ActivitySucceededEventDetails = {
      val __obj = js.Dynamic.literal()
      output.foreach(__v => __obj.updateDynamic("output")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivitySucceededEventDetails]
    }
  }

  /**
    * Contains details about an activity timeout that occurred during an execution.
    */
  @js.native
  trait ActivityTimedOutEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  object ActivityTimedOutEventDetails {
    @inline
    def apply(
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): ActivityTimedOutEventDetails = {
      val __obj = js.Dynamic.literal()
      cause.foreach(__v => __obj.updateDynamic("cause")(__v.asInstanceOf[js.Any]))
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivityTimedOutEventDetails]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait CloudWatchLogsLogGroup extends js.Object {
    var logGroupArn: js.UndefOr[Arn]
  }

  object CloudWatchLogsLogGroup {
    @inline
    def apply(
        logGroupArn: js.UndefOr[Arn] = js.undefined
    ): CloudWatchLogsLogGroup = {
      val __obj = js.Dynamic.literal()
      logGroupArn.foreach(__v => __obj.updateDynamic("logGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchLogsLogGroup]
    }
  }

  @js.native
  trait CreateActivityInput extends js.Object {
    var name: Name
    var tags: js.UndefOr[TagList]
  }

  object CreateActivityInput {
    @inline
    def apply(
        name: Name,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateActivityInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateActivityInput]
    }
  }

  @js.native
  trait CreateActivityOutput extends js.Object {
    var activityArn: Arn
    var creationDate: Timestamp
  }

  object CreateActivityOutput {
    @inline
    def apply(
        activityArn: Arn,
        creationDate: Timestamp
    ): CreateActivityOutput = {
      val __obj = js.Dynamic.literal(
        "activityArn" -> activityArn.asInstanceOf[js.Any],
        "creationDate" -> creationDate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateActivityOutput]
    }
  }

  @js.native
  trait CreateStateMachineInput extends js.Object {
    var definition: Definition
    var name: Name
    var roleArn: Arn
    var loggingConfiguration: js.UndefOr[LoggingConfiguration]
    var tags: js.UndefOr[TagList]
    var `type`: js.UndefOr[StateMachineType]
  }

  object CreateStateMachineInput {
    @inline
    def apply(
        definition: Definition,
        name: Name,
        roleArn: Arn,
        loggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        `type`: js.UndefOr[StateMachineType] = js.undefined
    ): CreateStateMachineInput = {
      val __obj = js.Dynamic.literal(
        "definition" -> definition.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      loggingConfiguration.foreach(__v => __obj.updateDynamic("loggingConfiguration")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStateMachineInput]
    }
  }

  @js.native
  trait CreateStateMachineOutput extends js.Object {
    var creationDate: Timestamp
    var stateMachineArn: Arn
  }

  object CreateStateMachineOutput {
    @inline
    def apply(
        creationDate: Timestamp,
        stateMachineArn: Arn
    ): CreateStateMachineOutput = {
      val __obj = js.Dynamic.literal(
        "creationDate" -> creationDate.asInstanceOf[js.Any],
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateStateMachineOutput]
    }
  }

  @js.native
  trait DeleteActivityInput extends js.Object {
    var activityArn: Arn
  }

  object DeleteActivityInput {
    @inline
    def apply(
        activityArn: Arn
    ): DeleteActivityInput = {
      val __obj = js.Dynamic.literal(
        "activityArn" -> activityArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteActivityInput]
    }
  }

  @js.native
  trait DeleteActivityOutput extends js.Object {}

  object DeleteActivityOutput {
    @inline
    def apply(
    ): DeleteActivityOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteActivityOutput]
    }
  }

  @js.native
  trait DeleteStateMachineInput extends js.Object {
    var stateMachineArn: Arn
  }

  object DeleteStateMachineInput {
    @inline
    def apply(
        stateMachineArn: Arn
    ): DeleteStateMachineInput = {
      val __obj = js.Dynamic.literal(
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteStateMachineInput]
    }
  }

  @js.native
  trait DeleteStateMachineOutput extends js.Object {}

  object DeleteStateMachineOutput {
    @inline
    def apply(
    ): DeleteStateMachineOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteStateMachineOutput]
    }
  }

  @js.native
  trait DescribeActivityInput extends js.Object {
    var activityArn: Arn
  }

  object DescribeActivityInput {
    @inline
    def apply(
        activityArn: Arn
    ): DescribeActivityInput = {
      val __obj = js.Dynamic.literal(
        "activityArn" -> activityArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeActivityInput]
    }
  }

  @js.native
  trait DescribeActivityOutput extends js.Object {
    var activityArn: Arn
    var creationDate: Timestamp
    var name: Name
  }

  object DescribeActivityOutput {
    @inline
    def apply(
        activityArn: Arn,
        creationDate: Timestamp,
        name: Name
    ): DescribeActivityOutput = {
      val __obj = js.Dynamic.literal(
        "activityArn" -> activityArn.asInstanceOf[js.Any],
        "creationDate" -> creationDate.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeActivityOutput]
    }
  }

  @js.native
  trait DescribeExecutionInput extends js.Object {
    var executionArn: Arn
  }

  object DescribeExecutionInput {
    @inline
    def apply(
        executionArn: Arn
    ): DescribeExecutionInput = {
      val __obj = js.Dynamic.literal(
        "executionArn" -> executionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeExecutionInput]
    }
  }

  @js.native
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

  object DescribeExecutionOutput {
    @inline
    def apply(
        executionArn: Arn,
        input: SensitiveData,
        startDate: Timestamp,
        stateMachineArn: Arn,
        status: ExecutionStatus,
        name: js.UndefOr[Name] = js.undefined,
        output: js.UndefOr[SensitiveData] = js.undefined,
        stopDate: js.UndefOr[Timestamp] = js.undefined
    ): DescribeExecutionOutput = {
      val __obj = js.Dynamic.literal(
        "executionArn" -> executionArn.asInstanceOf[js.Any],
        "input" -> input.asInstanceOf[js.Any],
        "startDate" -> startDate.asInstanceOf[js.Any],
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      output.foreach(__v => __obj.updateDynamic("output")(__v.asInstanceOf[js.Any]))
      stopDate.foreach(__v => __obj.updateDynamic("stopDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeExecutionOutput]
    }
  }

  @js.native
  trait DescribeStateMachineForExecutionInput extends js.Object {
    var executionArn: Arn
  }

  object DescribeStateMachineForExecutionInput {
    @inline
    def apply(
        executionArn: Arn
    ): DescribeStateMachineForExecutionInput = {
      val __obj = js.Dynamic.literal(
        "executionArn" -> executionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeStateMachineForExecutionInput]
    }
  }

  @js.native
  trait DescribeStateMachineForExecutionOutput extends js.Object {
    var definition: Definition
    var name: Name
    var roleArn: Arn
    var stateMachineArn: Arn
    var updateDate: Timestamp
    var loggingConfiguration: js.UndefOr[LoggingConfiguration]
  }

  object DescribeStateMachineForExecutionOutput {
    @inline
    def apply(
        definition: Definition,
        name: Name,
        roleArn: Arn,
        stateMachineArn: Arn,
        updateDate: Timestamp,
        loggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined
    ): DescribeStateMachineForExecutionOutput = {
      val __obj = js.Dynamic.literal(
        "definition" -> definition.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any],
        "updateDate" -> updateDate.asInstanceOf[js.Any]
      )

      loggingConfiguration.foreach(__v => __obj.updateDynamic("loggingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStateMachineForExecutionOutput]
    }
  }

  @js.native
  trait DescribeStateMachineInput extends js.Object {
    var stateMachineArn: Arn
  }

  object DescribeStateMachineInput {
    @inline
    def apply(
        stateMachineArn: Arn
    ): DescribeStateMachineInput = {
      val __obj = js.Dynamic.literal(
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeStateMachineInput]
    }
  }

  @js.native
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

  object DescribeStateMachineOutput {
    @inline
    def apply(
        creationDate: Timestamp,
        definition: Definition,
        name: Name,
        roleArn: Arn,
        stateMachineArn: Arn,
        `type`: StateMachineType,
        loggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined,
        status: js.UndefOr[StateMachineStatus] = js.undefined
    ): DescribeStateMachineOutput = {
      val __obj = js.Dynamic.literal(
        "creationDate" -> creationDate.asInstanceOf[js.Any],
        "definition" -> definition.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      loggingConfiguration.foreach(__v => __obj.updateDynamic("loggingConfiguration")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStateMachineOutput]
    }
  }

  /**
    * Contains details about an abort of an execution.
    */
  @js.native
  trait ExecutionAbortedEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  object ExecutionAbortedEventDetails {
    @inline
    def apply(
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): ExecutionAbortedEventDetails = {
      val __obj = js.Dynamic.literal()
      cause.foreach(__v => __obj.updateDynamic("cause")(__v.asInstanceOf[js.Any]))
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionAbortedEventDetails]
    }
  }

  /**
    * Contains details about an execution failure event.
    */
  @js.native
  trait ExecutionFailedEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  object ExecutionFailedEventDetails {
    @inline
    def apply(
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): ExecutionFailedEventDetails = {
      val __obj = js.Dynamic.literal()
      cause.foreach(__v => __obj.updateDynamic("cause")(__v.asInstanceOf[js.Any]))
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionFailedEventDetails]
    }
  }

  /**
    * Contains details about an execution.
    */
  @js.native
  trait ExecutionListItem extends js.Object {
    var executionArn: Arn
    var name: Name
    var startDate: Timestamp
    var stateMachineArn: Arn
    var status: ExecutionStatus
    var stopDate: js.UndefOr[Timestamp]
  }

  object ExecutionListItem {
    @inline
    def apply(
        executionArn: Arn,
        name: Name,
        startDate: Timestamp,
        stateMachineArn: Arn,
        status: ExecutionStatus,
        stopDate: js.UndefOr[Timestamp] = js.undefined
    ): ExecutionListItem = {
      val __obj = js.Dynamic.literal(
        "executionArn" -> executionArn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "startDate" -> startDate.asInstanceOf[js.Any],
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      stopDate.foreach(__v => __obj.updateDynamic("stopDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionListItem]
    }
  }

  /**
    * Contains details about the start of the execution.
    */
  @js.native
  trait ExecutionStartedEventDetails extends js.Object {
    var input: js.UndefOr[SensitiveData]
    var roleArn: js.UndefOr[Arn]
  }

  object ExecutionStartedEventDetails {
    @inline
    def apply(
        input: js.UndefOr[SensitiveData] = js.undefined,
        roleArn: js.UndefOr[Arn] = js.undefined
    ): ExecutionStartedEventDetails = {
      val __obj = js.Dynamic.literal()
      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionStartedEventDetails]
    }
  }

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

  /**
    * Contains details about the successful termination of the execution.
    */
  @js.native
  trait ExecutionSucceededEventDetails extends js.Object {
    var output: js.UndefOr[SensitiveData]
  }

  object ExecutionSucceededEventDetails {
    @inline
    def apply(
        output: js.UndefOr[SensitiveData] = js.undefined
    ): ExecutionSucceededEventDetails = {
      val __obj = js.Dynamic.literal()
      output.foreach(__v => __obj.updateDynamic("output")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionSucceededEventDetails]
    }
  }

  /**
    * Contains details about the execution timeout that occurred during the execution.
    */
  @js.native
  trait ExecutionTimedOutEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  object ExecutionTimedOutEventDetails {
    @inline
    def apply(
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): ExecutionTimedOutEventDetails = {
      val __obj = js.Dynamic.literal()
      cause.foreach(__v => __obj.updateDynamic("cause")(__v.asInstanceOf[js.Any]))
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionTimedOutEventDetails]
    }
  }

  @js.native
  trait GetActivityTaskInput extends js.Object {
    var activityArn: Arn
    var workerName: js.UndefOr[Name]
  }

  object GetActivityTaskInput {
    @inline
    def apply(
        activityArn: Arn,
        workerName: js.UndefOr[Name] = js.undefined
    ): GetActivityTaskInput = {
      val __obj = js.Dynamic.literal(
        "activityArn" -> activityArn.asInstanceOf[js.Any]
      )

      workerName.foreach(__v => __obj.updateDynamic("workerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetActivityTaskInput]
    }
  }

  @js.native
  trait GetActivityTaskOutput extends js.Object {
    var input: js.UndefOr[SensitiveDataJobInput]
    var taskToken: js.UndefOr[TaskToken]
  }

  object GetActivityTaskOutput {
    @inline
    def apply(
        input: js.UndefOr[SensitiveDataJobInput] = js.undefined,
        taskToken: js.UndefOr[TaskToken] = js.undefined
    ): GetActivityTaskOutput = {
      val __obj = js.Dynamic.literal()
      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      taskToken.foreach(__v => __obj.updateDynamic("taskToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetActivityTaskOutput]
    }
  }

  @js.native
  trait GetExecutionHistoryInput extends js.Object {
    var executionArn: Arn
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[PageToken]
    var reverseOrder: js.UndefOr[ReverseOrder]
  }

  object GetExecutionHistoryInput {
    @inline
    def apply(
        executionArn: Arn,
        maxResults: js.UndefOr[PageSize] = js.undefined,
        nextToken: js.UndefOr[PageToken] = js.undefined,
        reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
    ): GetExecutionHistoryInput = {
      val __obj = js.Dynamic.literal(
        "executionArn" -> executionArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      reverseOrder.foreach(__v => __obj.updateDynamic("reverseOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExecutionHistoryInput]
    }
  }

  @js.native
  trait GetExecutionHistoryOutput extends js.Object {
    var events: HistoryEventList
    var nextToken: js.UndefOr[PageToken]
  }

  object GetExecutionHistoryOutput {
    @inline
    def apply(
        events: HistoryEventList,
        nextToken: js.UndefOr[PageToken] = js.undefined
    ): GetExecutionHistoryOutput = {
      val __obj = js.Dynamic.literal(
        "events" -> events.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExecutionHistoryOutput]
    }
  }

  /**
    * Contains details about the events of an execution.
    */
  @js.native
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

  object HistoryEvent {
    @inline
    def apply(
        id: EventId,
        timestamp: Timestamp,
        `type`: HistoryEventType,
        activityFailedEventDetails: js.UndefOr[ActivityFailedEventDetails] = js.undefined,
        activityScheduleFailedEventDetails: js.UndefOr[ActivityScheduleFailedEventDetails] = js.undefined,
        activityScheduledEventDetails: js.UndefOr[ActivityScheduledEventDetails] = js.undefined,
        activityStartedEventDetails: js.UndefOr[ActivityStartedEventDetails] = js.undefined,
        activitySucceededEventDetails: js.UndefOr[ActivitySucceededEventDetails] = js.undefined,
        activityTimedOutEventDetails: js.UndefOr[ActivityTimedOutEventDetails] = js.undefined,
        executionAbortedEventDetails: js.UndefOr[ExecutionAbortedEventDetails] = js.undefined,
        executionFailedEventDetails: js.UndefOr[ExecutionFailedEventDetails] = js.undefined,
        executionStartedEventDetails: js.UndefOr[ExecutionStartedEventDetails] = js.undefined,
        executionSucceededEventDetails: js.UndefOr[ExecutionSucceededEventDetails] = js.undefined,
        executionTimedOutEventDetails: js.UndefOr[ExecutionTimedOutEventDetails] = js.undefined,
        lambdaFunctionFailedEventDetails: js.UndefOr[LambdaFunctionFailedEventDetails] = js.undefined,
        lambdaFunctionScheduleFailedEventDetails: js.UndefOr[LambdaFunctionScheduleFailedEventDetails] = js.undefined,
        lambdaFunctionScheduledEventDetails: js.UndefOr[LambdaFunctionScheduledEventDetails] = js.undefined,
        lambdaFunctionStartFailedEventDetails: js.UndefOr[LambdaFunctionStartFailedEventDetails] = js.undefined,
        lambdaFunctionSucceededEventDetails: js.UndefOr[LambdaFunctionSucceededEventDetails] = js.undefined,
        lambdaFunctionTimedOutEventDetails: js.UndefOr[LambdaFunctionTimedOutEventDetails] = js.undefined,
        mapIterationAbortedEventDetails: js.UndefOr[MapIterationEventDetails] = js.undefined,
        mapIterationFailedEventDetails: js.UndefOr[MapIterationEventDetails] = js.undefined,
        mapIterationStartedEventDetails: js.UndefOr[MapIterationEventDetails] = js.undefined,
        mapIterationSucceededEventDetails: js.UndefOr[MapIterationEventDetails] = js.undefined,
        mapStateStartedEventDetails: js.UndefOr[MapStateStartedEventDetails] = js.undefined,
        previousEventId: js.UndefOr[EventId] = js.undefined,
        stateEnteredEventDetails: js.UndefOr[StateEnteredEventDetails] = js.undefined,
        stateExitedEventDetails: js.UndefOr[StateExitedEventDetails] = js.undefined,
        taskFailedEventDetails: js.UndefOr[TaskFailedEventDetails] = js.undefined,
        taskScheduledEventDetails: js.UndefOr[TaskScheduledEventDetails] = js.undefined,
        taskStartFailedEventDetails: js.UndefOr[TaskStartFailedEventDetails] = js.undefined,
        taskStartedEventDetails: js.UndefOr[TaskStartedEventDetails] = js.undefined,
        taskSubmitFailedEventDetails: js.UndefOr[TaskSubmitFailedEventDetails] = js.undefined,
        taskSubmittedEventDetails: js.UndefOr[TaskSubmittedEventDetails] = js.undefined,
        taskSucceededEventDetails: js.UndefOr[TaskSucceededEventDetails] = js.undefined,
        taskTimedOutEventDetails: js.UndefOr[TaskTimedOutEventDetails] = js.undefined
    ): HistoryEvent = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "timestamp" -> timestamp.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      activityFailedEventDetails.foreach(__v => __obj.updateDynamic("activityFailedEventDetails")(__v.asInstanceOf[js.Any]))
      activityScheduleFailedEventDetails.foreach(__v => __obj.updateDynamic("activityScheduleFailedEventDetails")(__v.asInstanceOf[js.Any]))
      activityScheduledEventDetails.foreach(__v => __obj.updateDynamic("activityScheduledEventDetails")(__v.asInstanceOf[js.Any]))
      activityStartedEventDetails.foreach(__v => __obj.updateDynamic("activityStartedEventDetails")(__v.asInstanceOf[js.Any]))
      activitySucceededEventDetails.foreach(__v => __obj.updateDynamic("activitySucceededEventDetails")(__v.asInstanceOf[js.Any]))
      activityTimedOutEventDetails.foreach(__v => __obj.updateDynamic("activityTimedOutEventDetails")(__v.asInstanceOf[js.Any]))
      executionAbortedEventDetails.foreach(__v => __obj.updateDynamic("executionAbortedEventDetails")(__v.asInstanceOf[js.Any]))
      executionFailedEventDetails.foreach(__v => __obj.updateDynamic("executionFailedEventDetails")(__v.asInstanceOf[js.Any]))
      executionStartedEventDetails.foreach(__v => __obj.updateDynamic("executionStartedEventDetails")(__v.asInstanceOf[js.Any]))
      executionSucceededEventDetails.foreach(__v => __obj.updateDynamic("executionSucceededEventDetails")(__v.asInstanceOf[js.Any]))
      executionTimedOutEventDetails.foreach(__v => __obj.updateDynamic("executionTimedOutEventDetails")(__v.asInstanceOf[js.Any]))
      lambdaFunctionFailedEventDetails.foreach(__v => __obj.updateDynamic("lambdaFunctionFailedEventDetails")(__v.asInstanceOf[js.Any]))
      lambdaFunctionScheduleFailedEventDetails.foreach(__v => __obj.updateDynamic("lambdaFunctionScheduleFailedEventDetails")(__v.asInstanceOf[js.Any]))
      lambdaFunctionScheduledEventDetails.foreach(__v => __obj.updateDynamic("lambdaFunctionScheduledEventDetails")(__v.asInstanceOf[js.Any]))
      lambdaFunctionStartFailedEventDetails.foreach(__v => __obj.updateDynamic("lambdaFunctionStartFailedEventDetails")(__v.asInstanceOf[js.Any]))
      lambdaFunctionSucceededEventDetails.foreach(__v => __obj.updateDynamic("lambdaFunctionSucceededEventDetails")(__v.asInstanceOf[js.Any]))
      lambdaFunctionTimedOutEventDetails.foreach(__v => __obj.updateDynamic("lambdaFunctionTimedOutEventDetails")(__v.asInstanceOf[js.Any]))
      mapIterationAbortedEventDetails.foreach(__v => __obj.updateDynamic("mapIterationAbortedEventDetails")(__v.asInstanceOf[js.Any]))
      mapIterationFailedEventDetails.foreach(__v => __obj.updateDynamic("mapIterationFailedEventDetails")(__v.asInstanceOf[js.Any]))
      mapIterationStartedEventDetails.foreach(__v => __obj.updateDynamic("mapIterationStartedEventDetails")(__v.asInstanceOf[js.Any]))
      mapIterationSucceededEventDetails.foreach(__v => __obj.updateDynamic("mapIterationSucceededEventDetails")(__v.asInstanceOf[js.Any]))
      mapStateStartedEventDetails.foreach(__v => __obj.updateDynamic("mapStateStartedEventDetails")(__v.asInstanceOf[js.Any]))
      previousEventId.foreach(__v => __obj.updateDynamic("previousEventId")(__v.asInstanceOf[js.Any]))
      stateEnteredEventDetails.foreach(__v => __obj.updateDynamic("stateEnteredEventDetails")(__v.asInstanceOf[js.Any]))
      stateExitedEventDetails.foreach(__v => __obj.updateDynamic("stateExitedEventDetails")(__v.asInstanceOf[js.Any]))
      taskFailedEventDetails.foreach(__v => __obj.updateDynamic("taskFailedEventDetails")(__v.asInstanceOf[js.Any]))
      taskScheduledEventDetails.foreach(__v => __obj.updateDynamic("taskScheduledEventDetails")(__v.asInstanceOf[js.Any]))
      taskStartFailedEventDetails.foreach(__v => __obj.updateDynamic("taskStartFailedEventDetails")(__v.asInstanceOf[js.Any]))
      taskStartedEventDetails.foreach(__v => __obj.updateDynamic("taskStartedEventDetails")(__v.asInstanceOf[js.Any]))
      taskSubmitFailedEventDetails.foreach(__v => __obj.updateDynamic("taskSubmitFailedEventDetails")(__v.asInstanceOf[js.Any]))
      taskSubmittedEventDetails.foreach(__v => __obj.updateDynamic("taskSubmittedEventDetails")(__v.asInstanceOf[js.Any]))
      taskSucceededEventDetails.foreach(__v => __obj.updateDynamic("taskSucceededEventDetails")(__v.asInstanceOf[js.Any]))
      taskTimedOutEventDetails.foreach(__v => __obj.updateDynamic("taskTimedOutEventDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HistoryEvent]
    }
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

    @inline def values =
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
  }

  /**
    * Contains details about a lambda function that failed during an execution.
    */
  @js.native
  trait LambdaFunctionFailedEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  object LambdaFunctionFailedEventDetails {
    @inline
    def apply(
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): LambdaFunctionFailedEventDetails = {
      val __obj = js.Dynamic.literal()
      cause.foreach(__v => __obj.updateDynamic("cause")(__v.asInstanceOf[js.Any]))
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionFailedEventDetails]
    }
  }

  /**
    * Contains details about a failed lambda function schedule event that occurred during an execution.
    */
  @js.native
  trait LambdaFunctionScheduleFailedEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  object LambdaFunctionScheduleFailedEventDetails {
    @inline
    def apply(
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): LambdaFunctionScheduleFailedEventDetails = {
      val __obj = js.Dynamic.literal()
      cause.foreach(__v => __obj.updateDynamic("cause")(__v.asInstanceOf[js.Any]))
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionScheduleFailedEventDetails]
    }
  }

  /**
    * Contains details about a lambda function scheduled during an execution.
    */
  @js.native
  trait LambdaFunctionScheduledEventDetails extends js.Object {
    var resource: Arn
    var input: js.UndefOr[SensitiveData]
    var timeoutInSeconds: js.UndefOr[TimeoutInSeconds]
  }

  object LambdaFunctionScheduledEventDetails {
    @inline
    def apply(
        resource: Arn,
        input: js.UndefOr[SensitiveData] = js.undefined,
        timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
    ): LambdaFunctionScheduledEventDetails = {
      val __obj = js.Dynamic.literal(
        "resource" -> resource.asInstanceOf[js.Any]
      )

      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      timeoutInSeconds.foreach(__v => __obj.updateDynamic("timeoutInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionScheduledEventDetails]
    }
  }

  /**
    * Contains details about a lambda function that failed to start during an execution.
    */
  @js.native
  trait LambdaFunctionStartFailedEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  object LambdaFunctionStartFailedEventDetails {
    @inline
    def apply(
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): LambdaFunctionStartFailedEventDetails = {
      val __obj = js.Dynamic.literal()
      cause.foreach(__v => __obj.updateDynamic("cause")(__v.asInstanceOf[js.Any]))
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionStartFailedEventDetails]
    }
  }

  /**
    * Contains details about a lambda function that successfully terminated during an execution.
    */
  @js.native
  trait LambdaFunctionSucceededEventDetails extends js.Object {
    var output: js.UndefOr[SensitiveData]
  }

  object LambdaFunctionSucceededEventDetails {
    @inline
    def apply(
        output: js.UndefOr[SensitiveData] = js.undefined
    ): LambdaFunctionSucceededEventDetails = {
      val __obj = js.Dynamic.literal()
      output.foreach(__v => __obj.updateDynamic("output")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionSucceededEventDetails]
    }
  }

  /**
    * Contains details about a lambda function timeout that occurred during an execution.
    */
  @js.native
  trait LambdaFunctionTimedOutEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  object LambdaFunctionTimedOutEventDetails {
    @inline
    def apply(
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): LambdaFunctionTimedOutEventDetails = {
      val __obj = js.Dynamic.literal()
      cause.foreach(__v => __obj.updateDynamic("cause")(__v.asInstanceOf[js.Any]))
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionTimedOutEventDetails]
    }
  }

  @js.native
  trait ListActivitiesInput extends js.Object {
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[PageToken]
  }

  object ListActivitiesInput {
    @inline
    def apply(
        maxResults: js.UndefOr[PageSize] = js.undefined,
        nextToken: js.UndefOr[PageToken] = js.undefined
    ): ListActivitiesInput = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListActivitiesInput]
    }
  }

  @js.native
  trait ListActivitiesOutput extends js.Object {
    var activities: ActivityList
    var nextToken: js.UndefOr[PageToken]
  }

  object ListActivitiesOutput {
    @inline
    def apply(
        activities: ActivityList,
        nextToken: js.UndefOr[PageToken] = js.undefined
    ): ListActivitiesOutput = {
      val __obj = js.Dynamic.literal(
        "activities" -> activities.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListActivitiesOutput]
    }
  }

  @js.native
  trait ListExecutionsInput extends js.Object {
    var stateMachineArn: Arn
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[ListExecutionsPageToken]
    var statusFilter: js.UndefOr[ExecutionStatus]
  }

  object ListExecutionsInput {
    @inline
    def apply(
        stateMachineArn: Arn,
        maxResults: js.UndefOr[PageSize] = js.undefined,
        nextToken: js.UndefOr[ListExecutionsPageToken] = js.undefined,
        statusFilter: js.UndefOr[ExecutionStatus] = js.undefined
    ): ListExecutionsInput = {
      val __obj = js.Dynamic.literal(
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      statusFilter.foreach(__v => __obj.updateDynamic("statusFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExecutionsInput]
    }
  }

  @js.native
  trait ListExecutionsOutput extends js.Object {
    var executions: ExecutionList
    var nextToken: js.UndefOr[ListExecutionsPageToken]
  }

  object ListExecutionsOutput {
    @inline
    def apply(
        executions: ExecutionList,
        nextToken: js.UndefOr[ListExecutionsPageToken] = js.undefined
    ): ListExecutionsOutput = {
      val __obj = js.Dynamic.literal(
        "executions" -> executions.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExecutionsOutput]
    }
  }

  @js.native
  trait ListStateMachinesInput extends js.Object {
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[PageToken]
  }

  object ListStateMachinesInput {
    @inline
    def apply(
        maxResults: js.UndefOr[PageSize] = js.undefined,
        nextToken: js.UndefOr[PageToken] = js.undefined
    ): ListStateMachinesInput = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStateMachinesInput]
    }
  }

  @js.native
  trait ListStateMachinesOutput extends js.Object {
    var stateMachines: StateMachineList
    var nextToken: js.UndefOr[PageToken]
  }

  object ListStateMachinesOutput {
    @inline
    def apply(
        stateMachines: StateMachineList,
        nextToken: js.UndefOr[PageToken] = js.undefined
    ): ListStateMachinesOutput = {
      val __obj = js.Dynamic.literal(
        "stateMachines" -> stateMachines.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStateMachinesOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var resourceArn: Arn
  }

  object ListTagsForResourceInput {
    @inline
    def apply(
        resourceArn: Arn
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceOutput {
    @inline
    def apply(
        tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait LogDestination extends js.Object {
    var cloudWatchLogsLogGroup: js.UndefOr[CloudWatchLogsLogGroup]
  }

  object LogDestination {
    @inline
    def apply(
        cloudWatchLogsLogGroup: js.UndefOr[CloudWatchLogsLogGroup] = js.undefined
    ): LogDestination = {
      val __obj = js.Dynamic.literal()
      cloudWatchLogsLogGroup.foreach(__v => __obj.updateDynamic("cloudWatchLogsLogGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogDestination]
    }
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

  /**
    * The <code>LoggingConfiguration</code> data type is used to set CloudWatch Logs options.
    */
  @js.native
  trait LoggingConfiguration extends js.Object {
    var destinations: js.UndefOr[LogDestinationList]
    var includeExecutionData: js.UndefOr[IncludeExecutionData]
    var level: js.UndefOr[LogLevel]
  }

  object LoggingConfiguration {
    @inline
    def apply(
        destinations: js.UndefOr[LogDestinationList] = js.undefined,
        includeExecutionData: js.UndefOr[IncludeExecutionData] = js.undefined,
        level: js.UndefOr[LogLevel] = js.undefined
    ): LoggingConfiguration = {
      val __obj = js.Dynamic.literal()
      destinations.foreach(__v => __obj.updateDynamic("destinations")(__v.asInstanceOf[js.Any]))
      includeExecutionData.foreach(__v => __obj.updateDynamic("includeExecutionData")(__v.asInstanceOf[js.Any]))
      level.foreach(__v => __obj.updateDynamic("level")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoggingConfiguration]
    }
  }

  /**
    * Contains details about an iteration of a Map state.
    */
  @js.native
  trait MapIterationEventDetails extends js.Object {
    var index: js.UndefOr[UnsignedInteger]
    var name: js.UndefOr[Name]
  }

  object MapIterationEventDetails {
    @inline
    def apply(
        index: js.UndefOr[UnsignedInteger] = js.undefined,
        name: js.UndefOr[Name] = js.undefined
    ): MapIterationEventDetails = {
      val __obj = js.Dynamic.literal()
      index.foreach(__v => __obj.updateDynamic("index")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MapIterationEventDetails]
    }
  }

  /**
    * Details about a Map state that was started.
    */
  @js.native
  trait MapStateStartedEventDetails extends js.Object {
    var length: js.UndefOr[UnsignedInteger]
  }

  object MapStateStartedEventDetails {
    @inline
    def apply(
        length: js.UndefOr[UnsignedInteger] = js.undefined
    ): MapStateStartedEventDetails = {
      val __obj = js.Dynamic.literal()
      length.foreach(__v => __obj.updateDynamic("length")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MapStateStartedEventDetails]
    }
  }

  @js.native
  trait SendTaskFailureInput extends js.Object {
    var taskToken: TaskToken
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  object SendTaskFailureInput {
    @inline
    def apply(
        taskToken: TaskToken,
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): SendTaskFailureInput = {
      val __obj = js.Dynamic.literal(
        "taskToken" -> taskToken.asInstanceOf[js.Any]
      )

      cause.foreach(__v => __obj.updateDynamic("cause")(__v.asInstanceOf[js.Any]))
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendTaskFailureInput]
    }
  }

  @js.native
  trait SendTaskFailureOutput extends js.Object {}

  object SendTaskFailureOutput {
    @inline
    def apply(
    ): SendTaskFailureOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[SendTaskFailureOutput]
    }
  }

  @js.native
  trait SendTaskHeartbeatInput extends js.Object {
    var taskToken: TaskToken
  }

  object SendTaskHeartbeatInput {
    @inline
    def apply(
        taskToken: TaskToken
    ): SendTaskHeartbeatInput = {
      val __obj = js.Dynamic.literal(
        "taskToken" -> taskToken.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SendTaskHeartbeatInput]
    }
  }

  @js.native
  trait SendTaskHeartbeatOutput extends js.Object {}

  object SendTaskHeartbeatOutput {
    @inline
    def apply(
    ): SendTaskHeartbeatOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[SendTaskHeartbeatOutput]
    }
  }

  @js.native
  trait SendTaskSuccessInput extends js.Object {
    var output: SensitiveData
    var taskToken: TaskToken
  }

  object SendTaskSuccessInput {
    @inline
    def apply(
        output: SensitiveData,
        taskToken: TaskToken
    ): SendTaskSuccessInput = {
      val __obj = js.Dynamic.literal(
        "output" -> output.asInstanceOf[js.Any],
        "taskToken" -> taskToken.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SendTaskSuccessInput]
    }
  }

  @js.native
  trait SendTaskSuccessOutput extends js.Object {}

  object SendTaskSuccessOutput {
    @inline
    def apply(
    ): SendTaskSuccessOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[SendTaskSuccessOutput]
    }
  }

  @js.native
  trait StartExecutionInput extends js.Object {
    var stateMachineArn: Arn
    var input: js.UndefOr[SensitiveData]
    var name: js.UndefOr[Name]
  }

  object StartExecutionInput {
    @inline
    def apply(
        stateMachineArn: Arn,
        input: js.UndefOr[SensitiveData] = js.undefined,
        name: js.UndefOr[Name] = js.undefined
    ): StartExecutionInput = {
      val __obj = js.Dynamic.literal(
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any]
      )

      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartExecutionInput]
    }
  }

  @js.native
  trait StartExecutionOutput extends js.Object {
    var executionArn: Arn
    var startDate: Timestamp
  }

  object StartExecutionOutput {
    @inline
    def apply(
        executionArn: Arn,
        startDate: Timestamp
    ): StartExecutionOutput = {
      val __obj = js.Dynamic.literal(
        "executionArn" -> executionArn.asInstanceOf[js.Any],
        "startDate" -> startDate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartExecutionOutput]
    }
  }

  /**
    * Contains details about a state entered during an execution.
    */
  @js.native
  trait StateEnteredEventDetails extends js.Object {
    var name: Name
    var input: js.UndefOr[SensitiveData]
  }

  object StateEnteredEventDetails {
    @inline
    def apply(
        name: Name,
        input: js.UndefOr[SensitiveData] = js.undefined
    ): StateEnteredEventDetails = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StateEnteredEventDetails]
    }
  }

  /**
    * Contains details about an exit from a state during an execution.
    */
  @js.native
  trait StateExitedEventDetails extends js.Object {
    var name: Name
    var output: js.UndefOr[SensitiveData]
  }

  object StateExitedEventDetails {
    @inline
    def apply(
        name: Name,
        output: js.UndefOr[SensitiveData] = js.undefined
    ): StateExitedEventDetails = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      output.foreach(__v => __obj.updateDynamic("output")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StateExitedEventDetails]
    }
  }

  /**
    * Contains details about the state machine.
    */
  @js.native
  trait StateMachineListItem extends js.Object {
    var creationDate: Timestamp
    var name: Name
    var stateMachineArn: Arn
    var `type`: StateMachineType
  }

  object StateMachineListItem {
    @inline
    def apply(
        creationDate: Timestamp,
        name: Name,
        stateMachineArn: Arn,
        `type`: StateMachineType
    ): StateMachineListItem = {
      val __obj = js.Dynamic.literal(
        "creationDate" -> creationDate.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StateMachineListItem]
    }
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
  trait StopExecutionInput extends js.Object {
    var executionArn: Arn
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  object StopExecutionInput {
    @inline
    def apply(
        executionArn: Arn,
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): StopExecutionInput = {
      val __obj = js.Dynamic.literal(
        "executionArn" -> executionArn.asInstanceOf[js.Any]
      )

      cause.foreach(__v => __obj.updateDynamic("cause")(__v.asInstanceOf[js.Any]))
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopExecutionInput]
    }
  }

  @js.native
  trait StopExecutionOutput extends js.Object {
    var stopDate: Timestamp
  }

  object StopExecutionOutput {
    @inline
    def apply(
        stopDate: Timestamp
    ): StopExecutionOutput = {
      val __obj = js.Dynamic.literal(
        "stopDate" -> stopDate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopExecutionOutput]
    }
  }

  /**
    * Tags are key-value pairs that can be associated with Step Functions state machines and activities.
    *  An array of key-value pairs. For more information, see [[https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html|Using Cost Allocation Tags]] in the <i>AWS Billing and Cost Management User Guide</i>, and [[https://docs.aws.amazon.com/IAM/latest/UserGuide/access_iam-tags.html|Controlling Access Using IAM Tags]].
    *  Tags may only contain Unicode letters, digits, white space, or these symbols: <code>_ . : / = + - @</code>.
    */
  @js.native
  trait Tag extends js.Object {
    var key: js.UndefOr[TagKey]
    var value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        key: js.UndefOr[TagKey] = js.undefined,
        value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var resourceArn: Arn
    var tags: TagList
  }

  object TagResourceInput {
    @inline
    def apply(
        resourceArn: Arn,
        tags: TagList
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceOutput extends js.Object {}

  object TagResourceOutput {
    @inline
    def apply(
    ): TagResourceOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceOutput]
    }
  }

  /**
    * Contains details about a task failure event.
    */
  @js.native
  trait TaskFailedEventDetails extends js.Object {
    var resource: Name
    var resourceType: Name
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  object TaskFailedEventDetails {
    @inline
    def apply(
        resource: Name,
        resourceType: Name,
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): TaskFailedEventDetails = {
      val __obj = js.Dynamic.literal(
        "resource" -> resource.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )

      cause.foreach(__v => __obj.updateDynamic("cause")(__v.asInstanceOf[js.Any]))
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskFailedEventDetails]
    }
  }

  /**
    * Contains details about a task scheduled during an execution.
    */
  @js.native
  trait TaskScheduledEventDetails extends js.Object {
    var parameters: ConnectorParameters
    var region: Name
    var resource: Name
    var resourceType: Name
    var timeoutInSeconds: js.UndefOr[TimeoutInSeconds]
  }

  object TaskScheduledEventDetails {
    @inline
    def apply(
        parameters: ConnectorParameters,
        region: Name,
        resource: Name,
        resourceType: Name,
        timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
    ): TaskScheduledEventDetails = {
      val __obj = js.Dynamic.literal(
        "parameters" -> parameters.asInstanceOf[js.Any],
        "region" -> region.asInstanceOf[js.Any],
        "resource" -> resource.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )

      timeoutInSeconds.foreach(__v => __obj.updateDynamic("timeoutInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskScheduledEventDetails]
    }
  }

  /**
    * Contains details about a task that failed to start during an execution.
    */
  @js.native
  trait TaskStartFailedEventDetails extends js.Object {
    var resource: Name
    var resourceType: Name
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  object TaskStartFailedEventDetails {
    @inline
    def apply(
        resource: Name,
        resourceType: Name,
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): TaskStartFailedEventDetails = {
      val __obj = js.Dynamic.literal(
        "resource" -> resource.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )

      cause.foreach(__v => __obj.updateDynamic("cause")(__v.asInstanceOf[js.Any]))
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskStartFailedEventDetails]
    }
  }

  /**
    * Contains details about the start of a task during an execution.
    */
  @js.native
  trait TaskStartedEventDetails extends js.Object {
    var resource: Name
    var resourceType: Name
  }

  object TaskStartedEventDetails {
    @inline
    def apply(
        resource: Name,
        resourceType: Name
    ): TaskStartedEventDetails = {
      val __obj = js.Dynamic.literal(
        "resource" -> resource.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TaskStartedEventDetails]
    }
  }

  /**
    * Contains details about a task that failed to submit during an execution.
    */
  @js.native
  trait TaskSubmitFailedEventDetails extends js.Object {
    var resource: Name
    var resourceType: Name
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  object TaskSubmitFailedEventDetails {
    @inline
    def apply(
        resource: Name,
        resourceType: Name,
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): TaskSubmitFailedEventDetails = {
      val __obj = js.Dynamic.literal(
        "resource" -> resource.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )

      cause.foreach(__v => __obj.updateDynamic("cause")(__v.asInstanceOf[js.Any]))
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskSubmitFailedEventDetails]
    }
  }

  /**
    * Contains details about a task submitted to a resource .
    */
  @js.native
  trait TaskSubmittedEventDetails extends js.Object {
    var resource: Name
    var resourceType: Name
    var output: js.UndefOr[SensitiveData]
  }

  object TaskSubmittedEventDetails {
    @inline
    def apply(
        resource: Name,
        resourceType: Name,
        output: js.UndefOr[SensitiveData] = js.undefined
    ): TaskSubmittedEventDetails = {
      val __obj = js.Dynamic.literal(
        "resource" -> resource.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )

      output.foreach(__v => __obj.updateDynamic("output")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskSubmittedEventDetails]
    }
  }

  /**
    * Contains details about the successful completion of a task state.
    */
  @js.native
  trait TaskSucceededEventDetails extends js.Object {
    var resource: Name
    var resourceType: Name
    var output: js.UndefOr[SensitiveData]
  }

  object TaskSucceededEventDetails {
    @inline
    def apply(
        resource: Name,
        resourceType: Name,
        output: js.UndefOr[SensitiveData] = js.undefined
    ): TaskSucceededEventDetails = {
      val __obj = js.Dynamic.literal(
        "resource" -> resource.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )

      output.foreach(__v => __obj.updateDynamic("output")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskSucceededEventDetails]
    }
  }

  /**
    * Contains details about a resource timeout that occurred during an execution.
    */
  @js.native
  trait TaskTimedOutEventDetails extends js.Object {
    var resource: Name
    var resourceType: Name
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  object TaskTimedOutEventDetails {
    @inline
    def apply(
        resource: Name,
        resourceType: Name,
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): TaskTimedOutEventDetails = {
      val __obj = js.Dynamic.literal(
        "resource" -> resource.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )

      cause.foreach(__v => __obj.updateDynamic("cause")(__v.asInstanceOf[js.Any]))
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskTimedOutEventDetails]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var resourceArn: Arn
    var tagKeys: TagKeyList
  }

  object UntagResourceInput {
    @inline
    def apply(
        resourceArn: Arn,
        tagKeys: TagKeyList
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceOutput extends js.Object {}

  object UntagResourceOutput {
    @inline
    def apply(
    ): UntagResourceOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceOutput]
    }
  }

  @js.native
  trait UpdateStateMachineInput extends js.Object {
    var stateMachineArn: Arn
    var definition: js.UndefOr[Definition]
    var loggingConfiguration: js.UndefOr[LoggingConfiguration]
    var roleArn: js.UndefOr[Arn]
  }

  object UpdateStateMachineInput {
    @inline
    def apply(
        stateMachineArn: Arn,
        definition: js.UndefOr[Definition] = js.undefined,
        loggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined,
        roleArn: js.UndefOr[Arn] = js.undefined
    ): UpdateStateMachineInput = {
      val __obj = js.Dynamic.literal(
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any]
      )

      definition.foreach(__v => __obj.updateDynamic("definition")(__v.asInstanceOf[js.Any]))
      loggingConfiguration.foreach(__v => __obj.updateDynamic("loggingConfiguration")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStateMachineInput]
    }
  }

  @js.native
  trait UpdateStateMachineOutput extends js.Object {
    var updateDate: Timestamp
  }

  object UpdateStateMachineOutput {
    @inline
    def apply(
        updateDate: Timestamp
    ): UpdateStateMachineOutput = {
      val __obj = js.Dynamic.literal(
        "updateDate" -> updateDate.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateStateMachineOutput]
    }
  }
}
