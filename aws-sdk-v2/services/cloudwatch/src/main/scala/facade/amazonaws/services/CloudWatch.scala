package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object cloudwatch {
  type AccountId = String
  type ActionPrefix = String
  type ActionsEnabled = Boolean
  type AlarmArn = String
  type AlarmDescription = String
  type AlarmHistoryItems = js.Array[AlarmHistoryItem]
  type AlarmName = String
  type AlarmNamePrefix = String
  type AlarmNames = js.Array[AlarmName]
  type AlarmRule = String
  type AlarmTypes = js.Array[AlarmType]
  type AmazonResourceName = String
  type AnomalyDetectorExcludedTimeRanges = js.Array[Range]
  type AnomalyDetectorMetricStat = String
  type AnomalyDetectorMetricTimezone = String
  type AnomalyDetectorTypes = js.Array[AnomalyDetectorType]
  type AnomalyDetectors = js.Array[AnomalyDetector]
  type BatchFailures = js.Array[PartialFailure]
  type CompositeAlarms = js.Array[CompositeAlarm]
  type Counts = js.Array[DatapointValue]
  type DashboardArn = String
  type DashboardBody = String
  type DashboardEntries = js.Array[DashboardEntry]
  type DashboardName = String
  type DashboardNamePrefix = String
  type DashboardNames = js.Array[DashboardName]
  type DashboardValidationMessages = js.Array[DashboardValidationMessage]
  type DataPath = String
  type DatapointValue = Double
  type DatapointValueMap = js.Dictionary[DatapointValue]
  type DatapointValues = js.Array[DatapointValue]
  type Datapoints = js.Array[Datapoint]
  type DatapointsToAlarm = Int
  type DimensionFilters = js.Array[DimensionFilter]
  type DimensionName = String
  type DimensionValue = String
  type Dimensions = js.Array[Dimension]
  type EvaluateLowSampleCountPercentile = String
  type EvaluationPeriods = Int
  type ExceptionType = String
  type ExtendedStatistic = String
  type ExtendedStatistics = js.Array[ExtendedStatistic]
  type FailureCode = String
  type FailureDescription = String
  type FailureResource = String
  type GetMetricDataLabelTimezone = String
  type GetMetricDataMaxDatapoints = Int
  type HistoryData = String
  type HistorySummary = String
  type InsightRuleAggregationStatistic = String
  type InsightRuleContributorDatapoints = js.Array[InsightRuleContributorDatapoint]
  type InsightRuleContributorKey = String
  type InsightRuleContributorKeyLabel = String
  type InsightRuleContributorKeyLabels = js.Array[InsightRuleContributorKeyLabel]
  type InsightRuleContributorKeys = js.Array[InsightRuleContributorKey]
  type InsightRuleContributors = js.Array[InsightRuleContributor]
  type InsightRuleDefinition = String
  type InsightRuleMaxResults = Int
  type InsightRuleMetricDatapoints = js.Array[InsightRuleMetricDatapoint]
  type InsightRuleMetricList = js.Array[InsightRuleMetricName]
  type InsightRuleMetricName = String
  type InsightRuleName = String
  type InsightRuleNames = js.Array[InsightRuleName]
  type InsightRuleOrderBy = String
  type InsightRuleSchema = String
  type InsightRuleState = String
  type InsightRuleUnboundDouble = Double
  type InsightRuleUnboundInteger = Int
  type InsightRuleUnboundLong = Double
  type InsightRules = js.Array[InsightRule]
  type LastModified = js.Date
  type ListMetricStreamsMaxResults = Int
  type MaxRecords = Int
  type MaxReturnedResultsCount = Int
  type Message = String
  type MessageDataCode = String
  type MessageDataValue = String
  type MetricAlarms = js.Array[MetricAlarm]
  type MetricData = js.Array[MetricDatum]
  type MetricDataQueries = js.Array[MetricDataQuery]
  type MetricDataResultMessages = js.Array[MessageData]
  type MetricDataResults = js.Array[MetricDataResult]
  type MetricExpression = String
  type MetricId = String
  type MetricLabel = String
  type MetricName = String
  type MetricStreamEntries = js.Array[MetricStreamEntry]
  type MetricStreamFilters = js.Array[MetricStreamFilter]
  type MetricStreamName = String
  type MetricStreamNames = js.Array[MetricStreamName]
  type MetricStreamState = String
  type MetricWidget = String
  type MetricWidgetImage = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Metrics = js.Array[Metric]
  type Namespace = String
  type NextToken = String
  type OutputFormat = String
  type Period = Int
  type ResourceList = js.Array[ResourceName]
  type ResourceName = String
  type ReturnData = Boolean
  type Size = Double
  type Stat = String
  type StateReason = String
  type StateReasonData = String
  type Statistics = js.Array[Statistic]
  type StorageResolution = Int
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Threshold = Double
  type Timestamp = js.Date
  type Timestamps = js.Array[Timestamp]
  type TreatMissingData = String
  type Values = js.Array[DatapointValue]

  final class CloudWatchOps(private val service: CloudWatch) extends AnyVal {

    @inline def deleteAlarmsFuture(params: DeleteAlarmsInput): Future[js.Object] = service.deleteAlarms(params).promise().toFuture
    @inline def deleteAnomalyDetectorFuture(params: DeleteAnomalyDetectorInput): Future[DeleteAnomalyDetectorOutput] = service.deleteAnomalyDetector(params).promise().toFuture
    @inline def deleteDashboardsFuture(params: DeleteDashboardsInput): Future[DeleteDashboardsOutput] = service.deleteDashboards(params).promise().toFuture
    @inline def deleteInsightRulesFuture(params: DeleteInsightRulesInput): Future[DeleteInsightRulesOutput] = service.deleteInsightRules(params).promise().toFuture
    @inline def deleteMetricStreamFuture(params: DeleteMetricStreamInput): Future[DeleteMetricStreamOutput] = service.deleteMetricStream(params).promise().toFuture
    @inline def describeAlarmHistoryFuture(params: DescribeAlarmHistoryInput): Future[DescribeAlarmHistoryOutput] = service.describeAlarmHistory(params).promise().toFuture
    @inline def describeAlarmsForMetricFuture(params: DescribeAlarmsForMetricInput): Future[DescribeAlarmsForMetricOutput] = service.describeAlarmsForMetric(params).promise().toFuture
    @inline def describeAlarmsFuture(params: DescribeAlarmsInput): Future[DescribeAlarmsOutput] = service.describeAlarms(params).promise().toFuture
    @inline def describeAnomalyDetectorsFuture(params: DescribeAnomalyDetectorsInput): Future[DescribeAnomalyDetectorsOutput] = service.describeAnomalyDetectors(params).promise().toFuture
    @inline def describeInsightRulesFuture(params: DescribeInsightRulesInput): Future[DescribeInsightRulesOutput] = service.describeInsightRules(params).promise().toFuture
    @inline def disableAlarmActionsFuture(params: DisableAlarmActionsInput): Future[js.Object] = service.disableAlarmActions(params).promise().toFuture
    @inline def disableInsightRulesFuture(params: DisableInsightRulesInput): Future[DisableInsightRulesOutput] = service.disableInsightRules(params).promise().toFuture
    @inline def enableAlarmActionsFuture(params: EnableAlarmActionsInput): Future[js.Object] = service.enableAlarmActions(params).promise().toFuture
    @inline def enableInsightRulesFuture(params: EnableInsightRulesInput): Future[EnableInsightRulesOutput] = service.enableInsightRules(params).promise().toFuture
    @inline def getDashboardFuture(params: GetDashboardInput): Future[GetDashboardOutput] = service.getDashboard(params).promise().toFuture
    @inline def getInsightRuleReportFuture(params: GetInsightRuleReportInput): Future[GetInsightRuleReportOutput] = service.getInsightRuleReport(params).promise().toFuture
    @inline def getMetricDataFuture(params: GetMetricDataInput): Future[GetMetricDataOutput] = service.getMetricData(params).promise().toFuture
    @inline def getMetricStatisticsFuture(params: GetMetricStatisticsInput): Future[GetMetricStatisticsOutput] = service.getMetricStatistics(params).promise().toFuture
    @inline def getMetricStreamFuture(params: GetMetricStreamInput): Future[GetMetricStreamOutput] = service.getMetricStream(params).promise().toFuture
    @inline def getMetricWidgetImageFuture(params: GetMetricWidgetImageInput): Future[GetMetricWidgetImageOutput] = service.getMetricWidgetImage(params).promise().toFuture
    @inline def listDashboardsFuture(params: ListDashboardsInput): Future[ListDashboardsOutput] = service.listDashboards(params).promise().toFuture
    @inline def listMetricStreamsFuture(params: ListMetricStreamsInput): Future[ListMetricStreamsOutput] = service.listMetricStreams(params).promise().toFuture
    @inline def listMetricsFuture(params: ListMetricsInput): Future[ListMetricsOutput] = service.listMetrics(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] = service.listTagsForResource(params).promise().toFuture
    @inline def putAnomalyDetectorFuture(params: PutAnomalyDetectorInput): Future[PutAnomalyDetectorOutput] = service.putAnomalyDetector(params).promise().toFuture
    @inline def putCompositeAlarmFuture(params: PutCompositeAlarmInput): Future[js.Object] = service.putCompositeAlarm(params).promise().toFuture
    @inline def putDashboardFuture(params: PutDashboardInput): Future[PutDashboardOutput] = service.putDashboard(params).promise().toFuture
    @inline def putInsightRuleFuture(params: PutInsightRuleInput): Future[PutInsightRuleOutput] = service.putInsightRule(params).promise().toFuture
    @inline def putMetricAlarmFuture(params: PutMetricAlarmInput): Future[js.Object] = service.putMetricAlarm(params).promise().toFuture
    @inline def putMetricDataFuture(params: PutMetricDataInput): Future[js.Object] = service.putMetricData(params).promise().toFuture
    @inline def putMetricStreamFuture(params: PutMetricStreamInput): Future[PutMetricStreamOutput] = service.putMetricStream(params).promise().toFuture
    @inline def setAlarmStateFuture(params: SetAlarmStateInput): Future[js.Object] = service.setAlarmState(params).promise().toFuture
    @inline def startMetricStreamsFuture(params: StartMetricStreamsInput): Future[StartMetricStreamsOutput] = service.startMetricStreams(params).promise().toFuture
    @inline def stopMetricStreamsFuture(params: StopMetricStreamsInput): Future[StopMetricStreamsOutput] = service.stopMetricStreams(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] = service.untagResource(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/cloudwatch", JSImport.Namespace, "AWS.CloudWatch")
  class CloudWatch() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteAlarms(params: DeleteAlarmsInput): Request[js.Object] = js.native
    def deleteAnomalyDetector(params: DeleteAnomalyDetectorInput): Request[DeleteAnomalyDetectorOutput] = js.native
    def deleteDashboards(params: DeleteDashboardsInput): Request[DeleteDashboardsOutput] = js.native
    def deleteInsightRules(params: DeleteInsightRulesInput): Request[DeleteInsightRulesOutput] = js.native
    def deleteMetricStream(params: DeleteMetricStreamInput): Request[DeleteMetricStreamOutput] = js.native
    def describeAlarmHistory(params: DescribeAlarmHistoryInput): Request[DescribeAlarmHistoryOutput] = js.native
    def describeAlarms(params: DescribeAlarmsInput): Request[DescribeAlarmsOutput] = js.native
    def describeAlarmsForMetric(params: DescribeAlarmsForMetricInput): Request[DescribeAlarmsForMetricOutput] = js.native
    def describeAnomalyDetectors(params: DescribeAnomalyDetectorsInput): Request[DescribeAnomalyDetectorsOutput] = js.native
    def describeInsightRules(params: DescribeInsightRulesInput): Request[DescribeInsightRulesOutput] = js.native
    def disableAlarmActions(params: DisableAlarmActionsInput): Request[js.Object] = js.native
    def disableInsightRules(params: DisableInsightRulesInput): Request[DisableInsightRulesOutput] = js.native
    def enableAlarmActions(params: EnableAlarmActionsInput): Request[js.Object] = js.native
    def enableInsightRules(params: EnableInsightRulesInput): Request[EnableInsightRulesOutput] = js.native
    def getDashboard(params: GetDashboardInput): Request[GetDashboardOutput] = js.native
    def getInsightRuleReport(params: GetInsightRuleReportInput): Request[GetInsightRuleReportOutput] = js.native
    def getMetricData(params: GetMetricDataInput): Request[GetMetricDataOutput] = js.native
    def getMetricStatistics(params: GetMetricStatisticsInput): Request[GetMetricStatisticsOutput] = js.native
    def getMetricStream(params: GetMetricStreamInput): Request[GetMetricStreamOutput] = js.native
    def getMetricWidgetImage(params: GetMetricWidgetImageInput): Request[GetMetricWidgetImageOutput] = js.native
    def listDashboards(params: ListDashboardsInput): Request[ListDashboardsOutput] = js.native
    def listMetricStreams(params: ListMetricStreamsInput): Request[ListMetricStreamsOutput] = js.native
    def listMetrics(params: ListMetricsInput): Request[ListMetricsOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def putAnomalyDetector(params: PutAnomalyDetectorInput): Request[PutAnomalyDetectorOutput] = js.native
    def putCompositeAlarm(params: PutCompositeAlarmInput): Request[js.Object] = js.native
    def putDashboard(params: PutDashboardInput): Request[PutDashboardOutput] = js.native
    def putInsightRule(params: PutInsightRuleInput): Request[PutInsightRuleOutput] = js.native
    def putMetricAlarm(params: PutMetricAlarmInput): Request[js.Object] = js.native
    def putMetricData(params: PutMetricDataInput): Request[js.Object] = js.native
    def putMetricStream(params: PutMetricStreamInput): Request[PutMetricStreamOutput] = js.native
    def setAlarmState(params: SetAlarmStateInput): Request[js.Object] = js.native
    def startMetricStreams(params: StartMetricStreamsInput): Request[StartMetricStreamsOutput] = js.native
    def stopMetricStreams(params: StopMetricStreamsInput): Request[StopMetricStreamsOutput] = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput] = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput] = js.native
  }
  object CloudWatch {
    @inline implicit def toOps(service: CloudWatch): CloudWatchOps = {
      new CloudWatchOps(service)
    }
  }

  /** Represents the history of a specific alarm.
    */
  @js.native
  trait AlarmHistoryItem extends js.Object {
    var AlarmName: js.UndefOr[AlarmName]
    var AlarmType: js.UndefOr[AlarmType]
    var HistoryData: js.UndefOr[HistoryData]
    var HistoryItemType: js.UndefOr[HistoryItemType]
    var HistorySummary: js.UndefOr[HistorySummary]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object AlarmHistoryItem {
    @inline
    def apply(
        AlarmName: js.UndefOr[AlarmName] = js.undefined,
        AlarmType: js.UndefOr[AlarmType] = js.undefined,
        HistoryData: js.UndefOr[HistoryData] = js.undefined,
        HistoryItemType: js.UndefOr[HistoryItemType] = js.undefined,
        HistorySummary: js.UndefOr[HistorySummary] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined
    ): AlarmHistoryItem = {
      val __obj = js.Dynamic.literal()
      AlarmName.foreach(__v => __obj.updateDynamic("AlarmName")(__v.asInstanceOf[js.Any]))
      AlarmType.foreach(__v => __obj.updateDynamic("AlarmType")(__v.asInstanceOf[js.Any]))
      HistoryData.foreach(__v => __obj.updateDynamic("HistoryData")(__v.asInstanceOf[js.Any]))
      HistoryItemType.foreach(__v => __obj.updateDynamic("HistoryItemType")(__v.asInstanceOf[js.Any]))
      HistorySummary.foreach(__v => __obj.updateDynamic("HistorySummary")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlarmHistoryItem]
    }
  }

  /** An anomaly detection model associated with a particular CloudWatch metric, statistic, or metric math expression. You can use the model to display a band of expected, normal values when the metric is graphed.
    */
  @js.native
  trait AnomalyDetector extends js.Object {
    var Configuration: js.UndefOr[AnomalyDetectorConfiguration]
    var Dimensions: js.UndefOr[Dimensions]
    var MetricMathAnomalyDetector: js.UndefOr[MetricMathAnomalyDetector]
    var MetricName: js.UndefOr[MetricName]
    var Namespace: js.UndefOr[Namespace]
    var SingleMetricAnomalyDetector: js.UndefOr[SingleMetricAnomalyDetector]
    var Stat: js.UndefOr[AnomalyDetectorMetricStat]
    var StateValue: js.UndefOr[AnomalyDetectorStateValue]
  }

  object AnomalyDetector {
    @inline
    def apply(
        Configuration: js.UndefOr[AnomalyDetectorConfiguration] = js.undefined,
        Dimensions: js.UndefOr[Dimensions] = js.undefined,
        MetricMathAnomalyDetector: js.UndefOr[MetricMathAnomalyDetector] = js.undefined,
        MetricName: js.UndefOr[MetricName] = js.undefined,
        Namespace: js.UndefOr[Namespace] = js.undefined,
        SingleMetricAnomalyDetector: js.UndefOr[SingleMetricAnomalyDetector] = js.undefined,
        Stat: js.UndefOr[AnomalyDetectorMetricStat] = js.undefined,
        StateValue: js.UndefOr[AnomalyDetectorStateValue] = js.undefined
    ): AnomalyDetector = {
      val __obj = js.Dynamic.literal()
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      MetricMathAnomalyDetector.foreach(__v => __obj.updateDynamic("MetricMathAnomalyDetector")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      SingleMetricAnomalyDetector.foreach(__v => __obj.updateDynamic("SingleMetricAnomalyDetector")(__v.asInstanceOf[js.Any]))
      Stat.foreach(__v => __obj.updateDynamic("Stat")(__v.asInstanceOf[js.Any]))
      StateValue.foreach(__v => __obj.updateDynamic("StateValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnomalyDetector]
    }
  }

  /** The configuration specifies details about how the anomaly detection model is to be trained, including time ranges to exclude from use for training the model and the time zone to use for the metric.
    */
  @js.native
  trait AnomalyDetectorConfiguration extends js.Object {
    var ExcludedTimeRanges: js.UndefOr[AnomalyDetectorExcludedTimeRanges]
    var MetricTimezone: js.UndefOr[AnomalyDetectorMetricTimezone]
  }

  object AnomalyDetectorConfiguration {
    @inline
    def apply(
        ExcludedTimeRanges: js.UndefOr[AnomalyDetectorExcludedTimeRanges] = js.undefined,
        MetricTimezone: js.UndefOr[AnomalyDetectorMetricTimezone] = js.undefined
    ): AnomalyDetectorConfiguration = {
      val __obj = js.Dynamic.literal()
      ExcludedTimeRanges.foreach(__v => __obj.updateDynamic("ExcludedTimeRanges")(__v.asInstanceOf[js.Any]))
      MetricTimezone.foreach(__v => __obj.updateDynamic("MetricTimezone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnomalyDetectorConfiguration]
    }
  }

  /** The details about a composite alarm.
    */
  @js.native
  trait CompositeAlarm extends js.Object {
    var ActionsEnabled: js.UndefOr[ActionsEnabled]
    var AlarmActions: js.UndefOr[ResourceList]
    var AlarmArn: js.UndefOr[AlarmArn]
    var AlarmConfigurationUpdatedTimestamp: js.UndefOr[Timestamp]
    var AlarmDescription: js.UndefOr[AlarmDescription]
    var AlarmName: js.UndefOr[AlarmName]
    var AlarmRule: js.UndefOr[AlarmRule]
    var InsufficientDataActions: js.UndefOr[ResourceList]
    var OKActions: js.UndefOr[ResourceList]
    var StateReason: js.UndefOr[StateReason]
    var StateReasonData: js.UndefOr[StateReasonData]
    var StateUpdatedTimestamp: js.UndefOr[Timestamp]
    var StateValue: js.UndefOr[StateValue]
  }

  object CompositeAlarm {
    @inline
    def apply(
        ActionsEnabled: js.UndefOr[ActionsEnabled] = js.undefined,
        AlarmActions: js.UndefOr[ResourceList] = js.undefined,
        AlarmArn: js.UndefOr[AlarmArn] = js.undefined,
        AlarmConfigurationUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        AlarmDescription: js.UndefOr[AlarmDescription] = js.undefined,
        AlarmName: js.UndefOr[AlarmName] = js.undefined,
        AlarmRule: js.UndefOr[AlarmRule] = js.undefined,
        InsufficientDataActions: js.UndefOr[ResourceList] = js.undefined,
        OKActions: js.UndefOr[ResourceList] = js.undefined,
        StateReason: js.UndefOr[StateReason] = js.undefined,
        StateReasonData: js.UndefOr[StateReasonData] = js.undefined,
        StateUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        StateValue: js.UndefOr[StateValue] = js.undefined
    ): CompositeAlarm = {
      val __obj = js.Dynamic.literal()
      ActionsEnabled.foreach(__v => __obj.updateDynamic("ActionsEnabled")(__v.asInstanceOf[js.Any]))
      AlarmActions.foreach(__v => __obj.updateDynamic("AlarmActions")(__v.asInstanceOf[js.Any]))
      AlarmArn.foreach(__v => __obj.updateDynamic("AlarmArn")(__v.asInstanceOf[js.Any]))
      AlarmConfigurationUpdatedTimestamp.foreach(__v => __obj.updateDynamic("AlarmConfigurationUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      AlarmDescription.foreach(__v => __obj.updateDynamic("AlarmDescription")(__v.asInstanceOf[js.Any]))
      AlarmName.foreach(__v => __obj.updateDynamic("AlarmName")(__v.asInstanceOf[js.Any]))
      AlarmRule.foreach(__v => __obj.updateDynamic("AlarmRule")(__v.asInstanceOf[js.Any]))
      InsufficientDataActions.foreach(__v => __obj.updateDynamic("InsufficientDataActions")(__v.asInstanceOf[js.Any]))
      OKActions.foreach(__v => __obj.updateDynamic("OKActions")(__v.asInstanceOf[js.Any]))
      StateReason.foreach(__v => __obj.updateDynamic("StateReason")(__v.asInstanceOf[js.Any]))
      StateReasonData.foreach(__v => __obj.updateDynamic("StateReasonData")(__v.asInstanceOf[js.Any]))
      StateUpdatedTimestamp.foreach(__v => __obj.updateDynamic("StateUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      StateValue.foreach(__v => __obj.updateDynamic("StateValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompositeAlarm]
    }
  }

  /** Represents a specific dashboard.
    */
  @js.native
  trait DashboardEntry extends js.Object {
    var DashboardArn: js.UndefOr[DashboardArn]
    var DashboardName: js.UndefOr[DashboardName]
    var LastModified: js.UndefOr[LastModified]
    var Size: js.UndefOr[Size]
  }

  object DashboardEntry {
    @inline
    def apply(
        DashboardArn: js.UndefOr[DashboardArn] = js.undefined,
        DashboardName: js.UndefOr[DashboardName] = js.undefined,
        LastModified: js.UndefOr[LastModified] = js.undefined,
        Size: js.UndefOr[Size] = js.undefined
    ): DashboardEntry = {
      val __obj = js.Dynamic.literal()
      DashboardArn.foreach(__v => __obj.updateDynamic("DashboardArn")(__v.asInstanceOf[js.Any]))
      DashboardName.foreach(__v => __obj.updateDynamic("DashboardName")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashboardEntry]
    }
  }

  /** An error or warning for the operation.
    */
  @js.native
  trait DashboardValidationMessage extends js.Object {
    var DataPath: js.UndefOr[DataPath]
    var Message: js.UndefOr[Message]
  }

  object DashboardValidationMessage {
    @inline
    def apply(
        DataPath: js.UndefOr[DataPath] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined
    ): DashboardValidationMessage = {
      val __obj = js.Dynamic.literal()
      DataPath.foreach(__v => __obj.updateDynamic("DataPath")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashboardValidationMessage]
    }
  }

  /** Encapsulates the statistical data that CloudWatch computes from metric data.
    */
  @js.native
  trait Datapoint extends js.Object {
    var Average: js.UndefOr[DatapointValue]
    var ExtendedStatistics: js.UndefOr[DatapointValueMap]
    var Maximum: js.UndefOr[DatapointValue]
    var Minimum: js.UndefOr[DatapointValue]
    var SampleCount: js.UndefOr[DatapointValue]
    var Sum: js.UndefOr[DatapointValue]
    var Timestamp: js.UndefOr[Timestamp]
    var Unit: js.UndefOr[StandardUnit]
  }

  object Datapoint {
    @inline
    def apply(
        Average: js.UndefOr[DatapointValue] = js.undefined,
        ExtendedStatistics: js.UndefOr[DatapointValueMap] = js.undefined,
        Maximum: js.UndefOr[DatapointValue] = js.undefined,
        Minimum: js.UndefOr[DatapointValue] = js.undefined,
        SampleCount: js.UndefOr[DatapointValue] = js.undefined,
        Sum: js.UndefOr[DatapointValue] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined,
        Unit: js.UndefOr[StandardUnit] = js.undefined
    ): Datapoint = {
      val __obj = js.Dynamic.literal()
      Average.foreach(__v => __obj.updateDynamic("Average")(__v.asInstanceOf[js.Any]))
      ExtendedStatistics.foreach(__v => __obj.updateDynamic("ExtendedStatistics")(__v.asInstanceOf[js.Any]))
      Maximum.foreach(__v => __obj.updateDynamic("Maximum")(__v.asInstanceOf[js.Any]))
      Minimum.foreach(__v => __obj.updateDynamic("Minimum")(__v.asInstanceOf[js.Any]))
      SampleCount.foreach(__v => __obj.updateDynamic("SampleCount")(__v.asInstanceOf[js.Any]))
      Sum.foreach(__v => __obj.updateDynamic("Sum")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Datapoint]
    }
  }

  @js.native
  trait DeleteAlarmsInput extends js.Object {
    var AlarmNames: AlarmNames
  }

  object DeleteAlarmsInput {
    @inline
    def apply(
        AlarmNames: AlarmNames
    ): DeleteAlarmsInput = {
      val __obj = js.Dynamic.literal(
        "AlarmNames" -> AlarmNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAlarmsInput]
    }
  }

  @js.native
  trait DeleteAnomalyDetectorInput extends js.Object {
    var Dimensions: js.UndefOr[Dimensions]
    var MetricMathAnomalyDetector: js.UndefOr[MetricMathAnomalyDetector]
    var MetricName: js.UndefOr[MetricName]
    var Namespace: js.UndefOr[Namespace]
    var SingleMetricAnomalyDetector: js.UndefOr[SingleMetricAnomalyDetector]
    var Stat: js.UndefOr[AnomalyDetectorMetricStat]
  }

  object DeleteAnomalyDetectorInput {
    @inline
    def apply(
        Dimensions: js.UndefOr[Dimensions] = js.undefined,
        MetricMathAnomalyDetector: js.UndefOr[MetricMathAnomalyDetector] = js.undefined,
        MetricName: js.UndefOr[MetricName] = js.undefined,
        Namespace: js.UndefOr[Namespace] = js.undefined,
        SingleMetricAnomalyDetector: js.UndefOr[SingleMetricAnomalyDetector] = js.undefined,
        Stat: js.UndefOr[AnomalyDetectorMetricStat] = js.undefined
    ): DeleteAnomalyDetectorInput = {
      val __obj = js.Dynamic.literal()
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      MetricMathAnomalyDetector.foreach(__v => __obj.updateDynamic("MetricMathAnomalyDetector")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      SingleMetricAnomalyDetector.foreach(__v => __obj.updateDynamic("SingleMetricAnomalyDetector")(__v.asInstanceOf[js.Any]))
      Stat.foreach(__v => __obj.updateDynamic("Stat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAnomalyDetectorInput]
    }
  }

  @js.native
  trait DeleteAnomalyDetectorOutput extends js.Object

  object DeleteAnomalyDetectorOutput {
    @inline
    def apply(): DeleteAnomalyDetectorOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAnomalyDetectorOutput]
    }
  }

  @js.native
  trait DeleteDashboardsInput extends js.Object {
    var DashboardNames: DashboardNames
  }

  object DeleteDashboardsInput {
    @inline
    def apply(
        DashboardNames: DashboardNames
    ): DeleteDashboardsInput = {
      val __obj = js.Dynamic.literal(
        "DashboardNames" -> DashboardNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDashboardsInput]
    }
  }

  @js.native
  trait DeleteDashboardsOutput extends js.Object

  object DeleteDashboardsOutput {
    @inline
    def apply(): DeleteDashboardsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDashboardsOutput]
    }
  }

  @js.native
  trait DeleteInsightRulesInput extends js.Object {
    var RuleNames: InsightRuleNames
  }

  object DeleteInsightRulesInput {
    @inline
    def apply(
        RuleNames: InsightRuleNames
    ): DeleteInsightRulesInput = {
      val __obj = js.Dynamic.literal(
        "RuleNames" -> RuleNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteInsightRulesInput]
    }
  }

  @js.native
  trait DeleteInsightRulesOutput extends js.Object {
    var Failures: js.UndefOr[BatchFailures]
  }

  object DeleteInsightRulesOutput {
    @inline
    def apply(
        Failures: js.UndefOr[BatchFailures] = js.undefined
    ): DeleteInsightRulesOutput = {
      val __obj = js.Dynamic.literal()
      Failures.foreach(__v => __obj.updateDynamic("Failures")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteInsightRulesOutput]
    }
  }

  @js.native
  trait DeleteMetricStreamInput extends js.Object {
    var Name: MetricStreamName
  }

  object DeleteMetricStreamInput {
    @inline
    def apply(
        Name: MetricStreamName
    ): DeleteMetricStreamInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMetricStreamInput]
    }
  }

  @js.native
  trait DeleteMetricStreamOutput extends js.Object

  object DeleteMetricStreamOutput {
    @inline
    def apply(): DeleteMetricStreamOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteMetricStreamOutput]
    }
  }

  @js.native
  trait DescribeAlarmHistoryInput extends js.Object {
    var AlarmName: js.UndefOr[AlarmName]
    var AlarmTypes: js.UndefOr[AlarmTypes]
    var EndDate: js.UndefOr[Timestamp]
    var HistoryItemType: js.UndefOr[HistoryItemType]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[NextToken]
    var ScanBy: js.UndefOr[ScanBy]
    var StartDate: js.UndefOr[Timestamp]
  }

  object DescribeAlarmHistoryInput {
    @inline
    def apply(
        AlarmName: js.UndefOr[AlarmName] = js.undefined,
        AlarmTypes: js.UndefOr[AlarmTypes] = js.undefined,
        EndDate: js.UndefOr[Timestamp] = js.undefined,
        HistoryItemType: js.UndefOr[HistoryItemType] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ScanBy: js.UndefOr[ScanBy] = js.undefined,
        StartDate: js.UndefOr[Timestamp] = js.undefined
    ): DescribeAlarmHistoryInput = {
      val __obj = js.Dynamic.literal()
      AlarmName.foreach(__v => __obj.updateDynamic("AlarmName")(__v.asInstanceOf[js.Any]))
      AlarmTypes.foreach(__v => __obj.updateDynamic("AlarmTypes")(__v.asInstanceOf[js.Any]))
      EndDate.foreach(__v => __obj.updateDynamic("EndDate")(__v.asInstanceOf[js.Any]))
      HistoryItemType.foreach(__v => __obj.updateDynamic("HistoryItemType")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ScanBy.foreach(__v => __obj.updateDynamic("ScanBy")(__v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.updateDynamic("StartDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAlarmHistoryInput]
    }
  }

  @js.native
  trait DescribeAlarmHistoryOutput extends js.Object {
    var AlarmHistoryItems: js.UndefOr[AlarmHistoryItems]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAlarmHistoryOutput {
    @inline
    def apply(
        AlarmHistoryItems: js.UndefOr[AlarmHistoryItems] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAlarmHistoryOutput = {
      val __obj = js.Dynamic.literal()
      AlarmHistoryItems.foreach(__v => __obj.updateDynamic("AlarmHistoryItems")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAlarmHistoryOutput]
    }
  }

  @js.native
  trait DescribeAlarmsForMetricInput extends js.Object {
    var MetricName: MetricName
    var Namespace: Namespace
    var Dimensions: js.UndefOr[Dimensions]
    var ExtendedStatistic: js.UndefOr[ExtendedStatistic]
    var Period: js.UndefOr[Period]
    var Statistic: js.UndefOr[Statistic]
    var Unit: js.UndefOr[StandardUnit]
  }

  object DescribeAlarmsForMetricInput {
    @inline
    def apply(
        MetricName: MetricName,
        Namespace: Namespace,
        Dimensions: js.UndefOr[Dimensions] = js.undefined,
        ExtendedStatistic: js.UndefOr[ExtendedStatistic] = js.undefined,
        Period: js.UndefOr[Period] = js.undefined,
        Statistic: js.UndefOr[Statistic] = js.undefined,
        Unit: js.UndefOr[StandardUnit] = js.undefined
    ): DescribeAlarmsForMetricInput = {
      val __obj = js.Dynamic.literal(
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )

      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      ExtendedStatistic.foreach(__v => __obj.updateDynamic("ExtendedStatistic")(__v.asInstanceOf[js.Any]))
      Period.foreach(__v => __obj.updateDynamic("Period")(__v.asInstanceOf[js.Any]))
      Statistic.foreach(__v => __obj.updateDynamic("Statistic")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAlarmsForMetricInput]
    }
  }

  @js.native
  trait DescribeAlarmsForMetricOutput extends js.Object {
    var MetricAlarms: js.UndefOr[MetricAlarms]
  }

  object DescribeAlarmsForMetricOutput {
    @inline
    def apply(
        MetricAlarms: js.UndefOr[MetricAlarms] = js.undefined
    ): DescribeAlarmsForMetricOutput = {
      val __obj = js.Dynamic.literal()
      MetricAlarms.foreach(__v => __obj.updateDynamic("MetricAlarms")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAlarmsForMetricOutput]
    }
  }

  @js.native
  trait DescribeAlarmsInput extends js.Object {
    var ActionPrefix: js.UndefOr[ActionPrefix]
    var AlarmNamePrefix: js.UndefOr[AlarmNamePrefix]
    var AlarmNames: js.UndefOr[AlarmNames]
    var AlarmTypes: js.UndefOr[AlarmTypes]
    var ChildrenOfAlarmName: js.UndefOr[AlarmName]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[NextToken]
    var ParentsOfAlarmName: js.UndefOr[AlarmName]
    var StateValue: js.UndefOr[StateValue]
  }

  object DescribeAlarmsInput {
    @inline
    def apply(
        ActionPrefix: js.UndefOr[ActionPrefix] = js.undefined,
        AlarmNamePrefix: js.UndefOr[AlarmNamePrefix] = js.undefined,
        AlarmNames: js.UndefOr[AlarmNames] = js.undefined,
        AlarmTypes: js.UndefOr[AlarmTypes] = js.undefined,
        ChildrenOfAlarmName: js.UndefOr[AlarmName] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ParentsOfAlarmName: js.UndefOr[AlarmName] = js.undefined,
        StateValue: js.UndefOr[StateValue] = js.undefined
    ): DescribeAlarmsInput = {
      val __obj = js.Dynamic.literal()
      ActionPrefix.foreach(__v => __obj.updateDynamic("ActionPrefix")(__v.asInstanceOf[js.Any]))
      AlarmNamePrefix.foreach(__v => __obj.updateDynamic("AlarmNamePrefix")(__v.asInstanceOf[js.Any]))
      AlarmNames.foreach(__v => __obj.updateDynamic("AlarmNames")(__v.asInstanceOf[js.Any]))
      AlarmTypes.foreach(__v => __obj.updateDynamic("AlarmTypes")(__v.asInstanceOf[js.Any]))
      ChildrenOfAlarmName.foreach(__v => __obj.updateDynamic("ChildrenOfAlarmName")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ParentsOfAlarmName.foreach(__v => __obj.updateDynamic("ParentsOfAlarmName")(__v.asInstanceOf[js.Any]))
      StateValue.foreach(__v => __obj.updateDynamic("StateValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAlarmsInput]
    }
  }

  @js.native
  trait DescribeAlarmsOutput extends js.Object {
    var CompositeAlarms: js.UndefOr[CompositeAlarms]
    var MetricAlarms: js.UndefOr[MetricAlarms]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAlarmsOutput {
    @inline
    def apply(
        CompositeAlarms: js.UndefOr[CompositeAlarms] = js.undefined,
        MetricAlarms: js.UndefOr[MetricAlarms] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAlarmsOutput = {
      val __obj = js.Dynamic.literal()
      CompositeAlarms.foreach(__v => __obj.updateDynamic("CompositeAlarms")(__v.asInstanceOf[js.Any]))
      MetricAlarms.foreach(__v => __obj.updateDynamic("MetricAlarms")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAlarmsOutput]
    }
  }

  @js.native
  trait DescribeAnomalyDetectorsInput extends js.Object {
    var AnomalyDetectorTypes: js.UndefOr[AnomalyDetectorTypes]
    var Dimensions: js.UndefOr[Dimensions]
    var MaxResults: js.UndefOr[MaxReturnedResultsCount]
    var MetricName: js.UndefOr[MetricName]
    var Namespace: js.UndefOr[Namespace]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAnomalyDetectorsInput {
    @inline
    def apply(
        AnomalyDetectorTypes: js.UndefOr[AnomalyDetectorTypes] = js.undefined,
        Dimensions: js.UndefOr[Dimensions] = js.undefined,
        MaxResults: js.UndefOr[MaxReturnedResultsCount] = js.undefined,
        MetricName: js.UndefOr[MetricName] = js.undefined,
        Namespace: js.UndefOr[Namespace] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAnomalyDetectorsInput = {
      val __obj = js.Dynamic.literal()
      AnomalyDetectorTypes.foreach(__v => __obj.updateDynamic("AnomalyDetectorTypes")(__v.asInstanceOf[js.Any]))
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAnomalyDetectorsInput]
    }
  }

  @js.native
  trait DescribeAnomalyDetectorsOutput extends js.Object {
    var AnomalyDetectors: js.UndefOr[AnomalyDetectors]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAnomalyDetectorsOutput {
    @inline
    def apply(
        AnomalyDetectors: js.UndefOr[AnomalyDetectors] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAnomalyDetectorsOutput = {
      val __obj = js.Dynamic.literal()
      AnomalyDetectors.foreach(__v => __obj.updateDynamic("AnomalyDetectors")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAnomalyDetectorsOutput]
    }
  }

  @js.native
  trait DescribeInsightRulesInput extends js.Object {
    var MaxResults: js.UndefOr[InsightRuleMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInsightRulesInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[InsightRuleMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInsightRulesInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInsightRulesInput]
    }
  }

  @js.native
  trait DescribeInsightRulesOutput extends js.Object {
    var InsightRules: js.UndefOr[InsightRules]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInsightRulesOutput {
    @inline
    def apply(
        InsightRules: js.UndefOr[InsightRules] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInsightRulesOutput = {
      val __obj = js.Dynamic.literal()
      InsightRules.foreach(__v => __obj.updateDynamic("InsightRules")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInsightRulesOutput]
    }
  }

  /** A dimension is a name/value pair that is part of the identity of a metric. You can assign up to 10 dimensions to a metric. Because dimensions are part of the unique identifier for a metric, whenever you add a unique name/value pair to one of your metrics, you are creating a new variation of that metric.
    */
  @js.native
  trait Dimension extends js.Object {
    var Name: DimensionName
    var Value: DimensionValue
  }

  object Dimension {
    @inline
    def apply(
        Name: DimensionName,
        Value: DimensionValue
    ): Dimension = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Dimension]
    }
  }

  /** Represents filters for a dimension.
    */
  @js.native
  trait DimensionFilter extends js.Object {
    var Name: DimensionName
    var Value: js.UndefOr[DimensionValue]
  }

  object DimensionFilter {
    @inline
    def apply(
        Name: DimensionName,
        Value: js.UndefOr[DimensionValue] = js.undefined
    ): DimensionFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DimensionFilter]
    }
  }

  @js.native
  trait DisableAlarmActionsInput extends js.Object {
    var AlarmNames: AlarmNames
  }

  object DisableAlarmActionsInput {
    @inline
    def apply(
        AlarmNames: AlarmNames
    ): DisableAlarmActionsInput = {
      val __obj = js.Dynamic.literal(
        "AlarmNames" -> AlarmNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisableAlarmActionsInput]
    }
  }

  @js.native
  trait DisableInsightRulesInput extends js.Object {
    var RuleNames: InsightRuleNames
  }

  object DisableInsightRulesInput {
    @inline
    def apply(
        RuleNames: InsightRuleNames
    ): DisableInsightRulesInput = {
      val __obj = js.Dynamic.literal(
        "RuleNames" -> RuleNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisableInsightRulesInput]
    }
  }

  @js.native
  trait DisableInsightRulesOutput extends js.Object {
    var Failures: js.UndefOr[BatchFailures]
  }

  object DisableInsightRulesOutput {
    @inline
    def apply(
        Failures: js.UndefOr[BatchFailures] = js.undefined
    ): DisableInsightRulesOutput = {
      val __obj = js.Dynamic.literal()
      Failures.foreach(__v => __obj.updateDynamic("Failures")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisableInsightRulesOutput]
    }
  }

  @js.native
  trait EnableAlarmActionsInput extends js.Object {
    var AlarmNames: AlarmNames
  }

  object EnableAlarmActionsInput {
    @inline
    def apply(
        AlarmNames: AlarmNames
    ): EnableAlarmActionsInput = {
      val __obj = js.Dynamic.literal(
        "AlarmNames" -> AlarmNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EnableAlarmActionsInput]
    }
  }

  @js.native
  trait EnableInsightRulesInput extends js.Object {
    var RuleNames: InsightRuleNames
  }

  object EnableInsightRulesInput {
    @inline
    def apply(
        RuleNames: InsightRuleNames
    ): EnableInsightRulesInput = {
      val __obj = js.Dynamic.literal(
        "RuleNames" -> RuleNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EnableInsightRulesInput]
    }
  }

  @js.native
  trait EnableInsightRulesOutput extends js.Object {
    var Failures: js.UndefOr[BatchFailures]
  }

  object EnableInsightRulesOutput {
    @inline
    def apply(
        Failures: js.UndefOr[BatchFailures] = js.undefined
    ): EnableInsightRulesOutput = {
      val __obj = js.Dynamic.literal()
      Failures.foreach(__v => __obj.updateDynamic("Failures")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableInsightRulesOutput]
    }
  }

  @js.native
  trait GetDashboardInput extends js.Object {
    var DashboardName: DashboardName
  }

  object GetDashboardInput {
    @inline
    def apply(
        DashboardName: DashboardName
    ): GetDashboardInput = {
      val __obj = js.Dynamic.literal(
        "DashboardName" -> DashboardName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDashboardInput]
    }
  }

  @js.native
  trait GetDashboardOutput extends js.Object {
    var DashboardArn: js.UndefOr[DashboardArn]
    var DashboardBody: js.UndefOr[DashboardBody]
    var DashboardName: js.UndefOr[DashboardName]
  }

  object GetDashboardOutput {
    @inline
    def apply(
        DashboardArn: js.UndefOr[DashboardArn] = js.undefined,
        DashboardBody: js.UndefOr[DashboardBody] = js.undefined,
        DashboardName: js.UndefOr[DashboardName] = js.undefined
    ): GetDashboardOutput = {
      val __obj = js.Dynamic.literal()
      DashboardArn.foreach(__v => __obj.updateDynamic("DashboardArn")(__v.asInstanceOf[js.Any]))
      DashboardBody.foreach(__v => __obj.updateDynamic("DashboardBody")(__v.asInstanceOf[js.Any]))
      DashboardName.foreach(__v => __obj.updateDynamic("DashboardName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDashboardOutput]
    }
  }

  @js.native
  trait GetInsightRuleReportInput extends js.Object {
    var EndTime: Timestamp
    var Period: Period
    var RuleName: InsightRuleName
    var StartTime: Timestamp
    var MaxContributorCount: js.UndefOr[InsightRuleUnboundInteger]
    var Metrics: js.UndefOr[InsightRuleMetricList]
    var OrderBy: js.UndefOr[InsightRuleOrderBy]
  }

  object GetInsightRuleReportInput {
    @inline
    def apply(
        EndTime: Timestamp,
        Period: Period,
        RuleName: InsightRuleName,
        StartTime: Timestamp,
        MaxContributorCount: js.UndefOr[InsightRuleUnboundInteger] = js.undefined,
        Metrics: js.UndefOr[InsightRuleMetricList] = js.undefined,
        OrderBy: js.UndefOr[InsightRuleOrderBy] = js.undefined
    ): GetInsightRuleReportInput = {
      val __obj = js.Dynamic.literal(
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "Period" -> Period.asInstanceOf[js.Any],
        "RuleName" -> RuleName.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      MaxContributorCount.foreach(__v => __obj.updateDynamic("MaxContributorCount")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      OrderBy.foreach(__v => __obj.updateDynamic("OrderBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInsightRuleReportInput]
    }
  }

  @js.native
  trait GetInsightRuleReportOutput extends js.Object {
    var AggregateValue: js.UndefOr[InsightRuleUnboundDouble]
    var AggregationStatistic: js.UndefOr[InsightRuleAggregationStatistic]
    var ApproximateUniqueCount: js.UndefOr[InsightRuleUnboundLong]
    var Contributors: js.UndefOr[InsightRuleContributors]
    var KeyLabels: js.UndefOr[InsightRuleContributorKeyLabels]
    var MetricDatapoints: js.UndefOr[InsightRuleMetricDatapoints]
  }

  object GetInsightRuleReportOutput {
    @inline
    def apply(
        AggregateValue: js.UndefOr[InsightRuleUnboundDouble] = js.undefined,
        AggregationStatistic: js.UndefOr[InsightRuleAggregationStatistic] = js.undefined,
        ApproximateUniqueCount: js.UndefOr[InsightRuleUnboundLong] = js.undefined,
        Contributors: js.UndefOr[InsightRuleContributors] = js.undefined,
        KeyLabels: js.UndefOr[InsightRuleContributorKeyLabels] = js.undefined,
        MetricDatapoints: js.UndefOr[InsightRuleMetricDatapoints] = js.undefined
    ): GetInsightRuleReportOutput = {
      val __obj = js.Dynamic.literal()
      AggregateValue.foreach(__v => __obj.updateDynamic("AggregateValue")(__v.asInstanceOf[js.Any]))
      AggregationStatistic.foreach(__v => __obj.updateDynamic("AggregationStatistic")(__v.asInstanceOf[js.Any]))
      ApproximateUniqueCount.foreach(__v => __obj.updateDynamic("ApproximateUniqueCount")(__v.asInstanceOf[js.Any]))
      Contributors.foreach(__v => __obj.updateDynamic("Contributors")(__v.asInstanceOf[js.Any]))
      KeyLabels.foreach(__v => __obj.updateDynamic("KeyLabels")(__v.asInstanceOf[js.Any]))
      MetricDatapoints.foreach(__v => __obj.updateDynamic("MetricDatapoints")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInsightRuleReportOutput]
    }
  }

  @js.native
  trait GetMetricDataInput extends js.Object {
    var EndTime: Timestamp
    var MetricDataQueries: MetricDataQueries
    var StartTime: Timestamp
    var LabelOptions: js.UndefOr[LabelOptions]
    var MaxDatapoints: js.UndefOr[GetMetricDataMaxDatapoints]
    var NextToken: js.UndefOr[NextToken]
    var ScanBy: js.UndefOr[ScanBy]
  }

  object GetMetricDataInput {
    @inline
    def apply(
        EndTime: Timestamp,
        MetricDataQueries: MetricDataQueries,
        StartTime: Timestamp,
        LabelOptions: js.UndefOr[LabelOptions] = js.undefined,
        MaxDatapoints: js.UndefOr[GetMetricDataMaxDatapoints] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ScanBy: js.UndefOr[ScanBy] = js.undefined
    ): GetMetricDataInput = {
      val __obj = js.Dynamic.literal(
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "MetricDataQueries" -> MetricDataQueries.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      LabelOptions.foreach(__v => __obj.updateDynamic("LabelOptions")(__v.asInstanceOf[js.Any]))
      MaxDatapoints.foreach(__v => __obj.updateDynamic("MaxDatapoints")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ScanBy.foreach(__v => __obj.updateDynamic("ScanBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMetricDataInput]
    }
  }

  @js.native
  trait GetMetricDataOutput extends js.Object {
    var Messages: js.UndefOr[MetricDataResultMessages]
    var MetricDataResults: js.UndefOr[MetricDataResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetMetricDataOutput {
    @inline
    def apply(
        Messages: js.UndefOr[MetricDataResultMessages] = js.undefined,
        MetricDataResults: js.UndefOr[MetricDataResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetMetricDataOutput = {
      val __obj = js.Dynamic.literal()
      Messages.foreach(__v => __obj.updateDynamic("Messages")(__v.asInstanceOf[js.Any]))
      MetricDataResults.foreach(__v => __obj.updateDynamic("MetricDataResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMetricDataOutput]
    }
  }

  @js.native
  trait GetMetricStatisticsInput extends js.Object {
    var EndTime: Timestamp
    var MetricName: MetricName
    var Namespace: Namespace
    var Period: Period
    var StartTime: Timestamp
    var Dimensions: js.UndefOr[Dimensions]
    var ExtendedStatistics: js.UndefOr[ExtendedStatistics]
    var Statistics: js.UndefOr[Statistics]
    var Unit: js.UndefOr[StandardUnit]
  }

  object GetMetricStatisticsInput {
    @inline
    def apply(
        EndTime: Timestamp,
        MetricName: MetricName,
        Namespace: Namespace,
        Period: Period,
        StartTime: Timestamp,
        Dimensions: js.UndefOr[Dimensions] = js.undefined,
        ExtendedStatistics: js.UndefOr[ExtendedStatistics] = js.undefined,
        Statistics: js.UndefOr[Statistics] = js.undefined,
        Unit: js.UndefOr[StandardUnit] = js.undefined
    ): GetMetricStatisticsInput = {
      val __obj = js.Dynamic.literal(
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any],
        "Period" -> Period.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )

      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      ExtendedStatistics.foreach(__v => __obj.updateDynamic("ExtendedStatistics")(__v.asInstanceOf[js.Any]))
      Statistics.foreach(__v => __obj.updateDynamic("Statistics")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMetricStatisticsInput]
    }
  }

  @js.native
  trait GetMetricStatisticsOutput extends js.Object {
    var Datapoints: js.UndefOr[Datapoints]
    var Label: js.UndefOr[MetricLabel]
  }

  object GetMetricStatisticsOutput {
    @inline
    def apply(
        Datapoints: js.UndefOr[Datapoints] = js.undefined,
        Label: js.UndefOr[MetricLabel] = js.undefined
    ): GetMetricStatisticsOutput = {
      val __obj = js.Dynamic.literal()
      Datapoints.foreach(__v => __obj.updateDynamic("Datapoints")(__v.asInstanceOf[js.Any]))
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMetricStatisticsOutput]
    }
  }

  @js.native
  trait GetMetricStreamInput extends js.Object {
    var Name: MetricStreamName
  }

  object GetMetricStreamInput {
    @inline
    def apply(
        Name: MetricStreamName
    ): GetMetricStreamInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMetricStreamInput]
    }
  }

  @js.native
  trait GetMetricStreamOutput extends js.Object {
    var Arn: js.UndefOr[AmazonResourceName]
    var CreationDate: js.UndefOr[Timestamp]
    var ExcludeFilters: js.UndefOr[MetricStreamFilters]
    var FirehoseArn: js.UndefOr[AmazonResourceName]
    var IncludeFilters: js.UndefOr[MetricStreamFilters]
    var LastUpdateDate: js.UndefOr[Timestamp]
    var Name: js.UndefOr[MetricStreamName]
    var OutputFormat: js.UndefOr[MetricStreamOutputFormat]
    var RoleArn: js.UndefOr[AmazonResourceName]
    var State: js.UndefOr[MetricStreamState]
  }

  object GetMetricStreamOutput {
    @inline
    def apply(
        Arn: js.UndefOr[AmazonResourceName] = js.undefined,
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        ExcludeFilters: js.UndefOr[MetricStreamFilters] = js.undefined,
        FirehoseArn: js.UndefOr[AmazonResourceName] = js.undefined,
        IncludeFilters: js.UndefOr[MetricStreamFilters] = js.undefined,
        LastUpdateDate: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[MetricStreamName] = js.undefined,
        OutputFormat: js.UndefOr[MetricStreamOutputFormat] = js.undefined,
        RoleArn: js.UndefOr[AmazonResourceName] = js.undefined,
        State: js.UndefOr[MetricStreamState] = js.undefined
    ): GetMetricStreamOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      ExcludeFilters.foreach(__v => __obj.updateDynamic("ExcludeFilters")(__v.asInstanceOf[js.Any]))
      FirehoseArn.foreach(__v => __obj.updateDynamic("FirehoseArn")(__v.asInstanceOf[js.Any]))
      IncludeFilters.foreach(__v => __obj.updateDynamic("IncludeFilters")(__v.asInstanceOf[js.Any]))
      LastUpdateDate.foreach(__v => __obj.updateDynamic("LastUpdateDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutputFormat.foreach(__v => __obj.updateDynamic("OutputFormat")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMetricStreamOutput]
    }
  }

  @js.native
  trait GetMetricWidgetImageInput extends js.Object {
    var MetricWidget: MetricWidget
    var OutputFormat: js.UndefOr[OutputFormat]
  }

  object GetMetricWidgetImageInput {
    @inline
    def apply(
        MetricWidget: MetricWidget,
        OutputFormat: js.UndefOr[OutputFormat] = js.undefined
    ): GetMetricWidgetImageInput = {
      val __obj = js.Dynamic.literal(
        "MetricWidget" -> MetricWidget.asInstanceOf[js.Any]
      )

      OutputFormat.foreach(__v => __obj.updateDynamic("OutputFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMetricWidgetImageInput]
    }
  }

  @js.native
  trait GetMetricWidgetImageOutput extends js.Object {
    var MetricWidgetImage: js.UndefOr[MetricWidgetImage]
  }

  object GetMetricWidgetImageOutput {
    @inline
    def apply(
        MetricWidgetImage: js.UndefOr[MetricWidgetImage] = js.undefined
    ): GetMetricWidgetImageOutput = {
      val __obj = js.Dynamic.literal()
      MetricWidgetImage.foreach(__v => __obj.updateDynamic("MetricWidgetImage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMetricWidgetImageOutput]
    }
  }

  /** This structure contains the definition for a Contributor Insights rule. For more information about this rule, see[[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights.html| Using Constributor Insights to analyze high-cardinality data]] in the <i>Amazon CloudWatch User Guide</i>.
    */
  @js.native
  trait InsightRule extends js.Object {
    var Definition: InsightRuleDefinition
    var Name: InsightRuleName
    var Schema: InsightRuleSchema
    var State: InsightRuleState
  }

  object InsightRule {
    @inline
    def apply(
        Definition: InsightRuleDefinition,
        Name: InsightRuleName,
        Schema: InsightRuleSchema,
        State: InsightRuleState
    ): InsightRule = {
      val __obj = js.Dynamic.literal(
        "Definition" -> Definition.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Schema" -> Schema.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InsightRule]
    }
  }

  /** One of the unique contributors found by a Contributor Insights rule. If the rule contains multiple keys, then a unique contributor is a unique combination of values from all the keys in the rule. If the rule contains a single key, then each unique contributor is each unique value for this key. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetInsightRuleReport.html|GetInsightRuleReport]].
    */
  @js.native
  trait InsightRuleContributor extends js.Object {
    var ApproximateAggregateValue: InsightRuleUnboundDouble
    var Datapoints: InsightRuleContributorDatapoints
    var Keys: InsightRuleContributorKeys
  }

  object InsightRuleContributor {
    @inline
    def apply(
        ApproximateAggregateValue: InsightRuleUnboundDouble,
        Datapoints: InsightRuleContributorDatapoints,
        Keys: InsightRuleContributorKeys
    ): InsightRuleContributor = {
      val __obj = js.Dynamic.literal(
        "ApproximateAggregateValue" -> ApproximateAggregateValue.asInstanceOf[js.Any],
        "Datapoints" -> Datapoints.asInstanceOf[js.Any],
        "Keys" -> Keys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InsightRuleContributor]
    }
  }

  /** One data point related to one contributor. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetInsightRuleReport.html|GetInsightRuleReport]] and [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_InsightRuleContributor.html|InsightRuleContributor]].
    */
  @js.native
  trait InsightRuleContributorDatapoint extends js.Object {
    var ApproximateValue: InsightRuleUnboundDouble
    var Timestamp: Timestamp
  }

  object InsightRuleContributorDatapoint {
    @inline
    def apply(
        ApproximateValue: InsightRuleUnboundDouble,
        Timestamp: Timestamp
    ): InsightRuleContributorDatapoint = {
      val __obj = js.Dynamic.literal(
        "ApproximateValue" -> ApproximateValue.asInstanceOf[js.Any],
        "Timestamp" -> Timestamp.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InsightRuleContributorDatapoint]
    }
  }

  /** One data point from the metric time series returned in a Contributor Insights rule report. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetInsightRuleReport.html|GetInsightRuleReport]].
    */
  @js.native
  trait InsightRuleMetricDatapoint extends js.Object {
    var Timestamp: Timestamp
    var Average: js.UndefOr[InsightRuleUnboundDouble]
    var MaxContributorValue: js.UndefOr[InsightRuleUnboundDouble]
    var Maximum: js.UndefOr[InsightRuleUnboundDouble]
    var Minimum: js.UndefOr[InsightRuleUnboundDouble]
    var SampleCount: js.UndefOr[InsightRuleUnboundDouble]
    var Sum: js.UndefOr[InsightRuleUnboundDouble]
    var UniqueContributors: js.UndefOr[InsightRuleUnboundDouble]
  }

  object InsightRuleMetricDatapoint {
    @inline
    def apply(
        Timestamp: Timestamp,
        Average: js.UndefOr[InsightRuleUnboundDouble] = js.undefined,
        MaxContributorValue: js.UndefOr[InsightRuleUnboundDouble] = js.undefined,
        Maximum: js.UndefOr[InsightRuleUnboundDouble] = js.undefined,
        Minimum: js.UndefOr[InsightRuleUnboundDouble] = js.undefined,
        SampleCount: js.UndefOr[InsightRuleUnboundDouble] = js.undefined,
        Sum: js.UndefOr[InsightRuleUnboundDouble] = js.undefined,
        UniqueContributors: js.UndefOr[InsightRuleUnboundDouble] = js.undefined
    ): InsightRuleMetricDatapoint = {
      val __obj = js.Dynamic.literal(
        "Timestamp" -> Timestamp.asInstanceOf[js.Any]
      )

      Average.foreach(__v => __obj.updateDynamic("Average")(__v.asInstanceOf[js.Any]))
      MaxContributorValue.foreach(__v => __obj.updateDynamic("MaxContributorValue")(__v.asInstanceOf[js.Any]))
      Maximum.foreach(__v => __obj.updateDynamic("Maximum")(__v.asInstanceOf[js.Any]))
      Minimum.foreach(__v => __obj.updateDynamic("Minimum")(__v.asInstanceOf[js.Any]))
      SampleCount.foreach(__v => __obj.updateDynamic("SampleCount")(__v.asInstanceOf[js.Any]))
      Sum.foreach(__v => __obj.updateDynamic("Sum")(__v.asInstanceOf[js.Any]))
      UniqueContributors.foreach(__v => __obj.updateDynamic("UniqueContributors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InsightRuleMetricDatapoint]
    }
  }

  /** This structure includes the <code>Timezone</code> parameter, which you can use to specify your time zone so that the labels that are associated with returned metrics display the correct time for your time zone. The <code>Timezone</code> value affects a label only if you have a time-based dynamic expression in the label. For more information about dynamic expressions in labels, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html|Using Dynamic Labels]].
    */
  @js.native
  trait LabelOptions extends js.Object {
    var Timezone: js.UndefOr[GetMetricDataLabelTimezone]
  }

  object LabelOptions {
    @inline
    def apply(
        Timezone: js.UndefOr[GetMetricDataLabelTimezone] = js.undefined
    ): LabelOptions = {
      val __obj = js.Dynamic.literal()
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelOptions]
    }
  }

  @js.native
  trait ListDashboardsInput extends js.Object {
    var DashboardNamePrefix: js.UndefOr[DashboardNamePrefix]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDashboardsInput {
    @inline
    def apply(
        DashboardNamePrefix: js.UndefOr[DashboardNamePrefix] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDashboardsInput = {
      val __obj = js.Dynamic.literal()
      DashboardNamePrefix.foreach(__v => __obj.updateDynamic("DashboardNamePrefix")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDashboardsInput]
    }
  }

  @js.native
  trait ListDashboardsOutput extends js.Object {
    var DashboardEntries: js.UndefOr[DashboardEntries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDashboardsOutput {
    @inline
    def apply(
        DashboardEntries: js.UndefOr[DashboardEntries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDashboardsOutput = {
      val __obj = js.Dynamic.literal()
      DashboardEntries.foreach(__v => __obj.updateDynamic("DashboardEntries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDashboardsOutput]
    }
  }

  @js.native
  trait ListMetricStreamsInput extends js.Object {
    var MaxResults: js.UndefOr[ListMetricStreamsMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMetricStreamsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListMetricStreamsMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMetricStreamsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMetricStreamsInput]
    }
  }

  @js.native
  trait ListMetricStreamsOutput extends js.Object {
    var Entries: js.UndefOr[MetricStreamEntries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMetricStreamsOutput {
    @inline
    def apply(
        Entries: js.UndefOr[MetricStreamEntries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMetricStreamsOutput = {
      val __obj = js.Dynamic.literal()
      Entries.foreach(__v => __obj.updateDynamic("Entries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMetricStreamsOutput]
    }
  }

  @js.native
  trait ListMetricsInput extends js.Object {
    var Dimensions: js.UndefOr[DimensionFilters]
    var MetricName: js.UndefOr[MetricName]
    var Namespace: js.UndefOr[Namespace]
    var NextToken: js.UndefOr[NextToken]
    var RecentlyActive: js.UndefOr[RecentlyActive]
  }

  object ListMetricsInput {
    @inline
    def apply(
        Dimensions: js.UndefOr[DimensionFilters] = js.undefined,
        MetricName: js.UndefOr[MetricName] = js.undefined,
        Namespace: js.UndefOr[Namespace] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RecentlyActive: js.UndefOr[RecentlyActive] = js.undefined
    ): ListMetricsInput = {
      val __obj = js.Dynamic.literal()
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RecentlyActive.foreach(__v => __obj.updateDynamic("RecentlyActive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMetricsInput]
    }
  }

  @js.native
  trait ListMetricsOutput extends js.Object {
    var Metrics: js.UndefOr[Metrics]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMetricsOutput {
    @inline
    def apply(
        Metrics: js.UndefOr[Metrics] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMetricsOutput = {
      val __obj = js.Dynamic.literal()
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMetricsOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var ResourceARN: AmazonResourceName
  }

  object ListTagsForResourceInput {
    @inline
    def apply(
        ResourceARN: AmazonResourceName
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceOutput {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  /** A message returned by the <code>GetMetricData</code>API, including a code and a description. If a cross-Region <code>GetMetricData</code> operation fails with a code of <code>Forbidden</code> and a value of <code>Authentication too complex to retrieve cross region data</code>, you can correct the problem by running the <code>GetMetricData</code> operation in the same Region where the metric data is.
    */
  @js.native
  trait MessageData extends js.Object {
    var Code: js.UndefOr[MessageDataCode]
    var Value: js.UndefOr[MessageDataValue]
  }

  object MessageData {
    @inline
    def apply(
        Code: js.UndefOr[MessageDataCode] = js.undefined,
        Value: js.UndefOr[MessageDataValue] = js.undefined
    ): MessageData = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageData]
    }
  }

  /** Represents a specific metric.
    */
  @js.native
  trait Metric extends js.Object {
    var Dimensions: js.UndefOr[Dimensions]
    var MetricName: js.UndefOr[MetricName]
    var Namespace: js.UndefOr[Namespace]
  }

  object Metric {
    @inline
    def apply(
        Dimensions: js.UndefOr[Dimensions] = js.undefined,
        MetricName: js.UndefOr[MetricName] = js.undefined,
        Namespace: js.UndefOr[Namespace] = js.undefined
    ): Metric = {
      val __obj = js.Dynamic.literal()
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Metric]
    }
  }

  /** The details about a metric alarm.
    */
  @js.native
  trait MetricAlarm extends js.Object {
    var ActionsEnabled: js.UndefOr[ActionsEnabled]
    var AlarmActions: js.UndefOr[ResourceList]
    var AlarmArn: js.UndefOr[AlarmArn]
    var AlarmConfigurationUpdatedTimestamp: js.UndefOr[Timestamp]
    var AlarmDescription: js.UndefOr[AlarmDescription]
    var AlarmName: js.UndefOr[AlarmName]
    var ComparisonOperator: js.UndefOr[ComparisonOperator]
    var DatapointsToAlarm: js.UndefOr[DatapointsToAlarm]
    var Dimensions: js.UndefOr[Dimensions]
    var EvaluateLowSampleCountPercentile: js.UndefOr[EvaluateLowSampleCountPercentile]
    var EvaluationPeriods: js.UndefOr[EvaluationPeriods]
    var ExtendedStatistic: js.UndefOr[ExtendedStatistic]
    var InsufficientDataActions: js.UndefOr[ResourceList]
    var MetricName: js.UndefOr[MetricName]
    var Metrics: js.UndefOr[MetricDataQueries]
    var Namespace: js.UndefOr[Namespace]
    var OKActions: js.UndefOr[ResourceList]
    var Period: js.UndefOr[Period]
    var StateReason: js.UndefOr[StateReason]
    var StateReasonData: js.UndefOr[StateReasonData]
    var StateUpdatedTimestamp: js.UndefOr[Timestamp]
    var StateValue: js.UndefOr[StateValue]
    var Statistic: js.UndefOr[Statistic]
    var Threshold: js.UndefOr[Threshold]
    var ThresholdMetricId: js.UndefOr[MetricId]
    var TreatMissingData: js.UndefOr[TreatMissingData]
    var Unit: js.UndefOr[StandardUnit]
  }

  object MetricAlarm {
    @inline
    def apply(
        ActionsEnabled: js.UndefOr[ActionsEnabled] = js.undefined,
        AlarmActions: js.UndefOr[ResourceList] = js.undefined,
        AlarmArn: js.UndefOr[AlarmArn] = js.undefined,
        AlarmConfigurationUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        AlarmDescription: js.UndefOr[AlarmDescription] = js.undefined,
        AlarmName: js.UndefOr[AlarmName] = js.undefined,
        ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined,
        DatapointsToAlarm: js.UndefOr[DatapointsToAlarm] = js.undefined,
        Dimensions: js.UndefOr[Dimensions] = js.undefined,
        EvaluateLowSampleCountPercentile: js.UndefOr[EvaluateLowSampleCountPercentile] = js.undefined,
        EvaluationPeriods: js.UndefOr[EvaluationPeriods] = js.undefined,
        ExtendedStatistic: js.UndefOr[ExtendedStatistic] = js.undefined,
        InsufficientDataActions: js.UndefOr[ResourceList] = js.undefined,
        MetricName: js.UndefOr[MetricName] = js.undefined,
        Metrics: js.UndefOr[MetricDataQueries] = js.undefined,
        Namespace: js.UndefOr[Namespace] = js.undefined,
        OKActions: js.UndefOr[ResourceList] = js.undefined,
        Period: js.UndefOr[Period] = js.undefined,
        StateReason: js.UndefOr[StateReason] = js.undefined,
        StateReasonData: js.UndefOr[StateReasonData] = js.undefined,
        StateUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        StateValue: js.UndefOr[StateValue] = js.undefined,
        Statistic: js.UndefOr[Statistic] = js.undefined,
        Threshold: js.UndefOr[Threshold] = js.undefined,
        ThresholdMetricId: js.UndefOr[MetricId] = js.undefined,
        TreatMissingData: js.UndefOr[TreatMissingData] = js.undefined,
        Unit: js.UndefOr[StandardUnit] = js.undefined
    ): MetricAlarm = {
      val __obj = js.Dynamic.literal()
      ActionsEnabled.foreach(__v => __obj.updateDynamic("ActionsEnabled")(__v.asInstanceOf[js.Any]))
      AlarmActions.foreach(__v => __obj.updateDynamic("AlarmActions")(__v.asInstanceOf[js.Any]))
      AlarmArn.foreach(__v => __obj.updateDynamic("AlarmArn")(__v.asInstanceOf[js.Any]))
      AlarmConfigurationUpdatedTimestamp.foreach(__v => __obj.updateDynamic("AlarmConfigurationUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      AlarmDescription.foreach(__v => __obj.updateDynamic("AlarmDescription")(__v.asInstanceOf[js.Any]))
      AlarmName.foreach(__v => __obj.updateDynamic("AlarmName")(__v.asInstanceOf[js.Any]))
      ComparisonOperator.foreach(__v => __obj.updateDynamic("ComparisonOperator")(__v.asInstanceOf[js.Any]))
      DatapointsToAlarm.foreach(__v => __obj.updateDynamic("DatapointsToAlarm")(__v.asInstanceOf[js.Any]))
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      EvaluateLowSampleCountPercentile.foreach(__v => __obj.updateDynamic("EvaluateLowSampleCountPercentile")(__v.asInstanceOf[js.Any]))
      EvaluationPeriods.foreach(__v => __obj.updateDynamic("EvaluationPeriods")(__v.asInstanceOf[js.Any]))
      ExtendedStatistic.foreach(__v => __obj.updateDynamic("ExtendedStatistic")(__v.asInstanceOf[js.Any]))
      InsufficientDataActions.foreach(__v => __obj.updateDynamic("InsufficientDataActions")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      OKActions.foreach(__v => __obj.updateDynamic("OKActions")(__v.asInstanceOf[js.Any]))
      Period.foreach(__v => __obj.updateDynamic("Period")(__v.asInstanceOf[js.Any]))
      StateReason.foreach(__v => __obj.updateDynamic("StateReason")(__v.asInstanceOf[js.Any]))
      StateReasonData.foreach(__v => __obj.updateDynamic("StateReasonData")(__v.asInstanceOf[js.Any]))
      StateUpdatedTimestamp.foreach(__v => __obj.updateDynamic("StateUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      StateValue.foreach(__v => __obj.updateDynamic("StateValue")(__v.asInstanceOf[js.Any]))
      Statistic.foreach(__v => __obj.updateDynamic("Statistic")(__v.asInstanceOf[js.Any]))
      Threshold.foreach(__v => __obj.updateDynamic("Threshold")(__v.asInstanceOf[js.Any]))
      ThresholdMetricId.foreach(__v => __obj.updateDynamic("ThresholdMetricId")(__v.asInstanceOf[js.Any]))
      TreatMissingData.foreach(__v => __obj.updateDynamic("TreatMissingData")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricAlarm]
    }
  }

  /** This structure is used in both <code>GetMetricData</code> and <code>PutMetricAlarm</code>. The supported use of this structure is different for those two operations. When used in <code>GetMetricData</code>, it indicates the metric data to return, and whether this call is just retrieving a batch set of data for one metric, or is performing a math expression on metric data. A single <code>GetMetricData</code> call can include up to 500 <code>MetricDataQuery</code> structures. When used in <code>PutMetricAlarm</code>, it enables you to create an alarm based on a metric math expression. Each <code>MetricDataQuery</code> in the array specifies either a metric to retrieve, or a math expression to be performed on retrieved metrics. A single <code>PutMetricAlarm</code> call can include up to 20 <code>MetricDataQuery</code> structures in the array. The 20 structures can include as many as 10 structures that contain a <code>MetricStat</code> parameter to retrieve a metric, and as many as
    * 10 structures that contain the <code>Expression</code> parameter to perform a math expression. Of those <code>Expression</code> structures, one must have <code>True</code> as the value for <code>ReturnData</code>. The result of this expression is the value the alarm watches. Any expression used in a <code>PutMetricAlarm</code> operation must return a single time series. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax|Metric Math Syntax and Functions]] in the <i>Amazon CloudWatch User Guide</i>. Some of the parameters of this structure also have different uses whether you are using this structure in a <code>GetMetricData</code> operation or a <code>PutMetricAlarm</code> operation. These differences are explained in the following parameter list.
    */
  @js.native
  trait MetricDataQuery extends js.Object {
    var Id: MetricId
    var AccountId: js.UndefOr[AccountId]
    var Expression: js.UndefOr[MetricExpression]
    var Label: js.UndefOr[MetricLabel]
    var MetricStat: js.UndefOr[MetricStat]
    var Period: js.UndefOr[Period]
    var ReturnData: js.UndefOr[ReturnData]
  }

  object MetricDataQuery {
    @inline
    def apply(
        Id: MetricId,
        AccountId: js.UndefOr[AccountId] = js.undefined,
        Expression: js.UndefOr[MetricExpression] = js.undefined,
        Label: js.UndefOr[MetricLabel] = js.undefined,
        MetricStat: js.UndefOr[MetricStat] = js.undefined,
        Period: js.UndefOr[Period] = js.undefined,
        ReturnData: js.UndefOr[ReturnData] = js.undefined
    ): MetricDataQuery = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Expression.foreach(__v => __obj.updateDynamic("Expression")(__v.asInstanceOf[js.Any]))
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      MetricStat.foreach(__v => __obj.updateDynamic("MetricStat")(__v.asInstanceOf[js.Any]))
      Period.foreach(__v => __obj.updateDynamic("Period")(__v.asInstanceOf[js.Any]))
      ReturnData.foreach(__v => __obj.updateDynamic("ReturnData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricDataQuery]
    }
  }

  /** A <code>GetMetricData</code> call returns an array of <code>MetricDataResult</code> structures. Each of these structures includes the data points for that metric, along with the timestamps of those data points and other identifying information.
    */
  @js.native
  trait MetricDataResult extends js.Object {
    var Id: js.UndefOr[MetricId]
    var Label: js.UndefOr[MetricLabel]
    var Messages: js.UndefOr[MetricDataResultMessages]
    var StatusCode: js.UndefOr[StatusCode]
    var Timestamps: js.UndefOr[Timestamps]
    var Values: js.UndefOr[DatapointValues]
  }

  object MetricDataResult {
    @inline
    def apply(
        Id: js.UndefOr[MetricId] = js.undefined,
        Label: js.UndefOr[MetricLabel] = js.undefined,
        Messages: js.UndefOr[MetricDataResultMessages] = js.undefined,
        StatusCode: js.UndefOr[StatusCode] = js.undefined,
        Timestamps: js.UndefOr[Timestamps] = js.undefined,
        Values: js.UndefOr[DatapointValues] = js.undefined
    ): MetricDataResult = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      Messages.foreach(__v => __obj.updateDynamic("Messages")(__v.asInstanceOf[js.Any]))
      StatusCode.foreach(__v => __obj.updateDynamic("StatusCode")(__v.asInstanceOf[js.Any]))
      Timestamps.foreach(__v => __obj.updateDynamic("Timestamps")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricDataResult]
    }
  }

  /** Encapsulates the information sent to either create a metric or add new values to be aggregated into an existing metric.
    */
  @js.native
  trait MetricDatum extends js.Object {
    var MetricName: MetricName
    var Counts: js.UndefOr[Counts]
    var Dimensions: js.UndefOr[Dimensions]
    var StatisticValues: js.UndefOr[StatisticSet]
    var StorageResolution: js.UndefOr[StorageResolution]
    var Timestamp: js.UndefOr[Timestamp]
    var Unit: js.UndefOr[StandardUnit]
    var Value: js.UndefOr[DatapointValue]
    var Values: js.UndefOr[Values]
  }

  object MetricDatum {
    @inline
    def apply(
        MetricName: MetricName,
        Counts: js.UndefOr[Counts] = js.undefined,
        Dimensions: js.UndefOr[Dimensions] = js.undefined,
        StatisticValues: js.UndefOr[StatisticSet] = js.undefined,
        StorageResolution: js.UndefOr[StorageResolution] = js.undefined,
        Timestamp: js.UndefOr[Timestamp] = js.undefined,
        Unit: js.UndefOr[StandardUnit] = js.undefined,
        Value: js.UndefOr[DatapointValue] = js.undefined,
        Values: js.UndefOr[Values] = js.undefined
    ): MetricDatum = {
      val __obj = js.Dynamic.literal(
        "MetricName" -> MetricName.asInstanceOf[js.Any]
      )

      Counts.foreach(__v => __obj.updateDynamic("Counts")(__v.asInstanceOf[js.Any]))
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      StatisticValues.foreach(__v => __obj.updateDynamic("StatisticValues")(__v.asInstanceOf[js.Any]))
      StorageResolution.foreach(__v => __obj.updateDynamic("StorageResolution")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricDatum]
    }
  }

  /** Indicates the CloudWatch math expression that provides the time series the anomaly detector uses as input. The designated math expression must return a single time series.
    */
  @js.native
  trait MetricMathAnomalyDetector extends js.Object {
    var MetricDataQueries: js.UndefOr[MetricDataQueries]
  }

  object MetricMathAnomalyDetector {
    @inline
    def apply(
        MetricDataQueries: js.UndefOr[MetricDataQueries] = js.undefined
    ): MetricMathAnomalyDetector = {
      val __obj = js.Dynamic.literal()
      MetricDataQueries.foreach(__v => __obj.updateDynamic("MetricDataQueries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricMathAnomalyDetector]
    }
  }

  /** This structure defines the metric to be returned, along with the statistics, period, and units.
    */
  @js.native
  trait MetricStat extends js.Object {
    var Metric: Metric
    var Period: Period
    var Stat: Stat
    var Unit: js.UndefOr[StandardUnit]
  }

  object MetricStat {
    @inline
    def apply(
        Metric: Metric,
        Period: Period,
        Stat: Stat,
        Unit: js.UndefOr[StandardUnit] = js.undefined
    ): MetricStat = {
      val __obj = js.Dynamic.literal(
        "Metric" -> Metric.asInstanceOf[js.Any],
        "Period" -> Period.asInstanceOf[js.Any],
        "Stat" -> Stat.asInstanceOf[js.Any]
      )

      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricStat]
    }
  }

  /** This structure contains the configuration information about one metric stream.
    */
  @js.native
  trait MetricStreamEntry extends js.Object {
    var Arn: js.UndefOr[AmazonResourceName]
    var CreationDate: js.UndefOr[Timestamp]
    var FirehoseArn: js.UndefOr[AmazonResourceName]
    var LastUpdateDate: js.UndefOr[Timestamp]
    var Name: js.UndefOr[MetricStreamName]
    var OutputFormat: js.UndefOr[MetricStreamOutputFormat]
    var State: js.UndefOr[MetricStreamState]
  }

  object MetricStreamEntry {
    @inline
    def apply(
        Arn: js.UndefOr[AmazonResourceName] = js.undefined,
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        FirehoseArn: js.UndefOr[AmazonResourceName] = js.undefined,
        LastUpdateDate: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[MetricStreamName] = js.undefined,
        OutputFormat: js.UndefOr[MetricStreamOutputFormat] = js.undefined,
        State: js.UndefOr[MetricStreamState] = js.undefined
    ): MetricStreamEntry = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      FirehoseArn.foreach(__v => __obj.updateDynamic("FirehoseArn")(__v.asInstanceOf[js.Any]))
      LastUpdateDate.foreach(__v => __obj.updateDynamic("LastUpdateDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutputFormat.foreach(__v => __obj.updateDynamic("OutputFormat")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricStreamEntry]
    }
  }

  /** This structure contains the name of one of the metric namespaces that is listed in a filter of a metric stream.
    */
  @js.native
  trait MetricStreamFilter extends js.Object {
    var Namespace: js.UndefOr[Namespace]
  }

  object MetricStreamFilter {
    @inline
    def apply(
        Namespace: js.UndefOr[Namespace] = js.undefined
    ): MetricStreamFilter = {
      val __obj = js.Dynamic.literal()
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricStreamFilter]
    }
  }

  /** This array is empty if the API operation was successful for all the rules specified in the request. If the operation could not process one of the rules, the following data is returned for each of those rules.
    */
  @js.native
  trait PartialFailure extends js.Object {
    var ExceptionType: js.UndefOr[ExceptionType]
    var FailureCode: js.UndefOr[FailureCode]
    var FailureDescription: js.UndefOr[FailureDescription]
    var FailureResource: js.UndefOr[FailureResource]
  }

  object PartialFailure {
    @inline
    def apply(
        ExceptionType: js.UndefOr[ExceptionType] = js.undefined,
        FailureCode: js.UndefOr[FailureCode] = js.undefined,
        FailureDescription: js.UndefOr[FailureDescription] = js.undefined,
        FailureResource: js.UndefOr[FailureResource] = js.undefined
    ): PartialFailure = {
      val __obj = js.Dynamic.literal()
      ExceptionType.foreach(__v => __obj.updateDynamic("ExceptionType")(__v.asInstanceOf[js.Any]))
      FailureCode.foreach(__v => __obj.updateDynamic("FailureCode")(__v.asInstanceOf[js.Any]))
      FailureDescription.foreach(__v => __obj.updateDynamic("FailureDescription")(__v.asInstanceOf[js.Any]))
      FailureResource.foreach(__v => __obj.updateDynamic("FailureResource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PartialFailure]
    }
  }

  @js.native
  trait PutAnomalyDetectorInput extends js.Object {
    var Configuration: js.UndefOr[AnomalyDetectorConfiguration]
    var Dimensions: js.UndefOr[Dimensions]
    var MetricMathAnomalyDetector: js.UndefOr[MetricMathAnomalyDetector]
    var MetricName: js.UndefOr[MetricName]
    var Namespace: js.UndefOr[Namespace]
    var SingleMetricAnomalyDetector: js.UndefOr[SingleMetricAnomalyDetector]
    var Stat: js.UndefOr[AnomalyDetectorMetricStat]
  }

  object PutAnomalyDetectorInput {
    @inline
    def apply(
        Configuration: js.UndefOr[AnomalyDetectorConfiguration] = js.undefined,
        Dimensions: js.UndefOr[Dimensions] = js.undefined,
        MetricMathAnomalyDetector: js.UndefOr[MetricMathAnomalyDetector] = js.undefined,
        MetricName: js.UndefOr[MetricName] = js.undefined,
        Namespace: js.UndefOr[Namespace] = js.undefined,
        SingleMetricAnomalyDetector: js.UndefOr[SingleMetricAnomalyDetector] = js.undefined,
        Stat: js.UndefOr[AnomalyDetectorMetricStat] = js.undefined
    ): PutAnomalyDetectorInput = {
      val __obj = js.Dynamic.literal()
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      MetricMathAnomalyDetector.foreach(__v => __obj.updateDynamic("MetricMathAnomalyDetector")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      SingleMetricAnomalyDetector.foreach(__v => __obj.updateDynamic("SingleMetricAnomalyDetector")(__v.asInstanceOf[js.Any]))
      Stat.foreach(__v => __obj.updateDynamic("Stat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAnomalyDetectorInput]
    }
  }

  @js.native
  trait PutAnomalyDetectorOutput extends js.Object

  object PutAnomalyDetectorOutput {
    @inline
    def apply(): PutAnomalyDetectorOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutAnomalyDetectorOutput]
    }
  }

  @js.native
  trait PutCompositeAlarmInput extends js.Object {
    var AlarmName: AlarmName
    var AlarmRule: AlarmRule
    var ActionsEnabled: js.UndefOr[ActionsEnabled]
    var AlarmActions: js.UndefOr[ResourceList]
    var AlarmDescription: js.UndefOr[AlarmDescription]
    var InsufficientDataActions: js.UndefOr[ResourceList]
    var OKActions: js.UndefOr[ResourceList]
    var Tags: js.UndefOr[TagList]
  }

  object PutCompositeAlarmInput {
    @inline
    def apply(
        AlarmName: AlarmName,
        AlarmRule: AlarmRule,
        ActionsEnabled: js.UndefOr[ActionsEnabled] = js.undefined,
        AlarmActions: js.UndefOr[ResourceList] = js.undefined,
        AlarmDescription: js.UndefOr[AlarmDescription] = js.undefined,
        InsufficientDataActions: js.UndefOr[ResourceList] = js.undefined,
        OKActions: js.UndefOr[ResourceList] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): PutCompositeAlarmInput = {
      val __obj = js.Dynamic.literal(
        "AlarmName" -> AlarmName.asInstanceOf[js.Any],
        "AlarmRule" -> AlarmRule.asInstanceOf[js.Any]
      )

      ActionsEnabled.foreach(__v => __obj.updateDynamic("ActionsEnabled")(__v.asInstanceOf[js.Any]))
      AlarmActions.foreach(__v => __obj.updateDynamic("AlarmActions")(__v.asInstanceOf[js.Any]))
      AlarmDescription.foreach(__v => __obj.updateDynamic("AlarmDescription")(__v.asInstanceOf[js.Any]))
      InsufficientDataActions.foreach(__v => __obj.updateDynamic("InsufficientDataActions")(__v.asInstanceOf[js.Any]))
      OKActions.foreach(__v => __obj.updateDynamic("OKActions")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutCompositeAlarmInput]
    }
  }

  @js.native
  trait PutDashboardInput extends js.Object {
    var DashboardBody: DashboardBody
    var DashboardName: DashboardName
  }

  object PutDashboardInput {
    @inline
    def apply(
        DashboardBody: DashboardBody,
        DashboardName: DashboardName
    ): PutDashboardInput = {
      val __obj = js.Dynamic.literal(
        "DashboardBody" -> DashboardBody.asInstanceOf[js.Any],
        "DashboardName" -> DashboardName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutDashboardInput]
    }
  }

  @js.native
  trait PutDashboardOutput extends js.Object {
    var DashboardValidationMessages: js.UndefOr[DashboardValidationMessages]
  }

  object PutDashboardOutput {
    @inline
    def apply(
        DashboardValidationMessages: js.UndefOr[DashboardValidationMessages] = js.undefined
    ): PutDashboardOutput = {
      val __obj = js.Dynamic.literal()
      DashboardValidationMessages.foreach(__v => __obj.updateDynamic("DashboardValidationMessages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutDashboardOutput]
    }
  }

  @js.native
  trait PutInsightRuleInput extends js.Object {
    var RuleDefinition: InsightRuleDefinition
    var RuleName: InsightRuleName
    var RuleState: js.UndefOr[InsightRuleState]
    var Tags: js.UndefOr[TagList]
  }

  object PutInsightRuleInput {
    @inline
    def apply(
        RuleDefinition: InsightRuleDefinition,
        RuleName: InsightRuleName,
        RuleState: js.UndefOr[InsightRuleState] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): PutInsightRuleInput = {
      val __obj = js.Dynamic.literal(
        "RuleDefinition" -> RuleDefinition.asInstanceOf[js.Any],
        "RuleName" -> RuleName.asInstanceOf[js.Any]
      )

      RuleState.foreach(__v => __obj.updateDynamic("RuleState")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutInsightRuleInput]
    }
  }

  @js.native
  trait PutInsightRuleOutput extends js.Object

  object PutInsightRuleOutput {
    @inline
    def apply(): PutInsightRuleOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutInsightRuleOutput]
    }
  }

  @js.native
  trait PutMetricAlarmInput extends js.Object {
    var AlarmName: AlarmName
    var ComparisonOperator: ComparisonOperator
    var EvaluationPeriods: EvaluationPeriods
    var ActionsEnabled: js.UndefOr[ActionsEnabled]
    var AlarmActions: js.UndefOr[ResourceList]
    var AlarmDescription: js.UndefOr[AlarmDescription]
    var DatapointsToAlarm: js.UndefOr[DatapointsToAlarm]
    var Dimensions: js.UndefOr[Dimensions]
    var EvaluateLowSampleCountPercentile: js.UndefOr[EvaluateLowSampleCountPercentile]
    var ExtendedStatistic: js.UndefOr[ExtendedStatistic]
    var InsufficientDataActions: js.UndefOr[ResourceList]
    var MetricName: js.UndefOr[MetricName]
    var Metrics: js.UndefOr[MetricDataQueries]
    var Namespace: js.UndefOr[Namespace]
    var OKActions: js.UndefOr[ResourceList]
    var Period: js.UndefOr[Period]
    var Statistic: js.UndefOr[Statistic]
    var Tags: js.UndefOr[TagList]
    var Threshold: js.UndefOr[Threshold]
    var ThresholdMetricId: js.UndefOr[MetricId]
    var TreatMissingData: js.UndefOr[TreatMissingData]
    var Unit: js.UndefOr[StandardUnit]
  }

  object PutMetricAlarmInput {
    @inline
    def apply(
        AlarmName: AlarmName,
        ComparisonOperator: ComparisonOperator,
        EvaluationPeriods: EvaluationPeriods,
        ActionsEnabled: js.UndefOr[ActionsEnabled] = js.undefined,
        AlarmActions: js.UndefOr[ResourceList] = js.undefined,
        AlarmDescription: js.UndefOr[AlarmDescription] = js.undefined,
        DatapointsToAlarm: js.UndefOr[DatapointsToAlarm] = js.undefined,
        Dimensions: js.UndefOr[Dimensions] = js.undefined,
        EvaluateLowSampleCountPercentile: js.UndefOr[EvaluateLowSampleCountPercentile] = js.undefined,
        ExtendedStatistic: js.UndefOr[ExtendedStatistic] = js.undefined,
        InsufficientDataActions: js.UndefOr[ResourceList] = js.undefined,
        MetricName: js.UndefOr[MetricName] = js.undefined,
        Metrics: js.UndefOr[MetricDataQueries] = js.undefined,
        Namespace: js.UndefOr[Namespace] = js.undefined,
        OKActions: js.UndefOr[ResourceList] = js.undefined,
        Period: js.UndefOr[Period] = js.undefined,
        Statistic: js.UndefOr[Statistic] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Threshold: js.UndefOr[Threshold] = js.undefined,
        ThresholdMetricId: js.UndefOr[MetricId] = js.undefined,
        TreatMissingData: js.UndefOr[TreatMissingData] = js.undefined,
        Unit: js.UndefOr[StandardUnit] = js.undefined
    ): PutMetricAlarmInput = {
      val __obj = js.Dynamic.literal(
        "AlarmName" -> AlarmName.asInstanceOf[js.Any],
        "ComparisonOperator" -> ComparisonOperator.asInstanceOf[js.Any],
        "EvaluationPeriods" -> EvaluationPeriods.asInstanceOf[js.Any]
      )

      ActionsEnabled.foreach(__v => __obj.updateDynamic("ActionsEnabled")(__v.asInstanceOf[js.Any]))
      AlarmActions.foreach(__v => __obj.updateDynamic("AlarmActions")(__v.asInstanceOf[js.Any]))
      AlarmDescription.foreach(__v => __obj.updateDynamic("AlarmDescription")(__v.asInstanceOf[js.Any]))
      DatapointsToAlarm.foreach(__v => __obj.updateDynamic("DatapointsToAlarm")(__v.asInstanceOf[js.Any]))
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      EvaluateLowSampleCountPercentile.foreach(__v => __obj.updateDynamic("EvaluateLowSampleCountPercentile")(__v.asInstanceOf[js.Any]))
      ExtendedStatistic.foreach(__v => __obj.updateDynamic("ExtendedStatistic")(__v.asInstanceOf[js.Any]))
      InsufficientDataActions.foreach(__v => __obj.updateDynamic("InsufficientDataActions")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      OKActions.foreach(__v => __obj.updateDynamic("OKActions")(__v.asInstanceOf[js.Any]))
      Period.foreach(__v => __obj.updateDynamic("Period")(__v.asInstanceOf[js.Any]))
      Statistic.foreach(__v => __obj.updateDynamic("Statistic")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Threshold.foreach(__v => __obj.updateDynamic("Threshold")(__v.asInstanceOf[js.Any]))
      ThresholdMetricId.foreach(__v => __obj.updateDynamic("ThresholdMetricId")(__v.asInstanceOf[js.Any]))
      TreatMissingData.foreach(__v => __obj.updateDynamic("TreatMissingData")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutMetricAlarmInput]
    }
  }

  @js.native
  trait PutMetricDataInput extends js.Object {
    var MetricData: MetricData
    var Namespace: Namespace
  }

  object PutMetricDataInput {
    @inline
    def apply(
        MetricData: MetricData,
        Namespace: Namespace
    ): PutMetricDataInput = {
      val __obj = js.Dynamic.literal(
        "MetricData" -> MetricData.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutMetricDataInput]
    }
  }

  @js.native
  trait PutMetricStreamInput extends js.Object {
    var FirehoseArn: AmazonResourceName
    var Name: MetricStreamName
    var OutputFormat: MetricStreamOutputFormat
    var RoleArn: AmazonResourceName
    var ExcludeFilters: js.UndefOr[MetricStreamFilters]
    var IncludeFilters: js.UndefOr[MetricStreamFilters]
    var Tags: js.UndefOr[TagList]
  }

  object PutMetricStreamInput {
    @inline
    def apply(
        FirehoseArn: AmazonResourceName,
        Name: MetricStreamName,
        OutputFormat: MetricStreamOutputFormat,
        RoleArn: AmazonResourceName,
        ExcludeFilters: js.UndefOr[MetricStreamFilters] = js.undefined,
        IncludeFilters: js.UndefOr[MetricStreamFilters] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): PutMetricStreamInput = {
      val __obj = js.Dynamic.literal(
        "FirehoseArn" -> FirehoseArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "OutputFormat" -> OutputFormat.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      ExcludeFilters.foreach(__v => __obj.updateDynamic("ExcludeFilters")(__v.asInstanceOf[js.Any]))
      IncludeFilters.foreach(__v => __obj.updateDynamic("IncludeFilters")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutMetricStreamInput]
    }
  }

  @js.native
  trait PutMetricStreamOutput extends js.Object {
    var Arn: js.UndefOr[AmazonResourceName]
  }

  object PutMetricStreamOutput {
    @inline
    def apply(
        Arn: js.UndefOr[AmazonResourceName] = js.undefined
    ): PutMetricStreamOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutMetricStreamOutput]
    }
  }

  /** Specifies one range of days or times to exclude from use for training an anomaly detection model.
    */
  @js.native
  trait Range extends js.Object {
    var EndTime: Timestamp
    var StartTime: Timestamp
  }

  object Range {
    @inline
    def apply(
        EndTime: Timestamp,
        StartTime: Timestamp
    ): Range = {
      val __obj = js.Dynamic.literal(
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Range]
    }
  }

  @js.native
  trait SetAlarmStateInput extends js.Object {
    var AlarmName: AlarmName
    var StateReason: StateReason
    var StateValue: StateValue
    var StateReasonData: js.UndefOr[StateReasonData]
  }

  object SetAlarmStateInput {
    @inline
    def apply(
        AlarmName: AlarmName,
        StateReason: StateReason,
        StateValue: StateValue,
        StateReasonData: js.UndefOr[StateReasonData] = js.undefined
    ): SetAlarmStateInput = {
      val __obj = js.Dynamic.literal(
        "AlarmName" -> AlarmName.asInstanceOf[js.Any],
        "StateReason" -> StateReason.asInstanceOf[js.Any],
        "StateValue" -> StateValue.asInstanceOf[js.Any]
      )

      StateReasonData.foreach(__v => __obj.updateDynamic("StateReasonData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetAlarmStateInput]
    }
  }

  /** Designates the CloudWatch metric and statistic that provides the time series the anomaly detector uses as input.
    */
  @js.native
  trait SingleMetricAnomalyDetector extends js.Object {
    var Dimensions: js.UndefOr[Dimensions]
    var MetricName: js.UndefOr[MetricName]
    var Namespace: js.UndefOr[Namespace]
    var Stat: js.UndefOr[AnomalyDetectorMetricStat]
  }

  object SingleMetricAnomalyDetector {
    @inline
    def apply(
        Dimensions: js.UndefOr[Dimensions] = js.undefined,
        MetricName: js.UndefOr[MetricName] = js.undefined,
        Namespace: js.UndefOr[Namespace] = js.undefined,
        Stat: js.UndefOr[AnomalyDetectorMetricStat] = js.undefined
    ): SingleMetricAnomalyDetector = {
      val __obj = js.Dynamic.literal()
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      Stat.foreach(__v => __obj.updateDynamic("Stat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SingleMetricAnomalyDetector]
    }
  }

  @js.native
  trait StartMetricStreamsInput extends js.Object {
    var Names: MetricStreamNames
  }

  object StartMetricStreamsInput {
    @inline
    def apply(
        Names: MetricStreamNames
    ): StartMetricStreamsInput = {
      val __obj = js.Dynamic.literal(
        "Names" -> Names.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartMetricStreamsInput]
    }
  }

  @js.native
  trait StartMetricStreamsOutput extends js.Object

  object StartMetricStreamsOutput {
    @inline
    def apply(): StartMetricStreamsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartMetricStreamsOutput]
    }
  }

  /** Represents a set of statistics that describes a specific metric.
    */
  @js.native
  trait StatisticSet extends js.Object {
    var Maximum: DatapointValue
    var Minimum: DatapointValue
    var SampleCount: DatapointValue
    var Sum: DatapointValue
  }

  object StatisticSet {
    @inline
    def apply(
        Maximum: DatapointValue,
        Minimum: DatapointValue,
        SampleCount: DatapointValue,
        Sum: DatapointValue
    ): StatisticSet = {
      val __obj = js.Dynamic.literal(
        "Maximum" -> Maximum.asInstanceOf[js.Any],
        "Minimum" -> Minimum.asInstanceOf[js.Any],
        "SampleCount" -> SampleCount.asInstanceOf[js.Any],
        "Sum" -> Sum.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StatisticSet]
    }
  }

  @js.native
  trait StopMetricStreamsInput extends js.Object {
    var Names: MetricStreamNames
  }

  object StopMetricStreamsInput {
    @inline
    def apply(
        Names: MetricStreamNames
    ): StopMetricStreamsInput = {
      val __obj = js.Dynamic.literal(
        "Names" -> Names.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopMetricStreamsInput]
    }
  }

  @js.native
  trait StopMetricStreamsOutput extends js.Object

  object StopMetricStreamsOutput {
    @inline
    def apply(): StopMetricStreamsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopMetricStreamsOutput]
    }
  }

  /** A key-value pair associated with a CloudWatch resource.
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
  trait TagResourceInput extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceInput {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        Tags: TagList
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceOutput extends js.Object

  object TagResourceOutput {
    @inline
    def apply(): TagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceOutput]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceInput {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceOutput extends js.Object

  object UntagResourceOutput {
    @inline
    def apply(): UntagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceOutput]
    }
  }
}
