package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object cloudwatchlogs {
  type AccessPolicy                = String
  type Arn                         = String
  type Days                        = Int
  type DefaultValue                = Double
  type Descending                  = Boolean
  type DescribeLimit               = Int
  type DescribeQueriesMaxResults   = Int
  type DestinationArn              = String
  type DestinationName             = String
  type Destinations                = js.Array[Destination]
  type EventId                     = String
  type EventMessage                = String
  type EventNumber                 = Double
  type EventsLimit                 = Int
  type ExportDestinationBucket     = String
  type ExportDestinationPrefix     = String
  type ExportTaskId                = String
  type ExportTaskName              = String
  type ExportTaskStatusMessage     = String
  type ExportTasks                 = js.Array[ExportTask]
  type ExtractedValues             = js.Dictionary[Value]
  type Field                       = String
  type FilterCount                 = Int
  type FilterName                  = String
  type FilterPattern               = String
  type FilteredLogEvents           = js.Array[FilteredLogEvent]
  type InputLogEvents              = js.Array[InputLogEvent]
  type InputLogStreamNames         = js.Array[LogStreamName]
  type Interleaved                 = Boolean
  type KmsKeyId                    = String
  type LogEventIndex               = Int
  type LogGroupFieldList           = js.Array[LogGroupField]
  type LogGroupName                = String
  type LogGroupNames               = js.Array[LogGroupName]
  type LogGroups                   = js.Array[LogGroup]
  type LogRecord                   = js.Dictionary[Value]
  type LogRecordPointer            = String
  type LogStreamName               = String
  type LogStreamSearchedCompletely = Boolean
  type LogStreams                  = js.Array[LogStream]
  type MetricFilterMatches         = js.Array[MetricFilterMatchRecord]
  type MetricFilters               = js.Array[MetricFilter]
  type MetricName                  = String
  type MetricNamespace             = String
  type MetricTransformations       = js.Array[MetricTransformation]
  type MetricValue                 = String
  type NextToken                   = String
  type OutputLogEvents             = js.Array[OutputLogEvent]
  type Percentage                  = Int
  type PolicyDocument              = String
  type PolicyName                  = String
  type QueryId                     = String
  type QueryInfoList               = js.Array[QueryInfo]
  type QueryResults                = js.Array[ResultRows]
  type QueryString                 = String
  type ResourcePolicies            = js.Array[ResourcePolicy]
  type ResultRows                  = js.Array[ResultField]
  type RoleArn                     = String
  type SearchedLogStreams          = js.Array[SearchedLogStream]
  type SequenceToken               = String
  type StartFromHead               = Boolean
  type StatsValue                  = Double
  type StoredBytes                 = Double
  type SubscriptionFilters         = js.Array[SubscriptionFilter]
  type Success                     = Boolean
  type TagKey                      = String
  type TagList                     = js.Array[TagKey]
  type TagValue                    = String
  type Tags                        = js.Dictionary[TagValue]
  type TargetArn                   = String
  type TestEventMessages           = js.Array[EventMessage]
  type Timestamp                   = Double
  type Token                       = String
  type Value                       = String

  implicit final class CloudWatchLogsOps(private val service: CloudWatchLogs) extends AnyVal {

    @inline def associateKmsKeyFuture(params: AssociateKmsKeyRequest): Future[js.Object] =
      service.associateKmsKey(params).promise().toFuture
    @inline def cancelExportTaskFuture(params: CancelExportTaskRequest): Future[js.Object] =
      service.cancelExportTask(params).promise().toFuture
    @inline def createExportTaskFuture(params: CreateExportTaskRequest): Future[CreateExportTaskResponse] =
      service.createExportTask(params).promise().toFuture
    @inline def createLogGroupFuture(params: CreateLogGroupRequest): Future[js.Object] =
      service.createLogGroup(params).promise().toFuture
    @inline def createLogStreamFuture(params: CreateLogStreamRequest): Future[js.Object] =
      service.createLogStream(params).promise().toFuture
    @inline def deleteDestinationFuture(params: DeleteDestinationRequest): Future[js.Object] =
      service.deleteDestination(params).promise().toFuture
    @inline def deleteLogGroupFuture(params: DeleteLogGroupRequest): Future[js.Object] =
      service.deleteLogGroup(params).promise().toFuture
    @inline def deleteLogStreamFuture(params: DeleteLogStreamRequest): Future[js.Object] =
      service.deleteLogStream(params).promise().toFuture
    @inline def deleteMetricFilterFuture(params: DeleteMetricFilterRequest): Future[js.Object] =
      service.deleteMetricFilter(params).promise().toFuture
    @inline def deleteResourcePolicyFuture(params: DeleteResourcePolicyRequest): Future[js.Object] =
      service.deleteResourcePolicy(params).promise().toFuture
    @inline def deleteRetentionPolicyFuture(params: DeleteRetentionPolicyRequest): Future[js.Object] =
      service.deleteRetentionPolicy(params).promise().toFuture
    @inline def deleteSubscriptionFilterFuture(params: DeleteSubscriptionFilterRequest): Future[js.Object] =
      service.deleteSubscriptionFilter(params).promise().toFuture
    @inline def describeDestinationsFuture(params: DescribeDestinationsRequest): Future[DescribeDestinationsResponse] =
      service.describeDestinations(params).promise().toFuture
    @inline def describeExportTasksFuture(params: DescribeExportTasksRequest): Future[DescribeExportTasksResponse] =
      service.describeExportTasks(params).promise().toFuture
    @inline def describeLogGroupsFuture(params: DescribeLogGroupsRequest): Future[DescribeLogGroupsResponse] =
      service.describeLogGroups(params).promise().toFuture
    @inline def describeLogStreamsFuture(params: DescribeLogStreamsRequest): Future[DescribeLogStreamsResponse] =
      service.describeLogStreams(params).promise().toFuture
    @inline def describeMetricFiltersFuture(
        params: DescribeMetricFiltersRequest
    ): Future[DescribeMetricFiltersResponse] = service.describeMetricFilters(params).promise().toFuture
    @inline def describeQueriesFuture(params: DescribeQueriesRequest): Future[DescribeQueriesResponse] =
      service.describeQueries(params).promise().toFuture
    @inline def describeResourcePoliciesFuture(
        params: DescribeResourcePoliciesRequest
    ): Future[DescribeResourcePoliciesResponse] = service.describeResourcePolicies(params).promise().toFuture
    @inline def describeSubscriptionFiltersFuture(
        params: DescribeSubscriptionFiltersRequest
    ): Future[DescribeSubscriptionFiltersResponse] = service.describeSubscriptionFilters(params).promise().toFuture
    @inline def disassociateKmsKeyFuture(params: DisassociateKmsKeyRequest): Future[js.Object] =
      service.disassociateKmsKey(params).promise().toFuture
    @inline def filterLogEventsFuture(params: FilterLogEventsRequest): Future[FilterLogEventsResponse] =
      service.filterLogEvents(params).promise().toFuture
    @inline def getLogEventsFuture(params: GetLogEventsRequest): Future[GetLogEventsResponse] =
      service.getLogEvents(params).promise().toFuture
    @inline def getLogGroupFieldsFuture(params: GetLogGroupFieldsRequest): Future[GetLogGroupFieldsResponse] =
      service.getLogGroupFields(params).promise().toFuture
    @inline def getLogRecordFuture(params: GetLogRecordRequest): Future[GetLogRecordResponse] =
      service.getLogRecord(params).promise().toFuture
    @inline def getQueryResultsFuture(params: GetQueryResultsRequest): Future[GetQueryResultsResponse] =
      service.getQueryResults(params).promise().toFuture
    @inline def listTagsLogGroupFuture(params: ListTagsLogGroupRequest): Future[ListTagsLogGroupResponse] =
      service.listTagsLogGroup(params).promise().toFuture
    @inline def putDestinationFuture(params: PutDestinationRequest): Future[PutDestinationResponse] =
      service.putDestination(params).promise().toFuture
    @inline def putDestinationPolicyFuture(params: PutDestinationPolicyRequest): Future[js.Object] =
      service.putDestinationPolicy(params).promise().toFuture
    @inline def putLogEventsFuture(params: PutLogEventsRequest): Future[PutLogEventsResponse] =
      service.putLogEvents(params).promise().toFuture
    @inline def putMetricFilterFuture(params: PutMetricFilterRequest): Future[js.Object] =
      service.putMetricFilter(params).promise().toFuture
    @inline def putResourcePolicyFuture(params: PutResourcePolicyRequest): Future[PutResourcePolicyResponse] =
      service.putResourcePolicy(params).promise().toFuture
    @inline def putRetentionPolicyFuture(params: PutRetentionPolicyRequest): Future[js.Object] =
      service.putRetentionPolicy(params).promise().toFuture
    @inline def putSubscriptionFilterFuture(params: PutSubscriptionFilterRequest): Future[js.Object] =
      service.putSubscriptionFilter(params).promise().toFuture
    @inline def startQueryFuture(params: StartQueryRequest): Future[StartQueryResponse] =
      service.startQuery(params).promise().toFuture
    @inline def stopQueryFuture(params: StopQueryRequest): Future[StopQueryResponse] =
      service.stopQuery(params).promise().toFuture
    @inline def tagLogGroupFuture(params: TagLogGroupRequest): Future[js.Object] =
      service.tagLogGroup(params).promise().toFuture
    @inline def testMetricFilterFuture(params: TestMetricFilterRequest): Future[TestMetricFilterResponse] =
      service.testMetricFilter(params).promise().toFuture
    @inline def untagLogGroupFuture(params: UntagLogGroupRequest): Future[js.Object] =
      service.untagLogGroup(params).promise().toFuture
  }
}

package cloudwatchlogs {
  @js.native
  @JSImport("aws-sdk", "CloudWatchLogs")
  class CloudWatchLogs() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateKmsKey(params: AssociateKmsKeyRequest): Request[js.Object]                                 = js.native
    def cancelExportTask(params: CancelExportTaskRequest): Request[js.Object]                               = js.native
    def createExportTask(params: CreateExportTaskRequest): Request[CreateExportTaskResponse]                = js.native
    def createLogGroup(params: CreateLogGroupRequest): Request[js.Object]                                   = js.native
    def createLogStream(params: CreateLogStreamRequest): Request[js.Object]                                 = js.native
    def deleteDestination(params: DeleteDestinationRequest): Request[js.Object]                             = js.native
    def deleteLogGroup(params: DeleteLogGroupRequest): Request[js.Object]                                   = js.native
    def deleteLogStream(params: DeleteLogStreamRequest): Request[js.Object]                                 = js.native
    def deleteMetricFilter(params: DeleteMetricFilterRequest): Request[js.Object]                           = js.native
    def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[js.Object]                       = js.native
    def deleteRetentionPolicy(params: DeleteRetentionPolicyRequest): Request[js.Object]                     = js.native
    def deleteSubscriptionFilter(params: DeleteSubscriptionFilterRequest): Request[js.Object]               = js.native
    def describeDestinations(params: DescribeDestinationsRequest): Request[DescribeDestinationsResponse]    = js.native
    def describeExportTasks(params: DescribeExportTasksRequest): Request[DescribeExportTasksResponse]       = js.native
    def describeLogGroups(params: DescribeLogGroupsRequest): Request[DescribeLogGroupsResponse]             = js.native
    def describeLogStreams(params: DescribeLogStreamsRequest): Request[DescribeLogStreamsResponse]          = js.native
    def describeMetricFilters(params: DescribeMetricFiltersRequest): Request[DescribeMetricFiltersResponse] = js.native
    def describeQueries(params: DescribeQueriesRequest): Request[DescribeQueriesResponse]                   = js.native
    def describeResourcePolicies(params: DescribeResourcePoliciesRequest): Request[DescribeResourcePoliciesResponse] =
      js.native
    def describeSubscriptionFilters(
        params: DescribeSubscriptionFiltersRequest
    ): Request[DescribeSubscriptionFiltersResponse]                                             = js.native
    def disassociateKmsKey(params: DisassociateKmsKeyRequest): Request[js.Object]               = js.native
    def filterLogEvents(params: FilterLogEventsRequest): Request[FilterLogEventsResponse]       = js.native
    def getLogEvents(params: GetLogEventsRequest): Request[GetLogEventsResponse]                = js.native
    def getLogGroupFields(params: GetLogGroupFieldsRequest): Request[GetLogGroupFieldsResponse] = js.native
    def getLogRecord(params: GetLogRecordRequest): Request[GetLogRecordResponse]                = js.native
    def getQueryResults(params: GetQueryResultsRequest): Request[GetQueryResultsResponse]       = js.native
    def listTagsLogGroup(params: ListTagsLogGroupRequest): Request[ListTagsLogGroupResponse]    = js.native
    def putDestination(params: PutDestinationRequest): Request[PutDestinationResponse]          = js.native
    def putDestinationPolicy(params: PutDestinationPolicyRequest): Request[js.Object]           = js.native
    def putLogEvents(params: PutLogEventsRequest): Request[PutLogEventsResponse]                = js.native
    def putMetricFilter(params: PutMetricFilterRequest): Request[js.Object]                     = js.native
    def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse] = js.native
    def putRetentionPolicy(params: PutRetentionPolicyRequest): Request[js.Object]               = js.native
    def putSubscriptionFilter(params: PutSubscriptionFilterRequest): Request[js.Object]         = js.native
    def startQuery(params: StartQueryRequest): Request[StartQueryResponse]                      = js.native
    def stopQuery(params: StopQueryRequest): Request[StopQueryResponse]                         = js.native
    def tagLogGroup(params: TagLogGroupRequest): Request[js.Object]                             = js.native
    def testMetricFilter(params: TestMetricFilterRequest): Request[TestMetricFilterResponse]    = js.native
    def untagLogGroup(params: UntagLogGroupRequest): Request[js.Object]                         = js.native
  }

  @js.native
  @Factory
  trait AssociateKmsKeyRequest extends js.Object {
    var kmsKeyId: KmsKeyId
    var logGroupName: LogGroupName
  }

  @js.native
  @Factory
  trait CancelExportTaskRequest extends js.Object {
    var taskId: ExportTaskId
  }

  @js.native
  @Factory
  trait CreateExportTaskRequest extends js.Object {
    var destination: ExportDestinationBucket
    var from: Timestamp
    var logGroupName: LogGroupName
    var to: Timestamp
    var destinationPrefix: js.UndefOr[ExportDestinationPrefix]
    var logStreamNamePrefix: js.UndefOr[LogStreamName]
    var taskName: js.UndefOr[ExportTaskName]
  }

  @js.native
  @Factory
  trait CreateExportTaskResponse extends js.Object {
    var taskId: js.UndefOr[ExportTaskId]
  }

  @js.native
  @Factory
  trait CreateLogGroupRequest extends js.Object {
    var logGroupName: LogGroupName
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateLogStreamRequest extends js.Object {
    var logGroupName: LogGroupName
    var logStreamName: LogStreamName
  }

  @js.native
  @Factory
  trait DeleteDestinationRequest extends js.Object {
    var destinationName: DestinationName
  }

  @js.native
  @Factory
  trait DeleteLogGroupRequest extends js.Object {
    var logGroupName: LogGroupName
  }

  @js.native
  @Factory
  trait DeleteLogStreamRequest extends js.Object {
    var logGroupName: LogGroupName
    var logStreamName: LogStreamName
  }

  @js.native
  @Factory
  trait DeleteMetricFilterRequest extends js.Object {
    var filterName: FilterName
    var logGroupName: LogGroupName
  }

  @js.native
  @Factory
  trait DeleteResourcePolicyRequest extends js.Object {
    var policyName: js.UndefOr[PolicyName]
  }

  @js.native
  @Factory
  trait DeleteRetentionPolicyRequest extends js.Object {
    var logGroupName: LogGroupName
  }

  @js.native
  @Factory
  trait DeleteSubscriptionFilterRequest extends js.Object {
    var filterName: FilterName
    var logGroupName: LogGroupName
  }

  @js.native
  @Factory
  trait DescribeDestinationsRequest extends js.Object {
    var DestinationNamePrefix: js.UndefOr[DestinationName]
    var limit: js.UndefOr[DescribeLimit]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeDestinationsResponse extends js.Object {
    var destinations: js.UndefOr[Destinations]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeExportTasksRequest extends js.Object {
    var limit: js.UndefOr[DescribeLimit]
    var nextToken: js.UndefOr[NextToken]
    var statusCode: js.UndefOr[ExportTaskStatusCode]
    var taskId: js.UndefOr[ExportTaskId]
  }

  @js.native
  @Factory
  trait DescribeExportTasksResponse extends js.Object {
    var exportTasks: js.UndefOr[ExportTasks]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeLogGroupsRequest extends js.Object {
    var limit: js.UndefOr[DescribeLimit]
    var logGroupNamePrefix: js.UndefOr[LogGroupName]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeLogGroupsResponse extends js.Object {
    var logGroups: js.UndefOr[LogGroups]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeLogStreamsRequest extends js.Object {
    var logGroupName: LogGroupName
    var descending: js.UndefOr[Descending]
    var limit: js.UndefOr[DescribeLimit]
    var logStreamNamePrefix: js.UndefOr[LogStreamName]
    var nextToken: js.UndefOr[NextToken]
    var orderBy: js.UndefOr[OrderBy]
  }

  @js.native
  @Factory
  trait DescribeLogStreamsResponse extends js.Object {
    var logStreams: js.UndefOr[LogStreams]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeMetricFiltersRequest extends js.Object {
    var filterNamePrefix: js.UndefOr[FilterName]
    var limit: js.UndefOr[DescribeLimit]
    var logGroupName: js.UndefOr[LogGroupName]
    var metricName: js.UndefOr[MetricName]
    var metricNamespace: js.UndefOr[MetricNamespace]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeMetricFiltersResponse extends js.Object {
    var metricFilters: js.UndefOr[MetricFilters]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeQueriesRequest extends js.Object {
    var logGroupName: js.UndefOr[LogGroupName]
    var maxResults: js.UndefOr[DescribeQueriesMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var status: js.UndefOr[QueryStatus]
  }

  @js.native
  @Factory
  trait DescribeQueriesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var queries: js.UndefOr[QueryInfoList]
  }

  @js.native
  @Factory
  trait DescribeResourcePoliciesRequest extends js.Object {
    var limit: js.UndefOr[DescribeLimit]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeResourcePoliciesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var resourcePolicies: js.UndefOr[ResourcePolicies]
  }

  @js.native
  @Factory
  trait DescribeSubscriptionFiltersRequest extends js.Object {
    var logGroupName: LogGroupName
    var filterNamePrefix: js.UndefOr[FilterName]
    var limit: js.UndefOr[DescribeLimit]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeSubscriptionFiltersResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var subscriptionFilters: js.UndefOr[SubscriptionFilters]
  }

  /**
    * Represents a cross-account destination that receives subscription log events.
    */
  @js.native
  @Factory
  trait Destination extends js.Object {
    var accessPolicy: js.UndefOr[AccessPolicy]
    var arn: js.UndefOr[Arn]
    var creationTime: js.UndefOr[Timestamp]
    var destinationName: js.UndefOr[DestinationName]
    var roleArn: js.UndefOr[RoleArn]
    var targetArn: js.UndefOr[TargetArn]
  }

  @js.native
  @Factory
  trait DisassociateKmsKeyRequest extends js.Object {
    var logGroupName: LogGroupName
  }

  /**
    * The method used to distribute log data to the destination, which can be either random or grouped by log stream.
    */
  @js.native
  sealed trait Distribution extends js.Any
  object Distribution extends js.Object {
    val Random      = "Random".asInstanceOf[Distribution]
    val ByLogStream = "ByLogStream".asInstanceOf[Distribution]

    val values = js.Object.freeze(js.Array(Random, ByLogStream))
  }

  /**
    * Represents an export task.
    */
  @js.native
  @Factory
  trait ExportTask extends js.Object {
    var destination: js.UndefOr[ExportDestinationBucket]
    var destinationPrefix: js.UndefOr[ExportDestinationPrefix]
    var executionInfo: js.UndefOr[ExportTaskExecutionInfo]
    var from: js.UndefOr[Timestamp]
    var logGroupName: js.UndefOr[LogGroupName]
    var status: js.UndefOr[ExportTaskStatus]
    var taskId: js.UndefOr[ExportTaskId]
    var taskName: js.UndefOr[ExportTaskName]
    var to: js.UndefOr[Timestamp]
  }

  /**
    * Represents the status of an export task.
    */
  @js.native
  @Factory
  trait ExportTaskExecutionInfo extends js.Object {
    var completionTime: js.UndefOr[Timestamp]
    var creationTime: js.UndefOr[Timestamp]
  }

  /**
    * Represents the status of an export task.
    */
  @js.native
  @Factory
  trait ExportTaskStatus extends js.Object {
    var code: js.UndefOr[ExportTaskStatusCode]
    var message: js.UndefOr[ExportTaskStatusMessage]
  }

  @js.native
  sealed trait ExportTaskStatusCode extends js.Any
  object ExportTaskStatusCode extends js.Object {
    val CANCELLED      = "CANCELLED".asInstanceOf[ExportTaskStatusCode]
    val COMPLETED      = "COMPLETED".asInstanceOf[ExportTaskStatusCode]
    val FAILED         = "FAILED".asInstanceOf[ExportTaskStatusCode]
    val PENDING        = "PENDING".asInstanceOf[ExportTaskStatusCode]
    val PENDING_CANCEL = "PENDING_CANCEL".asInstanceOf[ExportTaskStatusCode]
    val RUNNING        = "RUNNING".asInstanceOf[ExportTaskStatusCode]

    val values = js.Object.freeze(js.Array(CANCELLED, COMPLETED, FAILED, PENDING, PENDING_CANCEL, RUNNING))
  }

  @js.native
  @Factory
  trait FilterLogEventsRequest extends js.Object {
    var logGroupName: LogGroupName
    var endTime: js.UndefOr[Timestamp]
    var filterPattern: js.UndefOr[FilterPattern]
    var interleaved: js.UndefOr[Interleaved]
    var limit: js.UndefOr[EventsLimit]
    var logStreamNamePrefix: js.UndefOr[LogStreamName]
    var logStreamNames: js.UndefOr[InputLogStreamNames]
    var nextToken: js.UndefOr[NextToken]
    var startTime: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait FilterLogEventsResponse extends js.Object {
    var events: js.UndefOr[FilteredLogEvents]
    var nextToken: js.UndefOr[NextToken]
    var searchedLogStreams: js.UndefOr[SearchedLogStreams]
  }

  /**
    * Represents a matched event.
    */
  @js.native
  @Factory
  trait FilteredLogEvent extends js.Object {
    var eventId: js.UndefOr[EventId]
    var ingestionTime: js.UndefOr[Timestamp]
    var logStreamName: js.UndefOr[LogStreamName]
    var message: js.UndefOr[EventMessage]
    var timestamp: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait GetLogEventsRequest extends js.Object {
    var logGroupName: LogGroupName
    var logStreamName: LogStreamName
    var endTime: js.UndefOr[Timestamp]
    var limit: js.UndefOr[EventsLimit]
    var nextToken: js.UndefOr[NextToken]
    var startFromHead: js.UndefOr[StartFromHead]
    var startTime: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait GetLogEventsResponse extends js.Object {
    var events: js.UndefOr[OutputLogEvents]
    var nextBackwardToken: js.UndefOr[NextToken]
    var nextForwardToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetLogGroupFieldsRequest extends js.Object {
    var logGroupName: LogGroupName
    var time: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait GetLogGroupFieldsResponse extends js.Object {
    var logGroupFields: js.UndefOr[LogGroupFieldList]
  }

  @js.native
  @Factory
  trait GetLogRecordRequest extends js.Object {
    var logRecordPointer: LogRecordPointer
  }

  @js.native
  @Factory
  trait GetLogRecordResponse extends js.Object {
    var logRecord: js.UndefOr[LogRecord]
  }

  @js.native
  @Factory
  trait GetQueryResultsRequest extends js.Object {
    var queryId: QueryId
  }

  @js.native
  @Factory
  trait GetQueryResultsResponse extends js.Object {
    var results: js.UndefOr[QueryResults]
    var statistics: js.UndefOr[QueryStatistics]
    var status: js.UndefOr[QueryStatus]
  }

  /**
    * Represents a log event, which is a record of activity that was recorded by the application or resource being monitored.
    */
  @js.native
  @Factory
  trait InputLogEvent extends js.Object {
    var message: EventMessage
    var timestamp: Timestamp
  }

  @js.native
  @Factory
  trait ListTagsLogGroupRequest extends js.Object {
    var logGroupName: LogGroupName
  }

  @js.native
  @Factory
  trait ListTagsLogGroupResponse extends js.Object {
    var tags: js.UndefOr[Tags]
  }

  /**
    * Represents a log group.
    */
  @js.native
  @Factory
  trait LogGroup extends js.Object {
    var arn: js.UndefOr[Arn]
    var creationTime: js.UndefOr[Timestamp]
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var logGroupName: js.UndefOr[LogGroupName]
    var metricFilterCount: js.UndefOr[FilterCount]
    var retentionInDays: js.UndefOr[Days]
    var storedBytes: js.UndefOr[StoredBytes]
  }

  /**
    * The fields contained in log events found by a <code>GetLogGroupFields</code> operation, along with the percentage of queried log events in which each field appears.
    */
  @js.native
  @Factory
  trait LogGroupField extends js.Object {
    var name: js.UndefOr[Field]
    var percent: js.UndefOr[Percentage]
  }

  /**
    * Represents a log stream, which is a sequence of log events from a single emitter of logs.
    */
  @js.native
  @Factory
  trait LogStream extends js.Object {
    var arn: js.UndefOr[Arn]
    var creationTime: js.UndefOr[Timestamp]
    var firstEventTimestamp: js.UndefOr[Timestamp]
    var lastEventTimestamp: js.UndefOr[Timestamp]
    var lastIngestionTime: js.UndefOr[Timestamp]
    var logStreamName: js.UndefOr[LogStreamName]
    var storedBytes: js.UndefOr[StoredBytes]
    var uploadSequenceToken: js.UndefOr[SequenceToken]
  }

  /**
    * Metric filters express how CloudWatch Logs would extract metric observations from ingested log events and transform them into metric data in a CloudWatch metric.
    */
  @js.native
  @Factory
  trait MetricFilter extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var filterName: js.UndefOr[FilterName]
    var filterPattern: js.UndefOr[FilterPattern]
    var logGroupName: js.UndefOr[LogGroupName]
    var metricTransformations: js.UndefOr[MetricTransformations]
  }

  /**
    * Represents a matched event.
    */
  @js.native
  @Factory
  trait MetricFilterMatchRecord extends js.Object {
    var eventMessage: js.UndefOr[EventMessage]
    var eventNumber: js.UndefOr[EventNumber]
    var extractedValues: js.UndefOr[ExtractedValues]
  }

  /**
    * Indicates how to transform ingested log events to metric data in a CloudWatch metric.
    */
  @js.native
  @Factory
  trait MetricTransformation extends js.Object {
    var metricName: MetricName
    var metricNamespace: MetricNamespace
    var metricValue: MetricValue
    var defaultValue: js.UndefOr[DefaultValue]
  }

  @js.native
  sealed trait OrderBy extends js.Any
  object OrderBy extends js.Object {
    val LogStreamName = "LogStreamName".asInstanceOf[OrderBy]
    val LastEventTime = "LastEventTime".asInstanceOf[OrderBy]

    val values = js.Object.freeze(js.Array(LogStreamName, LastEventTime))
  }

  /**
    * Represents a log event.
    */
  @js.native
  @Factory
  trait OutputLogEvent extends js.Object {
    var ingestionTime: js.UndefOr[Timestamp]
    var message: js.UndefOr[EventMessage]
    var timestamp: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait PutDestinationPolicyRequest extends js.Object {
    var accessPolicy: AccessPolicy
    var destinationName: DestinationName
  }

  @js.native
  @Factory
  trait PutDestinationRequest extends js.Object {
    var destinationName: DestinationName
    var roleArn: RoleArn
    var targetArn: TargetArn
  }

  @js.native
  @Factory
  trait PutDestinationResponse extends js.Object {
    var destination: js.UndefOr[Destination]
  }

  @js.native
  @Factory
  trait PutLogEventsRequest extends js.Object {
    var logEvents: InputLogEvents
    var logGroupName: LogGroupName
    var logStreamName: LogStreamName
    var sequenceToken: js.UndefOr[SequenceToken]
  }

  @js.native
  @Factory
  trait PutLogEventsResponse extends js.Object {
    var nextSequenceToken: js.UndefOr[SequenceToken]
    var rejectedLogEventsInfo: js.UndefOr[RejectedLogEventsInfo]
  }

  @js.native
  @Factory
  trait PutMetricFilterRequest extends js.Object {
    var filterName: FilterName
    var filterPattern: FilterPattern
    var logGroupName: LogGroupName
    var metricTransformations: MetricTransformations
  }

  @js.native
  @Factory
  trait PutResourcePolicyRequest extends js.Object {
    var policyDocument: js.UndefOr[PolicyDocument]
    var policyName: js.UndefOr[PolicyName]
  }

  @js.native
  @Factory
  trait PutResourcePolicyResponse extends js.Object {
    var resourcePolicy: js.UndefOr[ResourcePolicy]
  }

  @js.native
  @Factory
  trait PutRetentionPolicyRequest extends js.Object {
    var logGroupName: LogGroupName
    var retentionInDays: Days
  }

  @js.native
  @Factory
  trait PutSubscriptionFilterRequest extends js.Object {
    var destinationArn: DestinationArn
    var filterName: FilterName
    var filterPattern: FilterPattern
    var logGroupName: LogGroupName
    var distribution: js.UndefOr[Distribution]
    var roleArn: js.UndefOr[RoleArn]
  }

  /**
    * Information about one CloudWatch Logs Insights query that matches the request in a <code>DescribeQueries</code> operation.
    */
  @js.native
  @Factory
  trait QueryInfo extends js.Object {
    var createTime: js.UndefOr[Timestamp]
    var logGroupName: js.UndefOr[LogGroupName]
    var queryId: js.UndefOr[QueryId]
    var queryString: js.UndefOr[QueryString]
    var status: js.UndefOr[QueryStatus]
  }

  /**
    * Contains the number of log events scanned by the query, the number of log events that matched the query criteria, and the total number of bytes in the log events that were scanned.
    */
  @js.native
  @Factory
  trait QueryStatistics extends js.Object {
    var bytesScanned: js.UndefOr[StatsValue]
    var recordsMatched: js.UndefOr[StatsValue]
    var recordsScanned: js.UndefOr[StatsValue]
  }

  @js.native
  sealed trait QueryStatus extends js.Any
  object QueryStatus extends js.Object {
    val Scheduled = "Scheduled".asInstanceOf[QueryStatus]
    val Running   = "Running".asInstanceOf[QueryStatus]
    val Complete  = "Complete".asInstanceOf[QueryStatus]
    val Failed    = "Failed".asInstanceOf[QueryStatus]
    val Cancelled = "Cancelled".asInstanceOf[QueryStatus]

    val values = js.Object.freeze(js.Array(Scheduled, Running, Complete, Failed, Cancelled))
  }

  /**
    * Represents the rejected events.
    */
  @js.native
  @Factory
  trait RejectedLogEventsInfo extends js.Object {
    var expiredLogEventEndIndex: js.UndefOr[LogEventIndex]
    var tooNewLogEventStartIndex: js.UndefOr[LogEventIndex]
    var tooOldLogEventEndIndex: js.UndefOr[LogEventIndex]
  }

  /**
    * A policy enabling one or more entities to put logs to a log group in this account.
    */
  @js.native
  @Factory
  trait ResourcePolicy extends js.Object {
    var lastUpdatedTime: js.UndefOr[Timestamp]
    var policyDocument: js.UndefOr[PolicyDocument]
    var policyName: js.UndefOr[PolicyName]
  }

  /**
    * Contains one field from one log event returned by a CloudWatch Logs Insights query, along with the value of that field.
    */
  @js.native
  @Factory
  trait ResultField extends js.Object {
    var field: js.UndefOr[Field]
    var value: js.UndefOr[Value]
  }

  /**
    * Represents the search status of a log stream.
    */
  @js.native
  @Factory
  trait SearchedLogStream extends js.Object {
    var logStreamName: js.UndefOr[LogStreamName]
    var searchedCompletely: js.UndefOr[LogStreamSearchedCompletely]
  }

  @js.native
  @Factory
  trait StartQueryRequest extends js.Object {
    var endTime: Timestamp
    var queryString: QueryString
    var startTime: Timestamp
    var limit: js.UndefOr[EventsLimit]
    var logGroupName: js.UndefOr[LogGroupName]
    var logGroupNames: js.UndefOr[LogGroupNames]
  }

  @js.native
  @Factory
  trait StartQueryResponse extends js.Object {
    var queryId: js.UndefOr[QueryId]
  }

  @js.native
  @Factory
  trait StopQueryRequest extends js.Object {
    var queryId: QueryId
  }

  @js.native
  @Factory
  trait StopQueryResponse extends js.Object {
    var success: js.UndefOr[Success]
  }

  /**
    * Represents a subscription filter.
    */
  @js.native
  @Factory
  trait SubscriptionFilter extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var destinationArn: js.UndefOr[DestinationArn]
    var distribution: js.UndefOr[Distribution]
    var filterName: js.UndefOr[FilterName]
    var filterPattern: js.UndefOr[FilterPattern]
    var logGroupName: js.UndefOr[LogGroupName]
    var roleArn: js.UndefOr[RoleArn]
  }

  @js.native
  @Factory
  trait TagLogGroupRequest extends js.Object {
    var logGroupName: LogGroupName
    var tags: Tags
  }

  @js.native
  @Factory
  trait TestMetricFilterRequest extends js.Object {
    var filterPattern: FilterPattern
    var logEventMessages: TestEventMessages
  }

  @js.native
  @Factory
  trait TestMetricFilterResponse extends js.Object {
    var matches: js.UndefOr[MetricFilterMatches]
  }

  @js.native
  @Factory
  trait UntagLogGroupRequest extends js.Object {
    var logGroupName: LogGroupName
    var tags: TagList
  }
}
