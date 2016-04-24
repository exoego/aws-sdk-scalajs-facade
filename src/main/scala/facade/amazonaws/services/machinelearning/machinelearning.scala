package facade.amazonaws.services

import scalajs._
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
  type ErrorCode = Integer
  type ErrorMessage = String
  type EvaluationFilterVariable = String
  type Evaluations = js.Array[Evaluation]
  type IntegerType = Integer
  type Label = String
  type LongType = Long
  type MLModelFilterVariable = String
  type MLModelName = String
  type MLModelType = String
  type MLModels = js.Array[MLModel]
  type Message = String
  type PageLimit = Integer
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
  type TrainingParameters = js.Dictionary[StringType]
  type VariableName = String
  type VariableValue = String
  type Verbose = Boolean
  type VipURL = String
  type floatLabel = Float
}

package machinelearning {
  @js.native
  trait Machinelearning extends js.Object {
    def createBatchPrediction(params: CreateBatchPredictionInput, callback: Callback[CreateBatchPredictionOutput]): Unit = js.native
    def createBatchPrediction(params: CreateBatchPredictionInput): Request[CreateBatchPredictionOutput] = js.native
    def createDataSourceFromRDS(params: CreateDataSourceFromRDSInput, callback: Callback[CreateDataSourceFromRDSOutput]): Unit = js.native
    def createDataSourceFromRDS(params: CreateDataSourceFromRDSInput): Request[CreateDataSourceFromRDSOutput] = js.native
    def createDataSourceFromRedshift(params: CreateDataSourceFromRedshiftInput, callback: Callback[CreateDataSourceFromRedshiftOutput]): Unit = js.native
    def createDataSourceFromRedshift(params: CreateDataSourceFromRedshiftInput): Request[CreateDataSourceFromRedshiftOutput] = js.native
    def createDataSourceFromS3(params: CreateDataSourceFromS3Input, callback: Callback[CreateDataSourceFromS3Output]): Unit = js.native
    def createDataSourceFromS3(params: CreateDataSourceFromS3Input): Request[CreateDataSourceFromS3Output] = js.native
    def createEvaluation(params: CreateEvaluationInput, callback: Callback[CreateEvaluationOutput]): Unit = js.native
    def createEvaluation(params: CreateEvaluationInput): Request[CreateEvaluationOutput] = js.native
    def createMLModel(params: CreateMLModelInput, callback: Callback[CreateMLModelOutput]): Unit = js.native
    def createMLModel(params: CreateMLModelInput): Request[CreateMLModelOutput] = js.native
    def createRealtimeEndpoint(params: CreateRealtimeEndpointInput, callback: Callback[CreateRealtimeEndpointOutput]): Unit = js.native
    def createRealtimeEndpoint(params: CreateRealtimeEndpointInput): Request[CreateRealtimeEndpointOutput] = js.native
    def deleteBatchPrediction(params: DeleteBatchPredictionInput, callback: Callback[DeleteBatchPredictionOutput]): Unit = js.native
    def deleteBatchPrediction(params: DeleteBatchPredictionInput): Request[DeleteBatchPredictionOutput] = js.native
    def deleteDataSource(params: DeleteDataSourceInput, callback: Callback[DeleteDataSourceOutput]): Unit = js.native
    def deleteDataSource(params: DeleteDataSourceInput): Request[DeleteDataSourceOutput] = js.native
    def deleteEvaluation(params: DeleteEvaluationInput, callback: Callback[DeleteEvaluationOutput]): Unit = js.native
    def deleteEvaluation(params: DeleteEvaluationInput): Request[DeleteEvaluationOutput] = js.native
    def deleteMLModel(params: DeleteMLModelInput, callback: Callback[DeleteMLModelOutput]): Unit = js.native
    def deleteMLModel(params: DeleteMLModelInput): Request[DeleteMLModelOutput] = js.native
    def deleteRealtimeEndpoint(params: DeleteRealtimeEndpointInput, callback: Callback[DeleteRealtimeEndpointOutput]): Unit = js.native
    def deleteRealtimeEndpoint(params: DeleteRealtimeEndpointInput): Request[DeleteRealtimeEndpointOutput] = js.native
    def describeBatchPredictions(params: DescribeBatchPredictionsInput, callback: Callback[DescribeBatchPredictionsOutput]): Unit = js.native
    def describeBatchPredictions(params: DescribeBatchPredictionsInput): Request[DescribeBatchPredictionsOutput] = js.native
    def describeDataSources(params: DescribeDataSourcesInput, callback: Callback[DescribeDataSourcesOutput]): Unit = js.native
    def describeDataSources(params: DescribeDataSourcesInput): Request[DescribeDataSourcesOutput] = js.native
    def describeEvaluations(params: DescribeEvaluationsInput, callback: Callback[DescribeEvaluationsOutput]): Unit = js.native
    def describeEvaluations(params: DescribeEvaluationsInput): Request[DescribeEvaluationsOutput] = js.native
    def describeMLModels(params: DescribeMLModelsInput, callback: Callback[DescribeMLModelsOutput]): Unit = js.native
    def describeMLModels(params: DescribeMLModelsInput): Request[DescribeMLModelsOutput] = js.native
    def getBatchPrediction(params: GetBatchPredictionInput, callback: Callback[GetBatchPredictionOutput]): Unit = js.native
    def getBatchPrediction(params: GetBatchPredictionInput): Request[GetBatchPredictionOutput] = js.native
    def getDataSource(params: GetDataSourceInput, callback: Callback[GetDataSourceOutput]): Unit = js.native
    def getDataSource(params: GetDataSourceInput): Request[GetDataSourceOutput] = js.native
    def getEvaluation(params: GetEvaluationInput, callback: Callback[GetEvaluationOutput]): Unit = js.native
    def getEvaluation(params: GetEvaluationInput): Request[GetEvaluationOutput] = js.native
    def getMLModel(params: GetMLModelInput, callback: Callback[GetMLModelOutput]): Unit = js.native
    def getMLModel(params: GetMLModelInput): Request[GetMLModelOutput] = js.native
    def predict(params: PredictInput, callback: Callback[PredictOutput]): Unit = js.native
    def predict(params: PredictInput): Request[PredictOutput] = js.native
    def updateBatchPrediction(params: UpdateBatchPredictionInput, callback: Callback[UpdateBatchPredictionOutput]): Unit = js.native
    def updateBatchPrediction(params: UpdateBatchPredictionInput): Request[UpdateBatchPredictionOutput] = js.native
    def updateDataSource(params: UpdateDataSourceInput, callback: Callback[UpdateDataSourceOutput]): Unit = js.native
    def updateDataSource(params: UpdateDataSourceInput): Request[UpdateDataSourceOutput] = js.native
    def updateEvaluation(params: UpdateEvaluationInput, callback: Callback[UpdateEvaluationOutput]): Unit = js.native
    def updateEvaluation(params: UpdateEvaluationInput): Request[UpdateEvaluationOutput] = js.native
    def updateMLModel(params: UpdateMLModelInput, callback: Callback[UpdateMLModelOutput]): Unit = js.native
    def updateMLModel(params: UpdateMLModelInput): Request[UpdateMLModelOutput] = js.native
  }

  /**
   * <p>The function used to train a <code>MLModel</code>. Training choices supported by Amazon ML include the following:</p> <ul> <li>SGD - Stochastic Gradient Descent.</li> <li>RandomForest - Random forest of decision trees.</li> </ul>
   */
  object AlgorithmEnum {
    val sgd = "sgd"

    val values = IndexedSeq(sgd)
  }

  /**
   * <p> Represents the output of <a>GetBatchPrediction</a> operation.</p> <p> The content consists of the detailed metadata, the status, and the data file information of a <i>Batch Prediction</i>.</p>
   */
  @js.native
  trait BatchPrediction extends js.Object {
    var LastUpdatedAt: EpochTime
    var Name: EntityName
    var BatchPredictionDataSourceId: EntityId
    var BatchPredictionId: EntityId
    var CreatedByIamUser: AwsUserArn
    var InputDataLocationS3: S3Url
    var OutputUri: S3Url
    var Message: Message
    var CreatedAt: EpochTime
    var MLModelId: EntityId
    var Status: EntityStatus
  }

  object BatchPrediction {
    def apply(
      LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
      Name: js.UndefOr[EntityName] = js.undefined,
      BatchPredictionDataSourceId: js.UndefOr[EntityId] = js.undefined,
      BatchPredictionId: js.UndefOr[EntityId] = js.undefined,
      CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
      InputDataLocationS3: js.UndefOr[S3Url] = js.undefined,
      OutputUri: js.UndefOr[S3Url] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined,
      CreatedAt: js.UndefOr[EpochTime] = js.undefined,
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      Status: js.UndefOr[EntityStatus] = js.undefined
    ): BatchPrediction = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LastUpdatedAt" -> LastUpdatedAt.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("BatchPredictionDataSourceId" -> BatchPredictionDataSourceId.map { x => x: js.Any }),
        ("BatchPredictionId" -> BatchPredictionId.map { x => x: js.Any }),
        ("CreatedByIamUser" -> CreatedByIamUser.map { x => x: js.Any }),
        ("InputDataLocationS3" -> InputDataLocationS3.map { x => x: js.Any }),
        ("OutputUri" -> OutputUri.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("CreatedAt" -> CreatedAt.map { x => x: js.Any }),
        ("MLModelId" -> MLModelId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var BatchPredictionDataSourceId: EntityId
    var BatchPredictionId: EntityId
    var BatchPredictionName: EntityName
    var OutputUri: S3Url
    var MLModelId: EntityId
  }

  object CreateBatchPredictionInput {
    def apply(
      BatchPredictionDataSourceId: js.UndefOr[EntityId] = js.undefined,
      BatchPredictionId: js.UndefOr[EntityId] = js.undefined,
      BatchPredictionName: js.UndefOr[EntityName] = js.undefined,
      OutputUri: js.UndefOr[S3Url] = js.undefined,
      MLModelId: js.UndefOr[EntityId] = js.undefined
    ): CreateBatchPredictionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BatchPredictionDataSourceId" -> BatchPredictionDataSourceId.map { x => x: js.Any }),
        ("BatchPredictionId" -> BatchPredictionId.map { x => x: js.Any }),
        ("BatchPredictionName" -> BatchPredictionName.map { x => x: js.Any }),
        ("OutputUri" -> OutputUri.map { x => x: js.Any }),
        ("MLModelId" -> MLModelId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBatchPredictionInput]
    }
  }

  /**
   * <p> Represents the output of a <a>CreateBatchPrediction</a> operation, and is an acknowledgement that Amazon ML received the request.</p> <p>The <a>CreateBatchPrediction</a> operation is asynchronous. You can poll for status updates by using the <a>GetBatchPrediction</a> operation and checking the <code>Status</code> parameter of the result. </p>
   */
  @js.native
  trait CreateBatchPredictionOutput extends js.Object {
    var BatchPredictionId: EntityId
  }

  object CreateBatchPredictionOutput {
    def apply(
      BatchPredictionId: js.UndefOr[EntityId] = js.undefined
    ): CreateBatchPredictionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BatchPredictionId" -> BatchPredictionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBatchPredictionOutput]
    }
  }

  @js.native
  trait CreateDataSourceFromRDSInput extends js.Object {
    var ComputeStatistics: ComputeStatistics
    var RoleARN: RoleARN
    var RDSData: RDSDataSpec
    var DataSourceId: EntityId
    var DataSourceName: EntityName
  }

  object CreateDataSourceFromRDSInput {
    def apply(
      ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      RDSData: js.UndefOr[RDSDataSpec] = js.undefined,
      DataSourceId: js.UndefOr[EntityId] = js.undefined,
      DataSourceName: js.UndefOr[EntityName] = js.undefined
    ): CreateDataSourceFromRDSInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ComputeStatistics" -> ComputeStatistics.map { x => x: js.Any }),
        ("RoleARN" -> RoleARN.map { x => x: js.Any }),
        ("RDSData" -> RDSData.map { x => x: js.Any }),
        ("DataSourceId" -> DataSourceId.map { x => x: js.Any }),
        ("DataSourceName" -> DataSourceName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDataSourceFromRDSInput]
    }
  }

  /**
   * <p> Represents the output of a <a>CreateDataSourceFromRDS</a> operation, and is an acknowledgement that Amazon ML received the request.</p> <p>The <a>CreateDataSourceFromRDS</a> operation is asynchronous. You can poll for updates by using the <a>GetBatchPrediction</a> operation and checking the <code>Status</code> parameter. You can inspect the <code>Message</code> when <code>Status</code> shows up as <code>FAILED</code>. You can also check the progress of the copy operation by going to the <code>DataPipeline</code> console and looking up the pipeline using the pipelineId from the describe call.</p>
   */
  @js.native
  trait CreateDataSourceFromRDSOutput extends js.Object {
    var DataSourceId: EntityId
  }

  object CreateDataSourceFromRDSOutput {
    def apply(
      DataSourceId: js.UndefOr[EntityId] = js.undefined
    ): CreateDataSourceFromRDSOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DataSourceId" -> DataSourceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDataSourceFromRDSOutput]
    }
  }

  @js.native
  trait CreateDataSourceFromRedshiftInput extends js.Object {
    var ComputeStatistics: ComputeStatistics
    var DataSpec: RedshiftDataSpec
    var RoleARN: RoleARN
    var DataSourceId: EntityId
    var DataSourceName: EntityName
  }

  object CreateDataSourceFromRedshiftInput {
    def apply(
      ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined,
      DataSpec: js.UndefOr[RedshiftDataSpec] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      DataSourceId: js.UndefOr[EntityId] = js.undefined,
      DataSourceName: js.UndefOr[EntityName] = js.undefined
    ): CreateDataSourceFromRedshiftInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ComputeStatistics" -> ComputeStatistics.map { x => x: js.Any }),
        ("DataSpec" -> DataSpec.map { x => x: js.Any }),
        ("RoleARN" -> RoleARN.map { x => x: js.Any }),
        ("DataSourceId" -> DataSourceId.map { x => x: js.Any }),
        ("DataSourceName" -> DataSourceName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDataSourceFromRedshiftInput]
    }
  }

  /**
   * <p> Represents the output of a <a>CreateDataSourceFromRedshift</a> operation, and is an acknowledgement that Amazon ML received the request.</p> <p>The <a>CreateDataSourceFromRedshift</a> operation is asynchronous. You can poll for updates by using the <a>GetBatchPrediction</a> operation and checking the <code>Status</code> parameter. </p>
   */
  @js.native
  trait CreateDataSourceFromRedshiftOutput extends js.Object {
    var DataSourceId: EntityId
  }

  object CreateDataSourceFromRedshiftOutput {
    def apply(
      DataSourceId: js.UndefOr[EntityId] = js.undefined
    ): CreateDataSourceFromRedshiftOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DataSourceId" -> DataSourceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDataSourceFromRedshiftOutput]
    }
  }

  @js.native
  trait CreateDataSourceFromS3Input extends js.Object {
    var DataSourceId: EntityId
    var DataSourceName: EntityName
    var DataSpec: S3DataSpec
    var ComputeStatistics: ComputeStatistics
  }

  object CreateDataSourceFromS3Input {
    def apply(
      DataSourceId: js.UndefOr[EntityId] = js.undefined,
      DataSourceName: js.UndefOr[EntityName] = js.undefined,
      DataSpec: js.UndefOr[S3DataSpec] = js.undefined,
      ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined
    ): CreateDataSourceFromS3Input = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DataSourceId" -> DataSourceId.map { x => x: js.Any }),
        ("DataSourceName" -> DataSourceName.map { x => x: js.Any }),
        ("DataSpec" -> DataSpec.map { x => x: js.Any }),
        ("ComputeStatistics" -> ComputeStatistics.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDataSourceFromS3Input]
    }
  }

  /**
   * <p> Represents the output of a <a>CreateDataSourceFromS3</a> operation, and is an acknowledgement that Amazon ML received the request.</p> <p>The <a>CreateDataSourceFromS3</a> operation is asynchronous. You can poll for updates by using the <a>GetBatchPrediction</a> operation and checking the <code>Status</code> parameter. </p>
   */
  @js.native
  trait CreateDataSourceFromS3Output extends js.Object {
    var DataSourceId: EntityId
  }

  object CreateDataSourceFromS3Output {
    def apply(
      DataSourceId: js.UndefOr[EntityId] = js.undefined
    ): CreateDataSourceFromS3Output = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DataSourceId" -> DataSourceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDataSourceFromS3Output]
    }
  }

  @js.native
  trait CreateEvaluationInput extends js.Object {
    var EvaluationId: EntityId
    var EvaluationName: EntityName
    var MLModelId: EntityId
    var EvaluationDataSourceId: EntityId
  }

  object CreateEvaluationInput {
    def apply(
      EvaluationId: js.UndefOr[EntityId] = js.undefined,
      EvaluationName: js.UndefOr[EntityName] = js.undefined,
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      EvaluationDataSourceId: js.UndefOr[EntityId] = js.undefined
    ): CreateEvaluationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EvaluationId" -> EvaluationId.map { x => x: js.Any }),
        ("EvaluationName" -> EvaluationName.map { x => x: js.Any }),
        ("MLModelId" -> MLModelId.map { x => x: js.Any }),
        ("EvaluationDataSourceId" -> EvaluationDataSourceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEvaluationInput]
    }
  }

  /**
   * <p> Represents the output of a <a>CreateEvaluation</a> operation, and is an acknowledgement that Amazon ML received the request.</p> <p><a>CreateEvaluation</a> operation is asynchronous. You can poll for status updates by using the <a>GetEvaluation</a> operation and checking the <code>Status</code> parameter. </p>
   */
  @js.native
  trait CreateEvaluationOutput extends js.Object {
    var EvaluationId: EntityId
  }

  object CreateEvaluationOutput {
    def apply(
      EvaluationId: js.UndefOr[EntityId] = js.undefined
    ): CreateEvaluationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EvaluationId" -> EvaluationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEvaluationOutput]
    }
  }

  @js.native
  trait CreateMLModelInput extends js.Object {
    var TrainingDataSourceId: EntityId
    var RecipeUri: S3Url
    var Parameters: TrainingParameters
    var MLModelName: EntityName
    var MLModelType: MLModelType
    var Recipe: Recipe
    var MLModelId: EntityId
  }

  object CreateMLModelInput {
    def apply(
      TrainingDataSourceId: js.UndefOr[EntityId] = js.undefined,
      RecipeUri: js.UndefOr[S3Url] = js.undefined,
      Parameters: js.UndefOr[TrainingParameters] = js.undefined,
      MLModelName: js.UndefOr[EntityName] = js.undefined,
      MLModelType: js.UndefOr[MLModelType] = js.undefined,
      Recipe: js.UndefOr[Recipe] = js.undefined,
      MLModelId: js.UndefOr[EntityId] = js.undefined
    ): CreateMLModelInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TrainingDataSourceId" -> TrainingDataSourceId.map { x => x: js.Any }),
        ("RecipeUri" -> RecipeUri.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("MLModelName" -> MLModelName.map { x => x: js.Any }),
        ("MLModelType" -> MLModelType.map { x => x: js.Any }),
        ("Recipe" -> Recipe.map { x => x: js.Any }),
        ("MLModelId" -> MLModelId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMLModelInput]
    }
  }

  /**
   * <p> Represents the output of a <a>CreateMLModel</a> operation, and is an acknowledgement that Amazon ML received the request.</p> <p>The <a>CreateMLModel</a> operation is asynchronous. You can poll for status updates by using the <a>GetMLModel</a> operation and checking the <code>Status</code> parameter. </p>
   */
  @js.native
  trait CreateMLModelOutput extends js.Object {
    var MLModelId: EntityId
  }

  object CreateMLModelOutput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined
    ): CreateMLModelOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MLModelId" -> MLModelId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMLModelOutput]
    }
  }

  @js.native
  trait CreateRealtimeEndpointInput extends js.Object {
    var MLModelId: EntityId
  }

  object CreateRealtimeEndpointInput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined
    ): CreateRealtimeEndpointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MLModelId" -> MLModelId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRealtimeEndpointInput]
    }
  }

  /**
   * <p>Represents the output of an <a>CreateRealtimeEndpoint</a> operation.</p> <p>The result contains the <code>MLModelId</code> and the endpoint information for the <code>MLModel</code>.</p> <note> <p>The endpoint information includes the URI of the <code>MLModel</code>; that is, the location to send online prediction requests for the specified <code>MLModel</code>.</p> </note>
   */
  @js.native
  trait CreateRealtimeEndpointOutput extends js.Object {
    var MLModelId: EntityId
    var RealtimeEndpointInfo: RealtimeEndpointInfo
  }

  object CreateRealtimeEndpointOutput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      RealtimeEndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.undefined
    ): CreateRealtimeEndpointOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MLModelId" -> MLModelId.map { x => x: js.Any }),
        ("RealtimeEndpointInfo" -> RealtimeEndpointInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRealtimeEndpointOutput]
    }
  }

  /**
   * <p> Represents the output of the <a>GetDataSource</a> operation. </p> <p> The content consists of the detailed metadata and data file information and the current status of the <code>DataSource</code>. </p>
   */
  @js.native
  trait DataSource extends js.Object {
    var RedshiftMetadata: RedshiftMetadata
    var LastUpdatedAt: EpochTime
    var Name: EntityName
    var RDSMetadata: RDSMetadata
    var ComputeStatistics: ComputeStatistics
    var DataSizeInBytes: LongType
    var NumberOfFiles: LongType
    var CreatedByIamUser: AwsUserArn
    var RoleARN: RoleARN
    var DataRearrangement: DataRearrangement
    var Message: Message
    var CreatedAt: EpochTime
    var DataSourceId: EntityId
    var DataLocationS3: S3Url
    var Status: EntityStatus
  }

  object DataSource {
    def apply(
      RedshiftMetadata: js.UndefOr[RedshiftMetadata] = js.undefined,
      LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
      Name: js.UndefOr[EntityName] = js.undefined,
      RDSMetadata: js.UndefOr[RDSMetadata] = js.undefined,
      ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined,
      DataSizeInBytes: js.UndefOr[LongType] = js.undefined,
      NumberOfFiles: js.UndefOr[LongType] = js.undefined,
      CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      DataRearrangement: js.UndefOr[DataRearrangement] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined,
      CreatedAt: js.UndefOr[EpochTime] = js.undefined,
      DataSourceId: js.UndefOr[EntityId] = js.undefined,
      DataLocationS3: js.UndefOr[S3Url] = js.undefined,
      Status: js.UndefOr[EntityStatus] = js.undefined
    ): DataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RedshiftMetadata" -> RedshiftMetadata.map { x => x: js.Any }),
        ("LastUpdatedAt" -> LastUpdatedAt.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("RDSMetadata" -> RDSMetadata.map { x => x: js.Any }),
        ("ComputeStatistics" -> ComputeStatistics.map { x => x: js.Any }),
        ("DataSizeInBytes" -> DataSizeInBytes.map { x => x: js.Any }),
        ("NumberOfFiles" -> NumberOfFiles.map { x => x: js.Any }),
        ("CreatedByIamUser" -> CreatedByIamUser.map { x => x: js.Any }),
        ("RoleARN" -> RoleARN.map { x => x: js.Any }),
        ("DataRearrangement" -> DataRearrangement.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("CreatedAt" -> CreatedAt.map { x => x: js.Any }),
        ("DataSourceId" -> DataSourceId.map { x => x: js.Any }),
        ("DataLocationS3" -> DataLocationS3.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var BatchPredictionId: EntityId
  }

  object DeleteBatchPredictionInput {
    def apply(
      BatchPredictionId: js.UndefOr[EntityId] = js.undefined
    ): DeleteBatchPredictionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BatchPredictionId" -> BatchPredictionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBatchPredictionInput]
    }
  }

  /**
   * <p> Represents the output of a <a>DeleteBatchPrediction</a> operation.</p> <p>You can use the <a>GetBatchPrediction</a> operation and check the value of the <code>Status</code> parameter to see whether a <code>BatchPrediction</code> is marked as <code>DELETED</code>.</p>
   */
  @js.native
  trait DeleteBatchPredictionOutput extends js.Object {
    var BatchPredictionId: EntityId
  }

  object DeleteBatchPredictionOutput {
    def apply(
      BatchPredictionId: js.UndefOr[EntityId] = js.undefined
    ): DeleteBatchPredictionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BatchPredictionId" -> BatchPredictionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBatchPredictionOutput]
    }
  }

  @js.native
  trait DeleteDataSourceInput extends js.Object {
    var DataSourceId: EntityId
  }

  object DeleteDataSourceInput {
    def apply(
      DataSourceId: js.UndefOr[EntityId] = js.undefined
    ): DeleteDataSourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DataSourceId" -> DataSourceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDataSourceInput]
    }
  }

  /**
   * <p> Represents the output of a <a>DeleteDataSource</a> operation.</p>
   */
  @js.native
  trait DeleteDataSourceOutput extends js.Object {
    var DataSourceId: EntityId
  }

  object DeleteDataSourceOutput {
    def apply(
      DataSourceId: js.UndefOr[EntityId] = js.undefined
    ): DeleteDataSourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DataSourceId" -> DataSourceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDataSourceOutput]
    }
  }

  @js.native
  trait DeleteEvaluationInput extends js.Object {
    var EvaluationId: EntityId
  }

  object DeleteEvaluationInput {
    def apply(
      EvaluationId: js.UndefOr[EntityId] = js.undefined
    ): DeleteEvaluationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EvaluationId" -> EvaluationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEvaluationInput]
    }
  }

  /**
   * <p> Represents the output of a <a>DeleteEvaluation</a> operation. The output indicates that Amazon Machine Learning (Amazon ML) received the request.</p> <p>You can use the <a>GetEvaluation</a> operation and check the value of the <code>Status</code> parameter to see whether an <code>Evaluation</code> is marked as <code>DELETED</code>.</p>
   */
  @js.native
  trait DeleteEvaluationOutput extends js.Object {
    var EvaluationId: EntityId
  }

  object DeleteEvaluationOutput {
    def apply(
      EvaluationId: js.UndefOr[EntityId] = js.undefined
    ): DeleteEvaluationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EvaluationId" -> EvaluationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEvaluationOutput]
    }
  }

  @js.native
  trait DeleteMLModelInput extends js.Object {
    var MLModelId: EntityId
  }

  object DeleteMLModelInput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined
    ): DeleteMLModelInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MLModelId" -> MLModelId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMLModelInput]
    }
  }

  /**
   * <p>Represents the output of a <a>DeleteMLModel</a> operation.</p> <p>You can use the <a>GetMLModel</a> operation and check the value of the <code>Status</code> parameter to see whether an <code>MLModel</code> is marked as <code>DELETED</code>.</p>
   */
  @js.native
  trait DeleteMLModelOutput extends js.Object {
    var MLModelId: EntityId
  }

  object DeleteMLModelOutput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined
    ): DeleteMLModelOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MLModelId" -> MLModelId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMLModelOutput]
    }
  }

  @js.native
  trait DeleteRealtimeEndpointInput extends js.Object {
    var MLModelId: EntityId
  }

  object DeleteRealtimeEndpointInput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined
    ): DeleteRealtimeEndpointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MLModelId" -> MLModelId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRealtimeEndpointInput]
    }
  }

  /**
   * <p>Represents the output of an <a>DeleteRealtimeEndpoint</a> operation.</p> <p>The result contains the <code>MLModelId</code> and the endpoint information for the <code>MLModel</code>. </p>
   */
  @js.native
  trait DeleteRealtimeEndpointOutput extends js.Object {
    var MLModelId: EntityId
    var RealtimeEndpointInfo: RealtimeEndpointInfo
  }

  object DeleteRealtimeEndpointOutput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      RealtimeEndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.undefined
    ): DeleteRealtimeEndpointOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MLModelId" -> MLModelId.map { x => x: js.Any }),
        ("RealtimeEndpointInfo" -> RealtimeEndpointInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRealtimeEndpointOutput]
    }
  }

  @js.native
  trait DescribeBatchPredictionsInput extends js.Object {
    var FilterVariable: BatchPredictionFilterVariable
    var Limit: PageLimit
    var GT: ComparatorValue
    var NE: ComparatorValue
    var LT: ComparatorValue
    var SortOrder: SortOrder
    var EQ: ComparatorValue
    var LE: ComparatorValue
    var Prefix: ComparatorValue
    var NextToken: StringType
    var GE: ComparatorValue
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
      GE: js.UndefOr[ComparatorValue] = js.undefined
    ): DescribeBatchPredictionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FilterVariable" -> FilterVariable.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any }),
        ("GT" -> GT.map { x => x: js.Any }),
        ("NE" -> NE.map { x => x: js.Any }),
        ("LT" -> LT.map { x => x: js.Any }),
        ("SortOrder" -> SortOrder.map { x => x: js.Any }),
        ("EQ" -> EQ.map { x => x: js.Any }),
        ("LE" -> LE.map { x => x: js.Any }),
        ("Prefix" -> Prefix.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("GE" -> GE.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBatchPredictionsInput]
    }
  }

  /**
   * <p>Represents the output of a <a>DescribeBatchPredictions</a> operation. The content is essentially a list of <code>BatchPrediction</code>s.</p>
   */
  @js.native
  trait DescribeBatchPredictionsOutput extends js.Object {
    var Results: BatchPredictions
    var NextToken: StringType
  }

  object DescribeBatchPredictionsOutput {
    def apply(
      Results: js.UndefOr[BatchPredictions] = js.undefined,
      NextToken: js.UndefOr[StringType] = js.undefined
    ): DescribeBatchPredictionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Results" -> Results.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBatchPredictionsOutput]
    }
  }

  @js.native
  trait DescribeDataSourcesInput extends js.Object {
    var FilterVariable: DataSourceFilterVariable
    var Limit: PageLimit
    var GT: ComparatorValue
    var NE: ComparatorValue
    var LT: ComparatorValue
    var SortOrder: SortOrder
    var EQ: ComparatorValue
    var LE: ComparatorValue
    var Prefix: ComparatorValue
    var NextToken: StringType
    var GE: ComparatorValue
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
      GE: js.UndefOr[ComparatorValue] = js.undefined
    ): DescribeDataSourcesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FilterVariable" -> FilterVariable.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any }),
        ("GT" -> GT.map { x => x: js.Any }),
        ("NE" -> NE.map { x => x: js.Any }),
        ("LT" -> LT.map { x => x: js.Any }),
        ("SortOrder" -> SortOrder.map { x => x: js.Any }),
        ("EQ" -> EQ.map { x => x: js.Any }),
        ("LE" -> LE.map { x => x: js.Any }),
        ("Prefix" -> Prefix.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("GE" -> GE.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDataSourcesInput]
    }
  }

  /**
   * <p>Represents the query results from a <a>DescribeDataSources</a> operation. The content is essentially a list of <code>DataSource</code>.</p>
   */
  @js.native
  trait DescribeDataSourcesOutput extends js.Object {
    var Results: DataSources
    var NextToken: StringType
  }

  object DescribeDataSourcesOutput {
    def apply(
      Results: js.UndefOr[DataSources] = js.undefined,
      NextToken: js.UndefOr[StringType] = js.undefined
    ): DescribeDataSourcesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Results" -> Results.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDataSourcesOutput]
    }
  }

  @js.native
  trait DescribeEvaluationsInput extends js.Object {
    var FilterVariable: EvaluationFilterVariable
    var Limit: PageLimit
    var GT: ComparatorValue
    var NE: ComparatorValue
    var LT: ComparatorValue
    var SortOrder: SortOrder
    var EQ: ComparatorValue
    var LE: ComparatorValue
    var Prefix: ComparatorValue
    var NextToken: StringType
    var GE: ComparatorValue
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
      GE: js.UndefOr[ComparatorValue] = js.undefined
    ): DescribeEvaluationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FilterVariable" -> FilterVariable.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any }),
        ("GT" -> GT.map { x => x: js.Any }),
        ("NE" -> NE.map { x => x: js.Any }),
        ("LT" -> LT.map { x => x: js.Any }),
        ("SortOrder" -> SortOrder.map { x => x: js.Any }),
        ("EQ" -> EQ.map { x => x: js.Any }),
        ("LE" -> LE.map { x => x: js.Any }),
        ("Prefix" -> Prefix.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("GE" -> GE.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEvaluationsInput]
    }
  }

  /**
   * <p>Represents the query results from a <a>DescribeEvaluations</a> operation. The content is essentially a list of <code>Evaluation</code>.</p>
   */
  @js.native
  trait DescribeEvaluationsOutput extends js.Object {
    var Results: Evaluations
    var NextToken: StringType
  }

  object DescribeEvaluationsOutput {
    def apply(
      Results: js.UndefOr[Evaluations] = js.undefined,
      NextToken: js.UndefOr[StringType] = js.undefined
    ): DescribeEvaluationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Results" -> Results.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEvaluationsOutput]
    }
  }

  @js.native
  trait DescribeMLModelsInput extends js.Object {
    var FilterVariable: MLModelFilterVariable
    var Limit: PageLimit
    var GT: ComparatorValue
    var NE: ComparatorValue
    var LT: ComparatorValue
    var SortOrder: SortOrder
    var EQ: ComparatorValue
    var LE: ComparatorValue
    var Prefix: ComparatorValue
    var NextToken: StringType
    var GE: ComparatorValue
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
      GE: js.UndefOr[ComparatorValue] = js.undefined
    ): DescribeMLModelsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FilterVariable" -> FilterVariable.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any }),
        ("GT" -> GT.map { x => x: js.Any }),
        ("NE" -> NE.map { x => x: js.Any }),
        ("LT" -> LT.map { x => x: js.Any }),
        ("SortOrder" -> SortOrder.map { x => x: js.Any }),
        ("EQ" -> EQ.map { x => x: js.Any }),
        ("LE" -> LE.map { x => x: js.Any }),
        ("Prefix" -> Prefix.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("GE" -> GE.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMLModelsInput]
    }
  }

  /**
   * <p>Represents the output of a <a>DescribeMLModels</a> operation. The content is essentially a list of <code>MLModel</code>.</p>
   */
  @js.native
  trait DescribeMLModelsOutput extends js.Object {
    var Results: MLModels
    var NextToken: StringType
  }

  object DescribeMLModelsOutput {
    def apply(
      Results: js.UndefOr[MLModels] = js.undefined,
      NextToken: js.UndefOr[StringType] = js.undefined
    ): DescribeMLModelsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Results" -> Results.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMLModelsOutput]
    }
  }

  /**
   * Contains the key values of <code>DetailsMap</code>: PredictiveModelType - Indicates the type of the <code>MLModel</code>. Algorithm - Indicates the algorithm was used for the <code>MLModel</code>.
   */
  object DetailsAttributesEnum {
    val PredictiveModelType = "PredictiveModelType"
    val Algorithm = "Algorithm"

    val values = IndexedSeq(PredictiveModelType, Algorithm)
  }

  /**
   * <p>Entity status with the following possible values:</p> <ul> <li>PENDING</li> <li>INPROGRESS</li> <li>FAILED</li> <li>COMPLETED</li> <li>DELETED</li> </ul>
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
   * <p> Represents the output of <a>GetEvaluation</a> operation. </p> <p>The content consists of the detailed metadata and data file information and the current status of the <code>Evaluation</code>.</p>
   */
  @js.native
  trait Evaluation extends js.Object {
    var LastUpdatedAt: EpochTime
    var Name: EntityName
    var PerformanceMetrics: PerformanceMetrics
    var CreatedByIamUser: AwsUserArn
    var EvaluationId: EntityId
    var InputDataLocationS3: S3Url
    var Message: Message
    var CreatedAt: EpochTime
    var MLModelId: EntityId
    var EvaluationDataSourceId: EntityId
    var Status: EntityStatus
  }

  object Evaluation {
    def apply(
      LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
      Name: js.UndefOr[EntityName] = js.undefined,
      PerformanceMetrics: js.UndefOr[PerformanceMetrics] = js.undefined,
      CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
      EvaluationId: js.UndefOr[EntityId] = js.undefined,
      InputDataLocationS3: js.UndefOr[S3Url] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined,
      CreatedAt: js.UndefOr[EpochTime] = js.undefined,
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      EvaluationDataSourceId: js.UndefOr[EntityId] = js.undefined,
      Status: js.UndefOr[EntityStatus] = js.undefined
    ): Evaluation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LastUpdatedAt" -> LastUpdatedAt.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("PerformanceMetrics" -> PerformanceMetrics.map { x => x: js.Any }),
        ("CreatedByIamUser" -> CreatedByIamUser.map { x => x: js.Any }),
        ("EvaluationId" -> EvaluationId.map { x => x: js.Any }),
        ("InputDataLocationS3" -> InputDataLocationS3.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("CreatedAt" -> CreatedAt.map { x => x: js.Any }),
        ("MLModelId" -> MLModelId.map { x => x: js.Any }),
        ("EvaluationDataSourceId" -> EvaluationDataSourceId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var BatchPredictionId: EntityId
  }

  object GetBatchPredictionInput {
    def apply(
      BatchPredictionId: js.UndefOr[EntityId] = js.undefined
    ): GetBatchPredictionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BatchPredictionId" -> BatchPredictionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBatchPredictionInput]
    }
  }

  /**
   * <p>Represents the output of a <a>GetBatchPrediction</a> operation and describes a <code>BatchPrediction</code>.</p>
   */
  @js.native
  trait GetBatchPredictionOutput extends js.Object {
    var LogUri: PresignedS3Url
    var LastUpdatedAt: EpochTime
    var Name: EntityName
    var BatchPredictionDataSourceId: EntityId
    var BatchPredictionId: EntityId
    var CreatedByIamUser: AwsUserArn
    var InputDataLocationS3: S3Url
    var OutputUri: S3Url
    var Message: Message
    var CreatedAt: EpochTime
    var MLModelId: EntityId
    var Status: EntityStatus
  }

  object GetBatchPredictionOutput {
    def apply(
      LogUri: js.UndefOr[PresignedS3Url] = js.undefined,
      LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
      Name: js.UndefOr[EntityName] = js.undefined,
      BatchPredictionDataSourceId: js.UndefOr[EntityId] = js.undefined,
      BatchPredictionId: js.UndefOr[EntityId] = js.undefined,
      CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
      InputDataLocationS3: js.UndefOr[S3Url] = js.undefined,
      OutputUri: js.UndefOr[S3Url] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined,
      CreatedAt: js.UndefOr[EpochTime] = js.undefined,
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      Status: js.UndefOr[EntityStatus] = js.undefined
    ): GetBatchPredictionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LogUri" -> LogUri.map { x => x: js.Any }),
        ("LastUpdatedAt" -> LastUpdatedAt.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("BatchPredictionDataSourceId" -> BatchPredictionDataSourceId.map { x => x: js.Any }),
        ("BatchPredictionId" -> BatchPredictionId.map { x => x: js.Any }),
        ("CreatedByIamUser" -> CreatedByIamUser.map { x => x: js.Any }),
        ("InputDataLocationS3" -> InputDataLocationS3.map { x => x: js.Any }),
        ("OutputUri" -> OutputUri.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("CreatedAt" -> CreatedAt.map { x => x: js.Any }),
        ("MLModelId" -> MLModelId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBatchPredictionOutput]
    }
  }

  @js.native
  trait GetDataSourceInput extends js.Object {
    var DataSourceId: EntityId
    var Verbose: Verbose
  }

  object GetDataSourceInput {
    def apply(
      DataSourceId: js.UndefOr[EntityId] = js.undefined,
      Verbose: js.UndefOr[Verbose] = js.undefined
    ): GetDataSourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DataSourceId" -> DataSourceId.map { x => x: js.Any }),
        ("Verbose" -> Verbose.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDataSourceInput]
    }
  }

  /**
   * <p>Represents the output of a <a>GetDataSource</a> operation and describes a <code>DataSource</code>.</p>
   */
  @js.native
  trait GetDataSourceOutput extends js.Object {
    var LogUri: PresignedS3Url
    var RedshiftMetadata: RedshiftMetadata
    var LastUpdatedAt: EpochTime
    var Name: EntityName
    var RDSMetadata: RDSMetadata
    var ComputeStatistics: ComputeStatistics
    var DataSizeInBytes: LongType
    var NumberOfFiles: LongType
    var CreatedByIamUser: AwsUserArn
    var RoleARN: RoleARN
    var DataRearrangement: DataRearrangement
    var Message: Message
    var CreatedAt: EpochTime
    var DataSourceId: EntityId
    var DataSourceSchema: DataSchema
    var DataLocationS3: S3Url
    var Status: EntityStatus
  }

  object GetDataSourceOutput {
    def apply(
      LogUri: js.UndefOr[PresignedS3Url] = js.undefined,
      RedshiftMetadata: js.UndefOr[RedshiftMetadata] = js.undefined,
      LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
      Name: js.UndefOr[EntityName] = js.undefined,
      RDSMetadata: js.UndefOr[RDSMetadata] = js.undefined,
      ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined,
      DataSizeInBytes: js.UndefOr[LongType] = js.undefined,
      NumberOfFiles: js.UndefOr[LongType] = js.undefined,
      CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      DataRearrangement: js.UndefOr[DataRearrangement] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined,
      CreatedAt: js.UndefOr[EpochTime] = js.undefined,
      DataSourceId: js.UndefOr[EntityId] = js.undefined,
      DataSourceSchema: js.UndefOr[DataSchema] = js.undefined,
      DataLocationS3: js.UndefOr[S3Url] = js.undefined,
      Status: js.UndefOr[EntityStatus] = js.undefined
    ): GetDataSourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LogUri" -> LogUri.map { x => x: js.Any }),
        ("RedshiftMetadata" -> RedshiftMetadata.map { x => x: js.Any }),
        ("LastUpdatedAt" -> LastUpdatedAt.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("RDSMetadata" -> RDSMetadata.map { x => x: js.Any }),
        ("ComputeStatistics" -> ComputeStatistics.map { x => x: js.Any }),
        ("DataSizeInBytes" -> DataSizeInBytes.map { x => x: js.Any }),
        ("NumberOfFiles" -> NumberOfFiles.map { x => x: js.Any }),
        ("CreatedByIamUser" -> CreatedByIamUser.map { x => x: js.Any }),
        ("RoleARN" -> RoleARN.map { x => x: js.Any }),
        ("DataRearrangement" -> DataRearrangement.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("CreatedAt" -> CreatedAt.map { x => x: js.Any }),
        ("DataSourceId" -> DataSourceId.map { x => x: js.Any }),
        ("DataSourceSchema" -> DataSourceSchema.map { x => x: js.Any }),
        ("DataLocationS3" -> DataLocationS3.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDataSourceOutput]
    }
  }

  @js.native
  trait GetEvaluationInput extends js.Object {
    var EvaluationId: EntityId
  }

  object GetEvaluationInput {
    def apply(
      EvaluationId: js.UndefOr[EntityId] = js.undefined
    ): GetEvaluationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EvaluationId" -> EvaluationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEvaluationInput]
    }
  }

  /**
   * <p>Represents the output of a <a>GetEvaluation</a> operation and describes an <code>Evaluation</code>.</p>
   */
  @js.native
  trait GetEvaluationOutput extends js.Object {
    var LogUri: PresignedS3Url
    var LastUpdatedAt: EpochTime
    var Name: EntityName
    var PerformanceMetrics: PerformanceMetrics
    var CreatedByIamUser: AwsUserArn
    var EvaluationId: EntityId
    var InputDataLocationS3: S3Url
    var Message: Message
    var CreatedAt: EpochTime
    var MLModelId: EntityId
    var EvaluationDataSourceId: EntityId
    var Status: EntityStatus
  }

  object GetEvaluationOutput {
    def apply(
      LogUri: js.UndefOr[PresignedS3Url] = js.undefined,
      LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
      Name: js.UndefOr[EntityName] = js.undefined,
      PerformanceMetrics: js.UndefOr[PerformanceMetrics] = js.undefined,
      CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined,
      EvaluationId: js.UndefOr[EntityId] = js.undefined,
      InputDataLocationS3: js.UndefOr[S3Url] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined,
      CreatedAt: js.UndefOr[EpochTime] = js.undefined,
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      EvaluationDataSourceId: js.UndefOr[EntityId] = js.undefined,
      Status: js.UndefOr[EntityStatus] = js.undefined
    ): GetEvaluationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LogUri" -> LogUri.map { x => x: js.Any }),
        ("LastUpdatedAt" -> LastUpdatedAt.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("PerformanceMetrics" -> PerformanceMetrics.map { x => x: js.Any }),
        ("CreatedByIamUser" -> CreatedByIamUser.map { x => x: js.Any }),
        ("EvaluationId" -> EvaluationId.map { x => x: js.Any }),
        ("InputDataLocationS3" -> InputDataLocationS3.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("CreatedAt" -> CreatedAt.map { x => x: js.Any }),
        ("MLModelId" -> MLModelId.map { x => x: js.Any }),
        ("EvaluationDataSourceId" -> EvaluationDataSourceId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEvaluationOutput]
    }
  }

  @js.native
  trait GetMLModelInput extends js.Object {
    var MLModelId: EntityId
    var Verbose: Verbose
  }

  object GetMLModelInput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      Verbose: js.UndefOr[Verbose] = js.undefined
    ): GetMLModelInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MLModelId" -> MLModelId.map { x => x: js.Any }),
        ("Verbose" -> Verbose.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMLModelInput]
    }
  }

  /**
   * <p>Represents the output of a <a>GetMLModel</a> operation, and provides detailed information about a <code>MLModel</code>.</p>
   */
  @js.native
  trait GetMLModelOutput extends js.Object {
    var LogUri: PresignedS3Url
    var LastUpdatedAt: EpochTime
    var EndpointInfo: RealtimeEndpointInfo
    var Name: MLModelName
    var TrainingDataSourceId: EntityId
    var TrainingParameters: TrainingParameters
    var CreatedByIamUser: AwsUserArn
    var InputDataLocationS3: S3Url
    var SizeInBytes: LongType
    var MLModelType: MLModelType
    var ScoreThreshold: ScoreThreshold
    var Recipe: Recipe
    var Message: Message
    var CreatedAt: EpochTime
    var Schema: DataSchema
    var ScoreThresholdLastUpdatedAt: EpochTime
    var MLModelId: EntityId
    var Status: EntityStatus
  }

  object GetMLModelOutput {
    def apply(
      LogUri: js.UndefOr[PresignedS3Url] = js.undefined,
      LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
      EndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.undefined,
      Name: js.UndefOr[MLModelName] = js.undefined,
      TrainingDataSourceId: js.UndefOr[EntityId] = js.undefined,
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
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      Status: js.UndefOr[EntityStatus] = js.undefined
    ): GetMLModelOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LogUri" -> LogUri.map { x => x: js.Any }),
        ("LastUpdatedAt" -> LastUpdatedAt.map { x => x: js.Any }),
        ("EndpointInfo" -> EndpointInfo.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("TrainingDataSourceId" -> TrainingDataSourceId.map { x => x: js.Any }),
        ("TrainingParameters" -> TrainingParameters.map { x => x: js.Any }),
        ("CreatedByIamUser" -> CreatedByIamUser.map { x => x: js.Any }),
        ("InputDataLocationS3" -> InputDataLocationS3.map { x => x: js.Any }),
        ("SizeInBytes" -> SizeInBytes.map { x => x: js.Any }),
        ("MLModelType" -> MLModelType.map { x => x: js.Any }),
        ("ScoreThreshold" -> ScoreThreshold.map { x => x: js.Any }),
        ("Recipe" -> Recipe.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("CreatedAt" -> CreatedAt.map { x => x: js.Any }),
        ("Schema" -> Schema.map { x => x: js.Any }),
        ("ScoreThresholdLastUpdatedAt" -> ScoreThresholdLastUpdatedAt.map { x => x: js.Any }),
        ("MLModelId" -> MLModelId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMLModelOutput]
    }
  }

  /**
   * <p>A second request to use or change an object was not allowed. This can result from retrying a request using a parameter that was not present in the original request.</p>
   */
  @js.native
  trait IdempotentParameterMismatchExceptionException extends js.Object {
    var message: ErrorMessage
    var code: ErrorCode
  }

  /**
   * <p>An error on the server occurred when trying to process a request.</p>
   */
  @js.native
  trait InternalServerExceptionException extends js.Object {
    var message: ErrorMessage
    var code: ErrorCode
  }

  /**
   * <p>An error on the client occurred. Typically, the cause is an invalid input value.</p>
   */
  @js.native
  trait InvalidInputExceptionException extends js.Object {
    var message: ErrorMessage
    var code: ErrorCode
  }

  /**
   * <p>The subscriber exceeded the maximum number of operations. This exception can occur when listing objects such as <code>DataSource</code>.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    var message: ErrorMessage
    var code: ErrorCode
  }

  /**
   * <p> Represents the output of a <a>GetMLModel</a> operation. </p> <p>The content consists of the detailed metadata and the current status of the <code>MLModel</code>.</p>
   */
  @js.native
  trait MLModel extends js.Object {
    var LastUpdatedAt: EpochTime
    var EndpointInfo: RealtimeEndpointInfo
    var Name: MLModelName
    var TrainingDataSourceId: EntityId
    var TrainingParameters: TrainingParameters
    var CreatedByIamUser: AwsUserArn
    var InputDataLocationS3: S3Url
    var SizeInBytes: LongType
    var MLModelType: MLModelType
    var ScoreThreshold: ScoreThreshold
    var Message: Message
    var CreatedAt: EpochTime
    var Algorithm: Algorithm
    var ScoreThresholdLastUpdatedAt: EpochTime
    var MLModelId: EntityId
    var Status: EntityStatus
  }

  object MLModel {
    def apply(
      LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined,
      EndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.undefined,
      Name: js.UndefOr[MLModelName] = js.undefined,
      TrainingDataSourceId: js.UndefOr[EntityId] = js.undefined,
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
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      Status: js.UndefOr[EntityStatus] = js.undefined
    ): MLModel = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LastUpdatedAt" -> LastUpdatedAt.map { x => x: js.Any }),
        ("EndpointInfo" -> EndpointInfo.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("TrainingDataSourceId" -> TrainingDataSourceId.map { x => x: js.Any }),
        ("TrainingParameters" -> TrainingParameters.map { x => x: js.Any }),
        ("CreatedByIamUser" -> CreatedByIamUser.map { x => x: js.Any }),
        ("InputDataLocationS3" -> InputDataLocationS3.map { x => x: js.Any }),
        ("SizeInBytes" -> SizeInBytes.map { x => x: js.Any }),
        ("MLModelType" -> MLModelType.map { x => x: js.Any }),
        ("ScoreThreshold" -> ScoreThreshold.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("CreatedAt" -> CreatedAt.map { x => x: js.Any }),
        ("Algorithm" -> Algorithm.map { x => x: js.Any }),
        ("ScoreThresholdLastUpdatedAt" -> ScoreThresholdLastUpdatedAt.map { x => x: js.Any }),
        ("MLModelId" -> MLModelId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var Properties: PerformanceMetricsProperties
  }

  object PerformanceMetrics {
    def apply(
      Properties: js.UndefOr[PerformanceMetricsProperties] = js.undefined
    ): PerformanceMetrics = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Properties" -> Properties.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PerformanceMetrics]
    }
  }

  @js.native
  trait PredictInput extends js.Object {
    var MLModelId: EntityId
    var Record: Record
    var PredictEndpoint: VipURL
  }

  object PredictInput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      Record: js.UndefOr[Record] = js.undefined,
      PredictEndpoint: js.UndefOr[VipURL] = js.undefined
    ): PredictInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MLModelId" -> MLModelId.map { x => x: js.Any }),
        ("Record" -> Record.map { x => x: js.Any }),
        ("PredictEndpoint" -> PredictEndpoint.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PredictInput]
    }
  }

  @js.native
  trait PredictOutput extends js.Object {
    var Prediction: Prediction
  }

  object PredictOutput {
    def apply(
      Prediction: js.UndefOr[Prediction] = js.undefined
    ): PredictOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Prediction" -> Prediction.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PredictOutput]
    }
  }

  /**
   * <p>The output from a <code>Predict</code> operation: </p> <ul> <li> <p> <code>Details</code> - Contains the following attributes: DetailsAttributes.PREDICTIVE_MODEL_TYPE - REGRESSION | BINARY | MULTICLASS DetailsAttributes.ALGORITHM - SGD </p> </li> <li> <p> <code>PredictedLabel</code> - Present for either a BINARY or MULTICLASS <code>MLModel</code> request. </p> </li> <li> <p> <code>PredictedScores</code> - Contains the raw classification score corresponding to each label. </p> </li> <li> <p> <code>PredictedValue</code> - Present for a REGRESSION <code>MLModel</code> request. </p> </li> </ul>
   */
  @js.native
  trait Prediction extends js.Object {
    var predictedLabel: Label
    var predictedValue: floatLabel
    var predictedScores: ScoreValuePerLabelMap
    var details: DetailsMap
  }

  object Prediction {
    def apply(
      predictedLabel: js.UndefOr[Label] = js.undefined,
      predictedValue: js.UndefOr[floatLabel] = js.undefined,
      predictedScores: js.UndefOr[ScoreValuePerLabelMap] = js.undefined,
      details: js.UndefOr[DetailsMap] = js.undefined
    ): Prediction = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("predictedLabel" -> predictedLabel.map { x => x: js.Any }),
        ("predictedValue" -> predictedValue.map { x => x: js.Any }),
        ("predictedScores" -> predictedScores.map { x => x: js.Any }),
        ("details" -> details.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Prediction]
    }
  }

  /**
   * <p>The exception is thrown when a predict request is made to an unmounted <code>MLModel</code>.</p>
   */
  @js.native
  trait PredictorNotMountedExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The data specification of an Amazon Relational Database Service (Amazon RDS) <code>DataSource</code>.</p>
   */
  @js.native
  trait RDSDataSpec extends js.Object {
    var DatabaseCredentials: RDSDatabaseCredentials
    var ResourceRole: EDPResourceRole
    var ServiceRole: EDPServiceRole
    var DataSchemaUri: S3Url
    var SelectSqlQuery: RDSSelectSqlQuery
    var SecurityGroupIds: EDPSecurityGroupIds
    var DatabaseInformation: RDSDatabase
    var S3StagingLocation: S3Url
    var DataRearrangement: DataRearrangement
    var DataSchema: DataSchema
    var SubnetId: EDPSubnetId
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
      SubnetId: js.UndefOr[EDPSubnetId] = js.undefined
    ): RDSDataSpec = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DatabaseCredentials" -> DatabaseCredentials.map { x => x: js.Any }),
        ("ResourceRole" -> ResourceRole.map { x => x: js.Any }),
        ("ServiceRole" -> ServiceRole.map { x => x: js.Any }),
        ("DataSchemaUri" -> DataSchemaUri.map { x => x: js.Any }),
        ("SelectSqlQuery" -> SelectSqlQuery.map { x => x: js.Any }),
        ("SecurityGroupIds" -> SecurityGroupIds.map { x => x: js.Any }),
        ("DatabaseInformation" -> DatabaseInformation.map { x => x: js.Any }),
        ("S3StagingLocation" -> S3StagingLocation.map { x => x: js.Any }),
        ("DataRearrangement" -> DataRearrangement.map { x => x: js.Any }),
        ("DataSchema" -> DataSchema.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RDSDataSpec]
    }
  }

  /**
   * <p>The database details of an Amazon RDS database.</p>
   */
  @js.native
  trait RDSDatabase extends js.Object {
    var InstanceIdentifier: RDSInstanceIdentifier
    var DatabaseName: RDSDatabaseName
  }

  object RDSDatabase {
    def apply(
      InstanceIdentifier: js.UndefOr[RDSInstanceIdentifier] = js.undefined,
      DatabaseName: js.UndefOr[RDSDatabaseName] = js.undefined
    ): RDSDatabase = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceIdentifier" -> InstanceIdentifier.map { x => x: js.Any }),
        ("DatabaseName" -> DatabaseName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RDSDatabase]
    }
  }

  /**
   * <p>The database credentials to connect to a database on an RDS DB instance.</p>
   */
  @js.native
  trait RDSDatabaseCredentials extends js.Object {
    var Username: RDSDatabaseUsername
    var Password: RDSDatabasePassword
  }

  object RDSDatabaseCredentials {
    def apply(
      Username: js.UndefOr[RDSDatabaseUsername] = js.undefined,
      Password: js.UndefOr[RDSDatabasePassword] = js.undefined
    ): RDSDatabaseCredentials = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Username" -> Username.map { x => x: js.Any }),
        ("Password" -> Password.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RDSDatabaseCredentials]
    }
  }

  /**
   * <p>The datasource details that are specific to Amazon RDS.</p>
   */
  @js.native
  trait RDSMetadata extends js.Object {
    var DatabaseUserName: RDSDatabaseUsername
    var ResourceRole: EDPResourceRole
    var ServiceRole: EDPServiceRole
    var Database: RDSDatabase
    var SelectSqlQuery: RDSSelectSqlQuery
    var DataPipelineId: EDPPipelineId
  }

  object RDSMetadata {
    def apply(
      DatabaseUserName: js.UndefOr[RDSDatabaseUsername] = js.undefined,
      ResourceRole: js.UndefOr[EDPResourceRole] = js.undefined,
      ServiceRole: js.UndefOr[EDPServiceRole] = js.undefined,
      Database: js.UndefOr[RDSDatabase] = js.undefined,
      SelectSqlQuery: js.UndefOr[RDSSelectSqlQuery] = js.undefined,
      DataPipelineId: js.UndefOr[EDPPipelineId] = js.undefined
    ): RDSMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DatabaseUserName" -> DatabaseUserName.map { x => x: js.Any }),
        ("ResourceRole" -> ResourceRole.map { x => x: js.Any }),
        ("ServiceRole" -> ServiceRole.map { x => x: js.Any }),
        ("Database" -> Database.map { x => x: js.Any }),
        ("SelectSqlQuery" -> SelectSqlQuery.map { x => x: js.Any }),
        ("DataPipelineId" -> DataPipelineId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RDSMetadata]
    }
  }

  /**
   * <p> Describes the real-time endpoint information for an <code>MLModel</code>.</p>
   */
  @js.native
  trait RealtimeEndpointInfo extends js.Object {
    var PeakRequestsPerSecond: IntegerType
    var CreatedAt: EpochTime
    var EndpointUrl: VipURL
    var EndpointStatus: RealtimeEndpointStatus
  }

  object RealtimeEndpointInfo {
    def apply(
      PeakRequestsPerSecond: js.UndefOr[IntegerType] = js.undefined,
      CreatedAt: js.UndefOr[EpochTime] = js.undefined,
      EndpointUrl: js.UndefOr[VipURL] = js.undefined,
      EndpointStatus: js.UndefOr[RealtimeEndpointStatus] = js.undefined
    ): RealtimeEndpointInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PeakRequestsPerSecond" -> PeakRequestsPerSecond.map { x => x: js.Any }),
        ("CreatedAt" -> CreatedAt.map { x => x: js.Any }),
        ("EndpointUrl" -> EndpointUrl.map { x => x: js.Any }),
        ("EndpointStatus" -> EndpointStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var DatabaseCredentials: RedshiftDatabaseCredentials
    var DataSchemaUri: S3Url
    var SelectSqlQuery: RedshiftSelectSqlQuery
    var DatabaseInformation: RedshiftDatabase
    var S3StagingLocation: S3Url
    var DataRearrangement: DataRearrangement
    var DataSchema: DataSchema
  }

  object RedshiftDataSpec {
    def apply(
      DatabaseCredentials: js.UndefOr[RedshiftDatabaseCredentials] = js.undefined,
      DataSchemaUri: js.UndefOr[S3Url] = js.undefined,
      SelectSqlQuery: js.UndefOr[RedshiftSelectSqlQuery] = js.undefined,
      DatabaseInformation: js.UndefOr[RedshiftDatabase] = js.undefined,
      S3StagingLocation: js.UndefOr[S3Url] = js.undefined,
      DataRearrangement: js.UndefOr[DataRearrangement] = js.undefined,
      DataSchema: js.UndefOr[DataSchema] = js.undefined
    ): RedshiftDataSpec = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DatabaseCredentials" -> DatabaseCredentials.map { x => x: js.Any }),
        ("DataSchemaUri" -> DataSchemaUri.map { x => x: js.Any }),
        ("SelectSqlQuery" -> SelectSqlQuery.map { x => x: js.Any }),
        ("DatabaseInformation" -> DatabaseInformation.map { x => x: js.Any }),
        ("S3StagingLocation" -> S3StagingLocation.map { x => x: js.Any }),
        ("DataRearrangement" -> DataRearrangement.map { x => x: js.Any }),
        ("DataSchema" -> DataSchema.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RedshiftDataSpec]
    }
  }

  /**
   * <p>Describes the database details required to connect to an Amazon Redshift database.</p>
   */
  @js.native
  trait RedshiftDatabase extends js.Object {
    var DatabaseName: RedshiftDatabaseName
    var ClusterIdentifier: RedshiftClusterIdentifier
  }

  object RedshiftDatabase {
    def apply(
      DatabaseName: js.UndefOr[RedshiftDatabaseName] = js.undefined,
      ClusterIdentifier: js.UndefOr[RedshiftClusterIdentifier] = js.undefined
    ): RedshiftDatabase = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DatabaseName" -> DatabaseName.map { x => x: js.Any }),
        ("ClusterIdentifier" -> ClusterIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RedshiftDatabase]
    }
  }

  /**
   * <p> Describes the database credentials for connecting to a database on an Amazon Redshift cluster.</p>
   */
  @js.native
  trait RedshiftDatabaseCredentials extends js.Object {
    var Username: RedshiftDatabaseUsername
    var Password: RedshiftDatabasePassword
  }

  object RedshiftDatabaseCredentials {
    def apply(
      Username: js.UndefOr[RedshiftDatabaseUsername] = js.undefined,
      Password: js.UndefOr[RedshiftDatabasePassword] = js.undefined
    ): RedshiftDatabaseCredentials = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Username" -> Username.map { x => x: js.Any }),
        ("Password" -> Password.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RedshiftDatabaseCredentials]
    }
  }

  /**
   * <p>Describes the <Code>DataSource</Code> details specific to Amazon Redshift.</p>
   */
  @js.native
  trait RedshiftMetadata extends js.Object {
    var RedshiftDatabase: RedshiftDatabase
    var DatabaseUserName: RedshiftDatabaseUsername
    var SelectSqlQuery: RedshiftSelectSqlQuery
  }

  object RedshiftMetadata {
    def apply(
      RedshiftDatabase: js.UndefOr[RedshiftDatabase] = js.undefined,
      DatabaseUserName: js.UndefOr[RedshiftDatabaseUsername] = js.undefined,
      SelectSqlQuery: js.UndefOr[RedshiftSelectSqlQuery] = js.undefined
    ): RedshiftMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RedshiftDatabase" -> RedshiftDatabase.map { x => x: js.Any }),
        ("DatabaseUserName" -> DatabaseUserName.map { x => x: js.Any }),
        ("SelectSqlQuery" -> SelectSqlQuery.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RedshiftMetadata]
    }
  }

  /**
   * <p>A specified resource cannot be located.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    var message: ErrorMessage
    var code: ErrorCode
  }

  /**
   * <p> Describes the data specification of a <code>DataSource</code>.</p>
   */
  @js.native
  trait S3DataSpec extends js.Object {
    var DataLocationS3: S3Url
    var DataRearrangement: DataRearrangement
    var DataSchema: DataSchema
    var DataSchemaLocationS3: S3Url
  }

  object S3DataSpec {
    def apply(
      DataLocationS3: js.UndefOr[S3Url] = js.undefined,
      DataRearrangement: js.UndefOr[DataRearrangement] = js.undefined,
      DataSchema: js.UndefOr[DataSchema] = js.undefined,
      DataSchemaLocationS3: js.UndefOr[S3Url] = js.undefined
    ): S3DataSpec = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DataLocationS3" -> DataLocationS3.map { x => x: js.Any }),
        ("DataRearrangement" -> DataRearrangement.map { x => x: js.Any }),
        ("DataSchema" -> DataSchema.map { x => x: js.Any }),
        ("DataSchemaLocationS3" -> DataSchemaLocationS3.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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

  @js.native
  trait UpdateBatchPredictionInput extends js.Object {
    var BatchPredictionId: EntityId
    var BatchPredictionName: EntityName
  }

  object UpdateBatchPredictionInput {
    def apply(
      BatchPredictionId: js.UndefOr[EntityId] = js.undefined,
      BatchPredictionName: js.UndefOr[EntityName] = js.undefined
    ): UpdateBatchPredictionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BatchPredictionId" -> BatchPredictionId.map { x => x: js.Any }),
        ("BatchPredictionName" -> BatchPredictionName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBatchPredictionInput]
    }
  }

  /**
   * <p>Represents the output of an <a>UpdateBatchPrediction</a> operation.</p> <p>You can see the updated content by using the <a>GetBatchPrediction</a> operation.</p>
   */
  @js.native
  trait UpdateBatchPredictionOutput extends js.Object {
    var BatchPredictionId: EntityId
  }

  object UpdateBatchPredictionOutput {
    def apply(
      BatchPredictionId: js.UndefOr[EntityId] = js.undefined
    ): UpdateBatchPredictionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BatchPredictionId" -> BatchPredictionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBatchPredictionOutput]
    }
  }

  @js.native
  trait UpdateDataSourceInput extends js.Object {
    var DataSourceId: EntityId
    var DataSourceName: EntityName
  }

  object UpdateDataSourceInput {
    def apply(
      DataSourceId: js.UndefOr[EntityId] = js.undefined,
      DataSourceName: js.UndefOr[EntityName] = js.undefined
    ): UpdateDataSourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DataSourceId" -> DataSourceId.map { x => x: js.Any }),
        ("DataSourceName" -> DataSourceName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDataSourceInput]
    }
  }

  /**
   * <p>Represents the output of an <a>UpdateDataSource</a> operation.</p> <p>You can see the updated content by using the <a>GetBatchPrediction</a> operation.</p>
   */
  @js.native
  trait UpdateDataSourceOutput extends js.Object {
    var DataSourceId: EntityId
  }

  object UpdateDataSourceOutput {
    def apply(
      DataSourceId: js.UndefOr[EntityId] = js.undefined
    ): UpdateDataSourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DataSourceId" -> DataSourceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDataSourceOutput]
    }
  }

  @js.native
  trait UpdateEvaluationInput extends js.Object {
    var EvaluationId: EntityId
    var EvaluationName: EntityName
  }

  object UpdateEvaluationInput {
    def apply(
      EvaluationId: js.UndefOr[EntityId] = js.undefined,
      EvaluationName: js.UndefOr[EntityName] = js.undefined
    ): UpdateEvaluationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EvaluationId" -> EvaluationId.map { x => x: js.Any }),
        ("EvaluationName" -> EvaluationName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEvaluationInput]
    }
  }

  /**
   * <p>Represents the output of an <a>UpdateEvaluation</a> operation.</p> <p>You can see the updated content by using the <a>GetEvaluation</a> operation.</p>
   */
  @js.native
  trait UpdateEvaluationOutput extends js.Object {
    var EvaluationId: EntityId
  }

  object UpdateEvaluationOutput {
    def apply(
      EvaluationId: js.UndefOr[EntityId] = js.undefined
    ): UpdateEvaluationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EvaluationId" -> EvaluationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEvaluationOutput]
    }
  }

  @js.native
  trait UpdateMLModelInput extends js.Object {
    var MLModelId: EntityId
    var MLModelName: EntityName
    var ScoreThreshold: ScoreThreshold
  }

  object UpdateMLModelInput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined,
      MLModelName: js.UndefOr[EntityName] = js.undefined,
      ScoreThreshold: js.UndefOr[ScoreThreshold] = js.undefined
    ): UpdateMLModelInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MLModelId" -> MLModelId.map { x => x: js.Any }),
        ("MLModelName" -> MLModelName.map { x => x: js.Any }),
        ("ScoreThreshold" -> ScoreThreshold.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMLModelInput]
    }
  }

  /**
   * <p>Represents the output of an <a>UpdateMLModel</a> operation.</p> <p>You can see the updated content by using the <a>GetMLModel</a> operation.</p>
   */
  @js.native
  trait UpdateMLModelOutput extends js.Object {
    var MLModelId: EntityId
  }

  object UpdateMLModelOutput {
    def apply(
      MLModelId: js.UndefOr[EntityId] = js.undefined
    ): UpdateMLModelOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MLModelId" -> MLModelId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMLModelOutput]
    }
  }
}
