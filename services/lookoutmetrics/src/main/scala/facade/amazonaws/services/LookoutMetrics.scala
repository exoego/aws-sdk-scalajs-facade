package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object lookoutmetrics {
  type AlertDescription = String
  type AlertName = String
  type AlertSummaryList = js.Array[AlertSummary]
  type AnomalyDetectionTaskStatusMessage = String
  type AnomalyDetectorDescription = String
  type AnomalyDetectorName = String
  type AnomalyDetectorSummaryList = js.Array[AnomalyDetectorSummary]
  type AnomalyGroupSummaryList = js.Array[AnomalyGroupSummary]
  type Arn = String
  type Charset = String
  type ColumnName = String
  type DataItem = String
  type DatabaseHost = String
  type DatabasePort = Int
  type DateTimeFormat = String
  type Delimiter = String
  type DimensionContributionList = js.Array[DimensionContribution]
  type DimensionList = js.Array[ColumnName]
  type DimensionNameValueList = js.Array[DimensionNameValue]
  type DimensionValue = String
  type DimensionValueContributionList = js.Array[DimensionValueContribution]
  type ErrorMessage = String
  type ExecutionList = js.Array[ExecutionStatus]
  type FlowName = String
  type HeaderList = js.Array[ColumnName]
  type HeaderValue = String
  type HeaderValueList = js.Array[HeaderValue]
  type HistoricalDataPath = String
  type HistoricalDataPathList = js.Array[HistoricalDataPath]
  type ItemizedMetricStatsList = js.Array[ItemizedMetricStats]
  type KmsKeyArn = String
  type MaxResults = Int
  type MetricLevelImpactList = js.Array[MetricLevelImpact]
  type MetricList = js.Array[Metric]
  type MetricName = String
  type MetricSetDescription = String
  type MetricSetName = String
  type MetricSetSummaryList = js.Array[MetricSetSummary]
  type MetricValue = Double
  type MetricValueList = js.Array[MetricValue]
  type Namespace = String
  type NextToken = String
  type Offset = Int
  type PoirotSecretManagerArn = String
  type QuoteSymbol = String
  type RDSDatabaseIdentifier = String
  type RDSDatabaseName = String
  type RedshiftClusterIdentifier = String
  type RedshiftDatabaseName = String
  type SampleRow = js.Array[DataItem]
  type SampleRows = js.Array[SampleRow]
  type Score = Double
  type SecurityGroupId = String
  type SecurityGroupIdList = js.Array[SecurityGroupId]
  type SensitivityThreshold = Int
  type SubnetId = String
  type SubnetIdList = js.Array[SubnetId]
  type TableName = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TemplatedPath = String
  type TemplatedPathList = js.Array[TemplatedPath]
  type TimeSeriesFeedbackList = js.Array[TimeSeriesFeedback]
  type TimeSeriesId = String
  type TimeSeriesList = js.Array[TimeSeries]
  type Timestamp = js.Date
  type TimestampList = js.Array[TimestampString]
  type TimestampString = String
  type Timezone = String
  type UUID = String

  final class LookoutMetricsOps(private val service: LookoutMetrics) extends AnyVal {

    @inline def activateAnomalyDetectorFuture(params: ActivateAnomalyDetectorRequest): Future[ActivateAnomalyDetectorResponse] = service.activateAnomalyDetector(params).promise().toFuture
    @inline def backTestAnomalyDetectorFuture(params: BackTestAnomalyDetectorRequest): Future[BackTestAnomalyDetectorResponse] = service.backTestAnomalyDetector(params).promise().toFuture
    @inline def createAlertFuture(params: CreateAlertRequest): Future[CreateAlertResponse] = service.createAlert(params).promise().toFuture
    @inline def createAnomalyDetectorFuture(params: CreateAnomalyDetectorRequest): Future[CreateAnomalyDetectorResponse] = service.createAnomalyDetector(params).promise().toFuture
    @inline def createMetricSetFuture(params: CreateMetricSetRequest): Future[CreateMetricSetResponse] = service.createMetricSet(params).promise().toFuture
    @inline def deleteAlertFuture(params: DeleteAlertRequest): Future[DeleteAlertResponse] = service.deleteAlert(params).promise().toFuture
    @inline def deleteAnomalyDetectorFuture(params: DeleteAnomalyDetectorRequest): Future[DeleteAnomalyDetectorResponse] = service.deleteAnomalyDetector(params).promise().toFuture
    @inline def describeAlertFuture(params: DescribeAlertRequest): Future[DescribeAlertResponse] = service.describeAlert(params).promise().toFuture
    @inline def describeAnomalyDetectionExecutionsFuture(params: DescribeAnomalyDetectionExecutionsRequest): Future[DescribeAnomalyDetectionExecutionsResponse] = service.describeAnomalyDetectionExecutions(params).promise().toFuture
    @inline def describeAnomalyDetectorFuture(params: DescribeAnomalyDetectorRequest): Future[DescribeAnomalyDetectorResponse] = service.describeAnomalyDetector(params).promise().toFuture
    @inline def describeMetricSetFuture(params: DescribeMetricSetRequest): Future[DescribeMetricSetResponse] = service.describeMetricSet(params).promise().toFuture
    @inline def getAnomalyGroupFuture(params: GetAnomalyGroupRequest): Future[GetAnomalyGroupResponse] = service.getAnomalyGroup(params).promise().toFuture
    @inline def getFeedbackFuture(params: GetFeedbackRequest): Future[GetFeedbackResponse] = service.getFeedback(params).promise().toFuture
    @inline def getSampleDataFuture(params: GetSampleDataRequest): Future[GetSampleDataResponse] = service.getSampleData(params).promise().toFuture
    @inline def listAlertsFuture(params: ListAlertsRequest): Future[ListAlertsResponse] = service.listAlerts(params).promise().toFuture
    @inline def listAnomalyDetectorsFuture(params: ListAnomalyDetectorsRequest): Future[ListAnomalyDetectorsResponse] = service.listAnomalyDetectors(params).promise().toFuture
    @inline def listAnomalyGroupSummariesFuture(params: ListAnomalyGroupSummariesRequest): Future[ListAnomalyGroupSummariesResponse] = service.listAnomalyGroupSummaries(params).promise().toFuture
    @inline def listAnomalyGroupTimeSeriesFuture(params: ListAnomalyGroupTimeSeriesRequest): Future[ListAnomalyGroupTimeSeriesResponse] = service.listAnomalyGroupTimeSeries(params).promise().toFuture
    @inline def listMetricSetsFuture(params: ListMetricSetsRequest): Future[ListMetricSetsResponse] = service.listMetricSets(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putFeedbackFuture(params: PutFeedbackRequest): Future[PutFeedbackResponse] = service.putFeedback(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateAnomalyDetectorFuture(params: UpdateAnomalyDetectorRequest): Future[UpdateAnomalyDetectorResponse] = service.updateAnomalyDetector(params).promise().toFuture
    @inline def updateMetricSetFuture(params: UpdateMetricSetRequest): Future[UpdateMetricSetResponse] = service.updateMetricSet(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/lookoutmetrics", JSImport.Namespace, "AWS.LookoutMetrics")
  class LookoutMetrics() extends js.Object {
    def this(config: AWSConfig) = this()

    def activateAnomalyDetector(params: ActivateAnomalyDetectorRequest): Request[ActivateAnomalyDetectorResponse] = js.native
    def backTestAnomalyDetector(params: BackTestAnomalyDetectorRequest): Request[BackTestAnomalyDetectorResponse] = js.native
    def createAlert(params: CreateAlertRequest): Request[CreateAlertResponse] = js.native
    def createAnomalyDetector(params: CreateAnomalyDetectorRequest): Request[CreateAnomalyDetectorResponse] = js.native
    def createMetricSet(params: CreateMetricSetRequest): Request[CreateMetricSetResponse] = js.native
    def deleteAlert(params: DeleteAlertRequest): Request[DeleteAlertResponse] = js.native
    def deleteAnomalyDetector(params: DeleteAnomalyDetectorRequest): Request[DeleteAnomalyDetectorResponse] = js.native
    def describeAlert(params: DescribeAlertRequest): Request[DescribeAlertResponse] = js.native
    def describeAnomalyDetectionExecutions(params: DescribeAnomalyDetectionExecutionsRequest): Request[DescribeAnomalyDetectionExecutionsResponse] = js.native
    def describeAnomalyDetector(params: DescribeAnomalyDetectorRequest): Request[DescribeAnomalyDetectorResponse] = js.native
    def describeMetricSet(params: DescribeMetricSetRequest): Request[DescribeMetricSetResponse] = js.native
    def getAnomalyGroup(params: GetAnomalyGroupRequest): Request[GetAnomalyGroupResponse] = js.native
    def getFeedback(params: GetFeedbackRequest): Request[GetFeedbackResponse] = js.native
    def getSampleData(params: GetSampleDataRequest): Request[GetSampleDataResponse] = js.native
    def listAlerts(params: ListAlertsRequest): Request[ListAlertsResponse] = js.native
    def listAnomalyDetectors(params: ListAnomalyDetectorsRequest): Request[ListAnomalyDetectorsResponse] = js.native
    def listAnomalyGroupSummaries(params: ListAnomalyGroupSummariesRequest): Request[ListAnomalyGroupSummariesResponse] = js.native
    def listAnomalyGroupTimeSeries(params: ListAnomalyGroupTimeSeriesRequest): Request[ListAnomalyGroupTimeSeriesResponse] = js.native
    def listMetricSets(params: ListMetricSetsRequest): Request[ListMetricSetsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putFeedback(params: PutFeedbackRequest): Request[PutFeedbackResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateAnomalyDetector(params: UpdateAnomalyDetectorRequest): Request[UpdateAnomalyDetectorResponse] = js.native
    def updateMetricSet(params: UpdateMetricSetRequest): Request[UpdateMetricSetResponse] = js.native
  }
  object LookoutMetrics {
    @inline implicit def toOps(service: LookoutMetrics): LookoutMetricsOps = {
      new LookoutMetricsOps(service)
    }
  }

  /** A configuration that specifies the action to perform when anomalies are detected.
    */
  @js.native
  trait Action extends js.Object {
    var LambdaConfiguration: js.UndefOr[LambdaConfiguration]
    var SNSConfiguration: js.UndefOr[SNSConfiguration]
  }

  object Action {
    @inline
    def apply(
        LambdaConfiguration: js.UndefOr[LambdaConfiguration] = js.undefined,
        SNSConfiguration: js.UndefOr[SNSConfiguration] = js.undefined
    ): Action = {
      val __obj = js.Dynamic.literal()
      LambdaConfiguration.foreach(__v => __obj.updateDynamic("LambdaConfiguration")(__v.asInstanceOf[js.Any]))
      SNSConfiguration.foreach(__v => __obj.updateDynamic("SNSConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Action]
    }
  }

  @js.native
  trait ActivateAnomalyDetectorRequest extends js.Object {
    var AnomalyDetectorArn: Arn
  }

  object ActivateAnomalyDetectorRequest {
    @inline
    def apply(
        AnomalyDetectorArn: Arn
    ): ActivateAnomalyDetectorRequest = {
      val __obj = js.Dynamic.literal(
        "AnomalyDetectorArn" -> AnomalyDetectorArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ActivateAnomalyDetectorRequest]
    }
  }

  @js.native
  trait ActivateAnomalyDetectorResponse extends js.Object

  object ActivateAnomalyDetectorResponse {
    @inline
    def apply(): ActivateAnomalyDetectorResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivateAnomalyDetectorResponse]
    }
  }

  /** A configuration for Amazon SNS-integrated notifications.
    */
  @js.native
  trait Alert extends js.Object {
    var Action: js.UndefOr[Action]
    var AlertArn: js.UndefOr[Arn]
    var AlertDescription: js.UndefOr[AlertDescription]
    var AlertName: js.UndefOr[AlertName]
    var AlertSensitivityThreshold: js.UndefOr[SensitivityThreshold]
    var AlertStatus: js.UndefOr[AlertStatus]
    var AlertType: js.UndefOr[AlertType]
    var AnomalyDetectorArn: js.UndefOr[Arn]
    var CreationTime: js.UndefOr[Timestamp]
    var LastModificationTime: js.UndefOr[Timestamp]
  }

  object Alert {
    @inline
    def apply(
        Action: js.UndefOr[Action] = js.undefined,
        AlertArn: js.UndefOr[Arn] = js.undefined,
        AlertDescription: js.UndefOr[AlertDescription] = js.undefined,
        AlertName: js.UndefOr[AlertName] = js.undefined,
        AlertSensitivityThreshold: js.UndefOr[SensitivityThreshold] = js.undefined,
        AlertStatus: js.UndefOr[AlertStatus] = js.undefined,
        AlertType: js.UndefOr[AlertType] = js.undefined,
        AnomalyDetectorArn: js.UndefOr[Arn] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined
    ): Alert = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      AlertArn.foreach(__v => __obj.updateDynamic("AlertArn")(__v.asInstanceOf[js.Any]))
      AlertDescription.foreach(__v => __obj.updateDynamic("AlertDescription")(__v.asInstanceOf[js.Any]))
      AlertName.foreach(__v => __obj.updateDynamic("AlertName")(__v.asInstanceOf[js.Any]))
      AlertSensitivityThreshold.foreach(__v => __obj.updateDynamic("AlertSensitivityThreshold")(__v.asInstanceOf[js.Any]))
      AlertStatus.foreach(__v => __obj.updateDynamic("AlertStatus")(__v.asInstanceOf[js.Any]))
      AlertType.foreach(__v => __obj.updateDynamic("AlertType")(__v.asInstanceOf[js.Any]))
      AnomalyDetectorArn.foreach(__v => __obj.updateDynamic("AnomalyDetectorArn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Alert]
    }
  }

  /** Provides a summary of an alert's configuration.
    */
  @js.native
  trait AlertSummary extends js.Object {
    var AlertArn: js.UndefOr[Arn]
    var AlertName: js.UndefOr[AlertName]
    var AlertSensitivityThreshold: js.UndefOr[SensitivityThreshold]
    var AlertStatus: js.UndefOr[AlertStatus]
    var AlertType: js.UndefOr[AlertType]
    var AnomalyDetectorArn: js.UndefOr[Arn]
    var CreationTime: js.UndefOr[Timestamp]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Tags: js.UndefOr[TagMap]
  }

  object AlertSummary {
    @inline
    def apply(
        AlertArn: js.UndefOr[Arn] = js.undefined,
        AlertName: js.UndefOr[AlertName] = js.undefined,
        AlertSensitivityThreshold: js.UndefOr[SensitivityThreshold] = js.undefined,
        AlertStatus: js.UndefOr[AlertStatus] = js.undefined,
        AlertType: js.UndefOr[AlertType] = js.undefined,
        AnomalyDetectorArn: js.UndefOr[Arn] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): AlertSummary = {
      val __obj = js.Dynamic.literal()
      AlertArn.foreach(__v => __obj.updateDynamic("AlertArn")(__v.asInstanceOf[js.Any]))
      AlertName.foreach(__v => __obj.updateDynamic("AlertName")(__v.asInstanceOf[js.Any]))
      AlertSensitivityThreshold.foreach(__v => __obj.updateDynamic("AlertSensitivityThreshold")(__v.asInstanceOf[js.Any]))
      AlertStatus.foreach(__v => __obj.updateDynamic("AlertStatus")(__v.asInstanceOf[js.Any]))
      AlertType.foreach(__v => __obj.updateDynamic("AlertType")(__v.asInstanceOf[js.Any]))
      AnomalyDetectorArn.foreach(__v => __obj.updateDynamic("AnomalyDetectorArn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlertSummary]
    }
  }

  /** Contains information about a detector's configuration.
    */
  @js.native
  trait AnomalyDetectorConfig extends js.Object {
    var AnomalyDetectorFrequency: js.UndefOr[Frequency]
  }

  object AnomalyDetectorConfig {
    @inline
    def apply(
        AnomalyDetectorFrequency: js.UndefOr[Frequency] = js.undefined
    ): AnomalyDetectorConfig = {
      val __obj = js.Dynamic.literal()
      AnomalyDetectorFrequency.foreach(__v => __obj.updateDynamic("AnomalyDetectorFrequency")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnomalyDetectorConfig]
    }
  }

  /** Contains information about a detector's configuration.
    */
  @js.native
  trait AnomalyDetectorConfigSummary extends js.Object {
    var AnomalyDetectorFrequency: js.UndefOr[Frequency]
  }

  object AnomalyDetectorConfigSummary {
    @inline
    def apply(
        AnomalyDetectorFrequency: js.UndefOr[Frequency] = js.undefined
    ): AnomalyDetectorConfigSummary = {
      val __obj = js.Dynamic.literal()
      AnomalyDetectorFrequency.foreach(__v => __obj.updateDynamic("AnomalyDetectorFrequency")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnomalyDetectorConfigSummary]
    }
  }

  /** Contains information about an an anomaly detector.
    */
  @js.native
  trait AnomalyDetectorSummary extends js.Object {
    var AnomalyDetectorArn: js.UndefOr[Arn]
    var AnomalyDetectorDescription: js.UndefOr[AnomalyDetectorDescription]
    var AnomalyDetectorName: js.UndefOr[AnomalyDetectorName]
    var CreationTime: js.UndefOr[Timestamp]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Status: js.UndefOr[AnomalyDetectorStatus]
    var Tags: js.UndefOr[TagMap]
  }

  object AnomalyDetectorSummary {
    @inline
    def apply(
        AnomalyDetectorArn: js.UndefOr[Arn] = js.undefined,
        AnomalyDetectorDescription: js.UndefOr[AnomalyDetectorDescription] = js.undefined,
        AnomalyDetectorName: js.UndefOr[AnomalyDetectorName] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[AnomalyDetectorStatus] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): AnomalyDetectorSummary = {
      val __obj = js.Dynamic.literal()
      AnomalyDetectorArn.foreach(__v => __obj.updateDynamic("AnomalyDetectorArn")(__v.asInstanceOf[js.Any]))
      AnomalyDetectorDescription.foreach(__v => __obj.updateDynamic("AnomalyDetectorDescription")(__v.asInstanceOf[js.Any]))
      AnomalyDetectorName.foreach(__v => __obj.updateDynamic("AnomalyDetectorName")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnomalyDetectorSummary]
    }
  }

  /** A group of anomalous metrics
    */
  @js.native
  trait AnomalyGroup extends js.Object {
    var AnomalyGroupId: js.UndefOr[UUID]
    var AnomalyGroupScore: js.UndefOr[Score]
    var EndTime: js.UndefOr[TimestampString]
    var MetricLevelImpactList: js.UndefOr[MetricLevelImpactList]
    var PrimaryMetricName: js.UndefOr[MetricName]
    var StartTime: js.UndefOr[TimestampString]
  }

  object AnomalyGroup {
    @inline
    def apply(
        AnomalyGroupId: js.UndefOr[UUID] = js.undefined,
        AnomalyGroupScore: js.UndefOr[Score] = js.undefined,
        EndTime: js.UndefOr[TimestampString] = js.undefined,
        MetricLevelImpactList: js.UndefOr[MetricLevelImpactList] = js.undefined,
        PrimaryMetricName: js.UndefOr[MetricName] = js.undefined,
        StartTime: js.UndefOr[TimestampString] = js.undefined
    ): AnomalyGroup = {
      val __obj = js.Dynamic.literal()
      AnomalyGroupId.foreach(__v => __obj.updateDynamic("AnomalyGroupId")(__v.asInstanceOf[js.Any]))
      AnomalyGroupScore.foreach(__v => __obj.updateDynamic("AnomalyGroupScore")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      MetricLevelImpactList.foreach(__v => __obj.updateDynamic("MetricLevelImpactList")(__v.asInstanceOf[js.Any]))
      PrimaryMetricName.foreach(__v => __obj.updateDynamic("PrimaryMetricName")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnomalyGroup]
    }
  }

  /** Aggregated statistics for a group of anomalous metrics.
    */
  @js.native
  trait AnomalyGroupStatistics extends js.Object {
    var EvaluationStartDate: js.UndefOr[TimestampString]
    var ItemizedMetricStatsList: js.UndefOr[ItemizedMetricStatsList]
    var TotalCount: js.UndefOr[Int]
  }

  object AnomalyGroupStatistics {
    @inline
    def apply(
        EvaluationStartDate: js.UndefOr[TimestampString] = js.undefined,
        ItemizedMetricStatsList: js.UndefOr[ItemizedMetricStatsList] = js.undefined,
        TotalCount: js.UndefOr[Int] = js.undefined
    ): AnomalyGroupStatistics = {
      val __obj = js.Dynamic.literal()
      EvaluationStartDate.foreach(__v => __obj.updateDynamic("EvaluationStartDate")(__v.asInstanceOf[js.Any]))
      ItemizedMetricStatsList.foreach(__v => __obj.updateDynamic("ItemizedMetricStatsList")(__v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.updateDynamic("TotalCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnomalyGroupStatistics]
    }
  }

  /** Details about a group of anomalous metrics.
    */
  @js.native
  trait AnomalyGroupSummary extends js.Object {
    var AnomalyGroupId: js.UndefOr[UUID]
    var AnomalyGroupScore: js.UndefOr[Score]
    var EndTime: js.UndefOr[TimestampString]
    var PrimaryMetricName: js.UndefOr[MetricName]
    var StartTime: js.UndefOr[TimestampString]
  }

  object AnomalyGroupSummary {
    @inline
    def apply(
        AnomalyGroupId: js.UndefOr[UUID] = js.undefined,
        AnomalyGroupScore: js.UndefOr[Score] = js.undefined,
        EndTime: js.UndefOr[TimestampString] = js.undefined,
        PrimaryMetricName: js.UndefOr[MetricName] = js.undefined,
        StartTime: js.UndefOr[TimestampString] = js.undefined
    ): AnomalyGroupSummary = {
      val __obj = js.Dynamic.literal()
      AnomalyGroupId.foreach(__v => __obj.updateDynamic("AnomalyGroupId")(__v.asInstanceOf[js.Any]))
      AnomalyGroupScore.foreach(__v => __obj.updateDynamic("AnomalyGroupScore")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      PrimaryMetricName.foreach(__v => __obj.updateDynamic("PrimaryMetricName")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnomalyGroupSummary]
    }
  }

  /** An anomalous metric in an anomaly group.
    */
  @js.native
  trait AnomalyGroupTimeSeries extends js.Object {
    var AnomalyGroupId: UUID
    var TimeSeriesId: js.UndefOr[TimeSeriesId]
  }

  object AnomalyGroupTimeSeries {
    @inline
    def apply(
        AnomalyGroupId: UUID,
        TimeSeriesId: js.UndefOr[TimeSeriesId] = js.undefined
    ): AnomalyGroupTimeSeries = {
      val __obj = js.Dynamic.literal(
        "AnomalyGroupId" -> AnomalyGroupId.asInstanceOf[js.Any]
      )

      TimeSeriesId.foreach(__v => __obj.updateDynamic("TimeSeriesId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnomalyGroupTimeSeries]
    }
  }

  /** Feedback for an anomalous metric.
    */
  @js.native
  trait AnomalyGroupTimeSeriesFeedback extends js.Object {
    var AnomalyGroupId: UUID
    var IsAnomaly: Boolean
    var TimeSeriesId: TimeSeriesId
  }

  object AnomalyGroupTimeSeriesFeedback {
    @inline
    def apply(
        AnomalyGroupId: UUID,
        IsAnomaly: Boolean,
        TimeSeriesId: TimeSeriesId
    ): AnomalyGroupTimeSeriesFeedback = {
      val __obj = js.Dynamic.literal(
        "AnomalyGroupId" -> AnomalyGroupId.asInstanceOf[js.Any],
        "IsAnomaly" -> IsAnomaly.asInstanceOf[js.Any],
        "TimeSeriesId" -> TimeSeriesId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AnomalyGroupTimeSeriesFeedback]
    }
  }

  /** Details about an Amazon AppFlow flow datasource.
    */
  @js.native
  trait AppFlowConfig extends js.Object {
    var FlowName: FlowName
    var RoleArn: Arn
  }

  object AppFlowConfig {
    @inline
    def apply(
        FlowName: FlowName,
        RoleArn: Arn
    ): AppFlowConfig = {
      val __obj = js.Dynamic.literal(
        "FlowName" -> FlowName.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AppFlowConfig]
    }
  }

  @js.native
  trait BackTestAnomalyDetectorRequest extends js.Object {
    var AnomalyDetectorArn: Arn
  }

  object BackTestAnomalyDetectorRequest {
    @inline
    def apply(
        AnomalyDetectorArn: Arn
    ): BackTestAnomalyDetectorRequest = {
      val __obj = js.Dynamic.literal(
        "AnomalyDetectorArn" -> AnomalyDetectorArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BackTestAnomalyDetectorRequest]
    }
  }

  @js.native
  trait BackTestAnomalyDetectorResponse extends js.Object

  object BackTestAnomalyDetectorResponse {
    @inline
    def apply(): BackTestAnomalyDetectorResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackTestAnomalyDetectorResponse]
    }
  }

  /** Details about an Amazon CloudWatch datasource.
    */
  @js.native
  trait CloudWatchConfig extends js.Object {
    var RoleArn: Arn
  }

  object CloudWatchConfig {
    @inline
    def apply(
        RoleArn: Arn
    ): CloudWatchConfig = {
      val __obj = js.Dynamic.literal(
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CloudWatchConfig]
    }
  }

  /** Details about dimensions that contributed to an anomaly.
    */
  @js.native
  trait ContributionMatrix extends js.Object {
    var DimensionContributionList: js.UndefOr[DimensionContributionList]
  }

  object ContributionMatrix {
    @inline
    def apply(
        DimensionContributionList: js.UndefOr[DimensionContributionList] = js.undefined
    ): ContributionMatrix = {
      val __obj = js.Dynamic.literal()
      DimensionContributionList.foreach(__v => __obj.updateDynamic("DimensionContributionList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContributionMatrix]
    }
  }

  @js.native
  trait CreateAlertRequest extends js.Object {
    var Action: Action
    var AlertName: AlertName
    var AlertSensitivityThreshold: SensitivityThreshold
    var AnomalyDetectorArn: Arn
    var AlertDescription: js.UndefOr[AlertDescription]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateAlertRequest {
    @inline
    def apply(
        Action: Action,
        AlertName: AlertName,
        AlertSensitivityThreshold: SensitivityThreshold,
        AnomalyDetectorArn: Arn,
        AlertDescription: js.UndefOr[AlertDescription] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateAlertRequest = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "AlertName" -> AlertName.asInstanceOf[js.Any],
        "AlertSensitivityThreshold" -> AlertSensitivityThreshold.asInstanceOf[js.Any],
        "AnomalyDetectorArn" -> AnomalyDetectorArn.asInstanceOf[js.Any]
      )

      AlertDescription.foreach(__v => __obj.updateDynamic("AlertDescription")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAlertRequest]
    }
  }

  @js.native
  trait CreateAlertResponse extends js.Object {
    var AlertArn: js.UndefOr[Arn]
  }

  object CreateAlertResponse {
    @inline
    def apply(
        AlertArn: js.UndefOr[Arn] = js.undefined
    ): CreateAlertResponse = {
      val __obj = js.Dynamic.literal()
      AlertArn.foreach(__v => __obj.updateDynamic("AlertArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAlertResponse]
    }
  }

  @js.native
  trait CreateAnomalyDetectorRequest extends js.Object {
    var AnomalyDetectorConfig: AnomalyDetectorConfig
    var AnomalyDetectorName: AnomalyDetectorName
    var AnomalyDetectorDescription: js.UndefOr[AnomalyDetectorDescription]
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateAnomalyDetectorRequest {
    @inline
    def apply(
        AnomalyDetectorConfig: AnomalyDetectorConfig,
        AnomalyDetectorName: AnomalyDetectorName,
        AnomalyDetectorDescription: js.UndefOr[AnomalyDetectorDescription] = js.undefined,
        KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateAnomalyDetectorRequest = {
      val __obj = js.Dynamic.literal(
        "AnomalyDetectorConfig" -> AnomalyDetectorConfig.asInstanceOf[js.Any],
        "AnomalyDetectorName" -> AnomalyDetectorName.asInstanceOf[js.Any]
      )

      AnomalyDetectorDescription.foreach(__v => __obj.updateDynamic("AnomalyDetectorDescription")(__v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAnomalyDetectorRequest]
    }
  }

  @js.native
  trait CreateAnomalyDetectorResponse extends js.Object {
    var AnomalyDetectorArn: js.UndefOr[Arn]
  }

  object CreateAnomalyDetectorResponse {
    @inline
    def apply(
        AnomalyDetectorArn: js.UndefOr[Arn] = js.undefined
    ): CreateAnomalyDetectorResponse = {
      val __obj = js.Dynamic.literal()
      AnomalyDetectorArn.foreach(__v => __obj.updateDynamic("AnomalyDetectorArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAnomalyDetectorResponse]
    }
  }

  @js.native
  trait CreateMetricSetRequest extends js.Object {
    var AnomalyDetectorArn: Arn
    var MetricList: MetricList
    var MetricSetName: MetricSetName
    var MetricSource: MetricSource
    var DimensionList: js.UndefOr[DimensionList]
    var MetricSetDescription: js.UndefOr[MetricSetDescription]
    var MetricSetFrequency: js.UndefOr[Frequency]
    var Offset: js.UndefOr[Offset]
    var Tags: js.UndefOr[TagMap]
    var TimestampColumn: js.UndefOr[TimestampColumn]
    var Timezone: js.UndefOr[Timezone]
  }

  object CreateMetricSetRequest {
    @inline
    def apply(
        AnomalyDetectorArn: Arn,
        MetricList: MetricList,
        MetricSetName: MetricSetName,
        MetricSource: MetricSource,
        DimensionList: js.UndefOr[DimensionList] = js.undefined,
        MetricSetDescription: js.UndefOr[MetricSetDescription] = js.undefined,
        MetricSetFrequency: js.UndefOr[Frequency] = js.undefined,
        Offset: js.UndefOr[Offset] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        TimestampColumn: js.UndefOr[TimestampColumn] = js.undefined,
        Timezone: js.UndefOr[Timezone] = js.undefined
    ): CreateMetricSetRequest = {
      val __obj = js.Dynamic.literal(
        "AnomalyDetectorArn" -> AnomalyDetectorArn.asInstanceOf[js.Any],
        "MetricList" -> MetricList.asInstanceOf[js.Any],
        "MetricSetName" -> MetricSetName.asInstanceOf[js.Any],
        "MetricSource" -> MetricSource.asInstanceOf[js.Any]
      )

      DimensionList.foreach(__v => __obj.updateDynamic("DimensionList")(__v.asInstanceOf[js.Any]))
      MetricSetDescription.foreach(__v => __obj.updateDynamic("MetricSetDescription")(__v.asInstanceOf[js.Any]))
      MetricSetFrequency.foreach(__v => __obj.updateDynamic("MetricSetFrequency")(__v.asInstanceOf[js.Any]))
      Offset.foreach(__v => __obj.updateDynamic("Offset")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TimestampColumn.foreach(__v => __obj.updateDynamic("TimestampColumn")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMetricSetRequest]
    }
  }

  @js.native
  trait CreateMetricSetResponse extends js.Object {
    var MetricSetArn: js.UndefOr[Arn]
  }

  object CreateMetricSetResponse {
    @inline
    def apply(
        MetricSetArn: js.UndefOr[Arn] = js.undefined
    ): CreateMetricSetResponse = {
      val __obj = js.Dynamic.literal()
      MetricSetArn.foreach(__v => __obj.updateDynamic("MetricSetArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMetricSetResponse]
    }
  }

  /** Contains information about how a source CSV data file should be analyzed.
    */
  @js.native
  trait CsvFormatDescriptor extends js.Object {
    var Charset: js.UndefOr[Charset]
    var ContainsHeader: js.UndefOr[Boolean]
    var Delimiter: js.UndefOr[Delimiter]
    var FileCompression: js.UndefOr[CSVFileCompression]
    var HeaderList: js.UndefOr[HeaderList]
    var QuoteSymbol: js.UndefOr[QuoteSymbol]
  }

  object CsvFormatDescriptor {
    @inline
    def apply(
        Charset: js.UndefOr[Charset] = js.undefined,
        ContainsHeader: js.UndefOr[Boolean] = js.undefined,
        Delimiter: js.UndefOr[Delimiter] = js.undefined,
        FileCompression: js.UndefOr[CSVFileCompression] = js.undefined,
        HeaderList: js.UndefOr[HeaderList] = js.undefined,
        QuoteSymbol: js.UndefOr[QuoteSymbol] = js.undefined
    ): CsvFormatDescriptor = {
      val __obj = js.Dynamic.literal()
      Charset.foreach(__v => __obj.updateDynamic("Charset")(__v.asInstanceOf[js.Any]))
      ContainsHeader.foreach(__v => __obj.updateDynamic("ContainsHeader")(__v.asInstanceOf[js.Any]))
      Delimiter.foreach(__v => __obj.updateDynamic("Delimiter")(__v.asInstanceOf[js.Any]))
      FileCompression.foreach(__v => __obj.updateDynamic("FileCompression")(__v.asInstanceOf[js.Any]))
      HeaderList.foreach(__v => __obj.updateDynamic("HeaderList")(__v.asInstanceOf[js.Any]))
      QuoteSymbol.foreach(__v => __obj.updateDynamic("QuoteSymbol")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CsvFormatDescriptor]
    }
  }

  @js.native
  trait DeleteAlertRequest extends js.Object {
    var AlertArn: Arn
  }

  object DeleteAlertRequest {
    @inline
    def apply(
        AlertArn: Arn
    ): DeleteAlertRequest = {
      val __obj = js.Dynamic.literal(
        "AlertArn" -> AlertArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAlertRequest]
    }
  }

  @js.native
  trait DeleteAlertResponse extends js.Object

  object DeleteAlertResponse {
    @inline
    def apply(): DeleteAlertResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAlertResponse]
    }
  }

  @js.native
  trait DeleteAnomalyDetectorRequest extends js.Object {
    var AnomalyDetectorArn: Arn
  }

  object DeleteAnomalyDetectorRequest {
    @inline
    def apply(
        AnomalyDetectorArn: Arn
    ): DeleteAnomalyDetectorRequest = {
      val __obj = js.Dynamic.literal(
        "AnomalyDetectorArn" -> AnomalyDetectorArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAnomalyDetectorRequest]
    }
  }

  @js.native
  trait DeleteAnomalyDetectorResponse extends js.Object

  object DeleteAnomalyDetectorResponse {
    @inline
    def apply(): DeleteAnomalyDetectorResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAnomalyDetectorResponse]
    }
  }

  @js.native
  trait DescribeAlertRequest extends js.Object {
    var AlertArn: Arn
  }

  object DescribeAlertRequest {
    @inline
    def apply(
        AlertArn: Arn
    ): DescribeAlertRequest = {
      val __obj = js.Dynamic.literal(
        "AlertArn" -> AlertArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAlertRequest]
    }
  }

  @js.native
  trait DescribeAlertResponse extends js.Object {
    var Alert: js.UndefOr[Alert]
  }

  object DescribeAlertResponse {
    @inline
    def apply(
        Alert: js.UndefOr[Alert] = js.undefined
    ): DescribeAlertResponse = {
      val __obj = js.Dynamic.literal()
      Alert.foreach(__v => __obj.updateDynamic("Alert")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAlertResponse]
    }
  }

  @js.native
  trait DescribeAnomalyDetectionExecutionsRequest extends js.Object {
    var AnomalyDetectorArn: Arn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Timestamp: js.UndefOr[TimestampString]
  }

  object DescribeAnomalyDetectionExecutionsRequest {
    @inline
    def apply(
        AnomalyDetectorArn: Arn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Timestamp: js.UndefOr[TimestampString] = js.undefined
    ): DescribeAnomalyDetectionExecutionsRequest = {
      val __obj = js.Dynamic.literal(
        "AnomalyDetectorArn" -> AnomalyDetectorArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAnomalyDetectionExecutionsRequest]
    }
  }

  @js.native
  trait DescribeAnomalyDetectionExecutionsResponse extends js.Object {
    var ExecutionList: js.UndefOr[ExecutionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAnomalyDetectionExecutionsResponse {
    @inline
    def apply(
        ExecutionList: js.UndefOr[ExecutionList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAnomalyDetectionExecutionsResponse = {
      val __obj = js.Dynamic.literal()
      ExecutionList.foreach(__v => __obj.updateDynamic("ExecutionList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAnomalyDetectionExecutionsResponse]
    }
  }

  @js.native
  trait DescribeAnomalyDetectorRequest extends js.Object {
    var AnomalyDetectorArn: Arn
  }

  object DescribeAnomalyDetectorRequest {
    @inline
    def apply(
        AnomalyDetectorArn: Arn
    ): DescribeAnomalyDetectorRequest = {
      val __obj = js.Dynamic.literal(
        "AnomalyDetectorArn" -> AnomalyDetectorArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAnomalyDetectorRequest]
    }
  }

  @js.native
  trait DescribeAnomalyDetectorResponse extends js.Object {
    var AnomalyDetectorArn: js.UndefOr[Arn]
    var AnomalyDetectorConfig: js.UndefOr[AnomalyDetectorConfigSummary]
    var AnomalyDetectorDescription: js.UndefOr[AnomalyDetectorDescription]
    var AnomalyDetectorName: js.UndefOr[AnomalyDetectorName]
    var CreationTime: js.UndefOr[Timestamp]
    var FailureReason: js.UndefOr[ErrorMessage]
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Status: js.UndefOr[AnomalyDetectorStatus]
  }

  object DescribeAnomalyDetectorResponse {
    @inline
    def apply(
        AnomalyDetectorArn: js.UndefOr[Arn] = js.undefined,
        AnomalyDetectorConfig: js.UndefOr[AnomalyDetectorConfigSummary] = js.undefined,
        AnomalyDetectorDescription: js.UndefOr[AnomalyDetectorDescription] = js.undefined,
        AnomalyDetectorName: js.UndefOr[AnomalyDetectorName] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        FailureReason: js.UndefOr[ErrorMessage] = js.undefined,
        KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[AnomalyDetectorStatus] = js.undefined
    ): DescribeAnomalyDetectorResponse = {
      val __obj = js.Dynamic.literal()
      AnomalyDetectorArn.foreach(__v => __obj.updateDynamic("AnomalyDetectorArn")(__v.asInstanceOf[js.Any]))
      AnomalyDetectorConfig.foreach(__v => __obj.updateDynamic("AnomalyDetectorConfig")(__v.asInstanceOf[js.Any]))
      AnomalyDetectorDescription.foreach(__v => __obj.updateDynamic("AnomalyDetectorDescription")(__v.asInstanceOf[js.Any]))
      AnomalyDetectorName.foreach(__v => __obj.updateDynamic("AnomalyDetectorName")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAnomalyDetectorResponse]
    }
  }

  @js.native
  trait DescribeMetricSetRequest extends js.Object {
    var MetricSetArn: Arn
  }

  object DescribeMetricSetRequest {
    @inline
    def apply(
        MetricSetArn: Arn
    ): DescribeMetricSetRequest = {
      val __obj = js.Dynamic.literal(
        "MetricSetArn" -> MetricSetArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeMetricSetRequest]
    }
  }

  @js.native
  trait DescribeMetricSetResponse extends js.Object {
    var AnomalyDetectorArn: js.UndefOr[Arn]
    var CreationTime: js.UndefOr[Timestamp]
    var DimensionList: js.UndefOr[DimensionList]
    var LastModificationTime: js.UndefOr[Timestamp]
    var MetricList: js.UndefOr[MetricList]
    var MetricSetArn: js.UndefOr[Arn]
    var MetricSetDescription: js.UndefOr[MetricSetDescription]
    var MetricSetFrequency: js.UndefOr[Frequency]
    var MetricSetName: js.UndefOr[MetricSetName]
    var MetricSource: js.UndefOr[MetricSource]
    var Offset: js.UndefOr[Offset]
    var TimestampColumn: js.UndefOr[TimestampColumn]
    var Timezone: js.UndefOr[Timezone]
  }

  object DescribeMetricSetResponse {
    @inline
    def apply(
        AnomalyDetectorArn: js.UndefOr[Arn] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DimensionList: js.UndefOr[DimensionList] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        MetricList: js.UndefOr[MetricList] = js.undefined,
        MetricSetArn: js.UndefOr[Arn] = js.undefined,
        MetricSetDescription: js.UndefOr[MetricSetDescription] = js.undefined,
        MetricSetFrequency: js.UndefOr[Frequency] = js.undefined,
        MetricSetName: js.UndefOr[MetricSetName] = js.undefined,
        MetricSource: js.UndefOr[MetricSource] = js.undefined,
        Offset: js.UndefOr[Offset] = js.undefined,
        TimestampColumn: js.UndefOr[TimestampColumn] = js.undefined,
        Timezone: js.UndefOr[Timezone] = js.undefined
    ): DescribeMetricSetResponse = {
      val __obj = js.Dynamic.literal()
      AnomalyDetectorArn.foreach(__v => __obj.updateDynamic("AnomalyDetectorArn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DimensionList.foreach(__v => __obj.updateDynamic("DimensionList")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      MetricList.foreach(__v => __obj.updateDynamic("MetricList")(__v.asInstanceOf[js.Any]))
      MetricSetArn.foreach(__v => __obj.updateDynamic("MetricSetArn")(__v.asInstanceOf[js.Any]))
      MetricSetDescription.foreach(__v => __obj.updateDynamic("MetricSetDescription")(__v.asInstanceOf[js.Any]))
      MetricSetFrequency.foreach(__v => __obj.updateDynamic("MetricSetFrequency")(__v.asInstanceOf[js.Any]))
      MetricSetName.foreach(__v => __obj.updateDynamic("MetricSetName")(__v.asInstanceOf[js.Any]))
      MetricSource.foreach(__v => __obj.updateDynamic("MetricSource")(__v.asInstanceOf[js.Any]))
      Offset.foreach(__v => __obj.updateDynamic("Offset")(__v.asInstanceOf[js.Any]))
      TimestampColumn.foreach(__v => __obj.updateDynamic("TimestampColumn")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMetricSetResponse]
    }
  }

  /** Details about a dimension that contributed to an anomaly.
    */
  @js.native
  trait DimensionContribution extends js.Object {
    var DimensionName: js.UndefOr[ColumnName]
    var DimensionValueContributionList: js.UndefOr[DimensionValueContributionList]
  }

  object DimensionContribution {
    @inline
    def apply(
        DimensionName: js.UndefOr[ColumnName] = js.undefined,
        DimensionValueContributionList: js.UndefOr[DimensionValueContributionList] = js.undefined
    ): DimensionContribution = {
      val __obj = js.Dynamic.literal()
      DimensionName.foreach(__v => __obj.updateDynamic("DimensionName")(__v.asInstanceOf[js.Any]))
      DimensionValueContributionList.foreach(__v => __obj.updateDynamic("DimensionValueContributionList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DimensionContribution]
    }
  }

  /** A dimension name and value.
    */
  @js.native
  trait DimensionNameValue extends js.Object {
    var DimensionName: ColumnName
    var DimensionValue: DimensionValue
  }

  object DimensionNameValue {
    @inline
    def apply(
        DimensionName: ColumnName,
        DimensionValue: DimensionValue
    ): DimensionNameValue = {
      val __obj = js.Dynamic.literal(
        "DimensionName" -> DimensionName.asInstanceOf[js.Any],
        "DimensionValue" -> DimensionValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DimensionNameValue]
    }
  }

  /** The severity of a value of a dimension that contributed to an anomaly.
    */
  @js.native
  trait DimensionValueContribution extends js.Object {
    var ContributionScore: js.UndefOr[Score]
    var DimensionValue: js.UndefOr[DimensionValue]
  }

  object DimensionValueContribution {
    @inline
    def apply(
        ContributionScore: js.UndefOr[Score] = js.undefined,
        DimensionValue: js.UndefOr[DimensionValue] = js.undefined
    ): DimensionValueContribution = {
      val __obj = js.Dynamic.literal()
      ContributionScore.foreach(__v => __obj.updateDynamic("ContributionScore")(__v.asInstanceOf[js.Any]))
      DimensionValue.foreach(__v => __obj.updateDynamic("DimensionValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DimensionValueContribution]
    }
  }

  /** The status of an anomaly detector run.
    */
  @js.native
  trait ExecutionStatus extends js.Object {
    var FailureReason: js.UndefOr[AnomalyDetectionTaskStatusMessage]
    var Status: js.UndefOr[AnomalyDetectionTaskStatus]
    var Timestamp: js.UndefOr[TimestampString]
  }

  object ExecutionStatus {
    @inline
    def apply(
        FailureReason: js.UndefOr[AnomalyDetectionTaskStatusMessage] = js.undefined,
        Status: js.UndefOr[AnomalyDetectionTaskStatus] = js.undefined,
        Timestamp: js.UndefOr[TimestampString] = js.undefined
    ): ExecutionStatus = {
      val __obj = js.Dynamic.literal()
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionStatus]
    }
  }

  /** Contains information about a source file's formatting.
    */
  @js.native
  trait FileFormatDescriptor extends js.Object {
    var CsvFormatDescriptor: js.UndefOr[CsvFormatDescriptor]
    var JsonFormatDescriptor: js.UndefOr[JsonFormatDescriptor]
  }

  object FileFormatDescriptor {
    @inline
    def apply(
        CsvFormatDescriptor: js.UndefOr[CsvFormatDescriptor] = js.undefined,
        JsonFormatDescriptor: js.UndefOr[JsonFormatDescriptor] = js.undefined
    ): FileFormatDescriptor = {
      val __obj = js.Dynamic.literal()
      CsvFormatDescriptor.foreach(__v => __obj.updateDynamic("CsvFormatDescriptor")(__v.asInstanceOf[js.Any]))
      JsonFormatDescriptor.foreach(__v => __obj.updateDynamic("JsonFormatDescriptor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileFormatDescriptor]
    }
  }

  @js.native
  trait GetAnomalyGroupRequest extends js.Object {
    var AnomalyDetectorArn: Arn
    var AnomalyGroupId: UUID
  }

  object GetAnomalyGroupRequest {
    @inline
    def apply(
        AnomalyDetectorArn: Arn,
        AnomalyGroupId: UUID
    ): GetAnomalyGroupRequest = {
      val __obj = js.Dynamic.literal(
        "AnomalyDetectorArn" -> AnomalyDetectorArn.asInstanceOf[js.Any],
        "AnomalyGroupId" -> AnomalyGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAnomalyGroupRequest]
    }
  }

  @js.native
  trait GetAnomalyGroupResponse extends js.Object {
    var AnomalyGroup: js.UndefOr[AnomalyGroup]
  }

  object GetAnomalyGroupResponse {
    @inline
    def apply(
        AnomalyGroup: js.UndefOr[AnomalyGroup] = js.undefined
    ): GetAnomalyGroupResponse = {
      val __obj = js.Dynamic.literal()
      AnomalyGroup.foreach(__v => __obj.updateDynamic("AnomalyGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAnomalyGroupResponse]
    }
  }

  @js.native
  trait GetFeedbackRequest extends js.Object {
    var AnomalyDetectorArn: Arn
    var AnomalyGroupTimeSeriesFeedback: AnomalyGroupTimeSeries
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetFeedbackRequest {
    @inline
    def apply(
        AnomalyDetectorArn: Arn,
        AnomalyGroupTimeSeriesFeedback: AnomalyGroupTimeSeries,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetFeedbackRequest = {
      val __obj = js.Dynamic.literal(
        "AnomalyDetectorArn" -> AnomalyDetectorArn.asInstanceOf[js.Any],
        "AnomalyGroupTimeSeriesFeedback" -> AnomalyGroupTimeSeriesFeedback.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFeedbackRequest]
    }
  }

  @js.native
  trait GetFeedbackResponse extends js.Object {
    var AnomalyGroupTimeSeriesFeedback: js.UndefOr[TimeSeriesFeedbackList]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetFeedbackResponse {
    @inline
    def apply(
        AnomalyGroupTimeSeriesFeedback: js.UndefOr[TimeSeriesFeedbackList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetFeedbackResponse = {
      val __obj = js.Dynamic.literal()
      AnomalyGroupTimeSeriesFeedback.foreach(__v => __obj.updateDynamic("AnomalyGroupTimeSeriesFeedback")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFeedbackResponse]
    }
  }

  @js.native
  trait GetSampleDataRequest extends js.Object {
    var S3SourceConfig: js.UndefOr[SampleDataS3SourceConfig]
  }

  object GetSampleDataRequest {
    @inline
    def apply(
        S3SourceConfig: js.UndefOr[SampleDataS3SourceConfig] = js.undefined
    ): GetSampleDataRequest = {
      val __obj = js.Dynamic.literal()
      S3SourceConfig.foreach(__v => __obj.updateDynamic("S3SourceConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSampleDataRequest]
    }
  }

  @js.native
  trait GetSampleDataResponse extends js.Object {
    var HeaderValues: js.UndefOr[HeaderValueList]
    var SampleRows: js.UndefOr[SampleRows]
  }

  object GetSampleDataResponse {
    @inline
    def apply(
        HeaderValues: js.UndefOr[HeaderValueList] = js.undefined,
        SampleRows: js.UndefOr[SampleRows] = js.undefined
    ): GetSampleDataResponse = {
      val __obj = js.Dynamic.literal()
      HeaderValues.foreach(__v => __obj.updateDynamic("HeaderValues")(__v.asInstanceOf[js.Any]))
      SampleRows.foreach(__v => __obj.updateDynamic("SampleRows")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSampleDataResponse]
    }
  }

  /** Aggregated statistics about a measure affected by an anomaly.
    */
  @js.native
  trait ItemizedMetricStats extends js.Object {
    var MetricName: js.UndefOr[ColumnName]
    var OccurrenceCount: js.UndefOr[Int]
  }

  object ItemizedMetricStats {
    @inline
    def apply(
        MetricName: js.UndefOr[ColumnName] = js.undefined,
        OccurrenceCount: js.UndefOr[Int] = js.undefined
    ): ItemizedMetricStats = {
      val __obj = js.Dynamic.literal()
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      OccurrenceCount.foreach(__v => __obj.updateDynamic("OccurrenceCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ItemizedMetricStats]
    }
  }

  /** Contains information about how a source JSON data file should be analyzed.
    */
  @js.native
  trait JsonFormatDescriptor extends js.Object {
    var Charset: js.UndefOr[Charset]
    var FileCompression: js.UndefOr[JsonFileCompression]
  }

  object JsonFormatDescriptor {
    @inline
    def apply(
        Charset: js.UndefOr[Charset] = js.undefined,
        FileCompression: js.UndefOr[JsonFileCompression] = js.undefined
    ): JsonFormatDescriptor = {
      val __obj = js.Dynamic.literal()
      Charset.foreach(__v => __obj.updateDynamic("Charset")(__v.asInstanceOf[js.Any]))
      FileCompression.foreach(__v => __obj.updateDynamic("FileCompression")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JsonFormatDescriptor]
    }
  }

  /** Contains information about a Lambda configuration.
    */
  @js.native
  trait LambdaConfiguration extends js.Object {
    var LambdaArn: Arn
    var RoleArn: Arn
  }

  object LambdaConfiguration {
    @inline
    def apply(
        LambdaArn: Arn,
        RoleArn: Arn
    ): LambdaConfiguration = {
      val __obj = js.Dynamic.literal(
        "LambdaArn" -> LambdaArn.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LambdaConfiguration]
    }
  }

  @js.native
  trait ListAlertsRequest extends js.Object {
    var AnomalyDetectorArn: js.UndefOr[Arn]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAlertsRequest {
    @inline
    def apply(
        AnomalyDetectorArn: js.UndefOr[Arn] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAlertsRequest = {
      val __obj = js.Dynamic.literal()
      AnomalyDetectorArn.foreach(__v => __obj.updateDynamic("AnomalyDetectorArn")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAlertsRequest]
    }
  }

  @js.native
  trait ListAlertsResponse extends js.Object {
    var AlertSummaryList: js.UndefOr[AlertSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAlertsResponse {
    @inline
    def apply(
        AlertSummaryList: js.UndefOr[AlertSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAlertsResponse = {
      val __obj = js.Dynamic.literal()
      AlertSummaryList.foreach(__v => __obj.updateDynamic("AlertSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAlertsResponse]
    }
  }

  @js.native
  trait ListAnomalyDetectorsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAnomalyDetectorsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAnomalyDetectorsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnomalyDetectorsRequest]
    }
  }

  @js.native
  trait ListAnomalyDetectorsResponse extends js.Object {
    var AnomalyDetectorSummaryList: js.UndefOr[AnomalyDetectorSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAnomalyDetectorsResponse {
    @inline
    def apply(
        AnomalyDetectorSummaryList: js.UndefOr[AnomalyDetectorSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAnomalyDetectorsResponse = {
      val __obj = js.Dynamic.literal()
      AnomalyDetectorSummaryList.foreach(__v => __obj.updateDynamic("AnomalyDetectorSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnomalyDetectorsResponse]
    }
  }

  @js.native
  trait ListAnomalyGroupSummariesRequest extends js.Object {
    var AnomalyDetectorArn: Arn
    var SensitivityThreshold: SensitivityThreshold
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAnomalyGroupSummariesRequest {
    @inline
    def apply(
        AnomalyDetectorArn: Arn,
        SensitivityThreshold: SensitivityThreshold,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAnomalyGroupSummariesRequest = {
      val __obj = js.Dynamic.literal(
        "AnomalyDetectorArn" -> AnomalyDetectorArn.asInstanceOf[js.Any],
        "SensitivityThreshold" -> SensitivityThreshold.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnomalyGroupSummariesRequest]
    }
  }

  @js.native
  trait ListAnomalyGroupSummariesResponse extends js.Object {
    var AnomalyGroupStatistics: js.UndefOr[AnomalyGroupStatistics]
    var AnomalyGroupSummaryList: js.UndefOr[AnomalyGroupSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAnomalyGroupSummariesResponse {
    @inline
    def apply(
        AnomalyGroupStatistics: js.UndefOr[AnomalyGroupStatistics] = js.undefined,
        AnomalyGroupSummaryList: js.UndefOr[AnomalyGroupSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAnomalyGroupSummariesResponse = {
      val __obj = js.Dynamic.literal()
      AnomalyGroupStatistics.foreach(__v => __obj.updateDynamic("AnomalyGroupStatistics")(__v.asInstanceOf[js.Any]))
      AnomalyGroupSummaryList.foreach(__v => __obj.updateDynamic("AnomalyGroupSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnomalyGroupSummariesResponse]
    }
  }

  @js.native
  trait ListAnomalyGroupTimeSeriesRequest extends js.Object {
    var AnomalyDetectorArn: Arn
    var AnomalyGroupId: UUID
    var MetricName: MetricName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAnomalyGroupTimeSeriesRequest {
    @inline
    def apply(
        AnomalyDetectorArn: Arn,
        AnomalyGroupId: UUID,
        MetricName: MetricName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAnomalyGroupTimeSeriesRequest = {
      val __obj = js.Dynamic.literal(
        "AnomalyDetectorArn" -> AnomalyDetectorArn.asInstanceOf[js.Any],
        "AnomalyGroupId" -> AnomalyGroupId.asInstanceOf[js.Any],
        "MetricName" -> MetricName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnomalyGroupTimeSeriesRequest]
    }
  }

  @js.native
  trait ListAnomalyGroupTimeSeriesResponse extends js.Object {
    var AnomalyGroupId: js.UndefOr[UUID]
    var MetricName: js.UndefOr[MetricName]
    var NextToken: js.UndefOr[NextToken]
    var TimeSeriesList: js.UndefOr[TimeSeriesList]
    var TimestampList: js.UndefOr[TimestampList]
  }

  object ListAnomalyGroupTimeSeriesResponse {
    @inline
    def apply(
        AnomalyGroupId: js.UndefOr[UUID] = js.undefined,
        MetricName: js.UndefOr[MetricName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TimeSeriesList: js.UndefOr[TimeSeriesList] = js.undefined,
        TimestampList: js.UndefOr[TimestampList] = js.undefined
    ): ListAnomalyGroupTimeSeriesResponse = {
      val __obj = js.Dynamic.literal()
      AnomalyGroupId.foreach(__v => __obj.updateDynamic("AnomalyGroupId")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TimeSeriesList.foreach(__v => __obj.updateDynamic("TimeSeriesList")(__v.asInstanceOf[js.Any]))
      TimestampList.foreach(__v => __obj.updateDynamic("TimestampList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnomalyGroupTimeSeriesResponse]
    }
  }

  @js.native
  trait ListMetricSetsRequest extends js.Object {
    var AnomalyDetectorArn: js.UndefOr[Arn]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMetricSetsRequest {
    @inline
    def apply(
        AnomalyDetectorArn: js.UndefOr[Arn] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMetricSetsRequest = {
      val __obj = js.Dynamic.literal()
      AnomalyDetectorArn.foreach(__v => __obj.updateDynamic("AnomalyDetectorArn")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMetricSetsRequest]
    }
  }

  @js.native
  trait ListMetricSetsResponse extends js.Object {
    var MetricSetSummaryList: js.UndefOr[MetricSetSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMetricSetsResponse {
    @inline
    def apply(
        MetricSetSummaryList: js.UndefOr[MetricSetSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMetricSetsResponse = {
      val __obj = js.Dynamic.literal()
      MetricSetSummaryList.foreach(__v => __obj.updateDynamic("MetricSetSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMetricSetsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** A calculation made by contrasting a measure and a dimension from your source data.
    */
  @js.native
  trait Metric extends js.Object {
    var AggregationFunction: AggregationFunction
    var MetricName: ColumnName
    var Namespace: js.UndefOr[Namespace]
  }

  object Metric {
    @inline
    def apply(
        AggregationFunction: AggregationFunction,
        MetricName: ColumnName,
        Namespace: js.UndefOr[Namespace] = js.undefined
    ): Metric = {
      val __obj = js.Dynamic.literal(
        "AggregationFunction" -> AggregationFunction.asInstanceOf[js.Any],
        "MetricName" -> MetricName.asInstanceOf[js.Any]
      )

      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Metric]
    }
  }

  /** Details about a measure affected by an anomaly.
    */
  @js.native
  trait MetricLevelImpact extends js.Object {
    var ContributionMatrix: js.UndefOr[ContributionMatrix]
    var MetricName: js.UndefOr[MetricName]
    var NumTimeSeries: js.UndefOr[Int]
  }

  object MetricLevelImpact {
    @inline
    def apply(
        ContributionMatrix: js.UndefOr[ContributionMatrix] = js.undefined,
        MetricName: js.UndefOr[MetricName] = js.undefined,
        NumTimeSeries: js.UndefOr[Int] = js.undefined
    ): MetricLevelImpact = {
      val __obj = js.Dynamic.literal()
      ContributionMatrix.foreach(__v => __obj.updateDynamic("ContributionMatrix")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      NumTimeSeries.foreach(__v => __obj.updateDynamic("NumTimeSeries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricLevelImpact]
    }
  }

  /** Contains information about a dataset.
    */
  @js.native
  trait MetricSetSummary extends js.Object {
    var AnomalyDetectorArn: js.UndefOr[Arn]
    var CreationTime: js.UndefOr[Timestamp]
    var LastModificationTime: js.UndefOr[Timestamp]
    var MetricSetArn: js.UndefOr[Arn]
    var MetricSetDescription: js.UndefOr[MetricSetDescription]
    var MetricSetName: js.UndefOr[MetricSetName]
    var Tags: js.UndefOr[TagMap]
  }

  object MetricSetSummary {
    @inline
    def apply(
        AnomalyDetectorArn: js.UndefOr[Arn] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        MetricSetArn: js.UndefOr[Arn] = js.undefined,
        MetricSetDescription: js.UndefOr[MetricSetDescription] = js.undefined,
        MetricSetName: js.UndefOr[MetricSetName] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): MetricSetSummary = {
      val __obj = js.Dynamic.literal()
      AnomalyDetectorArn.foreach(__v => __obj.updateDynamic("AnomalyDetectorArn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      MetricSetArn.foreach(__v => __obj.updateDynamic("MetricSetArn")(__v.asInstanceOf[js.Any]))
      MetricSetDescription.foreach(__v => __obj.updateDynamic("MetricSetDescription")(__v.asInstanceOf[js.Any]))
      MetricSetName.foreach(__v => __obj.updateDynamic("MetricSetName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricSetSummary]
    }
  }

  /** Contains information about source data used to generate a metric.
    */
  @js.native
  trait MetricSource extends js.Object {
    var AppFlowConfig: js.UndefOr[AppFlowConfig]
    var CloudWatchConfig: js.UndefOr[CloudWatchConfig]
    var RDSSourceConfig: js.UndefOr[RDSSourceConfig]
    var RedshiftSourceConfig: js.UndefOr[RedshiftSourceConfig]
    var S3SourceConfig: js.UndefOr[S3SourceConfig]
  }

  object MetricSource {
    @inline
    def apply(
        AppFlowConfig: js.UndefOr[AppFlowConfig] = js.undefined,
        CloudWatchConfig: js.UndefOr[CloudWatchConfig] = js.undefined,
        RDSSourceConfig: js.UndefOr[RDSSourceConfig] = js.undefined,
        RedshiftSourceConfig: js.UndefOr[RedshiftSourceConfig] = js.undefined,
        S3SourceConfig: js.UndefOr[S3SourceConfig] = js.undefined
    ): MetricSource = {
      val __obj = js.Dynamic.literal()
      AppFlowConfig.foreach(__v => __obj.updateDynamic("AppFlowConfig")(__v.asInstanceOf[js.Any]))
      CloudWatchConfig.foreach(__v => __obj.updateDynamic("CloudWatchConfig")(__v.asInstanceOf[js.Any]))
      RDSSourceConfig.foreach(__v => __obj.updateDynamic("RDSSourceConfig")(__v.asInstanceOf[js.Any]))
      RedshiftSourceConfig.foreach(__v => __obj.updateDynamic("RedshiftSourceConfig")(__v.asInstanceOf[js.Any]))
      S3SourceConfig.foreach(__v => __obj.updateDynamic("S3SourceConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricSource]
    }
  }

  @js.native
  trait PutFeedbackRequest extends js.Object {
    var AnomalyDetectorArn: Arn
    var AnomalyGroupTimeSeriesFeedback: AnomalyGroupTimeSeriesFeedback
  }

  object PutFeedbackRequest {
    @inline
    def apply(
        AnomalyDetectorArn: Arn,
        AnomalyGroupTimeSeriesFeedback: AnomalyGroupTimeSeriesFeedback
    ): PutFeedbackRequest = {
      val __obj = js.Dynamic.literal(
        "AnomalyDetectorArn" -> AnomalyDetectorArn.asInstanceOf[js.Any],
        "AnomalyGroupTimeSeriesFeedback" -> AnomalyGroupTimeSeriesFeedback.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutFeedbackRequest]
    }
  }

  @js.native
  trait PutFeedbackResponse extends js.Object

  object PutFeedbackResponse {
    @inline
    def apply(): PutFeedbackResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutFeedbackResponse]
    }
  }

  /** Contains information about the Amazon Relational Database Service (RDS) configuration.
    */
  @js.native
  trait RDSSourceConfig extends js.Object {
    var DBInstanceIdentifier: RDSDatabaseIdentifier
    var DatabaseHost: DatabaseHost
    var DatabaseName: RDSDatabaseName
    var DatabasePort: DatabasePort
    var RoleArn: Arn
    var SecretManagerArn: PoirotSecretManagerArn
    var TableName: TableName
    var VpcConfiguration: VpcConfiguration
  }

  object RDSSourceConfig {
    @inline
    def apply(
        DBInstanceIdentifier: RDSDatabaseIdentifier,
        DatabaseHost: DatabaseHost,
        DatabaseName: RDSDatabaseName,
        DatabasePort: DatabasePort,
        RoleArn: Arn,
        SecretManagerArn: PoirotSecretManagerArn,
        TableName: TableName,
        VpcConfiguration: VpcConfiguration
    ): RDSSourceConfig = {
      val __obj = js.Dynamic.literal(
        "DBInstanceIdentifier" -> DBInstanceIdentifier.asInstanceOf[js.Any],
        "DatabaseHost" -> DatabaseHost.asInstanceOf[js.Any],
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "DatabasePort" -> DatabasePort.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "SecretManagerArn" -> SecretManagerArn.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any],
        "VpcConfiguration" -> VpcConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RDSSourceConfig]
    }
  }

  /** Provides information about the Amazon Redshift database configuration.
    */
  @js.native
  trait RedshiftSourceConfig extends js.Object {
    var ClusterIdentifier: RedshiftClusterIdentifier
    var DatabaseHost: DatabaseHost
    var DatabaseName: RedshiftDatabaseName
    var DatabasePort: DatabasePort
    var RoleArn: Arn
    var SecretManagerArn: PoirotSecretManagerArn
    var TableName: TableName
    var VpcConfiguration: VpcConfiguration
  }

  object RedshiftSourceConfig {
    @inline
    def apply(
        ClusterIdentifier: RedshiftClusterIdentifier,
        DatabaseHost: DatabaseHost,
        DatabaseName: RedshiftDatabaseName,
        DatabasePort: DatabasePort,
        RoleArn: Arn,
        SecretManagerArn: PoirotSecretManagerArn,
        TableName: TableName,
        VpcConfiguration: VpcConfiguration
    ): RedshiftSourceConfig = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "DatabaseHost" -> DatabaseHost.asInstanceOf[js.Any],
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "DatabasePort" -> DatabasePort.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "SecretManagerArn" -> SecretManagerArn.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any],
        "VpcConfiguration" -> VpcConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RedshiftSourceConfig]
    }
  }

  /** Contains information about the configuration of the S3 bucket that contains source files.
    */
  @js.native
  trait S3SourceConfig extends js.Object {
    var RoleArn: Arn
    var FileFormatDescriptor: js.UndefOr[FileFormatDescriptor]
    var HistoricalDataPathList: js.UndefOr[HistoricalDataPathList]
    var TemplatedPathList: js.UndefOr[TemplatedPathList]
  }

  object S3SourceConfig {
    @inline
    def apply(
        RoleArn: Arn,
        FileFormatDescriptor: js.UndefOr[FileFormatDescriptor] = js.undefined,
        HistoricalDataPathList: js.UndefOr[HistoricalDataPathList] = js.undefined,
        TemplatedPathList: js.UndefOr[TemplatedPathList] = js.undefined
    ): S3SourceConfig = {
      val __obj = js.Dynamic.literal(
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      FileFormatDescriptor.foreach(__v => __obj.updateDynamic("FileFormatDescriptor")(__v.asInstanceOf[js.Any]))
      HistoricalDataPathList.foreach(__v => __obj.updateDynamic("HistoricalDataPathList")(__v.asInstanceOf[js.Any]))
      TemplatedPathList.foreach(__v => __obj.updateDynamic("TemplatedPathList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3SourceConfig]
    }
  }

  /** Contains information about the SNS topic to which you want to send your alerts and the IAM role that has access to that topic.
    */
  @js.native
  trait SNSConfiguration extends js.Object {
    var RoleArn: Arn
    var SnsTopicArn: Arn
  }

  object SNSConfiguration {
    @inline
    def apply(
        RoleArn: Arn,
        SnsTopicArn: Arn
    ): SNSConfiguration = {
      val __obj = js.Dynamic.literal(
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "SnsTopicArn" -> SnsTopicArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SNSConfiguration]
    }
  }

  /** Contains information about the source configuration in Amazon S3.
    */
  @js.native
  trait SampleDataS3SourceConfig extends js.Object {
    var FileFormatDescriptor: FileFormatDescriptor
    var RoleArn: Arn
    var HistoricalDataPathList: js.UndefOr[HistoricalDataPathList]
    var TemplatedPathList: js.UndefOr[TemplatedPathList]
  }

  object SampleDataS3SourceConfig {
    @inline
    def apply(
        FileFormatDescriptor: FileFormatDescriptor,
        RoleArn: Arn,
        HistoricalDataPathList: js.UndefOr[HistoricalDataPathList] = js.undefined,
        TemplatedPathList: js.UndefOr[TemplatedPathList] = js.undefined
    ): SampleDataS3SourceConfig = {
      val __obj = js.Dynamic.literal(
        "FileFormatDescriptor" -> FileFormatDescriptor.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      HistoricalDataPathList.foreach(__v => __obj.updateDynamic("HistoricalDataPathList")(__v.asInstanceOf[js.Any]))
      TemplatedPathList.foreach(__v => __obj.updateDynamic("TemplatedPathList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SampleDataS3SourceConfig]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        Tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
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

  /** Details about a metric. A metric is an aggregation of the values of a measure for a dimension value, such as <i>availability</i> in the <i>us-east-1</i> Region.
    */
  @js.native
  trait TimeSeries extends js.Object {
    var DimensionList: DimensionNameValueList
    var MetricValueList: MetricValueList
    var TimeSeriesId: TimeSeriesId
  }

  object TimeSeries {
    @inline
    def apply(
        DimensionList: DimensionNameValueList,
        MetricValueList: MetricValueList,
        TimeSeriesId: TimeSeriesId
    ): TimeSeries = {
      val __obj = js.Dynamic.literal(
        "DimensionList" -> DimensionList.asInstanceOf[js.Any],
        "MetricValueList" -> MetricValueList.asInstanceOf[js.Any],
        "TimeSeriesId" -> TimeSeriesId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TimeSeries]
    }
  }

  /** Details about feedback submitted for an anomalous metric.
    */
  @js.native
  trait TimeSeriesFeedback extends js.Object {
    var IsAnomaly: js.UndefOr[Boolean]
    var TimeSeriesId: js.UndefOr[TimeSeriesId]
  }

  object TimeSeriesFeedback {
    @inline
    def apply(
        IsAnomaly: js.UndefOr[Boolean] = js.undefined,
        TimeSeriesId: js.UndefOr[TimeSeriesId] = js.undefined
    ): TimeSeriesFeedback = {
      val __obj = js.Dynamic.literal()
      IsAnomaly.foreach(__v => __obj.updateDynamic("IsAnomaly")(__v.asInstanceOf[js.Any]))
      TimeSeriesId.foreach(__v => __obj.updateDynamic("TimeSeriesId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeSeriesFeedback]
    }
  }

  /** Contains information about the column used to track time in a source data file.
    */
  @js.native
  trait TimestampColumn extends js.Object {
    var ColumnFormat: js.UndefOr[DateTimeFormat]
    var ColumnName: js.UndefOr[ColumnName]
  }

  object TimestampColumn {
    @inline
    def apply(
        ColumnFormat: js.UndefOr[DateTimeFormat] = js.undefined,
        ColumnName: js.UndefOr[ColumnName] = js.undefined
    ): TimestampColumn = {
      val __obj = js.Dynamic.literal()
      ColumnFormat.foreach(__v => __obj.updateDynamic("ColumnFormat")(__v.asInstanceOf[js.Any]))
      ColumnName.foreach(__v => __obj.updateDynamic("ColumnName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimestampColumn]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
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
  trait UpdateAnomalyDetectorRequest extends js.Object {
    var AnomalyDetectorArn: Arn
    var AnomalyDetectorConfig: js.UndefOr[AnomalyDetectorConfig]
    var AnomalyDetectorDescription: js.UndefOr[AnomalyDetectorDescription]
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
  }

  object UpdateAnomalyDetectorRequest {
    @inline
    def apply(
        AnomalyDetectorArn: Arn,
        AnomalyDetectorConfig: js.UndefOr[AnomalyDetectorConfig] = js.undefined,
        AnomalyDetectorDescription: js.UndefOr[AnomalyDetectorDescription] = js.undefined,
        KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
    ): UpdateAnomalyDetectorRequest = {
      val __obj = js.Dynamic.literal(
        "AnomalyDetectorArn" -> AnomalyDetectorArn.asInstanceOf[js.Any]
      )

      AnomalyDetectorConfig.foreach(__v => __obj.updateDynamic("AnomalyDetectorConfig")(__v.asInstanceOf[js.Any]))
      AnomalyDetectorDescription.foreach(__v => __obj.updateDynamic("AnomalyDetectorDescription")(__v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAnomalyDetectorRequest]
    }
  }

  @js.native
  trait UpdateAnomalyDetectorResponse extends js.Object {
    var AnomalyDetectorArn: js.UndefOr[Arn]
  }

  object UpdateAnomalyDetectorResponse {
    @inline
    def apply(
        AnomalyDetectorArn: js.UndefOr[Arn] = js.undefined
    ): UpdateAnomalyDetectorResponse = {
      val __obj = js.Dynamic.literal()
      AnomalyDetectorArn.foreach(__v => __obj.updateDynamic("AnomalyDetectorArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAnomalyDetectorResponse]
    }
  }

  @js.native
  trait UpdateMetricSetRequest extends js.Object {
    var MetricSetArn: Arn
    var DimensionList: js.UndefOr[DimensionList]
    var MetricList: js.UndefOr[MetricList]
    var MetricSetDescription: js.UndefOr[MetricSetDescription]
    var MetricSetFrequency: js.UndefOr[Frequency]
    var MetricSource: js.UndefOr[MetricSource]
    var Offset: js.UndefOr[Offset]
    var TimestampColumn: js.UndefOr[TimestampColumn]
  }

  object UpdateMetricSetRequest {
    @inline
    def apply(
        MetricSetArn: Arn,
        DimensionList: js.UndefOr[DimensionList] = js.undefined,
        MetricList: js.UndefOr[MetricList] = js.undefined,
        MetricSetDescription: js.UndefOr[MetricSetDescription] = js.undefined,
        MetricSetFrequency: js.UndefOr[Frequency] = js.undefined,
        MetricSource: js.UndefOr[MetricSource] = js.undefined,
        Offset: js.UndefOr[Offset] = js.undefined,
        TimestampColumn: js.UndefOr[TimestampColumn] = js.undefined
    ): UpdateMetricSetRequest = {
      val __obj = js.Dynamic.literal(
        "MetricSetArn" -> MetricSetArn.asInstanceOf[js.Any]
      )

      DimensionList.foreach(__v => __obj.updateDynamic("DimensionList")(__v.asInstanceOf[js.Any]))
      MetricList.foreach(__v => __obj.updateDynamic("MetricList")(__v.asInstanceOf[js.Any]))
      MetricSetDescription.foreach(__v => __obj.updateDynamic("MetricSetDescription")(__v.asInstanceOf[js.Any]))
      MetricSetFrequency.foreach(__v => __obj.updateDynamic("MetricSetFrequency")(__v.asInstanceOf[js.Any]))
      MetricSource.foreach(__v => __obj.updateDynamic("MetricSource")(__v.asInstanceOf[js.Any]))
      Offset.foreach(__v => __obj.updateDynamic("Offset")(__v.asInstanceOf[js.Any]))
      TimestampColumn.foreach(__v => __obj.updateDynamic("TimestampColumn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMetricSetRequest]
    }
  }

  @js.native
  trait UpdateMetricSetResponse extends js.Object {
    var MetricSetArn: js.UndefOr[Arn]
  }

  object UpdateMetricSetResponse {
    @inline
    def apply(
        MetricSetArn: js.UndefOr[Arn] = js.undefined
    ): UpdateMetricSetResponse = {
      val __obj = js.Dynamic.literal()
      MetricSetArn.foreach(__v => __obj.updateDynamic("MetricSetArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMetricSetResponse]
    }
  }

  /** Contains configuration information about the Amazon Virtual Private Cloud (VPC).
    */
  @js.native
  trait VpcConfiguration extends js.Object {
    var SecurityGroupIdList: SecurityGroupIdList
    var SubnetIdList: SubnetIdList
  }

  object VpcConfiguration {
    @inline
    def apply(
        SecurityGroupIdList: SecurityGroupIdList,
        SubnetIdList: SubnetIdList
    ): VpcConfiguration = {
      val __obj = js.Dynamic.literal(
        "SecurityGroupIdList" -> SecurityGroupIdList.asInstanceOf[js.Any],
        "SubnetIdList" -> SubnetIdList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VpcConfiguration]
    }
  }
}
