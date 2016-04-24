package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object monitoring {
  type ActionPrefix = String
  type ActionsEnabled = Boolean
  type AlarmArn = String
  type AlarmDescription = String
  type AlarmHistoryItems = js.Array[AlarmHistoryItem]
  type AlarmName = String
  type AlarmNamePrefix = String
  type AlarmNames = js.Array[AlarmName]
  type AwsQueryErrorMessage = String
  type ComparisonOperator = String
  type DatapointValue = Double
  type Datapoints = js.Array[Datapoint]
  type DimensionFilters = js.Array[DimensionFilter]
  type DimensionName = String
  type DimensionValue = String
  type Dimensions = js.Array[Dimension]
  type ErrorMessage = String
  type EvaluationPeriods = Integer
  type FaultDescription = String
  type HistoryData = String
  type HistoryItemType = String
  type HistorySummary = String
  type MaxRecords = Integer
  type MetricAlarms = js.Array[MetricAlarm]
  type MetricData = js.Array[MetricDatum]
  type MetricLabel = String
  type MetricName = String
  type Metrics = js.Array[Metric]
  type Namespace = String
  type NextToken = String
  type Period = Integer
  type ResourceList = js.Array[ResourceName]
  type ResourceName = String
  type StandardUnit = String
  type StateReason = String
  type StateReasonData = String
  type StateValue = String
  type Statistic = String
  type Statistics = js.Array[Statistic]
  type Threshold = Double
  type Timestamp = js.Date
}

package monitoring {
  @js.native
  trait Monitoring extends js.Object {
    def deleteAlarms(params: DeleteAlarmsInput, callback: Callback[js.Object]): Unit = js.native
    def deleteAlarms(params: DeleteAlarmsInput): Request[js.Object] = js.native
    def describeAlarmHistory(params: DescribeAlarmHistoryInput, callback: Callback[DescribeAlarmHistoryOutput]): Unit = js.native
    def describeAlarmHistory(params: DescribeAlarmHistoryInput): Request[DescribeAlarmHistoryOutput] = js.native
    def describeAlarms(params: DescribeAlarmsInput, callback: Callback[DescribeAlarmsOutput]): Unit = js.native
    def describeAlarms(params: DescribeAlarmsInput): Request[DescribeAlarmsOutput] = js.native
    def describeAlarmsForMetric(params: DescribeAlarmsForMetricInput, callback: Callback[DescribeAlarmsForMetricOutput]): Unit = js.native
    def describeAlarmsForMetric(params: DescribeAlarmsForMetricInput): Request[DescribeAlarmsForMetricOutput] = js.native
    def disableAlarmActions(params: DisableAlarmActionsInput, callback: Callback[js.Object]): Unit = js.native
    def disableAlarmActions(params: DisableAlarmActionsInput): Request[js.Object] = js.native
    def enableAlarmActions(params: EnableAlarmActionsInput, callback: Callback[js.Object]): Unit = js.native
    def enableAlarmActions(params: EnableAlarmActionsInput): Request[js.Object] = js.native
    def getMetricStatistics(params: GetMetricStatisticsInput, callback: Callback[GetMetricStatisticsOutput]): Unit = js.native
    def getMetricStatistics(params: GetMetricStatisticsInput): Request[GetMetricStatisticsOutput] = js.native
    def listMetrics(params: ListMetricsInput, callback: Callback[ListMetricsOutput]): Unit = js.native
    def listMetrics(params: ListMetricsInput): Request[ListMetricsOutput] = js.native
    def putMetricAlarm(params: PutMetricAlarmInput, callback: Callback[js.Object]): Unit = js.native
    def putMetricAlarm(params: PutMetricAlarmInput): Request[js.Object] = js.native
    def putMetricData(params: PutMetricDataInput, callback: Callback[js.Object]): Unit = js.native
    def putMetricData(params: PutMetricDataInput): Request[js.Object] = js.native
    def setAlarmState(params: SetAlarmStateInput, callback: Callback[js.Object]): Unit = js.native
    def setAlarmState(params: SetAlarmStateInput): Request[js.Object] = js.native
  }

  /**
   * <p> The <code>AlarmHistoryItem</code> data type contains descriptive information about the history of a specific alarm. If you call <a>DescribeAlarmHistory</a>, Amazon CloudWatch returns this data type as part of the <a>DescribeAlarmHistoryResult</a> data type. </p>
   */
  @js.native
  trait AlarmHistoryItem extends js.Object {
    var HistorySummary: HistorySummary
    var Timestamp: Timestamp
    var HistoryData: HistoryData
    var AlarmName: AlarmName
    var HistoryItemType: HistoryItemType
  }

  object AlarmHistoryItem {
    def apply(
      HistorySummary: js.UndefOr[HistorySummary] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined,
      HistoryData: js.UndefOr[HistoryData] = js.undefined,
      AlarmName: js.UndefOr[AlarmName] = js.undefined,
      HistoryItemType: js.UndefOr[HistoryItemType] = js.undefined
    ): AlarmHistoryItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HistorySummary" -> HistorySummary.map { x => x: js.Any }),
        ("Timestamp" -> Timestamp.map { x => x: js.Any }),
        ("HistoryData" -> HistoryData.map { x => x: js.Any }),
        ("AlarmName" -> AlarmName.map { x => x: js.Any }),
        ("HistoryItemType" -> HistoryItemType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
   * <p> The <code>Datapoint</code> data type encapsulates the statistical data that Amazon CloudWatch computes from metric data. </p>
   */
  @js.native
  trait Datapoint extends js.Object {
    var SampleCount: DatapointValue
    var Sum: DatapointValue
    var Timestamp: Timestamp
    var Average: DatapointValue
    var Maximum: DatapointValue
    var Unit: StandardUnit
    var Minimum: DatapointValue
  }

  object Datapoint {
    def apply(
      SampleCount: js.UndefOr[DatapointValue] = js.undefined,
      Sum: js.UndefOr[DatapointValue] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined,
      Average: js.UndefOr[DatapointValue] = js.undefined,
      Maximum: js.UndefOr[DatapointValue] = js.undefined,
      Unit: js.UndefOr[StandardUnit] = js.undefined,
      Minimum: js.UndefOr[DatapointValue] = js.undefined
    ): Datapoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SampleCount" -> SampleCount.map { x => x: js.Any }),
        ("Sum" -> Sum.map { x => x: js.Any }),
        ("Timestamp" -> Timestamp.map { x => x: js.Any }),
        ("Average" -> Average.map { x => x: js.Any }),
        ("Maximum" -> Maximum.map { x => x: js.Any }),
        ("Unit" -> Unit.map { x => x: js.Any }),
        ("Minimum" -> Minimum.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Datapoint]
    }
  }

  @js.native
  trait DeleteAlarmsInput extends js.Object {
    var AlarmNames: AlarmNames
  }

  object DeleteAlarmsInput {
    def apply(
      AlarmNames: js.UndefOr[AlarmNames] = js.undefined
    ): DeleteAlarmsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AlarmNames" -> AlarmNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAlarmsInput]
    }
  }

  @js.native
  trait DescribeAlarmHistoryInput extends js.Object {
    var MaxRecords: MaxRecords
    var AlarmName: AlarmName
    var StartDate: Timestamp
    var HistoryItemType: HistoryItemType
    var EndDate: Timestamp
    var NextToken: NextToken
  }

  object DescribeAlarmHistoryInput {
    def apply(
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
      AlarmName: js.UndefOr[AlarmName] = js.undefined,
      StartDate: js.UndefOr[Timestamp] = js.undefined,
      HistoryItemType: js.UndefOr[HistoryItemType] = js.undefined,
      EndDate: js.UndefOr[Timestamp] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAlarmHistoryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("AlarmName" -> AlarmName.map { x => x: js.Any }),
        ("StartDate" -> StartDate.map { x => x: js.Any }),
        ("HistoryItemType" -> HistoryItemType.map { x => x: js.Any }),
        ("EndDate" -> EndDate.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAlarmHistoryInput]
    }
  }

  /**
   * <p> The output for the <a>DescribeAlarmHistory</a> action. </p>
   */
  @js.native
  trait DescribeAlarmHistoryOutput extends js.Object {
    var AlarmHistoryItems: AlarmHistoryItems
    var NextToken: NextToken
  }

  object DescribeAlarmHistoryOutput {
    def apply(
      AlarmHistoryItems: js.UndefOr[AlarmHistoryItems] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAlarmHistoryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AlarmHistoryItems" -> AlarmHistoryItems.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAlarmHistoryOutput]
    }
  }

  @js.native
  trait DescribeAlarmsForMetricInput extends js.Object {
    var Dimensions: Dimensions
    var Period: Period
    var Statistic: Statistic
    var Namespace: Namespace
    var Unit: StandardUnit
    var MetricName: MetricName
  }

  object DescribeAlarmsForMetricInput {
    def apply(
      Dimensions: js.UndefOr[Dimensions] = js.undefined,
      Period: js.UndefOr[Period] = js.undefined,
      Statistic: js.UndefOr[Statistic] = js.undefined,
      Namespace: js.UndefOr[Namespace] = js.undefined,
      Unit: js.UndefOr[StandardUnit] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined
    ): DescribeAlarmsForMetricInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Dimensions" -> Dimensions.map { x => x: js.Any }),
        ("Period" -> Period.map { x => x: js.Any }),
        ("Statistic" -> Statistic.map { x => x: js.Any }),
        ("Namespace" -> Namespace.map { x => x: js.Any }),
        ("Unit" -> Unit.map { x => x: js.Any }),
        ("MetricName" -> MetricName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAlarmsForMetricInput]
    }
  }

  /**
   * <p> The output for the <a>DescribeAlarmsForMetric</a> action. </p>
   */
  @js.native
  trait DescribeAlarmsForMetricOutput extends js.Object {
    var MetricAlarms: MetricAlarms
  }

  object DescribeAlarmsForMetricOutput {
    def apply(
      MetricAlarms: js.UndefOr[MetricAlarms] = js.undefined
    ): DescribeAlarmsForMetricOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MetricAlarms" -> MetricAlarms.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAlarmsForMetricOutput]
    }
  }

  @js.native
  trait DescribeAlarmsInput extends js.Object {
    var ActionPrefix: ActionPrefix
    var StateValue: StateValue
    var MaxRecords: MaxRecords
    var AlarmNames: AlarmNames
    var AlarmNamePrefix: AlarmNamePrefix
    var NextToken: NextToken
  }

  object DescribeAlarmsInput {
    def apply(
      ActionPrefix: js.UndefOr[ActionPrefix] = js.undefined,
      StateValue: js.UndefOr[StateValue] = js.undefined,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
      AlarmNames: js.UndefOr[AlarmNames] = js.undefined,
      AlarmNamePrefix: js.UndefOr[AlarmNamePrefix] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAlarmsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ActionPrefix" -> ActionPrefix.map { x => x: js.Any }),
        ("StateValue" -> StateValue.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("AlarmNames" -> AlarmNames.map { x => x: js.Any }),
        ("AlarmNamePrefix" -> AlarmNamePrefix.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAlarmsInput]
    }
  }

  /**
   * <p> The output for the <a>DescribeAlarms</a> action. </p>
   */
  @js.native
  trait DescribeAlarmsOutput extends js.Object {
    var MetricAlarms: MetricAlarms
    var NextToken: NextToken
  }

  object DescribeAlarmsOutput {
    def apply(
      MetricAlarms: js.UndefOr[MetricAlarms] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAlarmsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MetricAlarms" -> MetricAlarms.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAlarmsOutput]
    }
  }

  /**
   * <p> The <code>Dimension</code> data type further expands on the identity of a metric using a Name, Value pair. </p> <p>For examples that use one or more dimensions, see <a>PutMetricData</a>.</p>
   */
  @js.native
  trait Dimension extends js.Object {
    var Name: DimensionName
    var Value: DimensionValue
  }

  object Dimension {
    def apply(
      Name: js.UndefOr[DimensionName] = js.undefined,
      Value: js.UndefOr[DimensionValue] = js.undefined
    ): Dimension = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Dimension]
    }
  }

  /**
   * <p> The <code>DimensionFilter</code> data type is used to filter <a>ListMetrics</a> results. </p>
   */
  @js.native
  trait DimensionFilter extends js.Object {
    var Name: DimensionName
    var Value: DimensionValue
  }

  object DimensionFilter {
    def apply(
      Name: js.UndefOr[DimensionName] = js.undefined,
      Value: js.UndefOr[DimensionValue] = js.undefined
    ): DimensionFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DimensionFilter]
    }
  }

  /**
   * <p> </p>
   */
  @js.native
  trait DisableAlarmActionsInput extends js.Object {
    var AlarmNames: AlarmNames
  }

  object DisableAlarmActionsInput {
    def apply(
      AlarmNames: js.UndefOr[AlarmNames] = js.undefined
    ): DisableAlarmActionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AlarmNames" -> AlarmNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableAlarmActionsInput]
    }
  }

  @js.native
  trait EnableAlarmActionsInput extends js.Object {
    var AlarmNames: AlarmNames
  }

  object EnableAlarmActionsInput {
    def apply(
      AlarmNames: js.UndefOr[AlarmNames] = js.undefined
    ): EnableAlarmActionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AlarmNames" -> AlarmNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableAlarmActionsInput]
    }
  }

  @js.native
  trait GetMetricStatisticsInput extends js.Object {
    var Statistics: Statistics
    var Dimensions: Dimensions
    var StartTime: Timestamp
    var EndTime: Timestamp
    var Period: Period
    var Namespace: Namespace
    var Unit: StandardUnit
    var MetricName: MetricName
  }

  object GetMetricStatisticsInput {
    def apply(
      Statistics: js.UndefOr[Statistics] = js.undefined,
      Dimensions: js.UndefOr[Dimensions] = js.undefined,
      StartTime: js.UndefOr[Timestamp] = js.undefined,
      EndTime: js.UndefOr[Timestamp] = js.undefined,
      Period: js.UndefOr[Period] = js.undefined,
      Namespace: js.UndefOr[Namespace] = js.undefined,
      Unit: js.UndefOr[StandardUnit] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined
    ): GetMetricStatisticsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Statistics" -> Statistics.map { x => x: js.Any }),
        ("Dimensions" -> Dimensions.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("EndTime" -> EndTime.map { x => x: js.Any }),
        ("Period" -> Period.map { x => x: js.Any }),
        ("Namespace" -> Namespace.map { x => x: js.Any }),
        ("Unit" -> Unit.map { x => x: js.Any }),
        ("MetricName" -> MetricName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMetricStatisticsInput]
    }
  }

  /**
   * <p> The output for the <a>GetMetricStatistics</a> action. </p>
   */
  @js.native
  trait GetMetricStatisticsOutput extends js.Object {
    var Label: MetricLabel
    var Datapoints: Datapoints
  }

  object GetMetricStatisticsOutput {
    def apply(
      Label: js.UndefOr[MetricLabel] = js.undefined,
      Datapoints: js.UndefOr[Datapoints] = js.undefined
    ): GetMetricStatisticsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Label" -> Label.map { x => x: js.Any }),
        ("Datapoints" -> Datapoints.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMetricStatisticsOutput]
    }
  }


  object HistoryItemTypeEnum {
    val ConfigurationUpdate = "ConfigurationUpdate"
    val StateUpdate = "StateUpdate"
    val Action = "Action"

    val values = IndexedSeq(ConfigurationUpdate, StateUpdate, Action)
  }

  /**
   * <p> Indicates that the request processing has failed due to some unknown error, exception, or failure. </p>
   */
  @js.native
  trait InternalServiceFaultException extends js.Object {
    var Message: FaultDescription
  }

  /**
   * <p> Data was not syntactically valid JSON. </p>
   */
  @js.native
  trait InvalidFormatFaultException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p> The next token specified is invalid. </p>
   */
  @js.native
  trait InvalidNextTokenException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p> Parameters that must not be used together were used together. </p>
   */
  @js.native
  trait InvalidParameterCombinationExceptionException extends js.Object {
    var message: AwsQueryErrorMessage
  }

  /**
   * <p> Bad or out-of-range value was supplied for the input parameter. </p>
   */
  @js.native
  trait InvalidParameterValueExceptionException extends js.Object {
    var message: AwsQueryErrorMessage
  }

  /**
   * <p> The quota for alarms for this customer has already been reached. </p>
   */
  @js.native
  trait LimitExceededFaultException extends js.Object {
    var message: ErrorMessage
  }

  @js.native
  trait ListMetricsInput extends js.Object {
    var Namespace: Namespace
    var MetricName: MetricName
    var Dimensions: DimensionFilters
    var NextToken: NextToken
  }

  object ListMetricsInput {
    def apply(
      Namespace: js.UndefOr[Namespace] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined,
      Dimensions: js.UndefOr[DimensionFilters] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMetricsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Namespace" -> Namespace.map { x => x: js.Any }),
        ("MetricName" -> MetricName.map { x => x: js.Any }),
        ("Dimensions" -> Dimensions.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMetricsInput]
    }
  }

  /**
   * <p> The output for the <a>ListMetrics</a> action. </p>
   */
  @js.native
  trait ListMetricsOutput extends js.Object {
    var Metrics: Metrics
    var NextToken: NextToken
  }

  object ListMetricsOutput {
    def apply(
      Metrics: js.UndefOr[Metrics] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMetricsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Metrics" -> Metrics.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMetricsOutput]
    }
  }

  /**
   * <p> The <code>Metric</code> data type contains information about a specific metric. If you call <a>ListMetrics</a>, Amazon CloudWatch returns information contained by this data type. </p> <p> The example in the Examples section publishes two metrics named buffers and latency. Both metrics are in the examples namespace. Both metrics have two dimensions, InstanceID and InstanceType. </p>
   */
  @js.native
  trait Metric extends js.Object {
    var Namespace: Namespace
    var MetricName: MetricName
    var Dimensions: Dimensions
  }

  object Metric {
    def apply(
      Namespace: js.UndefOr[Namespace] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined,
      Dimensions: js.UndefOr[Dimensions] = js.undefined
    ): Metric = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Namespace" -> Namespace.map { x => x: js.Any }),
        ("MetricName" -> MetricName.map { x => x: js.Any }),
        ("Dimensions" -> Dimensions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Metric]
    }
  }

  /**
   * <p> The <a>MetricAlarm</a> data type represents an alarm. You can use <a>PutMetricAlarm</a> to create or update an alarm. </p>
   */
  @js.native
  trait MetricAlarm extends js.Object {
    var Threshold: Threshold
    var StateReasonData: StateReasonData
    var StateValue: StateValue
    var Dimensions: Dimensions
    var AlarmDescription: AlarmDescription
    var AlarmConfigurationUpdatedTimestamp: Timestamp
    var EvaluationPeriods: EvaluationPeriods
    var StateUpdatedTimestamp: Timestamp
    var AlarmArn: AlarmArn
    var ComparisonOperator: ComparisonOperator
    var Period: Period
    var AlarmActions: ResourceList
    var Statistic: Statistic
    var AlarmName: AlarmName
    var Namespace: Namespace
    var ActionsEnabled: ActionsEnabled
    var StateReason: StateReason
    var InsufficientDataActions: ResourceList
    var Unit: StandardUnit
    var OKActions: ResourceList
    var MetricName: MetricName
  }

  object MetricAlarm {
    def apply(
      Threshold: js.UndefOr[Threshold] = js.undefined,
      StateReasonData: js.UndefOr[StateReasonData] = js.undefined,
      StateValue: js.UndefOr[StateValue] = js.undefined,
      Dimensions: js.UndefOr[Dimensions] = js.undefined,
      AlarmDescription: js.UndefOr[AlarmDescription] = js.undefined,
      AlarmConfigurationUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
      EvaluationPeriods: js.UndefOr[EvaluationPeriods] = js.undefined,
      StateUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
      AlarmArn: js.UndefOr[AlarmArn] = js.undefined,
      ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined,
      Period: js.UndefOr[Period] = js.undefined,
      AlarmActions: js.UndefOr[ResourceList] = js.undefined,
      Statistic: js.UndefOr[Statistic] = js.undefined,
      AlarmName: js.UndefOr[AlarmName] = js.undefined,
      Namespace: js.UndefOr[Namespace] = js.undefined,
      ActionsEnabled: js.UndefOr[ActionsEnabled] = js.undefined,
      StateReason: js.UndefOr[StateReason] = js.undefined,
      InsufficientDataActions: js.UndefOr[ResourceList] = js.undefined,
      Unit: js.UndefOr[StandardUnit] = js.undefined,
      OKActions: js.UndefOr[ResourceList] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined
    ): MetricAlarm = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Threshold" -> Threshold.map { x => x: js.Any }),
        ("StateReasonData" -> StateReasonData.map { x => x: js.Any }),
        ("StateValue" -> StateValue.map { x => x: js.Any }),
        ("Dimensions" -> Dimensions.map { x => x: js.Any }),
        ("AlarmDescription" -> AlarmDescription.map { x => x: js.Any }),
        ("AlarmConfigurationUpdatedTimestamp" -> AlarmConfigurationUpdatedTimestamp.map { x => x: js.Any }),
        ("EvaluationPeriods" -> EvaluationPeriods.map { x => x: js.Any }),
        ("StateUpdatedTimestamp" -> StateUpdatedTimestamp.map { x => x: js.Any }),
        ("AlarmArn" -> AlarmArn.map { x => x: js.Any }),
        ("ComparisonOperator" -> ComparisonOperator.map { x => x: js.Any }),
        ("Period" -> Period.map { x => x: js.Any }),
        ("AlarmActions" -> AlarmActions.map { x => x: js.Any }),
        ("Statistic" -> Statistic.map { x => x: js.Any }),
        ("AlarmName" -> AlarmName.map { x => x: js.Any }),
        ("Namespace" -> Namespace.map { x => x: js.Any }),
        ("ActionsEnabled" -> ActionsEnabled.map { x => x: js.Any }),
        ("StateReason" -> StateReason.map { x => x: js.Any }),
        ("InsufficientDataActions" -> InsufficientDataActions.map { x => x: js.Any }),
        ("Unit" -> Unit.map { x => x: js.Any }),
        ("OKActions" -> OKActions.map { x => x: js.Any }),
        ("MetricName" -> MetricName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricAlarm]
    }
  }

  /**
   * <p> The <code>MetricDatum</code> data type encapsulates the information sent with <a>PutMetricData</a> to either create a new metric or add new values to be aggregated into an existing metric. </p>
   */
  @js.native
  trait MetricDatum extends js.Object {
    var StatisticValues: StatisticSet
    var Dimensions: Dimensions
    var Value: DatapointValue
    var Timestamp: Timestamp
    var Unit: StandardUnit
    var MetricName: MetricName
  }

  object MetricDatum {
    def apply(
      StatisticValues: js.UndefOr[StatisticSet] = js.undefined,
      Dimensions: js.UndefOr[Dimensions] = js.undefined,
      Value: js.UndefOr[DatapointValue] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined,
      Unit: js.UndefOr[StandardUnit] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined
    ): MetricDatum = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatisticValues" -> StatisticValues.map { x => x: js.Any }),
        ("Dimensions" -> Dimensions.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any }),
        ("Timestamp" -> Timestamp.map { x => x: js.Any }),
        ("Unit" -> Unit.map { x => x: js.Any }),
        ("MetricName" -> MetricName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MetricDatum]
    }
  }

  /**
   * <p> An input parameter that is mandatory for processing the request is not supplied. </p>
   */
  @js.native
  trait MissingRequiredParameterExceptionException extends js.Object {
    var message: AwsQueryErrorMessage
  }

  @js.native
  trait PutMetricAlarmInput extends js.Object {
    var Threshold: Threshold
    var Dimensions: Dimensions
    var AlarmDescription: AlarmDescription
    var EvaluationPeriods: EvaluationPeriods
    var ComparisonOperator: ComparisonOperator
    var Period: Period
    var AlarmActions: ResourceList
    var Statistic: Statistic
    var AlarmName: AlarmName
    var Namespace: Namespace
    var ActionsEnabled: ActionsEnabled
    var InsufficientDataActions: ResourceList
    var Unit: StandardUnit
    var OKActions: ResourceList
    var MetricName: MetricName
  }

  object PutMetricAlarmInput {
    def apply(
      Threshold: js.UndefOr[Threshold] = js.undefined,
      Dimensions: js.UndefOr[Dimensions] = js.undefined,
      AlarmDescription: js.UndefOr[AlarmDescription] = js.undefined,
      EvaluationPeriods: js.UndefOr[EvaluationPeriods] = js.undefined,
      ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined,
      Period: js.UndefOr[Period] = js.undefined,
      AlarmActions: js.UndefOr[ResourceList] = js.undefined,
      Statistic: js.UndefOr[Statistic] = js.undefined,
      AlarmName: js.UndefOr[AlarmName] = js.undefined,
      Namespace: js.UndefOr[Namespace] = js.undefined,
      ActionsEnabled: js.UndefOr[ActionsEnabled] = js.undefined,
      InsufficientDataActions: js.UndefOr[ResourceList] = js.undefined,
      Unit: js.UndefOr[StandardUnit] = js.undefined,
      OKActions: js.UndefOr[ResourceList] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined
    ): PutMetricAlarmInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Threshold" -> Threshold.map { x => x: js.Any }),
        ("Dimensions" -> Dimensions.map { x => x: js.Any }),
        ("AlarmDescription" -> AlarmDescription.map { x => x: js.Any }),
        ("EvaluationPeriods" -> EvaluationPeriods.map { x => x: js.Any }),
        ("ComparisonOperator" -> ComparisonOperator.map { x => x: js.Any }),
        ("Period" -> Period.map { x => x: js.Any }),
        ("AlarmActions" -> AlarmActions.map { x => x: js.Any }),
        ("Statistic" -> Statistic.map { x => x: js.Any }),
        ("AlarmName" -> AlarmName.map { x => x: js.Any }),
        ("Namespace" -> Namespace.map { x => x: js.Any }),
        ("ActionsEnabled" -> ActionsEnabled.map { x => x: js.Any }),
        ("InsufficientDataActions" -> InsufficientDataActions.map { x => x: js.Any }),
        ("Unit" -> Unit.map { x => x: js.Any }),
        ("OKActions" -> OKActions.map { x => x: js.Any }),
        ("MetricName" -> MetricName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutMetricAlarmInput]
    }
  }

  @js.native
  trait PutMetricDataInput extends js.Object {
    var Namespace: Namespace
    var MetricData: MetricData
  }

  object PutMetricDataInput {
    def apply(
      Namespace: js.UndefOr[Namespace] = js.undefined,
      MetricData: js.UndefOr[MetricData] = js.undefined
    ): PutMetricDataInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Namespace" -> Namespace.map { x => x: js.Any }),
        ("MetricData" -> MetricData.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutMetricDataInput]
    }
  }

  /**
   * <p> The named resource does not exist. </p>
   */
  @js.native
  trait ResourceNotFoundException extends js.Object {
    var message: ErrorMessage
  }

  @js.native
  trait SetAlarmStateInput extends js.Object {
    var AlarmName: AlarmName
    var StateValue: StateValue
    var StateReason: StateReason
    var StateReasonData: StateReasonData
  }

  object SetAlarmStateInput {
    def apply(
      AlarmName: js.UndefOr[AlarmName] = js.undefined,
      StateValue: js.UndefOr[StateValue] = js.undefined,
      StateReason: js.UndefOr[StateReason] = js.undefined,
      StateReasonData: js.UndefOr[StateReasonData] = js.undefined
    ): SetAlarmStateInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AlarmName" -> AlarmName.map { x => x: js.Any }),
        ("StateValue" -> StateValue.map { x => x: js.Any }),
        ("StateReason" -> StateReason.map { x => x: js.Any }),
        ("StateReasonData" -> StateReasonData.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    val `INSUFFICIENT_DATA` = "INSUFFICIENT_DATA"

    val values = IndexedSeq(OK, ALARM, `INSUFFICIENT_DATA`)
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
   * <p> The <code>StatisticSet</code> data type describes the <code>StatisticValues</code> component of <a>MetricDatum</a>, and represents a set of statistics that describes a specific metric. </p>
   */
  @js.native
  trait StatisticSet extends js.Object {
    var SampleCount: DatapointValue
    var Sum: DatapointValue
    var Minimum: DatapointValue
    var Maximum: DatapointValue
  }

  object StatisticSet {
    def apply(
      SampleCount: js.UndefOr[DatapointValue] = js.undefined,
      Sum: js.UndefOr[DatapointValue] = js.undefined,
      Minimum: js.UndefOr[DatapointValue] = js.undefined,
      Maximum: js.UndefOr[DatapointValue] = js.undefined
    ): StatisticSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SampleCount" -> SampleCount.map { x => x: js.Any }),
        ("Sum" -> Sum.map { x => x: js.Any }),
        ("Minimum" -> Minimum.map { x => x: js.Any }),
        ("Maximum" -> Maximum.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StatisticSet]
    }
  }
}
