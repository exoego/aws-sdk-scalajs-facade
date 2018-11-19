package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object stepfunctions {
  type ActivityList = js.Array[ActivityListItem]
  type Arn = String
  type Cause = String
  type Data = String
  type Definition = String
  type Error = String
  type ErrorMessage = String
  type EventId = Double
  type ExecutionList = js.Array[ExecutionListItem]
  type ExecutionStatus = String
  type HistoryEventList = js.Array[HistoryEvent]
  type HistoryEventType = String
  type Identity = String
  type Name = String
  type PageSize = Int
  type PageToken = String
  type ReverseOrder = Boolean
  type StateMachineList = js.Array[StateMachineListItem]
  type StateMachineStatus = String
  type TaskToken = String
  type TimeoutInSeconds = Double
  type Timestamp = js.Date
}

package stepfunctions {
  @js.native
  @JSImport("aws-sdk", "StepFunctions")
  class StepFunctions(config: AWSConfig) extends js.Object {
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
    def sendTaskFailure(params: SendTaskFailureInput): Request[SendTaskFailureOutput] = js.native
    def sendTaskHeartbeat(params: SendTaskHeartbeatInput): Request[SendTaskHeartbeatOutput] = js.native
    def sendTaskSuccess(params: SendTaskSuccessInput): Request[SendTaskSuccessOutput] = js.native
    def startExecution(params: StartExecutionInput): Request[StartExecutionOutput] = js.native
    def stopExecution(params: StopExecutionInput): Request[StopExecutionOutput] = js.native
    def updateStateMachine(params: UpdateStateMachineInput): Request[UpdateStateMachineOutput] = js.native
  }

  /**
   * <p>The specified activity does not exist.</p>
   */
  @js.native
  trait ActivityDoesNotExistException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Contains details about an activity which failed during an execution.</p>
   */
  @js.native
  trait ActivityFailedEventDetails extends js.Object {
    var error: js.UndefOr[Error]
    var cause: js.UndefOr[Cause]
  }

  object ActivityFailedEventDetails {
    def apply(
      error: js.UndefOr[Error] = js.undefined,
      cause: js.UndefOr[Cause] = js.undefined): ActivityFailedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "error" -> error.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityFailedEventDetails]
    }
  }

  /**
   * <p>The maximum number of activities has been reached. Existing activities must be deleted before a new activity can be created.</p>
   */
  @js.native
  trait ActivityLimitExceededException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Contains details about an activity.</p>
   */
  @js.native
  trait ActivityListItem extends js.Object {
    var activityArn: js.UndefOr[Arn]
    var name: js.UndefOr[Name]
    var creationDate: js.UndefOr[Timestamp]
  }

  object ActivityListItem {
    def apply(
      activityArn: js.UndefOr[Arn] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      creationDate: js.UndefOr[Timestamp] = js.undefined): ActivityListItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityArn" -> activityArn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityListItem]
    }
  }

  /**
   * <p>Contains details about an activity schedule failure which occurred during an execution.</p>
   */
  @js.native
  trait ActivityScheduleFailedEventDetails extends js.Object {
    var error: js.UndefOr[Error]
    var cause: js.UndefOr[Cause]
  }

  object ActivityScheduleFailedEventDetails {
    def apply(
      error: js.UndefOr[Error] = js.undefined,
      cause: js.UndefOr[Cause] = js.undefined): ActivityScheduleFailedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "error" -> error.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityScheduleFailedEventDetails]
    }
  }

  /**
   * <p>Contains details about an activity scheduled during an execution.</p>
   */
  @js.native
  trait ActivityScheduledEventDetails extends js.Object {
    var resource: js.UndefOr[Arn]
    var input: js.UndefOr[Data]
    var timeoutInSeconds: js.UndefOr[TimeoutInSeconds]
    var heartbeatInSeconds: js.UndefOr[TimeoutInSeconds]
  }

  object ActivityScheduledEventDetails {
    def apply(
      resource: js.UndefOr[Arn] = js.undefined,
      input: js.UndefOr[Data] = js.undefined,
      timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined,
      heartbeatInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined): ActivityScheduledEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resource" -> resource.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] },
        "timeoutInSeconds" -> timeoutInSeconds.map { x => x.asInstanceOf[js.Any] },
        "heartbeatInSeconds" -> heartbeatInSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityScheduledEventDetails]
    }
  }

  /**
   * <p>Contains details about the start of an activity during an execution.</p>
   */
  @js.native
  trait ActivityStartedEventDetails extends js.Object {
    var workerName: js.UndefOr[Identity]
  }

  object ActivityStartedEventDetails {
    def apply(
      workerName: js.UndefOr[Identity] = js.undefined): ActivityStartedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workerName" -> workerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityStartedEventDetails]
    }
  }

  /**
   * <p>Contains details about an activity which successfully terminated during an execution.</p>
   */
  @js.native
  trait ActivitySucceededEventDetails extends js.Object {
    var output: js.UndefOr[Data]
  }

  object ActivitySucceededEventDetails {
    def apply(
      output: js.UndefOr[Data] = js.undefined): ActivitySucceededEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "output" -> output.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivitySucceededEventDetails]
    }
  }

  /**
   * <p>Contains details about an activity timeout which occurred during an execution.</p>
   */
  @js.native
  trait ActivityTimedOutEventDetails extends js.Object {
    var error: js.UndefOr[Error]
    var cause: js.UndefOr[Cause]
  }

  object ActivityTimedOutEventDetails {
    def apply(
      error: js.UndefOr[Error] = js.undefined,
      cause: js.UndefOr[Cause] = js.undefined): ActivityTimedOutEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "error" -> error.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTimedOutEventDetails]
    }
  }

  /**
   * <p>The maximum number of workers concurrently polling for activity tasks has been reached.</p>
   */
  @js.native
  trait ActivityWorkerLimitExceededException extends js.Object {
    val message: ErrorMessage
  }

  @js.native
  trait CreateActivityInput extends js.Object {
    var name: js.UndefOr[Name]
  }

  object CreateActivityInput {
    def apply(
      name: js.UndefOr[Name] = js.undefined): CreateActivityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateActivityInput]
    }
  }

  @js.native
  trait CreateActivityOutput extends js.Object {
    var activityArn: js.UndefOr[Arn]
    var creationDate: js.UndefOr[Timestamp]
  }

  object CreateActivityOutput {
    def apply(
      activityArn: js.UndefOr[Arn] = js.undefined,
      creationDate: js.UndefOr[Timestamp] = js.undefined): CreateActivityOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityArn" -> activityArn.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateActivityOutput]
    }
  }

  @js.native
  trait CreateStateMachineInput extends js.Object {
    var name: js.UndefOr[Name]
    var definition: js.UndefOr[Definition]
    var roleArn: js.UndefOr[Arn]
  }

  object CreateStateMachineInput {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      definition: js.UndefOr[Definition] = js.undefined,
      roleArn: js.UndefOr[Arn] = js.undefined): CreateStateMachineInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "definition" -> definition.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStateMachineInput]
    }
  }

  @js.native
  trait CreateStateMachineOutput extends js.Object {
    var stateMachineArn: js.UndefOr[Arn]
    var creationDate: js.UndefOr[Timestamp]
  }

  object CreateStateMachineOutput {
    def apply(
      stateMachineArn: js.UndefOr[Arn] = js.undefined,
      creationDate: js.UndefOr[Timestamp] = js.undefined): CreateStateMachineOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stateMachineArn" -> stateMachineArn.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStateMachineOutput]
    }
  }

  @js.native
  trait DeleteActivityInput extends js.Object {
    var activityArn: js.UndefOr[Arn]
  }

  object DeleteActivityInput {
    def apply(
      activityArn: js.UndefOr[Arn] = js.undefined): DeleteActivityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityArn" -> activityArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteActivityInput]
    }
  }

  @js.native
  trait DeleteActivityOutput extends js.Object {

  }

  object DeleteActivityOutput {
    def apply(): DeleteActivityOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteActivityOutput]
    }
  }

  @js.native
  trait DeleteStateMachineInput extends js.Object {
    var stateMachineArn: js.UndefOr[Arn]
  }

  object DeleteStateMachineInput {
    def apply(
      stateMachineArn: js.UndefOr[Arn] = js.undefined): DeleteStateMachineInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stateMachineArn" -> stateMachineArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStateMachineInput]
    }
  }

  @js.native
  trait DeleteStateMachineOutput extends js.Object {

  }

  object DeleteStateMachineOutput {
    def apply(): DeleteStateMachineOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStateMachineOutput]
    }
  }

  @js.native
  trait DescribeActivityInput extends js.Object {
    var activityArn: js.UndefOr[Arn]
  }

  object DescribeActivityInput {
    def apply(
      activityArn: js.UndefOr[Arn] = js.undefined): DescribeActivityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityArn" -> activityArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeActivityInput]
    }
  }

  @js.native
  trait DescribeActivityOutput extends js.Object {
    var activityArn: js.UndefOr[Arn]
    var name: js.UndefOr[Name]
    var creationDate: js.UndefOr[Timestamp]
  }

  object DescribeActivityOutput {
    def apply(
      activityArn: js.UndefOr[Arn] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      creationDate: js.UndefOr[Timestamp] = js.undefined): DescribeActivityOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityArn" -> activityArn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeActivityOutput]
    }
  }

  @js.native
  trait DescribeExecutionInput extends js.Object {
    var executionArn: js.UndefOr[Arn]
  }

  object DescribeExecutionInput {
    def apply(
      executionArn: js.UndefOr[Arn] = js.undefined): DescribeExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionArn" -> executionArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExecutionInput]
    }
  }

  @js.native
  trait DescribeExecutionOutput extends js.Object {
    var name: js.UndefOr[Name]
    var executionArn: js.UndefOr[Arn]
    var status: js.UndefOr[ExecutionStatus]
    var stopDate: js.UndefOr[Timestamp]
    var stateMachineArn: js.UndefOr[Arn]
    var output: js.UndefOr[Data]
    var startDate: js.UndefOr[Timestamp]
    var input: js.UndefOr[Data]
  }

  object DescribeExecutionOutput {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      executionArn: js.UndefOr[Arn] = js.undefined,
      status: js.UndefOr[ExecutionStatus] = js.undefined,
      stopDate: js.UndefOr[Timestamp] = js.undefined,
      stateMachineArn: js.UndefOr[Arn] = js.undefined,
      output: js.UndefOr[Data] = js.undefined,
      startDate: js.UndefOr[Timestamp] = js.undefined,
      input: js.UndefOr[Data] = js.undefined): DescribeExecutionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "executionArn" -> executionArn.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "stopDate" -> stopDate.map { x => x.asInstanceOf[js.Any] },
        "stateMachineArn" -> stateMachineArn.map { x => x.asInstanceOf[js.Any] },
        "output" -> output.map { x => x.asInstanceOf[js.Any] },
        "startDate" -> startDate.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExecutionOutput]
    }
  }

  @js.native
  trait DescribeStateMachineForExecutionInput extends js.Object {
    var executionArn: js.UndefOr[Arn]
  }

  object DescribeStateMachineForExecutionInput {
    def apply(
      executionArn: js.UndefOr[Arn] = js.undefined): DescribeStateMachineForExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionArn" -> executionArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStateMachineForExecutionInput]
    }
  }

  @js.native
  trait DescribeStateMachineForExecutionOutput extends js.Object {
    var name: js.UndefOr[Name]
    var updateDate: js.UndefOr[Timestamp]
    var roleArn: js.UndefOr[Arn]
    var definition: js.UndefOr[Definition]
    var stateMachineArn: js.UndefOr[Arn]
  }

  object DescribeStateMachineForExecutionOutput {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      updateDate: js.UndefOr[Timestamp] = js.undefined,
      roleArn: js.UndefOr[Arn] = js.undefined,
      definition: js.UndefOr[Definition] = js.undefined,
      stateMachineArn: js.UndefOr[Arn] = js.undefined): DescribeStateMachineForExecutionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "updateDate" -> updateDate.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "definition" -> definition.map { x => x.asInstanceOf[js.Any] },
        "stateMachineArn" -> stateMachineArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStateMachineForExecutionOutput]
    }
  }

  @js.native
  trait DescribeStateMachineInput extends js.Object {
    var stateMachineArn: js.UndefOr[Arn]
  }

  object DescribeStateMachineInput {
    def apply(
      stateMachineArn: js.UndefOr[Arn] = js.undefined): DescribeStateMachineInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stateMachineArn" -> stateMachineArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStateMachineInput]
    }
  }

  @js.native
  trait DescribeStateMachineOutput extends js.Object {
    var name: js.UndefOr[Name]
    var roleArn: js.UndefOr[Arn]
    var status: js.UndefOr[StateMachineStatus]
    var creationDate: js.UndefOr[Timestamp]
    var definition: js.UndefOr[Definition]
    var stateMachineArn: js.UndefOr[Arn]
  }

  object DescribeStateMachineOutput {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      roleArn: js.UndefOr[Arn] = js.undefined,
      status: js.UndefOr[StateMachineStatus] = js.undefined,
      creationDate: js.UndefOr[Timestamp] = js.undefined,
      definition: js.UndefOr[Definition] = js.undefined,
      stateMachineArn: js.UndefOr[Arn] = js.undefined): DescribeStateMachineOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] },
        "definition" -> definition.map { x => x.asInstanceOf[js.Any] },
        "stateMachineArn" -> stateMachineArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStateMachineOutput]
    }
  }

  /**
   * <p>Contains details about an abort of an execution.</p>
   */
  @js.native
  trait ExecutionAbortedEventDetails extends js.Object {
    var error: js.UndefOr[Error]
    var cause: js.UndefOr[Cause]
  }

  object ExecutionAbortedEventDetails {
    def apply(
      error: js.UndefOr[Error] = js.undefined,
      cause: js.UndefOr[Cause] = js.undefined): ExecutionAbortedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "error" -> error.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecutionAbortedEventDetails]
    }
  }

  /**
   * <p>The execution has the same <code>name</code> as another execution (but a different <code>input</code>).</p> <note> <p>Executions with the same <code>name</code> and <code>input</code> are considered idempotent.</p> </note>
   */
  @js.native
  trait ExecutionAlreadyExistsException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>The specified execution does not exist.</p>
   */
  @js.native
  trait ExecutionDoesNotExistException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Contains details about an execution failure event.</p>
   */
  @js.native
  trait ExecutionFailedEventDetails extends js.Object {
    var error: js.UndefOr[Error]
    var cause: js.UndefOr[Cause]
  }

  object ExecutionFailedEventDetails {
    def apply(
      error: js.UndefOr[Error] = js.undefined,
      cause: js.UndefOr[Cause] = js.undefined): ExecutionFailedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "error" -> error.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecutionFailedEventDetails]
    }
  }

  /**
   * <p>The maximum number of running executions has been reached. Running executions must end or be stopped before a new execution can be started.</p>
   */
  @js.native
  trait ExecutionLimitExceededException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Contains details about an execution.</p>
   */
  @js.native
  trait ExecutionListItem extends js.Object {
    var name: js.UndefOr[Name]
    var executionArn: js.UndefOr[Arn]
    var status: js.UndefOr[ExecutionStatus]
    var stopDate: js.UndefOr[Timestamp]
    var stateMachineArn: js.UndefOr[Arn]
    var startDate: js.UndefOr[Timestamp]
  }

  object ExecutionListItem {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      executionArn: js.UndefOr[Arn] = js.undefined,
      status: js.UndefOr[ExecutionStatus] = js.undefined,
      stopDate: js.UndefOr[Timestamp] = js.undefined,
      stateMachineArn: js.UndefOr[Arn] = js.undefined,
      startDate: js.UndefOr[Timestamp] = js.undefined): ExecutionListItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "executionArn" -> executionArn.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "stopDate" -> stopDate.map { x => x.asInstanceOf[js.Any] },
        "stateMachineArn" -> stateMachineArn.map { x => x.asInstanceOf[js.Any] },
        "startDate" -> startDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecutionListItem]
    }
  }

  /**
   * <p>Contains details about the start of the execution.</p>
   */
  @js.native
  trait ExecutionStartedEventDetails extends js.Object {
    var input: js.UndefOr[Data]
    var roleArn: js.UndefOr[Arn]
  }

  object ExecutionStartedEventDetails {
    def apply(
      input: js.UndefOr[Data] = js.undefined,
      roleArn: js.UndefOr[Arn] = js.undefined): ExecutionStartedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "input" -> input.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecutionStartedEventDetails]
    }
  }

  object ExecutionStatusEnum {
    val RUNNING = "RUNNING"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED = "FAILED"
    val TIMED_OUT = "TIMED_OUT"
    val ABORTED = "ABORTED"

    val values = IndexedSeq(RUNNING, SUCCEEDED, FAILED, TIMED_OUT, ABORTED)
  }

  /**
   * <p>Contains details about the successful termination of the execution.</p>
   */
  @js.native
  trait ExecutionSucceededEventDetails extends js.Object {
    var output: js.UndefOr[Data]
  }

  object ExecutionSucceededEventDetails {
    def apply(
      output: js.UndefOr[Data] = js.undefined): ExecutionSucceededEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "output" -> output.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecutionSucceededEventDetails]
    }
  }

  /**
   * <p>Contains details about the execution timeout which occurred during the execution.</p>
   */
  @js.native
  trait ExecutionTimedOutEventDetails extends js.Object {
    var error: js.UndefOr[Error]
    var cause: js.UndefOr[Cause]
  }

  object ExecutionTimedOutEventDetails {
    def apply(
      error: js.UndefOr[Error] = js.undefined,
      cause: js.UndefOr[Cause] = js.undefined): ExecutionTimedOutEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "error" -> error.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecutionTimedOutEventDetails]
    }
  }

  @js.native
  trait GetActivityTaskInput extends js.Object {
    var activityArn: js.UndefOr[Arn]
    var workerName: js.UndefOr[Name]
  }

  object GetActivityTaskInput {
    def apply(
      activityArn: js.UndefOr[Arn] = js.undefined,
      workerName: js.UndefOr[Name] = js.undefined): GetActivityTaskInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityArn" -> activityArn.map { x => x.asInstanceOf[js.Any] },
        "workerName" -> workerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetActivityTaskInput]
    }
  }

  @js.native
  trait GetActivityTaskOutput extends js.Object {
    var taskToken: js.UndefOr[TaskToken]
    var input: js.UndefOr[Data]
  }

  object GetActivityTaskOutput {
    def apply(
      taskToken: js.UndefOr[TaskToken] = js.undefined,
      input: js.UndefOr[Data] = js.undefined): GetActivityTaskOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskToken" -> taskToken.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetActivityTaskOutput]
    }
  }

  @js.native
  trait GetExecutionHistoryInput extends js.Object {
    var executionArn: js.UndefOr[Arn]
    var maxResults: js.UndefOr[PageSize]
    var reverseOrder: js.UndefOr[ReverseOrder]
    var nextToken: js.UndefOr[PageToken]
  }

  object GetExecutionHistoryInput {
    def apply(
      executionArn: js.UndefOr[Arn] = js.undefined,
      maxResults: js.UndefOr[PageSize] = js.undefined,
      reverseOrder: js.UndefOr[ReverseOrder] = js.undefined,
      nextToken: js.UndefOr[PageToken] = js.undefined): GetExecutionHistoryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionArn" -> executionArn.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "reverseOrder" -> reverseOrder.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetExecutionHistoryInput]
    }
  }

  @js.native
  trait GetExecutionHistoryOutput extends js.Object {
    var events: js.UndefOr[HistoryEventList]
    var nextToken: js.UndefOr[PageToken]
  }

  object GetExecutionHistoryOutput {
    def apply(
      events: js.UndefOr[HistoryEventList] = js.undefined,
      nextToken: js.UndefOr[PageToken] = js.undefined): GetExecutionHistoryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "events" -> events.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetExecutionHistoryOutput]
    }
  }

  /**
   * <p>Contains details about the events of an execution.</p>
   */
  @js.native
  trait HistoryEvent extends js.Object {
    var activityTimedOutEventDetails: js.UndefOr[ActivityTimedOutEventDetails]
    var activityFailedEventDetails: js.UndefOr[ActivityFailedEventDetails]
    var timestamp: js.UndefOr[Timestamp]
    var activitySucceededEventDetails: js.UndefOr[ActivitySucceededEventDetails]
    var activityScheduledEventDetails: js.UndefOr[ActivityScheduledEventDetails]
    var activityStartedEventDetails: js.UndefOr[ActivityStartedEventDetails]
    var lambdaFunctionFailedEventDetails: js.UndefOr[LambdaFunctionFailedEventDetails]
    var executionFailedEventDetails: js.UndefOr[ExecutionFailedEventDetails]
    var lambdaFunctionSucceededEventDetails: js.UndefOr[LambdaFunctionSucceededEventDetails]
    var lambdaFunctionStartFailedEventDetails: js.UndefOr[LambdaFunctionStartFailedEventDetails]
    var executionSucceededEventDetails: js.UndefOr[ExecutionSucceededEventDetails]
    var activityScheduleFailedEventDetails: js.UndefOr[ActivityScheduleFailedEventDetails]
    var id: js.UndefOr[EventId]
    var lambdaFunctionTimedOutEventDetails: js.UndefOr[LambdaFunctionTimedOutEventDetails]
    var executionStartedEventDetails: js.UndefOr[ExecutionStartedEventDetails]
    var previousEventId: js.UndefOr[EventId]
    var stateExitedEventDetails: js.UndefOr[StateExitedEventDetails]
    var lambdaFunctionScheduleFailedEventDetails: js.UndefOr[LambdaFunctionScheduleFailedEventDetails]
    var `type`: js.UndefOr[HistoryEventType]
    var lambdaFunctionScheduledEventDetails: js.UndefOr[LambdaFunctionScheduledEventDetails]
    var executionAbortedEventDetails: js.UndefOr[ExecutionAbortedEventDetails]
    var stateEnteredEventDetails: js.UndefOr[StateEnteredEventDetails]
    var executionTimedOutEventDetails: js.UndefOr[ExecutionTimedOutEventDetails]
  }

  object HistoryEvent {
    def apply(
      activityTimedOutEventDetails: js.UndefOr[ActivityTimedOutEventDetails] = js.undefined,
      activityFailedEventDetails: js.UndefOr[ActivityFailedEventDetails] = js.undefined,
      timestamp: js.UndefOr[Timestamp] = js.undefined,
      activitySucceededEventDetails: js.UndefOr[ActivitySucceededEventDetails] = js.undefined,
      activityScheduledEventDetails: js.UndefOr[ActivityScheduledEventDetails] = js.undefined,
      activityStartedEventDetails: js.UndefOr[ActivityStartedEventDetails] = js.undefined,
      lambdaFunctionFailedEventDetails: js.UndefOr[LambdaFunctionFailedEventDetails] = js.undefined,
      executionFailedEventDetails: js.UndefOr[ExecutionFailedEventDetails] = js.undefined,
      lambdaFunctionSucceededEventDetails: js.UndefOr[LambdaFunctionSucceededEventDetails] = js.undefined,
      lambdaFunctionStartFailedEventDetails: js.UndefOr[LambdaFunctionStartFailedEventDetails] = js.undefined,
      executionSucceededEventDetails: js.UndefOr[ExecutionSucceededEventDetails] = js.undefined,
      activityScheduleFailedEventDetails: js.UndefOr[ActivityScheduleFailedEventDetails] = js.undefined,
      id: js.UndefOr[EventId] = js.undefined,
      lambdaFunctionTimedOutEventDetails: js.UndefOr[LambdaFunctionTimedOutEventDetails] = js.undefined,
      executionStartedEventDetails: js.UndefOr[ExecutionStartedEventDetails] = js.undefined,
      previousEventId: js.UndefOr[EventId] = js.undefined,
      stateExitedEventDetails: js.UndefOr[StateExitedEventDetails] = js.undefined,
      lambdaFunctionScheduleFailedEventDetails: js.UndefOr[LambdaFunctionScheduleFailedEventDetails] = js.undefined,
      `type`: js.UndefOr[HistoryEventType] = js.undefined,
      lambdaFunctionScheduledEventDetails: js.UndefOr[LambdaFunctionScheduledEventDetails] = js.undefined,
      executionAbortedEventDetails: js.UndefOr[ExecutionAbortedEventDetails] = js.undefined,
      stateEnteredEventDetails: js.UndefOr[StateEnteredEventDetails] = js.undefined,
      executionTimedOutEventDetails: js.UndefOr[ExecutionTimedOutEventDetails] = js.undefined): HistoryEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityTimedOutEventDetails" -> activityTimedOutEventDetails.map { x => x.asInstanceOf[js.Any] },
        "activityFailedEventDetails" -> activityFailedEventDetails.map { x => x.asInstanceOf[js.Any] },
        "timestamp" -> timestamp.map { x => x.asInstanceOf[js.Any] },
        "activitySucceededEventDetails" -> activitySucceededEventDetails.map { x => x.asInstanceOf[js.Any] },
        "activityScheduledEventDetails" -> activityScheduledEventDetails.map { x => x.asInstanceOf[js.Any] },
        "activityStartedEventDetails" -> activityStartedEventDetails.map { x => x.asInstanceOf[js.Any] },
        "lambdaFunctionFailedEventDetails" -> lambdaFunctionFailedEventDetails.map { x => x.asInstanceOf[js.Any] },
        "executionFailedEventDetails" -> executionFailedEventDetails.map { x => x.asInstanceOf[js.Any] },
        "lambdaFunctionSucceededEventDetails" -> lambdaFunctionSucceededEventDetails.map { x => x.asInstanceOf[js.Any] },
        "lambdaFunctionStartFailedEventDetails" -> lambdaFunctionStartFailedEventDetails.map { x => x.asInstanceOf[js.Any] },
        "executionSucceededEventDetails" -> executionSucceededEventDetails.map { x => x.asInstanceOf[js.Any] },
        "activityScheduleFailedEventDetails" -> activityScheduleFailedEventDetails.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "lambdaFunctionTimedOutEventDetails" -> lambdaFunctionTimedOutEventDetails.map { x => x.asInstanceOf[js.Any] },
        "executionStartedEventDetails" -> executionStartedEventDetails.map { x => x.asInstanceOf[js.Any] },
        "previousEventId" -> previousEventId.map { x => x.asInstanceOf[js.Any] },
        "stateExitedEventDetails" -> stateExitedEventDetails.map { x => x.asInstanceOf[js.Any] },
        "lambdaFunctionScheduleFailedEventDetails" -> lambdaFunctionScheduleFailedEventDetails.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "lambdaFunctionScheduledEventDetails" -> lambdaFunctionScheduledEventDetails.map { x => x.asInstanceOf[js.Any] },
        "executionAbortedEventDetails" -> executionAbortedEventDetails.map { x => x.asInstanceOf[js.Any] },
        "stateEnteredEventDetails" -> stateEnteredEventDetails.map { x => x.asInstanceOf[js.Any] },
        "executionTimedOutEventDetails" -> executionTimedOutEventDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HistoryEvent]
    }
  }

  object HistoryEventTypeEnum {
    val ActivityFailed = "ActivityFailed"
    val ActivityScheduleFailed = "ActivityScheduleFailed"
    val ActivityScheduled = "ActivityScheduled"
    val ActivityStarted = "ActivityStarted"
    val ActivitySucceeded = "ActivitySucceeded"
    val ActivityTimedOut = "ActivityTimedOut"
    val ChoiceStateEntered = "ChoiceStateEntered"
    val ChoiceStateExited = "ChoiceStateExited"
    val ExecutionFailed = "ExecutionFailed"
    val ExecutionStarted = "ExecutionStarted"
    val ExecutionSucceeded = "ExecutionSucceeded"
    val ExecutionAborted = "ExecutionAborted"
    val ExecutionTimedOut = "ExecutionTimedOut"
    val FailStateEntered = "FailStateEntered"
    val LambdaFunctionFailed = "LambdaFunctionFailed"
    val LambdaFunctionScheduleFailed = "LambdaFunctionScheduleFailed"
    val LambdaFunctionScheduled = "LambdaFunctionScheduled"
    val LambdaFunctionStartFailed = "LambdaFunctionStartFailed"
    val LambdaFunctionStarted = "LambdaFunctionStarted"
    val LambdaFunctionSucceeded = "LambdaFunctionSucceeded"
    val LambdaFunctionTimedOut = "LambdaFunctionTimedOut"
    val SucceedStateEntered = "SucceedStateEntered"
    val SucceedStateExited = "SucceedStateExited"
    val TaskStateAborted = "TaskStateAborted"
    val TaskStateEntered = "TaskStateEntered"
    val TaskStateExited = "TaskStateExited"
    val PassStateEntered = "PassStateEntered"
    val PassStateExited = "PassStateExited"
    val ParallelStateAborted = "ParallelStateAborted"
    val ParallelStateEntered = "ParallelStateEntered"
    val ParallelStateExited = "ParallelStateExited"
    val ParallelStateFailed = "ParallelStateFailed"
    val ParallelStateStarted = "ParallelStateStarted"
    val ParallelStateSucceeded = "ParallelStateSucceeded"
    val WaitStateAborted = "WaitStateAborted"
    val WaitStateEntered = "WaitStateEntered"
    val WaitStateExited = "WaitStateExited"

    val values = IndexedSeq(ActivityFailed, ActivityScheduleFailed, ActivityScheduled, ActivityStarted, ActivitySucceeded, ActivityTimedOut, ChoiceStateEntered, ChoiceStateExited, ExecutionFailed, ExecutionStarted, ExecutionSucceeded, ExecutionAborted, ExecutionTimedOut, FailStateEntered, LambdaFunctionFailed, LambdaFunctionScheduleFailed, LambdaFunctionScheduled, LambdaFunctionStartFailed, LambdaFunctionStarted, LambdaFunctionSucceeded, LambdaFunctionTimedOut, SucceedStateEntered, SucceedStateExited, TaskStateAborted, TaskStateEntered, TaskStateExited, PassStateEntered, PassStateExited, ParallelStateAborted, ParallelStateEntered, ParallelStateExited, ParallelStateFailed, ParallelStateStarted, ParallelStateSucceeded, WaitStateAborted, WaitStateEntered, WaitStateExited)
  }

  /**
   * <p>The provided Amazon Resource Name (ARN) is invalid.</p>
   */
  @js.native
  trait InvalidArnException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>The provided Amazon States Language definition is invalid.</p>
   */
  @js.native
  trait InvalidDefinitionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>The provided JSON input data is invalid.</p>
   */
  @js.native
  trait InvalidExecutionInputException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>The provided name is invalid.</p>
   */
  @js.native
  trait InvalidNameException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>The provided JSON output data is invalid.</p>
   */
  @js.native
  trait InvalidOutputException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>The provided token is invalid.</p>
   */
  @js.native
  trait InvalidTokenException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Contains details about a lambda function which failed during an execution.</p>
   */
  @js.native
  trait LambdaFunctionFailedEventDetails extends js.Object {
    var error: js.UndefOr[Error]
    var cause: js.UndefOr[Cause]
  }

  object LambdaFunctionFailedEventDetails {
    def apply(
      error: js.UndefOr[Error] = js.undefined,
      cause: js.UndefOr[Cause] = js.undefined): LambdaFunctionFailedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "error" -> error.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionFailedEventDetails]
    }
  }

  /**
   * <p>Contains details about a failed lambda function schedule event which occurred during an execution.</p>
   */
  @js.native
  trait LambdaFunctionScheduleFailedEventDetails extends js.Object {
    var error: js.UndefOr[Error]
    var cause: js.UndefOr[Cause]
  }

  object LambdaFunctionScheduleFailedEventDetails {
    def apply(
      error: js.UndefOr[Error] = js.undefined,
      cause: js.UndefOr[Cause] = js.undefined): LambdaFunctionScheduleFailedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "error" -> error.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionScheduleFailedEventDetails]
    }
  }

  /**
   * <p>Contains details about a lambda function scheduled during an execution.</p>
   */
  @js.native
  trait LambdaFunctionScheduledEventDetails extends js.Object {
    var resource: js.UndefOr[Arn]
    var input: js.UndefOr[Data]
    var timeoutInSeconds: js.UndefOr[TimeoutInSeconds]
  }

  object LambdaFunctionScheduledEventDetails {
    def apply(
      resource: js.UndefOr[Arn] = js.undefined,
      input: js.UndefOr[Data] = js.undefined,
      timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined): LambdaFunctionScheduledEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resource" -> resource.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] },
        "timeoutInSeconds" -> timeoutInSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionScheduledEventDetails]
    }
  }

  /**
   * <p>Contains details about a lambda function which failed to start during an execution.</p>
   */
  @js.native
  trait LambdaFunctionStartFailedEventDetails extends js.Object {
    var error: js.UndefOr[Error]
    var cause: js.UndefOr[Cause]
  }

  object LambdaFunctionStartFailedEventDetails {
    def apply(
      error: js.UndefOr[Error] = js.undefined,
      cause: js.UndefOr[Cause] = js.undefined): LambdaFunctionStartFailedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "error" -> error.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionStartFailedEventDetails]
    }
  }

  /**
   * <p>Contains details about a lambda function which successfully terminated during an execution.</p>
   */
  @js.native
  trait LambdaFunctionSucceededEventDetails extends js.Object {
    var output: js.UndefOr[Data]
  }

  object LambdaFunctionSucceededEventDetails {
    def apply(
      output: js.UndefOr[Data] = js.undefined): LambdaFunctionSucceededEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "output" -> output.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionSucceededEventDetails]
    }
  }

  /**
   * <p>Contains details about a lambda function timeout which occurred during an execution.</p>
   */
  @js.native
  trait LambdaFunctionTimedOutEventDetails extends js.Object {
    var error: js.UndefOr[Error]
    var cause: js.UndefOr[Cause]
  }

  object LambdaFunctionTimedOutEventDetails {
    def apply(
      error: js.UndefOr[Error] = js.undefined,
      cause: js.UndefOr[Cause] = js.undefined): LambdaFunctionTimedOutEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "error" -> error.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionTimedOutEventDetails]
    }
  }

  @js.native
  trait ListActivitiesInput extends js.Object {
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[PageToken]
  }

  object ListActivitiesInput {
    def apply(
      maxResults: js.UndefOr[PageSize] = js.undefined,
      nextToken: js.UndefOr[PageToken] = js.undefined): ListActivitiesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListActivitiesInput]
    }
  }

  @js.native
  trait ListActivitiesOutput extends js.Object {
    var activities: js.UndefOr[ActivityList]
    var nextToken: js.UndefOr[PageToken]
  }

  object ListActivitiesOutput {
    def apply(
      activities: js.UndefOr[ActivityList] = js.undefined,
      nextToken: js.UndefOr[PageToken] = js.undefined): ListActivitiesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activities" -> activities.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListActivitiesOutput]
    }
  }

  @js.native
  trait ListExecutionsInput extends js.Object {
    var stateMachineArn: js.UndefOr[Arn]
    var statusFilter: js.UndefOr[ExecutionStatus]
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[PageToken]
  }

  object ListExecutionsInput {
    def apply(
      stateMachineArn: js.UndefOr[Arn] = js.undefined,
      statusFilter: js.UndefOr[ExecutionStatus] = js.undefined,
      maxResults: js.UndefOr[PageSize] = js.undefined,
      nextToken: js.UndefOr[PageToken] = js.undefined): ListExecutionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stateMachineArn" -> stateMachineArn.map { x => x.asInstanceOf[js.Any] },
        "statusFilter" -> statusFilter.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListExecutionsInput]
    }
  }

  @js.native
  trait ListExecutionsOutput extends js.Object {
    var executions: js.UndefOr[ExecutionList]
    var nextToken: js.UndefOr[PageToken]
  }

  object ListExecutionsOutput {
    def apply(
      executions: js.UndefOr[ExecutionList] = js.undefined,
      nextToken: js.UndefOr[PageToken] = js.undefined): ListExecutionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executions" -> executions.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListExecutionsOutput]
    }
  }

  @js.native
  trait ListStateMachinesInput extends js.Object {
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[PageToken]
  }

  object ListStateMachinesInput {
    def apply(
      maxResults: js.UndefOr[PageSize] = js.undefined,
      nextToken: js.UndefOr[PageToken] = js.undefined): ListStateMachinesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStateMachinesInput]
    }
  }

  @js.native
  trait ListStateMachinesOutput extends js.Object {
    var stateMachines: js.UndefOr[StateMachineList]
    var nextToken: js.UndefOr[PageToken]
  }

  object ListStateMachinesOutput {
    def apply(
      stateMachines: js.UndefOr[StateMachineList] = js.undefined,
      nextToken: js.UndefOr[PageToken] = js.undefined): ListStateMachinesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stateMachines" -> stateMachines.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStateMachinesOutput]
    }
  }

  /**
   * <p>Request is missing a required parameter. This error occurs if both <code>definition</code> and <code>roleArn</code> are not specified.</p>
   */
  @js.native
  trait MissingRequiredParameterException extends js.Object {
    val message: ErrorMessage
  }

  @js.native
  trait SendTaskFailureInput extends js.Object {
    var taskToken: js.UndefOr[TaskToken]
    var error: js.UndefOr[Error]
    var cause: js.UndefOr[Cause]
  }

  object SendTaskFailureInput {
    def apply(
      taskToken: js.UndefOr[TaskToken] = js.undefined,
      error: js.UndefOr[Error] = js.undefined,
      cause: js.UndefOr[Cause] = js.undefined): SendTaskFailureInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskToken" -> taskToken.map { x => x.asInstanceOf[js.Any] },
        "error" -> error.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendTaskFailureInput]
    }
  }

  @js.native
  trait SendTaskFailureOutput extends js.Object {

  }

  object SendTaskFailureOutput {
    def apply(): SendTaskFailureOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendTaskFailureOutput]
    }
  }

  @js.native
  trait SendTaskHeartbeatInput extends js.Object {
    var taskToken: js.UndefOr[TaskToken]
  }

  object SendTaskHeartbeatInput {
    def apply(
      taskToken: js.UndefOr[TaskToken] = js.undefined): SendTaskHeartbeatInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskToken" -> taskToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendTaskHeartbeatInput]
    }
  }

  @js.native
  trait SendTaskHeartbeatOutput extends js.Object {

  }

  object SendTaskHeartbeatOutput {
    def apply(): SendTaskHeartbeatOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendTaskHeartbeatOutput]
    }
  }

  @js.native
  trait SendTaskSuccessInput extends js.Object {
    var taskToken: js.UndefOr[TaskToken]
    var output: js.UndefOr[Data]
  }

  object SendTaskSuccessInput {
    def apply(
      taskToken: js.UndefOr[TaskToken] = js.undefined,
      output: js.UndefOr[Data] = js.undefined): SendTaskSuccessInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskToken" -> taskToken.map { x => x.asInstanceOf[js.Any] },
        "output" -> output.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendTaskSuccessInput]
    }
  }

  @js.native
  trait SendTaskSuccessOutput extends js.Object {

  }

  object SendTaskSuccessOutput {
    def apply(): SendTaskSuccessOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendTaskSuccessOutput]
    }
  }

  @js.native
  trait StartExecutionInput extends js.Object {
    var stateMachineArn: js.UndefOr[Arn]
    var name: js.UndefOr[Name]
    var input: js.UndefOr[Data]
  }

  object StartExecutionInput {
    def apply(
      stateMachineArn: js.UndefOr[Arn] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      input: js.UndefOr[Data] = js.undefined): StartExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stateMachineArn" -> stateMachineArn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartExecutionInput]
    }
  }

  @js.native
  trait StartExecutionOutput extends js.Object {
    var executionArn: js.UndefOr[Arn]
    var startDate: js.UndefOr[Timestamp]
  }

  object StartExecutionOutput {
    def apply(
      executionArn: js.UndefOr[Arn] = js.undefined,
      startDate: js.UndefOr[Timestamp] = js.undefined): StartExecutionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionArn" -> executionArn.map { x => x.asInstanceOf[js.Any] },
        "startDate" -> startDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartExecutionOutput]
    }
  }

  /**
   * <p>Contains details about a state entered during an execution.</p>
   */
  @js.native
  trait StateEnteredEventDetails extends js.Object {
    var name: js.UndefOr[Name]
    var input: js.UndefOr[Data]
  }

  object StateEnteredEventDetails {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      input: js.UndefOr[Data] = js.undefined): StateEnteredEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StateEnteredEventDetails]
    }
  }

  /**
   * <p>Contains details about an exit from a state during an execution.</p>
   */
  @js.native
  trait StateExitedEventDetails extends js.Object {
    var name: js.UndefOr[Name]
    var output: js.UndefOr[Data]
  }

  object StateExitedEventDetails {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      output: js.UndefOr[Data] = js.undefined): StateExitedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "output" -> output.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StateExitedEventDetails]
    }
  }

  /**
   * <p>A state machine with the same name but a different definition or role ARN already exists.</p>
   */
  @js.native
  trait StateMachineAlreadyExistsException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>The specified state machine is being deleted.</p>
   */
  @js.native
  trait StateMachineDeletingException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>The specified state machine does not exist.</p>
   */
  @js.native
  trait StateMachineDoesNotExistException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>The maximum number of state machines has been reached. Existing state machines must be deleted before a new state machine can be created.</p>
   */
  @js.native
  trait StateMachineLimitExceededException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Contains details about the state machine.</p>
   */
  @js.native
  trait StateMachineListItem extends js.Object {
    var stateMachineArn: js.UndefOr[Arn]
    var name: js.UndefOr[Name]
    var creationDate: js.UndefOr[Timestamp]
  }

  object StateMachineListItem {
    def apply(
      stateMachineArn: js.UndefOr[Arn] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      creationDate: js.UndefOr[Timestamp] = js.undefined): StateMachineListItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stateMachineArn" -> stateMachineArn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StateMachineListItem]
    }
  }

  object StateMachineStatusEnum {
    val ACTIVE = "ACTIVE"
    val DELETING = "DELETING"

    val values = IndexedSeq(ACTIVE, DELETING)
  }

  @js.native
  trait StopExecutionInput extends js.Object {
    var executionArn: js.UndefOr[Arn]
    var error: js.UndefOr[Error]
    var cause: js.UndefOr[Cause]
  }

  object StopExecutionInput {
    def apply(
      executionArn: js.UndefOr[Arn] = js.undefined,
      error: js.UndefOr[Error] = js.undefined,
      cause: js.UndefOr[Cause] = js.undefined): StopExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionArn" -> executionArn.map { x => x.asInstanceOf[js.Any] },
        "error" -> error.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopExecutionInput]
    }
  }

  @js.native
  trait StopExecutionOutput extends js.Object {
    var stopDate: js.UndefOr[Timestamp]
  }

  object StopExecutionOutput {
    def apply(
      stopDate: js.UndefOr[Timestamp] = js.undefined): StopExecutionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stopDate" -> stopDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopExecutionOutput]
    }
  }

  @js.native
  trait TaskDoesNotExistException extends js.Object {
    val message: ErrorMessage
  }

  @js.native
  trait TaskTimedOutException extends js.Object {
    val message: ErrorMessage
  }

  @js.native
  trait UpdateStateMachineInput extends js.Object {
    var stateMachineArn: js.UndefOr[Arn]
    var definition: js.UndefOr[Definition]
    var roleArn: js.UndefOr[Arn]
  }

  object UpdateStateMachineInput {
    def apply(
      stateMachineArn: js.UndefOr[Arn] = js.undefined,
      definition: js.UndefOr[Definition] = js.undefined,
      roleArn: js.UndefOr[Arn] = js.undefined): UpdateStateMachineInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stateMachineArn" -> stateMachineArn.map { x => x.asInstanceOf[js.Any] },
        "definition" -> definition.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStateMachineInput]
    }
  }

  @js.native
  trait UpdateStateMachineOutput extends js.Object {
    var updateDate: js.UndefOr[Timestamp]
  }

  object UpdateStateMachineOutput {
    def apply(
      updateDate: js.UndefOr[Timestamp] = js.undefined): UpdateStateMachineOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "updateDate" -> updateDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStateMachineOutput]
    }
  }
}
