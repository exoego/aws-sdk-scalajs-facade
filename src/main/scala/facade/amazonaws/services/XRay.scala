package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object xray {
  type AliasList = js.Array[Alias]
  type AliasNames = js.Array[String]
  type AnnotationKey = String
  type Annotations = js.Dictionary[ValuesWithServiceIds]
  type AttributeKey = String
  type AttributeMap = js.Dictionary[AttributeValue]
  type AttributeValue = String
  type BorrowCount = Int
  type ClientID = String
  type EC2InstanceId = String
  type EdgeList = js.Array[Edge]
  type EncryptionKeyId = String
  type EncryptionStatus = String
  type EncryptionType = String
  type ErrorRootCauseEntityPath = js.Array[ErrorRootCauseEntity]
  type ErrorRootCauseServices = js.Array[ErrorRootCauseService]
  type ErrorRootCauses = js.Array[ErrorRootCause]
  type FaultRootCauseEntityPath = js.Array[FaultRootCauseEntity]
  type FaultRootCauseServices = js.Array[FaultRootCauseService]
  type FaultRootCauses = js.Array[FaultRootCause]
  type FilterExpression = String
  type FixedRate = Double
  type GetGroupsNextToken = String
  type GroupARN = String
  type GroupName = String
  type GroupSummaryList = js.Array[GroupSummary]
  type HTTPMethod = String
  type Histogram = js.Array[HistogramEntry]
  type Host = String
  type Hostname = String
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
  type TelemetryRecordList = js.Array[TelemetryRecord]
  type Timestamp = js.Date
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
}

package xray {
  @js.native
  @JSImport("aws-sdk", "XRay")
  class XRay(config: AWSConfig) extends js.Object {
    def batchGetTraces(params: BatchGetTracesRequest): Request[BatchGetTracesResult] = js.native
    def createGroup(params: CreateGroupRequest): Request[CreateGroupResult] = js.native
    def createSamplingRule(params: CreateSamplingRuleRequest): Request[CreateSamplingRuleResult] = js.native
    def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResult] = js.native
    def deleteSamplingRule(params: DeleteSamplingRuleRequest): Request[DeleteSamplingRuleResult] = js.native
    def getEncryptionConfig(params: GetEncryptionConfigRequest): Request[GetEncryptionConfigResult] = js.native
    def getGroup(params: GetGroupRequest): Request[GetGroupResult] = js.native
    def getGroups(params: GetGroupsRequest): Request[GetGroupsResult] = js.native
    def getSamplingRules(params: GetSamplingRulesRequest): Request[GetSamplingRulesResult] = js.native
    def getSamplingStatisticSummaries(params: GetSamplingStatisticSummariesRequest): Request[GetSamplingStatisticSummariesResult] = js.native
    def getSamplingTargets(params: GetSamplingTargetsRequest): Request[GetSamplingTargetsResult] = js.native
    def getServiceGraph(params: GetServiceGraphRequest): Request[GetServiceGraphResult] = js.native
    def getTraceGraph(params: GetTraceGraphRequest): Request[GetTraceGraphResult] = js.native
    def getTraceSummaries(params: GetTraceSummariesRequest): Request[GetTraceSummariesResult] = js.native
    def putEncryptionConfig(params: PutEncryptionConfigRequest): Request[PutEncryptionConfigResult] = js.native
    def putTelemetryRecords(params: PutTelemetryRecordsRequest): Request[PutTelemetryRecordsResult] = js.native
    def putTraceSegments(params: PutTraceSegmentsRequest): Request[PutTraceSegmentsResult] = js.native
    def updateGroup(params: UpdateGroupRequest): Request[UpdateGroupResult] = js.native
    def updateSamplingRule(params: UpdateSamplingRuleRequest): Request[UpdateSamplingRuleResult] = js.native
  }

  /**
   * <p>An alias for an edge.</p>
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
      Type: js.UndefOr[String] = js.undefined): Alias = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Alias]
    }
  }

  /**
   * <p>Value of a segment annotation. Has one of three value types: Number, Boolean or String.</p>
   */
  @js.native
  trait AnnotationValue extends js.Object {
    var NumberValue: js.UndefOr[NullableDouble]
    var BooleanValue: js.UndefOr[NullableBoolean]
    var StringValue: js.UndefOr[String]
  }

  object AnnotationValue {
    def apply(
      NumberValue: js.UndefOr[NullableDouble] = js.undefined,
      BooleanValue: js.UndefOr[NullableBoolean] = js.undefined,
      StringValue: js.UndefOr[String] = js.undefined): AnnotationValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NumberValue" -> NumberValue.map { x => x.asInstanceOf[js.Any] },
        "BooleanValue" -> BooleanValue.map { x => x.asInstanceOf[js.Any] },
        "StringValue" -> StringValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AnnotationValue]
    }
  }

  /**
   * <p>A list of availability zones corresponding to the segments in a trace.</p>
   */
  @js.native
  trait AvailabilityZoneDetail extends js.Object {
    var Name: js.UndefOr[String]
  }

  object AvailabilityZoneDetail {
    def apply(
      Name: js.UndefOr[String] = js.undefined): AvailabilityZoneDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailabilityZoneDetail]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait BackendConnectionErrors extends js.Object {
    var TimeoutCount: js.UndefOr[NullableInteger]
    var HTTPCode5XXCount: js.UndefOr[NullableInteger]
    var HTTPCode4XXCount: js.UndefOr[NullableInteger]
    var UnknownHostCount: js.UndefOr[NullableInteger]
    var OtherCount: js.UndefOr[NullableInteger]
    var ConnectionRefusedCount: js.UndefOr[NullableInteger]
  }

  object BackendConnectionErrors {
    def apply(
      TimeoutCount: js.UndefOr[NullableInteger] = js.undefined,
      HTTPCode5XXCount: js.UndefOr[NullableInteger] = js.undefined,
      HTTPCode4XXCount: js.UndefOr[NullableInteger] = js.undefined,
      UnknownHostCount: js.UndefOr[NullableInteger] = js.undefined,
      OtherCount: js.UndefOr[NullableInteger] = js.undefined,
      ConnectionRefusedCount: js.UndefOr[NullableInteger] = js.undefined): BackendConnectionErrors = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TimeoutCount" -> TimeoutCount.map { x => x.asInstanceOf[js.Any] },
        "HTTPCode5XXCount" -> HTTPCode5XXCount.map { x => x.asInstanceOf[js.Any] },
        "HTTPCode4XXCount" -> HTTPCode4XXCount.map { x => x.asInstanceOf[js.Any] },
        "UnknownHostCount" -> UnknownHostCount.map { x => x.asInstanceOf[js.Any] },
        "OtherCount" -> OtherCount.map { x => x.asInstanceOf[js.Any] },
        "ConnectionRefusedCount" -> ConnectionRefusedCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BackendConnectionErrors]
    }
  }

  @js.native
  trait BatchGetTracesRequest extends js.Object {
    var TraceIds: js.UndefOr[TraceIdList]
    var NextToken: js.UndefOr[String]
  }

  object BatchGetTracesRequest {
    def apply(
      TraceIds: js.UndefOr[TraceIdList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): BatchGetTracesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TraceIds" -> TraceIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetTracesRequest]
    }
  }

  @js.native
  trait BatchGetTracesResult extends js.Object {
    var Traces: js.UndefOr[TraceList]
    var UnprocessedTraceIds: js.UndefOr[UnprocessedTraceIdList]
    var NextToken: js.UndefOr[String]
  }

  object BatchGetTracesResult {
    def apply(
      Traces: js.UndefOr[TraceList] = js.undefined,
      UnprocessedTraceIds: js.UndefOr[UnprocessedTraceIdList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): BatchGetTracesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Traces" -> Traces.map { x => x.asInstanceOf[js.Any] },
        "UnprocessedTraceIds" -> UnprocessedTraceIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchGetTracesResult]
    }
  }

  @js.native
  trait CreateGroupRequest extends js.Object {
    var GroupName: js.UndefOr[GroupName]
    var FilterExpression: js.UndefOr[FilterExpression]
  }

  object CreateGroupRequest {
    def apply(
      GroupName: js.UndefOr[GroupName] = js.undefined,
      FilterExpression: js.UndefOr[FilterExpression] = js.undefined): CreateGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "FilterExpression" -> FilterExpression.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupRequest]
    }
  }

  @js.native
  trait CreateGroupResult extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object CreateGroupResult {
    def apply(
      Group: js.UndefOr[Group] = js.undefined): CreateGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupResult]
    }
  }

  @js.native
  trait CreateSamplingRuleRequest extends js.Object {
    var SamplingRule: js.UndefOr[SamplingRule]
  }

  object CreateSamplingRuleRequest {
    def apply(
      SamplingRule: js.UndefOr[SamplingRule] = js.undefined): CreateSamplingRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SamplingRule" -> SamplingRule.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSamplingRuleRequest]
    }
  }

  @js.native
  trait CreateSamplingRuleResult extends js.Object {
    var SamplingRuleRecord: js.UndefOr[SamplingRuleRecord]
  }

  object CreateSamplingRuleResult {
    def apply(
      SamplingRuleRecord: js.UndefOr[SamplingRuleRecord] = js.undefined): CreateSamplingRuleResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SamplingRuleRecord" -> SamplingRuleRecord.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSamplingRuleResult]
    }
  }

  @js.native
  trait DeleteGroupRequest extends js.Object {
    var GroupName: js.UndefOr[GroupName]
    var GroupARN: js.UndefOr[GroupARN]
  }

  object DeleteGroupRequest {
    def apply(
      GroupName: js.UndefOr[GroupName] = js.undefined,
      GroupARN: js.UndefOr[GroupARN] = js.undefined): DeleteGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "GroupARN" -> GroupARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGroupRequest]
    }
  }

  @js.native
  trait DeleteGroupResult extends js.Object {

  }

  object DeleteGroupResult {
    def apply(): DeleteGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGroupResult]
    }
  }

  @js.native
  trait DeleteSamplingRuleRequest extends js.Object {
    var RuleName: js.UndefOr[String]
    var RuleARN: js.UndefOr[String]
  }

  object DeleteSamplingRuleRequest {
    def apply(
      RuleName: js.UndefOr[String] = js.undefined,
      RuleARN: js.UndefOr[String] = js.undefined): DeleteSamplingRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleName" -> RuleName.map { x => x.asInstanceOf[js.Any] },
        "RuleARN" -> RuleARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSamplingRuleRequest]
    }
  }

  @js.native
  trait DeleteSamplingRuleResult extends js.Object {
    var SamplingRuleRecord: js.UndefOr[SamplingRuleRecord]
  }

  object DeleteSamplingRuleResult {
    def apply(
      SamplingRuleRecord: js.UndefOr[SamplingRuleRecord] = js.undefined): DeleteSamplingRuleResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SamplingRuleRecord" -> SamplingRuleRecord.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSamplingRuleResult]
    }
  }

  /**
   * <p>Information about a connection between two services.</p>
   */
  @js.native
  trait Edge extends js.Object {
    var StartTime: js.UndefOr[Timestamp]
    var EndTime: js.UndefOr[Timestamp]
    var ReferenceId: js.UndefOr[NullableInteger]
    var SummaryStatistics: js.UndefOr[EdgeStatistics]
    var ResponseTimeHistogram: js.UndefOr[Histogram]
    var Aliases: js.UndefOr[AliasList]
  }

  object Edge {
    def apply(
      StartTime: js.UndefOr[Timestamp] = js.undefined,
      EndTime: js.UndefOr[Timestamp] = js.undefined,
      ReferenceId: js.UndefOr[NullableInteger] = js.undefined,
      SummaryStatistics: js.UndefOr[EdgeStatistics] = js.undefined,
      ResponseTimeHistogram: js.UndefOr[Histogram] = js.undefined,
      Aliases: js.UndefOr[AliasList] = js.undefined): Edge = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "ReferenceId" -> ReferenceId.map { x => x.asInstanceOf[js.Any] },
        "SummaryStatistics" -> SummaryStatistics.map { x => x.asInstanceOf[js.Any] },
        "ResponseTimeHistogram" -> ResponseTimeHistogram.map { x => x.asInstanceOf[js.Any] },
        "Aliases" -> Aliases.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Edge]
    }
  }

  /**
   * <p>Response statistics for an edge.</p>
   */
  @js.native
  trait EdgeStatistics extends js.Object {
    var FaultStatistics: js.UndefOr[FaultStatistics]
    var TotalResponseTime: js.UndefOr[NullableDouble]
    var OkCount: js.UndefOr[NullableLong]
    var TotalCount: js.UndefOr[NullableLong]
    var ErrorStatistics: js.UndefOr[ErrorStatistics]
  }

  object EdgeStatistics {
    def apply(
      FaultStatistics: js.UndefOr[FaultStatistics] = js.undefined,
      TotalResponseTime: js.UndefOr[NullableDouble] = js.undefined,
      OkCount: js.UndefOr[NullableLong] = js.undefined,
      TotalCount: js.UndefOr[NullableLong] = js.undefined,
      ErrorStatistics: js.UndefOr[ErrorStatistics] = js.undefined): EdgeStatistics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FaultStatistics" -> FaultStatistics.map { x => x.asInstanceOf[js.Any] },
        "TotalResponseTime" -> TotalResponseTime.map { x => x.asInstanceOf[js.Any] },
        "OkCount" -> OkCount.map { x => x.asInstanceOf[js.Any] },
        "TotalCount" -> TotalCount.map { x => x.asInstanceOf[js.Any] },
        "ErrorStatistics" -> ErrorStatistics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EdgeStatistics]
    }
  }

  /**
   * <p>A configuration document that specifies encryption configuration settings.</p>
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
      Type: js.UndefOr[EncryptionType] = js.undefined): EncryptionConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptionConfig]
    }
  }

  object EncryptionStatusEnum {
    val UPDATING = "UPDATING"
    val ACTIVE = "ACTIVE"

    val values = IndexedSeq(UPDATING, ACTIVE)
  }

  object EncryptionTypeEnum {
    val NONE = "NONE"
    val KMS = "KMS"

    val values = IndexedSeq(NONE, KMS)
  }

  /**
   * <p>The root cause of a trace summary error.</p>
   */
  @js.native
  trait ErrorRootCause extends js.Object {
    var Services: js.UndefOr[ErrorRootCauseServices]
  }

  object ErrorRootCause {
    def apply(
      Services: js.UndefOr[ErrorRootCauseServices] = js.undefined): ErrorRootCause = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Services" -> Services.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ErrorRootCause]
    }
  }

  /**
   * <p>A collection of segments and corresponding subsegments associated to a trace summary error.</p>
   */
  @js.native
  trait ErrorRootCauseEntity extends js.Object {
    var Name: js.UndefOr[String]
    var Exceptions: js.UndefOr[RootCauseExceptions]
    var Remote: js.UndefOr[NullableBoolean]
  }

  object ErrorRootCauseEntity {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Exceptions: js.UndefOr[RootCauseExceptions] = js.undefined,
      Remote: js.UndefOr[NullableBoolean] = js.undefined): ErrorRootCauseEntity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Exceptions" -> Exceptions.map { x => x.asInstanceOf[js.Any] },
        "Remote" -> Remote.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ErrorRootCauseEntity]
    }
  }

  /**
   * <p>A collection of fields identifying the services in a trace summary error.</p>
   */
  @js.native
  trait ErrorRootCauseService extends js.Object {
    var EntityPath: js.UndefOr[ErrorRootCauseEntityPath]
    var Name: js.UndefOr[String]
    var Inferred: js.UndefOr[NullableBoolean]
    var Names: js.UndefOr[ServiceNames]
    var AccountId: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  object ErrorRootCauseService {
    def apply(
      EntityPath: js.UndefOr[ErrorRootCauseEntityPath] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      Inferred: js.UndefOr[NullableBoolean] = js.undefined,
      Names: js.UndefOr[ServiceNames] = js.undefined,
      AccountId: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[String] = js.undefined): ErrorRootCauseService = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntityPath" -> EntityPath.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Inferred" -> Inferred.map { x => x.asInstanceOf[js.Any] },
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ErrorRootCauseService]
    }
  }

  /**
   * <p>Information about requests that failed with a 4xx Client Error status code.</p>
   */
  @js.native
  trait ErrorStatistics extends js.Object {
    var ThrottleCount: js.UndefOr[NullableLong]
    var OtherCount: js.UndefOr[NullableLong]
    var TotalCount: js.UndefOr[NullableLong]
  }

  object ErrorStatistics {
    def apply(
      ThrottleCount: js.UndefOr[NullableLong] = js.undefined,
      OtherCount: js.UndefOr[NullableLong] = js.undefined,
      TotalCount: js.UndefOr[NullableLong] = js.undefined): ErrorStatistics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ThrottleCount" -> ThrottleCount.map { x => x.asInstanceOf[js.Any] },
        "OtherCount" -> OtherCount.map { x => x.asInstanceOf[js.Any] },
        "TotalCount" -> TotalCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ErrorStatistics]
    }
  }

  /**
   * <p>The root cause information for a trace summary fault.</p>
   */
  @js.native
  trait FaultRootCause extends js.Object {
    var Services: js.UndefOr[FaultRootCauseServices]
  }

  object FaultRootCause {
    def apply(
      Services: js.UndefOr[FaultRootCauseServices] = js.undefined): FaultRootCause = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Services" -> Services.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FaultRootCause]
    }
  }

  /**
   * <p>A collection of segments and corresponding subsegments associated to a trace summary fault error.</p>
   */
  @js.native
  trait FaultRootCauseEntity extends js.Object {
    var Name: js.UndefOr[String]
    var Exceptions: js.UndefOr[RootCauseExceptions]
    var Remote: js.UndefOr[NullableBoolean]
  }

  object FaultRootCauseEntity {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Exceptions: js.UndefOr[RootCauseExceptions] = js.undefined,
      Remote: js.UndefOr[NullableBoolean] = js.undefined): FaultRootCauseEntity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Exceptions" -> Exceptions.map { x => x.asInstanceOf[js.Any] },
        "Remote" -> Remote.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FaultRootCauseEntity]
    }
  }

  /**
   * <p>A collection of fields identifying the services in a trace summary fault.</p>
   */
  @js.native
  trait FaultRootCauseService extends js.Object {
    var EntityPath: js.UndefOr[FaultRootCauseEntityPath]
    var Name: js.UndefOr[String]
    var Inferred: js.UndefOr[NullableBoolean]
    var Names: js.UndefOr[ServiceNames]
    var AccountId: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  object FaultRootCauseService {
    def apply(
      EntityPath: js.UndefOr[FaultRootCauseEntityPath] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      Inferred: js.UndefOr[NullableBoolean] = js.undefined,
      Names: js.UndefOr[ServiceNames] = js.undefined,
      AccountId: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[String] = js.undefined): FaultRootCauseService = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntityPath" -> EntityPath.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Inferred" -> Inferred.map { x => x.asInstanceOf[js.Any] },
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FaultRootCauseService]
    }
  }

  /**
   * <p>Information about requests that failed with a 5xx Server Error status code.</p>
   */
  @js.native
  trait FaultStatistics extends js.Object {
    var OtherCount: js.UndefOr[NullableLong]
    var TotalCount: js.UndefOr[NullableLong]
  }

  object FaultStatistics {
    def apply(
      OtherCount: js.UndefOr[NullableLong] = js.undefined,
      TotalCount: js.UndefOr[NullableLong] = js.undefined): FaultStatistics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OtherCount" -> OtherCount.map { x => x.asInstanceOf[js.Any] },
        "TotalCount" -> TotalCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FaultStatistics]
    }
  }

  @js.native
  trait GetEncryptionConfigRequest extends js.Object {

  }

  object GetEncryptionConfigRequest {
    def apply(): GetEncryptionConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEncryptionConfigRequest]
    }
  }

  @js.native
  trait GetEncryptionConfigResult extends js.Object {
    var EncryptionConfig: js.UndefOr[EncryptionConfig]
  }

  object GetEncryptionConfigResult {
    def apply(
      EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined): GetEncryptionConfigResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncryptionConfig" -> EncryptionConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEncryptionConfigResult]
    }
  }

  @js.native
  trait GetGroupRequest extends js.Object {
    var GroupName: js.UndefOr[GroupName]
    var GroupARN: js.UndefOr[GroupARN]
  }

  object GetGroupRequest {
    def apply(
      GroupName: js.UndefOr[GroupName] = js.undefined,
      GroupARN: js.UndefOr[GroupARN] = js.undefined): GetGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "GroupARN" -> GroupARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupRequest]
    }
  }

  @js.native
  trait GetGroupResult extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object GetGroupResult {
    def apply(
      Group: js.UndefOr[Group] = js.undefined): GetGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupResult]
    }
  }

  @js.native
  trait GetGroupsRequest extends js.Object {
    var NextToken: js.UndefOr[GetGroupsNextToken]
  }

  object GetGroupsRequest {
    def apply(
      NextToken: js.UndefOr[GetGroupsNextToken] = js.undefined): GetGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupsRequest]
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
      NextToken: js.UndefOr[String] = js.undefined): GetGroupsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Groups" -> Groups.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupsResult]
    }
  }

  @js.native
  trait GetSamplingRulesRequest extends js.Object {
    var NextToken: js.UndefOr[String]
  }

  object GetSamplingRulesRequest {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined): GetSamplingRulesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSamplingRulesRequest]
    }
  }

  @js.native
  trait GetSamplingRulesResult extends js.Object {
    var SamplingRuleRecords: js.UndefOr[SamplingRuleRecordList]
    var NextToken: js.UndefOr[String]
  }

  object GetSamplingRulesResult {
    def apply(
      SamplingRuleRecords: js.UndefOr[SamplingRuleRecordList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): GetSamplingRulesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SamplingRuleRecords" -> SamplingRuleRecords.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSamplingRulesResult]
    }
  }

  @js.native
  trait GetSamplingStatisticSummariesRequest extends js.Object {
    var NextToken: js.UndefOr[String]
  }

  object GetSamplingStatisticSummariesRequest {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined): GetSamplingStatisticSummariesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSamplingStatisticSummariesRequest]
    }
  }

  @js.native
  trait GetSamplingStatisticSummariesResult extends js.Object {
    var SamplingStatisticSummaries: js.UndefOr[SamplingStatisticSummaryList]
    var NextToken: js.UndefOr[String]
  }

  object GetSamplingStatisticSummariesResult {
    def apply(
      SamplingStatisticSummaries: js.UndefOr[SamplingStatisticSummaryList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): GetSamplingStatisticSummariesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SamplingStatisticSummaries" -> SamplingStatisticSummaries.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSamplingStatisticSummariesResult]
    }
  }

  @js.native
  trait GetSamplingTargetsRequest extends js.Object {
    var SamplingStatisticsDocuments: js.UndefOr[SamplingStatisticsDocumentList]
  }

  object GetSamplingTargetsRequest {
    def apply(
      SamplingStatisticsDocuments: js.UndefOr[SamplingStatisticsDocumentList] = js.undefined): GetSamplingTargetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SamplingStatisticsDocuments" -> SamplingStatisticsDocuments.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSamplingTargetsRequest]
    }
  }

  @js.native
  trait GetSamplingTargetsResult extends js.Object {
    var SamplingTargetDocuments: js.UndefOr[SamplingTargetDocumentList]
    var LastRuleModification: js.UndefOr[Timestamp]
    var UnprocessedStatistics: js.UndefOr[UnprocessedStatisticsList]
  }

  object GetSamplingTargetsResult {
    def apply(
      SamplingTargetDocuments: js.UndefOr[SamplingTargetDocumentList] = js.undefined,
      LastRuleModification: js.UndefOr[Timestamp] = js.undefined,
      UnprocessedStatistics: js.UndefOr[UnprocessedStatisticsList] = js.undefined): GetSamplingTargetsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SamplingTargetDocuments" -> SamplingTargetDocuments.map { x => x.asInstanceOf[js.Any] },
        "LastRuleModification" -> LastRuleModification.map { x => x.asInstanceOf[js.Any] },
        "UnprocessedStatistics" -> UnprocessedStatistics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSamplingTargetsResult]
    }
  }

  @js.native
  trait GetServiceGraphRequest extends js.Object {
    var GroupName: js.UndefOr[GroupName]
    var StartTime: js.UndefOr[Timestamp]
    var EndTime: js.UndefOr[Timestamp]
    var GroupARN: js.UndefOr[GroupARN]
    var NextToken: js.UndefOr[String]
  }

  object GetServiceGraphRequest {
    def apply(
      GroupName: js.UndefOr[GroupName] = js.undefined,
      StartTime: js.UndefOr[Timestamp] = js.undefined,
      EndTime: js.UndefOr[Timestamp] = js.undefined,
      GroupARN: js.UndefOr[GroupARN] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): GetServiceGraphRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "GroupARN" -> GroupARN.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetServiceGraphRequest]
    }
  }

  @js.native
  trait GetServiceGraphResult extends js.Object {
    var ContainsOldGroupVersions: js.UndefOr[Boolean]
    var StartTime: js.UndefOr[Timestamp]
    var EndTime: js.UndefOr[Timestamp]
    var Services: js.UndefOr[ServiceList]
    var NextToken: js.UndefOr[String]
  }

  object GetServiceGraphResult {
    def apply(
      ContainsOldGroupVersions: js.UndefOr[Boolean] = js.undefined,
      StartTime: js.UndefOr[Timestamp] = js.undefined,
      EndTime: js.UndefOr[Timestamp] = js.undefined,
      Services: js.UndefOr[ServiceList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): GetServiceGraphResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContainsOldGroupVersions" -> ContainsOldGroupVersions.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "Services" -> Services.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetServiceGraphResult]
    }
  }

  @js.native
  trait GetTraceGraphRequest extends js.Object {
    var TraceIds: js.UndefOr[TraceIdList]
    var NextToken: js.UndefOr[String]
  }

  object GetTraceGraphRequest {
    def apply(
      TraceIds: js.UndefOr[TraceIdList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): GetTraceGraphRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TraceIds" -> TraceIds.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTraceGraphRequest]
    }
  }

  @js.native
  trait GetTraceGraphResult extends js.Object {
    var Services: js.UndefOr[ServiceList]
    var NextToken: js.UndefOr[String]
  }

  object GetTraceGraphResult {
    def apply(
      Services: js.UndefOr[ServiceList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): GetTraceGraphResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Services" -> Services.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTraceGraphResult]
    }
  }

  @js.native
  trait GetTraceSummariesRequest extends js.Object {
    var FilterExpression: js.UndefOr[FilterExpression]
    var StartTime: js.UndefOr[Timestamp]
    var EndTime: js.UndefOr[Timestamp]
    var NextToken: js.UndefOr[String]
    var Sampling: js.UndefOr[NullableBoolean]
  }

  object GetTraceSummariesRequest {
    def apply(
      FilterExpression: js.UndefOr[FilterExpression] = js.undefined,
      StartTime: js.UndefOr[Timestamp] = js.undefined,
      EndTime: js.UndefOr[Timestamp] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      Sampling: js.UndefOr[NullableBoolean] = js.undefined): GetTraceSummariesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FilterExpression" -> FilterExpression.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Sampling" -> Sampling.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTraceSummariesRequest]
    }
  }

  @js.native
  trait GetTraceSummariesResult extends js.Object {
    var TraceSummaries: js.UndefOr[TraceSummaryList]
    var ApproximateTime: js.UndefOr[Timestamp]
    var TracesProcessedCount: js.UndefOr[NullableLong]
    var NextToken: js.UndefOr[String]
  }

  object GetTraceSummariesResult {
    def apply(
      TraceSummaries: js.UndefOr[TraceSummaryList] = js.undefined,
      ApproximateTime: js.UndefOr[Timestamp] = js.undefined,
      TracesProcessedCount: js.UndefOr[NullableLong] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): GetTraceSummariesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TraceSummaries" -> TraceSummaries.map { x => x.asInstanceOf[js.Any] },
        "ApproximateTime" -> ApproximateTime.map { x => x.asInstanceOf[js.Any] },
        "TracesProcessedCount" -> TracesProcessedCount.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTraceSummariesResult]
    }
  }

  /**
   * <p>Details and metadata for a group.</p>
   */
  @js.native
  trait Group extends js.Object {
    var GroupName: js.UndefOr[String]
    var GroupARN: js.UndefOr[String]
    var FilterExpression: js.UndefOr[String]
  }

  object Group {
    def apply(
      GroupName: js.UndefOr[String] = js.undefined,
      GroupARN: js.UndefOr[String] = js.undefined,
      FilterExpression: js.UndefOr[String] = js.undefined): Group = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "GroupARN" -> GroupARN.map { x => x.asInstanceOf[js.Any] },
        "FilterExpression" -> FilterExpression.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Group]
    }
  }

  /**
   * <p>Details for a group without metadata.</p>
   */
  @js.native
  trait GroupSummary extends js.Object {
    var GroupName: js.UndefOr[String]
    var GroupARN: js.UndefOr[String]
    var FilterExpression: js.UndefOr[String]
  }

  object GroupSummary {
    def apply(
      GroupName: js.UndefOr[String] = js.undefined,
      GroupARN: js.UndefOr[String] = js.undefined,
      FilterExpression: js.UndefOr[String] = js.undefined): GroupSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "GroupARN" -> GroupARN.map { x => x.asInstanceOf[js.Any] },
        "FilterExpression" -> FilterExpression.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupSummary]
    }
  }

  /**
   * <p>An entry in a histogram for a statistic. A histogram maps the range of observed values on the X axis, and the prevalence of each value on the Y axis.</p>
   */
  @js.native
  trait HistogramEntry extends js.Object {
    var Value: js.UndefOr[Double]
    var Count: js.UndefOr[Int]
  }

  object HistogramEntry {
    def apply(
      Value: js.UndefOr[Double] = js.undefined,
      Count: js.UndefOr[Int] = js.undefined): HistogramEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "Count" -> Count.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HistogramEntry]
    }
  }

  /**
   * <p>Information about an HTTP request.</p>
   */
  @js.native
  trait Http extends js.Object {
    var HttpURL: js.UndefOr[String]
    var ClientIp: js.UndefOr[String]
    var UserAgent: js.UndefOr[String]
    var HttpStatus: js.UndefOr[NullableInteger]
    var HttpMethod: js.UndefOr[String]
  }

  object Http {
    def apply(
      HttpURL: js.UndefOr[String] = js.undefined,
      ClientIp: js.UndefOr[String] = js.undefined,
      UserAgent: js.UndefOr[String] = js.undefined,
      HttpStatus: js.UndefOr[NullableInteger] = js.undefined,
      HttpMethod: js.UndefOr[String] = js.undefined): Http = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HttpURL" -> HttpURL.map { x => x.asInstanceOf[js.Any] },
        "ClientIp" -> ClientIp.map { x => x.asInstanceOf[js.Any] },
        "UserAgent" -> UserAgent.map { x => x.asInstanceOf[js.Any] },
        "HttpStatus" -> HttpStatus.map { x => x.asInstanceOf[js.Any] },
        "HttpMethod" -> HttpMethod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Http]
    }
  }

  /**
   * <p>A list of EC2 instance IDs corresponding to the segments in a trace. </p>
   */
  @js.native
  trait InstanceIdDetail extends js.Object {
    var Id: js.UndefOr[String]
  }

  object InstanceIdDetail {
    def apply(
      Id: js.UndefOr[String] = js.undefined): InstanceIdDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceIdDetail]
    }
  }

  @js.native
  trait PutEncryptionConfigRequest extends js.Object {
    var KeyId: js.UndefOr[EncryptionKeyId]
    var Type: js.UndefOr[EncryptionType]
  }

  object PutEncryptionConfigRequest {
    def apply(
      KeyId: js.UndefOr[EncryptionKeyId] = js.undefined,
      Type: js.UndefOr[EncryptionType] = js.undefined): PutEncryptionConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyId" -> KeyId.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEncryptionConfigRequest]
    }
  }

  @js.native
  trait PutEncryptionConfigResult extends js.Object {
    var EncryptionConfig: js.UndefOr[EncryptionConfig]
  }

  object PutEncryptionConfigResult {
    def apply(
      EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined): PutEncryptionConfigResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncryptionConfig" -> EncryptionConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEncryptionConfigResult]
    }
  }

  @js.native
  trait PutTelemetryRecordsRequest extends js.Object {
    var TelemetryRecords: js.UndefOr[TelemetryRecordList]
    var EC2InstanceId: js.UndefOr[EC2InstanceId]
    var Hostname: js.UndefOr[Hostname]
    var ResourceARN: js.UndefOr[ResourceARN]
  }

  object PutTelemetryRecordsRequest {
    def apply(
      TelemetryRecords: js.UndefOr[TelemetryRecordList] = js.undefined,
      EC2InstanceId: js.UndefOr[EC2InstanceId] = js.undefined,
      Hostname: js.UndefOr[Hostname] = js.undefined,
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined): PutTelemetryRecordsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TelemetryRecords" -> TelemetryRecords.map { x => x.asInstanceOf[js.Any] },
        "EC2InstanceId" -> EC2InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Hostname" -> Hostname.map { x => x.asInstanceOf[js.Any] },
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutTelemetryRecordsRequest]
    }
  }

  @js.native
  trait PutTelemetryRecordsResult extends js.Object {

  }

  object PutTelemetryRecordsResult {
    def apply(): PutTelemetryRecordsResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutTelemetryRecordsResult]
    }
  }

  @js.native
  trait PutTraceSegmentsRequest extends js.Object {
    var TraceSegmentDocuments: js.UndefOr[TraceSegmentDocumentList]
  }

  object PutTraceSegmentsRequest {
    def apply(
      TraceSegmentDocuments: js.UndefOr[TraceSegmentDocumentList] = js.undefined): PutTraceSegmentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TraceSegmentDocuments" -> TraceSegmentDocuments.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutTraceSegmentsRequest]
    }
  }

  @js.native
  trait PutTraceSegmentsResult extends js.Object {
    var UnprocessedTraceSegments: js.UndefOr[UnprocessedTraceSegmentList]
  }

  object PutTraceSegmentsResult {
    def apply(
      UnprocessedTraceSegments: js.UndefOr[UnprocessedTraceSegmentList] = js.undefined): PutTraceSegmentsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UnprocessedTraceSegments" -> UnprocessedTraceSegments.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutTraceSegmentsResult]
    }
  }

  /**
   * <p>A list of resources ARNs corresponding to the segments in a trace.</p>
   */
  @js.native
  trait ResourceARNDetail extends js.Object {
    var ARN: js.UndefOr[String]
  }

  object ResourceARNDetail {
    def apply(
      ARN: js.UndefOr[String] = js.undefined): ResourceARNDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceARNDetail]
    }
  }

  /**
   * <p>The root cause information for a response time warning.</p>
   */
  @js.native
  trait ResponseTimeRootCause extends js.Object {
    var Services: js.UndefOr[ResponseTimeRootCauseServices]
  }

  object ResponseTimeRootCause {
    def apply(
      Services: js.UndefOr[ResponseTimeRootCauseServices] = js.undefined): ResponseTimeRootCause = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Services" -> Services.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResponseTimeRootCause]
    }
  }

  /**
   * <p>A collection of segments and corresponding subsegments associated to a response time warning.</p>
   */
  @js.native
  trait ResponseTimeRootCauseEntity extends js.Object {
    var Name: js.UndefOr[String]
    var Coverage: js.UndefOr[NullableDouble]
    var Remote: js.UndefOr[NullableBoolean]
  }

  object ResponseTimeRootCauseEntity {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Coverage: js.UndefOr[NullableDouble] = js.undefined,
      Remote: js.UndefOr[NullableBoolean] = js.undefined): ResponseTimeRootCauseEntity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Coverage" -> Coverage.map { x => x.asInstanceOf[js.Any] },
        "Remote" -> Remote.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResponseTimeRootCauseEntity]
    }
  }

  /**
   * <p>A collection of fields identifying the service in a response time warning.</p>
   */
  @js.native
  trait ResponseTimeRootCauseService extends js.Object {
    var EntityPath: js.UndefOr[ResponseTimeRootCauseEntityPath]
    var Name: js.UndefOr[String]
    var Inferred: js.UndefOr[NullableBoolean]
    var Names: js.UndefOr[ServiceNames]
    var AccountId: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  object ResponseTimeRootCauseService {
    def apply(
      EntityPath: js.UndefOr[ResponseTimeRootCauseEntityPath] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      Inferred: js.UndefOr[NullableBoolean] = js.undefined,
      Names: js.UndefOr[ServiceNames] = js.undefined,
      AccountId: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[String] = js.undefined): ResponseTimeRootCauseService = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EntityPath" -> EntityPath.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Inferred" -> Inferred.map { x => x.asInstanceOf[js.Any] },
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResponseTimeRootCauseService]
    }
  }

  /**
   * <p>The exception associated with a root cause.</p>
   */
  @js.native
  trait RootCauseException extends js.Object {
    var Name: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  object RootCauseException {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined): RootCauseException = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RootCauseException]
    }
  }

  /**
   * <p>A sampling rule that services use to decide whether to instrument a request. Rule fields can match properties of the service, or properties of a request. The service can ignore rules that don't match its properties.</p>
   */
  @js.native
  trait SamplingRule extends js.Object {
    var URLPath: js.UndefOr[URLPath]
    var ServiceName: js.UndefOr[ServiceName]
    var Attributes: js.UndefOr[AttributeMap]
    var FixedRate: js.UndefOr[FixedRate]
    var Version: js.UndefOr[Version]
    var ResourceARN: js.UndefOr[ResourceARN]
    var RuleARN: js.UndefOr[String]
    var RuleName: js.UndefOr[RuleName]
    var HTTPMethod: js.UndefOr[HTTPMethod]
    var ServiceType: js.UndefOr[ServiceType]
    var Priority: js.UndefOr[Priority]
    var ReservoirSize: js.UndefOr[ReservoirSize]
    var Host: js.UndefOr[Host]
  }

  object SamplingRule {
    def apply(
      URLPath: js.UndefOr[URLPath] = js.undefined,
      ServiceName: js.UndefOr[ServiceName] = js.undefined,
      Attributes: js.UndefOr[AttributeMap] = js.undefined,
      FixedRate: js.UndefOr[FixedRate] = js.undefined,
      Version: js.UndefOr[Version] = js.undefined,
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      RuleARN: js.UndefOr[String] = js.undefined,
      RuleName: js.UndefOr[RuleName] = js.undefined,
      HTTPMethod: js.UndefOr[HTTPMethod] = js.undefined,
      ServiceType: js.UndefOr[ServiceType] = js.undefined,
      Priority: js.UndefOr[Priority] = js.undefined,
      ReservoirSize: js.UndefOr[ReservoirSize] = js.undefined,
      Host: js.UndefOr[Host] = js.undefined): SamplingRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "URLPath" -> URLPath.map { x => x.asInstanceOf[js.Any] },
        "ServiceName" -> ServiceName.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] },
        "FixedRate" -> FixedRate.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] },
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "RuleARN" -> RuleARN.map { x => x.asInstanceOf[js.Any] },
        "RuleName" -> RuleName.map { x => x.asInstanceOf[js.Any] },
        "HTTPMethod" -> HTTPMethod.map { x => x.asInstanceOf[js.Any] },
        "ServiceType" -> ServiceType.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "ReservoirSize" -> ReservoirSize.map { x => x.asInstanceOf[js.Any] },
        "Host" -> Host.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SamplingRule]
    }
  }

  /**
   * <p>A <a>SamplingRule</a> and its metadata.</p>
   */
  @js.native
  trait SamplingRuleRecord extends js.Object {
    var SamplingRule: js.UndefOr[SamplingRule]
    var CreatedAt: js.UndefOr[Timestamp]
    var ModifiedAt: js.UndefOr[Timestamp]
  }

  object SamplingRuleRecord {
    def apply(
      SamplingRule: js.UndefOr[SamplingRule] = js.undefined,
      CreatedAt: js.UndefOr[Timestamp] = js.undefined,
      ModifiedAt: js.UndefOr[Timestamp] = js.undefined): SamplingRuleRecord = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SamplingRule" -> SamplingRule.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "ModifiedAt" -> ModifiedAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SamplingRuleRecord]
    }
  }

  /**
   * <p>A document specifying changes to a sampling rule's configuration.</p>
   */
  @js.native
  trait SamplingRuleUpdate extends js.Object {
    var URLPath: js.UndefOr[URLPath]
    var ServiceName: js.UndefOr[ServiceName]
    var Attributes: js.UndefOr[AttributeMap]
    var FixedRate: js.UndefOr[NullableDouble]
    var ResourceARN: js.UndefOr[ResourceARN]
    var RuleARN: js.UndefOr[String]
    var RuleName: js.UndefOr[RuleName]
    var HTTPMethod: js.UndefOr[HTTPMethod]
    var ServiceType: js.UndefOr[ServiceType]
    var Priority: js.UndefOr[NullableInteger]
    var ReservoirSize: js.UndefOr[NullableInteger]
    var Host: js.UndefOr[Host]
  }

  object SamplingRuleUpdate {
    def apply(
      URLPath: js.UndefOr[URLPath] = js.undefined,
      ServiceName: js.UndefOr[ServiceName] = js.undefined,
      Attributes: js.UndefOr[AttributeMap] = js.undefined,
      FixedRate: js.UndefOr[NullableDouble] = js.undefined,
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      RuleARN: js.UndefOr[String] = js.undefined,
      RuleName: js.UndefOr[RuleName] = js.undefined,
      HTTPMethod: js.UndefOr[HTTPMethod] = js.undefined,
      ServiceType: js.UndefOr[ServiceType] = js.undefined,
      Priority: js.UndefOr[NullableInteger] = js.undefined,
      ReservoirSize: js.UndefOr[NullableInteger] = js.undefined,
      Host: js.UndefOr[Host] = js.undefined): SamplingRuleUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "URLPath" -> URLPath.map { x => x.asInstanceOf[js.Any] },
        "ServiceName" -> ServiceName.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] },
        "FixedRate" -> FixedRate.map { x => x.asInstanceOf[js.Any] },
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "RuleARN" -> RuleARN.map { x => x.asInstanceOf[js.Any] },
        "RuleName" -> RuleName.map { x => x.asInstanceOf[js.Any] },
        "HTTPMethod" -> HTTPMethod.map { x => x.asInstanceOf[js.Any] },
        "ServiceType" -> ServiceType.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "ReservoirSize" -> ReservoirSize.map { x => x.asInstanceOf[js.Any] },
        "Host" -> Host.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SamplingRuleUpdate]
    }
  }

  /**
   * <p>Aggregated request sampling data for a sampling rule across all services for a 10 second window.</p>
   */
  @js.native
  trait SamplingStatisticSummary extends js.Object {
    var RuleName: js.UndefOr[String]
    var SampledCount: js.UndefOr[Int]
    var BorrowCount: js.UndefOr[Int]
    var Timestamp: js.UndefOr[Timestamp]
    var RequestCount: js.UndefOr[Int]
  }

  object SamplingStatisticSummary {
    def apply(
      RuleName: js.UndefOr[String] = js.undefined,
      SampledCount: js.UndefOr[Int] = js.undefined,
      BorrowCount: js.UndefOr[Int] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined,
      RequestCount: js.UndefOr[Int] = js.undefined): SamplingStatisticSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleName" -> RuleName.map { x => x.asInstanceOf[js.Any] },
        "SampledCount" -> SampledCount.map { x => x.asInstanceOf[js.Any] },
        "BorrowCount" -> BorrowCount.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] },
        "RequestCount" -> RequestCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SamplingStatisticSummary]
    }
  }

  /**
   * <p>Request sampling results for a single rule from a service. Results are for the last 10 seconds unless the service has been assigned a longer reporting interval after a previous call to <a>GetSamplingTargets</a>.</p>
   */
  @js.native
  trait SamplingStatisticsDocument extends js.Object {
    var RuleName: js.UndefOr[RuleName]
    var SampledCount: js.UndefOr[SampledCount]
    var BorrowCount: js.UndefOr[BorrowCount]
    var Timestamp: js.UndefOr[Timestamp]
    var RequestCount: js.UndefOr[RequestCount]
    var ClientID: js.UndefOr[ClientID]
  }

  object SamplingStatisticsDocument {
    def apply(
      RuleName: js.UndefOr[RuleName] = js.undefined,
      SampledCount: js.UndefOr[SampledCount] = js.undefined,
      BorrowCount: js.UndefOr[BorrowCount] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined,
      RequestCount: js.UndefOr[RequestCount] = js.undefined,
      ClientID: js.UndefOr[ClientID] = js.undefined): SamplingStatisticsDocument = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleName" -> RuleName.map { x => x.asInstanceOf[js.Any] },
        "SampledCount" -> SampledCount.map { x => x.asInstanceOf[js.Any] },
        "BorrowCount" -> BorrowCount.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] },
        "RequestCount" -> RequestCount.map { x => x.asInstanceOf[js.Any] },
        "ClientID" -> ClientID.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SamplingStatisticsDocument]
    }
  }

  /**
   * <p>Temporary changes to a sampling rule configuration. To meet the global sampling target for a rule, X-Ray calculates a new reservoir for each service based on the recent sampling results of all services that called <a>GetSamplingTargets</a>.</p>
   */
  @js.native
  trait SamplingTargetDocument extends js.Object {
    var FixedRate: js.UndefOr[Double]
    var ReservoirQuota: js.UndefOr[NullableInteger]
    var Interval: js.UndefOr[NullableInteger]
    var RuleName: js.UndefOr[String]
    var ReservoirQuotaTTL: js.UndefOr[Timestamp]
  }

  object SamplingTargetDocument {
    def apply(
      FixedRate: js.UndefOr[Double] = js.undefined,
      ReservoirQuota: js.UndefOr[NullableInteger] = js.undefined,
      Interval: js.UndefOr[NullableInteger] = js.undefined,
      RuleName: js.UndefOr[String] = js.undefined,
      ReservoirQuotaTTL: js.UndefOr[Timestamp] = js.undefined): SamplingTargetDocument = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FixedRate" -> FixedRate.map { x => x.asInstanceOf[js.Any] },
        "ReservoirQuota" -> ReservoirQuota.map { x => x.asInstanceOf[js.Any] },
        "Interval" -> Interval.map { x => x.asInstanceOf[js.Any] },
        "RuleName" -> RuleName.map { x => x.asInstanceOf[js.Any] },
        "ReservoirQuotaTTL" -> ReservoirQuotaTTL.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SamplingTargetDocument]
    }
  }

  /**
   * <p>A segment from a trace that has been ingested by the X-Ray service. The segment can be compiled from documents uploaded with <a>PutTraceSegments</a>, or an <code>inferred</code> segment for a downstream service, generated from a subsegment sent by the service that called it.</p> <p>For the full segment document schema, see <a href="https://docs.aws.amazon.com/xray/latest/devguide/xray-api-segmentdocuments.html">AWS X-Ray Segment Documents</a> in the <i>AWS X-Ray Developer Guide</i>.</p>
   */
  @js.native
  trait Segment extends js.Object {
    var Id: js.UndefOr[SegmentId]
    var Document: js.UndefOr[SegmentDocument]
  }

  object Segment {
    def apply(
      Id: js.UndefOr[SegmentId] = js.undefined,
      Document: js.UndefOr[SegmentDocument] = js.undefined): Segment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Document" -> Document.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Segment]
    }
  }

  /**
   * <p>Information about an application that processed requests, users that made requests, or downstream services, resources and applications that an application used.</p>
   */
  @js.native
  trait Service extends js.Object {
    var Name: js.UndefOr[String]
    var Root: js.UndefOr[NullableBoolean]
    var Edges: js.UndefOr[EdgeList]
    var StartTime: js.UndefOr[Timestamp]
    var DurationHistogram: js.UndefOr[Histogram]
    var EndTime: js.UndefOr[Timestamp]
    var Names: js.UndefOr[ServiceNames]
    var ReferenceId: js.UndefOr[NullableInteger]
    var SummaryStatistics: js.UndefOr[ServiceStatistics]
    var AccountId: js.UndefOr[String]
    var ResponseTimeHistogram: js.UndefOr[Histogram]
    var State: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  object Service {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Root: js.UndefOr[NullableBoolean] = js.undefined,
      Edges: js.UndefOr[EdgeList] = js.undefined,
      StartTime: js.UndefOr[Timestamp] = js.undefined,
      DurationHistogram: js.UndefOr[Histogram] = js.undefined,
      EndTime: js.UndefOr[Timestamp] = js.undefined,
      Names: js.UndefOr[ServiceNames] = js.undefined,
      ReferenceId: js.UndefOr[NullableInteger] = js.undefined,
      SummaryStatistics: js.UndefOr[ServiceStatistics] = js.undefined,
      AccountId: js.UndefOr[String] = js.undefined,
      ResponseTimeHistogram: js.UndefOr[Histogram] = js.undefined,
      State: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[String] = js.undefined): Service = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Root" -> Root.map { x => x.asInstanceOf[js.Any] },
        "Edges" -> Edges.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "DurationHistogram" -> DurationHistogram.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "ReferenceId" -> ReferenceId.map { x => x.asInstanceOf[js.Any] },
        "SummaryStatistics" -> SummaryStatistics.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "ResponseTimeHistogram" -> ResponseTimeHistogram.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Service]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ServiceId extends js.Object {
    var Name: js.UndefOr[String]
    var Names: js.UndefOr[ServiceNames]
    var AccountId: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  object ServiceId {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Names: js.UndefOr[ServiceNames] = js.undefined,
      AccountId: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[String] = js.undefined): ServiceId = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceId]
    }
  }

  /**
   * <p>Response statistics for a service.</p>
   */
  @js.native
  trait ServiceStatistics extends js.Object {
    var FaultStatistics: js.UndefOr[FaultStatistics]
    var TotalResponseTime: js.UndefOr[NullableDouble]
    var OkCount: js.UndefOr[NullableLong]
    var TotalCount: js.UndefOr[NullableLong]
    var ErrorStatistics: js.UndefOr[ErrorStatistics]
  }

  object ServiceStatistics {
    def apply(
      FaultStatistics: js.UndefOr[FaultStatistics] = js.undefined,
      TotalResponseTime: js.UndefOr[NullableDouble] = js.undefined,
      OkCount: js.UndefOr[NullableLong] = js.undefined,
      TotalCount: js.UndefOr[NullableLong] = js.undefined,
      ErrorStatistics: js.UndefOr[ErrorStatistics] = js.undefined): ServiceStatistics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FaultStatistics" -> FaultStatistics.map { x => x.asInstanceOf[js.Any] },
        "TotalResponseTime" -> TotalResponseTime.map { x => x.asInstanceOf[js.Any] },
        "OkCount" -> OkCount.map { x => x.asInstanceOf[js.Any] },
        "TotalCount" -> TotalCount.map { x => x.asInstanceOf[js.Any] },
        "ErrorStatistics" -> ErrorStatistics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceStatistics]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait TelemetryRecord extends js.Object {
    var SegmentsSpilloverCount: js.UndefOr[NullableInteger]
    var SegmentsSentCount: js.UndefOr[NullableInteger]
    var SegmentsRejectedCount: js.UndefOr[NullableInteger]
    var BackendConnectionErrors: js.UndefOr[BackendConnectionErrors]
    var SegmentsReceivedCount: js.UndefOr[NullableInteger]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object TelemetryRecord {
    def apply(
      SegmentsSpilloverCount: js.UndefOr[NullableInteger] = js.undefined,
      SegmentsSentCount: js.UndefOr[NullableInteger] = js.undefined,
      SegmentsRejectedCount: js.UndefOr[NullableInteger] = js.undefined,
      BackendConnectionErrors: js.UndefOr[BackendConnectionErrors] = js.undefined,
      SegmentsReceivedCount: js.UndefOr[NullableInteger] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined): TelemetryRecord = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SegmentsSpilloverCount" -> SegmentsSpilloverCount.map { x => x.asInstanceOf[js.Any] },
        "SegmentsSentCount" -> SegmentsSentCount.map { x => x.asInstanceOf[js.Any] },
        "SegmentsRejectedCount" -> SegmentsRejectedCount.map { x => x.asInstanceOf[js.Any] },
        "BackendConnectionErrors" -> BackendConnectionErrors.map { x => x.asInstanceOf[js.Any] },
        "SegmentsReceivedCount" -> SegmentsReceivedCount.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TelemetryRecord]
    }
  }

  /**
   * <p>A collection of segment documents with matching trace IDs.</p>
   */
  @js.native
  trait Trace extends js.Object {
    var Id: js.UndefOr[TraceId]
    var Duration: js.UndefOr[NullableDouble]
    var Segments: js.UndefOr[SegmentList]
  }

  object Trace {
    def apply(
      Id: js.UndefOr[TraceId] = js.undefined,
      Duration: js.UndefOr[NullableDouble] = js.undefined,
      Segments: js.UndefOr[SegmentList] = js.undefined): Trace = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "Segments" -> Segments.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Trace]
    }
  }

  /**
   * <p>Metadata generated from the segment documents in a trace.</p>
   */
  @js.native
  trait TraceSummary extends js.Object {
    var Id: js.UndefOr[TraceId]
    var HasError: js.UndefOr[NullableBoolean]
    var Http: js.UndefOr[Http]
    var Users: js.UndefOr[TraceUsers]
    var Duration: js.UndefOr[NullableDouble]
    var ResponseTimeRootCauses: js.UndefOr[ResponseTimeRootCauses]
    var ServiceIds: js.UndefOr[ServiceIds]
    var ErrorRootCauses: js.UndefOr[ErrorRootCauses]
    var Revision: js.UndefOr[Int]
    var IsPartial: js.UndefOr[NullableBoolean]
    var ResponseTime: js.UndefOr[NullableDouble]
    var ResourceARNs: js.UndefOr[TraceResourceARNs]
    var EntryPoint: js.UndefOr[ServiceId]
    var InstanceIds: js.UndefOr[TraceInstanceIds]
    var FaultRootCauses: js.UndefOr[FaultRootCauses]
    var Annotations: js.UndefOr[Annotations]
    var HasThrottle: js.UndefOr[NullableBoolean]
    var HasFault: js.UndefOr[NullableBoolean]
    var AvailabilityZones: js.UndefOr[TraceAvailabilityZones]
  }

  object TraceSummary {
    def apply(
      Id: js.UndefOr[TraceId] = js.undefined,
      HasError: js.UndefOr[NullableBoolean] = js.undefined,
      Http: js.UndefOr[Http] = js.undefined,
      Users: js.UndefOr[TraceUsers] = js.undefined,
      Duration: js.UndefOr[NullableDouble] = js.undefined,
      ResponseTimeRootCauses: js.UndefOr[ResponseTimeRootCauses] = js.undefined,
      ServiceIds: js.UndefOr[ServiceIds] = js.undefined,
      ErrorRootCauses: js.UndefOr[ErrorRootCauses] = js.undefined,
      Revision: js.UndefOr[Int] = js.undefined,
      IsPartial: js.UndefOr[NullableBoolean] = js.undefined,
      ResponseTime: js.UndefOr[NullableDouble] = js.undefined,
      ResourceARNs: js.UndefOr[TraceResourceARNs] = js.undefined,
      EntryPoint: js.UndefOr[ServiceId] = js.undefined,
      InstanceIds: js.UndefOr[TraceInstanceIds] = js.undefined,
      FaultRootCauses: js.UndefOr[FaultRootCauses] = js.undefined,
      Annotations: js.UndefOr[Annotations] = js.undefined,
      HasThrottle: js.UndefOr[NullableBoolean] = js.undefined,
      HasFault: js.UndefOr[NullableBoolean] = js.undefined,
      AvailabilityZones: js.UndefOr[TraceAvailabilityZones] = js.undefined): TraceSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "HasError" -> HasError.map { x => x.asInstanceOf[js.Any] },
        "Http" -> Http.map { x => x.asInstanceOf[js.Any] },
        "Users" -> Users.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "ResponseTimeRootCauses" -> ResponseTimeRootCauses.map { x => x.asInstanceOf[js.Any] },
        "ServiceIds" -> ServiceIds.map { x => x.asInstanceOf[js.Any] },
        "ErrorRootCauses" -> ErrorRootCauses.map { x => x.asInstanceOf[js.Any] },
        "Revision" -> Revision.map { x => x.asInstanceOf[js.Any] },
        "IsPartial" -> IsPartial.map { x => x.asInstanceOf[js.Any] },
        "ResponseTime" -> ResponseTime.map { x => x.asInstanceOf[js.Any] },
        "ResourceARNs" -> ResourceARNs.map { x => x.asInstanceOf[js.Any] },
        "EntryPoint" -> EntryPoint.map { x => x.asInstanceOf[js.Any] },
        "InstanceIds" -> InstanceIds.map { x => x.asInstanceOf[js.Any] },
        "FaultRootCauses" -> FaultRootCauses.map { x => x.asInstanceOf[js.Any] },
        "Annotations" -> Annotations.map { x => x.asInstanceOf[js.Any] },
        "HasThrottle" -> HasThrottle.map { x => x.asInstanceOf[js.Any] },
        "HasFault" -> HasFault.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TraceSummary]
    }
  }

  /**
   * <p>Information about a user recorded in segment documents.</p>
   */
  @js.native
  trait TraceUser extends js.Object {
    var UserName: js.UndefOr[String]
    var ServiceIds: js.UndefOr[ServiceIds]
  }

  object TraceUser {
    def apply(
      UserName: js.UndefOr[String] = js.undefined,
      ServiceIds: js.UndefOr[ServiceIds] = js.undefined): TraceUser = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "ServiceIds" -> ServiceIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TraceUser]
    }
  }

  /**
   * <p>Sampling statistics from a call to <a>GetSamplingTargets</a> that X-Ray could not process.</p>
   */
  @js.native
  trait UnprocessedStatistics extends js.Object {
    var RuleName: js.UndefOr[String]
    var ErrorCode: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  object UnprocessedStatistics {
    def apply(
      RuleName: js.UndefOr[String] = js.undefined,
      ErrorCode: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined): UnprocessedStatistics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleName" -> RuleName.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnprocessedStatistics]
    }
  }

  /**
   * <p>Information about a segment that failed processing.</p>
   */
  @js.native
  trait UnprocessedTraceSegment extends js.Object {
    var Id: js.UndefOr[String]
    var ErrorCode: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  object UnprocessedTraceSegment {
    def apply(
      Id: js.UndefOr[String] = js.undefined,
      ErrorCode: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined): UnprocessedTraceSegment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnprocessedTraceSegment]
    }
  }

  @js.native
  trait UpdateGroupRequest extends js.Object {
    var GroupName: js.UndefOr[GroupName]
    var GroupARN: js.UndefOr[GroupARN]
    var FilterExpression: js.UndefOr[FilterExpression]
  }

  object UpdateGroupRequest {
    def apply(
      GroupName: js.UndefOr[GroupName] = js.undefined,
      GroupARN: js.UndefOr[GroupARN] = js.undefined,
      FilterExpression: js.UndefOr[FilterExpression] = js.undefined): UpdateGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "GroupARN" -> GroupARN.map { x => x.asInstanceOf[js.Any] },
        "FilterExpression" -> FilterExpression.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGroupRequest]
    }
  }

  @js.native
  trait UpdateGroupResult extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object UpdateGroupResult {
    def apply(
      Group: js.UndefOr[Group] = js.undefined): UpdateGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Group" -> Group.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGroupResult]
    }
  }

  @js.native
  trait UpdateSamplingRuleRequest extends js.Object {
    var SamplingRuleUpdate: js.UndefOr[SamplingRuleUpdate]
  }

  object UpdateSamplingRuleRequest {
    def apply(
      SamplingRuleUpdate: js.UndefOr[SamplingRuleUpdate] = js.undefined): UpdateSamplingRuleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SamplingRuleUpdate" -> SamplingRuleUpdate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSamplingRuleRequest]
    }
  }

  @js.native
  trait UpdateSamplingRuleResult extends js.Object {
    var SamplingRuleRecord: js.UndefOr[SamplingRuleRecord]
  }

  object UpdateSamplingRuleResult {
    def apply(
      SamplingRuleRecord: js.UndefOr[SamplingRuleRecord] = js.undefined): UpdateSamplingRuleResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SamplingRuleRecord" -> SamplingRuleRecord.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSamplingRuleResult]
    }
  }

  /**
   * <p>Information about a segment annotation.</p>
   */
  @js.native
  trait ValueWithServiceIds extends js.Object {
    var AnnotationValue: js.UndefOr[AnnotationValue]
    var ServiceIds: js.UndefOr[ServiceIds]
  }

  object ValueWithServiceIds {
    def apply(
      AnnotationValue: js.UndefOr[AnnotationValue] = js.undefined,
      ServiceIds: js.UndefOr[ServiceIds] = js.undefined): ValueWithServiceIds = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AnnotationValue" -> AnnotationValue.map { x => x.asInstanceOf[js.Any] },
        "ServiceIds" -> ServiceIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValueWithServiceIds]
    }
  }
}
