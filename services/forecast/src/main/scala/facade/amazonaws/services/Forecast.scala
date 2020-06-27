package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object forecast {
  type Arn                           = String
  type ArnList                       = js.Array[Arn]
  type CategoricalParameterRanges    = js.Array[CategoricalParameterRange]
  type ContinuousParameterRanges     = js.Array[ContinuousParameterRange]
  type DatasetGroups                 = js.Array[DatasetGroupSummary]
  type DatasetImportJobs             = js.Array[DatasetImportJobSummary]
  type Datasets                      = js.Array[DatasetSummary]
  type ErrorMessage                  = String
  type FeaturizationMethodParameters = js.Dictionary[ParameterValue]
  type FeaturizationPipeline         = js.Array[FeaturizationMethod]
  type Featurizations                = js.Array[Featurization]
  type FieldStatistics               = js.Dictionary[Statistics]
  type Filters                       = js.Array[Filter]
  type ForecastDimensions            = js.Array[Name]
  type ForecastExportJobs            = js.Array[ForecastExportJobSummary]
  type ForecastType                  = String
  type ForecastTypes                 = js.Array[ForecastType]
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
  type PredictorExecutions           = js.Array[PredictorExecution]
  type Predictors                    = js.Array[PredictorSummary]
  type S3Path                        = String
  type SchemaAttributes              = js.Array[SchemaAttribute]
  type Status                        = String
  type SupplementaryFeatures         = js.Array[SupplementaryFeature]
  type TestWindowDetails             = js.Array[TestWindowSummary]
  type TestWindows                   = js.Array[WindowSummary]
  type Timestamp                     = js.Date
  type TimestampFormat               = String
  type TrainingParameters            = js.Dictionary[ParameterValue]
  type Value                         = String
  type Values                        = js.Array[Value]
  type WeightedQuantileLosses        = js.Array[WeightedQuantileLoss]

  implicit final class ForecastOps(private val service: Forecast) extends AnyVal {

    @inline def createDatasetFuture(params: CreateDatasetRequest): Future[CreateDatasetResponse] =
      service.createDataset(params).promise().toFuture
    @inline def createDatasetGroupFuture(params: CreateDatasetGroupRequest): Future[CreateDatasetGroupResponse] =
      service.createDatasetGroup(params).promise().toFuture
    @inline def createDatasetImportJobFuture(
        params: CreateDatasetImportJobRequest
    ): Future[CreateDatasetImportJobResponse] = service.createDatasetImportJob(params).promise().toFuture
    @inline def createForecastExportJobFuture(
        params: CreateForecastExportJobRequest
    ): Future[CreateForecastExportJobResponse] = service.createForecastExportJob(params).promise().toFuture
    @inline def createForecastFuture(params: CreateForecastRequest): Future[CreateForecastResponse] =
      service.createForecast(params).promise().toFuture
    @inline def createPredictorFuture(params: CreatePredictorRequest): Future[CreatePredictorResponse] =
      service.createPredictor(params).promise().toFuture
    @inline def deleteDatasetFuture(params: DeleteDatasetRequest): Future[js.Object] =
      service.deleteDataset(params).promise().toFuture
    @inline def deleteDatasetGroupFuture(params: DeleteDatasetGroupRequest): Future[js.Object] =
      service.deleteDatasetGroup(params).promise().toFuture
    @inline def deleteDatasetImportJobFuture(params: DeleteDatasetImportJobRequest): Future[js.Object] =
      service.deleteDatasetImportJob(params).promise().toFuture
    @inline def deleteForecastExportJobFuture(params: DeleteForecastExportJobRequest): Future[js.Object] =
      service.deleteForecastExportJob(params).promise().toFuture
    @inline def deleteForecastFuture(params: DeleteForecastRequest): Future[js.Object] =
      service.deleteForecast(params).promise().toFuture
    @inline def deletePredictorFuture(params: DeletePredictorRequest): Future[js.Object] =
      service.deletePredictor(params).promise().toFuture
    @inline def describeDatasetFuture(params: DescribeDatasetRequest): Future[DescribeDatasetResponse] =
      service.describeDataset(params).promise().toFuture
    @inline def describeDatasetGroupFuture(params: DescribeDatasetGroupRequest): Future[DescribeDatasetGroupResponse] =
      service.describeDatasetGroup(params).promise().toFuture
    @inline def describeDatasetImportJobFuture(
        params: DescribeDatasetImportJobRequest
    ): Future[DescribeDatasetImportJobResponse] = service.describeDatasetImportJob(params).promise().toFuture
    @inline def describeForecastExportJobFuture(
        params: DescribeForecastExportJobRequest
    ): Future[DescribeForecastExportJobResponse] = service.describeForecastExportJob(params).promise().toFuture
    @inline def describeForecastFuture(params: DescribeForecastRequest): Future[DescribeForecastResponse] =
      service.describeForecast(params).promise().toFuture
    @inline def describePredictorFuture(params: DescribePredictorRequest): Future[DescribePredictorResponse] =
      service.describePredictor(params).promise().toFuture
    @inline def getAccuracyMetricsFuture(params: GetAccuracyMetricsRequest): Future[GetAccuracyMetricsResponse] =
      service.getAccuracyMetrics(params).promise().toFuture
    @inline def listDatasetGroupsFuture(params: ListDatasetGroupsRequest): Future[ListDatasetGroupsResponse] =
      service.listDatasetGroups(params).promise().toFuture
    @inline def listDatasetImportJobsFuture(
        params: ListDatasetImportJobsRequest
    ): Future[ListDatasetImportJobsResponse] = service.listDatasetImportJobs(params).promise().toFuture
    @inline def listDatasetsFuture(params: ListDatasetsRequest): Future[ListDatasetsResponse] =
      service.listDatasets(params).promise().toFuture
    @inline def listForecastExportJobsFuture(
        params: ListForecastExportJobsRequest
    ): Future[ListForecastExportJobsResponse] = service.listForecastExportJobs(params).promise().toFuture
    @inline def listForecastsFuture(params: ListForecastsRequest): Future[ListForecastsResponse] =
      service.listForecasts(params).promise().toFuture
    @inline def listPredictorsFuture(params: ListPredictorsRequest): Future[ListPredictorsResponse] =
      service.listPredictors(params).promise().toFuture
    @inline def updateDatasetGroupFuture(params: UpdateDatasetGroupRequest): Future[UpdateDatasetGroupResponse] =
      service.updateDatasetGroup(params).promise().toFuture
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

  @js.native
  sealed trait AttributeType extends js.Any
  object AttributeType extends js.Object {
    val string    = "string".asInstanceOf[AttributeType]
    val integer   = "integer".asInstanceOf[AttributeType]
    val float     = "float".asInstanceOf[AttributeType]
    val timestamp = "timestamp".asInstanceOf[AttributeType]

    val values = js.Object.freeze(js.Array(string, integer, float, timestamp))
  }

  /**
    * Specifies a categorical hyperparameter and it's range of tunable values. This object is part of the <a>ParameterRanges</a> object.
    */
  @js.native
  @Factory
  trait CategoricalParameterRange extends js.Object {
    var Name: Name
    var Values: Values
  }

  /**
    * Specifies a continuous hyperparameter and it's range of tunable values. This object is part of the <a>ParameterRanges</a> object.
    */
  @js.native
  @Factory
  trait ContinuousParameterRange extends js.Object {
    var MaxValue: Double
    var MinValue: Double
    var Name: Name
    var ScalingType: js.UndefOr[ScalingType]
  }

  @js.native
  @Factory
  trait CreateDatasetGroupRequest extends js.Object {
    var DatasetGroupName: Name
    var Domain: Domain
    var DatasetArns: js.UndefOr[ArnList]
  }

  @js.native
  @Factory
  trait CreateDatasetGroupResponse extends js.Object {
    var DatasetGroupArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateDatasetImportJobRequest extends js.Object {
    var DataSource: DataSource
    var DatasetArn: Arn
    var DatasetImportJobName: Name
    var TimestampFormat: js.UndefOr[TimestampFormat]
  }

  @js.native
  @Factory
  trait CreateDatasetImportJobResponse extends js.Object {
    var DatasetImportJobArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateDatasetRequest extends js.Object {
    var DatasetName: Name
    var DatasetType: DatasetType
    var Domain: Domain
    var Schema: Schema
    var DataFrequency: js.UndefOr[Frequency]
    var EncryptionConfig: js.UndefOr[EncryptionConfig]
  }

  @js.native
  @Factory
  trait CreateDatasetResponse extends js.Object {
    var DatasetArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateForecastExportJobRequest extends js.Object {
    var Destination: DataDestination
    var ForecastArn: Arn
    var ForecastExportJobName: Name
  }

  @js.native
  @Factory
  trait CreateForecastExportJobResponse extends js.Object {
    var ForecastExportJobArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateForecastRequest extends js.Object {
    var ForecastName: Name
    var PredictorArn: Arn
    var ForecastTypes: js.UndefOr[ForecastTypes]
  }

  @js.native
  @Factory
  trait CreateForecastResponse extends js.Object {
    var ForecastArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreatePredictorResponse extends js.Object {
    var PredictorArn: js.UndefOr[Arn]
  }

  /**
    * The destination for an exported forecast, an AWS Identity and Access Management (IAM) role that allows Amazon Forecast to access the location and, optionally, an AWS Key Management Service (KMS) key. This object is submitted in the <a>CreateForecastExportJob</a> request.
    */
  @js.native
  @Factory
  trait DataDestination extends js.Object {
    var S3Config: S3Config
  }

  /**
    * The source of your training data, an AWS Identity and Access Management (IAM) role that allows Amazon Forecast to access the data and, optionally, an AWS Key Management Service (KMS) key. This object is submitted in the <a>CreateDatasetImportJob</a> request.
    */
  @js.native
  @Factory
  trait DataSource extends js.Object {
    var S3Config: S3Config
  }

  /**
    * Provides a summary of the dataset group properties used in the <a>ListDatasetGroups</a> operation. To get the complete set of properties, call the <a>DescribeDatasetGroup</a> operation, and provide the <code>DatasetGroupArn</code>.
    */
  @js.native
  @Factory
  trait DatasetGroupSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DatasetGroupArn: js.UndefOr[Arn]
    var DatasetGroupName: js.UndefOr[Name]
    var LastModificationTime: js.UndefOr[Timestamp]
  }

  /**
    * Provides a summary of the dataset import job properties used in the <a>ListDatasetImportJobs</a> operation. To get the complete set of properties, call the <a>DescribeDatasetImportJob</a> operation, and provide the <code>DatasetImportJobArn</code>.
    */
  @js.native
  @Factory
  trait DatasetImportJobSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DataSource: js.UndefOr[DataSource]
    var DatasetImportJobArn: js.UndefOr[Arn]
    var DatasetImportJobName: js.UndefOr[Name]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[ErrorMessage]
    var Status: js.UndefOr[Status]
  }

  /**
    * Provides a summary of the dataset properties used in the <a>ListDatasets</a> operation. To get the complete set of properties, call the <a>DescribeDataset</a> operation, and provide the <code>DatasetArn</code>.
    */
  @js.native
  @Factory
  trait DatasetSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DatasetArn: js.UndefOr[Arn]
    var DatasetName: js.UndefOr[Name]
    var DatasetType: js.UndefOr[DatasetType]
    var Domain: js.UndefOr[Domain]
    var LastModificationTime: js.UndefOr[Timestamp]
  }

  @js.native
  sealed trait DatasetType extends js.Any
  object DatasetType extends js.Object {
    val TARGET_TIME_SERIES  = "TARGET_TIME_SERIES".asInstanceOf[DatasetType]
    val RELATED_TIME_SERIES = "RELATED_TIME_SERIES".asInstanceOf[DatasetType]
    val ITEM_METADATA       = "ITEM_METADATA".asInstanceOf[DatasetType]

    val values = js.Object.freeze(js.Array(TARGET_TIME_SERIES, RELATED_TIME_SERIES, ITEM_METADATA))
  }

  @js.native
  @Factory
  trait DeleteDatasetGroupRequest extends js.Object {
    var DatasetGroupArn: Arn
  }

  @js.native
  @Factory
  trait DeleteDatasetImportJobRequest extends js.Object {
    var DatasetImportJobArn: Arn
  }

  @js.native
  @Factory
  trait DeleteDatasetRequest extends js.Object {
    var DatasetArn: Arn
  }

  @js.native
  @Factory
  trait DeleteForecastExportJobRequest extends js.Object {
    var ForecastExportJobArn: Arn
  }

  @js.native
  @Factory
  trait DeleteForecastRequest extends js.Object {
    var ForecastArn: Arn
  }

  @js.native
  @Factory
  trait DeletePredictorRequest extends js.Object {
    var PredictorArn: Arn
  }

  @js.native
  @Factory
  trait DescribeDatasetGroupRequest extends js.Object {
    var DatasetGroupArn: Arn
  }

  @js.native
  @Factory
  trait DescribeDatasetGroupResponse extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DatasetArns: js.UndefOr[ArnList]
    var DatasetGroupArn: js.UndefOr[Arn]
    var DatasetGroupName: js.UndefOr[Name]
    var Domain: js.UndefOr[Domain]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Status: js.UndefOr[Status]
  }

  @js.native
  @Factory
  trait DescribeDatasetImportJobRequest extends js.Object {
    var DatasetImportJobArn: Arn
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeDatasetRequest extends js.Object {
    var DatasetArn: Arn
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeForecastExportJobRequest extends js.Object {
    var ForecastExportJobArn: Arn
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeForecastRequest extends js.Object {
    var ForecastArn: Arn
  }

  @js.native
  @Factory
  trait DescribeForecastResponse extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DatasetGroupArn: js.UndefOr[Arn]
    var ForecastArn: js.UndefOr[Arn]
    var ForecastName: js.UndefOr[Name]
    var ForecastTypes: js.UndefOr[ForecastTypes]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[ErrorMessage]
    var PredictorArn: js.UndefOr[Arn]
    var Status: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribePredictorRequest extends js.Object {
    var PredictorArn: Arn
  }

  @js.native
  @Factory
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
    var PredictorExecutionDetails: js.UndefOr[PredictorExecutionDetails]
    var PredictorName: js.UndefOr[Name]
    var Status: js.UndefOr[Status]
    var TrainingParameters: js.UndefOr[TrainingParameters]
  }

  @js.native
  sealed trait Domain extends js.Any
  object Domain extends js.Object {
    val RETAIL             = "RETAIL".asInstanceOf[Domain]
    val CUSTOM             = "CUSTOM".asInstanceOf[Domain]
    val INVENTORY_PLANNING = "INVENTORY_PLANNING".asInstanceOf[Domain]
    val EC2_CAPACITY       = "EC2_CAPACITY".asInstanceOf[Domain]
    val WORK_FORCE         = "WORK_FORCE".asInstanceOf[Domain]
    val WEB_TRAFFIC        = "WEB_TRAFFIC".asInstanceOf[Domain]
    val METRICS            = "METRICS".asInstanceOf[Domain]

    val values =
      js.Object.freeze(js.Array(RETAIL, CUSTOM, INVENTORY_PLANNING, EC2_CAPACITY, WORK_FORCE, WEB_TRAFFIC, METRICS))
  }

  /**
    * An AWS Key Management Service (KMS) key and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the key. You can specify this optional object in the <a>CreateDataset</a> and <a>CreatePredictor</a> requests.
    */
  @js.native
  @Factory
  trait EncryptionConfig extends js.Object {
    var KMSKeyArn: KMSKeyArn
    var RoleArn: Arn
  }

  /**
    * Parameters that define how to split a dataset into training data and testing data, and the number of iterations to perform. These parameters are specified in the predefined algorithms but you can override them in the <a>CreatePredictor</a> request.
    */
  @js.native
  @Factory
  trait EvaluationParameters extends js.Object {
    var BackTestWindowOffset: js.UndefOr[Int]
    var NumberOfBacktestWindows: js.UndefOr[Int]
  }

  /**
    * The results of evaluating an algorithm. Returned as part of the <a>GetAccuracyMetrics</a> response.
    */
  @js.native
  @Factory
  trait EvaluationResult extends js.Object {
    var AlgorithmArn: js.UndefOr[Arn]
    var TestWindows: js.UndefOr[TestWindows]
  }

  @js.native
  sealed trait EvaluationType extends js.Any
  object EvaluationType extends js.Object {
    val SUMMARY  = "SUMMARY".asInstanceOf[EvaluationType]
    val COMPUTED = "COMPUTED".asInstanceOf[EvaluationType]

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
  @Factory
  trait Featurization extends js.Object {
    var AttributeName: Name
    var FeaturizationPipeline: js.UndefOr[FeaturizationPipeline]
  }

  /**
    * In a <a>CreatePredictor</a> operation, the specified algorithm trains a model using the specified dataset group. You can optionally tell the operation to modify data fields prior to training a model. These modifications are referred to as <i>featurization</i>.
    *  You define featurization using the <code>FeaturizationConfig</code> object. You specify an array of transformations, one for each field that you want to featurize. You then include the <code>FeaturizationConfig</code> object in your <code>CreatePredictor</code> request. Amazon Forecast applies the featurization to the <code>TARGET_TIME_SERIES</code> dataset before model training.
    *  You can create multiple featurization configurations. For example, you might call the <code>CreatePredictor</code> operation twice by specifying different featurization configurations.
    */
  @js.native
  @Factory
  trait FeaturizationConfig extends js.Object {
    var ForecastFrequency: Frequency
    var Featurizations: js.UndefOr[Featurizations]
    var ForecastDimensions: js.UndefOr[ForecastDimensions]
  }

  /**
    * Provides information about the method that featurizes (transforms) a dataset field. The method is part of the <code>FeaturizationPipeline</code> of the <a>Featurization</a> object. If you don't specify <code>FeaturizationMethodParameters</code>, Amazon Forecast uses default parameters.
    *  The following is an example of how you specify a <code>FeaturizationMethod</code> object.
    *  <code>{</code>
    *  <code>"FeaturizationMethodName": "filling",</code>
    *  <code>"FeaturizationMethodParameters": {"aggregation": "avg", "backfill": "nan"}</code>
    *  <code>}</code>
    */
  @js.native
  @Factory
  trait FeaturizationMethod extends js.Object {
    var FeaturizationMethodName: FeaturizationMethodName
    var FeaturizationMethodParameters: js.UndefOr[FeaturizationMethodParameters]
  }

  @js.native
  sealed trait FeaturizationMethodName extends js.Any
  object FeaturizationMethodName extends js.Object {
    val filling = "filling".asInstanceOf[FeaturizationMethodName]

    val values = js.Object.freeze(js.Array(filling))
  }

  /**
    * Describes a filter for choosing a subset of objects. Each filter consists of a condition and a match statement. The condition is either <code>IS</code> or <code>IS_NOT</code>, which specifies whether to include or exclude the objects that match the statement, respectively. The match statement consists of a key and a value.
    */
  @js.native
  @Factory
  trait Filter extends js.Object {
    var Condition: FilterConditionString
    var Key: String
    var Value: Arn
  }

  @js.native
  sealed trait FilterConditionString extends js.Any
  object FilterConditionString extends js.Object {
    val IS     = "IS".asInstanceOf[FilterConditionString]
    val IS_NOT = "IS_NOT".asInstanceOf[FilterConditionString]

    val values = js.Object.freeze(js.Array(IS, IS_NOT))
  }

  /**
    * Provides a summary of the forecast export job properties used in the <a>ListForecastExportJobs</a> operation. To get the complete set of properties, call the <a>DescribeForecastExportJob</a> operation, and provide the listed <code>ForecastExportJobArn</code>.
    */
  @js.native
  @Factory
  trait ForecastExportJobSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var Destination: js.UndefOr[DataDestination]
    var ForecastExportJobArn: js.UndefOr[Arn]
    var ForecastExportJobName: js.UndefOr[Name]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[ErrorMessage]
    var Status: js.UndefOr[Status]
  }

  /**
    * Provides a summary of the forecast properties used in the <a>ListForecasts</a> operation. To get the complete set of properties, call the <a>DescribeForecast</a> operation, and provide the <code>ForecastArn</code> that is listed in the summary.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetAccuracyMetricsRequest extends js.Object {
    var PredictorArn: Arn
  }

  @js.native
  @Factory
  trait GetAccuracyMetricsResponse extends js.Object {
    var PredictorEvaluationResults: js.UndefOr[PredictorEvaluationResults]
  }

  /**
    * Configuration information for a hyperparameter tuning job. You specify this object in the <a>CreatePredictor</a> request.
    *  A <i>hyperparameter</i> is a parameter that governs the model training process. You set hyperparameters before training starts, unlike model parameters, which are determined during training. The values of the hyperparameters effect which values are chosen for the model parameters.
    *  In a <i>hyperparameter tuning job</i>, Amazon Forecast chooses the set of hyperparameter values that optimize a specified metric. Forecast accomplishes this by running many training jobs over a range of hyperparameter values. The optimum set of values depends on the algorithm, the training data, and the specified metric objective.
    */
  @js.native
  @Factory
  trait HyperParameterTuningJobConfig extends js.Object {
    var ParameterRanges: js.UndefOr[ParameterRanges]
  }

  /**
    * The data used to train a predictor. The data includes a dataset group and any supplementary features. You specify this object in the <a>CreatePredictor</a> request.
    */
  @js.native
  @Factory
  trait InputDataConfig extends js.Object {
    var DatasetGroupArn: Arn
    var SupplementaryFeatures: js.UndefOr[SupplementaryFeatures]
  }

  /**
    * Specifies an integer hyperparameter and it's range of tunable values. This object is part of the <a>ParameterRanges</a> object.
    */
  @js.native
  @Factory
  trait IntegerParameterRange extends js.Object {
    var MaxValue: Int
    var MinValue: Int
    var Name: Name
    var ScalingType: js.UndefOr[ScalingType]
  }

  @js.native
  @Factory
  trait ListDatasetGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDatasetGroupsResponse extends js.Object {
    var DatasetGroups: js.UndefOr[DatasetGroups]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDatasetImportJobsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDatasetImportJobsResponse extends js.Object {
    var DatasetImportJobs: js.UndefOr[DatasetImportJobs]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDatasetsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDatasetsResponse extends js.Object {
    var Datasets: js.UndefOr[Datasets]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListForecastExportJobsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListForecastExportJobsResponse extends js.Object {
    var ForecastExportJobs: js.UndefOr[ForecastExportJobs]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListForecastsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListForecastsResponse extends js.Object {
    var Forecasts: js.UndefOr[Forecasts]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListPredictorsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListPredictorsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Predictors: js.UndefOr[Predictors]
  }

  /**
    * Provides metrics that are used to evaluate the performance of a predictor. This object is part of the <a>WindowSummary</a> object.
    */
  @js.native
  @Factory
  trait Metrics extends js.Object {
    var RMSE: js.UndefOr[Double]
    var WeightedQuantileLosses: js.UndefOr[WeightedQuantileLosses]
  }

  /**
    * Specifies the categorical, continuous, and integer hyperparameters, and their ranges of tunable values. The range of tunable values determines which values that a hyperparameter tuning job can choose for the specified hyperparameter. This object is part of the <a>HyperParameterTuningJobConfig</a> object.
    */
  @js.native
  @Factory
  trait ParameterRanges extends js.Object {
    var CategoricalParameterRanges: js.UndefOr[CategoricalParameterRanges]
    var ContinuousParameterRanges: js.UndefOr[ContinuousParameterRanges]
    var IntegerParameterRanges: js.UndefOr[IntegerParameterRanges]
  }

  /**
    * The algorithm used to perform a backtest and the status of those tests.
    */
  @js.native
  @Factory
  trait PredictorExecution extends js.Object {
    var AlgorithmArn: js.UndefOr[Arn]
    var TestWindows: js.UndefOr[TestWindowDetails]
  }

  /**
    * Contains details on the backtests performed to evaluate the accuracy of the predictor. The tests are returned in descending order of accuracy, with the most accurate backtest appearing first. You specify the number of backtests to perform when you call the operation.
    */
  @js.native
  @Factory
  trait PredictorExecutionDetails extends js.Object {
    var PredictorExecutions: js.UndefOr[PredictorExecutions]
  }

  /**
    * Provides a summary of the predictor properties that are used in the <a>ListPredictors</a> operation. To get the complete set of properties, call the <a>DescribePredictor</a> operation, and provide the listed <code>PredictorArn</code>.
    */
  @js.native
  @Factory
  trait PredictorSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DatasetGroupArn: js.UndefOr[Arn]
    var LastModificationTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[ErrorMessage]
    var PredictorArn: js.UndefOr[Arn]
    var PredictorName: js.UndefOr[Name]
    var Status: js.UndefOr[Status]
  }

  /**
    * The path to the file(s) in an Amazon Simple Storage Service (Amazon S3) bucket, and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the file(s). Optionally, includes an AWS Key Management Service (KMS) key. This object is part of the <a>DataSource</a> object that is submitted in the <a>CreateDatasetImportJob</a> request, and part of the <a>DataDestination</a> object that is submitted in the <a>CreateForecastExportJob</a> request.
    */
  @js.native
  @Factory
  trait S3Config extends js.Object {
    var Path: S3Path
    var RoleArn: Arn
    var KMSKeyArn: js.UndefOr[KMSKeyArn]
  }

  @js.native
  sealed trait ScalingType extends js.Any
  object ScalingType extends js.Object {
    val Auto               = "Auto".asInstanceOf[ScalingType]
    val Linear             = "Linear".asInstanceOf[ScalingType]
    val Logarithmic        = "Logarithmic".asInstanceOf[ScalingType]
    val ReverseLogarithmic = "ReverseLogarithmic".asInstanceOf[ScalingType]

    val values = js.Object.freeze(js.Array(Auto, Linear, Logarithmic, ReverseLogarithmic))
  }

  /**
    * Defines the fields of a dataset. You specify this object in the <a>CreateDataset</a> request.
    */
  @js.native
  @Factory
  trait Schema extends js.Object {
    var Attributes: js.UndefOr[SchemaAttributes]
  }

  /**
    * An attribute of a schema, which defines a dataset field. A schema attribute is required for every field in a dataset. The <a>Schema</a> object contains an array of <code>SchemaAttribute</code> objects.
    */
  @js.native
  @Factory
  trait SchemaAttribute extends js.Object {
    var AttributeName: js.UndefOr[Name]
    var AttributeType: js.UndefOr[AttributeType]
  }

  /**
    * Provides statistics for each data field imported into to an Amazon Forecast dataset with the <a>CreateDatasetImportJob</a> operation.
    */
  @js.native
  @Factory
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

  /**
    * Describes a supplementary feature of a dataset group. This object is part of the <a>InputDataConfig</a> object.
    *  The only supported feature is a holiday calendar. If you use the calendar, all data in the datasets should belong to the same country as the calendar. For the holiday calendar data, see the [[http://jollyday.sourceforge.net/data.html|Jollyday]] web site.
    */
  @js.native
  @Factory
  trait SupplementaryFeature extends js.Object {
    var Name: Name
    var Value: Value
  }

  /**
    * The status, start time, and end time of a backtest, as well as a failure reason if applicable.
    */
  @js.native
  @Factory
  trait TestWindowSummary extends js.Object {
    var Message: js.UndefOr[ErrorMessage]
    var Status: js.UndefOr[Status]
    var TestWindowEnd: js.UndefOr[Timestamp]
    var TestWindowStart: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait UpdateDatasetGroupRequest extends js.Object {
    var DatasetArns: ArnList
    var DatasetGroupArn: Arn
  }

  @js.native
  @Factory
  trait UpdateDatasetGroupResponse extends js.Object {}

  /**
    * The weighted loss value for a quantile. This object is part of the <a>Metrics</a> object.
    */
  @js.native
  @Factory
  trait WeightedQuantileLoss extends js.Object {
    var LossValue: js.UndefOr[Double]
    var Quantile: js.UndefOr[Double]
  }

  /**
    * The metrics for a time range within the evaluation portion of a dataset. This object is part of the <a>EvaluationResult</a> object.
    *  The <code>TestWindowStart</code> and <code>TestWindowEnd</code> parameters are determined by the <code>BackTestWindowOffset</code> parameter of the <a>EvaluationParameters</a> object.
    */
  @js.native
  @Factory
  trait WindowSummary extends js.Object {
    var EvaluationType: js.UndefOr[EvaluationType]
    var ItemCount: js.UndefOr[Int]
    var Metrics: js.UndefOr[Metrics]
    var TestWindowEnd: js.UndefOr[Timestamp]
    var TestWindowStart: js.UndefOr[Timestamp]
  }
}
