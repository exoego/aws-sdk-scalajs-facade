package facade.amazonaws.services

import scalajs._
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
  type Count = Integer
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
  type EventId = Long
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
  type OpenDecisionTasksCount = Integer
  type PageSize = Integer
  type PageToken = String
  type RecordMarkerFailedCause = String
  type RegistrationStatus = String
  type RequestCancelActivityTaskFailedCause = String
  type RequestCancelExternalWorkflowExecutionFailedCause = String
  type ReverseOrder = Boolean
  type RunId = String
  type RunIdOptional = String
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
  type WorkflowTypeInfoList = js.Array[WorkflowTypeInfo]
}

package swf {
  @js.native
  trait Swf extends js.Object {
    def countClosedWorkflowExecutions(params: CountClosedWorkflowExecutionsInput, callback: Callback[WorkflowExecutionCount]): Unit = js.native
    def countClosedWorkflowExecutions(params: CountClosedWorkflowExecutionsInput): Request[WorkflowExecutionCount] = js.native
    def countOpenWorkflowExecutions(params: CountOpenWorkflowExecutionsInput, callback: Callback[WorkflowExecutionCount]): Unit = js.native
    def countOpenWorkflowExecutions(params: CountOpenWorkflowExecutionsInput): Request[WorkflowExecutionCount] = js.native
    def countPendingActivityTasks(params: CountPendingActivityTasksInput, callback: Callback[PendingTaskCount]): Unit = js.native
    def countPendingActivityTasks(params: CountPendingActivityTasksInput): Request[PendingTaskCount] = js.native
    def countPendingDecisionTasks(params: CountPendingDecisionTasksInput, callback: Callback[PendingTaskCount]): Unit = js.native
    def countPendingDecisionTasks(params: CountPendingDecisionTasksInput): Request[PendingTaskCount] = js.native
    def deprecateActivityType(params: DeprecateActivityTypeInput, callback: Callback[js.Object]): Unit = js.native
    def deprecateActivityType(params: DeprecateActivityTypeInput): Request[js.Object] = js.native
    def deprecateDomain(params: DeprecateDomainInput, callback: Callback[js.Object]): Unit = js.native
    def deprecateDomain(params: DeprecateDomainInput): Request[js.Object] = js.native
    def deprecateWorkflowType(params: DeprecateWorkflowTypeInput, callback: Callback[js.Object]): Unit = js.native
    def deprecateWorkflowType(params: DeprecateWorkflowTypeInput): Request[js.Object] = js.native
    def describeActivityType(params: DescribeActivityTypeInput, callback: Callback[ActivityTypeDetail]): Unit = js.native
    def describeActivityType(params: DescribeActivityTypeInput): Request[ActivityTypeDetail] = js.native
    def describeDomain(params: DescribeDomainInput, callback: Callback[DomainDetail]): Unit = js.native
    def describeDomain(params: DescribeDomainInput): Request[DomainDetail] = js.native
    def describeWorkflowExecution(params: DescribeWorkflowExecutionInput, callback: Callback[WorkflowExecutionDetail]): Unit = js.native
    def describeWorkflowExecution(params: DescribeWorkflowExecutionInput): Request[WorkflowExecutionDetail] = js.native
    def describeWorkflowType(params: DescribeWorkflowTypeInput, callback: Callback[WorkflowTypeDetail]): Unit = js.native
    def describeWorkflowType(params: DescribeWorkflowTypeInput): Request[WorkflowTypeDetail] = js.native
    def getWorkflowExecutionHistory(params: GetWorkflowExecutionHistoryInput, callback: Callback[History]): Unit = js.native
    def getWorkflowExecutionHistory(params: GetWorkflowExecutionHistoryInput): Request[History] = js.native
    def listActivityTypes(params: ListActivityTypesInput, callback: Callback[ActivityTypeInfos]): Unit = js.native
    def listActivityTypes(params: ListActivityTypesInput): Request[ActivityTypeInfos] = js.native
    def listClosedWorkflowExecutions(params: ListClosedWorkflowExecutionsInput, callback: Callback[WorkflowExecutionInfos]): Unit = js.native
    def listClosedWorkflowExecutions(params: ListClosedWorkflowExecutionsInput): Request[WorkflowExecutionInfos] = js.native
    def listDomains(params: ListDomainsInput, callback: Callback[DomainInfos]): Unit = js.native
    def listDomains(params: ListDomainsInput): Request[DomainInfos] = js.native
    def listOpenWorkflowExecutions(params: ListOpenWorkflowExecutionsInput, callback: Callback[WorkflowExecutionInfos]): Unit = js.native
    def listOpenWorkflowExecutions(params: ListOpenWorkflowExecutionsInput): Request[WorkflowExecutionInfos] = js.native
    def listWorkflowTypes(params: ListWorkflowTypesInput, callback: Callback[WorkflowTypeInfos]): Unit = js.native
    def listWorkflowTypes(params: ListWorkflowTypesInput): Request[WorkflowTypeInfos] = js.native
    def pollForActivityTask(params: PollForActivityTaskInput, callback: Callback[ActivityTask]): Unit = js.native
    def pollForActivityTask(params: PollForActivityTaskInput): Request[ActivityTask] = js.native
    def pollForDecisionTask(params: PollForDecisionTaskInput, callback: Callback[DecisionTask]): Unit = js.native
    def pollForDecisionTask(params: PollForDecisionTaskInput): Request[DecisionTask] = js.native
    def recordActivityTaskHeartbeat(params: RecordActivityTaskHeartbeatInput, callback: Callback[ActivityTaskStatus]): Unit = js.native
    def recordActivityTaskHeartbeat(params: RecordActivityTaskHeartbeatInput): Request[ActivityTaskStatus] = js.native
    def registerActivityType(params: RegisterActivityTypeInput, callback: Callback[js.Object]): Unit = js.native
    def registerActivityType(params: RegisterActivityTypeInput): Request[js.Object] = js.native
    def registerDomain(params: RegisterDomainInput, callback: Callback[js.Object]): Unit = js.native
    def registerDomain(params: RegisterDomainInput): Request[js.Object] = js.native
    def registerWorkflowType(params: RegisterWorkflowTypeInput, callback: Callback[js.Object]): Unit = js.native
    def registerWorkflowType(params: RegisterWorkflowTypeInput): Request[js.Object] = js.native
    def requestCancelWorkflowExecution(params: RequestCancelWorkflowExecutionInput, callback: Callback[js.Object]): Unit = js.native
    def requestCancelWorkflowExecution(params: RequestCancelWorkflowExecutionInput): Request[js.Object] = js.native
    def respondActivityTaskCanceled(params: RespondActivityTaskCanceledInput, callback: Callback[js.Object]): Unit = js.native
    def respondActivityTaskCanceled(params: RespondActivityTaskCanceledInput): Request[js.Object] = js.native
    def respondActivityTaskCompleted(params: RespondActivityTaskCompletedInput, callback: Callback[js.Object]): Unit = js.native
    def respondActivityTaskCompleted(params: RespondActivityTaskCompletedInput): Request[js.Object] = js.native
    def respondActivityTaskFailed(params: RespondActivityTaskFailedInput, callback: Callback[js.Object]): Unit = js.native
    def respondActivityTaskFailed(params: RespondActivityTaskFailedInput): Request[js.Object] = js.native
    def respondDecisionTaskCompleted(params: RespondDecisionTaskCompletedInput, callback: Callback[js.Object]): Unit = js.native
    def respondDecisionTaskCompleted(params: RespondDecisionTaskCompletedInput): Request[js.Object] = js.native
    def signalWorkflowExecution(params: SignalWorkflowExecutionInput, callback: Callback[js.Object]): Unit = js.native
    def signalWorkflowExecution(params: SignalWorkflowExecutionInput): Request[js.Object] = js.native
    def startWorkflowExecution(params: StartWorkflowExecutionInput, callback: Callback[Run]): Unit = js.native
    def startWorkflowExecution(params: StartWorkflowExecutionInput): Request[Run] = js.native
    def terminateWorkflowExecution(params: TerminateWorkflowExecutionInput, callback: Callback[js.Object]): Unit = js.native
    def terminateWorkflowExecution(params: TerminateWorkflowExecutionInput): Request[js.Object] = js.native
  }

  /**
   * <p>Unit of work sent to an activity worker.</p>
   */
  @js.native
  trait ActivityTask extends js.Object {
    var workflowExecution: WorkflowExecution
    var activityId: ActivityId
    var taskToken: TaskToken
    var startedEventId: EventId
    var activityType: ActivityType
    var input: Data
  }

  object ActivityTask {
    def apply(
      workflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      activityId: js.UndefOr[ActivityId] = js.undefined,
      taskToken: js.UndefOr[TaskToken] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined,
      activityType: js.UndefOr[ActivityType] = js.undefined,
      input: js.UndefOr[Data] = js.undefined
    ): ActivityTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowExecution" -> workflowExecution.map { x => x: js.Any }),
        ("activityId" -> activityId.map { x => x: js.Any }),
        ("taskToken" -> taskToken.map { x => x: js.Any }),
        ("startedEventId" -> startedEventId.map { x => x: js.Any }),
        ("activityType" -> activityType.map { x => x: js.Any }),
        ("input" -> input.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTask]
    }
  }

  /**
   * <p>Provides details of the <code>ActivityTaskCancelRequested</code> event.</p>
   */
  @js.native
  trait ActivityTaskCancelRequestedEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: EventId
    var activityId: ActivityId
  }

  object ActivityTaskCancelRequestedEventAttributes {
    def apply(
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined,
      activityId: js.UndefOr[ActivityId] = js.undefined
    ): ActivityTaskCancelRequestedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any }),
        ("activityId" -> activityId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskCancelRequestedEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>ActivityTaskCanceled</code> event.</p>
   */
  @js.native
  trait ActivityTaskCanceledEventAttributes extends js.Object {
    var details: Data
    var scheduledEventId: EventId
    var startedEventId: EventId
    var latestCancelRequestedEventId: EventId
  }

  object ActivityTaskCanceledEventAttributes {
    def apply(
      details: js.UndefOr[Data] = js.undefined,
      scheduledEventId: js.UndefOr[EventId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined,
      latestCancelRequestedEventId: js.UndefOr[EventId] = js.undefined
    ): ActivityTaskCanceledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("details" -> details.map { x => x: js.Any }),
        ("scheduledEventId" -> scheduledEventId.map { x => x: js.Any }),
        ("startedEventId" -> startedEventId.map { x => x: js.Any }),
        ("latestCancelRequestedEventId" -> latestCancelRequestedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskCanceledEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>ActivityTaskCompleted</code> event.</p>
   */
  @js.native
  trait ActivityTaskCompletedEventAttributes extends js.Object {
    var result: Data
    var scheduledEventId: EventId
    var startedEventId: EventId
  }

  object ActivityTaskCompletedEventAttributes {
    def apply(
      result: js.UndefOr[Data] = js.undefined,
      scheduledEventId: js.UndefOr[EventId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined
    ): ActivityTaskCompletedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("result" -> result.map { x => x: js.Any }),
        ("scheduledEventId" -> scheduledEventId.map { x => x: js.Any }),
        ("startedEventId" -> startedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskCompletedEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>ActivityTaskFailed</code> event.</p>
   */
  @js.native
  trait ActivityTaskFailedEventAttributes extends js.Object {
    var reason: FailureReason
    var details: Data
    var scheduledEventId: EventId
    var startedEventId: EventId
  }

  object ActivityTaskFailedEventAttributes {
    def apply(
      reason: js.UndefOr[FailureReason] = js.undefined,
      details: js.UndefOr[Data] = js.undefined,
      scheduledEventId: js.UndefOr[EventId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined
    ): ActivityTaskFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("reason" -> reason.map { x => x: js.Any }),
        ("details" -> details.map { x => x: js.Any }),
        ("scheduledEventId" -> scheduledEventId.map { x => x: js.Any }),
        ("startedEventId" -> startedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskFailedEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>ActivityTaskScheduled</code> event.</p>
   */
  @js.native
  trait ActivityTaskScheduledEventAttributes extends js.Object {
    var scheduleToStartTimeout: DurationInSecondsOptional
    var heartbeatTimeout: DurationInSecondsOptional
    var startToCloseTimeout: DurationInSecondsOptional
    var taskList: TaskList
    var activityId: ActivityId
    var decisionTaskCompletedEventId: EventId
    var activityType: ActivityType
    var taskPriority: TaskPriority
    var control: Data
    var scheduleToCloseTimeout: DurationInSecondsOptional
    var input: Data
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
      input: js.UndefOr[Data] = js.undefined
    ): ActivityTaskScheduledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("scheduleToStartTimeout" -> scheduleToStartTimeout.map { x => x: js.Any }),
        ("heartbeatTimeout" -> heartbeatTimeout.map { x => x: js.Any }),
        ("startToCloseTimeout" -> startToCloseTimeout.map { x => x: js.Any }),
        ("taskList" -> taskList.map { x => x: js.Any }),
        ("activityId" -> activityId.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any }),
        ("activityType" -> activityType.map { x => x: js.Any }),
        ("taskPriority" -> taskPriority.map { x => x: js.Any }),
        ("control" -> control.map { x => x: js.Any }),
        ("scheduleToCloseTimeout" -> scheduleToCloseTimeout.map { x => x: js.Any }),
        ("input" -> input.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskScheduledEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>ActivityTaskStarted</code> event.</p>
   */
  @js.native
  trait ActivityTaskStartedEventAttributes extends js.Object {
    var identity: Identity
    var scheduledEventId: EventId
  }

  object ActivityTaskStartedEventAttributes {
    def apply(
      identity: js.UndefOr[Identity] = js.undefined,
      scheduledEventId: js.UndefOr[EventId] = js.undefined
    ): ActivityTaskStartedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("identity" -> identity.map { x => x: js.Any }),
        ("scheduledEventId" -> scheduledEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskStartedEventAttributes]
    }
  }

  /**
   * <p>Status information about an activity task.</p>
   */
  @js.native
  trait ActivityTaskStatus extends js.Object {
    var cancelRequested: Canceled
  }

  object ActivityTaskStatus {
    def apply(
      cancelRequested: js.UndefOr[Canceled] = js.undefined
    ): ActivityTaskStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cancelRequested" -> cancelRequested.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskStatus]
    }
  }

  /**
   * <p>Provides details of the <code>ActivityTaskTimedOut</code> event.</p>
   */
  @js.native
  trait ActivityTaskTimedOutEventAttributes extends js.Object {
    var timeoutType: ActivityTaskTimeoutType
    var scheduledEventId: EventId
    var startedEventId: EventId
    var details: LimitedData
  }

  object ActivityTaskTimedOutEventAttributes {
    def apply(
      timeoutType: js.UndefOr[ActivityTaskTimeoutType] = js.undefined,
      scheduledEventId: js.UndefOr[EventId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined,
      details: js.UndefOr[LimitedData] = js.undefined
    ): ActivityTaskTimedOutEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("timeoutType" -> timeoutType.map { x => x: js.Any }),
        ("scheduledEventId" -> scheduledEventId.map { x => x: js.Any }),
        ("startedEventId" -> startedEventId.map { x => x: js.Any }),
        ("details" -> details.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTaskTimedOutEventAttributes]
    }
  }


  object ActivityTaskTimeoutTypeEnum {
    val `START_TO_CLOSE` = "START_TO_CLOSE"
    val `SCHEDULE_TO_START` = "SCHEDULE_TO_START"
    val `SCHEDULE_TO_CLOSE` = "SCHEDULE_TO_CLOSE"
    val HEARTBEAT = "HEARTBEAT"

    val values = IndexedSeq(`START_TO_CLOSE`, `SCHEDULE_TO_START`, `SCHEDULE_TO_CLOSE`, HEARTBEAT)
  }

  /**
   * <p>Represents an activity type.</p>
   */
  @js.native
  trait ActivityType extends js.Object {
    var name: Name
    var version: Version
  }

  object ActivityType {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      version: js.UndefOr[Version] = js.undefined
    ): ActivityType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("version" -> version.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityType]
    }
  }

  /**
   * <p>Configuration settings registered with the activity type.</p>
   */
  @js.native
  trait ActivityTypeConfiguration extends js.Object {
    var defaultTaskStartToCloseTimeout: DurationInSecondsOptional
    var defaultTaskScheduleToStartTimeout: DurationInSecondsOptional
    var defaultTaskList: TaskList
    var defaultTaskScheduleToCloseTimeout: DurationInSecondsOptional
    var defaultTaskHeartbeatTimeout: DurationInSecondsOptional
    var defaultTaskPriority: TaskPriority
  }

  object ActivityTypeConfiguration {
    def apply(
      defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      defaultTaskScheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      defaultTaskList: js.UndefOr[TaskList] = js.undefined,
      defaultTaskScheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      defaultTaskHeartbeatTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      defaultTaskPriority: js.UndefOr[TaskPriority] = js.undefined
    ): ActivityTypeConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("defaultTaskStartToCloseTimeout" -> defaultTaskStartToCloseTimeout.map { x => x: js.Any }),
        ("defaultTaskScheduleToStartTimeout" -> defaultTaskScheduleToStartTimeout.map { x => x: js.Any }),
        ("defaultTaskList" -> defaultTaskList.map { x => x: js.Any }),
        ("defaultTaskScheduleToCloseTimeout" -> defaultTaskScheduleToCloseTimeout.map { x => x: js.Any }),
        ("defaultTaskHeartbeatTimeout" -> defaultTaskHeartbeatTimeout.map { x => x: js.Any }),
        ("defaultTaskPriority" -> defaultTaskPriority.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTypeConfiguration]
    }
  }

  /**
   * <p>Detailed information about an activity type.</p>
   */
  @js.native
  trait ActivityTypeDetail extends js.Object {
    var typeInfo: ActivityTypeInfo
    var configuration: ActivityTypeConfiguration
  }

  object ActivityTypeDetail {
    def apply(
      typeInfo: js.UndefOr[ActivityTypeInfo] = js.undefined,
      configuration: js.UndefOr[ActivityTypeConfiguration] = js.undefined
    ): ActivityTypeDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("typeInfo" -> typeInfo.map { x => x: js.Any }),
        ("configuration" -> configuration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTypeDetail]
    }
  }

  /**
   * <p>Detailed information about an activity type.</p>
   */
  @js.native
  trait ActivityTypeInfo extends js.Object {
    var description: Description
    var activityType: ActivityType
    var status: RegistrationStatus
    var deprecationDate: Timestamp
    var creationDate: Timestamp
  }

  object ActivityTypeInfo {
    def apply(
      description: js.UndefOr[Description] = js.undefined,
      activityType: js.UndefOr[ActivityType] = js.undefined,
      status: js.UndefOr[RegistrationStatus] = js.undefined,
      deprecationDate: js.UndefOr[Timestamp] = js.undefined,
      creationDate: js.UndefOr[Timestamp] = js.undefined
    ): ActivityTypeInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("description" -> description.map { x => x: js.Any }),
        ("activityType" -> activityType.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("deprecationDate" -> deprecationDate.map { x => x: js.Any }),
        ("creationDate" -> creationDate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTypeInfo]
    }
  }

  /**
   * <p>Contains a paginated list of activity type information structures.</p>
   */
  @js.native
  trait ActivityTypeInfos extends js.Object {
    var typeInfos: ActivityTypeInfoList
    var nextPageToken: PageToken
  }

  object ActivityTypeInfos {
    def apply(
      typeInfos: js.UndefOr[ActivityTypeInfoList] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined
    ): ActivityTypeInfos = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("typeInfos" -> typeInfos.map { x => x: js.Any }),
        ("nextPageToken" -> nextPageToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivityTypeInfos]
    }
  }

  /**
   * <p>Provides details of the <code>CancelTimer</code> decision.</p> <p><b>Access Control</b></p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li> <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li> <li>You cannot use an IAM policy to constrain this action's parameters.</li> </ul> <p>If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a>.</p>
   */
  @js.native
  trait CancelTimerDecisionAttributes extends js.Object {
    var timerId: TimerId
  }

  object CancelTimerDecisionAttributes {
    def apply(
      timerId: js.UndefOr[TimerId] = js.undefined
    ): CancelTimerDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("timerId" -> timerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelTimerDecisionAttributes]
    }
  }


  object CancelTimerFailedCauseEnum {
    val `TIMER_ID_UNKNOWN` = "TIMER_ID_UNKNOWN"
    val `OPERATION_NOT_PERMITTED` = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(`TIMER_ID_UNKNOWN`, `OPERATION_NOT_PERMITTED`)
  }

  /**
   * <p>Provides details of the <code>CancelTimerFailed</code> event.</p>
   */
  @js.native
  trait CancelTimerFailedEventAttributes extends js.Object {
    var timerId: TimerId
    var cause: CancelTimerFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  object CancelTimerFailedEventAttributes {
    def apply(
      timerId: js.UndefOr[TimerId] = js.undefined,
      cause: js.UndefOr[CancelTimerFailedCause] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined
    ): CancelTimerFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("timerId" -> timerId.map { x => x: js.Any }),
        ("cause" -> cause.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelTimerFailedEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>CancelWorkflowExecution</code> decision.</p> <p><b>Access Control</b></p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li> <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li> <li>You cannot use an IAM policy to constrain this action's parameters.</li> </ul> <p>If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a>.</p>
   */
  @js.native
  trait CancelWorkflowExecutionDecisionAttributes extends js.Object {
    var details: Data
  }

  object CancelWorkflowExecutionDecisionAttributes {
    def apply(
      details: js.UndefOr[Data] = js.undefined
    ): CancelWorkflowExecutionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("details" -> details.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelWorkflowExecutionDecisionAttributes]
    }
  }


  object CancelWorkflowExecutionFailedCauseEnum {
    val `UNHANDLED_DECISION` = "UNHANDLED_DECISION"
    val `OPERATION_NOT_PERMITTED` = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(`UNHANDLED_DECISION`, `OPERATION_NOT_PERMITTED`)
  }

  /**
   * <p>Provides details of the <code>CancelWorkflowExecutionFailed</code> event.</p>
   */
  @js.native
  trait CancelWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: CancelWorkflowExecutionFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  object CancelWorkflowExecutionFailedEventAttributes {
    def apply(
      cause: js.UndefOr[CancelWorkflowExecutionFailedCause] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined
    ): CancelWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cause" -> cause.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelWorkflowExecutionFailedEventAttributes]
    }
  }


  object ChildPolicyEnum {
    val TERMINATE = "TERMINATE"
    val `REQUEST_CANCEL` = "REQUEST_CANCEL"
    val ABANDON = "ABANDON"

    val values = IndexedSeq(TERMINATE, `REQUEST_CANCEL`, ABANDON)
  }

  /**
   * <p>Provide details of the <code>ChildWorkflowExecutionCanceled</code> event.</p>
   */
  @js.native
  trait ChildWorkflowExecutionCanceledEventAttributes extends js.Object {
    var workflowType: WorkflowType
    var initiatedEventId: EventId
    var workflowExecution: WorkflowExecution
    var startedEventId: EventId
    var details: Data
  }

  object ChildWorkflowExecutionCanceledEventAttributes {
    def apply(
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      initiatedEventId: js.UndefOr[EventId] = js.undefined,
      workflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined,
      details: js.UndefOr[Data] = js.undefined
    ): ChildWorkflowExecutionCanceledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowType" -> workflowType.map { x => x: js.Any }),
        ("initiatedEventId" -> initiatedEventId.map { x => x: js.Any }),
        ("workflowExecution" -> workflowExecution.map { x => x: js.Any }),
        ("startedEventId" -> startedEventId.map { x => x: js.Any }),
        ("details" -> details.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChildWorkflowExecutionCanceledEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>ChildWorkflowExecutionCompleted</code> event.</p>
   */
  @js.native
  trait ChildWorkflowExecutionCompletedEventAttributes extends js.Object {
    var workflowType: WorkflowType
    var initiatedEventId: EventId
    var result: Data
    var workflowExecution: WorkflowExecution
    var startedEventId: EventId
  }

  object ChildWorkflowExecutionCompletedEventAttributes {
    def apply(
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      initiatedEventId: js.UndefOr[EventId] = js.undefined,
      result: js.UndefOr[Data] = js.undefined,
      workflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined
    ): ChildWorkflowExecutionCompletedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowType" -> workflowType.map { x => x: js.Any }),
        ("initiatedEventId" -> initiatedEventId.map { x => x: js.Any }),
        ("result" -> result.map { x => x: js.Any }),
        ("workflowExecution" -> workflowExecution.map { x => x: js.Any }),
        ("startedEventId" -> startedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChildWorkflowExecutionCompletedEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>ChildWorkflowExecutionFailed</code> event.</p>
   */
  @js.native
  trait ChildWorkflowExecutionFailedEventAttributes extends js.Object {
    var workflowType: WorkflowType
    var initiatedEventId: EventId
    var workflowExecution: WorkflowExecution
    var reason: FailureReason
    var startedEventId: EventId
    var details: Data
  }

  object ChildWorkflowExecutionFailedEventAttributes {
    def apply(
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      initiatedEventId: js.UndefOr[EventId] = js.undefined,
      workflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      reason: js.UndefOr[FailureReason] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined,
      details: js.UndefOr[Data] = js.undefined
    ): ChildWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowType" -> workflowType.map { x => x: js.Any }),
        ("initiatedEventId" -> initiatedEventId.map { x => x: js.Any }),
        ("workflowExecution" -> workflowExecution.map { x => x: js.Any }),
        ("reason" -> reason.map { x => x: js.Any }),
        ("startedEventId" -> startedEventId.map { x => x: js.Any }),
        ("details" -> details.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChildWorkflowExecutionFailedEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>ChildWorkflowExecutionStarted</code> event.</p>
   */
  @js.native
  trait ChildWorkflowExecutionStartedEventAttributes extends js.Object {
    var workflowExecution: WorkflowExecution
    var workflowType: WorkflowType
    var initiatedEventId: EventId
  }

  object ChildWorkflowExecutionStartedEventAttributes {
    def apply(
      workflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      initiatedEventId: js.UndefOr[EventId] = js.undefined
    ): ChildWorkflowExecutionStartedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowExecution" -> workflowExecution.map { x => x: js.Any }),
        ("workflowType" -> workflowType.map { x => x: js.Any }),
        ("initiatedEventId" -> initiatedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChildWorkflowExecutionStartedEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>ChildWorkflowExecutionTerminated</code> event.</p>
   */
  @js.native
  trait ChildWorkflowExecutionTerminatedEventAttributes extends js.Object {
    var workflowExecution: WorkflowExecution
    var workflowType: WorkflowType
    var initiatedEventId: EventId
    var startedEventId: EventId
  }

  object ChildWorkflowExecutionTerminatedEventAttributes {
    def apply(
      workflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      initiatedEventId: js.UndefOr[EventId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined
    ): ChildWorkflowExecutionTerminatedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowExecution" -> workflowExecution.map { x => x: js.Any }),
        ("workflowType" -> workflowType.map { x => x: js.Any }),
        ("initiatedEventId" -> initiatedEventId.map { x => x: js.Any }),
        ("startedEventId" -> startedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChildWorkflowExecutionTerminatedEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>ChildWorkflowExecutionTimedOut</code> event.</p>
   */
  @js.native
  trait ChildWorkflowExecutionTimedOutEventAttributes extends js.Object {
    var workflowType: WorkflowType
    var initiatedEventId: EventId
    var timeoutType: WorkflowExecutionTimeoutType
    var workflowExecution: WorkflowExecution
    var startedEventId: EventId
  }

  object ChildWorkflowExecutionTimedOutEventAttributes {
    def apply(
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      initiatedEventId: js.UndefOr[EventId] = js.undefined,
      timeoutType: js.UndefOr[WorkflowExecutionTimeoutType] = js.undefined,
      workflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined
    ): ChildWorkflowExecutionTimedOutEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowType" -> workflowType.map { x => x: js.Any }),
        ("initiatedEventId" -> initiatedEventId.map { x => x: js.Any }),
        ("timeoutType" -> timeoutType.map { x => x: js.Any }),
        ("workflowExecution" -> workflowExecution.map { x => x: js.Any }),
        ("startedEventId" -> startedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChildWorkflowExecutionTimedOutEventAttributes]
    }
  }


  object CloseStatusEnum {
    val COMPLETED = "COMPLETED"
    val FAILED = "FAILED"
    val CANCELED = "CANCELED"
    val TERMINATED = "TERMINATED"
    val `CONTINUED_AS_NEW` = "CONTINUED_AS_NEW"
    val `TIMED_OUT` = "TIMED_OUT"

    val values = IndexedSeq(COMPLETED, FAILED, CANCELED, TERMINATED, `CONTINUED_AS_NEW`, `TIMED_OUT`)
  }

  /**
   * <p>Used to filter the closed workflow executions in visibility APIs by their close status.</p>
   */
  @js.native
  trait CloseStatusFilter extends js.Object {
    var status: CloseStatus
  }

  object CloseStatusFilter {
    def apply(
      status: js.UndefOr[CloseStatus] = js.undefined
    ): CloseStatusFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("status" -> status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloseStatusFilter]
    }
  }

  /**
   * <p>Provides details of the <code>CompleteWorkflowExecution</code> decision.</p> <p><b>Access Control</b></p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li> <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li> <li>You cannot use an IAM policy to constrain this action's parameters.</li> </ul> <p>If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a>.</p>
   */
  @js.native
  trait CompleteWorkflowExecutionDecisionAttributes extends js.Object {
    var result: Data
  }

  object CompleteWorkflowExecutionDecisionAttributes {
    def apply(
      result: js.UndefOr[Data] = js.undefined
    ): CompleteWorkflowExecutionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("result" -> result.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteWorkflowExecutionDecisionAttributes]
    }
  }


  object CompleteWorkflowExecutionFailedCauseEnum {
    val `UNHANDLED_DECISION` = "UNHANDLED_DECISION"
    val `OPERATION_NOT_PERMITTED` = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(`UNHANDLED_DECISION`, `OPERATION_NOT_PERMITTED`)
  }

  /**
   * <p>Provides details of the <code>CompleteWorkflowExecutionFailed</code> event.</p>
   */
  @js.native
  trait CompleteWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: CompleteWorkflowExecutionFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  object CompleteWorkflowExecutionFailedEventAttributes {
    def apply(
      cause: js.UndefOr[CompleteWorkflowExecutionFailedCause] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined
    ): CompleteWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cause" -> cause.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompleteWorkflowExecutionFailedEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>ContinueAsNewWorkflowExecution</code> decision.</p> <p><b>Access Control</b></p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li> <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li> <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys. <ul> <li> <code>tag</code>: <i>Optional.</i>. A tag used to identify the workflow execution</li> <li><code>taskList</code>: String constraint. The key is <code>swf:taskList.name</code>.</li> <li><code>workflowType.version</code>: String constraint. The key is <code>swf:workflowType.version</code>.</li> </ul> </li> </ul> <p>If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a>.</p>
   */
  @js.native
  trait ContinueAsNewWorkflowExecutionDecisionAttributes extends js.Object {
    var lambdaRole: Arn
    var taskList: TaskList
    var tagList: TagList
    var workflowTypeVersion: Version
    var taskPriority: TaskPriority
    var taskStartToCloseTimeout: DurationInSecondsOptional
    var childPolicy: ChildPolicy
    var executionStartToCloseTimeout: DurationInSecondsOptional
    var input: Data
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
      input: js.UndefOr[Data] = js.undefined
    ): ContinueAsNewWorkflowExecutionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("lambdaRole" -> lambdaRole.map { x => x: js.Any }),
        ("taskList" -> taskList.map { x => x: js.Any }),
        ("tagList" -> tagList.map { x => x: js.Any }),
        ("workflowTypeVersion" -> workflowTypeVersion.map { x => x: js.Any }),
        ("taskPriority" -> taskPriority.map { x => x: js.Any }),
        ("taskStartToCloseTimeout" -> taskStartToCloseTimeout.map { x => x: js.Any }),
        ("childPolicy" -> childPolicy.map { x => x: js.Any }),
        ("executionStartToCloseTimeout" -> executionStartToCloseTimeout.map { x => x: js.Any }),
        ("input" -> input.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContinueAsNewWorkflowExecutionDecisionAttributes]
    }
  }


  object ContinueAsNewWorkflowExecutionFailedCauseEnum {
    val `UNHANDLED_DECISION` = "UNHANDLED_DECISION"
    val `WORKFLOW_TYPE_DEPRECATED` = "WORKFLOW_TYPE_DEPRECATED"
    val `WORKFLOW_TYPE_DOES_NOT_EXIST` = "WORKFLOW_TYPE_DOES_NOT_EXIST"
    val `DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED` = "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED"
    val `DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED` = "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED"
    val `DEFAULT_TASK_LIST_UNDEFINED` = "DEFAULT_TASK_LIST_UNDEFINED"
    val `DEFAULT_CHILD_POLICY_UNDEFINED` = "DEFAULT_CHILD_POLICY_UNDEFINED"
    val `CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED` = "CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED"
    val `OPERATION_NOT_PERMITTED` = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(`UNHANDLED_DECISION`, `WORKFLOW_TYPE_DEPRECATED`, `WORKFLOW_TYPE_DOES_NOT_EXIST`, `DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED`, `DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED`, `DEFAULT_TASK_LIST_UNDEFINED`, `DEFAULT_CHILD_POLICY_UNDEFINED`, `CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED`, `OPERATION_NOT_PERMITTED`)
  }

  /**
   * <p>Provides details of the <code>ContinueAsNewWorkflowExecutionFailed</code> event.</p>
   */
  @js.native
  trait ContinueAsNewWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: ContinueAsNewWorkflowExecutionFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  object ContinueAsNewWorkflowExecutionFailedEventAttributes {
    def apply(
      cause: js.UndefOr[ContinueAsNewWorkflowExecutionFailedCause] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined
    ): ContinueAsNewWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cause" -> cause.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContinueAsNewWorkflowExecutionFailedEventAttributes]
    }
  }

  @js.native
  trait CountClosedWorkflowExecutionsInput extends js.Object {
    var executionFilter: WorkflowExecutionFilter
    var startTimeFilter: ExecutionTimeFilter
    var domain: DomainName
    var closeStatusFilter: CloseStatusFilter
    var closeTimeFilter: ExecutionTimeFilter
    var typeFilter: WorkflowTypeFilter
    var tagFilter: TagFilter
  }

  object CountClosedWorkflowExecutionsInput {
    def apply(
      executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined,
      startTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined,
      domain: js.UndefOr[DomainName] = js.undefined,
      closeStatusFilter: js.UndefOr[CloseStatusFilter] = js.undefined,
      closeTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined,
      typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined,
      tagFilter: js.UndefOr[TagFilter] = js.undefined
    ): CountClosedWorkflowExecutionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("executionFilter" -> executionFilter.map { x => x: js.Any }),
        ("startTimeFilter" -> startTimeFilter.map { x => x: js.Any }),
        ("domain" -> domain.map { x => x: js.Any }),
        ("closeStatusFilter" -> closeStatusFilter.map { x => x: js.Any }),
        ("closeTimeFilter" -> closeTimeFilter.map { x => x: js.Any }),
        ("typeFilter" -> typeFilter.map { x => x: js.Any }),
        ("tagFilter" -> tagFilter.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CountClosedWorkflowExecutionsInput]
    }
  }

  @js.native
  trait CountOpenWorkflowExecutionsInput extends js.Object {
    var executionFilter: WorkflowExecutionFilter
    var startTimeFilter: ExecutionTimeFilter
    var domain: DomainName
    var typeFilter: WorkflowTypeFilter
    var tagFilter: TagFilter
  }

  object CountOpenWorkflowExecutionsInput {
    def apply(
      executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined,
      startTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined,
      domain: js.UndefOr[DomainName] = js.undefined,
      typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined,
      tagFilter: js.UndefOr[TagFilter] = js.undefined
    ): CountOpenWorkflowExecutionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("executionFilter" -> executionFilter.map { x => x: js.Any }),
        ("startTimeFilter" -> startTimeFilter.map { x => x: js.Any }),
        ("domain" -> domain.map { x => x: js.Any }),
        ("typeFilter" -> typeFilter.map { x => x: js.Any }),
        ("tagFilter" -> tagFilter.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      domain: js.UndefOr[DomainName] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined
    ): CountPendingActivityTasksInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("domain" -> domain.map { x => x: js.Any }),
        ("taskList" -> taskList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      domain: js.UndefOr[DomainName] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined
    ): CountPendingDecisionTasksInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("domain" -> domain.map { x => x: js.Any }),
        ("taskList" -> taskList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CountPendingDecisionTasksInput]
    }
  }

  /**
   * <p>Specifies a decision made by the decider. A decision can be one of these types:</p> <ul> <li> <b>CancelTimer</b>: cancels a previously started timer and records a <code>TimerCanceled</code> event in the history.</li> <li> <b>CancelWorkflowExecution</b>: closes the workflow execution and records a <code>WorkflowExecutionCanceled</code> event in the history.</li> <li> <b>CompleteWorkflowExecution</b>: closes the workflow execution and records a <code>WorkflowExecutionCompleted</code> event in the history .</li> <li> <b>ContinueAsNewWorkflowExecution</b>: closes the workflow execution and starts a new workflow execution of the same type using the same workflow ID and a unique run ID. A <code>WorkflowExecutionContinuedAsNew</code> event is recorded in the history.</li> <li> <b>FailWorkflowExecution</b>: closes the workflow execution and records a <code>WorkflowExecutionFailed</code> event in the history.</li> <li> <b>RecordMarker</b>: records a <code>MarkerRecorded</code> event in the history. Markers can be used for adding custom information in the history for instance to let deciders know that they do not need to look at the history beyond the marker event.</li> <li> <b>RequestCancelActivityTask</b>: attempts to cancel a previously scheduled activity task. If the activity task was scheduled but has not been assigned to a worker, then it will be canceled. If the activity task was already assigned to a worker, then the worker will be informed that cancellation has been requested in the response to <a>RecordActivityTaskHeartbeat</a>.</li> <li> <b>RequestCancelExternalWorkflowExecution</b>: requests that a request be made to cancel the specified external workflow execution and records a <code>RequestCancelExternalWorkflowExecutionInitiated</code> event in the history.</li> <li> <b>ScheduleActivityTask</b>: schedules an activity task.</li> <li> <b>ScheduleLambdaFunction</b>: schedules a AWS Lambda function.</li> <li> <b>SignalExternalWorkflowExecution</b>: requests a signal to be delivered to the specified external workflow execution and records a <code>SignalExternalWorkflowExecutionInitiated</code> event in the history.</li> <li> <b>StartChildWorkflowExecution</b>: requests that a child workflow execution be started and records a <code>StartChildWorkflowExecutionInitiated</code> event in the history. The child workflow execution is a separate workflow execution with its own history.</li> <li> <b>StartTimer</b>: starts a timer for this workflow execution and records a <code>TimerStarted</code> event in the history. This timer will fire after the specified delay and record a <code>TimerFired</code> event.</li> </ul> <p><b>Access Control</b></p> <p>If you grant permission to use <code>RespondDecisionTaskCompleted</code>, you can use IAM policies to express permissions for the list of decisions returned by this action as if they were members of the API. Treating decisions as a pseudo API maintains a uniform conceptual model and helps keep policies readable. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a>.</p> <p><b>Decision Failure</b></p> <p>Decisions can fail for several reasons</p> <ul> <li>The ordering of decisions should follow a logical flow. Some decisions might not make sense in the current context of the workflow execution and will therefore fail.</li> <li>A limit on your account was reached.</li> <li>The decision lacks sufficient permissions.</li> </ul> <p>One of the following events might be added to the history to indicate an error. The event attribute's <b>cause</b> parameter indicates the cause. If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient permissions. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a>.</p> <ul> <li> <b>ScheduleActivityTaskFailed</b>: a ScheduleActivityTask decision failed. This could happen if the activity type specified in the decision is not registered, is in a deprecated state, or the decision is not properly configured.</li> <li> <b>ScheduleLambdaFunctionFailed</b>: a ScheduleLambdaFunctionFailed decision failed. This could happen if the AWS Lambda function specified in the decision does not exist, or the AWS Lambda service's limits are exceeded.</li> <li> <b>RequestCancelActivityTaskFailed</b>: a RequestCancelActivityTask decision failed. This could happen if there is no open activity task with the specified activityId.</li> <li> <b>StartTimerFailed</b>: a StartTimer decision failed. This could happen if there is another open timer with the same timerId.</li> <li> <b>CancelTimerFailed</b>: a CancelTimer decision failed. This could happen if there is no open timer with the specified timerId.</li> <li> <b>StartChildWorkflowExecutionFailed</b>: a StartChildWorkflowExecution decision failed. This could happen if the workflow type specified is not registered, is deprecated, or the decision is not properly configured.</li> <li> <b>SignalExternalWorkflowExecutionFailed</b>: a SignalExternalWorkflowExecution decision failed. This could happen if the <code>workflowID</code> specified in the decision was incorrect.</li> <li> <b>RequestCancelExternalWorkflowExecutionFailed</b>: a RequestCancelExternalWorkflowExecution decision failed. This could happen if the <code>workflowID</code> specified in the decision was incorrect.</li> <li> <b>CancelWorkflowExecutionFailed</b>: a CancelWorkflowExecution decision failed. This could happen if there is an unhandled decision task pending in the workflow execution.</li> <li> <b>CompleteWorkflowExecutionFailed</b>: a CompleteWorkflowExecution decision failed. This could happen if there is an unhandled decision task pending in the workflow execution.</li> <li> <b>ContinueAsNewWorkflowExecutionFailed</b>: a ContinueAsNewWorkflowExecution decision failed. This could happen if there is an unhandled decision task pending in the workflow execution or the ContinueAsNewWorkflowExecution decision was not configured correctly.</li> <li> <b>FailWorkflowExecutionFailed</b>: a FailWorkflowExecution decision failed. This could happen if there is an unhandled decision task pending in the workflow execution.</li> </ul> <p>The preceding error events might occur due to an error in the decider logic, which might put the workflow execution in an unstable state The cause field in the event structure for the error event indicates the cause of the error.</p> <note>A workflow execution may be closed by the decider by returning one of the following decisions when completing a decision task: <code>CompleteWorkflowExecution</code>, <code>FailWorkflowExecution</code>, <code>CancelWorkflowExecution</code> and <code>ContinueAsNewWorkflowExecution</code>. An UnhandledDecision fault will be returned if a workflow closing decision is specified and a signal or activity event had been added to the history while the decision task was being performed by the decider. Unlike the above situations which are logic issues, this fault is always possible because of race conditions in a distributed system. The right action here is to call <a>RespondDecisionTaskCompleted</a> without any decisions. This would result in another decision task with these new events included in the history. The decider should handle the new events and may decide to close the workflow execution.</note> <p><b>How to code a decision</b></p> <p>You code a decision by first setting the decision type field to one of the above decision values, and then set the corresponding attributes field shown below:</p> <ul> <li> <a>ScheduleActivityTaskDecisionAttributes</a> </li> <li> <a>ScheduleLambdaFunctionDecisionAttributes</a> </li> <li> <a>RequestCancelActivityTaskDecisionAttributes</a> </li> <li> <a>CompleteWorkflowExecutionDecisionAttributes</a> </li> <li> <a>FailWorkflowExecutionDecisionAttributes</a> </li> <li> <a>CancelWorkflowExecutionDecisionAttributes</a> </li> <li> <a>ContinueAsNewWorkflowExecutionDecisionAttributes</a> </li> <li> <a>RecordMarkerDecisionAttributes</a> </li> <li> <a>StartTimerDecisionAttributes</a> </li> <li> <a>CancelTimerDecisionAttributes</a> </li> <li> <a>SignalExternalWorkflowExecutionDecisionAttributes</a> </li> <li> <a>RequestCancelExternalWorkflowExecutionDecisionAttributes</a> </li> <li> <a>StartChildWorkflowExecutionDecisionAttributes</a> </li> </ul>
   */
  @js.native
  trait Decision extends js.Object {
    var startTimerDecisionAttributes: StartTimerDecisionAttributes
    var decisionType: DecisionType
    var requestCancelActivityTaskDecisionAttributes: RequestCancelActivityTaskDecisionAttributes
    var signalExternalWorkflowExecutionDecisionAttributes: SignalExternalWorkflowExecutionDecisionAttributes
    var completeWorkflowExecutionDecisionAttributes: CompleteWorkflowExecutionDecisionAttributes
    var recordMarkerDecisionAttributes: RecordMarkerDecisionAttributes
    var startChildWorkflowExecutionDecisionAttributes: StartChildWorkflowExecutionDecisionAttributes
    var scheduleActivityTaskDecisionAttributes: ScheduleActivityTaskDecisionAttributes
    var requestCancelExternalWorkflowExecutionDecisionAttributes: RequestCancelExternalWorkflowExecutionDecisionAttributes
    var cancelWorkflowExecutionDecisionAttributes: CancelWorkflowExecutionDecisionAttributes
    var cancelTimerDecisionAttributes: CancelTimerDecisionAttributes
    var failWorkflowExecutionDecisionAttributes: FailWorkflowExecutionDecisionAttributes
    var scheduleLambdaFunctionDecisionAttributes: ScheduleLambdaFunctionDecisionAttributes
    var continueAsNewWorkflowExecutionDecisionAttributes: ContinueAsNewWorkflowExecutionDecisionAttributes
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
      continueAsNewWorkflowExecutionDecisionAttributes: js.UndefOr[ContinueAsNewWorkflowExecutionDecisionAttributes] = js.undefined
    ): Decision = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("startTimerDecisionAttributes" -> startTimerDecisionAttributes.map { x => x: js.Any }),
        ("decisionType" -> decisionType.map { x => x: js.Any }),
        ("requestCancelActivityTaskDecisionAttributes" -> requestCancelActivityTaskDecisionAttributes.map { x => x: js.Any }),
        ("signalExternalWorkflowExecutionDecisionAttributes" -> signalExternalWorkflowExecutionDecisionAttributes.map { x => x: js.Any }),
        ("completeWorkflowExecutionDecisionAttributes" -> completeWorkflowExecutionDecisionAttributes.map { x => x: js.Any }),
        ("recordMarkerDecisionAttributes" -> recordMarkerDecisionAttributes.map { x => x: js.Any }),
        ("startChildWorkflowExecutionDecisionAttributes" -> startChildWorkflowExecutionDecisionAttributes.map { x => x: js.Any }),
        ("scheduleActivityTaskDecisionAttributes" -> scheduleActivityTaskDecisionAttributes.map { x => x: js.Any }),
        ("requestCancelExternalWorkflowExecutionDecisionAttributes" -> requestCancelExternalWorkflowExecutionDecisionAttributes.map { x => x: js.Any }),
        ("cancelWorkflowExecutionDecisionAttributes" -> cancelWorkflowExecutionDecisionAttributes.map { x => x: js.Any }),
        ("cancelTimerDecisionAttributes" -> cancelTimerDecisionAttributes.map { x => x: js.Any }),
        ("failWorkflowExecutionDecisionAttributes" -> failWorkflowExecutionDecisionAttributes.map { x => x: js.Any }),
        ("scheduleLambdaFunctionDecisionAttributes" -> scheduleLambdaFunctionDecisionAttributes.map { x => x: js.Any }),
        ("continueAsNewWorkflowExecutionDecisionAttributes" -> continueAsNewWorkflowExecutionDecisionAttributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Decision]
    }
  }

  /**
   * <p>A structure that represents a decision task. Decision tasks are sent to deciders in order for them to make decisions.</p>
   */
  @js.native
  trait DecisionTask extends js.Object {
    var previousStartedEventId: EventId
    var workflowType: WorkflowType
    var nextPageToken: PageToken
    var workflowExecution: WorkflowExecution
    var taskToken: TaskToken
    var startedEventId: EventId
    var events: HistoryEventList
  }

  object DecisionTask {
    def apply(
      previousStartedEventId: js.UndefOr[EventId] = js.undefined,
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      workflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      taskToken: js.UndefOr[TaskToken] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined,
      events: js.UndefOr[HistoryEventList] = js.undefined
    ): DecisionTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("previousStartedEventId" -> previousStartedEventId.map { x => x: js.Any }),
        ("workflowType" -> workflowType.map { x => x: js.Any }),
        ("nextPageToken" -> nextPageToken.map { x => x: js.Any }),
        ("workflowExecution" -> workflowExecution.map { x => x: js.Any }),
        ("taskToken" -> taskToken.map { x => x: js.Any }),
        ("startedEventId" -> startedEventId.map { x => x: js.Any }),
        ("events" -> events.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecisionTask]
    }
  }

  /**
   * <p>Provides details of the <code>DecisionTaskCompleted</code> event.</p>
   */
  @js.native
  trait DecisionTaskCompletedEventAttributes extends js.Object {
    var executionContext: Data
    var scheduledEventId: EventId
    var startedEventId: EventId
  }

  object DecisionTaskCompletedEventAttributes {
    def apply(
      executionContext: js.UndefOr[Data] = js.undefined,
      scheduledEventId: js.UndefOr[EventId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined
    ): DecisionTaskCompletedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("executionContext" -> executionContext.map { x => x: js.Any }),
        ("scheduledEventId" -> scheduledEventId.map { x => x: js.Any }),
        ("startedEventId" -> startedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecisionTaskCompletedEventAttributes]
    }
  }

  /**
   * <p>Provides details about the <code>DecisionTaskScheduled</code> event.</p>
   */
  @js.native
  trait DecisionTaskScheduledEventAttributes extends js.Object {
    var taskList: TaskList
    var taskPriority: TaskPriority
    var startToCloseTimeout: DurationInSecondsOptional
  }

  object DecisionTaskScheduledEventAttributes {
    def apply(
      taskList: js.UndefOr[TaskList] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined,
      startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    ): DecisionTaskScheduledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskList" -> taskList.map { x => x: js.Any }),
        ("taskPriority" -> taskPriority.map { x => x: js.Any }),
        ("startToCloseTimeout" -> startToCloseTimeout.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecisionTaskScheduledEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>DecisionTaskStarted</code> event.</p>
   */
  @js.native
  trait DecisionTaskStartedEventAttributes extends js.Object {
    var identity: Identity
    var scheduledEventId: EventId
  }

  object DecisionTaskStartedEventAttributes {
    def apply(
      identity: js.UndefOr[Identity] = js.undefined,
      scheduledEventId: js.UndefOr[EventId] = js.undefined
    ): DecisionTaskStartedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("identity" -> identity.map { x => x: js.Any }),
        ("scheduledEventId" -> scheduledEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecisionTaskStartedEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>DecisionTaskTimedOut</code> event.</p>
   */
  @js.native
  trait DecisionTaskTimedOutEventAttributes extends js.Object {
    var timeoutType: DecisionTaskTimeoutType
    var scheduledEventId: EventId
    var startedEventId: EventId
  }

  object DecisionTaskTimedOutEventAttributes {
    def apply(
      timeoutType: js.UndefOr[DecisionTaskTimeoutType] = js.undefined,
      scheduledEventId: js.UndefOr[EventId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined
    ): DecisionTaskTimedOutEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("timeoutType" -> timeoutType.map { x => x: js.Any }),
        ("scheduledEventId" -> scheduledEventId.map { x => x: js.Any }),
        ("startedEventId" -> startedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecisionTaskTimedOutEventAttributes]
    }
  }


  object DecisionTaskTimeoutTypeEnum {
    val `START_TO_CLOSE` = "START_TO_CLOSE"

    val values = IndexedSeq(`START_TO_CLOSE`)
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

  @js.native
  trait DefaultUndefinedFaultException extends js.Object {
    var message: ErrorMessage
  }

  @js.native
  trait DeprecateActivityTypeInput extends js.Object {
    var domain: DomainName
    var activityType: ActivityType
  }

  object DeprecateActivityTypeInput {
    def apply(
      domain: js.UndefOr[DomainName] = js.undefined,
      activityType: js.UndefOr[ActivityType] = js.undefined
    ): DeprecateActivityTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("domain" -> domain.map { x => x: js.Any }),
        ("activityType" -> activityType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeprecateActivityTypeInput]
    }
  }

  @js.native
  trait DeprecateDomainInput extends js.Object {
    var name: DomainName
  }

  object DeprecateDomainInput {
    def apply(
      name: js.UndefOr[DomainName] = js.undefined
    ): DeprecateDomainInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      domain: js.UndefOr[DomainName] = js.undefined,
      workflowType: js.UndefOr[WorkflowType] = js.undefined
    ): DeprecateWorkflowTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("domain" -> domain.map { x => x: js.Any }),
        ("workflowType" -> workflowType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeprecateWorkflowTypeInput]
    }
  }

  @js.native
  trait DescribeActivityTypeInput extends js.Object {
    var domain: DomainName
    var activityType: ActivityType
  }

  object DescribeActivityTypeInput {
    def apply(
      domain: js.UndefOr[DomainName] = js.undefined,
      activityType: js.UndefOr[ActivityType] = js.undefined
    ): DescribeActivityTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("domain" -> domain.map { x => x: js.Any }),
        ("activityType" -> activityType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeActivityTypeInput]
    }
  }

  @js.native
  trait DescribeDomainInput extends js.Object {
    var name: DomainName
  }

  object DescribeDomainInput {
    def apply(
      name: js.UndefOr[DomainName] = js.undefined
    ): DescribeDomainInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      domain: js.UndefOr[DomainName] = js.undefined,
      execution: js.UndefOr[WorkflowExecution] = js.undefined
    ): DescribeWorkflowExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("domain" -> domain.map { x => x: js.Any }),
        ("execution" -> execution.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      domain: js.UndefOr[DomainName] = js.undefined,
      workflowType: js.UndefOr[WorkflowType] = js.undefined
    ): DescribeWorkflowTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("domain" -> domain.map { x => x: js.Any }),
        ("workflowType" -> workflowType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkflowTypeInput]
    }
  }

  /**
   * <p>Returned if the specified domain already exists. You will get this fault even if the existing domain is in deprecated status.</p>
   */
  @js.native
  trait DomainAlreadyExistsFaultException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>Contains the configuration settings of a domain.</p>
   */
  @js.native
  trait DomainConfiguration extends js.Object {
    var workflowExecutionRetentionPeriodInDays: DurationInDays
  }

  object DomainConfiguration {
    def apply(
      workflowExecutionRetentionPeriodInDays: js.UndefOr[DurationInDays] = js.undefined
    ): DomainConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowExecutionRetentionPeriodInDays" -> workflowExecutionRetentionPeriodInDays.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainConfiguration]
    }
  }

  /**
   * <p>Returned when the specified domain has been deprecated.</p>
   */
  @js.native
  trait DomainDeprecatedFaultException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>Contains details of a domain.</p>
   */
  @js.native
  trait DomainDetail extends js.Object {
    var domainInfo: DomainInfo
    var configuration: DomainConfiguration
  }

  object DomainDetail {
    def apply(
      domainInfo: js.UndefOr[DomainInfo] = js.undefined,
      configuration: js.UndefOr[DomainConfiguration] = js.undefined
    ): DomainDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("domainInfo" -> domainInfo.map { x => x: js.Any }),
        ("configuration" -> configuration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainDetail]
    }
  }

  /**
   * <p>Contains general information about a domain.</p>
   */
  @js.native
  trait DomainInfo extends js.Object {
    var name: DomainName
    var status: RegistrationStatus
    var description: Description
  }

  object DomainInfo {
    def apply(
      name: js.UndefOr[DomainName] = js.undefined,
      status: js.UndefOr[RegistrationStatus] = js.undefined,
      description: js.UndefOr[Description] = js.undefined
    ): DomainInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("description" -> description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainInfo]
    }
  }

  /**
   * <p>Contains a paginated collection of DomainInfo structures.</p>
   */
  @js.native
  trait DomainInfos extends js.Object {
    var domainInfos: DomainInfoList
    var nextPageToken: PageToken
  }

  object DomainInfos {
    def apply(
      domainInfos: js.UndefOr[DomainInfoList] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined
    ): DomainInfos = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("domainInfos" -> domainInfos.map { x => x: js.Any }),
        ("nextPageToken" -> nextPageToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
   * <p>Used to filter the workflow executions in visibility APIs by various time-based rules. Each parameter, if specified, defines a rule that must be satisfied by each returned query result. The parameter values are in the <a href="https://en.wikipedia.org/wiki/Unix_time">Unix Time format</a>. For example: <code>"oldestDate": 1325376070.</code></p>
   */
  @js.native
  trait ExecutionTimeFilter extends js.Object {
    var oldestDate: Timestamp
    var latestDate: Timestamp
  }

  object ExecutionTimeFilter {
    def apply(
      oldestDate: js.UndefOr[Timestamp] = js.undefined,
      latestDate: js.UndefOr[Timestamp] = js.undefined
    ): ExecutionTimeFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("oldestDate" -> oldestDate.map { x => x: js.Any }),
        ("latestDate" -> latestDate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecutionTimeFilter]
    }
  }

  /**
   * <p>Provides details of the <code>ExternalWorkflowExecutionCancelRequested</code> event.</p>
   */
  @js.native
  trait ExternalWorkflowExecutionCancelRequestedEventAttributes extends js.Object {
    var workflowExecution: WorkflowExecution
    var initiatedEventId: EventId
  }

  object ExternalWorkflowExecutionCancelRequestedEventAttributes {
    def apply(
      workflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      initiatedEventId: js.UndefOr[EventId] = js.undefined
    ): ExternalWorkflowExecutionCancelRequestedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowExecution" -> workflowExecution.map { x => x: js.Any }),
        ("initiatedEventId" -> initiatedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExternalWorkflowExecutionCancelRequestedEventAttributes]
    }
  }

  /**
   * <p> Provides details of the <code>ExternalWorkflowExecutionSignaled</code> event.</p>
   */
  @js.native
  trait ExternalWorkflowExecutionSignaledEventAttributes extends js.Object {
    var workflowExecution: WorkflowExecution
    var initiatedEventId: EventId
  }

  object ExternalWorkflowExecutionSignaledEventAttributes {
    def apply(
      workflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      initiatedEventId: js.UndefOr[EventId] = js.undefined
    ): ExternalWorkflowExecutionSignaledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowExecution" -> workflowExecution.map { x => x: js.Any }),
        ("initiatedEventId" -> initiatedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExternalWorkflowExecutionSignaledEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>FailWorkflowExecution</code> decision.</p> <p><b>Access Control</b></p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li> <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li> <li>You cannot use an IAM policy to constrain this action's parameters.</li> </ul> <p>If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a>.</p>
   */
  @js.native
  trait FailWorkflowExecutionDecisionAttributes extends js.Object {
    var reason: FailureReason
    var details: Data
  }

  object FailWorkflowExecutionDecisionAttributes {
    def apply(
      reason: js.UndefOr[FailureReason] = js.undefined,
      details: js.UndefOr[Data] = js.undefined
    ): FailWorkflowExecutionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("reason" -> reason.map { x => x: js.Any }),
        ("details" -> details.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailWorkflowExecutionDecisionAttributes]
    }
  }


  object FailWorkflowExecutionFailedCauseEnum {
    val `UNHANDLED_DECISION` = "UNHANDLED_DECISION"
    val `OPERATION_NOT_PERMITTED` = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(`UNHANDLED_DECISION`, `OPERATION_NOT_PERMITTED`)
  }

  /**
   * <p>Provides details of the <code>FailWorkflowExecutionFailed</code> event.</p>
   */
  @js.native
  trait FailWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: FailWorkflowExecutionFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  object FailWorkflowExecutionFailedEventAttributes {
    def apply(
      cause: js.UndefOr[FailWorkflowExecutionFailedCause] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined
    ): FailWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("cause" -> cause.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailWorkflowExecutionFailedEventAttributes]
    }
  }

  @js.native
  trait GetWorkflowExecutionHistoryInput extends js.Object {
    var execution: WorkflowExecution
    var reverseOrder: ReverseOrder
    var nextPageToken: PageToken
    var domain: DomainName
    var maximumPageSize: PageSize
  }

  object GetWorkflowExecutionHistoryInput {
    def apply(
      execution: js.UndefOr[WorkflowExecution] = js.undefined,
      reverseOrder: js.UndefOr[ReverseOrder] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      domain: js.UndefOr[DomainName] = js.undefined,
      maximumPageSize: js.UndefOr[PageSize] = js.undefined
    ): GetWorkflowExecutionHistoryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("execution" -> execution.map { x => x: js.Any }),
        ("reverseOrder" -> reverseOrder.map { x => x: js.Any }),
        ("nextPageToken" -> nextPageToken.map { x => x: js.Any }),
        ("domain" -> domain.map { x => x: js.Any }),
        ("maximumPageSize" -> maximumPageSize.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetWorkflowExecutionHistoryInput]
    }
  }

  /**
   * <p>Paginated representation of a workflow history for a workflow execution. This is the up to date, complete and authoritative record of the events related to all tasks and events in the life of the workflow execution.</p>
   */
  @js.native
  trait History extends js.Object {
    var events: HistoryEventList
    var nextPageToken: PageToken
  }

  object History {
    def apply(
      events: js.UndefOr[HistoryEventList] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined
    ): History = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("events" -> events.map { x => x: js.Any }),
        ("nextPageToken" -> nextPageToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[History]
    }
  }

  /**
   * <p>Event within a workflow execution. A history event can be one of these types:</p> <ul> <li> <b>WorkflowExecutionStarted</b>: The workflow execution was started.</li> <li> <b>WorkflowExecutionCompleted</b>: The workflow execution was closed due to successful completion.</li> <li> <b>WorkflowExecutionFailed</b>: The workflow execution closed due to a failure.</li> <li> <b>WorkflowExecutionTimedOut</b>: The workflow execution was closed because a time out was exceeded.</li> <li> <b>WorkflowExecutionCanceled</b>: The workflow execution was successfully canceled and closed.</li> <li> <b>WorkflowExecutionTerminated</b>: The workflow execution was terminated.</li> <li> <b>WorkflowExecutionContinuedAsNew</b>: The workflow execution was closed and a new execution of the same type was created with the same workflowId.</li> <li> <b>WorkflowExecutionCancelRequested</b>: A request to cancel this workflow execution was made.</li> <li> <b>DecisionTaskScheduled</b>: A decision task was scheduled for the workflow execution.</li> <li> <b>DecisionTaskStarted</b>: The decision task was dispatched to a decider.</li> <li> <b>DecisionTaskCompleted</b>: The decider successfully completed a decision task by calling <a>RespondDecisionTaskCompleted</a>.</li> <li> <b>DecisionTaskTimedOut</b>: The decision task timed out.</li> <li> <b>ActivityTaskScheduled</b>: An activity task was scheduled for execution.</li> <li> <b>ScheduleActivityTaskFailed</b>: Failed to process ScheduleActivityTask decision. This happens when the decision is not configured properly, for example the activity type specified is not registered.</li> <li> <b>ActivityTaskStarted</b>: The scheduled activity task was dispatched to a worker.</li> <li> <b>ActivityTaskCompleted</b>: An activity worker successfully completed an activity task by calling <a>RespondActivityTaskCompleted</a>.</li> <li> <b>ActivityTaskFailed</b>: An activity worker failed an activity task by calling <a>RespondActivityTaskFailed</a>.</li> <li> <b>ActivityTaskTimedOut</b>: The activity task timed out.</li> <li> <b>ActivityTaskCanceled</b>: The activity task was successfully canceled.</li> <li> <b>ActivityTaskCancelRequested</b>: A <code>RequestCancelActivityTask</code> decision was received by the system.</li> <li> <b>RequestCancelActivityTaskFailed</b>: Failed to process RequestCancelActivityTask decision. This happens when the decision is not configured properly.</li> <li> <b>WorkflowExecutionSignaled</b>: An external signal was received for the workflow execution.</li> <li> <b>MarkerRecorded</b>: A marker was recorded in the workflow history as the result of a <code>RecordMarker</code> decision.</li> <li> <b>TimerStarted</b>: A timer was started for the workflow execution due to a <code>StartTimer</code> decision.</li> <li> <b>StartTimerFailed</b>: Failed to process StartTimer decision. This happens when the decision is not configured properly, for example a timer already exists with the specified timer ID.</li> <li> <b>TimerFired</b>: A timer, previously started for this workflow execution, fired.</li> <li> <b>TimerCanceled</b>: A timer, previously started for this workflow execution, was successfully canceled.</li> <li> <b>CancelTimerFailed</b>: Failed to process CancelTimer decision. This happens when the decision is not configured properly, for example no timer exists with the specified timer ID.</li> <li> <b>StartChildWorkflowExecutionInitiated</b>: A request was made to start a child workflow execution.</li> <li> <b>StartChildWorkflowExecutionFailed</b>: Failed to process StartChildWorkflowExecution decision. This happens when the decision is not configured properly, for example the workflow type specified is not registered.</li> <li> <b>ChildWorkflowExecutionStarted</b>: A child workflow execution was successfully started.</li> <li> <b>ChildWorkflowExecutionCompleted</b>: A child workflow execution, started by this workflow execution, completed successfully and was closed.</li> <li> <b>ChildWorkflowExecutionFailed</b>: A child workflow execution, started by this workflow execution, failed to complete successfully and was closed.</li> <li> <b>ChildWorkflowExecutionTimedOut</b>: A child workflow execution, started by this workflow execution, timed out and was closed.</li> <li> <b>ChildWorkflowExecutionCanceled</b>: A child workflow execution, started by this workflow execution, was canceled and closed.</li> <li> <b>ChildWorkflowExecutionTerminated</b>: A child workflow execution, started by this workflow execution, was terminated.</li> <li> <b>SignalExternalWorkflowExecutionInitiated</b>: A request to signal an external workflow was made.</li> <li> <b>ExternalWorkflowExecutionSignaled</b>: A signal, requested by this workflow execution, was successfully delivered to the target external workflow execution.</li> <li> <b>SignalExternalWorkflowExecutionFailed</b>: The request to signal an external workflow execution failed.</li> <li> <b>RequestCancelExternalWorkflowExecutionInitiated</b>: A request was made to request the cancellation of an external workflow execution.</li> <li> <b>ExternalWorkflowExecutionCancelRequested</b>: Request to cancel an external workflow execution was successfully delivered to the target execution.</li> <li> <b>RequestCancelExternalWorkflowExecutionFailed</b>: Request to cancel an external workflow execution failed.</li> <li> <b>LambdaFunctionScheduled</b>: An AWS Lambda function was scheduled for execution.</li> <li> <b>LambdaFunctionStarted</b>: The scheduled function was invoked in the AWS Lambda service.</li> <li> <b>LambdaFunctionCompleted</b>: The AWS Lambda function successfully completed.</li> <li> <b>LambdaFunctionFailed</b>: The AWS Lambda function execution failed.</li> <li> <b>LambdaFunctionTimedOut</b>: The AWS Lambda function execution timed out.</li> <li> <b>ScheduleLambdaFunctionFailed</b>: Failed to process ScheduleLambdaFunction decision. This happens when the workflow execution does not have the proper IAM role attached to invoke AWS Lambda functions.</li> <li> <b>StartLambdaFunctionFailed</b>: Failed to invoke the scheduled function in the AWS Lambda service. This happens when the AWS Lambda service is not available in the current region, or received too many requests.</li> </ul>
   */
  @js.native
  trait HistoryEvent extends js.Object {
    var workflowExecutionFailedEventAttributes: WorkflowExecutionFailedEventAttributes
    var decisionTaskCompletedEventAttributes: DecisionTaskCompletedEventAttributes
    var scheduleActivityTaskFailedEventAttributes: ScheduleActivityTaskFailedEventAttributes
    var eventType: EventType
    var requestCancelActivityTaskFailedEventAttributes: RequestCancelActivityTaskFailedEventAttributes
    var workflowExecutionSignaledEventAttributes: WorkflowExecutionSignaledEventAttributes
    var startLambdaFunctionFailedEventAttributes: StartLambdaFunctionFailedEventAttributes
    var activityTaskScheduledEventAttributes: ActivityTaskScheduledEventAttributes
    var workflowExecutionContinuedAsNewEventAttributes: WorkflowExecutionContinuedAsNewEventAttributes
    var timerStartedEventAttributes: TimerStartedEventAttributes
    var workflowExecutionCompletedEventAttributes: WorkflowExecutionCompletedEventAttributes
    var decisionTaskScheduledEventAttributes: DecisionTaskScheduledEventAttributes
    var scheduleLambdaFunctionFailedEventAttributes: ScheduleLambdaFunctionFailedEventAttributes
    var lambdaFunctionStartedEventAttributes: LambdaFunctionStartedEventAttributes
    var timerCanceledEventAttributes: TimerCanceledEventAttributes
    var requestCancelExternalWorkflowExecutionInitiatedEventAttributes: RequestCancelExternalWorkflowExecutionInitiatedEventAttributes
    var childWorkflowExecutionTimedOutEventAttributes: ChildWorkflowExecutionTimedOutEventAttributes
    var startChildWorkflowExecutionInitiatedEventAttributes: StartChildWorkflowExecutionInitiatedEventAttributes
    var workflowExecutionTimedOutEventAttributes: WorkflowExecutionTimedOutEventAttributes
    var childWorkflowExecutionFailedEventAttributes: ChildWorkflowExecutionFailedEventAttributes
    var externalWorkflowExecutionSignaledEventAttributes: ExternalWorkflowExecutionSignaledEventAttributes
    var decisionTaskTimedOutEventAttributes: DecisionTaskTimedOutEventAttributes
    var lambdaFunctionScheduledEventAttributes: LambdaFunctionScheduledEventAttributes
    var signalExternalWorkflowExecutionFailedEventAttributes: SignalExternalWorkflowExecutionFailedEventAttributes
    var requestCancelExternalWorkflowExecutionFailedEventAttributes: RequestCancelExternalWorkflowExecutionFailedEventAttributes
    var lambdaFunctionTimedOutEventAttributes: LambdaFunctionTimedOutEventAttributes
    var activityTaskCompletedEventAttributes: ActivityTaskCompletedEventAttributes
    var workflowExecutionTerminatedEventAttributes: WorkflowExecutionTerminatedEventAttributes
    var eventId: EventId
    var cancelTimerFailedEventAttributes: CancelTimerFailedEventAttributes
    var workflowExecutionStartedEventAttributes: WorkflowExecutionStartedEventAttributes
    var childWorkflowExecutionCanceledEventAttributes: ChildWorkflowExecutionCanceledEventAttributes
    var timerFiredEventAttributes: TimerFiredEventAttributes
    var workflowExecutionCanceledEventAttributes: WorkflowExecutionCanceledEventAttributes
    var cancelWorkflowExecutionFailedEventAttributes: CancelWorkflowExecutionFailedEventAttributes
    var markerRecordedEventAttributes: MarkerRecordedEventAttributes
    var activityTaskTimedOutEventAttributes: ActivityTaskTimedOutEventAttributes
    var childWorkflowExecutionStartedEventAttributes: ChildWorkflowExecutionStartedEventAttributes
    var continueAsNewWorkflowExecutionFailedEventAttributes: ContinueAsNewWorkflowExecutionFailedEventAttributes
    var eventTimestamp: Timestamp
    var signalExternalWorkflowExecutionInitiatedEventAttributes: SignalExternalWorkflowExecutionInitiatedEventAttributes
    var activityTaskFailedEventAttributes: ActivityTaskFailedEventAttributes
    var activityTaskCanceledEventAttributes: ActivityTaskCanceledEventAttributes
    var childWorkflowExecutionTerminatedEventAttributes: ChildWorkflowExecutionTerminatedEventAttributes
    var activityTaskStartedEventAttributes: ActivityTaskStartedEventAttributes
    var decisionTaskStartedEventAttributes: DecisionTaskStartedEventAttributes
    var lambdaFunctionFailedEventAttributes: LambdaFunctionFailedEventAttributes
    var lambdaFunctionCompletedEventAttributes: LambdaFunctionCompletedEventAttributes
    var startChildWorkflowExecutionFailedEventAttributes: StartChildWorkflowExecutionFailedEventAttributes
    var failWorkflowExecutionFailedEventAttributes: FailWorkflowExecutionFailedEventAttributes
    var childWorkflowExecutionCompletedEventAttributes: ChildWorkflowExecutionCompletedEventAttributes
    var startTimerFailedEventAttributes: StartTimerFailedEventAttributes
    var activityTaskCancelRequestedEventAttributes: ActivityTaskCancelRequestedEventAttributes
    var completeWorkflowExecutionFailedEventAttributes: CompleteWorkflowExecutionFailedEventAttributes
    var workflowExecutionCancelRequestedEventAttributes: WorkflowExecutionCancelRequestedEventAttributes
    var externalWorkflowExecutionCancelRequestedEventAttributes: ExternalWorkflowExecutionCancelRequestedEventAttributes
    var recordMarkerFailedEventAttributes: RecordMarkerFailedEventAttributes
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
      recordMarkerFailedEventAttributes: js.UndefOr[RecordMarkerFailedEventAttributes] = js.undefined
    ): HistoryEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowExecutionFailedEventAttributes" -> workflowExecutionFailedEventAttributes.map { x => x: js.Any }),
        ("decisionTaskCompletedEventAttributes" -> decisionTaskCompletedEventAttributes.map { x => x: js.Any }),
        ("scheduleActivityTaskFailedEventAttributes" -> scheduleActivityTaskFailedEventAttributes.map { x => x: js.Any }),
        ("eventType" -> eventType.map { x => x: js.Any }),
        ("requestCancelActivityTaskFailedEventAttributes" -> requestCancelActivityTaskFailedEventAttributes.map { x => x: js.Any }),
        ("workflowExecutionSignaledEventAttributes" -> workflowExecutionSignaledEventAttributes.map { x => x: js.Any }),
        ("startLambdaFunctionFailedEventAttributes" -> startLambdaFunctionFailedEventAttributes.map { x => x: js.Any }),
        ("activityTaskScheduledEventAttributes" -> activityTaskScheduledEventAttributes.map { x => x: js.Any }),
        ("workflowExecutionContinuedAsNewEventAttributes" -> workflowExecutionContinuedAsNewEventAttributes.map { x => x: js.Any }),
        ("timerStartedEventAttributes" -> timerStartedEventAttributes.map { x => x: js.Any }),
        ("workflowExecutionCompletedEventAttributes" -> workflowExecutionCompletedEventAttributes.map { x => x: js.Any }),
        ("decisionTaskScheduledEventAttributes" -> decisionTaskScheduledEventAttributes.map { x => x: js.Any }),
        ("scheduleLambdaFunctionFailedEventAttributes" -> scheduleLambdaFunctionFailedEventAttributes.map { x => x: js.Any }),
        ("lambdaFunctionStartedEventAttributes" -> lambdaFunctionStartedEventAttributes.map { x => x: js.Any }),
        ("timerCanceledEventAttributes" -> timerCanceledEventAttributes.map { x => x: js.Any }),
        ("requestCancelExternalWorkflowExecutionInitiatedEventAttributes" -> requestCancelExternalWorkflowExecutionInitiatedEventAttributes.map { x => x: js.Any }),
        ("childWorkflowExecutionTimedOutEventAttributes" -> childWorkflowExecutionTimedOutEventAttributes.map { x => x: js.Any }),
        ("startChildWorkflowExecutionInitiatedEventAttributes" -> startChildWorkflowExecutionInitiatedEventAttributes.map { x => x: js.Any }),
        ("workflowExecutionTimedOutEventAttributes" -> workflowExecutionTimedOutEventAttributes.map { x => x: js.Any }),
        ("childWorkflowExecutionFailedEventAttributes" -> childWorkflowExecutionFailedEventAttributes.map { x => x: js.Any }),
        ("externalWorkflowExecutionSignaledEventAttributes" -> externalWorkflowExecutionSignaledEventAttributes.map { x => x: js.Any }),
        ("decisionTaskTimedOutEventAttributes" -> decisionTaskTimedOutEventAttributes.map { x => x: js.Any }),
        ("lambdaFunctionScheduledEventAttributes" -> lambdaFunctionScheduledEventAttributes.map { x => x: js.Any }),
        ("signalExternalWorkflowExecutionFailedEventAttributes" -> signalExternalWorkflowExecutionFailedEventAttributes.map { x => x: js.Any }),
        ("requestCancelExternalWorkflowExecutionFailedEventAttributes" -> requestCancelExternalWorkflowExecutionFailedEventAttributes.map { x => x: js.Any }),
        ("lambdaFunctionTimedOutEventAttributes" -> lambdaFunctionTimedOutEventAttributes.map { x => x: js.Any }),
        ("activityTaskCompletedEventAttributes" -> activityTaskCompletedEventAttributes.map { x => x: js.Any }),
        ("workflowExecutionTerminatedEventAttributes" -> workflowExecutionTerminatedEventAttributes.map { x => x: js.Any }),
        ("eventId" -> eventId.map { x => x: js.Any }),
        ("cancelTimerFailedEventAttributes" -> cancelTimerFailedEventAttributes.map { x => x: js.Any }),
        ("workflowExecutionStartedEventAttributes" -> workflowExecutionStartedEventAttributes.map { x => x: js.Any }),
        ("childWorkflowExecutionCanceledEventAttributes" -> childWorkflowExecutionCanceledEventAttributes.map { x => x: js.Any }),
        ("timerFiredEventAttributes" -> timerFiredEventAttributes.map { x => x: js.Any }),
        ("workflowExecutionCanceledEventAttributes" -> workflowExecutionCanceledEventAttributes.map { x => x: js.Any }),
        ("cancelWorkflowExecutionFailedEventAttributes" -> cancelWorkflowExecutionFailedEventAttributes.map { x => x: js.Any }),
        ("markerRecordedEventAttributes" -> markerRecordedEventAttributes.map { x => x: js.Any }),
        ("activityTaskTimedOutEventAttributes" -> activityTaskTimedOutEventAttributes.map { x => x: js.Any }),
        ("childWorkflowExecutionStartedEventAttributes" -> childWorkflowExecutionStartedEventAttributes.map { x => x: js.Any }),
        ("continueAsNewWorkflowExecutionFailedEventAttributes" -> continueAsNewWorkflowExecutionFailedEventAttributes.map { x => x: js.Any }),
        ("eventTimestamp" -> eventTimestamp.map { x => x: js.Any }),
        ("signalExternalWorkflowExecutionInitiatedEventAttributes" -> signalExternalWorkflowExecutionInitiatedEventAttributes.map { x => x: js.Any }),
        ("activityTaskFailedEventAttributes" -> activityTaskFailedEventAttributes.map { x => x: js.Any }),
        ("activityTaskCanceledEventAttributes" -> activityTaskCanceledEventAttributes.map { x => x: js.Any }),
        ("childWorkflowExecutionTerminatedEventAttributes" -> childWorkflowExecutionTerminatedEventAttributes.map { x => x: js.Any }),
        ("activityTaskStartedEventAttributes" -> activityTaskStartedEventAttributes.map { x => x: js.Any }),
        ("decisionTaskStartedEventAttributes" -> decisionTaskStartedEventAttributes.map { x => x: js.Any }),
        ("lambdaFunctionFailedEventAttributes" -> lambdaFunctionFailedEventAttributes.map { x => x: js.Any }),
        ("lambdaFunctionCompletedEventAttributes" -> lambdaFunctionCompletedEventAttributes.map { x => x: js.Any }),
        ("startChildWorkflowExecutionFailedEventAttributes" -> startChildWorkflowExecutionFailedEventAttributes.map { x => x: js.Any }),
        ("failWorkflowExecutionFailedEventAttributes" -> failWorkflowExecutionFailedEventAttributes.map { x => x: js.Any }),
        ("childWorkflowExecutionCompletedEventAttributes" -> childWorkflowExecutionCompletedEventAttributes.map { x => x: js.Any }),
        ("startTimerFailedEventAttributes" -> startTimerFailedEventAttributes.map { x => x: js.Any }),
        ("activityTaskCancelRequestedEventAttributes" -> activityTaskCancelRequestedEventAttributes.map { x => x: js.Any }),
        ("completeWorkflowExecutionFailedEventAttributes" -> completeWorkflowExecutionFailedEventAttributes.map { x => x: js.Any }),
        ("workflowExecutionCancelRequestedEventAttributes" -> workflowExecutionCancelRequestedEventAttributes.map { x => x: js.Any }),
        ("externalWorkflowExecutionCancelRequestedEventAttributes" -> externalWorkflowExecutionCancelRequestedEventAttributes.map { x => x: js.Any }),
        ("recordMarkerFailedEventAttributes" -> recordMarkerFailedEventAttributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HistoryEvent]
    }
  }

  /**
   * <p>Provides details for the <code>LambdaFunctionCompleted</code> event.</p>
   */
  @js.native
  trait LambdaFunctionCompletedEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var result: Data
  }

  object LambdaFunctionCompletedEventAttributes {
    def apply(
      scheduledEventId: js.UndefOr[EventId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined,
      result: js.UndefOr[Data] = js.undefined
    ): LambdaFunctionCompletedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("scheduledEventId" -> scheduledEventId.map { x => x: js.Any }),
        ("startedEventId" -> startedEventId.map { x => x: js.Any }),
        ("result" -> result.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionCompletedEventAttributes]
    }
  }

  /**
   * <p>Provides details for the <code>LambdaFunctionFailed</code> event.</p>
   */
  @js.native
  trait LambdaFunctionFailedEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var reason: FailureReason
    var details: Data
  }

  object LambdaFunctionFailedEventAttributes {
    def apply(
      scheduledEventId: js.UndefOr[EventId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined,
      reason: js.UndefOr[FailureReason] = js.undefined,
      details: js.UndefOr[Data] = js.undefined
    ): LambdaFunctionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("scheduledEventId" -> scheduledEventId.map { x => x: js.Any }),
        ("startedEventId" -> startedEventId.map { x => x: js.Any }),
        ("reason" -> reason.map { x => x: js.Any }),
        ("details" -> details.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionFailedEventAttributes]
    }
  }

  /**
   * <p>Provides details for the <code>LambdaFunctionScheduled</code> event.</p>
   */
  @js.native
  trait LambdaFunctionScheduledEventAttributes extends js.Object {
    var name: FunctionName
    var startToCloseTimeout: DurationInSecondsOptional
    var decisionTaskCompletedEventId: EventId
    var id: FunctionId
    var input: FunctionInput
  }

  object LambdaFunctionScheduledEventAttributes {
    def apply(
      name: js.UndefOr[FunctionName] = js.undefined,
      startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined,
      id: js.UndefOr[FunctionId] = js.undefined,
      input: js.UndefOr[FunctionInput] = js.undefined
    ): LambdaFunctionScheduledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("startToCloseTimeout" -> startToCloseTimeout.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any }),
        ("id" -> id.map { x => x: js.Any }),
        ("input" -> input.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionScheduledEventAttributes]
    }
  }

  /**
   * <p>Provides details for the <code>LambdaFunctionStarted</code> event.</p>
   */
  @js.native
  trait LambdaFunctionStartedEventAttributes extends js.Object {
    var scheduledEventId: EventId
  }

  object LambdaFunctionStartedEventAttributes {
    def apply(
      scheduledEventId: js.UndefOr[EventId] = js.undefined
    ): LambdaFunctionStartedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("scheduledEventId" -> scheduledEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionStartedEventAttributes]
    }
  }

  /**
   * <p>Provides details for the <code>LambdaFunctionTimedOut</code> event.</p>
   */
  @js.native
  trait LambdaFunctionTimedOutEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var timeoutType: LambdaFunctionTimeoutType
  }

  object LambdaFunctionTimedOutEventAttributes {
    def apply(
      scheduledEventId: js.UndefOr[EventId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined,
      timeoutType: js.UndefOr[LambdaFunctionTimeoutType] = js.undefined
    ): LambdaFunctionTimedOutEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("scheduledEventId" -> scheduledEventId.map { x => x: js.Any }),
        ("startedEventId" -> startedEventId.map { x => x: js.Any }),
        ("timeoutType" -> timeoutType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaFunctionTimedOutEventAttributes]
    }
  }


  object LambdaFunctionTimeoutTypeEnum {
    val `START_TO_CLOSE` = "START_TO_CLOSE"

    val values = IndexedSeq(`START_TO_CLOSE`)
  }

  /**
   * <p>Returned by any operation if a system imposed limitation has been reached. To address this fault you should either clean up unused resources or increase the limit by contacting AWS.</p>
   */
  @js.native
  trait LimitExceededFaultException extends js.Object {
    var message: ErrorMessage
  }

  @js.native
  trait ListActivityTypesInput extends js.Object {
    var name: Name
    var reverseOrder: ReverseOrder
    var nextPageToken: PageToken
    var domain: DomainName
    var registrationStatus: RegistrationStatus
    var maximumPageSize: PageSize
  }

  object ListActivityTypesInput {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      reverseOrder: js.UndefOr[ReverseOrder] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      domain: js.UndefOr[DomainName] = js.undefined,
      registrationStatus: js.UndefOr[RegistrationStatus] = js.undefined,
      maximumPageSize: js.UndefOr[PageSize] = js.undefined
    ): ListActivityTypesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("reverseOrder" -> reverseOrder.map { x => x: js.Any }),
        ("nextPageToken" -> nextPageToken.map { x => x: js.Any }),
        ("domain" -> domain.map { x => x: js.Any }),
        ("registrationStatus" -> registrationStatus.map { x => x: js.Any }),
        ("maximumPageSize" -> maximumPageSize.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListActivityTypesInput]
    }
  }

  @js.native
  trait ListClosedWorkflowExecutionsInput extends js.Object {
    var executionFilter: WorkflowExecutionFilter
    var startTimeFilter: ExecutionTimeFilter
    var reverseOrder: ReverseOrder
    var nextPageToken: PageToken
    var domain: DomainName
    var closeStatusFilter: CloseStatusFilter
    var closeTimeFilter: ExecutionTimeFilter
    var typeFilter: WorkflowTypeFilter
    var tagFilter: TagFilter
    var maximumPageSize: PageSize
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
      maximumPageSize: js.UndefOr[PageSize] = js.undefined
    ): ListClosedWorkflowExecutionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("executionFilter" -> executionFilter.map { x => x: js.Any }),
        ("startTimeFilter" -> startTimeFilter.map { x => x: js.Any }),
        ("reverseOrder" -> reverseOrder.map { x => x: js.Any }),
        ("nextPageToken" -> nextPageToken.map { x => x: js.Any }),
        ("domain" -> domain.map { x => x: js.Any }),
        ("closeStatusFilter" -> closeStatusFilter.map { x => x: js.Any }),
        ("closeTimeFilter" -> closeTimeFilter.map { x => x: js.Any }),
        ("typeFilter" -> typeFilter.map { x => x: js.Any }),
        ("tagFilter" -> tagFilter.map { x => x: js.Any }),
        ("maximumPageSize" -> maximumPageSize.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClosedWorkflowExecutionsInput]
    }
  }

  @js.native
  trait ListDomainsInput extends js.Object {
    var nextPageToken: PageToken
    var registrationStatus: RegistrationStatus
    var maximumPageSize: PageSize
    var reverseOrder: ReverseOrder
  }

  object ListDomainsInput {
    def apply(
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      registrationStatus: js.UndefOr[RegistrationStatus] = js.undefined,
      maximumPageSize: js.UndefOr[PageSize] = js.undefined,
      reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
    ): ListDomainsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("nextPageToken" -> nextPageToken.map { x => x: js.Any }),
        ("registrationStatus" -> registrationStatus.map { x => x: js.Any }),
        ("maximumPageSize" -> maximumPageSize.map { x => x: js.Any }),
        ("reverseOrder" -> reverseOrder.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDomainsInput]
    }
  }

  @js.native
  trait ListOpenWorkflowExecutionsInput extends js.Object {
    var executionFilter: WorkflowExecutionFilter
    var startTimeFilter: ExecutionTimeFilter
    var reverseOrder: ReverseOrder
    var nextPageToken: PageToken
    var domain: DomainName
    var typeFilter: WorkflowTypeFilter
    var tagFilter: TagFilter
    var maximumPageSize: PageSize
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
      maximumPageSize: js.UndefOr[PageSize] = js.undefined
    ): ListOpenWorkflowExecutionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("executionFilter" -> executionFilter.map { x => x: js.Any }),
        ("startTimeFilter" -> startTimeFilter.map { x => x: js.Any }),
        ("reverseOrder" -> reverseOrder.map { x => x: js.Any }),
        ("nextPageToken" -> nextPageToken.map { x => x: js.Any }),
        ("domain" -> domain.map { x => x: js.Any }),
        ("typeFilter" -> typeFilter.map { x => x: js.Any }),
        ("tagFilter" -> tagFilter.map { x => x: js.Any }),
        ("maximumPageSize" -> maximumPageSize.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOpenWorkflowExecutionsInput]
    }
  }

  @js.native
  trait ListWorkflowTypesInput extends js.Object {
    var name: Name
    var reverseOrder: ReverseOrder
    var nextPageToken: PageToken
    var domain: DomainName
    var registrationStatus: RegistrationStatus
    var maximumPageSize: PageSize
  }

  object ListWorkflowTypesInput {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      reverseOrder: js.UndefOr[ReverseOrder] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      domain: js.UndefOr[DomainName] = js.undefined,
      registrationStatus: js.UndefOr[RegistrationStatus] = js.undefined,
      maximumPageSize: js.UndefOr[PageSize] = js.undefined
    ): ListWorkflowTypesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("reverseOrder" -> reverseOrder.map { x => x: js.Any }),
        ("nextPageToken" -> nextPageToken.map { x => x: js.Any }),
        ("domain" -> domain.map { x => x: js.Any }),
        ("registrationStatus" -> registrationStatus.map { x => x: js.Any }),
        ("maximumPageSize" -> maximumPageSize.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListWorkflowTypesInput]
    }
  }

  /**
   * <p>Provides details of the <code>MarkerRecorded</code> event.</p>
   */
  @js.native
  trait MarkerRecordedEventAttributes extends js.Object {
    var markerName: MarkerName
    var details: Data
    var decisionTaskCompletedEventId: EventId
  }

  object MarkerRecordedEventAttributes {
    def apply(
      markerName: js.UndefOr[MarkerName] = js.undefined,
      details: js.UndefOr[Data] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined
    ): MarkerRecordedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("markerName" -> markerName.map { x => x: js.Any }),
        ("details" -> details.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MarkerRecordedEventAttributes]
    }
  }

  /**
   * <p>Returned when the caller does not have sufficient permissions to invoke the action.</p>
   */
  @js.native
  trait OperationNotPermittedFaultException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>Contains the count of tasks in a task list.</p>
   */
  @js.native
  trait PendingTaskCount extends js.Object {
    var count: Count
    var truncated: Truncated
  }

  object PendingTaskCount {
    def apply(
      count: js.UndefOr[Count] = js.undefined,
      truncated: js.UndefOr[Truncated] = js.undefined
    ): PendingTaskCount = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("count" -> count.map { x => x: js.Any }),
        ("truncated" -> truncated.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingTaskCount]
    }
  }

  @js.native
  trait PollForActivityTaskInput extends js.Object {
    var domain: DomainName
    var taskList: TaskList
    var identity: Identity
  }

  object PollForActivityTaskInput {
    def apply(
      domain: js.UndefOr[DomainName] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined,
      identity: js.UndefOr[Identity] = js.undefined
    ): PollForActivityTaskInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("domain" -> domain.map { x => x: js.Any }),
        ("taskList" -> taskList.map { x => x: js.Any }),
        ("identity" -> identity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PollForActivityTaskInput]
    }
  }

  @js.native
  trait PollForDecisionTaskInput extends js.Object {
    var reverseOrder: ReverseOrder
    var nextPageToken: PageToken
    var domain: DomainName
    var taskList: TaskList
    var identity: Identity
    var maximumPageSize: PageSize
  }

  object PollForDecisionTaskInput {
    def apply(
      reverseOrder: js.UndefOr[ReverseOrder] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined,
      domain: js.UndefOr[DomainName] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined,
      identity: js.UndefOr[Identity] = js.undefined,
      maximumPageSize: js.UndefOr[PageSize] = js.undefined
    ): PollForDecisionTaskInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("reverseOrder" -> reverseOrder.map { x => x: js.Any }),
        ("nextPageToken" -> nextPageToken.map { x => x: js.Any }),
        ("domain" -> domain.map { x => x: js.Any }),
        ("taskList" -> taskList.map { x => x: js.Any }),
        ("identity" -> identity.map { x => x: js.Any }),
        ("maximumPageSize" -> maximumPageSize.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PollForDecisionTaskInput]
    }
  }

  @js.native
  trait RecordActivityTaskHeartbeatInput extends js.Object {
    var taskToken: TaskToken
    var details: LimitedData
  }

  object RecordActivityTaskHeartbeatInput {
    def apply(
      taskToken: js.UndefOr[TaskToken] = js.undefined,
      details: js.UndefOr[LimitedData] = js.undefined
    ): RecordActivityTaskHeartbeatInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskToken" -> taskToken.map { x => x: js.Any }),
        ("details" -> details.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordActivityTaskHeartbeatInput]
    }
  }

  /**
   * <p>Provides details of the <code>RecordMarker</code> decision.</p> <p><b>Access Control</b></p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li> <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li> <li>You cannot use an IAM policy to constrain this action's parameters.</li> </ul> <p>If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a>.</p>
   */
  @js.native
  trait RecordMarkerDecisionAttributes extends js.Object {
    var markerName: MarkerName
    var details: Data
  }

  object RecordMarkerDecisionAttributes {
    def apply(
      markerName: js.UndefOr[MarkerName] = js.undefined,
      details: js.UndefOr[Data] = js.undefined
    ): RecordMarkerDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("markerName" -> markerName.map { x => x: js.Any }),
        ("details" -> details.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordMarkerDecisionAttributes]
    }
  }


  object RecordMarkerFailedCauseEnum {
    val `OPERATION_NOT_PERMITTED` = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(`OPERATION_NOT_PERMITTED`)
  }

  /**
   * <p>Provides details of the <code>RecordMarkerFailed</code> event.</p>
   */
  @js.native
  trait RecordMarkerFailedEventAttributes extends js.Object {
    var markerName: MarkerName
    var cause: RecordMarkerFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  object RecordMarkerFailedEventAttributes {
    def apply(
      markerName: js.UndefOr[MarkerName] = js.undefined,
      cause: js.UndefOr[RecordMarkerFailedCause] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined
    ): RecordMarkerFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("markerName" -> markerName.map { x => x: js.Any }),
        ("cause" -> cause.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordMarkerFailedEventAttributes]
    }
  }

  @js.native
  trait RegisterActivityTypeInput extends js.Object {
    var defaultTaskStartToCloseTimeout: DurationInSecondsOptional
    var name: Name
    var defaultTaskScheduleToStartTimeout: DurationInSecondsOptional
    var defaultTaskList: TaskList
    var description: Description
    var domain: DomainName
    var defaultTaskScheduleToCloseTimeout: DurationInSecondsOptional
    var defaultTaskHeartbeatTimeout: DurationInSecondsOptional
    var version: Version
    var defaultTaskPriority: TaskPriority
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
      defaultTaskPriority: js.UndefOr[TaskPriority] = js.undefined
    ): RegisterActivityTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("defaultTaskStartToCloseTimeout" -> defaultTaskStartToCloseTimeout.map { x => x: js.Any }),
        ("name" -> name.map { x => x: js.Any }),
        ("defaultTaskScheduleToStartTimeout" -> defaultTaskScheduleToStartTimeout.map { x => x: js.Any }),
        ("defaultTaskList" -> defaultTaskList.map { x => x: js.Any }),
        ("description" -> description.map { x => x: js.Any }),
        ("domain" -> domain.map { x => x: js.Any }),
        ("defaultTaskScheduleToCloseTimeout" -> defaultTaskScheduleToCloseTimeout.map { x => x: js.Any }),
        ("defaultTaskHeartbeatTimeout" -> defaultTaskHeartbeatTimeout.map { x => x: js.Any }),
        ("version" -> version.map { x => x: js.Any }),
        ("defaultTaskPriority" -> defaultTaskPriority.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterActivityTypeInput]
    }
  }

  @js.native
  trait RegisterDomainInput extends js.Object {
    var name: DomainName
    var description: Description
    var workflowExecutionRetentionPeriodInDays: DurationInDays
  }

  object RegisterDomainInput {
    def apply(
      name: js.UndefOr[DomainName] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      workflowExecutionRetentionPeriodInDays: js.UndefOr[DurationInDays] = js.undefined
    ): RegisterDomainInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("description" -> description.map { x => x: js.Any }),
        ("workflowExecutionRetentionPeriodInDays" -> workflowExecutionRetentionPeriodInDays.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterDomainInput]
    }
  }

  @js.native
  trait RegisterWorkflowTypeInput extends js.Object {
    var defaultTaskStartToCloseTimeout: DurationInSecondsOptional
    var name: Name
    var defaultTaskList: TaskList
    var description: Description
    var domain: DomainName
    var defaultLambdaRole: Arn
    var version: Version
    var defaultChildPolicy: ChildPolicy
    var defaultTaskPriority: TaskPriority
    var defaultExecutionStartToCloseTimeout: DurationInSecondsOptional
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
      defaultExecutionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    ): RegisterWorkflowTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("defaultTaskStartToCloseTimeout" -> defaultTaskStartToCloseTimeout.map { x => x: js.Any }),
        ("name" -> name.map { x => x: js.Any }),
        ("defaultTaskList" -> defaultTaskList.map { x => x: js.Any }),
        ("description" -> description.map { x => x: js.Any }),
        ("domain" -> domain.map { x => x: js.Any }),
        ("defaultLambdaRole" -> defaultLambdaRole.map { x => x: js.Any }),
        ("version" -> version.map { x => x: js.Any }),
        ("defaultChildPolicy" -> defaultChildPolicy.map { x => x: js.Any }),
        ("defaultTaskPriority" -> defaultTaskPriority.map { x => x: js.Any }),
        ("defaultExecutionStartToCloseTimeout" -> defaultExecutionStartToCloseTimeout.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterWorkflowTypeInput]
    }
  }


  object RegistrationStatusEnum {
    val REGISTERED = "REGISTERED"
    val DEPRECATED = "DEPRECATED"

    val values = IndexedSeq(REGISTERED, DEPRECATED)
  }

  /**
   * <p>Provides details of the <code>RequestCancelActivityTask</code> decision.</p> <p><b>Access Control</b></p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li> <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li> <li>You cannot use an IAM policy to constrain this action's parameters.</li> </ul> <p>If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a>.</p>
   */
  @js.native
  trait RequestCancelActivityTaskDecisionAttributes extends js.Object {
    var activityId: ActivityId
  }

  object RequestCancelActivityTaskDecisionAttributes {
    def apply(
      activityId: js.UndefOr[ActivityId] = js.undefined
    ): RequestCancelActivityTaskDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("activityId" -> activityId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestCancelActivityTaskDecisionAttributes]
    }
  }


  object RequestCancelActivityTaskFailedCauseEnum {
    val `ACTIVITY_ID_UNKNOWN` = "ACTIVITY_ID_UNKNOWN"
    val `OPERATION_NOT_PERMITTED` = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(`ACTIVITY_ID_UNKNOWN`, `OPERATION_NOT_PERMITTED`)
  }

  /**
   * <p>Provides details of the <code>RequestCancelActivityTaskFailed</code> event.</p>
   */
  @js.native
  trait RequestCancelActivityTaskFailedEventAttributes extends js.Object {
    var activityId: ActivityId
    var cause: RequestCancelActivityTaskFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  object RequestCancelActivityTaskFailedEventAttributes {
    def apply(
      activityId: js.UndefOr[ActivityId] = js.undefined,
      cause: js.UndefOr[RequestCancelActivityTaskFailedCause] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined
    ): RequestCancelActivityTaskFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("activityId" -> activityId.map { x => x: js.Any }),
        ("cause" -> cause.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestCancelActivityTaskFailedEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>RequestCancelExternalWorkflowExecution</code> decision.</p> <p><b>Access Control</b></p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li> <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li> <li>You cannot use an IAM policy to constrain this action's parameters.</li> </ul> <p>If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a>.</p>
   */
  @js.native
  trait RequestCancelExternalWorkflowExecutionDecisionAttributes extends js.Object {
    var workflowId: WorkflowId
    var runId: RunIdOptional
    var control: Data
  }

  object RequestCancelExternalWorkflowExecutionDecisionAttributes {
    def apply(
      workflowId: js.UndefOr[WorkflowId] = js.undefined,
      runId: js.UndefOr[RunIdOptional] = js.undefined,
      control: js.UndefOr[Data] = js.undefined
    ): RequestCancelExternalWorkflowExecutionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowId" -> workflowId.map { x => x: js.Any }),
        ("runId" -> runId.map { x => x: js.Any }),
        ("control" -> control.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestCancelExternalWorkflowExecutionDecisionAttributes]
    }
  }


  object RequestCancelExternalWorkflowExecutionFailedCauseEnum {
    val `UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION` = "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION"
    val `REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED` = "REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED"
    val `OPERATION_NOT_PERMITTED` = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(`UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION`, `REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED`, `OPERATION_NOT_PERMITTED`)
  }

  /**
   * <p>Provides details of the <code>RequestCancelExternalWorkflowExecutionFailed</code> event.</p>
   */
  @js.native
  trait RequestCancelExternalWorkflowExecutionFailedEventAttributes extends js.Object {
    var initiatedEventId: EventId
    var decisionTaskCompletedEventId: EventId
    var cause: RequestCancelExternalWorkflowExecutionFailedCause
    var control: Data
    var runId: RunIdOptional
    var workflowId: WorkflowId
  }

  object RequestCancelExternalWorkflowExecutionFailedEventAttributes {
    def apply(
      initiatedEventId: js.UndefOr[EventId] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined,
      cause: js.UndefOr[RequestCancelExternalWorkflowExecutionFailedCause] = js.undefined,
      control: js.UndefOr[Data] = js.undefined,
      runId: js.UndefOr[RunIdOptional] = js.undefined,
      workflowId: js.UndefOr[WorkflowId] = js.undefined
    ): RequestCancelExternalWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("initiatedEventId" -> initiatedEventId.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any }),
        ("cause" -> cause.map { x => x: js.Any }),
        ("control" -> control.map { x => x: js.Any }),
        ("runId" -> runId.map { x => x: js.Any }),
        ("workflowId" -> workflowId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestCancelExternalWorkflowExecutionFailedEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>RequestCancelExternalWorkflowExecutionInitiated</code> event.</p>
   */
  @js.native
  trait RequestCancelExternalWorkflowExecutionInitiatedEventAttributes extends js.Object {
    var workflowId: WorkflowId
    var runId: RunIdOptional
    var decisionTaskCompletedEventId: EventId
    var control: Data
  }

  object RequestCancelExternalWorkflowExecutionInitiatedEventAttributes {
    def apply(
      workflowId: js.UndefOr[WorkflowId] = js.undefined,
      runId: js.UndefOr[RunIdOptional] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined,
      control: js.UndefOr[Data] = js.undefined
    ): RequestCancelExternalWorkflowExecutionInitiatedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowId" -> workflowId.map { x => x: js.Any }),
        ("runId" -> runId.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any }),
        ("control" -> control.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestCancelExternalWorkflowExecutionInitiatedEventAttributes]
    }
  }

  @js.native
  trait RequestCancelWorkflowExecutionInput extends js.Object {
    var domain: DomainName
    var workflowId: WorkflowId
    var runId: RunIdOptional
  }

  object RequestCancelWorkflowExecutionInput {
    def apply(
      domain: js.UndefOr[DomainName] = js.undefined,
      workflowId: js.UndefOr[WorkflowId] = js.undefined,
      runId: js.UndefOr[RunIdOptional] = js.undefined
    ): RequestCancelWorkflowExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("domain" -> domain.map { x => x: js.Any }),
        ("workflowId" -> workflowId.map { x => x: js.Any }),
        ("runId" -> runId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestCancelWorkflowExecutionInput]
    }
  }

  @js.native
  trait RespondActivityTaskCanceledInput extends js.Object {
    var taskToken: TaskToken
    var details: Data
  }

  object RespondActivityTaskCanceledInput {
    def apply(
      taskToken: js.UndefOr[TaskToken] = js.undefined,
      details: js.UndefOr[Data] = js.undefined
    ): RespondActivityTaskCanceledInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskToken" -> taskToken.map { x => x: js.Any }),
        ("details" -> details.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RespondActivityTaskCanceledInput]
    }
  }

  @js.native
  trait RespondActivityTaskCompletedInput extends js.Object {
    var taskToken: TaskToken
    var result: Data
  }

  object RespondActivityTaskCompletedInput {
    def apply(
      taskToken: js.UndefOr[TaskToken] = js.undefined,
      result: js.UndefOr[Data] = js.undefined
    ): RespondActivityTaskCompletedInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskToken" -> taskToken.map { x => x: js.Any }),
        ("result" -> result.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RespondActivityTaskCompletedInput]
    }
  }

  @js.native
  trait RespondActivityTaskFailedInput extends js.Object {
    var taskToken: TaskToken
    var reason: FailureReason
    var details: Data
  }

  object RespondActivityTaskFailedInput {
    def apply(
      taskToken: js.UndefOr[TaskToken] = js.undefined,
      reason: js.UndefOr[FailureReason] = js.undefined,
      details: js.UndefOr[Data] = js.undefined
    ): RespondActivityTaskFailedInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskToken" -> taskToken.map { x => x: js.Any }),
        ("reason" -> reason.map { x => x: js.Any }),
        ("details" -> details.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RespondActivityTaskFailedInput]
    }
  }

  @js.native
  trait RespondDecisionTaskCompletedInput extends js.Object {
    var taskToken: TaskToken
    var decisions: DecisionList
    var executionContext: Data
  }

  object RespondDecisionTaskCompletedInput {
    def apply(
      taskToken: js.UndefOr[TaskToken] = js.undefined,
      decisions: js.UndefOr[DecisionList] = js.undefined,
      executionContext: js.UndefOr[Data] = js.undefined
    ): RespondDecisionTaskCompletedInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskToken" -> taskToken.map { x => x: js.Any }),
        ("decisions" -> decisions.map { x => x: js.Any }),
        ("executionContext" -> executionContext.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RespondDecisionTaskCompletedInput]
    }
  }

  /**
   * <p>Specifies the <code>runId</code> of a workflow execution.</p>
   */
  @js.native
  trait Run extends js.Object {
    var runId: RunId
  }

  object Run {
    def apply(
      runId: js.UndefOr[RunId] = js.undefined
    ): Run = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("runId" -> runId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Run]
    }
  }

  /**
   * <p>Provides details of the <code>ScheduleActivityTask</code> decision.</p> <p><b>Access Control</b></p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li> <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li> <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys. <ul> <li><code>activityType.name</code>: String constraint. The key is <code>swf:activityType.name</code>.</li> <li><code>activityType.version</code>: String constraint. The key is <code>swf:activityType.version</code>.</li> <li><code>taskList</code>: String constraint. The key is <code>swf:taskList.name</code>.</li> </ul> </li> </ul> <p>If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a>.</p>
   */
  @js.native
  trait ScheduleActivityTaskDecisionAttributes extends js.Object {
    var scheduleToStartTimeout: DurationInSecondsOptional
    var heartbeatTimeout: DurationInSecondsOptional
    var startToCloseTimeout: DurationInSecondsOptional
    var taskList: TaskList
    var activityId: ActivityId
    var activityType: ActivityType
    var taskPriority: TaskPriority
    var control: Data
    var scheduleToCloseTimeout: DurationInSecondsOptional
    var input: Data
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
      input: js.UndefOr[Data] = js.undefined
    ): ScheduleActivityTaskDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("scheduleToStartTimeout" -> scheduleToStartTimeout.map { x => x: js.Any }),
        ("heartbeatTimeout" -> heartbeatTimeout.map { x => x: js.Any }),
        ("startToCloseTimeout" -> startToCloseTimeout.map { x => x: js.Any }),
        ("taskList" -> taskList.map { x => x: js.Any }),
        ("activityId" -> activityId.map { x => x: js.Any }),
        ("activityType" -> activityType.map { x => x: js.Any }),
        ("taskPriority" -> taskPriority.map { x => x: js.Any }),
        ("control" -> control.map { x => x: js.Any }),
        ("scheduleToCloseTimeout" -> scheduleToCloseTimeout.map { x => x: js.Any }),
        ("input" -> input.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleActivityTaskDecisionAttributes]
    }
  }


  object ScheduleActivityTaskFailedCauseEnum {
    val `ACTIVITY_TYPE_DEPRECATED` = "ACTIVITY_TYPE_DEPRECATED"
    val `ACTIVITY_TYPE_DOES_NOT_EXIST` = "ACTIVITY_TYPE_DOES_NOT_EXIST"
    val `ACTIVITY_ID_ALREADY_IN_USE` = "ACTIVITY_ID_ALREADY_IN_USE"
    val `OPEN_ACTIVITIES_LIMIT_EXCEEDED` = "OPEN_ACTIVITIES_LIMIT_EXCEEDED"
    val `ACTIVITY_CREATION_RATE_EXCEEDED` = "ACTIVITY_CREATION_RATE_EXCEEDED"
    val `DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED` = "DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED"
    val `DEFAULT_TASK_LIST_UNDEFINED` = "DEFAULT_TASK_LIST_UNDEFINED"
    val `DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED` = "DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED"
    val `DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED` = "DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED"
    val `DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED` = "DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED"
    val `OPERATION_NOT_PERMITTED` = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(`ACTIVITY_TYPE_DEPRECATED`, `ACTIVITY_TYPE_DOES_NOT_EXIST`, `ACTIVITY_ID_ALREADY_IN_USE`, `OPEN_ACTIVITIES_LIMIT_EXCEEDED`, `ACTIVITY_CREATION_RATE_EXCEEDED`, `DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED`, `DEFAULT_TASK_LIST_UNDEFINED`, `DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED`, `DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED`, `DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED`, `OPERATION_NOT_PERMITTED`)
  }

  /**
   * <p>Provides details of the <code>ScheduleActivityTaskFailed</code> event.</p>
   */
  @js.native
  trait ScheduleActivityTaskFailedEventAttributes extends js.Object {
    var activityType: ActivityType
    var activityId: ActivityId
    var cause: ScheduleActivityTaskFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  object ScheduleActivityTaskFailedEventAttributes {
    def apply(
      activityType: js.UndefOr[ActivityType] = js.undefined,
      activityId: js.UndefOr[ActivityId] = js.undefined,
      cause: js.UndefOr[ScheduleActivityTaskFailedCause] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined
    ): ScheduleActivityTaskFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("activityType" -> activityType.map { x => x: js.Any }),
        ("activityId" -> activityId.map { x => x: js.Any }),
        ("cause" -> cause.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleActivityTaskFailedEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>ScheduleLambdaFunction</code> decision.</p> <p><b>Access Control</b></p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li> <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li> <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys. <ul> <li><code>activityType.name</code>: String constraint. The key is <code>swf:activityType.name</code>.</li> <li><code>activityType.version</code>: String constraint. The key is <code>swf:activityType.version</code>.</li> <li><code>taskList</code>: String constraint. The key is <code>swf:taskList.name</code>.</li> </ul> </li> </ul> <p>If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a>.</p>
   */
  @js.native
  trait ScheduleLambdaFunctionDecisionAttributes extends js.Object {
    var id: FunctionId
    var name: FunctionName
    var input: FunctionInput
    var startToCloseTimeout: DurationInSecondsOptional
  }

  object ScheduleLambdaFunctionDecisionAttributes {
    def apply(
      id: js.UndefOr[FunctionId] = js.undefined,
      name: js.UndefOr[FunctionName] = js.undefined,
      input: js.UndefOr[FunctionInput] = js.undefined,
      startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    ): ScheduleLambdaFunctionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("id" -> id.map { x => x: js.Any }),
        ("name" -> name.map { x => x: js.Any }),
        ("input" -> input.map { x => x: js.Any }),
        ("startToCloseTimeout" -> startToCloseTimeout.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleLambdaFunctionDecisionAttributes]
    }
  }


  object ScheduleLambdaFunctionFailedCauseEnum {
    val `ID_ALREADY_IN_USE` = "ID_ALREADY_IN_USE"
    val `OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED` = "OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED"
    val `LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED` = "LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED"
    val `LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION` = "LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION"

    val values = IndexedSeq(`ID_ALREADY_IN_USE`, `OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED`, `LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED`, `LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION`)
  }

  /**
   * <p>Provides details for the <code>ScheduleLambdaFunctionFailed</code> event.</p>
   */
  @js.native
  trait ScheduleLambdaFunctionFailedEventAttributes extends js.Object {
    var id: FunctionId
    var name: FunctionName
    var cause: ScheduleLambdaFunctionFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  object ScheduleLambdaFunctionFailedEventAttributes {
    def apply(
      id: js.UndefOr[FunctionId] = js.undefined,
      name: js.UndefOr[FunctionName] = js.undefined,
      cause: js.UndefOr[ScheduleLambdaFunctionFailedCause] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined
    ): ScheduleLambdaFunctionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("id" -> id.map { x => x: js.Any }),
        ("name" -> name.map { x => x: js.Any }),
        ("cause" -> cause.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleLambdaFunctionFailedEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>SignalExternalWorkflowExecution</code> decision.</p> <p><b>Access Control</b></p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li> <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li> <li>You cannot use an IAM policy to constrain this action's parameters.</li> </ul> <p>If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a>.</p>
   */
  @js.native
  trait SignalExternalWorkflowExecutionDecisionAttributes extends js.Object {
    var control: Data
    var signalName: SignalName
    var runId: RunIdOptional
    var workflowId: WorkflowId
    var input: Data
  }

  object SignalExternalWorkflowExecutionDecisionAttributes {
    def apply(
      control: js.UndefOr[Data] = js.undefined,
      signalName: js.UndefOr[SignalName] = js.undefined,
      runId: js.UndefOr[RunIdOptional] = js.undefined,
      workflowId: js.UndefOr[WorkflowId] = js.undefined,
      input: js.UndefOr[Data] = js.undefined
    ): SignalExternalWorkflowExecutionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("control" -> control.map { x => x: js.Any }),
        ("signalName" -> signalName.map { x => x: js.Any }),
        ("runId" -> runId.map { x => x: js.Any }),
        ("workflowId" -> workflowId.map { x => x: js.Any }),
        ("input" -> input.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignalExternalWorkflowExecutionDecisionAttributes]
    }
  }


  object SignalExternalWorkflowExecutionFailedCauseEnum {
    val `UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION` = "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION"
    val `SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED` = "SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED"
    val `OPERATION_NOT_PERMITTED` = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(`UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION`, `SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED`, `OPERATION_NOT_PERMITTED`)
  }

  /**
   * <p>Provides details of the <code>SignalExternalWorkflowExecutionFailed</code> event.</p>
   */
  @js.native
  trait SignalExternalWorkflowExecutionFailedEventAttributes extends js.Object {
    var initiatedEventId: EventId
    var decisionTaskCompletedEventId: EventId
    var cause: SignalExternalWorkflowExecutionFailedCause
    var control: Data
    var runId: RunIdOptional
    var workflowId: WorkflowId
  }

  object SignalExternalWorkflowExecutionFailedEventAttributes {
    def apply(
      initiatedEventId: js.UndefOr[EventId] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined,
      cause: js.UndefOr[SignalExternalWorkflowExecutionFailedCause] = js.undefined,
      control: js.UndefOr[Data] = js.undefined,
      runId: js.UndefOr[RunIdOptional] = js.undefined,
      workflowId: js.UndefOr[WorkflowId] = js.undefined
    ): SignalExternalWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("initiatedEventId" -> initiatedEventId.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any }),
        ("cause" -> cause.map { x => x: js.Any }),
        ("control" -> control.map { x => x: js.Any }),
        ("runId" -> runId.map { x => x: js.Any }),
        ("workflowId" -> workflowId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignalExternalWorkflowExecutionFailedEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>SignalExternalWorkflowExecutionInitiated</code> event.</p>
   */
  @js.native
  trait SignalExternalWorkflowExecutionInitiatedEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: EventId
    var control: Data
    var signalName: SignalName
    var runId: RunIdOptional
    var workflowId: WorkflowId
    var input: Data
  }

  object SignalExternalWorkflowExecutionInitiatedEventAttributes {
    def apply(
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined,
      control: js.UndefOr[Data] = js.undefined,
      signalName: js.UndefOr[SignalName] = js.undefined,
      runId: js.UndefOr[RunIdOptional] = js.undefined,
      workflowId: js.UndefOr[WorkflowId] = js.undefined,
      input: js.UndefOr[Data] = js.undefined
    ): SignalExternalWorkflowExecutionInitiatedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any }),
        ("control" -> control.map { x => x: js.Any }),
        ("signalName" -> signalName.map { x => x: js.Any }),
        ("runId" -> runId.map { x => x: js.Any }),
        ("workflowId" -> workflowId.map { x => x: js.Any }),
        ("input" -> input.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignalExternalWorkflowExecutionInitiatedEventAttributes]
    }
  }

  @js.native
  trait SignalWorkflowExecutionInput extends js.Object {
    var domain: DomainName
    var signalName: SignalName
    var runId: RunIdOptional
    var workflowId: WorkflowId
    var input: Data
  }

  object SignalWorkflowExecutionInput {
    def apply(
      domain: js.UndefOr[DomainName] = js.undefined,
      signalName: js.UndefOr[SignalName] = js.undefined,
      runId: js.UndefOr[RunIdOptional] = js.undefined,
      workflowId: js.UndefOr[WorkflowId] = js.undefined,
      input: js.UndefOr[Data] = js.undefined
    ): SignalWorkflowExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("domain" -> domain.map { x => x: js.Any }),
        ("signalName" -> signalName.map { x => x: js.Any }),
        ("runId" -> runId.map { x => x: js.Any }),
        ("workflowId" -> workflowId.map { x => x: js.Any }),
        ("input" -> input.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SignalWorkflowExecutionInput]
    }
  }

  /**
   * <p>Provides details of the <code>StartChildWorkflowExecution</code> decision.</p> <p><b>Access Control</b></p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li> <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li> <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys. <ul> <li> <code>tagList.member.N</code>: The key is "swf:tagList.N" where N is the tag number from 0 to 4, inclusive.</li> <li><code>taskList</code>: String constraint. The key is <code>swf:taskList.name</code>.</li> <li><code>workflowType.name</code>: String constraint. The key is <code>swf:workflowType.name</code>.</li> <li><code>workflowType.version</code>: String constraint. The key is <code>swf:workflowType.version</code>.</li> </ul> </li> </ul> <p>If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a>.</p>
   */
  @js.native
  trait StartChildWorkflowExecutionDecisionAttributes extends js.Object {
    var workflowType: WorkflowType
    var lambdaRole: Arn
    var taskList: TaskList
    var tagList: TagList
    var taskPriority: TaskPriority
    var taskStartToCloseTimeout: DurationInSecondsOptional
    var control: Data
    var childPolicy: ChildPolicy
    var executionStartToCloseTimeout: DurationInSecondsOptional
    var workflowId: WorkflowId
    var input: Data
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
      input: js.UndefOr[Data] = js.undefined
    ): StartChildWorkflowExecutionDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowType" -> workflowType.map { x => x: js.Any }),
        ("lambdaRole" -> lambdaRole.map { x => x: js.Any }),
        ("taskList" -> taskList.map { x => x: js.Any }),
        ("tagList" -> tagList.map { x => x: js.Any }),
        ("taskPriority" -> taskPriority.map { x => x: js.Any }),
        ("taskStartToCloseTimeout" -> taskStartToCloseTimeout.map { x => x: js.Any }),
        ("control" -> control.map { x => x: js.Any }),
        ("childPolicy" -> childPolicy.map { x => x: js.Any }),
        ("executionStartToCloseTimeout" -> executionStartToCloseTimeout.map { x => x: js.Any }),
        ("workflowId" -> workflowId.map { x => x: js.Any }),
        ("input" -> input.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartChildWorkflowExecutionDecisionAttributes]
    }
  }


  object StartChildWorkflowExecutionFailedCauseEnum {
    val `WORKFLOW_TYPE_DOES_NOT_EXIST` = "WORKFLOW_TYPE_DOES_NOT_EXIST"
    val `WORKFLOW_TYPE_DEPRECATED` = "WORKFLOW_TYPE_DEPRECATED"
    val `OPEN_CHILDREN_LIMIT_EXCEEDED` = "OPEN_CHILDREN_LIMIT_EXCEEDED"
    val `OPEN_WORKFLOWS_LIMIT_EXCEEDED` = "OPEN_WORKFLOWS_LIMIT_EXCEEDED"
    val `CHILD_CREATION_RATE_EXCEEDED` = "CHILD_CREATION_RATE_EXCEEDED"
    val `WORKFLOW_ALREADY_RUNNING` = "WORKFLOW_ALREADY_RUNNING"
    val `DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED` = "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED"
    val `DEFAULT_TASK_LIST_UNDEFINED` = "DEFAULT_TASK_LIST_UNDEFINED"
    val `DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED` = "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED"
    val `DEFAULT_CHILD_POLICY_UNDEFINED` = "DEFAULT_CHILD_POLICY_UNDEFINED"
    val `OPERATION_NOT_PERMITTED` = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(`WORKFLOW_TYPE_DOES_NOT_EXIST`, `WORKFLOW_TYPE_DEPRECATED`, `OPEN_CHILDREN_LIMIT_EXCEEDED`, `OPEN_WORKFLOWS_LIMIT_EXCEEDED`, `CHILD_CREATION_RATE_EXCEEDED`, `WORKFLOW_ALREADY_RUNNING`, `DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED`, `DEFAULT_TASK_LIST_UNDEFINED`, `DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED`, `DEFAULT_CHILD_POLICY_UNDEFINED`, `OPERATION_NOT_PERMITTED`)
  }

  /**
   * <p>Provides details of the <code>StartChildWorkflowExecutionFailed</code> event.</p>
   */
  @js.native
  trait StartChildWorkflowExecutionFailedEventAttributes extends js.Object {
    var workflowType: WorkflowType
    var initiatedEventId: EventId
    var decisionTaskCompletedEventId: EventId
    var cause: StartChildWorkflowExecutionFailedCause
    var control: Data
    var workflowId: WorkflowId
  }

  object StartChildWorkflowExecutionFailedEventAttributes {
    def apply(
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      initiatedEventId: js.UndefOr[EventId] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined,
      cause: js.UndefOr[StartChildWorkflowExecutionFailedCause] = js.undefined,
      control: js.UndefOr[Data] = js.undefined,
      workflowId: js.UndefOr[WorkflowId] = js.undefined
    ): StartChildWorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowType" -> workflowType.map { x => x: js.Any }),
        ("initiatedEventId" -> initiatedEventId.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any }),
        ("cause" -> cause.map { x => x: js.Any }),
        ("control" -> control.map { x => x: js.Any }),
        ("workflowId" -> workflowId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartChildWorkflowExecutionFailedEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>StartChildWorkflowExecutionInitiated</code> event.</p>
   */
  @js.native
  trait StartChildWorkflowExecutionInitiatedEventAttributes extends js.Object {
    var workflowType: WorkflowType
    var lambdaRole: Arn
    var taskList: TaskList
    var tagList: TagList
    var decisionTaskCompletedEventId: EventId
    var taskPriority: TaskPriority
    var taskStartToCloseTimeout: DurationInSecondsOptional
    var control: Data
    var childPolicy: ChildPolicy
    var executionStartToCloseTimeout: DurationInSecondsOptional
    var workflowId: WorkflowId
    var input: Data
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
      input: js.UndefOr[Data] = js.undefined
    ): StartChildWorkflowExecutionInitiatedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowType" -> workflowType.map { x => x: js.Any }),
        ("lambdaRole" -> lambdaRole.map { x => x: js.Any }),
        ("taskList" -> taskList.map { x => x: js.Any }),
        ("tagList" -> tagList.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any }),
        ("taskPriority" -> taskPriority.map { x => x: js.Any }),
        ("taskStartToCloseTimeout" -> taskStartToCloseTimeout.map { x => x: js.Any }),
        ("control" -> control.map { x => x: js.Any }),
        ("childPolicy" -> childPolicy.map { x => x: js.Any }),
        ("executionStartToCloseTimeout" -> executionStartToCloseTimeout.map { x => x: js.Any }),
        ("workflowId" -> workflowId.map { x => x: js.Any }),
        ("input" -> input.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartChildWorkflowExecutionInitiatedEventAttributes]
    }
  }


  object StartLambdaFunctionFailedCauseEnum {
    val `ASSUME_ROLE_FAILED` = "ASSUME_ROLE_FAILED"

    val values = IndexedSeq(`ASSUME_ROLE_FAILED`)
  }

  /**
   * <p>Provides details for the <code>StartLambdaFunctionFailed</code> event.</p>
   */
  @js.native
  trait StartLambdaFunctionFailedEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var cause: StartLambdaFunctionFailedCause
    var message: CauseMessage
  }

  object StartLambdaFunctionFailedEventAttributes {
    def apply(
      scheduledEventId: js.UndefOr[EventId] = js.undefined,
      cause: js.UndefOr[StartLambdaFunctionFailedCause] = js.undefined,
      message: js.UndefOr[CauseMessage] = js.undefined
    ): StartLambdaFunctionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("scheduledEventId" -> scheduledEventId.map { x => x: js.Any }),
        ("cause" -> cause.map { x => x: js.Any }),
        ("message" -> message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartLambdaFunctionFailedEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>StartTimer</code> decision.</p> <p><b>Access Control</b></p> <p>You can use IAM policies to control this decision's access to Amazon SWF resources as follows:</p> <ul> <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li> <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li> <li>You cannot use an IAM policy to constrain this action's parameters.</li> </ul> <p>If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to Amazon SWF Workflows</a>.</p>
   */
  @js.native
  trait StartTimerDecisionAttributes extends js.Object {
    var timerId: TimerId
    var control: Data
    var startToFireTimeout: DurationInSeconds
  }

  object StartTimerDecisionAttributes {
    def apply(
      timerId: js.UndefOr[TimerId] = js.undefined,
      control: js.UndefOr[Data] = js.undefined,
      startToFireTimeout: js.UndefOr[DurationInSeconds] = js.undefined
    ): StartTimerDecisionAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("timerId" -> timerId.map { x => x: js.Any }),
        ("control" -> control.map { x => x: js.Any }),
        ("startToFireTimeout" -> startToFireTimeout.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartTimerDecisionAttributes]
    }
  }


  object StartTimerFailedCauseEnum {
    val `TIMER_ID_ALREADY_IN_USE` = "TIMER_ID_ALREADY_IN_USE"
    val `OPEN_TIMERS_LIMIT_EXCEEDED` = "OPEN_TIMERS_LIMIT_EXCEEDED"
    val `TIMER_CREATION_RATE_EXCEEDED` = "TIMER_CREATION_RATE_EXCEEDED"
    val `OPERATION_NOT_PERMITTED` = "OPERATION_NOT_PERMITTED"

    val values = IndexedSeq(`TIMER_ID_ALREADY_IN_USE`, `OPEN_TIMERS_LIMIT_EXCEEDED`, `TIMER_CREATION_RATE_EXCEEDED`, `OPERATION_NOT_PERMITTED`)
  }

  /**
   * <p>Provides details of the <code>StartTimerFailed</code> event.</p>
   */
  @js.native
  trait StartTimerFailedEventAttributes extends js.Object {
    var timerId: TimerId
    var cause: StartTimerFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  object StartTimerFailedEventAttributes {
    def apply(
      timerId: js.UndefOr[TimerId] = js.undefined,
      cause: js.UndefOr[StartTimerFailedCause] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined
    ): StartTimerFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("timerId" -> timerId.map { x => x: js.Any }),
        ("cause" -> cause.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartTimerFailedEventAttributes]
    }
  }

  @js.native
  trait StartWorkflowExecutionInput extends js.Object {
    var workflowType: WorkflowType
    var domain: DomainName
    var lambdaRole: Arn
    var taskList: TaskList
    var tagList: TagList
    var taskPriority: TaskPriority
    var taskStartToCloseTimeout: DurationInSecondsOptional
    var childPolicy: ChildPolicy
    var executionStartToCloseTimeout: DurationInSecondsOptional
    var workflowId: WorkflowId
    var input: Data
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
      input: js.UndefOr[Data] = js.undefined
    ): StartWorkflowExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowType" -> workflowType.map { x => x: js.Any }),
        ("domain" -> domain.map { x => x: js.Any }),
        ("lambdaRole" -> lambdaRole.map { x => x: js.Any }),
        ("taskList" -> taskList.map { x => x: js.Any }),
        ("tagList" -> tagList.map { x => x: js.Any }),
        ("taskPriority" -> taskPriority.map { x => x: js.Any }),
        ("taskStartToCloseTimeout" -> taskStartToCloseTimeout.map { x => x: js.Any }),
        ("childPolicy" -> childPolicy.map { x => x: js.Any }),
        ("executionStartToCloseTimeout" -> executionStartToCloseTimeout.map { x => x: js.Any }),
        ("workflowId" -> workflowId.map { x => x: js.Any }),
        ("input" -> input.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartWorkflowExecutionInput]
    }
  }

  /**
   * <p>Used to filter the workflow executions in visibility APIs based on a tag.</p>
   */
  @js.native
  trait TagFilter extends js.Object {
    var tag: Tag
  }

  object TagFilter {
    def apply(
      tag: js.UndefOr[Tag] = js.undefined
    ): TagFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("tag" -> tag.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagFilter]
    }
  }

  /**
   * <p>Represents a task list.</p>
   */
  @js.native
  trait TaskList extends js.Object {
    var name: Name
  }

  object TaskList {
    def apply(
      name: js.UndefOr[Name] = js.undefined
    ): TaskList = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TaskList]
    }
  }

  @js.native
  trait TerminateWorkflowExecutionInput extends js.Object {
    var domain: DomainName
    var reason: TerminateReason
    var details: Data
    var childPolicy: ChildPolicy
    var runId: RunIdOptional
    var workflowId: WorkflowId
  }

  object TerminateWorkflowExecutionInput {
    def apply(
      domain: js.UndefOr[DomainName] = js.undefined,
      reason: js.UndefOr[TerminateReason] = js.undefined,
      details: js.UndefOr[Data] = js.undefined,
      childPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      runId: js.UndefOr[RunIdOptional] = js.undefined,
      workflowId: js.UndefOr[WorkflowId] = js.undefined
    ): TerminateWorkflowExecutionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("domain" -> domain.map { x => x: js.Any }),
        ("reason" -> reason.map { x => x: js.Any }),
        ("details" -> details.map { x => x: js.Any }),
        ("childPolicy" -> childPolicy.map { x => x: js.Any }),
        ("runId" -> runId.map { x => x: js.Any }),
        ("workflowId" -> workflowId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateWorkflowExecutionInput]
    }
  }

  /**
   * <p> Provides details of the <code>TimerCanceled</code> event. </p>
   */
  @js.native
  trait TimerCanceledEventAttributes extends js.Object {
    var timerId: TimerId
    var startedEventId: EventId
    var decisionTaskCompletedEventId: EventId
  }

  object TimerCanceledEventAttributes {
    def apply(
      timerId: js.UndefOr[TimerId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined
    ): TimerCanceledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("timerId" -> timerId.map { x => x: js.Any }),
        ("startedEventId" -> startedEventId.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimerCanceledEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>TimerFired</code> event.</p>
   */
  @js.native
  trait TimerFiredEventAttributes extends js.Object {
    var timerId: TimerId
    var startedEventId: EventId
  }

  object TimerFiredEventAttributes {
    def apply(
      timerId: js.UndefOr[TimerId] = js.undefined,
      startedEventId: js.UndefOr[EventId] = js.undefined
    ): TimerFiredEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("timerId" -> timerId.map { x => x: js.Any }),
        ("startedEventId" -> startedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimerFiredEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>TimerStarted</code> event.</p>
   */
  @js.native
  trait TimerStartedEventAttributes extends js.Object {
    var timerId: TimerId
    var control: Data
    var startToFireTimeout: DurationInSeconds
    var decisionTaskCompletedEventId: EventId
  }

  object TimerStartedEventAttributes {
    def apply(
      timerId: js.UndefOr[TimerId] = js.undefined,
      control: js.UndefOr[Data] = js.undefined,
      startToFireTimeout: js.UndefOr[DurationInSeconds] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined
    ): TimerStartedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("timerId" -> timerId.map { x => x: js.Any }),
        ("control" -> control.map { x => x: js.Any }),
        ("startToFireTimeout" -> startToFireTimeout.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimerStartedEventAttributes]
    }
  }

  /**
   * <p>Returned if the type already exists in the specified domain. You will get this fault even if the existing type is in deprecated status. You can specify another version if the intent is to create a new distinct version of the type.</p>
   */
  @js.native
  trait TypeAlreadyExistsFaultException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>Returned when the specified activity or workflow type was already deprecated.</p>
   */
  @js.native
  trait TypeDeprecatedFaultException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>Returned when the named resource cannot be found with in the scope of this operation (region or domain). This could happen if the named resource was never created or is no longer available for this operation.</p>
   */
  @js.native
  trait UnknownResourceFaultException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>Represents a workflow execution.</p>
   */
  @js.native
  trait WorkflowExecution extends js.Object {
    var workflowId: WorkflowId
    var runId: RunId
  }

  object WorkflowExecution {
    def apply(
      workflowId: js.UndefOr[WorkflowId] = js.undefined,
      runId: js.UndefOr[RunId] = js.undefined
    ): WorkflowExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowId" -> workflowId.map { x => x: js.Any }),
        ("runId" -> runId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecution]
    }
  }

  /**
   * <p>Returned by <a>StartWorkflowExecution</a> when an open execution with the same workflowId is already running in the specified domain.</p>
   */
  @js.native
  trait WorkflowExecutionAlreadyStartedFaultException extends js.Object {
    var message: ErrorMessage
  }


  object WorkflowExecutionCancelRequestedCauseEnum {
    val `CHILD_POLICY_APPLIED` = "CHILD_POLICY_APPLIED"

    val values = IndexedSeq(`CHILD_POLICY_APPLIED`)
  }

  /**
   * <p>Provides details of the <code>WorkflowExecutionCancelRequested</code> event.</p>
   */
  @js.native
  trait WorkflowExecutionCancelRequestedEventAttributes extends js.Object {
    var externalWorkflowExecution: WorkflowExecution
    var externalInitiatedEventId: EventId
    var cause: WorkflowExecutionCancelRequestedCause
  }

  object WorkflowExecutionCancelRequestedEventAttributes {
    def apply(
      externalWorkflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      externalInitiatedEventId: js.UndefOr[EventId] = js.undefined,
      cause: js.UndefOr[WorkflowExecutionCancelRequestedCause] = js.undefined
    ): WorkflowExecutionCancelRequestedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("externalWorkflowExecution" -> externalWorkflowExecution.map { x => x: js.Any }),
        ("externalInitiatedEventId" -> externalInitiatedEventId.map { x => x: js.Any }),
        ("cause" -> cause.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionCancelRequestedEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>WorkflowExecutionCanceled</code> event.</p>
   */
  @js.native
  trait WorkflowExecutionCanceledEventAttributes extends js.Object {
    var details: Data
    var decisionTaskCompletedEventId: EventId
  }

  object WorkflowExecutionCanceledEventAttributes {
    def apply(
      details: js.UndefOr[Data] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined
    ): WorkflowExecutionCanceledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("details" -> details.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionCanceledEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>WorkflowExecutionCompleted</code> event.</p>
   */
  @js.native
  trait WorkflowExecutionCompletedEventAttributes extends js.Object {
    var result: Data
    var decisionTaskCompletedEventId: EventId
  }

  object WorkflowExecutionCompletedEventAttributes {
    def apply(
      result: js.UndefOr[Data] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined
    ): WorkflowExecutionCompletedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("result" -> result.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionCompletedEventAttributes]
    }
  }

  /**
   * <p>The configuration settings for a workflow execution including timeout values, tasklist etc. These configuration settings are determined from the defaults specified when registering the workflow type and those specified when starting the workflow execution.</p>
   */
  @js.native
  trait WorkflowExecutionConfiguration extends js.Object {
    var lambdaRole: Arn
    var taskList: TaskList
    var taskPriority: TaskPriority
    var taskStartToCloseTimeout: DurationInSeconds
    var childPolicy: ChildPolicy
    var executionStartToCloseTimeout: DurationInSeconds
  }

  object WorkflowExecutionConfiguration {
    def apply(
      lambdaRole: js.UndefOr[Arn] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined,
      taskStartToCloseTimeout: js.UndefOr[DurationInSeconds] = js.undefined,
      childPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      executionStartToCloseTimeout: js.UndefOr[DurationInSeconds] = js.undefined
    ): WorkflowExecutionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("lambdaRole" -> lambdaRole.map { x => x: js.Any }),
        ("taskList" -> taskList.map { x => x: js.Any }),
        ("taskPriority" -> taskPriority.map { x => x: js.Any }),
        ("taskStartToCloseTimeout" -> taskStartToCloseTimeout.map { x => x: js.Any }),
        ("childPolicy" -> childPolicy.map { x => x: js.Any }),
        ("executionStartToCloseTimeout" -> executionStartToCloseTimeout.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionConfiguration]
    }
  }

  /**
   * <p>Provides details of the <code>WorkflowExecutionContinuedAsNew</code> event.</p>
   */
  @js.native
  trait WorkflowExecutionContinuedAsNewEventAttributes extends js.Object {
    var workflowType: WorkflowType
    var lambdaRole: Arn
    var taskList: TaskList
    var tagList: TagList
    var newExecutionRunId: RunId
    var decisionTaskCompletedEventId: EventId
    var taskPriority: TaskPriority
    var taskStartToCloseTimeout: DurationInSecondsOptional
    var childPolicy: ChildPolicy
    var executionStartToCloseTimeout: DurationInSecondsOptional
    var input: Data
  }

  object WorkflowExecutionContinuedAsNewEventAttributes {
    def apply(
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      lambdaRole: js.UndefOr[Arn] = js.undefined,
      taskList: js.UndefOr[TaskList] = js.undefined,
      tagList: js.UndefOr[TagList] = js.undefined,
      newExecutionRunId: js.UndefOr[RunId] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined,
      taskPriority: js.UndefOr[TaskPriority] = js.undefined,
      taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      childPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      input: js.UndefOr[Data] = js.undefined
    ): WorkflowExecutionContinuedAsNewEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowType" -> workflowType.map { x => x: js.Any }),
        ("lambdaRole" -> lambdaRole.map { x => x: js.Any }),
        ("taskList" -> taskList.map { x => x: js.Any }),
        ("tagList" -> tagList.map { x => x: js.Any }),
        ("newExecutionRunId" -> newExecutionRunId.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any }),
        ("taskPriority" -> taskPriority.map { x => x: js.Any }),
        ("taskStartToCloseTimeout" -> taskStartToCloseTimeout.map { x => x: js.Any }),
        ("childPolicy" -> childPolicy.map { x => x: js.Any }),
        ("executionStartToCloseTimeout" -> executionStartToCloseTimeout.map { x => x: js.Any }),
        ("input" -> input.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionContinuedAsNewEventAttributes]
    }
  }

  /**
   * <p>Contains the count of workflow executions returned from <a>CountOpenWorkflowExecutions</a> or <a>CountClosedWorkflowExecutions</a></p>
   */
  @js.native
  trait WorkflowExecutionCount extends js.Object {
    var count: Count
    var truncated: Truncated
  }

  object WorkflowExecutionCount {
    def apply(
      count: js.UndefOr[Count] = js.undefined,
      truncated: js.UndefOr[Truncated] = js.undefined
    ): WorkflowExecutionCount = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("count" -> count.map { x => x: js.Any }),
        ("truncated" -> truncated.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionCount]
    }
  }

  /**
   * <p>Contains details about a workflow execution.</p>
   */
  @js.native
  trait WorkflowExecutionDetail extends js.Object {
    var openCounts: WorkflowExecutionOpenCounts
    var latestActivityTaskTimestamp: Timestamp
    var latestExecutionContext: Data
    var executionInfo: WorkflowExecutionInfo
    var executionConfiguration: WorkflowExecutionConfiguration
  }

  object WorkflowExecutionDetail {
    def apply(
      openCounts: js.UndefOr[WorkflowExecutionOpenCounts] = js.undefined,
      latestActivityTaskTimestamp: js.UndefOr[Timestamp] = js.undefined,
      latestExecutionContext: js.UndefOr[Data] = js.undefined,
      executionInfo: js.UndefOr[WorkflowExecutionInfo] = js.undefined,
      executionConfiguration: js.UndefOr[WorkflowExecutionConfiguration] = js.undefined
    ): WorkflowExecutionDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("openCounts" -> openCounts.map { x => x: js.Any }),
        ("latestActivityTaskTimestamp" -> latestActivityTaskTimestamp.map { x => x: js.Any }),
        ("latestExecutionContext" -> latestExecutionContext.map { x => x: js.Any }),
        ("executionInfo" -> executionInfo.map { x => x: js.Any }),
        ("executionConfiguration" -> executionConfiguration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionDetail]
    }
  }

  /**
   * <p>Provides details of the <code>WorkflowExecutionFailed</code> event.</p>
   */
  @js.native
  trait WorkflowExecutionFailedEventAttributes extends js.Object {
    var reason: FailureReason
    var details: Data
    var decisionTaskCompletedEventId: EventId
  }

  object WorkflowExecutionFailedEventAttributes {
    def apply(
      reason: js.UndefOr[FailureReason] = js.undefined,
      details: js.UndefOr[Data] = js.undefined,
      decisionTaskCompletedEventId: js.UndefOr[EventId] = js.undefined
    ): WorkflowExecutionFailedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("reason" -> reason.map { x => x: js.Any }),
        ("details" -> details.map { x => x: js.Any }),
        ("decisionTaskCompletedEventId" -> decisionTaskCompletedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionFailedEventAttributes]
    }
  }

  /**
   * <p>Used to filter the workflow executions in visibility APIs by their <code>workflowId</code>.</p>
   */
  @js.native
  trait WorkflowExecutionFilter extends js.Object {
    var workflowId: WorkflowId
  }

  object WorkflowExecutionFilter {
    def apply(
      workflowId: js.UndefOr[WorkflowId] = js.undefined
    ): WorkflowExecutionFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowId" -> workflowId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionFilter]
    }
  }

  /**
   * <p>Contains information about a workflow execution. </p>
   */
  @js.native
  trait WorkflowExecutionInfo extends js.Object {
    var execution: WorkflowExecution
    var parent: WorkflowExecution
    var closeTimestamp: Timestamp
    var executionStatus: ExecutionStatus
    var workflowType: WorkflowType
    var closeStatus: CloseStatus
    var tagList: TagList
    var startTimestamp: Timestamp
    var cancelRequested: Canceled
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
      cancelRequested: js.UndefOr[Canceled] = js.undefined
    ): WorkflowExecutionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("execution" -> execution.map { x => x: js.Any }),
        ("parent" -> parent.map { x => x: js.Any }),
        ("closeTimestamp" -> closeTimestamp.map { x => x: js.Any }),
        ("executionStatus" -> executionStatus.map { x => x: js.Any }),
        ("workflowType" -> workflowType.map { x => x: js.Any }),
        ("closeStatus" -> closeStatus.map { x => x: js.Any }),
        ("tagList" -> tagList.map { x => x: js.Any }),
        ("startTimestamp" -> startTimestamp.map { x => x: js.Any }),
        ("cancelRequested" -> cancelRequested.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionInfo]
    }
  }

  /**
   * <p>Contains a paginated list of information about workflow executions.</p>
   */
  @js.native
  trait WorkflowExecutionInfos extends js.Object {
    var executionInfos: WorkflowExecutionInfoList
    var nextPageToken: PageToken
  }

  object WorkflowExecutionInfos {
    def apply(
      executionInfos: js.UndefOr[WorkflowExecutionInfoList] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined
    ): WorkflowExecutionInfos = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("executionInfos" -> executionInfos.map { x => x: js.Any }),
        ("nextPageToken" -> nextPageToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionInfos]
    }
  }

  /**
   * <p>Contains the counts of open tasks, child workflow executions and timers for a workflow execution.</p>
   */
  @js.native
  trait WorkflowExecutionOpenCounts extends js.Object {
    var openChildWorkflowExecutions: Count
    var openActivityTasks: Count
    var openLambdaFunctions: Count
    var openTimers: Count
    var openDecisionTasks: OpenDecisionTasksCount
  }

  object WorkflowExecutionOpenCounts {
    def apply(
      openChildWorkflowExecutions: js.UndefOr[Count] = js.undefined,
      openActivityTasks: js.UndefOr[Count] = js.undefined,
      openLambdaFunctions: js.UndefOr[Count] = js.undefined,
      openTimers: js.UndefOr[Count] = js.undefined,
      openDecisionTasks: js.UndefOr[OpenDecisionTasksCount] = js.undefined
    ): WorkflowExecutionOpenCounts = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("openChildWorkflowExecutions" -> openChildWorkflowExecutions.map { x => x: js.Any }),
        ("openActivityTasks" -> openActivityTasks.map { x => x: js.Any }),
        ("openLambdaFunctions" -> openLambdaFunctions.map { x => x: js.Any }),
        ("openTimers" -> openTimers.map { x => x: js.Any }),
        ("openDecisionTasks" -> openDecisionTasks.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionOpenCounts]
    }
  }

  /**
   * <p>Provides details of the <code>WorkflowExecutionSignaled</code> event.</p>
   */
  @js.native
  trait WorkflowExecutionSignaledEventAttributes extends js.Object {
    var signalName: SignalName
    var input: Data
    var externalWorkflowExecution: WorkflowExecution
    var externalInitiatedEventId: EventId
  }

  object WorkflowExecutionSignaledEventAttributes {
    def apply(
      signalName: js.UndefOr[SignalName] = js.undefined,
      input: js.UndefOr[Data] = js.undefined,
      externalWorkflowExecution: js.UndefOr[WorkflowExecution] = js.undefined,
      externalInitiatedEventId: js.UndefOr[EventId] = js.undefined
    ): WorkflowExecutionSignaledEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("signalName" -> signalName.map { x => x: js.Any }),
        ("input" -> input.map { x => x: js.Any }),
        ("externalWorkflowExecution" -> externalWorkflowExecution.map { x => x: js.Any }),
        ("externalInitiatedEventId" -> externalInitiatedEventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionSignaledEventAttributes]
    }
  }

  /**
   * <p>Provides details of <code>WorkflowExecutionStarted</code> event.</p>
   */
  @js.native
  trait WorkflowExecutionStartedEventAttributes extends js.Object {
    var parentInitiatedEventId: EventId
    var workflowType: WorkflowType
    var lambdaRole: Arn
    var taskList: TaskList
    var tagList: TagList
    var parentWorkflowExecution: WorkflowExecution
    var taskPriority: TaskPriority
    var taskStartToCloseTimeout: DurationInSecondsOptional
    var continuedExecutionRunId: RunIdOptional
    var childPolicy: ChildPolicy
    var executionStartToCloseTimeout: DurationInSecondsOptional
    var input: Data
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
      continuedExecutionRunId: js.UndefOr[RunIdOptional] = js.undefined,
      childPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      input: js.UndefOr[Data] = js.undefined
    ): WorkflowExecutionStartedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("parentInitiatedEventId" -> parentInitiatedEventId.map { x => x: js.Any }),
        ("workflowType" -> workflowType.map { x => x: js.Any }),
        ("lambdaRole" -> lambdaRole.map { x => x: js.Any }),
        ("taskList" -> taskList.map { x => x: js.Any }),
        ("tagList" -> tagList.map { x => x: js.Any }),
        ("parentWorkflowExecution" -> parentWorkflowExecution.map { x => x: js.Any }),
        ("taskPriority" -> taskPriority.map { x => x: js.Any }),
        ("taskStartToCloseTimeout" -> taskStartToCloseTimeout.map { x => x: js.Any }),
        ("continuedExecutionRunId" -> continuedExecutionRunId.map { x => x: js.Any }),
        ("childPolicy" -> childPolicy.map { x => x: js.Any }),
        ("executionStartToCloseTimeout" -> executionStartToCloseTimeout.map { x => x: js.Any }),
        ("input" -> input.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionStartedEventAttributes]
    }
  }


  object WorkflowExecutionTerminatedCauseEnum {
    val `CHILD_POLICY_APPLIED` = "CHILD_POLICY_APPLIED"
    val `EVENT_LIMIT_EXCEEDED` = "EVENT_LIMIT_EXCEEDED"
    val `OPERATOR_INITIATED` = "OPERATOR_INITIATED"

    val values = IndexedSeq(`CHILD_POLICY_APPLIED`, `EVENT_LIMIT_EXCEEDED`, `OPERATOR_INITIATED`)
  }

  /**
   * <p>Provides details of the <code>WorkflowExecutionTerminated</code> event.</p>
   */
  @js.native
  trait WorkflowExecutionTerminatedEventAttributes extends js.Object {
    var reason: TerminateReason
    var details: Data
    var childPolicy: ChildPolicy
    var cause: WorkflowExecutionTerminatedCause
  }

  object WorkflowExecutionTerminatedEventAttributes {
    def apply(
      reason: js.UndefOr[TerminateReason] = js.undefined,
      details: js.UndefOr[Data] = js.undefined,
      childPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      cause: js.UndefOr[WorkflowExecutionTerminatedCause] = js.undefined
    ): WorkflowExecutionTerminatedEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("reason" -> reason.map { x => x: js.Any }),
        ("details" -> details.map { x => x: js.Any }),
        ("childPolicy" -> childPolicy.map { x => x: js.Any }),
        ("cause" -> cause.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionTerminatedEventAttributes]
    }
  }

  /**
   * <p>Provides details of the <code>WorkflowExecutionTimedOut</code> event.</p>
   */
  @js.native
  trait WorkflowExecutionTimedOutEventAttributes extends js.Object {
    var timeoutType: WorkflowExecutionTimeoutType
    var childPolicy: ChildPolicy
  }

  object WorkflowExecutionTimedOutEventAttributes {
    def apply(
      timeoutType: js.UndefOr[WorkflowExecutionTimeoutType] = js.undefined,
      childPolicy: js.UndefOr[ChildPolicy] = js.undefined
    ): WorkflowExecutionTimedOutEventAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("timeoutType" -> timeoutType.map { x => x: js.Any }),
        ("childPolicy" -> childPolicy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowExecutionTimedOutEventAttributes]
    }
  }


  object WorkflowExecutionTimeoutTypeEnum {
    val `START_TO_CLOSE` = "START_TO_CLOSE"

    val values = IndexedSeq(`START_TO_CLOSE`)
  }

  /**
   * <p>Represents a workflow type.</p>
   */
  @js.native
  trait WorkflowType extends js.Object {
    var name: Name
    var version: Version
  }

  object WorkflowType {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      version: js.UndefOr[Version] = js.undefined
    ): WorkflowType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("version" -> version.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowType]
    }
  }

  /**
   * <p>The configuration settings of a workflow type.</p>
   */
  @js.native
  trait WorkflowTypeConfiguration extends js.Object {
    var defaultTaskStartToCloseTimeout: DurationInSecondsOptional
    var defaultTaskList: TaskList
    var defaultLambdaRole: Arn
    var defaultChildPolicy: ChildPolicy
    var defaultTaskPriority: TaskPriority
    var defaultExecutionStartToCloseTimeout: DurationInSecondsOptional
  }

  object WorkflowTypeConfiguration {
    def apply(
      defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined,
      defaultTaskList: js.UndefOr[TaskList] = js.undefined,
      defaultLambdaRole: js.UndefOr[Arn] = js.undefined,
      defaultChildPolicy: js.UndefOr[ChildPolicy] = js.undefined,
      defaultTaskPriority: js.UndefOr[TaskPriority] = js.undefined,
      defaultExecutionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    ): WorkflowTypeConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("defaultTaskStartToCloseTimeout" -> defaultTaskStartToCloseTimeout.map { x => x: js.Any }),
        ("defaultTaskList" -> defaultTaskList.map { x => x: js.Any }),
        ("defaultLambdaRole" -> defaultLambdaRole.map { x => x: js.Any }),
        ("defaultChildPolicy" -> defaultChildPolicy.map { x => x: js.Any }),
        ("defaultTaskPriority" -> defaultTaskPriority.map { x => x: js.Any }),
        ("defaultExecutionStartToCloseTimeout" -> defaultExecutionStartToCloseTimeout.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowTypeConfiguration]
    }
  }

  /**
   * <p>Contains details about a workflow type.</p>
   */
  @js.native
  trait WorkflowTypeDetail extends js.Object {
    var typeInfo: WorkflowTypeInfo
    var configuration: WorkflowTypeConfiguration
  }

  object WorkflowTypeDetail {
    def apply(
      typeInfo: js.UndefOr[WorkflowTypeInfo] = js.undefined,
      configuration: js.UndefOr[WorkflowTypeConfiguration] = js.undefined
    ): WorkflowTypeDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("typeInfo" -> typeInfo.map { x => x: js.Any }),
        ("configuration" -> configuration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowTypeDetail]
    }
  }

  /**
   * <p>Used to filter workflow execution query results by type. Each parameter, if specified, defines a rule that must be satisfied by each returned result.</p>
   */
  @js.native
  trait WorkflowTypeFilter extends js.Object {
    var name: Name
    var version: VersionOptional
  }

  object WorkflowTypeFilter {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      version: js.UndefOr[VersionOptional] = js.undefined
    ): WorkflowTypeFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("version" -> version.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowTypeFilter]
    }
  }

  /**
   * <p>Contains information about a workflow type.</p>
   */
  @js.native
  trait WorkflowTypeInfo extends js.Object {
    var workflowType: WorkflowType
    var description: Description
    var status: RegistrationStatus
    var deprecationDate: Timestamp
    var creationDate: Timestamp
  }

  object WorkflowTypeInfo {
    def apply(
      workflowType: js.UndefOr[WorkflowType] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      status: js.UndefOr[RegistrationStatus] = js.undefined,
      deprecationDate: js.UndefOr[Timestamp] = js.undefined,
      creationDate: js.UndefOr[Timestamp] = js.undefined
    ): WorkflowTypeInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("workflowType" -> workflowType.map { x => x: js.Any }),
        ("description" -> description.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("deprecationDate" -> deprecationDate.map { x => x: js.Any }),
        ("creationDate" -> creationDate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowTypeInfo]
    }
  }

  /**
   * <p>Contains a paginated list of information structures about workflow types.</p>
   */
  @js.native
  trait WorkflowTypeInfos extends js.Object {
    var typeInfos: WorkflowTypeInfoList
    var nextPageToken: PageToken
  }

  object WorkflowTypeInfos {
    def apply(
      typeInfos: js.UndefOr[WorkflowTypeInfoList] = js.undefined,
      nextPageToken: js.UndefOr[PageToken] = js.undefined
    ): WorkflowTypeInfos = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("typeInfos" -> typeInfos.map { x => x: js.Any }),
        ("nextPageToken" -> nextPageToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WorkflowTypeInfos]
    }
  }
}
