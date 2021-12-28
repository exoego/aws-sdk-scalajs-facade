package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object forecast {
  type Arn = String
  type ArnList = js.Array[Arn]
  type CategoricalParameterRanges = js.Array[CategoricalParameterRange]
  type ContinuousParameterRanges = js.Array[ContinuousParameterRange]
  type DatasetGroups = js.Array[DatasetGroupSummary]
  type DatasetImportJobs = js.Array[DatasetImportJobSummary]
  type Datasets = js.Array[DatasetSummary]
  type ErrorMessage = String
  type ErrorMetrics = js.Array[ErrorMetric]
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
  type Frequency = String
  type GeolocationFormat = String
  type IntegerParameterRanges = js.Array[IntegerParameterRange]
  type KMSKeyArn = String
  type MaxResults = Int
  type Message = String
  type Name = String
  type NextToken = String
  type ParameterKey = String
  type ParameterValue = String
  type PredictorBacktestExportJobs = js.Array[PredictorBacktestExportJobSummary]
  type PredictorEvaluationResults = js.Array[EvaluationResult]
  type PredictorExecutions = js.Array[PredictorExecution]
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
  type TimeZone = String
  type Timestamp = js.Date
  type TimestampFormat = String
  type TrainingParameters = js.Dictionary[ParameterValue]
  type UseGeolocationForTimeZone = Boolean
  type Value = String
  type Values = js.Array[Value]
  type WeightedQuantileLosses = js.Array[WeightedQuantileLoss]

  final class ForecastOps(private val service: Forecast) extends AnyVal {

    @inline def createDatasetFuture(params: CreateDatasetRequest): Future[CreateDatasetResponse] = service.createDataset(params).promise().toFuture
    @inline def createDatasetGroupFuture(params: CreateDatasetGroupRequest): Future[CreateDatasetGroupResponse] = service.createDatasetGroup(params).promise().toFuture
    @inline def createDatasetImportJobFuture(params: CreateDatasetImportJobRequest): Future[CreateDatasetImportJobResponse] = service.createDatasetImportJob(params).promise().toFuture
    @inline def createForecastExportJobFuture(params: CreateForecastExportJobRequest): Future[CreateForecastExportJobResponse] = service.createForecastExportJob(params).promise().toFuture
    @inline def createForecastFuture(params: CreateForecastRequest): Future[CreateForecastResponse] = service.createForecast(params).promise().toFuture
    @inline def createPredictorBacktestExportJobFuture(params: CreatePredictorBacktestExportJobRequest): Future[CreatePredictorBacktestExportJobResponse] = service.createPredictorBacktestExportJob(params).promise().toFuture
    @inline def createPredictorFuture(params: CreatePredictorRequest): Future[CreatePredictorResponse] = service.createPredictor(params).promise().toFuture
    @inline def deleteDatasetFuture(params: DeleteDatasetRequest): Future[js.Object] = service.deleteDataset(params).promise().toFuture
    @inline def deleteDatasetGroupFuture(params: DeleteDatasetGroupRequest): Future[js.Object] = service.deleteDatasetGroup(params).promise().toFuture
    @inline def deleteDatasetImportJobFuture(params: DeleteDatasetImportJobRequest): Future[js.Object] = service.deleteDatasetImportJob(params).promise().toFuture
    @inline def deleteForecastExportJobFuture(params: DeleteForecastExportJobRequest): Future[js.Object] = service.deleteForecastExportJob(params).promise().toFuture
    @inline def deleteForecastFuture(params: DeleteForecastRequest): Future[js.Object] = service.deleteForecast(params).promise().toFuture
    @inline def deletePredictorBacktestExportJobFuture(params: DeletePredictorBacktestExportJobRequest): Future[js.Object] = service.deletePredictorBacktestExportJob(params).promise().toFuture
    @inline def deletePredictorFuture(params: DeletePredictorRequest): Future[js.Object] = service.deletePredictor(params).promise().toFuture
    @inline def describeDatasetFuture(params: DescribeDatasetRequest): Future[DescribeDatasetResponse] = service.describeDataset(params).promise().toFuture
    @inline def describeDatasetGroupFuture(params: DescribeDatasetGroupRequest): Future[DescribeDatasetGroupResponse] = service.describeDatasetGroup(params).promise().toFuture
    @inline def describeDatasetImportJobFuture(params: DescribeDatasetImportJobRequest): Future[DescribeDatasetImportJobResponse] = service.describeDatasetImportJob(params).promise().toFuture
    @inline def describeForecastExportJobFuture(params: DescribeForecastExportJobRequest): Future[DescribeForecastExportJobResponse] = service.describeForecastExportJob(params).promise().toFuture
    @inline def describeForecastFuture(params: DescribeForecastRequest): Future[DescribeForecastResponse] = service.describeForecast(params).promise().toFuture
    @inline def describePredictorBacktestExportJobFuture(params: DescribePredictorBacktestExportJobRequest): Future[DescribePredictorBacktestExportJobResponse] = service.describePredictorBacktestExportJob(params).promise().toFuture
    @inline def describePredictorFuture(params: DescribePredictorRequest): Future[DescribePredictorResponse] = service.describePredictor(params).promise().toFuture
    @inline def getAccuracyMetricsFuture(params: GetAccuracyMetricsRequest): Future[GetAccuracyMetricsResponse] = service.getAccuracyMetrics(params).promise().toFuture
    @inline def listDatasetGroupsFuture(params: ListDatasetGroupsRequest): Future[ListDatasetGroupsResponse] = service.listDatasetGroups(params).promise().toFuture
    @inline def listDatasetImportJobsFuture(params: ListDatasetImportJobsRequest): Future[ListDatasetImportJobsResponse] = service.listDatasetImportJobs(params).promise().toFuture
    @inline def listDatasetsFuture(params: ListDatasetsRequest): Future[ListDatasetsResponse] = service.listDatasets(params).promise().toFuture
    @inline def listForecastExportJobsFuture(params: ListForecastExportJobsRequest): Future[ListForecastExportJobsResponse] = service.listForecastExportJobs(params).promise().toFuture
    @inline def listForecastsFuture(params: ListForecastsRequest): Future[ListForecastsResponse] = service.listForecasts(params).promise().toFuture
    @inline def listPredictorBacktestExportJobsFuture(params: ListPredictorBacktestExportJobsRequest): Future[ListPredictorBacktestExportJobsResponse] = service.listPredictorBacktestExportJobs(params).promise().toFuture
    @inline def listPredictorsFuture(params: ListPredictorsRequest): Future[ListPredictorsResponse] = service.listPredictors(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def stopResourceFuture(params: StopResourceRequest): Future[js.Object] = service.stopResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateDatasetGroupFuture(params: UpdateDatasetGroupRequest): Future[UpdateDatasetGroupResponse] = service.updateDatasetGroup(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/forecastservice", JSImport.Namespace, "AWS.ForecastService")
  class Forecast() extends js.Object {
    def this(config: AWSConfig) = this()

    def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse] = js.native
    def createDatasetGroup(params: CreateDatasetGroupRequest): Request[CreateDatasetGroupResponse] = js.native
    def createDatasetImportJob(params: CreateDatasetImportJobRequest): Request[CreateDatasetImportJobResponse] = js.native
    def createForecast(params: CreateForecastRequest): Request[CreateForecastResponse] = js.native
    def createForecastExportJob(params: CreateForecastExportJobRequest): Request[CreateForecastExportJobResponse] = js.native
    def createPredictor(params: CreatePredictorRequest): Request[CreatePredictorResponse] = js.native
    def createPredictorBacktestExportJob(params: CreatePredictorBacktestExportJobRequest): Request[CreatePredictorBacktestExportJobResponse] = js.native
    def deleteDataset(params: DeleteDatasetRequest): Request[js.Object] = js.native
    def deleteDatasetGroup(params: DeleteDatasetGroupRequest): Request[js.Object] = js.native
    def deleteDatasetImportJob(params: DeleteDatasetImportJobRequest): Request[js.Object] = js.native
    def deleteForecast(params: DeleteForecastRequest): Request[js.Object] = js.native
    def deleteForecastExportJob(params: DeleteForecastExportJobRequest): Request[js.Object] = js.native
    def deletePredictor(params: DeletePredictorRequest): Request[js.Object] = js.native
    def deletePredictorBacktestExportJob(params: DeletePredictorBacktestExportJobRequest): Request[js.Object] = js.native
    def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse] = js.native
    def describeDatasetGroup(params: DescribeDatasetGroupRequest): Request[DescribeDatasetGroupResponse] = js.native
    def describeDatasetImportJob(params: DescribeDatasetImportJobRequest): Request[DescribeDatasetImportJobResponse] = js.native
    def describeForecast(params: DescribeForecastRequest): Request[DescribeForecastResponse] = js.native
    def describeForecastExportJob(params: DescribeForecastExportJobRequest): Request[DescribeForecastExportJobResponse] = js.native
    def describePredictor(params: DescribePredictorRequest): Request[DescribePredictorResponse] = js.native
    def describePredictorBacktestExportJob(params: DescribePredictorBacktestExportJobRequest): Request[DescribePredictorBacktestExportJobResponse] = js.native
    def getAccuracyMetrics(params: GetAccuracyMetricsRequest): Request[GetAccuracyMetricsResponse] = js.native
    def listDatasetGroups(params: ListDatasetGroupsRequest): Request[ListDatasetGroupsResponse] = js.native
    def listDatasetImportJobs(params: ListDatasetImportJobsRequest): Request[ListDatasetImportJobsResponse] = js.native
    def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse] = js.native
    def listForecastExportJobs(params: ListForecastExportJobsRequest): Request[ListForecastExportJobsResponse] = js.native
    def listForecasts(params: ListForecastsRequest): Request[ListForecastsResponse] = js.native
    def listPredictorBacktestExportJobs(params: ListPredictorBacktestExportJobsRequest): Request[ListPredictorBacktestExportJobsResponse] = js.native
    def listPredictors(params: ListPredictorsRequest): Request[ListPredictorsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
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

  @js.native
  sealed trait AttributeType extends js.Any
  object AttributeType {
    val string = "string".asInstanceOf[AttributeType]
    val integer = "integer".asInstanceOf[AttributeType]
    val float = "float".asInstanceOf[AttributeType]
    val timestamp = "timestamp".asInstanceOf[AttributeType]
    val geolocation = "geolocation".asInstanceOf[AttributeType]

    @inline def values = js.Array(string, integer, float, timestamp, geolocation)
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
  trait CreateForecastExportJobRequest extends js.Object {
    var Destination: DataDestination
    var ForecastArn: Arn
    var ForecastExportJobName: Name
    var Tags: js.UndefOr[Tags]
  }

  object CreateForecastExportJobRequest {
    @inline
    def apply(
        Destination: DataDestination,
        ForecastArn: Arn,
        ForecastExportJobName: Name,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateForecastExportJobRequest = {
      val __obj = js.Dynamic.literal(
        "Destination" -> Destination.asInstanceOf[js.Any],
        "ForecastArn" -> ForecastArn.asInstanceOf[js.Any],
        "ForecastExportJobName" -> ForecastExportJobName.asInstanceOf[js.Any]
      )

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
  }

  object CreateForecastRequest {
    @inline
    def apply(
        ForecastName: Name,
        PredictorArn: Arn,
        ForecastTypes: js.UndefOr[ForecastTypes] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateForecastRequest = {
      val __obj = js.Dynamic.literal(
        "ForecastName" -> ForecastName.asInstanceOf[js.Any],
        "PredictorArn" -> PredictorArn.asInstanceOf[js.Any]
      )

      ForecastTypes.foreach(__v => __obj.updateDynamic("ForecastTypes")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
  trait CreatePredictorBacktestExportJobRequest extends js.Object {
    var Destination: DataDestination
    var PredictorArn: Arn
    var PredictorBacktestExportJobName: Name
    var Tags: js.UndefOr[Tags]
  }

  object CreatePredictorBacktestExportJobRequest {
    @inline
    def apply(
        Destination: DataDestination,
        PredictorArn: Arn,
        PredictorBacktestExportJobName: Name,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreatePredictorBacktestExportJobRequest = {
      val __obj = js.Dynamic.literal(
        "Destination" -> Destination.asInstanceOf[js.Any],
        "PredictorArn" -> PredictorArn.asInstanceOf[js.Any],
        "PredictorBacktestExportJobName" -> PredictorBacktestExportJobName.asInstanceOf[js.Any]
      )

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
    var EncryptionConfig: js.UndefOr[EncryptionConfig]
    var EvaluationParameters: js.UndefOr[EvaluationParameters]
    var ForecastTypes: js.UndefOr[ForecastTypes]
    var HPOConfig: js.UndefOr[HyperParameterTuningJobConfig]
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
        EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined,
        EvaluationParameters: js.UndefOr[EvaluationParameters] = js.undefined,
        ForecastTypes: js.UndefOr[ForecastTypes] = js.undefined,
        HPOConfig: js.UndefOr[HyperParameterTuningJobConfig] = js.undefined,
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
      EncryptionConfig.foreach(__v => __obj.updateDynamic("EncryptionConfig")(__v.asInstanceOf[js.Any]))
      EvaluationParameters.foreach(__v => __obj.updateDynamic("EvaluationParameters")(__v.asInstanceOf[js.Any]))
      ForecastTypes.foreach(__v => __obj.updateDynamic("ForecastTypes")(__v.asInstanceOf[js.Any]))
      HPOConfig.foreach(__v => __obj.updateDynamic("HPOConfig")(__v.asInstanceOf[js.Any]))
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

  /** The source of your training data, an AWS Identity and Access Management (IAM) role that allows Amazon Forecast to access the data and, optionally, an AWS Key Management Service (KMS) key. This object is submitted in the <a>CreateDatasetImportJob</a> request.
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

  /** Provides a summary of the dataset group properties used in the <a>ListDatasetGroups</a> operation. To get the complete set of properties, call the <a>DescribeDatasetGroup</a> operation, and provide the <code>DatasetGroupArn</code>.
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

  /** Provides a summary of the dataset import job properties used in the <a>ListDatasetImportJobs</a> operation. To get the complete set of properties, call the <a>DescribeDatasetImportJob</a> operation, and provide the <code>DatasetImportJobArn</code>.
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

  /** Provides a summary of the dataset properties used in the <a>ListDatasets</a> operation. To get the complete set of properties, call the <a>DescribeDataset</a> operation, and provide the <code>DatasetArn</code>.
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
  sealed trait DatasetType extends js.Any
  object DatasetType {
    val TARGET_TIME_SERIES = "TARGET_TIME_SERIES".asInstanceOf[DatasetType]
    val RELATED_TIME_SERIES = "RELATED_TIME_SERIES".asInstanceOf[DatasetType]
    val ITEM_METADATA = "ITEM_METADATA".asInstanceOf[DatasetType]

    @inline def values = js.Array(TARGET_TIME_SERIES, RELATED_TIME_SERIES, ITEM_METADATA)
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
        Status: js.UndefOr[String] = js.undefined
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
      __obj.asInstanceOf[DescribeForecastResponse]
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
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[Message]
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
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
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
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
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
  sealed trait Domain extends js.Any
  object Domain {
    val RETAIL = "RETAIL".asInstanceOf[Domain]
    val CUSTOM = "CUSTOM".asInstanceOf[Domain]
    val INVENTORY_PLANNING = "INVENTORY_PLANNING".asInstanceOf[Domain]
    val EC2_CAPACITY = "EC2_CAPACITY".asInstanceOf[Domain]
    val WORK_FORCE = "WORK_FORCE".asInstanceOf[Domain]
    val WEB_TRAFFIC = "WEB_TRAFFIC".asInstanceOf[Domain]
    val METRICS = "METRICS".asInstanceOf[Domain]

    @inline def values = js.Array(RETAIL, CUSTOM, INVENTORY_PLANNING, EC2_CAPACITY, WORK_FORCE, WEB_TRAFFIC, METRICS)
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
    var RMSE: js.UndefOr[Double]
    var WAPE: js.UndefOr[Double]
  }

  object ErrorMetric {
    @inline
    def apply(
        ForecastType: js.UndefOr[ForecastType] = js.undefined,
        RMSE: js.UndefOr[Double] = js.undefined,
        WAPE: js.UndefOr[Double] = js.undefined
    ): ErrorMetric = {
      val __obj = js.Dynamic.literal()
      ForecastType.foreach(__v => __obj.updateDynamic("ForecastType")(__v.asInstanceOf[js.Any]))
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

  @js.native
  sealed trait EvaluationType extends js.Any
  object EvaluationType {
    val SUMMARY = "SUMMARY".asInstanceOf[EvaluationType]
    val COMPUTED = "COMPUTED".asInstanceOf[EvaluationType]

    @inline def values = js.Array(SUMMARY, COMPUTED)
  }

  /** Provides featurization (transformation) information for a dataset field. This object is part of the <a>FeaturizationConfig</a> object. For example: <code>{</code> <code>"AttributeName": "demand",</code> <code>FeaturizationPipeline [ {</code> <code>"FeaturizationMethodName": "filling",</code> <code>"FeaturizationMethodParameters": {"aggregation": "avg", "backfill": "nan"}</code> <code>} ]</code> <code>}</code>
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

  /** In a <a>CreatePredictor</a> operation, the specified algorithm trains a model using the specified dataset group. You can optionally tell the operation to modify data fields prior to training a model. These modifications are referred to as <i>featurization</i>. You define featurization using the <code>FeaturizationConfig</code> object. You specify an array of transformations, one for each field that you want to featurize. You then include the <code>FeaturizationConfig</code> object in your <code>CreatePredictor</code> request. Amazon Forecast applies the featurization to the <code>TARGET_TIME_SERIES</code> and <code>RELATED_TIME_SERIES</code> datasets before model training. You can create multiple featurization configurations. For example, you might call the <code>CreatePredictor</code> operation twice by specifying different featurization configurations.
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

  @js.native
  sealed trait FeaturizationMethodName extends js.Any
  object FeaturizationMethodName {
    val filling = "filling".asInstanceOf[FeaturizationMethodName]

    @inline def values = js.Array(filling)
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

  @js.native
  sealed trait FilterConditionString extends js.Any
  object FilterConditionString {
    val IS = "IS".asInstanceOf[FilterConditionString]
    val IS_NOT = "IS_NOT".asInstanceOf[FilterConditionString]

    @inline def values = js.Array(IS, IS_NOT)
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
    var PredictorEvaluationResults: js.UndefOr[PredictorEvaluationResults]
  }

  object GetAccuracyMetricsResponse {
    @inline
    def apply(
        PredictorEvaluationResults: js.UndefOr[PredictorEvaluationResults] = js.undefined
    ): GetAccuracyMetricsResponse = {
      val __obj = js.Dynamic.literal()
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

  /** The data used to train a predictor. The data includes a dataset group and any supplementary features. You specify this object in the <a>CreatePredictor</a> request.
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

  /** Provides metrics that are used to evaluate the performance of a predictor. This object is part of the <a>WindowSummary</a> object.
    */
  @js.native
  trait Metrics extends js.Object {
    var ErrorMetrics: js.UndefOr[ErrorMetrics]
    var RMSE: js.UndefOr[Double]
    var WeightedQuantileLosses: js.UndefOr[WeightedQuantileLosses]
  }

  object Metrics {
    @inline
    def apply(
        ErrorMetrics: js.UndefOr[ErrorMetrics] = js.undefined,
        RMSE: js.UndefOr[Double] = js.undefined,
        WeightedQuantileLosses: js.UndefOr[WeightedQuantileLosses] = js.undefined
    ): Metrics = {
      val __obj = js.Dynamic.literal()
      ErrorMetrics.foreach(__v => __obj.updateDynamic("ErrorMetrics")(__v.asInstanceOf[js.Any]))
      RMSE.foreach(__v => __obj.updateDynamic("RMSE")(__v.asInstanceOf[js.Any]))
      WeightedQuantileLosses.foreach(__v => __obj.updateDynamic("WeightedQuantileLosses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Metrics]
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

  /** Provides a summary of the predictor properties that are used in the <a>ListPredictors</a> operation. To get the complete set of properties, call the <a>DescribePredictor</a> operation, and provide the listed <code>PredictorArn</code>.
    */
  @js.native
  trait PredictorSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DatasetGroupArn: js.UndefOr[Arn]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[ErrorMessage]
    var PredictorArn: js.UndefOr[Arn]
    var PredictorName: js.UndefOr[Name]
    var Status: js.UndefOr[Status]
  }

  object PredictorSummary {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DatasetGroupArn: js.UndefOr[Arn] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[ErrorMessage] = js.undefined,
        PredictorArn: js.UndefOr[Arn] = js.undefined,
        PredictorName: js.UndefOr[Name] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): PredictorSummary = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DatasetGroupArn.foreach(__v => __obj.updateDynamic("DatasetGroupArn")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      PredictorArn.foreach(__v => __obj.updateDynamic("PredictorArn")(__v.asInstanceOf[js.Any]))
      PredictorName.foreach(__v => __obj.updateDynamic("PredictorName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredictorSummary]
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

  @js.native
  sealed trait ScalingType extends js.Any
  object ScalingType {
    val Auto = "Auto".asInstanceOf[ScalingType]
    val Linear = "Linear".asInstanceOf[ScalingType]
    val Logarithmic = "Logarithmic".asInstanceOf[ScalingType]
    val ReverseLogarithmic = "ReverseLogarithmic".asInstanceOf[ScalingType]

    @inline def values = js.Array(Auto, Linear, Logarithmic, ReverseLogarithmic)
  }

  /** Defines the fields of a dataset. You specify this object in the <a>CreateDataset</a> request.
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

  /** An attribute of a schema, which defines a dataset field. A schema attribute is required for every field in a dataset. The <a>Schema</a> object contains an array of <code>SchemaAttribute</code> objects.
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

  /** Provides statistics for each data field imported into to an Amazon Forecast dataset with the <a>CreateDatasetImportJob</a> operation.
    */
  @js.native
  trait Statistics extends js.Object {
    var Avg: js.UndefOr[Double]
    var Count: js.UndefOr[Int]
    var CountDistinct: js.UndefOr[Int]
    var CountNan: js.UndefOr[Int]
    var CountNull: js.UndefOr[Int]
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
        CountNan: js.UndefOr[Int] = js.undefined,
        CountNull: js.UndefOr[Int] = js.undefined,
        Max: js.UndefOr[String] = js.undefined,
        Min: js.UndefOr[String] = js.undefined,
        Stddev: js.UndefOr[Double] = js.undefined
    ): Statistics = {
      val __obj = js.Dynamic.literal()
      Avg.foreach(__v => __obj.updateDynamic("Avg")(__v.asInstanceOf[js.Any]))
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      CountDistinct.foreach(__v => __obj.updateDynamic("CountDistinct")(__v.asInstanceOf[js.Any]))
      CountNan.foreach(__v => __obj.updateDynamic("CountNan")(__v.asInstanceOf[js.Any]))
      CountNull.foreach(__v => __obj.updateDynamic("CountNull")(__v.asInstanceOf[js.Any]))
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

  /** Describes a supplementary feature of a dataset group. This object is part of the <a>InputDataConfig</a> object. Forecast supports the Weather Index and Holidays built-in featurizations.
    * ```Weather Index``` The Amazon Forecast Weather Index is a built-in featurization that incorporates historical and projected weather information into your model. The Weather Index supplements your datasets with over two years of historical weather data and up to 14 days of projected weather data. For more information, see [[https://docs.aws.amazon.com/forecast/latest/dg/weather.html|Amazon Forecast Weather Index]].
    * ```Holidays``` Holidays is a built-in featurization that incorporates a feature-engineered dataset of national holiday information into your model. It provides native support for the holiday calendars of 66 countries. To view the holiday calendars, refer to the [[http://jollyday.sourceforge.net/data.html|Jollyday]] library. For more information, see [[https://docs.aws.amazon.com/forecast/latest/dg/holidays.html|Holidays Featurization]].
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
