package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

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
  type EncryptionStatus                = String
  type EncryptionType                  = String
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
  type SamplingStrategyName            = String
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
  type TimeRangeType                   = String
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

  implicit final class XRayOps(val service: XRay) extends AnyVal {

    def batchGetTracesFuture(params: BatchGetTracesRequest): Future[BatchGetTracesResult] =
      service.batchGetTraces(params).promise.toFuture
    def createGroupFuture(params: CreateGroupRequest): Future[CreateGroupResult] =
      service.createGroup(params).promise.toFuture
    def createSamplingRuleFuture(params: CreateSamplingRuleRequest): Future[CreateSamplingRuleResult] =
      service.createSamplingRule(params).promise.toFuture
    def deleteGroupFuture(params: DeleteGroupRequest): Future[DeleteGroupResult] =
      service.deleteGroup(params).promise.toFuture
    def deleteSamplingRuleFuture(params: DeleteSamplingRuleRequest): Future[DeleteSamplingRuleResult] =
      service.deleteSamplingRule(params).promise.toFuture
    def getEncryptionConfigFuture(params: GetEncryptionConfigRequest): Future[GetEncryptionConfigResult] =
      service.getEncryptionConfig(params).promise.toFuture
    def getGroupFuture(params: GetGroupRequest): Future[GetGroupResult]    = service.getGroup(params).promise.toFuture
    def getGroupsFuture(params: GetGroupsRequest): Future[GetGroupsResult] = service.getGroups(params).promise.toFuture
    def getSamplingRulesFuture(params: GetSamplingRulesRequest): Future[GetSamplingRulesResult] =
      service.getSamplingRules(params).promise.toFuture
    def getSamplingStatisticSummariesFuture(
        params: GetSamplingStatisticSummariesRequest
    ): Future[GetSamplingStatisticSummariesResult] = service.getSamplingStatisticSummaries(params).promise.toFuture
    def getSamplingTargetsFuture(params: GetSamplingTargetsRequest): Future[GetSamplingTargetsResult] =
      service.getSamplingTargets(params).promise.toFuture
    def getServiceGraphFuture(params: GetServiceGraphRequest): Future[GetServiceGraphResult] =
      service.getServiceGraph(params).promise.toFuture
    def getTimeSeriesServiceStatisticsFuture(
        params: GetTimeSeriesServiceStatisticsRequest
    ): Future[GetTimeSeriesServiceStatisticsResult] = service.getTimeSeriesServiceStatistics(params).promise.toFuture
    def getTraceGraphFuture(params: GetTraceGraphRequest): Future[GetTraceGraphResult] =
      service.getTraceGraph(params).promise.toFuture
    def getTraceSummariesFuture(params: GetTraceSummariesRequest): Future[GetTraceSummariesResult] =
      service.getTraceSummaries(params).promise.toFuture
    def putEncryptionConfigFuture(params: PutEncryptionConfigRequest): Future[PutEncryptionConfigResult] =
      service.putEncryptionConfig(params).promise.toFuture
    def putTelemetryRecordsFuture(params: PutTelemetryRecordsRequest): Future[PutTelemetryRecordsResult] =
      service.putTelemetryRecords(params).promise.toFuture
    def putTraceSegmentsFuture(params: PutTraceSegmentsRequest): Future[PutTraceSegmentsResult] =
      service.putTraceSegments(params).promise.toFuture
    def updateGroupFuture(params: UpdateGroupRequest): Future[UpdateGroupResult] =
      service.updateGroup(params).promise.toFuture
    def updateSamplingRuleFuture(params: UpdateSamplingRuleRequest): Future[UpdateSamplingRuleResult] =
      service.updateSamplingRule(params).promise.toFuture
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
  trait Alias extends js.Object {
    var Name: js.UndefOr[String]
    var Names: js.UndefOr[AliasNames]
    var Type: js.UndefOr[String]
  }

  object Alias {
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        Names: js.UndefOr[AliasNames] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): Alias = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.update("Names", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Alias]
    }
  }

  /**
    * Value of a segment annotation. Has one of three value types: Number, Boolean or String.
    */
  @js.native
  trait AnnotationValue extends js.Object {
    var BooleanValue: js.UndefOr[NullableBoolean]
    var NumberValue: js.UndefOr[NullableDouble]
    var StringValue: js.UndefOr[String]
  }

  object AnnotationValue {
    def apply(
        BooleanValue: js.UndefOr[NullableBoolean] = js.undefined,
        NumberValue: js.UndefOr[NullableDouble] = js.undefined,
        StringValue: js.UndefOr[String] = js.undefined
    ): AnnotationValue = {
      val __obj = js.Dictionary.empty[js.Any]
      BooleanValue.foreach(__v => __obj.update("BooleanValue", __v.asInstanceOf[js.Any]))
      NumberValue.foreach(__v => __obj.update("NumberValue", __v.asInstanceOf[js.Any]))
      StringValue.foreach(__v => __obj.update("StringValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnnotationValue]
    }
  }

  /**
    * A list of availability zones corresponding to the segments in a trace.
    */
  @js.native
  trait AvailabilityZoneDetail extends js.Object {
    var Name: js.UndefOr[String]
  }

  object AvailabilityZoneDetail {
    def apply(
        Name: js.UndefOr[String] = js.undefined
    ): AvailabilityZoneDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailabilityZoneDetail]
    }
  }

  /**
    * <p/>
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
    def apply(
        ConnectionRefusedCount: js.UndefOr[NullableInteger] = js.undefined,
        HTTPCode4XXCount: js.UndefOr[NullableInteger] = js.undefined,
        HTTPCode5XXCount: js.UndefOr[NullableInteger] = js.undefined,
        OtherCount: js.UndefOr[NullableInteger] = js.undefined,
        TimeoutCount: js.UndefOr[NullableInteger] = js.undefined,
        UnknownHostCount: js.UndefOr[NullableInteger] = js.undefined
    ): BackendConnectionErrors = {
      val __obj = js.Dictionary.empty[js.Any]
      ConnectionRefusedCount.foreach(__v => __obj.update("ConnectionRefusedCount", __v.asInstanceOf[js.Any]))
      HTTPCode4XXCount.foreach(__v => __obj.update("HTTPCode4XXCount", __v.asInstanceOf[js.Any]))
      HTTPCode5XXCount.foreach(__v => __obj.update("HTTPCode5XXCount", __v.asInstanceOf[js.Any]))
      OtherCount.foreach(__v => __obj.update("OtherCount", __v.asInstanceOf[js.Any]))
      TimeoutCount.foreach(__v => __obj.update("TimeoutCount", __v.asInstanceOf[js.Any]))
      UnknownHostCount.foreach(__v => __obj.update("UnknownHostCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackendConnectionErrors]
    }
  }

  @js.native
  trait BatchGetTracesRequest extends js.Object {
    var TraceIds: TraceIdList
    var NextToken: js.UndefOr[String]
  }

  object BatchGetTracesRequest {
    def apply(
        TraceIds: TraceIdList,
        NextToken: js.UndefOr[String] = js.undefined
    ): BatchGetTracesRequest = {
      val __obj = js.Dictionary[js.Any](
        "TraceIds" -> TraceIds.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Traces: js.UndefOr[TraceList] = js.undefined,
        UnprocessedTraceIds: js.UndefOr[UnprocessedTraceIdList] = js.undefined
    ): BatchGetTracesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Traces.foreach(__v => __obj.update("Traces", __v.asInstanceOf[js.Any]))
      UnprocessedTraceIds.foreach(__v => __obj.update("UnprocessedTraceIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetTracesResult]
    }
  }

  @js.native
  trait CreateGroupRequest extends js.Object {
    var GroupName: GroupName
    var FilterExpression: js.UndefOr[FilterExpression]
  }

  object CreateGroupRequest {
    def apply(
        GroupName: GroupName,
        FilterExpression: js.UndefOr[FilterExpression] = js.undefined
    ): CreateGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "GroupName" -> GroupName.asInstanceOf[js.Any]
      )

      FilterExpression.foreach(__v => __obj.update("FilterExpression", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupRequest]
    }
  }

  @js.native
  trait CreateGroupResult extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object CreateGroupResult {
    def apply(
        Group: js.UndefOr[Group] = js.undefined
    ): CreateGroupResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Group.foreach(__v => __obj.update("Group", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupResult]
    }
  }

  @js.native
  trait CreateSamplingRuleRequest extends js.Object {
    var SamplingRule: SamplingRule
  }

  object CreateSamplingRuleRequest {
    def apply(
        SamplingRule: SamplingRule
    ): CreateSamplingRuleRequest = {
      val __obj = js.Dictionary[js.Any](
        "SamplingRule" -> SamplingRule.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateSamplingRuleRequest]
    }
  }

  @js.native
  trait CreateSamplingRuleResult extends js.Object {
    var SamplingRuleRecord: js.UndefOr[SamplingRuleRecord]
  }

  object CreateSamplingRuleResult {
    def apply(
        SamplingRuleRecord: js.UndefOr[SamplingRuleRecord] = js.undefined
    ): CreateSamplingRuleResult = {
      val __obj = js.Dictionary.empty[js.Any]
      SamplingRuleRecord.foreach(__v => __obj.update("SamplingRuleRecord", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSamplingRuleResult]
    }
  }

  @js.native
  trait DeleteGroupRequest extends js.Object {
    var GroupARN: js.UndefOr[GroupARN]
    var GroupName: js.UndefOr[GroupName]
  }

  object DeleteGroupRequest {
    def apply(
        GroupARN: js.UndefOr[GroupARN] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined
    ): DeleteGroupRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      GroupARN.foreach(__v => __obj.update("GroupARN", __v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.update("GroupName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGroupRequest]
    }
  }

  @js.native
  trait DeleteGroupResult extends js.Object {}

  object DeleteGroupResult {
    def apply(
        ): DeleteGroupResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteGroupResult]
    }
  }

  @js.native
  trait DeleteSamplingRuleRequest extends js.Object {
    var RuleARN: js.UndefOr[String]
    var RuleName: js.UndefOr[String]
  }

  object DeleteSamplingRuleRequest {
    def apply(
        RuleARN: js.UndefOr[String] = js.undefined,
        RuleName: js.UndefOr[String] = js.undefined
    ): DeleteSamplingRuleRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      RuleARN.foreach(__v => __obj.update("RuleARN", __v.asInstanceOf[js.Any]))
      RuleName.foreach(__v => __obj.update("RuleName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSamplingRuleRequest]
    }
  }

  @js.native
  trait DeleteSamplingRuleResult extends js.Object {
    var SamplingRuleRecord: js.UndefOr[SamplingRuleRecord]
  }

  object DeleteSamplingRuleResult {
    def apply(
        SamplingRuleRecord: js.UndefOr[SamplingRuleRecord] = js.undefined
    ): DeleteSamplingRuleResult = {
      val __obj = js.Dictionary.empty[js.Any]
      SamplingRuleRecord.foreach(__v => __obj.update("SamplingRuleRecord", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSamplingRuleResult]
    }
  }

  /**
    * Information about a connection between two services.
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
    def apply(
        Aliases: js.UndefOr[AliasList] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        ReferenceId: js.UndefOr[NullableInteger] = js.undefined,
        ResponseTimeHistogram: js.UndefOr[Histogram] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        SummaryStatistics: js.UndefOr[EdgeStatistics] = js.undefined
    ): Edge = {
      val __obj = js.Dictionary.empty[js.Any]
      Aliases.foreach(__v => __obj.update("Aliases", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      ReferenceId.foreach(__v => __obj.update("ReferenceId", __v.asInstanceOf[js.Any]))
      ResponseTimeHistogram.foreach(__v => __obj.update("ResponseTimeHistogram", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      SummaryStatistics.foreach(__v => __obj.update("SummaryStatistics", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Edge]
    }
  }

  /**
    * Response statistics for an edge.
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
    def apply(
        ErrorStatistics: js.UndefOr[ErrorStatistics] = js.undefined,
        FaultStatistics: js.UndefOr[FaultStatistics] = js.undefined,
        OkCount: js.UndefOr[NullableLong] = js.undefined,
        TotalCount: js.UndefOr[NullableLong] = js.undefined,
        TotalResponseTime: js.UndefOr[NullableDouble] = js.undefined
    ): EdgeStatistics = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorStatistics.foreach(__v => __obj.update("ErrorStatistics", __v.asInstanceOf[js.Any]))
      FaultStatistics.foreach(__v => __obj.update("FaultStatistics", __v.asInstanceOf[js.Any]))
      OkCount.foreach(__v => __obj.update("OkCount", __v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.update("TotalCount", __v.asInstanceOf[js.Any]))
      TotalResponseTime.foreach(__v => __obj.update("TotalResponseTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EdgeStatistics]
    }
  }

  /**
    * A configuration document that specifies encryption configuration settings.
    */
  @js.native
  trait EncryptionConfig extends js.Object {
    var KeyId: js.UndefOr[String]
    var Status: js.UndefOr[EncryptionStatus]
    var Type: js.UndefOr[EncryptionType]
  }

  object EncryptionConfig {
    def apply(
        KeyId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[EncryptionStatus] = js.undefined,
        Type: js.UndefOr[EncryptionType] = js.undefined
    ): EncryptionConfig = {
      val __obj = js.Dictionary.empty[js.Any]
      KeyId.foreach(__v => __obj.update("KeyId", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionConfig]
    }
  }

  object EncryptionStatusEnum {
    val UPDATING = "UPDATING"
    val ACTIVE   = "ACTIVE"

    val values = IndexedSeq(UPDATING, ACTIVE)
  }

  object EncryptionTypeEnum {
    val NONE = "NONE"
    val KMS  = "KMS"

    val values = IndexedSeq(NONE, KMS)
  }

  /**
    * The root cause of a trace summary error.
    */
  @js.native
  trait ErrorRootCause extends js.Object {
    var Services: js.UndefOr[ErrorRootCauseServices]
  }

  object ErrorRootCause {
    def apply(
        Services: js.UndefOr[ErrorRootCauseServices] = js.undefined
    ): ErrorRootCause = {
      val __obj = js.Dictionary.empty[js.Any]
      Services.foreach(__v => __obj.update("Services", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorRootCause]
    }
  }

  /**
    * A collection of segments and corresponding subsegments associated to a trace summary error.
    */
  @js.native
  trait ErrorRootCauseEntity extends js.Object {
    var Exceptions: js.UndefOr[RootCauseExceptions]
    var Name: js.UndefOr[String]
    var Remote: js.UndefOr[NullableBoolean]
  }

  object ErrorRootCauseEntity {
    def apply(
        Exceptions: js.UndefOr[RootCauseExceptions] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Remote: js.UndefOr[NullableBoolean] = js.undefined
    ): ErrorRootCauseEntity = {
      val __obj = js.Dictionary.empty[js.Any]
      Exceptions.foreach(__v => __obj.update("Exceptions", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Remote.foreach(__v => __obj.update("Remote", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorRootCauseEntity]
    }
  }

  /**
    * A collection of fields identifying the services in a trace summary error.
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
    def apply(
        AccountId: js.UndefOr[String] = js.undefined,
        EntityPath: js.UndefOr[ErrorRootCauseEntityPath] = js.undefined,
        Inferred: js.UndefOr[NullableBoolean] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Names: js.UndefOr[ServiceNames] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): ErrorRootCauseService = {
      val __obj = js.Dictionary.empty[js.Any]
      AccountId.foreach(__v => __obj.update("AccountId", __v.asInstanceOf[js.Any]))
      EntityPath.foreach(__v => __obj.update("EntityPath", __v.asInstanceOf[js.Any]))
      Inferred.foreach(__v => __obj.update("Inferred", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.update("Names", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorRootCauseService]
    }
  }

  /**
    * Information about requests that failed with a 4xx Client Error status code.
    */
  @js.native
  trait ErrorStatistics extends js.Object {
    var OtherCount: js.UndefOr[NullableLong]
    var ThrottleCount: js.UndefOr[NullableLong]
    var TotalCount: js.UndefOr[NullableLong]
  }

  object ErrorStatistics {
    def apply(
        OtherCount: js.UndefOr[NullableLong] = js.undefined,
        ThrottleCount: js.UndefOr[NullableLong] = js.undefined,
        TotalCount: js.UndefOr[NullableLong] = js.undefined
    ): ErrorStatistics = {
      val __obj = js.Dictionary.empty[js.Any]
      OtherCount.foreach(__v => __obj.update("OtherCount", __v.asInstanceOf[js.Any]))
      ThrottleCount.foreach(__v => __obj.update("ThrottleCount", __v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.update("TotalCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorStatistics]
    }
  }

  /**
    * The root cause information for a trace summary fault.
    */
  @js.native
  trait FaultRootCause extends js.Object {
    var Services: js.UndefOr[FaultRootCauseServices]
  }

  object FaultRootCause {
    def apply(
        Services: js.UndefOr[FaultRootCauseServices] = js.undefined
    ): FaultRootCause = {
      val __obj = js.Dictionary.empty[js.Any]
      Services.foreach(__v => __obj.update("Services", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FaultRootCause]
    }
  }

  /**
    * A collection of segments and corresponding subsegments associated to a trace summary fault error.
    */
  @js.native
  trait FaultRootCauseEntity extends js.Object {
    var Exceptions: js.UndefOr[RootCauseExceptions]
    var Name: js.UndefOr[String]
    var Remote: js.UndefOr[NullableBoolean]
  }

  object FaultRootCauseEntity {
    def apply(
        Exceptions: js.UndefOr[RootCauseExceptions] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Remote: js.UndefOr[NullableBoolean] = js.undefined
    ): FaultRootCauseEntity = {
      val __obj = js.Dictionary.empty[js.Any]
      Exceptions.foreach(__v => __obj.update("Exceptions", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Remote.foreach(__v => __obj.update("Remote", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FaultRootCauseEntity]
    }
  }

  /**
    * A collection of fields identifying the services in a trace summary fault.
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
    def apply(
        AccountId: js.UndefOr[String] = js.undefined,
        EntityPath: js.UndefOr[FaultRootCauseEntityPath] = js.undefined,
        Inferred: js.UndefOr[NullableBoolean] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Names: js.UndefOr[ServiceNames] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): FaultRootCauseService = {
      val __obj = js.Dictionary.empty[js.Any]
      AccountId.foreach(__v => __obj.update("AccountId", __v.asInstanceOf[js.Any]))
      EntityPath.foreach(__v => __obj.update("EntityPath", __v.asInstanceOf[js.Any]))
      Inferred.foreach(__v => __obj.update("Inferred", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.update("Names", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FaultRootCauseService]
    }
  }

  /**
    * Information about requests that failed with a 5xx Server Error status code.
    */
  @js.native
  trait FaultStatistics extends js.Object {
    var OtherCount: js.UndefOr[NullableLong]
    var TotalCount: js.UndefOr[NullableLong]
  }

  object FaultStatistics {
    def apply(
        OtherCount: js.UndefOr[NullableLong] = js.undefined,
        TotalCount: js.UndefOr[NullableLong] = js.undefined
    ): FaultStatistics = {
      val __obj = js.Dictionary.empty[js.Any]
      OtherCount.foreach(__v => __obj.update("OtherCount", __v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.update("TotalCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FaultStatistics]
    }
  }

  @js.native
  trait GetEncryptionConfigRequest extends js.Object {}

  object GetEncryptionConfigRequest {
    def apply(
        ): GetEncryptionConfigRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[GetEncryptionConfigRequest]
    }
  }

  @js.native
  trait GetEncryptionConfigResult extends js.Object {
    var EncryptionConfig: js.UndefOr[EncryptionConfig]
  }

  object GetEncryptionConfigResult {
    def apply(
        EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined
    ): GetEncryptionConfigResult = {
      val __obj = js.Dictionary.empty[js.Any]
      EncryptionConfig.foreach(__v => __obj.update("EncryptionConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEncryptionConfigResult]
    }
  }

  @js.native
  trait GetGroupRequest extends js.Object {
    var GroupARN: js.UndefOr[GroupARN]
    var GroupName: js.UndefOr[GroupName]
  }

  object GetGroupRequest {
    def apply(
        GroupARN: js.UndefOr[GroupARN] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined
    ): GetGroupRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      GroupARN.foreach(__v => __obj.update("GroupARN", __v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.update("GroupName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupRequest]
    }
  }

  @js.native
  trait GetGroupResult extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object GetGroupResult {
    def apply(
        Group: js.UndefOr[Group] = js.undefined
    ): GetGroupResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Group.foreach(__v => __obj.update("Group", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupResult]
    }
  }

  @js.native
  trait GetGroupsRequest extends js.Object {
    var NextToken: js.UndefOr[GetGroupsNextToken]
  }

  object GetGroupsRequest {
    def apply(
        NextToken: js.UndefOr[GetGroupsNextToken] = js.undefined
    ): GetGroupsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupsRequest]
    }
  }

  @js.native
  trait GetGroupsResult extends js.Object {
    var Groups: js.UndefOr[GroupSummaryList]
    var NextToken: js.UndefOr[String]
  }

  object GetGroupsResult {
    def apply(
        Groups: js.UndefOr[GroupSummaryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): GetGroupsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Groups.foreach(__v => __obj.update("Groups", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupsResult]
    }
  }

  @js.native
  trait GetSamplingRulesRequest extends js.Object {
    var NextToken: js.UndefOr[String]
  }

  object GetSamplingRulesRequest {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined
    ): GetSamplingRulesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSamplingRulesRequest]
    }
  }

  @js.native
  trait GetSamplingRulesResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var SamplingRuleRecords: js.UndefOr[SamplingRuleRecordList]
  }

  object GetSamplingRulesResult {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        SamplingRuleRecords: js.UndefOr[SamplingRuleRecordList] = js.undefined
    ): GetSamplingRulesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SamplingRuleRecords.foreach(__v => __obj.update("SamplingRuleRecords", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSamplingRulesResult]
    }
  }

  @js.native
  trait GetSamplingStatisticSummariesRequest extends js.Object {
    var NextToken: js.UndefOr[String]
  }

  object GetSamplingStatisticSummariesRequest {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined
    ): GetSamplingStatisticSummariesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSamplingStatisticSummariesRequest]
    }
  }

  @js.native
  trait GetSamplingStatisticSummariesResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var SamplingStatisticSummaries: js.UndefOr[SamplingStatisticSummaryList]
  }

  object GetSamplingStatisticSummariesResult {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        SamplingStatisticSummaries: js.UndefOr[SamplingStatisticSummaryList] = js.undefined
    ): GetSamplingStatisticSummariesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SamplingStatisticSummaries.foreach(__v => __obj.update("SamplingStatisticSummaries", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSamplingStatisticSummariesResult]
    }
  }

  @js.native
  trait GetSamplingTargetsRequest extends js.Object {
    var SamplingStatisticsDocuments: SamplingStatisticsDocumentList
  }

  object GetSamplingTargetsRequest {
    def apply(
        SamplingStatisticsDocuments: SamplingStatisticsDocumentList
    ): GetSamplingTargetsRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        LastRuleModification: js.UndefOr[Timestamp] = js.undefined,
        SamplingTargetDocuments: js.UndefOr[SamplingTargetDocumentList] = js.undefined,
        UnprocessedStatistics: js.UndefOr[UnprocessedStatisticsList] = js.undefined
    ): GetSamplingTargetsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      LastRuleModification.foreach(__v => __obj.update("LastRuleModification", __v.asInstanceOf[js.Any]))
      SamplingTargetDocuments.foreach(__v => __obj.update("SamplingTargetDocuments", __v.asInstanceOf[js.Any]))
      UnprocessedStatistics.foreach(__v => __obj.update("UnprocessedStatistics", __v.asInstanceOf[js.Any]))
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
    def apply(
        EndTime: Timestamp,
        StartTime: Timestamp,
        GroupARN: js.UndefOr[GroupARN] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): GetServiceGraphRequest = {
      val __obj = js.Dictionary[js.Any](
        "EndTime"   -> EndTime.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      GroupARN.foreach(__v => __obj.update("GroupARN", __v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.update("GroupName", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        ContainsOldGroupVersions: js.UndefOr[Boolean] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        Services: js.UndefOr[ServiceList] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined
    ): GetServiceGraphResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ContainsOldGroupVersions.foreach(__v => __obj.update("ContainsOldGroupVersions", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Services.foreach(__v => __obj.update("Services", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceGraphResult]
    }
  }

  @js.native
  trait GetTimeSeriesServiceStatisticsRequest extends js.Object {
    var EndTime: Timestamp
    var StartTime: Timestamp
    var EntitySelectorExpression: js.UndefOr[EntitySelectorExpression]
    var GroupARN: js.UndefOr[GroupARN]
    var GroupName: js.UndefOr[GroupName]
    var NextToken: js.UndefOr[String]
    var Period: js.UndefOr[NullableInteger]
  }

  object GetTimeSeriesServiceStatisticsRequest {
    def apply(
        EndTime: Timestamp,
        StartTime: Timestamp,
        EntitySelectorExpression: js.UndefOr[EntitySelectorExpression] = js.undefined,
        GroupARN: js.UndefOr[GroupARN] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        Period: js.UndefOr[NullableInteger] = js.undefined
    ): GetTimeSeriesServiceStatisticsRequest = {
      val __obj = js.Dictionary[js.Any](
        "EndTime"   -> EndTime.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      EntitySelectorExpression.foreach(__v => __obj.update("EntitySelectorExpression", __v.asInstanceOf[js.Any]))
      GroupARN.foreach(__v => __obj.update("GroupARN", __v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.update("GroupName", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Period.foreach(__v => __obj.update("Period", __v.asInstanceOf[js.Any]))
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
    def apply(
        ContainsOldGroupVersions: js.UndefOr[Boolean] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        TimeSeriesServiceStatistics: js.UndefOr[TimeSeriesServiceStatisticsList] = js.undefined
    ): GetTimeSeriesServiceStatisticsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ContainsOldGroupVersions.foreach(__v => __obj.update("ContainsOldGroupVersions", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      TimeSeriesServiceStatistics.foreach(__v => __obj.update("TimeSeriesServiceStatistics", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTimeSeriesServiceStatisticsResult]
    }
  }

  @js.native
  trait GetTraceGraphRequest extends js.Object {
    var TraceIds: TraceIdList
    var NextToken: js.UndefOr[String]
  }

  object GetTraceGraphRequest {
    def apply(
        TraceIds: TraceIdList,
        NextToken: js.UndefOr[String] = js.undefined
    ): GetTraceGraphRequest = {
      val __obj = js.Dictionary[js.Any](
        "TraceIds" -> TraceIds.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTraceGraphRequest]
    }
  }

  @js.native
  trait GetTraceGraphResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Services: js.UndefOr[ServiceList]
  }

  object GetTraceGraphResult {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Services: js.UndefOr[ServiceList] = js.undefined
    ): GetTraceGraphResult = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Services.foreach(__v => __obj.update("Services", __v.asInstanceOf[js.Any]))
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
    def apply(
        EndTime: Timestamp,
        StartTime: Timestamp,
        FilterExpression: js.UndefOr[FilterExpression] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        Sampling: js.UndefOr[NullableBoolean] = js.undefined,
        SamplingStrategy: js.UndefOr[SamplingStrategy] = js.undefined,
        TimeRangeType: js.UndefOr[TimeRangeType] = js.undefined
    ): GetTraceSummariesRequest = {
      val __obj = js.Dictionary[js.Any](
        "EndTime"   -> EndTime.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      FilterExpression.foreach(__v => __obj.update("FilterExpression", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Sampling.foreach(__v => __obj.update("Sampling", __v.asInstanceOf[js.Any]))
      SamplingStrategy.foreach(__v => __obj.update("SamplingStrategy", __v.asInstanceOf[js.Any]))
      TimeRangeType.foreach(__v => __obj.update("TimeRangeType", __v.asInstanceOf[js.Any]))
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
    def apply(
        ApproximateTime: js.UndefOr[Timestamp] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        TraceSummaries: js.UndefOr[TraceSummaryList] = js.undefined,
        TracesProcessedCount: js.UndefOr[NullableLong] = js.undefined
    ): GetTraceSummariesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      ApproximateTime.foreach(__v => __obj.update("ApproximateTime", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      TraceSummaries.foreach(__v => __obj.update("TraceSummaries", __v.asInstanceOf[js.Any]))
      TracesProcessedCount.foreach(__v => __obj.update("TracesProcessedCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTraceSummariesResult]
    }
  }

  /**
    * Details and metadata for a group.
    */
  @js.native
  trait Group extends js.Object {
    var FilterExpression: js.UndefOr[String]
    var GroupARN: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
  }

  object Group {
    def apply(
        FilterExpression: js.UndefOr[String] = js.undefined,
        GroupARN: js.UndefOr[String] = js.undefined,
        GroupName: js.UndefOr[String] = js.undefined
    ): Group = {
      val __obj = js.Dictionary.empty[js.Any]
      FilterExpression.foreach(__v => __obj.update("FilterExpression", __v.asInstanceOf[js.Any]))
      GroupARN.foreach(__v => __obj.update("GroupARN", __v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.update("GroupName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Group]
    }
  }

  /**
    * Details for a group without metadata.
    */
  @js.native
  trait GroupSummary extends js.Object {
    var FilterExpression: js.UndefOr[String]
    var GroupARN: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
  }

  object GroupSummary {
    def apply(
        FilterExpression: js.UndefOr[String] = js.undefined,
        GroupARN: js.UndefOr[String] = js.undefined,
        GroupName: js.UndefOr[String] = js.undefined
    ): GroupSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      FilterExpression.foreach(__v => __obj.update("FilterExpression", __v.asInstanceOf[js.Any]))
      GroupARN.foreach(__v => __obj.update("GroupARN", __v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.update("GroupName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupSummary]
    }
  }

  /**
    * An entry in a histogram for a statistic. A histogram maps the range of observed values on the X axis, and the prevalence of each value on the Y axis.
    */
  @js.native
  trait HistogramEntry extends js.Object {
    var Count: js.UndefOr[Int]
    var Value: js.UndefOr[Double]
  }

  object HistogramEntry {
    def apply(
        Count: js.UndefOr[Int] = js.undefined,
        Value: js.UndefOr[Double] = js.undefined
    ): HistogramEntry = {
      val __obj = js.Dictionary.empty[js.Any]
      Count.foreach(__v => __obj.update("Count", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HistogramEntry]
    }
  }

  /**
    * Information about an HTTP request.
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
    def apply(
        ClientIp: js.UndefOr[String] = js.undefined,
        HttpMethod: js.UndefOr[String] = js.undefined,
        HttpStatus: js.UndefOr[NullableInteger] = js.undefined,
        HttpURL: js.UndefOr[String] = js.undefined,
        UserAgent: js.UndefOr[String] = js.undefined
    ): Http = {
      val __obj = js.Dictionary.empty[js.Any]
      ClientIp.foreach(__v => __obj.update("ClientIp", __v.asInstanceOf[js.Any]))
      HttpMethod.foreach(__v => __obj.update("HttpMethod", __v.asInstanceOf[js.Any]))
      HttpStatus.foreach(__v => __obj.update("HttpStatus", __v.asInstanceOf[js.Any]))
      HttpURL.foreach(__v => __obj.update("HttpURL", __v.asInstanceOf[js.Any]))
      UserAgent.foreach(__v => __obj.update("UserAgent", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Http]
    }
  }

  /**
    * A list of EC2 instance IDs corresponding to the segments in a trace.
    */
  @js.native
  trait InstanceIdDetail extends js.Object {
    var Id: js.UndefOr[String]
  }

  object InstanceIdDetail {
    def apply(
        Id: js.UndefOr[String] = js.undefined
    ): InstanceIdDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceIdDetail]
    }
  }

  @js.native
  trait PutEncryptionConfigRequest extends js.Object {
    var Type: EncryptionType
    var KeyId: js.UndefOr[EncryptionKeyId]
  }

  object PutEncryptionConfigRequest {
    def apply(
        Type: EncryptionType,
        KeyId: js.UndefOr[EncryptionKeyId] = js.undefined
    ): PutEncryptionConfigRequest = {
      val __obj = js.Dictionary[js.Any](
        "Type" -> Type.asInstanceOf[js.Any]
      )

      KeyId.foreach(__v => __obj.update("KeyId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEncryptionConfigRequest]
    }
  }

  @js.native
  trait PutEncryptionConfigResult extends js.Object {
    var EncryptionConfig: js.UndefOr[EncryptionConfig]
  }

  object PutEncryptionConfigResult {
    def apply(
        EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined
    ): PutEncryptionConfigResult = {
      val __obj = js.Dictionary.empty[js.Any]
      EncryptionConfig.foreach(__v => __obj.update("EncryptionConfig", __v.asInstanceOf[js.Any]))
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
    def apply(
        TelemetryRecords: TelemetryRecordList,
        EC2InstanceId: js.UndefOr[EC2InstanceId] = js.undefined,
        Hostname: js.UndefOr[Hostname] = js.undefined,
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    ): PutTelemetryRecordsRequest = {
      val __obj = js.Dictionary[js.Any](
        "TelemetryRecords" -> TelemetryRecords.asInstanceOf[js.Any]
      )

      EC2InstanceId.foreach(__v => __obj.update("EC2InstanceId", __v.asInstanceOf[js.Any]))
      Hostname.foreach(__v => __obj.update("Hostname", __v.asInstanceOf[js.Any]))
      ResourceARN.foreach(__v => __obj.update("ResourceARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutTelemetryRecordsRequest]
    }
  }

  @js.native
  trait PutTelemetryRecordsResult extends js.Object {}

  object PutTelemetryRecordsResult {
    def apply(
        ): PutTelemetryRecordsResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[PutTelemetryRecordsResult]
    }
  }

  @js.native
  trait PutTraceSegmentsRequest extends js.Object {
    var TraceSegmentDocuments: TraceSegmentDocumentList
  }

  object PutTraceSegmentsRequest {
    def apply(
        TraceSegmentDocuments: TraceSegmentDocumentList
    ): PutTraceSegmentsRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        UnprocessedTraceSegments: js.UndefOr[UnprocessedTraceSegmentList] = js.undefined
    ): PutTraceSegmentsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      UnprocessedTraceSegments.foreach(__v => __obj.update("UnprocessedTraceSegments", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutTraceSegmentsResult]
    }
  }

  /**
    * A list of resources ARNs corresponding to the segments in a trace.
    */
  @js.native
  trait ResourceARNDetail extends js.Object {
    var ARN: js.UndefOr[String]
  }

  object ResourceARNDetail {
    def apply(
        ARN: js.UndefOr[String] = js.undefined
    ): ResourceARNDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      ARN.foreach(__v => __obj.update("ARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceARNDetail]
    }
  }

  /**
    * The root cause information for a response time warning.
    */
  @js.native
  trait ResponseTimeRootCause extends js.Object {
    var Services: js.UndefOr[ResponseTimeRootCauseServices]
  }

  object ResponseTimeRootCause {
    def apply(
        Services: js.UndefOr[ResponseTimeRootCauseServices] = js.undefined
    ): ResponseTimeRootCause = {
      val __obj = js.Dictionary.empty[js.Any]
      Services.foreach(__v => __obj.update("Services", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResponseTimeRootCause]
    }
  }

  /**
    * A collection of segments and corresponding subsegments associated to a response time warning.
    */
  @js.native
  trait ResponseTimeRootCauseEntity extends js.Object {
    var Coverage: js.UndefOr[NullableDouble]
    var Name: js.UndefOr[String]
    var Remote: js.UndefOr[NullableBoolean]
  }

  object ResponseTimeRootCauseEntity {
    def apply(
        Coverage: js.UndefOr[NullableDouble] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Remote: js.UndefOr[NullableBoolean] = js.undefined
    ): ResponseTimeRootCauseEntity = {
      val __obj = js.Dictionary.empty[js.Any]
      Coverage.foreach(__v => __obj.update("Coverage", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Remote.foreach(__v => __obj.update("Remote", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResponseTimeRootCauseEntity]
    }
  }

  /**
    * A collection of fields identifying the service in a response time warning.
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
    def apply(
        AccountId: js.UndefOr[String] = js.undefined,
        EntityPath: js.UndefOr[ResponseTimeRootCauseEntityPath] = js.undefined,
        Inferred: js.UndefOr[NullableBoolean] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Names: js.UndefOr[ServiceNames] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): ResponseTimeRootCauseService = {
      val __obj = js.Dictionary.empty[js.Any]
      AccountId.foreach(__v => __obj.update("AccountId", __v.asInstanceOf[js.Any]))
      EntityPath.foreach(__v => __obj.update("EntityPath", __v.asInstanceOf[js.Any]))
      Inferred.foreach(__v => __obj.update("Inferred", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.update("Names", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResponseTimeRootCauseService]
    }
  }

  /**
    * The exception associated with a root cause.
    */
  @js.native
  trait RootCauseException extends js.Object {
    var Message: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object RootCauseException {
    def apply(
        Message: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined
    ): RootCauseException = {
      val __obj = js.Dictionary.empty[js.Any]
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RootCauseException]
    }
  }

  /**
    * A sampling rule that services use to decide whether to instrument a request. Rule fields can match properties of the service, or properties of a request. The service can ignore rules that don't match its properties.
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
      val __obj = js.Dictionary[js.Any](
        "FixedRate"     -> FixedRate.asInstanceOf[js.Any],
        "HTTPMethod"    -> HTTPMethod.asInstanceOf[js.Any],
        "Host"          -> Host.asInstanceOf[js.Any],
        "Priority"      -> Priority.asInstanceOf[js.Any],
        "ReservoirSize" -> ReservoirSize.asInstanceOf[js.Any],
        "ResourceARN"   -> ResourceARN.asInstanceOf[js.Any],
        "ServiceName"   -> ServiceName.asInstanceOf[js.Any],
        "ServiceType"   -> ServiceType.asInstanceOf[js.Any],
        "URLPath"       -> URLPath.asInstanceOf[js.Any],
        "Version"       -> Version.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      RuleARN.foreach(__v => __obj.update("RuleARN", __v.asInstanceOf[js.Any]))
      RuleName.foreach(__v => __obj.update("RuleName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SamplingRule]
    }
  }

  /**
    * A <a>SamplingRule</a> and its metadata.
    */
  @js.native
  trait SamplingRuleRecord extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var ModifiedAt: js.UndefOr[Timestamp]
    var SamplingRule: js.UndefOr[SamplingRule]
  }

  object SamplingRuleRecord {
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        ModifiedAt: js.UndefOr[Timestamp] = js.undefined,
        SamplingRule: js.UndefOr[SamplingRule] = js.undefined
    ): SamplingRuleRecord = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedAt.foreach(__v => __obj.update("CreatedAt", __v.asInstanceOf[js.Any]))
      ModifiedAt.foreach(__v => __obj.update("ModifiedAt", __v.asInstanceOf[js.Any]))
      SamplingRule.foreach(__v => __obj.update("SamplingRule", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SamplingRuleRecord]
    }
  }

  /**
    * A document specifying changes to a sampling rule's configuration.
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
      val __obj = js.Dictionary.empty[js.Any]
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      FixedRate.foreach(__v => __obj.update("FixedRate", __v.asInstanceOf[js.Any]))
      HTTPMethod.foreach(__v => __obj.update("HTTPMethod", __v.asInstanceOf[js.Any]))
      Host.foreach(__v => __obj.update("Host", __v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.update("Priority", __v.asInstanceOf[js.Any]))
      ReservoirSize.foreach(__v => __obj.update("ReservoirSize", __v.asInstanceOf[js.Any]))
      ResourceARN.foreach(__v => __obj.update("ResourceARN", __v.asInstanceOf[js.Any]))
      RuleARN.foreach(__v => __obj.update("RuleARN", __v.asInstanceOf[js.Any]))
      RuleName.foreach(__v => __obj.update("RuleName", __v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.update("ServiceName", __v.asInstanceOf[js.Any]))
      ServiceType.foreach(__v => __obj.update("ServiceType", __v.asInstanceOf[js.Any]))
      URLPath.foreach(__v => __obj.update("URLPath", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SamplingRuleUpdate]
    }
  }

  /**
    * Aggregated request sampling data for a sampling rule across all services for a 10 second window.
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
    def apply(
        BorrowCount: js.UndefOr[Int] = js.undefined,
        RequestCount: js.UndefOr[Int] = js.undefined,
        RuleName: js.UndefOr[String] = js.undefined,
        SampledCount: js.UndefOr[Int] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): SamplingStatisticSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      BorrowCount.foreach(__v => __obj.update("BorrowCount", __v.asInstanceOf[js.Any]))
      RequestCount.foreach(__v => __obj.update("RequestCount", __v.asInstanceOf[js.Any]))
      RuleName.foreach(__v => __obj.update("RuleName", __v.asInstanceOf[js.Any]))
      SampledCount.foreach(__v => __obj.update("SampledCount", __v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.update("Timestamp", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SamplingStatisticSummary]
    }
  }

  /**
    * Request sampling results for a single rule from a service. Results are for the last 10 seconds unless the service has been assigned a longer reporting interval after a previous call to <a>GetSamplingTargets</a>.
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
    def apply(
        ClientID: ClientID,
        RequestCount: RequestCount,
        RuleName: RuleName,
        SampledCount: SampledCount,
        Timestamp: Timestamp,
        BorrowCount: js.UndefOr[BorrowCount] = js.undefined
    ): SamplingStatisticsDocument = {
      val __obj = js.Dictionary[js.Any](
        "ClientID"     -> ClientID.asInstanceOf[js.Any],
        "RequestCount" -> RequestCount.asInstanceOf[js.Any],
        "RuleName"     -> RuleName.asInstanceOf[js.Any],
        "SampledCount" -> SampledCount.asInstanceOf[js.Any],
        "Timestamp"    -> Timestamp.asInstanceOf[js.Any]
      )

      BorrowCount.foreach(__v => __obj.update("BorrowCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SamplingStatisticsDocument]
    }
  }

  /**
    * The name and value of a sampling rule to apply to a trace summary.
    */
  @js.native
  trait SamplingStrategy extends js.Object {
    var Name: js.UndefOr[SamplingStrategyName]
    var Value: js.UndefOr[NullableDouble]
  }

  object SamplingStrategy {
    def apply(
        Name: js.UndefOr[SamplingStrategyName] = js.undefined,
        Value: js.UndefOr[NullableDouble] = js.undefined
    ): SamplingStrategy = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SamplingStrategy]
    }
  }

  object SamplingStrategyNameEnum {
    val PartialScan = "PartialScan"
    val FixedRate   = "FixedRate"

    val values = IndexedSeq(PartialScan, FixedRate)
  }

  /**
    * Temporary changes to a sampling rule configuration. To meet the global sampling target for a rule, X-Ray calculates a new reservoir for each service based on the recent sampling results of all services that called <a>GetSamplingTargets</a>.
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
    def apply(
        FixedRate: js.UndefOr[Double] = js.undefined,
        Interval: js.UndefOr[NullableInteger] = js.undefined,
        ReservoirQuota: js.UndefOr[NullableInteger] = js.undefined,
        ReservoirQuotaTTL: js.UndefOr[Timestamp] = js.undefined,
        RuleName: js.UndefOr[String] = js.undefined
    ): SamplingTargetDocument = {
      val __obj = js.Dictionary.empty[js.Any]
      FixedRate.foreach(__v => __obj.update("FixedRate", __v.asInstanceOf[js.Any]))
      Interval.foreach(__v => __obj.update("Interval", __v.asInstanceOf[js.Any]))
      ReservoirQuota.foreach(__v => __obj.update("ReservoirQuota", __v.asInstanceOf[js.Any]))
      ReservoirQuotaTTL.foreach(__v => __obj.update("ReservoirQuotaTTL", __v.asInstanceOf[js.Any]))
      RuleName.foreach(__v => __obj.update("RuleName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SamplingTargetDocument]
    }
  }

  /**
    * A segment from a trace that has been ingested by the X-Ray service. The segment can be compiled from documents uploaded with <a>PutTraceSegments</a>, or an <code>inferred</code> segment for a downstream service, generated from a subsegment sent by the service that called it.
    *  For the full segment document schema, see [[https://docs.aws.amazon.com/xray/latest/devguide/xray-api-segmentdocuments.html|AWS X-Ray Segment Documents]] in the <i>AWS X-Ray Developer Guide</i>.
    */
  @js.native
  trait Segment extends js.Object {
    var Document: js.UndefOr[SegmentDocument]
    var Id: js.UndefOr[SegmentId]
  }

  object Segment {
    def apply(
        Document: js.UndefOr[SegmentDocument] = js.undefined,
        Id: js.UndefOr[SegmentId] = js.undefined
    ): Segment = {
      val __obj = js.Dictionary.empty[js.Any]
      Document.foreach(__v => __obj.update("Document", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Segment]
    }
  }

  /**
    * Information about an application that processed requests, users that made requests, or downstream services, resources and applications that an application used.
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
      val __obj = js.Dictionary.empty[js.Any]
      AccountId.foreach(__v => __obj.update("AccountId", __v.asInstanceOf[js.Any]))
      DurationHistogram.foreach(__v => __obj.update("DurationHistogram", __v.asInstanceOf[js.Any]))
      Edges.foreach(__v => __obj.update("Edges", __v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.update("EndTime", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.update("Names", __v.asInstanceOf[js.Any]))
      ReferenceId.foreach(__v => __obj.update("ReferenceId", __v.asInstanceOf[js.Any]))
      ResponseTimeHistogram.foreach(__v => __obj.update("ResponseTimeHistogram", __v.asInstanceOf[js.Any]))
      Root.foreach(__v => __obj.update("Root", __v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      SummaryStatistics.foreach(__v => __obj.update("SummaryStatistics", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Service]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait ServiceId extends js.Object {
    var AccountId: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Names: js.UndefOr[ServiceNames]
    var Type: js.UndefOr[String]
  }

  object ServiceId {
    def apply(
        AccountId: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Names: js.UndefOr[ServiceNames] = js.undefined,
        Type: js.UndefOr[String] = js.undefined
    ): ServiceId = {
      val __obj = js.Dictionary.empty[js.Any]
      AccountId.foreach(__v => __obj.update("AccountId", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.update("Names", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceId]
    }
  }

  /**
    * Response statistics for a service.
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
    def apply(
        ErrorStatistics: js.UndefOr[ErrorStatistics] = js.undefined,
        FaultStatistics: js.UndefOr[FaultStatistics] = js.undefined,
        OkCount: js.UndefOr[NullableLong] = js.undefined,
        TotalCount: js.UndefOr[NullableLong] = js.undefined,
        TotalResponseTime: js.UndefOr[NullableDouble] = js.undefined
    ): ServiceStatistics = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorStatistics.foreach(__v => __obj.update("ErrorStatistics", __v.asInstanceOf[js.Any]))
      FaultStatistics.foreach(__v => __obj.update("FaultStatistics", __v.asInstanceOf[js.Any]))
      OkCount.foreach(__v => __obj.update("OkCount", __v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.update("TotalCount", __v.asInstanceOf[js.Any]))
      TotalResponseTime.foreach(__v => __obj.update("TotalResponseTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceStatistics]
    }
  }

  /**
    * <p/>
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
    def apply(
        Timestamp: Timestamp,
        BackendConnectionErrors: js.UndefOr[BackendConnectionErrors] = js.undefined,
        SegmentsReceivedCount: js.UndefOr[NullableInteger] = js.undefined,
        SegmentsRejectedCount: js.UndefOr[NullableInteger] = js.undefined,
        SegmentsSentCount: js.UndefOr[NullableInteger] = js.undefined,
        SegmentsSpilloverCount: js.UndefOr[NullableInteger] = js.undefined
    ): TelemetryRecord = {
      val __obj = js.Dictionary[js.Any](
        "Timestamp" -> Timestamp.asInstanceOf[js.Any]
      )

      BackendConnectionErrors.foreach(__v => __obj.update("BackendConnectionErrors", __v.asInstanceOf[js.Any]))
      SegmentsReceivedCount.foreach(__v => __obj.update("SegmentsReceivedCount", __v.asInstanceOf[js.Any]))
      SegmentsRejectedCount.foreach(__v => __obj.update("SegmentsRejectedCount", __v.asInstanceOf[js.Any]))
      SegmentsSentCount.foreach(__v => __obj.update("SegmentsSentCount", __v.asInstanceOf[js.Any]))
      SegmentsSpilloverCount.foreach(__v => __obj.update("SegmentsSpilloverCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TelemetryRecord]
    }
  }

  object TimeRangeTypeEnum {
    val TraceId = "TraceId"
    val Event   = "Event"

    val values = IndexedSeq(TraceId, Event)
  }

  /**
    * A list of TimeSeriesStatistic structures.
    */
  @js.native
  trait TimeSeriesServiceStatistics extends js.Object {
    var EdgeSummaryStatistics: js.UndefOr[EdgeStatistics]
    var ResponseTimeHistogram: js.UndefOr[Histogram]
    var ServiceSummaryStatistics: js.UndefOr[ServiceStatistics]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object TimeSeriesServiceStatistics {
    def apply(
        EdgeSummaryStatistics: js.UndefOr[EdgeStatistics] = js.undefined,
        ResponseTimeHistogram: js.UndefOr[Histogram] = js.undefined,
        ServiceSummaryStatistics: js.UndefOr[ServiceStatistics] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): TimeSeriesServiceStatistics = {
      val __obj = js.Dictionary.empty[js.Any]
      EdgeSummaryStatistics.foreach(__v => __obj.update("EdgeSummaryStatistics", __v.asInstanceOf[js.Any]))
      ResponseTimeHistogram.foreach(__v => __obj.update("ResponseTimeHistogram", __v.asInstanceOf[js.Any]))
      ServiceSummaryStatistics.foreach(__v => __obj.update("ServiceSummaryStatistics", __v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.update("Timestamp", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeSeriesServiceStatistics]
    }
  }

  /**
    * A collection of segment documents with matching trace IDs.
    */
  @js.native
  trait Trace extends js.Object {
    var Duration: js.UndefOr[NullableDouble]
    var Id: js.UndefOr[TraceId]
    var Segments: js.UndefOr[SegmentList]
  }

  object Trace {
    def apply(
        Duration: js.UndefOr[NullableDouble] = js.undefined,
        Id: js.UndefOr[TraceId] = js.undefined,
        Segments: js.UndefOr[SegmentList] = js.undefined
    ): Trace = {
      val __obj = js.Dictionary.empty[js.Any]
      Duration.foreach(__v => __obj.update("Duration", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Segments.foreach(__v => __obj.update("Segments", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Trace]
    }
  }

  /**
    * Metadata generated from the segment documents in a trace.
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
      val __obj = js.Dictionary.empty[js.Any]
      Annotations.foreach(__v => __obj.update("Annotations", __v.asInstanceOf[js.Any]))
      AvailabilityZones.foreach(__v => __obj.update("AvailabilityZones", __v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.update("Duration", __v.asInstanceOf[js.Any]))
      EntryPoint.foreach(__v => __obj.update("EntryPoint", __v.asInstanceOf[js.Any]))
      ErrorRootCauses.foreach(__v => __obj.update("ErrorRootCauses", __v.asInstanceOf[js.Any]))
      FaultRootCauses.foreach(__v => __obj.update("FaultRootCauses", __v.asInstanceOf[js.Any]))
      HasError.foreach(__v => __obj.update("HasError", __v.asInstanceOf[js.Any]))
      HasFault.foreach(__v => __obj.update("HasFault", __v.asInstanceOf[js.Any]))
      HasThrottle.foreach(__v => __obj.update("HasThrottle", __v.asInstanceOf[js.Any]))
      Http.foreach(__v => __obj.update("Http", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      InstanceIds.foreach(__v => __obj.update("InstanceIds", __v.asInstanceOf[js.Any]))
      IsPartial.foreach(__v => __obj.update("IsPartial", __v.asInstanceOf[js.Any]))
      MatchedEventTime.foreach(__v => __obj.update("MatchedEventTime", __v.asInstanceOf[js.Any]))
      ResourceARNs.foreach(__v => __obj.update("ResourceARNs", __v.asInstanceOf[js.Any]))
      ResponseTime.foreach(__v => __obj.update("ResponseTime", __v.asInstanceOf[js.Any]))
      ResponseTimeRootCauses.foreach(__v => __obj.update("ResponseTimeRootCauses", __v.asInstanceOf[js.Any]))
      Revision.foreach(__v => __obj.update("Revision", __v.asInstanceOf[js.Any]))
      ServiceIds.foreach(__v => __obj.update("ServiceIds", __v.asInstanceOf[js.Any]))
      Users.foreach(__v => __obj.update("Users", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TraceSummary]
    }
  }

  /**
    * Information about a user recorded in segment documents.
    */
  @js.native
  trait TraceUser extends js.Object {
    var ServiceIds: js.UndefOr[ServiceIds]
    var UserName: js.UndefOr[String]
  }

  object TraceUser {
    def apply(
        ServiceIds: js.UndefOr[ServiceIds] = js.undefined,
        UserName: js.UndefOr[String] = js.undefined
    ): TraceUser = {
      val __obj = js.Dictionary.empty[js.Any]
      ServiceIds.foreach(__v => __obj.update("ServiceIds", __v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TraceUser]
    }
  }

  /**
    * Sampling statistics from a call to <a>GetSamplingTargets</a> that X-Ray could not process.
    */
  @js.native
  trait UnprocessedStatistics extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var Message: js.UndefOr[String]
    var RuleName: js.UndefOr[String]
  }

  object UnprocessedStatistics {
    def apply(
        ErrorCode: js.UndefOr[String] = js.undefined,
        Message: js.UndefOr[String] = js.undefined,
        RuleName: js.UndefOr[String] = js.undefined
    ): UnprocessedStatistics = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorCode.foreach(__v => __obj.update("ErrorCode", __v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      RuleName.foreach(__v => __obj.update("RuleName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnprocessedStatistics]
    }
  }

  /**
    * Information about a segment that failed processing.
    */
  @js.native
  trait UnprocessedTraceSegment extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var Id: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  object UnprocessedTraceSegment {
    def apply(
        ErrorCode: js.UndefOr[String] = js.undefined,
        Id: js.UndefOr[String] = js.undefined,
        Message: js.UndefOr[String] = js.undefined
    ): UnprocessedTraceSegment = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorCode.foreach(__v => __obj.update("ErrorCode", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnprocessedTraceSegment]
    }
  }

  @js.native
  trait UpdateGroupRequest extends js.Object {
    var FilterExpression: js.UndefOr[FilterExpression]
    var GroupARN: js.UndefOr[GroupARN]
    var GroupName: js.UndefOr[GroupName]
  }

  object UpdateGroupRequest {
    def apply(
        FilterExpression: js.UndefOr[FilterExpression] = js.undefined,
        GroupARN: js.UndefOr[GroupARN] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined
    ): UpdateGroupRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      FilterExpression.foreach(__v => __obj.update("FilterExpression", __v.asInstanceOf[js.Any]))
      GroupARN.foreach(__v => __obj.update("GroupARN", __v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.update("GroupName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupRequest]
    }
  }

  @js.native
  trait UpdateGroupResult extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object UpdateGroupResult {
    def apply(
        Group: js.UndefOr[Group] = js.undefined
    ): UpdateGroupResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Group.foreach(__v => __obj.update("Group", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupResult]
    }
  }

  @js.native
  trait UpdateSamplingRuleRequest extends js.Object {
    var SamplingRuleUpdate: SamplingRuleUpdate
  }

  object UpdateSamplingRuleRequest {
    def apply(
        SamplingRuleUpdate: SamplingRuleUpdate
    ): UpdateSamplingRuleRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        SamplingRuleRecord: js.UndefOr[SamplingRuleRecord] = js.undefined
    ): UpdateSamplingRuleResult = {
      val __obj = js.Dictionary.empty[js.Any]
      SamplingRuleRecord.foreach(__v => __obj.update("SamplingRuleRecord", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSamplingRuleResult]
    }
  }

  /**
    * Information about a segment annotation.
    */
  @js.native
  trait ValueWithServiceIds extends js.Object {
    var AnnotationValue: js.UndefOr[AnnotationValue]
    var ServiceIds: js.UndefOr[ServiceIds]
  }

  object ValueWithServiceIds {
    def apply(
        AnnotationValue: js.UndefOr[AnnotationValue] = js.undefined,
        ServiceIds: js.UndefOr[ServiceIds] = js.undefined
    ): ValueWithServiceIds = {
      val __obj = js.Dictionary.empty[js.Any]
      AnnotationValue.foreach(__v => __obj.update("AnnotationValue", __v.asInstanceOf[js.Any]))
      ServiceIds.foreach(__v => __obj.update("ServiceIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValueWithServiceIds]
    }
  }
}
