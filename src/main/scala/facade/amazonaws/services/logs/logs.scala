package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object logs {
  type AccessPolicy = String
  type Arn = String
  type Days = Integer
  type DefaultValue = Double
  type Descending = Boolean
  type DescribeLimit = Integer
  type DestinationArn = String
  type DestinationName = String
  type Destinations = js.Array[Destination]
  type Distribution = String
  type EventId = String
  type EventMessage = String
  type EventNumber = Long
  type EventsLimit = Integer
  type ExportDestinationBucket = String
  type ExportDestinationPrefix = String
  type ExportTaskId = String
  type ExportTaskName = String
  type ExportTaskStatusCode = String
  type ExportTaskStatusMessage = String
  type ExportTasks = js.Array[ExportTask]
  type ExtractedValues = js.Dictionary[Value]
  type FilterCount = Integer
  type FilterName = String
  type FilterPattern = String
  type FilteredLogEvents = js.Array[FilteredLogEvent]
  type InputLogEvents = js.Array[InputLogEvent]
  type InputLogStreamNames = js.Array[LogStreamName]
  type Interleaved = Boolean
  type LogEventIndex = Integer
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
  type RoleArn = String
  type SearchedLogStreams = js.Array[SearchedLogStream]
  type SequenceToken = String
  type StartFromHead = Boolean
  type StoredBytes = Long
  type SubscriptionFilters = js.Array[SubscriptionFilter]
  type TagKey = String
  type TagList = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Dictionary[TagValue]
  type TargetArn = String
  type TestEventMessages = js.Array[EventMessage]
  type Timestamp = Long
  type Token = String
  type Value = String
}

package logs {
  @js.native
  trait Logs extends js.Object {
    def cancelExportTask(params: CancelExportTaskRequest, callback: Callback[js.Object]): Unit = js.native
    def cancelExportTask(params: CancelExportTaskRequest): Request[js.Object] = js.native
    def createExportTask(params: CreateExportTaskRequest, callback: Callback[CreateExportTaskResponse]): Unit = js.native
    def createExportTask(params: CreateExportTaskRequest): Request[CreateExportTaskResponse] = js.native
    def createLogGroup(params: CreateLogGroupRequest, callback: Callback[js.Object]): Unit = js.native
    def createLogGroup(params: CreateLogGroupRequest): Request[js.Object] = js.native
    def createLogStream(params: CreateLogStreamRequest, callback: Callback[js.Object]): Unit = js.native
    def createLogStream(params: CreateLogStreamRequest): Request[js.Object] = js.native
    def deleteDestination(params: DeleteDestinationRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteDestination(params: DeleteDestinationRequest): Request[js.Object] = js.native
    def deleteLogGroup(params: DeleteLogGroupRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteLogGroup(params: DeleteLogGroupRequest): Request[js.Object] = js.native
    def deleteLogStream(params: DeleteLogStreamRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteLogStream(params: DeleteLogStreamRequest): Request[js.Object] = js.native
    def deleteMetricFilter(params: DeleteMetricFilterRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteMetricFilter(params: DeleteMetricFilterRequest): Request[js.Object] = js.native
    def deleteRetentionPolicy(params: DeleteRetentionPolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteRetentionPolicy(params: DeleteRetentionPolicyRequest): Request[js.Object] = js.native
    def deleteSubscriptionFilter(params: DeleteSubscriptionFilterRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteSubscriptionFilter(params: DeleteSubscriptionFilterRequest): Request[js.Object] = js.native
    def describeDestinations(params: DescribeDestinationsRequest, callback: Callback[DescribeDestinationsResponse]): Unit = js.native
    def describeDestinations(params: DescribeDestinationsRequest): Request[DescribeDestinationsResponse] = js.native
    def describeExportTasks(params: DescribeExportTasksRequest, callback: Callback[DescribeExportTasksResponse]): Unit = js.native
    def describeExportTasks(params: DescribeExportTasksRequest): Request[DescribeExportTasksResponse] = js.native
    def describeLogGroups(params: DescribeLogGroupsRequest, callback: Callback[DescribeLogGroupsResponse]): Unit = js.native
    def describeLogGroups(params: DescribeLogGroupsRequest): Request[DescribeLogGroupsResponse] = js.native
    def describeLogStreams(params: DescribeLogStreamsRequest, callback: Callback[DescribeLogStreamsResponse]): Unit = js.native
    def describeLogStreams(params: DescribeLogStreamsRequest): Request[DescribeLogStreamsResponse] = js.native
    def describeMetricFilters(params: DescribeMetricFiltersRequest, callback: Callback[DescribeMetricFiltersResponse]): Unit = js.native
    def describeMetricFilters(params: DescribeMetricFiltersRequest): Request[DescribeMetricFiltersResponse] = js.native
    def describeSubscriptionFilters(params: DescribeSubscriptionFiltersRequest, callback: Callback[DescribeSubscriptionFiltersResponse]): Unit = js.native
    def describeSubscriptionFilters(params: DescribeSubscriptionFiltersRequest): Request[DescribeSubscriptionFiltersResponse] = js.native
    def filterLogEvents(params: FilterLogEventsRequest, callback: Callback[FilterLogEventsResponse]): Unit = js.native
    def filterLogEvents(params: FilterLogEventsRequest): Request[FilterLogEventsResponse] = js.native
    def getLogEvents(params: GetLogEventsRequest, callback: Callback[GetLogEventsResponse]): Unit = js.native
    def getLogEvents(params: GetLogEventsRequest): Request[GetLogEventsResponse] = js.native
    def listTagsLogGroup(params: ListTagsLogGroupRequest, callback: Callback[ListTagsLogGroupResponse]): Unit = js.native
    def listTagsLogGroup(params: ListTagsLogGroupRequest): Request[ListTagsLogGroupResponse] = js.native
    def putDestination(params: PutDestinationRequest, callback: Callback[PutDestinationResponse]): Unit = js.native
    def putDestination(params: PutDestinationRequest): Request[PutDestinationResponse] = js.native
    def putDestinationPolicy(params: PutDestinationPolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def putDestinationPolicy(params: PutDestinationPolicyRequest): Request[js.Object] = js.native
    def putLogEvents(params: PutLogEventsRequest, callback: Callback[PutLogEventsResponse]): Unit = js.native
    def putLogEvents(params: PutLogEventsRequest): Request[PutLogEventsResponse] = js.native
    def putMetricFilter(params: PutMetricFilterRequest, callback: Callback[js.Object]): Unit = js.native
    def putMetricFilter(params: PutMetricFilterRequest): Request[js.Object] = js.native
    def putRetentionPolicy(params: PutRetentionPolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def putRetentionPolicy(params: PutRetentionPolicyRequest): Request[js.Object] = js.native
    def putSubscriptionFilter(params: PutSubscriptionFilterRequest, callback: Callback[js.Object]): Unit = js.native
    def putSubscriptionFilter(params: PutSubscriptionFilterRequest): Request[js.Object] = js.native
    def tagLogGroup(params: TagLogGroupRequest, callback: Callback[js.Object]): Unit = js.native
    def tagLogGroup(params: TagLogGroupRequest): Request[js.Object] = js.native
    def testMetricFilter(params: TestMetricFilterRequest, callback: Callback[TestMetricFilterResponse]): Unit = js.native
    def testMetricFilter(params: TestMetricFilterRequest): Request[TestMetricFilterResponse] = js.native
    def untagLogGroup(params: UntagLogGroupRequest, callback: Callback[js.Object]): Unit = js.native
    def untagLogGroup(params: UntagLogGroupRequest): Request[js.Object] = js.native
  }

  @js.native
  trait CancelExportTaskRequest extends js.Object {
    var taskId: ExportTaskId
  }

  object CancelExportTaskRequest {
    def apply(
      taskId: js.UndefOr[ExportTaskId] = js.undefined
    ): CancelExportTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskId" -> taskId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelExportTaskRequest]
    }
  }

  @js.native
  trait CreateExportTaskRequest extends js.Object {
    var logStreamNamePrefix: LogStreamName
    var destinationPrefix: ExportDestinationPrefix
    var to: Timestamp
    var logGroupName: LogGroupName
    var from: Timestamp
    var taskName: ExportTaskName
    var destination: ExportDestinationBucket
  }

  object CreateExportTaskRequest {
    def apply(
      logStreamNamePrefix: js.UndefOr[LogStreamName] = js.undefined,
      destinationPrefix: js.UndefOr[ExportDestinationPrefix] = js.undefined,
      to: js.UndefOr[Timestamp] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      from: js.UndefOr[Timestamp] = js.undefined,
      taskName: js.UndefOr[ExportTaskName] = js.undefined,
      destination: js.UndefOr[ExportDestinationBucket] = js.undefined
    ): CreateExportTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logStreamNamePrefix" -> logStreamNamePrefix.map { x => x: js.Any }),
        ("destinationPrefix" -> destinationPrefix.map { x => x: js.Any }),
        ("to" -> to.map { x => x: js.Any }),
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("from" -> from.map { x => x: js.Any }),
        ("taskName" -> taskName.map { x => x: js.Any }),
        ("destination" -> destination.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateExportTaskRequest]
    }
  }

  @js.native
  trait CreateExportTaskResponse extends js.Object {
    var taskId: ExportTaskId
  }

  object CreateExportTaskResponse {
    def apply(
      taskId: js.UndefOr[ExportTaskId] = js.undefined
    ): CreateExportTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskId" -> taskId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateExportTaskResponse]
    }
  }

  @js.native
  trait CreateLogGroupRequest extends js.Object {
    var logGroupName: LogGroupName
    var tags: Tags
  }

  object CreateLogGroupRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined
    ): CreateLogGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("tags" -> tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      logStreamName: js.UndefOr[LogStreamName] = js.undefined
    ): CreateLogStreamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("logStreamName" -> logStreamName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLogStreamRequest]
    }
  }

  /**
   * <p>The event was already logged.</p>
   */
  @js.native
  trait DataAlreadyAcceptedExceptionException extends js.Object {
    var expectedSequenceToken: SequenceToken
  }

  @js.native
  trait DeleteDestinationRequest extends js.Object {
    var destinationName: DestinationName
  }

  object DeleteDestinationRequest {
    def apply(
      destinationName: js.UndefOr[DestinationName] = js.undefined
    ): DeleteDestinationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("destinationName" -> destinationName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDestinationRequest]
    }
  }

  @js.native
  trait DeleteLogGroupRequest extends js.Object {
    var logGroupName: LogGroupName
  }

  object DeleteLogGroupRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined
    ): DeleteLogGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logGroupName" -> logGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      logStreamName: js.UndefOr[LogStreamName] = js.undefined
    ): DeleteLogStreamRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("logStreamName" -> logStreamName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLogStreamRequest]
    }
  }

  @js.native
  trait DeleteMetricFilterRequest extends js.Object {
    var logGroupName: LogGroupName
    var filterName: FilterName
  }

  object DeleteMetricFilterRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      filterName: js.UndefOr[FilterName] = js.undefined
    ): DeleteMetricFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("filterName" -> filterName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMetricFilterRequest]
    }
  }

  @js.native
  trait DeleteRetentionPolicyRequest extends js.Object {
    var logGroupName: LogGroupName
  }

  object DeleteRetentionPolicyRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined
    ): DeleteRetentionPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logGroupName" -> logGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRetentionPolicyRequest]
    }
  }

  @js.native
  trait DeleteSubscriptionFilterRequest extends js.Object {
    var logGroupName: LogGroupName
    var filterName: FilterName
  }

  object DeleteSubscriptionFilterRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      filterName: js.UndefOr[FilterName] = js.undefined
    ): DeleteSubscriptionFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("filterName" -> filterName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSubscriptionFilterRequest]
    }
  }

  @js.native
  trait DescribeDestinationsRequest extends js.Object {
    var DestinationNamePrefix: DestinationName
    var nextToken: NextToken
    var limit: DescribeLimit
  }

  object DescribeDestinationsRequest {
    def apply(
      DestinationNamePrefix: js.UndefOr[DestinationName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      limit: js.UndefOr[DescribeLimit] = js.undefined
    ): DescribeDestinationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DestinationNamePrefix" -> DestinationNamePrefix.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("limit" -> limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDestinationsRequest]
    }
  }

  @js.native
  trait DescribeDestinationsResponse extends js.Object {
    var destinations: Destinations
    var nextToken: NextToken
  }

  object DescribeDestinationsResponse {
    def apply(
      destinations: js.UndefOr[Destinations] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeDestinationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("destinations" -> destinations.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDestinationsResponse]
    }
  }

  @js.native
  trait DescribeExportTasksRequest extends js.Object {
    var taskId: ExportTaskId
    var statusCode: ExportTaskStatusCode
    var nextToken: NextToken
    var limit: DescribeLimit
  }

  object DescribeExportTasksRequest {
    def apply(
      taskId: js.UndefOr[ExportTaskId] = js.undefined,
      statusCode: js.UndefOr[ExportTaskStatusCode] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      limit: js.UndefOr[DescribeLimit] = js.undefined
    ): DescribeExportTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("taskId" -> taskId.map { x => x: js.Any }),
        ("statusCode" -> statusCode.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("limit" -> limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExportTasksRequest]
    }
  }

  @js.native
  trait DescribeExportTasksResponse extends js.Object {
    var exportTasks: ExportTasks
    var nextToken: NextToken
  }

  object DescribeExportTasksResponse {
    def apply(
      exportTasks: js.UndefOr[ExportTasks] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeExportTasksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("exportTasks" -> exportTasks.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExportTasksResponse]
    }
  }

  @js.native
  trait DescribeLogGroupsRequest extends js.Object {
    var logGroupNamePrefix: LogGroupName
    var nextToken: NextToken
    var limit: DescribeLimit
  }

  object DescribeLogGroupsRequest {
    def apply(
      logGroupNamePrefix: js.UndefOr[LogGroupName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      limit: js.UndefOr[DescribeLimit] = js.undefined
    ): DescribeLogGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logGroupNamePrefix" -> logGroupNamePrefix.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("limit" -> limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLogGroupsRequest]
    }
  }

  @js.native
  trait DescribeLogGroupsResponse extends js.Object {
    var logGroups: LogGroups
    var nextToken: NextToken
  }

  object DescribeLogGroupsResponse {
    def apply(
      logGroups: js.UndefOr[LogGroups] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeLogGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logGroups" -> logGroups.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLogGroupsResponse]
    }
  }

  @js.native
  trait DescribeLogStreamsRequest extends js.Object {
    var nextToken: NextToken
    var logStreamNamePrefix: LogStreamName
    var descending: Descending
    var logGroupName: LogGroupName
    var orderBy: OrderBy
    var limit: DescribeLimit
  }

  object DescribeLogStreamsRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      logStreamNamePrefix: js.UndefOr[LogStreamName] = js.undefined,
      descending: js.UndefOr[Descending] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      orderBy: js.UndefOr[OrderBy] = js.undefined,
      limit: js.UndefOr[DescribeLimit] = js.undefined
    ): DescribeLogStreamsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("logStreamNamePrefix" -> logStreamNamePrefix.map { x => x: js.Any }),
        ("descending" -> descending.map { x => x: js.Any }),
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("orderBy" -> orderBy.map { x => x: js.Any }),
        ("limit" -> limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLogStreamsRequest]
    }
  }

  @js.native
  trait DescribeLogStreamsResponse extends js.Object {
    var logStreams: LogStreams
    var nextToken: NextToken
  }

  object DescribeLogStreamsResponse {
    def apply(
      logStreams: js.UndefOr[LogStreams] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeLogStreamsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logStreams" -> logStreams.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLogStreamsResponse]
    }
  }

  @js.native
  trait DescribeMetricFiltersRequest extends js.Object {
    var metricName: MetricName
    var nextToken: NextToken
    var logGroupName: LogGroupName
    var metricNamespace: MetricNamespace
    var filterNamePrefix: FilterName
    var limit: DescribeLimit
  }

  object DescribeMetricFiltersRequest {
    def apply(
      metricName: js.UndefOr[MetricName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      metricNamespace: js.UndefOr[MetricNamespace] = js.undefined,
      filterNamePrefix: js.UndefOr[FilterName] = js.undefined,
      limit: js.UndefOr[DescribeLimit] = js.undefined
    ): DescribeMetricFiltersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("metricName" -> metricName.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("metricNamespace" -> metricNamespace.map { x => x: js.Any }),
        ("filterNamePrefix" -> filterNamePrefix.map { x => x: js.Any }),
        ("limit" -> limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMetricFiltersRequest]
    }
  }

  @js.native
  trait DescribeMetricFiltersResponse extends js.Object {
    var metricFilters: MetricFilters
    var nextToken: NextToken
  }

  object DescribeMetricFiltersResponse {
    def apply(
      metricFilters: js.UndefOr[MetricFilters] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeMetricFiltersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("metricFilters" -> metricFilters.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMetricFiltersResponse]
    }
  }

  @js.native
  trait DescribeSubscriptionFiltersRequest extends js.Object {
    var logGroupName: LogGroupName
    var filterNamePrefix: FilterName
    var nextToken: NextToken
    var limit: DescribeLimit
  }

  object DescribeSubscriptionFiltersRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      filterNamePrefix: js.UndefOr[FilterName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      limit: js.UndefOr[DescribeLimit] = js.undefined
    ): DescribeSubscriptionFiltersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("filterNamePrefix" -> filterNamePrefix.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("limit" -> limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubscriptionFiltersRequest]
    }
  }

  @js.native
  trait DescribeSubscriptionFiltersResponse extends js.Object {
    var subscriptionFilters: SubscriptionFilters
    var nextToken: NextToken
  }

  object DescribeSubscriptionFiltersResponse {
    def apply(
      subscriptionFilters: js.UndefOr[SubscriptionFilters] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeSubscriptionFiltersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("subscriptionFilters" -> subscriptionFilters.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubscriptionFiltersResponse]
    }
  }

  /**
   * <p>Represents a cross-account destination that receives subscription log events.</p>
   */
  @js.native
  trait Destination extends js.Object {
    var arn: Arn
    var targetArn: TargetArn
    var destinationName: DestinationName
    var roleArn: RoleArn
    var accessPolicy: AccessPolicy
    var creationTime: Timestamp
  }

  object Destination {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      targetArn: js.UndefOr[TargetArn] = js.undefined,
      destinationName: js.UndefOr[DestinationName] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      accessPolicy: js.UndefOr[AccessPolicy] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined
    ): Destination = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("arn" -> arn.map { x => x: js.Any }),
        ("targetArn" -> targetArn.map { x => x: js.Any }),
        ("destinationName" -> destinationName.map { x => x: js.Any }),
        ("roleArn" -> roleArn.map { x => x: js.Any }),
        ("accessPolicy" -> accessPolicy.map { x => x: js.Any }),
        ("creationTime" -> creationTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Destination]
    }
  }


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
    var destinationPrefix: ExportDestinationPrefix
    var to: Timestamp
    var status: ExportTaskStatus
    var logGroupName: LogGroupName
    var from: Timestamp
    var taskName: ExportTaskName
    var executionInfo: ExportTaskExecutionInfo
    var destination: ExportDestinationBucket
    var taskId: ExportTaskId
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
      taskId: js.UndefOr[ExportTaskId] = js.undefined
    ): ExportTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("destinationPrefix" -> destinationPrefix.map { x => x: js.Any }),
        ("to" -> to.map { x => x: js.Any }),
        ("status" -> status.map { x => x: js.Any }),
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("from" -> from.map { x => x: js.Any }),
        ("taskName" -> taskName.map { x => x: js.Any }),
        ("executionInfo" -> executionInfo.map { x => x: js.Any }),
        ("destination" -> destination.map { x => x: js.Any }),
        ("taskId" -> taskId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportTask]
    }
  }

  /**
   * <p>Represents the status of an export task.</p>
   */
  @js.native
  trait ExportTaskExecutionInfo extends js.Object {
    var creationTime: Timestamp
    var completionTime: Timestamp
  }

  object ExportTaskExecutionInfo {
    def apply(
      creationTime: js.UndefOr[Timestamp] = js.undefined,
      completionTime: js.UndefOr[Timestamp] = js.undefined
    ): ExportTaskExecutionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("creationTime" -> creationTime.map { x => x: js.Any }),
        ("completionTime" -> completionTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportTaskExecutionInfo]
    }
  }

  /**
   * <p>Represents the status of an export task.</p>
   */
  @js.native
  trait ExportTaskStatus extends js.Object {
    var code: ExportTaskStatusCode
    var message: ExportTaskStatusMessage
  }

  object ExportTaskStatus {
    def apply(
      code: js.UndefOr[ExportTaskStatusCode] = js.undefined,
      message: js.UndefOr[ExportTaskStatusMessage] = js.undefined
    ): ExportTaskStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("code" -> code.map { x => x: js.Any }),
        ("message" -> message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportTaskStatus]
    }
  }


  object ExportTaskStatusCodeEnum {
    val CANCELLED = "CANCELLED"
    val COMPLETED = "COMPLETED"
    val FAILED = "FAILED"
    val PENDING = "PENDING"
    val `PENDING_CANCEL` = "PENDING_CANCEL"
    val RUNNING = "RUNNING"

    val values = IndexedSeq(CANCELLED, COMPLETED, FAILED, PENDING, `PENDING_CANCEL`, RUNNING)
  }

  @js.native
  trait FilterLogEventsRequest extends js.Object {
    var filterPattern: FilterPattern
    var startTime: Timestamp
    var logStreamNames: InputLogStreamNames
    var interleaved: Interleaved
    var nextToken: NextToken
    var endTime: Timestamp
    var logGroupName: LogGroupName
    var limit: EventsLimit
  }

  object FilterLogEventsRequest {
    def apply(
      filterPattern: js.UndefOr[FilterPattern] = js.undefined,
      startTime: js.UndefOr[Timestamp] = js.undefined,
      logStreamNames: js.UndefOr[InputLogStreamNames] = js.undefined,
      interleaved: js.UndefOr[Interleaved] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      endTime: js.UndefOr[Timestamp] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      limit: js.UndefOr[EventsLimit] = js.undefined
    ): FilterLogEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("filterPattern" -> filterPattern.map { x => x: js.Any }),
        ("startTime" -> startTime.map { x => x: js.Any }),
        ("logStreamNames" -> logStreamNames.map { x => x: js.Any }),
        ("interleaved" -> interleaved.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("endTime" -> endTime.map { x => x: js.Any }),
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("limit" -> limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FilterLogEventsRequest]
    }
  }

  @js.native
  trait FilterLogEventsResponse extends js.Object {
    var events: FilteredLogEvents
    var searchedLogStreams: SearchedLogStreams
    var nextToken: NextToken
  }

  object FilterLogEventsResponse {
    def apply(
      events: js.UndefOr[FilteredLogEvents] = js.undefined,
      searchedLogStreams: js.UndefOr[SearchedLogStreams] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): FilterLogEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("events" -> events.map { x => x: js.Any }),
        ("searchedLogStreams" -> searchedLogStreams.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FilterLogEventsResponse]
    }
  }

  /**
   * <p>Represents a matched event.</p>
   */
  @js.native
  trait FilteredLogEvent extends js.Object {
    var timestamp: Timestamp
    var ingestionTime: Timestamp
    var eventId: EventId
    var logStreamName: LogStreamName
    var message: EventMessage
  }

  object FilteredLogEvent {
    def apply(
      timestamp: js.UndefOr[Timestamp] = js.undefined,
      ingestionTime: js.UndefOr[Timestamp] = js.undefined,
      eventId: js.UndefOr[EventId] = js.undefined,
      logStreamName: js.UndefOr[LogStreamName] = js.undefined,
      message: js.UndefOr[EventMessage] = js.undefined
    ): FilteredLogEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("timestamp" -> timestamp.map { x => x: js.Any }),
        ("ingestionTime" -> ingestionTime.map { x => x: js.Any }),
        ("eventId" -> eventId.map { x => x: js.Any }),
        ("logStreamName" -> logStreamName.map { x => x: js.Any }),
        ("message" -> message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FilteredLogEvent]
    }
  }

  @js.native
  trait GetLogEventsRequest extends js.Object {
    var startTime: Timestamp
    var startFromHead: StartFromHead
    var nextToken: NextToken
    var endTime: Timestamp
    var logStreamName: LogStreamName
    var logGroupName: LogGroupName
    var limit: EventsLimit
  }

  object GetLogEventsRequest {
    def apply(
      startTime: js.UndefOr[Timestamp] = js.undefined,
      startFromHead: js.UndefOr[StartFromHead] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      endTime: js.UndefOr[Timestamp] = js.undefined,
      logStreamName: js.UndefOr[LogStreamName] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      limit: js.UndefOr[EventsLimit] = js.undefined
    ): GetLogEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("startTime" -> startTime.map { x => x: js.Any }),
        ("startFromHead" -> startFromHead.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("endTime" -> endTime.map { x => x: js.Any }),
        ("logStreamName" -> logStreamName.map { x => x: js.Any }),
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("limit" -> limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLogEventsRequest]
    }
  }

  @js.native
  trait GetLogEventsResponse extends js.Object {
    var events: OutputLogEvents
    var nextForwardToken: NextToken
    var nextBackwardToken: NextToken
  }

  object GetLogEventsResponse {
    def apply(
      events: js.UndefOr[OutputLogEvents] = js.undefined,
      nextForwardToken: js.UndefOr[NextToken] = js.undefined,
      nextBackwardToken: js.UndefOr[NextToken] = js.undefined
    ): GetLogEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("events" -> events.map { x => x: js.Any }),
        ("nextForwardToken" -> nextForwardToken.map { x => x: js.Any }),
        ("nextBackwardToken" -> nextBackwardToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLogEventsResponse]
    }
  }

  /**
   * <p>Represents a log event, which is a record of activity that was recorded by the application or resource being monitored.</p>
   */
  @js.native
  trait InputLogEvent extends js.Object {
    var timestamp: Timestamp
    var message: EventMessage
  }

  object InputLogEvent {
    def apply(
      timestamp: js.UndefOr[Timestamp] = js.undefined,
      message: js.UndefOr[EventMessage] = js.undefined
    ): InputLogEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("timestamp" -> timestamp.map { x => x: js.Any }),
        ("message" -> message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InputLogEvent]
    }
  }

  /**
   * <p>The operation is not valid on the specified resource.</p>
   */
  @js.native
  trait InvalidOperationExceptionException extends js.Object {

  }

  /**
   * <p>A parameter is specified incorrectly.</p>
   */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {

  }

  /**
   * <p>The sequence token is not valid.</p>
   */
  @js.native
  trait InvalidSequenceTokenExceptionException extends js.Object {
    var expectedSequenceToken: SequenceToken
  }

  /**
   * <p>You have reached the maximum number of resources that can be created.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {

  }

  @js.native
  trait ListTagsLogGroupRequest extends js.Object {
    var logGroupName: LogGroupName
  }

  object ListTagsLogGroupRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined
    ): ListTagsLogGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logGroupName" -> logGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsLogGroupRequest]
    }
  }

  @js.native
  trait ListTagsLogGroupResponse extends js.Object {
    var tags: Tags
  }

  object ListTagsLogGroupResponse {
    def apply(
      tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsLogGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("tags" -> tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsLogGroupResponse]
    }
  }

  /**
   * <p>Represents a log group.</p>
   */
  @js.native
  trait LogGroup extends js.Object {
    var storedBytes: StoredBytes
    var arn: Arn
    var metricFilterCount: FilterCount
    var retentionInDays: Days
    var logGroupName: LogGroupName
    var creationTime: Timestamp
  }

  object LogGroup {
    def apply(
      storedBytes: js.UndefOr[StoredBytes] = js.undefined,
      arn: js.UndefOr[Arn] = js.undefined,
      metricFilterCount: js.UndefOr[FilterCount] = js.undefined,
      retentionInDays: js.UndefOr[Days] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined
    ): LogGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("storedBytes" -> storedBytes.map { x => x: js.Any }),
        ("arn" -> arn.map { x => x: js.Any }),
        ("metricFilterCount" -> metricFilterCount.map { x => x: js.Any }),
        ("retentionInDays" -> retentionInDays.map { x => x: js.Any }),
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("creationTime" -> creationTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogGroup]
    }
  }

  /**
   * <p>Represents a log stream, which is a sequence of log events from a single emitter of logs.</p>
   */
  @js.native
  trait LogStream extends js.Object {
    var storedBytes: StoredBytes
    var arn: Arn
    var firstEventTimestamp: Timestamp
    var lastEventTimestamp: Timestamp
    var uploadSequenceToken: SequenceToken
    var logStreamName: LogStreamName
    var lastIngestionTime: Timestamp
    var creationTime: Timestamp
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
      creationTime: js.UndefOr[Timestamp] = js.undefined
    ): LogStream = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("storedBytes" -> storedBytes.map { x => x: js.Any }),
        ("arn" -> arn.map { x => x: js.Any }),
        ("firstEventTimestamp" -> firstEventTimestamp.map { x => x: js.Any }),
        ("lastEventTimestamp" -> lastEventTimestamp.map { x => x: js.Any }),
        ("uploadSequenceToken" -> uploadSequenceToken.map { x => x: js.Any }),
        ("logStreamName" -> logStreamName.map { x => x: js.Any }),
        ("lastIngestionTime" -> lastIngestionTime.map { x => x: js.Any }),
        ("creationTime" -> creationTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogStream]
    }
  }

  /**
   * <p>Metric filters express how CloudWatch Logs would extract metric observations from ingested log events and transform them into metric data in a CloudWatch metric.</p>
   */
  @js.native
  trait MetricFilter extends js.Object {
    var filterPattern: FilterPattern
    var filterName: FilterName
    var metricTransformations: MetricTransformations
    var logGroupName: LogGroupName
    var creationTime: Timestamp
  }

  object MetricFilter {
    def apply(
      filterPattern: js.UndefOr[FilterPattern] = js.undefined,
      filterName: js.UndefOr[FilterName] = js.undefined,
      metricTransformations: js.UndefOr[MetricTransformations] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined
    ): MetricFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("filterPattern" -> filterPattern.map { x => x: js.Any }),
        ("filterName" -> filterName.map { x => x: js.Any }),
        ("metricTransformations" -> metricTransformations.map { x => x: js.Any }),
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("creationTime" -> creationTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricFilter]
    }
  }

  /**
   * <p>Represents a matched event.</p>
   */
  @js.native
  trait MetricFilterMatchRecord extends js.Object {
    var eventNumber: EventNumber
    var eventMessage: EventMessage
    var extractedValues: ExtractedValues
  }

  object MetricFilterMatchRecord {
    def apply(
      eventNumber: js.UndefOr[EventNumber] = js.undefined,
      eventMessage: js.UndefOr[EventMessage] = js.undefined,
      extractedValues: js.UndefOr[ExtractedValues] = js.undefined
    ): MetricFilterMatchRecord = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("eventNumber" -> eventNumber.map { x => x: js.Any }),
        ("eventMessage" -> eventMessage.map { x => x: js.Any }),
        ("extractedValues" -> extractedValues.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricFilterMatchRecord]
    }
  }

  /**
   * <p>Indicates how to transform ingested log events into metric data in a CloudWatch metric.</p>
   */
  @js.native
  trait MetricTransformation extends js.Object {
    var metricName: MetricName
    var metricNamespace: MetricNamespace
    var metricValue: MetricValue
    var defaultValue: DefaultValue
  }

  object MetricTransformation {
    def apply(
      metricName: js.UndefOr[MetricName] = js.undefined,
      metricNamespace: js.UndefOr[MetricNamespace] = js.undefined,
      metricValue: js.UndefOr[MetricValue] = js.undefined,
      defaultValue: js.UndefOr[DefaultValue] = js.undefined
    ): MetricTransformation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("metricName" -> metricName.map { x => x: js.Any }),
        ("metricNamespace" -> metricNamespace.map { x => x: js.Any }),
        ("metricValue" -> metricValue.map { x => x: js.Any }),
        ("defaultValue" -> defaultValue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricTransformation]
    }
  }

  /**
   * <p>Multiple requests to update the same resource were in conflict.</p>
   */
  @js.native
  trait OperationAbortedExceptionException extends js.Object {

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
    var timestamp: Timestamp
    var message: EventMessage
    var ingestionTime: Timestamp
  }

  object OutputLogEvent {
    def apply(
      timestamp: js.UndefOr[Timestamp] = js.undefined,
      message: js.UndefOr[EventMessage] = js.undefined,
      ingestionTime: js.UndefOr[Timestamp] = js.undefined
    ): OutputLogEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("timestamp" -> timestamp.map { x => x: js.Any }),
        ("message" -> message.map { x => x: js.Any }),
        ("ingestionTime" -> ingestionTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OutputLogEvent]
    }
  }

  @js.native
  trait PutDestinationPolicyRequest extends js.Object {
    var destinationName: DestinationName
    var accessPolicy: AccessPolicy
  }

  object PutDestinationPolicyRequest {
    def apply(
      destinationName: js.UndefOr[DestinationName] = js.undefined,
      accessPolicy: js.UndefOr[AccessPolicy] = js.undefined
    ): PutDestinationPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("destinationName" -> destinationName.map { x => x: js.Any }),
        ("accessPolicy" -> accessPolicy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDestinationPolicyRequest]
    }
  }

  @js.native
  trait PutDestinationRequest extends js.Object {
    var destinationName: DestinationName
    var targetArn: TargetArn
    var roleArn: RoleArn
  }

  object PutDestinationRequest {
    def apply(
      destinationName: js.UndefOr[DestinationName] = js.undefined,
      targetArn: js.UndefOr[TargetArn] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined
    ): PutDestinationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("destinationName" -> destinationName.map { x => x: js.Any }),
        ("targetArn" -> targetArn.map { x => x: js.Any }),
        ("roleArn" -> roleArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDestinationRequest]
    }
  }

  @js.native
  trait PutDestinationResponse extends js.Object {
    var destination: Destination
  }

  object PutDestinationResponse {
    def apply(
      destination: js.UndefOr[Destination] = js.undefined
    ): PutDestinationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("destination" -> destination.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDestinationResponse]
    }
  }

  @js.native
  trait PutLogEventsRequest extends js.Object {
    var logGroupName: LogGroupName
    var logStreamName: LogStreamName
    var logEvents: InputLogEvents
    var sequenceToken: SequenceToken
  }

  object PutLogEventsRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      logStreamName: js.UndefOr[LogStreamName] = js.undefined,
      logEvents: js.UndefOr[InputLogEvents] = js.undefined,
      sequenceToken: js.UndefOr[SequenceToken] = js.undefined
    ): PutLogEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("logStreamName" -> logStreamName.map { x => x: js.Any }),
        ("logEvents" -> logEvents.map { x => x: js.Any }),
        ("sequenceToken" -> sequenceToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutLogEventsRequest]
    }
  }

  @js.native
  trait PutLogEventsResponse extends js.Object {
    var nextSequenceToken: SequenceToken
    var rejectedLogEventsInfo: RejectedLogEventsInfo
  }

  object PutLogEventsResponse {
    def apply(
      nextSequenceToken: js.UndefOr[SequenceToken] = js.undefined,
      rejectedLogEventsInfo: js.UndefOr[RejectedLogEventsInfo] = js.undefined
    ): PutLogEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("nextSequenceToken" -> nextSequenceToken.map { x => x: js.Any }),
        ("rejectedLogEventsInfo" -> rejectedLogEventsInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutLogEventsResponse]
    }
  }

  @js.native
  trait PutMetricFilterRequest extends js.Object {
    var logGroupName: LogGroupName
    var filterName: FilterName
    var filterPattern: FilterPattern
    var metricTransformations: MetricTransformations
  }

  object PutMetricFilterRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      filterName: js.UndefOr[FilterName] = js.undefined,
      filterPattern: js.UndefOr[FilterPattern] = js.undefined,
      metricTransformations: js.UndefOr[MetricTransformations] = js.undefined
    ): PutMetricFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("filterName" -> filterName.map { x => x: js.Any }),
        ("filterPattern" -> filterPattern.map { x => x: js.Any }),
        ("metricTransformations" -> metricTransformations.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutMetricFilterRequest]
    }
  }

  @js.native
  trait PutRetentionPolicyRequest extends js.Object {
    var logGroupName: LogGroupName
    var retentionInDays: Days
  }

  object PutRetentionPolicyRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      retentionInDays: js.UndefOr[Days] = js.undefined
    ): PutRetentionPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("retentionInDays" -> retentionInDays.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRetentionPolicyRequest]
    }
  }

  @js.native
  trait PutSubscriptionFilterRequest extends js.Object {
    var filterPattern: FilterPattern
    var distribution: Distribution
    var filterName: FilterName
    var roleArn: RoleArn
    var destinationArn: DestinationArn
    var logGroupName: LogGroupName
  }

  object PutSubscriptionFilterRequest {
    def apply(
      filterPattern: js.UndefOr[FilterPattern] = js.undefined,
      distribution: js.UndefOr[Distribution] = js.undefined,
      filterName: js.UndefOr[FilterName] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      destinationArn: js.UndefOr[DestinationArn] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined
    ): PutSubscriptionFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("filterPattern" -> filterPattern.map { x => x: js.Any }),
        ("distribution" -> distribution.map { x => x: js.Any }),
        ("filterName" -> filterName.map { x => x: js.Any }),
        ("roleArn" -> roleArn.map { x => x: js.Any }),
        ("destinationArn" -> destinationArn.map { x => x: js.Any }),
        ("logGroupName" -> logGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutSubscriptionFilterRequest]
    }
  }

  /**
   * <p>Represents the rejected events.</p>
   */
  @js.native
  trait RejectedLogEventsInfo extends js.Object {
    var tooNewLogEventStartIndex: LogEventIndex
    var tooOldLogEventEndIndex: LogEventIndex
    var expiredLogEventEndIndex: LogEventIndex
  }

  object RejectedLogEventsInfo {
    def apply(
      tooNewLogEventStartIndex: js.UndefOr[LogEventIndex] = js.undefined,
      tooOldLogEventEndIndex: js.UndefOr[LogEventIndex] = js.undefined,
      expiredLogEventEndIndex: js.UndefOr[LogEventIndex] = js.undefined
    ): RejectedLogEventsInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("tooNewLogEventStartIndex" -> tooNewLogEventStartIndex.map { x => x: js.Any }),
        ("tooOldLogEventEndIndex" -> tooOldLogEventEndIndex.map { x => x: js.Any }),
        ("expiredLogEventEndIndex" -> expiredLogEventEndIndex.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectedLogEventsInfo]
    }
  }

  /**
   * <p>The specified resource already exists.</p>
   */
  @js.native
  trait ResourceAlreadyExistsExceptionException extends js.Object {

  }

  /**
   * <p>The specified resource does not exist.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {

  }

  /**
   * <p>Represents the search status of a log stream.</p>
   */
  @js.native
  trait SearchedLogStream extends js.Object {
    var logStreamName: LogStreamName
    var searchedCompletely: LogStreamSearchedCompletely
  }

  object SearchedLogStream {
    def apply(
      logStreamName: js.UndefOr[LogStreamName] = js.undefined,
      searchedCompletely: js.UndefOr[LogStreamSearchedCompletely] = js.undefined
    ): SearchedLogStream = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logStreamName" -> logStreamName.map { x => x: js.Any }),
        ("searchedCompletely" -> searchedCompletely.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchedLogStream]
    }
  }

  /**
   * <p>The service cannot complete the request.</p>
   */
  @js.native
  trait ServiceUnavailableExceptionException extends js.Object {

  }

  /**
   * <p>Represents a subscription filter.</p>
   */
  @js.native
  trait SubscriptionFilter extends js.Object {
    var filterPattern: FilterPattern
    var distribution: Distribution
    var filterName: FilterName
    var roleArn: RoleArn
    var destinationArn: DestinationArn
    var logGroupName: LogGroupName
    var creationTime: Timestamp
  }

  object SubscriptionFilter {
    def apply(
      filterPattern: js.UndefOr[FilterPattern] = js.undefined,
      distribution: js.UndefOr[Distribution] = js.undefined,
      filterName: js.UndefOr[FilterName] = js.undefined,
      roleArn: js.UndefOr[RoleArn] = js.undefined,
      destinationArn: js.UndefOr[DestinationArn] = js.undefined,
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined
    ): SubscriptionFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("filterPattern" -> filterPattern.map { x => x: js.Any }),
        ("distribution" -> distribution.map { x => x: js.Any }),
        ("filterName" -> filterName.map { x => x: js.Any }),
        ("roleArn" -> roleArn.map { x => x: js.Any }),
        ("destinationArn" -> destinationArn.map { x => x: js.Any }),
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("creationTime" -> creationTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined
    ): TagLogGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("tags" -> tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      filterPattern: js.UndefOr[FilterPattern] = js.undefined,
      logEventMessages: js.UndefOr[TestEventMessages] = js.undefined
    ): TestMetricFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("filterPattern" -> filterPattern.map { x => x: js.Any }),
        ("logEventMessages" -> logEventMessages.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestMetricFilterRequest]
    }
  }

  @js.native
  trait TestMetricFilterResponse extends js.Object {
    var matches: MetricFilterMatches
  }

  object TestMetricFilterResponse {
    def apply(
      matches: js.UndefOr[MetricFilterMatches] = js.undefined
    ): TestMetricFilterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("matches" -> matches.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      tags: js.UndefOr[TagList] = js.undefined
    ): UntagLogGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("tags" -> tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagLogGroupRequest]
    }
  }
}
