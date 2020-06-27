package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object swf {
  type ActivityId                = String
  type ActivityTypeInfoList      = js.Array[ActivityTypeInfo]
  type Arn                       = String
  type Canceled                  = Boolean
  type CauseMessage              = String
  type Count                     = Int
  type Data                      = String
  type DecisionList              = js.Array[Decision]
  type Description               = String
  type DomainInfoList            = js.Array[DomainInfo]
  type DomainName                = String
  type DurationInDays            = String
  type DurationInSeconds         = String
  type DurationInSecondsOptional = String
  type EventId                   = Double
  type FailureReason             = String
  type FunctionId                = String
  type FunctionInput             = String
  type FunctionName              = String
  type HistoryEventList          = js.Array[HistoryEvent]
  type Identity                  = String
  type LimitedData               = String
  type MarkerName                = String
  type Name                      = String
  type OpenDecisionTasksCount    = Int
  type PageSize                  = Int
  type PageToken                 = String
  type ResourceTagKey            = String
  type ResourceTagKeyList        = js.Array[ResourceTagKey]
  type ResourceTagList           = js.Array[ResourceTag]
  type ResourceTagValue          = String
  type ReverseOrder              = Boolean
  type SignalName                = String
  type Tag                       = String
  type TagList                   = js.Array[Tag]
  type TaskPriority              = String
  type TaskToken                 = String
  type TerminateReason           = String
  type TimerId                   = String
  type Timestamp                 = js.Date
  type Truncated                 = Boolean
  type Version                   = String
  type VersionOptional           = String
  type WorkflowExecutionInfoList = js.Array[WorkflowExecutionInfo]
  type WorkflowId                = String
  type WorkflowRunId             = String
  type WorkflowRunIdOptional     = String
  type WorkflowTypeInfoList      = js.Array[WorkflowTypeInfo]

  implicit final class SWFOps(private val service: SWF) extends AnyVal {

    @inline def countClosedWorkflowExecutionsFuture(
        params: CountClosedWorkflowExecutionsInput
    ): Future[WorkflowExecutionCount] = service.countClosedWorkflowExecutions(params).promise().toFuture
    @inline def countOpenWorkflowExecutionsFuture(
        params: CountOpenWorkflowExecutionsInput
    ): Future[WorkflowExecutionCount] = service.countOpenWorkflowExecutions(params).promise().toFuture
    @inline def countPendingActivityTasksFuture(params: CountPendingActivityTasksInput): Future[PendingTaskCount] =
      service.countPendingActivityTasks(params).promise().toFuture
    @inline def countPendingDecisionTasksFuture(params: CountPendingDecisionTasksInput): Future[PendingTaskCount] =
      service.countPendingDecisionTasks(params).promise().toFuture
    @inline def deprecateActivityTypeFuture(params: DeprecateActivityTypeInput): Future[js.Object] =
      service.deprecateActivityType(params).promise().toFuture
    @inline def deprecateDomainFuture(params: DeprecateDomainInput): Future[js.Object] =
      service.deprecateDomain(params).promise().toFuture
    @inline def deprecateWorkflowTypeFuture(params: DeprecateWorkflowTypeInput): Future[js.Object] =
      service.deprecateWorkflowType(params).promise().toFuture
    @inline def describeActivityTypeFuture(params: DescribeActivityTypeInput): Future[ActivityTypeDetail] =
      service.describeActivityType(params).promise().toFuture
    @inline def describeDomainFuture(params: DescribeDomainInput): Future[DomainDetail] =
      service.describeDomain(params).promise().toFuture
    @inline def describeWorkflowExecutionFuture(
        params: DescribeWorkflowExecutionInput
    ): Future[WorkflowExecutionDetail] = service.describeWorkflowExecution(params).promise().toFuture
    @inline def describeWorkflowTypeFuture(params: DescribeWorkflowTypeInput): Future[WorkflowTypeDetail] =
      service.describeWorkflowType(params).promise().toFuture
    @inline def getWorkflowExecutionHistoryFuture(params: GetWorkflowExecutionHistoryInput): Future[History] =
      service.getWorkflowExecutionHistory(params).promise().toFuture
    @inline def listActivityTypesFuture(params: ListActivityTypesInput): Future[ActivityTypeInfos] =
      service.listActivityTypes(params).promise().toFuture
    @inline def listClosedWorkflowExecutionsFuture(
        params: ListClosedWorkflowExecutionsInput
    ): Future[WorkflowExecutionInfos] = service.listClosedWorkflowExecutions(params).promise().toFuture
    @inline def listDomainsFuture(params: ListDomainsInput): Future[DomainInfos] =
      service.listDomains(params).promise().toFuture
    @inline def listOpenWorkflowExecutionsFuture(
        params: ListOpenWorkflowExecutionsInput
    ): Future[WorkflowExecutionInfos] = service.listOpenWorkflowExecutions(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listWorkflowTypesFuture(params: ListWorkflowTypesInput): Future[WorkflowTypeInfos] =
      service.listWorkflowTypes(params).promise().toFuture
    @inline def pollForActivityTaskFuture(params: PollForActivityTaskInput): Future[ActivityTask] =
      service.pollForActivityTask(params).promise().toFuture
    @inline def pollForDecisionTaskFuture(params: PollForDecisionTaskInput): Future[DecisionTask] =
      service.pollForDecisionTask(params).promise().toFuture
    @inline def recordActivityTaskHeartbeatFuture(
        params: RecordActivityTaskHeartbeatInput
    ): Future[ActivityTaskStatus] = service.recordActivityTaskHeartbeat(params).promise().toFuture
    @inline def registerActivityTypeFuture(params: RegisterActivityTypeInput): Future[js.Object] =
      service.registerActivityType(params).promise().toFuture
    @inline def registerDomainFuture(params: RegisterDomainInput): Future[js.Object] =
      service.registerDomain(params).promise().toFuture
    @inline def registerWorkflowTypeFuture(params: RegisterWorkflowTypeInput): Future[js.Object] =
      service.registerWorkflowType(params).promise().toFuture
    @inline def requestCancelWorkflowExecutionFuture(params: RequestCancelWorkflowExecutionInput): Future[js.Object] =
      service.requestCancelWorkflowExecution(params).promise().toFuture
    @inline def respondActivityTaskCanceledFuture(params: RespondActivityTaskCanceledInput): Future[js.Object] =
      service.respondActivityTaskCanceled(params).promise().toFuture
    @inline def respondActivityTaskCompletedFuture(params: RespondActivityTaskCompletedInput): Future[js.Object] =
      service.respondActivityTaskCompleted(params).promise().toFuture
    @inline def respondActivityTaskFailedFuture(params: RespondActivityTaskFailedInput): Future[js.Object] =
      service.respondActivityTaskFailed(params).promise().toFuture
    @inline def respondDecisionTaskCompletedFuture(params: RespondDecisionTaskCompletedInput): Future[js.Object] =
      service.respondDecisionTaskCompleted(params).promise().toFuture
    @inline def signalWorkflowExecutionFuture(params: SignalWorkflowExecutionInput): Future[js.Object] =
      service.signalWorkflowExecution(params).promise().toFuture
    @inline def startWorkflowExecutionFuture(params: StartWorkflowExecutionInput): Future[Run] =
      service.startWorkflowExecution(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def terminateWorkflowExecutionFuture(params: TerminateWorkflowExecutionInput): Future[js.Object] =
      service.terminateWorkflowExecution(params).promise().toFuture
    @inline def undeprecateActivityTypeFuture(params: UndeprecateActivityTypeInput): Future[js.Object] =
      service.undeprecateActivityType(params).promise().toFuture
    @inline def undeprecateDomainFuture(params: UndeprecateDomainInput): Future[js.Object] =
      service.undeprecateDomain(params).promise().toFuture
    @inline def undeprecateWorkflowTypeFuture(params: UndeprecateWorkflowTypeInput): Future[js.Object] =
      service.undeprecateWorkflowType(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[js.Object] =
      service.untagResource(params).promise().toFuture
  }
}

package swf {
  @js.native
  @JSImport("aws-sdk", "SWF")
  class SWF() extends js.Object {
    def this(config: AWSConfig) = this()

    def countClosedWorkflowExecutions(params: CountClosedWorkflowExecutionsInput): Request[WorkflowExecutionCount] =
      js.native
    def countOpenWorkflowExecutions(params: CountOpenWorkflowExecutionsInput): Request[WorkflowExecutionCount] =
      js.native
    def countPendingActivityTasks(params: CountPendingActivityTasksInput): Request[PendingTaskCount]        = js.native
    def countPendingDecisionTasks(params: CountPendingDecisionTasksInput): Request[PendingTaskCount]        = js.native
    def deprecateActivityType(params: DeprecateActivityTypeInput): Request[js.Object]                       = js.native
    def deprecateDomain(params: DeprecateDomainInput): Request[js.Object]                                   = js.native
    def deprecateWorkflowType(params: DeprecateWorkflowTypeInput): Request[js.Object]                       = js.native
    def describeActivityType(params: DescribeActivityTypeInput): Request[ActivityTypeDetail]                = js.native
    def describeDomain(params: DescribeDomainInput): Request[DomainDetail]                                  = js.native
    def describeWorkflowExecution(params: DescribeWorkflowExecutionInput): Request[WorkflowExecutionDetail] = js.native
    def describeWorkflowType(params: DescribeWorkflowTypeInput): Request[WorkflowTypeDetail]                = js.native
    def getWorkflowExecutionHistory(params: GetWorkflowExecutionHistoryInput): Request[History]             = js.native
    def listActivityTypes(params: ListActivityTypesInput): Request[ActivityTypeInfos]                       = js.native
    def listClosedWorkflowExecutions(params: ListClosedWorkflowExecutionsInput): Request[WorkflowExecutionInfos] =
      js.native
    def listDomains(params: ListDomainsInput): Request[DomainInfos]                                          = js.native
    def listOpenWorkflowExecutions(params: ListOpenWorkflowExecutionsInput): Request[WorkflowExecutionInfos] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput]            = js.native
    def listWorkflowTypes(params: ListWorkflowTypesInput): Request[WorkflowTypeInfos]                        = js.native
    def pollForActivityTask(params: PollForActivityTaskInput): Request[ActivityTask]                         = js.native
    def pollForDecisionTask(params: PollForDecisionTaskInput): Request[DecisionTask]                         = js.native
    def recordActivityTaskHeartbeat(params: RecordActivityTaskHeartbeatInput): Request[ActivityTaskStatus]   = js.native
    def registerActivityType(params: RegisterActivityTypeInput): Request[js.Object]                          = js.native
    def registerDomain(params: RegisterDomainInput): Request[js.Object]                                      = js.native
    def registerWorkflowType(params: RegisterWorkflowTypeInput): Request[js.Object]                          = js.native
    def requestCancelWorkflowExecution(params: RequestCancelWorkflowExecutionInput): Request[js.Object]      = js.native
    def respondActivityTaskCanceled(params: RespondActivityTaskCanceledInput): Request[js.Object]            = js.native
    def respondActivityTaskCompleted(params: RespondActivityTaskCompletedInput): Request[js.Object]          = js.native
    def respondActivityTaskFailed(params: RespondActivityTaskFailedInput): Request[js.Object]                = js.native
    def respondDecisionTaskCompleted(params: RespondDecisionTaskCompletedInput): Request[js.Object]          = js.native
    def signalWorkflowExecution(params: SignalWorkflowExecutionInput): Request[js.Object]                    = js.native
    def startWorkflowExecution(params: StartWorkflowExecutionInput): Request[Run]                            = js.native
    def tagResource(params: TagResourceInput): Request[js.Object]                                            = js.native
    def terminateWorkflowExecution(params: TerminateWorkflowExecutionInput): Request[js.Object]              = js.native
    def undeprecateActivityType(params: UndeprecateActivityTypeInput): Request[js.Object]                    = js.native
    def undeprecateDomain(params: UndeprecateDomainInput): Request[js.Object]                                = js.native
    def undeprecateWorkflowType(params: UndeprecateWorkflowTypeInput): Request[js.Object]                    = js.native
    def untagResource(params: UntagResourceInput): Request[js.Object]                                        = js.native
  }

  /**
    * Unit of work sent to an activity worker.
    */
  @js.native
  @Factory
  trait ActivityTask extends js.Object {
    var activityId: ActivityId
    var activityType: ActivityType
    var startedEventId: EventId
    var taskToken: TaskToken
    var workflowExecution: WorkflowExecution
    var input: js.UndefOr[Data]
  }

  /**
    * Provides the details of the <code>ActivityTaskCancelRequested</code> event.
    */
  @js.native
  @Factory
  trait ActivityTaskCancelRequestedEventAttributes extends js.Object {
    var activityId: ActivityId
    var decisionTaskCompletedEventId: EventId
  }

  /**
    * Provides the details of the <code>ActivityTaskCanceled</code> event.
    */
  @js.native
  @Factory
  trait ActivityTaskCanceledEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var details: js.UndefOr[Data]
    var latestCancelRequestedEventId: js.UndefOr[EventId]
  }

  /**
    * Provides the details of the <code>ActivityTaskCompleted</code> event.
    */
  @js.native
  @Factory
  trait ActivityTaskCompletedEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var result: js.UndefOr[Data]
  }

  /**
    * Provides the details of the <code>ActivityTaskFailed</code> event.
    */
  @js.native
  @Factory
  trait ActivityTaskFailedEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var details: js.UndefOr[Data]
    var reason: js.UndefOr[FailureReason]
  }

  /**
    * Provides the details of the <code>ActivityTaskScheduled</code> event.
    */
  @js.native
  @Factory
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

  /**
    * Provides the details of the <code>ActivityTaskStarted</code> event.
    */
  @js.native
  @Factory
  trait ActivityTaskStartedEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var identity: js.UndefOr[Identity]
  }

  /**
    * Status information about an activity task.
    */
  @js.native
  @Factory
  trait ActivityTaskStatus extends js.Object {
    var cancelRequested: Canceled
  }

  /**
    * Provides the details of the <code>ActivityTaskTimedOut</code> event.
    */
  @js.native
  @Factory
  trait ActivityTaskTimedOutEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var timeoutType: ActivityTaskTimeoutType
    var details: js.UndefOr[LimitedData]
  }

  @js.native
  sealed trait ActivityTaskTimeoutType extends js.Any
  object ActivityTaskTimeoutType extends js.Object {
    val START_TO_CLOSE    = "START_TO_CLOSE".asInstanceOf[ActivityTaskTimeoutType]
    val SCHEDULE_TO_START = "SCHEDULE_TO_START".asInstanceOf[ActivityTaskTimeoutType]
    val SCHEDULE_TO_CLOSE = "SCHEDULE_TO_CLOSE".asInstanceOf[ActivityTaskTimeoutType]
    val HEARTBEAT         = "HEARTBEAT".asInstanceOf[ActivityTaskTimeoutType]

    val values = js.Object.freeze(js.Array(START_TO_CLOSE, SCHEDULE_TO_START, SCHEDULE_TO_CLOSE, HEARTBEAT))
  }

  /**
    * Represents an activity type.
    */
  @js.native
  @Factory
  trait ActivityType extends js.Object {
    var name: Name
    var version: Version
  }

  /**
    * Configuration settings registered with the activity type.
    */
  @js.native
  @Factory
  trait ActivityTypeConfiguration extends js.Object {
    var defaultTaskHeartbeatTimeout: js.UndefOr[DurationInSecondsOptional]
    var defaultTaskList: js.UndefOr[TaskList]
    var defaultTaskPriority: js.UndefOr[TaskPriority]
    var defaultTaskScheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var defaultTaskScheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional]
    var defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
  }

  /**
    * Detailed information about an activity type.
    */
  @js.native
  @Factory
  trait ActivityTypeDetail extends js.Object {
    var configuration: ActivityTypeConfiguration
    var typeInfo: ActivityTypeInfo
  }

  /**
    * Detailed information about an activity type.
    */
  @js.native
  @Factory
  trait ActivityTypeInfo extends js.Object {
    var activityType: ActivityType
    var creationDate: Timestamp
    var status: RegistrationStatus
    var deprecationDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
  }

  /**
    * Contains a paginated list of activity type information structures.
    */
  @js.native
  @Factory
  trait ActivityTypeInfos extends js.Object {
    var typeInfos: ActivityTypeInfoList
    var nextPageToken: js.UndefOr[PageToken]
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
  @Factory
  trait CancelTimerDecisionAttributes extends js.Object {
    var timerId: TimerId
  }

  @js.native
  sealed trait CancelTimerFailedCause extends js.Any
  object CancelTimerFailedCause extends js.Object {
    val TIMER_ID_UNKNOWN        = "TIMER_ID_UNKNOWN".asInstanceOf[CancelTimerFailedCause]
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[CancelTimerFailedCause]

    val values = js.Object.freeze(js.Array(TIMER_ID_UNKNOWN, OPERATION_NOT_PERMITTED))
  }

  /**
    * Provides the details of the <code>CancelTimerFailed</code> event.
    */
  @js.native
  @Factory
  trait CancelTimerFailedEventAttributes extends js.Object {
    var cause: CancelTimerFailedCause
    var decisionTaskCompletedEventId: EventId
    var timerId: TimerId
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
  @Factory
  trait CancelWorkflowExecutionDecisionAttributes extends js.Object {
    var details: js.UndefOr[Data]
  }

  @js.native
  sealed trait CancelWorkflowExecutionFailedCause extends js.Any
  object CancelWorkflowExecutionFailedCause extends js.Object {
    val UNHANDLED_DECISION      = "UNHANDLED_DECISION".asInstanceOf[CancelWorkflowExecutionFailedCause]
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[CancelWorkflowExecutionFailedCause]

    val values = js.Object.freeze(js.Array(UNHANDLED_DECISION, OPERATION_NOT_PERMITTED))
  }

  /**
    * Provides the details of the <code>CancelWorkflowExecutionFailed</code> event.
    */
  @js.native
  @Factory
  trait CancelWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: CancelWorkflowExecutionFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  @js.native
  sealed trait ChildPolicy extends js.Any
  object ChildPolicy extends js.Object {
    val TERMINATE      = "TERMINATE".asInstanceOf[ChildPolicy]
    val REQUEST_CANCEL = "REQUEST_CANCEL".asInstanceOf[ChildPolicy]
    val ABANDON        = "ABANDON".asInstanceOf[ChildPolicy]

    val values = js.Object.freeze(js.Array(TERMINATE, REQUEST_CANCEL, ABANDON))
  }

  /**
    * Provide details of the <code>ChildWorkflowExecutionCanceled</code> event.
    */
  @js.native
  @Factory
  trait ChildWorkflowExecutionCanceledEventAttributes extends js.Object {
    var initiatedEventId: EventId
    var startedEventId: EventId
    var workflowExecution: WorkflowExecution
    var workflowType: WorkflowType
    var details: js.UndefOr[Data]
  }

  /**
    * Provides the details of the <code>ChildWorkflowExecutionCompleted</code> event.
    */
  @js.native
  @Factory
  trait ChildWorkflowExecutionCompletedEventAttributes extends js.Object {
    var initiatedEventId: EventId
    var startedEventId: EventId
    var workflowExecution: WorkflowExecution
    var workflowType: WorkflowType
    var result: js.UndefOr[Data]
  }

  /**
    * Provides the details of the <code>ChildWorkflowExecutionFailed</code> event.
    */
  @js.native
  @Factory
  trait ChildWorkflowExecutionFailedEventAttributes extends js.Object {
    var initiatedEventId: EventId
    var startedEventId: EventId
    var workflowExecution: WorkflowExecution
    var workflowType: WorkflowType
    var details: js.UndefOr[Data]
    var reason: js.UndefOr[FailureReason]
  }

  /**
    * Provides the details of the <code>ChildWorkflowExecutionStarted</code> event.
    */
  @js.native
  @Factory
  trait ChildWorkflowExecutionStartedEventAttributes extends js.Object {
    var initiatedEventId: EventId
    var workflowExecution: WorkflowExecution
    var workflowType: WorkflowType
  }

  /**
    * Provides the details of the <code>ChildWorkflowExecutionTerminated</code> event.
    */
  @js.native
  @Factory
  trait ChildWorkflowExecutionTerminatedEventAttributes extends js.Object {
    var initiatedEventId: EventId
    var startedEventId: EventId
    var workflowExecution: WorkflowExecution
    var workflowType: WorkflowType
  }

  /**
    * Provides the details of the <code>ChildWorkflowExecutionTimedOut</code> event.
    */
  @js.native
  @Factory
  trait ChildWorkflowExecutionTimedOutEventAttributes extends js.Object {
    var initiatedEventId: EventId
    var startedEventId: EventId
    var timeoutType: WorkflowExecutionTimeoutType
    var workflowExecution: WorkflowExecution
    var workflowType: WorkflowType
  }

  @js.native
  sealed trait CloseStatus extends js.Any
  object CloseStatus extends js.Object {
    val COMPLETED        = "COMPLETED".asInstanceOf[CloseStatus]
    val FAILED           = "FAILED".asInstanceOf[CloseStatus]
    val CANCELED         = "CANCELED".asInstanceOf[CloseStatus]
    val TERMINATED       = "TERMINATED".asInstanceOf[CloseStatus]
    val CONTINUED_AS_NEW = "CONTINUED_AS_NEW".asInstanceOf[CloseStatus]
    val TIMED_OUT        = "TIMED_OUT".asInstanceOf[CloseStatus]

    val values = js.Object.freeze(js.Array(COMPLETED, FAILED, CANCELED, TERMINATED, CONTINUED_AS_NEW, TIMED_OUT))
  }

  /**
    * Used to filter the closed workflow executions in visibility APIs by their close status.
    */
  @js.native
  @Factory
  trait CloseStatusFilter extends js.Object {
    var status: CloseStatus
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
  @Factory
  trait CompleteWorkflowExecutionDecisionAttributes extends js.Object {
    var result: js.UndefOr[Data]
  }

  @js.native
  sealed trait CompleteWorkflowExecutionFailedCause extends js.Any
  object CompleteWorkflowExecutionFailedCause extends js.Object {
    val UNHANDLED_DECISION      = "UNHANDLED_DECISION".asInstanceOf[CompleteWorkflowExecutionFailedCause]
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[CompleteWorkflowExecutionFailedCause]

    val values = js.Object.freeze(js.Array(UNHANDLED_DECISION, OPERATION_NOT_PERMITTED))
  }

  /**
    * Provides the details of the <code>CompleteWorkflowExecutionFailed</code> event.
    */
  @js.native
  @Factory
  trait CompleteWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: CompleteWorkflowExecutionFailedCause
    var decisionTaskCompletedEventId: EventId
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
  @Factory
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

  @js.native
  sealed trait ContinueAsNewWorkflowExecutionFailedCause extends js.Any
  object ContinueAsNewWorkflowExecutionFailedCause extends js.Object {
    val UNHANDLED_DECISION       = "UNHANDLED_DECISION".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
    val WORKFLOW_TYPE_DEPRECATED = "WORKFLOW_TYPE_DEPRECATED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
    val WORKFLOW_TYPE_DOES_NOT_EXIST =
      "WORKFLOW_TYPE_DOES_NOT_EXIST".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
    val DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED =
      "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
    val DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED =
      "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
    val DEFAULT_TASK_LIST_UNDEFINED =
      "DEFAULT_TASK_LIST_UNDEFINED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
    val DEFAULT_CHILD_POLICY_UNDEFINED =
      "DEFAULT_CHILD_POLICY_UNDEFINED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
    val CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED =
      "CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[ContinueAsNewWorkflowExecutionFailedCause]

    val values = js.Object.freeze(
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
    )
  }

  /**
    * Provides the details of the <code>ContinueAsNewWorkflowExecutionFailed</code> event.
    */
  @js.native
  @Factory
  trait ContinueAsNewWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: ContinueAsNewWorkflowExecutionFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  @js.native
  @Factory
  trait CountClosedWorkflowExecutionsInput extends js.Object {
    var domain: DomainName
    var closeStatusFilter: js.UndefOr[CloseStatusFilter]
    var closeTimeFilter: js.UndefOr[ExecutionTimeFilter]
    var executionFilter: js.UndefOr[WorkflowExecutionFilter]
    var startTimeFilter: js.UndefOr[ExecutionTimeFilter]
    var tagFilter: js.UndefOr[TagFilter]
    var typeFilter: js.UndefOr[WorkflowTypeFilter]
  }

  @js.native
  @Factory
  trait CountOpenWorkflowExecutionsInput extends js.Object {
    var domain: DomainName
    var startTimeFilter: ExecutionTimeFilter
    var executionFilter: js.UndefOr[WorkflowExecutionFilter]
    var tagFilter: js.UndefOr[TagFilter]
    var typeFilter: js.UndefOr[WorkflowTypeFilter]
  }

  @js.native
  @Factory
  trait CountPendingActivityTasksInput extends js.Object {
    var domain: DomainName
    var taskList: TaskList
  }

  @js.native
  @Factory
  trait CountPendingDecisionTasksInput extends js.Object {
    var domain: DomainName
    var taskList: TaskList
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
  @Factory
  trait Decision extends js.Object {
    var decisionType: DecisionType
    var cancelTimerDecisionAttributes: js.UndefOr[CancelTimerDecisionAttributes]
    var cancelWorkflowExecutionDecisionAttributes: js.UndefOr[CancelWorkflowExecutionDecisionAttributes]
    var completeWorkflowExecutionDecisionAttributes: js.UndefOr[CompleteWorkflowExecutionDecisionAttributes]
    var continueAsNewWorkflowExecutionDecisionAttributes: js.UndefOr[ContinueAsNewWorkflowExecutionDecisionAttributes]
    var failWorkflowExecutionDecisionAttributes: js.UndefOr[FailWorkflowExecutionDecisionAttributes]
    var recordMarkerDecisionAttributes: js.UndefOr[RecordMarkerDecisionAttributes]
    var requestCancelActivityTaskDecisionAttributes: js.UndefOr[RequestCancelActivityTaskDecisionAttributes]
    var requestCancelExternalWorkflowExecutionDecisionAttributes: js.UndefOr[
      RequestCancelExternalWorkflowExecutionDecisionAttributes
    ]
    var scheduleActivityTaskDecisionAttributes: js.UndefOr[ScheduleActivityTaskDecisionAttributes]
    var scheduleLambdaFunctionDecisionAttributes: js.UndefOr[ScheduleLambdaFunctionDecisionAttributes]
    var signalExternalWorkflowExecutionDecisionAttributes: js.UndefOr[SignalExternalWorkflowExecutionDecisionAttributes]
    var startChildWorkflowExecutionDecisionAttributes: js.UndefOr[StartChildWorkflowExecutionDecisionAttributes]
    var startTimerDecisionAttributes: js.UndefOr[StartTimerDecisionAttributes]
  }

  /**
    * A structure that represents a decision task. Decision tasks are sent to deciders in order for them to make decisions.
    */
  @js.native
  @Factory
  trait DecisionTask extends js.Object {
    var events: HistoryEventList
    var startedEventId: EventId
    var taskToken: TaskToken
    var workflowExecution: WorkflowExecution
    var workflowType: WorkflowType
    var nextPageToken: js.UndefOr[PageToken]
    var previousStartedEventId: js.UndefOr[EventId]
  }

  /**
    * Provides the details of the <code>DecisionTaskCompleted</code> event.
    */
  @js.native
  @Factory
  trait DecisionTaskCompletedEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var executionContext: js.UndefOr[Data]
  }

  /**
    * Provides details about the <code>DecisionTaskScheduled</code> event.
    */
  @js.native
  @Factory
  trait DecisionTaskScheduledEventAttributes extends js.Object {
    var taskList: TaskList
    var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var taskPriority: js.UndefOr[TaskPriority]
  }

  /**
    * Provides the details of the <code>DecisionTaskStarted</code> event.
    */
  @js.native
  @Factory
  trait DecisionTaskStartedEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var identity: js.UndefOr[Identity]
  }

  /**
    * Provides the details of the <code>DecisionTaskTimedOut</code> event.
    */
  @js.native
  @Factory
  trait DecisionTaskTimedOutEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var timeoutType: DecisionTaskTimeoutType
  }

  @js.native
  sealed trait DecisionTaskTimeoutType extends js.Any
  object DecisionTaskTimeoutType extends js.Object {
    val START_TO_CLOSE = "START_TO_CLOSE".asInstanceOf[DecisionTaskTimeoutType]

    val values = js.Object.freeze(js.Array(START_TO_CLOSE))
  }

  @js.native
  sealed trait DecisionType extends js.Any
  object DecisionType extends js.Object {
    val ScheduleActivityTask                   = "ScheduleActivityTask".asInstanceOf[DecisionType]
    val RequestCancelActivityTask              = "RequestCancelActivityTask".asInstanceOf[DecisionType]
    val CompleteWorkflowExecution              = "CompleteWorkflowExecution".asInstanceOf[DecisionType]
    val FailWorkflowExecution                  = "FailWorkflowExecution".asInstanceOf[DecisionType]
    val CancelWorkflowExecution                = "CancelWorkflowExecution".asInstanceOf[DecisionType]
    val ContinueAsNewWorkflowExecution         = "ContinueAsNewWorkflowExecution".asInstanceOf[DecisionType]
    val RecordMarker                           = "RecordMarker".asInstanceOf[DecisionType]
    val StartTimer                             = "StartTimer".asInstanceOf[DecisionType]
    val CancelTimer                            = "CancelTimer".asInstanceOf[DecisionType]
    val SignalExternalWorkflowExecution        = "SignalExternalWorkflowExecution".asInstanceOf[DecisionType]
    val RequestCancelExternalWorkflowExecution = "RequestCancelExternalWorkflowExecution".asInstanceOf[DecisionType]
    val StartChildWorkflowExecution            = "StartChildWorkflowExecution".asInstanceOf[DecisionType]
    val ScheduleLambdaFunction                 = "ScheduleLambdaFunction".asInstanceOf[DecisionType]

    val values = js.Object.freeze(
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
    )
  }

  @js.native
  @Factory
  trait DeprecateActivityTypeInput extends js.Object {
    var activityType: ActivityType
    var domain: DomainName
  }

  @js.native
  @Factory
  trait DeprecateDomainInput extends js.Object {
    var name: DomainName
  }

  @js.native
  @Factory
  trait DeprecateWorkflowTypeInput extends js.Object {
    var domain: DomainName
    var workflowType: WorkflowType
  }

  @js.native
  @Factory
  trait DescribeActivityTypeInput extends js.Object {
    var activityType: ActivityType
    var domain: DomainName
  }

  @js.native
  @Factory
  trait DescribeDomainInput extends js.Object {
    var name: DomainName
  }

  @js.native
  @Factory
  trait DescribeWorkflowExecutionInput extends js.Object {
    var domain: DomainName
    var execution: WorkflowExecution
  }

  @js.native
  @Factory
  trait DescribeWorkflowTypeInput extends js.Object {
    var domain: DomainName
    var workflowType: WorkflowType
  }

  /**
    * Contains the configuration settings of a domain.
    */
  @js.native
  @Factory
  trait DomainConfiguration extends js.Object {
    var workflowExecutionRetentionPeriodInDays: DurationInDays
  }

  /**
    * Contains details of a domain.
    */
  @js.native
  @Factory
  trait DomainDetail extends js.Object {
    var configuration: DomainConfiguration
    var domainInfo: DomainInfo
  }

  /**
    * Contains general information about a domain.
    */
  @js.native
  @Factory
  trait DomainInfo extends js.Object {
    var name: DomainName
    var status: RegistrationStatus
    var arn: js.UndefOr[Arn]
    var description: js.UndefOr[Description]
  }

  /**
    * Contains a paginated collection of DomainInfo structures.
    */
  @js.native
  @Factory
  trait DomainInfos extends js.Object {
    var domainInfos: DomainInfoList
    var nextPageToken: js.UndefOr[PageToken]
  }

  @js.native
  sealed trait EventType extends js.Any
  object EventType extends js.Object {
    val WorkflowExecutionStarted                 = "WorkflowExecutionStarted".asInstanceOf[EventType]
    val WorkflowExecutionCancelRequested         = "WorkflowExecutionCancelRequested".asInstanceOf[EventType]
    val WorkflowExecutionCompleted               = "WorkflowExecutionCompleted".asInstanceOf[EventType]
    val CompleteWorkflowExecutionFailed          = "CompleteWorkflowExecutionFailed".asInstanceOf[EventType]
    val WorkflowExecutionFailed                  = "WorkflowExecutionFailed".asInstanceOf[EventType]
    val FailWorkflowExecutionFailed              = "FailWorkflowExecutionFailed".asInstanceOf[EventType]
    val WorkflowExecutionTimedOut                = "WorkflowExecutionTimedOut".asInstanceOf[EventType]
    val WorkflowExecutionCanceled                = "WorkflowExecutionCanceled".asInstanceOf[EventType]
    val CancelWorkflowExecutionFailed            = "CancelWorkflowExecutionFailed".asInstanceOf[EventType]
    val WorkflowExecutionContinuedAsNew          = "WorkflowExecutionContinuedAsNew".asInstanceOf[EventType]
    val ContinueAsNewWorkflowExecutionFailed     = "ContinueAsNewWorkflowExecutionFailed".asInstanceOf[EventType]
    val WorkflowExecutionTerminated              = "WorkflowExecutionTerminated".asInstanceOf[EventType]
    val DecisionTaskScheduled                    = "DecisionTaskScheduled".asInstanceOf[EventType]
    val DecisionTaskStarted                      = "DecisionTaskStarted".asInstanceOf[EventType]
    val DecisionTaskCompleted                    = "DecisionTaskCompleted".asInstanceOf[EventType]
    val DecisionTaskTimedOut                     = "DecisionTaskTimedOut".asInstanceOf[EventType]
    val ActivityTaskScheduled                    = "ActivityTaskScheduled".asInstanceOf[EventType]
    val ScheduleActivityTaskFailed               = "ScheduleActivityTaskFailed".asInstanceOf[EventType]
    val ActivityTaskStarted                      = "ActivityTaskStarted".asInstanceOf[EventType]
    val ActivityTaskCompleted                    = "ActivityTaskCompleted".asInstanceOf[EventType]
    val ActivityTaskFailed                       = "ActivityTaskFailed".asInstanceOf[EventType]
    val ActivityTaskTimedOut                     = "ActivityTaskTimedOut".asInstanceOf[EventType]
    val ActivityTaskCanceled                     = "ActivityTaskCanceled".asInstanceOf[EventType]
    val ActivityTaskCancelRequested              = "ActivityTaskCancelRequested".asInstanceOf[EventType]
    val RequestCancelActivityTaskFailed          = "RequestCancelActivityTaskFailed".asInstanceOf[EventType]
    val WorkflowExecutionSignaled                = "WorkflowExecutionSignaled".asInstanceOf[EventType]
    val MarkerRecorded                           = "MarkerRecorded".asInstanceOf[EventType]
    val RecordMarkerFailed                       = "RecordMarkerFailed".asInstanceOf[EventType]
    val TimerStarted                             = "TimerStarted".asInstanceOf[EventType]
    val StartTimerFailed                         = "StartTimerFailed".asInstanceOf[EventType]
    val TimerFired                               = "TimerFired".asInstanceOf[EventType]
    val TimerCanceled                            = "TimerCanceled".asInstanceOf[EventType]
    val CancelTimerFailed                        = "CancelTimerFailed".asInstanceOf[EventType]
    val StartChildWorkflowExecutionInitiated     = "StartChildWorkflowExecutionInitiated".asInstanceOf[EventType]
    val StartChildWorkflowExecutionFailed        = "StartChildWorkflowExecutionFailed".asInstanceOf[EventType]
    val ChildWorkflowExecutionStarted            = "ChildWorkflowExecutionStarted".asInstanceOf[EventType]
    val ChildWorkflowExecutionCompleted          = "ChildWorkflowExecutionCompleted".asInstanceOf[EventType]
    val ChildWorkflowExecutionFailed             = "ChildWorkflowExecutionFailed".asInstanceOf[EventType]
    val ChildWorkflowExecutionTimedOut           = "ChildWorkflowExecutionTimedOut".asInstanceOf[EventType]
    val ChildWorkflowExecutionCanceled           = "ChildWorkflowExecutionCanceled".asInstanceOf[EventType]
    val ChildWorkflowExecutionTerminated         = "ChildWorkflowExecutionTerminated".asInstanceOf[EventType]
    val SignalExternalWorkflowExecutionInitiated = "SignalExternalWorkflowExecutionInitiated".asInstanceOf[EventType]
    val SignalExternalWorkflowExecutionFailed    = "SignalExternalWorkflowExecutionFailed".asInstanceOf[EventType]
    val ExternalWorkflowExecutionSignaled        = "ExternalWorkflowExecutionSignaled".asInstanceOf[EventType]
    val RequestCancelExternalWorkflowExecutionInitiated =
      "RequestCancelExternalWorkflowExecutionInitiated".asInstanceOf[EventType]
    val RequestCancelExternalWorkflowExecutionFailed =
      "RequestCancelExternalWorkflowExecutionFailed".asInstanceOf[EventType]
    val ExternalWorkflowExecutionCancelRequested = "ExternalWorkflowExecutionCancelRequested".asInstanceOf[EventType]
    val LambdaFunctionScheduled                  = "LambdaFunctionScheduled".asInstanceOf[EventType]
    val LambdaFunctionStarted                    = "LambdaFunctionStarted".asInstanceOf[EventType]
    val LambdaFunctionCompleted                  = "LambdaFunctionCompleted".asInstanceOf[EventType]
    val LambdaFunctionFailed                     = "LambdaFunctionFailed".asInstanceOf[EventType]
    val LambdaFunctionTimedOut                   = "LambdaFunctionTimedOut".asInstanceOf[EventType]
    val ScheduleLambdaFunctionFailed             = "ScheduleLambdaFunctionFailed".asInstanceOf[EventType]
    val StartLambdaFunctionFailed                = "StartLambdaFunctionFailed".asInstanceOf[EventType]

    val values = js.Object.freeze(
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
    )
  }

  @js.native
  sealed trait ExecutionStatus extends js.Any
  object ExecutionStatus extends js.Object {
    val OPEN   = "OPEN".asInstanceOf[ExecutionStatus]
    val CLOSED = "CLOSED".asInstanceOf[ExecutionStatus]

    val values = js.Object.freeze(js.Array(OPEN, CLOSED))
  }

  /**
    * Used to filter the workflow executions in visibility APIs by various time-based rules. Each parameter, if specified, defines a rule that must be satisfied by each returned query result. The parameter values are in the [[https://en.wikipedia.org/wiki/Unix_time|Unix Time format]]. For example: <code>"oldestDate": 1325376070.</code>
    */
  @js.native
  @Factory
  trait ExecutionTimeFilter extends js.Object {
    var oldestDate: Timestamp
    var latestDate: js.UndefOr[Timestamp]
  }

  /**
    * Provides the details of the <code>ExternalWorkflowExecutionCancelRequested</code> event.
    */
  @js.native
  @Factory
  trait ExternalWorkflowExecutionCancelRequestedEventAttributes extends js.Object {
    var initiatedEventId: EventId
    var workflowExecution: WorkflowExecution
  }

  /**
    * Provides the details of the <code>ExternalWorkflowExecutionSignaled</code> event.
    */
  @js.native
  @Factory
  trait ExternalWorkflowExecutionSignaledEventAttributes extends js.Object {
    var initiatedEventId: EventId
    var workflowExecution: WorkflowExecution
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
  @Factory
  trait FailWorkflowExecutionDecisionAttributes extends js.Object {
    var details: js.UndefOr[Data]
    var reason: js.UndefOr[FailureReason]
  }

  @js.native
  sealed trait FailWorkflowExecutionFailedCause extends js.Any
  object FailWorkflowExecutionFailedCause extends js.Object {
    val UNHANDLED_DECISION      = "UNHANDLED_DECISION".asInstanceOf[FailWorkflowExecutionFailedCause]
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[FailWorkflowExecutionFailedCause]

    val values = js.Object.freeze(js.Array(UNHANDLED_DECISION, OPERATION_NOT_PERMITTED))
  }

  /**
    * Provides the details of the <code>FailWorkflowExecutionFailed</code> event.
    */
  @js.native
  @Factory
  trait FailWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: FailWorkflowExecutionFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  @js.native
  @Factory
  trait GetWorkflowExecutionHistoryInput extends js.Object {
    var domain: DomainName
    var execution: WorkflowExecution
    var maximumPageSize: js.UndefOr[PageSize]
    var nextPageToken: js.UndefOr[PageToken]
    var reverseOrder: js.UndefOr[ReverseOrder]
  }

  /**
    * Paginated representation of a workflow history for a workflow execution. This is the up to date, complete and authoritative record of the events related to all tasks and events in the life of the workflow execution.
    */
  @js.native
  @Factory
  trait History extends js.Object {
    var events: HistoryEventList
    var nextPageToken: js.UndefOr[PageToken]
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
  @Factory
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
    var continueAsNewWorkflowExecutionFailedEventAttributes: js.UndefOr[
      ContinueAsNewWorkflowExecutionFailedEventAttributes
    ]
    var decisionTaskCompletedEventAttributes: js.UndefOr[DecisionTaskCompletedEventAttributes]
    var decisionTaskScheduledEventAttributes: js.UndefOr[DecisionTaskScheduledEventAttributes]
    var decisionTaskStartedEventAttributes: js.UndefOr[DecisionTaskStartedEventAttributes]
    var decisionTaskTimedOutEventAttributes: js.UndefOr[DecisionTaskTimedOutEventAttributes]
    var externalWorkflowExecutionCancelRequestedEventAttributes: js.UndefOr[
      ExternalWorkflowExecutionCancelRequestedEventAttributes
    ]
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
    var requestCancelExternalWorkflowExecutionFailedEventAttributes: js.UndefOr[
      RequestCancelExternalWorkflowExecutionFailedEventAttributes
    ]
    var requestCancelExternalWorkflowExecutionInitiatedEventAttributes: js.UndefOr[
      RequestCancelExternalWorkflowExecutionInitiatedEventAttributes
    ]
    var scheduleActivityTaskFailedEventAttributes: js.UndefOr[ScheduleActivityTaskFailedEventAttributes]
    var scheduleLambdaFunctionFailedEventAttributes: js.UndefOr[ScheduleLambdaFunctionFailedEventAttributes]
    var signalExternalWorkflowExecutionFailedEventAttributes: js.UndefOr[
      SignalExternalWorkflowExecutionFailedEventAttributes
    ]
    var signalExternalWorkflowExecutionInitiatedEventAttributes: js.UndefOr[
      SignalExternalWorkflowExecutionInitiatedEventAttributes
    ]
    var startChildWorkflowExecutionFailedEventAttributes: js.UndefOr[StartChildWorkflowExecutionFailedEventAttributes]
    var startChildWorkflowExecutionInitiatedEventAttributes: js.UndefOr[
      StartChildWorkflowExecutionInitiatedEventAttributes
    ]
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

  /**
    * Provides the details of the <code>LambdaFunctionCompleted</code> event. It isn't set for other event types.
    */
  @js.native
  @Factory
  trait LambdaFunctionCompletedEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var result: js.UndefOr[Data]
  }

  /**
    * Provides the details of the <code>LambdaFunctionFailed</code> event. It isn't set for other event types.
    */
  @js.native
  @Factory
  trait LambdaFunctionFailedEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var details: js.UndefOr[Data]
    var reason: js.UndefOr[FailureReason]
  }

  /**
    * Provides the details of the <code>LambdaFunctionScheduled</code> event. It isn't set for other event types.
    */
  @js.native
  @Factory
  trait LambdaFunctionScheduledEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: EventId
    var id: FunctionId
    var name: FunctionName
    var control: js.UndefOr[Data]
    var input: js.UndefOr[FunctionInput]
    var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
  }

  /**
    * Provides the details of the <code>LambdaFunctionStarted</code> event. It isn't set for other event types.
    */
  @js.native
  @Factory
  trait LambdaFunctionStartedEventAttributes extends js.Object {
    var scheduledEventId: EventId
  }

  /**
    * Provides details of the <code>LambdaFunctionTimedOut</code> event.
    */
  @js.native
  @Factory
  trait LambdaFunctionTimedOutEventAttributes extends js.Object {
    var scheduledEventId: EventId
    var startedEventId: EventId
    var timeoutType: js.UndefOr[LambdaFunctionTimeoutType]
  }

  @js.native
  sealed trait LambdaFunctionTimeoutType extends js.Any
  object LambdaFunctionTimeoutType extends js.Object {
    val START_TO_CLOSE = "START_TO_CLOSE".asInstanceOf[LambdaFunctionTimeoutType]

    val values = js.Object.freeze(js.Array(START_TO_CLOSE))
  }

  @js.native
  @Factory
  trait ListActivityTypesInput extends js.Object {
    var domain: DomainName
    var registrationStatus: RegistrationStatus
    var maximumPageSize: js.UndefOr[PageSize]
    var name: js.UndefOr[Name]
    var nextPageToken: js.UndefOr[PageToken]
    var reverseOrder: js.UndefOr[ReverseOrder]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListDomainsInput extends js.Object {
    var registrationStatus: RegistrationStatus
    var maximumPageSize: js.UndefOr[PageSize]
    var nextPageToken: js.UndefOr[PageToken]
    var reverseOrder: js.UndefOr[ReverseOrder]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListTagsForResourceInput extends js.Object {
    var resourceArn: Arn
  }

  @js.native
  @Factory
  trait ListTagsForResourceOutput extends js.Object {
    var tags: js.UndefOr[ResourceTagList]
  }

  @js.native
  @Factory
  trait ListWorkflowTypesInput extends js.Object {
    var domain: DomainName
    var registrationStatus: RegistrationStatus
    var maximumPageSize: js.UndefOr[PageSize]
    var name: js.UndefOr[Name]
    var nextPageToken: js.UndefOr[PageToken]
    var reverseOrder: js.UndefOr[ReverseOrder]
  }

  /**
    * Provides the details of the <code>MarkerRecorded</code> event.
    */
  @js.native
  @Factory
  trait MarkerRecordedEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: EventId
    var markerName: MarkerName
    var details: js.UndefOr[Data]
  }

  /**
    * Contains the count of tasks in a task list.
    */
  @js.native
  @Factory
  trait PendingTaskCount extends js.Object {
    var count: Count
    var truncated: js.UndefOr[Truncated]
  }

  @js.native
  @Factory
  trait PollForActivityTaskInput extends js.Object {
    var domain: DomainName
    var taskList: TaskList
    var identity: js.UndefOr[Identity]
  }

  @js.native
  @Factory
  trait PollForDecisionTaskInput extends js.Object {
    var domain: DomainName
    var taskList: TaskList
    var identity: js.UndefOr[Identity]
    var maximumPageSize: js.UndefOr[PageSize]
    var nextPageToken: js.UndefOr[PageToken]
    var reverseOrder: js.UndefOr[ReverseOrder]
  }

  @js.native
  @Factory
  trait RecordActivityTaskHeartbeatInput extends js.Object {
    var taskToken: TaskToken
    var details: js.UndefOr[LimitedData]
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
  @Factory
  trait RecordMarkerDecisionAttributes extends js.Object {
    var markerName: MarkerName
    var details: js.UndefOr[Data]
  }

  @js.native
  sealed trait RecordMarkerFailedCause extends js.Any
  object RecordMarkerFailedCause extends js.Object {
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[RecordMarkerFailedCause]

    val values = js.Object.freeze(js.Array(OPERATION_NOT_PERMITTED))
  }

  /**
    * Provides the details of the <code>RecordMarkerFailed</code> event.
    */
  @js.native
  @Factory
  trait RecordMarkerFailedEventAttributes extends js.Object {
    var cause: RecordMarkerFailedCause
    var decisionTaskCompletedEventId: EventId
    var markerName: MarkerName
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait RegisterDomainInput extends js.Object {
    var name: DomainName
    var workflowExecutionRetentionPeriodInDays: DurationInDays
    var description: js.UndefOr[Description]
    var tags: js.UndefOr[ResourceTagList]
  }

  @js.native
  @Factory
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

  @js.native
  sealed trait RegistrationStatus extends js.Any
  object RegistrationStatus extends js.Object {
    val REGISTERED = "REGISTERED".asInstanceOf[RegistrationStatus]
    val DEPRECATED = "DEPRECATED".asInstanceOf[RegistrationStatus]

    val values = js.Object.freeze(js.Array(REGISTERED, DEPRECATED))
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
  @Factory
  trait RequestCancelActivityTaskDecisionAttributes extends js.Object {
    var activityId: ActivityId
  }

  @js.native
  sealed trait RequestCancelActivityTaskFailedCause extends js.Any
  object RequestCancelActivityTaskFailedCause extends js.Object {
    val ACTIVITY_ID_UNKNOWN     = "ACTIVITY_ID_UNKNOWN".asInstanceOf[RequestCancelActivityTaskFailedCause]
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[RequestCancelActivityTaskFailedCause]

    val values = js.Object.freeze(js.Array(ACTIVITY_ID_UNKNOWN, OPERATION_NOT_PERMITTED))
  }

  /**
    * Provides the details of the <code>RequestCancelActivityTaskFailed</code> event.
    */
  @js.native
  @Factory
  trait RequestCancelActivityTaskFailedEventAttributes extends js.Object {
    var activityId: ActivityId
    var cause: RequestCancelActivityTaskFailedCause
    var decisionTaskCompletedEventId: EventId
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
  @Factory
  trait RequestCancelExternalWorkflowExecutionDecisionAttributes extends js.Object {
    var workflowId: WorkflowId
    var control: js.UndefOr[Data]
    var runId: js.UndefOr[WorkflowRunIdOptional]
  }

  @js.native
  sealed trait RequestCancelExternalWorkflowExecutionFailedCause extends js.Any
  object RequestCancelExternalWorkflowExecutionFailedCause extends js.Object {
    val UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION =
      "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION".asInstanceOf[RequestCancelExternalWorkflowExecutionFailedCause]
    val REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED =
      "REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED"
        .asInstanceOf[RequestCancelExternalWorkflowExecutionFailedCause]
    val OPERATION_NOT_PERMITTED =
      "OPERATION_NOT_PERMITTED".asInstanceOf[RequestCancelExternalWorkflowExecutionFailedCause]

    val values = js.Object.freeze(
      js.Array(
        UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION,
        REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED,
        OPERATION_NOT_PERMITTED
      )
    )
  }

  /**
    * Provides the details of the <code>RequestCancelExternalWorkflowExecutionFailed</code> event.
    */
  @js.native
  @Factory
  trait RequestCancelExternalWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: RequestCancelExternalWorkflowExecutionFailedCause
    var decisionTaskCompletedEventId: EventId
    var initiatedEventId: EventId
    var workflowId: WorkflowId
    var control: js.UndefOr[Data]
    var runId: js.UndefOr[WorkflowRunIdOptional]
  }

  /**
    * Provides the details of the <code>RequestCancelExternalWorkflowExecutionInitiated</code> event.
    */
  @js.native
  @Factory
  trait RequestCancelExternalWorkflowExecutionInitiatedEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: EventId
    var workflowId: WorkflowId
    var control: js.UndefOr[Data]
    var runId: js.UndefOr[WorkflowRunIdOptional]
  }

  @js.native
  @Factory
  trait RequestCancelWorkflowExecutionInput extends js.Object {
    var domain: DomainName
    var workflowId: WorkflowId
    var runId: js.UndefOr[WorkflowRunIdOptional]
  }

  /**
    * Tags are key-value pairs that can be associated with Amazon SWF state machines and activities.
    *  Tags may only contain unicode letters, digits, whitespace, or these symbols: <code>_ . : / = + - @</code>.
    */
  @js.native
  @Factory
  trait ResourceTag extends js.Object {
    var key: ResourceTagKey
    var value: js.UndefOr[ResourceTagValue]
  }

  @js.native
  @Factory
  trait RespondActivityTaskCanceledInput extends js.Object {
    var taskToken: TaskToken
    var details: js.UndefOr[Data]
  }

  @js.native
  @Factory
  trait RespondActivityTaskCompletedInput extends js.Object {
    var taskToken: TaskToken
    var result: js.UndefOr[Data]
  }

  @js.native
  @Factory
  trait RespondActivityTaskFailedInput extends js.Object {
    var taskToken: TaskToken
    var details: js.UndefOr[Data]
    var reason: js.UndefOr[FailureReason]
  }

  /**
    * Input data for a TaskCompleted response to a decision task.
    */
  @js.native
  @Factory
  trait RespondDecisionTaskCompletedInput extends js.Object {
    var taskToken: TaskToken
    var decisions: js.UndefOr[DecisionList]
    var executionContext: js.UndefOr[Data]
  }

  /**
    * Specifies the <code>runId</code> of a workflow execution.
    */
  @js.native
  @Factory
  trait Run extends js.Object {
    var runId: js.UndefOr[WorkflowRunId]
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
  @Factory
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

  @js.native
  sealed trait ScheduleActivityTaskFailedCause extends js.Any
  object ScheduleActivityTaskFailedCause extends js.Object {
    val ACTIVITY_TYPE_DEPRECATED       = "ACTIVITY_TYPE_DEPRECATED".asInstanceOf[ScheduleActivityTaskFailedCause]
    val ACTIVITY_TYPE_DOES_NOT_EXIST   = "ACTIVITY_TYPE_DOES_NOT_EXIST".asInstanceOf[ScheduleActivityTaskFailedCause]
    val ACTIVITY_ID_ALREADY_IN_USE     = "ACTIVITY_ID_ALREADY_IN_USE".asInstanceOf[ScheduleActivityTaskFailedCause]
    val OPEN_ACTIVITIES_LIMIT_EXCEEDED = "OPEN_ACTIVITIES_LIMIT_EXCEEDED".asInstanceOf[ScheduleActivityTaskFailedCause]
    val ACTIVITY_CREATION_RATE_EXCEEDED =
      "ACTIVITY_CREATION_RATE_EXCEEDED".asInstanceOf[ScheduleActivityTaskFailedCause]
    val DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED =
      "DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED".asInstanceOf[ScheduleActivityTaskFailedCause]
    val DEFAULT_TASK_LIST_UNDEFINED = "DEFAULT_TASK_LIST_UNDEFINED".asInstanceOf[ScheduleActivityTaskFailedCause]
    val DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED =
      "DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED".asInstanceOf[ScheduleActivityTaskFailedCause]
    val DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED =
      "DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED".asInstanceOf[ScheduleActivityTaskFailedCause]
    val DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED =
      "DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED".asInstanceOf[ScheduleActivityTaskFailedCause]
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[ScheduleActivityTaskFailedCause]

    val values = js.Object.freeze(
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
    )
  }

  /**
    * Provides the details of the <code>ScheduleActivityTaskFailed</code> event.
    */
  @js.native
  @Factory
  trait ScheduleActivityTaskFailedEventAttributes extends js.Object {
    var activityId: ActivityId
    var activityType: ActivityType
    var cause: ScheduleActivityTaskFailedCause
    var decisionTaskCompletedEventId: EventId
  }

  /**
    * Decision attributes specified in <code>scheduleLambdaFunctionDecisionAttributes</code> within the list of decisions <code>decisions</code> passed to <a>RespondDecisionTaskCompleted</a>.
    */
  @js.native
  @Factory
  trait ScheduleLambdaFunctionDecisionAttributes extends js.Object {
    var id: FunctionId
    var name: FunctionName
    var control: js.UndefOr[Data]
    var input: js.UndefOr[FunctionInput]
    var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
  }

  @js.native
  sealed trait ScheduleLambdaFunctionFailedCause extends js.Any
  object ScheduleLambdaFunctionFailedCause extends js.Object {
    val ID_ALREADY_IN_USE = "ID_ALREADY_IN_USE".asInstanceOf[ScheduleLambdaFunctionFailedCause]
    val OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED =
      "OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED".asInstanceOf[ScheduleLambdaFunctionFailedCause]
    val LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED =
      "LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED".asInstanceOf[ScheduleLambdaFunctionFailedCause]
    val LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION =
      "LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION".asInstanceOf[ScheduleLambdaFunctionFailedCause]

    val values = js.Object.freeze(
      js.Array(
        ID_ALREADY_IN_USE,
        OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED,
        LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED,
        LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION
      )
    )
  }

  /**
    * Provides the details of the <code>ScheduleLambdaFunctionFailed</code> event. It isn't set for other event types.
    */
  @js.native
  @Factory
  trait ScheduleLambdaFunctionFailedEventAttributes extends js.Object {
    var cause: ScheduleLambdaFunctionFailedCause
    var decisionTaskCompletedEventId: EventId
    var id: FunctionId
    var name: FunctionName
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
  @Factory
  trait SignalExternalWorkflowExecutionDecisionAttributes extends js.Object {
    var signalName: SignalName
    var workflowId: WorkflowId
    var control: js.UndefOr[Data]
    var input: js.UndefOr[Data]
    var runId: js.UndefOr[WorkflowRunIdOptional]
  }

  @js.native
  sealed trait SignalExternalWorkflowExecutionFailedCause extends js.Any
  object SignalExternalWorkflowExecutionFailedCause extends js.Object {
    val UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION =
      "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION".asInstanceOf[SignalExternalWorkflowExecutionFailedCause]
    val SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED =
      "SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED".asInstanceOf[SignalExternalWorkflowExecutionFailedCause]
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[SignalExternalWorkflowExecutionFailedCause]

    val values = js.Object.freeze(
      js.Array(
        UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION,
        SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED,
        OPERATION_NOT_PERMITTED
      )
    )
  }

  /**
    * Provides the details of the <code>SignalExternalWorkflowExecutionFailed</code> event.
    */
  @js.native
  @Factory
  trait SignalExternalWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: SignalExternalWorkflowExecutionFailedCause
    var decisionTaskCompletedEventId: EventId
    var initiatedEventId: EventId
    var workflowId: WorkflowId
    var control: js.UndefOr[Data]
    var runId: js.UndefOr[WorkflowRunIdOptional]
  }

  /**
    * Provides the details of the <code>SignalExternalWorkflowExecutionInitiated</code> event.
    */
  @js.native
  @Factory
  trait SignalExternalWorkflowExecutionInitiatedEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: EventId
    var signalName: SignalName
    var workflowId: WorkflowId
    var control: js.UndefOr[Data]
    var input: js.UndefOr[Data]
    var runId: js.UndefOr[WorkflowRunIdOptional]
  }

  @js.native
  @Factory
  trait SignalWorkflowExecutionInput extends js.Object {
    var domain: DomainName
    var signalName: SignalName
    var workflowId: WorkflowId
    var input: js.UndefOr[Data]
    var runId: js.UndefOr[WorkflowRunIdOptional]
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
  @Factory
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

  @js.native
  sealed trait StartChildWorkflowExecutionFailedCause extends js.Any
  object StartChildWorkflowExecutionFailedCause extends js.Object {
    val WORKFLOW_TYPE_DOES_NOT_EXIST =
      "WORKFLOW_TYPE_DOES_NOT_EXIST".asInstanceOf[StartChildWorkflowExecutionFailedCause]
    val WORKFLOW_TYPE_DEPRECATED = "WORKFLOW_TYPE_DEPRECATED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
    val OPEN_CHILDREN_LIMIT_EXCEEDED =
      "OPEN_CHILDREN_LIMIT_EXCEEDED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
    val OPEN_WORKFLOWS_LIMIT_EXCEEDED =
      "OPEN_WORKFLOWS_LIMIT_EXCEEDED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
    val CHILD_CREATION_RATE_EXCEEDED =
      "CHILD_CREATION_RATE_EXCEEDED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
    val WORKFLOW_ALREADY_RUNNING = "WORKFLOW_ALREADY_RUNNING".asInstanceOf[StartChildWorkflowExecutionFailedCause]
    val DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED =
      "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
    val DEFAULT_TASK_LIST_UNDEFINED = "DEFAULT_TASK_LIST_UNDEFINED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
    val DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED =
      "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
    val DEFAULT_CHILD_POLICY_UNDEFINED =
      "DEFAULT_CHILD_POLICY_UNDEFINED".asInstanceOf[StartChildWorkflowExecutionFailedCause]
    val OPERATION_NOT_PERMITTED = "OPERATION_NOT_PERMITTED".asInstanceOf[StartChildWorkflowExecutionFailedCause]

    val values = js.Object.freeze(
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
    )
  }

  /**
    * Provides the details of the <code>StartChildWorkflowExecutionFailed</code> event.
    */
  @js.native
  @Factory
  trait StartChildWorkflowExecutionFailedEventAttributes extends js.Object {
    var cause: StartChildWorkflowExecutionFailedCause
    var decisionTaskCompletedEventId: EventId
    var initiatedEventId: EventId
    var workflowId: WorkflowId
    var workflowType: WorkflowType
    var control: js.UndefOr[Data]
  }

  /**
    * Provides the details of the <code>StartChildWorkflowExecutionInitiated</code> event.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait StartLambdaFunctionFailedCause extends js.Any
  object StartLambdaFunctionFailedCause extends js.Object {
    val ASSUME_ROLE_FAILED = "ASSUME_ROLE_FAILED".asInstanceOf[StartLambdaFunctionFailedCause]

    val values = js.Object.freeze(js.Array(ASSUME_ROLE_FAILED))
  }

  /**
    * Provides the details of the <code>StartLambdaFunctionFailed</code> event. It isn't set for other event types.
    */
  @js.native
  @Factory
  trait StartLambdaFunctionFailedEventAttributes extends js.Object {
    var cause: js.UndefOr[StartLambdaFunctionFailedCause]
    var message: js.UndefOr[CauseMessage]
    var scheduledEventId: js.UndefOr[EventId]
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
  @Factory
  trait StartTimerDecisionAttributes extends js.Object {
    var startToFireTimeout: DurationInSeconds
    var timerId: TimerId
    var control: js.UndefOr[Data]
  }

  @js.native
  sealed trait StartTimerFailedCause extends js.Any
  object StartTimerFailedCause extends js.Object {
    val TIMER_ID_ALREADY_IN_USE      = "TIMER_ID_ALREADY_IN_USE".asInstanceOf[StartTimerFailedCause]
    val OPEN_TIMERS_LIMIT_EXCEEDED   = "OPEN_TIMERS_LIMIT_EXCEEDED".asInstanceOf[StartTimerFailedCause]
    val TIMER_CREATION_RATE_EXCEEDED = "TIMER_CREATION_RATE_EXCEEDED".asInstanceOf[StartTimerFailedCause]
    val OPERATION_NOT_PERMITTED      = "OPERATION_NOT_PERMITTED".asInstanceOf[StartTimerFailedCause]

    val values = js.Object.freeze(
      js.Array(
        TIMER_ID_ALREADY_IN_USE,
        OPEN_TIMERS_LIMIT_EXCEEDED,
        TIMER_CREATION_RATE_EXCEEDED,
        OPERATION_NOT_PERMITTED
      )
    )
  }

  /**
    * Provides the details of the <code>StartTimerFailed</code> event.
    */
  @js.native
  @Factory
  trait StartTimerFailedEventAttributes extends js.Object {
    var cause: StartTimerFailedCause
    var decisionTaskCompletedEventId: EventId
    var timerId: TimerId
  }

  @js.native
  @Factory
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

  /**
    * Used to filter the workflow executions in visibility APIs based on a tag.
    */
  @js.native
  @Factory
  trait TagFilter extends js.Object {
    var tag: Tag
  }

  @js.native
  @Factory
  trait TagResourceInput extends js.Object {
    var resourceArn: Arn
    var tags: ResourceTagList
  }

  /**
    * Represents a task list.
    */
  @js.native
  @Factory
  trait TaskList extends js.Object {
    var name: Name
  }

  @js.native
  @Factory
  trait TerminateWorkflowExecutionInput extends js.Object {
    var domain: DomainName
    var workflowId: WorkflowId
    var childPolicy: js.UndefOr[ChildPolicy]
    var details: js.UndefOr[Data]
    var reason: js.UndefOr[TerminateReason]
    var runId: js.UndefOr[WorkflowRunIdOptional]
  }

  /**
    * Provides the details of the <code>TimerCanceled</code> event.
    */
  @js.native
  @Factory
  trait TimerCanceledEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: EventId
    var startedEventId: EventId
    var timerId: TimerId
  }

  /**
    * Provides the details of the <code>TimerFired</code> event.
    */
  @js.native
  @Factory
  trait TimerFiredEventAttributes extends js.Object {
    var startedEventId: EventId
    var timerId: TimerId
  }

  /**
    * Provides the details of the <code>TimerStarted</code> event.
    */
  @js.native
  @Factory
  trait TimerStartedEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: EventId
    var startToFireTimeout: DurationInSeconds
    var timerId: TimerId
    var control: js.UndefOr[Data]
  }

  @js.native
  @Factory
  trait UndeprecateActivityTypeInput extends js.Object {
    var activityType: ActivityType
    var domain: DomainName
  }

  @js.native
  @Factory
  trait UndeprecateDomainInput extends js.Object {
    var name: DomainName
  }

  @js.native
  @Factory
  trait UndeprecateWorkflowTypeInput extends js.Object {
    var domain: DomainName
    var workflowType: WorkflowType
  }

  @js.native
  @Factory
  trait UntagResourceInput extends js.Object {
    var resourceArn: Arn
    var tagKeys: ResourceTagKeyList
  }

  /**
    * Represents a workflow execution.
    */
  @js.native
  @Factory
  trait WorkflowExecution extends js.Object {
    var runId: WorkflowRunId
    var workflowId: WorkflowId
  }

  @js.native
  sealed trait WorkflowExecutionCancelRequestedCause extends js.Any
  object WorkflowExecutionCancelRequestedCause extends js.Object {
    val CHILD_POLICY_APPLIED = "CHILD_POLICY_APPLIED".asInstanceOf[WorkflowExecutionCancelRequestedCause]

    val values = js.Object.freeze(js.Array(CHILD_POLICY_APPLIED))
  }

  /**
    * Provides the details of the <code>WorkflowExecutionCancelRequested</code> event.
    */
  @js.native
  @Factory
  trait WorkflowExecutionCancelRequestedEventAttributes extends js.Object {
    var cause: js.UndefOr[WorkflowExecutionCancelRequestedCause]
    var externalInitiatedEventId: js.UndefOr[EventId]
    var externalWorkflowExecution: js.UndefOr[WorkflowExecution]
  }

  /**
    * Provides the details of the <code>WorkflowExecutionCanceled</code> event.
    */
  @js.native
  @Factory
  trait WorkflowExecutionCanceledEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: EventId
    var details: js.UndefOr[Data]
  }

  /**
    * Provides the details of the <code>WorkflowExecutionCompleted</code> event.
    */
  @js.native
  @Factory
  trait WorkflowExecutionCompletedEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: EventId
    var result: js.UndefOr[Data]
  }

  /**
    * The configuration settings for a workflow execution including timeout values, tasklist etc. These configuration settings are determined from the defaults specified when registering the workflow type and those specified when starting the workflow execution.
    */
  @js.native
  @Factory
  trait WorkflowExecutionConfiguration extends js.Object {
    var childPolicy: ChildPolicy
    var executionStartToCloseTimeout: DurationInSeconds
    var taskList: TaskList
    var taskStartToCloseTimeout: DurationInSeconds
    var lambdaRole: js.UndefOr[Arn]
    var taskPriority: js.UndefOr[TaskPriority]
  }

  /**
    * Provides the details of the <code>WorkflowExecutionContinuedAsNew</code> event.
    */
  @js.native
  @Factory
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

  /**
    * Contains the count of workflow executions returned from <a>CountOpenWorkflowExecutions</a> or <a>CountClosedWorkflowExecutions</a>
    */
  @js.native
  @Factory
  trait WorkflowExecutionCount extends js.Object {
    var count: Count
    var truncated: js.UndefOr[Truncated]
  }

  /**
    * Contains details about a workflow execution.
    */
  @js.native
  @Factory
  trait WorkflowExecutionDetail extends js.Object {
    var executionConfiguration: WorkflowExecutionConfiguration
    var executionInfo: WorkflowExecutionInfo
    var openCounts: WorkflowExecutionOpenCounts
    var latestActivityTaskTimestamp: js.UndefOr[Timestamp]
    var latestExecutionContext: js.UndefOr[Data]
  }

  /**
    * Provides the details of the <code>WorkflowExecutionFailed</code> event.
    */
  @js.native
  @Factory
  trait WorkflowExecutionFailedEventAttributes extends js.Object {
    var decisionTaskCompletedEventId: EventId
    var details: js.UndefOr[Data]
    var reason: js.UndefOr[FailureReason]
  }

  /**
    * Used to filter the workflow executions in visibility APIs by their <code>workflowId</code>.
    */
  @js.native
  @Factory
  trait WorkflowExecutionFilter extends js.Object {
    var workflowId: WorkflowId
  }

  /**
    * Contains information about a workflow execution.
    */
  @js.native
  @Factory
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

  /**
    * Contains a paginated list of information about workflow executions.
    */
  @js.native
  @Factory
  trait WorkflowExecutionInfos extends js.Object {
    var executionInfos: WorkflowExecutionInfoList
    var nextPageToken: js.UndefOr[PageToken]
  }

  /**
    * Contains the counts of open tasks, child workflow executions and timers for a workflow execution.
    */
  @js.native
  @Factory
  trait WorkflowExecutionOpenCounts extends js.Object {
    var openActivityTasks: Count
    var openChildWorkflowExecutions: Count
    var openDecisionTasks: OpenDecisionTasksCount
    var openTimers: Count
    var openLambdaFunctions: js.UndefOr[Count]
  }

  /**
    * Provides the details of the <code>WorkflowExecutionSignaled</code> event.
    */
  @js.native
  @Factory
  trait WorkflowExecutionSignaledEventAttributes extends js.Object {
    var signalName: SignalName
    var externalInitiatedEventId: js.UndefOr[EventId]
    var externalWorkflowExecution: js.UndefOr[WorkflowExecution]
    var input: js.UndefOr[Data]
  }

  /**
    * Provides details of <code>WorkflowExecutionStarted</code> event.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait WorkflowExecutionTerminatedCause extends js.Any
  object WorkflowExecutionTerminatedCause extends js.Object {
    val CHILD_POLICY_APPLIED = "CHILD_POLICY_APPLIED".asInstanceOf[WorkflowExecutionTerminatedCause]
    val EVENT_LIMIT_EXCEEDED = "EVENT_LIMIT_EXCEEDED".asInstanceOf[WorkflowExecutionTerminatedCause]
    val OPERATOR_INITIATED   = "OPERATOR_INITIATED".asInstanceOf[WorkflowExecutionTerminatedCause]

    val values = js.Object.freeze(js.Array(CHILD_POLICY_APPLIED, EVENT_LIMIT_EXCEEDED, OPERATOR_INITIATED))
  }

  /**
    * Provides the details of the <code>WorkflowExecutionTerminated</code> event.
    */
  @js.native
  @Factory
  trait WorkflowExecutionTerminatedEventAttributes extends js.Object {
    var childPolicy: ChildPolicy
    var cause: js.UndefOr[WorkflowExecutionTerminatedCause]
    var details: js.UndefOr[Data]
    var reason: js.UndefOr[TerminateReason]
  }

  /**
    * Provides the details of the <code>WorkflowExecutionTimedOut</code> event.
    */
  @js.native
  @Factory
  trait WorkflowExecutionTimedOutEventAttributes extends js.Object {
    var childPolicy: ChildPolicy
    var timeoutType: WorkflowExecutionTimeoutType
  }

  @js.native
  sealed trait WorkflowExecutionTimeoutType extends js.Any
  object WorkflowExecutionTimeoutType extends js.Object {
    val START_TO_CLOSE = "START_TO_CLOSE".asInstanceOf[WorkflowExecutionTimeoutType]

    val values = js.Object.freeze(js.Array(START_TO_CLOSE))
  }

  /**
    * Represents a workflow type.
    */
  @js.native
  @Factory
  trait WorkflowType extends js.Object {
    var name: Name
    var version: Version
  }

  /**
    * The configuration settings of a workflow type.
    */
  @js.native
  @Factory
  trait WorkflowTypeConfiguration extends js.Object {
    var defaultChildPolicy: js.UndefOr[ChildPolicy]
    var defaultExecutionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
    var defaultLambdaRole: js.UndefOr[Arn]
    var defaultTaskList: js.UndefOr[TaskList]
    var defaultTaskPriority: js.UndefOr[TaskPriority]
    var defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional]
  }

  /**
    * Contains details about a workflow type.
    */
  @js.native
  @Factory
  trait WorkflowTypeDetail extends js.Object {
    var configuration: WorkflowTypeConfiguration
    var typeInfo: WorkflowTypeInfo
  }

  /**
    * Used to filter workflow execution query results by type. Each parameter, if specified, defines a rule that must be satisfied by each returned result.
    */
  @js.native
  @Factory
  trait WorkflowTypeFilter extends js.Object {
    var name: Name
    var version: js.UndefOr[VersionOptional]
  }

  /**
    * Contains information about a workflow type.
    */
  @js.native
  @Factory
  trait WorkflowTypeInfo extends js.Object {
    var creationDate: Timestamp
    var status: RegistrationStatus
    var workflowType: WorkflowType
    var deprecationDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
  }

  /**
    * Contains a paginated list of information structures about workflow types.
    */
  @js.native
  @Factory
  trait WorkflowTypeInfos extends js.Object {
    var typeInfos: WorkflowTypeInfoList
    var nextPageToken: js.UndefOr[PageToken]
  }
}
