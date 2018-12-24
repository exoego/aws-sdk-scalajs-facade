package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object swf {
  type ActivityId = String
  type ActivityTaskTimeoutType = String
  type ActivityTypeInfoList = js.Array[ActivityTypeInfo]
  type Arn = String
  type CancelTimerFailedCause = String
  type CancelWorkflowExecutionFailedCause = String
  type Canceled = Boolean
  type CauseMessage = String
  type ChildPolicy = String
  type CloseStatus = String
  type CompleteWorkflowExecutionFailedCause = String
  type ContinueAsNewWorkflowExecutionFailedCause = String
  type Count = Int
  type Data = String
  type DecisionList = js.Array[Decision]
  type DecisionTaskTimeoutType = String
  type DecisionType = String
  type Description = String
  type DomainInfoList = js.Array[DomainInfo]
  type DomainName = String
  type DurationInDays = String
  type DurationInSeconds = String
  type DurationInSecondsOptional = String
  type ErrorMessage = String
  type EventId = Double
  type EventType = String
  type ExecutionStatus = String
  type FailWorkflowExecutionFailedCause = String
  type FailureReason = String
  type FunctionId = String
  type FunctionInput = String
  type FunctionName = String
  type HistoryEventList = js.Array[HistoryEvent]
  type Identity = String
  type LambdaFunctionTimeoutType = String
  type LimitedData = String
  type MarkerName = String
  type Name = String
  type OpenDecisionTasksCount = Int
  type PageSize = Int
  type PageToken = String
  type RecordMarkerFailedCause = String
  type RegistrationStatus = String
  type RequestCancelActivityTaskFailedCause = String
  type RequestCancelExternalWorkflowExecutionFailedCause = String
  type ReverseOrder = Boolean
  type ScheduleActivityTaskFailedCause = String
  type ScheduleLambdaFunctionFailedCause = String
  type SignalExternalWorkflowExecutionFailedCause = String
  type SignalName = String
  type StartChildWorkflowExecutionFailedCause = String
  type StartLambdaFunctionFailedCause = String
  type StartTimerFailedCause = String
  type Tag = String
  type TagList = js.Array[Tag]
  type TaskPriority = String
  type TaskToken = String
  type TerminateReason = String
  type TimerId = String
  type Timestamp = js.Date
  type Truncated = Boolean
  type Version = String
  type VersionOptional = String
  type WorkflowExecutionCancelRequestedCause = String
  type WorkflowExecutionInfoList = js.Array[WorkflowExecutionInfo]
  type WorkflowExecutionTerminatedCause = String
  type WorkflowExecutionTimeoutType = String
  type WorkflowId = String
  type WorkflowRunId = String
  type WorkflowRunIdOptional = String
  type WorkflowTypeInfoList = js.Array[WorkflowTypeInfo]
}

package swf {
  @js.native
  @JSImport("aws-sdk", "SWF")
  class SWF() extends js.Object {
    def this(config: AWSConfig) = this()

    def countClosedWorkflowExecutions(params: CountClosedWorkflowExecutionsInput): Request[WorkflowExecutionCount] = js.native
    def countOpenWorkflowExecutions(params: CountOpenWorkflowExecutionsInput): Request[WorkflowExecutionCount] = js.native
    def countPendingActivityTasks(params: CountPendingActivityTasksInput): Request[PendingTaskCount] = js.native
    def countPendingDecisionTasks(params: CountPendingDecisionTasksInput): Request[PendingTaskCount] = js.native
    def deprecateActivityType(params: DeprecateActivityTypeInput): Request[js.Object] = js.native
    def deprecateDomain(params: DeprecateDomainInput): Request[js.Object] = js.native
    def deprecateWorkflowType(params: DeprecateWorkflowTypeInput): Request[js.Object] = js.native
    def describeActivityType(params: DescribeActivityTypeInput): Request[ActivityTypeDetail] = js.native
    def describeDomain(params: DescribeDomainInput): Request[DomainDetail] = js.native
    def describeWorkflowExecution(params: DescribeWorkflowExecutionInput): Request[WorkflowExecutionDetail] = js.native
    def describeWorkflowType(params: DescribeWorkflowTypeInput): Request[WorkflowTypeDetail] = js.native
    def getWorkflowExecutionHistory(params: GetWorkflowExecutionHistoryInput): Request[History] = js.native
    def listActivityTypes(params: ListActivityTypesInput): Request[ActivityTypeInfos] = js.native
    def listClosedWorkflowExecutions(params: ListClosedWorkflowExecutionsInput): Request[WorkflowExecutionInfos] = js.native
    def listDomains(params: ListDomainsInput): Request[DomainInfos] = js.native
    def listOpenWorkflowExecutions(params: ListOpenWorkflowExecutionsInput): Request[WorkflowExecutionInfos] = js.native
    def listWorkflowTypes(params: ListWorkflowTypesInput): Request[WorkflowTypeInfos] = js.native
    def pollForActivityTask(params: PollForActivityTaskInput): Request[ActivityTask] = js.native
    def pollForDecisionTask(params: PollForDecisionTaskInput): Request[DecisionTask] = js.native
    def recordActivityTaskHeartbeat(params: RecordActivityTaskHeartbeatInput): Request[ActivityTaskStatus] = js.native
    def registerActivityType(params: RegisterActivityTypeInput): Request[js.Object] = js.native
    def registerDomain(params: RegisterDomainInput): Request[js.Object] = js.native
    def registerWorkflowType(params: RegisterWorkflowTypeInput): Request[js.Object] = js.native
    def requestCancelWorkflowExecution(params: RequestCancelWorkflowExecutionInput): Request[js.Object] = js.native
    def respondActivityTaskCanceled(params: RespondActivityTaskCanceledInput): Request[js.Object] = js.native
    def respondActivityTaskCompleted(params: RespondActivityTaskCompletedInput): Request[js.Object] = js.native
    def respondActivityTaskFailed(params: RespondActivityTaskFailedInput): Request[js.Object] = js.native
    def respondDecisionTaskCompleted(params: RespondDecisionTaskCompletedInput): Request[js.Object] = js.native
    def signalWorkflowExecution(params: SignalWorkflowExecutionInput): Request[js.Object] = js.native
    def startWorkflowExecution(params: StartWorkflowExecutionInput): Request[Run] = js.native
    def terminateWorkflowExecution(params: TerminateWorkflowExecutionInput): Request[js.Object] = js.native
  }

  /**
   * Unit of work sent to an activity worker.
   */
  @js.native
  trait ActivityTask extends js.Object {
    var activityId: ActivityId
    var activityType: ActivityType
    var startedEventId: EventId
    var taskToken: TaskToken
    var workflowExecution: WorkflowExecution
    var input: js.UndefOr[Data]
  }

  object ActivityTask {
    def apply(
      activityId: ActivityId,
      activityType: ActivityType,
      startedEventId: EventId,
      taskToken: TaskToken,
      workflowExecution: WorkflowExecution,
      input: js.UndefOr[Data] = js.undefined): ActivityTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityId" -> activityId.asInstanceOf[js.Any],
        "activityType" -> activityType.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "taskToken" -> taskToken.asInstanceOf[js.Any],
        "workflowExecution" -> workflowExecution.asInstanceOf[js.Any],
        "input" -> input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTask]
    }
  }

  /**
   * Provides the details of the <code>ActivityTaskCancelRequested</code> event.
   */
  @js.native
  trait ActivityTaskCancelRequestedEventAttributes extends js.Object {
    var activityId: ActivityId
    var decisionTaskCompletedEventId: EventId
  }

  object ActivityTaskCancelRequestedEventAttributes {
    def apply(
      activityId: ActivityId,
      decisionTaskCompletedEventId: EventId): ActivityTaskCancelRequestedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityId" -> activityId.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskCancelRequestedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>ActivityTaskCanceled</code> event.
   */
  @js.native
  trait ActivityTaskCanceledEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var details: js.UndefOr[Data]
    var latestCancelRequestedEventId: js.UndefOr[EventId]
  }

  object ActivityTaskCanceledEventAttributes {
    def apply(
      scheduledEventId: EventId,
      startedEventId: EventId,
      details: js.UndefOr[Data] = js.undefined,
      latestCancelRequestedEventId: js.UndefOr[EventId] = js.undefined): ActivityTaskCanceledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "details" -> details.map { x => x.asInstanceOf[js.Any] },
        "latestCancelRequestedEventId" -> latestCancelRequestedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskCanceledEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>ActivityTaskCompleted</code> event.
   */
  @js.native
  trait ActivityTaskCompletedEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var result: js.UndefOr[Data]
  }

  object ActivityTaskCompletedEventAttributes {
    def apply(
      scheduledEventId: EventId,
      startedEventId: EventId,
      result: js.UndefOr[Data] = js.undefined): ActivityTaskCompletedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "result" -> result.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskCompletedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>ActivityTaskFailed</code> event.
   */
  @js.native
  trait ActivityTaskFailedEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var details: js.UndefOr[Data]
    var reason: js.UndefOr[FailureReason]
  }

  object ActivityTaskFailedEventAttributes {
    def apply(
      scheduledEventId: EventId,
      startedEventId: EventId,
      details: js.UndefOr[Data] = js.undefined,
      reason: js.UndefOr[FailureReason] = js.undefined): ActivityTaskFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "details" -> details.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskFailedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>ActivityTaskScheduled</code> event.
   */
  @js.native
  trait ActivityTaskScheduledEventAttributes extends js.Object {
    var activityId: ActivityId
    var activityType: ActivityType
    var decisionTaskCompletedEventId: EventId
    var taskList: TaskList
    var control: js.UndefOr[Data]
    var heartbeatTimeout: js.UndefOr[DurationInSecondsOptional]
    var input: js.UndefOr[Data]
    var scheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var scheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional]
    var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var taskPriority: js.UndefOr[TaskPriority]
  }

  object ActivityTaskScheduledEventAttributes {
    def apply(
      activityId: ActivityId,
      activityType: ActivityType,
      decisionTaskCompletedEventId: EventId,
      taskList: TaskList,
      control: js.UndefOr[Data] = js.undefined,
      heartbeatTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      input: js.UndefOr[Data] = js.undefined,
      scheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      scheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined): ActivityTaskScheduledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityId" -> activityId.asInstanceOf[js.Any],
        "activityType" -> activityType.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "taskList" -> taskList.asInstanceOf[js.Any],
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "heartbeatTimeout" -> heartbeatTimeout.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] },
        "scheduleToCloseTimeout" -> scheduleToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "scheduleToStartTimeout" -> scheduleToStartTimeout.map { x => x.asInstanceOf[js.Any] },
        "startToCloseTimeout" -> startToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "taskPriority" -> taskPriority.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskScheduledEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>ActivityTaskStarted</code> event.
   */
  @js.native
  trait ActivityTaskStartedEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var identity: js.UndefOr[Identity]
  }

  object ActivityTaskStartedEventAttributes {
    def apply(
      scheduledEventId: EventId,
      identity: js.UndefOr[Identity] = js.undefined): ActivityTaskStartedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any],
        "identity" -> identity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskStartedEventAttributes]
    }
  }

  /**
   * Status information about an activity task.
   */
  @js.native
  trait ActivityTaskStatus extends js.Object {
    var cancelRequested: Canceled
  }

  object ActivityTaskStatus {
    def apply(
      cancelRequested: Canceled): ActivityTaskStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cancelRequested" -> cancelRequested.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskStatus]
    }
  }

  /**
   * Provides the details of the <code>ActivityTaskTimedOut</code> event.
   */
  @js.native
  trait ActivityTaskTimedOutEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var timeoutType: ActivityTaskTimeoutType
    var details: js.UndefOr[LimitedData]
  }

  object ActivityTaskTimedOutEventAttributes {
    def apply(
      scheduledEventId: EventId,
      startedEventId: EventId,
      timeoutType: ActivityTaskTimeoutType,
      details: js.UndefOr[LimitedData] = js.undefined): ActivityTaskTimedOutEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "timeoutType" -> timeoutType.asInstanceOf[js.Any],
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskTimedOutEventAttributes]
    }
  }

  object ActivityTaskTimeoutTypeEnum {
    val START_TO_CLOSE = "START_TO_CLOSE"
    val SCHEDULE_TO_START = "SCHEDULE_TO_START"
    val SCHEDULE_TO_CLOSE = "SCHEDULE_TO_CLOSE"
    val HEARTBEAT = "HEARTBEAT"

    val values = IndexedSeq(START_TO_CLOSE, SCHEDULE_TO_START, SCHEDULE_TO_CLOSE, HEARTBEAT)
  }

  /**
   * Represents an activity type.
   */
  @js.native
  trait ActivityType extends js.Object {
    var name: Name
    var version: Version
  }

  object ActivityType {
    def apply(
      name: Name,
      version: Version): ActivityType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityType]
    }
  }

  /**
   * Configuration settings registered with the activity type.
   */
  @js.native
  trait ActivityTypeConfiguration extends js.Object {
    var defaultTaskHeartbeatTimeout: js.UndefOr[DurationInSecondsOptional]
    var defaultTaskList: js.UndefOr[TaskList]
    var defaultTaskPriority: js.UndefOr[TaskPriority]
    var defaultTaskScheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var defaultTaskScheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional]
    var defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
  }

  object ActivityTypeConfiguration {
    def apply(
      defaultTaskHeartbeatTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      defaultTaskList: js.UndefOr[TaskList] = js.undefined,
      defaultTaskPriority: js.UndefOr[TaskPriority] = js.undefined,
      defaultTaskScheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      defaultTaskScheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined): ActivityTypeConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "defaultTaskHeartbeatTimeout" -> defaultTaskHeartbeatTimeout.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskList" -> defaultTaskList.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskPriority" -> defaultTaskPriority.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskScheduleToCloseTimeout" -> defaultTaskScheduleToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskScheduleToStartTimeout" -> defaultTaskScheduleToStartTimeout.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskStartToCloseTimeout" -> defaultTaskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTypeConfiguration]
    }
  }

  /**
   * Detailed information about an activity type.
   */
  @js.native
  trait ActivityTypeDetail extends js.Object {
    var configuration: ActivityTypeConfiguration
    var typeInfo: ActivityTypeInfo
  }

  object ActivityTypeDetail {
    def apply(
      configuration: ActivityTypeConfiguration,
      typeInfo: ActivityTypeInfo): ActivityTypeDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configuration" -> configuration.asInstanceOf[js.Any],
        "typeInfo" -> typeInfo.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTypeDetail]
    }
  }

  /**
   * Detailed information about an activity type.
   */
  @js.native
  trait ActivityTypeInfo extends js.Object {
    var activityType: ActivityType
    var creationDate: Timestamp
    var status: RegistrationStatus
    var deprecationDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
  }

  object ActivityTypeInfo {
    def apply(
      activityType: ActivityType,
      creationDate: Timestamp,
      status: RegistrationStatus,
      deprecationDate: js.UndefOr[Timestamp] = js.undefined,
      description: js.UndefOr[Description] = js.undefined): ActivityTypeInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityType" -> activityType.asInstanceOf[js.Any],
        "creationDate" -> creationDate.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "deprecationDate" -> deprecationDate.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTypeInfo]
    }
  }

  /**
   * Contains a paginated list of activity type information structures.
   */
  @js.native
  trait ActivityTypeInfos extends js.Object {
    var typeInfos: ActivityTypeInfoList
    var nextPageToken: js.UndefOr[PageToken]
  }

  object ActivityTypeInfos {
    def apply(
      typeInfos: ActivityTypeInfoList,
      nextPageToken: js.UndefOr[PageToken] = js.undefined): ActivityTypeInfos = {
      val _fields = IndexedSeq[(String, js.Any)](
        "typeInfos" -> typeInfos.asInstanceOf[js.Any],
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTypeInfos]
    }
  }

  /**
   * Provides the details of the <code>CancelTimer</code> decision.
   *  <b>Access Control</b>
   *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
   * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
   *  * Use an <code>Action</code> element to allow or deny permission to call this action.
   *  * You cannot use an IAM policy to constrain this action's parameters.
   * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
   */
  @js.native
  trait CancelTimerDecisionAttributes extends js.Object {
    var timerId: TimerId
  }

  object CancelTimerDecisionAttributes {
    def apply(
      timerId: TimerId): CancelTimerDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "timerId" -> timerId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelTimerDecisionAttributes]
    }
  }

  object CancelTimerFailedCauseEnum {
    val TIMER_ID_UNKNOWN = "TIMER_ID_UNKNOWN"
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(TIMER_ID_UNKNOWN, OPERATION_NOT_PERMITTED)
  }

  /**
   * Provides the details of the <code>CancelTimerFailed</code> event.
   */
  @js.native
  trait CancelTimerFailedEventAttributes extends js.Object {
    var cause: CancelTimerFailedCause
    var decisionTaskCompletedEventId: EventId
    var timerId: TimerId
  }

  object CancelTimerFailedEventAttributes {
    def apply(
      cause: CancelTimerFailedCause,
      decisionTaskCompletedEventId: EventId,
      timerId: TimerId): CancelTimerFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "timerId" -> timerId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelTimerFailedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>CancelWorkflowExecution</code> decision.
   *  <b>Access Control</b>
   *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
   * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
   *  * Use an <code>Action</code> element to allow or deny permission to call this action.
   *  * You cannot use an IAM policy to constrain this action's parameters.
   * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
   */
  @js.native
  trait CancelWorkflowExecutionDecisionAttributes extends js.Object {
    var details: js.UndefOr[Data]
  }

  object CancelWorkflowExecutionDecisionAttributes {
    def apply(
      details: js.UndefOr[Data] = js.undefined): CancelWorkflowExecutionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelWorkflowExecutionDecisionAttributes]
    }
  }

  object CancelWorkflowExecutionFailedCauseEnum {
    val UNHANDLED_DECISION = "UNHANDLED_DECISION"
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(UNHANDLED_DECISION, OPERATION_NOT_PERMITTED)
  }

  /**
   * Provides the details of the <code>CancelWorkflowExecutionFailed</code> event.
   */
  @js.native
  trait CancelWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: CancelWorkflowExecutionFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  object CancelWorkflowExecutionFailedEventAttributes {
    def apply(
      cause: CancelWorkflowExecutionFailedCause,
      decisionTaskCompletedEventId: EventId): CancelWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelWorkflowExecutionFailedEventAttributes]
    }
  }

  object ChildPolicyEnum {
    val TERMINATE = "TERMINATE"
    val REQUEST_CANCEL = "REQUEST_CANCEL"
    val ABANDON = "ABANDON"

    val values = IndexedSeq(TERMINATE, REQUEST_CANCEL, ABANDON)
  }

  /**
   * Provide details of the <code>ChildWorkflowExecutionCanceled</code> event.
   */
  @js.native
  trait ChildWorkflowExecutionCanceledEventAttributes extends js.Object {
    var initiatedEventId: EventId
    var startedEventId: EventId
    var workflowExecution: WorkflowExecution
    var workflowType: WorkflowType
    var details: js.UndefOr[Data]
  }

  object ChildWorkflowExecutionCanceledEventAttributes {
    def apply(
      initiatedEventId: EventId,
      startedEventId: EventId,
      workflowExecution: WorkflowExecution,
      workflowType: WorkflowType,
      details: js.UndefOr[Data] = js.undefined): ChildWorkflowExecutionCanceledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "workflowExecution" -> workflowExecution.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any],
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChildWorkflowExecutionCanceledEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>ChildWorkflowExecutionCompleted</code> event.
   */
  @js.native
  trait ChildWorkflowExecutionCompletedEventAttributes extends js.Object {
    var initiatedEventId: EventId
    var startedEventId: EventId
    var workflowExecution: WorkflowExecution
    var workflowType: WorkflowType
    var result: js.UndefOr[Data]
  }

  object ChildWorkflowExecutionCompletedEventAttributes {
    def apply(
      initiatedEventId: EventId,
      startedEventId: EventId,
      workflowExecution: WorkflowExecution,
      workflowType: WorkflowType,
      result: js.UndefOr[Data] = js.undefined): ChildWorkflowExecutionCompletedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "workflowExecution" -> workflowExecution.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any],
        "result" -> result.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChildWorkflowExecutionCompletedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>ChildWorkflowExecutionFailed</code> event.
   */
  @js.native
  trait ChildWorkflowExecutionFailedEventAttributes extends js.Object {
    var initiatedEventId: EventId
    var startedEventId: EventId
    var workflowExecution: WorkflowExecution
    var workflowType: WorkflowType
    var details: js.UndefOr[Data]
    var reason: js.UndefOr[FailureReason]
  }

  object ChildWorkflowExecutionFailedEventAttributes {
    def apply(
      initiatedEventId: EventId,
      startedEventId: EventId,
      workflowExecution: WorkflowExecution,
      workflowType: WorkflowType,
      details: js.UndefOr[Data] = js.undefined,
      reason: js.UndefOr[FailureReason] = js.undefined): ChildWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "workflowExecution" -> workflowExecution.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any],
        "details" -> details.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChildWorkflowExecutionFailedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>ChildWorkflowExecutionStarted</code> event.
   */
  @js.native
  trait ChildWorkflowExecutionStartedEventAttributes extends js.Object {
    var initiatedEventId: EventId
    var workflowExecution: WorkflowExecution
    var workflowType: WorkflowType
  }

  object ChildWorkflowExecutionStartedEventAttributes {
    def apply(
      initiatedEventId: EventId,
      workflowExecution: WorkflowExecution,
      workflowType: WorkflowType): ChildWorkflowExecutionStartedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "workflowExecution" -> workflowExecution.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChildWorkflowExecutionStartedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>ChildWorkflowExecutionTerminated</code> event.
   */
  @js.native
  trait ChildWorkflowExecutionTerminatedEventAttributes extends js.Object {
    var initiatedEventId: EventId
    var startedEventId: EventId
    var workflowExecution: WorkflowExecution
    var workflowType: WorkflowType
  }

  object ChildWorkflowExecutionTerminatedEventAttributes {
    def apply(
      initiatedEventId: EventId,
      startedEventId: EventId,
      workflowExecution: WorkflowExecution,
      workflowType: WorkflowType): ChildWorkflowExecutionTerminatedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "workflowExecution" -> workflowExecution.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChildWorkflowExecutionTerminatedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>ChildWorkflowExecutionTimedOut</code> event.
   */
  @js.native
  trait ChildWorkflowExecutionTimedOutEventAttributes extends js.Object {
    var initiatedEventId: EventId
    var startedEventId: EventId
    var timeoutType: WorkflowExecutionTimeoutType
    var workflowExecution: WorkflowExecution
    var workflowType: WorkflowType
  }

  object ChildWorkflowExecutionTimedOutEventAttributes {
    def apply(
      initiatedEventId: EventId,
      startedEventId: EventId,
      timeoutType: WorkflowExecutionTimeoutType,
      workflowExecution: WorkflowExecution,
      workflowType: WorkflowType): ChildWorkflowExecutionTimedOutEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "timeoutType" -> timeoutType.asInstanceOf[js.Any],
        "workflowExecution" -> workflowExecution.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChildWorkflowExecutionTimedOutEventAttributes]
    }
  }

  object CloseStatusEnum {
    val COMPLETED = "COMPLETED"
    val FAILED = "FAILED"
    val CANCELED = "CANCELED"
    val TERMINATED = "TERMINATED"
    val CONTINUED_AS_NEW = "CONTINUED_AS_NEW"
    val TIMED_OUT = "TIMED_OUT"

    val values = IndexedSeq(COMPLETED, FAILED, CANCELED, TERMINATED, CONTINUED_AS_NEW, TIMED_OUT)
  }

  /**
   * Used to filter the closed workflow executions in visibility APIs by their close status.
   */
  @js.native
  trait CloseStatusFilter extends js.Object {
    var status: CloseStatus
  }

  object CloseStatusFilter {
    def apply(
      status: CloseStatus): CloseStatusFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "status" -> status.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloseStatusFilter]
    }
  }

  /**
   * Provides the details of the <code>CompleteWorkflowExecution</code> decision.
   *  <b>Access Control</b>
   *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
   * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
   *  * Use an <code>Action</code> element to allow or deny permission to call this action.
   *  * You cannot use an IAM policy to constrain this action's parameters.
   * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
   */
  @js.native
  trait CompleteWorkflowExecutionDecisionAttributes extends js.Object {
    var result: js.UndefOr[Data]
  }

  object CompleteWorkflowExecutionDecisionAttributes {
    def apply(
      result: js.UndefOr[Data] = js.undefined): CompleteWorkflowExecutionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "result" -> result.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteWorkflowExecutionDecisionAttributes]
    }
  }

  object CompleteWorkflowExecutionFailedCauseEnum {
    val UNHANDLED_DECISION = "UNHANDLED_DECISION"
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(UNHANDLED_DECISION, OPERATION_NOT_PERMITTED)
  }

  /**
   * Provides the details of the <code>CompleteWorkflowExecutionFailed</code> event.
   */
  @js.native
  trait CompleteWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: CompleteWorkflowExecutionFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  object CompleteWorkflowExecutionFailedEventAttributes {
    def apply(
      cause: CompleteWorkflowExecutionFailedCause,
      decisionTaskCompletedEventId: EventId): CompleteWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteWorkflowExecutionFailedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>ContinueAsNewWorkflowExecution</code> decision.
   *  <b>Access Control</b>
   *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
   * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
   *  * Use an <code>Action</code> element to allow or deny permission to call this action.
   *  * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
   * <li> <code>tag</code> ? A tag used to identify the workflow execution
   *  * <code>taskList</code> ? String constraint. The key is <code>swf:taskList.name</code>.
   *  * <code>workflowType.version</code> ? String constraint. The key is <code>swf:workflowType.version</code>.
   * </li>If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
   */
  @js.native
  trait ContinueAsNewWorkflowExecutionDecisionAttributes extends js.Object {
    var childPolicy: js.UndefOr[ChildPolicy]
    var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var input: js.UndefOr[Data]
    var lambdaRole: js.UndefOr[Arn]
    var tagList: js.UndefOr[TagList]
    var taskList: js.UndefOr[TaskList]
    var taskPriority: js.UndefOr[TaskPriority]
    var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var workflowTypeVersion: js.UndefOr[Version]
  }

  object ContinueAsNewWorkflowExecutionDecisionAttributes {
    def apply(
      childPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      input: js.UndefOr[Data] = js.undefined,
      lambdaRole: js.UndefOr[Arn] = js.undefined,
      tagList: js.UndefOr[TagList] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined,
      taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      workflowTypeVersion: js.UndefOr[Version] = js.undefined): ContinueAsNewWorkflowExecutionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "childPolicy" -> childPolicy.map { x => x.asInstanceOf[js.Any] },
        "executionStartToCloseTimeout" -> executionStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] },
        "lambdaRole" -> lambdaRole.map { x => x.asInstanceOf[js.Any] },
        "tagList" -> tagList.map { x => x.asInstanceOf[js.Any] },
        "taskList" -> taskList.map { x => x.asInstanceOf[js.Any] },
        "taskPriority" -> taskPriority.map { x => x.asInstanceOf[js.Any] },
        "taskStartToCloseTimeout" -> taskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "workflowTypeVersion" -> workflowTypeVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContinueAsNewWorkflowExecutionDecisionAttributes]
    }
  }

  object ContinueAsNewWorkflowExecutionFailedCauseEnum {
    val UNHANDLED_DECISION = "UNHANDLED_DECISION"
    val WORKFLOW_TYPE_DEPRECATED = "WORKFLOW_TYPE_DEPRECATED"
    val WORKFLOW_TYPE_DOES_NOT_EXIST = "WORKFLOW_TYPE_DOES_NOT_EXIST"
    val DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED = "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED"
    val DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED = "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED"
    val DEFAULT_TASK_LIST_UNDEFINED = "DEFAULT_TASK_LIST_UNDEFINED"
    val DEFAULT_CHILD_POLICY_UNDEFINED = "DEFAULT_CHILD_POLICY_UNDEFINED"
    val CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED = "CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED"
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(UNHANDLED_DECISION, WORKFLOW_TYPE_DEPRECATED, WORKFLOW_TYPE_DOES_NOT_EXIST, DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED, DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED, DEFAULT_TASK_LIST_UNDEFINED, DEFAULT_CHILD_POLICY_UNDEFINED, CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED)
  }

  /**
   * Provides the details of the <code>ContinueAsNewWorkflowExecutionFailed</code> event.
   */
  @js.native
  trait ContinueAsNewWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: ContinueAsNewWorkflowExecutionFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  object ContinueAsNewWorkflowExecutionFailedEventAttributes {
    def apply(
      cause: ContinueAsNewWorkflowExecutionFailedCause,
      decisionTaskCompletedEventId: EventId): ContinueAsNewWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContinueAsNewWorkflowExecutionFailedEventAttributes]
    }
  }

  @js.native
  trait CountClosedWorkflowExecutionsInput extends js.Object {
    var domain: DomainName
    var closeStatusFilter: js.UndefOr[CloseStatusFilter]
    var closeTimeFilter: js.UndefOr[ExecutionTimeFilter]
    var executionFilter: js.UndefOr[WorkflowExecutionFilter]
    var startTimeFilter: js.UndefOr[ExecutionTimeFilter]
    var tagFilter: js.UndefOr[TagFilter]
    var typeFilter: js.UndefOr[WorkflowTypeFilter]
  }

  object CountClosedWorkflowExecutionsInput {
    def apply(
      domain: DomainName,
      closeStatusFilter: js.UndefOr[CloseStatusFilter] = js.undefined,
      closeTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined,
      executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined,
      startTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined,
      tagFilter: js.UndefOr[TagFilter] = js.undefined,
      typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined): CountClosedWorkflowExecutionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.asInstanceOf[js.Any],
        "closeStatusFilter" -> closeStatusFilter.map { x => x.asInstanceOf[js.Any] },
        "closeTimeFilter" -> closeTimeFilter.map { x => x.asInstanceOf[js.Any] },
        "executionFilter" -> executionFilter.map { x => x.asInstanceOf[js.Any] },
        "startTimeFilter" -> startTimeFilter.map { x => x.asInstanceOf[js.Any] },
        "tagFilter" -> tagFilter.map { x => x.asInstanceOf[js.Any] },
        "typeFilter" -> typeFilter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CountClosedWorkflowExecutionsInput]
    }
  }

  @js.native
  trait CountOpenWorkflowExecutionsInput extends js.Object {
    var domain: DomainName
    var startTimeFilter: ExecutionTimeFilter
    var executionFilter: js.UndefOr[WorkflowExecutionFilter]
    var tagFilter: js.UndefOr[TagFilter]
    var typeFilter: js.UndefOr[WorkflowTypeFilter]
  }

  object CountOpenWorkflowExecutionsInput {
    def apply(
      domain: DomainName,
      startTimeFilter: ExecutionTimeFilter,
      executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined,
      tagFilter: js.UndefOr[TagFilter] = js.undefined,
      typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined): CountOpenWorkflowExecutionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.asInstanceOf[js.Any],
        "startTimeFilter" -> startTimeFilter.asInstanceOf[js.Any],
        "executionFilter" -> executionFilter.map { x => x.asInstanceOf[js.Any] },
        "tagFilter" -> tagFilter.map { x => x.asInstanceOf[js.Any] },
        "typeFilter" -> typeFilter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CountOpenWorkflowExecutionsInput]
    }
  }

  @js.native
  trait CountPendingActivityTasksInput extends js.Object {
    var domain: DomainName
    var taskList: TaskList
  }

  object CountPendingActivityTasksInput {
    def apply(
      domain: DomainName,
      taskList: TaskList): CountPendingActivityTasksInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.asInstanceOf[js.Any],
        "taskList" -> taskList.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CountPendingActivityTasksInput]
    }
  }

  @js.native
  trait CountPendingDecisionTasksInput extends js.Object {
    var domain: DomainName
    var taskList: TaskList
  }

  object CountPendingDecisionTasksInput {
    def apply(
      domain: DomainName,
      taskList: TaskList): CountPendingDecisionTasksInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.asInstanceOf[js.Any],
        "taskList" -> taskList.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CountPendingDecisionTasksInput]
    }
  }

  /**
   * Specifies a decision made by the decider. A decision can be one of these types:
   * * <code>CancelTimer</code> ? Cancels a previously started timer and records a <code>TimerCanceled</code> event in the history.
   *  * <code>CancelWorkflowExecution</code> ? Closes the workflow execution and records a <code>WorkflowExecutionCanceled</code> event in the history.
   *  * <code>CompleteWorkflowExecution</code> ? Closes the workflow execution and records a <code>WorkflowExecutionCompleted</code> event in the history .
   *  * <code>ContinueAsNewWorkflowExecution</code> ? Closes the workflow execution and starts a new workflow execution of the same type using the same workflow ID and a unique run Id. A <code>WorkflowExecutionContinuedAsNew</code> event is recorded in the history.
   *  * <code>FailWorkflowExecution</code> ? Closes the workflow execution and records a <code>WorkflowExecutionFailed</code> event in the history.
   *  * <code>RecordMarker</code> ? Records a <code>MarkerRecorded</code> event in the history. Markers can be used for adding custom information in the history for instance to let deciders know that they don't need to look at the history beyond the marker event.
   *  * <code>RequestCancelActivityTask</code> ? Attempts to cancel a previously scheduled activity task. If the activity task was scheduled but has not been assigned to a worker, then it is canceled. If the activity task was already assigned to a worker, then the worker is informed that cancellation has been requested in the response to <a>RecordActivityTaskHeartbeat</a>.
   *  * <code>RequestCancelExternalWorkflowExecution</code> ? Requests that a request be made to cancel the specified external workflow execution and records a <code>RequestCancelExternalWorkflowExecutionInitiated</code> event in the history.
   *  * <code>ScheduleActivityTask</code> ? Schedules an activity task.
   *  * <code>SignalExternalWorkflowExecution</code> ? Requests a signal to be delivered to the specified external workflow execution and records a <code>SignalExternalWorkflowExecutionInitiated</code> event in the history.
   *  * <code>StartChildWorkflowExecution</code> ? Requests that a child workflow execution be started and records a <code>StartChildWorkflowExecutionInitiated</code> event in the history. The child workflow execution is a separate workflow execution with its own history.
   *  * <code>StartTimer</code> ? Starts a timer for this workflow execution and records a <code>TimerStarted</code> event in the history. This timer fires after the specified delay and record a <code>TimerFired</code> event.
   * <b>Access Control</b>
   *  If you grant permission to use <code>RespondDecisionTaskCompleted</code>, you can use IAM policies to express permissions for the list of decisions returned by this action as if they were members of the API. Treating decisions as a pseudo API maintains a uniform conceptual model and helps keep policies readable. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
   *  <b>Decision Failure</b>
   *  Decisions can fail for several reasons
   * * The ordering of decisions should follow a logical flow. Some decisions might not make sense in the current context of the workflow execution and therefore fails.
   *  * A limit on your account was reached.
   *  * The decision lacks sufficient permissions.
   * One of the following events might be added to the history to indicate an error. The event attribute's <code>cause</code> parameter indicates the cause. If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it lacked sufficient permissions. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
   * * <code>ScheduleActivityTaskFailed</code> ? A <code>ScheduleActivityTask</code> decision failed. This could happen if the activity type specified in the decision isn't registered, is in a deprecated state, or the decision isn't properly configured.
   *  * <code>RequestCancelActivityTaskFailed</code> ? A <code>RequestCancelActivityTask</code> decision failed. This could happen if there is no open activity task with the specified activityId.
   *  * <code>StartTimerFailed</code> ? A <code>StartTimer</code> decision failed. This could happen if there is another open timer with the same timerId.
   *  * <code>CancelTimerFailed</code> ? A <code>CancelTimer</code> decision failed. This could happen if there is no open timer with the specified timerId.
   *  * <code>StartChildWorkflowExecutionFailed</code> ? A <code>StartChildWorkflowExecution</code> decision failed. This could happen if the workflow type specified isn't registered, is deprecated, or the decision isn't properly configured.
   *  * <code>SignalExternalWorkflowExecutionFailed</code> ? A <code>SignalExternalWorkflowExecution</code> decision failed. This could happen if the <code>workflowID</code> specified in the decision was incorrect.
   *  * <code>RequestCancelExternalWorkflowExecutionFailed</code> ? A <code>RequestCancelExternalWorkflowExecution</code> decision failed. This could happen if the <code>workflowID</code> specified in the decision was incorrect.
   *  * <code>CancelWorkflowExecutionFailed</code> ? A <code>CancelWorkflowExecution</code> decision failed. This could happen if there is an unhandled decision task pending in the workflow execution.
   *  * <code>CompleteWorkflowExecutionFailed</code> ? A <code>CompleteWorkflowExecution</code> decision failed. This could happen if there is an unhandled decision task pending in the workflow execution.
   *  * <code>ContinueAsNewWorkflowExecutionFailed</code> ? A <code>ContinueAsNewWorkflowExecution</code> decision failed. This could happen if there is an unhandled decision task pending in the workflow execution or the ContinueAsNewWorkflowExecution decision was not configured correctly.
   *  * <code>FailWorkflowExecutionFailed</code> ? A <code>FailWorkflowExecution</code> decision failed. This could happen if there is an unhandled decision task pending in the workflow execution.
   * The preceding error events might occur due to an error in the decider logic, which might put the workflow execution in an unstable state The cause field in the event structure for the error event indicates the cause of the error.
   *
   * '''Note:'''A workflow execution may be closed by the decider by returning one of the following decisions when completing a decision task: <code>CompleteWorkflowExecution</code>, <code>FailWorkflowExecution</code>, <code>CancelWorkflowExecution</code> and <code>ContinueAsNewWorkflowExecution</code>. An <code>UnhandledDecision</code> fault is returned if a workflow closing decision is specified and a signal or activity event had been added to the history while the decision task was being performed by the decider. Unlike the above situations which are logic issues, this fault is always possible because of race conditions in a distributed system. The right action here is to call <a>RespondDecisionTaskCompleted</a> without any decisions. This would result in another decision task with these new events included in the history. The decider should handle the new events and may decide to close the workflow execution.
   * <b>How to Code a Decision</b>
   *  You code a decision by first setting the decision type field to one of the above decision values, and then set the corresponding attributes field shown below:
   * * <code> <a>ScheduleActivityTaskDecisionAttributes</a> </code>
   *  * <code> <a>RequestCancelActivityTaskDecisionAttributes</a> </code>
   *  * <code> <a>CompleteWorkflowExecutionDecisionAttributes</a> </code>
   *  * <code> <a>FailWorkflowExecutionDecisionAttributes</a> </code>
   *  * <code> <a>CancelWorkflowExecutionDecisionAttributes</a> </code>
   *  * <code> <a>ContinueAsNewWorkflowExecutionDecisionAttributes</a> </code>
   *  * <code> <a>RecordMarkerDecisionAttributes</a> </code>
   *  * <code> <a>StartTimerDecisionAttributes</a> </code>
   *  * <code> <a>CancelTimerDecisionAttributes</a> </code>
   *  * <code> <a>SignalExternalWorkflowExecutionDecisionAttributes</a> </code>
   *  * <code> <a>RequestCancelExternalWorkflowExecutionDecisionAttributes</a> </code>
   *  * <code> <a>StartChildWorkflowExecutionDecisionAttributes</a> </code>
   */
  @js.native
  trait Decision extends js.Object {
    var decisionType: DecisionType
    var cancelTimerDecisionAttributes: js.UndefOr[CancelTimerDecisionAttributes]
    var cancelWorkflowExecutionDecisionAttributes: js.UndefOr[CancelWorkflowExecutionDecisionAttributes]
    var completeWorkflowExecutionDecisionAttributes: js.UndefOr[CompleteWorkflowExecutionDecisionAttributes]
    var continueAsNewWorkflowExecutionDecisionAttributes: js.UndefOr[ContinueAsNewWorkflowExecutionDecisionAttributes]
    var failWorkflowExecutionDecisionAttributes: js.UndefOr[FailWorkflowExecutionDecisionAttributes]
    var recordMarkerDecisionAttributes: js.UndefOr[RecordMarkerDecisionAttributes]
    var requestCancelActivityTaskDecisionAttributes: js.UndefOr[RequestCancelActivityTaskDecisionAttributes]
    var requestCancelExternalWorkflowExecutionDecisionAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionDecisionAttributes]
    var scheduleActivityTaskDecisionAttributes: js.UndefOr[ScheduleActivityTaskDecisionAttributes]
    var scheduleLambdaFunctionDecisionAttributes: js.UndefOr[ScheduleLambdaFunctionDecisionAttributes]
    var signalExternalWorkflowExecutionDecisionAttributes: js.UndefOr[SignalExternalWorkflowExecutionDecisionAttributes]
    var startChildWorkflowExecutionDecisionAttributes: js.UndefOr[StartChildWorkflowExecutionDecisionAttributes]
    var startTimerDecisionAttributes: js.UndefOr[StartTimerDecisionAttributes]
  }

  object Decision {
    def apply(
      decisionType: DecisionType,
      cancelTimerDecisionAttributes: js.UndefOr[CancelTimerDecisionAttributes] = js.undefined,
      cancelWorkflowExecutionDecisionAttributes: js.UndefOr[CancelWorkflowExecutionDecisionAttributes] = js.undefined,
      completeWorkflowExecutionDecisionAttributes: js.UndefOr[CompleteWorkflowExecutionDecisionAttributes] = js.undefined,
      continueAsNewWorkflowExecutionDecisionAttributes: js.UndefOr[ContinueAsNewWorkflowExecutionDecisionAttributes] = js.undefined,
      failWorkflowExecutionDecisionAttributes: js.UndefOr[FailWorkflowExecutionDecisionAttributes] = js.undefined,
      recordMarkerDecisionAttributes: js.UndefOr[RecordMarkerDecisionAttributes] = js.undefined,
      requestCancelActivityTaskDecisionAttributes: js.UndefOr[RequestCancelActivityTaskDecisionAttributes] = js.undefined,
      requestCancelExternalWorkflowExecutionDecisionAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionDecisionAttributes] = js.undefined,
      scheduleActivityTaskDecisionAttributes: js.UndefOr[ScheduleActivityTaskDecisionAttributes] = js.undefined,
      scheduleLambdaFunctionDecisionAttributes: js.UndefOr[ScheduleLambdaFunctionDecisionAttributes] = js.undefined,
      signalExternalWorkflowExecutionDecisionAttributes: js.UndefOr[SignalExternalWorkflowExecutionDecisionAttributes] = js.undefined,
      startChildWorkflowExecutionDecisionAttributes: js.UndefOr[StartChildWorkflowExecutionDecisionAttributes] = js.undefined,
      startTimerDecisionAttributes: js.UndefOr[StartTimerDecisionAttributes] = js.undefined): Decision = {
      val _fields = IndexedSeq[(String, js.Any)](
        "decisionType" -> decisionType.asInstanceOf[js.Any],
        "cancelTimerDecisionAttributes" -> cancelTimerDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "cancelWorkflowExecutionDecisionAttributes" -> cancelWorkflowExecutionDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "completeWorkflowExecutionDecisionAttributes" -> completeWorkflowExecutionDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "continueAsNewWorkflowExecutionDecisionAttributes" -> continueAsNewWorkflowExecutionDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "failWorkflowExecutionDecisionAttributes" -> failWorkflowExecutionDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "recordMarkerDecisionAttributes" -> recordMarkerDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "requestCancelActivityTaskDecisionAttributes" -> requestCancelActivityTaskDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "requestCancelExternalWorkflowExecutionDecisionAttributes" -> requestCancelExternalWorkflowExecutionDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "scheduleActivityTaskDecisionAttributes" -> scheduleActivityTaskDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "scheduleLambdaFunctionDecisionAttributes" -> scheduleLambdaFunctionDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "signalExternalWorkflowExecutionDecisionAttributes" -> signalExternalWorkflowExecutionDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "startChildWorkflowExecutionDecisionAttributes" -> startChildWorkflowExecutionDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "startTimerDecisionAttributes" -> startTimerDecisionAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Decision]
    }
  }

  /**
   * A structure that represents a decision task. Decision tasks are sent to deciders in order for them to make decisions.
   */
  @js.native
  trait DecisionTask extends js.Object {
    var events: HistoryEventList
    var startedEventId: EventId
    var taskToken: TaskToken
    var workflowExecution: WorkflowExecution
    var workflowType: WorkflowType
    var nextPageToken: js.UndefOr[PageToken]
    var previousStartedEventId: js.UndefOr[EventId]
  }

  object DecisionTask {
    def apply(
      events: HistoryEventList,
      startedEventId: EventId,
      taskToken: TaskToken,
      workflowExecution: WorkflowExecution,
      workflowType: WorkflowType,
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      previousStartedEventId: js.UndefOr[EventId] = js.undefined): DecisionTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        "events" -> events.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "taskToken" -> taskToken.asInstanceOf[js.Any],
        "workflowExecution" -> workflowExecution.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any],
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] },
        "previousStartedEventId" -> previousStartedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecisionTask]
    }
  }

  /**
   * Provides the details of the <code>DecisionTaskCompleted</code> event.
   */
  @js.native
  trait DecisionTaskCompletedEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var executionContext: js.UndefOr[Data]
  }

  object DecisionTaskCompletedEventAttributes {
    def apply(
      scheduledEventId: EventId,
      startedEventId: EventId,
      executionContext: js.UndefOr[Data] = js.undefined): DecisionTaskCompletedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "executionContext" -> executionContext.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecisionTaskCompletedEventAttributes]
    }
  }

  /**
   * Provides details about the <code>DecisionTaskScheduled</code> event.
   */
  @js.native
  trait DecisionTaskScheduledEventAttributes extends js.Object {
    var taskList: TaskList
    var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var taskPriority: js.UndefOr[TaskPriority]
  }

  object DecisionTaskScheduledEventAttributes {
    def apply(
      taskList: TaskList,
      startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined): DecisionTaskScheduledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskList" -> taskList.asInstanceOf[js.Any],
        "startToCloseTimeout" -> startToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "taskPriority" -> taskPriority.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecisionTaskScheduledEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>DecisionTaskStarted</code> event.
   */
  @js.native
  trait DecisionTaskStartedEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var identity: js.UndefOr[Identity]
  }

  object DecisionTaskStartedEventAttributes {
    def apply(
      scheduledEventId: EventId,
      identity: js.UndefOr[Identity] = js.undefined): DecisionTaskStartedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any],
        "identity" -> identity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecisionTaskStartedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>DecisionTaskTimedOut</code> event.
   */
  @js.native
  trait DecisionTaskTimedOutEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var timeoutType: DecisionTaskTimeoutType
  }

  object DecisionTaskTimedOutEventAttributes {
    def apply(
      scheduledEventId: EventId,
      startedEventId: EventId,
      timeoutType: DecisionTaskTimeoutType): DecisionTaskTimedOutEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "timeoutType" -> timeoutType.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecisionTaskTimedOutEventAttributes]
    }
  }

  object DecisionTaskTimeoutTypeEnum {
    val START_TO_CLOSE = "START_TO_CLOSE"

    val values = IndexedSeq(START_TO_CLOSE)
  }

  object DecisionTypeEnum {
    val ScheduleActivityTask = "ScheduleActivityTask"
    val RequestCancelActivityTask = "RequestCancelActivityTask"
    val CompleteWorkflowExecution = "CompleteWorkflowExecution"
    val FailWorkflowExecution = "FailWorkflowExecution"
    val CancelWorkflowExecution = "CancelWorkflowExecution"
    val ContinueAsNewWorkflowExecution = "ContinueAsNewWorkflowExecution"
    val RecordMarker = "RecordMarker"
    val StartTimer = "StartTimer"
    val CancelTimer = "CancelTimer"
    val SignalExternalWorkflowExecution = "SignalExternalWorkflowExecution"
    val RequestCancelExternalWorkflowExecution = "RequestCancelExternalWorkflowExecution"
    val StartChildWorkflowExecution = "StartChildWorkflowExecution"
    val ScheduleLambdaFunction = "ScheduleLambdaFunction"

    val values = IndexedSeq(ScheduleActivityTask, RequestCancelActivityTask, CompleteWorkflowExecution, FailWorkflowExecution, CancelWorkflowExecution, ContinueAsNewWorkflowExecution, RecordMarker, StartTimer, CancelTimer, SignalExternalWorkflowExecution, RequestCancelExternalWorkflowExecution, StartChildWorkflowExecution, ScheduleLambdaFunction)
  }

  /**
   * The <code>StartWorkflowExecution</code> API action was called without the required parameters set.
   *  Some workflow execution parameters, such as the decision <code>taskList</code>, must be set to start the execution. However, these parameters might have been set as defaults when the workflow type was registered. In this case, you can omit these parameters from the <code>StartWorkflowExecution</code> call and Amazon SWF uses the values defined in the workflow type.
   *
   * '''Note:'''If these parameters aren't set and no default parameters were defined in the workflow type, this error is displayed.
   */
  @js.native
  trait DefaultUndefinedFaultException extends js.Object {
    val message: ErrorMessage
  }

  @js.native
  trait DeprecateActivityTypeInput extends js.Object {
    var activityType: ActivityType
    var domain: DomainName
  }

  object DeprecateActivityTypeInput {
    def apply(
      activityType: ActivityType,
      domain: DomainName): DeprecateActivityTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityType" -> activityType.asInstanceOf[js.Any],
        "domain" -> domain.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeprecateActivityTypeInput]
    }
  }

  @js.native
  trait DeprecateDomainInput extends js.Object {
    var name: DomainName
  }

  object DeprecateDomainInput {
    def apply(
      name: DomainName): DeprecateDomainInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeprecateDomainInput]
    }
  }

  @js.native
  trait DeprecateWorkflowTypeInput extends js.Object {
    var domain: DomainName
    var workflowType: WorkflowType
  }

  object DeprecateWorkflowTypeInput {
    def apply(
      domain: DomainName,
      workflowType: WorkflowType): DeprecateWorkflowTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeprecateWorkflowTypeInput]
    }
  }

  @js.native
  trait DescribeActivityTypeInput extends js.Object {
    var activityType: ActivityType
    var domain: DomainName
  }

  object DescribeActivityTypeInput {
    def apply(
      activityType: ActivityType,
      domain: DomainName): DescribeActivityTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityType" -> activityType.asInstanceOf[js.Any],
        "domain" -> domain.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeActivityTypeInput]
    }
  }

  @js.native
  trait DescribeDomainInput extends js.Object {
    var name: DomainName
  }

  object DescribeDomainInput {
    def apply(
      name: DomainName): DescribeDomainInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDomainInput]
    }
  }

  @js.native
  trait DescribeWorkflowExecutionInput extends js.Object {
    var domain: DomainName
    var execution: WorkflowExecution
  }

  object DescribeWorkflowExecutionInput {
    def apply(
      domain: DomainName,
      execution: WorkflowExecution): DescribeWorkflowExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.asInstanceOf[js.Any],
        "execution" -> execution.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkflowExecutionInput]
    }
  }

  @js.native
  trait DescribeWorkflowTypeInput extends js.Object {
    var domain: DomainName
    var workflowType: WorkflowType
  }

  object DescribeWorkflowTypeInput {
    def apply(
      domain: DomainName,
      workflowType: WorkflowType): DescribeWorkflowTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkflowTypeInput]
    }
  }

  /**
   * Returned if the specified domain already exists. You get this fault even if the existing domain is in deprecated status.
   */
  @js.native
  trait DomainAlreadyExistsFaultException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * Contains the configuration settings of a domain.
   */
  @js.native
  trait DomainConfiguration extends js.Object {
    var workflowExecutionRetentionPeriodInDays: DurationInDays
  }

  object DomainConfiguration {
    def apply(
      workflowExecutionRetentionPeriodInDays: DurationInDays): DomainConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowExecutionRetentionPeriodInDays" -> workflowExecutionRetentionPeriodInDays.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainConfiguration]
    }
  }

  /**
   * Returned when the specified domain has been deprecated.
   */
  @js.native
  trait DomainDeprecatedFaultException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * Contains details of a domain.
   */
  @js.native
  trait DomainDetail extends js.Object {
    var configuration: DomainConfiguration
    var domainInfo: DomainInfo
  }

  object DomainDetail {
    def apply(
      configuration: DomainConfiguration,
      domainInfo: DomainInfo): DomainDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configuration" -> configuration.asInstanceOf[js.Any],
        "domainInfo" -> domainInfo.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainDetail]
    }
  }

  /**
   * Contains general information about a domain.
   */
  @js.native
  trait DomainInfo extends js.Object {
    var name: DomainName
    var status: RegistrationStatus
    var description: js.UndefOr[Description]
  }

  object DomainInfo {
    def apply(
      name: DomainName,
      status: RegistrationStatus,
      description: js.UndefOr[Description] = js.undefined): DomainInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainInfo]
    }
  }

  /**
   * Contains a paginated collection of DomainInfo structures.
   */
  @js.native
  trait DomainInfos extends js.Object {
    var domainInfos: DomainInfoList
    var nextPageToken: js.UndefOr[PageToken]
  }

  object DomainInfos {
    def apply(
      domainInfos: DomainInfoList,
      nextPageToken: js.UndefOr[PageToken] = js.undefined): DomainInfos = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainInfos" -> domainInfos.asInstanceOf[js.Any],
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainInfos]
    }
  }

  object EventTypeEnum {
    val WorkflowExecutionStarted = "WorkflowExecutionStarted"
    val WorkflowExecutionCancelRequested = "WorkflowExecutionCancelRequested"
    val WorkflowExecutionCompleted = "WorkflowExecutionCompleted"
    val CompleteWorkflowExecutionFailed = "CompleteWorkflowExecutionFailed"
    val WorkflowExecutionFailed = "WorkflowExecutionFailed"
    val FailWorkflowExecutionFailed = "FailWorkflowExecutionFailed"
    val WorkflowExecutionTimedOut = "WorkflowExecutionTimedOut"
    val WorkflowExecutionCanceled = "WorkflowExecutionCanceled"
    val CancelWorkflowExecutionFailed = "CancelWorkflowExecutionFailed"
    val WorkflowExecutionContinuedAsNew = "WorkflowExecutionContinuedAsNew"
    val ContinueAsNewWorkflowExecutionFailed = "ContinueAsNewWorkflowExecutionFailed"
    val WorkflowExecutionTerminated = "WorkflowExecutionTerminated"
    val DecisionTaskScheduled = "DecisionTaskScheduled"
    val DecisionTaskStarted = "DecisionTaskStarted"
    val DecisionTaskCompleted = "DecisionTaskCompleted"
    val DecisionTaskTimedOut = "DecisionTaskTimedOut"
    val ActivityTaskScheduled = "ActivityTaskScheduled"
    val ScheduleActivityTaskFailed = "ScheduleActivityTaskFailed"
    val ActivityTaskStarted = "ActivityTaskStarted"
    val ActivityTaskCompleted = "ActivityTaskCompleted"
    val ActivityTaskFailed = "ActivityTaskFailed"
    val ActivityTaskTimedOut = "ActivityTaskTimedOut"
    val ActivityTaskCanceled = "ActivityTaskCanceled"
    val ActivityTaskCancelRequested = "ActivityTaskCancelRequested"
    val RequestCancelActivityTaskFailed = "RequestCancelActivityTaskFailed"
    val WorkflowExecutionSignaled = "WorkflowExecutionSignaled"
    val MarkerRecorded = "MarkerRecorded"
    val RecordMarkerFailed = "RecordMarkerFailed"
    val TimerStarted = "TimerStarted"
    val StartTimerFailed = "StartTimerFailed"
    val TimerFired = "TimerFired"
    val TimerCanceled = "TimerCanceled"
    val CancelTimerFailed = "CancelTimerFailed"
    val StartChildWorkflowExecutionInitiated = "StartChildWorkflowExecutionInitiated"
    val StartChildWorkflowExecutionFailed = "StartChildWorkflowExecutionFailed"
    val ChildWorkflowExecutionStarted = "ChildWorkflowExecutionStarted"
    val ChildWorkflowExecutionCompleted = "ChildWorkflowExecutionCompleted"
    val ChildWorkflowExecutionFailed = "ChildWorkflowExecutionFailed"
    val ChildWorkflowExecutionTimedOut = "ChildWorkflowExecutionTimedOut"
    val ChildWorkflowExecutionCanceled = "ChildWorkflowExecutionCanceled"
    val ChildWorkflowExecutionTerminated = "ChildWorkflowExecutionTerminated"
    val SignalExternalWorkflowExecutionInitiated = "SignalExternalWorkflowExecutionInitiated"
    val SignalExternalWorkflowExecutionFailed = "SignalExternalWorkflowExecutionFailed"
    val ExternalWorkflowExecutionSignaled = "ExternalWorkflowExecutionSignaled"
    val RequestCancelExternalWorkflowExecutionInitiated = "RequestCancelExternalWorkflowExecutionInitiated"
    val RequestCancelExternalWorkflowExecutionFailed = "RequestCancelExternalWorkflowExecutionFailed"
    val ExternalWorkflowExecutionCancelRequested = "ExternalWorkflowExecutionCancelRequested"
    val LambdaFunctionScheduled = "LambdaFunctionScheduled"
    val LambdaFunctionStarted = "LambdaFunctionStarted"
    val LambdaFunctionCompleted = "LambdaFunctionCompleted"
    val LambdaFunctionFailed = "LambdaFunctionFailed"
    val LambdaFunctionTimedOut = "LambdaFunctionTimedOut"
    val ScheduleLambdaFunctionFailed = "ScheduleLambdaFunctionFailed"
    val StartLambdaFunctionFailed = "StartLambdaFunctionFailed"

    val values = IndexedSeq(WorkflowExecutionStarted, WorkflowExecutionCancelRequested, WorkflowExecutionCompleted, CompleteWorkflowExecutionFailed, WorkflowExecutionFailed, FailWorkflowExecutionFailed, WorkflowExecutionTimedOut, WorkflowExecutionCanceled, CancelWorkflowExecutionFailed, WorkflowExecutionContinuedAsNew, ContinueAsNewWorkflowExecutionFailed, WorkflowExecutionTerminated, DecisionTaskScheduled, DecisionTaskStarted, DecisionTaskCompleted, DecisionTaskTimedOut, ActivityTaskScheduled, ScheduleActivityTaskFailed, ActivityTaskStarted, ActivityTaskCompleted, ActivityTaskFailed, ActivityTaskTimedOut, ActivityTaskCanceled, ActivityTaskCancelRequested, RequestCancelActivityTaskFailed, WorkflowExecutionSignaled, MarkerRecorded, RecordMarkerFailed, TimerStarted, StartTimerFailed, TimerFired, TimerCanceled, CancelTimerFailed, StartChildWorkflowExecutionInitiated, StartChildWorkflowExecutionFailed, ChildWorkflowExecutionStarted, ChildWorkflowExecutionCompleted, ChildWorkflowExecutionFailed, ChildWorkflowExecutionTimedOut, ChildWorkflowExecutionCanceled, ChildWorkflowExecutionTerminated, SignalExternalWorkflowExecutionInitiated, SignalExternalWorkflowExecutionFailed, ExternalWorkflowExecutionSignaled, RequestCancelExternalWorkflowExecutionInitiated, RequestCancelExternalWorkflowExecutionFailed, ExternalWorkflowExecutionCancelRequested, LambdaFunctionScheduled, LambdaFunctionStarted, LambdaFunctionCompleted, LambdaFunctionFailed, LambdaFunctionTimedOut, ScheduleLambdaFunctionFailed, StartLambdaFunctionFailed)
  }

  object ExecutionStatusEnum {
    val OPEN = "OPEN"
    val CLOSED = "CLOSED"

    val values = IndexedSeq(OPEN, CLOSED)
  }

  /**
   * Used to filter the workflow executions in visibility APIs by various time-based rules. Each parameter, if specified, defines a rule that must be satisfied by each returned query result. The parameter values are in the <a href="https://en.wikipedia.org/wiki/Unix_time">Unix Time format</a>. For example: <code>"oldestDate": 1325376070.</code>
   */
  @js.native
  trait ExecutionTimeFilter extends js.Object {
    var oldestDate: Timestamp
    var latestDate: js.UndefOr[Timestamp]
  }

  object ExecutionTimeFilter {
    def apply(
      oldestDate: Timestamp,
      latestDate: js.UndefOr[Timestamp] = js.undefined): ExecutionTimeFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "oldestDate" -> oldestDate.asInstanceOf[js.Any],
        "latestDate" -> latestDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecutionTimeFilter]
    }
  }

  /**
   * Provides the details of the <code>ExternalWorkflowExecutionCancelRequested</code> event.
   */
  @js.native
  trait ExternalWorkflowExecutionCancelRequestedEventAttributes extends js.Object {
    var initiatedEventId: EventId
    var workflowExecution: WorkflowExecution
  }

  object ExternalWorkflowExecutionCancelRequestedEventAttributes {
    def apply(
      initiatedEventId: EventId,
      workflowExecution: WorkflowExecution): ExternalWorkflowExecutionCancelRequestedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "workflowExecution" -> workflowExecution.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExternalWorkflowExecutionCancelRequestedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>ExternalWorkflowExecutionSignaled</code> event.
   */
  @js.native
  trait ExternalWorkflowExecutionSignaledEventAttributes extends js.Object {
    var initiatedEventId: EventId
    var workflowExecution: WorkflowExecution
  }

  object ExternalWorkflowExecutionSignaledEventAttributes {
    def apply(
      initiatedEventId: EventId,
      workflowExecution: WorkflowExecution): ExternalWorkflowExecutionSignaledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "workflowExecution" -> workflowExecution.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExternalWorkflowExecutionSignaledEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>FailWorkflowExecution</code> decision.
   *  <b>Access Control</b>
   *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
   * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
   *  * Use an <code>Action</code> element to allow or deny permission to call this action.
   *  * You cannot use an IAM policy to constrain this action's parameters.
   * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
   */
  @js.native
  trait FailWorkflowExecutionDecisionAttributes extends js.Object {
    var details: js.UndefOr[Data]
    var reason: js.UndefOr[FailureReason]
  }

  object FailWorkflowExecutionDecisionAttributes {
    def apply(
      details: js.UndefOr[Data] = js.undefined,
      reason: js.UndefOr[FailureReason] = js.undefined): FailWorkflowExecutionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "details" -> details.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailWorkflowExecutionDecisionAttributes]
    }
  }

  object FailWorkflowExecutionFailedCauseEnum {
    val UNHANDLED_DECISION = "UNHANDLED_DECISION"
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(UNHANDLED_DECISION, OPERATION_NOT_PERMITTED)
  }

  /**
   * Provides the details of the <code>FailWorkflowExecutionFailed</code> event.
   */
  @js.native
  trait FailWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: FailWorkflowExecutionFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  object FailWorkflowExecutionFailedEventAttributes {
    def apply(
      cause: FailWorkflowExecutionFailedCause,
      decisionTaskCompletedEventId: EventId): FailWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailWorkflowExecutionFailedEventAttributes]
    }
  }

  @js.native
  trait GetWorkflowExecutionHistoryInput extends js.Object {
    var domain: DomainName
    var execution: WorkflowExecution
    var maximumPageSize: js.UndefOr[PageSize]
    var nextPageToken: js.UndefOr[PageToken]
    var reverseOrder: js.UndefOr[ReverseOrder]
  }

  object GetWorkflowExecutionHistoryInput {
    def apply(
      domain: DomainName,
      execution: WorkflowExecution,
      maximumPageSize: js.UndefOr[PageSize] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      reverseOrder: js.UndefOr[ReverseOrder] = js.undefined): GetWorkflowExecutionHistoryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.asInstanceOf[js.Any],
        "execution" -> execution.asInstanceOf[js.Any],
        "maximumPageSize" -> maximumPageSize.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] },
        "reverseOrder" -> reverseOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetWorkflowExecutionHistoryInput]
    }
  }

  /**
   * Paginated representation of a workflow history for a workflow execution. This is the up to date, complete and authoritative record of the events related to all tasks and events in the life of the workflow execution.
   */
  @js.native
  trait History extends js.Object {
    var events: HistoryEventList
    var nextPageToken: js.UndefOr[PageToken]
  }

  object History {
    def apply(
      events: HistoryEventList,
      nextPageToken: js.UndefOr[PageToken] = js.undefined): History = {
      val _fields = IndexedSeq[(String, js.Any)](
        "events" -> events.asInstanceOf[js.Any],
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[History]
    }
  }

  /**
   * Event within a workflow execution. A history event can be one of these types:
   * * <code>ActivityTaskCancelRequested</code> ? A <code>RequestCancelActivityTask</code> decision was received by the system.
   *  * <code>ActivityTaskCanceled</code> ? The activity task was successfully canceled.
   *  * <code>ActivityTaskCompleted</code> ? An activity worker successfully completed an activity task by calling <a>RespondActivityTaskCompleted</a>.
   *  * <code>ActivityTaskFailed</code> ? An activity worker failed an activity task by calling <a>RespondActivityTaskFailed</a>.
   *  * <code>ActivityTaskScheduled</code> ? An activity task was scheduled for execution.
   *  * <code>ActivityTaskStarted</code> ? The scheduled activity task was dispatched to a worker.
   *  * <code>ActivityTaskTimedOut</code> ? The activity task timed out.
   *  * <code>CancelTimerFailed</code> ? Failed to process CancelTimer decision. This happens when the decision isn't configured properly, for example no timer exists with the specified timer Id.
   *  * <code>CancelWorkflowExecutionFailed</code> ? A request to cancel a workflow execution failed.
   *  * <code>ChildWorkflowExecutionCanceled</code> ? A child workflow execution, started by this workflow execution, was canceled and closed.
   *  * <code>ChildWorkflowExecutionCompleted</code> ? A child workflow execution, started by this workflow execution, completed successfully and was closed.
   *  * <code>ChildWorkflowExecutionFailed</code> ? A child workflow execution, started by this workflow execution, failed to complete successfully and was closed.
   *  * <code>ChildWorkflowExecutionStarted</code> ? A child workflow execution was successfully started.
   *  * <code>ChildWorkflowExecutionTerminated</code> ? A child workflow execution, started by this workflow execution, was terminated.
   *  * <code>ChildWorkflowExecutionTimedOut</code> ? A child workflow execution, started by this workflow execution, timed out and was closed.
   *  * <code>CompleteWorkflowExecutionFailed</code> ? The workflow execution failed to complete.
   *  * <code>ContinueAsNewWorkflowExecutionFailed</code> ? The workflow execution failed to complete after being continued as a new workflow execution.
   *  * <code>DecisionTaskCompleted</code> ? The decider successfully completed a decision task by calling <a>RespondDecisionTaskCompleted</a>.
   *  * <code>DecisionTaskScheduled</code> ? A decision task was scheduled for the workflow execution.
   *  * <code>DecisionTaskStarted</code> ? The decision task was dispatched to a decider.
   *  * <code>DecisionTaskTimedOut</code> ? The decision task timed out.
   *  * <code>ExternalWorkflowExecutionCancelRequested</code> ? Request to cancel an external workflow execution was successfully delivered to the target execution.
   *  * <code>ExternalWorkflowExecutionSignaled</code> ? A signal, requested by this workflow execution, was successfully delivered to the target external workflow execution.
   *  * <code>FailWorkflowExecutionFailed</code> ? A request to mark a workflow execution as failed, itself failed.
   *  * <code>MarkerRecorded</code> ? A marker was recorded in the workflow history as the result of a <code>RecordMarker</code> decision.
   *  * <code>RecordMarkerFailed</code> ? A <code>RecordMarker</code> decision was returned as failed.
   *  * <code>RequestCancelActivityTaskFailed</code> ? Failed to process RequestCancelActivityTask decision. This happens when the decision isn't configured properly.
   *  * <code>RequestCancelExternalWorkflowExecutionFailed</code> ? Request to cancel an external workflow execution failed.
   *  * <code>RequestCancelExternalWorkflowExecutionInitiated</code> ? A request was made to request the cancellation of an external workflow execution.
   *  * <code>ScheduleActivityTaskFailed</code> ? Failed to process ScheduleActivityTask decision. This happens when the decision isn't configured properly, for example the activity type specified isn't registered.
   *  * <code>SignalExternalWorkflowExecutionFailed</code> ? The request to signal an external workflow execution failed.
   *  * <code>SignalExternalWorkflowExecutionInitiated</code> ? A request to signal an external workflow was made.
   *  * <code>StartActivityTaskFailed</code> ? A scheduled activity task failed to start.
   *  * <code>StartChildWorkflowExecutionFailed</code> ? Failed to process StartChildWorkflowExecution decision. This happens when the decision isn't configured properly, for example the workflow type specified isn't registered.
   *  * <code>StartChildWorkflowExecutionInitiated</code> ? A request was made to start a child workflow execution.
   *  * <code>StartTimerFailed</code> ? Failed to process StartTimer decision. This happens when the decision isn't configured properly, for example a timer already exists with the specified timer Id.
   *  * <code>TimerCanceled</code> ? A timer, previously started for this workflow execution, was successfully canceled.
   *  * <code>TimerFired</code> ? A timer, previously started for this workflow execution, fired.
   *  * <code>TimerStarted</code> ? A timer was started for the workflow execution due to a <code>StartTimer</code> decision.
   *  * <code>WorkflowExecutionCancelRequested</code> ? A request to cancel this workflow execution was made.
   *  * <code>WorkflowExecutionCanceled</code> ? The workflow execution was successfully canceled and closed.
   *  * <code>WorkflowExecutionCompleted</code> ? The workflow execution was closed due to successful completion.
   *  * <code>WorkflowExecutionContinuedAsNew</code> ? The workflow execution was closed and a new execution of the same type was created with the same workflowId.
   *  * <code>WorkflowExecutionFailed</code> ? The workflow execution closed due to a failure.
   *  * <code>WorkflowExecutionSignaled</code> ? An external signal was received for the workflow execution.
   *  * <code>WorkflowExecutionStarted</code> ? The workflow execution was started.
   *  * <code>WorkflowExecutionTerminated</code> ? The workflow execution was terminated.
   *  * <code>WorkflowExecutionTimedOut</code> ? The workflow execution was closed because a time out was exceeded.
   */
  @js.native
  trait HistoryEvent extends js.Object {
    var eventId: EventId
    var eventTimestamp: Timestamp
    var eventType: EventType
    var activityTaskCancelRequestedEventAttributes: js.UndefOr[ActivityTaskCancelRequestedEventAttributes]
    var activityTaskCanceledEventAttributes: js.UndefOr[ActivityTaskCanceledEventAttributes]
    var activityTaskCompletedEventAttributes: js.UndefOr[ActivityTaskCompletedEventAttributes]
    var activityTaskFailedEventAttributes: js.UndefOr[ActivityTaskFailedEventAttributes]
    var activityTaskScheduledEventAttributes: js.UndefOr[ActivityTaskScheduledEventAttributes]
    var activityTaskStartedEventAttributes: js.UndefOr[ActivityTaskStartedEventAttributes]
    var activityTaskTimedOutEventAttributes: js.UndefOr[ActivityTaskTimedOutEventAttributes]
    var cancelTimerFailedEventAttributes: js.UndefOr[CancelTimerFailedEventAttributes]
    var cancelWorkflowExecutionFailedEventAttributes: js.UndefOr[CancelWorkflowExecutionFailedEventAttributes]
    var childWorkflowExecutionCanceledEventAttributes: js.UndefOr[ChildWorkflowExecutionCanceledEventAttributes]
    var childWorkflowExecutionCompletedEventAttributes: js.UndefOr[ChildWorkflowExecutionCompletedEventAttributes]
    var childWorkflowExecutionFailedEventAttributes: js.UndefOr[ChildWorkflowExecutionFailedEventAttributes]
    var childWorkflowExecutionStartedEventAttributes: js.UndefOr[ChildWorkflowExecutionStartedEventAttributes]
    var childWorkflowExecutionTerminatedEventAttributes: js.UndefOr[ChildWorkflowExecutionTerminatedEventAttributes]
    var childWorkflowExecutionTimedOutEventAttributes: js.UndefOr[ChildWorkflowExecutionTimedOutEventAttributes]
    var completeWorkflowExecutionFailedEventAttributes: js.UndefOr[CompleteWorkflowExecutionFailedEventAttributes]
    var continueAsNewWorkflowExecutionFailedEventAttributes: js.UndefOr[ContinueAsNewWorkflowExecutionFailedEventAttributes]
    var decisionTaskCompletedEventAttributes: js.UndefOr[DecisionTaskCompletedEventAttributes]
    var decisionTaskScheduledEventAttributes: js.UndefOr[DecisionTaskScheduledEventAttributes]
    var decisionTaskStartedEventAttributes: js.UndefOr[DecisionTaskStartedEventAttributes]
    var decisionTaskTimedOutEventAttributes: js.UndefOr[DecisionTaskTimedOutEventAttributes]
    var externalWorkflowExecutionCancelRequestedEventAttributes: js.UndefOr[ExternalWorkflowExecutionCancelRequestedEventAttributes]
    var externalWorkflowExecutionSignaledEventAttributes: js.UndefOr[ExternalWorkflowExecutionSignaledEventAttributes]
    var failWorkflowExecutionFailedEventAttributes: js.UndefOr[FailWorkflowExecutionFailedEventAttributes]
    var lambdaFunctionCompletedEventAttributes: js.UndefOr[LambdaFunctionCompletedEventAttributes]
    var lambdaFunctionFailedEventAttributes: js.UndefOr[LambdaFunctionFailedEventAttributes]
    var lambdaFunctionScheduledEventAttributes: js.UndefOr[LambdaFunctionScheduledEventAttributes]
    var lambdaFunctionStartedEventAttributes: js.UndefOr[LambdaFunctionStartedEventAttributes]
    var lambdaFunctionTimedOutEventAttributes: js.UndefOr[LambdaFunctionTimedOutEventAttributes]
    var markerRecordedEventAttributes: js.UndefOr[MarkerRecordedEventAttributes]
    var recordMarkerFailedEventAttributes: js.UndefOr[RecordMarkerFailedEventAttributes]
    var requestCancelActivityTaskFailedEventAttributes: js.UndefOr[RequestCancelActivityTaskFailedEventAttributes]
    var requestCancelExternalWorkflowExecutionFailedEventAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionFailedEventAttributes]
    var requestCancelExternalWorkflowExecutionInitiatedEventAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionInitiatedEventAttributes]
    var scheduleActivityTaskFailedEventAttributes: js.UndefOr[ScheduleActivityTaskFailedEventAttributes]
    var scheduleLambdaFunctionFailedEventAttributes: js.UndefOr[ScheduleLambdaFunctionFailedEventAttributes]
    var signalExternalWorkflowExecutionFailedEventAttributes: js.UndefOr[SignalExternalWorkflowExecutionFailedEventAttributes]
    var signalExternalWorkflowExecutionInitiatedEventAttributes: js.UndefOr[SignalExternalWorkflowExecutionInitiatedEventAttributes]
    var startChildWorkflowExecutionFailedEventAttributes: js.UndefOr[StartChildWorkflowExecutionFailedEventAttributes]
    var startChildWorkflowExecutionInitiatedEventAttributes: js.UndefOr[StartChildWorkflowExecutionInitiatedEventAttributes]
    var startLambdaFunctionFailedEventAttributes: js.UndefOr[StartLambdaFunctionFailedEventAttributes]
    var startTimerFailedEventAttributes: js.UndefOr[StartTimerFailedEventAttributes]
    var timerCanceledEventAttributes: js.UndefOr[TimerCanceledEventAttributes]
    var timerFiredEventAttributes: js.UndefOr[TimerFiredEventAttributes]
    var timerStartedEventAttributes: js.UndefOr[TimerStartedEventAttributes]
    var workflowExecutionCancelRequestedEventAttributes: js.UndefOr[WorkflowExecutionCancelRequestedEventAttributes]
    var workflowExecutionCanceledEventAttributes: js.UndefOr[WorkflowExecutionCanceledEventAttributes]
    var workflowExecutionCompletedEventAttributes: js.UndefOr[WorkflowExecutionCompletedEventAttributes]
    var workflowExecutionContinuedAsNewEventAttributes: js.UndefOr[WorkflowExecutionContinuedAsNewEventAttributes]
    var workflowExecutionFailedEventAttributes: js.UndefOr[WorkflowExecutionFailedEventAttributes]
    var workflowExecutionSignaledEventAttributes: js.UndefOr[WorkflowExecutionSignaledEventAttributes]
    var workflowExecutionStartedEventAttributes: js.UndefOr[WorkflowExecutionStartedEventAttributes]
    var workflowExecutionTerminatedEventAttributes: js.UndefOr[WorkflowExecutionTerminatedEventAttributes]
    var workflowExecutionTimedOutEventAttributes: js.UndefOr[WorkflowExecutionTimedOutEventAttributes]
  }

  object HistoryEvent {
    def apply(
      eventId: EventId,
      eventTimestamp: Timestamp,
      eventType: EventType,
      activityTaskCancelRequestedEventAttributes: js.UndefOr[ActivityTaskCancelRequestedEventAttributes] = js.undefined,
      activityTaskCanceledEventAttributes: js.UndefOr[ActivityTaskCanceledEventAttributes] = js.undefined,
      activityTaskCompletedEventAttributes: js.UndefOr[ActivityTaskCompletedEventAttributes] = js.undefined,
      activityTaskFailedEventAttributes: js.UndefOr[ActivityTaskFailedEventAttributes] = js.undefined,
      activityTaskScheduledEventAttributes: js.UndefOr[ActivityTaskScheduledEventAttributes] = js.undefined,
      activityTaskStartedEventAttributes: js.UndefOr[ActivityTaskStartedEventAttributes] = js.undefined,
      activityTaskTimedOutEventAttributes: js.UndefOr[ActivityTaskTimedOutEventAttributes] = js.undefined,
      cancelTimerFailedEventAttributes: js.UndefOr[CancelTimerFailedEventAttributes] = js.undefined,
      cancelWorkflowExecutionFailedEventAttributes: js.UndefOr[CancelWorkflowExecutionFailedEventAttributes] = js.undefined,
      childWorkflowExecutionCanceledEventAttributes: js.UndefOr[ChildWorkflowExecutionCanceledEventAttributes] = js.undefined,
      childWorkflowExecutionCompletedEventAttributes: js.UndefOr[ChildWorkflowExecutionCompletedEventAttributes] = js.undefined,
      childWorkflowExecutionFailedEventAttributes: js.UndefOr[ChildWorkflowExecutionFailedEventAttributes] = js.undefined,
      childWorkflowExecutionStartedEventAttributes: js.UndefOr[ChildWorkflowExecutionStartedEventAttributes] = js.undefined,
      childWorkflowExecutionTerminatedEventAttributes: js.UndefOr[ChildWorkflowExecutionTerminatedEventAttributes] = js.undefined,
      childWorkflowExecutionTimedOutEventAttributes: js.UndefOr[ChildWorkflowExecutionTimedOutEventAttributes] = js.undefined,
      completeWorkflowExecutionFailedEventAttributes: js.UndefOr[CompleteWorkflowExecutionFailedEventAttributes] = js.undefined,
      continueAsNewWorkflowExecutionFailedEventAttributes: js.UndefOr[ContinueAsNewWorkflowExecutionFailedEventAttributes] = js.undefined,
      decisionTaskCompletedEventAttributes: js.UndefOr[DecisionTaskCompletedEventAttributes] = js.undefined,
      decisionTaskScheduledEventAttributes: js.UndefOr[DecisionTaskScheduledEventAttributes] = js.undefined,
      decisionTaskStartedEventAttributes: js.UndefOr[DecisionTaskStartedEventAttributes] = js.undefined,
      decisionTaskTimedOutEventAttributes: js.UndefOr[DecisionTaskTimedOutEventAttributes] = js.undefined,
      externalWorkflowExecutionCancelRequestedEventAttributes: js.UndefOr[ExternalWorkflowExecutionCancelRequestedEventAttributes] = js.undefined,
      externalWorkflowExecutionSignaledEventAttributes: js.UndefOr[ExternalWorkflowExecutionSignaledEventAttributes] = js.undefined,
      failWorkflowExecutionFailedEventAttributes: js.UndefOr[FailWorkflowExecutionFailedEventAttributes] = js.undefined,
      lambdaFunctionCompletedEventAttributes: js.UndefOr[LambdaFunctionCompletedEventAttributes] = js.undefined,
      lambdaFunctionFailedEventAttributes: js.UndefOr[LambdaFunctionFailedEventAttributes] = js.undefined,
      lambdaFunctionScheduledEventAttributes: js.UndefOr[LambdaFunctionScheduledEventAttributes] = js.undefined,
      lambdaFunctionStartedEventAttributes: js.UndefOr[LambdaFunctionStartedEventAttributes] = js.undefined,
      lambdaFunctionTimedOutEventAttributes: js.UndefOr[LambdaFunctionTimedOutEventAttributes] = js.undefined,
      markerRecordedEventAttributes: js.UndefOr[MarkerRecordedEventAttributes] = js.undefined,
      recordMarkerFailedEventAttributes: js.UndefOr[RecordMarkerFailedEventAttributes] = js.undefined,
      requestCancelActivityTaskFailedEventAttributes: js.UndefOr[RequestCancelActivityTaskFailedEventAttributes] = js.undefined,
      requestCancelExternalWorkflowExecutionFailedEventAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionFailedEventAttributes] = js.undefined,
      requestCancelExternalWorkflowExecutionInitiatedEventAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionInitiatedEventAttributes] = js.undefined,
      scheduleActivityTaskFailedEventAttributes: js.UndefOr[ScheduleActivityTaskFailedEventAttributes] = js.undefined,
      scheduleLambdaFunctionFailedEventAttributes: js.UndefOr[ScheduleLambdaFunctionFailedEventAttributes] = js.undefined,
      signalExternalWorkflowExecutionFailedEventAttributes: js.UndefOr[SignalExternalWorkflowExecutionFailedEventAttributes] = js.undefined,
      signalExternalWorkflowExecutionInitiatedEventAttributes: js.UndefOr[SignalExternalWorkflowExecutionInitiatedEventAttributes] = js.undefined,
      startChildWorkflowExecutionFailedEventAttributes: js.UndefOr[StartChildWorkflowExecutionFailedEventAttributes] = js.undefined,
      startChildWorkflowExecutionInitiatedEventAttributes: js.UndefOr[StartChildWorkflowExecutionInitiatedEventAttributes] = js.undefined,
      startLambdaFunctionFailedEventAttributes: js.UndefOr[StartLambdaFunctionFailedEventAttributes] = js.undefined,
      startTimerFailedEventAttributes: js.UndefOr[StartTimerFailedEventAttributes] = js.undefined,
      timerCanceledEventAttributes: js.UndefOr[TimerCanceledEventAttributes] = js.undefined,
      timerFiredEventAttributes: js.UndefOr[TimerFiredEventAttributes] = js.undefined,
      timerStartedEventAttributes: js.UndefOr[TimerStartedEventAttributes] = js.undefined,
      workflowExecutionCancelRequestedEventAttributes: js.UndefOr[WorkflowExecutionCancelRequestedEventAttributes] = js.undefined,
      workflowExecutionCanceledEventAttributes: js.UndefOr[WorkflowExecutionCanceledEventAttributes] = js.undefined,
      workflowExecutionCompletedEventAttributes: js.UndefOr[WorkflowExecutionCompletedEventAttributes] = js.undefined,
      workflowExecutionContinuedAsNewEventAttributes: js.UndefOr[WorkflowExecutionContinuedAsNewEventAttributes] = js.undefined,
      workflowExecutionFailedEventAttributes: js.UndefOr[WorkflowExecutionFailedEventAttributes] = js.undefined,
      workflowExecutionSignaledEventAttributes: js.UndefOr[WorkflowExecutionSignaledEventAttributes] = js.undefined,
      workflowExecutionStartedEventAttributes: js.UndefOr[WorkflowExecutionStartedEventAttributes] = js.undefined,
      workflowExecutionTerminatedEventAttributes: js.UndefOr[WorkflowExecutionTerminatedEventAttributes] = js.undefined,
      workflowExecutionTimedOutEventAttributes: js.UndefOr[WorkflowExecutionTimedOutEventAttributes] = js.undefined): HistoryEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "eventId" -> eventId.asInstanceOf[js.Any],
        "eventTimestamp" -> eventTimestamp.asInstanceOf[js.Any],
        "eventType" -> eventType.asInstanceOf[js.Any],
        "activityTaskCancelRequestedEventAttributes" -> activityTaskCancelRequestedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "activityTaskCanceledEventAttributes" -> activityTaskCanceledEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "activityTaskCompletedEventAttributes" -> activityTaskCompletedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "activityTaskFailedEventAttributes" -> activityTaskFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "activityTaskScheduledEventAttributes" -> activityTaskScheduledEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "activityTaskStartedEventAttributes" -> activityTaskStartedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "activityTaskTimedOutEventAttributes" -> activityTaskTimedOutEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "cancelTimerFailedEventAttributes" -> cancelTimerFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "cancelWorkflowExecutionFailedEventAttributes" -> cancelWorkflowExecutionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "childWorkflowExecutionCanceledEventAttributes" -> childWorkflowExecutionCanceledEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "childWorkflowExecutionCompletedEventAttributes" -> childWorkflowExecutionCompletedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "childWorkflowExecutionFailedEventAttributes" -> childWorkflowExecutionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "childWorkflowExecutionStartedEventAttributes" -> childWorkflowExecutionStartedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "childWorkflowExecutionTerminatedEventAttributes" -> childWorkflowExecutionTerminatedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "childWorkflowExecutionTimedOutEventAttributes" -> childWorkflowExecutionTimedOutEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "completeWorkflowExecutionFailedEventAttributes" -> completeWorkflowExecutionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "continueAsNewWorkflowExecutionFailedEventAttributes" -> continueAsNewWorkflowExecutionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventAttributes" -> decisionTaskCompletedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskScheduledEventAttributes" -> decisionTaskScheduledEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskStartedEventAttributes" -> decisionTaskStartedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskTimedOutEventAttributes" -> decisionTaskTimedOutEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "externalWorkflowExecutionCancelRequestedEventAttributes" -> externalWorkflowExecutionCancelRequestedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "externalWorkflowExecutionSignaledEventAttributes" -> externalWorkflowExecutionSignaledEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "failWorkflowExecutionFailedEventAttributes" -> failWorkflowExecutionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "lambdaFunctionCompletedEventAttributes" -> lambdaFunctionCompletedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "lambdaFunctionFailedEventAttributes" -> lambdaFunctionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "lambdaFunctionScheduledEventAttributes" -> lambdaFunctionScheduledEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "lambdaFunctionStartedEventAttributes" -> lambdaFunctionStartedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "lambdaFunctionTimedOutEventAttributes" -> lambdaFunctionTimedOutEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "markerRecordedEventAttributes" -> markerRecordedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "recordMarkerFailedEventAttributes" -> recordMarkerFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "requestCancelActivityTaskFailedEventAttributes" -> requestCancelActivityTaskFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "requestCancelExternalWorkflowExecutionFailedEventAttributes" -> requestCancelExternalWorkflowExecutionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "requestCancelExternalWorkflowExecutionInitiatedEventAttributes" -> requestCancelExternalWorkflowExecutionInitiatedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "scheduleActivityTaskFailedEventAttributes" -> scheduleActivityTaskFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "scheduleLambdaFunctionFailedEventAttributes" -> scheduleLambdaFunctionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "signalExternalWorkflowExecutionFailedEventAttributes" -> signalExternalWorkflowExecutionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "signalExternalWorkflowExecutionInitiatedEventAttributes" -> signalExternalWorkflowExecutionInitiatedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "startChildWorkflowExecutionFailedEventAttributes" -> startChildWorkflowExecutionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "startChildWorkflowExecutionInitiatedEventAttributes" -> startChildWorkflowExecutionInitiatedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "startLambdaFunctionFailedEventAttributes" -> startLambdaFunctionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "startTimerFailedEventAttributes" -> startTimerFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "timerCanceledEventAttributes" -> timerCanceledEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "timerFiredEventAttributes" -> timerFiredEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "timerStartedEventAttributes" -> timerStartedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "workflowExecutionCancelRequestedEventAttributes" -> workflowExecutionCancelRequestedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "workflowExecutionCanceledEventAttributes" -> workflowExecutionCanceledEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "workflowExecutionCompletedEventAttributes" -> workflowExecutionCompletedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "workflowExecutionContinuedAsNewEventAttributes" -> workflowExecutionContinuedAsNewEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "workflowExecutionFailedEventAttributes" -> workflowExecutionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "workflowExecutionSignaledEventAttributes" -> workflowExecutionSignaledEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "workflowExecutionStartedEventAttributes" -> workflowExecutionStartedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "workflowExecutionTerminatedEventAttributes" -> workflowExecutionTerminatedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "workflowExecutionTimedOutEventAttributes" -> workflowExecutionTimedOutEventAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HistoryEvent]
    }
  }

  /**
   * Provides the details of the <code>LambdaFunctionCompleted</code> event. It isn't set for other event types.
   */
  @js.native
  trait LambdaFunctionCompletedEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var result: js.UndefOr[Data]
  }

  object LambdaFunctionCompletedEventAttributes {
    def apply(
      scheduledEventId: EventId,
      startedEventId: EventId,
      result: js.UndefOr[Data] = js.undefined): LambdaFunctionCompletedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "result" -> result.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionCompletedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>LambdaFunctionFailed</code> event. It isn't set for other event types.
   */
  @js.native
  trait LambdaFunctionFailedEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var details: js.UndefOr[Data]
    var reason: js.UndefOr[FailureReason]
  }

  object LambdaFunctionFailedEventAttributes {
    def apply(
      scheduledEventId: EventId,
      startedEventId: EventId,
      details: js.UndefOr[Data] = js.undefined,
      reason: js.UndefOr[FailureReason] = js.undefined): LambdaFunctionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "details" -> details.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionFailedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>LambdaFunctionScheduled</code> event. It isn't set for other event types.
   */
  @js.native
  trait LambdaFunctionScheduledEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: EventId
    var id: FunctionId
    var name: FunctionName
    var control: js.UndefOr[Data]
    var input: js.UndefOr[FunctionInput]
    var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
  }

  object LambdaFunctionScheduledEventAttributes {
    def apply(
      decisionTaskCompletedEventId: EventId,
      id: FunctionId,
      name: FunctionName,
      control: js.UndefOr[Data] = js.undefined,
      input: js.UndefOr[FunctionInput] = js.undefined,
      startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined): LambdaFunctionScheduledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] },
        "startToCloseTimeout" -> startToCloseTimeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionScheduledEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>LambdaFunctionStarted</code> event. It isn't set for other event types.
   */
  @js.native
  trait LambdaFunctionStartedEventAttributes extends js.Object {
    var scheduledEventId: EventId
  }

  object LambdaFunctionStartedEventAttributes {
    def apply(
      scheduledEventId: EventId): LambdaFunctionStartedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionStartedEventAttributes]
    }
  }

  /**
   * Provides details of the <code>LambdaFunctionTimedOut</code> event.
   */
  @js.native
  trait LambdaFunctionTimedOutEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var timeoutType: js.UndefOr[LambdaFunctionTimeoutType]
  }

  object LambdaFunctionTimedOutEventAttributes {
    def apply(
      scheduledEventId: EventId,
      startedEventId: EventId,
      timeoutType: js.UndefOr[LambdaFunctionTimeoutType] = js.undefined): LambdaFunctionTimedOutEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "timeoutType" -> timeoutType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionTimedOutEventAttributes]
    }
  }

  object LambdaFunctionTimeoutTypeEnum {
    val START_TO_CLOSE = "START_TO_CLOSE"

    val values = IndexedSeq(START_TO_CLOSE)
  }

  /**
   * Returned by any operation if a system imposed limitation has been reached. To address this fault you should either clean up unused resources or increase the limit by contacting AWS.
   */
  @js.native
  trait LimitExceededFaultException extends js.Object {
    val message: ErrorMessage
  }

  @js.native
  trait ListActivityTypesInput extends js.Object {
    var domain: DomainName
    var registrationStatus: RegistrationStatus
    var maximumPageSize: js.UndefOr[PageSize]
    var name: js.UndefOr[Name]
    var nextPageToken: js.UndefOr[PageToken]
    var reverseOrder: js.UndefOr[ReverseOrder]
  }

  object ListActivityTypesInput {
    def apply(
      domain: DomainName,
      registrationStatus: RegistrationStatus,
      maximumPageSize: js.UndefOr[PageSize] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      reverseOrder: js.UndefOr[ReverseOrder] = js.undefined): ListActivityTypesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.asInstanceOf[js.Any],
        "registrationStatus" -> registrationStatus.asInstanceOf[js.Any],
        "maximumPageSize" -> maximumPageSize.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] },
        "reverseOrder" -> reverseOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListActivityTypesInput]
    }
  }

  @js.native
  trait ListClosedWorkflowExecutionsInput extends js.Object {
    var domain: DomainName
    var closeStatusFilter: js.UndefOr[CloseStatusFilter]
    var closeTimeFilter: js.UndefOr[ExecutionTimeFilter]
    var executionFilter: js.UndefOr[WorkflowExecutionFilter]
    var maximumPageSize: js.UndefOr[PageSize]
    var nextPageToken: js.UndefOr[PageToken]
    var reverseOrder: js.UndefOr[ReverseOrder]
    var startTimeFilter: js.UndefOr[ExecutionTimeFilter]
    var tagFilter: js.UndefOr[TagFilter]
    var typeFilter: js.UndefOr[WorkflowTypeFilter]
  }

  object ListClosedWorkflowExecutionsInput {
    def apply(
      domain: DomainName,
      closeStatusFilter: js.UndefOr[CloseStatusFilter] = js.undefined,
      closeTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined,
      executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined,
      maximumPageSize: js.UndefOr[PageSize] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      reverseOrder: js.UndefOr[ReverseOrder] = js.undefined,
      startTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined,
      tagFilter: js.UndefOr[TagFilter] = js.undefined,
      typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined): ListClosedWorkflowExecutionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.asInstanceOf[js.Any],
        "closeStatusFilter" -> closeStatusFilter.map { x => x.asInstanceOf[js.Any] },
        "closeTimeFilter" -> closeTimeFilter.map { x => x.asInstanceOf[js.Any] },
        "executionFilter" -> executionFilter.map { x => x.asInstanceOf[js.Any] },
        "maximumPageSize" -> maximumPageSize.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] },
        "reverseOrder" -> reverseOrder.map { x => x.asInstanceOf[js.Any] },
        "startTimeFilter" -> startTimeFilter.map { x => x.asInstanceOf[js.Any] },
        "tagFilter" -> tagFilter.map { x => x.asInstanceOf[js.Any] },
        "typeFilter" -> typeFilter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClosedWorkflowExecutionsInput]
    }
  }

  @js.native
  trait ListDomainsInput extends js.Object {
    var registrationStatus: RegistrationStatus
    var maximumPageSize: js.UndefOr[PageSize]
    var nextPageToken: js.UndefOr[PageToken]
    var reverseOrder: js.UndefOr[ReverseOrder]
  }

  object ListDomainsInput {
    def apply(
      registrationStatus: RegistrationStatus,
      maximumPageSize: js.UndefOr[PageSize] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      reverseOrder: js.UndefOr[ReverseOrder] = js.undefined): ListDomainsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "registrationStatus" -> registrationStatus.asInstanceOf[js.Any],
        "maximumPageSize" -> maximumPageSize.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] },
        "reverseOrder" -> reverseOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDomainsInput]
    }
  }

  @js.native
  trait ListOpenWorkflowExecutionsInput extends js.Object {
    var domain: DomainName
    var startTimeFilter: ExecutionTimeFilter
    var executionFilter: js.UndefOr[WorkflowExecutionFilter]
    var maximumPageSize: js.UndefOr[PageSize]
    var nextPageToken: js.UndefOr[PageToken]
    var reverseOrder: js.UndefOr[ReverseOrder]
    var tagFilter: js.UndefOr[TagFilter]
    var typeFilter: js.UndefOr[WorkflowTypeFilter]
  }

  object ListOpenWorkflowExecutionsInput {
    def apply(
      domain: DomainName,
      startTimeFilter: ExecutionTimeFilter,
      executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined,
      maximumPageSize: js.UndefOr[PageSize] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      reverseOrder: js.UndefOr[ReverseOrder] = js.undefined,
      tagFilter: js.UndefOr[TagFilter] = js.undefined,
      typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined): ListOpenWorkflowExecutionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.asInstanceOf[js.Any],
        "startTimeFilter" -> startTimeFilter.asInstanceOf[js.Any],
        "executionFilter" -> executionFilter.map { x => x.asInstanceOf[js.Any] },
        "maximumPageSize" -> maximumPageSize.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] },
        "reverseOrder" -> reverseOrder.map { x => x.asInstanceOf[js.Any] },
        "tagFilter" -> tagFilter.map { x => x.asInstanceOf[js.Any] },
        "typeFilter" -> typeFilter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOpenWorkflowExecutionsInput]
    }
  }

  @js.native
  trait ListWorkflowTypesInput extends js.Object {
    var domain: DomainName
    var registrationStatus: RegistrationStatus
    var maximumPageSize: js.UndefOr[PageSize]
    var name: js.UndefOr[Name]
    var nextPageToken: js.UndefOr[PageToken]
    var reverseOrder: js.UndefOr[ReverseOrder]
  }

  object ListWorkflowTypesInput {
    def apply(
      domain: DomainName,
      registrationStatus: RegistrationStatus,
      maximumPageSize: js.UndefOr[PageSize] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      reverseOrder: js.UndefOr[ReverseOrder] = js.undefined): ListWorkflowTypesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.asInstanceOf[js.Any],
        "registrationStatus" -> registrationStatus.asInstanceOf[js.Any],
        "maximumPageSize" -> maximumPageSize.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] },
        "reverseOrder" -> reverseOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListWorkflowTypesInput]
    }
  }

  /**
   * Provides the details of the <code>MarkerRecorded</code> event.
   */
  @js.native
  trait MarkerRecordedEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: EventId
    var markerName: MarkerName
    var details: js.UndefOr[Data]
  }

  object MarkerRecordedEventAttributes {
    def apply(
      decisionTaskCompletedEventId: EventId,
      markerName: MarkerName,
      details: js.UndefOr[Data] = js.undefined): MarkerRecordedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "markerName" -> markerName.asInstanceOf[js.Any],
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MarkerRecordedEventAttributes]
    }
  }

  /**
   * Returned when the caller doesn't have sufficient permissions to invoke the action.
   */
  @js.native
  trait OperationNotPermittedFaultException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * Contains the count of tasks in a task list.
   */
  @js.native
  trait PendingTaskCount extends js.Object {
    var count: Count
    var truncated: js.UndefOr[Truncated]
  }

  object PendingTaskCount {
    def apply(
      count: Count,
      truncated: js.UndefOr[Truncated] = js.undefined): PendingTaskCount = {
      val _fields = IndexedSeq[(String, js.Any)](
        "count" -> count.asInstanceOf[js.Any],
        "truncated" -> truncated.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingTaskCount]
    }
  }

  @js.native
  trait PollForActivityTaskInput extends js.Object {
    var domain: DomainName
    var taskList: TaskList
    var identity: js.UndefOr[Identity]
  }

  object PollForActivityTaskInput {
    def apply(
      domain: DomainName,
      taskList: TaskList,
      identity: js.UndefOr[Identity] = js.undefined): PollForActivityTaskInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.asInstanceOf[js.Any],
        "taskList" -> taskList.asInstanceOf[js.Any],
        "identity" -> identity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PollForActivityTaskInput]
    }
  }

  @js.native
  trait PollForDecisionTaskInput extends js.Object {
    var domain: DomainName
    var taskList: TaskList
    var identity: js.UndefOr[Identity]
    var maximumPageSize: js.UndefOr[PageSize]
    var nextPageToken: js.UndefOr[PageToken]
    var reverseOrder: js.UndefOr[ReverseOrder]
  }

  object PollForDecisionTaskInput {
    def apply(
      domain: DomainName,
      taskList: TaskList,
      identity: js.UndefOr[Identity] = js.undefined,
      maximumPageSize: js.UndefOr[PageSize] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      reverseOrder: js.UndefOr[ReverseOrder] = js.undefined): PollForDecisionTaskInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.asInstanceOf[js.Any],
        "taskList" -> taskList.asInstanceOf[js.Any],
        "identity" -> identity.map { x => x.asInstanceOf[js.Any] },
        "maximumPageSize" -> maximumPageSize.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] },
        "reverseOrder" -> reverseOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PollForDecisionTaskInput]
    }
  }

  @js.native
  trait RecordActivityTaskHeartbeatInput extends js.Object {
    var taskToken: TaskToken
    var details: js.UndefOr[LimitedData]
  }

  object RecordActivityTaskHeartbeatInput {
    def apply(
      taskToken: TaskToken,
      details: js.UndefOr[LimitedData] = js.undefined): RecordActivityTaskHeartbeatInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskToken" -> taskToken.asInstanceOf[js.Any],
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordActivityTaskHeartbeatInput]
    }
  }

  /**
   * Provides the details of the <code>RecordMarker</code> decision.
   *  <b>Access Control</b>
   *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
   * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
   *  * Use an <code>Action</code> element to allow or deny permission to call this action.
   *  * You cannot use an IAM policy to constrain this action's parameters.
   * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
   */
  @js.native
  trait RecordMarkerDecisionAttributes extends js.Object {
    var markerName: MarkerName
    var details: js.UndefOr[Data]
  }

  object RecordMarkerDecisionAttributes {
    def apply(
      markerName: MarkerName,
      details: js.UndefOr[Data] = js.undefined): RecordMarkerDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "markerName" -> markerName.asInstanceOf[js.Any],
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordMarkerDecisionAttributes]
    }
  }

  object RecordMarkerFailedCauseEnum {
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(OPERATION_NOT_PERMITTED)
  }

  /**
   * Provides the details of the <code>RecordMarkerFailed</code> event.
   */
  @js.native
  trait RecordMarkerFailedEventAttributes extends js.Object {
    var cause: RecordMarkerFailedCause
    var decisionTaskCompletedEventId: EventId
    var markerName: MarkerName
  }

  object RecordMarkerFailedEventAttributes {
    def apply(
      cause: RecordMarkerFailedCause,
      decisionTaskCompletedEventId: EventId,
      markerName: MarkerName): RecordMarkerFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "markerName" -> markerName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordMarkerFailedEventAttributes]
    }
  }

  @js.native
  trait RegisterActivityTypeInput extends js.Object {
    var domain: DomainName
    var name: Name
    var version: Version
    var defaultTaskHeartbeatTimeout: js.UndefOr[DurationInSecondsOptional]
    var defaultTaskList: js.UndefOr[TaskList]
    var defaultTaskPriority: js.UndefOr[TaskPriority]
    var defaultTaskScheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var defaultTaskScheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional]
    var defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var description: js.UndefOr[Description]
  }

  object RegisterActivityTypeInput {
    def apply(
      domain: DomainName,
      name: Name,
      version: Version,
      defaultTaskHeartbeatTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      defaultTaskList: js.UndefOr[TaskList] = js.undefined,
      defaultTaskPriority: js.UndefOr[TaskPriority] = js.undefined,
      defaultTaskScheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      defaultTaskScheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      description: js.UndefOr[Description] = js.undefined): RegisterActivityTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any],
        "defaultTaskHeartbeatTimeout" -> defaultTaskHeartbeatTimeout.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskList" -> defaultTaskList.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskPriority" -> defaultTaskPriority.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskScheduleToCloseTimeout" -> defaultTaskScheduleToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskScheduleToStartTimeout" -> defaultTaskScheduleToStartTimeout.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskStartToCloseTimeout" -> defaultTaskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterActivityTypeInput]
    }
  }

  @js.native
  trait RegisterDomainInput extends js.Object {
    var name: DomainName
    var workflowExecutionRetentionPeriodInDays: DurationInDays
    var description: js.UndefOr[Description]
  }

  object RegisterDomainInput {
    def apply(
      name: DomainName,
      workflowExecutionRetentionPeriodInDays: DurationInDays,
      description: js.UndefOr[Description] = js.undefined): RegisterDomainInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any],
        "workflowExecutionRetentionPeriodInDays" -> workflowExecutionRetentionPeriodInDays.asInstanceOf[js.Any],
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterDomainInput]
    }
  }

  @js.native
  trait RegisterWorkflowTypeInput extends js.Object {
    var domain: DomainName
    var name: Name
    var version: Version
    var defaultChildPolicy: js.UndefOr[ChildPolicy]
    var defaultExecutionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var defaultLambdaRole: js.UndefOr[Arn]
    var defaultTaskList: js.UndefOr[TaskList]
    var defaultTaskPriority: js.UndefOr[TaskPriority]
    var defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var description: js.UndefOr[Description]
  }

  object RegisterWorkflowTypeInput {
    def apply(
      domain: DomainName,
      name: Name,
      version: Version,
      defaultChildPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      defaultExecutionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      defaultLambdaRole: js.UndefOr[Arn] = js.undefined,
      defaultTaskList: js.UndefOr[TaskList] = js.undefined,
      defaultTaskPriority: js.UndefOr[TaskPriority] = js.undefined,
      defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      description: js.UndefOr[Description] = js.undefined): RegisterWorkflowTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any],
        "defaultChildPolicy" -> defaultChildPolicy.map { x => x.asInstanceOf[js.Any] },
        "defaultExecutionStartToCloseTimeout" -> defaultExecutionStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "defaultLambdaRole" -> defaultLambdaRole.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskList" -> defaultTaskList.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskPriority" -> defaultTaskPriority.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskStartToCloseTimeout" -> defaultTaskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterWorkflowTypeInput]
    }
  }

  object RegistrationStatusEnum {
    val REGISTERED = "REGISTERED"
    val DEPRECATED = "DEPRECATED"

    val values = IndexedSeq(REGISTERED, DEPRECATED)
  }

  /**
   * Provides the details of the <code>RequestCancelActivityTask</code> decision.
   *  <b>Access Control</b>
   *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
   * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
   *  * Use an <code>Action</code> element to allow or deny permission to call this action.
   *  * You cannot use an IAM policy to constrain this action's parameters.
   * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
   */
  @js.native
  trait RequestCancelActivityTaskDecisionAttributes extends js.Object {
    var activityId: ActivityId
  }

  object RequestCancelActivityTaskDecisionAttributes {
    def apply(
      activityId: ActivityId): RequestCancelActivityTaskDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityId" -> activityId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestCancelActivityTaskDecisionAttributes]
    }
  }

  object RequestCancelActivityTaskFailedCauseEnum {
    val ACTIVITY_ID_UNKNOWN = "ACTIVITY_ID_UNKNOWN"
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(ACTIVITY_ID_UNKNOWN, OPERATION_NOT_PERMITTED)
  }

  /**
   * Provides the details of the <code>RequestCancelActivityTaskFailed</code> event.
   */
  @js.native
  trait RequestCancelActivityTaskFailedEventAttributes extends js.Object {
    var activityId: ActivityId
    var cause: RequestCancelActivityTaskFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  object RequestCancelActivityTaskFailedEventAttributes {
    def apply(
      activityId: ActivityId,
      cause: RequestCancelActivityTaskFailedCause,
      decisionTaskCompletedEventId: EventId): RequestCancelActivityTaskFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityId" -> activityId.asInstanceOf[js.Any],
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestCancelActivityTaskFailedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>RequestCancelExternalWorkflowExecution</code> decision.
   *  <b>Access Control</b>
   *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
   * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
   *  * Use an <code>Action</code> element to allow or deny permission to call this action.
   *  * You cannot use an IAM policy to constrain this action's parameters.
   * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
   */
  @js.native
  trait RequestCancelExternalWorkflowExecutionDecisionAttributes extends js.Object {
    var workflowId: WorkflowId
    var control: js.UndefOr[Data]
    var runId: js.UndefOr[WorkflowRunIdOptional]
  }

  object RequestCancelExternalWorkflowExecutionDecisionAttributes {
    def apply(
      workflowId: WorkflowId,
      control: js.UndefOr[Data] = js.undefined,
      runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined): RequestCancelExternalWorkflowExecutionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowId" -> workflowId.asInstanceOf[js.Any],
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "runId" -> runId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestCancelExternalWorkflowExecutionDecisionAttributes]
    }
  }

  object RequestCancelExternalWorkflowExecutionFailedCauseEnum {
    val UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION = "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION"
    val REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED = "REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED"
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION, REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED)
  }

  /**
   * Provides the details of the <code>RequestCancelExternalWorkflowExecutionFailed</code> event.
   */
  @js.native
  trait RequestCancelExternalWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: RequestCancelExternalWorkflowExecutionFailedCause
    var decisionTaskCompletedEventId: EventId
    var initiatedEventId: EventId
    var workflowId: WorkflowId
    var control: js.UndefOr[Data]
    var runId: js.UndefOr[WorkflowRunIdOptional]
  }

  object RequestCancelExternalWorkflowExecutionFailedEventAttributes {
    def apply(
      cause: RequestCancelExternalWorkflowExecutionFailedCause,
      decisionTaskCompletedEventId: EventId,
      initiatedEventId: EventId,
      workflowId: WorkflowId,
      control: js.UndefOr[Data] = js.undefined,
      runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined): RequestCancelExternalWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any],
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "runId" -> runId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestCancelExternalWorkflowExecutionFailedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>RequestCancelExternalWorkflowExecutionInitiated</code> event.
   */
  @js.native
  trait RequestCancelExternalWorkflowExecutionInitiatedEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: EventId
    var workflowId: WorkflowId
    var control: js.UndefOr[Data]
    var runId: js.UndefOr[WorkflowRunIdOptional]
  }

  object RequestCancelExternalWorkflowExecutionInitiatedEventAttributes {
    def apply(
      decisionTaskCompletedEventId: EventId,
      workflowId: WorkflowId,
      control: js.UndefOr[Data] = js.undefined,
      runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined): RequestCancelExternalWorkflowExecutionInitiatedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any],
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "runId" -> runId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestCancelExternalWorkflowExecutionInitiatedEventAttributes]
    }
  }

  @js.native
  trait RequestCancelWorkflowExecutionInput extends js.Object {
    var domain: DomainName
    var workflowId: WorkflowId
    var runId: js.UndefOr[WorkflowRunIdOptional]
  }

  object RequestCancelWorkflowExecutionInput {
    def apply(
      domain: DomainName,
      workflowId: WorkflowId,
      runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined): RequestCancelWorkflowExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any],
        "runId" -> runId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestCancelWorkflowExecutionInput]
    }
  }

  @js.native
  trait RespondActivityTaskCanceledInput extends js.Object {
    var taskToken: TaskToken
    var details: js.UndefOr[Data]
  }

  object RespondActivityTaskCanceledInput {
    def apply(
      taskToken: TaskToken,
      details: js.UndefOr[Data] = js.undefined): RespondActivityTaskCanceledInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskToken" -> taskToken.asInstanceOf[js.Any],
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RespondActivityTaskCanceledInput]
    }
  }

  @js.native
  trait RespondActivityTaskCompletedInput extends js.Object {
    var taskToken: TaskToken
    var result: js.UndefOr[Data]
  }

  object RespondActivityTaskCompletedInput {
    def apply(
      taskToken: TaskToken,
      result: js.UndefOr[Data] = js.undefined): RespondActivityTaskCompletedInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskToken" -> taskToken.asInstanceOf[js.Any],
        "result" -> result.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RespondActivityTaskCompletedInput]
    }
  }

  @js.native
  trait RespondActivityTaskFailedInput extends js.Object {
    var taskToken: TaskToken
    var details: js.UndefOr[Data]
    var reason: js.UndefOr[FailureReason]
  }

  object RespondActivityTaskFailedInput {
    def apply(
      taskToken: TaskToken,
      details: js.UndefOr[Data] = js.undefined,
      reason: js.UndefOr[FailureReason] = js.undefined): RespondActivityTaskFailedInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskToken" -> taskToken.asInstanceOf[js.Any],
        "details" -> details.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RespondActivityTaskFailedInput]
    }
  }

  /**
   * Input data for a TaskCompleted response to a decision task.
   */
  @js.native
  trait RespondDecisionTaskCompletedInput extends js.Object {
    var taskToken: TaskToken
    var decisions: js.UndefOr[DecisionList]
    var executionContext: js.UndefOr[Data]
  }

  object RespondDecisionTaskCompletedInput {
    def apply(
      taskToken: TaskToken,
      decisions: js.UndefOr[DecisionList] = js.undefined,
      executionContext: js.UndefOr[Data] = js.undefined): RespondDecisionTaskCompletedInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskToken" -> taskToken.asInstanceOf[js.Any],
        "decisions" -> decisions.map { x => x.asInstanceOf[js.Any] },
        "executionContext" -> executionContext.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RespondDecisionTaskCompletedInput]
    }
  }

  /**
   * Specifies the <code>runId</code> of a workflow execution.
   */
  @js.native
  trait Run extends js.Object {
    var runId: js.UndefOr[WorkflowRunId]
  }

  object Run {
    def apply(
      runId: js.UndefOr[WorkflowRunId] = js.undefined): Run = {
      val _fields = IndexedSeq[(String, js.Any)](
        "runId" -> runId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Run]
    }
  }

  /**
   * Provides the details of the <code>ScheduleActivityTask</code> decision.
   *  <b>Access Control</b>
   *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
   * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
   *  * Use an <code>Action</code> element to allow or deny permission to call this action.
   *  * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
   * <li> <code>activityType.name</code> ? String constraint. The key is <code>swf:activityType.name</code>.
   *  * <code>activityType.version</code> ? String constraint. The key is <code>swf:activityType.version</code>.
   *  * <code>taskList</code> ? String constraint. The key is <code>swf:taskList.name</code>.
   * </li>If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
   */
  @js.native
  trait ScheduleActivityTaskDecisionAttributes extends js.Object {
    var activityId: ActivityId
    var activityType: ActivityType
    var control: js.UndefOr[Data]
    var heartbeatTimeout: js.UndefOr[DurationInSecondsOptional]
    var input: js.UndefOr[Data]
    var scheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var scheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional]
    var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var taskList: js.UndefOr[TaskList]
    var taskPriority: js.UndefOr[TaskPriority]
  }

  object ScheduleActivityTaskDecisionAttributes {
    def apply(
      activityId: ActivityId,
      activityType: ActivityType,
      control: js.UndefOr[Data] = js.undefined,
      heartbeatTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      input: js.UndefOr[Data] = js.undefined,
      scheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      scheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined): ScheduleActivityTaskDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityId" -> activityId.asInstanceOf[js.Any],
        "activityType" -> activityType.asInstanceOf[js.Any],
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "heartbeatTimeout" -> heartbeatTimeout.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] },
        "scheduleToCloseTimeout" -> scheduleToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "scheduleToStartTimeout" -> scheduleToStartTimeout.map { x => x.asInstanceOf[js.Any] },
        "startToCloseTimeout" -> startToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "taskList" -> taskList.map { x => x.asInstanceOf[js.Any] },
        "taskPriority" -> taskPriority.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleActivityTaskDecisionAttributes]
    }
  }

  object ScheduleActivityTaskFailedCauseEnum {
    val ACTIVITY_TYPE_DEPRECATED = "ACTIVITY_TYPE_DEPRECATED"
    val ACTIVITY_TYPE_DOES_NOT_EXIST = "ACTIVITY_TYPE_DOES_NOT_EXIST"
    val ACTIVITY_ID_ALREADY_IN_USE = "ACTIVITY_ID_ALREADY_IN_USE"
    val OPEN_ACTIVITIES_LIMIT_EXCEEDED = "OPEN_ACTIVITIES_LIMIT_EXCEEDED"
    val ACTIVITY_CREATION_RATE_EXCEEDED = "ACTIVITY_CREATION_RATE_EXCEEDED"
    val DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED = "DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED"
    val DEFAULT_TASK_LIST_UNDEFINED = "DEFAULT_TASK_LIST_UNDEFINED"
    val DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED = "DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED"
    val DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED = "DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED"
    val DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED = "DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED"
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(ACTIVITY_TYPE_DEPRECATED, ACTIVITY_TYPE_DOES_NOT_EXIST, ACTIVITY_ID_ALREADY_IN_USE, OPEN_ACTIVITIES_LIMIT_EXCEEDED, ACTIVITY_CREATION_RATE_EXCEEDED, DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED, DEFAULT_TASK_LIST_UNDEFINED, DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED, DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED, DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED, OPERATION_NOT_PERMITTED)
  }

  /**
   * Provides the details of the <code>ScheduleActivityTaskFailed</code> event.
   */
  @js.native
  trait ScheduleActivityTaskFailedEventAttributes extends js.Object {
    var activityId: ActivityId
    var activityType: ActivityType
    var cause: ScheduleActivityTaskFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  object ScheduleActivityTaskFailedEventAttributes {
    def apply(
      activityId: ActivityId,
      activityType: ActivityType,
      cause: ScheduleActivityTaskFailedCause,
      decisionTaskCompletedEventId: EventId): ScheduleActivityTaskFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityId" -> activityId.asInstanceOf[js.Any],
        "activityType" -> activityType.asInstanceOf[js.Any],
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleActivityTaskFailedEventAttributes]
    }
  }

  /**
   * Decision attributes specified in <code>scheduleLambdaFunctionDecisionAttributes</code> within the list of decisions <code>decisions</code> passed to <a>RespondDecisionTaskCompleted</a>.
   */
  @js.native
  trait ScheduleLambdaFunctionDecisionAttributes extends js.Object {
    var id: FunctionId
    var name: FunctionName
    var control: js.UndefOr[Data]
    var input: js.UndefOr[FunctionInput]
    var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
  }

  object ScheduleLambdaFunctionDecisionAttributes {
    def apply(
      id: FunctionId,
      name: FunctionName,
      control: js.UndefOr[Data] = js.undefined,
      input: js.UndefOr[FunctionInput] = js.undefined,
      startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined): ScheduleLambdaFunctionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] },
        "startToCloseTimeout" -> startToCloseTimeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleLambdaFunctionDecisionAttributes]
    }
  }

  object ScheduleLambdaFunctionFailedCauseEnum {
    val ID_ALREADY_IN_USE = "ID_ALREADY_IN_USE"
    val OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED = "OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED"
    val LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED = "LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED"
    val LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION = "LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION"

    val values = IndexedSeq(ID_ALREADY_IN_USE, OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED, LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED, LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION)
  }

  /**
   * Provides the details of the <code>ScheduleLambdaFunctionFailed</code> event. It isn't set for other event types.
   */
  @js.native
  trait ScheduleLambdaFunctionFailedEventAttributes extends js.Object {
    var cause: ScheduleLambdaFunctionFailedCause
    var decisionTaskCompletedEventId: EventId
    var id: FunctionId
    var name: FunctionName
  }

  object ScheduleLambdaFunctionFailedEventAttributes {
    def apply(
      cause: ScheduleLambdaFunctionFailedCause,
      decisionTaskCompletedEventId: EventId,
      id: FunctionId,
      name: FunctionName): ScheduleLambdaFunctionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleLambdaFunctionFailedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>SignalExternalWorkflowExecution</code> decision.
   *  <b>Access Control</b>
   *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
   * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
   *  * Use an <code>Action</code> element to allow or deny permission to call this action.
   *  * You cannot use an IAM policy to constrain this action's parameters.
   * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
   */
  @js.native
  trait SignalExternalWorkflowExecutionDecisionAttributes extends js.Object {
    var signalName: SignalName
    var workflowId: WorkflowId
    var control: js.UndefOr[Data]
    var input: js.UndefOr[Data]
    var runId: js.UndefOr[WorkflowRunIdOptional]
  }

  object SignalExternalWorkflowExecutionDecisionAttributes {
    def apply(
      signalName: SignalName,
      workflowId: WorkflowId,
      control: js.UndefOr[Data] = js.undefined,
      input: js.UndefOr[Data] = js.undefined,
      runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined): SignalExternalWorkflowExecutionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "signalName" -> signalName.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any],
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] },
        "runId" -> runId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignalExternalWorkflowExecutionDecisionAttributes]
    }
  }

  object SignalExternalWorkflowExecutionFailedCauseEnum {
    val UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION = "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION"
    val SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED = "SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED"
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION, SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED)
  }

  /**
   * Provides the details of the <code>SignalExternalWorkflowExecutionFailed</code> event.
   */
  @js.native
  trait SignalExternalWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: SignalExternalWorkflowExecutionFailedCause
    var decisionTaskCompletedEventId: EventId
    var initiatedEventId: EventId
    var workflowId: WorkflowId
    var control: js.UndefOr[Data]
    var runId: js.UndefOr[WorkflowRunIdOptional]
  }

  object SignalExternalWorkflowExecutionFailedEventAttributes {
    def apply(
      cause: SignalExternalWorkflowExecutionFailedCause,
      decisionTaskCompletedEventId: EventId,
      initiatedEventId: EventId,
      workflowId: WorkflowId,
      control: js.UndefOr[Data] = js.undefined,
      runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined): SignalExternalWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any],
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "runId" -> runId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignalExternalWorkflowExecutionFailedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>SignalExternalWorkflowExecutionInitiated</code> event.
   */
  @js.native
  trait SignalExternalWorkflowExecutionInitiatedEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: EventId
    var signalName: SignalName
    var workflowId: WorkflowId
    var control: js.UndefOr[Data]
    var input: js.UndefOr[Data]
    var runId: js.UndefOr[WorkflowRunIdOptional]
  }

  object SignalExternalWorkflowExecutionInitiatedEventAttributes {
    def apply(
      decisionTaskCompletedEventId: EventId,
      signalName: SignalName,
      workflowId: WorkflowId,
      control: js.UndefOr[Data] = js.undefined,
      input: js.UndefOr[Data] = js.undefined,
      runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined): SignalExternalWorkflowExecutionInitiatedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "signalName" -> signalName.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any],
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] },
        "runId" -> runId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignalExternalWorkflowExecutionInitiatedEventAttributes]
    }
  }

  @js.native
  trait SignalWorkflowExecutionInput extends js.Object {
    var domain: DomainName
    var signalName: SignalName
    var workflowId: WorkflowId
    var input: js.UndefOr[Data]
    var runId: js.UndefOr[WorkflowRunIdOptional]
  }

  object SignalWorkflowExecutionInput {
    def apply(
      domain: DomainName,
      signalName: SignalName,
      workflowId: WorkflowId,
      input: js.UndefOr[Data] = js.undefined,
      runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined): SignalWorkflowExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.asInstanceOf[js.Any],
        "signalName" -> signalName.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any],
        "input" -> input.map { x => x.asInstanceOf[js.Any] },
        "runId" -> runId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignalWorkflowExecutionInput]
    }
  }

  /**
   * Provides the details of the <code>StartChildWorkflowExecution</code> decision.
   *  <b>Access Control</b>
   *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
   * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
   *  * Use an <code>Action</code> element to allow or deny permission to call this action.
   *  * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
   * <li> <code>tagList.member.N</code> ? The key is "swf:tagList.N" where N is the tag number from 0 to 4, inclusive.
   *  * <code>taskList</code> ? String constraint. The key is <code>swf:taskList.name</code>.
   *  * <code>workflowType.name</code> ? String constraint. The key is <code>swf:workflowType.name</code>.
   *  * <code>workflowType.version</code> ? String constraint. The key is <code>swf:workflowType.version</code>.
   * </li>If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
   */
  @js.native
  trait StartChildWorkflowExecutionDecisionAttributes extends js.Object {
    var workflowId: WorkflowId
    var workflowType: WorkflowType
    var childPolicy: js.UndefOr[ChildPolicy]
    var control: js.UndefOr[Data]
    var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var input: js.UndefOr[Data]
    var lambdaRole: js.UndefOr[Arn]
    var tagList: js.UndefOr[TagList]
    var taskList: js.UndefOr[TaskList]
    var taskPriority: js.UndefOr[TaskPriority]
    var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
  }

  object StartChildWorkflowExecutionDecisionAttributes {
    def apply(
      workflowId: WorkflowId,
      workflowType: WorkflowType,
      childPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      control: js.UndefOr[Data] = js.undefined,
      executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      input: js.UndefOr[Data] = js.undefined,
      lambdaRole: js.UndefOr[Arn] = js.undefined,
      tagList: js.UndefOr[TagList] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined,
      taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined): StartChildWorkflowExecutionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowId" -> workflowId.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any],
        "childPolicy" -> childPolicy.map { x => x.asInstanceOf[js.Any] },
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "executionStartToCloseTimeout" -> executionStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] },
        "lambdaRole" -> lambdaRole.map { x => x.asInstanceOf[js.Any] },
        "tagList" -> tagList.map { x => x.asInstanceOf[js.Any] },
        "taskList" -> taskList.map { x => x.asInstanceOf[js.Any] },
        "taskPriority" -> taskPriority.map { x => x.asInstanceOf[js.Any] },
        "taskStartToCloseTimeout" -> taskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartChildWorkflowExecutionDecisionAttributes]
    }
  }

  object StartChildWorkflowExecutionFailedCauseEnum {
    val WORKFLOW_TYPE_DOES_NOT_EXIST = "WORKFLOW_TYPE_DOES_NOT_EXIST"
    val WORKFLOW_TYPE_DEPRECATED = "WORKFLOW_TYPE_DEPRECATED"
    val OPEN_CHILDREN_LIMIT_EXCEEDED = "OPEN_CHILDREN_LIMIT_EXCEEDED"
    val OPEN_WORKFLOWS_LIMIT_EXCEEDED = "OPEN_WORKFLOWS_LIMIT_EXCEEDED"
    val CHILD_CREATION_RATE_EXCEEDED = "CHILD_CREATION_RATE_EXCEEDED"
    val WORKFLOW_ALREADY_RUNNING = "WORKFLOW_ALREADY_RUNNING"
    val DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED = "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED"
    val DEFAULT_TASK_LIST_UNDEFINED = "DEFAULT_TASK_LIST_UNDEFINED"
    val DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED = "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED"
    val DEFAULT_CHILD_POLICY_UNDEFINED = "DEFAULT_CHILD_POLICY_UNDEFINED"
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(WORKFLOW_TYPE_DOES_NOT_EXIST, WORKFLOW_TYPE_DEPRECATED, OPEN_CHILDREN_LIMIT_EXCEEDED, OPEN_WORKFLOWS_LIMIT_EXCEEDED, CHILD_CREATION_RATE_EXCEEDED, WORKFLOW_ALREADY_RUNNING, DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED, DEFAULT_TASK_LIST_UNDEFINED, DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED, DEFAULT_CHILD_POLICY_UNDEFINED, OPERATION_NOT_PERMITTED)
  }

  /**
   * Provides the details of the <code>StartChildWorkflowExecutionFailed</code> event.
   */
  @js.native
  trait StartChildWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: StartChildWorkflowExecutionFailedCause
    var decisionTaskCompletedEventId: EventId
    var initiatedEventId: EventId
    var workflowId: WorkflowId
    var workflowType: WorkflowType
    var control: js.UndefOr[Data]
  }

  object StartChildWorkflowExecutionFailedEventAttributes {
    def apply(
      cause: StartChildWorkflowExecutionFailedCause,
      decisionTaskCompletedEventId: EventId,
      initiatedEventId: EventId,
      workflowId: WorkflowId,
      workflowType: WorkflowType,
      control: js.UndefOr[Data] = js.undefined): StartChildWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any],
        "control" -> control.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartChildWorkflowExecutionFailedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>StartChildWorkflowExecutionInitiated</code> event.
   */
  @js.native
  trait StartChildWorkflowExecutionInitiatedEventAttributes extends js.Object {
    var childPolicy: ChildPolicy
    var decisionTaskCompletedEventId: EventId
    var taskList: TaskList
    var workflowId: WorkflowId
    var workflowType: WorkflowType
    var control: js.UndefOr[Data]
    var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var input: js.UndefOr[Data]
    var lambdaRole: js.UndefOr[Arn]
    var tagList: js.UndefOr[TagList]
    var taskPriority: js.UndefOr[TaskPriority]
    var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
  }

  object StartChildWorkflowExecutionInitiatedEventAttributes {
    def apply(
      childPolicy: ChildPolicy,
      decisionTaskCompletedEventId: EventId,
      taskList: TaskList,
      workflowId: WorkflowId,
      workflowType: WorkflowType,
      control: js.UndefOr[Data] = js.undefined,
      executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      input: js.UndefOr[Data] = js.undefined,
      lambdaRole: js.UndefOr[Arn] = js.undefined,
      tagList: js.UndefOr[TagList] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined,
      taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined): StartChildWorkflowExecutionInitiatedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "childPolicy" -> childPolicy.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "taskList" -> taskList.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any],
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "executionStartToCloseTimeout" -> executionStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] },
        "lambdaRole" -> lambdaRole.map { x => x.asInstanceOf[js.Any] },
        "tagList" -> tagList.map { x => x.asInstanceOf[js.Any] },
        "taskPriority" -> taskPriority.map { x => x.asInstanceOf[js.Any] },
        "taskStartToCloseTimeout" -> taskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartChildWorkflowExecutionInitiatedEventAttributes]
    }
  }

  object StartLambdaFunctionFailedCauseEnum {
    val ASSUME_ROLE_FAILED = "ASSUME_ROLE_FAILED"

    val values = IndexedSeq(ASSUME_ROLE_FAILED)
  }

  /**
   * Provides the details of the <code>StartLambdaFunctionFailed</code> event. It isn't set for other event types.
   */
  @js.native
  trait StartLambdaFunctionFailedEventAttributes extends js.Object {
    var cause: js.UndefOr[StartLambdaFunctionFailedCause]
    var message: js.UndefOr[CauseMessage]
    var scheduledEventId: js.UndefOr[EventId]
  }

  object StartLambdaFunctionFailedEventAttributes {
    def apply(
      cause: js.UndefOr[StartLambdaFunctionFailedCause] = js.undefined,
      message: js.UndefOr[CauseMessage] = js.undefined,
      scheduledEventId: js.UndefOr[EventId] = js.undefined): StartLambdaFunctionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] },
        "scheduledEventId" -> scheduledEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartLambdaFunctionFailedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>StartTimer</code> decision.
   *  <b>Access Control</b>
   *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
   * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
   *  * Use an <code>Action</code> element to allow or deny permission to call this action.
   *  * You cannot use an IAM policy to constrain this action's parameters.
   * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
   */
  @js.native
  trait StartTimerDecisionAttributes extends js.Object {
    var startToFireTimeout: DurationInSeconds
    var timerId: TimerId
    var control: js.UndefOr[Data]
  }

  object StartTimerDecisionAttributes {
    def apply(
      startToFireTimeout: DurationInSeconds,
      timerId: TimerId,
      control: js.UndefOr[Data] = js.undefined): StartTimerDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "startToFireTimeout" -> startToFireTimeout.asInstanceOf[js.Any],
        "timerId" -> timerId.asInstanceOf[js.Any],
        "control" -> control.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartTimerDecisionAttributes]
    }
  }

  object StartTimerFailedCauseEnum {
    val TIMER_ID_ALREADY_IN_USE = "TIMER_ID_ALREADY_IN_USE"
    val OPEN_TIMERS_LIMIT_EXCEEDED = "OPEN_TIMERS_LIMIT_EXCEEDED"
    val TIMER_CREATION_RATE_EXCEEDED = "TIMER_CREATION_RATE_EXCEEDED"
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(TIMER_ID_ALREADY_IN_USE, OPEN_TIMERS_LIMIT_EXCEEDED, TIMER_CREATION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED)
  }

  /**
   * Provides the details of the <code>StartTimerFailed</code> event.
   */
  @js.native
  trait StartTimerFailedEventAttributes extends js.Object {
    var cause: StartTimerFailedCause
    var decisionTaskCompletedEventId: EventId
    var timerId: TimerId
  }

  object StartTimerFailedEventAttributes {
    def apply(
      cause: StartTimerFailedCause,
      decisionTaskCompletedEventId: EventId,
      timerId: TimerId): StartTimerFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "timerId" -> timerId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartTimerFailedEventAttributes]
    }
  }

  @js.native
  trait StartWorkflowExecutionInput extends js.Object {
    var domain: DomainName
    var workflowId: WorkflowId
    var workflowType: WorkflowType
    var childPolicy: js.UndefOr[ChildPolicy]
    var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var input: js.UndefOr[Data]
    var lambdaRole: js.UndefOr[Arn]
    var tagList: js.UndefOr[TagList]
    var taskList: js.UndefOr[TaskList]
    var taskPriority: js.UndefOr[TaskPriority]
    var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
  }

  object StartWorkflowExecutionInput {
    def apply(
      domain: DomainName,
      workflowId: WorkflowId,
      workflowType: WorkflowType,
      childPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      input: js.UndefOr[Data] = js.undefined,
      lambdaRole: js.UndefOr[Arn] = js.undefined,
      tagList: js.UndefOr[TagList] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined,
      taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined): StartWorkflowExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any],
        "childPolicy" -> childPolicy.map { x => x.asInstanceOf[js.Any] },
        "executionStartToCloseTimeout" -> executionStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] },
        "lambdaRole" -> lambdaRole.map { x => x.asInstanceOf[js.Any] },
        "tagList" -> tagList.map { x => x.asInstanceOf[js.Any] },
        "taskList" -> taskList.map { x => x.asInstanceOf[js.Any] },
        "taskPriority" -> taskPriority.map { x => x.asInstanceOf[js.Any] },
        "taskStartToCloseTimeout" -> taskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartWorkflowExecutionInput]
    }
  }

  /**
   * Used to filter the workflow executions in visibility APIs based on a tag.
   */
  @js.native
  trait TagFilter extends js.Object {
    var tag: Tag
  }

  object TagFilter {
    def apply(
      tag: Tag): TagFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tag" -> tag.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagFilter]
    }
  }

  /**
   * Represents a task list.
   */
  @js.native
  trait TaskList extends js.Object {
    var name: Name
  }

  object TaskList {
    def apply(
      name: Name): TaskList = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskList]
    }
  }

  @js.native
  trait TerminateWorkflowExecutionInput extends js.Object {
    var domain: DomainName
    var workflowId: WorkflowId
    var childPolicy: js.UndefOr[ChildPolicy]
    var details: js.UndefOr[Data]
    var reason: js.UndefOr[TerminateReason]
    var runId: js.UndefOr[WorkflowRunIdOptional]
  }

  object TerminateWorkflowExecutionInput {
    def apply(
      domain: DomainName,
      workflowId: WorkflowId,
      childPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      details: js.UndefOr[Data] = js.undefined,
      reason: js.UndefOr[TerminateReason] = js.undefined,
      runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined): TerminateWorkflowExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any],
        "childPolicy" -> childPolicy.map { x => x.asInstanceOf[js.Any] },
        "details" -> details.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] },
        "runId" -> runId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateWorkflowExecutionInput]
    }
  }

  /**
   * Provides the details of the <code>TimerCanceled</code> event.
   */
  @js.native
  trait TimerCanceledEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: EventId
    var startedEventId: EventId
    var timerId: TimerId
  }

  object TimerCanceledEventAttributes {
    def apply(
      decisionTaskCompletedEventId: EventId,
      startedEventId: EventId,
      timerId: TimerId): TimerCanceledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "timerId" -> timerId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimerCanceledEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>TimerFired</code> event.
   */
  @js.native
  trait TimerFiredEventAttributes extends js.Object {
    var startedEventId: EventId
    var timerId: TimerId
  }

  object TimerFiredEventAttributes {
    def apply(
      startedEventId: EventId,
      timerId: TimerId): TimerFiredEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "timerId" -> timerId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimerFiredEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>TimerStarted</code> event.
   */
  @js.native
  trait TimerStartedEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: EventId
    var startToFireTimeout: DurationInSeconds
    var timerId: TimerId
    var control: js.UndefOr[Data]
  }

  object TimerStartedEventAttributes {
    def apply(
      decisionTaskCompletedEventId: EventId,
      startToFireTimeout: DurationInSeconds,
      timerId: TimerId,
      control: js.UndefOr[Data] = js.undefined): TimerStartedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "startToFireTimeout" -> startToFireTimeout.asInstanceOf[js.Any],
        "timerId" -> timerId.asInstanceOf[js.Any],
        "control" -> control.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimerStartedEventAttributes]
    }
  }

  /**
   * Returned if the type already exists in the specified domain. You get this fault even if the existing type is in deprecated status. You can specify another version if the intent is to create a new distinct version of the type.
   */
  @js.native
  trait TypeAlreadyExistsFaultException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * Returned when the specified activity or workflow type was already deprecated.
   */
  @js.native
  trait TypeDeprecatedFaultException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation.
   */
  @js.native
  trait UnknownResourceFaultException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * Represents a workflow execution.
   */
  @js.native
  trait WorkflowExecution extends js.Object {
    var runId: WorkflowRunId
    var workflowId: WorkflowId
  }

  object WorkflowExecution {
    def apply(
      runId: WorkflowRunId,
      workflowId: WorkflowId): WorkflowExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "runId" -> runId.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecution]
    }
  }

  /**
   * Returned by <a>StartWorkflowExecution</a> when an open execution with the same workflowId is already running in the specified domain.
   */
  @js.native
  trait WorkflowExecutionAlreadyStartedFaultException extends js.Object {
    val message: ErrorMessage
  }

  object WorkflowExecutionCancelRequestedCauseEnum {
    val CHILD_POLICY_APPLIED = "CHILD_POLICY_APPLIED"

    val values = IndexedSeq(CHILD_POLICY_APPLIED)
  }

  /**
   * Provides the details of the <code>WorkflowExecutionCancelRequested</code> event.
   */
  @js.native
  trait WorkflowExecutionCancelRequestedEventAttributes extends js.Object {
    var cause: js.UndefOr[WorkflowExecutionCancelRequestedCause]
    var externalInitiatedEventId: js.UndefOr[EventId]
    var externalWorkflowExecution: js.UndefOr[WorkflowExecution]
  }

  object WorkflowExecutionCancelRequestedEventAttributes {
    def apply(
      cause: js.UndefOr[WorkflowExecutionCancelRequestedCause] = js.undefined,
      externalInitiatedEventId: js.UndefOr[EventId] = js.undefined,
      externalWorkflowExecution: js.UndefOr[WorkflowExecution] = js.undefined): WorkflowExecutionCancelRequestedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] },
        "externalInitiatedEventId" -> externalInitiatedEventId.map { x => x.asInstanceOf[js.Any] },
        "externalWorkflowExecution" -> externalWorkflowExecution.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionCancelRequestedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>WorkflowExecutionCanceled</code> event.
   */
  @js.native
  trait WorkflowExecutionCanceledEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: EventId
    var details: js.UndefOr[Data]
  }

  object WorkflowExecutionCanceledEventAttributes {
    def apply(
      decisionTaskCompletedEventId: EventId,
      details: js.UndefOr[Data] = js.undefined): WorkflowExecutionCanceledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionCanceledEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>WorkflowExecutionCompleted</code> event.
   */
  @js.native
  trait WorkflowExecutionCompletedEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: EventId
    var result: js.UndefOr[Data]
  }

  object WorkflowExecutionCompletedEventAttributes {
    def apply(
      decisionTaskCompletedEventId: EventId,
      result: js.UndefOr[Data] = js.undefined): WorkflowExecutionCompletedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "result" -> result.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionCompletedEventAttributes]
    }
  }

  /**
   * The configuration settings for a workflow execution including timeout values, tasklist etc. These configuration settings are determined from the defaults specified when registering the workflow type and those specified when starting the workflow execution.
   */
  @js.native
  trait WorkflowExecutionConfiguration extends js.Object {
    var childPolicy: ChildPolicy
    var executionStartToCloseTimeout: DurationInSeconds
    var taskList: TaskList
    var taskStartToCloseTimeout: DurationInSeconds
    var lambdaRole: js.UndefOr[Arn]
    var taskPriority: js.UndefOr[TaskPriority]
  }

  object WorkflowExecutionConfiguration {
    def apply(
      childPolicy: ChildPolicy,
      executionStartToCloseTimeout: DurationInSeconds,
      taskList: TaskList,
      taskStartToCloseTimeout: DurationInSeconds,
      lambdaRole: js.UndefOr[Arn] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined): WorkflowExecutionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "childPolicy" -> childPolicy.asInstanceOf[js.Any],
        "executionStartToCloseTimeout" -> executionStartToCloseTimeout.asInstanceOf[js.Any],
        "taskList" -> taskList.asInstanceOf[js.Any],
        "taskStartToCloseTimeout" -> taskStartToCloseTimeout.asInstanceOf[js.Any],
        "lambdaRole" -> lambdaRole.map { x => x.asInstanceOf[js.Any] },
        "taskPriority" -> taskPriority.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionConfiguration]
    }
  }

  /**
   * Provides the details of the <code>WorkflowExecutionContinuedAsNew</code> event.
   */
  @js.native
  trait WorkflowExecutionContinuedAsNewEventAttributes extends js.Object {
    var childPolicy: ChildPolicy
    var decisionTaskCompletedEventId: EventId
    var newExecutionRunId: WorkflowRunId
    var taskList: TaskList
    var workflowType: WorkflowType
    var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var input: js.UndefOr[Data]
    var lambdaRole: js.UndefOr[Arn]
    var tagList: js.UndefOr[TagList]
    var taskPriority: js.UndefOr[TaskPriority]
    var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
  }

  object WorkflowExecutionContinuedAsNewEventAttributes {
    def apply(
      childPolicy: ChildPolicy,
      decisionTaskCompletedEventId: EventId,
      newExecutionRunId: WorkflowRunId,
      taskList: TaskList,
      workflowType: WorkflowType,
      executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      input: js.UndefOr[Data] = js.undefined,
      lambdaRole: js.UndefOr[Arn] = js.undefined,
      tagList: js.UndefOr[TagList] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined,
      taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined): WorkflowExecutionContinuedAsNewEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "childPolicy" -> childPolicy.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "newExecutionRunId" -> newExecutionRunId.asInstanceOf[js.Any],
        "taskList" -> taskList.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any],
        "executionStartToCloseTimeout" -> executionStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] },
        "lambdaRole" -> lambdaRole.map { x => x.asInstanceOf[js.Any] },
        "tagList" -> tagList.map { x => x.asInstanceOf[js.Any] },
        "taskPriority" -> taskPriority.map { x => x.asInstanceOf[js.Any] },
        "taskStartToCloseTimeout" -> taskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionContinuedAsNewEventAttributes]
    }
  }

  /**
   * Contains the count of workflow executions returned from <a>CountOpenWorkflowExecutions</a> or <a>CountClosedWorkflowExecutions</a>
   */
  @js.native
  trait WorkflowExecutionCount extends js.Object {
    var count: Count
    var truncated: js.UndefOr[Truncated]
  }

  object WorkflowExecutionCount {
    def apply(
      count: Count,
      truncated: js.UndefOr[Truncated] = js.undefined): WorkflowExecutionCount = {
      val _fields = IndexedSeq[(String, js.Any)](
        "count" -> count.asInstanceOf[js.Any],
        "truncated" -> truncated.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionCount]
    }
  }

  /**
   * Contains details about a workflow execution.
   */
  @js.native
  trait WorkflowExecutionDetail extends js.Object {
    var executionConfiguration: WorkflowExecutionConfiguration
    var executionInfo: WorkflowExecutionInfo
    var openCounts: WorkflowExecutionOpenCounts
    var latestActivityTaskTimestamp: js.UndefOr[Timestamp]
    var latestExecutionContext: js.UndefOr[Data]
  }

  object WorkflowExecutionDetail {
    def apply(
      executionConfiguration: WorkflowExecutionConfiguration,
      executionInfo: WorkflowExecutionInfo,
      openCounts: WorkflowExecutionOpenCounts,
      latestActivityTaskTimestamp: js.UndefOr[Timestamp] = js.undefined,
      latestExecutionContext: js.UndefOr[Data] = js.undefined): WorkflowExecutionDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionConfiguration" -> executionConfiguration.asInstanceOf[js.Any],
        "executionInfo" -> executionInfo.asInstanceOf[js.Any],
        "openCounts" -> openCounts.asInstanceOf[js.Any],
        "latestActivityTaskTimestamp" -> latestActivityTaskTimestamp.map { x => x.asInstanceOf[js.Any] },
        "latestExecutionContext" -> latestExecutionContext.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionDetail]
    }
  }

  /**
   * Provides the details of the <code>WorkflowExecutionFailed</code> event.
   */
  @js.native
  trait WorkflowExecutionFailedEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: EventId
    var details: js.UndefOr[Data]
    var reason: js.UndefOr[FailureReason]
  }

  object WorkflowExecutionFailedEventAttributes {
    def apply(
      decisionTaskCompletedEventId: EventId,
      details: js.UndefOr[Data] = js.undefined,
      reason: js.UndefOr[FailureReason] = js.undefined): WorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "details" -> details.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionFailedEventAttributes]
    }
  }

  /**
   * Used to filter the workflow executions in visibility APIs by their <code>workflowId</code>.
   */
  @js.native
  trait WorkflowExecutionFilter extends js.Object {
    var workflowId: WorkflowId
  }

  object WorkflowExecutionFilter {
    def apply(
      workflowId: WorkflowId): WorkflowExecutionFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowId" -> workflowId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionFilter]
    }
  }

  /**
   * Contains information about a workflow execution.
   */
  @js.native
  trait WorkflowExecutionInfo extends js.Object {
    var execution: WorkflowExecution
    var executionStatus: ExecutionStatus
    var startTimestamp: Timestamp
    var workflowType: WorkflowType
    var cancelRequested: js.UndefOr[Canceled]
    var closeStatus: js.UndefOr[CloseStatus]
    var closeTimestamp: js.UndefOr[Timestamp]
    var parent: js.UndefOr[WorkflowExecution]
    var tagList: js.UndefOr[TagList]
  }

  object WorkflowExecutionInfo {
    def apply(
      execution: WorkflowExecution,
      executionStatus: ExecutionStatus,
      startTimestamp: Timestamp,
      workflowType: WorkflowType,
      cancelRequested: js.UndefOr[Canceled] = js.undefined,
      closeStatus: js.UndefOr[CloseStatus] = js.undefined,
      closeTimestamp: js.UndefOr[Timestamp] = js.undefined,
      parent: js.UndefOr[WorkflowExecution] = js.undefined,
      tagList: js.UndefOr[TagList] = js.undefined): WorkflowExecutionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "execution" -> execution.asInstanceOf[js.Any],
        "executionStatus" -> executionStatus.asInstanceOf[js.Any],
        "startTimestamp" -> startTimestamp.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any],
        "cancelRequested" -> cancelRequested.map { x => x.asInstanceOf[js.Any] },
        "closeStatus" -> closeStatus.map { x => x.asInstanceOf[js.Any] },
        "closeTimestamp" -> closeTimestamp.map { x => x.asInstanceOf[js.Any] },
        "parent" -> parent.map { x => x.asInstanceOf[js.Any] },
        "tagList" -> tagList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionInfo]
    }
  }

  /**
   * Contains a paginated list of information about workflow executions.
   */
  @js.native
  trait WorkflowExecutionInfos extends js.Object {
    var executionInfos: WorkflowExecutionInfoList
    var nextPageToken: js.UndefOr[PageToken]
  }

  object WorkflowExecutionInfos {
    def apply(
      executionInfos: WorkflowExecutionInfoList,
      nextPageToken: js.UndefOr[PageToken] = js.undefined): WorkflowExecutionInfos = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionInfos" -> executionInfos.asInstanceOf[js.Any],
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionInfos]
    }
  }

  /**
   * Contains the counts of open tasks, child workflow executions and timers for a workflow execution.
   */
  @js.native
  trait WorkflowExecutionOpenCounts extends js.Object {
    var openActivityTasks: Count
    var openChildWorkflowExecutions: Count
    var openDecisionTasks: OpenDecisionTasksCount
    var openTimers: Count
    var openLambdaFunctions: js.UndefOr[Count]
  }

  object WorkflowExecutionOpenCounts {
    def apply(
      openActivityTasks: Count,
      openChildWorkflowExecutions: Count,
      openDecisionTasks: OpenDecisionTasksCount,
      openTimers: Count,
      openLambdaFunctions: js.UndefOr[Count] = js.undefined): WorkflowExecutionOpenCounts = {
      val _fields = IndexedSeq[(String, js.Any)](
        "openActivityTasks" -> openActivityTasks.asInstanceOf[js.Any],
        "openChildWorkflowExecutions" -> openChildWorkflowExecutions.asInstanceOf[js.Any],
        "openDecisionTasks" -> openDecisionTasks.asInstanceOf[js.Any],
        "openTimers" -> openTimers.asInstanceOf[js.Any],
        "openLambdaFunctions" -> openLambdaFunctions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionOpenCounts]
    }
  }

  /**
   * Provides the details of the <code>WorkflowExecutionSignaled</code> event.
   */
  @js.native
  trait WorkflowExecutionSignaledEventAttributes extends js.Object {
    var signalName: SignalName
    var externalInitiatedEventId: js.UndefOr[EventId]
    var externalWorkflowExecution: js.UndefOr[WorkflowExecution]
    var input: js.UndefOr[Data]
  }

  object WorkflowExecutionSignaledEventAttributes {
    def apply(
      signalName: SignalName,
      externalInitiatedEventId: js.UndefOr[EventId] = js.undefined,
      externalWorkflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      input: js.UndefOr[Data] = js.undefined): WorkflowExecutionSignaledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "signalName" -> signalName.asInstanceOf[js.Any],
        "externalInitiatedEventId" -> externalInitiatedEventId.map { x => x.asInstanceOf[js.Any] },
        "externalWorkflowExecution" -> externalWorkflowExecution.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionSignaledEventAttributes]
    }
  }

  /**
   * Provides details of <code>WorkflowExecutionStarted</code> event.
   */
  @js.native
  trait WorkflowExecutionStartedEventAttributes extends js.Object {
    var childPolicy: ChildPolicy
    var taskList: TaskList
    var workflowType: WorkflowType
    var continuedExecutionRunId: js.UndefOr[WorkflowRunIdOptional]
    var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var input: js.UndefOr[Data]
    var lambdaRole: js.UndefOr[Arn]
    var parentInitiatedEventId: js.UndefOr[EventId]
    var parentWorkflowExecution: js.UndefOr[WorkflowExecution]
    var tagList: js.UndefOr[TagList]
    var taskPriority: js.UndefOr[TaskPriority]
    var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
  }

  object WorkflowExecutionStartedEventAttributes {
    def apply(
      childPolicy: ChildPolicy,
      taskList: TaskList,
      workflowType: WorkflowType,
      continuedExecutionRunId: js.UndefOr[WorkflowRunIdOptional] = js.undefined,
      executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      input: js.UndefOr[Data] = js.undefined,
      lambdaRole: js.UndefOr[Arn] = js.undefined,
      parentInitiatedEventId: js.UndefOr[EventId] = js.undefined,
      parentWorkflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      tagList: js.UndefOr[TagList] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined,
      taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined): WorkflowExecutionStartedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "childPolicy" -> childPolicy.asInstanceOf[js.Any],
        "taskList" -> taskList.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any],
        "continuedExecutionRunId" -> continuedExecutionRunId.map { x => x.asInstanceOf[js.Any] },
        "executionStartToCloseTimeout" -> executionStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] },
        "lambdaRole" -> lambdaRole.map { x => x.asInstanceOf[js.Any] },
        "parentInitiatedEventId" -> parentInitiatedEventId.map { x => x.asInstanceOf[js.Any] },
        "parentWorkflowExecution" -> parentWorkflowExecution.map { x => x.asInstanceOf[js.Any] },
        "tagList" -> tagList.map { x => x.asInstanceOf[js.Any] },
        "taskPriority" -> taskPriority.map { x => x.asInstanceOf[js.Any] },
        "taskStartToCloseTimeout" -> taskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionStartedEventAttributes]
    }
  }

  object WorkflowExecutionTerminatedCauseEnum {
    val CHILD_POLICY_APPLIED = "CHILD_POLICY_APPLIED"
    val EVENT_LIMIT_EXCEEDED = "EVENT_LIMIT_EXCEEDED"
    val OPERATOR_INITIATED = "OPERATOR_INITIATED"

    val values = IndexedSeq(CHILD_POLICY_APPLIED, EVENT_LIMIT_EXCEEDED, OPERATOR_INITIATED)
  }

  /**
   * Provides the details of the <code>WorkflowExecutionTerminated</code> event.
   */
  @js.native
  trait WorkflowExecutionTerminatedEventAttributes extends js.Object {
    var childPolicy: ChildPolicy
    var cause: js.UndefOr[WorkflowExecutionTerminatedCause]
    var details: js.UndefOr[Data]
    var reason: js.UndefOr[TerminateReason]
  }

  object WorkflowExecutionTerminatedEventAttributes {
    def apply(
      childPolicy: ChildPolicy,
      cause: js.UndefOr[WorkflowExecutionTerminatedCause] = js.undefined,
      details: js.UndefOr[Data] = js.undefined,
      reason: js.UndefOr[TerminateReason] = js.undefined): WorkflowExecutionTerminatedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "childPolicy" -> childPolicy.asInstanceOf[js.Any],
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] },
        "details" -> details.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionTerminatedEventAttributes]
    }
  }

  /**
   * Provides the details of the <code>WorkflowExecutionTimedOut</code> event.
   */
  @js.native
  trait WorkflowExecutionTimedOutEventAttributes extends js.Object {
    var childPolicy: ChildPolicy
    var timeoutType: WorkflowExecutionTimeoutType
  }

  object WorkflowExecutionTimedOutEventAttributes {
    def apply(
      childPolicy: ChildPolicy,
      timeoutType: WorkflowExecutionTimeoutType): WorkflowExecutionTimedOutEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "childPolicy" -> childPolicy.asInstanceOf[js.Any],
        "timeoutType" -> timeoutType.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionTimedOutEventAttributes]
    }
  }

  object WorkflowExecutionTimeoutTypeEnum {
    val START_TO_CLOSE = "START_TO_CLOSE"

    val values = IndexedSeq(START_TO_CLOSE)
  }

  /**
   * Represents a workflow type.
   */
  @js.native
  trait WorkflowType extends js.Object {
    var name: Name
    var version: Version
  }

  object WorkflowType {
    def apply(
      name: Name,
      version: Version): WorkflowType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowType]
    }
  }

  /**
   * The configuration settings of a workflow type.
   */
  @js.native
  trait WorkflowTypeConfiguration extends js.Object {
    var defaultChildPolicy: js.UndefOr[ChildPolicy]
    var defaultExecutionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var defaultLambdaRole: js.UndefOr[Arn]
    var defaultTaskList: js.UndefOr[TaskList]
    var defaultTaskPriority: js.UndefOr[TaskPriority]
    var defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
  }

  object WorkflowTypeConfiguration {
    def apply(
      defaultChildPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      defaultExecutionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      defaultLambdaRole: js.UndefOr[Arn] = js.undefined,
      defaultTaskList: js.UndefOr[TaskList] = js.undefined,
      defaultTaskPriority: js.UndefOr[TaskPriority] = js.undefined,
      defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined): WorkflowTypeConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "defaultChildPolicy" -> defaultChildPolicy.map { x => x.asInstanceOf[js.Any] },
        "defaultExecutionStartToCloseTimeout" -> defaultExecutionStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "defaultLambdaRole" -> defaultLambdaRole.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskList" -> defaultTaskList.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskPriority" -> defaultTaskPriority.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskStartToCloseTimeout" -> defaultTaskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowTypeConfiguration]
    }
  }

  /**
   * Contains details about a workflow type.
   */
  @js.native
  trait WorkflowTypeDetail extends js.Object {
    var configuration: WorkflowTypeConfiguration
    var typeInfo: WorkflowTypeInfo
  }

  object WorkflowTypeDetail {
    def apply(
      configuration: WorkflowTypeConfiguration,
      typeInfo: WorkflowTypeInfo): WorkflowTypeDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "configuration" -> configuration.asInstanceOf[js.Any],
        "typeInfo" -> typeInfo.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowTypeDetail]
    }
  }

  /**
   * Used to filter workflow execution query results by type. Each parameter, if specified, defines a rule that must be satisfied by each returned result.
   */
  @js.native
  trait WorkflowTypeFilter extends js.Object {
    var name: Name
    var version: js.UndefOr[VersionOptional]
  }

  object WorkflowTypeFilter {
    def apply(
      name: Name,
      version: js.UndefOr[VersionOptional] = js.undefined): WorkflowTypeFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.asInstanceOf[js.Any],
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowTypeFilter]
    }
  }

  /**
   * Contains information about a workflow type.
   */
  @js.native
  trait WorkflowTypeInfo extends js.Object {
    var creationDate: Timestamp
    var status: RegistrationStatus
    var workflowType: WorkflowType
    var deprecationDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
  }

  object WorkflowTypeInfo {
    def apply(
      creationDate: Timestamp,
      status: RegistrationStatus,
      workflowType: WorkflowType,
      deprecationDate: js.UndefOr[Timestamp] = js.undefined,
      description: js.UndefOr[Description] = js.undefined): WorkflowTypeInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "creationDate" -> creationDate.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any],
        "deprecationDate" -> deprecationDate.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowTypeInfo]
    }
  }

  /**
   * Contains a paginated list of information structures about workflow types.
   */
  @js.native
  trait WorkflowTypeInfos extends js.Object {
    var typeInfos: WorkflowTypeInfoList
    var nextPageToken: js.UndefOr[PageToken]
  }

  object WorkflowTypeInfos {
    def apply(
      typeInfos: WorkflowTypeInfoList,
      nextPageToken: js.UndefOr[PageToken] = js.undefined): WorkflowTypeInfos = {
      val _fields = IndexedSeq[(String, js.Any)](
        "typeInfos" -> typeInfos.asInstanceOf[js.Any],
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowTypeInfos]
    }
  }
}
