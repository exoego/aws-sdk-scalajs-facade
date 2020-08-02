package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object swf {
  type ActivityId = String
  type ActivityTypeInfoList = js.Array[ActivityTypeInfo]
  type Arn = String
  type Canceled = Boolean
  type CauseMessage = String
  type Count = Int
  type Data = String
  type DecisionList = js.Array[Decision]
  type Description = String
  type DomainInfoList = js.Array[DomainInfo]
  type DomainName = String
  type DurationInDays = String
  type DurationInSeconds = String
  type DurationInSecondsOptional = String
  type EventId = Double
  type FailureReason = String
  type FunctionId = String
  type FunctionInput = String
  type FunctionName = String
  type HistoryEventList = js.Array[HistoryEvent]
  type Identity = String
  type LimitedData = String
  type MarkerName = String
  type Name = String
  type OpenDecisionTasksCount = Int
  type PageSize = Int
  type PageToken = String
  type ResourceTagKey = String
  type ResourceTagKeyList = js.Array[ResourceTagKey]
  type ResourceTagList = js.Array[ResourceTag]
  type ResourceTagValue = String
  type ReverseOrder = Boolean
  type SignalName = String
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
  type WorkflowExecutionInfoList = js.Array[WorkflowExecutionInfo]
  type WorkflowId = String
  type WorkflowRunId = String
  type WorkflowRunIdOptional = String
  type WorkflowTypeInfoList = js.Array[WorkflowTypeInfo]

  implicit final class SWFOps(private val service: SWF) extends AnyVal {

    @inline def countClosedWorkflowExecutionsFuture(params: CountClosedWorkflowExecutionsInput): Future[WorkflowExecutionCount] = service.countClosedWorkflowExecutions(params).promise().toFuture
    @inline def countOpenWorkflowExecutionsFuture(params: CountOpenWorkflowExecutionsInput): Future[WorkflowExecutionCount] = service.countOpenWorkflowExecutions(params).promise().toFuture
    @inline def countPendingActivityTasksFuture(params: CountPendingActivityTasksInput): Future[PendingTaskCount] = service.countPendingActivityTasks(params).promise().toFuture
    @inline def countPendingDecisionTasksFuture(params: CountPendingDecisionTasksInput): Future[PendingTaskCount] = service.countPendingDecisionTasks(params).promise().toFuture
    @inline def deprecateActivityTypeFuture(params: DeprecateActivityTypeInput): Future[js.Object] = service.deprecateActivityType(params).promise().toFuture
    @inline def deprecateDomainFuture(params: DeprecateDomainInput): Future[js.Object] = service.deprecateDomain(params).promise().toFuture
    @inline def deprecateWorkflowTypeFuture(params: DeprecateWorkflowTypeInput): Future[js.Object] = service.deprecateWorkflowType(params).promise().toFuture
    @inline def describeActivityTypeFuture(params: DescribeActivityTypeInput): Future[ActivityTypeDetail] = service.describeActivityType(params).promise().toFuture
    @inline def describeDomainFuture(params: DescribeDomainInput): Future[DomainDetail] = service.describeDomain(params).promise().toFuture
    @inline def describeWorkflowExecutionFuture(params: DescribeWorkflowExecutionInput): Future[WorkflowExecutionDetail] = service.describeWorkflowExecution(params).promise().toFuture
    @inline def describeWorkflowTypeFuture(params: DescribeWorkflowTypeInput): Future[WorkflowTypeDetail] = service.describeWorkflowType(params).promise().toFuture
    @inline def getWorkflowExecutionHistoryFuture(params: GetWorkflowExecutionHistoryInput): Future[History] = service.getWorkflowExecutionHistory(params).promise().toFuture
    @inline def listActivityTypesFuture(params: ListActivityTypesInput): Future[ActivityTypeInfos] = service.listActivityTypes(params).promise().toFuture
    @inline def listClosedWorkflowExecutionsFuture(params: ListClosedWorkflowExecutionsInput): Future[WorkflowExecutionInfos] = service.listClosedWorkflowExecutions(params).promise().toFuture
    @inline def listDomainsFuture(params: ListDomainsInput): Future[DomainInfos] = service.listDomains(params).promise().toFuture
    @inline def listOpenWorkflowExecutionsFuture(params: ListOpenWorkflowExecutionsInput): Future[WorkflowExecutionInfos] = service.listOpenWorkflowExecutions(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] = service.listTagsForResource(params).promise().toFuture
    @inline def listWorkflowTypesFuture(params: ListWorkflowTypesInput): Future[WorkflowTypeInfos] = service.listWorkflowTypes(params).promise().toFuture
    @inline def pollForActivityTaskFuture(params: PollForActivityTaskInput): Future[ActivityTask] = service.pollForActivityTask(params).promise().toFuture
    @inline def pollForDecisionTaskFuture(params: PollForDecisionTaskInput): Future[DecisionTask] = service.pollForDecisionTask(params).promise().toFuture
    @inline def recordActivityTaskHeartbeatFuture(params: RecordActivityTaskHeartbeatInput): Future[ActivityTaskStatus] = service.recordActivityTaskHeartbeat(params).promise().toFuture
    @inline def registerActivityTypeFuture(params: RegisterActivityTypeInput): Future[js.Object] = service.registerActivityType(params).promise().toFuture
    @inline def registerDomainFuture(params: RegisterDomainInput): Future[js.Object] = service.registerDomain(params).promise().toFuture
    @inline def registerWorkflowTypeFuture(params: RegisterWorkflowTypeInput): Future[js.Object] = service.registerWorkflowType(params).promise().toFuture
    @inline def requestCancelWorkflowExecutionFuture(params: RequestCancelWorkflowExecutionInput): Future[js.Object] = service.requestCancelWorkflowExecution(params).promise().toFuture
    @inline def respondActivityTaskCanceledFuture(params: RespondActivityTaskCanceledInput): Future[js.Object] = service.respondActivityTaskCanceled(params).promise().toFuture
    @inline def respondActivityTaskCompletedFuture(params: RespondActivityTaskCompletedInput): Future[js.Object] = service.respondActivityTaskCompleted(params).promise().toFuture
    @inline def respondActivityTaskFailedFuture(params: RespondActivityTaskFailedInput): Future[js.Object] = service.respondActivityTaskFailed(params).promise().toFuture
    @inline def respondDecisionTaskCompletedFuture(params: RespondDecisionTaskCompletedInput): Future[js.Object] = service.respondDecisionTaskCompleted(params).promise().toFuture
    @inline def signalWorkflowExecutionFuture(params: SignalWorkflowExecutionInput): Future[js.Object] = service.signalWorkflowExecution(params).promise().toFuture
    @inline def startWorkflowExecutionFuture(params: StartWorkflowExecutionInput): Future[Run] = service.startWorkflowExecution(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def terminateWorkflowExecutionFuture(params: TerminateWorkflowExecutionInput): Future[js.Object] = service.terminateWorkflowExecution(params).promise().toFuture
    @inline def undeprecateActivityTypeFuture(params: UndeprecateActivityTypeInput): Future[js.Object] = service.undeprecateActivityType(params).promise().toFuture
    @inline def undeprecateDomainFuture(params: UndeprecateDomainInput): Future[js.Object] = service.undeprecateDomain(params).promise().toFuture
    @inline def undeprecateWorkflowTypeFuture(params: UndeprecateWorkflowTypeInput): Future[js.Object] = service.undeprecateWorkflowType(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[js.Object] = service.untagResource(params).promise().toFuture

  }
}

package swf {
  @js.native
  @JSImport("aws-sdk", "SWF", "AWS.SWF")
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
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
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
    def tagResource(params: TagResourceInput): Request[js.Object] = js.native
    def terminateWorkflowExecution(params: TerminateWorkflowExecutionInput): Request[js.Object] = js.native
    def undeprecateActivityType(params: UndeprecateActivityTypeInput): Request[js.Object] = js.native
    def undeprecateDomain(params: UndeprecateDomainInput): Request[js.Object] = js.native
    def undeprecateWorkflowType(params: UndeprecateWorkflowTypeInput): Request[js.Object] = js.native
    def untagResource(params: UntagResourceInput): Request[js.Object] = js.native
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
    @inline
    def apply(
        activityId: ActivityId,
        activityType: ActivityType,
        startedEventId: EventId,
        taskToken: TaskToken,
        workflowExecution: WorkflowExecution,
        input: js.UndefOr[Data] = js.undefined
    ): ActivityTask = {
      val __obj = js.Dynamic.literal(
        "activityId" -> activityId.asInstanceOf[js.Any],
        "activityType" -> activityType.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "taskToken" -> taskToken.asInstanceOf[js.Any],
        "workflowExecution" -> workflowExecution.asInstanceOf[js.Any]
      )

      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivityTask]
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
    @inline
    def apply(
        activityId: ActivityId,
        decisionTaskCompletedEventId: EventId
    ): ActivityTaskCancelRequestedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "activityId" -> activityId.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ActivityTaskCancelRequestedEventAttributes]
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
    @inline
    def apply(
        scheduledEventId: EventId,
        startedEventId: EventId,
        details: js.UndefOr[Data] = js.undefined,
        latestCancelRequestedEventId: js.UndefOr[EventId] = js.undefined
    ): ActivityTaskCanceledEventAttributes = {
      val __obj = js.Dynamic.literal(
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any]
      )

      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      latestCancelRequestedEventId.foreach(__v => __obj.updateDynamic("latestCancelRequestedEventId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivityTaskCanceledEventAttributes]
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
    @inline
    def apply(
        scheduledEventId: EventId,
        startedEventId: EventId,
        result: js.UndefOr[Data] = js.undefined
    ): ActivityTaskCompletedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any]
      )

      result.foreach(__v => __obj.updateDynamic("result")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivityTaskCompletedEventAttributes]
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
    @inline
    def apply(
        scheduledEventId: EventId,
        startedEventId: EventId,
        details: js.UndefOr[Data] = js.undefined,
        reason: js.UndefOr[FailureReason] = js.undefined
    ): ActivityTaskFailedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any]
      )

      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivityTaskFailedEventAttributes]
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
    @inline
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
        taskPriority: js.UndefOr[TaskPriority] = js.undefined
    ): ActivityTaskScheduledEventAttributes = {
      val __obj = js.Dynamic.literal(
        "activityId" -> activityId.asInstanceOf[js.Any],
        "activityType" -> activityType.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "taskList" -> taskList.asInstanceOf[js.Any]
      )

      control.foreach(__v => __obj.updateDynamic("control")(__v.asInstanceOf[js.Any]))
      heartbeatTimeout.foreach(__v => __obj.updateDynamic("heartbeatTimeout")(__v.asInstanceOf[js.Any]))
      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      scheduleToCloseTimeout.foreach(__v => __obj.updateDynamic("scheduleToCloseTimeout")(__v.asInstanceOf[js.Any]))
      scheduleToStartTimeout.foreach(__v => __obj.updateDynamic("scheduleToStartTimeout")(__v.asInstanceOf[js.Any]))
      startToCloseTimeout.foreach(__v => __obj.updateDynamic("startToCloseTimeout")(__v.asInstanceOf[js.Any]))
      taskPriority.foreach(__v => __obj.updateDynamic("taskPriority")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivityTaskScheduledEventAttributes]
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
    @inline
    def apply(
        scheduledEventId: EventId,
        identity: js.UndefOr[Identity] = js.undefined
    ): ActivityTaskStartedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any]
      )

      identity.foreach(__v => __obj.updateDynamic("identity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivityTaskStartedEventAttributes]
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
    @inline
    def apply(
        cancelRequested: Canceled
    ): ActivityTaskStatus = {
      val __obj = js.Dynamic.literal(
        "cancelRequested" -> cancelRequested.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ActivityTaskStatus]
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
    @inline
    def apply(
        scheduledEventId: EventId,
        startedEventId: EventId,
        timeoutType: ActivityTaskTimeoutType,
        details: js.UndefOr[LimitedData] = js.undefined
    ): ActivityTaskTimedOutEventAttributes = {
      val __obj = js.Dynamic.literal(
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "timeoutType" -> timeoutType.asInstanceOf[js.Any]
      )

      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivityTaskTimedOutEventAttributes]
    }
  }

  @js.native
  sealed trait ActivityTaskTimeoutType extends js.Any
  object ActivityTaskTimeoutType {
    val START_TO_CLOSE = "START_TO_CLOSE".asInstanceOf[ActivityTaskTimeoutType]
    val SCHEDULE_TO_START = "SCHEDULE_TO_START".asInstanceOf[ActivityTaskTimeoutType]
    val SCHEDULE_TO_CLOSE = "SCHEDULE_TO_CLOSE".asInstanceOf[ActivityTaskTimeoutType]
    val HEARTBEAT = "HEARTBEAT".asInstanceOf[ActivityTaskTimeoutType]

    @inline def values = js.Array(START_TO_CLOSE, SCHEDULE_TO_START, SCHEDULE_TO_CLOSE, HEARTBEAT)
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
    @inline
    def apply(
        name: Name,
        version: Version
    ): ActivityType = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ActivityType]
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
    @inline
    def apply(
        defaultTaskHeartbeatTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
        defaultTaskList: js.UndefOr[TaskList] = js.undefined,
        defaultTaskPriority: js.UndefOr[TaskPriority] = js.undefined,
        defaultTaskScheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
        defaultTaskScheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
        defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    ): ActivityTypeConfiguration = {
      val __obj = js.Dynamic.literal()
      defaultTaskHeartbeatTimeout.foreach(__v => __obj.updateDynamic("defaultTaskHeartbeatTimeout")(__v.asInstanceOf[js.Any]))
      defaultTaskList.foreach(__v => __obj.updateDynamic("defaultTaskList")(__v.asInstanceOf[js.Any]))
      defaultTaskPriority.foreach(__v => __obj.updateDynamic("defaultTaskPriority")(__v.asInstanceOf[js.Any]))
      defaultTaskScheduleToCloseTimeout.foreach(__v => __obj.updateDynamic("defaultTaskScheduleToCloseTimeout")(__v.asInstanceOf[js.Any]))
      defaultTaskScheduleToStartTimeout.foreach(__v => __obj.updateDynamic("defaultTaskScheduleToStartTimeout")(__v.asInstanceOf[js.Any]))
      defaultTaskStartToCloseTimeout.foreach(__v => __obj.updateDynamic("defaultTaskStartToCloseTimeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivityTypeConfiguration]
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
    @inline
    def apply(
        configuration: ActivityTypeConfiguration,
        typeInfo: ActivityTypeInfo
    ): ActivityTypeDetail = {
      val __obj = js.Dynamic.literal(
        "configuration" -> configuration.asInstanceOf[js.Any],
        "typeInfo" -> typeInfo.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ActivityTypeDetail]
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
    @inline
    def apply(
        activityType: ActivityType,
        creationDate: Timestamp,
        status: RegistrationStatus,
        deprecationDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined
    ): ActivityTypeInfo = {
      val __obj = js.Dynamic.literal(
        "activityType" -> activityType.asInstanceOf[js.Any],
        "creationDate" -> creationDate.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      deprecationDate.foreach(__v => __obj.updateDynamic("deprecationDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivityTypeInfo]
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
    @inline
    def apply(
        typeInfos: ActivityTypeInfoList,
        nextPageToken: js.UndefOr[PageToken] = js.undefined
    ): ActivityTypeInfos = {
      val __obj = js.Dynamic.literal(
        "typeInfos" -> typeInfos.asInstanceOf[js.Any]
      )

      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivityTypeInfos]
    }
  }

  /**
    * Provides the details of the <code>CancelTimer</code> decision.
    *  ```Access Control```
    *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
    * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
    *  * Use an <code>Action</code> element to allow or deny permission to call this action.
    *  * You cannot use an IAM policy to constrain this action's parameters.
    * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see [[https://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html|Using IAM to Manage Access to Amazon SWF Workflows]] in the <i>Amazon SWF Developer Guide</i>.
    */
  @js.native
  trait CancelTimerDecisionAttributes extends js.Object {
    var timerId: TimerId
  }

  object CancelTimerDecisionAttributes {
    @inline
    def apply(
        timerId: TimerId
    ): CancelTimerDecisionAttributes = {
      val __obj = js.Dynamic.literal(
        "timerId" -> timerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelTimerDecisionAttributes]
    }
  }

  @js.native
  sealed trait CancelTimerFailedCause extends js.Any
  object CancelTimerFailedCause {
    val TIMER_ID_UNKNOWN = "TIMER_ID_UNKNOWN".asInstanceOf[CancelTimerFailedCause]
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[CancelTimerFailedCause]

    @inline def values = js.Array(TIMER_ID_UNKNOWN, OPERATION_NOT_PERMITTED)
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
    @inline
    def apply(
        cause: CancelTimerFailedCause,
        decisionTaskCompletedEventId: EventId,
        timerId: TimerId
    ): CancelTimerFailedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "timerId" -> timerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelTimerFailedEventAttributes]
    }
  }

  /**
    * Provides the details of the <code>CancelWorkflowExecution</code> decision.
    *  ```Access Control```
    *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
    * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
    *  * Use an <code>Action</code> element to allow or deny permission to call this action.
    *  * You cannot use an IAM policy to constrain this action's parameters.
    * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see [[https://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html|Using IAM to Manage Access to Amazon SWF Workflows]] in the <i>Amazon SWF Developer Guide</i>.
    */
  @js.native
  trait CancelWorkflowExecutionDecisionAttributes extends js.Object {
    var details: js.UndefOr[Data]
  }

  object CancelWorkflowExecutionDecisionAttributes {
    @inline
    def apply(
        details: js.UndefOr[Data] = js.undefined
    ): CancelWorkflowExecutionDecisionAttributes = {
      val __obj = js.Dynamic.literal()
      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelWorkflowExecutionDecisionAttributes]
    }
  }

  @js.native
  sealed trait CancelWorkflowExecutionFailedCause extends js.Any
  object CancelWorkflowExecutionFailedCause {
    val UNHANDLED_DECISION = "UNHANDLED_DECISION".asInstanceOf[CancelWorkflowExecutionFailedCause]
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[CancelWorkflowExecutionFailedCause]

    @inline def values = js.Array(UNHANDLED_DECISION, OPERATION_NOT_PERMITTED)
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
    @inline
    def apply(
        cause: CancelWorkflowExecutionFailedCause,
        decisionTaskCompletedEventId: EventId
    ): CancelWorkflowExecutionFailedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelWorkflowExecutionFailedEventAttributes]
    }
  }

  @js.native
  sealed trait ChildPolicy extends js.Any
  object ChildPolicy {
    val TERMINATE = "TERMINATE".asInstanceOf[ChildPolicy]
    val REQUEST_CANCEL = "REQUEST_CANCEL".asInstanceOf[ChildPolicy]
    val ABANDON = "ABANDON".asInstanceOf[ChildPolicy]

    @inline def values = js.Array(TERMINATE, REQUEST_CANCEL, ABANDON)
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
    @inline
    def apply(
        initiatedEventId: EventId,
        startedEventId: EventId,
        workflowExecution: WorkflowExecution,
        workflowType: WorkflowType,
        details: js.UndefOr[Data] = js.undefined
    ): ChildWorkflowExecutionCanceledEventAttributes = {
      val __obj = js.Dynamic.literal(
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "workflowExecution" -> workflowExecution.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]
      )

      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChildWorkflowExecutionCanceledEventAttributes]
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
    @inline
    def apply(
        initiatedEventId: EventId,
        startedEventId: EventId,
        workflowExecution: WorkflowExecution,
        workflowType: WorkflowType,
        result: js.UndefOr[Data] = js.undefined
    ): ChildWorkflowExecutionCompletedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "workflowExecution" -> workflowExecution.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]
      )

      result.foreach(__v => __obj.updateDynamic("result")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChildWorkflowExecutionCompletedEventAttributes]
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
    @inline
    def apply(
        initiatedEventId: EventId,
        startedEventId: EventId,
        workflowExecution: WorkflowExecution,
        workflowType: WorkflowType,
        details: js.UndefOr[Data] = js.undefined,
        reason: js.UndefOr[FailureReason] = js.undefined
    ): ChildWorkflowExecutionFailedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "workflowExecution" -> workflowExecution.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]
      )

      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChildWorkflowExecutionFailedEventAttributes]
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
    @inline
    def apply(
        initiatedEventId: EventId,
        workflowExecution: WorkflowExecution,
        workflowType: WorkflowType
    ): ChildWorkflowExecutionStartedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "workflowExecution" -> workflowExecution.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ChildWorkflowExecutionStartedEventAttributes]
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
    @inline
    def apply(
        initiatedEventId: EventId,
        startedEventId: EventId,
        workflowExecution: WorkflowExecution,
        workflowType: WorkflowType
    ): ChildWorkflowExecutionTerminatedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "workflowExecution" -> workflowExecution.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ChildWorkflowExecutionTerminatedEventAttributes]
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
    @inline
    def apply(
        initiatedEventId: EventId,
        startedEventId: EventId,
        timeoutType: WorkflowExecutionTimeoutType,
        workflowExecution: WorkflowExecution,
        workflowType: WorkflowType
    ): ChildWorkflowExecutionTimedOutEventAttributes = {
      val __obj = js.Dynamic.literal(
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "timeoutType" -> timeoutType.asInstanceOf[js.Any],
        "workflowExecution" -> workflowExecution.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ChildWorkflowExecutionTimedOutEventAttributes]
    }
  }

  @js.native
  sealed trait CloseStatus extends js.Any
  object CloseStatus {
    val COMPLETED = "COMPLETED".asInstanceOf[CloseStatus]
    val FAILED = "FAILED".asInstanceOf[CloseStatus]
    val CANCELED = "CANCELED".asInstanceOf[CloseStatus]
    val TERMINATED = "TERMINATED".asInstanceOf[CloseStatus]
    val CONTINUED_AS_NEW = "CONTINUED_AS_NEW".asInstanceOf[CloseStatus]
    val TIMED_OUT = "TIMED_OUT".asInstanceOf[CloseStatus]

    @inline def values = js.Array(COMPLETED, FAILED, CANCELED, TERMINATED, CONTINUED_AS_NEW, TIMED_OUT)
  }

  /**
    * Used to filter the closed workflow executions in visibility APIs by their close status.
    */
  @js.native
  trait CloseStatusFilter extends js.Object {
    var status: CloseStatus
  }

  object CloseStatusFilter {
    @inline
    def apply(
        status: CloseStatus
    ): CloseStatusFilter = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CloseStatusFilter]
    }
  }

  /**
    * Provides the details of the <code>CompleteWorkflowExecution</code> decision.
    *  ```Access Control```
    *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
    * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
    *  * Use an <code>Action</code> element to allow or deny permission to call this action.
    *  * You cannot use an IAM policy to constrain this action's parameters.
    * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see [[https://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html|Using IAM to Manage Access to Amazon SWF Workflows]] in the <i>Amazon SWF Developer Guide</i>.
    */
  @js.native
  trait CompleteWorkflowExecutionDecisionAttributes extends js.Object {
    var result: js.UndefOr[Data]
  }

  object CompleteWorkflowExecutionDecisionAttributes {
    @inline
    def apply(
        result: js.UndefOr[Data] = js.undefined
    ): CompleteWorkflowExecutionDecisionAttributes = {
      val __obj = js.Dynamic.literal()
      result.foreach(__v => __obj.updateDynamic("result")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompleteWorkflowExecutionDecisionAttributes]
    }
  }

  @js.native
  sealed trait CompleteWorkflowExecutionFailedCause extends js.Any
  object CompleteWorkflowExecutionFailedCause {
    val UNHANDLED_DECISION = "UNHANDLED_DECISION".asInstanceOf[CompleteWorkflowExecutionFailedCause]
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[CompleteWorkflowExecutionFailedCause]

    @inline def values = js.Array(UNHANDLED_DECISION, OPERATION_NOT_PERMITTED)
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
    @inline
    def apply(
        cause: CompleteWorkflowExecutionFailedCause,
        decisionTaskCompletedEventId: EventId
    ): CompleteWorkflowExecutionFailedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CompleteWorkflowExecutionFailedEventAttributes]
    }
  }

  /**
    * Provides the details of the <code>ContinueAsNewWorkflowExecution</code> decision.
    *  ```Access Control```
    *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
    * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
    *  * Use an <code>Action</code> element to allow or deny permission to call this action.
    *  * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
    * <li> <code>tag</code> – A tag used to identify the workflow execution
    *  * <code>taskList</code> – String constraint. The key is <code>swf:taskList.name</code>.
    *  * <code>workflowType.version</code> – String constraint. The key is <code>swf:workflowType.version</code>.
    * </li>If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see [[https://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html|Using IAM to Manage Access to Amazon SWF Workflows]] in the <i>Amazon SWF Developer Guide</i>.
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
    @inline
    def apply(
        childPolicy: js.UndefOr[ChildPolicy] = js.undefined,
        executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
        input: js.UndefOr[Data] = js.undefined,
        lambdaRole: js.UndefOr[Arn] = js.undefined,
        tagList: js.UndefOr[TagList] = js.undefined,
        taskList: js.UndefOr[TaskList] = js.undefined,
        taskPriority: js.UndefOr[TaskPriority] = js.undefined,
        taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
        workflowTypeVersion: js.UndefOr[Version] = js.undefined
    ): ContinueAsNewWorkflowExecutionDecisionAttributes = {
      val __obj = js.Dynamic.literal()
      childPolicy.foreach(__v => __obj.updateDynamic("childPolicy")(__v.asInstanceOf[js.Any]))
      executionStartToCloseTimeout.foreach(__v => __obj.updateDynamic("executionStartToCloseTimeout")(__v.asInstanceOf[js.Any]))
      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      lambdaRole.foreach(__v => __obj.updateDynamic("lambdaRole")(__v.asInstanceOf[js.Any]))
      tagList.foreach(__v => __obj.updateDynamic("tagList")(__v.asInstanceOf[js.Any]))
      taskList.foreach(__v => __obj.updateDynamic("taskList")(__v.asInstanceOf[js.Any]))
      taskPriority.foreach(__v => __obj.updateDynamic("taskPriority")(__v.asInstanceOf[js.Any]))
      taskStartToCloseTimeout.foreach(__v => __obj.updateDynamic("taskStartToCloseTimeout")(__v.asInstanceOf[js.Any]))
      workflowTypeVersion.foreach(__v => __obj.updateDynamic("workflowTypeVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContinueAsNewWorkflowExecutionDecisionAttributes]
    }
  }

  @js.native
  sealed trait ContinueAsNewWorkflowExecutionFailedCause extends js.Any
  object ContinueAsNewWorkflowExecutionFailedCause {
    val UNHANDLED_DECISION = "UNHANDLED_DECISION".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
    val WORKFLOW_TYPE_DEPRECATED = "WORKFLOW_TYPE_DEPRECATED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
    val WORKFLOW_TYPE_DOES_NOT_EXIST = "WORKFLOW_TYPE_DOES_NOT_EXIST".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
    val DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED = "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
    val DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED = "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
    val DEFAULT_TASK_LIST_UNDEFINED = "DEFAULT_TASK_LIST_UNDEFINED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
    val DEFAULT_CHILD_POLICY_UNDEFINED = "DEFAULT_CHILD_POLICY_UNDEFINED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
    val CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED = "CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]

    @inline def values =
      js.Array(
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

  /**
    * Provides the details of the <code>ContinueAsNewWorkflowExecutionFailed</code> event.
    */
  @js.native
  trait ContinueAsNewWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: ContinueAsNewWorkflowExecutionFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  object ContinueAsNewWorkflowExecutionFailedEventAttributes {
    @inline
    def apply(
        cause: ContinueAsNewWorkflowExecutionFailedCause,
        decisionTaskCompletedEventId: EventId
    ): ContinueAsNewWorkflowExecutionFailedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ContinueAsNewWorkflowExecutionFailedEventAttributes]
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
    @inline
    def apply(
        domain: DomainName,
        closeStatusFilter: js.UndefOr[CloseStatusFilter] = js.undefined,
        closeTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined,
        executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined,
        startTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined,
        tagFilter: js.UndefOr[TagFilter] = js.undefined,
        typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined
    ): CountClosedWorkflowExecutionsInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any]
      )

      closeStatusFilter.foreach(__v => __obj.updateDynamic("closeStatusFilter")(__v.asInstanceOf[js.Any]))
      closeTimeFilter.foreach(__v => __obj.updateDynamic("closeTimeFilter")(__v.asInstanceOf[js.Any]))
      executionFilter.foreach(__v => __obj.updateDynamic("executionFilter")(__v.asInstanceOf[js.Any]))
      startTimeFilter.foreach(__v => __obj.updateDynamic("startTimeFilter")(__v.asInstanceOf[js.Any]))
      tagFilter.foreach(__v => __obj.updateDynamic("tagFilter")(__v.asInstanceOf[js.Any]))
      typeFilter.foreach(__v => __obj.updateDynamic("typeFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CountClosedWorkflowExecutionsInput]
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
    @inline
    def apply(
        domain: DomainName,
        startTimeFilter: ExecutionTimeFilter,
        executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined,
        tagFilter: js.UndefOr[TagFilter] = js.undefined,
        typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined
    ): CountOpenWorkflowExecutionsInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "startTimeFilter" -> startTimeFilter.asInstanceOf[js.Any]
      )

      executionFilter.foreach(__v => __obj.updateDynamic("executionFilter")(__v.asInstanceOf[js.Any]))
      tagFilter.foreach(__v => __obj.updateDynamic("tagFilter")(__v.asInstanceOf[js.Any]))
      typeFilter.foreach(__v => __obj.updateDynamic("typeFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CountOpenWorkflowExecutionsInput]
    }
  }

  @js.native
  trait CountPendingActivityTasksInput extends js.Object {
    var domain: DomainName
    var taskList: TaskList
  }

  object CountPendingActivityTasksInput {
    @inline
    def apply(
        domain: DomainName,
        taskList: TaskList
    ): CountPendingActivityTasksInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "taskList" -> taskList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CountPendingActivityTasksInput]
    }
  }

  @js.native
  trait CountPendingDecisionTasksInput extends js.Object {
    var domain: DomainName
    var taskList: TaskList
  }

  object CountPendingDecisionTasksInput {
    @inline
    def apply(
        domain: DomainName,
        taskList: TaskList
    ): CountPendingDecisionTasksInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "taskList" -> taskList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CountPendingDecisionTasksInput]
    }
  }

  /**
    * Specifies a decision made by the decider. A decision can be one of these types:
    * * <code>CancelTimer</code> – Cancels a previously started timer and records a <code>TimerCanceled</code> event in the history.
    *  * <code>CancelWorkflowExecution</code> – Closes the workflow execution and records a <code>WorkflowExecutionCanceled</code> event in the history.
    *  * <code>CompleteWorkflowExecution</code> – Closes the workflow execution and records a <code>WorkflowExecutionCompleted</code> event in the history .
    *  * <code>ContinueAsNewWorkflowExecution</code> – Closes the workflow execution and starts a new workflow execution of the same type using the same workflow ID and a unique run Id. A <code>WorkflowExecutionContinuedAsNew</code> event is recorded in the history.
    *  * <code>FailWorkflowExecution</code> – Closes the workflow execution and records a <code>WorkflowExecutionFailed</code> event in the history.
    *  * <code>RecordMarker</code> – Records a <code>MarkerRecorded</code> event in the history. Markers can be used for adding custom information in the history for instance to let deciders know that they don't need to look at the history beyond the marker event.
    *  * <code>RequestCancelActivityTask</code> – Attempts to cancel a previously scheduled activity task. If the activity task was scheduled but has not been assigned to a worker, then it is canceled. If the activity task was already assigned to a worker, then the worker is informed that cancellation has been requested in the response to <a>RecordActivityTaskHeartbeat</a>.
    *  * <code>RequestCancelExternalWorkflowExecution</code> – Requests that a request be made to cancel the specified external workflow execution and records a <code>RequestCancelExternalWorkflowExecutionInitiated</code> event in the history.
    *  * <code>ScheduleActivityTask</code> – Schedules an activity task.
    *  * <code>SignalExternalWorkflowExecution</code> – Requests a signal to be delivered to the specified external workflow execution and records a <code>SignalExternalWorkflowExecutionInitiated</code> event in the history.
    *  * <code>StartChildWorkflowExecution</code> – Requests that a child workflow execution be started and records a <code>StartChildWorkflowExecutionInitiated</code> event in the history. The child workflow execution is a separate workflow execution with its own history.
    *  * <code>StartTimer</code> – Starts a timer for this workflow execution and records a <code>TimerStarted</code> event in the history. This timer fires after the specified delay and record a <code>TimerFired</code> event.
    * ```Access Control```
    *  If you grant permission to use <code>RespondDecisionTaskCompleted</code>, you can use IAM policies to express permissions for the list of decisions returned by this action as if they were members of the API. Treating decisions as a pseudo API maintains a uniform conceptual model and helps keep policies readable. For details and example IAM policies, see [[https://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html|Using IAM to Manage Access to Amazon SWF Workflows]] in the <i>Amazon SWF Developer Guide</i>.
    *  ```Decision Failure```
    *  Decisions can fail for several reasons
    * * The ordering of decisions should follow a logical flow. Some decisions might not make sense in the current context of the workflow execution and therefore fails.
    *  * A limit on your account was reached.
    *  * The decision lacks sufficient permissions.
    * One of the following events might be added to the history to indicate an error. The event attribute's <code>cause</code> parameter indicates the cause. If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it lacked sufficient permissions. For details and example IAM policies, see [[https://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html|Using IAM to Manage Access to Amazon SWF Workflows]] in the <i>Amazon SWF Developer Guide</i>.
    * * <code>ScheduleActivityTaskFailed</code> – A <code>ScheduleActivityTask</code> decision failed. This could happen if the activity type specified in the decision isn't registered, is in a deprecated state, or the decision isn't properly configured.
    *  * <code>RequestCancelActivityTaskFailed</code> – A <code>RequestCancelActivityTask</code> decision failed. This could happen if there is no open activity task with the specified activityId.
    *  * <code>StartTimerFailed</code> – A <code>StartTimer</code> decision failed. This could happen if there is another open timer with the same timerId.
    *  * <code>CancelTimerFailed</code> – A <code>CancelTimer</code> decision failed. This could happen if there is no open timer with the specified timerId.
    *  * <code>StartChildWorkflowExecutionFailed</code> – A <code>StartChildWorkflowExecution</code> decision failed. This could happen if the workflow type specified isn't registered, is deprecated, or the decision isn't properly configured.
    *  * <code>SignalExternalWorkflowExecutionFailed</code> – A <code>SignalExternalWorkflowExecution</code> decision failed. This could happen if the <code>workflowID</code> specified in the decision was incorrect.
    *  * <code>RequestCancelExternalWorkflowExecutionFailed</code> – A <code>RequestCancelExternalWorkflowExecution</code> decision failed. This could happen if the <code>workflowID</code> specified in the decision was incorrect.
    *  * <code>CancelWorkflowExecutionFailed</code> – A <code>CancelWorkflowExecution</code> decision failed. This could happen if there is an unhandled decision task pending in the workflow execution.
    *  * <code>CompleteWorkflowExecutionFailed</code> – A <code>CompleteWorkflowExecution</code> decision failed. This could happen if there is an unhandled decision task pending in the workflow execution.
    *  * <code>ContinueAsNewWorkflowExecutionFailed</code> – A <code>ContinueAsNewWorkflowExecution</code> decision failed. This could happen if there is an unhandled decision task pending in the workflow execution or the ContinueAsNewWorkflowExecution decision was not configured correctly.
    *  * <code>FailWorkflowExecutionFailed</code> – A <code>FailWorkflowExecution</code> decision failed. This could happen if there is an unhandled decision task pending in the workflow execution.
    * The preceding error events might occur due to an error in the decider logic, which might put the workflow execution in an unstable state The cause field in the event structure for the error event indicates the cause of the error.
    *
    * '''Note:'''A workflow execution may be closed by the decider by returning one of the following decisions when completing a decision task: <code>CompleteWorkflowExecution</code>, <code>FailWorkflowExecution</code>, <code>CancelWorkflowExecution</code> and <code>ContinueAsNewWorkflowExecution</code>. An <code>UnhandledDecision</code> fault is returned if a workflow closing decision is specified and a signal or activity event had been added to the history while the decision task was being performed by the decider. Unlike the above situations which are logic issues, this fault is always possible because of race conditions in a distributed system. The right action here is to call <a>RespondDecisionTaskCompleted</a> without any decisions. This would result in another decision task with these new events included in the history. The decider should handle the new events and may decide to close the workflow execution.
    * ```How to Code a Decision```
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
    @inline
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
        startTimerDecisionAttributes: js.UndefOr[StartTimerDecisionAttributes] = js.undefined
    ): Decision = {
      val __obj = js.Dynamic.literal(
        "decisionType" -> decisionType.asInstanceOf[js.Any]
      )

      cancelTimerDecisionAttributes.foreach(__v => __obj.updateDynamic("cancelTimerDecisionAttributes")(__v.asInstanceOf[js.Any]))
      cancelWorkflowExecutionDecisionAttributes.foreach(__v => __obj.updateDynamic("cancelWorkflowExecutionDecisionAttributes")(__v.asInstanceOf[js.Any]))
      completeWorkflowExecutionDecisionAttributes.foreach(__v => __obj.updateDynamic("completeWorkflowExecutionDecisionAttributes")(__v.asInstanceOf[js.Any]))
      continueAsNewWorkflowExecutionDecisionAttributes.foreach(__v => __obj.updateDynamic("continueAsNewWorkflowExecutionDecisionAttributes")(__v.asInstanceOf[js.Any]))
      failWorkflowExecutionDecisionAttributes.foreach(__v => __obj.updateDynamic("failWorkflowExecutionDecisionAttributes")(__v.asInstanceOf[js.Any]))
      recordMarkerDecisionAttributes.foreach(__v => __obj.updateDynamic("recordMarkerDecisionAttributes")(__v.asInstanceOf[js.Any]))
      requestCancelActivityTaskDecisionAttributes.foreach(__v => __obj.updateDynamic("requestCancelActivityTaskDecisionAttributes")(__v.asInstanceOf[js.Any]))
      requestCancelExternalWorkflowExecutionDecisionAttributes.foreach(__v => __obj.updateDynamic("requestCancelExternalWorkflowExecutionDecisionAttributes")(__v.asInstanceOf[js.Any]))
      scheduleActivityTaskDecisionAttributes.foreach(__v => __obj.updateDynamic("scheduleActivityTaskDecisionAttributes")(__v.asInstanceOf[js.Any]))
      scheduleLambdaFunctionDecisionAttributes.foreach(__v => __obj.updateDynamic("scheduleLambdaFunctionDecisionAttributes")(__v.asInstanceOf[js.Any]))
      signalExternalWorkflowExecutionDecisionAttributes.foreach(__v => __obj.updateDynamic("signalExternalWorkflowExecutionDecisionAttributes")(__v.asInstanceOf[js.Any]))
      startChildWorkflowExecutionDecisionAttributes.foreach(__v => __obj.updateDynamic("startChildWorkflowExecutionDecisionAttributes")(__v.asInstanceOf[js.Any]))
      startTimerDecisionAttributes.foreach(__v => __obj.updateDynamic("startTimerDecisionAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Decision]
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
    @inline
    def apply(
        events: HistoryEventList,
        startedEventId: EventId,
        taskToken: TaskToken,
        workflowExecution: WorkflowExecution,
        workflowType: WorkflowType,
        nextPageToken: js.UndefOr[PageToken] = js.undefined,
        previousStartedEventId: js.UndefOr[EventId] = js.undefined
    ): DecisionTask = {
      val __obj = js.Dynamic.literal(
        "events" -> events.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "taskToken" -> taskToken.asInstanceOf[js.Any],
        "workflowExecution" -> workflowExecution.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]
      )

      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      previousStartedEventId.foreach(__v => __obj.updateDynamic("previousStartedEventId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DecisionTask]
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
    @inline
    def apply(
        scheduledEventId: EventId,
        startedEventId: EventId,
        executionContext: js.UndefOr[Data] = js.undefined
    ): DecisionTaskCompletedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any]
      )

      executionContext.foreach(__v => __obj.updateDynamic("executionContext")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DecisionTaskCompletedEventAttributes]
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
    @inline
    def apply(
        taskList: TaskList,
        startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
        taskPriority: js.UndefOr[TaskPriority] = js.undefined
    ): DecisionTaskScheduledEventAttributes = {
      val __obj = js.Dynamic.literal(
        "taskList" -> taskList.asInstanceOf[js.Any]
      )

      startToCloseTimeout.foreach(__v => __obj.updateDynamic("startToCloseTimeout")(__v.asInstanceOf[js.Any]))
      taskPriority.foreach(__v => __obj.updateDynamic("taskPriority")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DecisionTaskScheduledEventAttributes]
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
    @inline
    def apply(
        scheduledEventId: EventId,
        identity: js.UndefOr[Identity] = js.undefined
    ): DecisionTaskStartedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any]
      )

      identity.foreach(__v => __obj.updateDynamic("identity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DecisionTaskStartedEventAttributes]
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
    @inline
    def apply(
        scheduledEventId: EventId,
        startedEventId: EventId,
        timeoutType: DecisionTaskTimeoutType
    ): DecisionTaskTimedOutEventAttributes = {
      val __obj = js.Dynamic.literal(
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "timeoutType" -> timeoutType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DecisionTaskTimedOutEventAttributes]
    }
  }

  @js.native
  sealed trait DecisionTaskTimeoutType extends js.Any
  object DecisionTaskTimeoutType {
    val START_TO_CLOSE = "START_TO_CLOSE".asInstanceOf[DecisionTaskTimeoutType]

    @inline def values = js.Array(START_TO_CLOSE)
  }

  @js.native
  sealed trait DecisionType extends js.Any
  object DecisionType {
    val ScheduleActivityTask = "ScheduleActivityTask".asInstanceOf[DecisionType]
    val RequestCancelActivityTask = "RequestCancelActivityTask".asInstanceOf[DecisionType]
    val CompleteWorkflowExecution = "CompleteWorkflowExecution".asInstanceOf[DecisionType]
    val FailWorkflowExecution = "FailWorkflowExecution".asInstanceOf[DecisionType]
    val CancelWorkflowExecution = "CancelWorkflowExecution".asInstanceOf[DecisionType]
    val ContinueAsNewWorkflowExecution = "ContinueAsNewWorkflowExecution".asInstanceOf[DecisionType]
    val RecordMarker = "RecordMarker".asInstanceOf[DecisionType]
    val StartTimer = "StartTimer".asInstanceOf[DecisionType]
    val CancelTimer = "CancelTimer".asInstanceOf[DecisionType]
    val SignalExternalWorkflowExecution = "SignalExternalWorkflowExecution".asInstanceOf[DecisionType]
    val RequestCancelExternalWorkflowExecution = "RequestCancelExternalWorkflowExecution".asInstanceOf[DecisionType]
    val StartChildWorkflowExecution = "StartChildWorkflowExecution".asInstanceOf[DecisionType]
    val ScheduleLambdaFunction = "ScheduleLambdaFunction".asInstanceOf[DecisionType]

    @inline def values =
      js.Array(
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

  @js.native
  trait DeprecateActivityTypeInput extends js.Object {
    var activityType: ActivityType
    var domain: DomainName
  }

  object DeprecateActivityTypeInput {
    @inline
    def apply(
        activityType: ActivityType,
        domain: DomainName
    ): DeprecateActivityTypeInput = {
      val __obj = js.Dynamic.literal(
        "activityType" -> activityType.asInstanceOf[js.Any],
        "domain" -> domain.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeprecateActivityTypeInput]
    }
  }

  @js.native
  trait DeprecateDomainInput extends js.Object {
    var name: DomainName
  }

  object DeprecateDomainInput {
    @inline
    def apply(
        name: DomainName
    ): DeprecateDomainInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeprecateDomainInput]
    }
  }

  @js.native
  trait DeprecateWorkflowTypeInput extends js.Object {
    var domain: DomainName
    var workflowType: WorkflowType
  }

  object DeprecateWorkflowTypeInput {
    @inline
    def apply(
        domain: DomainName,
        workflowType: WorkflowType
    ): DeprecateWorkflowTypeInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeprecateWorkflowTypeInput]
    }
  }

  @js.native
  trait DescribeActivityTypeInput extends js.Object {
    var activityType: ActivityType
    var domain: DomainName
  }

  object DescribeActivityTypeInput {
    @inline
    def apply(
        activityType: ActivityType,
        domain: DomainName
    ): DescribeActivityTypeInput = {
      val __obj = js.Dynamic.literal(
        "activityType" -> activityType.asInstanceOf[js.Any],
        "domain" -> domain.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeActivityTypeInput]
    }
  }

  @js.native
  trait DescribeDomainInput extends js.Object {
    var name: DomainName
  }

  object DescribeDomainInput {
    @inline
    def apply(
        name: DomainName
    ): DescribeDomainInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeDomainInput]
    }
  }

  @js.native
  trait DescribeWorkflowExecutionInput extends js.Object {
    var domain: DomainName
    var execution: WorkflowExecution
  }

  object DescribeWorkflowExecutionInput {
    @inline
    def apply(
        domain: DomainName,
        execution: WorkflowExecution
    ): DescribeWorkflowExecutionInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "execution" -> execution.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeWorkflowExecutionInput]
    }
  }

  @js.native
  trait DescribeWorkflowTypeInput extends js.Object {
    var domain: DomainName
    var workflowType: WorkflowType
  }

  object DescribeWorkflowTypeInput {
    @inline
    def apply(
        domain: DomainName,
        workflowType: WorkflowType
    ): DescribeWorkflowTypeInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeWorkflowTypeInput]
    }
  }

  /**
    * Contains the configuration settings of a domain.
    */
  @js.native
  trait DomainConfiguration extends js.Object {
    var workflowExecutionRetentionPeriodInDays: DurationInDays
  }

  object DomainConfiguration {
    @inline
    def apply(
        workflowExecutionRetentionPeriodInDays: DurationInDays
    ): DomainConfiguration = {
      val __obj = js.Dynamic.literal(
        "workflowExecutionRetentionPeriodInDays" -> workflowExecutionRetentionPeriodInDays.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DomainConfiguration]
    }
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
    @inline
    def apply(
        configuration: DomainConfiguration,
        domainInfo: DomainInfo
    ): DomainDetail = {
      val __obj = js.Dynamic.literal(
        "configuration" -> configuration.asInstanceOf[js.Any],
        "domainInfo" -> domainInfo.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DomainDetail]
    }
  }

  /**
    * Contains general information about a domain.
    */
  @js.native
  trait DomainInfo extends js.Object {
    var name: DomainName
    var status: RegistrationStatus
    var arn: js.UndefOr[Arn]
    var description: js.UndefOr[Description]
  }

  object DomainInfo {
    @inline
    def apply(
        name: DomainName,
        status: RegistrationStatus,
        arn: js.UndefOr[Arn] = js.undefined,
        description: js.UndefOr[Description] = js.undefined
    ): DomainInfo = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainInfo]
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
    @inline
    def apply(
        domainInfos: DomainInfoList,
        nextPageToken: js.UndefOr[PageToken] = js.undefined
    ): DomainInfos = {
      val __obj = js.Dynamic.literal(
        "domainInfos" -> domainInfos.asInstanceOf[js.Any]
      )

      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainInfos]
    }
  }

  @js.native
  sealed trait EventType extends js.Any
  object EventType {
    val WorkflowExecutionStarted = "WorkflowExecutionStarted".asInstanceOf[EventType]
    val WorkflowExecutionCancelRequested = "WorkflowExecutionCancelRequested".asInstanceOf[EventType]
    val WorkflowExecutionCompleted = "WorkflowExecutionCompleted".asInstanceOf[EventType]
    val CompleteWorkflowExecutionFailed = "CompleteWorkflowExecutionFailed".asInstanceOf[EventType]
    val WorkflowExecutionFailed = "WorkflowExecutionFailed".asInstanceOf[EventType]
    val FailWorkflowExecutionFailed = "FailWorkflowExecutionFailed".asInstanceOf[EventType]
    val WorkflowExecutionTimedOut = "WorkflowExecutionTimedOut".asInstanceOf[EventType]
    val WorkflowExecutionCanceled = "WorkflowExecutionCanceled".asInstanceOf[EventType]
    val CancelWorkflowExecutionFailed = "CancelWorkflowExecutionFailed".asInstanceOf[EventType]
    val WorkflowExecutionContinuedAsNew = "WorkflowExecutionContinuedAsNew".asInstanceOf[EventType]
    val ContinueAsNewWorkflowExecutionFailed = "ContinueAsNewWorkflowExecutionFailed".asInstanceOf[EventType]
    val WorkflowExecutionTerminated = "WorkflowExecutionTerminated".asInstanceOf[EventType]
    val DecisionTaskScheduled = "DecisionTaskScheduled".asInstanceOf[EventType]
    val DecisionTaskStarted = "DecisionTaskStarted".asInstanceOf[EventType]
    val DecisionTaskCompleted = "DecisionTaskCompleted".asInstanceOf[EventType]
    val DecisionTaskTimedOut = "DecisionTaskTimedOut".asInstanceOf[EventType]
    val ActivityTaskScheduled = "ActivityTaskScheduled".asInstanceOf[EventType]
    val ScheduleActivityTaskFailed = "ScheduleActivityTaskFailed".asInstanceOf[EventType]
    val ActivityTaskStarted = "ActivityTaskStarted".asInstanceOf[EventType]
    val ActivityTaskCompleted = "ActivityTaskCompleted".asInstanceOf[EventType]
    val ActivityTaskFailed = "ActivityTaskFailed".asInstanceOf[EventType]
    val ActivityTaskTimedOut = "ActivityTaskTimedOut".asInstanceOf[EventType]
    val ActivityTaskCanceled = "ActivityTaskCanceled".asInstanceOf[EventType]
    val ActivityTaskCancelRequested = "ActivityTaskCancelRequested".asInstanceOf[EventType]
    val RequestCancelActivityTaskFailed = "RequestCancelActivityTaskFailed".asInstanceOf[EventType]
    val WorkflowExecutionSignaled = "WorkflowExecutionSignaled".asInstanceOf[EventType]
    val MarkerRecorded = "MarkerRecorded".asInstanceOf[EventType]
    val RecordMarkerFailed = "RecordMarkerFailed".asInstanceOf[EventType]
    val TimerStarted = "TimerStarted".asInstanceOf[EventType]
    val StartTimerFailed = "StartTimerFailed".asInstanceOf[EventType]
    val TimerFired = "TimerFired".asInstanceOf[EventType]
    val TimerCanceled = "TimerCanceled".asInstanceOf[EventType]
    val CancelTimerFailed = "CancelTimerFailed".asInstanceOf[EventType]
    val StartChildWorkflowExecutionInitiated = "StartChildWorkflowExecutionInitiated".asInstanceOf[EventType]
    val StartChildWorkflowExecutionFailed = "StartChildWorkflowExecutionFailed".asInstanceOf[EventType]
    val ChildWorkflowExecutionStarted = "ChildWorkflowExecutionStarted".asInstanceOf[EventType]
    val ChildWorkflowExecutionCompleted = "ChildWorkflowExecutionCompleted".asInstanceOf[EventType]
    val ChildWorkflowExecutionFailed = "ChildWorkflowExecutionFailed".asInstanceOf[EventType]
    val ChildWorkflowExecutionTimedOut = "ChildWorkflowExecutionTimedOut".asInstanceOf[EventType]
    val ChildWorkflowExecutionCanceled = "ChildWorkflowExecutionCanceled".asInstanceOf[EventType]
    val ChildWorkflowExecutionTerminated = "ChildWorkflowExecutionTerminated".asInstanceOf[EventType]
    val SignalExternalWorkflowExecutionInitiated = "SignalExternalWorkflowExecutionInitiated".asInstanceOf[EventType]
    val SignalExternalWorkflowExecutionFailed = "SignalExternalWorkflowExecutionFailed".asInstanceOf[EventType]
    val ExternalWorkflowExecutionSignaled = "ExternalWorkflowExecutionSignaled".asInstanceOf[EventType]
    val RequestCancelExternalWorkflowExecutionInitiated = "RequestCancelExternalWorkflowExecutionInitiated".asInstanceOf[EventType]
    val RequestCancelExternalWorkflowExecutionFailed = "RequestCancelExternalWorkflowExecutionFailed".asInstanceOf[EventType]
    val ExternalWorkflowExecutionCancelRequested = "ExternalWorkflowExecutionCancelRequested".asInstanceOf[EventType]
    val LambdaFunctionScheduled = "LambdaFunctionScheduled".asInstanceOf[EventType]
    val LambdaFunctionStarted = "LambdaFunctionStarted".asInstanceOf[EventType]
    val LambdaFunctionCompleted = "LambdaFunctionCompleted".asInstanceOf[EventType]
    val LambdaFunctionFailed = "LambdaFunctionFailed".asInstanceOf[EventType]
    val LambdaFunctionTimedOut = "LambdaFunctionTimedOut".asInstanceOf[EventType]
    val ScheduleLambdaFunctionFailed = "ScheduleLambdaFunctionFailed".asInstanceOf[EventType]
    val StartLambdaFunctionFailed = "StartLambdaFunctionFailed".asInstanceOf[EventType]

    @inline def values =
      js.Array(
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

  @js.native
  sealed trait ExecutionStatus extends js.Any
  object ExecutionStatus {
    val OPEN = "OPEN".asInstanceOf[ExecutionStatus]
    val CLOSED = "CLOSED".asInstanceOf[ExecutionStatus]

    @inline def values = js.Array(OPEN, CLOSED)
  }

  /**
    * Used to filter the workflow executions in visibility APIs by various time-based rules. Each parameter, if specified, defines a rule that must be satisfied by each returned query result. The parameter values are in the [[https://en.wikipedia.org/wiki/Unix_time|Unix Time format]]. For example: <code>"oldestDate": 1325376070.</code>
    */
  @js.native
  trait ExecutionTimeFilter extends js.Object {
    var oldestDate: Timestamp
    var latestDate: js.UndefOr[Timestamp]
  }

  object ExecutionTimeFilter {
    @inline
    def apply(
        oldestDate: Timestamp,
        latestDate: js.UndefOr[Timestamp] = js.undefined
    ): ExecutionTimeFilter = {
      val __obj = js.Dynamic.literal(
        "oldestDate" -> oldestDate.asInstanceOf[js.Any]
      )

      latestDate.foreach(__v => __obj.updateDynamic("latestDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionTimeFilter]
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
    @inline
    def apply(
        initiatedEventId: EventId,
        workflowExecution: WorkflowExecution
    ): ExternalWorkflowExecutionCancelRequestedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "workflowExecution" -> workflowExecution.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ExternalWorkflowExecutionCancelRequestedEventAttributes]
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
    @inline
    def apply(
        initiatedEventId: EventId,
        workflowExecution: WorkflowExecution
    ): ExternalWorkflowExecutionSignaledEventAttributes = {
      val __obj = js.Dynamic.literal(
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "workflowExecution" -> workflowExecution.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ExternalWorkflowExecutionSignaledEventAttributes]
    }
  }

  /**
    * Provides the details of the <code>FailWorkflowExecution</code> decision.
    *  ```Access Control```
    *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
    * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
    *  * Use an <code>Action</code> element to allow or deny permission to call this action.
    *  * You cannot use an IAM policy to constrain this action's parameters.
    * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see [[https://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html|Using IAM to Manage Access to Amazon SWF Workflows]] in the <i>Amazon SWF Developer Guide</i>.
    */
  @js.native
  trait FailWorkflowExecutionDecisionAttributes extends js.Object {
    var details: js.UndefOr[Data]
    var reason: js.UndefOr[FailureReason]
  }

  object FailWorkflowExecutionDecisionAttributes {
    @inline
    def apply(
        details: js.UndefOr[Data] = js.undefined,
        reason: js.UndefOr[FailureReason] = js.undefined
    ): FailWorkflowExecutionDecisionAttributes = {
      val __obj = js.Dynamic.literal()
      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailWorkflowExecutionDecisionAttributes]
    }
  }

  @js.native
  sealed trait FailWorkflowExecutionFailedCause extends js.Any
  object FailWorkflowExecutionFailedCause {
    val UNHANDLED_DECISION = "UNHANDLED_DECISION".asInstanceOf[FailWorkflowExecutionFailedCause]
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[FailWorkflowExecutionFailedCause]

    @inline def values = js.Array(UNHANDLED_DECISION, OPERATION_NOT_PERMITTED)
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
    @inline
    def apply(
        cause: FailWorkflowExecutionFailedCause,
        decisionTaskCompletedEventId: EventId
    ): FailWorkflowExecutionFailedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FailWorkflowExecutionFailedEventAttributes]
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
    @inline
    def apply(
        domain: DomainName,
        execution: WorkflowExecution,
        maximumPageSize: js.UndefOr[PageSize] = js.undefined,
        nextPageToken: js.UndefOr[PageToken] = js.undefined,
        reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
    ): GetWorkflowExecutionHistoryInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "execution" -> execution.asInstanceOf[js.Any]
      )

      maximumPageSize.foreach(__v => __obj.updateDynamic("maximumPageSize")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      reverseOrder.foreach(__v => __obj.updateDynamic("reverseOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkflowExecutionHistoryInput]
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
    @inline
    def apply(
        events: HistoryEventList,
        nextPageToken: js.UndefOr[PageToken] = js.undefined
    ): History = {
      val __obj = js.Dynamic.literal(
        "events" -> events.asInstanceOf[js.Any]
      )

      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[History]
    }
  }

  /**
    * Event within a workflow execution. A history event can be one of these types:
    * * <code>ActivityTaskCancelRequested</code> – A <code>RequestCancelActivityTask</code> decision was received by the system.
    *  * <code>ActivityTaskCanceled</code> – The activity task was successfully canceled.
    *  * <code>ActivityTaskCompleted</code> – An activity worker successfully completed an activity task by calling <a>RespondActivityTaskCompleted</a>.
    *  * <code>ActivityTaskFailed</code> – An activity worker failed an activity task by calling <a>RespondActivityTaskFailed</a>.
    *  * <code>ActivityTaskScheduled</code> – An activity task was scheduled for execution.
    *  * <code>ActivityTaskStarted</code> – The scheduled activity task was dispatched to a worker.
    *  * <code>ActivityTaskTimedOut</code> – The activity task timed out.
    *  * <code>CancelTimerFailed</code> – Failed to process CancelTimer decision. This happens when the decision isn't configured properly, for example no timer exists with the specified timer Id.
    *  * <code>CancelWorkflowExecutionFailed</code> – A request to cancel a workflow execution failed.
    *  * <code>ChildWorkflowExecutionCanceled</code> – A child workflow execution, started by this workflow execution, was canceled and closed.
    *  * <code>ChildWorkflowExecutionCompleted</code> – A child workflow execution, started by this workflow execution, completed successfully and was closed.
    *  * <code>ChildWorkflowExecutionFailed</code> – A child workflow execution, started by this workflow execution, failed to complete successfully and was closed.
    *  * <code>ChildWorkflowExecutionStarted</code> – A child workflow execution was successfully started.
    *  * <code>ChildWorkflowExecutionTerminated</code> – A child workflow execution, started by this workflow execution, was terminated.
    *  * <code>ChildWorkflowExecutionTimedOut</code> – A child workflow execution, started by this workflow execution, timed out and was closed.
    *  * <code>CompleteWorkflowExecutionFailed</code> – The workflow execution failed to complete.
    *  * <code>ContinueAsNewWorkflowExecutionFailed</code> – The workflow execution failed to complete after being continued as a new workflow execution.
    *  * <code>DecisionTaskCompleted</code> – The decider successfully completed a decision task by calling <a>RespondDecisionTaskCompleted</a>.
    *  * <code>DecisionTaskScheduled</code> – A decision task was scheduled for the workflow execution.
    *  * <code>DecisionTaskStarted</code> – The decision task was dispatched to a decider.
    *  * <code>DecisionTaskTimedOut</code> – The decision task timed out.
    *  * <code>ExternalWorkflowExecutionCancelRequested</code> – Request to cancel an external workflow execution was successfully delivered to the target execution.
    *  * <code>ExternalWorkflowExecutionSignaled</code> – A signal, requested by this workflow execution, was successfully delivered to the target external workflow execution.
    *  * <code>FailWorkflowExecutionFailed</code> – A request to mark a workflow execution as failed, itself failed.
    *  * <code>MarkerRecorded</code> – A marker was recorded in the workflow history as the result of a <code>RecordMarker</code> decision.
    *  * <code>RecordMarkerFailed</code> – A <code>RecordMarker</code> decision was returned as failed.
    *  * <code>RequestCancelActivityTaskFailed</code> – Failed to process RequestCancelActivityTask decision. This happens when the decision isn't configured properly.
    *  * <code>RequestCancelExternalWorkflowExecutionFailed</code> – Request to cancel an external workflow execution failed.
    *  * <code>RequestCancelExternalWorkflowExecutionInitiated</code> – A request was made to request the cancellation of an external workflow execution.
    *  * <code>ScheduleActivityTaskFailed</code> – Failed to process ScheduleActivityTask decision. This happens when the decision isn't configured properly, for example the activity type specified isn't registered.
    *  * <code>SignalExternalWorkflowExecutionFailed</code> – The request to signal an external workflow execution failed.
    *  * <code>SignalExternalWorkflowExecutionInitiated</code> – A request to signal an external workflow was made.
    *  * <code>StartActivityTaskFailed</code> – A scheduled activity task failed to start.
    *  * <code>StartChildWorkflowExecutionFailed</code> – Failed to process StartChildWorkflowExecution decision. This happens when the decision isn't configured properly, for example the workflow type specified isn't registered.
    *  * <code>StartChildWorkflowExecutionInitiated</code> – A request was made to start a child workflow execution.
    *  * <code>StartTimerFailed</code> – Failed to process StartTimer decision. This happens when the decision isn't configured properly, for example a timer already exists with the specified timer Id.
    *  * <code>TimerCanceled</code> – A timer, previously started for this workflow execution, was successfully canceled.
    *  * <code>TimerFired</code> – A timer, previously started for this workflow execution, fired.
    *  * <code>TimerStarted</code> – A timer was started for the workflow execution due to a <code>StartTimer</code> decision.
    *  * <code>WorkflowExecutionCancelRequested</code> – A request to cancel this workflow execution was made.
    *  * <code>WorkflowExecutionCanceled</code> – The workflow execution was successfully canceled and closed.
    *  * <code>WorkflowExecutionCompleted</code> – The workflow execution was closed due to successful completion.
    *  * <code>WorkflowExecutionContinuedAsNew</code> – The workflow execution was closed and a new execution of the same type was created with the same workflowId.
    *  * <code>WorkflowExecutionFailed</code> – The workflow execution closed due to a failure.
    *  * <code>WorkflowExecutionSignaled</code> – An external signal was received for the workflow execution.
    *  * <code>WorkflowExecutionStarted</code> – The workflow execution was started.
    *  * <code>WorkflowExecutionTerminated</code> – The workflow execution was terminated.
    *  * <code>WorkflowExecutionTimedOut</code> – The workflow execution was closed because a time out was exceeded.
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
    @inline
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
        workflowExecutionTimedOutEventAttributes: js.UndefOr[WorkflowExecutionTimedOutEventAttributes] = js.undefined
    ): HistoryEvent = {
      val __obj = js.Dynamic.literal(
        "eventId" -> eventId.asInstanceOf[js.Any],
        "eventTimestamp" -> eventTimestamp.asInstanceOf[js.Any],
        "eventType" -> eventType.asInstanceOf[js.Any]
      )

      activityTaskCancelRequestedEventAttributes.foreach(__v => __obj.updateDynamic("activityTaskCancelRequestedEventAttributes")(__v.asInstanceOf[js.Any]))
      activityTaskCanceledEventAttributes.foreach(__v => __obj.updateDynamic("activityTaskCanceledEventAttributes")(__v.asInstanceOf[js.Any]))
      activityTaskCompletedEventAttributes.foreach(__v => __obj.updateDynamic("activityTaskCompletedEventAttributes")(__v.asInstanceOf[js.Any]))
      activityTaskFailedEventAttributes.foreach(__v => __obj.updateDynamic("activityTaskFailedEventAttributes")(__v.asInstanceOf[js.Any]))
      activityTaskScheduledEventAttributes.foreach(__v => __obj.updateDynamic("activityTaskScheduledEventAttributes")(__v.asInstanceOf[js.Any]))
      activityTaskStartedEventAttributes.foreach(__v => __obj.updateDynamic("activityTaskStartedEventAttributes")(__v.asInstanceOf[js.Any]))
      activityTaskTimedOutEventAttributes.foreach(__v => __obj.updateDynamic("activityTaskTimedOutEventAttributes")(__v.asInstanceOf[js.Any]))
      cancelTimerFailedEventAttributes.foreach(__v => __obj.updateDynamic("cancelTimerFailedEventAttributes")(__v.asInstanceOf[js.Any]))
      cancelWorkflowExecutionFailedEventAttributes.foreach(__v => __obj.updateDynamic("cancelWorkflowExecutionFailedEventAttributes")(__v.asInstanceOf[js.Any]))
      childWorkflowExecutionCanceledEventAttributes.foreach(__v => __obj.updateDynamic("childWorkflowExecutionCanceledEventAttributes")(__v.asInstanceOf[js.Any]))
      childWorkflowExecutionCompletedEventAttributes.foreach(__v => __obj.updateDynamic("childWorkflowExecutionCompletedEventAttributes")(__v.asInstanceOf[js.Any]))
      childWorkflowExecutionFailedEventAttributes.foreach(__v => __obj.updateDynamic("childWorkflowExecutionFailedEventAttributes")(__v.asInstanceOf[js.Any]))
      childWorkflowExecutionStartedEventAttributes.foreach(__v => __obj.updateDynamic("childWorkflowExecutionStartedEventAttributes")(__v.asInstanceOf[js.Any]))
      childWorkflowExecutionTerminatedEventAttributes.foreach(__v => __obj.updateDynamic("childWorkflowExecutionTerminatedEventAttributes")(__v.asInstanceOf[js.Any]))
      childWorkflowExecutionTimedOutEventAttributes.foreach(__v => __obj.updateDynamic("childWorkflowExecutionTimedOutEventAttributes")(__v.asInstanceOf[js.Any]))
      completeWorkflowExecutionFailedEventAttributes.foreach(__v => __obj.updateDynamic("completeWorkflowExecutionFailedEventAttributes")(__v.asInstanceOf[js.Any]))
      continueAsNewWorkflowExecutionFailedEventAttributes.foreach(__v => __obj.updateDynamic("continueAsNewWorkflowExecutionFailedEventAttributes")(__v.asInstanceOf[js.Any]))
      decisionTaskCompletedEventAttributes.foreach(__v => __obj.updateDynamic("decisionTaskCompletedEventAttributes")(__v.asInstanceOf[js.Any]))
      decisionTaskScheduledEventAttributes.foreach(__v => __obj.updateDynamic("decisionTaskScheduledEventAttributes")(__v.asInstanceOf[js.Any]))
      decisionTaskStartedEventAttributes.foreach(__v => __obj.updateDynamic("decisionTaskStartedEventAttributes")(__v.asInstanceOf[js.Any]))
      decisionTaskTimedOutEventAttributes.foreach(__v => __obj.updateDynamic("decisionTaskTimedOutEventAttributes")(__v.asInstanceOf[js.Any]))
      externalWorkflowExecutionCancelRequestedEventAttributes.foreach(__v => __obj.updateDynamic("externalWorkflowExecutionCancelRequestedEventAttributes")(__v.asInstanceOf[js.Any]))
      externalWorkflowExecutionSignaledEventAttributes.foreach(__v => __obj.updateDynamic("externalWorkflowExecutionSignaledEventAttributes")(__v.asInstanceOf[js.Any]))
      failWorkflowExecutionFailedEventAttributes.foreach(__v => __obj.updateDynamic("failWorkflowExecutionFailedEventAttributes")(__v.asInstanceOf[js.Any]))
      lambdaFunctionCompletedEventAttributes.foreach(__v => __obj.updateDynamic("lambdaFunctionCompletedEventAttributes")(__v.asInstanceOf[js.Any]))
      lambdaFunctionFailedEventAttributes.foreach(__v => __obj.updateDynamic("lambdaFunctionFailedEventAttributes")(__v.asInstanceOf[js.Any]))
      lambdaFunctionScheduledEventAttributes.foreach(__v => __obj.updateDynamic("lambdaFunctionScheduledEventAttributes")(__v.asInstanceOf[js.Any]))
      lambdaFunctionStartedEventAttributes.foreach(__v => __obj.updateDynamic("lambdaFunctionStartedEventAttributes")(__v.asInstanceOf[js.Any]))
      lambdaFunctionTimedOutEventAttributes.foreach(__v => __obj.updateDynamic("lambdaFunctionTimedOutEventAttributes")(__v.asInstanceOf[js.Any]))
      markerRecordedEventAttributes.foreach(__v => __obj.updateDynamic("markerRecordedEventAttributes")(__v.asInstanceOf[js.Any]))
      recordMarkerFailedEventAttributes.foreach(__v => __obj.updateDynamic("recordMarkerFailedEventAttributes")(__v.asInstanceOf[js.Any]))
      requestCancelActivityTaskFailedEventAttributes.foreach(__v => __obj.updateDynamic("requestCancelActivityTaskFailedEventAttributes")(__v.asInstanceOf[js.Any]))
      requestCancelExternalWorkflowExecutionFailedEventAttributes.foreach(__v => __obj.updateDynamic("requestCancelExternalWorkflowExecutionFailedEventAttributes")(__v.asInstanceOf[js.Any]))
      requestCancelExternalWorkflowExecutionInitiatedEventAttributes.foreach(__v => __obj.updateDynamic("requestCancelExternalWorkflowExecutionInitiatedEventAttributes")(__v.asInstanceOf[js.Any]))
      scheduleActivityTaskFailedEventAttributes.foreach(__v => __obj.updateDynamic("scheduleActivityTaskFailedEventAttributes")(__v.asInstanceOf[js.Any]))
      scheduleLambdaFunctionFailedEventAttributes.foreach(__v => __obj.updateDynamic("scheduleLambdaFunctionFailedEventAttributes")(__v.asInstanceOf[js.Any]))
      signalExternalWorkflowExecutionFailedEventAttributes.foreach(__v => __obj.updateDynamic("signalExternalWorkflowExecutionFailedEventAttributes")(__v.asInstanceOf[js.Any]))
      signalExternalWorkflowExecutionInitiatedEventAttributes.foreach(__v => __obj.updateDynamic("signalExternalWorkflowExecutionInitiatedEventAttributes")(__v.asInstanceOf[js.Any]))
      startChildWorkflowExecutionFailedEventAttributes.foreach(__v => __obj.updateDynamic("startChildWorkflowExecutionFailedEventAttributes")(__v.asInstanceOf[js.Any]))
      startChildWorkflowExecutionInitiatedEventAttributes.foreach(__v => __obj.updateDynamic("startChildWorkflowExecutionInitiatedEventAttributes")(__v.asInstanceOf[js.Any]))
      startLambdaFunctionFailedEventAttributes.foreach(__v => __obj.updateDynamic("startLambdaFunctionFailedEventAttributes")(__v.asInstanceOf[js.Any]))
      startTimerFailedEventAttributes.foreach(__v => __obj.updateDynamic("startTimerFailedEventAttributes")(__v.asInstanceOf[js.Any]))
      timerCanceledEventAttributes.foreach(__v => __obj.updateDynamic("timerCanceledEventAttributes")(__v.asInstanceOf[js.Any]))
      timerFiredEventAttributes.foreach(__v => __obj.updateDynamic("timerFiredEventAttributes")(__v.asInstanceOf[js.Any]))
      timerStartedEventAttributes.foreach(__v => __obj.updateDynamic("timerStartedEventAttributes")(__v.asInstanceOf[js.Any]))
      workflowExecutionCancelRequestedEventAttributes.foreach(__v => __obj.updateDynamic("workflowExecutionCancelRequestedEventAttributes")(__v.asInstanceOf[js.Any]))
      workflowExecutionCanceledEventAttributes.foreach(__v => __obj.updateDynamic("workflowExecutionCanceledEventAttributes")(__v.asInstanceOf[js.Any]))
      workflowExecutionCompletedEventAttributes.foreach(__v => __obj.updateDynamic("workflowExecutionCompletedEventAttributes")(__v.asInstanceOf[js.Any]))
      workflowExecutionContinuedAsNewEventAttributes.foreach(__v => __obj.updateDynamic("workflowExecutionContinuedAsNewEventAttributes")(__v.asInstanceOf[js.Any]))
      workflowExecutionFailedEventAttributes.foreach(__v => __obj.updateDynamic("workflowExecutionFailedEventAttributes")(__v.asInstanceOf[js.Any]))
      workflowExecutionSignaledEventAttributes.foreach(__v => __obj.updateDynamic("workflowExecutionSignaledEventAttributes")(__v.asInstanceOf[js.Any]))
      workflowExecutionStartedEventAttributes.foreach(__v => __obj.updateDynamic("workflowExecutionStartedEventAttributes")(__v.asInstanceOf[js.Any]))
      workflowExecutionTerminatedEventAttributes.foreach(__v => __obj.updateDynamic("workflowExecutionTerminatedEventAttributes")(__v.asInstanceOf[js.Any]))
      workflowExecutionTimedOutEventAttributes.foreach(__v => __obj.updateDynamic("workflowExecutionTimedOutEventAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HistoryEvent]
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
    @inline
    def apply(
        scheduledEventId: EventId,
        startedEventId: EventId,
        result: js.UndefOr[Data] = js.undefined
    ): LambdaFunctionCompletedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any]
      )

      result.foreach(__v => __obj.updateDynamic("result")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionCompletedEventAttributes]
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
    @inline
    def apply(
        scheduledEventId: EventId,
        startedEventId: EventId,
        details: js.UndefOr[Data] = js.undefined,
        reason: js.UndefOr[FailureReason] = js.undefined
    ): LambdaFunctionFailedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any]
      )

      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionFailedEventAttributes]
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
    @inline
    def apply(
        decisionTaskCompletedEventId: EventId,
        id: FunctionId,
        name: FunctionName,
        control: js.UndefOr[Data] = js.undefined,
        input: js.UndefOr[FunctionInput] = js.undefined,
        startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    ): LambdaFunctionScheduledEventAttributes = {
      val __obj = js.Dynamic.literal(
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      control.foreach(__v => __obj.updateDynamic("control")(__v.asInstanceOf[js.Any]))
      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      startToCloseTimeout.foreach(__v => __obj.updateDynamic("startToCloseTimeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionScheduledEventAttributes]
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
    @inline
    def apply(
        scheduledEventId: EventId
    ): LambdaFunctionStartedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[LambdaFunctionStartedEventAttributes]
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
    @inline
    def apply(
        scheduledEventId: EventId,
        startedEventId: EventId,
        timeoutType: js.UndefOr[LambdaFunctionTimeoutType] = js.undefined
    ): LambdaFunctionTimedOutEventAttributes = {
      val __obj = js.Dynamic.literal(
        "scheduledEventId" -> scheduledEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any]
      )

      timeoutType.foreach(__v => __obj.updateDynamic("timeoutType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaFunctionTimedOutEventAttributes]
    }
  }

  @js.native
  sealed trait LambdaFunctionTimeoutType extends js.Any
  object LambdaFunctionTimeoutType {
    val START_TO_CLOSE = "START_TO_CLOSE".asInstanceOf[LambdaFunctionTimeoutType]

    @inline def values = js.Array(START_TO_CLOSE)
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
    @inline
    def apply(
        domain: DomainName,
        registrationStatus: RegistrationStatus,
        maximumPageSize: js.UndefOr[PageSize] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        nextPageToken: js.UndefOr[PageToken] = js.undefined,
        reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
    ): ListActivityTypesInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "registrationStatus" -> registrationStatus.asInstanceOf[js.Any]
      )

      maximumPageSize.foreach(__v => __obj.updateDynamic("maximumPageSize")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      reverseOrder.foreach(__v => __obj.updateDynamic("reverseOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListActivityTypesInput]
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
    @inline
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
        typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined
    ): ListClosedWorkflowExecutionsInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any]
      )

      closeStatusFilter.foreach(__v => __obj.updateDynamic("closeStatusFilter")(__v.asInstanceOf[js.Any]))
      closeTimeFilter.foreach(__v => __obj.updateDynamic("closeTimeFilter")(__v.asInstanceOf[js.Any]))
      executionFilter.foreach(__v => __obj.updateDynamic("executionFilter")(__v.asInstanceOf[js.Any]))
      maximumPageSize.foreach(__v => __obj.updateDynamic("maximumPageSize")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      reverseOrder.foreach(__v => __obj.updateDynamic("reverseOrder")(__v.asInstanceOf[js.Any]))
      startTimeFilter.foreach(__v => __obj.updateDynamic("startTimeFilter")(__v.asInstanceOf[js.Any]))
      tagFilter.foreach(__v => __obj.updateDynamic("tagFilter")(__v.asInstanceOf[js.Any]))
      typeFilter.foreach(__v => __obj.updateDynamic("typeFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClosedWorkflowExecutionsInput]
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
    @inline
    def apply(
        registrationStatus: RegistrationStatus,
        maximumPageSize: js.UndefOr[PageSize] = js.undefined,
        nextPageToken: js.UndefOr[PageToken] = js.undefined,
        reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
    ): ListDomainsInput = {
      val __obj = js.Dynamic.literal(
        "registrationStatus" -> registrationStatus.asInstanceOf[js.Any]
      )

      maximumPageSize.foreach(__v => __obj.updateDynamic("maximumPageSize")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      reverseOrder.foreach(__v => __obj.updateDynamic("reverseOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainsInput]
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
    @inline
    def apply(
        domain: DomainName,
        startTimeFilter: ExecutionTimeFilter,
        executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined,
        maximumPageSize: js.UndefOr[PageSize] = js.undefined,
        nextPageToken: js.UndefOr[PageToken] = js.undefined,
        reverseOrder: js.UndefOr[ReverseOrder] = js.undefined,
        tagFilter: js.UndefOr[TagFilter] = js.undefined,
        typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined
    ): ListOpenWorkflowExecutionsInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "startTimeFilter" -> startTimeFilter.asInstanceOf[js.Any]
      )

      executionFilter.foreach(__v => __obj.updateDynamic("executionFilter")(__v.asInstanceOf[js.Any]))
      maximumPageSize.foreach(__v => __obj.updateDynamic("maximumPageSize")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      reverseOrder.foreach(__v => __obj.updateDynamic("reverseOrder")(__v.asInstanceOf[js.Any]))
      tagFilter.foreach(__v => __obj.updateDynamic("tagFilter")(__v.asInstanceOf[js.Any]))
      typeFilter.foreach(__v => __obj.updateDynamic("typeFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOpenWorkflowExecutionsInput]
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
    var tags: js.UndefOr[ResourceTagList]
  }

  object ListTagsForResourceOutput {
    @inline
    def apply(
        tags: js.UndefOr[ResourceTagList] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
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
    @inline
    def apply(
        domain: DomainName,
        registrationStatus: RegistrationStatus,
        maximumPageSize: js.UndefOr[PageSize] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        nextPageToken: js.UndefOr[PageToken] = js.undefined,
        reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
    ): ListWorkflowTypesInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "registrationStatus" -> registrationStatus.asInstanceOf[js.Any]
      )

      maximumPageSize.foreach(__v => __obj.updateDynamic("maximumPageSize")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      reverseOrder.foreach(__v => __obj.updateDynamic("reverseOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkflowTypesInput]
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
    @inline
    def apply(
        decisionTaskCompletedEventId: EventId,
        markerName: MarkerName,
        details: js.UndefOr[Data] = js.undefined
    ): MarkerRecordedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "markerName" -> markerName.asInstanceOf[js.Any]
      )

      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MarkerRecordedEventAttributes]
    }
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
    @inline
    def apply(
        count: Count,
        truncated: js.UndefOr[Truncated] = js.undefined
    ): PendingTaskCount = {
      val __obj = js.Dynamic.literal(
        "count" -> count.asInstanceOf[js.Any]
      )

      truncated.foreach(__v => __obj.updateDynamic("truncated")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingTaskCount]
    }
  }

  @js.native
  trait PollForActivityTaskInput extends js.Object {
    var domain: DomainName
    var taskList: TaskList
    var identity: js.UndefOr[Identity]
  }

  object PollForActivityTaskInput {
    @inline
    def apply(
        domain: DomainName,
        taskList: TaskList,
        identity: js.UndefOr[Identity] = js.undefined
    ): PollForActivityTaskInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "taskList" -> taskList.asInstanceOf[js.Any]
      )

      identity.foreach(__v => __obj.updateDynamic("identity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PollForActivityTaskInput]
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
    @inline
    def apply(
        domain: DomainName,
        taskList: TaskList,
        identity: js.UndefOr[Identity] = js.undefined,
        maximumPageSize: js.UndefOr[PageSize] = js.undefined,
        nextPageToken: js.UndefOr[PageToken] = js.undefined,
        reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
    ): PollForDecisionTaskInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "taskList" -> taskList.asInstanceOf[js.Any]
      )

      identity.foreach(__v => __obj.updateDynamic("identity")(__v.asInstanceOf[js.Any]))
      maximumPageSize.foreach(__v => __obj.updateDynamic("maximumPageSize")(__v.asInstanceOf[js.Any]))
      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      reverseOrder.foreach(__v => __obj.updateDynamic("reverseOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PollForDecisionTaskInput]
    }
  }

  @js.native
  trait RecordActivityTaskHeartbeatInput extends js.Object {
    var taskToken: TaskToken
    var details: js.UndefOr[LimitedData]
  }

  object RecordActivityTaskHeartbeatInput {
    @inline
    def apply(
        taskToken: TaskToken,
        details: js.UndefOr[LimitedData] = js.undefined
    ): RecordActivityTaskHeartbeatInput = {
      val __obj = js.Dynamic.literal(
        "taskToken" -> taskToken.asInstanceOf[js.Any]
      )

      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordActivityTaskHeartbeatInput]
    }
  }

  /**
    * Provides the details of the <code>RecordMarker</code> decision.
    *  ```Access Control```
    *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
    * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
    *  * Use an <code>Action</code> element to allow or deny permission to call this action.
    *  * You cannot use an IAM policy to constrain this action's parameters.
    * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see [[https://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html|Using IAM to Manage Access to Amazon SWF Workflows]] in the <i>Amazon SWF Developer Guide</i>.
    */
  @js.native
  trait RecordMarkerDecisionAttributes extends js.Object {
    var markerName: MarkerName
    var details: js.UndefOr[Data]
  }

  object RecordMarkerDecisionAttributes {
    @inline
    def apply(
        markerName: MarkerName,
        details: js.UndefOr[Data] = js.undefined
    ): RecordMarkerDecisionAttributes = {
      val __obj = js.Dynamic.literal(
        "markerName" -> markerName.asInstanceOf[js.Any]
      )

      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordMarkerDecisionAttributes]
    }
  }

  @js.native
  sealed trait RecordMarkerFailedCause extends js.Any
  object RecordMarkerFailedCause {
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[RecordMarkerFailedCause]

    @inline def values = js.Array(OPERATION_NOT_PERMITTED)
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
    @inline
    def apply(
        cause: RecordMarkerFailedCause,
        decisionTaskCompletedEventId: EventId,
        markerName: MarkerName
    ): RecordMarkerFailedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "markerName" -> markerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RecordMarkerFailedEventAttributes]
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
    @inline
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
        description: js.UndefOr[Description] = js.undefined
    ): RegisterActivityTypeInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )

      defaultTaskHeartbeatTimeout.foreach(__v => __obj.updateDynamic("defaultTaskHeartbeatTimeout")(__v.asInstanceOf[js.Any]))
      defaultTaskList.foreach(__v => __obj.updateDynamic("defaultTaskList")(__v.asInstanceOf[js.Any]))
      defaultTaskPriority.foreach(__v => __obj.updateDynamic("defaultTaskPriority")(__v.asInstanceOf[js.Any]))
      defaultTaskScheduleToCloseTimeout.foreach(__v => __obj.updateDynamic("defaultTaskScheduleToCloseTimeout")(__v.asInstanceOf[js.Any]))
      defaultTaskScheduleToStartTimeout.foreach(__v => __obj.updateDynamic("defaultTaskScheduleToStartTimeout")(__v.asInstanceOf[js.Any]))
      defaultTaskStartToCloseTimeout.foreach(__v => __obj.updateDynamic("defaultTaskStartToCloseTimeout")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterActivityTypeInput]
    }
  }

  @js.native
  trait RegisterDomainInput extends js.Object {
    var name: DomainName
    var workflowExecutionRetentionPeriodInDays: DurationInDays
    var description: js.UndefOr[Description]
    var tags: js.UndefOr[ResourceTagList]
  }

  object RegisterDomainInput {
    @inline
    def apply(
        name: DomainName,
        workflowExecutionRetentionPeriodInDays: DurationInDays,
        description: js.UndefOr[Description] = js.undefined,
        tags: js.UndefOr[ResourceTagList] = js.undefined
    ): RegisterDomainInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "workflowExecutionRetentionPeriodInDays" -> workflowExecutionRetentionPeriodInDays.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterDomainInput]
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
    @inline
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
        description: js.UndefOr[Description] = js.undefined
    ): RegisterWorkflowTypeInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )

      defaultChildPolicy.foreach(__v => __obj.updateDynamic("defaultChildPolicy")(__v.asInstanceOf[js.Any]))
      defaultExecutionStartToCloseTimeout.foreach(__v => __obj.updateDynamic("defaultExecutionStartToCloseTimeout")(__v.asInstanceOf[js.Any]))
      defaultLambdaRole.foreach(__v => __obj.updateDynamic("defaultLambdaRole")(__v.asInstanceOf[js.Any]))
      defaultTaskList.foreach(__v => __obj.updateDynamic("defaultTaskList")(__v.asInstanceOf[js.Any]))
      defaultTaskPriority.foreach(__v => __obj.updateDynamic("defaultTaskPriority")(__v.asInstanceOf[js.Any]))
      defaultTaskStartToCloseTimeout.foreach(__v => __obj.updateDynamic("defaultTaskStartToCloseTimeout")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterWorkflowTypeInput]
    }
  }

  @js.native
  sealed trait RegistrationStatus extends js.Any
  object RegistrationStatus {
    val REGISTERED = "REGISTERED".asInstanceOf[RegistrationStatus]
    val DEPRECATED = "DEPRECATED".asInstanceOf[RegistrationStatus]

    @inline def values = js.Array(REGISTERED, DEPRECATED)
  }

  /**
    * Provides the details of the <code>RequestCancelActivityTask</code> decision.
    *  ```Access Control```
    *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
    * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
    *  * Use an <code>Action</code> element to allow or deny permission to call this action.
    *  * You cannot use an IAM policy to constrain this action's parameters.
    * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see [[https://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html|Using IAM to Manage Access to Amazon SWF Workflows]] in the <i>Amazon SWF Developer Guide</i>.
    */
  @js.native
  trait RequestCancelActivityTaskDecisionAttributes extends js.Object {
    var activityId: ActivityId
  }

  object RequestCancelActivityTaskDecisionAttributes {
    @inline
    def apply(
        activityId: ActivityId
    ): RequestCancelActivityTaskDecisionAttributes = {
      val __obj = js.Dynamic.literal(
        "activityId" -> activityId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RequestCancelActivityTaskDecisionAttributes]
    }
  }

  @js.native
  sealed trait RequestCancelActivityTaskFailedCause extends js.Any
  object RequestCancelActivityTaskFailedCause {
    val ACTIVITY_ID_UNKNOWN = "ACTIVITY_ID_UNKNOWN".asInstanceOf[RequestCancelActivityTaskFailedCause]
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[RequestCancelActivityTaskFailedCause]

    @inline def values = js.Array(ACTIVITY_ID_UNKNOWN, OPERATION_NOT_PERMITTED)
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
    @inline
    def apply(
        activityId: ActivityId,
        cause: RequestCancelActivityTaskFailedCause,
        decisionTaskCompletedEventId: EventId
    ): RequestCancelActivityTaskFailedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "activityId" -> activityId.asInstanceOf[js.Any],
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RequestCancelActivityTaskFailedEventAttributes]
    }
  }

  /**
    * Provides the details of the <code>RequestCancelExternalWorkflowExecution</code> decision.
    *  ```Access Control```
    *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
    * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
    *  * Use an <code>Action</code> element to allow or deny permission to call this action.
    *  * You cannot use an IAM policy to constrain this action's parameters.
    * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see [[https://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html|Using IAM to Manage Access to Amazon SWF Workflows]] in the <i>Amazon SWF Developer Guide</i>.
    */
  @js.native
  trait RequestCancelExternalWorkflowExecutionDecisionAttributes extends js.Object {
    var workflowId: WorkflowId
    var control: js.UndefOr[Data]
    var runId: js.UndefOr[WorkflowRunIdOptional]
  }

  object RequestCancelExternalWorkflowExecutionDecisionAttributes {
    @inline
    def apply(
        workflowId: WorkflowId,
        control: js.UndefOr[Data] = js.undefined,
        runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
    ): RequestCancelExternalWorkflowExecutionDecisionAttributes = {
      val __obj = js.Dynamic.literal(
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )

      control.foreach(__v => __obj.updateDynamic("control")(__v.asInstanceOf[js.Any]))
      runId.foreach(__v => __obj.updateDynamic("runId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestCancelExternalWorkflowExecutionDecisionAttributes]
    }
  }

  @js.native
  sealed trait RequestCancelExternalWorkflowExecutionFailedCause extends js.Any
  object RequestCancelExternalWorkflowExecutionFailedCause {
    val UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION = "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION".asInstanceOf[RequestCancelExternalWorkflowExecutionFailedCause]
    val REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED = "REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED".asInstanceOf[RequestCancelExternalWorkflowExecutionFailedCause]
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[RequestCancelExternalWorkflowExecutionFailedCause]

    @inline def values = js.Array(UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION, REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED)
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
    @inline
    def apply(
        cause: RequestCancelExternalWorkflowExecutionFailedCause,
        decisionTaskCompletedEventId: EventId,
        initiatedEventId: EventId,
        workflowId: WorkflowId,
        control: js.UndefOr[Data] = js.undefined,
        runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
    ): RequestCancelExternalWorkflowExecutionFailedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )

      control.foreach(__v => __obj.updateDynamic("control")(__v.asInstanceOf[js.Any]))
      runId.foreach(__v => __obj.updateDynamic("runId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestCancelExternalWorkflowExecutionFailedEventAttributes]
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
    @inline
    def apply(
        decisionTaskCompletedEventId: EventId,
        workflowId: WorkflowId,
        control: js.UndefOr[Data] = js.undefined,
        runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
    ): RequestCancelExternalWorkflowExecutionInitiatedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )

      control.foreach(__v => __obj.updateDynamic("control")(__v.asInstanceOf[js.Any]))
      runId.foreach(__v => __obj.updateDynamic("runId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestCancelExternalWorkflowExecutionInitiatedEventAttributes]
    }
  }

  @js.native
  trait RequestCancelWorkflowExecutionInput extends js.Object {
    var domain: DomainName
    var workflowId: WorkflowId
    var runId: js.UndefOr[WorkflowRunIdOptional]
  }

  object RequestCancelWorkflowExecutionInput {
    @inline
    def apply(
        domain: DomainName,
        workflowId: WorkflowId,
        runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
    ): RequestCancelWorkflowExecutionInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )

      runId.foreach(__v => __obj.updateDynamic("runId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestCancelWorkflowExecutionInput]
    }
  }

  /**
    * Tags are key-value pairs that can be associated with Amazon SWF state machines and activities.
    *  Tags may only contain unicode letters, digits, whitespace, or these symbols: <code>_ . : / = + - @</code>.
    */
  @js.native
  trait ResourceTag extends js.Object {
    var key: ResourceTagKey
    var value: js.UndefOr[ResourceTagValue]
  }

  object ResourceTag {
    @inline
    def apply(
        key: ResourceTagKey,
        value: js.UndefOr[ResourceTagValue] = js.undefined
    ): ResourceTag = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any]
      )

      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceTag]
    }
  }

  @js.native
  trait RespondActivityTaskCanceledInput extends js.Object {
    var taskToken: TaskToken
    var details: js.UndefOr[Data]
  }

  object RespondActivityTaskCanceledInput {
    @inline
    def apply(
        taskToken: TaskToken,
        details: js.UndefOr[Data] = js.undefined
    ): RespondActivityTaskCanceledInput = {
      val __obj = js.Dynamic.literal(
        "taskToken" -> taskToken.asInstanceOf[js.Any]
      )

      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RespondActivityTaskCanceledInput]
    }
  }

  @js.native
  trait RespondActivityTaskCompletedInput extends js.Object {
    var taskToken: TaskToken
    var result: js.UndefOr[Data]
  }

  object RespondActivityTaskCompletedInput {
    @inline
    def apply(
        taskToken: TaskToken,
        result: js.UndefOr[Data] = js.undefined
    ): RespondActivityTaskCompletedInput = {
      val __obj = js.Dynamic.literal(
        "taskToken" -> taskToken.asInstanceOf[js.Any]
      )

      result.foreach(__v => __obj.updateDynamic("result")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RespondActivityTaskCompletedInput]
    }
  }

  @js.native
  trait RespondActivityTaskFailedInput extends js.Object {
    var taskToken: TaskToken
    var details: js.UndefOr[Data]
    var reason: js.UndefOr[FailureReason]
  }

  object RespondActivityTaskFailedInput {
    @inline
    def apply(
        taskToken: TaskToken,
        details: js.UndefOr[Data] = js.undefined,
        reason: js.UndefOr[FailureReason] = js.undefined
    ): RespondActivityTaskFailedInput = {
      val __obj = js.Dynamic.literal(
        "taskToken" -> taskToken.asInstanceOf[js.Any]
      )

      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RespondActivityTaskFailedInput]
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
    @inline
    def apply(
        taskToken: TaskToken,
        decisions: js.UndefOr[DecisionList] = js.undefined,
        executionContext: js.UndefOr[Data] = js.undefined
    ): RespondDecisionTaskCompletedInput = {
      val __obj = js.Dynamic.literal(
        "taskToken" -> taskToken.asInstanceOf[js.Any]
      )

      decisions.foreach(__v => __obj.updateDynamic("decisions")(__v.asInstanceOf[js.Any]))
      executionContext.foreach(__v => __obj.updateDynamic("executionContext")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RespondDecisionTaskCompletedInput]
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
    @inline
    def apply(
        runId: js.UndefOr[WorkflowRunId] = js.undefined
    ): Run = {
      val __obj = js.Dynamic.literal()
      runId.foreach(__v => __obj.updateDynamic("runId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Run]
    }
  }

  /**
    * Provides the details of the <code>ScheduleActivityTask</code> decision.
    *  ```Access Control```
    *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
    * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
    *  * Use an <code>Action</code> element to allow or deny permission to call this action.
    *  * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
    * <li> <code>activityType.name</code> – String constraint. The key is <code>swf:activityType.name</code>.
    *  * <code>activityType.version</code> – String constraint. The key is <code>swf:activityType.version</code>.
    *  * <code>taskList</code> – String constraint. The key is <code>swf:taskList.name</code>.
    * </li>If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see [[https://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html|Using IAM to Manage Access to Amazon SWF Workflows]] in the <i>Amazon SWF Developer Guide</i>.
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
    @inline
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
        taskPriority: js.UndefOr[TaskPriority] = js.undefined
    ): ScheduleActivityTaskDecisionAttributes = {
      val __obj = js.Dynamic.literal(
        "activityId" -> activityId.asInstanceOf[js.Any],
        "activityType" -> activityType.asInstanceOf[js.Any]
      )

      control.foreach(__v => __obj.updateDynamic("control")(__v.asInstanceOf[js.Any]))
      heartbeatTimeout.foreach(__v => __obj.updateDynamic("heartbeatTimeout")(__v.asInstanceOf[js.Any]))
      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      scheduleToCloseTimeout.foreach(__v => __obj.updateDynamic("scheduleToCloseTimeout")(__v.asInstanceOf[js.Any]))
      scheduleToStartTimeout.foreach(__v => __obj.updateDynamic("scheduleToStartTimeout")(__v.asInstanceOf[js.Any]))
      startToCloseTimeout.foreach(__v => __obj.updateDynamic("startToCloseTimeout")(__v.asInstanceOf[js.Any]))
      taskList.foreach(__v => __obj.updateDynamic("taskList")(__v.asInstanceOf[js.Any]))
      taskPriority.foreach(__v => __obj.updateDynamic("taskPriority")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduleActivityTaskDecisionAttributes]
    }
  }

  @js.native
  sealed trait ScheduleActivityTaskFailedCause extends js.Any
  object ScheduleActivityTaskFailedCause {
    val ACTIVITY_TYPE_DEPRECATED = "ACTIVITY_TYPE_DEPRECATED".asInstanceOf[ScheduleActivityTaskFailedCause]
    val ACTIVITY_TYPE_DOES_NOT_EXIST = "ACTIVITY_TYPE_DOES_NOT_EXIST".asInstanceOf[ScheduleActivityTaskFailedCause]
    val ACTIVITY_ID_ALREADY_IN_USE = "ACTIVITY_ID_ALREADY_IN_USE".asInstanceOf[ScheduleActivityTaskFailedCause]
    val OPEN_ACTIVITIES_LIMIT_EXCEEDED = "OPEN_ACTIVITIES_LIMIT_EXCEEDED".asInstanceOf[ScheduleActivityTaskFailedCause]
    val ACTIVITY_CREATION_RATE_EXCEEDED = "ACTIVITY_CREATION_RATE_EXCEEDED".asInstanceOf[ScheduleActivityTaskFailedCause]
    val DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED = "DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED".asInstanceOf[ScheduleActivityTaskFailedCause]
    val DEFAULT_TASK_LIST_UNDEFINED = "DEFAULT_TASK_LIST_UNDEFINED".asInstanceOf[ScheduleActivityTaskFailedCause]
    val DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED = "DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED".asInstanceOf[ScheduleActivityTaskFailedCause]
    val DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED = "DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED".asInstanceOf[ScheduleActivityTaskFailedCause]
    val DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED = "DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED".asInstanceOf[ScheduleActivityTaskFailedCause]
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[ScheduleActivityTaskFailedCause]

    @inline def values =
      js.Array(
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
    @inline
    def apply(
        activityId: ActivityId,
        activityType: ActivityType,
        cause: ScheduleActivityTaskFailedCause,
        decisionTaskCompletedEventId: EventId
    ): ScheduleActivityTaskFailedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "activityId" -> activityId.asInstanceOf[js.Any],
        "activityType" -> activityType.asInstanceOf[js.Any],
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ScheduleActivityTaskFailedEventAttributes]
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
    @inline
    def apply(
        id: FunctionId,
        name: FunctionName,
        control: js.UndefOr[Data] = js.undefined,
        input: js.UndefOr[FunctionInput] = js.undefined,
        startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    ): ScheduleLambdaFunctionDecisionAttributes = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      control.foreach(__v => __obj.updateDynamic("control")(__v.asInstanceOf[js.Any]))
      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      startToCloseTimeout.foreach(__v => __obj.updateDynamic("startToCloseTimeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduleLambdaFunctionDecisionAttributes]
    }
  }

  @js.native
  sealed trait ScheduleLambdaFunctionFailedCause extends js.Any
  object ScheduleLambdaFunctionFailedCause {
    val ID_ALREADY_IN_USE = "ID_ALREADY_IN_USE".asInstanceOf[ScheduleLambdaFunctionFailedCause]
    val OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED = "OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED".asInstanceOf[ScheduleLambdaFunctionFailedCause]
    val LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED = "LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED".asInstanceOf[ScheduleLambdaFunctionFailedCause]
    val LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION = "LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION".asInstanceOf[ScheduleLambdaFunctionFailedCause]

    @inline def values = js.Array(ID_ALREADY_IN_USE, OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED, LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED, LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION)
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
    @inline
    def apply(
        cause: ScheduleLambdaFunctionFailedCause,
        decisionTaskCompletedEventId: EventId,
        id: FunctionId,
        name: FunctionName
    ): ScheduleLambdaFunctionFailedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ScheduleLambdaFunctionFailedEventAttributes]
    }
  }

  /**
    * Provides the details of the <code>SignalExternalWorkflowExecution</code> decision.
    *  ```Access Control```
    *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
    * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
    *  * Use an <code>Action</code> element to allow or deny permission to call this action.
    *  * You cannot use an IAM policy to constrain this action's parameters.
    * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see [[https://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html|Using IAM to Manage Access to Amazon SWF Workflows]] in the <i>Amazon SWF Developer Guide</i>.
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
    @inline
    def apply(
        signalName: SignalName,
        workflowId: WorkflowId,
        control: js.UndefOr[Data] = js.undefined,
        input: js.UndefOr[Data] = js.undefined,
        runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
    ): SignalExternalWorkflowExecutionDecisionAttributes = {
      val __obj = js.Dynamic.literal(
        "signalName" -> signalName.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )

      control.foreach(__v => __obj.updateDynamic("control")(__v.asInstanceOf[js.Any]))
      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      runId.foreach(__v => __obj.updateDynamic("runId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SignalExternalWorkflowExecutionDecisionAttributes]
    }
  }

  @js.native
  sealed trait SignalExternalWorkflowExecutionFailedCause extends js.Any
  object SignalExternalWorkflowExecutionFailedCause {
    val UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION = "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION".asInstanceOf[SignalExternalWorkflowExecutionFailedCause]
    val SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED = "SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED".asInstanceOf[SignalExternalWorkflowExecutionFailedCause]
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[SignalExternalWorkflowExecutionFailedCause]

    @inline def values = js.Array(UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION, SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED)
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
    @inline
    def apply(
        cause: SignalExternalWorkflowExecutionFailedCause,
        decisionTaskCompletedEventId: EventId,
        initiatedEventId: EventId,
        workflowId: WorkflowId,
        control: js.UndefOr[Data] = js.undefined,
        runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
    ): SignalExternalWorkflowExecutionFailedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )

      control.foreach(__v => __obj.updateDynamic("control")(__v.asInstanceOf[js.Any]))
      runId.foreach(__v => __obj.updateDynamic("runId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SignalExternalWorkflowExecutionFailedEventAttributes]
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
    @inline
    def apply(
        decisionTaskCompletedEventId: EventId,
        signalName: SignalName,
        workflowId: WorkflowId,
        control: js.UndefOr[Data] = js.undefined,
        input: js.UndefOr[Data] = js.undefined,
        runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
    ): SignalExternalWorkflowExecutionInitiatedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "signalName" -> signalName.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )

      control.foreach(__v => __obj.updateDynamic("control")(__v.asInstanceOf[js.Any]))
      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      runId.foreach(__v => __obj.updateDynamic("runId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SignalExternalWorkflowExecutionInitiatedEventAttributes]
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
    @inline
    def apply(
        domain: DomainName,
        signalName: SignalName,
        workflowId: WorkflowId,
        input: js.UndefOr[Data] = js.undefined,
        runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
    ): SignalWorkflowExecutionInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "signalName" -> signalName.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )

      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      runId.foreach(__v => __obj.updateDynamic("runId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SignalWorkflowExecutionInput]
    }
  }

  /**
    * Provides the details of the <code>StartChildWorkflowExecution</code> decision.
    *  ```Access Control```
    *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
    * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
    *  * Use an <code>Action</code> element to allow or deny permission to call this action.
    *  * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
    * <li> <code>tagList.member.N</code> – The key is "swf:tagList.N" where N is the tag number from 0 to 4, inclusive.
    *  * <code>taskList</code> – String constraint. The key is <code>swf:taskList.name</code>.
    *  * <code>workflowType.name</code> – String constraint. The key is <code>swf:workflowType.name</code>.
    *  * <code>workflowType.version</code> – String constraint. The key is <code>swf:workflowType.version</code>.
    * </li>If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see [[https://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html|Using IAM to Manage Access to Amazon SWF Workflows]] in the <i>Amazon SWF Developer Guide</i>.
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
    @inline
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
        taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    ): StartChildWorkflowExecutionDecisionAttributes = {
      val __obj = js.Dynamic.literal(
        "workflowId" -> workflowId.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]
      )

      childPolicy.foreach(__v => __obj.updateDynamic("childPolicy")(__v.asInstanceOf[js.Any]))
      control.foreach(__v => __obj.updateDynamic("control")(__v.asInstanceOf[js.Any]))
      executionStartToCloseTimeout.foreach(__v => __obj.updateDynamic("executionStartToCloseTimeout")(__v.asInstanceOf[js.Any]))
      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      lambdaRole.foreach(__v => __obj.updateDynamic("lambdaRole")(__v.asInstanceOf[js.Any]))
      tagList.foreach(__v => __obj.updateDynamic("tagList")(__v.asInstanceOf[js.Any]))
      taskList.foreach(__v => __obj.updateDynamic("taskList")(__v.asInstanceOf[js.Any]))
      taskPriority.foreach(__v => __obj.updateDynamic("taskPriority")(__v.asInstanceOf[js.Any]))
      taskStartToCloseTimeout.foreach(__v => __obj.updateDynamic("taskStartToCloseTimeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartChildWorkflowExecutionDecisionAttributes]
    }
  }

  @js.native
  sealed trait StartChildWorkflowExecutionFailedCause extends js.Any
  object StartChildWorkflowExecutionFailedCause {
    val WORKFLOW_TYPE_DOES_NOT_EXIST = "WORKFLOW_TYPE_DOES_NOT_EXIST".asInstanceOf[StartChildWorkflowExecutionFailedCause]
    val WORKFLOW_TYPE_DEPRECATED = "WORKFLOW_TYPE_DEPRECATED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
    val OPEN_CHILDREN_LIMIT_EXCEEDED = "OPEN_CHILDREN_LIMIT_EXCEEDED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
    val OPEN_WORKFLOWS_LIMIT_EXCEEDED = "OPEN_WORKFLOWS_LIMIT_EXCEEDED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
    val CHILD_CREATION_RATE_EXCEEDED = "CHILD_CREATION_RATE_EXCEEDED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
    val WORKFLOW_ALREADY_RUNNING = "WORKFLOW_ALREADY_RUNNING".asInstanceOf[StartChildWorkflowExecutionFailedCause]
    val DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED = "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
    val DEFAULT_TASK_LIST_UNDEFINED = "DEFAULT_TASK_LIST_UNDEFINED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
    val DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED = "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
    val DEFAULT_CHILD_POLICY_UNDEFINED = "DEFAULT_CHILD_POLICY_UNDEFINED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[StartChildWorkflowExecutionFailedCause]

    @inline def values =
      js.Array(
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
    @inline
    def apply(
        cause: StartChildWorkflowExecutionFailedCause,
        decisionTaskCompletedEventId: EventId,
        initiatedEventId: EventId,
        workflowId: WorkflowId,
        workflowType: WorkflowType,
        control: js.UndefOr[Data] = js.undefined
    ): StartChildWorkflowExecutionFailedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "initiatedEventId" -> initiatedEventId.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]
      )

      control.foreach(__v => __obj.updateDynamic("control")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartChildWorkflowExecutionFailedEventAttributes]
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
    @inline
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
        taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    ): StartChildWorkflowExecutionInitiatedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "childPolicy" -> childPolicy.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "taskList" -> taskList.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]
      )

      control.foreach(__v => __obj.updateDynamic("control")(__v.asInstanceOf[js.Any]))
      executionStartToCloseTimeout.foreach(__v => __obj.updateDynamic("executionStartToCloseTimeout")(__v.asInstanceOf[js.Any]))
      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      lambdaRole.foreach(__v => __obj.updateDynamic("lambdaRole")(__v.asInstanceOf[js.Any]))
      tagList.foreach(__v => __obj.updateDynamic("tagList")(__v.asInstanceOf[js.Any]))
      taskPriority.foreach(__v => __obj.updateDynamic("taskPriority")(__v.asInstanceOf[js.Any]))
      taskStartToCloseTimeout.foreach(__v => __obj.updateDynamic("taskStartToCloseTimeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartChildWorkflowExecutionInitiatedEventAttributes]
    }
  }

  @js.native
  sealed trait StartLambdaFunctionFailedCause extends js.Any
  object StartLambdaFunctionFailedCause {
    val ASSUME_ROLE_FAILED = "ASSUME_ROLE_FAILED".asInstanceOf[StartLambdaFunctionFailedCause]

    @inline def values = js.Array(ASSUME_ROLE_FAILED)
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
    @inline
    def apply(
        cause: js.UndefOr[StartLambdaFunctionFailedCause] = js.undefined,
        message: js.UndefOr[CauseMessage] = js.undefined,
        scheduledEventId: js.UndefOr[EventId] = js.undefined
    ): StartLambdaFunctionFailedEventAttributes = {
      val __obj = js.Dynamic.literal()
      cause.foreach(__v => __obj.updateDynamic("cause")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      scheduledEventId.foreach(__v => __obj.updateDynamic("scheduledEventId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartLambdaFunctionFailedEventAttributes]
    }
  }

  /**
    * Provides the details of the <code>StartTimer</code> decision.
    *  ```Access Control```
    *  You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
    * * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
    *  * Use an <code>Action</code> element to allow or deny permission to call this action.
    *  * You cannot use an IAM policy to constrain this action's parameters.
    * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see [[https://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html|Using IAM to Manage Access to Amazon SWF Workflows]] in the <i>Amazon SWF Developer Guide</i>.
    */
  @js.native
  trait StartTimerDecisionAttributes extends js.Object {
    var startToFireTimeout: DurationInSeconds
    var timerId: TimerId
    var control: js.UndefOr[Data]
  }

  object StartTimerDecisionAttributes {
    @inline
    def apply(
        startToFireTimeout: DurationInSeconds,
        timerId: TimerId,
        control: js.UndefOr[Data] = js.undefined
    ): StartTimerDecisionAttributes = {
      val __obj = js.Dynamic.literal(
        "startToFireTimeout" -> startToFireTimeout.asInstanceOf[js.Any],
        "timerId" -> timerId.asInstanceOf[js.Any]
      )

      control.foreach(__v => __obj.updateDynamic("control")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTimerDecisionAttributes]
    }
  }

  @js.native
  sealed trait StartTimerFailedCause extends js.Any
  object StartTimerFailedCause {
    val TIMER_ID_ALREADY_IN_USE = "TIMER_ID_ALREADY_IN_USE".asInstanceOf[StartTimerFailedCause]
    val OPEN_TIMERS_LIMIT_EXCEEDED = "OPEN_TIMERS_LIMIT_EXCEEDED".asInstanceOf[StartTimerFailedCause]
    val TIMER_CREATION_RATE_EXCEEDED = "TIMER_CREATION_RATE_EXCEEDED".asInstanceOf[StartTimerFailedCause]
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[StartTimerFailedCause]

    @inline def values = js.Array(TIMER_ID_ALREADY_IN_USE, OPEN_TIMERS_LIMIT_EXCEEDED, TIMER_CREATION_RATE_EXCEEDED, OPERATION_NOT_PERMITTED)
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
    @inline
    def apply(
        cause: StartTimerFailedCause,
        decisionTaskCompletedEventId: EventId,
        timerId: TimerId
    ): StartTimerFailedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "cause" -> cause.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "timerId" -> timerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartTimerFailedEventAttributes]
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
    @inline
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
        taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    ): StartWorkflowExecutionInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]
      )

      childPolicy.foreach(__v => __obj.updateDynamic("childPolicy")(__v.asInstanceOf[js.Any]))
      executionStartToCloseTimeout.foreach(__v => __obj.updateDynamic("executionStartToCloseTimeout")(__v.asInstanceOf[js.Any]))
      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      lambdaRole.foreach(__v => __obj.updateDynamic("lambdaRole")(__v.asInstanceOf[js.Any]))
      tagList.foreach(__v => __obj.updateDynamic("tagList")(__v.asInstanceOf[js.Any]))
      taskList.foreach(__v => __obj.updateDynamic("taskList")(__v.asInstanceOf[js.Any]))
      taskPriority.foreach(__v => __obj.updateDynamic("taskPriority")(__v.asInstanceOf[js.Any]))
      taskStartToCloseTimeout.foreach(__v => __obj.updateDynamic("taskStartToCloseTimeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartWorkflowExecutionInput]
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
    @inline
    def apply(
        tag: Tag
    ): TagFilter = {
      val __obj = js.Dynamic.literal(
        "tag" -> tag.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagFilter]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var resourceArn: Arn
    var tags: ResourceTagList
  }

  object TagResourceInput {
    @inline
    def apply(
        resourceArn: Arn,
        tags: ResourceTagList
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceInput]
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
    @inline
    def apply(
        name: Name
    ): TaskList = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TaskList]
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
    @inline
    def apply(
        domain: DomainName,
        workflowId: WorkflowId,
        childPolicy: js.UndefOr[ChildPolicy] = js.undefined,
        details: js.UndefOr[Data] = js.undefined,
        reason: js.UndefOr[TerminateReason] = js.undefined,
        runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
    ): TerminateWorkflowExecutionInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )

      childPolicy.foreach(__v => __obj.updateDynamic("childPolicy")(__v.asInstanceOf[js.Any]))
      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      runId.foreach(__v => __obj.updateDynamic("runId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminateWorkflowExecutionInput]
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
    @inline
    def apply(
        decisionTaskCompletedEventId: EventId,
        startedEventId: EventId,
        timerId: TimerId
    ): TimerCanceledEventAttributes = {
      val __obj = js.Dynamic.literal(
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "timerId" -> timerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TimerCanceledEventAttributes]
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
    @inline
    def apply(
        startedEventId: EventId,
        timerId: TimerId
    ): TimerFiredEventAttributes = {
      val __obj = js.Dynamic.literal(
        "startedEventId" -> startedEventId.asInstanceOf[js.Any],
        "timerId" -> timerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TimerFiredEventAttributes]
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
    @inline
    def apply(
        decisionTaskCompletedEventId: EventId,
        startToFireTimeout: DurationInSeconds,
        timerId: TimerId,
        control: js.UndefOr[Data] = js.undefined
    ): TimerStartedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "startToFireTimeout" -> startToFireTimeout.asInstanceOf[js.Any],
        "timerId" -> timerId.asInstanceOf[js.Any]
      )

      control.foreach(__v => __obj.updateDynamic("control")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimerStartedEventAttributes]
    }
  }

  @js.native
  trait UndeprecateActivityTypeInput extends js.Object {
    var activityType: ActivityType
    var domain: DomainName
  }

  object UndeprecateActivityTypeInput {
    @inline
    def apply(
        activityType: ActivityType,
        domain: DomainName
    ): UndeprecateActivityTypeInput = {
      val __obj = js.Dynamic.literal(
        "activityType" -> activityType.asInstanceOf[js.Any],
        "domain" -> domain.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UndeprecateActivityTypeInput]
    }
  }

  @js.native
  trait UndeprecateDomainInput extends js.Object {
    var name: DomainName
  }

  object UndeprecateDomainInput {
    @inline
    def apply(
        name: DomainName
    ): UndeprecateDomainInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UndeprecateDomainInput]
    }
  }

  @js.native
  trait UndeprecateWorkflowTypeInput extends js.Object {
    var domain: DomainName
    var workflowType: WorkflowType
  }

  object UndeprecateWorkflowTypeInput {
    @inline
    def apply(
        domain: DomainName,
        workflowType: WorkflowType
    ): UndeprecateWorkflowTypeInput = {
      val __obj = js.Dynamic.literal(
        "domain" -> domain.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UndeprecateWorkflowTypeInput]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var resourceArn: Arn
    var tagKeys: ResourceTagKeyList
  }

  object UntagResourceInput {
    @inline
    def apply(
        resourceArn: Arn,
        tagKeys: ResourceTagKeyList
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceInput]
    }
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
    @inline
    def apply(
        runId: WorkflowRunId,
        workflowId: WorkflowId
    ): WorkflowExecution = {
      val __obj = js.Dynamic.literal(
        "runId" -> runId.asInstanceOf[js.Any],
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[WorkflowExecution]
    }
  }

  @js.native
  sealed trait WorkflowExecutionCancelRequestedCause extends js.Any
  object WorkflowExecutionCancelRequestedCause {
    val CHILD_POLICY_APPLIED = "CHILD_POLICY_APPLIED".asInstanceOf[WorkflowExecutionCancelRequestedCause]

    @inline def values = js.Array(CHILD_POLICY_APPLIED)
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
    @inline
    def apply(
        cause: js.UndefOr[WorkflowExecutionCancelRequestedCause] = js.undefined,
        externalInitiatedEventId: js.UndefOr[EventId] = js.undefined,
        externalWorkflowExecution: js.UndefOr[WorkflowExecution] = js.undefined
    ): WorkflowExecutionCancelRequestedEventAttributes = {
      val __obj = js.Dynamic.literal()
      cause.foreach(__v => __obj.updateDynamic("cause")(__v.asInstanceOf[js.Any]))
      externalInitiatedEventId.foreach(__v => __obj.updateDynamic("externalInitiatedEventId")(__v.asInstanceOf[js.Any]))
      externalWorkflowExecution.foreach(__v => __obj.updateDynamic("externalWorkflowExecution")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowExecutionCancelRequestedEventAttributes]
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
    @inline
    def apply(
        decisionTaskCompletedEventId: EventId,
        details: js.UndefOr[Data] = js.undefined
    ): WorkflowExecutionCanceledEventAttributes = {
      val __obj = js.Dynamic.literal(
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any]
      )

      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowExecutionCanceledEventAttributes]
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
    @inline
    def apply(
        decisionTaskCompletedEventId: EventId,
        result: js.UndefOr[Data] = js.undefined
    ): WorkflowExecutionCompletedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any]
      )

      result.foreach(__v => __obj.updateDynamic("result")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowExecutionCompletedEventAttributes]
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
    @inline
    def apply(
        childPolicy: ChildPolicy,
        executionStartToCloseTimeout: DurationInSeconds,
        taskList: TaskList,
        taskStartToCloseTimeout: DurationInSeconds,
        lambdaRole: js.UndefOr[Arn] = js.undefined,
        taskPriority: js.UndefOr[TaskPriority] = js.undefined
    ): WorkflowExecutionConfiguration = {
      val __obj = js.Dynamic.literal(
        "childPolicy" -> childPolicy.asInstanceOf[js.Any],
        "executionStartToCloseTimeout" -> executionStartToCloseTimeout.asInstanceOf[js.Any],
        "taskList" -> taskList.asInstanceOf[js.Any],
        "taskStartToCloseTimeout" -> taskStartToCloseTimeout.asInstanceOf[js.Any]
      )

      lambdaRole.foreach(__v => __obj.updateDynamic("lambdaRole")(__v.asInstanceOf[js.Any]))
      taskPriority.foreach(__v => __obj.updateDynamic("taskPriority")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowExecutionConfiguration]
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
    @inline
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
        taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    ): WorkflowExecutionContinuedAsNewEventAttributes = {
      val __obj = js.Dynamic.literal(
        "childPolicy" -> childPolicy.asInstanceOf[js.Any],
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any],
        "newExecutionRunId" -> newExecutionRunId.asInstanceOf[js.Any],
        "taskList" -> taskList.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]
      )

      executionStartToCloseTimeout.foreach(__v => __obj.updateDynamic("executionStartToCloseTimeout")(__v.asInstanceOf[js.Any]))
      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      lambdaRole.foreach(__v => __obj.updateDynamic("lambdaRole")(__v.asInstanceOf[js.Any]))
      tagList.foreach(__v => __obj.updateDynamic("tagList")(__v.asInstanceOf[js.Any]))
      taskPriority.foreach(__v => __obj.updateDynamic("taskPriority")(__v.asInstanceOf[js.Any]))
      taskStartToCloseTimeout.foreach(__v => __obj.updateDynamic("taskStartToCloseTimeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowExecutionContinuedAsNewEventAttributes]
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
    @inline
    def apply(
        count: Count,
        truncated: js.UndefOr[Truncated] = js.undefined
    ): WorkflowExecutionCount = {
      val __obj = js.Dynamic.literal(
        "count" -> count.asInstanceOf[js.Any]
      )

      truncated.foreach(__v => __obj.updateDynamic("truncated")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowExecutionCount]
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
    @inline
    def apply(
        executionConfiguration: WorkflowExecutionConfiguration,
        executionInfo: WorkflowExecutionInfo,
        openCounts: WorkflowExecutionOpenCounts,
        latestActivityTaskTimestamp: js.UndefOr[Timestamp] = js.undefined,
        latestExecutionContext: js.UndefOr[Data] = js.undefined
    ): WorkflowExecutionDetail = {
      val __obj = js.Dynamic.literal(
        "executionConfiguration" -> executionConfiguration.asInstanceOf[js.Any],
        "executionInfo" -> executionInfo.asInstanceOf[js.Any],
        "openCounts" -> openCounts.asInstanceOf[js.Any]
      )

      latestActivityTaskTimestamp.foreach(__v => __obj.updateDynamic("latestActivityTaskTimestamp")(__v.asInstanceOf[js.Any]))
      latestExecutionContext.foreach(__v => __obj.updateDynamic("latestExecutionContext")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowExecutionDetail]
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
    @inline
    def apply(
        decisionTaskCompletedEventId: EventId,
        details: js.UndefOr[Data] = js.undefined,
        reason: js.UndefOr[FailureReason] = js.undefined
    ): WorkflowExecutionFailedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.asInstanceOf[js.Any]
      )

      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowExecutionFailedEventAttributes]
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
    @inline
    def apply(
        workflowId: WorkflowId
    ): WorkflowExecutionFilter = {
      val __obj = js.Dynamic.literal(
        "workflowId" -> workflowId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[WorkflowExecutionFilter]
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
    @inline
    def apply(
        execution: WorkflowExecution,
        executionStatus: ExecutionStatus,
        startTimestamp: Timestamp,
        workflowType: WorkflowType,
        cancelRequested: js.UndefOr[Canceled] = js.undefined,
        closeStatus: js.UndefOr[CloseStatus] = js.undefined,
        closeTimestamp: js.UndefOr[Timestamp] = js.undefined,
        parent: js.UndefOr[WorkflowExecution] = js.undefined,
        tagList: js.UndefOr[TagList] = js.undefined
    ): WorkflowExecutionInfo = {
      val __obj = js.Dynamic.literal(
        "execution" -> execution.asInstanceOf[js.Any],
        "executionStatus" -> executionStatus.asInstanceOf[js.Any],
        "startTimestamp" -> startTimestamp.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]
      )

      cancelRequested.foreach(__v => __obj.updateDynamic("cancelRequested")(__v.asInstanceOf[js.Any]))
      closeStatus.foreach(__v => __obj.updateDynamic("closeStatus")(__v.asInstanceOf[js.Any]))
      closeTimestamp.foreach(__v => __obj.updateDynamic("closeTimestamp")(__v.asInstanceOf[js.Any]))
      parent.foreach(__v => __obj.updateDynamic("parent")(__v.asInstanceOf[js.Any]))
      tagList.foreach(__v => __obj.updateDynamic("tagList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowExecutionInfo]
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
    @inline
    def apply(
        executionInfos: WorkflowExecutionInfoList,
        nextPageToken: js.UndefOr[PageToken] = js.undefined
    ): WorkflowExecutionInfos = {
      val __obj = js.Dynamic.literal(
        "executionInfos" -> executionInfos.asInstanceOf[js.Any]
      )

      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowExecutionInfos]
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
    @inline
    def apply(
        openActivityTasks: Count,
        openChildWorkflowExecutions: Count,
        openDecisionTasks: OpenDecisionTasksCount,
        openTimers: Count,
        openLambdaFunctions: js.UndefOr[Count] = js.undefined
    ): WorkflowExecutionOpenCounts = {
      val __obj = js.Dynamic.literal(
        "openActivityTasks" -> openActivityTasks.asInstanceOf[js.Any],
        "openChildWorkflowExecutions" -> openChildWorkflowExecutions.asInstanceOf[js.Any],
        "openDecisionTasks" -> openDecisionTasks.asInstanceOf[js.Any],
        "openTimers" -> openTimers.asInstanceOf[js.Any]
      )

      openLambdaFunctions.foreach(__v => __obj.updateDynamic("openLambdaFunctions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowExecutionOpenCounts]
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
    @inline
    def apply(
        signalName: SignalName,
        externalInitiatedEventId: js.UndefOr[EventId] = js.undefined,
        externalWorkflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
        input: js.UndefOr[Data] = js.undefined
    ): WorkflowExecutionSignaledEventAttributes = {
      val __obj = js.Dynamic.literal(
        "signalName" -> signalName.asInstanceOf[js.Any]
      )

      externalInitiatedEventId.foreach(__v => __obj.updateDynamic("externalInitiatedEventId")(__v.asInstanceOf[js.Any]))
      externalWorkflowExecution.foreach(__v => __obj.updateDynamic("externalWorkflowExecution")(__v.asInstanceOf[js.Any]))
      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowExecutionSignaledEventAttributes]
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
    @inline
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
        taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    ): WorkflowExecutionStartedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "childPolicy" -> childPolicy.asInstanceOf[js.Any],
        "taskList" -> taskList.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]
      )

      continuedExecutionRunId.foreach(__v => __obj.updateDynamic("continuedExecutionRunId")(__v.asInstanceOf[js.Any]))
      executionStartToCloseTimeout.foreach(__v => __obj.updateDynamic("executionStartToCloseTimeout")(__v.asInstanceOf[js.Any]))
      input.foreach(__v => __obj.updateDynamic("input")(__v.asInstanceOf[js.Any]))
      lambdaRole.foreach(__v => __obj.updateDynamic("lambdaRole")(__v.asInstanceOf[js.Any]))
      parentInitiatedEventId.foreach(__v => __obj.updateDynamic("parentInitiatedEventId")(__v.asInstanceOf[js.Any]))
      parentWorkflowExecution.foreach(__v => __obj.updateDynamic("parentWorkflowExecution")(__v.asInstanceOf[js.Any]))
      tagList.foreach(__v => __obj.updateDynamic("tagList")(__v.asInstanceOf[js.Any]))
      taskPriority.foreach(__v => __obj.updateDynamic("taskPriority")(__v.asInstanceOf[js.Any]))
      taskStartToCloseTimeout.foreach(__v => __obj.updateDynamic("taskStartToCloseTimeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowExecutionStartedEventAttributes]
    }
  }

  @js.native
  sealed trait WorkflowExecutionTerminatedCause extends js.Any
  object WorkflowExecutionTerminatedCause {
    val CHILD_POLICY_APPLIED = "CHILD_POLICY_APPLIED".asInstanceOf[WorkflowExecutionTerminatedCause]
    val EVENT_LIMIT_EXCEEDED = "EVENT_LIMIT_EXCEEDED".asInstanceOf[WorkflowExecutionTerminatedCause]
    val OPERATOR_INITIATED = "OPERATOR_INITIATED".asInstanceOf[WorkflowExecutionTerminatedCause]

    @inline def values = js.Array(CHILD_POLICY_APPLIED, EVENT_LIMIT_EXCEEDED, OPERATOR_INITIATED)
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
    @inline
    def apply(
        childPolicy: ChildPolicy,
        cause: js.UndefOr[WorkflowExecutionTerminatedCause] = js.undefined,
        details: js.UndefOr[Data] = js.undefined,
        reason: js.UndefOr[TerminateReason] = js.undefined
    ): WorkflowExecutionTerminatedEventAttributes = {
      val __obj = js.Dynamic.literal(
        "childPolicy" -> childPolicy.asInstanceOf[js.Any]
      )

      cause.foreach(__v => __obj.updateDynamic("cause")(__v.asInstanceOf[js.Any]))
      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowExecutionTerminatedEventAttributes]
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
    @inline
    def apply(
        childPolicy: ChildPolicy,
        timeoutType: WorkflowExecutionTimeoutType
    ): WorkflowExecutionTimedOutEventAttributes = {
      val __obj = js.Dynamic.literal(
        "childPolicy" -> childPolicy.asInstanceOf[js.Any],
        "timeoutType" -> timeoutType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[WorkflowExecutionTimedOutEventAttributes]
    }
  }

  @js.native
  sealed trait WorkflowExecutionTimeoutType extends js.Any
  object WorkflowExecutionTimeoutType {
    val START_TO_CLOSE = "START_TO_CLOSE".asInstanceOf[WorkflowExecutionTimeoutType]

    @inline def values = js.Array(START_TO_CLOSE)
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
    @inline
    def apply(
        name: Name,
        version: Version
    ): WorkflowType = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[WorkflowType]
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
    @inline
    def apply(
        defaultChildPolicy: js.UndefOr[ChildPolicy] = js.undefined,
        defaultExecutionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
        defaultLambdaRole: js.UndefOr[Arn] = js.undefined,
        defaultTaskList: js.UndefOr[TaskList] = js.undefined,
        defaultTaskPriority: js.UndefOr[TaskPriority] = js.undefined,
        defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    ): WorkflowTypeConfiguration = {
      val __obj = js.Dynamic.literal()
      defaultChildPolicy.foreach(__v => __obj.updateDynamic("defaultChildPolicy")(__v.asInstanceOf[js.Any]))
      defaultExecutionStartToCloseTimeout.foreach(__v => __obj.updateDynamic("defaultExecutionStartToCloseTimeout")(__v.asInstanceOf[js.Any]))
      defaultLambdaRole.foreach(__v => __obj.updateDynamic("defaultLambdaRole")(__v.asInstanceOf[js.Any]))
      defaultTaskList.foreach(__v => __obj.updateDynamic("defaultTaskList")(__v.asInstanceOf[js.Any]))
      defaultTaskPriority.foreach(__v => __obj.updateDynamic("defaultTaskPriority")(__v.asInstanceOf[js.Any]))
      defaultTaskStartToCloseTimeout.foreach(__v => __obj.updateDynamic("defaultTaskStartToCloseTimeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowTypeConfiguration]
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
    @inline
    def apply(
        configuration: WorkflowTypeConfiguration,
        typeInfo: WorkflowTypeInfo
    ): WorkflowTypeDetail = {
      val __obj = js.Dynamic.literal(
        "configuration" -> configuration.asInstanceOf[js.Any],
        "typeInfo" -> typeInfo.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[WorkflowTypeDetail]
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
    @inline
    def apply(
        name: Name,
        version: js.UndefOr[VersionOptional] = js.undefined
    ): WorkflowTypeFilter = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowTypeFilter]
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
    @inline
    def apply(
        creationDate: Timestamp,
        status: RegistrationStatus,
        workflowType: WorkflowType,
        deprecationDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined
    ): WorkflowTypeInfo = {
      val __obj = js.Dynamic.literal(
        "creationDate" -> creationDate.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "workflowType" -> workflowType.asInstanceOf[js.Any]
      )

      deprecationDate.foreach(__v => __obj.updateDynamic("deprecationDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowTypeInfo]
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
    @inline
    def apply(
        typeInfos: WorkflowTypeInfoList,
        nextPageToken: js.UndefOr[PageToken] = js.undefined
    ): WorkflowTypeInfos = {
      val __obj = js.Dynamic.literal(
        "typeInfos" -> typeInfos.asInstanceOf[js.Any]
      )

      nextPageToken.foreach(__v => __obj.updateDynamic("nextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowTypeInfos]
    }
  }
}
