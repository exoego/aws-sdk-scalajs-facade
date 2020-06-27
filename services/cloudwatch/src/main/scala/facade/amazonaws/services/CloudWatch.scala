package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object cloudwatch {
  type ActionPrefix                      = String
  type ActionsEnabled                    = Boolean
  type AlarmArn                          = String
  type AlarmDescription                  = String
  type AlarmHistoryItems                 = js.Array[AlarmHistoryItem]
  type AlarmName                         = String
  type AlarmNamePrefix                   = String
  type AlarmNames                        = js.Array[AlarmName]
  type AmazonResourceName                = String
  type AnomalyDetectorExcludedTimeRanges = js.Array[Range]
  type AnomalyDetectorMetricTimezone     = String
  type AnomalyDetectors                  = js.Array[AnomalyDetector]
  type BatchFailures                     = js.Array[PartialFailure]
  type Counts                            = js.Array[DatapointValue]
  type DashboardArn                      = String
  type DashboardBody                     = String
  type DashboardEntries                  = js.Array[DashboardEntry]
  type DashboardName                     = String
  type DashboardNamePrefix               = String
  type DashboardNames                    = js.Array[DashboardName]
  type DashboardValidationMessages       = js.Array[DashboardValidationMessage]
  type DataPath                          = String
  type DatapointValue                    = Double
  type DatapointValueMap                 = js.Dictionary[DatapointValue]
  type DatapointValues                   = js.Array[DatapointValue]
  type Datapoints                        = js.Array[Datapoint]
  type DatapointsToAlarm                 = Int
  type DimensionFilters                  = js.Array[DimensionFilter]
  type DimensionName                     = String
  type DimensionValue                    = String
  type Dimensions                        = js.Array[Dimension]
  type EvaluateLowSampleCountPercentile  = String
  type EvaluationPeriods                 = Int
  type ExceptionType                     = String
  type ExtendedStatistic                 = String
  type ExtendedStatistics                = js.Array[ExtendedStatistic]
  type FailureCode                       = String
  type FailureDescription                = String
  type FailureResource                   = String
  type GetMetricDataMaxDatapoints        = Int
  type HistoryData                       = String
  type HistorySummary                    = String
  type InsightRuleAggregationStatistic   = String
  type InsightRuleContributorDatapoints  = js.Array[InsightRuleContributorDatapoint]
  type InsightRuleContributorKey         = String
  type InsightRuleContributorKeyLabel    = String
  type InsightRuleContributorKeyLabels   = js.Array[InsightRuleContributorKeyLabel]
  type InsightRuleContributorKeys        = js.Array[InsightRuleContributorKey]
  type InsightRuleContributors           = js.Array[InsightRuleContributor]
  type InsightRuleDefinition             = String
  type InsightRuleMaxResults             = Int
  type InsightRuleMetricDatapoints       = js.Array[InsightRuleMetricDatapoint]
  type InsightRuleMetricList             = js.Array[InsightRuleMetricName]
  type InsightRuleMetricName             = String
  type InsightRuleName                   = String
  type InsightRuleNames                  = js.Array[InsightRuleName]
  type InsightRuleOrderBy                = String
  type InsightRuleSchema                 = String
  type InsightRuleState                  = String
  type InsightRuleUnboundDouble          = Double
  type InsightRuleUnboundInteger         = Int
  type InsightRuleUnboundLong            = Double
  type InsightRules                      = js.Array[InsightRule]
  type LastModified                      = js.Date
  type MaxRecords                        = Int
  type MaxReturnedResultsCount           = Int
  type Message                           = String
  type MessageDataCode                   = String
  type MessageDataValue                  = String
  type MetricAlarms                      = js.Array[MetricAlarm]
  type MetricData                        = js.Array[MetricDatum]
  type MetricDataQueries                 = js.Array[MetricDataQuery]
  type MetricDataResultMessages          = js.Array[MessageData]
  type MetricDataResults                 = js.Array[MetricDataResult]
  type MetricExpression                  = String
  type MetricId                          = String
  type MetricLabel                       = String
  type MetricName                        = String
  type MetricWidget                      = String
  type MetricWidgetImage                 = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Metrics                           = js.Array[Metric]
  type Namespace                         = String
  type NextToken                         = String
  type OutputFormat                      = String
  type Period                            = Int
  type ResourceList                      = js.Array[ResourceName]
  type ResourceName                      = String
  type ReturnData                        = Boolean
  type Size                              = Double
  type Stat                              = String
  type StateReason                       = String
  type StateReasonData                   = String
  type Statistics                        = js.Array[Statistic]
  type StorageResolution                 = Int
  type TagKey                            = String
  type TagKeyList                        = js.Array[TagKey]
  type TagList                           = js.Array[Tag]
  type TagValue                          = String
  type Threshold                         = Double
  type Timestamp                         = js.Date
  type Timestamps                        = js.Array[Timestamp]
  type TreatMissingData                  = String
  type Values                            = js.Array[DatapointValue]

  implicit final class CloudWatchOps(private val service: CloudWatch) extends AnyVal {

    @inline def deleteAlarmsFuture(params: DeleteAlarmsInput): Future[js.Object] =
      service.deleteAlarms(params).promise().toFuture
    @inline def deleteAnomalyDetectorFuture(params: DeleteAnomalyDetectorInput): Future[DeleteAnomalyDetectorOutput] =
      service.deleteAnomalyDetector(params).promise().toFuture
    @inline def deleteDashboardsFuture(params: DeleteDashboardsInput): Future[DeleteDashboardsOutput] =
      service.deleteDashboards(params).promise().toFuture
    @inline def deleteInsightRulesFuture(params: DeleteInsightRulesInput): Future[DeleteInsightRulesOutput] =
      service.deleteInsightRules(params).promise().toFuture
    @inline def describeAlarmHistoryFuture(params: DescribeAlarmHistoryInput): Future[DescribeAlarmHistoryOutput] =
      service.describeAlarmHistory(params).promise().toFuture
    @inline def describeAlarmsForMetricFuture(
        params: DescribeAlarmsForMetricInput
    ): Future[DescribeAlarmsForMetricOutput] = service.describeAlarmsForMetric(params).promise().toFuture
    @inline def describeAlarmsFuture(params: DescribeAlarmsInput): Future[DescribeAlarmsOutput] =
      service.describeAlarms(params).promise().toFuture
    @inline def describeAnomalyDetectorsFuture(
        params: DescribeAnomalyDetectorsInput
    ): Future[DescribeAnomalyDetectorsOutput] = service.describeAnomalyDetectors(params).promise().toFuture
    @inline def describeInsightRulesFuture(params: DescribeInsightRulesInput): Future[DescribeInsightRulesOutput] =
      service.describeInsightRules(params).promise().toFuture
    @inline def disableAlarmActionsFuture(params: DisableAlarmActionsInput): Future[js.Object] =
      service.disableAlarmActions(params).promise().toFuture
    @inline def disableInsightRulesFuture(params: DisableInsightRulesInput): Future[DisableInsightRulesOutput] =
      service.disableInsightRules(params).promise().toFuture
    @inline def enableAlarmActionsFuture(params: EnableAlarmActionsInput): Future[js.Object] =
      service.enableAlarmActions(params).promise().toFuture
    @inline def enableInsightRulesFuture(params: EnableInsightRulesInput): Future[EnableInsightRulesOutput] =
      service.enableInsightRules(params).promise().toFuture
    @inline def getDashboardFuture(params: GetDashboardInput): Future[GetDashboardOutput] =
      service.getDashboard(params).promise().toFuture
    @inline def getInsightRuleReportFuture(params: GetInsightRuleReportInput): Future[GetInsightRuleReportOutput] =
      service.getInsightRuleReport(params).promise().toFuture
    @inline def getMetricDataFuture(params: GetMetricDataInput): Future[GetMetricDataOutput] =
      service.getMetricData(params).promise().toFuture
    @inline def getMetricStatisticsFuture(params: GetMetricStatisticsInput): Future[GetMetricStatisticsOutput] =
      service.getMetricStatistics(params).promise().toFuture
    @inline def getMetricWidgetImageFuture(params: GetMetricWidgetImageInput): Future[GetMetricWidgetImageOutput] =
      service.getMetricWidgetImage(params).promise().toFuture
    @inline def listDashboardsFuture(params: ListDashboardsInput): Future[ListDashboardsOutput] =
      service.listDashboards(params).promise().toFuture
    @inline def listMetricsFuture(params: ListMetricsInput): Future[ListMetricsOutput] =
      service.listMetrics(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] =
      service.listTagsForResource(params).promise().toFuture
    @inline def putAnomalyDetectorFuture(params: PutAnomalyDetectorInput): Future[PutAnomalyDetectorOutput] =
      service.putAnomalyDetector(params).promise().toFuture
    @inline def putDashboardFuture(params: PutDashboardInput): Future[PutDashboardOutput] =
      service.putDashboard(params).promise().toFuture
    @inline def putInsightRuleFuture(params: PutInsightRuleInput): Future[PutInsightRuleOutput] =
      service.putInsightRule(params).promise().toFuture
    @inline def putMetricAlarmFuture(params: PutMetricAlarmInput): Future[js.Object] =
      service.putMetricAlarm(params).promise().toFuture
    @inline def putMetricDataFuture(params: PutMetricDataInput): Future[js.Object] =
      service.putMetricData(params).promise().toFuture
    @inline def setAlarmStateFuture(params: SetAlarmStateInput): Future[js.Object] =
      service.setAlarmState(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] =
      service.untagResource(params).promise().toFuture
  }
}

package cloudwatch {
  @js.native
  @JSImport("aws-sdk", "CloudWatch")
  class CloudWatch() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteAlarms(params: DeleteAlarmsInput): Request[js.Object]                                     = js.native
    def deleteAnomalyDetector(params: DeleteAnomalyDetectorInput): Request[DeleteAnomalyDetectorOutput] = js.native
    def deleteDashboards(params: DeleteDashboardsInput): Request[DeleteDashboardsOutput]                = js.native
    def deleteInsightRules(params: DeleteInsightRulesInput): Request[DeleteInsightRulesOutput]          = js.native
    def describeAlarmHistory(params: DescribeAlarmHistoryInput): Request[DescribeAlarmHistoryOutput]    = js.native
    def describeAlarms(params: DescribeAlarmsInput): Request[DescribeAlarmsOutput]                      = js.native
    def describeAlarmsForMetric(params: DescribeAlarmsForMetricInput): Request[DescribeAlarmsForMetricOutput] =
      js.native
    def describeAnomalyDetectors(params: DescribeAnomalyDetectorsInput): Request[DescribeAnomalyDetectorsOutput] =
      js.native
    def describeInsightRules(params: DescribeInsightRulesInput): Request[DescribeInsightRulesOutput] = js.native
    def disableAlarmActions(params: DisableAlarmActionsInput): Request[js.Object]                    = js.native
    def disableInsightRules(params: DisableInsightRulesInput): Request[DisableInsightRulesOutput]    = js.native
    def enableAlarmActions(params: EnableAlarmActionsInput): Request[js.Object]                      = js.native
    def enableInsightRules(params: EnableInsightRulesInput): Request[EnableInsightRulesOutput]       = js.native
    def getDashboard(params: GetDashboardInput): Request[GetDashboardOutput]                         = js.native
    def getInsightRuleReport(params: GetInsightRuleReportInput): Request[GetInsightRuleReportOutput] = js.native
    def getMetricData(params: GetMetricDataInput): Request[GetMetricDataOutput]                      = js.native
    def getMetricStatistics(params: GetMetricStatisticsInput): Request[GetMetricStatisticsOutput]    = js.native
    def getMetricWidgetImage(params: GetMetricWidgetImageInput): Request[GetMetricWidgetImageOutput] = js.native
    def listDashboards(params: ListDashboardsInput): Request[ListDashboardsOutput]                   = js.native
    def listMetrics(params: ListMetricsInput): Request[ListMetricsOutput]                            = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput]    = js.native
    def putAnomalyDetector(params: PutAnomalyDetectorInput): Request[PutAnomalyDetectorOutput]       = js.native
    def putDashboard(params: PutDashboardInput): Request[PutDashboardOutput]                         = js.native
    def putInsightRule(params: PutInsightRuleInput): Request[PutInsightRuleOutput]                   = js.native
    def putMetricAlarm(params: PutMetricAlarmInput): Request[js.Object]                              = js.native
    def putMetricData(params: PutMetricDataInput): Request[js.Object]                                = js.native
    def setAlarmState(params: SetAlarmStateInput): Request[js.Object]                                = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput]                            = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput]                      = js.native
  }

  /**
    * Represents the history of a specific alarm.
    */
  @js.native
  @Factory
  trait AlarmHistoryItem extends js.Object {
    var AlarmName: js.UndefOr[AlarmName]
    var HistoryData: js.UndefOr[HistoryData]
    var HistoryItemType: js.UndefOr[HistoryItemType]
    var HistorySummary: js.UndefOr[HistorySummary]
    var Timestamp: js.UndefOr[Timestamp]
  }

  /**
    * An anomaly detection model associated with a particular CloudWatch metric and statistic. You can use the model to display a band of expected normal values when the metric is graphed.
    */
  @js.native
  @Factory
  trait AnomalyDetector extends js.Object {
    var Configuration: js.UndefOr[AnomalyDetectorConfiguration]
    var Dimensions: js.UndefOr[Dimensions]
    var MetricName: js.UndefOr[MetricName]
    var Namespace: js.UndefOr[Namespace]
    var Stat: js.UndefOr[Stat]
    var StateValue: js.UndefOr[AnomalyDetectorStateValue]
  }

  /**
    * The configuration specifies details about how the anomaly detection model is to be trained, including time ranges to exclude from use for training the model and the time zone to use for the metric.
    */
  @js.native
  @Factory
  trait AnomalyDetectorConfiguration extends js.Object {
    var ExcludedTimeRanges: js.UndefOr[AnomalyDetectorExcludedTimeRanges]
    var MetricTimezone: js.UndefOr[AnomalyDetectorMetricTimezone]
  }

  @js.native
  sealed trait AnomalyDetectorStateValue extends js.Any
  object AnomalyDetectorStateValue extends js.Object {
    val PENDING_TRAINING          = "PENDING_TRAINING".asInstanceOf[AnomalyDetectorStateValue]
    val TRAINED_INSUFFICIENT_DATA = "TRAINED_INSUFFICIENT_DATA".asInstanceOf[AnomalyDetectorStateValue]
    val TRAINED                   = "TRAINED".asInstanceOf[AnomalyDetectorStateValue]

    val values = js.Object.freeze(js.Array(PENDING_TRAINING, TRAINED_INSUFFICIENT_DATA, TRAINED))
  }

  @js.native
  sealed trait ComparisonOperator extends js.Any
  object ComparisonOperator extends js.Object {
    val GreaterThanOrEqualToThreshold = "GreaterThanOrEqualToThreshold".asInstanceOf[ComparisonOperator]
    val GreaterThanThreshold          = "GreaterThanThreshold".asInstanceOf[ComparisonOperator]
    val LessThanThreshold             = "LessThanThreshold".asInstanceOf[ComparisonOperator]
    val LessThanOrEqualToThreshold    = "LessThanOrEqualToThreshold".asInstanceOf[ComparisonOperator]
    val LessThanLowerOrGreaterThanUpperThreshold =
      "LessThanLowerOrGreaterThanUpperThreshold".asInstanceOf[ComparisonOperator]
    val LessThanLowerThreshold    = "LessThanLowerThreshold".asInstanceOf[ComparisonOperator]
    val GreaterThanUpperThreshold = "GreaterThanUpperThreshold".asInstanceOf[ComparisonOperator]

    val values = js.Object.freeze(
      js.Array(
        GreaterThanOrEqualToThreshold,
        GreaterThanThreshold,
        LessThanThreshold,
        LessThanOrEqualToThreshold,
        LessThanLowerOrGreaterThanUpperThreshold,
        LessThanLowerThreshold,
        GreaterThanUpperThreshold
      )
    )
  }

  /**
    * Represents a specific dashboard.
    */
  @js.native
  @Factory
  trait DashboardEntry extends js.Object {
    var DashboardArn: js.UndefOr[DashboardArn]
    var DashboardName: js.UndefOr[DashboardName]
    var LastModified: js.UndefOr[LastModified]
    var Size: js.UndefOr[Size]
  }

  /**
    * An error or warning for the operation.
    */
  @js.native
  @Factory
  trait DashboardValidationMessage extends js.Object {
    var DataPath: js.UndefOr[DataPath]
    var Message: js.UndefOr[Message]
  }

  /**
    * Encapsulates the statistical data that CloudWatch computes from metric data.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DeleteAlarmsInput extends js.Object {
    var AlarmNames: AlarmNames
  }

  @js.native
  @Factory
  trait DeleteAnomalyDetectorInput extends js.Object {
    var MetricName: MetricName
    var Namespace: Namespace
    var Stat: Stat
    var Dimensions: js.UndefOr[Dimensions]
  }

  @js.native
  @Factory
  trait DeleteAnomalyDetectorOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteDashboardsInput extends js.Object {
    var DashboardNames: DashboardNames
  }

  @js.native
  @Factory
  trait DeleteDashboardsOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteInsightRulesInput extends js.Object {
    var RuleNames: InsightRuleNames
  }

  @js.native
  @Factory
  trait DeleteInsightRulesOutput extends js.Object {
    var Failures: js.UndefOr[BatchFailures]
  }

  @js.native
  @Factory
  trait DescribeAlarmHistoryInput extends js.Object {
    var AlarmName: js.UndefOr[AlarmName]
    var EndDate: js.UndefOr[Timestamp]
    var HistoryItemType: js.UndefOr[HistoryItemType]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[NextToken]
    var StartDate: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait DescribeAlarmHistoryOutput extends js.Object {
    var AlarmHistoryItems: js.UndefOr[AlarmHistoryItems]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeAlarmsForMetricInput extends js.Object {
    var MetricName: MetricName
    var Namespace: Namespace
    var Dimensions: js.UndefOr[Dimensions]
    var ExtendedStatistic: js.UndefOr[ExtendedStatistic]
    var Period: js.UndefOr[Period]
    var Statistic: js.UndefOr[Statistic]
    var Unit: js.UndefOr[StandardUnit]
  }

  @js.native
  @Factory
  trait DescribeAlarmsForMetricOutput extends js.Object {
    var MetricAlarms: js.UndefOr[MetricAlarms]
  }

  @js.native
  @Factory
  trait DescribeAlarmsInput extends js.Object {
    var ActionPrefix: js.UndefOr[ActionPrefix]
    var AlarmNamePrefix: js.UndefOr[AlarmNamePrefix]
    var AlarmNames: js.UndefOr[AlarmNames]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[NextToken]
    var StateValue: js.UndefOr[StateValue]
  }

  @js.native
  @Factory
  trait DescribeAlarmsOutput extends js.Object {
    var MetricAlarms: js.UndefOr[MetricAlarms]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeAnomalyDetectorsInput extends js.Object {
    var Dimensions: js.UndefOr[Dimensions]
    var MaxResults: js.UndefOr[MaxReturnedResultsCount]
    var MetricName: js.UndefOr[MetricName]
    var Namespace: js.UndefOr[Namespace]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeAnomalyDetectorsOutput extends js.Object {
    var AnomalyDetectors: js.UndefOr[AnomalyDetectors]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeInsightRulesInput extends js.Object {
    var MaxResults: js.UndefOr[InsightRuleMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeInsightRulesOutput extends js.Object {
    var InsightRules: js.UndefOr[InsightRules]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Expands the identity of a metric.
    */
  @js.native
  @Factory
  trait Dimension extends js.Object {
    var Name: DimensionName
    var Value: DimensionValue
  }

  /**
    * Represents filters for a dimension.
    */
  @js.native
  @Factory
  trait DimensionFilter extends js.Object {
    var Name: DimensionName
    var Value: js.UndefOr[DimensionValue]
  }

  @js.native
  @Factory
  trait DisableAlarmActionsInput extends js.Object {
    var AlarmNames: AlarmNames
  }

  @js.native
  @Factory
  trait DisableInsightRulesInput extends js.Object {
    var RuleNames: InsightRuleNames
  }

  @js.native
  @Factory
  trait DisableInsightRulesOutput extends js.Object {
    var Failures: js.UndefOr[BatchFailures]
  }

  @js.native
  @Factory
  trait EnableAlarmActionsInput extends js.Object {
    var AlarmNames: AlarmNames
  }

  @js.native
  @Factory
  trait EnableInsightRulesInput extends js.Object {
    var RuleNames: InsightRuleNames
  }

  @js.native
  @Factory
  trait EnableInsightRulesOutput extends js.Object {
    var Failures: js.UndefOr[BatchFailures]
  }

  @js.native
  @Factory
  trait GetDashboardInput extends js.Object {
    var DashboardName: DashboardName
  }

  @js.native
  @Factory
  trait GetDashboardOutput extends js.Object {
    var DashboardArn: js.UndefOr[DashboardArn]
    var DashboardBody: js.UndefOr[DashboardBody]
    var DashboardName: js.UndefOr[DashboardName]
  }

  @js.native
  @Factory
  trait GetInsightRuleReportInput extends js.Object {
    var EndTime: Timestamp
    var Period: Period
    var RuleName: InsightRuleName
    var StartTime: Timestamp
    var MaxContributorCount: js.UndefOr[InsightRuleUnboundInteger]
    var Metrics: js.UndefOr[InsightRuleMetricList]
    var OrderBy: js.UndefOr[InsightRuleOrderBy]
  }

  @js.native
  @Factory
  trait GetInsightRuleReportOutput extends js.Object {
    var AggregateValue: js.UndefOr[InsightRuleUnboundDouble]
    var AggregationStatistic: js.UndefOr[InsightRuleAggregationStatistic]
    var ApproximateUniqueCount: js.UndefOr[InsightRuleUnboundLong]
    var Contributors: js.UndefOr[InsightRuleContributors]
    var KeyLabels: js.UndefOr[InsightRuleContributorKeyLabels]
    var MetricDatapoints: js.UndefOr[InsightRuleMetricDatapoints]
  }

  @js.native
  @Factory
  trait GetMetricDataInput extends js.Object {
    var EndTime: Timestamp
    var MetricDataQueries: MetricDataQueries
    var StartTime: Timestamp
    var MaxDatapoints: js.UndefOr[GetMetricDataMaxDatapoints]
    var NextToken: js.UndefOr[NextToken]
    var ScanBy: js.UndefOr[ScanBy]
  }

  @js.native
  @Factory
  trait GetMetricDataOutput extends js.Object {
    var Messages: js.UndefOr[MetricDataResultMessages]
    var MetricDataResults: js.UndefOr[MetricDataResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetMetricStatisticsOutput extends js.Object {
    var Datapoints: js.UndefOr[Datapoints]
    var Label: js.UndefOr[MetricLabel]
  }

  @js.native
  @Factory
  trait GetMetricWidgetImageInput extends js.Object {
    var MetricWidget: MetricWidget
    var OutputFormat: js.UndefOr[OutputFormat]
  }

  @js.native
  @Factory
  trait GetMetricWidgetImageOutput extends js.Object {
    var MetricWidgetImage: js.UndefOr[MetricWidgetImage]
  }

  @js.native
  sealed trait HistoryItemType extends js.Any
  object HistoryItemType extends js.Object {
    val ConfigurationUpdate = "ConfigurationUpdate".asInstanceOf[HistoryItemType]
    val StateUpdate         = "StateUpdate".asInstanceOf[HistoryItemType]
    val Action              = "Action".asInstanceOf[HistoryItemType]

    val values = js.Object.freeze(js.Array(ConfigurationUpdate, StateUpdate, Action))
  }

  /**
    * This structure contains the definition for a Contributor Insights rule.
    */
  @js.native
  @Factory
  trait InsightRule extends js.Object {
    var Definition: InsightRuleDefinition
    var Name: InsightRuleName
    var Schema: InsightRuleSchema
    var State: InsightRuleState
  }

  /**
    * One of the unique contributors found by a Contributor Insights rule. If the rule contains multiple keys, then a unique contributor is a unique combination of values from all the keys in the rule.
    *  If the rule contains a single key, then each unique contributor is each unique value for this key.
    *  For more information, see <a>GetInsightRuleReport</a>.
    */
  @js.native
  @Factory
  trait InsightRuleContributor extends js.Object {
    var ApproximateAggregateValue: InsightRuleUnboundDouble
    var Datapoints: InsightRuleContributorDatapoints
    var Keys: InsightRuleContributorKeys
  }

  /**
    * One data point related to one contributor.
    *  For more information, see <a>GetInsightRuleReport</a> and <a>InsightRuleContributor</a>.
    */
  @js.native
  @Factory
  trait InsightRuleContributorDatapoint extends js.Object {
    var ApproximateValue: InsightRuleUnboundDouble
    var Timestamp: Timestamp
  }

  /**
    * One data point from the metric time series returned in a Contributor Insights rule report.
    *  For more information, see <a>GetInsightRuleReport</a>.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListDashboardsInput extends js.Object {
    var DashboardNamePrefix: js.UndefOr[DashboardNamePrefix]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDashboardsOutput extends js.Object {
    var DashboardEntries: js.UndefOr[DashboardEntries]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListMetricsInput extends js.Object {
    var Dimensions: js.UndefOr[DimensionFilters]
    var MetricName: js.UndefOr[MetricName]
    var Namespace: js.UndefOr[Namespace]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListMetricsOutput extends js.Object {
    var Metrics: js.UndefOr[Metrics]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceInput extends js.Object {
    var ResourceARN: AmazonResourceName
  }

  @js.native
  @Factory
  trait ListTagsForResourceOutput extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  /**
    * A message returned by the <code>GetMetricData</code>API, including a code and a description.
    */
  @js.native
  @Factory
  trait MessageData extends js.Object {
    var Code: js.UndefOr[MessageDataCode]
    var Value: js.UndefOr[MessageDataValue]
  }

  /**
    * Represents a specific metric.
    */
  @js.native
  @Factory
  trait Metric extends js.Object {
    var Dimensions: js.UndefOr[Dimensions]
    var MetricName: js.UndefOr[MetricName]
    var Namespace: js.UndefOr[Namespace]
  }

  /**
    * Represents an alarm.
    */
  @js.native
  @Factory
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

  /**
    * This structure is used in both <code>GetMetricData</code> and <code>PutMetricAlarm</code>. The supported use of this structure is different for those two operations.
    *  When used in <code>GetMetricData</code>, it indicates the metric data to return, and whether this call is just retrieving a batch set of data for one metric, or is performing a math expression on metric data. A single <code>GetMetricData</code> call can include up to 100 <code>MetricDataQuery</code> structures.
    *  When used in <code>PutMetricAlarm</code>, it enables you to create an alarm based on a metric math expression. Each <code>MetricDataQuery</code> in the array specifies either a metric to retrieve, or a math expression to be performed on retrieved metrics. A single <code>PutMetricAlarm</code> call can include up to 20 <code>MetricDataQuery</code> structures in the array. The 20 structures can include as many as 10 structures that contain a <code>MetricStat</code> parameter to retrieve a metric, and as many as 10 structures that contain the <code>Expression</code> parameter to perform a math expression. Of those <code>Expression</code> structures, one must have <code>True</code> as the value for <code>ReturnData</code>. The result of this expression is the value the alarm watches.
    *  Any expression used in a <code>PutMetricAlarm</code> operation must return a single time series. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax|Metric Math Syntax and Functions]] in the <i>Amazon CloudWatch User Guide</i>.
    *  Some of the parameters of this structure also have different uses whether you are using this structure in a <code>GetMetricData</code> operation or a <code>PutMetricAlarm</code> operation. These differences are explained in the following parameter list.
    */
  @js.native
  @Factory
  trait MetricDataQuery extends js.Object {
    var Id: MetricId
    var Expression: js.UndefOr[MetricExpression]
    var Label: js.UndefOr[MetricLabel]
    var MetricStat: js.UndefOr[MetricStat]
    var Period: js.UndefOr[Period]
    var ReturnData: js.UndefOr[ReturnData]
  }

  /**
    * A <code>GetMetricData</code> call returns an array of <code>MetricDataResult</code> structures. Each of these structures includes the data points for that metric, along with the timestamps of those data points and other identifying information.
    */
  @js.native
  @Factory
  trait MetricDataResult extends js.Object {
    var Id: js.UndefOr[MetricId]
    var Label: js.UndefOr[MetricLabel]
    var Messages: js.UndefOr[MetricDataResultMessages]
    var StatusCode: js.UndefOr[StatusCode]
    var Timestamps: js.UndefOr[Timestamps]
    var Values: js.UndefOr[DatapointValues]
  }

  /**
    * Encapsulates the information sent to either create a metric or add new values to be aggregated into an existing metric.
    */
  @js.native
  @Factory
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

  /**
    * This structure defines the metric to be returned, along with the statistics, period, and units.
    */
  @js.native
  @Factory
  trait MetricStat extends js.Object {
    var Metric: Metric
    var Period: Period
    var Stat: Stat
    var Unit: js.UndefOr[StandardUnit]
  }

  /**
    * This array is empty if the API operation was successful for all the rules specified in the request. If the operation could not process one of the rules, the following data is returned for each of those rules.
    */
  @js.native
  @Factory
  trait PartialFailure extends js.Object {
    var ExceptionType: js.UndefOr[ExceptionType]
    var FailureCode: js.UndefOr[FailureCode]
    var FailureDescription: js.UndefOr[FailureDescription]
    var FailureResource: js.UndefOr[FailureResource]
  }

  @js.native
  @Factory
  trait PutAnomalyDetectorInput extends js.Object {
    var MetricName: MetricName
    var Namespace: Namespace
    var Stat: Stat
    var Configuration: js.UndefOr[AnomalyDetectorConfiguration]
    var Dimensions: js.UndefOr[Dimensions]
  }

  @js.native
  @Factory
  trait PutAnomalyDetectorOutput extends js.Object {}

  @js.native
  @Factory
  trait PutDashboardInput extends js.Object {
    var DashboardBody: DashboardBody
    var DashboardName: DashboardName
  }

  @js.native
  @Factory
  trait PutDashboardOutput extends js.Object {
    var DashboardValidationMessages: js.UndefOr[DashboardValidationMessages]
  }

  @js.native
  @Factory
  trait PutInsightRuleInput extends js.Object {
    var RuleDefinition: InsightRuleDefinition
    var RuleName: InsightRuleName
    var RuleState: js.UndefOr[InsightRuleState]
  }

  @js.native
  @Factory
  trait PutInsightRuleOutput extends js.Object {}

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait PutMetricDataInput extends js.Object {
    var MetricData: MetricData
    var Namespace: Namespace
  }

  /**
    * Specifies one range of days or times to exclude from use for training an anomaly detection model.
    */
  @js.native
  @Factory
  trait Range extends js.Object {
    var EndTime: Timestamp
    var StartTime: Timestamp
  }

  @js.native
  sealed trait ScanBy extends js.Any
  object ScanBy extends js.Object {
    val TimestampDescending = "TimestampDescending".asInstanceOf[ScanBy]
    val TimestampAscending  = "TimestampAscending".asInstanceOf[ScanBy]

    val values = js.Object.freeze(js.Array(TimestampDescending, TimestampAscending))
  }

  @js.native
  @Factory
  trait SetAlarmStateInput extends js.Object {
    var AlarmName: AlarmName
    var StateReason: StateReason
    var StateValue: StateValue
    var StateReasonData: js.UndefOr[StateReasonData]
  }

  @js.native
  sealed trait StandardUnit extends js.Any
  object StandardUnit extends js.Object {
    val Seconds            = "Seconds".asInstanceOf[StandardUnit]
    val Microseconds       = "Microseconds".asInstanceOf[StandardUnit]
    val Milliseconds       = "Milliseconds".asInstanceOf[StandardUnit]
    val Bytes              = "Bytes".asInstanceOf[StandardUnit]
    val Kilobytes          = "Kilobytes".asInstanceOf[StandardUnit]
    val Megabytes          = "Megabytes".asInstanceOf[StandardUnit]
    val Gigabytes          = "Gigabytes".asInstanceOf[StandardUnit]
    val Terabytes          = "Terabytes".asInstanceOf[StandardUnit]
    val Bits               = "Bits".asInstanceOf[StandardUnit]
    val Kilobits           = "Kilobits".asInstanceOf[StandardUnit]
    val Megabits           = "Megabits".asInstanceOf[StandardUnit]
    val Gigabits           = "Gigabits".asInstanceOf[StandardUnit]
    val Terabits           = "Terabits".asInstanceOf[StandardUnit]
    val Percent            = "Percent".asInstanceOf[StandardUnit]
    val Count              = "Count".asInstanceOf[StandardUnit]
    val `Bytes/Second`     = "Bytes/Second".asInstanceOf[StandardUnit]
    val `Kilobytes/Second` = "Kilobytes/Second".asInstanceOf[StandardUnit]
    val `Megabytes/Second` = "Megabytes/Second".asInstanceOf[StandardUnit]
    val `Gigabytes/Second` = "Gigabytes/Second".asInstanceOf[StandardUnit]
    val `Terabytes/Second` = "Terabytes/Second".asInstanceOf[StandardUnit]
    val `Bits/Second`      = "Bits/Second".asInstanceOf[StandardUnit]
    val `Kilobits/Second`  = "Kilobits/Second".asInstanceOf[StandardUnit]
    val `Megabits/Second`  = "Megabits/Second".asInstanceOf[StandardUnit]
    val `Gigabits/Second`  = "Gigabits/Second".asInstanceOf[StandardUnit]
    val `Terabits/Second`  = "Terabits/Second".asInstanceOf[StandardUnit]
    val `Count/Second`     = "Count/Second".asInstanceOf[StandardUnit]
    val None               = "None".asInstanceOf[StandardUnit]

    val values = js.Object.freeze(
      js.Array(
        Seconds,
        Microseconds,
        Milliseconds,
        Bytes,
        Kilobytes,
        Megabytes,
        Gigabytes,
        Terabytes,
        Bits,
        Kilobits,
        Megabits,
        Gigabits,
        Terabits,
        Percent,
        Count,
        `Bytes/Second`,
        `Kilobytes/Second`,
        `Megabytes/Second`,
        `Gigabytes/Second`,
        `Terabytes/Second`,
        `Bits/Second`,
        `Kilobits/Second`,
        `Megabits/Second`,
        `Gigabits/Second`,
        `Terabits/Second`,
        `Count/Second`,
        None
      )
    )
  }

  @js.native
  sealed trait StateValue extends js.Any
  object StateValue extends js.Object {
    val OK                = "OK".asInstanceOf[StateValue]
    val ALARM             = "ALARM".asInstanceOf[StateValue]
    val INSUFFICIENT_DATA = "INSUFFICIENT_DATA".asInstanceOf[StateValue]

    val values = js.Object.freeze(js.Array(OK, ALARM, INSUFFICIENT_DATA))
  }

  @js.native
  sealed trait Statistic extends js.Any
  object Statistic extends js.Object {
    val SampleCount = "SampleCount".asInstanceOf[Statistic]
    val Average     = "Average".asInstanceOf[Statistic]
    val Sum         = "Sum".asInstanceOf[Statistic]
    val Minimum     = "Minimum".asInstanceOf[Statistic]
    val Maximum     = "Maximum".asInstanceOf[Statistic]

    val values = js.Object.freeze(js.Array(SampleCount, Average, Sum, Minimum, Maximum))
  }

  /**
    * Represents a set of statistics that describes a specific metric.
    */
  @js.native
  @Factory
  trait StatisticSet extends js.Object {
    var Maximum: DatapointValue
    var Minimum: DatapointValue
    var SampleCount: DatapointValue
    var Sum: DatapointValue
  }

  @js.native
  sealed trait StatusCode extends js.Any
  object StatusCode extends js.Object {
    val Complete      = "Complete".asInstanceOf[StatusCode]
    val InternalError = "InternalError".asInstanceOf[StatusCode]
    val PartialData   = "PartialData".asInstanceOf[StatusCode]

    val values = js.Object.freeze(js.Array(Complete, InternalError, PartialData))
  }

  /**
    * A key-value pair associated with a CloudWatch resource.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceInput extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceOutput extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceInput extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceOutput extends js.Object {}
}
