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
  type FilterCount = Int
  type FilterName = String
  type FilterPattern = String
  type FilteredLogEvents = js.Array[FilteredLogEvent]
  type InputLogEvents = js.Array[InputLogEvent]
  type InputLogStreamNames = js.Array[LogStreamName]
  type Interleaved = Boolean
  type KmsKeyId = String
  type LogEventIndex = Int
  type LogGroupName = String
  type LogGroups = js.Array[LogGroup]
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
  type PolicyDocument = String
  type PolicyName = String
  type ResourcePolicies = js.Array[ResourcePolicy]
  type RoleArn = String
  type SearchedLogStreams = js.Array[SearchedLogStream]
  type SequenceToken = String
  type StartFromHead = Boolean
  type StoredBytes = Double
  type SubscriptionFilters = js.Array[SubscriptionFilter]
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
    def describeResourcePolicies(params: DescribeResourcePoliciesRequest): Request[DescribeResourcePoliciesResponse] = js.native
    def describeSubscriptionFilters(params: DescribeSubscriptionFiltersRequest): Request[DescribeSubscriptionFiltersResponse] = js.native
    def disassociateKmsKey(params: DisassociateKmsKeyRequest): Request[js.Object] = js.native
    def filterLogEvents(params: FilterLogEventsRequest): Request[FilterLogEventsResponse] = js.native
    def getLogEvents(params: GetLogEventsRequest): Request[GetLogEventsResponse] = js.native
    def listTagsLogGroup(params: ListTagsLogGroupRequest): Request[ListTagsLogGroupResponse] = js.native
    def putDestination(params: PutDestinationRequest): Request[PutDestinationResponse] = js.native
    def putDestinationPolicy(params: PutDestinationPolicyRequest): Request[js.Object] = js.native
    def putLogEvents(params: PutLogEventsRequest): Request[PutLogEventsResponse] = js.native
    def putMetricFilter(params: PutMetricFilterRequest): Request[js.Object] = js.native
    def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse] = js.native
    def putRetentionPolicy(params: PutRetentionPolicyRequest): Request[js.Object] = js.native
    def putSubscriptionFilter(params: PutSubscriptionFilterRequest): Request[js.Object] = js.native
    def tagLogGroup(params: TagLogGroupRequest): Request[js.Object] = js.native
    def testMetricFilter(params: TestMetricFilterRequest): Request[TestMetricFilterResponse] = js.native
    def untagLogGroup(params: UntagLogGroupRequest): Request[js.Object] = js.native
  }

  @js.native
  trait AssociateKmsKeyRequest extends js.Object {
    var logGroupName: js.UndefOr[LogGroupName]
    var kmsKeyId: js.UndefOr[KmsKeyId]
  }

  object AssociateKmsKeyRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined): AssociateKmsKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "kmsKeyId" -> kmsKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateKmsKeyRequest]
    }
  }

  @js.native
  trait CancelExportTaskRequest extends js.Object {
    var taskId: js.UndefOr[ExportTaskId]
  }

  object CancelExportTaskRequest {
    def apply(
      taskId: js.UndefOr[ExportTaskId] = js.undefined): CancelExportTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId" -> taskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelExportTaskRequest]
    }
  }

  @js.native
  trait CreateExportTaskRequest extends js.Object {
    var logStreamNamePrefix: js.UndefOr[LogStreamName]
    var destinationPrefix: js.UndefOr[ExportDestinationPrefix]
    var to: js.UndefOr[Timestamp]
    var logGroupName: js.UndefOr[LogGroupName]
    var from: js.UndefOr[Timestamp]
    var taskName: js.UndefOr[ExportTaskName]
    var destination: js.UndefOr[ExportDestinationBucket]
  }

  object CreateExportTaskRequest {
    def apply(
      logStreamNamePrefix: js.UndefOr[LogStreamName] = js.undefined,
      destinationPrefix: js.UndefOr[ExportDestinationPrefix] = js.undefined,
      to: js.UndefOr[Timestamp] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      from: js.UndefOr[Timestamp] = js.undefined,
      taskName: js.UndefOr[ExportTaskName] = js.undefined,
      destination: js.UndefOr[ExportDestinationBucket] = js.undefined): CreateExportTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logStreamNamePrefix" -> logStreamNamePrefix.map { x => x.asInstanceOf[js.Any] },
        "destinationPrefix" -> destinationPrefix.map { x => x.asInstanceOf[js.Any] },
        "to" -> to.map { x => x.asInstanceOf[js.Any] },
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "from" -> from.map { x => x.asInstanceOf[js.Any] },
        "taskName" -> taskName.map { x => x.asInstanceOf[js.Any] },
        "destination" -> destination.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var logGroupName: js.UndefOr[LogGroupName]
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var tags: js.UndefOr[Tags]
  }

  object CreateLogGroupRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined): CreateLogGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "kmsKeyId" -> kmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLogGroupRequest]
    }
  }

  @js.native
  trait CreateLogStreamRequest extends js.Object {
    var logGroupName: js.UndefOr[LogGroupName]
    var logStreamName: js.UndefOr[LogStreamName]
  }

  object CreateLogStreamRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      logStreamName: js.UndefOr[LogStreamName] = js.undefined): CreateLogStreamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "logStreamName" -> logStreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLogStreamRequest]
    }
  }

  @js.native
  trait DeleteDestinationRequest extends js.Object {
    var destinationName: js.UndefOr[DestinationName]
  }

  object DeleteDestinationRequest {
    def apply(
      destinationName: js.UndefOr[DestinationName] = js.undefined): DeleteDestinationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "destinationName" -> destinationName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDestinationRequest]
    }
  }

  @js.native
  trait DeleteLogGroupRequest extends js.Object {
    var logGroupName: js.UndefOr[LogGroupName]
  }

  object DeleteLogGroupRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined): DeleteLogGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLogGroupRequest]
    }
  }

  @js.native
  trait DeleteLogStreamRequest extends js.Object {
    var logGroupName: js.UndefOr[LogGroupName]
    var logStreamName: js.UndefOr[LogStreamName]
  }

  object DeleteLogStreamRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      logStreamName: js.UndefOr[LogStreamName] = js.undefined): DeleteLogStreamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "logStreamName" -> logStreamName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLogStreamRequest]
    }
  }

  @js.native
  trait DeleteMetricFilterRequest extends js.Object {
    var logGroupName: js.UndefOr[LogGroupName]
    var filterName: js.UndefOr[FilterName]
  }

  object DeleteMetricFilterRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      filterName: js.UndefOr[FilterName] = js.undefined): DeleteMetricFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "filterName" -> filterName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var logGroupName: js.UndefOr[LogGroupName]
  }

  object DeleteRetentionPolicyRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined): DeleteRetentionPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRetentionPolicyRequest]
    }
  }

  @js.native
  trait DeleteSubscriptionFilterRequest extends js.Object {
    var logGroupName: js.UndefOr[LogGroupName]
    var filterName: js.UndefOr[FilterName]
  }

  object DeleteSubscriptionFilterRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      filterName: js.UndefOr[FilterName] = js.undefined): DeleteSubscriptionFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "filterName" -> filterName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSubscriptionFilterRequest]
    }
  }

  @js.native
  trait DescribeDestinationsRequest extends js.Object {
    var DestinationNamePrefix: js.UndefOr[DestinationName]
    var nextToken: js.UndefOr[NextToken]
    var limit: js.UndefOr[DescribeLimit]
  }

  object DescribeDestinationsRequest {
    def apply(
      DestinationNamePrefix: js.UndefOr[DestinationName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      limit: js.UndefOr[DescribeLimit] = js.undefined): DescribeDestinationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationNamePrefix" -> DestinationNamePrefix.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var taskId: js.UndefOr[ExportTaskId]
    var statusCode: js.UndefOr[ExportTaskStatusCode]
    var nextToken: js.UndefOr[NextToken]
    var limit: js.UndefOr[DescribeLimit]
  }

  object DescribeExportTasksRequest {
    def apply(
      taskId: js.UndefOr[ExportTaskId] = js.undefined,
      statusCode: js.UndefOr[ExportTaskStatusCode] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      limit: js.UndefOr[DescribeLimit] = js.undefined): DescribeExportTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "taskId" -> taskId.map { x => x.asInstanceOf[js.Any] },
        "statusCode" -> statusCode.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var logGroupNamePrefix: js.UndefOr[LogGroupName]
    var nextToken: js.UndefOr[NextToken]
    var limit: js.UndefOr[DescribeLimit]
  }

  object DescribeLogGroupsRequest {
    def apply(
      logGroupNamePrefix: js.UndefOr[LogGroupName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      limit: js.UndefOr[DescribeLimit] = js.undefined): DescribeLogGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupNamePrefix" -> logGroupNamePrefix.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var nextToken: js.UndefOr[NextToken]
    var logStreamNamePrefix: js.UndefOr[LogStreamName]
    var descending: js.UndefOr[Descending]
    var logGroupName: js.UndefOr[LogGroupName]
    var orderBy: js.UndefOr[OrderBy]
    var limit: js.UndefOr[DescribeLimit]
  }

  object DescribeLogStreamsRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      logStreamNamePrefix: js.UndefOr[LogStreamName] = js.undefined,
      descending: js.UndefOr[Descending] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      orderBy: js.UndefOr[OrderBy] = js.undefined,
      limit: js.UndefOr[DescribeLimit] = js.undefined): DescribeLogStreamsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "logStreamNamePrefix" -> logStreamNamePrefix.map { x => x.asInstanceOf[js.Any] },
        "descending" -> descending.map { x => x.asInstanceOf[js.Any] },
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "orderBy" -> orderBy.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var metricName: js.UndefOr[MetricName]
    var nextToken: js.UndefOr[NextToken]
    var logGroupName: js.UndefOr[LogGroupName]
    var metricNamespace: js.UndefOr[MetricNamespace]
    var filterNamePrefix: js.UndefOr[FilterName]
    var limit: js.UndefOr[DescribeLimit]
  }

  object DescribeMetricFiltersRequest {
    def apply(
      metricName: js.UndefOr[MetricName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      metricNamespace: js.UndefOr[MetricNamespace] = js.undefined,
      filterNamePrefix: js.UndefOr[FilterName] = js.undefined,
      limit: js.UndefOr[DescribeLimit] = js.undefined): DescribeMetricFiltersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "metricName" -> metricName.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "metricNamespace" -> metricNamespace.map { x => x.asInstanceOf[js.Any] },
        "filterNamePrefix" -> filterNamePrefix.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
  trait DescribeResourcePoliciesRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var limit: js.UndefOr[DescribeLimit]
  }

  object DescribeResourcePoliciesRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      limit: js.UndefOr[DescribeLimit] = js.undefined): DescribeResourcePoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResourcePoliciesRequest]
    }
  }

  @js.native
  trait DescribeResourcePoliciesResponse extends js.Object {
    var resourcePolicies: js.UndefOr[ResourcePolicies]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeResourcePoliciesResponse {
    def apply(
      resourcePolicies: js.UndefOr[ResourcePolicies] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeResourcePoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourcePolicies" -> resourcePolicies.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeResourcePoliciesResponse]
    }
  }

  @js.native
  trait DescribeSubscriptionFiltersRequest extends js.Object {
    var logGroupName: js.UndefOr[LogGroupName]
    var filterNamePrefix: js.UndefOr[FilterName]
    var nextToken: js.UndefOr[NextToken]
    var limit: js.UndefOr[DescribeLimit]
  }

  object DescribeSubscriptionFiltersRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      filterNamePrefix: js.UndefOr[FilterName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      limit: js.UndefOr[DescribeLimit] = js.undefined): DescribeSubscriptionFiltersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "filterNamePrefix" -> filterNamePrefix.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubscriptionFiltersRequest]
    }
  }

  @js.native
  trait DescribeSubscriptionFiltersResponse extends js.Object {
    var subscriptionFilters: js.UndefOr[SubscriptionFilters]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeSubscriptionFiltersResponse {
    def apply(
      subscriptionFilters: js.UndefOr[SubscriptionFilters] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): DescribeSubscriptionFiltersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "subscriptionFilters" -> subscriptionFilters.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubscriptionFiltersResponse]
    }
  }

  /**
   * <p>Represents a cross-account destination that receives subscription log events.</p>
   */
  @js.native
  trait Destination extends js.Object {
    var arn: js.UndefOr[Arn]
    var targetArn: js.UndefOr[TargetArn]
    var destinationName: js.UndefOr[DestinationName]
    var roleArn: js.UndefOr[RoleArn]
    var accessPolicy: js.UndefOr[AccessPolicy]
    var creationTime: js.UndefOr[Timestamp]
  }

  object Destination {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      targetArn: js.UndefOr[TargetArn] = js.undefined,
      destinationName: js.UndefOr[DestinationName] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      accessPolicy: js.UndefOr[AccessPolicy] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined): Destination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "targetArn" -> targetArn.map { x => x.asInstanceOf[js.Any] },
        "destinationName" -> destinationName.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "accessPolicy" -> accessPolicy.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Destination]
    }
  }

  @js.native
  trait DisassociateKmsKeyRequest extends js.Object {
    var logGroupName: js.UndefOr[LogGroupName]
  }

  object DisassociateKmsKeyRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined): DisassociateKmsKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateKmsKeyRequest]
    }
  }

  /**
   * <p>The method used to distribute log data to the destination, which can be either random or grouped by log stream.</p>
   */
  object DistributionEnum {
    val Random = "Random"
    val ByLogStream = "ByLogStream"

    val values = IndexedSeq(Random, ByLogStream)
  }

  /**
   * <p>Represents an export task.</p>
   */
  @js.native
  trait ExportTask extends js.Object {
    var destinationPrefix: js.UndefOr[ExportDestinationPrefix]
    var to: js.UndefOr[Timestamp]
    var status: js.UndefOr[ExportTaskStatus]
    var logGroupName: js.UndefOr[LogGroupName]
    var from: js.UndefOr[Timestamp]
    var taskName: js.UndefOr[ExportTaskName]
    var executionInfo: js.UndefOr[ExportTaskExecutionInfo]
    var destination: js.UndefOr[ExportDestinationBucket]
    var taskId: js.UndefOr[ExportTaskId]
  }

  object ExportTask {
    def apply(
      destinationPrefix: js.UndefOr[ExportDestinationPrefix] = js.undefined,
      to: js.UndefOr[Timestamp] = js.undefined,
      status: js.UndefOr[ExportTaskStatus] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      from: js.UndefOr[Timestamp] = js.undefined,
      taskName: js.UndefOr[ExportTaskName] = js.undefined,
      executionInfo: js.UndefOr[ExportTaskExecutionInfo] = js.undefined,
      destination: js.UndefOr[ExportDestinationBucket] = js.undefined,
      taskId: js.UndefOr[ExportTaskId] = js.undefined): ExportTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        "destinationPrefix" -> destinationPrefix.map { x => x.asInstanceOf[js.Any] },
        "to" -> to.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "from" -> from.map { x => x.asInstanceOf[js.Any] },
        "taskName" -> taskName.map { x => x.asInstanceOf[js.Any] },
        "executionInfo" -> executionInfo.map { x => x.asInstanceOf[js.Any] },
        "destination" -> destination.map { x => x.asInstanceOf[js.Any] },
        "taskId" -> taskId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportTask]
    }
  }

  /**
   * <p>Represents the status of an export task.</p>
   */
  @js.native
  trait ExportTaskExecutionInfo extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var completionTime: js.UndefOr[Timestamp]
  }

  object ExportTaskExecutionInfo {
    def apply(
      creationTime: js.UndefOr[Timestamp] = js.undefined,
      completionTime: js.UndefOr[Timestamp] = js.undefined): ExportTaskExecutionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] },
        "completionTime" -> completionTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportTaskExecutionInfo]
    }
  }

  /**
   * <p>Represents the status of an export task.</p>
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
    var filterPattern: js.UndefOr[FilterPattern]
    var startTime: js.UndefOr[Timestamp]
    var logStreamNames: js.UndefOr[InputLogStreamNames]
    var interleaved: js.UndefOr[Interleaved]
    var nextToken: js.UndefOr[NextToken]
    var logStreamNamePrefix: js.UndefOr[LogStreamName]
    var endTime: js.UndefOr[Timestamp]
    var logGroupName: js.UndefOr[LogGroupName]
    var limit: js.UndefOr[EventsLimit]
  }

  object FilterLogEventsRequest {
    def apply(
      filterPattern: js.UndefOr[FilterPattern] = js.undefined,
      startTime: js.UndefOr[Timestamp] = js.undefined,
      logStreamNames: js.UndefOr[InputLogStreamNames] = js.undefined,
      interleaved: js.UndefOr[Interleaved] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      logStreamNamePrefix: js.UndefOr[LogStreamName] = js.undefined,
      endTime: js.UndefOr[Timestamp] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      limit: js.UndefOr[EventsLimit] = js.undefined): FilterLogEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filterPattern" -> filterPattern.map { x => x.asInstanceOf[js.Any] },
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] },
        "logStreamNames" -> logStreamNames.map { x => x.asInstanceOf[js.Any] },
        "interleaved" -> interleaved.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "logStreamNamePrefix" -> logStreamNamePrefix.map { x => x.asInstanceOf[js.Any] },
        "endTime" -> endTime.map { x => x.asInstanceOf[js.Any] },
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FilterLogEventsRequest]
    }
  }

  @js.native
  trait FilterLogEventsResponse extends js.Object {
    var events: js.UndefOr[FilteredLogEvents]
    var searchedLogStreams: js.UndefOr[SearchedLogStreams]
    var nextToken: js.UndefOr[NextToken]
  }

  object FilterLogEventsResponse {
    def apply(
      events: js.UndefOr[FilteredLogEvents] = js.undefined,
      searchedLogStreams: js.UndefOr[SearchedLogStreams] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): FilterLogEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "events" -> events.map { x => x.asInstanceOf[js.Any] },
        "searchedLogStreams" -> searchedLogStreams.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FilterLogEventsResponse]
    }
  }

  /**
   * <p>Represents a matched event.</p>
   */
  @js.native
  trait FilteredLogEvent extends js.Object {
    var timestamp: js.UndefOr[Timestamp]
    var ingestionTime: js.UndefOr[Timestamp]
    var eventId: js.UndefOr[EventId]
    var logStreamName: js.UndefOr[LogStreamName]
    var message: js.UndefOr[EventMessage]
  }

  object FilteredLogEvent {
    def apply(
      timestamp: js.UndefOr[Timestamp] = js.undefined,
      ingestionTime: js.UndefOr[Timestamp] = js.undefined,
      eventId: js.UndefOr[EventId] = js.undefined,
      logStreamName: js.UndefOr[LogStreamName] = js.undefined,
      message: js.UndefOr[EventMessage] = js.undefined): FilteredLogEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "timestamp" -> timestamp.map { x => x.asInstanceOf[js.Any] },
        "ingestionTime" -> ingestionTime.map { x => x.asInstanceOf[js.Any] },
        "eventId" -> eventId.map { x => x.asInstanceOf[js.Any] },
        "logStreamName" -> logStreamName.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FilteredLogEvent]
    }
  }

  @js.native
  trait GetLogEventsRequest extends js.Object {
    var startTime: js.UndefOr[Timestamp]
    var startFromHead: js.UndefOr[StartFromHead]
    var nextToken: js.UndefOr[NextToken]
    var endTime: js.UndefOr[Timestamp]
    var logStreamName: js.UndefOr[LogStreamName]
    var logGroupName: js.UndefOr[LogGroupName]
    var limit: js.UndefOr[EventsLimit]
  }

  object GetLogEventsRequest {
    def apply(
      startTime: js.UndefOr[Timestamp] = js.undefined,
      startFromHead: js.UndefOr[StartFromHead] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      endTime: js.UndefOr[Timestamp] = js.undefined,
      logStreamName: js.UndefOr[LogStreamName] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      limit: js.UndefOr[EventsLimit] = js.undefined): GetLogEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] },
        "startFromHead" -> startFromHead.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "endTime" -> endTime.map { x => x.asInstanceOf[js.Any] },
        "logStreamName" -> logStreamName.map { x => x.asInstanceOf[js.Any] },
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLogEventsRequest]
    }
  }

  @js.native
  trait GetLogEventsResponse extends js.Object {
    var events: js.UndefOr[OutputLogEvents]
    var nextForwardToken: js.UndefOr[NextToken]
    var nextBackwardToken: js.UndefOr[NextToken]
  }

  object GetLogEventsResponse {
    def apply(
      events: js.UndefOr[OutputLogEvents] = js.undefined,
      nextForwardToken: js.UndefOr[NextToken] = js.undefined,
      nextBackwardToken: js.UndefOr[NextToken] = js.undefined): GetLogEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "events" -> events.map { x => x.asInstanceOf[js.Any] },
        "nextForwardToken" -> nextForwardToken.map { x => x.asInstanceOf[js.Any] },
        "nextBackwardToken" -> nextBackwardToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLogEventsResponse]
    }
  }

  /**
   * <p>Represents a log event, which is a record of activity that was recorded by the application or resource being monitored.</p>
   */
  @js.native
  trait InputLogEvent extends js.Object {
    var timestamp: js.UndefOr[Timestamp]
    var message: js.UndefOr[EventMessage]
  }

  object InputLogEvent {
    def apply(
      timestamp: js.UndefOr[Timestamp] = js.undefined,
      message: js.UndefOr[EventMessage] = js.undefined): InputLogEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "timestamp" -> timestamp.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputLogEvent]
    }
  }

  @js.native
  trait ListTagsLogGroupRequest extends js.Object {
    var logGroupName: js.UndefOr[LogGroupName]
  }

  object ListTagsLogGroupRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined): ListTagsLogGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * <p>Represents a log group.</p>
   */
  @js.native
  trait LogGroup extends js.Object {
    var storedBytes: js.UndefOr[StoredBytes]
    var arn: js.UndefOr[Arn]
    var metricFilterCount: js.UndefOr[FilterCount]
    var retentionInDays: js.UndefOr[Days]
    var logGroupName: js.UndefOr[LogGroupName]
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var creationTime: js.UndefOr[Timestamp]
  }

  object LogGroup {
    def apply(
      storedBytes: js.UndefOr[StoredBytes] = js.undefined,
      arn: js.UndefOr[Arn] = js.undefined,
      metricFilterCount: js.UndefOr[FilterCount] = js.undefined,
      retentionInDays: js.UndefOr[Days] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined): LogGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "storedBytes" -> storedBytes.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "metricFilterCount" -> metricFilterCount.map { x => x.asInstanceOf[js.Any] },
        "retentionInDays" -> retentionInDays.map { x => x.asInstanceOf[js.Any] },
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "kmsKeyId" -> kmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogGroup]
    }
  }

  /**
   * <p>Represents a log stream, which is a sequence of log events from a single emitter of logs.</p>
   */
  @js.native
  trait LogStream extends js.Object {
    var storedBytes: js.UndefOr[StoredBytes]
    var arn: js.UndefOr[Arn]
    var firstEventTimestamp: js.UndefOr[Timestamp]
    var lastEventTimestamp: js.UndefOr[Timestamp]
    var uploadSequenceToken: js.UndefOr[SequenceToken]
    var logStreamName: js.UndefOr[LogStreamName]
    var lastIngestionTime: js.UndefOr[Timestamp]
    var creationTime: js.UndefOr[Timestamp]
  }

  object LogStream {
    def apply(
      storedBytes: js.UndefOr[StoredBytes] = js.undefined,
      arn: js.UndefOr[Arn] = js.undefined,
      firstEventTimestamp: js.UndefOr[Timestamp] = js.undefined,
      lastEventTimestamp: js.UndefOr[Timestamp] = js.undefined,
      uploadSequenceToken: js.UndefOr[SequenceToken] = js.undefined,
      logStreamName: js.UndefOr[LogStreamName] = js.undefined,
      lastIngestionTime: js.UndefOr[Timestamp] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined): LogStream = {
      val _fields = IndexedSeq[(String, js.Any)](
        "storedBytes" -> storedBytes.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "firstEventTimestamp" -> firstEventTimestamp.map { x => x.asInstanceOf[js.Any] },
        "lastEventTimestamp" -> lastEventTimestamp.map { x => x.asInstanceOf[js.Any] },
        "uploadSequenceToken" -> uploadSequenceToken.map { x => x.asInstanceOf[js.Any] },
        "logStreamName" -> logStreamName.map { x => x.asInstanceOf[js.Any] },
        "lastIngestionTime" -> lastIngestionTime.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogStream]
    }
  }

  /**
   * <p>Metric filters express how CloudWatch Logs would extract metric observations from ingested log events and transform them into metric data in a CloudWatch metric.</p>
   */
  @js.native
  trait MetricFilter extends js.Object {
    var filterPattern: js.UndefOr[FilterPattern]
    var filterName: js.UndefOr[FilterName]
    var metricTransformations: js.UndefOr[MetricTransformations]
    var logGroupName: js.UndefOr[LogGroupName]
    var creationTime: js.UndefOr[Timestamp]
  }

  object MetricFilter {
    def apply(
      filterPattern: js.UndefOr[FilterPattern] = js.undefined,
      filterName: js.UndefOr[FilterName] = js.undefined,
      metricTransformations: js.UndefOr[MetricTransformations] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined): MetricFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filterPattern" -> filterPattern.map { x => x.asInstanceOf[js.Any] },
        "filterName" -> filterName.map { x => x.asInstanceOf[js.Any] },
        "metricTransformations" -> metricTransformations.map { x => x.asInstanceOf[js.Any] },
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricFilter]
    }
  }

  /**
   * <p>Represents a matched event.</p>
   */
  @js.native
  trait MetricFilterMatchRecord extends js.Object {
    var eventNumber: js.UndefOr[EventNumber]
    var eventMessage: js.UndefOr[EventMessage]
    var extractedValues: js.UndefOr[ExtractedValues]
  }

  object MetricFilterMatchRecord {
    def apply(
      eventNumber: js.UndefOr[EventNumber] = js.undefined,
      eventMessage: js.UndefOr[EventMessage] = js.undefined,
      extractedValues: js.UndefOr[ExtractedValues] = js.undefined): MetricFilterMatchRecord = {
      val _fields = IndexedSeq[(String, js.Any)](
        "eventNumber" -> eventNumber.map { x => x.asInstanceOf[js.Any] },
        "eventMessage" -> eventMessage.map { x => x.asInstanceOf[js.Any] },
        "extractedValues" -> extractedValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricFilterMatchRecord]
    }
  }

  /**
   * <p>Indicates how to transform ingested log events in to metric data in a CloudWatch metric.</p>
   */
  @js.native
  trait MetricTransformation extends js.Object {
    var metricName: js.UndefOr[MetricName]
    var metricNamespace: js.UndefOr[MetricNamespace]
    var metricValue: js.UndefOr[MetricValue]
    var defaultValue: js.UndefOr[DefaultValue]
  }

  object MetricTransformation {
    def apply(
      metricName: js.UndefOr[MetricName] = js.undefined,
      metricNamespace: js.UndefOr[MetricNamespace] = js.undefined,
      metricValue: js.UndefOr[MetricValue] = js.undefined,
      defaultValue: js.UndefOr[DefaultValue] = js.undefined): MetricTransformation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "metricName" -> metricName.map { x => x.asInstanceOf[js.Any] },
        "metricNamespace" -> metricNamespace.map { x => x.asInstanceOf[js.Any] },
        "metricValue" -> metricValue.map { x => x.asInstanceOf[js.Any] },
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
   * <p>Represents a log event.</p>
   */
  @js.native
  trait OutputLogEvent extends js.Object {
    var timestamp: js.UndefOr[Timestamp]
    var message: js.UndefOr[EventMessage]
    var ingestionTime: js.UndefOr[Timestamp]
  }

  object OutputLogEvent {
    def apply(
      timestamp: js.UndefOr[Timestamp] = js.undefined,
      message: js.UndefOr[EventMessage] = js.undefined,
      ingestionTime: js.UndefOr[Timestamp] = js.undefined): OutputLogEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "timestamp" -> timestamp.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] },
        "ingestionTime" -> ingestionTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputLogEvent]
    }
  }

  @js.native
  trait PutDestinationPolicyRequest extends js.Object {
    var destinationName: js.UndefOr[DestinationName]
    var accessPolicy: js.UndefOr[AccessPolicy]
  }

  object PutDestinationPolicyRequest {
    def apply(
      destinationName: js.UndefOr[DestinationName] = js.undefined,
      accessPolicy: js.UndefOr[AccessPolicy] = js.undefined): PutDestinationPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "destinationName" -> destinationName.map { x => x.asInstanceOf[js.Any] },
        "accessPolicy" -> accessPolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDestinationPolicyRequest]
    }
  }

  @js.native
  trait PutDestinationRequest extends js.Object {
    var destinationName: js.UndefOr[DestinationName]
    var targetArn: js.UndefOr[TargetArn]
    var roleArn: js.UndefOr[RoleArn]
  }

  object PutDestinationRequest {
    def apply(
      destinationName: js.UndefOr[DestinationName] = js.undefined,
      targetArn: js.UndefOr[TargetArn] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined): PutDestinationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "destinationName" -> destinationName.map { x => x.asInstanceOf[js.Any] },
        "targetArn" -> targetArn.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var logGroupName: js.UndefOr[LogGroupName]
    var logStreamName: js.UndefOr[LogStreamName]
    var logEvents: js.UndefOr[InputLogEvents]
    var sequenceToken: js.UndefOr[SequenceToken]
  }

  object PutLogEventsRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      logStreamName: js.UndefOr[LogStreamName] = js.undefined,
      logEvents: js.UndefOr[InputLogEvents] = js.undefined,
      sequenceToken: js.UndefOr[SequenceToken] = js.undefined): PutLogEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "logStreamName" -> logStreamName.map { x => x.asInstanceOf[js.Any] },
        "logEvents" -> logEvents.map { x => x.asInstanceOf[js.Any] },
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
    var logGroupName: js.UndefOr[LogGroupName]
    var filterName: js.UndefOr[FilterName]
    var filterPattern: js.UndefOr[FilterPattern]
    var metricTransformations: js.UndefOr[MetricTransformations]
  }

  object PutMetricFilterRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      filterName: js.UndefOr[FilterName] = js.undefined,
      filterPattern: js.UndefOr[FilterPattern] = js.undefined,
      metricTransformations: js.UndefOr[MetricTransformations] = js.undefined): PutMetricFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "filterName" -> filterName.map { x => x.asInstanceOf[js.Any] },
        "filterPattern" -> filterPattern.map { x => x.asInstanceOf[js.Any] },
        "metricTransformations" -> metricTransformations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutMetricFilterRequest]
    }
  }

  @js.native
  trait PutResourcePolicyRequest extends js.Object {
    var policyName: js.UndefOr[PolicyName]
    var policyDocument: js.UndefOr[PolicyDocument]
  }

  object PutResourcePolicyRequest {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined,
      policyDocument: js.UndefOr[PolicyDocument] = js.undefined): PutResourcePolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] },
        "policyDocument" -> policyDocument.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var logGroupName: js.UndefOr[LogGroupName]
    var retentionInDays: js.UndefOr[Days]
  }

  object PutRetentionPolicyRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      retentionInDays: js.UndefOr[Days] = js.undefined): PutRetentionPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "retentionInDays" -> retentionInDays.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRetentionPolicyRequest]
    }
  }

  @js.native
  trait PutSubscriptionFilterRequest extends js.Object {
    var filterPattern: js.UndefOr[FilterPattern]
    var distribution: js.UndefOr[Distribution]
    var filterName: js.UndefOr[FilterName]
    var roleArn: js.UndefOr[RoleArn]
    var destinationArn: js.UndefOr[DestinationArn]
    var logGroupName: js.UndefOr[LogGroupName]
  }

  object PutSubscriptionFilterRequest {
    def apply(
      filterPattern: js.UndefOr[FilterPattern] = js.undefined,
      distribution: js.UndefOr[Distribution] = js.undefined,
      filterName: js.UndefOr[FilterName] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      destinationArn: js.UndefOr[DestinationArn] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined): PutSubscriptionFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filterPattern" -> filterPattern.map { x => x.asInstanceOf[js.Any] },
        "distribution" -> distribution.map { x => x.asInstanceOf[js.Any] },
        "filterName" -> filterName.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "destinationArn" -> destinationArn.map { x => x.asInstanceOf[js.Any] },
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutSubscriptionFilterRequest]
    }
  }

  /**
   * <p>Represents the rejected events.</p>
   */
  @js.native
  trait RejectedLogEventsInfo extends js.Object {
    var tooNewLogEventStartIndex: js.UndefOr[LogEventIndex]
    var tooOldLogEventEndIndex: js.UndefOr[LogEventIndex]
    var expiredLogEventEndIndex: js.UndefOr[LogEventIndex]
  }

  object RejectedLogEventsInfo {
    def apply(
      tooNewLogEventStartIndex: js.UndefOr[LogEventIndex] = js.undefined,
      tooOldLogEventEndIndex: js.UndefOr[LogEventIndex] = js.undefined,
      expiredLogEventEndIndex: js.UndefOr[LogEventIndex] = js.undefined): RejectedLogEventsInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tooNewLogEventStartIndex" -> tooNewLogEventStartIndex.map { x => x.asInstanceOf[js.Any] },
        "tooOldLogEventEndIndex" -> tooOldLogEventEndIndex.map { x => x.asInstanceOf[js.Any] },
        "expiredLogEventEndIndex" -> expiredLogEventEndIndex.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectedLogEventsInfo]
    }
  }

  /**
   * <p>A policy enabling one or more entities to put logs to a log group in this account.</p>
   */
  @js.native
  trait ResourcePolicy extends js.Object {
    var policyName: js.UndefOr[PolicyName]
    var policyDocument: js.UndefOr[PolicyDocument]
    var lastUpdatedTime: js.UndefOr[Timestamp]
  }

  object ResourcePolicy {
    def apply(
      policyName: js.UndefOr[PolicyName] = js.undefined,
      policyDocument: js.UndefOr[PolicyDocument] = js.undefined,
      lastUpdatedTime: js.UndefOr[Timestamp] = js.undefined): ResourcePolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "policyName" -> policyName.map { x => x.asInstanceOf[js.Any] },
        "policyDocument" -> policyDocument.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedTime" -> lastUpdatedTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourcePolicy]
    }
  }

  /**
   * <p>Represents the search status of a log stream.</p>
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

  /**
   * <p>Represents a subscription filter.</p>
   */
  @js.native
  trait SubscriptionFilter extends js.Object {
    var filterPattern: js.UndefOr[FilterPattern]
    var distribution: js.UndefOr[Distribution]
    var filterName: js.UndefOr[FilterName]
    var roleArn: js.UndefOr[RoleArn]
    var destinationArn: js.UndefOr[DestinationArn]
    var logGroupName: js.UndefOr[LogGroupName]
    var creationTime: js.UndefOr[Timestamp]
  }

  object SubscriptionFilter {
    def apply(
      filterPattern: js.UndefOr[FilterPattern] = js.undefined,
      distribution: js.UndefOr[Distribution] = js.undefined,
      filterName: js.UndefOr[FilterName] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      destinationArn: js.UndefOr[DestinationArn] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined): SubscriptionFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filterPattern" -> filterPattern.map { x => x.asInstanceOf[js.Any] },
        "distribution" -> distribution.map { x => x.asInstanceOf[js.Any] },
        "filterName" -> filterName.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "destinationArn" -> destinationArn.map { x => x.asInstanceOf[js.Any] },
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "creationTime" -> creationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscriptionFilter]
    }
  }

  @js.native
  trait TagLogGroupRequest extends js.Object {
    var logGroupName: js.UndefOr[LogGroupName]
    var tags: js.UndefOr[Tags]
  }

  object TagLogGroupRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined): TagLogGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagLogGroupRequest]
    }
  }

  @js.native
  trait TestMetricFilterRequest extends js.Object {
    var filterPattern: js.UndefOr[FilterPattern]
    var logEventMessages: js.UndefOr[TestEventMessages]
  }

  object TestMetricFilterRequest {
    def apply(
      filterPattern: js.UndefOr[FilterPattern] = js.undefined,
      logEventMessages: js.UndefOr[TestEventMessages] = js.undefined): TestMetricFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "filterPattern" -> filterPattern.map { x => x.asInstanceOf[js.Any] },
        "logEventMessages" -> logEventMessages.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var logGroupName: js.UndefOr[LogGroupName]
    var tags: js.UndefOr[TagList]
  }

  object UntagLogGroupRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      tags: js.UndefOr[TagList] = js.undefined): UntagLogGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "logGroupName" -> logGroupName.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagLogGroupRequest]
    }
  }
}
