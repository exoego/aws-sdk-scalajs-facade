package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object cloudwatchlogs {
  type AccessPolicy = String
  type Arn = String
  type Days = Int
  type DefaultValue = Double
  type Descending = Boolean
  type DescribeLimit = Int
  type DescribeQueriesMaxResults = Int
  type DestinationArn = String
  type DestinationName = String
  type Destinations = js.Array[Destination]
  type Distribution = String
  type EventId = String
  type EventMessage = String
  type EventNumber = Double
  type EventsLimit = Int
  type ExportDestinationBucket = String
  type ExportDestinationPrefix = String
  type ExportTaskId = String
  type ExportTaskName = String
  type ExportTaskStatusCode = String
  type ExportTaskStatusMessage = String
  type ExportTasks = js.Array[ExportTask]
  type ExtractedValues = js.Dictionary[Value]
  type Field = String
  type FilterCount = Int
  type FilterName = String
  type FilterPattern = String
  type FilteredLogEvents = js.Array[FilteredLogEvent]
  type InputLogEvents = js.Array[InputLogEvent]
  type InputLogStreamNames = js.Array[LogStreamName]
  type Interleaved = Boolean
  type KmsKeyId = String
  type LogEventIndex = Int
  type LogGroupFieldList = js.Array[LogGroupField]
  type LogGroupName = String
  type LogGroups = js.Array[LogGroup]
  type LogRecord = js.Dictionary[Value]
  type LogRecordPointer = String
  type LogStreamName = String
  type LogStreamSearchedCompletely = Boolean
  type LogStreams = js.Array[LogStream]
  type MetricFilterMatches = js.Array[MetricFilterMatchRecord]
  type MetricFilters = js.Array[MetricFilter]
  type MetricName = String
  type MetricNamespace = String
  type MetricTransformations = js.Array[MetricTransformation]
  type MetricValue = String
  type NextToken = String
  type OrderBy = String
  type OutputLogEvents = js.Array[OutputLogEvent]
  type Percentage = Int
  type PolicyDocument = String
  type PolicyName = String
  type QueryId = String
  type QueryInfoList = js.Array[QueryInfo]
  type QueryResults = js.Array[ResultRows]
  type QueryStatus = String
  type QueryString = String
  type ResourcePolicies = js.Array[ResourcePolicy]
  type ResultRows = js.Array[ResultField]
  type RoleArn = String
  type SearchedLogStreams = js.Array[SearchedLogStream]
  type SequenceToken = String
  type StartFromHead = Boolean
  type StatsValue = Double
  type StoredBytes = Double
  type SubscriptionFilters = js.Array[SubscriptionFilter]
  type Success = Boolean
  type TagKey = String
  type TagList = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Dictionary[TagValue]
  type TargetArn = String
  type TestEventMessages = js.Array[EventMessage]
  type Timestamp = Double
  type Token = String
  type Value = String
}

package cloudwatchlogs {
  @js.native
  @JSImport("aws-sdk", "CloudWatchLogs")
  class CloudWatchLogs(config: AWSConfig) extends js.Object {
    def associateKmsKey(params: AssociateKmsKeyRequest): Request[js.Object] = js.native
    def cancelExportTask(params: CancelExportTaskRequest): Request[js.Object] = js.native
    def createExportTask(params: CreateExportTaskRequest): Request[CreateExportTaskResponse] = js.native
    def createLogGroup(params: CreateLogGroupRequest): Request[js.Object] = js.native
    def createLogStream(params: CreateLogStreamRequest): Request[js.Object] = js.native
    def deleteDestination(params: DeleteDestinationRequest): Request[js.Object] = js.native
    def deleteLogGroup(params: DeleteLogGroupRequest): Request[js.Object] = js.native
    def deleteLogStream(params: DeleteLogStreamRequest): Request[js.Object] = js.native
    def deleteMetricFilter(params: DeleteMetricFilterRequest): Request[js.Object] = js.native
    def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[js.Object] = js.native
    def deleteRetentionPolicy(params: DeleteRetentionPolicyRequest): Request[js.Object] = js.native
    def deleteSubscriptionFilter(params: DeleteSubscriptionFilterRequest): Request[js.Object] = js.native
    def describeDestinations(params: DescribeDestinationsRequest): Request[DescribeDestinationsResponse] = js.native
    def describeExportTasks(params: DescribeExportTasksRequest): Request[DescribeExportTasksResponse] = js.native
    def describeLogGroups(params: DescribeLogGroupsRequest): Request[DescribeLogGroupsResponse] = js.native
    def describeLogStreams(params: DescribeLogStreamsRequest): Request[DescribeLogStreamsResponse] = js.native
    def describeMetricFilters(params: DescribeMetricFiltersRequest): Request[DescribeMetricFiltersResponse] = js.native
    def describeQueries(params: DescribeQueriesRequest): Request[DescribeQueriesResponse] = js.native
    def describeResourcePolicies(params: DescribeResourcePoliciesRequest): Request[DescribeResourcePoliciesResponse] = js.native
    def describeSubscriptionFilters(params: DescribeSubscriptionFiltersRequest): Request[DescribeSubscriptionFiltersResponse] = js.native
    def disassociateKmsKey(params: DisassociateKmsKeyRequest): Request[js.Object] = js.native
    def filterLogEvents(params: FilterLogEventsRequest): Request[FilterLogEventsResponse] = js.native
    def getLogEvents(params: GetLogEventsRequest): Request[GetLogEventsResponse] = js.native
    def getLogGroupFields(params: GetLogGroupFieldsRequest): Request[GetLogGroupFieldsResponse] = js.native
    def getLogRecord(params: GetLogRecordRequest): Request[GetLogRecordResponse] = js.native
    def getQueryResults(params: GetQueryResultsRequest): Request[GetQueryResultsResponse] = js.native
    def listTagsLogGroup(params: ListTagsLogGroupRequest): Request[ListTagsLogGroupResponse] = js.native
    def putDestination(params: PutDestinationRequest): Request[PutDestinationResponse] = js.native
    def putDestinationPolicy(params: PutDestinationPolicyRequest): Request[js.Object] = js.native
    def putLogEvents(params: PutLogEventsRequest): Request[PutLogEventsResponse] = js.native
    def putMetricFilter(params: PutMetricFilterRequest): Request[js.Object] = js.native
    def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse] = js.native
    def putRetentionPolicy(params: PutRetentionPolicyRequest): Request[js.Object] = js.native
    def putSubscriptionFilter(params: PutSubscriptionFilterRequest): Request[js.Object] = js.native
    def startQuery(params: StartQueryRequest): Request[StartQueryResponse] = js.native
    def stopQuery(params: StopQueryRequest): Request[StopQueryResponse] = js.native
    def tagLogGroup(params: TagLogGroupRequest): Request[js.Object] = js.native
    def testMetricFilter(params: TestMetricFilterRequest): Request[TestMetricFilterResponse] = js.native
    def untagLogGroup(params: UntagLogGroupRequest): Request[js.Object] = js.native
  }

  @js.native
  trait AssociateKmsKeyRequest extends js.Object {
    var kmsKeyId: KmsKeyId
    var logGroupName: LogGroupName
  }

  object AssociateKmsKeyRequest {
    def apply(
      kmsKeyId: KmsKeyId,
      logGroupName: LogGroupName): AssociateKmsKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "kmsKeyId" -> kmsKeyId.asInstanceOf[js.Any],
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateKmsKeyRequest]
    }
  }

  @js.native
  trait CancelExportTaskRequest extends js.Object {
    var taskId: ExportTaskId
  }

  object CancelExportTaskRequest {
    def apply(
      taskId: ExportTaskId): CancelExportTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId" -> taskId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelExportTaskRequest]
    }
  }

  @js.native
  trait CreateExportTaskRequest extends js.Object {
    var destination: ExportDestinationBucket
    var from: Timestamp
    var logGroupName: LogGroupName
    var to: Timestamp
    var destinationPrefix: js.UndefOr[ExportDestinationPrefix]
    var logStreamNamePrefix: js.UndefOr[LogStreamName]
    var taskName: js.UndefOr[ExportTaskName]
  }

  object CreateExportTaskRequest {
    def apply(
      destination: ExportDestinationBucket,
      from: Timestamp,
      logGroupName: LogGroupName,
      to: Timestamp,
      destinationPrefix: js.UndefOr[ExportDestinationPrefix] = js.undefined,
      logStreamNamePrefix: js.UndefOr[LogStreamName] = js.undefined,
      taskName: js.UndefOr[ExportTaskName] = js.undefined): CreateExportTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "destination" -> destination.asInstanceOf[js.Any],
        "from" -> from.asInstanceOf[js.Any],
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "to" -> to.asInstanceOf[js.Any],
        "destinationPrefix" -> destinationPrefix.map { x => x.asInstanceOf[js.Any] },
        "logStreamNamePrefix" -> logStreamNamePrefix.map { x => x.asInstanceOf[js.Any] },
        "taskName" -> taskName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateExportTaskRequest]
    }
  }

  @js.native
  trait CreateExportTaskResponse extends js.Object {
    var taskId: js.UndefOr[ExportTaskId]
  }

  object CreateExportTaskResponse {
    def apply(
      taskId: js.UndefOr[ExportTaskId] = js.undefined): CreateExportTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId" -> taskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateExportTaskResponse]
    }
  }

  @js.native
  trait CreateLogGroupRequest extends js.Object {
    var logGroupName: LogGroupName
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var tags: js.UndefOr[Tags]
  }

  object CreateLogGroupRequest {
    def apply(
      logGroupName: LogGroupName,
      kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined): CreateLogGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "kmsKeyId" -> kmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLogGroupRequest]
    }
  }

  @js.native
  trait CreateLogStreamRequest extends js.Object {
    var logGroupName: LogGroupName
    var logStreamName: LogStreamName
  }

  object CreateLogStreamRequest {
    def apply(
      logGroupName: LogGroupName,
      logStreamName: LogStreamName): CreateLogStreamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "logStreamName" -> logStreamName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLogStreamRequest]
    }
  }

  @js.native
  trait DeleteDestinationRequest extends js.Object {
    var destinationName: DestinationName
  }

  object DeleteDestinationRequest {
    def apply(
      destinationName: DestinationName): DeleteDestinationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "destinationName" -> destinationName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDestinationRequest]
    }
  }

  @js.native
  trait DeleteLogGroupRequest extends js.Object {
    var logGroupName: LogGroupName
  }

  object DeleteLogGroupRequest {
    def apply(
      logGroupName: LogGroupName): DeleteLogGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLogGroupRequest]
    }
  }

  @js.native
  trait DeleteLogStreamRequest extends js.Object {
    var logGroupName: LogGroupName
    var logStreamName: LogStreamName
  }

  object DeleteLogStreamRequest {
    def apply(
      logGroupName: LogGroupName,
      logStreamName: LogStreamName): DeleteLogStreamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "logStreamName" -> logStreamName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLogStreamRequest]
    }
  }

  @js.native
  trait DeleteMetricFilterRequest extends js.Object {
    var filterName: FilterName
    var logGroupName: LogGroupName
  }

  object DeleteMetricFilterRequest {
    def apply(
      filterName: FilterName,
      logGroupName: LogGroupName): DeleteMetricFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filterName" -> filterName.asInstanceOf[js.Any],
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMetricFilterRequest]
    }
  }

  @js.native
  trait DeleteResourcePolicyRequest extends js.Object {
    var policyName: js.UndefOr[PolicyName]
  }

  object DeleteResourcePolicyRequest {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined): DeleteResourcePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourcePolicyRequest]
    }
  }

  @js.native
  trait DeleteRetentionPolicyRequest extends js.Object {
    var logGroupName: LogGroupName
  }

  object DeleteRetentionPolicyRequest {
    def apply(
      logGroupName: LogGroupName): DeleteRetentionPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRetentionPolicyRequest]
    }
  }

  @js.native
  trait DeleteSubscriptionFilterRequest extends js.Object {
    var filterName: FilterName
    var logGroupName: LogGroupName
  }

  object DeleteSubscriptionFilterRequest {
    def apply(
      filterName: FilterName,
      logGroupName: LogGroupName): DeleteSubscriptionFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filterName" -> filterName.asInstanceOf[js.Any],
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSubscriptionFilterRequest]
    }
  }

  @js.native
  trait DescribeDestinationsRequest extends js.Object {
    var DestinationNamePrefix: js.UndefOr[DestinationName]
    var limit: js.UndefOr[DescribeLimit]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeDestinationsRequest {
    def apply(
      DestinationNamePrefix: js.UndefOr[DestinationName] = js.undefined,
      limit: js.UndefOr[DescribeLimit] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeDestinationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationNamePrefix" -> DestinationNamePrefix.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDestinationsRequest]
    }
  }

  @js.native
  trait DescribeDestinationsResponse extends js.Object {
    var destinations: js.UndefOr[Destinations]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeDestinationsResponse {
    def apply(
      destinations: js.UndefOr[Destinations] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeDestinationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "destinations" -> destinations.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDestinationsResponse]
    }
  }

  @js.native
  trait DescribeExportTasksRequest extends js.Object {
    var limit: js.UndefOr[DescribeLimit]
    var nextToken: js.UndefOr[NextToken]
    var statusCode: js.UndefOr[ExportTaskStatusCode]
    var taskId: js.UndefOr[ExportTaskId]
  }

  object DescribeExportTasksRequest {
    def apply(
      limit: js.UndefOr[DescribeLimit] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      statusCode: js.UndefOr[ExportTaskStatusCode] = js.undefined,
      taskId: js.UndefOr[ExportTaskId] = js.undefined): DescribeExportTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "statusCode" -> statusCode.map { x => x.asInstanceOf[js.Any] },
        "taskId" -> taskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExportTasksRequest]
    }
  }

  @js.native
  trait DescribeExportTasksResponse extends js.Object {
    var exportTasks: js.UndefOr[ExportTasks]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeExportTasksResponse {
    def apply(
      exportTasks: js.UndefOr[ExportTasks] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeExportTasksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportTasks" -> exportTasks.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExportTasksResponse]
    }
  }

  @js.native
  trait DescribeLogGroupsRequest extends js.Object {
    var limit: js.UndefOr[DescribeLimit]
    var logGroupNamePrefix: js.UndefOr[LogGroupName]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeLogGroupsRequest {
    def apply(
      limit: js.UndefOr[DescribeLimit] = js.undefined,
      logGroupNamePrefix: js.UndefOr[LogGroupName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeLogGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "logGroupNamePrefix" -> logGroupNamePrefix.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLogGroupsRequest]
    }
  }

  @js.native
  trait DescribeLogGroupsResponse extends js.Object {
    var logGroups: js.UndefOr[LogGroups]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeLogGroupsResponse {
    def apply(
      logGroups: js.UndefOr[LogGroups] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeLogGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroups" -> logGroups.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLogGroupsResponse]
    }
  }

  @js.native
  trait DescribeLogStreamsRequest extends js.Object {
    var logGroupName: LogGroupName
    var descending: js.UndefOr[Descending]
    var limit: js.UndefOr[DescribeLimit]
    var logStreamNamePrefix: js.UndefOr[LogStreamName]
    var nextToken: js.UndefOr[NextToken]
    var orderBy: js.UndefOr[OrderBy]
  }

  object DescribeLogStreamsRequest {
    def apply(
      logGroupName: LogGroupName,
      descending: js.UndefOr[Descending] = js.undefined,
      limit: js.UndefOr[DescribeLimit] = js.undefined,
      logStreamNamePrefix: js.UndefOr[LogStreamName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      orderBy: js.UndefOr[OrderBy] = js.undefined): DescribeLogStreamsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "descending" -> descending.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "logStreamNamePrefix" -> logStreamNamePrefix.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "orderBy" -> orderBy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLogStreamsRequest]
    }
  }

  @js.native
  trait DescribeLogStreamsResponse extends js.Object {
    var logStreams: js.UndefOr[LogStreams]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeLogStreamsResponse {
    def apply(
      logStreams: js.UndefOr[LogStreams] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeLogStreamsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logStreams" -> logStreams.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLogStreamsResponse]
    }
  }

  @js.native
  trait DescribeMetricFiltersRequest extends js.Object {
    var filterNamePrefix: js.UndefOr[FilterName]
    var limit: js.UndefOr[DescribeLimit]
    var logGroupName: js.UndefOr[LogGroupName]
    var metricName: js.UndefOr[MetricName]
    var metricNamespace: js.UndefOr[MetricNamespace]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeMetricFiltersRequest {
    def apply(
      filterNamePrefix: js.UndefOr[FilterName] = js.undefined,
      limit: js.UndefOr[DescribeLimit] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      metricName: js.UndefOr[MetricName] = js.undefined,
      metricNamespace: js.UndefOr[MetricNamespace] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeMetricFiltersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filterNamePrefix" -> filterNamePrefix.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "metricName" -> metricName.map { x => x.asInstanceOf[js.Any] },
        "metricNamespace" -> metricNamespace.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMetricFiltersRequest]
    }
  }

  @js.native
  trait DescribeMetricFiltersResponse extends js.Object {
    var metricFilters: js.UndefOr[MetricFilters]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeMetricFiltersResponse {
    def apply(
      metricFilters: js.UndefOr[MetricFilters] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeMetricFiltersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "metricFilters" -> metricFilters.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMetricFiltersResponse]
    }
  }

  @js.native
  trait DescribeQueriesRequest extends js.Object {
    var logGroupName: js.UndefOr[LogGroupName]
    var maxResults: js.UndefOr[DescribeQueriesMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var status: js.UndefOr[QueryStatus]
  }

  object DescribeQueriesRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      maxResults: js.UndefOr[DescribeQueriesMaxResults] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      status: js.UndefOr[QueryStatus] = js.undefined): DescribeQueriesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeQueriesRequest]
    }
  }

  @js.native
  trait DescribeQueriesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var queries: js.UndefOr[QueryInfoList]
  }

  object DescribeQueriesResponse {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      queries: js.UndefOr[QueryInfoList] = js.undefined): DescribeQueriesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "queries" -> queries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeQueriesResponse]
    }
  }

  @js.native
  trait DescribeResourcePoliciesRequest extends js.Object {
    var limit: js.UndefOr[DescribeLimit]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeResourcePoliciesRequest {
    def apply(
      limit: js.UndefOr[DescribeLimit] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeResourcePoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResourcePoliciesRequest]
    }
  }

  @js.native
  trait DescribeResourcePoliciesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var resourcePolicies: js.UndefOr[ResourcePolicies]
  }

  object DescribeResourcePoliciesResponse {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      resourcePolicies: js.UndefOr[ResourcePolicies] = js.undefined): DescribeResourcePoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "resourcePolicies" -> resourcePolicies.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResourcePoliciesResponse]
    }
  }

  @js.native
  trait DescribeSubscriptionFiltersRequest extends js.Object {
    var logGroupName: LogGroupName
    var filterNamePrefix: js.UndefOr[FilterName]
    var limit: js.UndefOr[DescribeLimit]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeSubscriptionFiltersRequest {
    def apply(
      logGroupName: LogGroupName,
      filterNamePrefix: js.UndefOr[FilterName] = js.undefined,
      limit: js.UndefOr[DescribeLimit] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeSubscriptionFiltersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "filterNamePrefix" -> filterNamePrefix.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubscriptionFiltersRequest]
    }
  }

  @js.native
  trait DescribeSubscriptionFiltersResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var subscriptionFilters: js.UndefOr[SubscriptionFilters]
  }

  object DescribeSubscriptionFiltersResponse {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      subscriptionFilters: js.UndefOr[SubscriptionFilters] = js.undefined): DescribeSubscriptionFiltersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "subscriptionFilters" -> subscriptionFilters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubscriptionFiltersResponse]
    }
  }

  /**
   * Represents a cross-account destination that receives subscription log events.
   */
  @js.native
  trait Destination extends js.Object {
    var accessPolicy: js.UndefOr[AccessPolicy]
    var arn: js.UndefOr[Arn]
    var creationTime: js.UndefOr[Timestamp]
    var destinationName: js.UndefOr[DestinationName]
    var roleArn: js.UndefOr[RoleArn]
    var targetArn: js.UndefOr[TargetArn]
  }

  object Destination {
    def apply(
      accessPolicy: js.UndefOr[AccessPolicy] = js.undefined,
      arn: js.UndefOr[Arn] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined,
      destinationName: js.UndefOr[DestinationName] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      targetArn: js.UndefOr[TargetArn] = js.undefined): Destination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accessPolicy" -> accessPolicy.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] },
        "destinationName" -> destinationName.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "targetArn" -> targetArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Destination]
    }
  }

  @js.native
  trait DisassociateKmsKeyRequest extends js.Object {
    var logGroupName: LogGroupName
  }

  object DisassociateKmsKeyRequest {
    def apply(
      logGroupName: LogGroupName): DisassociateKmsKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateKmsKeyRequest]
    }
  }

  /**
   * The method used to distribute log data to the destination, which can be either random or grouped by log stream.
   */
  object DistributionEnum {
    val Random = "Random"
    val ByLogStream = "ByLogStream"

    val values = IndexedSeq(Random, ByLogStream)
  }

  /**
   * Represents an export task.
   */
  @js.native
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

  object ExportTask {
    def apply(
      destination: js.UndefOr[ExportDestinationBucket] = js.undefined,
      destinationPrefix: js.UndefOr[ExportDestinationPrefix] = js.undefined,
      executionInfo: js.UndefOr[ExportTaskExecutionInfo] = js.undefined,
      from: js.UndefOr[Timestamp] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      status: js.UndefOr[ExportTaskStatus] = js.undefined,
      taskId: js.UndefOr[ExportTaskId] = js.undefined,
      taskName: js.UndefOr[ExportTaskName] = js.undefined,
      to: js.UndefOr[Timestamp] = js.undefined): ExportTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        "destination" -> destination.map { x => x.asInstanceOf[js.Any] },
        "destinationPrefix" -> destinationPrefix.map { x => x.asInstanceOf[js.Any] },
        "executionInfo" -> executionInfo.map { x => x.asInstanceOf[js.Any] },
        "from" -> from.map { x => x.asInstanceOf[js.Any] },
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "taskId" -> taskId.map { x => x.asInstanceOf[js.Any] },
        "taskName" -> taskName.map { x => x.asInstanceOf[js.Any] },
        "to" -> to.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportTask]
    }
  }

  /**
   * Represents the status of an export task.
   */
  @js.native
  trait ExportTaskExecutionInfo extends js.Object {
    var completionTime: js.UndefOr[Timestamp]
    var creationTime: js.UndefOr[Timestamp]
  }

  object ExportTaskExecutionInfo {
    def apply(
      completionTime: js.UndefOr[Timestamp] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined): ExportTaskExecutionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "completionTime" -> completionTime.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportTaskExecutionInfo]
    }
  }

  /**
   * Represents the status of an export task.
   */
  @js.native
  trait ExportTaskStatus extends js.Object {
    var code: js.UndefOr[ExportTaskStatusCode]
    var message: js.UndefOr[ExportTaskStatusMessage]
  }

  object ExportTaskStatus {
    def apply(
      code: js.UndefOr[ExportTaskStatusCode] = js.undefined,
      message: js.UndefOr[ExportTaskStatusMessage] = js.undefined): ExportTaskStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "code" -> code.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportTaskStatus]
    }
  }

  object ExportTaskStatusCodeEnum {
    val CANCELLED = "CANCELLED"
    val COMPLETED = "COMPLETED"
    val FAILED = "FAILED"
    val PENDING = "PENDING"
    val PENDING_CANCEL = "PENDING_CANCEL"
    val RUNNING = "RUNNING"

    val values = IndexedSeq(CANCELLED, COMPLETED, FAILED, PENDING, PENDING_CANCEL, RUNNING)
  }

  @js.native
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

  object FilterLogEventsRequest {
    def apply(
      logGroupName: LogGroupName,
      endTime: js.UndefOr[Timestamp] = js.undefined,
      filterPattern: js.UndefOr[FilterPattern] = js.undefined,
      interleaved: js.UndefOr[Interleaved] = js.undefined,
      limit: js.UndefOr[EventsLimit] = js.undefined,
      logStreamNamePrefix: js.UndefOr[LogStreamName] = js.undefined,
      logStreamNames: js.UndefOr[InputLogStreamNames] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      startTime: js.UndefOr[Timestamp] = js.undefined): FilterLogEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "endTime" -> endTime.map { x => x.asInstanceOf[js.Any] },
        "filterPattern" -> filterPattern.map { x => x.asInstanceOf[js.Any] },
        "interleaved" -> interleaved.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "logStreamNamePrefix" -> logStreamNamePrefix.map { x => x.asInstanceOf[js.Any] },
        "logStreamNames" -> logStreamNames.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FilterLogEventsRequest]
    }
  }

  @js.native
  trait FilterLogEventsResponse extends js.Object {
    var events: js.UndefOr[FilteredLogEvents]
    var nextToken: js.UndefOr[NextToken]
    var searchedLogStreams: js.UndefOr[SearchedLogStreams]
  }

  object FilterLogEventsResponse {
    def apply(
      events: js.UndefOr[FilteredLogEvents] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      searchedLogStreams: js.UndefOr[SearchedLogStreams] = js.undefined): FilterLogEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "events" -> events.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "searchedLogStreams" -> searchedLogStreams.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FilterLogEventsResponse]
    }
  }

  /**
   * Represents a matched event.
   */
  @js.native
  trait FilteredLogEvent extends js.Object {
    var eventId: js.UndefOr[EventId]
    var ingestionTime: js.UndefOr[Timestamp]
    var logStreamName: js.UndefOr[LogStreamName]
    var message: js.UndefOr[EventMessage]
    var timestamp: js.UndefOr[Timestamp]
  }

  object FilteredLogEvent {
    def apply(
      eventId: js.UndefOr[EventId] = js.undefined,
      ingestionTime: js.UndefOr[Timestamp] = js.undefined,
      logStreamName: js.UndefOr[LogStreamName] = js.undefined,
      message: js.UndefOr[EventMessage] = js.undefined,
      timestamp: js.UndefOr[Timestamp] = js.undefined): FilteredLogEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "eventId" -> eventId.map { x => x.asInstanceOf[js.Any] },
        "ingestionTime" -> ingestionTime.map { x => x.asInstanceOf[js.Any] },
        "logStreamName" -> logStreamName.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] },
        "timestamp" -> timestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FilteredLogEvent]
    }
  }

  @js.native
  trait GetLogEventsRequest extends js.Object {
    var logGroupName: LogGroupName
    var logStreamName: LogStreamName
    var endTime: js.UndefOr[Timestamp]
    var limit: js.UndefOr[EventsLimit]
    var nextToken: js.UndefOr[NextToken]
    var startFromHead: js.UndefOr[StartFromHead]
    var startTime: js.UndefOr[Timestamp]
  }

  object GetLogEventsRequest {
    def apply(
      logGroupName: LogGroupName,
      logStreamName: LogStreamName,
      endTime: js.UndefOr[Timestamp] = js.undefined,
      limit: js.UndefOr[EventsLimit] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      startFromHead: js.UndefOr[StartFromHead] = js.undefined,
      startTime: js.UndefOr[Timestamp] = js.undefined): GetLogEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "logStreamName" -> logStreamName.asInstanceOf[js.Any],
        "endTime" -> endTime.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "startFromHead" -> startFromHead.map { x => x.asInstanceOf[js.Any] },
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLogEventsRequest]
    }
  }

  @js.native
  trait GetLogEventsResponse extends js.Object {
    var events: js.UndefOr[OutputLogEvents]
    var nextBackwardToken: js.UndefOr[NextToken]
    var nextForwardToken: js.UndefOr[NextToken]
  }

  object GetLogEventsResponse {
    def apply(
      events: js.UndefOr[OutputLogEvents] = js.undefined,
      nextBackwardToken: js.UndefOr[NextToken] = js.undefined,
      nextForwardToken: js.UndefOr[NextToken] = js.undefined): GetLogEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "events" -> events.map { x => x.asInstanceOf[js.Any] },
        "nextBackwardToken" -> nextBackwardToken.map { x => x.asInstanceOf[js.Any] },
        "nextForwardToken" -> nextForwardToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLogEventsResponse]
    }
  }

  @js.native
  trait GetLogGroupFieldsRequest extends js.Object {
    var logGroupName: LogGroupName
    var time: js.UndefOr[Timestamp]
  }

  object GetLogGroupFieldsRequest {
    def apply(
      logGroupName: LogGroupName,
      time: js.UndefOr[Timestamp] = js.undefined): GetLogGroupFieldsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "time" -> time.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLogGroupFieldsRequest]
    }
  }

  @js.native
  trait GetLogGroupFieldsResponse extends js.Object {
    var logGroupFields: js.UndefOr[LogGroupFieldList]
  }

  object GetLogGroupFieldsResponse {
    def apply(
      logGroupFields: js.UndefOr[LogGroupFieldList] = js.undefined): GetLogGroupFieldsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupFields" -> logGroupFields.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLogGroupFieldsResponse]
    }
  }

  @js.native
  trait GetLogRecordRequest extends js.Object {
    var logRecordPointer: LogRecordPointer
  }

  object GetLogRecordRequest {
    def apply(
      logRecordPointer: LogRecordPointer): GetLogRecordRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logRecordPointer" -> logRecordPointer.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLogRecordRequest]
    }
  }

  @js.native
  trait GetLogRecordResponse extends js.Object {
    var logRecord: js.UndefOr[LogRecord]
  }

  object GetLogRecordResponse {
    def apply(
      logRecord: js.UndefOr[LogRecord] = js.undefined): GetLogRecordResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logRecord" -> logRecord.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLogRecordResponse]
    }
  }

  @js.native
  trait GetQueryResultsRequest extends js.Object {
    var queryId: QueryId
  }

  object GetQueryResultsRequest {
    def apply(
      queryId: QueryId): GetQueryResultsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "queryId" -> queryId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueryResultsRequest]
    }
  }

  @js.native
  trait GetQueryResultsResponse extends js.Object {
    var results: js.UndefOr[QueryResults]
    var statistics: js.UndefOr[QueryStatistics]
    var status: js.UndefOr[QueryStatus]
  }

  object GetQueryResultsResponse {
    def apply(
      results: js.UndefOr[QueryResults] = js.undefined,
      statistics: js.UndefOr[QueryStatistics] = js.undefined,
      status: js.UndefOr[QueryStatus] = js.undefined): GetQueryResultsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "results" -> results.map { x => x.asInstanceOf[js.Any] },
        "statistics" -> statistics.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueryResultsResponse]
    }
  }

  /**
   * Represents a log event, which is a record of activity that was recorded by the application or resource being monitored.
   */
  @js.native
  trait InputLogEvent extends js.Object {
    var message: EventMessage
    var timestamp: Timestamp
  }

  object InputLogEvent {
    def apply(
      message: EventMessage,
      timestamp: Timestamp): InputLogEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "message" -> message.asInstanceOf[js.Any],
        "timestamp" -> timestamp.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputLogEvent]
    }
  }

  @js.native
  trait ListTagsLogGroupRequest extends js.Object {
    var logGroupName: LogGroupName
  }

  object ListTagsLogGroupRequest {
    def apply(
      logGroupName: LogGroupName): ListTagsLogGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsLogGroupRequest]
    }
  }

  @js.native
  trait ListTagsLogGroupResponse extends js.Object {
    var tags: js.UndefOr[Tags]
  }

  object ListTagsLogGroupResponse {
    def apply(
      tags: js.UndefOr[Tags] = js.undefined): ListTagsLogGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsLogGroupResponse]
    }
  }

  /**
   * Represents a log group.
   */
  @js.native
  trait LogGroup extends js.Object {
    var arn: js.UndefOr[Arn]
    var creationTime: js.UndefOr[Timestamp]
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var logGroupName: js.UndefOr[LogGroupName]
    var metricFilterCount: js.UndefOr[FilterCount]
    var retentionInDays: js.UndefOr[Days]
    var storedBytes: js.UndefOr[StoredBytes]
  }

  object LogGroup {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined,
      kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      metricFilterCount: js.UndefOr[FilterCount] = js.undefined,
      retentionInDays: js.UndefOr[Days] = js.undefined,
      storedBytes: js.UndefOr[StoredBytes] = js.undefined): LogGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] },
        "kmsKeyId" -> kmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "metricFilterCount" -> metricFilterCount.map { x => x.asInstanceOf[js.Any] },
        "retentionInDays" -> retentionInDays.map { x => x.asInstanceOf[js.Any] },
        "storedBytes" -> storedBytes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogGroup]
    }
  }

  /**
   * The fields contained in log events found by a <code>GetLogGroupFields</code> operation, along with the percentage of queried log events in which each field appears.
   */
  @js.native
  trait LogGroupField extends js.Object {
    var name: js.UndefOr[Field]
    var percent: js.UndefOr[Percentage]
  }

  object LogGroupField {
    def apply(
      name: js.UndefOr[Field] = js.undefined,
      percent: js.UndefOr[Percentage] = js.undefined): LogGroupField = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "percent" -> percent.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogGroupField]
    }
  }

  /**
   * Represents a log stream, which is a sequence of log events from a single emitter of logs.
   */
  @js.native
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

  object LogStream {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined,
      firstEventTimestamp: js.UndefOr[Timestamp] = js.undefined,
      lastEventTimestamp: js.UndefOr[Timestamp] = js.undefined,
      lastIngestionTime: js.UndefOr[Timestamp] = js.undefined,
      logStreamName: js.UndefOr[LogStreamName] = js.undefined,
      storedBytes: js.UndefOr[StoredBytes] = js.undefined,
      uploadSequenceToken: js.UndefOr[SequenceToken] = js.undefined): LogStream = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] },
        "firstEventTimestamp" -> firstEventTimestamp.map { x => x.asInstanceOf[js.Any] },
        "lastEventTimestamp" -> lastEventTimestamp.map { x => x.asInstanceOf[js.Any] },
        "lastIngestionTime" -> lastIngestionTime.map { x => x.asInstanceOf[js.Any] },
        "logStreamName" -> logStreamName.map { x => x.asInstanceOf[js.Any] },
        "storedBytes" -> storedBytes.map { x => x.asInstanceOf[js.Any] },
        "uploadSequenceToken" -> uploadSequenceToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogStream]
    }
  }

  /**
   * Metric filters express how CloudWatch Logs would extract metric observations from ingested log events and transform them into metric data in a CloudWatch metric.
   */
  @js.native
  trait MetricFilter extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var filterName: js.UndefOr[FilterName]
    var filterPattern: js.UndefOr[FilterPattern]
    var logGroupName: js.UndefOr[LogGroupName]
    var metricTransformations: js.UndefOr[MetricTransformations]
  }

  object MetricFilter {
    def apply(
      creationTime: js.UndefOr[Timestamp] = js.undefined,
      filterName: js.UndefOr[FilterName] = js.undefined,
      filterPattern: js.UndefOr[FilterPattern] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      metricTransformations: js.UndefOr[MetricTransformations] = js.undefined): MetricFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] },
        "filterName" -> filterName.map { x => x.asInstanceOf[js.Any] },
        "filterPattern" -> filterPattern.map { x => x.asInstanceOf[js.Any] },
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "metricTransformations" -> metricTransformations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricFilter]
    }
  }

  /**
   * Represents a matched event.
   */
  @js.native
  trait MetricFilterMatchRecord extends js.Object {
    var eventMessage: js.UndefOr[EventMessage]
    var eventNumber: js.UndefOr[EventNumber]
    var extractedValues: js.UndefOr[ExtractedValues]
  }

  object MetricFilterMatchRecord {
    def apply(
      eventMessage: js.UndefOr[EventMessage] = js.undefined,
      eventNumber: js.UndefOr[EventNumber] = js.undefined,
      extractedValues: js.UndefOr[ExtractedValues] = js.undefined): MetricFilterMatchRecord = {
      val _fields = IndexedSeq[(String, js.Any)](
        "eventMessage" -> eventMessage.map { x => x.asInstanceOf[js.Any] },
        "eventNumber" -> eventNumber.map { x => x.asInstanceOf[js.Any] },
        "extractedValues" -> extractedValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricFilterMatchRecord]
    }
  }

  /**
   * Indicates how to transform ingested log eventsto metric data in a CloudWatch metric.
   */
  @js.native
  trait MetricTransformation extends js.Object {
    var metricName: MetricName
    var metricNamespace: MetricNamespace
    var metricValue: MetricValue
    var defaultValue: js.UndefOr[DefaultValue]
  }

  object MetricTransformation {
    def apply(
      metricName: MetricName,
      metricNamespace: MetricNamespace,
      metricValue: MetricValue,
      defaultValue: js.UndefOr[DefaultValue] = js.undefined): MetricTransformation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "metricName" -> metricName.asInstanceOf[js.Any],
        "metricNamespace" -> metricNamespace.asInstanceOf[js.Any],
        "metricValue" -> metricValue.asInstanceOf[js.Any],
        "defaultValue" -> defaultValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricTransformation]
    }
  }

  object OrderByEnum {
    val LogStreamName = "LogStreamName"
    val LastEventTime = "LastEventTime"

    val values = IndexedSeq(LogStreamName, LastEventTime)
  }

  /**
   * Represents a log event.
   */
  @js.native
  trait OutputLogEvent extends js.Object {
    var ingestionTime: js.UndefOr[Timestamp]
    var message: js.UndefOr[EventMessage]
    var timestamp: js.UndefOr[Timestamp]
  }

  object OutputLogEvent {
    def apply(
      ingestionTime: js.UndefOr[Timestamp] = js.undefined,
      message: js.UndefOr[EventMessage] = js.undefined,
      timestamp: js.UndefOr[Timestamp] = js.undefined): OutputLogEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ingestionTime" -> ingestionTime.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] },
        "timestamp" -> timestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputLogEvent]
    }
  }

  @js.native
  trait PutDestinationPolicyRequest extends js.Object {
    var accessPolicy: AccessPolicy
    var destinationName: DestinationName
  }

  object PutDestinationPolicyRequest {
    def apply(
      accessPolicy: AccessPolicy,
      destinationName: DestinationName): PutDestinationPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accessPolicy" -> accessPolicy.asInstanceOf[js.Any],
        "destinationName" -> destinationName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDestinationPolicyRequest]
    }
  }

  @js.native
  trait PutDestinationRequest extends js.Object {
    var destinationName: DestinationName
    var roleArn: RoleArn
    var targetArn: TargetArn
  }

  object PutDestinationRequest {
    def apply(
      destinationName: DestinationName,
      roleArn: RoleArn,
      targetArn: TargetArn): PutDestinationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "destinationName" -> destinationName.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "targetArn" -> targetArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDestinationRequest]
    }
  }

  @js.native
  trait PutDestinationResponse extends js.Object {
    var destination: js.UndefOr[Destination]
  }

  object PutDestinationResponse {
    def apply(
      destination: js.UndefOr[Destination] = js.undefined): PutDestinationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "destination" -> destination.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDestinationResponse]
    }
  }

  @js.native
  trait PutLogEventsRequest extends js.Object {
    var logEvents: InputLogEvents
    var logGroupName: LogGroupName
    var logStreamName: LogStreamName
    var sequenceToken: js.UndefOr[SequenceToken]
  }

  object PutLogEventsRequest {
    def apply(
      logEvents: InputLogEvents,
      logGroupName: LogGroupName,
      logStreamName: LogStreamName,
      sequenceToken: js.UndefOr[SequenceToken] = js.undefined): PutLogEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logEvents" -> logEvents.asInstanceOf[js.Any],
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "logStreamName" -> logStreamName.asInstanceOf[js.Any],
        "sequenceToken" -> sequenceToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutLogEventsRequest]
    }
  }

  @js.native
  trait PutLogEventsResponse extends js.Object {
    var nextSequenceToken: js.UndefOr[SequenceToken]
    var rejectedLogEventsInfo: js.UndefOr[RejectedLogEventsInfo]
  }

  object PutLogEventsResponse {
    def apply(
      nextSequenceToken: js.UndefOr[SequenceToken] = js.undefined,
      rejectedLogEventsInfo: js.UndefOr[RejectedLogEventsInfo] = js.undefined): PutLogEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextSequenceToken" -> nextSequenceToken.map { x => x.asInstanceOf[js.Any] },
        "rejectedLogEventsInfo" -> rejectedLogEventsInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutLogEventsResponse]
    }
  }

  @js.native
  trait PutMetricFilterRequest extends js.Object {
    var filterName: FilterName
    var filterPattern: FilterPattern
    var logGroupName: LogGroupName
    var metricTransformations: MetricTransformations
  }

  object PutMetricFilterRequest {
    def apply(
      filterName: FilterName,
      filterPattern: FilterPattern,
      logGroupName: LogGroupName,
      metricTransformations: MetricTransformations): PutMetricFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filterName" -> filterName.asInstanceOf[js.Any],
        "filterPattern" -> filterPattern.asInstanceOf[js.Any],
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "metricTransformations" -> metricTransformations.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutMetricFilterRequest]
    }
  }

  @js.native
  trait PutResourcePolicyRequest extends js.Object {
    var policyDocument: js.UndefOr[PolicyDocument]
    var policyName: js.UndefOr[PolicyName]
  }

  object PutResourcePolicyRequest {
    def apply(
      policyDocument: js.UndefOr[PolicyDocument] = js.undefined,
      policyName: js.UndefOr[PolicyName] = js.undefined): PutResourcePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyDocument" -> policyDocument.map { x => x.asInstanceOf[js.Any] },
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutResourcePolicyRequest]
    }
  }

  @js.native
  trait PutResourcePolicyResponse extends js.Object {
    var resourcePolicy: js.UndefOr[ResourcePolicy]
  }

  object PutResourcePolicyResponse {
    def apply(
      resourcePolicy: js.UndefOr[ResourcePolicy] = js.undefined): PutResourcePolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourcePolicy" -> resourcePolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutResourcePolicyResponse]
    }
  }

  @js.native
  trait PutRetentionPolicyRequest extends js.Object {
    var logGroupName: LogGroupName
    var retentionInDays: Days
  }

  object PutRetentionPolicyRequest {
    def apply(
      logGroupName: LogGroupName,
      retentionInDays: Days): PutRetentionPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "retentionInDays" -> retentionInDays.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRetentionPolicyRequest]
    }
  }

  @js.native
  trait PutSubscriptionFilterRequest extends js.Object {
    var destinationArn: DestinationArn
    var filterName: FilterName
    var filterPattern: FilterPattern
    var logGroupName: LogGroupName
    var distribution: js.UndefOr[Distribution]
    var roleArn: js.UndefOr[RoleArn]
  }

  object PutSubscriptionFilterRequest {
    def apply(
      destinationArn: DestinationArn,
      filterName: FilterName,
      filterPattern: FilterPattern,
      logGroupName: LogGroupName,
      distribution: js.UndefOr[Distribution] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined): PutSubscriptionFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "destinationArn" -> destinationArn.asInstanceOf[js.Any],
        "filterName" -> filterName.asInstanceOf[js.Any],
        "filterPattern" -> filterPattern.asInstanceOf[js.Any],
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "distribution" -> distribution.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutSubscriptionFilterRequest]
    }
  }

  /**
   * Information about one CloudWatch Logs Insights query that matches the request in a <code>DescribeQueries</code> operation.
   */
  @js.native
  trait QueryInfo extends js.Object {
    var createTime: js.UndefOr[Timestamp]
    var logGroupName: js.UndefOr[LogGroupName]
    var queryId: js.UndefOr[QueryId]
    var queryString: js.UndefOr[QueryString]
    var status: js.UndefOr[QueryStatus]
  }

  object QueryInfo {
    def apply(
      createTime: js.UndefOr[Timestamp] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      queryId: js.UndefOr[QueryId] = js.undefined,
      queryString: js.UndefOr[QueryString] = js.undefined,
      status: js.UndefOr[QueryStatus] = js.undefined): QueryInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "createTime" -> createTime.map { x => x.asInstanceOf[js.Any] },
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "queryId" -> queryId.map { x => x.asInstanceOf[js.Any] },
        "queryString" -> queryString.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryInfo]
    }
  }

  /**
   * Contains the number of log events scanned by the query, the number of log events that matched the query criteria, and the total number of bytes in the log events that were scanned.
   */
  @js.native
  trait QueryStatistics extends js.Object {
    var bytesScanned: js.UndefOr[StatsValue]
    var recordsMatched: js.UndefOr[StatsValue]
    var recordsScanned: js.UndefOr[StatsValue]
  }

  object QueryStatistics {
    def apply(
      bytesScanned: js.UndefOr[StatsValue] = js.undefined,
      recordsMatched: js.UndefOr[StatsValue] = js.undefined,
      recordsScanned: js.UndefOr[StatsValue] = js.undefined): QueryStatistics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bytesScanned" -> bytesScanned.map { x => x.asInstanceOf[js.Any] },
        "recordsMatched" -> recordsMatched.map { x => x.asInstanceOf[js.Any] },
        "recordsScanned" -> recordsScanned.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryStatistics]
    }
  }

  object QueryStatusEnum {
    val Scheduled = "Scheduled"
    val Running = "Running"
    val Complete = "Complete"
    val Failed = "Failed"
    val Cancelled = "Cancelled"

    val values = IndexedSeq(Scheduled, Running, Complete, Failed, Cancelled)
  }

  /**
   * Represents the rejected events.
   */
  @js.native
  trait RejectedLogEventsInfo extends js.Object {
    var expiredLogEventEndIndex: js.UndefOr[LogEventIndex]
    var tooNewLogEventStartIndex: js.UndefOr[LogEventIndex]
    var tooOldLogEventEndIndex: js.UndefOr[LogEventIndex]
  }

  object RejectedLogEventsInfo {
    def apply(
      expiredLogEventEndIndex: js.UndefOr[LogEventIndex] = js.undefined,
      tooNewLogEventStartIndex: js.UndefOr[LogEventIndex] = js.undefined,
      tooOldLogEventEndIndex: js.UndefOr[LogEventIndex] = js.undefined): RejectedLogEventsInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "expiredLogEventEndIndex" -> expiredLogEventEndIndex.map { x => x.asInstanceOf[js.Any] },
        "tooNewLogEventStartIndex" -> tooNewLogEventStartIndex.map { x => x.asInstanceOf[js.Any] },
        "tooOldLogEventEndIndex" -> tooOldLogEventEndIndex.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectedLogEventsInfo]
    }
  }

  /**
   * A policy enabling one or more entities to put logs to a log group in this account.
   */
  @js.native
  trait ResourcePolicy extends js.Object {
    var lastUpdatedTime: js.UndefOr[Timestamp]
    var policyDocument: js.UndefOr[PolicyDocument]
    var policyName: js.UndefOr[PolicyName]
  }

  object ResourcePolicy {
    def apply(
      lastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
      policyDocument: js.UndefOr[PolicyDocument] = js.undefined,
      policyName: js.UndefOr[PolicyName] = js.undefined): ResourcePolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lastUpdatedTime" -> lastUpdatedTime.map { x => x.asInstanceOf[js.Any] },
        "policyDocument" -> policyDocument.map { x => x.asInstanceOf[js.Any] },
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourcePolicy]
    }
  }

  /**
   * Contains one field from one log event returned by a CloudWatch Logs Insights query, along with the value of that field.
   */
  @js.native
  trait ResultField extends js.Object {
    var field: js.UndefOr[Field]
    var value: js.UndefOr[Value]
  }

  object ResultField {
    def apply(
      field: js.UndefOr[Field] = js.undefined,
      value: js.UndefOr[Value] = js.undefined): ResultField = {
      val _fields = IndexedSeq[(String, js.Any)](
        "field" -> field.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResultField]
    }
  }

  /**
   * Represents the search status of a log stream.
   */
  @js.native
  trait SearchedLogStream extends js.Object {
    var logStreamName: js.UndefOr[LogStreamName]
    var searchedCompletely: js.UndefOr[LogStreamSearchedCompletely]
  }

  object SearchedLogStream {
    def apply(
      logStreamName: js.UndefOr[LogStreamName] = js.undefined,
      searchedCompletely: js.UndefOr[LogStreamSearchedCompletely] = js.undefined): SearchedLogStream = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logStreamName" -> logStreamName.map { x => x.asInstanceOf[js.Any] },
        "searchedCompletely" -> searchedCompletely.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchedLogStream]
    }
  }

  @js.native
  trait StartQueryRequest extends js.Object {
    var endTime: Timestamp
    var logGroupName: LogGroupName
    var queryString: QueryString
    var startTime: Timestamp
    var limit: js.UndefOr[EventsLimit]
  }

  object StartQueryRequest {
    def apply(
      endTime: Timestamp,
      logGroupName: LogGroupName,
      queryString: QueryString,
      startTime: Timestamp,
      limit: js.UndefOr[EventsLimit] = js.undefined): StartQueryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "endTime" -> endTime.asInstanceOf[js.Any],
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "queryString" -> queryString.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any],
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartQueryRequest]
    }
  }

  @js.native
  trait StartQueryResponse extends js.Object {
    var queryId: js.UndefOr[QueryId]
  }

  object StartQueryResponse {
    def apply(
      queryId: js.UndefOr[QueryId] = js.undefined): StartQueryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "queryId" -> queryId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartQueryResponse]
    }
  }

  @js.native
  trait StopQueryRequest extends js.Object {
    var queryId: QueryId
  }

  object StopQueryRequest {
    def apply(
      queryId: QueryId): StopQueryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "queryId" -> queryId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopQueryRequest]
    }
  }

  @js.native
  trait StopQueryResponse extends js.Object {
    var success: js.UndefOr[Success]
  }

  object StopQueryResponse {
    def apply(
      success: js.UndefOr[Success] = js.undefined): StopQueryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "success" -> success.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopQueryResponse]
    }
  }

  /**
   * Represents a subscription filter.
   */
  @js.native
  trait SubscriptionFilter extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var destinationArn: js.UndefOr[DestinationArn]
    var distribution: js.UndefOr[Distribution]
    var filterName: js.UndefOr[FilterName]
    var filterPattern: js.UndefOr[FilterPattern]
    var logGroupName: js.UndefOr[LogGroupName]
    var roleArn: js.UndefOr[RoleArn]
  }

  object SubscriptionFilter {
    def apply(
      creationTime: js.UndefOr[Timestamp] = js.undefined,
      destinationArn: js.UndefOr[DestinationArn] = js.undefined,
      distribution: js.UndefOr[Distribution] = js.undefined,
      filterName: js.UndefOr[FilterName] = js.undefined,
      filterPattern: js.UndefOr[FilterPattern] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined): SubscriptionFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] },
        "destinationArn" -> destinationArn.map { x => x.asInstanceOf[js.Any] },
        "distribution" -> distribution.map { x => x.asInstanceOf[js.Any] },
        "filterName" -> filterName.map { x => x.asInstanceOf[js.Any] },
        "filterPattern" -> filterPattern.map { x => x.asInstanceOf[js.Any] },
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscriptionFilter]
    }
  }

  @js.native
  trait TagLogGroupRequest extends js.Object {
    var logGroupName: LogGroupName
    var tags: Tags
  }

  object TagLogGroupRequest {
    def apply(
      logGroupName: LogGroupName,
      tags: Tags): TagLogGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagLogGroupRequest]
    }
  }

  @js.native
  trait TestMetricFilterRequest extends js.Object {
    var filterPattern: FilterPattern
    var logEventMessages: TestEventMessages
  }

  object TestMetricFilterRequest {
    def apply(
      filterPattern: FilterPattern,
      logEventMessages: TestEventMessages): TestMetricFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filterPattern" -> filterPattern.asInstanceOf[js.Any],
        "logEventMessages" -> logEventMessages.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestMetricFilterRequest]
    }
  }

  @js.native
  trait TestMetricFilterResponse extends js.Object {
    var matches: js.UndefOr[MetricFilterMatches]
  }

  object TestMetricFilterResponse {
    def apply(
      matches: js.UndefOr[MetricFilterMatches] = js.undefined): TestMetricFilterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "matches" -> matches.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestMetricFilterResponse]
    }
  }

  @js.native
  trait UntagLogGroupRequest extends js.Object {
    var logGroupName: LogGroupName
    var tags: TagList
  }

  object UntagLogGroupRequest {
    def apply(
      logGroupName: LogGroupName,
      tags: TagList): UntagLogGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagLogGroupRequest]
    }
  }
}
