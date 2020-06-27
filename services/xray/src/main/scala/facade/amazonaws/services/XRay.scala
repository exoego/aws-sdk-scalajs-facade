package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object xray {
  type AliasList                       = js.Array[Alias]
  type AliasNames                      = js.Array[String]
  type AnnotationKey                   = String
  type Annotations                     = js.Dictionary[ValuesWithServiceIds]
  type AttributeKey                    = String
  type AttributeMap                    = js.Dictionary[AttributeValue]
  type AttributeValue                  = String
  type BorrowCount                     = Int
  type ClientID                        = String
  type EC2InstanceId                   = String
  type EdgeList                        = js.Array[Edge]
  type EncryptionKeyId                 = String
  type EntitySelectorExpression        = String
  type ErrorRootCauseEntityPath        = js.Array[ErrorRootCauseEntity]
  type ErrorRootCauseServices          = js.Array[ErrorRootCauseService]
  type ErrorRootCauses                 = js.Array[ErrorRootCause]
  type FaultRootCauseEntityPath        = js.Array[FaultRootCauseEntity]
  type FaultRootCauseServices          = js.Array[FaultRootCauseService]
  type FaultRootCauses                 = js.Array[FaultRootCause]
  type FilterExpression                = String
  type FixedRate                       = Double
  type GetGroupsNextToken              = String
  type GroupARN                        = String
  type GroupName                       = String
  type GroupSummaryList                = js.Array[GroupSummary]
  type HTTPMethod                      = String
  type Histogram                       = js.Array[HistogramEntry]
  type Host                            = String
  type Hostname                        = String
  type NullableBoolean                 = Boolean
  type NullableDouble                  = Double
  type NullableInteger                 = Int
  type NullableLong                    = Double
  type Priority                        = Int
  type RequestCount                    = Int
  type ReservoirSize                   = Int
  type ResourceARN                     = String
  type ResponseTimeRootCauseEntityPath = js.Array[ResponseTimeRootCauseEntity]
  type ResponseTimeRootCauseServices   = js.Array[ResponseTimeRootCauseService]
  type ResponseTimeRootCauses          = js.Array[ResponseTimeRootCause]
  type RootCauseExceptions             = js.Array[RootCauseException]
  type RuleName                        = String
  type SampledCount                    = Int
  type SamplingRuleRecordList          = js.Array[SamplingRuleRecord]
  type SamplingStatisticSummaryList    = js.Array[SamplingStatisticSummary]
  type SamplingStatisticsDocumentList  = js.Array[SamplingStatisticsDocument]
  type SamplingTargetDocumentList      = js.Array[SamplingTargetDocument]
  type SegmentDocument                 = String
  type SegmentId                       = String
  type SegmentList                     = js.Array[Segment]
  type ServiceIds                      = js.Array[ServiceId]
  type ServiceList                     = js.Array[Service]
  type ServiceName                     = String
  type ServiceNames                    = js.Array[String]
  type ServiceType                     = String
  type TelemetryRecordList             = js.Array[TelemetryRecord]
  type TimeSeriesServiceStatisticsList = js.Array[TimeSeriesServiceStatistics]
  type Timestamp                       = js.Date
  type TraceAvailabilityZones          = js.Array[AvailabilityZoneDetail]
  type TraceId                         = String
  type TraceIdList                     = js.Array[TraceId]
  type TraceInstanceIds                = js.Array[InstanceIdDetail]
  type TraceList                       = js.Array[Trace]
  type TraceResourceARNs               = js.Array[ResourceARNDetail]
  type TraceSegmentDocument            = String
  type TraceSegmentDocumentList        = js.Array[TraceSegmentDocument]
  type TraceSummaryList                = js.Array[TraceSummary]
  type TraceUsers                      = js.Array[TraceUser]
  type URLPath                         = String
  type UnprocessedStatisticsList       = js.Array[UnprocessedStatistics]
  type UnprocessedTraceIdList          = js.Array[TraceId]
  type UnprocessedTraceSegmentList     = js.Array[UnprocessedTraceSegment]
  type ValuesWithServiceIds            = js.Array[ValueWithServiceIds]
  type Version                         = Int

  implicit final class XRayOps(private val service: XRay) extends AnyVal {

    @inline def batchGetTracesFuture(params: BatchGetTracesRequest): Future[BatchGetTracesResult] =
      service.batchGetTraces(params).promise().toFuture
    @inline def createGroupFuture(params: CreateGroupRequest): Future[CreateGroupResult] =
      service.createGroup(params).promise().toFuture
    @inline def createSamplingRuleFuture(params: CreateSamplingRuleRequest): Future[CreateSamplingRuleResult] =
      service.createSamplingRule(params).promise().toFuture
    @inline def deleteGroupFuture(params: DeleteGroupRequest): Future[DeleteGroupResult] =
      service.deleteGroup(params).promise().toFuture
    @inline def deleteSamplingRuleFuture(params: DeleteSamplingRuleRequest): Future[DeleteSamplingRuleResult] =
      service.deleteSamplingRule(params).promise().toFuture
    @inline def getEncryptionConfigFuture(params: GetEncryptionConfigRequest): Future[GetEncryptionConfigResult] =
      service.getEncryptionConfig(params).promise().toFuture
    @inline def getGroupFuture(params: GetGroupRequest): Future[GetGroupResult] =
      service.getGroup(params).promise().toFuture
    @inline def getGroupsFuture(params: GetGroupsRequest): Future[GetGroupsResult] =
      service.getGroups(params).promise().toFuture
    @inline def getSamplingRulesFuture(params: GetSamplingRulesRequest): Future[GetSamplingRulesResult] =
      service.getSamplingRules(params).promise().toFuture
    @inline def getSamplingStatisticSummariesFuture(
        params: GetSamplingStatisticSummariesRequest
    ): Future[GetSamplingStatisticSummariesResult] = service.getSamplingStatisticSummaries(params).promise().toFuture
    @inline def getSamplingTargetsFuture(params: GetSamplingTargetsRequest): Future[GetSamplingTargetsResult] =
      service.getSamplingTargets(params).promise().toFuture
    @inline def getServiceGraphFuture(params: GetServiceGraphRequest): Future[GetServiceGraphResult] =
      service.getServiceGraph(params).promise().toFuture
    @inline def getTimeSeriesServiceStatisticsFuture(
        params: GetTimeSeriesServiceStatisticsRequest
    ): Future[GetTimeSeriesServiceStatisticsResult] = service.getTimeSeriesServiceStatistics(params).promise().toFuture
    @inline def getTraceGraphFuture(params: GetTraceGraphRequest): Future[GetTraceGraphResult] =
      service.getTraceGraph(params).promise().toFuture
    @inline def getTraceSummariesFuture(params: GetTraceSummariesRequest): Future[GetTraceSummariesResult] =
      service.getTraceSummaries(params).promise().toFuture
    @inline def putEncryptionConfigFuture(params: PutEncryptionConfigRequest): Future[PutEncryptionConfigResult] =
      service.putEncryptionConfig(params).promise().toFuture
    @inline def putTelemetryRecordsFuture(params: PutTelemetryRecordsRequest): Future[PutTelemetryRecordsResult] =
      service.putTelemetryRecords(params).promise().toFuture
    @inline def putTraceSegmentsFuture(params: PutTraceSegmentsRequest): Future[PutTraceSegmentsResult] =
      service.putTraceSegments(params).promise().toFuture
    @inline def updateGroupFuture(params: UpdateGroupRequest): Future[UpdateGroupResult] =
      service.updateGroup(params).promise().toFuture
    @inline def updateSamplingRuleFuture(params: UpdateSamplingRuleRequest): Future[UpdateSamplingRuleResult] =
      service.updateSamplingRule(params).promise().toFuture
  }
}

package xray {
  @js.native
  @JSImport("aws-sdk", "XRay")
  class XRay() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchGetTraces(params: BatchGetTracesRequest): Request[BatchGetTracesResult]                = js.native
    def createGroup(params: CreateGroupRequest): Request[CreateGroupResult]                         = js.native
    def createSamplingRule(params: CreateSamplingRuleRequest): Request[CreateSamplingRuleResult]    = js.native
    def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResult]                         = js.native
    def deleteSamplingRule(params: DeleteSamplingRuleRequest): Request[DeleteSamplingRuleResult]    = js.native
    def getEncryptionConfig(params: GetEncryptionConfigRequest): Request[GetEncryptionConfigResult] = js.native
    def getGroup(params: GetGroupRequest): Request[GetGroupResult]                                  = js.native
    def getGroups(params: GetGroupsRequest): Request[GetGroupsResult]                               = js.native
    def getSamplingRules(params: GetSamplingRulesRequest): Request[GetSamplingRulesResult]          = js.native
    def getSamplingStatisticSummaries(
        params: GetSamplingStatisticSummariesRequest
    ): Request[GetSamplingStatisticSummariesResult]                                              = js.native
    def getSamplingTargets(params: GetSamplingTargetsRequest): Request[GetSamplingTargetsResult] = js.native
    def getServiceGraph(params: GetServiceGraphRequest): Request[GetServiceGraphResult]          = js.native
    def getTimeSeriesServiceStatistics(
        params: GetTimeSeriesServiceStatisticsRequest
    ): Request[GetTimeSeriesServiceStatisticsResult]                                                = js.native
    def getTraceGraph(params: GetTraceGraphRequest): Request[GetTraceGraphResult]                   = js.native
    def getTraceSummaries(params: GetTraceSummariesRequest): Request[GetTraceSummariesResult]       = js.native
    def putEncryptionConfig(params: PutEncryptionConfigRequest): Request[PutEncryptionConfigResult] = js.native
    def putTelemetryRecords(params: PutTelemetryRecordsRequest): Request[PutTelemetryRecordsResult] = js.native
    def putTraceSegments(params: PutTraceSegmentsRequest): Request[PutTraceSegmentsResult]          = js.native
    def updateGroup(params: UpdateGroupRequest): Request[UpdateGroupResult]                         = js.native
    def updateSamplingRule(params: UpdateSamplingRuleRequest): Request[UpdateSamplingRuleResult]    = js.native
  }

  /**
    * An alias for an edge.
    */
  @js.native
  @Factory
  trait Alias extends js.Object {
    var Name: js.UndefOr[String]
    var Names: js.UndefOr[AliasNames]
    var Type: js.UndefOr[String]
  }

  /**
    * Value of a segment annotation. Has one of three value types: Number, Boolean or String.
    */
  @js.native
  @Factory
  trait AnnotationValue extends js.Object {
    var BooleanValue: js.UndefOr[NullableBoolean]
    var NumberValue: js.UndefOr[NullableDouble]
    var StringValue: js.UndefOr[String]
  }

  /**
    * A list of availability zones corresponding to the segments in a trace.
    */
  @js.native
  @Factory
  trait AvailabilityZoneDetail extends js.Object {
    var Name: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait BackendConnectionErrors extends js.Object {
    var ConnectionRefusedCount: js.UndefOr[NullableInteger]
    var HTTPCode4XXCount: js.UndefOr[NullableInteger]
    var HTTPCode5XXCount: js.UndefOr[NullableInteger]
    var OtherCount: js.UndefOr[NullableInteger]
    var TimeoutCount: js.UndefOr[NullableInteger]
    var UnknownHostCount: js.UndefOr[NullableInteger]
  }

  @js.native
  @Factory
  trait BatchGetTracesRequest extends js.Object {
    var TraceIds: TraceIdList
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait BatchGetTracesResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Traces: js.UndefOr[TraceList]
    var UnprocessedTraceIds: js.UndefOr[UnprocessedTraceIdList]
  }

  @js.native
  @Factory
  trait CreateGroupRequest extends js.Object {
    var GroupName: GroupName
    var FilterExpression: js.UndefOr[FilterExpression]
  }

  @js.native
  @Factory
  trait CreateGroupResult extends js.Object {
    var Group: js.UndefOr[Group]
  }

  @js.native
  @Factory
  trait CreateSamplingRuleRequest extends js.Object {
    var SamplingRule: SamplingRule
  }

  @js.native
  @Factory
  trait CreateSamplingRuleResult extends js.Object {
    var SamplingRuleRecord: js.UndefOr[SamplingRuleRecord]
  }

  @js.native
  @Factory
  trait DeleteGroupRequest extends js.Object {
    var GroupARN: js.UndefOr[GroupARN]
    var GroupName: js.UndefOr[GroupName]
  }

  @js.native
  @Factory
  trait DeleteGroupResult extends js.Object {}

  @js.native
  @Factory
  trait DeleteSamplingRuleRequest extends js.Object {
    var RuleARN: js.UndefOr[String]
    var RuleName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteSamplingRuleResult extends js.Object {
    var SamplingRuleRecord: js.UndefOr[SamplingRuleRecord]
  }

  /**
    * Information about a connection between two services.
    */
  @js.native
  @Factory
  trait Edge extends js.Object {
    var Aliases: js.UndefOr[AliasList]
    var EndTime: js.UndefOr[Timestamp]
    var ReferenceId: js.UndefOr[NullableInteger]
    var ResponseTimeHistogram: js.UndefOr[Histogram]
    var StartTime: js.UndefOr[Timestamp]
    var SummaryStatistics: js.UndefOr[EdgeStatistics]
  }

  /**
    * Response statistics for an edge.
    */
  @js.native
  @Factory
  trait EdgeStatistics extends js.Object {
    var ErrorStatistics: js.UndefOr[ErrorStatistics]
    var FaultStatistics: js.UndefOr[FaultStatistics]
    var OkCount: js.UndefOr[NullableLong]
    var TotalCount: js.UndefOr[NullableLong]
    var TotalResponseTime: js.UndefOr[NullableDouble]
  }

  /**
    * A configuration document that specifies encryption configuration settings.
    */
  @js.native
  @Factory
  trait EncryptionConfig extends js.Object {
    var KeyId: js.UndefOr[String]
    var Status: js.UndefOr[EncryptionStatus]
    var Type: js.UndefOr[EncryptionType]
  }

  @js.native
  sealed trait EncryptionStatus extends js.Any
  object EncryptionStatus extends js.Object {
    val UPDATING = "UPDATING".asInstanceOf[EncryptionStatus]
    val ACTIVE   = "ACTIVE".asInstanceOf[EncryptionStatus]

    val values = js.Object.freeze(js.Array(UPDATING, ACTIVE))
  }

  @js.native
  sealed trait EncryptionType extends js.Any
  object EncryptionType extends js.Object {
    val NONE = "NONE".asInstanceOf[EncryptionType]
    val KMS  = "KMS".asInstanceOf[EncryptionType]

    val values = js.Object.freeze(js.Array(NONE, KMS))
  }

  /**
    * The root cause of a trace summary error.
    */
  @js.native
  @Factory
  trait ErrorRootCause extends js.Object {
    var Services: js.UndefOr[ErrorRootCauseServices]
  }

  /**
    * A collection of segments and corresponding subsegments associated to a trace summary error.
    */
  @js.native
  @Factory
  trait ErrorRootCauseEntity extends js.Object {
    var Exceptions: js.UndefOr[RootCauseExceptions]
    var Name: js.UndefOr[String]
    var Remote: js.UndefOr[NullableBoolean]
  }

  /**
    * A collection of fields identifying the services in a trace summary error.
    */
  @js.native
  @Factory
  trait ErrorRootCauseService extends js.Object {
    var AccountId: js.UndefOr[String]
    var EntityPath: js.UndefOr[ErrorRootCauseEntityPath]
    var Inferred: js.UndefOr[NullableBoolean]
    var Name: js.UndefOr[String]
    var Names: js.UndefOr[ServiceNames]
    var Type: js.UndefOr[String]
  }

  /**
    * Information about requests that failed with a 4xx Client Error status code.
    */
  @js.native
  @Factory
  trait ErrorStatistics extends js.Object {
    var OtherCount: js.UndefOr[NullableLong]
    var ThrottleCount: js.UndefOr[NullableLong]
    var TotalCount: js.UndefOr[NullableLong]
  }

  /**
    * The root cause information for a trace summary fault.
    */
  @js.native
  @Factory
  trait FaultRootCause extends js.Object {
    var Services: js.UndefOr[FaultRootCauseServices]
  }

  /**
    * A collection of segments and corresponding subsegments associated to a trace summary fault error.
    */
  @js.native
  @Factory
  trait FaultRootCauseEntity extends js.Object {
    var Exceptions: js.UndefOr[RootCauseExceptions]
    var Name: js.UndefOr[String]
    var Remote: js.UndefOr[NullableBoolean]
  }

  /**
    * A collection of fields identifying the services in a trace summary fault.
    */
  @js.native
  @Factory
  trait FaultRootCauseService extends js.Object {
    var AccountId: js.UndefOr[String]
    var EntityPath: js.UndefOr[FaultRootCauseEntityPath]
    var Inferred: js.UndefOr[NullableBoolean]
    var Name: js.UndefOr[String]
    var Names: js.UndefOr[ServiceNames]
    var Type: js.UndefOr[String]
  }

  /**
    * Information about requests that failed with a 5xx Server Error status code.
    */
  @js.native
  @Factory
  trait FaultStatistics extends js.Object {
    var OtherCount: js.UndefOr[NullableLong]
    var TotalCount: js.UndefOr[NullableLong]
  }

  @js.native
  @Factory
  trait GetEncryptionConfigRequest extends js.Object {}

  @js.native
  @Factory
  trait GetEncryptionConfigResult extends js.Object {
    var EncryptionConfig: js.UndefOr[EncryptionConfig]
  }

  @js.native
  @Factory
  trait GetGroupRequest extends js.Object {
    var GroupARN: js.UndefOr[GroupARN]
    var GroupName: js.UndefOr[GroupName]
  }

  @js.native
  @Factory
  trait GetGroupResult extends js.Object {
    var Group: js.UndefOr[Group]
  }

  @js.native
  @Factory
  trait GetGroupsRequest extends js.Object {
    var NextToken: js.UndefOr[GetGroupsNextToken]
  }

  @js.native
  @Factory
  trait GetGroupsResult extends js.Object {
    var Groups: js.UndefOr[GroupSummaryList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetSamplingRulesRequest extends js.Object {
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetSamplingRulesResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var SamplingRuleRecords: js.UndefOr[SamplingRuleRecordList]
  }

  @js.native
  @Factory
  trait GetSamplingStatisticSummariesRequest extends js.Object {
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetSamplingStatisticSummariesResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var SamplingStatisticSummaries: js.UndefOr[SamplingStatisticSummaryList]
  }

  @js.native
  @Factory
  trait GetSamplingTargetsRequest extends js.Object {
    var SamplingStatisticsDocuments: SamplingStatisticsDocumentList
  }

  @js.native
  @Factory
  trait GetSamplingTargetsResult extends js.Object {
    var LastRuleModification: js.UndefOr[Timestamp]
    var SamplingTargetDocuments: js.UndefOr[SamplingTargetDocumentList]
    var UnprocessedStatistics: js.UndefOr[UnprocessedStatisticsList]
  }

  @js.native
  @Factory
  trait GetServiceGraphRequest extends js.Object {
    var EndTime: Timestamp
    var StartTime: Timestamp
    var GroupARN: js.UndefOr[GroupARN]
    var GroupName: js.UndefOr[GroupName]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetServiceGraphResult extends js.Object {
    var ContainsOldGroupVersions: js.UndefOr[Boolean]
    var EndTime: js.UndefOr[Timestamp]
    var NextToken: js.UndefOr[String]
    var Services: js.UndefOr[ServiceList]
    var StartTime: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait GetTimeSeriesServiceStatisticsRequest extends js.Object {
    var EndTime: Timestamp
    var StartTime: Timestamp
    var EntitySelectorExpression: js.UndefOr[EntitySelectorExpression]
    var GroupARN: js.UndefOr[GroupARN]
    var GroupName: js.UndefOr[GroupName]
    var NextToken: js.UndefOr[String]
    var Period: js.UndefOr[NullableInteger]
  }

  @js.native
  @Factory
  trait GetTimeSeriesServiceStatisticsResult extends js.Object {
    var ContainsOldGroupVersions: js.UndefOr[Boolean]
    var NextToken: js.UndefOr[String]
    var TimeSeriesServiceStatistics: js.UndefOr[TimeSeriesServiceStatisticsList]
  }

  @js.native
  @Factory
  trait GetTraceGraphRequest extends js.Object {
    var TraceIds: TraceIdList
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetTraceGraphResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Services: js.UndefOr[ServiceList]
  }

  @js.native
  @Factory
  trait GetTraceSummariesRequest extends js.Object {
    var EndTime: Timestamp
    var StartTime: Timestamp
    var FilterExpression: js.UndefOr[FilterExpression]
    var NextToken: js.UndefOr[String]
    var Sampling: js.UndefOr[NullableBoolean]
    var SamplingStrategy: js.UndefOr[SamplingStrategy]
    var TimeRangeType: js.UndefOr[TimeRangeType]
  }

  @js.native
  @Factory
  trait GetTraceSummariesResult extends js.Object {
    var ApproximateTime: js.UndefOr[Timestamp]
    var NextToken: js.UndefOr[String]
    var TraceSummaries: js.UndefOr[TraceSummaryList]
    var TracesProcessedCount: js.UndefOr[NullableLong]
  }

  /**
    * Details and metadata for a group.
    */
  @js.native
  @Factory
  trait Group extends js.Object {
    var FilterExpression: js.UndefOr[String]
    var GroupARN: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
  }

  /**
    * Details for a group without metadata.
    */
  @js.native
  @Factory
  trait GroupSummary extends js.Object {
    var FilterExpression: js.UndefOr[String]
    var GroupARN: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
  }

  /**
    * An entry in a histogram for a statistic. A histogram maps the range of observed values on the X axis, and the prevalence of each value on the Y axis.
    */
  @js.native
  @Factory
  trait HistogramEntry extends js.Object {
    var Count: js.UndefOr[Int]
    var Value: js.UndefOr[Double]
  }

  /**
    * Information about an HTTP request.
    */
  @js.native
  @Factory
  trait Http extends js.Object {
    var ClientIp: js.UndefOr[String]
    var HttpMethod: js.UndefOr[String]
    var HttpStatus: js.UndefOr[NullableInteger]
    var HttpURL: js.UndefOr[String]
    var UserAgent: js.UndefOr[String]
  }

  /**
    * A list of EC2 instance IDs corresponding to the segments in a trace.
    */
  @js.native
  @Factory
  trait InstanceIdDetail extends js.Object {
    var Id: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait PutEncryptionConfigRequest extends js.Object {
    var Type: EncryptionType
    var KeyId: js.UndefOr[EncryptionKeyId]
  }

  @js.native
  @Factory
  trait PutEncryptionConfigResult extends js.Object {
    var EncryptionConfig: js.UndefOr[EncryptionConfig]
  }

  @js.native
  @Factory
  trait PutTelemetryRecordsRequest extends js.Object {
    var TelemetryRecords: TelemetryRecordList
    var EC2InstanceId: js.UndefOr[EC2InstanceId]
    var Hostname: js.UndefOr[Hostname]
    var ResourceARN: js.UndefOr[ResourceARN]
  }

  @js.native
  @Factory
  trait PutTelemetryRecordsResult extends js.Object {}

  @js.native
  @Factory
  trait PutTraceSegmentsRequest extends js.Object {
    var TraceSegmentDocuments: TraceSegmentDocumentList
  }

  @js.native
  @Factory
  trait PutTraceSegmentsResult extends js.Object {
    var UnprocessedTraceSegments: js.UndefOr[UnprocessedTraceSegmentList]
  }

  /**
    * A list of resources ARNs corresponding to the segments in a trace.
    */
  @js.native
  @Factory
  trait ResourceARNDetail extends js.Object {
    var ARN: js.UndefOr[String]
  }

  /**
    * The root cause information for a response time warning.
    */
  @js.native
  @Factory
  trait ResponseTimeRootCause extends js.Object {
    var Services: js.UndefOr[ResponseTimeRootCauseServices]
  }

  /**
    * A collection of segments and corresponding subsegments associated to a response time warning.
    */
  @js.native
  @Factory
  trait ResponseTimeRootCauseEntity extends js.Object {
    var Coverage: js.UndefOr[NullableDouble]
    var Name: js.UndefOr[String]
    var Remote: js.UndefOr[NullableBoolean]
  }

  /**
    * A collection of fields identifying the service in a response time warning.
    */
  @js.native
  @Factory
  trait ResponseTimeRootCauseService extends js.Object {
    var AccountId: js.UndefOr[String]
    var EntityPath: js.UndefOr[ResponseTimeRootCauseEntityPath]
    var Inferred: js.UndefOr[NullableBoolean]
    var Name: js.UndefOr[String]
    var Names: js.UndefOr[ServiceNames]
    var Type: js.UndefOr[String]
  }

  /**
    * The exception associated with a root cause.
    */
  @js.native
  @Factory
  trait RootCauseException extends js.Object {
    var Message: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  /**
    * A sampling rule that services use to decide whether to instrument a request. Rule fields can match properties of the service, or properties of a request. The service can ignore rules that don't match its properties.
    */
  @js.native
  @Factory
  trait SamplingRule extends js.Object {
    var FixedRate: FixedRate
    var HTTPMethod: HTTPMethod
    var Host: Host
    var Priority: Priority
    var ReservoirSize: ReservoirSize
    var ResourceARN: ResourceARN
    var ServiceName: ServiceName
    var ServiceType: ServiceType
    var URLPath: URLPath
    var Version: Version
    var Attributes: js.UndefOr[AttributeMap]
    var RuleARN: js.UndefOr[String]
    var RuleName: js.UndefOr[RuleName]
  }

  /**
    * A <a>SamplingRule</a> and its metadata.
    */
  @js.native
  @Factory
  trait SamplingRuleRecord extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var ModifiedAt: js.UndefOr[Timestamp]
    var SamplingRule: js.UndefOr[SamplingRule]
  }

  /**
    * A document specifying changes to a sampling rule's configuration.
    */
  @js.native
  @Factory
  trait SamplingRuleUpdate extends js.Object {
    var Attributes: js.UndefOr[AttributeMap]
    var FixedRate: js.UndefOr[NullableDouble]
    var HTTPMethod: js.UndefOr[HTTPMethod]
    var Host: js.UndefOr[Host]
    var Priority: js.UndefOr[NullableInteger]
    var ReservoirSize: js.UndefOr[NullableInteger]
    var ResourceARN: js.UndefOr[ResourceARN]
    var RuleARN: js.UndefOr[String]
    var RuleName: js.UndefOr[RuleName]
    var ServiceName: js.UndefOr[ServiceName]
    var ServiceType: js.UndefOr[ServiceType]
    var URLPath: js.UndefOr[URLPath]
  }

  /**
    * Aggregated request sampling data for a sampling rule across all services for a 10 second window.
    */
  @js.native
  @Factory
  trait SamplingStatisticSummary extends js.Object {
    var BorrowCount: js.UndefOr[Int]
    var RequestCount: js.UndefOr[Int]
    var RuleName: js.UndefOr[String]
    var SampledCount: js.UndefOr[Int]
    var Timestamp: js.UndefOr[Timestamp]
  }

  /**
    * Request sampling results for a single rule from a service. Results are for the last 10 seconds unless the service has been assigned a longer reporting interval after a previous call to <a>GetSamplingTargets</a>.
    */
  @js.native
  @Factory
  trait SamplingStatisticsDocument extends js.Object {
    var ClientID: ClientID
    var RequestCount: RequestCount
    var RuleName: RuleName
    var SampledCount: SampledCount
    var Timestamp: Timestamp
    var BorrowCount: js.UndefOr[BorrowCount]
  }

  /**
    * The name and value of a sampling rule to apply to a trace summary.
    */
  @js.native
  @Factory
  trait SamplingStrategy extends js.Object {
    var Name: js.UndefOr[SamplingStrategyName]
    var Value: js.UndefOr[NullableDouble]
  }

  @js.native
  sealed trait SamplingStrategyName extends js.Any
  object SamplingStrategyName extends js.Object {
    val PartialScan = "PartialScan".asInstanceOf[SamplingStrategyName]
    val FixedRate   = "FixedRate".asInstanceOf[SamplingStrategyName]

    val values = js.Object.freeze(js.Array(PartialScan, FixedRate))
  }

  /**
    * Temporary changes to a sampling rule configuration. To meet the global sampling target for a rule, X-Ray calculates a new reservoir for each service based on the recent sampling results of all services that called <a>GetSamplingTargets</a>.
    */
  @js.native
  @Factory
  trait SamplingTargetDocument extends js.Object {
    var FixedRate: js.UndefOr[Double]
    var Interval: js.UndefOr[NullableInteger]
    var ReservoirQuota: js.UndefOr[NullableInteger]
    var ReservoirQuotaTTL: js.UndefOr[Timestamp]
    var RuleName: js.UndefOr[String]
  }

  /**
    * A segment from a trace that has been ingested by the X-Ray service. The segment can be compiled from documents uploaded with <a>PutTraceSegments</a>, or an <code>inferred</code> segment for a downstream service, generated from a subsegment sent by the service that called it.
    *  For the full segment document schema, see [[https://docs.aws.amazon.com/xray/latest/devguide/xray-api-segmentdocuments.html|AWS X-Ray Segment Documents]] in the <i>AWS X-Ray Developer Guide</i>.
    */
  @js.native
  @Factory
  trait Segment extends js.Object {
    var Document: js.UndefOr[SegmentDocument]
    var Id: js.UndefOr[SegmentId]
  }

  /**
    * Information about an application that processed requests, users that made requests, or downstream services, resources and applications that an application used.
    */
  @js.native
  @Factory
  trait Service extends js.Object {
    var AccountId: js.UndefOr[String]
    var DurationHistogram: js.UndefOr[Histogram]
    var Edges: js.UndefOr[EdgeList]
    var EndTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[String]
    var Names: js.UndefOr[ServiceNames]
    var ReferenceId: js.UndefOr[NullableInteger]
    var ResponseTimeHistogram: js.UndefOr[Histogram]
    var Root: js.UndefOr[NullableBoolean]
    var StartTime: js.UndefOr[Timestamp]
    var State: js.UndefOr[String]
    var SummaryStatistics: js.UndefOr[ServiceStatistics]
    var Type: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ServiceId extends js.Object {
    var AccountId: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Names: js.UndefOr[ServiceNames]
    var Type: js.UndefOr[String]
  }

  /**
    * Response statistics for a service.
    */
  @js.native
  @Factory
  trait ServiceStatistics extends js.Object {
    var ErrorStatistics: js.UndefOr[ErrorStatistics]
    var FaultStatistics: js.UndefOr[FaultStatistics]
    var OkCount: js.UndefOr[NullableLong]
    var TotalCount: js.UndefOr[NullableLong]
    var TotalResponseTime: js.UndefOr[NullableDouble]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait TelemetryRecord extends js.Object {
    var Timestamp: Timestamp
    var BackendConnectionErrors: js.UndefOr[BackendConnectionErrors]
    var SegmentsReceivedCount: js.UndefOr[NullableInteger]
    var SegmentsRejectedCount: js.UndefOr[NullableInteger]
    var SegmentsSentCount: js.UndefOr[NullableInteger]
    var SegmentsSpilloverCount: js.UndefOr[NullableInteger]
  }

  @js.native
  sealed trait TimeRangeType extends js.Any
  object TimeRangeType extends js.Object {
    val TraceId = "TraceId".asInstanceOf[TimeRangeType]
    val Event   = "Event".asInstanceOf[TimeRangeType]

    val values = js.Object.freeze(js.Array(TraceId, Event))
  }

  /**
    * A list of TimeSeriesStatistic structures.
    */
  @js.native
  @Factory
  trait TimeSeriesServiceStatistics extends js.Object {
    var EdgeSummaryStatistics: js.UndefOr[EdgeStatistics]
    var ResponseTimeHistogram: js.UndefOr[Histogram]
    var ServiceSummaryStatistics: js.UndefOr[ServiceStatistics]
    var Timestamp: js.UndefOr[Timestamp]
  }

  /**
    * A collection of segment documents with matching trace IDs.
    */
  @js.native
  @Factory
  trait Trace extends js.Object {
    var Duration: js.UndefOr[NullableDouble]
    var Id: js.UndefOr[TraceId]
    var Segments: js.UndefOr[SegmentList]
  }

  /**
    * Metadata generated from the segment documents in a trace.
    */
  @js.native
  @Factory
  trait TraceSummary extends js.Object {
    var Annotations: js.UndefOr[Annotations]
    var AvailabilityZones: js.UndefOr[TraceAvailabilityZones]
    var Duration: js.UndefOr[NullableDouble]
    var EntryPoint: js.UndefOr[ServiceId]
    var ErrorRootCauses: js.UndefOr[ErrorRootCauses]
    var FaultRootCauses: js.UndefOr[FaultRootCauses]
    var HasError: js.UndefOr[NullableBoolean]
    var HasFault: js.UndefOr[NullableBoolean]
    var HasThrottle: js.UndefOr[NullableBoolean]
    var Http: js.UndefOr[Http]
    var Id: js.UndefOr[TraceId]
    var InstanceIds: js.UndefOr[TraceInstanceIds]
    var IsPartial: js.UndefOr[NullableBoolean]
    var MatchedEventTime: js.UndefOr[Timestamp]
    var ResourceARNs: js.UndefOr[TraceResourceARNs]
    var ResponseTime: js.UndefOr[NullableDouble]
    var ResponseTimeRootCauses: js.UndefOr[ResponseTimeRootCauses]
    var Revision: js.UndefOr[Int]
    var ServiceIds: js.UndefOr[ServiceIds]
    var Users: js.UndefOr[TraceUsers]
  }

  /**
    * Information about a user recorded in segment documents.
    */
  @js.native
  @Factory
  trait TraceUser extends js.Object {
    var ServiceIds: js.UndefOr[ServiceIds]
    var UserName: js.UndefOr[String]
  }

  /**
    * Sampling statistics from a call to <a>GetSamplingTargets</a> that X-Ray could not process.
    */
  @js.native
  @Factory
  trait UnprocessedStatistics extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var Message: js.UndefOr[String]
    var RuleName: js.UndefOr[String]
  }

  /**
    * Information about a segment that failed processing.
    */
  @js.native
  @Factory
  trait UnprocessedTraceSegment extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var Id: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateGroupRequest extends js.Object {
    var FilterExpression: js.UndefOr[FilterExpression]
    var GroupARN: js.UndefOr[GroupARN]
    var GroupName: js.UndefOr[GroupName]
  }

  @js.native
  @Factory
  trait UpdateGroupResult extends js.Object {
    var Group: js.UndefOr[Group]
  }

  @js.native
  @Factory
  trait UpdateSamplingRuleRequest extends js.Object {
    var SamplingRuleUpdate: SamplingRuleUpdate
  }

  @js.native
  @Factory
  trait UpdateSamplingRuleResult extends js.Object {
    var SamplingRuleRecord: js.UndefOr[SamplingRuleRecord]
  }

  /**
    * Information about a segment annotation.
    */
  @js.native
  @Factory
  trait ValueWithServiceIds extends js.Object {
    var AnnotationValue: js.UndefOr[AnnotationValue]
    var ServiceIds: js.UndefOr[ServiceIds]
  }
}
