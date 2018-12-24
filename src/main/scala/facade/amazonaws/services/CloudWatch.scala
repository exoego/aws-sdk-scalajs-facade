package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object cloudwatch {
  type ActionPrefix = String
  type ActionsEnabled = Boolean
  type AlarmArn = String
  type AlarmDescription = String
  type AlarmHistoryItems = js.Array[AlarmHistoryItem]
  type AlarmName = String
  type AlarmNamePrefix = String
  type AlarmNames = js.Array[AlarmName]
  type ComparisonOperator = String
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
  type ExtendedStatistic = String
  type ExtendedStatistics = js.Array[ExtendedStatistic]
  type GetMetricDataMaxDatapoints = Int
  type HistoryData = String
  type HistoryItemType = String
  type HistorySummary = String
  type LastModified = js.Date
  type MaxRecords = Int
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
  type MetricWidget = String
  type MetricWidgetImage = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Metrics = js.Array[Metric]
  type Namespace = String
  type NextToken = String
  type OutputFormat = String
  type Period = Int
  type ResourceList = js.Array[ResourceName]
  type ResourceName = String
  type ReturnData = Boolean
  type ScanBy = String
  type Size = Double
  type StandardUnit = String
  type Stat = String
  type StateReason = String
  type StateReasonData = String
  type StateValue = String
  type Statistic = String
  type Statistics = js.Array[Statistic]
  type StatusCode = String
  type StorageResolution = Int
  type Threshold = Double
  type Timestamp = js.Date
  type Timestamps = js.Array[Timestamp]
  type TreatMissingData = String
  type Values = js.Array[DatapointValue]
}

package cloudwatch {
  @js.native
  @JSImport("aws-sdk", "CloudWatch")
  class CloudWatch() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteAlarms(params: DeleteAlarmsInput): Request[js.Object] = js.native
    def deleteDashboards(params: DeleteDashboardsInput): Request[DeleteDashboardsOutput] = js.native
    def describeAlarmHistory(params: DescribeAlarmHistoryInput): Request[DescribeAlarmHistoryOutput] = js.native
    def describeAlarms(params: DescribeAlarmsInput): Request[DescribeAlarmsOutput] = js.native
    def describeAlarmsForMetric(params: DescribeAlarmsForMetricInput): Request[DescribeAlarmsForMetricOutput] = js.native
    def disableAlarmActions(params: DisableAlarmActionsInput): Request[js.Object] = js.native
    def enableAlarmActions(params: EnableAlarmActionsInput): Request[js.Object] = js.native
    def getDashboard(params: GetDashboardInput): Request[GetDashboardOutput] = js.native
    def getMetricData(params: GetMetricDataInput): Request[GetMetricDataOutput] = js.native
    def getMetricStatistics(params: GetMetricStatisticsInput): Request[GetMetricStatisticsOutput] = js.native
    def getMetricWidgetImage(params: GetMetricWidgetImageInput): Request[GetMetricWidgetImageOutput] = js.native
    def listDashboards(params: ListDashboardsInput): Request[ListDashboardsOutput] = js.native
    def listMetrics(params: ListMetricsInput): Request[ListMetricsOutput] = js.native
    def putDashboard(params: PutDashboardInput): Request[PutDashboardOutput] = js.native
    def putMetricAlarm(params: PutMetricAlarmInput): Request[js.Object] = js.native
    def putMetricData(params: PutMetricDataInput): Request[js.Object] = js.native
    def setAlarmState(params: SetAlarmStateInput): Request[js.Object] = js.native
  }

  /**
   * Represents the history of a specific alarm.
   */
  @js.native
  trait AlarmHistoryItem extends js.Object {
    var AlarmName: js.UndefOr[AlarmName]
    var HistoryData: js.UndefOr[HistoryData]
    var HistoryItemType: js.UndefOr[HistoryItemType]
    var HistorySummary: js.UndefOr[HistorySummary]
    var Timestamp: js.UndefOr[Timestamp]
  }

  object AlarmHistoryItem {
    def apply(
      AlarmName: js.UndefOr[AlarmName] = js.undefined,
      HistoryData: js.UndefOr[HistoryData] = js.undefined,
      HistoryItemType: js.UndefOr[HistoryItemType] = js.undefined,
      HistorySummary: js.UndefOr[HistorySummary] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined): AlarmHistoryItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlarmName" -> AlarmName.map { x => x.asInstanceOf[js.Any] },
        "HistoryData" -> HistoryData.map { x => x.asInstanceOf[js.Any] },
        "HistoryItemType" -> HistoryItemType.map { x => x.asInstanceOf[js.Any] },
        "HistorySummary" -> HistorySummary.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AlarmHistoryItem]
    }
  }

  object ComparisonOperatorEnum {
    val GreaterThanOrEqualToThreshold = "GreaterThanOrEqualToThreshold"
    val GreaterThanThreshold = "GreaterThanThreshold"
    val LessThanThreshold = "LessThanThreshold"
    val LessThanOrEqualToThreshold = "LessThanOrEqualToThreshold"

    val values = IndexedSeq(GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold)
  }

  /**
   * Represents a specific dashboard.
   */
  @js.native
  trait DashboardEntry extends js.Object {
    var DashboardArn: js.UndefOr[DashboardArn]
    var DashboardName: js.UndefOr[DashboardName]
    var LastModified: js.UndefOr[LastModified]
    var Size: js.UndefOr[Size]
  }

  object DashboardEntry {
    def apply(
      DashboardArn: js.UndefOr[DashboardArn] = js.undefined,
      DashboardName: js.UndefOr[DashboardName] = js.undefined,
      LastModified: js.UndefOr[LastModified] = js.undefined,
      Size: js.UndefOr[Size] = js.undefined): DashboardEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DashboardArn" -> DashboardArn.map { x => x.asInstanceOf[js.Any] },
        "DashboardName" -> DashboardName.map { x => x.asInstanceOf[js.Any] },
        "LastModified" -> LastModified.map { x => x.asInstanceOf[js.Any] },
        "Size" -> Size.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DashboardEntry]
    }
  }

  /**
   * An error or warning for the operation.
   */
  @js.native
  trait DashboardValidationMessage extends js.Object {
    var DataPath: js.UndefOr[DataPath]
    var Message: js.UndefOr[Message]
  }

  object DashboardValidationMessage {
    def apply(
      DataPath: js.UndefOr[DataPath] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined): DashboardValidationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataPath" -> DataPath.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DashboardValidationMessage]
    }
  }

  /**
   * Encapsulates the statistical data that CloudWatch computes from metric data.
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
    def apply(
      Average: js.UndefOr[DatapointValue] = js.undefined,
      ExtendedStatistics: js.UndefOr[DatapointValueMap] = js.undefined,
      Maximum: js.UndefOr[DatapointValue] = js.undefined,
      Minimum: js.UndefOr[DatapointValue] = js.undefined,
      SampleCount: js.UndefOr[DatapointValue] = js.undefined,
      Sum: js.UndefOr[DatapointValue] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined,
      Unit: js.UndefOr[StandardUnit] = js.undefined): Datapoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Average" -> Average.map { x => x.asInstanceOf[js.Any] },
        "ExtendedStatistics" -> ExtendedStatistics.map { x => x.asInstanceOf[js.Any] },
        "Maximum" -> Maximum.map { x => x.asInstanceOf[js.Any] },
        "Minimum" -> Minimum.map { x => x.asInstanceOf[js.Any] },
        "SampleCount" -> SampleCount.map { x => x.asInstanceOf[js.Any] },
        "Sum" -> Sum.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] },
        "Unit" -> Unit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Datapoint]
    }
  }

  @js.native
  trait DeleteAlarmsInput extends js.Object {
    var AlarmNames: AlarmNames
  }

  object DeleteAlarmsInput {
    def apply(
      AlarmNames: AlarmNames): DeleteAlarmsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlarmNames" -> AlarmNames.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAlarmsInput]
    }
  }

  @js.native
  trait DeleteDashboardsInput extends js.Object {
    var DashboardNames: DashboardNames
  }

  object DeleteDashboardsInput {
    def apply(
      DashboardNames: DashboardNames): DeleteDashboardsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DashboardNames" -> DashboardNames.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDashboardsInput]
    }
  }

  @js.native
  trait DeleteDashboardsOutput extends js.Object {

  }

  object DeleteDashboardsOutput {
    def apply(): DeleteDashboardsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDashboardsOutput]
    }
  }

  @js.native
  trait DescribeAlarmHistoryInput extends js.Object {
    var AlarmName: js.UndefOr[AlarmName]
    var EndDate: js.UndefOr[Timestamp]
    var HistoryItemType: js.UndefOr[HistoryItemType]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[NextToken]
    var StartDate: js.UndefOr[Timestamp]
  }

  object DescribeAlarmHistoryInput {
    def apply(
      AlarmName: js.UndefOr[AlarmName] = js.undefined,
      EndDate: js.UndefOr[Timestamp] = js.undefined,
      HistoryItemType: js.UndefOr[HistoryItemType] = js.undefined,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      StartDate: js.UndefOr[Timestamp] = js.undefined): DescribeAlarmHistoryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlarmName" -> AlarmName.map { x => x.asInstanceOf[js.Any] },
        "EndDate" -> EndDate.map { x => x.asInstanceOf[js.Any] },
        "HistoryItemType" -> HistoryItemType.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "StartDate" -> StartDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAlarmHistoryInput]
    }
  }

  @js.native
  trait DescribeAlarmHistoryOutput extends js.Object {
    var AlarmHistoryItems: js.UndefOr[AlarmHistoryItems]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAlarmHistoryOutput {
    def apply(
      AlarmHistoryItems: js.UndefOr[AlarmHistoryItems] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeAlarmHistoryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlarmHistoryItems" -> AlarmHistoryItems.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAlarmHistoryOutput]
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
    def apply(
      MetricName: MetricName,
      Namespace: Namespace,
      Dimensions: js.UndefOr[Dimensions] = js.undefined,
      ExtendedStatistic: js.UndefOr[ExtendedStatistic] = js.undefined,
      Period: js.UndefOr[Period] = js.undefined,
      Statistic: js.UndefOr[Statistic] = js.undefined,
      Unit: js.UndefOr[StandardUnit] = js.undefined): DescribeAlarmsForMetricInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any],
        "Dimensions" -> Dimensions.map { x => x.asInstanceOf[js.Any] },
        "ExtendedStatistic" -> ExtendedStatistic.map { x => x.asInstanceOf[js.Any] },
        "Period" -> Period.map { x => x.asInstanceOf[js.Any] },
        "Statistic" -> Statistic.map { x => x.asInstanceOf[js.Any] },
        "Unit" -> Unit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAlarmsForMetricInput]
    }
  }

  @js.native
  trait DescribeAlarmsForMetricOutput extends js.Object {
    var MetricAlarms: js.UndefOr[MetricAlarms]
  }

  object DescribeAlarmsForMetricOutput {
    def apply(
      MetricAlarms: js.UndefOr[MetricAlarms] = js.undefined): DescribeAlarmsForMetricOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MetricAlarms" -> MetricAlarms.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAlarmsForMetricOutput]
    }
  }

  @js.native
  trait DescribeAlarmsInput extends js.Object {
    var ActionPrefix: js.UndefOr[ActionPrefix]
    var AlarmNamePrefix: js.UndefOr[AlarmNamePrefix]
    var AlarmNames: js.UndefOr[AlarmNames]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[NextToken]
    var StateValue: js.UndefOr[StateValue]
  }

  object DescribeAlarmsInput {
    def apply(
      ActionPrefix: js.UndefOr[ActionPrefix] = js.undefined,
      AlarmNamePrefix: js.UndefOr[AlarmNamePrefix] = js.undefined,
      AlarmNames: js.UndefOr[AlarmNames] = js.undefined,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      StateValue: js.UndefOr[StateValue] = js.undefined): DescribeAlarmsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActionPrefix" -> ActionPrefix.map { x => x.asInstanceOf[js.Any] },
        "AlarmNamePrefix" -> AlarmNamePrefix.map { x => x.asInstanceOf[js.Any] },
        "AlarmNames" -> AlarmNames.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "StateValue" -> StateValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAlarmsInput]
    }
  }

  @js.native
  trait DescribeAlarmsOutput extends js.Object {
    var MetricAlarms: js.UndefOr[MetricAlarms]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAlarmsOutput {
    def apply(
      MetricAlarms: js.UndefOr[MetricAlarms] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeAlarmsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MetricAlarms" -> MetricAlarms.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAlarmsOutput]
    }
  }

  /**
   * Expands the identity of a metric.
   */
  @js.native
  trait Dimension extends js.Object {
    var Name: DimensionName
    var Value: DimensionValue
  }

  object Dimension {
    def apply(
      Name: DimensionName,
      Value: DimensionValue): Dimension = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Dimension]
    }
  }

  /**
   * Represents filters for a dimension.
   */
  @js.native
  trait DimensionFilter extends js.Object {
    var Name: DimensionName
    var Value: js.UndefOr[DimensionValue]
  }

  object DimensionFilter {
    def apply(
      Name: DimensionName,
      Value: js.UndefOr[DimensionValue] = js.undefined): DimensionFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DimensionFilter]
    }
  }

  @js.native
  trait DisableAlarmActionsInput extends js.Object {
    var AlarmNames: AlarmNames
  }

  object DisableAlarmActionsInput {
    def apply(
      AlarmNames: AlarmNames): DisableAlarmActionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlarmNames" -> AlarmNames.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableAlarmActionsInput]
    }
  }

  @js.native
  trait EnableAlarmActionsInput extends js.Object {
    var AlarmNames: AlarmNames
  }

  object EnableAlarmActionsInput {
    def apply(
      AlarmNames: AlarmNames): EnableAlarmActionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlarmNames" -> AlarmNames.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableAlarmActionsInput]
    }
  }

  @js.native
  trait GetDashboardInput extends js.Object {
    var DashboardName: DashboardName
  }

  object GetDashboardInput {
    def apply(
      DashboardName: DashboardName): GetDashboardInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DashboardName" -> DashboardName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDashboardInput]
    }
  }

  @js.native
  trait GetDashboardOutput extends js.Object {
    var DashboardArn: js.UndefOr[DashboardArn]
    var DashboardBody: js.UndefOr[DashboardBody]
    var DashboardName: js.UndefOr[DashboardName]
  }

  object GetDashboardOutput {
    def apply(
      DashboardArn: js.UndefOr[DashboardArn] = js.undefined,
      DashboardBody: js.UndefOr[DashboardBody] = js.undefined,
      DashboardName: js.UndefOr[DashboardName] = js.undefined): GetDashboardOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DashboardArn" -> DashboardArn.map { x => x.asInstanceOf[js.Any] },
        "DashboardBody" -> DashboardBody.map { x => x.asInstanceOf[js.Any] },
        "DashboardName" -> DashboardName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDashboardOutput]
    }
  }

  @js.native
  trait GetMetricDataInput extends js.Object {
    var EndTime: Timestamp
    var MetricDataQueries: MetricDataQueries
    var StartTime: Timestamp
    var MaxDatapoints: js.UndefOr[GetMetricDataMaxDatapoints]
    var NextToken: js.UndefOr[NextToken]
    var ScanBy: js.UndefOr[ScanBy]
  }

  object GetMetricDataInput {
    def apply(
      EndTime: Timestamp,
      MetricDataQueries: MetricDataQueries,
      StartTime: Timestamp,
      MaxDatapoints: js.UndefOr[GetMetricDataMaxDatapoints] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      ScanBy: js.UndefOr[ScanBy] = js.undefined): GetMetricDataInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "MetricDataQueries" -> MetricDataQueries.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any],
        "MaxDatapoints" -> MaxDatapoints.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ScanBy" -> ScanBy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMetricDataInput]
    }
  }

  @js.native
  trait GetMetricDataOutput extends js.Object {
    var MetricDataResults: js.UndefOr[MetricDataResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetMetricDataOutput {
    def apply(
      MetricDataResults: js.UndefOr[MetricDataResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetMetricDataOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MetricDataResults" -> MetricDataResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMetricDataOutput]
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
    def apply(
      EndTime: Timestamp,
      MetricName: MetricName,
      Namespace: Namespace,
      Period: Period,
      StartTime: Timestamp,
      Dimensions: js.UndefOr[Dimensions] = js.undefined,
      ExtendedStatistics: js.UndefOr[ExtendedStatistics] = js.undefined,
      Statistics: js.UndefOr[Statistics] = js.undefined,
      Unit: js.UndefOr[StandardUnit] = js.undefined): GetMetricStatisticsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndTime" -> EndTime.asInstanceOf[js.Any],
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any],
        "Period" -> Period.asInstanceOf[js.Any],
        "StartTime" -> StartTime.asInstanceOf[js.Any],
        "Dimensions" -> Dimensions.map { x => x.asInstanceOf[js.Any] },
        "ExtendedStatistics" -> ExtendedStatistics.map { x => x.asInstanceOf[js.Any] },
        "Statistics" -> Statistics.map { x => x.asInstanceOf[js.Any] },
        "Unit" -> Unit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMetricStatisticsInput]
    }
  }

  @js.native
  trait GetMetricStatisticsOutput extends js.Object {
    var Datapoints: js.UndefOr[Datapoints]
    var Label: js.UndefOr[MetricLabel]
  }

  object GetMetricStatisticsOutput {
    def apply(
      Datapoints: js.UndefOr[Datapoints] = js.undefined,
      Label: js.UndefOr[MetricLabel] = js.undefined): GetMetricStatisticsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Datapoints" -> Datapoints.map { x => x.asInstanceOf[js.Any] },
        "Label" -> Label.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMetricStatisticsOutput]
    }
  }

  @js.native
  trait GetMetricWidgetImageInput extends js.Object {
    var MetricWidget: MetricWidget
    var OutputFormat: js.UndefOr[OutputFormat]
  }

  object GetMetricWidgetImageInput {
    def apply(
      MetricWidget: MetricWidget,
      OutputFormat: js.UndefOr[OutputFormat] = js.undefined): GetMetricWidgetImageInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MetricWidget" -> MetricWidget.asInstanceOf[js.Any],
        "OutputFormat" -> OutputFormat.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMetricWidgetImageInput]
    }
  }

  @js.native
  trait GetMetricWidgetImageOutput extends js.Object {
    var MetricWidgetImage: js.UndefOr[MetricWidgetImage]
  }

  object GetMetricWidgetImageOutput {
    def apply(
      MetricWidgetImage: js.UndefOr[MetricWidgetImage] = js.undefined): GetMetricWidgetImageOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MetricWidgetImage" -> MetricWidgetImage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMetricWidgetImageOutput]
    }
  }

  object HistoryItemTypeEnum {
    val ConfigurationUpdate = "ConfigurationUpdate"
    val StateUpdate = "StateUpdate"
    val Action = "Action"

    val values = IndexedSeq(ConfigurationUpdate, StateUpdate, Action)
  }

  @js.native
  trait ListDashboardsInput extends js.Object {
    var DashboardNamePrefix: js.UndefOr[DashboardNamePrefix]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDashboardsInput {
    def apply(
      DashboardNamePrefix: js.UndefOr[DashboardNamePrefix] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListDashboardsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DashboardNamePrefix" -> DashboardNamePrefix.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDashboardsInput]
    }
  }

  @js.native
  trait ListDashboardsOutput extends js.Object {
    var DashboardEntries: js.UndefOr[DashboardEntries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDashboardsOutput {
    def apply(
      DashboardEntries: js.UndefOr[DashboardEntries] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListDashboardsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DashboardEntries" -> DashboardEntries.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDashboardsOutput]
    }
  }

  @js.native
  trait ListMetricsInput extends js.Object {
    var Dimensions: js.UndefOr[DimensionFilters]
    var MetricName: js.UndefOr[MetricName]
    var Namespace: js.UndefOr[Namespace]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMetricsInput {
    def apply(
      Dimensions: js.UndefOr[DimensionFilters] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined,
      Namespace: js.UndefOr[Namespace] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListMetricsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Dimensions" -> Dimensions.map { x => x.asInstanceOf[js.Any] },
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] },
        "Namespace" -> Namespace.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMetricsInput]
    }
  }

  @js.native
  trait ListMetricsOutput extends js.Object {
    var Metrics: js.UndefOr[Metrics]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMetricsOutput {
    def apply(
      Metrics: js.UndefOr[Metrics] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListMetricsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Metrics" -> Metrics.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMetricsOutput]
    }
  }

  /**
   * A message returned by the <code>GetMetricData</code>API, including a code and a description.
   */
  @js.native
  trait MessageData extends js.Object {
    var Code: js.UndefOr[MessageDataCode]
    var Value: js.UndefOr[MessageDataValue]
  }

  object MessageData {
    def apply(
      Code: js.UndefOr[MessageDataCode] = js.undefined,
      Value: js.UndefOr[MessageDataValue] = js.undefined): MessageData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MessageData]
    }
  }

  /**
   * Represents a specific metric.
   */
  @js.native
  trait Metric extends js.Object {
    var Dimensions: js.UndefOr[Dimensions]
    var MetricName: js.UndefOr[MetricName]
    var Namespace: js.UndefOr[Namespace]
  }

  object Metric {
    def apply(
      Dimensions: js.UndefOr[Dimensions] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined,
      Namespace: js.UndefOr[Namespace] = js.undefined): Metric = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Dimensions" -> Dimensions.map { x => x.asInstanceOf[js.Any] },
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] },
        "Namespace" -> Namespace.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Metric]
    }
  }

  /**
   * Represents an alarm.
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
    var TreatMissingData: js.UndefOr[TreatMissingData]
    var Unit: js.UndefOr[StandardUnit]
  }

  object MetricAlarm {
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
      TreatMissingData: js.UndefOr[TreatMissingData] = js.undefined,
      Unit: js.UndefOr[StandardUnit] = js.undefined): MetricAlarm = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActionsEnabled" -> ActionsEnabled.map { x => x.asInstanceOf[js.Any] },
        "AlarmActions" -> AlarmActions.map { x => x.asInstanceOf[js.Any] },
        "AlarmArn" -> AlarmArn.map { x => x.asInstanceOf[js.Any] },
        "AlarmConfigurationUpdatedTimestamp" -> AlarmConfigurationUpdatedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "AlarmDescription" -> AlarmDescription.map { x => x.asInstanceOf[js.Any] },
        "AlarmName" -> AlarmName.map { x => x.asInstanceOf[js.Any] },
        "ComparisonOperator" -> ComparisonOperator.map { x => x.asInstanceOf[js.Any] },
        "DatapointsToAlarm" -> DatapointsToAlarm.map { x => x.asInstanceOf[js.Any] },
        "Dimensions" -> Dimensions.map { x => x.asInstanceOf[js.Any] },
        "EvaluateLowSampleCountPercentile" -> EvaluateLowSampleCountPercentile.map { x => x.asInstanceOf[js.Any] },
        "EvaluationPeriods" -> EvaluationPeriods.map { x => x.asInstanceOf[js.Any] },
        "ExtendedStatistic" -> ExtendedStatistic.map { x => x.asInstanceOf[js.Any] },
        "InsufficientDataActions" -> InsufficientDataActions.map { x => x.asInstanceOf[js.Any] },
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] },
        "Metrics" -> Metrics.map { x => x.asInstanceOf[js.Any] },
        "Namespace" -> Namespace.map { x => x.asInstanceOf[js.Any] },
        "OKActions" -> OKActions.map { x => x.asInstanceOf[js.Any] },
        "Period" -> Period.map { x => x.asInstanceOf[js.Any] },
        "StateReason" -> StateReason.map { x => x.asInstanceOf[js.Any] },
        "StateReasonData" -> StateReasonData.map { x => x.asInstanceOf[js.Any] },
        "StateUpdatedTimestamp" -> StateUpdatedTimestamp.map { x => x.asInstanceOf[js.Any] },
        "StateValue" -> StateValue.map { x => x.asInstanceOf[js.Any] },
        "Statistic" -> Statistic.map { x => x.asInstanceOf[js.Any] },
        "Threshold" -> Threshold.map { x => x.asInstanceOf[js.Any] },
        "TreatMissingData" -> TreatMissingData.map { x => x.asInstanceOf[js.Any] },
        "Unit" -> Unit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricAlarm]
    }
  }

  /**
   * This structure is used in both <code>GetMetricData</code> and <code>PutMetricAlarm</code>. The supported use of this structure is different for those two operations.
   *  When used in <code>GetMetricData</code>, it indicates the metric data to return, and whether this call is just retrieving a batch set of data for one metric, or is performing a math expression on metric data. A single <code>GetMetricData</code> call can include up to 100 <code>MetricDataQuery</code> structures.
   *  When used in <code>PutMetricAlarm</code>, it enables you to create an alarm based on a metric math expression. Each <code>MetricDataQuery</code> in the array specifies either a metric to retrieve, or a math expression to be performed on retrieved metrics. A single <code>PutMetricAlarm</code> call can include up to 20 <code>MetricDataQuery</code> structures in the array. The 20 structures can include as many as 10 structures that contain a <code>MetricStat</code> parameter to retrieve a metric, and as many as 10 structures that contain the <code>Expression</code> parameter to perform a math expression. Any expression used in a <code>PutMetricAlarm</code> operation must return a single time series. For more information, see <a href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax">Metric Math Syntax and Functions</a> in the <i>Amazon CloudWatch User Guide</i>.
   *  Some of the parameters of this structure also have different uses whether you are using this structure in a <code>GetMetricData</code> operation or a <code>PutMetricAlarm</code> operation. These differences are explained in the following parameter list.
   */
  @js.native
  trait MetricDataQuery extends js.Object {
    var Id: MetricId
    var Expression: js.UndefOr[MetricExpression]
    var Label: js.UndefOr[MetricLabel]
    var MetricStat: js.UndefOr[MetricStat]
    var ReturnData: js.UndefOr[ReturnData]
  }

  object MetricDataQuery {
    def apply(
      Id: MetricId,
      Expression: js.UndefOr[MetricExpression] = js.undefined,
      Label: js.UndefOr[MetricLabel] = js.undefined,
      MetricStat: js.UndefOr[MetricStat] = js.undefined,
      ReturnData: js.UndefOr[ReturnData] = js.undefined): MetricDataQuery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "Expression" -> Expression.map { x => x.asInstanceOf[js.Any] },
        "Label" -> Label.map { x => x.asInstanceOf[js.Any] },
        "MetricStat" -> MetricStat.map { x => x.asInstanceOf[js.Any] },
        "ReturnData" -> ReturnData.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricDataQuery]
    }
  }

  /**
   * A <code>GetMetricData</code> call returns an array of <code>MetricDataResult</code> structures. Each of these structures includes the data points for that metric, along with the timestamps of those data points and other identifying information.
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
    def apply(
      Id: js.UndefOr[MetricId] = js.undefined,
      Label: js.UndefOr[MetricLabel] = js.undefined,
      Messages: js.UndefOr[MetricDataResultMessages] = js.undefined,
      StatusCode: js.UndefOr[StatusCode] = js.undefined,
      Timestamps: js.UndefOr[Timestamps] = js.undefined,
      Values: js.UndefOr[DatapointValues] = js.undefined): MetricDataResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Label" -> Label.map { x => x.asInstanceOf[js.Any] },
        "Messages" -> Messages.map { x => x.asInstanceOf[js.Any] },
        "StatusCode" -> StatusCode.map { x => x.asInstanceOf[js.Any] },
        "Timestamps" -> Timestamps.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricDataResult]
    }
  }

  /**
   * Encapsulates the information sent to either create a metric or add new values to be aggregated into an existing metric.
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
    def apply(
      MetricName: MetricName,
      Counts: js.UndefOr[Counts] = js.undefined,
      Dimensions: js.UndefOr[Dimensions] = js.undefined,
      StatisticValues: js.UndefOr[StatisticSet] = js.undefined,
      StorageResolution: js.UndefOr[StorageResolution] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined,
      Unit: js.UndefOr[StandardUnit] = js.undefined,
      Value: js.UndefOr[DatapointValue] = js.undefined,
      Values: js.UndefOr[Values] = js.undefined): MetricDatum = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Counts" -> Counts.map { x => x.asInstanceOf[js.Any] },
        "Dimensions" -> Dimensions.map { x => x.asInstanceOf[js.Any] },
        "StatisticValues" -> StatisticValues.map { x => x.asInstanceOf[js.Any] },
        "StorageResolution" -> StorageResolution.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] },
        "Unit" -> Unit.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricDatum]
    }
  }

  /**
   * This structure defines the metric to be returned, along with the statistics, period, and units.
   */
  @js.native
  trait MetricStat extends js.Object {
    var Metric: Metric
    var Period: Period
    var Stat: Stat
    var Unit: js.UndefOr[StandardUnit]
  }

  object MetricStat {
    def apply(
      Metric: Metric,
      Period: Period,
      Stat: Stat,
      Unit: js.UndefOr[StandardUnit] = js.undefined): MetricStat = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Metric" -> Metric.asInstanceOf[js.Any],
        "Period" -> Period.asInstanceOf[js.Any],
        "Stat" -> Stat.asInstanceOf[js.Any],
        "Unit" -> Unit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricStat]
    }
  }

  @js.native
  trait PutDashboardInput extends js.Object {
    var DashboardBody: DashboardBody
    var DashboardName: DashboardName
  }

  object PutDashboardInput {
    def apply(
      DashboardBody: DashboardBody,
      DashboardName: DashboardName): PutDashboardInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DashboardBody" -> DashboardBody.asInstanceOf[js.Any],
        "DashboardName" -> DashboardName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDashboardInput]
    }
  }

  @js.native
  trait PutDashboardOutput extends js.Object {
    var DashboardValidationMessages: js.UndefOr[DashboardValidationMessages]
  }

  object PutDashboardOutput {
    def apply(
      DashboardValidationMessages: js.UndefOr[DashboardValidationMessages] = js.undefined): PutDashboardOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DashboardValidationMessages" -> DashboardValidationMessages.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDashboardOutput]
    }
  }

  @js.native
  trait PutMetricAlarmInput extends js.Object {
    var AlarmName: AlarmName
    var ComparisonOperator: ComparisonOperator
    var EvaluationPeriods: EvaluationPeriods
    var Threshold: Threshold
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
    var TreatMissingData: js.UndefOr[TreatMissingData]
    var Unit: js.UndefOr[StandardUnit]
  }

  object PutMetricAlarmInput {
    def apply(
      AlarmName: AlarmName,
      ComparisonOperator: ComparisonOperator,
      EvaluationPeriods: EvaluationPeriods,
      Threshold: Threshold,
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
      TreatMissingData: js.UndefOr[TreatMissingData] = js.undefined,
      Unit: js.UndefOr[StandardUnit] = js.undefined): PutMetricAlarmInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlarmName" -> AlarmName.asInstanceOf[js.Any],
        "ComparisonOperator" -> ComparisonOperator.asInstanceOf[js.Any],
        "EvaluationPeriods" -> EvaluationPeriods.asInstanceOf[js.Any],
        "Threshold" -> Threshold.asInstanceOf[js.Any],
        "ActionsEnabled" -> ActionsEnabled.map { x => x.asInstanceOf[js.Any] },
        "AlarmActions" -> AlarmActions.map { x => x.asInstanceOf[js.Any] },
        "AlarmDescription" -> AlarmDescription.map { x => x.asInstanceOf[js.Any] },
        "DatapointsToAlarm" -> DatapointsToAlarm.map { x => x.asInstanceOf[js.Any] },
        "Dimensions" -> Dimensions.map { x => x.asInstanceOf[js.Any] },
        "EvaluateLowSampleCountPercentile" -> EvaluateLowSampleCountPercentile.map { x => x.asInstanceOf[js.Any] },
        "ExtendedStatistic" -> ExtendedStatistic.map { x => x.asInstanceOf[js.Any] },
        "InsufficientDataActions" -> InsufficientDataActions.map { x => x.asInstanceOf[js.Any] },
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] },
        "Metrics" -> Metrics.map { x => x.asInstanceOf[js.Any] },
        "Namespace" -> Namespace.map { x => x.asInstanceOf[js.Any] },
        "OKActions" -> OKActions.map { x => x.asInstanceOf[js.Any] },
        "Period" -> Period.map { x => x.asInstanceOf[js.Any] },
        "Statistic" -> Statistic.map { x => x.asInstanceOf[js.Any] },
        "TreatMissingData" -> TreatMissingData.map { x => x.asInstanceOf[js.Any] },
        "Unit" -> Unit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutMetricAlarmInput]
    }
  }

  @js.native
  trait PutMetricDataInput extends js.Object {
    var MetricData: MetricData
    var Namespace: Namespace
  }

  object PutMetricDataInput {
    def apply(
      MetricData: MetricData,
      Namespace: Namespace): PutMetricDataInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MetricData" -> MetricData.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutMetricDataInput]
    }
  }

  object ScanByEnum {
    val TimestampDescending = "TimestampDescending"
    val TimestampAscending = "TimestampAscending"

    val values = IndexedSeq(TimestampDescending, TimestampAscending)
  }

  @js.native
  trait SetAlarmStateInput extends js.Object {
    var AlarmName: AlarmName
    var StateReason: StateReason
    var StateValue: StateValue
    var StateReasonData: js.UndefOr[StateReasonData]
  }

  object SetAlarmStateInput {
    def apply(
      AlarmName: AlarmName,
      StateReason: StateReason,
      StateValue: StateValue,
      StateReasonData: js.UndefOr[StateReasonData] = js.undefined): SetAlarmStateInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AlarmName" -> AlarmName.asInstanceOf[js.Any],
        "StateReason" -> StateReason.asInstanceOf[js.Any],
        "StateValue" -> StateValue.asInstanceOf[js.Any],
        "StateReasonData" -> StateReasonData.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetAlarmStateInput]
    }
  }

  object StandardUnitEnum {
    val Seconds = "Seconds"
    val Microseconds = "Microseconds"
    val Milliseconds = "Milliseconds"
    val Bytes = "Bytes"
    val Kilobytes = "Kilobytes"
    val Megabytes = "Megabytes"
    val Gigabytes = "Gigabytes"
    val Terabytes = "Terabytes"
    val Bits = "Bits"
    val Kilobits = "Kilobits"
    val Megabits = "Megabits"
    val Gigabits = "Gigabits"
    val Terabits = "Terabits"
    val Percent = "Percent"
    val Count = "Count"
    val `Bytes/Second` = "Bytes/Second"
    val `Kilobytes/Second` = "Kilobytes/Second"
    val `Megabytes/Second` = "Megabytes/Second"
    val `Gigabytes/Second` = "Gigabytes/Second"
    val `Terabytes/Second` = "Terabytes/Second"
    val `Bits/Second` = "Bits/Second"
    val `Kilobits/Second` = "Kilobits/Second"
    val `Megabits/Second` = "Megabits/Second"
    val `Gigabits/Second` = "Gigabits/Second"
    val `Terabits/Second` = "Terabits/Second"
    val `Count/Second` = "Count/Second"
    val None = "None"

    val values = IndexedSeq(Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, Count, `Bytes/Second`, `Kilobytes/Second`, `Megabytes/Second`, `Gigabytes/Second`, `Terabytes/Second`, `Bits/Second`, `Kilobits/Second`, `Megabits/Second`, `Gigabits/Second`, `Terabits/Second`, `Count/Second`, None)
  }

  object StateValueEnum {
    val OK = "OK"
    val ALARM = "ALARM"
    val INSUFFICIENT_DATA = "INSUFFICIENT_DATA"

    val values = IndexedSeq(OK, ALARM, INSUFFICIENT_DATA)
  }

  object StatisticEnum {
    val SampleCount = "SampleCount"
    val Average = "Average"
    val Sum = "Sum"
    val Minimum = "Minimum"
    val Maximum = "Maximum"

    val values = IndexedSeq(SampleCount, Average, Sum, Minimum, Maximum)
  }

  /**
   * Represents a set of statistics that describes a specific metric.
   */
  @js.native
  trait StatisticSet extends js.Object {
    var Maximum: DatapointValue
    var Minimum: DatapointValue
    var SampleCount: DatapointValue
    var Sum: DatapointValue
  }

  object StatisticSet {
    def apply(
      Maximum: DatapointValue,
      Minimum: DatapointValue,
      SampleCount: DatapointValue,
      Sum: DatapointValue): StatisticSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Maximum" -> Maximum.asInstanceOf[js.Any],
        "Minimum" -> Minimum.asInstanceOf[js.Any],
        "SampleCount" -> SampleCount.asInstanceOf[js.Any],
        "Sum" -> Sum.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StatisticSet]
    }
  }

  object StatusCodeEnum {
    val Complete = "Complete"
    val InternalError = "InternalError"
    val PartialData = "PartialData"

    val values = IndexedSeq(Complete, InternalError, PartialData)
  }
}
