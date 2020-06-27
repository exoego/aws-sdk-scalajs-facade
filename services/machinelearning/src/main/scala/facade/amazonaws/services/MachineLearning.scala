package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object machinelearning {
  type AwsUserArn                      = String
  type BatchPredictions                = js.Array[BatchPrediction]
  type ComparatorValue                 = String
  type ComputeStatistics               = Boolean
  type DataRearrangement               = String
  type DataSchema                      = String
  type DataSources                     = js.Array[DataSource]
  type DetailsMap                      = js.Dictionary[DetailsValue]
  type DetailsValue                    = String
  type EDPPipelineId                   = String
  type EDPResourceRole                 = String
  type EDPSecurityGroupId              = String
  type EDPSecurityGroupIds             = js.Array[EDPSecurityGroupId]
  type EDPServiceRole                  = String
  type EDPSubnetId                     = String
  type EntityId                        = String
  type EntityName                      = String
  type EpochTime                       = js.Date
  type ErrorCode                       = Int
  type ErrorMessage                    = String
  type Evaluations                     = js.Array[Evaluation]
  type IntegerType                     = Int
  type Label                           = String
  type LongType                        = Double
  type MLModelName                     = String
  type MLModels                        = js.Array[MLModel]
  type Message                         = String
  type PageLimit                       = Int
  type PerformanceMetricsProperties    = js.Dictionary[PerformanceMetricsPropertyValue]
  type PerformanceMetricsPropertyKey   = String
  type PerformanceMetricsPropertyValue = String
  type PresignedS3Url                  = String
  type RDSDatabaseName                 = String
  type RDSDatabasePassword             = String
  type RDSDatabaseUsername             = String
  type RDSInstanceIdentifier           = String
  type RDSSelectSqlQuery               = String
  type Recipe                          = String
  type Record                          = js.Dictionary[VariableValue]
  type RedshiftClusterIdentifier       = String
  type RedshiftDatabaseName            = String
  type RedshiftDatabasePassword        = String
  type RedshiftDatabaseUsername        = String
  type RedshiftSelectSqlQuery          = String
  type RoleARN                         = String
  type S3Url                           = String
  type ScoreThreshold                  = Float
  type ScoreValue                      = Float
  type ScoreValuePerLabelMap           = js.Dictionary[ScoreValue]
  type StringType                      = String
  type TagKey                          = String
  type TagKeyList                      = js.Array[TagKey]
  type TagList                         = js.Array[Tag]
  type TagValue                        = String
  type TrainingParameters              = js.Dictionary[StringType]
  type VariableName                    = String
  type VariableValue                   = String
  type Verbose                         = Boolean
  type VipURL                          = String
  type floatLabel                      = Float

  implicit final class MachineLearningOps(private val service: MachineLearning) extends AnyVal {

    @inline def addTagsFuture(params: AddTagsInput): Future[AddTagsOutput] = service.addTags(params).promise().toFuture
    @inline def createBatchPredictionFuture(params: CreateBatchPredictionInput): Future[CreateBatchPredictionOutput] =
      service.createBatchPrediction(params).promise().toFuture
    @inline def createDataSourceFromRDSFuture(
        params: CreateDataSourceFromRDSInput
    ): Future[CreateDataSourceFromRDSOutput] = service.createDataSourceFromRDS(params).promise().toFuture
    @inline def createDataSourceFromRedshiftFuture(
        params: CreateDataSourceFromRedshiftInput
    ): Future[CreateDataSourceFromRedshiftOutput] = service.createDataSourceFromRedshift(params).promise().toFuture
    @inline def createDataSourceFromS3Future(
        params: CreateDataSourceFromS3Input
    ): Future[CreateDataSourceFromS3Output] = service.createDataSourceFromS3(params).promise().toFuture
    @inline def createEvaluationFuture(params: CreateEvaluationInput): Future[CreateEvaluationOutput] =
      service.createEvaluation(params).promise().toFuture
    @inline def createMLModelFuture(params: CreateMLModelInput): Future[CreateMLModelOutput] =
      service.createMLModel(params).promise().toFuture
    @inline def createRealtimeEndpointFuture(
        params: CreateRealtimeEndpointInput
    ): Future[CreateRealtimeEndpointOutput] = service.createRealtimeEndpoint(params).promise().toFuture
    @inline def deleteBatchPredictionFuture(params: DeleteBatchPredictionInput): Future[DeleteBatchPredictionOutput] =
      service.deleteBatchPrediction(params).promise().toFuture
    @inline def deleteDataSourceFuture(params: DeleteDataSourceInput): Future[DeleteDataSourceOutput] =
      service.deleteDataSource(params).promise().toFuture
    @inline def deleteEvaluationFuture(params: DeleteEvaluationInput): Future[DeleteEvaluationOutput] =
      service.deleteEvaluation(params).promise().toFuture
    @inline def deleteMLModelFuture(params: DeleteMLModelInput): Future[DeleteMLModelOutput] =
      service.deleteMLModel(params).promise().toFuture
    @inline def deleteRealtimeEndpointFuture(
        params: DeleteRealtimeEndpointInput
    ): Future[DeleteRealtimeEndpointOutput] = service.deleteRealtimeEndpoint(params).promise().toFuture
    @inline def deleteTagsFuture(params: DeleteTagsInput): Future[DeleteTagsOutput] =
      service.deleteTags(params).promise().toFuture
    @inline def describeBatchPredictionsFuture(
        params: DescribeBatchPredictionsInput
    ): Future[DescribeBatchPredictionsOutput] = service.describeBatchPredictions(params).promise().toFuture
    @inline def describeDataSourcesFuture(params: DescribeDataSourcesInput): Future[DescribeDataSourcesOutput] =
      service.describeDataSources(params).promise().toFuture
    @inline def describeEvaluationsFuture(params: DescribeEvaluationsInput): Future[DescribeEvaluationsOutput] =
      service.describeEvaluations(params).promise().toFuture
    @inline def describeMLModelsFuture(params: DescribeMLModelsInput): Future[DescribeMLModelsOutput] =
      service.describeMLModels(params).promise().toFuture
    @inline def describeTagsFuture(params: DescribeTagsInput): Future[DescribeTagsOutput] =
      service.describeTags(params).promise().toFuture
    @inline def getBatchPredictionFuture(params: GetBatchPredictionInput): Future[GetBatchPredictionOutput] =
      service.getBatchPrediction(params).promise().toFuture
    @inline def getDataSourceFuture(params: GetDataSourceInput): Future[GetDataSourceOutput] =
      service.getDataSource(params).promise().toFuture
    @inline def getEvaluationFuture(params: GetEvaluationInput): Future[GetEvaluationOutput] =
      service.getEvaluation(params).promise().toFuture
    @inline def getMLModelFuture(params: GetMLModelInput): Future[GetMLModelOutput] =
      service.getMLModel(params).promise().toFuture
    @inline def predictFuture(params: PredictInput): Future[PredictOutput] = service.predict(params).promise().toFuture
    @inline def updateBatchPredictionFuture(params: UpdateBatchPredictionInput): Future[UpdateBatchPredictionOutput] =
      service.updateBatchPrediction(params).promise().toFuture
    @inline def updateDataSourceFuture(params: UpdateDataSourceInput): Future[UpdateDataSourceOutput] =
      service.updateDataSource(params).promise().toFuture
    @inline def updateEvaluationFuture(params: UpdateEvaluationInput): Future[UpdateEvaluationOutput] =
      service.updateEvaluation(params).promise().toFuture
    @inline def updateMLModelFuture(params: UpdateMLModelInput): Future[UpdateMLModelOutput] =
      service.updateMLModel(params).promise().toFuture
  }
}

package machinelearning {
  @js.native
  @JSImport("aws-sdk", "MachineLearning")
  class MachineLearning() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTags(params: AddTagsInput): Request[AddTagsOutput]                                           = js.native
    def createBatchPrediction(params: CreateBatchPredictionInput): Request[CreateBatchPredictionOutput] = js.native
    def createDataSourceFromRDS(params: CreateDataSourceFromRDSInput): Request[CreateDataSourceFromRDSOutput] =
      js.native
    def createDataSourceFromRedshift(
        params: CreateDataSourceFromRedshiftInput
    ): Request[CreateDataSourceFromRedshiftOutput]                                                         = js.native
    def createDataSourceFromS3(params: CreateDataSourceFromS3Input): Request[CreateDataSourceFromS3Output] = js.native
    def createEvaluation(params: CreateEvaluationInput): Request[CreateEvaluationOutput]                   = js.native
    def createMLModel(params: CreateMLModelInput): Request[CreateMLModelOutput]                            = js.native
    def createRealtimeEndpoint(params: CreateRealtimeEndpointInput): Request[CreateRealtimeEndpointOutput] = js.native
    def deleteBatchPrediction(params: DeleteBatchPredictionInput): Request[DeleteBatchPredictionOutput]    = js.native
    def deleteDataSource(params: DeleteDataSourceInput): Request[DeleteDataSourceOutput]                   = js.native
    def deleteEvaluation(params: DeleteEvaluationInput): Request[DeleteEvaluationOutput]                   = js.native
    def deleteMLModel(params: DeleteMLModelInput): Request[DeleteMLModelOutput]                            = js.native
    def deleteRealtimeEndpoint(params: DeleteRealtimeEndpointInput): Request[DeleteRealtimeEndpointOutput] = js.native
    def deleteTags(params: DeleteTagsInput): Request[DeleteTagsOutput]                                     = js.native
    def describeBatchPredictions(params: DescribeBatchPredictionsInput): Request[DescribeBatchPredictionsOutput] =
      js.native
    def describeDataSources(params: DescribeDataSourcesInput): Request[DescribeDataSourcesOutput]       = js.native
    def describeEvaluations(params: DescribeEvaluationsInput): Request[DescribeEvaluationsOutput]       = js.native
    def describeMLModels(params: DescribeMLModelsInput): Request[DescribeMLModelsOutput]                = js.native
    def describeTags(params: DescribeTagsInput): Request[DescribeTagsOutput]                            = js.native
    def getBatchPrediction(params: GetBatchPredictionInput): Request[GetBatchPredictionOutput]          = js.native
    def getDataSource(params: GetDataSourceInput): Request[GetDataSourceOutput]                         = js.native
    def getEvaluation(params: GetEvaluationInput): Request[GetEvaluationOutput]                         = js.native
    def getMLModel(params: GetMLModelInput): Request[GetMLModelOutput]                                  = js.native
    def predict(params: PredictInput): Request[PredictOutput]                                           = js.native
    def updateBatchPrediction(params: UpdateBatchPredictionInput): Request[UpdateBatchPredictionOutput] = js.native
    def updateDataSource(params: UpdateDataSourceInput): Request[UpdateDataSourceOutput]                = js.native
    def updateEvaluation(params: UpdateEvaluationInput): Request[UpdateEvaluationOutput]                = js.native
    def updateMLModel(params: UpdateMLModelInput): Request[UpdateMLModelOutput]                         = js.native
  }

  @js.native
  @Factory
  trait AddTagsInput extends js.Object {
    var ResourceId: EntityId
    var ResourceType: TaggableResourceType
    var Tags: TagList
  }

  /**
    * Amazon ML returns the following elements.
    */
  @js.native
  @Factory
  trait AddTagsOutput extends js.Object {
    var ResourceId: js.UndefOr[EntityId]
    var ResourceType: js.UndefOr[TaggableResourceType]
  }

  /**
    * The function used to train an <code>MLModel</code>. Training choices supported by Amazon ML include the following:
    * * <code>SGD</code> - Stochastic Gradient Descent.
    *  * <code>RandomForest</code> - Random forest of decision trees.
    */
  @js.native
  sealed trait Algorithm extends js.Any
  object Algorithm extends js.Object {
    val sgd = "sgd".asInstanceOf[Algorithm]

    val values = js.Object.freeze(js.Array(sgd))
  }

  /**
    * Represents the output of a <code>GetBatchPrediction</code> operation.
    *  The content consists of the detailed metadata, the status, and the data file information of a <code>Batch Prediction</code>.
    */
  @js.native
  @Factory
  trait BatchPrediction extends js.Object {
    var BatchPredictionDataSourceId: js.UndefOr[EntityId]
    var BatchPredictionId: js.UndefOr[EntityId]
    var ComputeTime: js.UndefOr[LongType]
    var CreatedAt: js.UndefOr[EpochTime]
    var CreatedByIamUser: js.UndefOr[AwsUserArn]
    var FinishedAt: js.UndefOr[EpochTime]
    var InputDataLocationS3: js.UndefOr[S3Url]
    var InvalidRecordCount: js.UndefOr[LongType]
    var LastUpdatedAt: js.UndefOr[EpochTime]
    var MLModelId: js.UndefOr[EntityId]
    var Message: js.UndefOr[Message]
    var Name: js.UndefOr[EntityName]
    var OutputUri: js.UndefOr[S3Url]
    var StartedAt: js.UndefOr[EpochTime]
    var Status: js.UndefOr[EntityStatus]
    var TotalRecordCount: js.UndefOr[LongType]
  }

  /**
    * A list of the variables to use in searching or filtering <code>BatchPrediction</code>.
    * * <code>CreatedAt</code> - Sets the search criteria to <code>BatchPrediction</code> creation date.
    *  * <code>Status</code> - Sets the search criteria to <code>BatchPrediction</code> status.
    *  * <code>Name</code> - Sets the search criteria to the contents of <code>BatchPrediction</code>``` ``` <code>Name</code>.
    *  * <code>IAMUser</code> - Sets the search criteria to the user account that invoked the <code>BatchPrediction</code> creation.
    *  * <code>MLModelId</code> - Sets the search criteria to the <code>MLModel</code> used in the <code>BatchPrediction</code>.
    *  * <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in the <code>BatchPrediction</code>.
    *  * <code>DataURI</code> - Sets the search criteria to the data file(s) used in the <code>BatchPrediction</code>. The URL can identify either a file or an Amazon Simple Storage Service (Amazon S3) bucket or directory.
    */
  @js.native
  sealed trait BatchPredictionFilterVariable extends js.Any
  object BatchPredictionFilterVariable extends js.Object {
    val CreatedAt     = "CreatedAt".asInstanceOf[BatchPredictionFilterVariable]
    val LastUpdatedAt = "LastUpdatedAt".asInstanceOf[BatchPredictionFilterVariable]
    val Status        = "Status".asInstanceOf[BatchPredictionFilterVariable]
    val Name          = "Name".asInstanceOf[BatchPredictionFilterVariable]
    val IAMUser       = "IAMUser".asInstanceOf[BatchPredictionFilterVariable]
    val MLModelId     = "MLModelId".asInstanceOf[BatchPredictionFilterVariable]
    val DataSourceId  = "DataSourceId".asInstanceOf[BatchPredictionFilterVariable]
    val DataURI       = "DataURI".asInstanceOf[BatchPredictionFilterVariable]

    val values =
      js.Object.freeze(js.Array(CreatedAt, LastUpdatedAt, Status, Name, IAMUser, MLModelId, DataSourceId, DataURI))
  }

  @js.native
  @Factory
  trait CreateBatchPredictionInput extends js.Object {
    var BatchPredictionDataSourceId: EntityId
    var BatchPredictionId: EntityId
    var MLModelId: EntityId
    var OutputUri: S3Url
    var BatchPredictionName: js.UndefOr[EntityName]
  }

  /**
    * Represents the output of a <code>CreateBatchPrediction</code> operation, and is an acknowledgement that Amazon ML received the request.
    *  The <code>CreateBatchPrediction</code> operation is asynchronous. You can poll for status updates by using the <code>&gt;GetBatchPrediction</code> operation and checking the <code>Status</code> parameter of the result.
    */
  @js.native
  @Factory
  trait CreateBatchPredictionOutput extends js.Object {
    var BatchPredictionId: js.UndefOr[EntityId]
  }

  @js.native
  @Factory
  trait CreateDataSourceFromRDSInput extends js.Object {
    var DataSourceId: EntityId
    var RDSData: RDSDataSpec
    var RoleARN: RoleARN
    var ComputeStatistics: js.UndefOr[ComputeStatistics]
    var DataSourceName: js.UndefOr[EntityName]
  }

  /**
    * Represents the output of a <code>CreateDataSourceFromRDS</code> operation, and is an acknowledgement that Amazon ML received the request.
    *  The <code>CreateDataSourceFromRDS</code>&gt; operation is asynchronous. You can poll for updates by using the <code>GetBatchPrediction</code> operation and checking the <code>Status</code> parameter. You can inspect the <code>Message</code> when <code>Status</code> shows up as <code>FAILED</code>. You can also check the progress of the copy operation by going to the <code>DataPipeline</code> console and looking up the pipeline using the <code>pipelineId </code> from the describe call.
    */
  @js.native
  @Factory
  trait CreateDataSourceFromRDSOutput extends js.Object {
    var DataSourceId: js.UndefOr[EntityId]
  }

  @js.native
  @Factory
  trait CreateDataSourceFromRedshiftInput extends js.Object {
    var DataSourceId: EntityId
    var DataSpec: RedshiftDataSpec
    var RoleARN: RoleARN
    var ComputeStatistics: js.UndefOr[ComputeStatistics]
    var DataSourceName: js.UndefOr[EntityName]
  }

  /**
    * Represents the output of a <code>CreateDataSourceFromRedshift</code> operation, and is an acknowledgement that Amazon ML received the request.
    *  The <code>CreateDataSourceFromRedshift</code> operation is asynchronous. You can poll for updates by using the <code>GetBatchPrediction</code> operation and checking the <code>Status</code> parameter.
    */
  @js.native
  @Factory
  trait CreateDataSourceFromRedshiftOutput extends js.Object {
    var DataSourceId: js.UndefOr[EntityId]
  }

  @js.native
  @Factory
  trait CreateDataSourceFromS3Input extends js.Object {
    var DataSourceId: EntityId
    var DataSpec: S3DataSpec
    var ComputeStatistics: js.UndefOr[ComputeStatistics]
    var DataSourceName: js.UndefOr[EntityName]
  }

  /**
    * Represents the output of a <code>CreateDataSourceFromS3</code> operation, and is an acknowledgement that Amazon ML received the request.
    *  The <code>CreateDataSourceFromS3</code> operation is asynchronous. You can poll for updates by using the <code>GetBatchPrediction</code> operation and checking the <code>Status</code> parameter.
    */
  @js.native
  @Factory
  trait CreateDataSourceFromS3Output extends js.Object {
    var DataSourceId: js.UndefOr[EntityId]
  }

  @js.native
  @Factory
  trait CreateEvaluationInput extends js.Object {
    var EvaluationDataSourceId: EntityId
    var EvaluationId: EntityId
    var MLModelId: EntityId
    var EvaluationName: js.UndefOr[EntityName]
  }

  /**
    * Represents the output of a <code>CreateEvaluation</code> operation, and is an acknowledgement that Amazon ML received the request.
    *  <code>CreateEvaluation</code> operation is asynchronous. You can poll for status updates by using the <code>GetEvcaluation</code> operation and checking the <code>Status</code> parameter.
    */
  @js.native
  @Factory
  trait CreateEvaluationOutput extends js.Object {
    var EvaluationId: js.UndefOr[EntityId]
  }

  @js.native
  @Factory
  trait CreateMLModelInput extends js.Object {
    var MLModelId: EntityId
    var MLModelType: MLModelType
    var TrainingDataSourceId: EntityId
    var MLModelName: js.UndefOr[EntityName]
    var Parameters: js.UndefOr[TrainingParameters]
    var Recipe: js.UndefOr[Recipe]
    var RecipeUri: js.UndefOr[S3Url]
  }

  /**
    * Represents the output of a <code>CreateMLModel</code> operation, and is an acknowledgement that Amazon ML received the request.
    *  The <code>CreateMLModel</code> operation is asynchronous. You can poll for status updates by using the <code>GetMLModel</code> operation and checking the <code>Status</code> parameter.
    */
  @js.native
  @Factory
  trait CreateMLModelOutput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
  }

  @js.native
  @Factory
  trait CreateRealtimeEndpointInput extends js.Object {
    var MLModelId: EntityId
  }

  /**
    * Represents the output of an <code>CreateRealtimeEndpoint</code> operation.
    *  The result contains the <code>MLModelId</code> and the endpoint information for the <code>MLModel</code>.
    *
    * '''Note:'''The endpoint information includes the URI of the <code>MLModel</code>; that is, the location to send online prediction requests for the specified <code>MLModel</code>.
    */
  @js.native
  @Factory
  trait CreateRealtimeEndpointOutput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
    var RealtimeEndpointInfo: js.UndefOr[RealtimeEndpointInfo]
  }

  /**
    * Represents the output of the <code>GetDataSource</code> operation.
    *  The content consists of the detailed metadata and data file information and the current status of the <code>DataSource</code>.
    */
  @js.native
  @Factory
  trait DataSource extends js.Object {
    var ComputeStatistics: js.UndefOr[ComputeStatistics]
    var ComputeTime: js.UndefOr[LongType]
    var CreatedAt: js.UndefOr[EpochTime]
    var CreatedByIamUser: js.UndefOr[AwsUserArn]
    var DataLocationS3: js.UndefOr[S3Url]
    var DataRearrangement: js.UndefOr[DataRearrangement]
    var DataSizeInBytes: js.UndefOr[LongType]
    var DataSourceId: js.UndefOr[EntityId]
    var FinishedAt: js.UndefOr[EpochTime]
    var LastUpdatedAt: js.UndefOr[EpochTime]
    var Message: js.UndefOr[Message]
    var Name: js.UndefOr[EntityName]
    var NumberOfFiles: js.UndefOr[LongType]
    var RDSMetadata: js.UndefOr[RDSMetadata]
    var RedshiftMetadata: js.UndefOr[RedshiftMetadata]
    var RoleARN: js.UndefOr[RoleARN]
    var StartedAt: js.UndefOr[EpochTime]
    var Status: js.UndefOr[EntityStatus]
  }

  /**
    * A list of the variables to use in searching or filtering <code>DataSource</code>.
    * * <code>CreatedAt</code> - Sets the search criteria to <code>DataSource</code> creation date.
    *  * <code>Status</code> - Sets the search criteria to <code>DataSource</code> status.
    *  * <code>Name</code> - Sets the search criteria to the contents of <code>DataSource</code> ``` ``` <code>Name</code>.
    *  * <code>DataUri</code> - Sets the search criteria to the URI of data files used to create the <code>DataSource</code>. The URI can identify either a file or an Amazon Simple Storage Service (Amazon S3) bucket or directory.
    *  * <code>IAMUser</code> - Sets the search criteria to the user account that invoked the <code>DataSource</code> creation.
    * '''Note:'''<title>Note</title> The variable names should match the variable names in the <code>DataSource</code>.
    */
  @js.native
  sealed trait DataSourceFilterVariable extends js.Any
  object DataSourceFilterVariable extends js.Object {
    val CreatedAt      = "CreatedAt".asInstanceOf[DataSourceFilterVariable]
    val LastUpdatedAt  = "LastUpdatedAt".asInstanceOf[DataSourceFilterVariable]
    val Status         = "Status".asInstanceOf[DataSourceFilterVariable]
    val Name           = "Name".asInstanceOf[DataSourceFilterVariable]
    val DataLocationS3 = "DataLocationS3".asInstanceOf[DataSourceFilterVariable]
    val IAMUser        = "IAMUser".asInstanceOf[DataSourceFilterVariable]

    val values = js.Object.freeze(js.Array(CreatedAt, LastUpdatedAt, Status, Name, DataLocationS3, IAMUser))
  }

  @js.native
  @Factory
  trait DeleteBatchPredictionInput extends js.Object {
    var BatchPredictionId: EntityId
  }

  /**
    * Represents the output of a <code>DeleteBatchPrediction</code> operation.
    *  You can use the <code>GetBatchPrediction</code> operation and check the value of the <code>Status</code> parameter to see whether a <code>BatchPrediction</code> is marked as <code>DELETED</code>.
    */
  @js.native
  @Factory
  trait DeleteBatchPredictionOutput extends js.Object {
    var BatchPredictionId: js.UndefOr[EntityId]
  }

  @js.native
  @Factory
  trait DeleteDataSourceInput extends js.Object {
    var DataSourceId: EntityId
  }

  /**
    * Represents the output of a <code>DeleteDataSource</code> operation.
    */
  @js.native
  @Factory
  trait DeleteDataSourceOutput extends js.Object {
    var DataSourceId: js.UndefOr[EntityId]
  }

  @js.native
  @Factory
  trait DeleteEvaluationInput extends js.Object {
    var EvaluationId: EntityId
  }

  /**
    * Represents the output of a <code>DeleteEvaluation</code> operation. The output indicates that Amazon Machine Learning (Amazon ML) received the request.
    *  You can use the <code>GetEvaluation</code> operation and check the value of the <code>Status</code> parameter to see whether an <code>Evaluation</code> is marked as <code>DELETED</code>.
    */
  @js.native
  @Factory
  trait DeleteEvaluationOutput extends js.Object {
    var EvaluationId: js.UndefOr[EntityId]
  }

  @js.native
  @Factory
  trait DeleteMLModelInput extends js.Object {
    var MLModelId: EntityId
  }

  /**
    * Represents the output of a <code>DeleteMLModel</code> operation.
    *  You can use the <code>GetMLModel</code> operation and check the value of the <code>Status</code> parameter to see whether an <code>MLModel</code> is marked as <code>DELETED</code>.
    */
  @js.native
  @Factory
  trait DeleteMLModelOutput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
  }

  @js.native
  @Factory
  trait DeleteRealtimeEndpointInput extends js.Object {
    var MLModelId: EntityId
  }

  /**
    * Represents the output of an <code>DeleteRealtimeEndpoint</code> operation.
    *  The result contains the <code>MLModelId</code> and the endpoint information for the <code>MLModel</code>.
    */
  @js.native
  @Factory
  trait DeleteRealtimeEndpointOutput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
    var RealtimeEndpointInfo: js.UndefOr[RealtimeEndpointInfo]
  }

  @js.native
  @Factory
  trait DeleteTagsInput extends js.Object {
    var ResourceId: EntityId
    var ResourceType: TaggableResourceType
    var TagKeys: TagKeyList
  }

  /**
    * Amazon ML returns the following elements.
    */
  @js.native
  @Factory
  trait DeleteTagsOutput extends js.Object {
    var ResourceId: js.UndefOr[EntityId]
    var ResourceType: js.UndefOr[TaggableResourceType]
  }

  @js.native
  @Factory
  trait DescribeBatchPredictionsInput extends js.Object {
    var EQ: js.UndefOr[ComparatorValue]
    var FilterVariable: js.UndefOr[BatchPredictionFilterVariable]
    var GE: js.UndefOr[ComparatorValue]
    var GT: js.UndefOr[ComparatorValue]
    var LE: js.UndefOr[ComparatorValue]
    var LT: js.UndefOr[ComparatorValue]
    var Limit: js.UndefOr[PageLimit]
    var NE: js.UndefOr[ComparatorValue]
    var NextToken: js.UndefOr[StringType]
    var Prefix: js.UndefOr[ComparatorValue]
    var SortOrder: js.UndefOr[SortOrder]
  }

  /**
    * Represents the output of a <code>DescribeBatchPredictions</code> operation. The content is essentially a list of <code>BatchPrediction</code>s.
    */
  @js.native
  @Factory
  trait DescribeBatchPredictionsOutput extends js.Object {
    var NextToken: js.UndefOr[StringType]
    var Results: js.UndefOr[BatchPredictions]
  }

  @js.native
  @Factory
  trait DescribeDataSourcesInput extends js.Object {
    var EQ: js.UndefOr[ComparatorValue]
    var FilterVariable: js.UndefOr[DataSourceFilterVariable]
    var GE: js.UndefOr[ComparatorValue]
    var GT: js.UndefOr[ComparatorValue]
    var LE: js.UndefOr[ComparatorValue]
    var LT: js.UndefOr[ComparatorValue]
    var Limit: js.UndefOr[PageLimit]
    var NE: js.UndefOr[ComparatorValue]
    var NextToken: js.UndefOr[StringType]
    var Prefix: js.UndefOr[ComparatorValue]
    var SortOrder: js.UndefOr[SortOrder]
  }

  /**
    * Represents the query results from a <a>DescribeDataSources</a> operation. The content is essentially a list of <code>DataSource</code>.
    */
  @js.native
  @Factory
  trait DescribeDataSourcesOutput extends js.Object {
    var NextToken: js.UndefOr[StringType]
    var Results: js.UndefOr[DataSources]
  }

  @js.native
  @Factory
  trait DescribeEvaluationsInput extends js.Object {
    var EQ: js.UndefOr[ComparatorValue]
    var FilterVariable: js.UndefOr[EvaluationFilterVariable]
    var GE: js.UndefOr[ComparatorValue]
    var GT: js.UndefOr[ComparatorValue]
    var LE: js.UndefOr[ComparatorValue]
    var LT: js.UndefOr[ComparatorValue]
    var Limit: js.UndefOr[PageLimit]
    var NE: js.UndefOr[ComparatorValue]
    var NextToken: js.UndefOr[StringType]
    var Prefix: js.UndefOr[ComparatorValue]
    var SortOrder: js.UndefOr[SortOrder]
  }

  /**
    * Represents the query results from a <code>DescribeEvaluations</code> operation. The content is essentially a list of <code>Evaluation</code>.
    */
  @js.native
  @Factory
  trait DescribeEvaluationsOutput extends js.Object {
    var NextToken: js.UndefOr[StringType]
    var Results: js.UndefOr[Evaluations]
  }

  @js.native
  @Factory
  trait DescribeMLModelsInput extends js.Object {
    var EQ: js.UndefOr[ComparatorValue]
    var FilterVariable: js.UndefOr[MLModelFilterVariable]
    var GE: js.UndefOr[ComparatorValue]
    var GT: js.UndefOr[ComparatorValue]
    var LE: js.UndefOr[ComparatorValue]
    var LT: js.UndefOr[ComparatorValue]
    var Limit: js.UndefOr[PageLimit]
    var NE: js.UndefOr[ComparatorValue]
    var NextToken: js.UndefOr[StringType]
    var Prefix: js.UndefOr[ComparatorValue]
    var SortOrder: js.UndefOr[SortOrder]
  }

  /**
    * Represents the output of a <code>DescribeMLModels</code> operation. The content is essentially a list of <code>MLModel</code>.
    */
  @js.native
  @Factory
  trait DescribeMLModelsOutput extends js.Object {
    var NextToken: js.UndefOr[StringType]
    var Results: js.UndefOr[MLModels]
  }

  @js.native
  @Factory
  trait DescribeTagsInput extends js.Object {
    var ResourceId: EntityId
    var ResourceType: TaggableResourceType
  }

  /**
    * Amazon ML returns the following elements.
    */
  @js.native
  @Factory
  trait DescribeTagsOutput extends js.Object {
    var ResourceId: js.UndefOr[EntityId]
    var ResourceType: js.UndefOr[TaggableResourceType]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Contains the key values of <code>DetailsMap</code>: <code>PredictiveModelType</code> - Indicates the type of the <code>MLModel</code>. <code>Algorithm</code> - Indicates the algorithm that was used for the <code>MLModel</code>.
    */
  @js.native
  sealed trait DetailsAttributes extends js.Any
  object DetailsAttributes extends js.Object {
    val PredictiveModelType = "PredictiveModelType".asInstanceOf[DetailsAttributes]
    val Algorithm           = "Algorithm".asInstanceOf[DetailsAttributes]

    val values = js.Object.freeze(js.Array(PredictiveModelType, Algorithm))
  }

  /**
    * Object status with the following possible values:
    * * <code>PENDING</code>
    *  * <code>INPROGRESS</code>
    *  * <code>FAILED</code>
    *  * <code>COMPLETED</code>
    *  * <code>DELETED</code>
    */
  @js.native
  sealed trait EntityStatus extends js.Any
  object EntityStatus extends js.Object {
    val PENDING    = "PENDING".asInstanceOf[EntityStatus]
    val INPROGRESS = "INPROGRESS".asInstanceOf[EntityStatus]
    val FAILED     = "FAILED".asInstanceOf[EntityStatus]
    val COMPLETED  = "COMPLETED".asInstanceOf[EntityStatus]
    val DELETED    = "DELETED".asInstanceOf[EntityStatus]

    val values = js.Object.freeze(js.Array(PENDING, INPROGRESS, FAILED, COMPLETED, DELETED))
  }

  /**
    * Represents the output of <code>GetEvaluation</code> operation.
    *  The content consists of the detailed metadata and data file information and the current status of the <code>Evaluation</code>.
    */
  @js.native
  @Factory
  trait Evaluation extends js.Object {
    var ComputeTime: js.UndefOr[LongType]
    var CreatedAt: js.UndefOr[EpochTime]
    var CreatedByIamUser: js.UndefOr[AwsUserArn]
    var EvaluationDataSourceId: js.UndefOr[EntityId]
    var EvaluationId: js.UndefOr[EntityId]
    var FinishedAt: js.UndefOr[EpochTime]
    var InputDataLocationS3: js.UndefOr[S3Url]
    var LastUpdatedAt: js.UndefOr[EpochTime]
    var MLModelId: js.UndefOr[EntityId]
    var Message: js.UndefOr[Message]
    var Name: js.UndefOr[EntityName]
    var PerformanceMetrics: js.UndefOr[PerformanceMetrics]
    var StartedAt: js.UndefOr[EpochTime]
    var Status: js.UndefOr[EntityStatus]
  }

  /**
    * A list of the variables to use in searching or filtering <code>Evaluation</code>.
    * * <code>CreatedAt</code> - Sets the search criteria to <code>Evaluation</code> creation date.
    *  * <code>Status</code> - Sets the search criteria to <code>Evaluation</code> status.
    *  * <code>Name</code> - Sets the search criteria to the contents of <code>Evaluation</code> ``` ``` <code>Name</code>.
    *  * <code>IAMUser</code> - Sets the search criteria to the user account that invoked an evaluation.
    *  * <code>MLModelId</code> - Sets the search criteria to the <code>Predictor</code> that was evaluated.
    *  * <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in evaluation.
    *  * <code>DataUri</code> - Sets the search criteria to the data file(s) used in evaluation. The URL can identify either a file or an Amazon Simple Storage Service (Amazon S3) bucket or directory.
    */
  @js.native
  sealed trait EvaluationFilterVariable extends js.Any
  object EvaluationFilterVariable extends js.Object {
    val CreatedAt     = "CreatedAt".asInstanceOf[EvaluationFilterVariable]
    val LastUpdatedAt = "LastUpdatedAt".asInstanceOf[EvaluationFilterVariable]
    val Status        = "Status".asInstanceOf[EvaluationFilterVariable]
    val Name          = "Name".asInstanceOf[EvaluationFilterVariable]
    val IAMUser       = "IAMUser".asInstanceOf[EvaluationFilterVariable]
    val MLModelId     = "MLModelId".asInstanceOf[EvaluationFilterVariable]
    val DataSourceId  = "DataSourceId".asInstanceOf[EvaluationFilterVariable]
    val DataURI       = "DataURI".asInstanceOf[EvaluationFilterVariable]

    val values =
      js.Object.freeze(js.Array(CreatedAt, LastUpdatedAt, Status, Name, IAMUser, MLModelId, DataSourceId, DataURI))
  }

  @js.native
  @Factory
  trait GetBatchPredictionInput extends js.Object {
    var BatchPredictionId: EntityId
  }

  /**
    * Represents the output of a <code>GetBatchPrediction</code> operation and describes a <code>BatchPrediction</code>.
    */
  @js.native
  @Factory
  trait GetBatchPredictionOutput extends js.Object {
    var BatchPredictionDataSourceId: js.UndefOr[EntityId]
    var BatchPredictionId: js.UndefOr[EntityId]
    var ComputeTime: js.UndefOr[LongType]
    var CreatedAt: js.UndefOr[EpochTime]
    var CreatedByIamUser: js.UndefOr[AwsUserArn]
    var FinishedAt: js.UndefOr[EpochTime]
    var InputDataLocationS3: js.UndefOr[S3Url]
    var InvalidRecordCount: js.UndefOr[LongType]
    var LastUpdatedAt: js.UndefOr[EpochTime]
    var LogUri: js.UndefOr[PresignedS3Url]
    var MLModelId: js.UndefOr[EntityId]
    var Message: js.UndefOr[Message]
    var Name: js.UndefOr[EntityName]
    var OutputUri: js.UndefOr[S3Url]
    var StartedAt: js.UndefOr[EpochTime]
    var Status: js.UndefOr[EntityStatus]
    var TotalRecordCount: js.UndefOr[LongType]
  }

  @js.native
  @Factory
  trait GetDataSourceInput extends js.Object {
    var DataSourceId: EntityId
    var Verbose: js.UndefOr[Verbose]
  }

  /**
    * Represents the output of a <code>GetDataSource</code> operation and describes a <code>DataSource</code>.
    */
  @js.native
  @Factory
  trait GetDataSourceOutput extends js.Object {
    var ComputeStatistics: js.UndefOr[ComputeStatistics]
    var ComputeTime: js.UndefOr[LongType]
    var CreatedAt: js.UndefOr[EpochTime]
    var CreatedByIamUser: js.UndefOr[AwsUserArn]
    var DataLocationS3: js.UndefOr[S3Url]
    var DataRearrangement: js.UndefOr[DataRearrangement]
    var DataSizeInBytes: js.UndefOr[LongType]
    var DataSourceId: js.UndefOr[EntityId]
    var DataSourceSchema: js.UndefOr[DataSchema]
    var FinishedAt: js.UndefOr[EpochTime]
    var LastUpdatedAt: js.UndefOr[EpochTime]
    var LogUri: js.UndefOr[PresignedS3Url]
    var Message: js.UndefOr[Message]
    var Name: js.UndefOr[EntityName]
    var NumberOfFiles: js.UndefOr[LongType]
    var RDSMetadata: js.UndefOr[RDSMetadata]
    var RedshiftMetadata: js.UndefOr[RedshiftMetadata]
    var RoleARN: js.UndefOr[RoleARN]
    var StartedAt: js.UndefOr[EpochTime]
    var Status: js.UndefOr[EntityStatus]
  }

  @js.native
  @Factory
  trait GetEvaluationInput extends js.Object {
    var EvaluationId: EntityId
  }

  /**
    * Represents the output of a <code>GetEvaluation</code> operation and describes an <code>Evaluation</code>.
    */
  @js.native
  @Factory
  trait GetEvaluationOutput extends js.Object {
    var ComputeTime: js.UndefOr[LongType]
    var CreatedAt: js.UndefOr[EpochTime]
    var CreatedByIamUser: js.UndefOr[AwsUserArn]
    var EvaluationDataSourceId: js.UndefOr[EntityId]
    var EvaluationId: js.UndefOr[EntityId]
    var FinishedAt: js.UndefOr[EpochTime]
    var InputDataLocationS3: js.UndefOr[S3Url]
    var LastUpdatedAt: js.UndefOr[EpochTime]
    var LogUri: js.UndefOr[PresignedS3Url]
    var MLModelId: js.UndefOr[EntityId]
    var Message: js.UndefOr[Message]
    var Name: js.UndefOr[EntityName]
    var PerformanceMetrics: js.UndefOr[PerformanceMetrics]
    var StartedAt: js.UndefOr[EpochTime]
    var Status: js.UndefOr[EntityStatus]
  }

  @js.native
  @Factory
  trait GetMLModelInput extends js.Object {
    var MLModelId: EntityId
    var Verbose: js.UndefOr[Verbose]
  }

  /**
    * Represents the output of a <code>GetMLModel</code> operation, and provides detailed information about a <code>MLModel</code>.
    */
  @js.native
  @Factory
  trait GetMLModelOutput extends js.Object {
    var ComputeTime: js.UndefOr[LongType]
    var CreatedAt: js.UndefOr[EpochTime]
    var CreatedByIamUser: js.UndefOr[AwsUserArn]
    var EndpointInfo: js.UndefOr[RealtimeEndpointInfo]
    var FinishedAt: js.UndefOr[EpochTime]
    var InputDataLocationS3: js.UndefOr[S3Url]
    var LastUpdatedAt: js.UndefOr[EpochTime]
    var LogUri: js.UndefOr[PresignedS3Url]
    var MLModelId: js.UndefOr[EntityId]
    var MLModelType: js.UndefOr[MLModelType]
    var Message: js.UndefOr[Message]
    var Name: js.UndefOr[MLModelName]
    var Recipe: js.UndefOr[Recipe]
    var Schema: js.UndefOr[DataSchema]
    var ScoreThreshold: js.UndefOr[ScoreThreshold]
    var ScoreThresholdLastUpdatedAt: js.UndefOr[EpochTime]
    var SizeInBytes: js.UndefOr[LongType]
    var StartedAt: js.UndefOr[EpochTime]
    var Status: js.UndefOr[EntityStatus]
    var TrainingDataSourceId: js.UndefOr[EntityId]
    var TrainingParameters: js.UndefOr[TrainingParameters]
  }

  /**
    * A second request to use or change an object was not allowed. This can result from retrying a request using a parameter that was not present in the original request.
    */
  @js.native
  trait IdempotentParameterMismatchExceptionException extends js.Object {
    val message: ErrorMessage
    val code: ErrorCode
  }

  /**
    * An error on the server occurred when trying to process a request.
    */
  @js.native
  trait InternalServerExceptionException extends js.Object {
    val message: ErrorMessage
    val code: ErrorCode
  }

  /**
    * An error on the client occurred. Typically, the cause is an invalid input value.
    */
  @js.native
  trait InvalidInputExceptionException extends js.Object {
    val message: ErrorMessage
    val code: ErrorCode
  }

  @js.native
  trait InvalidTagExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * The subscriber exceeded the maximum number of operations. This exception can occur when listing objects such as <code>DataSource</code>.
    */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val message: ErrorMessage
    val code: ErrorCode
  }

  /**
    * Represents the output of a <code>GetMLModel</code> operation.
    *  The content consists of the detailed metadata and the current status of the <code>MLModel</code>.
    */
  @js.native
  @Factory
  trait MLModel extends js.Object {
    var Algorithm: js.UndefOr[Algorithm]
    var ComputeTime: js.UndefOr[LongType]
    var CreatedAt: js.UndefOr[EpochTime]
    var CreatedByIamUser: js.UndefOr[AwsUserArn]
    var EndpointInfo: js.UndefOr[RealtimeEndpointInfo]
    var FinishedAt: js.UndefOr[EpochTime]
    var InputDataLocationS3: js.UndefOr[S3Url]
    var LastUpdatedAt: js.UndefOr[EpochTime]
    var MLModelId: js.UndefOr[EntityId]
    var MLModelType: js.UndefOr[MLModelType]
    var Message: js.UndefOr[Message]
    var Name: js.UndefOr[MLModelName]
    var ScoreThreshold: js.UndefOr[ScoreThreshold]
    var ScoreThresholdLastUpdatedAt: js.UndefOr[EpochTime]
    var SizeInBytes: js.UndefOr[LongType]
    var StartedAt: js.UndefOr[EpochTime]
    var Status: js.UndefOr[EntityStatus]
    var TrainingDataSourceId: js.UndefOr[EntityId]
    var TrainingParameters: js.UndefOr[TrainingParameters]
  }

  @js.native
  sealed trait MLModelFilterVariable extends js.Any
  object MLModelFilterVariable extends js.Object {
    val CreatedAt              = "CreatedAt".asInstanceOf[MLModelFilterVariable]
    val LastUpdatedAt          = "LastUpdatedAt".asInstanceOf[MLModelFilterVariable]
    val Status                 = "Status".asInstanceOf[MLModelFilterVariable]
    val Name                   = "Name".asInstanceOf[MLModelFilterVariable]
    val IAMUser                = "IAMUser".asInstanceOf[MLModelFilterVariable]
    val TrainingDataSourceId   = "TrainingDataSourceId".asInstanceOf[MLModelFilterVariable]
    val RealtimeEndpointStatus = "RealtimeEndpointStatus".asInstanceOf[MLModelFilterVariable]
    val MLModelType            = "MLModelType".asInstanceOf[MLModelFilterVariable]
    val Algorithm              = "Algorithm".asInstanceOf[MLModelFilterVariable]
    val TrainingDataURI        = "TrainingDataURI".asInstanceOf[MLModelFilterVariable]

    val values = js.Object.freeze(
      js.Array(
        CreatedAt,
        LastUpdatedAt,
        Status,
        Name,
        IAMUser,
        TrainingDataSourceId,
        RealtimeEndpointStatus,
        MLModelType,
        Algorithm,
        TrainingDataURI
      )
    )
  }

  @js.native
  sealed trait MLModelType extends js.Any
  object MLModelType extends js.Object {
    val REGRESSION = "REGRESSION".asInstanceOf[MLModelType]
    val BINARY     = "BINARY".asInstanceOf[MLModelType]
    val MULTICLASS = "MULTICLASS".asInstanceOf[MLModelType]

    val values = js.Object.freeze(js.Array(REGRESSION, BINARY, MULTICLASS))
  }

  /**
    * Measurements of how well the <code>MLModel</code> performed on known observations. One of the following metrics is returned, based on the type of the <code>MLModel</code>:
    * * BinaryAUC: The binary <code>MLModel</code> uses the Area Under the Curve (AUC) technique to measure performance.
    *  * RegressionRMSE: The regression <code>MLModel</code> uses the Root Mean Square Error (RMSE) technique to measure performance. RMSE measures the difference between predicted and actual values for a single variable.
    *  * MulticlassAvgFScore: The multiclass <code>MLModel</code> uses the F1 score technique to measure performance.
    * For more information about performance metrics, please see the [[http://docs.aws.amazon.com/machine-learning/latest/dg|Amazon Machine Learning Developer Guide]].
    */
  @js.native
  @Factory
  trait PerformanceMetrics extends js.Object {
    var Properties: js.UndefOr[PerformanceMetricsProperties]
  }

  @js.native
  @Factory
  trait PredictInput extends js.Object {
    var MLModelId: EntityId
    var PredictEndpoint: VipURL
    var Record: Record
  }

  @js.native
  @Factory
  trait PredictOutput extends js.Object {
    var Prediction: js.UndefOr[Prediction]
  }

  /**
    * The output from a <code>Predict</code> operation:
    * * <code>Details</code> - Contains the following attributes: <code>DetailsAttributes.PREDICTIVE_MODEL_TYPE - REGRESSION | BINARY | MULTICLASS</code> <code>DetailsAttributes.ALGORITHM - SGD</code>
    *  * <code>PredictedLabel</code> - Present for either a <code>BINARY</code> or <code>MULTICLASS</code> <code>MLModel</code> request.
    *  * <code>PredictedScores</code> - Contains the raw classification score corresponding to each label.
    *  * <code>PredictedValue</code> - Present for a <code>REGRESSION</code> <code>MLModel</code> request.
    */
  @js.native
  @Factory
  trait Prediction extends js.Object {
    var details: js.UndefOr[DetailsMap]
    var predictedLabel: js.UndefOr[Label]
    var predictedScores: js.UndefOr[ScoreValuePerLabelMap]
    var predictedValue: js.UndefOr[floatLabel]
  }

  /**
    * The exception is thrown when a predict request is made to an unmounted <code>MLModel</code>.
    */
  @js.native
  trait PredictorNotMountedExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * The data specification of an Amazon Relational Database Service (Amazon RDS) <code>DataSource</code>.
    */
  @js.native
  @Factory
  trait RDSDataSpec extends js.Object {
    var DatabaseCredentials: RDSDatabaseCredentials
    var DatabaseInformation: RDSDatabase
    var ResourceRole: EDPResourceRole
    var S3StagingLocation: S3Url
    var SecurityGroupIds: EDPSecurityGroupIds
    var SelectSqlQuery: RDSSelectSqlQuery
    var ServiceRole: EDPServiceRole
    var SubnetId: EDPSubnetId
    var DataRearrangement: js.UndefOr[DataRearrangement]
    var DataSchema: js.UndefOr[DataSchema]
    var DataSchemaUri: js.UndefOr[S3Url]
  }

  /**
    * The database details of an Amazon RDS database.
    */
  @js.native
  @Factory
  trait RDSDatabase extends js.Object {
    var DatabaseName: RDSDatabaseName
    var InstanceIdentifier: RDSInstanceIdentifier
  }

  /**
    * The database credentials to connect to a database on an RDS DB instance.
    */
  @js.native
  @Factory
  trait RDSDatabaseCredentials extends js.Object {
    var Password: RDSDatabasePassword
    var Username: RDSDatabaseUsername
  }

  /**
    * The datasource details that are specific to Amazon RDS.
    */
  @js.native
  @Factory
  trait RDSMetadata extends js.Object {
    var DataPipelineId: js.UndefOr[EDPPipelineId]
    var Database: js.UndefOr[RDSDatabase]
    var DatabaseUserName: js.UndefOr[RDSDatabaseUsername]
    var ResourceRole: js.UndefOr[EDPResourceRole]
    var SelectSqlQuery: js.UndefOr[RDSSelectSqlQuery]
    var ServiceRole: js.UndefOr[EDPServiceRole]
  }

  /**
    * Describes the real-time endpoint information for an <code>MLModel</code>.
    */
  @js.native
  @Factory
  trait RealtimeEndpointInfo extends js.Object {
    var CreatedAt: js.UndefOr[EpochTime]
    var EndpointStatus: js.UndefOr[RealtimeEndpointStatus]
    var EndpointUrl: js.UndefOr[VipURL]
    var PeakRequestsPerSecond: js.UndefOr[IntegerType]
  }

  @js.native
  sealed trait RealtimeEndpointStatus extends js.Any
  object RealtimeEndpointStatus extends js.Object {
    val NONE     = "NONE".asInstanceOf[RealtimeEndpointStatus]
    val READY    = "READY".asInstanceOf[RealtimeEndpointStatus]
    val UPDATING = "UPDATING".asInstanceOf[RealtimeEndpointStatus]
    val FAILED   = "FAILED".asInstanceOf[RealtimeEndpointStatus]

    val values = js.Object.freeze(js.Array(NONE, READY, UPDATING, FAILED))
  }

  /**
    * Describes the data specification of an Amazon Redshift <code>DataSource</code>.
    */
  @js.native
  @Factory
  trait RedshiftDataSpec extends js.Object {
    var DatabaseCredentials: RedshiftDatabaseCredentials
    var DatabaseInformation: RedshiftDatabase
    var S3StagingLocation: S3Url
    var SelectSqlQuery: RedshiftSelectSqlQuery
    var DataRearrangement: js.UndefOr[DataRearrangement]
    var DataSchema: js.UndefOr[DataSchema]
    var DataSchemaUri: js.UndefOr[S3Url]
  }

  /**
    * Describes the database details required to connect to an Amazon Redshift database.
    */
  @js.native
  @Factory
  trait RedshiftDatabase extends js.Object {
    var ClusterIdentifier: RedshiftClusterIdentifier
    var DatabaseName: RedshiftDatabaseName
  }

  /**
    * Describes the database credentials for connecting to a database on an Amazon Redshift cluster.
    */
  @js.native
  @Factory
  trait RedshiftDatabaseCredentials extends js.Object {
    var Password: RedshiftDatabasePassword
    var Username: RedshiftDatabaseUsername
  }

  /**
    * Describes the <code>DataSource</code> details specific to Amazon Redshift.
    */
  @js.native
  @Factory
  trait RedshiftMetadata extends js.Object {
    var DatabaseUserName: js.UndefOr[RedshiftDatabaseUsername]
    var RedshiftDatabase: js.UndefOr[RedshiftDatabase]
    var SelectSqlQuery: js.UndefOr[RedshiftSelectSqlQuery]
  }

  /**
    * A specified resource cannot be located.
    */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val message: ErrorMessage
    val code: ErrorCode
  }

  /**
    * Describes the data specification of a <code>DataSource</code>.
    */
  @js.native
  @Factory
  trait S3DataSpec extends js.Object {
    var DataLocationS3: S3Url
    var DataRearrangement: js.UndefOr[DataRearrangement]
    var DataSchema: js.UndefOr[DataSchema]
    var DataSchemaLocationS3: js.UndefOr[S3Url]
  }

  /**
    * The sort order specified in a listing condition. Possible values include the following:
    * * <code>asc</code> - Present the information in ascending order (from A-Z).
    *  * <code>dsc</code> - Present the information in descending order (from Z-A).
    */
  @js.native
  sealed trait SortOrder extends js.Any
  object SortOrder extends js.Object {
    val asc = "asc".asInstanceOf[SortOrder]
    val dsc = "dsc".asInstanceOf[SortOrder]

    val values = js.Object.freeze(js.Array(asc, dsc))
  }

  /**
    * A custom key-value pair associated with an ML object, such as an ML model.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  @js.native
  trait TagLimitExceededExceptionException extends js.Object {
    val message: ErrorMessage
  }

  @js.native
  sealed trait TaggableResourceType extends js.Any
  object TaggableResourceType extends js.Object {
    val BatchPrediction = "BatchPrediction".asInstanceOf[TaggableResourceType]
    val DataSource      = "DataSource".asInstanceOf[TaggableResourceType]
    val Evaluation      = "Evaluation".asInstanceOf[TaggableResourceType]
    val MLModel         = "MLModel".asInstanceOf[TaggableResourceType]

    val values = js.Object.freeze(js.Array(BatchPrediction, DataSource, Evaluation, MLModel))
  }

  @js.native
  @Factory
  trait UpdateBatchPredictionInput extends js.Object {
    var BatchPredictionId: EntityId
    var BatchPredictionName: EntityName
  }

  /**
    * Represents the output of an <code>UpdateBatchPrediction</code> operation.
    *  You can see the updated content by using the <code>GetBatchPrediction</code> operation.
    */
  @js.native
  @Factory
  trait UpdateBatchPredictionOutput extends js.Object {
    var BatchPredictionId: js.UndefOr[EntityId]
  }

  @js.native
  @Factory
  trait UpdateDataSourceInput extends js.Object {
    var DataSourceId: EntityId
    var DataSourceName: EntityName
  }

  /**
    * Represents the output of an <code>UpdateDataSource</code> operation.
    *  You can see the updated content by using the <code>GetBatchPrediction</code> operation.
    */
  @js.native
  @Factory
  trait UpdateDataSourceOutput extends js.Object {
    var DataSourceId: js.UndefOr[EntityId]
  }

  @js.native
  @Factory
  trait UpdateEvaluationInput extends js.Object {
    var EvaluationId: EntityId
    var EvaluationName: EntityName
  }

  /**
    * Represents the output of an <code>UpdateEvaluation</code> operation.
    *  You can see the updated content by using the <code>GetEvaluation</code> operation.
    */
  @js.native
  @Factory
  trait UpdateEvaluationOutput extends js.Object {
    var EvaluationId: js.UndefOr[EntityId]
  }

  @js.native
  @Factory
  trait UpdateMLModelInput extends js.Object {
    var MLModelId: EntityId
    var MLModelName: js.UndefOr[EntityName]
    var ScoreThreshold: js.UndefOr[ScoreThreshold]
  }

  /**
    * Represents the output of an <code>UpdateMLModel</code> operation.
    *  You can see the updated content by using the <code>GetMLModel</code> operation.
    */
  @js.native
  @Factory
  trait UpdateMLModelOutput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
  }
}
