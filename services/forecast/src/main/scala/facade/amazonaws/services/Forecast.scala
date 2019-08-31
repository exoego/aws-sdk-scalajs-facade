package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object forecast {
  type Arn                           = String
  type ArnList                       = js.Array[Arn]
  type AttributeType                 = String
  type CategoricalParameterRanges    = js.Array[CategoricalParameterRange]
  type ContinuousParameterRanges     = js.Array[ContinuousParameterRange]
  type DatasetGroups                 = js.Array[DatasetGroupSummary]
  type DatasetImportJobs             = js.Array[DatasetImportJobSummary]
  type DatasetType                   = String
  type Datasets                      = js.Array[DatasetSummary]
  type Domain                        = String
  type ErrorMessage                  = String
  type EvaluationType                = String
  type FeaturizationMethodName       = String
  type FeaturizationMethodParameters = js.Dictionary[ParameterValue]
  type FeaturizationPipeline         = js.Array[FeaturizationMethod]
  type Featurizations                = js.Array[Featurization]
  type FieldStatistics               = js.Dictionary[Statistics]
  type FilterConditionString         = String
  type Filters                       = js.Array[Filter]
  type ForecastDimensions            = js.Array[Name]
  type ForecastExportJobs            = js.Array[ForecastExportJobSummary]
  type Forecasts                     = js.Array[ForecastSummary]
  type Frequency                     = String
  type IntegerParameterRanges        = js.Array[IntegerParameterRange]
  type KMSKeyArn                     = String
  type MaxResults                    = Int
  type Message                       = String
  type Name                          = String
  type NextToken                     = String
  type ParameterKey                  = String
  type ParameterValue                = String
  type PredictorEvaluationResults    = js.Array[EvaluationResult]
  type Predictors                    = js.Array[PredictorSummary]
  type S3Path                        = String
  type ScalingType                   = String
  type SchemaAttributes              = js.Array[SchemaAttribute]
  type Status                        = String
  type SupplementaryFeatures         = js.Array[SupplementaryFeature]
  type TestWindows                   = js.Array[WindowSummary]
  type Timestamp                     = js.Date
  type TimestampFormat               = String
  type TrainingParameters            = js.Dictionary[ParameterValue]
  type Value                         = String
  type Values                        = js.Array[Value]
  type WeightedQuantileLosses        = js.Array[WeightedQuantileLoss]

  implicit final class ForecastOps(private val service: Forecast) extends AnyVal {

    def createDatasetFuture(params: CreateDatasetRequest): Future[CreateDatasetResponse] =
      service.createDataset(params).promise.toFuture
    def createDatasetGroupFuture(params: CreateDatasetGroupRequest): Future[CreateDatasetGroupResponse] =
      service.createDatasetGroup(params).promise.toFuture
    def createDatasetImportJobFuture(params: CreateDatasetImportJobRequest): Future[CreateDatasetImportJobResponse] =
      service.createDatasetImportJob(params).promise.toFuture
    def createForecastExportJobFuture(params: CreateForecastExportJobRequest): Future[CreateForecastExportJobResponse] =
      service.createForecastExportJob(params).promise.toFuture
    def createForecastFuture(params: CreateForecastRequest): Future[CreateForecastResponse] =
      service.createForecast(params).promise.toFuture
    def createPredictorFuture(params: CreatePredictorRequest): Future[CreatePredictorResponse] =
      service.createPredictor(params).promise.toFuture
    def deleteDatasetFuture(params: DeleteDatasetRequest): Future[js.Object] =
      service.deleteDataset(params).promise.toFuture
    def deleteDatasetGroupFuture(params: DeleteDatasetGroupRequest): Future[js.Object] =
      service.deleteDatasetGroup(params).promise.toFuture
    def deleteDatasetImportJobFuture(params: DeleteDatasetImportJobRequest): Future[js.Object] =
      service.deleteDatasetImportJob(params).promise.toFuture
    def deleteForecastExportJobFuture(params: DeleteForecastExportJobRequest): Future[js.Object] =
      service.deleteForecastExportJob(params).promise.toFuture
    def deleteForecastFuture(params: DeleteForecastRequest): Future[js.Object] =
      service.deleteForecast(params).promise.toFuture
    def deletePredictorFuture(params: DeletePredictorRequest): Future[js.Object] =
      service.deletePredictor(params).promise.toFuture
    def describeDatasetFuture(params: DescribeDatasetRequest): Future[DescribeDatasetResponse] =
      service.describeDataset(params).promise.toFuture
    def describeDatasetGroupFuture(params: DescribeDatasetGroupRequest): Future[DescribeDatasetGroupResponse] =
      service.describeDatasetGroup(params).promise.toFuture
    def describeDatasetImportJobFuture(
        params: DescribeDatasetImportJobRequest
    ): Future[DescribeDatasetImportJobResponse] = service.describeDatasetImportJob(params).promise.toFuture
    def describeForecastExportJobFuture(
        params: DescribeForecastExportJobRequest
    ): Future[DescribeForecastExportJobResponse] = service.describeForecastExportJob(params).promise.toFuture
    def describeForecastFuture(params: DescribeForecastRequest): Future[DescribeForecastResponse] =
      service.describeForecast(params).promise.toFuture
    def describePredictorFuture(params: DescribePredictorRequest): Future[DescribePredictorResponse] =
      service.describePredictor(params).promise.toFuture
    def getAccuracyMetricsFuture(params: GetAccuracyMetricsRequest): Future[GetAccuracyMetricsResponse] =
      service.getAccuracyMetrics(params).promise.toFuture
    def listDatasetGroupsFuture(params: ListDatasetGroupsRequest): Future[ListDatasetGroupsResponse] =
      service.listDatasetGroups(params).promise.toFuture
    def listDatasetImportJobsFuture(params: ListDatasetImportJobsRequest): Future[ListDatasetImportJobsResponse] =
      service.listDatasetImportJobs(params).promise.toFuture
    def listDatasetsFuture(params: ListDatasetsRequest): Future[ListDatasetsResponse] =
      service.listDatasets(params).promise.toFuture
    def listForecastExportJobsFuture(params: ListForecastExportJobsRequest): Future[ListForecastExportJobsResponse] =
      service.listForecastExportJobs(params).promise.toFuture
    def listForecastsFuture(params: ListForecastsRequest): Future[ListForecastsResponse] =
      service.listForecasts(params).promise.toFuture
    def listPredictorsFuture(params: ListPredictorsRequest): Future[ListPredictorsResponse] =
      service.listPredictors(params).promise.toFuture
    def updateDatasetGroupFuture(params: UpdateDatasetGroupRequest): Future[UpdateDatasetGroupResponse] =
      service.updateDatasetGroup(params).promise.toFuture
  }
}

package forecast {
  @js.native
  @JSImport("aws-sdk", "ForecastService")
  class Forecast() extends js.Object {
    def this(config: AWSConfig) = this()

    def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse]                = js.native
    def createDatasetGroup(params: CreateDatasetGroupRequest): Request[CreateDatasetGroupResponse] = js.native
    def createDatasetImportJob(params: CreateDatasetImportJobRequest): Request[CreateDatasetImportJobResponse] =
      js.native
    def createForecast(params: CreateForecastRequest): Request[CreateForecastResponse] = js.native
    def createForecastExportJob(params: CreateForecastExportJobRequest): Request[CreateForecastExportJobResponse] =
      js.native
    def createPredictor(params: CreatePredictorRequest): Request[CreatePredictorResponse]                = js.native
    def deleteDataset(params: DeleteDatasetRequest): Request[js.Object]                                  = js.native
    def deleteDatasetGroup(params: DeleteDatasetGroupRequest): Request[js.Object]                        = js.native
    def deleteDatasetImportJob(params: DeleteDatasetImportJobRequest): Request[js.Object]                = js.native
    def deleteForecast(params: DeleteForecastRequest): Request[js.Object]                                = js.native
    def deleteForecastExportJob(params: DeleteForecastExportJobRequest): Request[js.Object]              = js.native
    def deletePredictor(params: DeletePredictorRequest): Request[js.Object]                              = js.native
    def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse]                = js.native
    def describeDatasetGroup(params: DescribeDatasetGroupRequest): Request[DescribeDatasetGroupResponse] = js.native
    def describeDatasetImportJob(params: DescribeDatasetImportJobRequest): Request[DescribeDatasetImportJobResponse] =
      js.native
    def describeForecast(params: DescribeForecastRequest): Request[DescribeForecastResponse] = js.native
    def describeForecastExportJob(
        params: DescribeForecastExportJobRequest
    ): Request[DescribeForecastExportJobResponse]                                                           = js.native
    def describePredictor(params: DescribePredictorRequest): Request[DescribePredictorResponse]             = js.native
    def getAccuracyMetrics(params: GetAccuracyMetricsRequest): Request[GetAccuracyMetricsResponse]          = js.native
    def listDatasetGroups(params: ListDatasetGroupsRequest): Request[ListDatasetGroupsResponse]             = js.native
    def listDatasetImportJobs(params: ListDatasetImportJobsRequest): Request[ListDatasetImportJobsResponse] = js.native
    def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse]                            = js.native
    def listForecastExportJobs(params: ListForecastExportJobsRequest): Request[ListForecastExportJobsResponse] =
      js.native
    def listForecasts(params: ListForecastsRequest): Request[ListForecastsResponse]                = js.native
    def listPredictors(params: ListPredictorsRequest): Request[ListPredictorsResponse]             = js.native
    def updateDatasetGroup(params: UpdateDatasetGroupRequest): Request[UpdateDatasetGroupResponse] = js.native
  }

  object AttributeTypeEnum {
    val string    = "string"
    val integer   = "integer"
    val float     = "float"
    val timestamp = "timestamp"

    val values = js.Object.freeze(js.Array(string, integer, float, timestamp))
  }

  /**
    * Specifies a categorical hyperparameter and it's range of tunable values. This object is part of the <a>ParameterRanges</a> object.
    */
  @js.native
  trait CategoricalParameterRange extends js.Object {
    var Name: Name
    var Values: Values
  }

  object CategoricalParameterRange {
    def apply(
        Name: Name,
        Values: Values
    ): CategoricalParameterRange = {
      val __obj = js.Dynamic.literal(
        "Name"   -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CategoricalParameterRange]
    }
  }

  /**
    * Specifies a continuous hyperparameter and it's range of tunable values. This object is part of the <a>ParameterRanges</a> object.
    */
  @js.native
  trait ContinuousParameterRange extends js.Object {
    var MaxValue: Double
    var MinValue: Double
    var Name: Name
    var ScalingType: js.UndefOr[ScalingType]
  }

  object ContinuousParameterRange {
    def apply(
        MaxValue: Double,
        MinValue: Double,
        Name: Name,
        ScalingType: js.UndefOr[ScalingType] = js.undefined
    ): ContinuousParameterRange = {
      val __obj = js.Dynamic.literal(
        "MaxValue" -> MaxValue.asInstanceOf[js.Any],
        "MinValue" -> MinValue.asInstanceOf[js.Any],
        "Name"     -> Name.asInstanceOf[js.Any]
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
  }

  object CreateDatasetGroupRequest {
    def apply(
        DatasetGroupName: Name,
        Domain: Domain,
        DatasetArns: js.UndefOr[ArnList] = js.undefined
    ): CreateDatasetGroupRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetGroupName" -> DatasetGroupName.asInstanceOf[js.Any],
        "Domain"           -> Domain.asInstanceOf[js.Any]
      )

      DatasetArns.foreach(__v => __obj.updateDynamic("DatasetArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetGroupRequest]
    }
  }

  @js.native
  trait CreateDatasetGroupResponse extends js.Object {
    var DatasetGroupArn: js.UndefOr[Arn]
  }

  object CreateDatasetGroupResponse {
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
    var TimestampFormat: js.UndefOr[TimestampFormat]
  }

  object CreateDatasetImportJobRequest {
    def apply(
        DataSource: DataSource,
        DatasetArn: Arn,
        DatasetImportJobName: Name,
        TimestampFormat: js.UndefOr[TimestampFormat] = js.undefined
    ): CreateDatasetImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "DataSource"           -> DataSource.asInstanceOf[js.Any],
        "DatasetArn"           -> DatasetArn.asInstanceOf[js.Any],
        "DatasetImportJobName" -> DatasetImportJobName.asInstanceOf[js.Any]
      )

      TimestampFormat.foreach(__v => __obj.updateDynamic("TimestampFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetImportJobRequest]
    }
  }

  @js.native
  trait CreateDatasetImportJobResponse extends js.Object {
    var DatasetImportJobArn: js.UndefOr[Arn]
  }

  object CreateDatasetImportJobResponse {
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
  }

  object CreateDatasetRequest {
    def apply(
        DatasetName: Name,
        DatasetType: DatasetType,
        Domain: Domain,
        Schema: Schema,
        DataFrequency: js.UndefOr[Frequency] = js.undefined,
        EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined
    ): CreateDatasetRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetName" -> DatasetName.asInstanceOf[js.Any],
        "DatasetType" -> DatasetType.asInstanceOf[js.Any],
        "Domain"      -> Domain.asInstanceOf[js.Any],
        "Schema"      -> Schema.asInstanceOf[js.Any]
      )

      DataFrequency.foreach(__v => __obj.updateDynamic("DataFrequency")(__v.asInstanceOf[js.Any]))
      EncryptionConfig.foreach(__v => __obj.updateDynamic("EncryptionConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatasetRequest]
    }
  }

  @js.native
  trait CreateDatasetResponse extends js.Object {
    var DatasetArn: js.UndefOr[Arn]
  }

  object CreateDatasetResponse {
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
  }

  object CreateForecastExportJobRequest {
    def apply(
        Destination: DataDestination,
        ForecastArn: Arn,
        ForecastExportJobName: Name
    ): CreateForecastExportJobRequest = {
      val __obj = js.Dynamic.literal(
        "Destination"           -> Destination.asInstanceOf[js.Any],
        "ForecastArn"           -> ForecastArn.asInstanceOf[js.Any],
        "ForecastExportJobName" -> ForecastExportJobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateForecastExportJobRequest]
    }
  }

  @js.native
  trait CreateForecastExportJobResponse extends js.Object {
    var ForecastExportJobArn: js.UndefOr[Arn]
  }

  object CreateForecastExportJobResponse {
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
  }

  object CreateForecastRequest {
    def apply(
        ForecastName: Name,
        PredictorArn: Arn
    ): CreateForecastRequest = {
      val __obj = js.Dynamic.literal(
        "ForecastName" -> ForecastName.asInstanceOf[js.Any],
        "PredictorArn" -> PredictorArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateForecastRequest]
    }
  }

  @js.native
  trait CreateForecastResponse extends js.Object {
    var ForecastArn: js.UndefOr[Arn]
  }

  object CreateForecastResponse {
    def apply(
        ForecastArn: js.UndefOr[Arn] = js.undefined
    ): CreateForecastResponse = {
      val __obj = js.Dynamic.literal()
      ForecastArn.foreach(__v => __obj.updateDynamic("ForecastArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateForecastResponse]
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
    var HPOConfig: js.UndefOr[HyperParameterTuningJobConfig]
    var PerformAutoML: js.UndefOr[Boolean]
    var PerformHPO: js.UndefOr[Boolean]
    var TrainingParameters: js.UndefOr[TrainingParameters]
  }

  object CreatePredictorRequest {
    def apply(
        FeaturizationConfig: FeaturizationConfig,
        ForecastHorizon: Int,
        InputDataConfig: InputDataConfig,
        PredictorName: Name,
        AlgorithmArn: js.UndefOr[Arn] = js.undefined,
        EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined,
        EvaluationParameters: js.UndefOr[EvaluationParameters] = js.undefined,
        HPOConfig: js.UndefOr[HyperParameterTuningJobConfig] = js.undefined,
        PerformAutoML: js.UndefOr[Boolean] = js.undefined,
        PerformHPO: js.UndefOr[Boolean] = js.undefined,
        TrainingParameters: js.UndefOr[TrainingParameters] = js.undefined
    ): CreatePredictorRequest = {
      val __obj = js.Dynamic.literal(
        "FeaturizationConfig" -> FeaturizationConfig.asInstanceOf[js.Any],
        "ForecastHorizon"     -> ForecastHorizon.asInstanceOf[js.Any],
        "InputDataConfig"     -> InputDataConfig.asInstanceOf[js.Any],
        "PredictorName"       -> PredictorName.asInstanceOf[js.Any]
      )

      AlgorithmArn.foreach(__v => __obj.updateDynamic("AlgorithmArn")(__v.asInstanceOf[js.Any]))
      EncryptionConfig.foreach(__v => __obj.updateDynamic("EncryptionConfig")(__v.asInstanceOf[js.Any]))
      EvaluationParameters.foreach(__v => __obj.updateDynamic("EvaluationParameters")(__v.asInstanceOf[js.Any]))
      HPOConfig.foreach(__v => __obj.updateDynamic("HPOConfig")(__v.asInstanceOf[js.Any]))
      PerformAutoML.foreach(__v => __obj.updateDynamic("PerformAutoML")(__v.asInstanceOf[js.Any]))
      PerformHPO.foreach(__v => __obj.updateDynamic("PerformHPO")(__v.asInstanceOf[js.Any]))
      TrainingParameters.foreach(__v => __obj.updateDynamic("TrainingParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePredictorRequest]
    }
  }

  @js.native
  trait CreatePredictorResponse extends js.Object {
    var PredictorArn: js.UndefOr[Arn]
  }

  object CreatePredictorResponse {
    def apply(
        PredictorArn: js.UndefOr[Arn] = js.undefined
    ): CreatePredictorResponse = {
      val __obj = js.Dynamic.literal()
      PredictorArn.foreach(__v => __obj.updateDynamic("PredictorArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePredictorResponse]
    }
  }

  /**
    * The destination of an exported forecast and credentials to access the location. This object is submitted in the <a>CreateForecastExportJob</a> request.
    */
  @js.native
  trait DataDestination extends js.Object {
    var S3Config: S3Config
  }

  object DataDestination {
    def apply(
        S3Config: S3Config
    ): DataDestination = {
      val __obj = js.Dynamic.literal(
        "S3Config" -> S3Config.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DataDestination]
    }
  }

  /**
    * The source of your training data and credentials to access the data. This object is submitted in the <a>CreateDatasetImportJob</a> request.
    */
  @js.native
  trait DataSource extends js.Object {
    var S3Config: S3Config
  }

  object DataSource {
    def apply(
        S3Config: S3Config
    ): DataSource = {
      val __obj = js.Dynamic.literal(
        "S3Config" -> S3Config.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DataSource]
    }
  }

  /**
    * Provides a summary of the dataset group properties used in the <a>ListDatasetGroups</a> operation. To get the complete set of properties, call the <a>DescribeDatasetGroup</a> operation, and provide the listed <code>DatasetGroupArn</code>.
    */
  @js.native
  trait DatasetGroupSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DatasetGroupArn: js.UndefOr[Arn]
    var DatasetGroupName: js.UndefOr[Name]
    var LastModificationTime: js.UndefOr[Timestamp]
  }

  object DatasetGroupSummary {
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

  /**
    * Provides a summary of the dataset import job properties used in the <a>ListDatasetImportJobs</a> operation. To get the complete set of properties, call the <a>DescribeDatasetImportJob</a> operation, and provide the listed <code>DatasetImportJobArn</code>.
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

  /**
    * Provides a summary of the dataset properties used in the <a>ListDatasets</a> operation. To get the complete set of properties, call the <a>DescribeDataset</a> operation, and provide the listed <code>DatasetArn</code>.
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

  object DatasetTypeEnum {
    val TARGET_TIME_SERIES  = "TARGET_TIME_SERIES"
    val RELATED_TIME_SERIES = "RELATED_TIME_SERIES"
    val ITEM_METADATA       = "ITEM_METADATA"

    val values = js.Object.freeze(js.Array(TARGET_TIME_SERIES, RELATED_TIME_SERIES, ITEM_METADATA))
  }

  @js.native
  trait DeleteDatasetGroupRequest extends js.Object {
    var DatasetGroupArn: Arn
  }

  object DeleteDatasetGroupRequest {
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
  trait DeletePredictorRequest extends js.Object {
    var PredictorArn: Arn
  }

  object DeletePredictorRequest {
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
    var FieldStatistics: js.UndefOr[FieldStatistics]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[Message]
    var Status: js.UndefOr[Status]
    var TimestampFormat: js.UndefOr[TimestampFormat]
  }

  object DescribeDatasetImportJobResponse {
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DataSize: js.UndefOr[Double] = js.undefined,
        DataSource: js.UndefOr[DataSource] = js.undefined,
        DatasetArn: js.UndefOr[Arn] = js.undefined,
        DatasetImportJobArn: js.UndefOr[Arn] = js.undefined,
        DatasetImportJobName: js.UndefOr[Name] = js.undefined,
        FieldStatistics: js.UndefOr[FieldStatistics] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined,
        TimestampFormat: js.UndefOr[TimestampFormat] = js.undefined
    ): DescribeDatasetImportJobResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DataSize.foreach(__v => __obj.updateDynamic("DataSize")(__v.asInstanceOf[js.Any]))
      DataSource.foreach(__v => __obj.updateDynamic("DataSource")(__v.asInstanceOf[js.Any]))
      DatasetArn.foreach(__v => __obj.updateDynamic("DatasetArn")(__v.asInstanceOf[js.Any]))
      DatasetImportJobArn.foreach(__v => __obj.updateDynamic("DatasetImportJobArn")(__v.asInstanceOf[js.Any]))
      DatasetImportJobName.foreach(__v => __obj.updateDynamic("DatasetImportJobName")(__v.asInstanceOf[js.Any]))
      FieldStatistics.foreach(__v => __obj.updateDynamic("FieldStatistics")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TimestampFormat.foreach(__v => __obj.updateDynamic("TimestampFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDatasetImportJobResponse]
    }
  }

  @js.native
  trait DescribeDatasetRequest extends js.Object {
    var DatasetArn: Arn
  }

  object DescribeDatasetRequest {
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
    var ForecastArn: js.UndefOr[Arn]
    var ForecastName: js.UndefOr[Name]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[ErrorMessage]
    var PredictorArn: js.UndefOr[Arn]
    var Status: js.UndefOr[String]
  }

  object DescribeForecastResponse {
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DatasetGroupArn: js.UndefOr[Arn] = js.undefined,
        ForecastArn: js.UndefOr[Arn] = js.undefined,
        ForecastName: js.UndefOr[Name] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[ErrorMessage] = js.undefined,
        PredictorArn: js.UndefOr[Arn] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): DescribeForecastResponse = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DatasetGroupArn.foreach(__v => __obj.updateDynamic("DatasetGroupArn")(__v.asInstanceOf[js.Any]))
      ForecastArn.foreach(__v => __obj.updateDynamic("ForecastArn")(__v.asInstanceOf[js.Any]))
      ForecastName.foreach(__v => __obj.updateDynamic("ForecastName")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      PredictorArn.foreach(__v => __obj.updateDynamic("PredictorArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeForecastResponse]
    }
  }

  @js.native
  trait DescribePredictorRequest extends js.Object {
    var PredictorArn: Arn
  }

  object DescribePredictorRequest {
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
    var EvaluationParameters: js.UndefOr[EvaluationParameters]
    var FeaturizationConfig: js.UndefOr[FeaturizationConfig]
    var ForecastHorizon: js.UndefOr[Int]
    var HPOConfig: js.UndefOr[HyperParameterTuningJobConfig]
    var InputDataConfig: js.UndefOr[InputDataConfig]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[Message]
    var PerformAutoML: js.UndefOr[Boolean]
    var PerformHPO: js.UndefOr[Boolean]
    var PredictorArn: js.UndefOr[Name]
    var PredictorName: js.UndefOr[Name]
    var Status: js.UndefOr[Status]
    var TrainingParameters: js.UndefOr[TrainingParameters]
  }

  object DescribePredictorResponse {
    def apply(
        AlgorithmArn: js.UndefOr[Arn] = js.undefined,
        AutoMLAlgorithmArns: js.UndefOr[ArnList] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DatasetImportJobArns: js.UndefOr[ArnList] = js.undefined,
        EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined,
        EvaluationParameters: js.UndefOr[EvaluationParameters] = js.undefined,
        FeaturizationConfig: js.UndefOr[FeaturizationConfig] = js.undefined,
        ForecastHorizon: js.UndefOr[Int] = js.undefined,
        HPOConfig: js.UndefOr[HyperParameterTuningJobConfig] = js.undefined,
        InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined,
        LastModificationTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        PerformAutoML: js.UndefOr[Boolean] = js.undefined,
        PerformHPO: js.UndefOr[Boolean] = js.undefined,
        PredictorArn: js.UndefOr[Name] = js.undefined,
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
      EvaluationParameters.foreach(__v => __obj.updateDynamic("EvaluationParameters")(__v.asInstanceOf[js.Any]))
      FeaturizationConfig.foreach(__v => __obj.updateDynamic("FeaturizationConfig")(__v.asInstanceOf[js.Any]))
      ForecastHorizon.foreach(__v => __obj.updateDynamic("ForecastHorizon")(__v.asInstanceOf[js.Any]))
      HPOConfig.foreach(__v => __obj.updateDynamic("HPOConfig")(__v.asInstanceOf[js.Any]))
      InputDataConfig.foreach(__v => __obj.updateDynamic("InputDataConfig")(__v.asInstanceOf[js.Any]))
      LastModificationTime.foreach(__v => __obj.updateDynamic("LastModificationTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      PerformAutoML.foreach(__v => __obj.updateDynamic("PerformAutoML")(__v.asInstanceOf[js.Any]))
      PerformHPO.foreach(__v => __obj.updateDynamic("PerformHPO")(__v.asInstanceOf[js.Any]))
      PredictorArn.foreach(__v => __obj.updateDynamic("PredictorArn")(__v.asInstanceOf[js.Any]))
      PredictorName.foreach(__v => __obj.updateDynamic("PredictorName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TrainingParameters.foreach(__v => __obj.updateDynamic("TrainingParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePredictorResponse]
    }
  }

  object DomainEnum {
    val RETAIL             = "RETAIL"
    val CUSTOM             = "CUSTOM"
    val INVENTORY_PLANNING = "INVENTORY_PLANNING"
    val EC2_CAPACITY       = "EC2_CAPACITY"
    val WORK_FORCE         = "WORK_FORCE"
    val WEB_TRAFFIC        = "WEB_TRAFFIC"
    val METRICS            = "METRICS"

    val values =
      js.Object.freeze(js.Array(RETAIL, CUSTOM, INVENTORY_PLANNING, EC2_CAPACITY, WORK_FORCE, WEB_TRAFFIC, METRICS))
  }

  /**
    * An AWS Key Management Service (KMS) key and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the key. This object is optionally submitted in the <a>CreateDataset</a> and <a>CreatePredictor</a> requests.
    */
  @js.native
  trait EncryptionConfig extends js.Object {
    var KMSKeyArn: KMSKeyArn
    var RoleArn: Arn
  }

  object EncryptionConfig {
    def apply(
        KMSKeyArn: KMSKeyArn,
        RoleArn: Arn
    ): EncryptionConfig = {
      val __obj = js.Dynamic.literal(
        "KMSKeyArn" -> KMSKeyArn.asInstanceOf[js.Any],
        "RoleArn"   -> RoleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EncryptionConfig]
    }
  }

  /**
    * Parameters that define how to split a dataset into training data and testing data, and the number of iterations to perform. These parameters are specified in the predefined algorithms and can be overridden in the <a>CreatePredictor</a> request.
    *  For example, suppose that you have a dataset with data collection frequency set to every day and you have 200 days worth of data (that is, 200 data points). Now suppose that you set the <code>NumberOfBacktestWindows</code> to 2 and the <code>BackTestWindowOffset</code> parameter to 20. The algorithm splits the data twice. The first time, the algorithm trains the model using the first 180 data points and uses the last 20 data points for evaluation. The second time, the algorithm trains the model using the first 160 data points and uses the last 40 data points for evaluation.
    */
  @js.native
  trait EvaluationParameters extends js.Object {
    var BackTestWindowOffset: js.UndefOr[Int]
    var NumberOfBacktestWindows: js.UndefOr[Int]
  }

  object EvaluationParameters {
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

  /**
    * The results of evaluating an algorithm. Returned as part of the <a>GetAccuracyMetrics</a> response.
    */
  @js.native
  trait EvaluationResult extends js.Object {
    var AlgorithmArn: js.UndefOr[Arn]
    var TestWindows: js.UndefOr[TestWindows]
  }

  object EvaluationResult {
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

  object EvaluationTypeEnum {
    val SUMMARY  = "SUMMARY"
    val COMPUTED = "COMPUTED"

    val values = js.Object.freeze(js.Array(SUMMARY, COMPUTED))
  }

  /**
    * Provides featurization (transformation) information for a dataset field. This object is part of the <a>FeaturizationConfig</a> object.
    *  For example:
    *  <code>{</code>
    *  <code>"AttributeName": "demand",</code>
    *  <code>FeaturizationPipeline [ {</code>
    *  <code>"FeaturizationMethodName": "filling",</code>
    *  <code>"FeaturizationMethodParameters": {"aggregation": "avg", "backfill": "nan"}</code>
    *  <code>} ]</code>
    *  <code>}</code>
    */
  @js.native
  trait Featurization extends js.Object {
    var AttributeName: Name
    var FeaturizationPipeline: js.UndefOr[FeaturizationPipeline]
  }

  object Featurization {
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

  /**
    * In a <a>CreatePredictor</a> operation, the specified algorithm trains a model using the specified dataset group. You can optionally tell the operation to modify data fields prior to training a model. These modifications are referred to as <i>featurization</i>.
    *  You define featurization using the <code>FeaturizationConfig</code> object. You specify an array of transformations, one for each field that you want to featurize. You then include the <code>FeaturizationConfig</code> in your <code>CreatePredictor</code> request. Amazon Forecast applies the featurization to the <code>TARGET_TIME_SERIES</code> dataset before model training.
    *  You can create multiple featurization configurations. For example, you might call the <code>CreatePredictor</code> operation twice by specifying different featurization configurations.
    */
  @js.native
  trait FeaturizationConfig extends js.Object {
    var ForecastFrequency: Frequency
    var Featurizations: js.UndefOr[Featurizations]
    var ForecastDimensions: js.UndefOr[ForecastDimensions]
  }

  object FeaturizationConfig {
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

  /**
    * Provides information about a method that featurizes (transforms) a dataset field. The method is part of the <code>FeaturizationPipeline</code> of the <a>Featurization</a> object. If <code>FeaturizationMethodParameters</code> isn't specified, Amazon Forecast uses default parameters.
    *  For example:
    *  <code>{</code>
    *  <code>"FeaturizationMethodName": "filling",</code>
    *  <code>"FeaturizationMethodParameters": {"aggregation": "avg", "backfill": "nan"}</code>
    *  <code>}</code>
    */
  @js.native
  trait FeaturizationMethod extends js.Object {
    var FeaturizationMethodName: FeaturizationMethodName
    var FeaturizationMethodParameters: js.UndefOr[FeaturizationMethodParameters]
  }

  object FeaturizationMethod {
    def apply(
        FeaturizationMethodName: FeaturizationMethodName,
        FeaturizationMethodParameters: js.UndefOr[FeaturizationMethodParameters] = js.undefined
    ): FeaturizationMethod = {
      val __obj = js.Dynamic.literal(
        "FeaturizationMethodName" -> FeaturizationMethodName.asInstanceOf[js.Any]
      )

      FeaturizationMethodParameters.foreach(
        __v => __obj.updateDynamic("FeaturizationMethodParameters")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[FeaturizationMethod]
    }
  }

  object FeaturizationMethodNameEnum {
    val filling = "filling"

    val values = js.Object.freeze(js.Array(filling))
  }

  /**
    * Describes a filter for choosing a subset of objects. Each filter consists of a condition and a match statement. The condition is either <code>IS</code> or <code>IS_NOT</code>, which specifies whether to include or exclude, respectively, the objects that match the statement. The match statement consists of a key and a value.
    */
  @js.native
  trait Filter extends js.Object {
    var Condition: FilterConditionString
    var Key: String
    var Value: Arn
  }

  object Filter {
    def apply(
        Condition: FilterConditionString,
        Key: String,
        Value: Arn
    ): Filter = {
      val __obj = js.Dynamic.literal(
        "Condition" -> Condition.asInstanceOf[js.Any],
        "Key"       -> Key.asInstanceOf[js.Any],
        "Value"     -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Filter]
    }
  }

  object FilterConditionStringEnum {
    val IS     = "IS"
    val IS_NOT = "IS_NOT"

    val values = js.Object.freeze(js.Array(IS, IS_NOT))
  }

  /**
    * Provides a summary of the forecast export job properties used in the <a>ListForecastExportJobs</a> operation. To get the complete set of properties, call the <a>DescribeForecastExportJob</a> operation, and provide the listed <code>ForecastExportJobArn</code>.
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

  /**
    * Provides a summary of the forecast properties used in the <a>ListForecasts</a> operation. To get the complete set of properties, call the <a>DescribeForecast</a> operation, and provide the listed <code>ForecastArn</code>.
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
    def apply(
        PredictorEvaluationResults: js.UndefOr[PredictorEvaluationResults] = js.undefined
    ): GetAccuracyMetricsResponse = {
      val __obj = js.Dynamic.literal()
      PredictorEvaluationResults.foreach(
        __v => __obj.updateDynamic("PredictorEvaluationResults")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetAccuracyMetricsResponse]
    }
  }

  /**
    * Configuration information for a hyperparameter tuning job. This object is specified in the <a>CreatePredictor</a> request.
    *  A hyperparameter is a parameter that governs the model training process and is set before training starts. This is as opposed to a model parameter that is determined during training. The values of the hyperparameters have an effect on the chosen model parameters.
    *  A hyperparameter tuning job is the process of choosing the optimum set of hyperparameter values that optimize a specified metric. This is accomplished by running many training jobs over a range of hyperparameter values. The optimum set of values is dependent on the algorithm, the training data, and the given metric objective.
    */
  @js.native
  trait HyperParameterTuningJobConfig extends js.Object {
    var ParameterRanges: js.UndefOr[ParameterRanges]
  }

  object HyperParameterTuningJobConfig {
    def apply(
        ParameterRanges: js.UndefOr[ParameterRanges] = js.undefined
    ): HyperParameterTuningJobConfig = {
      val __obj = js.Dynamic.literal()
      ParameterRanges.foreach(__v => __obj.updateDynamic("ParameterRanges")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HyperParameterTuningJobConfig]
    }
  }

  /**
    * The data used to train a predictor. The data includes a dataset group and any supplementary features. This object is specified in the <a>CreatePredictor</a> request.
    */
  @js.native
  trait InputDataConfig extends js.Object {
    var DatasetGroupArn: Arn
    var SupplementaryFeatures: js.UndefOr[SupplementaryFeatures]
  }

  object InputDataConfig {
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

  /**
    * Specifies an integer hyperparameter and it's range of tunable values. This object is part of the <a>ParameterRanges</a> object.
    */
  @js.native
  trait IntegerParameterRange extends js.Object {
    var MaxValue: Int
    var MinValue: Int
    var Name: Name
    var ScalingType: js.UndefOr[ScalingType]
  }

  object IntegerParameterRange {
    def apply(
        MaxValue: Int,
        MinValue: Int,
        Name: Name,
        ScalingType: js.UndefOr[ScalingType] = js.undefined
    ): IntegerParameterRange = {
      val __obj = js.Dynamic.literal(
        "MaxValue" -> MaxValue.asInstanceOf[js.Any],
        "MinValue" -> MinValue.asInstanceOf[js.Any],
        "Name"     -> Name.asInstanceOf[js.Any]
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
  trait ListPredictorsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPredictorsRequest {
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

  /**
    * Provides metrics used to evaluate the performance of a predictor. This object is part of the <a>WindowSummary</a> object.
    */
  @js.native
  trait Metrics extends js.Object {
    var RMSE: js.UndefOr[Double]
    var WeightedQuantileLosses: js.UndefOr[WeightedQuantileLosses]
  }

  object Metrics {
    def apply(
        RMSE: js.UndefOr[Double] = js.undefined,
        WeightedQuantileLosses: js.UndefOr[WeightedQuantileLosses] = js.undefined
    ): Metrics = {
      val __obj = js.Dynamic.literal()
      RMSE.foreach(__v => __obj.updateDynamic("RMSE")(__v.asInstanceOf[js.Any]))
      WeightedQuantileLosses.foreach(__v => __obj.updateDynamic("WeightedQuantileLosses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Metrics]
    }
  }

  /**
    * Specifies the categorical, continuous, and integer hyperparameters, and their ranges of tunable values. The range of tunable values determines which values that a hyperparameter tuning job can choose for the specified hyperparameter. This object is part of the <a>HyperParameterTuningJobConfig</a> object.
    */
  @js.native
  trait ParameterRanges extends js.Object {
    var CategoricalParameterRanges: js.UndefOr[CategoricalParameterRanges]
    var ContinuousParameterRanges: js.UndefOr[ContinuousParameterRanges]
    var IntegerParameterRanges: js.UndefOr[IntegerParameterRanges]
  }

  object ParameterRanges {
    def apply(
        CategoricalParameterRanges: js.UndefOr[CategoricalParameterRanges] = js.undefined,
        ContinuousParameterRanges: js.UndefOr[ContinuousParameterRanges] = js.undefined,
        IntegerParameterRanges: js.UndefOr[IntegerParameterRanges] = js.undefined
    ): ParameterRanges = {
      val __obj = js.Dynamic.literal()
      CategoricalParameterRanges.foreach(
        __v => __obj.updateDynamic("CategoricalParameterRanges")(__v.asInstanceOf[js.Any])
      )
      ContinuousParameterRanges.foreach(
        __v => __obj.updateDynamic("ContinuousParameterRanges")(__v.asInstanceOf[js.Any])
      )
      IntegerParameterRanges.foreach(__v => __obj.updateDynamic("IntegerParameterRanges")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterRanges]
    }
  }

  /**
    * Provides a summary of the predictor properties used in the <a>ListPredictors</a> operation. To get the complete set of properties, call the <a>DescribePredictor</a> operation, and provide the listed <code>PredictorArn</code>.
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

  /**
    * The path to the file(s) in an Amazon Simple Storage Service (Amazon S3) bucket, and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the file(s). Optionally, includes an AWS Key Management Service (KMS) key. This object is submitted in the <a>CreateDatasetImportJob</a> and <a>CreateForecastExportJob</a> requests.
    */
  @js.native
  trait S3Config extends js.Object {
    var Path: S3Path
    var RoleArn: Arn
    var KMSKeyArn: js.UndefOr[KMSKeyArn]
  }

  object S3Config {
    def apply(
        Path: S3Path,
        RoleArn: Arn,
        KMSKeyArn: js.UndefOr[KMSKeyArn] = js.undefined
    ): S3Config = {
      val __obj = js.Dynamic.literal(
        "Path"    -> Path.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      KMSKeyArn.foreach(__v => __obj.updateDynamic("KMSKeyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Config]
    }
  }

  object ScalingTypeEnum {
    val Auto               = "Auto"
    val Linear             = "Linear"
    val Logarithmic        = "Logarithmic"
    val ReverseLogarithmic = "ReverseLogarithmic"

    val values = js.Object.freeze(js.Array(Auto, Linear, Logarithmic, ReverseLogarithmic))
  }

  /**
    * Defines the fields of a dataset. This object is specified in the <a>CreateDataset</a> request.
    */
  @js.native
  trait Schema extends js.Object {
    var Attributes: js.UndefOr[SchemaAttributes]
  }

  object Schema {
    def apply(
        Attributes: js.UndefOr[SchemaAttributes] = js.undefined
    ): Schema = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Schema]
    }
  }

  /**
    * An attribute of a schema, which defines a field of a dataset. A schema attribute is required for every field in a dataset. The <a>Schema</a> object contains an array of <code>SchemaAttribute</code> objects.
    */
  @js.native
  trait SchemaAttribute extends js.Object {
    var AttributeName: js.UndefOr[Name]
    var AttributeType: js.UndefOr[AttributeType]
  }

  object SchemaAttribute {
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

  /**
    * Provides statistics for each data field imported to an Amazon Forecast dataset with the <a>CreateDatasetImportJob</a> operation.
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

  /**
    * Describes a supplementary feature of a dataset group. This object is part of the <a>InputDataConfig</a> object.
    *  For this release, the only supported feature is a holiday calendar. If the calendar is used, all data should belong to the same country as the calendar. For the calendar data, see [[http://jollyday.sourceforge.net/data.html|http://jollyday.sourceforge.net/data.html]].
    */
  @js.native
  trait SupplementaryFeature extends js.Object {
    var Name: Name
    var Value: Value
  }

  object SupplementaryFeature {
    def apply(
        Name: Name,
        Value: Value
    ): SupplementaryFeature = {
      val __obj = js.Dynamic.literal(
        "Name"  -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SupplementaryFeature]
    }
  }

  @js.native
  trait UpdateDatasetGroupRequest extends js.Object {
    var DatasetArns: ArnList
    var DatasetGroupArn: Arn
  }

  object UpdateDatasetGroupRequest {
    def apply(
        DatasetArns: ArnList,
        DatasetGroupArn: Arn
    ): UpdateDatasetGroupRequest = {
      val __obj = js.Dynamic.literal(
        "DatasetArns"     -> DatasetArns.asInstanceOf[js.Any],
        "DatasetGroupArn" -> DatasetGroupArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateDatasetGroupRequest]
    }
  }

  @js.native
  trait UpdateDatasetGroupResponse extends js.Object {}

  object UpdateDatasetGroupResponse {
    def apply(
        ): UpdateDatasetGroupResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateDatasetGroupResponse]
    }
  }

  /**
    * The weighted loss value for a quantile. This object is part of the <a>Metrics</a> object.
    */
  @js.native
  trait WeightedQuantileLoss extends js.Object {
    var LossValue: js.UndefOr[Double]
    var Quantile: js.UndefOr[Double]
  }

  object WeightedQuantileLoss {
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

  /**
    * The metrics for a time range within the evaluation portion of a dataset. This object is part of the <a>EvaluationResult</a> object.
    *  The <code>TestWindowStart</code> and <code>TestWindowEnd</code> parameters are determined by the <code>BackTestWindowOffset</code> parameter of the <a>EvaluationParameters</a> object.
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
