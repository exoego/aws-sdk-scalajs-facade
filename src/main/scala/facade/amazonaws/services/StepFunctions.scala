package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object stepfunctions {
  type ActivityList          = js.Array[ActivityListItem]
  type Arn                   = String
  type ConnectorParameters   = String
  type Definition            = String
  type EventId               = Double
  type ExecutionList         = js.Array[ExecutionListItem]
  type ExecutionStatus       = String
  type HistoryEventList      = js.Array[HistoryEvent]
  type HistoryEventType      = String
  type Identity              = String
  type Name                  = String
  type PageSize              = Int
  type PageToken             = String
  type ReverseOrder          = Boolean
  type SensitiveCause        = String
  type SensitiveData         = String
  type SensitiveDataJobInput = String
  type SensitiveError        = String
  type StateMachineList      = js.Array[StateMachineListItem]
  type StateMachineStatus    = String
  type TagKey                = String
  type TagKeyList            = js.Array[TagKey]
  type TagList               = js.Array[Tag]
  type TagValue              = String
  type TaskToken             = String
  type TimeoutInSeconds      = Double
  type Timestamp             = js.Date

  implicit final class StepFunctionsOps(val service: StepFunctions) extends AnyVal {

    def createActivityFuture(params: CreateActivityInput): Future[CreateActivityOutput] =
      service.createActivity(params).promise.toFuture
    def createStateMachineFuture(params: CreateStateMachineInput): Future[CreateStateMachineOutput] =
      service.createStateMachine(params).promise.toFuture
    def deleteActivityFuture(params: DeleteActivityInput): Future[DeleteActivityOutput] =
      service.deleteActivity(params).promise.toFuture
    def deleteStateMachineFuture(params: DeleteStateMachineInput): Future[DeleteStateMachineOutput] =
      service.deleteStateMachine(params).promise.toFuture
    def describeActivityFuture(params: DescribeActivityInput): Future[DescribeActivityOutput] =
      service.describeActivity(params).promise.toFuture
    def describeExecutionFuture(params: DescribeExecutionInput): Future[DescribeExecutionOutput] =
      service.describeExecution(params).promise.toFuture
    def describeStateMachineForExecutionFuture(
        params: DescribeStateMachineForExecutionInput
    ): Future[DescribeStateMachineForExecutionOutput] =
      service.describeStateMachineForExecution(params).promise.toFuture
    def describeStateMachineFuture(params: DescribeStateMachineInput): Future[DescribeStateMachineOutput] =
      service.describeStateMachine(params).promise.toFuture
    def getActivityTaskFuture(params: GetActivityTaskInput): Future[GetActivityTaskOutput] =
      service.getActivityTask(params).promise.toFuture
    def getExecutionHistoryFuture(params: GetExecutionHistoryInput): Future[GetExecutionHistoryOutput] =
      service.getExecutionHistory(params).promise.toFuture
    def listActivitiesFuture(params: ListActivitiesInput): Future[ListActivitiesOutput] =
      service.listActivities(params).promise.toFuture
    def listExecutionsFuture(params: ListExecutionsInput): Future[ListExecutionsOutput] =
      service.listExecutions(params).promise.toFuture
    def listStateMachinesFuture(params: ListStateMachinesInput): Future[ListStateMachinesOutput] =
      service.listStateMachines(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] =
      service.listTagsForResource(params).promise.toFuture
    def sendTaskFailureFuture(params: SendTaskFailureInput): Future[SendTaskFailureOutput] =
      service.sendTaskFailure(params).promise.toFuture
    def sendTaskHeartbeatFuture(params: SendTaskHeartbeatInput): Future[SendTaskHeartbeatOutput] =
      service.sendTaskHeartbeat(params).promise.toFuture
    def sendTaskSuccessFuture(params: SendTaskSuccessInput): Future[SendTaskSuccessOutput] =
      service.sendTaskSuccess(params).promise.toFuture
    def startExecutionFuture(params: StartExecutionInput): Future[StartExecutionOutput] =
      service.startExecution(params).promise.toFuture
    def stopExecutionFuture(params: StopExecutionInput): Future[StopExecutionOutput] =
      service.stopExecution(params).promise.toFuture
    def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] =
      service.untagResource(params).promise.toFuture
    def updateStateMachineFuture(params: UpdateStateMachineInput): Future[UpdateStateMachineOutput] =
      service.updateStateMachine(params).promise.toFuture
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
  trait ActivityFailedEventDetails extends js.Object {
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  object ActivityFailedEventDetails {
    def apply(
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): ActivityFailedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.map { x =>
          x.asInstanceOf[js.Any]
        },
        "error" -> error.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityFailedEventDetails]
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
    def apply(
        activityArn: Arn,
        creationDate: Timestamp,
        name: Name
    ): ActivityListItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityArn"  -> activityArn.asInstanceOf[js.Any],
        "creationDate" -> creationDate.asInstanceOf[js.Any],
        "name"         -> name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityListItem]
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
    def apply(
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): ActivityScheduleFailedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.map { x =>
          x.asInstanceOf[js.Any]
        },
        "error" -> error.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityScheduleFailedEventDetails]
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
    def apply(
        resource: Arn,
        heartbeatInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined,
        input: js.UndefOr[SensitiveData] = js.undefined,
        timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
    ): ActivityScheduledEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resource" -> resource.asInstanceOf[js.Any],
        "heartbeatInSeconds" -> heartbeatInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "input" -> input.map { x =>
          x.asInstanceOf[js.Any]
        },
        "timeoutInSeconds" -> timeoutInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityScheduledEventDetails]
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
    def apply(
        workerName: js.UndefOr[Identity] = js.undefined
    ): ActivityStartedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workerName" -> workerName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityStartedEventDetails]
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
    def apply(
        output: js.UndefOr[SensitiveData] = js.undefined
    ): ActivitySucceededEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "output" -> output.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivitySucceededEventDetails]
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
    def apply(
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): ActivityTimedOutEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.map { x =>
          x.asInstanceOf[js.Any]
        },
        "error" -> error.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTimedOutEventDetails]
    }
  }

  @js.native
  trait CreateActivityInput extends js.Object {
    var name: Name
    var tags: js.UndefOr[TagList]
  }

  object CreateActivityInput {
    def apply(
        name: Name,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateActivityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any],
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateActivityInput]
    }
  }

  @js.native
  trait CreateActivityOutput extends js.Object {
    var activityArn: Arn
    var creationDate: Timestamp
  }

  object CreateActivityOutput {
    def apply(
        activityArn: Arn,
        creationDate: Timestamp
    ): CreateActivityOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityArn"  -> activityArn.asInstanceOf[js.Any],
        "creationDate" -> creationDate.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateActivityOutput]
    }
  }

  @js.native
  trait CreateStateMachineInput extends js.Object {
    var definition: Definition
    var name: Name
    var roleArn: Arn
    var tags: js.UndefOr[TagList]
  }

  object CreateStateMachineInput {
    def apply(
        definition: Definition,
        name: Name,
        roleArn: Arn,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateStateMachineInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "definition" -> definition.asInstanceOf[js.Any],
        "name"       -> name.asInstanceOf[js.Any],
        "roleArn"    -> roleArn.asInstanceOf[js.Any],
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStateMachineInput]
    }
  }

  @js.native
  trait CreateStateMachineOutput extends js.Object {
    var creationDate: Timestamp
    var stateMachineArn: Arn
  }

  object CreateStateMachineOutput {
    def apply(
        creationDate: Timestamp,
        stateMachineArn: Arn
    ): CreateStateMachineOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "creationDate"    -> creationDate.asInstanceOf[js.Any],
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStateMachineOutput]
    }
  }

  @js.native
  trait DeleteActivityInput extends js.Object {
    var activityArn: Arn
  }

  object DeleteActivityInput {
    def apply(
        activityArn: Arn
    ): DeleteActivityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityArn" -> activityArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteActivityInput]
    }
  }

  @js.native
  trait DeleteActivityOutput extends js.Object {}

  object DeleteActivityOutput {
    def apply(
        ): DeleteActivityOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteActivityOutput]
    }
  }

  @js.native
  trait DeleteStateMachineInput extends js.Object {
    var stateMachineArn: Arn
  }

  object DeleteStateMachineInput {
    def apply(
        stateMachineArn: Arn
    ): DeleteStateMachineInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStateMachineInput]
    }
  }

  @js.native
  trait DeleteStateMachineOutput extends js.Object {}

  object DeleteStateMachineOutput {
    def apply(
        ): DeleteStateMachineOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStateMachineOutput]
    }
  }

  @js.native
  trait DescribeActivityInput extends js.Object {
    var activityArn: Arn
  }

  object DescribeActivityInput {
    def apply(
        activityArn: Arn
    ): DescribeActivityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityArn" -> activityArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeActivityInput]
    }
  }

  @js.native
  trait DescribeActivityOutput extends js.Object {
    var activityArn: Arn
    var creationDate: Timestamp
    var name: Name
  }

  object DescribeActivityOutput {
    def apply(
        activityArn: Arn,
        creationDate: Timestamp,
        name: Name
    ): DescribeActivityOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityArn"  -> activityArn.asInstanceOf[js.Any],
        "creationDate" -> creationDate.asInstanceOf[js.Any],
        "name"         -> name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeActivityOutput]
    }
  }

  @js.native
  trait DescribeExecutionInput extends js.Object {
    var executionArn: Arn
  }

  object DescribeExecutionInput {
    def apply(
        executionArn: Arn
    ): DescribeExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionArn" -> executionArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExecutionInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "executionArn"    -> executionArn.asInstanceOf[js.Any],
        "input"           -> input.asInstanceOf[js.Any],
        "startDate"       -> startDate.asInstanceOf[js.Any],
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any],
        "status"          -> status.asInstanceOf[js.Any],
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "output" -> output.map { x =>
          x.asInstanceOf[js.Any]
        },
        "stopDate" -> stopDate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExecutionOutput]
    }
  }

  @js.native
  trait DescribeStateMachineForExecutionInput extends js.Object {
    var executionArn: Arn
  }

  object DescribeStateMachineForExecutionInput {
    def apply(
        executionArn: Arn
    ): DescribeStateMachineForExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionArn" -> executionArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStateMachineForExecutionInput]
    }
  }

  @js.native
  trait DescribeStateMachineForExecutionOutput extends js.Object {
    var definition: Definition
    var name: Name
    var roleArn: Arn
    var stateMachineArn: Arn
    var updateDate: Timestamp
  }

  object DescribeStateMachineForExecutionOutput {
    def apply(
        definition: Definition,
        name: Name,
        roleArn: Arn,
        stateMachineArn: Arn,
        updateDate: Timestamp
    ): DescribeStateMachineForExecutionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "definition"      -> definition.asInstanceOf[js.Any],
        "name"            -> name.asInstanceOf[js.Any],
        "roleArn"         -> roleArn.asInstanceOf[js.Any],
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any],
        "updateDate"      -> updateDate.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStateMachineForExecutionOutput]
    }
  }

  @js.native
  trait DescribeStateMachineInput extends js.Object {
    var stateMachineArn: Arn
  }

  object DescribeStateMachineInput {
    def apply(
        stateMachineArn: Arn
    ): DescribeStateMachineInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStateMachineInput]
    }
  }

  @js.native
  trait DescribeStateMachineOutput extends js.Object {
    var creationDate: Timestamp
    var definition: Definition
    var name: Name
    var roleArn: Arn
    var stateMachineArn: Arn
    var status: js.UndefOr[StateMachineStatus]
  }

  object DescribeStateMachineOutput {
    def apply(
        creationDate: Timestamp,
        definition: Definition,
        name: Name,
        roleArn: Arn,
        stateMachineArn: Arn,
        status: js.UndefOr[StateMachineStatus] = js.undefined
    ): DescribeStateMachineOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "creationDate"    -> creationDate.asInstanceOf[js.Any],
        "definition"      -> definition.asInstanceOf[js.Any],
        "name"            -> name.asInstanceOf[js.Any],
        "roleArn"         -> roleArn.asInstanceOf[js.Any],
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any],
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStateMachineOutput]
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
    def apply(
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): ExecutionAbortedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.map { x =>
          x.asInstanceOf[js.Any]
        },
        "error" -> error.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecutionAbortedEventDetails]
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
    def apply(
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): ExecutionFailedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.map { x =>
          x.asInstanceOf[js.Any]
        },
        "error" -> error.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecutionFailedEventDetails]
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
    def apply(
        executionArn: Arn,
        name: Name,
        startDate: Timestamp,
        stateMachineArn: Arn,
        status: ExecutionStatus,
        stopDate: js.UndefOr[Timestamp] = js.undefined
    ): ExecutionListItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionArn"    -> executionArn.asInstanceOf[js.Any],
        "name"            -> name.asInstanceOf[js.Any],
        "startDate"       -> startDate.asInstanceOf[js.Any],
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any],
        "status"          -> status.asInstanceOf[js.Any],
        "stopDate" -> stopDate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecutionListItem]
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
    def apply(
        input: js.UndefOr[SensitiveData] = js.undefined,
        roleArn: js.UndefOr[Arn] = js.undefined
    ): ExecutionStartedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "input" -> input.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleArn" -> roleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecutionStartedEventDetails]
    }
  }

  object ExecutionStatusEnum {
    val RUNNING   = "RUNNING"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED    = "FAILED"
    val TIMED_OUT = "TIMED_OUT"
    val ABORTED   = "ABORTED"

    val values = IndexedSeq(RUNNING, SUCCEEDED, FAILED, TIMED_OUT, ABORTED)
  }

  /**
    * Contains details about the successful termination of the execution.
    */
  @js.native
  trait ExecutionSucceededEventDetails extends js.Object {
    var output: js.UndefOr[SensitiveData]
  }

  object ExecutionSucceededEventDetails {
    def apply(
        output: js.UndefOr[SensitiveData] = js.undefined
    ): ExecutionSucceededEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "output" -> output.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecutionSucceededEventDetails]
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
    def apply(
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): ExecutionTimedOutEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.map { x =>
          x.asInstanceOf[js.Any]
        },
        "error" -> error.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecutionTimedOutEventDetails]
    }
  }

  @js.native
  trait GetActivityTaskInput extends js.Object {
    var activityArn: Arn
    var workerName: js.UndefOr[Name]
  }

  object GetActivityTaskInput {
    def apply(
        activityArn: Arn,
        workerName: js.UndefOr[Name] = js.undefined
    ): GetActivityTaskInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityArn" -> activityArn.asInstanceOf[js.Any],
        "workerName" -> workerName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetActivityTaskInput]
    }
  }

  @js.native
  trait GetActivityTaskOutput extends js.Object {
    var input: js.UndefOr[SensitiveDataJobInput]
    var taskToken: js.UndefOr[TaskToken]
  }

  object GetActivityTaskOutput {
    def apply(
        input: js.UndefOr[SensitiveDataJobInput] = js.undefined,
        taskToken: js.UndefOr[TaskToken] = js.undefined
    ): GetActivityTaskOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "input" -> input.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskToken" -> taskToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetActivityTaskOutput]
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
    def apply(
        executionArn: Arn,
        maxResults: js.UndefOr[PageSize] = js.undefined,
        nextToken: js.UndefOr[PageToken] = js.undefined,
        reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
    ): GetExecutionHistoryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionArn" -> executionArn.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "reverseOrder" -> reverseOrder.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetExecutionHistoryInput]
    }
  }

  @js.native
  trait GetExecutionHistoryOutput extends js.Object {
    var events: HistoryEventList
    var nextToken: js.UndefOr[PageToken]
  }

  object GetExecutionHistoryOutput {
    def apply(
        events: HistoryEventList,
        nextToken: js.UndefOr[PageToken] = js.undefined
    ): GetExecutionHistoryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "events" -> events.asInstanceOf[js.Any],
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetExecutionHistoryOutput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "id"        -> id.asInstanceOf[js.Any],
        "timestamp" -> timestamp.asInstanceOf[js.Any],
        "`type`"    -> `type`.asInstanceOf[js.Any],
        "activityFailedEventDetails" -> activityFailedEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "activityScheduleFailedEventDetails" -> activityScheduleFailedEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "activityScheduledEventDetails" -> activityScheduledEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "activityStartedEventDetails" -> activityStartedEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "activitySucceededEventDetails" -> activitySucceededEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "activityTimedOutEventDetails" -> activityTimedOutEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "executionAbortedEventDetails" -> executionAbortedEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "executionFailedEventDetails" -> executionFailedEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "executionStartedEventDetails" -> executionStartedEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "executionSucceededEventDetails" -> executionSucceededEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "executionTimedOutEventDetails" -> executionTimedOutEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lambdaFunctionFailedEventDetails" -> lambdaFunctionFailedEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lambdaFunctionScheduleFailedEventDetails" -> lambdaFunctionScheduleFailedEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lambdaFunctionScheduledEventDetails" -> lambdaFunctionScheduledEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lambdaFunctionStartFailedEventDetails" -> lambdaFunctionStartFailedEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lambdaFunctionSucceededEventDetails" -> lambdaFunctionSucceededEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lambdaFunctionTimedOutEventDetails" -> lambdaFunctionTimedOutEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "previousEventId" -> previousEventId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "stateEnteredEventDetails" -> stateEnteredEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "stateExitedEventDetails" -> stateExitedEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskFailedEventDetails" -> taskFailedEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskScheduledEventDetails" -> taskScheduledEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskStartFailedEventDetails" -> taskStartFailedEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskStartedEventDetails" -> taskStartedEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskSubmitFailedEventDetails" -> taskSubmitFailedEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskSubmittedEventDetails" -> taskSubmittedEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskSucceededEventDetails" -> taskSucceededEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskTimedOutEventDetails" -> taskTimedOutEventDetails.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HistoryEvent]
    }
  }

  object HistoryEventTypeEnum {
    val ActivityFailed               = "ActivityFailed"
    val ActivityScheduleFailed       = "ActivityScheduleFailed"
    val ActivityScheduled            = "ActivityScheduled"
    val ActivityStarted              = "ActivityStarted"
    val ActivitySucceeded            = "ActivitySucceeded"
    val ActivityTimedOut             = "ActivityTimedOut"
    val ChoiceStateEntered           = "ChoiceStateEntered"
    val ChoiceStateExited            = "ChoiceStateExited"
    val TaskFailed                   = "TaskFailed"
    val TaskScheduled                = "TaskScheduled"
    val TaskStartFailed              = "TaskStartFailed"
    val TaskStarted                  = "TaskStarted"
    val TaskSubmitFailed             = "TaskSubmitFailed"
    val TaskSubmitted                = "TaskSubmitted"
    val TaskSucceeded                = "TaskSucceeded"
    val TaskTimedOut                 = "TaskTimedOut"
    val ExecutionFailed              = "ExecutionFailed"
    val ExecutionStarted             = "ExecutionStarted"
    val ExecutionSucceeded           = "ExecutionSucceeded"
    val ExecutionAborted             = "ExecutionAborted"
    val ExecutionTimedOut            = "ExecutionTimedOut"
    val FailStateEntered             = "FailStateEntered"
    val LambdaFunctionFailed         = "LambdaFunctionFailed"
    val LambdaFunctionScheduleFailed = "LambdaFunctionScheduleFailed"
    val LambdaFunctionScheduled      = "LambdaFunctionScheduled"
    val LambdaFunctionStartFailed    = "LambdaFunctionStartFailed"
    val LambdaFunctionStarted        = "LambdaFunctionStarted"
    val LambdaFunctionSucceeded      = "LambdaFunctionSucceeded"
    val LambdaFunctionTimedOut       = "LambdaFunctionTimedOut"
    val SucceedStateEntered          = "SucceedStateEntered"
    val SucceedStateExited           = "SucceedStateExited"
    val TaskStateAborted             = "TaskStateAborted"
    val TaskStateEntered             = "TaskStateEntered"
    val TaskStateExited              = "TaskStateExited"
    val PassStateEntered             = "PassStateEntered"
    val PassStateExited              = "PassStateExited"
    val ParallelStateAborted         = "ParallelStateAborted"
    val ParallelStateEntered         = "ParallelStateEntered"
    val ParallelStateExited          = "ParallelStateExited"
    val ParallelStateFailed          = "ParallelStateFailed"
    val ParallelStateStarted         = "ParallelStateStarted"
    val ParallelStateSucceeded       = "ParallelStateSucceeded"
    val WaitStateAborted             = "WaitStateAborted"
    val WaitStateEntered             = "WaitStateEntered"
    val WaitStateExited              = "WaitStateExited"

    val values = IndexedSeq(
      ActivityFailed,
      ActivityScheduleFailed,
      ActivityScheduled,
      ActivityStarted,
      ActivitySucceeded,
      ActivityTimedOut,
      ChoiceStateEntered,
      ChoiceStateExited,
      TaskFailed,
      TaskScheduled,
      TaskStartFailed,
      TaskStarted,
      TaskSubmitFailed,
      TaskSubmitted,
      TaskSucceeded,
      TaskTimedOut,
      ExecutionFailed,
      ExecutionStarted,
      ExecutionSucceeded,
      ExecutionAborted,
      ExecutionTimedOut,
      FailStateEntered,
      LambdaFunctionFailed,
      LambdaFunctionScheduleFailed,
      LambdaFunctionScheduled,
      LambdaFunctionStartFailed,
      LambdaFunctionStarted,
      LambdaFunctionSucceeded,
      LambdaFunctionTimedOut,
      SucceedStateEntered,
      SucceedStateExited,
      TaskStateAborted,
      TaskStateEntered,
      TaskStateExited,
      PassStateEntered,
      PassStateExited,
      ParallelStateAborted,
      ParallelStateEntered,
      ParallelStateExited,
      ParallelStateFailed,
      ParallelStateStarted,
      ParallelStateSucceeded,
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
    def apply(
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): LambdaFunctionFailedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.map { x =>
          x.asInstanceOf[js.Any]
        },
        "error" -> error.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionFailedEventDetails]
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
    def apply(
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): LambdaFunctionScheduleFailedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.map { x =>
          x.asInstanceOf[js.Any]
        },
        "error" -> error.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionScheduleFailedEventDetails]
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
    def apply(
        resource: Arn,
        input: js.UndefOr[SensitiveData] = js.undefined,
        timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
    ): LambdaFunctionScheduledEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resource" -> resource.asInstanceOf[js.Any],
        "input" -> input.map { x =>
          x.asInstanceOf[js.Any]
        },
        "timeoutInSeconds" -> timeoutInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionScheduledEventDetails]
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
    def apply(
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): LambdaFunctionStartFailedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.map { x =>
          x.asInstanceOf[js.Any]
        },
        "error" -> error.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionStartFailedEventDetails]
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
    def apply(
        output: js.UndefOr[SensitiveData] = js.undefined
    ): LambdaFunctionSucceededEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "output" -> output.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionSucceededEventDetails]
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
    def apply(
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): LambdaFunctionTimedOutEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.map { x =>
          x.asInstanceOf[js.Any]
        },
        "error" -> error.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        nextToken: js.UndefOr[PageToken] = js.undefined
    ): ListActivitiesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListActivitiesInput]
    }
  }

  @js.native
  trait ListActivitiesOutput extends js.Object {
    var activities: ActivityList
    var nextToken: js.UndefOr[PageToken]
  }

  object ListActivitiesOutput {
    def apply(
        activities: ActivityList,
        nextToken: js.UndefOr[PageToken] = js.undefined
    ): ListActivitiesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activities" -> activities.asInstanceOf[js.Any],
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListActivitiesOutput]
    }
  }

  @js.native
  trait ListExecutionsInput extends js.Object {
    var stateMachineArn: Arn
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[PageToken]
    var statusFilter: js.UndefOr[ExecutionStatus]
  }

  object ListExecutionsInput {
    def apply(
        stateMachineArn: Arn,
        maxResults: js.UndefOr[PageSize] = js.undefined,
        nextToken: js.UndefOr[PageToken] = js.undefined,
        statusFilter: js.UndefOr[ExecutionStatus] = js.undefined
    ): ListExecutionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "statusFilter" -> statusFilter.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListExecutionsInput]
    }
  }

  @js.native
  trait ListExecutionsOutput extends js.Object {
    var executions: ExecutionList
    var nextToken: js.UndefOr[PageToken]
  }

  object ListExecutionsOutput {
    def apply(
        executions: ExecutionList,
        nextToken: js.UndefOr[PageToken] = js.undefined
    ): ListExecutionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executions" -> executions.asInstanceOf[js.Any],
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        nextToken: js.UndefOr[PageToken] = js.undefined
    ): ListStateMachinesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStateMachinesInput]
    }
  }

  @js.native
  trait ListStateMachinesOutput extends js.Object {
    var stateMachines: StateMachineList
    var nextToken: js.UndefOr[PageToken]
  }

  object ListStateMachinesOutput {
    def apply(
        stateMachines: StateMachineList,
        nextToken: js.UndefOr[PageToken] = js.undefined
    ): ListStateMachinesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stateMachines" -> stateMachines.asInstanceOf[js.Any],
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListStateMachinesOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var resourceArn: Arn
  }

  object ListTagsForResourceInput {
    def apply(
        resourceArn: Arn
    ): ListTagsForResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceOutput {
    def apply(
        tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceOutput]
    }
  }

  @js.native
  trait SendTaskFailureInput extends js.Object {
    var taskToken: TaskToken
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  object SendTaskFailureInput {
    def apply(
        taskToken: TaskToken,
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): SendTaskFailureInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskToken" -> taskToken.asInstanceOf[js.Any],
        "cause" -> cause.map { x =>
          x.asInstanceOf[js.Any]
        },
        "error" -> error.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendTaskFailureInput]
    }
  }

  @js.native
  trait SendTaskFailureOutput extends js.Object {}

  object SendTaskFailureOutput {
    def apply(
        ): SendTaskFailureOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendTaskFailureOutput]
    }
  }

  @js.native
  trait SendTaskHeartbeatInput extends js.Object {
    var taskToken: TaskToken
  }

  object SendTaskHeartbeatInput {
    def apply(
        taskToken: TaskToken
    ): SendTaskHeartbeatInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskToken" -> taskToken.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendTaskHeartbeatInput]
    }
  }

  @js.native
  trait SendTaskHeartbeatOutput extends js.Object {}

  object SendTaskHeartbeatOutput {
    def apply(
        ): SendTaskHeartbeatOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendTaskHeartbeatOutput]
    }
  }

  @js.native
  trait SendTaskSuccessInput extends js.Object {
    var output: SensitiveData
    var taskToken: TaskToken
  }

  object SendTaskSuccessInput {
    def apply(
        output: SensitiveData,
        taskToken: TaskToken
    ): SendTaskSuccessInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "output"    -> output.asInstanceOf[js.Any],
        "taskToken" -> taskToken.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendTaskSuccessInput]
    }
  }

  @js.native
  trait SendTaskSuccessOutput extends js.Object {}

  object SendTaskSuccessOutput {
    def apply(
        ): SendTaskSuccessOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendTaskSuccessOutput]
    }
  }

  @js.native
  trait StartExecutionInput extends js.Object {
    var stateMachineArn: Arn
    var input: js.UndefOr[SensitiveData]
    var name: js.UndefOr[Name]
  }

  object StartExecutionInput {
    def apply(
        stateMachineArn: Arn,
        input: js.UndefOr[SensitiveData] = js.undefined,
        name: js.UndefOr[Name] = js.undefined
    ): StartExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any],
        "input" -> input.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartExecutionInput]
    }
  }

  @js.native
  trait StartExecutionOutput extends js.Object {
    var executionArn: Arn
    var startDate: Timestamp
  }

  object StartExecutionOutput {
    def apply(
        executionArn: Arn,
        startDate: Timestamp
    ): StartExecutionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionArn" -> executionArn.asInstanceOf[js.Any],
        "startDate"    -> startDate.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartExecutionOutput]
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
    def apply(
        name: Name,
        input: js.UndefOr[SensitiveData] = js.undefined
    ): StateEnteredEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any],
        "input" -> input.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StateEnteredEventDetails]
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
    def apply(
        name: Name,
        output: js.UndefOr[SensitiveData] = js.undefined
    ): StateExitedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any],
        "output" -> output.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StateExitedEventDetails]
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
  }

  object StateMachineListItem {
    def apply(
        creationDate: Timestamp,
        name: Name,
        stateMachineArn: Arn
    ): StateMachineListItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "creationDate"    -> creationDate.asInstanceOf[js.Any],
        "name"            -> name.asInstanceOf[js.Any],
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StateMachineListItem]
    }
  }

  object StateMachineStatusEnum {
    val ACTIVE   = "ACTIVE"
    val DELETING = "DELETING"

    val values = IndexedSeq(ACTIVE, DELETING)
  }

  @js.native
  trait StopExecutionInput extends js.Object {
    var executionArn: Arn
    var cause: js.UndefOr[SensitiveCause]
    var error: js.UndefOr[SensitiveError]
  }

  object StopExecutionInput {
    def apply(
        executionArn: Arn,
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): StopExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionArn" -> executionArn.asInstanceOf[js.Any],
        "cause" -> cause.map { x =>
          x.asInstanceOf[js.Any]
        },
        "error" -> error.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopExecutionInput]
    }
  }

  @js.native
  trait StopExecutionOutput extends js.Object {
    var stopDate: Timestamp
  }

  object StopExecutionOutput {
    def apply(
        stopDate: Timestamp
    ): StopExecutionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stopDate" -> stopDate.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopExecutionOutput]
    }
  }

  /**
    * Tags are key-value pairs that can be associated with Step Functions state machines and activities.
    */
  @js.native
  trait Tag extends js.Object {
    var key: js.UndefOr[TagKey]
    var value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
        key: js.UndefOr[TagKey] = js.undefined,
        value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "key" -> key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "value" -> value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var resourceArn: Arn
    var tags: TagList
  }

  object TagResourceInput {
    def apply(
        resourceArn: Arn,
        tags: TagList
    ): TagResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags"        -> tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceOutput extends js.Object {}

  object TagResourceOutput {
    def apply(
        ): TagResourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceOutput]
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
    def apply(
        resource: Name,
        resourceType: Name,
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): TaskFailedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resource"     -> resource.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any],
        "cause" -> cause.map { x =>
          x.asInstanceOf[js.Any]
        },
        "error" -> error.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskFailedEventDetails]
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
    def apply(
        parameters: ConnectorParameters,
        region: Name,
        resource: Name,
        resourceType: Name,
        timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
    ): TaskScheduledEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "parameters"   -> parameters.asInstanceOf[js.Any],
        "region"       -> region.asInstanceOf[js.Any],
        "resource"     -> resource.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any],
        "timeoutInSeconds" -> timeoutInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskScheduledEventDetails]
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
    def apply(
        resource: Name,
        resourceType: Name,
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): TaskStartFailedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resource"     -> resource.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any],
        "cause" -> cause.map { x =>
          x.asInstanceOf[js.Any]
        },
        "error" -> error.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskStartFailedEventDetails]
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
    def apply(
        resource: Name,
        resourceType: Name
    ): TaskStartedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resource"     -> resource.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskStartedEventDetails]
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
    def apply(
        resource: Name,
        resourceType: Name,
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): TaskSubmitFailedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resource"     -> resource.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any],
        "cause" -> cause.map { x =>
          x.asInstanceOf[js.Any]
        },
        "error" -> error.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskSubmitFailedEventDetails]
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
    def apply(
        resource: Name,
        resourceType: Name,
        output: js.UndefOr[SensitiveData] = js.undefined
    ): TaskSubmittedEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resource"     -> resource.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any],
        "output" -> output.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskSubmittedEventDetails]
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
    def apply(
        resource: Name,
        resourceType: Name,
        output: js.UndefOr[SensitiveData] = js.undefined
    ): TaskSucceededEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resource"     -> resource.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any],
        "output" -> output.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskSucceededEventDetails]
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
    def apply(
        resource: Name,
        resourceType: Name,
        cause: js.UndefOr[SensitiveCause] = js.undefined,
        error: js.UndefOr[SensitiveError] = js.undefined
    ): TaskTimedOutEventDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resource"     -> resource.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any],
        "cause" -> cause.map { x =>
          x.asInstanceOf[js.Any]
        },
        "error" -> error.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskTimedOutEventDetails]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var resourceArn: Arn
    var tagKeys: TagKeyList
  }

  object UntagResourceInput {
    def apply(
        resourceArn: Arn,
        tagKeys: TagKeyList
    ): UntagResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceOutput extends js.Object {}

  object UntagResourceOutput {
    def apply(
        ): UntagResourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceOutput]
    }
  }

  @js.native
  trait UpdateStateMachineInput extends js.Object {
    var stateMachineArn: Arn
    var definition: js.UndefOr[Definition]
    var roleArn: js.UndefOr[Arn]
  }

  object UpdateStateMachineInput {
    def apply(
        stateMachineArn: Arn,
        definition: js.UndefOr[Definition] = js.undefined,
        roleArn: js.UndefOr[Arn] = js.undefined
    ): UpdateStateMachineInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stateMachineArn" -> stateMachineArn.asInstanceOf[js.Any],
        "definition" -> definition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleArn" -> roleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStateMachineInput]
    }
  }

  @js.native
  trait UpdateStateMachineOutput extends js.Object {
    var updateDate: Timestamp
  }

  object UpdateStateMachineOutput {
    def apply(
        updateDate: Timestamp
    ): UpdateStateMachineOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "updateDate" -> updateDate.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStateMachineOutput]
    }
  }
}
