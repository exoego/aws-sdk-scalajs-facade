package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object xray {
  type AliasList = js.Array[Alias]
  type AliasNames = js.Array[String]
  type AmazonResourceName = String
  type AnnotationKey = String
  type Annotations = js.Dictionary[ValuesWithServiceIds]
  type AnomalousServiceList = js.Array[AnomalousService]
  type AttributeKey = String
  type AttributeMap = js.Dictionary[AttributeValue]
  type AttributeValue = String
  type BorrowCount = Int
  type ClientID = String
  type EC2InstanceId = String
  type EdgeList = js.Array[Edge]
  type EncryptionKeyId = String
  type EntitySelectorExpression = String
  type ErrorRootCauseEntityPath = js.Array[ErrorRootCauseEntity]
  type ErrorRootCauseServices = js.Array[ErrorRootCauseService]
  type ErrorRootCauses = js.Array[ErrorRootCause]
  type EventSummaryText = String
  type FaultRootCauseEntityPath = js.Array[FaultRootCauseEntity]
  type FaultRootCauseServices = js.Array[FaultRootCauseService]
  type FaultRootCauses = js.Array[FaultRootCause]
  type FilterExpression = String
  type FixedRate = Double
  type GetGroupsNextToken = String
  type GetInsightEventsMaxResults = Int
  type GetInsightSummariesMaxResults = Int
  type GroupARN = String
  type GroupName = String
  type GroupSummaryList = js.Array[GroupSummary]
  type HTTPMethod = String
  type Histogram = js.Array[HistogramEntry]
  type Host = String
  type Hostname = String
  type InsightCategoryList = js.Array[InsightCategory]
  type InsightEventList = js.Array[InsightEvent]
  type InsightId = String
  type InsightImpactGraphEdgeList = js.Array[InsightImpactGraphEdge]
  type InsightImpactGraphServiceList = js.Array[InsightImpactGraphService]
  type InsightStateList = js.Array[InsightState]
  type InsightSummaryList = js.Array[InsightSummary]
  type InsightSummaryText = String
  type NullableBoolean = Boolean
  type NullableDouble = Double
  type NullableInteger = Int
  type NullableLong = Double
  type Priority = Int
  type RequestCount = Int
  type ReservoirSize = Int
  type ResourceARN = String
  type ResponseTimeRootCauseEntityPath = js.Array[ResponseTimeRootCauseEntity]
  type ResponseTimeRootCauseServices = js.Array[ResponseTimeRootCauseService]
  type ResponseTimeRootCauses = js.Array[ResponseTimeRootCause]
  type RootCauseExceptions = js.Array[RootCauseException]
  type RuleName = String
  type SampledCount = Int
  type SamplingRuleRecordList = js.Array[SamplingRuleRecord]
  type SamplingStatisticSummaryList = js.Array[SamplingStatisticSummary]
  type SamplingStatisticsDocumentList = js.Array[SamplingStatisticsDocument]
  type SamplingTargetDocumentList = js.Array[SamplingTargetDocument]
  type SegmentDocument = String
  type SegmentId = String
  type SegmentList = js.Array[Segment]
  type ServiceIds = js.Array[ServiceId]
  type ServiceList = js.Array[Service]
  type ServiceName = String
  type ServiceNames = js.Array[String]
  type ServiceType = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TelemetryRecordList = js.Array[TelemetryRecord]
  type TimeSeriesServiceStatisticsList = js.Array[TimeSeriesServiceStatistics]
  type Timestamp = js.Date
  type Token = String
  type TraceAvailabilityZones = js.Array[AvailabilityZoneDetail]
  type TraceId = String
  type TraceIdList = js.Array[TraceId]
  type TraceInstanceIds = js.Array[InstanceIdDetail]
  type TraceList = js.Array[Trace]
  type TraceResourceARNs = js.Array[ResourceARNDetail]
  type TraceSegmentDocument = String
  type TraceSegmentDocumentList = js.Array[TraceSegmentDocument]
  type TraceSummaryList = js.Array[TraceSummary]
  type TraceUsers = js.Array[TraceUser]
  type URLPath = String
  type UnprocessedStatisticsList = js.Array[UnprocessedStatistics]
  type UnprocessedTraceIdList = js.Array[TraceId]
  type UnprocessedTraceSegmentList = js.Array[UnprocessedTraceSegment]
  type ValuesWithServiceIds = js.Array[ValueWithServiceIds]
  type Version = Int

  implicit final class XRayOps(private val service: XRay) extends AnyVal {

    @inline def batchGetTracesFuture(params: BatchGetTracesRequest): Future[BatchGetTracesResult] = service.batchGetTraces(params).promise().toFuture
    @inline def createGroupFuture(params: CreateGroupRequest): Future[CreateGroupResult] = service.createGroup(params).promise().toFuture
    @inline def createSamplingRuleFuture(params: CreateSamplingRuleRequest): Future[CreateSamplingRuleResult] = service.createSamplingRule(params).promise().toFuture
    @inline def deleteGroupFuture(params: DeleteGroupRequest): Future[DeleteGroupResult] = service.deleteGroup(params).promise().toFuture
    @inline def deleteSamplingRuleFuture(params: DeleteSamplingRuleRequest): Future[DeleteSamplingRuleResult] = service.deleteSamplingRule(params).promise().toFuture
    @inline def getEncryptionConfigFuture(params: GetEncryptionConfigRequest): Future[GetEncryptionConfigResult] = service.getEncryptionConfig(params).promise().toFuture
    @inline def getGroupFuture(params: GetGroupRequest): Future[GetGroupResult] = service.getGroup(params).promise().toFuture
    @inline def getGroupsFuture(params: GetGroupsRequest): Future[GetGroupsResult] = service.getGroups(params).promise().toFuture
    @inline def getInsightEventsFuture(params: GetInsightEventsRequest): Future[GetInsightEventsResult] = service.getInsightEvents(params).promise().toFuture
    @inline def getInsightFuture(params: GetInsightRequest): Future[GetInsightResult] = service.getInsight(params).promise().toFuture
    @inline def getInsightImpactGraphFuture(params: GetInsightImpactGraphRequest): Future[GetInsightImpactGraphResult] = service.getInsightImpactGraph(params).promise().toFuture
    @inline def getInsightSummariesFuture(params: GetInsightSummariesRequest): Future[GetInsightSummariesResult] = service.getInsightSummaries(params).promise().toFuture
    @inline def getSamplingRulesFuture(params: GetSamplingRulesRequest): Future[GetSamplingRulesResult] = service.getSamplingRules(params).promise().toFuture
    @inline def getSamplingStatisticSummariesFuture(params: GetSamplingStatisticSummariesRequest): Future[GetSamplingStatisticSummariesResult] = service.getSamplingStatisticSummaries(params).promise().toFuture
    @inline def getSamplingTargetsFuture(params: GetSamplingTargetsRequest): Future[GetSamplingTargetsResult] = service.getSamplingTargets(params).promise().toFuture
    @inline def getServiceGraphFuture(params: GetServiceGraphRequest): Future[GetServiceGraphResult] = service.getServiceGraph(params).promise().toFuture
    @inline def getTimeSeriesServiceStatisticsFuture(params: GetTimeSeriesServiceStatisticsRequest): Future[GetTimeSeriesServiceStatisticsResult] = service.getTimeSeriesServiceStatistics(params).promise().toFuture
    @inline def getTraceGraphFuture(params: GetTraceGraphRequest): Future[GetTraceGraphResult] = service.getTraceGraph(params).promise().toFuture
    @inline def getTraceSummariesFuture(params: GetTraceSummariesRequest): Future[GetTraceSummariesResult] = service.getTraceSummaries(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putEncryptionConfigFuture(params: PutEncryptionConfigRequest): Future[PutEncryptionConfigResult] = service.putEncryptionConfig(params).promise().toFuture
    @inline def putTelemetryRecordsFuture(params: PutTelemetryRecordsRequest): Future[PutTelemetryRecordsResult] = service.putTelemetryRecords(params).promise().toFuture
    @inline def putTraceSegmentsFuture(params: PutTraceSegmentsRequest): Future[PutTraceSegmentsResult] = service.putTraceSegments(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateGroupFuture(params: UpdateGroupRequest): Future[UpdateGroupResult] = service.updateGroup(params).promise().toFuture
    @inline def updateSamplingRuleFuture(params: UpdateSamplingRuleRequest): Future[UpdateSamplingRuleResult] = service.updateSamplingRule(params).promise().toFuture

  }
}

package xray {
  @js.native
  @JSImport("aws-sdk/clients/xray", JSImport.Namespace, "AWS.XRay")
  class XRay() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchGetTraces(params: BatchGetTracesRequest): Request[BatchGetTracesResult] = js.native
    def createGroup(params: CreateGroupRequest): Request[CreateGroupResult] = js.native
    def createSamplingRule(params: CreateSamplingRuleRequest): Request[CreateSamplingRuleResult] = js.native
    def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResult] = js.native
    def deleteSamplingRule(params: DeleteSamplingRuleRequest): Request[DeleteSamplingRuleResult] = js.native
    def getEncryptionConfig(params: GetEncryptionConfigRequest): Request[GetEncryptionConfigResult] = js.native
    def getGroup(params: GetGroupRequest): Request[GetGroupResult] = js.native
    def getGroups(params: GetGroupsRequest): Request[GetGroupsResult] = js.native
    def getInsight(params: GetInsightRequest): Request[GetInsightResult] = js.native
    def getInsightEvents(params: GetInsightEventsRequest): Request[GetInsightEventsResult] = js.native
    def getInsightImpactGraph(params: GetInsightImpactGraphRequest): Request[GetInsightImpactGraphResult] = js.native
    def getInsightSummaries(params: GetInsightSummariesRequest): Request[GetInsightSummariesResult] = js.native
    def getSamplingRules(params: GetSamplingRulesRequest): Request[GetSamplingRulesResult] = js.native
    def getSamplingStatisticSummaries(params: GetSamplingStatisticSummariesRequest): Request[GetSamplingStatisticSummariesResult] = js.native
    def getSamplingTargets(params: GetSamplingTargetsRequest): Request[GetSamplingTargetsResult] = js.native
    def getServiceGraph(params: GetServiceGraphRequest): Request[GetServiceGraphResult] = js.native
    def getTimeSeriesServiceStatistics(params: GetTimeSeriesServiceStatisticsRequest): Request[GetTimeSeriesServiceStatisticsResult] = js.native
    def getTraceGraph(params: GetTraceGraphRequest): Request[GetTraceGraphResult] = js.native
    def getTraceSummaries(params: GetTraceSummariesRequest): Request[GetTraceSummariesResult] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putEncryptionConfig(params: PutEncryptionConfigRequest): Request[PutEncryptionConfigResult] = js.native
    def putTelemetryRecords(params: PutTelemetryRecordsRequest): Request[PutTelemetryRecordsResult] = js.native
    def putTraceSegments(params: PutTraceSegmentsRequest): Request[PutTraceSegmentsResult] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateGroup(params: UpdateGroupRequest): Request[UpdateGroupResult] = js.native
    def updateSamplingRule(params: UpdateSamplingRuleRequest): Request[UpdateSamplingRuleResult] = js.native
  }

  /** An alias for an edge.
    */
  @js.native
  trait Alias extends js.Object {
    var Name: js.UndefOr[String]
    var Names: js.UndefOr[AliasNames]
    var Type: js.UndefOr[String]
  }

  object Alias {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        Names: js.UndefOr[AliasNames] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): Alias = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Alias]
    }
  }

  /** Value of a segment annotation. Has one of three value types: Number, Boolean, or String.
    */
  @js.native
  trait AnnotationValue extends js.Object {
    var BooleanValue: js.UndefOr[NullableBoolean]
    var NumberValue: js.UndefOr[NullableDouble]
    var StringValue: js.UndefOr[String]
  }

  object AnnotationValue {
    @inline
    def apply(
        BooleanValue: js.UndefOr[NullableBoolean] = js.undefined,
        NumberValue: js.UndefOr[NullableDouble] = js.undefined,
        StringValue: js.UndefOr[String] = js.undefined
    ): AnnotationValue = {
      val __obj = js.Dynamic.literal()
      BooleanValue.foreach(__v => __obj.updateDynamic("BooleanValue")(__v.asInstanceOf[js.Any]))
      NumberValue.foreach(__v => __obj.updateDynamic("NumberValue")(__v.asInstanceOf[js.Any]))
      StringValue.foreach(__v => __obj.updateDynamic("StringValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnnotationValue]
    }
  }

  /** The service within the service graph that has anomalously high fault rates.
    */
  @js.native
  trait AnomalousService extends js.Object {
    var ServiceId: js.UndefOr[ServiceId]
  }

  object AnomalousService {
    @inline
    def apply(
        ServiceId: js.UndefOr[ServiceId] = js.undefined
    ): AnomalousService = {
      val __obj = js.Dynamic.literal()
      ServiceId.foreach(__v => __obj.updateDynamic("ServiceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnomalousService]
    }
  }

  /** A list of Availability Zones corresponding to the segments in a trace.
    */
  @js.native
  trait AvailabilityZoneDetail extends js.Object {
    var Name: js.UndefOr[String]
  }

  object AvailabilityZoneDetail {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined
    ): AvailabilityZoneDetail = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailabilityZoneDetail]
    }
  }

  /** <p/>
    */
  @js.native
  trait BackendConnectionErrors extends js.Object {
    var ConnectionRefusedCount: js.UndefOr[NullableInteger]
    var HTTPCode4XXCount: js.UndefOr[NullableInteger]
    var HTTPCode5XXCount: js.UndefOr[NullableInteger]
    var OtherCount: js.UndefOr[NullableInteger]
    var TimeoutCount: js.UndefOr[NullableInteger]
    var UnknownHostCount: js.UndefOr[NullableInteger]
  }

  object BackendConnectionErrors {
    @inline
    def apply(
        ConnectionRefusedCount: js.UndefOr[NullableInteger] = js.undefined,
        HTTPCode4XXCount: js.UndefOr[NullableInteger] = js.undefined,
        HTTPCode5XXCount: js.UndefOr[NullableInteger] = js.undefined,
        OtherCount: js.UndefOr[NullableInteger] = js.undefined,
        TimeoutCount: js.UndefOr[NullableInteger] = js.undefined,
        UnknownHostCount: js.UndefOr[NullableInteger] = js.undefined
    ): BackendConnectionErrors = {
      val __obj = js.Dynamic.literal()
      ConnectionRefusedCount.foreach(__v => __obj.updateDynamic("ConnectionRefusedCount")(__v.asInstanceOf[js.Any]))
      HTTPCode4XXCount.foreach(__v => __obj.updateDynamic("HTTPCode4XXCount")(__v.asInstanceOf[js.Any]))
      HTTPCode5XXCount.foreach(__v => __obj.updateDynamic("HTTPCode5XXCount")(__v.asInstanceOf[js.Any]))
      OtherCount.foreach(__v => __obj.updateDynamic("OtherCount")(__v.asInstanceOf[js.Any]))
      TimeoutCount.foreach(__v => __obj.updateDynamic("TimeoutCount")(__v.asInstanceOf[js.Any]))
      UnknownHostCount.foreach(__v => __obj.updateDynamic("UnknownHostCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackendConnectionErrors]
    }
  }

  @js.native
  trait BatchGetTracesRequest extends js.Object {
    var TraceIds: TraceIdList
    var NextToken: js.UndefOr[String]
  }

  object BatchGetTracesRequest {
    @inline
    def apply(
        TraceIds: TraceIdList,
        NextToken: js.UndefOr[String] = js.undefined
    ): BatchGetTracesRequest = {
      val __obj = js.Dynamic.literal(
        "TraceIds" -> TraceIds.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetTracesRequest]
    }
  }

  @js.native
  trait BatchGetTracesResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Traces: js.UndefOr[TraceList]
    var UnprocessedTraceIds: js.UndefOr[UnprocessedTraceIdList]
  }

  object BatchGetTracesResult {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Traces: js.UndefOr[TraceList] = js.undefined,
        UnprocessedTraceIds: js.UndefOr[UnprocessedTraceIdList] = js.undefined
    ): BatchGetTracesResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Traces.foreach(__v => __obj.updateDynamic("Traces")(__v.asInstanceOf[js.Any]))
      UnprocessedTraceIds.foreach(__v => __obj.updateDynamic("UnprocessedTraceIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetTracesResult]
    }
  }

  @js.native
  trait CreateGroupRequest extends js.Object {
    var GroupName: GroupName
    var FilterExpression: js.UndefOr[FilterExpression]
    var InsightsConfiguration: js.UndefOr[InsightsConfiguration]
    var Tags: js.UndefOr[TagList]
  }

  object CreateGroupRequest {
    @inline
    def apply(
        GroupName: GroupName,
        FilterExpression: js.UndefOr[FilterExpression] = js.undefined,
        InsightsConfiguration: js.UndefOr[InsightsConfiguration] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupName" -> GroupName.asInstanceOf[js.Any]
      )

      FilterExpression.foreach(__v => __obj.updateDynamic("FilterExpression")(__v.asInstanceOf[js.Any]))
      InsightsConfiguration.foreach(__v => __obj.updateDynamic("InsightsConfiguration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupRequest]
    }
  }

  @js.native
  trait CreateGroupResult extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object CreateGroupResult {
    @inline
    def apply(
        Group: js.UndefOr[Group] = js.undefined
    ): CreateGroupResult = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupResult]
    }
  }

  @js.native
  trait CreateSamplingRuleRequest extends js.Object {
    var SamplingRule: SamplingRule
    var Tags: js.UndefOr[TagList]
  }

  object CreateSamplingRuleRequest {
    @inline
    def apply(
        SamplingRule: SamplingRule,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateSamplingRuleRequest = {
      val __obj = js.Dynamic.literal(
        "SamplingRule" -> SamplingRule.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSamplingRuleRequest]
    }
  }

  @js.native
  trait CreateSamplingRuleResult extends js.Object {
    var SamplingRuleRecord: js.UndefOr[SamplingRuleRecord]
  }

  object CreateSamplingRuleResult {
    @inline
    def apply(
        SamplingRuleRecord: js.UndefOr[SamplingRuleRecord] = js.undefined
    ): CreateSamplingRuleResult = {
      val __obj = js.Dynamic.literal()
      SamplingRuleRecord.foreach(__v => __obj.updateDynamic("SamplingRuleRecord")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSamplingRuleResult]
    }
  }

  @js.native
  trait DeleteGroupRequest extends js.Object {
    var GroupARN: js.UndefOr[GroupARN]
    var GroupName: js.UndefOr[GroupName]
  }

  object DeleteGroupRequest {
    @inline
    def apply(
        GroupARN: js.UndefOr[GroupARN] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined
    ): DeleteGroupRequest = {
      val __obj = js.Dynamic.literal()
      GroupARN.foreach(__v => __obj.updateDynamic("GroupARN")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGroupRequest]
    }
  }

  @js.native
  trait DeleteGroupResult extends js.Object

  object DeleteGroupResult {
    @inline
    def apply(): DeleteGroupResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteGroupResult]
    }
  }

  @js.native
  trait DeleteSamplingRuleRequest extends js.Object {
    var RuleARN: js.UndefOr[String]
    var RuleName: js.UndefOr[String]
  }

  object DeleteSamplingRuleRequest {
    @inline
    def apply(
        RuleARN: js.UndefOr[String] = js.undefined,
        RuleName: js.UndefOr[String] = js.undefined
    ): DeleteSamplingRuleRequest = {
      val __obj = js.Dynamic.literal()
      RuleARN.foreach(__v => __obj.updateDynamic("RuleARN")(__v.asInstanceOf[js.Any]))
      RuleName.foreach(__v => __obj.updateDynamic("RuleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSamplingRuleRequest]
    }
  }

  @js.native
  trait DeleteSamplingRuleResult extends js.Object {
    var SamplingRuleRecord: js.UndefOr[SamplingRuleRecord]
  }

  object DeleteSamplingRuleResult {
    @inline
    def apply(
        SamplingRuleRecord: js.UndefOr[SamplingRuleRecord] = js.undefined
    ): DeleteSamplingRuleResult = {
      val __obj = js.Dynamic.literal()
      SamplingRuleRecord.foreach(__v => __obj.updateDynamic("SamplingRuleRecord")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSamplingRuleResult]
    }
  }

  /** Information about a connection between two services.
    */
  @js.native
  trait Edge extends js.Object {
    var Aliases: js.UndefOr[AliasList]
    var EndTime: js.UndefOr[Timestamp]
    var ReferenceId: js.UndefOr[NullableInteger]
    var ResponseTimeHistogram: js.UndefOr[Histogram]
    var StartTime: js.UndefOr[Timestamp]
    var SummaryStatistics: js.UndefOr[EdgeStatistics]
  }

  object Edge {
    @inline
    def apply(
        Aliases: js.UndefOr[AliasList] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        ReferenceId: js.UndefOr[NullableInteger] = js.undefined,
        ResponseTimeHistogram: js.UndefOr[Histogram] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        SummaryStatistics: js.UndefOr[EdgeStatistics] = js.undefined
    ): Edge = {
      val __obj = js.Dynamic.literal()
      Aliases.foreach(__v => __obj.updateDynamic("Aliases")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      ReferenceId.foreach(__v => __obj.updateDynamic("ReferenceId")(__v.asInstanceOf[js.Any]))
      ResponseTimeHistogram.foreach(__v => __obj.updateDynamic("ResponseTimeHistogram")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      SummaryStatistics.foreach(__v => __obj.updateDynamic("SummaryStatistics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Edge]
    }
  }

  /** Response statistics for an edge.
    */
  @js.native
  trait EdgeStatistics extends js.Object {
    var ErrorStatistics: js.UndefOr[ErrorStatistics]
    var FaultStatistics: js.UndefOr[FaultStatistics]
    var OkCount: js.UndefOr[NullableLong]
    var TotalCount: js.UndefOr[NullableLong]
    var TotalResponseTime: js.UndefOr[NullableDouble]
  }

  object EdgeStatistics {
    @inline
    def apply(
        ErrorStatistics: js.UndefOr[ErrorStatistics] = js.undefined,
        FaultStatistics: js.UndefOr[FaultStatistics] = js.undefined,
        OkCount: js.UndefOr[NullableLong] = js.undefined,
        TotalCount: js.UndefOr[NullableLong] = js.undefined,
        TotalResponseTime: js.UndefOr[NullableDouble] = js.undefined
    ): EdgeStatistics = {
      val __obj = js.Dynamic.literal()
      ErrorStatistics.foreach(__v => __obj.updateDynamic("ErrorStatistics")(__v.asInstanceOf[js.Any]))
      FaultStatistics.foreach(__v => __obj.updateDynamic("FaultStatistics")(__v.asInstanceOf[js.Any]))
      OkCount.foreach(__v => __obj.updateDynamic("OkCount")(__v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.updateDynamic("TotalCount")(__v.asInstanceOf[js.Any]))
      TotalResponseTime.foreach(__v => __obj.updateDynamic("TotalResponseTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EdgeStatistics]
    }
  }

  /** A configuration document that specifies encryption configuration settings.
    */
  @js.native
  trait EncryptionConfig extends js.Object {
    var KeyId: js.UndefOr[String]
    var Status: js.UndefOr[EncryptionStatus]
    var Type: js.UndefOr[EncryptionType]
  }

  object EncryptionConfig {
    @inline
    def apply(
        KeyId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[EncryptionStatus] = js.undefined,
        Type: js.UndefOr[EncryptionType] = js.undefined
    ): EncryptionConfig = {
      val __obj = js.Dynamic.literal()
      KeyId.foreach(__v => __obj.updateDynamic("KeyId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionConfig]
    }
  }

  @js.native
  sealed trait EncryptionStatus extends js.Any
  object EncryptionStatus {
    val UPDATING = "UPDATING".asInstanceOf[EncryptionStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[EncryptionStatus]

    @inline def values = js.Array(UPDATING, ACTIVE)
  }

  @js.native
  sealed trait EncryptionType extends js.Any
  object EncryptionType {
    val NONE = "NONE".asInstanceOf[EncryptionType]
    val KMS = "KMS".asInstanceOf[EncryptionType]

    @inline def values = js.Array(NONE, KMS)
  }

  /** The root cause of a trace summary error.
    */
  @js.native
  trait ErrorRootCause extends js.Object {
    var ClientImpacting: js.UndefOr[NullableBoolean]
    var Services: js.UndefOr[ErrorRootCauseServices]
  }

  object ErrorRootCause {
    @inline
    def apply(
        ClientImpacting: js.UndefOr[NullableBoolean] = js.undefined,
        Services: js.UndefOr[ErrorRootCauseServices] = js.undefined
    ): ErrorRootCause = {
      val __obj = js.Dynamic.literal()
      ClientImpacting.foreach(__v => __obj.updateDynamic("ClientImpacting")(__v.asInstanceOf[js.Any]))
      Services.foreach(__v => __obj.updateDynamic("Services")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorRootCause]
    }
  }

  /** A collection of segments and corresponding subsegments associated to a trace summary error.
    */
  @js.native
  trait ErrorRootCauseEntity extends js.Object {
    var Exceptions: js.UndefOr[RootCauseExceptions]
    var Name: js.UndefOr[String]
    var Remote: js.UndefOr[NullableBoolean]
  }

  object ErrorRootCauseEntity {
    @inline
    def apply(
        Exceptions: js.UndefOr[RootCauseExceptions] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Remote: js.UndefOr[NullableBoolean] = js.undefined
    ): ErrorRootCauseEntity = {
      val __obj = js.Dynamic.literal()
      Exceptions.foreach(__v => __obj.updateDynamic("Exceptions")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Remote.foreach(__v => __obj.updateDynamic("Remote")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorRootCauseEntity]
    }
  }

  /** A collection of fields identifying the services in a trace summary error.
    */
  @js.native
  trait ErrorRootCauseService extends js.Object {
    var AccountId: js.UndefOr[String]
    var EntityPath: js.UndefOr[ErrorRootCauseEntityPath]
    var Inferred: js.UndefOr[NullableBoolean]
    var Name: js.UndefOr[String]
    var Names: js.UndefOr[ServiceNames]
    var Type: js.UndefOr[String]
  }

  object ErrorRootCauseService {
    @inline
    def apply(
        AccountId: js.UndefOr[String] = js.undefined,
        EntityPath: js.UndefOr[ErrorRootCauseEntityPath] = js.undefined,
        Inferred: js.UndefOr[NullableBoolean] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Names: js.UndefOr[ServiceNames] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): ErrorRootCauseService = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      EntityPath.foreach(__v => __obj.updateDynamic("EntityPath")(__v.asInstanceOf[js.Any]))
      Inferred.foreach(__v => __obj.updateDynamic("Inferred")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorRootCauseService]
    }
  }

  /** Information about requests that failed with a 4xx Client Error status code.
    */
  @js.native
  trait ErrorStatistics extends js.Object {
    var OtherCount: js.UndefOr[NullableLong]
    var ThrottleCount: js.UndefOr[NullableLong]
    var TotalCount: js.UndefOr[NullableLong]
  }

  object ErrorStatistics {
    @inline
    def apply(
        OtherCount: js.UndefOr[NullableLong] = js.undefined,
        ThrottleCount: js.UndefOr[NullableLong] = js.undefined,
        TotalCount: js.UndefOr[NullableLong] = js.undefined
    ): ErrorStatistics = {
      val __obj = js.Dynamic.literal()
      OtherCount.foreach(__v => __obj.updateDynamic("OtherCount")(__v.asInstanceOf[js.Any]))
      ThrottleCount.foreach(__v => __obj.updateDynamic("ThrottleCount")(__v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.updateDynamic("TotalCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorStatistics]
    }
  }

  /** The root cause information for a trace summary fault.
    */
  @js.native
  trait FaultRootCause extends js.Object {
    var ClientImpacting: js.UndefOr[NullableBoolean]
    var Services: js.UndefOr[FaultRootCauseServices]
  }

  object FaultRootCause {
    @inline
    def apply(
        ClientImpacting: js.UndefOr[NullableBoolean] = js.undefined,
        Services: js.UndefOr[FaultRootCauseServices] = js.undefined
    ): FaultRootCause = {
      val __obj = js.Dynamic.literal()
      ClientImpacting.foreach(__v => __obj.updateDynamic("ClientImpacting")(__v.asInstanceOf[js.Any]))
      Services.foreach(__v => __obj.updateDynamic("Services")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FaultRootCause]
    }
  }

  /** A collection of segments and corresponding subsegments associated to a trace summary fault error.
    */
  @js.native
  trait FaultRootCauseEntity extends js.Object {
    var Exceptions: js.UndefOr[RootCauseExceptions]
    var Name: js.UndefOr[String]
    var Remote: js.UndefOr[NullableBoolean]
  }

  object FaultRootCauseEntity {
    @inline
    def apply(
        Exceptions: js.UndefOr[RootCauseExceptions] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Remote: js.UndefOr[NullableBoolean] = js.undefined
    ): FaultRootCauseEntity = {
      val __obj = js.Dynamic.literal()
      Exceptions.foreach(__v => __obj.updateDynamic("Exceptions")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Remote.foreach(__v => __obj.updateDynamic("Remote")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FaultRootCauseEntity]
    }
  }

  /** A collection of fields identifying the services in a trace summary fault.
    */
  @js.native
  trait FaultRootCauseService extends js.Object {
    var AccountId: js.UndefOr[String]
    var EntityPath: js.UndefOr[FaultRootCauseEntityPath]
    var Inferred: js.UndefOr[NullableBoolean]
    var Name: js.UndefOr[String]
    var Names: js.UndefOr[ServiceNames]
    var Type: js.UndefOr[String]
  }

  object FaultRootCauseService {
    @inline
    def apply(
        AccountId: js.UndefOr[String] = js.undefined,
        EntityPath: js.UndefOr[FaultRootCauseEntityPath] = js.undefined,
        Inferred: js.UndefOr[NullableBoolean] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Names: js.UndefOr[ServiceNames] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): FaultRootCauseService = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      EntityPath.foreach(__v => __obj.updateDynamic("EntityPath")(__v.asInstanceOf[js.Any]))
      Inferred.foreach(__v => __obj.updateDynamic("Inferred")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FaultRootCauseService]
    }
  }

  /** Information about requests that failed with a 5xx Server Error status code.
    */
  @js.native
  trait FaultStatistics extends js.Object {
    var OtherCount: js.UndefOr[NullableLong]
    var TotalCount: js.UndefOr[NullableLong]
  }

  object FaultStatistics {
    @inline
    def apply(
        OtherCount: js.UndefOr[NullableLong] = js.undefined,
        TotalCount: js.UndefOr[NullableLong] = js.undefined
    ): FaultStatistics = {
      val __obj = js.Dynamic.literal()
      OtherCount.foreach(__v => __obj.updateDynamic("OtherCount")(__v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.updateDynamic("TotalCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FaultStatistics]
    }
  }

  /** The predicted high and low fault count. This is used to determine if a service has become anomalous and if an insight should be created.
    */
  @js.native
  trait ForecastStatistics extends js.Object {
    var FaultCountHigh: js.UndefOr[NullableLong]
    var FaultCountLow: js.UndefOr[NullableLong]
  }

  object ForecastStatistics {
    @inline
    def apply(
        FaultCountHigh: js.UndefOr[NullableLong] = js.undefined,
        FaultCountLow: js.UndefOr[NullableLong] = js.undefined
    ): ForecastStatistics = {
      val __obj = js.Dynamic.literal()
      FaultCountHigh.foreach(__v => __obj.updateDynamic("FaultCountHigh")(__v.asInstanceOf[js.Any]))
      FaultCountLow.foreach(__v => __obj.updateDynamic("FaultCountLow")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ForecastStatistics]
    }
  }

  @js.native
  trait GetEncryptionConfigRequest extends js.Object

  object GetEncryptionConfigRequest {
    @inline
    def apply(): GetEncryptionConfigRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetEncryptionConfigRequest]
    }
  }

  @js.native
  trait GetEncryptionConfigResult extends js.Object {
    var EncryptionConfig: js.UndefOr[EncryptionConfig]
  }

  object GetEncryptionConfigResult {
    @inline
    def apply(
        EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined
    ): GetEncryptionConfigResult = {
      val __obj = js.Dynamic.literal()
      EncryptionConfig.foreach(__v => __obj.updateDynamic("EncryptionConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEncryptionConfigResult]
    }
  }

  @js.native
  trait GetGroupRequest extends js.Object {
    var GroupARN: js.UndefOr[GroupARN]
    var GroupName: js.UndefOr[GroupName]
  }

  object GetGroupRequest {
    @inline
    def apply(
        GroupARN: js.UndefOr[GroupARN] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined
    ): GetGroupRequest = {
      val __obj = js.Dynamic.literal()
      GroupARN.foreach(__v => __obj.updateDynamic("GroupARN")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupRequest]
    }
  }

  @js.native
  trait GetGroupResult extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object GetGroupResult {
    @inline
    def apply(
        Group: js.UndefOr[Group] = js.undefined
    ): GetGroupResult = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupResult]
    }
  }

  @js.native
  trait GetGroupsRequest extends js.Object {
    var NextToken: js.UndefOr[GetGroupsNextToken]
  }

  object GetGroupsRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[GetGroupsNextToken] = js.undefined
    ): GetGroupsRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupsRequest]
    }
  }

  @js.native
  trait GetGroupsResult extends js.Object {
    var Groups: js.UndefOr[GroupSummaryList]
    var NextToken: js.UndefOr[String]
  }

  object GetGroupsResult {
    @inline
    def apply(
        Groups: js.UndefOr[GroupSummaryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): GetGroupsResult = {
      val __obj = js.Dynamic.literal()
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupsResult]
    }
  }

  @js.native
  trait GetInsightEventsRequest extends js.Object {
    var InsightId: InsightId
    var MaxResults: js.UndefOr[GetInsightEventsMaxResults]
    var NextToken: js.UndefOr[Token]
  }

  object GetInsightEventsRequest {
    @inline
    def apply(
        InsightId: InsightId,
        MaxResults: js.UndefOr[GetInsightEventsMaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetInsightEventsRequest = {
      val __obj = js.Dynamic.literal(
        "InsightId" -> InsightId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInsightEventsRequest]
    }
  }

  @js.native
  trait GetInsightEventsResult extends js.Object {
    var InsightEvents: js.UndefOr[InsightEventList]
    var NextToken: js.UndefOr[Token]
  }

  object GetInsightEventsResult {
    @inline
    def apply(
        InsightEvents: js.UndefOr[InsightEventList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetInsightEventsResult = {
      val __obj = js.Dynamic.literal()
      InsightEvents.foreach(__v => __obj.updateDynamic("InsightEvents")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInsightEventsResult]
    }
  }

  @js.native
  trait GetInsightImpactGraphRequest extends js.Object {
    var EndTime: Timestamp
    var InsightId: InsightId
    var StartTime: Timestamp
    var NextToken: js.UndefOr[Token]
  }

  object GetInsightImpactGraphRequest {
    @inline
    def apply(
        EndTime: Timestamp,
        InsightId: InsightId,
        StartTime: Timestamp,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetInsightImpactGraphRequest = {
      val __obj = js.Dynamic.literal(
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "InsightId" -> InsightId.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInsightImpactGraphRequest]
    }
  }

  @js.native
  trait GetInsightImpactGraphResult extends js.Object {
    var EndTime: js.UndefOr[Timestamp]
    var InsightId: js.UndefOr[InsightId]
    var NextToken: js.UndefOr[Token]
    var ServiceGraphEndTime: js.UndefOr[Timestamp]
    var ServiceGraphStartTime: js.UndefOr[Timestamp]
    var Services: js.UndefOr[InsightImpactGraphServiceList]
    var StartTime: js.UndefOr[Timestamp]
  }

  object GetInsightImpactGraphResult {
    @inline
    def apply(
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        InsightId: js.UndefOr[InsightId] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        ServiceGraphEndTime: js.UndefOr[Timestamp] = js.undefined,
        ServiceGraphStartTime: js.UndefOr[Timestamp] = js.undefined,
        Services: js.UndefOr[InsightImpactGraphServiceList] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined
    ): GetInsightImpactGraphResult = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      InsightId.foreach(__v => __obj.updateDynamic("InsightId")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ServiceGraphEndTime.foreach(__v => __obj.updateDynamic("ServiceGraphEndTime")(__v.asInstanceOf[js.Any]))
      ServiceGraphStartTime.foreach(__v => __obj.updateDynamic("ServiceGraphStartTime")(__v.asInstanceOf[js.Any]))
      Services.foreach(__v => __obj.updateDynamic("Services")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInsightImpactGraphResult]
    }
  }

  @js.native
  trait GetInsightRequest extends js.Object {
    var InsightId: InsightId
  }

  object GetInsightRequest {
    @inline
    def apply(
        InsightId: InsightId
    ): GetInsightRequest = {
      val __obj = js.Dynamic.literal(
        "InsightId" -> InsightId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetInsightRequest]
    }
  }

  @js.native
  trait GetInsightResult extends js.Object {
    var Insight: js.UndefOr[Insight]
  }

  object GetInsightResult {
    @inline
    def apply(
        Insight: js.UndefOr[Insight] = js.undefined
    ): GetInsightResult = {
      val __obj = js.Dynamic.literal()
      Insight.foreach(__v => __obj.updateDynamic("Insight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInsightResult]
    }
  }

  @js.native
  trait GetInsightSummariesRequest extends js.Object {
    var EndTime: Timestamp
    var StartTime: Timestamp
    var GroupARN: js.UndefOr[GroupARN]
    var GroupName: js.UndefOr[GroupName]
    var MaxResults: js.UndefOr[GetInsightSummariesMaxResults]
    var NextToken: js.UndefOr[Token]
    var States: js.UndefOr[InsightStateList]
  }

  object GetInsightSummariesRequest {
    @inline
    def apply(
        EndTime: Timestamp,
        StartTime: Timestamp,
        GroupARN: js.UndefOr[GroupARN] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined,
        MaxResults: js.UndefOr[GetInsightSummariesMaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        States: js.UndefOr[InsightStateList] = js.undefined
    ): GetInsightSummariesRequest = {
      val __obj = js.Dynamic.literal(
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      GroupARN.foreach(__v => __obj.updateDynamic("GroupARN")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      States.foreach(__v => __obj.updateDynamic("States")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInsightSummariesRequest]
    }
  }

  @js.native
  trait GetInsightSummariesResult extends js.Object {
    var InsightSummaries: js.UndefOr[InsightSummaryList]
    var NextToken: js.UndefOr[Token]
  }

  object GetInsightSummariesResult {
    @inline
    def apply(
        InsightSummaries: js.UndefOr[InsightSummaryList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetInsightSummariesResult = {
      val __obj = js.Dynamic.literal()
      InsightSummaries.foreach(__v => __obj.updateDynamic("InsightSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInsightSummariesResult]
    }
  }

  @js.native
  trait GetSamplingRulesRequest extends js.Object {
    var NextToken: js.UndefOr[String]
  }

  object GetSamplingRulesRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined
    ): GetSamplingRulesRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSamplingRulesRequest]
    }
  }

  @js.native
  trait GetSamplingRulesResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var SamplingRuleRecords: js.UndefOr[SamplingRuleRecordList]
  }

  object GetSamplingRulesResult {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        SamplingRuleRecords: js.UndefOr[SamplingRuleRecordList] = js.undefined
    ): GetSamplingRulesResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SamplingRuleRecords.foreach(__v => __obj.updateDynamic("SamplingRuleRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSamplingRulesResult]
    }
  }

  @js.native
  trait GetSamplingStatisticSummariesRequest extends js.Object {
    var NextToken: js.UndefOr[String]
  }

  object GetSamplingStatisticSummariesRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined
    ): GetSamplingStatisticSummariesRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSamplingStatisticSummariesRequest]
    }
  }

  @js.native
  trait GetSamplingStatisticSummariesResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var SamplingStatisticSummaries: js.UndefOr[SamplingStatisticSummaryList]
  }

  object GetSamplingStatisticSummariesResult {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        SamplingStatisticSummaries: js.UndefOr[SamplingStatisticSummaryList] = js.undefined
    ): GetSamplingStatisticSummariesResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SamplingStatisticSummaries.foreach(__v => __obj.updateDynamic("SamplingStatisticSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSamplingStatisticSummariesResult]
    }
  }

  @js.native
  trait GetSamplingTargetsRequest extends js.Object {
    var SamplingStatisticsDocuments: SamplingStatisticsDocumentList
  }

  object GetSamplingTargetsRequest {
    @inline
    def apply(
        SamplingStatisticsDocuments: SamplingStatisticsDocumentList
    ): GetSamplingTargetsRequest = {
      val __obj = js.Dynamic.literal(
        "SamplingStatisticsDocuments" -> SamplingStatisticsDocuments.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSamplingTargetsRequest]
    }
  }

  @js.native
  trait GetSamplingTargetsResult extends js.Object {
    var LastRuleModification: js.UndefOr[Timestamp]
    var SamplingTargetDocuments: js.UndefOr[SamplingTargetDocumentList]
    var UnprocessedStatistics: js.UndefOr[UnprocessedStatisticsList]
  }

  object GetSamplingTargetsResult {
    @inline
    def apply(
        LastRuleModification: js.UndefOr[Timestamp] = js.undefined,
        SamplingTargetDocuments: js.UndefOr[SamplingTargetDocumentList] = js.undefined,
        UnprocessedStatistics: js.UndefOr[UnprocessedStatisticsList] = js.undefined
    ): GetSamplingTargetsResult = {
      val __obj = js.Dynamic.literal()
      LastRuleModification.foreach(__v => __obj.updateDynamic("LastRuleModification")(__v.asInstanceOf[js.Any]))
      SamplingTargetDocuments.foreach(__v => __obj.updateDynamic("SamplingTargetDocuments")(__v.asInstanceOf[js.Any]))
      UnprocessedStatistics.foreach(__v => __obj.updateDynamic("UnprocessedStatistics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSamplingTargetsResult]
    }
  }

  @js.native
  trait GetServiceGraphRequest extends js.Object {
    var EndTime: Timestamp
    var StartTime: Timestamp
    var GroupARN: js.UndefOr[GroupARN]
    var GroupName: js.UndefOr[GroupName]
    var NextToken: js.UndefOr[String]
  }

  object GetServiceGraphRequest {
    @inline
    def apply(
        EndTime: Timestamp,
        StartTime: Timestamp,
        GroupARN: js.UndefOr[GroupARN] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): GetServiceGraphRequest = {
      val __obj = js.Dynamic.literal(
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      GroupARN.foreach(__v => __obj.updateDynamic("GroupARN")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceGraphRequest]
    }
  }

  @js.native
  trait GetServiceGraphResult extends js.Object {
    var ContainsOldGroupVersions: js.UndefOr[Boolean]
    var EndTime: js.UndefOr[Timestamp]
    var NextToken: js.UndefOr[String]
    var Services: js.UndefOr[ServiceList]
    var StartTime: js.UndefOr[Timestamp]
  }

  object GetServiceGraphResult {
    @inline
    def apply(
        ContainsOldGroupVersions: js.UndefOr[Boolean] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        Services: js.UndefOr[ServiceList] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined
    ): GetServiceGraphResult = {
      val __obj = js.Dynamic.literal()
      ContainsOldGroupVersions.foreach(__v => __obj.updateDynamic("ContainsOldGroupVersions")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Services.foreach(__v => __obj.updateDynamic("Services")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceGraphResult]
    }
  }

  @js.native
  trait GetTimeSeriesServiceStatisticsRequest extends js.Object {
    var EndTime: Timestamp
    var StartTime: Timestamp
    var EntitySelectorExpression: js.UndefOr[EntitySelectorExpression]
    var ForecastStatistics: js.UndefOr[NullableBoolean]
    var GroupARN: js.UndefOr[GroupARN]
    var GroupName: js.UndefOr[GroupName]
    var NextToken: js.UndefOr[String]
    var Period: js.UndefOr[NullableInteger]
  }

  object GetTimeSeriesServiceStatisticsRequest {
    @inline
    def apply(
        EndTime: Timestamp,
        StartTime: Timestamp,
        EntitySelectorExpression: js.UndefOr[EntitySelectorExpression] = js.undefined,
        ForecastStatistics: js.UndefOr[NullableBoolean] = js.undefined,
        GroupARN: js.UndefOr[GroupARN] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        Period: js.UndefOr[NullableInteger] = js.undefined
    ): GetTimeSeriesServiceStatisticsRequest = {
      val __obj = js.Dynamic.literal(
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      EntitySelectorExpression.foreach(__v => __obj.updateDynamic("EntitySelectorExpression")(__v.asInstanceOf[js.Any]))
      ForecastStatistics.foreach(__v => __obj.updateDynamic("ForecastStatistics")(__v.asInstanceOf[js.Any]))
      GroupARN.foreach(__v => __obj.updateDynamic("GroupARN")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Period.foreach(__v => __obj.updateDynamic("Period")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTimeSeriesServiceStatisticsRequest]
    }
  }

  @js.native
  trait GetTimeSeriesServiceStatisticsResult extends js.Object {
    var ContainsOldGroupVersions: js.UndefOr[Boolean]
    var NextToken: js.UndefOr[String]
    var TimeSeriesServiceStatistics: js.UndefOr[TimeSeriesServiceStatisticsList]
  }

  object GetTimeSeriesServiceStatisticsResult {
    @inline
    def apply(
        ContainsOldGroupVersions: js.UndefOr[Boolean] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        TimeSeriesServiceStatistics: js.UndefOr[TimeSeriesServiceStatisticsList] = js.undefined
    ): GetTimeSeriesServiceStatisticsResult = {
      val __obj = js.Dynamic.literal()
      ContainsOldGroupVersions.foreach(__v => __obj.updateDynamic("ContainsOldGroupVersions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TimeSeriesServiceStatistics.foreach(__v => __obj.updateDynamic("TimeSeriesServiceStatistics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTimeSeriesServiceStatisticsResult]
    }
  }

  @js.native
  trait GetTraceGraphRequest extends js.Object {
    var TraceIds: TraceIdList
    var NextToken: js.UndefOr[String]
  }

  object GetTraceGraphRequest {
    @inline
    def apply(
        TraceIds: TraceIdList,
        NextToken: js.UndefOr[String] = js.undefined
    ): GetTraceGraphRequest = {
      val __obj = js.Dynamic.literal(
        "TraceIds" -> TraceIds.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTraceGraphRequest]
    }
  }

  @js.native
  trait GetTraceGraphResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Services: js.UndefOr[ServiceList]
  }

  object GetTraceGraphResult {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Services: js.UndefOr[ServiceList] = js.undefined
    ): GetTraceGraphResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Services.foreach(__v => __obj.updateDynamic("Services")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTraceGraphResult]
    }
  }

  @js.native
  trait GetTraceSummariesRequest extends js.Object {
    var EndTime: Timestamp
    var StartTime: Timestamp
    var FilterExpression: js.UndefOr[FilterExpression]
    var NextToken: js.UndefOr[String]
    var Sampling: js.UndefOr[NullableBoolean]
    var SamplingStrategy: js.UndefOr[SamplingStrategy]
    var TimeRangeType: js.UndefOr[TimeRangeType]
  }

  object GetTraceSummariesRequest {
    @inline
    def apply(
        EndTime: Timestamp,
        StartTime: Timestamp,
        FilterExpression: js.UndefOr[FilterExpression] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        Sampling: js.UndefOr[NullableBoolean] = js.undefined,
        SamplingStrategy: js.UndefOr[SamplingStrategy] = js.undefined,
        TimeRangeType: js.UndefOr[TimeRangeType] = js.undefined
    ): GetTraceSummariesRequest = {
      val __obj = js.Dynamic.literal(
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      FilterExpression.foreach(__v => __obj.updateDynamic("FilterExpression")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Sampling.foreach(__v => __obj.updateDynamic("Sampling")(__v.asInstanceOf[js.Any]))
      SamplingStrategy.foreach(__v => __obj.updateDynamic("SamplingStrategy")(__v.asInstanceOf[js.Any]))
      TimeRangeType.foreach(__v => __obj.updateDynamic("TimeRangeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTraceSummariesRequest]
    }
  }

  @js.native
  trait GetTraceSummariesResult extends js.Object {
    var ApproximateTime: js.UndefOr[Timestamp]
    var NextToken: js.UndefOr[String]
    var TraceSummaries: js.UndefOr[TraceSummaryList]
    var TracesProcessedCount: js.UndefOr[NullableLong]
  }

  object GetTraceSummariesResult {
    @inline
    def apply(
        ApproximateTime: js.UndefOr[Timestamp] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        TraceSummaries: js.UndefOr[TraceSummaryList] = js.undefined,
        TracesProcessedCount: js.UndefOr[NullableLong] = js.undefined
    ): GetTraceSummariesResult = {
      val __obj = js.Dynamic.literal()
      ApproximateTime.foreach(__v => __obj.updateDynamic("ApproximateTime")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TraceSummaries.foreach(__v => __obj.updateDynamic("TraceSummaries")(__v.asInstanceOf[js.Any]))
      TracesProcessedCount.foreach(__v => __obj.updateDynamic("TracesProcessedCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTraceSummariesResult]
    }
  }

  /** Details and metadata for a group.
    */
  @js.native
  trait Group extends js.Object {
    var FilterExpression: js.UndefOr[String]
    var GroupARN: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
    var InsightsConfiguration: js.UndefOr[InsightsConfiguration]
  }

  object Group {
    @inline
    def apply(
        FilterExpression: js.UndefOr[String] = js.undefined,
        GroupARN: js.UndefOr[String] = js.undefined,
        GroupName: js.UndefOr[String] = js.undefined,
        InsightsConfiguration: js.UndefOr[InsightsConfiguration] = js.undefined
    ): Group = {
      val __obj = js.Dynamic.literal()
      FilterExpression.foreach(__v => __obj.updateDynamic("FilterExpression")(__v.asInstanceOf[js.Any]))
      GroupARN.foreach(__v => __obj.updateDynamic("GroupARN")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      InsightsConfiguration.foreach(__v => __obj.updateDynamic("InsightsConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Group]
    }
  }

  /** Details for a group without metadata.
    */
  @js.native
  trait GroupSummary extends js.Object {
    var FilterExpression: js.UndefOr[String]
    var GroupARN: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
    var InsightsConfiguration: js.UndefOr[InsightsConfiguration]
  }

  object GroupSummary {
    @inline
    def apply(
        FilterExpression: js.UndefOr[String] = js.undefined,
        GroupARN: js.UndefOr[String] = js.undefined,
        GroupName: js.UndefOr[String] = js.undefined,
        InsightsConfiguration: js.UndefOr[InsightsConfiguration] = js.undefined
    ): GroupSummary = {
      val __obj = js.Dynamic.literal()
      FilterExpression.foreach(__v => __obj.updateDynamic("FilterExpression")(__v.asInstanceOf[js.Any]))
      GroupARN.foreach(__v => __obj.updateDynamic("GroupARN")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      InsightsConfiguration.foreach(__v => __obj.updateDynamic("InsightsConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupSummary]
    }
  }

  /** An entry in a histogram for a statistic. A histogram maps the range of observed values on the X axis, and the prevalence of each value on the Y axis.
    */
  @js.native
  trait HistogramEntry extends js.Object {
    var Count: js.UndefOr[Int]
    var Value: js.UndefOr[Double]
  }

  object HistogramEntry {
    @inline
    def apply(
        Count: js.UndefOr[Int] = js.undefined,
        Value: js.UndefOr[Double] = js.undefined
    ): HistogramEntry = {
      val __obj = js.Dynamic.literal()
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HistogramEntry]
    }
  }

  /** Information about an HTTP request.
    */
  @js.native
  trait Http extends js.Object {
    var ClientIp: js.UndefOr[String]
    var HttpMethod: js.UndefOr[String]
    var HttpStatus: js.UndefOr[NullableInteger]
    var HttpURL: js.UndefOr[String]
    var UserAgent: js.UndefOr[String]
  }

  object Http {
    @inline
    def apply(
        ClientIp: js.UndefOr[String] = js.undefined,
        HttpMethod: js.UndefOr[String] = js.undefined,
        HttpStatus: js.UndefOr[NullableInteger] = js.undefined,
        HttpURL: js.UndefOr[String] = js.undefined,
        UserAgent: js.UndefOr[String] = js.undefined
    ): Http = {
      val __obj = js.Dynamic.literal()
      ClientIp.foreach(__v => __obj.updateDynamic("ClientIp")(__v.asInstanceOf[js.Any]))
      HttpMethod.foreach(__v => __obj.updateDynamic("HttpMethod")(__v.asInstanceOf[js.Any]))
      HttpStatus.foreach(__v => __obj.updateDynamic("HttpStatus")(__v.asInstanceOf[js.Any]))
      HttpURL.foreach(__v => __obj.updateDynamic("HttpURL")(__v.asInstanceOf[js.Any]))
      UserAgent.foreach(__v => __obj.updateDynamic("UserAgent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Http]
    }
  }

  /** When fault rates go outside of the expected range, X-Ray creates an insight. Insights tracks emergent issues within your applications.
    */
  @js.native
  trait Insight extends js.Object {
    var Categories: js.UndefOr[InsightCategoryList]
    var ClientRequestImpactStatistics: js.UndefOr[RequestImpactStatistics]
    var EndTime: js.UndefOr[Timestamp]
    var GroupARN: js.UndefOr[GroupARN]
    var GroupName: js.UndefOr[GroupName]
    var InsightId: js.UndefOr[InsightId]
    var RootCauseServiceId: js.UndefOr[ServiceId]
    var RootCauseServiceRequestImpactStatistics: js.UndefOr[RequestImpactStatistics]
    var StartTime: js.UndefOr[Timestamp]
    var State: js.UndefOr[InsightState]
    var Summary: js.UndefOr[InsightSummaryText]
    var TopAnomalousServices: js.UndefOr[AnomalousServiceList]
  }

  object Insight {
    @inline
    def apply(
        Categories: js.UndefOr[InsightCategoryList] = js.undefined,
        ClientRequestImpactStatistics: js.UndefOr[RequestImpactStatistics] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        GroupARN: js.UndefOr[GroupARN] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined,
        InsightId: js.UndefOr[InsightId] = js.undefined,
        RootCauseServiceId: js.UndefOr[ServiceId] = js.undefined,
        RootCauseServiceRequestImpactStatistics: js.UndefOr[RequestImpactStatistics] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        State: js.UndefOr[InsightState] = js.undefined,
        Summary: js.UndefOr[InsightSummaryText] = js.undefined,
        TopAnomalousServices: js.UndefOr[AnomalousServiceList] = js.undefined
    ): Insight = {
      val __obj = js.Dynamic.literal()
      Categories.foreach(__v => __obj.updateDynamic("Categories")(__v.asInstanceOf[js.Any]))
      ClientRequestImpactStatistics.foreach(__v => __obj.updateDynamic("ClientRequestImpactStatistics")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      GroupARN.foreach(__v => __obj.updateDynamic("GroupARN")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      InsightId.foreach(__v => __obj.updateDynamic("InsightId")(__v.asInstanceOf[js.Any]))
      RootCauseServiceId.foreach(__v => __obj.updateDynamic("RootCauseServiceId")(__v.asInstanceOf[js.Any]))
      RootCauseServiceRequestImpactStatistics.foreach(__v => __obj.updateDynamic("RootCauseServiceRequestImpactStatistics")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Summary.foreach(__v => __obj.updateDynamic("Summary")(__v.asInstanceOf[js.Any]))
      TopAnomalousServices.foreach(__v => __obj.updateDynamic("TopAnomalousServices")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Insight]
    }
  }

  @js.native
  sealed trait InsightCategory extends js.Any
  object InsightCategory {
    val FAULT = "FAULT".asInstanceOf[InsightCategory]

    @inline def values = js.Array(FAULT)
  }

  /** X-Ray reevaluates insights periodically until they are resolved, and records each intermediate state in an event. You can review incident events in the Impact Timeline on the Inspect page in the X-Ray console.
    */
  @js.native
  trait InsightEvent extends js.Object {
    var ClientRequestImpactStatistics: js.UndefOr[RequestImpactStatistics]
    var EventTime: js.UndefOr[Timestamp]
    var RootCauseServiceRequestImpactStatistics: js.UndefOr[RequestImpactStatistics]
    var Summary: js.UndefOr[EventSummaryText]
    var TopAnomalousServices: js.UndefOr[AnomalousServiceList]
  }

  object InsightEvent {
    @inline
    def apply(
        ClientRequestImpactStatistics: js.UndefOr[RequestImpactStatistics] = js.undefined,
        EventTime: js.UndefOr[Timestamp] = js.undefined,
        RootCauseServiceRequestImpactStatistics: js.UndefOr[RequestImpactStatistics] = js.undefined,
        Summary: js.UndefOr[EventSummaryText] = js.undefined,
        TopAnomalousServices: js.UndefOr[AnomalousServiceList] = js.undefined
    ): InsightEvent = {
      val __obj = js.Dynamic.literal()
      ClientRequestImpactStatistics.foreach(__v => __obj.updateDynamic("ClientRequestImpactStatistics")(__v.asInstanceOf[js.Any]))
      EventTime.foreach(__v => __obj.updateDynamic("EventTime")(__v.asInstanceOf[js.Any]))
      RootCauseServiceRequestImpactStatistics.foreach(__v => __obj.updateDynamic("RootCauseServiceRequestImpactStatistics")(__v.asInstanceOf[js.Any]))
      Summary.foreach(__v => __obj.updateDynamic("Summary")(__v.asInstanceOf[js.Any]))
      TopAnomalousServices.foreach(__v => __obj.updateDynamic("TopAnomalousServices")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InsightEvent]
    }
  }

  /** The connection between two service in an insight impact graph.
    */
  @js.native
  trait InsightImpactGraphEdge extends js.Object {
    var ReferenceId: js.UndefOr[NullableInteger]
  }

  object InsightImpactGraphEdge {
    @inline
    def apply(
        ReferenceId: js.UndefOr[NullableInteger] = js.undefined
    ): InsightImpactGraphEdge = {
      val __obj = js.Dynamic.literal()
      ReferenceId.foreach(__v => __obj.updateDynamic("ReferenceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InsightImpactGraphEdge]
    }
  }

  /** Information about an application that processed requests, users that made requests, or downstream services, resources, and applications that an application used.
    */
  @js.native
  trait InsightImpactGraphService extends js.Object {
    var AccountId: js.UndefOr[String]
    var Edges: js.UndefOr[InsightImpactGraphEdgeList]
    var Name: js.UndefOr[String]
    var Names: js.UndefOr[ServiceNames]
    var ReferenceId: js.UndefOr[NullableInteger]
    var Type: js.UndefOr[String]
  }

  object InsightImpactGraphService {
    @inline
    def apply(
        AccountId: js.UndefOr[String] = js.undefined,
        Edges: js.UndefOr[InsightImpactGraphEdgeList] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Names: js.UndefOr[ServiceNames] = js.undefined,
        ReferenceId: js.UndefOr[NullableInteger] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): InsightImpactGraphService = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Edges.foreach(__v => __obj.updateDynamic("Edges")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      ReferenceId.foreach(__v => __obj.updateDynamic("ReferenceId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InsightImpactGraphService]
    }
  }

  @js.native
  sealed trait InsightState extends js.Any
  object InsightState {
    val ACTIVE = "ACTIVE".asInstanceOf[InsightState]
    val CLOSED = "CLOSED".asInstanceOf[InsightState]

    @inline def values = js.Array(ACTIVE, CLOSED)
  }

  /** Information that describes an insight.
    */
  @js.native
  trait InsightSummary extends js.Object {
    var Categories: js.UndefOr[InsightCategoryList]
    var ClientRequestImpactStatistics: js.UndefOr[RequestImpactStatistics]
    var EndTime: js.UndefOr[Timestamp]
    var GroupARN: js.UndefOr[GroupARN]
    var GroupName: js.UndefOr[GroupName]
    var InsightId: js.UndefOr[InsightId]
    var LastUpdateTime: js.UndefOr[Timestamp]
    var RootCauseServiceId: js.UndefOr[ServiceId]
    var RootCauseServiceRequestImpactStatistics: js.UndefOr[RequestImpactStatistics]
    var StartTime: js.UndefOr[Timestamp]
    var State: js.UndefOr[InsightState]
    var Summary: js.UndefOr[InsightSummaryText]
    var TopAnomalousServices: js.UndefOr[AnomalousServiceList]
  }

  object InsightSummary {
    @inline
    def apply(
        Categories: js.UndefOr[InsightCategoryList] = js.undefined,
        ClientRequestImpactStatistics: js.UndefOr[RequestImpactStatistics] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        GroupARN: js.UndefOr[GroupARN] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined,
        InsightId: js.UndefOr[InsightId] = js.undefined,
        LastUpdateTime: js.UndefOr[Timestamp] = js.undefined,
        RootCauseServiceId: js.UndefOr[ServiceId] = js.undefined,
        RootCauseServiceRequestImpactStatistics: js.UndefOr[RequestImpactStatistics] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        State: js.UndefOr[InsightState] = js.undefined,
        Summary: js.UndefOr[InsightSummaryText] = js.undefined,
        TopAnomalousServices: js.UndefOr[AnomalousServiceList] = js.undefined
    ): InsightSummary = {
      val __obj = js.Dynamic.literal()
      Categories.foreach(__v => __obj.updateDynamic("Categories")(__v.asInstanceOf[js.Any]))
      ClientRequestImpactStatistics.foreach(__v => __obj.updateDynamic("ClientRequestImpactStatistics")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      GroupARN.foreach(__v => __obj.updateDynamic("GroupARN")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      InsightId.foreach(__v => __obj.updateDynamic("InsightId")(__v.asInstanceOf[js.Any]))
      LastUpdateTime.foreach(__v => __obj.updateDynamic("LastUpdateTime")(__v.asInstanceOf[js.Any]))
      RootCauseServiceId.foreach(__v => __obj.updateDynamic("RootCauseServiceId")(__v.asInstanceOf[js.Any]))
      RootCauseServiceRequestImpactStatistics.foreach(__v => __obj.updateDynamic("RootCauseServiceRequestImpactStatistics")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Summary.foreach(__v => __obj.updateDynamic("Summary")(__v.asInstanceOf[js.Any]))
      TopAnomalousServices.foreach(__v => __obj.updateDynamic("TopAnomalousServices")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InsightSummary]
    }
  }

  /** The structure containing configurations related to insights.
    */
  @js.native
  trait InsightsConfiguration extends js.Object {
    var InsightsEnabled: js.UndefOr[NullableBoolean]
    var NotificationsEnabled: js.UndefOr[NullableBoolean]
  }

  object InsightsConfiguration {
    @inline
    def apply(
        InsightsEnabled: js.UndefOr[NullableBoolean] = js.undefined,
        NotificationsEnabled: js.UndefOr[NullableBoolean] = js.undefined
    ): InsightsConfiguration = {
      val __obj = js.Dynamic.literal()
      InsightsEnabled.foreach(__v => __obj.updateDynamic("InsightsEnabled")(__v.asInstanceOf[js.Any]))
      NotificationsEnabled.foreach(__v => __obj.updateDynamic("NotificationsEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InsightsConfiguration]
    }
  }

  /** A list of EC2 instance IDs corresponding to the segments in a trace.
    */
  @js.native
  trait InstanceIdDetail extends js.Object {
    var Id: js.UndefOr[String]
  }

  object InstanceIdDetail {
    @inline
    def apply(
        Id: js.UndefOr[String] = js.undefined
    ): InstanceIdDetail = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceIdDetail]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var NextToken: js.UndefOr[String]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait PutEncryptionConfigRequest extends js.Object {
    var Type: EncryptionType
    var KeyId: js.UndefOr[EncryptionKeyId]
  }

  object PutEncryptionConfigRequest {
    @inline
    def apply(
        Type: EncryptionType,
        KeyId: js.UndefOr[EncryptionKeyId] = js.undefined
    ): PutEncryptionConfigRequest = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      KeyId.foreach(__v => __obj.updateDynamic("KeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEncryptionConfigRequest]
    }
  }

  @js.native
  trait PutEncryptionConfigResult extends js.Object {
    var EncryptionConfig: js.UndefOr[EncryptionConfig]
  }

  object PutEncryptionConfigResult {
    @inline
    def apply(
        EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined
    ): PutEncryptionConfigResult = {
      val __obj = js.Dynamic.literal()
      EncryptionConfig.foreach(__v => __obj.updateDynamic("EncryptionConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEncryptionConfigResult]
    }
  }

  @js.native
  trait PutTelemetryRecordsRequest extends js.Object {
    var TelemetryRecords: TelemetryRecordList
    var EC2InstanceId: js.UndefOr[EC2InstanceId]
    var Hostname: js.UndefOr[Hostname]
    var ResourceARN: js.UndefOr[ResourceARN]
  }

  object PutTelemetryRecordsRequest {
    @inline
    def apply(
        TelemetryRecords: TelemetryRecordList,
        EC2InstanceId: js.UndefOr[EC2InstanceId] = js.undefined,
        Hostname: js.UndefOr[Hostname] = js.undefined,
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    ): PutTelemetryRecordsRequest = {
      val __obj = js.Dynamic.literal(
        "TelemetryRecords" -> TelemetryRecords.asInstanceOf[js.Any]
      )

      EC2InstanceId.foreach(__v => __obj.updateDynamic("EC2InstanceId")(__v.asInstanceOf[js.Any]))
      Hostname.foreach(__v => __obj.updateDynamic("Hostname")(__v.asInstanceOf[js.Any]))
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutTelemetryRecordsRequest]
    }
  }

  @js.native
  trait PutTelemetryRecordsResult extends js.Object

  object PutTelemetryRecordsResult {
    @inline
    def apply(): PutTelemetryRecordsResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutTelemetryRecordsResult]
    }
  }

  @js.native
  trait PutTraceSegmentsRequest extends js.Object {
    var TraceSegmentDocuments: TraceSegmentDocumentList
  }

  object PutTraceSegmentsRequest {
    @inline
    def apply(
        TraceSegmentDocuments: TraceSegmentDocumentList
    ): PutTraceSegmentsRequest = {
      val __obj = js.Dynamic.literal(
        "TraceSegmentDocuments" -> TraceSegmentDocuments.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutTraceSegmentsRequest]
    }
  }

  @js.native
  trait PutTraceSegmentsResult extends js.Object {
    var UnprocessedTraceSegments: js.UndefOr[UnprocessedTraceSegmentList]
  }

  object PutTraceSegmentsResult {
    @inline
    def apply(
        UnprocessedTraceSegments: js.UndefOr[UnprocessedTraceSegmentList] = js.undefined
    ): PutTraceSegmentsResult = {
      val __obj = js.Dynamic.literal()
      UnprocessedTraceSegments.foreach(__v => __obj.updateDynamic("UnprocessedTraceSegments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutTraceSegmentsResult]
    }
  }

  /** Statistics that describe how the incident has impacted a service.
    */
  @js.native
  trait RequestImpactStatistics extends js.Object {
    var FaultCount: js.UndefOr[NullableLong]
    var OkCount: js.UndefOr[NullableLong]
    var TotalCount: js.UndefOr[NullableLong]
  }

  object RequestImpactStatistics {
    @inline
    def apply(
        FaultCount: js.UndefOr[NullableLong] = js.undefined,
        OkCount: js.UndefOr[NullableLong] = js.undefined,
        TotalCount: js.UndefOr[NullableLong] = js.undefined
    ): RequestImpactStatistics = {
      val __obj = js.Dynamic.literal()
      FaultCount.foreach(__v => __obj.updateDynamic("FaultCount")(__v.asInstanceOf[js.Any]))
      OkCount.foreach(__v => __obj.updateDynamic("OkCount")(__v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.updateDynamic("TotalCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestImpactStatistics]
    }
  }

  /** A list of resources ARNs corresponding to the segments in a trace.
    */
  @js.native
  trait ResourceARNDetail extends js.Object {
    var ARN: js.UndefOr[String]
  }

  object ResourceARNDetail {
    @inline
    def apply(
        ARN: js.UndefOr[String] = js.undefined
    ): ResourceARNDetail = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceARNDetail]
    }
  }

  /** The root cause information for a response time warning.
    */
  @js.native
  trait ResponseTimeRootCause extends js.Object {
    var ClientImpacting: js.UndefOr[NullableBoolean]
    var Services: js.UndefOr[ResponseTimeRootCauseServices]
  }

  object ResponseTimeRootCause {
    @inline
    def apply(
        ClientImpacting: js.UndefOr[NullableBoolean] = js.undefined,
        Services: js.UndefOr[ResponseTimeRootCauseServices] = js.undefined
    ): ResponseTimeRootCause = {
      val __obj = js.Dynamic.literal()
      ClientImpacting.foreach(__v => __obj.updateDynamic("ClientImpacting")(__v.asInstanceOf[js.Any]))
      Services.foreach(__v => __obj.updateDynamic("Services")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResponseTimeRootCause]
    }
  }

  /** A collection of segments and corresponding subsegments associated to a response time warning.
    */
  @js.native
  trait ResponseTimeRootCauseEntity extends js.Object {
    var Coverage: js.UndefOr[NullableDouble]
    var Name: js.UndefOr[String]
    var Remote: js.UndefOr[NullableBoolean]
  }

  object ResponseTimeRootCauseEntity {
    @inline
    def apply(
        Coverage: js.UndefOr[NullableDouble] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Remote: js.UndefOr[NullableBoolean] = js.undefined
    ): ResponseTimeRootCauseEntity = {
      val __obj = js.Dynamic.literal()
      Coverage.foreach(__v => __obj.updateDynamic("Coverage")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Remote.foreach(__v => __obj.updateDynamic("Remote")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResponseTimeRootCauseEntity]
    }
  }

  /** A collection of fields identifying the service in a response time warning.
    */
  @js.native
  trait ResponseTimeRootCauseService extends js.Object {
    var AccountId: js.UndefOr[String]
    var EntityPath: js.UndefOr[ResponseTimeRootCauseEntityPath]
    var Inferred: js.UndefOr[NullableBoolean]
    var Name: js.UndefOr[String]
    var Names: js.UndefOr[ServiceNames]
    var Type: js.UndefOr[String]
  }

  object ResponseTimeRootCauseService {
    @inline
    def apply(
        AccountId: js.UndefOr[String] = js.undefined,
        EntityPath: js.UndefOr[ResponseTimeRootCauseEntityPath] = js.undefined,
        Inferred: js.UndefOr[NullableBoolean] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Names: js.UndefOr[ServiceNames] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): ResponseTimeRootCauseService = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      EntityPath.foreach(__v => __obj.updateDynamic("EntityPath")(__v.asInstanceOf[js.Any]))
      Inferred.foreach(__v => __obj.updateDynamic("Inferred")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResponseTimeRootCauseService]
    }
  }

  /** The exception associated with a root cause.
    */
  @js.native
  trait RootCauseException extends js.Object {
    var Message: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object RootCauseException {
    @inline
    def apply(
        Message: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined
    ): RootCauseException = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RootCauseException]
    }
  }

  /** A sampling rule that services use to decide whether to instrument a request. Rule fields can match properties of the service, or properties of a request. The service can ignore rules that don't match its properties.
    */
  @js.native
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

  object SamplingRule {
    @inline
    def apply(
        FixedRate: FixedRate,
        HTTPMethod: HTTPMethod,
        Host: Host,
        Priority: Priority,
        ReservoirSize: ReservoirSize,
        ResourceARN: ResourceARN,
        ServiceName: ServiceName,
        ServiceType: ServiceType,
        URLPath: URLPath,
        Version: Version,
        Attributes: js.UndefOr[AttributeMap] = js.undefined,
        RuleARN: js.UndefOr[String] = js.undefined,
        RuleName: js.UndefOr[RuleName] = js.undefined
    ): SamplingRule = {
      val __obj = js.Dynamic.literal(
        "FixedRate" -> FixedRate.asInstanceOf[js.Any],
        "HTTPMethod" -> HTTPMethod.asInstanceOf[js.Any],
        "Host" -> Host.asInstanceOf[js.Any],
        "Priority" -> Priority.asInstanceOf[js.Any],
        "ReservoirSize" -> ReservoirSize.asInstanceOf[js.Any],
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "ServiceName" -> ServiceName.asInstanceOf[js.Any],
        "ServiceType" -> ServiceType.asInstanceOf[js.Any],
        "URLPath" -> URLPath.asInstanceOf[js.Any],
        "Version" -> Version.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      RuleARN.foreach(__v => __obj.updateDynamic("RuleARN")(__v.asInstanceOf[js.Any]))
      RuleName.foreach(__v => __obj.updateDynamic("RuleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SamplingRule]
    }
  }

  /** A <a>SamplingRule</a> and its metadata.
    */
  @js.native
  trait SamplingRuleRecord extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var ModifiedAt: js.UndefOr[Timestamp]
    var SamplingRule: js.UndefOr[SamplingRule]
  }

  object SamplingRuleRecord {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        ModifiedAt: js.UndefOr[Timestamp] = js.undefined,
        SamplingRule: js.UndefOr[SamplingRule] = js.undefined
    ): SamplingRuleRecord = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      ModifiedAt.foreach(__v => __obj.updateDynamic("ModifiedAt")(__v.asInstanceOf[js.Any]))
      SamplingRule.foreach(__v => __obj.updateDynamic("SamplingRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SamplingRuleRecord]
    }
  }

  /** A document specifying changes to a sampling rule's configuration.
    */
  @js.native
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

  object SamplingRuleUpdate {
    @inline
    def apply(
        Attributes: js.UndefOr[AttributeMap] = js.undefined,
        FixedRate: js.UndefOr[NullableDouble] = js.undefined,
        HTTPMethod: js.UndefOr[HTTPMethod] = js.undefined,
        Host: js.UndefOr[Host] = js.undefined,
        Priority: js.UndefOr[NullableInteger] = js.undefined,
        ReservoirSize: js.UndefOr[NullableInteger] = js.undefined,
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
        RuleARN: js.UndefOr[String] = js.undefined,
        RuleName: js.UndefOr[RuleName] = js.undefined,
        ServiceName: js.UndefOr[ServiceName] = js.undefined,
        ServiceType: js.UndefOr[ServiceType] = js.undefined,
        URLPath: js.UndefOr[URLPath] = js.undefined
    ): SamplingRuleUpdate = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      FixedRate.foreach(__v => __obj.updateDynamic("FixedRate")(__v.asInstanceOf[js.Any]))
      HTTPMethod.foreach(__v => __obj.updateDynamic("HTTPMethod")(__v.asInstanceOf[js.Any]))
      Host.foreach(__v => __obj.updateDynamic("Host")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      ReservoirSize.foreach(__v => __obj.updateDynamic("ReservoirSize")(__v.asInstanceOf[js.Any]))
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      RuleARN.foreach(__v => __obj.updateDynamic("RuleARN")(__v.asInstanceOf[js.Any]))
      RuleName.foreach(__v => __obj.updateDynamic("RuleName")(__v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.updateDynamic("ServiceName")(__v.asInstanceOf[js.Any]))
      ServiceType.foreach(__v => __obj.updateDynamic("ServiceType")(__v.asInstanceOf[js.Any]))
      URLPath.foreach(__v => __obj.updateDynamic("URLPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SamplingRuleUpdate]
    }
  }

  /** Aggregated request sampling data for a sampling rule across all services for a 10-second window.
    */
  @js.native
  trait SamplingStatisticSummary extends js.Object {
    var BorrowCount: js.UndefOr[Int]
    var RequestCount: js.UndefOr[Int]
    var RuleName: js.UndefOr[String]
    var SampledCount: js.UndefOr[Int]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object SamplingStatisticSummary {
    @inline
    def apply(
        BorrowCount: js.UndefOr[Int] = js.undefined,
        RequestCount: js.UndefOr[Int] = js.undefined,
        RuleName: js.UndefOr[String] = js.undefined,
        SampledCount: js.UndefOr[Int] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): SamplingStatisticSummary = {
      val __obj = js.Dynamic.literal()
      BorrowCount.foreach(__v => __obj.updateDynamic("BorrowCount")(__v.asInstanceOf[js.Any]))
      RequestCount.foreach(__v => __obj.updateDynamic("RequestCount")(__v.asInstanceOf[js.Any]))
      RuleName.foreach(__v => __obj.updateDynamic("RuleName")(__v.asInstanceOf[js.Any]))
      SampledCount.foreach(__v => __obj.updateDynamic("SampledCount")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SamplingStatisticSummary]
    }
  }

  /** Request sampling results for a single rule from a service. Results are for the last 10 seconds unless the service has been assigned a longer reporting interval after a previous call to <a>GetSamplingTargets</a>.
    */
  @js.native
  trait SamplingStatisticsDocument extends js.Object {
    var ClientID: ClientID
    var RequestCount: RequestCount
    var RuleName: RuleName
    var SampledCount: SampledCount
    var Timestamp: Timestamp
    var BorrowCount: js.UndefOr[BorrowCount]
  }

  object SamplingStatisticsDocument {
    @inline
    def apply(
        ClientID: ClientID,
        RequestCount: RequestCount,
        RuleName: RuleName,
        SampledCount: SampledCount,
        Timestamp: Timestamp,
        BorrowCount: js.UndefOr[BorrowCount] = js.undefined
    ): SamplingStatisticsDocument = {
      val __obj = js.Dynamic.literal(
        "ClientID" -> ClientID.asInstanceOf[js.Any],
        "RequestCount" -> RequestCount.asInstanceOf[js.Any],
        "RuleName" -> RuleName.asInstanceOf[js.Any],
        "SampledCount" -> SampledCount.asInstanceOf[js.Any],
        "Timestamp" -> Timestamp.asInstanceOf[js.Any]
      )

      BorrowCount.foreach(__v => __obj.updateDynamic("BorrowCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SamplingStatisticsDocument]
    }
  }

  /** The name and value of a sampling rule to apply to a trace summary.
    */
  @js.native
  trait SamplingStrategy extends js.Object {
    var Name: js.UndefOr[SamplingStrategyName]
    var Value: js.UndefOr[NullableDouble]
  }

  object SamplingStrategy {
    @inline
    def apply(
        Name: js.UndefOr[SamplingStrategyName] = js.undefined,
        Value: js.UndefOr[NullableDouble] = js.undefined
    ): SamplingStrategy = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SamplingStrategy]
    }
  }

  @js.native
  sealed trait SamplingStrategyName extends js.Any
  object SamplingStrategyName {
    val PartialScan = "PartialScan".asInstanceOf[SamplingStrategyName]
    val FixedRate = "FixedRate".asInstanceOf[SamplingStrategyName]

    @inline def values = js.Array(PartialScan, FixedRate)
  }

  /** Temporary changes to a sampling rule configuration. To meet the global sampling target for a rule, X-Ray calculates a new reservoir for each service based on the recent sampling results of all services that called <a>GetSamplingTargets</a>.
    */
  @js.native
  trait SamplingTargetDocument extends js.Object {
    var FixedRate: js.UndefOr[Double]
    var Interval: js.UndefOr[NullableInteger]
    var ReservoirQuota: js.UndefOr[NullableInteger]
    var ReservoirQuotaTTL: js.UndefOr[Timestamp]
    var RuleName: js.UndefOr[String]
  }

  object SamplingTargetDocument {
    @inline
    def apply(
        FixedRate: js.UndefOr[Double] = js.undefined,
        Interval: js.UndefOr[NullableInteger] = js.undefined,
        ReservoirQuota: js.UndefOr[NullableInteger] = js.undefined,
        ReservoirQuotaTTL: js.UndefOr[Timestamp] = js.undefined,
        RuleName: js.UndefOr[String] = js.undefined
    ): SamplingTargetDocument = {
      val __obj = js.Dynamic.literal()
      FixedRate.foreach(__v => __obj.updateDynamic("FixedRate")(__v.asInstanceOf[js.Any]))
      Interval.foreach(__v => __obj.updateDynamic("Interval")(__v.asInstanceOf[js.Any]))
      ReservoirQuota.foreach(__v => __obj.updateDynamic("ReservoirQuota")(__v.asInstanceOf[js.Any]))
      ReservoirQuotaTTL.foreach(__v => __obj.updateDynamic("ReservoirQuotaTTL")(__v.asInstanceOf[js.Any]))
      RuleName.foreach(__v => __obj.updateDynamic("RuleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SamplingTargetDocument]
    }
  }

  /** A segment from a trace that has been ingested by the X-Ray service. The segment can be compiled from documents uploaded with <a>PutTraceSegments</a>, or an <code>inferred</code> segment for a downstream service, generated from a subsegment sent by the service that called it. For the full segment document schema, see [[https://docs.aws.amazon.com/xray/latest/devguide/xray-api-segmentdocuments.html|AWS X-Ray Segment Documents]] in the <i>AWS X-Ray Developer Guide</i>.
    */
  @js.native
  trait Segment extends js.Object {
    var Document: js.UndefOr[SegmentDocument]
    var Id: js.UndefOr[SegmentId]
  }

  object Segment {
    @inline
    def apply(
        Document: js.UndefOr[SegmentDocument] = js.undefined,
        Id: js.UndefOr[SegmentId] = js.undefined
    ): Segment = {
      val __obj = js.Dynamic.literal()
      Document.foreach(__v => __obj.updateDynamic("Document")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Segment]
    }
  }

  /** Information about an application that processed requests, users that made requests, or downstream services, resources, and applications that an application used.
    */
  @js.native
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

  object Service {
    @inline
    def apply(
        AccountId: js.UndefOr[String] = js.undefined,
        DurationHistogram: js.UndefOr[Histogram] = js.undefined,
        Edges: js.UndefOr[EdgeList] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Names: js.UndefOr[ServiceNames] = js.undefined,
        ReferenceId: js.UndefOr[NullableInteger] = js.undefined,
        ResponseTimeHistogram: js.UndefOr[Histogram] = js.undefined,
        Root: js.UndefOr[NullableBoolean] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        State: js.UndefOr[String] = js.undefined,
        SummaryStatistics: js.UndefOr[ServiceStatistics] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): Service = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      DurationHistogram.foreach(__v => __obj.updateDynamic("DurationHistogram")(__v.asInstanceOf[js.Any]))
      Edges.foreach(__v => __obj.updateDynamic("Edges")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      ReferenceId.foreach(__v => __obj.updateDynamic("ReferenceId")(__v.asInstanceOf[js.Any]))
      ResponseTimeHistogram.foreach(__v => __obj.updateDynamic("ResponseTimeHistogram")(__v.asInstanceOf[js.Any]))
      Root.foreach(__v => __obj.updateDynamic("Root")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      SummaryStatistics.foreach(__v => __obj.updateDynamic("SummaryStatistics")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Service]
    }
  }

  /** <p/>
    */
  @js.native
  trait ServiceId extends js.Object {
    var AccountId: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Names: js.UndefOr[ServiceNames]
    var Type: js.UndefOr[String]
  }

  object ServiceId {
    @inline
    def apply(
        AccountId: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Names: js.UndefOr[ServiceNames] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): ServiceId = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceId]
    }
  }

  /** Response statistics for a service.
    */
  @js.native
  trait ServiceStatistics extends js.Object {
    var ErrorStatistics: js.UndefOr[ErrorStatistics]
    var FaultStatistics: js.UndefOr[FaultStatistics]
    var OkCount: js.UndefOr[NullableLong]
    var TotalCount: js.UndefOr[NullableLong]
    var TotalResponseTime: js.UndefOr[NullableDouble]
  }

  object ServiceStatistics {
    @inline
    def apply(
        ErrorStatistics: js.UndefOr[ErrorStatistics] = js.undefined,
        FaultStatistics: js.UndefOr[FaultStatistics] = js.undefined,
        OkCount: js.UndefOr[NullableLong] = js.undefined,
        TotalCount: js.UndefOr[NullableLong] = js.undefined,
        TotalResponseTime: js.UndefOr[NullableDouble] = js.undefined
    ): ServiceStatistics = {
      val __obj = js.Dynamic.literal()
      ErrorStatistics.foreach(__v => __obj.updateDynamic("ErrorStatistics")(__v.asInstanceOf[js.Any]))
      FaultStatistics.foreach(__v => __obj.updateDynamic("FaultStatistics")(__v.asInstanceOf[js.Any]))
      OkCount.foreach(__v => __obj.updateDynamic("OkCount")(__v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.updateDynamic("TotalCount")(__v.asInstanceOf[js.Any]))
      TotalResponseTime.foreach(__v => __obj.updateDynamic("TotalResponseTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceStatistics]
    }
  }

  /** A map that contains tag keys and tag values to attach to an AWS X-Ray group or sampling rule. For more information about ways to use tags, see [[https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html|Tagging AWS resources]] in the <i>AWS General Reference</i>. The following restrictions apply to tags: * Maximum number of user-applied tags per resource: 50 * Tag keys and values are case sensitive. * Don't use <code>aws:</code> as a prefix for keys; it's reserved for AWS use. You cannot edit or delete system tags.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait TelemetryRecord extends js.Object {
    var Timestamp: Timestamp
    var BackendConnectionErrors: js.UndefOr[BackendConnectionErrors]
    var SegmentsReceivedCount: js.UndefOr[NullableInteger]
    var SegmentsRejectedCount: js.UndefOr[NullableInteger]
    var SegmentsSentCount: js.UndefOr[NullableInteger]
    var SegmentsSpilloverCount: js.UndefOr[NullableInteger]
  }

  object TelemetryRecord {
    @inline
    def apply(
        Timestamp: Timestamp,
        BackendConnectionErrors: js.UndefOr[BackendConnectionErrors] = js.undefined,
        SegmentsReceivedCount: js.UndefOr[NullableInteger] = js.undefined,
        SegmentsRejectedCount: js.UndefOr[NullableInteger] = js.undefined,
        SegmentsSentCount: js.UndefOr[NullableInteger] = js.undefined,
        SegmentsSpilloverCount: js.UndefOr[NullableInteger] = js.undefined
    ): TelemetryRecord = {
      val __obj = js.Dynamic.literal(
        "Timestamp" -> Timestamp.asInstanceOf[js.Any]
      )

      BackendConnectionErrors.foreach(__v => __obj.updateDynamic("BackendConnectionErrors")(__v.asInstanceOf[js.Any]))
      SegmentsReceivedCount.foreach(__v => __obj.updateDynamic("SegmentsReceivedCount")(__v.asInstanceOf[js.Any]))
      SegmentsRejectedCount.foreach(__v => __obj.updateDynamic("SegmentsRejectedCount")(__v.asInstanceOf[js.Any]))
      SegmentsSentCount.foreach(__v => __obj.updateDynamic("SegmentsSentCount")(__v.asInstanceOf[js.Any]))
      SegmentsSpilloverCount.foreach(__v => __obj.updateDynamic("SegmentsSpilloverCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TelemetryRecord]
    }
  }

  @js.native
  sealed trait TimeRangeType extends js.Any
  object TimeRangeType {
    val TraceId = "TraceId".asInstanceOf[TimeRangeType]
    val Event = "Event".asInstanceOf[TimeRangeType]

    @inline def values = js.Array(TraceId, Event)
  }

  /** A list of TimeSeriesStatistic structures.
    */
  @js.native
  trait TimeSeriesServiceStatistics extends js.Object {
    var EdgeSummaryStatistics: js.UndefOr[EdgeStatistics]
    var ResponseTimeHistogram: js.UndefOr[Histogram]
    var ServiceForecastStatistics: js.UndefOr[ForecastStatistics]
    var ServiceSummaryStatistics: js.UndefOr[ServiceStatistics]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object TimeSeriesServiceStatistics {
    @inline
    def apply(
        EdgeSummaryStatistics: js.UndefOr[EdgeStatistics] = js.undefined,
        ResponseTimeHistogram: js.UndefOr[Histogram] = js.undefined,
        ServiceForecastStatistics: js.UndefOr[ForecastStatistics] = js.undefined,
        ServiceSummaryStatistics: js.UndefOr[ServiceStatistics] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): TimeSeriesServiceStatistics = {
      val __obj = js.Dynamic.literal()
      EdgeSummaryStatistics.foreach(__v => __obj.updateDynamic("EdgeSummaryStatistics")(__v.asInstanceOf[js.Any]))
      ResponseTimeHistogram.foreach(__v => __obj.updateDynamic("ResponseTimeHistogram")(__v.asInstanceOf[js.Any]))
      ServiceForecastStatistics.foreach(__v => __obj.updateDynamic("ServiceForecastStatistics")(__v.asInstanceOf[js.Any]))
      ServiceSummaryStatistics.foreach(__v => __obj.updateDynamic("ServiceSummaryStatistics")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeSeriesServiceStatistics]
    }
  }

  /** A collection of segment documents with matching trace IDs.
    */
  @js.native
  trait Trace extends js.Object {
    var Duration: js.UndefOr[NullableDouble]
    var Id: js.UndefOr[TraceId]
    var LimitExceeded: js.UndefOr[NullableBoolean]
    var Segments: js.UndefOr[SegmentList]
  }

  object Trace {
    @inline
    def apply(
        Duration: js.UndefOr[NullableDouble] = js.undefined,
        Id: js.UndefOr[TraceId] = js.undefined,
        LimitExceeded: js.UndefOr[NullableBoolean] = js.undefined,
        Segments: js.UndefOr[SegmentList] = js.undefined
    ): Trace = {
      val __obj = js.Dynamic.literal()
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LimitExceeded.foreach(__v => __obj.updateDynamic("LimitExceeded")(__v.asInstanceOf[js.Any]))
      Segments.foreach(__v => __obj.updateDynamic("Segments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Trace]
    }
  }

  /** Metadata generated from the segment documents in a trace.
    */
  @js.native
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

  object TraceSummary {
    @inline
    def apply(
        Annotations: js.UndefOr[Annotations] = js.undefined,
        AvailabilityZones: js.UndefOr[TraceAvailabilityZones] = js.undefined,
        Duration: js.UndefOr[NullableDouble] = js.undefined,
        EntryPoint: js.UndefOr[ServiceId] = js.undefined,
        ErrorRootCauses: js.UndefOr[ErrorRootCauses] = js.undefined,
        FaultRootCauses: js.UndefOr[FaultRootCauses] = js.undefined,
        HasError: js.UndefOr[NullableBoolean] = js.undefined,
        HasFault: js.UndefOr[NullableBoolean] = js.undefined,
        HasThrottle: js.UndefOr[NullableBoolean] = js.undefined,
        Http: js.UndefOr[Http] = js.undefined,
        Id: js.UndefOr[TraceId] = js.undefined,
        InstanceIds: js.UndefOr[TraceInstanceIds] = js.undefined,
        IsPartial: js.UndefOr[NullableBoolean] = js.undefined,
        MatchedEventTime: js.UndefOr[Timestamp] = js.undefined,
        ResourceARNs: js.UndefOr[TraceResourceARNs] = js.undefined,
        ResponseTime: js.UndefOr[NullableDouble] = js.undefined,
        ResponseTimeRootCauses: js.UndefOr[ResponseTimeRootCauses] = js.undefined,
        Revision: js.UndefOr[Int] = js.undefined,
        ServiceIds: js.UndefOr[ServiceIds] = js.undefined,
        Users: js.UndefOr[TraceUsers] = js.undefined
    ): TraceSummary = {
      val __obj = js.Dynamic.literal()
      Annotations.foreach(__v => __obj.updateDynamic("Annotations")(__v.asInstanceOf[js.Any]))
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      EntryPoint.foreach(__v => __obj.updateDynamic("EntryPoint")(__v.asInstanceOf[js.Any]))
      ErrorRootCauses.foreach(__v => __obj.updateDynamic("ErrorRootCauses")(__v.asInstanceOf[js.Any]))
      FaultRootCauses.foreach(__v => __obj.updateDynamic("FaultRootCauses")(__v.asInstanceOf[js.Any]))
      HasError.foreach(__v => __obj.updateDynamic("HasError")(__v.asInstanceOf[js.Any]))
      HasFault.foreach(__v => __obj.updateDynamic("HasFault")(__v.asInstanceOf[js.Any]))
      HasThrottle.foreach(__v => __obj.updateDynamic("HasThrottle")(__v.asInstanceOf[js.Any]))
      Http.foreach(__v => __obj.updateDynamic("Http")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InstanceIds.foreach(__v => __obj.updateDynamic("InstanceIds")(__v.asInstanceOf[js.Any]))
      IsPartial.foreach(__v => __obj.updateDynamic("IsPartial")(__v.asInstanceOf[js.Any]))
      MatchedEventTime.foreach(__v => __obj.updateDynamic("MatchedEventTime")(__v.asInstanceOf[js.Any]))
      ResourceARNs.foreach(__v => __obj.updateDynamic("ResourceARNs")(__v.asInstanceOf[js.Any]))
      ResponseTime.foreach(__v => __obj.updateDynamic("ResponseTime")(__v.asInstanceOf[js.Any]))
      ResponseTimeRootCauses.foreach(__v => __obj.updateDynamic("ResponseTimeRootCauses")(__v.asInstanceOf[js.Any]))
      Revision.foreach(__v => __obj.updateDynamic("Revision")(__v.asInstanceOf[js.Any]))
      ServiceIds.foreach(__v => __obj.updateDynamic("ServiceIds")(__v.asInstanceOf[js.Any]))
      Users.foreach(__v => __obj.updateDynamic("Users")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TraceSummary]
    }
  }

  /** Information about a user recorded in segment documents.
    */
  @js.native
  trait TraceUser extends js.Object {
    var ServiceIds: js.UndefOr[ServiceIds]
    var UserName: js.UndefOr[String]
  }

  object TraceUser {
    @inline
    def apply(
        ServiceIds: js.UndefOr[ServiceIds] = js.undefined,
        UserName: js.UndefOr[String] = js.undefined
    ): TraceUser = {
      val __obj = js.Dynamic.literal()
      ServiceIds.foreach(__v => __obj.updateDynamic("ServiceIds")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TraceUser]
    }
  }

  /** Sampling statistics from a call to <a>GetSamplingTargets</a> that X-Ray could not process.
    */
  @js.native
  trait UnprocessedStatistics extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var Message: js.UndefOr[String]
    var RuleName: js.UndefOr[String]
  }

  object UnprocessedStatistics {
    @inline
    def apply(
        ErrorCode: js.UndefOr[String] = js.undefined,
        Message: js.UndefOr[String] = js.undefined,
        RuleName: js.UndefOr[String] = js.undefined
    ): UnprocessedStatistics = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      RuleName.foreach(__v => __obj.updateDynamic("RuleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnprocessedStatistics]
    }
  }

  /** Information about a segment that failed processing.
    */
  @js.native
  trait UnprocessedTraceSegment extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var Id: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  object UnprocessedTraceSegment {
    @inline
    def apply(
        ErrorCode: js.UndefOr[String] = js.undefined,
        Id: js.UndefOr[String] = js.undefined,
        Message: js.UndefOr[String] = js.undefined
    ): UnprocessedTraceSegment = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnprocessedTraceSegment]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateGroupRequest extends js.Object {
    var FilterExpression: js.UndefOr[FilterExpression]
    var GroupARN: js.UndefOr[GroupARN]
    var GroupName: js.UndefOr[GroupName]
    var InsightsConfiguration: js.UndefOr[InsightsConfiguration]
  }

  object UpdateGroupRequest {
    @inline
    def apply(
        FilterExpression: js.UndefOr[FilterExpression] = js.undefined,
        GroupARN: js.UndefOr[GroupARN] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined,
        InsightsConfiguration: js.UndefOr[InsightsConfiguration] = js.undefined
    ): UpdateGroupRequest = {
      val __obj = js.Dynamic.literal()
      FilterExpression.foreach(__v => __obj.updateDynamic("FilterExpression")(__v.asInstanceOf[js.Any]))
      GroupARN.foreach(__v => __obj.updateDynamic("GroupARN")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      InsightsConfiguration.foreach(__v => __obj.updateDynamic("InsightsConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupRequest]
    }
  }

  @js.native
  trait UpdateGroupResult extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object UpdateGroupResult {
    @inline
    def apply(
        Group: js.UndefOr[Group] = js.undefined
    ): UpdateGroupResult = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupResult]
    }
  }

  @js.native
  trait UpdateSamplingRuleRequest extends js.Object {
    var SamplingRuleUpdate: SamplingRuleUpdate
  }

  object UpdateSamplingRuleRequest {
    @inline
    def apply(
        SamplingRuleUpdate: SamplingRuleUpdate
    ): UpdateSamplingRuleRequest = {
      val __obj = js.Dynamic.literal(
        "SamplingRuleUpdate" -> SamplingRuleUpdate.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateSamplingRuleRequest]
    }
  }

  @js.native
  trait UpdateSamplingRuleResult extends js.Object {
    var SamplingRuleRecord: js.UndefOr[SamplingRuleRecord]
  }

  object UpdateSamplingRuleResult {
    @inline
    def apply(
        SamplingRuleRecord: js.UndefOr[SamplingRuleRecord] = js.undefined
    ): UpdateSamplingRuleResult = {
      val __obj = js.Dynamic.literal()
      SamplingRuleRecord.foreach(__v => __obj.updateDynamic("SamplingRuleRecord")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSamplingRuleResult]
    }
  }

  /** Information about a segment annotation.
    */
  @js.native
  trait ValueWithServiceIds extends js.Object {
    var AnnotationValue: js.UndefOr[AnnotationValue]
    var ServiceIds: js.UndefOr[ServiceIds]
  }

  object ValueWithServiceIds {
    @inline
    def apply(
        AnnotationValue: js.UndefOr[AnnotationValue] = js.undefined,
        ServiceIds: js.UndefOr[ServiceIds] = js.undefined
    ): ValueWithServiceIds = {
      val __obj = js.Dynamic.literal()
      AnnotationValue.foreach(__v => __obj.updateDynamic("AnnotationValue")(__v.asInstanceOf[js.Any]))
      ServiceIds.foreach(__v => __obj.updateDynamic("ServiceIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValueWithServiceIds]
    }
  }
}
