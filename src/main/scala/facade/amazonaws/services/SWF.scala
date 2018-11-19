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
  class SWF(config: AWSConfig) extends js.Object {
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
   * <p>Unit of work sent to an activity worker.</p>
   */
  @js.native
  trait ActivityTask extends js.Object {
    var workflowExecution: js.UndefOr[WorkflowExecution]
    var activityId: js.UndefOr[ActivityId]
    var taskToken: js.UndefOr[TaskToken]
    var startedEventId: js.UndefOr[EventId]
    var activityType: js.UndefOr[ActivityType]
    var input: js.UndefOr[Data]
  }

  object ActivityTask {
    def apply(
      workflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      activityId: js.UndefOr[ActivityId] = js.undefined,
      taskToken: js.UndefOr[TaskToken] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined,
      activityType: js.UndefOr[ActivityType] = js.undefined,
      input: js.UndefOr[Data] = js.undefined): ActivityTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowExecution" -> workflowExecution.map { x => x.asInstanceOf[js.Any] },
        "activityId" -> activityId.map { x => x.asInstanceOf[js.Any] },
        "taskToken" -> taskToken.map { x => x.asInstanceOf[js.Any] },
        "startedEventId" -> startedEventId.map { x => x.asInstanceOf[js.Any] },
        "activityType" -> activityType.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTask]
    }
  }

  /**
   * <p>Provides the details of the <code>ActivityTaskCancelRequested</code> event.</p>
   */
  @js.native
  trait ActivityTaskCancelRequestedEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
    var activityId: js.UndefOr[ActivityId]
  }

  object ActivityTaskCancelRequestedEventAttributes {
    def apply(
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined,
      activityId: js.UndefOr[ActivityId] = js.undefined): ActivityTaskCancelRequestedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] },
        "activityId" -> activityId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskCancelRequestedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>ActivityTaskCanceled</code> event.</p>
   */
  @js.native
  trait ActivityTaskCanceledEventAttributes extends js.Object {
    var details: js.UndefOr[Data]
    var scheduledEventId: js.UndefOr[EventId]
    var startedEventId: js.UndefOr[EventId]
    var latestCancelRequestedEventId: js.UndefOr[EventId]
  }

  object ActivityTaskCanceledEventAttributes {
    def apply(
      details: js.UndefOr[Data] = js.undefined,
      scheduledEventId: js.UndefOr[EventId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined,
      latestCancelRequestedEventId: js.UndefOr[EventId] = js.undefined): ActivityTaskCanceledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "details" -> details.map { x => x.asInstanceOf[js.Any] },
        "scheduledEventId" -> scheduledEventId.map { x => x.asInstanceOf[js.Any] },
        "startedEventId" -> startedEventId.map { x => x.asInstanceOf[js.Any] },
        "latestCancelRequestedEventId" -> latestCancelRequestedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskCanceledEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>ActivityTaskCompleted</code> event.</p>
   */
  @js.native
  trait ActivityTaskCompletedEventAttributes extends js.Object {
    var result: js.UndefOr[Data]
    var scheduledEventId: js.UndefOr[EventId]
    var startedEventId: js.UndefOr[EventId]
  }

  object ActivityTaskCompletedEventAttributes {
    def apply(
      result: js.UndefOr[Data] = js.undefined,
      scheduledEventId: js.UndefOr[EventId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined): ActivityTaskCompletedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "result" -> result.map { x => x.asInstanceOf[js.Any] },
        "scheduledEventId" -> scheduledEventId.map { x => x.asInstanceOf[js.Any] },
        "startedEventId" -> startedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskCompletedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>ActivityTaskFailed</code> event.</p>
   */
  @js.native
  trait ActivityTaskFailedEventAttributes extends js.Object {
    var reason: js.UndefOr[FailureReason]
    var details: js.UndefOr[Data]
    var scheduledEventId: js.UndefOr[EventId]
    var startedEventId: js.UndefOr[EventId]
  }

  object ActivityTaskFailedEventAttributes {
    def apply(
      reason: js.UndefOr[FailureReason] = js.undefined,
      details: js.UndefOr[Data] = js.undefined,
      scheduledEventId: js.UndefOr[EventId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined): ActivityTaskFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] },
        "details" -> details.map { x => x.asInstanceOf[js.Any] },
        "scheduledEventId" -> scheduledEventId.map { x => x.asInstanceOf[js.Any] },
        "startedEventId" -> startedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskFailedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>ActivityTaskScheduled</code> event.</p>
   */
  @js.native
  trait ActivityTaskScheduledEventAttributes extends js.Object {
    var scheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional]
    var heartbeatTimeout: js.UndefOr[DurationInSecondsOptional]
    var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var taskList: js.UndefOr[TaskList]
    var activityId: js.UndefOr[ActivityId]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
    var activityType: js.UndefOr[ActivityType]
    var taskPriority: js.UndefOr[TaskPriority]
    var control: js.UndefOr[Data]
    var scheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var input: js.UndefOr[Data]
  }

  object ActivityTaskScheduledEventAttributes {
    def apply(
      scheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      heartbeatTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined,
      activityId: js.UndefOr[ActivityId] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined,
      activityType: js.UndefOr[ActivityType] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined,
      control: js.UndefOr[Data] = js.undefined,
      scheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      input: js.UndefOr[Data] = js.undefined): ActivityTaskScheduledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduleToStartTimeout" -> scheduleToStartTimeout.map { x => x.asInstanceOf[js.Any] },
        "heartbeatTimeout" -> heartbeatTimeout.map { x => x.asInstanceOf[js.Any] },
        "startToCloseTimeout" -> startToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "taskList" -> taskList.map { x => x.asInstanceOf[js.Any] },
        "activityId" -> activityId.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] },
        "activityType" -> activityType.map { x => x.asInstanceOf[js.Any] },
        "taskPriority" -> taskPriority.map { x => x.asInstanceOf[js.Any] },
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "scheduleToCloseTimeout" -> scheduleToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskScheduledEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>ActivityTaskStarted</code> event.</p>
   */
  @js.native
  trait ActivityTaskStartedEventAttributes extends js.Object {
    var identity: js.UndefOr[Identity]
    var scheduledEventId: js.UndefOr[EventId]
  }

  object ActivityTaskStartedEventAttributes {
    def apply(
      identity: js.UndefOr[Identity] = js.undefined,
      scheduledEventId: js.UndefOr[EventId] = js.undefined): ActivityTaskStartedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "identity" -> identity.map { x => x.asInstanceOf[js.Any] },
        "scheduledEventId" -> scheduledEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskStartedEventAttributes]
    }
  }

  /**
   * <p>Status information about an activity task.</p>
   */
  @js.native
  trait ActivityTaskStatus extends js.Object {
    var cancelRequested: js.UndefOr[Canceled]
  }

  object ActivityTaskStatus {
    def apply(
      cancelRequested: js.UndefOr[Canceled] = js.undefined): ActivityTaskStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cancelRequested" -> cancelRequested.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskStatus]
    }
  }

  /**
   * <p>Provides the details of the <code>ActivityTaskTimedOut</code> event.</p>
   */
  @js.native
  trait ActivityTaskTimedOutEventAttributes extends js.Object {
    var timeoutType: js.UndefOr[ActivityTaskTimeoutType]
    var scheduledEventId: js.UndefOr[EventId]
    var startedEventId: js.UndefOr[EventId]
    var details: js.UndefOr[LimitedData]
  }

  object ActivityTaskTimedOutEventAttributes {
    def apply(
      timeoutType: js.UndefOr[ActivityTaskTimeoutType] = js.undefined,
      scheduledEventId: js.UndefOr[EventId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined,
      details: js.UndefOr[LimitedData] = js.undefined): ActivityTaskTimedOutEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "timeoutType" -> timeoutType.map { x => x.asInstanceOf[js.Any] },
        "scheduledEventId" -> scheduledEventId.map { x => x.asInstanceOf[js.Any] },
        "startedEventId" -> startedEventId.map { x => x.asInstanceOf[js.Any] },
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
   * <p>Represents an activity type.</p>
   */
  @js.native
  trait ActivityType extends js.Object {
    var name: js.UndefOr[Name]
    var version: js.UndefOr[Version]
  }

  object ActivityType {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      version: js.UndefOr[Version] = js.undefined): ActivityType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityType]
    }
  }

  /**
   * <p>Configuration settings registered with the activity type.</p>
   */
  @js.native
  trait ActivityTypeConfiguration extends js.Object {
    var defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var defaultTaskScheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional]
    var defaultTaskList: js.UndefOr[TaskList]
    var defaultTaskScheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var defaultTaskHeartbeatTimeout: js.UndefOr[DurationInSecondsOptional]
    var defaultTaskPriority: js.UndefOr[TaskPriority]
  }

  object ActivityTypeConfiguration {
    def apply(
      defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      defaultTaskScheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      defaultTaskList: js.UndefOr[TaskList] = js.undefined,
      defaultTaskScheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      defaultTaskHeartbeatTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      defaultTaskPriority: js.UndefOr[TaskPriority] = js.undefined): ActivityTypeConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "defaultTaskStartToCloseTimeout" -> defaultTaskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskScheduleToStartTimeout" -> defaultTaskScheduleToStartTimeout.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskList" -> defaultTaskList.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskScheduleToCloseTimeout" -> defaultTaskScheduleToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskHeartbeatTimeout" -> defaultTaskHeartbeatTimeout.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskPriority" -> defaultTaskPriority.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTypeConfiguration]
    }
  }

  /**
   * <p>Detailed information about an activity type.</p>
   */
  @js.native
  trait ActivityTypeDetail extends js.Object {
    var typeInfo: js.UndefOr[ActivityTypeInfo]
    var configuration: js.UndefOr[ActivityTypeConfiguration]
  }

  object ActivityTypeDetail {
    def apply(
      typeInfo: js.UndefOr[ActivityTypeInfo] = js.undefined,
      configuration: js.UndefOr[ActivityTypeConfiguration] = js.undefined): ActivityTypeDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "typeInfo" -> typeInfo.map { x => x.asInstanceOf[js.Any] },
        "configuration" -> configuration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTypeDetail]
    }
  }

  /**
   * <p>Detailed information about an activity type.</p>
   */
  @js.native
  trait ActivityTypeInfo extends js.Object {
    var description: js.UndefOr[Description]
    var activityType: js.UndefOr[ActivityType]
    var status: js.UndefOr[RegistrationStatus]
    var deprecationDate: js.UndefOr[Timestamp]
    var creationDate: js.UndefOr[Timestamp]
  }

  object ActivityTypeInfo {
    def apply(
      description: js.UndefOr[Description] = js.undefined,
      activityType: js.UndefOr[ActivityType] = js.undefined,
      status: js.UndefOr[RegistrationStatus] = js.undefined,
      deprecationDate: js.UndefOr[Timestamp] = js.undefined,
      creationDate: js.UndefOr[Timestamp] = js.undefined): ActivityTypeInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "activityType" -> activityType.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "deprecationDate" -> deprecationDate.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTypeInfo]
    }
  }

  /**
   * <p>Contains a paginated list of activity type information structures.</p>
   */
  @js.native
  trait ActivityTypeInfos extends js.Object {
    var typeInfos: js.UndefOr[ActivityTypeInfoList]
    var nextPageToken: js.UndefOr[PageToken]
  }

  object ActivityTypeInfos {
    def apply(
      typeInfos: js.UndefOr[ActivityTypeInfoList] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined): ActivityTypeInfos = {
      val _fields = IndexedSeq[(String, js.Any)](
        "typeInfos" -> typeInfos.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTypeInfos]
    }
  }

  /**
   * <p>Provides the details of the <code>CancelTimer</code> decision.</p> <p> <b>Access Control</b> </p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li> <p>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</p> </li> <li> <p>Use an <code>Action</code> element to allow or deny permission to call this action.</p> </li> <li> <p>You cannot use an IAM policy to constrain this action's parameters.</p> </li> </ul> <p>If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.</p>
   */
  @js.native
  trait CancelTimerDecisionAttributes extends js.Object {
    var timerId: js.UndefOr[TimerId]
  }

  object CancelTimerDecisionAttributes {
    def apply(
      timerId: js.UndefOr[TimerId] = js.undefined): CancelTimerDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "timerId" -> timerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelTimerDecisionAttributes]
    }
  }

  object CancelTimerFailedCauseEnum {
    val TIMER_ID_UNKNOWN = "TIMER_ID_UNKNOWN"
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(TIMER_ID_UNKNOWN, OPERATION_NOT_PERMITTED)
  }

  /**
   * <p>Provides the details of the <code>CancelTimerFailed</code> event.</p>
   */
  @js.native
  trait CancelTimerFailedEventAttributes extends js.Object {
    var timerId: js.UndefOr[TimerId]
    var cause: js.UndefOr[CancelTimerFailedCause]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
  }

  object CancelTimerFailedEventAttributes {
    def apply(
      timerId: js.UndefOr[TimerId] = js.undefined,
      cause: js.UndefOr[CancelTimerFailedCause] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined): CancelTimerFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "timerId" -> timerId.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelTimerFailedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>CancelWorkflowExecution</code> decision.</p> <p> <b>Access Control</b> </p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li> <p>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</p> </li> <li> <p>Use an <code>Action</code> element to allow or deny permission to call this action.</p> </li> <li> <p>You cannot use an IAM policy to constrain this action's parameters.</p> </li> </ul> <p>If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.</p>
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
   * <p>Provides the details of the <code>CancelWorkflowExecutionFailed</code> event.</p>
   */
  @js.native
  trait CancelWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: js.UndefOr[CancelWorkflowExecutionFailedCause]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
  }

  object CancelWorkflowExecutionFailedEventAttributes {
    def apply(
      cause: js.UndefOr[CancelWorkflowExecutionFailedCause] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined): CancelWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Provide details of the <code>ChildWorkflowExecutionCanceled</code> event.</p>
   */
  @js.native
  trait ChildWorkflowExecutionCanceledEventAttributes extends js.Object {
    var workflowType: js.UndefOr[WorkflowType]
    var initiatedEventId: js.UndefOr[EventId]
    var workflowExecution: js.UndefOr[WorkflowExecution]
    var startedEventId: js.UndefOr[EventId]
    var details: js.UndefOr[Data]
  }

  object ChildWorkflowExecutionCanceledEventAttributes {
    def apply(
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      initiatedEventId: js.UndefOr[EventId] = js.undefined,
      workflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined,
      details: js.UndefOr[Data] = js.undefined): ChildWorkflowExecutionCanceledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowType" -> workflowType.map { x => x.asInstanceOf[js.Any] },
        "initiatedEventId" -> initiatedEventId.map { x => x.asInstanceOf[js.Any] },
        "workflowExecution" -> workflowExecution.map { x => x.asInstanceOf[js.Any] },
        "startedEventId" -> startedEventId.map { x => x.asInstanceOf[js.Any] },
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChildWorkflowExecutionCanceledEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>ChildWorkflowExecutionCompleted</code> event.</p>
   */
  @js.native
  trait ChildWorkflowExecutionCompletedEventAttributes extends js.Object {
    var workflowType: js.UndefOr[WorkflowType]
    var initiatedEventId: js.UndefOr[EventId]
    var result: js.UndefOr[Data]
    var workflowExecution: js.UndefOr[WorkflowExecution]
    var startedEventId: js.UndefOr[EventId]
  }

  object ChildWorkflowExecutionCompletedEventAttributes {
    def apply(
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      initiatedEventId: js.UndefOr[EventId] = js.undefined,
      result: js.UndefOr[Data] = js.undefined,
      workflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined): ChildWorkflowExecutionCompletedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowType" -> workflowType.map { x => x.asInstanceOf[js.Any] },
        "initiatedEventId" -> initiatedEventId.map { x => x.asInstanceOf[js.Any] },
        "result" -> result.map { x => x.asInstanceOf[js.Any] },
        "workflowExecution" -> workflowExecution.map { x => x.asInstanceOf[js.Any] },
        "startedEventId" -> startedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChildWorkflowExecutionCompletedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>ChildWorkflowExecutionFailed</code> event.</p>
   */
  @js.native
  trait ChildWorkflowExecutionFailedEventAttributes extends js.Object {
    var workflowType: js.UndefOr[WorkflowType]
    var initiatedEventId: js.UndefOr[EventId]
    var workflowExecution: js.UndefOr[WorkflowExecution]
    var reason: js.UndefOr[FailureReason]
    var startedEventId: js.UndefOr[EventId]
    var details: js.UndefOr[Data]
  }

  object ChildWorkflowExecutionFailedEventAttributes {
    def apply(
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      initiatedEventId: js.UndefOr[EventId] = js.undefined,
      workflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      reason: js.UndefOr[FailureReason] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined,
      details: js.UndefOr[Data] = js.undefined): ChildWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowType" -> workflowType.map { x => x.asInstanceOf[js.Any] },
        "initiatedEventId" -> initiatedEventId.map { x => x.asInstanceOf[js.Any] },
        "workflowExecution" -> workflowExecution.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] },
        "startedEventId" -> startedEventId.map { x => x.asInstanceOf[js.Any] },
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChildWorkflowExecutionFailedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>ChildWorkflowExecutionStarted</code> event.</p>
   */
  @js.native
  trait ChildWorkflowExecutionStartedEventAttributes extends js.Object {
    var workflowExecution: js.UndefOr[WorkflowExecution]
    var workflowType: js.UndefOr[WorkflowType]
    var initiatedEventId: js.UndefOr[EventId]
  }

  object ChildWorkflowExecutionStartedEventAttributes {
    def apply(
      workflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      initiatedEventId: js.UndefOr[EventId] = js.undefined): ChildWorkflowExecutionStartedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowExecution" -> workflowExecution.map { x => x.asInstanceOf[js.Any] },
        "workflowType" -> workflowType.map { x => x.asInstanceOf[js.Any] },
        "initiatedEventId" -> initiatedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChildWorkflowExecutionStartedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>ChildWorkflowExecutionTerminated</code> event.</p>
   */
  @js.native
  trait ChildWorkflowExecutionTerminatedEventAttributes extends js.Object {
    var workflowExecution: js.UndefOr[WorkflowExecution]
    var workflowType: js.UndefOr[WorkflowType]
    var initiatedEventId: js.UndefOr[EventId]
    var startedEventId: js.UndefOr[EventId]
  }

  object ChildWorkflowExecutionTerminatedEventAttributes {
    def apply(
      workflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      initiatedEventId: js.UndefOr[EventId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined): ChildWorkflowExecutionTerminatedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowExecution" -> workflowExecution.map { x => x.asInstanceOf[js.Any] },
        "workflowType" -> workflowType.map { x => x.asInstanceOf[js.Any] },
        "initiatedEventId" -> initiatedEventId.map { x => x.asInstanceOf[js.Any] },
        "startedEventId" -> startedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChildWorkflowExecutionTerminatedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>ChildWorkflowExecutionTimedOut</code> event.</p>
   */
  @js.native
  trait ChildWorkflowExecutionTimedOutEventAttributes extends js.Object {
    var workflowType: js.UndefOr[WorkflowType]
    var initiatedEventId: js.UndefOr[EventId]
    var timeoutType: js.UndefOr[WorkflowExecutionTimeoutType]
    var workflowExecution: js.UndefOr[WorkflowExecution]
    var startedEventId: js.UndefOr[EventId]
  }

  object ChildWorkflowExecutionTimedOutEventAttributes {
    def apply(
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      initiatedEventId: js.UndefOr[EventId] = js.undefined,
      timeoutType: js.UndefOr[WorkflowExecutionTimeoutType] = js.undefined,
      workflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined): ChildWorkflowExecutionTimedOutEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowType" -> workflowType.map { x => x.asInstanceOf[js.Any] },
        "initiatedEventId" -> initiatedEventId.map { x => x.asInstanceOf[js.Any] },
        "timeoutType" -> timeoutType.map { x => x.asInstanceOf[js.Any] },
        "workflowExecution" -> workflowExecution.map { x => x.asInstanceOf[js.Any] },
        "startedEventId" -> startedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Used to filter the closed workflow executions in visibility APIs by their close status.</p>
   */
  @js.native
  trait CloseStatusFilter extends js.Object {
    var status: js.UndefOr[CloseStatus]
  }

  object CloseStatusFilter {
    def apply(
      status: js.UndefOr[CloseStatus] = js.undefined): CloseStatusFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloseStatusFilter]
    }
  }

  /**
   * <p>Provides the details of the <code>CompleteWorkflowExecution</code> decision.</p> <p> <b>Access Control</b> </p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li> <p>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</p> </li> <li> <p>Use an <code>Action</code> element to allow or deny permission to call this action.</p> </li> <li> <p>You cannot use an IAM policy to constrain this action's parameters.</p> </li> </ul> <p>If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.</p>
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
   * <p>Provides the details of the <code>CompleteWorkflowExecutionFailed</code> event.</p>
   */
  @js.native
  trait CompleteWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: js.UndefOr[CompleteWorkflowExecutionFailedCause]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
  }

  object CompleteWorkflowExecutionFailedEventAttributes {
    def apply(
      cause: js.UndefOr[CompleteWorkflowExecutionFailedCause] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined): CompleteWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteWorkflowExecutionFailedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>ContinueAsNewWorkflowExecution</code> decision.</p> <p> <b>Access Control</b> </p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li> <p>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</p> </li> <li> <p>Use an <code>Action</code> element to allow or deny permission to call this action.</p> </li> <li> <p>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.</p> <ul> <li> <p> <code>tag</code> – A tag used to identify the workflow execution</p> </li> <li> <p> <code>taskList</code> – String constraint. The key is <code>swf:taskList.name</code>.</p> </li> <li> <p> <code>workflowType.version</code> – String constraint. The key is <code>swf:workflowType.version</code>.</p> </li> </ul> </li> </ul> <p>If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.</p>
   */
  @js.native
  trait ContinueAsNewWorkflowExecutionDecisionAttributes extends js.Object {
    var lambdaRole: js.UndefOr[Arn]
    var taskList: js.UndefOr[TaskList]
    var tagList: js.UndefOr[TagList]
    var workflowTypeVersion: js.UndefOr[Version]
    var taskPriority: js.UndefOr[TaskPriority]
    var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var childPolicy: js.UndefOr[ChildPolicy]
    var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var input: js.UndefOr[Data]
  }

  object ContinueAsNewWorkflowExecutionDecisionAttributes {
    def apply(
      lambdaRole: js.UndefOr[Arn] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined,
      tagList: js.UndefOr[TagList] = js.undefined,
      workflowTypeVersion: js.UndefOr[Version] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined,
      taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      childPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      input: js.UndefOr[Data] = js.undefined): ContinueAsNewWorkflowExecutionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lambdaRole" -> lambdaRole.map { x => x.asInstanceOf[js.Any] },
        "taskList" -> taskList.map { x => x.asInstanceOf[js.Any] },
        "tagList" -> tagList.map { x => x.asInstanceOf[js.Any] },
        "workflowTypeVersion" -> workflowTypeVersion.map { x => x.asInstanceOf[js.Any] },
        "taskPriority" -> taskPriority.map { x => x.asInstanceOf[js.Any] },
        "taskStartToCloseTimeout" -> taskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "childPolicy" -> childPolicy.map { x => x.asInstanceOf[js.Any] },
        "executionStartToCloseTimeout" -> executionStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Provides the details of the <code>ContinueAsNewWorkflowExecutionFailed</code> event.</p>
   */
  @js.native
  trait ContinueAsNewWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: js.UndefOr[ContinueAsNewWorkflowExecutionFailedCause]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
  }

  object ContinueAsNewWorkflowExecutionFailedEventAttributes {
    def apply(
      cause: js.UndefOr[ContinueAsNewWorkflowExecutionFailedCause] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined): ContinueAsNewWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContinueAsNewWorkflowExecutionFailedEventAttributes]
    }
  }

  @js.native
  trait CountClosedWorkflowExecutionsInput extends js.Object {
    var executionFilter: js.UndefOr[WorkflowExecutionFilter]
    var startTimeFilter: js.UndefOr[ExecutionTimeFilter]
    var domain: js.UndefOr[DomainName]
    var closeStatusFilter: js.UndefOr[CloseStatusFilter]
    var closeTimeFilter: js.UndefOr[ExecutionTimeFilter]
    var typeFilter: js.UndefOr[WorkflowTypeFilter]
    var tagFilter: js.UndefOr[TagFilter]
  }

  object CountClosedWorkflowExecutionsInput {
    def apply(
      executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined,
      startTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined,
      domain: js.UndefOr[DomainName] = js.undefined,
      closeStatusFilter: js.UndefOr[CloseStatusFilter] = js.undefined,
      closeTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined,
      typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined,
      tagFilter: js.UndefOr[TagFilter] = js.undefined): CountClosedWorkflowExecutionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionFilter" -> executionFilter.map { x => x.asInstanceOf[js.Any] },
        "startTimeFilter" -> startTimeFilter.map { x => x.asInstanceOf[js.Any] },
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "closeStatusFilter" -> closeStatusFilter.map { x => x.asInstanceOf[js.Any] },
        "closeTimeFilter" -> closeTimeFilter.map { x => x.asInstanceOf[js.Any] },
        "typeFilter" -> typeFilter.map { x => x.asInstanceOf[js.Any] },
        "tagFilter" -> tagFilter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CountClosedWorkflowExecutionsInput]
    }
  }

  @js.native
  trait CountOpenWorkflowExecutionsInput extends js.Object {
    var executionFilter: js.UndefOr[WorkflowExecutionFilter]
    var startTimeFilter: js.UndefOr[ExecutionTimeFilter]
    var domain: js.UndefOr[DomainName]
    var typeFilter: js.UndefOr[WorkflowTypeFilter]
    var tagFilter: js.UndefOr[TagFilter]
  }

  object CountOpenWorkflowExecutionsInput {
    def apply(
      executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined,
      startTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined,
      domain: js.UndefOr[DomainName] = js.undefined,
      typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined,
      tagFilter: js.UndefOr[TagFilter] = js.undefined): CountOpenWorkflowExecutionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionFilter" -> executionFilter.map { x => x.asInstanceOf[js.Any] },
        "startTimeFilter" -> startTimeFilter.map { x => x.asInstanceOf[js.Any] },
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "typeFilter" -> typeFilter.map { x => x.asInstanceOf[js.Any] },
        "tagFilter" -> tagFilter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CountOpenWorkflowExecutionsInput]
    }
  }

  @js.native
  trait CountPendingActivityTasksInput extends js.Object {
    var domain: js.UndefOr[DomainName]
    var taskList: js.UndefOr[TaskList]
  }

  object CountPendingActivityTasksInput {
    def apply(
      domain: js.UndefOr[DomainName] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined): CountPendingActivityTasksInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "taskList" -> taskList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CountPendingActivityTasksInput]
    }
  }

  @js.native
  trait CountPendingDecisionTasksInput extends js.Object {
    var domain: js.UndefOr[DomainName]
    var taskList: js.UndefOr[TaskList]
  }

  object CountPendingDecisionTasksInput {
    def apply(
      domain: js.UndefOr[DomainName] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined): CountPendingDecisionTasksInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "taskList" -> taskList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CountPendingDecisionTasksInput]
    }
  }

  /**
   * <p>Specifies a decision made by the decider. A decision can be one of these types:</p> <ul> <li> <p> <code>CancelTimer</code> – Cancels a previously started timer and records a <code>TimerCanceled</code> event in the history.</p> </li> <li> <p> <code>CancelWorkflowExecution</code> – Closes the workflow execution and records a <code>WorkflowExecutionCanceled</code> event in the history.</p> </li> <li> <p> <code>CompleteWorkflowExecution</code> – Closes the workflow execution and records a <code>WorkflowExecutionCompleted</code> event in the history .</p> </li> <li> <p> <code>ContinueAsNewWorkflowExecution</code> – Closes the workflow execution and starts a new workflow execution of the same type using the same workflow ID and a unique run Id. A <code>WorkflowExecutionContinuedAsNew</code> event is recorded in the history.</p> </li> <li> <p> <code>FailWorkflowExecution</code> – Closes the workflow execution and records a <code>WorkflowExecutionFailed</code> event in the history.</p> </li> <li> <p> <code>RecordMarker</code> – Records a <code>MarkerRecorded</code> event in the history. Markers can be used for adding custom information in the history for instance to let deciders know that they don't need to look at the history beyond the marker event.</p> </li> <li> <p> <code>RequestCancelActivityTask</code> – Attempts to cancel a previously scheduled activity task. If the activity task was scheduled but has not been assigned to a worker, then it is canceled. If the activity task was already assigned to a worker, then the worker is informed that cancellation has been requested in the response to <a>RecordActivityTaskHeartbeat</a>.</p> </li> <li> <p> <code>RequestCancelExternalWorkflowExecution</code> – Requests that a request be made to cancel the specified external workflow execution and records a <code>RequestCancelExternalWorkflowExecutionInitiated</code> event in the history.</p> </li> <li> <p> <code>ScheduleActivityTask</code> – Schedules an activity task.</p> </li> <li> <p> <code>SignalExternalWorkflowExecution</code> – Requests a signal to be delivered to the specified external workflow execution and records a <code>SignalExternalWorkflowExecutionInitiated</code> event in the history.</p> </li> <li> <p> <code>StartChildWorkflowExecution</code> – Requests that a child workflow execution be started and records a <code>StartChildWorkflowExecutionInitiated</code> event in the history. The child workflow execution is a separate workflow execution with its own history.</p> </li> <li> <p> <code>StartTimer</code> – Starts a timer for this workflow execution and records a <code>TimerStarted</code> event in the history. This timer fires after the specified delay and record a <code>TimerFired</code> event.</p> </li> </ul> <p> <b>Access Control</b> </p> <p>If you grant permission to use <code>RespondDecisionTaskCompleted</code>, you can use IAM policies to express permissions for the list of decisions returned by this action as if they were members of the API. Treating decisions as a pseudo API maintains a uniform conceptual model and helps keep policies readable. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.</p> <p> <b>Decision Failure</b> </p> <p>Decisions can fail for several reasons</p> <ul> <li> <p>The ordering of decisions should follow a logical flow. Some decisions might not make sense in the current context of the workflow execution and therefore fails.</p> </li> <li> <p>A limit on your account was reached.</p> </li> <li> <p>The decision lacks sufficient permissions.</p> </li> </ul> <p>One of the following events might be added to the history to indicate an error. The event attribute's <code>cause</code> parameter indicates the cause. If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it lacked sufficient permissions. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.</p> <ul> <li> <p> <code>ScheduleActivityTaskFailed</code> – A <code>ScheduleActivityTask</code> decision failed. This could happen if the activity type specified in the decision isn't registered, is in a deprecated state, or the decision isn't properly configured.</p> </li> <li> <p> <code>RequestCancelActivityTaskFailed</code> – A <code>RequestCancelActivityTask</code> decision failed. This could happen if there is no open activity task with the specified activityId.</p> </li> <li> <p> <code>StartTimerFailed</code> – A <code>StartTimer</code> decision failed. This could happen if there is another open timer with the same timerId.</p> </li> <li> <p> <code>CancelTimerFailed</code> – A <code>CancelTimer</code> decision failed. This could happen if there is no open timer with the specified timerId.</p> </li> <li> <p> <code>StartChildWorkflowExecutionFailed</code> – A <code>StartChildWorkflowExecution</code> decision failed. This could happen if the workflow type specified isn't registered, is deprecated, or the decision isn't properly configured.</p> </li> <li> <p> <code>SignalExternalWorkflowExecutionFailed</code> – A <code>SignalExternalWorkflowExecution</code> decision failed. This could happen if the <code>workflowID</code> specified in the decision was incorrect.</p> </li> <li> <p> <code>RequestCancelExternalWorkflowExecutionFailed</code> – A <code>RequestCancelExternalWorkflowExecution</code> decision failed. This could happen if the <code>workflowID</code> specified in the decision was incorrect.</p> </li> <li> <p> <code>CancelWorkflowExecutionFailed</code> – A <code>CancelWorkflowExecution</code> decision failed. This could happen if there is an unhandled decision task pending in the workflow execution.</p> </li> <li> <p> <code>CompleteWorkflowExecutionFailed</code> – A <code>CompleteWorkflowExecution</code> decision failed. This could happen if there is an unhandled decision task pending in the workflow execution.</p> </li> <li> <p> <code>ContinueAsNewWorkflowExecutionFailed</code> – A <code>ContinueAsNewWorkflowExecution</code> decision failed. This could happen if there is an unhandled decision task pending in the workflow execution or the ContinueAsNewWorkflowExecution decision was not configured correctly.</p> </li> <li> <p> <code>FailWorkflowExecutionFailed</code> – A <code>FailWorkflowExecution</code> decision failed. This could happen if there is an unhandled decision task pending in the workflow execution.</p> </li> </ul> <p>The preceding error events might occur due to an error in the decider logic, which might put the workflow execution in an unstable state The cause field in the event structure for the error event indicates the cause of the error.</p> <note> <p>A workflow execution may be closed by the decider by returning one of the following decisions when completing a decision task: <code>CompleteWorkflowExecution</code>, <code>FailWorkflowExecution</code>, <code>CancelWorkflowExecution</code> and <code>ContinueAsNewWorkflowExecution</code>. An <code>UnhandledDecision</code> fault is returned if a workflow closing decision is specified and a signal or activity event had been added to the history while the decision task was being performed by the decider. Unlike the above situations which are logic issues, this fault is always possible because of race conditions in a distributed system. The right action here is to call <a>RespondDecisionTaskCompleted</a> without any decisions. This would result in another decision task with these new events included in the history. The decider should handle the new events and may decide to close the workflow execution.</p> </note> <p> <b>How to Code a Decision</b> </p> <p>You code a decision by first setting the decision type field to one of the above decision values, and then set the corresponding attributes field shown below:</p> <ul> <li> <p> <code> <a>ScheduleActivityTaskDecisionAttributes</a> </code> </p> </li> <li> <p> <code> <a>RequestCancelActivityTaskDecisionAttributes</a> </code> </p> </li> <li> <p> <code> <a>CompleteWorkflowExecutionDecisionAttributes</a> </code> </p> </li> <li> <p> <code> <a>FailWorkflowExecutionDecisionAttributes</a> </code> </p> </li> <li> <p> <code> <a>CancelWorkflowExecutionDecisionAttributes</a> </code> </p> </li> <li> <p> <code> <a>ContinueAsNewWorkflowExecutionDecisionAttributes</a> </code> </p> </li> <li> <p> <code> <a>RecordMarkerDecisionAttributes</a> </code> </p> </li> <li> <p> <code> <a>StartTimerDecisionAttributes</a> </code> </p> </li> <li> <p> <code> <a>CancelTimerDecisionAttributes</a> </code> </p> </li> <li> <p> <code> <a>SignalExternalWorkflowExecutionDecisionAttributes</a> </code> </p> </li> <li> <p> <code> <a>RequestCancelExternalWorkflowExecutionDecisionAttributes</a> </code> </p> </li> <li> <p> <code> <a>StartChildWorkflowExecutionDecisionAttributes</a> </code> </p> </li> </ul>
   */
  @js.native
  trait Decision extends js.Object {
    var startTimerDecisionAttributes: js.UndefOr[StartTimerDecisionAttributes]
    var decisionType: js.UndefOr[DecisionType]
    var requestCancelActivityTaskDecisionAttributes: js.UndefOr[RequestCancelActivityTaskDecisionAttributes]
    var signalExternalWorkflowExecutionDecisionAttributes: js.UndefOr[SignalExternalWorkflowExecutionDecisionAttributes]
    var completeWorkflowExecutionDecisionAttributes: js.UndefOr[CompleteWorkflowExecutionDecisionAttributes]
    var recordMarkerDecisionAttributes: js.UndefOr[RecordMarkerDecisionAttributes]
    var startChildWorkflowExecutionDecisionAttributes: js.UndefOr[StartChildWorkflowExecutionDecisionAttributes]
    var scheduleActivityTaskDecisionAttributes: js.UndefOr[ScheduleActivityTaskDecisionAttributes]
    var requestCancelExternalWorkflowExecutionDecisionAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionDecisionAttributes]
    var cancelWorkflowExecutionDecisionAttributes: js.UndefOr[CancelWorkflowExecutionDecisionAttributes]
    var cancelTimerDecisionAttributes: js.UndefOr[CancelTimerDecisionAttributes]
    var failWorkflowExecutionDecisionAttributes: js.UndefOr[FailWorkflowExecutionDecisionAttributes]
    var scheduleLambdaFunctionDecisionAttributes: js.UndefOr[ScheduleLambdaFunctionDecisionAttributes]
    var continueAsNewWorkflowExecutionDecisionAttributes: js.UndefOr[ContinueAsNewWorkflowExecutionDecisionAttributes]
  }

  object Decision {
    def apply(
      startTimerDecisionAttributes: js.UndefOr[StartTimerDecisionAttributes] = js.undefined,
      decisionType: js.UndefOr[DecisionType] = js.undefined,
      requestCancelActivityTaskDecisionAttributes: js.UndefOr[RequestCancelActivityTaskDecisionAttributes] = js.undefined,
      signalExternalWorkflowExecutionDecisionAttributes: js.UndefOr[SignalExternalWorkflowExecutionDecisionAttributes] = js.undefined,
      completeWorkflowExecutionDecisionAttributes: js.UndefOr[CompleteWorkflowExecutionDecisionAttributes] = js.undefined,
      recordMarkerDecisionAttributes: js.UndefOr[RecordMarkerDecisionAttributes] = js.undefined,
      startChildWorkflowExecutionDecisionAttributes: js.UndefOr[StartChildWorkflowExecutionDecisionAttributes] = js.undefined,
      scheduleActivityTaskDecisionAttributes: js.UndefOr[ScheduleActivityTaskDecisionAttributes] = js.undefined,
      requestCancelExternalWorkflowExecutionDecisionAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionDecisionAttributes] = js.undefined,
      cancelWorkflowExecutionDecisionAttributes: js.UndefOr[CancelWorkflowExecutionDecisionAttributes] = js.undefined,
      cancelTimerDecisionAttributes: js.UndefOr[CancelTimerDecisionAttributes] = js.undefined,
      failWorkflowExecutionDecisionAttributes: js.UndefOr[FailWorkflowExecutionDecisionAttributes] = js.undefined,
      scheduleLambdaFunctionDecisionAttributes: js.UndefOr[ScheduleLambdaFunctionDecisionAttributes] = js.undefined,
      continueAsNewWorkflowExecutionDecisionAttributes: js.UndefOr[ContinueAsNewWorkflowExecutionDecisionAttributes] = js.undefined): Decision = {
      val _fields = IndexedSeq[(String, js.Any)](
        "startTimerDecisionAttributes" -> startTimerDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "decisionType" -> decisionType.map { x => x.asInstanceOf[js.Any] },
        "requestCancelActivityTaskDecisionAttributes" -> requestCancelActivityTaskDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "signalExternalWorkflowExecutionDecisionAttributes" -> signalExternalWorkflowExecutionDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "completeWorkflowExecutionDecisionAttributes" -> completeWorkflowExecutionDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "recordMarkerDecisionAttributes" -> recordMarkerDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "startChildWorkflowExecutionDecisionAttributes" -> startChildWorkflowExecutionDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "scheduleActivityTaskDecisionAttributes" -> scheduleActivityTaskDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "requestCancelExternalWorkflowExecutionDecisionAttributes" -> requestCancelExternalWorkflowExecutionDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "cancelWorkflowExecutionDecisionAttributes" -> cancelWorkflowExecutionDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "cancelTimerDecisionAttributes" -> cancelTimerDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "failWorkflowExecutionDecisionAttributes" -> failWorkflowExecutionDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "scheduleLambdaFunctionDecisionAttributes" -> scheduleLambdaFunctionDecisionAttributes.map { x => x.asInstanceOf[js.Any] },
        "continueAsNewWorkflowExecutionDecisionAttributes" -> continueAsNewWorkflowExecutionDecisionAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Decision]
    }
  }

  /**
   * <p>A structure that represents a decision task. Decision tasks are sent to deciders in order for them to make decisions.</p>
   */
  @js.native
  trait DecisionTask extends js.Object {
    var previousStartedEventId: js.UndefOr[EventId]
    var workflowType: js.UndefOr[WorkflowType]
    var nextPageToken: js.UndefOr[PageToken]
    var workflowExecution: js.UndefOr[WorkflowExecution]
    var taskToken: js.UndefOr[TaskToken]
    var startedEventId: js.UndefOr[EventId]
    var events: js.UndefOr[HistoryEventList]
  }

  object DecisionTask {
    def apply(
      previousStartedEventId: js.UndefOr[EventId] = js.undefined,
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      workflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      taskToken: js.UndefOr[TaskToken] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined,
      events: js.UndefOr[HistoryEventList] = js.undefined): DecisionTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        "previousStartedEventId" -> previousStartedEventId.map { x => x.asInstanceOf[js.Any] },
        "workflowType" -> workflowType.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] },
        "workflowExecution" -> workflowExecution.map { x => x.asInstanceOf[js.Any] },
        "taskToken" -> taskToken.map { x => x.asInstanceOf[js.Any] },
        "startedEventId" -> startedEventId.map { x => x.asInstanceOf[js.Any] },
        "events" -> events.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecisionTask]
    }
  }

  /**
   * <p>Provides the details of the <code>DecisionTaskCompleted</code> event.</p>
   */
  @js.native
  trait DecisionTaskCompletedEventAttributes extends js.Object {
    var executionContext: js.UndefOr[Data]
    var scheduledEventId: js.UndefOr[EventId]
    var startedEventId: js.UndefOr[EventId]
  }

  object DecisionTaskCompletedEventAttributes {
    def apply(
      executionContext: js.UndefOr[Data] = js.undefined,
      scheduledEventId: js.UndefOr[EventId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined): DecisionTaskCompletedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionContext" -> executionContext.map { x => x.asInstanceOf[js.Any] },
        "scheduledEventId" -> scheduledEventId.map { x => x.asInstanceOf[js.Any] },
        "startedEventId" -> startedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecisionTaskCompletedEventAttributes]
    }
  }

  /**
   * <p>Provides details about the <code>DecisionTaskScheduled</code> event.</p>
   */
  @js.native
  trait DecisionTaskScheduledEventAttributes extends js.Object {
    var taskList: js.UndefOr[TaskList]
    var taskPriority: js.UndefOr[TaskPriority]
    var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
  }

  object DecisionTaskScheduledEventAttributes {
    def apply(
      taskList: js.UndefOr[TaskList] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined,
      startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined): DecisionTaskScheduledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskList" -> taskList.map { x => x.asInstanceOf[js.Any] },
        "taskPriority" -> taskPriority.map { x => x.asInstanceOf[js.Any] },
        "startToCloseTimeout" -> startToCloseTimeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecisionTaskScheduledEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>DecisionTaskStarted</code> event.</p>
   */
  @js.native
  trait DecisionTaskStartedEventAttributes extends js.Object {
    var identity: js.UndefOr[Identity]
    var scheduledEventId: js.UndefOr[EventId]
  }

  object DecisionTaskStartedEventAttributes {
    def apply(
      identity: js.UndefOr[Identity] = js.undefined,
      scheduledEventId: js.UndefOr[EventId] = js.undefined): DecisionTaskStartedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "identity" -> identity.map { x => x.asInstanceOf[js.Any] },
        "scheduledEventId" -> scheduledEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecisionTaskStartedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>DecisionTaskTimedOut</code> event.</p>
   */
  @js.native
  trait DecisionTaskTimedOutEventAttributes extends js.Object {
    var timeoutType: js.UndefOr[DecisionTaskTimeoutType]
    var scheduledEventId: js.UndefOr[EventId]
    var startedEventId: js.UndefOr[EventId]
  }

  object DecisionTaskTimedOutEventAttributes {
    def apply(
      timeoutType: js.UndefOr[DecisionTaskTimeoutType] = js.undefined,
      scheduledEventId: js.UndefOr[EventId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined): DecisionTaskTimedOutEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "timeoutType" -> timeoutType.map { x => x.asInstanceOf[js.Any] },
        "scheduledEventId" -> scheduledEventId.map { x => x.asInstanceOf[js.Any] },
        "startedEventId" -> startedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>The <code>StartWorkflowExecution</code> API action was called without the required parameters set.</p> <p>Some workflow execution parameters, such as the decision <code>taskList</code>, must be set to start the execution. However, these parameters might have been set as defaults when the workflow type was registered. In this case, you can omit these parameters from the <code>StartWorkflowExecution</code> call and Amazon SWF uses the values defined in the workflow type.</p> <note> <p>If these parameters aren't set and no default parameters were defined in the workflow type, this error is displayed.</p> </note>
   */
  @js.native
  trait DefaultUndefinedFaultException extends js.Object {
    val message: ErrorMessage
  }

  @js.native
  trait DeprecateActivityTypeInput extends js.Object {
    var domain: js.UndefOr[DomainName]
    var activityType: js.UndefOr[ActivityType]
  }

  object DeprecateActivityTypeInput {
    def apply(
      domain: js.UndefOr[DomainName] = js.undefined,
      activityType: js.UndefOr[ActivityType] = js.undefined): DeprecateActivityTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "activityType" -> activityType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeprecateActivityTypeInput]
    }
  }

  @js.native
  trait DeprecateDomainInput extends js.Object {
    var name: js.UndefOr[DomainName]
  }

  object DeprecateDomainInput {
    def apply(
      name: js.UndefOr[DomainName] = js.undefined): DeprecateDomainInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeprecateDomainInput]
    }
  }

  @js.native
  trait DeprecateWorkflowTypeInput extends js.Object {
    var domain: js.UndefOr[DomainName]
    var workflowType: js.UndefOr[WorkflowType]
  }

  object DeprecateWorkflowTypeInput {
    def apply(
      domain: js.UndefOr[DomainName] = js.undefined,
      workflowType: js.UndefOr[WorkflowType] = js.undefined): DeprecateWorkflowTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "workflowType" -> workflowType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeprecateWorkflowTypeInput]
    }
  }

  @js.native
  trait DescribeActivityTypeInput extends js.Object {
    var domain: js.UndefOr[DomainName]
    var activityType: js.UndefOr[ActivityType]
  }

  object DescribeActivityTypeInput {
    def apply(
      domain: js.UndefOr[DomainName] = js.undefined,
      activityType: js.UndefOr[ActivityType] = js.undefined): DescribeActivityTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "activityType" -> activityType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeActivityTypeInput]
    }
  }

  @js.native
  trait DescribeDomainInput extends js.Object {
    var name: js.UndefOr[DomainName]
  }

  object DescribeDomainInput {
    def apply(
      name: js.UndefOr[DomainName] = js.undefined): DescribeDomainInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDomainInput]
    }
  }

  @js.native
  trait DescribeWorkflowExecutionInput extends js.Object {
    var domain: js.UndefOr[DomainName]
    var execution: js.UndefOr[WorkflowExecution]
  }

  object DescribeWorkflowExecutionInput {
    def apply(
      domain: js.UndefOr[DomainName] = js.undefined,
      execution: js.UndefOr[WorkflowExecution] = js.undefined): DescribeWorkflowExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "execution" -> execution.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkflowExecutionInput]
    }
  }

  @js.native
  trait DescribeWorkflowTypeInput extends js.Object {
    var domain: js.UndefOr[DomainName]
    var workflowType: js.UndefOr[WorkflowType]
  }

  object DescribeWorkflowTypeInput {
    def apply(
      domain: js.UndefOr[DomainName] = js.undefined,
      workflowType: js.UndefOr[WorkflowType] = js.undefined): DescribeWorkflowTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "workflowType" -> workflowType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkflowTypeInput]
    }
  }

  /**
   * <p>Returned if the specified domain already exists. You get this fault even if the existing domain is in deprecated status.</p>
   */
  @js.native
  trait DomainAlreadyExistsFaultException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Contains the configuration settings of a domain.</p>
   */
  @js.native
  trait DomainConfiguration extends js.Object {
    var workflowExecutionRetentionPeriodInDays: js.UndefOr[DurationInDays]
  }

  object DomainConfiguration {
    def apply(
      workflowExecutionRetentionPeriodInDays: js.UndefOr[DurationInDays] = js.undefined): DomainConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowExecutionRetentionPeriodInDays" -> workflowExecutionRetentionPeriodInDays.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainConfiguration]
    }
  }

  /**
   * <p>Returned when the specified domain has been deprecated.</p>
   */
  @js.native
  trait DomainDeprecatedFaultException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Contains details of a domain.</p>
   */
  @js.native
  trait DomainDetail extends js.Object {
    var domainInfo: js.UndefOr[DomainInfo]
    var configuration: js.UndefOr[DomainConfiguration]
  }

  object DomainDetail {
    def apply(
      domainInfo: js.UndefOr[DomainInfo] = js.undefined,
      configuration: js.UndefOr[DomainConfiguration] = js.undefined): DomainDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainInfo" -> domainInfo.map { x => x.asInstanceOf[js.Any] },
        "configuration" -> configuration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainDetail]
    }
  }

  /**
   * <p>Contains general information about a domain.</p>
   */
  @js.native
  trait DomainInfo extends js.Object {
    var name: js.UndefOr[DomainName]
    var status: js.UndefOr[RegistrationStatus]
    var description: js.UndefOr[Description]
  }

  object DomainInfo {
    def apply(
      name: js.UndefOr[DomainName] = js.undefined,
      status: js.UndefOr[RegistrationStatus] = js.undefined,
      description: js.UndefOr[Description] = js.undefined): DomainInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainInfo]
    }
  }

  /**
   * <p>Contains a paginated collection of DomainInfo structures.</p>
   */
  @js.native
  trait DomainInfos extends js.Object {
    var domainInfos: js.UndefOr[DomainInfoList]
    var nextPageToken: js.UndefOr[PageToken]
  }

  object DomainInfos {
    def apply(
      domainInfos: js.UndefOr[DomainInfoList] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined): DomainInfos = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainInfos" -> domainInfos.map { x => x.asInstanceOf[js.Any] },
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
   * <p>Used to filter the workflow executions in visibility APIs by various time-based rules. Each parameter, if specified, defines a rule that must be satisfied by each returned query result. The parameter values are in the <a href="https://en.wikipedia.org/wiki/Unix_time">Unix Time format</a>. For example: <code>"oldestDate": 1325376070.</code> </p>
   */
  @js.native
  trait ExecutionTimeFilter extends js.Object {
    var oldestDate: js.UndefOr[Timestamp]
    var latestDate: js.UndefOr[Timestamp]
  }

  object ExecutionTimeFilter {
    def apply(
      oldestDate: js.UndefOr[Timestamp] = js.undefined,
      latestDate: js.UndefOr[Timestamp] = js.undefined): ExecutionTimeFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "oldestDate" -> oldestDate.map { x => x.asInstanceOf[js.Any] },
        "latestDate" -> latestDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecutionTimeFilter]
    }
  }

  /**
   * <p>Provides the details of the <code>ExternalWorkflowExecutionCancelRequested</code> event.</p>
   */
  @js.native
  trait ExternalWorkflowExecutionCancelRequestedEventAttributes extends js.Object {
    var workflowExecution: js.UndefOr[WorkflowExecution]
    var initiatedEventId: js.UndefOr[EventId]
  }

  object ExternalWorkflowExecutionCancelRequestedEventAttributes {
    def apply(
      workflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      initiatedEventId: js.UndefOr[EventId] = js.undefined): ExternalWorkflowExecutionCancelRequestedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowExecution" -> workflowExecution.map { x => x.asInstanceOf[js.Any] },
        "initiatedEventId" -> initiatedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExternalWorkflowExecutionCancelRequestedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>ExternalWorkflowExecutionSignaled</code> event.</p>
   */
  @js.native
  trait ExternalWorkflowExecutionSignaledEventAttributes extends js.Object {
    var workflowExecution: js.UndefOr[WorkflowExecution]
    var initiatedEventId: js.UndefOr[EventId]
  }

  object ExternalWorkflowExecutionSignaledEventAttributes {
    def apply(
      workflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      initiatedEventId: js.UndefOr[EventId] = js.undefined): ExternalWorkflowExecutionSignaledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowExecution" -> workflowExecution.map { x => x.asInstanceOf[js.Any] },
        "initiatedEventId" -> initiatedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExternalWorkflowExecutionSignaledEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>FailWorkflowExecution</code> decision.</p> <p> <b>Access Control</b> </p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li> <p>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</p> </li> <li> <p>Use an <code>Action</code> element to allow or deny permission to call this action.</p> </li> <li> <p>You cannot use an IAM policy to constrain this action's parameters.</p> </li> </ul> <p>If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.</p>
   */
  @js.native
  trait FailWorkflowExecutionDecisionAttributes extends js.Object {
    var reason: js.UndefOr[FailureReason]
    var details: js.UndefOr[Data]
  }

  object FailWorkflowExecutionDecisionAttributes {
    def apply(
      reason: js.UndefOr[FailureReason] = js.undefined,
      details: js.UndefOr[Data] = js.undefined): FailWorkflowExecutionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] },
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailWorkflowExecutionDecisionAttributes]
    }
  }

  object FailWorkflowExecutionFailedCauseEnum {
    val UNHANDLED_DECISION = "UNHANDLED_DECISION"
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(UNHANDLED_DECISION, OPERATION_NOT_PERMITTED)
  }

  /**
   * <p>Provides the details of the <code>FailWorkflowExecutionFailed</code> event.</p>
   */
  @js.native
  trait FailWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: js.UndefOr[FailWorkflowExecutionFailedCause]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
  }

  object FailWorkflowExecutionFailedEventAttributes {
    def apply(
      cause: js.UndefOr[FailWorkflowExecutionFailedCause] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined): FailWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailWorkflowExecutionFailedEventAttributes]
    }
  }

  @js.native
  trait GetWorkflowExecutionHistoryInput extends js.Object {
    var execution: js.UndefOr[WorkflowExecution]
    var reverseOrder: js.UndefOr[ReverseOrder]
    var nextPageToken: js.UndefOr[PageToken]
    var domain: js.UndefOr[DomainName]
    var maximumPageSize: js.UndefOr[PageSize]
  }

  object GetWorkflowExecutionHistoryInput {
    def apply(
      execution: js.UndefOr[WorkflowExecution] = js.undefined,
      reverseOrder: js.UndefOr[ReverseOrder] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      domain: js.UndefOr[DomainName] = js.undefined,
      maximumPageSize: js.UndefOr[PageSize] = js.undefined): GetWorkflowExecutionHistoryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "execution" -> execution.map { x => x.asInstanceOf[js.Any] },
        "reverseOrder" -> reverseOrder.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] },
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "maximumPageSize" -> maximumPageSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetWorkflowExecutionHistoryInput]
    }
  }

  /**
   * <p>Paginated representation of a workflow history for a workflow execution. This is the up to date, complete and authoritative record of the events related to all tasks and events in the life of the workflow execution.</p>
   */
  @js.native
  trait History extends js.Object {
    var events: js.UndefOr[HistoryEventList]
    var nextPageToken: js.UndefOr[PageToken]
  }

  object History {
    def apply(
      events: js.UndefOr[HistoryEventList] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined): History = {
      val _fields = IndexedSeq[(String, js.Any)](
        "events" -> events.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[History]
    }
  }

  /**
   * <p>Event within a workflow execution. A history event can be one of these types:</p> <ul> <li> <p> <code>ActivityTaskCancelRequested</code> – A <code>RequestCancelActivityTask</code> decision was received by the system.</p> </li> <li> <p> <code>ActivityTaskCanceled</code> – The activity task was successfully canceled.</p> </li> <li> <p> <code>ActivityTaskCompleted</code> – An activity worker successfully completed an activity task by calling <a>RespondActivityTaskCompleted</a>.</p> </li> <li> <p> <code>ActivityTaskFailed</code> – An activity worker failed an activity task by calling <a>RespondActivityTaskFailed</a>.</p> </li> <li> <p> <code>ActivityTaskScheduled</code> – An activity task was scheduled for execution.</p> </li> <li> <p> <code>ActivityTaskStarted</code> – The scheduled activity task was dispatched to a worker.</p> </li> <li> <p> <code>ActivityTaskTimedOut</code> – The activity task timed out.</p> </li> <li> <p> <code>CancelTimerFailed</code> – Failed to process CancelTimer decision. This happens when the decision isn't configured properly, for example no timer exists with the specified timer Id.</p> </li> <li> <p> <code>CancelWorkflowExecutionFailed</code> – A request to cancel a workflow execution failed.</p> </li> <li> <p> <code>ChildWorkflowExecutionCanceled</code> – A child workflow execution, started by this workflow execution, was canceled and closed.</p> </li> <li> <p> <code>ChildWorkflowExecutionCompleted</code> – A child workflow execution, started by this workflow execution, completed successfully and was closed.</p> </li> <li> <p> <code>ChildWorkflowExecutionFailed</code> – A child workflow execution, started by this workflow execution, failed to complete successfully and was closed.</p> </li> <li> <p> <code>ChildWorkflowExecutionStarted</code> – A child workflow execution was successfully started.</p> </li> <li> <p> <code>ChildWorkflowExecutionTerminated</code> – A child workflow execution, started by this workflow execution, was terminated.</p> </li> <li> <p> <code>ChildWorkflowExecutionTimedOut</code> – A child workflow execution, started by this workflow execution, timed out and was closed.</p> </li> <li> <p> <code>CompleteWorkflowExecutionFailed</code> – The workflow execution failed to complete.</p> </li> <li> <p> <code>ContinueAsNewWorkflowExecutionFailed</code> – The workflow execution failed to complete after being continued as a new workflow execution.</p> </li> <li> <p> <code>DecisionTaskCompleted</code> – The decider successfully completed a decision task by calling <a>RespondDecisionTaskCompleted</a>.</p> </li> <li> <p> <code>DecisionTaskScheduled</code> – A decision task was scheduled for the workflow execution.</p> </li> <li> <p> <code>DecisionTaskStarted</code> – The decision task was dispatched to a decider.</p> </li> <li> <p> <code>DecisionTaskTimedOut</code> – The decision task timed out.</p> </li> <li> <p> <code>ExternalWorkflowExecutionCancelRequested</code> – Request to cancel an external workflow execution was successfully delivered to the target execution.</p> </li> <li> <p> <code>ExternalWorkflowExecutionSignaled</code> – A signal, requested by this workflow execution, was successfully delivered to the target external workflow execution.</p> </li> <li> <p> <code>FailWorkflowExecutionFailed</code> – A request to mark a workflow execution as failed, itself failed.</p> </li> <li> <p> <code>MarkerRecorded</code> – A marker was recorded in the workflow history as the result of a <code>RecordMarker</code> decision.</p> </li> <li> <p> <code>RecordMarkerFailed</code> – A <code>RecordMarker</code> decision was returned as failed.</p> </li> <li> <p> <code>RequestCancelActivityTaskFailed</code> – Failed to process RequestCancelActivityTask decision. This happens when the decision isn't configured properly.</p> </li> <li> <p> <code>RequestCancelExternalWorkflowExecutionFailed</code> – Request to cancel an external workflow execution failed.</p> </li> <li> <p> <code>RequestCancelExternalWorkflowExecutionInitiated</code> – A request was made to request the cancellation of an external workflow execution.</p> </li> <li> <p> <code>ScheduleActivityTaskFailed</code> – Failed to process ScheduleActivityTask decision. This happens when the decision isn't configured properly, for example the activity type specified isn't registered.</p> </li> <li> <p> <code>SignalExternalWorkflowExecutionFailed</code> – The request to signal an external workflow execution failed.</p> </li> <li> <p> <code>SignalExternalWorkflowExecutionInitiated</code> – A request to signal an external workflow was made.</p> </li> <li> <p> <code>StartActivityTaskFailed</code> – A scheduled activity task failed to start.</p> </li> <li> <p> <code>StartChildWorkflowExecutionFailed</code> – Failed to process StartChildWorkflowExecution decision. This happens when the decision isn't configured properly, for example the workflow type specified isn't registered.</p> </li> <li> <p> <code>StartChildWorkflowExecutionInitiated</code> – A request was made to start a child workflow execution.</p> </li> <li> <p> <code>StartTimerFailed</code> – Failed to process StartTimer decision. This happens when the decision isn't configured properly, for example a timer already exists with the specified timer Id.</p> </li> <li> <p> <code>TimerCanceled</code> – A timer, previously started for this workflow execution, was successfully canceled.</p> </li> <li> <p> <code>TimerFired</code> – A timer, previously started for this workflow execution, fired.</p> </li> <li> <p> <code>TimerStarted</code> – A timer was started for the workflow execution due to a <code>StartTimer</code> decision.</p> </li> <li> <p> <code>WorkflowExecutionCancelRequested</code> – A request to cancel this workflow execution was made.</p> </li> <li> <p> <code>WorkflowExecutionCanceled</code> – The workflow execution was successfully canceled and closed.</p> </li> <li> <p> <code>WorkflowExecutionCompleted</code> – The workflow execution was closed due to successful completion.</p> </li> <li> <p> <code>WorkflowExecutionContinuedAsNew</code> – The workflow execution was closed and a new execution of the same type was created with the same workflowId.</p> </li> <li> <p> <code>WorkflowExecutionFailed</code> – The workflow execution closed due to a failure.</p> </li> <li> <p> <code>WorkflowExecutionSignaled</code> – An external signal was received for the workflow execution.</p> </li> <li> <p> <code>WorkflowExecutionStarted</code> – The workflow execution was started.</p> </li> <li> <p> <code>WorkflowExecutionTerminated</code> – The workflow execution was terminated.</p> </li> <li> <p> <code>WorkflowExecutionTimedOut</code> – The workflow execution was closed because a time out was exceeded.</p> </li> </ul>
   */
  @js.native
  trait HistoryEvent extends js.Object {
    var workflowExecutionFailedEventAttributes: js.UndefOr[WorkflowExecutionFailedEventAttributes]
    var decisionTaskCompletedEventAttributes: js.UndefOr[DecisionTaskCompletedEventAttributes]
    var scheduleActivityTaskFailedEventAttributes: js.UndefOr[ScheduleActivityTaskFailedEventAttributes]
    var eventType: js.UndefOr[EventType]
    var requestCancelActivityTaskFailedEventAttributes: js.UndefOr[RequestCancelActivityTaskFailedEventAttributes]
    var workflowExecutionSignaledEventAttributes: js.UndefOr[WorkflowExecutionSignaledEventAttributes]
    var startLambdaFunctionFailedEventAttributes: js.UndefOr[StartLambdaFunctionFailedEventAttributes]
    var activityTaskScheduledEventAttributes: js.UndefOr[ActivityTaskScheduledEventAttributes]
    var workflowExecutionContinuedAsNewEventAttributes: js.UndefOr[WorkflowExecutionContinuedAsNewEventAttributes]
    var timerStartedEventAttributes: js.UndefOr[TimerStartedEventAttributes]
    var workflowExecutionCompletedEventAttributes: js.UndefOr[WorkflowExecutionCompletedEventAttributes]
    var decisionTaskScheduledEventAttributes: js.UndefOr[DecisionTaskScheduledEventAttributes]
    var scheduleLambdaFunctionFailedEventAttributes: js.UndefOr[ScheduleLambdaFunctionFailedEventAttributes]
    var lambdaFunctionStartedEventAttributes: js.UndefOr[LambdaFunctionStartedEventAttributes]
    var timerCanceledEventAttributes: js.UndefOr[TimerCanceledEventAttributes]
    var requestCancelExternalWorkflowExecutionInitiatedEventAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionInitiatedEventAttributes]
    var childWorkflowExecutionTimedOutEventAttributes: js.UndefOr[ChildWorkflowExecutionTimedOutEventAttributes]
    var startChildWorkflowExecutionInitiatedEventAttributes: js.UndefOr[StartChildWorkflowExecutionInitiatedEventAttributes]
    var workflowExecutionTimedOutEventAttributes: js.UndefOr[WorkflowExecutionTimedOutEventAttributes]
    var childWorkflowExecutionFailedEventAttributes: js.UndefOr[ChildWorkflowExecutionFailedEventAttributes]
    var externalWorkflowExecutionSignaledEventAttributes: js.UndefOr[ExternalWorkflowExecutionSignaledEventAttributes]
    var decisionTaskTimedOutEventAttributes: js.UndefOr[DecisionTaskTimedOutEventAttributes]
    var lambdaFunctionScheduledEventAttributes: js.UndefOr[LambdaFunctionScheduledEventAttributes]
    var signalExternalWorkflowExecutionFailedEventAttributes: js.UndefOr[SignalExternalWorkflowExecutionFailedEventAttributes]
    var requestCancelExternalWorkflowExecutionFailedEventAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionFailedEventAttributes]
    var lambdaFunctionTimedOutEventAttributes: js.UndefOr[LambdaFunctionTimedOutEventAttributes]
    var activityTaskCompletedEventAttributes: js.UndefOr[ActivityTaskCompletedEventAttributes]
    var workflowExecutionTerminatedEventAttributes: js.UndefOr[WorkflowExecutionTerminatedEventAttributes]
    var eventId: js.UndefOr[EventId]
    var cancelTimerFailedEventAttributes: js.UndefOr[CancelTimerFailedEventAttributes]
    var workflowExecutionStartedEventAttributes: js.UndefOr[WorkflowExecutionStartedEventAttributes]
    var childWorkflowExecutionCanceledEventAttributes: js.UndefOr[ChildWorkflowExecutionCanceledEventAttributes]
    var timerFiredEventAttributes: js.UndefOr[TimerFiredEventAttributes]
    var workflowExecutionCanceledEventAttributes: js.UndefOr[WorkflowExecutionCanceledEventAttributes]
    var cancelWorkflowExecutionFailedEventAttributes: js.UndefOr[CancelWorkflowExecutionFailedEventAttributes]
    var markerRecordedEventAttributes: js.UndefOr[MarkerRecordedEventAttributes]
    var activityTaskTimedOutEventAttributes: js.UndefOr[ActivityTaskTimedOutEventAttributes]
    var childWorkflowExecutionStartedEventAttributes: js.UndefOr[ChildWorkflowExecutionStartedEventAttributes]
    var continueAsNewWorkflowExecutionFailedEventAttributes: js.UndefOr[ContinueAsNewWorkflowExecutionFailedEventAttributes]
    var eventTimestamp: js.UndefOr[Timestamp]
    var signalExternalWorkflowExecutionInitiatedEventAttributes: js.UndefOr[SignalExternalWorkflowExecutionInitiatedEventAttributes]
    var activityTaskFailedEventAttributes: js.UndefOr[ActivityTaskFailedEventAttributes]
    var activityTaskCanceledEventAttributes: js.UndefOr[ActivityTaskCanceledEventAttributes]
    var childWorkflowExecutionTerminatedEventAttributes: js.UndefOr[ChildWorkflowExecutionTerminatedEventAttributes]
    var activityTaskStartedEventAttributes: js.UndefOr[ActivityTaskStartedEventAttributes]
    var decisionTaskStartedEventAttributes: js.UndefOr[DecisionTaskStartedEventAttributes]
    var lambdaFunctionFailedEventAttributes: js.UndefOr[LambdaFunctionFailedEventAttributes]
    var lambdaFunctionCompletedEventAttributes: js.UndefOr[LambdaFunctionCompletedEventAttributes]
    var startChildWorkflowExecutionFailedEventAttributes: js.UndefOr[StartChildWorkflowExecutionFailedEventAttributes]
    var failWorkflowExecutionFailedEventAttributes: js.UndefOr[FailWorkflowExecutionFailedEventAttributes]
    var childWorkflowExecutionCompletedEventAttributes: js.UndefOr[ChildWorkflowExecutionCompletedEventAttributes]
    var startTimerFailedEventAttributes: js.UndefOr[StartTimerFailedEventAttributes]
    var activityTaskCancelRequestedEventAttributes: js.UndefOr[ActivityTaskCancelRequestedEventAttributes]
    var completeWorkflowExecutionFailedEventAttributes: js.UndefOr[CompleteWorkflowExecutionFailedEventAttributes]
    var workflowExecutionCancelRequestedEventAttributes: js.UndefOr[WorkflowExecutionCancelRequestedEventAttributes]
    var externalWorkflowExecutionCancelRequestedEventAttributes: js.UndefOr[ExternalWorkflowExecutionCancelRequestedEventAttributes]
    var recordMarkerFailedEventAttributes: js.UndefOr[RecordMarkerFailedEventAttributes]
  }

  object HistoryEvent {
    def apply(
      workflowExecutionFailedEventAttributes: js.UndefOr[WorkflowExecutionFailedEventAttributes] = js.undefined,
      decisionTaskCompletedEventAttributes: js.UndefOr[DecisionTaskCompletedEventAttributes] = js.undefined,
      scheduleActivityTaskFailedEventAttributes: js.UndefOr[ScheduleActivityTaskFailedEventAttributes] = js.undefined,
      eventType: js.UndefOr[EventType] = js.undefined,
      requestCancelActivityTaskFailedEventAttributes: js.UndefOr[RequestCancelActivityTaskFailedEventAttributes] = js.undefined,
      workflowExecutionSignaledEventAttributes: js.UndefOr[WorkflowExecutionSignaledEventAttributes] = js.undefined,
      startLambdaFunctionFailedEventAttributes: js.UndefOr[StartLambdaFunctionFailedEventAttributes] = js.undefined,
      activityTaskScheduledEventAttributes: js.UndefOr[ActivityTaskScheduledEventAttributes] = js.undefined,
      workflowExecutionContinuedAsNewEventAttributes: js.UndefOr[WorkflowExecutionContinuedAsNewEventAttributes] = js.undefined,
      timerStartedEventAttributes: js.UndefOr[TimerStartedEventAttributes] = js.undefined,
      workflowExecutionCompletedEventAttributes: js.UndefOr[WorkflowExecutionCompletedEventAttributes] = js.undefined,
      decisionTaskScheduledEventAttributes: js.UndefOr[DecisionTaskScheduledEventAttributes] = js.undefined,
      scheduleLambdaFunctionFailedEventAttributes: js.UndefOr[ScheduleLambdaFunctionFailedEventAttributes] = js.undefined,
      lambdaFunctionStartedEventAttributes: js.UndefOr[LambdaFunctionStartedEventAttributes] = js.undefined,
      timerCanceledEventAttributes: js.UndefOr[TimerCanceledEventAttributes] = js.undefined,
      requestCancelExternalWorkflowExecutionInitiatedEventAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionInitiatedEventAttributes] = js.undefined,
      childWorkflowExecutionTimedOutEventAttributes: js.UndefOr[ChildWorkflowExecutionTimedOutEventAttributes] = js.undefined,
      startChildWorkflowExecutionInitiatedEventAttributes: js.UndefOr[StartChildWorkflowExecutionInitiatedEventAttributes] = js.undefined,
      workflowExecutionTimedOutEventAttributes: js.UndefOr[WorkflowExecutionTimedOutEventAttributes] = js.undefined,
      childWorkflowExecutionFailedEventAttributes: js.UndefOr[ChildWorkflowExecutionFailedEventAttributes] = js.undefined,
      externalWorkflowExecutionSignaledEventAttributes: js.UndefOr[ExternalWorkflowExecutionSignaledEventAttributes] = js.undefined,
      decisionTaskTimedOutEventAttributes: js.UndefOr[DecisionTaskTimedOutEventAttributes] = js.undefined,
      lambdaFunctionScheduledEventAttributes: js.UndefOr[LambdaFunctionScheduledEventAttributes] = js.undefined,
      signalExternalWorkflowExecutionFailedEventAttributes: js.UndefOr[SignalExternalWorkflowExecutionFailedEventAttributes] = js.undefined,
      requestCancelExternalWorkflowExecutionFailedEventAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionFailedEventAttributes] = js.undefined,
      lambdaFunctionTimedOutEventAttributes: js.UndefOr[LambdaFunctionTimedOutEventAttributes] = js.undefined,
      activityTaskCompletedEventAttributes: js.UndefOr[ActivityTaskCompletedEventAttributes] = js.undefined,
      workflowExecutionTerminatedEventAttributes: js.UndefOr[WorkflowExecutionTerminatedEventAttributes] = js.undefined,
      eventId: js.UndefOr[EventId] = js.undefined,
      cancelTimerFailedEventAttributes: js.UndefOr[CancelTimerFailedEventAttributes] = js.undefined,
      workflowExecutionStartedEventAttributes: js.UndefOr[WorkflowExecutionStartedEventAttributes] = js.undefined,
      childWorkflowExecutionCanceledEventAttributes: js.UndefOr[ChildWorkflowExecutionCanceledEventAttributes] = js.undefined,
      timerFiredEventAttributes: js.UndefOr[TimerFiredEventAttributes] = js.undefined,
      workflowExecutionCanceledEventAttributes: js.UndefOr[WorkflowExecutionCanceledEventAttributes] = js.undefined,
      cancelWorkflowExecutionFailedEventAttributes: js.UndefOr[CancelWorkflowExecutionFailedEventAttributes] = js.undefined,
      markerRecordedEventAttributes: js.UndefOr[MarkerRecordedEventAttributes] = js.undefined,
      activityTaskTimedOutEventAttributes: js.UndefOr[ActivityTaskTimedOutEventAttributes] = js.undefined,
      childWorkflowExecutionStartedEventAttributes: js.UndefOr[ChildWorkflowExecutionStartedEventAttributes] = js.undefined,
      continueAsNewWorkflowExecutionFailedEventAttributes: js.UndefOr[ContinueAsNewWorkflowExecutionFailedEventAttributes] = js.undefined,
      eventTimestamp: js.UndefOr[Timestamp] = js.undefined,
      signalExternalWorkflowExecutionInitiatedEventAttributes: js.UndefOr[SignalExternalWorkflowExecutionInitiatedEventAttributes] = js.undefined,
      activityTaskFailedEventAttributes: js.UndefOr[ActivityTaskFailedEventAttributes] = js.undefined,
      activityTaskCanceledEventAttributes: js.UndefOr[ActivityTaskCanceledEventAttributes] = js.undefined,
      childWorkflowExecutionTerminatedEventAttributes: js.UndefOr[ChildWorkflowExecutionTerminatedEventAttributes] = js.undefined,
      activityTaskStartedEventAttributes: js.UndefOr[ActivityTaskStartedEventAttributes] = js.undefined,
      decisionTaskStartedEventAttributes: js.UndefOr[DecisionTaskStartedEventAttributes] = js.undefined,
      lambdaFunctionFailedEventAttributes: js.UndefOr[LambdaFunctionFailedEventAttributes] = js.undefined,
      lambdaFunctionCompletedEventAttributes: js.UndefOr[LambdaFunctionCompletedEventAttributes] = js.undefined,
      startChildWorkflowExecutionFailedEventAttributes: js.UndefOr[StartChildWorkflowExecutionFailedEventAttributes] = js.undefined,
      failWorkflowExecutionFailedEventAttributes: js.UndefOr[FailWorkflowExecutionFailedEventAttributes] = js.undefined,
      childWorkflowExecutionCompletedEventAttributes: js.UndefOr[ChildWorkflowExecutionCompletedEventAttributes] = js.undefined,
      startTimerFailedEventAttributes: js.UndefOr[StartTimerFailedEventAttributes] = js.undefined,
      activityTaskCancelRequestedEventAttributes: js.UndefOr[ActivityTaskCancelRequestedEventAttributes] = js.undefined,
      completeWorkflowExecutionFailedEventAttributes: js.UndefOr[CompleteWorkflowExecutionFailedEventAttributes] = js.undefined,
      workflowExecutionCancelRequestedEventAttributes: js.UndefOr[WorkflowExecutionCancelRequestedEventAttributes] = js.undefined,
      externalWorkflowExecutionCancelRequestedEventAttributes: js.UndefOr[ExternalWorkflowExecutionCancelRequestedEventAttributes] = js.undefined,
      recordMarkerFailedEventAttributes: js.UndefOr[RecordMarkerFailedEventAttributes] = js.undefined): HistoryEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowExecutionFailedEventAttributes" -> workflowExecutionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventAttributes" -> decisionTaskCompletedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "scheduleActivityTaskFailedEventAttributes" -> scheduleActivityTaskFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "eventType" -> eventType.map { x => x.asInstanceOf[js.Any] },
        "requestCancelActivityTaskFailedEventAttributes" -> requestCancelActivityTaskFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "workflowExecutionSignaledEventAttributes" -> workflowExecutionSignaledEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "startLambdaFunctionFailedEventAttributes" -> startLambdaFunctionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "activityTaskScheduledEventAttributes" -> activityTaskScheduledEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "workflowExecutionContinuedAsNewEventAttributes" -> workflowExecutionContinuedAsNewEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "timerStartedEventAttributes" -> timerStartedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "workflowExecutionCompletedEventAttributes" -> workflowExecutionCompletedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskScheduledEventAttributes" -> decisionTaskScheduledEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "scheduleLambdaFunctionFailedEventAttributes" -> scheduleLambdaFunctionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "lambdaFunctionStartedEventAttributes" -> lambdaFunctionStartedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "timerCanceledEventAttributes" -> timerCanceledEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "requestCancelExternalWorkflowExecutionInitiatedEventAttributes" -> requestCancelExternalWorkflowExecutionInitiatedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "childWorkflowExecutionTimedOutEventAttributes" -> childWorkflowExecutionTimedOutEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "startChildWorkflowExecutionInitiatedEventAttributes" -> startChildWorkflowExecutionInitiatedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "workflowExecutionTimedOutEventAttributes" -> workflowExecutionTimedOutEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "childWorkflowExecutionFailedEventAttributes" -> childWorkflowExecutionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "externalWorkflowExecutionSignaledEventAttributes" -> externalWorkflowExecutionSignaledEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskTimedOutEventAttributes" -> decisionTaskTimedOutEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "lambdaFunctionScheduledEventAttributes" -> lambdaFunctionScheduledEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "signalExternalWorkflowExecutionFailedEventAttributes" -> signalExternalWorkflowExecutionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "requestCancelExternalWorkflowExecutionFailedEventAttributes" -> requestCancelExternalWorkflowExecutionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "lambdaFunctionTimedOutEventAttributes" -> lambdaFunctionTimedOutEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "activityTaskCompletedEventAttributes" -> activityTaskCompletedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "workflowExecutionTerminatedEventAttributes" -> workflowExecutionTerminatedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "eventId" -> eventId.map { x => x.asInstanceOf[js.Any] },
        "cancelTimerFailedEventAttributes" -> cancelTimerFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "workflowExecutionStartedEventAttributes" -> workflowExecutionStartedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "childWorkflowExecutionCanceledEventAttributes" -> childWorkflowExecutionCanceledEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "timerFiredEventAttributes" -> timerFiredEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "workflowExecutionCanceledEventAttributes" -> workflowExecutionCanceledEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "cancelWorkflowExecutionFailedEventAttributes" -> cancelWorkflowExecutionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "markerRecordedEventAttributes" -> markerRecordedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "activityTaskTimedOutEventAttributes" -> activityTaskTimedOutEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "childWorkflowExecutionStartedEventAttributes" -> childWorkflowExecutionStartedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "continueAsNewWorkflowExecutionFailedEventAttributes" -> continueAsNewWorkflowExecutionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "eventTimestamp" -> eventTimestamp.map { x => x.asInstanceOf[js.Any] },
        "signalExternalWorkflowExecutionInitiatedEventAttributes" -> signalExternalWorkflowExecutionInitiatedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "activityTaskFailedEventAttributes" -> activityTaskFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "activityTaskCanceledEventAttributes" -> activityTaskCanceledEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "childWorkflowExecutionTerminatedEventAttributes" -> childWorkflowExecutionTerminatedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "activityTaskStartedEventAttributes" -> activityTaskStartedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskStartedEventAttributes" -> decisionTaskStartedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "lambdaFunctionFailedEventAttributes" -> lambdaFunctionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "lambdaFunctionCompletedEventAttributes" -> lambdaFunctionCompletedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "startChildWorkflowExecutionFailedEventAttributes" -> startChildWorkflowExecutionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "failWorkflowExecutionFailedEventAttributes" -> failWorkflowExecutionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "childWorkflowExecutionCompletedEventAttributes" -> childWorkflowExecutionCompletedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "startTimerFailedEventAttributes" -> startTimerFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "activityTaskCancelRequestedEventAttributes" -> activityTaskCancelRequestedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "completeWorkflowExecutionFailedEventAttributes" -> completeWorkflowExecutionFailedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "workflowExecutionCancelRequestedEventAttributes" -> workflowExecutionCancelRequestedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "externalWorkflowExecutionCancelRequestedEventAttributes" -> externalWorkflowExecutionCancelRequestedEventAttributes.map { x => x.asInstanceOf[js.Any] },
        "recordMarkerFailedEventAttributes" -> recordMarkerFailedEventAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HistoryEvent]
    }
  }

  /**
   * <p>Provides the details of the <code>LambdaFunctionCompleted</code> event. It isn't set for other event types.</p>
   */
  @js.native
  trait LambdaFunctionCompletedEventAttributes extends js.Object {
    var scheduledEventId: js.UndefOr[EventId]
    var startedEventId: js.UndefOr[EventId]
    var result: js.UndefOr[Data]
  }

  object LambdaFunctionCompletedEventAttributes {
    def apply(
      scheduledEventId: js.UndefOr[EventId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined,
      result: js.UndefOr[Data] = js.undefined): LambdaFunctionCompletedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledEventId" -> scheduledEventId.map { x => x.asInstanceOf[js.Any] },
        "startedEventId" -> startedEventId.map { x => x.asInstanceOf[js.Any] },
        "result" -> result.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionCompletedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>LambdaFunctionFailed</code> event. It isn't set for other event types.</p>
   */
  @js.native
  trait LambdaFunctionFailedEventAttributes extends js.Object {
    var scheduledEventId: js.UndefOr[EventId]
    var startedEventId: js.UndefOr[EventId]
    var reason: js.UndefOr[FailureReason]
    var details: js.UndefOr[Data]
  }

  object LambdaFunctionFailedEventAttributes {
    def apply(
      scheduledEventId: js.UndefOr[EventId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined,
      reason: js.UndefOr[FailureReason] = js.undefined,
      details: js.UndefOr[Data] = js.undefined): LambdaFunctionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledEventId" -> scheduledEventId.map { x => x.asInstanceOf[js.Any] },
        "startedEventId" -> startedEventId.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] },
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionFailedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>LambdaFunctionScheduled</code> event. It isn't set for other event types.</p>
   */
  @js.native
  trait LambdaFunctionScheduledEventAttributes extends js.Object {
    var name: js.UndefOr[FunctionName]
    var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
    var id: js.UndefOr[FunctionId]
    var control: js.UndefOr[Data]
    var input: js.UndefOr[FunctionInput]
  }

  object LambdaFunctionScheduledEventAttributes {
    def apply(
      name: js.UndefOr[FunctionName] = js.undefined,
      startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined,
      id: js.UndefOr[FunctionId] = js.undefined,
      control: js.UndefOr[Data] = js.undefined,
      input: js.UndefOr[FunctionInput] = js.undefined): LambdaFunctionScheduledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "startToCloseTimeout" -> startToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionScheduledEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>LambdaFunctionStarted</code> event. It isn't set for other event types.</p>
   */
  @js.native
  trait LambdaFunctionStartedEventAttributes extends js.Object {
    var scheduledEventId: js.UndefOr[EventId]
  }

  object LambdaFunctionStartedEventAttributes {
    def apply(
      scheduledEventId: js.UndefOr[EventId] = js.undefined): LambdaFunctionStartedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledEventId" -> scheduledEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionStartedEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>LambdaFunctionTimedOut</code> event.</p>
   */
  @js.native
  trait LambdaFunctionTimedOutEventAttributes extends js.Object {
    var scheduledEventId: js.UndefOr[EventId]
    var startedEventId: js.UndefOr[EventId]
    var timeoutType: js.UndefOr[LambdaFunctionTimeoutType]
  }

  object LambdaFunctionTimedOutEventAttributes {
    def apply(
      scheduledEventId: js.UndefOr[EventId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined,
      timeoutType: js.UndefOr[LambdaFunctionTimeoutType] = js.undefined): LambdaFunctionTimedOutEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledEventId" -> scheduledEventId.map { x => x.asInstanceOf[js.Any] },
        "startedEventId" -> startedEventId.map { x => x.asInstanceOf[js.Any] },
        "timeoutType" -> timeoutType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionTimedOutEventAttributes]
    }
  }

  object LambdaFunctionTimeoutTypeEnum {
    val START_TO_CLOSE = "START_TO_CLOSE"

    val values = IndexedSeq(START_TO_CLOSE)
  }

  /**
   * <p>Returned by any operation if a system imposed limitation has been reached. To address this fault you should either clean up unused resources or increase the limit by contacting AWS.</p>
   */
  @js.native
  trait LimitExceededFaultException extends js.Object {
    val message: ErrorMessage
  }

  @js.native
  trait ListActivityTypesInput extends js.Object {
    var name: js.UndefOr[Name]
    var reverseOrder: js.UndefOr[ReverseOrder]
    var nextPageToken: js.UndefOr[PageToken]
    var domain: js.UndefOr[DomainName]
    var registrationStatus: js.UndefOr[RegistrationStatus]
    var maximumPageSize: js.UndefOr[PageSize]
  }

  object ListActivityTypesInput {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      reverseOrder: js.UndefOr[ReverseOrder] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      domain: js.UndefOr[DomainName] = js.undefined,
      registrationStatus: js.UndefOr[RegistrationStatus] = js.undefined,
      maximumPageSize: js.UndefOr[PageSize] = js.undefined): ListActivityTypesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "reverseOrder" -> reverseOrder.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] },
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "registrationStatus" -> registrationStatus.map { x => x.asInstanceOf[js.Any] },
        "maximumPageSize" -> maximumPageSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListActivityTypesInput]
    }
  }

  @js.native
  trait ListClosedWorkflowExecutionsInput extends js.Object {
    var executionFilter: js.UndefOr[WorkflowExecutionFilter]
    var startTimeFilter: js.UndefOr[ExecutionTimeFilter]
    var reverseOrder: js.UndefOr[ReverseOrder]
    var nextPageToken: js.UndefOr[PageToken]
    var domain: js.UndefOr[DomainName]
    var closeStatusFilter: js.UndefOr[CloseStatusFilter]
    var closeTimeFilter: js.UndefOr[ExecutionTimeFilter]
    var typeFilter: js.UndefOr[WorkflowTypeFilter]
    var tagFilter: js.UndefOr[TagFilter]
    var maximumPageSize: js.UndefOr[PageSize]
  }

  object ListClosedWorkflowExecutionsInput {
    def apply(
      executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined,
      startTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined,
      reverseOrder: js.UndefOr[ReverseOrder] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      domain: js.UndefOr[DomainName] = js.undefined,
      closeStatusFilter: js.UndefOr[CloseStatusFilter] = js.undefined,
      closeTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined,
      typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined,
      tagFilter: js.UndefOr[TagFilter] = js.undefined,
      maximumPageSize: js.UndefOr[PageSize] = js.undefined): ListClosedWorkflowExecutionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionFilter" -> executionFilter.map { x => x.asInstanceOf[js.Any] },
        "startTimeFilter" -> startTimeFilter.map { x => x.asInstanceOf[js.Any] },
        "reverseOrder" -> reverseOrder.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] },
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "closeStatusFilter" -> closeStatusFilter.map { x => x.asInstanceOf[js.Any] },
        "closeTimeFilter" -> closeTimeFilter.map { x => x.asInstanceOf[js.Any] },
        "typeFilter" -> typeFilter.map { x => x.asInstanceOf[js.Any] },
        "tagFilter" -> tagFilter.map { x => x.asInstanceOf[js.Any] },
        "maximumPageSize" -> maximumPageSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClosedWorkflowExecutionsInput]
    }
  }

  @js.native
  trait ListDomainsInput extends js.Object {
    var nextPageToken: js.UndefOr[PageToken]
    var registrationStatus: js.UndefOr[RegistrationStatus]
    var maximumPageSize: js.UndefOr[PageSize]
    var reverseOrder: js.UndefOr[ReverseOrder]
  }

  object ListDomainsInput {
    def apply(
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      registrationStatus: js.UndefOr[RegistrationStatus] = js.undefined,
      maximumPageSize: js.UndefOr[PageSize] = js.undefined,
      reverseOrder: js.UndefOr[ReverseOrder] = js.undefined): ListDomainsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] },
        "registrationStatus" -> registrationStatus.map { x => x.asInstanceOf[js.Any] },
        "maximumPageSize" -> maximumPageSize.map { x => x.asInstanceOf[js.Any] },
        "reverseOrder" -> reverseOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDomainsInput]
    }
  }

  @js.native
  trait ListOpenWorkflowExecutionsInput extends js.Object {
    var executionFilter: js.UndefOr[WorkflowExecutionFilter]
    var startTimeFilter: js.UndefOr[ExecutionTimeFilter]
    var reverseOrder: js.UndefOr[ReverseOrder]
    var nextPageToken: js.UndefOr[PageToken]
    var domain: js.UndefOr[DomainName]
    var typeFilter: js.UndefOr[WorkflowTypeFilter]
    var tagFilter: js.UndefOr[TagFilter]
    var maximumPageSize: js.UndefOr[PageSize]
  }

  object ListOpenWorkflowExecutionsInput {
    def apply(
      executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined,
      startTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined,
      reverseOrder: js.UndefOr[ReverseOrder] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      domain: js.UndefOr[DomainName] = js.undefined,
      typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined,
      tagFilter: js.UndefOr[TagFilter] = js.undefined,
      maximumPageSize: js.UndefOr[PageSize] = js.undefined): ListOpenWorkflowExecutionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionFilter" -> executionFilter.map { x => x.asInstanceOf[js.Any] },
        "startTimeFilter" -> startTimeFilter.map { x => x.asInstanceOf[js.Any] },
        "reverseOrder" -> reverseOrder.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] },
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "typeFilter" -> typeFilter.map { x => x.asInstanceOf[js.Any] },
        "tagFilter" -> tagFilter.map { x => x.asInstanceOf[js.Any] },
        "maximumPageSize" -> maximumPageSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOpenWorkflowExecutionsInput]
    }
  }

  @js.native
  trait ListWorkflowTypesInput extends js.Object {
    var name: js.UndefOr[Name]
    var reverseOrder: js.UndefOr[ReverseOrder]
    var nextPageToken: js.UndefOr[PageToken]
    var domain: js.UndefOr[DomainName]
    var registrationStatus: js.UndefOr[RegistrationStatus]
    var maximumPageSize: js.UndefOr[PageSize]
  }

  object ListWorkflowTypesInput {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      reverseOrder: js.UndefOr[ReverseOrder] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      domain: js.UndefOr[DomainName] = js.undefined,
      registrationStatus: js.UndefOr[RegistrationStatus] = js.undefined,
      maximumPageSize: js.UndefOr[PageSize] = js.undefined): ListWorkflowTypesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "reverseOrder" -> reverseOrder.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] },
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "registrationStatus" -> registrationStatus.map { x => x.asInstanceOf[js.Any] },
        "maximumPageSize" -> maximumPageSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListWorkflowTypesInput]
    }
  }

  /**
   * <p>Provides the details of the <code>MarkerRecorded</code> event.</p>
   */
  @js.native
  trait MarkerRecordedEventAttributes extends js.Object {
    var markerName: js.UndefOr[MarkerName]
    var details: js.UndefOr[Data]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
  }

  object MarkerRecordedEventAttributes {
    def apply(
      markerName: js.UndefOr[MarkerName] = js.undefined,
      details: js.UndefOr[Data] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined): MarkerRecordedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "markerName" -> markerName.map { x => x.asInstanceOf[js.Any] },
        "details" -> details.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MarkerRecordedEventAttributes]
    }
  }

  /**
   * <p>Returned when the caller doesn't have sufficient permissions to invoke the action.</p>
   */
  @js.native
  trait OperationNotPermittedFaultException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Contains the count of tasks in a task list.</p>
   */
  @js.native
  trait PendingTaskCount extends js.Object {
    var count: js.UndefOr[Count]
    var truncated: js.UndefOr[Truncated]
  }

  object PendingTaskCount {
    def apply(
      count: js.UndefOr[Count] = js.undefined,
      truncated: js.UndefOr[Truncated] = js.undefined): PendingTaskCount = {
      val _fields = IndexedSeq[(String, js.Any)](
        "count" -> count.map { x => x.asInstanceOf[js.Any] },
        "truncated" -> truncated.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingTaskCount]
    }
  }

  @js.native
  trait PollForActivityTaskInput extends js.Object {
    var domain: js.UndefOr[DomainName]
    var taskList: js.UndefOr[TaskList]
    var identity: js.UndefOr[Identity]
  }

  object PollForActivityTaskInput {
    def apply(
      domain: js.UndefOr[DomainName] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined,
      identity: js.UndefOr[Identity] = js.undefined): PollForActivityTaskInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "taskList" -> taskList.map { x => x.asInstanceOf[js.Any] },
        "identity" -> identity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PollForActivityTaskInput]
    }
  }

  @js.native
  trait PollForDecisionTaskInput extends js.Object {
    var reverseOrder: js.UndefOr[ReverseOrder]
    var nextPageToken: js.UndefOr[PageToken]
    var domain: js.UndefOr[DomainName]
    var taskList: js.UndefOr[TaskList]
    var identity: js.UndefOr[Identity]
    var maximumPageSize: js.UndefOr[PageSize]
  }

  object PollForDecisionTaskInput {
    def apply(
      reverseOrder: js.UndefOr[ReverseOrder] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      domain: js.UndefOr[DomainName] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined,
      identity: js.UndefOr[Identity] = js.undefined,
      maximumPageSize: js.UndefOr[PageSize] = js.undefined): PollForDecisionTaskInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "reverseOrder" -> reverseOrder.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] },
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "taskList" -> taskList.map { x => x.asInstanceOf[js.Any] },
        "identity" -> identity.map { x => x.asInstanceOf[js.Any] },
        "maximumPageSize" -> maximumPageSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PollForDecisionTaskInput]
    }
  }

  @js.native
  trait RecordActivityTaskHeartbeatInput extends js.Object {
    var taskToken: js.UndefOr[TaskToken]
    var details: js.UndefOr[LimitedData]
  }

  object RecordActivityTaskHeartbeatInput {
    def apply(
      taskToken: js.UndefOr[TaskToken] = js.undefined,
      details: js.UndefOr[LimitedData] = js.undefined): RecordActivityTaskHeartbeatInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskToken" -> taskToken.map { x => x.asInstanceOf[js.Any] },
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordActivityTaskHeartbeatInput]
    }
  }

  /**
   * <p>Provides the details of the <code>RecordMarker</code> decision.</p> <p> <b>Access Control</b> </p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li> <p>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</p> </li> <li> <p>Use an <code>Action</code> element to allow or deny permission to call this action.</p> </li> <li> <p>You cannot use an IAM policy to constrain this action's parameters.</p> </li> </ul> <p>If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.</p>
   */
  @js.native
  trait RecordMarkerDecisionAttributes extends js.Object {
    var markerName: js.UndefOr[MarkerName]
    var details: js.UndefOr[Data]
  }

  object RecordMarkerDecisionAttributes {
    def apply(
      markerName: js.UndefOr[MarkerName] = js.undefined,
      details: js.UndefOr[Data] = js.undefined): RecordMarkerDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "markerName" -> markerName.map { x => x.asInstanceOf[js.Any] },
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordMarkerDecisionAttributes]
    }
  }

  object RecordMarkerFailedCauseEnum {
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(OPERATION_NOT_PERMITTED)
  }

  /**
   * <p>Provides the details of the <code>RecordMarkerFailed</code> event.</p>
   */
  @js.native
  trait RecordMarkerFailedEventAttributes extends js.Object {
    var markerName: js.UndefOr[MarkerName]
    var cause: js.UndefOr[RecordMarkerFailedCause]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
  }

  object RecordMarkerFailedEventAttributes {
    def apply(
      markerName: js.UndefOr[MarkerName] = js.undefined,
      cause: js.UndefOr[RecordMarkerFailedCause] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined): RecordMarkerFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "markerName" -> markerName.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordMarkerFailedEventAttributes]
    }
  }

  @js.native
  trait RegisterActivityTypeInput extends js.Object {
    var defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var name: js.UndefOr[Name]
    var defaultTaskScheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional]
    var defaultTaskList: js.UndefOr[TaskList]
    var description: js.UndefOr[Description]
    var domain: js.UndefOr[DomainName]
    var defaultTaskScheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var defaultTaskHeartbeatTimeout: js.UndefOr[DurationInSecondsOptional]
    var version: js.UndefOr[Version]
    var defaultTaskPriority: js.UndefOr[TaskPriority]
  }

  object RegisterActivityTypeInput {
    def apply(
      defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      defaultTaskScheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      defaultTaskList: js.UndefOr[TaskList] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      domain: js.UndefOr[DomainName] = js.undefined,
      defaultTaskScheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      defaultTaskHeartbeatTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      defaultTaskPriority: js.UndefOr[TaskPriority] = js.undefined): RegisterActivityTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "defaultTaskStartToCloseTimeout" -> defaultTaskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskScheduleToStartTimeout" -> defaultTaskScheduleToStartTimeout.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskList" -> defaultTaskList.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskScheduleToCloseTimeout" -> defaultTaskScheduleToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskHeartbeatTimeout" -> defaultTaskHeartbeatTimeout.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskPriority" -> defaultTaskPriority.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterActivityTypeInput]
    }
  }

  @js.native
  trait RegisterDomainInput extends js.Object {
    var name: js.UndefOr[DomainName]
    var description: js.UndefOr[Description]
    var workflowExecutionRetentionPeriodInDays: js.UndefOr[DurationInDays]
  }

  object RegisterDomainInput {
    def apply(
      name: js.UndefOr[DomainName] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      workflowExecutionRetentionPeriodInDays: js.UndefOr[DurationInDays] = js.undefined): RegisterDomainInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "workflowExecutionRetentionPeriodInDays" -> workflowExecutionRetentionPeriodInDays.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterDomainInput]
    }
  }

  @js.native
  trait RegisterWorkflowTypeInput extends js.Object {
    var defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var name: js.UndefOr[Name]
    var defaultTaskList: js.UndefOr[TaskList]
    var description: js.UndefOr[Description]
    var domain: js.UndefOr[DomainName]
    var defaultLambdaRole: js.UndefOr[Arn]
    var version: js.UndefOr[Version]
    var defaultChildPolicy: js.UndefOr[ChildPolicy]
    var defaultTaskPriority: js.UndefOr[TaskPriority]
    var defaultExecutionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
  }

  object RegisterWorkflowTypeInput {
    def apply(
      defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      defaultTaskList: js.UndefOr[TaskList] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      domain: js.UndefOr[DomainName] = js.undefined,
      defaultLambdaRole: js.UndefOr[Arn] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      defaultChildPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      defaultTaskPriority: js.UndefOr[TaskPriority] = js.undefined,
      defaultExecutionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined): RegisterWorkflowTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "defaultTaskStartToCloseTimeout" -> defaultTaskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskList" -> defaultTaskList.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "defaultLambdaRole" -> defaultLambdaRole.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "defaultChildPolicy" -> defaultChildPolicy.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskPriority" -> defaultTaskPriority.map { x => x.asInstanceOf[js.Any] },
        "defaultExecutionStartToCloseTimeout" -> defaultExecutionStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterWorkflowTypeInput]
    }
  }

  object RegistrationStatusEnum {
    val REGISTERED = "REGISTERED"
    val DEPRECATED = "DEPRECATED"

    val values = IndexedSeq(REGISTERED, DEPRECATED)
  }

  /**
   * <p>Provides the details of the <code>RequestCancelActivityTask</code> decision.</p> <p> <b>Access Control</b> </p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li> <p>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</p> </li> <li> <p>Use an <code>Action</code> element to allow or deny permission to call this action.</p> </li> <li> <p>You cannot use an IAM policy to constrain this action's parameters.</p> </li> </ul> <p>If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.</p>
   */
  @js.native
  trait RequestCancelActivityTaskDecisionAttributes extends js.Object {
    var activityId: js.UndefOr[ActivityId]
  }

  object RequestCancelActivityTaskDecisionAttributes {
    def apply(
      activityId: js.UndefOr[ActivityId] = js.undefined): RequestCancelActivityTaskDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityId" -> activityId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestCancelActivityTaskDecisionAttributes]
    }
  }

  object RequestCancelActivityTaskFailedCauseEnum {
    val ACTIVITY_ID_UNKNOWN = "ACTIVITY_ID_UNKNOWN"
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(ACTIVITY_ID_UNKNOWN, OPERATION_NOT_PERMITTED)
  }

  /**
   * <p>Provides the details of the <code>RequestCancelActivityTaskFailed</code> event.</p>
   */
  @js.native
  trait RequestCancelActivityTaskFailedEventAttributes extends js.Object {
    var activityId: js.UndefOr[ActivityId]
    var cause: js.UndefOr[RequestCancelActivityTaskFailedCause]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
  }

  object RequestCancelActivityTaskFailedEventAttributes {
    def apply(
      activityId: js.UndefOr[ActivityId] = js.undefined,
      cause: js.UndefOr[RequestCancelActivityTaskFailedCause] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined): RequestCancelActivityTaskFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityId" -> activityId.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestCancelActivityTaskFailedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>RequestCancelExternalWorkflowExecution</code> decision.</p> <p> <b>Access Control</b> </p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li> <p>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</p> </li> <li> <p>Use an <code>Action</code> element to allow or deny permission to call this action.</p> </li> <li> <p>You cannot use an IAM policy to constrain this action's parameters.</p> </li> </ul> <p>If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.</p>
   */
  @js.native
  trait RequestCancelExternalWorkflowExecutionDecisionAttributes extends js.Object {
    var workflowId: js.UndefOr[WorkflowId]
    var runId: js.UndefOr[WorkflowRunIdOptional]
    var control: js.UndefOr[Data]
  }

  object RequestCancelExternalWorkflowExecutionDecisionAttributes {
    def apply(
      workflowId: js.UndefOr[WorkflowId] = js.undefined,
      runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined,
      control: js.UndefOr[Data] = js.undefined): RequestCancelExternalWorkflowExecutionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowId" -> workflowId.map { x => x.asInstanceOf[js.Any] },
        "runId" -> runId.map { x => x.asInstanceOf[js.Any] },
        "control" -> control.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Provides the details of the <code>RequestCancelExternalWorkflowExecutionFailed</code> event.</p>
   */
  @js.native
  trait RequestCancelExternalWorkflowExecutionFailedEventAttributes extends js.Object {
    var initiatedEventId: js.UndefOr[EventId]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
    var cause: js.UndefOr[RequestCancelExternalWorkflowExecutionFailedCause]
    var control: js.UndefOr[Data]
    var runId: js.UndefOr[WorkflowRunIdOptional]
    var workflowId: js.UndefOr[WorkflowId]
  }

  object RequestCancelExternalWorkflowExecutionFailedEventAttributes {
    def apply(
      initiatedEventId: js.UndefOr[EventId] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined,
      cause: js.UndefOr[RequestCancelExternalWorkflowExecutionFailedCause] = js.undefined,
      control: js.UndefOr[Data] = js.undefined,
      runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined,
      workflowId: js.UndefOr[WorkflowId] = js.undefined): RequestCancelExternalWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "initiatedEventId" -> initiatedEventId.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] },
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "runId" -> runId.map { x => x.asInstanceOf[js.Any] },
        "workflowId" -> workflowId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestCancelExternalWorkflowExecutionFailedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>RequestCancelExternalWorkflowExecutionInitiated</code> event.</p>
   */
  @js.native
  trait RequestCancelExternalWorkflowExecutionInitiatedEventAttributes extends js.Object {
    var workflowId: js.UndefOr[WorkflowId]
    var runId: js.UndefOr[WorkflowRunIdOptional]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
    var control: js.UndefOr[Data]
  }

  object RequestCancelExternalWorkflowExecutionInitiatedEventAttributes {
    def apply(
      workflowId: js.UndefOr[WorkflowId] = js.undefined,
      runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined,
      control: js.UndefOr[Data] = js.undefined): RequestCancelExternalWorkflowExecutionInitiatedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowId" -> workflowId.map { x => x.asInstanceOf[js.Any] },
        "runId" -> runId.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] },
        "control" -> control.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestCancelExternalWorkflowExecutionInitiatedEventAttributes]
    }
  }

  @js.native
  trait RequestCancelWorkflowExecutionInput extends js.Object {
    var domain: js.UndefOr[DomainName]
    var workflowId: js.UndefOr[WorkflowId]
    var runId: js.UndefOr[WorkflowRunIdOptional]
  }

  object RequestCancelWorkflowExecutionInput {
    def apply(
      domain: js.UndefOr[DomainName] = js.undefined,
      workflowId: js.UndefOr[WorkflowId] = js.undefined,
      runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined): RequestCancelWorkflowExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "workflowId" -> workflowId.map { x => x.asInstanceOf[js.Any] },
        "runId" -> runId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestCancelWorkflowExecutionInput]
    }
  }

  @js.native
  trait RespondActivityTaskCanceledInput extends js.Object {
    var taskToken: js.UndefOr[TaskToken]
    var details: js.UndefOr[Data]
  }

  object RespondActivityTaskCanceledInput {
    def apply(
      taskToken: js.UndefOr[TaskToken] = js.undefined,
      details: js.UndefOr[Data] = js.undefined): RespondActivityTaskCanceledInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskToken" -> taskToken.map { x => x.asInstanceOf[js.Any] },
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RespondActivityTaskCanceledInput]
    }
  }

  @js.native
  trait RespondActivityTaskCompletedInput extends js.Object {
    var taskToken: js.UndefOr[TaskToken]
    var result: js.UndefOr[Data]
  }

  object RespondActivityTaskCompletedInput {
    def apply(
      taskToken: js.UndefOr[TaskToken] = js.undefined,
      result: js.UndefOr[Data] = js.undefined): RespondActivityTaskCompletedInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskToken" -> taskToken.map { x => x.asInstanceOf[js.Any] },
        "result" -> result.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RespondActivityTaskCompletedInput]
    }
  }

  @js.native
  trait RespondActivityTaskFailedInput extends js.Object {
    var taskToken: js.UndefOr[TaskToken]
    var reason: js.UndefOr[FailureReason]
    var details: js.UndefOr[Data]
  }

  object RespondActivityTaskFailedInput {
    def apply(
      taskToken: js.UndefOr[TaskToken] = js.undefined,
      reason: js.UndefOr[FailureReason] = js.undefined,
      details: js.UndefOr[Data] = js.undefined): RespondActivityTaskFailedInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskToken" -> taskToken.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] },
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RespondActivityTaskFailedInput]
    }
  }

  /**
   * <p>Input data for a TaskCompleted response to a decision task.</p>
   */
  @js.native
  trait RespondDecisionTaskCompletedInput extends js.Object {
    var taskToken: js.UndefOr[TaskToken]
    var decisions: js.UndefOr[DecisionList]
    var executionContext: js.UndefOr[Data]
  }

  object RespondDecisionTaskCompletedInput {
    def apply(
      taskToken: js.UndefOr[TaskToken] = js.undefined,
      decisions: js.UndefOr[DecisionList] = js.undefined,
      executionContext: js.UndefOr[Data] = js.undefined): RespondDecisionTaskCompletedInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskToken" -> taskToken.map { x => x.asInstanceOf[js.Any] },
        "decisions" -> decisions.map { x => x.asInstanceOf[js.Any] },
        "executionContext" -> executionContext.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RespondDecisionTaskCompletedInput]
    }
  }

  /**
   * <p>Specifies the <code>runId</code> of a workflow execution.</p>
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
   * <p>Provides the details of the <code>ScheduleActivityTask</code> decision.</p> <p> <b>Access Control</b> </p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li> <p>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</p> </li> <li> <p>Use an <code>Action</code> element to allow or deny permission to call this action.</p> </li> <li> <p>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.</p> <ul> <li> <p> <code>activityType.name</code> – String constraint. The key is <code>swf:activityType.name</code>.</p> </li> <li> <p> <code>activityType.version</code> – String constraint. The key is <code>swf:activityType.version</code>.</p> </li> <li> <p> <code>taskList</code> – String constraint. The key is <code>swf:taskList.name</code>.</p> </li> </ul> </li> </ul> <p>If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.</p>
   */
  @js.native
  trait ScheduleActivityTaskDecisionAttributes extends js.Object {
    var scheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional]
    var heartbeatTimeout: js.UndefOr[DurationInSecondsOptional]
    var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var taskList: js.UndefOr[TaskList]
    var activityId: js.UndefOr[ActivityId]
    var activityType: js.UndefOr[ActivityType]
    var taskPriority: js.UndefOr[TaskPriority]
    var control: js.UndefOr[Data]
    var scheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var input: js.UndefOr[Data]
  }

  object ScheduleActivityTaskDecisionAttributes {
    def apply(
      scheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      heartbeatTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined,
      activityId: js.UndefOr[ActivityId] = js.undefined,
      activityType: js.UndefOr[ActivityType] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined,
      control: js.UndefOr[Data] = js.undefined,
      scheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      input: js.UndefOr[Data] = js.undefined): ScheduleActivityTaskDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduleToStartTimeout" -> scheduleToStartTimeout.map { x => x.asInstanceOf[js.Any] },
        "heartbeatTimeout" -> heartbeatTimeout.map { x => x.asInstanceOf[js.Any] },
        "startToCloseTimeout" -> startToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "taskList" -> taskList.map { x => x.asInstanceOf[js.Any] },
        "activityId" -> activityId.map { x => x.asInstanceOf[js.Any] },
        "activityType" -> activityType.map { x => x.asInstanceOf[js.Any] },
        "taskPriority" -> taskPriority.map { x => x.asInstanceOf[js.Any] },
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "scheduleToCloseTimeout" -> scheduleToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Provides the details of the <code>ScheduleActivityTaskFailed</code> event.</p>
   */
  @js.native
  trait ScheduleActivityTaskFailedEventAttributes extends js.Object {
    var activityType: js.UndefOr[ActivityType]
    var activityId: js.UndefOr[ActivityId]
    var cause: js.UndefOr[ScheduleActivityTaskFailedCause]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
  }

  object ScheduleActivityTaskFailedEventAttributes {
    def apply(
      activityType: js.UndefOr[ActivityType] = js.undefined,
      activityId: js.UndefOr[ActivityId] = js.undefined,
      cause: js.UndefOr[ScheduleActivityTaskFailedCause] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined): ScheduleActivityTaskFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activityType" -> activityType.map { x => x.asInstanceOf[js.Any] },
        "activityId" -> activityId.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleActivityTaskFailedEventAttributes]
    }
  }

  /**
   * <p>Decision attributes specified in <code>scheduleLambdaFunctionDecisionAttributes</code> within the list of decisions <code>decisions</code> passed to <a>RespondDecisionTaskCompleted</a>.</p>
   */
  @js.native
  trait ScheduleLambdaFunctionDecisionAttributes extends js.Object {
    var name: js.UndefOr[FunctionName]
    var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var id: js.UndefOr[FunctionId]
    var control: js.UndefOr[Data]
    var input: js.UndefOr[FunctionInput]
  }

  object ScheduleLambdaFunctionDecisionAttributes {
    def apply(
      name: js.UndefOr[FunctionName] = js.undefined,
      startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      id: js.UndefOr[FunctionId] = js.undefined,
      control: js.UndefOr[Data] = js.undefined,
      input: js.UndefOr[FunctionInput] = js.undefined): ScheduleLambdaFunctionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "startToCloseTimeout" -> startToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Provides the details of the <code>ScheduleLambdaFunctionFailed</code> event. It isn't set for other event types.</p>
   */
  @js.native
  trait ScheduleLambdaFunctionFailedEventAttributes extends js.Object {
    var id: js.UndefOr[FunctionId]
    var name: js.UndefOr[FunctionName]
    var cause: js.UndefOr[ScheduleLambdaFunctionFailedCause]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
  }

  object ScheduleLambdaFunctionFailedEventAttributes {
    def apply(
      id: js.UndefOr[FunctionId] = js.undefined,
      name: js.UndefOr[FunctionName] = js.undefined,
      cause: js.UndefOr[ScheduleLambdaFunctionFailedCause] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined): ScheduleLambdaFunctionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleLambdaFunctionFailedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>SignalExternalWorkflowExecution</code> decision.</p> <p> <b>Access Control</b> </p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li> <p>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</p> </li> <li> <p>Use an <code>Action</code> element to allow or deny permission to call this action.</p> </li> <li> <p>You cannot use an IAM policy to constrain this action's parameters.</p> </li> </ul> <p>If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.</p>
   */
  @js.native
  trait SignalExternalWorkflowExecutionDecisionAttributes extends js.Object {
    var control: js.UndefOr[Data]
    var signalName: js.UndefOr[SignalName]
    var runId: js.UndefOr[WorkflowRunIdOptional]
    var workflowId: js.UndefOr[WorkflowId]
    var input: js.UndefOr[Data]
  }

  object SignalExternalWorkflowExecutionDecisionAttributes {
    def apply(
      control: js.UndefOr[Data] = js.undefined,
      signalName: js.UndefOr[SignalName] = js.undefined,
      runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined,
      workflowId: js.UndefOr[WorkflowId] = js.undefined,
      input: js.UndefOr[Data] = js.undefined): SignalExternalWorkflowExecutionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "signalName" -> signalName.map { x => x.asInstanceOf[js.Any] },
        "runId" -> runId.map { x => x.asInstanceOf[js.Any] },
        "workflowId" -> workflowId.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Provides the details of the <code>SignalExternalWorkflowExecutionFailed</code> event.</p>
   */
  @js.native
  trait SignalExternalWorkflowExecutionFailedEventAttributes extends js.Object {
    var initiatedEventId: js.UndefOr[EventId]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
    var cause: js.UndefOr[SignalExternalWorkflowExecutionFailedCause]
    var control: js.UndefOr[Data]
    var runId: js.UndefOr[WorkflowRunIdOptional]
    var workflowId: js.UndefOr[WorkflowId]
  }

  object SignalExternalWorkflowExecutionFailedEventAttributes {
    def apply(
      initiatedEventId: js.UndefOr[EventId] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined,
      cause: js.UndefOr[SignalExternalWorkflowExecutionFailedCause] = js.undefined,
      control: js.UndefOr[Data] = js.undefined,
      runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined,
      workflowId: js.UndefOr[WorkflowId] = js.undefined): SignalExternalWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "initiatedEventId" -> initiatedEventId.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] },
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "runId" -> runId.map { x => x.asInstanceOf[js.Any] },
        "workflowId" -> workflowId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignalExternalWorkflowExecutionFailedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>SignalExternalWorkflowExecutionInitiated</code> event.</p>
   */
  @js.native
  trait SignalExternalWorkflowExecutionInitiatedEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
    var control: js.UndefOr[Data]
    var signalName: js.UndefOr[SignalName]
    var runId: js.UndefOr[WorkflowRunIdOptional]
    var workflowId: js.UndefOr[WorkflowId]
    var input: js.UndefOr[Data]
  }

  object SignalExternalWorkflowExecutionInitiatedEventAttributes {
    def apply(
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined,
      control: js.UndefOr[Data] = js.undefined,
      signalName: js.UndefOr[SignalName] = js.undefined,
      runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined,
      workflowId: js.UndefOr[WorkflowId] = js.undefined,
      input: js.UndefOr[Data] = js.undefined): SignalExternalWorkflowExecutionInitiatedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] },
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "signalName" -> signalName.map { x => x.asInstanceOf[js.Any] },
        "runId" -> runId.map { x => x.asInstanceOf[js.Any] },
        "workflowId" -> workflowId.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignalExternalWorkflowExecutionInitiatedEventAttributes]
    }
  }

  @js.native
  trait SignalWorkflowExecutionInput extends js.Object {
    var domain: js.UndefOr[DomainName]
    var signalName: js.UndefOr[SignalName]
    var runId: js.UndefOr[WorkflowRunIdOptional]
    var workflowId: js.UndefOr[WorkflowId]
    var input: js.UndefOr[Data]
  }

  object SignalWorkflowExecutionInput {
    def apply(
      domain: js.UndefOr[DomainName] = js.undefined,
      signalName: js.UndefOr[SignalName] = js.undefined,
      runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined,
      workflowId: js.UndefOr[WorkflowId] = js.undefined,
      input: js.UndefOr[Data] = js.undefined): SignalWorkflowExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "signalName" -> signalName.map { x => x.asInstanceOf[js.Any] },
        "runId" -> runId.map { x => x.asInstanceOf[js.Any] },
        "workflowId" -> workflowId.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignalWorkflowExecutionInput]
    }
  }

  /**
   * <p>Provides the details of the <code>StartChildWorkflowExecution</code> decision.</p> <p> <b>Access Control</b> </p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li> <p>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</p> </li> <li> <p>Use an <code>Action</code> element to allow or deny permission to call this action.</p> </li> <li> <p>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.</p> <ul> <li> <p> <code>tagList.member.N</code> – The key is "swf:tagList.N" where N is the tag number from 0 to 4, inclusive.</p> </li> <li> <p> <code>taskList</code> – String constraint. The key is <code>swf:taskList.name</code>.</p> </li> <li> <p> <code>workflowType.name</code> – String constraint. The key is <code>swf:workflowType.name</code>.</p> </li> <li> <p> <code>workflowType.version</code> – String constraint. The key is <code>swf:workflowType.version</code>.</p> </li> </ul> </li> </ul> <p>If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.</p>
   */
  @js.native
  trait StartChildWorkflowExecutionDecisionAttributes extends js.Object {
    var workflowType: js.UndefOr[WorkflowType]
    var lambdaRole: js.UndefOr[Arn]
    var taskList: js.UndefOr[TaskList]
    var tagList: js.UndefOr[TagList]
    var taskPriority: js.UndefOr[TaskPriority]
    var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var control: js.UndefOr[Data]
    var childPolicy: js.UndefOr[ChildPolicy]
    var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var workflowId: js.UndefOr[WorkflowId]
    var input: js.UndefOr[Data]
  }

  object StartChildWorkflowExecutionDecisionAttributes {
    def apply(
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      lambdaRole: js.UndefOr[Arn] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined,
      tagList: js.UndefOr[TagList] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined,
      taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      control: js.UndefOr[Data] = js.undefined,
      childPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      workflowId: js.UndefOr[WorkflowId] = js.undefined,
      input: js.UndefOr[Data] = js.undefined): StartChildWorkflowExecutionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowType" -> workflowType.map { x => x.asInstanceOf[js.Any] },
        "lambdaRole" -> lambdaRole.map { x => x.asInstanceOf[js.Any] },
        "taskList" -> taskList.map { x => x.asInstanceOf[js.Any] },
        "tagList" -> tagList.map { x => x.asInstanceOf[js.Any] },
        "taskPriority" -> taskPriority.map { x => x.asInstanceOf[js.Any] },
        "taskStartToCloseTimeout" -> taskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "childPolicy" -> childPolicy.map { x => x.asInstanceOf[js.Any] },
        "executionStartToCloseTimeout" -> executionStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "workflowId" -> workflowId.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Provides the details of the <code>StartChildWorkflowExecutionFailed</code> event.</p>
   */
  @js.native
  trait StartChildWorkflowExecutionFailedEventAttributes extends js.Object {
    var workflowType: js.UndefOr[WorkflowType]
    var initiatedEventId: js.UndefOr[EventId]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
    var cause: js.UndefOr[StartChildWorkflowExecutionFailedCause]
    var control: js.UndefOr[Data]
    var workflowId: js.UndefOr[WorkflowId]
  }

  object StartChildWorkflowExecutionFailedEventAttributes {
    def apply(
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      initiatedEventId: js.UndefOr[EventId] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined,
      cause: js.UndefOr[StartChildWorkflowExecutionFailedCause] = js.undefined,
      control: js.UndefOr[Data] = js.undefined,
      workflowId: js.UndefOr[WorkflowId] = js.undefined): StartChildWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowType" -> workflowType.map { x => x.asInstanceOf[js.Any] },
        "initiatedEventId" -> initiatedEventId.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] },
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "workflowId" -> workflowId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartChildWorkflowExecutionFailedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>StartChildWorkflowExecutionInitiated</code> event.</p>
   */
  @js.native
  trait StartChildWorkflowExecutionInitiatedEventAttributes extends js.Object {
    var workflowType: js.UndefOr[WorkflowType]
    var lambdaRole: js.UndefOr[Arn]
    var taskList: js.UndefOr[TaskList]
    var tagList: js.UndefOr[TagList]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
    var taskPriority: js.UndefOr[TaskPriority]
    var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var control: js.UndefOr[Data]
    var childPolicy: js.UndefOr[ChildPolicy]
    var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var workflowId: js.UndefOr[WorkflowId]
    var input: js.UndefOr[Data]
  }

  object StartChildWorkflowExecutionInitiatedEventAttributes {
    def apply(
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      lambdaRole: js.UndefOr[Arn] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined,
      tagList: js.UndefOr[TagList] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined,
      taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      control: js.UndefOr[Data] = js.undefined,
      childPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      workflowId: js.UndefOr[WorkflowId] = js.undefined,
      input: js.UndefOr[Data] = js.undefined): StartChildWorkflowExecutionInitiatedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowType" -> workflowType.map { x => x.asInstanceOf[js.Any] },
        "lambdaRole" -> lambdaRole.map { x => x.asInstanceOf[js.Any] },
        "taskList" -> taskList.map { x => x.asInstanceOf[js.Any] },
        "tagList" -> tagList.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] },
        "taskPriority" -> taskPriority.map { x => x.asInstanceOf[js.Any] },
        "taskStartToCloseTimeout" -> taskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "childPolicy" -> childPolicy.map { x => x.asInstanceOf[js.Any] },
        "executionStartToCloseTimeout" -> executionStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "workflowId" -> workflowId.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartChildWorkflowExecutionInitiatedEventAttributes]
    }
  }

  object StartLambdaFunctionFailedCauseEnum {
    val ASSUME_ROLE_FAILED = "ASSUME_ROLE_FAILED"

    val values = IndexedSeq(ASSUME_ROLE_FAILED)
  }

  /**
   * <p>Provides the details of the <code>StartLambdaFunctionFailed</code> event. It isn't set for other event types.</p>
   */
  @js.native
  trait StartLambdaFunctionFailedEventAttributes extends js.Object {
    var scheduledEventId: js.UndefOr[EventId]
    var cause: js.UndefOr[StartLambdaFunctionFailedCause]
    var message: js.UndefOr[CauseMessage]
  }

  object StartLambdaFunctionFailedEventAttributes {
    def apply(
      scheduledEventId: js.UndefOr[EventId] = js.undefined,
      cause: js.UndefOr[StartLambdaFunctionFailedCause] = js.undefined,
      message: js.UndefOr[CauseMessage] = js.undefined): StartLambdaFunctionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "scheduledEventId" -> scheduledEventId.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartLambdaFunctionFailedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>StartTimer</code> decision.</p> <p> <b>Access Control</b> </p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li> <p>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</p> </li> <li> <p>Use an <code>Action</code> element to allow or deny permission to call this action.</p> </li> <li> <p>You cannot use an IAM policy to constrain this action's parameters.</p> </li> </ul> <p>If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.</p>
   */
  @js.native
  trait StartTimerDecisionAttributes extends js.Object {
    var timerId: js.UndefOr[TimerId]
    var control: js.UndefOr[Data]
    var startToFireTimeout: js.UndefOr[DurationInSeconds]
  }

  object StartTimerDecisionAttributes {
    def apply(
      timerId: js.UndefOr[TimerId] = js.undefined,
      control: js.UndefOr[Data] = js.undefined,
      startToFireTimeout: js.UndefOr[DurationInSeconds] = js.undefined): StartTimerDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "timerId" -> timerId.map { x => x.asInstanceOf[js.Any] },
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "startToFireTimeout" -> startToFireTimeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Provides the details of the <code>StartTimerFailed</code> event.</p>
   */
  @js.native
  trait StartTimerFailedEventAttributes extends js.Object {
    var timerId: js.UndefOr[TimerId]
    var cause: js.UndefOr[StartTimerFailedCause]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
  }

  object StartTimerFailedEventAttributes {
    def apply(
      timerId: js.UndefOr[TimerId] = js.undefined,
      cause: js.UndefOr[StartTimerFailedCause] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined): StartTimerFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "timerId" -> timerId.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartTimerFailedEventAttributes]
    }
  }

  @js.native
  trait StartWorkflowExecutionInput extends js.Object {
    var workflowType: js.UndefOr[WorkflowType]
    var domain: js.UndefOr[DomainName]
    var lambdaRole: js.UndefOr[Arn]
    var taskList: js.UndefOr[TaskList]
    var tagList: js.UndefOr[TagList]
    var taskPriority: js.UndefOr[TaskPriority]
    var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var childPolicy: js.UndefOr[ChildPolicy]
    var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var workflowId: js.UndefOr[WorkflowId]
    var input: js.UndefOr[Data]
  }

  object StartWorkflowExecutionInput {
    def apply(
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      domain: js.UndefOr[DomainName] = js.undefined,
      lambdaRole: js.UndefOr[Arn] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined,
      tagList: js.UndefOr[TagList] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined,
      taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      childPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      workflowId: js.UndefOr[WorkflowId] = js.undefined,
      input: js.UndefOr[Data] = js.undefined): StartWorkflowExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowType" -> workflowType.map { x => x.asInstanceOf[js.Any] },
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "lambdaRole" -> lambdaRole.map { x => x.asInstanceOf[js.Any] },
        "taskList" -> taskList.map { x => x.asInstanceOf[js.Any] },
        "tagList" -> tagList.map { x => x.asInstanceOf[js.Any] },
        "taskPriority" -> taskPriority.map { x => x.asInstanceOf[js.Any] },
        "taskStartToCloseTimeout" -> taskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "childPolicy" -> childPolicy.map { x => x.asInstanceOf[js.Any] },
        "executionStartToCloseTimeout" -> executionStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "workflowId" -> workflowId.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartWorkflowExecutionInput]
    }
  }

  /**
   * <p>Used to filter the workflow executions in visibility APIs based on a tag.</p>
   */
  @js.native
  trait TagFilter extends js.Object {
    var tag: js.UndefOr[Tag]
  }

  object TagFilter {
    def apply(
      tag: js.UndefOr[Tag] = js.undefined): TagFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tag" -> tag.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagFilter]
    }
  }

  /**
   * <p>Represents a task list.</p>
   */
  @js.native
  trait TaskList extends js.Object {
    var name: js.UndefOr[Name]
  }

  object TaskList {
    def apply(
      name: js.UndefOr[Name] = js.undefined): TaskList = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskList]
    }
  }

  @js.native
  trait TerminateWorkflowExecutionInput extends js.Object {
    var domain: js.UndefOr[DomainName]
    var reason: js.UndefOr[TerminateReason]
    var details: js.UndefOr[Data]
    var childPolicy: js.UndefOr[ChildPolicy]
    var runId: js.UndefOr[WorkflowRunIdOptional]
    var workflowId: js.UndefOr[WorkflowId]
  }

  object TerminateWorkflowExecutionInput {
    def apply(
      domain: js.UndefOr[DomainName] = js.undefined,
      reason: js.UndefOr[TerminateReason] = js.undefined,
      details: js.UndefOr[Data] = js.undefined,
      childPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined,
      workflowId: js.UndefOr[WorkflowId] = js.undefined): TerminateWorkflowExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domain" -> domain.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] },
        "details" -> details.map { x => x.asInstanceOf[js.Any] },
        "childPolicy" -> childPolicy.map { x => x.asInstanceOf[js.Any] },
        "runId" -> runId.map { x => x.asInstanceOf[js.Any] },
        "workflowId" -> workflowId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateWorkflowExecutionInput]
    }
  }

  /**
   * <p> Provides the details of the <code>TimerCanceled</code> event. </p>
   */
  @js.native
  trait TimerCanceledEventAttributes extends js.Object {
    var timerId: js.UndefOr[TimerId]
    var startedEventId: js.UndefOr[EventId]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
  }

  object TimerCanceledEventAttributes {
    def apply(
      timerId: js.UndefOr[TimerId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined): TimerCanceledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "timerId" -> timerId.map { x => x.asInstanceOf[js.Any] },
        "startedEventId" -> startedEventId.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimerCanceledEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>TimerFired</code> event.</p>
   */
  @js.native
  trait TimerFiredEventAttributes extends js.Object {
    var timerId: js.UndefOr[TimerId]
    var startedEventId: js.UndefOr[EventId]
  }

  object TimerFiredEventAttributes {
    def apply(
      timerId: js.UndefOr[TimerId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined): TimerFiredEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "timerId" -> timerId.map { x => x.asInstanceOf[js.Any] },
        "startedEventId" -> startedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimerFiredEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>TimerStarted</code> event.</p>
   */
  @js.native
  trait TimerStartedEventAttributes extends js.Object {
    var timerId: js.UndefOr[TimerId]
    var control: js.UndefOr[Data]
    var startToFireTimeout: js.UndefOr[DurationInSeconds]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
  }

  object TimerStartedEventAttributes {
    def apply(
      timerId: js.UndefOr[TimerId] = js.undefined,
      control: js.UndefOr[Data] = js.undefined,
      startToFireTimeout: js.UndefOr[DurationInSeconds] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined): TimerStartedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "timerId" -> timerId.map { x => x.asInstanceOf[js.Any] },
        "control" -> control.map { x => x.asInstanceOf[js.Any] },
        "startToFireTimeout" -> startToFireTimeout.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimerStartedEventAttributes]
    }
  }

  /**
   * <p>Returned if the type already exists in the specified domain. You get this fault even if the existing type is in deprecated status. You can specify another version if the intent is to create a new distinct version of the type.</p>
   */
  @js.native
  trait TypeAlreadyExistsFaultException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Returned when the specified activity or workflow type was already deprecated.</p>
   */
  @js.native
  trait TypeDeprecatedFaultException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation.</p>
   */
  @js.native
  trait UnknownResourceFaultException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>Represents a workflow execution.</p>
   */
  @js.native
  trait WorkflowExecution extends js.Object {
    var workflowId: js.UndefOr[WorkflowId]
    var runId: js.UndefOr[WorkflowRunId]
  }

  object WorkflowExecution {
    def apply(
      workflowId: js.UndefOr[WorkflowId] = js.undefined,
      runId: js.UndefOr[WorkflowRunId] = js.undefined): WorkflowExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowId" -> workflowId.map { x => x.asInstanceOf[js.Any] },
        "runId" -> runId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecution]
    }
  }

  /**
   * <p>Returned by <a>StartWorkflowExecution</a> when an open execution with the same workflowId is already running in the specified domain.</p>
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
   * <p>Provides the details of the <code>WorkflowExecutionCancelRequested</code> event.</p>
   */
  @js.native
  trait WorkflowExecutionCancelRequestedEventAttributes extends js.Object {
    var externalWorkflowExecution: js.UndefOr[WorkflowExecution]
    var externalInitiatedEventId: js.UndefOr[EventId]
    var cause: js.UndefOr[WorkflowExecutionCancelRequestedCause]
  }

  object WorkflowExecutionCancelRequestedEventAttributes {
    def apply(
      externalWorkflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      externalInitiatedEventId: js.UndefOr[EventId] = js.undefined,
      cause: js.UndefOr[WorkflowExecutionCancelRequestedCause] = js.undefined): WorkflowExecutionCancelRequestedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "externalWorkflowExecution" -> externalWorkflowExecution.map { x => x.asInstanceOf[js.Any] },
        "externalInitiatedEventId" -> externalInitiatedEventId.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionCancelRequestedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>WorkflowExecutionCanceled</code> event.</p>
   */
  @js.native
  trait WorkflowExecutionCanceledEventAttributes extends js.Object {
    var details: js.UndefOr[Data]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
  }

  object WorkflowExecutionCanceledEventAttributes {
    def apply(
      details: js.UndefOr[Data] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined): WorkflowExecutionCanceledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "details" -> details.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionCanceledEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>WorkflowExecutionCompleted</code> event.</p>
   */
  @js.native
  trait WorkflowExecutionCompletedEventAttributes extends js.Object {
    var result: js.UndefOr[Data]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
  }

  object WorkflowExecutionCompletedEventAttributes {
    def apply(
      result: js.UndefOr[Data] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined): WorkflowExecutionCompletedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "result" -> result.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionCompletedEventAttributes]
    }
  }

  /**
   * <p>The configuration settings for a workflow execution including timeout values, tasklist etc. These configuration settings are determined from the defaults specified when registering the workflow type and those specified when starting the workflow execution.</p>
   */
  @js.native
  trait WorkflowExecutionConfiguration extends js.Object {
    var lambdaRole: js.UndefOr[Arn]
    var taskList: js.UndefOr[TaskList]
    var taskPriority: js.UndefOr[TaskPriority]
    var taskStartToCloseTimeout: js.UndefOr[DurationInSeconds]
    var childPolicy: js.UndefOr[ChildPolicy]
    var executionStartToCloseTimeout: js.UndefOr[DurationInSeconds]
  }

  object WorkflowExecutionConfiguration {
    def apply(
      lambdaRole: js.UndefOr[Arn] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined,
      taskStartToCloseTimeout: js.UndefOr[DurationInSeconds] = js.undefined,
      childPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      executionStartToCloseTimeout: js.UndefOr[DurationInSeconds] = js.undefined): WorkflowExecutionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lambdaRole" -> lambdaRole.map { x => x.asInstanceOf[js.Any] },
        "taskList" -> taskList.map { x => x.asInstanceOf[js.Any] },
        "taskPriority" -> taskPriority.map { x => x.asInstanceOf[js.Any] },
        "taskStartToCloseTimeout" -> taskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "childPolicy" -> childPolicy.map { x => x.asInstanceOf[js.Any] },
        "executionStartToCloseTimeout" -> executionStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionConfiguration]
    }
  }

  /**
   * <p>Provides the details of the <code>WorkflowExecutionContinuedAsNew</code> event.</p>
   */
  @js.native
  trait WorkflowExecutionContinuedAsNewEventAttributes extends js.Object {
    var workflowType: js.UndefOr[WorkflowType]
    var lambdaRole: js.UndefOr[Arn]
    var taskList: js.UndefOr[TaskList]
    var tagList: js.UndefOr[TagList]
    var newExecutionRunId: js.UndefOr[WorkflowRunId]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
    var taskPriority: js.UndefOr[TaskPriority]
    var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var childPolicy: js.UndefOr[ChildPolicy]
    var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var input: js.UndefOr[Data]
  }

  object WorkflowExecutionContinuedAsNewEventAttributes {
    def apply(
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      lambdaRole: js.UndefOr[Arn] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined,
      tagList: js.UndefOr[TagList] = js.undefined,
      newExecutionRunId: js.UndefOr[WorkflowRunId] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined,
      taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      childPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      input: js.UndefOr[Data] = js.undefined): WorkflowExecutionContinuedAsNewEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowType" -> workflowType.map { x => x.asInstanceOf[js.Any] },
        "lambdaRole" -> lambdaRole.map { x => x.asInstanceOf[js.Any] },
        "taskList" -> taskList.map { x => x.asInstanceOf[js.Any] },
        "tagList" -> tagList.map { x => x.asInstanceOf[js.Any] },
        "newExecutionRunId" -> newExecutionRunId.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] },
        "taskPriority" -> taskPriority.map { x => x.asInstanceOf[js.Any] },
        "taskStartToCloseTimeout" -> taskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "childPolicy" -> childPolicy.map { x => x.asInstanceOf[js.Any] },
        "executionStartToCloseTimeout" -> executionStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionContinuedAsNewEventAttributes]
    }
  }

  /**
   * <p>Contains the count of workflow executions returned from <a>CountOpenWorkflowExecutions</a> or <a>CountClosedWorkflowExecutions</a> </p>
   */
  @js.native
  trait WorkflowExecutionCount extends js.Object {
    var count: js.UndefOr[Count]
    var truncated: js.UndefOr[Truncated]
  }

  object WorkflowExecutionCount {
    def apply(
      count: js.UndefOr[Count] = js.undefined,
      truncated: js.UndefOr[Truncated] = js.undefined): WorkflowExecutionCount = {
      val _fields = IndexedSeq[(String, js.Any)](
        "count" -> count.map { x => x.asInstanceOf[js.Any] },
        "truncated" -> truncated.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionCount]
    }
  }

  /**
   * <p>Contains details about a workflow execution.</p>
   */
  @js.native
  trait WorkflowExecutionDetail extends js.Object {
    var openCounts: js.UndefOr[WorkflowExecutionOpenCounts]
    var latestActivityTaskTimestamp: js.UndefOr[Timestamp]
    var latestExecutionContext: js.UndefOr[Data]
    var executionInfo: js.UndefOr[WorkflowExecutionInfo]
    var executionConfiguration: js.UndefOr[WorkflowExecutionConfiguration]
  }

  object WorkflowExecutionDetail {
    def apply(
      openCounts: js.UndefOr[WorkflowExecutionOpenCounts] = js.undefined,
      latestActivityTaskTimestamp: js.UndefOr[Timestamp] = js.undefined,
      latestExecutionContext: js.UndefOr[Data] = js.undefined,
      executionInfo: js.UndefOr[WorkflowExecutionInfo] = js.undefined,
      executionConfiguration: js.UndefOr[WorkflowExecutionConfiguration] = js.undefined): WorkflowExecutionDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "openCounts" -> openCounts.map { x => x.asInstanceOf[js.Any] },
        "latestActivityTaskTimestamp" -> latestActivityTaskTimestamp.map { x => x.asInstanceOf[js.Any] },
        "latestExecutionContext" -> latestExecutionContext.map { x => x.asInstanceOf[js.Any] },
        "executionInfo" -> executionInfo.map { x => x.asInstanceOf[js.Any] },
        "executionConfiguration" -> executionConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionDetail]
    }
  }

  /**
   * <p>Provides the details of the <code>WorkflowExecutionFailed</code> event.</p>
   */
  @js.native
  trait WorkflowExecutionFailedEventAttributes extends js.Object {
    var reason: js.UndefOr[FailureReason]
    var details: js.UndefOr[Data]
    var decisionTaskCompletedEventId: js.UndefOr[EventId]
  }

  object WorkflowExecutionFailedEventAttributes {
    def apply(
      reason: js.UndefOr[FailureReason] = js.undefined,
      details: js.UndefOr[Data] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined): WorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] },
        "details" -> details.map { x => x.asInstanceOf[js.Any] },
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionFailedEventAttributes]
    }
  }

  /**
   * <p>Used to filter the workflow executions in visibility APIs by their <code>workflowId</code>.</p>
   */
  @js.native
  trait WorkflowExecutionFilter extends js.Object {
    var workflowId: js.UndefOr[WorkflowId]
  }

  object WorkflowExecutionFilter {
    def apply(
      workflowId: js.UndefOr[WorkflowId] = js.undefined): WorkflowExecutionFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowId" -> workflowId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionFilter]
    }
  }

  /**
   * <p>Contains information about a workflow execution.</p>
   */
  @js.native
  trait WorkflowExecutionInfo extends js.Object {
    var execution: js.UndefOr[WorkflowExecution]
    var parent: js.UndefOr[WorkflowExecution]
    var closeTimestamp: js.UndefOr[Timestamp]
    var executionStatus: js.UndefOr[ExecutionStatus]
    var workflowType: js.UndefOr[WorkflowType]
    var closeStatus: js.UndefOr[CloseStatus]
    var tagList: js.UndefOr[TagList]
    var startTimestamp: js.UndefOr[Timestamp]
    var cancelRequested: js.UndefOr[Canceled]
  }

  object WorkflowExecutionInfo {
    def apply(
      execution: js.UndefOr[WorkflowExecution] = js.undefined,
      parent: js.UndefOr[WorkflowExecution] = js.undefined,
      closeTimestamp: js.UndefOr[Timestamp] = js.undefined,
      executionStatus: js.UndefOr[ExecutionStatus] = js.undefined,
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      closeStatus: js.UndefOr[CloseStatus] = js.undefined,
      tagList: js.UndefOr[TagList] = js.undefined,
      startTimestamp: js.UndefOr[Timestamp] = js.undefined,
      cancelRequested: js.UndefOr[Canceled] = js.undefined): WorkflowExecutionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "execution" -> execution.map { x => x.asInstanceOf[js.Any] },
        "parent" -> parent.map { x => x.asInstanceOf[js.Any] },
        "closeTimestamp" -> closeTimestamp.map { x => x.asInstanceOf[js.Any] },
        "executionStatus" -> executionStatus.map { x => x.asInstanceOf[js.Any] },
        "workflowType" -> workflowType.map { x => x.asInstanceOf[js.Any] },
        "closeStatus" -> closeStatus.map { x => x.asInstanceOf[js.Any] },
        "tagList" -> tagList.map { x => x.asInstanceOf[js.Any] },
        "startTimestamp" -> startTimestamp.map { x => x.asInstanceOf[js.Any] },
        "cancelRequested" -> cancelRequested.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionInfo]
    }
  }

  /**
   * <p>Contains a paginated list of information about workflow executions.</p>
   */
  @js.native
  trait WorkflowExecutionInfos extends js.Object {
    var executionInfos: js.UndefOr[WorkflowExecutionInfoList]
    var nextPageToken: js.UndefOr[PageToken]
  }

  object WorkflowExecutionInfos {
    def apply(
      executionInfos: js.UndefOr[WorkflowExecutionInfoList] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined): WorkflowExecutionInfos = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionInfos" -> executionInfos.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionInfos]
    }
  }

  /**
   * <p>Contains the counts of open tasks, child workflow executions and timers for a workflow execution.</p>
   */
  @js.native
  trait WorkflowExecutionOpenCounts extends js.Object {
    var openChildWorkflowExecutions: js.UndefOr[Count]
    var openActivityTasks: js.UndefOr[Count]
    var openLambdaFunctions: js.UndefOr[Count]
    var openTimers: js.UndefOr[Count]
    var openDecisionTasks: js.UndefOr[OpenDecisionTasksCount]
  }

  object WorkflowExecutionOpenCounts {
    def apply(
      openChildWorkflowExecutions: js.UndefOr[Count] = js.undefined,
      openActivityTasks: js.UndefOr[Count] = js.undefined,
      openLambdaFunctions: js.UndefOr[Count] = js.undefined,
      openTimers: js.UndefOr[Count] = js.undefined,
      openDecisionTasks: js.UndefOr[OpenDecisionTasksCount] = js.undefined): WorkflowExecutionOpenCounts = {
      val _fields = IndexedSeq[(String, js.Any)](
        "openChildWorkflowExecutions" -> openChildWorkflowExecutions.map { x => x.asInstanceOf[js.Any] },
        "openActivityTasks" -> openActivityTasks.map { x => x.asInstanceOf[js.Any] },
        "openLambdaFunctions" -> openLambdaFunctions.map { x => x.asInstanceOf[js.Any] },
        "openTimers" -> openTimers.map { x => x.asInstanceOf[js.Any] },
        "openDecisionTasks" -> openDecisionTasks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionOpenCounts]
    }
  }

  /**
   * <p>Provides the details of the <code>WorkflowExecutionSignaled</code> event.</p>
   */
  @js.native
  trait WorkflowExecutionSignaledEventAttributes extends js.Object {
    var signalName: js.UndefOr[SignalName]
    var input: js.UndefOr[Data]
    var externalWorkflowExecution: js.UndefOr[WorkflowExecution]
    var externalInitiatedEventId: js.UndefOr[EventId]
  }

  object WorkflowExecutionSignaledEventAttributes {
    def apply(
      signalName: js.UndefOr[SignalName] = js.undefined,
      input: js.UndefOr[Data] = js.undefined,
      externalWorkflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      externalInitiatedEventId: js.UndefOr[EventId] = js.undefined): WorkflowExecutionSignaledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "signalName" -> signalName.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] },
        "externalWorkflowExecution" -> externalWorkflowExecution.map { x => x.asInstanceOf[js.Any] },
        "externalInitiatedEventId" -> externalInitiatedEventId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionSignaledEventAttributes]
    }
  }

  /**
   * <p>Provides details of <code>WorkflowExecutionStarted</code> event.</p>
   */
  @js.native
  trait WorkflowExecutionStartedEventAttributes extends js.Object {
    var parentInitiatedEventId: js.UndefOr[EventId]
    var workflowType: js.UndefOr[WorkflowType]
    var lambdaRole: js.UndefOr[Arn]
    var taskList: js.UndefOr[TaskList]
    var tagList: js.UndefOr[TagList]
    var parentWorkflowExecution: js.UndefOr[WorkflowExecution]
    var taskPriority: js.UndefOr[TaskPriority]
    var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var continuedExecutionRunId: js.UndefOr[WorkflowRunIdOptional]
    var childPolicy: js.UndefOr[ChildPolicy]
    var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var input: js.UndefOr[Data]
  }

  object WorkflowExecutionStartedEventAttributes {
    def apply(
      parentInitiatedEventId: js.UndefOr[EventId] = js.undefined,
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      lambdaRole: js.UndefOr[Arn] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined,
      tagList: js.UndefOr[TagList] = js.undefined,
      parentWorkflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined,
      taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      continuedExecutionRunId: js.UndefOr[WorkflowRunIdOptional] = js.undefined,
      childPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      input: js.UndefOr[Data] = js.undefined): WorkflowExecutionStartedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "parentInitiatedEventId" -> parentInitiatedEventId.map { x => x.asInstanceOf[js.Any] },
        "workflowType" -> workflowType.map { x => x.asInstanceOf[js.Any] },
        "lambdaRole" -> lambdaRole.map { x => x.asInstanceOf[js.Any] },
        "taskList" -> taskList.map { x => x.asInstanceOf[js.Any] },
        "tagList" -> tagList.map { x => x.asInstanceOf[js.Any] },
        "parentWorkflowExecution" -> parentWorkflowExecution.map { x => x.asInstanceOf[js.Any] },
        "taskPriority" -> taskPriority.map { x => x.asInstanceOf[js.Any] },
        "taskStartToCloseTimeout" -> taskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "continuedExecutionRunId" -> continuedExecutionRunId.map { x => x.asInstanceOf[js.Any] },
        "childPolicy" -> childPolicy.map { x => x.asInstanceOf[js.Any] },
        "executionStartToCloseTimeout" -> executionStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "input" -> input.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Provides the details of the <code>WorkflowExecutionTerminated</code> event.</p>
   */
  @js.native
  trait WorkflowExecutionTerminatedEventAttributes extends js.Object {
    var reason: js.UndefOr[TerminateReason]
    var details: js.UndefOr[Data]
    var childPolicy: js.UndefOr[ChildPolicy]
    var cause: js.UndefOr[WorkflowExecutionTerminatedCause]
  }

  object WorkflowExecutionTerminatedEventAttributes {
    def apply(
      reason: js.UndefOr[TerminateReason] = js.undefined,
      details: js.UndefOr[Data] = js.undefined,
      childPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      cause: js.UndefOr[WorkflowExecutionTerminatedCause] = js.undefined): WorkflowExecutionTerminatedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] },
        "details" -> details.map { x => x.asInstanceOf[js.Any] },
        "childPolicy" -> childPolicy.map { x => x.asInstanceOf[js.Any] },
        "cause" -> cause.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionTerminatedEventAttributes]
    }
  }

  /**
   * <p>Provides the details of the <code>WorkflowExecutionTimedOut</code> event.</p>
   */
  @js.native
  trait WorkflowExecutionTimedOutEventAttributes extends js.Object {
    var timeoutType: js.UndefOr[WorkflowExecutionTimeoutType]
    var childPolicy: js.UndefOr[ChildPolicy]
  }

  object WorkflowExecutionTimedOutEventAttributes {
    def apply(
      timeoutType: js.UndefOr[WorkflowExecutionTimeoutType] = js.undefined,
      childPolicy: js.UndefOr[ChildPolicy] = js.undefined): WorkflowExecutionTimedOutEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "timeoutType" -> timeoutType.map { x => x.asInstanceOf[js.Any] },
        "childPolicy" -> childPolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionTimedOutEventAttributes]
    }
  }

  object WorkflowExecutionTimeoutTypeEnum {
    val START_TO_CLOSE = "START_TO_CLOSE"

    val values = IndexedSeq(START_TO_CLOSE)
  }

  /**
   * <p>Represents a workflow type.</p>
   */
  @js.native
  trait WorkflowType extends js.Object {
    var name: js.UndefOr[Name]
    var version: js.UndefOr[Version]
  }

  object WorkflowType {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      version: js.UndefOr[Version] = js.undefined): WorkflowType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowType]
    }
  }

  /**
   * <p>The configuration settings of a workflow type.</p>
   */
  @js.native
  trait WorkflowTypeConfiguration extends js.Object {
    var defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var defaultTaskList: js.UndefOr[TaskList]
    var defaultLambdaRole: js.UndefOr[Arn]
    var defaultChildPolicy: js.UndefOr[ChildPolicy]
    var defaultTaskPriority: js.UndefOr[TaskPriority]
    var defaultExecutionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
  }

  object WorkflowTypeConfiguration {
    def apply(
      defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      defaultTaskList: js.UndefOr[TaskList] = js.undefined,
      defaultLambdaRole: js.UndefOr[Arn] = js.undefined,
      defaultChildPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      defaultTaskPriority: js.UndefOr[TaskPriority] = js.undefined,
      defaultExecutionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined): WorkflowTypeConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "defaultTaskStartToCloseTimeout" -> defaultTaskStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskList" -> defaultTaskList.map { x => x.asInstanceOf[js.Any] },
        "defaultLambdaRole" -> defaultLambdaRole.map { x => x.asInstanceOf[js.Any] },
        "defaultChildPolicy" -> defaultChildPolicy.map { x => x.asInstanceOf[js.Any] },
        "defaultTaskPriority" -> defaultTaskPriority.map { x => x.asInstanceOf[js.Any] },
        "defaultExecutionStartToCloseTimeout" -> defaultExecutionStartToCloseTimeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowTypeConfiguration]
    }
  }

  /**
   * <p>Contains details about a workflow type.</p>
   */
  @js.native
  trait WorkflowTypeDetail extends js.Object {
    var typeInfo: js.UndefOr[WorkflowTypeInfo]
    var configuration: js.UndefOr[WorkflowTypeConfiguration]
  }

  object WorkflowTypeDetail {
    def apply(
      typeInfo: js.UndefOr[WorkflowTypeInfo] = js.undefined,
      configuration: js.UndefOr[WorkflowTypeConfiguration] = js.undefined): WorkflowTypeDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "typeInfo" -> typeInfo.map { x => x.asInstanceOf[js.Any] },
        "configuration" -> configuration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowTypeDetail]
    }
  }

  /**
   * <p>Used to filter workflow execution query results by type. Each parameter, if specified, defines a rule that must be satisfied by each returned result.</p>
   */
  @js.native
  trait WorkflowTypeFilter extends js.Object {
    var name: js.UndefOr[Name]
    var version: js.UndefOr[VersionOptional]
  }

  object WorkflowTypeFilter {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      version: js.UndefOr[VersionOptional] = js.undefined): WorkflowTypeFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowTypeFilter]
    }
  }

  /**
   * <p>Contains information about a workflow type.</p>
   */
  @js.native
  trait WorkflowTypeInfo extends js.Object {
    var workflowType: js.UndefOr[WorkflowType]
    var description: js.UndefOr[Description]
    var status: js.UndefOr[RegistrationStatus]
    var deprecationDate: js.UndefOr[Timestamp]
    var creationDate: js.UndefOr[Timestamp]
  }

  object WorkflowTypeInfo {
    def apply(
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      status: js.UndefOr[RegistrationStatus] = js.undefined,
      deprecationDate: js.UndefOr[Timestamp] = js.undefined,
      creationDate: js.UndefOr[Timestamp] = js.undefined): WorkflowTypeInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "workflowType" -> workflowType.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "deprecationDate" -> deprecationDate.map { x => x.asInstanceOf[js.Any] },
        "creationDate" -> creationDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowTypeInfo]
    }
  }

  /**
   * <p>Contains a paginated list of information structures about workflow types.</p>
   */
  @js.native
  trait WorkflowTypeInfos extends js.Object {
    var typeInfos: js.UndefOr[WorkflowTypeInfoList]
    var nextPageToken: js.UndefOr[PageToken]
  }

  object WorkflowTypeInfos {
    def apply(
      typeInfos: js.UndefOr[WorkflowTypeInfoList] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined): WorkflowTypeInfos = {
      val _fields = IndexedSeq[(String, js.Any)](
        "typeInfos" -> typeInfos.map { x => x.asInstanceOf[js.Any] },
        "nextPageToken" -> nextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowTypeInfos]
    }
  }
}
