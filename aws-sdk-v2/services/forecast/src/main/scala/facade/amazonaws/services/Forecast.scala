package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object forecast {
  type AdditionalDatasets = js.Array[AdditionalDataset]
  type Arn = String
  type ArnList = js.Array[Arn]
  type AttributeConfigs = js.Array[AttributeConfig]
  type AttributeValue = String
  type BaselineMetrics = js.Array[BaselineMetric]
  type CategoricalParameterRanges = js.Array[CategoricalParameterRange]
  type Configuration = js.Dictionary[Values]
  type ContinuousParameterRanges = js.Array[ContinuousParameterRange]
  type DatasetGroups = js.Array[DatasetGroupSummary]
  type DatasetImportJobs = js.Array[DatasetImportJobSummary]
  type Datasets = js.Array[DatasetSummary]
  type DayOfMonth = Int
  type Detail = String
  type ErrorMessage = String
  type ErrorMetrics = js.Array[ErrorMetric]
  type EvaluationState = String
  type Explainabilities = js.Array[ExplainabilitySummary]
  type ExplainabilityExports = js.Array[ExplainabilityExportSummary]
  type FeaturizationMethodParameters = js.Dictionary[ParameterValue]
  type FeaturizationPipeline = js.Array[FeaturizationMethod]
  type Featurizations = js.Array[Featurization]
  type FieldStatistics = js.Dictionary[Statistics]
  type Filters = js.Array[Filter]
  type ForecastDimensions = js.Array[Name]
  type ForecastExportJobs = js.Array[ForecastExportJobSummary]
  type ForecastType = String
  type ForecastTypes = js.Array[ForecastType]
  type Forecasts = js.Array[ForecastSummary]
  type Format = String
  type Frequency = String
  type GeolocationFormat = String
  type Hour = Int
  type IntegerParameterRanges = js.Array[IntegerParameterRange]
  type KMSKeyArn = String
  type LocalDateTime = String
  type LongArn = String
  type LongArnList = js.Array[LongArn]
  type MaxResults = Int
  type Message = String
  type MetricName = String
  type MetricResults = js.Array[MetricResult]
  type Monitors = js.Array[MonitorSummary]
  type Name = String
  type NextToken = String
  type ParameterKey = String
  type ParameterValue = String
  type PredictorBacktestExportJobs = js.Array[PredictorBacktestExportJobSummary]
  type PredictorEvaluationResults = js.Array[EvaluationResult]
  type PredictorExecutions = js.Array[PredictorExecution]
  type PredictorMonitorEvaluations = js.Array[PredictorMonitorEvaluation]
  type Predictors = js.Array[PredictorSummary]
  type S3Path = String
  type SchemaAttributes = js.Array[SchemaAttribute]
  type Status = String
  type SupplementaryFeatures = js.Array[SupplementaryFeature]
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type TestWindowDetails = js.Array[TestWindowSummary]
  type TestWindows = js.Array[WindowSummary]
  type TimeSeriesConditions = js.Array[TimeSeriesCondition]
  type TimeSeriesTransformations = js.Array[TimeSeriesTransformation]
  type TimeZone = String
  type Timestamp = js.Date
  type TimestampFormat = String
  type TrainingParameters = js.Dictionary[ParameterValue]
  type Transformations = js.Dictionary[Value]
  type UseGeolocationForTimeZone = Boolean
  type Value = String
  type Values = js.Array[Value]
  type WeightedQuantileLosses = js.Array[WeightedQuantileLoss]
  type WhatIfAnalyses = js.Array[WhatIfAnalysisSummary]
  type WhatIfForecastArnListForExport = js.Array[LongArn]
  type WhatIfForecastExports = js.Array[WhatIfForecastExportSummary]
  type WhatIfForecasts = js.Array[WhatIfForecastSummary]

  final class ForecastOps(private val service: Forecast) extends AnyVal {

    @inline def createAutoPredictorFuture(params: CreateAutoPredictorRequest): Future[CreateAutoPredictorResponse] = service.createAutoPredictor(params).promise().toFuture
    @inline def createDatasetFuture(params: CreateDatasetRequest): Future[CreateDatasetResponse] = service.createDataset(params).promise().toFuture
    @inline def createDatasetGroupFuture(params: CreateDatasetGroupRequest): Future[CreateDatasetGroupResponse] = service.createDatasetGroup(params).promise().toFuture
    @inline def createDatasetImportJobFuture(params: CreateDatasetImportJobRequest): Future[CreateDatasetImportJobResponse] = service.createDatasetImportJob(params).promise().toFuture
    @inline def createExplainabilityExportFuture(params: CreateExplainabilityExportRequest): Future[CreateExplainabilityExportResponse] = service.createExplainabilityExport(params).promise().toFuture
    @inline def createExplainabilityFuture(params: CreateExplainabilityRequest): Future[CreateExplainabilityResponse] = service.createExplainability(params).promise().toFuture
    @inline def createForecastExportJobFuture(params: CreateForecastExportJobRequest): Future[CreateForecastExportJobResponse] = service.createForecastExportJob(params).promise().toFuture
    @inline def createForecastFuture(params: CreateForecastRequest): Future[CreateForecastResponse] = service.createForecast(params).promise().toFuture
    @inline def createMonitorFuture(params: CreateMonitorRequest): Future[CreateMonitorResponse] = service.createMonitor(params).promise().toFuture
    @inline def createPredictorBacktestExportJobFuture(params: CreatePredictorBacktestExportJobRequest): Future[CreatePredictorBacktestExportJobResponse] = service.createPredictorBacktestExportJob(params).promise().toFuture
    @inline def createPredictorFuture(params: CreatePredictorRequest): Future[CreatePredictorResponse] = service.createPredictor(params).promise().toFuture
    @inline def createWhatIfAnalysisFuture(params: CreateWhatIfAnalysisRequest): Future[CreateWhatIfAnalysisResponse] = service.createWhatIfAnalysis(params).promise().toFuture
    @inline def createWhatIfForecastExportFuture(params: CreateWhatIfForecastExportRequest): Future[CreateWhatIfForecastExportResponse] = service.createWhatIfForecastExport(params).promise().toFuture
    @inline def createWhatIfForecastFuture(params: CreateWhatIfForecastRequest): Future[CreateWhatIfForecastResponse] = service.createWhatIfForecast(params).promise().toFuture
    @inline def deleteDatasetFuture(params: DeleteDatasetRequest): Future[js.Object] = service.deleteDataset(params).promise().toFuture
    @inline def deleteDatasetGroupFuture(params: DeleteDatasetGroupRequest): Future[js.Object] = service.deleteDatasetGroup(params).promise().toFuture
    @inline def deleteDatasetImportJobFuture(params: DeleteDatasetImportJobRequest): Future[js.Object] = service.deleteDatasetImportJob(params).promise().toFuture
    @inline def deleteExplainabilityExportFuture(params: DeleteExplainabilityExportRequest): Future[js.Object] = service.deleteExplainabilityExport(params).promise().toFuture
    @inline def deleteExplainabilityFuture(params: DeleteExplainabilityRequest): Future[js.Object] = service.deleteExplainability(params).promise().toFuture
    @inline def deleteForecastExportJobFuture(params: DeleteForecastExportJobRequest): Future[js.Object] = service.deleteForecastExportJob(params).promise().toFuture
    @inline def deleteForecastFuture(params: DeleteForecastRequest): Future[js.Object] = service.deleteForecast(params).promise().toFuture
    @inline def deleteMonitorFuture(params: DeleteMonitorRequest): Future[js.Object] = service.deleteMonitor(params).promise().toFuture
    @inline def deletePredictorBacktestExportJobFuture(params: DeletePredictorBacktestExportJobRequest): Future[js.Object] = service.deletePredictorBacktestExportJob(params).promise().toFuture
    @inline def deletePredictorFuture(params: DeletePredictorRequest): Future[js.Object] = service.deletePredictor(params).promise().toFuture
    @inline def deleteResourceTreeFuture(params: DeleteResourceTreeRequest): Future[js.Object] = service.deleteResourceTree(params).promise().toFuture
    @inline def deleteWhatIfAnalysisFuture(params: DeleteWhatIfAnalysisRequest): Future[js.Object] = service.deleteWhatIfAnalysis(params).promise().toFuture
    @inline def deleteWhatIfForecastExportFuture(params: DeleteWhatIfForecastExportRequest): Future[js.Object] = service.deleteWhatIfForecastExport(params).promise().toFuture
    @inline def deleteWhatIfForecastFuture(params: DeleteWhatIfForecastRequest): Future[js.Object] = service.deleteWhatIfForecast(params).promise().toFuture
    @inline def describeAutoPredictorFuture(params: DescribeAutoPredictorRequest): Future[DescribeAutoPredictorResponse] = service.describeAutoPredictor(params).promise().toFuture
    @inline def describeDatasetFuture(params: DescribeDatasetRequest): Future[DescribeDatasetResponse] = service.describeDataset(params).promise().toFuture
    @inline def describeDatasetGroupFuture(params: DescribeDatasetGroupRequest): Future[DescribeDatasetGroupResponse] = service.describeDatasetGroup(params).promise().toFuture
    @inline def describeDatasetImportJobFuture(params: DescribeDatasetImportJobRequest): Future[DescribeDatasetImportJobResponse] = service.describeDatasetImportJob(params).promise().toFuture
    @inline def describeExplainabilityExportFuture(params: DescribeExplainabilityExportRequest): Future[DescribeExplainabilityExportResponse] = service.describeExplainabilityExport(params).promise().toFuture
    @inline def describeExplainabilityFuture(params: DescribeExplainabilityRequest): Future[DescribeExplainabilityResponse] = service.describeExplainability(params).promise().toFuture
    @inline def describeForecastExportJobFuture(params: DescribeForecastExportJobRequest): Future[DescribeForecastExportJobResponse] = service.describeForecastExportJob(params).promise().toFuture
    @inline def describeForecastFuture(params: DescribeForecastRequest): Future[DescribeForecastResponse] = service.describeForecast(params).promise().toFuture
    @inline def describeMonitorFuture(params: DescribeMonitorRequest): Future[DescribeMonitorResponse] = service.describeMonitor(params).promise().toFuture
    @inline def describePredictorBacktestExportJobFuture(params: DescribePredictorBacktestExportJobRequest): Future[DescribePredictorBacktestExportJobResponse] = service.describePredictorBacktestExportJob(params).promise().toFuture
    @inline def describePredictorFuture(params: DescribePredictorRequest): Future[DescribePredictorResponse] = service.describePredictor(params).promise().toFuture
    @inline def describeWhatIfAnalysisFuture(params: DescribeWhatIfAnalysisRequest): Future[DescribeWhatIfAnalysisResponse] = service.describeWhatIfAnalysis(params).promise().toFuture
    @inline def describeWhatIfForecastExportFuture(params: DescribeWhatIfForecastExportRequest): Future[DescribeWhatIfForecastExportResponse] = service.describeWhatIfForecastExport(params).promise().toFuture
    @inline def describeWhatIfForecastFuture(params: DescribeWhatIfForecastRequest): Future[DescribeWhatIfForecastResponse] = service.describeWhatIfForecast(params).promise().toFuture
    @inline def getAccuracyMetricsFuture(params: GetAccuracyMetricsRequest): Future[GetAccuracyMetricsResponse] = service.getAccuracyMetrics(params).promise().toFuture
    @inline def listDatasetGroupsFuture(params: ListDatasetGroupsRequest): Future[ListDatasetGroupsResponse] = service.listDatasetGroups(params).promise().toFuture
    @inline def listDatasetImportJobsFuture(params: ListDatasetImportJobsRequest): Future[ListDatasetImportJobsResponse] = service.listDatasetImportJobs(params).promise().toFuture
    @inline def listDatasetsFuture(params: ListDatasetsRequest): Future[ListDatasetsResponse] = service.listDatasets(params).promise().toFuture
    @inline def listExplainabilitiesFuture(params: ListExplainabilitiesRequest): Future[ListExplainabilitiesResponse] = service.listExplainabilities(params).promise().toFuture
    @inline def listExplainabilityExportsFuture(params: ListExplainabilityExportsRequest): Future[ListExplainabilityExportsResponse] = service.listExplainabilityExports(params).promise().toFuture
    @inline def listForecastExportJobsFuture(params: ListForecastExportJobsRequest): Future[ListForecastExportJobsResponse] = service.listForecastExportJobs(params).promise().toFuture
    @inline def listForecastsFuture(params: ListForecastsRequest): Future[ListForecastsResponse] = service.listForecasts(params).promise().toFuture
    @inline def listMonitorEvaluationsFuture(params: ListMonitorEvaluationsRequest): Future[ListMonitorEvaluationsResponse] = service.listMonitorEvaluations(params).promise().toFuture
    @inline def listMonitorsFuture(params: ListMonitorsRequest): Future[ListMonitorsResponse] = service.listMonitors(params).promise().toFuture
    @inline def listPredictorBacktestExportJobsFuture(params: ListPredictorBacktestExportJobsRequest): Future[ListPredictorBacktestExportJobsResponse] = service.listPredictorBacktestExportJobs(params).promise().toFuture
    @inline def listPredictorsFuture(params: ListPredictorsRequest): Future[ListPredictorsResponse] = service.listPredictors(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listWhatIfAnalysesFuture(params: ListWhatIfAnalysesRequest): Future[ListWhatIfAnalysesResponse] = service.listWhatIfAnalyses(params).promise().toFuture
    @inline def listWhatIfForecastExportsFuture(params: ListWhatIfForecastExportsRequest): Future[ListWhatIfForecastExportsResponse] = service.listWhatIfForecastExports(params).promise().toFuture
    @inline def listWhatIfForecastsFuture(params: ListWhatIfForecastsRequest): Future[ListWhatIfForecastsResponse] = service.listWhatIfForecasts(params).promise().toFuture
    @inline def resumeResourceFuture(params: ResumeResourceRequest): Future[js.Object] = service.resumeResource(params).promise().toFuture
    @inline def stopResourceFuture(params: StopResourceRequest): Future[js.Object] = service.stopResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateDatasetGroupFuture(params: UpdateDatasetGroupRequest): Future[UpdateDatasetGroupResponse] = service.updateDatasetGroup(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/forecastservice", JSImport.Namespace, "AWS.ForecastService")
  class Forecast() extends js.Object {
    def this(config: AWSConfig) = this()

    def createAutoPredictor(params: CreateAutoPredictorRequest): Request[CreateAutoPredictorResponse] = js.native
    def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse] = js.native
    def createDatasetGroup(params: CreateDatasetGroupRequest): Request[CreateDatasetGroupResponse] = js.native
    def createDatasetImportJob(params: CreateDatasetImportJobRequest): Request[CreateDatasetImportJobResponse] = js.native
    def createExplainability(params: CreateExplainabilityRequest): Request[CreateExplainabilityResponse] = js.native
    def createExplainabilityExport(params: CreateExplainabilityExportRequest): Request[CreateExplainabilityExportResponse] = js.native
    def createForecast(params: CreateForecastRequest): Request[CreateForecastResponse] = js.native
    def createForecastExportJob(params: CreateForecastExportJobRequest): Request[CreateForecastExportJobResponse] = js.native
    def createMonitor(params: CreateMonitorRequest): Request[CreateMonitorResponse] = js.native
    def createPredictor(params: CreatePredictorRequest): Request[CreatePredictorResponse] = js.native
    def createPredictorBacktestExportJob(params: CreatePredictorBacktestExportJobRequest): Request[CreatePredictorBacktestExportJobResponse] = js.native
    def createWhatIfAnalysis(params: CreateWhatIfAnalysisRequest): Request[CreateWhatIfAnalysisResponse] = js.native
    def createWhatIfForecast(params: CreateWhatIfForecastRequest): Request[CreateWhatIfForecastResponse] = js.native
    def createWhatIfForecastExport(params: CreateWhatIfForecastExportRequest): Request[CreateWhatIfForecastExportResponse] = js.native
    def deleteDataset(params: DeleteDatasetRequest): Request[js.Object] = js.native
    def deleteDatasetGroup(params: DeleteDatasetGroupRequest): Request[js.Object] = js.native
    def deleteDatasetImportJob(params: DeleteDatasetImportJobRequest): Request[js.Object] = js.native
    def deleteExplainability(params: DeleteExplainabilityRequest): Request[js.Object] = js.native
    def deleteExplainabilityExport(params: DeleteExplainabilityExportRequest): Request[js.Object] = js.native
    def deleteForecast(params: DeleteForecastRequest): Request[js.Object] = js.native
    def deleteForecastExportJob(params: DeleteForecastExportJobRequest): Request[js.Object] = js.native
    def deleteMonitor(params: DeleteMonitorRequest): Request[js.Object] = js.native
    def deletePredictor(params: DeletePredictorRequest): Request[js.Object] = js.native
    def deletePredictorBacktestExportJob(params: DeletePredictorBacktestExportJobRequest): Request[js.Object] = js.native
    def deleteResourceTree(params: DeleteResourceTreeRequest): Request[js.Object] = js.native
    def deleteWhatIfAnalysis(params: DeleteWhatIfAnalysisRequest): Request[js.Object] = js.native
    def deleteWhatIfForecast(params: DeleteWhatIfForecastRequest): Request[js.Object] = js.native
    def deleteWhatIfForecastExport(params: DeleteWhatIfForecastExportRequest): Request[js.Object] = js.native
    def describeAutoPredictor(params: DescribeAutoPredictorRequest): Request[DescribeAutoPredictorResponse] = js.native
    def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse] = js.native
    def describeDatasetGroup(params: DescribeDatasetGroupRequest): Request[DescribeDatasetGroupResponse] = js.native
    def describeDatasetImportJob(params: DescribeDatasetImportJobRequest): Request[DescribeDatasetImportJobResponse] = js.native
    def describeExplainability(params: DescribeExplainabilityRequest): Request[DescribeExplainabilityResponse] = js.native
    def describeExplainabilityExport(params: DescribeExplainabilityExportRequest): Request[DescribeExplainabilityExportResponse] = js.native
    def describeForecast(params: DescribeForecastRequest): Request[DescribeForecastResponse] = js.native
    def describeForecastExportJob(params: DescribeForecastExportJobRequest): Request[DescribeForecastExportJobResponse] = js.native
    def describeMonitor(params: DescribeMonitorRequest): Request[DescribeMonitorResponse] = js.native
    def describePredictor(params: DescribePredictorRequest): Request[DescribePredictorResponse] = js.native
    def describePredictorBacktestExportJob(params: DescribePredictorBacktestExportJobRequest): Request[DescribePredictorBacktestExportJobResponse] = js.native
    def describeWhatIfAnalysis(params: DescribeWhatIfAnalysisRequest): Request[DescribeWhatIfAnalysisResponse] = js.native
    def describeWhatIfForecast(params: DescribeWhatIfForecastRequest): Request[DescribeWhatIfForecastResponse] = js.native
    def describeWhatIfForecastExport(params: DescribeWhatIfForecastExportRequest): Request[DescribeWhatIfForecastExportResponse] = js.native
    def getAccuracyMetrics(params: GetAccuracyMetricsRequest): Request[GetAccuracyMetricsResponse] = js.native
    def listDatasetGroups(params: ListDatasetGroupsRequest): Request[ListDatasetGroupsResponse] = js.native
    def listDatasetImportJobs(params: ListDatasetImportJobsRequest): Request[ListDatasetImportJobsResponse] = js.native
    def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse] = js.native
    def listExplainabilities(params: ListExplainabilitiesRequest): Request[ListExplainabilitiesResponse] = js.native
    def listExplainabilityExports(params: ListExplainabilityExportsRequest): Request[ListExplainabilityExportsResponse] = js.native
    def listForecastExportJobs(params: ListForecastExportJobsRequest): Request[ListForecastExportJobsResponse] = js.native
    def listForecasts(params: ListForecastsRequest): Request[ListForecastsResponse] = js.native
    def listMonitorEvaluations(params: ListMonitorEvaluationsRequest): Request[ListMonitorEvaluationsResponse] = js.native
    def listMonitors(params: ListMonitorsRequest): Request[ListMonitorsResponse] = js.native
    def listPredictorBacktestExportJobs(params: ListPredictorBacktestExportJobsRequest): Request[ListPredictorBacktestExportJobsResponse] = js.native
    def listPredictors(params: ListPredictorsRequest): Request[ListPredictorsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listWhatIfAnalyses(params: ListWhatIfAnalysesRequest): Request[ListWhatIfAnalysesResponse] = js.native
    def listWhatIfForecastExports(params: ListWhatIfForecastExportsRequest): Request[ListWhatIfForecastExportsResponse] = js.native
    def listWhatIfForecasts(params: ListWhatIfForecastsRequest): Request[ListWhatIfForecastsResponse] = js.native
    def resumeResource(params: ResumeResourceRequest): Request[js.Object] = js.native
    def stopResource(params: StopResourceRequest): Request[js.Object] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateDatasetGroup(params: UpdateDatasetGroupRequest): Request[UpdateDatasetGroupResponse] = js.native
  }
  object Forecast {
    @inline implicit def toOps(service: Forecast): ForecastOps = {
      new ForecastOps(service)
    }
  }

  /** Defines the modifications that you are making to an attribute for a what-if forecast. For example, you can use this operation to create a what-if forecast that investigates a 10% off sale on all shoes. To do this, you specify <code>"AttributeName": "shoes"</code>, <code>"Operation": "MULTIPLY"</code>, and <code>"Value": "0.90"</code>. Pair this operation with the <a>TimeSeriesCondition</a> operation within the [[CreateWhatIfForecastRequest.TimeSeriesTransformations]] operation to define a subset of attribute items that are modified.
    */
  @js.native
  trait Action extends js.Object {
    var AttributeName: Name
    var Operation: Operation
    var Value: Double
  }

  object Action {
    @inline
    def apply(
        AttributeName: Name,
        Operation: Operation,
        Value: Double
    ): Action = {
      val __obj = js.Dynamic.literal(
        "AttributeName" -> AttributeName.asInstanceOf[js.Any],
        "Operation" -> Operation.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Action]
    }
  }

  /** Describes an additional dataset. This object is part of the <a>DataConfig</a> object. Forecast supports the Weather Index and Holidays additional datasets.
    * \```Weather Index``` The Amazon Forecast Weather Index is a built-in dataset that incorporates historical and projected weather information into your model. The Weather Index supplements your datasets with over two years of historical weather data and up to 14 days of projected weather data. For more information, see [[https://docs.aws.amazon.com/forecast/latest/dg/weather.html|Amazon Forecast Weather Index]].
    * \```Holidays``` Holidays is a built-in dataset that incorporates national holiday information into your model. It provides native support for the holiday calendars of 66 countries. To view the holiday calendars, refer to the [[http://jollyday.sourceforge.net/data.html|Jollyday]] library. For more information, see [[https://docs.aws.amazon.com/forecast/latest/dg/holidays.html|Holidays Featurization]].
    */
  @js.native
  trait AdditionalDataset extends js.Object {
    var Name: Name
    var Configuration: js.UndefOr[Configuration]
  }

  object AdditionalDataset {
    @inline
    def apply(
        Name: Name,
        Configuration: js.UndefOr[Configuration] = js.undefined
    ): AdditionalDataset = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdditionalDataset]
    }
  }

  /** Provides information about the method used to transform attributes. The following is an example using the RETAIL domain: <code>{</code> <code>"AttributeName": "demand",</code> <code>"Transformations": {"aggregation": "sum", "middlefill": "zero", "backfill": "zero"}</code> <code>}</code>
    */
  @js.native
  trait AttributeConfig extends js.Object {
    var AttributeName: Name
    var Transformations: Transformations
  }

  object AttributeConfig {
    @inline
    def apply(
        AttributeName: Name,
        Transformations: Transformations
    ): AttributeConfig = {
      val __obj = js.Dynamic.literal(
        "AttributeName" -> AttributeName.asInstanceOf[js.Any],
        "Transformations" -> Transformations.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AttributeConfig]
    }
  }

  /** Metrics you can use as a baseline for comparison purposes. Use these metrics when you interpret monitoring results for an auto predictor.
    */
  @js.native
  trait Baseline extends js.Object {
    var PredictorBaseline: js.UndefOr[PredictorBaseline]
  }

  object Baseline {
    @inline
    def apply(
        PredictorBaseline: js.UndefOr[PredictorBaseline] = js.undefined
    ): Baseline = {
      val __obj = js.Dynamic.literal()
      PredictorBaseline.foreach(__v => __obj.updateDynamic("PredictorBaseline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Baseline]
    }
  }

  /** An individual metric that you can use for comparison as you evaluate your monitoring results.
    */
  @js.native
  trait BaselineMetric extends js.Object {
    var Name: js.UndefOr[Name]
    var Value: js.UndefOr[Double]
  }

  object BaselineMetric {
    @inline
    def apply(
        Name: js.UndefOr[Name] = js.undefined,
        Value: js.UndefOr[Double] = js.undefined
    ): BaselineMetric = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BaselineMetric]
    }
  }

  /** Specifies a categorical hyperparameter and it's range of tunable values. This object is part of the <a>ParameterRanges</a> object.
    */
  @js.native
  trait CategoricalParameterRange extends js.Object {
    var Name: Name
    var Values: Values
  }

  object CategoricalParameterRange {
    @inline
    def apply(
        Name: Name,
        Values: Values
    ): CategoricalParameterRange = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CategoricalParameterRange]
    }
  }

  /** Specifies a continuous hyperparameter and it's range of tunable values. This object is part of the <a>ParameterRanges</a> object.
    */
  @js.native
  trait ContinuousParameterRange extends js.Object {
    var MaxValue: Double
    var MinValue: Double
    var Name: Name
    var ScalingType: js.UndefOr[ScalingType]
  }

  object ContinuousParameterRange {
    @inline
    def apply(
        MaxValue: Double,
        MinValue: Double,
        Name: Name,
        ScalingType: js.UndefOr[ScalingType] = js.undefined
    ): ContinuousParameterRange = {
      val __obj = js.Dynamic.literal(
        "MaxValue" -> MaxValue.asInstanceOf[js.Any],
        "MinValue" -> MinValue.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ScalingType.foreach(__v => __obj.updateDynamic("ScalingType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContinuousParameterRange]
    }
  }

  @js.native
  trait CreateAutoPredictorRequest extends js.Object {
    var PredictorName: Name
    var DataConfig: js.UndefOr[DataConfig]
    var EncryptionConfig: js.UndefOr[EncryptionConfig]
    var ExplainPredictor: js.UndefOr[Boolean]
    var ForecastDimensions: js.UndefOr[ForecastDimensions]
    var ForecastFrequency: js.UndefOr[Frequency]
    var ForecastHorizon: js.UndefOr[Int]
    var ForecastTypes: js.UndefOr[ForecastTypes]
    var MonitorConfig: js.UndefOr[MonitorConfig]
    var OptimizationMetric: js.UndefOr[OptimizationMetric]
    var ReferencePredictorArn: js.UndefOr[Arn]
    var Tags: js.UndefOr[Tags]
    var TimeAlignmentBoundary: js.UndefOr[TimeAlignmentBoundary]
  }

  object CreateAutoPredictorRequest {
    @inline
    def apply(
        PredictorName: Name,
        DataConfig: js.UndefOr[DataConfig] = js.undefined,
        EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined,
        ExplainPredictor: js.UndefOr[Boolean] = js.undefined,
        ForecastDimensions: js.UndefOr[ForecastDimensions] = js.undefined,
        ForecastFrequency: js.UndefOr[Frequency] = js.undefined,
        ForecastHorizon: js.UndefOr[Int] = js.undefined,
        ForecastTypes: js.UndefOr[ForecastTypes] = js.undefined,
        MonitorConfig: js.UndefOr[MonitorConfig] = js.undefined,
        OptimizationMetric: js.UndefOr[OptimizationMetric] = js.undefined,
        ReferencePredictorArn: js.UndefOr[Arn] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TimeAlignmentBoundary: js.UndefOr[TimeAlignmentBoundary] = js.undefined
    ): CreateAutoPredictorRequest = {
      val __obj = js.Dynamic.literal(
        "PredictorName" -> PredictorName.asInstanceOf[js.Any]
      )

      DataConfig.foreach(__v => __obj.updateDynamic("DataConfig")(__v.asInstanceOf[js.Any]))
      EncryptionConfig.foreach(__v => __obj.updateDynamic("EncryptionConfig")(__v.asInstanceOf[js.Any]))
      ExplainPredictor.foreach(__v => __obj.updateDynamic("ExplainPredictor")(__v.asInstanceOf[js.Any]))
      ForecastDimensions.foreach(__v => __obj.updateDynamic("ForecastDimensions")(__v.asInstanceOf[js.Any]))
      ForecastFrequency.foreach(__v => __obj.updateDynamic("ForecastFrequency")(__v.asInstanceOf[js.Any]))
      ForecastHorizon.foreach(__v => __obj.updateDynamic("ForecastHorizon")(__v.asInstanceOf[js.Any]))
      ForecastTypes.foreach(__v => __obj.updateDynamic("ForecastTypes")(__v.asInstanceOf[js.Any]))
      MonitorConfig.foreach(__v => __obj.updateDynamic("MonitorConfig")(__v.asInstanceOf[js.Any]))
      OptimizationMetric.foreach(__v => __obj.updateDynamic("OptimizationMetric")(__v.asInstanceOf[js.Any]))
      ReferencePredictorArn.foreach(__v => __obj.updateDynamic("ReferencePredictorArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TimeAlignmentBoundary.foreach(__v => __obj.updateDynamic("TimeAlignmentBoundary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAutoPredictorRequest]
    }
  }

  @js.native
  trait CreateAutoPredictorResponse extends js.Object {
    var PredictorArn: js.UndefOr[Arn]
  }

  object CreateAutoPredictorResponse {
    @inline
    def apply(
        PredictorArn: js.UndefOr[Arn] = js.undefined
    ): CreateAutoPredictorResponse = {
      val __obj = js.Dynamic.literal()
      PredictorArn.foreach(__v => __obj.updateDynamic("PredictorArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAutoPredictorResponse]
    }
  }

  @js.native
  trait CreateDatasetGroupRequest extends js.Object {
    var DatasetGroupName: Name
    var Domain: Domain
    var DatasetArns: js.UndefOr[ArnList]
    var Tags: js.UndefOr[Tags]
  }

  object CreateDatasetGroupRequest {
    @inline
    def apply(
        DatasetGroupName: Name,
        Domain: Domain,
        DatasetArns: js.UndefOr[ArnList] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateDatasetGroupRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetGroupName" -> DatasetGroupName.asInstanceOf[js.Any],
        "Domain" -> Domain.asInstanceOf[js.Any]
      )

      DatasetArns.foreach(__v => __obj.updateDynamic("DatasetArns")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetGroupRequest]
    }
  }

  @js.native
  trait CreateDatasetGroupResponse extends js.Object {
    var DatasetGroupArn: js.UndefOr[Arn]
  }

  object CreateDatasetGroupResponse {
    @inline
    def apply(
        DatasetGroupArn: js.UndefOr[Arn] = js.undefined
    ): CreateDatasetGroupResponse = {
      val __obj = js.Dynamic.literal()
      DatasetGroupArn.foreach(__v => __obj.updateDynamic("DatasetGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetGroupResponse]
    }
  }

  @js.native
  trait CreateDatasetImportJobRequest extends js.Object {
    var DataSource: DataSource
    var DatasetArn: Arn
    var DatasetImportJobName: Name
    var Format: js.UndefOr[Format]
    var GeolocationFormat: js.UndefOr[GeolocationFormat]
    var Tags: js.UndefOr[Tags]
    var TimeZone: js.UndefOr[TimeZone]
    var TimestampFormat: js.UndefOr[TimestampFormat]
    var UseGeolocationForTimeZone: js.UndefOr[UseGeolocationForTimeZone]
  }

  object CreateDatasetImportJobRequest {
    @inline
    def apply(
        DataSource: DataSource,
        DatasetArn: Arn,
        DatasetImportJobName: Name,
        Format: js.UndefOr[Format] = js.undefined,
        GeolocationFormat: js.UndefOr[GeolocationFormat] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TimeZone: js.UndefOr[TimeZone] = js.undefined,
        TimestampFormat: js.UndefOr[TimestampFormat] = js.undefined,
        UseGeolocationForTimeZone: js.UndefOr[UseGeolocationForTimeZone] = js.undefined
    ): CreateDatasetImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "DataSource" -> DataSource.asInstanceOf[js.Any],
        "DatasetArn" -> DatasetArn.asInstanceOf[js.Any],
        "DatasetImportJobName" -> DatasetImportJobName.asInstanceOf[js.Any]
      )

      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      GeolocationFormat.foreach(__v => __obj.updateDynamic("GeolocationFormat")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TimeZone.foreach(__v => __obj.updateDynamic("TimeZone")(__v.asInstanceOf[js.Any]))
      TimestampFormat.foreach(__v => __obj.updateDynamic("TimestampFormat")(__v.asInstanceOf[js.Any]))
      UseGeolocationForTimeZone.foreach(__v => __obj.updateDynamic("UseGeolocationForTimeZone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetImportJobRequest]
    }
  }

  @js.native
  trait CreateDatasetImportJobResponse extends js.Object {
    var DatasetImportJobArn: js.UndefOr[Arn]
  }

  object CreateDatasetImportJobResponse {
    @inline
    def apply(
        DatasetImportJobArn: js.UndefOr[Arn] = js.undefined
    ): CreateDatasetImportJobResponse = {
      val __obj = js.Dynamic.literal()
      DatasetImportJobArn.foreach(__v => __obj.updateDynamic("DatasetImportJobArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetImportJobResponse]
    }
  }

  @js.native
  trait CreateDatasetRequest extends js.Object {
    var DatasetName: Name
    var DatasetType: DatasetType
    var Domain: Domain
    var Schema: Schema
    var DataFrequency: js.UndefOr[Frequency]
    var EncryptionConfig: js.UndefOr[EncryptionConfig]
    var Tags: js.UndefOr[Tags]
  }

  object CreateDatasetRequest {
    @inline
    def apply(
        DatasetName: Name,
        DatasetType: DatasetType,
        Domain: Domain,
        Schema: Schema,
        DataFrequency: js.UndefOr[Frequency] = js.undefined,
        EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetName" -> DatasetName.asInstanceOf[js.Any],
        "DatasetType" -> DatasetType.asInstanceOf[js.Any],
        "Domain" -> Domain.asInstanceOf[js.Any],
        "Schema" -> Schema.asInstanceOf[js.Any]
      )

      DataFrequency.foreach(__v => __obj.updateDynamic("DataFrequency")(__v.asInstanceOf[js.Any]))
      EncryptionConfig.foreach(__v => __obj.updateDynamic("EncryptionConfig")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetRequest]
    }
  }

  @js.native
  trait CreateDatasetResponse extends js.Object {
    var DatasetArn: js.UndefOr[Arn]
  }

  object CreateDatasetResponse {
    @inline
    def apply(
        DatasetArn: js.UndefOr[Arn] = js.undefined
    ): CreateDatasetResponse = {
      val __obj = js.Dynamic.literal()
      DatasetArn.foreach(__v => __obj.updateDynamic("DatasetArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetResponse]
    }
  }

  @js.native
  trait CreateExplainabilityExportRequest extends js.Object {
    var Destination: DataDestination
    var ExplainabilityArn: Arn
    var ExplainabilityExportName: Name
    var Format: js.UndefOr[Format]
    var Tags: js.UndefOr[Tags]
  }

  object CreateExplainabilityExportRequest {
    @inline
    def apply(
        Destination: DataDestination,
        ExplainabilityArn: Arn,
        ExplainabilityExportName: Name,
        Format: js.UndefOr[Format] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateExplainabilityExportRequest = {
      val __obj = js.Dynamic.literal(
        "Destination" -> Destination.asInstanceOf[js.Any],
        "ExplainabilityArn" -> ExplainabilityArn.asInstanceOf[js.Any],
        "ExplainabilityExportName" -> ExplainabilityExportName.asInstanceOf[js.Any]
      )

      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateExplainabilityExportRequest]
    }
  }

  @js.native
  trait CreateExplainabilityExportResponse extends js.Object {
    var ExplainabilityExportArn: js.UndefOr[Arn]
  }

  object CreateExplainabilityExportResponse {
    @inline
    def apply(
        ExplainabilityExportArn: js.UndefOr[Arn] = js.undefined
    ): CreateExplainabilityExportResponse = {
      val __obj = js.Dynamic.literal()
      ExplainabilityExportArn.foreach(__v => __obj.updateDynamic("ExplainabilityExportArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateExplainabilityExportResponse]
    }
  }

  @js.native
  trait CreateExplainabilityRequest extends js.Object {
    var ExplainabilityConfig: ExplainabilityConfig
    var ExplainabilityName: Name
    var ResourceArn: Arn
    var DataSource: js.UndefOr[DataSource]
    var EnableVisualization: js.UndefOr[Boolean]
    var EndDateTime: js.UndefOr[LocalDateTime]
    var Schema: js.UndefOr[Schema]
    var StartDateTime: js.UndefOr[LocalDateTime]
    var Tags: js.UndefOr[Tags]
  }

  object CreateExplainabilityRequest {
    @inline
    def apply(
        ExplainabilityConfig: ExplainabilityConfig,
        ExplainabilityName: Name,
        ResourceArn: Arn,
        DataSource: js.UndefOr[DataSource] = js.undefined,
        EnableVisualization: js.UndefOr[Boolean] = js.undefined,
        EndDateTime: js.UndefOr[LocalDateTime] = js.undefined,
        Schema: js.UndefOr[Schema] = js.undefined,
        StartDateTime: js.UndefOr[LocalDateTime] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateExplainabilityRequest = {
      val __obj = js.Dynamic.literal(
        "ExplainabilityConfig" -> ExplainabilityConfig.asInstanceOf[js.Any],
        "ExplainabilityName" -> ExplainabilityName.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      DataSource.foreach(__v => __obj.updateDynamic("DataSource")(__v.asInstanceOf[js.Any]))
      EnableVisualization.foreach(__v => __obj.updateDynamic("EnableVisualization")(__v.asInstanceOf[js.Any]))
      EndDateTime.foreach(__v => __obj.updateDynamic("EndDateTime")(__v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.updateDynamic("Schema")(__v.asInstanceOf[js.Any]))
      StartDateTime.foreach(__v => __obj.updateDynamic("StartDateTime")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateExplainabilityRequest]
    }
  }

  @js.native
  trait CreateExplainabilityResponse extends js.Object {
    var ExplainabilityArn: js.UndefOr[Arn]
  }

  object CreateExplainabilityResponse {
    @inline
    def apply(
        ExplainabilityArn: js.UndefOr[Arn] = js.undefined
    ): CreateExplainabilityResponse = {
      val __obj = js.Dynamic.literal()
      ExplainabilityArn.foreach(__v => __obj.updateDynamic("ExplainabilityArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateExplainabilityResponse]
    }
  }

  @js.native
  trait CreateForecastExportJobRequest extends js.Object {
    var Destination: DataDestination
    var ForecastArn: Arn
    var ForecastExportJobName: Name
    var Format: js.UndefOr[Format]
    var Tags: js.UndefOr[Tags]
  }

  object CreateForecastExportJobRequest {
    @inline
    def apply(
        Destination: DataDestination,
        ForecastArn: Arn,
        ForecastExportJobName: Name,
        Format: js.UndefOr[Format] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateForecastExportJobRequest = {
      val __obj = js.Dynamic.literal(
        "Destination" -> Destination.asInstanceOf[js.Any],
        "ForecastArn" -> ForecastArn.asInstanceOf[js.Any],
        "ForecastExportJobName" -> ForecastExportJobName.asInstanceOf[js.Any]
      )

      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateForecastExportJobRequest]
    }
  }

  @js.native
  trait CreateForecastExportJobResponse extends js.Object {
    var ForecastExportJobArn: js.UndefOr[Arn]
  }

  object CreateForecastExportJobResponse {
    @inline
    def apply(
        ForecastExportJobArn: js.UndefOr[Arn] = js.undefined
    ): CreateForecastExportJobResponse = {
      val __obj = js.Dynamic.literal()
      ForecastExportJobArn.foreach(__v => __obj.updateDynamic("ForecastExportJobArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateForecastExportJobResponse]
    }
  }

  @js.native
  trait CreateForecastRequest extends js.Object {
    var ForecastName: Name
    var PredictorArn: Arn
    var ForecastTypes: js.UndefOr[ForecastTypes]
    var Tags: js.UndefOr[Tags]
    var TimeSeriesSelector: js.UndefOr[TimeSeriesSelector]
  }

  object CreateForecastRequest {
    @inline
    def apply(
        ForecastName: Name,
        PredictorArn: Arn,
        ForecastTypes: js.UndefOr[ForecastTypes] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TimeSeriesSelector: js.UndefOr[TimeSeriesSelector] = js.undefined
    ): CreateForecastRequest = {
      val __obj = js.Dynamic.literal(
        "ForecastName" -> ForecastName.asInstanceOf[js.Any],
        "PredictorArn" -> PredictorArn.asInstanceOf[js.Any]
      )

      ForecastTypes.foreach(__v => __obj.updateDynamic("ForecastTypes")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TimeSeriesSelector.foreach(__v => __obj.updateDynamic("TimeSeriesSelector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateForecastRequest]
    }
  }

  @js.native
  trait CreateForecastResponse extends js.Object {
    var ForecastArn: js.UndefOr[Arn]
  }

  object CreateForecastResponse {
    @inline
    def apply(
        ForecastArn: js.UndefOr[Arn] = js.undefined
    ): CreateForecastResponse = {
      val __obj = js.Dynamic.literal()
      ForecastArn.foreach(__v => __obj.updateDynamic("ForecastArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateForecastResponse]
    }
  }

  @js.native
  trait CreateMonitorRequest extends js.Object {
    var MonitorName: Name
    var ResourceArn: Arn
    var Tags: js.UndefOr[Tags]
  }

  object CreateMonitorRequest {
    @inline
    def apply(
        MonitorName: Name,
        ResourceArn: Arn,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateMonitorRequest = {
      val __obj = js.Dynamic.literal(
        "MonitorName" -> MonitorName.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMonitorRequest]
    }
  }

  @js.native
  trait CreateMonitorResponse extends js.Object {
    var MonitorArn: js.UndefOr[Arn]
  }

  object CreateMonitorResponse {
    @inline
    def apply(
        MonitorArn: js.UndefOr[Arn] = js.undefined
    ): CreateMonitorResponse = {
      val __obj = js.Dynamic.literal()
      MonitorArn.foreach(__v => __obj.updateDynamic("MonitorArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMonitorResponse]
    }
  }

  @js.native
  trait CreatePredictorBacktestExportJobRequest extends js.Object {
    var Destination: DataDestination
    var PredictorArn: Arn
    var PredictorBacktestExportJobName: Name
    var Format: js.UndefOr[Format]
    var Tags: js.UndefOr[Tags]
  }

  object CreatePredictorBacktestExportJobRequest {
    @inline
    def apply(
        Destination: DataDestination,
        PredictorArn: Arn,
        PredictorBacktestExportJobName: Name,
        Format: js.UndefOr[Format] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreatePredictorBacktestExportJobRequest = {
      val __obj = js.Dynamic.literal(
        "Destination" -> Destination.asInstanceOf[js.Any],
        "PredictorArn" -> PredictorArn.asInstanceOf[js.Any],
        "PredictorBacktestExportJobName" -> PredictorBacktestExportJobName.asInstanceOf[js.Any]
      )

      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePredictorBacktestExportJobRequest]
    }
  }

  @js.native
  trait CreatePredictorBacktestExportJobResponse extends js.Object {
    var PredictorBacktestExportJobArn: js.UndefOr[Arn]
  }

  object CreatePredictorBacktestExportJobResponse {
    @inline
    def apply(
        PredictorBacktestExportJobArn: js.UndefOr[Arn] = js.undefined
    ): CreatePredictorBacktestExportJobResponse = {
      val __obj = js.Dynamic.literal()
      PredictorBacktestExportJobArn.foreach(__v => __obj.updateDynamic("PredictorBacktestExportJobArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePredictorBacktestExportJobResponse]
    }
  }

  @js.native
  trait CreatePredictorRequest extends js.Object {
    var FeaturizationConfig: FeaturizationConfig
    var ForecastHorizon: Int
    var InputDataConfig: InputDataConfig
    var PredictorName: Name
    var AlgorithmArn: js.UndefOr[Arn]
    var AutoMLOverrideStrategy: js.UndefOr[AutoMLOverrideStrategy]
    var EncryptionConfig: js.UndefOr[EncryptionConfig]
    var EvaluationParameters: js.UndefOr[EvaluationParameters]
    var ForecastTypes: js.UndefOr[ForecastTypes]
    var HPOConfig: js.UndefOr[HyperParameterTuningJobConfig]
    var OptimizationMetric: js.UndefOr[OptimizationMetric]
    var PerformAutoML: js.UndefOr[Boolean]
    var PerformHPO: js.UndefOr[Boolean]
    var Tags: js.UndefOr[Tags]
    var TrainingParameters: js.UndefOr[TrainingParameters]
  }

  object CreatePredictorRequest {
    @inline
    def apply(
        FeaturizationConfig: FeaturizationConfig,
        ForecastHorizon: Int,
        InputDataConfig: InputDataConfig,
        PredictorName: Name,
        AlgorithmArn: js.UndefOr[Arn] = js.undefined,
        AutoMLOverrideStrategy: js.UndefOr[AutoMLOverrideStrategy] = js.undefined,
        EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined,
        EvaluationParameters: js.UndefOr[EvaluationParameters] = js.undefined,
        ForecastTypes: js.UndefOr[ForecastTypes] = js.undefined,
        HPOConfig: js.UndefOr[HyperParameterTuningJobConfig] = js.undefined,
        OptimizationMetric: js.UndefOr[OptimizationMetric] = js.undefined,
        PerformAutoML: js.UndefOr[Boolean] = js.undefined,
        PerformHPO: js.UndefOr[Boolean] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TrainingParameters: js.UndefOr[TrainingParameters] = js.undefined
    ): CreatePredictorRequest = {
      val __obj = js.Dynamic.literal(
        "FeaturizationConfig" -> FeaturizationConfig.asInstanceOf[js.Any],
        "ForecastHorizon" -> ForecastHorizon.asInstanceOf[js.Any],
        "InputDataConfig" -> InputDataConfig.asInstanceOf[js.Any],
        "PredictorName" -> PredictorName.asInstanceOf[js.Any]
      )

      AlgorithmArn.foreach(__v => __obj.updateDynamic("AlgorithmArn")(__v.asInstanceOf[js.Any]))
      AutoMLOverrideStrategy.foreach(__v => __obj.updateDynamic("AutoMLOverrideStrategy")(__v.asInstanceOf[js.Any]))
      EncryptionConfig.foreach(__v => __obj.updateDynamic("EncryptionConfig")(__v.asInstanceOf[js.Any]))
      EvaluationParameters.foreach(__v => __obj.updateDynamic("EvaluationParameters")(__v.asInstanceOf[js.Any]))
      ForecastTypes.foreach(__v => __obj.updateDynamic("ForecastTypes")(__v.asInstanceOf[js.Any]))
      HPOConfig.foreach(__v => __obj.updateDynamic("HPOConfig")(__v.asInstanceOf[js.Any]))
      OptimizationMetric.foreach(__v => __obj.updateDynamic("OptimizationMetric")(__v.asInstanceOf[js.Any]))
      PerformAutoML.foreach(__v => __obj.updateDynamic("PerformAutoML")(__v.asInstanceOf[js.Any]))
      PerformHPO.foreach(__v => __obj.updateDynamic("PerformHPO")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TrainingParameters.foreach(__v => __obj.updateDynamic("TrainingParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePredictorRequest]
    }
  }

  @js.native
  trait CreatePredictorResponse extends js.Object {
    var PredictorArn: js.UndefOr[Arn]
  }

  object CreatePredictorResponse {
    @inline
    def apply(
        PredictorArn: js.UndefOr[Arn] = js.undefined
    ): CreatePredictorResponse = {
      val __obj = js.Dynamic.literal()
      PredictorArn.foreach(__v => __obj.updateDynamic("PredictorArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePredictorResponse]
    }
  }

  @js.native
  trait CreateWhatIfAnalysisRequest extends js.Object {
    var ForecastArn: Arn
    var WhatIfAnalysisName: Name
    var Tags: js.UndefOr[Tags]
    var TimeSeriesSelector: js.UndefOr[TimeSeriesSelector]
  }

  object CreateWhatIfAnalysisRequest {
    @inline
    def apply(
        ForecastArn: Arn,
        WhatIfAnalysisName: Name,
        Tags: js.UndefOr[Tags] = js.undefined,
        TimeSeriesSelector: js.UndefOr[TimeSeriesSelector] = js.undefined
    ): CreateWhatIfAnalysisRequest = {
      val __obj = js.Dynamic.literal(
        "ForecastArn" -> ForecastArn.asInstanceOf[js.Any],
        "WhatIfAnalysisName" -> WhatIfAnalysisName.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TimeSeriesSelector.foreach(__v => __obj.updateDynamic("TimeSeriesSelector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWhatIfAnalysisRequest]
    }
  }

  @js.native
  trait CreateWhatIfAnalysisResponse extends js.Object {
    var WhatIfAnalysisArn: js.UndefOr[Arn]
  }

  object CreateWhatIfAnalysisResponse {
    @inline
    def apply(
        WhatIfAnalysisArn: js.UndefOr[Arn] = js.undefined
    ): CreateWhatIfAnalysisResponse = {
      val __obj = js.Dynamic.literal()
      WhatIfAnalysisArn.foreach(__v => __obj.updateDynamic("WhatIfAnalysisArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWhatIfAnalysisResponse]
    }
  }

  @js.native
  trait CreateWhatIfForecastExportRequest extends js.Object {
    var Destination: DataDestination
    var WhatIfForecastArns: WhatIfForecastArnListForExport
    var WhatIfForecastExportName: Name
    var Format: js.UndefOr[Format]
    var Tags: js.UndefOr[Tags]
  }

  object CreateWhatIfForecastExportRequest {
    @inline
    def apply(
        Destination: DataDestination,
        WhatIfForecastArns: WhatIfForecastArnListForExport,
        WhatIfForecastExportName: Name,
        Format: js.UndefOr[Format] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateWhatIfForecastExportRequest = {
      val __obj = js.Dynamic.literal(
        "Destination" -> Destination.asInstanceOf[js.Any],
        "WhatIfForecastArns" -> WhatIfForecastArns.asInstanceOf[js.Any],
        "WhatIfForecastExportName" -> WhatIfForecastExportName.asInstanceOf[js.Any]
      )

      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWhatIfForecastExportRequest]
    }
  }

  @js.native
  trait CreateWhatIfForecastExportResponse extends js.Object {
    var WhatIfForecastExportArn: js.UndefOr[LongArn]
  }

  object CreateWhatIfForecastExportResponse {
    @inline
    def apply(
        WhatIfForecastExportArn: js.UndefOr[LongArn] = js.undefined
    ): CreateWhatIfForecastExportResponse = {
      val __obj = js.Dynamic.literal()
      WhatIfForecastExportArn.foreach(__v => __obj.updateDynamic("WhatIfForecastExportArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWhatIfForecastExportResponse]
    }
  }

  @js.native
  trait CreateWhatIfForecastRequest extends js.Object {
    var WhatIfAnalysisArn: Arn
    var WhatIfForecastName: Name
    var Tags: js.UndefOr[Tags]
    var TimeSeriesReplacementsDataSource: js.UndefOr[TimeSeriesReplacementsDataSource]
    var TimeSeriesTransformations: js.UndefOr[TimeSeriesTransformations]
  }

  object CreateWhatIfForecastRequest {
    @inline
    def apply(
        WhatIfAnalysisArn: Arn,
        WhatIfForecastName: Name,
        Tags: js.UndefOr[Tags] = js.undefined,
        TimeSeriesReplacementsDataSource: js.UndefOr[TimeSeriesReplacementsDataSource] = js.undefined,
        TimeSeriesTransformations: js.UndefOr[TimeSeriesTransformations] = js.undefined
    ): CreateWhatIfForecastRequest = {
      val __obj = js.Dynamic.literal(
        "WhatIfAnalysisArn" -> WhatIfAnalysisArn.asInstanceOf[js.Any],
        "WhatIfForecastName" -> WhatIfForecastName.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TimeSeriesReplacementsDataSource.foreach(__v => __obj.updateDynamic("TimeSeriesReplacementsDataSource")(__v.asInstanceOf[js.Any]))
      TimeSeriesTransformations.foreach(__v => __obj.updateDynamic("TimeSeriesTransformations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWhatIfForecastRequest]
    }
  }

  @js.native
  trait CreateWhatIfForecastResponse extends js.Object {
    var WhatIfForecastArn: js.UndefOr[LongArn]
  }

  object CreateWhatIfForecastResponse {
    @inline
    def apply(
        WhatIfForecastArn: js.UndefOr[LongArn] = js.undefined
    ): CreateWhatIfForecastResponse = {
      val __obj = js.Dynamic.literal()
      WhatIfForecastArn.foreach(__v => __obj.updateDynamic("WhatIfForecastArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWhatIfForecastResponse]
    }
  }

  /** The data configuration for your dataset group and any additional datasets.
    */
  @js.native
  trait DataConfig extends js.Object {
    var DatasetGroupArn: Arn
    var AdditionalDatasets: js.UndefOr[AdditionalDatasets]
    var AttributeConfigs: js.UndefOr[AttributeConfigs]
  }

  object DataConfig {
    @inline
    def apply(
        DatasetGroupArn: Arn,
        AdditionalDatasets: js.UndefOr[AdditionalDatasets] = js.undefined,
        AttributeConfigs: js.UndefOr[AttributeConfigs] = js.undefined
    ): DataConfig = {
      val __obj = js.Dynamic.literal(
        "DatasetGroupArn" -> DatasetGroupArn.asInstanceOf[js.Any]
      )

      AdditionalDatasets.foreach(__v => __obj.updateDynamic("AdditionalDatasets")(__v.asInstanceOf[js.Any]))
      AttributeConfigs.foreach(__v => __obj.updateDynamic("AttributeConfigs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataConfig]
    }
  }

  /** The destination for an export job. Provide an S3 path, an AWS Identity and Access Management (IAM) role that allows Amazon Forecast to access the location, and an AWS Key Management Service (KMS) key (optional).
    */
  @js.native
  trait DataDestination extends js.Object {
    var S3Config: S3Config
  }

  object DataDestination {
    @inline
    def apply(
        S3Config: S3Config
    ): DataDestination = {
      val __obj = js.Dynamic.literal(
        "S3Config" -> S3Config.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataDestination]
    }
  }

  /** The source of your data, an AWS Identity and Access Management (IAM) role that allows Amazon Forecast to access the data and, optionally, an AWS Key Management Service (KMS) key.
    */
  @js.native
  trait DataSource extends js.Object {
    var S3Config: S3Config
  }

  object DataSource {
    @inline
    def apply(
        S3Config: S3Config
    ): DataSource = {
      val __obj = js.Dynamic.literal(
        "S3Config" -> S3Config.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataSource]
    }
  }

  /** Provides a summary of the dataset group properties used in the [[https://docs.aws.amazon.com/forecast/latest/dg/API_ListDatasetGroups.html|ListDatasetGroups]] operation. To get the complete set of properties, call the [[https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDatasetGroup.html|DescribeDatasetGroup]] operation, and provide the <code>DatasetGroupArn</code>.
    */
  @js.native
  trait DatasetGroupSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DatasetGroupArn: js.UndefOr[Arn]
    var DatasetGroupName: js.UndefOr[Name]
    var LastModificationTime: js.UndefOr[Timestamp]
  }

  object DatasetGroupSummary {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DatasetGroupArn: js.UndefOr[Arn] = js.undefined,
        DatasetGroupName: js.UndefOr[Name] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined
    ): DatasetGroupSummary = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DatasetGroupArn.foreach(__v => __obj.updateDynamic("DatasetGroupArn")(__v.asInstanceOf[js.Any]))
      DatasetGroupName.foreach(__v => __obj.updateDynamic("DatasetGroupName")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetGroupSummary]
    }
  }

  /** Provides a summary of the dataset import job properties used in the [[https://docs.aws.amazon.com/forecast/latest/dg/API_ListDatasetImportJobs.html|ListDatasetImportJobs]] operation. To get the complete set of properties, call the [[https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDatasetImportJob.html|DescribeDatasetImportJob]] operation, and provide the <code>DatasetImportJobArn</code>.
    */
  @js.native
  trait DatasetImportJobSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DataSource: js.UndefOr[DataSource]
    var DatasetImportJobArn: js.UndefOr[Arn]
    var DatasetImportJobName: js.UndefOr[Name]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[ErrorMessage]
    var Status: js.UndefOr[Status]
  }

  object DatasetImportJobSummary {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DataSource: js.UndefOr[DataSource] = js.undefined,
        DatasetImportJobArn: js.UndefOr[Arn] = js.undefined,
        DatasetImportJobName: js.UndefOr[Name] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[ErrorMessage] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): DatasetImportJobSummary = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DataSource.foreach(__v => __obj.updateDynamic("DataSource")(__v.asInstanceOf[js.Any]))
      DatasetImportJobArn.foreach(__v => __obj.updateDynamic("DatasetImportJobArn")(__v.asInstanceOf[js.Any]))
      DatasetImportJobName.foreach(__v => __obj.updateDynamic("DatasetImportJobName")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetImportJobSummary]
    }
  }

  /** Provides a summary of the dataset properties used in the [[https://docs.aws.amazon.com/forecast/latest/dg/API_ListDatasets.html|ListDatasets]] operation. To get the complete set of properties, call the [[https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDataset.html|DescribeDataset]] operation, and provide the <code>DatasetArn</code>.
    */
  @js.native
  trait DatasetSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DatasetArn: js.UndefOr[Arn]
    var DatasetName: js.UndefOr[Name]
    var DatasetType: js.UndefOr[DatasetType]
    var Domain: js.UndefOr[Domain]
    var LastModificationTime: js.UndefOr[Timestamp]
  }

  object DatasetSummary {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DatasetArn: js.UndefOr[Arn] = js.undefined,
        DatasetName: js.UndefOr[Name] = js.undefined,
        DatasetType: js.UndefOr[DatasetType] = js.undefined,
        Domain: js.UndefOr[Domain] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined
    ): DatasetSummary = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DatasetArn.foreach(__v => __obj.updateDynamic("DatasetArn")(__v.asInstanceOf[js.Any]))
      DatasetName.foreach(__v => __obj.updateDynamic("DatasetName")(__v.asInstanceOf[js.Any]))
      DatasetType.foreach(__v => __obj.updateDynamic("DatasetType")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatasetSummary]
    }
  }

  @js.native
  trait DeleteDatasetGroupRequest extends js.Object {
    var DatasetGroupArn: Arn
  }

  object DeleteDatasetGroupRequest {
    @inline
    def apply(
        DatasetGroupArn: Arn
    ): DeleteDatasetGroupRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetGroupArn" -> DatasetGroupArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDatasetGroupRequest]
    }
  }

  @js.native
  trait DeleteDatasetImportJobRequest extends js.Object {
    var DatasetImportJobArn: Arn
  }

  object DeleteDatasetImportJobRequest {
    @inline
    def apply(
        DatasetImportJobArn: Arn
    ): DeleteDatasetImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetImportJobArn" -> DatasetImportJobArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDatasetImportJobRequest]
    }
  }

  @js.native
  trait DeleteDatasetRequest extends js.Object {
    var DatasetArn: Arn
  }

  object DeleteDatasetRequest {
    @inline
    def apply(
        DatasetArn: Arn
    ): DeleteDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetArn" -> DatasetArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDatasetRequest]
    }
  }

  @js.native
  trait DeleteExplainabilityExportRequest extends js.Object {
    var ExplainabilityExportArn: Arn
  }

  object DeleteExplainabilityExportRequest {
    @inline
    def apply(
        ExplainabilityExportArn: Arn
    ): DeleteExplainabilityExportRequest = {
      val __obj = js.Dynamic.literal(
        "ExplainabilityExportArn" -> ExplainabilityExportArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteExplainabilityExportRequest]
    }
  }

  @js.native
  trait DeleteExplainabilityRequest extends js.Object {
    var ExplainabilityArn: Arn
  }

  object DeleteExplainabilityRequest {
    @inline
    def apply(
        ExplainabilityArn: Arn
    ): DeleteExplainabilityRequest = {
      val __obj = js.Dynamic.literal(
        "ExplainabilityArn" -> ExplainabilityArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteExplainabilityRequest]
    }
  }

  @js.native
  trait DeleteForecastExportJobRequest extends js.Object {
    var ForecastExportJobArn: Arn
  }

  object DeleteForecastExportJobRequest {
    @inline
    def apply(
        ForecastExportJobArn: Arn
    ): DeleteForecastExportJobRequest = {
      val __obj = js.Dynamic.literal(
        "ForecastExportJobArn" -> ForecastExportJobArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteForecastExportJobRequest]
    }
  }

  @js.native
  trait DeleteForecastRequest extends js.Object {
    var ForecastArn: Arn
  }

  object DeleteForecastRequest {
    @inline
    def apply(
        ForecastArn: Arn
    ): DeleteForecastRequest = {
      val __obj = js.Dynamic.literal(
        "ForecastArn" -> ForecastArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteForecastRequest]
    }
  }

  @js.native
  trait DeleteMonitorRequest extends js.Object {
    var MonitorArn: Arn
  }

  object DeleteMonitorRequest {
    @inline
    def apply(
        MonitorArn: Arn
    ): DeleteMonitorRequest = {
      val __obj = js.Dynamic.literal(
        "MonitorArn" -> MonitorArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMonitorRequest]
    }
  }

  @js.native
  trait DeletePredictorBacktestExportJobRequest extends js.Object {
    var PredictorBacktestExportJobArn: Arn
  }

  object DeletePredictorBacktestExportJobRequest {
    @inline
    def apply(
        PredictorBacktestExportJobArn: Arn
    ): DeletePredictorBacktestExportJobRequest = {
      val __obj = js.Dynamic.literal(
        "PredictorBacktestExportJobArn" -> PredictorBacktestExportJobArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePredictorBacktestExportJobRequest]
    }
  }

  @js.native
  trait DeletePredictorRequest extends js.Object {
    var PredictorArn: Arn
  }

  object DeletePredictorRequest {
    @inline
    def apply(
        PredictorArn: Arn
    ): DeletePredictorRequest = {
      val __obj = js.Dynamic.literal(
        "PredictorArn" -> PredictorArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePredictorRequest]
    }
  }

  @js.native
  trait DeleteResourceTreeRequest extends js.Object {
    var ResourceArn: Arn
  }

  object DeleteResourceTreeRequest {
    @inline
    def apply(
        ResourceArn: Arn
    ): DeleteResourceTreeRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteResourceTreeRequest]
    }
  }

  @js.native
  trait DeleteWhatIfAnalysisRequest extends js.Object {
    var WhatIfAnalysisArn: Arn
  }

  object DeleteWhatIfAnalysisRequest {
    @inline
    def apply(
        WhatIfAnalysisArn: Arn
    ): DeleteWhatIfAnalysisRequest = {
      val __obj = js.Dynamic.literal(
        "WhatIfAnalysisArn" -> WhatIfAnalysisArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWhatIfAnalysisRequest]
    }
  }

  @js.native
  trait DeleteWhatIfForecastExportRequest extends js.Object {
    var WhatIfForecastExportArn: LongArn
  }

  object DeleteWhatIfForecastExportRequest {
    @inline
    def apply(
        WhatIfForecastExportArn: LongArn
    ): DeleteWhatIfForecastExportRequest = {
      val __obj = js.Dynamic.literal(
        "WhatIfForecastExportArn" -> WhatIfForecastExportArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWhatIfForecastExportRequest]
    }
  }

  @js.native
  trait DeleteWhatIfForecastRequest extends js.Object {
    var WhatIfForecastArn: LongArn
  }

  object DeleteWhatIfForecastRequest {
    @inline
    def apply(
        WhatIfForecastArn: LongArn
    ): DeleteWhatIfForecastRequest = {
      val __obj = js.Dynamic.literal(
        "WhatIfForecastArn" -> WhatIfForecastArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWhatIfForecastRequest]
    }
  }

  @js.native
  trait DescribeAutoPredictorRequest extends js.Object {
    var PredictorArn: Arn
  }

  object DescribeAutoPredictorRequest {
    @inline
    def apply(
        PredictorArn: Arn
    ): DescribeAutoPredictorRequest = {
      val __obj = js.Dynamic.literal(
        "PredictorArn" -> PredictorArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAutoPredictorRequest]
    }
  }

  @js.native
  trait DescribeAutoPredictorResponse extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DataConfig: js.UndefOr[DataConfig]
    var DatasetImportJobArns: js.UndefOr[ArnList]
    var EncryptionConfig: js.UndefOr[EncryptionConfig]
    var EstimatedTimeRemainingInMinutes: js.UndefOr[Double]
    var ExplainabilityInfo: js.UndefOr[ExplainabilityInfo]
    var ForecastDimensions: js.UndefOr[ForecastDimensions]
    var ForecastFrequency: js.UndefOr[Frequency]
    var ForecastHorizon: js.UndefOr[Int]
    var ForecastTypes: js.UndefOr[ForecastTypes]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[Message]
    var MonitorInfo: js.UndefOr[MonitorInfo]
    var OptimizationMetric: js.UndefOr[OptimizationMetric]
    var PredictorArn: js.UndefOr[Arn]
    var PredictorName: js.UndefOr[Name]
    var ReferencePredictorSummary: js.UndefOr[ReferencePredictorSummary]
    var Status: js.UndefOr[Status]
    var TimeAlignmentBoundary: js.UndefOr[TimeAlignmentBoundary]
  }

  object DescribeAutoPredictorResponse {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DataConfig: js.UndefOr[DataConfig] = js.undefined,
        DatasetImportJobArns: js.UndefOr[ArnList] = js.undefined,
        EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined,
        EstimatedTimeRemainingInMinutes: js.UndefOr[Double] = js.undefined,
        ExplainabilityInfo: js.UndefOr[ExplainabilityInfo] = js.undefined,
        ForecastDimensions: js.UndefOr[ForecastDimensions] = js.undefined,
        ForecastFrequency: js.UndefOr[Frequency] = js.undefined,
        ForecastHorizon: js.UndefOr[Int] = js.undefined,
        ForecastTypes: js.UndefOr[ForecastTypes] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        MonitorInfo: js.UndefOr[MonitorInfo] = js.undefined,
        OptimizationMetric: js.UndefOr[OptimizationMetric] = js.undefined,
        PredictorArn: js.UndefOr[Arn] = js.undefined,
        PredictorName: js.UndefOr[Name] = js.undefined,
        ReferencePredictorSummary: js.UndefOr[ReferencePredictorSummary] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined,
        TimeAlignmentBoundary: js.UndefOr[TimeAlignmentBoundary] = js.undefined
    ): DescribeAutoPredictorResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DataConfig.foreach(__v => __obj.updateDynamic("DataConfig")(__v.asInstanceOf[js.Any]))
      DatasetImportJobArns.foreach(__v => __obj.updateDynamic("DatasetImportJobArns")(__v.asInstanceOf[js.Any]))
      EncryptionConfig.foreach(__v => __obj.updateDynamic("EncryptionConfig")(__v.asInstanceOf[js.Any]))
      EstimatedTimeRemainingInMinutes.foreach(__v => __obj.updateDynamic("EstimatedTimeRemainingInMinutes")(__v.asInstanceOf[js.Any]))
      ExplainabilityInfo.foreach(__v => __obj.updateDynamic("ExplainabilityInfo")(__v.asInstanceOf[js.Any]))
      ForecastDimensions.foreach(__v => __obj.updateDynamic("ForecastDimensions")(__v.asInstanceOf[js.Any]))
      ForecastFrequency.foreach(__v => __obj.updateDynamic("ForecastFrequency")(__v.asInstanceOf[js.Any]))
      ForecastHorizon.foreach(__v => __obj.updateDynamic("ForecastHorizon")(__v.asInstanceOf[js.Any]))
      ForecastTypes.foreach(__v => __obj.updateDynamic("ForecastTypes")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      MonitorInfo.foreach(__v => __obj.updateDynamic("MonitorInfo")(__v.asInstanceOf[js.Any]))
      OptimizationMetric.foreach(__v => __obj.updateDynamic("OptimizationMetric")(__v.asInstanceOf[js.Any]))
      PredictorArn.foreach(__v => __obj.updateDynamic("PredictorArn")(__v.asInstanceOf[js.Any]))
      PredictorName.foreach(__v => __obj.updateDynamic("PredictorName")(__v.asInstanceOf[js.Any]))
      ReferencePredictorSummary.foreach(__v => __obj.updateDynamic("ReferencePredictorSummary")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TimeAlignmentBoundary.foreach(__v => __obj.updateDynamic("TimeAlignmentBoundary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAutoPredictorResponse]
    }
  }

  @js.native
  trait DescribeDatasetGroupRequest extends js.Object {
    var DatasetGroupArn: Arn
  }

  object DescribeDatasetGroupRequest {
    @inline
    def apply(
        DatasetGroupArn: Arn
    ): DescribeDatasetGroupRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetGroupArn" -> DatasetGroupArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDatasetGroupRequest]
    }
  }

  @js.native
  trait DescribeDatasetGroupResponse extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DatasetArns: js.UndefOr[ArnList]
    var DatasetGroupArn: js.UndefOr[Arn]
    var DatasetGroupName: js.UndefOr[Name]
    var Domain: js.UndefOr[Domain]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Status: js.UndefOr[Status]
  }

  object DescribeDatasetGroupResponse {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DatasetArns: js.UndefOr[ArnList] = js.undefined,
        DatasetGroupArn: js.UndefOr[Arn] = js.undefined,
        DatasetGroupName: js.UndefOr[Name] = js.undefined,
        Domain: js.UndefOr[Domain] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): DescribeDatasetGroupResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DatasetArns.foreach(__v => __obj.updateDynamic("DatasetArns")(__v.asInstanceOf[js.Any]))
      DatasetGroupArn.foreach(__v => __obj.updateDynamic("DatasetGroupArn")(__v.asInstanceOf[js.Any]))
      DatasetGroupName.foreach(__v => __obj.updateDynamic("DatasetGroupName")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDatasetGroupResponse]
    }
  }

  @js.native
  trait DescribeDatasetImportJobRequest extends js.Object {
    var DatasetImportJobArn: Arn
  }

  object DescribeDatasetImportJobRequest {
    @inline
    def apply(
        DatasetImportJobArn: Arn
    ): DescribeDatasetImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetImportJobArn" -> DatasetImportJobArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDatasetImportJobRequest]
    }
  }

  @js.native
  trait DescribeDatasetImportJobResponse extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DataSize: js.UndefOr[Double]
    var DataSource: js.UndefOr[DataSource]
    var DatasetArn: js.UndefOr[Arn]
    var DatasetImportJobArn: js.UndefOr[Arn]
    var DatasetImportJobName: js.UndefOr[Name]
    var EstimatedTimeRemainingInMinutes: js.UndefOr[Double]
    var FieldStatistics: js.UndefOr[FieldStatistics]
    var Format: js.UndefOr[Format]
    var GeolocationFormat: js.UndefOr[GeolocationFormat]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[Message]
    var Status: js.UndefOr[Status]
    var TimeZone: js.UndefOr[TimeZone]
    var TimestampFormat: js.UndefOr[TimestampFormat]
    var UseGeolocationForTimeZone: js.UndefOr[UseGeolocationForTimeZone]
  }

  object DescribeDatasetImportJobResponse {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DataSize: js.UndefOr[Double] = js.undefined,
        DataSource: js.UndefOr[DataSource] = js.undefined,
        DatasetArn: js.UndefOr[Arn] = js.undefined,
        DatasetImportJobArn: js.UndefOr[Arn] = js.undefined,
        DatasetImportJobName: js.UndefOr[Name] = js.undefined,
        EstimatedTimeRemainingInMinutes: js.UndefOr[Double] = js.undefined,
        FieldStatistics: js.UndefOr[FieldStatistics] = js.undefined,
        Format: js.UndefOr[Format] = js.undefined,
        GeolocationFormat: js.UndefOr[GeolocationFormat] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined,
        TimeZone: js.UndefOr[TimeZone] = js.undefined,
        TimestampFormat: js.UndefOr[TimestampFormat] = js.undefined,
        UseGeolocationForTimeZone: js.UndefOr[UseGeolocationForTimeZone] = js.undefined
    ): DescribeDatasetImportJobResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DataSize.foreach(__v => __obj.updateDynamic("DataSize")(__v.asInstanceOf[js.Any]))
      DataSource.foreach(__v => __obj.updateDynamic("DataSource")(__v.asInstanceOf[js.Any]))
      DatasetArn.foreach(__v => __obj.updateDynamic("DatasetArn")(__v.asInstanceOf[js.Any]))
      DatasetImportJobArn.foreach(__v => __obj.updateDynamic("DatasetImportJobArn")(__v.asInstanceOf[js.Any]))
      DatasetImportJobName.foreach(__v => __obj.updateDynamic("DatasetImportJobName")(__v.asInstanceOf[js.Any]))
      EstimatedTimeRemainingInMinutes.foreach(__v => __obj.updateDynamic("EstimatedTimeRemainingInMinutes")(__v.asInstanceOf[js.Any]))
      FieldStatistics.foreach(__v => __obj.updateDynamic("FieldStatistics")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      GeolocationFormat.foreach(__v => __obj.updateDynamic("GeolocationFormat")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TimeZone.foreach(__v => __obj.updateDynamic("TimeZone")(__v.asInstanceOf[js.Any]))
      TimestampFormat.foreach(__v => __obj.updateDynamic("TimestampFormat")(__v.asInstanceOf[js.Any]))
      UseGeolocationForTimeZone.foreach(__v => __obj.updateDynamic("UseGeolocationForTimeZone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDatasetImportJobResponse]
    }
  }

  @js.native
  trait DescribeDatasetRequest extends js.Object {
    var DatasetArn: Arn
  }

  object DescribeDatasetRequest {
    @inline
    def apply(
        DatasetArn: Arn
    ): DescribeDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetArn" -> DatasetArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDatasetRequest]
    }
  }

  @js.native
  trait DescribeDatasetResponse extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DataFrequency: js.UndefOr[Frequency]
    var DatasetArn: js.UndefOr[Arn]
    var DatasetName: js.UndefOr[Name]
    var DatasetType: js.UndefOr[DatasetType]
    var Domain: js.UndefOr[Domain]
    var EncryptionConfig: js.UndefOr[EncryptionConfig]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Schema: js.UndefOr[Schema]
    var Status: js.UndefOr[Status]
  }

  object DescribeDatasetResponse {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DataFrequency: js.UndefOr[Frequency] = js.undefined,
        DatasetArn: js.UndefOr[Arn] = js.undefined,
        DatasetName: js.UndefOr[Name] = js.undefined,
        DatasetType: js.UndefOr[DatasetType] = js.undefined,
        Domain: js.UndefOr[Domain] = js.undefined,
        EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Schema: js.UndefOr[Schema] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): DescribeDatasetResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DataFrequency.foreach(__v => __obj.updateDynamic("DataFrequency")(__v.asInstanceOf[js.Any]))
      DatasetArn.foreach(__v => __obj.updateDynamic("DatasetArn")(__v.asInstanceOf[js.Any]))
      DatasetName.foreach(__v => __obj.updateDynamic("DatasetName")(__v.asInstanceOf[js.Any]))
      DatasetType.foreach(__v => __obj.updateDynamic("DatasetType")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      EncryptionConfig.foreach(__v => __obj.updateDynamic("EncryptionConfig")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.updateDynamic("Schema")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDatasetResponse]
    }
  }

  @js.native
  trait DescribeExplainabilityExportRequest extends js.Object {
    var ExplainabilityExportArn: Arn
  }

  object DescribeExplainabilityExportRequest {
    @inline
    def apply(
        ExplainabilityExportArn: Arn
    ): DescribeExplainabilityExportRequest = {
      val __obj = js.Dynamic.literal(
        "ExplainabilityExportArn" -> ExplainabilityExportArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeExplainabilityExportRequest]
    }
  }

  @js.native
  trait DescribeExplainabilityExportResponse extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var Destination: js.UndefOr[DataDestination]
    var ExplainabilityArn: js.UndefOr[Arn]
    var ExplainabilityExportArn: js.UndefOr[Arn]
    var ExplainabilityExportName: js.UndefOr[Name]
    var Format: js.UndefOr[Format]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[Message]
    var Status: js.UndefOr[Status]
  }

  object DescribeExplainabilityExportResponse {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Destination: js.UndefOr[DataDestination] = js.undefined,
        ExplainabilityArn: js.UndefOr[Arn] = js.undefined,
        ExplainabilityExportArn: js.UndefOr[Arn] = js.undefined,
        ExplainabilityExportName: js.UndefOr[Name] = js.undefined,
        Format: js.UndefOr[Format] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): DescribeExplainabilityExportResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      ExplainabilityArn.foreach(__v => __obj.updateDynamic("ExplainabilityArn")(__v.asInstanceOf[js.Any]))
      ExplainabilityExportArn.foreach(__v => __obj.updateDynamic("ExplainabilityExportArn")(__v.asInstanceOf[js.Any]))
      ExplainabilityExportName.foreach(__v => __obj.updateDynamic("ExplainabilityExportName")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeExplainabilityExportResponse]
    }
  }

  @js.native
  trait DescribeExplainabilityRequest extends js.Object {
    var ExplainabilityArn: Arn
  }

  object DescribeExplainabilityRequest {
    @inline
    def apply(
        ExplainabilityArn: Arn
    ): DescribeExplainabilityRequest = {
      val __obj = js.Dynamic.literal(
        "ExplainabilityArn" -> ExplainabilityArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeExplainabilityRequest]
    }
  }

  @js.native
  trait DescribeExplainabilityResponse extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DataSource: js.UndefOr[DataSource]
    var EnableVisualization: js.UndefOr[Boolean]
    var EndDateTime: js.UndefOr[LocalDateTime]
    var EstimatedTimeRemainingInMinutes: js.UndefOr[Double]
    var ExplainabilityArn: js.UndefOr[Arn]
    var ExplainabilityConfig: js.UndefOr[ExplainabilityConfig]
    var ExplainabilityName: js.UndefOr[Name]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[Message]
    var ResourceArn: js.UndefOr[Arn]
    var Schema: js.UndefOr[Schema]
    var StartDateTime: js.UndefOr[LocalDateTime]
    var Status: js.UndefOr[Status]
  }

  object DescribeExplainabilityResponse {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DataSource: js.UndefOr[DataSource] = js.undefined,
        EnableVisualization: js.UndefOr[Boolean] = js.undefined,
        EndDateTime: js.UndefOr[LocalDateTime] = js.undefined,
        EstimatedTimeRemainingInMinutes: js.UndefOr[Double] = js.undefined,
        ExplainabilityArn: js.UndefOr[Arn] = js.undefined,
        ExplainabilityConfig: js.UndefOr[ExplainabilityConfig] = js.undefined,
        ExplainabilityName: js.UndefOr[Name] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        ResourceArn: js.UndefOr[Arn] = js.undefined,
        Schema: js.UndefOr[Schema] = js.undefined,
        StartDateTime: js.UndefOr[LocalDateTime] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): DescribeExplainabilityResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DataSource.foreach(__v => __obj.updateDynamic("DataSource")(__v.asInstanceOf[js.Any]))
      EnableVisualization.foreach(__v => __obj.updateDynamic("EnableVisualization")(__v.asInstanceOf[js.Any]))
      EndDateTime.foreach(__v => __obj.updateDynamic("EndDateTime")(__v.asInstanceOf[js.Any]))
      EstimatedTimeRemainingInMinutes.foreach(__v => __obj.updateDynamic("EstimatedTimeRemainingInMinutes")(__v.asInstanceOf[js.Any]))
      ExplainabilityArn.foreach(__v => __obj.updateDynamic("ExplainabilityArn")(__v.asInstanceOf[js.Any]))
      ExplainabilityConfig.foreach(__v => __obj.updateDynamic("ExplainabilityConfig")(__v.asInstanceOf[js.Any]))
      ExplainabilityName.foreach(__v => __obj.updateDynamic("ExplainabilityName")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.updateDynamic("Schema")(__v.asInstanceOf[js.Any]))
      StartDateTime.foreach(__v => __obj.updateDynamic("StartDateTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeExplainabilityResponse]
    }
  }

  @js.native
  trait DescribeForecastExportJobRequest extends js.Object {
    var ForecastExportJobArn: Arn
  }

  object DescribeForecastExportJobRequest {
    @inline
    def apply(
        ForecastExportJobArn: Arn
    ): DescribeForecastExportJobRequest = {
      val __obj = js.Dynamic.literal(
        "ForecastExportJobArn" -> ForecastExportJobArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeForecastExportJobRequest]
    }
  }

  @js.native
  trait DescribeForecastExportJobResponse extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var Destination: js.UndefOr[DataDestination]
    var ForecastArn: js.UndefOr[Arn]
    var ForecastExportJobArn: js.UndefOr[Arn]
    var ForecastExportJobName: js.UndefOr[Name]
    var Format: js.UndefOr[Format]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[Message]
    var Status: js.UndefOr[Status]
  }

  object DescribeForecastExportJobResponse {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Destination: js.UndefOr[DataDestination] = js.undefined,
        ForecastArn: js.UndefOr[Arn] = js.undefined,
        ForecastExportJobArn: js.UndefOr[Arn] = js.undefined,
        ForecastExportJobName: js.UndefOr[Name] = js.undefined,
        Format: js.UndefOr[Format] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): DescribeForecastExportJobResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      ForecastArn.foreach(__v => __obj.updateDynamic("ForecastArn")(__v.asInstanceOf[js.Any]))
      ForecastExportJobArn.foreach(__v => __obj.updateDynamic("ForecastExportJobArn")(__v.asInstanceOf[js.Any]))
      ForecastExportJobName.foreach(__v => __obj.updateDynamic("ForecastExportJobName")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeForecastExportJobResponse]
    }
  }

  @js.native
  trait DescribeForecastRequest extends js.Object {
    var ForecastArn: Arn
  }

  object DescribeForecastRequest {
    @inline
    def apply(
        ForecastArn: Arn
    ): DescribeForecastRequest = {
      val __obj = js.Dynamic.literal(
        "ForecastArn" -> ForecastArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeForecastRequest]
    }
  }

  @js.native
  trait DescribeForecastResponse extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DatasetGroupArn: js.UndefOr[Arn]
    var EstimatedTimeRemainingInMinutes: js.UndefOr[Double]
    var ForecastArn: js.UndefOr[Arn]
    var ForecastName: js.UndefOr[Name]
    var ForecastTypes: js.UndefOr[ForecastTypes]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[ErrorMessage]
    var PredictorArn: js.UndefOr[Arn]
    var Status: js.UndefOr[String]
    var TimeSeriesSelector: js.UndefOr[TimeSeriesSelector]
  }

  object DescribeForecastResponse {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DatasetGroupArn: js.UndefOr[Arn] = js.undefined,
        EstimatedTimeRemainingInMinutes: js.UndefOr[Double] = js.undefined,
        ForecastArn: js.UndefOr[Arn] = js.undefined,
        ForecastName: js.UndefOr[Name] = js.undefined,
        ForecastTypes: js.UndefOr[ForecastTypes] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[ErrorMessage] = js.undefined,
        PredictorArn: js.UndefOr[Arn] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        TimeSeriesSelector: js.UndefOr[TimeSeriesSelector] = js.undefined
    ): DescribeForecastResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DatasetGroupArn.foreach(__v => __obj.updateDynamic("DatasetGroupArn")(__v.asInstanceOf[js.Any]))
      EstimatedTimeRemainingInMinutes.foreach(__v => __obj.updateDynamic("EstimatedTimeRemainingInMinutes")(__v.asInstanceOf[js.Any]))
      ForecastArn.foreach(__v => __obj.updateDynamic("ForecastArn")(__v.asInstanceOf[js.Any]))
      ForecastName.foreach(__v => __obj.updateDynamic("ForecastName")(__v.asInstanceOf[js.Any]))
      ForecastTypes.foreach(__v => __obj.updateDynamic("ForecastTypes")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      PredictorArn.foreach(__v => __obj.updateDynamic("PredictorArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TimeSeriesSelector.foreach(__v => __obj.updateDynamic("TimeSeriesSelector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeForecastResponse]
    }
  }

  @js.native
  trait DescribeMonitorRequest extends js.Object {
    var MonitorArn: Arn
  }

  object DescribeMonitorRequest {
    @inline
    def apply(
        MonitorArn: Arn
    ): DescribeMonitorRequest = {
      val __obj = js.Dynamic.literal(
        "MonitorArn" -> MonitorArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeMonitorRequest]
    }
  }

  @js.native
  trait DescribeMonitorResponse extends js.Object {
    var Baseline: js.UndefOr[Baseline]
    var CreationTime: js.UndefOr[Timestamp]
    var EstimatedEvaluationTimeRemainingInMinutes: js.UndefOr[Double]
    var LastEvaluationState: js.UndefOr[EvaluationState]
    var LastEvaluationTime: js.UndefOr[Timestamp]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[Message]
    var MonitorArn: js.UndefOr[Arn]
    var MonitorName: js.UndefOr[Name]
    var ResourceArn: js.UndefOr[Arn]
    var Status: js.UndefOr[Status]
  }

  object DescribeMonitorResponse {
    @inline
    def apply(
        Baseline: js.UndefOr[Baseline] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        EstimatedEvaluationTimeRemainingInMinutes: js.UndefOr[Double] = js.undefined,
        LastEvaluationState: js.UndefOr[EvaluationState] = js.undefined,
        LastEvaluationTime: js.UndefOr[Timestamp] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        MonitorArn: js.UndefOr[Arn] = js.undefined,
        MonitorName: js.UndefOr[Name] = js.undefined,
        ResourceArn: js.UndefOr[Arn] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): DescribeMonitorResponse = {
      val __obj = js.Dynamic.literal()
      Baseline.foreach(__v => __obj.updateDynamic("Baseline")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      EstimatedEvaluationTimeRemainingInMinutes.foreach(__v => __obj.updateDynamic("EstimatedEvaluationTimeRemainingInMinutes")(__v.asInstanceOf[js.Any]))
      LastEvaluationState.foreach(__v => __obj.updateDynamic("LastEvaluationState")(__v.asInstanceOf[js.Any]))
      LastEvaluationTime.foreach(__v => __obj.updateDynamic("LastEvaluationTime")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      MonitorArn.foreach(__v => __obj.updateDynamic("MonitorArn")(__v.asInstanceOf[js.Any]))
      MonitorName.foreach(__v => __obj.updateDynamic("MonitorName")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMonitorResponse]
    }
  }

  @js.native
  trait DescribePredictorBacktestExportJobRequest extends js.Object {
    var PredictorBacktestExportJobArn: Arn
  }

  object DescribePredictorBacktestExportJobRequest {
    @inline
    def apply(
        PredictorBacktestExportJobArn: Arn
    ): DescribePredictorBacktestExportJobRequest = {
      val __obj = js.Dynamic.literal(
        "PredictorBacktestExportJobArn" -> PredictorBacktestExportJobArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePredictorBacktestExportJobRequest]
    }
  }

  @js.native
  trait DescribePredictorBacktestExportJobResponse extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var Destination: js.UndefOr[DataDestination]
    var Format: js.UndefOr[Format]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[Message]
    var PredictorArn: js.UndefOr[Arn]
    var PredictorBacktestExportJobArn: js.UndefOr[Arn]
    var PredictorBacktestExportJobName: js.UndefOr[Name]
    var Status: js.UndefOr[Status]
  }

  object DescribePredictorBacktestExportJobResponse {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Destination: js.UndefOr[DataDestination] = js.undefined,
        Format: js.UndefOr[Format] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        PredictorArn: js.UndefOr[Arn] = js.undefined,
        PredictorBacktestExportJobArn: js.UndefOr[Arn] = js.undefined,
        PredictorBacktestExportJobName: js.UndefOr[Name] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): DescribePredictorBacktestExportJobResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      PredictorArn.foreach(__v => __obj.updateDynamic("PredictorArn")(__v.asInstanceOf[js.Any]))
      PredictorBacktestExportJobArn.foreach(__v => __obj.updateDynamic("PredictorBacktestExportJobArn")(__v.asInstanceOf[js.Any]))
      PredictorBacktestExportJobName.foreach(__v => __obj.updateDynamic("PredictorBacktestExportJobName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePredictorBacktestExportJobResponse]
    }
  }

  @js.native
  trait DescribePredictorRequest extends js.Object {
    var PredictorArn: Arn
  }

  object DescribePredictorRequest {
    @inline
    def apply(
        PredictorArn: Arn
    ): DescribePredictorRequest = {
      val __obj = js.Dynamic.literal(
        "PredictorArn" -> PredictorArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePredictorRequest]
    }
  }

  @js.native
  trait DescribePredictorResponse extends js.Object {
    var AlgorithmArn: js.UndefOr[Arn]
    var AutoMLAlgorithmArns: js.UndefOr[ArnList]
    var AutoMLOverrideStrategy: js.UndefOr[AutoMLOverrideStrategy]
    var CreationTime: js.UndefOr[Timestamp]
    var DatasetImportJobArns: js.UndefOr[ArnList]
    var EncryptionConfig: js.UndefOr[EncryptionConfig]
    var EstimatedTimeRemainingInMinutes: js.UndefOr[Double]
    var EvaluationParameters: js.UndefOr[EvaluationParameters]
    var FeaturizationConfig: js.UndefOr[FeaturizationConfig]
    var ForecastHorizon: js.UndefOr[Int]
    var ForecastTypes: js.UndefOr[ForecastTypes]
    var HPOConfig: js.UndefOr[HyperParameterTuningJobConfig]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var IsAutoPredictor: js.UndefOr[Boolean]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[Message]
    var OptimizationMetric: js.UndefOr[OptimizationMetric]
    var PerformAutoML: js.UndefOr[Boolean]
    var PerformHPO: js.UndefOr[Boolean]
    var PredictorArn: js.UndefOr[Name]
    var PredictorExecutionDetails: js.UndefOr[PredictorExecutionDetails]
    var PredictorName: js.UndefOr[Name]
    var Status: js.UndefOr[Status]
    var TrainingParameters: js.UndefOr[TrainingParameters]
  }

  object DescribePredictorResponse {
    @inline
    def apply(
        AlgorithmArn: js.UndefOr[Arn] = js.undefined,
        AutoMLAlgorithmArns: js.UndefOr[ArnList] = js.undefined,
        AutoMLOverrideStrategy: js.UndefOr[AutoMLOverrideStrategy] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DatasetImportJobArns: js.UndefOr[ArnList] = js.undefined,
        EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined,
        EstimatedTimeRemainingInMinutes: js.UndefOr[Double] = js.undefined,
        EvaluationParameters: js.UndefOr[EvaluationParameters] = js.undefined,
        FeaturizationConfig: js.UndefOr[FeaturizationConfig] = js.undefined,
        ForecastHorizon: js.UndefOr[Int] = js.undefined,
        ForecastTypes: js.UndefOr[ForecastTypes] = js.undefined,
        HPOConfig: js.UndefOr[HyperParameterTuningJobConfig] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        IsAutoPredictor: js.UndefOr[Boolean] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        OptimizationMetric: js.UndefOr[OptimizationMetric] = js.undefined,
        PerformAutoML: js.UndefOr[Boolean] = js.undefined,
        PerformHPO: js.UndefOr[Boolean] = js.undefined,
        PredictorArn: js.UndefOr[Name] = js.undefined,
        PredictorExecutionDetails: js.UndefOr[PredictorExecutionDetails] = js.undefined,
        PredictorName: js.UndefOr[Name] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined,
        TrainingParameters: js.UndefOr[TrainingParameters] = js.undefined
    ): DescribePredictorResponse = {
      val __obj = js.Dynamic.literal()
      AlgorithmArn.foreach(__v => __obj.updateDynamic("AlgorithmArn")(__v.asInstanceOf[js.Any]))
      AutoMLAlgorithmArns.foreach(__v => __obj.updateDynamic("AutoMLAlgorithmArns")(__v.asInstanceOf[js.Any]))
      AutoMLOverrideStrategy.foreach(__v => __obj.updateDynamic("AutoMLOverrideStrategy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DatasetImportJobArns.foreach(__v => __obj.updateDynamic("DatasetImportJobArns")(__v.asInstanceOf[js.Any]))
      EncryptionConfig.foreach(__v => __obj.updateDynamic("EncryptionConfig")(__v.asInstanceOf[js.Any]))
      EstimatedTimeRemainingInMinutes.foreach(__v => __obj.updateDynamic("EstimatedTimeRemainingInMinutes")(__v.asInstanceOf[js.Any]))
      EvaluationParameters.foreach(__v => __obj.updateDynamic("EvaluationParameters")(__v.asInstanceOf[js.Any]))
      FeaturizationConfig.foreach(__v => __obj.updateDynamic("FeaturizationConfig")(__v.asInstanceOf[js.Any]))
      ForecastHorizon.foreach(__v => __obj.updateDynamic("ForecastHorizon")(__v.asInstanceOf[js.Any]))
      ForecastTypes.foreach(__v => __obj.updateDynamic("ForecastTypes")(__v.asInstanceOf[js.Any]))
      HPOConfig.foreach(__v => __obj.updateDynamic("HPOConfig")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      IsAutoPredictor.foreach(__v => __obj.updateDynamic("IsAutoPredictor")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      OptimizationMetric.foreach(__v => __obj.updateDynamic("OptimizationMetric")(__v.asInstanceOf[js.Any]))
      PerformAutoML.foreach(__v => __obj.updateDynamic("PerformAutoML")(__v.asInstanceOf[js.Any]))
      PerformHPO.foreach(__v => __obj.updateDynamic("PerformHPO")(__v.asInstanceOf[js.Any]))
      PredictorArn.foreach(__v => __obj.updateDynamic("PredictorArn")(__v.asInstanceOf[js.Any]))
      PredictorExecutionDetails.foreach(__v => __obj.updateDynamic("PredictorExecutionDetails")(__v.asInstanceOf[js.Any]))
      PredictorName.foreach(__v => __obj.updateDynamic("PredictorName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TrainingParameters.foreach(__v => __obj.updateDynamic("TrainingParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePredictorResponse]
    }
  }

  @js.native
  trait DescribeWhatIfAnalysisRequest extends js.Object {
    var WhatIfAnalysisArn: Arn
  }

  object DescribeWhatIfAnalysisRequest {
    @inline
    def apply(
        WhatIfAnalysisArn: Arn
    ): DescribeWhatIfAnalysisRequest = {
      val __obj = js.Dynamic.literal(
        "WhatIfAnalysisArn" -> WhatIfAnalysisArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeWhatIfAnalysisRequest]
    }
  }

  @js.native
  trait DescribeWhatIfAnalysisResponse extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var EstimatedTimeRemainingInMinutes: js.UndefOr[Double]
    var ForecastArn: js.UndefOr[Arn]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[ErrorMessage]
    var Status: js.UndefOr[String]
    var TimeSeriesSelector: js.UndefOr[TimeSeriesSelector]
    var WhatIfAnalysisArn: js.UndefOr[Arn]
    var WhatIfAnalysisName: js.UndefOr[Name]
  }

  object DescribeWhatIfAnalysisResponse {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        EstimatedTimeRemainingInMinutes: js.UndefOr[Double] = js.undefined,
        ForecastArn: js.UndefOr[Arn] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[ErrorMessage] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        TimeSeriesSelector: js.UndefOr[TimeSeriesSelector] = js.undefined,
        WhatIfAnalysisArn: js.UndefOr[Arn] = js.undefined,
        WhatIfAnalysisName: js.UndefOr[Name] = js.undefined
    ): DescribeWhatIfAnalysisResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      EstimatedTimeRemainingInMinutes.foreach(__v => __obj.updateDynamic("EstimatedTimeRemainingInMinutes")(__v.asInstanceOf[js.Any]))
      ForecastArn.foreach(__v => __obj.updateDynamic("ForecastArn")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TimeSeriesSelector.foreach(__v => __obj.updateDynamic("TimeSeriesSelector")(__v.asInstanceOf[js.Any]))
      WhatIfAnalysisArn.foreach(__v => __obj.updateDynamic("WhatIfAnalysisArn")(__v.asInstanceOf[js.Any]))
      WhatIfAnalysisName.foreach(__v => __obj.updateDynamic("WhatIfAnalysisName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeWhatIfAnalysisResponse]
    }
  }

  @js.native
  trait DescribeWhatIfForecastExportRequest extends js.Object {
    var WhatIfForecastExportArn: LongArn
  }

  object DescribeWhatIfForecastExportRequest {
    @inline
    def apply(
        WhatIfForecastExportArn: LongArn
    ): DescribeWhatIfForecastExportRequest = {
      val __obj = js.Dynamic.literal(
        "WhatIfForecastExportArn" -> WhatIfForecastExportArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeWhatIfForecastExportRequest]
    }
  }

  @js.native
  trait DescribeWhatIfForecastExportResponse extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var Destination: js.UndefOr[DataDestination]
    var EstimatedTimeRemainingInMinutes: js.UndefOr[Double]
    var Format: js.UndefOr[Format]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[Message]
    var Status: js.UndefOr[Status]
    var WhatIfForecastArns: js.UndefOr[LongArnList]
    var WhatIfForecastExportArn: js.UndefOr[LongArn]
    var WhatIfForecastExportName: js.UndefOr[Name]
  }

  object DescribeWhatIfForecastExportResponse {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Destination: js.UndefOr[DataDestination] = js.undefined,
        EstimatedTimeRemainingInMinutes: js.UndefOr[Double] = js.undefined,
        Format: js.UndefOr[Format] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined,
        WhatIfForecastArns: js.UndefOr[LongArnList] = js.undefined,
        WhatIfForecastExportArn: js.UndefOr[LongArn] = js.undefined,
        WhatIfForecastExportName: js.UndefOr[Name] = js.undefined
    ): DescribeWhatIfForecastExportResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      EstimatedTimeRemainingInMinutes.foreach(__v => __obj.updateDynamic("EstimatedTimeRemainingInMinutes")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      WhatIfForecastArns.foreach(__v => __obj.updateDynamic("WhatIfForecastArns")(__v.asInstanceOf[js.Any]))
      WhatIfForecastExportArn.foreach(__v => __obj.updateDynamic("WhatIfForecastExportArn")(__v.asInstanceOf[js.Any]))
      WhatIfForecastExportName.foreach(__v => __obj.updateDynamic("WhatIfForecastExportName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeWhatIfForecastExportResponse]
    }
  }

  @js.native
  trait DescribeWhatIfForecastRequest extends js.Object {
    var WhatIfForecastArn: LongArn
  }

  object DescribeWhatIfForecastRequest {
    @inline
    def apply(
        WhatIfForecastArn: LongArn
    ): DescribeWhatIfForecastRequest = {
      val __obj = js.Dynamic.literal(
        "WhatIfForecastArn" -> WhatIfForecastArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeWhatIfForecastRequest]
    }
  }

  @js.native
  trait DescribeWhatIfForecastResponse extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var EstimatedTimeRemainingInMinutes: js.UndefOr[Double]
    var ForecastTypes: js.UndefOr[ForecastTypes]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[ErrorMessage]
    var Status: js.UndefOr[String]
    var TimeSeriesReplacementsDataSource: js.UndefOr[TimeSeriesReplacementsDataSource]
    var TimeSeriesTransformations: js.UndefOr[TimeSeriesTransformations]
    var WhatIfAnalysisArn: js.UndefOr[Arn]
    var WhatIfForecastArn: js.UndefOr[LongArn]
    var WhatIfForecastName: js.UndefOr[Name]
  }

  object DescribeWhatIfForecastResponse {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        EstimatedTimeRemainingInMinutes: js.UndefOr[Double] = js.undefined,
        ForecastTypes: js.UndefOr[ForecastTypes] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[ErrorMessage] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        TimeSeriesReplacementsDataSource: js.UndefOr[TimeSeriesReplacementsDataSource] = js.undefined,
        TimeSeriesTransformations: js.UndefOr[TimeSeriesTransformations] = js.undefined,
        WhatIfAnalysisArn: js.UndefOr[Arn] = js.undefined,
        WhatIfForecastArn: js.UndefOr[LongArn] = js.undefined,
        WhatIfForecastName: js.UndefOr[Name] = js.undefined
    ): DescribeWhatIfForecastResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      EstimatedTimeRemainingInMinutes.foreach(__v => __obj.updateDynamic("EstimatedTimeRemainingInMinutes")(__v.asInstanceOf[js.Any]))
      ForecastTypes.foreach(__v => __obj.updateDynamic("ForecastTypes")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TimeSeriesReplacementsDataSource.foreach(__v => __obj.updateDynamic("TimeSeriesReplacementsDataSource")(__v.asInstanceOf[js.Any]))
      TimeSeriesTransformations.foreach(__v => __obj.updateDynamic("TimeSeriesTransformations")(__v.asInstanceOf[js.Any]))
      WhatIfAnalysisArn.foreach(__v => __obj.updateDynamic("WhatIfAnalysisArn")(__v.asInstanceOf[js.Any]))
      WhatIfForecastArn.foreach(__v => __obj.updateDynamic("WhatIfForecastArn")(__v.asInstanceOf[js.Any]))
      WhatIfForecastName.foreach(__v => __obj.updateDynamic("WhatIfForecastName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeWhatIfForecastResponse]
    }
  }

  /** An AWS Key Management Service (KMS) key and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the key. You can specify this optional object in the <a>CreateDataset</a> and <a>CreatePredictor</a> requests.
    */
  @js.native
  trait EncryptionConfig extends js.Object {
    var KMSKeyArn: KMSKeyArn
    var RoleArn: Arn
  }

  object EncryptionConfig {
    @inline
    def apply(
        KMSKeyArn: KMSKeyArn,
        RoleArn: Arn
    ): EncryptionConfig = {
      val __obj = js.Dynamic.literal(
        "KMSKeyArn" -> KMSKeyArn.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EncryptionConfig]
    }
  }

  /** Provides detailed error metrics to evaluate the performance of a predictor. This object is part of the <a>Metrics</a> object.
    */
  @js.native
  trait ErrorMetric extends js.Object {
    var ForecastType: js.UndefOr[ForecastType]
    var MAPE: js.UndefOr[Double]
    var MASE: js.UndefOr[Double]
    var RMSE: js.UndefOr[Double]
    var WAPE: js.UndefOr[Double]
  }

  object ErrorMetric {
    @inline
    def apply(
        ForecastType: js.UndefOr[ForecastType] = js.undefined,
        MAPE: js.UndefOr[Double] = js.undefined,
        MASE: js.UndefOr[Double] = js.undefined,
        RMSE: js.UndefOr[Double] = js.undefined,
        WAPE: js.UndefOr[Double] = js.undefined
    ): ErrorMetric = {
      val __obj = js.Dynamic.literal()
      ForecastType.foreach(__v => __obj.updateDynamic("ForecastType")(__v.asInstanceOf[js.Any]))
      MAPE.foreach(__v => __obj.updateDynamic("MAPE")(__v.asInstanceOf[js.Any]))
      MASE.foreach(__v => __obj.updateDynamic("MASE")(__v.asInstanceOf[js.Any]))
      RMSE.foreach(__v => __obj.updateDynamic("RMSE")(__v.asInstanceOf[js.Any]))
      WAPE.foreach(__v => __obj.updateDynamic("WAPE")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorMetric]
    }
  }

  /** Parameters that define how to split a dataset into training data and testing data, and the number of iterations to perform. These parameters are specified in the predefined algorithms but you can override them in the <a>CreatePredictor</a> request.
    */
  @js.native
  trait EvaluationParameters extends js.Object {
    var BackTestWindowOffset: js.UndefOr[Int]
    var NumberOfBacktestWindows: js.UndefOr[Int]
  }

  object EvaluationParameters {
    @inline
    def apply(
        BackTestWindowOffset: js.UndefOr[Int] = js.undefined,
        NumberOfBacktestWindows: js.UndefOr[Int] = js.undefined
    ): EvaluationParameters = {
      val __obj = js.Dynamic.literal()
      BackTestWindowOffset.foreach(__v => __obj.updateDynamic("BackTestWindowOffset")(__v.asInstanceOf[js.Any]))
      NumberOfBacktestWindows.foreach(__v => __obj.updateDynamic("NumberOfBacktestWindows")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EvaluationParameters]
    }
  }

  /** The results of evaluating an algorithm. Returned as part of the <a>GetAccuracyMetrics</a> response.
    */
  @js.native
  trait EvaluationResult extends js.Object {
    var AlgorithmArn: js.UndefOr[Arn]
    var TestWindows: js.UndefOr[TestWindows]
  }

  object EvaluationResult {
    @inline
    def apply(
        AlgorithmArn: js.UndefOr[Arn] = js.undefined,
        TestWindows: js.UndefOr[TestWindows] = js.undefined
    ): EvaluationResult = {
      val __obj = js.Dynamic.literal()
      AlgorithmArn.foreach(__v => __obj.updateDynamic("AlgorithmArn")(__v.asInstanceOf[js.Any]))
      TestWindows.foreach(__v => __obj.updateDynamic("TestWindows")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EvaluationResult]
    }
  }

  /** The ExplainabilityConfig data type defines the number of time series and time points included in <a>CreateExplainability</a>. If you provide a predictor ARN for <code>ResourceArn</code>, you must set both <code>TimePointGranularity</code> and <code>TimeSeriesGranularity</code> to “ALL”. When creating Predictor Explainability, Amazon Forecast considers all time series and time points. If you provide a forecast ARN for <code>ResourceArn</code>, you can set <code>TimePointGranularity</code> and <code>TimeSeriesGranularity</code> to either “ALL” or “Specific”.
    */
  @js.native
  trait ExplainabilityConfig extends js.Object {
    var TimePointGranularity: TimePointGranularity
    var TimeSeriesGranularity: TimeSeriesGranularity
  }

  object ExplainabilityConfig {
    @inline
    def apply(
        TimePointGranularity: TimePointGranularity,
        TimeSeriesGranularity: TimeSeriesGranularity
    ): ExplainabilityConfig = {
      val __obj = js.Dynamic.literal(
        "TimePointGranularity" -> TimePointGranularity.asInstanceOf[js.Any],
        "TimeSeriesGranularity" -> TimeSeriesGranularity.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExplainabilityConfig]
    }
  }

  /** Provides a summary of the Explainability export properties used in the <a>ListExplainabilityExports</a> operation. To get a complete set of properties, call the <a>DescribeExplainabilityExport</a> operation, and provide the <code>ExplainabilityExportArn</code>.
    */
  @js.native
  trait ExplainabilityExportSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var Destination: js.UndefOr[DataDestination]
    var ExplainabilityExportArn: js.UndefOr[Arn]
    var ExplainabilityExportName: js.UndefOr[Name]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[ErrorMessage]
    var Status: js.UndefOr[Status]
  }

  object ExplainabilityExportSummary {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Destination: js.UndefOr[DataDestination] = js.undefined,
        ExplainabilityExportArn: js.UndefOr[Arn] = js.undefined,
        ExplainabilityExportName: js.UndefOr[Name] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[ErrorMessage] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): ExplainabilityExportSummary = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      ExplainabilityExportArn.foreach(__v => __obj.updateDynamic("ExplainabilityExportArn")(__v.asInstanceOf[js.Any]))
      ExplainabilityExportName.foreach(__v => __obj.updateDynamic("ExplainabilityExportName")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExplainabilityExportSummary]
    }
  }

  /** Provides information about the Explainability resource.
    */
  @js.native
  trait ExplainabilityInfo extends js.Object {
    var ExplainabilityArn: js.UndefOr[Arn]
    var Status: js.UndefOr[Status]
  }

  object ExplainabilityInfo {
    @inline
    def apply(
        ExplainabilityArn: js.UndefOr[Arn] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): ExplainabilityInfo = {
      val __obj = js.Dynamic.literal()
      ExplainabilityArn.foreach(__v => __obj.updateDynamic("ExplainabilityArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExplainabilityInfo]
    }
  }

  /** Provides a summary of the Explainability properties used in the <a>ListExplainabilities</a> operation. To get a complete set of properties, call the <a>DescribeExplainability</a> operation, and provide the listed <code>ExplainabilityArn</code>.
    */
  @js.native
  trait ExplainabilitySummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var ExplainabilityArn: js.UndefOr[Arn]
    var ExplainabilityConfig: js.UndefOr[ExplainabilityConfig]
    var ExplainabilityName: js.UndefOr[Name]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[Message]
    var ResourceArn: js.UndefOr[Arn]
    var Status: js.UndefOr[Status]
  }

  object ExplainabilitySummary {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        ExplainabilityArn: js.UndefOr[Arn] = js.undefined,
        ExplainabilityConfig: js.UndefOr[ExplainabilityConfig] = js.undefined,
        ExplainabilityName: js.UndefOr[Name] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        ResourceArn: js.UndefOr[Arn] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): ExplainabilitySummary = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      ExplainabilityArn.foreach(__v => __obj.updateDynamic("ExplainabilityArn")(__v.asInstanceOf[js.Any]))
      ExplainabilityConfig.foreach(__v => __obj.updateDynamic("ExplainabilityConfig")(__v.asInstanceOf[js.Any]))
      ExplainabilityName.foreach(__v => __obj.updateDynamic("ExplainabilityName")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExplainabilitySummary]
    }
  }

  /** '''Note:'''This object belongs to the <a>CreatePredictor</a> operation. If you created your predictor with <a>CreateAutoPredictor</a>, see <a>AttributeConfig</a>. Provides featurization (transformation) information for a dataset field. This object is part of the <a>FeaturizationConfig</a> object. For example: <code>{</code> <code>"AttributeName": "demand",</code> <code>FeaturizationPipeline [ {</code> <code>"FeaturizationMethodName": "filling",</code> <code>"FeaturizationMethodParameters": {"aggregation": "avg", "backfill": "nan"}</code> <code>} ]</code> <code>}</code>
    */
  @js.native
  trait Featurization extends js.Object {
    var AttributeName: Name
    var FeaturizationPipeline: js.UndefOr[FeaturizationPipeline]
  }

  object Featurization {
    @inline
    def apply(
        AttributeName: Name,
        FeaturizationPipeline: js.UndefOr[FeaturizationPipeline] = js.undefined
    ): Featurization = {
      val __obj = js.Dynamic.literal(
        "AttributeName" -> AttributeName.asInstanceOf[js.Any]
      )

      FeaturizationPipeline.foreach(__v => __obj.updateDynamic("FeaturizationPipeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Featurization]
    }
  }

  /** '''Note:'''This object belongs to the <a>CreatePredictor</a> operation. If you created your predictor with <a>CreateAutoPredictor</a>, see <a>AttributeConfig</a>. In a <a>CreatePredictor</a> operation, the specified algorithm trains a model using the specified dataset group. You can optionally tell the operation to modify data fields prior to training a model. These modifications are referred to as <i>featurization</i>. You define featurization using the <code>FeaturizationConfig</code> object. You specify an array of transformations, one for each field that you want to featurize. You then include the <code>FeaturizationConfig</code> object in your <code>CreatePredictor</code> request. Amazon Forecast applies the featurization to the <code>TARGET_TIME_SERIES</code> and <code>RELATED_TIME_SERIES</code> datasets before model training. You can create multiple featurization configurations. For example, you might call the <code>CreatePredictor</code> operation twice by specifying
    * different featurization configurations.
    */
  @js.native
  trait FeaturizationConfig extends js.Object {
    var ForecastFrequency: Frequency
    var Featurizations: js.UndefOr[Featurizations]
    var ForecastDimensions: js.UndefOr[ForecastDimensions]
  }

  object FeaturizationConfig {
    @inline
    def apply(
        ForecastFrequency: Frequency,
        Featurizations: js.UndefOr[Featurizations] = js.undefined,
        ForecastDimensions: js.UndefOr[ForecastDimensions] = js.undefined
    ): FeaturizationConfig = {
      val __obj = js.Dynamic.literal(
        "ForecastFrequency" -> ForecastFrequency.asInstanceOf[js.Any]
      )

      Featurizations.foreach(__v => __obj.updateDynamic("Featurizations")(__v.asInstanceOf[js.Any]))
      ForecastDimensions.foreach(__v => __obj.updateDynamic("ForecastDimensions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FeaturizationConfig]
    }
  }

  /** Provides information about the method that featurizes (transforms) a dataset field. The method is part of the <code>FeaturizationPipeline</code> of the <a>Featurization</a> object. The following is an example of how you specify a <code>FeaturizationMethod</code> object. <code>{</code> <code>"FeaturizationMethodName": "filling",</code> <code>"FeaturizationMethodParameters": {"aggregation": "sum", "middlefill": "zero", "backfill": "zero"}</code> <code>}</code>
    */
  @js.native
  trait FeaturizationMethod extends js.Object {
    var FeaturizationMethodName: FeaturizationMethodName
    var FeaturizationMethodParameters: js.UndefOr[FeaturizationMethodParameters]
  }

  object FeaturizationMethod {
    @inline
    def apply(
        FeaturizationMethodName: FeaturizationMethodName,
        FeaturizationMethodParameters: js.UndefOr[FeaturizationMethodParameters] = js.undefined
    ): FeaturizationMethod = {
      val __obj = js.Dynamic.literal(
        "FeaturizationMethodName" -> FeaturizationMethodName.asInstanceOf[js.Any]
      )

      FeaturizationMethodParameters.foreach(__v => __obj.updateDynamic("FeaturizationMethodParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FeaturizationMethod]
    }
  }

  /** Describes a filter for choosing a subset of objects. Each filter consists of a condition and a match statement. The condition is either <code>IS</code> or <code>IS_NOT</code>, which specifies whether to include or exclude the objects that match the statement, respectively. The match statement consists of a key and a value.
    */
  @js.native
  trait Filter extends js.Object {
    var Condition: FilterConditionString
    var Key: String
    var Value: Arn
  }

  object Filter {
    @inline
    def apply(
        Condition: FilterConditionString,
        Key: String,
        Value: Arn
    ): Filter = {
      val __obj = js.Dynamic.literal(
        "Condition" -> Condition.asInstanceOf[js.Any],
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Filter]
    }
  }

  /** Provides a summary of the forecast export job properties used in the <a>ListForecastExportJobs</a> operation. To get the complete set of properties, call the <a>DescribeForecastExportJob</a> operation, and provide the listed <code>ForecastExportJobArn</code>.
    */
  @js.native
  trait ForecastExportJobSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var Destination: js.UndefOr[DataDestination]
    var ForecastExportJobArn: js.UndefOr[Arn]
    var ForecastExportJobName: js.UndefOr[Name]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[ErrorMessage]
    var Status: js.UndefOr[Status]
  }

  object ForecastExportJobSummary {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Destination: js.UndefOr[DataDestination] = js.undefined,
        ForecastExportJobArn: js.UndefOr[Arn] = js.undefined,
        ForecastExportJobName: js.UndefOr[Name] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[ErrorMessage] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): ForecastExportJobSummary = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      ForecastExportJobArn.foreach(__v => __obj.updateDynamic("ForecastExportJobArn")(__v.asInstanceOf[js.Any]))
      ForecastExportJobName.foreach(__v => __obj.updateDynamic("ForecastExportJobName")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ForecastExportJobSummary]
    }
  }

  /** Provides a summary of the forecast properties used in the <a>ListForecasts</a> operation. To get the complete set of properties, call the <a>DescribeForecast</a> operation, and provide the <code>ForecastArn</code> that is listed in the summary.
    */
  @js.native
  trait ForecastSummary extends js.Object {
    var CreatedUsingAutoPredictor: js.UndefOr[Boolean]
    var CreationTime: js.UndefOr[Timestamp]
    var DatasetGroupArn: js.UndefOr[String]
    var ForecastArn: js.UndefOr[Arn]
    var ForecastName: js.UndefOr[Name]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[ErrorMessage]
    var PredictorArn: js.UndefOr[String]
    var Status: js.UndefOr[Status]
  }

  object ForecastSummary {
    @inline
    def apply(
        CreatedUsingAutoPredictor: js.UndefOr[Boolean] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DatasetGroupArn: js.UndefOr[String] = js.undefined,
        ForecastArn: js.UndefOr[Arn] = js.undefined,
        ForecastName: js.UndefOr[Name] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[ErrorMessage] = js.undefined,
        PredictorArn: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): ForecastSummary = {
      val __obj = js.Dynamic.literal()
      CreatedUsingAutoPredictor.foreach(__v => __obj.updateDynamic("CreatedUsingAutoPredictor")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DatasetGroupArn.foreach(__v => __obj.updateDynamic("DatasetGroupArn")(__v.asInstanceOf[js.Any]))
      ForecastArn.foreach(__v => __obj.updateDynamic("ForecastArn")(__v.asInstanceOf[js.Any]))
      ForecastName.foreach(__v => __obj.updateDynamic("ForecastName")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      PredictorArn.foreach(__v => __obj.updateDynamic("PredictorArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ForecastSummary]
    }
  }

  @js.native
  trait GetAccuracyMetricsRequest extends js.Object {
    var PredictorArn: Arn
  }

  object GetAccuracyMetricsRequest {
    @inline
    def apply(
        PredictorArn: Arn
    ): GetAccuracyMetricsRequest = {
      val __obj = js.Dynamic.literal(
        "PredictorArn" -> PredictorArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAccuracyMetricsRequest]
    }
  }

  @js.native
  trait GetAccuracyMetricsResponse extends js.Object {
    var AutoMLOverrideStrategy: js.UndefOr[AutoMLOverrideStrategy]
    var IsAutoPredictor: js.UndefOr[Boolean]
    var OptimizationMetric: js.UndefOr[OptimizationMetric]
    var PredictorEvaluationResults: js.UndefOr[PredictorEvaluationResults]
  }

  object GetAccuracyMetricsResponse {
    @inline
    def apply(
        AutoMLOverrideStrategy: js.UndefOr[AutoMLOverrideStrategy] = js.undefined,
        IsAutoPredictor: js.UndefOr[Boolean] = js.undefined,
        OptimizationMetric: js.UndefOr[OptimizationMetric] = js.undefined,
        PredictorEvaluationResults: js.UndefOr[PredictorEvaluationResults] = js.undefined
    ): GetAccuracyMetricsResponse = {
      val __obj = js.Dynamic.literal()
      AutoMLOverrideStrategy.foreach(__v => __obj.updateDynamic("AutoMLOverrideStrategy")(__v.asInstanceOf[js.Any]))
      IsAutoPredictor.foreach(__v => __obj.updateDynamic("IsAutoPredictor")(__v.asInstanceOf[js.Any]))
      OptimizationMetric.foreach(__v => __obj.updateDynamic("OptimizationMetric")(__v.asInstanceOf[js.Any]))
      PredictorEvaluationResults.foreach(__v => __obj.updateDynamic("PredictorEvaluationResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccuracyMetricsResponse]
    }
  }

  /** Configuration information for a hyperparameter tuning job. You specify this object in the <a>CreatePredictor</a> request. A <i>hyperparameter</i> is a parameter that governs the model training process. You set hyperparameters before training starts, unlike model parameters, which are determined during training. The values of the hyperparameters effect which values are chosen for the model parameters. In a <i>hyperparameter tuning job</i>, Amazon Forecast chooses the set of hyperparameter values that optimize a specified metric. Forecast accomplishes this by running many training jobs over a range of hyperparameter values. The optimum set of values depends on the algorithm, the training data, and the specified metric objective.
    */
  @js.native
  trait HyperParameterTuningJobConfig extends js.Object {
    var ParameterRanges: js.UndefOr[ParameterRanges]
  }

  object HyperParameterTuningJobConfig {
    @inline
    def apply(
        ParameterRanges: js.UndefOr[ParameterRanges] = js.undefined
    ): HyperParameterTuningJobConfig = {
      val __obj = js.Dynamic.literal()
      ParameterRanges.foreach(__v => __obj.updateDynamic("ParameterRanges")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HyperParameterTuningJobConfig]
    }
  }

  /** '''Note:'''This object belongs to the <a>CreatePredictor</a> operation. If you created your predictor with <a>CreateAutoPredictor</a>, see <a>DataConfig</a>. The data used to train a predictor. The data includes a dataset group and any supplementary features. You specify this object in the <a>CreatePredictor</a> request.
    */
  @js.native
  trait InputDataConfig extends js.Object {
    var DatasetGroupArn: Arn
    var SupplementaryFeatures: js.UndefOr[SupplementaryFeatures]
  }

  object InputDataConfig {
    @inline
    def apply(
        DatasetGroupArn: Arn,
        SupplementaryFeatures: js.UndefOr[SupplementaryFeatures] = js.undefined
    ): InputDataConfig = {
      val __obj = js.Dynamic.literal(
        "DatasetGroupArn" -> DatasetGroupArn.asInstanceOf[js.Any]
      )

      SupplementaryFeatures.foreach(__v => __obj.updateDynamic("SupplementaryFeatures")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputDataConfig]
    }
  }

  /** Specifies an integer hyperparameter and it's range of tunable values. This object is part of the <a>ParameterRanges</a> object.
    */
  @js.native
  trait IntegerParameterRange extends js.Object {
    var MaxValue: Int
    var MinValue: Int
    var Name: Name
    var ScalingType: js.UndefOr[ScalingType]
  }

  object IntegerParameterRange {
    @inline
    def apply(
        MaxValue: Int,
        MinValue: Int,
        Name: Name,
        ScalingType: js.UndefOr[ScalingType] = js.undefined
    ): IntegerParameterRange = {
      val __obj = js.Dynamic.literal(
        "MaxValue" -> MaxValue.asInstanceOf[js.Any],
        "MinValue" -> MinValue.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ScalingType.foreach(__v => __obj.updateDynamic("ScalingType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IntegerParameterRange]
    }
  }

  @js.native
  trait ListDatasetGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDatasetGroupsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetGroupsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetGroupsRequest]
    }
  }

  @js.native
  trait ListDatasetGroupsResponse extends js.Object {
    var DatasetGroups: js.UndefOr[DatasetGroups]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDatasetGroupsResponse {
    @inline
    def apply(
        DatasetGroups: js.UndefOr[DatasetGroups] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetGroupsResponse = {
      val __obj = js.Dynamic.literal()
      DatasetGroups.foreach(__v => __obj.updateDynamic("DatasetGroups")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetGroupsResponse]
    }
  }

  @js.native
  trait ListDatasetImportJobsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDatasetImportJobsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetImportJobsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetImportJobsRequest]
    }
  }

  @js.native
  trait ListDatasetImportJobsResponse extends js.Object {
    var DatasetImportJobs: js.UndefOr[DatasetImportJobs]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDatasetImportJobsResponse {
    @inline
    def apply(
        DatasetImportJobs: js.UndefOr[DatasetImportJobs] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetImportJobsResponse = {
      val __obj = js.Dynamic.literal()
      DatasetImportJobs.foreach(__v => __obj.updateDynamic("DatasetImportJobs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetImportJobsResponse]
    }
  }

  @js.native
  trait ListDatasetsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDatasetsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetsRequest]
    }
  }

  @js.native
  trait ListDatasetsResponse extends js.Object {
    var Datasets: js.UndefOr[Datasets]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDatasetsResponse {
    @inline
    def apply(
        Datasets: js.UndefOr[Datasets] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatasetsResponse = {
      val __obj = js.Dynamic.literal()
      Datasets.foreach(__v => __obj.updateDynamic("Datasets")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatasetsResponse]
    }
  }

  @js.native
  trait ListExplainabilitiesRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListExplainabilitiesRequest {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExplainabilitiesRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExplainabilitiesRequest]
    }
  }

  @js.native
  trait ListExplainabilitiesResponse extends js.Object {
    var Explainabilities: js.UndefOr[Explainabilities]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListExplainabilitiesResponse {
    @inline
    def apply(
        Explainabilities: js.UndefOr[Explainabilities] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExplainabilitiesResponse = {
      val __obj = js.Dynamic.literal()
      Explainabilities.foreach(__v => __obj.updateDynamic("Explainabilities")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExplainabilitiesResponse]
    }
  }

  @js.native
  trait ListExplainabilityExportsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListExplainabilityExportsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExplainabilityExportsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExplainabilityExportsRequest]
    }
  }

  @js.native
  trait ListExplainabilityExportsResponse extends js.Object {
    var ExplainabilityExports: js.UndefOr[ExplainabilityExports]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListExplainabilityExportsResponse {
    @inline
    def apply(
        ExplainabilityExports: js.UndefOr[ExplainabilityExports] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExplainabilityExportsResponse = {
      val __obj = js.Dynamic.literal()
      ExplainabilityExports.foreach(__v => __obj.updateDynamic("ExplainabilityExports")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExplainabilityExportsResponse]
    }
  }

  @js.native
  trait ListForecastExportJobsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListForecastExportJobsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListForecastExportJobsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListForecastExportJobsRequest]
    }
  }

  @js.native
  trait ListForecastExportJobsResponse extends js.Object {
    var ForecastExportJobs: js.UndefOr[ForecastExportJobs]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListForecastExportJobsResponse {
    @inline
    def apply(
        ForecastExportJobs: js.UndefOr[ForecastExportJobs] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListForecastExportJobsResponse = {
      val __obj = js.Dynamic.literal()
      ForecastExportJobs.foreach(__v => __obj.updateDynamic("ForecastExportJobs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListForecastExportJobsResponse]
    }
  }

  @js.native
  trait ListForecastsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListForecastsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListForecastsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListForecastsRequest]
    }
  }

  @js.native
  trait ListForecastsResponse extends js.Object {
    var Forecasts: js.UndefOr[Forecasts]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListForecastsResponse {
    @inline
    def apply(
        Forecasts: js.UndefOr[Forecasts] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListForecastsResponse = {
      val __obj = js.Dynamic.literal()
      Forecasts.foreach(__v => __obj.updateDynamic("Forecasts")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListForecastsResponse]
    }
  }

  @js.native
  trait ListMonitorEvaluationsRequest extends js.Object {
    var MonitorArn: Arn
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMonitorEvaluationsRequest {
    @inline
    def apply(
        MonitorArn: Arn,
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMonitorEvaluationsRequest = {
      val __obj = js.Dynamic.literal(
        "MonitorArn" -> MonitorArn.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMonitorEvaluationsRequest]
    }
  }

  @js.native
  trait ListMonitorEvaluationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PredictorMonitorEvaluations: js.UndefOr[PredictorMonitorEvaluations]
  }

  object ListMonitorEvaluationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PredictorMonitorEvaluations: js.UndefOr[PredictorMonitorEvaluations] = js.undefined
    ): ListMonitorEvaluationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PredictorMonitorEvaluations.foreach(__v => __obj.updateDynamic("PredictorMonitorEvaluations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMonitorEvaluationsResponse]
    }
  }

  @js.native
  trait ListMonitorsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMonitorsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMonitorsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMonitorsRequest]
    }
  }

  @js.native
  trait ListMonitorsResponse extends js.Object {
    var Monitors: js.UndefOr[Monitors]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMonitorsResponse {
    @inline
    def apply(
        Monitors: js.UndefOr[Monitors] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMonitorsResponse = {
      val __obj = js.Dynamic.literal()
      Monitors.foreach(__v => __obj.updateDynamic("Monitors")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMonitorsResponse]
    }
  }

  @js.native
  trait ListPredictorBacktestExportJobsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPredictorBacktestExportJobsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPredictorBacktestExportJobsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPredictorBacktestExportJobsRequest]
    }
  }

  @js.native
  trait ListPredictorBacktestExportJobsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PredictorBacktestExportJobs: js.UndefOr[PredictorBacktestExportJobs]
  }

  object ListPredictorBacktestExportJobsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PredictorBacktestExportJobs: js.UndefOr[PredictorBacktestExportJobs] = js.undefined
    ): ListPredictorBacktestExportJobsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PredictorBacktestExportJobs.foreach(__v => __obj.updateDynamic("PredictorBacktestExportJobs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPredictorBacktestExportJobsResponse]
    }
  }

  @js.native
  trait ListPredictorsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPredictorsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPredictorsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPredictorsRequest]
    }
  }

  @js.native
  trait ListPredictorsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Predictors: js.UndefOr[Predictors]
  }

  object ListPredictorsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Predictors: js.UndefOr[Predictors] = js.undefined
    ): ListPredictorsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Predictors.foreach(__v => __obj.updateDynamic("Predictors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPredictorsResponse]
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
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListWhatIfAnalysesRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListWhatIfAnalysesRequest {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWhatIfAnalysesRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWhatIfAnalysesRequest]
    }
  }

  @js.native
  trait ListWhatIfAnalysesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WhatIfAnalyses: js.UndefOr[WhatIfAnalyses]
  }

  object ListWhatIfAnalysesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WhatIfAnalyses: js.UndefOr[WhatIfAnalyses] = js.undefined
    ): ListWhatIfAnalysesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WhatIfAnalyses.foreach(__v => __obj.updateDynamic("WhatIfAnalyses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWhatIfAnalysesResponse]
    }
  }

  @js.native
  trait ListWhatIfForecastExportsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListWhatIfForecastExportsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWhatIfForecastExportsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWhatIfForecastExportsRequest]
    }
  }

  @js.native
  trait ListWhatIfForecastExportsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WhatIfForecastExports: js.UndefOr[WhatIfForecastExports]
  }

  object ListWhatIfForecastExportsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WhatIfForecastExports: js.UndefOr[WhatIfForecastExports] = js.undefined
    ): ListWhatIfForecastExportsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WhatIfForecastExports.foreach(__v => __obj.updateDynamic("WhatIfForecastExports")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWhatIfForecastExportsResponse]
    }
  }

  @js.native
  trait ListWhatIfForecastsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListWhatIfForecastsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWhatIfForecastsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWhatIfForecastsRequest]
    }
  }

  @js.native
  trait ListWhatIfForecastsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WhatIfForecasts: js.UndefOr[WhatIfForecasts]
  }

  object ListWhatIfForecastsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WhatIfForecasts: js.UndefOr[WhatIfForecasts] = js.undefined
    ): ListWhatIfForecastsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WhatIfForecasts.foreach(__v => __obj.updateDynamic("WhatIfForecasts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWhatIfForecastsResponse]
    }
  }

  /** An individual metric Forecast calculated when monitoring predictor usage. You can compare the value for this metric to the metric's value in the <a>Baseline</a> to see how your predictor's performance is changing. For more information about metrics generated by Forecast see [[https://docs.aws.amazon.com/forecast/latest/dg/metrics.html|Evaluating Predictor Accuracy]]
    */
  @js.native
  trait MetricResult extends js.Object {
    var MetricName: js.UndefOr[MetricName]
    var MetricValue: js.UndefOr[Double]
  }

  object MetricResult {
    @inline
    def apply(
        MetricName: js.UndefOr[MetricName] = js.undefined,
        MetricValue: js.UndefOr[Double] = js.undefined
    ): MetricResult = {
      val __obj = js.Dynamic.literal()
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      MetricValue.foreach(__v => __obj.updateDynamic("MetricValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricResult]
    }
  }

  /** Provides metrics that are used to evaluate the performance of a predictor. This object is part of the <a>WindowSummary</a> object.
    */
  @js.native
  trait Metrics extends js.Object {
    var AverageWeightedQuantileLoss: js.UndefOr[Double]
    var ErrorMetrics: js.UndefOr[ErrorMetrics]
    var RMSE: js.UndefOr[Double]
    var WeightedQuantileLosses: js.UndefOr[WeightedQuantileLosses]
  }

  object Metrics {
    @inline
    def apply(
        AverageWeightedQuantileLoss: js.UndefOr[Double] = js.undefined,
        ErrorMetrics: js.UndefOr[ErrorMetrics] = js.undefined,
        RMSE: js.UndefOr[Double] = js.undefined,
        WeightedQuantileLosses: js.UndefOr[WeightedQuantileLosses] = js.undefined
    ): Metrics = {
      val __obj = js.Dynamic.literal()
      AverageWeightedQuantileLoss.foreach(__v => __obj.updateDynamic("AverageWeightedQuantileLoss")(__v.asInstanceOf[js.Any]))
      ErrorMetrics.foreach(__v => __obj.updateDynamic("ErrorMetrics")(__v.asInstanceOf[js.Any]))
      RMSE.foreach(__v => __obj.updateDynamic("RMSE")(__v.asInstanceOf[js.Any]))
      WeightedQuantileLosses.foreach(__v => __obj.updateDynamic("WeightedQuantileLosses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Metrics]
    }
  }

  /** The configuration details for the predictor monitor.
    */
  @js.native
  trait MonitorConfig extends js.Object {
    var MonitorName: Name
  }

  object MonitorConfig {
    @inline
    def apply(
        MonitorName: Name
    ): MonitorConfig = {
      val __obj = js.Dynamic.literal(
        "MonitorName" -> MonitorName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MonitorConfig]
    }
  }

  /** The source of the data the monitor used during the evaluation.
    */
  @js.native
  trait MonitorDataSource extends js.Object {
    var DatasetImportJobArn: js.UndefOr[Arn]
    var ForecastArn: js.UndefOr[Arn]
    var PredictorArn: js.UndefOr[Arn]
  }

  object MonitorDataSource {
    @inline
    def apply(
        DatasetImportJobArn: js.UndefOr[Arn] = js.undefined,
        ForecastArn: js.UndefOr[Arn] = js.undefined,
        PredictorArn: js.UndefOr[Arn] = js.undefined
    ): MonitorDataSource = {
      val __obj = js.Dynamic.literal()
      DatasetImportJobArn.foreach(__v => __obj.updateDynamic("DatasetImportJobArn")(__v.asInstanceOf[js.Any]))
      ForecastArn.foreach(__v => __obj.updateDynamic("ForecastArn")(__v.asInstanceOf[js.Any]))
      PredictorArn.foreach(__v => __obj.updateDynamic("PredictorArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitorDataSource]
    }
  }

  /** Provides information about the monitor resource.
    */
  @js.native
  trait MonitorInfo extends js.Object {
    var MonitorArn: js.UndefOr[Arn]
    var Status: js.UndefOr[Status]
  }

  object MonitorInfo {
    @inline
    def apply(
        MonitorArn: js.UndefOr[Arn] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): MonitorInfo = {
      val __obj = js.Dynamic.literal()
      MonitorArn.foreach(__v => __obj.updateDynamic("MonitorArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitorInfo]
    }
  }

  /** Provides a summary of the monitor properties used in the <a>ListMonitors</a> operation. To get a complete set of properties, call the <a>DescribeMonitor</a> operation, and provide the listed <code>MonitorArn</code>.
    */
  @js.native
  trait MonitorSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var LastModificationTime: js.UndefOr[Timestamp]
    var MonitorArn: js.UndefOr[Arn]
    var MonitorName: js.UndefOr[Name]
    var ResourceArn: js.UndefOr[Arn]
    var Status: js.UndefOr[Status]
  }

  object MonitorSummary {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        MonitorArn: js.UndefOr[Arn] = js.undefined,
        MonitorName: js.UndefOr[Name] = js.undefined,
        ResourceArn: js.UndefOr[Arn] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): MonitorSummary = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      MonitorArn.foreach(__v => __obj.updateDynamic("MonitorArn")(__v.asInstanceOf[js.Any]))
      MonitorName.foreach(__v => __obj.updateDynamic("MonitorName")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitorSummary]
    }
  }

  /** Specifies the categorical, continuous, and integer hyperparameters, and their ranges of tunable values. The range of tunable values determines which values that a hyperparameter tuning job can choose for the specified hyperparameter. This object is part of the <a>HyperParameterTuningJobConfig</a> object.
    */
  @js.native
  trait ParameterRanges extends js.Object {
    var CategoricalParameterRanges: js.UndefOr[CategoricalParameterRanges]
    var ContinuousParameterRanges: js.UndefOr[ContinuousParameterRanges]
    var IntegerParameterRanges: js.UndefOr[IntegerParameterRanges]
  }

  object ParameterRanges {
    @inline
    def apply(
        CategoricalParameterRanges: js.UndefOr[CategoricalParameterRanges] = js.undefined,
        ContinuousParameterRanges: js.UndefOr[ContinuousParameterRanges] = js.undefined,
        IntegerParameterRanges: js.UndefOr[IntegerParameterRanges] = js.undefined
    ): ParameterRanges = {
      val __obj = js.Dynamic.literal()
      CategoricalParameterRanges.foreach(__v => __obj.updateDynamic("CategoricalParameterRanges")(__v.asInstanceOf[js.Any]))
      ContinuousParameterRanges.foreach(__v => __obj.updateDynamic("ContinuousParameterRanges")(__v.asInstanceOf[js.Any]))
      IntegerParameterRanges.foreach(__v => __obj.updateDynamic("IntegerParameterRanges")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterRanges]
    }
  }

  /** Provides a summary of the predictor backtest export job properties used in the <a>ListPredictorBacktestExportJobs</a> operation. To get a complete set of properties, call the <a>DescribePredictorBacktestExportJob</a> operation, and provide the listed <code>PredictorBacktestExportJobArn</code>.
    */
  @js.native
  trait PredictorBacktestExportJobSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var Destination: js.UndefOr[DataDestination]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[ErrorMessage]
    var PredictorBacktestExportJobArn: js.UndefOr[Arn]
    var PredictorBacktestExportJobName: js.UndefOr[Name]
    var Status: js.UndefOr[Status]
  }

  object PredictorBacktestExportJobSummary {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Destination: js.UndefOr[DataDestination] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[ErrorMessage] = js.undefined,
        PredictorBacktestExportJobArn: js.UndefOr[Arn] = js.undefined,
        PredictorBacktestExportJobName: js.UndefOr[Name] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): PredictorBacktestExportJobSummary = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      PredictorBacktestExportJobArn.foreach(__v => __obj.updateDynamic("PredictorBacktestExportJobArn")(__v.asInstanceOf[js.Any]))
      PredictorBacktestExportJobName.foreach(__v => __obj.updateDynamic("PredictorBacktestExportJobName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredictorBacktestExportJobSummary]
    }
  }

  /** Metrics you can use as a baseline for comparison purposes. Use these metrics when you interpret monitoring results for an auto predictor.
    */
  @js.native
  trait PredictorBaseline extends js.Object {
    var BaselineMetrics: js.UndefOr[BaselineMetrics]
  }

  object PredictorBaseline {
    @inline
    def apply(
        BaselineMetrics: js.UndefOr[BaselineMetrics] = js.undefined
    ): PredictorBaseline = {
      val __obj = js.Dynamic.literal()
      BaselineMetrics.foreach(__v => __obj.updateDynamic("BaselineMetrics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredictorBaseline]
    }
  }

  /** Provides details about a predictor event, such as a retraining.
    */
  @js.native
  trait PredictorEvent extends js.Object {
    var Datetime: js.UndefOr[Timestamp]
    var Detail: js.UndefOr[Detail]
  }

  object PredictorEvent {
    @inline
    def apply(
        Datetime: js.UndefOr[Timestamp] = js.undefined,
        Detail: js.UndefOr[Detail] = js.undefined
    ): PredictorEvent = {
      val __obj = js.Dynamic.literal()
      Datetime.foreach(__v => __obj.updateDynamic("Datetime")(__v.asInstanceOf[js.Any]))
      Detail.foreach(__v => __obj.updateDynamic("Detail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredictorEvent]
    }
  }

  /** The algorithm used to perform a backtest and the status of those tests.
    */
  @js.native
  trait PredictorExecution extends js.Object {
    var AlgorithmArn: js.UndefOr[Arn]
    var TestWindows: js.UndefOr[TestWindowDetails]
  }

  object PredictorExecution {
    @inline
    def apply(
        AlgorithmArn: js.UndefOr[Arn] = js.undefined,
        TestWindows: js.UndefOr[TestWindowDetails] = js.undefined
    ): PredictorExecution = {
      val __obj = js.Dynamic.literal()
      AlgorithmArn.foreach(__v => __obj.updateDynamic("AlgorithmArn")(__v.asInstanceOf[js.Any]))
      TestWindows.foreach(__v => __obj.updateDynamic("TestWindows")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredictorExecution]
    }
  }

  /** Contains details on the backtests performed to evaluate the accuracy of the predictor. The tests are returned in descending order of accuracy, with the most accurate backtest appearing first. You specify the number of backtests to perform when you call the operation.
    */
  @js.native
  trait PredictorExecutionDetails extends js.Object {
    var PredictorExecutions: js.UndefOr[PredictorExecutions]
  }

  object PredictorExecutionDetails {
    @inline
    def apply(
        PredictorExecutions: js.UndefOr[PredictorExecutions] = js.undefined
    ): PredictorExecutionDetails = {
      val __obj = js.Dynamic.literal()
      PredictorExecutions.foreach(__v => __obj.updateDynamic("PredictorExecutions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredictorExecutionDetails]
    }
  }

  /** Describes the results of a monitor evaluation.
    */
  @js.native
  trait PredictorMonitorEvaluation extends js.Object {
    var EvaluationState: js.UndefOr[EvaluationState]
    var EvaluationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[Message]
    var MetricResults: js.UndefOr[MetricResults]
    var MonitorArn: js.UndefOr[Arn]
    var MonitorDataSource: js.UndefOr[MonitorDataSource]
    var NumItemsEvaluated: js.UndefOr[Double]
    var PredictorEvent: js.UndefOr[PredictorEvent]
    var ResourceArn: js.UndefOr[Arn]
    var WindowEndDatetime: js.UndefOr[Timestamp]
    var WindowStartDatetime: js.UndefOr[Timestamp]
  }

  object PredictorMonitorEvaluation {
    @inline
    def apply(
        EvaluationState: js.UndefOr[EvaluationState] = js.undefined,
        EvaluationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        MetricResults: js.UndefOr[MetricResults] = js.undefined,
        MonitorArn: js.UndefOr[Arn] = js.undefined,
        MonitorDataSource: js.UndefOr[MonitorDataSource] = js.undefined,
        NumItemsEvaluated: js.UndefOr[Double] = js.undefined,
        PredictorEvent: js.UndefOr[PredictorEvent] = js.undefined,
        ResourceArn: js.UndefOr[Arn] = js.undefined,
        WindowEndDatetime: js.UndefOr[Timestamp] = js.undefined,
        WindowStartDatetime: js.UndefOr[Timestamp] = js.undefined
    ): PredictorMonitorEvaluation = {
      val __obj = js.Dynamic.literal()
      EvaluationState.foreach(__v => __obj.updateDynamic("EvaluationState")(__v.asInstanceOf[js.Any]))
      EvaluationTime.foreach(__v => __obj.updateDynamic("EvaluationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      MetricResults.foreach(__v => __obj.updateDynamic("MetricResults")(__v.asInstanceOf[js.Any]))
      MonitorArn.foreach(__v => __obj.updateDynamic("MonitorArn")(__v.asInstanceOf[js.Any]))
      MonitorDataSource.foreach(__v => __obj.updateDynamic("MonitorDataSource")(__v.asInstanceOf[js.Any]))
      NumItemsEvaluated.foreach(__v => __obj.updateDynamic("NumItemsEvaluated")(__v.asInstanceOf[js.Any]))
      PredictorEvent.foreach(__v => __obj.updateDynamic("PredictorEvent")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      WindowEndDatetime.foreach(__v => __obj.updateDynamic("WindowEndDatetime")(__v.asInstanceOf[js.Any]))
      WindowStartDatetime.foreach(__v => __obj.updateDynamic("WindowStartDatetime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredictorMonitorEvaluation]
    }
  }

  /** Provides a summary of the predictor properties that are used in the <a>ListPredictors</a> operation. To get the complete set of properties, call the <a>DescribePredictor</a> operation, and provide the listed <code>PredictorArn</code>.
    */
  @js.native
  trait PredictorSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DatasetGroupArn: js.UndefOr[Arn]
    var IsAutoPredictor: js.UndefOr[Boolean]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[ErrorMessage]
    var PredictorArn: js.UndefOr[Arn]
    var PredictorName: js.UndefOr[Name]
    var ReferencePredictorSummary: js.UndefOr[ReferencePredictorSummary]
    var Status: js.UndefOr[Status]
  }

  object PredictorSummary {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DatasetGroupArn: js.UndefOr[Arn] = js.undefined,
        IsAutoPredictor: js.UndefOr[Boolean] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[ErrorMessage] = js.undefined,
        PredictorArn: js.UndefOr[Arn] = js.undefined,
        PredictorName: js.UndefOr[Name] = js.undefined,
        ReferencePredictorSummary: js.UndefOr[ReferencePredictorSummary] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): PredictorSummary = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DatasetGroupArn.foreach(__v => __obj.updateDynamic("DatasetGroupArn")(__v.asInstanceOf[js.Any]))
      IsAutoPredictor.foreach(__v => __obj.updateDynamic("IsAutoPredictor")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      PredictorArn.foreach(__v => __obj.updateDynamic("PredictorArn")(__v.asInstanceOf[js.Any]))
      PredictorName.foreach(__v => __obj.updateDynamic("PredictorName")(__v.asInstanceOf[js.Any]))
      ReferencePredictorSummary.foreach(__v => __obj.updateDynamic("ReferencePredictorSummary")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredictorSummary]
    }
  }

  /** Provides a summary of the reference predictor used when retraining or upgrading a predictor.
    */
  @js.native
  trait ReferencePredictorSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var State: js.UndefOr[State]
  }

  object ReferencePredictorSummary {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        State: js.UndefOr[State] = js.undefined
    ): ReferencePredictorSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferencePredictorSummary]
    }
  }

  @js.native
  trait ResumeResourceRequest extends js.Object {
    var ResourceArn: Arn
  }

  object ResumeResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn
    ): ResumeResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResumeResourceRequest]
    }
  }

  /** The path to the file(s) in an Amazon Simple Storage Service (Amazon S3) bucket, and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the file(s). Optionally, includes an AWS Key Management Service (KMS) key. This object is part of the <a>DataSource</a> object that is submitted in the <a>CreateDatasetImportJob</a> request, and part of the <a>DataDestination</a> object.
    */
  @js.native
  trait S3Config extends js.Object {
    var Path: S3Path
    var RoleArn: Arn
    var KMSKeyArn: js.UndefOr[KMSKeyArn]
  }

  object S3Config {
    @inline
    def apply(
        Path: S3Path,
        RoleArn: Arn,
        KMSKeyArn: js.UndefOr[KMSKeyArn] = js.undefined
    ): S3Config = {
      val __obj = js.Dynamic.literal(
        "Path" -> Path.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      KMSKeyArn.foreach(__v => __obj.updateDynamic("KMSKeyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Config]
    }
  }

  /** Defines the fields of a dataset.
    */
  @js.native
  trait Schema extends js.Object {
    var Attributes: js.UndefOr[SchemaAttributes]
  }

  object Schema {
    @inline
    def apply(
        Attributes: js.UndefOr[SchemaAttributes] = js.undefined
    ): Schema = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Schema]
    }
  }

  /** An attribute of a schema, which defines a dataset field. A schema attribute is required for every field in a dataset. The [[https://docs.aws.amazon.com/forecast/latest/dg/API_Schema.html|Schema]] object contains an array of <code>SchemaAttribute</code> objects.
    */
  @js.native
  trait SchemaAttribute extends js.Object {
    var AttributeName: js.UndefOr[Name]
    var AttributeType: js.UndefOr[AttributeType]
  }

  object SchemaAttribute {
    @inline
    def apply(
        AttributeName: js.UndefOr[Name] = js.undefined,
        AttributeType: js.UndefOr[AttributeType] = js.undefined
    ): SchemaAttribute = {
      val __obj = js.Dynamic.literal()
      AttributeName.foreach(__v => __obj.updateDynamic("AttributeName")(__v.asInstanceOf[js.Any]))
      AttributeType.foreach(__v => __obj.updateDynamic("AttributeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SchemaAttribute]
    }
  }

  /** Provides statistics for each data field imported into to an Amazon Forecast dataset with the [[https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDatasetImportJob.html|CreateDatasetImportJob]] operation.
    */
  @js.native
  trait Statistics extends js.Object {
    var Avg: js.UndefOr[Double]
    var Count: js.UndefOr[Int]
    var CountDistinct: js.UndefOr[Int]
    var CountDistinctLong: js.UndefOr[Double]
    var CountLong: js.UndefOr[Double]
    var CountNan: js.UndefOr[Int]
    var CountNanLong: js.UndefOr[Double]
    var CountNull: js.UndefOr[Int]
    var CountNullLong: js.UndefOr[Double]
    var Max: js.UndefOr[String]
    var Min: js.UndefOr[String]
    var Stddev: js.UndefOr[Double]
  }

  object Statistics {
    @inline
    def apply(
        Avg: js.UndefOr[Double] = js.undefined,
        Count: js.UndefOr[Int] = js.undefined,
        CountDistinct: js.UndefOr[Int] = js.undefined,
        CountDistinctLong: js.UndefOr[Double] = js.undefined,
        CountLong: js.UndefOr[Double] = js.undefined,
        CountNan: js.UndefOr[Int] = js.undefined,
        CountNanLong: js.UndefOr[Double] = js.undefined,
        CountNull: js.UndefOr[Int] = js.undefined,
        CountNullLong: js.UndefOr[Double] = js.undefined,
        Max: js.UndefOr[String] = js.undefined,
        Min: js.UndefOr[String] = js.undefined,
        Stddev: js.UndefOr[Double] = js.undefined
    ): Statistics = {
      val __obj = js.Dynamic.literal()
      Avg.foreach(__v => __obj.updateDynamic("Avg")(__v.asInstanceOf[js.Any]))
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      CountDistinct.foreach(__v => __obj.updateDynamic("CountDistinct")(__v.asInstanceOf[js.Any]))
      CountDistinctLong.foreach(__v => __obj.updateDynamic("CountDistinctLong")(__v.asInstanceOf[js.Any]))
      CountLong.foreach(__v => __obj.updateDynamic("CountLong")(__v.asInstanceOf[js.Any]))
      CountNan.foreach(__v => __obj.updateDynamic("CountNan")(__v.asInstanceOf[js.Any]))
      CountNanLong.foreach(__v => __obj.updateDynamic("CountNanLong")(__v.asInstanceOf[js.Any]))
      CountNull.foreach(__v => __obj.updateDynamic("CountNull")(__v.asInstanceOf[js.Any]))
      CountNullLong.foreach(__v => __obj.updateDynamic("CountNullLong")(__v.asInstanceOf[js.Any]))
      Max.foreach(__v => __obj.updateDynamic("Max")(__v.asInstanceOf[js.Any]))
      Min.foreach(__v => __obj.updateDynamic("Min")(__v.asInstanceOf[js.Any]))
      Stddev.foreach(__v => __obj.updateDynamic("Stddev")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Statistics]
    }
  }

  @js.native
  trait StopResourceRequest extends js.Object {
    var ResourceArn: Arn
  }

  object StopResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn
    ): StopResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopResourceRequest]
    }
  }

  /** '''Note:'''This object belongs to the <a>CreatePredictor</a> operation. If you created your predictor with <a>CreateAutoPredictor</a>, see <a>AdditionalDataset</a>. Describes a supplementary feature of a dataset group. This object is part of the <a>InputDataConfig</a> object. Forecast supports the Weather Index and Holidays built-in featurizations.
    * \```Weather Index``` The Amazon Forecast Weather Index is a built-in featurization that incorporates historical and projected weather information into your model. The Weather Index supplements your datasets with over two years of historical weather data and up to 14 days of projected weather data. For more information, see [[https://docs.aws.amazon.com/forecast/latest/dg/weather.html|Amazon Forecast Weather Index]].
    * \```Holidays``` Holidays is a built-in featurization that incorporates a feature-engineered dataset of national holiday information into your model. It provides native support for the holiday calendars of 66 countries. To view the holiday calendars, refer to the [[http://jollyday.sourceforge.net/data.html|Jollyday]] library. For more information, see [[https://docs.aws.amazon.com/forecast/latest/dg/holidays.html|Holidays Featurization]].
    */
  @js.native
  trait SupplementaryFeature extends js.Object {
    var Name: Name
    var Value: Value
  }

  object SupplementaryFeature {
    @inline
    def apply(
        Name: Name,
        Value: Value
    ): SupplementaryFeature = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SupplementaryFeature]
    }
  }

  /** The optional metadata that you apply to a resource to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags: * Maximum number of tags per resource - 50. * For each resource, each tag key must be unique, and each tag key can have only one value. * Maximum key length - 128 Unicode characters in UTF-8. * Maximum value length - 256 Unicode characters in UTF-8. * If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @. * Tag keys and values are case sensitive. * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix.
    * Values can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, then Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of <code>aws</code> do not count against your tags per resource limit.
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
    var ResourceArn: Arn
    var Tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        Tags: Tags
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

  /** The status, start time, and end time of a backtest, as well as a failure reason if applicable.
    */
  @js.native
  trait TestWindowSummary extends js.Object {
    var Message: js.UndefOr[ErrorMessage]
    var Status: js.UndefOr[Status]
    var TestWindowEnd: js.UndefOr[Timestamp]
    var TestWindowStart: js.UndefOr[Timestamp]
  }

  object TestWindowSummary {
    @inline
    def apply(
        Message: js.UndefOr[ErrorMessage] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined,
        TestWindowEnd: js.UndefOr[Timestamp] = js.undefined,
        TestWindowStart: js.UndefOr[Timestamp] = js.undefined
    ): TestWindowSummary = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TestWindowEnd.foreach(__v => __obj.updateDynamic("TestWindowEnd")(__v.asInstanceOf[js.Any]))
      TestWindowStart.foreach(__v => __obj.updateDynamic("TestWindowStart")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestWindowSummary]
    }
  }

  /** The time boundary Forecast uses to align and aggregate your data to match your forecast frequency. Provide the unit of time and the time boundary as a key value pair. If you don't provide a time boundary, Forecast uses a set of [[https://docs.aws.amazon.com/forecast/latest/dg/data-aggregation.html#default-time-boundaries|Default Time Boundaries]]. For more information about aggregation, see [[https://docs.aws.amazon.com/forecast/latest/dg/data-aggregation.html|Data Aggregation for Different Forecast Frequencies]]. For more information setting a custom time boundary, see [[https://docs.aws.amazon.com/forecast/latest/dg/data-aggregation.html#specifying-time-boundary|Specifying a Time Boundary]].
    */
  @js.native
  trait TimeAlignmentBoundary extends js.Object {
    var DayOfMonth: js.UndefOr[DayOfMonth]
    var DayOfWeek: js.UndefOr[DayOfWeek]
    var Hour: js.UndefOr[Hour]
    var Month: js.UndefOr[Month]
  }

  object TimeAlignmentBoundary {
    @inline
    def apply(
        DayOfMonth: js.UndefOr[DayOfMonth] = js.undefined,
        DayOfWeek: js.UndefOr[DayOfWeek] = js.undefined,
        Hour: js.UndefOr[Hour] = js.undefined,
        Month: js.UndefOr[Month] = js.undefined
    ): TimeAlignmentBoundary = {
      val __obj = js.Dynamic.literal()
      DayOfMonth.foreach(__v => __obj.updateDynamic("DayOfMonth")(__v.asInstanceOf[js.Any]))
      DayOfWeek.foreach(__v => __obj.updateDynamic("DayOfWeek")(__v.asInstanceOf[js.Any]))
      Hour.foreach(__v => __obj.updateDynamic("Hour")(__v.asInstanceOf[js.Any]))
      Month.foreach(__v => __obj.updateDynamic("Month")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeAlignmentBoundary]
    }
  }

  /** Creates a subset of items within an attribute that are modified. For example, you can use this operation to create a subset of items that cost 5 or less. To do this, you specify <code>"AttributeName": "price"</code>, <code>"AttributeValue": "5"</code>, and <code>"Condition": "LESS_THAN"</code>. Pair this operation with the <a>Action</a> operation within the [[CreateWhatIfForecastRequest.TimeSeriesTransformations]] operation to define how the attribute is modified.
    */
  @js.native
  trait TimeSeriesCondition extends js.Object {
    var AttributeName: Name
    var AttributeValue: AttributeValue
    var Condition: Condition
  }

  object TimeSeriesCondition {
    @inline
    def apply(
        AttributeName: Name,
        AttributeValue: AttributeValue,
        Condition: Condition
    ): TimeSeriesCondition = {
      val __obj = js.Dynamic.literal(
        "AttributeName" -> AttributeName.asInstanceOf[js.Any],
        "AttributeValue" -> AttributeValue.asInstanceOf[js.Any],
        "Condition" -> Condition.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TimeSeriesCondition]
    }
  }

  /** Details about the import file that contains the time series for which you want to create forecasts.
    */
  @js.native
  trait TimeSeriesIdentifiers extends js.Object {
    var DataSource: js.UndefOr[DataSource]
    var Format: js.UndefOr[Format]
    var Schema: js.UndefOr[Schema]
  }

  object TimeSeriesIdentifiers {
    @inline
    def apply(
        DataSource: js.UndefOr[DataSource] = js.undefined,
        Format: js.UndefOr[Format] = js.undefined,
        Schema: js.UndefOr[Schema] = js.undefined
    ): TimeSeriesIdentifiers = {
      val __obj = js.Dynamic.literal()
      DataSource.foreach(__v => __obj.updateDynamic("DataSource")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.updateDynamic("Schema")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeSeriesIdentifiers]
    }
  }

  /** A replacement dataset is a modified version of the baseline related time series that contains only the values that you want to include in a what-if forecast. The replacement dataset must contain the forecast dimensions and item identifiers in the baseline related time series as well as at least 1 changed time series. This dataset is merged with the baseline related time series to create a transformed dataset that is used for the what-if forecast.
    */
  @js.native
  trait TimeSeriesReplacementsDataSource extends js.Object {
    var S3Config: S3Config
    var Schema: Schema
    var Format: js.UndefOr[Format]
    var TimestampFormat: js.UndefOr[TimestampFormat]
  }

  object TimeSeriesReplacementsDataSource {
    @inline
    def apply(
        S3Config: S3Config,
        Schema: Schema,
        Format: js.UndefOr[Format] = js.undefined,
        TimestampFormat: js.UndefOr[TimestampFormat] = js.undefined
    ): TimeSeriesReplacementsDataSource = {
      val __obj = js.Dynamic.literal(
        "S3Config" -> S3Config.asInstanceOf[js.Any],
        "Schema" -> Schema.asInstanceOf[js.Any]
      )

      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      TimestampFormat.foreach(__v => __obj.updateDynamic("TimestampFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeSeriesReplacementsDataSource]
    }
  }

  /** Defines the set of time series that are used to create the forecasts in a <code>TimeSeriesIdentifiers</code> object. The <code>TimeSeriesIdentifiers</code> object needs the following information: * <code>DataSource</code> * <code>Format</code> * <code>Schema</code>
    */
  @js.native
  trait TimeSeriesSelector extends js.Object {
    var TimeSeriesIdentifiers: js.UndefOr[TimeSeriesIdentifiers]
  }

  object TimeSeriesSelector {
    @inline
    def apply(
        TimeSeriesIdentifiers: js.UndefOr[TimeSeriesIdentifiers] = js.undefined
    ): TimeSeriesSelector = {
      val __obj = js.Dynamic.literal()
      TimeSeriesIdentifiers.foreach(__v => __obj.updateDynamic("TimeSeriesIdentifiers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeSeriesSelector]
    }
  }

  /** A transformation function is a pair of operations that select and modify the rows in a related time series. You select the rows that you want with a condition operation and you modify the rows with a transformation operation. All conditions are joined with an AND operation, meaning that all conditions must be true for the transformation to be applied. Transformations are applied in the order that they are listed.
    */
  @js.native
  trait TimeSeriesTransformation extends js.Object {
    var Action: js.UndefOr[Action]
    var TimeSeriesConditions: js.UndefOr[TimeSeriesConditions]
  }

  object TimeSeriesTransformation {
    @inline
    def apply(
        Action: js.UndefOr[Action] = js.undefined,
        TimeSeriesConditions: js.UndefOr[TimeSeriesConditions] = js.undefined
    ): TimeSeriesTransformation = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      TimeSeriesConditions.foreach(__v => __obj.updateDynamic("TimeSeriesConditions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeSeriesTransformation]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        TagKeys: TagKeys
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
  trait UpdateDatasetGroupRequest extends js.Object {
    var DatasetArns: ArnList
    var DatasetGroupArn: Arn
  }

  object UpdateDatasetGroupRequest {
    @inline
    def apply(
        DatasetArns: ArnList,
        DatasetGroupArn: Arn
    ): UpdateDatasetGroupRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetArns" -> DatasetArns.asInstanceOf[js.Any],
        "DatasetGroupArn" -> DatasetGroupArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDatasetGroupRequest]
    }
  }

  @js.native
  trait UpdateDatasetGroupResponse extends js.Object

  object UpdateDatasetGroupResponse {
    @inline
    def apply(): UpdateDatasetGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDatasetGroupResponse]
    }
  }

  /** The weighted loss value for a quantile. This object is part of the <a>Metrics</a> object.
    */
  @js.native
  trait WeightedQuantileLoss extends js.Object {
    var LossValue: js.UndefOr[Double]
    var Quantile: js.UndefOr[Double]
  }

  object WeightedQuantileLoss {
    @inline
    def apply(
        LossValue: js.UndefOr[Double] = js.undefined,
        Quantile: js.UndefOr[Double] = js.undefined
    ): WeightedQuantileLoss = {
      val __obj = js.Dynamic.literal()
      LossValue.foreach(__v => __obj.updateDynamic("LossValue")(__v.asInstanceOf[js.Any]))
      Quantile.foreach(__v => __obj.updateDynamic("Quantile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WeightedQuantileLoss]
    }
  }

  /** Provides a summary of the what-if analysis properties used in the <a>ListWhatIfAnalyses</a> operation. To get the complete set of properties, call the <a>DescribeWhatIfAnalysis</a> operation, and provide the <code>WhatIfAnalysisArn</code> that is listed in the summary.
    */
  @js.native
  trait WhatIfAnalysisSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var ForecastArn: js.UndefOr[Arn]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[ErrorMessage]
    var Status: js.UndefOr[Status]
    var WhatIfAnalysisArn: js.UndefOr[Arn]
    var WhatIfAnalysisName: js.UndefOr[Name]
  }

  object WhatIfAnalysisSummary {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        ForecastArn: js.UndefOr[Arn] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[ErrorMessage] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined,
        WhatIfAnalysisArn: js.UndefOr[Arn] = js.undefined,
        WhatIfAnalysisName: js.UndefOr[Name] = js.undefined
    ): WhatIfAnalysisSummary = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      ForecastArn.foreach(__v => __obj.updateDynamic("ForecastArn")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      WhatIfAnalysisArn.foreach(__v => __obj.updateDynamic("WhatIfAnalysisArn")(__v.asInstanceOf[js.Any]))
      WhatIfAnalysisName.foreach(__v => __obj.updateDynamic("WhatIfAnalysisName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WhatIfAnalysisSummary]
    }
  }

  /** Provides a summary of the what-if forecast export properties used in the <a>ListWhatIfForecastExports</a> operation. To get the complete set of properties, call the <a>DescribeWhatIfForecastExport</a> operation, and provide the <code>WhatIfForecastExportArn</code> that is listed in the summary.
    */
  @js.native
  trait WhatIfForecastExportSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var Destination: js.UndefOr[DataDestination]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[ErrorMessage]
    var Status: js.UndefOr[Status]
    var WhatIfForecastArns: js.UndefOr[WhatIfForecastArnListForExport]
    var WhatIfForecastExportArn: js.UndefOr[LongArn]
    var WhatIfForecastExportName: js.UndefOr[Name]
  }

  object WhatIfForecastExportSummary {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Destination: js.UndefOr[DataDestination] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[ErrorMessage] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined,
        WhatIfForecastArns: js.UndefOr[WhatIfForecastArnListForExport] = js.undefined,
        WhatIfForecastExportArn: js.UndefOr[LongArn] = js.undefined,
        WhatIfForecastExportName: js.UndefOr[Name] = js.undefined
    ): WhatIfForecastExportSummary = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      WhatIfForecastArns.foreach(__v => __obj.updateDynamic("WhatIfForecastArns")(__v.asInstanceOf[js.Any]))
      WhatIfForecastExportArn.foreach(__v => __obj.updateDynamic("WhatIfForecastExportArn")(__v.asInstanceOf[js.Any]))
      WhatIfForecastExportName.foreach(__v => __obj.updateDynamic("WhatIfForecastExportName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WhatIfForecastExportSummary]
    }
  }

  /** Provides a summary of the what-if forecast properties used in the <a>ListWhatIfForecasts</a> operation. To get the complete set of properties, call the <a>DescribeWhatIfForecast</a> operation, and provide the <code>WhatIfForecastArn</code> that is listed in the summary.
    */
  @js.native
  trait WhatIfForecastSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[ErrorMessage]
    var Status: js.UndefOr[Status]
    var WhatIfAnalysisArn: js.UndefOr[Arn]
    var WhatIfForecastArn: js.UndefOr[LongArn]
    var WhatIfForecastName: js.UndefOr[Name]
  }

  object WhatIfForecastSummary {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[ErrorMessage] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined,
        WhatIfAnalysisArn: js.UndefOr[Arn] = js.undefined,
        WhatIfForecastArn: js.UndefOr[LongArn] = js.undefined,
        WhatIfForecastName: js.UndefOr[Name] = js.undefined
    ): WhatIfForecastSummary = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      WhatIfAnalysisArn.foreach(__v => __obj.updateDynamic("WhatIfAnalysisArn")(__v.asInstanceOf[js.Any]))
      WhatIfForecastArn.foreach(__v => __obj.updateDynamic("WhatIfForecastArn")(__v.asInstanceOf[js.Any]))
      WhatIfForecastName.foreach(__v => __obj.updateDynamic("WhatIfForecastName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WhatIfForecastSummary]
    }
  }

  /** The metrics for a time range within the evaluation portion of a dataset. This object is part of the <a>EvaluationResult</a> object. The <code>TestWindowStart</code> and <code>TestWindowEnd</code> parameters are determined by the <code>BackTestWindowOffset</code> parameter of the <a>EvaluationParameters</a> object.
    */
  @js.native
  trait WindowSummary extends js.Object {
    var EvaluationType: js.UndefOr[EvaluationType]
    var ItemCount: js.UndefOr[Int]
    var Metrics: js.UndefOr[Metrics]
    var TestWindowEnd: js.UndefOr[Timestamp]
    var TestWindowStart: js.UndefOr[Timestamp]
  }

  object WindowSummary {
    @inline
    def apply(
        EvaluationType: js.UndefOr[EvaluationType] = js.undefined,
        ItemCount: js.UndefOr[Int] = js.undefined,
        Metrics: js.UndefOr[Metrics] = js.undefined,
        TestWindowEnd: js.UndefOr[Timestamp] = js.undefined,
        TestWindowStart: js.UndefOr[Timestamp] = js.undefined
    ): WindowSummary = {
      val __obj = js.Dynamic.literal()
      EvaluationType.foreach(__v => __obj.updateDynamic("EvaluationType")(__v.asInstanceOf[js.Any]))
      ItemCount.foreach(__v => __obj.updateDynamic("ItemCount")(__v.asInstanceOf[js.Any]))
      Metrics.foreach(__v => __obj.updateDynamic("Metrics")(__v.asInstanceOf[js.Any]))
      TestWindowEnd.foreach(__v => __obj.updateDynamic("TestWindowEnd")(__v.asInstanceOf[js.Any]))
      TestWindowStart.foreach(__v => __obj.updateDynamic("TestWindowStart")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WindowSummary]
    }
  }
}
