package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

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

    @inline def addTagsFuture(params: AddTagsInput): Future[AddTagsOutput] = service.addTags(params).promise.toFuture
    @inline def createBatchPredictionFuture(params: CreateBatchPredictionInput): Future[CreateBatchPredictionOutput] =
      service.createBatchPrediction(params).promise.toFuture
    @inline def createDataSourceFromRDSFuture(
        params: CreateDataSourceFromRDSInput
    ): Future[CreateDataSourceFromRDSOutput] = service.createDataSourceFromRDS(params).promise.toFuture
    @inline def createDataSourceFromRedshiftFuture(
        params: CreateDataSourceFromRedshiftInput
    ): Future[CreateDataSourceFromRedshiftOutput] = service.createDataSourceFromRedshift(params).promise.toFuture
    @inline def createDataSourceFromS3Future(
        params: CreateDataSourceFromS3Input
    ): Future[CreateDataSourceFromS3Output] = service.createDataSourceFromS3(params).promise.toFuture
    @inline def createEvaluationFuture(params: CreateEvaluationInput): Future[CreateEvaluationOutput] =
      service.createEvaluation(params).promise.toFuture
    @inline def createMLModelFuture(params: CreateMLModelInput): Future[CreateMLModelOutput] =
      service.createMLModel(params).promise.toFuture
    @inline def createRealtimeEndpointFuture(
        params: CreateRealtimeEndpointInput
    ): Future[CreateRealtimeEndpointOutput] = service.createRealtimeEndpoint(params).promise.toFuture
    @inline def deleteBatchPredictionFuture(params: DeleteBatchPredictionInput): Future[DeleteBatchPredictionOutput] =
      service.deleteBatchPrediction(params).promise.toFuture
    @inline def deleteDataSourceFuture(params: DeleteDataSourceInput): Future[DeleteDataSourceOutput] =
      service.deleteDataSource(params).promise.toFuture
    @inline def deleteEvaluationFuture(params: DeleteEvaluationInput): Future[DeleteEvaluationOutput] =
      service.deleteEvaluation(params).promise.toFuture
    @inline def deleteMLModelFuture(params: DeleteMLModelInput): Future[DeleteMLModelOutput] =
      service.deleteMLModel(params).promise.toFuture
    @inline def deleteRealtimeEndpointFuture(
        params: DeleteRealtimeEndpointInput
    ): Future[DeleteRealtimeEndpointOutput] = service.deleteRealtimeEndpoint(params).promise.toFuture
    @inline def deleteTagsFuture(params: DeleteTagsInput): Future[DeleteTagsOutput] =
      service.deleteTags(params).promise.toFuture
    @inline def describeBatchPredictionsFuture(
        params: DescribeBatchPredictionsInput
    ): Future[DescribeBatchPredictionsOutput] = service.describeBatchPredictions(params).promise.toFuture
    @inline def describeDataSourcesFuture(params: DescribeDataSourcesInput): Future[DescribeDataSourcesOutput] =
      service.describeDataSources(params).promise.toFuture
    @inline def describeEvaluationsFuture(params: DescribeEvaluationsInput): Future[DescribeEvaluationsOutput] =
      service.describeEvaluations(params).promise.toFuture
    @inline def describeMLModelsFuture(params: DescribeMLModelsInput): Future[DescribeMLModelsOutput] =
      service.describeMLModels(params).promise.toFuture
    @inline def describeTagsFuture(params: DescribeTagsInput): Future[DescribeTagsOutput] =
      service.describeTags(params).promise.toFuture
    @inline def getBatchPredictionFuture(params: GetBatchPredictionInput): Future[GetBatchPredictionOutput] =
      service.getBatchPrediction(params).promise.toFuture
    @inline def getDataSourceFuture(params: GetDataSourceInput): Future[GetDataSourceOutput] =
      service.getDataSource(params).promise.toFuture
    @inline def getEvaluationFuture(params: GetEvaluationInput): Future[GetEvaluationOutput] =
      service.getEvaluation(params).promise.toFuture
    @inline def getMLModelFuture(params: GetMLModelInput): Future[GetMLModelOutput] =
      service.getMLModel(params).promise.toFuture
    @inline def predictFuture(params: PredictInput): Future[PredictOutput] = service.predict(params).promise.toFuture
    @inline def updateBatchPredictionFuture(params: UpdateBatchPredictionInput): Future[UpdateBatchPredictionOutput] =
      service.updateBatchPrediction(params).promise.toFuture
    @inline def updateDataSourceFuture(params: UpdateDataSourceInput): Future[UpdateDataSourceOutput] =
      service.updateDataSource(params).promise.toFuture
    @inline def updateEvaluationFuture(params: UpdateEvaluationInput): Future[UpdateEvaluationOutput] =
      service.updateEvaluation(params).promise.toFuture
    @inline def updateMLModelFuture(params: UpdateMLModelInput): Future[UpdateMLModelOutput] =
      service.updateMLModel(params).promise.toFuture
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
  trait AddTagsInput extends js.Object {
    var ResourceId: EntityId
    var ResourceType: TaggableResourceType
    var Tags: TagList
  }

  object AddTagsInput {
    @inline
    def apply(
        ResourceId: EntityId,
        ResourceType: TaggableResourceType,
        Tags: TagList
    ): AddTagsInput = {
      val __obj = js.Dynamic.literal(
        "ResourceId"   -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "Tags"         -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddTagsInput]
    }
  }

  /**
    * Amazon ML returns the following elements.
    */
  @js.native
  trait AddTagsOutput extends js.Object {
    var ResourceId: js.UndefOr[EntityId]
    var ResourceType: js.UndefOr[TaggableResourceType]
  }

  object AddTagsOutput {
    @inline
    def apply(
        ResourceId: js.UndefOr[EntityId] = js.undefined,
        ResourceType: js.UndefOr[TaggableResourceType] = js.undefined
    ): AddTagsOutput = {
      val __obj = js.Dynamic.literal()
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddTagsOutput]
    }
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

  object BatchPrediction {
    @inline
    def apply(
        BatchPredictionDataSourceId: js.UndefOr[EntityId] = js.undefined,
        BatchPredictionId: js.UndefOr[EntityId] = js.undefined,
        ComputeTime: js.UndefOr[LongType] = js.undefined,
        CreatedAt: js.UndefOr[EpochTime] = js.undefined,
        CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
        FinishedAt: js.UndefOr[EpochTime] = js.undefined,
        InputDataLocationS3: js.UndefOr[S3Url] = js.undefined,
        InvalidRecordCount: js.UndefOr[LongType] = js.undefined,
        LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
        MLModelId: js.UndefOr[EntityId] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        Name: js.UndefOr[EntityName] = js.undefined,
        OutputUri: js.UndefOr[S3Url] = js.undefined,
        StartedAt: js.UndefOr[EpochTime] = js.undefined,
        Status: js.UndefOr[EntityStatus] = js.undefined,
        TotalRecordCount: js.UndefOr[LongType] = js.undefined
    ): BatchPrediction = {
      val __obj = js.Dynamic.literal()
      BatchPredictionDataSourceId.foreach(__v =>
        __obj.updateDynamic("BatchPredictionDataSourceId")(__v.asInstanceOf[js.Any])
      )
      BatchPredictionId.foreach(__v => __obj.updateDynamic("BatchPredictionId")(__v.asInstanceOf[js.Any]))
      ComputeTime.foreach(__v => __obj.updateDynamic("ComputeTime")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      CreatedByIamUser.foreach(__v => __obj.updateDynamic("CreatedByIamUser")(__v.asInstanceOf[js.Any]))
      FinishedAt.foreach(__v => __obj.updateDynamic("FinishedAt")(__v.asInstanceOf[js.Any]))
      InputDataLocationS3.foreach(__v => __obj.updateDynamic("InputDataLocationS3")(__v.asInstanceOf[js.Any]))
      InvalidRecordCount.foreach(__v => __obj.updateDynamic("InvalidRecordCount")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      MLModelId.foreach(__v => __obj.updateDynamic("MLModelId")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutputUri.foreach(__v => __obj.updateDynamic("OutputUri")(__v.asInstanceOf[js.Any]))
      StartedAt.foreach(__v => __obj.updateDynamic("StartedAt")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TotalRecordCount.foreach(__v => __obj.updateDynamic("TotalRecordCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchPrediction]
    }
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
  trait CreateBatchPredictionInput extends js.Object {
    var BatchPredictionDataSourceId: EntityId
    var BatchPredictionId: EntityId
    var MLModelId: EntityId
    var OutputUri: S3Url
    var BatchPredictionName: js.UndefOr[EntityName]
  }

  object CreateBatchPredictionInput {
    @inline
    def apply(
        BatchPredictionDataSourceId: EntityId,
        BatchPredictionId: EntityId,
        MLModelId: EntityId,
        OutputUri: S3Url,
        BatchPredictionName: js.UndefOr[EntityName] = js.undefined
    ): CreateBatchPredictionInput = {
      val __obj = js.Dynamic.literal(
        "BatchPredictionDataSourceId" -> BatchPredictionDataSourceId.asInstanceOf[js.Any],
        "BatchPredictionId"           -> BatchPredictionId.asInstanceOf[js.Any],
        "MLModelId"                   -> MLModelId.asInstanceOf[js.Any],
        "OutputUri"                   -> OutputUri.asInstanceOf[js.Any]
      )

      BatchPredictionName.foreach(__v => __obj.updateDynamic("BatchPredictionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBatchPredictionInput]
    }
  }

  /**
    * Represents the output of a <code>CreateBatchPrediction</code> operation, and is an acknowledgement that Amazon ML received the request.
    *  The <code>CreateBatchPrediction</code> operation is asynchronous. You can poll for status updates by using the <code>&gt;GetBatchPrediction</code> operation and checking the <code>Status</code> parameter of the result.
    */
  @js.native
  trait CreateBatchPredictionOutput extends js.Object {
    var BatchPredictionId: js.UndefOr[EntityId]
  }

  object CreateBatchPredictionOutput {
    @inline
    def apply(
        BatchPredictionId: js.UndefOr[EntityId] = js.undefined
    ): CreateBatchPredictionOutput = {
      val __obj = js.Dynamic.literal()
      BatchPredictionId.foreach(__v => __obj.updateDynamic("BatchPredictionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBatchPredictionOutput]
    }
  }

  @js.native
  trait CreateDataSourceFromRDSInput extends js.Object {
    var DataSourceId: EntityId
    var RDSData: RDSDataSpec
    var RoleARN: RoleARN
    var ComputeStatistics: js.UndefOr[ComputeStatistics]
    var DataSourceName: js.UndefOr[EntityName]
  }

  object CreateDataSourceFromRDSInput {
    @inline
    def apply(
        DataSourceId: EntityId,
        RDSData: RDSDataSpec,
        RoleARN: RoleARN,
        ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined,
        DataSourceName: js.UndefOr[EntityName] = js.undefined
    ): CreateDataSourceFromRDSInput = {
      val __obj = js.Dynamic.literal(
        "DataSourceId" -> DataSourceId.asInstanceOf[js.Any],
        "RDSData"      -> RDSData.asInstanceOf[js.Any],
        "RoleARN"      -> RoleARN.asInstanceOf[js.Any]
      )

      ComputeStatistics.foreach(__v => __obj.updateDynamic("ComputeStatistics")(__v.asInstanceOf[js.Any]))
      DataSourceName.foreach(__v => __obj.updateDynamic("DataSourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataSourceFromRDSInput]
    }
  }

  /**
    * Represents the output of a <code>CreateDataSourceFromRDS</code> operation, and is an acknowledgement that Amazon ML received the request.
    *  The <code>CreateDataSourceFromRDS</code>&gt; operation is asynchronous. You can poll for updates by using the <code>GetBatchPrediction</code> operation and checking the <code>Status</code> parameter. You can inspect the <code>Message</code> when <code>Status</code> shows up as <code>FAILED</code>. You can also check the progress of the copy operation by going to the <code>DataPipeline</code> console and looking up the pipeline using the <code>pipelineId </code> from the describe call.
    */
  @js.native
  trait CreateDataSourceFromRDSOutput extends js.Object {
    var DataSourceId: js.UndefOr[EntityId]
  }

  object CreateDataSourceFromRDSOutput {
    @inline
    def apply(
        DataSourceId: js.UndefOr[EntityId] = js.undefined
    ): CreateDataSourceFromRDSOutput = {
      val __obj = js.Dynamic.literal()
      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataSourceFromRDSOutput]
    }
  }

  @js.native
  trait CreateDataSourceFromRedshiftInput extends js.Object {
    var DataSourceId: EntityId
    var DataSpec: RedshiftDataSpec
    var RoleARN: RoleARN
    var ComputeStatistics: js.UndefOr[ComputeStatistics]
    var DataSourceName: js.UndefOr[EntityName]
  }

  object CreateDataSourceFromRedshiftInput {
    @inline
    def apply(
        DataSourceId: EntityId,
        DataSpec: RedshiftDataSpec,
        RoleARN: RoleARN,
        ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined,
        DataSourceName: js.UndefOr[EntityName] = js.undefined
    ): CreateDataSourceFromRedshiftInput = {
      val __obj = js.Dynamic.literal(
        "DataSourceId" -> DataSourceId.asInstanceOf[js.Any],
        "DataSpec"     -> DataSpec.asInstanceOf[js.Any],
        "RoleARN"      -> RoleARN.asInstanceOf[js.Any]
      )

      ComputeStatistics.foreach(__v => __obj.updateDynamic("ComputeStatistics")(__v.asInstanceOf[js.Any]))
      DataSourceName.foreach(__v => __obj.updateDynamic("DataSourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataSourceFromRedshiftInput]
    }
  }

  /**
    * Represents the output of a <code>CreateDataSourceFromRedshift</code> operation, and is an acknowledgement that Amazon ML received the request.
    *  The <code>CreateDataSourceFromRedshift</code> operation is asynchronous. You can poll for updates by using the <code>GetBatchPrediction</code> operation and checking the <code>Status</code> parameter.
    */
  @js.native
  trait CreateDataSourceFromRedshiftOutput extends js.Object {
    var DataSourceId: js.UndefOr[EntityId]
  }

  object CreateDataSourceFromRedshiftOutput {
    @inline
    def apply(
        DataSourceId: js.UndefOr[EntityId] = js.undefined
    ): CreateDataSourceFromRedshiftOutput = {
      val __obj = js.Dynamic.literal()
      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataSourceFromRedshiftOutput]
    }
  }

  @js.native
  trait CreateDataSourceFromS3Input extends js.Object {
    var DataSourceId: EntityId
    var DataSpec: S3DataSpec
    var ComputeStatistics: js.UndefOr[ComputeStatistics]
    var DataSourceName: js.UndefOr[EntityName]
  }

  object CreateDataSourceFromS3Input {
    @inline
    def apply(
        DataSourceId: EntityId,
        DataSpec: S3DataSpec,
        ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined,
        DataSourceName: js.UndefOr[EntityName] = js.undefined
    ): CreateDataSourceFromS3Input = {
      val __obj = js.Dynamic.literal(
        "DataSourceId" -> DataSourceId.asInstanceOf[js.Any],
        "DataSpec"     -> DataSpec.asInstanceOf[js.Any]
      )

      ComputeStatistics.foreach(__v => __obj.updateDynamic("ComputeStatistics")(__v.asInstanceOf[js.Any]))
      DataSourceName.foreach(__v => __obj.updateDynamic("DataSourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataSourceFromS3Input]
    }
  }

  /**
    * Represents the output of a <code>CreateDataSourceFromS3</code> operation, and is an acknowledgement that Amazon ML received the request.
    *  The <code>CreateDataSourceFromS3</code> operation is asynchronous. You can poll for updates by using the <code>GetBatchPrediction</code> operation and checking the <code>Status</code> parameter.
    */
  @js.native
  trait CreateDataSourceFromS3Output extends js.Object {
    var DataSourceId: js.UndefOr[EntityId]
  }

  object CreateDataSourceFromS3Output {
    @inline
    def apply(
        DataSourceId: js.UndefOr[EntityId] = js.undefined
    ): CreateDataSourceFromS3Output = {
      val __obj = js.Dynamic.literal()
      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataSourceFromS3Output]
    }
  }

  @js.native
  trait CreateEvaluationInput extends js.Object {
    var EvaluationDataSourceId: EntityId
    var EvaluationId: EntityId
    var MLModelId: EntityId
    var EvaluationName: js.UndefOr[EntityName]
  }

  object CreateEvaluationInput {
    @inline
    def apply(
        EvaluationDataSourceId: EntityId,
        EvaluationId: EntityId,
        MLModelId: EntityId,
        EvaluationName: js.UndefOr[EntityName] = js.undefined
    ): CreateEvaluationInput = {
      val __obj = js.Dynamic.literal(
        "EvaluationDataSourceId" -> EvaluationDataSourceId.asInstanceOf[js.Any],
        "EvaluationId"           -> EvaluationId.asInstanceOf[js.Any],
        "MLModelId"              -> MLModelId.asInstanceOf[js.Any]
      )

      EvaluationName.foreach(__v => __obj.updateDynamic("EvaluationName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEvaluationInput]
    }
  }

  /**
    * Represents the output of a <code>CreateEvaluation</code> operation, and is an acknowledgement that Amazon ML received the request.
    *  <code>CreateEvaluation</code> operation is asynchronous. You can poll for status updates by using the <code>GetEvcaluation</code> operation and checking the <code>Status</code> parameter.
    */
  @js.native
  trait CreateEvaluationOutput extends js.Object {
    var EvaluationId: js.UndefOr[EntityId]
  }

  object CreateEvaluationOutput {
    @inline
    def apply(
        EvaluationId: js.UndefOr[EntityId] = js.undefined
    ): CreateEvaluationOutput = {
      val __obj = js.Dynamic.literal()
      EvaluationId.foreach(__v => __obj.updateDynamic("EvaluationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEvaluationOutput]
    }
  }

  @js.native
  trait CreateMLModelInput extends js.Object {
    var MLModelId: EntityId
    var MLModelType: MLModelType
    var TrainingDataSourceId: EntityId
    var MLModelName: js.UndefOr[EntityName]
    var Parameters: js.UndefOr[TrainingParameters]
    var Recipe: js.UndefOr[Recipe]
    var RecipeUri: js.UndefOr[S3Url]
  }

  object CreateMLModelInput {
    @inline
    def apply(
        MLModelId: EntityId,
        MLModelType: MLModelType,
        TrainingDataSourceId: EntityId,
        MLModelName: js.UndefOr[EntityName] = js.undefined,
        Parameters: js.UndefOr[TrainingParameters] = js.undefined,
        Recipe: js.UndefOr[Recipe] = js.undefined,
        RecipeUri: js.UndefOr[S3Url] = js.undefined
    ): CreateMLModelInput = {
      val __obj = js.Dynamic.literal(
        "MLModelId"            -> MLModelId.asInstanceOf[js.Any],
        "MLModelType"          -> MLModelType.asInstanceOf[js.Any],
        "TrainingDataSourceId" -> TrainingDataSourceId.asInstanceOf[js.Any]
      )

      MLModelName.foreach(__v => __obj.updateDynamic("MLModelName")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      Recipe.foreach(__v => __obj.updateDynamic("Recipe")(__v.asInstanceOf[js.Any]))
      RecipeUri.foreach(__v => __obj.updateDynamic("RecipeUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMLModelInput]
    }
  }

  /**
    * Represents the output of a <code>CreateMLModel</code> operation, and is an acknowledgement that Amazon ML received the request.
    *  The <code>CreateMLModel</code> operation is asynchronous. You can poll for status updates by using the <code>GetMLModel</code> operation and checking the <code>Status</code> parameter.
    */
  @js.native
  trait CreateMLModelOutput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
  }

  object CreateMLModelOutput {
    @inline
    def apply(
        MLModelId: js.UndefOr[EntityId] = js.undefined
    ): CreateMLModelOutput = {
      val __obj = js.Dynamic.literal()
      MLModelId.foreach(__v => __obj.updateDynamic("MLModelId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMLModelOutput]
    }
  }

  @js.native
  trait CreateRealtimeEndpointInput extends js.Object {
    var MLModelId: EntityId
  }

  object CreateRealtimeEndpointInput {
    @inline
    def apply(
        MLModelId: EntityId
    ): CreateRealtimeEndpointInput = {
      val __obj = js.Dynamic.literal(
        "MLModelId" -> MLModelId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateRealtimeEndpointInput]
    }
  }

  /**
    * Represents the output of an <code>CreateRealtimeEndpoint</code> operation.
    *  The result contains the <code>MLModelId</code> and the endpoint information for the <code>MLModel</code>.
    *
    * '''Note:'''The endpoint information includes the URI of the <code>MLModel</code>; that is, the location to send online prediction requests for the specified <code>MLModel</code>.
    */
  @js.native
  trait CreateRealtimeEndpointOutput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
    var RealtimeEndpointInfo: js.UndefOr[RealtimeEndpointInfo]
  }

  object CreateRealtimeEndpointOutput {
    @inline
    def apply(
        MLModelId: js.UndefOr[EntityId] = js.undefined,
        RealtimeEndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.undefined
    ): CreateRealtimeEndpointOutput = {
      val __obj = js.Dynamic.literal()
      MLModelId.foreach(__v => __obj.updateDynamic("MLModelId")(__v.asInstanceOf[js.Any]))
      RealtimeEndpointInfo.foreach(__v => __obj.updateDynamic("RealtimeEndpointInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRealtimeEndpointOutput]
    }
  }

  /**
    * Represents the output of the <code>GetDataSource</code> operation.
    *  The content consists of the detailed metadata and data file information and the current status of the <code>DataSource</code>.
    */
  @js.native
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

  object DataSource {
    @inline
    def apply(
        ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined,
        ComputeTime: js.UndefOr[LongType] = js.undefined,
        CreatedAt: js.UndefOr[EpochTime] = js.undefined,
        CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
        DataLocationS3: js.UndefOr[S3Url] = js.undefined,
        DataRearrangement: js.UndefOr[DataRearrangement] = js.undefined,
        DataSizeInBytes: js.UndefOr[LongType] = js.undefined,
        DataSourceId: js.UndefOr[EntityId] = js.undefined,
        FinishedAt: js.UndefOr[EpochTime] = js.undefined,
        LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        Name: js.UndefOr[EntityName] = js.undefined,
        NumberOfFiles: js.UndefOr[LongType] = js.undefined,
        RDSMetadata: js.UndefOr[RDSMetadata] = js.undefined,
        RedshiftMetadata: js.UndefOr[RedshiftMetadata] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined,
        StartedAt: js.UndefOr[EpochTime] = js.undefined,
        Status: js.UndefOr[EntityStatus] = js.undefined
    ): DataSource = {
      val __obj = js.Dynamic.literal()
      ComputeStatistics.foreach(__v => __obj.updateDynamic("ComputeStatistics")(__v.asInstanceOf[js.Any]))
      ComputeTime.foreach(__v => __obj.updateDynamic("ComputeTime")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      CreatedByIamUser.foreach(__v => __obj.updateDynamic("CreatedByIamUser")(__v.asInstanceOf[js.Any]))
      DataLocationS3.foreach(__v => __obj.updateDynamic("DataLocationS3")(__v.asInstanceOf[js.Any]))
      DataRearrangement.foreach(__v => __obj.updateDynamic("DataRearrangement")(__v.asInstanceOf[js.Any]))
      DataSizeInBytes.foreach(__v => __obj.updateDynamic("DataSizeInBytes")(__v.asInstanceOf[js.Any]))
      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      FinishedAt.foreach(__v => __obj.updateDynamic("FinishedAt")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NumberOfFiles.foreach(__v => __obj.updateDynamic("NumberOfFiles")(__v.asInstanceOf[js.Any]))
      RDSMetadata.foreach(__v => __obj.updateDynamic("RDSMetadata")(__v.asInstanceOf[js.Any]))
      RedshiftMetadata.foreach(__v => __obj.updateDynamic("RedshiftMetadata")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      StartedAt.foreach(__v => __obj.updateDynamic("StartedAt")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSource]
    }
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
  trait DeleteBatchPredictionInput extends js.Object {
    var BatchPredictionId: EntityId
  }

  object DeleteBatchPredictionInput {
    @inline
    def apply(
        BatchPredictionId: EntityId
    ): DeleteBatchPredictionInput = {
      val __obj = js.Dynamic.literal(
        "BatchPredictionId" -> BatchPredictionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBatchPredictionInput]
    }
  }

  /**
    * Represents the output of a <code>DeleteBatchPrediction</code> operation.
    *  You can use the <code>GetBatchPrediction</code> operation and check the value of the <code>Status</code> parameter to see whether a <code>BatchPrediction</code> is marked as <code>DELETED</code>.
    */
  @js.native
  trait DeleteBatchPredictionOutput extends js.Object {
    var BatchPredictionId: js.UndefOr[EntityId]
  }

  object DeleteBatchPredictionOutput {
    @inline
    def apply(
        BatchPredictionId: js.UndefOr[EntityId] = js.undefined
    ): DeleteBatchPredictionOutput = {
      val __obj = js.Dynamic.literal()
      BatchPredictionId.foreach(__v => __obj.updateDynamic("BatchPredictionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBatchPredictionOutput]
    }
  }

  @js.native
  trait DeleteDataSourceInput extends js.Object {
    var DataSourceId: EntityId
  }

  object DeleteDataSourceInput {
    @inline
    def apply(
        DataSourceId: EntityId
    ): DeleteDataSourceInput = {
      val __obj = js.Dynamic.literal(
        "DataSourceId" -> DataSourceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDataSourceInput]
    }
  }

  /**
    * Represents the output of a <code>DeleteDataSource</code> operation.
    */
  @js.native
  trait DeleteDataSourceOutput extends js.Object {
    var DataSourceId: js.UndefOr[EntityId]
  }

  object DeleteDataSourceOutput {
    @inline
    def apply(
        DataSourceId: js.UndefOr[EntityId] = js.undefined
    ): DeleteDataSourceOutput = {
      val __obj = js.Dynamic.literal()
      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDataSourceOutput]
    }
  }

  @js.native
  trait DeleteEvaluationInput extends js.Object {
    var EvaluationId: EntityId
  }

  object DeleteEvaluationInput {
    @inline
    def apply(
        EvaluationId: EntityId
    ): DeleteEvaluationInput = {
      val __obj = js.Dynamic.literal(
        "EvaluationId" -> EvaluationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEvaluationInput]
    }
  }

  /**
    * Represents the output of a <code>DeleteEvaluation</code> operation. The output indicates that Amazon Machine Learning (Amazon ML) received the request.
    *  You can use the <code>GetEvaluation</code> operation and check the value of the <code>Status</code> parameter to see whether an <code>Evaluation</code> is marked as <code>DELETED</code>.
    */
  @js.native
  trait DeleteEvaluationOutput extends js.Object {
    var EvaluationId: js.UndefOr[EntityId]
  }

  object DeleteEvaluationOutput {
    @inline
    def apply(
        EvaluationId: js.UndefOr[EntityId] = js.undefined
    ): DeleteEvaluationOutput = {
      val __obj = js.Dynamic.literal()
      EvaluationId.foreach(__v => __obj.updateDynamic("EvaluationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteEvaluationOutput]
    }
  }

  @js.native
  trait DeleteMLModelInput extends js.Object {
    var MLModelId: EntityId
  }

  object DeleteMLModelInput {
    @inline
    def apply(
        MLModelId: EntityId
    ): DeleteMLModelInput = {
      val __obj = js.Dynamic.literal(
        "MLModelId" -> MLModelId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteMLModelInput]
    }
  }

  /**
    * Represents the output of a <code>DeleteMLModel</code> operation.
    *  You can use the <code>GetMLModel</code> operation and check the value of the <code>Status</code> parameter to see whether an <code>MLModel</code> is marked as <code>DELETED</code>.
    */
  @js.native
  trait DeleteMLModelOutput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
  }

  object DeleteMLModelOutput {
    @inline
    def apply(
        MLModelId: js.UndefOr[EntityId] = js.undefined
    ): DeleteMLModelOutput = {
      val __obj = js.Dynamic.literal()
      MLModelId.foreach(__v => __obj.updateDynamic("MLModelId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteMLModelOutput]
    }
  }

  @js.native
  trait DeleteRealtimeEndpointInput extends js.Object {
    var MLModelId: EntityId
  }

  object DeleteRealtimeEndpointInput {
    @inline
    def apply(
        MLModelId: EntityId
    ): DeleteRealtimeEndpointInput = {
      val __obj = js.Dynamic.literal(
        "MLModelId" -> MLModelId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRealtimeEndpointInput]
    }
  }

  /**
    * Represents the output of an <code>DeleteRealtimeEndpoint</code> operation.
    *  The result contains the <code>MLModelId</code> and the endpoint information for the <code>MLModel</code>.
    */
  @js.native
  trait DeleteRealtimeEndpointOutput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
    var RealtimeEndpointInfo: js.UndefOr[RealtimeEndpointInfo]
  }

  object DeleteRealtimeEndpointOutput {
    @inline
    def apply(
        MLModelId: js.UndefOr[EntityId] = js.undefined,
        RealtimeEndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.undefined
    ): DeleteRealtimeEndpointOutput = {
      val __obj = js.Dynamic.literal()
      MLModelId.foreach(__v => __obj.updateDynamic("MLModelId")(__v.asInstanceOf[js.Any]))
      RealtimeEndpointInfo.foreach(__v => __obj.updateDynamic("RealtimeEndpointInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRealtimeEndpointOutput]
    }
  }

  @js.native
  trait DeleteTagsInput extends js.Object {
    var ResourceId: EntityId
    var ResourceType: TaggableResourceType
    var TagKeys: TagKeyList
  }

  object DeleteTagsInput {
    @inline
    def apply(
        ResourceId: EntityId,
        ResourceType: TaggableResourceType,
        TagKeys: TagKeyList
    ): DeleteTagsInput = {
      val __obj = js.Dynamic.literal(
        "ResourceId"   -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "TagKeys"      -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTagsInput]
    }
  }

  /**
    * Amazon ML returns the following elements.
    */
  @js.native
  trait DeleteTagsOutput extends js.Object {
    var ResourceId: js.UndefOr[EntityId]
    var ResourceType: js.UndefOr[TaggableResourceType]
  }

  object DeleteTagsOutput {
    @inline
    def apply(
        ResourceId: js.UndefOr[EntityId] = js.undefined,
        ResourceType: js.UndefOr[TaggableResourceType] = js.undefined
    ): DeleteTagsOutput = {
      val __obj = js.Dynamic.literal()
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTagsOutput]
    }
  }

  @js.native
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

  object DescribeBatchPredictionsInput {
    @inline
    def apply(
        EQ: js.UndefOr[ComparatorValue] = js.undefined,
        FilterVariable: js.UndefOr[BatchPredictionFilterVariable] = js.undefined,
        GE: js.UndefOr[ComparatorValue] = js.undefined,
        GT: js.UndefOr[ComparatorValue] = js.undefined,
        LE: js.UndefOr[ComparatorValue] = js.undefined,
        LT: js.UndefOr[ComparatorValue] = js.undefined,
        Limit: js.UndefOr[PageLimit] = js.undefined,
        NE: js.UndefOr[ComparatorValue] = js.undefined,
        NextToken: js.UndefOr[StringType] = js.undefined,
        Prefix: js.UndefOr[ComparatorValue] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): DescribeBatchPredictionsInput = {
      val __obj = js.Dynamic.literal()
      EQ.foreach(__v => __obj.updateDynamic("EQ")(__v.asInstanceOf[js.Any]))
      FilterVariable.foreach(__v => __obj.updateDynamic("FilterVariable")(__v.asInstanceOf[js.Any]))
      GE.foreach(__v => __obj.updateDynamic("GE")(__v.asInstanceOf[js.Any]))
      GT.foreach(__v => __obj.updateDynamic("GT")(__v.asInstanceOf[js.Any]))
      LE.foreach(__v => __obj.updateDynamic("LE")(__v.asInstanceOf[js.Any]))
      LT.foreach(__v => __obj.updateDynamic("LT")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NE.foreach(__v => __obj.updateDynamic("NE")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBatchPredictionsInput]
    }
  }

  /**
    * Represents the output of a <code>DescribeBatchPredictions</code> operation. The content is essentially a list of <code>BatchPrediction</code>s.
    */
  @js.native
  trait DescribeBatchPredictionsOutput extends js.Object {
    var NextToken: js.UndefOr[StringType]
    var Results: js.UndefOr[BatchPredictions]
  }

  object DescribeBatchPredictionsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[StringType] = js.undefined,
        Results: js.UndefOr[BatchPredictions] = js.undefined
    ): DescribeBatchPredictionsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Results.foreach(__v => __obj.updateDynamic("Results")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBatchPredictionsOutput]
    }
  }

  @js.native
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

  object DescribeDataSourcesInput {
    @inline
    def apply(
        EQ: js.UndefOr[ComparatorValue] = js.undefined,
        FilterVariable: js.UndefOr[DataSourceFilterVariable] = js.undefined,
        GE: js.UndefOr[ComparatorValue] = js.undefined,
        GT: js.UndefOr[ComparatorValue] = js.undefined,
        LE: js.UndefOr[ComparatorValue] = js.undefined,
        LT: js.UndefOr[ComparatorValue] = js.undefined,
        Limit: js.UndefOr[PageLimit] = js.undefined,
        NE: js.UndefOr[ComparatorValue] = js.undefined,
        NextToken: js.UndefOr[StringType] = js.undefined,
        Prefix: js.UndefOr[ComparatorValue] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): DescribeDataSourcesInput = {
      val __obj = js.Dynamic.literal()
      EQ.foreach(__v => __obj.updateDynamic("EQ")(__v.asInstanceOf[js.Any]))
      FilterVariable.foreach(__v => __obj.updateDynamic("FilterVariable")(__v.asInstanceOf[js.Any]))
      GE.foreach(__v => __obj.updateDynamic("GE")(__v.asInstanceOf[js.Any]))
      GT.foreach(__v => __obj.updateDynamic("GT")(__v.asInstanceOf[js.Any]))
      LE.foreach(__v => __obj.updateDynamic("LE")(__v.asInstanceOf[js.Any]))
      LT.foreach(__v => __obj.updateDynamic("LT")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NE.foreach(__v => __obj.updateDynamic("NE")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDataSourcesInput]
    }
  }

  /**
    * Represents the query results from a <a>DescribeDataSources</a> operation. The content is essentially a list of <code>DataSource</code>.
    */
  @js.native
  trait DescribeDataSourcesOutput extends js.Object {
    var NextToken: js.UndefOr[StringType]
    var Results: js.UndefOr[DataSources]
  }

  object DescribeDataSourcesOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[StringType] = js.undefined,
        Results: js.UndefOr[DataSources] = js.undefined
    ): DescribeDataSourcesOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Results.foreach(__v => __obj.updateDynamic("Results")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDataSourcesOutput]
    }
  }

  @js.native
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

  object DescribeEvaluationsInput {
    @inline
    def apply(
        EQ: js.UndefOr[ComparatorValue] = js.undefined,
        FilterVariable: js.UndefOr[EvaluationFilterVariable] = js.undefined,
        GE: js.UndefOr[ComparatorValue] = js.undefined,
        GT: js.UndefOr[ComparatorValue] = js.undefined,
        LE: js.UndefOr[ComparatorValue] = js.undefined,
        LT: js.UndefOr[ComparatorValue] = js.undefined,
        Limit: js.UndefOr[PageLimit] = js.undefined,
        NE: js.UndefOr[ComparatorValue] = js.undefined,
        NextToken: js.UndefOr[StringType] = js.undefined,
        Prefix: js.UndefOr[ComparatorValue] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): DescribeEvaluationsInput = {
      val __obj = js.Dynamic.literal()
      EQ.foreach(__v => __obj.updateDynamic("EQ")(__v.asInstanceOf[js.Any]))
      FilterVariable.foreach(__v => __obj.updateDynamic("FilterVariable")(__v.asInstanceOf[js.Any]))
      GE.foreach(__v => __obj.updateDynamic("GE")(__v.asInstanceOf[js.Any]))
      GT.foreach(__v => __obj.updateDynamic("GT")(__v.asInstanceOf[js.Any]))
      LE.foreach(__v => __obj.updateDynamic("LE")(__v.asInstanceOf[js.Any]))
      LT.foreach(__v => __obj.updateDynamic("LT")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NE.foreach(__v => __obj.updateDynamic("NE")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEvaluationsInput]
    }
  }

  /**
    * Represents the query results from a <code>DescribeEvaluations</code> operation. The content is essentially a list of <code>Evaluation</code>.
    */
  @js.native
  trait DescribeEvaluationsOutput extends js.Object {
    var NextToken: js.UndefOr[StringType]
    var Results: js.UndefOr[Evaluations]
  }

  object DescribeEvaluationsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[StringType] = js.undefined,
        Results: js.UndefOr[Evaluations] = js.undefined
    ): DescribeEvaluationsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Results.foreach(__v => __obj.updateDynamic("Results")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEvaluationsOutput]
    }
  }

  @js.native
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

  object DescribeMLModelsInput {
    @inline
    def apply(
        EQ: js.UndefOr[ComparatorValue] = js.undefined,
        FilterVariable: js.UndefOr[MLModelFilterVariable] = js.undefined,
        GE: js.UndefOr[ComparatorValue] = js.undefined,
        GT: js.UndefOr[ComparatorValue] = js.undefined,
        LE: js.UndefOr[ComparatorValue] = js.undefined,
        LT: js.UndefOr[ComparatorValue] = js.undefined,
        Limit: js.UndefOr[PageLimit] = js.undefined,
        NE: js.UndefOr[ComparatorValue] = js.undefined,
        NextToken: js.UndefOr[StringType] = js.undefined,
        Prefix: js.UndefOr[ComparatorValue] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): DescribeMLModelsInput = {
      val __obj = js.Dynamic.literal()
      EQ.foreach(__v => __obj.updateDynamic("EQ")(__v.asInstanceOf[js.Any]))
      FilterVariable.foreach(__v => __obj.updateDynamic("FilterVariable")(__v.asInstanceOf[js.Any]))
      GE.foreach(__v => __obj.updateDynamic("GE")(__v.asInstanceOf[js.Any]))
      GT.foreach(__v => __obj.updateDynamic("GT")(__v.asInstanceOf[js.Any]))
      LE.foreach(__v => __obj.updateDynamic("LE")(__v.asInstanceOf[js.Any]))
      LT.foreach(__v => __obj.updateDynamic("LT")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NE.foreach(__v => __obj.updateDynamic("NE")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMLModelsInput]
    }
  }

  /**
    * Represents the output of a <code>DescribeMLModels</code> operation. The content is essentially a list of <code>MLModel</code>.
    */
  @js.native
  trait DescribeMLModelsOutput extends js.Object {
    var NextToken: js.UndefOr[StringType]
    var Results: js.UndefOr[MLModels]
  }

  object DescribeMLModelsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[StringType] = js.undefined,
        Results: js.UndefOr[MLModels] = js.undefined
    ): DescribeMLModelsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Results.foreach(__v => __obj.updateDynamic("Results")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMLModelsOutput]
    }
  }

  @js.native
  trait DescribeTagsInput extends js.Object {
    var ResourceId: EntityId
    var ResourceType: TaggableResourceType
  }

  object DescribeTagsInput {
    @inline
    def apply(
        ResourceId: EntityId,
        ResourceType: TaggableResourceType
    ): DescribeTagsInput = {
      val __obj = js.Dynamic.literal(
        "ResourceId"   -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeTagsInput]
    }
  }

  /**
    * Amazon ML returns the following elements.
    */
  @js.native
  trait DescribeTagsOutput extends js.Object {
    var ResourceId: js.UndefOr[EntityId]
    var ResourceType: js.UndefOr[TaggableResourceType]
    var Tags: js.UndefOr[TagList]
  }

  object DescribeTagsOutput {
    @inline
    def apply(
        ResourceId: js.UndefOr[EntityId] = js.undefined,
        ResourceType: js.UndefOr[TaggableResourceType] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): DescribeTagsOutput = {
      val __obj = js.Dynamic.literal()
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTagsOutput]
    }
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

  object Evaluation {
    @inline
    def apply(
        ComputeTime: js.UndefOr[LongType] = js.undefined,
        CreatedAt: js.UndefOr[EpochTime] = js.undefined,
        CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
        EvaluationDataSourceId: js.UndefOr[EntityId] = js.undefined,
        EvaluationId: js.UndefOr[EntityId] = js.undefined,
        FinishedAt: js.UndefOr[EpochTime] = js.undefined,
        InputDataLocationS3: js.UndefOr[S3Url] = js.undefined,
        LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
        MLModelId: js.UndefOr[EntityId] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        Name: js.UndefOr[EntityName] = js.undefined,
        PerformanceMetrics: js.UndefOr[PerformanceMetrics] = js.undefined,
        StartedAt: js.UndefOr[EpochTime] = js.undefined,
        Status: js.UndefOr[EntityStatus] = js.undefined
    ): Evaluation = {
      val __obj = js.Dynamic.literal()
      ComputeTime.foreach(__v => __obj.updateDynamic("ComputeTime")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      CreatedByIamUser.foreach(__v => __obj.updateDynamic("CreatedByIamUser")(__v.asInstanceOf[js.Any]))
      EvaluationDataSourceId.foreach(__v => __obj.updateDynamic("EvaluationDataSourceId")(__v.asInstanceOf[js.Any]))
      EvaluationId.foreach(__v => __obj.updateDynamic("EvaluationId")(__v.asInstanceOf[js.Any]))
      FinishedAt.foreach(__v => __obj.updateDynamic("FinishedAt")(__v.asInstanceOf[js.Any]))
      InputDataLocationS3.foreach(__v => __obj.updateDynamic("InputDataLocationS3")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      MLModelId.foreach(__v => __obj.updateDynamic("MLModelId")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PerformanceMetrics.foreach(__v => __obj.updateDynamic("PerformanceMetrics")(__v.asInstanceOf[js.Any]))
      StartedAt.foreach(__v => __obj.updateDynamic("StartedAt")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Evaluation]
    }
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
  trait GetBatchPredictionInput extends js.Object {
    var BatchPredictionId: EntityId
  }

  object GetBatchPredictionInput {
    @inline
    def apply(
        BatchPredictionId: EntityId
    ): GetBatchPredictionInput = {
      val __obj = js.Dynamic.literal(
        "BatchPredictionId" -> BatchPredictionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBatchPredictionInput]
    }
  }

  /**
    * Represents the output of a <code>GetBatchPrediction</code> operation and describes a <code>BatchPrediction</code>.
    */
  @js.native
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

  object GetBatchPredictionOutput {
    @inline
    def apply(
        BatchPredictionDataSourceId: js.UndefOr[EntityId] = js.undefined,
        BatchPredictionId: js.UndefOr[EntityId] = js.undefined,
        ComputeTime: js.UndefOr[LongType] = js.undefined,
        CreatedAt: js.UndefOr[EpochTime] = js.undefined,
        CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
        FinishedAt: js.UndefOr[EpochTime] = js.undefined,
        InputDataLocationS3: js.UndefOr[S3Url] = js.undefined,
        InvalidRecordCount: js.UndefOr[LongType] = js.undefined,
        LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
        LogUri: js.UndefOr[PresignedS3Url] = js.undefined,
        MLModelId: js.UndefOr[EntityId] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        Name: js.UndefOr[EntityName] = js.undefined,
        OutputUri: js.UndefOr[S3Url] = js.undefined,
        StartedAt: js.UndefOr[EpochTime] = js.undefined,
        Status: js.UndefOr[EntityStatus] = js.undefined,
        TotalRecordCount: js.UndefOr[LongType] = js.undefined
    ): GetBatchPredictionOutput = {
      val __obj = js.Dynamic.literal()
      BatchPredictionDataSourceId.foreach(__v =>
        __obj.updateDynamic("BatchPredictionDataSourceId")(__v.asInstanceOf[js.Any])
      )
      BatchPredictionId.foreach(__v => __obj.updateDynamic("BatchPredictionId")(__v.asInstanceOf[js.Any]))
      ComputeTime.foreach(__v => __obj.updateDynamic("ComputeTime")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      CreatedByIamUser.foreach(__v => __obj.updateDynamic("CreatedByIamUser")(__v.asInstanceOf[js.Any]))
      FinishedAt.foreach(__v => __obj.updateDynamic("FinishedAt")(__v.asInstanceOf[js.Any]))
      InputDataLocationS3.foreach(__v => __obj.updateDynamic("InputDataLocationS3")(__v.asInstanceOf[js.Any]))
      InvalidRecordCount.foreach(__v => __obj.updateDynamic("InvalidRecordCount")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      LogUri.foreach(__v => __obj.updateDynamic("LogUri")(__v.asInstanceOf[js.Any]))
      MLModelId.foreach(__v => __obj.updateDynamic("MLModelId")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutputUri.foreach(__v => __obj.updateDynamic("OutputUri")(__v.asInstanceOf[js.Any]))
      StartedAt.foreach(__v => __obj.updateDynamic("StartedAt")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TotalRecordCount.foreach(__v => __obj.updateDynamic("TotalRecordCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBatchPredictionOutput]
    }
  }

  @js.native
  trait GetDataSourceInput extends js.Object {
    var DataSourceId: EntityId
    var Verbose: js.UndefOr[Verbose]
  }

  object GetDataSourceInput {
    @inline
    def apply(
        DataSourceId: EntityId,
        Verbose: js.UndefOr[Verbose] = js.undefined
    ): GetDataSourceInput = {
      val __obj = js.Dynamic.literal(
        "DataSourceId" -> DataSourceId.asInstanceOf[js.Any]
      )

      Verbose.foreach(__v => __obj.updateDynamic("Verbose")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataSourceInput]
    }
  }

  /**
    * Represents the output of a <code>GetDataSource</code> operation and describes a <code>DataSource</code>.
    */
  @js.native
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

  object GetDataSourceOutput {
    @inline
    def apply(
        ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined,
        ComputeTime: js.UndefOr[LongType] = js.undefined,
        CreatedAt: js.UndefOr[EpochTime] = js.undefined,
        CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
        DataLocationS3: js.UndefOr[S3Url] = js.undefined,
        DataRearrangement: js.UndefOr[DataRearrangement] = js.undefined,
        DataSizeInBytes: js.UndefOr[LongType] = js.undefined,
        DataSourceId: js.UndefOr[EntityId] = js.undefined,
        DataSourceSchema: js.UndefOr[DataSchema] = js.undefined,
        FinishedAt: js.UndefOr[EpochTime] = js.undefined,
        LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
        LogUri: js.UndefOr[PresignedS3Url] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        Name: js.UndefOr[EntityName] = js.undefined,
        NumberOfFiles: js.UndefOr[LongType] = js.undefined,
        RDSMetadata: js.UndefOr[RDSMetadata] = js.undefined,
        RedshiftMetadata: js.UndefOr[RedshiftMetadata] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined,
        StartedAt: js.UndefOr[EpochTime] = js.undefined,
        Status: js.UndefOr[EntityStatus] = js.undefined
    ): GetDataSourceOutput = {
      val __obj = js.Dynamic.literal()
      ComputeStatistics.foreach(__v => __obj.updateDynamic("ComputeStatistics")(__v.asInstanceOf[js.Any]))
      ComputeTime.foreach(__v => __obj.updateDynamic("ComputeTime")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      CreatedByIamUser.foreach(__v => __obj.updateDynamic("CreatedByIamUser")(__v.asInstanceOf[js.Any]))
      DataLocationS3.foreach(__v => __obj.updateDynamic("DataLocationS3")(__v.asInstanceOf[js.Any]))
      DataRearrangement.foreach(__v => __obj.updateDynamic("DataRearrangement")(__v.asInstanceOf[js.Any]))
      DataSizeInBytes.foreach(__v => __obj.updateDynamic("DataSizeInBytes")(__v.asInstanceOf[js.Any]))
      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      DataSourceSchema.foreach(__v => __obj.updateDynamic("DataSourceSchema")(__v.asInstanceOf[js.Any]))
      FinishedAt.foreach(__v => __obj.updateDynamic("FinishedAt")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      LogUri.foreach(__v => __obj.updateDynamic("LogUri")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NumberOfFiles.foreach(__v => __obj.updateDynamic("NumberOfFiles")(__v.asInstanceOf[js.Any]))
      RDSMetadata.foreach(__v => __obj.updateDynamic("RDSMetadata")(__v.asInstanceOf[js.Any]))
      RedshiftMetadata.foreach(__v => __obj.updateDynamic("RedshiftMetadata")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      StartedAt.foreach(__v => __obj.updateDynamic("StartedAt")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataSourceOutput]
    }
  }

  @js.native
  trait GetEvaluationInput extends js.Object {
    var EvaluationId: EntityId
  }

  object GetEvaluationInput {
    @inline
    def apply(
        EvaluationId: EntityId
    ): GetEvaluationInput = {
      val __obj = js.Dynamic.literal(
        "EvaluationId" -> EvaluationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetEvaluationInput]
    }
  }

  /**
    * Represents the output of a <code>GetEvaluation</code> operation and describes an <code>Evaluation</code>.
    */
  @js.native
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

  object GetEvaluationOutput {
    @inline
    def apply(
        ComputeTime: js.UndefOr[LongType] = js.undefined,
        CreatedAt: js.UndefOr[EpochTime] = js.undefined,
        CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
        EvaluationDataSourceId: js.UndefOr[EntityId] = js.undefined,
        EvaluationId: js.UndefOr[EntityId] = js.undefined,
        FinishedAt: js.UndefOr[EpochTime] = js.undefined,
        InputDataLocationS3: js.UndefOr[S3Url] = js.undefined,
        LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
        LogUri: js.UndefOr[PresignedS3Url] = js.undefined,
        MLModelId: js.UndefOr[EntityId] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        Name: js.UndefOr[EntityName] = js.undefined,
        PerformanceMetrics: js.UndefOr[PerformanceMetrics] = js.undefined,
        StartedAt: js.UndefOr[EpochTime] = js.undefined,
        Status: js.UndefOr[EntityStatus] = js.undefined
    ): GetEvaluationOutput = {
      val __obj = js.Dynamic.literal()
      ComputeTime.foreach(__v => __obj.updateDynamic("ComputeTime")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      CreatedByIamUser.foreach(__v => __obj.updateDynamic("CreatedByIamUser")(__v.asInstanceOf[js.Any]))
      EvaluationDataSourceId.foreach(__v => __obj.updateDynamic("EvaluationDataSourceId")(__v.asInstanceOf[js.Any]))
      EvaluationId.foreach(__v => __obj.updateDynamic("EvaluationId")(__v.asInstanceOf[js.Any]))
      FinishedAt.foreach(__v => __obj.updateDynamic("FinishedAt")(__v.asInstanceOf[js.Any]))
      InputDataLocationS3.foreach(__v => __obj.updateDynamic("InputDataLocationS3")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      LogUri.foreach(__v => __obj.updateDynamic("LogUri")(__v.asInstanceOf[js.Any]))
      MLModelId.foreach(__v => __obj.updateDynamic("MLModelId")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PerformanceMetrics.foreach(__v => __obj.updateDynamic("PerformanceMetrics")(__v.asInstanceOf[js.Any]))
      StartedAt.foreach(__v => __obj.updateDynamic("StartedAt")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEvaluationOutput]
    }
  }

  @js.native
  trait GetMLModelInput extends js.Object {
    var MLModelId: EntityId
    var Verbose: js.UndefOr[Verbose]
  }

  object GetMLModelInput {
    @inline
    def apply(
        MLModelId: EntityId,
        Verbose: js.UndefOr[Verbose] = js.undefined
    ): GetMLModelInput = {
      val __obj = js.Dynamic.literal(
        "MLModelId" -> MLModelId.asInstanceOf[js.Any]
      )

      Verbose.foreach(__v => __obj.updateDynamic("Verbose")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMLModelInput]
    }
  }

  /**
    * Represents the output of a <code>GetMLModel</code> operation, and provides detailed information about a <code>MLModel</code>.
    */
  @js.native
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

  object GetMLModelOutput {
    @inline
    def apply(
        ComputeTime: js.UndefOr[LongType] = js.undefined,
        CreatedAt: js.UndefOr[EpochTime] = js.undefined,
        CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
        EndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.undefined,
        FinishedAt: js.UndefOr[EpochTime] = js.undefined,
        InputDataLocationS3: js.UndefOr[S3Url] = js.undefined,
        LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
        LogUri: js.UndefOr[PresignedS3Url] = js.undefined,
        MLModelId: js.UndefOr[EntityId] = js.undefined,
        MLModelType: js.UndefOr[MLModelType] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        Name: js.UndefOr[MLModelName] = js.undefined,
        Recipe: js.UndefOr[Recipe] = js.undefined,
        Schema: js.UndefOr[DataSchema] = js.undefined,
        ScoreThreshold: js.UndefOr[ScoreThreshold] = js.undefined,
        ScoreThresholdLastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
        SizeInBytes: js.UndefOr[LongType] = js.undefined,
        StartedAt: js.UndefOr[EpochTime] = js.undefined,
        Status: js.UndefOr[EntityStatus] = js.undefined,
        TrainingDataSourceId: js.UndefOr[EntityId] = js.undefined,
        TrainingParameters: js.UndefOr[TrainingParameters] = js.undefined
    ): GetMLModelOutput = {
      val __obj = js.Dynamic.literal()
      ComputeTime.foreach(__v => __obj.updateDynamic("ComputeTime")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      CreatedByIamUser.foreach(__v => __obj.updateDynamic("CreatedByIamUser")(__v.asInstanceOf[js.Any]))
      EndpointInfo.foreach(__v => __obj.updateDynamic("EndpointInfo")(__v.asInstanceOf[js.Any]))
      FinishedAt.foreach(__v => __obj.updateDynamic("FinishedAt")(__v.asInstanceOf[js.Any]))
      InputDataLocationS3.foreach(__v => __obj.updateDynamic("InputDataLocationS3")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      LogUri.foreach(__v => __obj.updateDynamic("LogUri")(__v.asInstanceOf[js.Any]))
      MLModelId.foreach(__v => __obj.updateDynamic("MLModelId")(__v.asInstanceOf[js.Any]))
      MLModelType.foreach(__v => __obj.updateDynamic("MLModelType")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Recipe.foreach(__v => __obj.updateDynamic("Recipe")(__v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.updateDynamic("Schema")(__v.asInstanceOf[js.Any]))
      ScoreThreshold.foreach(__v => __obj.updateDynamic("ScoreThreshold")(__v.asInstanceOf[js.Any]))
      ScoreThresholdLastUpdatedAt.foreach(__v =>
        __obj.updateDynamic("ScoreThresholdLastUpdatedAt")(__v.asInstanceOf[js.Any])
      )
      SizeInBytes.foreach(__v => __obj.updateDynamic("SizeInBytes")(__v.asInstanceOf[js.Any]))
      StartedAt.foreach(__v => __obj.updateDynamic("StartedAt")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TrainingDataSourceId.foreach(__v => __obj.updateDynamic("TrainingDataSourceId")(__v.asInstanceOf[js.Any]))
      TrainingParameters.foreach(__v => __obj.updateDynamic("TrainingParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMLModelOutput]
    }
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

  object MLModel {
    @inline
    def apply(
        Algorithm: js.UndefOr[Algorithm] = js.undefined,
        ComputeTime: js.UndefOr[LongType] = js.undefined,
        CreatedAt: js.UndefOr[EpochTime] = js.undefined,
        CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
        EndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.undefined,
        FinishedAt: js.UndefOr[EpochTime] = js.undefined,
        InputDataLocationS3: js.UndefOr[S3Url] = js.undefined,
        LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
        MLModelId: js.UndefOr[EntityId] = js.undefined,
        MLModelType: js.UndefOr[MLModelType] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        Name: js.UndefOr[MLModelName] = js.undefined,
        ScoreThreshold: js.UndefOr[ScoreThreshold] = js.undefined,
        ScoreThresholdLastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
        SizeInBytes: js.UndefOr[LongType] = js.undefined,
        StartedAt: js.UndefOr[EpochTime] = js.undefined,
        Status: js.UndefOr[EntityStatus] = js.undefined,
        TrainingDataSourceId: js.UndefOr[EntityId] = js.undefined,
        TrainingParameters: js.UndefOr[TrainingParameters] = js.undefined
    ): MLModel = {
      val __obj = js.Dynamic.literal()
      Algorithm.foreach(__v => __obj.updateDynamic("Algorithm")(__v.asInstanceOf[js.Any]))
      ComputeTime.foreach(__v => __obj.updateDynamic("ComputeTime")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      CreatedByIamUser.foreach(__v => __obj.updateDynamic("CreatedByIamUser")(__v.asInstanceOf[js.Any]))
      EndpointInfo.foreach(__v => __obj.updateDynamic("EndpointInfo")(__v.asInstanceOf[js.Any]))
      FinishedAt.foreach(__v => __obj.updateDynamic("FinishedAt")(__v.asInstanceOf[js.Any]))
      InputDataLocationS3.foreach(__v => __obj.updateDynamic("InputDataLocationS3")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      MLModelId.foreach(__v => __obj.updateDynamic("MLModelId")(__v.asInstanceOf[js.Any]))
      MLModelType.foreach(__v => __obj.updateDynamic("MLModelType")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ScoreThreshold.foreach(__v => __obj.updateDynamic("ScoreThreshold")(__v.asInstanceOf[js.Any]))
      ScoreThresholdLastUpdatedAt.foreach(__v =>
        __obj.updateDynamic("ScoreThresholdLastUpdatedAt")(__v.asInstanceOf[js.Any])
      )
      SizeInBytes.foreach(__v => __obj.updateDynamic("SizeInBytes")(__v.asInstanceOf[js.Any]))
      StartedAt.foreach(__v => __obj.updateDynamic("StartedAt")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TrainingDataSourceId.foreach(__v => __obj.updateDynamic("TrainingDataSourceId")(__v.asInstanceOf[js.Any]))
      TrainingParameters.foreach(__v => __obj.updateDynamic("TrainingParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MLModel]
    }
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
  trait PerformanceMetrics extends js.Object {
    var Properties: js.UndefOr[PerformanceMetricsProperties]
  }

  object PerformanceMetrics {
    @inline
    def apply(
        Properties: js.UndefOr[PerformanceMetricsProperties] = js.undefined
    ): PerformanceMetrics = {
      val __obj = js.Dynamic.literal()
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PerformanceMetrics]
    }
  }

  @js.native
  trait PredictInput extends js.Object {
    var MLModelId: EntityId
    var PredictEndpoint: VipURL
    var Record: Record
  }

  object PredictInput {
    @inline
    def apply(
        MLModelId: EntityId,
        PredictEndpoint: VipURL,
        Record: Record
    ): PredictInput = {
      val __obj = js.Dynamic.literal(
        "MLModelId"       -> MLModelId.asInstanceOf[js.Any],
        "PredictEndpoint" -> PredictEndpoint.asInstanceOf[js.Any],
        "Record"          -> Record.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PredictInput]
    }
  }

  @js.native
  trait PredictOutput extends js.Object {
    var Prediction: js.UndefOr[Prediction]
  }

  object PredictOutput {
    @inline
    def apply(
        Prediction: js.UndefOr[Prediction] = js.undefined
    ): PredictOutput = {
      val __obj = js.Dynamic.literal()
      Prediction.foreach(__v => __obj.updateDynamic("Prediction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredictOutput]
    }
  }

  /**
    * The output from a <code>Predict</code> operation:
    * * <code>Details</code> - Contains the following attributes: <code>DetailsAttributes.PREDICTIVE_MODEL_TYPE - REGRESSION | BINARY | MULTICLASS</code> <code>DetailsAttributes.ALGORITHM - SGD</code>
    *  * <code>PredictedLabel</code> - Present for either a <code>BINARY</code> or <code>MULTICLASS</code> <code>MLModel</code> request.
    *  * <code>PredictedScores</code> - Contains the raw classification score corresponding to each label.
    *  * <code>PredictedValue</code> - Present for a <code>REGRESSION</code> <code>MLModel</code> request.
    */
  @js.native
  trait Prediction extends js.Object {
    var details: js.UndefOr[DetailsMap]
    var predictedLabel: js.UndefOr[Label]
    var predictedScores: js.UndefOr[ScoreValuePerLabelMap]
    var predictedValue: js.UndefOr[floatLabel]
  }

  object Prediction {
    @inline
    def apply(
        details: js.UndefOr[DetailsMap] = js.undefined,
        predictedLabel: js.UndefOr[Label] = js.undefined,
        predictedScores: js.UndefOr[ScoreValuePerLabelMap] = js.undefined,
        predictedValue: js.UndefOr[floatLabel] = js.undefined
    ): Prediction = {
      val __obj = js.Dynamic.literal()
      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      predictedLabel.foreach(__v => __obj.updateDynamic("predictedLabel")(__v.asInstanceOf[js.Any]))
      predictedScores.foreach(__v => __obj.updateDynamic("predictedScores")(__v.asInstanceOf[js.Any]))
      predictedValue.foreach(__v => __obj.updateDynamic("predictedValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Prediction]
    }
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

  object RDSDataSpec {
    @inline
    def apply(
        DatabaseCredentials: RDSDatabaseCredentials,
        DatabaseInformation: RDSDatabase,
        ResourceRole: EDPResourceRole,
        S3StagingLocation: S3Url,
        SecurityGroupIds: EDPSecurityGroupIds,
        SelectSqlQuery: RDSSelectSqlQuery,
        ServiceRole: EDPServiceRole,
        SubnetId: EDPSubnetId,
        DataRearrangement: js.UndefOr[DataRearrangement] = js.undefined,
        DataSchema: js.UndefOr[DataSchema] = js.undefined,
        DataSchemaUri: js.UndefOr[S3Url] = js.undefined
    ): RDSDataSpec = {
      val __obj = js.Dynamic.literal(
        "DatabaseCredentials" -> DatabaseCredentials.asInstanceOf[js.Any],
        "DatabaseInformation" -> DatabaseInformation.asInstanceOf[js.Any],
        "ResourceRole"        -> ResourceRole.asInstanceOf[js.Any],
        "S3StagingLocation"   -> S3StagingLocation.asInstanceOf[js.Any],
        "SecurityGroupIds"    -> SecurityGroupIds.asInstanceOf[js.Any],
        "SelectSqlQuery"      -> SelectSqlQuery.asInstanceOf[js.Any],
        "ServiceRole"         -> ServiceRole.asInstanceOf[js.Any],
        "SubnetId"            -> SubnetId.asInstanceOf[js.Any]
      )

      DataRearrangement.foreach(__v => __obj.updateDynamic("DataRearrangement")(__v.asInstanceOf[js.Any]))
      DataSchema.foreach(__v => __obj.updateDynamic("DataSchema")(__v.asInstanceOf[js.Any]))
      DataSchemaUri.foreach(__v => __obj.updateDynamic("DataSchemaUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RDSDataSpec]
    }
  }

  /**
    * The database details of an Amazon RDS database.
    */
  @js.native
  trait RDSDatabase extends js.Object {
    var DatabaseName: RDSDatabaseName
    var InstanceIdentifier: RDSInstanceIdentifier
  }

  object RDSDatabase {
    @inline
    def apply(
        DatabaseName: RDSDatabaseName,
        InstanceIdentifier: RDSInstanceIdentifier
    ): RDSDatabase = {
      val __obj = js.Dynamic.literal(
        "DatabaseName"       -> DatabaseName.asInstanceOf[js.Any],
        "InstanceIdentifier" -> InstanceIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RDSDatabase]
    }
  }

  /**
    * The database credentials to connect to a database on an RDS DB instance.
    */
  @js.native
  trait RDSDatabaseCredentials extends js.Object {
    var Password: RDSDatabasePassword
    var Username: RDSDatabaseUsername
  }

  object RDSDatabaseCredentials {
    @inline
    def apply(
        Password: RDSDatabasePassword,
        Username: RDSDatabaseUsername
    ): RDSDatabaseCredentials = {
      val __obj = js.Dynamic.literal(
        "Password" -> Password.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RDSDatabaseCredentials]
    }
  }

  /**
    * The datasource details that are specific to Amazon RDS.
    */
  @js.native
  trait RDSMetadata extends js.Object {
    var DataPipelineId: js.UndefOr[EDPPipelineId]
    var Database: js.UndefOr[RDSDatabase]
    var DatabaseUserName: js.UndefOr[RDSDatabaseUsername]
    var ResourceRole: js.UndefOr[EDPResourceRole]
    var SelectSqlQuery: js.UndefOr[RDSSelectSqlQuery]
    var ServiceRole: js.UndefOr[EDPServiceRole]
  }

  object RDSMetadata {
    @inline
    def apply(
        DataPipelineId: js.UndefOr[EDPPipelineId] = js.undefined,
        Database: js.UndefOr[RDSDatabase] = js.undefined,
        DatabaseUserName: js.UndefOr[RDSDatabaseUsername] = js.undefined,
        ResourceRole: js.UndefOr[EDPResourceRole] = js.undefined,
        SelectSqlQuery: js.UndefOr[RDSSelectSqlQuery] = js.undefined,
        ServiceRole: js.UndefOr[EDPServiceRole] = js.undefined
    ): RDSMetadata = {
      val __obj = js.Dynamic.literal()
      DataPipelineId.foreach(__v => __obj.updateDynamic("DataPipelineId")(__v.asInstanceOf[js.Any]))
      Database.foreach(__v => __obj.updateDynamic("Database")(__v.asInstanceOf[js.Any]))
      DatabaseUserName.foreach(__v => __obj.updateDynamic("DatabaseUserName")(__v.asInstanceOf[js.Any]))
      ResourceRole.foreach(__v => __obj.updateDynamic("ResourceRole")(__v.asInstanceOf[js.Any]))
      SelectSqlQuery.foreach(__v => __obj.updateDynamic("SelectSqlQuery")(__v.asInstanceOf[js.Any]))
      ServiceRole.foreach(__v => __obj.updateDynamic("ServiceRole")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RDSMetadata]
    }
  }

  /**
    * Describes the real-time endpoint information for an <code>MLModel</code>.
    */
  @js.native
  trait RealtimeEndpointInfo extends js.Object {
    var CreatedAt: js.UndefOr[EpochTime]
    var EndpointStatus: js.UndefOr[RealtimeEndpointStatus]
    var EndpointUrl: js.UndefOr[VipURL]
    var PeakRequestsPerSecond: js.UndefOr[IntegerType]
  }

  object RealtimeEndpointInfo {
    @inline
    def apply(
        CreatedAt: js.UndefOr[EpochTime] = js.undefined,
        EndpointStatus: js.UndefOr[RealtimeEndpointStatus] = js.undefined,
        EndpointUrl: js.UndefOr[VipURL] = js.undefined,
        PeakRequestsPerSecond: js.UndefOr[IntegerType] = js.undefined
    ): RealtimeEndpointInfo = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      EndpointStatus.foreach(__v => __obj.updateDynamic("EndpointStatus")(__v.asInstanceOf[js.Any]))
      EndpointUrl.foreach(__v => __obj.updateDynamic("EndpointUrl")(__v.asInstanceOf[js.Any]))
      PeakRequestsPerSecond.foreach(__v => __obj.updateDynamic("PeakRequestsPerSecond")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RealtimeEndpointInfo]
    }
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
  trait RedshiftDataSpec extends js.Object {
    var DatabaseCredentials: RedshiftDatabaseCredentials
    var DatabaseInformation: RedshiftDatabase
    var S3StagingLocation: S3Url
    var SelectSqlQuery: RedshiftSelectSqlQuery
    var DataRearrangement: js.UndefOr[DataRearrangement]
    var DataSchema: js.UndefOr[DataSchema]
    var DataSchemaUri: js.UndefOr[S3Url]
  }

  object RedshiftDataSpec {
    @inline
    def apply(
        DatabaseCredentials: RedshiftDatabaseCredentials,
        DatabaseInformation: RedshiftDatabase,
        S3StagingLocation: S3Url,
        SelectSqlQuery: RedshiftSelectSqlQuery,
        DataRearrangement: js.UndefOr[DataRearrangement] = js.undefined,
        DataSchema: js.UndefOr[DataSchema] = js.undefined,
        DataSchemaUri: js.UndefOr[S3Url] = js.undefined
    ): RedshiftDataSpec = {
      val __obj = js.Dynamic.literal(
        "DatabaseCredentials" -> DatabaseCredentials.asInstanceOf[js.Any],
        "DatabaseInformation" -> DatabaseInformation.asInstanceOf[js.Any],
        "S3StagingLocation"   -> S3StagingLocation.asInstanceOf[js.Any],
        "SelectSqlQuery"      -> SelectSqlQuery.asInstanceOf[js.Any]
      )

      DataRearrangement.foreach(__v => __obj.updateDynamic("DataRearrangement")(__v.asInstanceOf[js.Any]))
      DataSchema.foreach(__v => __obj.updateDynamic("DataSchema")(__v.asInstanceOf[js.Any]))
      DataSchemaUri.foreach(__v => __obj.updateDynamic("DataSchemaUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RedshiftDataSpec]
    }
  }

  /**
    * Describes the database details required to connect to an Amazon Redshift database.
    */
  @js.native
  trait RedshiftDatabase extends js.Object {
    var ClusterIdentifier: RedshiftClusterIdentifier
    var DatabaseName: RedshiftDatabaseName
  }

  object RedshiftDatabase {
    @inline
    def apply(
        ClusterIdentifier: RedshiftClusterIdentifier,
        DatabaseName: RedshiftDatabaseName
    ): RedshiftDatabase = {
      val __obj = js.Dynamic.literal(
        "ClusterIdentifier" -> ClusterIdentifier.asInstanceOf[js.Any],
        "DatabaseName"      -> DatabaseName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RedshiftDatabase]
    }
  }

  /**
    * Describes the database credentials for connecting to a database on an Amazon Redshift cluster.
    */
  @js.native
  trait RedshiftDatabaseCredentials extends js.Object {
    var Password: RedshiftDatabasePassword
    var Username: RedshiftDatabaseUsername
  }

  object RedshiftDatabaseCredentials {
    @inline
    def apply(
        Password: RedshiftDatabasePassword,
        Username: RedshiftDatabaseUsername
    ): RedshiftDatabaseCredentials = {
      val __obj = js.Dynamic.literal(
        "Password" -> Password.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RedshiftDatabaseCredentials]
    }
  }

  /**
    * Describes the <code>DataSource</code> details specific to Amazon Redshift.
    */
  @js.native
  trait RedshiftMetadata extends js.Object {
    var DatabaseUserName: js.UndefOr[RedshiftDatabaseUsername]
    var RedshiftDatabase: js.UndefOr[RedshiftDatabase]
    var SelectSqlQuery: js.UndefOr[RedshiftSelectSqlQuery]
  }

  object RedshiftMetadata {
    @inline
    def apply(
        DatabaseUserName: js.UndefOr[RedshiftDatabaseUsername] = js.undefined,
        RedshiftDatabase: js.UndefOr[RedshiftDatabase] = js.undefined,
        SelectSqlQuery: js.UndefOr[RedshiftSelectSqlQuery] = js.undefined
    ): RedshiftMetadata = {
      val __obj = js.Dynamic.literal()
      DatabaseUserName.foreach(__v => __obj.updateDynamic("DatabaseUserName")(__v.asInstanceOf[js.Any]))
      RedshiftDatabase.foreach(__v => __obj.updateDynamic("RedshiftDatabase")(__v.asInstanceOf[js.Any]))
      SelectSqlQuery.foreach(__v => __obj.updateDynamic("SelectSqlQuery")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RedshiftMetadata]
    }
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
  trait S3DataSpec extends js.Object {
    var DataLocationS3: S3Url
    var DataRearrangement: js.UndefOr[DataRearrangement]
    var DataSchema: js.UndefOr[DataSchema]
    var DataSchemaLocationS3: js.UndefOr[S3Url]
  }

  object S3DataSpec {
    @inline
    def apply(
        DataLocationS3: S3Url,
        DataRearrangement: js.UndefOr[DataRearrangement] = js.undefined,
        DataSchema: js.UndefOr[DataSchema] = js.undefined,
        DataSchemaLocationS3: js.UndefOr[S3Url] = js.undefined
    ): S3DataSpec = {
      val __obj = js.Dynamic.literal(
        "DataLocationS3" -> DataLocationS3.asInstanceOf[js.Any]
      )

      DataRearrangement.foreach(__v => __obj.updateDynamic("DataRearrangement")(__v.asInstanceOf[js.Any]))
      DataSchema.foreach(__v => __obj.updateDynamic("DataSchema")(__v.asInstanceOf[js.Any]))
      DataSchemaLocationS3.foreach(__v => __obj.updateDynamic("DataSchemaLocationS3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3DataSpec]
    }
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
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
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
  trait UpdateBatchPredictionInput extends js.Object {
    var BatchPredictionId: EntityId
    var BatchPredictionName: EntityName
  }

  object UpdateBatchPredictionInput {
    @inline
    def apply(
        BatchPredictionId: EntityId,
        BatchPredictionName: EntityName
    ): UpdateBatchPredictionInput = {
      val __obj = js.Dynamic.literal(
        "BatchPredictionId"   -> BatchPredictionId.asInstanceOf[js.Any],
        "BatchPredictionName" -> BatchPredictionName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateBatchPredictionInput]
    }
  }

  /**
    * Represents the output of an <code>UpdateBatchPrediction</code> operation.
    *  You can see the updated content by using the <code>GetBatchPrediction</code> operation.
    */
  @js.native
  trait UpdateBatchPredictionOutput extends js.Object {
    var BatchPredictionId: js.UndefOr[EntityId]
  }

  object UpdateBatchPredictionOutput {
    @inline
    def apply(
        BatchPredictionId: js.UndefOr[EntityId] = js.undefined
    ): UpdateBatchPredictionOutput = {
      val __obj = js.Dynamic.literal()
      BatchPredictionId.foreach(__v => __obj.updateDynamic("BatchPredictionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBatchPredictionOutput]
    }
  }

  @js.native
  trait UpdateDataSourceInput extends js.Object {
    var DataSourceId: EntityId
    var DataSourceName: EntityName
  }

  object UpdateDataSourceInput {
    @inline
    def apply(
        DataSourceId: EntityId,
        DataSourceName: EntityName
    ): UpdateDataSourceInput = {
      val __obj = js.Dynamic.literal(
        "DataSourceId"   -> DataSourceId.asInstanceOf[js.Any],
        "DataSourceName" -> DataSourceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateDataSourceInput]
    }
  }

  /**
    * Represents the output of an <code>UpdateDataSource</code> operation.
    *  You can see the updated content by using the <code>GetBatchPrediction</code> operation.
    */
  @js.native
  trait UpdateDataSourceOutput extends js.Object {
    var DataSourceId: js.UndefOr[EntityId]
  }

  object UpdateDataSourceOutput {
    @inline
    def apply(
        DataSourceId: js.UndefOr[EntityId] = js.undefined
    ): UpdateDataSourceOutput = {
      val __obj = js.Dynamic.literal()
      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataSourceOutput]
    }
  }

  @js.native
  trait UpdateEvaluationInput extends js.Object {
    var EvaluationId: EntityId
    var EvaluationName: EntityName
  }

  object UpdateEvaluationInput {
    @inline
    def apply(
        EvaluationId: EntityId,
        EvaluationName: EntityName
    ): UpdateEvaluationInput = {
      val __obj = js.Dynamic.literal(
        "EvaluationId"   -> EvaluationId.asInstanceOf[js.Any],
        "EvaluationName" -> EvaluationName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateEvaluationInput]
    }
  }

  /**
    * Represents the output of an <code>UpdateEvaluation</code> operation.
    *  You can see the updated content by using the <code>GetEvaluation</code> operation.
    */
  @js.native
  trait UpdateEvaluationOutput extends js.Object {
    var EvaluationId: js.UndefOr[EntityId]
  }

  object UpdateEvaluationOutput {
    @inline
    def apply(
        EvaluationId: js.UndefOr[EntityId] = js.undefined
    ): UpdateEvaluationOutput = {
      val __obj = js.Dynamic.literal()
      EvaluationId.foreach(__v => __obj.updateDynamic("EvaluationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEvaluationOutput]
    }
  }

  @js.native
  trait UpdateMLModelInput extends js.Object {
    var MLModelId: EntityId
    var MLModelName: js.UndefOr[EntityName]
    var ScoreThreshold: js.UndefOr[ScoreThreshold]
  }

  object UpdateMLModelInput {
    @inline
    def apply(
        MLModelId: EntityId,
        MLModelName: js.UndefOr[EntityName] = js.undefined,
        ScoreThreshold: js.UndefOr[ScoreThreshold] = js.undefined
    ): UpdateMLModelInput = {
      val __obj = js.Dynamic.literal(
        "MLModelId" -> MLModelId.asInstanceOf[js.Any]
      )

      MLModelName.foreach(__v => __obj.updateDynamic("MLModelName")(__v.asInstanceOf[js.Any]))
      ScoreThreshold.foreach(__v => __obj.updateDynamic("ScoreThreshold")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMLModelInput]
    }
  }

  /**
    * Represents the output of an <code>UpdateMLModel</code> operation.
    *  You can see the updated content by using the <code>GetMLModel</code> operation.
    */
  @js.native
  trait UpdateMLModelOutput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
  }

  object UpdateMLModelOutput {
    @inline
    def apply(
        MLModelId: js.UndefOr[EntityId] = js.undefined
    ): UpdateMLModelOutput = {
      val __obj = js.Dynamic.literal()
      MLModelId.foreach(__v => __obj.updateDynamic("MLModelId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMLModelOutput]
    }
  }
}
