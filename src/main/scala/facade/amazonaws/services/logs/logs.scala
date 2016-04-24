package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object logs {
  type Arn = String
  type Days = Integer
  type Descending = Boolean
  type DescribeLimit = Integer
  type EventMessage = String
  type EventNumber = Long
  type EventsLimit = Integer
  type ExtractedValues = js.Dictionary[Value]
  type FilterCount = Integer
  type FilterName = String
  type FilterPattern = String
  type InputLogEvents = js.Array[InputLogEvent]
  type LogEventIndex = Integer
  type LogGroupName = String
  type LogGroups = js.Array[LogGroup]
  type LogStreamName = String
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
  type SequenceToken = String
  type StartFromHead = Boolean
  type StoredBytes = Long
  type TestEventMessages = js.Array[EventMessage]
  type Timestamp = Long
  type Token = String
  type Value = String
}

package logs {
  @js.native
  trait Logs extends js.Object {
    def createLogGroup(params: CreateLogGroupRequest, callback: Callback[js.Object]): Unit = js.native
    def createLogGroup(params: CreateLogGroupRequest): Request[js.Object] = js.native
    def createLogStream(params: CreateLogStreamRequest, callback: Callback[js.Object]): Unit = js.native
    def createLogStream(params: CreateLogStreamRequest): Request[js.Object] = js.native
    def deleteLogGroup(params: DeleteLogGroupRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteLogGroup(params: DeleteLogGroupRequest): Request[js.Object] = js.native
    def deleteLogStream(params: DeleteLogStreamRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteLogStream(params: DeleteLogStreamRequest): Request[js.Object] = js.native
    def deleteMetricFilter(params: DeleteMetricFilterRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteMetricFilter(params: DeleteMetricFilterRequest): Request[js.Object] = js.native
    def deleteRetentionPolicy(params: DeleteRetentionPolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteRetentionPolicy(params: DeleteRetentionPolicyRequest): Request[js.Object] = js.native
    def describeLogGroups(params: DescribeLogGroupsRequest, callback: Callback[DescribeLogGroupsResponse]): Unit = js.native
    def describeLogGroups(params: DescribeLogGroupsRequest): Request[DescribeLogGroupsResponse] = js.native
    def describeLogStreams(params: DescribeLogStreamsRequest, callback: Callback[DescribeLogStreamsResponse]): Unit = js.native
    def describeLogStreams(params: DescribeLogStreamsRequest): Request[DescribeLogStreamsResponse] = js.native
    def describeMetricFilters(params: DescribeMetricFiltersRequest, callback: Callback[DescribeMetricFiltersResponse]): Unit = js.native
    def describeMetricFilters(params: DescribeMetricFiltersRequest): Request[DescribeMetricFiltersResponse] = js.native
    def getLogEvents(params: GetLogEventsRequest, callback: Callback[GetLogEventsResponse]): Unit = js.native
    def getLogEvents(params: GetLogEventsRequest): Request[GetLogEventsResponse] = js.native
    def putLogEvents(params: PutLogEventsRequest, callback: Callback[PutLogEventsResponse]): Unit = js.native
    def putLogEvents(params: PutLogEventsRequest): Request[PutLogEventsResponse] = js.native
    def putMetricFilter(params: PutMetricFilterRequest, callback: Callback[js.Object]): Unit = js.native
    def putMetricFilter(params: PutMetricFilterRequest): Request[js.Object] = js.native
    def putRetentionPolicy(params: PutRetentionPolicyRequest, callback: Callback[js.Object]): Unit = js.native
    def putRetentionPolicy(params: PutRetentionPolicyRequest): Request[js.Object] = js.native
    def testMetricFilter(params: TestMetricFilterRequest, callback: Callback[TestMetricFilterResponse]): Unit = js.native
    def testMetricFilter(params: TestMetricFilterRequest): Request[TestMetricFilterResponse] = js.native
  }

  @js.native
  trait CreateLogGroupRequest extends js.Object {
    var logGroupName: LogGroupName
  }

  object CreateLogGroupRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined
    ): CreateLogGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logGroupName" -> logGroupName.map { x => x: js.Any })
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

  @js.native
  trait DataAlreadyAcceptedExceptionException extends js.Object {
    var expectedSequenceToken: SequenceToken
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
    var logGroupName: LogGroupName
    var filterNamePrefix: FilterName
    var nextToken: NextToken
    var limit: DescribeLimit
  }

  object DescribeMetricFiltersRequest {
    def apply(
      logGroupName: js.UndefOr[LogGroupName] = js.undefined,
      filterNamePrefix: js.UndefOr[FilterName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      limit: js.UndefOr[DescribeLimit] = js.undefined
    ): DescribeMetricFiltersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("logGroupName" -> logGroupName.map { x => x: js.Any }),
        ("filterNamePrefix" -> filterNamePrefix.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
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
   * A log event is a record of some activity that was recorded by the application or resource being monitored. The log event record that Amazon CloudWatch Logs understands contains two properties: the timestamp of when the event occurred, and the raw event message.
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
   * <p>Returned if a parameter of the request is incorrectly specified.</p>
   */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {

  }

  @js.native
  trait InvalidSequenceTokenExceptionException extends js.Object {
    var expectedSequenceToken: SequenceToken
  }

  /**
   * <p>Returned if you have reached the maximum number of resources that can be created.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {

  }

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
   * A log stream is sequence of log events that share the same emitter.
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
   * Metric filters can be used to express how Amazon CloudWatch Logs would extract metric observations from ingested log events and transform them to metric data in a CloudWatch metric.
   */
  @js.native
  trait MetricFilter extends js.Object {
    var filterName: FilterName
    var filterPattern: FilterPattern
    var metricTransformations: MetricTransformations
    var creationTime: Timestamp
  }

  object MetricFilter {
    def apply(
      filterName: js.UndefOr[FilterName] = js.undefined,
      filterPattern: js.UndefOr[FilterPattern] = js.undefined,
      metricTransformations: js.UndefOr[MetricTransformations] = js.undefined,
      creationTime: js.UndefOr[Timestamp] = js.undefined
    ): MetricFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("filterName" -> filterName.map { x => x: js.Any }),
        ("filterPattern" -> filterPattern.map { x => x: js.Any }),
        ("metricTransformations" -> metricTransformations.map { x => x: js.Any }),
        ("creationTime" -> creationTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricFilter]
    }
  }

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

  @js.native
  trait MetricTransformation extends js.Object {
    var metricName: MetricName
    var metricNamespace: MetricNamespace
    var metricValue: MetricValue
  }

  object MetricTransformation {
    def apply(
      metricName: js.UndefOr[MetricName] = js.undefined,
      metricNamespace: js.UndefOr[MetricNamespace] = js.undefined,
      metricValue: js.UndefOr[MetricValue] = js.undefined
    ): MetricTransformation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("metricName" -> metricName.map { x => x: js.Any }),
        ("metricNamespace" -> metricNamespace.map { x => x: js.Any }),
        ("metricValue" -> metricValue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricTransformation]
    }
  }

  /**
   * <p>Returned if multiple requests to update the same resource were in conflict.</p>
   */
  @js.native
  trait OperationAbortedExceptionException extends js.Object {

  }


  object OrderByEnum {
    val LogStreamName = "LogStreamName"
    val LastEventTime = "LastEventTime"

    val values = IndexedSeq(LogStreamName, LastEventTime)
  }

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
   * <p>Returned if the specified resource already exists.</p>
   */
  @js.native
  trait ResourceAlreadyExistsExceptionException extends js.Object {

  }

  /**
   * <p>Returned if the specified resource does not exist.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {

  }

  /**
   * <p>Returned if the service cannot complete the request.</p>
   */
  @js.native
  trait ServiceUnavailableExceptionException extends js.Object {

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
}
