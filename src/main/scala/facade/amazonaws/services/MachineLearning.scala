package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object machinelearning {
  type Algorithm = String
  type AwsUserArn = String
  type BatchPredictionFilterVariable = String
  type BatchPredictions = js.Array[BatchPrediction]
  type ComparatorValue = String
  type ComputeStatistics = Boolean
  type DataRearrangement = String
  type DataSchema = String
  type DataSourceFilterVariable = String
  type DataSources = js.Array[DataSource]
  type DetailsAttributes = String
  type DetailsMap = js.Dictionary[DetailsValue]
  type DetailsValue = String
  type EDPPipelineId = String
  type EDPResourceRole = String
  type EDPSecurityGroupId = String
  type EDPSecurityGroupIds = js.Array[EDPSecurityGroupId]
  type EDPServiceRole = String
  type EDPSubnetId = String
  type EntityId = String
  type EntityName = String
  type EntityStatus = String
  type EpochTime = js.Date
  type ErrorCode = Int
  type ErrorMessage = String
  type EvaluationFilterVariable = String
  type Evaluations = js.Array[Evaluation]
  type IntegerType = Int
  type Label = String
  type LongType = Double
  type MLModelFilterVariable = String
  type MLModelName = String
  type MLModelType = String
  type MLModels = js.Array[MLModel]
  type Message = String
  type PageLimit = Int
  type PerformanceMetricsProperties = js.Dictionary[PerformanceMetricsPropertyValue]
  type PerformanceMetricsPropertyKey = String
  type PerformanceMetricsPropertyValue = String
  type PresignedS3Url = String
  type RDSDatabaseName = String
  type RDSDatabasePassword = String
  type RDSDatabaseUsername = String
  type RDSInstanceIdentifier = String
  type RDSSelectSqlQuery = String
  type RealtimeEndpointStatus = String
  type Recipe = String
  type Record = js.Dictionary[VariableValue]
  type RedshiftClusterIdentifier = String
  type RedshiftDatabaseName = String
  type RedshiftDatabasePassword = String
  type RedshiftDatabaseUsername = String
  type RedshiftSelectSqlQuery = String
  type RoleARN = String
  type S3Url = String
  type ScoreThreshold = Float
  type ScoreValue = Float
  type ScoreValuePerLabelMap = js.Dictionary[ScoreValue]
  type SortOrder = String
  type StringType = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TaggableResourceType = String
  type TrainingParameters = js.Dictionary[StringType]
  type VariableName = String
  type VariableValue = String
  type Verbose = Boolean
  type VipURL = String
  type floatLabel = Float
}

package machinelearning {
  @js.native
  @JSImport("aws-sdk", "MachineLearning")
  class MachineLearning(config: AWSConfig) extends js.Object {
    def addTags(params: AddTagsInput): Request[AddTagsOutput] = js.native
    def createBatchPrediction(params: CreateBatchPredictionInput): Request[CreateBatchPredictionOutput] = js.native
    def createDataSourceFromRDS(params: CreateDataSourceFromRDSInput): Request[CreateDataSourceFromRDSOutput] = js.native
    def createDataSourceFromRedshift(params: CreateDataSourceFromRedshiftInput): Request[CreateDataSourceFromRedshiftOutput] = js.native
    def createDataSourceFromS3(params: CreateDataSourceFromS3Input): Request[CreateDataSourceFromS3Output] = js.native
    def createEvaluation(params: CreateEvaluationInput): Request[CreateEvaluationOutput] = js.native
    def createMLModel(params: CreateMLModelInput): Request[CreateMLModelOutput] = js.native
    def createRealtimeEndpoint(params: CreateRealtimeEndpointInput): Request[CreateRealtimeEndpointOutput] = js.native
    def deleteBatchPrediction(params: DeleteBatchPredictionInput): Request[DeleteBatchPredictionOutput] = js.native
    def deleteDataSource(params: DeleteDataSourceInput): Request[DeleteDataSourceOutput] = js.native
    def deleteEvaluation(params: DeleteEvaluationInput): Request[DeleteEvaluationOutput] = js.native
    def deleteMLModel(params: DeleteMLModelInput): Request[DeleteMLModelOutput] = js.native
    def deleteRealtimeEndpoint(params: DeleteRealtimeEndpointInput): Request[DeleteRealtimeEndpointOutput] = js.native
    def deleteTags(params: DeleteTagsInput): Request[DeleteTagsOutput] = js.native
    def describeBatchPredictions(params: DescribeBatchPredictionsInput): Request[DescribeBatchPredictionsOutput] = js.native
    def describeDataSources(params: DescribeDataSourcesInput): Request[DescribeDataSourcesOutput] = js.native
    def describeEvaluations(params: DescribeEvaluationsInput): Request[DescribeEvaluationsOutput] = js.native
    def describeMLModels(params: DescribeMLModelsInput): Request[DescribeMLModelsOutput] = js.native
    def describeTags(params: DescribeTagsInput): Request[DescribeTagsOutput] = js.native
    def getBatchPrediction(params: GetBatchPredictionInput): Request[GetBatchPredictionOutput] = js.native
    def getDataSource(params: GetDataSourceInput): Request[GetDataSourceOutput] = js.native
    def getEvaluation(params: GetEvaluationInput): Request[GetEvaluationOutput] = js.native
    def getMLModel(params: GetMLModelInput): Request[GetMLModelOutput] = js.native
    def predict(params: PredictInput): Request[PredictOutput] = js.native
    def updateBatchPrediction(params: UpdateBatchPredictionInput): Request[UpdateBatchPredictionOutput] = js.native
    def updateDataSource(params: UpdateDataSourceInput): Request[UpdateDataSourceOutput] = js.native
    def updateEvaluation(params: UpdateEvaluationInput): Request[UpdateEvaluationOutput] = js.native
    def updateMLModel(params: UpdateMLModelInput): Request[UpdateMLModelOutput] = js.native
  }

  @js.native
  trait AddTagsInput extends js.Object {
    var Tags: js.UndefOr[TagList]
    var ResourceId: js.UndefOr[EntityId]
    var ResourceType: js.UndefOr[TaggableResourceType]
  }

  object AddTagsInput {
    def apply(
      Tags: js.UndefOr[TagList] = js.undefined,
      ResourceId: js.UndefOr[EntityId] = js.undefined,
      ResourceType: js.UndefOr[TaggableResourceType] = js.undefined): AddTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsInput]
    }
  }

  /**
   * <p>Amazon ML returns the following elements. </p>
   */
  @js.native
  trait AddTagsOutput extends js.Object {
    var ResourceId: js.UndefOr[EntityId]
    var ResourceType: js.UndefOr[TaggableResourceType]
  }

  object AddTagsOutput {
    def apply(
      ResourceId: js.UndefOr[EntityId] = js.undefined,
      ResourceType: js.UndefOr[TaggableResourceType] = js.undefined): AddTagsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsOutput]
    }
  }

  /**
   * <p>The function used to train an <code>MLModel</code>. Training choices supported by Amazon ML include the following:</p> <ul> <li> <code>SGD</code> - Stochastic Gradient Descent.</li> <li> <code>RandomForest</code> - Random forest of decision trees.</li> </ul>
   */
  object AlgorithmEnum {
    val sgd = "sgd"

    val values = IndexedSeq(sgd)
  }

  /**
   * <p> Represents the output of a <code>GetBatchPrediction</code> operation.</p> <p> The content consists of the detailed metadata, the status, and the data file information of a <code>Batch Prediction</code>.</p>
   */
  @js.native
  trait BatchPrediction extends js.Object {
    var LastUpdatedAt: js.UndefOr[EpochTime]
    var Name: js.UndefOr[EntityName]
    var ComputeTime: js.UndefOr[LongType]
    var StartedAt: js.UndefOr[EpochTime]
    var BatchPredictionDataSourceId: js.UndefOr[EntityId]
    var BatchPredictionId: js.UndefOr[EntityId]
    var TotalRecordCount: js.UndefOr[LongType]
    var CreatedByIamUser: js.UndefOr[AwsUserArn]
    var InvalidRecordCount: js.UndefOr[LongType]
    var InputDataLocationS3: js.UndefOr[S3Url]
    var OutputUri: js.UndefOr[S3Url]
    var Message: js.UndefOr[Message]
    var CreatedAt: js.UndefOr[EpochTime]
    var FinishedAt: js.UndefOr[EpochTime]
    var MLModelId: js.UndefOr[EntityId]
    var Status: js.UndefOr[EntityStatus]
  }

  object BatchPrediction {
    def apply(
      LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
      Name: js.UndefOr[EntityName] = js.undefined,
      ComputeTime: js.UndefOr[LongType] = js.undefined,
      StartedAt: js.UndefOr[EpochTime] = js.undefined,
      BatchPredictionDataSourceId: js.UndefOr[EntityId] = js.undefined,
      BatchPredictionId: js.UndefOr[EntityId] = js.undefined,
      TotalRecordCount: js.UndefOr[LongType] = js.undefined,
      CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
      InvalidRecordCount: js.UndefOr[LongType] = js.undefined,
      InputDataLocationS3: js.UndefOr[S3Url] = js.undefined,
      OutputUri: js.UndefOr[S3Url] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined,
      CreatedAt: js.UndefOr[EpochTime] = js.undefined,
      FinishedAt: js.UndefOr[EpochTime] = js.undefined,
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      Status: js.UndefOr[EntityStatus] = js.undefined): BatchPrediction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastUpdatedAt" -> LastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ComputeTime" -> ComputeTime.map { x => x.asInstanceOf[js.Any] },
        "StartedAt" -> StartedAt.map { x => x.asInstanceOf[js.Any] },
        "BatchPredictionDataSourceId" -> BatchPredictionDataSourceId.map { x => x.asInstanceOf[js.Any] },
        "BatchPredictionId" -> BatchPredictionId.map { x => x.asInstanceOf[js.Any] },
        "TotalRecordCount" -> TotalRecordCount.map { x => x.asInstanceOf[js.Any] },
        "CreatedByIamUser" -> CreatedByIamUser.map { x => x.asInstanceOf[js.Any] },
        "InvalidRecordCount" -> InvalidRecordCount.map { x => x.asInstanceOf[js.Any] },
        "InputDataLocationS3" -> InputDataLocationS3.map { x => x.asInstanceOf[js.Any] },
        "OutputUri" -> OutputUri.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "FinishedAt" -> FinishedAt.map { x => x.asInstanceOf[js.Any] },
        "MLModelId" -> MLModelId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchPrediction]
    }
  }

  /**
   * <p>A list of the variables to use in searching or filtering <code>BatchPrediction</code>.</p> <ul> <li> <code>CreatedAt</code> - Sets the search criteria to <code>BatchPrediction</code> creation date.</li> <li> <code>Status</code> - Sets the search criteria to <code>BatchPrediction</code> status.</li> <li> <code>Name</code> - Sets the search criteria to the contents of <code>BatchPrediction</code><b> </b> <code>Name</code>.</li> <li> <code>IAMUser</code> - Sets the search criteria to the user account that invoked the <code>BatchPrediction</code> creation.</li> <li> <code>MLModelId</code> - Sets the search criteria to the <code>MLModel</code> used in the <code>BatchPrediction</code>.</li> <li> <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in the <code>BatchPrediction</code>.</li> <li> <code>DataURI</code> - Sets the search criteria to the data file(s) used in the <code>BatchPrediction</code>. The URL can identify either a file or an Amazon Simple Storage Service (Amazon S3) bucket or directory.</li> </ul>
   */
  object BatchPredictionFilterVariableEnum {
    val CreatedAt = "CreatedAt"
    val LastUpdatedAt = "LastUpdatedAt"
    val Status = "Status"
    val Name = "Name"
    val IAMUser = "IAMUser"
    val MLModelId = "MLModelId"
    val DataSourceId = "DataSourceId"
    val DataURI = "DataURI"

    val values = IndexedSeq(CreatedAt, LastUpdatedAt, Status, Name, IAMUser, MLModelId, DataSourceId, DataURI)
  }

  @js.native
  trait CreateBatchPredictionInput extends js.Object {
    var BatchPredictionDataSourceId: js.UndefOr[EntityId]
    var BatchPredictionId: js.UndefOr[EntityId]
    var BatchPredictionName: js.UndefOr[EntityName]
    var OutputUri: js.UndefOr[S3Url]
    var MLModelId: js.UndefOr[EntityId]
  }

  object CreateBatchPredictionInput {
    def apply(
      BatchPredictionDataSourceId: js.UndefOr[EntityId] = js.undefined,
      BatchPredictionId: js.UndefOr[EntityId] = js.undefined,
      BatchPredictionName: js.UndefOr[EntityName] = js.undefined,
      OutputUri: js.UndefOr[S3Url] = js.undefined,
      MLModelId: js.UndefOr[EntityId] = js.undefined): CreateBatchPredictionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BatchPredictionDataSourceId" -> BatchPredictionDataSourceId.map { x => x.asInstanceOf[js.Any] },
        "BatchPredictionId" -> BatchPredictionId.map { x => x.asInstanceOf[js.Any] },
        "BatchPredictionName" -> BatchPredictionName.map { x => x.asInstanceOf[js.Any] },
        "OutputUri" -> OutputUri.map { x => x.asInstanceOf[js.Any] },
        "MLModelId" -> MLModelId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBatchPredictionInput]
    }
  }

  /**
   * <p> Represents the output of a <code>CreateBatchPrediction</code> operation, and is an acknowledgement that Amazon ML received the request.</p> <p>The <code>CreateBatchPrediction</code> operation is asynchronous. You can poll for status updates by using the <code>&gt;GetBatchPrediction</code> operation and checking the <code>Status</code> parameter of the result. </p>
   */
  @js.native
  trait CreateBatchPredictionOutput extends js.Object {
    var BatchPredictionId: js.UndefOr[EntityId]
  }

  object CreateBatchPredictionOutput {
    def apply(
      BatchPredictionId: js.UndefOr[EntityId] = js.undefined): CreateBatchPredictionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BatchPredictionId" -> BatchPredictionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBatchPredictionOutput]
    }
  }

  @js.native
  trait CreateDataSourceFromRDSInput extends js.Object {
    var ComputeStatistics: js.UndefOr[ComputeStatistics]
    var RoleARN: js.UndefOr[RoleARN]
    var RDSData: js.UndefOr[RDSDataSpec]
    var DataSourceId: js.UndefOr[EntityId]
    var DataSourceName: js.UndefOr[EntityName]
  }

  object CreateDataSourceFromRDSInput {
    def apply(
      ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      RDSData: js.UndefOr[RDSDataSpec] = js.undefined,
      DataSourceId: js.UndefOr[EntityId] = js.undefined,
      DataSourceName: js.UndefOr[EntityName] = js.undefined): CreateDataSourceFromRDSInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComputeStatistics" -> ComputeStatistics.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "RDSData" -> RDSData.map { x => x.asInstanceOf[js.Any] },
        "DataSourceId" -> DataSourceId.map { x => x.asInstanceOf[js.Any] },
        "DataSourceName" -> DataSourceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDataSourceFromRDSInput]
    }
  }

  /**
   * <p> Represents the output of a <code>CreateDataSourceFromRDS</code> operation, and is an acknowledgement that Amazon ML received the request.</p> <p>The <code>CreateDataSourceFromRDS</code>&gt; operation is asynchronous. You can poll for updates by using the <code>GetBatchPrediction</code> operation and checking the <code>Status</code> parameter. You can inspect the <code>Message</code> when <code>Status</code> shows up as <code>FAILED</code>. You can also check the progress of the copy operation by going to the <code>DataPipeline</code> console and looking up the pipeline using the <code>pipelineId </code> from the describe call.</p>
   */
  @js.native
  trait CreateDataSourceFromRDSOutput extends js.Object {
    var DataSourceId: js.UndefOr[EntityId]
  }

  object CreateDataSourceFromRDSOutput {
    def apply(
      DataSourceId: js.UndefOr[EntityId] = js.undefined): CreateDataSourceFromRDSOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataSourceId" -> DataSourceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDataSourceFromRDSOutput]
    }
  }

  @js.native
  trait CreateDataSourceFromRedshiftInput extends js.Object {
    var ComputeStatistics: js.UndefOr[ComputeStatistics]
    var DataSpec: js.UndefOr[RedshiftDataSpec]
    var RoleARN: js.UndefOr[RoleARN]
    var DataSourceId: js.UndefOr[EntityId]
    var DataSourceName: js.UndefOr[EntityName]
  }

  object CreateDataSourceFromRedshiftInput {
    def apply(
      ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined,
      DataSpec: js.UndefOr[RedshiftDataSpec] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      DataSourceId: js.UndefOr[EntityId] = js.undefined,
      DataSourceName: js.UndefOr[EntityName] = js.undefined): CreateDataSourceFromRedshiftInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComputeStatistics" -> ComputeStatistics.map { x => x.asInstanceOf[js.Any] },
        "DataSpec" -> DataSpec.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "DataSourceId" -> DataSourceId.map { x => x.asInstanceOf[js.Any] },
        "DataSourceName" -> DataSourceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDataSourceFromRedshiftInput]
    }
  }

  /**
   * <p> Represents the output of a <code>CreateDataSourceFromRedshift</code> operation, and is an acknowledgement that Amazon ML received the request.</p> <p>The <code>CreateDataSourceFromRedshift</code> operation is asynchronous. You can poll for updates by using the <code>GetBatchPrediction</code> operation and checking the <code>Status</code> parameter. </p>
   */
  @js.native
  trait CreateDataSourceFromRedshiftOutput extends js.Object {
    var DataSourceId: js.UndefOr[EntityId]
  }

  object CreateDataSourceFromRedshiftOutput {
    def apply(
      DataSourceId: js.UndefOr[EntityId] = js.undefined): CreateDataSourceFromRedshiftOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataSourceId" -> DataSourceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDataSourceFromRedshiftOutput]
    }
  }

  @js.native
  trait CreateDataSourceFromS3Input extends js.Object {
    var DataSourceId: js.UndefOr[EntityId]
    var DataSourceName: js.UndefOr[EntityName]
    var DataSpec: js.UndefOr[S3DataSpec]
    var ComputeStatistics: js.UndefOr[ComputeStatistics]
  }

  object CreateDataSourceFromS3Input {
    def apply(
      DataSourceId: js.UndefOr[EntityId] = js.undefined,
      DataSourceName: js.UndefOr[EntityName] = js.undefined,
      DataSpec: js.UndefOr[S3DataSpec] = js.undefined,
      ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined): CreateDataSourceFromS3Input = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataSourceId" -> DataSourceId.map { x => x.asInstanceOf[js.Any] },
        "DataSourceName" -> DataSourceName.map { x => x.asInstanceOf[js.Any] },
        "DataSpec" -> DataSpec.map { x => x.asInstanceOf[js.Any] },
        "ComputeStatistics" -> ComputeStatistics.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDataSourceFromS3Input]
    }
  }

  /**
   * <p> Represents the output of a <code>CreateDataSourceFromS3</code> operation, and is an acknowledgement that Amazon ML received the request.</p> <p>The <code>CreateDataSourceFromS3</code> operation is asynchronous. You can poll for updates by using the <code>GetBatchPrediction</code> operation and checking the <code>Status</code> parameter. </p>
   */
  @js.native
  trait CreateDataSourceFromS3Output extends js.Object {
    var DataSourceId: js.UndefOr[EntityId]
  }

  object CreateDataSourceFromS3Output {
    def apply(
      DataSourceId: js.UndefOr[EntityId] = js.undefined): CreateDataSourceFromS3Output = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataSourceId" -> DataSourceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDataSourceFromS3Output]
    }
  }

  @js.native
  trait CreateEvaluationInput extends js.Object {
    var EvaluationId: js.UndefOr[EntityId]
    var EvaluationName: js.UndefOr[EntityName]
    var MLModelId: js.UndefOr[EntityId]
    var EvaluationDataSourceId: js.UndefOr[EntityId]
  }

  object CreateEvaluationInput {
    def apply(
      EvaluationId: js.UndefOr[EntityId] = js.undefined,
      EvaluationName: js.UndefOr[EntityName] = js.undefined,
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      EvaluationDataSourceId: js.UndefOr[EntityId] = js.undefined): CreateEvaluationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EvaluationId" -> EvaluationId.map { x => x.asInstanceOf[js.Any] },
        "EvaluationName" -> EvaluationName.map { x => x.asInstanceOf[js.Any] },
        "MLModelId" -> MLModelId.map { x => x.asInstanceOf[js.Any] },
        "EvaluationDataSourceId" -> EvaluationDataSourceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEvaluationInput]
    }
  }

  /**
   * <p> Represents the output of a <code>CreateEvaluation</code> operation, and is an acknowledgement that Amazon ML received the request.</p> <p><code>CreateEvaluation</code> operation is asynchronous. You can poll for status updates by using the <code>GetEvcaluation</code> operation and checking the <code>Status</code> parameter. </p>
   */
  @js.native
  trait CreateEvaluationOutput extends js.Object {
    var EvaluationId: js.UndefOr[EntityId]
  }

  object CreateEvaluationOutput {
    def apply(
      EvaluationId: js.UndefOr[EntityId] = js.undefined): CreateEvaluationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EvaluationId" -> EvaluationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEvaluationOutput]
    }
  }

  @js.native
  trait CreateMLModelInput extends js.Object {
    var TrainingDataSourceId: js.UndefOr[EntityId]
    var RecipeUri: js.UndefOr[S3Url]
    var Parameters: js.UndefOr[TrainingParameters]
    var MLModelName: js.UndefOr[EntityName]
    var MLModelType: js.UndefOr[MLModelType]
    var Recipe: js.UndefOr[Recipe]
    var MLModelId: js.UndefOr[EntityId]
  }

  object CreateMLModelInput {
    def apply(
      TrainingDataSourceId: js.UndefOr[EntityId] = js.undefined,
      RecipeUri: js.UndefOr[S3Url] = js.undefined,
      Parameters: js.UndefOr[TrainingParameters] = js.undefined,
      MLModelName: js.UndefOr[EntityName] = js.undefined,
      MLModelType: js.UndefOr[MLModelType] = js.undefined,
      Recipe: js.UndefOr[Recipe] = js.undefined,
      MLModelId: js.UndefOr[EntityId] = js.undefined): CreateMLModelInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrainingDataSourceId" -> TrainingDataSourceId.map { x => x.asInstanceOf[js.Any] },
        "RecipeUri" -> RecipeUri.map { x => x.asInstanceOf[js.Any] },
        "Parameters" -> Parameters.map { x => x.asInstanceOf[js.Any] },
        "MLModelName" -> MLModelName.map { x => x.asInstanceOf[js.Any] },
        "MLModelType" -> MLModelType.map { x => x.asInstanceOf[js.Any] },
        "Recipe" -> Recipe.map { x => x.asInstanceOf[js.Any] },
        "MLModelId" -> MLModelId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMLModelInput]
    }
  }

  /**
   * <p> Represents the output of a <code>CreateMLModel</code> operation, and is an acknowledgement that Amazon ML received the request.</p> <p>The <code>CreateMLModel</code> operation is asynchronous. You can poll for status updates by using the <code>GetMLModel</code> operation and checking the <code>Status</code> parameter. </p>
   */
  @js.native
  trait CreateMLModelOutput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
  }

  object CreateMLModelOutput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined): CreateMLModelOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MLModelId" -> MLModelId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMLModelOutput]
    }
  }

  @js.native
  trait CreateRealtimeEndpointInput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
  }

  object CreateRealtimeEndpointInput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined): CreateRealtimeEndpointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MLModelId" -> MLModelId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRealtimeEndpointInput]
    }
  }

  /**
   * <p>Represents the output of an <code>CreateRealtimeEndpoint</code> operation.</p> <p>The result contains the <code>MLModelId</code> and the endpoint information for the <code>MLModel</code>.</p> <note> <p>The endpoint information includes the URI of the <code>MLModel</code>; that is, the location to send online prediction requests for the specified <code>MLModel</code>.</p> </note>
   */
  @js.native
  trait CreateRealtimeEndpointOutput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
    var RealtimeEndpointInfo: js.UndefOr[RealtimeEndpointInfo]
  }

  object CreateRealtimeEndpointOutput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      RealtimeEndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.undefined): CreateRealtimeEndpointOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MLModelId" -> MLModelId.map { x => x.asInstanceOf[js.Any] },
        "RealtimeEndpointInfo" -> RealtimeEndpointInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRealtimeEndpointOutput]
    }
  }

  /**
   * <p> Represents the output of the <code>GetDataSource</code> operation. </p> <p> The content consists of the detailed metadata and data file information and the current status of the <code>DataSource</code>. </p>
   */
  @js.native
  trait DataSource extends js.Object {
    var RedshiftMetadata: js.UndefOr[RedshiftMetadata]
    var LastUpdatedAt: js.UndefOr[EpochTime]
    var Name: js.UndefOr[EntityName]
    var RDSMetadata: js.UndefOr[RDSMetadata]
    var ComputeTime: js.UndefOr[LongType]
    var ComputeStatistics: js.UndefOr[ComputeStatistics]
    var StartedAt: js.UndefOr[EpochTime]
    var DataSizeInBytes: js.UndefOr[LongType]
    var NumberOfFiles: js.UndefOr[LongType]
    var CreatedByIamUser: js.UndefOr[AwsUserArn]
    var RoleARN: js.UndefOr[RoleARN]
    var DataRearrangement: js.UndefOr[DataRearrangement]
    var Message: js.UndefOr[Message]
    var CreatedAt: js.UndefOr[EpochTime]
    var DataSourceId: js.UndefOr[EntityId]
    var FinishedAt: js.UndefOr[EpochTime]
    var DataLocationS3: js.UndefOr[S3Url]
    var Status: js.UndefOr[EntityStatus]
  }

  object DataSource {
    def apply(
      RedshiftMetadata: js.UndefOr[RedshiftMetadata] = js.undefined,
      LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
      Name: js.UndefOr[EntityName] = js.undefined,
      RDSMetadata: js.UndefOr[RDSMetadata] = js.undefined,
      ComputeTime: js.UndefOr[LongType] = js.undefined,
      ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined,
      StartedAt: js.UndefOr[EpochTime] = js.undefined,
      DataSizeInBytes: js.UndefOr[LongType] = js.undefined,
      NumberOfFiles: js.UndefOr[LongType] = js.undefined,
      CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      DataRearrangement: js.UndefOr[DataRearrangement] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined,
      CreatedAt: js.UndefOr[EpochTime] = js.undefined,
      DataSourceId: js.UndefOr[EntityId] = js.undefined,
      FinishedAt: js.UndefOr[EpochTime] = js.undefined,
      DataLocationS3: js.UndefOr[S3Url] = js.undefined,
      Status: js.UndefOr[EntityStatus] = js.undefined): DataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RedshiftMetadata" -> RedshiftMetadata.map { x => x.asInstanceOf[js.Any] },
        "LastUpdatedAt" -> LastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RDSMetadata" -> RDSMetadata.map { x => x.asInstanceOf[js.Any] },
        "ComputeTime" -> ComputeTime.map { x => x.asInstanceOf[js.Any] },
        "ComputeStatistics" -> ComputeStatistics.map { x => x.asInstanceOf[js.Any] },
        "StartedAt" -> StartedAt.map { x => x.asInstanceOf[js.Any] },
        "DataSizeInBytes" -> DataSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "NumberOfFiles" -> NumberOfFiles.map { x => x.asInstanceOf[js.Any] },
        "CreatedByIamUser" -> CreatedByIamUser.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "DataRearrangement" -> DataRearrangement.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "DataSourceId" -> DataSourceId.map { x => x.asInstanceOf[js.Any] },
        "FinishedAt" -> FinishedAt.map { x => x.asInstanceOf[js.Any] },
        "DataLocationS3" -> DataLocationS3.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataSource]
    }
  }

  /**
   * <p>A list of the variables to use in searching or filtering <code>DataSource</code>.</p> <ul> <li> <code>CreatedAt</code> - Sets the search criteria to <code>DataSource</code> creation date.</li> <li> <code>Status</code> - Sets the search criteria to <code>DataSource</code> status.</li> <li> <code>Name</code> - Sets the search criteria to the contents of <code>DataSource</code> <b> </b> <code>Name</code>.</li> <li> <code>DataUri</code> - Sets the search criteria to the URI of data files used to create the <code>DataSource</code>. The URI can identify either a file or an Amazon Simple Storage Service (Amazon S3) bucket or directory.</li> <li> <code>IAMUser</code> - Sets the search criteria to the user account that invoked the <code>DataSource</code> creation.</li> </ul> <note><title>Note</title> <p>The variable names should match the variable names in the <code>DataSource</code>.</p> </note>
   */
  object DataSourceFilterVariableEnum {
    val CreatedAt = "CreatedAt"
    val LastUpdatedAt = "LastUpdatedAt"
    val Status = "Status"
    val Name = "Name"
    val DataLocationS3 = "DataLocationS3"
    val IAMUser = "IAMUser"

    val values = IndexedSeq(CreatedAt, LastUpdatedAt, Status, Name, DataLocationS3, IAMUser)
  }

  @js.native
  trait DeleteBatchPredictionInput extends js.Object {
    var BatchPredictionId: js.UndefOr[EntityId]
  }

  object DeleteBatchPredictionInput {
    def apply(
      BatchPredictionId: js.UndefOr[EntityId] = js.undefined): DeleteBatchPredictionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BatchPredictionId" -> BatchPredictionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBatchPredictionInput]
    }
  }

  /**
   * <p> Represents the output of a <code>DeleteBatchPrediction</code> operation.</p> <p>You can use the <code>GetBatchPrediction</code> operation and check the value of the <code>Status</code> parameter to see whether a <code>BatchPrediction</code> is marked as <code>DELETED</code>.</p>
   */
  @js.native
  trait DeleteBatchPredictionOutput extends js.Object {
    var BatchPredictionId: js.UndefOr[EntityId]
  }

  object DeleteBatchPredictionOutput {
    def apply(
      BatchPredictionId: js.UndefOr[EntityId] = js.undefined): DeleteBatchPredictionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BatchPredictionId" -> BatchPredictionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBatchPredictionOutput]
    }
  }

  @js.native
  trait DeleteDataSourceInput extends js.Object {
    var DataSourceId: js.UndefOr[EntityId]
  }

  object DeleteDataSourceInput {
    def apply(
      DataSourceId: js.UndefOr[EntityId] = js.undefined): DeleteDataSourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataSourceId" -> DataSourceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDataSourceInput]
    }
  }

  /**
   * <p> Represents the output of a <code>DeleteDataSource</code> operation.</p>
   */
  @js.native
  trait DeleteDataSourceOutput extends js.Object {
    var DataSourceId: js.UndefOr[EntityId]
  }

  object DeleteDataSourceOutput {
    def apply(
      DataSourceId: js.UndefOr[EntityId] = js.undefined): DeleteDataSourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataSourceId" -> DataSourceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDataSourceOutput]
    }
  }

  @js.native
  trait DeleteEvaluationInput extends js.Object {
    var EvaluationId: js.UndefOr[EntityId]
  }

  object DeleteEvaluationInput {
    def apply(
      EvaluationId: js.UndefOr[EntityId] = js.undefined): DeleteEvaluationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EvaluationId" -> EvaluationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEvaluationInput]
    }
  }

  /**
   * <p> Represents the output of a <code>DeleteEvaluation</code> operation. The output indicates that Amazon Machine Learning (Amazon ML) received the request.</p> <p>You can use the <code>GetEvaluation</code> operation and check the value of the <code>Status</code> parameter to see whether an <code>Evaluation</code> is marked as <code>DELETED</code>.</p>
   */
  @js.native
  trait DeleteEvaluationOutput extends js.Object {
    var EvaluationId: js.UndefOr[EntityId]
  }

  object DeleteEvaluationOutput {
    def apply(
      EvaluationId: js.UndefOr[EntityId] = js.undefined): DeleteEvaluationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EvaluationId" -> EvaluationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEvaluationOutput]
    }
  }

  @js.native
  trait DeleteMLModelInput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
  }

  object DeleteMLModelInput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined): DeleteMLModelInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MLModelId" -> MLModelId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMLModelInput]
    }
  }

  /**
   * <p>Represents the output of a <code>DeleteMLModel</code> operation.</p> <p>You can use the <code>GetMLModel</code> operation and check the value of the <code>Status</code> parameter to see whether an <code>MLModel</code> is marked as <code>DELETED</code>.</p>
   */
  @js.native
  trait DeleteMLModelOutput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
  }

  object DeleteMLModelOutput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined): DeleteMLModelOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MLModelId" -> MLModelId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMLModelOutput]
    }
  }

  @js.native
  trait DeleteRealtimeEndpointInput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
  }

  object DeleteRealtimeEndpointInput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined): DeleteRealtimeEndpointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MLModelId" -> MLModelId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRealtimeEndpointInput]
    }
  }

  /**
   * <p>Represents the output of an <code>DeleteRealtimeEndpoint</code> operation.</p> <p>The result contains the <code>MLModelId</code> and the endpoint information for the <code>MLModel</code>. </p>
   */
  @js.native
  trait DeleteRealtimeEndpointOutput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
    var RealtimeEndpointInfo: js.UndefOr[RealtimeEndpointInfo]
  }

  object DeleteRealtimeEndpointOutput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      RealtimeEndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.undefined): DeleteRealtimeEndpointOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MLModelId" -> MLModelId.map { x => x.asInstanceOf[js.Any] },
        "RealtimeEndpointInfo" -> RealtimeEndpointInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRealtimeEndpointOutput]
    }
  }

  @js.native
  trait DeleteTagsInput extends js.Object {
    var TagKeys: js.UndefOr[TagKeyList]
    var ResourceId: js.UndefOr[EntityId]
    var ResourceType: js.UndefOr[TaggableResourceType]
  }

  object DeleteTagsInput {
    def apply(
      TagKeys: js.UndefOr[TagKeyList] = js.undefined,
      ResourceId: js.UndefOr[EntityId] = js.undefined,
      ResourceType: js.UndefOr[TaggableResourceType] = js.undefined): DeleteTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsInput]
    }
  }

  /**
   * <p>Amazon ML returns the following elements. </p>
   */
  @js.native
  trait DeleteTagsOutput extends js.Object {
    var ResourceId: js.UndefOr[EntityId]
    var ResourceType: js.UndefOr[TaggableResourceType]
  }

  object DeleteTagsOutput {
    def apply(
      ResourceId: js.UndefOr[EntityId] = js.undefined,
      ResourceType: js.UndefOr[TaggableResourceType] = js.undefined): DeleteTagsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsOutput]
    }
  }

  @js.native
  trait DescribeBatchPredictionsInput extends js.Object {
    var FilterVariable: js.UndefOr[BatchPredictionFilterVariable]
    var Limit: js.UndefOr[PageLimit]
    var GT: js.UndefOr[ComparatorValue]
    var NE: js.UndefOr[ComparatorValue]
    var LT: js.UndefOr[ComparatorValue]
    var SortOrder: js.UndefOr[SortOrder]
    var EQ: js.UndefOr[ComparatorValue]
    var LE: js.UndefOr[ComparatorValue]
    var Prefix: js.UndefOr[ComparatorValue]
    var NextToken: js.UndefOr[StringType]
    var GE: js.UndefOr[ComparatorValue]
  }

  object DescribeBatchPredictionsInput {
    def apply(
      FilterVariable: js.UndefOr[BatchPredictionFilterVariable] = js.undefined,
      Limit: js.UndefOr[PageLimit] = js.undefined,
      GT: js.UndefOr[ComparatorValue] = js.undefined,
      NE: js.UndefOr[ComparatorValue] = js.undefined,
      LT: js.UndefOr[ComparatorValue] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined,
      EQ: js.UndefOr[ComparatorValue] = js.undefined,
      LE: js.UndefOr[ComparatorValue] = js.undefined,
      Prefix: js.UndefOr[ComparatorValue] = js.undefined,
      NextToken: js.UndefOr[StringType] = js.undefined,
      GE: js.UndefOr[ComparatorValue] = js.undefined): DescribeBatchPredictionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FilterVariable" -> FilterVariable.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "GT" -> GT.map { x => x.asInstanceOf[js.Any] },
        "NE" -> NE.map { x => x.asInstanceOf[js.Any] },
        "LT" -> LT.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "EQ" -> EQ.map { x => x.asInstanceOf[js.Any] },
        "LE" -> LE.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "GE" -> GE.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBatchPredictionsInput]
    }
  }

  /**
   * <p>Represents the output of a <code>DescribeBatchPredictions</code> operation. The content is essentially a list of <code>BatchPrediction</code>s.</p>
   */
  @js.native
  trait DescribeBatchPredictionsOutput extends js.Object {
    var Results: js.UndefOr[BatchPredictions]
    var NextToken: js.UndefOr[StringType]
  }

  object DescribeBatchPredictionsOutput {
    def apply(
      Results: js.UndefOr[BatchPredictions] = js.undefined,
      NextToken: js.UndefOr[StringType] = js.undefined): DescribeBatchPredictionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Results" -> Results.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBatchPredictionsOutput]
    }
  }

  @js.native
  trait DescribeDataSourcesInput extends js.Object {
    var FilterVariable: js.UndefOr[DataSourceFilterVariable]
    var Limit: js.UndefOr[PageLimit]
    var GT: js.UndefOr[ComparatorValue]
    var NE: js.UndefOr[ComparatorValue]
    var LT: js.UndefOr[ComparatorValue]
    var SortOrder: js.UndefOr[SortOrder]
    var EQ: js.UndefOr[ComparatorValue]
    var LE: js.UndefOr[ComparatorValue]
    var Prefix: js.UndefOr[ComparatorValue]
    var NextToken: js.UndefOr[StringType]
    var GE: js.UndefOr[ComparatorValue]
  }

  object DescribeDataSourcesInput {
    def apply(
      FilterVariable: js.UndefOr[DataSourceFilterVariable] = js.undefined,
      Limit: js.UndefOr[PageLimit] = js.undefined,
      GT: js.UndefOr[ComparatorValue] = js.undefined,
      NE: js.UndefOr[ComparatorValue] = js.undefined,
      LT: js.UndefOr[ComparatorValue] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined,
      EQ: js.UndefOr[ComparatorValue] = js.undefined,
      LE: js.UndefOr[ComparatorValue] = js.undefined,
      Prefix: js.UndefOr[ComparatorValue] = js.undefined,
      NextToken: js.UndefOr[StringType] = js.undefined,
      GE: js.UndefOr[ComparatorValue] = js.undefined): DescribeDataSourcesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FilterVariable" -> FilterVariable.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "GT" -> GT.map { x => x.asInstanceOf[js.Any] },
        "NE" -> NE.map { x => x.asInstanceOf[js.Any] },
        "LT" -> LT.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "EQ" -> EQ.map { x => x.asInstanceOf[js.Any] },
        "LE" -> LE.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "GE" -> GE.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDataSourcesInput]
    }
  }

  /**
   * <p>Represents the query results from a <a>DescribeDataSources</a> operation. The content is essentially a list of <code>DataSource</code>.</p>
   */
  @js.native
  trait DescribeDataSourcesOutput extends js.Object {
    var Results: js.UndefOr[DataSources]
    var NextToken: js.UndefOr[StringType]
  }

  object DescribeDataSourcesOutput {
    def apply(
      Results: js.UndefOr[DataSources] = js.undefined,
      NextToken: js.UndefOr[StringType] = js.undefined): DescribeDataSourcesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Results" -> Results.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDataSourcesOutput]
    }
  }

  @js.native
  trait DescribeEvaluationsInput extends js.Object {
    var FilterVariable: js.UndefOr[EvaluationFilterVariable]
    var Limit: js.UndefOr[PageLimit]
    var GT: js.UndefOr[ComparatorValue]
    var NE: js.UndefOr[ComparatorValue]
    var LT: js.UndefOr[ComparatorValue]
    var SortOrder: js.UndefOr[SortOrder]
    var EQ: js.UndefOr[ComparatorValue]
    var LE: js.UndefOr[ComparatorValue]
    var Prefix: js.UndefOr[ComparatorValue]
    var NextToken: js.UndefOr[StringType]
    var GE: js.UndefOr[ComparatorValue]
  }

  object DescribeEvaluationsInput {
    def apply(
      FilterVariable: js.UndefOr[EvaluationFilterVariable] = js.undefined,
      Limit: js.UndefOr[PageLimit] = js.undefined,
      GT: js.UndefOr[ComparatorValue] = js.undefined,
      NE: js.UndefOr[ComparatorValue] = js.undefined,
      LT: js.UndefOr[ComparatorValue] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined,
      EQ: js.UndefOr[ComparatorValue] = js.undefined,
      LE: js.UndefOr[ComparatorValue] = js.undefined,
      Prefix: js.UndefOr[ComparatorValue] = js.undefined,
      NextToken: js.UndefOr[StringType] = js.undefined,
      GE: js.UndefOr[ComparatorValue] = js.undefined): DescribeEvaluationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FilterVariable" -> FilterVariable.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "GT" -> GT.map { x => x.asInstanceOf[js.Any] },
        "NE" -> NE.map { x => x.asInstanceOf[js.Any] },
        "LT" -> LT.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "EQ" -> EQ.map { x => x.asInstanceOf[js.Any] },
        "LE" -> LE.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "GE" -> GE.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEvaluationsInput]
    }
  }

  /**
   * <p>Represents the query results from a <code>DescribeEvaluations</code> operation. The content is essentially a list of <code>Evaluation</code>.</p>
   */
  @js.native
  trait DescribeEvaluationsOutput extends js.Object {
    var Results: js.UndefOr[Evaluations]
    var NextToken: js.UndefOr[StringType]
  }

  object DescribeEvaluationsOutput {
    def apply(
      Results: js.UndefOr[Evaluations] = js.undefined,
      NextToken: js.UndefOr[StringType] = js.undefined): DescribeEvaluationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Results" -> Results.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEvaluationsOutput]
    }
  }

  @js.native
  trait DescribeMLModelsInput extends js.Object {
    var FilterVariable: js.UndefOr[MLModelFilterVariable]
    var Limit: js.UndefOr[PageLimit]
    var GT: js.UndefOr[ComparatorValue]
    var NE: js.UndefOr[ComparatorValue]
    var LT: js.UndefOr[ComparatorValue]
    var SortOrder: js.UndefOr[SortOrder]
    var EQ: js.UndefOr[ComparatorValue]
    var LE: js.UndefOr[ComparatorValue]
    var Prefix: js.UndefOr[ComparatorValue]
    var NextToken: js.UndefOr[StringType]
    var GE: js.UndefOr[ComparatorValue]
  }

  object DescribeMLModelsInput {
    def apply(
      FilterVariable: js.UndefOr[MLModelFilterVariable] = js.undefined,
      Limit: js.UndefOr[PageLimit] = js.undefined,
      GT: js.UndefOr[ComparatorValue] = js.undefined,
      NE: js.UndefOr[ComparatorValue] = js.undefined,
      LT: js.UndefOr[ComparatorValue] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined,
      EQ: js.UndefOr[ComparatorValue] = js.undefined,
      LE: js.UndefOr[ComparatorValue] = js.undefined,
      Prefix: js.UndefOr[ComparatorValue] = js.undefined,
      NextToken: js.UndefOr[StringType] = js.undefined,
      GE: js.UndefOr[ComparatorValue] = js.undefined): DescribeMLModelsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FilterVariable" -> FilterVariable.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "GT" -> GT.map { x => x.asInstanceOf[js.Any] },
        "NE" -> NE.map { x => x.asInstanceOf[js.Any] },
        "LT" -> LT.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] },
        "EQ" -> EQ.map { x => x.asInstanceOf[js.Any] },
        "LE" -> LE.map { x => x.asInstanceOf[js.Any] },
        "Prefix" -> Prefix.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "GE" -> GE.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMLModelsInput]
    }
  }

  /**
   * <p>Represents the output of a <code>DescribeMLModels</code> operation. The content is essentially a list of <code>MLModel</code>.</p>
   */
  @js.native
  trait DescribeMLModelsOutput extends js.Object {
    var Results: js.UndefOr[MLModels]
    var NextToken: js.UndefOr[StringType]
  }

  object DescribeMLModelsOutput {
    def apply(
      Results: js.UndefOr[MLModels] = js.undefined,
      NextToken: js.UndefOr[StringType] = js.undefined): DescribeMLModelsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Results" -> Results.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMLModelsOutput]
    }
  }

  @js.native
  trait DescribeTagsInput extends js.Object {
    var ResourceId: js.UndefOr[EntityId]
    var ResourceType: js.UndefOr[TaggableResourceType]
  }

  object DescribeTagsInput {
    def apply(
      ResourceId: js.UndefOr[EntityId] = js.undefined,
      ResourceType: js.UndefOr[TaggableResourceType] = js.undefined): DescribeTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsInput]
    }
  }

  /**
   * <p>Amazon ML returns the following elements. </p>
   */
  @js.native
  trait DescribeTagsOutput extends js.Object {
    var ResourceId: js.UndefOr[EntityId]
    var ResourceType: js.UndefOr[TaggableResourceType]
    var Tags: js.UndefOr[TagList]
  }

  object DescribeTagsOutput {
    def apply(
      ResourceId: js.UndefOr[EntityId] = js.undefined,
      ResourceType: js.UndefOr[TaggableResourceType] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): DescribeTagsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsOutput]
    }
  }

  /**
   * Contains the key values of <code>DetailsMap</code>: <code>PredictiveModelType</code> - Indicates the type of the <code>MLModel</code>. <code>Algorithm</code> - Indicates the algorithm that was used for the <code>MLModel</code>.
   */
  object DetailsAttributesEnum {
    val PredictiveModelType = "PredictiveModelType"
    val Algorithm = "Algorithm"

    val values = IndexedSeq(PredictiveModelType, Algorithm)
  }

  /**
   * <p>Object status with the following possible values:</p> <ul> <li><code>PENDING</code></li> <li><code>INPROGRESS</code></li> <li><code>FAILED</code></li> <li><code>COMPLETED</code></li> <li><code>DELETED</code></li> </ul>
   */
  object EntityStatusEnum {
    val PENDING = "PENDING"
    val INPROGRESS = "INPROGRESS"
    val FAILED = "FAILED"
    val COMPLETED = "COMPLETED"
    val DELETED = "DELETED"

    val values = IndexedSeq(PENDING, INPROGRESS, FAILED, COMPLETED, DELETED)
  }

  /**
   * <p> Represents the output of <code>GetEvaluation</code> operation. </p> <p>The content consists of the detailed metadata and data file information and the current status of the <code>Evaluation</code>.</p>
   */
  @js.native
  trait Evaluation extends js.Object {
    var LastUpdatedAt: js.UndefOr[EpochTime]
    var Name: js.UndefOr[EntityName]
    var PerformanceMetrics: js.UndefOr[PerformanceMetrics]
    var ComputeTime: js.UndefOr[LongType]
    var StartedAt: js.UndefOr[EpochTime]
    var CreatedByIamUser: js.UndefOr[AwsUserArn]
    var EvaluationId: js.UndefOr[EntityId]
    var InputDataLocationS3: js.UndefOr[S3Url]
    var Message: js.UndefOr[Message]
    var CreatedAt: js.UndefOr[EpochTime]
    var FinishedAt: js.UndefOr[EpochTime]
    var MLModelId: js.UndefOr[EntityId]
    var EvaluationDataSourceId: js.UndefOr[EntityId]
    var Status: js.UndefOr[EntityStatus]
  }

  object Evaluation {
    def apply(
      LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
      Name: js.UndefOr[EntityName] = js.undefined,
      PerformanceMetrics: js.UndefOr[PerformanceMetrics] = js.undefined,
      ComputeTime: js.UndefOr[LongType] = js.undefined,
      StartedAt: js.UndefOr[EpochTime] = js.undefined,
      CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
      EvaluationId: js.UndefOr[EntityId] = js.undefined,
      InputDataLocationS3: js.UndefOr[S3Url] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined,
      CreatedAt: js.UndefOr[EpochTime] = js.undefined,
      FinishedAt: js.UndefOr[EpochTime] = js.undefined,
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      EvaluationDataSourceId: js.UndefOr[EntityId] = js.undefined,
      Status: js.UndefOr[EntityStatus] = js.undefined): Evaluation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastUpdatedAt" -> LastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "PerformanceMetrics" -> PerformanceMetrics.map { x => x.asInstanceOf[js.Any] },
        "ComputeTime" -> ComputeTime.map { x => x.asInstanceOf[js.Any] },
        "StartedAt" -> StartedAt.map { x => x.asInstanceOf[js.Any] },
        "CreatedByIamUser" -> CreatedByIamUser.map { x => x.asInstanceOf[js.Any] },
        "EvaluationId" -> EvaluationId.map { x => x.asInstanceOf[js.Any] },
        "InputDataLocationS3" -> InputDataLocationS3.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "FinishedAt" -> FinishedAt.map { x => x.asInstanceOf[js.Any] },
        "MLModelId" -> MLModelId.map { x => x.asInstanceOf[js.Any] },
        "EvaluationDataSourceId" -> EvaluationDataSourceId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Evaluation]
    }
  }

  /**
   * <p>A list of the variables to use in searching or filtering <code>Evaluation</code>.</p> <ul> <li> <code>CreatedAt</code> - Sets the search criteria to <code>Evaluation</code> creation date.</li> <li> <code>Status</code> - Sets the search criteria to <code>Evaluation</code> status.</li> <li> <code>Name</code> - Sets the search criteria to the contents of <code>Evaluation</code> <b> </b> <code>Name</code>.</li> <li> <code>IAMUser</code> - Sets the search criteria to the user account that invoked an evaluation.</li> <li> <code>MLModelId</code> - Sets the search criteria to the <code>Predictor</code> that was evaluated.</li> <li> <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in evaluation.</li> <li> <code>DataUri</code> - Sets the search criteria to the data file(s) used in evaluation. The URL can identify either a file or an Amazon Simple Storage Service (Amazon S3) bucket or directory.</li> </ul>
   */
  object EvaluationFilterVariableEnum {
    val CreatedAt = "CreatedAt"
    val LastUpdatedAt = "LastUpdatedAt"
    val Status = "Status"
    val Name = "Name"
    val IAMUser = "IAMUser"
    val MLModelId = "MLModelId"
    val DataSourceId = "DataSourceId"
    val DataURI = "DataURI"

    val values = IndexedSeq(CreatedAt, LastUpdatedAt, Status, Name, IAMUser, MLModelId, DataSourceId, DataURI)
  }

  @js.native
  trait GetBatchPredictionInput extends js.Object {
    var BatchPredictionId: js.UndefOr[EntityId]
  }

  object GetBatchPredictionInput {
    def apply(
      BatchPredictionId: js.UndefOr[EntityId] = js.undefined): GetBatchPredictionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BatchPredictionId" -> BatchPredictionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBatchPredictionInput]
    }
  }

  /**
   * <p>Represents the output of a <code>GetBatchPrediction</code> operation and describes a <code>BatchPrediction</code>.</p>
   */
  @js.native
  trait GetBatchPredictionOutput extends js.Object {
    var LogUri: js.UndefOr[PresignedS3Url]
    var LastUpdatedAt: js.UndefOr[EpochTime]
    var Name: js.UndefOr[EntityName]
    var ComputeTime: js.UndefOr[LongType]
    var StartedAt: js.UndefOr[EpochTime]
    var BatchPredictionDataSourceId: js.UndefOr[EntityId]
    var BatchPredictionId: js.UndefOr[EntityId]
    var TotalRecordCount: js.UndefOr[LongType]
    var CreatedByIamUser: js.UndefOr[AwsUserArn]
    var InvalidRecordCount: js.UndefOr[LongType]
    var InputDataLocationS3: js.UndefOr[S3Url]
    var OutputUri: js.UndefOr[S3Url]
    var Message: js.UndefOr[Message]
    var CreatedAt: js.UndefOr[EpochTime]
    var FinishedAt: js.UndefOr[EpochTime]
    var MLModelId: js.UndefOr[EntityId]
    var Status: js.UndefOr[EntityStatus]
  }

  object GetBatchPredictionOutput {
    def apply(
      LogUri: js.UndefOr[PresignedS3Url] = js.undefined,
      LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
      Name: js.UndefOr[EntityName] = js.undefined,
      ComputeTime: js.UndefOr[LongType] = js.undefined,
      StartedAt: js.UndefOr[EpochTime] = js.undefined,
      BatchPredictionDataSourceId: js.UndefOr[EntityId] = js.undefined,
      BatchPredictionId: js.UndefOr[EntityId] = js.undefined,
      TotalRecordCount: js.UndefOr[LongType] = js.undefined,
      CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
      InvalidRecordCount: js.UndefOr[LongType] = js.undefined,
      InputDataLocationS3: js.UndefOr[S3Url] = js.undefined,
      OutputUri: js.UndefOr[S3Url] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined,
      CreatedAt: js.UndefOr[EpochTime] = js.undefined,
      FinishedAt: js.UndefOr[EpochTime] = js.undefined,
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      Status: js.UndefOr[EntityStatus] = js.undefined): GetBatchPredictionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogUri" -> LogUri.map { x => x.asInstanceOf[js.Any] },
        "LastUpdatedAt" -> LastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ComputeTime" -> ComputeTime.map { x => x.asInstanceOf[js.Any] },
        "StartedAt" -> StartedAt.map { x => x.asInstanceOf[js.Any] },
        "BatchPredictionDataSourceId" -> BatchPredictionDataSourceId.map { x => x.asInstanceOf[js.Any] },
        "BatchPredictionId" -> BatchPredictionId.map { x => x.asInstanceOf[js.Any] },
        "TotalRecordCount" -> TotalRecordCount.map { x => x.asInstanceOf[js.Any] },
        "CreatedByIamUser" -> CreatedByIamUser.map { x => x.asInstanceOf[js.Any] },
        "InvalidRecordCount" -> InvalidRecordCount.map { x => x.asInstanceOf[js.Any] },
        "InputDataLocationS3" -> InputDataLocationS3.map { x => x.asInstanceOf[js.Any] },
        "OutputUri" -> OutputUri.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "FinishedAt" -> FinishedAt.map { x => x.asInstanceOf[js.Any] },
        "MLModelId" -> MLModelId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBatchPredictionOutput]
    }
  }

  @js.native
  trait GetDataSourceInput extends js.Object {
    var DataSourceId: js.UndefOr[EntityId]
    var Verbose: js.UndefOr[Verbose]
  }

  object GetDataSourceInput {
    def apply(
      DataSourceId: js.UndefOr[EntityId] = js.undefined,
      Verbose: js.UndefOr[Verbose] = js.undefined): GetDataSourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataSourceId" -> DataSourceId.map { x => x.asInstanceOf[js.Any] },
        "Verbose" -> Verbose.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDataSourceInput]
    }
  }

  /**
   * <p>Represents the output of a <code>GetDataSource</code> operation and describes a <code>DataSource</code>.</p>
   */
  @js.native
  trait GetDataSourceOutput extends js.Object {
    var LogUri: js.UndefOr[PresignedS3Url]
    var RedshiftMetadata: js.UndefOr[RedshiftMetadata]
    var LastUpdatedAt: js.UndefOr[EpochTime]
    var Name: js.UndefOr[EntityName]
    var RDSMetadata: js.UndefOr[RDSMetadata]
    var ComputeTime: js.UndefOr[LongType]
    var ComputeStatistics: js.UndefOr[ComputeStatistics]
    var StartedAt: js.UndefOr[EpochTime]
    var DataSizeInBytes: js.UndefOr[LongType]
    var NumberOfFiles: js.UndefOr[LongType]
    var CreatedByIamUser: js.UndefOr[AwsUserArn]
    var RoleARN: js.UndefOr[RoleARN]
    var DataRearrangement: js.UndefOr[DataRearrangement]
    var Message: js.UndefOr[Message]
    var CreatedAt: js.UndefOr[EpochTime]
    var DataSourceId: js.UndefOr[EntityId]
    var DataSourceSchema: js.UndefOr[DataSchema]
    var FinishedAt: js.UndefOr[EpochTime]
    var DataLocationS3: js.UndefOr[S3Url]
    var Status: js.UndefOr[EntityStatus]
  }

  object GetDataSourceOutput {
    def apply(
      LogUri: js.UndefOr[PresignedS3Url] = js.undefined,
      RedshiftMetadata: js.UndefOr[RedshiftMetadata] = js.undefined,
      LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
      Name: js.UndefOr[EntityName] = js.undefined,
      RDSMetadata: js.UndefOr[RDSMetadata] = js.undefined,
      ComputeTime: js.UndefOr[LongType] = js.undefined,
      ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined,
      StartedAt: js.UndefOr[EpochTime] = js.undefined,
      DataSizeInBytes: js.UndefOr[LongType] = js.undefined,
      NumberOfFiles: js.UndefOr[LongType] = js.undefined,
      CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      DataRearrangement: js.UndefOr[DataRearrangement] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined,
      CreatedAt: js.UndefOr[EpochTime] = js.undefined,
      DataSourceId: js.UndefOr[EntityId] = js.undefined,
      DataSourceSchema: js.UndefOr[DataSchema] = js.undefined,
      FinishedAt: js.UndefOr[EpochTime] = js.undefined,
      DataLocationS3: js.UndefOr[S3Url] = js.undefined,
      Status: js.UndefOr[EntityStatus] = js.undefined): GetDataSourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogUri" -> LogUri.map { x => x.asInstanceOf[js.Any] },
        "RedshiftMetadata" -> RedshiftMetadata.map { x => x.asInstanceOf[js.Any] },
        "LastUpdatedAt" -> LastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RDSMetadata" -> RDSMetadata.map { x => x.asInstanceOf[js.Any] },
        "ComputeTime" -> ComputeTime.map { x => x.asInstanceOf[js.Any] },
        "ComputeStatistics" -> ComputeStatistics.map { x => x.asInstanceOf[js.Any] },
        "StartedAt" -> StartedAt.map { x => x.asInstanceOf[js.Any] },
        "DataSizeInBytes" -> DataSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "NumberOfFiles" -> NumberOfFiles.map { x => x.asInstanceOf[js.Any] },
        "CreatedByIamUser" -> CreatedByIamUser.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "DataRearrangement" -> DataRearrangement.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "DataSourceId" -> DataSourceId.map { x => x.asInstanceOf[js.Any] },
        "DataSourceSchema" -> DataSourceSchema.map { x => x.asInstanceOf[js.Any] },
        "FinishedAt" -> FinishedAt.map { x => x.asInstanceOf[js.Any] },
        "DataLocationS3" -> DataLocationS3.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDataSourceOutput]
    }
  }

  @js.native
  trait GetEvaluationInput extends js.Object {
    var EvaluationId: js.UndefOr[EntityId]
  }

  object GetEvaluationInput {
    def apply(
      EvaluationId: js.UndefOr[EntityId] = js.undefined): GetEvaluationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EvaluationId" -> EvaluationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEvaluationInput]
    }
  }

  /**
   * <p>Represents the output of a <code>GetEvaluation</code> operation and describes an <code>Evaluation</code>.</p>
   */
  @js.native
  trait GetEvaluationOutput extends js.Object {
    var LogUri: js.UndefOr[PresignedS3Url]
    var LastUpdatedAt: js.UndefOr[EpochTime]
    var Name: js.UndefOr[EntityName]
    var PerformanceMetrics: js.UndefOr[PerformanceMetrics]
    var ComputeTime: js.UndefOr[LongType]
    var StartedAt: js.UndefOr[EpochTime]
    var CreatedByIamUser: js.UndefOr[AwsUserArn]
    var EvaluationId: js.UndefOr[EntityId]
    var InputDataLocationS3: js.UndefOr[S3Url]
    var Message: js.UndefOr[Message]
    var CreatedAt: js.UndefOr[EpochTime]
    var FinishedAt: js.UndefOr[EpochTime]
    var MLModelId: js.UndefOr[EntityId]
    var EvaluationDataSourceId: js.UndefOr[EntityId]
    var Status: js.UndefOr[EntityStatus]
  }

  object GetEvaluationOutput {
    def apply(
      LogUri: js.UndefOr[PresignedS3Url] = js.undefined,
      LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
      Name: js.UndefOr[EntityName] = js.undefined,
      PerformanceMetrics: js.UndefOr[PerformanceMetrics] = js.undefined,
      ComputeTime: js.UndefOr[LongType] = js.undefined,
      StartedAt: js.UndefOr[EpochTime] = js.undefined,
      CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
      EvaluationId: js.UndefOr[EntityId] = js.undefined,
      InputDataLocationS3: js.UndefOr[S3Url] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined,
      CreatedAt: js.UndefOr[EpochTime] = js.undefined,
      FinishedAt: js.UndefOr[EpochTime] = js.undefined,
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      EvaluationDataSourceId: js.UndefOr[EntityId] = js.undefined,
      Status: js.UndefOr[EntityStatus] = js.undefined): GetEvaluationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogUri" -> LogUri.map { x => x.asInstanceOf[js.Any] },
        "LastUpdatedAt" -> LastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "PerformanceMetrics" -> PerformanceMetrics.map { x => x.asInstanceOf[js.Any] },
        "ComputeTime" -> ComputeTime.map { x => x.asInstanceOf[js.Any] },
        "StartedAt" -> StartedAt.map { x => x.asInstanceOf[js.Any] },
        "CreatedByIamUser" -> CreatedByIamUser.map { x => x.asInstanceOf[js.Any] },
        "EvaluationId" -> EvaluationId.map { x => x.asInstanceOf[js.Any] },
        "InputDataLocationS3" -> InputDataLocationS3.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "FinishedAt" -> FinishedAt.map { x => x.asInstanceOf[js.Any] },
        "MLModelId" -> MLModelId.map { x => x.asInstanceOf[js.Any] },
        "EvaluationDataSourceId" -> EvaluationDataSourceId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEvaluationOutput]
    }
  }

  @js.native
  trait GetMLModelInput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
    var Verbose: js.UndefOr[Verbose]
  }

  object GetMLModelInput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      Verbose: js.UndefOr[Verbose] = js.undefined): GetMLModelInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MLModelId" -> MLModelId.map { x => x.asInstanceOf[js.Any] },
        "Verbose" -> Verbose.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMLModelInput]
    }
  }

  /**
   * <p>Represents the output of a <code>GetMLModel</code> operation, and provides detailed information about a <code>MLModel</code>.</p>
   */
  @js.native
  trait GetMLModelOutput extends js.Object {
    var LogUri: js.UndefOr[PresignedS3Url]
    var LastUpdatedAt: js.UndefOr[EpochTime]
    var EndpointInfo: js.UndefOr[RealtimeEndpointInfo]
    var Name: js.UndefOr[MLModelName]
    var TrainingDataSourceId: js.UndefOr[EntityId]
    var ComputeTime: js.UndefOr[LongType]
    var StartedAt: js.UndefOr[EpochTime]
    var TrainingParameters: js.UndefOr[TrainingParameters]
    var CreatedByIamUser: js.UndefOr[AwsUserArn]
    var InputDataLocationS3: js.UndefOr[S3Url]
    var SizeInBytes: js.UndefOr[LongType]
    var MLModelType: js.UndefOr[MLModelType]
    var ScoreThreshold: js.UndefOr[ScoreThreshold]
    var Recipe: js.UndefOr[Recipe]
    var Message: js.UndefOr[Message]
    var CreatedAt: js.UndefOr[EpochTime]
    var Schema: js.UndefOr[DataSchema]
    var ScoreThresholdLastUpdatedAt: js.UndefOr[EpochTime]
    var FinishedAt: js.UndefOr[EpochTime]
    var MLModelId: js.UndefOr[EntityId]
    var Status: js.UndefOr[EntityStatus]
  }

  object GetMLModelOutput {
    def apply(
      LogUri: js.UndefOr[PresignedS3Url] = js.undefined,
      LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
      EndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.undefined,
      Name: js.UndefOr[MLModelName] = js.undefined,
      TrainingDataSourceId: js.UndefOr[EntityId] = js.undefined,
      ComputeTime: js.UndefOr[LongType] = js.undefined,
      StartedAt: js.UndefOr[EpochTime] = js.undefined,
      TrainingParameters: js.UndefOr[TrainingParameters] = js.undefined,
      CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
      InputDataLocationS3: js.UndefOr[S3Url] = js.undefined,
      SizeInBytes: js.UndefOr[LongType] = js.undefined,
      MLModelType: js.UndefOr[MLModelType] = js.undefined,
      ScoreThreshold: js.UndefOr[ScoreThreshold] = js.undefined,
      Recipe: js.UndefOr[Recipe] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined,
      CreatedAt: js.UndefOr[EpochTime] = js.undefined,
      Schema: js.UndefOr[DataSchema] = js.undefined,
      ScoreThresholdLastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
      FinishedAt: js.UndefOr[EpochTime] = js.undefined,
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      Status: js.UndefOr[EntityStatus] = js.undefined): GetMLModelOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LogUri" -> LogUri.map { x => x.asInstanceOf[js.Any] },
        "LastUpdatedAt" -> LastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "EndpointInfo" -> EndpointInfo.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "TrainingDataSourceId" -> TrainingDataSourceId.map { x => x.asInstanceOf[js.Any] },
        "ComputeTime" -> ComputeTime.map { x => x.asInstanceOf[js.Any] },
        "StartedAt" -> StartedAt.map { x => x.asInstanceOf[js.Any] },
        "TrainingParameters" -> TrainingParameters.map { x => x.asInstanceOf[js.Any] },
        "CreatedByIamUser" -> CreatedByIamUser.map { x => x.asInstanceOf[js.Any] },
        "InputDataLocationS3" -> InputDataLocationS3.map { x => x.asInstanceOf[js.Any] },
        "SizeInBytes" -> SizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "MLModelType" -> MLModelType.map { x => x.asInstanceOf[js.Any] },
        "ScoreThreshold" -> ScoreThreshold.map { x => x.asInstanceOf[js.Any] },
        "Recipe" -> Recipe.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "Schema" -> Schema.map { x => x.asInstanceOf[js.Any] },
        "ScoreThresholdLastUpdatedAt" -> ScoreThresholdLastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "FinishedAt" -> FinishedAt.map { x => x.asInstanceOf[js.Any] },
        "MLModelId" -> MLModelId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMLModelOutput]
    }
  }

  /**
   * <p>A second request to use or change an object was not allowed. This can result from retrying a request using a parameter that was not present in the original request.</p>
   */
  @js.native
  trait IdempotentParameterMismatchExceptionException extends js.Object {
    val message: ErrorMessage
    val code: ErrorCode
  }

  /**
   * <p>An error on the server occurred when trying to process a request.</p>
   */
  @js.native
  trait InternalServerExceptionException extends js.Object {
    val message: ErrorMessage
    val code: ErrorCode
  }

  /**
   * <p>An error on the client occurred. Typically, the cause is an invalid input value.</p>
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
   * <p>The subscriber exceeded the maximum number of operations. This exception can occur when listing objects such as <code>DataSource</code>.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val message: ErrorMessage
    val code: ErrorCode
  }

  /**
   * <p> Represents the output of a <code>GetMLModel</code> operation. </p> <p>The content consists of the detailed metadata and the current status of the <code>MLModel</code>.</p>
   */
  @js.native
  trait MLModel extends js.Object {
    var LastUpdatedAt: js.UndefOr[EpochTime]
    var EndpointInfo: js.UndefOr[RealtimeEndpointInfo]
    var Name: js.UndefOr[MLModelName]
    var TrainingDataSourceId: js.UndefOr[EntityId]
    var ComputeTime: js.UndefOr[LongType]
    var StartedAt: js.UndefOr[EpochTime]
    var TrainingParameters: js.UndefOr[TrainingParameters]
    var CreatedByIamUser: js.UndefOr[AwsUserArn]
    var InputDataLocationS3: js.UndefOr[S3Url]
    var SizeInBytes: js.UndefOr[LongType]
    var MLModelType: js.UndefOr[MLModelType]
    var ScoreThreshold: js.UndefOr[ScoreThreshold]
    var Message: js.UndefOr[Message]
    var CreatedAt: js.UndefOr[EpochTime]
    var Algorithm: js.UndefOr[Algorithm]
    var ScoreThresholdLastUpdatedAt: js.UndefOr[EpochTime]
    var FinishedAt: js.UndefOr[EpochTime]
    var MLModelId: js.UndefOr[EntityId]
    var Status: js.UndefOr[EntityStatus]
  }

  object MLModel {
    def apply(
      LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
      EndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.undefined,
      Name: js.UndefOr[MLModelName] = js.undefined,
      TrainingDataSourceId: js.UndefOr[EntityId] = js.undefined,
      ComputeTime: js.UndefOr[LongType] = js.undefined,
      StartedAt: js.UndefOr[EpochTime] = js.undefined,
      TrainingParameters: js.UndefOr[TrainingParameters] = js.undefined,
      CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
      InputDataLocationS3: js.UndefOr[S3Url] = js.undefined,
      SizeInBytes: js.UndefOr[LongType] = js.undefined,
      MLModelType: js.UndefOr[MLModelType] = js.undefined,
      ScoreThreshold: js.UndefOr[ScoreThreshold] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined,
      CreatedAt: js.UndefOr[EpochTime] = js.undefined,
      Algorithm: js.UndefOr[Algorithm] = js.undefined,
      ScoreThresholdLastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
      FinishedAt: js.UndefOr[EpochTime] = js.undefined,
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      Status: js.UndefOr[EntityStatus] = js.undefined): MLModel = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastUpdatedAt" -> LastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "EndpointInfo" -> EndpointInfo.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "TrainingDataSourceId" -> TrainingDataSourceId.map { x => x.asInstanceOf[js.Any] },
        "ComputeTime" -> ComputeTime.map { x => x.asInstanceOf[js.Any] },
        "StartedAt" -> StartedAt.map { x => x.asInstanceOf[js.Any] },
        "TrainingParameters" -> TrainingParameters.map { x => x.asInstanceOf[js.Any] },
        "CreatedByIamUser" -> CreatedByIamUser.map { x => x.asInstanceOf[js.Any] },
        "InputDataLocationS3" -> InputDataLocationS3.map { x => x.asInstanceOf[js.Any] },
        "SizeInBytes" -> SizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "MLModelType" -> MLModelType.map { x => x.asInstanceOf[js.Any] },
        "ScoreThreshold" -> ScoreThreshold.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "Algorithm" -> Algorithm.map { x => x.asInstanceOf[js.Any] },
        "ScoreThresholdLastUpdatedAt" -> ScoreThresholdLastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "FinishedAt" -> FinishedAt.map { x => x.asInstanceOf[js.Any] },
        "MLModelId" -> MLModelId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MLModel]
    }
  }

  object MLModelFilterVariableEnum {
    val CreatedAt = "CreatedAt"
    val LastUpdatedAt = "LastUpdatedAt"
    val Status = "Status"
    val Name = "Name"
    val IAMUser = "IAMUser"
    val TrainingDataSourceId = "TrainingDataSourceId"
    val RealtimeEndpointStatus = "RealtimeEndpointStatus"
    val MLModelType = "MLModelType"
    val Algorithm = "Algorithm"
    val TrainingDataURI = "TrainingDataURI"

    val values = IndexedSeq(CreatedAt, LastUpdatedAt, Status, Name, IAMUser, TrainingDataSourceId, RealtimeEndpointStatus, MLModelType, Algorithm, TrainingDataURI)
  }

  object MLModelTypeEnum {
    val REGRESSION = "REGRESSION"
    val BINARY = "BINARY"
    val MULTICLASS = "MULTICLASS"

    val values = IndexedSeq(REGRESSION, BINARY, MULTICLASS)
  }

  /**
   * <p>Measurements of how well the <code>MLModel</code> performed on known observations. One of the following metrics is returned, based on the type of the <code>MLModel</code>: </p> <ul> <li> <p>BinaryAUC: The binary <code>MLModel</code> uses the Area Under the Curve (AUC) technique to measure performance. </p> </li> <li> <p>RegressionRMSE: The regression <code>MLModel</code> uses the Root Mean Square Error (RMSE) technique to measure performance. RMSE measures the difference between predicted and actual values for a single variable.</p> </li> <li> <p>MulticlassAvgFScore: The multiclass <code>MLModel</code> uses the F1 score technique to measure performance. </p> </li> </ul> <p> For more information about performance metrics, please see the <a href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine Learning Developer Guide</a>. </p>
   */
  @js.native
  trait PerformanceMetrics extends js.Object {
    var Properties: js.UndefOr[PerformanceMetricsProperties]
  }

  object PerformanceMetrics {
    def apply(
      Properties: js.UndefOr[PerformanceMetricsProperties] = js.undefined): PerformanceMetrics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Properties" -> Properties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PerformanceMetrics]
    }
  }

  @js.native
  trait PredictInput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
    var Record: js.UndefOr[Record]
    var PredictEndpoint: js.UndefOr[VipURL]
  }

  object PredictInput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      Record: js.UndefOr[Record] = js.undefined,
      PredictEndpoint: js.UndefOr[VipURL] = js.undefined): PredictInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MLModelId" -> MLModelId.map { x => x.asInstanceOf[js.Any] },
        "Record" -> Record.map { x => x.asInstanceOf[js.Any] },
        "PredictEndpoint" -> PredictEndpoint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PredictInput]
    }
  }

  @js.native
  trait PredictOutput extends js.Object {
    var Prediction: js.UndefOr[Prediction]
  }

  object PredictOutput {
    def apply(
      Prediction: js.UndefOr[Prediction] = js.undefined): PredictOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Prediction" -> Prediction.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PredictOutput]
    }
  }

  /**
   * <p>The output from a <code>Predict</code> operation: </p> <ul> <li> <p> <code>Details</code> - Contains the following attributes: <code>DetailsAttributes.PREDICTIVE_MODEL_TYPE - REGRESSION | BINARY | MULTICLASS</code> <code>DetailsAttributes.ALGORITHM - SGD</code> </p> </li> <li> <p> <code>PredictedLabel</code> - Present for either a <code>BINARY</code> or <code>MULTICLASS</code> <code>MLModel</code> request. </p> </li> <li> <p> <code>PredictedScores</code> - Contains the raw classification score corresponding to each label. </p> </li> <li> <p> <code>PredictedValue</code> - Present for a <code>REGRESSION</code> <code>MLModel</code> request. </p> </li> </ul>
   */
  @js.native
  trait Prediction extends js.Object {
    var predictedLabel: js.UndefOr[Label]
    var predictedValue: js.UndefOr[floatLabel]
    var predictedScores: js.UndefOr[ScoreValuePerLabelMap]
    var details: js.UndefOr[DetailsMap]
  }

  object Prediction {
    def apply(
      predictedLabel: js.UndefOr[Label] = js.undefined,
      predictedValue: js.UndefOr[floatLabel] = js.undefined,
      predictedScores: js.UndefOr[ScoreValuePerLabelMap] = js.undefined,
      details: js.UndefOr[DetailsMap] = js.undefined): Prediction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "predictedLabel" -> predictedLabel.map { x => x.asInstanceOf[js.Any] },
        "predictedValue" -> predictedValue.map { x => x.asInstanceOf[js.Any] },
        "predictedScores" -> predictedScores.map { x => x.asInstanceOf[js.Any] },
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Prediction]
    }
  }

  /**
   * <p>The exception is thrown when a predict request is made to an unmounted <code>MLModel</code>.</p>
   */
  @js.native
  trait PredictorNotMountedExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>The data specification of an Amazon Relational Database Service (Amazon RDS) <code>DataSource</code>.</p>
   */
  @js.native
  trait RDSDataSpec extends js.Object {
    var DatabaseCredentials: js.UndefOr[RDSDatabaseCredentials]
    var ResourceRole: js.UndefOr[EDPResourceRole]
    var ServiceRole: js.UndefOr[EDPServiceRole]
    var DataSchemaUri: js.UndefOr[S3Url]
    var SelectSqlQuery: js.UndefOr[RDSSelectSqlQuery]
    var SecurityGroupIds: js.UndefOr[EDPSecurityGroupIds]
    var DatabaseInformation: js.UndefOr[RDSDatabase]
    var S3StagingLocation: js.UndefOr[S3Url]
    var DataRearrangement: js.UndefOr[DataRearrangement]
    var DataSchema: js.UndefOr[DataSchema]
    var SubnetId: js.UndefOr[EDPSubnetId]
  }

  object RDSDataSpec {
    def apply(
      DatabaseCredentials: js.UndefOr[RDSDatabaseCredentials] = js.undefined,
      ResourceRole: js.UndefOr[EDPResourceRole] = js.undefined,
      ServiceRole: js.UndefOr[EDPServiceRole] = js.undefined,
      DataSchemaUri: js.UndefOr[S3Url] = js.undefined,
      SelectSqlQuery: js.UndefOr[RDSSelectSqlQuery] = js.undefined,
      SecurityGroupIds: js.UndefOr[EDPSecurityGroupIds] = js.undefined,
      DatabaseInformation: js.UndefOr[RDSDatabase] = js.undefined,
      S3StagingLocation: js.UndefOr[S3Url] = js.undefined,
      DataRearrangement: js.UndefOr[DataRearrangement] = js.undefined,
      DataSchema: js.UndefOr[DataSchema] = js.undefined,
      SubnetId: js.UndefOr[EDPSubnetId] = js.undefined): RDSDataSpec = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseCredentials" -> DatabaseCredentials.map { x => x.asInstanceOf[js.Any] },
        "ResourceRole" -> ResourceRole.map { x => x.asInstanceOf[js.Any] },
        "ServiceRole" -> ServiceRole.map { x => x.asInstanceOf[js.Any] },
        "DataSchemaUri" -> DataSchemaUri.map { x => x.asInstanceOf[js.Any] },
        "SelectSqlQuery" -> SelectSqlQuery.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "DatabaseInformation" -> DatabaseInformation.map { x => x.asInstanceOf[js.Any] },
        "S3StagingLocation" -> S3StagingLocation.map { x => x.asInstanceOf[js.Any] },
        "DataRearrangement" -> DataRearrangement.map { x => x.asInstanceOf[js.Any] },
        "DataSchema" -> DataSchema.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RDSDataSpec]
    }
  }

  /**
   * <p>The database details of an Amazon RDS database.</p>
   */
  @js.native
  trait RDSDatabase extends js.Object {
    var InstanceIdentifier: js.UndefOr[RDSInstanceIdentifier]
    var DatabaseName: js.UndefOr[RDSDatabaseName]
  }

  object RDSDatabase {
    def apply(
      InstanceIdentifier: js.UndefOr[RDSInstanceIdentifier] = js.undefined,
      DatabaseName: js.UndefOr[RDSDatabaseName] = js.undefined): RDSDatabase = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceIdentifier" -> InstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "DatabaseName" -> DatabaseName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RDSDatabase]
    }
  }

  /**
   * <p>The database credentials to connect to a database on an RDS DB instance.</p>
   */
  @js.native
  trait RDSDatabaseCredentials extends js.Object {
    var Username: js.UndefOr[RDSDatabaseUsername]
    var Password: js.UndefOr[RDSDatabasePassword]
  }

  object RDSDatabaseCredentials {
    def apply(
      Username: js.UndefOr[RDSDatabaseUsername] = js.undefined,
      Password: js.UndefOr[RDSDatabasePassword] = js.undefined): RDSDatabaseCredentials = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RDSDatabaseCredentials]
    }
  }

  /**
   * <p>The datasource details that are specific to Amazon RDS.</p>
   */
  @js.native
  trait RDSMetadata extends js.Object {
    var DatabaseUserName: js.UndefOr[RDSDatabaseUsername]
    var ResourceRole: js.UndefOr[EDPResourceRole]
    var ServiceRole: js.UndefOr[EDPServiceRole]
    var Database: js.UndefOr[RDSDatabase]
    var SelectSqlQuery: js.UndefOr[RDSSelectSqlQuery]
    var DataPipelineId: js.UndefOr[EDPPipelineId]
  }

  object RDSMetadata {
    def apply(
      DatabaseUserName: js.UndefOr[RDSDatabaseUsername] = js.undefined,
      ResourceRole: js.UndefOr[EDPResourceRole] = js.undefined,
      ServiceRole: js.UndefOr[EDPServiceRole] = js.undefined,
      Database: js.UndefOr[RDSDatabase] = js.undefined,
      SelectSqlQuery: js.UndefOr[RDSSelectSqlQuery] = js.undefined,
      DataPipelineId: js.UndefOr[EDPPipelineId] = js.undefined): RDSMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseUserName" -> DatabaseUserName.map { x => x.asInstanceOf[js.Any] },
        "ResourceRole" -> ResourceRole.map { x => x.asInstanceOf[js.Any] },
        "ServiceRole" -> ServiceRole.map { x => x.asInstanceOf[js.Any] },
        "Database" -> Database.map { x => x.asInstanceOf[js.Any] },
        "SelectSqlQuery" -> SelectSqlQuery.map { x => x.asInstanceOf[js.Any] },
        "DataPipelineId" -> DataPipelineId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RDSMetadata]
    }
  }

  /**
   * <p> Describes the real-time endpoint information for an <code>MLModel</code>.</p>
   */
  @js.native
  trait RealtimeEndpointInfo extends js.Object {
    var PeakRequestsPerSecond: js.UndefOr[IntegerType]
    var CreatedAt: js.UndefOr[EpochTime]
    var EndpointUrl: js.UndefOr[VipURL]
    var EndpointStatus: js.UndefOr[RealtimeEndpointStatus]
  }

  object RealtimeEndpointInfo {
    def apply(
      PeakRequestsPerSecond: js.UndefOr[IntegerType] = js.undefined,
      CreatedAt: js.UndefOr[EpochTime] = js.undefined,
      EndpointUrl: js.UndefOr[VipURL] = js.undefined,
      EndpointStatus: js.UndefOr[RealtimeEndpointStatus] = js.undefined): RealtimeEndpointInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PeakRequestsPerSecond" -> PeakRequestsPerSecond.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "EndpointUrl" -> EndpointUrl.map { x => x.asInstanceOf[js.Any] },
        "EndpointStatus" -> EndpointStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RealtimeEndpointInfo]
    }
  }

  object RealtimeEndpointStatusEnum {
    val NONE = "NONE"
    val READY = "READY"
    val UPDATING = "UPDATING"
    val FAILED = "FAILED"

    val values = IndexedSeq(NONE, READY, UPDATING, FAILED)
  }

  /**
   * <p>Describes the data specification of an Amazon Redshift <code>DataSource</code>.</p>
   */
  @js.native
  trait RedshiftDataSpec extends js.Object {
    var DatabaseCredentials: js.UndefOr[RedshiftDatabaseCredentials]
    var DataSchemaUri: js.UndefOr[S3Url]
    var SelectSqlQuery: js.UndefOr[RedshiftSelectSqlQuery]
    var DatabaseInformation: js.UndefOr[RedshiftDatabase]
    var S3StagingLocation: js.UndefOr[S3Url]
    var DataRearrangement: js.UndefOr[DataRearrangement]
    var DataSchema: js.UndefOr[DataSchema]
  }

  object RedshiftDataSpec {
    def apply(
      DatabaseCredentials: js.UndefOr[RedshiftDatabaseCredentials] = js.undefined,
      DataSchemaUri: js.UndefOr[S3Url] = js.undefined,
      SelectSqlQuery: js.UndefOr[RedshiftSelectSqlQuery] = js.undefined,
      DatabaseInformation: js.UndefOr[RedshiftDatabase] = js.undefined,
      S3StagingLocation: js.UndefOr[S3Url] = js.undefined,
      DataRearrangement: js.UndefOr[DataRearrangement] = js.undefined,
      DataSchema: js.UndefOr[DataSchema] = js.undefined): RedshiftDataSpec = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseCredentials" -> DatabaseCredentials.map { x => x.asInstanceOf[js.Any] },
        "DataSchemaUri" -> DataSchemaUri.map { x => x.asInstanceOf[js.Any] },
        "SelectSqlQuery" -> SelectSqlQuery.map { x => x.asInstanceOf[js.Any] },
        "DatabaseInformation" -> DatabaseInformation.map { x => x.asInstanceOf[js.Any] },
        "S3StagingLocation" -> S3StagingLocation.map { x => x.asInstanceOf[js.Any] },
        "DataRearrangement" -> DataRearrangement.map { x => x.asInstanceOf[js.Any] },
        "DataSchema" -> DataSchema.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RedshiftDataSpec]
    }
  }

  /**
   * <p>Describes the database details required to connect to an Amazon Redshift database.</p>
   */
  @js.native
  trait RedshiftDatabase extends js.Object {
    var DatabaseName: js.UndefOr[RedshiftDatabaseName]
    var ClusterIdentifier: js.UndefOr[RedshiftClusterIdentifier]
  }

  object RedshiftDatabase {
    def apply(
      DatabaseName: js.UndefOr[RedshiftDatabaseName] = js.undefined,
      ClusterIdentifier: js.UndefOr[RedshiftClusterIdentifier] = js.undefined): RedshiftDatabase = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DatabaseName" -> DatabaseName.map { x => x.asInstanceOf[js.Any] },
        "ClusterIdentifier" -> ClusterIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RedshiftDatabase]
    }
  }

  /**
   * <p> Describes the database credentials for connecting to a database on an Amazon Redshift cluster.</p>
   */
  @js.native
  trait RedshiftDatabaseCredentials extends js.Object {
    var Username: js.UndefOr[RedshiftDatabaseUsername]
    var Password: js.UndefOr[RedshiftDatabasePassword]
  }

  object RedshiftDatabaseCredentials {
    def apply(
      Username: js.UndefOr[RedshiftDatabaseUsername] = js.undefined,
      Password: js.UndefOr[RedshiftDatabasePassword] = js.undefined): RedshiftDatabaseCredentials = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RedshiftDatabaseCredentials]
    }
  }

  /**
   * <p>Describes the <code>DataSource</code> details specific to Amazon Redshift.</p>
   */
  @js.native
  trait RedshiftMetadata extends js.Object {
    var RedshiftDatabase: js.UndefOr[RedshiftDatabase]
    var DatabaseUserName: js.UndefOr[RedshiftDatabaseUsername]
    var SelectSqlQuery: js.UndefOr[RedshiftSelectSqlQuery]
  }

  object RedshiftMetadata {
    def apply(
      RedshiftDatabase: js.UndefOr[RedshiftDatabase] = js.undefined,
      DatabaseUserName: js.UndefOr[RedshiftDatabaseUsername] = js.undefined,
      SelectSqlQuery: js.UndefOr[RedshiftSelectSqlQuery] = js.undefined): RedshiftMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RedshiftDatabase" -> RedshiftDatabase.map { x => x.asInstanceOf[js.Any] },
        "DatabaseUserName" -> DatabaseUserName.map { x => x.asInstanceOf[js.Any] },
        "SelectSqlQuery" -> SelectSqlQuery.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RedshiftMetadata]
    }
  }

  /**
   * <p>A specified resource cannot be located.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val message: ErrorMessage
    val code: ErrorCode
  }

  /**
   * <p> Describes the data specification of a <code>DataSource</code>.</p>
   */
  @js.native
  trait S3DataSpec extends js.Object {
    var DataLocationS3: js.UndefOr[S3Url]
    var DataRearrangement: js.UndefOr[DataRearrangement]
    var DataSchema: js.UndefOr[DataSchema]
    var DataSchemaLocationS3: js.UndefOr[S3Url]
  }

  object S3DataSpec {
    def apply(
      DataLocationS3: js.UndefOr[S3Url] = js.undefined,
      DataRearrangement: js.UndefOr[DataRearrangement] = js.undefined,
      DataSchema: js.UndefOr[DataSchema] = js.undefined,
      DataSchemaLocationS3: js.UndefOr[S3Url] = js.undefined): S3DataSpec = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataLocationS3" -> DataLocationS3.map { x => x.asInstanceOf[js.Any] },
        "DataRearrangement" -> DataRearrangement.map { x => x.asInstanceOf[js.Any] },
        "DataSchema" -> DataSchema.map { x => x.asInstanceOf[js.Any] },
        "DataSchemaLocationS3" -> DataSchemaLocationS3.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3DataSpec]
    }
  }

  /**
   * <p>The sort order specified in a listing condition. Possible values include the following:</p> <ul> <li> <code>asc</code> - Present the information in ascending order (from A-Z).</li> <li> <code>dsc</code> - Present the information in descending order (from Z-A).</li> </ul>
   */
  object SortOrderEnum {
    val asc = "asc"
    val dsc = "dsc"

    val values = IndexedSeq(asc, dsc)
  }

  /**
   * <p>A custom key-value pair associated with an ML object, such as an ML model.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagLimitExceededExceptionException extends js.Object {
    val message: ErrorMessage
  }

  object TaggableResourceTypeEnum {
    val BatchPrediction = "BatchPrediction"
    val DataSource = "DataSource"
    val Evaluation = "Evaluation"
    val MLModel = "MLModel"

    val values = IndexedSeq(BatchPrediction, DataSource, Evaluation, MLModel)
  }

  @js.native
  trait UpdateBatchPredictionInput extends js.Object {
    var BatchPredictionId: js.UndefOr[EntityId]
    var BatchPredictionName: js.UndefOr[EntityName]
  }

  object UpdateBatchPredictionInput {
    def apply(
      BatchPredictionId: js.UndefOr[EntityId] = js.undefined,
      BatchPredictionName: js.UndefOr[EntityName] = js.undefined): UpdateBatchPredictionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BatchPredictionId" -> BatchPredictionId.map { x => x.asInstanceOf[js.Any] },
        "BatchPredictionName" -> BatchPredictionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBatchPredictionInput]
    }
  }

  /**
   * <p>Represents the output of an <code>UpdateBatchPrediction</code> operation.</p> <p>You can see the updated content by using the <code>GetBatchPrediction</code> operation.</p>
   */
  @js.native
  trait UpdateBatchPredictionOutput extends js.Object {
    var BatchPredictionId: js.UndefOr[EntityId]
  }

  object UpdateBatchPredictionOutput {
    def apply(
      BatchPredictionId: js.UndefOr[EntityId] = js.undefined): UpdateBatchPredictionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BatchPredictionId" -> BatchPredictionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBatchPredictionOutput]
    }
  }

  @js.native
  trait UpdateDataSourceInput extends js.Object {
    var DataSourceId: js.UndefOr[EntityId]
    var DataSourceName: js.UndefOr[EntityName]
  }

  object UpdateDataSourceInput {
    def apply(
      DataSourceId: js.UndefOr[EntityId] = js.undefined,
      DataSourceName: js.UndefOr[EntityName] = js.undefined): UpdateDataSourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataSourceId" -> DataSourceId.map { x => x.asInstanceOf[js.Any] },
        "DataSourceName" -> DataSourceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDataSourceInput]
    }
  }

  /**
   * <p>Represents the output of an <code>UpdateDataSource</code> operation.</p> <p>You can see the updated content by using the <code>GetBatchPrediction</code> operation.</p>
   */
  @js.native
  trait UpdateDataSourceOutput extends js.Object {
    var DataSourceId: js.UndefOr[EntityId]
  }

  object UpdateDataSourceOutput {
    def apply(
      DataSourceId: js.UndefOr[EntityId] = js.undefined): UpdateDataSourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataSourceId" -> DataSourceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDataSourceOutput]
    }
  }

  @js.native
  trait UpdateEvaluationInput extends js.Object {
    var EvaluationId: js.UndefOr[EntityId]
    var EvaluationName: js.UndefOr[EntityName]
  }

  object UpdateEvaluationInput {
    def apply(
      EvaluationId: js.UndefOr[EntityId] = js.undefined,
      EvaluationName: js.UndefOr[EntityName] = js.undefined): UpdateEvaluationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EvaluationId" -> EvaluationId.map { x => x.asInstanceOf[js.Any] },
        "EvaluationName" -> EvaluationName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEvaluationInput]
    }
  }

  /**
   * <p>Represents the output of an <code>UpdateEvaluation</code> operation.</p> <p>You can see the updated content by using the <code>GetEvaluation</code> operation.</p>
   */
  @js.native
  trait UpdateEvaluationOutput extends js.Object {
    var EvaluationId: js.UndefOr[EntityId]
  }

  object UpdateEvaluationOutput {
    def apply(
      EvaluationId: js.UndefOr[EntityId] = js.undefined): UpdateEvaluationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EvaluationId" -> EvaluationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEvaluationOutput]
    }
  }

  @js.native
  trait UpdateMLModelInput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
    var MLModelName: js.UndefOr[EntityName]
    var ScoreThreshold: js.UndefOr[ScoreThreshold]
  }

  object UpdateMLModelInput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      MLModelName: js.UndefOr[EntityName] = js.undefined,
      ScoreThreshold: js.UndefOr[ScoreThreshold] = js.undefined): UpdateMLModelInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MLModelId" -> MLModelId.map { x => x.asInstanceOf[js.Any] },
        "MLModelName" -> MLModelName.map { x => x.asInstanceOf[js.Any] },
        "ScoreThreshold" -> ScoreThreshold.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMLModelInput]
    }
  }

  /**
   * <p>Represents the output of an <code>UpdateMLModel</code> operation.</p> <p>You can see the updated content by using the <code>GetMLModel</code> operation.</p>
   */
  @js.native
  trait UpdateMLModelOutput extends js.Object {
    var MLModelId: js.UndefOr[EntityId]
  }

  object UpdateMLModelOutput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined): UpdateMLModelOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MLModelId" -> MLModelId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMLModelOutput]
    }
  }
}
